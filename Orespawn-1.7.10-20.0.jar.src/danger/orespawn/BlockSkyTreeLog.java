/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockSkyTreeLog
/*     */   extends Block
/*     */ {
/*     */   protected BlockSkyTreeLog(int par1, int par2) {
/*  25 */     super(Material.field_151575_d);
/*  26 */     func_149647_a(CreativeTabs.field_78030_b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149666_a(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List) {
/*  35 */     par3List.add(new ItemStack(Item.func_150898_a(this), 1, 0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ItemStack func_149644_j(int par1) {
/*  44 */     return new ItemStack(Item.func_150898_a(this), 1, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
/*  50 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWood(IBlockAccess world, int x, int y, int z) {
/*  56 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/*  64 */     return Item.func_150898_a(OreSpawnMain.MySkyTreeLog);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void breakRecursor(World world, int x, int y, int z, int xf, int yf, int zf, int recursion) {
/*  72 */     int var7 = 1;
/*     */     
/*  74 */     if (recursion > 1000)
/*     */       return; 
/*  76 */     for (int var9 = -var7; var9 <= var7; var9++) {
/*     */       
/*  78 */       for (int var10 = -var7; var10 <= var7; var10++) {
/*     */         
/*  80 */         for (int var11 = -var7; var11 <= var7; var11++) {
/*     */ 
/*     */           
/*  83 */           if ((var9 != 0 || var10 != 0 || var11 != 0) && (
/*  84 */             x + var9 != xf || y + var10 != yf || z + var11 != zf) && (
/*  85 */             recursion <= 0 || x + var9 < xf - var7 || x + var9 > xf + var7 || y + var10 < yf - var7 || y + var10 > yf + var7 || z + var11 < zf - var7 || z + var11 > zf + var7)) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  90 */             Block var12 = world.func_147439_a(x + var9, y + var10, z + var11);
/*     */             
/*  92 */             if (var12 == this) {
/*     */               
/*  94 */               world.func_147465_d(x + var9, y + var10, z + var11, Blocks.field_150350_a, 0, 2);
/*  95 */               func_149697_b(world, x + var9, y + var10, z + var11, 0, 0);
/*  96 */               breakRecursor(world, x + var9, y + var10, z + var11, x, y, z, recursion + 1);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149664_b(World par1World, int par2, int par3, int par4, int par5) {
/* 109 */     par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/* 110 */     breakRecursor(par1World, par2, par3, par4, par2, par3, par4, 0);
/* 111 */     func_149697_b(par1World, par2, par3, par4, 0, 0);
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 116 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockSkyTreeLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */