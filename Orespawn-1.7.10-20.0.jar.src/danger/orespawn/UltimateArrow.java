/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.passive.EntityHorse;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.entity.projectile.EntityArrow;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.server.S2BPacketChangeGameState;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ public class UltimateArrow
/*     */   extends EntityArrow {
/*  26 */   private int xTile = -1;
/*  27 */   private int yTile = -1;
/*  28 */   private int zTile = -1;
/*  29 */   private Block inTile = Blocks.field_150350_a;
/*  30 */   private int inData = 0;
/*     */   private boolean inGround = false;
/*     */   private int ticksInGround;
/*  33 */   private int ticksInAir = 0;
/*     */ 
/*     */   
/*     */   private int knockbackStrength;
/*     */ 
/*     */   
/*     */   public UltimateArrow(World par1World) {
/*  40 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public UltimateArrow(World par1World, double par2, double par4, double par6) {
/*  45 */     super(par1World, par2, par4, par6);
/*     */   }
/*     */ 
/*     */   
/*     */   public UltimateArrow(World par1World, EntityLiving par2EntityLiving, EntityLivingBase par3EntityLiving, float par4, float par5) {
/*  50 */     super(par1World, (EntityLivingBase)par2EntityLiving, par3EntityLiving, par4, par5);
/*     */   }
/*     */ 
/*     */   
/*     */   public UltimateArrow(World par1World, EntityPlayer par3EntityPlayer, float par3) {
/*  55 */     super(par1World, (EntityLivingBase)par3EntityPlayer, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  60 */     this.field_70180_af.func_75682_a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70186_c(double par1, double par3, double par5, float par7, float par8) {
/*  68 */     float var9 = MathHelper.func_76133_a(par1 * par1 + par3 * par3 + par5 * par5);
/*  69 */     par1 /= var9;
/*  70 */     par3 /= var9;
/*  71 */     par5 /= var9;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  76 */     par1 *= par7;
/*  77 */     par3 *= par7;
/*  78 */     par5 *= par7;
/*  79 */     this.field_70159_w = par1;
/*  80 */     this.field_70181_x = par3;
/*  81 */     this.field_70179_y = par5;
/*  82 */     float var10 = MathHelper.func_76133_a(par1 * par1 + par5 * par5);
/*  83 */     this.field_70126_B = this.field_70177_z = (float)(Math.atan2(par1, par5) * 180.0D / Math.PI);
/*  84 */     this.field_70127_C = this.field_70125_A = (float)(Math.atan2(par3, var10) * 180.0D / Math.PI);
/*  85 */     this.ticksInGround = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  95 */     func_70030_z();
/*     */     
/*  97 */     if (this.field_70127_C == 0.0F && this.field_70126_B == 0.0F) {
/*     */       
/*  99 */       float var1 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/* 100 */       this.field_70126_B = this.field_70177_z = (float)(Math.atan2(this.field_70159_w, this.field_70179_y) * 180.0D / Math.PI);
/* 101 */       this.field_70127_C = this.field_70125_A = (float)(Math.atan2(this.field_70181_x, var1) * 180.0D / Math.PI);
/*     */     } 
/*     */     
/* 104 */     Block var16 = this.field_70170_p.func_147439_a(this.xTile, this.yTile, this.zTile);
/*     */     
/* 106 */     if (var16 != Blocks.field_150350_a) {
/*     */ 
/*     */       
/* 109 */       var16.func_149719_a((IBlockAccess)this.field_70170_p, this.xTile, this.yTile, this.zTile);
/* 110 */       AxisAlignedBB var2 = var16.func_149668_a(this.field_70170_p, this.xTile, this.yTile, this.zTile);
/*     */       
/* 112 */       if (var2 != null && var2.func_72318_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u, this.field_70161_v)))
/*     */       {
/* 114 */         this.inGround = true;
/*     */       }
/*     */     } 
/*     */     
/* 118 */     if (this.field_70249_b > 0)
/*     */     {
/* 120 */       this.field_70249_b--;
/*     */     }
/*     */     
/* 123 */     if (this.inGround) {
/*     */       
/* 125 */       Block var18 = this.field_70170_p.func_147439_a(this.xTile, this.yTile, this.zTile);
/* 126 */       int var19 = this.field_70170_p.func_72805_g(this.xTile, this.yTile, this.zTile);
/*     */       
/* 128 */       if (var18 != Blocks.field_150350_a)
/*     */       {
/* 130 */         this.ticksInGround++;
/*     */         
/* 132 */         if (this.ticksInGround == 500)
/*     */         {
/* 134 */           func_70106_y();
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 139 */         this.inGround = false;
/* 140 */         this.field_70159_w *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 141 */         this.field_70181_x *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 142 */         this.field_70179_y *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 143 */         this.ticksInGround = 0;
/* 144 */         this.ticksInAir = 0;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 149 */       this.ticksInAir++;
/* 150 */       Vec3 var17 = Vec3.func_72443_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 151 */       Vec3 var3 = Vec3.func_72443_a(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
/* 152 */       MovingObjectPosition var4 = this.field_70170_p.func_72901_a(var17, var3, true);
/* 153 */       var17 = Vec3.func_72443_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 154 */       var3 = Vec3.func_72443_a(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
/*     */       
/* 156 */       if (var4 != null)
/*     */       {
/* 158 */         var3 = Vec3.func_72443_a(var4.field_72307_f.field_72450_a, var4.field_72307_f.field_72448_b, var4.field_72307_f.field_72449_c);
/*     */       }
/*     */       
/* 161 */       Entity var5 = null;
/* 162 */       List<Entity> var6 = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72321_a(this.field_70159_w, this.field_70181_x, this.field_70179_y).func_72314_b(1.0D, 1.0D, 1.0D));
/* 163 */       double var7 = 0.0D;
/*     */       
/*     */       int var9;
/*     */       
/* 167 */       for (var9 = 0; var9 < var6.size(); var9++) {
/*     */         
/* 169 */         Entity var10 = var6.get(var9);
/*     */         
/* 171 */         if (var10.func_70067_L() && (var10 != this.field_70250_c || this.ticksInAir >= 5) && !(var10 instanceof Elevator)) {
/*     */           
/* 173 */           if (var10 instanceof Cephadrome) {
/* 174 */             Cephadrome c = (Cephadrome)var10;
/* 175 */             if (c.field_70153_n != null)
/*     */               continue; 
/* 177 */           }  if (var10 instanceof Dragon) {
/* 178 */             Dragon c = (Dragon)var10;
/* 179 */             if (c.field_70153_n != null)
/*     */               continue; 
/* 181 */           }  if (var10 instanceof EntityHorse) {
/* 182 */             EntityHorse c = (EntityHorse)var10;
/* 183 */             if (c.field_70153_n != null)
/*     */               continue; 
/* 185 */           }  float f = 0.3F;
/* 186 */           AxisAlignedBB var12 = var10.field_70121_D.func_72314_b(f, f, f);
/* 187 */           MovingObjectPosition var13 = var12.func_72327_a(var17, var3);
/*     */           
/* 189 */           if (var13 != null) {
/*     */             
/* 191 */             double var14 = var17.func_72438_d(var13.field_72307_f);
/*     */             
/* 193 */             if (var14 < var7 || var7 == 0.0D) {
/*     */               
/* 195 */               var5 = var10;
/* 196 */               var7 = var14;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         continue;
/*     */       } 
/* 202 */       if (var5 != null)
/*     */       {
/* 204 */         var4 = new MovingObjectPosition(var5);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 210 */       if (var4 != null)
/*     */       {
/* 212 */         if (var4.field_72308_g != null) {
/*     */           
/* 214 */           float f1 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y);
/* 215 */           float var23 = MathHelper.func_76143_f(f1 * OreSpawnMain.UltimateBowDamage);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 221 */           if (OreSpawnMain.ultimate_sword_pvp == 0) {
/* 222 */             if (var4.field_72308_g instanceof EntityPlayer || var4.field_72308_g instanceof Girlfriend || var4.field_72308_g instanceof Boyfriend) {
/*     */               
/* 224 */               EntityLivingBase e = (EntityLivingBase)var4.field_72308_g;
/*     */               
/* 226 */               func_85030_a("random.bowhit", 1.0F, 1.2F / (this.field_70146_Z.nextFloat() * 0.2F + 0.9F));
/* 227 */               e.func_70691_i(1.0F);
/* 228 */               func_70106_y();
/*     */               return;
/*     */             } 
/* 231 */             if (var4.field_72308_g instanceof EntityTameable) {
/*     */               
/* 233 */               EntityTameable t = (EntityTameable)var4.field_72308_g;
/* 234 */               if (t.func_70909_n()) {
/* 235 */                 func_85030_a("random.bowhit", 1.0F, 1.2F / (this.field_70146_Z.nextFloat() * 0.2F + 0.9F));
/* 236 */                 t.func_70691_i(1.0F);
/* 237 */                 func_70106_y();
/*     */                 
/*     */                 return;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */           
/* 244 */           if (func_70241_g())
/*     */           {
/* 246 */             var23 += this.field_70146_Z.nextInt((int)var23 / 2 + 2);
/*     */           }
/*     */ 
/*     */ 
/*     */           
/* 251 */           DamageSource var21 = null;
/*     */           
/* 253 */           if (this.field_70250_c == null) {
/*     */             
/* 255 */             var21 = DamageSource.func_76353_a(this, (Entity)this);
/*     */           }
/*     */           else {
/*     */             
/* 259 */             var21 = DamageSource.func_76353_a(this, this.field_70250_c);
/*     */           } 
/*     */           
/* 262 */           if (func_70027_ad())
/*     */           {
/* 264 */             var4.field_72308_g.func_70015_d(5);
/*     */           }
/*     */           
/* 267 */           if (var4.field_72308_g.func_70097_a(var21, var23))
/*     */           {
/* 269 */             if (var4.field_72308_g instanceof EntityLiving) {
/*     */               
/* 271 */               EntityLiving var24 = (EntityLiving)var4.field_72308_g;
/*     */               
/* 273 */               if (!this.field_70170_p.field_72995_K)
/*     */               {
/* 275 */                 var24.func_85034_r(var24.func_85035_bI() + 1);
/*     */               }
/*     */               
/* 278 */               if (this.knockbackStrength > 0) {
/*     */                 
/* 280 */                 float var26 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*     */                 
/* 282 */                 if (var26 > 0.0F)
/*     */                 {
/* 284 */                   var4.field_72308_g.func_70024_g(this.field_70159_w * this.knockbackStrength * 0.6000000238418579D / var26, 0.1D, this.field_70179_y * this.knockbackStrength * 0.6000000238418579D / var26);
/*     */                 }
/*     */               } 
/*     */ 
/*     */ 
/*     */               
/* 290 */               if (this.field_70250_c != null && var4.field_72308_g != this.field_70250_c && var4.field_72308_g instanceof EntityPlayer && this.field_70250_c instanceof EntityPlayerMP)
/*     */               {
/* 292 */                 ((EntityPlayerMP)this.field_70250_c).field_71135_a.func_147359_a((Packet)new S2BPacketChangeGameState(6, 0.0F));
/*     */               }
/*     */             } 
/*     */             
/* 296 */             func_85030_a("random.bowhit", 1.0F, 1.2F / (this.field_70146_Z.nextFloat() * 0.2F + 0.9F));
/*     */ 
/*     */             
/* 299 */             func_70106_y();
/*     */           
/*     */           }
/*     */           else
/*     */           {
/* 304 */             this.field_70159_w *= -0.10000000149D;
/* 305 */             this.field_70181_x *= -0.10000000149D;
/* 306 */             this.field_70179_y *= -0.10000000149D;
/* 307 */             this.field_70177_z += 180.0F;
/* 308 */             this.field_70126_B += 180.0F;
/* 309 */             this.ticksInAir = 0;
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/* 314 */           this.xTile = var4.field_72311_b;
/* 315 */           this.yTile = var4.field_72312_c;
/* 316 */           this.zTile = var4.field_72309_d;
/* 317 */           this.inTile = this.field_70170_p.func_147439_a(this.xTile, this.yTile, this.zTile);
/* 318 */           this.inData = this.field_70170_p.func_72805_g(this.xTile, this.yTile, this.zTile);
/* 319 */           this.field_70159_w = (float)(var4.field_72307_f.field_72450_a - this.field_70165_t);
/* 320 */           this.field_70181_x = (float)(var4.field_72307_f.field_72448_b - this.field_70163_u);
/* 321 */           this.field_70179_y = (float)(var4.field_72307_f.field_72449_c - this.field_70161_v);
/* 322 */           float f = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y);
/* 323 */           this.field_70165_t -= this.field_70159_w / f * 0.05D;
/* 324 */           this.field_70163_u -= this.field_70181_x / f * 0.05D;
/* 325 */           this.field_70161_v -= this.field_70179_y / f * 0.05D;
/* 326 */           func_85030_a("random.bowhit", 1.0F, 1.2F / (this.field_70146_Z.nextFloat() * 0.2F + 0.9F));
/* 327 */           this.inGround = true;
/* 328 */           this.field_70249_b = 7;
/* 329 */           func_70243_d(false);
/*     */           
/* 331 */           if (this.inTile != Blocks.field_150350_a)
/*     */           {
/* 333 */             this.inTile.func_149670_a(this.field_70170_p, this.xTile, this.yTile, this.zTile, (Entity)this);
/*     */           }
/*     */         } 
/*     */       }
/*     */       
/* 338 */       if (func_70241_g())
/*     */       {
/* 340 */         for (var9 = 0; var9 < 4; var9++)
/*     */         {
/* 342 */           this.field_70170_p.func_72869_a("crit", this.field_70165_t + this.field_70159_w * var9 / 4.0D, this.field_70163_u + this.field_70181_x * var9 / 4.0D, this.field_70161_v + this.field_70179_y * var9 / 4.0D, -this.field_70159_w, -this.field_70181_x + 0.2D, -this.field_70179_y);
/*     */         }
/*     */       }
/*     */       
/* 346 */       this.field_70165_t += this.field_70159_w;
/* 347 */       this.field_70163_u += this.field_70181_x;
/* 348 */       this.field_70161_v += this.field_70179_y;
/* 349 */       float var20 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/* 350 */       this.field_70177_z = (float)(Math.atan2(this.field_70159_w, this.field_70179_y) * 180.0D / Math.PI);
/*     */       
/* 352 */       for (this.field_70125_A = (float)(Math.atan2(this.field_70181_x, var20) * 180.0D / Math.PI); this.field_70125_A - this.field_70127_C < -180.0F; this.field_70127_C -= 360.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 357 */       while (this.field_70125_A - this.field_70127_C >= 180.0F)
/*     */       {
/* 359 */         this.field_70127_C += 360.0F;
/*     */       }
/*     */       
/* 362 */       while (this.field_70177_z - this.field_70126_B < -180.0F)
/*     */       {
/* 364 */         this.field_70126_B -= 360.0F;
/*     */       }
/*     */       
/* 367 */       while (this.field_70177_z - this.field_70126_B >= 180.0F)
/*     */       {
/* 369 */         this.field_70126_B += 360.0F;
/*     */       }
/*     */       
/* 372 */       this.field_70125_A = this.field_70127_C + (this.field_70125_A - this.field_70127_C) * 0.2F;
/* 373 */       this.field_70177_z = this.field_70126_B + (this.field_70177_z - this.field_70126_B) * 0.2F;
/* 374 */       float var22 = 0.99F;
/* 375 */       float var11 = 0.05F;
/*     */       
/* 377 */       if (func_70090_H()) {
/*     */         
/* 379 */         for (int var25 = 0; var25 < 4; var25++) {
/*     */           
/* 381 */           float var26 = 0.25F;
/* 382 */           this.field_70170_p.func_72869_a("bubble", this.field_70165_t - this.field_70159_w * var26, this.field_70163_u - this.field_70181_x * var26, this.field_70161_v - this.field_70179_y * var26, this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */         } 
/*     */         
/* 385 */         var22 = 0.8F;
/*     */       } 
/*     */       
/* 388 */       this.field_70159_w *= var22;
/* 389 */       this.field_70181_x *= var22;
/* 390 */       this.field_70179_y *= var22;
/* 391 */       this.field_70181_x -= var11;
/* 392 */       func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 393 */       func_145775_I();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70240_a(int par1) {
/* 402 */     this.knockbackStrength = par1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70239_b(double par1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public double func_70242_d() {
/* 412 */     return OreSpawnMain.UltimateBowDamage;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\UltimateArrow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */