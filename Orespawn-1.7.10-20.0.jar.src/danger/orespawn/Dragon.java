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
/*      */ import net.minecraft.entity.projectile.EntitySmallFireball;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
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
/*      */ public class Dragon
/*      */   extends EntityTameable
/*      */ {
/*      */   private int boatPosRotationIncrements;
/*      */   private double boatX;
/*      */   private double boatY;
/*      */   private double boatZ;
/*      */   private double boatYaw;
/*      */   private double boatPitch;
/*      */   private double boatYawHead;
/*   81 */   private int updateit = 1;
/*   82 */   private int color = 1;
/*   83 */   private int playing = 0;
/*   84 */   private GenericTargetSorter TargetSorter = null;
/*   85 */   private RenderInfo renderdata = new RenderInfo();
/*   86 */   private int hurt_timer = 0;
/*   87 */   private int wing_sound = 0;
/*   88 */   private ChunkCoordinates currentFlightTarget = null;
/*      */   private boolean target_in_sight = false;
/*   90 */   private int owner_flying = 0;
/*   91 */   private int flyaway = 0;
/*   92 */   private int stuck_count = 0;
/*   93 */   private int lastX = 0;
/*   94 */   private int lastZ = 0;
/*   95 */   private int unstick_timer = 0;
/*   96 */   private int fireballticker = 0;
/*   97 */   private float moveSpeed = 0.32F;
/*   98 */   private float deltasmooth = 0.0F;
/*   99 */   private int dragontype = 0;
/*      */   private int closest;
/*      */   private int tx;
/*      */   private int ty;
/*      */   private int tz; public Dragon(World par1World, double par2, double par4, double par6) { this(par1World); func_70107_b(par2, par4 + this.field_70129_M, par6); this.field_70159_w = 0.0D; this.field_70181_x = 0.0D; this.field_70179_y = 0.0D; this.field_70169_q = par2; this.field_70167_r = par4; this.field_70166_s = par6; } protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*      */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*      */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  106 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(35.0D); } public boolean shouldRiderSit() { return true; } public int getTrackingRange() { return 128; } public Dragon(World par1World) { super(par1World);
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
/*  267 */     this.closest = 99999;
/*  268 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(1.5F, 1.25F); func_70661_as().func_75491_a(true); this.field_70728_aV = 100; this.field_70174_ab = 1000; this.field_70178_ae = true; func_70904_g(false); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 1.1F, 12.0F, 2.0F)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false)); this.field_70714_bg.func_75776_a(3, new MyEntityAIWander((EntityCreature)this, 0.75F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 9.0F)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this)); if (OreSpawnMain.PlayNicely == 0)
/*      */       this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLiving.class, 0, true, false, IMob.field_82192_a));  this.field_70715_bh.func_75776_a(2, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); this.field_70153_n = null; this.TargetSorter = new GenericTargetSorter((Entity)this); this.renderdata = new RenderInfo(); }
/*      */   public int getUpdateFrequency() { return 10; }
/*  271 */   public boolean sendsVelocityUpdates() { return true; } protected void func_70069_a(float par1) {} protected void func_70064_a(double par1, boolean par3) {} private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*      */ 
/*      */     
/*      */     int i;
/*      */     
/*  276 */     for (i = -dy; i <= dy; i++) {
/*  277 */       for (int j = -dz; j <= dz; j++) {
/*  278 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/*  279 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  280 */           int d = dx * dx + j * j + i * i;
/*  281 */           if (d < this.closest) {
/*  282 */             this.closest = d;
/*  283 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/*  284 */             found++;
/*      */           } 
/*      */         } 
/*  287 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/*  288 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  289 */           int d = dx * dx + j * j + i * i;
/*  290 */           if (d < this.closest) {
/*  291 */             this.closest = d;
/*  292 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/*  293 */             found++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  299 */     for (i = -dx; i <= dx; i++) {
/*  300 */       for (int j = -dz; j <= dz; j++) {
/*  301 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/*  302 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  303 */           int d = dy * dy + j * j + i * i;
/*  304 */           if (d < this.closest) {
/*  305 */             this.closest = d;
/*  306 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/*  307 */             found++;
/*      */           } 
/*      */         } 
/*  310 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/*  311 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  312 */           int d = dy * dy + j * j + i * i;
/*  313 */           if (d < this.closest) {
/*  314 */             this.closest = d;
/*  315 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/*  316 */             found++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  322 */     for (i = -dx; i <= dx; i++) {
/*  323 */       for (int j = -dy; j <= dy; j++) {
/*  324 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/*  325 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  326 */           int d = dz * dz + j * j + i * i;
/*  327 */           if (d < this.closest) {
/*  328 */             this.closest = d;
/*  329 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/*  330 */             found++;
/*      */           } 
/*      */         } 
/*  333 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/*  334 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  335 */           int d = dz * dz + j * j + i * i;
/*  336 */           if (d < this.closest) {
/*  337 */             this.closest = d;
/*  338 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/*  339 */             found++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  345 */     if (found != 0) return true; 
/*  346 */     return false; } protected boolean func_70041_e_() { return true; } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); this.field_70180_af.func_75682_a(21, Byte.valueOf((byte)0)); this.field_70180_af.func_75682_a(22, Integer.valueOf(0)); this.field_70180_af.func_75682_a(24, Integer.valueOf(1)); setActivity(0); setAttacking(0); func_70903_f(false); if (this.renderdata == null) this.renderdata = new RenderInfo();  this.renderdata.rf1 = 0.0F; this.renderdata.rf2 = 0.0F; this.renderdata.rf3 = 0.0F; this.renderdata.rf4 = 0.0F; this.renderdata.ri1 = 0; this.renderdata.ri2 = 0; this.renderdata.ri3 = 0; this.renderdata.ri4 = 0; } public int mygetMaxHealth() { return 200; } public int getDragonHealth() { return (int)func_110143_aJ(); }
/*      */   public RenderInfo getRenderInfo() { return this.renderdata; }
/*      */   public void setRenderInfo(RenderInfo r) { this.renderdata.rf1 = r.rf1; this.renderdata.rf2 = r.rf2; this.renderdata.rf3 = r.rf3; this.renderdata.rf4 = r.rf4; this.renderdata.ri1 = r.ri1; this.renderdata.ri2 = r.ri2; this.renderdata.ri3 = r.ri3; this.renderdata.ri4 = r.ri4; }
/*      */   public int func_70658_aO() { return 14; }
/*      */   protected void func_70664_aZ() { super.func_70664_aZ(); this.field_70181_x += 0.25D; }
/*      */   public boolean func_70650_aV() { return true; }
/*  352 */   public boolean func_70648_aU() { return true; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String func_70639_aQ() {
/*  360 */     if (func_70906_o())
/*      */     {
/*  362 */       return null;
/*      */     }
/*  364 */     if (getAttacking() == 1 && this.field_70153_n == null) {
/*  365 */       return "orespawn:roar";
/*      */     }
/*      */     
/*  368 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  376 */     return "orespawn:alo_hurt";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  384 */     return "orespawn:alo_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  391 */     return 0.6F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float func_70647_i() {
/*  398 */     return 0.75F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70104_M() {
/*  407 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double func_70042_X() {
/*  415 */     return 1.3D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  423 */     return Items.field_151082_bd;
/*      */   }
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRand(Item index, int par1) {
/*  428 */     EntityItem var3 = null;
/*  429 */     ItemStack is = new ItemStack(index, par1, 0);
/*      */     
/*  431 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
/*      */     
/*  433 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  434 */     return is;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  442 */     int i = 1 + this.field_70170_p.field_73012_v.nextInt(6);
/*  443 */     for (int var4 = 0; var4 < i; var4++) {
/*  444 */       dropItemRand(Items.field_151082_bd, 1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  455 */     double ks = 1.75D;
/*  456 */     double inair = 0.1D;
/*  457 */     float iskraken = 1.0F;
/*  458 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */       
/*  460 */       if (par1Entity instanceof Kraken) iskraken = 2.0F; 
/*  461 */       par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), iskraken * 35.0F);
/*      */       
/*  463 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  464 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/*  465 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */     } 
/*  467 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  475 */     boolean ret = false;
/*  476 */     Entity e = null;
/*      */     
/*  478 */     if (this.hurt_timer > 0) return false;
/*      */     
/*  480 */     if (par1DamageSource.func_76355_l().equals("cactus")) {
/*  481 */       return ret;
/*      */     }
/*  483 */     if (par1DamageSource.func_76355_l().equals("inFire")) {
/*  484 */       return ret;
/*      */     }
/*  486 */     if (par1DamageSource.func_76355_l().equals("onFire")) {
/*  487 */       return ret;
/*      */     }
/*  489 */     if (par1DamageSource.func_76355_l().equals("lava")) {
/*  490 */       return ret;
/*      */     }
/*  492 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  493 */       return ret;
/*      */     }
/*      */     
/*  496 */     func_70904_g(false);
/*  497 */     setActivity(1);
/*      */     
/*  499 */     e = par1DamageSource.func_76346_g();
/*      */ 
/*      */     
/*  502 */     if (e != null && e instanceof BetterFireball && this.dragontype == 0) {
/*      */       
/*  504 */       e.func_70106_y();
/*  505 */       return ret;
/*      */     } 
/*  507 */     if (e != null && e instanceof IceBall && this.dragontype != 0) {
/*      */       
/*  509 */       e.func_70106_y();
/*  510 */       return ret;
/*      */     } 
/*  512 */     if (e != null && e instanceof WaterBall && this.dragontype != 0) {
/*      */       
/*  514 */       e.func_70106_y();
/*  515 */       return ret;
/*      */     } 
/*  517 */     if (e != null && e instanceof EntitySmallFireball && this.dragontype == 0) {
/*      */       
/*  519 */       e.func_70106_y();
/*  520 */       return ret;
/*      */     } 
/*  522 */     if (e != null && e instanceof Dragon) {
/*  523 */       return false;
/*      */     }
/*  525 */     if (e != null && e instanceof Spyro) {
/*  526 */       return false;
/*      */     }
/*      */     
/*  529 */     ret = super.func_70097_a(par1DamageSource, par2);
/*  530 */     this.hurt_timer = 20;
/*      */     
/*  532 */     if (e != null && e instanceof EntityLivingBase) {
/*      */       
/*  534 */       if (func_70909_n() && 
/*  535 */         e instanceof EntityPlayer) {
/*  536 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  540 */       func_70624_b((EntityLivingBase)e);
/*  541 */       func_70784_b(e);
/*  542 */       func_70661_as().func_75497_a(e, 1.2D);
/*  543 */       ret = true;
/*      */     } 
/*      */     
/*  546 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70619_bc() {
/*  552 */     EntityLivingBase e = null;
/*  553 */     super.func_70619_bc();
/*      */ 
/*      */     
/*  556 */     if (!func_70906_o() && getActivity() == 0 && this.field_70153_n == null && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*      */       
/*  558 */       e = findSomethingToAttack();
/*  559 */       if (e != null)
/*      */       {
/*      */         
/*  562 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void always_do() {
/*  569 */     EntityPlayer p = null;
/*      */ 
/*      */     
/*  572 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1 && 
/*  573 */       func_110143_aJ() < mygetMaxHealth())
/*      */     {
/*  575 */       func_70691_i(2.0F);
/*      */     }
/*      */ 
/*      */     
/*  579 */     if (func_70906_o())
/*      */       return; 
/*  581 */     this.owner_flying = 0;
/*  582 */     if (func_70909_n() && func_70902_q() != null && this.field_70153_n == null && !func_70906_o()) {
/*  583 */       p = (EntityPlayer)func_70902_q();
/*      */       
/*  585 */       if (p.field_71075_bZ.field_75100_b) {
/*  586 */         this.owner_flying = 1;
/*      */         
/*  588 */         setActivity(1);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  593 */     if (func_70909_n() && func_70902_q() != null && !func_70906_o()) {
/*  594 */       p = (EntityPlayer)func_70902_q();
/*      */       
/*  596 */       if (func_70068_e((Entity)p) > 400.0D)
/*      */       {
/*  598 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */     
/*  602 */     if (this.field_70170_p.field_73012_v.nextInt(50) == 1 && !func_70906_o())
/*      */     {
/*  604 */       if (!this.target_in_sight && this.field_70153_n == null)
/*      */       {
/*  606 */         if (this.field_70170_p.field_73012_v.nextInt(15) == 1) {
/*      */           
/*  608 */           setActivity(1);
/*      */         } else {
/*      */           
/*  611 */           setActivity(0);
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  617 */     if (this.field_70170_p.field_73012_v.nextInt(25) == 0 && !this.target_in_sight && this.field_70153_n == null) {
/*      */ 
/*      */ 
/*      */       
/*  621 */       this.closest = 99999;
/*  622 */       this.tx = this.ty = this.tz = 0;
/*  623 */       for (int i = 1; i < 11; i++) {
/*  624 */         int j = i;
/*  625 */         if (j > 4) j = 4; 
/*  626 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/*  627 */           break;  if (i >= 6) i++;
/*      */       
/*      */       } 
/*  630 */       if (this.closest < 99999) {
/*      */         
/*  632 */         setActivity(0);
/*  633 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.0D);
/*  634 */         if (func_70058_J()) {
/*  635 */           func_70691_i(1.0F);
/*  636 */           func_85030_a("splash", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void fly_with_rider() {
/*  644 */     EntityLivingBase e = null;
/*  645 */     int freq = 7;
/*      */ 
/*      */     
/*  648 */     if (this.field_70128_L)
/*      */       return; 
/*  650 */     if (func_70906_o())
/*  651 */       return;  if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  653 */     if (this.field_70170_p.field_73012_v.nextInt(freq) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */       
/*  655 */       if (this.field_70170_p.field_73012_v.nextInt(250) == 0) {
/*  656 */         func_70624_b(null);
/*      */       }
/*  658 */       e = func_70638_az();
/*  659 */       if (e != null && !e.func_70089_S()) {
/*  660 */         func_70624_b(null);
/*  661 */         e = null;
/*      */       } 
/*  663 */       if (e == null) {
/*  664 */         e = findSomethingToAttack();
/*      */       }
/*      */       
/*  667 */       if (e != null) {
/*      */ 
/*      */         
/*  670 */         setAttacking(1);
/*      */         
/*  672 */         if (func_70068_e((Entity)e) < ((7.0F + e.field_70130_N / 2.0F) * (7.0F + e.field_70130_N / 2.0F)))
/*      */         {
/*  674 */           func_70652_k((Entity)e);
/*      */         }
/*      */         
/*      */         return;
/*      */       } 
/*  679 */       setAttacking(0);
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
/*      */   protected void func_70629_bd() {
/*  692 */     if (this.field_70153_n != null)
/*  693 */       return;  super.func_70629_bd();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  701 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*      */     
/*  703 */     if (par1EntityLiving == null)
/*      */     {
/*  705 */       return false;
/*      */     }
/*  707 */     if (par1EntityLiving == this)
/*      */     {
/*  709 */       return false;
/*      */     }
/*  711 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*      */       
/*  714 */       return false;
/*      */     }
/*  716 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  719 */       return false;
/*      */     }
/*  721 */     if (par1EntityLiving instanceof LurkingTerror)
/*      */     {
/*  723 */       return false;
/*      */     }
/*  725 */     if (par1EntityLiving instanceof EnderReaper)
/*      */     {
/*  727 */       return false;
/*      */     }
/*  729 */     if (par1EntityLiving instanceof TerribleTerror)
/*      */     {
/*  731 */       return false;
/*      */     }
/*  733 */     if (par1EntityLiving instanceof LeafMonster)
/*      */     {
/*  735 */       return false;
/*      */     }
/*  737 */     if (par1EntityLiving instanceof CreepingHorror)
/*      */     {
/*  739 */       return false;
/*      */     }
/*  741 */     if (par1EntityLiving instanceof Triffid)
/*      */     {
/*  743 */       return false;
/*      */     }
/*  745 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*      */     {
/*  747 */       return true;
/*      */     }
/*  749 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/*      */       
/*  752 */       return true;
/*      */     }
/*  754 */     if (par1EntityLiving instanceof Kraken)
/*      */     {
/*      */       
/*  757 */       return true;
/*      */     }
/*  759 */     if (par1EntityLiving instanceof EntityPlayer)
/*      */     {
/*  761 */       return false;
/*      */     }
/*      */     
/*  764 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/*  769 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/*  770 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(20.0D, 20.0D, 20.0D));
/*  771 */     Collections.sort(var5, this.TargetSorter);
/*  772 */     Iterator<?> var2 = var5.iterator();
/*  773 */     Entity var3 = null;
/*  774 */     EntityLivingBase var4 = null;
/*      */     
/*  776 */     while (var2.hasNext()) {
/*      */       
/*  778 */       var3 = (Entity)var2.next();
/*  779 */       var4 = (EntityLivingBase)var3;
/*      */       
/*  781 */       if (isSuitableTarget(var4, false))
/*      */       {
/*  783 */         return var4;
/*      */       }
/*      */     } 
/*  786 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_145773_az() {
/*  793 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  801 */     Dragon target = null;
/*  802 */     if (!this.field_70170_p.func_72935_r()) return false; 
/*  803 */     target = (Dragon)this.field_70170_p.func_72857_a(Dragon.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D), (Entity)this);
/*  804 */     if (target != null)
/*      */     {
/*  806 */       return false;
/*      */     }
/*  808 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) return true; 
/*  809 */     if (this.field_70163_u < 50.0D) return false; 
/*  810 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  818 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
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
/*  830 */     super.func_70056_a(par1, par3, par5, par7, par8, par9);
/*  831 */     this.boatPosRotationIncrements = par9;
/*      */ 
/*      */     
/*  834 */     this.boatX = par1;
/*  835 */     this.boatY = par3;
/*  836 */     this.boatZ = par5;
/*  837 */     this.boatYaw = par7;
/*  838 */     this.boatPitch = par8;
/*  839 */     this.boatYawHead = par7;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70016_h(double par1, double par3, double par5) {
/*  849 */     super.func_70016_h(par1, par3, par5);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  855 */     EntityLivingBase e = null;
/*  856 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  857 */     super.func_70071_h_();
/*      */     
/*  859 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*      */     
/*  861 */     if (getActivity() == 1) {
/*  862 */       this.wing_sound++;
/*  863 */       if (this.wing_sound > 20) {
/*      */         
/*  865 */         if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 0.5F, 1.0F); 
/*  866 */         this.wing_sound = 0;
/*      */       } 
/*      */     } 
/*      */     
/*  870 */     if (func_70090_H()) {
/*  871 */       this.field_70181_x += 0.07D;
/*      */     }
/*      */     
/*  874 */     if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  876 */     if (getActivity() == 0 && func_70909_n() && func_70902_q() != null && !func_70906_o()) {
/*  877 */       e = func_70902_q();
/*      */       
/*  879 */       if (func_70068_e((Entity)e) > 144.0D)
/*      */       {
/*  881 */         setActivity(1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void fly_without_rider() {
/*  889 */     int xdir = 1;
/*  890 */     int zdir = 1;
/*      */     
/*  892 */     int keep_trying = 50;
/*      */ 
/*      */     
/*  895 */     int do_new = 0;
/*  896 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*      */     
/*  898 */     int has_owner = 0;
/*  899 */     EntityLivingBase e = null;
/*  900 */     double speed_factor = 0.5D;
/*  901 */     double var1 = 0.0D;
/*  902 */     double var3 = 0.0D;
/*  903 */     double var5 = 0.0D;
/*  904 */     double yoff = 1.25D;
/*  905 */     double xzoff = 2.25D;
/*      */ 
/*      */ 
/*      */     
/*  909 */     double gh = 1.25D;
/*  910 */     double obstruction_factor = 0.0D;
/*  911 */     double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*  912 */     EntitySmallFireball sf = null;
/*  913 */     BetterFireball bf = null;
/*  914 */     IceBall ib = null;
/*  915 */     WaterBall wb = null;
/*  916 */     int toofar = 0;
/*      */ 
/*      */     
/*  919 */     if (this.currentFlightTarget == null) {
/*  920 */       do_new = 1;
/*  921 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     } 
/*      */     
/*  924 */     if (func_70906_o())
/*  925 */       return;  if (this.field_70153_n != null)
/*      */       return; 
/*  927 */     if (this.unstick_timer > 0) this.unstick_timer--; 
/*  928 */     if (this.lastX == (int)this.field_70165_t && this.lastZ == (int)this.field_70161_v) {
/*      */       
/*  930 */       this.stuck_count++;
/*  931 */       if (this.stuck_count > 50) {
/*  932 */         this.stuck_count = 0;
/*  933 */         this.unstick_timer = 100;
/*  934 */         this.target_in_sight = false;
/*  935 */         setAttacking(0);
/*  936 */         do_new = 1;
/*      */       } 
/*      */     } else {
/*  939 */       this.stuck_count = 0;
/*  940 */       this.lastX = (int)this.field_70165_t;
/*  941 */       this.lastZ = (int)this.field_70161_v;
/*      */     } 
/*      */     
/*  944 */     if (this.field_70163_u < this.currentFlightTarget.field_71572_b + 2.0D) {
/*  945 */       this.field_70181_x *= 0.7D;
/*  946 */     } else if (this.field_70163_u > this.currentFlightTarget.field_71572_b - 2.0D) {
/*  947 */       this.field_70181_x *= 0.5D;
/*      */     } else {
/*  949 */       this.field_70181_x *= 0.61D;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  954 */     if (this.field_70170_p.field_73012_v.nextInt(300) == 1) do_new = 1;
/*      */ 
/*      */     
/*  957 */     if (func_70909_n() && func_70902_q() != null) {
/*  958 */       e = func_70902_q();
/*  959 */       has_owner = 1;
/*  960 */       ox = e.field_70165_t;
/*  961 */       oy = e.field_70163_u;
/*  962 */       oz = e.field_70161_v;
/*  963 */       if (func_70068_e((Entity)e) > 144.0D) {
/*  964 */         toofar = 1;
/*  965 */         this.target_in_sight = false;
/*  966 */         setAttacking(0);
/*  967 */         this.flyaway = 0;
/*  968 */         do_new = 1;
/*      */       } 
/*      */     } 
/*      */     
/*  972 */     if (this.flyaway > 0) this.flyaway--;
/*      */ 
/*      */     
/*  975 */     if (toofar == 0 && this.unstick_timer == 0 && this.flyaway == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(9) == 1) {
/*      */ 
/*      */ 
/*      */       
/*  979 */       e = findSomethingToAttack();
/*  980 */       if (e != null) {
/*      */         
/*  982 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/*  983 */           setActivity(1);
/*  984 */           setAttacking(0);
/*  985 */           this.target_in_sight = false;
/*  986 */           do_new = 0;
/*  987 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*      */         } else {
/*      */           
/*  990 */           setActivity(1);
/*  991 */           setAttacking(1);
/*  992 */           this.target_in_sight = true;
/*  993 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/*      */           
/*  995 */           do_new = 0;
/*  996 */           if (func_70068_e((Entity)e) < ((5.0F + e.field_70130_N / 2.0F) * (5.0F + e.field_70130_N / 2.0F))) {
/*  997 */             func_70652_k((Entity)e);
/*  998 */             this.flyaway = 5 + this.field_70170_p.field_73012_v.nextInt(10);
/*  999 */             do_new = 1;
/* 1000 */           } else if (func_70068_e((Entity)e) < 256.0D && !func_70090_H()) {
/*      */             
/* 1002 */             if (getDragonFire() >= 1) {
/* 1003 */               double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1004 */               double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*      */               
/* 1006 */               if (this.dragontype == 0) {
/* 1007 */                 if (getDragonFire() == 1) {
/* 1008 */                   sf = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff, e.field_70161_v - cz);
/* 1009 */                   sf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 1010 */                   sf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1011 */                   this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1012 */                   this.field_70170_p.func_72838_d((Entity)sf);
/*      */                 } else {
/* 1014 */                   bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff, e.field_70161_v - cz);
/* 1015 */                   bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 1016 */                   bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1017 */                   this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1018 */                   this.field_70170_p.func_72838_d((Entity)bf);
/*      */                 }
/*      */               
/* 1021 */               } else if (getDragonFire() == 1) {
/*      */ 
/*      */ 
/*      */                 
/* 1025 */                 wb = new WaterBall(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 1026 */                 wb.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)), this.field_70759_as, this.field_70125_A);
/* 1027 */                 var3 = e.field_70165_t - wb.field_70165_t;
/* 1028 */                 var5 = e.field_70163_u + 0.25D - wb.field_70163_u;
/* 1029 */                 double d = e.field_70161_v - wb.field_70161_v;
/* 1030 */                 float var9 = MathHelper.func_76133_a(var3 * var3 + d * d) * 0.2F;
/* 1031 */                 wb.func_70186_c(var3, var5 + var9, d, 1.4F, 5.0F);
/* 1032 */                 this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1033 */                 this.field_70170_p.func_72838_d((Entity)wb);
/*      */               } else {
/* 1035 */                 ib = new IceBall(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 1036 */                 ib.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)), this.field_70759_as, this.field_70125_A);
/* 1037 */                 ib.setSpecial();
/* 1038 */                 ib.setIceBall();
/* 1039 */                 var3 = e.field_70165_t - ib.field_70165_t;
/* 1040 */                 var5 = e.field_70163_u + 0.25D - ib.field_70163_u;
/* 1041 */                 double d = e.field_70161_v - ib.field_70161_v;
/* 1042 */                 float var9 = MathHelper.func_76133_a(var3 * var3 + d * d) * 0.2F;
/* 1043 */                 ib.func_70186_c(var3, var5 + var9, d, 1.4F, 5.0F);
/* 1044 */                 this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1045 */                 this.field_70170_p.func_72838_d((Entity)ib);
/*      */               }
/*      */             
/*      */             }
/*      */           
/*      */           } 
/*      */         } 
/*      */       } else {
/*      */         
/* 1054 */         this.target_in_sight = false;
/* 1055 */         this.flyaway = 0;
/* 1056 */         setAttacking(0);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1061 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/* 1062 */       do_new = 1;
/*      */     }
/*      */ 
/*      */     
/* 1066 */     if ((do_new != 0 && !this.target_in_sight) || (do_new != 0 && this.flyaway != 0)) {
/*      */       
/* 1068 */       Block bid = Blocks.field_150348_b;
/* 1069 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 1070 */         int gox = (int)this.field_70165_t;
/* 1071 */         int goy = (int)this.field_70163_u;
/* 1072 */         int goz = (int)this.field_70161_v;
/* 1073 */         if (has_owner == 1 && this.unstick_timer == 0) {
/* 1074 */           gox = (int)ox;
/* 1075 */           goy = (int)oy;
/* 1076 */           goz = (int)oz;
/* 1077 */           if (this.owner_flying == 0) {
/* 1078 */             zdir = this.field_70170_p.field_73012_v.nextInt(10) + 4;
/* 1079 */             xdir = this.field_70170_p.field_73012_v.nextInt(10) + 4;
/*      */           } else {
/* 1081 */             zdir = this.field_70170_p.field_73012_v.nextInt(6);
/* 1082 */             xdir = this.field_70170_p.field_73012_v.nextInt(6);
/*      */           } 
/*      */         } else {
/* 1085 */           zdir = this.field_70170_p.field_73012_v.nextInt(10) + 16;
/* 1086 */           xdir = this.field_70170_p.field_73012_v.nextInt(10) + 16;
/*      */         } 
/* 1088 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) zdir = -zdir; 
/* 1089 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) xdir = -xdir; 
/* 1090 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
/* 1091 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 1092 */         if (bid == Blocks.field_150350_a && 
/* 1093 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 1094 */           bid = Blocks.field_150348_b;
/*      */         }
/*      */         
/* 1097 */         keep_trying--;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1105 */     obstruction_factor = 0.0D;
/* 1106 */     int dist = 2;
/* 1107 */     dist += (int)(velocity * 4.0D);
/*      */     
/* 1109 */     for (int k = 1; k < dist; k++) {
/* 1110 */       for (int i = 1; i < dist * 2; i++) {
/* 1111 */         double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1112 */         double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1113 */         Block bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 1114 */         if (bid != Blocks.field_150350_a) {
/* 1115 */           obstruction_factor += 0.05D;
/*      */         }
/*      */       } 
/*      */     } 
/* 1119 */     this.field_70181_x += obstruction_factor * 0.05D;
/* 1120 */     this.field_70163_u += obstruction_factor * 0.05D;
/*      */ 
/*      */     
/* 1123 */     speed_factor = 0.5D;
/* 1124 */     var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 1125 */     var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 1126 */     var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 1127 */     if (this.owner_flying != 0) {
/* 1128 */       speed_factor = 1.75D;
/* 1129 */       if (func_70909_n() && func_70902_q() != null) {
/* 1130 */         e = func_70902_q();
/* 1131 */         if (func_70068_e((Entity)e) > 49.0D) {
/* 1132 */           speed_factor = 3.5D;
/*      */         }
/*      */       } 
/*      */     } 
/* 1136 */     this.field_70159_w += (Math.signum(var1) - this.field_70159_w) * 0.15D * speed_factor;
/* 1137 */     this.field_70181_x += (Math.signum(var3) - this.field_70181_x) * 0.21D * speed_factor;
/* 1138 */     this.field_70179_y += (Math.signum(var5) - this.field_70179_y) * 0.15D * speed_factor;
/* 1139 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 1140 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 1141 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*      */     
/* 1143 */     this.field_70177_z += var8 / 4.0F;
/* 1144 */     func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/* 1154 */     List<Entity> list = null;
/* 1155 */     Entity listEntity = null;
/*      */ 
/*      */ 
/*      */     
/* 1159 */     double d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/* 1160 */     double d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1166 */     double obstruction_factor = 0.0D;
/*      */     
/* 1168 */     double relative_g = 0.0D;
/*      */     
/* 1170 */     double max_speed = 0.95D;
/* 1171 */     double gh = 1.0D;
/*      */ 
/*      */ 
/*      */     
/* 1175 */     double rt = 0.0D;
/*      */     
/* 1177 */     double pi = 3.1415926545D;
/* 1178 */     double deltav = 0.0D;
/*      */ 
/*      */     
/* 1181 */     int dist = 2;
/*      */     
/* 1183 */     BetterFireball bf = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1189 */     if (getActivity() == 0) {
/*      */       
/* 1191 */       super.func_70636_d();
/*      */     
/*      */     }
/* 1194 */     else if (this.field_70128_L) {
/* 1195 */       super.func_70636_d();
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1200 */     if (this.field_70128_L) {
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
/* 1213 */     if (this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1218 */       if (this.boatPosRotationIncrements > 0 && getActivity() != 0)
/*      */       {
/* 1220 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/* 1221 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/* 1222 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/* 1223 */         func_70107_b(d4, d5, d11);
/*      */         
/* 1225 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/* 1226 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/* 1227 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/* 1228 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/* 1229 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/* 1230 */         this.field_70759_as = this.field_70177_z;
/*      */         
/* 1232 */         this.boatPosRotationIncrements--;
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1240 */       if (getActivity() != 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1246 */         if (this.fireballticker > 0) this.fireballticker--;
/*      */         
/* 1248 */         if (this.field_70153_n != null) {
/* 1249 */           EntityPlayer pp = (EntityPlayer)this.field_70153_n;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1255 */           if (this.field_70159_w < -2.0D) this.field_70159_w = -2.0D; 
/* 1256 */           if (this.field_70159_w > 2.0D) this.field_70159_w = 2.0D; 
/* 1257 */           if (this.field_70179_y < -2.0D) this.field_70179_y = -2.0D; 
/* 1258 */           if (this.field_70179_y > 2.0D) this.field_70179_y = 2.0D; 
/* 1259 */           double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */           
/* 1262 */           gh = 1.25D;
/* 1263 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)((float)this.field_70163_u - (float)gh), (int)this.field_70161_v);
/* 1264 */           if (bid != Blocks.field_150350_a) {
/* 1265 */             this.field_70181_x += 0.03D;
/* 1266 */             this.field_70163_u += 0.1D;
/*      */           } else {
/*      */             
/* 1269 */             this.field_70181_x -= 0.018D;
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1276 */           obstruction_factor = 0.0D;
/* 1277 */           dist = 3;
/* 1278 */           dist += (int)(velocity * 7.0D);
/*      */           
/* 1280 */           for (int k = 1; k < dist; k++) {
/* 1281 */             for (int i = 1; i < dist * 2; i++) {
/* 1282 */               double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1283 */               double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 1284 */               bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 1285 */               if (bid != Blocks.field_150350_a) {
/* 1286 */                 obstruction_factor += 0.05D;
/*      */               }
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1293 */           this.field_70181_x += obstruction_factor * 0.07D;
/* 1294 */           this.field_70163_u += obstruction_factor * 0.07D;
/* 1295 */           if (this.field_70181_x > 2.0D) this.field_70181_x = 2.0D;
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
/* 1306 */           double d4 = this.field_70153_n.field_70177_z;
/* 1307 */           d4 %= 360.0D;
/* 1308 */           for (; d4 < 0.0D; d4 += 360.0D);
/* 1309 */           double d5 = this.field_70177_z;
/* 1310 */           d5 %= 360.0D;
/* 1311 */           for (; d5 < 0.0D; d5 += 360.0D);
/* 1312 */           relative_g = (d4 - d5) % 180.0D;
/* 1313 */           for (; relative_g < 0.0D; relative_g += 180.0D);
/* 1314 */           if (relative_g > 90.0D) relative_g -= 180.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1321 */           if (velocity > 0.01D) {
/*      */             
/* 1323 */             d4 = 1.85D - velocity;
/* 1324 */             d4 = Math.abs(d4);
/* 1325 */             if (d4 < 0.01D) d4 = 0.01D; 
/* 1326 */             if (d4 > 0.9D) d4 = 0.9D; 
/* 1327 */             this.field_70177_z = this.field_70153_n.field_70177_z + (float)(relative_g * d4);
/*      */           } else {
/*      */             
/* 1330 */             this.field_70177_z = this.field_70153_n.field_70177_z;
/*      */           } 
/* 1332 */           relative_g = Math.abs(relative_g) * velocity;
/* 1333 */           if (relative_g > 50.0D) relative_g = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1338 */           this.field_70125_A = 2.0F * (float)velocity;
/* 1339 */           func_70101_b(this.field_70177_z, this.field_70125_A);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1345 */           double newvelocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1353 */           double rr = Math.atan2(this.field_70153_n.field_70179_y, this.field_70153_n.field_70159_w);
/* 1354 */           double rhm = Math.atan2(this.field_70179_y, this.field_70159_w);
/* 1355 */           double rhdir = Math.toRadians(((this.field_70153_n.field_70177_z + 90.0F) % 360.0F));
/* 1356 */           rt = 0.0D;
/* 1357 */           pi = 3.1415926545D;
/* 1358 */           deltav = 0.0D;
/* 1359 */           float im = pp.field_70701_bs;
/*      */ 
/*      */           
/* 1362 */           if (OreSpawnMain.flyup_keystate != 0) {
/* 1363 */             this.field_70181_x += 0.03D;
/* 1364 */             this.field_70181_x += velocity * 0.036D;
/*      */           } 
/*      */ 
/*      */           
/* 1368 */           double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
/* 1369 */           if (rdv > pi) rdv -= pi * 2.0D; 
/* 1370 */           rdv = Math.abs(rdv);
/* 1371 */           if (Math.abs(newvelocity) < 0.01D) rdv = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1379 */           if (rdv > 1.5D) newvelocity = -newvelocity;
/*      */           
/* 1381 */           if (Math.abs(im) > 0.001F) {
/* 1382 */             if (im > 0.0F) {
/* 1383 */               deltav = 0.025D;
/* 1384 */               if (max_speed > 1.0D) deltav += 0.05D; 
/* 1385 */               if (this.deltasmooth < 0.0F) this.deltasmooth = 0.0F; 
/* 1386 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1387 */               if (this.deltasmooth > deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } else {
/* 1390 */               max_speed = 0.35D;
/*      */               
/* 1392 */               deltav = -0.02D;
/* 1393 */               if (this.deltasmooth > 0.0F) this.deltasmooth = 0.0F; 
/* 1394 */               this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 1395 */               if (this.deltasmooth < deltav) this.deltasmooth = (float)deltav;
/*      */             
/*      */             } 
/* 1398 */             newvelocity += this.deltasmooth;
/* 1399 */             if (newvelocity >= 0.0D) {
/* 1400 */               if (newvelocity > max_speed) newvelocity = max_speed; 
/* 1401 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1402 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */             } else {
/* 1404 */               if (newvelocity < -max_speed) newvelocity = -max_speed; 
/* 1405 */               newvelocity = -newvelocity;
/* 1406 */               this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/* 1407 */               this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/*      */             }
/*      */           
/*      */           }
/* 1411 */           else if (newvelocity >= 0.0D) {
/* 1412 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1413 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */           } else {
/* 1415 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/* 1416 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/*      */           } 
/*      */ 
/*      */           
/* 1420 */           if (this.fireballticker == 0) {
/*      */             
/* 1422 */             double xzoff = 4.0D;
/* 1423 */             double yoff = -0.25D;
/*      */             
/* 1425 */             if (getDragonType() == 0) {
/* 1426 */               if (pp.field_70702_br > 0.001F) {
/* 1427 */                 bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, 0.0D, 0.0D, 0.0D);
/* 1428 */                 bf.setNotMe();
/* 1429 */                 bf.setSmall();
/* 1430 */                 double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1431 */                 double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1432 */                 bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1433 */                 cx = Math.cos(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1434 */                 cz = Math.sin(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1435 */                 double cy = -Math.sin(Math.toRadians(pp.field_70125_A));
/*      */                 
/* 1437 */                 double d3 = MathHelper.func_76133_a(cx * cx + cy * cy + cz * cz);
/* 1438 */                 bf.field_70232_b = cx / d3 * 0.15D;
/* 1439 */                 bf.field_70233_c = cy / d3 * 0.15D;
/* 1440 */                 bf.field_70230_d = cz / d3 * 0.15D;
/* 1441 */                 bf.field_70159_w = this.field_70159_w;
/* 1442 */                 bf.field_70181_x = this.field_70181_x;
/* 1443 */                 bf.field_70179_y = this.field_70179_y;
/* 1444 */                 bf.field_70165_t -= this.field_70159_w * 9.0D;
/* 1445 */                 bf.field_70163_u -= this.field_70181_x * 9.0D;
/* 1446 */                 bf.field_70161_v -= this.field_70179_y * 9.0D;
/* 1447 */                 this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1448 */                 this.field_70170_p.func_72838_d((Entity)bf);
/* 1449 */                 this.fireballticker = 10;
/*      */               } 
/* 1451 */               if (pp.field_70702_br < -0.001F) {
/* 1452 */                 bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, 0.0D, 0.0D, 0.0D);
/* 1453 */                 bf.setNotMe();
/* 1454 */                 double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1455 */                 double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1456 */                 bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 1457 */                 cx = Math.cos(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1458 */                 cz = Math.sin(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1459 */                 double cy = -Math.sin(Math.toRadians(pp.field_70125_A));
/*      */                 
/* 1461 */                 double d3 = MathHelper.func_76133_a(cx * cx + cy * cy + cz * cz);
/* 1462 */                 bf.field_70232_b = cx / d3 * 0.1D;
/* 1463 */                 bf.field_70233_c = cy / d3 * 0.1D;
/* 1464 */                 bf.field_70230_d = cz / d3 * 0.1D;
/* 1465 */                 bf.field_70159_w = this.field_70159_w;
/* 1466 */                 bf.field_70181_x = this.field_70181_x;
/* 1467 */                 bf.field_70179_y = this.field_70179_y;
/* 1468 */                 bf.field_70165_t -= this.field_70159_w * 9.0D;
/* 1469 */                 bf.field_70163_u -= this.field_70181_x * 9.0D;
/* 1470 */                 bf.field_70161_v -= this.field_70179_y * 9.0D;
/* 1471 */                 this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1472 */                 this.field_70170_p.func_72838_d((Entity)bf);
/* 1473 */                 this.fireballticker = 20;
/*      */               } 
/*      */             } else {
/* 1476 */               if (pp.field_70702_br > 0.001F) {
/* 1477 */                 double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1478 */                 double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1479 */                 WaterBall var2 = new WaterBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1480 */                 var2.func_70012_b(cx, this.field_70163_u + yoff, cz, pp.field_70177_z + 90.0F, pp.field_70125_A);
/* 1481 */                 double var3 = Math.cos(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1482 */                 double var5 = -Math.sin(Math.toRadians(pp.field_70125_A));
/* 1483 */                 double var77 = Math.sin(Math.toRadians((pp.field_70759_as + 90.0F)));
/* 1484 */                 float var9 = MathHelper.func_76133_a(var3 * var3 + var77 * var77) * 0.2F;
/* 1485 */                 var2.func_70186_c(var3, var5 + var9, var77, 1.4F, 5.0F);
/* 1486 */                 var2.field_70165_t -= this.field_70159_w * 7.0D;
/* 1487 */                 var2.field_70163_u -= this.field_70181_x * 7.0D;
/* 1488 */                 var2.field_70161_v -= this.field_70179_y * 7.0D;
/* 1489 */                 this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1490 */                 this.field_70170_p.func_72838_d((Entity)var2);
/* 1491 */                 this.fireballticker = 5;
/*      */               } 
/* 1493 */               if (pp.field_70702_br < -0.001F) {
/* 1494 */                 double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1495 */                 double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1496 */                 IceBall var2 = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/* 1497 */                 var2.func_70012_b(cx, this.field_70163_u + yoff, cz, pp.field_70177_z + 90.0F, pp.field_70125_A);
/* 1498 */                 var2.setSpecial();
/* 1499 */                 var2.setIceBall();
/* 1500 */                 double var3 = Math.cos(Math.toRadians((pp.field_70177_z + 90.0F)));
/* 1501 */                 double var5 = -Math.sin(Math.toRadians(pp.field_70125_A));
/* 1502 */                 double var77 = Math.sin(Math.toRadians((pp.field_70177_z + 90.0F)));
/* 1503 */                 float var9 = MathHelper.func_76133_a(var3 * var3 + var77 * var77) * 0.2F;
/* 1504 */                 var2.func_70186_c(var3, var5 + var9, var77, 1.4F, 5.0F);
/* 1505 */                 var2.field_70165_t -= this.field_70159_w * 7.0D;
/* 1506 */                 var2.field_70163_u -= this.field_70181_x * 7.0D;
/* 1507 */                 var2.field_70161_v -= this.field_70179_y * 7.0D;
/* 1508 */                 var2.field_70159_w *= 2.0D;
/* 1509 */                 var2.field_70181_x *= 2.0D;
/* 1510 */                 var2.field_70179_y *= 2.0D;
/* 1511 */                 this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1512 */                 this.field_70170_p.func_72838_d((Entity)var2);
/* 1513 */                 this.fireballticker = 15;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1522 */           func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */ 
/*      */           
/* 1525 */           this.field_70159_w *= 0.985D;
/* 1526 */           this.field_70181_x *= 0.94D;
/* 1527 */           this.field_70179_y *= 0.985D;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1532 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1534 */             list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b(2.25D, 2.0D, 2.25D));
/*      */             
/* 1536 */             if (list != null && !list.isEmpty())
/*      */             {
/* 1538 */               for (int l = 0; l < list.size(); l++) {
/*      */                 
/* 1540 */                 listEntity = list.get(l);
/*      */                 
/* 1542 */                 if (listEntity != this.field_70153_n && !listEntity.field_70128_L && listEntity.func_70104_M())
/*      */                 {
/* 1544 */                   listEntity.func_70108_f((Entity)this);
/*      */                 }
/*      */               } 
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1552 */           fly_with_rider();
/*      */ 
/*      */           
/* 1555 */           if (this.field_70153_n.field_70128_L)
/*      */           {
/* 1557 */             this.field_70153_n = null;
/*      */           }
/*      */         }
/*      */         else {
/*      */           
/* 1562 */           fly_without_rider();
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1568 */       always_do();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70043_V() {
/* 1575 */     if (this.field_70153_n != null) {
/*      */ 
/*      */ 
/*      */       
/* 1579 */       float f = 0.65F;
/* 1580 */       this.field_70153_n.func_70107_b(this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + func_70042_X() + this.field_70153_n.func_70033_W(), this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)));
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
/* 1592 */     String s = "heart";
/*      */     
/* 1594 */     if (!par1)
/*      */     {
/* 1596 */       s = "smoke";
/*      */     }
/*      */     
/* 1599 */     for (int i = 0; i < 20; i++) {
/*      */       
/* 1601 */       double d0 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1602 */       double d1 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1603 */       double d2 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1604 */       this.field_70170_p.func_72869_a(s, this.field_70165_t + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), this.field_70163_u + 0.5D + this.field_70146_Z.nextFloat() * 1.5D, this.field_70161_v + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), d0, d1, d2);
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
/* 1615 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */     
/* 1617 */     if (var2 != null && 
/* 1618 */       var2.field_77994_a <= 0) {
/* 1619 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 1620 */       var2 = null;
/*      */     } 
/*      */ 
/*      */     
/* 1624 */     if (!func_70909_n()) {
/* 1625 */       if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/* 1626 */         if (!this.field_70170_p.field_72995_K) {
/* 1627 */           if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 1628 */             func_70903_f(true);
/* 1629 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 1630 */             func_70908_e(true);
/* 1631 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 1632 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */           } else {
/*      */             
/* 1635 */             func_70908_e(false);
/* 1636 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */           } 
/*      */         }
/* 1639 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1640 */           var2.field_77994_a--;
/* 1641 */           if (var2.field_77994_a <= 0) {
/* 1642 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1645 */         return true;
/*      */       } 
/*      */     } else {
/*      */       
/* 1649 */       if (!func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/* 1650 */         return false;
/*      */       }
/*      */       
/* 1653 */       if (var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/* 1654 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1656 */           par1EntityPlayer.func_70078_a((Entity)this);
/*      */           
/* 1658 */           setActivity(1);
/* 1659 */           func_70904_g(false);
/*      */         } 
/* 1661 */         return true;
/*      */       } 
/*      */       
/* 1664 */       if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/* 1665 */         if (this.field_70170_p.field_72995_K) {
/* 1666 */           func_70908_e(true);
/* 1667 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1670 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 1671 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         }
/* 1673 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1674 */           var2.field_77994_a--;
/* 1675 */           if (var2.field_77994_a <= 0) {
/* 1676 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1679 */         return true;
/*      */       } 
/* 1681 */       if (var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/*      */         
/* 1683 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1685 */           func_70903_f(false);
/* 1686 */           func_152115_b("");
/* 1687 */           func_70908_e(false);
/* 1688 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */         } 
/* 1690 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1691 */           var2.field_77994_a--;
/* 1692 */           if (var2.field_77994_a <= 0) {
/* 1693 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1696 */         return true;
/*      */       } 
/*      */       
/* 1699 */       if (var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150432_aD) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */         
/* 1702 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1704 */           func_70908_e(true);
/* 1705 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/* 1706 */           setDragonFire(0);
/* 1707 */           par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Dragon fireballs extinguished."));
/*      */         } 
/*      */         
/* 1710 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1712 */           var2.field_77994_a--;
/* 1713 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1715 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1718 */         return true;
/*      */       } 
/*      */       
/* 1721 */       if (var2 != null && var2.func_77973_b() == Items.field_151033_d && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */         
/* 1724 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1726 */           func_70908_e(true);
/* 1727 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/* 1728 */           setDragonFire(1);
/* 1729 */           par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Dragon fireballs lit!"));
/*      */         } 
/*      */         
/* 1732 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1734 */           var2.field_77994_a--;
/* 1735 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1737 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1740 */         return true;
/*      */       } 
/*      */       
/* 1743 */       if (var2 != null && var2.func_77973_b() == Items.field_151016_H && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer) && getDragonFire() > 0) {
/*      */ 
/*      */         
/* 1746 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1748 */           func_70908_e(true);
/* 1749 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/* 1750 */           setDragonFire(2);
/* 1751 */           par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Dragon fireballs supercharged!"));
/*      */         } 
/*      */         
/* 1754 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1756 */           var2.field_77994_a--;
/* 1757 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1759 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1762 */         return true;
/*      */       } 
/* 1764 */       if (var2 != null && var2.func_77973_b() == Items.field_151126_ay && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/* 1765 */         if (this.field_70170_p.field_72995_K) {
/* 1766 */           func_70908_e(true);
/* 1767 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1770 */         this.dragontype = 1;
/* 1771 */         setDragonType(this.dragontype);
/*      */         
/* 1773 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1774 */           var2.field_77994_a--;
/* 1775 */           if (var2.field_77994_a <= 0) {
/* 1776 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1779 */         return true;
/*      */       } 
/* 1781 */       if (var2 != null && var2.func_77973_b() == Items.field_151044_h && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/* 1782 */         if (this.field_70170_p.field_72995_K) {
/* 1783 */           func_70908_e(true);
/* 1784 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/* 1787 */         this.dragontype = 0;
/* 1788 */         setDragonType(this.dragontype);
/*      */         
/* 1790 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/* 1791 */           var2.field_77994_a--;
/* 1792 */           if (var2.field_77994_a <= 0) {
/* 1793 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1796 */         return true;
/*      */       } 
/*      */       
/* 1799 */       if (var2 != null && var2.func_77973_b() == Items.field_151045_i && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer) && !this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */         
/* 1803 */         Entity ent = null;
/* 1804 */         Spyro d = null;
/* 1805 */         ent = spawnCreature(this.field_70170_p, "Baby Dragon", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 1806 */         if (ent != null) {
/* 1807 */           d = (Spyro)ent;
/* 1808 */           if (func_70909_n()) {
/* 1809 */             d.func_70903_f(true);
/* 1810 */             d.func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1817 */           func_70106_y();
/*      */         } 
/* 1819 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1821 */           var2.field_77994_a--;
/* 1822 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1824 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1827 */         return true;
/*      */       } 
/*      */       
/* 1830 */       if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */         
/* 1832 */         func_94058_c(var2.func_82833_r());
/* 1833 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/* 1835 */           var2.field_77994_a--;
/* 1836 */           if (var2.field_77994_a <= 0)
/*      */           {
/* 1838 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/* 1841 */         return true;
/*      */       } 
/*      */       
/* 1844 */       if (var2 != null && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/*      */         
/* 1846 */         if (!func_70906_o()) {
/* 1847 */           func_70904_g(true);
/* 1848 */           setActivity(0);
/*      */         } else {
/* 1850 */           func_70904_g(false);
/* 1851 */           setActivity(0);
/*      */         } 
/* 1853 */         return true;
/*      */       } 
/*      */     } 
/*      */     
/* 1857 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/* 1865 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/* 1871 */     return this.field_70180_af.func_75683_a(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/* 1876 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1877 */       return;  this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public int getActivity() {
/* 1882 */     return this.field_70180_af.func_75683_a(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/* 1887 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1888 */       return;  this.field_70180_af.func_75692_b(21, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getDragonFire() {
/* 1894 */     return this.field_70180_af.func_75679_c(24);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDragonFire(int par1) {
/* 1900 */     if (this.field_70170_p.field_72995_K)
/* 1901 */       return;  this.field_70180_af.func_75692_b(24, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 1910 */     Entity var8 = null;
/*      */ 
/*      */     
/* 1913 */     var8 = EntityList.func_75620_a(par1, par0World);
/*      */     
/* 1915 */     if (var8 != null) {
/*      */ 
/*      */       
/* 1918 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1921 */       par0World.func_72838_d(var8);
/*      */       
/* 1923 */       ((EntityLiving)var8).func_70642_aH();
/*      */     } 
/*      */     
/* 1926 */     return var8;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDragonType(int par1) {
/* 1931 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getDragonType() {
/* 1937 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 1943 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/* 1951 */     if (func_104002_bU()) return false; 
/* 1952 */     if (this.field_70153_n != null) {
/* 1953 */       return false;
/*      */     }
/* 1955 */     if (func_70909_n()) {
/* 1956 */       return false;
/*      */     }
/* 1958 */     return true;
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
/* 1969 */     super.func_70014_b(par1NBTTagCompound);
/*      */     
/* 1971 */     par1NBTTagCompound.func_74768_a("DragonAttacking", getAttacking());
/* 1972 */     par1NBTTagCompound.func_74768_a("DragonActivity", getActivity());
/* 1973 */     par1NBTTagCompound.func_74768_a("DragonFire", getDragonFire());
/* 1974 */     par1NBTTagCompound.func_74768_a("DragonType", getDragonType());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 1983 */     super.func_70037_a(par1NBTTagCompound);
/*      */     
/* 1985 */     setAttacking(par1NBTTagCompound.func_74762_e("DragonAttacking"));
/* 1986 */     setActivity(par1NBTTagCompound.func_74762_e("DragonActivity"));
/* 1987 */     setDragonFire(par1NBTTagCompound.func_74762_e("DragonFire"));
/* 1988 */     this.dragontype = par1NBTTagCompound.func_74762_e("DragonType");
/* 1989 */     setDragonType(this.dragontype);
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Dragon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */