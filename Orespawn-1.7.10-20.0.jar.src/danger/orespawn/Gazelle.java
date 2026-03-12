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
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAITempt;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class Gazelle
/*     */   extends EntityTameable
/*     */ {
/*  48 */   private float moveSpeed = 0.2F;
/*  49 */   private GenericTargetSorter TargetSorter = null;
/*     */   private int closest; private int tx; private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*     */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  53 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D); } public Gazelle(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.closest = 99999;
/* 103 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.6F, 1.8F); this.moveSpeed = 0.3F; this.field_70174_ab = 100; func_70661_as().func_75491_a(true); func_70904_g(false); this.field_70728_aV = 5; this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.7000000476837158D)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.field_151034_e, false)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 12.0F, 1.0D, 2.0D)); this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
/*     */     this.field_70714_bg.func_75776_a(8, new MyEntityAIWander((EntityCreature)this, 1.0F));
/*     */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/* 106 */     this.field_70714_bg.func_75776_a(10, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this)); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 111 */     for (i = -dy; i <= dy; i++) {
/* 112 */       for (int j = -dz; j <= dz; j++) {
/* 113 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 114 */         if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.field_150469_bN || bid == Blocks.field_150459_bM || bid == Blocks.field_150329_H || bid == Blocks.field_150398_cm) {
/* 115 */           int d = dx * dx + j * j + i * i;
/* 116 */           if (d < this.closest) {
/* 117 */             this.closest = d;
/* 118 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 119 */             found++;
/*     */           } 
/*     */         } 
/* 122 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 123 */         if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.field_150469_bN || bid == Blocks.field_150459_bM || bid == Blocks.field_150329_H || bid == Blocks.field_150398_cm) {
/* 124 */           int d = dx * dx + j * j + i * i;
/* 125 */           if (d < this.closest) {
/* 126 */             this.closest = d;
/* 127 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 128 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 134 */     for (i = -dx; i <= dx; i++) {
/* 135 */       for (int j = -dz; j <= dz; j++) {
/* 136 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 137 */         if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.field_150469_bN || bid == Blocks.field_150459_bM || bid == Blocks.field_150329_H || bid == Blocks.field_150398_cm) {
/* 138 */           int d = dy * dy + j * j + i * i;
/* 139 */           if (d < this.closest) {
/* 140 */             this.closest = d;
/* 141 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 142 */             found++;
/*     */           } 
/*     */         } 
/* 145 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 146 */         if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.field_150469_bN || bid == Blocks.field_150459_bM || bid == Blocks.field_150329_H || bid == Blocks.field_150398_cm) {
/* 147 */           int d = dy * dy + j * j + i * i;
/* 148 */           if (d < this.closest) {
/* 149 */             this.closest = d;
/* 150 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 151 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 157 */     for (i = -dx; i <= dx; i++) {
/* 158 */       for (int j = -dy; j <= dy; j++) {
/* 159 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 160 */         if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.field_150469_bN || bid == Blocks.field_150459_bM || bid == Blocks.field_150329_H || bid == Blocks.field_150398_cm) {
/* 161 */           int d = dz * dz + j * j + i * i;
/* 162 */           if (d < this.closest) {
/* 163 */             this.closest = d;
/* 164 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 165 */             found++;
/*     */           } 
/*     */         } 
/* 168 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 169 */         if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.field_150469_bN || bid == Blocks.field_150459_bM || bid == Blocks.field_150329_H || bid == Blocks.field_150398_cm) {
/* 170 */           int d = dz * dz + j * j + i * i;
/* 171 */           if (d < this.closest) {
/* 172 */             this.closest = d;
/* 173 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 174 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 180 */     if (found != 0) return true; 
/* 181 */     return false; } protected void func_70088_a() { super.func_70088_a();
/*     */     func_70904_g(false); } public void func_70071_h_() {
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*     */     super.func_70071_h_();
/*     */   }
/*     */   protected void func_70069_a(float par1) {
/* 187 */     float i = MathHelper.func_76123_f(par1 - 3.0F);
/*     */     
/* 189 */     if (i > 0.0F) {
/*     */       
/* 191 */       if (i > 3.0F) {
/*     */         
/* 193 */         func_85030_a("damage.fallbig", 1.0F, 1.0F);
/*     */       }
/*     */       else {
/*     */         
/* 197 */         func_85030_a("damage.fallsmall", 1.0F, 1.0F);
/*     */       } 
/* 199 */       if (i > 2.0F)
/*     */       {
/* 201 */         i = 2.0F;
/*     */       }
/* 203 */       func_70097_a(DamageSource.field_76379_h, i);
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
/* 215 */     if (this.field_70128_L)
/* 216 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 217 */     if (!func_70906_o()) {
/* 218 */       if ((this.field_70170_p.field_73012_v.nextInt(30) == 0 && getGazelleHealth() < mygetMaxHealth()) || this.field_70170_p.field_73012_v.nextInt(750) == 1)
/*     */       {
/*     */ 
/*     */         
/* 222 */         if (OreSpawnMain.PlayNicely == 0) {
/* 223 */           this.closest = 99999;
/* 224 */           this.tx = this.ty = this.tz = 0;
/* 225 */           for (int i = 1; i < 11; i++) {
/* 226 */             int j = i;
/* 227 */             if (j > 2) j = 2; 
/* 228 */             if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 229 */               break;  if (i >= 6) i++;
/*     */           
/*     */           } 
/* 232 */           if (this.closest < 99999) {
/*     */             
/* 234 */             func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 235 */             if (this.closest < 12) {
/*     */               
/* 237 */               if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2); 
/* 238 */               func_70691_i(1.0F);
/* 239 */               func_85030_a("random.burp", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 246 */       if (this.field_70170_p.field_73012_v.nextInt(250) == 1) {
/* 247 */         Gazelle buddy = findBuddy();
/* 248 */         if (buddy != null) {
/* 249 */           func_70661_as().func_75492_a(buddy.field_70165_t, buddy.field_70163_u, buddy.field_70161_v, 0.5D);
/*     */         }
/*     */       } 
/*     */     } 
/* 253 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 0)
/*     */     {
/* 255 */       func_70691_i(1.0F);
/*     */     }
/* 257 */     super.func_70629_bd();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Gazelle findBuddy() {
/* 263 */     List<?> var5 = this.field_70170_p.func_72872_a(Gazelle.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D));
/* 264 */     Collections.sort(var5, this.TargetSorter);
/* 265 */     Iterator<?> var2 = var5.iterator();
/* 266 */     Entity var3 = null;
/* 267 */     Gazelle var4 = null;
/*     */     
/* 269 */     if (var2.hasNext()) {
/*     */       
/* 271 */       var3 = (Entity)var2.next();
/* 272 */       var4 = (Gazelle)var3;
/* 273 */       return var4;
/*     */     } 
/* 275 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 283 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 289 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 294 */     return 15;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGazelleHealth() {
/* 301 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 309 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */ 
/*     */     
/* 312 */     if (var2 != null)
/*     */     {
/* 314 */       if (var2.field_77994_a <= 0) {
/*     */         
/* 316 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 317 */         var2 = null;
/*     */       } 
/*     */     }
/* 320 */     if (super.func_70085_c(par1EntityPlayer)) {
/* 321 */       return true;
/*     */     }
/* 323 */     if (var2 != null && var2.func_77973_b() == Items.field_151034_e && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 325 */       if (!func_70909_n()) {
/*     */         
/* 327 */         if (!this.field_70170_p.field_72995_K)
/*     */         {
/* 329 */           if (this.field_70146_Z.nextInt(2) == 0)
/*     */           {
/* 331 */             func_70903_f(true);
/* 332 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 333 */             func_70908_e(true);
/* 334 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 335 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */           
/*     */           }
/*     */           else
/*     */           {
/* 340 */             func_70908_e(false);
/* 341 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */           }
/*     */         
/*     */         }
/*     */       }
/* 346 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */         
/* 348 */         if (this.field_70170_p.field_72995_K) {
/* 349 */           func_70908_e(true);
/* 350 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*     */         } 
/*     */         
/* 353 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 354 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */         }
/*     */       } 
/*     */       
/* 358 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 360 */         var2.field_77994_a--;
/* 361 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 363 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 366 */       return true;
/*     */     } 
/* 368 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */ 
/*     */       
/* 371 */       if (!this.field_70170_p.field_72995_K) {
/*     */         
/* 373 */         func_70903_f(false);
/* 374 */         func_152115_b("");
/* 375 */         func_70908_e(false);
/* 376 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */       } 
/* 378 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 380 */         var2.field_77994_a--;
/* 381 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 383 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 386 */       return true;
/*     */     } 
/*     */     
/* 389 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 391 */       func_94058_c(var2.func_82833_r());
/* 392 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 394 */         var2.field_77994_a--;
/* 395 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 397 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 400 */       return true;
/* 401 */     }  if (func_70909_n() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 403 */       if (!func_70906_o()) {
/* 404 */         func_70904_g(true);
/*     */       } else {
/* 406 */         func_70904_g(false);
/*     */       } 
/* 408 */       return true;
/*     */     } 
/*     */     
/* 411 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 420 */     if (func_70906_o())
/*     */     {
/* 422 */       return null;
/*     */     }
/* 424 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 432 */     return "orespawn:scorpion_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 440 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 448 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 456 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 464 */     int var3 = 0;
/*     */     
/* 466 */     if (func_70909_n()) {
/*     */       
/* 468 */       var3 = this.field_70146_Z.nextInt(5);
/* 469 */       var3 += 2;
/* 470 */       for (int var4 = 0; var4 < var3; var4++)
/*     */       {
/* 472 */         func_145779_a(Item.func_150898_a((Block)Blocks.field_150328_O), 1);
/*     */       }
/*     */     } else {
/* 475 */       super.func_70628_a(par1, par2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 486 */     return func_70631_g_() ? ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.5F) : ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 495 */     boolean ret = false;
/* 496 */     float p2 = par2;
/* 497 */     if (func_70909_n() && p2 > 10.0F) p2 = 10.0F; 
/* 498 */     ret = super.func_70097_a(par1DamageSource, p2);
/* 499 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 505 */     if (this.field_70163_u < 50.0D) return false; 
/* 506 */     if (this.field_70163_u > 100.0D) return false; 
/* 507 */     Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v);
/* 508 */     if (bid != Blocks.field_150346_d && bid != Blocks.field_150349_c && bid != Blocks.field_150329_H) return false; 
/* 509 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 517 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 522 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Gazelle spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 528 */     return new Gazelle(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 536 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 545 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Gazelle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */