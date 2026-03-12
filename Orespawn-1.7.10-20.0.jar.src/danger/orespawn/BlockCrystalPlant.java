/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockReed;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
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
/*     */ public class BlockCrystalPlant
/*     */   extends BlockReed
/*     */ {
/*     */   protected BlockCrystalPlant(int par1) {
/*  28 */     float var3 = 0.375F;
/*  29 */     func_149676_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
/*  30 */     func_149675_a(true);
/*  31 */     func_149647_a(CreativeTabs.field_78031_c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/*  41 */     Block bid = par1World.func_147439_a(par2, par3 - 1, par4);
/*  42 */     if (bid == Blocks.field_150350_a) return false; 
/*  43 */     if (bid == Blocks.field_150349_c || bid == Blocks.field_150346_d || bid == Blocks.field_150458_ak || bid == OreSpawnMain.CrystalGrass)
/*     */     {
/*     */       
/*  46 */       return true;
/*     */     }
/*  48 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  53 */     if (par1World.field_73012_v.nextInt(30) != 1)
/*     */       return; 
/*  55 */     for (int j1 = 0; j1 < 10; j1++)
/*     */     {
/*     */       
/*  58 */       par1World.func_72869_a("happyVillager", (par2 + par1World.field_73012_v.nextFloat()), par3 + par1World.field_73012_v.nextFloat(), (par4 + par1World.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
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
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  70 */     if (par1World.field_72995_K)
/*     */       return; 
/*  72 */     if (par1World.field_73012_v.nextInt(5) != 1) {
/*     */       return;
/*     */     }
/*     */     
/*  76 */     par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/*     */     
/*  78 */     if (this == OreSpawnMain.MyCrystalPlant) {
/*  79 */       TallCrystalTree(par1World, par2, par3, par4);
/*     */     }
/*  81 */     if (this == OreSpawnMain.MyCrystalPlant2) {
/*  82 */       ScragglyCrystalTreeWithBranches(par1World, par2, par3, par4);
/*     */     }
/*  84 */     if (this == OreSpawnMain.MyCrystalPlant3) {
/*  85 */       TallCrystalTreeBlue(par1World, par2, par3, par4);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/*  94 */     if (this == OreSpawnMain.MyCrystalPlant) return Item.func_150898_a(OreSpawnMain.MyCrystalPlant); 
/*  95 */     if (this == OreSpawnMain.MyCrystalPlant2) Item.func_150898_a(OreSpawnMain.MyCrystalPlant2); 
/*  96 */     return Item.func_150898_a(OreSpawnMain.MyCrystalPlant3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 105 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int idPicked(World par1World, int par2, int par3, int par4) {
/* 113 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getSeedItem() {
/* 121 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getCropItem() {
/* 129 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void TallCrystalTree(World world, int x, int y, int z) {
/* 139 */     int i = 10 + world.field_73012_v.nextInt(12);
/*     */     
/* 141 */     int j = i + world.field_73012_v.nextInt(18);
/*     */     int k;
/* 143 */     for (k = 0; k < i; k++) {
/* 144 */       Block bid = world.func_147439_a(x, y + k, z);
/* 145 */       if (k >= 1 && bid != Blocks.field_150350_a && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves) {
/*     */         return;
/*     */       }
/* 148 */       OreSpawnMain.setBlockFast(world, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */     } 
/* 150 */     y += i - 1;
/*     */     
/* 152 */     for (k = i; k < j; k++) {
/* 153 */       y++;
/* 154 */       Block bid = world.func_147439_a(x, y, z);
/* 155 */       if (bid != Blocks.field_150350_a && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves) {
/*     */         break;
/*     */       }
/* 158 */       OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */       
/* 160 */       if (k % 4 == 0) {
/* 161 */         for (int n = -1; n < 2; n++) {
/* 162 */           for (int i1 = -1; i1 < 2; i1++) {
/* 163 */             if (world.field_73012_v.nextInt(2) == 1) {
/* 164 */               bid = world.func_147439_a(x + n, y, z + i1);
/* 165 */               if (bid == Blocks.field_150350_a) {
/* 166 */                 OreSpawnMain.setBlockFast(world, x + n, y, z + i1, OreSpawnMain.MyCrystalLeaves, 0, 2);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 174 */     y++; int m;
/* 175 */     for (m = -1; m < 2; m++) {
/* 176 */       for (int n = -1; n < 2; n++) {
/* 177 */         if (world.field_73012_v.nextInt(2) == 1) {
/* 178 */           Block bid = world.func_147439_a(x + m, y, z + n);
/* 179 */           if (bid == Blocks.field_150350_a) {
/* 180 */             OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 185 */     for (m = -3; m < 4; m++) {
/* 186 */       for (int n = -3; n < 4; n++) {
/* 187 */         Block bid = world.func_147439_a(x + m, y, z + n);
/* 188 */         if (bid == Blocks.field_150350_a) {
/* 189 */           OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves, 0, 2);
/*     */         }
/*     */       } 
/*     */     } 
/* 193 */     y++;
/* 194 */     for (m = -1; m < 2; m++) {
/* 195 */       for (int n = -1; n < 2; n++) {
/* 196 */         Block bid = world.func_147439_a(x + m, y, z + n);
/* 197 */         if (bid == Blocks.field_150350_a) {
/* 198 */           OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves, 0, 2);
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
/*     */   public void makeScragglyCrystalBranch(World world, int x, int y, int z, int len, int biasx, int biasz) {
/* 210 */     for (int k = 0; k < len; k++) {
/* 211 */       int ix = world.field_73012_v.nextInt(2) - world.field_73012_v.nextInt(2) + biasx;
/* 212 */       int iz = world.field_73012_v.nextInt(2) - world.field_73012_v.nextInt(2) + biasz;
/* 213 */       if (ix > 1) ix = 1; 
/* 214 */       if (ix < -1) ix = -1; 
/* 215 */       if (iz > 1) iz = 1; 
/* 216 */       if (iz < -1) iz = -1; 
/* 217 */       int iy = (world.field_73012_v.nextInt(3) > 0) ? 1 : 0;
/* 218 */       x += ix;
/* 219 */       z += iz;
/* 220 */       y += iy;
/* 221 */       Block bid = world.func_147439_a(x, y, z);
/* 222 */       if (bid != Blocks.field_150350_a && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2) {
/*     */         return;
/*     */       }
/* 225 */       OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */       
/* 227 */       for (int m = -1; m < 2; m++) {
/* 228 */         for (int n = -1; n < 2; n++) {
/* 229 */           if (world.field_73012_v.nextInt(2) == 1) {
/* 230 */             bid = world.func_147439_a(x + m, y, z + n);
/* 231 */             if (bid == Blocks.field_150350_a) {
/* 232 */               OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves2, 0, 2);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 237 */       if (world.field_73012_v.nextInt(2) == 1) {
/* 238 */         bid = world.func_147439_a(x, y + 1, z);
/* 239 */         if (bid == Blocks.field_150350_a) {
/* 240 */           OreSpawnMain.setBlockFast(world, x, y + 1, z, OreSpawnMain.MyCrystalLeaves2, 0, 2);
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
/*     */ 
/*     */   
/*     */   public void ScragglyCrystalTreeWithBranches(World world, int x, int y, int z) {
/* 256 */     int i = 1 + world.field_73012_v.nextInt(2);
/* 257 */     int j = i + world.field_73012_v.nextInt(8);
/*     */     int k;
/* 259 */     for (k = 0; k < i; k++) {
/* 260 */       Block bid = world.func_147439_a(x, y + k, z);
/* 261 */       if (k >= 1 && bid != Blocks.field_150350_a && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2) {
/*     */         return;
/*     */       }
/* 264 */       OreSpawnMain.setBlockFast(world, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */     } 
/* 266 */     y += i - 1;
/*     */     
/* 268 */     for (k = i; k < j; k++) {
/* 269 */       int ix = world.field_73012_v.nextInt(2) - world.field_73012_v.nextInt(2);
/* 270 */       int iz = world.field_73012_v.nextInt(2) - world.field_73012_v.nextInt(2);
/* 271 */       int iy = (world.field_73012_v.nextInt(4) > 0) ? 1 : 0;
/* 272 */       x += ix;
/* 273 */       z += iz;
/* 274 */       y += iy;
/* 275 */       Block bid = world.func_147439_a(x, y, z);
/* 276 */       if (bid != Blocks.field_150350_a && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2) {
/*     */         break;
/*     */       }
/* 279 */       OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/* 280 */       if (world.field_73012_v.nextInt(4) == 1) {
/* 281 */         makeScragglyCrystalBranch(world, x, y, z, world.field_73012_v.nextInt(1 + j - k), world.field_73012_v.nextInt(2) - world.field_73012_v.nextInt(2), world.field_73012_v.nextInt(2) - world.field_73012_v.nextInt(2));
/*     */       }
/*     */       
/* 284 */       for (int m = -1; m < 2; m++) {
/* 285 */         for (int n = -1; n < 2; n++) {
/* 286 */           if (world.field_73012_v.nextInt(2) == 1) {
/* 287 */             bid = world.func_147439_a(x + m, y, z + n);
/* 288 */             if (bid == Blocks.field_150350_a) {
/* 289 */               OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves2, 0, 2);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 294 */       if (world.field_73012_v.nextInt(2) == 1) {
/* 295 */         bid = world.func_147439_a(x, y + 1, z);
/* 296 */         if (bid == Blocks.field_150350_a) {
/* 297 */           OreSpawnMain.setBlockFast(world, x, y + 1, z, OreSpawnMain.MyCrystalLeaves2, 0, 2);
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
/*     */   public void TallCrystalTreeBlue(World world, int x, int y, int z) {
/* 310 */     int i = 5 + world.field_73012_v.nextInt(6);
/*     */     
/* 312 */     int j = 2 + i + world.field_73012_v.nextInt(12);
/*     */     int k;
/* 314 */     for (k = 0; k < i; k++) {
/* 315 */       Block bid = world.func_147439_a(x, y + k, z);
/* 316 */       if (k >= 1 && bid != Blocks.field_150350_a && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves3) {
/*     */         return;
/*     */       }
/* 319 */       OreSpawnMain.setBlockFast(world, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */     } 
/* 321 */     y += i - 1;
/*     */     
/* 323 */     for (k = i; k < j; k++) {
/* 324 */       y++;
/* 325 */       Block bid = world.func_147439_a(x, y, z);
/* 326 */       if (bid != Blocks.field_150350_a && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves3) {
/*     */         break;
/*     */       }
/* 329 */       OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */       
/* 331 */       if (k % 3 == 0) {
/* 332 */         for (int n = -1; n < 2; n++) {
/* 333 */           for (int i1 = -1; i1 < 2; i1++) {
/* 334 */             if (world.field_73012_v.nextInt(2) == 1) {
/* 335 */               bid = world.func_147439_a(x + n, y, z + i1);
/* 336 */               if (bid == Blocks.field_150350_a) {
/* 337 */                 OreSpawnMain.setBlockFast(world, x + n, y, z + i1, OreSpawnMain.MyCrystalLeaves3, 0, 2);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 345 */     y++; int m;
/* 346 */     for (m = -1; m < 2; m++) {
/* 347 */       for (int n = -1; n < 2; n++) {
/* 348 */         if (world.field_73012_v.nextInt(2) == 1) {
/* 349 */           Block bid = world.func_147439_a(x + m, y, z + n);
/* 350 */           if (bid == Blocks.field_150350_a) {
/* 351 */             OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalTreeLog, 0, 2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 356 */     for (m = -3; m < 4; m++) {
/* 357 */       for (int n = -3; n < 4; n++) {
/* 358 */         Block bid = world.func_147439_a(x + m, y, z + n);
/* 359 */         if (bid == Blocks.field_150350_a) {
/* 360 */           OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves3, 0, 2);
/*     */         }
/*     */       } 
/*     */     } 
/* 364 */     y++;
/* 365 */     for (m = -1; m < 2; m++) {
/* 366 */       for (int n = -1; n < 2; n++) {
/* 367 */         Block bid = world.func_147439_a(x + m, y, z + n);
/* 368 */         if (bid == Blocks.field_150350_a) {
/* 369 */           OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves3, 0, 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 378 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockCrystalPlant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */