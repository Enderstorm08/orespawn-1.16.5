/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.AxisAlignedBB;
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
/*     */ public class Island
/*     */   extends EntityAnimal
/*     */ {
/*  29 */   private float dir = 0.0F;
/*  30 */   private float speed = 0.1F;
/*  31 */   private int radius = 5;
/*  32 */   private int depth = 3;
/*  33 */   private int timer = 73;
/*  34 */   private int just_spawned = 1;
/*  35 */   private int ticker = 0;
/*  36 */   private int once = 1;
/*     */   
/*     */   private double myX;
/*     */   private double myY;
/*     */   
/*     */   public Island(World par1World) {
/*  42 */     super(par1World);
/*  43 */     func_70105_a(0.5F, 0.5F);
/*  44 */     this.ticker = par1World.field_73012_v.nextInt(50);
/*  45 */     this.dirchange = this.field_70170_p.field_73012_v.nextInt(2500);
/*     */   }
/*     */ 
/*     */   
/*     */   private double myZ;
/*     */   private int dirchange;
/*     */   
/*     */   public void func_70071_h_() {
/*  53 */     super.func_70071_h_();
/*  54 */     this.field_70159_w = this.field_70181_x = this.field_70179_y = 0.0D;
/*  55 */     if (this.field_70170_p.field_72995_K)
/*     */       return; 
/*  57 */     if (this.once != 0) {
/*  58 */       this.myX = this.field_70165_t;
/*  59 */       this.myY = this.field_70163_u;
/*  60 */       this.myZ = this.field_70161_v;
/*  61 */       this.once = 0;
/*     */     } 
/*  63 */     if (this.just_spawned != 0) {
/*  64 */       this.dir = this.field_70170_p.field_73012_v.nextFloat() * 3.1415927F;
/*  65 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 1) this.dir *= -1.0F;
/*     */       
/*  67 */       if (this.field_70170_p.field_73012_v.nextInt(40) != 1) {
/*  68 */         this.radius = 3 + this.field_70170_p.field_73012_v.nextInt(4);
/*  69 */         this.depth = 2 + this.field_70170_p.field_73012_v.nextInt(3);
/*  70 */         this.speed = this.field_70170_p.field_73012_v.nextFloat() / 50.0F * OreSpawnMain.IslandSpeedFactor;
/*     */       } else {
/*  72 */         this.radius = 6 + this.field_70170_p.field_73012_v.nextInt(5);
/*  73 */         this.depth = 3 + this.field_70170_p.field_73012_v.nextInt(4);
/*  74 */         this.speed = this.field_70170_p.field_73012_v.nextFloat() / 200.0F * OreSpawnMain.IslandSpeedFactor;
/*     */       } 
/*     */       
/*  77 */       create_island();
/*  78 */       this.ticker = this.field_70170_p.field_73012_v.nextInt(50);
/*  79 */       this.dirchange = this.field_70170_p.field_73012_v.nextInt(10000);
/*     */     } 
/*     */     
/*  82 */     this.ticker++;
/*  83 */     if (this.ticker >= this.timer) {
/*  84 */       update_island();
/*  85 */       this.ticker = 0;
/*     */     } 
/*  87 */     this.dirchange--;
/*  88 */     if (this.dirchange <= 0) {
/*  89 */       this.dirchange = this.field_70170_p.field_73012_v.nextInt(5000);
/*  90 */       this.dir = this.field_70170_p.field_73012_v.nextFloat() * 3.1415927F;
/*  91 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 1) this.dir *= -1.0F;
/*     */     
/*     */     } 
/*  94 */     this.just_spawned = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/*  99 */     if (this.field_70170_p.field_72995_K) {
/* 100 */       super.func_70636_d();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70629_bd() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 120 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 127 */     super.func_70037_a(par1NBTTagCompound);
/* 128 */     this.just_spawned = par1NBTTagCompound.func_74762_e("JustSpawned");
/*     */     
/* 130 */     this.depth = par1NBTTagCompound.func_74762_e("Idepth");
/* 131 */     this.radius = par1NBTTagCompound.func_74762_e("Iradius");
/*     */     
/* 133 */     this.speed = par1NBTTagCompound.func_74760_g("Ispeed");
/* 134 */     this.dir = par1NBTTagCompound.func_74760_g("Idir");
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 139 */     super.func_70014_b(par1NBTTagCompound);
/* 140 */     par1NBTTagCompound.func_74768_a("JustSpawned", this.just_spawned);
/*     */     
/* 142 */     par1NBTTagCompound.func_74768_a("Idepth", this.depth);
/* 143 */     par1NBTTagCompound.func_74768_a("Iradius", this.radius);
/*     */     
/* 145 */     par1NBTTagCompound.func_74776_a("Ispeed", this.speed);
/* 146 */     par1NBTTagCompound.func_74776_a("Idir", this.dir);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 152 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void create_island() {
/* 161 */     double deltadir = 0.10471975333333333D;
/* 162 */     double deltamag = 0.3499999940395355D;
/*     */ 
/*     */ 
/*     */     
/* 166 */     int ixlast = 0, izlast = 0;
/* 167 */     int xoff = 0;
/* 168 */     int zoff = 0;
/*     */ 
/*     */ 
/*     */     
/* 172 */     for (int i = 0; i < this.depth; i++) {
/* 173 */       ixlast = izlast = 0; double curdir;
/* 174 */       for (curdir = -3.1415926D; curdir < 3.1415926D; curdir += deltadir) {
/* 175 */         double tradius = this.radius;
/* 176 */         tradius /= (i + 1);
/*     */         double h;
/* 178 */         for (h = 0.75D; h < tradius; h += deltamag) {
/* 179 */           int ix = (int)(this.field_70165_t + Math.cos(curdir + this.dir) * h);
/* 180 */           int iz = (int)(this.field_70161_v + Math.sin(curdir + this.dir) * h);
/* 181 */           if (ix != ixlast || iz != izlast) {
/* 182 */             ixlast = ix;
/* 183 */             izlast = iz;
/* 184 */             if (i == 0) {
/* 185 */               Block bid; if ((bid = this.field_70170_p.func_147439_a(ix, (int)this.field_70163_u - i + 1, iz)) == Blocks.field_150350_a) {
/* 186 */                 if (this.field_70170_p.field_73012_v.nextInt(5000) == 1) {
/* 187 */                   this.field_70170_p.func_147449_b(ix, (int)this.field_70163_u - i + 1, iz, Blocks.field_150353_l);
/*     */                 } else {
/* 189 */                   FastSetBlock(ix, (int)this.field_70163_u - i + 1, iz, (Block)Blocks.field_150391_bh);
/* 190 */                   if (this.field_70170_p.field_73012_v.nextInt(20) == 1 && 
/* 191 */                     this.field_70170_p.func_147439_a(ix, (int)this.field_70163_u - i + 2, iz) == Blocks.field_150350_a) {
/* 192 */                     if (this.field_70170_p.field_73012_v.nextInt(2) == 1) {
/* 193 */                       this.field_70170_p.func_147449_b(ix, (int)this.field_70163_u - i + 2, iz, (Block)Blocks.field_150338_P);
/*     */                     } else {
/* 195 */                       this.field_70170_p.func_147449_b(ix, (int)this.field_70163_u - i + 2, iz, (Block)Blocks.field_150337_Q);
/*     */                     }
/*     */                   
/*     */                   }
/*     */                 }
/*     */               
/* 201 */               } else if (bid == Blocks.field_150357_h) {
/* 202 */                 func_70106_y();
/*     */ 
/*     */                 
/*     */                 return;
/*     */               } 
/* 207 */             } else if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 208 */               FastSetBlock(ix, (int)this.field_70163_u - i + 1, iz, Blocks.field_150482_ag);
/*     */             } else {
/* 210 */               FastSetBlock(ix, (int)this.field_70163_u - i + 1, iz, Blocks.field_150377_bs);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 218 */     if (this.field_70165_t < 0.0D) xoff = -1; 
/* 219 */     if (this.field_70161_v < 0.0D) zoff = -1; 
/* 220 */     this.field_70170_p.func_147449_b((int)this.field_70165_t + xoff, (int)this.field_70163_u, (int)this.field_70161_v + zoff, Blocks.field_150350_a);
/* 221 */     FastSetBlock((int)this.field_70165_t + xoff, (int)this.field_70163_u, (int)this.field_70161_v + zoff, Blocks.field_150350_a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void update_island() {
/* 229 */     double deltadir = 0.10471975333333333D;
/* 230 */     double deltamag = 0.3499999940395355D;
/*     */     
/* 232 */     double pi2 = 1.57079632675D;
/*     */ 
/*     */     
/* 235 */     int ixlast = 0, izlast = 0;
/* 236 */     int xoff = 0;
/* 237 */     int zoff = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 242 */     this.myX += this.speed * Math.cos(this.dir);
/* 243 */     this.myZ += this.speed * Math.sin(this.dir);
/*     */     
/* 245 */     int mx = (int)this.myX, mz = (int)this.myZ;
/* 246 */     int px = (int)this.field_70165_t, pz = (int)this.field_70161_v;
/* 247 */     if (mx != px || mz != pz) {
/*     */       int i;
/*     */       
/* 250 */       for (i = 0; i < this.depth; i++) {
/* 251 */         ixlast = izlast = 0; double curdir;
/* 252 */         for (curdir = -3.3D; curdir < 3.3D; curdir += deltadir / 2.0D) {
/*     */           
/* 254 */           double tradius = this.radius;
/* 255 */           tradius /= (i + 1);
/*     */           double h;
/* 257 */           for (h = 0.75D; h < tradius;) {
/* 258 */             h += deltamag;
/*     */           }
/* 260 */           h -= deltamag;
/* 261 */           if (h < 0.75D) h = 0.75D; 
/* 262 */           for (; h < tradius + deltamag; h += deltamag / 2.0D) {
/* 263 */             int ix = (int)(this.field_70165_t + Math.cos(curdir + this.dir) * h);
/* 264 */             int iz = (int)(this.field_70161_v + Math.sin(curdir + this.dir) * h);
/* 265 */             if (ix != ixlast || iz != izlast) {
/* 266 */               ixlast = ix;
/* 267 */               izlast = iz;
/*     */ 
/*     */               
/* 270 */               if (i == 0) {
/*     */                 
/* 272 */                 Block bid = this.field_70170_p.func_147439_a(ix, (int)this.field_70163_u + 1 + 1, iz);
/* 273 */                 if (bid == Blocks.field_150337_Q || bid == Blocks.field_150338_P) {
/* 274 */                   FastSetBlock(ix, (int)this.field_70163_u + 1 + 1, iz, Blocks.field_150350_a);
/*     */                 }
/*     */               } 
/* 277 */               FastSetBlock(ix, (int)this.field_70163_u - i + 1, iz, Blocks.field_150350_a);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 283 */       if (this.field_70165_t < 0.0D) xoff = -1; 
/* 284 */       if (this.field_70161_v < 0.0D) zoff = -1; 
/* 285 */       this.field_70170_p.func_147449_b((int)this.field_70165_t + xoff, (int)this.field_70163_u, (int)this.field_70161_v + zoff, Blocks.field_150377_bs);
/*     */       
/* 287 */       this.field_70165_t = (int)this.myX;
/* 288 */       if (this.myX < 0.0D) {
/* 289 */         this.field_70165_t -= 0.5D;
/*     */       } else {
/* 291 */         this.field_70165_t += 0.5D;
/*     */       } 
/* 293 */       this.field_70161_v = (int)this.myZ;
/* 294 */       if (this.myZ < 0.0D) {
/* 295 */         this.field_70161_v -= 0.5D;
/*     */       } else {
/* 297 */         this.field_70161_v += 0.5D;
/*     */       } 
/*     */ 
/*     */       
/* 301 */       for (i = 0; i < this.depth; i++) {
/* 302 */         ixlast = izlast = 0; double curdir;
/* 303 */         for (curdir = -3.1415926D; curdir < 3.1415926D; curdir += deltadir) {
/*     */           
/* 305 */           double tradius = this.radius;
/* 306 */           tradius /= (i + 1);
/*     */           double h;
/* 308 */           for (h = 0.75D; h < tradius;) {
/* 309 */             h += deltamag;
/*     */           }
/* 311 */           h -= deltamag * 3.0D;
/* 312 */           if (h < 0.75D) h = 0.75D; 
/* 313 */           for (; h < tradius; h += deltamag) {
/* 314 */             int ix = (int)(this.field_70165_t + Math.cos(curdir + this.dir) * h);
/* 315 */             int iz = (int)(this.field_70161_v + Math.sin(curdir + this.dir) * h);
/* 316 */             if (ix != ixlast || iz != izlast) {
/* 317 */               ixlast = ix;
/* 318 */               izlast = iz;
/* 319 */               if (i == 0) {
/* 320 */                 Block bid; if ((bid = this.field_70170_p.func_147439_a(ix, (int)this.field_70163_u - i + 1, iz)) == Blocks.field_150350_a) {
/* 321 */                   if (this.field_70170_p.field_73012_v.nextInt(5000) == 1) {
/* 322 */                     this.field_70170_p.func_147449_b(ix, (int)this.field_70163_u - i + 1, iz, Blocks.field_150353_l);
/*     */                   } else {
/* 324 */                     FastSetBlock(ix, (int)this.field_70163_u - i + 1, iz, (Block)Blocks.field_150391_bh);
/* 325 */                     if (this.field_70170_p.field_73012_v.nextInt(20) == 1 && 
/* 326 */                       this.field_70170_p.func_147439_a(ix, (int)this.field_70163_u - i + 2, iz) == Blocks.field_150350_a) {
/* 327 */                       if (this.field_70170_p.field_73012_v.nextInt(2) == 1) {
/* 328 */                         this.field_70170_p.func_147449_b(ix, (int)this.field_70163_u - i + 2, iz, (Block)Blocks.field_150338_P);
/*     */                       } else {
/* 330 */                         this.field_70170_p.func_147449_b(ix, (int)this.field_70163_u - i + 2, iz, (Block)Blocks.field_150337_Q);
/*     */                       }
/*     */                     
/*     */                     }
/*     */                   }
/*     */                 
/* 336 */                 } else if (bid == Blocks.field_150357_h) {
/* 337 */                   func_70106_y();
/*     */                   
/*     */                   return;
/*     */                 } 
/*     */               } else {
/* 342 */                 Block bid = this.field_70170_p.func_147439_a(ix, (int)this.field_70163_u - i + 1, iz);
/* 343 */                 if (bid == Blocks.field_150348_b) {
/* 344 */                   if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72876_a((Entity)this, ix, this.field_70163_u - i + 1.0D, iz, 5.0F, true);
/*     */                 
/*     */                 }
/* 347 */                 else if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 348 */                   FastSetBlock(ix, (int)this.field_70163_u - i + 1, iz, Blocks.field_150482_ag);
/*     */                 } else {
/* 350 */                   FastSetBlock(ix, (int)this.field_70163_u - i + 1, iz, Blocks.field_150377_bs);
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 357 */       xoff = 0;
/* 358 */       if (this.field_70165_t < 0.0D) xoff = -1; 
/* 359 */       zoff = 0;
/* 360 */       if (this.field_70161_v < 0.0D) zoff = -1; 
/* 361 */       this.field_70170_p.func_147449_b((int)this.field_70165_t + xoff, (int)this.field_70163_u, (int)this.field_70161_v + zoff, Blocks.field_150350_a);
/* 362 */       FastSetBlock((int)this.field_70165_t + xoff, (int)this.field_70163_u, (int)this.field_70161_v + zoff, Blocks.field_150350_a);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 368 */     if (this.field_70170_p.field_73012_v.nextInt(2 + 2000 / this.timer) == 1) {
/* 369 */       AxisAlignedBB bb = AxisAlignedBB.func_72330_a(this.field_70165_t - 10.0D, this.field_70163_u - 5.0D, this.field_70161_v - 10.0D, this.field_70165_t + 10.0D, this.field_70163_u + 5.0D, this.field_70161_v + 10.0D);
/* 370 */       List var5 = this.field_70170_p.func_72872_a(Triffid.class, bb);
/* 371 */       Iterator var2 = var5.iterator();
/* 372 */       if (!var2.hasNext())
/*     */       {
/*     */         
/* 375 */         EntityCreature newent = (EntityCreature)spawnCreature(this.field_70170_p, "Triffid", this.field_70165_t, this.field_70163_u + 2.01D, this.field_70161_v);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 382 */     Entity var8 = null;
/* 383 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 384 */     if (var8 != null) {
/*     */ 
/*     */       
/* 387 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 390 */       par0World.func_72838_d(var8);
/*     */       
/* 392 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/* 394 */     return var8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 399 */     return Item.func_150898_a(OreSpawnMain.MyIslandBlock);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void FastSetBlock(int ix, int iy, int iz, Block id) {
/* 406 */     OreSpawnMain.setBlockFast(this.field_70170_p, ix, iy, iz, id, 0, 3);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Island.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */