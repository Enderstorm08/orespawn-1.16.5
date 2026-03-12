/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.item.EntityXPOrb;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntityFishHook;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemFishFood;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.stats.StatList;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.util.WeightedRandom;
/*     */ import net.minecraft.util.WeightedRandomFishable;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.WorldServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UltimateFishHook
/*     */   extends EntityFishHook
/*     */ {
/*  40 */   private static final List field_146039_d = Arrays.asList(new WeightedRandomFishable[] { (new WeightedRandomFishable(new ItemStack((Item)Items.field_151021_T), 10)).func_150709_a(0.9F), new WeightedRandomFishable(new ItemStack(Items.field_151116_aA), 10), new WeightedRandomFishable(new ItemStack(Items.field_151103_aS), 10), new WeightedRandomFishable(new ItemStack((Item)Items.field_151068_bn), 10), new WeightedRandomFishable(new ItemStack(Items.field_151007_F), 5), (new WeightedRandomFishable(new ItemStack((Item)Items.field_151112_aM), 2)).func_150709_a(0.9F), new WeightedRandomFishable(new ItemStack(Items.field_151054_z), 10), new WeightedRandomFishable(new ItemStack(Items.field_151055_y), 5), new WeightedRandomFishable(new ItemStack(Items.field_151100_aR, 10, 0), 1), new WeightedRandomFishable(new ItemStack((Block)Blocks.field_150479_bC), 10), new WeightedRandomFishable(new ItemStack(Items.field_151078_bh), 10) });
/*  41 */   private static final List field_146041_e = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(Blocks.field_150392_bi), 1), new WeightedRandomFishable(new ItemStack(Items.field_151057_cb), 1), new WeightedRandomFishable(new ItemStack(Items.field_151141_av), 1), (new WeightedRandomFishable(new ItemStack((Item)Items.field_151031_f), 1)).func_150709_a(0.25F).func_150707_a(), (new WeightedRandomFishable(new ItemStack((Item)Items.field_151112_aM), 1)).func_150709_a(0.25F).func_150707_a(), (new WeightedRandomFishable(new ItemStack(Items.field_151122_aG), 1)).func_150707_a() });
/*  42 */   private static final List field_146036_f = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(Items.field_151115_aP, 1, ItemFishFood.FishType.COD.func_150976_a()), 60), new WeightedRandomFishable(new ItemStack(Items.field_151115_aP, 1, ItemFishFood.FishType.SALMON.func_150976_a()), 25), new WeightedRandomFishable(new ItemStack(Items.field_151115_aP, 1, ItemFishFood.FishType.CLOWNFISH.func_150976_a()), 2), new WeightedRandomFishable(new ItemStack(Items.field_151115_aP, 1, ItemFishFood.FishType.PUFFERFISH.func_150976_a()), 13) });
/*  43 */   private static final List orespawn_lava_fish = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(OreSpawnMain.MySunspotUrchin), 25), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyLavaEel), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MySunFish), 15), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MySparkFish), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyFireFish), 15) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   private static final List orespawn_fish = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyBlueFish), 25), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyPinkFish), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyRockFish), 15), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyWoodFish), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyGreyFish), 15) });
/*     */   
/*     */   private int field_146037_g;
/*     */   
/*     */   private int field_146048_h;
/*     */   
/*     */   private int field_146050_i;
/*     */   
/*     */   private Block field_146046_j;
/*     */   
/*     */   private boolean field_146051_au;
/*     */   
/*     */   private int field_146049_av;
/*     */   
/*     */   private int field_146047_aw;
/*     */   
/*     */   private int fish_on_hook;
/*     */   
/*     */   private int fish_wait_time;
/*     */   private int ticks_catchable;
/*     */   private float fish_direction;
/*     */   public Entity field_146043_c;
/*     */   private int field_146055_aB;
/*     */   private double field_146056_aC;
/*     */   private double field_146057_aD;
/*     */   private double field_146058_aE;
/*     */   private double field_146059_aF;
/*     */   private double field_146060_aG;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private double field_146061_aH;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private double field_146052_aI;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private double field_146053_aJ;
/*  83 */   private int fishing_in_lava = 0;
/*     */ 
/*     */   
/*     */   public UltimateFishHook(World par1World) {
/*  87 */     super(par1World);
/*  88 */     this.field_146037_g = -1;
/*  89 */     this.field_146048_h = -1;
/*  90 */     this.field_146050_i = -1;
/*  91 */     func_70105_a(0.25F, 0.25F);
/*  92 */     this.field_70158_ak = true;
/*  93 */     this.field_70174_ab = 3000;
/*  94 */     this.field_70178_ae = true;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public UltimateFishHook(World par1World, double par2, double par4, double par6, EntityPlayer par8EntityPlayer) {
/* 100 */     this(par1World);
/* 101 */     func_70107_b(par2, par4, par6);
/* 102 */     this.field_70158_ak = true;
/* 103 */     this.field_146042_b = par8EntityPlayer;
/* 104 */     par8EntityPlayer.field_71104_cf = this;
/* 105 */     this.field_70174_ab = 3000;
/* 106 */     this.field_70178_ae = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public UltimateFishHook(World par1World, EntityPlayer par2EntityPlayer) {
/* 111 */     super(par1World);
/* 112 */     this.field_146037_g = -1;
/* 113 */     this.field_146048_h = -1;
/* 114 */     this.field_146050_i = -1;
/* 115 */     this.field_70158_ak = true;
/* 116 */     this.field_146042_b = par2EntityPlayer;
/* 117 */     this.field_146042_b.field_71104_cf = this;
/* 118 */     func_70105_a(0.25F, 0.25F);
/* 119 */     func_70012_b(par2EntityPlayer.field_70165_t, par2EntityPlayer.field_70163_u + 1.62D - par2EntityPlayer.field_70129_M, par2EntityPlayer.field_70161_v, par2EntityPlayer.field_70177_z, par2EntityPlayer.field_70125_A);
/* 120 */     this.field_70165_t -= (MathHelper.func_76134_b(this.field_70177_z / 180.0F * 3.1415927F) * 0.16F);
/* 121 */     this.field_70163_u -= 0.10000000149011612D;
/* 122 */     this.field_70161_v -= (MathHelper.func_76126_a(this.field_70177_z / 180.0F * 3.1415927F) * 0.16F);
/* 123 */     func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 124 */     this.field_70129_M = 0.0F;
/* 125 */     float f = 0.4F;
/* 126 */     this.field_70159_w = (-MathHelper.func_76126_a(this.field_70177_z / 180.0F * 3.1415927F) * MathHelper.func_76134_b(this.field_70125_A / 180.0F * 3.1415927F) * f);
/* 127 */     this.field_70179_y = (MathHelper.func_76134_b(this.field_70177_z / 180.0F * 3.1415927F) * MathHelper.func_76134_b(this.field_70125_A / 180.0F * 3.1415927F) * f);
/* 128 */     this.field_70181_x = (-MathHelper.func_76126_a(this.field_70125_A / 180.0F * 3.1415927F) * f);
/* 129 */     func_146035_c(this.field_70159_w, this.field_70181_x, this.field_70179_y, 1.5F, 1.0F);
/* 130 */     this.field_70174_ab = 3000;
/* 131 */     this.field_70178_ae = true;
/*     */   }
/*     */   
/*     */   protected void func_70088_a() {
/* 135 */     this.field_70174_ab = 3000;
/* 136 */     this.field_70178_ae = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_146035_c(double p_146035_1_, double p_146035_3_, double p_146035_5_, float p_146035_7_, float p_146035_8_) {
/* 144 */     float f2 = MathHelper.func_76133_a(p_146035_1_ * p_146035_1_ + p_146035_3_ * p_146035_3_ + p_146035_5_ * p_146035_5_);
/* 145 */     p_146035_1_ /= f2;
/* 146 */     p_146035_3_ /= f2;
/* 147 */     p_146035_5_ /= f2;
/* 148 */     p_146035_1_ += this.field_70146_Z.nextGaussian() * 0.007499999832361937D * p_146035_8_;
/* 149 */     p_146035_3_ += this.field_70146_Z.nextGaussian() * 0.007499999832361937D * p_146035_8_;
/* 150 */     p_146035_5_ += this.field_70146_Z.nextGaussian() * 0.007499999832361937D * p_146035_8_;
/* 151 */     p_146035_1_ *= p_146035_7_;
/* 152 */     p_146035_3_ *= p_146035_7_;
/* 153 */     p_146035_5_ *= p_146035_7_;
/* 154 */     this.field_70159_w = p_146035_1_;
/* 155 */     this.field_70181_x = p_146035_3_;
/* 156 */     this.field_70179_y = p_146035_5_;
/* 157 */     float f3 = MathHelper.func_76133_a(p_146035_1_ * p_146035_1_ + p_146035_5_ * p_146035_5_);
/* 158 */     this.field_70126_B = this.field_70177_z = (float)(Math.atan2(p_146035_1_, p_146035_5_) * 180.0D / Math.PI);
/* 159 */     this.field_70127_C = this.field_70125_A = (float)(Math.atan2(p_146035_3_, f3) * 180.0D / Math.PI);
/* 160 */     this.field_146049_av = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean func_70112_a(double par1) {
/* 170 */     double d1 = this.field_70121_D.func_72320_b() * 4.0D;
/* 171 */     d1 *= 64.0D;
/* 172 */     return (par1 < d1 * d1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70056_a(double par1, double par3, double par5, float par7, float par8, int par9) {
/* 182 */     this.field_146056_aC = par1;
/* 183 */     this.field_146057_aD = par3;
/* 184 */     this.field_146058_aE = par5;
/* 185 */     this.field_146059_aF = par7;
/* 186 */     this.field_146060_aG = par8;
/* 187 */     this.field_146055_aB = par9;
/* 188 */     this.field_70159_w = this.field_146061_aH;
/* 189 */     this.field_70181_x = this.field_146052_aI;
/* 190 */     this.field_70179_y = this.field_146053_aJ;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70016_h(double par1, double par3, double par5) {
/* 199 */     this.field_146061_aH = this.field_70159_w = par1;
/* 200 */     this.field_146052_aI = this.field_70181_x = par3;
/* 201 */     this.field_146053_aJ = this.field_70179_y = par5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 211 */     if (this.field_146055_aB > 0) {
/*     */       
/* 213 */       double d7 = this.field_70165_t + (this.field_146056_aC - this.field_70165_t) / this.field_146055_aB;
/* 214 */       double d8 = this.field_70163_u + (this.field_146057_aD - this.field_70163_u) / this.field_146055_aB;
/* 215 */       double d9 = this.field_70161_v + (this.field_146058_aE - this.field_70161_v) / this.field_146055_aB;
/* 216 */       double d1 = MathHelper.func_76138_g(this.field_146059_aF - this.field_70177_z);
/* 217 */       this.field_70177_z = (float)(this.field_70177_z + d1 / this.field_146055_aB);
/* 218 */       this.field_70125_A = (float)(this.field_70125_A + (this.field_146060_aG - this.field_70125_A) / this.field_146055_aB);
/* 219 */       this.field_146055_aB--;
/* 220 */       func_70107_b(d7, d8, d9);
/* 221 */       func_70101_b(this.field_70177_z, this.field_70125_A);
/*     */     }
/*     */     else {
/*     */       
/* 225 */       if (!this.field_70170_p.field_72995_K) {
/*     */         
/* 227 */         ItemStack itemstack = this.field_146042_b.func_71045_bC();
/*     */         
/* 229 */         if (this.field_146042_b.field_70128_L || !this.field_146042_b.func_70089_S() || itemstack == null || itemstack.func_77973_b() != OreSpawnMain.MyUltimateFishingRod || func_70068_e((Entity)this.field_146042_b) > 1024.0D) {
/*     */           
/* 231 */           func_70106_y();
/* 232 */           this.field_146042_b.field_71104_cf = null;
/*     */           
/*     */           return;
/*     */         } 
/* 236 */         if (this.field_146043_c != null) {
/*     */           
/* 238 */           if (!this.field_146043_c.field_70128_L) {
/*     */             
/* 240 */             this.field_70165_t = this.field_146043_c.field_70165_t;
/* 241 */             this.field_70163_u = this.field_146043_c.field_70121_D.field_72338_b + this.field_146043_c.field_70131_O * 0.8D;
/* 242 */             this.field_70161_v = this.field_146043_c.field_70161_v;
/*     */             
/*     */             return;
/*     */           } 
/* 246 */           this.field_146043_c = null;
/*     */         } 
/*     */       } 
/*     */       
/* 250 */       if (this.field_146044_a > 0)
/*     */       {
/* 252 */         this.field_146044_a--;
/*     */       }
/*     */       
/* 255 */       if (this.field_146051_au) {
/*     */         
/* 257 */         if (this.field_70170_p.func_147439_a(this.field_146037_g, this.field_146048_h, this.field_146050_i) == this.field_146046_j) {
/*     */           
/* 259 */           this.field_146049_av++;
/*     */           
/* 261 */           if (this.field_146049_av == 1200)
/*     */           {
/* 263 */             func_70106_y();
/*     */           }
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 269 */         this.field_146051_au = false;
/* 270 */         this.field_70159_w *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 271 */         this.field_70181_x *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 272 */         this.field_70179_y *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 273 */         this.field_146049_av = 0;
/* 274 */         this.field_146047_aw = 0;
/*     */       }
/*     */       else {
/*     */         
/* 278 */         this.field_146047_aw++;
/*     */       } 
/*     */       
/* 281 */       Vec3 vec31 = Vec3.func_72443_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 282 */       Vec3 vec3 = Vec3.func_72443_a(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
/* 283 */       MovingObjectPosition movingobjectposition = this.field_70170_p.func_72933_a(vec31, vec3);
/* 284 */       vec31 = Vec3.func_72443_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 285 */       vec3 = Vec3.func_72443_a(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
/*     */       
/* 287 */       if (movingobjectposition != null)
/*     */       {
/* 289 */         vec3 = Vec3.func_72443_a(movingobjectposition.field_72307_f.field_72450_a, movingobjectposition.field_72307_f.field_72448_b, movingobjectposition.field_72307_f.field_72449_c);
/*     */       }
/*     */       
/* 292 */       Entity entity = null;
/* 293 */       List<Entity> list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72321_a(this.field_70159_w, this.field_70181_x, this.field_70179_y).func_72314_b(1.0D, 1.0D, 1.0D));
/* 294 */       double d0 = 0.0D;
/*     */ 
/*     */       
/* 297 */       for (int i = 0; i < list.size(); i++) {
/*     */         
/* 299 */         Entity entity1 = list.get(i);
/*     */         
/* 301 */         if (entity1.func_70067_L() && (entity1 != this.field_146042_b || this.field_146047_aw >= 5)) {
/*     */           
/* 303 */           float f = 0.3F;
/* 304 */           AxisAlignedBB axisalignedbb = entity1.field_70121_D.func_72314_b(f, f, f);
/* 305 */           MovingObjectPosition movingobjectposition1 = axisalignedbb.func_72327_a(vec31, vec3);
/*     */           
/* 307 */           if (movingobjectposition1 != null) {
/*     */             
/* 309 */             double d2 = vec31.func_72438_d(movingobjectposition1.field_72307_f);
/*     */             
/* 311 */             if (d2 < d0 || d0 == 0.0D) {
/*     */               
/* 313 */               entity = entity1;
/* 314 */               d0 = d2;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 320 */       if (entity != null)
/*     */       {
/* 322 */         movingobjectposition = new MovingObjectPosition(entity);
/*     */       }
/*     */       
/* 325 */       if (movingobjectposition != null)
/*     */       {
/* 327 */         if (movingobjectposition.field_72308_g != null) {
/*     */           
/* 329 */           if (movingobjectposition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)this.field_146042_b), 0.0F))
/*     */           {
/* 331 */             this.field_146043_c = movingobjectposition.field_72308_g;
/*     */           }
/*     */         }
/*     */         else {
/*     */           
/* 336 */           this.field_146051_au = true;
/*     */         } 
/*     */       }
/*     */       
/* 340 */       if (!this.field_146051_au) {
/*     */         
/* 342 */         func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/* 343 */         float f5 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/* 344 */         this.field_70177_z = (float)(Math.atan2(this.field_70159_w, this.field_70179_y) * 180.0D / Math.PI);
/*     */         
/* 346 */         for (this.field_70125_A = (float)(Math.atan2(this.field_70181_x, f5) * 180.0D / Math.PI); this.field_70125_A - this.field_70127_C < -180.0F; this.field_70127_C -= 360.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 351 */         while (this.field_70125_A - this.field_70127_C >= 180.0F)
/*     */         {
/* 353 */           this.field_70127_C += 360.0F;
/*     */         }
/*     */         
/* 356 */         while (this.field_70177_z - this.field_70126_B < -180.0F)
/*     */         {
/* 358 */           this.field_70126_B -= 360.0F;
/*     */         }
/*     */         
/* 361 */         while (this.field_70177_z - this.field_70126_B >= 180.0F)
/*     */         {
/* 363 */           this.field_70126_B += 360.0F;
/*     */         }
/*     */         
/* 366 */         this.field_70125_A = this.field_70127_C + (this.field_70125_A - this.field_70127_C) * 0.2F;
/* 367 */         this.field_70177_z = this.field_70126_B + (this.field_70177_z - this.field_70126_B) * 0.2F;
/* 368 */         float f6 = 0.92F;
/*     */         
/* 370 */         if (this.field_70122_E || this.field_70123_F)
/*     */         {
/* 372 */           f6 = 0.5F;
/*     */         }
/*     */         
/* 375 */         byte b0 = 5;
/* 376 */         double d10 = 0.0D;
/*     */         
/* 378 */         for (int j = 0; j < b0; j++) {
/*     */           
/* 380 */           double d3 = this.field_70121_D.field_72338_b + (this.field_70121_D.field_72337_e - this.field_70121_D.field_72338_b) * (j + 0) / b0 - 0.125D + 0.125D;
/* 381 */           double d4 = this.field_70121_D.field_72338_b + (this.field_70121_D.field_72337_e - this.field_70121_D.field_72338_b) * (j + 1) / b0 - 0.125D + 0.125D;
/* 382 */           AxisAlignedBB axisalignedbb1 = AxisAlignedBB.func_72330_a(this.field_70121_D.field_72340_a, d3, this.field_70121_D.field_72339_c, this.field_70121_D.field_72336_d, d4, this.field_70121_D.field_72334_f);
/*     */           
/* 384 */           if (this.field_70170_p.func_72830_b(axisalignedbb1, Material.field_151586_h))
/*     */           {
/* 386 */             d10 += 1.0D / b0;
/*     */           }
/* 388 */           if (this.field_70170_p.func_72830_b(axisalignedbb1, Material.field_151587_i))
/*     */           {
/* 390 */             d10 += 1.0D / b0;
/*     */           }
/*     */         } 
/*     */         
/* 394 */         if (!this.field_70170_p.field_72995_K && d10 > 0.0D) {
/*     */           
/* 396 */           WorldServer worldserver = (WorldServer)this.field_70170_p;
/* 397 */           int k = 1;
/*     */           
/* 399 */           if (this.field_70146_Z.nextFloat() < 0.25F && this.field_70170_p.func_72951_B(MathHelper.func_76128_c(this.field_70165_t), MathHelper.func_76128_c(this.field_70163_u) + 1, MathHelper.func_76128_c(this.field_70161_v)))
/*     */           {
/* 401 */             k = 2;
/*     */           }
/*     */           
/* 404 */           if (this.field_70146_Z.nextFloat() < 0.5F && !this.field_70170_p.func_72937_j(MathHelper.func_76128_c(this.field_70165_t), MathHelper.func_76128_c(this.field_70163_u) + 1, MathHelper.func_76128_c(this.field_70161_v)))
/*     */           {
/* 406 */             k--;
/*     */           }
/*     */           
/* 409 */           if (this.fish_on_hook > 0) {
/*     */             
/* 411 */             this.fish_on_hook--;
/*     */             
/* 413 */             if (this.fish_on_hook <= 0)
/*     */             {
/* 415 */               this.fish_wait_time = 0;
/* 416 */               this.ticks_catchable = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           }
/* 428 */           else if (this.ticks_catchable > 0) {
/*     */             
/* 430 */             this.ticks_catchable -= k;
/*     */             
/* 432 */             if (this.ticks_catchable <= 0)
/*     */             {
/* 434 */               this.field_70181_x -= 0.20000000298023224D;
/* 435 */               func_85030_a("random.splash", 0.25F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.4F);
/* 436 */               float f1 = MathHelper.func_76128_c(this.field_70121_D.field_72338_b);
/* 437 */               worldserver.func_147487_a("bubble", this.field_70165_t, (f1 + 1.0F), this.field_70161_v, (int)(1.0F + this.field_70130_N * 20.0F), this.field_70130_N, 0.0D, this.field_70130_N, 0.20000000298023224D);
/* 438 */               worldserver.func_147487_a("wake", this.field_70165_t, (f1 + 1.0F), this.field_70161_v, (int)(1.0F + this.field_70130_N * 20.0F), this.field_70130_N, 0.0D, this.field_70130_N, 0.20000000298023224D);
/* 439 */               this.fish_on_hook = MathHelper.func_76136_a(this.field_70146_Z, 10, 30);
/*     */             }
/*     */             else
/*     */             {
/* 443 */               this.fish_direction = (float)(this.fish_direction + this.field_70146_Z.nextGaussian() * 4.0D);
/* 444 */               float f1 = this.fish_direction * 0.017453292F;
/* 445 */               float f7 = MathHelper.func_76126_a(f1);
/* 446 */               float f2 = MathHelper.func_76134_b(f1);
/* 447 */               double d11 = this.field_70165_t + (f7 * this.ticks_catchable * 0.1F);
/* 448 */               double d5 = (MathHelper.func_76128_c(this.field_70121_D.field_72338_b) + 1.0F);
/* 449 */               double d6 = this.field_70161_v + (f2 * this.ticks_catchable * 0.1F);
/*     */               
/* 451 */               if (this.field_70146_Z.nextFloat() < 0.15F)
/*     */               {
/* 453 */                 worldserver.func_147487_a("bubble", d11, d5 - 0.10000000149011612D, d6, 1, f7, 0.1D, f2, 0.0D);
/*     */               }
/*     */               
/* 456 */               float f3 = f7 * 0.04F;
/* 457 */               float f4 = f2 * 0.04F;
/* 458 */               worldserver.func_147487_a("wake", d11, d5, d6, 0, f4, 0.01D, -f3, 1.0D);
/* 459 */               worldserver.func_147487_a("wake", d11, d5, d6, 0, -f4, 0.01D, f3, 1.0D);
/*     */             }
/*     */           
/* 462 */           } else if (this.fish_wait_time > 0) {
/*     */             
/* 464 */             this.fish_wait_time -= k;
/* 465 */             float f1 = 0.15F;
/*     */             
/* 467 */             if (this.fish_wait_time < 20) {
/*     */               
/* 469 */               f1 = (float)(f1 + (20 - this.fish_wait_time) * 0.05D);
/*     */             }
/* 471 */             else if (this.fish_wait_time < 40) {
/*     */               
/* 473 */               f1 = (float)(f1 + (40 - this.fish_wait_time) * 0.02D);
/*     */             }
/* 475 */             else if (this.fish_wait_time < 60) {
/*     */               
/* 477 */               f1 = (float)(f1 + (60 - this.fish_wait_time) * 0.01D);
/*     */             } 
/*     */             
/* 480 */             if (this.field_70146_Z.nextFloat() < f1) {
/*     */               
/* 482 */               float f7 = MathHelper.func_151240_a(this.field_70146_Z, 0.0F, 360.0F) * 0.017453292F;
/* 483 */               float f2 = MathHelper.func_151240_a(this.field_70146_Z, 25.0F, 60.0F);
/* 484 */               double d11 = this.field_70165_t + (MathHelper.func_76126_a(f7) * f2 * 0.1F);
/* 485 */               double d5 = (MathHelper.func_76128_c(this.field_70121_D.field_72338_b) + 1.0F);
/* 486 */               double d6 = this.field_70161_v + (MathHelper.func_76134_b(f7) * f2 * 0.1F);
/* 487 */               worldserver.func_147487_a("splash", d11, d5, d6, 2 + this.field_70146_Z.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D);
/*     */             } 
/*     */             
/* 490 */             if (this.fish_wait_time <= 0)
/*     */             {
/* 492 */               this.fish_direction = MathHelper.func_151240_a(this.field_70146_Z, 0.0F, 360.0F);
/* 493 */               this.ticks_catchable = MathHelper.func_76136_a(this.field_70146_Z, 100, 200);
/*     */             }
/*     */           
/*     */           } else {
/*     */             
/* 498 */             this.fish_wait_time = MathHelper.func_76136_a(this.field_70146_Z, 50, 300);
/* 499 */             this.fish_wait_time -= EnchantmentHelper.func_151387_h((EntityLivingBase)this.field_146042_b) * 20 * 5;
/*     */           } 
/*     */ 
/*     */           
/* 503 */           if (this.fish_on_hook > 0)
/*     */           {
/* 505 */             this.field_70181_x -= (this.field_70146_Z.nextFloat() * this.field_70146_Z.nextFloat() * this.field_70146_Z.nextFloat()) * 0.2D;
/*     */           }
/*     */         } 
/*     */         
/* 509 */         double d2 = d10 * 2.0D - 1.0D;
/* 510 */         this.field_70181_x += 0.03999999910593033D * d2;
/*     */         
/* 512 */         if (d10 > 0.0D) {
/*     */           
/* 514 */           f6 = (float)(f6 * 0.9D);
/* 515 */           this.field_70181_x *= 0.8D;
/*     */         } 
/*     */         
/* 518 */         this.field_70159_w *= f6;
/* 519 */         this.field_70181_x *= f6;
/* 520 */         this.field_70179_y *= f6;
/* 521 */         func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 531 */     par1NBTTagCompound.func_74777_a("xTile", (short)this.field_146037_g);
/* 532 */     par1NBTTagCompound.func_74777_a("yTile", (short)this.field_146048_h);
/* 533 */     par1NBTTagCompound.func_74777_a("zTile", (short)this.field_146050_i);
/* 534 */     par1NBTTagCompound.func_74774_a("inTile", (byte)Block.func_149682_b(this.field_146046_j));
/* 535 */     par1NBTTagCompound.func_74774_a("shake", (byte)this.field_146044_a);
/* 536 */     par1NBTTagCompound.func_74774_a("inGround", (byte)(this.field_146051_au ? 1 : 0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 544 */     this.field_146037_g = par1NBTTagCompound.func_74765_d("xTile");
/* 545 */     this.field_146048_h = par1NBTTagCompound.func_74765_d("yTile");
/* 546 */     this.field_146050_i = par1NBTTagCompound.func_74765_d("zTile");
/* 547 */     this.field_146046_j = Block.func_149729_e(par1NBTTagCompound.func_74771_c("inTile") & 0xFF);
/* 548 */     this.field_146044_a = par1NBTTagCompound.func_74771_c("shake") & 0xFF;
/* 549 */     this.field_146051_au = (par1NBTTagCompound.func_74771_c("inGround") == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float func_70053_R() {
/* 555 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_146034_e() {
/* 560 */     if (this.field_70170_p.field_72995_K)
/*     */     {
/* 562 */       return 0;
/*     */     }
/*     */ 
/*     */     
/* 566 */     byte b0 = 0;
/*     */     
/* 568 */     if (this.field_146043_c != null) {
/*     */       
/* 570 */       double d0 = this.field_146042_b.field_70165_t - this.field_70165_t;
/* 571 */       double d2 = this.field_146042_b.field_70163_u - this.field_70163_u;
/* 572 */       double d4 = this.field_146042_b.field_70161_v - this.field_70161_v;
/* 573 */       double d6 = MathHelper.func_76133_a(d0 * d0 + d2 * d2 + d4 * d4);
/* 574 */       double d8 = 0.1D;
/* 575 */       this.field_146043_c.field_70159_w += d0 * d8;
/* 576 */       this.field_146043_c.field_70181_x += d2 * d8 + MathHelper.func_76133_a(d6) * 0.08D;
/* 577 */       this.field_146043_c.field_70179_y += d4 * d8;
/* 578 */       b0 = 3;
/*     */     }
/* 580 */     else if (this.fish_on_hook > 0) {
/*     */       
/* 582 */       EntityItem entityitem = new EntityItem(this.field_70170_p, this.field_70165_t, this.field_70163_u + 1.25D, this.field_70161_v, func_146033_f());
/* 583 */       double d1 = this.field_146042_b.field_70165_t - this.field_70165_t;
/* 584 */       double d3 = this.field_146042_b.field_70163_u - this.field_70163_u;
/* 585 */       double d5 = this.field_146042_b.field_70161_v - this.field_70161_v;
/* 586 */       double d7 = MathHelper.func_76133_a(d1 * d1 + d3 * d3 + d5 * d5);
/* 587 */       double d9 = 0.1D;
/* 588 */       entityitem.field_70159_w = d1 * d9;
/* 589 */       entityitem.field_70181_x = d3 * d9 + MathHelper.func_76133_a(d7) * 0.08D;
/* 590 */       entityitem.field_70179_y = d5 * d9;
/* 591 */       entityitem.field_70174_ab = 3000;
/* 592 */       this.field_70170_p.func_72838_d((Entity)entityitem);
/* 593 */       this.field_146042_b.field_70170_p.func_72838_d((Entity)new EntityXPOrb(this.field_146042_b.field_70170_p, this.field_146042_b.field_70165_t, this.field_146042_b.field_70163_u + 0.5D, this.field_146042_b.field_70161_v + 0.5D, this.field_70146_Z.nextInt(6) + 1));
/* 594 */       b0 = 1;
/*     */     } 
/*     */     
/* 597 */     if (this.field_146051_au)
/*     */     {
/* 599 */       b0 = 2;
/*     */     }
/*     */     
/* 602 */     func_70106_y();
/* 603 */     this.field_146042_b.field_71104_cf = null;
/* 604 */     return b0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private ItemStack func_146033_f() {
/* 610 */     float f = this.field_70170_p.field_73012_v.nextFloat();
/* 611 */     int i = EnchantmentHelper.func_151386_g((EntityLivingBase)this.field_146042_b);
/* 612 */     int j = EnchantmentHelper.func_151387_h((EntityLivingBase)this.field_146042_b);
/* 613 */     float f1 = 0.1F - i * 0.025F - j * 0.01F;
/* 614 */     float f2 = 0.05F + i * 0.01F - j * 0.01F;
/* 615 */     f1 = MathHelper.func_76131_a(f1, 0.0F, 1.0F);
/* 616 */     f2 = MathHelper.func_76131_a(f2, 0.0F, 1.0F);
/* 617 */     Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */ 
/*     */     
/* 620 */     if (func_70058_J() || bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/* 621 */       this.field_146042_b.func_71064_a(StatList.field_75933_B, 1);
/* 622 */       return ((WeightedRandomFishable)WeightedRandom.func_76271_a(this.field_70146_Z, orespawn_lava_fish)).func_150708_a(this.field_70146_Z);
/*     */     } 
/* 624 */     if (f < f1) {
/*     */       
/* 626 */       this.field_146042_b.func_71064_a(StatList.field_151183_A, 1);
/* 627 */       return ((WeightedRandomFishable)WeightedRandom.func_76271_a(this.field_70146_Z, field_146039_d)).func_150708_a(this.field_70146_Z);
/*     */     } 
/*     */ 
/*     */     
/* 631 */     f -= f1;
/*     */     
/* 633 */     if (f < f2) {
/*     */       
/* 635 */       this.field_146042_b.func_71064_a(StatList.field_151184_B, 1);
/* 636 */       return ((WeightedRandomFishable)WeightedRandom.func_76271_a(this.field_70146_Z, field_146041_e)).func_150708_a(this.field_70146_Z);
/*     */     } 
/*     */ 
/*     */     
/* 640 */     float f3 = this.field_70170_p.field_73012_v.nextFloat();
/* 641 */     this.field_146042_b.func_71064_a(StatList.field_75933_B, 1);
/* 642 */     if (f3 < 0.5F) {
/* 643 */       return ((WeightedRandomFishable)WeightedRandom.func_76271_a(this.field_70146_Z, field_146036_f)).func_150708_a(this.field_70146_Z);
/*     */     }
/* 645 */     return ((WeightedRandomFishable)WeightedRandom.func_76271_a(this.field_70146_Z, orespawn_fish)).func_150708_a(this.field_70146_Z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70106_y() {
/* 656 */     super.func_70106_y();
/*     */     
/* 658 */     if (this.field_146042_b != null)
/*     */     {
/* 660 */       this.field_146042_b.field_71104_cf = null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\UltimateFishHook.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */