/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockReed;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
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
/*     */ public class BlockCorn
/*     */   extends BlockReed
/*     */ {
/*  22 */   private int myMaxHeight = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   protected BlockCorn(int par1) {
/*  27 */     float var3 = 0.375F;
/*  28 */     func_149676_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
/*  29 */     func_149675_a(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/*  39 */     Block bid = par1World.func_147439_a(par2, par3 - 1, par4);
/*  40 */     if (bid == Blocks.field_150350_a) return false; 
/*  41 */     if (bid == OreSpawnMain.MyCornPlant1 || bid == OreSpawnMain.MyCornPlant2 || bid == OreSpawnMain.MyCornPlant3 || bid == OreSpawnMain.MyCornPlant4 || bid == Blocks.field_150349_c || bid == Blocks.field_150346_d || bid == Blocks.field_150458_ak)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  46 */       return true;
/*     */     }
/*  48 */     return false;
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
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  60 */     int Height = 1;
/*  61 */     int dontGrow = 0;
/*     */     
/*  63 */     if (par1World.field_72995_K) {
/*     */       return;
/*     */     }
/*     */     
/*  67 */     if (this != OreSpawnMain.MyCornPlant1 && this != OreSpawnMain.MyCornPlant2)
/*     */       return; 
/*  69 */     int var7 = par1World.func_72805_g(par2, par3, par4);
/*  70 */     this.myMaxHeight = var7 >> 8;
/*  71 */     var7 &= 0xFF;
/*     */     
/*  73 */     if (this.myMaxHeight == 0) this.myMaxHeight = 4 + OreSpawnMain.OreSpawnRand.nextInt(4); 
/*  74 */     Block bid = par1World.func_147439_a(par2, par3 + 1, par4);
/*     */     
/*  76 */     if (bid == Blocks.field_150350_a) {
/*     */       
/*  78 */       for (int var6 = 1; var6 < 10; var6++) {
/*     */         
/*  80 */         bid = par1World.func_147439_a(par2, par3 - var6, par4);
/*  81 */         if (bid != OreSpawnMain.MyCornPlant1 && bid != OreSpawnMain.MyCornPlant2 && bid != OreSpawnMain.MyCornPlant3 && bid != OreSpawnMain.MyCornPlant4) {
/*     */           break;
/*     */         }
/*     */         
/*  85 */         Height++;
/*  86 */         if (bid == OreSpawnMain.MyCornPlant3 || bid == OreSpawnMain.MyCornPlant4)
/*     */         {
/*  88 */           dontGrow = 1;
/*     */         }
/*     */       } 
/*     */       
/*  92 */       if (dontGrow != 0)
/*     */       {
/*     */         
/*  95 */         this.myMaxHeight = Height;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 101 */       if (var7 >= 6 - this.myMaxHeight / 3) {
/*     */         
/* 103 */         if (Height < this.myMaxHeight) {
/*     */ 
/*     */           
/* 106 */           par1World.func_147465_d(par2, par3 + 1, par4, OreSpawnMain.MyCornPlant1, this.myMaxHeight << 8, 2);
/* 107 */           par1World.func_147465_d(par2, par3, par4, OreSpawnMain.MyCornPlant2, this.myMaxHeight << 8, 2);
/*     */         } else {
/*     */           
/* 110 */           for (int i = 1; i < this.myMaxHeight - 1; i++) {
/*     */             
/* 112 */             bid = par1World.func_147439_a(par2, par3 - i, par4);
/* 113 */             if (bid == OreSpawnMain.MyCornPlant2) {
/*     */               
/* 115 */               par1World.func_147465_d(par2, par3 - i, par4, OreSpawnMain.MyCornPlant3, this.myMaxHeight << 8, 2);
/*     */             }
/* 117 */             else if (bid == OreSpawnMain.MyCornPlant3) {
/*     */               
/* 119 */               par1World.func_147465_d(par2, par3 - i, par4, OreSpawnMain.MyCornPlant4, this.myMaxHeight << 8, 2);
/*     */             } 
/*     */           } 
/* 122 */           bid = par1World.func_147439_a(par2, par3, par4);
/* 123 */           par1World.func_147465_d(par2, par3, par4, bid, this.myMaxHeight << 8, 2);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 128 */         bid = par1World.func_147439_a(par2, par3, par4);
/* 129 */         par1World.func_147465_d(par2, par3, par4, bid, this.myMaxHeight << 8 | var7 + 1, 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/* 139 */     return OreSpawnMain.MyCornCob;
/*     */   }
/*     */   
/*     */   public Item getItem(int par1, Random par2Random, int par3) {
/* 143 */     return OreSpawnMain.MyCornCob;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 151 */     if (this == OreSpawnMain.MyCornPlant4)
/*     */     {
/* 153 */       return 1 + par1Random.nextInt(2);
/*     */     }
/* 155 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 161 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockCorn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */