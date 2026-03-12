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
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Crab
/*     */   extends EntityMob
/*     */ {
/*  90 */   private GenericTargetSorter TargetSorter = null;
/*  91 */   private int hurt_timer = 0;
/*  92 */   private float moveSpeed = 0.55F;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  96 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a((this.moveSpeed * getCrabScale())); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a((OreSpawnMain.Crab_stats.attack * getCrabScale())); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); this.field_70180_af.func_75682_a(21, Integer.valueOf(0)); float t = 0.25F; if (this.field_70170_p != null) { if (this.field_70170_p.field_73012_v.nextInt(4) == 1) t = 0.5F;  if (this.field_70170_p.field_73012_v.nextInt(8) == 2) t = 1.0F;  } else { if (OreSpawnMain.OreSpawnRand.nextInt(4) == 1) t = 0.5F;  if (OreSpawnMain.OreSpawnRand.nextInt(8) == 2) t = 1.0F;  }  setCrabScale(t); this.field_70728_aV = (int)(400.0F * t); this.field_70174_ab = (int)(10.0F * t); func_70105_a(3.75F * getCrabScale(), 3.5F * getCrabScale()); } public float getCrabScale() { int i = this.field_70180_af.func_75679_c(21); float f = i; return f / 100.0F; } public void setCrabScale(float par1) { float f = par1 * 100.0F; int i = (int)f; this.field_70180_af.func_75692_b(21, Integer.valueOf(i)); } public void func_70037_a(NBTTagCompound par1NBTTagCompound) { super.func_70037_a(par1NBTTagCompound); setCrabScale(par1NBTTagCompound.func_74760_g("Fscale")); func_70105_a(3.75F * getCrabScale(), 3.5F * getCrabScale()); this.field_70728_aV = (int)(400.0F * getCrabScale()); this.field_70174_ab = (int)(10.0F * getCrabScale()); } public void func_70014_b(NBTTagCompound par1NBTTagCompound) { super.func_70014_b(par1NBTTagCompound); par1NBTTagCompound.func_74776_a("Fscale", getCrabScale()); } public Crab(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     this.closest = 99999;
/* 375 */     this.tx = 0; this.ty = 0; this.tz = 0; this.moveSpeed = 0.55F; func_70105_a(1.25F, 2.5F); func_70661_as().func_75491_a(false); this.field_70728_aV = 150; this.field_70174_ab = 30; this.field_70178_ae = false; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; }
/*     */   public void func_70071_h_() { if (func_70090_H()) { this.moveSpeed = 0.95F; } else { this.moveSpeed = 0.55F; }  func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a((this.moveSpeed * getCrabScale())); super.func_70071_h_(); func_70105_a(2.5F * getCrabScale(), 3.5F * getCrabScale()); }
/*     */   public int mygetMaxHealth() { return (int)(OreSpawnMain.PitchBlack_stats.health * getCrabScale()); }
/* 379 */   public int func_70658_aO() { return OreSpawnMain.Crab_stats.defense + (int)(2.0F * getCrabScale()); } protected boolean func_70650_aV() { return true; } public void func_70636_d() { super.func_70636_d(); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 384 */     for (i = -dy; i <= dy; i++) {
/* 385 */       for (int j = -dz; j <= dz; j++) {
/* 386 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 387 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 388 */           int d = dx * dx + j * j + i * i;
/* 389 */           if (d < this.closest) {
/* 390 */             this.closest = d;
/* 391 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 392 */             found++;
/*     */           } 
/*     */         } 
/* 395 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 396 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 397 */           int d = dx * dx + j * j + i * i;
/* 398 */           if (d < this.closest) {
/* 399 */             this.closest = d;
/* 400 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 401 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 407 */     for (i = -dx; i <= dx; i++) {
/* 408 */       for (int j = -dz; j <= dz; j++) {
/* 409 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 410 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 411 */           int d = dy * dy + j * j + i * i;
/* 412 */           if (d < this.closest) {
/* 413 */             this.closest = d;
/* 414 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 415 */             found++;
/*     */           } 
/*     */         } 
/* 418 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 419 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 420 */           int d = dy * dy + j * j + i * i;
/* 421 */           if (d < this.closest) {
/* 422 */             this.closest = d;
/* 423 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 424 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 430 */     for (i = -dx; i <= dx; i++) {
/* 431 */       for (int j = -dy; j <= dy; j++) {
/* 432 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 433 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 434 */           int d = dz * dz + j * j + i * i;
/* 435 */           if (d < this.closest) {
/* 436 */             this.closest = d;
/* 437 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 438 */             found++;
/*     */           } 
/*     */         } 
/* 441 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 442 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 443 */           int d = dz * dz + j * j + i * i;
/* 444 */           if (d < this.closest) {
/* 445 */             this.closest = d;
/* 446 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 447 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 453 */     if (found != 0) return true; 
/* 454 */     return false; } public int getCrabHealth() { return (int)func_110143_aJ(); } protected String func_70639_aQ() { return null; } protected String func_70621_aR() { return "orespawn:leaves_hit"; } protected String func_70673_aS() { return null; } protected float func_70599_aP() { return 0.75F; } protected float func_70647_i() { return 2.0F - 0.3F * 1.0F / getCrabScale(); } protected Item func_146068_u() { return Items.field_151115_aP; }
/*     */   private ItemStack dropItemRand(Item index, int par1) { EntityItem var3 = null; ItemStack is = new ItemStack(index, par1, 0); var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is); if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3);  return is; }
/*     */   protected void func_70628_a(boolean par1, int par2) { ItemStack is = null; int var5 = 4 + this.field_70170_p.field_73012_v.nextInt(8); var5 = (int)(var5 * getCrabScale()); if (var5 < 1) var5 = 1;  for (int var4 = 0; var4 < var5; var4++) dropItemRand(OreSpawnMain.MyRawCrabMeat, 1);  }
/*     */   public void initCreature() {}
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) { return false; }
/*     */   public boolean func_70652_k(Entity par1Entity) { boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), OreSpawnMain.Crab_stats.attack * getCrabScale()); if (var4 && par1Entity != null && par1Entity instanceof EntityLivingBase) { double ks = 1.15D * getCrabScale(); double inair = 0.48D * getCrabScale(); float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t); if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D;  par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks); }  return var4; }
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (par1DamageSource.func_76355_l().equals("cactus")) return false;  Entity e = par1DamageSource.func_76346_g(); if (this.hurt_timer <= 0) { ret = super.func_70097_a(par1DamageSource, par2); this.hurt_timer = 8; }  if (e != null && e instanceof EntityLiving) { if (e instanceof Crab) return false;  func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D); }  return ret; }
/* 461 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 462 */       return;  super.func_70619_bc();
/* 463 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*     */     
/* 465 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(25) == 0) {
/*     */ 
/*     */       
/* 468 */       this.closest = 99999;
/* 469 */       this.tx = this.ty = this.tz = 0;
/* 470 */       for (int i = 1; i < 12; i++) {
/* 471 */         int j = i;
/* 472 */         if (j > 10) j = 10; 
/* 473 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 474 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 477 */       if (this.closest < 99999) {
/* 478 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       } else {
/* 480 */         if (this.field_70170_p.field_73012_v.nextInt(100) == 1)
/* 481 */           func_70691_i(-1.0F * getCrabScale()); 
/* 482 */         if (func_110143_aJ() <= 0.0F) {
/* 483 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 490 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 491 */       EntityLivingBase e = null;
/* 492 */       if (this.field_70170_p.field_73012_v.nextInt(100) == 1) func_70624_b(null); 
/* 493 */       e = func_70638_az();
/* 494 */       if (e != null && !e.func_70089_S()) {
/* 495 */         func_70624_b(null);
/* 496 */         e = null;
/*     */       } 
/* 498 */       if (e == null) {
/* 499 */         e = findSomethingToAttack();
/*     */       }
/* 501 */       if (e != null) {
/* 502 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 503 */         if (func_70068_e((Entity)e) < ((6.0F + e.field_70130_N / 2.0F) * (6.0F + e.field_70130_N / 2.0F) * getCrabScale())) {
/* 504 */           setAttacking(1);
/*     */           
/* 506 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/*     */             
/* 508 */             func_70652_k((Entity)e);
/* 509 */             if (!this.field_70170_p.field_72995_K) {
/* 510 */               if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 511 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_attack", 0.75F, 1.5F);
/*     */               } else {
/* 513 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_living", 0.75F, 1.5F);
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } else {
/* 518 */           func_70661_as().func_75497_a((Entity)e, 1.0D);
/*     */         } 
/*     */       } else {
/* 521 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 526 */     if (this.field_70170_p.field_73012_v.nextInt(120) == 1 && func_70090_H() && 
/* 527 */       func_110143_aJ() < mygetMaxHealth()) {
/* 528 */       func_85030_a("splash", 1.5F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */       
/* 530 */       func_70691_i(4.0F * getCrabScale());
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
/* 547 */     if (par1EntityLiving == null)
/*     */     {
/* 549 */       return false;
/*     */     }
/* 551 */     if (par1EntityLiving == this)
/*     */     {
/* 553 */       return false;
/*     */     }
/* 555 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 557 */       return false;
/*     */     }
/* 559 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 562 */       return false;
/*     */     }
/* 564 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 566 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 567 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 568 */         return false;
/*     */       }
/* 570 */       return true;
/*     */     } 
/* 572 */     if (par1EntityLiving instanceof Crab)
/*     */     {
/* 574 */       return false;
/*     */     }
/* 576 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 578 */       return true;
/*     */     }
/* 580 */     if (par1EntityLiving instanceof Lizard)
/*     */     {
/* 582 */       return true;
/*     */     }
/* 584 */     if (par1EntityLiving instanceof RubberDucky)
/*     */     {
/* 586 */       return true;
/*     */     }
/* 588 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
/*     */     {
/* 590 */       return true;
/*     */     }
/* 592 */     if (par1EntityLiving instanceof Girlfriend)
/*     */     {
/* 594 */       return true;
/*     */     }
/* 596 */     if (par1EntityLiving instanceof Boyfriend)
/*     */     {
/* 598 */       return true;
/*     */     }
/* 600 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 601 */       return true;
/*     */     }
/*     */     
/* 604 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 609 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 610 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D));
/* 611 */     Collections.sort(var5, this.TargetSorter);
/* 612 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 614 */     Entity var3 = null;
/* 615 */     EntityLivingBase var4 = null;
/*     */     
/* 617 */     EntityLivingBase e = func_70638_az();
/* 618 */     if (e != null && e.func_70089_S()) {
/* 619 */       return e;
/*     */     }
/* 621 */     func_70624_b(null);
/*     */ 
/*     */     
/* 624 */     while (var2.hasNext()) {
/*     */       
/* 626 */       var3 = (Entity)var2.next();
/* 627 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 629 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 631 */         return var4;
/*     */       }
/*     */     } 
/* 634 */     return null;
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
/* 645 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 650 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 655 */     List var5 = this.field_70170_p.func_72872_a(Crab.class, this.field_70121_D.func_72314_b(24.0D, 8.0D, 24.0D));
/* 656 */     return var5.size();
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
/* 668 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 670 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 672 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 674 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 675 */           if (bid == Blocks.field_150474_ac) {
/* 676 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 677 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 678 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 679 */             if (s != null && 
/* 680 */               s.equals("Crab")) {
/* 681 */               setCrabScale(0.35F);
/* 682 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 690 */     if (this.field_70163_u < 50.0D) return false;
/*     */     
/* 692 */     if (!this.field_70170_p.func_72935_r()) return false;
/*     */     
/* 694 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID5) {
/* 695 */       if (this.field_70170_p.field_73012_v.nextInt(40) != 1) return false; 
/* 696 */       if (findBuddies() > 3) return false;
/*     */     
/*     */     } 
/* 699 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 705 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Crab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */