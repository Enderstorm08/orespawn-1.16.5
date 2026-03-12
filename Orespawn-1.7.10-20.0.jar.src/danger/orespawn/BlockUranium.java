/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockUranium
/*    */   extends Block
/*    */ {
/*    */   public BlockUranium(int par1) {
/* 18 */     super(Material.field_151576_e);
/* 19 */     func_149711_c(5.0F);
/* 20 */     func_149752_b(5.0F);
/* 21 */     func_149647_a(CreativeTabs.field_78030_b);
/*    */     
/* 23 */     func_149715_a(0.2F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int tickRate() {
/* 32 */     return 100;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/* 41 */     if (par1World.field_73012_v.nextInt(20) == 0) {
/* 42 */       sparkle(par1World, par2, par3, par4);
/*    */     }
/*    */   }
/*    */   
/*    */   private void sparkle(World par1World, int par2, int par3, int par4) {
/* 47 */     Random var5 = par1World.field_73012_v;
/* 48 */     double var6 = 0.0625D;
/*    */     
/* 50 */     for (int var8 = 0; var8 < 6; var8++) {
/*    */       
/* 52 */       double var9 = (par2 + var5.nextFloat());
/* 53 */       double var11 = (par3 + var5.nextFloat());
/* 54 */       double var13 = (par4 + var5.nextFloat());
/*    */       
/* 56 */       if (var8 == 0 && !par1World.func_147439_a(par2, par3 + 1, par4).func_149662_c())
/*    */       {
/* 58 */         var11 = (par3 + 1) + var6;
/*    */       }
/*    */       
/* 61 */       if (var8 == 1 && !par1World.func_147439_a(par2, par3 - 1, par4).func_149662_c())
/*    */       {
/* 63 */         var11 = (par3 + 0) - var6;
/*    */       }
/*    */       
/* 66 */       if (var8 == 2 && !par1World.func_147439_a(par2, par3, par4 + 1).func_149662_c())
/*    */       {
/* 68 */         var13 = (par4 + 1) + var6;
/*    */       }
/*    */       
/* 71 */       if (var8 == 3 && !par1World.func_147439_a(par2, par3, par4 - 1).func_149662_c())
/*    */       {
/* 73 */         var13 = (par4 + 0) - var6;
/*    */       }
/*    */       
/* 76 */       if (var8 == 4 && !par1World.func_147439_a(par2 + 1, par3, par4).func_149662_c())
/*    */       {
/* 78 */         var9 = (par2 + 1) + var6;
/*    */       }
/*    */       
/* 81 */       if (var8 == 5 && !par1World.func_147439_a(par2 - 1, par3, par4).func_149662_c())
/*    */       {
/* 83 */         var9 = (par2 + 0) - var6;
/*    */       }
/*    */       
/* 86 */       if (var9 < par2 || var9 > (par2 + 1) || var11 < 0.0D || var11 > (par3 + 1) || var13 < par4 || var13 > (par4 + 1)) {
/*    */         
/* 88 */         int which = par1World.field_73012_v.nextInt(3);
/* 89 */         if (which == 0) par1World.func_72869_a("flame", var9, var11, var13, 0.0D, 0.0D, 0.0D); 
/* 90 */         if (which == 1) par1World.func_72869_a("smoke", var9, var11, var13, 0.0D, 0.0D, 0.0D); 
/* 91 */         if (which == 2) par1World.func_72869_a("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
/*    */       
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 99 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockUranium.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */