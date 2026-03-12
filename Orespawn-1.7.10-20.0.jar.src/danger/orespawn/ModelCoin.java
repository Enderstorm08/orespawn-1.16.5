/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.MathHelper;
/*    */ 
/*    */ public class ModelCoin
/*    */   extends ModelBase
/*    */ {
/* 11 */   private float wingspeed = 1.0F;
/*    */ 
/*    */   
/*    */   ModelRenderer Shape1;
/*    */ 
/*    */   
/*    */   public ModelCoin(float f1) {
/* 18 */     this.wingspeed = f1;
/*    */     
/* 20 */     this.field_78090_t = 512;
/* 21 */     this.field_78089_u = 512;
/*    */     
/* 23 */     this.Shape1 = new ModelRenderer(this, 0, 0);
/* 24 */     this.Shape1.func_78789_a(-128.0F, -128.0F, 0.0F, 256, 256, 1);
/* 25 */     this.Shape1.func_78793_a(0.0F, -109.0F, 0.0F);
/* 26 */     this.Shape1.func_78787_b(512, 512);
/* 27 */     this.Shape1.field_78809_i = true;
/* 28 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 35 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 36 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 37 */     float newangle = 0.0F;
/*    */     
/* 39 */     newangle = MathHelper.func_76134_b(f2 * 0.05F * this.wingspeed) * 3.1415927F;
/*    */     
/* 41 */     this.Shape1.field_78796_g = newangle;
/*    */ 
/*    */     
/* 44 */     this.Shape1.func_78785_a(f5);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 51 */     model.field_78795_f = x;
/* 52 */     model.field_78796_g = y;
/* 53 */     model.field_78808_h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 58 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCoin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */