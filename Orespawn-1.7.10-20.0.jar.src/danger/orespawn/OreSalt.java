/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.DamageSource;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OreSalt
/*    */   extends Block
/*    */ {
/*    */   public OreSalt(int par1) {
/* 20 */     super(Material.field_151576_e);
/* 21 */     func_149711_c(5.0F);
/* 22 */     func_149752_b(2.0F);
/* 23 */     func_149647_a(CreativeTabs.field_78030_b);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149670_a(World par1World, int par2, int par3, int par4, Entity par5Entity) {
/* 32 */     if (par5Entity instanceof EntityAnt) {
/* 33 */       par5Entity.func_70097_a(DamageSource.field_76367_g, 5.0F);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149724_b(World par1World, int par2, int par3, int par4, Entity par5Entity) {
/* 42 */     if (par5Entity instanceof EntityAnt) {
/* 43 */       par5Entity.func_70097_a(DamageSource.field_76367_g, 5.0F);
/*    */     }
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 49 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreSalt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */