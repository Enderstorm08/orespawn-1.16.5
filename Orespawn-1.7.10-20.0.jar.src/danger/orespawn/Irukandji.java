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
/*     */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.DamageSource;
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
/*     */ public class Irukandji
/*     */   extends EntityMob
/*     */ {
/*  65 */   private GenericTargetSorter TargetSorter = null;
/*  66 */   private EntityLivingBase buddy = null;
/*  67 */   private float moveSpeed = 0.15F;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  71 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Irukandji_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; } public boolean func_70648_aU() { return true; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public Irukandji(World par1World) { super(par1World);
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
/* 263 */     this.closest = 99999;
/* 264 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.25F, 0.25F); func_70661_as().func_75491_a(false); this.field_70728_aV = 50; this.field_70174_ab = 1; this.field_70178_ae = false; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIWander((EntityCreature)this, 1.0F)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   public int mygetMaxHealth() { return OreSpawnMain.Irukandji_stats.health; }
/*     */   public int func_70658_aO() { return OreSpawnMain.Irukandji_stats.defense; }
/*     */   protected boolean func_70650_aV() { return true; }
/* 268 */   public void func_70636_d() { super.func_70636_d(); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 273 */     for (i = -dy; i <= dy; i++) {
/* 274 */       for (int j = -dz; j <= dz; j++) {
/* 275 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 276 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 277 */           int d = dx * dx + j * j + i * i;
/* 278 */           if (d < this.closest) {
/* 279 */             this.closest = d;
/* 280 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 281 */             found++;
/*     */           } 
/*     */         } 
/* 284 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 285 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 286 */           int d = dx * dx + j * j + i * i;
/* 287 */           if (d < this.closest) {
/* 288 */             this.closest = d;
/* 289 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 290 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 296 */     for (i = -dx; i <= dx; i++) {
/* 297 */       for (int j = -dz; j <= dz; j++) {
/* 298 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 299 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 300 */           int d = dy * dy + j * j + i * i;
/* 301 */           if (d < this.closest) {
/* 302 */             this.closest = d;
/* 303 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 304 */             found++;
/*     */           } 
/*     */         } 
/* 307 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 308 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 309 */           int d = dy * dy + j * j + i * i;
/* 310 */           if (d < this.closest) {
/* 311 */             this.closest = d;
/* 312 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 313 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 319 */     for (i = -dx; i <= dx; i++) {
/* 320 */       for (int j = -dy; j <= dy; j++) {
/* 321 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 322 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 323 */           int d = dz * dz + j * j + i * i;
/* 324 */           if (d < this.closest) {
/* 325 */             this.closest = d;
/* 326 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 327 */             found++;
/*     */           } 
/*     */         } 
/* 330 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 331 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 332 */           int d = dz * dz + j * j + i * i;
/* 333 */           if (d < this.closest) {
/* 334 */             this.closest = d;
/* 335 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 336 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 342 */     if (found != 0) return true; 
/* 343 */     return false; }
/*     */   public int getAttackStrength(Entity par1Entity) { int var2 = 2;
/*     */     return var2; }
/*     */   protected String func_70639_aQ() { return null; }
/*     */   protected String func_70621_aR() { return "orespawn:little_splt"; }
/*     */   protected String func_70673_aS() { return "orespawn:ratdead"; }
/*     */   protected float func_70599_aP() { return 0.25F; }
/* 350 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 351 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 354 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(10) == 0) {
/*     */ 
/*     */       
/* 357 */       this.closest = 99999;
/* 358 */       this.tx = this.ty = this.tz = 0;
/* 359 */       for (int i = 1; i < 12; i++) {
/* 360 */         int j = i;
/* 361 */         if (j > 5) j = 5; 
/* 362 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 363 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 366 */       if (this.closest < 99999) {
/* 367 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       } else {
/* 369 */         if (this.field_70170_p.field_73012_v.nextInt(25) == 1)
/* 370 */           func_70691_i(-1.0F); 
/* 371 */         if (func_110143_aJ() <= 0.0F) {
/* 372 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 379 */     if (this.field_70170_p.field_73012_v.nextInt(8) == 1) {
/* 380 */       EntityLivingBase e = findSomethingToAttack();
/* 381 */       if (e != null) {
/* 382 */         if (func_70068_e((Entity)e) < 3.0D) {
/* 383 */           setAttacking(1);
/*     */           
/* 385 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 387 */             func_70652_k((Entity)e);
/*     */ 
/*     */           
/*     */           }
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 397 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/* 400 */         setAttacking(0);
/*     */       } 
/*     */     }  } protected float func_70647_i() { return 2.0F; } protected Item func_146068_u() { return OreSpawnMain.MyIrukandji; }
/*     */   public void initCreature() {}
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) { if (par1EntityPlayer != null && par1EntityPlayer.func_71045_bC() == null)
/*     */       par1EntityPlayer.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 200.0F);  return false; }
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (this.field_70128_L)
/*     */       return false;  Entity e = par1DamageSource.func_76346_g(); if (e != null && e instanceof EntityPlayer) {
/*     */       EntityPlayer p = (EntityPlayer)e; if (p.func_71045_bC() == null) {
/*     */         p.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 200.0F); return false;
/*     */       } 
/*     */     }  if (e != null && e instanceof EntityLiving) {
/*     */       if (e instanceof Irukandji)
/*     */         return false;  func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D);
/*     */       ret = true;
/*     */     } 
/*     */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     return ret; }
/* 418 */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) { if (par1EntityLiving == null)
/*     */     {
/* 420 */       return false;
/*     */     }
/* 422 */     if (par1EntityLiving == this)
/*     */     {
/* 424 */       return false;
/*     */     }
/* 426 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 428 */       return false;
/*     */     }
/* 430 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 433 */       return false;
/*     */     }
/* 435 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 437 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 438 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 439 */         return false;
/*     */       }
/* 441 */       return true;
/*     */     } 
/*     */     
/* 444 */     return false; }
/*     */ 
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 449 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 450 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(6.0D, 4.0D, 6.0D));
/* 451 */     Collections.sort(var5, this.TargetSorter);
/* 452 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 454 */     Entity var3 = null;
/* 455 */     EntityLivingBase var4 = null;
/*     */     
/* 457 */     EntityLivingBase e = func_70638_az();
/* 458 */     if (e != null && e.func_70089_S()) {
/* 459 */       return e;
/*     */     }
/* 461 */     func_70624_b(null);
/*     */ 
/*     */     
/* 464 */     while (var2.hasNext()) {
/*     */       
/* 466 */       var3 = (Entity)var2.next();
/* 467 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 469 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 471 */         return var4;
/*     */       }
/*     */     } 
/* 474 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 485 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 490 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 495 */     List var5 = this.field_70170_p.func_72872_a(Irukandji.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D));
/* 496 */     return var5.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 504 */     if (this.field_70163_u < 50.0D) return false; 
/* 505 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 506 */     if (this.field_70170_p.field_73012_v.nextInt(60) != 1) return false; 
/* 507 */     if (findBuddies() > 2) return false; 
/* 508 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Irukandji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */