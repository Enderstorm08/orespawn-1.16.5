/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.block.BlockDispenser;
/*    */ import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
/*    */ import net.minecraft.dispenser.IBlockSource;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class DispenserBehaviorOreSpawnEgg
/*    */   extends BehaviorDefaultDispenseItem
/*    */ {
/*    */   public ItemStack func_82487_b(IBlockSource par1IBlockSource, ItemStack par2ItemStack) {
/* 23 */     EnumFacing enumfacing = BlockDispenser.func_149937_b(par1IBlockSource.func_82620_h());
/* 24 */     double d0 = par1IBlockSource.func_82615_a() + enumfacing.func_82601_c() * 2.0D;
/* 25 */     double d1 = (par1IBlockSource.func_82622_e() + 0.2F);
/* 26 */     double d2 = par1IBlockSource.func_82616_c() + enumfacing.func_82599_e() * 2.0D;
/* 27 */     Item it = par2ItemStack.func_77973_b();
/* 28 */     if (it instanceof ItemSpawnEgg) {
/* 29 */       ItemSpawnEgg ise = (ItemSpawnEgg)it;
/* 30 */       Entity entity = ItemSpawnEgg.spawn_something(ise.my_id, par1IBlockSource.func_82618_k(), (int)d0, (int)d1, (int)d2);
/* 31 */       if (entity instanceof net.minecraft.entity.EntityLivingBase && par2ItemStack.func_82837_s())
/*    */       {
/* 33 */         ((EntityLiving)entity).func_94058_c(par2ItemStack.func_82833_r());
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 38 */     par2ItemStack.func_77979_a(1);
/* 39 */     return par2ItemStack;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\DispenserBehaviorOreSpawnEgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */