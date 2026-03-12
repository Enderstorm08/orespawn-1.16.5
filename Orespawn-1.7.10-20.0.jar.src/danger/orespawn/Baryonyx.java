/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
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
/*     */ public class Baryonyx
/*     */   extends EntityAnimal
/*     */ {
/*  44 */   private float moveSpeed = 0.25F;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(8.0D); } protected void func_70088_a() { super.func_70088_a(); } public boolean func_70601_bi() { if (this.field_70163_u < 50.0D) return false;  if (!this.field_70170_p.func_72935_r())
/*  48 */       return false;  return true; } public Baryonyx(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     this.closest = 99999;
/* 177 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(1.5F, 2.8F); this.moveSpeed = 0.25F; this.field_70174_ab = 100; this.field_70728_aV = 5; func_70661_as().func_75491_a(true); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate(this, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 12.0F)); this.field_70714_bg.func_75776_a(6, new MyEntityAIWander((EntityCreature)this, 1.0F)); this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); }
/*     */   public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); }
/*     */   public boolean func_70650_aV() { return true; }
/* 180 */   public boolean func_70648_aU() { return false; } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 185 */     for (i = -dy; i <= dy; i++) {
/* 186 */       for (int j = -dz; j <= dz; j++) {
/* 187 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 188 */         if (bid == Blocks.field_150349_c) {
/* 189 */           int d = dx * dx + j * j + i * i;
/* 190 */           if (d < this.closest) {
/* 191 */             this.closest = d;
/* 192 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 193 */             found++;
/*     */           } 
/*     */         } 
/* 196 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 197 */         if (bid == Blocks.field_150349_c) {
/* 198 */           int d = dx * dx + j * j + i * i;
/* 199 */           if (d < this.closest) {
/* 200 */             this.closest = d;
/* 201 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 202 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 208 */     for (i = -dx; i <= dx; i++) {
/* 209 */       for (int j = -dz; j <= dz; j++) {
/* 210 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 211 */         if (bid == Blocks.field_150349_c) {
/* 212 */           int d = dy * dy + j * j + i * i;
/* 213 */           if (d < this.closest) {
/* 214 */             this.closest = d;
/* 215 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 216 */             found++;
/*     */           } 
/*     */         } 
/* 219 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 220 */         if (bid == Blocks.field_150349_c) {
/* 221 */           int d = dy * dy + j * j + i * i;
/* 222 */           if (d < this.closest) {
/* 223 */             this.closest = d;
/* 224 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 225 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 231 */     for (i = -dx; i <= dx; i++) {
/* 232 */       for (int j = -dy; j <= dy; j++) {
/* 233 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 234 */         if (bid == Blocks.field_150349_c) {
/* 235 */           int d = dz * dz + j * j + i * i;
/* 236 */           if (d < this.closest) {
/* 237 */             this.closest = d;
/* 238 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 239 */             found++;
/*     */           } 
/*     */         } 
/* 242 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 243 */         if (bid == Blocks.field_150349_c) {
/* 244 */           int d = dz * dz + j * j + i * i;
/* 245 */           if (d < this.closest) {
/* 246 */             this.closest = d;
/* 247 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 248 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 254 */     if (found != 0) return true; 
/* 255 */     return false; } public int mygetMaxHealth() { return 40; }
/*     */   protected String func_70639_aQ() { return null; }
/*     */   protected String func_70621_aR() { return "orespawn:duck_hurt"; }
/*     */   protected String func_70673_aS() { return "orespawn:duck_hurt"; }
/*     */   protected float func_70599_aP() { return 0.4F; }
/*     */   protected Item func_146068_u() { return Items.field_151082_bd; }
/*     */   protected void func_70628_a(boolean par1, int par2) { int var3 = 0;
/*     */     var3 = this.field_70146_Z.nextInt(5);
/*     */     var3 += 2;
/*     */     for (int var4 = 0; var4 < var3; var4++)
/*     */       func_145779_a(Items.field_151082_bd, 1);  }
/* 266 */   protected void func_70629_bd() { if (this.field_70128_L)
/* 267 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null);
/*     */     
/* 269 */     if (this.field_70170_p.field_73012_v.nextInt(60) == 0 && OreSpawnMain.PlayNicely == 0) {
/*     */ 
/*     */ 
/*     */       
/* 273 */       this.closest = 99999;
/* 274 */       this.tx = this.ty = this.tz = 0;
/* 275 */       for (int i = 1; i < 11; i++) {
/* 276 */         int j = i;
/* 277 */         if (j > 2) j = 2; 
/* 278 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 279 */           break;  if (i >= 6) i++;
/*     */       
/*     */       } 
/* 282 */       if (this.closest < 99999) {
/*     */         
/* 284 */         func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 285 */         if (this.closest < 12) {
/*     */           
/* 287 */           if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150346_d, 0, 2); 
/* 288 */           func_70691_i(1.0F);
/* 289 */           func_85030_a("random.burp", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */         } 
/*     */       } 
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 302 */     if (func_70631_g_()) {
/* 303 */       func_110163_bv();
/* 304 */       return false;
/*     */     } 
/* 306 */     if (func_104002_bU()) return false; 
/* 307 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 312 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Baryonyx spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 318 */     return new Baryonyx(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 326 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 335 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Baryonyx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */