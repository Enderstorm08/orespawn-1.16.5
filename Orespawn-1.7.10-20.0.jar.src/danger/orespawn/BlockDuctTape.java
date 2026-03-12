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
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class BlockDuctTape
/*     */   extends Block
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon DuctTapeTopIcon;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon DuctTapeBottomIcon;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon field_94382_c;
/*     */   
/*     */   protected BlockDuctTape(int par1) {
/*  29 */     super(Material.field_151574_g);
/*  30 */     func_149675_a(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149719_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
/*  38 */     int l = par1IBlockAccess.func_72805_g(par2, par3, par4);
/*  39 */     float f = 0.0625F;
/*  40 */     float f1 = (1 + l * 2) / 16.0F;
/*  41 */     float f2 = 0.25F;
/*  42 */     func_149676_a(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149683_g() {
/*  50 */     float f = 0.0625F;
/*  51 */     float f1 = 0.25F;
/*  52 */     func_149676_a(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
/*  61 */     int l = par1World.func_72805_g(par2, par3, par4);
/*  62 */     float f = 0.0625F;
/*  63 */     float f1 = (1 + l * 2) / 16.0F;
/*  64 */     float f2 = 0.25F;
/*  65 */     return AxisAlignedBB.func_72330_a((par2 + f1), par3, (par4 + f), ((par2 + 1) - f), (par3 + f2 - f), ((par4 + 1) - f));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149686_d() {
/*  73 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public AxisAlignedBB func_149633_g(World par1World, int par2, int par3, int par4) {
/*  83 */     int l = par1World.func_72805_g(par2, par3, par4);
/*  84 */     float f = 0.0625F;
/*  85 */     float f1 = (1 + l * 2) / 16.0F;
/*  86 */     float f2 = 0.25F;
/*  87 */     return AxisAlignedBB.func_72330_a((par2 + f1), par3, (par4 + f), ((par2 + 1) - f), (par3 + f2), ((par4 + 1) - f));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/*  97 */     return (par1 == 1) ? this.DuctTapeTopIcon : ((par1 == 0) ? this.DuctTapeBottomIcon : ((par2 > 0 && par1 == 4) ? this.field_94382_c : this.field_149761_L));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister par1IconRegister) {
/* 108 */     this.field_149761_L = par1IconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_side");
/* 109 */     this.field_94382_c = par1IconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_inner");
/* 110 */     this.DuctTapeTopIcon = par1IconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_top");
/* 111 */     this.DuctTapeBottomIcon = par1IconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_bottom");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/* 120 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 128 */     eatDuctTapeSlice(par1World, par2, par3, par4, par5EntityPlayer);
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149699_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
/* 137 */     eatDuctTapeSlice(par1World, par2, par3, par4, par5EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void eatDuctTapeSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
/* 145 */     if (par5EntityPlayer != null) {
/*     */       
/* 147 */       ItemStack var2 = par5EntityPlayer.field_71071_by.func_70448_g();
/* 148 */       if (var2 != null && 
/* 149 */         var2.field_77994_a == 1) {
/* 150 */         int cd = var2.func_77958_k();
/* 151 */         int fd = 0;
/* 152 */         if (cd > 0) {
/* 153 */           cd /= 6;
/* 154 */           if (cd < 1) cd = 1; 
/* 155 */           fd = var2.func_77960_j();
/* 156 */           if (fd > 0) {
/* 157 */             if (fd > cd) {
/* 158 */               fd -= cd;
/*     */             } else {
/* 160 */               fd = 0;
/*     */             } 
/* 162 */             var2.func_77964_b(fd);
/*     */             
/* 164 */             int l = par1World.func_72805_g(par2, par3, par4) + 1;
/* 165 */             if (l >= 6) {
/* 166 */               par1World.func_147468_f(par2, par3, par4);
/*     */             } else {
/* 168 */               par1World.func_72921_c(par2, par3, par4, l, 2);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/* 182 */     return !super.func_149742_c(par1World, par2, par3, par4) ? false : func_149718_j(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
/* 191 */     if (!func_149718_j(par1World, par2, par3, par4))
/*     */     {
/* 193 */       par1World.func_147468_f(par2, par3, par4);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149718_j(World par1World, int par2, int par3, int par4) {
/* 202 */     return par1World.func_147439_a(par2, par3 - 1, par4).func_149688_o().func_76220_a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 210 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
/* 218 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public Item func_149694_d(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
/* 230 */     return OreSpawnMain.MyDuctTapeItem;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockDuctTape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */