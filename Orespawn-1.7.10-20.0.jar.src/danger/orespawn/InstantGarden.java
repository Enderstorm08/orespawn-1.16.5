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
/*     */ public class InstantGarden
/*     */   extends Item
/*     */ {
/*     */   public InstantGarden(int i) {
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
/*  49 */     int bid = 0;
/*  50 */     int dirx = 0, dirz = 0;
/*  51 */     int height = 10, width = 7, length = 18;
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
/*  62 */     if (cposx < 0) dirx = -1; 
/*  63 */     if (cposz < 0) dirz = -1; 
/*  64 */     int pposx = (int)(Player.field_70165_t + 0.99D * dirx);
/*  65 */     int pposy = (int)Player.field_70163_u;
/*  66 */     int pposz = (int)(Player.field_70161_v + 0.99D * dirz);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     if (cposx - pposx == 0 || cposz - pposz == 0) {
/*     */       
/*  73 */       int x = cposx, y = pposy, z = cposz;
/*  74 */       if (x - pposx < 0) deltax = -1; 
/*  75 */       if (x - pposx > 0) deltax = 1; 
/*  76 */       if (z - pposz < 0) deltaz = -1; 
/*  77 */       if (z - pposz > 0) deltaz = 1; 
/*  78 */       if (deltax == 0 && deltaz == 0) return false; 
/*  79 */       if (deltax != 0 && deltaz != 0) return false;
/*     */       
/*  81 */       Player.field_70170_p.func_72956_a((Entity)Player, "random.explode", 1.0F, 1.5F);
/*     */       
/*  83 */       if (world.field_72995_K)
/*     */       {
/*     */         
/*  86 */         return true;
/*     */       }
/*     */       
/*     */       int i;
/*  90 */       for (i = 0; i < height; i++) {
/*     */ 
/*     */         
/*  93 */         for (int j = 0; j < length; j++) {
/*     */ 
/*     */           
/*  96 */           for (int m = -width; m <= width; m++) {
/*     */ 
/*     */             
/*  99 */             world.func_147465_d(x + j * deltax + m * deltaz, y + i, z + j * deltaz + m * deltax, Blocks.field_150350_a, 0, 2);
/* 100 */             if (i == 0) world.func_147465_d(x + j * deltax + m * deltaz, y + i - 1, z + j * deltaz + m * deltax, (Block)Blocks.field_150349_c, 0, 2);
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 108 */       for (int k = 1; k < length - 1; k++) {
/*     */         
/* 110 */         i = 0;
/* 111 */         for (int j = -width; j <= width; j++) {
/*     */           
/* 113 */           if (i == 1) {
/* 114 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 115 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, OreSpawnMain.MyRadishPlant, 0, 2);
/*     */           } 
/* 117 */           if (i == 2) {
/* 118 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 119 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, OreSpawnMain.MyLettucePlant1, 0, 2);
/*     */           } 
/* 121 */           if (i == 3) {
/* 122 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 123 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, Blocks.field_150459_bM, 0, 2);
/*     */           } 
/* 125 */           if (i == 4) {
/* 126 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150355_j, 0, 2);
/* 127 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 2, z + k * deltaz + j * deltax, Blocks.field_150347_e, 0, 2);
/*     */           } 
/* 129 */           if (i == 5) {
/* 130 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 131 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, Blocks.field_150469_bN, 0, 2);
/*     */           } 
/* 133 */           if (i == 6) {
/* 134 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 135 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, Blocks.field_150464_aj, 0, 2);
/*     */           } 
/* 137 */           if (i == 7) {
/* 138 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 139 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, OreSpawnMain.MyTomatoPlant1, 0, 2);
/*     */           } 
/* 141 */           if (i == 8) {
/* 142 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150355_j, 0, 2);
/* 143 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 2, z + k * deltaz + j * deltax, Blocks.field_150347_e, 0, 2);
/*     */           } 
/* 145 */           if (i == 9) {
/* 146 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 147 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, OreSpawnMain.MyCornPlant1, 0, 2);
/*     */           } 
/* 149 */           if (i == 10) {
/* 150 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 151 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, OreSpawnMain.MyStrawberryPlant, 0, 2);
/*     */           } 
/* 153 */           if (i == 11) {
/* 154 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 2, z + k * deltaz + j * deltax, Blocks.field_150347_e, 0, 2);
/* 155 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, (Block)Blocks.field_150354_m, 0, 2);
/* 156 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, Blocks.field_150436_aH, 0, 2);
/*     */           } 
/* 158 */           if (i == 12) {
/* 159 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150355_j, 0, 2);
/* 160 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 2, z + k * deltaz + j * deltax, Blocks.field_150347_e, 0, 2);
/*     */           } 
/* 162 */           if (i == 13) {
/* 163 */             world.func_147465_d(x + k * deltax + j * deltaz, y - 1, z + k * deltaz + j * deltax, Blocks.field_150458_ak, 0, 2);
/* 164 */             world.func_147465_d(x + k * deltax + j * deltaz, y, z + k * deltaz + j * deltax, Blocks.field_150394_bc, 0, 2);
/*     */           } 
/* 166 */           i++;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 171 */       if (!Player.field_71075_bZ.field_75098_d)
/*     */       {
/* 173 */         par1ItemStack.field_77994_a--;
/*     */       }
/*     */       
/* 176 */       return true;
/*     */     } 
/* 178 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 185 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\InstantGarden.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */