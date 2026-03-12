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
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
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
/*     */ public class AttackSquid
/*     */   extends EntityMob
/*     */ {
/*  65 */   private GenericTargetSorter TargetSorter = null;
/*  66 */   private EntityLivingBase buddy = null;
/*  67 */   private float moveSpeed = 0.25F;
/*  68 */   private int wasshot = 0; private int closest; private int tx;
/*     */   private int ty;
/*     */   private int tz;
/*     */   
/*  72 */   public AttackSquid(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 438 */     this.closest = 99999;
/* 439 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(1.0F, 1.25F); func_70661_as().func_75491_a(false); this.field_70728_aV = 15; this.field_70174_ab = 3; this.field_70178_ae = false; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false)); } protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.AttackSquid_stats.attack); } protected void func_70088_a() { super.func_70088_a(); this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0)); } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  return true; } public void setWasShot() { this.wasshot = 250; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); } public int mygetMaxHealth() { return OreSpawnMain.AttackSquid_stats.health; } public int func_70658_aO() { return OreSpawnMain.AttackSquid_stats.defense; } protected boolean func_70650_aV() { return true; } public void func_70636_d() { super.func_70636_d(); }
/*     */   public int getAttackStrength(Entity par1Entity) { int var2 = 2; return var2; }
/*     */   protected String func_70639_aQ() { return null; }
/*     */   protected String func_70621_aR() { return "orespawn:squid_hurt"; }
/* 443 */   private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 448 */     for (i = -dy; i <= dy; i++) {
/* 449 */       for (int j = -dz; j <= dz; j++) {
/* 450 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 451 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 452 */           int d = dx * dx + j * j + i * i;
/* 453 */           if (d < this.closest) {
/* 454 */             this.closest = d;
/* 455 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 456 */             found++;
/*     */           } 
/*     */         } 
/* 459 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 460 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 461 */           int d = dx * dx + j * j + i * i;
/* 462 */           if (d < this.closest) {
/* 463 */             this.closest = d;
/* 464 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 465 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 471 */     for (i = -dx; i <= dx; i++) {
/* 472 */       for (int j = -dz; j <= dz; j++) {
/* 473 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 474 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 475 */           int d = dy * dy + j * j + i * i;
/* 476 */           if (d < this.closest) {
/* 477 */             this.closest = d;
/* 478 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 479 */             found++;
/*     */           } 
/*     */         } 
/* 482 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 483 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 484 */           int d = dy * dy + j * j + i * i;
/* 485 */           if (d < this.closest) {
/* 486 */             this.closest = d;
/* 487 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 488 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 494 */     for (i = -dx; i <= dx; i++) {
/* 495 */       for (int j = -dy; j <= dy; j++) {
/* 496 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 497 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 498 */           int d = dz * dz + j * j + i * i;
/* 499 */           if (d < this.closest) {
/* 500 */             this.closest = d;
/* 501 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 502 */             found++;
/*     */           } 
/*     */         } 
/* 505 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 506 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 507 */           int d = dz * dz + j * j + i * i;
/* 508 */           if (d < this.closest) {
/* 509 */             this.closest = d;
/* 510 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 511 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 517 */     if (found != 0) return true; 
/* 518 */     return false; } protected String func_70673_aS() { return "orespawn:squid_death"; }
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) { Entity var8 = null; var8 = EntityList.func_75620_a(par1, par0World); if (var8 != null) { var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F); par0World.func_72838_d(var8); ((EntityLiving)var8).func_70642_aH(); }  return var8; }
/*     */   protected float func_70599_aP() { return 1.0F; }
/*     */   protected float func_70647_i() { return 1.0F; }
/*     */   protected Item func_146068_u() { return Items.field_151115_aP; }
/*     */   private ItemStack dropItemRand(Item index, int par1) { EntityItem var3 = null; ItemStack is = new ItemStack(index, par1, 0); var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is); if (var3 != null)
/*     */       this.field_70170_p.func_72838_d((Entity)var3);  return is; }
/* 525 */   protected void func_70619_bc() { if (this.field_70128_L)
/* 526 */       return;  super.func_70619_bc();
/*     */     
/* 528 */     if (this.wasshot > 0) {
/* 529 */       this.wasshot--;
/* 530 */       if (this.wasshot == 0) {
/* 531 */         func_70106_y();
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 537 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(10) == 0) {
/*     */ 
/*     */       
/* 540 */       this.closest = 99999;
/* 541 */       this.tx = this.ty = this.tz = 0;
/* 542 */       for (int i = 1; i < 12; i++) {
/* 543 */         int j = i;
/* 544 */         if (j > 5) j = 5; 
/* 545 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 546 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 549 */       if (this.closest < 99999) {
/* 550 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.33D);
/*     */       } else {
/* 552 */         if (this.field_70170_p.field_73012_v.nextInt(25) == 1)
/* 553 */           func_70691_i(-1.0F); 
/* 554 */         if (func_110143_aJ() <= 0.0F) {
/* 555 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 562 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1)
/* 563 */     { EntityLivingBase e = findSomethingToAttack();
/* 564 */       if (e != null)
/* 565 */       { if (func_70068_e((Entity)e) < 9.0D) {
/* 566 */           setAttacking(1);
/*     */           
/* 568 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 570 */             func_70652_k((Entity)e);
/*     */ 
/*     */           
/*     */           }
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 580 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/* 581 */           watercanon(e);
/*     */         }  }
/*     */       else
/* 584 */       { if (this.buddy != null) {
/* 585 */           func_70661_as().func_75497_a((Entity)this.buddy, 1.0D);
/*     */         }
/* 587 */         setAttacking(0); }  }  }
/*     */   protected void func_70628_a(boolean par1, int par2) { EntityItem var3; ItemStack is = null; int var4 = this.field_70170_p.field_73012_v.nextInt(50); switch (var4) { case 0: is = dropItemRand(Items.field_151074_bl, 1); break;case 1: is = dropItemRand(Items.field_151043_k, 1); break;case 2: is = dropItemRand(Items.field_151150_bK, 1); break;case 3: is = dropItemRand(Items.field_151010_B, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 4: is = dropItemRand(Items.field_151011_C, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 5: is = dropItemRand(Items.field_151005_D, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 6: is = dropItemRand(Items.field_151006_E, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 7: is = dropItemRand(Items.field_151013_M, 1); if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 8: is = dropItemRand((Item)Items.field_151169_ag, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5));  break;case 9: is = dropItemRand((Item)Items.field_151171_ah, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1)
/*     */           is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 10: is = dropItemRand((Item)Items.field_151149_ai, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1)
/*     */           is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1)
/*     */           is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1)
/*     */           is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(6) == 1)
/*     */           is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1)
/*     */           is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 11: is = dropItemRand((Item)Items.field_151151_aj, 1); if (this.field_70170_p.field_73012_v.nextInt(6) == 1)
/*     */           is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5));  if (this.field_70170_p.field_73012_v.nextInt(2) == 1)
/*     */           is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));  break;case 12: dropItemRand(Items.field_151153_ao, 1); break;case 13: dropItemRand(Item.func_150898_a(Blocks.field_150340_R), 1); break;case 14: var3 = null; is = new ItemStack(Items.field_151153_ao, 1, 1); var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is); if (var3 != null)
/*     */           this.field_70170_p.func_72838_d((Entity)var3);  break;case 15: case 16: case 17: dropItemRand(Items.field_151100_aR, 1); break; }  int i = 1 + this.field_70170_p.field_73012_v.nextInt(3); for (var4 = 0; var4 < i; var4++)
/* 598 */       dropItemRand(Items.field_151115_aP, 1);  } private void watercanon(EntityLivingBase e) { double yoff = 1.0D;
/* 599 */     double xzoff = 1.2D;
/*     */     
/* 601 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */     {
/* 603 */       if (this.field_70146_Z.nextInt(3) == 1) {
/* 604 */         InkSack var2 = new InkSack(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u + 0.75D - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 605 */         var2.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)), this.field_70759_as, this.field_70125_A);
/* 606 */         double var3 = e.field_70165_t - this.field_70165_t;
/* 607 */         double var5 = e.field_70163_u + 0.25D - var2.field_70163_u;
/* 608 */         double var7 = e.field_70161_v - this.field_70161_v;
/* 609 */         float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 610 */         var2.func_70186_c(var3, var5 + var9, var7, 1.4F, 5.0F);
/* 611 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 612 */         this.field_70170_p.func_72838_d((Entity)var2);
/*     */       } else {
/*     */         
/* 615 */         WaterBall var2 = new WaterBall(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u + 0.75D - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 616 */         var2.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)), this.field_70759_as, this.field_70125_A);
/* 617 */         double var3 = e.field_70165_t - this.field_70165_t;
/* 618 */         double var5 = e.field_70163_u + 0.25D - var2.field_70163_u;
/* 619 */         double var7 = e.field_70161_v - this.field_70161_v;
/* 620 */         float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 621 */         var2.func_70186_c(var3, var5 + var9, var7, 1.4F, 5.0F);
/* 622 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 623 */         this.field_70170_p.func_72838_d((Entity)var2);
/*     */       }  }  }
/*     */   public void initCreature() {}
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) { return false; }
/*     */   public boolean func_70652_k(Entity par1Entity) { if (super.func_70652_k(par1Entity))
/*     */       return true;  return false; }
/*     */   protected void func_70069_a(float par1) { if (this.wasshot != 0)
/*     */       return;  super.func_70069_a(par1); } public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (this.field_70128_L)
/*     */       return false;  Entity e = par1DamageSource.func_76346_g(); if (e != null && e instanceof AttackSquid)
/*     */       return false;  if (e != null && e instanceof WaterBall)
/*     */       return false;  if (e != null && e instanceof WaterDragon)
/*     */       return false;  if (e != null && e instanceof EntityLiving) { if (e instanceof AttackSquid)
/*     */         return false;  if (e instanceof WaterDragon)
/*     */         return false;  func_70624_b((EntityLivingBase)e); func_70784_b(e); func_70661_as().func_75497_a(e, 1.2D); ret = true; }
/*     */      ret = super.func_70097_a(par1DamageSource, par2); if ((func_110143_aJ() <= 0.0F || this.field_70128_L) && this.field_70170_p.field_73011_w.field_76574_g != OreSpawnMain.DimensionID5 && !this.field_70170_p.field_72995_K && e != null && e instanceof EntityPlayer && this.field_70170_p.field_73012_v.nextInt(15) == 1 && OreSpawnMain.KrakenEnable != 0 && this.wasshot == 0) { int j = 1 + this.field_70170_p.field_73012_v.nextInt(3); for (int i = 0; i < j; i++)
/*     */         EntityCreature newent = (EntityCreature)spawnCreature(this.field_70170_p, "The Kraken", this.field_70165_t + this.field_70170_p.field_73012_v.nextInt(4) - this.field_70170_p.field_73012_v.nextInt(4), 170.0D, this.field_70161_v + this.field_70170_p.field_73012_v.nextInt(4) - this.field_70170_p.field_73012_v.nextInt(4));  }
/* 639 */      return ret; } private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) { if (par1EntityLiving == null)
/*     */     {
/* 641 */       return false;
/*     */     }
/* 643 */     if (par1EntityLiving == this)
/*     */     {
/* 645 */       return false;
/*     */     }
/* 647 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 649 */       return false;
/*     */     }
/*     */     
/* 652 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 655 */       return false;
/*     */     }
/* 657 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 659 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 660 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 661 */         return false;
/*     */       }
/* 663 */       return true;
/*     */     } 
/* 665 */     if (par1EntityLiving instanceof Girlfriend)
/*     */     {
/* 667 */       return true;
/*     */     }
/* 669 */     if (par1EntityLiving instanceof Boyfriend)
/*     */     {
/* 671 */       return true;
/*     */     }
/* 673 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityZombie)
/*     */     {
/* 675 */       return true;
/*     */     }
/* 677 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
/*     */     {
/* 679 */       return true;
/*     */     }
/* 681 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
/*     */     {
/* 683 */       return true;
/*     */     }
/* 685 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
/*     */     {
/* 687 */       return true;
/*     */     }
/* 689 */     if (par1EntityLiving instanceof Ghost)
/*     */     {
/* 691 */       return false;
/*     */     }
/* 693 */     if (par1EntityLiving instanceof GhostSkelly)
/*     */     {
/* 695 */       return false;
/*     */     }
/* 697 */     if (par1EntityLiving instanceof Lizard)
/*     */     {
/* 699 */       return true;
/*     */     }
/* 701 */     if (par1EntityLiving instanceof AttackSquid) {
/*     */ 
/*     */       
/* 704 */       if (this.field_70170_p.field_73012_v.nextInt(5) == 1) this.buddy = par1EntityLiving; 
/* 705 */       return false;
/*     */     } 
/* 707 */     if (this.wasshot != 0) return true;
/*     */     
/* 709 */     return false; }
/*     */ 
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 714 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 715 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 4.0D, 10.0D));
/* 716 */     Collections.sort(var5, this.TargetSorter);
/* 717 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 719 */     Entity var3 = null;
/* 720 */     EntityLivingBase var4 = null;
/*     */     
/* 722 */     EntityLivingBase e = func_70638_az();
/* 723 */     if (e != null && e.func_70089_S()) {
/* 724 */       return e;
/*     */     }
/* 726 */     func_70624_b(null);
/*     */ 
/*     */     
/* 729 */     while (var2.hasNext()) {
/*     */       
/* 731 */       var3 = (Entity)var2.next();
/* 732 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 734 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 736 */         return var4;
/*     */       }
/*     */     } 
/* 739 */     return null;
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
/* 750 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 755 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 763 */     super.func_70014_b(par1NBTTagCompound);
/* 764 */     par1NBTTagCompound.func_74768_a("WasShot", this.wasshot);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 772 */     super.func_70037_a(par1NBTTagCompound);
/* 773 */     this.wasshot = par1NBTTagCompound.func_74762_e("WasShot");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 781 */     super.func_70601_bi();
/* 782 */     if (this.field_70163_u < 50.0D) return false; 
/* 783 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 784 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\AttackSquid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */