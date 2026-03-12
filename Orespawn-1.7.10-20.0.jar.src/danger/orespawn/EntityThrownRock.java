/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntityThrowable;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityThrownRock
/*     */   extends EntityThrowable
/*     */ {
/*  21 */   private int rock_type = 0;
/*  22 */   private int myage = 0;
/*  23 */   private float my_rotation = 0.0F;
/*     */ 
/*     */   
/*     */   public EntityThrownRock(World par1World) {
/*  27 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityThrownRock(World par1World, int par2) {
/*  32 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityThrownRock(World par1World, EntityLivingBase par2EntityLiving) {
/*  37 */     super(par1World, par2EntityLiving);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityThrownRock(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/*  57 */     super(par1World, par2EntityLiving);
/*  58 */     this.rock_type = par3;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityThrownRock(World par1World, double par2, double par4, double par6) {
/*  63 */     super(par1World, par2, par4, par6);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  68 */     super.func_70088_a();
/*  69 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getRockType() {
/*  74 */     return this.field_70180_af.func_75679_c(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRockType(int par1) {
/*  79 */     if (this.field_70170_p == null)
/*  80 */       return;  if (this.field_70170_p.field_72995_K)
/*  81 */       return;  this.rock_type = par1;
/*  82 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*  91 */     if (this.field_70128_L)
/*  92 */       return;  if (this.field_70170_p.field_72995_K)
/*  93 */       return;  if (par1MovingObjectPosition.field_72308_g != null && func_85052_h() != null) {
/*     */       
/*  95 */       Entity e = par1MovingObjectPosition.field_72308_g;
/*  96 */       if (this.rock_type == 1 && e != func_85052_h()) {
/*  97 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 2.0F);
/*  98 */         double ks = 0.1D;
/*  99 */         double inair = 0.025D;
/* 100 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 101 */         if (e.field_70128_L) inair *= 2.0D; 
/* 102 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 104 */       if (this.rock_type == 2 && e != func_85052_h()) {
/* 105 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 5.0F);
/* 106 */         double ks = 0.2D;
/* 107 */         double inair = 0.025D;
/* 108 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 109 */         if (e.field_70128_L) inair *= 2.0D; 
/* 110 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 112 */       if (this.rock_type == 3 && e != func_85052_h()) {
/* 113 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 5.0F);
/* 114 */         double ks = 0.2D;
/* 115 */         double inair = 0.025D;
/* 116 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 117 */         if (e.field_70128_L) inair *= 2.0D; 
/* 118 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 119 */         e.func_70015_d(20);
/*     */       } 
/* 121 */       if (this.rock_type == 4 && e != func_85052_h()) {
/* 122 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 5.0F);
/* 123 */         double ks = 0.2D;
/* 124 */         double inair = 0.025D;
/* 125 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 126 */         if (e.field_70128_L) inair *= 2.0D; 
/* 127 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 128 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, 100, 0)); 
/*     */       } 
/* 130 */       if (this.rock_type == 5 && e != func_85052_h()) {
/* 131 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 10.0F);
/* 132 */         double ks = 0.1D;
/* 133 */         double inair = 0.025D;
/* 134 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 135 */         if (e.field_70128_L) inair *= 2.0D; 
/* 136 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 137 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76421_d.field_76415_H, 100, 0)); 
/*     */       } 
/* 139 */       if (this.rock_type == 6 && e != func_85052_h()) {
/* 140 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 20.0F);
/* 141 */         double ks = 0.2D;
/* 142 */         double inair = 0.025D;
/* 143 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 144 */         if (e.field_70128_L) inair *= 2.0D; 
/* 145 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 146 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76437_t.field_76415_H, 100, 0)); 
/*     */       } 
/* 148 */       if (this.rock_type == 7 && e != func_85052_h()) {
/* 149 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 40.0F);
/* 150 */         double ks = 0.2D;
/* 151 */         double inair = 0.025D;
/* 152 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 153 */         if (e.field_70128_L) inair *= 2.0D; 
/* 154 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 156 */       if (this.rock_type == 8 && e != func_85052_h()) {
/* 157 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 40.0F);
/* 158 */         double ks = 0.5D;
/* 159 */         double inair = 0.055D;
/* 160 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 161 */         if (e.field_70128_L) inair *= 2.0D; 
/* 162 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 163 */         this.field_70170_p.func_72885_a((Entity)null, e.field_70165_t, e.field_70163_u + 0.25D, e.field_70161_v, 2.1F, true, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */       } 
/*     */       
/* 166 */       if (this.rock_type == 9 && e != func_85052_h()) {
/* 167 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 150.0F);
/* 168 */         double ks = 0.2D;
/* 169 */         double inair = 0.025D;
/* 170 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 171 */         if (e.field_70128_L) inair *= 2.0D; 
/* 172 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 173 */         e.func_70015_d(50);
/* 174 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76437_t.field_76415_H, 100, 0)); 
/*     */       } 
/* 176 */       if (this.rock_type == 10 && e != func_85052_h()) {
/* 177 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 150.0F);
/* 178 */         double ks = 0.2D;
/* 179 */         double inair = 0.025D;
/* 180 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 181 */         if (e.field_70128_L) inair *= 2.0D; 
/* 182 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 183 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, 200, 0)); 
/* 184 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76437_t.field_76415_H, 100, 0)); 
/*     */       } 
/* 186 */       if (this.rock_type == 11 && e != func_85052_h()) {
/* 187 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 150.0F);
/* 188 */         double ks = 0.2D;
/* 189 */         double inair = 0.025D;
/* 190 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 191 */         if (e.field_70128_L) inair *= 2.0D; 
/* 192 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 193 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76421_d.field_76415_H, 200, 0)); 
/* 194 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76437_t.field_76415_H, 100, 0)); 
/*     */       } 
/* 196 */       if (this.rock_type == 12 && e != func_85052_h()) {
/* 197 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), 250.0F);
/* 198 */         double ks = 0.2D;
/* 199 */         double inair = 0.025D;
/* 200 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 201 */         if (e.field_70128_L) inair *= 2.0D; 
/* 202 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 203 */         if (e instanceof EntityLivingBase) ((EntityLivingBase)e).func_70690_d(new PotionEffect(Potion.field_76437_t.field_76415_H, 100, 0)); 
/* 204 */         this.field_70170_p.func_72885_a((Entity)null, e.field_70165_t, e.field_70163_u + 0.25D, e.field_70161_v, 5.1F, true, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 209 */     else if (this.rock_type != 0) {
/*     */ 
/*     */       
/* 212 */       int played = 0;
/*     */       
/* 214 */       int x = par1MovingObjectPosition.field_72311_b;
/* 215 */       int y = par1MovingObjectPosition.field_72312_c;
/* 216 */       int z = par1MovingObjectPosition.field_72309_d;
/* 217 */       for (int i = -1; i <= 1; i++) {
/* 218 */         for (int j = -1; j <= 1; j++) {
/* 219 */           for (int k = -1; k <= 1; k++) {
/* 220 */             Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + k);
/* 221 */             if (bid == Blocks.field_150359_w || bid == Blocks.field_150410_aZ || bid == Blocks.field_150359_w) {
/* 222 */               if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_147449_b(x + i, y + j, z + k, Blocks.field_150350_a); 
/* 223 */               if (played == 0) {
/* 224 */                 this.field_70170_p.func_72908_a(x, y, z, "orespawn:glassdead", 1.0F, 1.0F);
/* 225 */                 played++;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 232 */       if (!this.field_70170_p.field_72995_K) {
/* 233 */         if (this.rock_type == 1) func_145779_a(OreSpawnMain.MySmallRock, 1); 
/* 234 */         if (this.rock_type == 2) func_145779_a(OreSpawnMain.MyRock, 1); 
/* 235 */         if (this.rock_type == 3) func_145779_a(OreSpawnMain.MyRedRock, 1); 
/* 236 */         if (this.rock_type == 4) func_145779_a(OreSpawnMain.MyGreenRock, 1); 
/* 237 */         if (this.rock_type == 5) func_145779_a(OreSpawnMain.MyBlueRock, 1); 
/* 238 */         if (this.rock_type == 6) func_145779_a(OreSpawnMain.MyPurpleRock, 1); 
/* 239 */         if (this.rock_type == 7) func_145779_a(OreSpawnMain.MySpikeyRock, 1); 
/* 240 */         if (this.rock_type == 8) func_145779_a(OreSpawnMain.MyTNTRock, 1); 
/* 241 */         if (this.rock_type == 9) func_145779_a(OreSpawnMain.MyCrystalRedRock, 1); 
/* 242 */         if (this.rock_type == 10) func_145779_a(OreSpawnMain.MyCrystalGreenRock, 1); 
/* 243 */         if (this.rock_type == 11) func_145779_a(OreSpawnMain.MyCrystalBlueRock, 1); 
/* 244 */         if (this.rock_type == 12) func_145779_a(OreSpawnMain.MyCrystalTNTRock, 1);
/*     */       
/*     */       } 
/*     */     } 
/* 248 */     func_70106_y();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 258 */     int x = (int)this.field_70165_t;
/* 259 */     int y = (int)this.field_70163_u;
/* 260 */     int z = (int)this.field_70161_v;
/* 261 */     super.func_70071_h_();
/* 262 */     this.my_rotation += 30.0F;
/* 263 */     this.my_rotation %= 360.0F;
/* 264 */     this.field_70125_A = this.field_70127_C = this.my_rotation;
/* 265 */     this.myage++;
/* 266 */     if (this.myage > 1000) func_70106_y(); 
/* 267 */     if (this.field_70170_p.field_72995_K) {
/* 268 */       this.rock_type = getRockType();
/*     */     } else {
/* 270 */       setRockType(this.rock_type);
/*     */     } 
/*     */ 
/*     */     
/* 274 */     Block bid = this.field_70170_p.func_147439_a(x, y, z);
/*     */     
/* 276 */     if (bid == Blocks.field_150355_j)
/*     */     {
/*     */       
/* 279 */       if (this.field_70181_x < -0.15000000596046448D && this.field_70181_x > -0.550000011920929D && (float)(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y) > 0.5F) {
/* 280 */         this.field_70181_x = -(this.field_70181_x * 3.0D / 4.0D);
/* 281 */         this.field_70159_w = this.field_70159_w * 3.0D / 4.0D;
/* 282 */         this.field_70179_y = this.field_70179_y * 3.0D / 4.0D;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityThrownRock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */