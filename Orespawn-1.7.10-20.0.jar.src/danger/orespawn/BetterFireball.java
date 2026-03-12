/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.projectile.EntityFireball;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class BetterFireball
/*     */   extends EntityFireball
/*     */ {
/*  22 */   private int xTile = -1;
/*  23 */   private int yTile = -1;
/*  24 */   private int zTile = -1;
/*  25 */   private int inTile = 0;
/*     */   private boolean inGround = false;
/*     */   public EntityLivingBase field_70235_a;
/*     */   private int ticksAlive;
/*  29 */   private int ticksInAir = 0;
/*     */   public double field_70232_b;
/*     */   public double field_70233_c;
/*     */   public double field_70230_d;
/*  33 */   public int field_92012_e = 1;
/*  34 */   private int notme = 0;
/*     */   
/*     */   private boolean small = false;
/*     */   
/*     */   public BetterFireball(World par1World) {
/*  39 */     super(par1World);
/*  40 */     func_70105_a(1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {}
/*     */   
/*     */   public BetterFireball(World par1World, EntityLivingBase par2EntityLiving, double par3, double par5, double par7) {
/*  47 */     super(par1World);
/*     */     
/*  49 */     this.field_70235_a = par2EntityLiving;
/*  50 */     func_70105_a(1.0F, 1.0F);
/*  51 */     func_70012_b(par2EntityLiving.field_70165_t, par2EntityLiving.field_70163_u, par2EntityLiving.field_70161_v, par2EntityLiving.field_70177_z, par2EntityLiving.field_70125_A);
/*  52 */     func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  53 */     this.field_70129_M = 0.0F;
/*  54 */     this.field_70159_w = this.field_70181_x = this.field_70179_y = 0.0D;
/*     */ 
/*     */ 
/*     */     
/*  58 */     double var9 = MathHelper.func_76133_a(par3 * par3 + par5 * par5 + par7 * par7);
/*  59 */     this.field_70232_b = par3 / var9 * 0.1D;
/*  60 */     this.field_70233_c = par5 / var9 * 0.1D;
/*  61 */     this.field_70230_d = par7 / var9 * 0.1D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotMe() {
/*  67 */     this.notme = 1;
/*     */   }
/*     */   
/*     */   public void setBig() {
/*  71 */     this.field_92012_e = 2;
/*     */   }
/*     */   
/*     */   public void setReallyBig() {
/*  75 */     this.field_92012_e = 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSmall() {
/*  80 */     this.small = true;
/*  81 */     func_70105_a(0.3125F, 0.3125F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  90 */     Vec3 var15 = null;
/*  91 */     Vec3 var2 = null;
/*  92 */     MovingObjectPosition var3 = null;
/*  93 */     Entity var4 = null;
/*  94 */     List<Entity> var5 = null;
/*  95 */     double var6 = 0.0D;
/*  96 */     Entity var9 = null;
/*     */     
/*  98 */     float var10 = 0.3F;
/*  99 */     double var13 = 0.0D;
/* 100 */     float var16 = 0.0F;
/* 101 */     float var17 = 0.0F;
/* 102 */     float var18 = 0.0F;
/*     */ 
/*     */     
/* 105 */     if (this.ticksAlive >= 600 || this.ticksInAir >= 600) {
/*     */       
/* 107 */       func_70106_y();
/*     */       
/*     */       return;
/*     */     } 
/* 111 */     if (!this.field_70170_p.field_72995_K && ((this.field_70235_a != null && this.field_70235_a.field_70128_L) || !this.field_70170_p.func_72899_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v))) {
/*     */       
/* 113 */       func_70106_y();
/*     */     }
/*     */     else {
/*     */       
/* 117 */       super.func_70071_h_();
/* 118 */       func_70015_d(1);
/*     */       
/* 120 */       if (this.inGround) {
/*     */         
/* 122 */         Block var1 = this.field_70170_p.func_147439_a(this.xTile, this.yTile, this.zTile);
/*     */         
/* 124 */         if (var1 != Blocks.field_150350_a)
/*     */         {
/* 126 */           this.ticksAlive++;
/*     */         }
/*     */         
/* 129 */         this.inGround = false;
/* 130 */         this.field_70159_w *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 131 */         this.field_70181_x *= (this.field_70146_Z.nextFloat() * 0.2F);
/* 132 */         this.field_70179_y *= (this.field_70146_Z.nextFloat() * 0.2F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 138 */         this.ticksInAir++;
/*     */       } 
/*     */       
/* 141 */       var15 = Vec3.func_72443_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 142 */       var2 = Vec3.func_72443_a(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
/* 143 */       var3 = this.field_70170_p.func_72901_a(var15, var2, false);
/* 144 */       var15 = Vec3.func_72443_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/* 145 */       var2 = Vec3.func_72443_a(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
/*     */       
/* 147 */       if (var3 != null)
/*     */       {
/* 149 */         var2 = Vec3.func_72443_a(var3.field_72307_f.field_72450_a, var3.field_72307_f.field_72448_b, var3.field_72307_f.field_72449_c);
/*     */       }
/*     */       
/* 152 */       var4 = null;
/* 153 */       var5 = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72321_a(this.field_70159_w, this.field_70181_x, this.field_70179_y).func_72314_b(1.0D, 1.0D, 1.0D));
/* 154 */       var6 = 0.0D;
/*     */       
/* 156 */       for (int var8 = 0; var8 < var5.size(); var8++) {
/*     */         
/* 158 */         var9 = var5.get(var8);
/* 159 */         if (this.field_70235_a == var9) {
/* 160 */           var3 = null;
/*     */           break;
/*     */         } 
/* 163 */         if (var9 instanceof BetterFireball) {
/* 164 */           var3 = null;
/*     */           break;
/*     */         } 
/* 167 */         if (var9 instanceof GodzillaHead) {
/* 168 */           var3 = null;
/*     */           break;
/*     */         } 
/* 171 */         if (MyUtils.isRoyalty(var9)) {
/* 172 */           var3 = null;
/*     */           
/*     */           break;
/*     */         } 
/* 176 */         if (this.notme != 0 && (
/* 177 */           var9 instanceof net.minecraft.entity.player.EntityPlayer || var9 instanceof Dragon || var9 instanceof Mothra)) {
/* 178 */           var3 = null;
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/* 183 */         if (var9.func_70067_L() && (!var9.func_70028_i((Entity)this.field_70235_a) || this.ticksInAir >= 25)) {
/*     */ 
/*     */           
/* 186 */           AxisAlignedBB var11 = var9.field_70121_D.func_72314_b(var10, var10, var10);
/* 187 */           MovingObjectPosition var12 = var11.func_72327_a(var15, var2);
/*     */           
/* 189 */           if (var12 != null) {
/*     */             
/* 191 */             var13 = var15.func_72438_d(var12.field_72307_f);
/*     */             
/* 193 */             if (var13 < var6 || var6 == 0.0D) {
/*     */               
/* 195 */               var4 = var9;
/* 196 */               var6 = var13;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 202 */       if (var4 != null)
/*     */       {
/* 204 */         var3 = new MovingObjectPosition(var4);
/*     */       }
/*     */       
/* 207 */       if (var3 != null)
/*     */       {
/* 209 */         func_70227_a(var3);
/*     */       }
/*     */       
/* 212 */       this.field_70165_t += this.field_70159_w;
/* 213 */       this.field_70163_u += this.field_70181_x;
/* 214 */       this.field_70161_v += this.field_70179_y;
/* 215 */       var16 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/* 216 */       this.field_70177_z = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) + 90.0F;
/*     */       
/* 218 */       for (this.field_70125_A = (float)(Math.atan2(var16, this.field_70181_x) * 180.0D / Math.PI) - 90.0F; this.field_70125_A - this.field_70127_C < -180.0F; this.field_70127_C -= 360.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 223 */       while (this.field_70125_A - this.field_70127_C >= 180.0F)
/*     */       {
/* 225 */         this.field_70127_C += 360.0F;
/*     */       }
/*     */       
/* 228 */       while (this.field_70177_z - this.field_70126_B < -180.0F)
/*     */       {
/* 230 */         this.field_70126_B -= 360.0F;
/*     */       }
/*     */       
/* 233 */       while (this.field_70177_z - this.field_70126_B >= 180.0F)
/*     */       {
/* 235 */         this.field_70126_B += 360.0F;
/*     */       }
/*     */       
/* 238 */       this.field_70125_A = this.field_70127_C + (this.field_70125_A - this.field_70127_C) * 0.2F;
/* 239 */       this.field_70177_z = this.field_70126_B + (this.field_70177_z - this.field_70126_B) * 0.2F;
/* 240 */       var17 = func_82341_c();
/*     */       
/* 242 */       if (func_70090_H()) {
/*     */         
/* 244 */         for (int var19 = 0; var19 < 4; var19++) {
/*     */           
/* 246 */           var18 = 0.25F;
/* 247 */           this.field_70170_p.func_72869_a("bubble", this.field_70165_t - this.field_70159_w * var18, this.field_70163_u - this.field_70181_x * var18, this.field_70161_v - this.field_70179_y * var18, this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */         } 
/*     */         
/* 250 */         var17 = 0.8F;
/*     */       } 
/*     */       
/* 253 */       this.field_70159_w += this.field_70232_b;
/* 254 */       this.field_70181_x += this.field_70233_c;
/* 255 */       this.field_70179_y += this.field_70230_d;
/* 256 */       this.field_70159_w *= var17;
/* 257 */       this.field_70181_x *= var17;
/* 258 */       this.field_70179_y *= var17;
/* 259 */       this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u + 0.5D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 260 */       func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70227_a(MovingObjectPosition par1MovingObjectPosition) {
/* 269 */     if (!this.field_70170_p.field_72995_K) {
/*     */       
/* 271 */       if (par1MovingObjectPosition.field_72308_g != null) {
/* 272 */         if (par1MovingObjectPosition.field_72308_g instanceof BetterFireball)
/* 273 */           return;  if (par1MovingObjectPosition.field_72308_g instanceof Mothra)
/* 274 */           return;  if (this.notme != 0 && (
/* 275 */           par1MovingObjectPosition.field_72308_g instanceof Dragon || par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.player.EntityPlayer)) {
/* 276 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/* 280 */         Entity e = par1MovingObjectPosition.field_72308_g;
/* 281 */         if (e instanceof EntityLiving) {
/* 282 */           EntityLiving el = (EntityLiving)e;
/* 283 */           if (el.field_70130_N * el.field_70131_O > 30.0F && 
/* 284 */             !MyUtils.isRoyalty((Entity)el) && !(el instanceof Godzilla) && !(el instanceof GodzillaHead) && !(el instanceof PitchBlack) && !(el instanceof Kraken))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 290 */             el.func_70606_j(el.func_110143_aJ() / 2.0F);
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 295 */         if (!this.small) {
/* 296 */           par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76362_a(this, (Entity)this.field_70235_a), 10.0F);
/* 297 */           par1MovingObjectPosition.field_72308_g.func_70015_d(5);
/*     */         } else {
/* 299 */           par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76362_a(this, (Entity)this.field_70235_a), 5.0F);
/* 300 */           par1MovingObjectPosition.field_72308_g.func_70015_d(5);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 305 */         int i = par1MovingObjectPosition.field_72311_b;
/* 306 */         int j = par1MovingObjectPosition.field_72312_c;
/* 307 */         int k = par1MovingObjectPosition.field_72309_d;
/*     */         
/* 309 */         switch (par1MovingObjectPosition.field_72310_e) {
/*     */           
/*     */           case 0:
/* 312 */             j--;
/*     */             break;
/*     */           case 1:
/* 315 */             j++;
/*     */             break;
/*     */           case 2:
/* 318 */             k--;
/*     */             break;
/*     */           case 3:
/* 321 */             k++;
/*     */             break;
/*     */           case 4:
/* 324 */             i--;
/*     */             break;
/*     */           case 5:
/* 327 */             i++;
/*     */             break;
/*     */         } 
/* 330 */         if (this.field_70170_p.func_147437_c(i, j, k))
/*     */         {
/* 332 */           this.field_70170_p.func_147449_b(i, j, k, (Block)Blocks.field_150480_ab);
/*     */         }
/*     */       } 
/*     */       
/* 336 */       if (!this.small) {
/* 337 */         this.field_70170_p.func_72885_a((Entity)null, this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_92012_e, true, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */       }
/*     */       
/* 340 */       func_70106_y();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 349 */     super.func_70014_b(par1NBTTagCompound);
/* 350 */     par1NBTTagCompound.func_74768_a("ExplosionPower", this.field_92012_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 358 */     super.func_70037_a(par1NBTTagCompound);
/*     */     
/* 360 */     if (par1NBTTagCompound.func_74764_b("ExplosionPower"))
/*     */     {
/* 362 */       this.field_92012_e = par1NBTTagCompound.func_74762_e("ExplosionPower");
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BetterFireball.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */