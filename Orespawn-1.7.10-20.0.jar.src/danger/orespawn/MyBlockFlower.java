/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.EnumPlantType;
/*     */ import net.minecraftforge.common.IPlantable;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MyBlockFlower
/*     */   extends Block
/*     */   implements IPlantable
/*     */ {
/*     */   protected MyBlockFlower(int par1, Material par2Material) {
/*  26 */     super(par2Material);
/*  27 */     func_149675_a(true);
/*  28 */     float f = 0.2F;
/*  29 */     func_149676_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
/*  30 */     func_149647_a(CreativeTabs.field_78031_c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MyBlockFlower(int par1) {
/*  35 */     this(par1, Material.field_151585_k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/*  43 */     return (super.func_149742_c(par1World, par2, par3, par4) && func_149718_j(par1World, par2, par3, par4));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean canThisPlantGrowOnThisBlock(Block par1) {
/*  52 */     return (par1 == Blocks.field_150349_c || par1 == Blocks.field_150346_d || par1 == Blocks.field_150458_ak);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149695_a(World par1World, int par2, int par3, int par4, Block par5) {
/*  61 */     super.func_149695_a(par1World, par2, par3, par4, par5);
/*  62 */     checkFlowerChange(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  70 */     checkFlowerChange(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */   
/*     */   protected final void checkFlowerChange(World par1World, int par2, int par3, int par4) {
/*  75 */     if (!func_149718_j(par1World, par2, par3, par4)) {
/*     */       
/*  77 */       func_149697_b(par1World, par2, par3, par4, par1World.func_72805_g(par2, par3, par4), 0);
/*  78 */       par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  83 */     long t = par1World.func_72820_D();
/*  84 */     t %= 24000L;
/*     */     
/*  86 */     if (t > 12000L) {
/*  87 */       if (this == OreSpawnMain.MyFlowerPinkBlock) {
/*  88 */         par1World.func_147449_b(par2, par3, par4, OreSpawnMain.MyFlowerBlackBlock);
/*     */       }
/*  90 */       if (this == OreSpawnMain.MyFlowerBlueBlock) {
/*  91 */         par1World.func_147449_b(par2, par3, par4, OreSpawnMain.MyFlowerScaryBlock);
/*     */       }
/*     */     } else {
/*  94 */       if (this == OreSpawnMain.MyFlowerBlackBlock) {
/*  95 */         par1World.func_147449_b(par2, par3, par4, OreSpawnMain.MyFlowerPinkBlock);
/*     */       }
/*  97 */       if (this == OreSpawnMain.MyFlowerScaryBlock) {
/*  98 */         par1World.func_147449_b(par2, par3, par4, OreSpawnMain.MyFlowerBlueBlock);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149718_j(World par1World, int par2, int par3, int par4) {
/* 108 */     Block soil = par1World.func_147439_a(par2, par3 - 1, par4);
/* 109 */     return ((par1World.func_72883_k(par2, par3, par4) >= 8 || par1World.func_72937_j(par2, par3, par4)) && soil != null && soil.canSustainPlant((IBlockAccess)par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
/* 119 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/* 128 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149686_d() {
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149645_b() {
/* 144 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 151 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
/* 157 */     return EnumPlantType.Plains;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Block getPlant(IBlockAccess world, int x, int y, int z) {
/* 163 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
/* 169 */     return 0;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyBlockFlower.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */