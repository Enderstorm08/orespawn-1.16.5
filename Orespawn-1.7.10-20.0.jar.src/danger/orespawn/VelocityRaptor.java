/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
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
/*     */ public class VelocityRaptor
/*     */   extends EntityCannonFodder
/*     */ {
/*  43 */   private float moveSpeed = 0.55F;
/*     */   private int closest; private int tx; private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*     */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  47 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(2.0D); } public VelocityRaptor(World par1World) { super(par1World);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     this.closest = 99999;
/* 128 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.5F, 0.6F); this.field_70174_ab = 10; func_70661_as().func_75491_a(true); func_70904_g(false); this.field_70728_aV = 5; this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 1.5F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(3, new MyEntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151034_e, false)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.600000023841858D)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F)); this.field_70714_bg.func_75776_a(7, new MyEntityAIWander((EntityCreature)this, 0.9F)); this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this)); }
/*     */   protected void func_70088_a() { super.func_70088_a();
/* 131 */     func_70904_g(false); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 136 */     for (i = -dy; i <= dy; i++) {
/* 137 */       for (int j = -dz; j <= dz; j++) {
/* 138 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 139 */         if (bid == Blocks.field_150329_H || bid == Blocks.field_150327_N || bid == Blocks.field_150328_O || bid == Blocks.field_150330_I || bid == Blocks.field_150398_cm) {
/* 140 */           int d = dx * dx + j * j + i * i;
/* 141 */           if (d < this.closest) {
/* 142 */             this.closest = d;
/* 143 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 144 */             found++;
/*     */           } 
/*     */         } 
/* 147 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 148 */         if (bid == Blocks.field_150329_H || bid == Blocks.field_150327_N || bid == Blocks.field_150328_O || bid == Blocks.field_150330_I || bid == Blocks.field_150398_cm) {
/* 149 */           int d = dx * dx + j * j + i * i;
/* 150 */           if (d < this.closest) {
/* 151 */             this.closest = d;
/* 152 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 153 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 159 */     for (i = -dx; i <= dx; i++) {
/* 160 */       for (int j = -dz; j <= dz; j++) {
/* 161 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 162 */         if (bid == Blocks.field_150329_H || bid == Blocks.field_150327_N || bid == Blocks.field_150328_O || bid == Blocks.field_150330_I || bid == Blocks.field_150398_cm) {
/* 163 */           int d = dy * dy + j * j + i * i;
/* 164 */           if (d < this.closest) {
/* 165 */             this.closest = d;
/* 166 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 167 */             found++;
/*     */           } 
/*     */         } 
/* 170 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 171 */         if (bid == Blocks.field_150329_H || bid == Blocks.field_150327_N || bid == Blocks.field_150328_O || bid == Blocks.field_150330_I || bid == Blocks.field_150398_cm) {
/* 172 */           int d = dy * dy + j * j + i * i;
/* 173 */           if (d < this.closest) {
/* 174 */             this.closest = d;
/* 175 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 176 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 182 */     for (i = -dx; i <= dx; i++) {
/* 183 */       for (int j = -dy; j <= dy; j++) {
/* 184 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 185 */         if (bid == Blocks.field_150329_H || bid == Blocks.field_150327_N || bid == Blocks.field_150328_O || bid == Blocks.field_150330_I || bid == Blocks.field_150398_cm) {
/* 186 */           int d = dz * dz + j * j + i * i;
/* 187 */           if (d < this.closest) {
/* 188 */             this.closest = d;
/* 189 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 190 */             found++;
/*     */           } 
/*     */         } 
/* 193 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 194 */         if (bid == Blocks.field_150329_H || bid == Blocks.field_150327_N || bid == Blocks.field_150328_O || bid == Blocks.field_150330_I || bid == Blocks.field_150398_cm) {
/* 195 */           int d = dz * dz + j * j + i * i;
/* 196 */           if (d < this.closest) {
/* 197 */             this.closest = d;
/* 198 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 199 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 205 */     if (found != 0) return true; 
/* 206 */     return false; } public boolean func_70601_bi() { if (this.field_70163_u < 50.0D)
/*     */       return false;  if (!this.field_70170_p.func_72935_r())
/*     */       return false;  return true; }
/*     */   public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); }
/*     */   protected void func_70069_a(float par1) { float i = MathHelper.func_76123_f(par1 - 3.0F); if (i > 0.0F) { if (i > 3.0F) { func_85030_a("damage.fallbig", 1.0F, 1.0F); }
/*     */       else
/*     */       { func_85030_a("damage.fallsmall", 1.0F, 1.0F); }
/*     */        if (i > 2.0F)
/*     */         i = 2.0F;  func_70097_a(DamageSource.field_76379_h, i); }
/*     */      }
/* 216 */   protected void func_70629_bd() { if (this.field_70128_L)
/* 217 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 218 */     if (!func_70906_o() && ((
/* 219 */       this.field_70170_p.field_73012_v.nextInt(20) == 0 && getVHealth() < mygetMaxHealth()) || this.field_70170_p.field_73012_v.nextInt(250) == 0))
/*     */     {
/*     */ 
/*     */       
/* 223 */       if (OreSpawnMain.PlayNicely == 0) {
/* 224 */         this.closest = 99999;
/* 225 */         this.tx = this.ty = this.tz = 0;
/* 226 */         for (int i = 1; i < 10; i++) {
/* 227 */           int j = i;
/* 228 */           if (j > 2) j = 2; 
/* 229 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 230 */             break;  if (i >= 5) i++;
/*     */         
/*     */         } 
/* 233 */         if (this.closest < 99999) {
/*     */           
/* 235 */           func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 236 */           if (this.closest < 12) {
/*     */             
/* 238 */             if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2); 
/* 239 */             func_70691_i(2.0F);
/* 240 */             func_85030_a("random.burp", 0.5F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 1.5F);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } }
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
/* 255 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 261 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 266 */     return func_70909_n() ? 20 : 10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 275 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getVHealth() {
/* 282 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 290 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */     
/* 292 */     if (var2 != null)
/*     */     {
/* 294 */       if (var2.field_77994_a <= 0) {
/*     */         
/* 296 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 297 */         var2 = null;
/*     */       } 
/*     */     }
/*     */     
/* 301 */     if (super.func_70085_c(par1EntityPlayer)) {
/* 302 */       return true;
/*     */     }
/*     */     
/* 305 */     if (var2 != null && var2.func_77973_b() == Items.field_151034_e && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 307 */       if (!func_70909_n()) {
/*     */         
/* 309 */         if (!this.field_70170_p.field_72995_K)
/*     */         {
/* 311 */           if (this.field_70146_Z.nextInt(2) == 0)
/*     */           {
/* 313 */             func_70903_f(true);
/* 314 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 315 */             func_70908_e(true);
/* 316 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 317 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */           
/*     */           }
/*     */           else
/*     */           {
/* 322 */             func_70908_e(false);
/* 323 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */           }
/*     */         
/*     */         }
/*     */       }
/* 328 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */         
/* 330 */         if (this.field_70170_p.field_72995_K) {
/* 331 */           func_70908_e(true);
/* 332 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*     */           
/* 334 */           par1EntityPlayer.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.6000000238418579D);
/*     */         } 
/*     */         
/* 337 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 338 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 343 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 345 */         var2.field_77994_a--;
/* 346 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 348 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 351 */       return true;
/*     */     } 
/* 353 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */ 
/*     */       
/* 356 */       if (!this.field_70170_p.field_72995_K) {
/*     */         
/* 358 */         func_70903_f(false);
/* 359 */         func_70606_j(mygetMaxHealth());
/* 360 */         func_152115_b("");
/* 361 */         func_70908_e(false);
/* 362 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */       } else {
/*     */         
/* 365 */         par1EntityPlayer.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.30000001192092896D);
/*     */       } 
/* 367 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 369 */         var2.field_77994_a--;
/* 370 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 372 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 375 */       return true;
/*     */     } 
/* 377 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 379 */       func_94058_c(var2.func_82833_r());
/* 380 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 382 */         var2.field_77994_a--;
/* 383 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 385 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 388 */       return true;
/* 389 */     }  if (func_70909_n() && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 391 */       if (!func_70906_o()) {
/* 392 */         func_70904_g(true);
/*     */       } else {
/* 394 */         func_70904_g(false);
/*     */       } 
/*     */       
/* 397 */       if (this.field_70170_p.field_72995_K)
/*     */       {
/*     */         
/* 400 */         par1EntityPlayer.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.30000001192092896D);
/*     */       }
/* 402 */       return true;
/*     */     } 
/*     */     
/* 405 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 414 */     if (func_70906_o())
/*     */     {
/* 416 */       return null;
/*     */     }
/* 418 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 426 */     return "orespawn:cryo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 434 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 442 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 450 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 458 */     int var3 = 0;
/*     */     
/* 460 */     if (func_70909_n()) {
/*     */       
/* 462 */       var3 = this.field_70146_Z.nextInt(5);
/* 463 */       var3 += 2;
/* 464 */       for (int var4 = 0; var4 < var3; var4++)
/*     */       {
/* 466 */         func_145779_a(Item.func_150898_a((Block)Blocks.field_150328_O), 1);
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
/*     */   protected float func_70647_i() {
/* 478 */     return func_70631_g_() ? ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.5F) : ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 487 */     boolean ret = false;
/* 488 */     float p2 = par2;
/* 489 */     if (p2 > 10.0F) p2 = 10.0F; 
/* 490 */     ret = super.func_70097_a(par1DamageSource, p2);
/* 491 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 500 */     if (func_70631_g_()) {
/* 501 */       func_110163_bv();
/* 502 */       return false;
/*     */     } 
/* 504 */     if (func_70909_n()) return false; 
/* 505 */     if (func_104002_bU()) return false; 
/* 506 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 511 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VelocityRaptor spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 517 */     return new VelocityRaptor(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 525 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 534 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\VelocityRaptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */