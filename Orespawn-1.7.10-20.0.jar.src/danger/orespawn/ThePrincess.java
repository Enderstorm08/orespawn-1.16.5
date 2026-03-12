/*      */ package danger.orespawn;
/*      */ 
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityAgeable;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityList;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.ai.EntityAITempt;
/*      */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*      */ import net.minecraft.entity.passive.EntityTameable;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemFood;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.util.ChatComponentText;
/*      */ import net.minecraft.util.ChunkCoordinates;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.util.IChatComponent;
/*      */ import net.minecraft.util.MathHelper;
/*      */ import net.minecraft.util.Vec3;
/*      */ import net.minecraft.world.EnumDifficulty;
/*      */ import net.minecraft.world.World;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ThePrincess
/*      */   extends EntityTameable
/*      */ {
/*      */   private ChunkCoordinates currentFlightTarget;
/*   59 */   private GenericTargetSorter TargetSorter = null;
/*   60 */   public int activity = 1;
/*   61 */   private int owner_flying = 0;
/*   62 */   private float moveSpeed = 0.3F;
/*   63 */   private int syncit = 0;
/*   64 */   private int head1ext = 0;
/*   65 */   private int head2ext = 0;
/*   66 */   private int head3ext = 0;
/*   67 */   private int head1dir = 1;
/*   68 */   private int head2dir = 1;
/*   69 */   private int head3dir = 1;
/*   70 */   private int ok_to_grow = 0;
/*   71 */   private int kill_count = 0;
/*   72 */   private int fed_count = 0;
/*   73 */   private int day_count = 0;
/*   74 */   private int is_day = 0;
/*   75 */   private int attack_level = 1;
/*   76 */   private int ticker = 0;
/*      */ 
/*      */   
/*      */   public ThePrincess(World par1World) {
/*   80 */     super(par1World);
/*      */     
/*   82 */     func_70105_a(0.75F, 1.25F);
/*   83 */     this.moveSpeed = 0.32F;
/*   84 */     this.field_70174_ab = 1000;
/*   85 */     this.field_70178_ae = true;
/*   86 */     func_70661_as().func_75491_a(true);
/*   87 */     func_70904_g(false);
/*   88 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*   89 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 1.15F, 12.0F, 2.0F));
/*   90 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false));
/*   91 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 6.0F));
/*   92 */     this.field_70714_bg.func_75776_a(5, new MyEntityAIWander((EntityCreature)this, 0.75F));
/*   93 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*   94 */     this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*   95 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*   96 */     this.field_70728_aV = 50;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  101 */     super.func_110147_ax();
/*  102 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  103 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  104 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  105 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(10.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  110 */     super.func_70088_a();
/*  111 */     this.activity = 1;
/*  112 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(0));
/*  113 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(this.activity));
/*  114 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(1));
/*  115 */     this.field_70180_af.func_75682_a(23, Integer.valueOf(this.attack_level));
/*  116 */     func_70904_g(false);
/*  117 */     func_70903_f(false);
/*  118 */     this.field_70145_X = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getPower() {
/*  123 */     return this.field_70180_af.func_75679_c(23);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPower(int par1) {
/*  128 */     this.field_70180_af.func_75692_b(23, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/*  136 */     super.func_70014_b(par1NBTTagCompound);
/*  137 */     par1NBTTagCompound.func_74768_a("SpyroActivity", this.field_70180_af.func_75679_c(21));
/*  138 */     par1NBTTagCompound.func_74768_a("SpyroFire", this.field_70180_af.func_75679_c(20));
/*  139 */     par1NBTTagCompound.func_74768_a("SpyroGrow", this.ok_to_grow);
/*  140 */     par1NBTTagCompound.func_74768_a("SpyroKill", this.kill_count);
/*  141 */     par1NBTTagCompound.func_74768_a("SpyroFed", this.fed_count);
/*  142 */     par1NBTTagCompound.func_74768_a("SpyroDay", this.day_count);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/*  150 */     super.func_70037_a(par1NBTTagCompound);
/*  151 */     this.activity = par1NBTTagCompound.func_74762_e("SpyroActivity");
/*  152 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(this.activity));
/*  153 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1NBTTagCompound.func_74762_e("SpyroFire")));
/*  154 */     this.ok_to_grow = par1NBTTagCompound.func_74762_e("SpyroGrow");
/*  155 */     this.kill_count = par1NBTTagCompound.func_74762_e("SpyroKill");
/*  156 */     this.fed_count = par1NBTTagCompound.func_74762_e("SpyroFed");
/*  157 */     this.day_count = par1NBTTagCompound.func_74762_e("SpyroDay");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getActivity() {
/*  166 */     int i = this.field_70180_af.func_75679_c(21);
/*  167 */     this.activity = i;
/*  168 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/*  174 */     this.activity = par1;
/*  175 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(0));
/*  176 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getSpyroFire() {
/*  182 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSpyroFire(int par1) {
/*  188 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/*  194 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/*  200 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public int getHead1Ext() {
/*  205 */     return this.head1ext;
/*      */   }
/*      */   
/*      */   public int getHead2Ext() {
/*  209 */     return this.head2ext;
/*      */   }
/*      */   
/*      */   public int getHead3Ext() {
/*  213 */     return this.head3ext;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  223 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  229 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  234 */     return 400;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  243 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */ 
/*      */     
/*  246 */     if (var2 != null)
/*      */     {
/*  248 */       if (var2.field_77994_a <= 0) {
/*      */         
/*  250 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  251 */         var2 = null;
/*      */       } 
/*      */     }
/*      */     
/*  255 */     if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150484_ah) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*  256 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  258 */         func_70903_f(true);
/*  259 */         func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*  260 */         func_70908_e(true);
/*  261 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  262 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*  263 */         this.ok_to_grow = 1;
/*  264 */         this.kill_count = 1000;
/*  265 */         this.fed_count = 1000;
/*  266 */         this.day_count = 1000;
/*      */       } 
/*      */ 
/*      */       
/*  270 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*  271 */         var2.field_77994_a--;
/*  272 */         if (var2.field_77994_a <= 0) {
/*  273 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  276 */       return true;
/*      */     } 
/*      */     
/*  279 */     if (func_70909_n() && var2 != null && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && var2.func_77973_b() instanceof ItemFood) {
/*      */ 
/*      */ 
/*      */       
/*  283 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  285 */         ItemFood var3 = (ItemFood)var2.func_77973_b();
/*      */         
/*  287 */         if (mygetMaxHealth() > func_110143_aJ())
/*      */         {
/*  289 */           func_70691_i((var3.func_150905_g(var2) * 10));
/*      */         }
/*      */         
/*  292 */         func_70908_e(true);
/*  293 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  299 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  301 */         var2.field_77994_a--;
/*  302 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  304 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  307 */       return true;
/*  308 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150432_aD) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  311 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  313 */         func_70908_e(true);
/*  314 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*  315 */         setSpyroFire(0);
/*  316 */         String healthMessage = new String();
/*  317 */         healthMessage = String.format("Princess fireballs extinguished.", new Object[0]);
/*  318 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */       } 
/*      */       
/*  321 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  323 */         var2.field_77994_a--;
/*  324 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  326 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  329 */       return true;
/*  330 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151033_d && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  333 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  335 */         func_70908_e(true);
/*  336 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*  337 */         setSpyroFire(1);
/*  338 */         String healthMessage = new String();
/*  339 */         healthMessage = String.format("Princess fireballs lit!", new Object[0]);
/*  340 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */       } 
/*  342 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  344 */         var2.field_77994_a--;
/*  345 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  347 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  350 */       return true;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  378 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  380 */       func_94058_c(var2.func_82833_r());
/*  381 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  383 */         var2.field_77994_a--;
/*  384 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  386 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  389 */       return true;
/*      */     } 
/*      */     
/*  392 */     if (func_70909_n() && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  394 */       if (!func_70906_o()) {
/*  395 */         func_70904_g(true);
/*  396 */         setActivity(1);
/*      */       } else {
/*  398 */         func_70904_g(false);
/*      */       } 
/*  400 */       return true;
/*      */     } 
/*      */     
/*  403 */     return super.func_70085_c(par1EntityPlayer);
/*      */   }
/*      */ 
/*      */   
/*      */   public void set_ok_to_grow() {
/*  408 */     this.ok_to_grow = 1;
/*  409 */     this.kill_count = 0;
/*  410 */     this.fed_count = 0;
/*  411 */     this.day_count = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/*  419 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  427 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  435 */     if (func_70906_o())
/*      */     {
/*  437 */       return null;
/*      */     }
/*  439 */     if (getAttacking() == 0) {
/*  440 */       return null;
/*      */     }
/*  442 */     return "orespawn:roar";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  450 */     return "orespawn:duck_hurt";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  458 */     return "orespawn:cryo_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  466 */     return 0.6F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  474 */     return 14;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  482 */     return Items.field_151082_bd;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  490 */     int var3 = 0;
/*      */     
/*  492 */     var3 = this.field_70170_p.field_73012_v.nextInt(4);
/*  493 */     var3++;
/*  494 */     for (int var4 = 0; var4 < var3; var4++)
/*      */     {
/*  496 */       func_145779_a(Items.field_151082_bd, 1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70647_i() {
/*  506 */     return (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 0.2F + 1.5F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  514 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70069_a(float par1) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70064_a(double par1, boolean par3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_145773_az() {
/*  532 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  540 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/*  546 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public float getAttackStrength(Entity par1Entity) {
/*  551 */     return 9.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  558 */     float var2 = getAttackStrength(par1Entity);
/*  559 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), var2);
/*  560 */     if (par1Entity instanceof EntityLivingBase) {
/*  561 */       EntityLivingBase el = (EntityLivingBase)par1Entity;
/*  562 */       if (el.func_110143_aJ() <= 0.0F) {
/*  563 */         this.kill_count++;
/*      */       }
/*      */     } 
/*  566 */     return var4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  574 */     boolean ret = false;
/*      */     
/*  576 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  577 */       return false;
/*      */     }
/*  579 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*  580 */       ret = super.func_70097_a(par1DamageSource, par2);
/*  581 */       func_70904_g(false);
/*  582 */       setActivity(2);
/*      */     } 
/*  584 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  592 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  602 */     super.func_70071_h_();
/*  603 */     if (getActivity() == 2) {
/*  604 */       this.field_70145_X = true;
/*      */     } else {
/*  606 */       this.field_70145_X = false;
/*      */     } 
/*      */     
/*  609 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  610 */       int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  611 */       if (i == 0) this.head1dir = 2; 
/*  612 */       if (i == 1) this.head1dir = -2; 
/*  613 */       if (i == 2) this.head1dir = 0; 
/*      */     } 
/*  615 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  616 */       int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  617 */       if (i == 0) this.head2dir = 2; 
/*  618 */       if (i == 1) this.head2dir = -2; 
/*  619 */       if (i == 2) this.head2dir = 0; 
/*      */     } 
/*  621 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  622 */       int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  623 */       if (i == 0) this.head3dir = 2; 
/*  624 */       if (i == 1) this.head3dir = -2; 
/*  625 */       if (i == 2) this.head3dir = 0; 
/*      */     } 
/*  627 */     this.head1ext += this.head1dir;
/*  628 */     if (this.head1ext < 0) this.head1ext = 0; 
/*  629 */     if (this.head1ext > 60) this.head1ext = 60; 
/*  630 */     this.head2ext += this.head2dir;
/*  631 */     if (this.head2ext < 0) this.head2ext = 0; 
/*  632 */     if (this.head2ext > 60) this.head2ext = 60; 
/*  633 */     this.head3ext += this.head3dir;
/*  634 */     if (this.head3ext < 0) this.head3ext = 0; 
/*  635 */     if (this.head3ext > 60) this.head3ext = 60;
/*      */     
/*  637 */     if (this.field_70170_p.field_72995_K && getPower() > 400) {
/*  638 */       float f = 0.25F;
/*      */       
/*  640 */       if (this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*  641 */         for (int i = 0; i < 2; i++) {
/*  642 */           this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + 0.4D, this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)), (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 7.0D + this.field_70159_w * 3.0D, (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 7.0D, (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 7.0D + this.field_70179_y * 3.0D);
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  661 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  662 */     super.func_70636_d();
/*      */     
/*  664 */     if (func_70090_H()) {
/*  665 */       this.field_70181_x += 0.07D;
/*      */     }
/*      */ 
/*      */     
/*  669 */     if (this.currentFlightTarget == null) {
/*  670 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     }
/*      */ 
/*      */     
/*  674 */     this.syncit++;
/*  675 */     if (this.syncit > 20) {
/*  676 */       this.syncit = 0;
/*  677 */       if (this.field_70170_p.field_72995_K) {
/*  678 */         getActivity();
/*      */       } else {
/*  680 */         int j = this.activity;
/*  681 */         setActivity(j);
/*      */       } 
/*      */     } 
/*      */     
/*  685 */     if (this.activity == 2) {
/*  686 */       this.field_70181_x *= 0.6D;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70619_bc() {
/*  696 */     double xzoff = 1.5D;
/*  697 */     double yoff = 1.0D;
/*  698 */     EntityLiving newent = null;
/*      */     
/*  700 */     if (this.field_70128_L)
/*      */       return; 
/*  702 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null);
/*      */     
/*  704 */     if (this.activity != 2) {
/*  705 */       super.func_70619_bc();
/*      */     }
/*  707 */     this.ticker++;
/*  708 */     if (this.ticker % 10 == 0) {
/*  709 */       setPower(this.attack_level);
/*      */     }
/*      */     
/*  712 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1 && 
/*  713 */       func_110143_aJ() < mygetMaxHealth()) {
/*  714 */       func_70691_i(1.0F);
/*      */     }
/*      */     
/*  717 */     if (!func_70909_n()) {
/*  718 */       EntityPlayer p = this.field_70170_p.func_72890_a((Entity)this, 10.0D);
/*  719 */       if (p != null) {
/*  720 */         func_70903_f(true);
/*  721 */         func_152115_b(p.func_110124_au().toString());
/*  722 */         func_70908_e(true);
/*  723 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  724 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */       } 
/*      */     } 
/*      */     
/*  728 */     this.attack_level++;
/*  729 */     if (getAttacking() != 0) {
/*  730 */       this.attack_level += 4;
/*      */     }
/*      */     
/*  733 */     if (getSpyroFire() == 0) this.attack_level = 0;
/*      */     
/*  735 */     if (this.attack_level > 500) {
/*  736 */       if (getAttacking() != 0) {
/*  737 */         int j = 3;
/*  738 */         for (int i = 0; i < j; i++) {
/*  739 */           this; Entity ppwr = spawnCreature(this.field_70170_p, "PurplePower", this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)));
/*      */ 
/*      */ 
/*      */           
/*  743 */           if (ppwr != null) {
/*  744 */             PurplePower p = (PurplePower)ppwr;
/*  745 */             p.field_70159_w = this.field_70159_w * 3.0D;
/*  746 */             p.field_70179_y = this.field_70179_y * 3.0D;
/*  747 */             p.setPurpleType(1 + this.field_70170_p.field_73012_v.nextInt(3));
/*      */           } 
/*      */         } 
/*      */       } else {
/*      */         
/*  752 */         if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"))
/*  753 */           for (int i = 0; i < 5; i++) {
/*  754 */             int n = this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5);
/*  755 */             int k = this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5);
/*  756 */             for (int j = -5; j < 5; j++) {
/*  757 */               Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k);
/*  758 */               if (bid == Blocks.field_150349_c) {
/*  759 */                 if (this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  760 */                   int which = this.field_70170_p.field_73012_v.nextInt(8);
/*  761 */                   if (which == 0) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, (Block)Blocks.field_150328_O); 
/*  762 */                   if (which == 1) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, (Block)Blocks.field_150327_N); 
/*  763 */                   if (which == 2) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.MyFlowerBlueBlock); 
/*  764 */                   if (which == 3) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.MyFlowerPinkBlock); 
/*  765 */                   if (which == 4) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerRedBlock); 
/*  766 */                   if (which == 5) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerGreenBlock); 
/*  767 */                   if (which == 6) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerBlueBlock); 
/*  768 */                   if (which == 7) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerYellowBlock); 
/*      */                 } 
/*      */                 break;
/*      */               } 
/*  772 */               if (bid == Blocks.field_150346_d && 
/*  773 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  774 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, (Block)Blocks.field_150349_c);
/*      */                 
/*      */                 break;
/*      */               } 
/*  778 */               if (bid == Blocks.field_150348_b && 
/*  779 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  780 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, Blocks.field_150346_d);
/*      */                 
/*      */                 break;
/*      */               } 
/*  784 */               if (bid == Blocks.field_150354_m && 
/*  785 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  786 */                 if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/*  787 */                   this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, Blocks.field_150434_aF); break;
/*      */                 } 
/*  789 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, Blocks.field_150346_d);
/*      */                 
/*      */                 break;
/*      */               } 
/*      */               
/*  794 */               if (bid == Blocks.field_150353_l && 
/*  795 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  796 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, Blocks.field_150355_j);
/*      */                 
/*      */                 break;
/*      */               } 
/*  800 */               if (bid == Blocks.field_150356_k && 
/*  801 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  802 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, (Block)Blocks.field_150358_i);
/*      */                 
/*      */                 break;
/*      */               } 
/*  806 */               if (bid == Blocks.field_150350_a && j > 0) {
/*      */                 break;
/*      */               }
/*      */             } 
/*      */           }  
/*  811 */         for (int m = 0; m < 2; m++) {
/*  812 */           int i = this.field_70170_p.field_73012_v.nextInt(4) - this.field_70170_p.field_73012_v.nextInt(4);
/*  813 */           int k = this.field_70170_p.field_73012_v.nextInt(4) - this.field_70170_p.field_73012_v.nextInt(4);
/*  814 */           int j = 1 + this.field_70170_p.field_73012_v.nextInt(4);
/*  815 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + j, (int)this.field_70161_v + k);
/*  816 */           if (bid == Blocks.field_150350_a) {
/*  817 */             if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/*  818 */               newent = (EntityLiving)spawnCreature(this.field_70170_p, "Butterfly", this.field_70165_t + i, this.field_70163_u + j, this.field_70161_v + k);
/*      */             } else {
/*  820 */               newent = (EntityLiving)spawnCreature(this.field_70170_p, "Bird", this.field_70165_t + i, this.field_70163_u + j, this.field_70161_v + k);
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*  825 */       this.attack_level = 1;
/*      */     } 
/*      */     
/*  828 */     if (!func_70906_o()) {
/*  829 */       if (this.activity == 0) {
/*  830 */         setActivity(1);
/*      */       }
/*      */       
/*  833 */       if (this.field_70170_p.field_73012_v.nextInt(100) == 1) {
/*  834 */         if (this.field_70170_p.field_73012_v.nextInt(20) == 1) {
/*  835 */           setActivity(2);
/*      */         } else {
/*  837 */           setActivity(1);
/*      */         } 
/*      */       }
/*      */       
/*  841 */       this.owner_flying = 0;
/*  842 */       if (func_70909_n() && func_70902_q() != null) {
/*  843 */         EntityPlayer e = (EntityPlayer)func_70902_q();
/*      */         
/*  845 */         if (e.field_71075_bZ.field_75100_b) {
/*  846 */           this.owner_flying = 1;
/*  847 */           setActivity(2);
/*      */         } 
/*      */       } 
/*      */       
/*  851 */       if (this.activity == 1 && func_70909_n() && func_70902_q() != null) {
/*  852 */         EntityLivingBase e = func_70902_q();
/*      */         
/*  854 */         if (func_70068_e((Entity)e) > 256.0D)
/*      */         {
/*  856 */           setActivity(2);
/*      */         }
/*      */       } 
/*      */       
/*  860 */       do_movement();
/*      */     }
/*  862 */     else if (func_70909_n() && func_70902_q() != null) {
/*  863 */       EntityLivingBase e = func_70902_q();
/*      */       
/*  865 */       if (func_70068_e((Entity)e) > 256.0D) {
/*      */         
/*  867 */         func_70904_g(false);
/*  868 */         setActivity(2);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  890 */     if (this.is_day == 0) {
/*  891 */       this.is_day = 1;
/*  892 */       if (!this.field_70170_p.func_72935_r()) this.is_day = -1; 
/*      */     } else {
/*  894 */       if (this.is_day == -1 && 
/*  895 */         this.field_70170_p.func_72935_r())
/*      */       {
/*  897 */         this.day_count++;
/*      */       }
/*      */       
/*  900 */       this.is_day = 1;
/*  901 */       if (!this.field_70170_p.func_72935_r()) this.is_day = -1;
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   private void do_movement() {
/*  907 */     int xdir = 1;
/*  908 */     int zdir = 1;
/*      */     
/*  910 */     int keep_trying = 10;
/*      */ 
/*      */     
/*  913 */     int do_new = 0;
/*  914 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*      */     
/*  916 */     int has_owner = 0;
/*  917 */     double rr = 0.0D;
/*  918 */     double rhdir = 0.0D;
/*  919 */     double rdd = 0.0D;
/*  920 */     double pi = 3.1415926545D;
/*  921 */     EntityLivingBase e = null;
/*      */ 
/*      */     
/*  924 */     if (this.currentFlightTarget == null) {
/*  925 */       do_new = 1;
/*  926 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  932 */     if (this.activity == 2 && this.field_70170_p.field_73012_v.nextInt(300) == 0) do_new = 1;
/*      */ 
/*      */     
/*  935 */     if (func_70909_n() && func_70902_q() != null) {
/*  936 */       e = func_70902_q();
/*  937 */       has_owner = 1;
/*  938 */       ox = e.field_70165_t;
/*  939 */       oy = e.field_70163_u + 1.0D;
/*  940 */       oz = e.field_70161_v;
/*      */       
/*  942 */       if (func_70068_e((Entity)e) > 100.0D) {
/*  943 */         do_new = 1;
/*      */       }
/*  945 */       if (this.owner_flying != 0 && 
/*  946 */         func_70068_e((Entity)e) > 36.0D) {
/*  947 */         do_new = 1;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  953 */     if (this.field_70170_p.field_73012_v.nextInt(7) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */ 
/*      */ 
/*      */       
/*  957 */       e = findSomethingToAttack();
/*  958 */       if (e != null) {
/*      */         
/*  960 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/*  961 */           setActivity(2);
/*  962 */           setAttacking(0);
/*  963 */           do_new = 0;
/*  964 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*      */         } else {
/*      */           
/*  967 */           setActivity(2);
/*  968 */           setAttacking(1);
/*  969 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/*  970 */           do_new = 0;
/*  971 */           if (func_70068_e((Entity)e) < ((3.0F + e.field_70130_N / 2.0F) * (3.0F + e.field_70130_N / 2.0F))) {
/*  972 */             func_70652_k((Entity)e);
/*  973 */           } else if (func_70068_e((Entity)e) > 25.0D && func_70068_e((Entity)e) < 144.0D && !func_70090_H() && getSpyroFire() != 0 && (
/*  974 */             this.field_70170_p.field_73012_v.nextInt(3) == 0 || this.field_70170_p.field_73012_v.nextInt(4) == 1)) {
/*  975 */             int which = this.field_70170_p.field_73012_v.nextInt(3);
/*  976 */             if (which == 0) {
/*      */ 
/*      */               
/*  979 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  980 */               rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */               
/*  982 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  983 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  984 */               rdd = Math.abs(rdd);
/*      */               
/*  986 */               if (rdd < 0.5D) {
/*  987 */                 firecanon(e);
/*      */               }
/*  989 */             } else if (which == 1) {
/*      */ 
/*      */ 
/*      */               
/*  993 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  994 */               rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */               
/*  996 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  997 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  998 */               rdd = Math.abs(rdd);
/*      */               
/* 1000 */               if (rdd < 0.5D) {
/* 1001 */                 firecanonl(e);
/*      */               
/*      */               }
/*      */             }
/*      */             else {
/*      */               
/* 1007 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/* 1008 */               rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */               
/* 1010 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 1011 */               if (rdd > pi) rdd -= pi * 2.0D; 
/* 1012 */               rdd = Math.abs(rdd);
/*      */               
/* 1014 */               if (rdd < 0.5D) {
/* 1015 */                 firecanoni(e);
/*      */               }
/*      */             }
/*      */           
/*      */           } 
/*      */         } 
/*      */       } else {
/*      */         
/* 1023 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */     
/* 1027 */     if (this.activity == 1) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1032 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/* 1033 */       do_new = 1;
/*      */     }
/*      */ 
/*      */     
/* 1037 */     if (do_new != 0) {
/*      */       
/* 1039 */       Block bid = Blocks.field_150348_b;
/* 1040 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 1041 */         int gox = (int)this.field_70165_t;
/* 1042 */         int goy = (int)this.field_70163_u;
/* 1043 */         int goz = (int)this.field_70161_v;
/* 1044 */         if (has_owner == 1) {
/* 1045 */           gox = (int)ox;
/* 1046 */           goy = (int)oy;
/* 1047 */           goz = (int)oz;
/* 1048 */           if (this.owner_flying == 0) {
/* 1049 */             zdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/* 1050 */             xdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/*      */           } else {
/* 1052 */             zdir = this.field_70170_p.field_73012_v.nextInt(8);
/* 1053 */             xdir = this.field_70170_p.field_73012_v.nextInt(8);
/*      */           } 
/*      */         } else {
/* 1056 */           zdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/* 1057 */           xdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/*      */         } 
/* 1059 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/* 1060 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir; 
/* 1061 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(6 + this.owner_flying * 2) - 2, goz + zdir);
/* 1062 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1068 */         keep_trying--;
/*      */       } 
/*      */     } 
/*      */     
/* 1072 */     double speed_factor = 1.0D;
/* 1073 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 1074 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 1075 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 1076 */     if (this.owner_flying != 0) {
/* 1077 */       speed_factor = 1.75D;
/* 1078 */       if (func_70909_n() && func_70902_q() != null) {
/* 1079 */         e = func_70902_q();
/* 1080 */         if (func_70068_e((Entity)e) > 49.0D) {
/* 1081 */           speed_factor = 3.5D;
/*      */         }
/*      */       } 
/*      */     } 
/* 1085 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.15D * speed_factor;
/* 1086 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.21D * speed_factor;
/* 1087 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.15D * speed_factor;
/* 1088 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 1089 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 1090 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*      */     
/* 1092 */     this.field_70177_z += var8 / 3.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 1100 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*      */     
/* 1102 */     if (par1EntityLiving == null)
/*      */     {
/* 1104 */       return false;
/*      */     }
/* 1106 */     if (par1EntityLiving == this)
/*      */     {
/* 1108 */       return false;
/*      */     }
/* 1110 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/* 1112 */       return false;
/*      */     }
/* 1114 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/* 1117 */       return false;
/*      */     }
/* 1119 */     if (MyUtils.isRoyalty((Entity)par1EntityLiving))
/*      */     {
/* 1121 */       return false;
/*      */     }
/*      */     
/* 1124 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*      */     {
/* 1126 */       return true;
/*      */     }
/* 1128 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/* 1130 */       return true;
/*      */     }
/* 1132 */     if (par1EntityLiving instanceof Dragonfly)
/*      */     {
/* 1134 */       return true;
/*      */     }
/* 1136 */     if (par1EntityLiving instanceof EntityMosquito)
/*      */     {
/* 1138 */       return true;
/*      */     }
/*      */     
/* 1141 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/* 1146 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 1147 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 6.0D, 12.0D));
/* 1148 */     Collections.sort(var5, this.TargetSorter);
/* 1149 */     Iterator<?> var2 = var5.iterator();
/* 1150 */     Entity var3 = null;
/* 1151 */     EntityLivingBase var4 = null;
/*      */     
/* 1153 */     while (var2.hasNext()) {
/*      */       
/* 1155 */       var3 = (Entity)var2.next();
/* 1156 */       var4 = (EntityLivingBase)var3;
/*      */       
/* 1158 */       if (isSuitableTarget(var4, false) && canSeeTarget(var4.field_70165_t, var4.field_70163_u, var4.field_70161_v))
/*      */       {
/* 1160 */         return var4;
/*      */       }
/*      */     } 
/* 1163 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanon(EntityLivingBase e) {
/* 1168 */     double yoff = 1.0D;
/* 1169 */     double xzoff = 3.0D;
/*      */ 
/*      */     
/* 1172 */     BetterFireball bf = null;
/*      */     
/* 1174 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1175 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */ 
/*      */     
/* 1178 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1179 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1180 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1181 */     bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx + r1, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff + r2, e.field_70161_v - cz + r3);
/* 1182 */     bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 1183 */     bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1184 */     bf.setBig();
/* 1185 */     if (this.field_70170_p.field_73012_v.nextInt(2) == 1) bf.setSmall(); 
/* 1186 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1187 */     this.field_70170_p.func_72838_d((Entity)bf);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanonl(EntityLivingBase e) {
/* 1195 */     double yoff = 1.0D;
/* 1196 */     double xzoff = 3.0D;
/*      */ 
/*      */ 
/*      */     
/* 1200 */     double var3 = 0.0D;
/* 1201 */     double var5 = 0.0D;
/* 1202 */     double var7 = 0.0D;
/* 1203 */     float var9 = 0.0F;
/* 1204 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1205 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1207 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1209 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1210 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1211 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1212 */     ThunderBolt lb = new ThunderBolt(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1213 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1214 */     var3 = e.field_70165_t - lb.field_70165_t;
/* 1215 */     var5 = e.field_70163_u + 0.25D - lb.field_70163_u;
/* 1216 */     var7 = e.field_70161_v - lb.field_70161_v;
/* 1217 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1218 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1219 */     lb.field_70159_w *= 3.0D;
/* 1220 */     lb.field_70181_x *= 3.0D;
/* 1221 */     lb.field_70179_y *= 3.0D;
/* 1222 */     this.field_70170_p.func_72838_d((Entity)lb);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanoni(EntityLivingBase e) {
/* 1229 */     double yoff = 1.0D;
/* 1230 */     double xzoff = 3.0D;
/*      */ 
/*      */ 
/*      */     
/* 1234 */     double var3 = 0.0D;
/* 1235 */     double var5 = 0.0D;
/* 1236 */     double var7 = 0.0D;
/* 1237 */     float var9 = 0.0F;
/* 1238 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1239 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1241 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1243 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1244 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1245 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1246 */     IceBall lb = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1247 */     lb.setIceMaker(1);
/* 1248 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1249 */     var3 = e.field_70165_t - lb.field_70165_t;
/* 1250 */     var5 = e.field_70163_u + 0.25D - lb.field_70163_u;
/* 1251 */     var7 = e.field_70161_v - lb.field_70161_v;
/* 1252 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1253 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1254 */     lb.field_70159_w *= 3.0D;
/* 1255 */     lb.field_70181_x *= 3.0D;
/* 1256 */     lb.field_70179_y *= 3.0D;
/* 1257 */     this.field_70170_p.func_72838_d((Entity)lb);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 1268 */     Entity var8 = null;
/*      */ 
/*      */     
/* 1271 */     var8 = EntityList.func_75620_a(par1, par0World);
/*      */     
/* 1273 */     if (var8 != null) {
/*      */ 
/*      */       
/* 1276 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1279 */       par0World.func_72838_d(var8);
/*      */       
/* 1281 */       ((EntityLiving)var8).func_70642_aH();
/*      */     } 
/*      */     
/* 1284 */     return var8;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ThePrincess.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */