/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OreBasicStone
/*     */   extends Block
/*     */ {
/*     */   public OreBasicStone(int par1, float f1, float f2) {
/*  25 */     super(Material.field_151576_e);
/*  26 */     func_149711_c(f1);
/*  27 */     func_149752_b(f2);
/*  28 */     func_149647_a(CreativeTabs.field_78030_b);
/*  29 */     func_149675_a(false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149664_b(World par1World, int par2, int par3, int par4, int par5) {
/*  38 */     if (!par1World.field_72995_K && this == OreSpawnMain.CrystalRat) {
/*     */ 
/*     */       
/*  41 */       int num = 1 + par1World.field_73012_v.nextInt(10);
/*  42 */       for (int i = 0; i < num; i++) {
/*  43 */         spawnCreature(par1World, 0, "Rat", par2 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D, par3 + 0.01D, par4 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D);
/*     */       }
/*     */     } 
/*     */     
/*  47 */     if (!par1World.field_72995_K && this == OreSpawnMain.CrystalFairy) {
/*     */ 
/*     */       
/*  50 */       int num = 1 + par1World.field_73012_v.nextInt(6);
/*  51 */       for (int i = 0; i < num; i++) {
/*  52 */         spawnCreature(par1World, 0, "Fairy", par2 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D, par3 + 0.01D, par4 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D);
/*     */       }
/*     */     } 
/*     */     
/*  56 */     if (!par1World.field_72995_K && this == OreSpawnMain.RedAntTroll) {
/*     */ 
/*     */       
/*  59 */       int num = 15 + par1World.field_73012_v.nextInt(6);
/*  60 */       for (int i = 0; i < num; i++) {
/*  61 */         spawnCreature(par1World, 0, "Red Ant", par2 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D, par3 + 0.01D, par4 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D);
/*     */       }
/*     */     } 
/*     */     
/*  65 */     if (!par1World.field_72995_K && this == OreSpawnMain.TermiteTroll) {
/*     */ 
/*     */       
/*  68 */       int num = 15 + par1World.field_73012_v.nextInt(6);
/*  69 */       for (int i = 0; i < num; i++) {
/*  70 */         spawnCreature(par1World, 0, "Termite", par2 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D, par3 + 0.01D, par4 + 0.5D + (par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) * 0.2D);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  75 */     super.func_149664_b(par1World, par2, par3, par4, par5);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side) {
/*  80 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/*  89 */     if (OreSpawnMain.current_dimension != OreSpawnMain.DimensionID5) return false; 
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149686_d() {
/*  98 */     if (OreSpawnMain.current_dimension != OreSpawnMain.DimensionID5) return false; 
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, int par1, String name, double par2, double par4, double par6) {
/* 109 */     Entity var8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     if (name == null) {
/* 116 */       var8 = EntityList.func_75616_a(par1, par0World);
/*     */     } else {
/* 118 */       var8 = EntityList.func_75620_a(name, par0World);
/*     */     } 
/*     */     
/* 121 */     if (var8 != null) {
/*     */ 
/*     */       
/* 124 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/* 125 */       par0World.func_72838_d(var8);
/*     */       
/* 127 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/* 130 */     return var8;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 136 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreBasicStone.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */