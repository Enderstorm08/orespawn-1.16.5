/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelDragon
/*     */   extends ModelBase
/*     */ {
/*  14 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer horn1;
/*     */   
/*     */   ModelRenderer horn2;
/*     */   ModelRenderer tail6;
/*     */   ModelRenderer wing15;
/*     */   ModelRenderer spike1;
/*     */   ModelRenderer spike2;
/*     */   ModelRenderer spike3;
/*     */   ModelRenderer spike4;
/*     */   ModelRenderer wing14;
/*     */   ModelRenderer spike5;
/*     */   ModelRenderer spike6;
/*     */   ModelRenderer spike7;
/*     */   ModelRenderer spike8;
/*     */   ModelRenderer spike9;
/*     */   ModelRenderer spike10;
/*     */   ModelRenderer head;
/*     */   ModelRenderer body;
/*     */   ModelRenderer leg1;
/*     */   ModelRenderer leg2;
/*     */   ModelRenderer leg3;
/*     */   ModelRenderer leg4;
/*     */   ModelRenderer body2;
/*     */   ModelRenderer neck1;
/*     */   ModelRenderer body3;
/*     */   ModelRenderer neck2;
/*     */   ModelRenderer neck3;
/*     */   ModelRenderer leg5;
/*     */   ModelRenderer leg6;
/*     */   ModelRenderer leg7;
/*     */   ModelRenderer leg9;
/*     */   ModelRenderer foot1;
/*     */   ModelRenderer foot2;
/*     */   ModelRenderer leg10;
/*     */   ModelRenderer leg11;
/*     */   ModelRenderer foot3;
/*     */   ModelRenderer foot4;
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer tail3;
/*     */   ModelRenderer mouth1;
/*     */   ModelRenderer mouth2;
/*     */   ModelRenderer tail5;
/*     */   ModelRenderer wing1;
/*     */   ModelRenderer wing2;
/*     */   ModelRenderer wing3;
/*     */   ModelRenderer wing4;
/*     */   ModelRenderer wing5;
/*     */   ModelRenderer wing6;
/*     */   ModelRenderer wing7;
/*     */   ModelRenderer wing8;
/*     */   ModelRenderer wing9;
/*     */   ModelRenderer wing10;
/*     */   ModelRenderer wing11;
/*     */   ModelRenderer wing12;
/*     */   ModelRenderer tail4;
/*     */   
/*     */   public ModelDragon(float f1) {
/*  74 */     this.wingspeed = f1;
/*     */     
/*  76 */     this.field_78090_t = 256;
/*  77 */     this.field_78089_u = 128;
/*     */     
/*  79 */     this.horn1 = new ModelRenderer(this, 0, 39);
/*  80 */     this.horn1.func_78789_a(2.0F, -4.0F, 1.0F, 2, 2, 6);
/*  81 */     this.horn1.func_78793_a(0.0F, 6.0F, -23.0F);
/*  82 */     this.horn1.func_78787_b(256, 128);
/*  83 */     this.horn1.field_78809_i = true;
/*  84 */     setRotation(this.horn1, 0.4089647F, 0.2602503F, 0.0F);
/*  85 */     this.horn2 = new ModelRenderer(this, 0, 39);
/*  86 */     this.horn2.func_78789_a(-4.0F, -4.0F, 1.0F, 2, 2, 6);
/*  87 */     this.horn2.func_78793_a(0.0F, 6.0F, -23.0F);
/*  88 */     this.horn2.func_78787_b(256, 128);
/*  89 */     this.horn2.field_78809_i = true;
/*  90 */     setRotation(this.horn2, 0.4089647F, -0.2602503F, 0.0F);
/*  91 */     this.tail6 = new ModelRenderer(this, 0, 49);
/*  92 */     this.tail6.func_78789_a(-1.0F, 0.0F, -2.0F, 2, 6, 4);
/*  93 */     this.tail6.func_78793_a(0.0F, 7.0F, 43.0F);
/*  94 */     this.tail6.func_78787_b(256, 128);
/*  95 */     this.tail6.field_78809_i = true;
/*  96 */     setRotation(this.tail6, 1.570796F, 0.0F, 0.0F);
/*  97 */     this.wing15 = new ModelRenderer(this, 0, 62);
/*  98 */     this.wing15.func_78789_a(1.0F, -1.0F, 1.0F, 12, 1, 8);
/*  99 */     this.wing15.func_78793_a(4.0F, 3.0F, -5.0F);
/* 100 */     this.wing15.func_78787_b(256, 128);
/* 101 */     this.wing15.field_78809_i = true;
/* 102 */     setRotation(this.wing15, -0.0743572F, -0.4089594F, 0.0F);
/* 103 */     this.spike1 = new ModelRenderer(this, 0, 73);
/* 104 */     this.spike1.func_78789_a(-1.0F, -3.0F, -5.0F, 2, 2, 4);
/* 105 */     this.spike1.func_78793_a(0.0F, 6.0F, -17.0F);
/* 106 */     this.spike1.func_78787_b(256, 128);
/* 107 */     this.spike1.field_78809_i = true;
/* 108 */     setRotation(this.spike1, 0.0F, 0.0F, 0.0F);
/* 109 */     this.spike2 = new ModelRenderer(this, 0, 73);
/* 110 */     this.spike2.func_78789_a(-1.0F, -3.0F, -5.0F, 2, 2, 4);
/* 111 */     this.spike2.func_78793_a(0.0F, 6.0F, -11.0F);
/* 112 */     this.spike2.func_78787_b(256, 128);
/* 113 */     this.spike2.field_78809_i = true;
/* 114 */     setRotation(this.spike2, 0.0F, 0.0F, 0.0F);
/* 115 */     this.spike3 = new ModelRenderer(this, 0, 73);
/* 116 */     this.spike3.func_78789_a(-1.0F, -4.0F, 1.0F, 2, 2, 4);
/* 117 */     this.spike3.func_78793_a(0.0F, 7.0F, 25.0F);
/* 118 */     this.spike3.func_78787_b(256, 128);
/* 119 */     this.spike3.field_78809_i = true;
/* 120 */     setRotation(this.spike3, 0.0F, 0.0F, 0.0F);
/* 121 */     this.spike4 = new ModelRenderer(this, 0, 73);
/* 122 */     this.spike4.func_78789_a(-1.0F, -2.0F, 0.0F, 2, 2, 4);
/* 123 */     this.spike4.func_78793_a(0.0F, 3.0F, -7.0F);
/* 124 */     this.spike4.func_78787_b(256, 128);
/* 125 */     this.spike4.field_78809_i = true;
/* 126 */     setRotation(this.spike4, 0.0F, 0.0F, 0.0F);
/* 127 */     this.wing14 = new ModelRenderer(this, 0, 62);
/* 128 */     this.wing14.func_78789_a(-13.0F, -1.0F, 0.0F, 12, 1, 8);
/* 129 */     this.wing14.func_78793_a(-4.0F, 3.0F, -5.0F);
/* 130 */     this.wing14.func_78787_b(256, 128);
/* 131 */     this.wing14.field_78809_i = true;
/* 132 */     setRotation(this.wing14, -0.0698132F, 0.4089656F, 0.0F);
/* 133 */     this.spike5 = new ModelRenderer(this, 0, 73);
/* 134 */     this.spike5.func_78789_a(-1.0F, -2.0F, 0.0F, 2, 2, 4);
/* 135 */     this.spike5.func_78793_a(0.0F, 3.0F, -1.0F);
/* 136 */     this.spike5.func_78787_b(256, 128);
/* 137 */     this.spike5.field_78809_i = true;
/* 138 */     setRotation(this.spike5, 0.0F, 0.0F, 0.0F);
/* 139 */     this.spike6 = new ModelRenderer(this, 0, 73);
/* 140 */     this.spike6.func_78789_a(-1.0F, -2.0F, 0.0F, 2, 2, 4);
/* 141 */     this.spike6.func_78793_a(0.0F, 3.0F, 5.0F);
/* 142 */     this.spike6.func_78787_b(256, 128);
/* 143 */     this.spike6.field_78809_i = true;
/* 144 */     setRotation(this.spike6, 0.0F, 0.0F, 0.0F);
/* 145 */     this.spike7 = new ModelRenderer(this, 0, 73);
/* 146 */     this.spike7.func_78789_a(-1.0F, -4.0F, 1.0F, 2, 2, 4);
/* 147 */     this.spike7.func_78793_a(0.0F, 7.0F, 13.0F);
/* 148 */     this.spike7.func_78787_b(256, 128);
/* 149 */     this.spike7.field_78809_i = true;
/* 150 */     setRotation(this.spike7, 0.0F, 0.0F, 0.0F);
/* 151 */     this.spike8 = new ModelRenderer(this, 0, 73);
/* 152 */     this.spike8.func_78789_a(-1.0F, -2.0F, 1.0F, 2, 2, 4);
/* 153 */     this.spike8.func_78793_a(0.0F, 5.0F, 19.0F);
/* 154 */     this.spike8.func_78787_b(256, 128);
/* 155 */     this.spike8.field_78809_i = true;
/* 156 */     setRotation(this.spike8, 0.0F, 0.0F, 0.0F);
/* 157 */     this.spike9 = new ModelRenderer(this, 0, 73);
/* 158 */     this.spike9.func_78789_a(-1.0F, -4.0F, 1.0F, 2, 2, 4);
/* 159 */     this.spike9.func_78793_a(0.0F, 7.0F, 31.0F);
/* 160 */     this.spike9.func_78787_b(256, 128);
/* 161 */     this.spike9.field_78809_i = true;
/* 162 */     setRotation(this.spike9, 0.0F, 0.0F, 0.0F);
/* 163 */     this.spike10 = new ModelRenderer(this, 0, 73);
/* 164 */     this.spike10.func_78789_a(-1.0F, -4.0F, 2.0F, 2, 2, 4);
/* 165 */     this.spike10.func_78793_a(0.0F, 7.0F, 36.0F);
/* 166 */     this.spike10.func_78787_b(256, 128);
/* 167 */     this.spike10.field_78809_i = true;
/* 168 */     setRotation(this.spike10, 0.0F, 0.0F, 0.0F);
/* 169 */     this.head = new ModelRenderer(this, 0, 81);
/* 170 */     this.head.func_78789_a(-4.0F, -4.0F, -8.0F, 8, 8, 8);
/* 171 */     this.head.func_78793_a(0.0F, 6.0F, -23.0F);
/* 172 */     this.head.func_78787_b(256, 128);
/* 173 */     this.head.field_78809_i = true;
/* 174 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 175 */     this.body = new ModelRenderer(this, 1, 99);
/* 176 */     this.body.func_78789_a(-6.0F, -10.0F, -7.0F, 12, 18, 10);
/* 177 */     this.body.func_78793_a(0.0F, 5.0F, 2.0F);
/* 178 */     this.body.func_78787_b(256, 128);
/* 179 */     this.body.field_78809_i = true;
/* 180 */     setRotation(this.body, 1.570796F, 0.0F, 0.0F);
/* 181 */     this.leg1 = new ModelRenderer(this, 47, 112);
/* 182 */     this.leg1.func_78789_a(-4.0F, -1.0F, -2.0F, 4, 9, 5);
/* 183 */     this.leg1.func_78793_a(-4.0F, 11.0F, 8.0F);
/* 184 */     this.leg1.func_78787_b(256, 128);
/* 185 */     this.leg1.field_78809_i = true;
/* 186 */     setRotation(this.leg1, -0.6320364F, 0.0F, 0.0F);
/* 187 */     this.leg2 = new ModelRenderer(this, 47, 112);
/* 188 */     this.leg2.func_78789_a(1.0F, -1.0F, -2.0F, 4, 9, 5);
/* 189 */     this.leg2.func_78793_a(3.0F, 11.0F, 8.0F);
/* 190 */     this.leg2.func_78787_b(256, 128);
/* 191 */     this.leg2.field_78809_i = true;
/* 192 */     setRotation(this.leg2, -0.6320364F, 0.0F, 0.0F);
/* 193 */     this.leg3 = new ModelRenderer(this, 18, 47);
/* 194 */     this.leg3.func_78789_a(-3.0F, -2.0F, -2.0F, 4, 9, 4);
/* 195 */     this.leg3.func_78793_a(-4.0F, 11.0F, -5.0F);
/* 196 */     this.leg3.func_78787_b(256, 128);
/* 197 */     this.leg3.field_78809_i = true;
/* 198 */     setRotation(this.leg3, 0.5576792F, 0.0F, 0.0F);
/* 199 */     this.leg4 = new ModelRenderer(this, 18, 47);
/* 200 */     this.leg4.func_78789_a(0.0F, -2.0F, -2.0F, 4, 9, 4);
/* 201 */     this.leg4.func_78793_a(3.0F, 11.0F, -5.0F);
/* 202 */     this.leg4.func_78787_b(256, 128);
/* 203 */     this.leg4.field_78809_i = true;
/* 204 */     setRotation(this.leg4, 0.5576792F, 0.0F, 0.0F);
/* 205 */     this.body2 = new ModelRenderer(this, 68, 94);
/* 206 */     this.body2.func_78789_a(-5.0F, 0.0F, 0.0F, 10, 22, 10);
/* 207 */     this.body2.func_78793_a(0.0F, 12.0F, -10.0F);
/* 208 */     this.body2.func_78787_b(256, 128);
/* 209 */     this.body2.field_78809_i = true;
/* 210 */     setRotation(this.body2, 1.570796F, 0.0F, 0.0F);
/* 211 */     this.neck1 = new ModelRenderer(this, 43, 85);
/* 212 */     this.neck1.func_78789_a(-3.0F, -3.0F, 0.0F, 6, 6, 6);
/* 213 */     this.neck1.func_78793_a(0.0F, 7.0F, 25.0F);
/* 214 */     this.neck1.func_78787_b(256, 128);
/* 215 */     this.neck1.field_78809_i = true;
/* 216 */     setRotation(this.neck1, 0.0F, 0.0F, 0.0F);
/* 217 */     this.body3 = new ModelRenderer(this, 70, 59);
/* 218 */     this.body3.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 24, 8);
/* 219 */     this.body3.func_78793_a(0.0F, 11.0F, -11.0F);
/* 220 */     this.body3.func_78787_b(256, 128);
/* 221 */     this.body3.field_78809_i = true;
/* 222 */     setRotation(this.body3, 1.570796F, 0.0F, 0.0F);
/* 223 */     this.neck2 = new ModelRenderer(this, 43, 85);
/* 224 */     this.neck2.func_78789_a(-3.0F, -2.0F, -6.0F, 6, 6, 6);
/* 225 */     this.neck2.func_78793_a(0.0F, 6.0F, -11.0F);
/* 226 */     this.neck2.func_78787_b(256, 128);
/* 227 */     this.neck2.field_78809_i = true;
/* 228 */     setRotation(this.neck2, 0.0F, 0.0F, 0.0F);
/* 229 */     this.neck3 = new ModelRenderer(this, 43, 85);
/* 230 */     this.neck3.func_78789_a(-3.0F, -2.0F, -6.0F, 6, 6, 6);
/* 231 */     this.neck3.func_78793_a(0.0F, 6.0F, -17.0F);
/* 232 */     this.neck3.func_78787_b(256, 128);
/* 233 */     this.neck3.field_78809_i = true;
/* 234 */     setRotation(this.neck3, 0.0F, 0.0F, 0.0F);
/* 235 */     this.leg5 = new ModelRenderer(this, 47, 99);
/* 236 */     this.leg5.func_78789_a(0.0F, 3.0F, 3.0F, 4, 8, 4);
/* 237 */     this.leg5.func_78793_a(3.0F, 11.0F, -5.0F);
/* 238 */     this.leg5.func_78787_b(256, 128);
/* 239 */     this.leg5.field_78809_i = true;
/* 240 */     setRotation(this.leg5, -0.5576792F, 0.0F, 0.0F);
/* 241 */     this.leg6 = new ModelRenderer(this, 47, 99);
/* 242 */     this.leg6.func_78789_a(-3.0F, 3.0F, 3.0F, 4, 8, 4);
/* 243 */     this.leg6.func_78793_a(-4.0F, 11.0F, -5.0F);
/* 244 */     this.leg6.func_78787_b(256, 128);
/* 245 */     this.leg6.field_78809_i = true;
/* 246 */     setRotation(this.leg6, -0.5576792F, 0.0F, 0.0F);
/* 247 */     this.leg7 = new ModelRenderer(this, 38, 73);
/* 248 */     this.leg7.func_78789_a(1.0F, 2.0F, -8.0F, 4, 5, 4);
/* 249 */     this.leg7.func_78793_a(3.0F, 11.0F, 8.0F);
/* 250 */     this.leg7.func_78787_b(256, 128);
/* 251 */     this.leg7.field_78809_i = true;
/* 252 */     setRotation(this.leg7, 0.8922867F, 0.0F, 0.0F);
/* 253 */     this.leg9 = new ModelRenderer(this, 38, 73);
/* 254 */     this.leg9.func_78789_a(-4.0F, 2.0F, -8.0F, 4, 5, 4);
/* 255 */     this.leg9.func_78793_a(-4.0F, 11.0F, 8.0F);
/* 256 */     this.leg9.func_78787_b(256, 128);
/* 257 */     this.leg9.field_78809_i = true;
/* 258 */     setRotation(this.leg9, 0.8922867F, 0.0F, 0.0F);
/* 259 */     this.foot1 = new ModelRenderer(this, 43, 63);
/* 260 */     this.foot1.func_78789_a(-3.0F, 11.0F, -5.0F, 4, 2, 6);
/* 261 */     this.foot1.func_78793_a(-4.0F, 11.0F, -5.0F);
/* 262 */     this.foot1.func_78787_b(256, 128);
/* 263 */     this.foot1.field_78809_i = true;
/* 264 */     setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
/* 265 */     this.foot2 = new ModelRenderer(this, 43, 63);
/* 266 */     this.foot2.func_78789_a(0.0F, 11.0F, -5.0F, 4, 2, 6);
/* 267 */     this.foot2.func_78793_a(3.0F, 11.0F, -5.0F);
/* 268 */     this.foot2.func_78787_b(256, 128);
/* 269 */     this.foot2.field_78809_i = true;
/* 270 */     setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
/* 271 */     this.leg10 = new ModelRenderer(this, 39, 52);
/* 272 */     this.leg10.func_78789_a(1.0F, 6.0F, 2.0F, 4, 5, 4);
/* 273 */     this.leg10.func_78793_a(3.0F, 11.0F, 8.0F);
/* 274 */     this.leg10.func_78787_b(256, 128);
/* 275 */     this.leg10.field_78809_i = true;
/* 276 */     setRotation(this.leg10, -0.5576792F, 0.0F, 0.0F);
/* 277 */     this.leg11 = new ModelRenderer(this, 39, 52);
/* 278 */     this.leg11.func_78789_a(-4.0F, 6.0F, 2.0F, 4, 5, 4);
/* 279 */     this.leg11.func_78793_a(-4.0F, 11.0F, 8.0F);
/* 280 */     this.leg11.func_78787_b(256, 128);
/* 281 */     this.leg11.field_78809_i = true;
/* 282 */     setRotation(this.leg11, -0.5576792F, 0.0F, 0.0F);
/* 283 */     this.foot3 = new ModelRenderer(this, 43, 63);
/* 284 */     this.foot3.func_78789_a(1.0F, 11.0F, -7.0F, 4, 2, 6);
/* 285 */     this.foot3.func_78793_a(3.0F, 11.0F, 8.0F);
/* 286 */     this.foot3.func_78787_b(256, 128);
/* 287 */     this.foot3.field_78809_i = true;
/* 288 */     setRotation(this.foot3, 0.0F, 0.0F, 0.0F);
/* 289 */     this.foot4 = new ModelRenderer(this, 43, 63);
/* 290 */     this.foot4.func_78789_a(-4.0F, 11.0F, -7.0F, 4, 2, 6);
/* 291 */     this.foot4.func_78793_a(-4.0F, 11.0F, 8.0F);
/* 292 */     this.foot4.func_78787_b(256, 128);
/* 293 */     this.foot4.field_78809_i = true;
/* 294 */     setRotation(this.foot4, 0.0F, 0.0F, 0.0F);
/* 295 */     this.tail1 = new ModelRenderer(this, 43, 85);
/* 296 */     this.tail1.func_78789_a(-3.0F, -3.0F, 0.0F, 6, 6, 6);
/* 297 */     this.tail1.func_78793_a(0.0F, 7.0F, 13.0F);
/* 298 */     this.tail1.func_78787_b(256, 128);
/* 299 */     this.tail1.field_78809_i = true;
/* 300 */     setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
/* 301 */     this.tail2 = new ModelRenderer(this, 43, 85);
/* 302 */     this.tail2.func_78789_a(-3.0F, -3.0F, 0.0F, 6, 6, 6);
/* 303 */     this.tail2.func_78793_a(0.0F, 7.0F, 19.0F);
/* 304 */     this.tail2.func_78787_b(256, 128);
/* 305 */     this.tail2.field_78809_i = true;
/* 306 */     setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
/* 307 */     this.tail3 = new ModelRenderer(this, 56, 45);
/* 308 */     this.tail3.func_78789_a(-3.0F, -3.0F, 0.0F, 4, 6, 6);
/* 309 */     this.tail3.func_78793_a(1.0F, 7.0F, 31.0F);
/* 310 */     this.tail3.func_78787_b(256, 128);
/* 311 */     this.tail3.field_78809_i = true;
/* 312 */     setRotation(this.tail3, 0.0F, 0.0F, 0.0F);
/* 313 */     this.mouth1 = new ModelRenderer(this, 90, 22);
/* 314 */     this.mouth1.func_78789_a(-3.0F, -1.0F, -15.0F, 6, 3, 8);
/* 315 */     this.mouth1.func_78793_a(0.0F, 6.0F, -23.0F);
/* 316 */     this.mouth1.func_78787_b(256, 128);
/* 317 */     this.mouth1.field_78809_i = true;
/* 318 */     setRotation(this.mouth1, 0.0F, 0.0F, 0.0F);
/* 319 */     this.mouth2 = new ModelRenderer(this, 90, 6);
/* 320 */     this.mouth2.func_78789_a(-2.0F, 1.0F, -5.0F, 4, 2, 8);
/* 321 */     this.mouth2.func_78793_a(0.0F, 7.0F, -32.0F);
/* 322 */     this.mouth2.func_78787_b(256, 128);
/* 323 */     this.mouth2.field_78809_i = true;
/* 324 */     setRotation(this.mouth2, 0.0698132F, 0.0F, 0.0F);
/* 325 */     this.tail5 = new ModelRenderer(this, 87, 36);
/* 326 */     this.tail5.func_78789_a(0.0F, 0.0F, -5.0F, 0, 11, 10);
/* 327 */     this.tail5.func_78793_a(0.0F, 7.0F, 49.0F);
/* 328 */     this.tail5.func_78787_b(256, 128);
/* 329 */     this.tail5.field_78809_i = true;
/* 330 */     setRotation(this.tail5, 1.570796F, 0.0F, 0.0F);
/* 331 */     this.wing1 = new ModelRenderer(this, 26, 40);
/* 332 */     this.wing1.func_78789_a(0.0F, -1.0F, -1.0F, 11, 2, 2);
/* 333 */     this.wing1.func_78793_a(4.0F, 3.0F, -5.0F);
/* 334 */     this.wing1.func_78787_b(256, 128);
/* 335 */     this.wing1.field_78809_i = true;
/* 336 */     setRotation(this.wing1, 0.0F, -0.4833219F, 0.0F);
/* 337 */     this.wing2 = new ModelRenderer(this, 110, 88);
/* 338 */     this.wing2.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 36);
/* 339 */     this.wing2.func_78793_a(19.0F, 3.0F, -23.0F);
/* 340 */     this.wing2.func_78787_b(256, 128);
/* 341 */     this.wing2.field_78809_i = true;
/* 342 */     setRotation(this.wing2, 0.0F, 1.041001F, 0.0F);
/* 343 */     this.wing3 = new ModelRenderer(this, 109, 60);
/* 344 */     this.wing3.func_78789_a(-1.0F, -1.0F, -24.0F, 2, 2, 24);
/* 345 */     this.wing3.func_78793_a(12.0F, 3.0F, -1.0F);
/* 346 */     this.wing3.func_78787_b(256, 128);
/* 347 */     this.wing3.field_78809_i = true;
/* 348 */     setRotation(this.wing3, -0.0090881F, -0.3497888F, 0.0F);
/* 349 */     this.wing4 = new ModelRenderer(this, 26, 40);
/* 350 */     this.wing4.func_78789_a(-11.0F, -1.0F, -1.0F, 11, 2, 2);
/* 351 */     this.wing4.func_78793_a(-4.0F, 3.0F, -5.0F);
/* 352 */     this.wing4.func_78787_b(256, 128);
/* 353 */     this.wing4.field_78809_i = true;
/* 354 */     setRotation(this.wing4, 0.0F, 0.4833166F, 0.0F);
/* 355 */     this.wing5 = new ModelRenderer(this, 109, 60);
/* 356 */     this.wing5.func_78789_a(-1.0F, -1.0F, -24.0F, 2, 2, 24);
/* 357 */     this.wing5.func_78793_a(-12.0F, 3.0F, -1.0F);
/* 358 */     this.wing5.func_78787_b(256, 128);
/* 359 */     this.wing5.field_78809_i = true;
/* 360 */     setRotation(this.wing5, -0.0090932F, 0.3323281F, 0.0F);
/* 361 */     this.wing6 = new ModelRenderer(this, 110, 88);
/* 362 */     this.wing6.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 36);
/* 363 */     this.wing6.func_78793_a(-20.0F, 3.0F, -23.0F);
/* 364 */     this.wing6.func_78787_b(256, 128);
/* 365 */     this.wing6.field_78809_i = true;
/* 366 */     setRotation(this.wing6, 0.0F, -1.041002F, 0.0F);
/* 367 */     this.wing7 = new ModelRenderer(this, 124, 21);
/* 368 */     this.wing7.func_78789_a(-8.0F, 0.0F, 1.0F, 8, 1, 36);
/* 369 */     this.wing7.func_78793_a(19.0F, 2.0F, -23.0F);
/* 370 */     this.wing7.func_78787_b(256, 128);
/* 371 */     this.wing7.field_78809_i = true;
/* 372 */     setRotation(this.wing7, 0.0F, 1.041001F, 0.0F);
/* 373 */     this.wing8 = new ModelRenderer(this, 122, 10);
/* 374 */     this.wing8.func_78789_a(-11.0F, -1.0F, 0.0F, 28, 1, 8);
/* 375 */     this.wing8.func_78793_a(12.0F, 3.0F, -1.0F);
/* 376 */     this.wing8.func_78787_b(256, 128);
/* 377 */     this.wing8.field_78809_i = true;
/* 378 */     setRotation(this.wing8, 0.002272F, 1.264073F, -0.0174533F);
/* 379 */     this.wing9 = new ModelRenderer(this, 0, 10);
/* 380 */     this.wing9.func_78789_a(-25.0F, -1.0F, 7.0F, 18, 1, 26);
/* 381 */     this.wing9.func_78793_a(19.0F, 3.0F, -23.0F);
/* 382 */     this.wing9.func_78787_b(256, 128);
/* 383 */     this.wing9.field_78809_i = true;
/* 384 */     setRotation(this.wing9, 0.002272F, 1.264073F, 0.0F);
/* 385 */     this.wing10 = new ModelRenderer(this, 122, 10);
/* 386 */     this.wing10.func_78789_a(-23.0F, -1.0F, 0.0F, 33, 1, 8);
/* 387 */     this.wing10.func_78793_a(-12.0F, 3.0F, -1.0F);
/* 388 */     this.wing10.func_78787_b(256, 128);
/* 389 */     this.wing10.field_78809_i = true;
/* 390 */     setRotation(this.wing10, -0.0022689F, -1.226894F, 0.0F);
/* 391 */     this.wing11 = new ModelRenderer(this, 124, 21);
/* 392 */     this.wing11.func_78789_a(0.0F, -1.0F, 1.0F, 8, 1, 36);
/* 393 */     this.wing11.func_78793_a(-20.0F, 3.0F, -23.0F);
/* 394 */     this.wing11.func_78787_b(256, 128);
/* 395 */     this.wing11.field_78809_i = true;
/* 396 */     setRotation(this.wing11, 0.0F, -1.041002F, 0.0F);
/* 397 */     this.wing12 = new ModelRenderer(this, 0, 10);
/* 398 */     this.wing12.func_78789_a(7.0F, -1.0F, 7.0F, 18, 1, 26);
/* 399 */     this.wing12.func_78793_a(-20.0F, 3.0F, -23.0F);
/* 400 */     this.wing12.func_78787_b(256, 128);
/* 401 */     this.wing12.field_78809_i = true;
/* 402 */     setRotation(this.wing12, 0.002272F, -1.264072F, 0.0F);
/* 403 */     this.tail4 = new ModelRenderer(this, 56, 45);
/* 404 */     this.tail4.func_78789_a(-3.0F, -3.0F, 0.0F, 4, 6, 6);
/* 405 */     this.tail4.func_78793_a(1.0F, 7.0F, 37.0F);
/* 406 */     this.tail4.func_78787_b(256, 128);
/* 407 */     this.tail4.field_78809_i = true;
/* 408 */     setRotation(this.tail4, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 416 */     Dragon e = (Dragon)entity;
/* 417 */     float newangle = 0.0F;
/* 418 */     float lspeed = 0.0F;
/* 419 */     RenderInfo r = null;
/* 420 */     float tailspeed = 0.76F;
/* 421 */     float tailamp = 0.45F;
/*     */     
/* 423 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 424 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 427 */     r = e.getRenderInfo();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 435 */     if (f1 > 0.001D) {
/*     */ 
/*     */ 
/*     */       
/* 439 */       lspeed = (float)((e.field_70169_q - e.field_70165_t) * (e.field_70169_q - e.field_70165_t) + (e.field_70166_s - e.field_70161_v) * (e.field_70166_s - e.field_70161_v));
/* 440 */       lspeed = (float)Math.sqrt(lspeed);
/* 441 */       newangle = MathHelper.func_76134_b(f2 * 1.25F * this.wingspeed) * 3.1415927F * lspeed * 0.6F;
/*     */     } else {
/* 443 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 446 */     if (e.getActivity() != 0) {
/* 447 */       newangle = 1.0F;
/* 448 */       this.leg4.field_78795_f = 0.557F - newangle;
/* 449 */       this.leg5.field_78795_f = -0.557F - newangle;
/* 450 */       this.foot2.field_78795_f = -newangle;
/* 451 */       this.leg3.field_78795_f = 0.557F - newangle;
/* 452 */       this.leg6.field_78795_f = -0.557F - newangle;
/* 453 */       this.foot1.field_78795_f = -newangle;
/* 454 */       this.leg2.field_78795_f = -0.632F + newangle;
/* 455 */       this.leg7.field_78795_f = 0.89F + newangle;
/* 456 */       this.leg10.field_78795_f = -0.557F + newangle;
/* 457 */       this.foot3.field_78795_f = newangle;
/* 458 */       this.leg1.field_78795_f = -0.632F + newangle;
/* 459 */       this.leg9.field_78795_f = 0.89F + newangle;
/* 460 */       this.leg11.field_78795_f = -0.557F + newangle;
/* 461 */       this.foot4.field_78795_f = newangle;
/*     */     } else {
/* 463 */       this.leg4.field_78795_f = 0.557F + newangle;
/* 464 */       this.leg5.field_78795_f = -0.557F + newangle;
/* 465 */       this.foot2.field_78795_f = newangle;
/* 466 */       this.leg3.field_78795_f = 0.557F - newangle;
/* 467 */       this.leg6.field_78795_f = -0.557F - newangle;
/* 468 */       this.foot1.field_78795_f = -newangle;
/* 469 */       this.leg2.field_78795_f = -0.632F - newangle;
/* 470 */       this.leg7.field_78795_f = 0.89F - newangle;
/* 471 */       this.leg10.field_78795_f = -0.557F - newangle;
/* 472 */       this.foot3.field_78795_f = -newangle;
/* 473 */       this.leg1.field_78795_f = -0.632F + newangle;
/* 474 */       this.leg9.field_78795_f = 0.89F + newangle;
/* 475 */       this.leg11.field_78795_f = -0.557F + newangle;
/* 476 */       this.foot4.field_78795_f = newangle;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 484 */     if (e.getAttacking() != 0) {
/* 485 */       if (e.getActivity() != 0) {
/* 486 */         newangle = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.28F;
/*     */       } else {
/* 488 */         newangle = -0.45F + MathHelper.func_76134_b(f2 * 0.85F * this.wingspeed) * 3.1415927F * 0.2F;
/*     */       }
/*     */     
/* 491 */     } else if (e.getActivity() != 0) {
/* 492 */       newangle = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.28F;
/*     */     } else {
/* 494 */       newangle = -0.85F + MathHelper.func_76134_b(f2 * 0.2F * this.wingspeed) * 3.1415927F * 0.028F;
/*     */     } 
/*     */     
/* 497 */     this.wing1.field_78808_h = newangle;
/* 498 */     this.wing15.field_78808_h = newangle;
/* 499 */     this.wing3.field_78808_h = newangle * 4.0F / 3.0F;
/* 500 */     this.wing1.field_78797_d += (float)Math.sin(this.wing1.field_78808_h) * 7.0F;
/* 501 */     this.wing1.field_78800_c += (float)Math.cos(this.wing1.field_78808_h) * 7.0F;
/* 502 */     this.wing8.field_78808_h = newangle * 4.0F / 3.0F;
/* 503 */     this.wing8.field_78797_d = this.wing3.field_78797_d;
/* 504 */     this.wing8.field_78800_c = this.wing3.field_78800_c;
/* 505 */     this.wing2.field_78808_h = newangle * 3.0F / 2.0F;
/* 506 */     this.wing3.field_78797_d += (float)Math.sin(this.wing3.field_78808_h) * 6.0F;
/* 507 */     this.wing3.field_78800_c += (float)Math.cos(this.wing3.field_78808_h) * 6.0F;
/* 508 */     this.wing7.field_78808_h = newangle * 3.0F / 2.0F;
/* 509 */     this.wing7.field_78797_d = this.wing2.field_78797_d;
/* 510 */     this.wing7.field_78800_c = this.wing2.field_78800_c;
/* 511 */     this.wing9.field_78808_h = newangle * 3.0F / 2.0F;
/* 512 */     this.wing9.field_78797_d = this.wing2.field_78797_d;
/* 513 */     this.wing9.field_78800_c = this.wing2.field_78800_c;
/*     */     
/* 515 */     this.wing4.field_78808_h = -newangle;
/* 516 */     this.wing14.field_78808_h = -newangle;
/* 517 */     this.wing5.field_78808_h = -newangle * 4.0F / 3.0F;
/* 518 */     this.wing4.field_78797_d -= (float)Math.sin(this.wing4.field_78808_h) * 7.0F;
/* 519 */     this.wing4.field_78800_c -= (float)Math.cos(this.wing4.field_78808_h) * 7.0F;
/* 520 */     this.wing10.field_78808_h = -newangle * 4.0F / 3.0F;
/* 521 */     this.wing10.field_78797_d = this.wing5.field_78797_d;
/* 522 */     this.wing10.field_78800_c = this.wing5.field_78800_c;
/* 523 */     this.wing6.field_78808_h = -newangle * 3.0F / 2.0F;
/* 524 */     this.wing5.field_78797_d -= (float)Math.sin(this.wing5.field_78808_h) * 6.0F;
/* 525 */     this.wing5.field_78800_c -= (float)Math.cos(this.wing5.field_78808_h) * 6.0F;
/* 526 */     this.wing11.field_78808_h = -newangle * 3.0F / 2.0F;
/* 527 */     this.wing11.field_78797_d = this.wing6.field_78797_d;
/* 528 */     this.wing11.field_78800_c = this.wing6.field_78800_c;
/* 529 */     this.wing12.field_78808_h = -newangle * 3.0F / 2.0F;
/* 530 */     this.wing12.field_78797_d = this.wing6.field_78797_d;
/* 531 */     this.wing12.field_78800_c = this.wing6.field_78800_c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 537 */     if (e.getAttacking() != 0) {
/* 538 */       tailspeed = 0.96F;
/* 539 */       tailamp = 0.75F;
/*     */     } 
/* 541 */     if (e.getActivity() == 0 && e.getAttacking() == 0) {
/* 542 */       tailspeed = 0.22F;
/* 543 */       tailamp = 0.22F;
/*     */     } 
/* 545 */     if (e.func_70906_o()) {
/* 546 */       tailspeed = 0.0F;
/* 547 */       tailamp = 0.0F;
/*     */     } 
/*     */ 
/*     */     
/* 551 */     this.tail1.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * 0.04F;
/* 552 */     this.spike10.field_78798_e = this.tail1.field_78798_e;
/* 553 */     this.spike10.field_78800_c = this.tail1.field_78800_c;
/* 554 */     this.spike10.field_78796_g = this.tail1.field_78796_g;
/*     */     
/* 556 */     this.tail1.field_78798_e += (float)Math.cos(this.tail1.field_78796_g) * 6.0F;
/* 557 */     this.tail1.field_78800_c += (float)Math.sin(this.tail1.field_78796_g) * 6.0F;
/* 558 */     this.tail2.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.125F;
/* 559 */     this.spike7.field_78798_e = this.tail2.field_78798_e;
/* 560 */     this.spike7.field_78800_c = this.tail2.field_78800_c;
/* 561 */     this.spike7.field_78796_g = this.tail2.field_78796_g;
/*     */     
/* 563 */     this.tail2.field_78798_e += (float)Math.cos(this.tail2.field_78796_g) * 6.0F;
/* 564 */     this.tail2.field_78800_c += (float)Math.sin(this.tail2.field_78796_g) * 6.0F;
/* 565 */     this.neck1.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.25F;
/* 566 */     this.spike8.field_78798_e = this.neck1.field_78798_e;
/* 567 */     this.spike8.field_78800_c = this.neck1.field_78800_c;
/* 568 */     this.spike8.field_78796_g = this.neck1.field_78796_g;
/*     */     
/* 570 */     this.neck1.field_78798_e += (float)Math.cos(this.neck1.field_78796_g) * 6.0F;
/* 571 */     this.tail3.field_78800_c = this.neck1.field_78800_c + 1.0F + (float)Math.sin(this.neck1.field_78796_g) * 6.0F;
/* 572 */     this.tail3.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.375F;
/* 573 */     this.spike3.field_78798_e = this.tail3.field_78798_e;
/* 574 */     this.tail3.field_78800_c--;
/* 575 */     this.spike3.field_78796_g = this.tail3.field_78796_g;
/*     */     
/* 577 */     this.tail3.field_78798_e += (float)Math.cos(this.tail3.field_78796_g) * 6.0F;
/* 578 */     this.tail3.field_78800_c += (float)Math.sin(this.tail3.field_78796_g) * 6.0F;
/* 579 */     this.tail4.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.5F;
/* 580 */     this.spike9.field_78798_e = this.tail4.field_78798_e;
/* 581 */     this.tail4.field_78800_c--;
/* 582 */     this.spike9.field_78796_g = this.tail4.field_78796_g;
/*     */     
/* 584 */     this.tail4.field_78798_e += (float)Math.cos(this.tail4.field_78796_g) * 6.0F;
/* 585 */     this.tail6.field_78800_c = this.tail4.field_78800_c - 1.0F + (float)Math.sin(this.tail4.field_78796_g) * 6.0F;
/* 586 */     this.tail6.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.625F;
/*     */ 
/*     */     
/* 589 */     this.tail6.field_78798_e += (float)Math.cos(this.tail6.field_78796_g) * 6.0F;
/* 590 */     this.tail5.field_78800_c = this.tail6.field_78800_c - 0.5F + (float)Math.sin(this.tail6.field_78796_g) * 6.0F;
/* 591 */     this.tail5.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.75F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 599 */     if (e.getActivity() == 1) {
/*     */ 
/*     */       
/* 602 */       f3 = (e.field_70126_B - e.field_70177_z) * 8.0F;
/* 603 */       f3 = -f3;
/* 604 */       r.rf1 += (f3 - r.rf1) / 60.0F;
/* 605 */       if (r.rf1 > 50.0F) r.rf1 = 50.0F; 
/* 606 */       if (r.rf1 < -50.0F) r.rf1 = -50.0F; 
/* 607 */       f3 = r.rf1;
/*     */     } else {
/* 609 */       f3 /= 2.0F;
/*     */     } 
/*     */     
/* 612 */     this.neck2.field_78796_g = (float)Math.toRadians(f3) * 0.25F;
/* 613 */     this.spike2.field_78796_g = this.neck2.field_78796_g;
/*     */     
/* 615 */     this.neck2.field_78798_e -= (float)Math.cos(this.neck2.field_78796_g) * 6.0F;
/* 616 */     this.neck2.field_78800_c -= (float)Math.sin(this.neck2.field_78796_g) * 6.0F;
/* 617 */     this.neck3.field_78796_g = (float)Math.toRadians(f3) * 0.5F;
/* 618 */     this.spike1.field_78798_e = this.neck3.field_78798_e;
/* 619 */     this.spike1.field_78800_c = this.neck3.field_78800_c;
/* 620 */     this.spike1.field_78796_g = this.neck3.field_78796_g;
/*     */     
/* 622 */     this.neck3.field_78798_e -= (float)Math.cos(this.neck3.field_78796_g) * 6.0F;
/* 623 */     this.neck3.field_78800_c -= (float)Math.sin(this.neck3.field_78796_g) * 6.0F;
/* 624 */     this.head.field_78796_g = (float)Math.toRadians(f3) * 0.75F;
/* 625 */     this.mouth1.field_78798_e = this.head.field_78798_e;
/* 626 */     this.mouth1.field_78800_c = this.head.field_78800_c;
/* 627 */     this.mouth1.field_78796_g = this.head.field_78796_g;
/* 628 */     this.horn1.field_78798_e = this.head.field_78798_e;
/* 629 */     this.horn1.field_78800_c = this.head.field_78800_c;
/* 630 */     this.head.field_78796_g += 0.26F;
/* 631 */     this.horn2.field_78798_e = this.head.field_78798_e;
/* 632 */     this.horn2.field_78800_c = this.head.field_78800_c;
/* 633 */     this.head.field_78796_g -= 0.26F;
/*     */     
/* 635 */     this.head.field_78798_e -= (float)Math.cos(this.head.field_78796_g) * 9.0F;
/* 636 */     this.head.field_78800_c -= (float)Math.sin(this.head.field_78796_g) * 9.0F;
/* 637 */     this.mouth2.field_78796_g = this.head.field_78796_g;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 644 */     newangle = MathHelper.func_76134_b(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.14F;
/*     */     
/* 646 */     if (e.getAttacking() != 0) {
/* 647 */       this.mouth2.field_78795_f = 0.4F + newangle;
/*     */     } else {
/* 649 */       this.mouth2.field_78795_f = 0.07F;
/*     */     } 
/*     */ 
/*     */     
/* 653 */     e.setRenderInfo(r);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 658 */     this.horn1.func_78785_a(f5);
/* 659 */     this.horn2.func_78785_a(f5);
/* 660 */     this.tail6.func_78785_a(f5);
/* 661 */     this.wing15.func_78785_a(f5);
/* 662 */     this.spike1.func_78785_a(f5);
/* 663 */     this.spike2.func_78785_a(f5);
/* 664 */     this.spike3.func_78785_a(f5);
/* 665 */     this.spike4.func_78785_a(f5);
/* 666 */     this.wing14.func_78785_a(f5);
/* 667 */     this.spike5.func_78785_a(f5);
/* 668 */     this.spike6.func_78785_a(f5);
/* 669 */     this.spike7.func_78785_a(f5);
/* 670 */     this.spike8.func_78785_a(f5);
/* 671 */     this.spike9.func_78785_a(f5);
/* 672 */     this.spike10.func_78785_a(f5);
/* 673 */     this.head.func_78785_a(f5);
/* 674 */     this.body.func_78785_a(f5);
/* 675 */     this.leg1.func_78785_a(f5);
/* 676 */     this.leg2.func_78785_a(f5);
/* 677 */     this.leg3.func_78785_a(f5);
/* 678 */     this.leg4.func_78785_a(f5);
/* 679 */     this.body2.func_78785_a(f5);
/* 680 */     this.neck1.func_78785_a(f5);
/* 681 */     this.body3.func_78785_a(f5);
/* 682 */     this.neck2.func_78785_a(f5);
/* 683 */     this.neck3.func_78785_a(f5);
/* 684 */     this.leg5.func_78785_a(f5);
/* 685 */     this.leg6.func_78785_a(f5);
/* 686 */     this.leg7.func_78785_a(f5);
/* 687 */     this.leg9.func_78785_a(f5);
/* 688 */     this.foot1.func_78785_a(f5);
/* 689 */     this.foot2.func_78785_a(f5);
/* 690 */     this.leg10.func_78785_a(f5);
/* 691 */     this.leg11.func_78785_a(f5);
/* 692 */     this.foot3.func_78785_a(f5);
/* 693 */     this.foot4.func_78785_a(f5);
/* 694 */     this.tail1.func_78785_a(f5);
/* 695 */     this.tail2.func_78785_a(f5);
/* 696 */     this.tail3.func_78785_a(f5);
/* 697 */     this.mouth1.func_78785_a(f5);
/* 698 */     this.mouth2.func_78785_a(f5);
/* 699 */     this.tail5.func_78785_a(f5);
/* 700 */     this.wing1.func_78785_a(f5);
/* 701 */     this.wing2.func_78785_a(f5);
/* 702 */     this.wing3.func_78785_a(f5);
/* 703 */     this.wing4.func_78785_a(f5);
/* 704 */     this.wing5.func_78785_a(f5);
/* 705 */     this.wing6.func_78785_a(f5);
/* 706 */     this.wing7.func_78785_a(f5);
/* 707 */     this.wing8.func_78785_a(f5);
/* 708 */     this.wing9.func_78785_a(f5);
/* 709 */     this.wing10.func_78785_a(f5);
/* 710 */     this.wing11.func_78785_a(f5);
/* 711 */     this.wing12.func_78785_a(f5);
/* 712 */     this.tail4.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 718 */     model.field_78795_f = x;
/* 719 */     model.field_78796_g = y;
/* 720 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 725 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelDragon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */