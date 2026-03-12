/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelUrchin
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer if1;
/*     */   
/*     */   ModelRenderer if2;
/*     */   
/*     */   ModelRenderer if3;
/*     */   
/*     */   ModelRenderer if4;
/*     */   ModelRenderer of1;
/*     */   ModelRenderer of2;
/*     */   ModelRenderer of3;
/*     */   ModelRenderer of4;
/*     */   ModelRenderer center;
/*     */   ModelRenderer tis1;
/*     */   ModelRenderer tis2;
/*     */   ModelRenderer tis3;
/*     */   ModelRenderer tis4;
/*     */   ModelRenderer tos1;
/*     */   ModelRenderer tos2;
/*     */   ModelRenderer tos3;
/*     */   ModelRenderer tos4;
/*     */   
/*     */   public ModelUrchin(float f1) {
/*  34 */     this.wingspeed = f1;
/*     */     
/*  36 */     this.field_78090_t = 128;
/*  37 */     this.field_78089_u = 128;
/*     */     
/*  39 */     this.if1 = new ModelRenderer(this, 0, 35);
/*  40 */     this.if1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  41 */     this.if1.func_78793_a(0.0F, 16.0F, 0.0F);
/*  42 */     this.if1.func_78787_b(128, 128);
/*  43 */     this.if1.field_78809_i = true;
/*  44 */     setRotation(this.if1, 0.2617994F, 0.0F, 0.0F);
/*  45 */     this.if2 = new ModelRenderer(this, 5, 35);
/*  46 */     this.if2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  47 */     this.if2.func_78793_a(0.0F, 16.0F, 0.0F);
/*  48 */     this.if2.func_78787_b(128, 128);
/*  49 */     this.if2.field_78809_i = true;
/*  50 */     setRotation(this.if2, -0.2617994F, 0.0F, 0.0F);
/*  51 */     this.if3 = new ModelRenderer(this, 10, 35);
/*  52 */     this.if3.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  53 */     this.if3.func_78793_a(0.0F, 16.0F, 0.0F);
/*  54 */     this.if3.func_78787_b(128, 128);
/*  55 */     this.if3.field_78809_i = true;
/*  56 */     setRotation(this.if3, 0.0F, 0.0F, 0.2617994F);
/*  57 */     this.if4 = new ModelRenderer(this, 15, 35);
/*  58 */     this.if4.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  59 */     this.if4.func_78793_a(0.0F, 16.0F, 0.0F);
/*  60 */     this.if4.func_78787_b(128, 128);
/*  61 */     this.if4.field_78809_i = true;
/*  62 */     setRotation(this.if4, 0.0F, 0.0F, -0.2617994F);
/*  63 */     this.of1 = new ModelRenderer(this, 0, 45);
/*  64 */     this.of1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  65 */     this.of1.func_78793_a(2.0F, 16.0F, 0.0F);
/*  66 */     this.of1.func_78787_b(128, 128);
/*  67 */     this.of1.field_78809_i = true;
/*  68 */     setRotation(this.of1, 0.0F, 0.0F, -0.5235988F);
/*  69 */     this.of2 = new ModelRenderer(this, 5, 45);
/*  70 */     this.of2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  71 */     this.of2.func_78793_a(-2.0F, 16.0F, 0.0F);
/*  72 */     this.of2.func_78787_b(128, 128);
/*  73 */     this.of2.field_78809_i = true;
/*  74 */     setRotation(this.of2, 0.0F, 0.0F, 0.5235988F);
/*  75 */     this.of3 = new ModelRenderer(this, 10, 45);
/*  76 */     this.of3.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  77 */     this.of3.func_78793_a(0.0F, 16.0F, -2.0F);
/*  78 */     this.of3.func_78787_b(128, 128);
/*  79 */     this.of3.field_78809_i = true;
/*  80 */     setRotation(this.of3, -0.5235988F, 0.0F, 0.0F);
/*  81 */     this.of4 = new ModelRenderer(this, 15, 45);
/*  82 */     this.of4.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/*  83 */     this.of4.func_78793_a(0.0F, 16.0F, 2.0F);
/*  84 */     this.of4.func_78787_b(128, 128);
/*  85 */     this.of4.field_78809_i = true;
/*  86 */     setRotation(this.of4, 0.5235988F, 0.0F, 0.0F);
/*  87 */     this.center = new ModelRenderer(this, 0, 0);
/*  88 */     this.center.func_78789_a(0.0F, -30.0F, 0.0F, 1, 30, 1);
/*  89 */     this.center.func_78793_a(0.0F, 16.0F, 0.0F);
/*  90 */     this.center.func_78787_b(128, 128);
/*  91 */     this.center.field_78809_i = true;
/*  92 */     setRotation(this.center, 0.0F, 0.0F, 0.0F);
/*  93 */     this.tis1 = new ModelRenderer(this, 25, 0);
/*  94 */     this.tis1.func_78789_a(0.0F, -25.0F, 0.0F, 1, 25, 1);
/*  95 */     this.tis1.func_78793_a(0.0F, 16.0F, 0.0F);
/*  96 */     this.tis1.func_78787_b(128, 128);
/*  97 */     this.tis1.field_78809_i = true;
/*  98 */     setRotation(this.tis1, 0.2617994F, 0.0F, 0.0F);
/*  99 */     this.tis2 = new ModelRenderer(this, 30, 0);
/* 100 */     this.tis2.func_78789_a(0.0F, -25.0F, 0.0F, 1, 25, 1);
/* 101 */     this.tis2.func_78793_a(0.0F, 16.0F, 0.0F);
/* 102 */     this.tis2.func_78787_b(128, 128);
/* 103 */     this.tis2.field_78809_i = true;
/* 104 */     setRotation(this.tis2, -0.2617994F, 0.0F, 0.0F);
/* 105 */     this.tis3 = new ModelRenderer(this, 35, 0);
/* 106 */     this.tis3.func_78789_a(0.0F, -25.0F, 0.0F, 1, 25, 1);
/* 107 */     this.tis3.func_78793_a(0.0F, 16.0F, 0.0F);
/* 108 */     this.tis3.func_78787_b(128, 128);
/* 109 */     this.tis3.field_78809_i = true;
/* 110 */     setRotation(this.tis3, 0.0F, 0.0F, 0.2617994F);
/* 111 */     this.tis4 = new ModelRenderer(this, 40, 0);
/* 112 */     this.tis4.func_78789_a(0.0F, -25.0F, 0.0F, 1, 25, 1);
/* 113 */     this.tis4.func_78793_a(0.0F, 16.0F, 0.0F);
/* 114 */     this.tis4.func_78787_b(128, 128);
/* 115 */     this.tis4.field_78809_i = true;
/* 116 */     setRotation(this.tis4, 0.0F, 0.0F, -0.2617994F);
/* 117 */     this.tos1 = new ModelRenderer(this, 5, 0);
/* 118 */     this.tos1.func_78789_a(0.0F, -20.0F, 0.0F, 1, 20, 1);
/* 119 */     this.tos1.func_78793_a(0.0F, 16.0F, 2.0F);
/* 120 */     this.tos1.func_78787_b(128, 128);
/* 121 */     this.tos1.field_78809_i = true;
/* 122 */     setRotation(this.tos1, -0.5235988F, 0.0F, 0.0F);
/* 123 */     this.tos2 = new ModelRenderer(this, 10, 0);
/* 124 */     this.tos2.func_78789_a(-2.0F, -20.0F, 0.0F, 1, 20, 1);
/* 125 */     this.tos2.func_78793_a(0.0F, 16.0F, 0.0F);
/* 126 */     this.tos2.func_78787_b(128, 128);
/* 127 */     this.tos2.field_78809_i = true;
/* 128 */     setRotation(this.tos2, 0.0F, 0.0F, -0.5235988F);
/* 129 */     this.tos3 = new ModelRenderer(this, 15, 0);
/* 130 */     this.tos3.func_78789_a(0.0F, -20.0F, 0.0F, 1, 20, 1);
/* 131 */     this.tos3.func_78793_a(2.0F, 16.0F, 0.0F);
/* 132 */     this.tos3.func_78787_b(128, 128);
/* 133 */     this.tos3.field_78809_i = true;
/* 134 */     setRotation(this.tos3, 0.0F, 0.0F, 0.5235988F);
/* 135 */     this.tos4 = new ModelRenderer(this, 20, 0);
/* 136 */     this.tos4.func_78789_a(0.0F, -20.0F, 0.0F, 1, 20, 1);
/* 137 */     this.tos4.func_78793_a(0.0F, 16.0F, -2.0F);
/* 138 */     this.tos4.func_78787_b(128, 128);
/* 139 */     this.tos4.field_78809_i = true;
/* 140 */     setRotation(this.tos4, 0.5235988F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*     */     float newangle, newangle1, newangle2, newangle3, newangle4, newangle5, newangle6, newangle7, newangle8;
/* 148 */     Urchin u = (Urchin)entity;
/* 149 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 150 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     if (f1 > 0.1D) {
/* 156 */       newangle = MathHelper.func_76134_b(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/* 157 */       newangle1 = MathHelper.func_76134_b(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/* 158 */       newangle2 = MathHelper.func_76134_b(f2 * 1.65F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/* 159 */       newangle3 = MathHelper.func_76134_b(f2 * 1.75F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/* 160 */       newangle4 = MathHelper.func_76134_b(f2 * 1.8F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/*     */     } else {
/* 162 */       newangle = 0.0F;
/* 163 */       newangle1 = 0.0F;
/* 164 */       newangle2 = 0.0F;
/* 165 */       newangle3 = 0.0F;
/* 166 */       newangle4 = 0.0F;
/*     */     } 
/*     */     
/* 169 */     this.if1.field_78795_f = 0.261F + newangle1;
/* 170 */     this.if2.field_78795_f = -0.261F - newangle2;
/* 171 */     this.if3.field_78795_f = newangle3;
/* 172 */     this.if4.field_78795_f = -newangle4;
/*     */     
/* 174 */     this.of1.field_78808_h = -0.523F + newangle;
/* 175 */     this.of2.field_78808_h = 0.523F - newangle;
/* 176 */     this.of3.field_78795_f = -0.523F + newangle;
/* 177 */     this.of4.field_78795_f = 0.523F - newangle;
/*     */     
/* 179 */     if (u.getAttacking() != 0) {
/* 180 */       newangle = (float)((f2 * 0.2F) % 6.283185307179586D);
/* 181 */       newangle1 = MathHelper.func_76134_b(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.06F;
/* 182 */       newangle2 = MathHelper.func_76134_b(f2 * 0.65F * this.wingspeed) * 3.1415927F * 0.06F;
/* 183 */       newangle3 = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.06F;
/* 184 */       newangle4 = MathHelper.func_76134_b(f2 * 0.8F * this.wingspeed) * 3.1415927F * 0.06F;
/* 185 */       newangle5 = MathHelper.func_76134_b(f2 * 0.55F * this.wingspeed) * 3.1415927F * 0.06F;
/* 186 */       newangle6 = MathHelper.func_76134_b(f2 * 0.45F * this.wingspeed) * 3.1415927F * 0.06F;
/* 187 */       newangle7 = MathHelper.func_76134_b(f2 * 0.35F * this.wingspeed) * 3.1415927F * 0.06F;
/* 188 */       newangle8 = MathHelper.func_76134_b(f2 * 0.4F * this.wingspeed) * 3.1415927F * 0.06F;
/*     */     } else {
/* 190 */       newangle = (float)((f2 * 0.02F) % 6.283185307179586D);
/* 191 */       newangle1 = MathHelper.func_76134_b(f2 * 0.07F * this.wingspeed) * 3.1415927F * 0.02F;
/* 192 */       newangle2 = MathHelper.func_76134_b(f2 * 0.065F * this.wingspeed) * 3.1415927F * 0.02F;
/* 193 */       newangle3 = MathHelper.func_76134_b(f2 * 0.075F * this.wingspeed) * 3.1415927F * 0.02F;
/* 194 */       newangle4 = MathHelper.func_76134_b(f2 * 0.08F * this.wingspeed) * 3.1415927F * 0.02F;
/* 195 */       newangle5 = MathHelper.func_76134_b(f2 * 0.055F * this.wingspeed) * 3.1415927F * 0.02F;
/* 196 */       newangle6 = MathHelper.func_76134_b(f2 * 0.045F * this.wingspeed) * 3.1415927F * 0.02F;
/* 197 */       newangle7 = MathHelper.func_76134_b(f2 * 0.035F * this.wingspeed) * 3.1415927F * 0.02F;
/* 198 */       newangle8 = MathHelper.func_76134_b(f2 * 0.04F * this.wingspeed) * 3.1415927F * 0.02F;
/*     */     } 
/* 200 */     this.center.field_78796_g = newangle;
/*     */     
/* 202 */     this.tis1.field_78795_f = 0.261F + newangle1;
/* 203 */     this.tis2.field_78795_f = -0.261F + newangle2;
/* 204 */     this.tis3.field_78795_f = newangle3;
/* 205 */     this.tis4.field_78795_f = newangle4;
/* 206 */     this.tis1.field_78808_h = newangle5;
/* 207 */     this.tis2.field_78808_h = newangle6;
/* 208 */     this.tis3.field_78808_h = 0.261F + newangle7;
/* 209 */     this.tis4.field_78808_h = -0.261F + newangle8;
/*     */ 
/*     */     
/* 212 */     this.tos1.field_78795_f = -0.532F + newangle1;
/* 213 */     this.tos2.field_78795_f = newangle7;
/* 214 */     this.tos3.field_78795_f = newangle3;
/* 215 */     this.tos4.field_78795_f = 0.532F + newangle5;
/* 216 */     this.tos1.field_78808_h = newangle4;
/* 217 */     this.tos2.field_78808_h = -0.523F + newangle6;
/* 218 */     this.tos3.field_78808_h = 0.523F + newangle2;
/* 219 */     this.tos4.field_78808_h = newangle8;
/*     */     
/* 221 */     this.if1.func_78785_a(f5);
/* 222 */     this.if2.func_78785_a(f5);
/* 223 */     this.if3.func_78785_a(f5);
/* 224 */     this.if4.func_78785_a(f5);
/* 225 */     this.of1.func_78785_a(f5);
/* 226 */     this.of2.func_78785_a(f5);
/* 227 */     this.of3.func_78785_a(f5);
/* 228 */     this.of4.func_78785_a(f5);
/* 229 */     this.center.func_78785_a(f5);
/* 230 */     this.tis1.func_78785_a(f5);
/* 231 */     this.tis2.func_78785_a(f5);
/* 232 */     this.tis3.func_78785_a(f5);
/* 233 */     this.tis4.func_78785_a(f5);
/* 234 */     this.tos1.func_78785_a(f5);
/* 235 */     this.tos2.func_78785_a(f5);
/* 236 */     this.tos3.func_78785_a(f5);
/* 237 */     this.tos4.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 243 */     model.field_78795_f = x;
/* 244 */     model.field_78796_g = y;
/* 245 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 250 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelUrchin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */