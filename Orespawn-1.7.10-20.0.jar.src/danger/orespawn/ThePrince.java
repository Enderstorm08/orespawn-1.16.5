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
/*      */ public class ThePrince
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
/*      */ 
/*      */ 
/*      */   
/*      */   public ThePrince(World par1World) {
/*   79 */     super(par1World);
/*      */     
/*   81 */     func_70105_a(0.75F, 1.25F);
/*   82 */     this.moveSpeed = 0.32F;
/*   83 */     this.field_70174_ab = 1000;
/*   84 */     this.field_70178_ae = true;
/*   85 */     func_70661_as().func_75491_a(true);
/*   86 */     func_70904_g(false);
/*   87 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*   88 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 1.15F, 12.0F, 2.0F));
/*   89 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false));
/*   90 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 6.0F));
/*   91 */     this.field_70714_bg.func_75776_a(5, new MyEntityAIWander((EntityCreature)this, 0.75F));
/*   92 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*   93 */     this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*   94 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*   95 */     this.field_70728_aV = 50;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  100 */     super.func_110147_ax();
/*  101 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  102 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  103 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  104 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(10.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  109 */     super.func_70088_a();
/*  110 */     this.activity = 1;
/*  111 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(0));
/*  112 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(this.activity));
/*  113 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(1));
/*  114 */     func_70904_g(false);
/*  115 */     func_70903_f(false);
/*  116 */     this.field_70145_X = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/*  124 */     super.func_70014_b(par1NBTTagCompound);
/*  125 */     par1NBTTagCompound.func_74768_a("SpyroActivity", this.field_70180_af.func_75679_c(21));
/*  126 */     par1NBTTagCompound.func_74768_a("SpyroFire", this.field_70180_af.func_75679_c(20));
/*  127 */     par1NBTTagCompound.func_74768_a("SpyroGrow", this.ok_to_grow);
/*  128 */     par1NBTTagCompound.func_74768_a("SpyroKill", this.kill_count);
/*  129 */     par1NBTTagCompound.func_74768_a("SpyroFed", this.fed_count);
/*  130 */     par1NBTTagCompound.func_74768_a("SpyroDay", this.day_count);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/*  138 */     super.func_70037_a(par1NBTTagCompound);
/*  139 */     this.activity = par1NBTTagCompound.func_74762_e("SpyroActivity");
/*  140 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(this.activity));
/*  141 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1NBTTagCompound.func_74762_e("SpyroFire")));
/*  142 */     this.ok_to_grow = par1NBTTagCompound.func_74762_e("SpyroGrow");
/*  143 */     this.kill_count = par1NBTTagCompound.func_74762_e("SpyroKill");
/*  144 */     this.fed_count = par1NBTTagCompound.func_74762_e("SpyroFed");
/*  145 */     this.day_count = par1NBTTagCompound.func_74762_e("SpyroDay");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getActivity() {
/*  154 */     int i = this.field_70180_af.func_75679_c(21);
/*  155 */     this.activity = i;
/*  156 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/*  162 */     this.activity = par1;
/*  163 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(0));
/*  164 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getSpyroFire() {
/*  170 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSpyroFire(int par1) {
/*  176 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/*  182 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/*  188 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public int getHead1Ext() {
/*  193 */     return this.head1ext;
/*      */   }
/*      */   
/*      */   public int getHead2Ext() {
/*  197 */     return this.head2ext;
/*      */   }
/*      */   
/*      */   public int getHead3Ext() {
/*  201 */     return this.head3ext;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  211 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  217 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  222 */     return 500;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  231 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */ 
/*      */     
/*  234 */     if (var2 != null)
/*      */     {
/*  236 */       if (var2.field_77994_a <= 0) {
/*      */         
/*  238 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  239 */         var2 = null;
/*      */       } 
/*      */     }
/*      */     
/*  243 */     if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150484_ah) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*  244 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  246 */         func_70903_f(true);
/*  247 */         func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*  248 */         func_70908_e(true);
/*  249 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  250 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*  251 */         this.ok_to_grow = 1;
/*  252 */         this.kill_count = 1000;
/*  253 */         this.fed_count = 1000;
/*  254 */         this.day_count = 1000;
/*      */       } 
/*      */ 
/*      */       
/*  258 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*  259 */         var2.field_77994_a--;
/*  260 */         if (var2.field_77994_a <= 0) {
/*  261 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  264 */       return true;
/*      */     } 
/*      */     
/*  267 */     if (func_70909_n() && var2 != null && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && var2.func_77973_b() instanceof ItemFood) {
/*      */ 
/*      */ 
/*      */       
/*  271 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  273 */         ItemFood var3 = (ItemFood)var2.func_77973_b();
/*      */         
/*  275 */         if (mygetMaxHealth() > func_110143_aJ())
/*      */         {
/*  277 */           func_70691_i((var3.func_150905_g(var2) * 10));
/*      */         }
/*      */         
/*  280 */         func_70908_e(true);
/*  281 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  282 */         this.fed_count++;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  287 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  289 */         var2.field_77994_a--;
/*  290 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  292 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  295 */       return true;
/*  296 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150432_aD) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  299 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  301 */         func_70908_e(true);
/*  302 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*  303 */         setSpyroFire(0);
/*  304 */         String healthMessage = new String();
/*  305 */         healthMessage = String.format("Prince fireballs extinguished.", new Object[0]);
/*  306 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */       } 
/*  308 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  310 */         var2.field_77994_a--;
/*  311 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  313 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  316 */       return true;
/*  317 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151033_d && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  320 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  322 */         func_70908_e(true);
/*  323 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*  324 */         setSpyroFire(1);
/*  325 */         String healthMessage = new String();
/*  326 */         healthMessage = String.format("Prince fireballs lit!", new Object[0]);
/*  327 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */       } 
/*  329 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  331 */         var2.field_77994_a--;
/*  332 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  334 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  337 */       return true;
/*      */     } 
/*      */     
/*  340 */     if (var2 != null && var2.func_77973_b() == Items.field_151045_i && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer) && !this.field_70170_p.field_72995_K && this.ok_to_grow != 0) {
/*      */ 
/*      */ 
/*      */       
/*  344 */       Entity ent = null;
/*  345 */       ThePrinceTeen d = null;
/*  346 */       ent = spawnCreature(this.field_70170_p, "The Young Prince", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  347 */       if (ent != null) {
/*  348 */         d = (ThePrinceTeen)ent;
/*  349 */         if (func_70909_n()) {
/*  350 */           d.func_70903_f(true);
/*  351 */           d.func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*      */         } 
/*  353 */         func_70106_y();
/*      */       } 
/*  355 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  357 */         var2.field_77994_a--;
/*  358 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  360 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  363 */       return true;
/*  364 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  366 */       func_94058_c(var2.func_82833_r());
/*  367 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  369 */         var2.field_77994_a--;
/*  370 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  372 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  375 */       return true;
/*      */     } 
/*      */     
/*  378 */     if (func_70909_n() && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  380 */       if (!func_70906_o()) {
/*  381 */         func_70904_g(true);
/*  382 */         setActivity(1);
/*      */       } else {
/*  384 */         func_70904_g(false);
/*      */       } 
/*  386 */       return true;
/*      */     } 
/*      */     
/*  389 */     return super.func_70085_c(par1EntityPlayer);
/*      */   }
/*      */ 
/*      */   
/*      */   public void set_ok_to_grow() {
/*  394 */     this.ok_to_grow = 1;
/*  395 */     this.kill_count = 0;
/*  396 */     this.fed_count = 0;
/*  397 */     this.day_count = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/*  405 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  413 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  421 */     if (func_70906_o())
/*      */     {
/*  423 */       return null;
/*      */     }
/*  425 */     if (getAttacking() == 0) {
/*  426 */       return null;
/*      */     }
/*  428 */     return "orespawn:roar";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  436 */     return "orespawn:duck_hurt";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  444 */     return "orespawn:cryo_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  452 */     return 0.6F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  460 */     return 16;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  468 */     return Items.field_151082_bd;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  476 */     int var3 = 0;
/*      */     
/*  478 */     var3 = this.field_70170_p.field_73012_v.nextInt(4);
/*  479 */     var3++;
/*  480 */     for (int var4 = 0; var4 < var3; var4++)
/*      */     {
/*  482 */       func_145779_a(Items.field_151082_bd, 1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70647_i() {
/*  492 */     return (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 0.2F + 1.3F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  500 */     return true;
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
/*  518 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  526 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/*  532 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public float getAttackStrength(Entity par1Entity) {
/*  537 */     return 10.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  544 */     float var2 = getAttackStrength(par1Entity);
/*  545 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), var2);
/*  546 */     if (par1Entity instanceof EntityLivingBase) {
/*  547 */       EntityLivingBase el = (EntityLivingBase)par1Entity;
/*  548 */       if (el.func_110143_aJ() <= 0.0F) {
/*  549 */         this.kill_count++;
/*      */       }
/*      */     } 
/*  552 */     return var4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  560 */     boolean ret = false;
/*      */     
/*  562 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  563 */       return false;
/*      */     }
/*  565 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*  566 */       ret = super.func_70097_a(par1DamageSource, par2);
/*  567 */       func_70904_g(false);
/*  568 */       setActivity(2);
/*      */     } 
/*  570 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  578 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  588 */     super.func_70071_h_();
/*  589 */     if (getActivity() == 2) {
/*  590 */       this.field_70145_X = true;
/*      */     } else {
/*  592 */       this.field_70145_X = false;
/*      */     } 
/*      */     
/*  595 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  596 */       int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  597 */       if (i == 0) this.head1dir = 2; 
/*  598 */       if (i == 1) this.head1dir = -2; 
/*  599 */       if (i == 2) this.head1dir = 0; 
/*      */     } 
/*  601 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  602 */       int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  603 */       if (i == 0) this.head2dir = 2; 
/*  604 */       if (i == 1) this.head2dir = -2; 
/*  605 */       if (i == 2) this.head2dir = 0; 
/*      */     } 
/*  607 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  608 */       int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  609 */       if (i == 0) this.head3dir = 2; 
/*  610 */       if (i == 1) this.head3dir = -2; 
/*  611 */       if (i == 2) this.head3dir = 0; 
/*      */     } 
/*  613 */     this.head1ext += this.head1dir;
/*  614 */     if (this.head1ext < 0) this.head1ext = 0; 
/*  615 */     if (this.head1ext > 60) this.head1ext = 60; 
/*  616 */     this.head2ext += this.head2dir;
/*  617 */     if (this.head2ext < 0) this.head2ext = 0; 
/*  618 */     if (this.head2ext > 60) this.head2ext = 60; 
/*  619 */     this.head3ext += this.head3dir;
/*  620 */     if (this.head3ext < 0) this.head3ext = 0; 
/*  621 */     if (this.head3ext > 60) this.head3ext = 60;
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  631 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  632 */     super.func_70636_d();
/*      */     
/*  634 */     if (func_70090_H()) {
/*  635 */       this.field_70181_x += 0.07D;
/*      */     }
/*      */ 
/*      */     
/*  639 */     if (this.currentFlightTarget == null) {
/*  640 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     }
/*      */ 
/*      */     
/*  644 */     this.syncit++;
/*  645 */     if (this.syncit > 20) {
/*  646 */       this.syncit = 0;
/*  647 */       if (this.field_70170_p.field_72995_K) {
/*  648 */         getActivity();
/*      */       } else {
/*  650 */         int j = this.activity;
/*  651 */         setActivity(j);
/*      */       } 
/*      */     } 
/*      */     
/*  655 */     if (this.activity == 2) {
/*  656 */       this.field_70181_x *= 0.6D;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70619_bc() {
/*  666 */     if (this.field_70128_L)
/*      */       return; 
/*  668 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null);
/*      */     
/*  670 */     if (this.activity != 2) {
/*  671 */       super.func_70619_bc();
/*      */     }
/*      */ 
/*      */     
/*  675 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1 && 
/*  676 */       func_110143_aJ() < mygetMaxHealth()) {
/*  677 */       func_70691_i(1.0F);
/*      */     }
/*      */     
/*  680 */     if (!func_70909_n()) {
/*  681 */       EntityPlayer p = this.field_70170_p.func_72890_a((Entity)this, 10.0D);
/*  682 */       if (p != null) {
/*  683 */         func_70903_f(true);
/*  684 */         func_152115_b(p.func_110124_au().toString());
/*  685 */         func_70908_e(true);
/*  686 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  687 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  692 */     if (!func_70906_o()) {
/*  693 */       if (this.activity == 0) {
/*  694 */         setActivity(1);
/*      */       }
/*      */       
/*  697 */       if (this.field_70170_p.field_73012_v.nextInt(100) == 1) {
/*  698 */         if (this.field_70170_p.field_73012_v.nextInt(20) == 1) {
/*  699 */           setActivity(2);
/*      */         } else {
/*  701 */           setActivity(1);
/*      */         } 
/*      */       }
/*      */       
/*  705 */       this.owner_flying = 0;
/*  706 */       if (func_70909_n() && func_70902_q() != null) {
/*  707 */         EntityPlayer e = (EntityPlayer)func_70902_q();
/*      */         
/*  709 */         if (e.field_71075_bZ.field_75100_b) {
/*  710 */           this.owner_flying = 1;
/*  711 */           setActivity(2);
/*      */         } 
/*      */       } 
/*      */       
/*  715 */       if (this.activity == 1 && func_70909_n() && func_70902_q() != null) {
/*  716 */         EntityLivingBase e = func_70902_q();
/*      */         
/*  718 */         if (func_70068_e((Entity)e) > 256.0D)
/*      */         {
/*  720 */           setActivity(2);
/*      */         }
/*      */       } 
/*      */       
/*  724 */       do_movement();
/*      */     }
/*  726 */     else if (func_70909_n() && func_70902_q() != null) {
/*  727 */       EntityLivingBase e = func_70902_q();
/*      */       
/*  729 */       if (func_70068_e((Entity)e) > 256.0D) {
/*      */         
/*  731 */         func_70904_g(false);
/*  732 */         setActivity(2);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  738 */     if (this.kill_count > 25 && this.fed_count > 10 && this.day_count > 10) {
/*  739 */       Entity ent = null;
/*  740 */       ThePrinceTeen d = null;
/*  741 */       ent = spawnCreature(this.field_70170_p, "The Young Prince", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  742 */       if (ent != null) {
/*  743 */         d = (ThePrinceTeen)ent;
/*  744 */         if (func_70909_n()) {
/*  745 */           d.func_70903_f(true);
/*      */           
/*  747 */           d.func_152115_b(func_152113_b());
/*      */         } 
/*  749 */         func_70106_y();
/*      */       } 
/*      */     } 
/*      */     
/*  753 */     if (this.is_day == 0) {
/*  754 */       this.is_day = 1;
/*  755 */       if (!this.field_70170_p.func_72935_r()) this.is_day = -1; 
/*      */     } else {
/*  757 */       if (this.is_day == -1 && 
/*  758 */         this.field_70170_p.func_72935_r())
/*      */       {
/*  760 */         this.day_count++;
/*      */       }
/*      */       
/*  763 */       this.is_day = 1;
/*  764 */       if (!this.field_70170_p.func_72935_r()) this.is_day = -1;
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   private void do_movement() {
/*  770 */     int xdir = 1;
/*  771 */     int zdir = 1;
/*      */     
/*  773 */     int keep_trying = 10;
/*      */ 
/*      */     
/*  776 */     int do_new = 0;
/*  777 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*      */     
/*  779 */     int has_owner = 0;
/*  780 */     double rr = 0.0D;
/*  781 */     double rhdir = 0.0D;
/*  782 */     double rdd = 0.0D;
/*  783 */     double pi = 3.1415926545D;
/*  784 */     EntityLivingBase e = null;
/*      */ 
/*      */     
/*  787 */     if (this.currentFlightTarget == null) {
/*  788 */       do_new = 1;
/*  789 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  795 */     if (this.activity == 2 && this.field_70170_p.field_73012_v.nextInt(300) == 0) do_new = 1;
/*      */ 
/*      */     
/*  798 */     if (func_70909_n() && func_70902_q() != null) {
/*  799 */       e = func_70902_q();
/*  800 */       has_owner = 1;
/*  801 */       ox = e.field_70165_t;
/*  802 */       oy = e.field_70163_u + 1.0D;
/*  803 */       oz = e.field_70161_v;
/*      */       
/*  805 */       if (func_70068_e((Entity)e) > 100.0D) {
/*  806 */         do_new = 1;
/*      */       }
/*  808 */       if (this.owner_flying != 0 && 
/*  809 */         func_70068_e((Entity)e) > 36.0D) {
/*  810 */         do_new = 1;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  816 */     if (this.field_70170_p.field_73012_v.nextInt(7) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */ 
/*      */ 
/*      */       
/*  820 */       e = findSomethingToAttack();
/*  821 */       if (e != null) {
/*      */         
/*  823 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/*  824 */           setActivity(2);
/*  825 */           setAttacking(0);
/*  826 */           do_new = 0;
/*  827 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*      */         } else {
/*      */           
/*  830 */           setActivity(2);
/*  831 */           setAttacking(1);
/*  832 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/*  833 */           do_new = 0;
/*  834 */           if (func_70068_e((Entity)e) < ((3.0F + e.field_70130_N / 2.0F) * (3.0F + e.field_70130_N / 2.0F))) {
/*  835 */             func_70652_k((Entity)e);
/*  836 */           } else if (func_70068_e((Entity)e) > 25.0D && func_70068_e((Entity)e) < 144.0D && !func_70090_H() && getSpyroFire() != 0 && (
/*  837 */             this.field_70170_p.field_73012_v.nextInt(3) == 0 || this.field_70170_p.field_73012_v.nextInt(4) == 1)) {
/*  838 */             int which = this.field_70170_p.field_73012_v.nextInt(3);
/*  839 */             if (which == 0) {
/*      */ 
/*      */               
/*  842 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  843 */               rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */               
/*  845 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  846 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  847 */               rdd = Math.abs(rdd);
/*      */               
/*  849 */               if (rdd < 0.5D) {
/*  850 */                 firecanon(e);
/*      */               }
/*  852 */             } else if (which == 1) {
/*      */ 
/*      */ 
/*      */               
/*  856 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  857 */               rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */               
/*  859 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  860 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  861 */               rdd = Math.abs(rdd);
/*      */               
/*  863 */               if (rdd < 0.5D) {
/*  864 */                 firecanonl(e);
/*      */               
/*      */               }
/*      */             }
/*      */             else {
/*      */               
/*  870 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  871 */               rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */               
/*  873 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  874 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  875 */               rdd = Math.abs(rdd);
/*      */               
/*  877 */               if (rdd < 0.5D) {
/*  878 */                 firecanoni(e);
/*      */               }
/*      */             }
/*      */           
/*      */           } 
/*      */         } 
/*      */       } else {
/*      */         
/*  886 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */     
/*  890 */     if (this.activity == 1) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  895 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*  896 */       do_new = 1;
/*      */     }
/*      */ 
/*      */     
/*  900 */     if (do_new != 0) {
/*      */       
/*  902 */       Block bid = Blocks.field_150348_b;
/*  903 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/*  904 */         int gox = (int)this.field_70165_t;
/*  905 */         int goy = (int)this.field_70163_u;
/*  906 */         int goz = (int)this.field_70161_v;
/*  907 */         if (has_owner == 1) {
/*  908 */           gox = (int)ox;
/*  909 */           goy = (int)oy;
/*  910 */           goz = (int)oz;
/*  911 */           if (this.owner_flying == 0) {
/*  912 */             zdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/*  913 */             xdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/*      */           } else {
/*  915 */             zdir = this.field_70170_p.field_73012_v.nextInt(8);
/*  916 */             xdir = this.field_70170_p.field_73012_v.nextInt(8);
/*      */           } 
/*      */         } else {
/*  919 */           zdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/*  920 */           xdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/*      */         } 
/*  922 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  923 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir; 
/*  924 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(6 + this.owner_flying * 2) - 2, goz + zdir);
/*  925 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  931 */         keep_trying--;
/*      */       } 
/*      */     } 
/*      */     
/*  935 */     double speed_factor = 1.0D;
/*  936 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/*  937 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/*  938 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/*  939 */     if (this.owner_flying != 0) {
/*  940 */       speed_factor = 1.75D;
/*  941 */       if (func_70909_n() && func_70902_q() != null) {
/*  942 */         e = func_70902_q();
/*  943 */         if (func_70068_e((Entity)e) > 49.0D) {
/*  944 */           speed_factor = 3.5D;
/*      */         }
/*      */       } 
/*      */     } 
/*  948 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.15D * speed_factor;
/*  949 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.21D * speed_factor;
/*  950 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.15D * speed_factor;
/*  951 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/*  952 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/*  953 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*      */     
/*  955 */     this.field_70177_z += var8 / 3.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  963 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*      */     
/*  965 */     if (par1EntityLiving == null)
/*      */     {
/*  967 */       return false;
/*      */     }
/*  969 */     if (par1EntityLiving == this)
/*      */     {
/*  971 */       return false;
/*      */     }
/*  973 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*  975 */       return false;
/*      */     }
/*  977 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  980 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  984 */     if (MyUtils.isRoyalty((Entity)par1EntityLiving))
/*      */     {
/*  986 */       return false;
/*      */     }
/*      */     
/*  989 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*      */     {
/*  991 */       return true;
/*      */     }
/*  993 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/*  995 */       return true;
/*      */     }
/*  997 */     if (par1EntityLiving instanceof EntityButterfly)
/*      */     {
/*  999 */       return true;
/*      */     }
/* 1001 */     if (par1EntityLiving instanceof Cockateil)
/*      */     {
/* 1003 */       return true;
/*      */     }
/* 1005 */     if (par1EntityLiving instanceof Dragonfly)
/*      */     {
/* 1007 */       return true;
/*      */     }
/* 1009 */     if (par1EntityLiving instanceof EntityMosquito)
/*      */     {
/* 1011 */       return true;
/*      */     }
/*      */     
/* 1014 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/* 1019 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 1020 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 6.0D, 12.0D));
/* 1021 */     Collections.sort(var5, this.TargetSorter);
/* 1022 */     Iterator<?> var2 = var5.iterator();
/* 1023 */     Entity var3 = null;
/* 1024 */     EntityLivingBase var4 = null;
/*      */     
/* 1026 */     while (var2.hasNext()) {
/*      */       
/* 1028 */       var3 = (Entity)var2.next();
/* 1029 */       var4 = (EntityLivingBase)var3;
/*      */       
/* 1031 */       if (isSuitableTarget(var4, false) && canSeeTarget(var4.field_70165_t, var4.field_70163_u, var4.field_70161_v))
/*      */       {
/* 1033 */         return var4;
/*      */       }
/*      */     } 
/* 1036 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanon(EntityLivingBase e) {
/* 1041 */     double yoff = 1.0D;
/* 1042 */     double xzoff = 3.0D;
/*      */ 
/*      */     
/* 1045 */     BetterFireball bf = null;
/*      */     
/* 1047 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1048 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */ 
/*      */     
/* 1051 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1052 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1053 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1054 */     bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx + r1, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff + r2, e.field_70161_v - cz + r3);
/* 1055 */     bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 1056 */     bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1057 */     bf.setBig();
/* 1058 */     if (this.field_70170_p.field_73012_v.nextInt(2) == 1) bf.setSmall(); 
/* 1059 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1060 */     this.field_70170_p.func_72838_d((Entity)bf);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanonl(EntityLivingBase e) {
/* 1068 */     double yoff = 1.0D;
/* 1069 */     double xzoff = 3.0D;
/*      */ 
/*      */ 
/*      */     
/* 1073 */     double var3 = 0.0D;
/* 1074 */     double var5 = 0.0D;
/* 1075 */     double var7 = 0.0D;
/* 1076 */     float var9 = 0.0F;
/* 1077 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1078 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1080 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1082 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1083 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1084 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1085 */     ThunderBolt lb = new ThunderBolt(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1086 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1087 */     var3 = e.field_70165_t - lb.field_70165_t;
/* 1088 */     var5 = e.field_70163_u + 0.25D - lb.field_70163_u;
/* 1089 */     var7 = e.field_70161_v - lb.field_70161_v;
/* 1090 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1091 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1092 */     lb.field_70159_w *= 3.0D;
/* 1093 */     lb.field_70181_x *= 3.0D;
/* 1094 */     lb.field_70179_y *= 3.0D;
/* 1095 */     this.field_70170_p.func_72838_d((Entity)lb);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanoni(EntityLivingBase e) {
/* 1102 */     double yoff = 1.0D;
/* 1103 */     double xzoff = 3.0D;
/*      */ 
/*      */ 
/*      */     
/* 1107 */     double var3 = 0.0D;
/* 1108 */     double var5 = 0.0D;
/* 1109 */     double var7 = 0.0D;
/* 1110 */     float var9 = 0.0F;
/* 1111 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1112 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1114 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1116 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1117 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1118 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1119 */     IceBall lb = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1120 */     lb.setIceMaker(1);
/* 1121 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1122 */     var3 = e.field_70165_t - lb.field_70165_t;
/* 1123 */     var5 = e.field_70163_u + 0.25D - lb.field_70163_u;
/* 1124 */     var7 = e.field_70161_v - lb.field_70161_v;
/* 1125 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1126 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1127 */     lb.field_70159_w *= 3.0D;
/* 1128 */     lb.field_70181_x *= 3.0D;
/* 1129 */     lb.field_70179_y *= 3.0D;
/* 1130 */     this.field_70170_p.func_72838_d((Entity)lb);
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
/* 1141 */     Entity var8 = null;
/*      */ 
/*      */     
/* 1144 */     var8 = EntityList.func_75620_a(par1, par0World);
/*      */     
/* 1146 */     if (var8 != null) {
/*      */ 
/*      */       
/* 1149 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1152 */       par0World.func_72838_d(var8);
/*      */       
/* 1154 */       ((EntityLiving)var8).func_70642_aH();
/*      */     } 
/*      */     
/* 1157 */     return var8;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ThePrince.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */