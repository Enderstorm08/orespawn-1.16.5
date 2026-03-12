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
/*    */ public class RenderTheQueen
/*    */   extends RenderLiving
/*    */ {
/*    */   protected ModelTheQueen model;
/* 15 */   private float scale = 1.0F;
/* 16 */   private static final ResourceLocation texture = new ResourceLocation("orespawn", "TheQueentexture.png");
/* 17 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "TheQueentexture2.png");
/*    */   
/*    */   public RenderTheQueen(ModelTheQueen par1ModelBase, float par2, float par3) {
/* 20 */     super(par1ModelBase, par2 * par3);
/* 21 */     this.model = (ModelTheQueen)this.field_77045_g;
/* 22 */     this.scale = par3;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderTheQueen(TheQueen par1EntityTheQueen, double par2, double par4, double par6, float par8, float par9) {
/* 28 */     super.func_76986_a((EntityLiving)par1EntityTheQueen, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 33 */     renderTheQueen((TheQueen)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 44 */     renderTheQueen((TheQueen)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(TheQueen par1Entity, float par2) {
/* 52 */     if (par1Entity != null && par1Entity.getPlayNicely() != 0) {
/* 53 */       GL11.glScalef(this.scale / 4.0F, this.scale / 4.0F, this.scale / 4.0F);
/*    */       return;
/*    */     } 
/* 56 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_77041_b(EntityLivingBase par1EntityLiving, float par2) {
/* 65 */     preRenderScale((TheQueen)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation func_110775_a(Entity entity) {
/* 71 */     TheQueen q = (TheQueen)entity;
/* 72 */     if (q.isHappy()) return texture2; 
/* 73 */     return texture;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RenderTheQueen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */