/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelFlounder
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer body;
/*     */   ModelRenderer head;
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer rfin;
/*     */   ModelRenderer lfin;
/*     */   
/*     */   public ModelFlounder() {
/*  23 */     this.field_78090_t = 64;
/*  24 */     this.field_78089_u = 32;
/*     */     
/*  26 */     this.body = new ModelRenderer(this, 0, 16);
/*  27 */     this.body.func_78789_a(-4.0F, 0.0F, -5.0F, 8, 1, 12);
/*  28 */     this.body.func_78793_a(0.0F, 22.0F, 0.0F);
/*  29 */     this.body.func_78787_b(64, 32);
/*  30 */     this.body.field_78809_i = true;
/*  31 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  32 */     this.head = new ModelRenderer(this, 0, 5);
/*  33 */     this.head.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 1, 2);
/*  34 */     this.head.func_78793_a(0.0F, 22.0F, -7.0F);
/*  35 */     this.head.func_78787_b(64, 32);
/*  36 */     this.head.field_78809_i = true;
/*  37 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  38 */     this.tail1 = new ModelRenderer(this, 30, 0);
/*  39 */     this.tail1.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 1, 2);
/*  40 */     this.tail1.func_78793_a(0.0F, 22.0F, 7.0F);
/*  41 */     this.tail1.func_78787_b(64, 32);
/*  42 */     this.tail1.field_78809_i = true;
/*  43 */     setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
/*  44 */     this.tail2 = new ModelRenderer(this, 30, 4);
/*  45 */     this.tail2.func_78789_a(-3.0F, 0.0F, 2.0F, 6, 1, 3);
/*  46 */     this.tail2.func_78793_a(0.0F, 22.0F, 7.0F);
/*  47 */     this.tail2.func_78787_b(64, 32);
/*  48 */     this.tail2.field_78809_i = true;
/*  49 */     setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
/*  50 */     this.rfin = new ModelRenderer(this, 12, 0);
/*  51 */     this.rfin.func_78789_a(-3.0F, 0.0F, 0.0F, 3, 1, 2);
/*  52 */     this.rfin.func_78793_a(-4.0F, 22.0F, -2.0F);
/*  53 */     this.rfin.func_78787_b(64, 32);
/*  54 */     this.rfin.field_78809_i = true;
/*  55 */     setRotation(this.rfin, 0.0F, 0.0F, 0.0F);
/*  56 */     this.lfin = new ModelRenderer(this, 0, 0);
/*  57 */     this.lfin.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 2);
/*  58 */     this.lfin.func_78793_a(4.0F, 22.0F, -2.0F);
/*  59 */     this.lfin.func_78787_b(64, 32);
/*  60 */     this.lfin.field_78809_i = true;
/*  61 */     setRotation(this.lfin, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*     */     float newangle, newangle2;
/*  67 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  68 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/*  70 */     if (f1 > 0.1D) {
/*  71 */       newangle = MathHelper.func_76134_b(f2 * 1.3F) * 3.1415927F * 0.25F * f1;
/*  72 */       newangle2 = MathHelper.func_76134_b(f2 * 1.7F) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/*  74 */       newangle = 0.0F;
/*  75 */       newangle2 = 0.0F;
/*     */     } 
/*  77 */     this.lfin.field_78808_h = newangle;
/*  78 */     this.rfin.field_78808_h = newangle2;
/*     */     
/*  80 */     if (f1 > 0.1D) {
/*  81 */       newangle = MathHelper.func_76134_b(f2 * 1.2F) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/*  83 */       newangle = MathHelper.func_76134_b(f2 * 0.7F) * 3.1415927F * 0.05F;
/*     */     } 
/*  85 */     this.tail2.field_78795_f = newangle;
/*     */     
/*  87 */     this.body.func_78785_a(f5);
/*  88 */     this.head.func_78785_a(f5);
/*  89 */     this.tail1.func_78785_a(f5);
/*  90 */     this.tail2.func_78785_a(f5);
/*  91 */     this.rfin.func_78785_a(f5);
/*  92 */     this.lfin.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/*  97 */     model.field_78795_f = x;
/*  98 */     model.field_78796_g = y;
/*  99 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 104 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelFlounder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */