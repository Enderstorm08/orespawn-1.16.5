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
/*    */ public class RenderThePrincess
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelThePrincess model;
/* 15 */   private float scale = 1.0F;
/* 16 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "ThePrincesstexture.png");
/* 17 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "ThePrincesstexture2.png");
/*    */   
/*    */   public RenderThePrincess(ModelThePrincess par1ModelBase, float par2, float par3) {
/* 20 */     super(par1ModelBase, par2 * par3);
/* 21 */     this.model = (ModelThePrincess)this.field_77045_g;
/* 22 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderThePrincess(ThePrincess par1EntityThePrincess, double par2, double par4, double par6, float par8, float par9) {
/* 28 */     super.func_76986_a((EntityLiving)par1EntityThePrincess, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 33 */     renderThePrincess((ThePrincess)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 44 */     renderThePrincess((ThePrincess)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(ThePrincess par1Entity, float par2) {
/* 52 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_77041_b(EntityLivingBase par1EntityLiving, float par2) {
/* 61 */     preRenderScale((ThePrincess)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation func_110775_a(Entity entity) {
/* 67 */     ThePrincess t = (ThePrincess)entity;
/* 68 */     if (t.getAttacking() != 0) return texture2; 
/* 69 */     return texture;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderThePrincess.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */