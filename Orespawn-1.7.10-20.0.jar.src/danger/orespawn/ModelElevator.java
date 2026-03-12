/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ 
/*    */ 
/*    */ public class ModelElevator
/*    */   extends ModelBase
/*    */ {
/* 11 */   private float wingspeed = 1.0F;
/*    */   
/*    */   ModelRenderer Shape1;
/*    */   
/*    */   ModelRenderer Shape2;
/*    */   
/*    */   ModelRenderer Shape3;
/*    */   ModelRenderer Shape4;
/*    */   ModelRenderer Shape5;
/*    */   
/*    */   public ModelElevator() {
/* 22 */     this.field_78090_t = 64;
/* 23 */     this.field_78089_u = 64;
/*    */     
/* 25 */     this.Shape2 = new ModelRenderer(this, 0, 18);
/*    */     
/* 27 */     this.Shape2.func_78789_a(-3.0F, 0.0F, -9.0F, 6, 1, 1);
/* 28 */     this.Shape2.func_78793_a(0.0F, 0.0F, 0.0F);
/* 29 */     this.Shape2.func_78787_b(64, 64);
/* 30 */     this.Shape2.field_78809_i = true;
/* 31 */     setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/* 32 */     this.Shape3 = new ModelRenderer(this, 0, 21);
/* 33 */     this.Shape3.func_78789_a(-1.0F, 0.0F, -10.0F, 2, 1, 1);
/* 34 */     this.Shape3.func_78793_a(0.0F, 0.0F, 0.0F);
/* 35 */     this.Shape3.func_78787_b(64, 64);
/* 36 */     this.Shape3.field_78809_i = true;
/* 37 */     setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
/* 38 */     this.Shape4 = new ModelRenderer(this, 17, 18);
/* 39 */     this.Shape4.func_78789_a(-3.0F, 0.0F, 8.0F, 6, 1, 1);
/* 40 */     this.Shape4.func_78793_a(0.0F, 0.0F, 0.0F);
/* 41 */     this.Shape4.func_78787_b(64, 64);
/* 42 */     this.Shape4.field_78809_i = true;
/* 43 */     setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
/* 44 */     this.Shape5 = new ModelRenderer(this, 17, 21);
/* 45 */     this.Shape5.func_78789_a(-1.0F, 0.0F, 9.0F, 2, 1, 1);
/* 46 */     this.Shape5.func_78793_a(0.0F, 0.0F, 0.0F);
/* 47 */     this.Shape5.func_78787_b(64, 64);
/* 48 */     this.Shape5.field_78809_i = true;
/* 49 */     setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
/* 50 */     this.Shape1 = new ModelRenderer(this, 0, 0);
/* 51 */     this.Shape1.func_78789_a(-4.0F, 0.0F, -8.0F, 8, 1, 16);
/* 52 */     this.Shape1.func_78793_a(0.0F, 0.0F, 0.0F);
/* 53 */     this.Shape1.func_78787_b(64, 64);
/* 54 */     this.Shape1.field_78809_i = true;
/* 55 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 62 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 63 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*    */     
/* 65 */     this.Shape1.func_78785_a(f5);
/* 66 */     this.Shape2.func_78785_a(f5);
/* 67 */     this.Shape3.func_78785_a(f5);
/* 68 */     this.Shape4.func_78785_a(f5);
/* 69 */     this.Shape5.func_78785_a(f5);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 75 */     model.field_78795_f = x;
/* 76 */     model.field_78796_g = y;
/* 77 */     model.field_78808_h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 82 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelElevator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */