/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.util.AxisAlignedBB;
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
/*    */ public class MoleDirtBlock
/*    */   extends Block
/*    */ {
/*    */   public MoleDirtBlock(int i) {
/* 28 */     super(Material.field_151578_c);
/* 29 */     func_149647_a(CreativeTabs.field_78030_b);
/* 30 */     func_149675_a(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/* 35 */     if (par1World.field_72995_K)
/* 36 */       return;  par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
/* 41 */     float f = 0.125F;
/* 42 */     return AxisAlignedBB.func_72330_a(par2, par3, par4, (par2 + 1), ((par3 + 1) - f), (par4 + 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_149670_a(World par1World, int par2, int par3, int par4, Entity par5Entity) {
/* 47 */     if (par5Entity != null) {
/* 48 */       par5Entity.field_70159_w *= 0.3D;
/* 49 */       par5Entity.field_70179_y *= 0.3D;
/*    */     } 
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 55 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MoleDirtBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */