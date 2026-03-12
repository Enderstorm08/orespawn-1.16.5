/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.IPlantable;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CrystalGrass
/*     */   extends Block
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] field_94364_a;
/*     */   
/*     */   protected CrystalGrass(int par1, float f1, float f2) {
/*  33 */     super(Material.field_151577_b);
/*  34 */     func_149711_c(f1);
/*  35 */     func_149752_b(f2);
/*  36 */     func_149675_a(false);
/*  37 */     func_149647_a(CreativeTabs.field_78030_b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side) {
/*  42 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/*  51 */     if (this.field_94364_a == null) return null; 
/*  52 */     return (par1 == 1) ? this.field_94364_a[0] : ((par1 == 0) ? this.field_94364_a[1] : this.field_94364_a[2]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  62 */     if (this.field_94364_a == null) return null; 
/*  63 */     if (par5 == 1)
/*     */     {
/*  65 */       return this.field_94364_a[0];
/*     */     }
/*  67 */     if (par5 == 0)
/*     */     {
/*  69 */       return this.field_94364_a[1];
/*     */     }
/*     */ 
/*     */     
/*  73 */     return this.field_94364_a[2];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/*  83 */     return Item.func_150898_a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant) {
/*  88 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/*  97 */     if (OreSpawnMain.current_dimension != OreSpawnMain.DimensionID5) return false; 
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149686_d() {
/* 107 */     if (OreSpawnMain.current_dimension != OreSpawnMain.DimensionID5) return false; 
/* 108 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 115 */     this.field_94364_a = new IIcon[3];
/*     */     
/* 117 */     this.field_94364_a[0] = par1IIconRegister.func_94245_a("OreSpawn:crystalgrass_top");
/* 118 */     this.field_94364_a[1] = par1IIconRegister.func_94245_a("OreSpawn:crystalgrass_bottom");
/* 119 */     this.field_94364_a[2] = par1IIconRegister.func_94245_a("OreSpawn:crystalgrass_side");
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CrystalGrass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */