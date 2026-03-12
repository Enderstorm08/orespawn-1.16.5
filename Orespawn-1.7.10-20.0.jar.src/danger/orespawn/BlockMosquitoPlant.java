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
/*     */ public class BlockMosquitoPlant
/*     */   extends BlockCrops
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] field_94364_a;
/*     */   
/*     */   public BlockMosquitoPlant(int par1) {
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
/*  39 */       return;  if (OreSpawnMain.MosquitoEnable == 0)
/*     */       return; 
/*  41 */     int rate = par1World.func_72805_g(par2, par3, par4);
/*  42 */     rate &= 0x7;
/*  43 */     rate = 7 - rate;
/*  44 */     if (rate > 1 && 
/*  45 */       OreSpawnMain.OreSpawnRand.nextInt(rate) != 0) {
/*     */       return;
/*     */     }
/*  48 */     Block bid = par1World.func_147439_a(par2, par3 + 1, par4);
/*     */     
/*  50 */     if (bid == Blocks.field_150350_a) {
/*     */       
/*  52 */       int howmany = 2 + OreSpawnMain.OreSpawnRand.nextInt(5);
/*  53 */       for (int i = 0; i < howmany; i++) {
/*  54 */         spawnCreature(par1World, "Mosquito", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
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
/*  65 */     Entity var8 = null;
/*     */ 
/*     */     
/*  68 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/*  70 */     if (var8 != null) {
/*     */ 
/*     */       
/*  73 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/*  76 */       par0World.func_72838_d(var8);
/*     */       
/*  78 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/*  81 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IIcon func_149691_a(int par1, int par2) {
/*  89 */     if (par2 < 7) {
/*     */       
/*  91 */       if (par2 >= 6)
/*     */       {
/*  93 */         par2 = 4;
/*     */       }
/*  95 */       return this.field_94364_a[par2 >> 1];
/*     */     } 
/*     */ 
/*     */     
/*  99 */     return this.field_94364_a[3];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 108 */     return 1 + par1Random.nextInt(5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_149866_i() {
/* 116 */     return OreSpawnMain.MyMosquitoSeed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_149865_P() {
/* 124 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 131 */     this.field_94364_a = new IIcon[4];
/*     */     
/* 133 */     for (int i = 0; i < this.field_94364_a.length; i++)
/*     */     {
/* 135 */       this.field_94364_a[i] = par1IIconRegister.func_94245_a("OreSpawn:mosquito_" + i);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockMosquitoPlant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */