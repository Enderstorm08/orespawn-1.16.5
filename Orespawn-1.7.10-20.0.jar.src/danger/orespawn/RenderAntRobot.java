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
/*    */ 
/*    */ public class RenderAntRobot
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelAntRobot model;
/* 16 */   private float scale = 1.0F;
/* 17 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "AntRobottexture.png");
/*    */   
/*    */   public RenderAntRobot(ModelAntRobot par1ModelBase, float par2, float par3) {
/* 20 */     super(par1ModelBase, par2 * par3);
/* 21 */     this.model = (ModelAntRobot)this.field_77045_g;
/* 22 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderAntRobot(AntRobot par1EntityAntRobot, double par2, double par4, double par6, float par8, float par9) {
/* 33 */     GL11.glPushMatrix();
/* 34 */     GL11.glTranslatef((float)par2, (float)par4, (float)par6);
/* 35 */     GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
/* 36 */     func_110776_a(texture);
/* 37 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/* 38 */     this.model.func_78088_a((Entity)par1EntityAntRobot, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
/* 39 */     GL11.glPopMatrix();
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 44 */     renderAntRobot((AntRobot)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 55 */     renderAntRobot((AntRobot)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(AntRobot par1Entity, float par2) {
/* 63 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_77041_b(EntityLivingBase par1EntityLiving, float par2) {
/* 72 */     preRenderScale((AntRobot)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation func_110775_a(Entity entity) {
/* 78 */     return texture;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderAntRobot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */