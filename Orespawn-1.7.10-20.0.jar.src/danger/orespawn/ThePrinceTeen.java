/*      */ package danger.orespawn;
/*      */ 
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
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
/*      */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*      */ import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.ai.EntityAITempt;
/*      */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*      */ import net.minecraft.entity.item.EntityItem;
/*      */ import net.minecraft.entity.monster.IMob;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ThePrinceTeen
/*      */   extends EntityTameable
/*      */ {
/*      */   private int boatPosRotationIncrements;
/*      */   private double boatX;
/*      */   private double boatY;
/*      */   private double boatZ;
/*      */   private double boatYaw;
/*      */   private double boatPitch;
/*      */   private double boatYawHead;
/*   80 */   private int updateit = 1;
/*   81 */   private int playing = 0;
/*   82 */   private GenericTargetSorter TargetSorter = null;
/*   83 */   private RenderInfo renderdata = new RenderInfo();
/*   84 */   private int hurt_timer = 0;
/*   85 */   private int wing_sound = 0;
/*   86 */   private ChunkCoordinates currentFlightTarget = null;
/*      */   private boolean target_in_sight = false;
/*   88 */   private int owner_flying = 0;
/*   89 */   private int flyaway = 0;
/*   90 */   private float moveSpeed = 0.32F;
/*   91 */   private float deltasmooth = 0.0F;
/*   92 */   private int which_attack = 0;
/*   93 */   private int fireballticker = 0;
/*      */   
/*   95 */   private int head1ext = 0;
/*   96 */   private int head2ext = 0;
/*   97 */   private int head3ext = 0;
/*   98 */   private int head1dir = 1;
/*   99 */   private int head2dir = 1;
/*  100 */   private int head3dir = 1;
/*      */   
/*  102 */   private int kill_count = 0;
/*  103 */   private int day_count = 0;
/*  104 */   private int is_day = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ThePrinceTeen(World par1World) {
/*  112 */     super(par1World);
/*      */     
/*  114 */     func_70105_a(3.25F, 4.25F);
/*  115 */     func_70661_as().func_75491_a(true);
/*  116 */     this.field_70728_aV = 300;
/*  117 */     this.field_70174_ab = 1000;
/*  118 */     this.field_70178_ae = true;
/*  119 */     func_70904_g(false);
/*  120 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  121 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 1.1F, 12.0F, 2.0F));
/*  122 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false));
/*  123 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIWander((EntityCreature)this, 0.75F));
/*  124 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 9.0F));
/*  125 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  126 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*  127 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLiving.class, 0, true, false, IMob.field_82192_a)); 
/*  128 */     this.field_70715_bh.func_75776_a(2, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  129 */     this.field_70153_n = null;
/*  130 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  131 */     this.renderdata = new RenderInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ThePrinceTeen(World par1World, double par2, double par4, double par6) {
/*  137 */     this(par1World);
/*  138 */     func_70107_b(par2, par4 + this.field_70129_M, par6);
/*  139 */     this.field_70159_w = 0.0D;
/*  140 */     this.field_70181_x = 0.0D;
/*  141 */     this.field_70179_y = 0.0D;
/*  142 */     this.field_70169_q = par2;
/*  143 */     this.field_70167_r = par4;
/*  144 */     this.field_70166_s = par6;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  149 */     super.func_110147_ax();
/*  150 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  151 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  152 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  153 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(50.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean shouldRiderSit() {
/*  162 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getTrackingRange() {
/*  167 */     return 64;
/*      */   }
/*      */   
/*      */   public int getUpdateFrequency() {
/*  171 */     return 10;
/*      */   }
/*      */   
/*      */   public boolean sendsVelocityUpdates() {
/*  175 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getHead1Ext() {
/*  180 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */   
/*      */   public int getHead2Ext() {
/*  184 */     return this.field_70180_af.func_75679_c(23);
/*      */   }
/*      */   
/*      */   public int getHead3Ext() {
/*  188 */     return this.field_70180_af.func_75679_c(25);
/*      */   }
/*      */   
/*      */   public void setHead1Ext(int par1) {
/*  192 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/*  193 */       return;  this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*      */   }
/*      */   
/*      */   public void setHead2Ext(int par1) {
/*  197 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/*  198 */       return;  this.field_70180_af.func_75692_b(23, Integer.valueOf(par1));
/*      */   }
/*      */   
/*      */   public void setHead3Ext(int par1) {
/*  202 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/*  203 */       return;  this.field_70180_af.func_75692_b(25, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70069_a(float par1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70064_a(double par1, boolean par3) {}
/*      */ 
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  216 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  221 */     super.func_70088_a();
/*  222 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(0));
/*  223 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(0));
/*  224 */     this.field_70180_af.func_75682_a(24, Integer.valueOf(1));
/*  225 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(0));
/*  226 */     this.field_70180_af.func_75682_a(23, Integer.valueOf(0));
/*  227 */     this.field_70180_af.func_75682_a(25, Integer.valueOf(0));
/*  228 */     setActivity(0);
/*  229 */     setAttacking(0);
/*  230 */     func_70903_f(false);
/*  231 */     setThePrinceTeenFire(1);
/*  232 */     this.field_70145_X = false;
/*      */     
/*  234 */     if (this.renderdata == null) {
/*  235 */       this.renderdata = new RenderInfo();
/*      */     }
/*  237 */     this.renderdata.rf1 = 0.0F;
/*  238 */     this.renderdata.rf2 = 0.0F;
/*  239 */     this.renderdata.rf3 = 0.0F;
/*  240 */     this.renderdata.rf4 = 0.0F;
/*  241 */     this.renderdata.ri1 = 0;
/*  242 */     this.renderdata.ri2 = 0;
/*  243 */     this.renderdata.ri3 = 0;
/*  244 */     this.renderdata.ri4 = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  251 */     return 1500;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getThePrinceTeenHealth() {
/*  258 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RenderInfo getRenderInfo() {
/*  265 */     return this.renderdata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenderInfo(RenderInfo r) {
/*  270 */     this.renderdata.rf1 = r.rf1;
/*  271 */     this.renderdata.rf2 = r.rf2;
/*  272 */     this.renderdata.rf3 = r.rf3;
/*  273 */     this.renderdata.rf4 = r.rf4;
/*  274 */     this.renderdata.ri1 = r.ri1;
/*  275 */     this.renderdata.ri2 = r.ri2;
/*  276 */     this.renderdata.ri3 = r.ri3;
/*  277 */     this.renderdata.ri4 = r.ri4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  285 */     return 18;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70664_aZ() {
/*  291 */     super.func_70664_aZ();
/*  292 */     this.field_70181_x += 0.25D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  300 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  309 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String func_70639_aQ() {
/*  317 */     if (func_70906_o())
/*      */     {
/*  319 */       return null;
/*      */     }
/*  321 */     if (getActivity() == 1 && this.field_70153_n == null) {
/*  322 */       return "orespawn:roar";
/*      */     }
/*      */     
/*  325 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  333 */     return "orespawn:alo_hurt";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  341 */     return "orespawn:alo_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  348 */     return 0.6F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float func_70647_i() {
/*  355 */     return 0.75F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70104_M() {
/*  364 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double func_70042_X() {
/*  372 */     return 2.75D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  380 */     return OreSpawnMain.ThePrinceEgg;
/*      */   }
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRand(Item index, int par1) {
/*  385 */     EntityItem var3 = null;
/*  386 */     ItemStack is = new ItemStack(index, par1, 0);
/*      */     
/*  388 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*      */     
/*  390 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  391 */     return is;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  396 */     dropItemRand(OreSpawnMain.ThePrinceEgg, 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  405 */     double ks = 1.75D;
/*  406 */     double inair = 0.1D;
/*  407 */     float iskraken = 1.0F;
/*  408 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */       
/*  410 */       if (par1Entity instanceof Kraken) iskraken = 2.0F; 
/*  411 */       par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), iskraken * 45.0F);
/*      */       
/*  413 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  414 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/*  415 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*  416 */       if (par1Entity instanceof EntityLiving) {
/*  417 */         EntityLiving e = (EntityLiving)par1Entity;
/*  418 */         if (e.func_110143_aJ() <= 0.0F) {
/*  419 */           this.kill_count++;
/*      */         }
/*      */       } 
/*      */     } 
/*  423 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  431 */     boolean ret = false;
/*  432 */     Entity e = null;
/*      */     
/*  434 */     if (this.hurt_timer > 0) return false;
/*      */     
/*  436 */     if (par1DamageSource.func_76355_l().equals("cactus")) {
/*  437 */       return ret;
/*      */     }
/*  439 */     if (par1DamageSource.func_76355_l().equals("inFire")) {
/*  440 */       return ret;
/*      */     }
/*  442 */     if (par1DamageSource.func_76355_l().equals("onFire")) {
/*  443 */       return ret;
/*      */     }
/*  445 */     if (par1DamageSource.func_76355_l().equals("lava")) {
/*  446 */       return ret;
/*      */     }
/*  448 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  449 */       return ret;
/*      */     }
/*      */     
/*  452 */     func_70904_g(false);
/*  453 */     setActivity(1);
/*      */     
/*  455 */     e = par1DamageSource.func_76346_g();
/*      */ 
/*      */     
/*  458 */     if (e != null && e instanceof BetterFireball) {
/*      */       
/*  460 */       e.func_70106_y();
/*  461 */       return ret;
/*      */     } 
/*      */     
/*  464 */     if (e != null && e instanceof net.minecraft.entity.projectile.EntitySmallFireball) {
/*      */       
/*  466 */       e.func_70106_y();
/*  467 */       return ret;
/*      */     } 
/*  469 */     if (e != null && e instanceof ThePrinceTeen) {
/*  470 */       return false;
/*      */     }
/*  472 */     if (e != null && e instanceof Spyro) {
/*  473 */       return false;
/*      */     }
/*      */     
/*  476 */     ret = super.func_70097_a(par1DamageSource, par2);
/*  477 */     this.hurt_timer = 20;
/*      */     
/*  479 */     if (e != null && e instanceof EntityLivingBase) {
/*      */       
/*  481 */       if (func_70909_n() && 
/*  482 */         e instanceof EntityPlayer) {
/*  483 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  487 */       func_70624_b((EntityLivingBase)e);
/*  488 */       func_70784_b(e);
/*  489 */       func_70661_as().func_75497_a(e, 1.2D);
/*  490 */       ret = true;
/*      */     } 
/*      */     
/*  493 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70619_bc() {
/*  499 */     EntityLivingBase e = null;
/*  500 */     super.func_70619_bc();
/*      */ 
/*      */     
/*  503 */     if (!func_70906_o() && getActivity() == 0 && this.field_70153_n == null && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*      */       
/*  505 */       e = findSomethingToAttack();
/*  506 */       if (e != null) {
/*      */ 
/*      */         
/*  509 */         setActivity(1);
/*      */       } else {
/*  511 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  516 */     if (this.kill_count > 25 && this.day_count > 10) {
/*  517 */       Entity ent = null;
/*  518 */       ThePrinceAdult d = null;
/*  519 */       ent = spawnCreature(this.field_70170_p, "The Young Adult Prince", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  520 */       if (ent != null) {
/*  521 */         d = (ThePrinceAdult)ent;
/*  522 */         if (func_70909_n()) {
/*  523 */           d.func_70903_f(true);
/*  524 */           d.func_152115_b(func_152113_b());
/*      */         } 
/*  526 */         func_70106_y();
/*      */       } 
/*      */     } 
/*      */     
/*  530 */     if (this.is_day == 0) {
/*  531 */       this.is_day = 1;
/*  532 */       if (!this.field_70170_p.func_72935_r()) this.is_day = -1; 
/*      */     } else {
/*  534 */       if (this.is_day == -1 && 
/*  535 */         this.field_70170_p.func_72935_r())
/*      */       {
/*  537 */         this.day_count++;
/*      */       }
/*      */       
/*  540 */       this.is_day = 1;
/*  541 */       if (!this.field_70170_p.func_72935_r()) this.is_day = -1;
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   public void always_do() {
/*  547 */     EntityPlayer p = null;
/*      */ 
/*      */     
/*  550 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1 && 
/*  551 */       func_110143_aJ() < mygetMaxHealth())
/*      */     {
/*  553 */       func_70691_i(2.0F);
/*      */     }
/*      */ 
/*      */     
/*  557 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 0) {
/*  558 */       func_70624_b(null);
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
/*  574 */     if (func_70906_o())
/*      */       return; 
/*  576 */     this.owner_flying = 0;
/*  577 */     if (func_70909_n() && func_70902_q() != null && this.field_70153_n == null && !func_70906_o()) {
/*  578 */       p = (EntityPlayer)func_70902_q();
/*      */       
/*  580 */       if (p.field_71075_bZ.field_75100_b) {
/*  581 */         this.owner_flying = 1;
/*      */         
/*  583 */         setActivity(1);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  589 */     if (this.field_70170_p.field_73012_v.nextInt(50) == 1 && !func_70906_o())
/*      */     {
/*  591 */       if (!this.target_in_sight && this.field_70153_n == null)
/*      */       {
/*  593 */         if (this.field_70170_p.field_73012_v.nextInt(15) == 1) {
/*      */           
/*  595 */           setActivity(1);
/*      */         } else {
/*      */           
/*  598 */           setActivity(0);
/*      */         } 
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void fly_with_rider() {
/*  607 */     EntityLivingBase e = null;
/*      */ 
/*      */     
/*  610 */     if (this.field_70128_L)
/*      */       return; 
/*  612 */     if (func_70906_o())
/*  613 */       return;  if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  615 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */       
/*  617 */       e = findSomethingToAttack();
/*  618 */       if (e != null) {
/*      */         
/*  620 */         setAttacking(1);
/*  621 */         if (func_70068_e((Entity)e) < ((8.0F + e.field_70130_N / 2.0F) * (8.0F + e.field_70130_N / 2.0F))) {
/*      */           
/*  623 */           func_70652_k((Entity)e);
/*  624 */         } else if (func_70068_e((Entity)e) > 100.0D && func_70068_e((Entity)e) < 625.0D && !func_70090_H() && 
/*  625 */           getThePrinceTeenFire() != 0) {
/*  626 */           shoot_something(e.field_70165_t, e.field_70163_u, e.field_70161_v);
/*      */         } 
/*      */       } else {
/*      */         
/*  630 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70629_bd() {
/*  641 */     if (this.field_70153_n != null)
/*  642 */       return;  super.func_70629_bd();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  650 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*      */     
/*  652 */     if (par1EntityLiving == null)
/*      */     {
/*  654 */       return false;
/*      */     }
/*  656 */     if (par1EntityLiving == this)
/*      */     {
/*  658 */       return false;
/*      */     }
/*  660 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*      */       
/*  663 */       return false;
/*      */     }
/*  665 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  668 */       return false;
/*      */     }
/*  670 */     if (MyUtils.isRoyalty((Entity)par1EntityLiving))
/*      */     {
/*  672 */       return false;
/*      */     }
/*      */     
/*  675 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*      */     {
/*  677 */       return true;
/*      */     }
/*  679 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/*      */       
/*  682 */       return true;
/*      */     }
/*  684 */     if (par1EntityLiving instanceof Kraken)
/*      */     {
/*      */       
/*  687 */       return true;
/*      */     }
/*  689 */     if (par1EntityLiving instanceof Leon) {
/*      */       
/*  691 */       Leon l = (Leon)par1EntityLiving;
/*  692 */       if (l.func_70909_n()) return false;
/*      */       
/*  694 */       return true;
/*      */     } 
/*  696 */     if (par1EntityLiving instanceof WaterDragon) {
/*      */       
/*  698 */       WaterDragon l = (WaterDragon)par1EntityLiving;
/*  699 */       if (l.func_70909_n()) return false;
/*      */       
/*  701 */       return true;
/*      */     } 
/*  703 */     if (par1EntityLiving instanceof GammaMetroid) {
/*      */       
/*  705 */       GammaMetroid l = (GammaMetroid)par1EntityLiving;
/*  706 */       if (l.func_70909_n()) return false;
/*      */       
/*  708 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  712 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/*  717 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/*  718 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(25.0D, 20.0D, 25.0D));
/*  719 */     Collections.sort(var5, this.TargetSorter);
/*  720 */     Iterator<?> var2 = var5.iterator();
/*  721 */     Entity var3 = null;
/*  722 */     EntityLivingBase var4 = null;
/*      */     
/*  724 */     while (var2.hasNext()) {
/*      */       
/*  726 */       var3 = (Entity)var2.next();
/*  727 */       var4 = (EntityLivingBase)var3;
/*      */       
/*  729 */       if (isSuitableTarget(var4, false))
/*      */       {
/*  731 */         return var4;
/*      */       }
/*      */     } 
/*  734 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_145773_az() {
/*  741 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  749 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  757 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70056_a(double par1, double par3, double par5, float par7, float par8, int par9) {
/*  769 */     super.func_70056_a(par1, par3, par5, par7, par8, par9);
/*  770 */     this.boatPosRotationIncrements = par9;
/*      */ 
/*      */     
/*  773 */     this.boatX = par1;
/*  774 */     this.boatY = par3;
/*  775 */     this.boatZ = par5;
/*  776 */     this.boatYaw = par7;
/*  777 */     this.boatPitch = par8;
/*  778 */     this.boatYawHead = par7;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70016_h(double par1, double par3, double par5) {
/*  788 */     super.func_70016_h(par1, par3, par5);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  794 */     EntityLivingBase e = null;
/*      */     
/*  796 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  797 */     super.func_70071_h_();
/*      */     
/*  799 */     if (getActivity() != 0) {
/*  800 */       this.field_70145_X = true;
/*      */     } else {
/*  802 */       this.field_70145_X = false;
/*      */     } 
/*      */     
/*  805 */     if (!this.field_70170_p.field_72995_K) {
/*  806 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  807 */         int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  808 */         if (i == 0) this.head1dir = 2; 
/*  809 */         if (i == 1) this.head1dir = -2; 
/*  810 */         if (i == 2) this.head1dir = 0; 
/*      */       } 
/*  812 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  813 */         int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  814 */         if (i == 0) this.head2dir = 2; 
/*  815 */         if (i == 1) this.head2dir = -2; 
/*  816 */         if (i == 2) this.head2dir = 0; 
/*      */       } 
/*  818 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  819 */         int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  820 */         if (i == 0) this.head3dir = 2; 
/*  821 */         if (i == 1) this.head3dir = -2; 
/*  822 */         if (i == 2) this.head3dir = 0; 
/*      */       } 
/*  824 */       this.head1ext += this.head1dir;
/*  825 */       if (this.head1ext < 0) this.head1ext = 0; 
/*  826 */       if (this.head1ext > 60) this.head1ext = 60; 
/*  827 */       this.head2ext += this.head2dir;
/*  828 */       if (this.head2ext < 0) this.head2ext = 0; 
/*  829 */       if (this.head2ext > 60) this.head2ext = 60; 
/*  830 */       this.head3ext += this.head3dir;
/*  831 */       if (this.head3ext < 0) this.head3ext = 0; 
/*  832 */       if (this.head3ext > 60) this.head3ext = 60;
/*      */       
/*  834 */       setHead1Ext(this.head1ext);
/*  835 */       setHead2Ext(this.head2ext);
/*  836 */       setHead3Ext(this.head3ext);
/*      */     } 
/*      */     
/*  839 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*      */     
/*  841 */     if (getActivity() == 1) {
/*  842 */       this.wing_sound++;
/*  843 */       if (this.wing_sound > 20) {
/*      */         
/*  845 */         if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 0.5F, 1.0F); 
/*  846 */         this.wing_sound = 0;
/*      */       } 
/*      */     } 
/*      */     
/*  850 */     if (func_70090_H()) {
/*  851 */       this.field_70181_x += 0.07D;
/*      */     }
/*      */     
/*  854 */     if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  856 */     if (getActivity() == 0 && func_70909_n() && func_70902_q() != null && !func_70906_o()) {
/*  857 */       e = func_70902_q();
/*      */       
/*  859 */       if (func_70068_e((Entity)e) > 400.0D)
/*      */       {
/*  861 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void fly_without_rider() {
/*  869 */     int xdir = 1;
/*  870 */     int zdir = 1;
/*      */     
/*  872 */     int keep_trying = 10;
/*      */ 
/*      */     
/*  875 */     int do_new = 0;
/*  876 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*      */     
/*  878 */     int has_owner = 0;
/*  879 */     EntityLivingBase e = null;
/*  880 */     double speed_factor = 0.5D;
/*  881 */     double var1 = 0.0D;
/*  882 */     double var3 = 0.0D;
/*  883 */     double var5 = 0.0D;
/*      */ 
/*      */ 
/*      */     
/*  887 */     double gh = 1.25D;
/*  888 */     double obstruction_factor = 0.0D;
/*  889 */     double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */     
/*  891 */     int toofar = 0;
/*      */ 
/*      */     
/*  894 */     if (this.currentFlightTarget == null) {
/*  895 */       do_new = 1;
/*  896 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     } 
/*  898 */     if (this.field_70153_n != null) {
/*      */       return;
/*      */     }
/*  901 */     if (func_70909_n() && func_70902_q() != null) {
/*  902 */       e = func_70902_q();
/*  903 */       has_owner = 1;
/*  904 */       ox = e.field_70165_t;
/*  905 */       oy = e.field_70163_u;
/*  906 */       oz = e.field_70161_v;
/*  907 */       if (func_70068_e((Entity)e) > 400.0D) {
/*  908 */         toofar = 1;
/*  909 */         this.target_in_sight = false;
/*  910 */         setAttacking(0);
/*  911 */         func_70904_g(false);
/*  912 */         this.flyaway = 0;
/*  913 */         do_new = 1;
/*      */       } 
/*      */     } 
/*      */     
/*  917 */     if (func_70906_o())
/*      */       return; 
/*  919 */     if (this.field_70163_u < this.currentFlightTarget.field_71572_b + 2.0D) {
/*  920 */       this.field_70181_x *= 0.7D;
/*  921 */     } else if (this.field_70163_u > this.currentFlightTarget.field_71572_b - 2.0D) {
/*  922 */       this.field_70181_x *= 0.5D;
/*      */     } else {
/*  924 */       this.field_70181_x *= 0.61D;
/*      */     } 
/*      */ 
/*      */     
/*  928 */     if (this.field_70170_p.field_73012_v.nextInt(300) == 1) do_new = 1; 
/*  929 */     if (this.flyaway > 0) this.flyaway--;
/*      */ 
/*      */     
/*  932 */     if (toofar == 0 && this.flyaway == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(7) == 1) {
/*      */ 
/*      */       
/*  935 */       e = func_70638_az();
/*  936 */       if (e != null && !e.func_70089_S()) {
/*  937 */         func_70624_b(null);
/*  938 */         e = null;
/*      */       } 
/*      */       
/*  941 */       if (e == null) {
/*  942 */         e = findSomethingToAttack();
/*      */       }
/*  944 */       if (e != null) {
/*      */         
/*  946 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/*  947 */           setActivity(1);
/*  948 */           setAttacking(0);
/*  949 */           this.target_in_sight = false;
/*  950 */           do_new = 0;
/*  951 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*      */         } else {
/*      */           
/*  954 */           setActivity(1);
/*  955 */           setAttacking(1);
/*  956 */           this.target_in_sight = true;
/*  957 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/*      */           
/*  959 */           do_new = 0;
/*  960 */           if (func_70068_e((Entity)e) < ((8.0F + e.field_70130_N / 2.0F) * (8.0F + e.field_70130_N / 2.0F))) {
/*  961 */             func_70652_k((Entity)e);
/*  962 */             this.flyaway = 5 + this.field_70170_p.field_73012_v.nextInt(15);
/*  963 */             do_new = 1;
/*  964 */           } else if (func_70068_e((Entity)e) < 400.0D && !func_70090_H()) {
/*      */             
/*  966 */             if (getThePrinceTeenFire() != 0 && this.field_70170_p.field_73012_v.nextInt(2) == 1) {
/*  967 */               shoot_something(e.field_70165_t, e.field_70163_u, e.field_70161_v);
/*      */             }
/*      */           }
/*      */         
/*      */         } 
/*      */       } else {
/*      */         
/*  974 */         this.target_in_sight = false;
/*  975 */         this.flyaway = 0;
/*  976 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  981 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*  982 */       do_new = 1;
/*      */     }
/*      */ 
/*      */     
/*  986 */     if ((do_new != 0 && !this.target_in_sight) || (do_new != 0 && this.flyaway != 0)) {
/*      */       
/*  988 */       Block bid = Blocks.field_150348_b;
/*  989 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/*  990 */         int gox = (int)this.field_70165_t;
/*  991 */         int goy = (int)this.field_70163_u;
/*  992 */         int goz = (int)this.field_70161_v;
/*  993 */         if (has_owner == 1) {
/*  994 */           gox = (int)ox;
/*  995 */           goy = (int)oy;
/*  996 */           goz = (int)oz;
/*  997 */           if (this.owner_flying == 0) {
/*  998 */             zdir = this.field_70170_p.field_73012_v.nextInt(14) + 5;
/*  999 */             xdir = this.field_70170_p.field_73012_v.nextInt(14) + 5;
/*      */           } else {
/* 1001 */             zdir = this.field_70170_p.field_73012_v.nextInt(6);
/* 1002 */             xdir = this.field_70170_p.field_73012_v.nextInt(6);
/*      */           } 
/*      */         } else {
/* 1005 */           zdir = this.field_70170_p.field_73012_v.nextInt(10) + 16;
/* 1006 */           xdir = this.field_70170_p.field_73012_v.nextInt(10) + 16;
/*      */         } 
/* 1008 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) zdir = -zdir; 
/* 1009 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) xdir = -xdir; 
/* 1010 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
/* 1011 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 1012 */         if (bid == Blocks.field_150350_a && 
/* 1013 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 1014 */           bid = Blocks.field_150348_b;
/*      */         }
/*      */         
/* 1017 */         keep_trying--;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1025 */     obstruction_factor = 0.0D;
/* 1026 */     int dist = 2;
/* 1027 */     dist += (int)(velocity * 4.0D);
/*      */     
/* 1029 */     for (int k = 1; k < dist; k++) {
/* 1030 */       for (int i = 1; i < dist * 2; i++) {
/* 1031 */         double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1032 */         double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1033 */         Block bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 1034 */         if (bid != Blocks.field_150350_a) {
/* 1035 */           obstruction_factor += 0.05D;
/*      */         }
/*      */       } 
/*      */     } 
/* 1039 */     this.field_70181_x += obstruction_factor * 0.05D;
/* 1040 */     this.field_70163_u += obstruction_factor * 0.05D;
/*      */ 
/*      */     
/* 1043 */     speed_factor = 0.5D;
/* 1044 */     var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 1045 */     var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 1046 */     var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 1047 */     if (this.owner_flying != 0) {
/* 1048 */       speed_factor = 1.75D;
/* 1049 */       if (func_70909_n() && func_70902_q() != null) {
/* 1050 */         e = func_70902_q();
/* 1051 */         if (func_70068_e((Entity)e) > 64.0D) {
/* 1052 */           speed_factor = 3.5D;
/*      */         }
/*      */       } 
/*      */     } 
/* 1056 */     this.field_70159_w += (Math.signum(var1) - this.field_70159_w) * 0.15D * speed_factor;
/* 1057 */     this.field_70181_x += (Math.signum(var3) - this.field_70181_x) * 0.21D * speed_factor;
/* 1058 */     this.field_70179_y += (Math.signum(var5) - this.field_70179_y) * 0.15D * speed_factor;
/* 1059 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 1060 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 1061 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*      */     
/* 1063 */     this.field_70177_z += var8 / 4.0F;
/* 1064 */     func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/* 1074 */     List<Entity> list = null;
/* 1075 */     Entity listEntity = null;
/*      */ 
/*      */ 
/*      */     
/* 1079 */     double d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/* 1080 */     double d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1086 */     double obstruction_factor = 0.0D;
/*      */     
/* 1088 */     double relative_g = 0.0D;
/*      */     
/* 1090 */     double max_speed = 0.95D;
/* 1091 */     double gh = 1.0D;
/*      */ 
/*      */ 
/*      */     
/* 1095 */     double rt = 0.0D;
/*      */     
/* 1097 */     double pi = 3.1415926545D;
/* 1098 */     double deltav = 0.0D;
/*      */ 
/*      */ 
/*      */     
/* 1102 */     int dist = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1107 */     if (getActivity() == 0) {
/*      */       
/* 1109 */       super.func_70636_d();
/*      */     
/*      */     }
/* 1112 */     else if (this.field_70128_L) {
/* 1113 */       super.func_70636_d();
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1118 */     if (this.field_70128_L) {
/*      */       return;
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
/* 1131 */     if (this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1136 */       if (this.boatPosRotationIncrements > 0 && getActivity() != 0) {
/*      */         
/* 1138 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/* 1139 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/* 1140 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/* 1141 */         func_70107_b(d4, d5, d11);
/*      */         
/* 1143 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/* 1144 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/* 1145 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/* 1146 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/* 1147 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/* 1148 */         this.field_70759_as = this.field_70177_z;
/*      */         
/* 1150 */         this.boatPosRotationIncrements--;
/*      */       } 
/*      */     } else {
/*      */       
/* 1154 */       if (getActivity() != 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1160 */         if (this.fireballticker > 0) this.fireballticker--;
/*      */         
/* 1162 */         if (this.field_70153_n != null) {
/* 1163 */           EntityPlayer pp = (EntityPlayer)this.field_70153_n;
/*      */ 
/*      */ 
/*      */           
/* 1167 */           if (this.field_70159_w < -2.0D) this.field_70159_w = -2.0D; 
/* 1168 */           if (this.field_70159_w > 2.0D) this.field_70159_w = 2.0D; 
/* 1169 */           if (this.field_70179_y < -2.0D) this.field_70179_y = -2.0D; 
/* 1170 */           if (this.field_70179_y > 2.0D) this.field_70179_y = 2.0D; 
/* 1171 */           double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */           
/* 1174 */           gh = 1.25D;
/* 1175 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)((float)this.field_70163_u - (float)gh), (int)this.field_70161_v);
/* 1176 */           if (bid != Blocks.field_150350_a) {
/* 1177 */             this.field_70181_x += 0.03D;
/* 1178 */             this.field_70163_u += 0.1D;
/*      */           } else {
/*      */             
/* 1181 */             this.field_70181_x -= 0.018D;
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1188 */           obstruction_factor = 0.0D;
/* 1189 */           dist = 3;
/* 1190 */           dist += (int)(velocity * 7.0D);
/*      */           
/* 1192 */           for (int k = 1; k < dist; k++) {
/* 1193 */             for (int i = 1; i < dist * 2; i++) {
/* 1194 */               double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1195 */               double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1196 */               bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 1197 */               if (bid != Blocks.field_150350_a) {
/* 1198 */                 obstruction_factor += 0.05D;
/*      */               }
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1205 */           this.field_70181_x += obstruction_factor * 0.07D;
/* 1206 */           this.field_70163_u += obstruction_factor * 0.07D;
/* 1207 */           if (this.field_70181_x > 2.0D) this.field_70181_x = 2.0D;
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
/* 1218 */           double d4 = this.field_70153_n.field_70177_z;
/* 1219 */           d4 %= 360.0D;
/* 1220 */           for (; d4 < 0.0D; d4 += 360.0D);
/* 1221 */           double d5 = this.field_70177_z;
/* 1222 */           d5 %= 360.0D;
/* 1223 */           for (; d5 < 0.0D; d5 += 360.0D);
/* 1224 */           relative_g = (d4 - d5) % 180.0D;
/* 1225 */           for (; relative_g < 0.0D; relative_g += 180.0D);
/* 1226 */           if (relative_g > 90.0D) relative_g -= 180.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1233 */           if (velocity > 0.01D) {
/*      */             
/* 1235 */             d4 = 1.85D - velocity;
/* 1236 */             d4 = Math.abs(d4);
/* 1237 */             if (d4 < 0.01D) d4 = 0.01D; 
/* 1238 */             if (d4 > 0.9D) d4 = 0.9D; 
/* 1239 */             this.field_70177_z = this.field_70153_n.field_70177_z + (float)(relative_g * d4);
/*      */           } else {
/*      */             
/* 1242 */             this.field_70177_z = this.field_70153_n.field_70177_z;
/*      */           } 
/* 1244 */           relative_g = Math.abs(relative_g) * velocity;
/* 1245 */           if (relative_g > 50.0D) relative_g = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1250 */           this.field_70125_A = 2.0F * (float)velocity;
/* 1251 */           func_70101_b(this.field_70177_z, this.field_70125_A);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1257 */           double newvelocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1265 */           double rr = Math.atan2(this.field_70153_n.field_70179_y, this.field_70153_n.field_70159_w);
/* 1266 */           double rhm = Math.atan2(this.field_70179_y, this.field_70159_w);
/* 1267 */           double rhdir = Math.toRadians(((this.field_70153_n.field_70177_z + 90.0F) % 360.0F));
/* 1268 */           rt = 0.0D;
/* 1269 */           pi = 3.1415926545D;
/* 1270 */           deltav = 0.0D;
/* 1271 */           float im = pp.field_70701_bs;
/*      */ 
/*      */           
/* 1274 */           if (OreSpawnMain.flyup_keystate != 0) {
/* 1275 */             this.field_70181_x += 0.035D;
/* 1276 */             this.field_70181_x += velocity * 0.046D;
/*      */           } 
/*      */ 
/*      */           
/* 1280 */           double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
/* 1281 */           if (rdv > pi) rdv -= pi * 2.0D; 
/* 1282 */           rdv = Math.abs(rdv);
/* 1283 */           if (Math.abs(newvelocity) < 0.01D) rdv = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1291 */           if (rdv > 1.5D) newvelocity = -newvelocity;
/*      */           
/* 1293 */           if (Math.abs(im) > 0.001F) {
/* 1294 */             if (im > 0.0F) {
/* 1295 */               deltav = 0.025D;
/* 1296 */               if (max_speed > 1.0D) deltav += 0.05D; 
/* 1297 */               if (this.deltasmooth < 0.0F) this.deltasmooth = 0.0F; 
/* 1298 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1299 */               if (this.deltasmooth > deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } else {
/* 1302 */               max_speed = 0.35D;
/*      */               
/* 1304 */               deltav = -0.02D;
/* 1305 */               if (this.deltasmooth > 0.0F) this.deltasmooth = 0.0F; 
/* 1306 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1307 */               if (this.deltasmooth < deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } 
/* 1310 */             newvelocity += this.deltasmooth;
/* 1311 */             if (newvelocity >= 0.0D) {
/* 1312 */               if (newvelocity > max_speed) newvelocity = max_speed; 
/* 1313 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1314 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */             } else {
/* 1316 */               if (newvelocity < -max_speed) newvelocity = -max_speed; 
/* 1317 */               newvelocity = -newvelocity;
/* 1318 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/* 1319 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/*      */             }
/*      */           
/*      */           }
/* 1323 */           else if (newvelocity >= 0.0D) {
/* 1324 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1325 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */           } else {
/* 1327 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/* 1328 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1333 */           if (this.fireballticker == 0 && (pp.field_70702_br < -0.001F || pp.field_70702_br > 0.001F)) {
/*      */             
/* 1335 */             double yoff = 1.5D;
/* 1336 */             double xzoff = 7.5D;
/*      */             
/* 1338 */             this.which_attack++;
/* 1339 */             if (this.which_attack > 2) this.which_attack = 0;
/*      */ 
/*      */             
/* 1342 */             if (this.which_attack == 0) {
/* 1343 */               yoff += (getHead1Ext() * 0.04F);
/* 1344 */               double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians((this.field_70177_z - 10.0F)));
/* 1345 */               double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians((this.field_70177_z - 10.0F)));
/* 1346 */               BetterFireball bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, 0.0D, 0.0D, 0.0D);
/* 1347 */               bf.setNotMe();
/* 1348 */               bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1349 */               cx = Math.cos(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1350 */               cz = Math.sin(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1351 */               double cy = -Math.sin(Math.toRadians(pp.field_70125_A));
/*      */               
/* 1353 */               double d3 = MathHelper.func_76133_a(cx * cx + cy * cy + cz * cz);
/* 1354 */               bf.field_70232_b = cx / d3 * 0.1D;
/* 1355 */               bf.field_70233_c = cy / d3 * 0.1D;
/* 1356 */               bf.field_70230_d = cz / d3 * 0.1D;
/* 1357 */               bf.field_70159_w = this.field_70159_w;
/* 1358 */               bf.field_70181_x = this.field_70181_x;
/* 1359 */               bf.field_70179_y = this.field_70179_y;
/* 1360 */               bf.field_70165_t -= this.field_70159_w * 3.0D;
/* 1361 */               bf.field_70163_u -= this.field_70181_x * 3.0D;
/* 1362 */               bf.field_70161_v -= this.field_70179_y * 3.0D;
/* 1363 */               this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1364 */               this.field_70170_p.func_72838_d((Entity)bf);
/*      */             } 
/*      */             
/* 1367 */             if (this.which_attack == 1) {
/* 1368 */               yoff += (getHead3Ext() * 0.04F);
/* 1369 */               double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians((this.field_70177_z + 10.0F)));
/* 1370 */               double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians((this.field_70177_z + 10.0F)));
/* 1371 */               IceBall var2 = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1372 */               var2.func_70012_b(cx, this.field_70163_u + yoff, cz, pp.field_70177_z + 90.0F, pp.field_70125_A);
/* 1373 */               var2.setIceMaker(1);
/* 1374 */               double var3 = Math.cos(Math.toRadians((pp.field_70177_z + 90.0F)));
/* 1375 */               double var5 = -Math.sin(Math.toRadians(pp.field_70125_A));
/* 1376 */               double var77 = Math.sin(Math.toRadians((pp.field_70177_z + 90.0F)));
/* 1377 */               float var9 = MathHelper.func_76133_a(var3 * var3 + var77 * var77) * 0.2F;
/* 1378 */               var2.func_70186_c(var3, var5 + var9, var77, 1.4F, 5.0F);
/* 1379 */               var2.field_70165_t -= this.field_70159_w * 3.0D;
/* 1380 */               var2.field_70163_u -= this.field_70181_x * 3.0D;
/* 1381 */               var2.field_70161_v -= this.field_70179_y * 3.0D;
/* 1382 */               var2.field_70159_w *= 2.0D;
/* 1383 */               var2.field_70181_x *= 2.0D;
/* 1384 */               var2.field_70179_y *= 2.0D;
/* 1385 */               this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1386 */               this.field_70170_p.func_72838_d((Entity)var2);
/*      */             } 
/*      */             
/* 1389 */             if (this.which_attack == 2) {
/* 1390 */               yoff += (getHead2Ext() * 0.04F);
/* 1391 */               double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1392 */               double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1393 */               ThunderBolt lb = new ThunderBolt(this.field_70170_p, (EntityLivingBase)pp);
/* 1394 */               lb.func_70012_b(cx, this.field_70163_u + yoff, cz, pp.field_70177_z + 90.0F, pp.field_70125_A);
/* 1395 */               lb.field_70159_w *= 3.0D;
/* 1396 */               lb.field_70181_x *= 3.0D;
/* 1397 */               lb.field_70179_y *= 3.0D;
/* 1398 */               this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1399 */               this.field_70170_p.func_72838_d((Entity)lb);
/*      */             } 
/* 1401 */             this.fireballticker = 10;
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1406 */           func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */ 
/*      */           
/* 1409 */           this.field_70159_w *= 0.985D;
/* 1410 */           this.field_70181_x *= 0.94D;
/* 1411 */           this.field_70179_y *= 0.985D;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1416 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1418 */             list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b(3.25D, 4.0D, 3.25D));
/*      */             
/* 1420 */             if (list != null && !list.isEmpty())
/*      */             {
/* 1422 */               for (int l = 0; l < list.size(); l++) {
/*      */                 
/* 1424 */                 listEntity = list.get(l);
/*      */                 
/* 1426 */                 if (listEntity != this.field_70153_n && !listEntity.field_70128_L && listEntity.func_70104_M())
/*      */                 {
/* 1428 */                   listEntity.func_70108_f((Entity)this);
/*      */                 }
/*      */               } 
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1436 */           fly_with_rider();
/*      */           
/* 1438 */           if (this.field_70153_n != null && this.field_70153_n.field_70128_L)
/*      */           {
/* 1440 */             this.field_70153_n = null;
/*      */           }
/*      */         } else {
/*      */           
/* 1444 */           fly_without_rider();
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1450 */       always_do();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70043_V() {
/* 1457 */     if (this.field_70153_n != null) {
/*      */ 
/*      */ 
/*      */       
/* 1461 */       float f = 0.65F;
/* 1462 */       this.field_70153_n.func_70107_b(this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + func_70042_X() + this.field_70153_n.func_70033_W(), this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)));
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
/*      */   protected void func_70908_e(boolean par1) {
/* 1474 */     String s = "heart";
/*      */     
/* 1476 */     if (!par1)
/*      */     {
/* 1478 */       s = "smoke";
/*      */     }
/*      */     
/* 1481 */     for (int i = 0; i < 20; i++) {
/*      */       
/* 1483 */       double d0 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1484 */       double d1 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1485 */       double d2 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1486 */       this.field_70170_p.func_72869_a(s, this.field_70165_t + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), this.field_70163_u + 0.5D + this.field_70146_Z.nextFloat() * 1.5D, this.field_70161_v + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), d0, d1, d2);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 1497 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */     
/* 1499 */     if (var2 != null && 
/* 1500 */       var2.field_77994_a <= 0) {
/* 1501 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 1502 */       var2 = null;
/*      */     } 
/*      */ 
/*      */     
/* 1506 */     if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150484_ah) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/* 1507 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/* 1509 */         func_70903_f(true);
/* 1510 */         func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 1511 */         func_70908_e(true);
/* 1512 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 1513 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/* 1514 */         this.kill_count = 1000;
/* 1515 */         this.day_count = 1000;
/*      */       } 
/*      */ 
/*      */       
/* 1519 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1520 */         var2.field_77994_a--;
/* 1521 */         if (var2.field_77994_a <= 0) {
/* 1522 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/* 1525 */       return true;
/*      */     } 
/*      */     
/* 1528 */     if (func_70909_n()) {
/*      */       
/* 1530 */       if (!func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/* 1531 */         return false;
/*      */       }
/*      */       
/* 1534 */       if (var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/* 1535 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1537 */           par1EntityPlayer.func_70078_a((Entity)this);
/*      */           
/* 1539 */           setActivity(1);
/* 1540 */           func_70904_g(false);
/*      */         } 
/* 1542 */         return true;
/*      */       } 
/*      */       
/* 1545 */       if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/* 1546 */         if (this.field_70170_p.field_72995_K) {
/* 1547 */           func_70908_e(true);
/* 1548 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1551 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 1552 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         }
/* 1554 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1555 */           var2.field_77994_a--;
/* 1556 */           if (var2.field_77994_a <= 0) {
/* 1557 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1560 */         return true;
/*      */       } 
/*      */       
/* 1563 */       if (var2 != null && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && var2.func_77973_b() instanceof ItemFood) {
/*      */ 
/*      */         
/* 1566 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1568 */           ItemFood var3 = (ItemFood)var2.func_77973_b();
/*      */           
/* 1570 */           if (mygetMaxHealth() > func_110143_aJ())
/*      */           {
/* 1572 */             func_70691_i((var3.func_150905_g(var2) * 10));
/*      */           }
/*      */           
/* 1575 */           func_70908_e(true);
/* 1576 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1579 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1581 */           var2.field_77994_a--;
/* 1582 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1584 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1587 */         return true;
/*      */       } 
/*      */ 
/*      */       
/* 1591 */       if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150432_aD) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/*      */         
/* 1593 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1595 */           func_70908_e(true);
/* 1596 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/* 1597 */           setThePrinceTeenFire(0);
/* 1598 */           String healthMessage = new String();
/* 1599 */           healthMessage = String.format("Fireballs extinguished.", new Object[0]);
/* 1600 */           par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */         } 
/* 1602 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1604 */           var2.field_77994_a--;
/* 1605 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1607 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1610 */         return true;
/*      */       } 
/*      */       
/* 1613 */       if (var2 != null && var2.func_77973_b() == Items.field_151033_d && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/*      */         
/* 1615 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1617 */           func_70908_e(true);
/* 1618 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/* 1619 */           setThePrinceTeenFire(1);
/* 1620 */           String healthMessage = new String();
/* 1621 */           healthMessage = String.format("Fireballs lit!", new Object[0]);
/* 1622 */           par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */         } 
/* 1624 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1626 */           var2.field_77994_a--;
/* 1627 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1629 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1632 */         return true;
/*      */       } 
/*      */ 
/*      */       
/* 1636 */       if (var2 != null && var2.func_77973_b() == Items.field_151045_i && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && !this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */         
/* 1640 */         Entity ent = null;
/* 1641 */         ThePrince d = null;
/* 1642 */         ent = spawnCreature(this.field_70170_p, "The Prince", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 1643 */         if (ent != null) {
/* 1644 */           d = (ThePrince)ent;
/* 1645 */           if (func_70909_n()) {
/* 1646 */             d.func_70903_f(true);
/* 1647 */             d.func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 1648 */             d.set_ok_to_grow();
/*      */           } 
/* 1650 */           func_70106_y();
/*      */         } 
/* 1652 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1654 */           var2.field_77994_a--;
/* 1655 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1657 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1660 */         return true;
/*      */       } 
/*      */       
/* 1663 */       if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */         
/* 1665 */         func_94058_c(var2.func_82833_r());
/* 1666 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1668 */           var2.field_77994_a--;
/* 1669 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1671 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1674 */         return true;
/*      */       } 
/*      */       
/* 1677 */       if (var2 != null && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */         
/* 1679 */         if (!func_70906_o()) {
/* 1680 */           func_70904_g(true);
/* 1681 */           setActivity(0);
/*      */         } else {
/* 1683 */           func_70904_g(false);
/* 1684 */           setActivity(0);
/*      */         } 
/* 1686 */         return true;
/*      */       } 
/*      */     } 
/*      */     
/* 1690 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/* 1698 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/* 1704 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/* 1709 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1710 */       return;  this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public int getActivity() {
/* 1715 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/* 1720 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1721 */       return;  this.field_70180_af.func_75692_b(21, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getThePrinceTeenFire() {
/* 1727 */     return this.field_70180_af.func_75679_c(24);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setThePrinceTeenFire(int par1) {
/* 1733 */     if (this.field_70170_p.field_72995_K)
/* 1734 */       return;  this.field_70180_af.func_75692_b(24, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 1743 */     Entity var8 = null;
/*      */ 
/*      */     
/* 1746 */     var8 = EntityList.func_75620_a(par1, par0World);
/*      */     
/* 1748 */     if (var8 != null) {
/*      */ 
/*      */       
/* 1751 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1754 */       par0World.func_72838_d(var8);
/*      */       
/* 1756 */       ((EntityLiving)var8).func_70642_aH();
/*      */     } 
/*      */     
/* 1759 */     return var8;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 1767 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/* 1775 */     if (func_104002_bU()) return false; 
/* 1776 */     if (this.field_70153_n != null) {
/* 1777 */       return false;
/*      */     }
/* 1779 */     if (func_70909_n()) {
/* 1780 */       return false;
/*      */     }
/* 1782 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 1793 */     super.func_70014_b(par1NBTTagCompound);
/*      */     
/* 1795 */     par1NBTTagCompound.func_74768_a("ThePrinceTeenAttacking", getAttacking());
/* 1796 */     par1NBTTagCompound.func_74768_a("ThePrinceTeenActivity", getActivity());
/* 1797 */     par1NBTTagCompound.func_74768_a("ThePrinceTeenFire", getThePrinceTeenFire());
/* 1798 */     par1NBTTagCompound.func_74768_a("SpyroKill", this.kill_count);
/* 1799 */     par1NBTTagCompound.func_74768_a("SpyroDay", this.day_count);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 1809 */     super.func_70037_a(par1NBTTagCompound);
/*      */     
/* 1811 */     setAttacking(par1NBTTagCompound.func_74762_e("ThePrinceTeenAttacking"));
/* 1812 */     setActivity(par1NBTTagCompound.func_74762_e("ThePrinceTeenActivity"));
/* 1813 */     setThePrinceTeenFire(par1NBTTagCompound.func_74762_e("ThePrinceTeenFire"));
/* 1814 */     this.kill_count = par1NBTTagCompound.func_74762_e("SpyroKill");
/* 1815 */     this.day_count = par1NBTTagCompound.func_74762_e("SpyroDay");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void shoot_something(double x, double y, double z) {
/* 1821 */     double rr = 0.0D;
/* 1822 */     double rhdir = 0.0D;
/* 1823 */     double rdd = 0.0D;
/* 1824 */     double pi = 3.1415926545D;
/*      */     
/* 1826 */     int which = this.field_70170_p.field_73012_v.nextInt(3);
/*      */ 
/*      */ 
/*      */     
/* 1830 */     if (which == 0) {
/*      */ 
/*      */       
/* 1833 */       rr = Math.atan2(z - this.field_70161_v, x - this.field_70165_t);
/* 1834 */       rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */       
/* 1836 */       rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 1837 */       if (rdd > pi) rdd -= pi * 2.0D; 
/* 1838 */       rdd = Math.abs(rdd);
/*      */       
/* 1840 */       if (rdd < 0.5D) {
/* 1841 */         firecanon(x, y, z);
/*      */       }
/* 1843 */     } else if (which == 1) {
/*      */ 
/*      */ 
/*      */       
/* 1847 */       rr = Math.atan2(z - this.field_70161_v, x - this.field_70165_t);
/* 1848 */       rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */       
/* 1850 */       rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 1851 */       if (rdd > pi) rdd -= pi * 2.0D; 
/* 1852 */       rdd = Math.abs(rdd);
/*      */       
/* 1854 */       if (rdd < 0.5D) {
/* 1855 */         firecanonl(x, y, z);
/*      */       
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1861 */       rr = Math.atan2(z - this.field_70161_v, x - this.field_70165_t);
/* 1862 */       rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */       
/* 1864 */       rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 1865 */       if (rdd > pi) rdd -= pi * 2.0D; 
/* 1866 */       rdd = Math.abs(rdd);
/*      */       
/* 1868 */       if (rdd < 0.5D) {
/* 1869 */         firecanoni(x, y, z);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanon(double x, double y, double z) {
/* 1877 */     double yoff = 3.5D;
/* 1878 */     double xzoff = 6.0D;
/*      */ 
/*      */     
/* 1881 */     BetterFireball bf = null;
/*      */     
/* 1883 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1884 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1885 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1886 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1887 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1888 */     bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, x - cx + r1, y + 0.25D - this.field_70163_u + yoff + r2, z - cz + r3);
/* 1889 */     bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 1890 */     bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1891 */     bf.setBig();
/* 1892 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1893 */     this.field_70170_p.func_72838_d((Entity)bf);
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanonl(double x, double y, double z) {
/* 1898 */     double yoff = 3.5D;
/* 1899 */     double xzoff = 6.0D;
/*      */ 
/*      */ 
/*      */     
/* 1903 */     double var3 = 0.0D;
/* 1904 */     double var5 = 0.0D;
/* 1905 */     double var7 = 0.0D;
/* 1906 */     float var9 = 0.0F;
/* 1907 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1908 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1910 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1912 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1913 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1914 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1915 */     ThunderBolt lb = new ThunderBolt(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1916 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1917 */     var3 = x - lb.field_70165_t;
/* 1918 */     var5 = y + 0.25D - lb.field_70163_u;
/* 1919 */     var7 = z - lb.field_70161_v;
/* 1920 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1921 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1922 */     lb.field_70159_w *= 3.0D;
/* 1923 */     lb.field_70181_x *= 3.0D;
/* 1924 */     lb.field_70179_y *= 3.0D;
/* 1925 */     this.field_70170_p.func_72838_d((Entity)lb);
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanoni(double x, double y, double z) {
/* 1930 */     double yoff = 3.5D;
/* 1931 */     double xzoff = 6.0D;
/*      */ 
/*      */ 
/*      */     
/* 1935 */     double var3 = 0.0D;
/* 1936 */     double var5 = 0.0D;
/* 1937 */     double var7 = 0.0D;
/* 1938 */     float var9 = 0.0F;
/* 1939 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1940 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1942 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1944 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1945 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1946 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1947 */     IceBall lb = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1948 */     lb.setIceMaker(1);
/* 1949 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1950 */     var3 = x - lb.field_70165_t;
/* 1951 */     var5 = y + 0.25D - lb.field_70163_u;
/* 1952 */     var7 = z - lb.field_70161_v;
/* 1953 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1954 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1955 */     lb.field_70159_w *= 3.0D;
/* 1956 */     lb.field_70181_x *= 3.0D;
/* 1957 */     lb.field_70179_y *= 3.0D;
/* 1958 */     this.field_70170_p.func_72838_d((Entity)lb);
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ThePrinceTeen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */