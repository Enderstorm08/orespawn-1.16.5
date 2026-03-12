/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.enchantment.Enchantment;
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
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntitySmallFireball;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
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
/*     */ public class WaterDragon
/*     */   extends EntityTameable
/*     */ {
/*  74 */   private GenericTargetSorter TargetSorter = null;
/*  75 */   private RenderInfo renderdata = new RenderInfo();
/*  76 */   private int stream_count = 0;
/*  77 */   private int hurt_timer = 0;
/*  78 */   private float moveSpeed = 0.25F;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  82 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.WaterDragon_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); if (this.renderdata == null) this.renderdata = new RenderInfo();  this.renderdata.rf1 = 0.0F; this.renderdata.rf2 = 0.0F; this.renderdata.rf3 = 0.0F; this.renderdata.rf4 = 0.0F; this.renderdata.ri1 = 0; this.renderdata.ri2 = 0; this.renderdata.ri3 = 0; this.renderdata.ri4 = 0; } public boolean func_70085_c(EntityPlayer par1EntityPlayer) { ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g(); if (var2 != null) if (var2.field_77994_a <= 0) { par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null); var2 = null; }   if (super.func_70085_c(par1EntityPlayer)) return true;  if (var2 != null && var2.func_77973_b() == Items.field_151115_aP && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) { if (!func_70909_n()) { if (!this.field_70170_p.field_72995_K) if (this.field_70146_Z.nextInt(3) == 0) { func_70903_f(true); func_152115_b(par1EntityPlayer.func_110124_au().toString()); func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); func_70691_i(mygetMaxHealth() - func_110143_aJ()); } else { func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }   } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (this.field_70170_p.field_72995_K) { func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); }  if (mygetMaxHealth() > func_110143_aJ()) func_70691_i(mygetMaxHealth() - func_110143_aJ());  }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (!this.field_70170_p.field_72995_K) { func_70903_f(false); func_152115_b(""); func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) { func_94058_c(var2.func_82833_r()); if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) { if (!func_70906_o()) { func_70904_g(true); } else { func_70904_g(false); }  return true; }  return false; } protected boolean func_70692_ba() { if (func_70631_g_()) { func_110163_bv(); return false; }  if (func_104002_bU()) return false;  if (func_70909_n()) return false;  return true; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return OreSpawnMain.WaterDragon_stats.health; } public WaterDragon(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 575 */     this.closest = 99999;
/* 576 */     this.tx = 0; this.ty = 0; this.tz = 0; this.moveSpeed = 0.25F; func_70105_a(1.25F, 1.9F); func_70661_as().func_75491_a(false); this.field_70728_aV = 100; this.field_70174_ab = 3; this.field_70178_ae = true; this.TargetSorter = new GenericTargetSorter((Entity)this); this.renderdata = new RenderInfo(); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.field_151115_aP, false)); this.field_70714_bg.func_75776_a(4, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   public RenderInfo getRenderInfo() { return this.renderdata; }
/*     */   public void setRenderInfo(RenderInfo r) { this.renderdata.rf1 = r.rf1; this.renderdata.rf2 = r.rf2; this.renderdata.rf3 = r.rf3; this.renderdata.rf4 = r.rf4; this.renderdata.ri1 = r.ri1; this.renderdata.ri2 = r.ri2; this.renderdata.ri3 = r.ri3; this.renderdata.ri4 = r.ri4; }
/*     */   public int func_70658_aO() { return OreSpawnMain.WaterDragon_stats.defense; }
/* 580 */   protected boolean func_70650_aV() { return true; } public void func_70636_d() { super.func_70636_d(); if (func_70090_H()) { this.moveSpeed = 0.55F; } else { this.moveSpeed = 0.25F; }  } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 585 */     for (i = -dy; i <= dy; i++) {
/* 586 */       for (int j = -dz; j <= dz; j++) {
/* 587 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 588 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 589 */           int d = dx * dx + j * j + i * i;
/* 590 */           if (d < this.closest) {
/* 591 */             this.closest = d;
/* 592 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 593 */             found++;
/*     */           } 
/*     */         } 
/* 596 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 597 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 598 */           int d = dx * dx + j * j + i * i;
/* 599 */           if (d < this.closest) {
/* 600 */             this.closest = d;
/* 601 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 602 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 608 */     for (i = -dx; i <= dx; i++) {
/* 609 */       for (int j = -dz; j <= dz; j++) {
/* 610 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 611 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 612 */           int d = dy * dy + j * j + i * i;
/* 613 */           if (d < this.closest) {
/* 614 */             this.closest = d;
/* 615 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 616 */             found++;
/*     */           } 
/*     */         } 
/* 619 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 620 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 621 */           int d = dy * dy + j * j + i * i;
/* 622 */           if (d < this.closest) {
/* 623 */             this.closest = d;
/* 624 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 625 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 631 */     for (i = -dx; i <= dx; i++) {
/* 632 */       for (int j = -dy; j <= dy; j++) {
/* 633 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 634 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 635 */           int d = dz * dz + j * j + i * i;
/* 636 */           if (d < this.closest) {
/* 637 */             this.closest = d;
/* 638 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 639 */             found++;
/*     */           } 
/*     */         } 
/* 642 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 643 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 644 */           int d = dz * dz + j * j + i * i;
/* 645 */           if (d < this.closest) {
/* 646 */             this.closest = d;
/* 647 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 648 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 654 */     if (found != 0) return true; 
/* 655 */     return false; } public int getWaterDragonHealth() { return (int)func_110143_aJ(); }
/*     */   public int getAttackStrength(Entity par1Entity) { int var2 = 4; if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY) { var2 = 6; if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) { var2 = 8; } else if (this.field_70170_p.field_73013_u == EnumDifficulty.HARD) { var2 = 10; }  }
/*     */      return var2; }
/*     */   protected String func_70639_aQ() { return null; }
/*     */   protected String func_70621_aR() { return "orespawn:waterdragon_hurt"; }
/*     */   protected String func_70673_aS() { return "orespawn:waterdragon_death"; }
/*     */   protected float func_70599_aP() { return 1.0F; }
/* 662 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 663 */       return;  super.func_70619_bc();
/* 664 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*     */     
/* 666 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(25) == 0 && !func_70906_o()) {
/*     */ 
/*     */       
/* 669 */       this.closest = 99999;
/* 670 */       this.tx = this.ty = this.tz = 0;
/* 671 */       for (int i = 1; i < 12; i++) {
/* 672 */         int j = i;
/* 673 */         if (j > 10) j = 10; 
/* 674 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 675 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 678 */       if (this.closest < 99999) {
/* 679 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       } else {
/* 681 */         if (this.field_70170_p.field_73012_v.nextInt(50) == 1)
/* 682 */           func_70691_i(-1.0F); 
/* 683 */         if (func_110143_aJ() <= 0.0F) {
/* 684 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/* 690 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 0) func_70624_b(null);
/*     */ 
/*     */     
/* 693 */     if (this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 694 */       EntityLivingBase e = findSomethingToAttack();
/* 695 */       if (e != null) {
/* 696 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 697 */         if (func_70068_e((Entity)e) < ((4.0F + e.field_70130_N / 2.0F) * (4.0F + e.field_70130_N / 2.0F))) {
/* 698 */           setAttacking(1);
/*     */           
/* 700 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 702 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 705 */           func_70661_as().func_75497_a((Entity)e, 1.0D);
/* 706 */           watercanon(e);
/*     */         } 
/*     */       } else {
/* 709 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 714 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1 && func_70090_H() && 
/* 715 */       func_110143_aJ() < mygetMaxHealth()) {
/* 716 */       func_85030_a("splash", 1.5F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */       
/* 718 */       func_70691_i(1.0F);
/*     */     }  }
/*     */   protected float func_70647_i() { return 1.0F; }
/*     */   protected Item func_146068_u() { return Items.field_151115_aP; }
/*     */   private ItemStack dropItemRand(Item index, int par1) { EntityItem var3 = null;
/*     */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*     */     if (var3 != null)
/*     */       this.field_70170_p.func_72838_d((Entity)var3); 
/*     */     return is; }
/* 728 */   private void watercanon(EntityLivingBase e) { double yoff = 1.75D;
/* 729 */     double xzoff = 1.5D;
/*     */ 
/*     */     
/* 732 */     if (this.stream_count > 0) {
/* 733 */       setAttacking(2);
/*     */       
/* 735 */       if (this.field_70146_Z.nextInt(15) == 1) {
/* 736 */         EntitySmallFireball entitySmallFireball = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - this.field_70165_t, e.field_70163_u + 0.75D - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 737 */         entitySmallFireball.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70759_as)), this.field_70177_z, this.field_70125_A);
/* 738 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 739 */         this.field_70170_p.func_72838_d((Entity)entitySmallFireball);
/*     */       } 
/*     */       
/* 742 */       WaterBall var2 = new WaterBall(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u + 0.75D - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 743 */       var2.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)), this.field_70759_as, this.field_70125_A);
/* 744 */       double var3 = e.field_70165_t - var2.field_70165_t;
/* 745 */       double var5 = e.field_70163_u + 0.25D - var2.field_70163_u;
/* 746 */       double var7 = e.field_70161_v - var2.field_70161_v;
/* 747 */       float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 748 */       var2.func_70186_c(var3, var5 + var9, var7, 1.4F, 5.0F);
/* 749 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 750 */       this.field_70170_p.func_72838_d((Entity)var2);
/* 751 */       this.stream_count--;
/*     */     } else {
/* 753 */       setAttacking(0);
/*     */     } 
/*     */     
/* 756 */     if (this.stream_count <= 0 && this.field_70146_Z.nextInt(4) == 1) this.stream_count = 8;  } protected void func_70628_a(boolean par1, int par2) { ItemStack is = null; dropItemRand(OreSpawnMain.MyWaterDragonScale, 1); dropItemRand(Items.field_151160_bD, 1); int var5 = 9 + this.field_70170_p.field_73012_v.nextInt(6); int var4; for (var4 = 0; var4 < var5; var4++) dropItemRand(Items.field_151115_aP, 1);  var4 = this.field_70170_p.field_73012_v.nextInt(20); switch (var4) { case 0: is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1); break;case 1: is = dropItemRand(Items.field_151042_j, 1); break;case 2: is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1); break;case 3: is = dropItemRand(Items.field_151040_l, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 4: is = dropItemRand(Items.field_151037_a, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 5: is = dropItemRand(Items.field_151035_b, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 6: is = dropItemRand(Items.field_151036_c, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 7: is = dropItemRand(Items.field_151019_K, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 8: is = dropItemRand((Item)Items.field_151028_Y, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 9: is = dropItemRand((Item)Items.field_151030_Z, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 10: is = dropItemRand((Item)Items.field_151165_aa, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1)
/*     */           is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 11: is = dropItemRand((Item)Items.field_151167_ab, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1)
/*     */           is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1)
/*     */           is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 12: is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1); break;case 13: dropItemRand(Item.func_150898_a(Blocks.field_150339_S), 1); break; }  }
/*     */   public boolean func_70652_k(Entity par1Entity) { boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), OreSpawnMain.WaterDragon_stats.attack); if (var4) { if (par1Entity != null && par1Entity instanceof EntityLivingBase) { double ks = 1.1D; double inair = 0.14D; float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t); if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer)
/*     */           inair *= 2.0D;  par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks); }  return true; }  return false; }
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (par1DamageSource.func_76355_l().equals("cactus"))
/*     */       return false;  Entity e = par1DamageSource.func_76346_g(); if (e != null && e instanceof WaterDragon)
/*     */       return false;  if (e != null && e instanceof AttackSquid)
/*     */       return false;  if (e != null && e instanceof WaterBall)
/*     */       return false;  if (this.hurt_timer <= 0) { ret = super.func_70097_a(par1DamageSource, par2); this.hurt_timer = 10; }  if (e != null && e instanceof EntityLiving) { if (e instanceof AttackSquid)
/*     */         return false;  if (e instanceof WaterDragon)
/*     */         return false;  func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D); }  return ret; }
/* 769 */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) { if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 771 */     if (par1EntityLiving == null)
/*     */     {
/* 773 */       return false;
/*     */     }
/* 775 */     if (par1EntityLiving == this)
/*     */     {
/* 777 */       return false;
/*     */     }
/* 779 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 781 */       return false;
/*     */     }
/* 783 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 786 */       return false;
/*     */     }
/* 788 */     if (par1EntityLiving instanceof WaterDragon)
/*     */     {
/* 790 */       return false;
/*     */     }
/* 792 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*     */     {
/* 794 */       return true;
/*     */     }
/*     */     
/* 797 */     if (func_70909_n()) return false;
/*     */     
/* 799 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 801 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 802 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 803 */         return false;
/*     */       }
/* 805 */       return true;
/*     */     } 
/*     */     
/* 808 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 809 */       return true;
/*     */     }
/*     */     
/* 812 */     return false; }
/*     */ 
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 817 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 818 */     if (func_70631_g_()) return null; 
/* 819 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(14.0D, 4.0D, 14.0D));
/* 820 */     Collections.sort(var5, this.TargetSorter);
/* 821 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 823 */     Entity var3 = null;
/* 824 */     EntityLivingBase var4 = null;
/*     */     
/* 826 */     EntityLivingBase e = func_70638_az();
/* 827 */     if (e != null && e.func_70089_S()) {
/* 828 */       return e;
/*     */     }
/* 830 */     func_70624_b(null);
/*     */ 
/*     */     
/* 833 */     while (var2.hasNext()) {
/*     */       
/* 835 */       var3 = (Entity)var2.next();
/* 836 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 838 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 840 */         return var4;
/*     */       }
/*     */     } 
/* 843 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAttacking() {
/* 854 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttacking(int par1) {
/* 859 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/*     */   public boolean func_70601_bi() {
/* 872 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 874 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 876 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 878 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 879 */           if (bid == Blocks.field_150474_ac) {
/* 880 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 881 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 882 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 883 */             if (s != null && 
/* 884 */               s.equals("Water Dragon")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 891 */     WaterDragon target = null;
/* 892 */     if (this.field_70163_u < 50.0D) return false;
/*     */     
/* 894 */     if (!this.field_70170_p.func_72935_r()) return false;
/*     */     
/* 896 */     target = (WaterDragon)this.field_70170_p.func_72857_a(WaterDragon.class, this.field_70121_D.func_72314_b(16.0D, 5.0D, 16.0D), (Entity)this);
/* 897 */     if (target != null)
/*     */     {
/* 899 */       return false;
/*     */     }
/* 901 */     return true;
/*     */   }
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 905 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public WaterDragon spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 911 */     WaterDragon w = new WaterDragon(this.field_70170_p);
/* 912 */     if (func_70909_n()) {
/* 913 */       func_152115_b(func_152113_b());
/* 914 */       w.func_70903_f(true);
/*     */     } 
/* 916 */     return w;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 924 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151115_aP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 933 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 939 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WaterDragon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */