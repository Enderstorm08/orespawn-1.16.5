/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAITempt;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class Whale
/*     */   extends EntityAnimal
/*     */ {
/*  47 */   private float moveSpeed = 0.35F;
/*  48 */   private int spray = 0;
/*  49 */   private int spray_timer = 0;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty;
/*  53 */   private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D); } protected void func_70088_a() { super.func_70088_a(); } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); if (this.spray == 0) { if (this.spray_timer > 0) this.spray_timer--;  if (this.spray_timer == 0) { this.spray_timer = 250 + this.field_70170_p.field_73012_v.nextInt(250); this.spray = 25 + this.field_70170_p.field_73012_v.nextInt(25); }  }  if (this.field_70170_p.field_72995_K && this.spray > 0) { for (int i = 0; i < 20; i++) { double d = this.field_70170_p.field_73012_v.nextDouble() * 0.75D; d *= d; double dir = this.field_70170_p.field_73012_v.nextDouble() * 2.0D * Math.PI; dir -= Math.PI; double dx = Math.cos(dir) * d / 2.0D; double dz = Math.sin(dir) * d / 2.0D; dir += 1.5707963267948966D; if (i < 10) { this.field_70170_p.func_72869_a("bubble", this.field_70165_t + dx, this.field_70163_u + 1.0D + d, this.field_70161_v + dz, Math.cos(dir) * this.field_70170_p.field_73012_v.nextFloat() / 4.0D, (this.field_70170_p.field_73012_v.nextFloat() * 2.0F), Math.sin(dir) * this.field_70170_p.field_73012_v.nextFloat() / 4.0D); } else { this.field_70170_p.func_72869_a("splash", this.field_70165_t + dx, this.field_70163_u + 1.0D + d, this.field_70161_v + dz, Math.cos(dir) * this.field_70170_p.field_73012_v.nextFloat() / 4.0D, (this.field_70170_p.field_73012_v.nextFloat() * 2.0F), Math.sin(dir) * this.field_70170_p.field_73012_v.nextFloat() / 4.0D); }  }  this.spray--; }  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70691_i(1.0F);  } public boolean func_70650_aV() { return true; } public Whale(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     this.closest = 99999;
/* 215 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(1.5F, 2.5F); this.moveSpeed = 0.35F; this.field_70174_ab = 100; this.field_70728_aV = 40; func_70661_as().func_75491_a(false); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate(this, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.field_151115_aP, false)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 12.0F)); this.field_70714_bg.func_75776_a(6, new MyEntityAIWander((EntityCreature)this, 1.0F)); this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); }
/*     */   public boolean func_70648_aU() { return true; }
/*     */   public int mygetMaxHealth() { return 100; }
/* 218 */   protected String func_70639_aQ() { return "splash"; } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 223 */     for (i = -dy; i <= dy; i++) {
/* 224 */       for (int j = -dz; j <= dz; j++) {
/* 225 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 226 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 227 */           int d = dx * dx + j * j + i * i;
/* 228 */           if (d < this.closest) {
/* 229 */             this.closest = d;
/* 230 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 231 */             found++;
/*     */           } 
/*     */         } 
/* 234 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 235 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 236 */           int d = dx * dx + j * j + i * i;
/* 237 */           if (d < this.closest) {
/* 238 */             this.closest = d;
/* 239 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 240 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 246 */     for (i = -dx; i <= dx; i++) {
/* 247 */       for (int j = -dz; j <= dz; j++) {
/* 248 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 249 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 250 */           int d = dy * dy + j * j + i * i;
/* 251 */           if (d < this.closest) {
/* 252 */             this.closest = d;
/* 253 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 254 */             found++;
/*     */           } 
/*     */         } 
/* 257 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 258 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 259 */           int d = dy * dy + j * j + i * i;
/* 260 */           if (d < this.closest) {
/* 261 */             this.closest = d;
/* 262 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 263 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 269 */     for (i = -dx; i <= dx; i++) {
/* 270 */       for (int j = -dy; j <= dy; j++) {
/* 271 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 272 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 273 */           int d = dz * dz + j * j + i * i;
/* 274 */           if (d < this.closest) {
/* 275 */             this.closest = d;
/* 276 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 277 */             found++;
/*     */           } 
/*     */         } 
/* 280 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 281 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 282 */           int d = dz * dz + j * j + i * i;
/* 283 */           if (d < this.closest) {
/* 284 */             this.closest = d;
/* 285 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 286 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 292 */     if (found != 0) return true; 
/* 293 */     return false; } protected String func_70621_aR() { return "orespawn:little_splat"; }
/*     */   protected String func_70673_aS() { return "orespawn:big_splat"; }
/*     */   protected float func_70599_aP() { return 0.9F; }
/*     */   protected float func_70647_i() { return 0.5F; }
/*     */   protected Item func_146068_u() { return Items.field_151115_aP; }
/*     */   private void dropItemRand(Item index, int par1) { EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0)); this.field_70170_p.func_72838_d((Entity)var3); }
/*     */   protected void func_70628_a(boolean par1, int par2) { int var3 = 0;
/*     */     var3 = this.field_70146_Z.nextInt(25);
/*     */     var3 += 20;
/*     */     for (int var4 = 0; var4 < var3; var4++)
/*     */       dropItemRand(Items.field_151115_aP, 1);  }
/* 304 */   protected void func_70629_bd() { if (this.field_70128_L)
/* 305 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null);
/*     */ 
/*     */     
/* 308 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(20) == 0) {
/*     */ 
/*     */ 
/*     */       
/* 312 */       this.closest = 99999;
/* 313 */       this.tx = this.ty = this.tz = 0;
/* 314 */       for (int i = 1; i < 11; i++) {
/* 315 */         int j = i;
/* 316 */         if (j > 4) j = 4; 
/* 317 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 318 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 321 */       if (this.closest < 99999) {
/* 322 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.0D);
/*     */       } else {
/*     */         
/* 325 */         if (this.field_70170_p.field_73012_v.nextInt(25) == 1)
/* 326 */           func_70691_i(-4.0F); 
/* 327 */         if (func_110143_aJ() <= 0.0F) {
/* 328 */           func_70106_y();
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/* 333 */     if (func_70090_H() && this.field_70170_p.field_73012_v.nextInt(50) == 0) {
/* 334 */       func_85030_a("splash", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/* 335 */       func_70691_i(1.0F);
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 342 */     List var5 = this.field_70170_p.func_72872_a(Whale.class, this.field_70121_D.func_72314_b(32.0D, 8.0D, 32.0D));
/* 343 */     return var5.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 351 */     if (this.field_70163_u < 50.0D) return false; 
/* 352 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 353 */     if (this.field_70170_p.field_73012_v.nextInt(50) != 1) return false; 
/* 354 */     if (findBuddies() > 0) return false; 
/* 355 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 363 */     if (func_70631_g_()) {
/* 364 */       func_110163_bv();
/* 365 */       return false;
/*     */     } 
/* 367 */     if (func_104002_bU()) return false; 
/* 368 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 373 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Whale spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 379 */     return new Whale(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 387 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151115_aP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 396 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Whale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */