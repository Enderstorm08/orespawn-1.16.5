/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelCliffRacer
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Body;
/*     */   
/*     */   ModelRenderer Fins;
/*     */   ModelRenderer LWing;
/*     */   ModelRenderer RWing;
/*     */   ModelRenderer Tail;
/*     */   ModelRenderer TailEnd;
/*     */   ModelRenderer Head;
/*     */   ModelRenderer Beak;
/*     */   
/*     */   public ModelCliffRacer(float f1) {
/*  23 */     this.wingspeed = f1;
/*     */     
/*  25 */     this.field_78090_t = 64;
/*  26 */     this.field_78089_u = 64;
/*     */     
/*  28 */     this.Body = new ModelRenderer(this, 0, 52);
/*  29 */     this.Body.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 10);
/*  30 */     this.Body.func_78793_a(-1.0F, 15.0F, -4.0F);
/*  31 */     this.Body.func_78787_b(64, 64);
/*  32 */     this.Body.field_78809_i = true;
/*  33 */     setRotation(this.Body, 0.0F, 0.0F, 0.0F);
/*  34 */     this.Fins = new ModelRenderer(this, 0, 40);
/*  35 */     this.Fins.func_78789_a(0.0F, -4.0F, 0.0F, 1, 6, 3);
/*  36 */     this.Fins.func_78793_a(0.0F, 15.0F, -1.0F);
/*  37 */     this.Fins.func_78787_b(64, 64);
/*  38 */     this.Fins.field_78809_i = true;
/*  39 */     setRotation(this.Fins, 0.0F, 0.0F, 0.0F);
/*  40 */     this.LWing = new ModelRenderer(this, 0, 31);
/*  41 */     this.LWing.func_78789_a(0.0F, 0.0F, 0.0F, 7, 1, 6);
/*  42 */     this.LWing.func_78793_a(2.0F, 15.0F, -2.0F);
/*  43 */     this.LWing.func_78787_b(64, 64);
/*  44 */     this.LWing.field_78809_i = true;
/*  45 */     setRotation(this.LWing, 0.0F, 0.0F, 0.0F);
/*  46 */     this.RWing = new ModelRenderer(this, 39, 0);
/*  47 */     this.RWing.func_78789_a(-7.0F, 0.0F, 0.0F, 7, 1, 6);
/*  48 */     this.RWing.func_78793_a(-1.0F, 15.0F, -2.0F);
/*  49 */     this.RWing.func_78787_b(64, 64);
/*  50 */     this.RWing.field_78809_i = true;
/*  51 */     setRotation(this.RWing, 0.0F, 0.0F, 0.0F);
/*  52 */     this.Tail = new ModelRenderer(this, 0, 16);
/*  53 */     this.Tail.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 9);
/*  54 */     this.Tail.func_78793_a(0.0F, 15.0F, 6.0F);
/*  55 */     this.Tail.func_78787_b(64, 64);
/*  56 */     this.Tail.field_78809_i = true;
/*  57 */     setRotation(this.Tail, 0.0F, 0.0F, 0.0F);
/*  58 */     this.TailEnd = new ModelRenderer(this, 0, 10);
/*  59 */     this.TailEnd.func_78789_a(0.0F, -1.0F, 9.0F, 2, 2, 2);
/*  60 */     this.TailEnd.func_78793_a(-0.5F, 15.0F, 6.0F);
/*  61 */     this.TailEnd.func_78787_b(64, 64);
/*  62 */     this.TailEnd.field_78809_i = true;
/*  63 */     setRotation(this.TailEnd, 0.0F, 0.0F, 0.0F);
/*  64 */     this.Head = new ModelRenderer(this, 28, 21);
/*  65 */     this.Head.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  66 */     this.Head.func_78793_a(-0.5F, 14.0F, -6.0F);
/*  67 */     this.Head.func_78787_b(64, 64);
/*  68 */     this.Head.field_78809_i = true;
/*  69 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  70 */     this.Beak = new ModelRenderer(this, 0, 0);
/*  71 */     this.Beak.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 2);
/*  72 */     this.Beak.func_78793_a(0.0F, 14.5F, -8.0F);
/*  73 */     this.Beak.func_78787_b(64, 64);
/*  74 */     this.Beak.field_78809_i = true;
/*  75 */     setRotation(this.Beak, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  80 */     float newangle = 0.0F;
/*  81 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  82 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/*  85 */     newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F;
/*  86 */     this.LWing.field_78808_h = newangle;
/*  87 */     this.RWing.field_78808_h = -newangle;
/*     */ 
/*     */     
/*  90 */     this.Body.func_78785_a(f5);
/*  91 */     this.Fins.func_78785_a(f5);
/*  92 */     this.LWing.func_78785_a(f5);
/*  93 */     this.RWing.func_78785_a(f5);
/*  94 */     this.Tail.func_78785_a(f5);
/*  95 */     this.TailEnd.func_78785_a(f5);
/*  96 */     this.Head.func_78785_a(f5);
/*  97 */     this.Beak.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 103 */     model.field_78795_f = x;
/* 104 */     model.field_78796_g = y;
/* 105 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 110 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCliffRacer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */