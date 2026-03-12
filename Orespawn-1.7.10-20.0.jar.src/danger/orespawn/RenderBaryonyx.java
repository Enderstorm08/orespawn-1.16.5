/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.client.renderer.entity.RenderLiving;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ public class RenderBaryonyx
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelBaryonyx model;
/* 15 */   private float scale = 1.0F;
/* 16 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "Baryonyx.png");
/*    */   
/*    */   public RenderBaryonyx(ModelBaryonyx par1ModelBase, float par2, float par3) {
/* 19 */     super(par1ModelBase, par2 * par3);
/* 20 */     this.model = (ModelBaryonyx)this.field_77045_g;
/* 21 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderBaryonyx(Baryonyx par1EntityBaryonyx, double par2, double par4, double par6, float par8, float par9) {
/* 27 */     super.func_76986_a((EntityLiving)par1EntityBaryonyx, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 32 */     renderBaryonyx((Baryonyx)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 43 */     renderBaryonyx((Baryonyx)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(Baryonyx par1Entity, float par2) {
/* 51 */     if (par1Entity != null && 
/* 52 */       par1Entity.func_70631_g_()) {
/* 53 */       GL11.glScalef(this.scale / 2.0F, this.scale / 2.0F, this.scale / 2.0F);
/*    */       
/*    */       return;
/*    */     } 
/* 57 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_77041_b(EntityLivingBase par1EntityLiving, float par2) {
/* 66 */     preRenderScale((Baryonyx)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation func_110775_a(Entity entity) {
/* 72 */     return texture;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderBaryonyx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */