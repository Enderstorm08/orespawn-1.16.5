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
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAITempt;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
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
/*     */ public class Stinky
/*     */   extends EntityTameable
/*     */ {
/*     */   private ChunkCoordinates currentFlightTarget;
/*  58 */   private GenericTargetSorter TargetSorter = null;
/*  59 */   public int activity = 1;
/*  60 */   private int owner_flying = 0;
/*     */   
/*  62 */   private float moveSpeed = 0.3F;
/*  63 */   private int skin_color = -1;
/*  64 */   private int syncit = 0;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  68 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(10.0D); } protected void func_70088_a() { super.func_70088_a(); this.activity = 1; this.field_70180_af.func_75682_a(22, Integer.valueOf(0)); this.field_70180_af.func_75682_a(21, Integer.valueOf(this.activity)); this.field_70180_af.func_75682_a(20, Integer.valueOf(1)); func_70904_g(false); func_70903_f(false); } public void func_70014_b(NBTTagCompound par1NBTTagCompound) { super.func_70014_b(par1NBTTagCompound); par1NBTTagCompound.func_74768_a("SpyroActivity", this.field_70180_af.func_75679_c(21)); par1NBTTagCompound.func_74768_a("SpyroFire", this.field_70180_af.func_75679_c(20)); par1NBTTagCompound.func_74768_a("StinkySkin", this.field_70180_af.func_75679_c(22)); } public void func_70037_a(NBTTagCompound par1NBTTagCompound) { super.func_70037_a(par1NBTTagCompound); this.activity = par1NBTTagCompound.func_74762_e("SpyroActivity"); this.field_70180_af.func_75692_b(21, Integer.valueOf(this.activity)); this.field_70180_af.func_75692_b(20, Integer.valueOf(par1NBTTagCompound.func_74762_e("SpyroFire"))); this.skin_color = par1NBTTagCompound.func_74762_e("StinkySkin"); this.field_70180_af.func_75692_b(22, Integer.valueOf(this.skin_color)); } public int getActivity() { int i = this.field_70180_af.func_75679_c(21); this.activity = i; return i; } public void setActivity(int par1) { this.activity = par1; this.field_70180_af.func_75692_b(21, Integer.valueOf(par1)); } public int getSpyroFire() { return this.field_70180_af.func_75679_c(20); } public void setSpyroFire(int par1) { this.field_70180_af.func_75692_b(20, Integer.valueOf(par1)); } public int getSkin() { int i = this.field_70180_af.func_75679_c(22); this.skin_color = i; return i; } public void setSkin(int par1) { this.skin_color = par1; this.field_70180_af.func_75692_b(22, Integer.valueOf(0)); this.field_70180_af.func_75692_b(22, Integer.valueOf(par1)); } public Stinky(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 578 */     this.closest = 99999;
/* 579 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.75F, 0.75F); this.moveSpeed = 0.3F; this.field_70174_ab = 1000; this.field_70178_ae = true; func_70661_as().func_75491_a(true); func_70904_g(false); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 0.30000001192092896D, 0.4000000059604645D)); this.field_70714_bg.func_75776_a(3, new MyEntityAIFollowOwner(this, 1.15F, 12.0F, 2.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F)); this.field_70714_bg.func_75776_a(7, new MyEntityAIWander((EntityCreature)this, 0.75F)); this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this)); this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70728_aV = 35; }
/*     */   public boolean func_70650_aV() { return true; }
/*     */   public boolean func_70648_aU() { return true; }
/* 582 */   public int mygetMaxHealth() { return 100; } public boolean func_70085_c(EntityPlayer par1EntityPlayer) { ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g(); if (var2 != null) if (var2.field_77994_a <= 0) { par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null); var2 = null; }   if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) { if (!func_70909_n()) { if (!this.field_70170_p.field_72995_K) if (this.field_70170_p.field_73012_v.nextInt(2) == 1) { func_70903_f(true); func_152115_b(par1EntityPlayer.func_110124_au().toString()); func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); func_70691_i(mygetMaxHealth() - func_110143_aJ()); } else { func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }   } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (this.field_70170_p.field_72995_K) { func_70908_e(true); this.field_70170_p.func_72960_a((Entity)this, (byte)7); }  if (mygetMaxHealth() > func_110143_aJ()) func_70691_i(mygetMaxHealth() - func_110143_aJ());  }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (!this.field_70170_p.field_72995_K) { func_70903_f(false); func_70606_j(mygetMaxHealth()); func_152115_b(""); func_70908_e(false); this.field_70170_p.func_72960_a((Entity)this, (byte)6); }  if (!par1EntityPlayer.field_71075_bZ.field_75098_d) { var2.field_77994_a--; if (var2.field_77994_a <= 0) par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);  }  return true; }  if (func_70909_n() && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) { if (!func_70906_o()) { func_70904_g(true); setActivity(1); } else { func_70904_g(false); }  return true; }  return super.func_70085_c(par1EntityPlayer); } public boolean isWheat(ItemStack par1ItemStack) { return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd); } protected boolean func_70692_ba() { if (func_104002_bU()) return false;  if (func_70909_n()) return false;  return true; } protected String func_70639_aQ() { return null; } protected String func_70621_aR() { return "orespawn:duck_hurt"; } protected String func_70673_aS() { return "orespawn:cryo_death"; } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 587 */     for (i = -dy; i <= dy; i++) {
/* 588 */       for (int j = -dz; j <= dz; j++) {
/* 589 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 590 */         if (bid == Blocks.field_150365_q) {
/* 591 */           int d = dx * dx + j * j + i * i;
/* 592 */           if (d < this.closest) {
/* 593 */             this.closest = d;
/* 594 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 595 */             found++;
/*     */           } 
/*     */         } 
/* 598 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 599 */         if (bid == Blocks.field_150365_q) {
/* 600 */           int d = dx * dx + j * j + i * i;
/* 601 */           if (d < this.closest) {
/* 602 */             this.closest = d;
/* 603 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 604 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 610 */     for (i = -dx; i <= dx; i++) {
/* 611 */       for (int j = -dz; j <= dz; j++) {
/* 612 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 613 */         if (bid == Blocks.field_150365_q) {
/* 614 */           int d = dy * dy + j * j + i * i;
/* 615 */           if (d < this.closest) {
/* 616 */             this.closest = d;
/* 617 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 618 */             found++;
/*     */           } 
/*     */         } 
/* 621 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 622 */         if (bid == Blocks.field_150365_q) {
/* 623 */           int d = dy * dy + j * j + i * i;
/* 624 */           if (d < this.closest) {
/* 625 */             this.closest = d;
/* 626 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 627 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 633 */     for (i = -dx; i <= dx; i++) {
/* 634 */       for (int j = -dy; j <= dy; j++) {
/* 635 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 636 */         if (bid == Blocks.field_150365_q) {
/* 637 */           int d = dz * dz + j * j + i * i;
/* 638 */           if (d < this.closest) {
/* 639 */             this.closest = d;
/* 640 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 641 */             found++;
/*     */           } 
/*     */         } 
/* 644 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 645 */         if (bid == Blocks.field_150365_q) {
/* 646 */           int d = dz * dz + j * j + i * i;
/* 647 */           if (d < this.closest) {
/* 648 */             this.closest = d;
/* 649 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 650 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 656 */     if (found != 0) return true; 
/* 657 */     return false; } protected float func_70599_aP() { return 0.6F; } public int func_70658_aO() { return 6; } protected Item func_146068_u() { return Items.field_151082_bd; } protected void func_70628_a(boolean par1, int par2) { int var3 = 0; if (func_70909_n()) { var3 = this.field_70170_p.field_73012_v.nextInt(4); var3++; for (int var4 = 0; var4 < var3; var4++) func_145779_a(Items.field_151082_bd, 1);  }  } protected float func_70647_i() { return func_70631_g_() ? ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 0.1F + 1.5F) : ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 0.1F + 1.0F); } protected boolean func_70041_e_() { return true; } protected void func_70069_a(float par1) {} protected void func_70064_a(double par1, boolean par3) {} public boolean func_145773_az() { return false; } public boolean func_70601_bi() { if (!this.field_70170_p.func_72935_r()) return false;  if (findBuddies() > 2) return false;  return true; } public EntityAgeable func_90011_a(EntityAgeable var1) { return null; } public float getAttackStrength(Entity par1Entity) { return 10.0F; } public boolean func_70652_k(Entity par1Entity) { float var2 = getAttackStrength(par1Entity); boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), var2); return var4; } public boolean func_70097_a(DamageSource par1DamageSource, float par2) { boolean ret = false; if (!par1DamageSource.func_76355_l().equals("cactus")) { ret = super.func_70097_a(par1DamageSource, par2); func_70904_g(false); setActivity(2); }  return ret; }
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) { return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null); }
/*     */   private void dropItemFront(Item index, int par1) { float f = 0.75F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.75F); EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + 0.9D, this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70759_as)), new ItemStack(index, par1, 0)); this.field_70170_p.func_72838_d((Entity)var3); }
/*     */   private void dropItemRear(Item index, int par1) { float f = 0.55F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.55F); EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + f * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + 0.25D, this.field_70161_v - f * Math.cos(Math.toRadians(this.field_70759_as)), new ItemStack(index, par1, 0)); this.field_70170_p.func_72838_d((Entity)var3); }
/*     */   public void func_70071_h_() { super.func_70071_h_(); if (!this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(1750) == 1) { func_85030_a("random.burp", 1.0F, 1.0F); dropItemFront(Items.field_151044_h, 1); }  if (!this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(2000) == 2) { func_85030_a("orespawn:fart", 1.0F, 1.5F); if (this.skin_color == 0) dropItemRear(Items.field_151065_br, 1);  if (this.skin_color == 1) dropItemRear(Items.field_151078_bh, 1);  if (this.skin_color == 2) dropItemRear(Items.field_151081_bc, 1);  if (this.skin_color == 3) dropItemRear(OreSpawnMain.UraniumNugget, 1);  if (this.skin_color == 4) dropItemRear(Items.field_151015_O, 1);  if (this.skin_color == 5) dropItemRear(Items.field_151118_aC, 1);  if (this.skin_color == 6) dropItemRear(Item.func_150898_a(Blocks.field_150478_aa), 1);  if (this.skin_color == 7) dropItemRear(Items.field_151166_bC, 1);  if (this.skin_color == 8) dropItemRear(Items.field_151043_k, 1);  if (this.skin_color == 9) dropItemRear(Item.func_150898_a((Block)Blocks.field_150362_t), 1);  if (this.skin_color == 10) dropItemRear(OreSpawnMain.TitaniumNugget, 1);  if (this.skin_color == 11) dropItemRear(OreSpawnMain.MyAppleSeed, 1);  if (this.skin_color == 12) dropItemRear(Items.field_151045_i, 1);  if (this.skin_color == 13) dropItemRear(Item.func_150898_a((Block)Blocks.field_150354_m), 1);  if (this.skin_color == 14) dropItemRear(Item.func_150898_a(Blocks.field_150347_e), 1);  if (this.skin_color == 15) dropItemRear(Items.field_151103_aS, 1);  if (this.skin_color == 16) dropItemRear(Items.field_151007_F, 1);  if (this.skin_color == 17) dropItemRear(OreSpawnMain.MyCherrySeed, 1);  if (this.skin_color == 18) dropItemRear(OreSpawnMain.MyPeachSeed, 1);  }  }
/*     */   public void func_70636_d() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70636_d(); if (func_70090_H()) this.field_70181_x += 0.07D;  if (!this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(2000) == 1) { int i = this.field_70170_p.field_73012_v.nextInt(19); setSkin(i); }  if (this.currentFlightTarget == null) this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);  if (this.skin_color < 0) this.skin_color = this.field_70170_p.field_73012_v.nextInt(19);  this.syncit++; if (this.syncit > 20) { this.syncit = 0; if (this.field_70170_p.field_72995_K) { getActivity(); getSkin(); } else { int j = this.activity; setActivity(j); j = this.skin_color; setSkin(j); }  }  if (this.activity == 2) this.field_70181_x *= 0.6D;  }
/* 663 */   protected void func_70619_bc() { if (this.field_70128_L)
/*     */       return; 
/* 665 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null);
/*     */     
/* 667 */     if (this.activity != 2) {
/* 668 */       super.func_70619_bc();
/*     */     }
/*     */ 
/*     */     
/* 672 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1 && 
/* 673 */       func_110143_aJ() < mygetMaxHealth()) {
/* 674 */       func_70691_i(1.0F);
/*     */     }
/*     */ 
/*     */     
/* 678 */     if (!func_70906_o()) {
/* 679 */       if (this.activity == 0) {
/* 680 */         setActivity(1);
/*     */       }
/*     */       
/* 683 */       if (this.field_70170_p.field_73012_v.nextInt(100) == 1) {
/* 684 */         if (this.field_70170_p.field_73012_v.nextInt(20) == 1) {
/* 685 */           setActivity(2);
/*     */         } else {
/* 687 */           setActivity(1);
/*     */         } 
/*     */       }
/*     */       
/* 691 */       this.owner_flying = 0;
/* 692 */       if (func_70909_n() && func_70902_q() != null) {
/* 693 */         EntityPlayer e = (EntityPlayer)func_70902_q();
/*     */         
/* 695 */         if (e.field_71075_bZ.field_75100_b) {
/* 696 */           this.owner_flying = 1;
/* 697 */           setActivity(2);
/*     */         } 
/*     */       } 
/*     */       
/* 701 */       if (this.activity == 1 && func_70909_n() && func_70902_q() != null) {
/* 702 */         EntityLivingBase e = func_70902_q();
/*     */         
/* 704 */         if (func_70068_e((Entity)e) > 256.0D)
/*     */         {
/* 706 */           setActivity(2);
/*     */         }
/*     */       } 
/*     */       
/* 710 */       do_movement();
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void do_movement() {
/* 718 */     int xdir = 1;
/* 719 */     int zdir = 1;
/*     */     
/* 721 */     int keep_trying = 50;
/*     */ 
/*     */     
/* 724 */     int do_new = 0;
/* 725 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*     */     
/* 727 */     int has_owner = 0;
/* 728 */     EntityLivingBase e = null;
/*     */ 
/*     */     
/* 731 */     if (this.currentFlightTarget == null) {
/* 732 */       do_new = 1;
/* 733 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 739 */     if (this.activity == 2 && this.field_70170_p.field_73012_v.nextInt(300) == 0) do_new = 1;
/*     */ 
/*     */     
/* 742 */     if (func_70909_n() && func_70902_q() != null) {
/* 743 */       e = func_70902_q();
/* 744 */       has_owner = 1;
/* 745 */       ox = e.field_70165_t;
/* 746 */       oy = e.field_70163_u;
/* 747 */       oz = e.field_70161_v;
/*     */       
/* 749 */       if (func_70068_e((Entity)e) > 100.0D) {
/* 750 */         do_new = 1;
/*     */       }
/* 752 */       if (this.owner_flying != 0 && 
/* 753 */         func_70068_e((Entity)e) > 36.0D) {
/* 754 */         do_new = 1;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 760 */     if (this.field_70170_p.field_73012_v.nextInt(7) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*     */ 
/*     */ 
/*     */       
/* 764 */       e = findSomethingToAttack();
/* 765 */       if (e != null)
/*     */       {
/* 767 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/* 768 */           setActivity(2);
/* 769 */           do_new = 0;
/* 770 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*     */         } else {
/*     */           
/* 773 */           setActivity(2);
/* 774 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/* 775 */           do_new = 0;
/* 776 */           if (func_70068_e((Entity)e) < ((3.0F + e.field_70130_N / 2.0F) * (3.0F + e.field_70130_N / 2.0F))) {
/* 777 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 783 */     if (this.activity == 1) {
/*     */       
/* 785 */       if (this.field_70170_p.field_73012_v.nextInt(50) == 0 && OreSpawnMain.PlayNicely == 0) {
/*     */ 
/*     */ 
/*     */         
/* 789 */         this.closest = 99999;
/* 790 */         this.tx = this.ty = this.tz = 0;
/* 791 */         for (int i = 1; i < 9; i++) {
/* 792 */           int j = i;
/* 793 */           if (j > 2) j = 2; 
/* 794 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 795 */             break;  if (i >= 4) i++;
/*     */         
/*     */         } 
/* 798 */         if (this.closest < 99999) {
/*     */           
/* 800 */           func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.25D);
/* 801 */           if (this.closest < 12) {
/*     */             
/* 803 */             this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2);
/* 804 */             func_70691_i(1.0F);
/* 805 */             func_85030_a("random.burp", 0.5F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 1.5F);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 813 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/* 814 */       do_new = 1;
/*     */     }
/*     */ 
/*     */     
/* 818 */     if (do_new != 0) {
/*     */       
/* 820 */       Block bid = Blocks.field_150348_b;
/* 821 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 822 */         int gox = (int)this.field_70165_t;
/* 823 */         int goy = (int)this.field_70163_u;
/* 824 */         int goz = (int)this.field_70161_v;
/* 825 */         if (has_owner == 1) {
/* 826 */           gox = (int)ox;
/* 827 */           goy = (int)oy;
/* 828 */           goz = (int)oz;
/* 829 */           if (this.owner_flying == 0) {
/* 830 */             zdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/* 831 */             xdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/*     */           } else {
/* 833 */             zdir = this.field_70170_p.field_73012_v.nextInt(8);
/* 834 */             xdir = this.field_70170_p.field_73012_v.nextInt(8);
/*     */           } 
/*     */         } else {
/* 837 */           zdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/* 838 */           xdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/*     */         } 
/* 840 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/* 841 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir; 
/* 842 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(6 + this.owner_flying * 2) - 2, goz + zdir);
/* 843 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 844 */         if (bid == Blocks.field_150350_a && 
/* 845 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 846 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 849 */         keep_trying--;
/*     */       } 
/*     */     } 
/*     */     
/* 853 */     double speed_factor = 1.0D;
/* 854 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 855 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 856 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 857 */     if (this.owner_flying != 0) {
/* 858 */       speed_factor = 1.75D;
/* 859 */       if (func_70909_n() && func_70902_q() != null) {
/* 860 */         e = func_70902_q();
/* 861 */         if (func_70068_e((Entity)e) > 49.0D) {
/* 862 */           speed_factor = 3.5D;
/*     */         }
/*     */       } 
/*     */     } 
/* 866 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.15D * speed_factor;
/* 867 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.21D * speed_factor;
/* 868 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.15D * speed_factor;
/* 869 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 870 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 871 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*     */     
/* 873 */     this.field_70177_z += var8 / 3.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 881 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 883 */     if (par1EntityLiving == null)
/*     */     {
/* 885 */       return false;
/*     */     }
/* 887 */     if (par1EntityLiving == this)
/*     */     {
/* 889 */       return false;
/*     */     }
/* 891 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 893 */       return false;
/*     */     }
/* 895 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 898 */       return false;
/*     */     }
/*     */     
/* 901 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 903 */       return true;
/*     */     }
/*     */     
/* 906 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 908 */       return true;
/*     */     }
/*     */     
/* 911 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 916 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 917 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 6.0D, 12.0D));
/* 918 */     Collections.sort(var5, this.TargetSorter);
/* 919 */     Iterator<?> var2 = var5.iterator();
/* 920 */     Entity var3 = null;
/* 921 */     EntityLivingBase var4 = null;
/*     */     
/* 923 */     while (var2.hasNext()) {
/*     */       
/* 925 */       var3 = (Entity)var2.next();
/* 926 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 928 */       if (isSuitableTarget(var4, false) && canSeeTarget(var4.field_70165_t, var4.field_70163_u, var4.field_70161_v))
/*     */       {
/* 930 */         return var4;
/*     */       }
/*     */     } 
/* 933 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 938 */     List var5 = this.field_70170_p.func_72872_a(Stinky.class, this.field_70121_D.func_72314_b(20.0D, 10.0D, 20.0D));
/* 939 */     return var5.size();
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Stinky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */