/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockReed;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KingSpawnerBlock
/*     */   extends BlockReed
/*     */ {
/*     */   protected KingSpawnerBlock(int par1) {
/*  26 */     float var3 = 0.375F;
/*  27 */     func_149676_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
/*  28 */     func_149675_a(true);
/*  29 */     func_149647_a(CreativeTabs.field_78031_c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/*  38 */     if (par1World.func_147439_a(par2, par3 - 1, par4).func_149688_o().func_76220_a()) return true; 
/*  39 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  44 */     if (!par1World.field_72995_K) {
/*  45 */       func_149674_a(par1World, par2, par3, par4, par5Random);
/*     */       return;
/*     */     } 
/*  48 */     if (par1World.field_73012_v.nextInt(20) != 1)
/*     */       return; 
/*  50 */     for (int j1 = 0; j1 < 20; j1++)
/*     */     {
/*     */       
/*  53 */       par1World.func_72869_a("fireworksSpark", (par2 + par1World.field_73012_v.nextFloat()), par3 + par1World.field_73012_v.nextFloat(), (par4 + par1World.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149726_b(World world, int x, int y, int z) {
/*  61 */     if (world.field_72995_K)
/*  62 */       return;  world.func_147464_a(x, y, z, (Block)this, 100);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149664_b(World par1World, int par2, int par3, int par4, int par5) {
/*  71 */     func_149674_a(par1World, par2, par3, par4, (Random)null);
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
/*  82 */     if (par1World.field_72995_K)
/*     */       return; 
/*  84 */     if (OreSpawnMain.TheKingEnable != 0) { this; spawnTheKing(par1World, par2, (par3 + 8), par4); }
/*     */     
/*  86 */     par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/*  87 */     par1World.func_147465_d(par2, par3 + 1, par4, Blocks.field_150350_a, 0, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/*  95 */     return Item.func_150898_a(OreSpawnMain.MyKingSpawnerBlock);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 103 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnTheKing(World par0World, double par2, double par4, double par6) {
/* 113 */     Entity var8 = null;
/*     */ 
/*     */     
/* 116 */     var8 = EntityList.func_75620_a("The King", par0World);
/*     */     
/* 118 */     if (var8 != null) {
/*     */ 
/*     */       
/* 121 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 124 */       par0World.func_72838_d(var8);
/*     */       
/* 126 */       ((EntityLiving)var8).func_70642_aH();
/* 127 */       ((TheKing)var8).setGuardMode(1);
/*     */     } 
/*     */     
/* 130 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149718_j(World par1World, int par2, int par3, int par4) {
/* 138 */     func_149674_a(par1World, par2, par3, par4, (Random)null);
/* 139 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 147 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\KingSpawnerBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */