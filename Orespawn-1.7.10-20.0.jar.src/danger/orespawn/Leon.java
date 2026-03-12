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
/*      */ import net.minecraft.entity.boss.EntityDragon;
/*      */ import net.minecraft.entity.item.EntityItem;
/*      */ import net.minecraft.entity.monster.IMob;
/*      */ import net.minecraft.entity.passive.EntityTameable;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*      */ import net.minecraft.util.ChunkCoordinates;
/*      */ import net.minecraft.util.DamageSource;
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
/*      */ 
/*      */ public class Leon
/*      */   extends EntityTameable
/*      */ {
/*      */   private int boatPosRotationIncrements;
/*      */   private double boatX;
/*      */   private double boatY;
/*      */   private double boatZ;
/*      */   private double boatYaw;
/*      */   private double boatPitch;
/*      */   private double boatYawHead;
/*      */   private double velocityX;
/*      */   private double velocityY;
/*      */   private double velocityZ;
/*   82 */   private GenericTargetSorter TargetSorter = null;
/*   83 */   private RenderInfo renderdata = new RenderInfo();
/*   84 */   private int hurt_timer = 0;
/*   85 */   private int wing_sound = 0;
/*   86 */   private ChunkCoordinates currentFlightTarget = null;
/*      */   private boolean target_in_sight = false;
/*   88 */   private int owner_flying = 0;
/*   89 */   private int flyaway = 0;
/*   90 */   private int stuck_count = 0;
/*   91 */   private int lastX = 0;
/*   92 */   private int lastZ = 0;
/*   93 */   private int unstick_timer = 0;
/*   94 */   private float moveSpeed = 0.25F;
/*   95 */   private float deltasmooth = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Leon(World par1World) {
/*  103 */     super(par1World);
/*      */     
/*  105 */     func_70105_a(3.5F, 8.25F);
/*  106 */     func_70661_as().func_75491_a(true);
/*  107 */     this.field_70728_aV = 300;
/*  108 */     this.field_70174_ab = 10;
/*  109 */     this.field_70178_ae = false;
/*  110 */     func_70904_g(false);
/*  111 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  112 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 1.1F, 16.0F, 2.0F));
/*  113 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false));
/*  114 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIWander((EntityCreature)this, 0.75F));
/*  115 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 9.0F));
/*  116 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  117 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLiving.class, 0, true, false, IMob.field_82192_a)); 
/*  118 */     this.field_70715_bh.func_75776_a(2, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  119 */     this.field_70153_n = null;
/*  120 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  121 */     this.renderdata = new RenderInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Leon(World par1World, double par2, double par4, double par6) {
/*  127 */     this(par1World);
/*  128 */     func_70107_b(par2, par4 + this.field_70129_M, par6);
/*  129 */     this.field_70159_w = 0.0D;
/*  130 */     this.field_70181_x = 0.0D;
/*  131 */     this.field_70179_y = 0.0D;
/*  132 */     this.field_70169_q = par2;
/*  133 */     this.field_70167_r = par4;
/*  134 */     this.field_70166_s = par6;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  139 */     super.func_110147_ax();
/*  140 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  141 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  142 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  143 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(55.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean shouldRiderSit() {
/*  152 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getTrackingRange() {
/*  157 */     return 64;
/*      */   }
/*      */   
/*      */   public int getUpdateFrequency() {
/*  161 */     return 10;
/*      */   }
/*      */   
/*      */   public boolean sendsVelocityUpdates() {
/*  165 */     return true;
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
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  179 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  184 */     super.func_70088_a();
/*  185 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(0));
/*  186 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(0));
/*  187 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(0));
/*      */     
/*  189 */     setActivity(0);
/*  190 */     setAttacking(0);
/*  191 */     setBeingRidden(0);
/*  192 */     func_70903_f(false);
/*      */     
/*  194 */     if (this.renderdata == null) {
/*  195 */       this.renderdata = new RenderInfo();
/*      */     }
/*  197 */     this.renderdata.rf1 = 0.0F;
/*  198 */     this.renderdata.rf2 = 0.0F;
/*  199 */     this.renderdata.rf3 = 0.0F;
/*  200 */     this.renderdata.rf4 = 0.0F;
/*  201 */     this.renderdata.ri1 = 0;
/*  202 */     this.renderdata.ri2 = 0;
/*  203 */     this.renderdata.ri3 = 0;
/*  204 */     this.renderdata.ri4 = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  211 */     return 250;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLeonHealth() {
/*  218 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RenderInfo getRenderInfo() {
/*  225 */     return this.renderdata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenderInfo(RenderInfo r) {
/*  230 */     this.renderdata.rf1 = r.rf1;
/*  231 */     this.renderdata.rf2 = r.rf2;
/*  232 */     this.renderdata.rf3 = r.rf3;
/*  233 */     this.renderdata.rf4 = r.rf4;
/*  234 */     this.renderdata.ri1 = r.ri1;
/*  235 */     this.renderdata.ri2 = r.ri2;
/*  236 */     this.renderdata.ri3 = r.ri3;
/*  237 */     this.renderdata.ri4 = r.ri4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  245 */     return 16;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70664_aZ() {
/*  251 */     super.func_70664_aZ();
/*  252 */     this.field_70181_x += 0.25D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  260 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  269 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String func_70639_aQ() {
/*  277 */     if (func_70906_o())
/*      */     {
/*  279 */       return null;
/*      */     }
/*  281 */     if (getActivity() == 1 && this.field_70153_n == null) {
/*  282 */       return "orespawn:leon_living";
/*      */     }
/*      */     
/*  285 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  293 */     return "orespawn:leon_hit";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  301 */     return "orespawn:leon_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  308 */     return 1.75F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float func_70647_i() {
/*  315 */     return 0.85F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70104_M() {
/*  324 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double func_70042_X() {
/*  332 */     return 3.75D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  340 */     return Items.field_151082_bd;
/*      */   }
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRand(Item index, int par1) {
/*  345 */     EntityItem var3 = null;
/*  346 */     ItemStack is = new ItemStack(index, par1, 0);
/*      */     
/*  348 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 2.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), is);
/*      */     
/*  350 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  351 */     return is;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  359 */     int i = 4 + this.field_70170_p.field_73012_v.nextInt(6); int var4;
/*  360 */     for (var4 = 0; var4 < i; var4++) {
/*  361 */       dropItemRand(Items.field_151076_bf, 1);
/*      */     }
/*  363 */     i = 16 + this.field_70170_p.field_73012_v.nextInt(6);
/*  364 */     for (var4 = 0; var4 < i; var4++) {
/*  365 */       dropItemRand(Items.field_151008_G, 1);
/*      */     }
/*  367 */     i = 2 + this.field_70170_p.field_73012_v.nextInt(6);
/*  368 */     for (var4 = 0; var4 < i; var4++) {
/*  369 */       dropItemRand(Item.func_150898_a(OreSpawnMain.KrakenRepellent), 1);
/*      */     }
/*  371 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) dropItemRand(OreSpawnMain.MyBattleAxe, 1);
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  380 */     double ks = 1.25D;
/*  381 */     double inair = 0.15D;
/*  382 */     float iskraken = 1.0F;
/*  383 */     if (par1Entity != null && par1Entity instanceof EntityDragon) {
/*  384 */       EntityDragon dr = (EntityDragon)par1Entity;
/*  385 */       DamageSource var21 = null;
/*  386 */       var21 = DamageSource.func_94539_a(null);
/*  387 */       var21.func_94540_d();
/*  388 */       if (this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*  389 */         dr.func_70965_a(dr.field_70986_h, var21, 55.0F);
/*      */       } else {
/*  391 */         dr.func_70965_a(dr.field_70987_i, var21, 55.0F);
/*      */       }
/*      */     
/*  394 */     } else if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */       
/*  396 */       if (par1Entity instanceof Kraken) iskraken = 4.0F; 
/*  397 */       par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), iskraken * 55.0F);
/*      */       
/*  399 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  400 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/*  401 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */     } 
/*      */     
/*  404 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  412 */     boolean ret = false;
/*  413 */     Entity e = null;
/*      */     
/*  415 */     if (this.hurt_timer > 0) return false;
/*      */ 
/*      */     
/*  418 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  419 */       return ret;
/*      */     }
/*      */     
/*  422 */     if (!this.field_70170_p.field_72995_K) func_70904_g(false); 
/*  423 */     if (!this.field_70170_p.field_72995_K) setActivity(1);
/*      */     
/*  425 */     e = par1DamageSource.func_76346_g();
/*      */ 
/*      */     
/*  428 */     if (e != null && e instanceof Leon) {
/*  429 */       return false;
/*      */     }
/*      */     
/*  432 */     ret = super.func_70097_a(par1DamageSource, par2);
/*  433 */     this.hurt_timer = 15;
/*      */     
/*  435 */     if (e != null && e instanceof EntityLivingBase && !this.field_70170_p.field_72995_K) {
/*      */       
/*  437 */       if (func_70909_n() && 
/*  438 */         e instanceof EntityPlayer) {
/*  439 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  443 */       func_70624_b((EntityLivingBase)e);
/*  444 */       func_70784_b(e);
/*  445 */       func_70661_as().func_75497_a(e, 1.2D);
/*  446 */       ret = true;
/*      */     } 
/*      */     
/*  449 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70619_bc() {
/*  456 */     if (this.field_70170_p.field_72995_K)
/*  457 */       return;  super.func_70619_bc();
/*  458 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70624_b(null);
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void fly_with_rider() {
/*  466 */     EntityLivingBase e = null;
/*  467 */     int freq = 7;
/*      */ 
/*      */ 
/*      */     
/*  471 */     if (this.field_70128_L)
/*      */       return; 
/*  473 */     if (func_70906_o())
/*  474 */       return;  if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  476 */     if (this.field_70170_p.field_73012_v.nextInt(freq) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */       
/*  478 */       e = func_70638_az();
/*  479 */       if (e != null && !e.func_70089_S()) {
/*  480 */         func_70624_b(null);
/*  481 */         e = null;
/*      */       } 
/*  483 */       if (e == null) {
/*  484 */         e = findSomethingToAttack();
/*      */       }
/*  486 */       if (e != null) {
/*      */         
/*  488 */         setAttacking(1);
/*      */         
/*  490 */         if (func_70068_e((Entity)e) < ((9.0F + e.field_70130_N / 2.0F) * (9.0F + e.field_70130_N / 2.0F)))
/*      */         {
/*  492 */           func_70652_k((Entity)e);
/*      */         }
/*      */         
/*      */         return;
/*      */       } 
/*  497 */       setAttacking(0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70629_bd() {
/*  508 */     if (this.field_70153_n != null)
/*  509 */       return;  if (this.field_70170_p.field_72995_K)
/*  510 */       return;  super.func_70629_bd();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  518 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false; 
/*  519 */     if (OreSpawnMain.PlayNicely != 0) return false;
/*      */     
/*  521 */     if (par1EntityLiving == null)
/*      */     {
/*  523 */       return false;
/*      */     }
/*  525 */     if (par1EntityLiving == this)
/*      */     {
/*  527 */       return false;
/*      */     }
/*  529 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*      */       
/*  532 */       return false;
/*      */     }
/*      */     
/*  535 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*      */     
/*  537 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  540 */       return false;
/*      */     }
/*      */     
/*  543 */     if (par1EntityLiving instanceof Leon)
/*      */     {
/*  545 */       return false;
/*      */     }
/*  547 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*      */     {
/*  549 */       return true;
/*      */     }
/*      */     
/*  552 */     if (par1EntityLiving instanceof EntityPlayer) {
/*      */       
/*  554 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/*  555 */       if (p.field_71075_bZ.field_75098_d == true) {
/*  556 */         return false;
/*      */       }
/*  558 */       if (func_70909_n()) {
/*  559 */         return false;
/*      */       }
/*  561 */       return true;
/*      */     } 
/*      */     
/*  564 */     if (!func_70909_n()) {
/*  565 */       if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/*  566 */         return true;
/*      */       }
/*      */     }
/*      */     
/*  570 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/*  575 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/*  576 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(20.0D, 20.0D, 20.0D));
/*  577 */     Collections.sort(var5, this.TargetSorter);
/*  578 */     Iterator<?> var2 = var5.iterator();
/*  579 */     Entity var3 = null;
/*  580 */     EntityLivingBase var4 = null;
/*      */     
/*  582 */     while (var2.hasNext()) {
/*      */       
/*  584 */       var3 = (Entity)var2.next();
/*  585 */       var4 = (EntityLivingBase)var3;
/*      */       
/*  587 */       if (isSuitableTarget(var4, false))
/*      */       {
/*  589 */         return var4;
/*      */       }
/*      */     } 
/*  592 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_145773_az() {
/*  599 */     return false;
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
/*      */   public boolean func_70601_bi() {
/*  611 */     for (int k = -3; k < 3; k++) {
/*      */       
/*  613 */       for (int j = -3; j < 3; j++) {
/*      */         
/*  615 */         for (int i = 0; i < 5; i++) {
/*      */           
/*  617 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/*  618 */           if (bid == Blocks.field_150474_ac) {
/*  619 */             TileEntityMobSpawner tileentitymobspawner = null;
/*  620 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/*  621 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/*  622 */             if (s != null && 
/*  623 */               s.equals("Leonopteryx")) return true;
/*      */           
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*  629 */     if (this.field_70170_p.field_73012_v.nextInt(16) != 0) return false; 
/*  630 */     Leon target = null;
/*  631 */     if (!this.field_70170_p.func_72935_r()) return false; 
/*  632 */     target = (Leon)this.field_70170_p.func_72857_a(Leon.class, this.field_70121_D.func_72314_b(48.0D, 16.0D, 48.0D), (Entity)this);
/*  633 */     if (target != null)
/*      */     {
/*  635 */       return false;
/*      */     }
/*  637 */     if (this.field_70163_u < 50.0D) return false; 
/*  638 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  646 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70056_a(double par1, double par3, double par5, float par7, float par8, int par9) {
/*  657 */     super.func_70056_a(par1, par3, par5, par7, par8, par9);
/*  658 */     this.boatPosRotationIncrements = par9;
/*      */     
/*  660 */     this.boatX = par1;
/*  661 */     this.boatY = par3;
/*  662 */     this.boatZ = par5;
/*  663 */     this.boatYaw = par7;
/*  664 */     this.boatPitch = par8;
/*  665 */     this.boatYawHead = par7;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70016_h(double par1, double par3, double par5) {
/*  675 */     super.func_70016_h(par1, par3, par5);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  681 */     EntityLivingBase e = null;
/*  682 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  683 */     super.func_70071_h_();
/*      */     
/*  685 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*      */     
/*  687 */     if (getActivity() == 1) {
/*  688 */       this.wing_sound++;
/*  689 */       if (this.wing_sound > 20) {
/*      */         
/*  691 */         if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 0.5F, 1.0F); 
/*  692 */         this.wing_sound = 0;
/*      */       } 
/*      */     } 
/*      */     
/*  696 */     if (func_70090_H()) {
/*  697 */       this.field_70181_x += 0.07D;
/*      */     }
/*      */     
/*  700 */     if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  702 */     if (getActivity() == 0 && func_70909_n() && func_70902_q() != null && !func_70906_o()) {
/*  703 */       e = func_70902_q();
/*      */       
/*  705 */       if (e != null && func_70068_e((Entity)e) > 144.0D)
/*      */       {
/*  707 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void fly_without_rider() {
/*  715 */     int xdir = 1;
/*  716 */     int zdir = 1;
/*      */     
/*  718 */     int keep_trying = 50;
/*      */ 
/*      */     
/*  721 */     int do_new = 0;
/*  722 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*      */     
/*  724 */     int has_owner = 0;
/*  725 */     EntityLivingBase e = null;
/*  726 */     double speed_factor = 0.5D;
/*  727 */     double var1 = 0.0D;
/*  728 */     double var3 = 0.0D;
/*  729 */     double var5 = 0.0D;
/*      */ 
/*      */     
/*  732 */     double gh = 1.25D;
/*  733 */     double obstruction_factor = 0.0D;
/*  734 */     double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*  735 */     int toofar = 0;
/*      */     
/*  737 */     if (this.field_70170_p.field_72995_K) {
/*      */       return;
/*      */     }
/*  740 */     if (this.currentFlightTarget == null) {
/*  741 */       do_new = 1;
/*  742 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     } 
/*      */     
/*  745 */     if (func_70906_o())
/*  746 */       return;  if (this.field_70153_n != null)
/*      */       return; 
/*  748 */     if (this.unstick_timer > 0) this.unstick_timer--; 
/*  749 */     if (this.lastX == (int)this.field_70165_t && this.lastZ == (int)this.field_70161_v) {
/*      */       
/*  751 */       this.stuck_count++;
/*  752 */       if (this.stuck_count > 50) {
/*  753 */         this.stuck_count = 0;
/*  754 */         this.unstick_timer = 100;
/*  755 */         this.target_in_sight = false;
/*  756 */         setAttacking(0);
/*  757 */         setActivity(1);
/*  758 */         do_new = 1;
/*      */       } 
/*      */     } else {
/*      */       
/*  762 */       this.stuck_count = 0;
/*  763 */       this.lastX = (int)this.field_70165_t;
/*  764 */       this.lastZ = (int)this.field_70161_v;
/*      */     } 
/*      */     
/*  767 */     if (this.field_70163_u < this.currentFlightTarget.field_71572_b + 2.0D) {
/*  768 */       this.field_70181_x *= 0.7D;
/*  769 */     } else if (this.field_70163_u > this.currentFlightTarget.field_71572_b - 2.0D) {
/*  770 */       this.field_70181_x *= 0.5D;
/*      */     } else {
/*  772 */       this.field_70181_x *= 0.61D;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  777 */     if (this.field_70170_p.field_73012_v.nextInt(300) == 1) do_new = 1;
/*      */ 
/*      */     
/*  780 */     if (func_70909_n() && func_70902_q() != null) {
/*  781 */       e = func_70902_q();
/*  782 */       has_owner = 1;
/*  783 */       ox = e.field_70165_t;
/*  784 */       oy = e.field_70163_u;
/*  785 */       oz = e.field_70161_v;
/*  786 */       if (func_70068_e((Entity)e) > 144.0D) {
/*  787 */         toofar = 1;
/*  788 */         this.target_in_sight = false;
/*  789 */         setAttacking(0);
/*  790 */         this.flyaway = 0;
/*  791 */         do_new = 1;
/*      */       } 
/*      */     } 
/*      */     
/*  795 */     if (this.flyaway > 0) this.flyaway--;
/*      */ 
/*      */     
/*  798 */     if (toofar == 0 && this.unstick_timer == 0 && this.flyaway == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(8) == 1) {
/*      */ 
/*      */ 
/*      */       
/*  802 */       e = findSomethingToAttack();
/*  803 */       if (e != null) {
/*      */         
/*  805 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/*  806 */           setActivity(1);
/*  807 */           setAttacking(0);
/*  808 */           this.target_in_sight = false;
/*  809 */           do_new = 0;
/*  810 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*      */         } else {
/*      */           
/*  813 */           setActivity(1);
/*  814 */           setAttacking(1);
/*  815 */           this.target_in_sight = true;
/*  816 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/*      */           
/*  818 */           do_new = 0;
/*  819 */           if (func_70068_e((Entity)e) < ((7.0F + e.field_70130_N / 2.0F) * (7.0F + e.field_70130_N / 2.0F))) {
/*  820 */             func_70652_k((Entity)e);
/*      */           }
/*      */         } 
/*      */       } else {
/*  824 */         this.target_in_sight = false;
/*  825 */         this.flyaway = 0;
/*  826 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  831 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 4.1F)
/*      */     {
/*  833 */       do_new = 1;
/*      */     }
/*      */ 
/*      */     
/*  837 */     if ((do_new != 0 && !this.target_in_sight) || (do_new != 0 && this.flyaway != 0)) {
/*      */       
/*  839 */       Block bid = Blocks.field_150348_b;
/*  840 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/*  841 */         int gox = (int)this.field_70165_t;
/*  842 */         int goy = (int)this.field_70163_u;
/*  843 */         int goz = (int)this.field_70161_v;
/*  844 */         if (has_owner == 1 && this.unstick_timer == 0) {
/*  845 */           gox = (int)ox;
/*  846 */           goy = (int)oy;
/*  847 */           goz = (int)oz;
/*  848 */           if (this.owner_flying == 0) {
/*  849 */             zdir = this.field_70170_p.field_73012_v.nextInt(12) + 6;
/*  850 */             xdir = this.field_70170_p.field_73012_v.nextInt(12) + 6;
/*      */           } else {
/*  852 */             zdir = this.field_70170_p.field_73012_v.nextInt(8);
/*  853 */             xdir = this.field_70170_p.field_73012_v.nextInt(8);
/*      */           } 
/*      */         } else {
/*  856 */           zdir = this.field_70170_p.field_73012_v.nextInt(20) + 6;
/*  857 */           xdir = this.field_70170_p.field_73012_v.nextInt(20) + 6;
/*      */         } 
/*  859 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) zdir = -zdir; 
/*  860 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) xdir = -xdir; 
/*  861 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
/*  862 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/*  863 */         if (bid == Blocks.field_150350_a && 
/*  864 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/*  865 */           bid = Blocks.field_150348_b;
/*      */         }
/*      */ 
/*      */         
/*  869 */         keep_trying--;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  877 */     obstruction_factor = 0.0D;
/*  878 */     int dist = 2;
/*  879 */     dist += (int)(velocity * 4.0D);
/*      */     
/*  881 */     for (int k = 1; k < dist; k++) {
/*  882 */       for (int i = 1; i < dist * 2; i++) {
/*  883 */         double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/*  884 */         double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/*  885 */         Block bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/*  886 */         if (bid != Blocks.field_150350_a) {
/*  887 */           obstruction_factor += 0.05D;
/*      */         }
/*      */       } 
/*      */     } 
/*  891 */     this.field_70181_x += obstruction_factor * 0.05D;
/*  892 */     this.field_70163_u += obstruction_factor * 0.05D;
/*      */ 
/*      */     
/*  895 */     speed_factor = 0.5D;
/*  896 */     var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/*  897 */     var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/*  898 */     var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/*  899 */     if (this.owner_flying != 0) {
/*  900 */       speed_factor = 1.75D;
/*  901 */       if (func_70909_n() && func_70902_q() != null) {
/*  902 */         e = func_70902_q();
/*  903 */         if (func_70068_e((Entity)e) > 49.0D) {
/*  904 */           speed_factor = 3.5D;
/*      */         }
/*      */       } 
/*      */     } 
/*  908 */     this.field_70159_w += (Math.signum(var1) - this.field_70159_w) * 0.15D * speed_factor;
/*  909 */     this.field_70181_x += (Math.signum(var3) - this.field_70181_x) * 0.21D * speed_factor;
/*  910 */     this.field_70179_y += (Math.signum(var5) - this.field_70179_y) * 0.15D * speed_factor;
/*  911 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/*  912 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/*  913 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*      */     
/*  915 */     this.field_70177_z += var8 / 5.0F;
/*  916 */     func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  926 */     List<Entity> list = null;
/*  927 */     Entity listEntity = null;
/*      */ 
/*      */ 
/*      */     
/*  931 */     double d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/*  932 */     double d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  938 */     double obstruction_factor = 0.0D;
/*      */     
/*  940 */     double relative_g = 0.0D;
/*      */     
/*  942 */     double max_speed = 1.15D;
/*  943 */     double gh = 1.0D;
/*      */ 
/*      */ 
/*      */     
/*  947 */     double rt = 0.0D;
/*      */     
/*  949 */     double pi = 3.1415926545D;
/*  950 */     double deltav = 0.0D;
/*      */ 
/*      */     
/*  953 */     int dist = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  959 */     always_do();
/*      */     
/*  961 */     if (getActivity() == 0) {
/*      */       
/*  963 */       super.func_70636_d();
/*      */     
/*      */     }
/*  966 */     else if (this.field_70128_L) {
/*  967 */       super.func_70636_d();
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  972 */     if (this.field_70128_L) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  977 */     if (this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  982 */       if (this.boatPosRotationIncrements > 0 && getActivity() != 0)
/*      */       {
/*  984 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/*  985 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/*  986 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/*  987 */         func_70107_b(d4, d5, d11);
/*  988 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/*  989 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/*  990 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/*  991 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/*  992 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/*  993 */         this.field_70759_as = this.field_70177_z;
/*      */         
/*  995 */         this.boatPosRotationIncrements--;
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 1006 */       if (this.field_70153_n != null) {
/* 1007 */         setBeingRidden(1);
/*      */       } else {
/* 1009 */         setBeingRidden(0);
/*      */       } 
/* 1011 */       if (getActivity() != 0)
/*      */       {
/*      */         
/* 1014 */         if (this.field_70153_n != null) {
/* 1015 */           EntityPlayer pp = (EntityPlayer)this.field_70153_n;
/*      */ 
/*      */ 
/*      */           
/* 1019 */           if (this.field_70159_w < -2.0D) this.field_70159_w = -2.0D; 
/* 1020 */           if (this.field_70159_w > 2.0D) this.field_70159_w = 2.0D; 
/* 1021 */           if (this.field_70179_y < -2.0D) this.field_70179_y = -2.0D; 
/* 1022 */           if (this.field_70179_y > 2.0D) this.field_70179_y = 2.0D; 
/* 1023 */           double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */           
/* 1026 */           gh = 1.55D;
/* 1027 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)((float)this.field_70163_u - (float)gh), (int)this.field_70161_v);
/* 1028 */           if (bid != Blocks.field_150350_a) {
/* 1029 */             this.field_70181_x += 0.03D;
/* 1030 */             this.field_70163_u += 0.1D;
/*      */           } else {
/*      */             
/* 1033 */             this.field_70181_x -= 0.018D;
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1040 */           obstruction_factor = 0.0D;
/* 1041 */           dist = 3;
/* 1042 */           dist += (int)(velocity * 7.0D);
/*      */           
/* 1044 */           for (int k = 1; k < dist; k++) {
/* 1045 */             for (int i = 1; i < dist * 2; i++) {
/* 1046 */               double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1047 */               double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1048 */               bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 1049 */               if (bid != Blocks.field_150350_a) {
/* 1050 */                 obstruction_factor += 0.05D;
/*      */               }
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1057 */           this.field_70181_x += obstruction_factor * 0.07D;
/* 1058 */           this.field_70163_u += obstruction_factor * 0.07D;
/* 1059 */           if (this.field_70181_x > 2.0D) this.field_70181_x = 2.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1067 */           if (this.field_70153_n != null) {
/*      */ 
/*      */             
/* 1070 */             double d4 = this.field_70153_n.field_70177_z;
/* 1071 */             d4 %= 360.0D;
/* 1072 */             for (; d4 < 0.0D; d4 += 360.0D);
/* 1073 */             double d5 = this.field_70177_z;
/* 1074 */             d5 %= 360.0D;
/* 1075 */             for (; d5 < 0.0D; d5 += 360.0D);
/* 1076 */             relative_g = (d4 - d5) % 180.0D;
/* 1077 */             for (; relative_g < 0.0D; relative_g += 180.0D);
/* 1078 */             if (relative_g > 90.0D) relative_g -= 180.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1085 */             if (velocity > 0.01D) {
/*      */               
/* 1087 */               d4 = 1.85D - velocity;
/* 1088 */               d4 = Math.abs(d4);
/* 1089 */               if (d4 < 0.01D) d4 = 0.01D; 
/* 1090 */               if (d4 > 0.9D) d4 = 0.9D; 
/* 1091 */               this.field_70177_z = this.field_70153_n.field_70177_z + (float)(relative_g * d4);
/*      */             } else {
/*      */               
/* 1094 */               this.field_70177_z = this.field_70153_n.field_70177_z;
/*      */             } 
/* 1096 */             relative_g = Math.abs(relative_g) * velocity;
/* 1097 */             if (relative_g > 50.0D) relative_g = 0.0D;
/*      */           
/*      */           } 
/*      */ 
/*      */           
/* 1102 */           this.field_70125_A = 2.0F * (float)velocity;
/* 1103 */           func_70101_b(this.field_70177_z, this.field_70125_A);
/* 1104 */           this.field_70759_as = this.field_70177_z;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1109 */           double newvelocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1117 */           double rr = Math.atan2(this.field_70153_n.field_70179_y, this.field_70153_n.field_70159_w);
/* 1118 */           double rhm = Math.atan2(this.field_70179_y, this.field_70159_w);
/* 1119 */           double rhdir = Math.toRadians(((this.field_70153_n.field_70177_z + 90.0F) % 360.0F));
/* 1120 */           rt = 0.0D;
/* 1121 */           pi = 3.1415926545D;
/* 1122 */           deltav = 0.0D;
/* 1123 */           float im = pp.field_70701_bs;
/*      */ 
/*      */           
/* 1126 */           if (OreSpawnMain.flyup_keystate != 0) {
/* 1127 */             this.field_70181_x += 0.035D;
/* 1128 */             this.field_70181_x += velocity * 0.038D;
/*      */           } 
/*      */ 
/*      */           
/* 1132 */           double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
/* 1133 */           if (rdv > pi) rdv -= pi * 2.0D; 
/* 1134 */           rdv = Math.abs(rdv);
/* 1135 */           if (Math.abs(newvelocity) < 0.01D) rdv = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1143 */           if (rdv > 1.5D) newvelocity = -newvelocity;
/*      */           
/* 1145 */           if (Math.abs(im) > 0.001F) {
/* 1146 */             if (im > 0.0F) {
/* 1147 */               deltav = 0.028D;
/* 1148 */               if (max_speed > 1.0D) deltav += 0.06D; 
/* 1149 */               if (this.deltasmooth < 0.0F) this.deltasmooth = 0.0F; 
/* 1150 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1151 */               if (this.deltasmooth > deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } else {
/* 1154 */               max_speed = 0.35D;
/*      */               
/* 1156 */               deltav = -0.02D;
/* 1157 */               if (this.deltasmooth > 0.0F) this.deltasmooth = 0.0F; 
/* 1158 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1159 */               if (this.deltasmooth < deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } 
/* 1162 */             newvelocity += this.deltasmooth;
/* 1163 */             if (newvelocity >= 0.0D) {
/* 1164 */               if (newvelocity > max_speed) newvelocity = max_speed; 
/* 1165 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1166 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */             } else {
/* 1168 */               if (newvelocity < -max_speed) newvelocity = -max_speed; 
/* 1169 */               newvelocity = -newvelocity;
/* 1170 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/* 1171 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/*      */             }
/*      */           
/*      */           }
/* 1175 */           else if (newvelocity >= 0.0D) {
/* 1176 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1177 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */           } else {
/* 1179 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/* 1180 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1187 */           func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */ 
/*      */           
/* 1190 */           this.field_70159_w *= 0.985D;
/* 1191 */           this.field_70181_x *= 0.94D;
/* 1192 */           this.field_70179_y *= 0.985D;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1197 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1199 */             list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b(2.25D, 2.0D, 2.25D));
/*      */             
/* 1201 */             if (list != null && !list.isEmpty())
/*      */             {
/* 1203 */               for (int l = 0; l < list.size(); l++) {
/*      */                 
/* 1205 */                 listEntity = list.get(l);
/*      */                 
/* 1207 */                 if (listEntity != this.field_70153_n && !listEntity.field_70128_L && listEntity.func_70104_M())
/*      */                 {
/* 1209 */                   listEntity.func_70108_f((Entity)this);
/*      */                 }
/*      */               } 
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1217 */           fly_with_rider();
/*      */           
/* 1219 */           if (this.field_70153_n != null && this.field_70153_n.field_70128_L)
/*      */           {
/* 1221 */             this.field_70153_n = null;
/*      */           }
/*      */         } else {
/*      */           
/* 1225 */           fly_without_rider();
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void always_do() {
/* 1236 */     EntityLivingBase e = null;
/* 1237 */     EntityPlayer pl = null;
/*      */ 
/*      */     
/* 1240 */     if (this.field_70170_p.field_72995_K) {
/*      */       return;
/*      */     }
/* 1243 */     if (!func_70906_o() && getActivity() == 0 && this.field_70153_n == null && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*      */       
/* 1245 */       e = findSomethingToAttack();
/* 1246 */       if (e != null)
/*      */       {
/*      */         
/* 1249 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */     
/* 1253 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1 && 
/* 1254 */       func_110143_aJ() < mygetMaxHealth())
/*      */     {
/* 1256 */       func_70691_i(2.0F);
/*      */     }
/*      */ 
/*      */     
/* 1260 */     if (func_70906_o())
/*      */       return; 
/* 1262 */     this.owner_flying = 0;
/* 1263 */     if (func_70909_n() && func_70902_q() != null && this.field_70153_n == null && !func_70906_o()) {
/* 1264 */       pl = (EntityPlayer)func_70902_q();
/*      */       
/* 1266 */       if (pl.field_71075_bZ.field_75100_b) {
/* 1267 */         this.owner_flying = 1;
/*      */         
/* 1269 */         setActivity(1);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1274 */     if (func_70909_n() && func_70902_q() != null && !func_70906_o()) {
/* 1275 */       pl = (EntityPlayer)func_70902_q();
/*      */       
/* 1277 */       if (func_70068_e((Entity)pl) > 400.0D)
/*      */       {
/* 1279 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */     
/* 1283 */     if (this.field_70170_p.field_73012_v.nextInt(50) == 1 && !func_70906_o())
/*      */     {
/* 1285 */       if (!this.target_in_sight && this.field_70153_n == null)
/*      */       {
/* 1287 */         if (this.field_70170_p.field_73012_v.nextInt(15) == 1) {
/*      */           
/* 1289 */           setActivity(1);
/*      */         } else {
/*      */           
/* 1292 */           setActivity(0);
/*      */         } 
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void func_70043_V() {
/* 1300 */     if (this.field_70153_n != null) {
/*      */ 
/*      */ 
/*      */       
/* 1304 */       float f = 0.65F;
/* 1305 */       this.field_70153_n.func_70107_b(this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + func_70042_X() + this.field_70153_n.func_70033_W(), this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)));
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
/* 1317 */     String s = "heart";
/*      */     
/* 1319 */     if (!par1)
/*      */     {
/* 1321 */       s = "smoke";
/*      */     }
/*      */     
/* 1324 */     for (int i = 0; i < 20; i++) {
/*      */       
/* 1326 */       double d0 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1327 */       double d1 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1328 */       double d2 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1329 */       this.field_70170_p.func_72869_a(s, this.field_70165_t + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), this.field_70163_u + 0.5D + this.field_70146_Z.nextFloat() * 1.5D, this.field_70161_v + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), d0, d1, d2);
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
/* 1340 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */     
/* 1342 */     if (var2 != null && 
/* 1343 */       var2.field_77994_a <= 0) {
/* 1344 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 1345 */       var2 = null;
/*      */     } 
/*      */ 
/*      */     
/* 1349 */     if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150484_ah) && par1EntityPlayer.func_70068_e((Entity)this) < 49.0D) {
/* 1350 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/* 1352 */         func_70903_f(true);
/* 1353 */         func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 1354 */         func_70908_e(true);
/* 1355 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 1356 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */       } 
/*      */ 
/*      */       
/* 1360 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1361 */         var2.field_77994_a--;
/* 1362 */         if (var2.field_77994_a <= 0) {
/* 1363 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/* 1366 */       return true;
/*      */     } 
/*      */     
/* 1369 */     if (!func_70909_n()) {
/* 1370 */       if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 49.0D) {
/* 1371 */         if (!this.field_70170_p.field_72995_K) {
/* 1372 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 1373 */             func_70903_f(true);
/* 1374 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 1375 */             func_70908_e(true);
/* 1376 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 1377 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */           } else {
/*      */             
/* 1380 */             func_70908_e(false);
/* 1381 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */           } 
/*      */         }
/* 1384 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1385 */           var2.field_77994_a--;
/* 1386 */           if (var2.field_77994_a <= 0) {
/* 1387 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1390 */         return true;
/*      */       } 
/*      */     } else {
/*      */       
/* 1394 */       if (!func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/* 1395 */         return false;
/*      */       }
/*      */       
/* 1398 */       if (var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 49.0D) {
/* 1399 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1401 */           par1EntityPlayer.func_70078_a((Entity)this);
/*      */           
/* 1403 */           setActivity(1);
/* 1404 */           func_70904_g(false);
/*      */         } 
/* 1406 */         return true;
/*      */       } 
/*      */       
/* 1409 */       if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 49.0D) {
/* 1410 */         if (this.field_70170_p.field_72995_K) {
/* 1411 */           func_70908_e(true);
/* 1412 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1415 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 1416 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         }
/* 1418 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1419 */           var2.field_77994_a--;
/* 1420 */           if (var2.field_77994_a <= 0) {
/* 1421 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1424 */         return true;
/*      */       } 
/* 1426 */       if (var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 49.0D) {
/*      */         
/* 1428 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1430 */           func_70903_f(false);
/* 1431 */           func_152115_b("");
/* 1432 */           func_70908_e(false);
/* 1433 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */         } 
/* 1435 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1436 */           var2.field_77994_a--;
/* 1437 */           if (var2.field_77994_a <= 0) {
/* 1438 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1441 */         return true;
/*      */       } 
/* 1443 */       if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 49.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */         
/* 1445 */         func_94058_c(var2.func_82833_r());
/* 1446 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1448 */           var2.field_77994_a--;
/* 1449 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1451 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1454 */         return true;
/*      */       } 
/* 1456 */       if (var2 != null && par1EntityPlayer.func_70068_e((Entity)this) < 49.0D && this.field_70153_n == null) {
/*      */         
/* 1458 */         if (!func_70906_o()) {
/* 1459 */           func_70904_g(true);
/* 1460 */           setActivity(0);
/*      */         } else {
/* 1462 */           func_70904_g(false);
/* 1463 */           setActivity(0);
/*      */         } 
/* 1465 */         return true;
/*      */       } 
/*      */     } 
/*      */     
/* 1469 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/* 1477 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/* 1483 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/* 1488 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1489 */       return;  this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public int getActivity() {
/* 1494 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/* 1499 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1500 */       return;  this.field_70180_af.func_75692_b(21, Integer.valueOf(par1));
/*      */   }
/*      */   
/*      */   public int getBeingRidden() {
/* 1504 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setBeingRidden(int par1) {
/* 1509 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1510 */       return;  this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 1519 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/* 1527 */     if (func_104002_bU()) return false; 
/* 1528 */     if (this.field_70153_n != null) {
/* 1529 */       return false;
/*      */     }
/* 1531 */     if (func_70909_n()) {
/* 1532 */       return false;
/*      */     }
/* 1534 */     return true;
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
/* 1545 */     super.func_70014_b(par1NBTTagCompound);
/*      */     
/* 1547 */     par1NBTTagCompound.func_74768_a("LeonAttacking", getAttacking());
/* 1548 */     par1NBTTagCompound.func_74768_a("LeonActivity", getActivity());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 1558 */     super.func_70037_a(par1NBTTagCompound);
/*      */     
/* 1560 */     setAttacking(par1NBTTagCompound.func_74762_e("LeonAttacking"));
/* 1561 */     setActivity(par1NBTTagCompound.func_74762_e("LeonActivity"));
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Leon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */