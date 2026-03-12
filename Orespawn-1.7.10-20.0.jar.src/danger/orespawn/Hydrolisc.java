/*     */ package danger.orespawn;
/*     */ 
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
/*     */ public class Hydrolisc
/*     */   extends EntityTameable
/*     */ {
/*  45 */   private float moveSpeed = 0.25F;
/*     */   private int closest; private int tx; private int ty; private int tz; protected void func_70088_a() {
/*     */     super.func_70088_a();
/*     */     func_70904_g(false);
/*  49 */   } public Hydrolisc(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     this.closest = 99999;
/*  94 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.5F, 0.5F); this.field_70174_ab = 100; func_70661_as().func_75491_a(false); func_70904_g(false); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D)); this.field_70714_bg.func_75776_a(3, new MyEntityAIFollowOwner(this, 1.2F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151115_aP, false)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F)); this.field_70714_bg.func_75776_a(7, new MyEntityAIWander((EntityCreature)this, 1.0F));
/*     */     this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*  97 */     this.field_70728_aV = 5; } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 102 */     for (i = -dy; i <= dy; i++) {
/* 103 */       for (int j = -dz; j <= dz; j++) {
/* 104 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 105 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 106 */           int d = dx * dx + j * j + i * i;
/* 107 */           if (d < this.closest) {
/* 108 */             this.closest = d;
/* 109 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 110 */             found++;
/*     */           } 
/*     */         } 
/* 113 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 114 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 115 */           int d = dx * dx + j * j + i * i;
/* 116 */           if (d < this.closest) {
/* 117 */             this.closest = d;
/* 118 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 119 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 125 */     for (i = -dx; i <= dx; i++) {
/* 126 */       for (int j = -dz; j <= dz; j++) {
/* 127 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 128 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 129 */           int d = dy * dy + j * j + i * i;
/* 130 */           if (d < this.closest) {
/* 131 */             this.closest = d;
/* 132 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 133 */             found++;
/*     */           } 
/*     */         } 
/* 136 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 137 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 138 */           int d = dy * dy + j * j + i * i;
/* 139 */           if (d < this.closest) {
/* 140 */             this.closest = d;
/* 141 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 142 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 148 */     for (i = -dx; i <= dx; i++) {
/* 149 */       for (int j = -dy; j <= dy; j++) {
/* 150 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 151 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 152 */           int d = dz * dz + j * j + i * i;
/* 153 */           if (d < this.closest) {
/* 154 */             this.closest = d;
/* 155 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 156 */             found++;
/*     */           } 
/*     */         } 
/* 159 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 160 */         if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i) {
/* 161 */           int d = dz * dz + j * j + i * i;
/* 162 */           if (d < this.closest) {
/* 163 */             this.closest = d;
/* 164 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 165 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 171 */     if (found != 0) return true; 
/* 172 */     return false; } protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*     */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*     */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D); }
/*     */   public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*     */     super.func_70071_h_(); }
/* 178 */   protected void func_70069_a(float par1) { float i = MathHelper.func_76123_f(par1 - 3.0F);
/*     */     
/* 180 */     if (i > 0.0F) {
/*     */       
/* 182 */       if (i > 3.0F) {
/*     */         
/* 184 */         func_85030_a("damage.fallbig", 1.0F, 1.0F);
/*     */       }
/*     */       else {
/*     */         
/* 188 */         func_85030_a("damage.fallsmall", 1.0F, 1.0F);
/*     */       } 
/* 190 */       if (i > 2.0F)
/*     */       {
/* 192 */         i = 2.0F;
/*     */       }
/* 194 */       func_70097_a(DamageSource.field_76379_h, i);
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 204 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70629_bd() {
/* 214 */     if (this.field_70128_L)
/* 215 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 216 */     if (!func_70906_o())
/*     */     {
/* 218 */       if ((this.field_70170_p.field_73012_v.nextInt(20) == 0 && getHydroHealth() < func_110138_aP()) || this.field_70170_p.field_73012_v.nextInt(100) == 0) {
/*     */ 
/*     */ 
/*     */         
/* 222 */         this.closest = 99999;
/* 223 */         this.tx = this.ty = this.tz = 0;
/* 224 */         for (int i = 1; i < 11; i++) {
/* 225 */           int j = i;
/* 226 */           if (j > 4) j = 4; 
/* 227 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/* 228 */             break;  if (i >= 5) i++;
/*     */         
/*     */         } 
/* 231 */         if (this.closest < 99999) {
/* 232 */           func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.0D);
/* 233 */           if (func_70090_H()) {
/* 234 */             func_70691_i(1.0F);
/* 235 */             func_85030_a("splash", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 242 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 0 && 
/* 243 */       func_70909_n()) {
/* 244 */       EntityLivingBase e = func_70902_q();
/* 245 */       if (e != null && 
/* 246 */         e.func_110143_aJ() < e.func_110138_aP() && 
/* 247 */         getHydroHealth() > 20) {
/*     */         
/* 249 */         e.func_70691_i(1.0F);
/* 250 */         func_70691_i(-1.0F);
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
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 265 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 271 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 276 */     return 100;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 286 */     super.func_70636_d();
/*     */     
/* 288 */     if (func_70090_H()) {
/* 289 */       this.field_70181_x += 0.04D;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHydroHealth() {
/* 298 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 306 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */ 
/*     */     
/* 309 */     if (var2 != null)
/*     */     {
/* 311 */       if (var2.field_77994_a <= 0) {
/*     */         
/* 313 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 314 */         var2 = null;
/*     */       } 
/*     */     }
/*     */     
/* 318 */     if (super.func_70085_c(par1EntityPlayer)) {
/* 319 */       return true;
/*     */     }
/*     */     
/* 322 */     if (var2 != null && var2.func_77973_b() == Items.field_151115_aP && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 324 */       if (!func_70909_n()) {
/*     */         
/* 326 */         if (!this.field_70170_p.field_72995_K)
/*     */         {
/* 328 */           if (this.field_70146_Z.nextInt(2) == 0)
/*     */           {
/* 330 */             func_70903_f(true);
/* 331 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 332 */             func_70908_e(true);
/* 333 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 334 */             func_70691_i(func_110138_aP() - func_110143_aJ());
/*     */           
/*     */           }
/*     */           else
/*     */           {
/* 339 */             func_70908_e(false);
/* 340 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */           }
/*     */         
/*     */         }
/*     */       }
/* 345 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */         
/* 347 */         if (this.field_70170_p.field_72995_K) {
/* 348 */           func_70908_e(true);
/* 349 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*     */         } 
/*     */         
/* 352 */         if (func_110138_aP() > func_110143_aJ()) {
/* 353 */           func_70691_i(func_110138_aP() - func_110143_aJ());
/*     */         }
/*     */       } 
/*     */       
/* 357 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 359 */         var2.field_77994_a--;
/* 360 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 362 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 365 */       return true;
/* 366 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */ 
/*     */       
/* 369 */       if (!this.field_70170_p.field_72995_K) {
/*     */         
/* 371 */         func_70903_f(false);
/* 372 */         func_152115_b("");
/* 373 */         func_70908_e(false);
/* 374 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */       } 
/* 376 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 378 */         var2.field_77994_a--;
/* 379 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 381 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 384 */       return true;
/*     */     } 
/* 386 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 388 */       func_94058_c(var2.func_82833_r());
/* 389 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 391 */         var2.field_77994_a--;
/* 392 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 394 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 397 */       return true;
/* 398 */     }  if (func_70909_n() && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 400 */       if (!func_70906_o()) {
/* 401 */         func_70904_g(true);
/*     */       } else {
/* 403 */         func_70904_g(false);
/*     */       } 
/* 405 */       return true;
/*     */     } 
/*     */     
/* 408 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 416 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151115_aP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 429 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 437 */     return "orespawn:cryo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 445 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 453 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 461 */     return Items.field_151115_aP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 469 */     int var3 = 0;
/*     */     
/* 471 */     if (func_70909_n()) {
/*     */       
/* 473 */       var3 = this.field_70146_Z.nextInt(5);
/* 474 */       var3 += 2;
/* 475 */       for (int var4 = 0; var4 < var3; var4++)
/*     */       {
/* 477 */         func_145779_a(Items.field_151115_aP, 1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 488 */     return func_70631_g_() ? ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.5F) : ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 497 */     boolean ret = false;
/* 498 */     float p2 = par2;
/* 499 */     if (p2 > 10.0F) p2 = 10.0F; 
/* 500 */     ret = super.func_70097_a(par1DamageSource, p2);
/* 501 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 510 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 515 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Hydrolisc spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 521 */     return new Hydrolisc(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 531 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Hydrolisc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */