/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RenderShoe
/*    */   extends RenderSpinner
/*    */ {
/*    */   public void func_76986_a(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 16 */     if (par1Entity instanceof Shoes) {
/* 17 */       Shoes var2 = (Shoes)par1Entity;
/* 18 */       this.spinItemIconIndex = var2.getShoeId();
/*    */     } 
/* 20 */     super.func_76986_a(par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderShoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */