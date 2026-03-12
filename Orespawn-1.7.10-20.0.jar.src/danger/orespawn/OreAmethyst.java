/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OreAmethyst
/*    */   extends Block
/*    */ {
/*    */   public OreAmethyst(int i) {
/* 26 */     super(Material.field_151576_e);
/* 27 */     func_149711_c(10.0F);
/* 28 */     func_149752_b(4.0F);
/* 29 */     func_149647_a(CreativeTabs.field_78030_b);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149690_a(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
/* 37 */     super.func_149690_a(par1World, par2, par3, par4, par5, par6, par7);
/* 38 */     int j1 = 5 + par1World.field_73012_v.nextInt(5) + par1World.field_73012_v.nextInt(5);
/* 39 */     func_149657_c(par1World, par2, par3, par4, j1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/* 47 */     return OreSpawnMain.MyAmethyst;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_149679_a(int par1, Random par2Random) {
/* 53 */     return 1 + par2Random.nextInt(2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_149745_a(Random par1Random) {
/* 61 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 67 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreAmethyst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */