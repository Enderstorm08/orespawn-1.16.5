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
/*    */ public class RenderCage
/*    */   extends RenderSpinner
/*    */ {
/*    */   public void func_76986_a(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 16 */     this.spinItemIconIndex = 160;
/* 17 */     if (par1Entity instanceof EntityCage) {
/* 18 */       EntityCage var2 = (EntityCage)par1Entity;
/* 19 */       this.spinItemIconIndex = var2.getCageIndex();
/*    */     } 
/*    */     
/* 22 */     super.func_76986_a(par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderCage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */