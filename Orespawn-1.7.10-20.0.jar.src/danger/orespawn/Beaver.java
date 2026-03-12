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
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.item.EntityItem;
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
/*     */ 
/*     */ public class Beaver
/*     */   extends EntityAnimal
/*     */ {
/*  50 */   private float moveSpeed = 0.15F;
/*  51 */   private GenericTargetSorter TargetSorter = null;
/*     */   private int closest; private int tx; private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*     */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  55 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D); } public Beaver(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     this.closest = 99999;
/* 109 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.6F, 0.8F); this.moveSpeed = 0.2F; this.field_70174_ab = 100; func_70661_as().func_75491_a(false); this.field_70728_aV = 5; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate(this, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.5D)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 8.0F, 1.0D, 1.5D)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
/*     */     this.field_70714_bg.func_75776_a(7, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*     */     this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); }
/* 112 */   protected void func_70088_a() { super.func_70088_a(); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 117 */     for (i = -dy; i <= dy; i++) {
/* 118 */       for (int j = -dz; j <= dz; j++) {
/* 119 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 120 */         if (isWood(bid)) {
/* 121 */           int d = dx * dx + j * j + i * i;
/* 122 */           if (d < this.closest) {
/* 123 */             this.closest = d;
/* 124 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 125 */             found++;
/*     */           } 
/*     */         } 
/* 128 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 129 */         if (isWood(bid)) {
/* 130 */           int d = dx * dx + j * j + i * i;
/* 131 */           if (d < this.closest) {
/* 132 */             this.closest = d;
/* 133 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 134 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 140 */     for (i = -dx; i <= dx; i++) {
/* 141 */       for (int j = -dz; j <= dz; j++) {
/* 142 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 143 */         if (isWood(bid)) {
/* 144 */           int d = dy * dy + j * j + i * i;
/* 145 */           if (d < this.closest) {
/* 146 */             this.closest = d;
/* 147 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 148 */             found++;
/*     */           } 
/*     */         } 
/* 151 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 152 */         if (isWood(bid)) {
/* 153 */           int d = dy * dy + j * j + i * i;
/* 154 */           if (d < this.closest) {
/* 155 */             this.closest = d;
/* 156 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 157 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 163 */     for (i = -dx; i <= dx; i++) {
/* 164 */       for (int j = -dy; j <= dy; j++) {
/* 165 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 166 */         if (isWood(bid)) {
/* 167 */           int d = dz * dz + j * j + i * i;
/* 168 */           if (d < this.closest) {
/* 169 */             this.closest = d;
/* 170 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 171 */             found++;
/*     */           } 
/*     */         } 
/* 174 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 175 */         if (isWood(bid)) {
/* 176 */           int d = dz * dz + j * j + i * i;
/* 177 */           if (d < this.closest) {
/* 178 */             this.closest = d;
/* 179 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 180 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 186 */     if (found != 0) return true; 
/* 187 */     return false; } public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); }
/*     */   public boolean isWood(Block bid) { if (bid == Blocks.field_150364_r || bid == OreSpawnMain.MyDT || bid == OreSpawnMain.MySkyTreeLog)
/*     */       return true;  if (bid == Blocks.field_150422_aJ || bid == Blocks.field_150396_be || bid == Blocks.field_150472_an)
/*     */       return true; 
/*     */     return false; }
/* 192 */   private ItemStack dropItemRand(Item index, int par1) { EntityItem var3 = null;
/* 193 */     ItemStack is = new ItemStack(index, par1, 0);
/* 194 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 4.0D + this.field_70170_p.field_73012_v.nextInt(4), this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), is);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 200 */     return is; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void breakRecursor(World world, int x, int y, int z, int xf, int yf, int zf, int recursion) {
/* 208 */     int var7 = 1;
/*     */     
/* 210 */     if (recursion > 200)
/*     */       return; 
/* 212 */     for (int var9 = -var7; var9 <= var7; var9++) {
/*     */       
/* 214 */       for (int var10 = -var7; var10 <= var7; var10++) {
/*     */         
/* 216 */         for (int var11 = -var7; var11 <= var7; var11++) {
/*     */ 
/*     */           
/* 219 */           if ((var9 != 0 || var10 != 0 || var11 != 0) && (
/* 220 */             x + var9 != xf || y + var10 != yf || z + var11 != zf) && (
/* 221 */             recursion <= 0 || x + var9 < xf - var7 || x + var9 > xf + var7 || y + var10 < yf - var7 || y + var10 > yf + var7 || z + var11 < zf - var7 || z + var11 > zf + var7)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 227 */             Block var12 = world.func_147439_a(x + var9, y + var10, z + var11);
/* 228 */             if (isWood(var12)) {
/*     */               
/* 230 */               world.func_147465_d(x + var9, y + var10, z + var11, Blocks.field_150350_a, 0, 2);
/* 231 */               dropItemRand(Item.func_150898_a(var12), 1);
/* 232 */               breakRecursor(world, x + var9, y + var10, z + var11, x, y, z, recursion + 1);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70629_bd() {
/* 248 */     if (this.field_70128_L)
/* 249 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 250 */     if ((this.field_70170_p.field_73012_v.nextInt(30) == 0 && getBeaverHealth() < mygetMaxHealth()) || this.field_70170_p.field_73012_v.nextInt(350) == 1)
/*     */     {
/* 252 */       if (OreSpawnMain.PlayNicely == 0) {
/*     */ 
/*     */         
/* 255 */         this.closest = 99999;
/* 256 */         this.tx = this.ty = this.tz = 0; int i;
/* 257 */         for (i = 1; i < 11; i++) {
/* 258 */           int j = i;
/* 259 */           if (j > 2) j = 2; 
/* 260 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 261 */             break;  if (i >= 6) i++; 
/*     */         } 
/* 263 */         i = 0;
/* 264 */         if (this.closest < 99999) {
/*     */           
/* 266 */           func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 267 */           if (this.closest < 12) {
/*     */             
/* 269 */             if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) {
/* 270 */               this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2);
/* 271 */               breakRecursor(this.field_70170_p, this.tx, this.ty, this.tz, this.tx, this.ty, this.tz, i);
/*     */             } 
/* 273 */             func_70691_i(1.0F);
/* 274 */             func_85030_a("orespawn:chainsaw", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 281 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) {
/* 282 */       Beaver buddy = findBuddy();
/* 283 */       if (buddy != null) {
/* 284 */         func_70661_as().func_75492_a(buddy.field_70165_t, buddy.field_70163_u, buddy.field_70161_v, 0.5D);
/*     */       }
/*     */     } 
/*     */     
/* 288 */     super.func_70629_bd();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Beaver findBuddy() {
/* 294 */     List<?> var5 = this.field_70170_p.func_72872_a(Beaver.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D));
/* 295 */     Collections.sort(var5, this.TargetSorter);
/* 296 */     Iterator<?> var2 = var5.iterator();
/* 297 */     Entity var3 = null;
/* 298 */     Beaver var4 = null;
/*     */     
/* 300 */     if (var2.hasNext()) {
/*     */       
/* 302 */       var3 = (Entity)var2.next();
/* 303 */       var4 = (Beaver)var3;
/* 304 */       return var4;
/*     */     } 
/* 306 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 314 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 319 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 324 */     return 15;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBeaverHealth() {
/* 331 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 341 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 349 */     return "orespawn:scorpion_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 357 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 365 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 373 */     return Items.field_151147_al;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 383 */     return func_70631_g_() ? ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.5F) : ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 390 */     if (this.field_70163_u < 50.0D) return false; 
/* 391 */     if (this.field_70163_u > 100.0D) return false; 
/* 392 */     Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v);
/* 393 */     if (bid != Blocks.field_150346_d && bid != Blocks.field_150349_c && bid != Blocks.field_150329_H && bid != Blocks.field_150362_t) return false; 
/* 394 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 402 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 407 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Beaver spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 413 */     return new Beaver(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 421 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 430 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Beaver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */