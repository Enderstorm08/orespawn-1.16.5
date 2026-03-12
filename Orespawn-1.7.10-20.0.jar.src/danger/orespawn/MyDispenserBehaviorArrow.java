/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.dispenser.BehaviorProjectileDispense;
/*    */ import net.minecraft.dispenser.IPosition;
/*    */ import net.minecraft.entity.IProjectile;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class MyDispenserBehaviorArrow
/*    */   extends BehaviorProjectileDispense
/*    */ {
/*    */   protected IProjectile func_82499_a(World par1World, IPosition par2IPosition) {
/* 16 */     IrukandjiArrow entityarrow = new IrukandjiArrow(par1World, par2IPosition.func_82615_a(), par2IPosition.func_82617_b(), par2IPosition.func_82616_c());
/* 17 */     entityarrow.field_70251_a = 1;
/* 18 */     return (IProjectile)entityarrow;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyDispenserBehaviorArrow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */