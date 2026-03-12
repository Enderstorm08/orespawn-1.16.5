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
/*     */ public class ModelDungeonBeast
/*     */   extends ModelBase
/*     */ {
/*  24 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer tail7;
/*     */   
/*     */   ModelRenderer head3;
/*     */   ModelRenderer neck;
/*     */   ModelRenderer lhornbase;
/*     */   ModelRenderer leye;
/*     */   ModelRenderer ljaw3;
/*     */   ModelRenderer ljaw1;
/*     */   ModelRenderer ljaw2;
/*     */   ModelRenderer rjaw1;
/*     */   ModelRenderer rjaw2;
/*     */   ModelRenderer rjaw3;
/*     */   ModelRenderer t1s3;
/*     */   ModelRenderer rshoulder;
/*     */   ModelRenderer rheel;
/*     */   ModelRenderer lshoulder;
/*     */   ModelRenderer rleg1;
/*     */   ModelRenderer rleg2;
/*     */   ModelRenderer lleg1;
/*     */   ModelRenderer lleg2;
/*     */   ModelRenderer rfoot;
/*     */   ModelRenderer ltoe3;
/*     */   ModelRenderer ltoe2;
/*     */   ModelRenderer ltoe1;
/*     */   ModelRenderer head1;
/*     */   ModelRenderer horn2;
/*     */   ModelRenderer rhornbase;
/*     */   ModelRenderer rh1;
/*     */   ModelRenderer lh1;
/*     */   ModelRenderer lh2;
/*     */   ModelRenderer rh2;
/*     */   ModelRenderer rh3;
/*     */   ModelRenderer lh3;
/*     */   ModelRenderer lh4;
/*     */   ModelRenderer rh4;
/*     */   ModelRenderer horn1;
/*     */   ModelRenderer t2s3;
/*     */   ModelRenderer tail3;
/*     */   ModelRenderer t4s1;
/*     */   ModelRenderer t6s1;
/*     */   ModelRenderer tail6;
/*     */   ModelRenderer body;
/*     */   ModelRenderer bodys1;
/*     */   ModelRenderer bodys2;
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer bodys3;
/*     */   ModelRenderer t1s1;
/*     */   ModelRenderer t1s2;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer t3s2;
/*     */   ModelRenderer t2s2;
/*     */   ModelRenderer t2s1;
/*     */   ModelRenderer t3s1;
/*     */   ModelRenderer tail4;
/*     */   ModelRenderer tail5;
/*     */   ModelRenderer t5s1;
/*     */   ModelRenderer head2;
/*     */   ModelRenderer reye;
/*     */   ModelRenderer lfoot;
/*     */   ModelRenderer rfoot2;
/*     */   ModelRenderer lfoot2;
/*     */   ModelRenderer lheel;
/*     */   ModelRenderer rtoe3;
/*     */   ModelRenderer rtoe2;
/*     */   ModelRenderer rtoe1;
/*     */   
/*     */   public ModelDungeonBeast(float f1) {
/*  93 */     this.wingspeed = f1;
/*     */     
/*  95 */     this.field_78090_t = 128;
/*  96 */     this.field_78089_u = 64;
/*     */     
/*  98 */     this.tail7 = new ModelRenderer(this, 0, 0);
/*  99 */     this.tail7.func_78789_a(-1.0F, -0.5F, -0.5333334F, 3, 1, 1);
/* 100 */     this.tail7.func_78793_a(-24.0F, 23.5F, 0.0F);
/* 101 */     this.tail7.func_78787_b(64, 32);
/* 102 */     this.tail7.field_78809_i = true;
/* 103 */     setRotation(this.tail7, 0.0F, 0.0F, 3.141593F);
/* 104 */     this.head3 = new ModelRenderer(this, 0, 0);
/* 105 */     this.head3.func_78789_a(2.0F, -2.466667F, 4.3F, 4, 4, 2);
/* 106 */     this.head3.func_78793_a(5.0F, 15.0F, 0.0F);
/* 107 */     this.head3.func_78787_b(64, 32);
/* 108 */     this.head3.field_78809_i = true;
/* 109 */     setRotation(this.head3, 0.0F, 0.8028515F, 0.0F);
/* 110 */     this.neck = new ModelRenderer(this, 0, 0);
/* 111 */     this.neck.func_78789_a(0.0F, -1.5F, -2.533333F, 3, 3, 5);
/* 112 */     this.neck.func_78793_a(5.0F, 15.0F, 0.0F);
/* 113 */     this.neck.func_78787_b(64, 32);
/* 114 */     this.neck.field_78809_i = true;
/* 115 */     setRotation(this.neck, 0.0F, 0.0F, -0.1745329F);
/* 116 */     this.lhornbase = new ModelRenderer(this, 0, 0);
/* 117 */     this.lhornbase.func_78789_a(2.5F, -3.0F, 0.5F, 3, 1, 2);
/* 118 */     this.lhornbase.func_78793_a(5.0F, 15.0F, 0.0F);
/* 119 */     this.lhornbase.func_78787_b(64, 32);
/* 120 */     this.lhornbase.field_78809_i = true;
/* 121 */     setRotation(this.lhornbase, 0.0F, 0.0F, 0.0F);
/* 122 */     this.leye = new ModelRenderer(this, 14, 15);
/* 123 */     this.leye.func_78789_a(3.0F, -1.466667F, 3.3F, 2, 1, 2);
/* 124 */     this.leye.func_78793_a(5.0F, 15.0F, 0.0F);
/* 125 */     this.leye.func_78787_b(64, 32);
/* 126 */     this.leye.field_78809_i = true;
/* 127 */     setRotation(this.leye, 0.0F, 0.4363323F, 0.0F);
/* 128 */     this.ljaw3 = new ModelRenderer(this, 10, 28);
/* 129 */     this.ljaw3.func_78789_a(3.5F, 0.0F, 1.5F, 1, 1, 1);
/* 130 */     this.ljaw3.func_78793_a(10.0F, 16.0F, 2.0F);
/* 131 */     this.ljaw3.func_78787_b(64, 32);
/* 132 */     this.ljaw3.field_78809_i = true;
/* 133 */     setRotation(this.ljaw3, 0.0F, 0.5235988F, 0.0F);
/* 134 */     this.ljaw1 = new ModelRenderer(this, 10, 20);
/* 135 */     this.ljaw1.func_78789_a(0.0F, 0.0F, -1.466667F, 3, 1, 2);
/* 136 */     this.ljaw1.func_78793_a(10.0F, 16.0F, 2.0F);
/* 137 */     this.ljaw1.func_78787_b(64, 32);
/* 138 */     this.ljaw1.field_78809_i = true;
/* 139 */     setRotation(this.ljaw1, 0.0F, -0.3490659F, 0.0F);
/* 140 */     this.ljaw2 = new ModelRenderer(this, 10, 24);
/* 141 */     this.ljaw2.func_78789_a(2.0F, 0.0F, 0.3F, 2, 1, 2);
/* 142 */     this.ljaw2.func_78793_a(10.0F, 16.0F, 2.0F);
/* 143 */     this.ljaw2.func_78787_b(64, 32);
/* 144 */     this.ljaw2.field_78809_i = true;
/* 145 */     setRotation(this.ljaw2, 0.0F, 0.3490659F, 0.0F);
/* 146 */     this.rjaw1 = new ModelRenderer(this, 10, 20);
/* 147 */     this.rjaw1.func_78789_a(0.0F, 0.0F, -0.4666667F, 3, 1, 2);
/* 148 */     this.rjaw1.func_78793_a(10.0F, 16.0F, -2.0F);
/* 149 */     this.rjaw1.func_78787_b(64, 32);
/* 150 */     this.rjaw1.field_78809_i = true;
/* 151 */     setRotation(this.rjaw1, 0.0F, 0.3490659F, 0.0F);
/* 152 */     this.rjaw2 = new ModelRenderer(this, 10, 24);
/* 153 */     this.rjaw2.func_78789_a(2.0F, 0.0F, -2.3F, 2, 1, 2);
/* 154 */     this.rjaw2.func_78793_a(10.0F, 16.0F, -2.0F);
/* 155 */     this.rjaw2.func_78787_b(64, 32);
/* 156 */     this.rjaw2.field_78809_i = true;
/* 157 */     setRotation(this.rjaw2, 0.0F, -0.3490659F, 0.0F);
/* 158 */     this.rjaw3 = new ModelRenderer(this, 10, 28);
/* 159 */     this.rjaw3.func_78789_a(3.5F, 0.0F, -2.5F, 1, 1, 1);
/* 160 */     this.rjaw3.func_78793_a(10.0F, 16.0F, -2.0F);
/* 161 */     this.rjaw3.func_78787_b(64, 32);
/* 162 */     this.rjaw3.field_78809_i = true;
/* 163 */     setRotation(this.rjaw3, 0.0F, -0.5235988F, 0.0F);
/* 164 */     this.t1s3 = new ModelRenderer(this, 75, 0);
/* 165 */     this.t1s3.func_78789_a(-3.0F, -7.0F, -0.5F, 1, 4, 1);
/* 166 */     this.t1s3.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 167 */     this.t1s3.func_78787_b(64, 32);
/* 168 */     this.t1s3.field_78809_i = true;
/* 169 */     setRotation(this.t1s3, 0.0F, 0.0F, -0.8726646F);
/* 170 */     this.rshoulder = new ModelRenderer(this, 0, 0);
/* 171 */     this.rshoulder.func_78789_a(2.0F, -2.2F, -5.0F, 4, 4, 2);
/* 172 */     this.rshoulder.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 173 */     this.rshoulder.func_78787_b(64, 32);
/* 174 */     this.rshoulder.field_78809_i = true;
/* 175 */     setRotation(this.rshoulder, 0.0F, 0.0F, 0.0F);
/* 176 */     this.rheel = new ModelRenderer(this, 0, 0);
/* 177 */     this.rheel.func_78789_a(-2.3F, 0.3F, 6.0F, 1, 1, 1);
/* 178 */     this.rheel.func_78793_a(3.0F, 17.0F, -7.0F);
/* 179 */     this.rheel.func_78787_b(64, 32);
/* 180 */     this.rheel.field_78809_i = true;
/* 181 */     setRotation(this.rheel, -1.570796F, 0.0F, 0.0F);
/* 182 */     this.lshoulder = new ModelRenderer(this, 0, 0);
/* 183 */     this.lshoulder.func_78789_a(2.0F, -2.2F, 3.0F, 4, 4, 2);
/* 184 */     this.lshoulder.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 185 */     this.lshoulder.func_78787_b(64, 32);
/* 186 */     this.lshoulder.field_78809_i = true;
/* 187 */     setRotation(this.lshoulder, 0.0F, 0.0F, 0.0F);
/* 188 */     this.rleg1 = new ModelRenderer(this, 0, 0);
/* 189 */     this.rleg1.func_78789_a(-1.466667F, -2.0F, -5.0F, 3, 3, 6);
/* 190 */     this.rleg1.func_78793_a(3.0F, 15.0F, -4.0F);
/* 191 */     this.rleg1.func_78787_b(64, 32);
/* 192 */     this.rleg1.field_78809_i = true;
/* 193 */     setRotation(this.rleg1, 0.6981317F, 0.0F, 0.0F);
/* 194 */     this.rleg2 = new ModelRenderer(this, 0, 0);
/* 195 */     this.rleg2.func_78789_a(-1.0F, -0.2F, 0.0F, 2, 2, 6);
/* 196 */     this.rleg2.func_78793_a(3.0F, 17.0F, -7.0F);
/* 197 */     this.rleg2.func_78787_b(64, 32);
/* 198 */     this.rleg2.field_78809_i = true;
/* 199 */     setRotation(this.rleg2, -1.570796F, 0.0F, 0.0F);
/* 200 */     this.lleg1 = new ModelRenderer(this, 0, 0);
/* 201 */     this.lleg1.func_78789_a(-1.466667F, -2.0F, -1.0F, 3, 3, 6);
/* 202 */     this.lleg1.func_78793_a(3.0F, 15.0F, 4.0F);
/* 203 */     this.lleg1.func_78787_b(64, 32);
/* 204 */     this.lleg1.field_78809_i = true;
/* 205 */     setRotation(this.lleg1, -0.6981317F, 0.0F, 0.0F);
/* 206 */     this.lleg2 = new ModelRenderer(this, 0, 0);
/* 207 */     this.lleg2.func_78789_a(-1.0F, -1.8F, 0.0F, 2, 2, 6);
/* 208 */     this.lleg2.func_78793_a(3.0F, 17.0F, 7.0F);
/* 209 */     this.lleg2.func_78787_b(64, 32);
/* 210 */     this.lleg2.field_78809_i = true;
/* 211 */     setRotation(this.lleg2, -1.570796F, 0.0F, 0.0F);
/* 212 */     this.rfoot = new ModelRenderer(this, 0, 0);
/* 213 */     this.rfoot.func_78789_a(-1.5F, -0.7F, 5.0F, 3, 3, 2);
/* 214 */     this.rfoot.func_78793_a(3.0F, 17.0F, -7.0F);
/* 215 */     this.rfoot.func_78787_b(64, 32);
/* 216 */     this.rfoot.field_78809_i = true;
/* 217 */     setRotation(this.rfoot, -1.570796F, 0.0F, 0.0F);
/* 218 */     this.ltoe3 = new ModelRenderer(this, 32, 0);
/* 219 */     this.ltoe3.func_78789_a(-3.7F, -1.5F, 4.5F, 1, 1, 2);
/* 220 */     this.ltoe3.func_78793_a(3.0F, 17.0F, 7.0F);
/* 221 */     this.ltoe3.func_78787_b(64, 32);
/* 222 */     this.ltoe3.field_78809_i = true;
/* 223 */     setRotation(this.ltoe3, -1.570796F, 0.7853982F, -0.7853982F);
/* 224 */     this.ltoe2 = new ModelRenderer(this, 32, 0);
/* 225 */     this.ltoe2.func_78789_a(-3.0F, -1.3F, 5.2F, 1, 1, 2);
/* 226 */     this.ltoe2.func_78793_a(3.0F, 17.0F, 7.0F);
/* 227 */     this.ltoe2.func_78787_b(64, 32);
/* 228 */     this.ltoe2.field_78809_i = true;
/* 229 */     setRotation(this.ltoe2, -1.570796F, 0.0F, -0.7853982F);
/* 230 */     this.ltoe1 = new ModelRenderer(this, 32, 0);
/* 231 */     this.ltoe1.func_78789_a(-3.0F, -0.6F, 5.2F, 1, 1, 2);
/* 232 */     this.ltoe1.func_78793_a(3.0F, 17.0F, 7.0F);
/* 233 */     this.ltoe1.func_78787_b(64, 32);
/* 234 */     this.ltoe1.field_78809_i = true;
/* 235 */     setRotation(this.ltoe1, -1.570796F, -0.7853982F, -0.7853982F);
/* 236 */     this.head1 = new ModelRenderer(this, 0, 0);
/* 237 */     this.head1.func_78789_a(2.0F, -2.466667F, -3.0F, 4, 4, 6);
/* 238 */     this.head1.func_78793_a(5.0F, 15.0F, 0.0F);
/* 239 */     this.head1.func_78787_b(64, 32);
/* 240 */     this.head1.field_78809_i = true;
/* 241 */     setRotation(this.head1, 0.0F, 0.0F, 0.0F);
/* 242 */     this.horn2 = new ModelRenderer(this, 75, 6);
/* 243 */     this.horn2.func_78789_a(-7.0F, -4.0F, -0.5F, 1, 2, 1);
/* 244 */     this.horn2.func_78793_a(5.0F, 15.0F, 0.0F);
/* 245 */     this.horn2.func_78787_b(64, 32);
/* 246 */     this.horn2.field_78809_i = true;
/* 247 */     setRotation(this.horn2, 0.0F, 0.0F, 2.181662F);
/* 248 */     this.rhornbase = new ModelRenderer(this, 0, 0);
/* 249 */     this.rhornbase.func_78789_a(2.5F, -3.0F, -2.5F, 3, 1, 2);
/* 250 */     this.rhornbase.func_78793_a(5.0F, 15.0F, 0.0F);
/* 251 */     this.rhornbase.func_78787_b(64, 32);
/* 252 */     this.rhornbase.field_78809_i = true;
/* 253 */     setRotation(this.rhornbase, 0.0F, 0.0F, 0.0F);
/* 254 */     this.rh1 = new ModelRenderer(this, 0, 28);
/* 255 */     this.rh1.func_78789_a(4.0F, -3.0F, -2.5F, 2, 3, 2);
/* 256 */     this.rh1.func_78793_a(5.0F, 15.0F, 0.0F);
/* 257 */     this.rh1.func_78787_b(64, 32);
/* 258 */     this.rh1.field_78809_i = true;
/* 259 */     setRotation(this.rh1, 0.0F, 0.0F, -0.5235988F);
/* 260 */     this.lh1 = new ModelRenderer(this, 0, 28);
/* 261 */     this.lh1.func_78789_a(4.0F, -3.0F, 0.5F, 2, 3, 2);
/* 262 */     this.lh1.func_78793_a(5.0F, 15.0F, 0.0F);
/* 263 */     this.lh1.func_78787_b(64, 32);
/* 264 */     this.lh1.field_78809_i = true;
/* 265 */     setRotation(this.lh1, 0.0F, 0.0F, -0.5235988F);
/* 266 */     this.lh2 = new ModelRenderer(this, 0, 23);
/* 267 */     this.lh2.func_78789_a(5.0F, -4.0F, 1.0F, 1, 3, 1);
/* 268 */     this.lh2.func_78793_a(5.0F, 15.0F, 0.0F);
/* 269 */     this.lh2.func_78787_b(64, 32);
/* 270 */     this.lh2.field_78809_i = true;
/* 271 */     setRotation(this.lh2, 0.0F, 0.0F, -0.8726646F);
/* 272 */     this.rh2 = new ModelRenderer(this, 0, 23);
/* 273 */     this.rh2.func_78789_a(5.0F, -4.0F, -2.0F, 1, 3, 1);
/* 274 */     this.rh2.func_78793_a(5.0F, 15.0F, 0.0F);
/* 275 */     this.rh2.func_78787_b(64, 32);
/* 276 */     this.rh2.field_78809_i = true;
/* 277 */     setRotation(this.rh2, 0.0F, 0.0F, -0.8726646F);
/* 278 */     this.rh3 = new ModelRenderer(this, 0, 19);
/* 279 */     this.rh3.func_78789_a(6.1F, -2.4F, -2.0F, 1, 2, 1);
/* 280 */     this.rh3.func_78793_a(5.0F, 15.0F, 0.0F);
/* 281 */     this.rh3.func_78787_b(64, 32);
/* 282 */     this.rh3.field_78809_i = true;
/* 283 */     setRotation(this.rh3, 0.0F, 0.0F, -1.396263F);
/* 284 */     this.lh3 = new ModelRenderer(this, 0, 19);
/* 285 */     this.lh3.func_78789_a(6.1F, -2.4F, 1.0F, 1, 2, 1);
/* 286 */     this.lh3.func_78793_a(5.0F, 15.0F, 0.0F);
/* 287 */     this.lh3.func_78787_b(64, 32);
/* 288 */     this.lh3.field_78809_i = true;
/* 289 */     setRotation(this.lh3, 0.0F, 0.0F, -1.396263F);
/* 290 */     this.lh4 = new ModelRenderer(this, 0, 15);
/* 291 */     this.lh4.func_78789_a(6.5F, -1.8F, 1.0F, 1, 2, 1);
/* 292 */     this.lh4.func_78793_a(5.0F, 15.0F, 0.0F);
/* 293 */     this.lh4.func_78787_b(64, 32);
/* 294 */     this.lh4.field_78809_i = true;
/* 295 */     setRotation(this.lh4, 0.0F, 0.0F, -1.745329F);
/* 296 */     this.rh4 = new ModelRenderer(this, 0, 15);
/* 297 */     this.rh4.func_78789_a(6.5F, -1.8F, -2.0F, 1, 2, 1);
/* 298 */     this.rh4.func_78793_a(5.0F, 15.0F, 0.0F);
/* 299 */     this.rh4.func_78787_b(64, 32);
/* 300 */     this.rh4.field_78809_i = true;
/* 301 */     setRotation(this.rh4, 0.0F, 0.0F, -1.745329F);
/* 302 */     this.horn1 = new ModelRenderer(this, 75, 6);
/* 303 */     this.horn1.func_78789_a(-8.0F, -2.5F, -0.5F, 1, 2, 1);
/* 304 */     this.horn1.func_78793_a(5.0F, 15.0F, 0.0F);
/* 305 */     this.horn1.func_78787_b(64, 32);
/* 306 */     this.horn1.field_78809_i = true;
/* 307 */     setRotation(this.horn1, 0.0F, 0.0F, 2.617994F);
/* 308 */     this.t2s3 = new ModelRenderer(this, 75, 0);
/* 309 */     this.t2s3.func_78789_a(3.0F, 3.466667F, -0.5333334F, 1, 3, 1);
/* 310 */     this.t2s3.func_78793_a(-6.0F, 17.0F, 0.0F);
/* 311 */     this.t2s3.func_78787_b(64, 32);
/* 312 */     this.t2s3.field_78809_i = true;
/* 313 */     setRotation(this.t2s3, 0.0F, 0.0F, 2.007129F);
/* 314 */     this.tail3 = new ModelRenderer(this, 0, 0);
/* 315 */     this.tail3.func_78789_a(-1.0F, -1.5F, -2.5F, 6, 3, 5);
/* 316 */     this.tail3.func_78793_a(-10.0F, 20.0F, 0.0F);
/* 317 */     this.tail3.func_78787_b(64, 32);
/* 318 */     this.tail3.field_78809_i = true;
/* 319 */     setRotation(this.tail3, 0.0F, 0.0F, 2.530727F);
/* 320 */     this.t4s1 = new ModelRenderer(this, 75, 0);
/* 321 */     this.t4s1.func_78789_a(0.5333334F, 1.533333F, -0.4666667F, 1, 2, 1);
/* 322 */     this.t4s1.func_78793_a(-14.0F, 22.8F, 0.0F);
/* 323 */     this.t4s1.func_78787_b(64, 32);
/* 324 */     this.t4s1.field_78809_i = true;
/* 325 */     setRotation(this.t4s1, 0.0F, 0.0F, 2.356194F);
/* 326 */     this.t6s1 = new ModelRenderer(this, 75, 0);
/* 327 */     this.t6s1.func_78789_a(0.0F, 0.5F, -0.5F, 1, 1, 1);
/* 328 */     this.t6s1.func_78793_a(-21.0F, 23.5F, 0.0F);
/* 329 */     this.t6s1.func_78787_b(64, 32);
/* 330 */     this.t6s1.field_78809_i = true;
/* 331 */     setRotation(this.t6s1, 0.0F, 0.0F, 2.356194F);
/* 332 */     this.tail6 = new ModelRenderer(this, 0, 0);
/* 333 */     this.tail6.func_78789_a(-1.0F, -0.5F, -1.0F, 4, 1, 2);
/* 334 */     this.tail6.func_78793_a(-21.0F, 23.5F, 0.0F);
/* 335 */     this.tail6.func_78787_b(64, 32);
/* 336 */     this.tail6.field_78809_i = true;
/* 337 */     setRotation(this.tail6, 0.0F, 0.0F, 3.141593F);
/* 338 */     this.body = new ModelRenderer(this, 0, 0);
/* 339 */     this.body.func_78789_a(0.0F, -3.0F, -4.0F, 7, 6, 8);
/* 340 */     this.body.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 341 */     this.body.func_78787_b(64, 32);
/* 342 */     this.body.field_78809_i = true;
/* 343 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/* 344 */     this.bodys1 = new ModelRenderer(this, 75, 0);
/* 345 */     this.bodys1.func_78789_a(6.0F, -3.0F, -0.5F, 1, 4, 1);
/* 346 */     this.bodys1.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 347 */     this.bodys1.func_78787_b(64, 32);
/* 348 */     this.bodys1.field_78809_i = true;
/* 349 */     setRotation(this.bodys1, 0.0F, 0.0F, -0.5235988F);
/* 350 */     this.bodys2 = new ModelRenderer(this, 75, 0);
/* 351 */     this.bodys2.func_78789_a(4.0F, -4.0F, -0.5F, 1, 4, 1);
/* 352 */     this.bodys2.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 353 */     this.bodys2.func_78787_b(64, 32);
/* 354 */     this.bodys2.field_78809_i = true;
/* 355 */     setRotation(this.bodys2, 0.0F, 0.0F, -0.5235988F);
/* 356 */     this.tail1 = new ModelRenderer(this, 0, 0);
/* 357 */     this.tail1.func_78789_a(-1.0F, -2.533333F, -3.5F, 7, 5, 7);
/* 358 */     this.tail1.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 359 */     this.tail1.func_78787_b(64, 32);
/* 360 */     this.tail1.field_78809_i = true;
/* 361 */     setRotation(this.tail1, 0.0F, 0.0F, 2.792527F);
/* 362 */     this.bodys3 = new ModelRenderer(this, 75, 0);
/* 363 */     this.bodys3.func_78789_a(2.0F, -5.0F, -0.5F, 1, 4, 1);
/* 364 */     this.bodys3.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 365 */     this.bodys3.func_78787_b(64, 32);
/* 366 */     this.bodys3.field_78809_i = true;
/* 367 */     setRotation(this.bodys3, 0.0F, 0.0F, -0.5235988F);
/* 368 */     this.t1s1 = new ModelRenderer(this, 75, 0);
/* 369 */     this.t1s1.func_78789_a(1.0F, -5.0F, -0.5F, 1, 4, 1);
/* 370 */     this.t1s1.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 371 */     this.t1s1.func_78787_b(64, 32);
/* 372 */     this.t1s1.field_78809_i = true;
/* 373 */     setRotation(this.t1s1, 0.0F, 0.0F, -0.8726646F);
/* 374 */     this.t1s2 = new ModelRenderer(this, 75, 0);
/* 375 */     this.t1s2.func_78789_a(-1.0F, -6.0F, -0.5F, 1, 4, 1);
/* 376 */     this.t1s2.func_78793_a(-1.0F, 15.0F, 0.0F);
/* 377 */     this.t1s2.func_78787_b(64, 32);
/* 378 */     this.t1s2.field_78809_i = true;
/* 379 */     setRotation(this.t1s2, 0.0F, 0.0F, -0.8726646F);
/* 380 */     this.tail2 = new ModelRenderer(this, 0, 0);
/* 381 */     this.tail2.func_78789_a(-1.0F, -2.0F, -3.0F, 7, 4, 6);
/* 382 */     this.tail2.func_78793_a(-6.0F, 17.0F, 0.0F);
/* 383 */     this.tail2.func_78787_b(64, 32);
/* 384 */     this.tail2.field_78809_i = true;
/* 385 */     setRotation(this.tail2, 0.0F, 0.0F, 2.530727F);
/* 386 */     this.t3s2 = new ModelRenderer(this, 75, 0);
/* 387 */     this.t3s2.func_78789_a(2.5F, 2.466667F, -0.5333334F, 1, 3, 1);
/* 388 */     this.t3s2.func_78793_a(-10.0F, 20.0F, 0.0F);
/* 389 */     this.t3s2.func_78787_b(64, 32);
/* 390 */     this.t3s2.field_78809_i = true;
/* 391 */     setRotation(this.t3s2, 0.0F, 0.0F, 2.007129F);
/* 392 */     this.t2s2 = new ModelRenderer(this, 75, 0);
/* 393 */     this.t2s2.func_78789_a(1.0F, 2.466667F, -0.5333334F, 1, 3, 1);
/* 394 */     this.t2s2.func_78793_a(-6.0F, 17.0F, 0.0F);
/* 395 */     this.t2s2.func_78787_b(64, 32);
/* 396 */     this.t2s2.field_78809_i = true;
/* 397 */     setRotation(this.t2s2, 0.0F, 0.0F, 2.007129F);
/* 398 */     this.t2s1 = new ModelRenderer(this, 75, 0);
/* 399 */     this.t2s1.func_78789_a(-1.0F, 1.466667F, -0.5333334F, 1, 3, 1);
/* 400 */     this.t2s1.func_78793_a(-6.0F, 17.0F, 0.0F);
/* 401 */     this.t2s1.func_78787_b(64, 32);
/* 402 */     this.t2s1.field_78809_i = true;
/* 403 */     setRotation(this.t2s1, 0.0F, 0.0F, 2.007129F);
/* 404 */     this.t3s1 = new ModelRenderer(this, 75, 0);
/* 405 */     this.t3s1.func_78789_a(0.5F, 1.466667F, -0.5333334F, 1, 3, 1);
/* 406 */     this.t3s1.func_78793_a(-10.0F, 20.0F, 0.0F);
/* 407 */     this.t3s1.func_78787_b(64, 32);
/* 408 */     this.t3s1.field_78809_i = true;
/* 409 */     setRotation(this.t3s1, 0.0F, 0.0F, 2.007129F);
/* 410 */     this.tail4 = new ModelRenderer(this, 0, 0);
/* 411 */     this.tail4.func_78789_a(-1.0F, -1.0F, -2.0F, 5, 2, 4);
/* 412 */     this.tail4.func_78793_a(-14.0F, 22.8F, 0.0F);
/* 413 */     this.tail4.func_78787_b(64, 32);
/* 414 */     this.tail4.field_78809_i = true;
/* 415 */     setRotation(this.tail4, 0.0F, 0.0F, 3.054326F);
/* 416 */     this.tail5 = new ModelRenderer(this, 0, 0);
/* 417 */     this.tail5.func_78789_a(-1.0F, -0.5F, -1.5F, 4, 1, 3);
/* 418 */     this.tail5.func_78793_a(-18.0F, 23.2F, 0.0F);
/* 419 */     this.tail5.func_78787_b(64, 32);
/* 420 */     this.tail5.field_78809_i = true;
/* 421 */     setRotation(this.tail5, 0.0F, 0.0F, 3.054326F);
/* 422 */     this.t5s1 = new ModelRenderer(this, 75, 0);
/* 423 */     this.t5s1.func_78789_a(0.0F, 0.5F, -0.5F, 1, 2, 1);
/* 424 */     this.t5s1.func_78793_a(-18.0F, 23.2F, 0.0F);
/* 425 */     this.t5s1.func_78787_b(64, 32);
/* 426 */     this.t5s1.field_78809_i = true;
/* 427 */     setRotation(this.t5s1, 0.0F, 0.0F, 2.356194F);
/* 428 */     this.head2 = new ModelRenderer(this, 0, 0);
/* 429 */     this.head2.func_78789_a(2.0F, -2.466667F, -6.3F, 4, 4, 2);
/* 430 */     this.head2.func_78793_a(5.0F, 15.0F, 0.0F);
/* 431 */     this.head2.func_78787_b(64, 32);
/* 432 */     this.head2.field_78809_i = true;
/* 433 */     setRotation(this.head2, 0.0F, -0.8028515F, 0.0F);
/* 434 */     this.reye = new ModelRenderer(this, 5, 15);
/* 435 */     this.reye.func_78789_a(3.0F, -1.466667F, -5.3F, 2, 1, 2);
/* 436 */     this.reye.func_78793_a(5.0F, 15.0F, 0.0F);
/* 437 */     this.reye.func_78787_b(64, 32);
/* 438 */     this.reye.field_78809_i = true;
/* 439 */     setRotation(this.reye, 0.0F, -0.4363323F, 0.0F);
/* 440 */     this.lfoot = new ModelRenderer(this, 0, 0);
/* 441 */     this.lfoot.func_78789_a(-1.5F, -2.3F, 5.0F, 3, 3, 2);
/* 442 */     this.lfoot.func_78793_a(3.0F, 17.0F, 7.0F);
/* 443 */     this.lfoot.func_78787_b(64, 32);
/* 444 */     this.lfoot.field_78809_i = true;
/* 445 */     setRotation(this.lfoot, -1.570796F, 0.0F, 0.0F);
/* 446 */     this.rfoot2 = new ModelRenderer(this, 0, 0);
/* 447 */     this.rfoot2.func_78789_a(0.6F, -1.5F, 5.0F, 2, 2, 2);
/* 448 */     this.rfoot2.func_78793_a(3.0F, 17.0F, -7.0F);
/* 449 */     this.rfoot2.func_78787_b(64, 32);
/* 450 */     this.rfoot2.field_78809_i = true;
/* 451 */     setRotation(this.rfoot2, -1.570796F, 0.7853982F, 0.0F);
/* 452 */     this.lfoot2 = new ModelRenderer(this, 0, 0);
/* 453 */     this.lfoot2.func_78789_a(0.7F, -0.5F, 5.0F, 2, 2, 2);
/* 454 */     this.lfoot2.func_78793_a(3.0F, 17.0F, 7.0F);
/* 455 */     this.lfoot2.func_78787_b(64, 32);
/* 456 */     this.lfoot2.field_78809_i = true;
/* 457 */     setRotation(this.lfoot2, -1.570796F, -0.7853982F, 0.0F);
/* 458 */     this.lheel = new ModelRenderer(this, 0, 0);
/* 459 */     this.lheel.func_78789_a(-2.3F, -1.3F, 6.0F, 1, 1, 1);
/* 460 */     this.lheel.func_78793_a(3.0F, 17.0F, 7.0F);
/* 461 */     this.lheel.func_78787_b(64, 32);
/* 462 */     this.lheel.field_78809_i = true;
/* 463 */     setRotation(this.lheel, -1.570796F, 0.0F, 0.0F);
/* 464 */     this.rtoe3 = new ModelRenderer(this, 32, 0);
/* 465 */     this.rtoe3.func_78789_a(-3.7F, 0.6F, 4.5F, 1, 1, 2);
/* 466 */     this.rtoe3.func_78793_a(3.0F, 17.0F, -7.0F);
/* 467 */     this.rtoe3.func_78787_b(64, 32);
/* 468 */     this.rtoe3.field_78809_i = true;
/* 469 */     setRotation(this.rtoe3, -1.570796F, -0.7853982F, -0.7853982F);
/* 470 */     this.rtoe2 = new ModelRenderer(this, 32, 0);
/* 471 */     this.rtoe2.func_78789_a(-3.0F, 0.3F, 5.2F, 1, 1, 2);
/* 472 */     this.rtoe2.func_78793_a(3.0F, 17.0F, -7.0F);
/* 473 */     this.rtoe2.func_78787_b(64, 32);
/* 474 */     this.rtoe2.field_78809_i = true;
/* 475 */     setRotation(this.rtoe2, -1.570796F, 0.0F, -0.7853982F);
/* 476 */     this.rtoe1 = new ModelRenderer(this, 32, 0);
/* 477 */     this.rtoe1.func_78789_a(-3.0F, -0.6F, 5.2F, 1, 1, 2);
/* 478 */     this.rtoe1.func_78793_a(3.0F, 17.0F, -7.0F);
/* 479 */     this.rtoe1.func_78787_b(64, 32);
/* 480 */     this.rtoe1.field_78809_i = true;
/* 481 */     setRotation(this.rtoe1, -1.570796F, 0.7853982F, -0.7853982F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 487 */     DungeonBeast e = (DungeonBeast)entity;
/* 488 */     RenderInfo r = null;
/* 489 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 490 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 491 */     float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
/* 492 */     float tailamp = 0.0F;
/*     */ 
/*     */     
/* 495 */     float pi4 = 0.39269876F;
/*     */ 
/*     */     
/* 498 */     newangle = MathHelper.func_76134_b(f2 * 1.4F * this.wingspeed) * 3.1415927F * 0.22F * f1;
/* 499 */     this.rheel.field_78808_h = newangle;
/* 500 */     this.rtoe2.field_78808_h = -0.785F + newangle;
/* 501 */     this.lheel.field_78808_h = -newangle;
/* 502 */     this.ltoe2.field_78808_h = -0.785F - newangle;
/*     */     
/* 504 */     this.bodys1.field_78795_f = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.07F;
/* 505 */     this.bodys2.field_78795_f = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + pi4) * 3.1415927F * 0.07F;
/* 506 */     this.bodys3.field_78795_f = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 2.0F * pi4) * 3.1415927F * 0.07F;
/* 507 */     this.t1s1.field_78795_f = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 3.0F * pi4) * 3.1415927F * 0.07F;
/* 508 */     this.t1s2.field_78795_f = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 4.0F * pi4) * 3.1415927F * 0.07F;
/* 509 */     this.t1s3.field_78795_f = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 5.0F * pi4) * 3.1415927F * 0.07F;
/* 510 */     this.t2s1.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 6.0F * pi4) * 3.1415927F * 0.07F;
/* 511 */     this.t2s2.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 7.0F * pi4) * 3.1415927F * 0.07F;
/* 512 */     this.t2s3.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 8.0F * pi4) * 3.1415927F * 0.07F;
/* 513 */     this.t3s1.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 9.0F * pi4) * 3.1415927F * 0.07F;
/* 514 */     this.t3s2.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 10.0F * pi4) * 3.1415927F * 0.07F;
/* 515 */     this.t4s1.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 11.0F * pi4) * 3.1415927F * 0.07F;
/* 516 */     this.t5s1.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 12.0F * pi4) * 3.1415927F * 0.07F;
/* 517 */     this.t6s1.field_78795_f = -MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed + 13.0F * pi4) * 3.1415927F * 0.07F;
/*     */     
/* 519 */     if (e.getAttacking() == 0) {
/* 520 */       tailamp = f1;
/*     */     } else {
/* 522 */       tailamp = 1.25F;
/*     */     } 
/* 524 */     newangle = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.25F * tailamp;
/* 525 */     this.tail1.field_78796_g = newangle * 0.25F;
/* 526 */     this.t1s3.field_78796_g = this.tail1.field_78796_g;
/*     */     
/* 528 */     this.tail2.field_78796_g = newangle * 0.5F;
/* 529 */     this.tail1.field_78800_c -= (float)Math.cos(this.tail1.field_78796_g) * 6.0F;
/* 530 */     this.tail1.field_78798_e -= (float)Math.sin(this.tail1.field_78796_g) * 6.0F;
/* 531 */     this.t2s3.field_78796_g = this.tail2.field_78796_g;
/* 532 */     this.t2s3.field_78798_e = this.tail2.field_78798_e;
/* 533 */     this.t2s3.field_78800_c = this.tail2.field_78800_c;
/*     */     
/* 535 */     this.tail3.field_78796_g = newangle * 0.75F;
/* 536 */     this.tail2.field_78800_c -= (float)Math.cos(this.tail2.field_78796_g) * 5.0F;
/* 537 */     this.tail2.field_78798_e -= (float)Math.sin(this.tail2.field_78796_g) * 5.0F;
/* 538 */     this.t3s2.field_78796_g = this.tail3.field_78796_g;
/* 539 */     this.t3s2.field_78798_e = this.tail3.field_78798_e;
/* 540 */     this.t3s2.field_78800_c = this.tail3.field_78800_c;
/*     */     
/* 542 */     this.tail4.field_78796_g = newangle;
/* 543 */     this.tail3.field_78800_c -= (float)Math.cos(this.tail3.field_78796_g) * 4.5F;
/* 544 */     this.tail3.field_78798_e -= (float)Math.sin(this.tail3.field_78796_g) * 4.5F;
/* 545 */     this.t4s1.field_78796_g = this.tail4.field_78796_g;
/* 546 */     this.t4s1.field_78798_e = this.tail4.field_78798_e;
/* 547 */     this.t4s1.field_78800_c = this.tail4.field_78800_c;
/*     */     
/* 549 */     this.tail5.field_78796_g = newangle * 1.25F;
/* 550 */     this.tail4.field_78800_c -= (float)Math.cos(this.tail4.field_78796_g) * 4.0F;
/* 551 */     this.tail4.field_78798_e -= (float)Math.sin(this.tail4.field_78796_g) * 4.0F;
/* 552 */     this.t5s1.field_78796_g = this.tail5.field_78796_g;
/* 553 */     this.t5s1.field_78798_e = this.tail5.field_78798_e;
/* 554 */     this.t5s1.field_78800_c = this.tail5.field_78800_c;
/*     */     
/* 556 */     this.tail6.field_78796_g = newangle * 1.5F;
/* 557 */     this.tail5.field_78800_c -= (float)Math.cos(this.tail5.field_78796_g) * 3.0F;
/* 558 */     this.tail5.field_78798_e -= (float)Math.sin(this.tail5.field_78796_g) * 3.0F;
/* 559 */     this.t6s1.field_78796_g = this.tail6.field_78796_g;
/* 560 */     this.t6s1.field_78798_e = this.tail6.field_78798_e;
/* 561 */     this.t6s1.field_78800_c = this.tail6.field_78800_c;
/*     */     
/* 563 */     this.tail7.field_78796_g = newangle * 1.75F;
/* 564 */     this.tail6.field_78800_c -= (float)Math.cos(this.tail6.field_78796_g) * 3.0F;
/* 565 */     this.tail6.field_78798_e -= (float)Math.sin(this.tail6.field_78796_g) * 3.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 571 */     r = e.getRenderInfo();
/*     */ 
/*     */     
/* 574 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.15F;
/* 575 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 2.0F * this.wingspeed) * 3.1415927F * 0.15F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 580 */     if (nextangle > 0.0F && newangle < 0.0F)
/*     */     {
/*     */       
/* 583 */       if (e.getAttacking() == 0) {
/* 584 */         r.ri1 = e.field_70170_p.field_73012_v.nextInt(15);
/* 585 */         r.ri2 = e.field_70170_p.field_73012_v.nextInt(15);
/*     */       } else {
/* 587 */         r.ri1 = 0;
/* 588 */         r.ri2 = 0;
/*     */       } 
/*     */     }
/*     */     
/* 592 */     if (r.ri1 == 0) {
/* 593 */       this.ljaw1.field_78796_g = -0.349F + newangle;
/* 594 */       this.ljaw2.field_78796_g = 0.349F + newangle;
/* 595 */       this.ljaw3.field_78796_g = 0.523F + newangle;
/* 596 */       this.rjaw1.field_78796_g = 0.349F - newangle;
/* 597 */       this.rjaw2.field_78796_g = -0.349F - newangle;
/* 598 */       this.rjaw3.field_78796_g = -0.523F - newangle;
/*     */     } else {
/* 600 */       this.ljaw1.field_78796_g = -0.349F;
/* 601 */       this.ljaw2.field_78796_g = 0.349F;
/* 602 */       this.ljaw3.field_78796_g = 0.523F;
/* 603 */       this.rjaw1.field_78796_g = 0.349F;
/* 604 */       this.rjaw2.field_78796_g = -0.349F;
/* 605 */       this.rjaw3.field_78796_g = -0.523F;
/*     */     } 
/*     */ 
/*     */     
/* 609 */     e.setRenderInfo(r);
/*     */     
/* 611 */     GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/*     */     
/* 613 */     this.tail7.func_78785_a(f5);
/* 614 */     this.head3.func_78785_a(f5);
/* 615 */     this.neck.func_78785_a(f5);
/* 616 */     this.lhornbase.func_78785_a(f5);
/* 617 */     this.leye.func_78785_a(f5);
/* 618 */     this.ljaw3.func_78785_a(f5);
/* 619 */     this.ljaw1.func_78785_a(f5);
/* 620 */     this.ljaw2.func_78785_a(f5);
/* 621 */     this.rjaw1.func_78785_a(f5);
/* 622 */     this.rjaw2.func_78785_a(f5);
/* 623 */     this.rjaw3.func_78785_a(f5);
/* 624 */     this.t1s3.func_78785_a(f5);
/* 625 */     this.rshoulder.func_78785_a(f5);
/* 626 */     this.rheel.func_78785_a(f5);
/* 627 */     this.lshoulder.func_78785_a(f5);
/* 628 */     this.rleg1.func_78785_a(f5);
/* 629 */     this.rleg2.func_78785_a(f5);
/* 630 */     this.lleg1.func_78785_a(f5);
/* 631 */     this.lleg2.func_78785_a(f5);
/* 632 */     this.rfoot.func_78785_a(f5);
/*     */     
/* 634 */     this.ltoe2.func_78785_a(f5);
/*     */     
/* 636 */     this.head1.func_78785_a(f5);
/* 637 */     this.horn2.func_78785_a(f5);
/* 638 */     this.rhornbase.func_78785_a(f5);
/* 639 */     this.rh1.func_78785_a(f5);
/* 640 */     this.lh1.func_78785_a(f5);
/* 641 */     this.lh2.func_78785_a(f5);
/* 642 */     this.rh2.func_78785_a(f5);
/* 643 */     this.rh3.func_78785_a(f5);
/* 644 */     this.lh3.func_78785_a(f5);
/* 645 */     this.lh4.func_78785_a(f5);
/* 646 */     this.rh4.func_78785_a(f5);
/* 647 */     this.horn1.func_78785_a(f5);
/* 648 */     this.t2s3.func_78785_a(f5);
/* 649 */     this.tail3.func_78785_a(f5);
/* 650 */     this.t4s1.func_78785_a(f5);
/* 651 */     this.t6s1.func_78785_a(f5);
/* 652 */     this.tail6.func_78785_a(f5);
/* 653 */     this.body.func_78785_a(f5);
/* 654 */     this.bodys1.func_78785_a(f5);
/* 655 */     this.bodys2.func_78785_a(f5);
/* 656 */     this.tail1.func_78785_a(f5);
/* 657 */     this.bodys3.func_78785_a(f5);
/* 658 */     this.t1s1.func_78785_a(f5);
/* 659 */     this.t1s2.func_78785_a(f5);
/* 660 */     this.tail2.func_78785_a(f5);
/* 661 */     this.t3s2.func_78785_a(f5);
/* 662 */     this.t2s2.func_78785_a(f5);
/* 663 */     this.t2s1.func_78785_a(f5);
/* 664 */     this.t3s1.func_78785_a(f5);
/* 665 */     this.tail4.func_78785_a(f5);
/* 666 */     this.tail5.func_78785_a(f5);
/* 667 */     this.t5s1.func_78785_a(f5);
/* 668 */     this.head2.func_78785_a(f5);
/* 669 */     this.reye.func_78785_a(f5);
/* 670 */     this.lfoot.func_78785_a(f5);
/* 671 */     this.rfoot2.func_78785_a(f5);
/* 672 */     this.lfoot2.func_78785_a(f5);
/* 673 */     this.lheel.func_78785_a(f5);
/*     */     
/* 675 */     this.rtoe2.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 682 */     model.field_78795_f = x;
/* 683 */     model.field_78796_g = y;
/* 684 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 690 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelDungeonBeast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */