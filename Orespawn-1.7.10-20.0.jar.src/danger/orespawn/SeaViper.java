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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SeaViper
/*     */   extends EntityMob
/*     */ {
/*  68 */   private GenericTargetSorter TargetSorter = null;
/*  69 */   private RenderInfo renderdata = new RenderInfo();
/*  70 */   private int stream_count = 0;
/*  71 */   private int hurt_timer = 0;
/*  72 */   private float moveSpeed = 0.25F; private int closest; private int tx;
/*     */   private int ty;
/*     */   private int tz;
/*     */   
/*  76 */   public SeaViper(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 447 */     this.closest = 99999;
/* 448 */     this.tx = 0; this.ty = 0; this.tz = 0; this.moveSpeed = 0.35F; func_70105_a(1.5F, 2.5F); func_70661_as().func_75491_a(false); this.field_70728_aV = 120; this.field_70174_ab = 30; this.field_70178_ae = false; this.TargetSorter = new GenericTargetSorter((Entity)this); this.renderdata = new RenderInfo(); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); } protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.SeaViper_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); if (this.renderdata == null) this.renderdata = new RenderInfo();  this.renderdata.rf1 = 0.0F; this.renderdata.rf2 = 0.0F; this.renderdata.rf3 = 0.0F; this.renderdata.rf4 = 0.0F; this.renderdata.ri1 = 0; this.renderdata.ri2 = 0; this.renderdata.ri3 = 0; this.renderdata.ri4 = 0; } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return OreSpawnMain.SeaViper_stats.health; } public RenderInfo getRenderInfo() { return this.renderdata; } public void setRenderInfo(RenderInfo r) { this.renderdata.rf1 = r.rf1; this.renderdata.rf2 = r.rf2; this.renderdata.rf3 = r.rf3; this.renderdata.rf4 = r.rf4; this.renderdata.ri1 = r.ri1; this.renderdata.ri2 = r.ri2; this.renderdata.ri3 = r.ri3; this.renderdata.ri4 = r.ri4; } public int func_70658_aO() { return OreSpawnMain.SeaViper_stats.defense; }
/*     */   protected boolean func_70650_aV() { return true; }
/*     */   public void func_70636_d() { super.func_70636_d(); if (func_70090_H()) { this.moveSpeed = 0.75F; } else { this.moveSpeed = 0.25F; }  }
/*     */   public int getSeaViperHealth() { return (int)func_110143_aJ(); }
/* 452 */   private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 457 */     for (i = -dy; i <= dy; i++) {
/* 458 */       for (int j = -dz; j <= dz; j++) {
/* 459 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 460 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 461 */           int d = dx * dx + j * j + i * i;
/* 462 */           if (d < this.closest) {
/* 463 */             this.closest = d;
/* 464 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 465 */             found++;
/*     */           } 
/*     */         } 
/* 468 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 469 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 470 */           int d = dx * dx + j * j + i * i;
/* 471 */           if (d < this.closest) {
/* 472 */             this.closest = d;
/* 473 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 474 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 480 */     for (i = -dx; i <= dx; i++) {
/* 481 */       for (int j = -dz; j <= dz; j++) {
/* 482 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 483 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 484 */           int d = dy * dy + j * j + i * i;
/* 485 */           if (d < this.closest) {
/* 486 */             this.closest = d;
/* 487 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 488 */             found++;
/*     */           } 
/*     */         } 
/* 491 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 492 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 493 */           int d = dy * dy + j * j + i * i;
/* 494 */           if (d < this.closest) {
/* 495 */             this.closest = d;
/* 496 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 497 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 503 */     for (i = -dx; i <= dx; i++) {
/* 504 */       for (int j = -dy; j <= dy; j++) {
/* 505 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 506 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 507 */           int d = dz * dz + j * j + i * i;
/* 508 */           if (d < this.closest) {
/* 509 */             this.closest = d;
/* 510 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 511 */             found++;
/*     */           } 
/*     */         } 
/* 514 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 515 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 516 */           int d = dz * dz + j * j + i * i;
/* 517 */           if (d < this.closest) {
/* 518 */             this.closest = d;
/* 519 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 520 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 526 */     if (found != 0) return true; 
/* 527 */     return false; }
/*     */   protected String func_70639_aQ() { if (this.field_70146_Z.nextInt(2) == 0) return "orespawn:seaviper_living";  return null; }
/*     */   protected String func_70621_aR() { return "orespawn:seaviper_hit"; }
/*     */   protected String func_70673_aS() { return "orespawn:seaviper_death"; }
/*     */   protected float func_70599_aP() { return 1.0F; }
/*     */   protected float func_70647_i() { return 1.0F; }
/*     */   protected Item func_146068_u() { return Items.field_151076_bf; }
/* 534 */   private ItemStack dropItemRand(Item index, int par1) { EntityItem var3 = null; ItemStack is = new ItemStack(index, par1, 0); var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is); if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3);  return is; } protected void func_70628_a(boolean par1, int par2) { ItemStack is = null; dropItemRand(OreSpawnMain.SeaViperTongue, 1); dropItemRand(Items.field_151160_bD, 1); int var5 = 9 + this.field_70170_p.field_73012_v.nextInt(6); int var4; for (var4 = 0; var4 < var5; var4++) { dropItemRand(Items.field_151115_aP, 1); dropItemRand(Items.field_151076_bf, 1); }  var4 = this.field_70170_p.field_73012_v.nextInt(20); switch (var4) { case 1: is = dropItemRand(Items.field_151042_j, 1); break;case 3: is = dropItemRand(Items.field_151040_l, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 4: is = dropItemRand(Items.field_151037_a, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 5: is = dropItemRand(Items.field_151035_b, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 6: is = dropItemRand(Items.field_151036_c, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 7: is = dropItemRand(Items.field_151019_K, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 8: is = dropItemRand((Item)Items.field_151028_Y, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 9: is = dropItemRand((Item)Items.field_151030_Z, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 10: is = dropItemRand((Item)Items.field_151165_aa, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 11: is = dropItemRand((Item)Items.field_151167_ab, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 13: dropItemRand(Item.func_150898_a(Blocks.field_150339_S), 1); break; }  } protected void func_70619_bc() { if (this.field_70128_L)
/* 535 */       return;  super.func_70619_bc();
/* 536 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*     */     
/* 538 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(25) == 0) {
/*     */ 
/*     */       
/* 541 */       this.closest = 99999;
/* 542 */       this.tx = this.ty = this.tz = 0;
/* 543 */       for (int i = 1; i < 12; i++) {
/* 544 */         int j = i;
/* 545 */         if (j > 10) j = 10; 
/* 546 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 547 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 550 */       if (this.closest < 99999) {
/* 551 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       } else {
/* 553 */         if (this.field_70170_p.field_73012_v.nextInt(150) == 1)
/* 554 */           func_70691_i(-1.0F); 
/* 555 */         if (func_110143_aJ() <= 0.0F) {
/* 556 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 563 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 564 */       EntityLivingBase e = findSomethingToAttack();
/* 565 */       if (e != null) {
/* 566 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 567 */         if (func_70068_e((Entity)e) < ((4.5F + e.field_70130_N / 2.0F) * (4.5F + e.field_70130_N / 2.0F))) {
/* 568 */           setAttacking(1);
/*     */           
/* 570 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 0 || this.field_70170_p.field_73012_v.nextInt(4) == 1)
/*     */           {
/* 572 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 575 */           func_70661_as().func_75497_a((Entity)e, 1.5D);
/*     */         } 
/*     */       } else {
/* 578 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 583 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1 && func_70090_H() && 
/* 584 */       func_110143_aJ() < mygetMaxHealth()) {
/* 585 */       func_85030_a("splash", 1.5F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */       
/* 587 */       func_70691_i(1.0F);
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
/* 604 */     if (par1EntityLiving == null)
/*     */     {
/* 606 */       return false;
/*     */     }
/* 608 */     if (par1EntityLiving == this)
/*     */     {
/* 610 */       return false;
/*     */     }
/* 612 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 614 */       return false;
/*     */     }
/* 616 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 619 */       return false;
/*     */     }
/* 621 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 623 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 624 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 625 */         return false;
/*     */       }
/* 627 */       return true;
/*     */     } 
/* 629 */     if (par1EntityLiving instanceof SeaViper)
/*     */     {
/* 631 */       return false;
/*     */     }
/*     */     
/* 634 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 636 */       return true;
/*     */     }
/* 638 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 639 */       return true;
/*     */     }
/*     */     
/* 642 */     return false; } public boolean func_70085_c(EntityPlayer par1EntityPlayer) { return false; }
/*     */   public boolean func_70652_k(Entity par1Entity) { int var2 = 6; if (super.func_70652_k(par1Entity)) { if (par1Entity != null && par1Entity instanceof EntityLivingBase) { double ks = 0.8D; double inair = 0.14D; float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t); if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D;  par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks); if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY) { var2 = 8; if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) { var2 = 10; } else if (this.field_70170_p.field_73013_u == EnumDifficulty.HARD) { var2 = 12; }  }  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) ((EntityLivingBase)par1Entity).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, var2 * 20, 0));  }  return true; }  return false; }
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (par1DamageSource.func_76355_l().equals("cactus"))
/*     */       return false;  Entity e = par1DamageSource.func_76346_g(); if (this.hurt_timer <= 0) { ret = super.func_70097_a(par1DamageSource, par2); this.hurt_timer = 5; }  if (e != null && e instanceof EntityLiving) { if (e instanceof SeaViper)
/*     */         return false;  func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D); }  return ret; }
/* 647 */   private EntityLivingBase findSomethingToAttack() { if (OreSpawnMain.PlayNicely != 0) return null; 
/* 648 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(18.0D, 4.0D, 18.0D));
/* 649 */     Collections.sort(var5, this.TargetSorter);
/* 650 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 652 */     Entity var3 = null;
/* 653 */     EntityLivingBase var4 = null;
/*     */     
/* 655 */     EntityLivingBase e = func_70638_az();
/* 656 */     if (e != null && e.func_70089_S()) {
/* 657 */       return e;
/*     */     }
/* 659 */     func_70624_b(null);
/*     */ 
/*     */     
/* 662 */     while (var2.hasNext()) {
/*     */       
/* 664 */       var3 = (Entity)var2.next();
/* 665 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 667 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 669 */         return var4;
/*     */       }
/*     */     } 
/* 672 */     return null; }
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
/* 683 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 688 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 697 */     SeaViper target = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 703 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 705 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 707 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 709 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 710 */           if (bid == Blocks.field_150474_ac) {
/* 711 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 712 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 713 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 714 */             if (s != null && 
/* 715 */               s.equals("Sea Viper")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 721 */     if (this.field_70163_u < 50.0D) return false;
/*     */     
/* 723 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 724 */     target = (SeaViper)this.field_70170_p.func_72857_a(SeaViper.class, this.field_70121_D.func_72314_b(16.0D, 5.0D, 16.0D), (Entity)this);
/* 725 */     if (target != null)
/*     */     {
/* 727 */       return false;
/*     */     }
/* 729 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 735 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\SeaViper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */