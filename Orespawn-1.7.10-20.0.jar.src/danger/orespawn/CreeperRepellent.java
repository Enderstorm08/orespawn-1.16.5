/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockTorch;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.world.World;
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
/*     */ 
/*     */ 
/*     */ public class CreeperRepellent
/*     */   extends BlockTorch
/*     */ {
/*     */   public CreeperRepellent(int par1) {
/*  31 */     func_149647_a(CreativeTabs.field_78028_d);
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
/*  42 */     int var6 = par1World.func_72805_g(par2, par3, par4);
/*  43 */     double var7 = (par2 + 0.5F);
/*  44 */     double var9 = (par3 + 0.7F);
/*  45 */     double var11 = (par4 + 0.5F);
/*  46 */     double var13 = 0.413D;
/*  47 */     double var15 = 0.271D;
/*     */     
/*  49 */     if (var6 == 1) {
/*     */       
/*  51 */       par1World.func_72869_a("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  52 */       par1World.func_72869_a("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  53 */       par1World.func_72869_a("reddust", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*     */     }
/*  55 */     else if (var6 == 2) {
/*     */       
/*  57 */       par1World.func_72869_a("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  58 */       par1World.func_72869_a("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*  59 */       par1World.func_72869_a("reddust", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
/*     */     }
/*  61 */     else if (var6 == 3) {
/*     */       
/*  63 */       par1World.func_72869_a("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
/*  64 */       par1World.func_72869_a("flame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
/*  65 */       par1World.func_72869_a("reddust", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
/*     */     }
/*  67 */     else if (var6 == 4) {
/*     */       
/*  69 */       par1World.func_72869_a("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
/*  70 */       par1World.func_72869_a("flame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
/*  71 */       par1World.func_72869_a("reddust", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */     else {
/*     */       
/*  75 */       par1World.func_72869_a("smoke", var7, var9 + 0.21D, var11, 0.0D, 0.0D, 0.0D);
/*  76 */       par1World.func_72869_a("flame", var7, var9 + 0.21D, var11, 0.0D, 0.0D, 0.0D);
/*  77 */       par1World.func_72869_a("reddust", var7, var9 + 0.21D, var11, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149738_a(World par1World) {
/*  86 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  94 */     if (!par1World.field_72995_K) {
/*     */ 
/*     */       
/*  97 */       findSomethingToRepell(par1World, par2, par3, par4);
/*     */       
/*  99 */       par1World.func_147464_a(par2, par3, par4, (Block)this, func_149738_a(par1World));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149726_b(World world, int x, int y, int z) {
/* 107 */     world.func_147464_a(x, y, z, (Block)this, func_149738_a(world));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149695_a(World world, int x, int y, int z, Block blockId) {
/* 113 */     world.func_147464_a(x, y, z, (Block)this, func_149738_a(world));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/* 121 */     return super.func_149742_c(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void findSomethingToRepell(World par1World, int par2, int par3, int par4) {
/* 127 */     AxisAlignedBB bb = AxisAlignedBB.func_72330_a(par2 - 20.0D, par3 - 10.0D, par4 - 20.0D, par2 + 20.0D, par3 + 10.0D, par4 + 20.0D);
/* 128 */     List var5 = par1World.func_72872_a(EntityLivingBase.class, bb);
/* 129 */     Iterator<EntityLivingBase> var2 = var5.iterator();
/* 130 */     EntityLivingBase var3 = null;
/*     */ 
/*     */     
/* 133 */     while (var2.hasNext()) {
/*     */       
/* 135 */       var3 = var2.next();
/*     */       
/* 137 */       if (var3 != null && var3 instanceof net.minecraft.entity.monster.EntityCreeper) {
/*     */         
/* 139 */         double d1 = var3.field_70165_t - par2;
/* 140 */         double d2 = var3.field_70163_u - par3;
/* 141 */         double d3 = var3.field_70161_v - par4;
/* 142 */         double f = d1 * d1 + d2 * d2 + d3 * d3;
/* 143 */         f = Math.sqrt(f);
/*     */         
/* 145 */         f = 20.0D - f;
/* 146 */         if (f > 20.0D) f = 20.0D; 
/* 147 */         if (f < 0.0D) f = 0.0D; 
/* 148 */         f *= 0.4D;
/* 149 */         double d = (float)Math.atan2(var3.field_70165_t - par2, var3.field_70161_v - par4);
/* 150 */         var3.field_70159_w += f * Math.sin(d);
/* 151 */         var3.field_70179_y += f * Math.cos(d);
/*     */       } 
/*     */ 
/*     */       
/* 155 */       if (var3 != null && var3 instanceof EntityAnt) {
/*     */         
/* 157 */         double d1 = var3.field_70165_t - par2;
/* 158 */         double d2 = var3.field_70163_u - par3;
/* 159 */         double d3 = var3.field_70161_v - par4;
/* 160 */         double f = d1 * d1 + d2 * d2 + d3 * d3;
/* 161 */         f = Math.sqrt(f);
/*     */         
/* 163 */         f = 20.0D - f;
/* 164 */         if (f > 20.0D) f = 20.0D; 
/* 165 */         if (f < 0.0D) f = 0.0D; 
/* 166 */         f *= 0.4D;
/* 167 */         double d = (float)Math.atan2(var3.field_70165_t - par2, var3.field_70161_v - par4);
/* 168 */         var3.field_70159_w += f * Math.sin(d);
/* 169 */         var3.field_70179_y += f * Math.cos(d);
/*     */       } 
/*     */ 
/*     */       
/* 173 */       if (var3 != null && var3 instanceof PurplePower) {
/*     */         
/* 175 */         PurplePower p = (PurplePower)var3;
/* 176 */         if (p.getPurpleType() == 10)
/* 177 */           return;  double d1 = var3.field_70165_t - par2;
/* 178 */         double d2 = var3.field_70163_u - par3;
/* 179 */         double d3 = var3.field_70161_v - par4;
/* 180 */         double f = d1 * d1 + d2 * d2 + d3 * d3;
/* 181 */         f = Math.sqrt(f);
/*     */         
/* 183 */         f = 20.0D - f;
/* 184 */         if (f > 20.0D) f = 20.0D; 
/* 185 */         if (f < 0.0D) f = 0.0D; 
/* 186 */         f *= 0.4D;
/* 187 */         double d = (float)Math.atan2(var3.field_70165_t - par2, var3.field_70161_v - par4);
/* 188 */         var3.field_70159_w += f * Math.sin(d);
/* 189 */         var3.field_70179_y += f * Math.cos(d);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 198 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CreeperRepellent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */