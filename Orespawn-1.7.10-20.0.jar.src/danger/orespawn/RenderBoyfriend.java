/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBiped;
/*    */ import net.minecraft.client.renderer.entity.RenderBiped;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RenderBoyfriend
/*    */   extends RenderBiped
/*    */ {
/*    */   protected ModelBiped model;
/*    */   
/*    */   public RenderBoyfriend(ModelBiped par1ModelBase, float par2) {
/* 19 */     super(par1ModelBase, par2);
/* 20 */     this.model = (ModelBiped)this.field_77045_g;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderBoyfriend(Boyfriend par1EntityBoyfriend, double par2, double par4, double par6, float par8, float par9) {
/* 26 */     super.func_76986_a((EntityLiving)par1EntityBoyfriend, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 31 */     renderBoyfriend((Boyfriend)par1EntityLiving, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_76986_a(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 42 */     renderBoyfriend((Boyfriend)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation func_110775_a(Entity entity) {
/* 48 */     Boyfriend g = (Boyfriend)entity;
/* 49 */     return g.getTexture();
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderBoyfriend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */