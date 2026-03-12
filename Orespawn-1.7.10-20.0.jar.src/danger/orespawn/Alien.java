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
/*     */ import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
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
/*     */ public class Alien
/*     */   extends EntityMob
/*     */ {
/*  57 */   private GenericTargetSorter TargetSorter = null;
/*  58 */   private RenderInfo renderdata = new RenderInfo();
/*  59 */   private int hurt_timer = 0;
/*  60 */   private double moveSpeed = 0.65D;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  64 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Alien_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); if (this.renderdata == null) this.renderdata = new RenderInfo();  this.renderdata.rf1 = 0.0F; this.renderdata.rf2 = 0.0F; this.renderdata.rf3 = 0.0F; this.renderdata.rf4 = 0.0F; this.renderdata.ri1 = 0; this.renderdata.ri2 = 0; this.renderdata.ri3 = 0; this.renderdata.ri4 = 0; } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; } public int mygetMaxHealth() { return OreSpawnMain.Alien_stats.health; } protected void func_70664_aZ() { super.func_70664_aZ(); this.field_70181_x += 0.25D; } public RenderInfo getRenderInfo() { return this.renderdata; } public Alien(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 364 */     this.closest = 99999;
/* 365 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(1.1F, 3.25F); func_70661_as().func_75491_a(true); func_70661_as().func_75498_b(true); this.field_70728_aV = 100; this.field_70174_ab = 30; this.field_70178_ae = false; this.field_70747_aH = 0.6F; this.TargetSorter = new GenericTargetSorter((Entity)this); this.renderdata = new RenderInfo(); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false)); this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   public void setRenderInfo(RenderInfo r) { this.renderdata.rf1 = r.rf1; this.renderdata.rf2 = r.rf2; this.renderdata.rf3 = r.rf3; this.renderdata.rf4 = r.rf4; this.renderdata.ri1 = r.ri1; this.renderdata.ri2 = r.ri2; this.renderdata.ri3 = r.ri3; this.renderdata.ri4 = r.ri4; }
/*     */   public int func_70658_aO() { return OreSpawnMain.Alien_stats.defense; }
/* 368 */   protected boolean func_70650_aV() { return true; } public void func_70636_d() { super.func_70636_d(); if (this.field_70170_p.field_72995_K) { float f = 1.7F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.75F); if (this.field_70170_p.field_73012_v.nextInt(20) == 1) this.field_70170_p.func_72869_a("dripLava", this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + 1.6D, this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70759_as)), 0.0D, 0.0D, 0.0D);  }  } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 373 */     for (i = -dy; i <= dy; i++) {
/* 374 */       for (int j = -dz; j <= dz; j++) {
/* 375 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 376 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 377 */           int d = dx * dx + j * j + i * i;
/* 378 */           if (d < this.closest) {
/* 379 */             this.closest = d;
/* 380 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 381 */             found++;
/*     */           } 
/*     */         } 
/* 384 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 385 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 386 */           int d = dx * dx + j * j + i * i;
/* 387 */           if (d < this.closest) {
/* 388 */             this.closest = d;
/* 389 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 390 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 396 */     for (i = -dx; i <= dx; i++) {
/* 397 */       for (int j = -dz; j <= dz; j++) {
/* 398 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 399 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 400 */           int d = dy * dy + j * j + i * i;
/* 401 */           if (d < this.closest) {
/* 402 */             this.closest = d;
/* 403 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 404 */             found++;
/*     */           } 
/*     */         } 
/* 407 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 408 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 409 */           int d = dy * dy + j * j + i * i;
/* 410 */           if (d < this.closest) {
/* 411 */             this.closest = d;
/* 412 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 413 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 419 */     for (i = -dx; i <= dx; i++) {
/* 420 */       for (int j = -dy; j <= dy; j++) {
/* 421 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 422 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 423 */           int d = dz * dz + j * j + i * i;
/* 424 */           if (d < this.closest) {
/* 425 */             this.closest = d;
/* 426 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 427 */             found++;
/*     */           } 
/*     */         } 
/* 430 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 431 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 432 */           int d = dz * dz + j * j + i * i;
/* 433 */           if (d < this.closest) {
/* 434 */             this.closest = d;
/* 435 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 436 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 442 */     if (found != 0) return true; 
/* 443 */     return false; } public int getAlienHealth() { return (int)func_110143_aJ(); } protected String func_70639_aQ() { if (this.field_70170_p.field_73012_v.nextInt(4) == 0) return "orespawn:alien_living";  return null; } protected String func_70621_aR() { return "orespawn:alien_hurt"; } protected String func_70673_aS() { return "orespawn:alien_death"; } protected float func_70599_aP() { return 1.0F; } protected float func_70647_i() { return 1.0F; } protected Item func_146068_u() { return Items.field_151070_bp; }
/*     */   private void dropItemRand(Item index, int par1) { EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0)); this.field_70170_p.func_72838_d((Entity)var3); }
/*     */   protected void func_70628_a(boolean par1, int par2) { int var5 = 5 + this.field_70170_p.field_73012_v.nextInt(6); int var4; for (var4 = 0; var4 < var5; var4++) dropItemRand(Items.field_151070_bp, 1);  var5 = 5 + this.field_70170_p.field_73012_v.nextInt(6); for (var4 = 0; var4 < var5; var4++) dropItemRand(Items.field_151145_ak, 1);  dropItemRand((Item)Items.field_151148_bJ, 1); dropItemRand(Items.field_151113_aN, 1); dropItemRand(Items.field_151111_aL, 1); }
/*     */   public void initCreature() {}
/*     */   public boolean func_70652_k(Entity par1Entity) { if (super.func_70652_k(par1Entity)) { if (par1Entity != null && par1Entity instanceof EntityLivingBase) { int var2 = 6; if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY) { var2 = 8; if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) { var2 = 10; } else if (this.field_70170_p.field_73013_u == EnumDifficulty.HARD) { var2 = 12; }  }  if (par1Entity instanceof EntityLivingBase && this.field_70170_p.field_73012_v.nextInt(5) == 1) ((EntityLivingBase)par1Entity).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, var2 * 5, 0));  double ks = 1.1D; double inair = 0.1D; float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t); if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D;  par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks); }  return true; }  return false; }
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (par1DamageSource.func_76355_l().equals("cactus")) return false;  if (this.hurt_timer <= 0) ret = super.func_70097_a(par1DamageSource, par2);  Entity e = par1DamageSource.func_76346_g(); if (e != null && e instanceof EntityLiving) { func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D); ret = true; }  return ret; }
/* 449 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 450 */       return;  super.func_70619_bc();
/* 451 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/* 452 */     if (this.field_70170_p.field_73012_v.nextInt(8) == 0) {
/* 453 */       EntityLivingBase e = findSomethingToAttack();
/* 454 */       if (e != null) {
/* 455 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 456 */         if (func_70068_e((Entity)e) < 16.0D) {
/* 457 */           setAttacking(1);
/*     */           
/* 459 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 461 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } 
/* 464 */         func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */       } else {
/*     */         
/* 467 */         setAttacking(0);
/*     */       }
/*     */     
/* 470 */     } else if (this.field_70146_Z.nextInt(30) == 0 && OreSpawnMain.PlayNicely == 0) {
/*     */       
/* 472 */       this.closest = 99999;
/* 473 */       this.tx = this.ty = this.tz = 0;
/*     */       
/* 475 */       for (int i = 2; i < 15 && 
/* 476 */         scan_it((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v, i, i, i) != true; i++) {
/* 477 */         if (i >= 10) i++;
/*     */       
/*     */       } 
/* 480 */       if (this.closest < 99999) {
/* 481 */         func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 482 */         if (this.closest < 27 && 
/* 483 */           this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2);
/*     */       
/*     */       } 
/*     */     } 
/*     */     
/* 488 */     if (this.field_70170_p.field_73012_v.nextInt(40) == 1 && 
/* 489 */       func_110143_aJ() < mygetMaxHealth())
/*     */     {
/* 491 */       func_70691_i(1.0F);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase var4, boolean par2) {
/* 505 */     if (var4 == null)
/*     */     {
/* 507 */       return false;
/*     */     }
/* 509 */     if (var4 == this)
/*     */     {
/* 511 */       return false;
/*     */     }
/* 513 */     if (!var4.func_70089_S())
/*     */     {
/* 515 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 522 */     if (var4 instanceof EntityPlayer) {
/*     */       
/* 524 */       EntityPlayer p = (EntityPlayer)var4;
/* 525 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 526 */         return false;
/*     */       }
/*     */       
/* 529 */       return true;
/*     */     } 
/* 531 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 536 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 537 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 4.0D, 12.0D));
/* 538 */     Collections.sort(var5, this.TargetSorter);
/* 539 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 541 */     Entity var3 = null;
/* 542 */     EntityLivingBase var4 = null;
/*     */     
/* 544 */     EntityLivingBase e = func_70638_az();
/* 545 */     if (e != null && e.func_70089_S()) {
/* 546 */       return e;
/*     */     }
/* 548 */     func_70624_b(null);
/*     */ 
/*     */     
/* 551 */     while (var2.hasNext()) {
/*     */       
/* 553 */       var3 = (Entity)var2.next();
/* 554 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 556 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 558 */         return var4;
/*     */       }
/*     */     } 
/* 561 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 566 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 571 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 582 */     for (k = -3; k < 3; k++) {
/*     */       
/* 584 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 586 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 588 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 589 */           if (bid == Blocks.field_150474_ac) {
/* 590 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 591 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 592 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 593 */             if (s != null && 
/* 594 */               s.equals("Alien")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 601 */     if (!func_70814_o()) return false; 
/* 602 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) return true; 
/* 603 */     if (this.field_70163_u > 50.0D) return false;
/*     */ 
/*     */     
/* 606 */     for (k = -1; k < 2; k++) {
/*     */       
/* 608 */       for (int j = -1; j < 2; j++) {
/*     */         
/* 610 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 612 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 613 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 625 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Alien.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */