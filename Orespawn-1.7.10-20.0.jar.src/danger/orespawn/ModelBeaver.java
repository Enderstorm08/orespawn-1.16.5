/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelBeaver
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer head;
/*     */   
/*     */   ModelRenderer nose;
/*     */   
/*     */   ModelRenderer teeth;
/*     */   ModelRenderer body;
/*     */   ModelRenderer tail;
/*     */   ModelRenderer rff;
/*     */   ModelRenderer lff;
/*     */   ModelRenderer rrf;
/*     */   ModelRenderer lrf;
/*     */   
/*     */   public ModelBeaver(float f1) {
/*  25 */     this.wingspeed = f1;
/*     */     
/*  27 */     this.field_78090_t = 64;
/*  28 */     this.field_78089_u = 32;
/*     */     
/*  30 */     this.head = new ModelRenderer(this, 0, 3);
/*  31 */     this.head.func_78789_a(0.0F, 0.0F, 0.0F, 6, 5, 5);
/*  32 */     this.head.func_78793_a(0.0F, 15.0F, -8.0F);
/*  33 */     this.head.func_78787_b(64, 32);
/*  34 */     this.head.field_78809_i = true;
/*  35 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  36 */     this.nose = new ModelRenderer(this, 6, 0);
/*  37 */     this.nose.func_78789_a(0.0F, 0.0F, 0.0F, 2, 1, 1);
/*  38 */     this.nose.func_78793_a(2.0F, 18.0F, -8.5F);
/*  39 */     this.nose.func_78787_b(64, 32);
/*  40 */     this.nose.field_78809_i = true;
/*  41 */     setRotation(this.nose, 0.0F, 0.0F, 0.0F);
/*  42 */     this.teeth = new ModelRenderer(this, 0, 0);
/*  43 */     this.teeth.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 1);
/*  44 */     this.teeth.func_78793_a(2.0F, 19.0F, -8.2F);
/*  45 */     this.teeth.func_78787_b(64, 32);
/*  46 */     this.teeth.field_78809_i = true;
/*  47 */     setRotation(this.teeth, 0.0F, 0.0F, 0.0F);
/*  48 */     this.body = new ModelRenderer(this, 0, 13);
/*  49 */     this.body.func_78789_a(0.0F, 0.0F, 0.0F, 8, 8, 10);
/*  50 */     this.body.func_78793_a(-1.0F, 14.0F, -3.0F);
/*  51 */     this.body.func_78787_b(64, 32);
/*  52 */     this.body.field_78809_i = true;
/*  53 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  54 */     this.tail = new ModelRenderer(this, 22, 0);
/*  55 */     this.tail.func_78789_a(0.0F, -1.0F, 0.0F, 5, 1, 8);
/*  56 */     this.tail.func_78793_a(0.5F, 21.0F, 7.0F);
/*  57 */     this.tail.func_78787_b(64, 32);
/*  58 */     this.tail.field_78809_i = true;
/*  59 */     setRotation(this.tail, 0.0F, 0.0F, 0.0F);
/*  60 */     this.rff = new ModelRenderer(this, 22, 9);
/*  61 */     this.rff.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  62 */     this.rff.func_78793_a(-0.5F, 22.0F, -2.5F);
/*  63 */     this.rff.func_78787_b(64, 32);
/*  64 */     this.rff.field_78809_i = true;
/*  65 */     setRotation(this.rff, 0.0F, 0.0F, 0.0F);
/*  66 */     this.lff = new ModelRenderer(this, 22, 9);
/*  67 */     this.lff.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  68 */     this.lff.func_78793_a(4.5F, 22.0F, -2.5F);
/*  69 */     this.lff.func_78787_b(64, 32);
/*  70 */     this.lff.field_78809_i = true;
/*  71 */     setRotation(this.lff, 0.0F, 0.0F, 0.0F);
/*  72 */     this.rrf = new ModelRenderer(this, 22, 9);
/*  73 */     this.rrf.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  74 */     this.rrf.func_78793_a(-0.5F, 22.0F, 4.5F);
/*  75 */     this.rrf.func_78787_b(64, 32);
/*  76 */     this.rrf.field_78809_i = true;
/*  77 */     setRotation(this.rrf, 0.0F, 0.0F, 0.0F);
/*  78 */     this.lrf = new ModelRenderer(this, 22, 9);
/*  79 */     this.lrf.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  80 */     this.lrf.func_78793_a(4.5F, 22.0F, 4.5F);
/*  81 */     this.lrf.func_78787_b(64, 32);
/*  82 */     this.lrf.field_78809_i = true;
/*  83 */     setRotation(this.lrf, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  88 */     float newangle = 0.0F;
/*  89 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  90 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/*  93 */     newangle = MathHelper.func_76134_b(f2 * 3.7F * this.wingspeed) * 3.1415927F * 0.45F * f1;
/*  94 */     this.lrf.field_78795_f = newangle;
/*  95 */     this.rrf.field_78795_f = -newangle;
/*     */     
/*  97 */     newangle = MathHelper.func_76134_b(f2 * 2.7F * this.wingspeed) * 3.1415927F * 0.25F;
/*  98 */     this.teeth.field_78795_f = newangle;
/*     */     
/* 100 */     newangle = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.05F;
/* 101 */     this.tail.field_78795_f = newangle;
/*     */     
/* 103 */     this.head.func_78785_a(f5);
/* 104 */     this.nose.func_78785_a(f5);
/* 105 */     this.teeth.func_78785_a(f5);
/* 106 */     this.body.func_78785_a(f5);
/* 107 */     this.tail.func_78785_a(f5);
/* 108 */     this.rff.func_78785_a(f5);
/* 109 */     this.lff.func_78785_a(f5);
/* 110 */     this.rrf.func_78785_a(f5);
/* 111 */     this.lrf.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 117 */     model.field_78795_f = x;
/* 118 */     model.field_78796_g = y;
/* 119 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 124 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelBeaver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */