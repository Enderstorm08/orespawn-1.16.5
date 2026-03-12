/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityList;
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
/*     */ public class CaterKiller
/*     */   extends EntityMob
/*     */ {
/*  53 */   private GenericTargetSorter TargetSorter = null;
/*  54 */   private float moveSpeed = 0.35F;
/*  55 */   int foundmob = 0;
/*  56 */   int ticker = 0; private int closest; private int tx;
/*     */   private int ty;
/*     */   private int tz;
/*     */   
/*  60 */   public CaterKiller(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 387 */     this.closest = 99999;
/* 388 */     this.tx = 0; this.ty = 0; this.tz = 0; if (OreSpawnMain.PlayNicely == 0) { func_70105_a(2.9F, 4.6F); } else { func_70105_a(1.45F, 2.3F); }  func_70661_as().func_75491_a(true); this.field_70728_aV = 200; this.field_70174_ab = 100; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false)); this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); } protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.CaterKiller_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); this.field_70180_af.func_75682_a(21, Integer.valueOf(OreSpawnMain.PlayNicely)); } public int getPlayNicely() { return this.field_70180_af.func_75679_c(21); } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; } public boolean func_70097_a(DamageSource par1DamageSource, float par2) { Entity e = null; Boolean ret = Boolean.valueOf(super.func_70097_a(par1DamageSource, par2)); e = par1DamageSource.func_76346_g(); if (e != null && e instanceof EntityLiving) func_70624_b((EntityLivingBase)e);  return ret.booleanValue(); } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return OreSpawnMain.CaterKiller_stats.health; } public int func_70658_aO() { return OreSpawnMain.CaterKiller_stats.defense; } protected boolean func_70650_aV() { return true; }
/*     */   public void func_70636_d() { super.func_70636_d(); }
/*     */   protected String func_70639_aQ() { if (this.field_70146_Z.nextInt(3) == 0) return "orespawn:caterkiller_living";  return null; }
/* 391 */   private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 396 */     for (i = -dy; i <= dy; i++) {
/* 397 */       for (int j = -dz; j <= dz; j++) {
/* 398 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 399 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150364_r || bid == OreSpawnMain.MyDT || bid == Blocks.field_150363_s || bid == Blocks.field_150361_u || bid == OreSpawnMain.MyAppleLeaves || bid == OreSpawnMain.MyExperienceLeaves || bid == OreSpawnMain.MyScaryLeaves || bid == OreSpawnMain.MyPeachLeaves || bid == OreSpawnMain.MyCherryLeaves) {
/*     */ 
/*     */           
/* 402 */           int d = dx * dx + j * j + i * i;
/* 403 */           if (d < this.closest) {
/* 404 */             this.closest = d;
/* 405 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 406 */             found++;
/*     */           } 
/*     */         } 
/* 409 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 410 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150364_r || bid == OreSpawnMain.MyDT || bid == Blocks.field_150363_s || bid == Blocks.field_150361_u || bid == OreSpawnMain.MyAppleLeaves || bid == OreSpawnMain.MyExperienceLeaves || bid == OreSpawnMain.MyScaryLeaves || bid == OreSpawnMain.MyPeachLeaves || bid == OreSpawnMain.MyCherryLeaves) {
/*     */ 
/*     */           
/* 413 */           int d = dx * dx + j * j + i * i;
/* 414 */           if (d < this.closest) {
/* 415 */             this.closest = d;
/* 416 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 417 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 423 */     for (i = -dx; i <= dx; i++) {
/* 424 */       for (int j = -dz; j <= dz; j++) {
/* 425 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 426 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150364_r || bid == OreSpawnMain.MyDT || bid == Blocks.field_150363_s || bid == Blocks.field_150361_u || bid == OreSpawnMain.MyAppleLeaves || bid == OreSpawnMain.MyExperienceLeaves || bid == OreSpawnMain.MyScaryLeaves || bid == OreSpawnMain.MyPeachLeaves || bid == OreSpawnMain.MyCherryLeaves) {
/*     */ 
/*     */           
/* 429 */           int d = dy * dy + j * j + i * i;
/* 430 */           if (d < this.closest) {
/* 431 */             this.closest = d;
/* 432 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 433 */             found++;
/*     */           } 
/*     */         } 
/* 436 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 437 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150364_r || bid == OreSpawnMain.MyDT || bid == Blocks.field_150363_s || bid == Blocks.field_150361_u || bid == OreSpawnMain.MyAppleLeaves || bid == OreSpawnMain.MyExperienceLeaves || bid == OreSpawnMain.MyScaryLeaves || bid == OreSpawnMain.MyPeachLeaves || bid == OreSpawnMain.MyCherryLeaves) {
/*     */ 
/*     */           
/* 440 */           int d = dy * dy + j * j + i * i;
/* 441 */           if (d < this.closest) {
/* 442 */             this.closest = d;
/* 443 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 444 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 450 */     for (i = -dx; i <= dx; i++) {
/* 451 */       for (int j = -dy; j <= dy; j++) {
/* 452 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 453 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150364_r || bid == OreSpawnMain.MyDT || bid == Blocks.field_150363_s || bid == Blocks.field_150361_u || bid == OreSpawnMain.MyAppleLeaves || bid == OreSpawnMain.MyExperienceLeaves || bid == OreSpawnMain.MyScaryLeaves || bid == OreSpawnMain.MyPeachLeaves || bid == OreSpawnMain.MyCherryLeaves) {
/*     */ 
/*     */           
/* 456 */           int d = dz * dz + j * j + i * i;
/* 457 */           if (d < this.closest) {
/* 458 */             this.closest = d;
/* 459 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 460 */             found++;
/*     */           } 
/*     */         } 
/* 463 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 464 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150364_r || bid == OreSpawnMain.MyDT || bid == Blocks.field_150363_s || bid == Blocks.field_150361_u || bid == OreSpawnMain.MyAppleLeaves || bid == OreSpawnMain.MyExperienceLeaves || bid == OreSpawnMain.MyScaryLeaves || bid == OreSpawnMain.MyPeachLeaves || bid == OreSpawnMain.MyCherryLeaves) {
/*     */ 
/*     */           
/* 467 */           int d = dz * dz + j * j + i * i;
/* 468 */           if (d < this.closest) {
/* 469 */             this.closest = d;
/* 470 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 471 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 477 */     if (found != 0) return true; 
/* 478 */     return false; }
/*     */   protected String func_70621_aR() { return "orespawn:caterkiller_hit"; }
/*     */   protected String func_70673_aS() { return "orespawn:caterkiller_death"; }
/*     */   protected float func_70599_aP() { return 1.5F; }
/*     */   protected float func_70647_i() { return 1.0F; }
/*     */   protected Item func_146068_u() { return Items.field_151082_bd; }
/*     */   private ItemStack dropItemRand(Item index, int par1) { EntityItem var3 = null; ItemStack is = new ItemStack(index, par1, 0); var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is); if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3);  return is; }
/*     */   protected void func_70628_a(boolean par1, int par2) { ItemStack is = null; dropItemRand(OreSpawnMain.CaterKillerJaw, 1); dropItemRand(Items.field_151160_bD, 1); int var4; for (var4 = 0; var4 < 10; var4++) dropItemRand(Items.field_151116_aA, 1);  for (var4 = 0; var4 < 6; var4++) dropItemRand(Items.field_151082_bd, 1);  int i = 1 + this.field_70170_p.field_73012_v.nextInt(5); for (var4 = 0; var4 < i; var4++) { int var3 = this.field_70170_p.field_73012_v.nextInt(20); switch (var3) { case 0: is = dropItemRand(OreSpawnMain.MyUltimateSword, 1); break;case 1: is = dropItemRand(OreSpawnMain.MyRuby, 1); break;case 2: is = dropItemRand(Item.func_150898_a(Blocks.field_150484_ah), 1); break;case 3: is = dropItemRand(OreSpawnMain.MyRubySword, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 4: is = dropItemRand(OreSpawnMain.MyRubyShovel, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 5: is = dropItemRand(OreSpawnMain.MyRubyPickaxe, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 6: is = dropItemRand(OreSpawnMain.MyRubyAxe, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 7: is = dropItemRand(OreSpawnMain.MyRubyHoe, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 8: is = dropItemRand((Item)OreSpawnMain.RubyHelmet, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 9: is = dropItemRand((Item)OreSpawnMain.RubyBody, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 10: is = dropItemRand((Item)OreSpawnMain.RubyLegs, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 11: is = dropItemRand((Item)OreSpawnMain.RubyBoots, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 12: is = dropItemRand(OreSpawnMain.MyUltimateBow, 1); break; }  }  for (var4 = 0; var4 < 25; var4++)
/* 486 */       spawnCreature(this.field_70170_p, "Butterfly", this.field_70165_t, this.field_70163_u + 1.0D, this.field_70161_v);  } protected void func_70619_bc() { if (this.field_70128_L)
/* 487 */       return;  super.func_70619_bc();
/* 488 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*     */     
/* 490 */     if (func_110143_aJ() + 1.0F < func_110138_aP()) {
/* 491 */       this.ticker++;
/* 492 */       if (this.ticker > 2400) {
/* 493 */         spawnCreature(this.field_70170_p, "Brutalfly", this.field_70165_t, this.field_70163_u + 4.0D, this.field_70161_v);
/* 494 */         func_85030_a("random.explode", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/* 495 */         for (int i = 0; i < 10; i++) {
/* 496 */           spawnCreature(this.field_70170_p, "Butterfly", this.field_70165_t, this.field_70163_u + 1.0D + this.field_70170_p.field_73012_v.nextInt(4), this.field_70161_v);
/*     */         }
/* 498 */         func_70106_y();
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 503 */     if (this.field_70134_J) {
/* 504 */       for (int i = -2; i <= 2; i++) {
/* 505 */         for (int j = -1; j < 5; j++) {
/* 506 */           for (int k = -2; k <= 2; k++) {
/* 507 */             if (this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + j, (int)this.field_70161_v + k) == Blocks.field_150321_G) {
/* 508 */               this.field_70170_p.func_147449_b((int)this.field_70165_t + i, (int)this.field_70163_u + j, (int)this.field_70161_v + k, Blocks.field_150350_a);
/* 509 */               this.field_70170_p.func_72921_c((int)this.field_70165_t + i, (int)this.field_70163_u + j, (int)this.field_70161_v + k, 0, 3);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 514 */       this.field_70134_J = false;
/*     */     } 
/* 516 */     if (this.field_70170_p.field_73012_v.nextInt(4) == 0) {
/*     */       
/* 518 */       EntityLivingBase e = func_70638_az();
/* 519 */       if (e != null && !e.func_70089_S()) {
/* 520 */         func_70624_b(null);
/* 521 */         e = null;
/*     */       } 
/* 523 */       if (this.field_70170_p.field_73012_v.nextInt(200) == 0) {
/* 524 */         func_70624_b(null);
/*     */       }
/* 526 */       if (e == null) {
/* 527 */         e = findSomethingToAttack();
/*     */       }
/* 529 */       if (e != null) {
/* 530 */         this.foundmob = 1;
/* 531 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 532 */         if (func_70068_e((Entity)e) < ((5.0F + e.field_70130_N / 2.0F) * (5.0F + e.field_70130_N / 2.0F))) {
/* 533 */           setAttacking(1);
/*     */           
/* 535 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 0 || this.field_70170_p.field_73012_v.nextInt(4) == 1)
/*     */           {
/* 537 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 540 */           setAttacking(0);
/* 541 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 542 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0) {
/* 543 */             double dx = e.field_70165_t;
/* 544 */             double dz = e.field_70161_v;
/* 545 */             dx += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 2.0D;
/* 546 */             dz += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 2.0D;
/* 547 */             for (int i = 2; i > -2; i--) {
/* 548 */               if (this.field_70170_p.func_147439_a((int)dx, (int)e.field_70163_u + i + 1, (int)dz) == Blocks.field_150350_a && 
/* 549 */                 this.field_70170_p.func_147439_a((int)dx, (int)e.field_70163_u + i, (int)dz) != Blocks.field_150350_a) {
/* 550 */                 this.field_70170_p.func_147449_b((int)dx, (int)e.field_70163_u + i + 1, (int)dz, Blocks.field_150321_G);
/*     */ 
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } else {
/* 559 */         setAttacking(0);
/* 560 */         this.foundmob = 0;
/*     */       } 
/*     */     } 
/* 563 */     if ((this.field_70170_p.field_73012_v.nextInt(8) == 0 && func_110143_aJ() < mygetMaxHealth()) || this.field_70170_p.field_73012_v.nextInt(30) == 0)
/*     */     {
/*     */ 
/*     */       
/* 567 */       if (OreSpawnMain.PlayNicely == 0) {
/* 568 */         this.closest = 99999;
/* 569 */         this.tx = this.ty = this.tz = 0;
/* 570 */         for (int i = 1; i < 13; i++) {
/* 571 */           int j = i;
/* 572 */           if (j > 9) j = 9; 
/* 573 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 574 */             break;  if (i >= 9) i++;
/*     */         
/*     */         } 
/* 577 */         if (this.closest < 99999) {
/*     */           
/* 579 */           if (this.foundmob == 0) func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D); 
/* 580 */           if (this.closest < 81) {
/*     */             
/* 582 */             if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2); 
/* 583 */             func_70691_i(2.0F);
/* 584 */             if (this.field_70170_p.field_73012_v.nextInt(20) == 1) func_85030_a("random.burp", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F); 
/*     */           } 
/*     */         } 
/*     */       }  }  } public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/*     */     Entity var8 = null;
/*     */     if (par0World == null)
/*     */       return null; 
/*     */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     if (var8 != null) {
/*     */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */       par0World.func_72838_d(var8);
/*     */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     return var8;
/*     */   } private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 599 */     if (par1EntityLiving == null)
/*     */     {
/* 601 */       return false;
/*     */     }
/* 603 */     if (par1EntityLiving == this)
/*     */     {
/* 605 */       return false;
/*     */     }
/* 607 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 609 */       return false;
/*     */     }
/*     */     
/* 612 */     if (!MyCanSee(par1EntityLiving))
/*     */     {
/*     */       
/* 615 */       return false;
/*     */     }
/*     */     
/* 618 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 620 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 621 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 622 */         return false;
/*     */       }
/* 624 */       return true;
/*     */     } 
/* 626 */     if (par1EntityLiving instanceof CaterKiller)
/*     */     {
/* 628 */       return false;
/*     */     }
/*     */     
/* 631 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 633 */       return true;
/*     */     }
/*     */     
/* 636 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 637 */       return true;
/*     */     }
/*     */     
/* 640 */     return false; } public void initCreature() {} public boolean func_70085_c(EntityPlayer par1EntityPlayer) { return false; }
/*     */   public boolean func_70652_k(Entity par1Entity) { if (super.func_70652_k(par1Entity)) { if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         double ks = 1.2D; double inair = 0.1D; float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t); if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer)
/*     */           inair *= 2.0D;  par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       }  return true; }
/*     */      return false; }
/* 646 */   private EntityLivingBase findSomethingToAttack() { if (OreSpawnMain.PlayNicely != 0) return null; 
/* 647 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(20.0D, 8.0D, 20.0D));
/* 648 */     Collections.sort(var5, this.TargetSorter);
/* 649 */     Iterator<?> var2 = var5.iterator();
/* 650 */     Entity var3 = null;
/* 651 */     EntityLivingBase var4 = null;
/*     */     
/* 653 */     while (var2.hasNext()) {
/*     */       
/* 655 */       var3 = (Entity)var2.next();
/* 656 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 658 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 660 */         return var4;
/*     */       }
/*     */     } 
/* 663 */     return null; }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 668 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 673 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
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
/* 685 */     for (k = -3; k < 3; k++) {
/*     */       
/* 687 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 689 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 691 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 692 */           if (bid == Blocks.field_150474_ac) {
/* 693 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 694 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 695 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 696 */             if (s != null && 
/* 697 */               s.equals("CaterKiller")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 704 */     if (this.field_70163_u < 50.0D) return false; 
/* 705 */     if (this.field_70170_p.field_73012_v.nextInt(10) != 0) return false; 
/* 706 */     if (!this.field_70170_p.func_72935_r()) return false;
/*     */ 
/*     */ 
/*     */     
/* 710 */     for (k = -1; k < 2; k++) {
/*     */       
/* 712 */       for (int j = -1; j < 2; j++) {
/*     */         
/* 714 */         for (int i = 1; i < 5; i++) {
/*     */           
/* 716 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 717 */           if (bid != Blocks.field_150350_a && bid != Blocks.field_150362_t && bid != Blocks.field_150361_u && bid != Blocks.field_150364_r && bid != Blocks.field_150363_s) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 723 */     CaterKiller target = null;
/* 724 */     target = (CaterKiller)this.field_70170_p.func_72857_a(CaterKiller.class, this.field_70121_D.func_72314_b(48.0D, 16.0D, 48.0D), (Entity)this);
/* 725 */     if (target != null)
/*     */     {
/* 727 */       return false;
/*     */     }
/* 729 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean MyCanSee(EntityLivingBase e) {
/* 740 */     double xzoff = 2.5D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 747 */     int nblks = 10;
/*     */     
/* 749 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 750 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 751 */     float startx = (float)cx;
/* 752 */     float starty = (float)(this.field_70163_u + 3.0D);
/* 753 */     float startz = (float)cz;
/* 754 */     float dx = (float)((e.field_70165_t - startx) / 10.0D);
/* 755 */     float dy = (float)((e.field_70163_u + (e.field_70131_O / 2.0F) - starty) / 10.0D);
/* 756 */     float dz = (float)((e.field_70161_v - startz) / 10.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 761 */     if (Math.abs(dx) > 1.0D) {
/* 762 */       dy /= Math.abs(dx);
/* 763 */       dz /= Math.abs(dx);
/* 764 */       nblks = (int)(nblks * Math.abs(dx));
/* 765 */       if (dx > 1.0F) dx = 1.0F; 
/* 766 */       if (dx < -1.0F) dx = -1.0F; 
/*     */     } 
/* 768 */     if (Math.abs(dy) > 1.0D) {
/* 769 */       dx /= Math.abs(dy);
/* 770 */       dz /= Math.abs(dy);
/* 771 */       nblks = (int)(nblks * Math.abs(dy));
/* 772 */       if (dy > 1.0F) dy = 1.0F; 
/* 773 */       if (dy < -1.0F) dy = -1.0F; 
/*     */     } 
/* 775 */     if (Math.abs(dz) > 1.0D) {
/* 776 */       dy /= Math.abs(dz);
/* 777 */       dx /= Math.abs(dz);
/* 778 */       nblks = (int)(nblks * Math.abs(dz));
/* 779 */       if (dz > 1.0F) dz = 1.0F; 
/* 780 */       if (dz < -1.0F) dz = -1.0F;
/*     */     
/*     */     } 
/*     */ 
/*     */     
/* 785 */     for (int i = 0; i < nblks; ) {
/* 786 */       startx += dx;
/* 787 */       starty += dy;
/* 788 */       startz += dz;
/* 789 */       Block bid = this.field_70170_p.func_147439_a((int)startx, (int)starty, (int)startz);
/* 790 */       if (bid == Blocks.field_150350_a || 
/* 791 */         bid == Blocks.field_150321_G || 
/* 792 */         bid == Blocks.field_150329_H || 
/* 793 */         bid == Blocks.field_150362_t) { i++; continue; }
/* 794 */        return false;
/*     */     } 
/*     */ 
/*     */     
/* 798 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CaterKiller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */