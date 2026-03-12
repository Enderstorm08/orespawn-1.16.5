/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class BlockPizza
/*     */   extends Block
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon pizzaTopIcon;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon pizzaBottomIcon;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon field_94382_c;
/*     */   
/*     */   protected BlockPizza(int par1) {
/*  28 */     super(Material.field_151568_F);
/*  29 */     func_149675_a(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149719_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
/*  37 */     int l = par1IBlockAccess.func_72805_g(par2, par3, par4);
/*  38 */     float f = 0.0625F;
/*  39 */     float f1 = (1 + l * 2) / 16.0F;
/*  40 */     float f2 = 0.25F;
/*  41 */     func_149676_a(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149683_g() {
/*  49 */     float f = 0.0625F;
/*  50 */     float f1 = 0.25F;
/*  51 */     func_149676_a(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
/*  60 */     int l = par1World.func_72805_g(par2, par3, par4);
/*  61 */     float f = 0.0625F;
/*  62 */     float f1 = (1 + l * 2) / 16.0F;
/*  63 */     float f2 = 0.25F;
/*  64 */     return AxisAlignedBB.func_72330_a((par2 + f1), par3, (par4 + f), ((par2 + 1) - f), (par3 + f2 - f), ((par4 + 1) - f));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149686_d() {
/*  72 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public AxisAlignedBB func_149633_g(World par1World, int par2, int par3, int par4) {
/*  82 */     int l = par1World.func_72805_g(par2, par3, par4);
/*  83 */     float f = 0.0625F;
/*  84 */     float f1 = (1 + l * 2) / 16.0F;
/*  85 */     float f2 = 0.25F;
/*  86 */     return AxisAlignedBB.func_72330_a((par2 + f1), par3, (par4 + f), ((par2 + 1) - f), (par3 + f2), ((par4 + 1) - f));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/*  96 */     return (par1 == 1) ? this.pizzaTopIcon : ((par1 == 0) ? this.pizzaBottomIcon : ((par2 > 0 && par1 == 4) ? this.field_94382_c : this.field_149761_L));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 107 */     this.field_149761_L = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_side");
/* 108 */     this.field_94382_c = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_inner");
/* 109 */     this.pizzaTopIcon = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_top");
/* 110 */     this.pizzaBottomIcon = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_bottom");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 127 */     eatPizzaSlice(par1World, par2, par3, par4, par5EntityPlayer);
/* 128 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149699_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
/* 136 */     eatPizzaSlice(par1World, par2, par3, par4, par5EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void eatPizzaSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
/* 144 */     if (par5EntityPlayer.func_71043_e(false)) {
/*     */       
/* 146 */       par5EntityPlayer.func_71024_bL().func_75122_a(4, 0.2F);
/* 147 */       int l = par1World.func_72805_g(par2, par3, par4) + 1;
/*     */       
/* 149 */       if (l >= 6) {
/*     */         
/* 151 */         par1World.func_147468_f(par2, par3, par4);
/*     */       }
/*     */       else {
/*     */         
/* 155 */         par1World.func_72921_c(par2, par3, par4, l, 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/* 165 */     return !super.func_149742_c(par1World, par2, par3, par4) ? false : func_149718_j(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
/* 174 */     if (!func_149718_j(par1World, par2, par3, par4))
/*     */     {
/* 176 */       par1World.func_147468_f(par2, par3, par4);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149718_j(World par1World, int par2, int par3, int par4) {
/* 185 */     return par1World.func_147439_a(par2, par3 - 1, par4).func_149721_r();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 193 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/* 198 */     return OreSpawnMain.MyPizzaItem;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockPizza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */