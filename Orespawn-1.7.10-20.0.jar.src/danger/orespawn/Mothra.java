/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.IMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntitySmallFireball;
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
/*     */ import net.minecraft.world.EnumDifficulty;
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
/*     */ public class Mothra
/*     */   extends EntityButterfly
/*     */   implements IMob
/*     */ {
/*  50 */   private ChunkCoordinates currentFlightTarget = null;
/*  51 */   private int lastX = 0, lastZ = 0, lastY = 0;
/*  52 */   private int stuck_count = 0;
/*  53 */   private int wing_sound = 0;
/*  54 */   private int health_ticker = 100;
/*  55 */   private GenericTargetSorter TargetSorter = null;
/*  56 */   private float moveSpeed = 0.35F;
/*     */   
/*     */   public Mothra(World par1World) {
/*  59 */     super(par1World);
/*  60 */     func_70105_a(5.0F, 2.0F);
/*  61 */     func_70661_as().func_75491_a(true);
/*  62 */     this.field_70728_aV = 100;
/*  63 */     this.field_70178_ae = true;
/*  64 */     this.field_70174_ab = 500;
/*  65 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  71 */     super.func_110147_ax();
/*  72 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  73 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Mothra_stats.attack);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  78 */     if (func_104002_bU()) return false; 
/*  79 */     return true;
/*     */   }
/*     */   
/*     */   protected void func_70088_a() {
/*  83 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/*  91 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/*  99 */     return OreSpawnMain.Mothra_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMothraHealth() {
/* 106 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 113 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 120 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 127 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 134 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 141 */     return "random.explode";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 148 */     return true;
/*     */   }
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 156 */     return OreSpawnMain.Mothra_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 163 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 171 */     super.func_70071_h_();
/*     */     
/* 173 */     this.field_70181_x *= 0.6D;
/*     */     
/* 175 */     this.wing_sound++;
/* 176 */     if (this.wing_sound > 30) {
/*     */       
/* 178 */       if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 1.0F, 1.0F); 
/* 179 */       this.wing_sound = 0;
/*     */     } 
/*     */     
/* 182 */     this.health_ticker--;
/* 183 */     if (this.health_ticker <= 0) {
/* 184 */       if (func_110143_aJ() < mygetMaxHealth())
/* 185 */         func_70691_i(1.0F); 
/* 186 */       this.health_ticker = 200;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 195 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 201 */     int xdir = 1;
/* 202 */     int zdir = 1;
/*     */     
/* 204 */     int keep_trying = 50;
/*     */     
/* 206 */     int shoot = 3;
/*     */     
/* 208 */     if (this.field_70128_L)
/* 209 */       return;  super.func_70619_bc();
/*     */     
/* 211 */     if (this.lastX == (int)this.field_70165_t && this.lastY == (int)this.field_70163_u && this.lastZ == (int)this.field_70161_v) {
/*     */       
/* 213 */       this.stuck_count++;
/*     */     } else {
/* 215 */       this.stuck_count = 0;
/* 216 */       this.lastX = (int)this.field_70165_t;
/* 217 */       this.lastY = (int)this.field_70163_u;
/* 218 */       this.lastZ = (int)this.field_70161_v;
/*     */     } 
/*     */     
/* 221 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.HARD) shoot = 2;
/*     */ 
/*     */     
/* 224 */     if (this.currentFlightTarget == null) {
/* 225 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */     
/* 228 */     if (this.stuck_count > 50 || this.field_70170_p.field_73012_v.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 9.0F) {
/*     */ 
/*     */       
/* 231 */       int down = 0;
/*     */       
/* 233 */       int dist = 20;
/* 234 */       for (int i = -5; i <= 5; i += 5) {
/* 235 */         for (int j = -5; j <= 5; j += 5) {
/* 236 */           for (int k = 1; k < 20; k++) {
/* 237 */             Block block = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u - k, (int)this.field_70161_v + i);
/* 238 */             if (block != Blocks.field_150350_a) {
/* 239 */               if (k < dist) dist = k; 
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 245 */       if (dist > 10) down = dist - 10 + 1;
/*     */       
/* 247 */       Block bid = Blocks.field_150348_b;
/* 248 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 249 */         xdir = 1; zdir = 1;
/* 250 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -1; 
/* 251 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -1; 
/* 252 */         int newz = this.field_70146_Z.nextInt(20) + 8;
/* 253 */         newz *= zdir;
/* 254 */         int newx = this.field_70146_Z.nextInt(20) + 8;
/* 255 */         newx *= xdir;
/* 256 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + newx, (int)this.field_70163_u + this.field_70146_Z.nextInt(7) - 1 - down, (int)this.field_70161_v + newz);
/* 257 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 258 */         if (bid == Blocks.field_150350_a && 
/* 259 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 260 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 263 */         keep_trying--;
/*     */       } 
/* 265 */       this.stuck_count = 0;
/*     */     }
/* 267 */     else if (this.field_70170_p.field_73012_v.nextInt(10) == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && OreSpawnMain.MothraPeaceful == 0) {
/*     */       
/* 269 */       EntityPlayer target = null;
/*     */       
/* 271 */       target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(25.0D, 20.0D, 25.0D), (Entity)this);
/* 272 */       if (target != null)
/*     */       {
/* 274 */         if (!target.field_71075_bZ.field_75098_d) {
/*     */           
/* 276 */           if (func_70635_at().func_75522_a((Entity)target)) {
/*     */             
/* 278 */             this.currentFlightTarget.func_71571_b((int)target.field_70165_t, (int)target.field_70163_u + 4, (int)target.field_70161_v);
/* 279 */             if (this.field_70146_Z.nextInt(shoot) == 0)
/* 280 */               attackWithSomething((EntityLivingBase)target); 
/*     */           } 
/*     */         } else {
/* 283 */           target = null;
/*     */         } 
/*     */       }
/*     */       
/* 287 */       if (target == null && this.field_70170_p.field_73012_v.nextInt(3) == 0) {
/* 288 */         EntityLivingBase e = null;
/* 289 */         e = findSomethingToAttack();
/* 290 */         if (e != null) {
/*     */ 
/*     */           
/* 293 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 5, (int)e.field_70161_v);
/* 294 */           if (this.field_70170_p.field_73012_v.nextInt(shoot) == 0) {
/* 295 */             attackWithSomething(e);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 301 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 302 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 303 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 304 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.30001D;
/* 305 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.20001D;
/* 306 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.30001D;
/* 307 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 308 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 309 */     this.field_70701_bs = 1.0F;
/* 310 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 319 */     return false;
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
/* 337 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 345 */     boolean ret = false;
/* 346 */     Entity e = par1DamageSource.func_76346_g();
/*     */     
/* 348 */     if (e != null && e instanceof Mothra) {
/* 349 */       return false;
/*     */     }
/* 351 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 353 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/*     */       
/* 356 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 2, (int)e.field_70161_v);
/*     */     }
/* 358 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 367 */     super.func_70037_a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 375 */     super.func_70014_b(par1NBTTagCompound);
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
/* 388 */     for (k = -2; k <= 2; k++) {
/*     */       
/* 390 */       for (int j = -2; j <= 2; j++) {
/*     */         
/* 392 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 394 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 395 */           if (bid == Blocks.field_150474_ac) {
/* 396 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 397 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 398 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 399 */             if (s != null && 
/* 400 */               s.equals("Mothra")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 407 */     if (this.field_70163_u < 70.0D) return false;
/*     */ 
/*     */     
/* 410 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 414 */     for (k = -4; k < 4; k++) {
/*     */       
/* 416 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 418 */         for (int i = 1; i < 10; i++) {
/*     */           
/* 420 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 421 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 429 */     Mothra target = null;
/* 430 */     target = (Mothra)this.field_70170_p.func_72857_a(Mothra.class, this.field_70121_D.func_72314_b(64.0D, 32.0D, 64.0D), (Entity)this);
/* 431 */     if (target != null)
/*     */     {
/* 433 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 437 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 449 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), new ItemStack(index, par1, 0));
/*     */     
/* 451 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 458 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 460 */     for (int i = 0; i < 20; i++) {
/* 461 */       float var1 = (this.field_70146_Z.nextFloat() - 0.5F) * 8.0F;
/* 462 */       float var2 = (this.field_70146_Z.nextFloat() - 0.5F) * 4.0F;
/* 463 */       float var3 = (this.field_70146_Z.nextFloat() - 0.5F) * 8.0F;
/* 464 */       this.field_70170_p.func_72869_a("largeexplode", this.field_70165_t + var1, this.field_70163_u + 2.0D + var2, this.field_70161_v + var3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     int var4;
/* 467 */     for (var4 = 0; var4 < 53; var4++) {
/* 468 */       dropItemRand(Items.field_151074_bl, 1);
/*     */     }
/*     */     
/* 471 */     for (var4 = 0; var4 < 25; var4++) {
/* 472 */       dropItemRand(OreSpawnMain.MyMothScale, 1);
/*     */     }
/*     */     
/* 475 */     for (var4 = 0; var4 < 3; var4++) {
/* 476 */       dropItemRand(Items.field_151072_bj, 1);
/*     */     }
/*     */     
/* 479 */     dropItemRand(Items.field_151156_bN, 1);
/*     */     
/* 481 */     for (var4 = 0; var4 < 20; var4++) {
/* 482 */       spawnCreature(this.field_70170_p, "Moth", this.field_70165_t + 0.5D, this.field_70163_u + 1.0D, this.field_70161_v + 0.5D);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 501 */     Entity var8 = null;
/*     */     
/* 503 */     if (par0World == null) return null;
/*     */ 
/*     */     
/* 506 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/* 508 */     if (var8 != null) {
/*     */ 
/*     */       
/* 511 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 514 */       par0World.func_72838_d(var8);
/*     */       
/* 516 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/* 519 */     return var8;
/*     */   }
/*     */   
/*     */   private void attackWithSomething(EntityLivingBase par1) {
/* 523 */     double xzoff = 2.25D;
/*     */     
/* 525 */     double yoff = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 530 */     if (OreSpawnMain.MothraPeaceful != 0)
/* 531 */       return;  if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL)
/*     */       return; 
/* 533 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 534 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*     */     
/* 536 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY) {
/* 537 */       EntitySmallFireball sf = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 538 */       sf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 539 */       sf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 540 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 541 */       this.field_70170_p.func_72838_d((Entity)sf);
/* 542 */     } else if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) {
/* 543 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/* 544 */         EntitySmallFireball sf = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 545 */         sf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 546 */         sf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 547 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 548 */         this.field_70170_p.func_72838_d((Entity)sf);
/*     */       } else {
/* 550 */         BetterFireball bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 551 */         bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 552 */         bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 553 */         bf.setNotMe();
/* 554 */         this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 555 */         this.field_70170_p.func_72838_d((Entity)bf);
/*     */       } 
/*     */     } else {
/* 558 */       BetterFireball bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 559 */       bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 560 */       bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 561 */       bf.setNotMe();
/* 562 */       this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 563 */       this.field_70170_p.func_72838_d((Entity)bf);
/*     */     } 
/* 565 */     if (func_110143_aJ() < mygetMaxHealth()) {
/* 566 */       func_70691_i(1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 576 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 578 */     if (par1EntityLiving == null)
/*     */     {
/* 580 */       return false;
/*     */     }
/* 582 */     if (par1EntityLiving == this)
/*     */     {
/* 584 */       return false;
/*     */     }
/* 586 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 588 */       return false;
/*     */     }
/*     */     
/* 591 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 593 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/* 595 */       return false;
/*     */     }
/* 597 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 599 */       return false;
/*     */     }
/* 601 */     if (par1EntityLiving instanceof Brutalfly)
/*     */     {
/* 603 */       return false;
/*     */     }
/* 605 */     if (par1EntityLiving instanceof Vortex)
/*     */     {
/* 607 */       return false;
/*     */     }
/*     */     
/* 610 */     if (par1EntityLiving instanceof VelocityRaptor)
/*     */     {
/* 612 */       return false;
/*     */     }
/* 614 */     if (par1EntityLiving instanceof Cryolophosaurus)
/*     */     {
/* 616 */       return false;
/*     */     }
/*     */     
/* 619 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 621 */       return false;
/*     */     }
/* 623 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 625 */       return false;
/*     */     }
/* 627 */     if (par1EntityLiving instanceof CloudShark)
/*     */     {
/* 629 */       return false;
/*     */     }
/* 631 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 633 */       return false;
/*     */     }
/* 635 */     if (par1EntityLiving instanceof Bee)
/*     */     {
/* 637 */       return false;
/*     */     }
/* 639 */     if (par1EntityLiving instanceof Mantis)
/*     */     {
/* 641 */       return false;
/*     */     }
/*     */     
/* 644 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 646 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 647 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 648 */         return false;
/*     */       }
/*     */     } 
/* 651 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 656 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 657 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(15.0D, 20.0D, 15.0D));
/* 658 */     Collections.sort(var5, this.TargetSorter);
/* 659 */     Iterator<?> var2 = var5.iterator();
/* 660 */     Entity var3 = null;
/* 661 */     EntityLivingBase var4 = null;
/*     */     
/* 663 */     while (var2.hasNext()) {
/*     */       
/* 665 */       var3 = (Entity)var2.next();
/* 666 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 668 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 670 */         return var4;
/*     */       }
/*     */     } 
/* 673 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Mothra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */