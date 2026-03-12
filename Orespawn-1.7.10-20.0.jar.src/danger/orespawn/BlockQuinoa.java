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
/*     */ public class BlockQuinoa
/*     */   extends BlockReed
/*     */ {
/*  22 */   private int myMaxHeight = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   protected BlockQuinoa(int par1) {
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
/*  41 */     if (bid == OreSpawnMain.MyQuinoaPlant1 || bid == OreSpawnMain.MyQuinoaPlant2 || bid == OreSpawnMain.MyQuinoaPlant3 || bid == OreSpawnMain.MyQuinoaPlant4 || bid == Blocks.field_150349_c || bid == Blocks.field_150346_d || bid == Blocks.field_150458_ak || bid == OreSpawnMain.CrystalGrass)
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
/*  63 */     if (par1World.field_72995_K)
/*     */       return; 
/*  65 */     if (this != OreSpawnMain.MyQuinoaPlant1 && this != OreSpawnMain.MyQuinoaPlant3)
/*     */       return; 
/*  67 */     int var7 = par1World.func_72805_g(par2, par3, par4);
/*  68 */     this.myMaxHeight = var7 >> 8;
/*  69 */     var7 &= 0xFF;
/*     */     
/*  71 */     if (this.myMaxHeight == 0) this.myMaxHeight = 2 + OreSpawnMain.OreSpawnRand.nextInt(3); 
/*  72 */     Block bid = par1World.func_147439_a(par2, par3 + 1, par4);
/*     */     
/*  74 */     if (bid == Blocks.field_150350_a) {
/*     */       
/*  76 */       for (int var6 = 1; var6 < 10; var6++) {
/*     */         
/*  78 */         bid = par1World.func_147439_a(par2, par3 - var6, par4);
/*  79 */         if (bid != OreSpawnMain.MyQuinoaPlant1 && bid != OreSpawnMain.MyQuinoaPlant2 && bid != OreSpawnMain.MyQuinoaPlant3 && bid != OreSpawnMain.MyQuinoaPlant4) {
/*     */           break;
/*     */         }
/*     */         
/*  83 */         Height++;
/*  84 */         if (bid == OreSpawnMain.MyQuinoaPlant3 || bid == OreSpawnMain.MyQuinoaPlant4)
/*     */         {
/*  86 */           dontGrow = 1;
/*     */         }
/*     */       } 
/*     */       
/*  90 */       if (dontGrow != 0)
/*     */       {
/*     */         
/*  93 */         this.myMaxHeight = Height;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  99 */       if (var7 >= 5 - this.myMaxHeight / 3) {
/*     */         
/* 101 */         if (Height < this.myMaxHeight) {
/*     */ 
/*     */           
/* 104 */           par1World.func_147465_d(par2, par3 + 1, par4, OreSpawnMain.MyQuinoaPlant1, this.myMaxHeight << 8, 2);
/* 105 */           par1World.func_147465_d(par2, par3, par4, OreSpawnMain.MyQuinoaPlant2, this.myMaxHeight << 8, 2);
/*     */         } else {
/*     */           
/* 108 */           bid = par1World.func_147439_a(par2, par3, par4);
/* 109 */           if (bid == OreSpawnMain.MyQuinoaPlant1) {
/*     */             
/* 111 */             par1World.func_147465_d(par2, par3, par4, OreSpawnMain.MyQuinoaPlant3, this.myMaxHeight << 8, 2);
/*     */           }
/* 113 */           else if (bid == OreSpawnMain.MyQuinoaPlant3) {
/*     */             
/* 115 */             par1World.func_147465_d(par2, par3, par4, OreSpawnMain.MyQuinoaPlant4, this.myMaxHeight << 8, 2);
/*     */           } 
/*     */           
/* 118 */           bid = par1World.func_147439_a(par2, par3, par4);
/* 119 */           par1World.func_147465_d(par2, par3, par4, bid, this.myMaxHeight << 8, 2);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 124 */         bid = par1World.func_147439_a(par2, par3, par4);
/* 125 */         par1World.func_147465_d(par2, par3, par4, bid, this.myMaxHeight << 8 | var7 + 1, 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/* 135 */     return OreSpawnMain.MyQuinoa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 143 */     if (this == OreSpawnMain.MyQuinoaPlant4)
/*     */     {
/* 145 */       return 3 + par1Random.nextInt(3);
/*     */     }
/* 147 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item itemPicked(World par1World, int par2, int par3, int par4) {
/* 155 */     return OreSpawnMain.MyQuinoa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item getSeedItem() {
/* 163 */     return OreSpawnMain.MyQuinoa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item getCropItem() {
/* 171 */     return OreSpawnMain.MyQuinoa;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 177 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockQuinoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */