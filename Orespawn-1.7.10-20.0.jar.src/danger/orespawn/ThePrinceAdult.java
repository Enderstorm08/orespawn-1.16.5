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
/*      */ 
/*      */ public class ThePrinceAdult
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
/*   90 */   private float moveSpeed = 0.36F;
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
/*  102 */   private int growcounter = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ThePrinceAdult(World par1World) {
/*  110 */     super(par1World);
/*      */     
/*  112 */     func_70105_a(6.25F, 10.25F);
/*  113 */     func_70661_as().func_75491_a(true);
/*  114 */     this.field_70728_aV = 3000;
/*  115 */     this.field_70174_ab = 1000;
/*  116 */     this.field_70178_ae = true;
/*  117 */     func_70904_g(false);
/*  118 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  119 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 1.1F, 12.0F, 2.0F));
/*  120 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false));
/*  121 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIWander((EntityCreature)this, 0.75F));
/*  122 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 20.0F));
/*  123 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  124 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLiving.class, 0, true, false, IMob.field_82192_a)); 
/*  125 */     this.field_70715_bh.func_75776_a(2, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  126 */     this.field_70153_n = null;
/*  127 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  128 */     this.renderdata = new RenderInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ThePrinceAdult(World par1World, double par2, double par4, double par6) {
/*  134 */     this(par1World);
/*  135 */     func_70107_b(par2, par4 + this.field_70129_M, par6);
/*  136 */     this.field_70159_w = 0.0D;
/*  137 */     this.field_70181_x = 0.0D;
/*  138 */     this.field_70179_y = 0.0D;
/*  139 */     this.field_70169_q = par2;
/*  140 */     this.field_70167_r = par4;
/*  141 */     this.field_70166_s = par6;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  146 */     super.func_110147_ax();
/*  147 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  148 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  149 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  150 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(100.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean shouldRiderSit() {
/*  159 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getTrackingRange() {
/*  164 */     return 64;
/*      */   }
/*      */   
/*      */   public int getUpdateFrequency() {
/*  168 */     return 10;
/*      */   }
/*      */   
/*      */   public boolean sendsVelocityUpdates() {
/*  172 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getHead1Ext() {
/*  177 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */   
/*      */   public int getHead2Ext() {
/*  181 */     return this.field_70180_af.func_75679_c(23);
/*      */   }
/*      */   
/*      */   public int getHead3Ext() {
/*  185 */     return this.field_70180_af.func_75679_c(25);
/*      */   }
/*      */   
/*      */   public void setHead1Ext(int par1) {
/*  189 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/*  190 */       return;  this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*      */   }
/*      */   
/*      */   public void setHead2Ext(int par1) {
/*  194 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/*  195 */       return;  this.field_70180_af.func_75692_b(23, Integer.valueOf(par1));
/*      */   }
/*      */   
/*      */   public void setHead3Ext(int par1) {
/*  199 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/*  200 */       return;  this.field_70180_af.func_75692_b(25, Integer.valueOf(par1));
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
/*  213 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  218 */     super.func_70088_a();
/*  219 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(0));
/*  220 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(0));
/*  221 */     this.field_70180_af.func_75682_a(24, Integer.valueOf(1));
/*  222 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(0));
/*  223 */     this.field_70180_af.func_75682_a(23, Integer.valueOf(0));
/*  224 */     this.field_70180_af.func_75682_a(25, Integer.valueOf(0));
/*  225 */     setActivity(0);
/*  226 */     setAttacking(0);
/*  227 */     func_70903_f(false);
/*  228 */     setThePrinceAdultFire(1);
/*  229 */     this.field_70145_X = false;
/*      */     
/*  231 */     if (this.renderdata == null) {
/*  232 */       this.renderdata = new RenderInfo();
/*      */     }
/*  234 */     this.renderdata.rf1 = 0.0F;
/*  235 */     this.renderdata.rf2 = 0.0F;
/*  236 */     this.renderdata.rf3 = 0.0F;
/*  237 */     this.renderdata.rf4 = 0.0F;
/*  238 */     this.renderdata.ri1 = 0;
/*  239 */     this.renderdata.ri2 = 0;
/*  240 */     this.renderdata.ri3 = 0;
/*  241 */     this.renderdata.ri4 = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  248 */     return 3000;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getThePrinceAdultHealth() {
/*  255 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RenderInfo getRenderInfo() {
/*  262 */     return this.renderdata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenderInfo(RenderInfo r) {
/*  267 */     this.renderdata.rf1 = r.rf1;
/*  268 */     this.renderdata.rf2 = r.rf2;
/*  269 */     this.renderdata.rf3 = r.rf3;
/*  270 */     this.renderdata.rf4 = r.rf4;
/*  271 */     this.renderdata.ri1 = r.ri1;
/*  272 */     this.renderdata.ri2 = r.ri2;
/*  273 */     this.renderdata.ri3 = r.ri3;
/*  274 */     this.renderdata.ri4 = r.ri4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  282 */     return 20;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70664_aZ() {
/*  288 */     super.func_70664_aZ();
/*  289 */     this.field_70181_x += 0.35D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  297 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  306 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String func_70639_aQ() {
/*  314 */     if (func_70906_o())
/*      */     {
/*  316 */       return null;
/*      */     }
/*  318 */     if (getActivity() == 1 && this.field_70153_n == null) {
/*  319 */       return "orespawn:king_living";
/*      */     }
/*      */     
/*  322 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  330 */     return "orespawn:king_hit";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  338 */     return "orespawn:trex_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  345 */     return 0.85F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float func_70647_i() {
/*  352 */     return 1.1F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70104_M() {
/*  361 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double func_70042_X() {
/*  369 */     return 9.25D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  378 */     return OreSpawnMain.ThePrinceEgg;
/*      */   }
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRand(Item index, int par1) {
/*  383 */     EntityItem var3 = null;
/*  384 */     ItemStack is = new ItemStack(index, par1, 0);
/*      */     
/*  386 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*      */     
/*  388 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  389 */     return is;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  394 */     dropItemRand(OreSpawnMain.ThePrinceEgg, 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  403 */     double ks = 2.0D;
/*  404 */     double inair = 0.2D;
/*  405 */     float iskraken = 1.0F;
/*  406 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */       
/*  408 */       if (par1Entity instanceof Kraken) iskraken = 2.0F; 
/*  409 */       par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), iskraken * 100.0F);
/*      */       
/*  411 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  412 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/*  413 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */     } 
/*  415 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  423 */     boolean ret = false;
/*  424 */     Entity e = null;
/*      */     
/*  426 */     if (this.hurt_timer > 0) return false;
/*      */     
/*  428 */     if (par1DamageSource.func_76355_l().equals("cactus")) {
/*  429 */       return ret;
/*      */     }
/*  431 */     if (par1DamageSource.func_76355_l().equals("inFire")) {
/*  432 */       return ret;
/*      */     }
/*  434 */     if (par1DamageSource.func_76355_l().equals("onFire")) {
/*  435 */       return ret;
/*      */     }
/*  437 */     if (par1DamageSource.func_76355_l().equals("lava")) {
/*  438 */       return ret;
/*      */     }
/*  440 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  441 */       func_70904_g(false);
/*  442 */       setActivity(1);
/*  443 */       return ret;
/*      */     } 
/*      */     
/*  446 */     func_70904_g(false);
/*  447 */     setActivity(1);
/*      */     
/*  449 */     e = par1DamageSource.func_76346_g();
/*      */ 
/*      */     
/*  452 */     if (e != null && e instanceof BetterFireball) {
/*      */       
/*  454 */       e.func_70106_y();
/*  455 */       return ret;
/*      */     } 
/*      */     
/*  458 */     if (e != null && e instanceof net.minecraft.entity.projectile.EntitySmallFireball) {
/*      */       
/*  460 */       e.func_70106_y();
/*  461 */       return ret;
/*      */     } 
/*  463 */     if (e != null && e instanceof ThePrinceAdult) {
/*  464 */       return false;
/*      */     }
/*  466 */     if (e != null && e instanceof Spyro) {
/*  467 */       return false;
/*      */     }
/*      */     
/*  470 */     ret = super.func_70097_a(par1DamageSource, par2);
/*  471 */     this.hurt_timer = 20;
/*      */     
/*  473 */     if (e != null && e instanceof EntityLivingBase) {
/*      */       
/*  475 */       if (func_70909_n() && 
/*  476 */         e instanceof EntityPlayer) {
/*  477 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  481 */       func_70624_b((EntityLivingBase)e);
/*  482 */       func_70784_b(e);
/*  483 */       func_70661_as().func_75497_a(e, 1.2D);
/*  484 */       ret = true;
/*      */     } 
/*      */     
/*  487 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70619_bc() {
/*  493 */     EntityLivingBase e = null;
/*  494 */     super.func_70619_bc();
/*      */ 
/*      */     
/*  497 */     if (!func_70906_o() && getActivity() == 0 && this.field_70153_n == null && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*      */       
/*  499 */       e = findSomethingToAttack();
/*  500 */       if (e != null) {
/*      */ 
/*      */         
/*  503 */         setActivity(1);
/*      */       } else {
/*  505 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*  508 */     if (getActivity() == 0 && this.field_70153_n == null && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && func_70909_n() && OreSpawnMain.FullPowerKingEnable != 0) {
/*      */ 
/*      */       
/*  511 */       this.growcounter++;
/*  512 */       if (this.growcounter > 288000) {
/*  513 */         Entity ent = null;
/*  514 */         TheKing d = null;
/*  515 */         ent = spawnCreature(this.field_70170_p, "The King", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  516 */         if (ent != null) {
/*  517 */           d = (TheKing)ent;
/*  518 */           d.setFree();
/*  519 */           func_70106_y();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void always_do() {
/*  527 */     EntityPlayer p = null;
/*      */ 
/*      */     
/*  530 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1 && 
/*  531 */       func_110143_aJ() < mygetMaxHealth())
/*      */     {
/*  533 */       func_70691_i(5.0F);
/*      */     }
/*      */ 
/*      */     
/*  537 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 0) {
/*  538 */       func_70624_b(null);
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
/*  554 */     if (func_70906_o())
/*      */       return; 
/*  556 */     this.owner_flying = 0;
/*  557 */     if (func_70909_n() && func_70902_q() != null && this.field_70153_n == null && !func_70906_o()) {
/*  558 */       p = (EntityPlayer)func_70902_q();
/*      */       
/*  560 */       if (p.field_71075_bZ.field_75100_b) {
/*  561 */         this.owner_flying = 1;
/*      */         
/*  563 */         setActivity(1);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  569 */     if (this.field_70170_p.field_73012_v.nextInt(50) == 1 && !func_70906_o())
/*      */     {
/*  571 */       if (!this.target_in_sight && this.field_70153_n == null)
/*      */       {
/*  573 */         if (this.field_70170_p.field_73012_v.nextInt(15) == 1) {
/*      */           
/*  575 */           setActivity(1);
/*      */         } else {
/*      */           
/*  578 */           setActivity(0);
/*      */         } 
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void fly_with_rider() {
/*  587 */     EntityLivingBase e = null;
/*      */ 
/*      */     
/*  590 */     if (this.field_70128_L)
/*      */       return; 
/*  592 */     if (func_70906_o())
/*  593 */       return;  if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  595 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */       
/*  597 */       e = findSomethingToAttack();
/*  598 */       if (e != null) {
/*      */         
/*  600 */         setAttacking(1);
/*  601 */         if (func_70068_e((Entity)e) < ((10.0F + e.field_70130_N / 2.0F) * (10.0F + e.field_70130_N / 2.0F))) {
/*      */           
/*  603 */           func_70652_k((Entity)e);
/*  604 */         } else if (func_70068_e((Entity)e) < 625.0D && !func_70090_H() && 
/*  605 */           getThePrinceAdultFire() != 0) {
/*  606 */           shoot_something(e.field_70165_t, e.field_70163_u, e.field_70161_v);
/*      */         } 
/*      */       } else {
/*      */         
/*  610 */         setAttacking(0);
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
/*  621 */     if (this.field_70153_n != null)
/*  622 */       return;  super.func_70629_bd();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  630 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*      */     
/*  632 */     if (par1EntityLiving == null)
/*      */     {
/*  634 */       return false;
/*      */     }
/*  636 */     if (par1EntityLiving == this)
/*      */     {
/*  638 */       return false;
/*      */     }
/*  640 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*      */       
/*  643 */       return false;
/*      */     }
/*  645 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  648 */       return false;
/*      */     }
/*  650 */     if (MyUtils.isRoyalty((Entity)par1EntityLiving))
/*      */     {
/*  652 */       return false;
/*      */     }
/*      */     
/*  655 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*      */     {
/*  657 */       return true;
/*      */     }
/*  659 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/*      */       
/*  662 */       return true;
/*      */     }
/*  664 */     if (par1EntityLiving instanceof Kraken)
/*      */     {
/*      */       
/*  667 */       return true;
/*      */     }
/*  669 */     if (par1EntityLiving instanceof Leon) {
/*      */       
/*  671 */       Leon l = (Leon)par1EntityLiving;
/*  672 */       if (l.func_70909_n()) return false;
/*      */       
/*  674 */       return true;
/*      */     } 
/*  676 */     if (par1EntityLiving instanceof WaterDragon) {
/*      */       
/*  678 */       WaterDragon l = (WaterDragon)par1EntityLiving;
/*  679 */       if (l.func_70909_n()) return false;
/*      */       
/*  681 */       return true;
/*      */     } 
/*  683 */     if (par1EntityLiving instanceof GammaMetroid) {
/*      */       
/*  685 */       GammaMetroid l = (GammaMetroid)par1EntityLiving;
/*  686 */       if (l.func_70909_n()) return false;
/*      */       
/*  688 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  692 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/*  697 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/*  698 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(32.0D, 20.0D, 32.0D));
/*  699 */     Collections.sort(var5, this.TargetSorter);
/*  700 */     Iterator<?> var2 = var5.iterator();
/*  701 */     Entity var3 = null;
/*  702 */     EntityLivingBase var4 = null;
/*      */     
/*  704 */     while (var2.hasNext()) {
/*      */       
/*  706 */       var3 = (Entity)var2.next();
/*  707 */       var4 = (EntityLivingBase)var3;
/*      */       
/*  709 */       if (isSuitableTarget(var4, false))
/*      */       {
/*  711 */         return var4;
/*      */       }
/*      */     } 
/*  714 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_145773_az() {
/*  721 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  729 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  737 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
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
/*  749 */     super.func_70056_a(par1, par3, par5, par7, par8, par9);
/*  750 */     this.boatPosRotationIncrements = par9;
/*      */ 
/*      */     
/*  753 */     this.boatX = par1;
/*  754 */     this.boatY = par3;
/*  755 */     this.boatZ = par5;
/*  756 */     this.boatYaw = par7;
/*  757 */     this.boatPitch = par8;
/*  758 */     this.boatYawHead = par7;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70016_h(double par1, double par3, double par5) {
/*  768 */     super.func_70016_h(par1, par3, par5);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  774 */     EntityLivingBase e = null;
/*      */     
/*  776 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  777 */     super.func_70071_h_();
/*      */     
/*  779 */     if (getActivity() != 0) {
/*  780 */       this.field_70145_X = true;
/*      */     } else {
/*  782 */       this.field_70145_X = false;
/*      */     } 
/*      */     
/*  785 */     if (!this.field_70170_p.field_72995_K) {
/*  786 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  787 */         int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  788 */         if (i == 0) this.head1dir = 2; 
/*  789 */         if (i == 1) this.head1dir = -2; 
/*  790 */         if (i == 2) this.head1dir = 0; 
/*      */       } 
/*  792 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  793 */         int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  794 */         if (i == 0) this.head2dir = 2; 
/*  795 */         if (i == 1) this.head2dir = -2; 
/*  796 */         if (i == 2) this.head2dir = 0; 
/*      */       } 
/*  798 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*  799 */         int i = this.field_70170_p.field_73012_v.nextInt(3);
/*  800 */         if (i == 0) this.head3dir = 2; 
/*  801 */         if (i == 1) this.head3dir = -2; 
/*  802 */         if (i == 2) this.head3dir = 0; 
/*      */       } 
/*  804 */       this.head1ext += this.head1dir;
/*  805 */       if (this.head1ext < 0) this.head1ext = 0; 
/*  806 */       if (this.head1ext > 60) this.head1ext = 60; 
/*  807 */       this.head2ext += this.head2dir;
/*  808 */       if (this.head2ext < 0) this.head2ext = 0; 
/*  809 */       if (this.head2ext > 60) this.head2ext = 60; 
/*  810 */       this.head3ext += this.head3dir;
/*  811 */       if (this.head3ext < 0) this.head3ext = 0; 
/*  812 */       if (this.head3ext > 60) this.head3ext = 60;
/*      */       
/*  814 */       setHead1Ext(this.head1ext);
/*  815 */       setHead2Ext(this.head2ext);
/*  816 */       setHead3Ext(this.head3ext);
/*      */     } 
/*      */     
/*  819 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*      */     
/*  821 */     if (getActivity() == 1) {
/*  822 */       this.wing_sound++;
/*  823 */       if (this.wing_sound > 30) {
/*      */         
/*  825 */         if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 0.5F, 1.0F); 
/*  826 */         this.wing_sound = 0;
/*      */       } 
/*      */     } 
/*      */     
/*  830 */     if (func_70090_H()) {
/*  831 */       this.field_70181_x += 0.07D;
/*      */     }
/*      */     
/*  834 */     if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  836 */     if (getActivity() == 0 && func_70909_n() && func_70902_q() != null && !func_70906_o()) {
/*  837 */       e = func_70902_q();
/*      */       
/*  839 */       if (func_70068_e((Entity)e) > 900.0D)
/*      */       {
/*  841 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void fly_without_rider() {
/*  849 */     int xdir = 1;
/*  850 */     int zdir = 1;
/*      */     
/*  852 */     int keep_trying = 10;
/*      */ 
/*      */     
/*  855 */     int do_new = 0;
/*  856 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*      */     
/*  858 */     int has_owner = 0;
/*  859 */     EntityLivingBase e = null;
/*  860 */     double speed_factor = 0.5D;
/*  861 */     double var1 = 0.0D;
/*  862 */     double var3 = 0.0D;
/*  863 */     double var5 = 0.0D;
/*      */ 
/*      */ 
/*      */     
/*  867 */     double gh = 1.25D;
/*  868 */     double obstruction_factor = 0.0D;
/*  869 */     double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */     
/*  871 */     int toofar = 0;
/*      */ 
/*      */     
/*  874 */     if (this.currentFlightTarget == null) {
/*  875 */       do_new = 1;
/*  876 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     } 
/*  878 */     if (this.field_70153_n != null) {
/*      */       return;
/*      */     }
/*  881 */     if (func_70909_n() && func_70902_q() != null) {
/*  882 */       e = func_70902_q();
/*  883 */       has_owner = 1;
/*  884 */       ox = e.field_70165_t;
/*  885 */       oy = e.field_70163_u;
/*  886 */       oz = e.field_70161_v;
/*  887 */       if (func_70068_e((Entity)e) > 400.0D) {
/*  888 */         toofar = 1;
/*  889 */         this.target_in_sight = false;
/*  890 */         setAttacking(0);
/*  891 */         func_70904_g(false);
/*  892 */         this.flyaway = 0;
/*  893 */         do_new = 1;
/*      */       } 
/*      */     } 
/*      */     
/*  897 */     if (func_70906_o())
/*      */       return; 
/*  899 */     if (this.field_70163_u < this.currentFlightTarget.field_71572_b + 2.0D) {
/*  900 */       this.field_70181_x *= 0.7D;
/*  901 */     } else if (this.field_70163_u > this.currentFlightTarget.field_71572_b - 2.0D) {
/*  902 */       this.field_70181_x *= 0.5D;
/*      */     } else {
/*  904 */       this.field_70181_x *= 0.61D;
/*      */     } 
/*      */ 
/*      */     
/*  908 */     if (this.field_70170_p.field_73012_v.nextInt(300) == 1) do_new = 1; 
/*  909 */     if (this.flyaway > 0) this.flyaway--;
/*      */ 
/*      */     
/*  912 */     if (toofar == 0 && this.flyaway == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*      */ 
/*      */       
/*  915 */       e = func_70638_az();
/*  916 */       if (e != null && !e.func_70089_S()) {
/*  917 */         func_70624_b(null);
/*  918 */         e = null;
/*      */       } 
/*      */       
/*  921 */       if (e == null) {
/*  922 */         e = findSomethingToAttack();
/*      */       }
/*  924 */       if (e != null) {
/*      */         
/*  926 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/*  927 */           setActivity(1);
/*  928 */           setAttacking(0);
/*  929 */           this.target_in_sight = false;
/*  930 */           do_new = 0;
/*  931 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*      */         } else {
/*      */           
/*  934 */           setActivity(1);
/*  935 */           setAttacking(1);
/*  936 */           this.target_in_sight = true;
/*  937 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/*      */           
/*  939 */           do_new = 0;
/*  940 */           if (func_70068_e((Entity)e) < ((10.0F + e.field_70130_N / 2.0F) * (10.0F + e.field_70130_N / 2.0F))) {
/*  941 */             func_70652_k((Entity)e);
/*  942 */             this.flyaway = 5 + this.field_70170_p.field_73012_v.nextInt(15);
/*  943 */             do_new = 1;
/*  944 */           } else if (func_70068_e((Entity)e) < 600.0D && !func_70090_H()) {
/*      */             
/*  946 */             if (getThePrinceAdultFire() != 0 && this.field_70170_p.field_73012_v.nextInt(2) == 1) {
/*  947 */               shoot_something(e.field_70165_t, e.field_70163_u, e.field_70161_v);
/*      */             }
/*      */           }
/*      */         
/*      */         } 
/*      */       } else {
/*      */         
/*  954 */         this.target_in_sight = false;
/*  955 */         this.flyaway = 0;
/*  956 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  961 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*  962 */       do_new = 1;
/*      */     }
/*      */ 
/*      */     
/*  966 */     if ((do_new != 0 && !this.target_in_sight) || (do_new != 0 && this.flyaway != 0)) {
/*      */       
/*  968 */       Block bid = Blocks.field_150348_b;
/*  969 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/*  970 */         int gox = (int)this.field_70165_t;
/*  971 */         int goy = (int)this.field_70163_u;
/*  972 */         int goz = (int)this.field_70161_v;
/*  973 */         if (has_owner == 1) {
/*  974 */           gox = (int)ox;
/*  975 */           goy = (int)oy;
/*  976 */           goz = (int)oz;
/*  977 */           if (this.owner_flying == 0) {
/*  978 */             zdir = this.field_70170_p.field_73012_v.nextInt(16) + 8;
/*  979 */             xdir = this.field_70170_p.field_73012_v.nextInt(16) + 8;
/*      */           } else {
/*  981 */             zdir = this.field_70170_p.field_73012_v.nextInt(12);
/*  982 */             xdir = this.field_70170_p.field_73012_v.nextInt(12);
/*      */           } 
/*      */         } else {
/*  985 */           zdir = this.field_70170_p.field_73012_v.nextInt(15) + 20;
/*  986 */           xdir = this.field_70170_p.field_73012_v.nextInt(15) + 20;
/*      */         } 
/*  988 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) zdir = -zdir; 
/*  989 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) xdir = -xdir; 
/*  990 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
/*  991 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/*  992 */         if (bid == Blocks.field_150350_a && 
/*  993 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/*  994 */           bid = Blocks.field_150348_b;
/*      */         }
/*      */         
/*  997 */         keep_trying--;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1005 */     obstruction_factor = 0.0D;
/* 1006 */     int dist = 2;
/* 1007 */     dist += (int)(velocity * 4.0D);
/*      */     
/* 1009 */     for (int k = 1; k < dist; k++) {
/* 1010 */       for (int i = 1; i < dist * 2; i++) {
/* 1011 */         double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1012 */         double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1013 */         Block bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 1014 */         if (bid != Blocks.field_150350_a) {
/* 1015 */           obstruction_factor += 0.05D;
/*      */         }
/*      */       } 
/*      */     } 
/* 1019 */     this.field_70181_x += obstruction_factor * 0.05D;
/* 1020 */     this.field_70163_u += obstruction_factor * 0.05D;
/*      */ 
/*      */     
/* 1023 */     speed_factor = 0.5D;
/* 1024 */     var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 1025 */     var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 1026 */     var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 1027 */     if (this.owner_flying != 0) {
/* 1028 */       speed_factor = 1.75D;
/* 1029 */       if (func_70909_n() && func_70902_q() != null) {
/* 1030 */         e = func_70902_q();
/* 1031 */         if (func_70068_e((Entity)e) > 64.0D) {
/* 1032 */           speed_factor = 3.5D;
/*      */         }
/*      */       } 
/*      */     } 
/* 1036 */     this.field_70159_w += (Math.signum(var1) - this.field_70159_w) * 0.15D * speed_factor;
/* 1037 */     this.field_70181_x += (Math.signum(var3) - this.field_70181_x) * 0.21D * speed_factor;
/* 1038 */     this.field_70179_y += (Math.signum(var5) - this.field_70179_y) * 0.15D * speed_factor;
/* 1039 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 1040 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 1041 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*      */     
/* 1043 */     this.field_70177_z += var8 / 4.0F;
/* 1044 */     func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/* 1054 */     List<Entity> list = null;
/* 1055 */     Entity listEntity = null;
/*      */ 
/*      */ 
/*      */     
/* 1059 */     double d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/* 1060 */     double d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1066 */     double obstruction_factor = 0.0D;
/*      */     
/* 1068 */     double relative_g = 0.0D;
/*      */     
/* 1070 */     double max_speed = 1.05D;
/* 1071 */     double gh = 1.25D;
/*      */ 
/*      */ 
/*      */     
/* 1075 */     double rt = 0.0D;
/*      */     
/* 1077 */     double pi = 3.1415926545D;
/* 1078 */     double deltav = 0.0D;
/*      */ 
/*      */ 
/*      */     
/* 1082 */     int dist = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1087 */     if (getActivity() == 0) {
/*      */       
/* 1089 */       super.func_70636_d();
/*      */     
/*      */     }
/* 1092 */     else if (this.field_70128_L) {
/* 1093 */       super.func_70636_d();
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1098 */     if (this.field_70128_L) {
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
/* 1111 */     if (this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1116 */       if (this.boatPosRotationIncrements > 0 && getActivity() != 0) {
/*      */         
/* 1118 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/* 1119 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/* 1120 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/* 1121 */         func_70107_b(d4, d5, d11);
/*      */         
/* 1123 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/* 1124 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/* 1125 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/* 1126 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/* 1127 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/* 1128 */         this.field_70759_as = this.field_70177_z;
/*      */         
/* 1130 */         this.boatPosRotationIncrements--;
/*      */       } 
/*      */     } else {
/*      */       
/* 1134 */       if (getActivity() != 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1140 */         if (this.fireballticker > 0) this.fireballticker--;
/*      */         
/* 1142 */         if (this.field_70153_n != null) {
/* 1143 */           EntityPlayer pp = (EntityPlayer)this.field_70153_n;
/*      */ 
/*      */ 
/*      */           
/* 1147 */           if (this.field_70159_w < -2.0D) this.field_70159_w = -2.0D; 
/* 1148 */           if (this.field_70159_w > 2.0D) this.field_70159_w = 2.0D; 
/* 1149 */           if (this.field_70179_y < -2.0D) this.field_70179_y = -2.0D; 
/* 1150 */           if (this.field_70179_y > 2.0D) this.field_70179_y = 2.0D; 
/* 1151 */           double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */           
/* 1154 */           gh = 1.25D;
/* 1155 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)((float)this.field_70163_u - (float)gh), (int)this.field_70161_v);
/* 1156 */           if (bid != Blocks.field_150350_a) {
/* 1157 */             this.field_70181_x += 0.03D;
/* 1158 */             this.field_70163_u += 0.1D;
/*      */           } else {
/*      */             
/* 1161 */             this.field_70181_x -= 0.018D;
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1168 */           obstruction_factor = 0.0D;
/* 1169 */           dist = 3;
/* 1170 */           dist += (int)(velocity * 7.0D);
/*      */           
/* 1172 */           for (int k = 1; k < dist; k++) {
/* 1173 */             for (int i = 1; i < dist * 2; i++) {
/* 1174 */               double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1175 */               double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1176 */               bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 1177 */               if (bid != Blocks.field_150350_a) {
/* 1178 */                 obstruction_factor += 0.05D;
/*      */               }
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1185 */           this.field_70181_x += obstruction_factor * 0.07D;
/* 1186 */           this.field_70163_u += obstruction_factor * 0.07D;
/* 1187 */           if (this.field_70181_x > 2.0D) this.field_70181_x = 2.0D;
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
/* 1198 */           double d4 = this.field_70153_n.field_70177_z;
/* 1199 */           d4 %= 360.0D;
/* 1200 */           for (; d4 < 0.0D; d4 += 360.0D);
/* 1201 */           double d5 = this.field_70177_z;
/* 1202 */           d5 %= 360.0D;
/* 1203 */           for (; d5 < 0.0D; d5 += 360.0D);
/* 1204 */           relative_g = (d4 - d5) % 180.0D;
/* 1205 */           for (; relative_g < 0.0D; relative_g += 180.0D);
/* 1206 */           if (relative_g > 90.0D) relative_g -= 180.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1213 */           if (velocity > 0.01D) {
/*      */             
/* 1215 */             d4 = 1.85D - velocity;
/* 1216 */             d4 = Math.abs(d4);
/* 1217 */             if (d4 < 0.01D) d4 = 0.01D; 
/* 1218 */             if (d4 > 0.9D) d4 = 0.9D; 
/* 1219 */             this.field_70177_z = this.field_70153_n.field_70177_z + (float)(relative_g * d4);
/*      */           } else {
/*      */             
/* 1222 */             this.field_70177_z = this.field_70153_n.field_70177_z;
/*      */           } 
/* 1224 */           relative_g = Math.abs(relative_g) * velocity;
/* 1225 */           if (relative_g > 50.0D) relative_g = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1230 */           this.field_70125_A = 2.0F * (float)velocity;
/* 1231 */           func_70101_b(this.field_70177_z, this.field_70125_A);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1237 */           double newvelocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1245 */           double rr = Math.atan2(this.field_70153_n.field_70179_y, this.field_70153_n.field_70159_w);
/* 1246 */           double rhm = Math.atan2(this.field_70179_y, this.field_70159_w);
/* 1247 */           double rhdir = Math.toRadians(((this.field_70153_n.field_70177_z + 90.0F) % 360.0F));
/* 1248 */           rt = 0.0D;
/* 1249 */           pi = 3.1415926545D;
/* 1250 */           deltav = 0.0D;
/* 1251 */           float im = pp.field_70701_bs;
/*      */ 
/*      */           
/* 1254 */           if (OreSpawnMain.flyup_keystate != 0) {
/* 1255 */             this.field_70181_x += 0.045D;
/* 1256 */             this.field_70181_x += velocity * 0.066D;
/*      */           } 
/*      */ 
/*      */           
/* 1260 */           double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
/* 1261 */           if (rdv > pi) rdv -= pi * 2.0D; 
/* 1262 */           rdv = Math.abs(rdv);
/* 1263 */           if (Math.abs(newvelocity) < 0.01D) rdv = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1271 */           if (rdv > 1.5D) newvelocity = -newvelocity;
/*      */           
/* 1273 */           if (Math.abs(im) > 0.001F) {
/* 1274 */             if (im > 0.0F) {
/* 1275 */               deltav = 0.035D;
/* 1276 */               if (max_speed > 1.0D) deltav += 0.07D; 
/* 1277 */               if (this.deltasmooth < 0.0F) this.deltasmooth = 0.0F; 
/* 1278 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1279 */               if (this.deltasmooth > deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } else {
/* 1282 */               max_speed = 0.35D;
/*      */               
/* 1284 */               deltav = -0.02D;
/* 1285 */               if (this.deltasmooth > 0.0F) this.deltasmooth = 0.0F; 
/* 1286 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1287 */               if (this.deltasmooth < deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } 
/* 1290 */             newvelocity += this.deltasmooth;
/* 1291 */             if (newvelocity >= 0.0D) {
/* 1292 */               if (newvelocity > max_speed) newvelocity = max_speed; 
/* 1293 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1294 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */             } else {
/* 1296 */               if (newvelocity < -max_speed) newvelocity = -max_speed; 
/* 1297 */               newvelocity = -newvelocity;
/* 1298 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/* 1299 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/*      */             }
/*      */           
/*      */           }
/* 1303 */           else if (newvelocity >= 0.0D) {
/* 1304 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1305 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */           } else {
/* 1307 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/* 1308 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1313 */           if (this.fireballticker == 0 && (pp.field_70702_br < -0.001F || pp.field_70702_br > 0.001F)) {
/*      */             
/* 1315 */             double yoff = 9.5D;
/* 1316 */             double xzoff = 14.5D;
/*      */             
/* 1318 */             this.which_attack++;
/* 1319 */             if (this.which_attack > 2) this.which_attack = 0;
/*      */ 
/*      */             
/* 1322 */             if (this.which_attack == 0) {
/* 1323 */               yoff -= (getHead1Ext() * 0.08F);
/* 1324 */               double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians((this.field_70177_z - 10.0F)));
/* 1325 */               double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians((this.field_70177_z - 10.0F)));
/* 1326 */               BetterFireball bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, 0.0D, 0.0D, 0.0D);
/* 1327 */               bf.setBig();
/* 1328 */               bf.setNotMe();
/* 1329 */               bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1330 */               cx = Math.cos(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1331 */               cz = Math.sin(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1332 */               double cy = -Math.sin(Math.toRadians(pp.field_70125_A));
/*      */               
/* 1334 */               double d3 = MathHelper.func_76133_a(cx * cx + cy * cy + cz * cz);
/* 1335 */               bf.field_70232_b = cx / d3 * 0.1D;
/* 1336 */               bf.field_70233_c = cy / d3 * 0.1D;
/* 1337 */               bf.field_70230_d = cz / d3 * 0.1D;
/* 1338 */               bf.field_70159_w = this.field_70159_w;
/* 1339 */               bf.field_70181_x = this.field_70181_x;
/* 1340 */               bf.field_70179_y = this.field_70179_y;
/* 1341 */               bf.field_70165_t -= this.field_70159_w * 3.0D;
/* 1342 */               bf.field_70163_u -= this.field_70181_x * 3.0D;
/* 1343 */               bf.field_70161_v -= this.field_70179_y * 3.0D;
/* 1344 */               this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1345 */               this.field_70170_p.func_72838_d((Entity)bf);
/*      */             } 
/*      */             
/* 1348 */             if (this.which_attack == 1) {
/* 1349 */               yoff -= (getHead3Ext() * 0.08F);
/* 1350 */               double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians((this.field_70177_z + 10.0F)));
/* 1351 */               double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians((this.field_70177_z + 10.0F)));
/* 1352 */               IceBall var2 = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1353 */               var2.func_70012_b(cx, this.field_70163_u + yoff, cz, pp.field_70177_z + 90.0F, pp.field_70125_A);
/* 1354 */               var2.setIceMaker(1);
/* 1355 */               double var3 = Math.cos(Math.toRadians((pp.field_70177_z + 90.0F)));
/* 1356 */               double var5 = -Math.sin(Math.toRadians(pp.field_70125_A));
/* 1357 */               double var77 = Math.sin(Math.toRadians((pp.field_70177_z + 90.0F)));
/* 1358 */               float var9 = MathHelper.func_76133_a(var3 * var3 + var77 * var77) * 0.2F;
/* 1359 */               var2.func_70186_c(var3, var5 + var9, var77, 1.4F, 5.0F);
/* 1360 */               var2.field_70165_t -= this.field_70159_w * 3.0D;
/* 1361 */               var2.field_70163_u -= this.field_70181_x * 3.0D;
/* 1362 */               var2.field_70161_v -= this.field_70179_y * 3.0D;
/* 1363 */               var2.field_70159_w *= 2.0D;
/* 1364 */               var2.field_70181_x *= 2.0D;
/* 1365 */               var2.field_70179_y *= 2.0D;
/* 1366 */               this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1367 */               this.field_70170_p.func_72838_d((Entity)var2);
/*      */             } 
/*      */             
/* 1370 */             if (this.which_attack == 2) {
/* 1371 */               yoff -= (getHead2Ext() * 0.08F);
/* 1372 */               double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1373 */               double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1374 */               ThunderBolt lb = new ThunderBolt(this.field_70170_p, (EntityLivingBase)pp);
/* 1375 */               lb.func_70012_b(cx, this.field_70163_u + yoff, cz, pp.field_70177_z + 90.0F, pp.field_70125_A);
/* 1376 */               lb.field_70159_w *= 3.0D;
/* 1377 */               lb.field_70181_x *= 3.0D;
/* 1378 */               lb.field_70179_y *= 3.0D;
/* 1379 */               this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1380 */               this.field_70170_p.func_72838_d((Entity)lb);
/*      */             } 
/* 1382 */             this.fireballticker = 8;
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1387 */           func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */ 
/*      */           
/* 1390 */           this.field_70159_w *= 0.985D;
/* 1391 */           this.field_70181_x *= 0.94D;
/* 1392 */           this.field_70179_y *= 0.985D;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1397 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1399 */             list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b(6.25D, 10.0D, 6.25D));
/*      */             
/* 1401 */             if (list != null && !list.isEmpty())
/*      */             {
/* 1403 */               for (int l = 0; l < list.size(); l++) {
/*      */                 
/* 1405 */                 listEntity = list.get(l);
/*      */                 
/* 1407 */                 if (listEntity != this.field_70153_n && !listEntity.field_70128_L && listEntity.func_70104_M())
/*      */                 {
/* 1409 */                   listEntity.func_70108_f((Entity)this);
/*      */                 }
/*      */               } 
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1417 */           fly_with_rider();
/*      */           
/* 1419 */           if (this.field_70153_n != null && this.field_70153_n.field_70128_L)
/*      */           {
/* 1421 */             this.field_70153_n = null;
/*      */           }
/*      */         } else {
/*      */           
/* 1425 */           fly_without_rider();
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1431 */       always_do();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70043_V() {
/* 1438 */     if (this.field_70153_n != null) {
/*      */ 
/*      */ 
/*      */       
/* 1442 */       float f = 4.65F;
/* 1443 */       this.field_70153_n.func_70107_b(this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + func_70042_X() + this.field_70153_n.func_70033_W(), this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)));
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
/* 1455 */     String s = "heart";
/*      */     
/* 1457 */     if (!par1)
/*      */     {
/* 1459 */       s = "smoke";
/*      */     }
/*      */     
/* 1462 */     for (int i = 0; i < 20; i++) {
/*      */       
/* 1464 */       double d0 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1465 */       double d1 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1466 */       double d2 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1467 */       this.field_70170_p.func_72869_a(s, this.field_70165_t + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), this.field_70163_u + 0.5D + this.field_70146_Z.nextFloat() * 1.5D, this.field_70161_v + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), d0, d1, d2);
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
/* 1478 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */     
/* 1480 */     if (var2 != null && 
/* 1481 */       var2.field_77994_a <= 0) {
/* 1482 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 1483 */       var2 = null;
/*      */     } 
/*      */ 
/*      */     
/* 1487 */     if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150484_ah) && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D) {
/* 1488 */       if (!this.field_70170_p.field_72995_K) {
/* 1489 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         
/* 1491 */         this.growcounter = 288000;
/*      */       } 
/* 1493 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1494 */         var2.field_77994_a--;
/* 1495 */         if (var2.field_77994_a <= 0) {
/* 1496 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/* 1499 */       return true;
/*      */     } 
/*      */     
/* 1502 */     if (func_70909_n()) {
/*      */       
/* 1504 */       if (!func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/* 1505 */         return false;
/*      */       }
/*      */       
/* 1508 */       if (var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D) {
/* 1509 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1511 */           par1EntityPlayer.func_70078_a((Entity)this);
/*      */           
/* 1513 */           setActivity(1);
/* 1514 */           func_70904_g(false);
/*      */         } 
/* 1516 */         return true;
/*      */       } 
/*      */       
/* 1519 */       if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D) {
/* 1520 */         if (this.field_70170_p.field_72995_K) {
/* 1521 */           func_70908_e(true);
/* 1522 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1525 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 1526 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         }
/* 1528 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1529 */           var2.field_77994_a--;
/* 1530 */           if (var2.field_77994_a <= 0) {
/* 1531 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1534 */         return true;
/*      */       } 
/*      */       
/* 1537 */       if (var2 != null && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D && var2.func_77973_b() instanceof ItemFood) {
/*      */ 
/*      */         
/* 1540 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1542 */           ItemFood var3 = (ItemFood)var2.func_77973_b();
/*      */           
/* 1544 */           if (mygetMaxHealth() > func_110143_aJ())
/*      */           {
/* 1546 */             func_70691_i((var3.func_150905_g(var2) * 10));
/*      */           }
/*      */           
/* 1549 */           func_70908_e(true);
/* 1550 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1553 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1555 */           var2.field_77994_a--;
/* 1556 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1558 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1561 */         return true;
/*      */       } 
/*      */ 
/*      */       
/* 1565 */       if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150432_aD) && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D) {
/*      */         
/* 1567 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1569 */           func_70908_e(true);
/* 1570 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/* 1571 */           setThePrinceAdultFire(0);
/* 1572 */           String healthMessage = new String();
/* 1573 */           healthMessage = String.format("Fireballs extinguished.", new Object[0]);
/* 1574 */           par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */         } 
/* 1576 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1578 */           var2.field_77994_a--;
/* 1579 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1581 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1584 */         return true;
/*      */       } 
/*      */       
/* 1587 */       if (var2 != null && var2.func_77973_b() == Items.field_151033_d && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D) {
/*      */         
/* 1589 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1591 */           func_70908_e(true);
/* 1592 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/* 1593 */           setThePrinceAdultFire(1);
/* 1594 */           String healthMessage = new String();
/* 1595 */           healthMessage = String.format("Fireballs lit!", new Object[0]);
/* 1596 */           par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */         } 
/* 1598 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1600 */           var2.field_77994_a--;
/* 1601 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1603 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1606 */         return true;
/*      */       } 
/*      */ 
/*      */       
/* 1610 */       if (var2 != null && var2.func_77973_b() == Items.field_151045_i && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D && !this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */         
/* 1614 */         Entity ent = null;
/* 1615 */         ThePrinceTeen d = null;
/* 1616 */         ent = spawnCreature(this.field_70170_p, "The Young Prince", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 1617 */         if (ent != null) {
/* 1618 */           d = (ThePrinceTeen)ent;
/* 1619 */           if (func_70909_n()) {
/* 1620 */             d.func_70903_f(true);
/* 1621 */             d.func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*      */           } 
/* 1623 */           func_70106_y();
/*      */         } 
/* 1625 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1627 */           var2.field_77994_a--;
/* 1628 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1630 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1633 */         return true;
/*      */       } 
/*      */       
/* 1636 */       if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */         
/* 1638 */         func_94058_c(var2.func_82833_r());
/* 1639 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1641 */           var2.field_77994_a--;
/* 1642 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1644 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1647 */         return true;
/*      */       } 
/*      */       
/* 1650 */       if (var2 != null && par1EntityPlayer.func_70068_e((Entity)this) < 36.0D) {
/*      */         
/* 1652 */         if (!func_70906_o()) {
/* 1653 */           func_70904_g(true);
/* 1654 */           setActivity(0);
/*      */         } else {
/* 1656 */           func_70904_g(false);
/* 1657 */           setActivity(0);
/*      */         } 
/* 1659 */         return true;
/*      */       } 
/*      */     } 
/*      */     
/* 1663 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/* 1671 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/* 1677 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/* 1682 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1683 */       return;  this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public int getActivity() {
/* 1688 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/* 1693 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1694 */       return;  this.field_70180_af.func_75692_b(21, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getThePrinceAdultFire() {
/* 1700 */     return this.field_70180_af.func_75679_c(24);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setThePrinceAdultFire(int par1) {
/* 1706 */     if (this.field_70170_p.field_72995_K)
/* 1707 */       return;  this.field_70180_af.func_75692_b(24, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 1716 */     Entity var8 = null;
/*      */ 
/*      */     
/* 1719 */     var8 = EntityList.func_75620_a(par1, par0World);
/*      */     
/* 1721 */     if (var8 != null) {
/*      */ 
/*      */       
/* 1724 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1727 */       par0World.func_72838_d(var8);
/*      */       
/* 1729 */       ((EntityLiving)var8).func_70642_aH();
/*      */     } 
/*      */     
/* 1732 */     return var8;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 1740 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/* 1748 */     if (func_104002_bU()) return false; 
/* 1749 */     if (this.field_70153_n != null) {
/* 1750 */       return false;
/*      */     }
/* 1752 */     if (func_70909_n()) {
/* 1753 */       return false;
/*      */     }
/* 1755 */     return true;
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
/* 1766 */     super.func_70014_b(par1NBTTagCompound);
/*      */     
/* 1768 */     par1NBTTagCompound.func_74768_a("ThePrinceAdultAttacking", getAttacking());
/* 1769 */     par1NBTTagCompound.func_74768_a("ThePrinceAdultActivity", getActivity());
/* 1770 */     par1NBTTagCompound.func_74768_a("ThePrinceAdultFire", getThePrinceAdultFire());
/* 1771 */     par1NBTTagCompound.func_74768_a("ThePrinceAdultGrow", this.growcounter);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 1781 */     super.func_70037_a(par1NBTTagCompound);
/*      */     
/* 1783 */     setAttacking(par1NBTTagCompound.func_74762_e("ThePrinceAdultAttacking"));
/* 1784 */     setActivity(par1NBTTagCompound.func_74762_e("ThePrinceAdultActivity"));
/* 1785 */     setThePrinceAdultFire(par1NBTTagCompound.func_74762_e("ThePrinceAdultFire"));
/* 1786 */     this.growcounter = par1NBTTagCompound.func_74762_e("ThePrinceAdultGrow");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void shoot_something(double x, double y, double z) {
/* 1792 */     double rr = 0.0D;
/* 1793 */     double rhdir = 0.0D;
/* 1794 */     double rdd = 0.0D;
/* 1795 */     double pi = 3.1415926545D;
/*      */     
/* 1797 */     int which = this.field_70170_p.field_73012_v.nextInt(3);
/*      */ 
/*      */ 
/*      */     
/* 1801 */     if (which == 0) {
/*      */ 
/*      */       
/* 1804 */       rr = Math.atan2(z - this.field_70161_v, x - this.field_70165_t);
/* 1805 */       rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */       
/* 1807 */       rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 1808 */       if (rdd > pi) rdd -= pi * 2.0D; 
/* 1809 */       rdd = Math.abs(rdd);
/*      */       
/* 1811 */       if (rdd < 0.5D) {
/* 1812 */         firecanon(x, y, z);
/*      */       }
/* 1814 */     } else if (which == 1) {
/*      */ 
/*      */ 
/*      */       
/* 1818 */       rr = Math.atan2(z - this.field_70161_v, x - this.field_70165_t);
/* 1819 */       rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */       
/* 1821 */       rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 1822 */       if (rdd > pi) rdd -= pi * 2.0D; 
/* 1823 */       rdd = Math.abs(rdd);
/*      */       
/* 1825 */       if (rdd < 0.5D) {
/* 1826 */         firecanonl(x, y, z);
/*      */       
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1832 */       rr = Math.atan2(z - this.field_70161_v, x - this.field_70165_t);
/* 1833 */       rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */       
/* 1835 */       rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 1836 */       if (rdd > pi) rdd -= pi * 2.0D; 
/* 1837 */       rdd = Math.abs(rdd);
/*      */       
/* 1839 */       if (rdd < 0.5D) {
/* 1840 */         firecanoni(x, y, z);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanon(double x, double y, double z) {
/* 1848 */     double yoff = 3.5D;
/* 1849 */     double xzoff = 6.0D;
/*      */ 
/*      */     
/* 1852 */     BetterFireball bf = null;
/*      */     
/* 1854 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1855 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1856 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1857 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1858 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1859 */     bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, x - cx + r1, y + 0.25D - this.field_70163_u + yoff + r2, z - cz + r3);
/* 1860 */     bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 1861 */     bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1862 */     bf.setBig();
/* 1863 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1864 */     this.field_70170_p.func_72838_d((Entity)bf);
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanonl(double x, double y, double z) {
/* 1869 */     double yoff = 3.5D;
/* 1870 */     double xzoff = 6.0D;
/*      */ 
/*      */ 
/*      */     
/* 1874 */     double var3 = 0.0D;
/* 1875 */     double var5 = 0.0D;
/* 1876 */     double var7 = 0.0D;
/* 1877 */     float var9 = 0.0F;
/* 1878 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1879 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1881 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1883 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1884 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1885 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1886 */     ThunderBolt lb = new ThunderBolt(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1887 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1888 */     var3 = x - lb.field_70165_t;
/* 1889 */     var5 = y + 0.25D - lb.field_70163_u;
/* 1890 */     var7 = z - lb.field_70161_v;
/* 1891 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1892 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1893 */     lb.field_70159_w *= 3.0D;
/* 1894 */     lb.field_70181_x *= 3.0D;
/* 1895 */     lb.field_70179_y *= 3.0D;
/* 1896 */     this.field_70170_p.func_72838_d((Entity)lb);
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanoni(double x, double y, double z) {
/* 1901 */     double yoff = 3.5D;
/* 1902 */     double xzoff = 6.0D;
/*      */ 
/*      */ 
/*      */     
/* 1906 */     double var3 = 0.0D;
/* 1907 */     double var5 = 0.0D;
/* 1908 */     double var7 = 0.0D;
/* 1909 */     float var9 = 0.0F;
/* 1910 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1911 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */     
/* 1913 */     this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*      */     
/* 1915 */     float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1916 */     float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1917 */     float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/* 1918 */     IceBall lb = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1919 */     lb.setIceMaker(1);
/* 1920 */     lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/* 1921 */     var3 = x - lb.field_70165_t;
/* 1922 */     var5 = y + 0.25D - lb.field_70163_u;
/* 1923 */     var7 = z - lb.field_70161_v;
/* 1924 */     var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1925 */     lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/* 1926 */     lb.field_70159_w *= 3.0D;
/* 1927 */     lb.field_70181_x *= 3.0D;
/* 1928 */     lb.field_70179_y *= 3.0D;
/* 1929 */     this.field_70170_p.func_72838_d((Entity)lb);
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ThePrinceAdult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */