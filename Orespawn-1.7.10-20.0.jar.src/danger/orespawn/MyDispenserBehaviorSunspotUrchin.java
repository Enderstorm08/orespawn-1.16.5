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
/*    */ final class MyDispenserBehaviorSunspotUrchin
/*    */   extends BehaviorProjectileDispense
/*    */ {
/*    */   protected IProjectile func_82499_a(World par1World, IPosition par2IPosition) {
/* 16 */     SunspotUrchin entityarrow = new SunspotUrchin(par1World, par2IPosition.func_82615_a(), par2IPosition.func_82617_b(), par2IPosition.func_82616_c());
/* 17 */     return (IProjectile)entityarrow;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyDispenserBehaviorSunspotUrchin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */