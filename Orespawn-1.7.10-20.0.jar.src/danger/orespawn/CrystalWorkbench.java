/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.BlockWorkbench;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CrystalWorkbench
/*    */   extends BlockWorkbench
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon workbenchIconTop;
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon workbenchIconFront;
/*    */   
/*    */   protected CrystalWorkbench(int par1, float f1, float f2) {
/* 24 */     func_149647_a(CreativeTabs.field_78031_c);
/* 25 */     func_149711_c(f1);
/* 26 */     func_149752_b(f2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 35 */     if (par1World.field_72995_K)
/*    */     {
/* 37 */       return true;
/*    */     }
/*    */ 
/*    */     
/* 41 */     par5EntityPlayer.openGui(OreSpawnMain.instance, 1, par1World, par2, par3, par4);
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149662_c() {
/* 52 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149686_d() {
/* 60 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon func_149691_a(int par1, int par2) {
/* 72 */     return (par1 == 1) ? this.workbenchIconTop : ((par1 == 0) ? this.field_149761_L : ((par1 != 2 && par1 != 4) ? this.field_149761_L : this.workbenchIconFront));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 83 */     this.field_149761_L = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_side");
/* 84 */     this.workbenchIconTop = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_top");
/* 85 */     this.workbenchIconFront = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_bottom");
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CrystalWorkbench.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */