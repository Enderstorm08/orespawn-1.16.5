/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemExperienceTreeSeed
/*    */   extends Item
/*    */ {
/*    */   public ItemExperienceTreeSeed(int i) {
/* 27 */     this.field_77777_bU = 1;
/* 28 */     func_77637_a(CreativeTabs.field_78031_c);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
/* 35 */     if (!world.field_72995_K) {
/*    */ 
/*    */       
/* 38 */       Block bid = world.func_147439_a(x, y, z);
/* 39 */       if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150458_ak) {
/* 40 */         return false;
/*    */       }
/*    */       
/* 43 */       world.func_147465_d(x, y + 1, z, OreSpawnMain.MyExperiencePlant, 0, 2);
/*    */     } else {
/*    */       
/* 46 */       for (int j1 = 0; j1 < 10; j1++)
/*    */       {
/*    */         
/* 49 */         world.func_72869_a("happyVillager", (x + world.field_73012_v.nextFloat()), y + 1.0D + world.field_73012_v.nextFloat(), (z + world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 54 */     if (!par2EntityPlayer.field_71075_bZ.field_75098_d)
/*    */     {
/* 56 */       par1ItemStack.field_77994_a--;
/*    */     }
/*    */     
/* 59 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 64 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemExperienceTreeSeed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */