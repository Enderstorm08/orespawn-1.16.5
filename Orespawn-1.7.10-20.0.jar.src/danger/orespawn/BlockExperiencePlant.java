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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockExperiencePlant
/*     */   extends BlockReed
/*     */ {
/*     */   protected BlockExperiencePlant(int par1) {
/*  26 */     float var3 = 0.375F;
/*  27 */     func_149676_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
/*  28 */     func_149675_a(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/*  38 */     Block bid = par1World.func_147439_a(par2, par3 - 1, par4);
/*  39 */     if (bid == Blocks.field_150350_a) return false; 
/*  40 */     if (bid == Blocks.field_150349_c || bid == Blocks.field_150346_d || bid == Blocks.field_150458_ak)
/*     */     {
/*     */       
/*  43 */       return true;
/*     */     }
/*  45 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  50 */     if (par1World.field_73012_v.nextInt(20) != 1)
/*     */       return; 
/*  52 */     for (int j1 = 0; j1 < 20; j1++)
/*     */     {
/*     */       
/*  55 */       par1World.func_72869_a("happyVillager", (par2 + par1World.field_73012_v.nextFloat()), par3 + par1World.field_73012_v.nextFloat(), (par4 + par1World.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
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
/*  67 */     if (par1World.field_72995_K)
/*     */       return; 
/*  69 */     if (par1World.field_73012_v.nextInt(10) != 1) {
/*     */       return;
/*     */     }
/*     */     
/*  73 */     par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/*     */     
/*  75 */     OreSpawnMain.OreSpawnTrees.ExperienceTree(par1World, par2, par3 - 1, par4);
/*     */   }
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
/*  80 */     return Item.func_150898_a(OreSpawnMain.MyExperiencePlant);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/*  88 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int idPicked(World par1World, int par2, int par3, int par4) {
/*  96 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item getSeedItem() {
/* 104 */     return OreSpawnMain.MyExperienceTreeSeed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getCropItem() {
/* 112 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 118 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockExperiencePlant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */