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
/*    */ public class RenderOstrich
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelOstrich model;
/* 15 */   private float scale = 1.0F;
/* 16 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "Ostrichtexture.png");
/* 17 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "Ostrichtexture2.png");
/* 18 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "Ostrichtexture3.png");
/*    */   
/*    */   public RenderOstrich(ModelOstrich par1ModelBase, float par2, float par3) {
/* 21 */     super(par1ModelBase, par2 * par3);
/* 22 */     this.model = (ModelOstrich)this.field_77045_g;
/* 23 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderOstrich(Ostrich par1EntityOstrich, double par2, double par4, double par6, float par8, float par9) {
/* 29 */     super.func_76986_a((EntityLiving)par1EntityOstrich, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 34 */     renderOstrich((Ostrich)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 45 */     renderOstrich((Ostrich)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(Ostrich par1Entity, float par2) {
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
/* 68 */     preRenderScale((Ostrich)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation func_110775_a(Entity entity) {
/* 74 */     if (entity instanceof EntityCannonFodder) {
/* 75 */       EntityCannonFodder c = (EntityCannonFodder)entity;
/* 76 */       if (c.get_is_activated() != 0) {
/* 77 */         if (c.getHatColor() == 2) return texture2; 
/* 78 */         if (c.getHatColor() == 3) return texture3; 
/*    */       } 
/*    */     } 
/* 81 */     return texture;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderOstrich.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */