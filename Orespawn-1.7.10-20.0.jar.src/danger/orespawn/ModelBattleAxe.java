/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelBattleAxe
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer Handle1;
/*     */   ModelRenderer Head1;
/*     */   ModelRenderer Grip;
/*     */   ModelRenderer Pin;
/*     */   ModelRenderer Top;
/*     */   ModelRenderer Blade1;
/*     */   ModelRenderer Blade2;
/*     */   ModelRenderer Blade3;
/*     */   ModelRenderer Blade4;
/*     */   ModelRenderer Blade5;
/*     */   ModelRenderer Blade6;
/*     */   ModelRenderer Blade7;
/*     */   ModelRenderer Blade8;
/*     */   ModelRenderer Blade9;
/*     */   ModelRenderer Blade10;
/*     */   
/*     */   public ModelBattleAxe() {
/*  29 */     this.field_78090_t = 128;
/*  30 */     this.field_78089_u = 64;
/*     */     
/*  32 */     this.Handle1 = new ModelRenderer(this, 0, 0);
/*  33 */     this.Handle1.func_78789_a(-7.0F, -0.5F, 0.0F, 31, 2, 1);
/*  34 */     this.Handle1.func_78793_a(0.0F, -12.0F, 0.0F);
/*  35 */     this.Handle1.func_78787_b(128, 64);
/*  36 */     this.Handle1.field_78809_i = true;
/*  37 */     setRotation(this.Handle1, 0.0F, 0.0F, 1.570796F);
/*  38 */     this.Head1 = new ModelRenderer(this, 29, 18);
/*  39 */     this.Head1.func_78789_a(-2.0F, -4.5F, -0.5F, 3, 4, 2);
/*  40 */     this.Head1.func_78793_a(0.0F, -12.0F, 0.0F);
/*  41 */     this.Head1.func_78787_b(128, 64);
/*  42 */     this.Head1.field_78809_i = true;
/*  43 */     setRotation(this.Head1, 0.0F, 0.0F, 0.0F);
/*  44 */     this.Grip = new ModelRenderer(this, 0, 7);
/*  45 */     this.Grip.func_78789_a(-1.92F, 13.0F, -0.5F, 3, 11, 2);
/*  46 */     this.Grip.func_78793_a(0.0F, -12.0F, 0.0F);
/*  47 */     this.Grip.func_78787_b(128, 64);
/*  48 */     this.Grip.field_78809_i = true;
/*  49 */     setRotation(this.Grip, 0.0F, 0.0F, 0.0F);
/*  50 */     this.Pin = new ModelRenderer(this, 38, 11);
/*  51 */     this.Pin.func_78789_a(-1.0F, -3.0F, -1.0F, 1, 1, 3);
/*  52 */     this.Pin.func_78793_a(0.0F, -12.0F, 0.0F);
/*  53 */     this.Pin.func_78787_b(128, 64);
/*  54 */     this.Pin.field_78809_i = true;
/*  55 */     setRotation(this.Pin, 0.0F, 0.0F, 0.0F);
/*  56 */     this.Top = new ModelRenderer(this, 24, 11);
/*  57 */     this.Top.func_78789_a(-2.0F, -8.0F, -0.5F, 3, 2, 2);
/*  58 */     this.Top.func_78793_a(0.0F, -12.0F, 0.0F);
/*  59 */     this.Top.func_78787_b(128, 64);
/*  60 */     this.Top.field_78809_i = true;
/*  61 */     setRotation(this.Top, 0.0F, 0.0F, 0.0F);
/*  62 */     this.Blade1 = new ModelRenderer(this, 70, 0);
/*  63 */     this.Blade1.func_78789_a(6.0F, -8.0F, 0.0F, 3, 10, 1);
/*  64 */     this.Blade1.func_78793_a(0.0F, -12.0F, 0.0F);
/*  65 */     this.Blade1.func_78787_b(128, 64);
/*  66 */     this.Blade1.field_78809_i = true;
/*  67 */     setRotation(this.Blade1, 0.0F, 0.0F, 0.5061455F);
/*  68 */     this.Blade2 = new ModelRenderer(this, 70, 0);
/*  69 */     this.Blade2.func_78789_a(8.5F, -6.9F, 0.0F, 3, 10, 1);
/*  70 */     this.Blade2.func_78793_a(0.0F, -12.0F, 0.0F);
/*  71 */     this.Blade2.func_78787_b(128, 64);
/*  72 */     this.Blade2.field_78809_i = true;
/*  73 */     setRotation(this.Blade2, 0.0F, 0.0F, -0.5061455F);
/*  74 */     this.Blade3 = new ModelRenderer(this, 0, 0);
/*  75 */     this.Blade3.func_78789_a(-1.5F, -3.0F, 0.0F, 10, 1, 1);
/*  76 */     this.Blade3.func_78793_a(0.0F, -12.0F, 0.0F);
/*  77 */     this.Blade3.func_78787_b(128, 64);
/*  78 */     this.Blade3.field_78809_i = true;
/*  79 */     setRotation(this.Blade3, 0.0F, 0.0F, 0.0F);
/*  80 */     this.Blade4 = new ModelRenderer(this, 0, 0);
/*  81 */     this.Blade4.func_78789_a(-1.0F, -2.0F, 0.0F, 7, 1, 1);
/*  82 */     this.Blade4.func_78793_a(0.0F, -12.0F, 0.0F);
/*  83 */     this.Blade4.func_78787_b(128, 64);
/*  84 */     this.Blade4.field_78809_i = true;
/*  85 */     setRotation(this.Blade4, 0.0F, 0.0F, 0.5061455F);
/*  86 */     this.Blade5 = new ModelRenderer(this, 0, 0);
/*  87 */     this.Blade5.func_78789_a(0.5F, -3.5F, 0.0F, 8, 1, 1);
/*  88 */     this.Blade5.func_78793_a(0.0F, -12.0F, 0.0F);
/*  89 */     this.Blade5.func_78787_b(128, 64);
/*  90 */     this.Blade5.field_78809_i = true;
/*  91 */     setRotation(this.Blade5, 0.0F, 0.0F, -0.5061455F);
/*  92 */     this.Blade6 = new ModelRenderer(this, 70, 0);
/*  93 */     this.Blade6.func_78789_a(-12.2F, -5.2F, 0.0F, 3, 10, 1);
/*  94 */     this.Blade6.func_78793_a(0.0F, -13.0F, 0.0F);
/*  95 */     this.Blade6.func_78787_b(128, 64);
/*  96 */     this.Blade6.field_78809_i = true;
/*  97 */     setRotation(this.Blade6, 0.0F, 0.0F, 0.5061455F);
/*  98 */     this.Blade7 = new ModelRenderer(this, 0, 0);
/*  99 */     this.Blade7.func_78789_a(-9.9F, -3.0F, 0.0F, 8, 1, 1);
/* 100 */     this.Blade7.func_78793_a(0.0F, -12.0F, 0.0F);
/* 101 */     this.Blade7.func_78787_b(128, 64);
/* 102 */     this.Blade7.field_78809_i = true;
/* 103 */     setRotation(this.Blade7, 0.0F, 0.0F, 0.5061455F);
/* 104 */     this.Blade8 = new ModelRenderer(this, 0, 0);
/* 105 */     this.Blade8.func_78789_a(-10.0F, -3.0F, 0.0F, 10, 1, 1);
/* 106 */     this.Blade8.func_78793_a(0.0F, -12.0F, 0.0F);
/* 107 */     this.Blade8.func_78787_b(128, 64);
/* 108 */     this.Blade8.field_78809_i = true;
/* 109 */     setRotation(this.Blade8, 0.0F, 0.0F, 0.0F);
/* 110 */     this.Blade9 = new ModelRenderer(this, 70, 0);
/* 111 */     this.Blade9.func_78789_a(-10.0F, -8.5F, 0.0F, 3, 10, 1);
/* 112 */     this.Blade9.func_78793_a(0.0F, -12.0F, 0.0F);
/* 113 */     this.Blade9.func_78787_b(128, 64);
/* 114 */     this.Blade9.field_78809_i = true;
/* 115 */     setRotation(this.Blade9, 0.0F, 0.0F, -0.5061455F);
/* 116 */     this.Blade10 = new ModelRenderer(this, 0, 0);
/* 117 */     this.Blade10.func_78789_a(-7.0F, -2.5F, 0.0F, 7, 1, 1);
/* 118 */     this.Blade10.func_78793_a(0.0F, -12.0F, 0.0F);
/* 119 */     this.Blade10.func_78787_b(128, 64);
/* 120 */     this.Blade10.field_78809_i = true;
/* 121 */     setRotation(this.Blade10, 0.0F, 0.0F, -0.5061455F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void render() {
/* 126 */     float f5 = 1.0F;
/*     */     
/* 128 */     this.Handle1.func_78785_a(f5);
/* 129 */     this.Head1.func_78785_a(f5);
/* 130 */     this.Grip.func_78785_a(f5);
/* 131 */     this.Pin.func_78785_a(f5);
/* 132 */     this.Top.func_78785_a(f5);
/* 133 */     this.Blade1.func_78785_a(f5);
/* 134 */     this.Blade2.func_78785_a(f5);
/* 135 */     this.Blade3.func_78785_a(f5);
/* 136 */     this.Blade4.func_78785_a(f5);
/* 137 */     this.Blade5.func_78785_a(f5);
/* 138 */     this.Blade6.func_78785_a(f5);
/* 139 */     this.Blade7.func_78785_a(f5);
/* 140 */     this.Blade8.func_78785_a(f5);
/* 141 */     this.Blade9.func_78785_a(f5);
/* 142 */     this.Blade10.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 147 */     model.field_78795_f = x;
/* 148 */     model.field_78796_g = y;
/* 149 */     model.field_78808_h = z;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelBattleAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */