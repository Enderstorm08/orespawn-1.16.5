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
/*     */ public class ModelCephadrome
/*     */   extends ModelBase
/*     */ {
/*  14 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer leftfoot;
/*     */   
/*     */   ModelRenderer butt;
/*     */   ModelRenderer rightfoot;
/*     */   ModelRenderer topfin1;
/*     */   ModelRenderer topfin2;
/*     */   ModelRenderer topfin3;
/*     */   ModelRenderer topfin4;
/*     */   ModelRenderer leftshoulder;
/*     */   ModelRenderer lefwingfin1;
/*     */   ModelRenderer tailfin1;
/*     */   ModelRenderer tailmembrane2;
/*     */   ModelRenderer tailfin2;
/*     */   ModelRenderer tailfin4;
/*     */   ModelRenderer tailfin3;
/*     */   ModelRenderer tailmembrane1;
/*     */   ModelRenderer topmem1;
/*     */   ModelRenderer topmem2;
/*     */   ModelRenderer topmem3;
/*     */   ModelRenderer topmem4;
/*     */   ModelRenderer neck1;
/*     */   ModelRenderer body;
/*     */   ModelRenderer chest1;
/*     */   ModelRenderer leftleg1;
/*     */   ModelRenderer mouth;
/*     */   ModelRenderer neck2;
/*     */   ModelRenderer head;
/*     */   ModelRenderer hammerhead;
/*     */   ModelRenderer chest;
/*     */   ModelRenderer neck3;
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer rightleg1;
/*     */   ModelRenderer leftleg2;
/*     */   ModelRenderer rightleg2;
/*     */   ModelRenderer body2;
/*     */   ModelRenderer leftleg3;
/*     */   ModelRenderer rightleg3;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer tail3;
/*     */   ModelRenderer tailmembrane3;
/*     */   ModelRenderer leftwingfin2;
/*     */   ModelRenderer leftwingfin3;
/*     */   ModelRenderer leftwingfin4;
/*     */   ModelRenderer leftwingmembrane;
/*     */   ModelRenderer rightshoulder;
/*     */   ModelRenderer rightwingfin1;
/*     */   ModelRenderer rightwingfin2;
/*     */   ModelRenderer rightwingfin3;
/*     */   ModelRenderer rightwingfin4;
/*     */   ModelRenderer rightwingmembrane;
/*     */   ModelRenderer hammerhead2;
/*     */   
/*     */   public ModelCephadrome(float f1) {
/*  69 */     this.wingspeed = f1;
/*     */     
/*  71 */     this.field_78090_t = 512;
/*  72 */     this.field_78089_u = 256;
/*     */     
/*  74 */     this.leftfoot = new ModelRenderer(this, 41, 194);
/*  75 */     this.leftfoot.func_78789_a(-2.0F, 34.0F, -12.0F, 9, 4, 10);
/*  76 */     this.leftfoot.func_78793_a(7.0F, -14.0F, 17.0F);
/*  77 */     this.leftfoot.func_78787_b(512, 256);
/*  78 */     this.leftfoot.field_78809_i = true;
/*  79 */     setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
/*  80 */     this.butt = new ModelRenderer(this, 367, 235);
/*  81 */     this.butt.func_78789_a(0.0F, 0.0F, -2.0F, 9, 14, 6);
/*  82 */     this.butt.func_78793_a(-4.5F, -8.0F, 29.0F);
/*  83 */     this.butt.func_78787_b(512, 256);
/*  84 */     this.butt.field_78809_i = true;
/*  85 */     setRotation(this.butt, -0.8726646F, 0.0F, 0.0F);
/*  86 */     this.rightfoot = new ModelRenderer(this, 41, 170);
/*  87 */     this.rightfoot.func_78789_a(-7.0F, 34.0F, -12.0F, 9, 4, 10);
/*  88 */     this.rightfoot.func_78793_a(-7.0F, -14.0F, 17.0F);
/*  89 */     this.rightfoot.func_78787_b(512, 256);
/*  90 */     this.rightfoot.field_78809_i = true;
/*  91 */     setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
/*  92 */     this.topfin1 = new ModelRenderer(this, 64, 112);
/*  93 */     this.topfin1.func_78789_a(-3.0F, -2.0F, -30.0F, 6, 3, 30);
/*  94 */     this.topfin1.func_78793_a(0.0F, -15.0F, -7.0F);
/*  95 */     this.topfin1.func_78787_b(512, 256);
/*  96 */     this.topfin1.field_78809_i = true;
/*  97 */     setRotation(this.topfin1, -1.850049F, 0.0F, 0.0F);
/*  98 */     this.topfin2 = new ModelRenderer(this, 69, 81);
/*  99 */     this.topfin2.func_78789_a(-3.0F, -2.0F, -25.0F, 6, 3, 25);
/* 100 */     this.topfin2.func_78793_a(0.0F, -15.0F, -2.0F);
/* 101 */     this.topfin2.func_78787_b(512, 256);
/* 102 */     this.topfin2.field_78809_i = true;
/* 103 */     setRotation(this.topfin2, -2.076942F, 0.0F, 0.0F);
/* 104 */     this.topfin3 = new ModelRenderer(this, -1, 140);
/* 105 */     this.topfin3.func_78789_a(-3.0F, -2.0F, -20.0F, 6, 3, 20);
/* 106 */     this.topfin3.func_78793_a(0.0F, -16.0F, 3.0F);
/* 107 */     this.topfin3.func_78787_b(512, 256);
/* 108 */     this.topfin3.field_78809_i = true;
/* 109 */     setRotation(this.topfin3, -2.426008F, 0.0F, 0.0F);
/* 110 */     this.topfin4 = new ModelRenderer(this, 148, 148);
/* 111 */     this.topfin4.func_78789_a(-3.0F, -2.0F, -10.0F, 6, 3, 10);
/* 112 */     this.topfin4.func_78793_a(0.0F, -17.0F, 13.0F);
/* 113 */     this.topfin4.func_78787_b(512, 256);
/* 114 */     this.topfin4.field_78809_i = true;
/* 115 */     setRotation(this.topfin4, -2.635447F, 0.0F, 0.0F);
/* 116 */     this.leftshoulder = new ModelRenderer(this, 144, 236);
/* 117 */     this.leftshoulder.func_78789_a(0.0F, 0.0F, 1.0F, 6, 8, 11);
/* 118 */     this.leftshoulder.func_78793_a(6.0F, -16.0F, -14.0F);
/* 119 */     this.leftshoulder.func_78787_b(512, 256);
/* 120 */     this.leftshoulder.field_78809_i = true;
/* 121 */     setRotation(this.leftshoulder, -0.1745329F, 0.0F, 0.0F);
/* 122 */     this.lefwingfin1 = new ModelRenderer(this, 147, 96);
/* 123 */     this.lefwingfin1.func_78789_a(0.0F, -2.0F, -2.0F, 70, 5, 3);
/* 124 */     this.lefwingfin1.func_78793_a(9.0F, -12.0F, -11.0F);
/* 125 */     this.lefwingfin1.func_78787_b(512, 256);
/* 126 */     this.lefwingfin1.field_78809_i = true;
/* 127 */     setRotation(this.lefwingfin1, -0.2617994F, -0.1745329F, 0.0F);
/* 128 */     this.tailfin1 = new ModelRenderer(this, 168, 0);
/* 129 */     this.tailfin1.func_78789_a(-6.0F, -1.0F, 0.0F, 12, 3, 30);
/* 130 */     this.tailfin1.func_78793_a(0.0F, -9.0F, 56.0F);
/* 131 */     this.tailfin1.func_78787_b(512, 256);
/* 132 */     this.tailfin1.field_78809_i = true;
/* 133 */     setRotation(this.tailfin1, 0.1396263F, 0.0F, 0.0F);
/* 134 */     this.tailmembrane2 = new ModelRenderer(this, 201, 38);
/* 135 */     this.tailmembrane2.func_78789_a(0.0F, -8.0F, 3.0F, 0, 10, 19);
/* 136 */     this.tailmembrane2.func_78793_a(0.0F, 0.0F, 56.0F);
/* 137 */     this.tailmembrane2.func_78787_b(512, 256);
/* 138 */     this.tailmembrane2.field_78809_i = true;
/* 139 */     setRotation(this.tailmembrane2, -0.296706F, 0.0F, 0.0F);
/* 140 */     this.tailfin2 = new ModelRenderer(this, 186, 184);
/* 141 */     this.tailfin2.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 2, 27);
/* 142 */     this.tailfin2.func_78793_a(0.0F, -7.0F, 56.0F);
/* 143 */     this.tailfin2.func_78787_b(512, 256);
/* 144 */     this.tailfin2.field_78809_i = true;
/* 145 */     setRotation(this.tailfin2, -0.1919862F, 0.0F, 0.0F);
/* 146 */     this.tailfin4 = new ModelRenderer(this, 186, 137);
/* 147 */     this.tailfin4.func_78789_a(-4.0F, 1.0F, 1.0F, 8, 3, 22);
/* 148 */     this.tailfin4.func_78793_a(0.0F, -3.0F, 56.0F);
/* 149 */     this.tailfin4.func_78787_b(512, 256);
/* 150 */     this.tailfin4.field_78809_i = true;
/* 151 */     setRotation(this.tailfin4, -0.837758F, 0.0F, 0.0F);
/* 152 */     this.tailfin3 = new ModelRenderer(this, 185, 216);
/* 153 */     this.tailfin3.func_78789_a(-4.0F, 0.0F, 1.0F, 8, 2, 23);
/* 154 */     this.tailfin3.func_78793_a(0.0F, -5.0F, 57.0F);
/* 155 */     this.tailfin3.func_78787_b(512, 256);
/* 156 */     this.tailfin3.field_78809_i = true;
/* 157 */     setRotation(this.tailfin3, -0.5759587F, 0.0F, 0.0F);
/* 158 */     this.tailmembrane1 = new ModelRenderer(this, 245, 38);
/* 159 */     this.tailmembrane1.func_78789_a(0.0F, 0.0F, 4.0F, 0, 11, 21);
/* 160 */     this.tailmembrane1.func_78793_a(0.0F, -9.0F, 56.0F);
/* 161 */     this.tailmembrane1.func_78787_b(512, 256);
/* 162 */     this.tailmembrane1.field_78809_i = true;
/* 163 */     setRotation(this.tailmembrane1, 0.1396263F, 0.0F, 0.0F);
/* 164 */     this.topmem1 = new ModelRenderer(this, 25, 0);
/* 165 */     this.topmem1.func_78789_a(0.0F, -25.0F, 0.0F, 0, 24, 10);
/* 166 */     this.topmem1.func_78793_a(0.0F, -15.0F, -6.0F);
/* 167 */     this.topmem1.func_78787_b(512, 256);
/* 168 */     this.topmem1.field_78809_i = true;
/* 169 */     setRotation(this.topmem1, -0.2617994F, 0.0F, 0.0F);
/* 170 */     this.topmem2 = new ModelRenderer(this, 135, 0);
/* 171 */     this.topmem2.func_78789_a(1.0F, -22.0F, 0.0F, 0, 20, 10);
/* 172 */     this.topmem2.func_78793_a(-1.0F, -15.0F, -2.0F);
/* 173 */     this.topmem2.func_78787_b(512, 256);
/* 174 */     this.topmem2.field_78809_i = true;
/* 175 */     setRotation(this.topmem2, -0.5235988F, 0.0F, 0.0F);
/* 176 */     this.topmem3 = new ModelRenderer(this, 258, 0);
/* 177 */     this.topmem3.func_78789_a(0.0F, -18.0F, 0.0F, 0, 18, 8);
/* 178 */     this.topmem3.func_78793_a(0.0F, -16.0F, 3.0F);
/* 179 */     this.topmem3.func_78787_b(512, 256);
/* 180 */     this.topmem3.field_78809_i = true;
/* 181 */     setRotation(this.topmem3, -0.8901179F, 0.0F, 0.0F);
/* 182 */     this.topmem4 = new ModelRenderer(this, 282, 0);
/* 183 */     this.topmem4.func_78789_a(0.0F, -9.0F, 0.0F, 0, 9, 10);
/* 184 */     this.topmem4.func_78793_a(0.0F, -17.0F, 13.0F);
/* 185 */     this.topmem4.func_78787_b(512, 256);
/* 186 */     this.topmem4.field_78809_i = true;
/* 187 */     setRotation(this.topmem4, -1.117011F, 0.0F, 0.0F);
/* 188 */     this.neck1 = new ModelRenderer(this, 404, 235);
/* 189 */     this.neck1.func_78789_a(-6.0F, -5.0F, -10.0F, 10, 9, 10);
/* 190 */     this.neck1.func_78793_a(1.0F, -6.0F, -33.0F);
/* 191 */     this.neck1.func_78787_b(512, 256);
/* 192 */     this.neck1.field_78809_i = true;
/* 193 */     setRotation(this.neck1, 0.3665191F, 0.0F, 0.0F);
/* 194 */     this.body = new ModelRenderer(this, 28, 220);
/* 195 */     this.body.func_78789_a(-6.0F, -11.0F, -10.0F, 12, 15, 19);
/* 196 */     this.body.func_78793_a(0.0F, -7.0F, 3.0F);
/* 197 */     this.body.func_78787_b(512, 256);
/* 198 */     this.body.field_78809_i = true;
/* 199 */     setRotation(this.body, 0.1745329F, 0.0F, 0.0F);
/* 200 */     this.chest1 = new ModelRenderer(this, 98, 210);
/* 201 */     this.chest1.func_78789_a(-3.0F, -4.0F, -2.0F, 10, 11, 5);
/* 202 */     this.chest1.func_78793_a(-2.0F, -6.0F, -13.0F);
/* 203 */     this.chest1.func_78787_b(512, 256);
/* 204 */     this.chest1.field_78809_i = true;
/* 205 */     setRotation(this.chest1, 1.029744F, 0.0F, 0.0F);
/* 206 */     this.leftleg1 = new ModelRenderer(this, 135, 183);
/* 207 */     this.leftleg1.func_78789_a(-1.0F, 0.0F, -4.0F, 7, 18, 10);
/* 208 */     this.leftleg1.func_78793_a(7.0F, -14.0F, 17.0F);
/* 209 */     this.leftleg1.func_78787_b(512, 256);
/* 210 */     this.leftleg1.field_78809_i = true;
/* 211 */     setRotation(this.leftleg1, -0.5759587F, 0.0F, 0.0F);
/* 212 */     this.mouth = new ModelRenderer(this, 92, 150);
/* 213 */     this.mouth.func_78789_a(-7.0F, 1.0F, 3.0F, 14, 15, 4);
/* 214 */     this.mouth.func_78793_a(0.0F, -6.0F, -43.0F);
/* 215 */     this.mouth.func_78787_b(512, 256);
/* 216 */     this.mouth.field_78809_i = true;
/* 217 */     setRotation(this.mouth, -0.8726646F, 0.0F, 0.0F);
/* 218 */     this.neck2 = new ModelRenderer(this, 152, 110);
/* 219 */     this.neck2.func_78789_a(-6.0F, -5.0F, -17.0F, 11, 10, 17);
/* 220 */     this.neck2.func_78793_a(0.5F, -10.0F, -19.0F);
/* 221 */     this.neck2.func_78787_b(512, 256);
/* 222 */     this.neck2.field_78809_i = true;
/* 223 */     setRotation(this.neck2, 0.2617994F, 0.0F, 0.0F);
/* 224 */     this.head = new ModelRenderer(this, 275, 219);
/* 225 */     this.head.func_78789_a(-10.0F, -3.0F, -16.0F, 20, 7, 16);
/* 226 */     this.head.func_78793_a(0.0F, -6.0F, -43.0F);
/* 227 */     this.head.func_78787_b(512, 256);
/* 228 */     this.head.field_78809_i = true;
/* 229 */     setRotation(this.head, 0.5061455F, 0.0F, 0.0F);
/* 230 */     this.hammerhead = new ModelRenderer(this, 258, 134);
/* 231 */     this.hammerhead.func_78789_a(-18.0F, -2.0F, -15.0F, 36, 6, 14);
/* 232 */     this.hammerhead.func_78793_a(0.0F, -6.0F, -43.0F);
/* 233 */     this.hammerhead.func_78787_b(512, 256);
/* 234 */     this.hammerhead.field_78809_i = true;
/* 235 */     setRotation(this.hammerhead, 0.4537856F, 0.0F, 0.0F);
/* 236 */     this.chest = new ModelRenderer(this, 100, 15);
/* 237 */     this.chest.func_78789_a(-3.0F, -3.0F, 0.0F, 9, 29, 7);
/* 238 */     this.chest.func_78793_a(-1.5F, 0.0F, -5.0F);
/* 239 */     this.chest.func_78787_b(512, 256);
/* 240 */     this.chest.field_78809_i = true;
/* 241 */     setRotation(this.chest, 1.413717F, 0.0F, 0.0F);
/* 242 */     this.neck3 = new ModelRenderer(this, 264, 173);
/* 243 */     this.neck3.func_78789_a(-6.0F, -5.0F, -16.0F, 12, 11, 16);
/* 244 */     this.neck3.func_78793_a(0.0F, -11.0F, -6.0F);
/* 245 */     this.neck3.func_78787_b(512, 256);
/* 246 */     this.neck3.field_78809_i = true;
/* 247 */     setRotation(this.neck3, 0.0872665F, 0.0F, 0.0F);
/* 248 */     this.tail1 = new ModelRenderer(this, 51, 5);
/* 249 */     this.tail1.func_78789_a(-5.0F, -6.0F, 0.0F, 10, 13, 14);
/* 250 */     this.tail1.func_78793_a(0.0F, -10.0F, 22.0F);
/* 251 */     this.tail1.func_78787_b(512, 256);
/* 252 */     this.tail1.field_78809_i = true;
/* 253 */     setRotation(this.tail1, -0.1745329F, 0.0F, 0.0F);
/* 254 */     this.rightleg1 = new ModelRenderer(this, 94, 175);
/* 255 */     this.rightleg1.func_78789_a(-6.0F, 0.0F, -4.0F, 7, 18, 10);
/* 256 */     this.rightleg1.func_78793_a(-7.0F, -14.0F, 17.0F);
/* 257 */     this.rightleg1.func_78787_b(512, 256);
/* 258 */     this.rightleg1.field_78809_i = true;
/* 259 */     setRotation(this.rightleg1, -0.5759587F, 0.0F, 0.0F);
/* 260 */     this.leftleg2 = new ModelRenderer(this, 28, 112);
/* 261 */     this.leftleg2.func_78789_a(-1.0F, 6.0F, -17.0F, 7, 12, 7);
/* 262 */     this.leftleg2.func_78793_a(7.0F, -14.0F, 17.0F);
/* 263 */     this.leftleg2.func_78787_b(512, 256);
/* 264 */     this.leftleg2.field_78809_i = true;
/* 265 */     setRotation(this.leftleg2, 0.9773844F, 0.0F, 0.0F);
/* 266 */     this.rightleg2 = new ModelRenderer(this, 32, 90);
/* 267 */     this.rightleg2.func_78789_a(-6.0F, 6.0F, -17.0F, 7, 12, 7);
/* 268 */     this.rightleg2.func_78793_a(-7.0F, -14.0F, 17.0F);
/* 269 */     this.rightleg2.func_78787_b(512, 256);
/* 270 */     this.rightleg2.field_78809_i = true;
/* 271 */     setRotation(this.rightleg2, 0.9773844F, 0.0F, 0.0F);
/* 272 */     this.body2 = new ModelRenderer(this, 400, 179);
/* 273 */     this.body2.func_78789_a(0.0F, 3.0F, 3.0F, 12, 16, 16);
/* 274 */     this.body2.func_78793_a(-6.0F, -23.0F, 6.0F);
/* 275 */     this.body2.func_78787_b(512, 256);
/* 276 */     this.body2.field_78809_i = true;
/* 277 */     setRotation(this.body2, -0.1919862F, 0.0F, 0.0F);
/* 278 */     this.leftleg3 = new ModelRenderer(this, 351, 192);
/* 279 */     this.leftleg3.func_78789_a(-1.0F, 17.0F, 10.0F, 7, 17, 6);
/* 280 */     this.leftleg3.func_78793_a(7.0F, -14.0F, 17.0F);
/* 281 */     this.leftleg3.func_78787_b(512, 256);
/* 282 */     this.leftleg3.field_78809_i = true;
/* 283 */     setRotation(this.leftleg3, -0.5235988F, 0.0F, 0.0F);
/* 284 */     this.rightleg3 = new ModelRenderer(this, 323, 192);
/* 285 */     this.rightleg3.func_78789_a(-6.0F, 17.0F, 10.0F, 7, 17, 6);
/* 286 */     this.rightleg3.func_78793_a(-7.0F, -14.0F, 17.0F);
/* 287 */     this.rightleg3.func_78787_b(512, 256);
/* 288 */     this.rightleg3.field_78809_i = true;
/* 289 */     setRotation(this.rightleg3, -0.5235988F, 0.0F, 0.0F);
/* 290 */     this.tail2 = new ModelRenderer(this, 51, 55);
/* 291 */     this.tail2.func_78789_a(-6.0F, -6.0F, 0.0F, 9, 12, 14);
/* 292 */     this.tail2.func_78793_a(1.5F, -7.0F, 35.0F);
/* 293 */     this.tail2.func_78787_b(512, 256);
/* 294 */     this.tail2.field_78809_i = true;
/* 295 */     setRotation(this.tail2, -0.1396263F, 0.0F, 0.0F);
/* 296 */     this.tail3 = new ModelRenderer(this, 105, 52);
/* 297 */     this.tail3.func_78789_a(-5.0F, -6.0F, 0.0F, 8, 11, 14);
/* 298 */     this.tail3.func_78793_a(1.0F, -5.0F, 48.0F);
/* 299 */     this.tail3.func_78787_b(512, 256);
/* 300 */     this.tail3.field_78809_i = true;
/* 301 */     setRotation(this.tail3, -0.1396263F, 0.0F, 0.0F);
/* 302 */     this.tailmembrane3 = new ModelRenderer(this, 155, 38);
/* 303 */     this.tailmembrane3.func_78789_a(0.0F, -10.0F, 0.0F, 0, 10, 18);
/* 304 */     this.tailmembrane3.func_78793_a(0.0F, 2.0F, 56.0F);
/* 305 */     this.tailmembrane3.func_78787_b(512, 256);
/* 306 */     this.tailmembrane3.field_78809_i = true;
/* 307 */     setRotation(this.tailmembrane3, -0.837758F, 0.0F, 0.0F);
/* 308 */     this.leftwingfin2 = new ModelRenderer(this, 160, 83);
/* 309 */     this.leftwingfin2.func_78789_a(0.0F, -2.0F, 0.0F, 64, 4, 2);
/* 310 */     this.leftwingfin2.func_78793_a(9.0F, -12.0F, -11.0F);
/* 311 */     this.leftwingfin2.func_78787_b(512, 256);
/* 312 */     this.leftwingfin2.field_78809_i = true;
/* 313 */     setRotation(this.leftwingfin2, -0.2617994F, -0.4363323F, 0.0F);
/* 314 */     this.leftwingfin3 = new ModelRenderer(this, 209, 106);
/* 315 */     this.leftwingfin3.func_78789_a(0.0F, -2.0F, 0.0F, 48, 4, 2);
/* 316 */     this.leftwingfin3.func_78793_a(9.0F, -11.0F, -10.0F);
/* 317 */     this.leftwingfin3.func_78787_b(512, 256);
/* 318 */     this.leftwingfin3.field_78809_i = true;
/* 319 */     setRotation(this.leftwingfin3, -0.2617994F, -0.7853982F, 0.0F);
/* 320 */     this.leftwingfin4 = new ModelRenderer(this, 233, 120);
/* 321 */     this.leftwingfin4.func_78789_a(0.0F, 0.0F, 0.0F, 37, 4, 2);
/* 322 */     this.leftwingfin4.func_78793_a(9.0F, -13.0F, -6.0F);
/* 323 */     this.leftwingfin4.func_78787_b(512, 256);
/* 324 */     this.leftwingfin4.field_78809_i = true;
/* 325 */     setRotation(this.leftwingfin4, -0.2617994F, -1.186824F, 0.0F);
/* 326 */     this.leftwingmembrane = new ModelRenderer(this, 300, 27);
/* 327 */     this.leftwingmembrane.func_78789_a(3.0F, 0.0F, 0.0F, 64, 0, 34);
/* 328 */     this.leftwingmembrane.func_78793_a(9.0F, -13.0F, -10.0F);
/* 329 */     this.leftwingmembrane.func_78787_b(512, 256);
/* 330 */     this.leftwingmembrane.field_78809_i = true;
/* 331 */     setRotation(this.leftwingmembrane, -0.0872665F, -0.1745329F, 0.0F);
/* 332 */     this.rightshoulder = new ModelRenderer(this, 0, 193);
/* 333 */     this.rightshoulder.func_78789_a(0.0F, 0.0F, 0.0F, 6, 8, 11);
/* 334 */     this.rightshoulder.func_78793_a(-12.0F, -16.0F, -13.0F);
/* 335 */     this.rightshoulder.func_78787_b(512, 256);
/* 336 */     this.rightshoulder.field_78809_i = true;
/* 337 */     setRotation(this.rightshoulder, -0.1745329F, 0.0F, 0.0F);
/* 338 */     this.rightwingfin1 = new ModelRenderer(this, 344, 109);
/* 339 */     this.rightwingfin1.func_78789_a(-69.0F, -2.0F, 0.0F, 69, 5, 3);
/* 340 */     this.rightwingfin1.func_78793_a(-10.0F, -12.0F, -13.0F);
/* 341 */     this.rightwingfin1.func_78787_b(512, 256);
/* 342 */     this.rightwingfin1.field_78809_i = true;
/* 343 */     setRotation(this.rightwingfin1, -0.2617994F, 0.1745329F, 0.0F);
/* 344 */     this.rightwingfin2 = new ModelRenderer(this, 349, 119);
/* 345 */     this.rightwingfin2.func_78789_a(-63.0F, -2.0F, 0.0F, 64, 4, 2);
/* 346 */     this.rightwingfin2.func_78793_a(-9.0F, -12.0F, -11.0F);
/* 347 */     this.rightwingfin2.func_78787_b(512, 256);
/* 348 */     this.rightwingfin2.field_78809_i = true;
/* 349 */     setRotation(this.rightwingfin2, -0.2617994F, 0.4363323F, 0.0F);
/* 350 */     this.rightwingfin3 = new ModelRenderer(this, 368, 128);
/* 351 */     this.rightwingfin3.func_78789_a(-49.0F, 0.0F, 0.0F, 48, 4, 2);
/* 352 */     this.rightwingfin3.func_78793_a(-9.0F, -13.0F, -9.0F);
/* 353 */     this.rightwingfin3.func_78787_b(512, 256);
/* 354 */     this.rightwingfin3.field_78809_i = true;
/* 355 */     setRotation(this.rightwingfin3, -0.2617994F, 0.7679449F, 0.0F);
/* 356 */     this.rightwingfin4 = new ModelRenderer(this, 379, 137);
/* 357 */     this.rightwingfin4.func_78789_a(-35.0F, 0.0F, 0.0F, 37, 4, 2);
/* 358 */     this.rightwingfin4.func_78793_a(-9.0F, -13.0F, -6.0F);
/* 359 */     this.rightwingfin4.func_78787_b(512, 256);
/* 360 */     this.rightwingfin4.field_78809_i = true;
/* 361 */     setRotation(this.rightwingfin4, -0.2617994F, 1.186824F, 0.0F);
/* 362 */     this.rightwingmembrane = new ModelRenderer(this, 300, 67);
/* 363 */     this.rightwingmembrane.func_78789_a(-67.0F, -1.0F, 0.0F, 64, 0, 34);
/* 364 */     this.rightwingmembrane.func_78793_a(-9.0F, -12.0F, -12.0F);
/* 365 */     this.rightwingmembrane.func_78787_b(512, 256);
/* 366 */     this.rightwingmembrane.field_78809_i = true;
/* 367 */     setRotation(this.rightwingmembrane, -0.0872665F, 0.1745329F, 0.0F);
/* 368 */     this.hammerhead2 = new ModelRenderer(this, 258, 157);
/* 369 */     this.hammerhead2.func_78789_a(-25.0F, 0.0F, -14.0F, 50, 4, 7);
/* 370 */     this.hammerhead2.func_78793_a(0.0F, -7.0F, -43.0F);
/* 371 */     this.hammerhead2.func_78787_b(512, 256);
/* 372 */     this.hammerhead2.field_78809_i = true;
/* 373 */     setRotation(this.hammerhead2, 0.4537856F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 380 */     Cephadrome e = (Cephadrome)entity;
/* 381 */     RenderInfo r = null;
/* 382 */     float newangle = 0.0F;
/* 383 */     float lspeed = 0.0F;
/* 384 */     float pi4 = 0.7853982F;
/* 385 */     float tailspeed = 0.76F;
/* 386 */     float tailamp = 0.1F;
/*     */     
/* 388 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 389 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 392 */     r = e.getRenderInfo();
/*     */ 
/*     */ 
/*     */     
/* 396 */     if (f1 > 0.001D) {
/*     */ 
/*     */ 
/*     */       
/* 400 */       lspeed = (float)((e.field_70169_q - e.field_70165_t) * (e.field_70169_q - e.field_70165_t) + (e.field_70166_s - e.field_70161_v) * (e.field_70166_s - e.field_70161_v));
/* 401 */       lspeed = (float)Math.sqrt(lspeed);
/* 402 */       newangle = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed) * 3.1415927F * lspeed * 0.4F;
/* 403 */       if (newangle > 0.5D) newangle = 0.75F; 
/* 404 */       if (newangle < -0.5D) newangle = -0.75F; 
/*     */     } else {
/* 406 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 409 */     if (e.getActivity() != 0) {
/* 410 */       newangle = 1.0F;
/* 411 */       this.rightleg1.field_78795_f = -0.58F + newangle;
/* 412 */       this.rightleg2.field_78795_f = 0.98F + newangle;
/* 413 */       this.rightleg3.field_78795_f = -0.52F + newangle;
/* 414 */       this.rightfoot.field_78795_f = newangle;
/* 415 */       this.leftleg1.field_78795_f = -0.58F + newangle;
/* 416 */       this.leftleg2.field_78795_f = 0.98F + newangle;
/* 417 */       this.leftleg3.field_78795_f = -0.52F + newangle;
/* 418 */       this.leftfoot.field_78795_f = newangle;
/*     */     } else {
/* 420 */       this.rightleg1.field_78795_f = -0.58F + newangle;
/* 421 */       this.rightleg2.field_78795_f = 0.98F + newangle;
/* 422 */       this.rightleg3.field_78795_f = -0.52F + newangle;
/* 423 */       this.rightfoot.field_78795_f = newangle;
/* 424 */       this.leftleg1.field_78795_f = -0.58F - newangle;
/* 425 */       this.leftleg2.field_78795_f = 0.98F - newangle;
/* 426 */       this.leftleg3.field_78795_f = -0.52F - newangle;
/* 427 */       this.leftfoot.field_78795_f = -newangle;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 433 */     if (e.getActivity() != 0) {
/* 434 */       newangle = MathHelper.func_76134_b(f2 * 0.55F * this.wingspeed) * 3.1415927F * 0.28F;
/*     */     }
/* 436 */     else if (e.getAttacking() == 0) {
/* 437 */       newangle = -0.85F + MathHelper.func_76134_b(f2 * 0.2F * this.wingspeed) * 3.1415927F * 0.028F;
/*     */     } else {
/* 439 */       newangle = -0.65F + MathHelper.func_76134_b(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.068F;
/*     */     } 
/*     */     
/* 442 */     this.lefwingfin1.field_78808_h = newangle;
/* 443 */     this.leftwingfin2.field_78808_h = newangle;
/* 444 */     this.leftwingfin3.field_78808_h = newangle;
/* 445 */     this.leftwingfin4.field_78808_h = newangle;
/* 446 */     this.leftwingmembrane.field_78808_h = newangle;
/*     */     
/* 448 */     this.rightwingfin1.field_78808_h = -newangle;
/* 449 */     this.rightwingfin2.field_78808_h = -newangle;
/* 450 */     this.rightwingfin3.field_78808_h = -newangle;
/* 451 */     this.rightwingfin4.field_78808_h = -newangle;
/* 452 */     this.rightwingmembrane.field_78808_h = -newangle;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 457 */     newangle = MathHelper.func_76134_b(f2 * 0.15F * this.wingspeed) * 3.1415927F * 0.05F;
/* 458 */     this.topfin1.field_78795_f = -1.85F - Math.abs(newangle);
/* 459 */     this.topmem1.field_78795_f = -0.26F - Math.abs(newangle);
/* 460 */     this.topfin2.field_78795_f = -2.07F - Math.abs(newangle / 2.0F);
/* 461 */     this.topmem2.field_78795_f = -0.52F - Math.abs(newangle / 2.0F);
/* 462 */     this.topfin3.field_78795_f = -2.42F - Math.abs(newangle / 4.0F);
/* 463 */     this.topmem3.field_78795_f = -0.89F - Math.abs(newangle / 4.0F);
/* 464 */     this.topfin4.field_78795_f = -2.63F - Math.abs(newangle / 8.0F);
/* 465 */     this.topmem4.field_78795_f = -1.11F - Math.abs(newangle / 8.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 473 */     if (e.getActivity() == 0 && e.getAttacking() == 0) {
/* 474 */       tailspeed = 0.22F;
/* 475 */       tailamp = 0.03F;
/*     */     } 
/* 477 */     this.tail1.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed) * 3.1415927F * 0.04F;
/*     */     
/* 479 */     this.tail1.field_78798_e += (float)Math.cos(this.tail1.field_78796_g) * 13.0F;
/* 480 */     this.tail2.field_78800_c = this.tail1.field_78800_c + 1.5F + (float)Math.sin(this.tail1.field_78796_g) * 13.0F;
/* 481 */     this.tail2.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed - pi4) * 3.1415927F * tailamp;
/*     */     
/* 483 */     this.tail2.field_78798_e += (float)Math.cos(this.tail2.field_78796_g) * 13.0F;
/* 484 */     this.tail3.field_78800_c = this.tail2.field_78800_c - 0.5F + (float)Math.sin(this.tail2.field_78796_g) * 13.0F;
/* 485 */     this.tail3.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed - 2.0F * pi4) * 3.1415927F * tailamp;
/*     */     
/* 487 */     this.tail3.field_78798_e += (float)Math.cos(this.tail3.field_78796_g) * 10.0F;
/* 488 */     this.tailfin1.field_78800_c = this.tail3.field_78800_c - 1.0F + (float)Math.sin(this.tail3.field_78796_g) * 10.0F;
/* 489 */     this.tailfin1.field_78796_g = MathHelper.func_76134_b(f2 * tailspeed * this.wingspeed - 3.0F * pi4) * 3.1415927F * tailamp;
/*     */     
/* 491 */     this.tailfin2.field_78798_e = this.tailfin1.field_78798_e;
/* 492 */     this.tailfin2.field_78800_c = this.tailfin1.field_78800_c;
/* 493 */     this.tailfin2.field_78796_g = this.tailfin1.field_78796_g;
/*     */     
/* 495 */     this.tailfin3.field_78798_e = this.tailfin1.field_78798_e;
/* 496 */     this.tailfin3.field_78800_c = this.tailfin1.field_78800_c;
/* 497 */     this.tailfin3.field_78796_g = this.tailfin1.field_78796_g;
/*     */     
/* 499 */     this.tailfin4.field_78798_e = this.tailfin1.field_78798_e;
/* 500 */     this.tailfin4.field_78800_c = this.tailfin1.field_78800_c;
/* 501 */     this.tailfin4.field_78796_g = this.tailfin1.field_78796_g;
/*     */     
/* 503 */     this.tailmembrane1.field_78798_e = this.tailfin1.field_78798_e;
/* 504 */     this.tailmembrane1.field_78800_c = this.tailfin1.field_78800_c;
/* 505 */     this.tailmembrane1.field_78796_g = this.tailfin1.field_78796_g;
/*     */     
/* 507 */     this.tailmembrane2.field_78798_e = this.tailfin1.field_78798_e;
/* 508 */     this.tailmembrane2.field_78800_c = this.tailfin1.field_78800_c;
/* 509 */     this.tailmembrane2.field_78796_g = this.tailfin1.field_78796_g;
/*     */     
/* 511 */     this.tailmembrane3.field_78798_e = this.tailfin1.field_78798_e;
/* 512 */     this.tailmembrane3.field_78800_c = this.tailfin1.field_78800_c;
/* 513 */     this.tailmembrane3.field_78796_g = this.tailfin1.field_78796_g;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 518 */     if (e.getActivity() == 1) {
/*     */ 
/*     */       
/* 521 */       f3 = (e.field_70126_B - e.field_70177_z) * 10.0F;
/* 522 */       f3 = -f3;
/* 523 */       r.rf1 += (f3 - r.rf1) / 50.0F;
/* 524 */       if (r.rf1 > 50.0F) r.rf1 = 50.0F; 
/* 525 */       if (r.rf1 < -50.0F) r.rf1 = -50.0F; 
/* 526 */       f3 = r.rf1;
/*     */     } else {
/* 528 */       f3 /= 2.0F;
/*     */     } 
/*     */     
/* 531 */     this.neck3.field_78796_g = (float)Math.toRadians(f3) * 0.125F;
/* 532 */     this.neck3.field_78798_e -= (float)Math.cos(this.neck3.field_78796_g) * 14.0F;
/* 533 */     this.neck2.field_78800_c = this.neck3.field_78800_c + 0.5F - (float)Math.sin(this.neck3.field_78796_g) * 14.0F;
/* 534 */     this.neck2.field_78796_g = (float)Math.toRadians(f3) * 0.25F;
/* 535 */     this.neck2.field_78798_e -= (float)Math.cos(this.neck2.field_78796_g) * 14.0F;
/* 536 */     this.neck1.field_78800_c = this.neck2.field_78800_c + 0.5F - (float)Math.sin(this.neck2.field_78796_g) * 14.0F;
/* 537 */     this.neck1.field_78796_g = (float)Math.toRadians(f3) * 0.5F;
/* 538 */     this.neck1.field_78798_e -= (float)Math.cos(this.neck1.field_78796_g) * 8.0F;
/* 539 */     this.neck1.field_78800_c -= (float)Math.sin(this.neck1.field_78796_g) * 8.0F;
/* 540 */     this.head.field_78796_g = (float)Math.toRadians(f3) * 0.75F;
/* 541 */     this.hammerhead.field_78798_e = this.head.field_78798_e;
/* 542 */     this.hammerhead.field_78800_c = this.head.field_78800_c;
/* 543 */     this.hammerhead.field_78796_g = this.head.field_78796_g;
/* 544 */     this.hammerhead2.field_78798_e = this.head.field_78798_e;
/* 545 */     this.hammerhead2.field_78800_c = this.head.field_78800_c;
/* 546 */     this.hammerhead2.field_78796_g = this.head.field_78796_g;
/* 547 */     this.mouth.field_78798_e = this.head.field_78798_e;
/* 548 */     this.mouth.field_78800_c = this.head.field_78800_c;
/* 549 */     this.mouth.field_78796_g = this.head.field_78796_g;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 554 */     newangle = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.14F;
/*     */     
/* 556 */     if (e.getAttacking() != 0) {
/* 557 */       this.mouth.field_78795_f = -0.61F + newangle;
/*     */     } else {
/* 559 */       this.mouth.field_78795_f = -0.87F;
/*     */     } 
/*     */ 
/*     */     
/* 563 */     e.setRenderInfo(r);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 568 */     this.leftfoot.func_78785_a(f5);
/* 569 */     this.butt.func_78785_a(f5);
/* 570 */     this.rightfoot.func_78785_a(f5);
/* 571 */     this.topfin1.func_78785_a(f5);
/* 572 */     this.topfin2.func_78785_a(f5);
/* 573 */     this.topfin3.func_78785_a(f5);
/* 574 */     this.topfin4.func_78785_a(f5);
/* 575 */     this.leftshoulder.func_78785_a(f5);
/* 576 */     this.lefwingfin1.func_78785_a(f5);
/* 577 */     this.tailfin1.func_78785_a(f5);
/* 578 */     this.tailmembrane2.func_78785_a(f5);
/* 579 */     this.tailfin2.func_78785_a(f5);
/* 580 */     this.tailfin4.func_78785_a(f5);
/* 581 */     this.tailfin3.func_78785_a(f5);
/* 582 */     this.tailmembrane1.func_78785_a(f5);
/* 583 */     this.topmem1.func_78785_a(f5);
/* 584 */     this.topmem2.func_78785_a(f5);
/* 585 */     this.topmem3.func_78785_a(f5);
/* 586 */     this.topmem4.func_78785_a(f5);
/* 587 */     this.neck1.func_78785_a(f5);
/* 588 */     this.body.func_78785_a(f5);
/* 589 */     this.chest1.func_78785_a(f5);
/* 590 */     this.leftleg1.func_78785_a(f5);
/* 591 */     this.mouth.func_78785_a(f5);
/* 592 */     this.neck2.func_78785_a(f5);
/* 593 */     this.head.func_78785_a(f5);
/* 594 */     this.hammerhead.func_78785_a(f5);
/* 595 */     this.chest.func_78785_a(f5);
/* 596 */     this.neck3.func_78785_a(f5);
/* 597 */     this.tail1.func_78785_a(f5);
/* 598 */     this.rightleg1.func_78785_a(f5);
/* 599 */     this.leftleg2.func_78785_a(f5);
/* 600 */     this.rightleg2.func_78785_a(f5);
/* 601 */     this.body2.func_78785_a(f5);
/* 602 */     this.leftleg3.func_78785_a(f5);
/* 603 */     this.rightleg3.func_78785_a(f5);
/* 604 */     this.tail2.func_78785_a(f5);
/* 605 */     this.tail3.func_78785_a(f5);
/* 606 */     this.tailmembrane3.func_78785_a(f5);
/* 607 */     this.leftwingfin2.func_78785_a(f5);
/* 608 */     this.leftwingfin3.func_78785_a(f5);
/* 609 */     this.leftwingfin4.func_78785_a(f5);
/* 610 */     this.leftwingmembrane.func_78785_a(f5);
/* 611 */     this.rightshoulder.func_78785_a(f5);
/* 612 */     this.rightwingfin1.func_78785_a(f5);
/* 613 */     this.rightwingfin2.func_78785_a(f5);
/* 614 */     this.rightwingfin3.func_78785_a(f5);
/* 615 */     this.rightwingfin4.func_78785_a(f5);
/* 616 */     this.rightwingmembrane.func_78785_a(f5);
/* 617 */     this.hammerhead2.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 623 */     model.field_78795_f = x;
/* 624 */     model.field_78796_g = y;
/* 625 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 630 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCephadrome.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */