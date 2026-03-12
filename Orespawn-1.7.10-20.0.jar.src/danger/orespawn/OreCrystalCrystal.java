/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OreCrystalCrystal
/*     */   extends Block
/*     */ {
/*     */   public OreCrystalCrystal(int par1, float lv, float f1, float f2) {
/*  22 */     super(Material.field_151576_e);
/*  23 */     func_149711_c(f1);
/*  24 */     func_149752_b(f2);
/*  25 */     func_149647_a(CreativeTabs.field_78030_b);
/*  26 */     func_149715_a(lv);
/*  27 */     func_149675_a(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  36 */     if (par1World.field_73012_v.nextInt(20) == 0) {
/*  37 */       sparkle(par1World, par2, par3, par4);
/*     */     }
/*     */   }
/*     */   
/*     */   private void sparkle(World par1World, int par2, int par3, int par4) {
/*  42 */     int which = 0;
/*  43 */     float dx = 0.5F;
/*  44 */     float dz = 0.5F;
/*  45 */     float dy = 0.5F;
/*  46 */     if (this == OreSpawnMain.TigersEye) {
/*  47 */       par1World.func_72869_a("flame", (par2 + dx), par3 + dy, (par4 + dz), ((par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) / 4.0F), ((par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) / 4.0F), ((par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) / 4.0F));
/*     */     } else {
/*     */       
/*  50 */       par1World.func_72869_a("fireworksSpark", (par2 + dx), par3 + dy, (par4 + dz), ((par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) / 4.0F), ((par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) / 4.0F), ((par1World.field_73012_v.nextFloat() - par1World.field_73012_v.nextFloat()) / 4.0F));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149645_b() {
/*  58 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/*  67 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149686_d() {
/*  75 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149664_b(World par1World, int par2, int par3, int par4, int par5) {
/*  83 */     if (this == OreSpawnMain.CrystalCrystal && !par1World.field_72995_K && par1World.field_73012_v.nextInt(10) == 1)
/*     */     {
/*  85 */       par1World.func_72885_a((Entity)null, (par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), 1.0F, true, par1World.func_82736_K().func_82766_b("mobGriefing"));
/*     */     }
/*     */ 
/*     */     
/*  89 */     super.func_149664_b(par1World, par2, par3, par4, par5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149690_a(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
/*  97 */     super.func_149690_a(par1World, par2, par3, par4, par5, par6, par7);
/*  98 */     int j1 = 5 + par1World.field_73012_v.nextInt(5) + par1World.field_73012_v.nextInt(10);
/*  99 */     if (par3 < 40) {
/* 100 */       func_149657_c(par1World, par2, par3, par4, j1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 108 */     if (this != OreSpawnMain.TigersEye) return 1; 
/* 109 */     return par1Random.nextInt(2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 116 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreCrystalCrystal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */