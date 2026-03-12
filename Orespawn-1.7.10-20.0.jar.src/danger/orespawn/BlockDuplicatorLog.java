/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockDuplicatorLog
/*    */   extends Block
/*    */ {
/*    */   protected BlockDuplicatorLog(int par1) {
/* 27 */     super(Material.field_151575_d);
/* 28 */     func_149647_a(CreativeTabs.field_78030_b);
/*    */     
/* 30 */     func_149675_a(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int tickRate() {
/* 38 */     return 1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/* 44 */     if (par1World.field_72995_K) {
/*    */       return;
/*    */     }
/* 47 */     if (OreSpawnMain.enableduplicatortree != 0) {
/* 48 */       OreSpawnMain.OreSpawnTrees.DuplicatorTree(par1World, par2, par3, par4);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149666_a(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List) {
/* 57 */     par3List.add(new ItemStack(Item.func_150898_a(this), 1, 0));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected ItemStack func_149644_j(int par1) {
/* 66 */     return new ItemStack(this, 1, 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
/* 71 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isWood(IBlockAccess world, int x, int y, int z) {
/* 77 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_149745_a(Random par1Random) {
/* 87 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 93 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockDuplicatorLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */