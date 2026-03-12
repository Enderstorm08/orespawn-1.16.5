/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.block.BlockDispenser;
/*    */ import net.minecraft.dispenser.BehaviorProjectileDispense;
/*    */ import net.minecraft.dispenser.IBlockSource;
/*    */ import net.minecraft.dispenser.IPosition;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.IProjectile;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ final class MyDispenserBehaviorRock
/*    */   extends BehaviorProjectileDispense
/*    */ {
/*    */   public ItemStack func_82487_b(IBlockSource par1IBlockSource, ItemStack par2ItemStack) {
/* 18 */     World world = par1IBlockSource.func_82618_k();
/* 19 */     IPosition iposition = BlockDispenser.func_149939_a(par1IBlockSource);
/* 20 */     EnumFacing enumfacing = BlockDispenser.func_149937_b(par1IBlockSource.func_82620_h());
/* 21 */     IProjectile iprojectile = func_82499_a(world, iposition);
/* 22 */     iprojectile.func_70186_c(enumfacing.func_82601_c(), (enumfacing.func_96559_d() + 0.1F), enumfacing.func_82599_e(), func_82500_b(), func_82498_a());
/* 23 */     EntityThrownRock r = (EntityThrownRock)iprojectile;
/* 24 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MySmallRock) r.setRockType(1); 
/* 25 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyRock) r.setRockType(2); 
/* 26 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyRedRock) r.setRockType(3); 
/* 27 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyGreenRock) r.setRockType(4); 
/* 28 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyBlueRock) r.setRockType(5); 
/* 29 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyPurpleRock) r.setRockType(6); 
/* 30 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MySpikeyRock) r.setRockType(7); 
/* 31 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyTNTRock) r.setRockType(8); 
/* 32 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyCrystalRedRock) r.setRockType(9); 
/* 33 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyCrystalGreenRock) r.setRockType(10); 
/* 34 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyCrystalBlueRock) r.setRockType(11); 
/* 35 */     if (par2ItemStack.func_77973_b() == OreSpawnMain.MyCrystalTNTRock) r.setRockType(12); 
/* 36 */     world.func_72838_d((Entity)iprojectile);
/* 37 */     par2ItemStack.func_77979_a(1);
/* 38 */     return par2ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected IProjectile func_82499_a(World par1World, IPosition par2IPosition) {
/* 45 */     EntityThrownRock entityarrow = new EntityThrownRock(par1World, par2IPosition.func_82615_a(), par2IPosition.func_82617_b(), par2IPosition.func_82616_c());
/* 46 */     return (IProjectile)entityarrow;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyDispenserBehaviorRock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */