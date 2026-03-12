/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelBertha
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer Grip;
/*     */   ModelRenderer Blade;
/*     */   ModelRenderer Handguard2;
/*     */   ModelRenderer Handguard1;
/*     */   ModelRenderer hg2;
/*     */   ModelRenderer hg4;
/*     */   ModelRenderer hg3;
/*     */   ModelRenderer hg1;
/*     */   ModelRenderer BaseGrip;
/*     */   ModelRenderer Tip1;
/*     */   ModelRenderer Tip2;
/*     */   ModelRenderer Bottom;
/*     */   
/*     */   public ModelBertha() {
/*  26 */     this.field_78090_t = 64;
/*  27 */     this.field_78089_u = 128;
/*     */     
/*  29 */     this.Grip = new ModelRenderer(this, 0, 0);
/*  30 */     this.Grip.func_78789_a(0.0F, -6.0F, 0.0F, 1, 12, 1);
/*  31 */     this.Grip.func_78793_a(0.0F, 0.0F, 0.0F);
/*  32 */     this.Grip.func_78787_b(64, 128);
/*  33 */     this.Grip.field_78809_i = true;
/*  34 */     setRotation(this.Grip, 0.0F, 0.0F, 0.0F);
/*  35 */     this.Blade = new ModelRenderer(this, 6, 0);
/*  36 */     this.Blade.func_78789_a(0.0F, -41.0F, -1.0F, 1, 34, 3);
/*  37 */     this.Blade.func_78793_a(0.0F, 0.0F, 0.0F);
/*  38 */     this.Blade.func_78787_b(64, 128);
/*  39 */     this.Blade.field_78809_i = true;
/*  40 */     setRotation(this.Blade, 0.0F, 0.0F, 0.0F);
/*  41 */     this.Handguard2 = new ModelRenderer(this, 16, 0);
/*  42 */     this.Handguard2.func_78789_a(0.0F, -7.0F, -4.0F, 1, 1, 9);
/*  43 */     this.Handguard2.func_78793_a(0.0F, 0.0F, 0.0F);
/*  44 */     this.Handguard2.func_78787_b(64, 128);
/*  45 */     this.Handguard2.field_78809_i = true;
/*  46 */     setRotation(this.Handguard2, 0.0F, 0.0F, 0.0F);
/*  47 */     this.Handguard1 = new ModelRenderer(this, 18, 12);
/*  48 */     this.Handguard1.func_78789_a(-3.0F, -7.0F, 0.0F, 7, 1, 1);
/*  49 */     this.Handguard1.func_78793_a(0.0F, 0.0F, 0.0F);
/*  50 */     this.Handguard1.func_78787_b(64, 128);
/*  51 */     this.Handguard1.field_78809_i = true;
/*  52 */     setRotation(this.Handguard1, 0.0F, 0.0F, 0.0F);
/*  53 */     this.hg2 = new ModelRenderer(this, 0, 15);
/*  54 */     this.hg2.func_78789_a(0.0F, -8.0F, -5.0F, 1, 1, 1);
/*  55 */     this.hg2.func_78793_a(0.0F, 0.0F, 0.0F);
/*  56 */     this.hg2.func_78787_b(64, 128);
/*  57 */     this.hg2.field_78809_i = true;
/*  58 */     setRotation(this.hg2, 0.0F, 0.0F, 0.0F);
/*  59 */     this.hg4 = new ModelRenderer(this, 0, 18);
/*  60 */     this.hg4.func_78789_a(0.0F, -8.0F, 5.0F, 1, 1, 1);
/*  61 */     this.hg4.func_78793_a(0.0F, 0.0F, 0.0F);
/*  62 */     this.hg4.func_78787_b(64, 128);
/*  63 */     this.hg4.field_78809_i = true;
/*  64 */     setRotation(this.hg4, 0.0F, 0.0F, 0.0F);
/*  65 */     this.hg3 = new ModelRenderer(this, 0, 21);
/*  66 */     this.hg3.func_78789_a(-4.0F, -8.0F, 0.0F, 1, 1, 1);
/*  67 */     this.hg3.func_78793_a(0.0F, 0.0F, 0.0F);
/*  68 */     this.hg3.func_78787_b(64, 128);
/*  69 */     this.hg3.field_78809_i = true;
/*  70 */     setRotation(this.hg3, 0.0F, 0.0F, 0.0F);
/*  71 */     this.hg1 = new ModelRenderer(this, 0, 24);
/*  72 */     this.hg1.func_78789_a(4.0F, -8.0F, 0.0F, 1, 1, 1);
/*  73 */     this.hg1.func_78793_a(0.0F, 0.0F, 0.0F);
/*  74 */     this.hg1.func_78787_b(64, 128);
/*  75 */     this.hg1.field_78809_i = true;
/*  76 */     setRotation(this.hg1, 0.0F, 0.0F, 0.0F);
/*  77 */     this.BaseGrip = new ModelRenderer(this, 0, 39);
/*  78 */     this.BaseGrip.func_78789_a(-1.0F, 5.0F, -1.0F, 3, 1, 3);
/*  79 */     this.BaseGrip.func_78793_a(0.0F, 0.0F, 0.0F);
/*  80 */     this.BaseGrip.func_78787_b(64, 128);
/*  81 */     this.BaseGrip.field_78809_i = true;
/*  82 */     setRotation(this.BaseGrip, 0.0F, 0.0F, 0.0F);
/*  83 */     this.Tip1 = new ModelRenderer(this, 21, 16);
/*  84 */     this.Tip1.func_78789_a(0.0F, -42.0F, -0.5F, 1, 1, 2);
/*  85 */     this.Tip1.func_78793_a(0.0F, 0.0F, 0.0F);
/*  86 */     this.Tip1.func_78787_b(64, 128);
/*  87 */     this.Tip1.field_78809_i = true;
/*  88 */     setRotation(this.Tip1, 0.0F, 0.0F, 0.0F);
/*  89 */     this.Tip2 = new ModelRenderer(this, 22, 20);
/*  90 */     this.Tip2.func_78789_a(0.0F, -43.0F, 0.0F, 1, 1, 1);
/*  91 */     this.Tip2.func_78793_a(0.0F, 0.0F, 0.0F);
/*  92 */     this.Tip2.func_78787_b(64, 128);
/*  93 */     this.Tip2.field_78809_i = true;
/*  94 */     setRotation(this.Tip2, 0.0F, 0.0F, 0.0F);
/*  95 */     this.Bottom = new ModelRenderer(this, 0, 45);
/*  96 */     this.Bottom.func_78789_a(0.0F, 6.0F, 0.0F, 1, 1, 1);
/*  97 */     this.Bottom.func_78793_a(0.0F, 0.0F, 0.0F);
/*  98 */     this.Bottom.func_78787_b(64, 128);
/*  99 */     this.Bottom.field_78809_i = true;
/* 100 */     setRotation(this.Bottom, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void render() {
/* 105 */     float f5 = 1.0F;
/*     */     
/* 107 */     this.Grip.func_78785_a(f5);
/* 108 */     this.Blade.func_78785_a(f5);
/* 109 */     this.Handguard2.func_78785_a(f5);
/* 110 */     this.Handguard1.func_78785_a(f5);
/* 111 */     this.hg2.func_78785_a(f5);
/* 112 */     this.hg4.func_78785_a(f5);
/* 113 */     this.hg3.func_78785_a(f5);
/* 114 */     this.hg1.func_78785_a(f5);
/* 115 */     this.BaseGrip.func_78785_a(f5);
/* 116 */     this.Tip1.func_78785_a(f5);
/* 117 */     this.Tip2.func_78785_a(f5);
/* 118 */     this.Bottom.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 123 */     model.field_78795_f = x;
/* 124 */     model.field_78796_g = y;
/* 125 */     model.field_78808_h = z;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelBertha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */