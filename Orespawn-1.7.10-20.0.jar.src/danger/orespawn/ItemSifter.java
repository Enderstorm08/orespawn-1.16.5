/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
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
/*     */ public class ItemSifter
/*     */   extends Item
/*     */ {
/*     */   public ItemSifter(int i) {
/*  33 */     this.field_77777_bU = 1;
/*  34 */     func_77637_a(CreativeTabs.field_78031_c);
/*  35 */     func_77656_e(600);
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1, World world, int x, int y, int z) {
/*  40 */     EntityItem var3 = new EntityItem(world, (x + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2)) + 0.5D, y + 1.1D, (z + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2)) + 0.5D, new ItemStack(index, par1, 0));
/*     */     
/*  42 */     world.func_72838_d((Entity)var3);
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
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  56 */     if (par3World.field_72995_K)
/*     */     {
/*  58 */       return true;
/*     */     }
/*  60 */     Block bid = par3World.func_147439_a(par4, par5, par6);
/*  61 */     Block bid2 = par3World.func_147439_a(par4, par5 + 1, par6);
/*  62 */     if (bid2 == Blocks.field_150358_i) bid = Blocks.field_150355_j; 
/*  63 */     if (bid2 == Blocks.field_150355_j) bid = Blocks.field_150355_j;
/*     */     
/*  65 */     if (bid == Blocks.field_150355_j) {
/*  66 */       int i = par3World.field_73012_v.nextInt(160);
/*  67 */       switch (i) {
/*     */         case 0:
/*  69 */           dropItemRand(Items.field_151115_aP, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 1:
/*  72 */           dropItemRand(OreSpawnMain.MyGreenFish, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 2:
/*  75 */           dropItemRand(OreSpawnMain.MyBlueFish, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 3:
/*  78 */           dropItemRand(OreSpawnMain.MyPinkFish, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 4:
/*  81 */           dropItemRand(OreSpawnMain.MyRockFish, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 5:
/*  84 */           dropItemRand(OreSpawnMain.MyWoodFish, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 6:
/*  87 */           dropItemRand(OreSpawnMain.MyGreyFish, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 7:
/*  90 */           dropItemRand(Items.field_151069_bo, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 8:
/*  93 */           dropItemRand(Items.field_151042_j, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 9:
/*  96 */           dropItemRand(Items.field_151074_bl, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 10:
/*  99 */           dropItemRand(OreSpawnMain.MyItemShoes, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 11:
/* 102 */           dropItemRand(OreSpawnMain.MyItemShoes_1, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 12:
/* 105 */           dropItemRand(OreSpawnMain.MyItemShoes_2, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 13:
/* 108 */           dropItemRand(OreSpawnMain.MyItemShoes_3, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 14:
/* 111 */           dropItemRand(Items.field_151069_bo, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 15:
/* 114 */           dropItemRand(Items.field_151103_aS, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 16:
/* 117 */           dropItemRand(Item.func_150898_a(Blocks.field_150348_b), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 17:
/* 120 */           dropItemRand(Items.field_151133_ar, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 18:
/* 123 */           dropItemRand(Items.field_151131_as, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 19:
/* 126 */           if (par3World.field_73012_v.nextInt(3) == 1) {
/* 127 */             dropItemRand(Items.field_151166_bC, 1, par3World, par4, par5, par6); break;
/*     */           } 
/* 129 */           dropItemRand(Item.func_150898_a(Blocks.field_150351_n), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 20:
/* 132 */           if (par3World.field_73012_v.nextInt(3) == 1) {
/* 133 */             dropItemRand(OreSpawnMain.MyRuby, 1, par3World, par4, par5, par6); break;
/*     */           } 
/* 135 */           dropItemRand(Item.func_150898_a(Blocks.field_150351_n), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 21:
/* 138 */           if (par3World.field_73012_v.nextInt(3) == 1) {
/* 139 */             dropItemRand(OreSpawnMain.MyAmethyst, 1, par3World, par4, par5, par6); break;
/*     */           } 
/* 141 */           dropItemRand(Item.func_150898_a(Blocks.field_150351_n), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 22:
/* 144 */           dropItemRand(OreSpawnMain.MyMothScale, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 23:
/* 147 */           dropItemRand(OreSpawnMain.UraniumNugget, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 24:
/* 150 */           dropItemRand(OreSpawnMain.TitaniumNugget, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 25:
/* 153 */           if (par3World.field_73012_v.nextInt(2) == 1) {
/* 154 */             dropItemRand(Items.field_151045_i, 1, par3World, par4, par5, par6); break;
/*     */           } 
/* 156 */           dropItemRand(Item.func_150898_a(Blocks.field_150351_n), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 26:
/* 159 */           dropItemRand(Items.field_151042_j, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 27:
/* 162 */           dropItemRand(Items.field_151074_bl, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 28:
/* 165 */           dropItemRand(Items.field_151137_ax, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 29:
/* 168 */           dropItemRand(Items.field_151044_h, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 30:
/* 171 */           dropItemRand(OreSpawnMain.MyItemShoes, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 31:
/* 174 */           dropItemRand(OreSpawnMain.MyItemShoes_1, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 32:
/* 177 */           dropItemRand(OreSpawnMain.MyItemShoes_2, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 33:
/* 180 */           dropItemRand(OreSpawnMain.MyItemShoes_3, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 34:
/* 183 */           dropItemRand(Items.field_151115_aP, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 35:
/* 186 */           dropItemRand(Items.field_151069_bo, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 36:
/* 189 */           dropItemRand(Items.field_151103_aS, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 37:
/* 192 */           dropItemRand(Item.func_150898_a(Blocks.field_150348_b), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 38:
/* 195 */           dropItemRand(Item.func_150898_a(Blocks.field_150430_aB), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 39:
/* 198 */           dropItemRand(Items.field_151133_ar, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 40:
/* 201 */           dropItemRand(Items.field_151131_as, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     } 
/* 208 */     if (bid == Blocks.field_150354_m) {
/* 209 */       int i = par3World.field_73012_v.nextInt(60);
/* 210 */       switch (i) {
/*     */         case 0:
/* 212 */           dropItemRand(Items.field_151138_bX, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 1:
/* 215 */           dropItemRand((Item)Items.field_151097_aZ, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 2:
/* 218 */           dropItemRand(Items.field_151146_bM, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 3:
/* 221 */           dropItemRand(Items.field_151170_bI, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 4:
/* 224 */           dropItemRand(Items.field_151160_bD, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 5:
/* 227 */           dropItemRand(Items.field_151103_aS, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 6:
/* 230 */           dropItemRand(Items.field_151111_aL, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 7:
/* 233 */           dropItemRand(Items.field_151069_bo, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 8:
/* 236 */           dropItemRand(Items.field_151141_av, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 9:
/* 239 */           dropItemRand((Item)Items.field_151028_Y, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 10:
/* 242 */           dropItemRand((Item)Items.field_151030_Z, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 11:
/* 245 */           dropItemRand((Item)Items.field_151165_aa, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 12:
/* 248 */           dropItemRand((Item)Items.field_151167_ab, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 13:
/* 251 */           dropItemRand(Item.func_150898_a((Block)Blocks.field_150354_m), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     } 
/* 258 */     if (bid == Blocks.field_150351_n) {
/* 259 */       int i = par3World.field_73012_v.nextInt(60);
/* 260 */       switch (i) {
/*     */         case 0:
/* 262 */           dropItemRand(Items.field_151145_ak, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 1:
/* 265 */           dropItemRand(OreSpawnMain.MySalt, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 2:
/* 268 */           dropItemRand(Items.field_151033_d, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 3:
/* 271 */           dropItemRand(Items.field_151070_bp, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 4:
/* 274 */           dropItemRand(Items.field_151160_bD, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 5:
/* 277 */           dropItemRand(Items.field_151008_G, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 6:
/* 280 */           dropItemRand(Items.field_151007_F, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 7:
/* 283 */           dropItemRand(Items.field_151069_bo, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 8:
/* 286 */           dropItemRand(Items.field_151058_ca, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 9:
/* 289 */           dropItemRand(Items.field_151057_cb, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 10:
/* 292 */           dropItemRand(Item.func_150898_a((Block)Blocks.field_150354_m), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 11:
/* 295 */           dropItemRand(Item.func_150898_a(Blocks.field_150351_n), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     } 
/* 302 */     if (bid == Blocks.field_150346_d) {
/* 303 */       int i = par3World.field_73012_v.nextInt(60);
/* 304 */       switch (i) {
/*     */         case 0:
/* 306 */           dropItemRand(Items.field_151007_F, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 1:
/* 309 */           dropItemRand(OreSpawnMain.MySalt, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 2:
/* 312 */           dropItemRand((Item)Items.field_151097_aZ, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 3:
/* 315 */           dropItemRand(Items.field_151055_y, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 4:
/* 318 */           dropItemRand(Items.field_151054_z, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 5:
/* 321 */           dropItemRand(Items.field_151162_bE, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 6:
/* 324 */           dropItemRand(Items.field_151155_ap, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 7:
/* 327 */           dropItemRand(Items.field_151118_aC, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 8:
/* 330 */           dropItemRand(Items.field_151121_aF, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 9:
/* 333 */           dropItemRand(Items.field_151103_aS, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 10:
/* 336 */           dropItemRand(Items.field_151069_bo, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 11:
/* 339 */           dropItemRand(Item.func_150898_a((Block)Blocks.field_150354_m), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 12:
/* 342 */           dropItemRand(Item.func_150898_a(Blocks.field_150351_n), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 13:
/* 345 */           dropItemRand(Item.func_150898_a(Blocks.field_150346_d), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     } 
/* 352 */     if (bid == Blocks.field_150349_c) {
/* 353 */       int i = par3World.field_73012_v.nextInt(60);
/* 354 */       switch (i) {
/*     */         case 0:
/* 356 */           dropItemRand(Item.func_150898_a((Block)Blocks.field_150327_N), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 1:
/* 359 */           dropItemRand(Item.func_150898_a((Block)Blocks.field_150328_O), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 2:
/* 362 */           dropItemRand(Item.func_150898_a(OreSpawnMain.MyFlowerPinkBlock), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 3:
/* 365 */           dropItemRand(Item.func_150898_a(OreSpawnMain.MyFlowerBlueBlock), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 4:
/* 368 */           dropItemRand(Item.func_150898_a(OreSpawnMain.MyFlowerBlackBlock), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 5:
/* 371 */           dropItemRand(Item.func_150898_a(OreSpawnMain.MyFlowerScaryBlock), 1, par3World, par4, par5, par6);
/*     */         case 6:
/* 373 */           dropItemRand(Items.field_151015_O, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 7:
/* 376 */           dropItemRand(Items.field_151080_bb, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 8:
/* 379 */           dropItemRand(Items.field_151081_bc, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 9:
/* 382 */           dropItemRand(Items.field_151172_bF, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 10:
/* 385 */           dropItemRand(Items.field_151174_bG, 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 11:
/* 388 */           dropItemRand(Item.func_150898_a((Block)Blocks.field_150330_I), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 12:
/* 391 */           dropItemRand(Item.func_150898_a(Blocks.field_150351_n), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 13:
/* 394 */           dropItemRand(Item.func_150898_a(Blocks.field_150346_d), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */         case 14:
/* 397 */           dropItemRand(Item.func_150898_a((Block)Blocks.field_150349_c), 1, par3World, par4, par5, par6);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     } 
/* 404 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par2EntityPlayer);
/*     */     
/* 406 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/* 415 */     return "Unknown";
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 421 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemSifter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */