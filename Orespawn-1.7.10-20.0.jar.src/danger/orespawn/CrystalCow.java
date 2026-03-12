/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.EntityAgeable;
/*    */ import net.minecraft.init.Items;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CrystalCow
/*    */   extends RedCow
/*    */ {
/*    */   public CrystalCow(World world) {
/* 13 */     super(world);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_70628_a(boolean par1, int par2) {
/* 21 */     int var3 = this.field_70146_Z.nextInt(3) + this.field_70146_Z.nextInt(1 + par2);
/*    */ 
/*    */     
/* 24 */     for (int var4 = 0; var4 < var3; var4++)
/*    */     {
/* 26 */       func_145779_a(OreSpawnMain.MyCrystalApple, 1);
/*    */     }
/*    */     
/* 29 */     func_145779_a(Items.field_151034_e, 1);
/*    */     
/* 31 */     super.func_70628_a(par1, par2);
/*    */   }
/*    */ 
/*    */   
/*    */   public CrystalCow spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 36 */     return new CrystalCow(this.field_70170_p);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CrystalCow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */