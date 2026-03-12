/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.MathHelper;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModelWormSmall
/*    */   extends ModelBase
/*    */ {
/*    */   ModelRenderer head;
/*    */   ModelRenderer body;
/*    */   ModelRenderer tail;
/*    */   
/*    */   public ModelWormSmall() {
/* 20 */     this.field_78090_t = 64;
/* 21 */     this.field_78089_u = 32;
/*    */     
/* 23 */     this.head = new ModelRenderer(this, 0, 0);
/* 24 */     this.head.func_78789_a(-0.5F, -5.0F, -0.5F, 1, 5, 1);
/* 25 */     this.head.func_78793_a(0.0F, 14.0F, 0.0F);
/* 26 */     this.head.func_78787_b(64, 32);
/* 27 */     this.head.field_78809_i = true;
/* 28 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 29 */     this.body = new ModelRenderer(this, 6, 0);
/* 30 */     this.body.func_78789_a(-0.5F, -5.0F, -0.5F, 1, 5, 1);
/* 31 */     this.body.func_78793_a(0.0F, 19.0F, 0.0F);
/* 32 */     this.body.func_78787_b(64, 32);
/* 33 */     this.body.field_78809_i = true;
/* 34 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/* 35 */     this.tail = new ModelRenderer(this, 12, 0);
/* 36 */     this.tail.func_78789_a(-0.5F, -5.0F, -0.5F, 1, 5, 1);
/* 37 */     this.tail.func_78793_a(0.0F, 24.0F, 0.0F);
/* 38 */     this.tail.func_78787_b(64, 32);
/* 39 */     this.tail.field_78809_i = true;
/* 40 */     setRotation(this.tail, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 46 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 47 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*    */     
/* 49 */     float newangle = MathHelper.func_76134_b(f2 * 0.55F) * 3.1415927F * 0.15F;
/* 50 */     this.tail.field_78795_f = newangle;
/* 51 */     float d1 = (float)(Math.sin(newangle) * 5.0D);
/* 52 */     float d2 = (float)(Math.cos(newangle) * 5.0D);
/* 53 */     this.tail.field_78798_e -= d1;
/* 54 */     newangle = MathHelper.func_76134_b(f2 * 0.35F) * 3.1415927F * 0.1F;
/* 55 */     this.tail.field_78808_h = newangle;
/* 56 */     float d3 = (float)(Math.cos(newangle) * d2);
/* 57 */     float d4 = (float)(Math.sin(newangle) * d2);
/* 58 */     this.tail.field_78800_c += d4;
/* 59 */     this.body.field_78797_d = (float)(this.tail.field_78797_d - 5.0D + 5.0D - d3);
/*    */     
/* 61 */     newangle = MathHelper.func_76134_b(f2 * 0.45F) * 3.1415927F * 0.15F;
/* 62 */     this.body.field_78795_f = newangle;
/* 63 */     d1 = (float)(Math.sin(newangle) * 5.0D);
/* 64 */     d2 = (float)(Math.cos(newangle) * 5.0D);
/* 65 */     this.body.field_78798_e -= d1;
/* 66 */     newangle = MathHelper.func_76134_b(f2 * 0.25F) * 3.1415927F * 0.1F;
/* 67 */     this.body.field_78808_h = newangle;
/* 68 */     d3 = (float)(Math.cos(newangle) * d2);
/* 69 */     d4 = (float)(Math.sin(newangle) * d2);
/* 70 */     this.body.field_78800_c += d4;
/* 71 */     this.head.field_78797_d = (float)(this.body.field_78797_d - 5.0D + 5.0D - d3);
/*    */     
/* 73 */     this.head.field_78795_f = 0.62F + MathHelper.func_76134_b(f2 * 0.65F) * 3.1415927F * 0.15F;
/* 74 */     this.head.field_78808_h = MathHelper.func_76134_b(f2 * 0.3F) * 3.1415927F * 0.05F;
/*    */     
/* 76 */     this.head.func_78785_a(f5);
/* 77 */     this.body.func_78785_a(f5);
/* 78 */     this.tail.func_78785_a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 83 */     model.field_78795_f = x;
/* 84 */     model.field_78796_g = y;
/* 85 */     model.field_78808_h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 90 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelWormSmall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */