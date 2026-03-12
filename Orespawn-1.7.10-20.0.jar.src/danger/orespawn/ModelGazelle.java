/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelGazelle
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Chest;
/*     */   
/*     */   ModelRenderer lfleg1;
/*     */   
/*     */   ModelRenderer lrleg2;
/*     */   ModelRenderer lrleg1;
/*     */   ModelRenderer rfleg3;
/*     */   ModelRenderer rrleg2;
/*     */   ModelRenderer rrleg3;
/*     */   ModelRenderer rfleg2;
/*     */   ModelRenderer lrleg4;
/*     */   ModelRenderer tail;
/*     */   ModelRenderer lear;
/*     */   ModelRenderer rrleg1;
/*     */   ModelRenderer rfleg1;
/*     */   ModelRenderer lrleg3;
/*     */   ModelRenderer lfleg2;
/*     */   ModelRenderer rrleg5;
/*     */   ModelRenderer rrleg4;
/*     */   ModelRenderer lfleg3;
/*     */   ModelRenderer rfleg4;
/*     */   ModelRenderer lfleg4;
/*     */   ModelRenderer lrleg5;
/*     */   ModelRenderer Body;
/*     */   ModelRenderer neck;
/*     */   ModelRenderer la3;
/*     */   ModelRenderer throatfluff;
/*     */   ModelRenderer rear;
/*     */   ModelRenderer head;
/*     */   ModelRenderer ra1;
/*     */   ModelRenderer la1;
/*     */   ModelRenderer la2;
/*     */   ModelRenderer ra2;
/*     */   ModelRenderer ra3;
/*     */   ModelRenderer nose;
/*     */   ModelRenderer mouth;
/*     */   
/*     */   public ModelGazelle(float f1) {
/*  50 */     this.wingspeed = f1;
/*     */     
/*  52 */     this.field_78090_t = 64;
/*  53 */     this.field_78089_u = 64;
/*     */     
/*  55 */     this.Chest = new ModelRenderer(this, 12, 57);
/*  56 */     this.Chest.func_78789_a(0.0F, 0.0F, 0.0F, 5, 2, 3);
/*  57 */     this.Chest.func_78793_a(-2.5F, 8.0F, -6.0F);
/*  58 */     this.Chest.func_78787_b(64, 64);
/*  59 */     this.Chest.field_78809_i = true;
/*  60 */     setRotation(this.Chest, 2.342252F, 0.0F, 0.0F);
/*  61 */     this.lfleg1 = new ModelRenderer(this, 0, 31);
/*  62 */     this.lfleg1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 6, 3);
/*  63 */     this.lfleg1.func_78793_a(2.0F, 6.0F, -6.0F);
/*  64 */     this.lfleg1.func_78787_b(64, 64);
/*  65 */     this.lfleg1.field_78809_i = true;
/*  66 */     setRotation(this.lfleg1, 0.2974289F, 0.0F, 0.0F);
/*  67 */     this.lrleg2 = new ModelRenderer(this, 16, 49);
/*  68 */     this.lrleg2.func_78789_a(0.0F, 5.0F, -1.0F, 2, 2, 6);
/*  69 */     this.lrleg2.func_78793_a(2.0F, 4.0F, 3.0F);
/*  70 */     this.lrleg2.func_78787_b(64, 64);
/*  71 */     this.lrleg2.field_78809_i = true;
/*  72 */     setRotation(this.lrleg2, 0.1858931F, 0.0F, 0.0F);
/*  73 */     this.lrleg1 = new ModelRenderer(this, 23, 31);
/*  74 */     this.lrleg1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 6, 3);
/*  75 */     this.lrleg1.func_78793_a(2.0F, 4.0F, 3.0F);
/*  76 */     this.lrleg1.func_78787_b(64, 64);
/*  77 */     this.lrleg1.field_78809_i = true;
/*  78 */     setRotation(this.lrleg1, 0.0F, 0.0F, 0.0F);
/*  79 */     this.rfleg3 = new ModelRenderer(this, 40, 49);
/*  80 */     this.rfleg3.func_78789_a(0.0F, 10.0F, 6.0F, 2, 6, 2);
/*  81 */     this.rfleg3.func_78793_a(-4.0F, 5.966667F, -6.0F);
/*  82 */     this.rfleg3.func_78787_b(64, 64);
/*  83 */     this.rfleg3.field_78809_i = true;
/*  84 */     setRotation(this.rfleg3, -0.4089647F, 0.0F, 0.0F);
/*  85 */     this.rrleg2 = new ModelRenderer(this, 16, 49);
/*  86 */     this.rrleg2.func_78789_a(0.0F, 5.0F, -1.0F, 2, 2, 6);
/*  87 */     this.rrleg2.func_78793_a(-4.0F, 4.0F, 3.0F);
/*  88 */     this.rrleg2.func_78787_b(64, 64);
/*  89 */     this.rrleg2.field_78809_i = true;
/*  90 */     setRotation(this.rrleg2, 0.1858931F, 0.0F, 0.0F);
/*  91 */     this.rrleg3 = new ModelRenderer(this, 32, 11);
/*  92 */     this.rrleg3.func_78789_a(0.0F, 4.0F, 5.0F, 2, 12, 2);
/*  93 */     this.rrleg3.func_78793_a(-4.0F, 3.966667F, 3.0F);
/*  94 */     this.rrleg3.func_78787_b(64, 64);
/*  95 */     this.rrleg3.field_78809_i = true;
/*  96 */     setRotation(this.rrleg3, -0.0743572F, 0.0F, 0.0F);
/*  97 */     this.rfleg2 = new ModelRenderer(this, 24, 11);
/*  98 */     this.rfleg2.func_78789_a(0.0F, 2.0F, 2.0F, 2, 12, 2);
/*  99 */     this.rfleg2.func_78793_a(-4.0F, 5.966667F, -6.0F);
/* 100 */     this.rfleg2.func_78787_b(64, 64);
/* 101 */     this.rfleg2.field_78809_i = true;
/* 102 */     setRotation(this.rfleg2, -0.0743572F, 0.0F, 0.0F);
/* 103 */     this.lrleg4 = new ModelRenderer(this, 32, 49);
/* 104 */     this.lrleg4.func_78789_a(0.0F, 11.0F, 9.5F, 2, 6, 2);
/* 105 */     this.lrleg4.func_78793_a(2.0F, 4.0F, 3.0F);
/* 106 */     this.lrleg4.func_78787_b(64, 64);
/* 107 */     this.lrleg4.field_78809_i = true;
/* 108 */     setRotation(this.lrleg4, -0.4089647F, 0.0F, 0.0F);
/* 109 */     this.tail = new ModelRenderer(this, 0, 49);
/* 110 */     this.tail.func_78789_a(0.0F, 0.0F, 0.0F, 4, 4, 4);
/* 111 */     this.tail.func_78793_a(-2.0F, 0.0F, 4.0F);
/* 112 */     this.tail.func_78787_b(64, 64);
/* 113 */     this.tail.field_78809_i = true;
/* 114 */     setRotation(this.tail, 0.9666439F, 0.0F, 0.0F);
/* 115 */     this.lear = new ModelRenderer(this, 18, 0);
/* 116 */     this.lear.func_78789_a(-5.0F, -3.0F, 2.0F, 3, 2, 1);
/* 117 */     this.lear.func_78793_a(0.0F, -9.0F, -6.0F);
/* 118 */     this.lear.func_78787_b(64, 64);
/* 119 */     this.lear.field_78809_i = true;
/* 120 */     setRotation(this.lear, -0.1047198F, 1.570796F, 0.0F);
/* 121 */     this.rrleg1 = new ModelRenderer(this, 23, 31);
/* 122 */     this.rrleg1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 6, 3);
/* 123 */     this.rrleg1.func_78793_a(-4.0F, 4.0F, 3.0F);
/* 124 */     this.rrleg1.func_78787_b(64, 64);
/* 125 */     this.rrleg1.field_78809_i = true;
/* 126 */     setRotation(this.rrleg1, 0.0F, 0.0F, 0.0F);
/* 127 */     this.rfleg1 = new ModelRenderer(this, 0, 31);
/* 128 */     this.rfleg1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 6, 3);
/* 129 */     this.rfleg1.func_78793_a(-4.0F, 6.0F, -6.0F);
/* 130 */     this.rfleg1.func_78787_b(64, 64);
/* 131 */     this.rfleg1.field_78809_i = true;
/* 132 */     setRotation(this.rfleg1, 0.2974289F, 0.0F, 0.0F);
/* 133 */     this.lrleg3 = new ModelRenderer(this, 32, 11);
/* 134 */     this.lrleg3.func_78789_a(0.0F, 4.0F, 5.0F, 2, 12, 2);
/* 135 */     this.lrleg3.func_78793_a(2.0F, 3.966667F, 3.0F);
/* 136 */     this.lrleg3.func_78787_b(64, 64);
/* 137 */     this.lrleg3.field_78809_i = true;
/* 138 */     setRotation(this.lrleg3, -0.0743572F, 0.0F, 0.0F);
/* 139 */     this.lfleg2 = new ModelRenderer(this, 24, 11);
/* 140 */     this.lfleg2.func_78789_a(0.0F, 2.0F, 2.0F, 2, 12, 2);
/* 141 */     this.lfleg2.func_78793_a(2.0F, 5.966667F, -6.0F);
/* 142 */     this.lfleg2.func_78787_b(64, 64);
/* 143 */     this.lfleg2.field_78809_i = true;
/* 144 */     setRotation(this.lfleg2, -0.0743572F, 0.0F, 0.0F);
/* 145 */     this.rrleg5 = new ModelRenderer(this, 0, 58);
/* 146 */     this.rrleg5.func_78789_a(-0.5F, 17.0F, 2.0F, 3, 3, 3);
/* 147 */     this.rrleg5.func_78793_a(-4.0F, 4.0F, 3.0F);
/* 148 */     this.rrleg5.func_78787_b(64, 64);
/* 149 */     this.rrleg5.field_78809_i = true;
/* 150 */     setRotation(this.rrleg5, 0.0F, 0.0F, 0.0F);
/* 151 */     this.rrleg5.field_78809_i = false;
/* 152 */     this.rrleg4 = new ModelRenderer(this, 32, 49);
/* 153 */     this.rrleg4.func_78789_a(0.0F, 11.0F, 9.5F, 2, 6, 2);
/* 154 */     this.rrleg4.func_78793_a(-4.0F, 3.966667F, 3.0F);
/* 155 */     this.rrleg4.func_78787_b(64, 64);
/* 156 */     this.rrleg4.field_78809_i = true;
/* 157 */     setRotation(this.rrleg4, -0.4089647F, 0.0F, 0.0F);
/* 158 */     this.lfleg3 = new ModelRenderer(this, 40, 49);
/* 159 */     this.lfleg3.func_78789_a(0.0F, 10.0F, 6.0F, 2, 6, 2);
/* 160 */     this.lfleg3.func_78793_a(2.0F, 5.966667F, -6.0F);
/* 161 */     this.lfleg3.func_78787_b(64, 64);
/* 162 */     this.lfleg3.field_78809_i = true;
/* 163 */     setRotation(this.lfleg3, -0.4089647F, 0.0F, 0.0F);
/* 164 */     this.rfleg4 = new ModelRenderer(this, 0, 58);
/* 165 */     this.rfleg4.func_78789_a(-0.5F, 15.0F, -1.0F, 3, 3, 3);
/* 166 */     this.rfleg4.func_78793_a(-4.0F, 6.0F, -6.0F);
/* 167 */     this.rfleg4.func_78787_b(64, 64);
/* 168 */     this.rfleg4.field_78809_i = true;
/* 169 */     setRotation(this.rfleg4, 0.0F, 0.0F, 0.0F);
/* 170 */     this.lfleg4 = new ModelRenderer(this, 0, 58);
/* 171 */     this.lfleg4.func_78789_a(-0.5F, 15.0F, -1.0F, 3, 3, 3);
/* 172 */     this.lfleg4.func_78793_a(2.0F, 6.0F, -6.0F);
/* 173 */     this.lfleg4.func_78787_b(64, 64);
/* 174 */     this.lfleg4.field_78809_i = true;
/* 175 */     setRotation(this.lfleg4, 0.0F, 0.0F, 0.0F);
/* 176 */     this.lrleg5 = new ModelRenderer(this, 0, 58);
/* 177 */     this.lrleg5.func_78789_a(-0.5F, 17.0F, 2.0F, 3, 3, 3);
/* 178 */     this.lrleg5.func_78793_a(2.0F, 4.0F, 3.0F);
/* 179 */     this.lrleg5.func_78787_b(64, 64);
/* 180 */     this.lrleg5.field_78809_i = true;
/* 181 */     setRotation(this.lrleg5, 0.0F, 0.0F, 0.0F);
/* 182 */     this.Body = new ModelRenderer(this, 0, 12);
/* 183 */     this.Body.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 13);
/* 184 */     this.Body.func_78793_a(-3.0F, 2.0F, -7.0F);
/* 185 */     this.Body.func_78787_b(64, 64);
/* 186 */     this.Body.field_78809_i = true;
/* 187 */     setRotation(this.Body, 0.2230717F, 0.0F, 0.0F);
/* 188 */     this.neck = new ModelRenderer(this, 0, 31);
/* 189 */     this.neck.func_78789_a(0.0F, 0.0F, 0.0F, 5, 5, 13);
/* 190 */     this.neck.func_78793_a(-2.5F, 6.0F, -8.0F);
/* 191 */     this.neck.func_78787_b(64, 64);
/* 192 */     this.neck.field_78809_i = true;
/* 193 */     setRotation(this.neck, 1.524323F, 0.0F, 0.0F);
/* 194 */     this.la3 = new ModelRenderer(this, 4, 12);
/* 195 */     this.la3.func_78789_a(0.5F, -12.5F, 3.0F, 1, 5, 1);
/* 196 */     this.la3.func_78793_a(0.0F, -9.0F, -6.0F);
/* 197 */     this.la3.func_78787_b(64, 64);
/* 198 */     this.la3.field_78809_i = true;
/* 199 */     setRotation(this.la3, -0.3346075F, 0.0F, 0.0F);
/* 200 */     this.throatfluff = new ModelRenderer(this, 36, 41);
/* 201 */     this.throatfluff.func_78789_a(0.0F, -2.0F, 0.0F, 4, 3, 5);
/* 202 */     this.throatfluff.func_78793_a(-2.0F, 0.0F, -8.0F);
/* 203 */     this.throatfluff.func_78787_b(64, 64);
/* 204 */     this.throatfluff.field_78809_i = true;
/* 205 */     setRotation(this.throatfluff, 1.07818F, 0.0F, 0.0F);
/* 206 */     this.rear = new ModelRenderer(this, 18, 0);
/* 207 */     this.rear.func_78789_a(-5.0F, -3.0F, -3.0F, 3, 2, 1);
/* 208 */     this.rear.func_78793_a(0.0F, -9.0F, -6.0F);
/* 209 */     this.rear.func_78787_b(64, 64);
/* 210 */     this.rear.field_78809_i = true;
/* 211 */     setRotation(this.rear, 0.1047198F, 1.570796F, 0.0F);
/* 212 */     this.head = new ModelRenderer(this, 0, 0);
/* 213 */     this.head.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
/* 214 */     this.head.func_78793_a(0.0F, -9.0F, -6.0F);
/* 215 */     this.head.func_78787_b(64, 64);
/* 216 */     this.head.field_78809_i = true;
/* 217 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 218 */     this.ra1 = new ModelRenderer(this, 0, 12);
/* 219 */     this.ra1.func_78789_a(-1.5F, -5.0F, 0.0F, 1, 4, 1);
/* 220 */     this.ra1.func_78793_a(0.0F, -9.0F, -6.0F);
/* 221 */     this.ra1.func_78787_b(64, 64);
/* 222 */     this.ra1.field_78809_i = true;
/* 223 */     setRotation(this.ra1, -0.3717861F, 0.0F, 0.0F);
/* 224 */     this.la1 = new ModelRenderer(this, 0, 12);
/* 225 */     this.la1.func_78789_a(0.5F, -5.0F, 0.0F, 1, 4, 1);
/* 226 */     this.la1.func_78793_a(0.0F, -9.0F, -6.0F);
/* 227 */     this.la1.func_78787_b(64, 64);
/* 228 */     this.la1.field_78809_i = true;
/* 229 */     setRotation(this.la1, -0.3717861F, 0.0F, 0.0F);
/* 230 */     this.la2 = new ModelRenderer(this, 0, 17);
/* 231 */     this.la2.func_78789_a(0.5F, -8.5F, -3.0F, 1, 5, 1);
/* 232 */     this.la2.func_78793_a(0.0F, -9.0F, -6.0F);
/* 233 */     this.la2.func_78787_b(64, 64);
/* 234 */     this.la2.field_78809_i = true;
/* 235 */     setRotation(this.la2, -1.041001F, 0.0F, 0.0F);
/* 236 */     this.ra2 = new ModelRenderer(this, 0, 17);
/* 237 */     this.ra2.func_78789_a(-1.5F, -8.5F, -3.0F, 1, 5, 1);
/* 238 */     this.ra2.func_78793_a(0.0F, -9.0F, -6.0F);
/* 239 */     this.ra2.func_78787_b(64, 64);
/* 240 */     this.ra2.field_78809_i = true;
/* 241 */     setRotation(this.ra2, -1.041001F, 0.0F, 0.0F);
/* 242 */     this.ra3 = new ModelRenderer(this, 4, 12);
/* 243 */     this.ra3.func_78789_a(-1.5F, -12.5F, 3.0F, 1, 5, 1);
/* 244 */     this.ra3.func_78793_a(0.0F, -9.0F, -6.0F);
/* 245 */     this.ra3.func_78787_b(64, 64);
/* 246 */     this.ra3.field_78809_i = true;
/* 247 */     setRotation(this.ra3, -0.3346075F, 0.0F, 0.0F);
/* 248 */     this.nose = new ModelRenderer(this, 24, 0);
/* 249 */     this.nose.func_78789_a(-2.5F, 0.0F, -7.0F, 5, 3, 5);
/* 250 */     this.nose.func_78793_a(0.0F, -9.0F, -6.0F);
/* 251 */     this.nose.func_78787_b(64, 64);
/* 252 */     this.nose.field_78809_i = true;
/* 253 */     setRotation(this.nose, 0.0F, 0.0F, 0.0F);
/* 254 */     this.mouth = new ModelRenderer(this, 28, 57);
/* 255 */     this.mouth.func_78789_a(-2.0F, 2.0F, -6.0F, 4, 2, 5);
/* 256 */     this.mouth.func_78793_a(0.0F, -9.0F, -6.0F);
/* 257 */     this.mouth.func_78787_b(64, 64);
/* 258 */     this.mouth.field_78809_i = true;
/* 259 */     setRotation(this.mouth, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 267 */     Gazelle g = (Gazelle)entity;
/* 268 */     float hf = 0.0F;
/* 269 */     float newangle = 0.0F;
/*     */     
/* 271 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 272 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 275 */     if (f1 > 0.1D) {
/* 276 */       newangle = MathHelper.func_76134_b(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/*     */     } else {
/* 278 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 281 */     this.lfleg1.field_78795_f = 0.297F + newangle;
/* 282 */     this.lfleg2.field_78795_f = -0.074F + newangle;
/* 283 */     this.lfleg3.field_78795_f = -0.409F + newangle;
/* 284 */     this.lfleg4.field_78795_f = newangle;
/* 285 */     this.rfleg1.field_78795_f = 0.297F - newangle;
/* 286 */     this.rfleg2.field_78795_f = -0.074F - newangle;
/* 287 */     this.rfleg3.field_78795_f = -0.409F - newangle;
/* 288 */     this.rfleg4.field_78795_f = -newangle;
/*     */     
/* 290 */     this.lrleg1.field_78795_f = -newangle;
/* 291 */     this.lrleg2.field_78795_f = 0.185F - newangle;
/* 292 */     this.lrleg3.field_78795_f = -0.074F - newangle;
/* 293 */     this.lrleg4.field_78795_f = -0.409F - newangle;
/* 294 */     this.lrleg5.field_78795_f = -newangle;
/* 295 */     this.rrleg1.field_78795_f = newangle;
/* 296 */     this.rrleg2.field_78795_f = 0.185F + newangle;
/* 297 */     this.rrleg3.field_78795_f = -0.074F + newangle;
/* 298 */     this.rrleg4.field_78795_f = -0.409F + newangle;
/* 299 */     this.rrleg5.field_78795_f = newangle;
/*     */     
/* 301 */     newangle = MathHelper.func_76134_b(f2 * 0.5F) * 3.1415927F * 0.02F;
/* 302 */     this.head.field_78796_g = (float)Math.toRadians(f3) * 0.45F;
/* 303 */     this.nose.field_78796_g = this.head.field_78796_g;
/* 304 */     this.mouth.field_78796_g = this.head.field_78796_g;
/* 305 */     this.lear.field_78796_g = 1.57F + this.head.field_78796_g + newangle;
/* 306 */     this.rear.field_78796_g = 1.57F + this.head.field_78796_g + newangle;
/* 307 */     this.la1.field_78796_g = this.head.field_78796_g;
/* 308 */     this.la2.field_78796_g = this.head.field_78796_g;
/* 309 */     this.la3.field_78796_g = this.head.field_78796_g;
/* 310 */     this.ra1.field_78796_g = this.head.field_78796_g;
/* 311 */     this.ra2.field_78796_g = this.head.field_78796_g;
/* 312 */     this.ra3.field_78796_g = this.head.field_78796_g;
/*     */     
/* 314 */     if (!g.func_70906_o()) {
/* 315 */       this.tail.field_78795_f = 1.0F + MathHelper.func_76134_b(f2 * 0.1F) * 3.1415927F * 0.06F;
/*     */     }
/*     */     
/* 318 */     this.Chest.func_78785_a(f5);
/* 319 */     this.lfleg1.func_78785_a(f5);
/* 320 */     this.lrleg2.func_78785_a(f5);
/* 321 */     this.lrleg1.func_78785_a(f5);
/* 322 */     this.rfleg3.func_78785_a(f5);
/* 323 */     this.rrleg2.func_78785_a(f5);
/* 324 */     this.rrleg3.func_78785_a(f5);
/* 325 */     this.rfleg2.func_78785_a(f5);
/* 326 */     this.lrleg4.func_78785_a(f5);
/* 327 */     this.tail.func_78785_a(f5);
/* 328 */     this.lear.func_78785_a(f5);
/* 329 */     this.rrleg1.func_78785_a(f5);
/* 330 */     this.rfleg1.func_78785_a(f5);
/* 331 */     this.lrleg3.func_78785_a(f5);
/* 332 */     this.lfleg2.func_78785_a(f5);
/* 333 */     this.rrleg5.func_78785_a(f5);
/* 334 */     this.rrleg4.func_78785_a(f5);
/* 335 */     this.lfleg3.func_78785_a(f5);
/* 336 */     this.rfleg4.func_78785_a(f5);
/* 337 */     this.lfleg4.func_78785_a(f5);
/* 338 */     this.lrleg5.func_78785_a(f5);
/* 339 */     this.Body.func_78785_a(f5);
/* 340 */     this.neck.func_78785_a(f5);
/* 341 */     this.la3.func_78785_a(f5);
/* 342 */     this.throatfluff.func_78785_a(f5);
/* 343 */     this.rear.func_78785_a(f5);
/* 344 */     this.head.func_78785_a(f5);
/* 345 */     this.ra1.func_78785_a(f5);
/* 346 */     this.la1.func_78785_a(f5);
/* 347 */     this.la2.func_78785_a(f5);
/* 348 */     this.ra2.func_78785_a(f5);
/* 349 */     this.ra3.func_78785_a(f5);
/* 350 */     this.nose.func_78785_a(f5);
/* 351 */     this.mouth.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 358 */     model.field_78795_f = x;
/* 359 */     model.field_78796_g = y;
/* 360 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 365 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelGazelle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */