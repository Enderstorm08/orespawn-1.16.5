/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelIrukandji
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer t11;
/*     */   ModelRenderer t12;
/*     */   ModelRenderer t21;
/*     */   ModelRenderer t22;
/*     */   ModelRenderer t31;
/*     */   ModelRenderer t32;
/*     */   ModelRenderer t41;
/*     */   ModelRenderer t42;
/*     */   
/*     */   public ModelIrukandji(float f1) {
/*  25 */     this.wingspeed = f1;
/*     */     
/*  27 */     this.field_78090_t = 64;
/*  28 */     this.field_78089_u = 32;
/*     */     
/*  30 */     this.body = new ModelRenderer(this, 0, 9);
/*  31 */     this.body.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 4, 4);
/*  32 */     this.body.func_78793_a(0.0F, 6.0F, 0.0F);
/*  33 */     this.body.func_78787_b(64, 32);
/*  34 */     this.body.field_78809_i = true;
/*  35 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  36 */     this.t11 = new ModelRenderer(this, 25, 0);
/*  37 */     this.t11.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  38 */     this.t11.func_78793_a(1.0F, 10.0F, -2.0F);
/*  39 */     this.t11.func_78787_b(64, 32);
/*  40 */     this.t11.field_78809_i = true;
/*  41 */     setRotation(this.t11, 0.0F, 0.0F, 0.0F);
/*  42 */     this.t12 = new ModelRenderer(this, 5, 0);
/*  43 */     this.t12.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  44 */     this.t12.func_78793_a(1.0F, 17.0F, -2.0F);
/*  45 */     this.t12.func_78787_b(64, 32);
/*  46 */     this.t12.field_78809_i = true;
/*  47 */     setRotation(this.t12, 0.0F, 0.0F, 0.0F);
/*  48 */     this.t21 = new ModelRenderer(this, 0, 0);
/*  49 */     this.t21.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  50 */     this.t21.func_78793_a(-2.0F, 10.0F, -2.0F);
/*  51 */     this.t21.func_78787_b(64, 32);
/*  52 */     this.t21.field_78809_i = true;
/*  53 */     setRotation(this.t21, 0.0F, 0.0F, 0.0F);
/*  54 */     this.t22 = new ModelRenderer(this, 20, 0);
/*  55 */     this.t22.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  56 */     this.t22.func_78793_a(-2.0F, 17.0F, -2.0F);
/*  57 */     this.t22.func_78787_b(64, 32);
/*  58 */     this.t22.field_78809_i = true;
/*  59 */     setRotation(this.t22, 0.0F, 0.0F, 0.0F);
/*  60 */     this.t31 = new ModelRenderer(this, 30, 0);
/*  61 */     this.t31.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  62 */     this.t31.func_78793_a(1.0F, 10.0F, 1.0F);
/*  63 */     this.t31.func_78787_b(64, 32);
/*  64 */     this.t31.field_78809_i = true;
/*  65 */     setRotation(this.t31, 0.0F, 0.0F, 0.0F);
/*  66 */     this.t32 = new ModelRenderer(this, 10, 0);
/*  67 */     this.t32.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  68 */     this.t32.func_78793_a(1.0F, 17.0F, 1.0F);
/*  69 */     this.t32.func_78787_b(64, 32);
/*  70 */     this.t32.field_78809_i = true;
/*  71 */     setRotation(this.t32, 0.0F, 0.0F, 0.0F);
/*  72 */     this.t41 = new ModelRenderer(this, 35, 0);
/*  73 */     this.t41.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  74 */     this.t41.func_78793_a(-2.0F, 10.0F, 1.0F);
/*  75 */     this.t41.func_78787_b(64, 32);
/*  76 */     this.t41.field_78809_i = true;
/*  77 */     setRotation(this.t41, 0.0F, 0.0F, 0.0F);
/*  78 */     this.t42 = new ModelRenderer(this, 15, 0);
/*  79 */     this.t42.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  80 */     this.t42.func_78793_a(-2.0F, 17.0F, 1.0F);
/*  81 */     this.t42.func_78787_b(64, 32);
/*  82 */     this.t42.field_78809_i = true;
/*  83 */     setRotation(this.t42, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  90 */     Irukandji e = (Irukandji)entity;
/*  91 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  92 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*  93 */     float newangle = 0.0F;
/*     */ 
/*     */     
/*  96 */     newangle = MathHelper.func_76134_b(f2 * 0.55F) * 3.1415927F * 0.15F;
/*  97 */     this.t11.field_78795_f = newangle;
/*  98 */     float d1 = (float)(Math.sin(newangle) * 7.0D);
/*  99 */     float d2 = (float)(Math.cos(newangle) * 7.0D);
/* 100 */     this.t11.field_78798_e += d1;
/* 101 */     newangle = MathHelper.func_76134_b(f2 * 0.35F) * 3.1415927F * 0.1F;
/* 102 */     this.t11.field_78808_h = newangle;
/* 103 */     float d3 = (float)(Math.cos(newangle) * d2);
/* 104 */     float d4 = (float)(Math.sin(newangle) * d2);
/* 105 */     this.t11.field_78800_c -= d4;
/* 106 */     this.t11.field_78797_d += d3;
/* 107 */     newangle = MathHelper.func_76134_b(f2 * 0.45F) * 3.1415927F * 0.15F;
/* 108 */     this.t12.field_78795_f = newangle;
/* 109 */     newangle = MathHelper.func_76134_b(f2 * 0.25F) * 3.1415927F * 0.1F;
/* 110 */     this.t12.field_78808_h = newangle;
/*     */ 
/*     */     
/* 113 */     newangle = MathHelper.func_76134_b(f2 * 0.65F) * 3.1415927F * 0.15F;
/* 114 */     this.t21.field_78795_f = newangle;
/* 115 */     d1 = (float)(Math.sin(newangle) * 7.0D);
/* 116 */     d2 = (float)(Math.cos(newangle) * 7.0D);
/* 117 */     this.t21.field_78798_e += d1;
/* 118 */     newangle = MathHelper.func_76134_b(f2 * 0.45F) * 3.1415927F * 0.1F;
/* 119 */     this.t21.field_78808_h = newangle;
/* 120 */     d3 = (float)(Math.cos(newangle) * d2);
/* 121 */     d4 = (float)(Math.sin(newangle) * d2);
/* 122 */     this.t21.field_78800_c -= d4;
/* 123 */     this.t21.field_78797_d += d3;
/* 124 */     newangle = MathHelper.func_76134_b(f2 * 0.55F) * 3.1415927F * 0.15F;
/* 125 */     this.t22.field_78795_f = newangle;
/* 126 */     newangle = MathHelper.func_76134_b(f2 * 0.35F) * 3.1415927F * 0.1F;
/* 127 */     this.t22.field_78808_h = newangle;
/*     */ 
/*     */     
/* 130 */     newangle = MathHelper.func_76134_b(f2 * 0.5F) * 3.1415927F * 0.15F;
/* 131 */     this.t31.field_78795_f = newangle;
/* 132 */     d1 = (float)(Math.sin(newangle) * 7.0D);
/* 133 */     d2 = (float)(Math.cos(newangle) * 7.0D);
/* 134 */     this.t31.field_78798_e += d1;
/* 135 */     newangle = MathHelper.func_76134_b(f2 * 0.3F) * 3.1415927F * 0.1F;
/* 136 */     this.t31.field_78808_h = newangle;
/* 137 */     d3 = (float)(Math.cos(newangle) * d2);
/* 138 */     d4 = (float)(Math.sin(newangle) * d2);
/* 139 */     this.t31.field_78800_c -= d4;
/* 140 */     this.t31.field_78797_d += d3;
/* 141 */     newangle = MathHelper.func_76134_b(f2 * 0.4F) * 3.1415927F * 0.15F;
/* 142 */     this.t32.field_78795_f = newangle;
/* 143 */     newangle = MathHelper.func_76134_b(f2 * 0.2F) * 3.1415927F * 0.1F;
/* 144 */     this.t32.field_78808_h = newangle;
/*     */ 
/*     */     
/* 147 */     newangle = MathHelper.func_76134_b(f2 * 0.57F) * 3.1415927F * 0.15F;
/* 148 */     this.t41.field_78795_f = newangle;
/* 149 */     d1 = (float)(Math.sin(newangle) * 7.0D);
/* 150 */     d2 = (float)(Math.cos(newangle) * 7.0D);
/* 151 */     this.t41.field_78798_e += d1;
/* 152 */     newangle = MathHelper.func_76134_b(f2 * 0.37F) * 3.1415927F * 0.1F;
/* 153 */     this.t41.field_78808_h = newangle;
/* 154 */     d3 = (float)(Math.cos(newangle) * d2);
/* 155 */     d4 = (float)(Math.sin(newangle) * d2);
/* 156 */     this.t41.field_78800_c -= d4;
/* 157 */     this.t41.field_78797_d += d3;
/* 158 */     newangle = MathHelper.func_76134_b(f2 * 0.48F) * 3.1415927F * 0.15F;
/* 159 */     this.t42.field_78795_f = newangle;
/* 160 */     newangle = MathHelper.func_76134_b(f2 * 0.29F) * 3.1415927F * 0.1F;
/* 161 */     this.t42.field_78808_h = newangle;
/*     */ 
/*     */     
/* 164 */     this.body.func_78785_a(f5);
/* 165 */     this.t11.func_78785_a(f5);
/* 166 */     this.t12.func_78785_a(f5);
/* 167 */     this.t21.func_78785_a(f5);
/* 168 */     this.t22.func_78785_a(f5);
/* 169 */     this.t31.func_78785_a(f5);
/* 170 */     this.t32.func_78785_a(f5);
/* 171 */     this.t41.func_78785_a(f5);
/* 172 */     this.t42.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 178 */     model.field_78795_f = x;
/* 179 */     model.field_78796_g = y;
/* 180 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 185 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelIrukandji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */