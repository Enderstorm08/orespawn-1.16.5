/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelEasterBunny
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   ModelRenderer tail;
/*     */   ModelRenderer lfoot;
/*     */   ModelRenderer lleg;
/*     */   ModelRenderer upperbody;
/*     */   ModelRenderer head;
/*     */   ModelRenderer nose;
/*     */   ModelRenderer lear;
/*     */   ModelRenderer lpaw;
/*     */   ModelRenderer rleg;
/*     */   ModelRenderer rfoot;
/*     */   ModelRenderer rear;
/*     */   ModelRenderer rpaw;
/*     */   
/*     */   public ModelEasterBunny(float f1) {
/*  28 */     this.wingspeed = f1;
/*     */     
/*  30 */     this.field_78090_t = 64;
/*  31 */     this.field_78089_u = 128;
/*     */     
/*  33 */     this.body = new ModelRenderer(this, 0, 44);
/*  34 */     this.body.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 6, 7);
/*  35 */     this.body.func_78793_a(0.0F, 17.0F, 0.0F);
/*  36 */     this.body.func_78787_b(64, 32);
/*  37 */     this.body.field_78809_i = true;
/*  38 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  39 */     this.tail = new ModelRenderer(this, 0, 58);
/*  40 */     this.tail.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 4, 4);
/*  41 */     this.tail.func_78793_a(0.0F, 19.0F, 6.0F);
/*  42 */     this.tail.func_78787_b(64, 32);
/*  43 */     this.tail.field_78809_i = true;
/*  44 */     setRotation(this.tail, 0.0F, 0.0F, 0.0F);
/*  45 */     this.lfoot = new ModelRenderer(this, 0, 30);
/*  46 */     this.lfoot.func_78789_a(-1.0F, 2.0F, -5.0F, 3, 1, 7);
/*  47 */     this.lfoot.func_78793_a(3.0F, 21.0F, 1.0F);
/*  48 */     this.lfoot.func_78787_b(64, 32);
/*  49 */     this.lfoot.field_78809_i = true;
/*  50 */     setRotation(this.lfoot, 0.0F, 0.0F, 0.0F);
/*  51 */     this.lleg = new ModelRenderer(this, 0, 20);
/*  52 */     this.lleg.func_78789_a(0.0F, -2.0F, -2.0F, 1, 4, 5);
/*  53 */     this.lleg.func_78793_a(3.0F, 21.0F, 1.0F);
/*  54 */     this.lleg.func_78787_b(64, 32);
/*  55 */     this.lleg.field_78809_i = true;
/*  56 */     setRotation(this.lleg, 0.0F, 0.0F, 0.0F);
/*  57 */     this.upperbody = new ModelRenderer(this, 42, 27);
/*  58 */     this.upperbody.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 1, 5);
/*  59 */     this.upperbody.func_78793_a(0.0F, 16.0F, -1.0F);
/*  60 */     this.upperbody.func_78787_b(64, 32);
/*  61 */     this.upperbody.field_78809_i = true;
/*  62 */     setRotation(this.upperbody, 0.0F, 0.0F, 0.0F);
/*  63 */     this.head = new ModelRenderer(this, 40, 17);
/*  64 */     this.head.func_78789_a(-2.5F, 0.0F, -2.0F, 5, 4, 5);
/*  65 */     this.head.func_78793_a(0.0F, 12.0F, -2.0F);
/*  66 */     this.head.func_78787_b(64, 32);
/*  67 */     this.head.field_78809_i = true;
/*  68 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  69 */     this.nose = new ModelRenderer(this, 44, 9);
/*  70 */     this.nose.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 1);
/*  71 */     this.nose.func_78793_a(0.0F, 15.0F, -5.0F);
/*  72 */     this.nose.func_78787_b(64, 32);
/*  73 */     this.nose.field_78809_i = true;
/*  74 */     setRotation(this.nose, 0.0F, 0.0F, 0.0F);
/*  75 */     this.lear = new ModelRenderer(this, 54, 0);
/*  76 */     this.lear.func_78789_a(0.0F, -10.0F, -1.0F, 1, 10, 3);
/*  77 */     this.lear.func_78793_a(2.0F, 13.0F, -1.0F);
/*  78 */     this.lear.func_78787_b(64, 32);
/*  79 */     this.lear.field_78809_i = true;
/*  80 */     setRotation(this.lear, -0.2268928F, 0.0F, 0.0F);
/*  81 */     this.lpaw = new ModelRenderer(this, 6, 7);
/*  82 */     this.lpaw.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/*  83 */     this.lpaw.func_78793_a(0.5F, 19.0F, -4.0F);
/*  84 */     this.lpaw.func_78787_b(64, 32);
/*  85 */     this.lpaw.field_78809_i = true;
/*  86 */     setRotation(this.lpaw, 0.0F, 0.0F, 0.0F);
/*  87 */     this.rleg = new ModelRenderer(this, 21, 20);
/*  88 */     this.rleg.func_78789_a(0.0F, -2.0F, -2.0F, 1, 4, 5);
/*  89 */     this.rleg.func_78793_a(-4.0F, 21.0F, 1.0F);
/*  90 */     this.rleg.func_78787_b(64, 32);
/*  91 */     this.rleg.field_78809_i = true;
/*  92 */     setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
/*  93 */     this.rfoot = new ModelRenderer(this, 21, 30);
/*  94 */     this.rfoot.func_78789_a(-1.0F, 2.0F, -5.0F, 3, 1, 7);
/*  95 */     this.rfoot.func_78793_a(-4.0F, 21.0F, 1.0F);
/*  96 */     this.rfoot.func_78787_b(64, 32);
/*  97 */     this.rfoot.field_78809_i = true;
/*  98 */     setRotation(this.rfoot, 0.0F, 0.0F, 0.0F);
/*  99 */     this.rear = new ModelRenderer(this, 32, 0);
/* 100 */     this.rear.func_78789_a(0.0F, -10.0F, -1.0F, 1, 10, 3);
/* 101 */     this.rear.func_78793_a(-3.0F, 13.0F, -1.0F);
/* 102 */     this.rear.func_78787_b(64, 32);
/* 103 */     this.rear.field_78809_i = true;
/* 104 */     setRotation(this.rear, -0.418879F, 0.0F, 0.0F);
/* 105 */     this.rpaw = new ModelRenderer(this, 0, 7);
/* 106 */     this.rpaw.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 107 */     this.rpaw.func_78793_a(-1.5F, 19.0F, -4.0F);
/* 108 */     this.rpaw.func_78787_b(64, 32);
/* 109 */     this.rpaw.field_78809_i = true;
/* 110 */     setRotation(this.rpaw, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 116 */     EasterBunny e = (EasterBunny)entity;
/* 117 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 118 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 120 */     float newangle = 0.0F;
/* 121 */     float newangle2 = 0.0F;
/*     */     
/* 123 */     if (f1 > 0.1D) {
/* 124 */       newangle = MathHelper.func_76134_b(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/* 125 */       newangle2 = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F * f1;
/*     */     } else {
/* 127 */       newangle = 0.0F;
/* 128 */       newangle2 = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.01F;
/*     */     } 
/*     */     
/* 131 */     this.lfoot.field_78795_f = newangle;
/* 132 */     this.rfoot.field_78795_f = -newangle;
/*     */     
/* 134 */     this.lear.field_78795_f = -0.226F + newangle2;
/* 135 */     this.rear.field_78795_f = -0.418F - newangle2;
/*     */ 
/*     */     
/* 138 */     this.body.func_78785_a(f5);
/* 139 */     this.tail.func_78785_a(f5);
/* 140 */     this.lfoot.func_78785_a(f5);
/* 141 */     this.lleg.func_78785_a(f5);
/* 142 */     this.upperbody.func_78785_a(f5);
/* 143 */     this.head.func_78785_a(f5);
/* 144 */     this.nose.func_78785_a(f5);
/* 145 */     this.lear.func_78785_a(f5);
/* 146 */     this.lpaw.func_78785_a(f5);
/* 147 */     this.rleg.func_78785_a(f5);
/* 148 */     this.rfoot.func_78785_a(f5);
/* 149 */     this.rear.func_78785_a(f5);
/* 150 */     this.rpaw.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 156 */     model.field_78795_f = x;
/* 157 */     model.field_78796_g = y;
/* 158 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 163 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelEasterBunny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */