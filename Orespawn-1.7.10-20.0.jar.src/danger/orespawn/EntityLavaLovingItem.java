/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.DamageSource;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntityLavaLovingItem
/*    */   extends EntityItem
/*    */ {
/*    */   public EntityLavaLovingItem(World par1World, double par2, double par4, double par6, ItemStack par8ItemStack) {
/* 15 */     super(par1World, par2, par4, par6, par8ItemStack);
/* 16 */     this.field_70174_ab = 300;
/* 17 */     this.field_70178_ae = true;
/* 18 */     this.field_70172_ad = 300;
/*    */   }
/*    */ 
/*    */   
/*    */   public void noFire() {
/* 23 */     this.field_70174_ab = 300;
/* 24 */     this.field_70178_ae = true;
/* 25 */     this.field_70172_ad = 300;
/*    */   }
/*    */ 
/*    */   
/*    */   public void yesFire() {
/* 30 */     this.field_70174_ab = 0;
/* 31 */     this.field_70178_ae = false;
/* 32 */     this.field_70172_ad = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void dealFireDamage(float par1) {
/* 37 */     if (!this.field_70178_ae)
/*    */     {
/* 39 */       func_70097_a(DamageSource.field_76372_a, par1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityLavaLovingItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */