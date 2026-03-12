/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RockBlock
/*    */   extends Block
/*    */ {
/*    */   public RockBlock(int par1) {
/* 20 */     super(Material.field_151576_e);
/* 21 */     func_149711_c(2.0F);
/* 22 */     func_149752_b(1.0F);
/* 23 */     func_149647_a(CreativeTabs.field_78030_b);
/*    */   }
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
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 49 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RockBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */