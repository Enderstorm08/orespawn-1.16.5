/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.BlockTorch;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockExtremeTorch
/*     */   extends BlockTorch
/*     */ {
/*     */   public BlockExtremeTorch(int par1) {
/*  24 */     func_149647_a(CreativeTabs.field_78028_d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  34 */     int var6 = par1World.func_72805_g(par2, par3, par4);
/*  35 */     double var7 = (par2 + 0.5F);
/*  36 */     double var9 = (par3 + 0.7F);
/*  37 */     double var11 = (par4 + 0.5F);
/*  38 */     double var13 = 0.213D;
/*  39 */     double var15 = 0.271D;
/*     */     
/*  41 */     if (var6 == 1) {
/*     */       
/*  43 */       par1World.func_72869_a("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  44 */       par1World.func_72869_a("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  45 */       par1World.func_72869_a("reddust", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*     */     }
/*  47 */     else if (var6 == 2) {
/*     */       
/*  49 */       par1World.func_72869_a("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  50 */       par1World.func_72869_a("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  51 */       par1World.func_72869_a("reddust", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*     */     }
/*  53 */     else if (var6 == 3) {
/*     */       
/*  55 */       par1World.func_72869_a("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
/*  56 */       par1World.func_72869_a("flame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
/*  57 */       par1World.func_72869_a("reddust", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
/*     */     }
/*  59 */     else if (var6 == 4) {
/*     */       
/*  61 */       par1World.func_72869_a("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
/*  62 */       par1World.func_72869_a("flame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
/*  63 */       par1World.func_72869_a("reddust", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */     else {
/*     */       
/*  67 */       par1World.func_72869_a("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
/*  68 */       par1World.func_72869_a("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
/*  69 */       par1World.func_72869_a("reddust", var7, var9, var11, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */ 
/*     */     
/*  73 */     func_149689_a(par1World, par2, par3, par4, (EntityLivingBase)null, (ItemStack)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/*  81 */     return super.func_149742_c(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149689_a(World world, int par2, int par3, int par4, EntityLivingBase par5EntityLiving, ItemStack par6ItemStack) {
/*  86 */     int x = par2, y = par3, z = par4, found = 0;
/*     */ 
/*     */     
/*  89 */     if (world.func_147439_a(x, y - 1, z) == OreSpawnMain.MyEyeOfEnderBlock) {
/*  90 */       for (int tries = 0; tries < 100 && found == 0; tries++) {
/*  91 */         if (world.field_73012_v.nextInt(2) == 0) {
/*  92 */           x = par2 + 4 + world.field_73012_v.nextInt(3) - world.field_73012_v.nextInt(3);
/*     */         } else {
/*  94 */           x = par2 - 4 + world.field_73012_v.nextInt(3) - world.field_73012_v.nextInt(3);
/*     */         } 
/*  96 */         if (world.field_73012_v.nextInt(2) == 0) {
/*  97 */           z = par4 + 4 + world.field_73012_v.nextInt(3) - world.field_73012_v.nextInt(3);
/*     */         } else {
/*  99 */           z = par4 - 4 + world.field_73012_v.nextInt(3) - world.field_73012_v.nextInt(3);
/*     */         } 
/* 101 */         for (y = par3 - 2; y <= par3 + 2; y++) {
/* 102 */           if (world.func_147439_a(x, y - 1, z).func_149688_o().func_76220_a() && 
/* 103 */             world.func_147439_a(x, y, z) == Blocks.field_150350_a && 
/* 104 */             world.func_147439_a(x, y + 1, z) == Blocks.field_150350_a) {
/* 105 */             found = 1;
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 113 */       if (found != 0) {
/* 114 */         if (!world.field_72995_K) {
/* 115 */           Entity ent = null;
/* 116 */           ent = spawnCreature(world, "Cephadrome", x + 0.5D, y + 0.01D, z + 0.5D);
/*     */         } else {
/* 118 */           for (int var3 = 0; var3 < 16; var3++) {
/*     */             
/* 120 */             world.func_72869_a("smoke", (par2 + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (par3 + world.field_73012_v.nextFloat()), (par4 + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/* 121 */             world.func_72869_a("explode", (par2 + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (par3 + world.field_73012_v.nextFloat()), (par4 + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/* 122 */             world.func_72869_a("reddust", (par2 + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (par3 + world.field_73012_v.nextFloat()), (par4 + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 127 */         if (par5EntityLiving != null) {
/* 128 */           par5EntityLiving.field_70170_p.func_72956_a((Entity)par5EntityLiving, "random.explode", 1.0F, world.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */         } else {
/* 130 */           world.func_72980_b(par2, par3, par4, "random.explode", 1.0F, world.field_73012_v.nextFloat() * 0.2F + 0.9F, false);
/*     */         } 
/* 132 */         world.func_147449_b(par2, par3, par4, Blocks.field_150350_a);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 138 */     super.func_149689_a(world, par2, par3, par4, par5EntityLiving, par6ItemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 147 */     Entity var8 = null;
/*     */ 
/*     */     
/* 150 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/* 152 */     if (var8 != null) {
/*     */ 
/*     */       
/* 155 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 158 */       par0World.func_72838_d(var8);
/*     */       
/* 160 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/* 163 */     return var8;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 169 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockExtremeTorch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */