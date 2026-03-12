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
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OreUranium
/*     */   extends Block
/*     */ {
/*     */   private boolean glowing = false;
/*  21 */   private int glowcount = 0;
/*     */ 
/*     */   
/*     */   public OreUranium(int par1) {
/*  25 */     super(Material.field_151576_e);
/*  26 */     func_149711_c(10.0F);
/*  27 */     func_149752_b(1.0F);
/*  28 */     func_149647_a(CreativeTabs.field_78030_b);
/*  29 */     func_149675_a(true);
/*  30 */     this.glowing = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int tickRate() {
/*  38 */     return 30;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149699_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
/*  46 */     glow(par1World, par2, par3, par4);
/*  47 */     super.func_149699_a(par1World, par2, par3, par4, par5EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149724_b(World par1World, int par2, int par3, int par4, Entity par5Entity) {
/*  55 */     glow(par1World, par2, par3, par4);
/*  56 */     super.func_149724_b(par1World, par2, par3, par4, par5Entity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
/*  64 */     glow(par1World, par2, par3, par4);
/*  65 */     return super.func_149727_a(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void glow(World par1World, int par2, int par3, int par4) {
/*  73 */     this.glowing = true;
/*  74 */     this.glowcount = 10;
/*  75 */     sparkle(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  93 */     if (this.glowing) {
/*     */       
/*  95 */       sparkle(par1World, par2, par3, par4);
/*  96 */       if (this.glowcount > 0) {
/*  97 */         this.glowcount--;
/*     */       } else {
/*  99 */         this.glowing = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void sparkle(World par1World, int par2, int par3, int par4) {
/* 109 */     Random var5 = par1World.field_73012_v;
/* 110 */     double var6 = 0.0625D;
/*     */     
/* 112 */     for (int var8 = 0; var8 < 6; var8++) {
/*     */       
/* 114 */       double var9 = (par2 + var5.nextFloat());
/* 115 */       double var11 = (par3 + var5.nextFloat());
/* 116 */       double var13 = (par4 + var5.nextFloat());
/*     */       
/* 118 */       if (var8 == 0 && !par1World.func_147439_a(par2, par3 + 1, par4).func_149662_c())
/*     */       {
/* 120 */         var11 = (par3 + 1) + var6;
/*     */       }
/*     */       
/* 123 */       if (var8 == 1 && !par1World.func_147439_a(par2, par3 - 1, par4).func_149662_c())
/*     */       {
/* 125 */         var11 = (par3 + 0) - var6;
/*     */       }
/*     */       
/* 128 */       if (var8 == 2 && !par1World.func_147439_a(par2, par3, par4 + 1).func_149662_c())
/*     */       {
/* 130 */         var13 = (par4 + 1) + var6;
/*     */       }
/*     */       
/* 133 */       if (var8 == 3 && !par1World.func_147439_a(par2, par3, par4 - 1).func_149662_c())
/*     */       {
/* 135 */         var13 = (par4 + 0) - var6;
/*     */       }
/*     */       
/* 138 */       if (var8 == 4 && !par1World.func_147439_a(par2 + 1, par3, par4).func_149662_c())
/*     */       {
/* 140 */         var9 = (par2 + 1) + var6;
/*     */       }
/*     */       
/* 143 */       if (var8 == 5 && !par1World.func_147439_a(par2 - 1, par3, par4).func_149662_c())
/*     */       {
/* 145 */         var9 = (par2 + 0) - var6;
/*     */       }
/*     */       
/* 148 */       if (var9 < par2 || var9 > (par2 + 1) || var11 < 0.0D || var11 > (par3 + 1) || var13 < par4 || var13 > (par4 + 1))
/*     */       {
/* 150 */         par1World.func_72869_a("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149690_a(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
/* 160 */     super.func_149690_a(par1World, par2, par3, par4, par5, par6, par7);
/* 161 */     int j1 = 5 + par1World.field_73012_v.nextInt(5) + par1World.field_73012_v.nextInt(10);
/* 162 */     if (par3 < 40)
/* 163 */       func_149657_c(par1World, par2, par3, par4, j1); 
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 168 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreUranium.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */