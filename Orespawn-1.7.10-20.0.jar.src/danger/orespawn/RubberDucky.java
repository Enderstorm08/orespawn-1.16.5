/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityList;
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
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RubberDucky
/*     */   extends EntityTameable
/*     */ {
/*  73 */   private GenericTargetSorter TargetSorter = null;
/*     */   public boolean should_despawn = true;
/*  75 */   private EntityLivingBase buddy = null;
/*  76 */   private float moveSpeed = 0.22F;
/*  77 */   private int killcount = 0;
/*  78 */   private int died = 0;
/*  79 */   private RenderInfo renderdata = new RenderInfo();
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  83 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(6.0D); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(23, Byte.valueOf((byte)0)); this.field_70180_af.func_75682_a(22, Byte.valueOf((byte)0)); func_70904_g(false); if (func_70874_b() < 0) func_70873_a(-func_70874_b());  if (this.renderdata == null) this.renderdata = new RenderInfo();  this.renderdata.rf1 = 0.0F; this.renderdata.rf2 = 0.0F; this.renderdata.rf3 = 0.0F; this.renderdata.rf4 = 0.0F; this.renderdata.ri1 = 0; this.renderdata.ri2 = 0; this.renderdata.ri3 = 0; this.renderdata.ri4 = 0; } public RenderInfo getRenderInfo() { return this.renderdata; } public void setRenderInfo(RenderInfo r) { this.renderdata.rf1 = r.rf1; this.renderdata.rf2 = r.rf2; this.renderdata.rf3 = r.rf3; this.renderdata.rf4 = r.rf4; this.renderdata.ri1 = r.ri1; this.renderdata.ri2 = r.ri2; this.renderdata.ri3 = r.ri3; this.renderdata.ri4 = r.ri4; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); if (func_70090_H()) { this.field_70181_x += 0.10000000149011612D; if (this.field_70181_x < -0.05000000074505806D) this.field_70181_x = -0.05000000074505806D;  }  } public RubberDucky(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 413 */     this.closest = 99999;
/* 414 */     this.tx = 0; this.ty = 0; this.tz = 0; this.moveSpeed = 0.22F; func_70105_a(0.33F, 0.5F); func_70661_as().func_75491_a(false); this.field_70728_aV = 15; this.field_70174_ab = 3; this.field_70178_ae = false; this.renderdata = new RenderInfo(); this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151115_aP, false)); this.field_70714_bg.func_75776_a(4, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 6.0F)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; Entity w = null; w = par1DamageSource.func_76346_g(); ret = super.func_70097_a(par1DamageSource, par2); func_70904_g(false); if (!this.field_70170_p.field_72995_K && w != null && w instanceof EntityPlayer && (this.field_70128_L || func_110143_aJ() <= 0.0F) && this.died == 0) { this.died = 1; this.killcount++; setKillCount(this.killcount); if (this.killcount < 10) for (int m = 0; m < 20; m++) { int i = this.field_70170_p.field_73012_v.nextInt(3); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) i = -i;  int k = this.field_70170_p.field_73012_v.nextInt(3); if (this.field_70170_p.field_73012_v.nextInt(2) == 1)
/*     */             k = -k;  for (int j = 3; j > -3; j--) { if (this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a && this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + j, (int)this.field_70161_v + k) != Blocks.field_150350_a) { Entity e = spawnCreature(this.field_70170_p, "Rubber Ducky", ((int)this.field_70165_t + i + 1), ((int)this.field_70163_u + j + 1), ((int)this.field_70161_v + k)); if (e != null) { RubberDucky d = (RubberDucky)e; d.setKillCount(this.killcount); }  return ret; }  }  }   }  return ret; }
/*     */   public int mygetMaxHealth() { return 5; }
/* 418 */   public int func_70658_aO() { return 1; } protected void func_70069_a(float par1) {} private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 423 */     for (i = -dy; i <= dy; i++) {
/* 424 */       for (int j = -dz; j <= dz; j++) {
/* 425 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 426 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 427 */           int d = dx * dx + j * j + i * i;
/* 428 */           if (d < this.closest) {
/* 429 */             this.closest = d;
/* 430 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 431 */             found++;
/*     */           } 
/*     */         } 
/* 434 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 435 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 436 */           int d = dx * dx + j * j + i * i;
/* 437 */           if (d < this.closest) {
/* 438 */             this.closest = d;
/* 439 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 440 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 446 */     for (i = -dx; i <= dx; i++) {
/* 447 */       for (int j = -dz; j <= dz; j++) {
/* 448 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 449 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 450 */           int d = dy * dy + j * j + i * i;
/* 451 */           if (d < this.closest) {
/* 452 */             this.closest = d;
/* 453 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 454 */             found++;
/*     */           } 
/*     */         } 
/* 457 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 458 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 459 */           int d = dy * dy + j * j + i * i;
/* 460 */           if (d < this.closest) {
/* 461 */             this.closest = d;
/* 462 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 463 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 469 */     for (i = -dx; i <= dx; i++) {
/* 470 */       for (int j = -dy; j <= dy; j++) {
/* 471 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 472 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 473 */           int d = dz * dz + j * j + i * i;
/* 474 */           if (d < this.closest) {
/* 475 */             this.closest = d;
/* 476 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 477 */             found++;
/*     */           } 
/*     */         } 
/* 480 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 481 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 482 */           int d = dz * dz + j * j + i * i;
/* 483 */           if (d < this.closest) {
/* 484 */             this.closest = d;
/* 485 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 486 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 492 */     if (found != 0) return true; 
/* 493 */     return false; } protected void func_70064_a(double par1, boolean par3) {} protected boolean func_70650_aV() { return true; } public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) { Entity var8 = null; var8 = EntityList.func_75620_a(par1, par0World); if (var8 != null) { var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F); par0World.func_72838_d(var8); ((EntityLiving)var8).func_70642_aH(); }  return var8; } protected String func_70639_aQ() { if (this.field_70170_p.field_73012_v.nextInt(10) == 1) return "orespawn:duck_hurt";  return null; }
/*     */   protected String func_70621_aR() { return "orespawn:duck_hurt"; }
/*     */   protected String func_70673_aS() { return "orespawn:duck_hurt"; }
/*     */   protected float func_70599_aP() { return 0.8F; }
/*     */   protected float func_70647_i() { return 1.2F; }
/*     */   protected Item func_146068_u() { if (this.field_70170_p.field_73012_v.nextInt(2) == 1) return Items.field_151008_G;  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) return OreSpawnMain.RubberDuckyEgg;  return null; }
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) { ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g(); if (var2 != null) if (var2.field_77994_a <= 0) { par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null); var2 = null; }   if (super.func_70085_c(par1EntityPlayer)) return true;  if (var2 != null && var2.func_77973_b() == Items.field_151115_aP && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) { if (!func_70909_n()) { if (!this.field_70170_p.field_72995_K) if (this.field_70146_Z.nextInt(2) == 0) { func_70903_f(true); func_152115_b(par1EntityPlayer.func_110124_au().toString()); func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); func_70691_i(mygetMaxHealth() - func_110143_aJ()); } else { func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }   } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (this.field_70170_p.field_72995_K) { func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); }  if (mygetMaxHealth() > func_110143_aJ()) func_70691_i(mygetMaxHealth() - func_110143_aJ());  }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (!this.field_70170_p.field_72995_K) { func_70903_f(false); func_152115_b(""); func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) { if (!func_70906_o() && getKillCount() < 5) { func_70904_g(true); } else { func_70904_g(false); }  return true; }  return true; }
/* 500 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 501 */       return;  super.func_70619_bc();
/*     */ 
/*     */ 
/*     */     
/* 505 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(50) == 0) {
/*     */ 
/*     */       
/* 508 */       this.closest = 99999;
/* 509 */       this.tx = this.ty = this.tz = 0;
/* 510 */       for (int i = 1; i < 14; i++) {
/* 511 */         int j = i;
/* 512 */         if (j > 5) j = 5; 
/* 513 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 514 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 517 */       if (this.closest < 99999) {
/* 518 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 523 */     if (this.killcount > 0 && 
/* 524 */       this.field_70170_p.field_73012_v.nextInt(200) == 1) {
/* 525 */       this.killcount--;
/* 526 */       setKillCount(this.killcount);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 531 */     if (func_110143_aJ() < mygetMaxHealth() && this.field_70170_p.field_73012_v.nextInt(300) == 1) {
/* 532 */       func_70691_i(1.0F);
/*     */     }
/*     */ 
/*     */     
/* 536 */     if (this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 537 */       EntityLivingBase e = findSomethingToAttack();
/* 538 */       if (e != null) {
/*     */         
/* 540 */         if (func_70068_e((Entity)e) < 12.0D) {
/* 541 */           setAttacking(1);
/*     */           
/* 543 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 545 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 548 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/*     */         
/* 552 */         if (this.buddy != null && !this.buddy.field_70128_L && this.field_70170_p.field_73012_v.nextInt(15) == 1) {
/* 553 */           func_70661_as().func_75497_a((Entity)this.buddy, 1.0D);
/*     */         }
/* 555 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 560 */     if (this.buddy != null && !this.buddy.field_70128_L && this.field_70170_p.field_73012_v.nextInt(20) == 1) {
/* 561 */       func_70661_as().func_75497_a((Entity)this.buddy, 1.0D);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 567 */     float i = 1.0F;
/*     */     
/* 569 */     if (getKillCount() >= 5) i = 2.0F; 
/* 570 */     boolean flag = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), i);
/*     */     
/* 572 */     return flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 582 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 584 */     if (par1EntityLiving == null)
/*     */     {
/* 586 */       return false;
/*     */     }
/* 588 */     if (par1EntityLiving == this)
/*     */     {
/* 590 */       return false;
/*     */     }
/* 592 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 594 */       return false;
/*     */     }
/* 596 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 599 */       return false;
/*     */     }
/* 601 */     if (par1EntityLiving instanceof AttackSquid)
/*     */     {
/* 603 */       return true;
/*     */     }
/* 605 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntitySquid)
/*     */     {
/* 607 */       return true;
/*     */     }
/*     */     
/* 610 */     if (par1EntityLiving instanceof RubberDucky)
/*     */     {
/*     */       
/* 613 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) this.buddy = par1EntityLiving;
/*     */     
/*     */     }
/* 616 */     if (getKillCount() >= 5 && 
/* 617 */       par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 619 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 620 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 621 */         return false;
/*     */       }
/* 623 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 627 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 632 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 633 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(8.0D, 4.0D, 8.0D));
/* 634 */     Collections.sort(var5, this.TargetSorter);
/* 635 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 637 */     Entity var3 = null;
/* 638 */     EntityLivingBase var4 = null;
/*     */     
/* 640 */     EntityLivingBase e = func_70638_az();
/* 641 */     if (e != null && e.func_70089_S()) {
/* 642 */       return e;
/*     */     }
/* 644 */     func_70624_b(null);
/*     */ 
/*     */     
/* 647 */     this.buddy = null;
/* 648 */     while (var2.hasNext()) {
/*     */       
/* 650 */       var3 = (Entity)var2.next();
/* 651 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 653 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 655 */         return var4;
/*     */       }
/*     */     } 
/* 658 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 666 */     super.func_70014_b(par1NBTTagCompound);
/* 667 */     par1NBTTagCompound.func_74768_a("Killcount", this.killcount);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 675 */     super.func_70037_a(par1NBTTagCompound);
/* 676 */     this.killcount = par1NBTTagCompound.func_74762_e("Killcount");
/* 677 */     setKillCount(this.killcount);
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
/* 688 */     return this.field_70180_af.func_75683_a(23);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 693 */     this.field_70180_af.func_75692_b(23, Byte.valueOf((byte)par1));
/*     */   }
/*     */   
/*     */   public final int getKillCount() {
/* 697 */     return this.field_70180_af.func_75683_a(22);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setKillCount(int par1) {
/* 702 */     this.field_70180_af.func_75692_b(22, Byte.valueOf((byte)par1));
/* 703 */     this.killcount = par1;
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
/* 715 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 717 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 719 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 721 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 722 */           if (bid == Blocks.field_150474_ac) {
/* 723 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 724 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 725 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 726 */             if (s != null && 
/* 727 */               s.equals("Rubber Ducky")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 733 */     if (this.field_70163_u < 50.0D) return false; 
/* 734 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 735 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 744 */     if (func_70631_g_()) {
/* 745 */       func_110163_bv();
/* 746 */       return false;
/*     */     } 
/* 748 */     if (func_104002_bU()) return false; 
/* 749 */     if (func_70909_n()) return false; 
/* 750 */     return this.should_despawn;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 755 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public RubberDucky spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 761 */     return new RubberDucky(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 769 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151115_aP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 778 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RubberDucky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */