/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.MathHelper;
/*    */ 
/*    */ 
/*    */ public class ModelMosquito
/*    */   extends ModelBase
/*    */ {
/*    */   ModelRenderer body;
/*    */   ModelRenderer leftwing1;
/*    */   ModelRenderer rightwing1;
/*    */   ModelRenderer leftwing2;
/*    */   ModelRenderer rightwing2;
/*    */   
/*    */   public ModelMosquito() {
/* 19 */     this.field_78090_t = 32;
/* 20 */     this.field_78089_u = 32;
/*    */     
/* 22 */     this.body = new ModelRenderer(this, 8, 18);
/* 23 */     this.body.func_78789_a(0.0F, 0.0F, -2.0F, 1, 1, 8);
/* 24 */     this.body.func_78793_a(0.0F, 17.0F, 0.0F);
/* 25 */     this.body.func_78787_b(64, 32);
/* 26 */     this.body.field_78809_i = true;
/* 27 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/* 28 */     this.leftwing1 = new ModelRenderer(this, 16, 13);
/* 29 */     this.leftwing1.func_78789_a(1.0F, 0.0F, -1.0F, 3, 1, 3);
/* 30 */     this.leftwing1.func_78793_a(1.0F, 17.0F, 0.0F);
/* 31 */     this.leftwing1.func_78787_b(64, 32);
/* 32 */     this.leftwing1.field_78809_i = true;
/* 33 */     setRotation(this.leftwing1, 0.0F, 0.0F, 0.0F);
/* 34 */     this.rightwing1 = new ModelRenderer(this, 2, 13);
/* 35 */     this.rightwing1.func_78789_a(-4.0F, 0.0F, -1.0F, 3, 1, 3);
/* 36 */     this.rightwing1.func_78793_a(0.0F, 17.0F, 0.0F);
/* 37 */     this.rightwing1.func_78787_b(64, 32);
/* 38 */     this.rightwing1.field_78809_i = true;
/* 39 */     setRotation(this.rightwing1, 0.0F, 0.0F, 0.0F);
/* 40 */     this.leftwing2 = new ModelRenderer(this, 15, 8);
/* 41 */     this.leftwing2.func_78789_a(0.0F, 0.0F, 0.0F, 5, 1, 1);
/* 42 */     this.leftwing2.func_78793_a(1.0F, 17.0F, 0.0F);
/* 43 */     this.leftwing2.func_78787_b(64, 32);
/* 44 */     this.leftwing2.field_78809_i = true;
/* 45 */     setRotation(this.leftwing2, 0.0F, 0.0F, 0.0F);
/* 46 */     this.rightwing2 = new ModelRenderer(this, 2, 8);
/* 47 */     this.rightwing2.func_78789_a(-5.0F, 0.0F, 0.0F, 5, 1, 1);
/* 48 */     this.rightwing2.func_78793_a(0.0F, 17.0F, 0.0F);
/* 49 */     this.rightwing2.func_78787_b(64, 32);
/* 50 */     this.rightwing2.field_78809_i = true;
/* 51 */     setRotation(this.rightwing2, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 57 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 58 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*    */     
/* 60 */     this.body.func_78785_a(f5);
/*    */     
/* 62 */     this.rightwing1.field_78808_h = MathHelper.func_76134_b(f2 * 3.0F) * 3.1415927F * 0.25F;
/* 63 */     this.rightwing2.field_78808_h = this.rightwing1.field_78808_h;
/*    */     
/* 65 */     this.leftwing1.field_78808_h = -this.rightwing1.field_78808_h;
/* 66 */     this.leftwing2.field_78808_h = -this.rightwing1.field_78808_h;
/*    */     
/* 68 */     this.leftwing1.func_78785_a(f5);
/* 69 */     this.rightwing1.func_78785_a(f5);
/* 70 */     this.leftwing2.func_78785_a(f5);
/* 71 */     this.rightwing2.func_78785_a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 76 */     model.field_78795_f = x;
/* 77 */     model.field_78796_g = y;
/* 78 */     model.field_78808_h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 83 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelMosquito.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */