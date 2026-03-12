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
/*     */ public class StepAccross
/*     */   extends Item
/*     */ {
/*     */   public StepAccross(int i) {
/*  29 */     this.field_77777_bU = 16;
/*  30 */     func_77637_a(CreativeTabs.field_78040_i);
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
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
/*  43 */     int deltax = 0, deltaz = 0;
/*     */ 
/*     */     
/*  46 */     int length = 33;
/*     */     
/*  48 */     int x = cposx, y = cposy + 1, z = cposz;
/*     */     
/*  50 */     float f = Player.field_70759_as;
/*  51 */     f += 22.5F;
/*  52 */     f %= 360.0F;
/*  53 */     f /= 45.0F;
/*  54 */     switch ((int)f) {
/*     */       case 0:
/*  56 */         deltax = 0;
/*  57 */         deltaz = 1;
/*     */         break;
/*     */       case 1:
/*  60 */         deltax = -1;
/*  61 */         deltaz = 1;
/*     */         break;
/*     */       case 2:
/*  64 */         deltax = -1;
/*  65 */         deltaz = 0;
/*     */         break;
/*     */       case 3:
/*  68 */         deltax = -1;
/*  69 */         deltaz = -1;
/*     */         break;
/*     */       case 4:
/*  72 */         deltax = 0;
/*  73 */         deltaz = -1;
/*     */         break;
/*     */       case 5:
/*  76 */         deltax = 1;
/*  77 */         deltaz = -1;
/*     */         break;
/*     */       case 6:
/*  80 */         deltax = 1;
/*  81 */         deltaz = 0;
/*     */         break;
/*     */       case 7:
/*  84 */         deltax = 1;
/*  85 */         deltaz = 1;
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/*  90 */     if (deltax == 0 && deltaz == 0) return false;
/*     */     
/*  92 */     Player.field_70170_p.func_72956_a((Entity)Player, "random.explode", 1.0F, 1.5F);
/*     */     
/*  94 */     if (world.field_72995_K) {
/*     */       
/*  96 */       for (int var3 = 0; var3 < 6; var3++) {
/*     */         
/*  98 */         world.func_72869_a("largesmoke", (x + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (y + world.field_73012_v.nextFloat()), (z + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*  99 */         world.func_72869_a("largeexplode", (x + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (y + world.field_73012_v.nextFloat()), (z + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/* 100 */         world.func_72869_a("reddust", (x + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (y + world.field_73012_v.nextFloat()), (z + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/* 103 */       return true;
/*     */     } 
/*     */     
/* 106 */     for (int k = 1; k < length; ) {
/* 107 */       Block bid = world.func_147439_a(x + k * deltax, y - 1, z + k * deltaz);
/* 108 */       if (bid == Blocks.field_150350_a) {
/* 109 */         world.func_147465_d(x + k * deltax, y - 1, z + k * deltaz, Blocks.field_150347_e, 0, 2);
/*     */ 
/*     */ 
/*     */         
/* 113 */         if ((k - 1) % 8 == 0) {
/* 114 */           bid = world.func_147439_a(x + k * deltax, y, z + k * deltaz);
/* 115 */           if (bid == Blocks.field_150350_a) {
/* 116 */             world.func_147465_d(x + k * deltax, y, z + k * deltaz, OreSpawnMain.ExtremeTorch, 0, 2);
/*     */           }
/*     */         } 
/*     */         k++;
/*     */       } 
/*     */     } 
/* 122 */     if (!Player.field_71075_bZ.field_75098_d)
/*     */     {
/* 124 */       par1ItemStack.field_77994_a--;
/*     */     }
/*     */     
/* 127 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 133 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\StepAccross.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */