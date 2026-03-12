/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.EnumCreatureType;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.util.IProgressUpdate;
/*     */ import net.minecraft.world.ChunkPosition;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.biome.BiomeGenBase;
/*     */ import net.minecraft.world.chunk.Chunk;
/*     */ import net.minecraft.world.chunk.IChunkProvider;
/*     */ import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
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
/*     */ public class ChunkProviderOreSpawn4
/*     */   implements IChunkProvider
/*     */ {
/*     */   private World worldObj;
/*     */   private Random random;
/*  30 */   private final Block[] cachedBlockIDs = new Block[256];
/*  31 */   private final byte[] cachedBlockMetadata = new byte[256];
/*     */ 
/*     */   
/*     */   public ChunkProviderOreSpawn4(World par1World, long par2, boolean par4) {
/*  35 */     this.worldObj = par1World;
/*  36 */     this.random = new Random(par2);
/*     */     
/*  38 */     for (int j = 0; j < 8; j++) {
/*     */       
/*  40 */       if (j == 0) { this.cachedBlockIDs[j] = Blocks.field_150357_h; }
/*  41 */       else if (j == 7) { this.cachedBlockIDs[j] = (Block)Blocks.field_150349_c; }
/*  42 */       else { this.cachedBlockIDs[j] = Blocks.field_150346_d; }
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Chunk func_73158_c(int par1, int par2) {
/*  51 */     return func_73154_d(par1, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Chunk func_73154_d(int par1, int par2) {
/*  60 */     Chunk chunk = new Chunk(this.worldObj, par1, par2);
/*     */ 
/*     */     
/*  63 */     for (int k = 0; k < this.cachedBlockIDs.length; k++) {
/*     */       
/*  65 */       Block block = this.cachedBlockIDs[k];
/*     */       
/*  67 */       if (block != null) {
/*     */         
/*  69 */         int l = k >> 4;
/*  70 */         ExtendedBlockStorage extendedblockstorage = chunk.func_76587_i()[l];
/*     */         
/*  72 */         if (extendedblockstorage == null) {
/*     */           
/*  74 */           extendedblockstorage = new ExtendedBlockStorage(k, !this.worldObj.field_73011_w.field_76576_e);
/*  75 */           chunk.func_76587_i()[l] = extendedblockstorage;
/*     */         } 
/*     */         
/*  78 */         for (int i1 = 0; i1 < 16; i1++) {
/*     */           
/*  80 */           for (int j1 = 0; j1 < 16; j1++) {
/*     */             
/*  82 */             extendedblockstorage.func_150818_a(i1, k & 0xF, j1, block);
/*  83 */             extendedblockstorage.func_76654_b(i1, k & 0xF, j1, this.cachedBlockMetadata[k]);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  89 */     addScragglyTrees(this.worldObj, par1 * 16, par2 * 16, chunk);
/*     */     
/*  91 */     chunk.func_76603_b();
/*  92 */     return chunk;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_73149_a(int par1, int par2) {
/* 100 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_73153_a(IChunkProvider par1IChunkProvider, int par2, int par3) {
/* 108 */     int k = par2 * 16;
/* 109 */     int l = par3 * 16;
/*     */     
/* 111 */     this.random.setSeed(this.worldObj.func_72905_C());
/* 112 */     long i1 = this.random.nextLong() / 2L * 2L + 1L;
/* 113 */     long j1 = this.random.nextLong() / 2L * 2L + 1L;
/* 114 */     this.random.setSeed(par2 * i1 + par3 * j1 ^ this.worldObj.func_72905_C());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_73151_a(boolean par1, IProgressUpdate par2IProgressUpdate) {
/* 125 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_104112_b() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_73156_b() {
/* 139 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_73157_c() {
/* 147 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String func_73148_d() {
/* 155 */     return "DangerDimension";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List func_73155_a(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4) {
/* 163 */     BiomeGenBase biomegenbase = this.worldObj.func_72807_a(par2, par4);
/* 164 */     return biomegenbase.func_76747_a(par1EnumCreatureType);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ChunkPosition func_147416_a(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_, int p_147416_5_) {
/* 170 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_73152_e() {
/* 175 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_82695_e(int par1, int par2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addScragglyTrees(World world, int chunkX, int chunkZ, Chunk chunk) {
/* 187 */     int howmany = 1 + this.random.nextInt(10);
/*     */ 
/*     */ 
/*     */     
/* 191 */     if (OreSpawnMain.LessLag == 1) {
/* 192 */       howmany /= 2;
/*     */     }
/* 194 */     if (OreSpawnMain.LessLag == 2) {
/* 195 */       howmany /= 4;
/*     */     }
/* 197 */     if (howmany == 0)
/*     */       return; 
/* 199 */     for (int i = 0; i < howmany; i++) {
/* 200 */       int posX = 2 + chunkX + this.random.nextInt(12);
/* 201 */       int posZ = 2 + chunkZ + this.random.nextInt(12);
/* 202 */       for (int posY = 20; posY > 2; posY--) {
/*     */         
/* 204 */         if (OreSpawnMain.getBlockIDInChunk(chunk, posX, posY - 1, posZ) == Blocks.field_150349_c) {
/*     */           
/* 206 */           ScragglyTreeWithBranches(world, posX, posY, posZ, chunk);
/*     */           break;
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
/*     */   public void makeScragglyBranch(World world, int x, int y, int z, int len, int biasx, int biasz, Chunk chunk) {
/* 219 */     for (int k = 0; k < len; k++) {
/* 220 */       int ix = this.random.nextInt(2) - this.random.nextInt(2) + biasx;
/* 221 */       int iz = this.random.nextInt(2) - this.random.nextInt(2) + biasz;
/* 222 */       if (ix > 1) ix = 1; 
/* 223 */       if (ix < -1) ix = -1; 
/* 224 */       if (iz > 1) iz = 1; 
/* 225 */       if (iz < -1) iz = -1; 
/* 226 */       int iy = (this.random.nextInt(3) > 0) ? 1 : 0;
/* 227 */       x += ix;
/* 228 */       z += iz;
/* 229 */       y += iy;
/* 230 */       Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y, z);
/* 231 */       if (bid != Blocks.field_150350_a && bid != Blocks.field_150364_r && bid != OreSpawnMain.MyAppleLeaves) {
/*     */         return;
/*     */       }
/* 234 */       OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y, z, Blocks.field_150364_r, 0);
/*     */       
/* 236 */       for (int m = -1; m < 2; m++) {
/* 237 */         for (int n = -1; n < 2; n++) {
/* 238 */           if (this.random.nextInt(2) == 1) {
/* 239 */             bid = OreSpawnMain.getBlockIDInChunk(chunk, x + m, y, z + n);
/* 240 */             if (bid == Blocks.field_150350_a) {
/* 241 */               OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + m, y, z + n, OreSpawnMain.MyAppleLeaves, 0);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 246 */       if (this.random.nextInt(2) == 1) {
/* 247 */         bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y + 1, z);
/* 248 */         if (bid == Blocks.field_150350_a) {
/* 249 */           OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y + 1, z, OreSpawnMain.MyAppleLeaves, 0);
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
/*     */   public void ScragglyTreeWithBranches(World world, int x, int y, int z, Chunk chunk) {
/* 265 */     int i = 1 + this.random.nextInt(3);
/* 266 */     int j = i + this.random.nextInt(12);
/*     */     int k;
/* 268 */     for (k = 0; k < i; k++) {
/* 269 */       Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y + k, z);
/* 270 */       if (k >= 1 && bid != Blocks.field_150350_a && bid != Blocks.field_150364_r && bid != OreSpawnMain.MyAppleLeaves) {
/*     */         return;
/*     */       }
/* 273 */       OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y + k, z, Blocks.field_150364_r, 0);
/*     */     } 
/* 275 */     y += i - 1;
/*     */     
/* 277 */     for (k = i; k < j; k++) {
/* 278 */       int ix = this.random.nextInt(2) - this.random.nextInt(2);
/* 279 */       int iz = this.random.nextInt(2) - this.random.nextInt(2);
/* 280 */       int iy = (this.random.nextInt(4) > 0) ? 1 : 0;
/* 281 */       x += ix;
/* 282 */       z += iz;
/* 283 */       y += iy;
/* 284 */       Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y, z);
/* 285 */       if (bid != Blocks.field_150350_a && bid != Blocks.field_150364_r && bid != OreSpawnMain.MyAppleLeaves) {
/*     */         break;
/*     */       }
/* 288 */       OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y, z, Blocks.field_150364_r, 0);
/* 289 */       if (this.random.nextInt(4) == 1) {
/* 290 */         makeScragglyBranch(world, x, y, z, this.random.nextInt(1 + j - k), this.random.nextInt(2) - this.random.nextInt(2), this.random.nextInt(2) - this.random.nextInt(2), chunk);
/*     */       }
/*     */       
/* 293 */       for (int m = -1; m < 2; m++) {
/* 294 */         for (int n = -1; n < 2; n++) {
/* 295 */           if (this.random.nextInt(2) == 1) {
/* 296 */             bid = OreSpawnMain.getBlockIDInChunk(chunk, x + m, y, z + n);
/* 297 */             if (bid == Blocks.field_150350_a) {
/* 298 */               OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + m, y, z + n, OreSpawnMain.MyAppleLeaves, 0);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 303 */       if (this.random.nextInt(2) == 1) {
/* 304 */         bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y + 1, z);
/* 305 */         if (bid == Blocks.field_150350_a)
/* 306 */           OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y + 1, z, OreSpawnMain.MyAppleLeaves, 0); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ChunkProviderOreSpawn4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */