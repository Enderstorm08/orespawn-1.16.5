/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.boss.EntityDragon;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PitchBlack
/*     */   extends EntityMob
/*     */ {
/*  64 */   private ChunkCoordinates currentFlightTarget = null;
/*  65 */   private GenericTargetSorter TargetSorter = null;
/*  66 */   private RenderInfo renderdata = new RenderInfo();
/*  67 */   private float MyMoveSpeed = 0.2F;
/*  68 */   private int damage_ticker = 0;
/*  69 */   private int wing_sound = 0;
/*     */   
/*     */   public PitchBlack(World par1World) {
/*  72 */     super(par1World);
/*  73 */     func_70105_a(2.0F, 3.0F);
/*  74 */     func_70661_as().func_75491_a(false);
/*  75 */     this.field_70728_aV = 200;
/*  76 */     this.field_70178_ae = false;
/*  77 */     this.field_70174_ab = 25;
/*  78 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  79 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  80 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  81 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
/*  82 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
/*  83 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  89 */     super.func_110147_ax();
/*  90 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  91 */     this.MyMoveSpeed = 0.2F;
/*  92 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a((this.MyMoveSpeed + 0.1F * getPitchBlackScale()));
/*  93 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a((getPitchBlackScale() * OreSpawnMain.PitchBlack_stats.attack));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  99 */     super.func_70088_a();
/* 100 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/* 101 */     this.field_70180_af.func_75682_a(21, Byte.valueOf((byte)0));
/* 102 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(0));
/* 103 */     if (this.renderdata == null) {
/* 104 */       this.renderdata = new RenderInfo();
/*     */     }
/* 106 */     this.renderdata.rf1 = 0.0F;
/* 107 */     this.renderdata.rf2 = 0.0F;
/* 108 */     this.renderdata.rf3 = 0.0F;
/* 109 */     this.renderdata.rf4 = 0.0F;
/* 110 */     this.renderdata.ri1 = 0;
/* 111 */     this.renderdata.ri2 = 0;
/* 112 */     this.renderdata.ri3 = 0;
/* 113 */     this.renderdata.ri4 = 0;
/* 114 */     float t = 0.5F;
/* 115 */     if (this.field_70170_p != null) {
/* 116 */       if (this.field_70170_p.field_73012_v.nextInt(4) == 1) t = 1.0F; 
/* 117 */       if (this.field_70170_p.field_73012_v.nextInt(8) == 2) t = 2.0F; 
/* 118 */       if (this.field_70170_p.field_73012_v.nextInt(32) == 3) t = 3.0F; 
/* 119 */       if (this.field_70170_p.field_73012_v.nextInt(64) == 4) t = 4.0F; 
/*     */     } else {
/* 121 */       if (OreSpawnMain.OreSpawnRand.nextInt(4) == 1) t = 1.0F; 
/* 122 */       if (OreSpawnMain.OreSpawnRand.nextInt(8) == 2) t = 2.0F; 
/* 123 */       if (OreSpawnMain.OreSpawnRand.nextInt(32) == 3) t = 3.0F; 
/* 124 */       if (OreSpawnMain.OreSpawnRand.nextInt(64) == 4) t = 4.0F; 
/*     */     } 
/* 126 */     if (OreSpawnMain.NightmareSize == 1) t = 0.5F; 
/* 127 */     if (OreSpawnMain.NightmareSize == 2) t = 1.0F; 
/* 128 */     if (OreSpawnMain.NightmareSize == 3) t = 2.0F; 
/* 129 */     if (OreSpawnMain.NightmareSize == 4) t = 3.0F; 
/* 130 */     if (OreSpawnMain.NightmareSize == 5) t = 4.0F; 
/* 131 */     setPitchBlackScale(t);
/* 132 */     this.field_70728_aV = (int)(100.0F * t);
/* 133 */     this.field_70174_ab = (int)(25.0F * t);
/* 134 */     func_70105_a(2.5F * getPitchBlackScale(), 3.5F * getPitchBlackScale());
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 139 */     super.func_70037_a(par1NBTTagCompound);
/* 140 */     setPitchBlackScale(par1NBTTagCompound.func_74760_g("Fscale"));
/* 141 */     func_70105_a(2.5F * getPitchBlackScale(), 3.5F * getPitchBlackScale());
/* 142 */     this.field_70728_aV = (int)(100.0F * getPitchBlackScale());
/* 143 */     this.field_70174_ab = (int)(25.0F * getPitchBlackScale());
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 148 */     super.func_70014_b(par1NBTTagCompound);
/* 149 */     par1NBTTagCompound.func_74776_a("Fscale", getPitchBlackScale());
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 154 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 159 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getActivity() {
/* 164 */     return this.field_70180_af.func_75683_a(21);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setActivity(int par1) {
/* 169 */     this.field_70180_af.func_75692_b(21, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float getPitchBlackScale() {
/* 175 */     int i = this.field_70180_af.func_75679_c(22);
/* 176 */     float f = i;
/* 177 */     return f / 10.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPitchBlackScale(float par1) {
/* 182 */     float f = par1 * 10.0001F;
/* 183 */     int i = (int)f;
/* 184 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(i));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 192 */     return OreSpawnMain.PitchBlack_stats.defense + (int)(2.0F * getPitchBlackScale());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 199 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 204 */     this.renderdata.rf1 = r.rf1;
/* 205 */     this.renderdata.rf2 = r.rf2;
/* 206 */     this.renderdata.rf3 = r.rf3;
/* 207 */     this.renderdata.rf4 = r.rf4;
/* 208 */     this.renderdata.ri1 = r.ri1;
/* 209 */     this.renderdata.ri2 = r.ri2;
/* 210 */     this.renderdata.ri3 = r.ri3;
/* 211 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 216 */     if (func_104002_bU()) return false; 
/* 217 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 218 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 225 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 232 */     return 1.0F - 0.7F * 4.0F / getPitchBlackScale();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 239 */     if (this.field_70170_p.field_73012_v.nextInt(5) != 2) return null; 
/* 240 */     return "orespawn:pitchblack_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 247 */     return "orespawn:pitchblack_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 254 */     return "orespawn:pitchblack_dead";
/*     */   }
/*     */   
/*     */   public int mygetMaxHealth() {
/* 258 */     return (int)(OreSpawnMain.PitchBlack_stats.health * getPitchBlackScale());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 265 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 273 */     this.MyMoveSpeed = 0.2F;
/* 274 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a((this.MyMoveSpeed + 0.1F * getPitchBlackScale()));
/* 275 */     super.func_70071_h_();
/* 276 */     func_70105_a(2.5F * getPitchBlackScale(), 3.5F * getPitchBlackScale());
/*     */     
/* 278 */     this.wing_sound++;
/* 279 */     if (this.wing_sound > 20) {
/*     */       
/* 281 */       if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 1.0F, 1.0F); 
/* 282 */       this.wing_sound = 0;
/*     */     } 
/*     */     
/* 285 */     this.field_70181_x *= 0.6D;
/* 286 */     if (!this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(250) == 1) {
/* 287 */       func_70691_i(1.0F + getPitchBlackScale());
/* 288 */       if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/*     */ 
/*     */         
/* 291 */         Block bid = Blocks.field_150350_a;
/* 292 */         if (this.field_70163_u > 10.0D)
/* 293 */         { for (int i = 0; i < 10; i++) {
/* 294 */             bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - i, (int)this.field_70161_v);
/* 295 */             if (bid != Blocks.field_150350_a)
/*     */               break; 
/*     */           }  }
/* 298 */         else { bid = Blocks.field_150348_b; }
/*     */         
/* 300 */         if (bid != Blocks.field_150350_a) {
/*     */           
/* 302 */           Entity e = null;
/* 303 */           e = findSomethingToAttack();
/* 304 */           if (e == null) {
/* 305 */             setActivity(0);
/*     */           }
/*     */         } 
/*     */       } else {
/* 309 */         setActivity(1);
/* 310 */         func_70661_as().func_75484_a(null, 0.0D);
/*     */       } 
/*     */     } 
/*     */     
/* 314 */     if (getActivity() == 0 && this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 315 */       Entity e = null;
/* 316 */       e = findSomethingToAttack();
/* 317 */       if (e != null) {
/* 318 */         setActivity(1);
/* 319 */         func_70661_as().func_75484_a(null, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 327 */     boolean var4 = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 333 */     if (par1Entity != null && par1Entity instanceof EntityDragon) {
/* 334 */       EntityDragon dr = (EntityDragon)par1Entity;
/* 335 */       DamageSource var21 = null;
/* 336 */       var21 = DamageSource.func_94539_a(null);
/* 337 */       var21.func_94540_d();
/* 338 */       if (this.field_70170_p.field_73012_v.nextInt(8) == 1) {
/* 339 */         dr.func_70965_a(dr.field_70986_h, var21, OreSpawnMain.PitchBlack_stats.attack * getPitchBlackScale());
/*     */       } else {
/* 341 */         dr.func_70965_a(dr.field_70987_i, var21, OreSpawnMain.PitchBlack_stats.attack * getPitchBlackScale());
/*     */       } 
/* 343 */       var4 = true;
/*     */     } else {
/* 345 */       var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), OreSpawnMain.PitchBlack_stats.attack * getPitchBlackScale());
/* 346 */       if (var4 && par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 348 */         double ks = 1.15D * getPitchBlackScale();
/* 349 */         double inair = 0.08D * getPitchBlackScale();
/* 350 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 351 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 352 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/*     */     } 
/* 355 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 363 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 369 */     int xdir = 1;
/* 370 */     int zdir = 1;
/*     */     
/* 372 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 376 */     if (this.damage_ticker > 0) this.damage_ticker--;
/*     */     
/* 378 */     if (getActivity() == 0) {
/* 379 */       super.func_70619_bc();
/*     */       return;
/*     */     } 
/* 382 */     if (this.field_70128_L) {
/*     */       return;
/*     */     }
/* 385 */     if (this.currentFlightTarget == null) {
/* 386 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 388 */     if (getActivity() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 401 */     if (this.field_70146_Z.nextInt(150) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 403 */       Block bid = Blocks.field_150348_b;
/* 404 */       while (bid != Blocks.field_150350_a && keep_trying > 0) {
/* 405 */         zdir = this.field_70146_Z.nextInt(20) + 5 * (int)getPitchBlackScale();
/* 406 */         xdir = this.field_70146_Z.nextInt(20) + 5 * (int)getPitchBlackScale();
/* 407 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 408 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 409 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(11) - 5, (int)this.field_70161_v + zdir);
/* 410 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 411 */         if (bid == Blocks.field_150350_a && 
/* 412 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 413 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 416 */         keep_trying--;
/*     */       }
/*     */     
/* 419 */     } else if (this.field_70146_Z.nextInt(8) == 0) {
/*     */ 
/*     */       
/* 422 */       Entity e = null;
/*     */       
/* 424 */       e = findSomethingToAttack();
/* 425 */       if (e != null) {
/*     */         
/* 427 */         double d1 = 5.0D + (e.field_70130_N / 2.0F);
/* 428 */         d1 += getPitchBlackScale();
/* 429 */         d1 *= d1;
/* 430 */         setAttacking(1);
/*     */         
/* 432 */         if (e instanceof EntityDragon && 
/* 433 */           d1 < 100.0D) d1 = 100.0D;
/*     */ 
/*     */         
/* 436 */         if (e instanceof Godzilla && 
/* 437 */           d1 < 100.0D) d1 = 100.0D;
/*     */ 
/*     */         
/* 440 */         if (e instanceof GodzillaHead && 
/* 441 */           d1 < 100.0D) d1 = 100.0D;
/*     */ 
/*     */         
/* 444 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 2.0D), (int)e.field_70161_v);
/* 445 */         if (func_70068_e(e) < d1) {
/* 446 */           func_70652_k(e);
/*     */         }
/*     */       } else {
/*     */         
/* 450 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 454 */     double var1 = this.currentFlightTarget.field_71574_a + 0.4D - this.field_70165_t;
/* 455 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 456 */     double var5 = this.currentFlightTarget.field_71573_c + 0.4D - this.field_70161_v;
/* 457 */     double myspeed = (0.5F + getPitchBlackScale() / 10.0F);
/* 458 */     this.field_70159_w += (Math.signum(var1) * myspeed - this.field_70159_w) * 0.33D;
/* 459 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 460 */     this.field_70179_y += (Math.signum(var5) * myspeed - this.field_70179_y) * 0.33D;
/* 461 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 462 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 463 */     this.field_70701_bs = 0.1F + (float)myspeed;
/* 464 */     this.field_70177_z += var8 / 5.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 473 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_145773_az() {
/* 491 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 499 */     boolean ret = false;
/*     */     
/* 501 */     if (this.damage_ticker > 0) return ret; 
/* 502 */     this.damage_ticker = 20;
/* 503 */     ret = super.func_70097_a(par1DamageSource, par2);
/* 504 */     Entity e = par1DamageSource.func_76346_g();
/* 505 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 507 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 2.0D), (int)e.field_70161_v);
/*     */     }
/* 509 */     setActivity(1);
/* 510 */     func_70661_as().func_75484_a(null, 0.0D);
/* 511 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 524 */     for (k = -3; k < 3; k++) {
/*     */       
/* 526 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 528 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 530 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 531 */           if (bid == Blocks.field_150474_ac) {
/* 532 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 533 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 534 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 535 */             if (s != null && 
/* 536 */               s.equals("Nightmare")) {
/* 537 */               Float t = Float.valueOf(getPitchBlackScale());
/* 538 */               if (t.floatValue() > 1.0F) t = Float.valueOf(1.0F); 
/* 539 */               setPitchBlackScale(t.floatValue());
/* 540 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 547 */     if (!func_70814_o()) return false; 
/* 548 */     if (this.field_70170_p.func_72935_r()) return false;
/*     */     
/* 550 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID6) {
/* 551 */       PitchBlack target = null;
/* 552 */       target = (PitchBlack)this.field_70170_p.func_72857_a(PitchBlack.class, this.field_70121_D.func_72314_b(16.0D, 16.0D, 16.0D), (Entity)this);
/* 553 */       if (target != null)
/*     */       {
/* 555 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 560 */     if (getPitchBlackScale() < 1.1F) return true; 
/* 561 */     int ix = 1;
/* 562 */     if (getPitchBlackScale() > 3.1F) ix = 2; 
/* 563 */     int iy = ix * 3;
/* 564 */     for (k = -ix; k <= ix; k++) {
/*     */       
/* 566 */       for (int j = -ix; j <= ix; j++) {
/*     */         
/* 568 */         for (int i = 1; i <= iy; i++) {
/*     */           
/* 570 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 571 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 575 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 586 */     if (par1EntityLiving == null)
/*     */     {
/* 588 */       return false;
/*     */     }
/* 590 */     if (par1EntityLiving == this)
/*     */     {
/* 592 */       return false;
/*     */     }
/* 594 */     if (!(par1EntityLiving instanceof EntityLivingBase))
/*     */     {
/* 596 */       return false;
/*     */     }
/* 598 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 601 */       return false;
/*     */     }
/*     */     
/* 604 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 606 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 609 */       return false;
/*     */     }
/* 611 */     if (par1EntityLiving instanceof PitchBlack)
/*     */     {
/* 613 */       return false;
/*     */     }
/*     */     
/* 616 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 618 */       return false;
/*     */     }
/* 620 */     if (par1EntityLiving instanceof LeafMonster)
/*     */     {
/* 622 */       return false;
/*     */     }
/* 624 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 626 */       return false;
/*     */     }
/* 628 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 630 */       return false;
/*     */     }
/* 632 */     if (par1EntityLiving instanceof CreepingHorror)
/*     */     {
/* 634 */       return false;
/*     */     }
/*     */     
/* 637 */     if (par1EntityLiving instanceof Island)
/*     */     {
/* 639 */       return false;
/*     */     }
/* 641 */     if (par1EntityLiving instanceof IslandToo)
/*     */     {
/* 643 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 647 */     if (par1EntityLiving instanceof Triffid)
/*     */     {
/* 649 */       return false;
/*     */     }
/* 651 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 653 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 654 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 655 */         return false;
/*     */       }
/*     */     } 
/* 658 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private Entity findSomethingToAttack() {
/* 663 */     if (OreSpawnMain.PlayNicely != 0) return null;
/*     */     
/* 665 */     double d1 = 16.0D + (getPitchBlackScale() * 6.0F);
/* 666 */     double d2 = 10.0D + (getPitchBlackScale() * 4.0F);
/* 667 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(d1, d2, d1));
/* 668 */     Collections.sort(var5, this.TargetSorter);
/* 669 */     Iterator<?> var2 = var5.iterator();
/* 670 */     EntityLivingBase var3 = null;
/*     */     
/* 672 */     while (var2.hasNext()) {
/*     */       
/* 674 */       var3 = (EntityLivingBase)var2.next();
/*     */       
/* 676 */       if (isSuitableTarget(var3, false))
/*     */       {
/* 678 */         return (Entity)var3;
/*     */       }
/*     */     } 
/* 681 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 692 */     return OreSpawnMain.MyNightmareScale;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 697 */     EntityItem var3 = null;
/* 698 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 700 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()) - (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()), this.field_70163_u + 1.0D, this.field_70161_v + (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()) - (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()), is);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 705 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 706 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 714 */     int i = 3 + this.field_70170_p.field_73012_v.nextInt(2 + (int)(5.0F * getPitchBlackScale())); int var4;
/* 715 */     for (var4 = 0; var4 < i; var4++) {
/* 716 */       dropItemRand(Items.field_151078_bh, 1);
/* 717 */       int j = this.field_70170_p.field_73012_v.nextInt(10);
/* 718 */       if (j == 0) dropItemRand(Items.field_151008_G, 1); 
/* 719 */       if (j == 1) dropItemRand(Items.field_151007_F, 1); 
/* 720 */       if (j == 2) dropItemRand(Items.field_151145_ak, 1); 
/* 721 */       if (j == 3) dropItemRand(Items.field_151082_bd, 1);
/*     */     
/*     */     } 
/* 724 */     dropItemRand(OreSpawnMain.MyNightmareScale, 1);
/* 725 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 727 */     i = 2 + (int)getPitchBlackScale() + this.field_70170_p.field_73012_v.nextInt(2 + (int)(5.0F * getPitchBlackScale()));
/* 728 */     for (var4 = 0; var4 < i; var4++)
/* 729 */       dropItemRand(OreSpawnMain.ZooKeeper, 1); 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\PitchBlack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */