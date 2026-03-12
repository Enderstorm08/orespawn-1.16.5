/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockContainer;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CrystalFurnace
/*     */   extends BlockContainer
/*     */ {
/*  31 */   private final Random furnaceRand = new Random();
/*     */ 
/*     */   
/*     */   private final boolean isActive;
/*     */ 
/*     */   
/*     */   private static boolean keepFurnaceInventory;
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon furnaceIconTop;
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon furnaceIconFront;
/*     */ 
/*     */   
/*     */   protected CrystalFurnace(int par1, boolean par2, float f1, float f2) {
/*  48 */     super(Material.field_151576_e);
/*  49 */     this.isActive = par2;
/*  50 */     if (!par2) {
/*  51 */       func_149647_a(CreativeTabs.field_78031_c);
/*     */     } else {
/*  53 */       func_149715_a(0.6F);
/*     */     } 
/*  55 */     func_149711_c(f1);
/*  56 */     func_149752_b(f2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/*  65 */     return false;
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
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/*  81 */     return Item.func_150898_a((Block)OreSpawnMain.CrystalFurnaceBlock);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public Item idPicked(World par1World, int par2, int par3, int par4) {
/*  91 */     return Item.func_150898_a((Block)OreSpawnMain.CrystalFurnaceBlock);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/* 101 */     return (par1 == 1) ? this.furnaceIconTop : ((par1 == 0) ? this.furnaceIconTop : ((par1 != par2) ? this.field_149761_L : this.furnaceIconFront));
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
/* 112 */     this.field_149761_L = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_side");
/*     */     
/* 114 */     this.furnaceIconFront = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + (this.isActive ? "_front_off" : "_front_off"));
/* 115 */     this.furnaceIconTop = par1IIconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5) + "_top");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4) {
/* 124 */     int l = par1World.func_72805_g(par2, par3, par4);
/* 125 */     TileEntity tileentity = par1World.func_147438_o(par2, par3, par4);
/* 126 */     keepFurnaceInventory = true;
/*     */     
/* 128 */     if (par0) {
/*     */       
/* 130 */       par1World.func_147449_b(par2, par3, par4, OreSpawnMain.CrystalFurnaceOnBlock);
/*     */     }
/*     */     else {
/*     */       
/* 134 */       par1World.func_147449_b(par2, par3, par4, (Block)OreSpawnMain.CrystalFurnaceBlock);
/*     */     } 
/*     */     
/* 137 */     keepFurnaceInventory = false;
/* 138 */     par1World.func_72921_c(par2, par3, par4, l, 2);
/*     */     
/* 140 */     if (tileentity != null) {
/*     */       
/* 142 */       tileentity.func_145829_t();
/* 143 */       par1World.func_147455_a(par2, par3, par4, tileentity);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149726_b(World par1World, int par2, int par3, int par4) {
/* 152 */     super.func_149726_b(par1World, par2, par3, par4);
/* 153 */     setDefaultDirection(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setDefaultDirection(World par1World, int par2, int par3, int par4) {
/* 161 */     if (!par1World.field_72995_K) {
/*     */       
/* 163 */       Block l = par1World.func_147439_a(par2, par3, par4 - 1);
/* 164 */       Block i1 = par1World.func_147439_a(par2, par3, par4 + 1);
/* 165 */       Block j1 = par1World.func_147439_a(par2 - 1, par3, par4);
/* 166 */       Block k1 = par1World.func_147439_a(par2 + 1, par3, par4);
/* 167 */       byte b0 = 3;
/*     */       
/* 169 */       if (l.func_149730_j() && !i1.func_149730_j())
/*     */       {
/* 171 */         b0 = 3;
/*     */       }
/*     */       
/* 174 */       if (i1.func_149730_j() && !l.func_149730_j())
/*     */       {
/* 176 */         b0 = 2;
/*     */       }
/*     */       
/* 179 */       if (j1.func_149730_j() && !k1.func_149730_j())
/*     */       {
/* 181 */         b0 = 5;
/*     */       }
/*     */       
/* 184 */       if (k1.func_149730_j() && !j1.func_149730_j())
/*     */       {
/* 186 */         b0 = 4;
/*     */       }
/*     */       
/* 189 */       par1World.func_72921_c(par2, par3, par4, b0, 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 198 */     if (par1World.field_72995_K)
/*     */     {
/* 200 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 204 */     TileEntityCrystalFurnace tileentitycrystalfurnace = (TileEntityCrystalFurnace)par1World.func_147438_o(par2, par3, par4);
/*     */     
/* 206 */     if (tileentitycrystalfurnace != null)
/*     */     {
/* 208 */       par5EntityPlayer.openGui(OreSpawnMain.instance, 0, par1World, par2, par3, par4);
/*     */     }
/*     */     
/* 211 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/* 222 */     if (this.isActive) {
/*     */       
/* 224 */       int l = par1World.func_72805_g(par2, par3, par4);
/* 225 */       float f = par2 + 0.5F;
/* 226 */       float f1 = par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
/* 227 */       float f2 = par4 + 0.5F;
/*     */       
/* 229 */       float f3 = par5Random.nextFloat() * 0.6F - 0.3F;
/* 230 */       float f4 = par5Random.nextFloat() * 0.6F - 0.3F;
/*     */       
/* 232 */       if (l == 4) {
/*     */         
/* 234 */         par1World.func_72869_a("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 235 */         par1World.func_72869_a("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 237 */       else if (l == 5) {
/*     */         
/* 239 */         par1World.func_72869_a("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 240 */         par1World.func_72869_a("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 242 */       else if (l == 2) {
/*     */         
/* 244 */         par1World.func_72869_a("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/* 245 */         par1World.func_72869_a("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 247 */       else if (l == 3) {
/*     */         
/* 249 */         par1World.func_72869_a("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/* 250 */         par1World.func_72869_a("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149689_a(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
/* 261 */     int l = MathHelper.func_76128_c((par5EntityLivingBase.field_70177_z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 263 */     if (l == 0)
/*     */     {
/* 265 */       par1World.func_72921_c(par2, par3, par4, 2, 2);
/*     */     }
/*     */     
/* 268 */     if (l == 1)
/*     */     {
/* 270 */       par1World.func_72921_c(par2, par3, par4, 5, 2);
/*     */     }
/*     */     
/* 273 */     if (l == 2)
/*     */     {
/* 275 */       par1World.func_72921_c(par2, par3, par4, 3, 2);
/*     */     }
/*     */     
/* 278 */     if (l == 3)
/*     */     {
/* 280 */       par1World.func_72921_c(par2, par3, par4, 4, 2);
/*     */     }
/*     */     
/* 283 */     if (par6ItemStack.func_82837_s())
/*     */     {
/* 285 */       ((TileEntityCrystalFurnace)par1World.func_147438_o(par2, par3, par4)).func_145951_a(par6ItemStack.func_82833_r());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149749_a(World par1World, int par2, int par3, int par4, Block par5, int par6) {
/* 296 */     if (!keepFurnaceInventory) {
/*     */       
/* 298 */       TileEntityCrystalFurnace tileentitycrystalfurnace = (TileEntityCrystalFurnace)par1World.func_147438_o(par2, par3, par4);
/*     */       
/* 300 */       if (tileentitycrystalfurnace != null) {
/*     */         
/* 302 */         for (int j1 = 0; j1 < tileentitycrystalfurnace.func_70302_i_(); j1++) {
/*     */           
/* 304 */           ItemStack itemstack = tileentitycrystalfurnace.func_70301_a(j1);
/*     */           
/* 306 */           if (itemstack != null) {
/*     */             
/* 308 */             float f = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/* 309 */             float f1 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/* 310 */             float f2 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/*     */             
/* 312 */             while (itemstack.field_77994_a > 0) {
/*     */               
/* 314 */               int k1 = this.furnaceRand.nextInt(21) + 10;
/*     */               
/* 316 */               if (k1 > itemstack.field_77994_a)
/*     */               {
/* 318 */                 k1 = itemstack.field_77994_a;
/*     */               }
/*     */               
/* 321 */               itemstack.field_77994_a -= k1;
/* 322 */               EntityItem entityitem = new EntityItem(par1World, (par2 + f), (par3 + f1), (par4 + f2), new ItemStack(itemstack.func_77973_b(), k1, itemstack.func_77960_j()));
/*     */               
/* 324 */               if (itemstack.func_77942_o())
/*     */               {
/* 326 */                 entityitem.func_92059_d().func_77982_d((NBTTagCompound)itemstack.func_77978_p().func_74737_b());
/*     */               }
/*     */               
/* 329 */               float f3 = 0.05F;
/* 330 */               entityitem.field_70159_w = ((float)this.furnaceRand.nextGaussian() * f3);
/* 331 */               entityitem.field_70181_x = ((float)this.furnaceRand.nextGaussian() * f3 + 0.2F);
/* 332 */               entityitem.field_70179_y = ((float)this.furnaceRand.nextGaussian() * f3);
/* 333 */               par1World.func_72838_d((Entity)entityitem);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 338 */         par1World.func_147453_f(par2, par3, par4, par5);
/*     */       } 
/*     */     } 
/*     */     
/* 342 */     super.func_149749_a(par1World, par2, par3, par4, par5, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149740_M() {
/* 351 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149736_g(World par1World, int par2, int par3, int par4, int par5) {
/* 360 */     return Container.func_94526_b((IInventory)par1World.func_147438_o(par2, par3, par4));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity func_149915_a(World var1, int var2) {
/* 366 */     return new TileEntityCrystalFurnace();
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CrystalFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */