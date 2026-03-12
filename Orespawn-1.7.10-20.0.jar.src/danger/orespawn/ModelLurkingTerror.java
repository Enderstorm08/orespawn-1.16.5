/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelLurkingTerror
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer leg1;
/*     */   
/*     */   ModelRenderer leg1part2;
/*     */   ModelRenderer leg1part3;
/*     */   ModelRenderer leg2;
/*     */   ModelRenderer leg2part2;
/*     */   ModelRenderer leg2part3;
/*     */   ModelRenderer leg3;
/*     */   ModelRenderer leg3part2;
/*     */   ModelRenderer leg3part3;
/*     */   ModelRenderer leg4;
/*     */   ModelRenderer leg4part2;
/*     */   ModelRenderer leg4part3;
/*     */   ModelRenderer leg5;
/*     */   ModelRenderer leg5part2;
/*     */   ModelRenderer leg6;
/*     */   ModelRenderer leg6part2;
/*     */   ModelRenderer thorax;
/*     */   ModelRenderer abdomen;
/*     */   ModelRenderer head;
/*     */   ModelRenderer jaw1;
/*     */   ModelRenderer jaw1part2;
/*     */   ModelRenderer jaw1tooth1;
/*     */   ModelRenderer jaw1tooth2;
/*     */   ModelRenderer jaw1tooth3;
/*     */   ModelRenderer jaw1tooth4;
/*     */   ModelRenderer jaw1tooth5;
/*     */   ModelRenderer jaw1tooth6;
/*     */   ModelRenderer jaw2;
/*     */   ModelRenderer jaw2part2;
/*     */   ModelRenderer jaw2tooth1;
/*     */   ModelRenderer jaw2tooth2;
/*     */   ModelRenderer jaw2tooth3;
/*     */   ModelRenderer jaw2tooth4;
/*     */   ModelRenderer jaw2tooth5;
/*     */   ModelRenderer jaw2tooth6;
/*     */   ModelRenderer jaw3;
/*     */   ModelRenderer jaw3part2;
/*     */   ModelRenderer jaw3tooth1;
/*     */   ModelRenderer jaw3tooth2;
/*     */   ModelRenderer jaw3tooth3;
/*     */   ModelRenderer jaw3tooth4;
/*     */   ModelRenderer jaw3tooth5;
/*     */   ModelRenderer jaw3tooth6;
/*     */   ModelRenderer jaw4;
/*     */   ModelRenderer jaw4part2;
/*     */   ModelRenderer jaw4tooth1;
/*     */   ModelRenderer jaw4tooth2;
/*     */   ModelRenderer jaw4tooth3;
/*     */   ModelRenderer jaw4tooth4;
/*     */   ModelRenderer jaw4tooth5;
/*     */   ModelRenderer jaw4tooth6;
/*     */   ModelRenderer tonguepart1;
/*     */   ModelRenderer tonguepart2;
/*     */   ModelRenderer tonguepart3;
/*     */   ModelRenderer wing_1;
/*     */   ModelRenderer wing_2;
/*     */   ModelRenderer wing_3;
/*     */   ModelRenderer wing_4;
/*     */   
/*     */   public ModelLurkingTerror() {
/*  75 */     this.wingspeed = 1.0F;
/*  76 */     this.field_78090_t = 256;
/*  77 */     this.field_78089_u = 64;
/*     */     
/*  79 */     this.body = new ModelRenderer(this, 39, 27);
/*  80 */     this.body.func_78789_a(-4.0F, -4.0F, -8.0F, 8, 8, 12);
/*  81 */     this.body.func_78793_a(0.0F, 10.0F, 0.0F);
/*  82 */     this.body.func_78787_b(256, 64);
/*  83 */     this.body.field_78809_i = true;
/*  84 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  85 */     this.leg1 = new ModelRenderer(this, 18, 0);
/*  86 */     this.leg1.func_78789_a(-15.0F, -1.5F, -1.5F, 16, 3, 3);
/*  87 */     this.leg1.func_78793_a(-4.0F, 10.0F, -1.0F);
/*  88 */     this.leg1.func_78787_b(256, 64);
/*  89 */     this.leg1.field_78809_i = true;
/*  90 */     setRotation(this.leg1, 0.0F, -0.5759587F, -0.1919862F);
/*  91 */     this.leg1part2 = new ModelRenderer(this, 58, 0);
/*  92 */     this.leg1part2.func_78789_a(-15.0F, -1.5F, -1.5F, 3, 8, 3);
/*  93 */     this.leg1part2.func_78793_a(-4.0F, 10.0F, -1.0F);
/*  94 */     this.leg1part2.func_78787_b(256, 64);
/*  95 */     this.leg1part2.field_78809_i = true;
/*  96 */     setRotation(this.leg1part2, 0.0F, -0.5759587F, -0.1919862F);
/*  97 */     this.leg1part3 = new ModelRenderer(this, 0, 0);
/*  98 */     this.leg1part3.func_78789_a(-15.0F, -1.0F, -1.0F, 2, 8, 2);
/*  99 */     this.leg1part3.func_78793_a(-4.0F, 10.0F, -1.0F);
/* 100 */     this.leg1part3.func_78787_b(256, 64);
/* 101 */     this.leg1part3.field_78809_i = true;
/* 102 */     setRotation(this.leg1part3, 0.0F, -0.5759587F, -0.6753082F);
/* 103 */     this.leg2 = new ModelRenderer(this, 18, 0);
/* 104 */     this.leg2.func_78789_a(-1.0F, -1.5F, -1.5F, 16, 3, 3);
/* 105 */     this.leg2.func_78793_a(4.0F, 10.0F, -1.0F);
/* 106 */     this.leg2.func_78787_b(256, 64);
/* 107 */     this.leg2.field_78809_i = true;
/* 108 */     setRotation(this.leg2, 0.0F, 0.5759587F, 0.1919862F);
/* 109 */     this.leg2part2 = new ModelRenderer(this, 58, 0);
/* 110 */     this.leg2part2.func_78789_a(12.0F, -1.5F, -1.5F, 3, 8, 3);
/* 111 */     this.leg2part2.func_78793_a(4.0F, 10.0F, -1.0F);
/* 112 */     this.leg2part2.func_78787_b(256, 64);
/* 113 */     this.leg2part2.field_78809_i = true;
/* 114 */     setRotation(this.leg2part2, 0.0F, 0.5759587F, 0.1919862F);
/* 115 */     this.leg2part3 = new ModelRenderer(this, 0, 0);
/* 116 */     this.leg2part3.func_78789_a(13.0F, -1.0F, -1.0F, 2, 8, 2);
/* 117 */     this.leg2part3.func_78793_a(4.0F, 10.0F, -1.0F);
/* 118 */     this.leg2part3.func_78787_b(256, 64);
/* 119 */     this.leg2part3.field_78809_i = true;
/* 120 */     setRotation(this.leg2part3, 0.0F, 0.5759587F, 0.6753028F);
/* 121 */     this.leg3 = new ModelRenderer(this, 18, 0);
/* 122 */     this.leg3.func_78789_a(-15.0F, -1.5F, -1.5F, 16, 3, 3);
/* 123 */     this.leg3.func_78793_a(-4.0F, 10.0F, 1.0F);
/* 124 */     this.leg3.func_78787_b(256, 64);
/* 125 */     this.leg3.field_78809_i = true;
/* 126 */     setRotation(this.leg3, 0.0F, 0.2792527F, -0.1919862F);
/* 127 */     this.leg3part2 = new ModelRenderer(this, 58, 0);
/* 128 */     this.leg3part2.func_78789_a(-15.0F, -1.5F, -1.5F, 3, 8, 3);
/* 129 */     this.leg3part2.func_78793_a(-4.0F, 10.0F, 1.0F);
/* 130 */     this.leg3part2.func_78787_b(256, 64);
/* 131 */     this.leg3part2.field_78809_i = true;
/* 132 */     setRotation(this.leg3part2, 0.0F, 0.2792527F, -0.1919862F);
/* 133 */     this.leg3part3 = new ModelRenderer(this, 0, 0);
/* 134 */     this.leg3part3.func_78789_a(-15.0F, -1.0F, -1.0F, 2, 8, 2);
/* 135 */     this.leg3part3.func_78793_a(-4.0F, 10.0F, 1.0F);
/* 136 */     this.leg3part3.func_78787_b(256, 64);
/* 137 */     this.leg3part3.field_78809_i = true;
/* 138 */     setRotation(this.leg3part3, 0.0F, 0.2792527F, -0.6753028F);
/* 139 */     this.leg4 = new ModelRenderer(this, 18, 0);
/* 140 */     this.leg4.func_78789_a(-1.0F, -1.5F, -1.5F, 16, 3, 3);
/* 141 */     this.leg4.func_78793_a(4.0F, 10.0F, 1.0F);
/* 142 */     this.leg4.func_78787_b(256, 64);
/* 143 */     this.leg4.field_78809_i = true;
/* 144 */     setRotation(this.leg4, 0.0F, -0.2792527F, 0.1919862F);
/* 145 */     this.leg4part2 = new ModelRenderer(this, 58, 0);
/* 146 */     this.leg4part2.func_78789_a(12.0F, -1.5F, -1.5F, 3, 8, 3);
/* 147 */     this.leg4part2.func_78793_a(4.0F, 10.0F, 1.0F);
/* 148 */     this.leg4part2.func_78787_b(256, 64);
/* 149 */     this.leg4part2.field_78809_i = true;
/* 150 */     setRotation(this.leg4part2, 0.0F, -0.2792527F, 0.1919862F);
/* 151 */     this.leg4part3 = new ModelRenderer(this, 0, 0);
/* 152 */     this.leg4part3.func_78789_a(13.0F, -1.0F, -1.0F, 2, 8, 2);
/* 153 */     this.leg4part3.func_78793_a(4.0F, 10.0F, 1.0F);
/* 154 */     this.leg4part3.func_78787_b(256, 64);
/* 155 */     this.leg4part3.field_78809_i = true;
/* 156 */     setRotation(this.leg4part3, 0.0F, -0.2792527F, 0.6753028F);
/* 157 */     this.leg5 = new ModelRenderer(this, 119, 0);
/* 158 */     this.leg5.func_78789_a(-4.0F, -1.5F, -1.5F, 25, 3, 3);
/* 159 */     this.leg5.func_78793_a(4.0F, 10.0F, 4.0F);
/* 160 */     this.leg5.func_78787_b(256, 64);
/* 161 */     this.leg5.field_78809_i = true;
/* 162 */     setRotation(this.leg5, 0.0F, -1.134359F, 0.3407057F);
/* 163 */     this.leg5part2 = new ModelRenderer(this, 18, 9);
/* 164 */     this.leg5part2.func_78789_a(18.0F, -1.5F, -1.5F, 3, 10, 3);
/* 165 */     this.leg5part2.func_78793_a(4.0F, 10.0F, 4.0F);
/* 166 */     this.leg5part2.func_78787_b(256, 64);
/* 167 */     this.leg5part2.field_78809_i = true;
/* 168 */     setRotation(this.leg5part2, 0.0F, -1.134359F, 0.3407057F);
/* 169 */     this.leg6 = new ModelRenderer(this, 119, 0);
/* 170 */     this.leg6.func_78789_a(-21.0F, -1.5F, -1.5F, 25, 3, 3);
/* 171 */     this.leg6.func_78793_a(-4.0F, 10.0F, 4.0F);
/* 172 */     this.leg6.func_78787_b(256, 64);
/* 173 */     this.leg6.field_78809_i = true;
/* 174 */     setRotation(this.leg6, 0.0F, 1.134359F, -0.3407057F);
/* 175 */     this.leg6part2 = new ModelRenderer(this, 18, 9);
/* 176 */     this.leg6part2.func_78789_a(-21.0F, -1.5F, -1.5F, 3, 10, 3);
/* 177 */     this.leg6part2.func_78793_a(-4.0F, 10.0F, 4.0F);
/* 178 */     this.leg6part2.func_78787_b(256, 64);
/* 179 */     this.leg6part2.field_78809_i = true;
/* 180 */     setRotation(this.leg6part2, 0.0F, 1.134359F, -0.3407057F);
/* 181 */     this.thorax = new ModelRenderer(this, 0, 42);
/* 182 */     this.thorax.func_78789_a(-2.0F, -2.0F, -6.0F, 4, 4, 18);
/* 183 */     this.thorax.func_78793_a(0.0F, 10.0F, 9.0F);
/* 184 */     this.thorax.func_78787_b(256, 64);
/* 185 */     this.thorax.field_78809_i = true;
/* 186 */     setRotation(this.thorax, -0.2602503F, 0.0F, 0.0F);
/* 187 */     this.abdomen = new ModelRenderer(this, 118, 18);
/* 188 */     this.abdomen.func_78789_a(-3.0F, -3.0F, 0.0F, 6, 6, 16);
/* 189 */     this.abdomen.func_78793_a(0.0F, 13.0F, 20.0F);
/* 190 */     this.abdomen.func_78787_b(256, 64);
/* 191 */     this.abdomen.field_78809_i = true;
/* 192 */     setRotation(this.abdomen, 0.0F, 0.0F, 0.0F);
/* 193 */     this.head = new ModelRenderer(this, 27, 48);
/* 194 */     this.head.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 6, 5);
/* 195 */     this.head.func_78793_a(0.0F, 10.0F, -8.0F);
/* 196 */     this.head.func_78787_b(256, 64);
/* 197 */     this.head.field_78809_i = true;
/* 198 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 199 */     this.jaw1 = new ModelRenderer(this, 96, 31);
/* 200 */     this.jaw1.func_78789_a(-1.0F, -1.0F, -13.0F, 1, 2, 14);
/* 201 */     this.jaw1.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 202 */     this.jaw1.func_78787_b(256, 64);
/* 203 */     this.jaw1.field_78809_i = true;
/* 204 */     setRotation(this.jaw1, 0.0F, 0.4089647F, 0.0F);
/* 205 */     this.jaw1part2 = new ModelRenderer(this, 39, 17);
/* 206 */     this.jaw1part2.func_78789_a(-1.1F, -2.0F, -5.0F, 1, 4, 5);
/* 207 */     this.jaw1part2.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 208 */     this.jaw1part2.func_78787_b(256, 64);
/* 209 */     this.jaw1part2.field_78809_i = true;
/* 210 */     setRotation(this.jaw1part2, 0.0F, 0.4089647F, 0.0F);
/* 211 */     this.jaw1tooth1 = new ModelRenderer(this, 39, 27);
/* 212 */     this.jaw1tooth1.func_78789_a(0.0F, -0.5F, -13.0F, 1, 1, 1);
/* 213 */     this.jaw1tooth1.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 214 */     this.jaw1tooth1.func_78787_b(256, 64);
/* 215 */     this.jaw1tooth1.field_78809_i = true;
/* 216 */     setRotation(this.jaw1tooth1, 0.0F, 0.4089647F, 0.0F);
/* 217 */     this.jaw1tooth2 = new ModelRenderer(this, 39, 27);
/* 218 */     this.jaw1tooth2.func_78789_a(0.0F, -0.5F, -11.0F, 1, 1, 1);
/* 219 */     this.jaw1tooth2.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 220 */     this.jaw1tooth2.func_78787_b(256, 64);
/* 221 */     this.jaw1tooth2.field_78809_i = true;
/* 222 */     setRotation(this.jaw1tooth2, 0.0F, 0.4089647F, 0.0F);
/* 223 */     this.jaw1tooth3 = new ModelRenderer(this, 39, 27);
/* 224 */     this.jaw1tooth3.func_78789_a(0.0F, -0.5F, -9.0F, 1, 1, 1);
/* 225 */     this.jaw1tooth3.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 226 */     this.jaw1tooth3.func_78787_b(256, 64);
/* 227 */     this.jaw1tooth3.field_78809_i = true;
/* 228 */     setRotation(this.jaw1tooth3, 0.0F, 0.4089647F, 0.0F);
/* 229 */     this.jaw1tooth4 = new ModelRenderer(this, 39, 27);
/* 230 */     this.jaw1tooth4.func_78789_a(0.0F, -0.5F, -7.0F, 1, 1, 1);
/* 231 */     this.jaw1tooth4.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 232 */     this.jaw1tooth4.func_78787_b(256, 64);
/* 233 */     this.jaw1tooth4.field_78809_i = true;
/* 234 */     setRotation(this.jaw1tooth4, 0.0F, 0.4089647F, 0.0F);
/* 235 */     this.jaw1tooth5 = new ModelRenderer(this, 39, 27);
/* 236 */     this.jaw1tooth5.func_78789_a(0.0F, -1.5F, -4.5F, 1, 1, 1);
/* 237 */     this.jaw1tooth5.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 238 */     this.jaw1tooth5.func_78787_b(256, 64);
/* 239 */     this.jaw1tooth5.field_78809_i = true;
/* 240 */     setRotation(this.jaw1tooth5, 0.0F, 0.4089647F, 0.0F);
/* 241 */     this.jaw1tooth6 = new ModelRenderer(this, 39, 27);
/* 242 */     this.jaw1tooth6.func_78789_a(0.0F, 0.5F, -4.5F, 1, 1, 1);
/* 243 */     this.jaw1tooth6.func_78793_a(-2.0F, 10.0F, -8.0F);
/* 244 */     this.jaw1tooth6.func_78787_b(256, 64);
/* 245 */     this.jaw1tooth6.field_78809_i = true;
/* 246 */     setRotation(this.jaw1tooth6, 0.0F, 0.4089647F, 0.0F);
/* 247 */     this.jaw2 = new ModelRenderer(this, 96, 48);
/* 248 */     this.jaw2.func_78789_a(0.0F, -1.0F, -13.0F, 1, 2, 14);
/* 249 */     this.jaw2.func_78793_a(2.0F, 10.0F, -8.0F);
/* 250 */     this.jaw2.func_78787_b(256, 64);
/* 251 */     this.jaw2.field_78809_i = true;
/* 252 */     setRotation(this.jaw2, 0.0F, -0.4089656F, 0.0F);
/* 253 */     this.jaw2part2 = new ModelRenderer(this, 39, 7);
/* 254 */     this.jaw2part2.func_78789_a(0.1F, -2.0F, -5.0F, 1, 4, 5);
/* 255 */     this.jaw2part2.func_78793_a(2.0F, 10.0F, -8.0F);
/* 256 */     this.jaw2part2.func_78787_b(256, 64);
/* 257 */     this.jaw2part2.field_78809_i = true;
/* 258 */     setRotation(this.jaw2part2, 0.0F, -0.4089656F, 0.0F);
/* 259 */     this.jaw2tooth1 = new ModelRenderer(this, 96, 48);
/* 260 */     this.jaw2tooth1.func_78789_a(-1.0F, -0.5F, -13.0F, 1, 1, 1);
/* 261 */     this.jaw2tooth1.func_78793_a(2.0F, 10.0F, -8.0F);
/* 262 */     this.jaw2tooth1.func_78787_b(256, 64);
/* 263 */     this.jaw2tooth1.field_78809_i = true;
/* 264 */     setRotation(this.jaw2tooth1, 0.0F, -0.4089656F, 0.0F);
/* 265 */     this.jaw2tooth2 = new ModelRenderer(this, 96, 48);
/* 266 */     this.jaw2tooth2.func_78789_a(-1.0F, -0.5F, -11.0F, 1, 1, 1);
/* 267 */     this.jaw2tooth2.func_78793_a(2.0F, 10.0F, -8.0F);
/* 268 */     this.jaw2tooth2.func_78787_b(256, 64);
/* 269 */     this.jaw2tooth2.field_78809_i = true;
/* 270 */     setRotation(this.jaw2tooth2, 0.0F, -0.4089656F, 0.0F);
/* 271 */     this.jaw2tooth3 = new ModelRenderer(this, 96, 48);
/* 272 */     this.jaw2tooth3.func_78789_a(-1.0F, -0.5F, -9.0F, 1, 1, 1);
/* 273 */     this.jaw2tooth3.func_78793_a(2.0F, 10.0F, -8.0F);
/* 274 */     this.jaw2tooth3.func_78787_b(256, 64);
/* 275 */     this.jaw2tooth3.field_78809_i = true;
/* 276 */     setRotation(this.jaw2tooth3, 0.0F, -0.4089656F, 0.0F);
/* 277 */     this.jaw2tooth4 = new ModelRenderer(this, 96, 48);
/* 278 */     this.jaw2tooth4.func_78789_a(-1.0F, -0.5F, -7.0F, 1, 1, 1);
/* 279 */     this.jaw2tooth4.func_78793_a(2.0F, 10.0F, -8.0F);
/* 280 */     this.jaw2tooth4.func_78787_b(256, 64);
/* 281 */     this.jaw2tooth4.field_78809_i = true;
/* 282 */     setRotation(this.jaw2tooth4, 0.0F, -0.4089656F, 0.0F);
/* 283 */     this.jaw2tooth5 = new ModelRenderer(this, 96, 48);
/* 284 */     this.jaw2tooth5.func_78789_a(-1.0F, -1.5F, -4.5F, 1, 1, 1);
/* 285 */     this.jaw2tooth5.func_78793_a(2.0F, 10.0F, -8.0F);
/* 286 */     this.jaw2tooth5.func_78787_b(256, 64);
/* 287 */     this.jaw2tooth5.field_78809_i = true;
/* 288 */     setRotation(this.jaw2tooth5, 0.0F, -0.4089656F, 0.0F);
/* 289 */     this.jaw2tooth6 = new ModelRenderer(this, 96, 48);
/* 290 */     this.jaw2tooth6.func_78789_a(-1.0F, 0.5F, -4.5F, 1, 1, 1);
/* 291 */     this.jaw2tooth6.func_78793_a(2.0F, 10.0F, -8.0F);
/* 292 */     this.jaw2tooth6.func_78787_b(256, 64);
/* 293 */     this.jaw2tooth6.field_78809_i = true;
/* 294 */     setRotation(this.jaw2tooth6, 0.0F, -0.4089656F, 0.0F);
/* 295 */     this.jaw3 = new ModelRenderer(this, 95, 16);
/* 296 */     this.jaw3.func_78789_a(-1.0F, -1.0F, -13.0F, 2, 1, 14);
/* 297 */     this.jaw3.func_78793_a(0.0F, 8.0F, -8.0F);
/* 298 */     this.jaw3.func_78787_b(256, 64);
/* 299 */     this.jaw3.field_78809_i = true;
/* 300 */     setRotation(this.jaw3, -0.4089647F, 0.0F, 0.0F);
/* 301 */     this.jaw3part2 = new ModelRenderer(this, 0, 27);
/* 302 */     this.jaw3part2.func_78789_a(-2.0F, -1.0F, -5.0F, 4, 1, 5);
/* 303 */     this.jaw3part2.func_78793_a(0.0F, 7.9F, -8.0F);
/* 304 */     this.jaw3part2.func_78787_b(256, 64);
/* 305 */     this.jaw3part2.field_78809_i = true;
/* 306 */     setRotation(this.jaw3part2, -0.4089647F, 0.0F, 0.0F);
/* 307 */     this.jaw3tooth1 = new ModelRenderer(this, 95, 16);
/* 308 */     this.jaw3tooth1.func_78789_a(-0.5F, 0.0F, -13.0F, 1, 1, 1);
/* 309 */     this.jaw3tooth1.func_78793_a(0.0F, 8.0F, -8.0F);
/* 310 */     this.jaw3tooth1.func_78787_b(256, 64);
/* 311 */     this.jaw3tooth1.field_78809_i = true;
/* 312 */     setRotation(this.jaw3tooth1, -0.4089647F, 0.0F, 0.0F);
/* 313 */     this.jaw3tooth2 = new ModelRenderer(this, 95, 16);
/* 314 */     this.jaw3tooth2.func_78789_a(-0.5F, 0.0F, -11.0F, 1, 1, 1);
/* 315 */     this.jaw3tooth2.func_78793_a(0.0F, 8.0F, -8.0F);
/* 316 */     this.jaw3tooth2.func_78787_b(256, 64);
/* 317 */     this.jaw3tooth2.field_78809_i = true;
/* 318 */     setRotation(this.jaw3tooth2, -0.4089647F, 0.0F, 0.0F);
/* 319 */     this.jaw3tooth3 = new ModelRenderer(this, 95, 16);
/* 320 */     this.jaw3tooth3.func_78789_a(-0.5F, 0.0F, -9.0F, 1, 1, 1);
/* 321 */     this.jaw3tooth3.func_78793_a(0.0F, 8.0F, -8.0F);
/* 322 */     this.jaw3tooth3.func_78787_b(256, 64);
/* 323 */     this.jaw3tooth3.field_78809_i = true;
/* 324 */     setRotation(this.jaw3tooth3, -0.4089647F, 0.0F, 0.0F);
/* 325 */     this.jaw3tooth4 = new ModelRenderer(this, 95, 16);
/* 326 */     this.jaw3tooth4.func_78789_a(-0.5F, 0.0F, -7.0F, 1, 1, 1);
/* 327 */     this.jaw3tooth4.func_78793_a(0.0F, 8.0F, -8.0F);
/* 328 */     this.jaw3tooth4.func_78787_b(256, 64);
/* 329 */     this.jaw3tooth4.field_78809_i = true;
/* 330 */     setRotation(this.jaw3tooth4, -0.4089647F, 0.0F, 0.0F);
/* 331 */     this.jaw3tooth5 = new ModelRenderer(this, 95, 16);
/* 332 */     this.jaw3tooth5.func_78789_a(-1.5F, 0.0F, -4.5F, 1, 1, 1);
/* 333 */     this.jaw3tooth5.func_78793_a(0.0F, 8.0F, -8.0F);
/* 334 */     this.jaw3tooth5.func_78787_b(256, 64);
/* 335 */     this.jaw3tooth5.field_78809_i = true;
/* 336 */     setRotation(this.jaw3tooth5, -0.4089647F, 0.0F, 0.0F);
/* 337 */     this.jaw3tooth6 = new ModelRenderer(this, 95, 16);
/* 338 */     this.jaw3tooth6.func_78789_a(0.5F, 0.0F, -4.5F, 1, 1, 1);
/* 339 */     this.jaw3tooth6.func_78793_a(0.0F, 8.0F, -8.0F);
/* 340 */     this.jaw3tooth6.func_78787_b(256, 64);
/* 341 */     this.jaw3tooth6.field_78809_i = true;
/* 342 */     setRotation(this.jaw3tooth6, -0.4089647F, 0.0F, 0.0F);
/* 343 */     this.jaw4 = new ModelRenderer(this, 95, 0);
/* 344 */     this.jaw4.func_78789_a(-1.0F, 0.0F, -13.0F, 2, 1, 14);
/* 345 */     this.jaw4.func_78793_a(0.0F, 12.0F, -8.0F);
/* 346 */     this.jaw4.func_78787_b(256, 64);
/* 347 */     this.jaw4.field_78809_i = true;
/* 348 */     setRotation(this.jaw4, 0.4089656F, 0.0F, 0.0F);
/* 349 */     this.jaw4part2 = new ModelRenderer(this, 0, 20);
/* 350 */     this.jaw4part2.func_78789_a(-2.0F, 0.0F, -5.0F, 4, 1, 5);
/* 351 */     this.jaw4part2.func_78793_a(0.0F, 12.1F, -8.0F);
/* 352 */     this.jaw4part2.func_78787_b(256, 64);
/* 353 */     this.jaw4part2.field_78809_i = true;
/* 354 */     setRotation(this.jaw4part2, 0.4089656F, 0.0F, 0.0F);
/* 355 */     this.jaw4tooth1 = new ModelRenderer(this, 95, 0);
/* 356 */     this.jaw4tooth1.func_78789_a(-0.5F, -1.0F, -13.0F, 1, 1, 1);
/* 357 */     this.jaw4tooth1.func_78793_a(0.0F, 12.0F, -8.0F);
/* 358 */     this.jaw4tooth1.func_78787_b(256, 64);
/* 359 */     this.jaw4tooth1.field_78809_i = true;
/* 360 */     setRotation(this.jaw4tooth1, 0.4089656F, 0.0F, 0.0F);
/* 361 */     this.jaw4tooth2 = new ModelRenderer(this, 95, 0);
/* 362 */     this.jaw4tooth2.func_78789_a(-0.5F, -1.0F, -11.0F, 1, 1, 1);
/* 363 */     this.jaw4tooth2.func_78793_a(0.0F, 12.0F, -8.0F);
/* 364 */     this.jaw4tooth2.func_78787_b(256, 64);
/* 365 */     this.jaw4tooth2.field_78809_i = true;
/* 366 */     setRotation(this.jaw4tooth2, 0.4089656F, 0.0F, 0.0F);
/* 367 */     this.jaw4tooth3 = new ModelRenderer(this, 95, 0);
/* 368 */     this.jaw4tooth3.func_78789_a(-0.5F, -1.0F, -9.0F, 1, 1, 1);
/* 369 */     this.jaw4tooth3.func_78793_a(0.0F, 12.0F, -8.0F);
/* 370 */     this.jaw4tooth3.func_78787_b(256, 64);
/* 371 */     this.jaw4tooth3.field_78809_i = true;
/* 372 */     setRotation(this.jaw4tooth3, 0.4089656F, 0.0F, 0.0F);
/* 373 */     this.jaw4tooth4 = new ModelRenderer(this, 95, 0);
/* 374 */     this.jaw4tooth4.func_78789_a(-0.5F, -1.0F, -7.0F, 1, 1, 1);
/* 375 */     this.jaw4tooth4.func_78793_a(0.0F, 12.0F, -8.0F);
/* 376 */     this.jaw4tooth4.func_78787_b(256, 64);
/* 377 */     this.jaw4tooth4.field_78809_i = true;
/* 378 */     setRotation(this.jaw4tooth4, 0.4089656F, 0.0F, 0.0F);
/* 379 */     this.jaw4tooth5 = new ModelRenderer(this, 95, 0);
/* 380 */     this.jaw4tooth5.func_78789_a(-1.5F, -1.0F, -4.5F, 1, 1, 1);
/* 381 */     this.jaw4tooth5.func_78793_a(0.0F, 12.0F, -8.0F);
/* 382 */     this.jaw4tooth5.func_78787_b(256, 64);
/* 383 */     this.jaw4tooth5.field_78809_i = true;
/* 384 */     setRotation(this.jaw4tooth5, 0.4089656F, 0.0F, 0.0F);
/* 385 */     this.jaw4tooth6 = new ModelRenderer(this, 95, 0);
/* 386 */     this.jaw4tooth6.func_78789_a(0.5F, -1.0F, -4.5F, 1, 1, 1);
/* 387 */     this.jaw4tooth6.func_78793_a(0.0F, 12.0F, -8.0F);
/* 388 */     this.jaw4tooth6.func_78787_b(256, 64);
/* 389 */     this.jaw4tooth6.field_78809_i = true;
/* 390 */     setRotation(this.jaw4tooth6, 0.4089656F, 0.0F, 0.0F);
/* 391 */     this.tonguepart1 = new ModelRenderer(this, 24, 34);
/* 392 */     this.tonguepart1.func_78789_a(-0.5F, -0.5F, -5.0F, 1, 1, 5);
/* 393 */     this.tonguepart1.func_78793_a(1.6F, 9.3F, -15.0F);
/* 394 */     this.tonguepart1.func_78787_b(256, 64);
/* 395 */     this.tonguepart1.field_78809_i = true;
/* 396 */     setRotation(this.tonguepart1, 1.041001F, 1.264073F, -1.07818F);
/* 397 */     this.tonguepart2 = new ModelRenderer(this, 0, 46);
/* 398 */     this.tonguepart2.func_78789_a(-0.5F, -0.5F, -5.0F, 1, 1, 5);
/* 399 */     this.tonguepart2.func_78793_a(0.0F, 10.0F, -11.0F);
/* 400 */     this.tonguepart2.func_78787_b(256, 64);
/* 401 */     this.tonguepart2.field_78809_i = true;
/* 402 */     setRotation(this.tonguepart2, -0.1858931F, -0.2230717F, 0.669215F);
/* 403 */     this.tonguepart3 = new ModelRenderer(this, 24, 27);
/* 404 */     this.tonguepart3.func_78789_a(-0.5F, -0.5F, -5.0F, 1, 1, 5);
/* 405 */     this.tonguepart3.func_78793_a(0.2F, 11.3F, -19.0F);
/* 406 */     this.tonguepart3.func_78787_b(256, 64);
/* 407 */     this.tonguepart3.field_78809_i = true;
/* 408 */     setRotation(this.tonguepart3, -0.2602503F, 0.3717861F, -1.07818F);
/* 409 */     this.wing_1 = new ModelRenderer(this, 108, 42);
/* 410 */     this.wing_1.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 22);
/* 411 */     this.wing_1.func_78793_a(-2.0F, 6.0F, -5.0F);
/* 412 */     this.wing_1.func_78787_b(256, 64);
/* 413 */     this.wing_1.field_78809_i = true;
/* 414 */     setRotation(this.wing_1, 0.5948578F, -0.9294653F, 0.0F);
/* 415 */     this.wing_2 = new ModelRenderer(this, 141, 42);
/* 416 */     this.wing_2.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 22);
/* 417 */     this.wing_2.func_78793_a(2.0F, 6.0F, -5.0F);
/* 418 */     this.wing_2.func_78787_b(256, 64);
/* 419 */     this.wing_2.field_78809_i = true;
/* 420 */     setRotation(this.wing_2, 0.5948606F, 0.9294576F, 0.0F);
/* 421 */     this.wing_3 = new ModelRenderer(this, 64, 27);
/* 422 */     this.wing_3.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 0, 18);
/* 423 */     this.wing_3.func_78793_a(-2.0F, 6.0F, -1.0F);
/* 424 */     this.wing_3.func_78787_b(256, 64);
/* 425 */     this.wing_3.field_78809_i = true;
/* 426 */     setRotation(this.wing_3, 0.3346075F, -0.4089647F, 0.0F);
/* 427 */     this.wing_4 = new ModelRenderer(this, 153, 17);
/* 428 */     this.wing_4.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 0, 18);
/* 429 */     this.wing_4.func_78793_a(2.0F, 6.0F, -1.0F);
/* 430 */     this.wing_4.func_78787_b(256, 64);
/* 431 */     this.wing_4.field_78809_i = true;
/* 432 */     setRotation(this.wing_4, 0.3346075F, 0.4089656F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 438 */     LurkingTerror e = (LurkingTerror)entity;
/* 439 */     float newangle = 0.0F;
/* 440 */     float legspeed = 0.7F;
/* 441 */     float mouthspeed = 0.9F;
/* 442 */     RenderInfo r = null;
/* 443 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 444 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 447 */     r = e.getRenderInfo();
/*     */     
/* 449 */     newangle = f2 * legspeed * this.wingspeed % 6.2831855F;
/* 450 */     newangle = Math.abs(newangle);
/*     */     
/* 452 */     if (newangle < r.rf1) {
/*     */       
/* 454 */       r.ri1 = 0;
/* 455 */       if (e.field_70170_p.field_73012_v.nextInt(3) == 1) r.ri1 |= 0x1; 
/* 456 */       if (e.field_70170_p.field_73012_v.nextInt(3) == 1) r.ri1 |= 0x2; 
/* 457 */       if (e.field_70170_p.field_73012_v.nextInt(4) == 1) r.ri1 |= 0x4; 
/* 458 */       if (e.field_70170_p.field_73012_v.nextInt(4) == 1) r.ri1 |= 0x8; 
/* 459 */       if (e.field_70170_p.field_73012_v.nextInt(6) == 1) r.ri1 |= 0x10; 
/* 460 */       if (e.field_70170_p.field_73012_v.nextInt(6) == 1) r.ri1 |= 0x20;
/*     */     
/*     */     } 
/* 463 */     r.rf1 = newangle;
/*     */     
/* 465 */     newangle = f2 * mouthspeed * this.wingspeed % 6.2831855F;
/* 466 */     newangle = Math.abs(newangle);
/*     */     
/* 468 */     if (newangle < r.rf2) {
/*     */       
/* 470 */       r.ri2 = 0;
/* 471 */       if (e.field_70170_p.field_73012_v.nextInt(20) == 1) r.ri2 |= 0x1; 
/* 472 */       if (e.getAttacking() != 0) r.ri2 = 1; 
/*     */     } 
/* 474 */     r.rf2 = newangle;
/*     */ 
/*     */     
/* 477 */     newangle = 0.0F;
/* 478 */     if ((r.ri1 & 0x1) != 0) {
/* 479 */       newangle = MathHelper.func_76126_a(f2 * legspeed * this.wingspeed) * 3.1415927F * 0.25F;
/*     */     }
/* 481 */     this.leg2part2.field_78808_h = 0.191F + newangle;
/* 482 */     this.leg2part3.field_78808_h = 0.675F + newangle;
/* 483 */     newangle = 0.0F;
/* 484 */     if ((r.ri1 & 0x2) != 0) {
/* 485 */       newangle = MathHelper.func_76126_a(f2 * legspeed * this.wingspeed) * 3.1415927F * 0.25F;
/*     */     }
/* 487 */     this.leg1part2.field_78808_h = -0.191F + newangle;
/* 488 */     this.leg1part3.field_78808_h = -0.675F + newangle;
/* 489 */     newangle = 0.0F;
/* 490 */     if ((r.ri1 & 0x4) != 0) {
/* 491 */       newangle = MathHelper.func_76126_a(f2 * legspeed * this.wingspeed) * 3.1415927F * 0.15F;
/*     */     }
/* 493 */     this.leg4part2.field_78808_h = 0.191F + newangle;
/* 494 */     this.leg4part3.field_78808_h = 0.675F + newangle;
/* 495 */     newangle = 0.0F;
/* 496 */     if ((r.ri1 & 0x8) != 0) {
/* 497 */       newangle = MathHelper.func_76126_a(f2 * legspeed * this.wingspeed) * 3.1415927F * 0.15F;
/*     */     }
/* 499 */     this.leg3part2.field_78808_h = -0.191F + newangle;
/* 500 */     this.leg3part3.field_78808_h = -0.675F + newangle;
/* 501 */     newangle = 0.0F;
/* 502 */     if ((r.ri1 & 0x10) != 0) {
/* 503 */       newangle = MathHelper.func_76126_a(f2 * legspeed * this.wingspeed) * 3.1415927F * 0.1F;
/*     */     }
/* 505 */     this.leg6part2.field_78808_h = -0.34F + newangle;
/* 506 */     newangle = 0.0F;
/* 507 */     if ((r.ri1 & 0x20) != 0) {
/* 508 */       newangle = MathHelper.func_76126_a(f2 * legspeed * this.wingspeed) * 3.1415927F * 0.1F;
/*     */     }
/* 510 */     this.leg5part2.field_78808_h = 0.34F + newangle;
/*     */ 
/*     */ 
/*     */     
/* 514 */     newangle = 0.0F;
/* 515 */     if ((r.ri2 & 0x1) != 0) {
/* 516 */       newangle = MathHelper.func_76126_a(f2 * mouthspeed * this.wingspeed) * 3.1415927F * 0.35F;
/* 517 */       newangle = Math.abs(newangle);
/*     */     } 
/* 519 */     this.jaw1.field_78796_g = newangle;
/* 520 */     this.jaw1part2.field_78796_g = newangle;
/* 521 */     this.jaw1tooth5.field_78796_g = newangle;
/* 522 */     this.jaw1tooth6.field_78796_g = newangle;
/* 523 */     this.jaw2.field_78796_g = -newangle;
/* 524 */     this.jaw2part2.field_78796_g = -newangle;
/* 525 */     this.jaw2tooth5.field_78796_g = -newangle;
/* 526 */     this.jaw2tooth6.field_78796_g = -newangle;
/* 527 */     this.jaw3.field_78795_f = -newangle;
/* 528 */     this.jaw3part2.field_78795_f = -newangle;
/* 529 */     this.jaw3tooth5.field_78795_f = -newangle;
/* 530 */     this.jaw3tooth6.field_78795_f = -newangle;
/* 531 */     this.jaw4.field_78795_f = newangle;
/* 532 */     this.jaw4part2.field_78795_f = newangle;
/* 533 */     this.jaw4tooth5.field_78795_f = newangle;
/* 534 */     this.jaw4tooth6.field_78795_f = newangle;
/*     */     
/* 536 */     this.tonguepart3.field_78795_f = 0.0F;
/* 537 */     this.tonguepart3.field_78796_g = 0.0F;
/* 538 */     this.tonguepart3.field_78808_h = 0.0F;
/* 539 */     this.tonguepart3.field_78800_c = this.tonguepart2.field_78800_c;
/* 540 */     this.tonguepart3.field_78797_d = this.tonguepart2.field_78797_d;
/* 541 */     this.tonguepart2.field_78798_e -= newangle * 5.0F;
/* 542 */     this.tonguepart2.field_78798_e -= newangle * 10.0F;
/*     */     
/* 544 */     newangle = MathHelper.func_76126_a(f2 * 0.1F * this.wingspeed) * 3.1415927F * 0.06F;
/* 545 */     this.thorax.field_78795_f = newangle;
/* 546 */     this.abdomen.field_78797_d = (float)(this.thorax.field_78797_d - Math.sin(newangle) * 14.0D);
/*     */     
/* 548 */     newangle = MathHelper.func_76134_b(f2 * 1.4F * this.wingspeed) * 3.1415927F * 0.2F;
/* 549 */     this.wing_1.field_78795_f = 0.455F + newangle;
/* 550 */     this.wing_2.field_78795_f = 0.455F + newangle;
/* 551 */     this.wing_3.field_78795_f = 0.455F - newangle;
/* 552 */     this.wing_4.field_78795_f = 0.455F - newangle;
/*     */ 
/*     */     
/* 555 */     e.setRenderInfo(r);
/*     */     
/* 557 */     this.body.func_78785_a(f5);
/* 558 */     this.leg1.func_78785_a(f5);
/* 559 */     this.leg1part2.func_78785_a(f5);
/* 560 */     this.leg1part3.func_78785_a(f5);
/* 561 */     this.leg2.func_78785_a(f5);
/* 562 */     this.leg2part2.func_78785_a(f5);
/* 563 */     this.leg2part3.func_78785_a(f5);
/* 564 */     this.leg3.func_78785_a(f5);
/* 565 */     this.leg3part2.func_78785_a(f5);
/* 566 */     this.leg3part3.func_78785_a(f5);
/* 567 */     this.leg4.func_78785_a(f5);
/* 568 */     this.leg4part2.func_78785_a(f5);
/* 569 */     this.leg4part3.func_78785_a(f5);
/* 570 */     this.leg5.func_78785_a(f5);
/* 571 */     this.leg5part2.func_78785_a(f5);
/* 572 */     this.leg6.func_78785_a(f5);
/* 573 */     this.leg6part2.func_78785_a(f5);
/* 574 */     this.thorax.func_78785_a(f5);
/* 575 */     this.abdomen.func_78785_a(f5);
/* 576 */     this.head.func_78785_a(f5);
/* 577 */     this.jaw1.func_78785_a(f5);
/* 578 */     this.jaw1part2.func_78785_a(f5);
/* 579 */     this.jaw1tooth1.func_78785_a(f5);
/* 580 */     this.jaw1tooth2.func_78785_a(f5);
/* 581 */     this.jaw1tooth3.func_78785_a(f5);
/* 582 */     this.jaw1tooth4.func_78785_a(f5);
/* 583 */     this.jaw1tooth5.func_78785_a(f5);
/* 584 */     this.jaw1tooth6.func_78785_a(f5);
/* 585 */     this.jaw2.func_78785_a(f5);
/* 586 */     this.jaw2part2.func_78785_a(f5);
/* 587 */     this.jaw2tooth1.func_78785_a(f5);
/* 588 */     this.jaw2tooth2.func_78785_a(f5);
/* 589 */     this.jaw2tooth3.func_78785_a(f5);
/* 590 */     this.jaw2tooth4.func_78785_a(f5);
/* 591 */     this.jaw2tooth5.func_78785_a(f5);
/* 592 */     this.jaw2tooth6.func_78785_a(f5);
/* 593 */     this.jaw3.func_78785_a(f5);
/* 594 */     this.jaw3part2.func_78785_a(f5);
/* 595 */     this.jaw3tooth1.func_78785_a(f5);
/* 596 */     this.jaw3tooth2.func_78785_a(f5);
/* 597 */     this.jaw3tooth3.func_78785_a(f5);
/* 598 */     this.jaw3tooth4.func_78785_a(f5);
/* 599 */     this.jaw3tooth5.func_78785_a(f5);
/* 600 */     this.jaw3tooth6.func_78785_a(f5);
/* 601 */     this.jaw4.func_78785_a(f5);
/* 602 */     this.jaw4part2.func_78785_a(f5);
/* 603 */     this.jaw4tooth1.func_78785_a(f5);
/* 604 */     this.jaw4tooth2.func_78785_a(f5);
/* 605 */     this.jaw4tooth3.func_78785_a(f5);
/* 606 */     this.jaw4tooth4.func_78785_a(f5);
/* 607 */     this.jaw4tooth5.func_78785_a(f5);
/* 608 */     this.jaw4tooth6.func_78785_a(f5);
/* 609 */     this.tonguepart1.func_78785_a(f5);
/* 610 */     this.tonguepart2.func_78785_a(f5);
/* 611 */     this.tonguepart3.func_78785_a(f5);
/* 612 */     this.wing_1.func_78785_a(f5);
/* 613 */     this.wing_2.func_78785_a(f5);
/* 614 */     this.wing_3.func_78785_a(f5);
/* 615 */     this.wing_4.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 622 */     model.field_78795_f = x;
/* 623 */     model.field_78796_g = y;
/* 624 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 629 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelLurkingTerror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */