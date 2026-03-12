/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ 
/*     */ 
/*     */ public class ItemMinersDream
/*     */   extends Item
/*     */ {
/*     */   public ItemMinersDream(int i) {
/*  32 */     this.field_77777_bU = 16;
/*  33 */     func_77637_a(CreativeTabs.field_78028_d);
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
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
/*  47 */     int deltax = 0, deltaz = 0;
/*     */ 
/*     */     
/*  50 */     int dirx = 0, dirz = 0;
/*  51 */     int height = 5, width = 5, length = 64;
/*  52 */     int torches = 5;
/*  53 */     int solid_count = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     if (cposx < 0) dirx = -1; 
/*  64 */     if (cposz < 0) dirz = -1; 
/*  65 */     int pposx = (int)(Player.field_70165_t + 0.99D * dirx);
/*  66 */     int pposy = (int)Player.field_70163_u;
/*  67 */     int pposz = (int)(Player.field_70161_v + 0.99D * dirz);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     if (cposx - pposx == 0 || cposz - pposz == 0) {
/*     */ 
/*     */       
/*  75 */       int x = cposx, y = pposy, z = cposz;
/*  76 */       if (x - pposx < 0) deltax = -1; 
/*  77 */       if (x - pposx > 0) deltax = 1; 
/*  78 */       if (z - pposz < 0) deltaz = -1; 
/*  79 */       if (z - pposz > 0) deltaz = 1; 
/*  80 */       if (deltax == 0 && deltaz == 0) return false; 
/*  81 */       if (deltax != 0 && deltaz != 0) return false;
/*     */       
/*  83 */       Player.field_70170_p.func_72956_a((Entity)Player, "random.explode", 1.0F, 1.5F);
/*     */       
/*  85 */       if (world.field_72995_K)
/*     */       {
/*     */         
/*  88 */         return true;
/*     */       }
/*     */ 
/*     */       
/*  92 */       for (int i = 0; i < height; i++) {
/*     */ 
/*     */         
/*  95 */         for (int j = 0; j < length; j++) {
/*     */           
/*  97 */           solid_count = 0; int m;
/*  98 */           for (m = -width; m <= width; m++) {
/*     */             
/* 100 */             Block bid = world.func_147439_a(x + j * deltax + m * deltaz, y + i, z + j * deltaz + m * deltax);
/* 101 */             if (bid == Blocks.field_150348_b || bid == Blocks.field_150346_d || bid == Blocks.field_150351_n || bid == Blocks.field_150358_i || bid == Blocks.field_150355_j || bid == Blocks.field_150356_k || bid == Blocks.field_150353_l || bid == Blocks.field_150424_aL || bid == Blocks.field_150377_bs || bid == OreSpawnMain.CrystalStone)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 107 */               world.func_147465_d(x + j * deltax + m * deltaz, y + i, z + j * deltaz + m * deltax, Blocks.field_150350_a, 0, 2);
/*     */             }
/*     */             
/* 110 */             if (i == height - 1) {
/*     */               
/* 112 */               bid = world.func_147439_a(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax);
/* 113 */               if (bid != Blocks.field_150350_a) solid_count++; 
/* 114 */               if (bid == Blocks.field_150350_a || bid == Blocks.field_150351_n || bid == Blocks.field_150354_m || bid == Blocks.field_150358_i || bid == Blocks.field_150355_j || bid == Blocks.field_150356_k || bid == Blocks.field_150353_l)
/*     */               {
/*     */ 
/*     */                 
/* 118 */                 if (world.field_73011_w.field_76574_g == OreSpawnMain.DimensionID5) {
/* 119 */                   world.func_147465_d(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax, OreSpawnMain.CrystalStone, 0, 2);
/*     */                 } else {
/* 121 */                   world.func_147465_d(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax, Blocks.field_150347_e, 0, 2);
/*     */                 } 
/*     */               }
/*     */             } 
/*     */           } 
/*     */ 
/*     */           
/* 128 */           if (i == height - 1 && solid_count == 0)
/*     */           {
/*     */             
/* 131 */             for (m = -width; m <= width; m++)
/*     */             {
/* 133 */               world.func_147465_d(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax, Blocks.field_150350_a, 0, 2);
/*     */             }
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/*     */       int k;
/*     */       
/* 141 */       for (k = 0; k < length; k += torches) {
/*     */         
/* 143 */         Block bid = world.func_147439_a(x + k * deltax, y - 1, z + k * deltaz);
/* 144 */         if (bid == Blocks.field_150348_b || bid == Blocks.field_150346_d || bid == Blocks.field_150351_n || bid == Blocks.field_150424_aL || bid == Blocks.field_150377_bs || bid == Blocks.field_150357_h)
/*     */         {
/*     */           
/* 147 */           if (world.func_147437_c(x + k * deltax, y, z + k * deltaz))
/*     */           {
/* 149 */             world.func_147465_d(x + k * deltax, y, z + k * deltaz, OreSpawnMain.ExtremeTorch, 0, 2);
/*     */           }
/*     */         }
/* 152 */         if (bid == OreSpawnMain.CrystalStone)
/*     */         {
/* 154 */           if (world.func_147437_c(x + k * deltax, y, z + k * deltaz))
/*     */           {
/* 156 */             world.func_147465_d(x + k * deltax, y, z + k * deltaz, OreSpawnMain.CrystalTorch, 0, 2);
/*     */           }
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 162 */       if (!Player.field_71075_bZ.field_75098_d)
/*     */       {
/* 164 */         par1ItemStack.field_77994_a--;
/*     */       }
/*     */       
/* 167 */       return true;
/*     */     } 
/* 169 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 176 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemMinersDream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */