/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockGrass;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.ColorizerGrass;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AntBlock
/*     */   extends BlockGrass
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] field_94364_a;
/*     */   
/*     */   protected AntBlock(int par1) {
/*  31 */     func_149675_a(true);
/*  32 */     func_149647_a(CreativeTabs.field_78030_b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149691_a(int par1, int par2) {
/*  41 */     if (this.field_94364_a == null) return null; 
/*  42 */     return (par1 == 1) ? this.field_94364_a[0] : ((par1 == 0) ? this.field_94364_a[1] : this.field_94364_a[2]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_149673_e(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  52 */     if (this.field_94364_a == null) return null; 
/*  53 */     if (par5 == 1)
/*     */     {
/*  55 */       return this.field_94364_a[0];
/*     */     }
/*  57 */     if (par5 == 0)
/*     */     {
/*  59 */       return this.field_94364_a[1];
/*     */     }
/*     */ 
/*     */     
/*  63 */     return this.field_94364_a[2];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  74 */     int howmany = 0;
/*     */     
/*  76 */     if (!par1World.field_72995_K) {
/*     */       
/*  78 */       if (par1World.func_72896_J())
/*     */         return; 
/*  80 */       Block bid = par1World.func_147439_a(par2, par3 + 1, par4);
/*     */       
/*  82 */       if (bid == Blocks.field_150350_a) {
/*  83 */         howmany = OreSpawnMain.OreSpawnRand.nextInt(6) + 2;
/*  84 */         for (int i = 0; i < howmany; i++) {
/*  85 */           if (this == OreSpawnMain.MyAntBlock) {
/*  86 */             if (OreSpawnMain.BlackAntEnable != 0) {
/*  87 */               spawnCreature(par1World, "Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
/*     */             }
/*  89 */           } else if (this == OreSpawnMain.MyRedAntBlock) {
/*  90 */             if (OreSpawnMain.RedAntEnable != 0) {
/*  91 */               spawnCreature(par1World, "Red Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
/*     */             }
/*  93 */           } else if (this == OreSpawnMain.MyUnstableAntBlock) {
/*  94 */             if (OreSpawnMain.UnstableAntEnable != 0) {
/*  95 */               spawnCreature(par1World, "Unstable Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
/*     */             }
/*  97 */           } else if (this == OreSpawnMain.TermiteBlock) {
/*  98 */             if (OreSpawnMain.TermiteEnable != 0) {
/*  99 */               spawnCreature(par1World, "Termite", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
/*     */             }
/*     */           }
/* 102 */           else if (OreSpawnMain.RainbowAntEnable != 0) {
/* 103 */             spawnCreature(par1World, "Rainbow Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random par2Random, int par3) {
/* 117 */     return Item.func_150898_a((Block)this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 126 */     Entity var8 = null;
/*     */ 
/*     */     
/* 129 */     var8 = EntityList.func_75620_a(par1, par0World);
/*     */     
/* 131 */     if (var8 != null) {
/*     */ 
/*     */       
/* 134 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 137 */       par0World.func_72838_d(var8);
/*     */       
/* 139 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/* 142 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int func_149635_D() {
/* 149 */     double var1 = 0.5D;
/* 150 */     double var3 = 1.0D;
/* 151 */     return ColorizerGrass.func_77480_a(var1, var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int func_149741_i(int par1) {
/* 161 */     return func_149635_D();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int func_149720_d(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
/* 172 */     int l = 0;
/* 173 */     int i1 = 0;
/* 174 */     int j1 = 0;
/*     */     
/* 176 */     for (int k1 = -1; k1 <= 1; k1++) {
/*     */       
/* 178 */       for (int l1 = -1; l1 <= 1; l1++) {
/*     */         
/* 180 */         int i2 = p_149720_1_.func_72807_a(p_149720_2_ + l1, p_149720_4_ + k1).func_150558_b(p_149720_2_ + l1, p_149720_3_, p_149720_4_ + k1);
/* 181 */         l += (i2 & 0xFF0000) >> 16;
/* 182 */         i1 += (i2 & 0xFF00) >> 8;
/* 183 */         j1 += i2 & 0xFF;
/*     */       } 
/*     */     } 
/*     */     
/* 187 */     return (l / 9 & 0xFF) << 16 | (i1 / 9 & 0xFF) << 8 | j1 / 9 & 0xFF;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 194 */     this.field_94364_a = new IIcon[3];
/*     */     
/* 196 */     this.field_94364_a[0] = par1IIconRegister.func_94245_a("OreSpawn:antnest_top");
/* 197 */     this.field_94364_a[1] = par1IIconRegister.func_94245_a("OreSpawn:antnest_bottom");
/* 198 */     this.field_94364_a[2] = par1IIconRegister.func_94245_a("OreSpawn:antnest_side");
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\AntBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */