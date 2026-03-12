/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelCloudShark
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer head;
/*     */   ModelRenderer jaw;
/*     */   ModelRenderer topfin;
/*     */   ModelRenderer bbody;
/*     */   ModelRenderer fins;
/*     */   ModelRenderer leftfin;
/*     */   ModelRenderer rightfin;
/*     */   
/*     */   public ModelCloudShark(float f1) {
/*  23 */     this.wingspeed = f1;
/*     */     
/*  25 */     this.field_78090_t = 64;
/*  26 */     this.field_78089_u = 64;
/*     */     
/*  28 */     this.body = new ModelRenderer(this, 0, 0);
/*  29 */     this.body.func_78789_a(0.0F, 0.0F, 0.0F, 6, 8, 15);
/*  30 */     this.body.func_78793_a(-4.0F, 11.0F, 0.0F);
/*  31 */     this.body.func_78787_b(64, 64);
/*  32 */     this.body.field_78809_i = true;
/*  33 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  34 */     this.head = new ModelRenderer(this, 0, 51);
/*  35 */     this.head.func_78789_a(-2.5F, 0.0F, -8.0F, 5, 5, 8);
/*  36 */     this.head.func_78793_a(-1.0F, 11.0F, 0.0F);
/*  37 */     this.head.func_78787_b(64, 64);
/*  38 */     this.head.field_78809_i = true;
/*  39 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  40 */     this.jaw = new ModelRenderer(this, 42, 0);
/*  41 */     this.jaw.func_78789_a(-2.5F, 0.0F, -6.0F, 5, 2, 6);
/*  42 */     this.jaw.func_78793_a(-1.0F, 15.0F, 0.0F);
/*  43 */     this.jaw.func_78787_b(64, 64);
/*  44 */     this.jaw.field_78809_i = true;
/*  45 */     setRotation(this.jaw, 0.5056291F, 0.0F, 0.0F);
/*  46 */     this.topfin = new ModelRenderer(this, 0, 0);
/*  47 */     this.topfin.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 6);
/*  48 */     this.topfin.func_78793_a(-1.5F, 11.0F, 5.0F);
/*  49 */     this.topfin.func_78787_b(64, 64);
/*  50 */     this.topfin.field_78809_i = true;
/*  51 */     setRotation(this.topfin, 0.935765F, 0.0F, 0.0F);
/*  52 */     this.bbody = new ModelRenderer(this, 0, 9);
/*  53 */     this.bbody.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 8, 6);
/*  54 */     this.bbody.func_78793_a(-1.0F, 11.0F, 15.0F);
/*  55 */     this.bbody.func_78787_b(64, 64);
/*  56 */     this.bbody.field_78809_i = true;
/*  57 */     setRotation(this.bbody, 0.0F, 0.0F, 0.0F);
/*  58 */     this.fins = new ModelRenderer(this, 0, 24);
/*  59 */     this.fins.func_78789_a(0.0F, 0.0F, 0.0F, 0, 10, 10);
/*  60 */     this.fins.func_78793_a(-1.0F, 16.0F, 16.0F);
/*  61 */     this.fins.func_78787_b(64, 64);
/*  62 */     this.fins.field_78809_i = true;
/*  63 */     setRotation(this.fins, 0.9220296F, 0.0F, 0.0F);
/*  64 */     this.leftfin = new ModelRenderer(this, 0, 0);
/*  65 */     this.leftfin.func_78789_a(0.0F, 0.0F, 0.0F, 0, 3, 7);
/*  66 */     this.leftfin.func_78793_a(2.0F, 16.0F, 6.0F);
/*  67 */     this.leftfin.func_78787_b(64, 64);
/*  68 */     this.leftfin.field_78809_i = true;
/*  69 */     setRotation(this.leftfin, -0.6108652F, 1.134464F, -0.6108652F);
/*  70 */     this.rightfin = new ModelRenderer(this, 0, 0);
/*  71 */     this.rightfin.func_78789_a(0.0F, 0.0F, 0.0F, 0, 3, 7);
/*  72 */     this.rightfin.func_78793_a(-4.0F, 16.0F, 6.0F);
/*  73 */     this.rightfin.func_78787_b(64, 64);
/*  74 */     this.rightfin.field_78809_i = true;
/*  75 */     setRotation(this.rightfin, -0.6283185F, -1.134464F, 0.6108652F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  80 */     float newangle = 0.0F;
/*  81 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  82 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/*  85 */     newangle = MathHelper.func_76134_b(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.15F;
/*  86 */     this.leftfin.field_78796_g = 1.15F + newangle;
/*  87 */     newangle = MathHelper.func_76134_b(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.15F;
/*  88 */     this.rightfin.field_78796_g = -0.9F + newangle;
/*  89 */     newangle = MathHelper.func_76134_b(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.25F;
/*  90 */     this.fins.field_78796_g = newangle;
/*  91 */     newangle = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.1F;
/*  92 */     this.jaw.field_78795_f = 0.5F + newangle;
/*     */ 
/*     */     
/*  95 */     this.body.func_78785_a(f5);
/*  96 */     this.head.func_78785_a(f5);
/*  97 */     this.jaw.func_78785_a(f5);
/*  98 */     this.topfin.func_78785_a(f5);
/*  99 */     this.bbody.func_78785_a(f5);
/* 100 */     this.fins.func_78785_a(f5);
/* 101 */     this.leftfin.func_78785_a(f5);
/* 102 */     this.rightfin.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 108 */     model.field_78795_f = x;
/* 109 */     model.field_78796_g = y;
/* 110 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 115 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCloudShark.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */