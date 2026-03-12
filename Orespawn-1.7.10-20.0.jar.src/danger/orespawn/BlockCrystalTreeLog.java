/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockRotatedPillar;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockCrystalTreeLog
/*     */   extends BlockRotatedPillar
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon field_111052_c;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon tree_top;
/*     */   
/*     */   protected BlockCrystalTreeLog(int par1, int par2) {
/*  30 */     super(Material.field_151575_d);
/*  31 */     func_149647_a(CreativeTabs.field_78030_b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ItemStack func_149644_j(int par1) {
/*  42 */     return new ItemStack(Item.func_150898_a((Block)this), 1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
/*  47 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isWood(IBlockAccess world, int x, int y, int z) {
/*  52 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149686_d() {
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
/*  78 */     return Item.func_150898_a(OreSpawnMain.MyCrystalTreeLog);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   protected IIcon func_150163_b(int par1) {
/*  88 */     return this.field_111052_c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   protected IIcon func_150161_d(int par1) {
/*  98 */     return this.tree_top;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 103 */     this.field_111052_c = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/* 104 */     this.tree_top = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_top");
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockCrystalTreeLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */