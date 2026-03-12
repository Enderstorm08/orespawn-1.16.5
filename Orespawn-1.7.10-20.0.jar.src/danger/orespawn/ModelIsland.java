/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.MathHelper;
/*    */ 
/*    */ public class ModelIsland
/*    */   extends ModelBase
/*    */ {
/* 11 */   private float wingspeed = 1.0F;
/*    */   
/*    */   ModelRenderer Shape1;
/*    */   
/*    */   ModelRenderer Shape2;
/*    */   
/*    */   ModelRenderer Shape3;
/*    */   
/*    */   public ModelIsland(float f) {
/* 20 */     this.field_78090_t = 64;
/* 21 */     this.field_78089_u = 32;
/*    */     
/* 23 */     this.Shape1 = new ModelRenderer(this, 0, 0);
/* 24 */     this.Shape1.func_78789_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 25 */     this.Shape1.func_78793_a(0.0F, 16.0F, 0.0F);
/* 26 */     this.Shape1.func_78787_b(64, 32);
/* 27 */     this.Shape1.field_78809_i = true;
/* 28 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/* 29 */     this.Shape2 = new ModelRenderer(this, 32, 0);
/* 30 */     this.Shape2.func_78789_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 31 */     this.Shape2.func_78793_a(0.0F, 16.0F, 0.0F);
/* 32 */     this.Shape2.func_78787_b(64, 32);
/* 33 */     this.Shape2.field_78809_i = true;
/* 34 */     setRotation(this.Shape2, 0.7853982F, 0.7853982F, 0.7853982F);
/* 35 */     this.Shape3 = new ModelRenderer(this, 32, 16);
/* 36 */     this.Shape3.func_78789_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 37 */     this.Shape3.func_78793_a(0.0F, 16.0F, 0.0F);
/* 38 */     this.Shape3.func_78787_b(64, 32);
/* 39 */     this.Shape3.field_78809_i = true;
/* 40 */     setRotation(this.Shape3, 0.7853982F, 0.7853982F, 0.7853982F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 47 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 48 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 49 */     float newangle = 0.0F;
/*    */     
/* 51 */     newangle = MathHelper.func_76134_b(f2 * 0.05F * this.wingspeed) * 3.1415927F;
/* 52 */     this.Shape1.field_78795_f = newangle;
/* 53 */     newangle = MathHelper.func_76134_b(f2 * 0.051F * this.wingspeed) * 3.1415927F;
/* 54 */     this.Shape1.field_78796_g = newangle;
/* 55 */     newangle = MathHelper.func_76134_b(f2 * 0.052F * this.wingspeed) * 3.1415927F;
/* 56 */     this.Shape1.field_78808_h = newangle;
/*    */     
/* 58 */     newangle = MathHelper.func_76134_b(f2 * 0.053F * this.wingspeed) * 3.1415927F;
/* 59 */     this.Shape2.field_78795_f = newangle;
/* 60 */     newangle = MathHelper.func_76134_b(f2 * 0.054F * this.wingspeed) * 3.1415927F;
/* 61 */     this.Shape2.field_78796_g = newangle;
/* 62 */     newangle = MathHelper.func_76134_b(f2 * 0.055F * this.wingspeed) * 3.1415927F;
/* 63 */     this.Shape2.field_78808_h = newangle;
/*    */     
/* 65 */     newangle = MathHelper.func_76134_b(f2 * 0.056F * this.wingspeed) * 3.1415927F;
/* 66 */     this.Shape3.field_78795_f = newangle;
/* 67 */     newangle = MathHelper.func_76134_b(f2 * 0.057F * this.wingspeed) * 3.1415927F;
/* 68 */     this.Shape3.field_78796_g = newangle;
/* 69 */     newangle = MathHelper.func_76134_b(f2 * 0.058F * this.wingspeed) * 3.1415927F;
/* 70 */     this.Shape3.field_78808_h = newangle;
/*    */ 
/*    */     
/* 73 */     this.Shape1.func_78785_a(f5);
/* 74 */     this.Shape2.func_78785_a(f5);
/* 75 */     this.Shape3.func_78785_a(f5);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 82 */     model.field_78795_f = x;
/* 83 */     model.field_78796_g = y;
/* 84 */     model.field_78808_h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 89 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelIsland.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */