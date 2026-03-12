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
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntityChest;
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
/*     */ public class InstantShelter
/*     */   extends Item
/*     */ {
/*     */   public InstantShelter(int i) {
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
/*     */     
/*  52 */     int stuffdir = 0;
/*     */     
/*  54 */     int length = 3, width = length;
/*  55 */     int height = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     if (cposx < 0) dirx = -1; 
/*  66 */     if (cposz < 0) dirz = -1; 
/*  67 */     int pposx = (int)(Player.field_70165_t + 0.99D * dirx);
/*  68 */     int pposy = (int)Player.field_70163_u;
/*  69 */     int pposz = (int)(Player.field_70161_v + 0.99D * dirz);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     if (cposx - pposx == 0 || cposz - pposz == 0) {
/*     */       
/*  76 */       int x = cposx, y = pposy - 1, z = cposz;
/*  77 */       if (x - pposx < 0) {
/*  78 */         deltax = -1;
/*  79 */         stuffdir = 3;
/*     */       } 
/*     */       
/*  82 */       if (x - pposx > 0) {
/*  83 */         deltax = 1;
/*     */         
/*  85 */         stuffdir = 2;
/*     */       } 
/*  87 */       if (z - pposz < 0) {
/*  88 */         deltaz = -1;
/*     */         
/*  90 */         stuffdir = 5;
/*     */       } 
/*  92 */       if (z - pposz > 0) {
/*  93 */         deltaz = 1;
/*     */         
/*  95 */         stuffdir = 4;
/*     */       } 
/*  97 */       if (deltax == 0 && deltaz == 0) return false; 
/*  98 */       if (deltax != 0 && deltaz != 0) return false;
/*     */       
/* 100 */       x = pposx; z = pposz;
/*     */       
/* 102 */       Player.field_70170_p.func_72956_a((Entity)Player, "random.explode", 1.0F, 1.5F);
/*     */       
/* 104 */       if (world.field_72995_K)
/*     */       {
/*     */         
/* 107 */         return true;
/*     */       }
/*     */       
/*     */       int i;
/* 111 */       for (i = -width; i <= width; i++) {
/*     */         
/* 113 */         for (int m = -length; m <= length; m++) {
/*     */           
/* 115 */           for (int n = 0; n <= height + 1; n++) {
/*     */             
/* 117 */             if (n == height + 1) {
/* 118 */               world.func_147449_b(x + i, y + n, z + m, Blocks.field_150344_f);
/* 119 */             } else if (n == 0) {
/* 120 */               world.func_147449_b(x + i, y + n, z + m, Blocks.field_150347_e);
/* 121 */             } else if (i == width || m == length || i == -width || m == -length) {
/* 122 */               if (n == height) {
/* 123 */                 world.func_147449_b(x + i, y + n, z + m, Blocks.field_150359_w);
/* 124 */               } else if ((n == 1 || n == 2) && i == deltax * width && m == deltaz * length) {
/*     */                 
/* 126 */                 world.func_147449_b(x + i, y + n, z + m, Blocks.field_150350_a);
/*     */               } else {
/* 128 */                 world.func_147449_b(x + i, y + n, z + m, Blocks.field_150344_f);
/*     */               } 
/*     */             } else {
/* 131 */               world.func_147449_b(x + i, y + n, z + m, Blocks.field_150350_a);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 138 */       i = 2; int k = 1, j = length - 1;
/* 139 */       world.func_147449_b(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, Blocks.field_150460_al);
/* 140 */       world.func_72921_c(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, stuffdir, 3);
/* 141 */       i = 1;
/* 142 */       world.func_147449_b(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, Blocks.field_150462_ai);
/* 143 */       i = 0;
/* 144 */       world.func_147449_b(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, (Block)Blocks.field_150486_ae);
/* 145 */       world.func_72921_c(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, stuffdir, 3);
/*     */       
/* 147 */       TileEntityChest chest = (TileEntityChest)world.func_147438_o(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax);
/* 148 */       if (chest != null) {
/*     */         
/* 150 */         chest.func_70299_a(0, new ItemStack(Items.field_151111_aL));
/* 151 */         chest.func_70299_a(1, new ItemStack((Item)Items.field_151148_bJ));
/* 152 */         chest.func_70299_a(2, new ItemStack(Items.field_151147_al, 8));
/* 153 */         chest.func_70299_a(3, new ItemStack(Blocks.field_150478_aa, 32));
/* 154 */         chest.func_70299_a(4, new ItemStack(Items.field_151044_h, 16));
/* 155 */         chest.func_70299_a(5, new ItemStack(Items.field_151104_aV));
/* 156 */         chest.func_70299_a(6, new ItemStack(Items.field_151104_aV));
/* 157 */         chest.func_70299_a(7, new ItemStack(Items.field_151135_aq));
/* 158 */         chest.func_70299_a(8, new ItemStack(Items.field_151035_b));
/* 159 */         chest.func_70299_a(9, new ItemStack(Items.field_151040_l));
/* 160 */         chest.func_70299_a(10, new ItemStack(Items.field_151036_c));
/* 161 */         chest.func_70299_a(11, new ItemStack(Items.field_151133_ar));
/* 162 */         chest.func_70299_a(12, new ItemStack(OreSpawnMain.MyOreSaltBlock, 4));
/* 163 */         chest.func_70299_a(13, new ItemStack((Block)Blocks.field_150486_ae));
/*     */       } 
/*     */ 
/*     */       
/* 167 */       if (!Player.field_71075_bZ.field_75098_d)
/*     */       {
/* 169 */         par1ItemStack.field_77994_a--;
/*     */       }
/*     */       
/* 172 */       return true;
/*     */     } 
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 181 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\InstantShelter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */