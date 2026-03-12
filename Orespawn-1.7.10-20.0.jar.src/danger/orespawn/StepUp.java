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
/*     */ public class StepUp
/*     */   extends Item
/*     */ {
/*     */   public StepUp(int i) {
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
/*     */   
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
/*  44 */     int deltax = 0, deltaz = 0;
/*     */ 
/*     */     
/*  47 */     int length = 33;
/*     */     
/*  49 */     int x = cposx, y = cposy + 1, z = cposz;
/*     */     
/*  51 */     float f = Player.field_70759_as;
/*  52 */     f += 22.5F;
/*  53 */     f %= 360.0F;
/*  54 */     f /= 45.0F;
/*  55 */     switch ((int)f) {
/*     */       case 0:
/*  57 */         deltax = 0;
/*  58 */         deltaz = 1;
/*     */         break;
/*     */       case 1:
/*  61 */         deltax = -1;
/*  62 */         deltaz = 1;
/*     */         break;
/*     */       case 2:
/*  65 */         deltax = -1;
/*  66 */         deltaz = 0;
/*     */         break;
/*     */       case 3:
/*  69 */         deltax = -1;
/*  70 */         deltaz = -1;
/*     */         break;
/*     */       case 4:
/*  73 */         deltax = 0;
/*  74 */         deltaz = -1;
/*     */         break;
/*     */       case 5:
/*  77 */         deltax = 1;
/*  78 */         deltaz = -1;
/*     */         break;
/*     */       case 6:
/*  81 */         deltax = 1;
/*  82 */         deltaz = 0;
/*     */         break;
/*     */       case 7:
/*  85 */         deltax = 1;
/*  86 */         deltaz = 1;
/*     */         break;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  92 */     if (deltax == 0 && deltaz == 0) return false;
/*     */     
/*  94 */     Player.field_70170_p.func_72956_a((Entity)Player, "random.explode", 1.0F, 1.5F);
/*     */     
/*  96 */     if (world.field_72995_K) {
/*     */       
/*  98 */       for (int var3 = 0; var3 < 6; var3++) {
/*     */         
/* 100 */         world.func_72869_a("largesmoke", (x + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (y + world.field_73012_v.nextFloat() + 1.0F), (z + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/* 101 */         world.func_72869_a("largeexplode", (x + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (y + world.field_73012_v.nextFloat() + 1.0F), (z + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/* 102 */         world.func_72869_a("reddust", (x + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), (y + world.field_73012_v.nextFloat() + 1.0F), (z + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/* 105 */       return true;
/*     */     } 
/*     */     
/* 108 */     for (int k = 1; k < length; ) {
/* 109 */       Block bid = world.func_147439_a(x + k * deltax, y + k - 1, z + k * deltaz);
/* 110 */       if (bid == Blocks.field_150350_a) {
/* 111 */         world.func_147465_d(x + k * deltax, y + k - 1, z + k * deltaz, Blocks.field_150347_e, 0, 2);
/*     */ 
/*     */ 
/*     */         
/* 115 */         if ((k - 1) % 8 == 0) {
/* 116 */           bid = world.func_147439_a(x + k * deltax, y + k, z + k * deltaz);
/* 117 */           if (bid == Blocks.field_150350_a) {
/* 118 */             world.func_147465_d(x + k * deltax, y + k, z + k * deltaz, OreSpawnMain.ExtremeTorch, 0, 2);
/*     */           }
/*     */         } 
/*     */         k++;
/*     */       } 
/*     */     } 
/* 124 */     if (!Player.field_71075_bZ.field_75098_d)
/*     */     {
/* 126 */       par1ItemStack.field_77994_a--;
/*     */     }
/*     */     
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 136 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\StepUp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */