/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockReed;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IslandBlock
/*     */   extends BlockReed
/*     */ {
/*     */   protected IslandBlock(int par1) {
/*  25 */     float var3 = 0.375F;
/*  26 */     func_149676_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
/*  27 */     func_149675_a(true);
/*  28 */     func_149647_a(CreativeTabs.field_78031_c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149742_c(World par1World, int par2, int par3, int par4) {
/*  37 */     if (par1World.func_147439_a(par2, par3 - 1, par4).func_149688_o().func_76220_a()) return true; 
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  43 */     if (par1World.field_73012_v.nextInt(20) != 1)
/*     */       return; 
/*  45 */     for (int j1 = 0; j1 < 20; j1++)
/*     */     {
/*     */       
/*  48 */       par1World.func_72869_a("happyVillager", (par2 + par1World.field_73012_v.nextFloat()), par3 + par1World.field_73012_v.nextFloat(), (par4 + par1World.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  61 */     int isok = 1;
/*  62 */     if (par1World.field_72995_K) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     int n = 1 + par1World.field_73012_v.nextInt(3);
/*  70 */     int m = 64;
/*  71 */     if (OreSpawnMain.IslandSizeFactor == 2) m = 55; 
/*  72 */     if (OreSpawnMain.IslandSizeFactor == 1) m = 45;
/*     */     
/*  74 */     for (int i = 0; i < n; i++) {
/*  75 */       int height = 12 + par1World.field_73012_v.nextInt(m);
/*  76 */       isok = 1;
/*  77 */       for (int k = -10; k <= 10; k++) {
/*     */         
/*  79 */         for (int j = -10; j <= 10; j++) {
/*     */           
/*  81 */           Block bid = par1World.func_147439_a(par2 + j, par3 + height, par4 + k);
/*  82 */           if (bid != Blocks.field_150350_a) {
/*  83 */             isok = 0;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*  89 */       if (isok != 0) {
/*  90 */         if (par1World.field_73012_v.nextInt(25) == 1) {
/*  91 */           this; spawnCreature(par1World, "Island", par2, (par3 + height), par4);
/*     */         } else {
/*  93 */           this; spawnCreature(par1World, "IslandToo", par2, (par3 + height), par4);
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/*  98 */     par1World.func_147465_d(par2, par3, par4, Blocks.field_150350_a, 0, 2);
/*  99 */     par1World.func_147465_d(par2, par3 + 1, par4, Blocks.field_150350_a, 0, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/* 107 */     return Item.func_150898_a(OreSpawnMain.MyIslandBlock);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_149745_a(Random par1Random) {
/* 115 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 125 */     Entity var8 = null;
/*     */ 
/*     */     
/* 128 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/* 130 */     if (var8 != null) {
/*     */ 
/*     */       
/* 133 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 136 */       par0World.func_72838_d(var8);
/*     */       
/* 138 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/* 141 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/* 148 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\IslandBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */