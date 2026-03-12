/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelGammaMetroid
/*     */   extends ModelBase
/*     */ {
/*  14 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Shell3;
/*     */   ModelRenderer Shell4;
/*     */   ModelRenderer Head;
/*     */   ModelRenderer BeakUpper;
/*     */   ModelRenderer BeakLower;
/*     */   ModelRenderer LeftTusk;
/*     */   ModelRenderer MiddleTusk;
/*     */   ModelRenderer RightTusk;
/*     */   ModelRenderer LeftFrontUpperLeg;
/*     */   ModelRenderer LeftFrontLowerLeg;
/*     */   ModelRenderer LeftRearUpperLeg;
/*     */   ModelRenderer LeftRearLowerLeg;
/*     */   ModelRenderer RightFrontUpperLeg;
/*     */   ModelRenderer RightFrontLowerLeg;
/*     */   ModelRenderer RightRearUpperLeg;
/*     */   ModelRenderer RightRearLowerLeg;
/*     */   ModelRenderer Core;
/*     */   ModelRenderer Bellyinside;
/*     */   ModelRenderer Bellyoutside;
/*     */   ModelRenderer Shell1;
/*     */   ModelRenderer Shell2;
/*     */   
/*     */   public ModelGammaMetroid(float f1) {
/*  39 */     this.wingspeed = f1;
/*     */     
/*  41 */     this.field_78090_t = 256;
/*  42 */     this.field_78089_u = 64;
/*     */     
/*  44 */     this.Shell3 = new ModelRenderer(this, 128, 0);
/*  45 */     this.Shell3.func_78789_a(-6.0F, -6.0F, 0.0F, 12, 12, 7);
/*  46 */     this.Shell3.func_78793_a(0.0F, 7.0F, 10.0F);
/*  47 */     this.Shell3.func_78787_b(256, 64);
/*  48 */     this.Shell3.field_78809_i = true;
/*  49 */     setRotation(this.Shell3, -0.9599311F, 0.6283185F, 0.5235988F);
/*  50 */     this.Shell4 = new ModelRenderer(this, 48, 34);
/*  51 */     this.Shell4.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 8);
/*  52 */     this.Shell4.func_78793_a(-3.0F, 9.0F, 13.0F);
/*  53 */     this.Shell4.func_78787_b(256, 64);
/*  54 */     this.Shell4.field_78809_i = true;
/*  55 */     setRotation(this.Shell4, -0.2792527F, 0.0F, 0.0F);
/*  56 */     this.Head = new ModelRenderer(this, 48, 48);
/*  57 */     this.Head.func_78789_a(0.0F, 0.0F, 0.0F, 16, 8, 6);
/*  58 */     this.Head.func_78793_a(-8.0F, -1.0F, -11.0F);
/*  59 */     this.Head.func_78787_b(256, 64);
/*  60 */     this.Head.field_78809_i = true;
/*  61 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  62 */     this.BeakUpper = new ModelRenderer(this, 114, 44);
/*  63 */     this.BeakUpper.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 4, 6);
/*  64 */     this.BeakUpper.func_78793_a(0.0F, 5.0F, -11.0F);
/*  65 */     this.BeakUpper.func_78787_b(256, 64);
/*  66 */     this.BeakUpper.field_78809_i = true;
/*  67 */     setRotation(this.BeakUpper, 0.1047198F, 0.7853982F, 0.1047198F);
/*  68 */     this.BeakLower = new ModelRenderer(this, 120, 54);
/*  69 */     this.BeakLower.func_78789_a(-1.5F, 0.0F, -1.5F, 3, 6, 3);
/*  70 */     this.BeakLower.func_78793_a(0.0F, 9.0F, -12.0F);
/*  71 */     this.BeakLower.func_78787_b(256, 64);
/*  72 */     this.BeakLower.field_78809_i = true;
/*  73 */     setRotation(this.BeakLower, 0.1396263F, 0.7853982F, 0.1396263F);
/*  74 */     this.LeftTusk = new ModelRenderer(this, 76, 50);
/*  75 */     this.LeftTusk.func_78789_a(0.0F, 0.0F, -12.0F, 2, 2, 12);
/*  76 */     this.LeftTusk.func_78793_a(5.0F, 6.0F, -10.0F);
/*  77 */     this.LeftTusk.func_78787_b(256, 64);
/*  78 */     this.LeftTusk.field_78809_i = true;
/*  79 */     setRotation(this.LeftTusk, 0.1047198F, 0.0872665F, 0.0F);
/*  80 */     this.MiddleTusk = new ModelRenderer(this, 76, 50);
/*  81 */     this.MiddleTusk.func_78789_a(-1.0F, 0.0F, -12.0F, 2, 2, 12);
/*  82 */     this.MiddleTusk.func_78793_a(0.0F, -2.0F, -10.0F);
/*  83 */     this.MiddleTusk.func_78787_b(256, 64);
/*  84 */     this.MiddleTusk.field_78809_i = true;
/*  85 */     setRotation(this.MiddleTusk, 0.122173F, 0.0F, 0.0F);
/*  86 */     this.RightTusk = new ModelRenderer(this, 76, 50);
/*  87 */     this.RightTusk.func_78789_a(-2.0F, 0.0F, -12.0F, 2, 2, 12);
/*  88 */     this.RightTusk.func_78793_a(-5.0F, 6.0F, -10.0F);
/*  89 */     this.RightTusk.func_78787_b(256, 64);
/*  90 */     this.RightTusk.field_78809_i = true;
/*  91 */     setRotation(this.RightTusk, 0.1047198F, -0.0872665F, 0.0F);
/*  92 */     this.LeftFrontUpperLeg = new ModelRenderer(this, 64, 0);
/*  93 */     this.LeftFrontUpperLeg.func_78789_a(0.0F, 0.0F, -1.5F, 3, 8, 3);
/*  94 */     this.LeftFrontUpperLeg.func_78793_a(8.0F, 8.0F, -2.0F);
/*  95 */     this.LeftFrontUpperLeg.func_78787_b(256, 64);
/*  96 */     this.LeftFrontUpperLeg.field_78809_i = true;
/*  97 */     setRotation(this.LeftFrontUpperLeg, -0.1745329F, 0.0F, -0.6632251F);
/*  98 */     this.LeftFrontLowerLeg = new ModelRenderer(this, 48, 0);
/*  99 */     this.LeftFrontLowerLeg.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 11, 2);
/* 100 */     this.LeftFrontLowerLeg.func_78793_a(14.0F, 13.0F, -3.5F);
/* 101 */     this.LeftFrontLowerLeg.func_78787_b(256, 64);
/* 102 */     this.LeftFrontLowerLeg.field_78809_i = true;
/* 103 */     setRotation(this.LeftFrontLowerLeg, -0.2617994F, 0.1396263F, 0.0F);
/* 104 */     this.LeftRearUpperLeg = new ModelRenderer(this, 64, 0);
/* 105 */     this.LeftRearUpperLeg.func_78789_a(-1.0F, 0.0F, -1.5F, 3, 8, 3);
/* 106 */     this.LeftRearUpperLeg.func_78793_a(8.0F, 9.0F, 7.0F);
/* 107 */     this.LeftRearUpperLeg.func_78787_b(256, 64);
/* 108 */     this.LeftRearUpperLeg.field_78809_i = true;
/* 109 */     setRotation(this.LeftRearUpperLeg, 0.1745329F, 0.0F, -0.8203047F);
/* 110 */     this.LeftRearLowerLeg = new ModelRenderer(this, 48, 0);
/* 111 */     this.LeftRearLowerLeg.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 11, 2);
/* 112 */     this.LeftRearLowerLeg.func_78793_a(14.0F, 14.0F, 8.5F);
/* 113 */     this.LeftRearLowerLeg.func_78787_b(256, 64);
/* 114 */     this.LeftRearLowerLeg.field_78809_i = true;
/* 115 */     setRotation(this.LeftRearLowerLeg, 0.3141593F, -0.1570796F, -0.2792527F);
/* 116 */     this.RightFrontUpperLeg = new ModelRenderer(this, 64, 0);
/* 117 */     this.RightFrontUpperLeg.func_78789_a(-3.0F, 0.0F, -1.5F, 3, 8, 3);
/* 118 */     this.RightFrontUpperLeg.func_78793_a(-8.0F, 8.0F, -2.0F);
/* 119 */     this.RightFrontUpperLeg.func_78787_b(256, 64);
/* 120 */     this.RightFrontUpperLeg.field_78809_i = true;
/* 121 */     setRotation(this.RightFrontUpperLeg, -0.1745329F, 0.0F, 0.6632251F);
/* 122 */     this.RightFrontLowerLeg = new ModelRenderer(this, 48, 0);
/* 123 */     this.RightFrontLowerLeg.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 11, 2);
/* 124 */     this.RightFrontLowerLeg.func_78793_a(-14.0F, 13.0F, -3.5F);
/* 125 */     this.RightFrontLowerLeg.func_78787_b(256, 64);
/* 126 */     this.RightFrontLowerLeg.field_78809_i = true;
/* 127 */     setRotation(this.RightFrontLowerLeg, -0.2617994F, -0.1396263F, 0.0F);
/* 128 */     this.RightRearUpperLeg = new ModelRenderer(this, 64, 0);
/* 129 */     this.RightRearUpperLeg.func_78789_a(-2.0F, 0.0F, -1.5F, 3, 8, 3);
/* 130 */     this.RightRearUpperLeg.func_78793_a(-8.0F, 9.0F, 7.0F);
/* 131 */     this.RightRearUpperLeg.func_78787_b(256, 64);
/* 132 */     this.RightRearUpperLeg.field_78809_i = true;
/* 133 */     setRotation(this.RightRearUpperLeg, 0.1745329F, 0.0F, 0.8203047F);
/* 134 */     this.RightRearLowerLeg = new ModelRenderer(this, 48, 0);
/* 135 */     this.RightRearLowerLeg.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 11, 2);
/* 136 */     this.RightRearLowerLeg.func_78793_a(-14.0F, 14.0F, 8.5F);
/* 137 */     this.RightRearLowerLeg.func_78787_b(256, 64);
/* 138 */     this.RightRearLowerLeg.field_78809_i = true;
/* 139 */     setRotation(this.RightRearLowerLeg, 0.3141593F, 0.1570796F, 0.2792527F);
/* 140 */     this.Core = new ModelRenderer(this, 82, 33);
/* 141 */     this.Core.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 6, 6);
/* 142 */     this.Core.func_78793_a(0.0F, 8.0F, 3.0F);
/* 143 */     this.Core.func_78787_b(256, 64);
/* 144 */     this.Core.field_78809_i = true;
/* 145 */     setRotation(this.Core, -0.122173F, 0.0F, 0.0F);
/* 146 */     this.Bellyinside = new ModelRenderer(this, 150, 3);
/* 147 */     this.Bellyinside.func_78789_a(-8.0F, -1.0F, -8.0F, 16, 1, 16);
/* 148 */     this.Bellyinside.func_78793_a(0.0F, 8.0F, 2.0F);
/* 149 */     this.Bellyinside.func_78787_b(256, 64);
/* 150 */     this.Bellyinside.field_78809_i = true;
/* 151 */     setRotation(this.Bellyinside, -0.122173F, 0.0F, 0.0F);
/* 152 */     this.Bellyoutside = new ModelRenderer(this, 0, 0);
/* 153 */     this.Bellyoutside.func_78789_a(-8.0F, -6.0F, -8.0F, 16, 14, 16);
/* 154 */     this.Bellyoutside.func_78793_a(0.0F, 8.0F, 2.0F);
/* 155 */     this.Bellyoutside.func_78787_b(256, 64);
/* 156 */     this.Bellyoutside.field_78809_i = true;
/* 157 */     setRotation(this.Bellyoutside, -0.122173F, 0.0F, 0.0F);
/* 158 */     this.Shell1 = new ModelRenderer(this, 64, 0);
/* 159 */     this.Shell1.func_78789_a(-10.0F, -10.0F, 2.0F, 19, 19, 12);
/* 160 */     this.Shell1.func_78793_a(0.0F, 4.0F, -7.0F);
/* 161 */     this.Shell1.func_78787_b(256, 64);
/* 162 */     this.Shell1.field_78809_i = true;
/* 163 */     setRotation(this.Shell1, 0.0F, 0.0F, 0.7853982F);
/* 164 */     this.Shell2 = new ModelRenderer(this, 0, 30);
/* 165 */     this.Shell2.func_78789_a(-9.0F, -9.0F, 0.0F, 16, 16, 8);
/* 166 */     this.Shell2.func_78793_a(0.0F, 4.5F, 5.0F);
/* 167 */     this.Shell2.func_78787_b(256, 64);
/* 168 */     this.Shell2.field_78809_i = true;
/* 169 */     setRotation(this.Shell2, -0.5235988F, 0.3665191F, 0.715585F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 176 */     GammaMetroid e = (GammaMetroid)entity;
/* 177 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 178 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 179 */     float newangle = 0.0F;
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
/* 197 */     newangle = MathHelper.func_76134_b(f2 * 0.81F * this.wingspeed) * 3.1415927F * 0.08F;
/* 198 */     this.LeftTusk.field_78795_f = newangle;
/* 199 */     newangle = MathHelper.func_76134_b(f2 * 0.87F * this.wingspeed) * 3.1415927F * 0.08F;
/* 200 */     this.RightTusk.field_78795_f = newangle;
/* 201 */     newangle = MathHelper.func_76134_b(f2 * 0.99F * this.wingspeed) * 3.1415927F * 0.08F;
/* 202 */     this.MiddleTusk.field_78795_f = newangle;
/* 203 */     newangle = MathHelper.func_76134_b(f2 * 1.11F * this.wingspeed) * 3.1415927F * 0.08F;
/* 204 */     this.LeftTusk.field_78796_g = newangle;
/* 205 */     newangle = MathHelper.func_76134_b(f2 * 1.17F * this.wingspeed) * 3.1415927F * 0.08F;
/* 206 */     this.RightTusk.field_78796_g = newangle;
/* 207 */     newangle = MathHelper.func_76134_b(f2 * 1.25F * this.wingspeed) * 3.1415927F * 0.08F;
/* 208 */     this.MiddleTusk.field_78796_g = newangle;
/*     */ 
/*     */     
/* 211 */     float nextangle = 0.0F;
/* 212 */     float upangle = 0.0F;
/* 213 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/* 214 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/* 215 */     upangle = 0.0F;
/* 216 */     if (nextangle > newangle) {
/* 217 */       upangle = 0.47F * f1 - Math.abs(newangle);
/*     */     }
/* 219 */     doLeftFLeg(this.LeftFrontUpperLeg, this.LeftFrontLowerLeg, newangle, upangle);
/* 220 */     doRightFLeg(this.RightFrontUpperLeg, this.RightFrontLowerLeg, -newangle, upangle);
/* 221 */     doLeftRLeg(this.LeftRearUpperLeg, this.LeftRearLowerLeg, -newangle, upangle);
/* 222 */     doRightRLeg(this.RightRearUpperLeg, this.RightRearLowerLeg, newangle, upangle);
/*     */ 
/*     */     
/* 225 */     newangle = MathHelper.func_76134_b(f2 * 0.4F * this.wingspeed) * 3.1415927F * 0.05F;
/* 226 */     if (e.func_70906_o()) newangle = 0.0F; 
/* 227 */     this.Shell1.field_78795_f = newangle / 4.0F;
/* 228 */     this.Shell1.field_78796_g = -(newangle / 4.0F);
/* 229 */     this.Shell2.field_78795_f = newangle - 0.49F;
/* 230 */     this.Shell2.field_78796_g = -newangle + 0.33F;
/* 231 */     this.Shell3.field_78795_f = newangle - 0.96F;
/* 232 */     this.Shell3.field_78796_g = -newangle + 0.63F;
/* 233 */     this.Shell4.field_78795_f = newangle - 0.28F;
/*     */ 
/*     */     
/* 236 */     newangle = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.1F;
/* 237 */     newangle = Math.abs(newangle);
/* 238 */     this.BeakLower.field_78795_f = newangle + 0.14F;
/* 239 */     this.BeakLower.field_78808_h = newangle + 0.14F;
/*     */ 
/*     */ 
/*     */     
/* 243 */     GL11.glEnable(2977);
/* 244 */     GL11.glEnable(3042);
/* 245 */     GL11.glBlendFunc(770, 771);
/*     */     
/* 247 */     this.Core.func_78785_a(f5);
/* 248 */     this.Shell3.func_78785_a(f5);
/* 249 */     this.Shell4.func_78785_a(f5);
/* 250 */     this.Head.func_78785_a(f5);
/* 251 */     this.BeakUpper.func_78785_a(f5);
/* 252 */     this.BeakLower.func_78785_a(f5);
/* 253 */     this.LeftTusk.func_78785_a(f5);
/* 254 */     this.MiddleTusk.func_78785_a(f5);
/* 255 */     this.RightTusk.func_78785_a(f5);
/* 256 */     this.LeftFrontUpperLeg.func_78785_a(f5);
/* 257 */     this.LeftFrontLowerLeg.func_78785_a(f5);
/* 258 */     this.LeftRearUpperLeg.func_78785_a(f5);
/* 259 */     this.LeftRearLowerLeg.func_78785_a(f5);
/* 260 */     this.RightFrontUpperLeg.func_78785_a(f5);
/* 261 */     this.RightFrontLowerLeg.func_78785_a(f5);
/* 262 */     this.RightRearUpperLeg.func_78785_a(f5);
/* 263 */     this.RightRearLowerLeg.func_78785_a(f5);
/* 264 */     this.Bellyinside.func_78785_a(f5);
/* 265 */     this.Shell1.func_78785_a(f5);
/* 266 */     this.Shell2.func_78785_a(f5);
/*     */ 
/*     */     
/* 269 */     this.Bellyoutside.func_78785_a(f5);
/*     */ 
/*     */     
/* 272 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 278 */     model.field_78795_f = x;
/* 279 */     model.field_78796_g = y;
/* 280 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 285 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void doLeftFLeg(ModelRenderer seg2, ModelRenderer seg3, float angle, float upangle) {
/* 294 */     seg2.field_78795_f = angle - 0.17F;
/* 295 */     seg3.field_78795_f = angle - 0.26F;
/*     */     
/* 297 */     seg3.field_78798_e = (float)(seg2.field_78798_e + Math.sin(seg2.field_78795_f) * 7.0D) - 0.5F;
/*     */ 
/*     */     
/* 300 */     seg2.field_78808_h = -upangle - 0.66F;
/* 301 */     seg3.field_78808_h = -upangle;
/* 302 */     seg2.field_78797_d += (float)(5.0D * Math.cos(seg2.field_78795_f));
/* 303 */     seg3.field_78800_c = (float)(seg2.field_78800_c + Math.abs(Math.sin(seg2.field_78808_h) * 7.0D) + 1.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void doLeftRLeg(ModelRenderer seg2, ModelRenderer seg3, float angle, float upangle) {
/* 309 */     seg2.field_78795_f = angle + 0.17F;
/* 310 */     seg3.field_78795_f = angle + 0.31F;
/*     */     
/* 312 */     seg3.field_78798_e = (float)(seg2.field_78798_e + Math.sin(seg2.field_78795_f) * 7.0D) - 0.5F;
/*     */ 
/*     */     
/* 315 */     seg2.field_78808_h = -upangle - 0.82F;
/* 316 */     seg3.field_78808_h = -upangle;
/* 317 */     seg2.field_78797_d += (float)(5.0D * Math.cos(seg2.field_78795_f));
/* 318 */     seg3.field_78800_c = (float)(seg2.field_78800_c + Math.abs(Math.sin(seg2.field_78808_h) * 7.0D) + 1.5D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void doRightFLeg(ModelRenderer seg2, ModelRenderer seg3, float angle, float upangle) {
/* 324 */     seg2.field_78795_f = angle - 0.17F;
/* 325 */     seg3.field_78795_f = angle - 0.26F;
/*     */     
/* 327 */     seg3.field_78798_e = (float)(seg2.field_78798_e + Math.sin(seg2.field_78795_f) * 7.0D) - 0.5F;
/*     */ 
/*     */     
/* 330 */     seg2.field_78808_h = -upangle + 0.34F;
/* 331 */     seg3.field_78808_h = -upangle;
/* 332 */     seg2.field_78797_d += (float)(5.0D * Math.cos(seg2.field_78795_f));
/* 333 */     seg3.field_78800_c = (float)(seg2.field_78800_c - Math.abs(Math.sin(seg2.field_78808_h) * 7.0D) - 1.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void doRightRLeg(ModelRenderer seg2, ModelRenderer seg3, float angle, float upangle) {
/* 340 */     seg2.field_78795_f = angle + 0.17F;
/* 341 */     seg3.field_78795_f = angle + 0.31F;
/*     */     
/* 343 */     seg3.field_78798_e = (float)(seg2.field_78798_e + Math.sin(seg2.field_78795_f) * 7.0D) - 0.5F;
/*     */ 
/*     */     
/* 346 */     seg2.field_78808_h = -upangle + 0.82F;
/* 347 */     seg3.field_78808_h = -upangle;
/* 348 */     seg2.field_78797_d += (float)(5.0D * Math.cos(seg2.field_78795_f));
/* 349 */     seg3.field_78800_c = (float)(seg2.field_78800_c - Math.abs(Math.sin(seg2.field_78808_h) * 7.0D) - 1.5D);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelGammaMetroid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */