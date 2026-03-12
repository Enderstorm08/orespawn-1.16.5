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
/*    */ public class RenderLizard
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelLizard model;
/* 15 */   private float scale = 1.0F;
/* 16 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "Lizard.png");
/* 17 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "Lizard2.png");
/* 18 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "Lizard3.png");
/*    */   
/*    */   public RenderLizard(ModelLizard par1ModelBase, float par2, float par3) {
/* 21 */     super(par1ModelBase, par2 * par3);
/* 22 */     this.model = (ModelLizard)this.field_77045_g;
/* 23 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderLizard(Lizard par1EntityLizard, double par2, double par4, double par6, float par8, float par9) {
/* 29 */     super.func_76986_a((EntityLiving)par1EntityLizard, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 34 */     renderLizard((Lizard)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 45 */     renderLizard((Lizard)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(Lizard par1Entity, float par2) {
/* 53 */     if (par1Entity != null && 
/* 54 */       par1Entity.func_70631_g_()) {
/* 55 */       GL11.glScalef(this.scale / 2.0F, this.scale / 2.0F, this.scale / 2.0F);
/*    */       
/*    */       return;
/*    */     } 
/* 59 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_77041_b(EntityLivingBase par1EntityLiving, float par2) {
/* 68 */     preRenderScale((Lizard)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ResourceLocation func_110775_a(Entity entity) {
/* 73 */     if (entity instanceof EntityCannonFodder) {
/* 74 */       EntityCannonFodder c = (EntityCannonFodder)entity;
/* 75 */       if (c.get_is_activated() != 0) {
/* 76 */         if (c.getHatColor() == 2) return texture2; 
/* 77 */         if (c.getHatColor() == 3) return texture3; 
/*    */       } 
/*    */     } 
/* 80 */     return texture;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderLizard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */