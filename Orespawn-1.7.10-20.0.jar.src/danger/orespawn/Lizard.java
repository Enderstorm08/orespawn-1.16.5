/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAITempt;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.DamageSource;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Lizard
/*     */   extends EntityCannonFodder
/*     */ {
/*  70 */   private GenericTargetSorter TargetSorter = null;
/*     */   public boolean should_despawn = true;
/*  72 */   private EntityLivingBase buddy = null;
/*  73 */   private int follow_time = 0;
/*  74 */   private float moveSpeed = 0.3F;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  78 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(6.0D); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(23, Byte.valueOf((byte)0)); } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return 30; } public Lizard(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 271 */     this.closest = 99999;
/* 272 */     this.tx = 0; this.ty = 0; this.tz = 0; this.moveSpeed = 0.3F; func_70105_a(1.5F, 1.25F); func_70661_as().func_75491_a(false); this.field_70728_aV = 15; this.field_70174_ab = 3; this.field_70178_ae = false; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151100_aR, false)); this.field_70714_bg.func_75776_a(4, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   public int func_70658_aO() { return 5; }
/*     */   protected boolean func_70650_aV() { return true; }
/* 276 */   public void func_70636_d() { super.func_70636_d(); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 281 */     for (i = -dy; i <= dy; i++) {
/* 282 */       for (int j = -dz; j <= dz; j++) {
/* 283 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 284 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 285 */           int d = dx * dx + j * j + i * i;
/* 286 */           if (d < this.closest) {
/* 287 */             this.closest = d;
/* 288 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 289 */             found++;
/*     */           } 
/*     */         } 
/* 292 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 293 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 294 */           int d = dx * dx + j * j + i * i;
/* 295 */           if (d < this.closest) {
/* 296 */             this.closest = d;
/* 297 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 298 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 304 */     for (i = -dx; i <= dx; i++) {
/* 305 */       for (int j = -dz; j <= dz; j++) {
/* 306 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 307 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 308 */           int d = dy * dy + j * j + i * i;
/* 309 */           if (d < this.closest) {
/* 310 */             this.closest = d;
/* 311 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 312 */             found++;
/*     */           } 
/*     */         } 
/* 315 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 316 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 317 */           int d = dy * dy + j * j + i * i;
/* 318 */           if (d < this.closest) {
/* 319 */             this.closest = d;
/* 320 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 321 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 327 */     for (i = -dx; i <= dx; i++) {
/* 328 */       for (int j = -dy; j <= dy; j++) {
/* 329 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 330 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 331 */           int d = dz * dz + j * j + i * i;
/* 332 */           if (d < this.closest) {
/* 333 */             this.closest = d;
/* 334 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 335 */             found++;
/*     */           } 
/*     */         } 
/* 338 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 339 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 340 */           int d = dz * dz + j * j + i * i;
/* 341 */           if (d < this.closest) {
/* 342 */             this.closest = d;
/* 343 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 344 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 350 */     if (found != 0) return true; 
/* 351 */     return false; } public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; Entity e = par1DamageSource.func_76346_g(); if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*     */       ret = super.func_70097_a(par1DamageSource, par2); if (e != null && e instanceof EntityLivingBase)
/*     */         func_70624_b((EntityLivingBase)e); 
/*     */     }  this.follow_time = 0; return ret; }
/*     */   protected String func_70639_aQ() { return null; }
/*     */   protected String func_70621_aR() { return "orespawn:alo_hurt"; }
/*     */   protected String func_70673_aS() { return "orespawn:alo_death"; }
/* 358 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 359 */       return;  super.func_70619_bc();
/*     */     
/* 361 */     if (this.follow_time > 0) {
/* 362 */       this.follow_time--;
/* 363 */       this.should_despawn = false;
/*     */     } else {
/* 365 */       this.should_despawn = true;
/*     */     } 
/*     */ 
/*     */     
/* 369 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(100) == 0) {
/*     */ 
/*     */       
/* 372 */       this.closest = 99999;
/* 373 */       this.tx = this.ty = this.tz = 0;
/* 374 */       for (int i = 1; i < 14; i++) {
/* 375 */         int j = i;
/* 376 */         if (j > 5) j = 5; 
/* 377 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 378 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 381 */       if (this.closest < 99999) {
/* 382 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       }
/*     */     } 
/*     */     
/* 386 */     if (func_110143_aJ() < mygetMaxHealth() && this.field_70170_p.field_73012_v.nextInt(300) == 1) {
/* 387 */       func_70691_i(1.0F);
/*     */     }
/*     */ 
/*     */     
/* 391 */     if (this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 392 */       EntityLivingBase e = findSomethingToAttack();
/* 393 */       if (e != null) {
/* 394 */         this.follow_time = 0;
/* 395 */         if (func_70068_e((Entity)e) < 12.0D) {
/* 396 */           setAttacking(1);
/*     */           
/* 398 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 400 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 403 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/*     */         
/* 407 */         if (this.buddy != null && !this.buddy.field_70128_L && this.field_70170_p.field_73012_v.nextInt(15) == 1) {
/* 408 */           func_70661_as().func_75497_a((Entity)this.buddy, 1.0D);
/*     */         }
/* 410 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 415 */     if (this.buddy != null && !this.buddy.field_70128_L && this.follow_time > 0 && this.field_70170_p.field_73012_v.nextInt(20) == 1)
/* 416 */       func_70661_as().func_75497_a((Entity)this.buddy, 1.0D);  } protected float func_70599_aP() { return 1.0F; }
/*     */   protected float func_70647_i() { return 1.0F; }
/*     */   protected Item func_146068_u() { return null; }
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) { ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g(); if (var2 != null) if (var2.field_77994_a <= 0) { par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null); var2 = null; }   if (super.func_70085_c(par1EntityPlayer))
/*     */       return true;  if (var2 != null && var2.func_77973_b() == Items.field_151100_aR && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) { if (!this.field_70170_p.field_72995_K) { this.buddy = (EntityLivingBase)par1EntityPlayer; this.follow_time = 3000 + this.field_70170_p.field_73012_v.nextInt(2000); }  func_70908_e(true); if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0)
/*     */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (!this.field_70170_p.field_72995_K) { this.buddy = null; this.follow_time = 0; }  func_70908_e(false); return true; }
/* 422 */   public boolean func_70652_k(Entity par1Entity) { float i = 6.0F;
/*     */     
/* 424 */     boolean flag = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), i);
/*     */     
/* 426 */     return flag; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 436 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 438 */     if (par1EntityLiving == null)
/*     */     {
/* 440 */       return false;
/*     */     }
/* 442 */     if (par1EntityLiving == this)
/*     */     {
/* 444 */       return false;
/*     */     }
/* 446 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 448 */       return false;
/*     */     }
/* 450 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 453 */       return false;
/*     */     }
/* 455 */     if (par1EntityLiving instanceof AttackSquid)
/*     */     {
/* 457 */       return true;
/*     */     }
/* 459 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
/*     */     {
/* 461 */       return true;
/*     */     }
/* 463 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
/*     */     {
/* 465 */       return true;
/*     */     }
/* 467 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityChicken)
/*     */     {
/* 469 */       return true;
/*     */     }
/* 471 */     if (par1EntityLiving instanceof Lizard)
/*     */     {
/*     */       
/* 474 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1 && this.follow_time <= 0) this.buddy = par1EntityLiving;
/*     */     
/*     */     }
/* 477 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 482 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 483 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 4.0D, 12.0D));
/* 484 */     Collections.sort(var5, this.TargetSorter);
/* 485 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 487 */     Entity var3 = null;
/* 488 */     EntityLivingBase var4 = null;
/*     */     
/* 490 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 0) func_70624_b(null); 
/* 491 */     EntityLivingBase e = func_70638_az();
/* 492 */     if (e != null && e.func_70089_S()) {
/* 493 */       return e;
/*     */     }
/* 495 */     func_70624_b(null);
/*     */ 
/*     */     
/* 498 */     while (var2.hasNext()) {
/*     */       
/* 500 */       var3 = (Entity)var2.next();
/* 501 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 503 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 505 */         return var4;
/*     */       }
/*     */     } 
/* 508 */     return null;
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
/* 519 */     return this.field_70180_af.func_75683_a(23);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 524 */     this.field_70180_af.func_75692_b(23, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 532 */     if (this.field_70163_u < 50.0D) return false;
/*     */     
/* 534 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 543 */     if (func_70631_g_()) {
/* 544 */       func_110163_bv();
/* 545 */       return false;
/*     */     } 
/* 547 */     if (func_104002_bU()) return false; 
/* 548 */     if (func_70909_n()) return false; 
/* 549 */     return this.should_despawn;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 554 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Lizard spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 560 */     return new Lizard(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 568 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 577 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Lizard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */