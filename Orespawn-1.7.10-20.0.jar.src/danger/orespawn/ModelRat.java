/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelRat
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer tail1;
/*     */   
/*     */   ModelRenderer tail2;
/*     */   
/*     */   ModelRenderer lfleg;
/*     */   ModelRenderer rfleg;
/*     */   ModelRenderer lrleg;
/*     */   ModelRenderer rrleg;
/*     */   ModelRenderer body2;
/*     */   ModelRenderer head;
/*     */   ModelRenderer nose;
/*     */   ModelRenderer lear;
/*     */   ModelRenderer rear;
/*     */   
/*     */   public ModelRat(float f1) {
/*  29 */     this.wingspeed = f1;
/*     */     
/*  31 */     this.field_78090_t = 64;
/*  32 */     this.field_78089_u = 64;
/*     */     
/*  34 */     this.body = new ModelRenderer(this, 27, 0);
/*  35 */     this.body.func_78789_a(-2.0F, -1.0F, 0.0F, 5, 3, 10);
/*  36 */     this.body.func_78793_a(0.0F, 20.0F, -3.0F);
/*  37 */     this.body.func_78787_b(64, 64);
/*  38 */     this.body.field_78809_i = true;
/*  39 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  40 */     this.tail1 = new ModelRenderer(this, 0, 30);
/*  41 */     this.tail1.func_78789_a(-0.5F, -1.0F, 0.0F, 2, 2, 9);
/*  42 */     this.tail1.func_78793_a(0.0F, 21.0F, 7.0F);
/*  43 */     this.tail1.func_78787_b(64, 64);
/*  44 */     this.tail1.field_78809_i = true;
/*  45 */     setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
/*  46 */     this.tail2 = new ModelRenderer(this, 0, 43);
/*  47 */     this.tail2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 12);
/*  48 */     this.tail2.func_78793_a(0.0F, 21.0F, 16.0F);
/*  49 */     this.tail2.func_78787_b(64, 64);
/*  50 */     this.tail2.field_78809_i = true;
/*  51 */     setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
/*  52 */     this.lfleg = new ModelRenderer(this, 0, 14);
/*  53 */     this.lfleg.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/*  54 */     this.lfleg.func_78793_a(2.0F, 22.0F, -2.0F);
/*  55 */     this.lfleg.func_78787_b(64, 64);
/*  56 */     this.lfleg.field_78809_i = true;
/*  57 */     setRotation(this.lfleg, 0.0F, 0.0F, 0.0F);
/*  58 */     this.rfleg = new ModelRenderer(this, 10, 14);
/*  59 */     this.rfleg.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/*  60 */     this.rfleg.func_78793_a(-2.0F, 22.0F, -2.0F);
/*  61 */     this.rfleg.func_78787_b(64, 64);
/*  62 */     this.rfleg.field_78809_i = true;
/*  63 */     setRotation(this.rfleg, 0.0F, 0.0F, 0.0F);
/*  64 */     this.lrleg = new ModelRenderer(this, 0, 18);
/*  65 */     this.lrleg.func_78789_a(0.0F, 0.0F, 0.0F, 2, 4, 2);
/*  66 */     this.lrleg.func_78793_a(2.0F, 20.0F, 4.0F);
/*  67 */     this.lrleg.func_78787_b(64, 64);
/*  68 */     this.lrleg.field_78809_i = true;
/*  69 */     setRotation(this.lrleg, 0.0F, 0.0F, 0.0F);
/*  70 */     this.rrleg = new ModelRenderer(this, 9, 18);
/*  71 */     this.rrleg.func_78789_a(0.0F, 0.0F, 0.0F, 2, 4, 2);
/*  72 */     this.rrleg.func_78793_a(-3.0F, 20.0F, 4.0F);
/*  73 */     this.rrleg.func_78787_b(64, 64);
/*  74 */     this.rrleg.field_78809_i = true;
/*  75 */     setRotation(this.rrleg, 0.0F, 0.0F, 0.0F);
/*  76 */     this.body2 = new ModelRenderer(this, 0, 0);
/*  77 */     this.body2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 6);
/*  78 */     this.body2.func_78793_a(0.0F, 18.0F, 0.0F);
/*  79 */     this.body2.func_78787_b(64, 64);
/*  80 */     this.body2.field_78809_i = true;
/*  81 */     setRotation(this.body2, 0.0F, 0.0F, 0.0F);
/*  82 */     this.head = new ModelRenderer(this, 27, 17);
/*  83 */     this.head.func_78789_a(-1.0F, -2.0F, -3.0F, 3, 2, 4);
/*  84 */     this.head.func_78793_a(0.0F, 22.0F, -4.0F);
/*  85 */     this.head.func_78787_b(64, 64);
/*  86 */     this.head.field_78809_i = true;
/*  87 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  88 */     this.nose = new ModelRenderer(this, 27, 25);
/*  89 */     this.nose.func_78789_a(0.0F, -1.0F, -5.0F, 1, 1, 2);
/*  90 */     this.nose.func_78793_a(0.0F, 22.0F, -4.0F);
/*  91 */     this.nose.func_78787_b(64, 64);
/*  92 */     this.nose.field_78809_i = true;
/*  93 */     setRotation(this.nose, 0.0F, 0.0F, 0.0F);
/*  94 */     this.lear = new ModelRenderer(this, 0, 9);
/*  95 */     this.lear.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
/*  96 */     this.lear.func_78793_a(1.5F, 19.5F, -4.0F);
/*  97 */     this.lear.func_78787_b(64, 64);
/*  98 */     this.lear.field_78809_i = true;
/*  99 */     setRotation(this.lear, 0.0F, 0.0F, 0.0F);
/* 100 */     this.rear = new ModelRenderer(this, 5, 9);
/* 101 */     this.rear.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
/* 102 */     this.rear.func_78793_a(-1.5F, 19.5F, -4.0F);
/* 103 */     this.rear.func_78787_b(64, 64);
/* 104 */     this.rear.field_78809_i = true;
/* 105 */     setRotation(this.rear, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 113 */     Rat r = (Rat)entity;
/* 114 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 115 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 117 */     float newangle = 0.0F;
/*     */     
/* 119 */     if (f1 > 0.1D) {
/* 120 */       newangle = MathHelper.func_76134_b(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 122 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 125 */     this.rfleg.field_78795_f = newangle;
/* 126 */     this.lfleg.field_78795_f = -newangle;
/* 127 */     this.rrleg.field_78795_f = -newangle;
/* 128 */     this.lrleg.field_78795_f = newangle;
/*     */     
/* 130 */     if (r.getAttacking() != 0) {
/* 131 */       newangle = MathHelper.func_76134_b(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.25F;
/*     */     } else {
/* 133 */       newangle = MathHelper.func_76134_b(f2 * 0.4F * this.wingspeed) * 3.1415927F * 0.05F;
/*     */     } 
/* 135 */     this.tail1.field_78796_g = newangle * 0.5F;
/* 136 */     this.tail2.field_78796_g = newangle * 1.25F;
/* 137 */     this.tail1.field_78798_e += (float)Math.cos(this.tail1.field_78796_g) * 9.0F;
/* 138 */     this.tail1.field_78800_c += (float)Math.sin(this.tail1.field_78796_g) * 9.0F;
/*     */ 
/*     */     
/* 141 */     this.body.func_78785_a(f5);
/* 142 */     this.tail1.func_78785_a(f5);
/* 143 */     this.tail2.func_78785_a(f5);
/* 144 */     this.lfleg.func_78785_a(f5);
/* 145 */     this.rfleg.func_78785_a(f5);
/* 146 */     this.lrleg.func_78785_a(f5);
/* 147 */     this.rrleg.func_78785_a(f5);
/* 148 */     this.body2.func_78785_a(f5);
/* 149 */     this.head.func_78785_a(f5);
/* 150 */     this.nose.func_78785_a(f5);
/* 151 */     this.lear.func_78785_a(f5);
/* 152 */     this.rear.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 158 */     model.field_78795_f = x;
/* 159 */     model.field_78796_g = y;
/* 160 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 165 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelRat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */