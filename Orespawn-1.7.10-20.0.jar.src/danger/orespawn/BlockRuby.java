/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.potion.Potion;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockRuby
/*    */   extends Block
/*    */ {
/*    */   public BlockRuby(int par1) {
/* 22 */     super(Material.field_151576_e);
/* 23 */     func_149711_c(4.0F);
/* 24 */     func_149752_b(4.0F);
/* 25 */     func_149647_a(CreativeTabs.field_78030_b);
/* 26 */     func_149715_a(0.4F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149662_c() {
/* 35 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149686_d() {
/* 43 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149670_a(World par1World, int par2, int par3, int par4, Entity par5Entity) {
/* 51 */     if (this == OreSpawnMain.MyBlockMobzillaScaleBlock && par5Entity instanceof EntityLivingBase) {
/* 52 */       ((EntityLivingBase)par5Entity).func_70690_d(new PotionEffect(Potion.field_76420_g.field_76415_H, 200, 0));
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149724_b(World par1World, int par2, int par3, int par4, Entity par5Entity) {
/* 62 */     if (this == OreSpawnMain.MyBlockMobzillaScaleBlock && par5Entity instanceof EntityLivingBase) {
/* 63 */       ((EntityLivingBase)par5Entity).func_70690_d(new PotionEffect(Potion.field_76420_g.field_76415_H, 200, 0));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 70 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockRuby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */