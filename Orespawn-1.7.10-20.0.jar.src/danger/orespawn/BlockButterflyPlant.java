/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockCrops;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockButterflyPlant
/*     */   extends BlockCrops
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] field_94364_a;
/*     */   
/*     */   public BlockButterflyPlant(int par1) {
/*  28 */     func_149675_a(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  36 */     super.func_149674_a(par1World, par2, par3, par4, par5Random);
/*     */     
/*  38 */     if (par1World.field_72995_K)
/*     */       return; 
/*  40 */     if (par1World.func_72896_J())
/*     */       return; 
/*  42 */     int rate = par1World.func_72805_g(par2, par3, par4);
/*  43 */     rate &= 0x7;
/*  44 */     rate = 7 - rate;
/*  45 */     if (rate > 1 && 
/*  46 */       OreSpawnMain.OreSpawnRand.nextInt(rate) != 0) {
/*     */       return;
/*     */     }
/*  49 */     Block bid = par1World.func_147439_a(par2, par3 + 1, par4);
/*     */     
/*  51 */     if (bid == Blocks.field_150350_a && par1World.func_72935_r() && OreSpawnMain.ButterflyEnable != 0)
/*     */     {
/*  53 */       spawnCreature(par1World, "Butterfly", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/*  63 */     Entity var8 = null;
/*     */ 
/*     */     
/*  66 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/*  68 */     if (var8 != null) {
/*     */ 
/*     */       
/*  71 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/*  74 */       par0World.func_72838_d(var8);
/*     */       
/*  76 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/*  79 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/*  88 */     if (par2 < 7) {
/*     */       
/*  90 */       if (par2 >= 6)
/*     */       {
/*  92 */         par2 = 4;
/*     */       }
/*  94 */       return this.field_94364_a[par2 >> 1];
/*     */     } 
/*     */ 
/*     */     
/*  98 */     return this.field_94364_a[3];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 107 */     return 1 + par1Random.nextInt(5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_149866_i() {
/* 115 */     return OreSpawnMain.MyButterflySeed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_149865_P() {
/* 123 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 129 */     this.field_94364_a = new IIcon[4];
/*     */     
/* 131 */     for (int i = 0; i < this.field_94364_a.length; i++)
/*     */     {
/* 133 */       this.field_94364_a[i] = par1IIconRegister.func_94245_a("OreSpawn:butterfly_" + i);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockButterflyPlant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */