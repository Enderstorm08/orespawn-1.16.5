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
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.EnumDifficulty;
/*     */ import net.minecraft.world.EnumSkyBlock;
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
/*     */ public class GammaMetroid
/*     */   extends EntityTameable
/*     */ {
/*  57 */   private GenericTargetSorter TargetSorter = null;
/*  58 */   private float moveSpeed = 0.15F;
/*     */   private int closest;
/*     */   private int tx;
/*  61 */   private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.GammaMetroid_stats.attack); } protected boolean func_70692_ba() { if (func_70631_g_()) { func_110163_bv(); return false; }  if (func_70909_n()) return false;  if (func_104002_bU()) return false;  return true; } public boolean func_70652_k(Entity par1Entity) { boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), OreSpawnMain.GammaMetroid_stats.attack); return var4; } public boolean func_70085_c(EntityPlayer par1EntityPlayer) { ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g(); if (var2 != null) if (var2.field_77994_a <= 0) { par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null); var2 = null; }   if (super.func_70085_c(par1EntityPlayer)) return true;  if (var2 != null && var2.func_77973_b() == Items.field_151042_j && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) { if (!func_70909_n()) { if (!this.field_70170_p.field_72995_K) if (this.field_70146_Z.nextInt(3) == 0) { func_70903_f(true); func_152115_b(par1EntityPlayer.func_110124_au().toString()); func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); func_70691_i(mygetMaxHealth() - func_110143_aJ()); } else { func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }   } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (this.field_70170_p.field_72995_K) { func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); }  if (mygetMaxHealth() > func_110143_aJ()) func_70691_i(mygetMaxHealth() - func_110143_aJ());  }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (!this.field_70170_p.field_72995_K) { func_70903_f(false); func_152115_b(""); func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) { func_94058_c(var2.func_82833_r()); if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) { if (!func_70906_o()) { func_70904_g(true); } else { func_70904_g(false); }  return true; }  return false; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return OreSpawnMain.GammaMetroid_stats.health; } public GammaMetroid(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 496 */     this.closest = 99999;
/* 497 */     this.tx = 0; this.ty = 0; this.tz = 0; this.moveSpeed = 0.15F; func_70105_a(1.5F, 1.5F); func_70661_as().func_75491_a(true); this.field_70728_aV = 20; this.field_70174_ab = 1000; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.field_151042_j, false)); this.field_70714_bg.func_75776_a(4, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); }
/*     */   public int func_70658_aO() { return OreSpawnMain.GammaMetroid_stats.defense; }
/*     */   protected boolean func_70650_aV() { return true; }
/* 500 */   public void func_70636_d() { super.func_70636_d(); } protected String func_70639_aQ() { if (this.field_70170_p.field_73012_v.nextInt(5) == 1) return "orespawn:wtf_living";  return null; } protected String func_70621_aR() { return "orespawn:duck_hurt"; } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 505 */     for (i = -dy; i <= dy; i++) {
/* 506 */       for (int j = -dz; j <= dz; j++) {
/* 507 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 508 */         if (bid == Blocks.field_150348_b) {
/* 509 */           int d = dx * dx + j * j + i * i;
/* 510 */           if (d < this.closest) {
/* 511 */             this.closest = d;
/* 512 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 513 */             found++;
/*     */           } 
/*     */         } 
/* 516 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 517 */         if (bid == Blocks.field_150348_b) {
/* 518 */           int d = dx * dx + j * j + i * i;
/* 519 */           if (d < this.closest) {
/* 520 */             this.closest = d;
/* 521 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 522 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 528 */     for (i = -dx; i <= dx; i++) {
/* 529 */       for (int j = -dz; j <= dz; j++) {
/* 530 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 531 */         if (bid == Blocks.field_150348_b) {
/* 532 */           int d = dy * dy + j * j + i * i;
/* 533 */           if (d < this.closest) {
/* 534 */             this.closest = d;
/* 535 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 536 */             found++;
/*     */           } 
/*     */         } 
/* 539 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 540 */         if (bid == Blocks.field_150348_b) {
/* 541 */           int d = dy * dy + j * j + i * i;
/* 542 */           if (d < this.closest) {
/* 543 */             this.closest = d;
/* 544 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 545 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 551 */     for (i = -dx; i <= dx; i++) {
/* 552 */       for (int j = -dy; j <= dy; j++) {
/* 553 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 554 */         if (bid == Blocks.field_150348_b) {
/* 555 */           int d = dz * dz + j * j + i * i;
/* 556 */           if (d < this.closest) {
/* 557 */             this.closest = d;
/* 558 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 559 */             found++;
/*     */           } 
/*     */         } 
/* 562 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 563 */         if (bid == Blocks.field_150348_b) {
/* 564 */           int d = dz * dz + j * j + i * i;
/* 565 */           if (d < this.closest) {
/* 566 */             this.closest = d;
/* 567 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 568 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 574 */     if (found != 0) return true; 
/* 575 */     return false; } protected String func_70673_aS() { return "orespawn:alo_death"; } protected float func_70599_aP() { return 1.5F; }
/*     */   protected float func_70647_i() { return 1.0F; }
/*     */   protected Item func_146068_u() { return Items.field_151042_j; }
/*     */   private void dropItemRand(Item index, int par1) { EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0)); this.field_70170_p.func_72838_d((Entity)var3); }
/*     */   protected void func_70628_a(boolean par1, int par2) { int i = 5 + OreSpawnMain.OreSpawnRand.nextInt(10); int var4; for (var4 = 0; var4 < i; var4++) dropItemRand(Items.field_151074_bl, 1);  i = 6 + OreSpawnMain.OreSpawnRand.nextInt(10); for (var4 = 0; var4 < i; var4++) dropItemRand(Items.field_151042_j, 1);  }
/*     */   protected void func_70619_bc() { if (this.field_70128_L) return;  super.func_70619_bc(); if (this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(5) == 0) { EntityLivingBase e = findSomethingToAttack(); if (e != null) { func_70625_a((Entity)e, 10.0F, 10.0F); if (func_70068_e((Entity)e) <= 9.0D) { if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1) func_70652_k((Entity)e);  } else { func_70661_as().func_75497_a((Entity)e, 1.25D); }  }  }  }
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) { if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;  if (par1EntityLiving == null) return false;  if (par1EntityLiving == this) return false;  if (!par1EntityLiving.func_70089_S()) return false;  if (MyUtils.isIgnoreable(par1EntityLiving)) return false;  if (!func_70635_at().func_75522_a((Entity)par1EntityLiving)) return false;  if (par1EntityLiving instanceof GammaMetroid) return false;  if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob) return false;  if (func_70909_n()) return false;  if (par1EntityLiving instanceof EntityPlayer) { EntityPlayer p = (EntityPlayer)par1EntityLiving; if (p.field_71075_bZ.field_75098_d == true) return false;  }  return true; }
/*     */   private EntityLivingBase findSomethingToAttack() { if (OreSpawnMain.PlayNicely != 0) return null;  if (func_70631_g_()) return null;  List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 3.0D, 10.0D)); Collections.sort(var5, this.TargetSorter); Iterator<?> var2 = var5.iterator(); Entity var3 = null; EntityLivingBase var4 = null; while (var2.hasNext()) { var3 = (Entity)var2.next(); var4 = (EntityLivingBase)var3; if (isSuitableTarget(var4, false)) return var4;  }  return null; }
/*     */   protected boolean isValidLightLevel() { int i = MathHelper.func_76128_c(this.field_70165_t); int j = MathHelper.func_76128_c(this.field_70121_D.field_72338_b); int k = MathHelper.func_76128_c(this.field_70161_v); if (this.field_70170_p.func_72972_b(EnumSkyBlock.Sky, i, j, k) > this.field_70146_Z.nextInt(32)) return false;  int l = this.field_70170_p.func_72957_l(i, j, k); if (this.field_70170_p.func_72911_I()) { int i1 = this.field_70170_p.field_73008_k; this.field_70170_p.field_73008_k = 10; l = this.field_70170_p.func_72957_l(i, j, k); this.field_70170_p.field_73008_k = i1; }  return (l <= this.field_70146_Z.nextInt(8)); }
/*     */   public boolean func_70601_bi() { int k; for (k = -3; k < 3; k++) { for (int j = -3; j < 3; j++) { for (int i = 0; i < 5; i++) { Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k); if (bid == Blocks.field_150474_ac) { TileEntityMobSpawner tileentitymobspawner = null; tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k); String s = tileentitymobspawner.func_145881_a().func_98276_e(); if (s != null && s.equals("WTF?")) return true;  }  }  }  }  if (!isValidLightLevel()) return false;  if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) return true;  if (this.field_70163_u > 50.0D) return false;  for (k = -1; k < 1; k++) { for (int j = -1; j < 1; j++) { for (int i = 1; i < 4; i++) { Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k); if (bid != Blocks.field_150350_a) return false;  }  }  }  return true; }
/* 585 */   protected void func_70629_bd() { if (this.field_70128_L)
/* 586 */       return;  super.func_70629_bd();
/*     */     
/* 588 */     if ((this.field_70170_p.field_73012_v.nextInt(20) == 0 && func_110143_aJ() < mygetMaxHealth()) || this.field_70170_p.field_73012_v.nextInt(100) == 0)
/*     */     {
/*     */ 
/*     */       
/* 592 */       if (OreSpawnMain.PlayNicely == 0 && !func_70906_o()) {
/* 593 */         this.closest = 99999;
/* 594 */         this.tx = this.ty = this.tz = 0;
/* 595 */         for (int i = 1; i < 6; i++) {
/* 596 */           int j = i;
/* 597 */           if (j > 2) j = 2; 
/* 598 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 599 */             break;  if (i >= 4) i++;
/*     */         
/*     */         } 
/* 602 */         if (this.closest < 99999) {
/*     */           
/* 604 */           func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 605 */           if (this.closest < 12) {
/*     */             
/* 607 */             if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2); 
/* 608 */             func_70691_i(1.0F);
/* 609 */             func_85030_a("random.burp", 0.5F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 1.5F);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 617 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public GammaMetroid spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 623 */     GammaMetroid w = new GammaMetroid(this.field_70170_p);
/* 624 */     if (func_70909_n()) {
/*     */       
/* 626 */       func_152115_b(func_152113_b());
/* 627 */       w.func_70903_f(true);
/*     */     } 
/* 629 */     return w;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 637 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151042_j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 646 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\GammaMetroid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */