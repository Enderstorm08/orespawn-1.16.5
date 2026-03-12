/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelQueenBattleAxe
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer Handle1;
/*     */   ModelRenderer Head1;
/*     */   ModelRenderer Grip;
/*     */   ModelRenderer Pin;
/*     */   ModelRenderer Blade1;
/*     */   ModelRenderer Blade2;
/*     */   ModelRenderer Blade3;
/*     */   ModelRenderer Blade4;
/*     */   ModelRenderer Top;
/*     */   
/*     */   public ModelQueenBattleAxe() {
/*  23 */     this.field_78090_t = 128;
/*  24 */     this.field_78089_u = 64;
/*     */     
/*  26 */     this.Handle1 = new ModelRenderer(this, 0, 0);
/*  27 */     this.Handle1.func_78789_a(-7.0F, -0.5F, 0.0F, 31, 1, 1);
/*  28 */     this.Handle1.func_78793_a(-0.5F, -12.0F, 0.0F);
/*  29 */     this.Handle1.func_78787_b(128, 64);
/*  30 */     this.Handle1.field_78809_i = true;
/*  31 */     setRotation(this.Handle1, 0.0F, 0.0F, 1.570796F);
/*  32 */     this.Head1 = new ModelRenderer(this, 29, 18);
/*  33 */     this.Head1.func_78789_a(-2.0F, -4.5F, -0.5F, 3, 4, 2);
/*  34 */     this.Head1.func_78793_a(0.0F, -12.0F, 0.0F);
/*  35 */     this.Head1.func_78787_b(128, 64);
/*  36 */     this.Head1.field_78809_i = true;
/*  37 */     setRotation(this.Head1, 0.0F, 0.0F, 0.0F);
/*  38 */     this.Grip = new ModelRenderer(this, 0, 7);
/*  39 */     this.Grip.func_78789_a(-1.92F, 13.0F, -0.5F, 2, 11, 2);
/*  40 */     this.Grip.func_78793_a(0.5F, -12.0F, 0.0F);
/*  41 */     this.Grip.func_78787_b(128, 64);
/*  42 */     this.Grip.field_78809_i = true;
/*  43 */     setRotation(this.Grip, 0.0F, 0.0F, 0.0F);
/*  44 */     this.Pin = new ModelRenderer(this, 38, 11);
/*  45 */     this.Pin.func_78789_a(-1.0F, -3.0F, -1.0F, 1, 1, 3);
/*  46 */     this.Pin.func_78793_a(0.0F, -12.0F, 0.0F);
/*  47 */     this.Pin.func_78787_b(128, 64);
/*  48 */     this.Pin.field_78809_i = true;
/*  49 */     setRotation(this.Pin, 0.0F, 0.0F, 0.0F);
/*  50 */     this.Blade1 = new ModelRenderer(this, 70, 0);
/*  51 */     this.Blade1.func_78789_a(-10.0F, -2.0F, 0.0F, 20, 4, 1);
/*  52 */     this.Blade1.func_78793_a(-0.5F, -14.5F, 0.0F);
/*  53 */     this.Blade1.func_78787_b(128, 64);
/*  54 */     this.Blade1.field_78809_i = true;
/*  55 */     setRotation(this.Blade1, 0.0F, 0.0F, -0.5934119F);
/*  56 */     this.Blade2 = new ModelRenderer(this, 70, 0);
/*  57 */     this.Blade2.func_78789_a(-10.0F, -2.0F, 0.0F, 20, 4, 1);
/*  58 */     this.Blade2.func_78793_a(-0.5F, -14.5F, 0.0F);
/*  59 */     this.Blade2.func_78787_b(128, 64);
/*  60 */     this.Blade2.field_78809_i = true;
/*  61 */     setRotation(this.Blade2, 0.0F, 0.0F, -0.1919862F);
/*  62 */     this.Blade3 = new ModelRenderer(this, 70, 0);
/*  63 */     this.Blade3.func_78789_a(-10.0F, -2.0F, 0.0F, 20, 4, 1);
/*  64 */     this.Blade3.func_78793_a(-0.5F, -14.5F, 0.0F);
/*  65 */     this.Blade3.func_78787_b(128, 64);
/*  66 */     this.Blade3.field_78809_i = true;
/*  67 */     setRotation(this.Blade3, 0.0F, 0.0F, 0.2094395F);
/*  68 */     this.Blade4 = new ModelRenderer(this, 70, 0);
/*  69 */     this.Blade4.func_78789_a(-10.0F, -2.0F, 0.0F, 20, 4, 1);
/*  70 */     this.Blade4.func_78793_a(-0.5F, -14.5F, 0.0F);
/*  71 */     this.Blade4.func_78787_b(128, 64);
/*  72 */     this.Blade4.field_78809_i = true;
/*  73 */     setRotation(this.Blade4, 0.0F, 0.0F, 0.5934119F);
/*  74 */     this.Top = new ModelRenderer(this, 13, 4);
/*  75 */     this.Top.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  76 */     this.Top.func_78793_a(-1.5F, -21.0F, -0.5F);
/*  77 */     this.Top.func_78787_b(128, 64);
/*  78 */     this.Top.field_78809_i = true;
/*  79 */     setRotation(this.Top, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void render() {
/*  84 */     float f5 = 1.0F;
/*     */     
/*  86 */     this.Handle1.func_78785_a(f5);
/*  87 */     this.Head1.func_78785_a(f5);
/*  88 */     this.Grip.func_78785_a(f5);
/*  89 */     this.Pin.func_78785_a(f5);
/*  90 */     this.Blade1.func_78785_a(f5);
/*  91 */     this.Blade2.func_78785_a(f5);
/*  92 */     this.Blade3.func_78785_a(f5);
/*  93 */     this.Blade4.func_78785_a(f5);
/*  94 */     this.Top.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/*  99 */     model.field_78795_f = x;
/* 100 */     model.field_78796_g = y;
/* 101 */     model.field_78808_h = z;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelQueenBattleAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */