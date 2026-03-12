/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.List;
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
/*     */ 
/*     */ public class Flounder
/*     */   extends EntityAnimal
/*     */ {
/*  46 */   private float moveSpeed = 0.25F;
/*     */   private int closest;
/*     */   private int tx;
/*     */   private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth()); func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e); func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D); } protected void func_70088_a() { super.func_70088_a(); } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  50 */     super.func_70071_h_(); } public Flounder(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     this.closest = 99999;
/* 164 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.55F, 0.25F); this.moveSpeed = 0.25F; this.field_70174_ab = 15; this.field_70728_aV = 5; func_70661_as().func_75491_a(false); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate(this, 1.0D)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 8.0F, 1.0D, 1.399999976158142D)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 12.0F)); this.field_70714_bg.func_75776_a(6, new MyEntityAIWander((EntityCreature)this, 1.0F)); this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); }
/*     */   public boolean func_70650_aV() { return true; }
/*     */   public boolean func_70648_aU() { return true; }
/* 167 */   public int mygetMaxHealth() { return 5; } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 172 */     for (i = -dy; i <= dy; i++) {
/* 173 */       for (int j = -dz; j <= dz; j++) {
/* 174 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 175 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 176 */           int d = dx * dx + j * j + i * i;
/* 177 */           if (d < this.closest) {
/* 178 */             this.closest = d;
/* 179 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 180 */             found++;
/*     */           } 
/*     */         } 
/* 183 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 184 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 185 */           int d = dx * dx + j * j + i * i;
/* 186 */           if (d < this.closest) {
/* 187 */             this.closest = d;
/* 188 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 189 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 195 */     for (i = -dx; i <= dx; i++) {
/* 196 */       for (int j = -dz; j <= dz; j++) {
/* 197 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 198 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 199 */           int d = dy * dy + j * j + i * i;
/* 200 */           if (d < this.closest) {
/* 201 */             this.closest = d;
/* 202 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 203 */             found++;
/*     */           } 
/*     */         } 
/* 206 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 207 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 208 */           int d = dy * dy + j * j + i * i;
/* 209 */           if (d < this.closest) {
/* 210 */             this.closest = d;
/* 211 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 212 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 218 */     for (i = -dx; i <= dx; i++) {
/* 219 */       for (int j = -dy; j <= dy; j++) {
/* 220 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 221 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 222 */           int d = dz * dz + j * j + i * i;
/* 223 */           if (d < this.closest) {
/* 224 */             this.closest = d;
/* 225 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 226 */             found++;
/*     */           } 
/*     */         } 
/* 229 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 230 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 231 */           int d = dz * dz + j * j + i * i;
/* 232 */           if (d < this.closest) {
/* 233 */             this.closest = d;
/* 234 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 235 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 241 */     if (found != 0) return true; 
/* 242 */     return false; } protected String func_70639_aQ() { return "splash"; }
/*     */   protected String func_70621_aR() { return "little_splat"; }
/*     */   protected String func_70673_aS() { return "orespawn:ratdead"; }
/*     */   protected float func_70599_aP() { return 0.4F; }
/*     */   protected Item func_146068_u() { return Items.field_151115_aP; }
/*     */   protected void func_70628_a(boolean par1, int par2) { int var3 = 0;
/*     */     var3 = this.field_70146_Z.nextInt(2);
/*     */     var3++;
/*     */     for (int var4 = 0; var4 < var3; var4++)
/*     */       func_145779_a(Items.field_151115_aP, 1);  }
/*     */   protected void func_70629_bd() {
/* 253 */     if (this.field_70128_L)
/* 254 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null);
/*     */ 
/*     */     
/* 257 */     if (!func_70090_H() && this.field_70170_p.field_73012_v.nextInt(20) == 0) {
/*     */ 
/*     */ 
/*     */       
/* 261 */       this.closest = 99999;
/* 262 */       this.tx = this.ty = this.tz = 0;
/* 263 */       for (int i = 1; i < 11; i++) {
/* 264 */         int j = i;
/* 265 */         if (j > 4) j = 4; 
/* 266 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 267 */           break;  if (i >= 5) i++;
/*     */       
/*     */       } 
/* 270 */       if (this.closest < 99999) {
/* 271 */         func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.0D);
/*     */       } else {
/* 273 */         if (this.field_70170_p.field_73012_v.nextInt(25) == 1)
/* 274 */           func_70691_i(-1.0F); 
/* 275 */         if (func_110143_aJ() <= 0.0F) {
/* 276 */           func_70106_y();
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/* 281 */     if (func_70090_H() && this.field_70170_p.field_73012_v.nextInt(50) == 0) {
/* 282 */       func_85030_a("splash", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/* 283 */       func_70691_i(1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 290 */     List var5 = this.field_70170_p.func_72872_a(Flounder.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D));
/* 291 */     return var5.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 299 */     if (this.field_70163_u < 50.0D) return false; 
/* 300 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 301 */     if (this.field_70170_p.field_73012_v.nextInt(20) != 1) return false; 
/* 302 */     if (findBuddies() > 10) return false; 
/* 303 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 311 */     if (func_70631_g_()) {
/* 312 */       func_110163_bv();
/* 313 */       return false;
/*     */     } 
/* 315 */     if (func_104002_bU()) return false; 
/* 316 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 321 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Flounder spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 327 */     return new Flounder(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 335 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151115_aP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 344 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Flounder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */