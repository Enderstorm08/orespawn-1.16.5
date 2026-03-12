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
/*     */ public class BlockFireflyPlant
/*     */   extends BlockCrops
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] field_94364_a;
/*     */   
/*     */   public BlockFireflyPlant(int par1) {
/*  28 */     func_149675_a(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  37 */     super.func_149674_a(par1World, par2, par3, par4, par5Random);
/*     */     
/*  39 */     if (par1World.field_72995_K)
/*     */       return; 
/*  41 */     if (par1World.func_72896_J())
/*     */       return; 
/*  43 */     int rate = par1World.func_72805_g(par2, par3, par4);
/*  44 */     rate &= 0x7;
/*  45 */     rate = 6 - rate;
/*  46 */     if (rate > 1 && 
/*  47 */       OreSpawnMain.OreSpawnRand.nextInt(rate) != 0) {
/*     */       return;
/*     */     }
/*  50 */     Block bid = par1World.func_147439_a(par2, par3 + 1, par4);
/*     */     
/*  52 */     if (bid == Blocks.field_150350_a && !par1World.func_72935_r() && OreSpawnMain.FireflyEnable != 0) {
/*     */       
/*  54 */       rate = 2 + par1World.field_73012_v.nextInt(5);
/*  55 */       for (int i = 0; i < rate; i++) {
/*  56 */         spawnCreature(par1World, "Firefly", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/*  67 */     Entity var8 = null;
/*     */ 
/*     */     
/*  70 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/*  72 */     if (var8 != null) {
/*     */ 
/*     */       
/*  75 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/*  78 */       par0World.func_72838_d(var8);
/*     */       
/*  80 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/*  83 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/*  92 */     if (par2 < 7) {
/*     */       
/*  94 */       if (par2 >= 6)
/*     */       {
/*  96 */         par2 = 4;
/*     */       }
/*  98 */       return this.field_94364_a[par2 >> 1];
/*     */     } 
/*     */ 
/*     */     
/* 102 */     return this.field_94364_a[3];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 111 */     return 1 + par1Random.nextInt(5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_149866_i() {
/* 119 */     return OreSpawnMain.MyFireflySeed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_149865_P() {
/* 127 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 134 */     this.field_94364_a = new IIcon[4];
/*     */     
/* 136 */     for (int i = 0; i < this.field_94364_a.length; i++)
/*     */     {
/* 138 */       this.field_94364_a[i] = par1IIconRegister.func_94245_a("OreSpawn:firefly_" + i);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockFireflyPlant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */