/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockLeaves;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockAppleLeaves
/*     */   extends BlockLeaves
/*     */ {
/*  24 */   private IIcon generic_solid = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected BlockAppleLeaves(int par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149666_a(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List) {
/*  36 */     par3List.add(new ItemStack(Item.func_150898_a((Block)this), 1, 0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149690_a(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
/*  44 */     if (!par1World.field_72995_K) {
/*     */       
/*  46 */       if (par1World.field_73012_v.nextInt(25) == 1)
/*     */       {
/*  48 */         func_149642_a(par1World, par2, par3, par4, new ItemStack(Items.field_151034_e));
/*     */       }
/*  50 */       if (par1World.field_73012_v.nextInt(500) == 2)
/*     */       {
/*  52 */         func_149642_a(par1World, par2, par3, par4, new ItemStack(Items.field_151153_ao, 1, 0));
/*     */       }
/*  54 */       if (par1World.field_73012_v.nextInt(1000) == 3)
/*     */       {
/*  56 */         func_149642_a(par1World, par2, par3, par4, new ItemStack(Items.field_151153_ao, 1, 1));
/*     */       }
/*  58 */       if (par1World.field_73012_v.nextInt(10000) == 4)
/*     */       {
/*  60 */         func_149642_a(par1World, par2, par3, par4, new ItemStack(OreSpawnMain.MagicApple));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/*  71 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  81 */     int var7 = 2;
/*     */ 
/*     */     
/*  84 */     int totaldist = 0;
/*  85 */     int chance = 20;
/*     */     
/*  87 */     if (par1World.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) {
/*  88 */       chance = 100;
/*  89 */       var7 = 1;
/*     */     } 
/*     */     
/*  92 */     if (!par1World.field_72995_K && par1World.func_72904_c(par2 - var7, par3 - var7, par4 - var7, par2 + var7, par3 + var7, par4 + var7)) {
/*     */       
/*  94 */       for (int var12 = -var7; var12 <= var7; var12++) {
/*     */         
/*  96 */         for (int var13 = -var7; var13 <= 0; var13++) {
/*     */           
/*  98 */           for (int var14 = -var7; var14 <= var7; var14++) {
/*     */             
/* 100 */             totaldist = Math.abs(var12) + Math.abs(var13) + Math.abs(var14);
/* 101 */             if (totaldist <= 3) {
/* 102 */               Block bid = par1World.func_147439_a(par2 + var12, par3 + var13, par4 + var14);
/*     */               
/* 104 */               if (bid != Blocks.field_150350_a && bid.canSustainLeaves((IBlockAccess)par1World, par2 + var12, par3 + var13, par4 + var14)) {
/*     */ 
/*     */                 
/* 107 */                 bid = par1World.func_147439_a(par2, par3 - 1, par4);
/* 108 */                 if (bid == Blocks.field_150350_a)
/*     */                 {
/* 110 */                   if (par1World.field_73012_v.nextInt(chance) == 3)
/*     */                   {
/* 112 */                     func_149690_a(par1World, par2, par3 - 1, par4, 0, 0.0F, 0);
/*     */                   }
/*     */                 }
/*     */                 
/* 116 */                 long t = par1World.func_72820_D();
/* 117 */                 t %= 24000L;
/*     */                 
/* 119 */                 if (t > 12000L && par1World.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4)
/*     */                 {
/* 121 */                   OreSpawnMain.setBlockFast(par1World, par2, par3, par4, OreSpawnMain.MyScaryLeaves, 0, 3);
/*     */                 }
/*     */                 return;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 129 */       removeLeaves(par1World, par2, par3, par4);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void removeLeaves(World par1World, int par2, int par3, int par4) {
/* 135 */     func_149697_b(par1World, par2, par3, par4, 0, 0);
/* 136 */     par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149662_c() {
/* 145 */     if (OreSpawnMain.FastGraphicsLeaves != 0) return true; 
/* 146 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean func_149646_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 156 */     Block i1 = par1IBlockAccess.func_147439_a(par2, par3, par4);
/* 157 */     return !(OreSpawnMain.FastGraphicsLeaves != 0 && i1 == this);
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 162 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/* 163 */     this.generic_solid = iconRegister.func_94245_a("OreSpawn:generic_solid");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/* 172 */     if (OreSpawnMain.FastGraphicsLeaves != 0) {
/* 173 */       return this.generic_solid;
/*     */     }
/* 175 */     return this.field_149761_L;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] func_150125_e() {
/* 181 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockAppleLeaves.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */