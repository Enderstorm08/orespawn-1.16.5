/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.enchantment.Enchantment;
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
/*     */ public class SeaMonster
/*     */   extends EntityMob
/*     */ {
/*  67 */   private GenericTargetSorter TargetSorter = null;
/*  68 */   private RenderInfo renderdata = new RenderInfo();
/*  69 */   private int hurt_timer = 0;
/*  70 */   private float moveSpeed = 0.25F; private int closest; private int tx;
/*     */   private int ty;
/*     */   private int tz;
/*     */   
/*  74 */   public SeaMonster(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 427 */     this.closest = 99999;
/* 428 */     this.tx = 0; this.ty = 0; this.tz = 0; this.moveSpeed = 0.25F; func_70105_a(1.25F, 2.5F); func_70661_as().func_75491_a(false); this.field_70728_aV = 150; this.field_70174_ab = 30; this.field_70178_ae = false; this.TargetSorter = new GenericTargetSorter((Entity)this); this.renderdata = new RenderInfo(); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); } protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.SeaMonster_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); if (this.renderdata == null) this.renderdata = new RenderInfo();  this.renderdata.rf1 = 0.0F; this.renderdata.rf2 = 0.0F; this.renderdata.rf3 = 0.0F; this.renderdata.rf4 = 0.0F; this.renderdata.ri1 = 0; this.renderdata.ri2 = 0; this.renderdata.ri3 = 0; this.renderdata.ri4 = 0; } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return OreSpawnMain.SeaMonster_stats.health; } public RenderInfo getRenderInfo() { return this.renderdata; } public void setRenderInfo(RenderInfo r) { this.renderdata.rf1 = r.rf1; this.renderdata.rf2 = r.rf2; this.renderdata.rf3 = r.rf3; this.renderdata.rf4 = r.rf4; this.renderdata.ri1 = r.ri1; this.renderdata.ri2 = r.ri2; this.renderdata.ri3 = r.ri3; this.renderdata.ri4 = r.ri4; } public int func_70658_aO() { return OreSpawnMain.SeaMonster_stats.defense; }
/*     */   protected boolean func_70650_aV() { return true; }
/*     */   public void func_70636_d() { super.func_70636_d(); if (func_70090_H()) { this.moveSpeed = 0.55F; } else { this.moveSpeed = 0.25F; }  }
/*     */   public int getSeaMonsterHealth() { return (int)func_110143_aJ(); }
/* 432 */   private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 437 */     for (i = -dy; i <= dy; i++) {
/* 438 */       for (int j = -dz; j <= dz; j++) {
/* 439 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 440 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 441 */           int d = dx * dx + j * j + i * i;
/* 442 */           if (d < this.closest) {
/* 443 */             this.closest = d;
/* 444 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 445 */             found++;
/*     */           } 
/*     */         } 
/* 448 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 449 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 450 */           int d = dx * dx + j * j + i * i;
/* 451 */           if (d < this.closest) {
/* 452 */             this.closest = d;
/* 453 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 454 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 460 */     for (i = -dx; i <= dx; i++) {
/* 461 */       for (int j = -dz; j <= dz; j++) {
/* 462 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 463 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 464 */           int d = dy * dy + j * j + i * i;
/* 465 */           if (d < this.closest) {
/* 466 */             this.closest = d;
/* 467 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 468 */             found++;
/*     */           } 
/*     */         } 
/* 471 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 472 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 473 */           int d = dy * dy + j * j + i * i;
/* 474 */           if (d < this.closest) {
/* 475 */             this.closest = d;
/* 476 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 477 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 483 */     for (i = -dx; i <= dx; i++) {
/* 484 */       for (int j = -dy; j <= dy; j++) {
/* 485 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 486 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 487 */           int d = dz * dz + j * j + i * i;
/* 488 */           if (d < this.closest) {
/* 489 */             this.closest = d;
/* 490 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 491 */             found++;
/*     */           } 
/*     */         } 
/* 494 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 495 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 496 */           int d = dz * dz + j * j + i * i;
/* 497 */           if (d < this.closest) {
/* 498 */             this.closest = d;
/* 499 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 500 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 506 */     if (found != 0) return true; 
/* 507 */     return false; }
/*     */   protected String func_70639_aQ() { if (this.field_70146_Z.nextInt(3) == 0) return "orespawn:seamonster_living";  return null; }
/*     */   protected String func_70621_aR() { return "orespawn:seamonster_hit"; }
/*     */   protected String func_70673_aS() { return "orespawn:seamonster_death"; }
/*     */   protected float func_70599_aP() { return 1.0F; }
/*     */   protected float func_70647_i() { return 1.0F; }
/*     */   protected Item func_146068_u() { return Items.field_151115_aP; }
/* 514 */   private ItemStack dropItemRand(Item index, int par1) { EntityItem var3 = null; ItemStack is = new ItemStack(index, par1, 0); var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is); if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3);  return is; } protected void func_70628_a(boolean par1, int par2) { ItemStack is = null; dropItemRand(OreSpawnMain.SeaMonsterScale, 1); dropItemRand(Items.field_151160_bD, 1); int var5 = 9 + this.field_70170_p.field_73012_v.nextInt(6); int var4; for (var4 = 0; var4 < var5; var4++) dropItemRand(Items.field_151115_aP, 1);  var4 = this.field_70170_p.field_73012_v.nextInt(20); switch (var4) { case 1: is = dropItemRand(Items.field_151042_j, 1); break;case 3: is = dropItemRand(Items.field_151040_l, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 4: is = dropItemRand(Items.field_151037_a, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 5: is = dropItemRand(Items.field_151035_b, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 6: is = dropItemRand(Items.field_151036_c, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 7: is = dropItemRand(Items.field_151019_K, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 8: is = dropItemRand((Item)Items.field_151028_Y, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 9: is = dropItemRand((Item)Items.field_151030_Z, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 10: is = dropItemRand((Item)Items.field_151165_aa, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 11: is = dropItemRand((Item)Items.field_151167_ab, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 13: dropItemRand(Item.func_150898_a(Blocks.field_150339_S), 1); break; }  } protected void func_70619_bc() { if (this.field_70128_L)
/* 515 */       return;  super.func_70619_bc();
/* 516 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*     */     
/* 518 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(25) == 0) {
/*     */ 
/*     */       
/* 521 */       this.closest = 99999;
/* 522 */       this.tx = this.ty = this.tz = 0;
/* 523 */       for (int i = 1; i < 12; i++) {
/* 524 */         int j = i;
/* 525 */         if (j > 10) j = 10; 
/* 526 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 527 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 530 */       if (this.closest < 99999) {
/* 531 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       } else {
/* 533 */         if (this.field_70170_p.field_73012_v.nextInt(40) == 1)
/* 534 */           func_70691_i(-1.0F); 
/* 535 */         if (func_110143_aJ() <= 0.0F) {
/* 536 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 543 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 544 */       EntityLivingBase e = findSomethingToAttack();
/* 545 */       if (e != null) {
/* 546 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 547 */         if (func_70068_e((Entity)e) < ((4.0F + e.field_70130_N / 2.0F) * (4.0F + e.field_70130_N / 2.0F))) {
/* 548 */           setAttacking(1);
/*     */           
/* 550 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 552 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 555 */           func_70661_as().func_75497_a((Entity)e, 1.0D);
/*     */         } 
/*     */       } else {
/* 558 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 563 */     if (this.field_70170_p.field_73012_v.nextInt(120) == 1 && func_70090_H() && 
/* 564 */       func_110143_aJ() < mygetMaxHealth()) {
/* 565 */       func_85030_a("splash", 1.5F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */       
/* 567 */       func_70691_i(1.0F);
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
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
/* 601 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 603 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 604 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 605 */         return false;
/*     */       }
/* 607 */       return true;
/*     */     } 
/* 609 */     if (par1EntityLiving instanceof SeaMonster)
/*     */     {
/* 611 */       return false;
/*     */     }
/* 613 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 615 */       return true;
/*     */     }
/* 617 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 618 */       return true;
/*     */     }
/*     */     
/* 621 */     return false; } public boolean func_70085_c(EntityPlayer par1EntityPlayer) { return false; }
/*     */   public boolean func_70652_k(Entity par1Entity) { if (super.func_70652_k(par1Entity)) { if (par1Entity != null && par1Entity instanceof EntityLivingBase) { double ks = 0.6D; double inair = 0.1D; float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t); if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D;  par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks); }  return true; }  return false; }
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (par1DamageSource.func_76355_l().equals("cactus"))
/*     */       return false;  Entity e = par1DamageSource.func_76346_g(); if (this.hurt_timer <= 0) { ret = super.func_70097_a(par1DamageSource, par2); this.hurt_timer = 8; }  if (e != null && e instanceof EntityLiving) { if (e instanceof SeaMonster)
/*     */         return false;  func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D); }  return ret; }
/* 626 */   private EntityLivingBase findSomethingToAttack() { if (OreSpawnMain.PlayNicely != 0) return null; 
/* 627 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 4.0D, 16.0D));
/* 628 */     Collections.sort(var5, this.TargetSorter);
/* 629 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 631 */     Entity var3 = null;
/* 632 */     EntityLivingBase var4 = null;
/*     */     
/* 634 */     EntityLivingBase e = func_70638_az();
/* 635 */     if (e != null && e.func_70089_S()) {
/* 636 */       return e;
/*     */     }
/* 638 */     func_70624_b(null);
/*     */ 
/*     */     
/* 641 */     while (var2.hasNext()) {
/*     */       
/* 643 */       var3 = (Entity)var2.next();
/* 644 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 646 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 648 */         return var4;
/*     */       }
/*     */     } 
/* 651 */     return null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 662 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 667 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 676 */     SeaMonster target = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 681 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 683 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 685 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 687 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 688 */           if (bid == Blocks.field_150474_ac) {
/* 689 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 690 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 691 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 692 */             if (s != null && 
/* 693 */               s.equals("Sea Monster")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 700 */     if (this.field_70163_u < 50.0D) return false;
/*     */     
/* 702 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 703 */     if (!func_70814_o()) return false; 
/* 704 */     target = (SeaMonster)this.field_70170_p.func_72857_a(SeaMonster.class, this.field_70121_D.func_72314_b(16.0D, 5.0D, 16.0D), (Entity)this);
/* 705 */     if (target != null)
/*     */     {
/* 707 */       return false;
/*     */     }
/* 709 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 715 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\SeaMonster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */