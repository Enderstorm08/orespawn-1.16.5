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
/*     */ import net.minecraft.entity.monster.EntityMob;
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
/*     */ 
/*     */ public class Brutalfly
/*     */   extends EntityMob
/*     */ {
/*  50 */   private ChunkCoordinates currentFlightTarget = null;
/*  51 */   private int lastX = 0, lastZ = 0, lastY = 0;
/*  52 */   private int stuck_count = 0;
/*  53 */   private int wing_sound = 0;
/*  54 */   private int health_ticker = 100;
/*  55 */   private GenericTargetSorter TargetSorter = null;
/*  56 */   private float moveSpeed = 0.35F;
/*     */   
/*     */   public Brutalfly(World par1World) {
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
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Brutalfly_stats.attack);
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
/*  99 */     return OreSpawnMain.Brutalfly_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBrutalflyHealth() {
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
/* 156 */     return OreSpawnMain.Brutalfly_stats.health;
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
/* 186 */       this.health_ticker = 100;
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
/* 204 */     int keep_trying = 30;
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
/* 228 */     if (this.stuck_count > 30 || this.field_70170_p.field_73012_v.nextInt(200) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 9.0F) {
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
/* 250 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -1; 
/* 251 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -1; 
/* 252 */         int newz = this.field_70146_Z.nextInt(20) + 8;
/* 253 */         newz *= zdir;
/* 254 */         int newx = this.field_70146_Z.nextInt(20) + 8;
/* 255 */         newx *= xdir;
/* 256 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + newx, (int)this.field_70163_u + this.field_70170_p.field_73012_v.nextInt(7) - 1 - down, (int)this.field_70161_v + newz);
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
/*     */     
/* 268 */     if (this.field_70170_p.field_73012_v.nextInt(6) == 0) {
/*     */       
/* 270 */       EntityPlayer target = null;
/*     */       
/* 272 */       target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(30.0D, 20.0D, 30.0D), (Entity)this);
/* 273 */       if (target != null)
/*     */       {
/* 275 */         if (!target.field_71075_bZ.field_75098_d) {
/*     */           
/* 277 */           if (func_70635_at().func_75522_a((Entity)target)) {
/*     */             
/* 279 */             this.currentFlightTarget.func_71571_b((int)target.field_70165_t, (int)target.field_70163_u + 4, (int)target.field_70161_v);
/* 280 */             if (this.field_70146_Z.nextInt(shoot) == 0)
/* 281 */               attackWithSomething((EntityLivingBase)target); 
/*     */           } 
/*     */         } else {
/* 284 */           target = null;
/*     */         } 
/*     */       }
/*     */       
/* 288 */       if (target == null && this.field_70170_p.field_73012_v.nextInt(3) == 0) {
/* 289 */         EntityLivingBase e = null;
/* 290 */         e = findSomethingToAttack();
/* 291 */         if (e != null) {
/*     */ 
/*     */           
/* 294 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 5, (int)e.field_70161_v);
/* 295 */           if (func_70068_e((Entity)e) > 25.0D) {
/* 296 */             if (this.field_70170_p.field_73012_v.nextInt(shoot) == 0) {
/* 297 */               attackWithSomething(e);
/*     */             }
/*     */           } else {
/* 300 */             func_70652_k((Entity)e);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 306 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 307 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 308 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 309 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.30001D;
/* 310 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.20001D;
/* 311 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.30001D;
/* 312 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 313 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 314 */     this.field_70701_bs = 1.0F;
/* 315 */     this.field_70177_z += var8 / 8.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 324 */     return false;
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
/* 342 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 350 */     boolean ret = false;
/* 351 */     Entity e = par1DamageSource.func_76346_g();
/*     */     
/* 353 */     if (e != null && e instanceof Brutalfly) {
/* 354 */       return false;
/*     */     }
/* 356 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 358 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/*     */       
/* 361 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 2, (int)e.field_70161_v);
/*     */     }
/* 363 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 372 */     super.func_70037_a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 380 */     super.func_70014_b(par1NBTTagCompound);
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
/* 393 */     for (k = -2; k <= 2; k++) {
/*     */       
/* 395 */       for (int j = -2; j <= 2; j++) {
/*     */         
/* 397 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 399 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 400 */           if (bid == Blocks.field_150474_ac) {
/* 401 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 402 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 403 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 404 */             if (s != null && 
/* 405 */               s.equals("Brutalfly")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 412 */     if (this.field_70163_u < 70.0D) return false;
/*     */     
/* 414 */     if (!func_70814_o()) return false; 
/* 415 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 419 */     for (k = -4; k < 4; k++) {
/*     */       
/* 421 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 423 */         for (int i = 1; i < 10; i++) {
/*     */           
/* 425 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 426 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 434 */     Brutalfly target = null;
/* 435 */     target = (Brutalfly)this.field_70170_p.func_72857_a(Brutalfly.class, this.field_70121_D.func_72314_b(64.0D, 32.0D, 64.0D), (Entity)this);
/* 436 */     if (target != null)
/*     */     {
/* 438 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 442 */     return true;
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
/* 454 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), new ItemStack(index, par1, 0));
/*     */     
/* 456 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 463 */     for (int i = 0; i < 20; i++) {
/* 464 */       float var1 = (this.field_70146_Z.nextFloat() - 0.5F) * 8.0F;
/* 465 */       float var2 = (this.field_70146_Z.nextFloat() - 0.5F) * 4.0F;
/* 466 */       float var3 = (this.field_70146_Z.nextFloat() - 0.5F) * 8.0F;
/* 467 */       this.field_70170_p.func_72869_a("largeexplode", this.field_70165_t + var1, this.field_70163_u + 2.0D + var2, this.field_70161_v + var3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     int var4;
/* 470 */     for (var4 = 0; var4 < 53; var4++) {
/* 471 */       dropItemRand(Items.field_151074_bl, 1);
/*     */     }
/*     */     
/* 474 */     for (var4 = 0; var4 < 20; var4++) {
/* 475 */       spawnCreature(this.field_70170_p, "Butterfly", this.field_70165_t + 0.5D, this.field_70163_u + 1.0D, this.field_70161_v + 0.5D);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 486 */     Entity var8 = null;
/*     */     
/* 488 */     if (par0World == null) return null;
/*     */ 
/*     */     
/* 491 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/* 493 */     if (var8 != null) {
/*     */ 
/*     */       
/* 496 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 499 */       par0World.func_72838_d(var8);
/*     */       
/* 501 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/* 504 */     return var8;
/*     */   }
/*     */   
/*     */   private void attackWithSomething(EntityLivingBase par1) {
/* 508 */     double xzoff = 2.25D;
/*     */     
/* 510 */     double yoff = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 518 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 519 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*     */     
/* 521 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY) {
/* 522 */       EntitySmallFireball sf = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 523 */       sf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 524 */       sf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 525 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 526 */       this.field_70170_p.func_72838_d((Entity)sf);
/* 527 */     } else if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) {
/* 528 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/* 529 */         EntitySmallFireball sf = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 530 */         sf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 531 */         sf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 532 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 533 */         this.field_70170_p.func_72838_d((Entity)sf);
/*     */       } else {
/* 535 */         BetterFireball bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 536 */         bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 537 */         bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 538 */         bf.setNotMe();
/* 539 */         this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 540 */         this.field_70170_p.func_72838_d((Entity)bf);
/*     */       } 
/*     */     } else {
/* 543 */       BetterFireball bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, par1.field_70165_t - cx, par1.field_70163_u + 0.55D - this.field_70163_u + yoff, par1.field_70161_v - cz);
/* 544 */       bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/* 545 */       bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/* 546 */       bf.setNotMe();
/* 547 */       this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 548 */       this.field_70170_p.func_72838_d((Entity)bf);
/*     */     } 
/* 550 */     if (func_110143_aJ() < mygetMaxHealth()) {
/* 551 */       func_70691_i(1.0F);
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 563 */     if (par1EntityLiving == null)
/*     */     {
/* 565 */       return false;
/*     */     }
/* 567 */     if (par1EntityLiving == this)
/*     */     {
/* 569 */       return false;
/*     */     }
/* 571 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 573 */       return false;
/*     */     }
/*     */     
/* 576 */     if (par1EntityLiving instanceof Brutalfly)
/*     */     {
/* 578 */       return false;
/*     */     }
/* 580 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 582 */       return false;
/*     */     }
/* 584 */     if (par1EntityLiving instanceof Vortex)
/*     */     {
/* 586 */       return false;
/*     */     }
/*     */     
/* 589 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 591 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/* 593 */       return false;
/*     */     }
/*     */     
/* 596 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 598 */       return true;
/*     */     }
/*     */     
/* 601 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 603 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 604 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 605 */         return false;
/*     */       }
/* 607 */       return true;
/*     */     } 
/* 609 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 614 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 615 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(25.0D, 20.0D, 25.0D));
/* 616 */     Collections.sort(var5, this.TargetSorter);
/* 617 */     Iterator<?> var2 = var5.iterator();
/* 618 */     Entity var3 = null;
/* 619 */     EntityLivingBase var4 = null;
/*     */     
/* 621 */     while (var2.hasNext()) {
/*     */       
/* 623 */       var3 = (Entity)var2.next();
/* 624 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 626 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 628 */         return var4;
/*     */       }
/*     */     } 
/* 631 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Brutalfly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */