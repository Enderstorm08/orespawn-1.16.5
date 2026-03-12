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
/*     */ import net.minecraft.init.Items;
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
/*     */ public class Skate
/*     */   extends EntityMob
/*     */ {
/*  64 */   private GenericTargetSorter TargetSorter = null;
/*  65 */   private EntityLivingBase buddy = null;
/*  66 */   private float moveSpeed = 0.25F;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  70 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Skate_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return OreSpawnMain.Skate_stats.health; } public Skate(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 247 */     this.closest = 99999;
/* 248 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.75F, 0.25F); func_70661_as().func_75491_a(false); this.field_70728_aV = 10; this.field_70174_ab = 3; this.field_70178_ae = false; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIWander((EntityCreature)this, 1.0F)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   public boolean func_70648_aU() { return true; }
/*     */   public int func_70658_aO() { return OreSpawnMain.Skate_stats.defense; }
/*     */   protected boolean func_70650_aV() { return true; }
/* 252 */   public void func_70636_d() { super.func_70636_d(); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 257 */     for (i = -dy; i <= dy; i++) {
/* 258 */       for (int j = -dz; j <= dz; j++) {
/* 259 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 260 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 261 */           int d = dx * dx + j * j + i * i;
/* 262 */           if (d < this.closest) {
/* 263 */             this.closest = d;
/* 264 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 265 */             found++;
/*     */           } 
/*     */         } 
/* 268 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 269 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 270 */           int d = dx * dx + j * j + i * i;
/* 271 */           if (d < this.closest) {
/* 272 */             this.closest = d;
/* 273 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 274 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 280 */     for (i = -dx; i <= dx; i++) {
/* 281 */       for (int j = -dz; j <= dz; j++) {
/* 282 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 283 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 284 */           int d = dy * dy + j * j + i * i;
/* 285 */           if (d < this.closest) {
/* 286 */             this.closest = d;
/* 287 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 288 */             found++;
/*     */           } 
/*     */         } 
/* 291 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 292 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 293 */           int d = dy * dy + j * j + i * i;
/* 294 */           if (d < this.closest) {
/* 295 */             this.closest = d;
/* 296 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 297 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 303 */     for (i = -dx; i <= dx; i++) {
/* 304 */       for (int j = -dy; j <= dy; j++) {
/* 305 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 306 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 307 */           int d = dz * dz + j * j + i * i;
/* 308 */           if (d < this.closest) {
/* 309 */             this.closest = d;
/* 310 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 311 */             found++;
/*     */           } 
/*     */         } 
/* 314 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 315 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 316 */           int d = dz * dz + j * j + i * i;
/* 317 */           if (d < this.closest) {
/* 318 */             this.closest = d;
/* 319 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 320 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 326 */     if (found != 0) return true; 
/* 327 */     return false; } public int getAttackStrength(Entity par1Entity) { int var2 = 4; return var2; } protected String func_70639_aQ() { return null; } protected String func_70621_aR() { return null; }
/*     */   protected String func_70673_aS() { return "orespawn:ratdead"; }
/*     */   protected float func_70599_aP() { return 0.33F; }
/*     */   protected float func_70647_i() { return 1.75F; }
/*     */   protected Item func_146068_u() { return Items.field_151007_F; }
/*     */   public void initCreature() {}
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (this.field_70128_L) return false;  Entity e = par1DamageSource.func_76346_g(); if (e != null && e instanceof Skate) return false;  if (e != null && e instanceof EntityLiving) { if (e instanceof Skate) return false;  func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D); ret = true; }  ret = super.func_70097_a(par1DamageSource, par2); return ret; }
/* 334 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 335 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 338 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(10) == 0) {
/*     */ 
/*     */       
/* 341 */       this.closest = 99999;
/* 342 */       this.tx = this.ty = this.tz = 0;
/* 343 */       for (int i = 1; i < 12; i++) {
/* 344 */         int j = i;
/* 345 */         if (j > 5) j = 5; 
/* 346 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 347 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 350 */       if (this.closest < 99999) {
/* 351 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       } else {
/* 353 */         if (this.field_70170_p.field_73012_v.nextInt(25) == 1)
/* 354 */           func_70691_i(-1.0F); 
/* 355 */         if (func_110143_aJ() <= 0.0F) {
/* 356 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 363 */     if (this.field_70170_p.field_73012_v.nextInt(8) == 1) {
/* 364 */       EntityLivingBase e = findSomethingToAttack();
/* 365 */       if (e != null) {
/* 366 */         if (func_70068_e((Entity)e) < 4.0D) {
/* 367 */           setAttacking(1);
/*     */           
/* 369 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 371 */             func_70652_k((Entity)e);
/*     */ 
/*     */           
/*     */           }
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 381 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/* 384 */         setAttacking(0);
/*     */       } 
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 402 */     if (par1EntityLiving == null)
/*     */     {
/* 404 */       return false;
/*     */     }
/* 406 */     if (par1EntityLiving == this)
/*     */     {
/* 408 */       return false;
/*     */     }
/* 410 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 412 */       return false;
/*     */     }
/* 414 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 417 */       return false;
/*     */     }
/* 419 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 421 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 422 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 423 */         return false;
/*     */       }
/* 425 */       return true;
/*     */     } 
/*     */     
/* 428 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 433 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 434 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 4.0D, 10.0D));
/* 435 */     Collections.sort(var5, this.TargetSorter);
/* 436 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 438 */     Entity var3 = null;
/* 439 */     EntityLivingBase var4 = null;
/*     */     
/* 441 */     EntityLivingBase e = func_70638_az();
/* 442 */     if (e != null && e.func_70089_S()) {
/* 443 */       return e;
/*     */     }
/* 445 */     func_70624_b(null);
/*     */ 
/*     */     
/* 448 */     while (var2.hasNext()) {
/*     */       
/* 450 */       var3 = (Entity)var2.next();
/* 451 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 453 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 455 */         return var4;
/*     */       }
/*     */     } 
/* 458 */     return null;
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
/* 469 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 474 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 479 */     List var5 = this.field_70170_p.func_72872_a(Skate.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D));
/* 480 */     return var5.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 489 */     if (this.field_70163_u < 50.0D) return false; 
/* 490 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 491 */     if (this.field_70170_p.field_73012_v.nextInt(30) != 1) return false; 
/* 492 */     if (findBuddies() > 6) return false;
/*     */     
/* 494 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Skate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */