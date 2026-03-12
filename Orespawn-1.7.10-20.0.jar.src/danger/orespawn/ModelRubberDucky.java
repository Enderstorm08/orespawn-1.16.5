/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelRubberDucky
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer bottom;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer back;
/*     */   ModelRenderer neck;
/*     */   ModelRenderer head;
/*     */   ModelRenderer beak;
/*     */   ModelRenderer Lwing;
/*     */   ModelRenderer Rwing;
/*     */   
/*     */   public ModelRubberDucky(float f1) {
/*  24 */     this.wingspeed = f1;
/*     */     
/*  26 */     this.field_78090_t = 64;
/*  27 */     this.field_78089_u = 64;
/*     */     
/*  29 */     this.bottom = new ModelRenderer(this, 0, 56);
/*  30 */     this.bottom.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 1, 4);
/*  31 */     this.bottom.func_78793_a(0.0F, 23.0F, 0.0F);
/*  32 */     this.bottom.func_78787_b(64, 64);
/*  33 */     this.bottom.field_78809_i = true;
/*  34 */     setRotation(this.bottom, 0.0F, 0.0F, 0.0F);
/*  35 */     this.body = new ModelRenderer(this, 0, 45);
/*  36 */     this.body.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 2, 8);
/*  37 */     this.body.func_78793_a(0.0F, 21.0F, 0.0F);
/*  38 */     this.body.func_78787_b(64, 64);
/*  39 */     this.body.field_78809_i = true;
/*  40 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  41 */     this.back = new ModelRenderer(this, 0, 33);
/*  42 */     this.back.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 1, 10);
/*  43 */     this.back.func_78793_a(0.0F, 20.0F, 0.0F);
/*  44 */     this.back.func_78787_b(64, 64);
/*  45 */     this.back.field_78809_i = true;
/*  46 */     setRotation(this.back, 0.0F, 0.0F, 0.0F);
/*  47 */     this.neck = new ModelRenderer(this, 17, 27);
/*  48 */     this.neck.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 1, 2);
/*  49 */     this.neck.func_78793_a(0.0F, 19.0F, -1.0F);
/*  50 */     this.neck.func_78787_b(64, 64);
/*  51 */     this.neck.field_78809_i = true;
/*  52 */     setRotation(this.neck, 0.0F, 0.0F, 0.0F);
/*  53 */     this.head = new ModelRenderer(this, 13, 18);
/*  54 */     this.head.func_78789_a(-2.0F, -4.0F, -2.0F, 4, 4, 4);
/*  55 */     this.head.func_78793_a(0.0F, 19.0F, -1.0F);
/*  56 */     this.head.func_78787_b(64, 64);
/*  57 */     this.head.field_78809_i = true;
/*  58 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  59 */     this.beak = new ModelRenderer(this, 0, 21);
/*  60 */     this.beak.func_78789_a(-1.5F, -1.0F, -5.0F, 3, 1, 3);
/*  61 */     this.beak.func_78793_a(0.0F, 19.0F, -1.0F);
/*  62 */     this.beak.func_78787_b(64, 64);
/*  63 */     this.beak.field_78809_i = true;
/*  64 */     setRotation(this.beak, 0.0F, 0.0F, 0.0F);
/*  65 */     this.Lwing = new ModelRenderer(this, 0, 0);
/*  66 */     this.Lwing.func_78789_a(0.0F, -0.5F, 0.0F, 2, 1, 5);
/*  67 */     this.Lwing.func_78793_a(3.0F, 21.0F, -2.0F);
/*  68 */     this.Lwing.func_78787_b(64, 64);
/*  69 */     this.Lwing.field_78809_i = true;
/*  70 */     setRotation(this.Lwing, 0.0F, 0.0F, 0.0F);
/*  71 */     this.Rwing = new ModelRenderer(this, 17, 0);
/*  72 */     this.Rwing.func_78789_a(-2.0F, -0.5F, 0.0F, 2, 1, 5);
/*  73 */     this.Rwing.func_78793_a(-3.0F, 21.0F, -2.0F);
/*  74 */     this.Rwing.func_78787_b(64, 64);
/*  75 */     this.Rwing.field_78809_i = true;
/*  76 */     setRotation(this.Rwing, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  83 */     RubberDucky c = (RubberDucky)entity;
/*  84 */     RenderInfo r = null;
/*  85 */     float hf = 0.0F;
/*  86 */     float newangle = 0.0F;
/*  87 */     float nextangle = 0.0F;
/*     */     
/*  89 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  90 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/*  93 */     if (f1 > 0.1D) {
/*  94 */       newangle = MathHelper.func_76134_b(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/*  96 */       newangle = 0.0F;
/*     */     } 
/*     */     
/*  99 */     this.head.field_78796_g = (float)Math.toRadians(f3) * 0.45F;
/* 100 */     this.beak.field_78796_g = this.head.field_78796_g;
/* 101 */     this.head.field_78795_f = (float)Math.toRadians(f4) * 0.65F;
/* 102 */     this.beak.field_78795_f = this.head.field_78795_f;
/*     */ 
/*     */     
/* 105 */     r = c.getRenderInfo();
/*     */     
/* 107 */     newangle = MathHelper.func_76134_b(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.15F;
/* 108 */     nextangle = MathHelper.func_76134_b((f2 + 0.3F) * 1.0F * this.wingspeed) * 3.1415927F * 0.15F;
/*     */ 
/*     */     
/* 111 */     if (nextangle > 0.0F && newangle < 0.0F) {
/*     */       
/* 113 */       r.ri1 = 0;
/* 114 */       if (c.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 115 */         r.ri1 = 1;
/*     */       }
/* 117 */       if (c.getKillCount() >= 5) {
/* 118 */         if (c.field_70170_p.field_73012_v.nextInt(2) == 1) {
/* 119 */           r.ri1 = 1;
/*     */         }
/* 121 */         newangle *= 4.0F;
/*     */       } 
/*     */     } 
/*     */     
/* 125 */     if (r.ri1 == 0) {
/* 126 */       newangle = 0.0F;
/*     */     }
/* 128 */     if (c.func_70906_o()) {
/* 129 */       newangle = 0.0F;
/*     */     }
/* 131 */     newangle = Math.abs(newangle);
/* 132 */     this.Lwing.field_78808_h = -newangle;
/* 133 */     this.Lwing.field_78796_g = newangle / 2.0F;
/* 134 */     this.Rwing.field_78808_h = newangle;
/* 135 */     this.Rwing.field_78796_g = -newangle / 2.0F;
/*     */ 
/*     */     
/* 138 */     c.setRenderInfo(r);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     this.bottom.func_78785_a(f5);
/* 165 */     this.body.func_78785_a(f5);
/* 166 */     this.back.func_78785_a(f5);
/* 167 */     this.neck.func_78785_a(f5);
/* 168 */     this.head.func_78785_a(f5);
/* 169 */     this.beak.func_78785_a(f5);
/* 170 */     this.Lwing.func_78785_a(f5);
/* 171 */     this.Rwing.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 177 */     model.field_78795_f = x;
/* 178 */     model.field_78796_g = y;
/* 179 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 184 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelRubberDucky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */