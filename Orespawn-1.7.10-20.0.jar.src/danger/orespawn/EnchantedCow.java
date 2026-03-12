/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityAgeable;
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.init.Items;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ public class EnchantedCow
/*    */   extends RedCow
/*    */ {
/*    */   public EnchantedCow(World world) {
/* 15 */     super(world);
/*    */   }
/*    */ 
/*    */   
/*    */   private void dropEnchantedGoldenApple() {
/* 20 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t, this.field_70163_u + 1.0D, this.field_70161_v, new ItemStack(Items.field_151153_ao, 1, 1));
/* 21 */     this.field_70170_p.func_72838_d((Entity)var3);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_70628_a(boolean par1, int par2) {
/* 29 */     int var3 = this.field_70146_Z.nextInt(4) + this.field_70146_Z.nextInt(1 + par2);
/*    */ 
/*    */     
/* 32 */     for (int var4 = 0; var4 < var3; var4++)
/*    */     {
/* 34 */       func_145779_a(Items.field_151034_e, 1);
/*    */     }
/*    */     
/* 37 */     func_145779_a(Items.field_151153_ao, 2);
/*    */     
/* 39 */     dropEnchantedGoldenApple();
/*    */     
/* 41 */     super.func_70628_a(par1, par2);
/*    */   }
/*    */ 
/*    */   
/*    */   public EnchantedCow spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 46 */     return new EnchantedCow(this.field_70170_p);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EnchantedCow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */