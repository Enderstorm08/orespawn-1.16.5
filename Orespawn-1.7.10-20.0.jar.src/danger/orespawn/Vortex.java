/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class Vortex
/*     */   extends EntityMob
/*     */ {
/*  54 */   private ChunkCoordinates currentFlightTarget = null;
/*  55 */   private GenericTargetSorter TargetSorter = null;
/*  56 */   private int winded = 0;
/*  57 */   private int busy_fighting = 0;
/*  58 */   private int was_spawnered = 0;
/*     */   
/*     */   public Vortex(World par1World) {
/*  61 */     super(par1World);
/*  62 */     func_70105_a(2.0F, 4.0F);
/*  63 */     this.field_70728_aV = 200;
/*  64 */     this.field_70178_ae = true;
/*  65 */     this.field_70174_ab = 250;
/*  66 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  71 */     super.func_110147_ax();
/*  72 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  73 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3499999940395355D);
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Vortex_stats.attack);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  78 */     if (func_104002_bU()) return false; 
/*  79 */     if (this.busy_fighting != 0) return false; 
/*  80 */     if (this.was_spawnered != 0) return false; 
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  88 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  95 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 102 */     return "orespawn:vortexlive";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 109 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 116 */     return "orespawn:vortexlive";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 123 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 130 */     return OreSpawnMain.Vortex_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 137 */     return true;
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
/*     */   public void func_70071_h_() {
/* 149 */     EntityLivingBase e = null;
/* 150 */     super.func_70071_h_();
/*     */     
/* 152 */     this.field_70181_x *= 0.6D;
/* 153 */     this.busy_fighting = 0;
/* 154 */     e = findSomethingToAttack();
/* 155 */     if (e != null) {
/*     */       
/* 157 */       this.busy_fighting = 1;
/* 158 */       if (this.field_70170_p.field_72995_K)
/*     */       {
/*     */ 
/*     */         
/* 162 */         for (int i = 0; i < 20; i++) {
/* 163 */           double d = this.field_70170_p.field_73012_v.nextDouble() * 3.5D;
/* 164 */           d *= d;
/* 165 */           double dir = this.field_70170_p.field_73012_v.nextDouble() * 2.0D * Math.PI;
/* 166 */           dir -= Math.PI;
/* 167 */           double dx = Math.cos(dir) * d / 2.0D;
/* 168 */           double dz = Math.sin(dir) * d / 2.0D;
/* 169 */           dir += 1.5707963267948966D;
/* 170 */           this.field_70170_p.func_72869_a("smoke", this.field_70165_t + dx, this.field_70163_u + 0.75D + d, this.field_70161_v + dz, Math.cos(dir) * this.field_70170_p.field_73012_v.nextFloat() / 4.0D, (this.field_70170_p.field_73012_v.nextFloat() / 2.0F), Math.sin(dir) * this.field_70170_p.field_73012_v.nextFloat() / 4.0D);
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70691_i(1.0F);
/*     */     
/* 180 */     if (func_104002_bU())
/* 181 */       return;  if (this.busy_fighting != 0)
/* 182 */       return;  if (this.was_spawnered != 0)
/* 183 */       return;  long t = this.field_70170_p.func_72820_D();
/* 184 */     t %= 24000L;
/* 185 */     if (t < 12000L && this.field_70170_p.field_73012_v.nextInt(500) == 1) func_70106_y();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 194 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 201 */     int xdir = 1;
/* 202 */     int zdir = 1;
/*     */     
/* 204 */     int keep_trying = 50;
/*     */ 
/*     */     
/* 207 */     EntityLivingBase e = null;
/*     */ 
/*     */     
/* 210 */     if (this.field_70128_L)
/* 211 */       return;  super.func_70619_bc();
/*     */     
/* 213 */     if (this.currentFlightTarget == null) {
/* 214 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */     
/* 217 */     if (this.winded > 0) this.winded--;
/*     */     
/* 219 */     if (this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 221 */       Block bid = Blocks.field_150348_b;
/* 222 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 223 */         zdir = this.field_70146_Z.nextInt(14) + 10;
/* 224 */         xdir = this.field_70146_Z.nextInt(14) + 10;
/* 225 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 226 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 227 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 3, (int)this.field_70161_v + zdir);
/* 228 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 229 */         if (bid == Blocks.field_150350_a && 
/* 230 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 231 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 234 */         keep_trying--;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 240 */     e = findSomethingToAttack();
/* 241 */     if (e != null) {
/*     */       
/* 243 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */       
/* 245 */       double d = func_70068_e((Entity)e);
/* 246 */       if (d < 81.0D && this.winded == 0) {
/* 247 */         double a = Math.atan2(this.field_70161_v - e.field_70161_v, this.field_70165_t - e.field_70165_t);
/* 248 */         double pm = 1.0D;
/* 249 */         if (e instanceof EntityPlayer) pm = 2.0D; 
/* 250 */         e.func_70024_g(Math.cos(a) * (10.0D - Math.sqrt(d)) * 0.10000000149011612D, (10.0D - Math.sqrt(d)) * 0.05000000074505806D * pm, Math.sin(a) * (10.0D - Math.sqrt(d)) * 0.10000000149011612D);
/*     */       } 
/* 252 */       if (func_70068_e((Entity)e) < ((4.0F + e.field_70130_N / 2.0F) * (4.0F + e.field_70130_N / 2.0F)) && this.field_70146_Z.nextInt(8) == 2) {
/* 253 */         func_70652_k((Entity)e);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 258 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 259 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 260 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 261 */     this.field_70159_w += (Math.signum(var1) * 0.4D - this.field_70159_w) * 0.2D;
/* 262 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 263 */     this.field_70179_y += (Math.signum(var5) * 0.4D - this.field_70179_y) * 0.2D;
/* 264 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 265 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 266 */     this.field_70701_bs = 0.75F;
/* 267 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 276 */     return true;
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
/* 294 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 302 */     boolean ret = false;
/* 303 */     Entity e = par1DamageSource.func_76346_g();
/* 304 */     ret = super.func_70097_a(par1DamageSource, par2);
/* 305 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 307 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     }
/* 309 */     this.winded = 20;
/* 310 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 319 */     return OreSpawnMain.Vortex_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 329 */     for (k = -3; k < 3; k++) {
/*     */       
/* 331 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 333 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 335 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 336 */           if (bid == Blocks.field_150474_ac) {
/* 337 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 338 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 339 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 340 */             if (s != null && 
/* 341 */               s.equals("Vortex")) {
/* 342 */               this.was_spawnered = 1;
/* 343 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 352 */     for (k = -2; k <= 2; k++) {
/*     */       
/* 354 */       for (int j = -2; j <= 2; j++) {
/*     */         
/* 356 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 358 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 359 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 363 */     if (!func_70814_o()) return false; 
/* 364 */     if (this.field_70163_u < 50.0D) return false; 
/* 365 */     long t = this.field_70170_p.func_72820_D();
/* 366 */     t %= 24000L;
/* 367 */     if (t < 12000L) return false; 
/* 368 */     if (this.field_70170_p.field_73012_v.nextInt(2) != 1) return false; 
/* 369 */     Vortex target = null;
/* 370 */     target = (Vortex)this.field_70170_p.func_72857_a(Vortex.class, this.field_70121_D.func_72314_b(20.0D, 16.0D, 20.0D), (Entity)this);
/* 371 */     if (target != null)
/*     */     {
/* 373 */       return false;
/*     */     }
/*     */     
/* 376 */     return true;
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 388 */     if (par1EntityLiving == null)
/*     */     {
/* 390 */       return false;
/*     */     }
/* 392 */     if (par1EntityLiving == this)
/*     */     {
/* 394 */       return false;
/*     */     }
/* 396 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 399 */       return false;
/*     */     }
/*     */     
/* 402 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 404 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 407 */       return false;
/*     */     }
/*     */     
/* 410 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 412 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 413 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 414 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 418 */     if (par1EntityLiving instanceof Vortex)
/*     */     {
/* 420 */       return false;
/*     */     }
/* 422 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 424 */       return false;
/*     */     }
/* 426 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 428 */       return false;
/*     */     }
/* 430 */     if (par1EntityLiving instanceof Brutalfly)
/*     */     {
/* 432 */       return false;
/*     */     }
/* 434 */     if (par1EntityLiving instanceof Peacock)
/*     */     {
/* 436 */       return false;
/*     */     }
/* 438 */     if (par1EntityLiving instanceof CrystalCow)
/*     */     {
/* 440 */       return false;
/*     */     }
/* 442 */     if (par1EntityLiving instanceof Irukandji)
/*     */     {
/* 444 */       return false;
/*     */     }
/* 446 */     if (par1EntityLiving instanceof Skate)
/*     */     {
/* 448 */       return false;
/*     */     }
/* 450 */     if (par1EntityLiving instanceof Whale)
/*     */     {
/* 452 */       return false;
/*     */     }
/* 454 */     if (par1EntityLiving instanceof Flounder)
/*     */     {
/* 456 */       return false;
/*     */     }
/* 458 */     if (par1EntityLiving instanceof Urchin)
/*     */     {
/* 460 */       return false;
/*     */     }
/*     */     
/* 463 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 468 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 469 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 10.0D, 16.0D));
/* 470 */     Collections.sort(var5, this.TargetSorter);
/* 471 */     Iterator<?> var2 = var5.iterator();
/* 472 */     Entity var3 = null;
/* 473 */     EntityLivingBase var4 = null;
/*     */     
/* 475 */     while (var2.hasNext()) {
/*     */       
/* 477 */       var3 = (Entity)var2.next();
/* 478 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 480 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 482 */         return var4;
/*     */       }
/*     */     } 
/* 485 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 490 */     EntityItem var3 = null;
/* 491 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 493 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(6) - OreSpawnMain.OreSpawnRand.nextInt(6), this.field_70163_u + 1.0D + this.field_70170_p.field_73012_v.nextInt(10), this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(6) - OreSpawnMain.OreSpawnRand.nextInt(6), is);
/*     */     
/* 495 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 496 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 503 */     dropItemRand(OreSpawnMain.VortexEye, 1);
/* 504 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 506 */     int i = 5 + this.field_70170_p.field_73012_v.nextInt(7);
/* 507 */     for (int var4 = 0; var4 < i; var4++) {
/* 508 */       int var3 = this.field_70170_p.field_73012_v.nextInt(10);
/* 509 */       if (var3 == 0) dropItemRand(Items.field_151055_y, 1); 
/* 510 */       if (var3 == 1) dropItemRand(OreSpawnMain.MyTigersEyeIngot, 1); 
/* 511 */       if (var3 == 2) dropItemRand(OreSpawnMain.MyCrystalPinkIngot, 1); 
/* 512 */       if (var3 == 3) dropItemRand(Items.field_151042_j, 1); 
/* 513 */       if (var3 == 4) dropItemRand(OreSpawnMain.UraniumNugget, 1); 
/* 514 */       if (var3 == 6) dropItemRand(OreSpawnMain.TitaniumNugget, 1); 
/* 515 */       if (var3 == 7) dropItemRand(OreSpawnMain.MyIrukandji, 1); 
/* 516 */       if (var3 == 8) dropItemRand(Item.func_150898_a(OreSpawnMain.CrystalCoal), 1);
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 526 */     return OreSpawnMain.FairyEgg;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Vortex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */