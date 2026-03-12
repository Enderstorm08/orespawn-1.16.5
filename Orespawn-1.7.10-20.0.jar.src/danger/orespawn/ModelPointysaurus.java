/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelPointysaurus
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer lfleg;
/*     */   
/*     */   ModelRenderer rfleg;
/*     */   
/*     */   ModelRenderer lrleg;
/*     */   ModelRenderer rrleg;
/*     */   ModelRenderer body1;
/*     */   ModelRenderer head;
/*     */   ModelRenderer body2;
/*     */   ModelRenderer body3;
/*     */   ModelRenderer guard;
/*     */   ModelRenderer nose;
/*     */   ModelRenderer lhorn;
/*     */   ModelRenderer rhorn;
/*     */   ModelRenderer chorn;
/*     */   ModelRenderer tail;
/*     */   ModelRenderer bump1;
/*     */   ModelRenderer bump2;
/*     */   ModelRenderer bump3;
/*     */   ModelRenderer bump4;
/*     */   ModelRenderer bump5;
/*     */   ModelRenderer bump6;
/*     */   ModelRenderer bump7;
/*     */   ModelRenderer bump8;
/*     */   ModelRenderer bump9;
/*     */   ModelRenderer bump10;
/*     */   ModelRenderer bump11;
/*     */   ModelRenderer bump12;
/*     */   ModelRenderer bump13;
/*     */   ModelRenderer bump14;
/*     */   ModelRenderer bump15;
/*     */   ModelRenderer bump16;
/*     */   
/*     */   public ModelPointysaurus(float f1) {
/*  47 */     this.wingspeed = f1;
/*     */     
/*  49 */     this.field_78090_t = 128;
/*  50 */     this.field_78089_u = 128;
/*     */     
/*  52 */     this.lfleg = new ModelRenderer(this, 102, 66);
/*  53 */     this.lfleg.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 8, 6);
/*  54 */     this.lfleg.func_78793_a(9.0F, 16.0F, -8.0F);
/*  55 */     this.lfleg.func_78787_b(128, 128);
/*  56 */     this.lfleg.field_78809_i = true;
/*  57 */     setRotation(this.lfleg, 0.0F, 0.0F, 0.0F);
/*  58 */     this.rfleg = new ModelRenderer(this, 102, 66);
/*  59 */     this.rfleg.func_78789_a(-3.0F, 0.0F, -3.0F, 6, 8, 6);
/*  60 */     this.rfleg.func_78793_a(-9.0F, 16.0F, -8.0F);
/*  61 */     this.rfleg.func_78787_b(128, 128);
/*  62 */     this.rfleg.field_78809_i = true;
/*  63 */     setRotation(this.rfleg, 0.0F, 0.0F, 0.0F);
/*  64 */     this.lrleg = new ModelRenderer(this, 0, 0);
/*  65 */     this.lrleg.func_78789_a(-4.0F, 0.0F, -4.0F, 8, 8, 8);
/*  66 */     this.lrleg.func_78793_a(9.0F, 16.0F, 12.0F);
/*  67 */     this.lrleg.func_78787_b(128, 128);
/*  68 */     this.lrleg.field_78809_i = true;
/*  69 */     setRotation(this.lrleg, 0.0F, 0.0F, 0.0F);
/*  70 */     this.rrleg = new ModelRenderer(this, 0, 0);
/*  71 */     this.rrleg.func_78789_a(-4.0F, 0.0F, -4.0F, 8, 8, 8);
/*  72 */     this.rrleg.func_78793_a(-9.0F, 16.0F, 12.0F);
/*  73 */     this.rrleg.func_78787_b(128, 128);
/*  74 */     this.rrleg.field_78809_i = true;
/*  75 */     setRotation(this.rrleg, 0.0F, 0.0F, 0.0F);
/*  76 */     this.body1 = new ModelRenderer(this, 0, 87);
/*  77 */     this.body1.func_78789_a(-4.0F, 0.0F, 0.0F, 22, 9, 30);
/*  78 */     this.body1.func_78793_a(-7.0F, 9.0F, -12.0F);
/*  79 */     this.body1.func_78787_b(128, 128);
/*  80 */     this.body1.field_78809_i = true;
/*  81 */     setRotation(this.body1, 0.0F, 0.0F, 0.0F);
/*  82 */     this.head = new ModelRenderer(this, 70, 0);
/*  83 */     this.head.func_78789_a(-6.0F, -10.0F, -12.0F, 12, 10, 12);
/*  84 */     this.head.func_78793_a(0.0F, 11.0F, -7.0F);
/*  85 */     this.head.func_78787_b(128, 128);
/*  86 */     this.head.field_78809_i = true;
/*  87 */     setRotation(this.head, -0.1919862F, 0.0F, 0.0F);
/*  88 */     this.body2 = new ModelRenderer(this, 0, 63);
/*  89 */     this.body2.func_78789_a(-9.0F, 0.0F, 0.0F, 18, 7, 15);
/*  90 */     this.body2.func_78793_a(0.0F, 2.0F, -9.0F);
/*  91 */     this.body2.func_78787_b(128, 128);
/*  92 */     this.body2.field_78809_i = true;
/*  93 */     setRotation(this.body2, 0.0F, 0.0F, 0.0F);
/*  94 */     this.body3 = new ModelRenderer(this, 0, 44);
/*  95 */     this.body3.func_78789_a(-8.0F, 0.0F, 0.0F, 16, 6, 11);
/*  96 */     this.body3.func_78793_a(0.0F, 3.0F, 6.0F);
/*  97 */     this.body3.func_78787_b(128, 128);
/*  98 */     this.body3.field_78809_i = true;
/*  99 */     setRotation(this.body3, 0.0F, 0.0F, 0.0F);
/* 100 */     this.guard = new ModelRenderer(this, 60, 34);
/* 101 */     this.guard.func_78789_a(-14.0F, -20.0F, -8.0F, 28, 23, 3);
/* 102 */     this.guard.func_78793_a(0.0F, 11.0F, -7.0F);
/* 103 */     this.guard.func_78787_b(128, 128);
/* 104 */     this.guard.field_78809_i = true;
/* 105 */     setRotation(this.guard, -0.2617994F, 0.0F, 0.0F);
/* 106 */     this.nose = new ModelRenderer(this, 39, 0);
/* 107 */     this.nose.func_78789_a(-5.0F, -9.0F, -15.0F, 10, 6, 5);
/* 108 */     this.nose.func_78793_a(0.0F, 11.0F, -7.0F);
/* 109 */     this.nose.func_78787_b(128, 128);
/* 110 */     this.nose.field_78809_i = true;
/* 111 */     setRotation(this.nose, 0.0F, 0.0F, 0.0F);
/* 112 */     this.lhorn = new ModelRenderer(this, 0, 18);
/* 113 */     this.lhorn.func_78789_a(8.0F, -16.0F, -29.0F, 2, 2, 23);
/* 114 */     this.lhorn.func_78793_a(0.0F, 11.0F, -7.0F);
/* 115 */     this.lhorn.func_78787_b(128, 128);
/* 116 */     this.lhorn.field_78809_i = true;
/* 117 */     setRotation(this.lhorn, -0.1570796F, -0.1396263F, 0.0F);
/* 118 */     this.rhorn = new ModelRenderer(this, 0, 18);
/* 119 */     this.rhorn.func_78789_a(-9.0F, -16.0F, -29.0F, 2, 2, 23);
/* 120 */     this.rhorn.func_78793_a(0.0F, 11.0F, -7.0F);
/* 121 */     this.rhorn.func_78787_b(128, 128);
/* 122 */     this.rhorn.field_78809_i = true;
/* 123 */     setRotation(this.rhorn, -0.1570796F, 0.1396263F, 0.0F);
/* 124 */     this.chorn = new ModelRenderer(this, 52, 13);
/* 125 */     this.chorn.func_78789_a(-1.5F, -9.0F, -20.0F, 3, 3, 5);
/* 126 */     this.chorn.func_78793_a(0.0F, 11.0F, -7.0F);
/* 127 */     this.chorn.func_78787_b(128, 128);
/* 128 */     this.chorn.field_78809_i = true;
/* 129 */     setRotation(this.chorn, 0.0F, 0.0F, 0.0F);
/* 130 */     this.tail = new ModelRenderer(this, 68, 70);
/* 131 */     this.tail.func_78789_a(-3.0F, -3.0F, 0.0F, 6, 6, 9);
/* 132 */     this.tail.func_78793_a(0.0F, 7.0F, 15.0F);
/* 133 */     this.tail.func_78787_b(128, 128);
/* 134 */     this.tail.field_78809_i = true;
/* 135 */     setRotation(this.tail, 0.2792527F, 0.0F, 0.0F);
/* 136 */     this.bump1 = new ModelRenderer(this, 57, 17);
/* 137 */     this.bump1.func_78789_a(14.0F, -20.0F, -8.0F, 2, 2, 2);
/* 138 */     this.bump1.func_78793_a(0.0F, 11.0F, -7.0F);
/* 139 */     this.bump1.func_78787_b(128, 128);
/* 140 */     this.bump1.field_78809_i = true;
/* 141 */     setRotation(this.bump1, -0.2617994F, 0.0F, 0.0F);
/* 142 */     this.bump2 = new ModelRenderer(this, 57, 17);
/* 143 */     this.bump2.func_78789_a(14.0F, -15.0F, -8.0F, 2, 2, 2);
/* 144 */     this.bump2.func_78793_a(0.0F, 11.0F, -7.0F);
/* 145 */     this.bump2.func_78787_b(128, 128);
/* 146 */     this.bump2.field_78809_i = true;
/* 147 */     setRotation(this.bump2, -0.2617994F, 0.0F, 0.0F);
/* 148 */     this.bump3 = new ModelRenderer(this, 57, 17);
/* 149 */     this.bump3.func_78789_a(14.0F, -10.0F, -8.0F, 2, 2, 2);
/* 150 */     this.bump3.func_78793_a(0.0F, 11.0F, -7.0F);
/* 151 */     this.bump3.func_78787_b(128, 128);
/* 152 */     this.bump3.field_78809_i = true;
/* 153 */     setRotation(this.bump3, -0.2617994F, 0.0F, 0.0F);
/* 154 */     this.bump4 = new ModelRenderer(this, 57, 17);
/* 155 */     this.bump4.func_78789_a(14.0F, -5.0F, -8.0F, 2, 2, 2);
/* 156 */     this.bump4.func_78793_a(0.0F, 11.0F, -7.0F);
/* 157 */     this.bump4.func_78787_b(128, 128);
/* 158 */     this.bump4.field_78809_i = true;
/* 159 */     setRotation(this.bump4, -0.2617994F, 0.0F, 0.0F);
/* 160 */     this.bump5 = new ModelRenderer(this, 57, 17);
/* 161 */     this.bump5.func_78789_a(14.0F, 0.0F, -8.0F, 2, 2, 2);
/* 162 */     this.bump5.func_78793_a(0.0F, 11.0F, -7.0F);
/* 163 */     this.bump5.func_78787_b(128, 128);
/* 164 */     this.bump5.field_78809_i = true;
/* 165 */     setRotation(this.bump5, -0.2617994F, 0.0F, 0.0F);
/* 166 */     this.bump6 = new ModelRenderer(this, 57, 17);
/* 167 */     this.bump6.func_78789_a(-16.0F, -20.0F, -8.0F, 2, 2, 2);
/* 168 */     this.bump6.func_78793_a(0.0F, 11.0F, -7.0F);
/* 169 */     this.bump6.func_78787_b(128, 128);
/* 170 */     this.bump6.field_78809_i = true;
/* 171 */     setRotation(this.bump6, -0.2617994F, 0.0F, 0.0F);
/* 172 */     this.bump7 = new ModelRenderer(this, 57, 17);
/* 173 */     this.bump7.func_78789_a(-16.0F, -15.0F, -8.0F, 2, 2, 2);
/* 174 */     this.bump7.func_78793_a(0.0F, 11.0F, -7.0F);
/* 175 */     this.bump7.func_78787_b(128, 128);
/* 176 */     this.bump7.field_78809_i = true;
/* 177 */     setRotation(this.bump7, -0.2617994F, 0.0F, 0.0F);
/* 178 */     this.bump8 = new ModelRenderer(this, 57, 17);
/* 179 */     this.bump8.func_78789_a(-16.0F, -10.0F, -8.0F, 2, 2, 2);
/* 180 */     this.bump8.func_78793_a(0.0F, 11.0F, -7.0F);
/* 181 */     this.bump8.func_78787_b(128, 128);
/* 182 */     this.bump8.field_78809_i = true;
/* 183 */     setRotation(this.bump8, -0.2617994F, 0.0F, 0.0F);
/* 184 */     this.bump9 = new ModelRenderer(this, 57, 17);
/* 185 */     this.bump9.func_78789_a(-16.0F, -5.0F, -8.0F, 2, 2, 2);
/* 186 */     this.bump9.func_78793_a(0.0F, 11.0F, -7.0F);
/* 187 */     this.bump9.func_78787_b(128, 128);
/* 188 */     this.bump9.field_78809_i = true;
/* 189 */     setRotation(this.bump9, -0.2617994F, 0.0F, 0.0F);
/* 190 */     this.bump10 = new ModelRenderer(this, 57, 17);
/* 191 */     this.bump10.func_78789_a(-16.0F, 0.0F, -8.0F, 2, 2, 2);
/* 192 */     this.bump10.func_78793_a(0.0F, 11.0F, -7.0F);
/* 193 */     this.bump10.func_78787_b(128, 128);
/* 194 */     this.bump10.field_78809_i = true;
/* 195 */     setRotation(this.bump10, -0.2617994F, 0.0F, 0.0F);
/* 196 */     this.bump11 = new ModelRenderer(this, 57, 17);
/* 197 */     this.bump11.func_78789_a(12.0F, -22.0F, -8.0F, 2, 2, 2);
/* 198 */     this.bump11.func_78793_a(0.0F, 11.0F, -7.0F);
/* 199 */     this.bump11.func_78787_b(128, 128);
/* 200 */     this.bump11.field_78809_i = true;
/* 201 */     setRotation(this.bump11, -0.2617994F, 0.0F, 0.0F);
/* 202 */     this.bump12 = new ModelRenderer(this, 57, 17);
/* 203 */     this.bump12.func_78789_a(7.0F, -22.0F, -8.0F, 2, 2, 2);
/* 204 */     this.bump12.func_78793_a(0.0F, 11.0F, -7.0F);
/* 205 */     this.bump12.func_78787_b(128, 128);
/* 206 */     this.bump12.field_78809_i = true;
/* 207 */     setRotation(this.bump12, -0.2617994F, 0.0F, 0.0F);
/* 208 */     this.bump13 = new ModelRenderer(this, 57, 17);
/* 209 */     this.bump13.func_78789_a(2.0F, -22.0F, -8.0F, 2, 2, 2);
/* 210 */     this.bump13.func_78793_a(0.0F, 11.0F, -7.0F);
/* 211 */     this.bump13.func_78787_b(128, 128);
/* 212 */     this.bump13.field_78809_i = true;
/* 213 */     setRotation(this.bump13, -0.2617994F, 0.0F, 0.0F);
/* 214 */     this.bump14 = new ModelRenderer(this, 57, 17);
/* 215 */     this.bump14.func_78789_a(-4.0F, -22.0F, -8.0F, 2, 2, 2);
/* 216 */     this.bump14.func_78793_a(0.0F, 11.0F, -7.0F);
/* 217 */     this.bump14.func_78787_b(128, 128);
/* 218 */     this.bump14.field_78809_i = true;
/* 219 */     setRotation(this.bump14, -0.2617994F, 0.0F, 0.0F);
/* 220 */     this.bump15 = new ModelRenderer(this, 57, 17);
/* 221 */     this.bump15.func_78789_a(-9.0F, -22.0F, -8.0F, 2, 2, 2);
/* 222 */     this.bump15.func_78793_a(0.0F, 11.0F, -7.0F);
/* 223 */     this.bump15.func_78787_b(128, 128);
/* 224 */     this.bump15.field_78809_i = true;
/* 225 */     setRotation(this.bump15, -0.2617994F, 0.0F, 0.0F);
/* 226 */     this.bump16 = new ModelRenderer(this, 57, 17);
/* 227 */     this.bump16.func_78789_a(-14.0F, -22.0F, -8.0F, 2, 2, 2);
/* 228 */     this.bump16.func_78793_a(0.0F, 11.0F, -7.0F);
/* 229 */     this.bump16.func_78787_b(128, 128);
/* 230 */     this.bump16.field_78809_i = true;
/* 231 */     setRotation(this.bump16, -0.2617994F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 237 */     Pointysaurus e = (Pointysaurus)entity;
/* 238 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 239 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 240 */     float newangle = 0.0F;
/*     */     
/* 242 */     if (f1 > 0.1D) {
/* 243 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 245 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 248 */     this.lfleg.field_78795_f = newangle;
/* 249 */     this.rrleg.field_78795_f = newangle;
/* 250 */     this.rfleg.field_78795_f = -newangle;
/* 251 */     this.lrleg.field_78795_f = -newangle;
/*     */     
/* 253 */     this.head.field_78796_g = (float)Math.toRadians(f3) * 0.45F;
/* 254 */     this.nose.field_78796_g = this.head.field_78796_g;
/* 255 */     this.chorn.field_78796_g = this.head.field_78796_g;
/* 256 */     this.head.field_78796_g -= 0.14F;
/* 257 */     this.head.field_78796_g += 0.14F;
/* 258 */     this.guard.field_78796_g = this.head.field_78796_g;
/* 259 */     this.bump1.field_78796_g = this.head.field_78796_g;
/* 260 */     this.bump2.field_78796_g = this.head.field_78796_g;
/* 261 */     this.bump3.field_78796_g = this.head.field_78796_g;
/* 262 */     this.bump4.field_78796_g = this.head.field_78796_g;
/* 263 */     this.bump5.field_78796_g = this.head.field_78796_g;
/* 264 */     this.bump6.field_78796_g = this.head.field_78796_g;
/* 265 */     this.bump7.field_78796_g = this.head.field_78796_g;
/* 266 */     this.bump8.field_78796_g = this.head.field_78796_g;
/* 267 */     this.bump9.field_78796_g = this.head.field_78796_g;
/* 268 */     this.bump10.field_78796_g = this.head.field_78796_g;
/* 269 */     this.bump11.field_78796_g = this.head.field_78796_g;
/* 270 */     this.bump12.field_78796_g = this.head.field_78796_g;
/* 271 */     this.bump13.field_78796_g = this.head.field_78796_g;
/* 272 */     this.bump14.field_78796_g = this.head.field_78796_g;
/* 273 */     this.bump15.field_78796_g = this.head.field_78796_g;
/* 274 */     this.bump16.field_78796_g = this.head.field_78796_g;
/*     */     
/* 276 */     this.head.field_78795_f = (float)Math.toRadians(f4) * 0.45F;
/* 277 */     this.nose.field_78795_f = this.head.field_78795_f;
/* 278 */     this.chorn.field_78795_f = this.head.field_78795_f;
/* 279 */     this.head.field_78795_f -= 0.16F;
/* 280 */     this.head.field_78795_f -= 0.16F;
/* 281 */     this.head.field_78795_f -= 0.262F;
/* 282 */     this.bump1.field_78795_f = this.guard.field_78795_f;
/* 283 */     this.bump2.field_78795_f = this.guard.field_78795_f;
/* 284 */     this.bump3.field_78795_f = this.guard.field_78795_f;
/* 285 */     this.bump4.field_78795_f = this.guard.field_78795_f;
/* 286 */     this.bump5.field_78795_f = this.guard.field_78795_f;
/* 287 */     this.bump6.field_78795_f = this.guard.field_78795_f;
/* 288 */     this.bump7.field_78795_f = this.guard.field_78795_f;
/* 289 */     this.bump8.field_78795_f = this.guard.field_78795_f;
/* 290 */     this.bump9.field_78795_f = this.guard.field_78795_f;
/* 291 */     this.bump10.field_78795_f = this.guard.field_78795_f;
/* 292 */     this.bump11.field_78795_f = this.guard.field_78795_f;
/* 293 */     this.bump12.field_78795_f = this.guard.field_78795_f;
/* 294 */     this.bump13.field_78795_f = this.guard.field_78795_f;
/* 295 */     this.bump14.field_78795_f = this.guard.field_78795_f;
/* 296 */     this.bump15.field_78795_f = this.guard.field_78795_f;
/* 297 */     this.bump16.field_78795_f = this.guard.field_78795_f;
/*     */     
/* 299 */     if (e.getAttacking() != 0) {
/* 300 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F;
/*     */     } else {
/* 302 */       newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.05F;
/*     */     } 
/* 304 */     this.tail.field_78796_g = newangle;
/*     */     
/* 306 */     newangle = MathHelper.func_76134_b(f2 * 0.02F * this.wingspeed) * 3.1415927F * 0.15F;
/* 307 */     this.tail.field_78795_f = newangle + 0.28F;
/*     */ 
/*     */     
/* 310 */     this.lfleg.func_78785_a(f5);
/* 311 */     this.rfleg.func_78785_a(f5);
/* 312 */     this.lrleg.func_78785_a(f5);
/* 313 */     this.rrleg.func_78785_a(f5);
/* 314 */     this.body1.func_78785_a(f5);
/* 315 */     this.head.func_78785_a(f5);
/* 316 */     this.body2.func_78785_a(f5);
/* 317 */     this.body3.func_78785_a(f5);
/* 318 */     this.guard.func_78785_a(f5);
/* 319 */     this.nose.func_78785_a(f5);
/* 320 */     this.lhorn.func_78785_a(f5);
/* 321 */     this.rhorn.func_78785_a(f5);
/* 322 */     this.chorn.func_78785_a(f5);
/* 323 */     this.tail.func_78785_a(f5);
/* 324 */     this.bump1.func_78785_a(f5);
/* 325 */     this.bump2.func_78785_a(f5);
/* 326 */     this.bump3.func_78785_a(f5);
/* 327 */     this.bump4.func_78785_a(f5);
/* 328 */     this.bump5.func_78785_a(f5);
/* 329 */     this.bump6.func_78785_a(f5);
/* 330 */     this.bump7.func_78785_a(f5);
/* 331 */     this.bump8.func_78785_a(f5);
/* 332 */     this.bump9.func_78785_a(f5);
/* 333 */     this.bump10.func_78785_a(f5);
/* 334 */     this.bump11.func_78785_a(f5);
/* 335 */     this.bump12.func_78785_a(f5);
/* 336 */     this.bump13.func_78785_a(f5);
/* 337 */     this.bump14.func_78785_a(f5);
/* 338 */     this.bump15.func_78785_a(f5);
/* 339 */     this.bump16.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 345 */     model.field_78795_f = x;
/* 346 */     model.field_78796_g = y;
/* 347 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 352 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelPointysaurus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */