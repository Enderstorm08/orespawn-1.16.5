/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.client.renderer.OpenGlHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelPurplePower
/*     */   extends ModelBase
/*     */ {
/*  14 */   float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Shape1;
/*     */   ModelRenderer Shape2;
/*     */   ModelRenderer Shape3;
/*     */   
/*     */   public ModelPurplePower(float f1) {
/*  21 */     this.wingspeed = f1;
/*     */     
/*  23 */     this.field_78090_t = 64;
/*  24 */     this.field_78089_u = 32;
/*     */     
/*  26 */     this.Shape1 = new ModelRenderer(this, 0, 12);
/*  27 */     this.Shape1.func_78789_a(-2.0F, -0.5F, -0.5F, 4, 1, 1);
/*  28 */     this.Shape1.func_78793_a(0.0F, 0.0F, 0.0F);
/*  29 */     this.Shape1.func_78787_b(64, 32);
/*  30 */     this.Shape1.field_78809_i = true;
/*  31 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/*  32 */     this.Shape2 = new ModelRenderer(this, 0, 7);
/*  33 */     this.Shape2.func_78789_a(-4.0F, -0.5F, -0.5F, 8, 1, 1);
/*  34 */     this.Shape2.func_78793_a(0.0F, 0.0F, 0.0F);
/*  35 */     this.Shape2.func_78787_b(64, 32);
/*  36 */     this.Shape2.field_78809_i = true;
/*  37 */     setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/*  38 */     this.Shape3 = new ModelRenderer(this, 0, 0);
/*  39 */     this.Shape3.func_78789_a(-7.0F, -0.5F, -0.5F, 14, 1, 1);
/*  40 */     this.Shape3.func_78793_a(0.0F, 0.0F, 0.0F);
/*  41 */     this.Shape3.func_78787_b(64, 32);
/*  42 */     this.Shape3.field_78809_i = true;
/*  43 */     setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  48 */     PurplePower p = (PurplePower)entity;
/*  49 */     float rf1 = 1.0F;
/*  50 */     float newangle = 0.0F;
/*     */ 
/*     */     
/*  53 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  54 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/*  56 */     GL11.glPushMatrix();
/*  57 */     GL11.glEnable(2977);
/*  58 */     GL11.glEnable(3042);
/*  59 */     GL11.glBlendFunc(770, 771);
/*  60 */     GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.55F);
/*  61 */     OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, 240.0F, 240.0F);
/*     */     
/*  63 */     rf1 = p.field_70170_p.field_73012_v.nextFloat() * 360.0F;
/*  64 */     GL11.glRotatef(rf1, 1.0F, 0.0F, 0.0F); int i;
/*  65 */     for (i = 0; i < 6; i++) {
/*  66 */       this.Shape1.field_78808_h = newangle;
/*  67 */       this.Shape1.func_78785_a(f5);
/*  68 */       newangle += 1.0471976F;
/*     */     } 
/*  70 */     GL11.glRotatef(rf1, 1.0F, 0.0F, 0.0F);
/*     */     
/*  72 */     newangle = 0.0F;
/*  73 */     rf1 = p.field_70170_p.field_73012_v.nextFloat() * 360.0F;
/*  74 */     GL11.glRotatef(rf1, 0.0F, 1.0F, 0.0F);
/*  75 */     for (i = 0; i < 6; i++) {
/*  76 */       this.Shape2.field_78808_h = newangle;
/*  77 */       this.Shape2.func_78785_a(f5);
/*  78 */       newangle += 1.0471976F;
/*     */     } 
/*  80 */     GL11.glRotatef(rf1, 0.0F, 1.0F, 0.0F);
/*     */     
/*  82 */     newangle = 0.0F;
/*  83 */     rf1 = p.field_70170_p.field_73012_v.nextFloat() * 360.0F;
/*  84 */     GL11.glRotatef(rf1, 0.0F, 0.0F, 1.0F);
/*  85 */     for (i = 0; i < 6; i++) {
/*  86 */       this.Shape3.field_78808_h = newangle;
/*  87 */       this.Shape3.func_78785_a(f5);
/*  88 */       newangle += 1.0471976F;
/*     */     } 
/*  90 */     GL11.glRotatef(rf1, 0.0F, 0.0F, 1.0F);
/*     */     
/*  92 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  93 */     GL11.glDisable(3042);
/*  94 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 101 */     model.field_78795_f = x;
/* 102 */     model.field_78796_g = y;
/* 103 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 108 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelPurplePower.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */