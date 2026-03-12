/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
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
/*    */ public class OreGenericEgg
/*    */   extends Block
/*    */ {
/*    */   public OreGenericEgg(int oldid) {
/* 23 */     super(Material.field_151578_c);
/* 24 */     func_149711_c(0.5F);
/* 25 */     func_149752_b(1.0F);
/* 26 */     func_149672_a(Block.field_149767_g);
/* 27 */     func_149647_a(CreativeTabs.field_78030_b);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149690_a(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
/* 35 */     super.func_149690_a(par1World, par2, par3, par4, par5, par6, par7);
/* 36 */     int j1 = 5 + par1World.field_73012_v.nextInt(3) + par1World.field_73012_v.nextInt(3);
/* 37 */     if (par1World.field_73012_v.nextInt(2) == 1) {
/* 38 */       func_149657_c(par1World, par2, par3, par4, j1);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149662_c() {
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149686_d() {
/* 55 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 61 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreGenericEgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */