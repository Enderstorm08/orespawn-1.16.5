/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.MathHelper;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModelGhost
/*    */   extends ModelBase
/*    */ {
/*    */   ModelRenderer HeadAndBody;
/*    */   ModelRenderer LArm;
/*    */   ModelRenderer RArm;
/*    */   
/*    */   public ModelGhost() {
/* 19 */     this.field_78090_t = 64;
/* 20 */     this.field_78089_u = 64;
/*    */     
/* 22 */     this.HeadAndBody = new ModelRenderer(this, 0, 0);
/* 23 */     this.HeadAndBody.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 21, 6);
/* 24 */     this.HeadAndBody.func_78793_a(0.0F, 0.0F, 0.0F);
/* 25 */     this.HeadAndBody.func_78787_b(64, 64);
/* 26 */     this.HeadAndBody.field_78809_i = true;
/* 27 */     setRotation(this.HeadAndBody, 0.0F, 0.0F, 0.0F);
/* 28 */     this.LArm = new ModelRenderer(this, 34, 0);
/* 29 */     this.LArm.func_78789_a(-1.0F, -1.0F, -1.0F, 2, 11, 2);
/* 30 */     this.LArm.func_78793_a(3.0F, 6.0F, 0.0F);
/* 31 */     this.LArm.func_78787_b(64, 64);
/* 32 */     this.LArm.field_78809_i = true;
/* 33 */     setRotation(this.LArm, 0.0F, 0.0F, -0.3316126F);
/* 34 */     this.RArm = new ModelRenderer(this, 25, 0);
/* 35 */     this.RArm.func_78789_a(-1.0F, -1.0F, -1.0F, 2, 11, 2);
/* 36 */     this.RArm.func_78793_a(-3.0F, 6.0F, 0.0F);
/* 37 */     this.RArm.func_78787_b(64, 64);
/* 38 */     this.RArm.field_78809_i = true;
/* 39 */     setRotation(this.RArm, 0.0F, 0.0F, 0.3316126F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 44 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 45 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*    */     
/* 47 */     this.LArm.field_78808_h = -0.33F + MathHelper.func_76134_b(f2 * 0.3F) * 3.1415927F * 0.05F;
/* 48 */     this.RArm.field_78808_h = 0.33F + MathHelper.func_76134_b(f2 * 0.32F) * 3.1415927F * 0.05F;
/* 49 */     this.LArm.field_78795_f = -0.33F + MathHelper.func_76134_b(f2 * 0.34F) * 3.1415927F * 0.05F;
/* 50 */     this.RArm.field_78795_f = 0.33F + MathHelper.func_76134_b(f2 * 0.36F) * 3.1415927F * 0.05F;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     GL11.glPushMatrix();
/* 56 */     GL11.glEnable(2977);
/* 57 */     GL11.glEnable(3042);
/* 58 */     GL11.glBlendFunc(770, 771);
/* 59 */     GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.25F);
/*    */     
/* 61 */     this.HeadAndBody.func_78785_a(f5);
/* 62 */     this.LArm.func_78785_a(f5);
/* 63 */     this.RArm.func_78785_a(f5);
/*    */     
/* 65 */     GL11.glDisable(3042);
/* 66 */     GL11.glPopMatrix();
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 71 */     model.field_78795_f = x;
/* 72 */     model.field_78796_g = y;
/* 73 */     model.field_78808_h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 78 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelGhost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */