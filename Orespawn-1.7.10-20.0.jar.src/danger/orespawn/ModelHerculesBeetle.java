/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelHerculesBeetle
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body1;
/*     */   
/*     */   ModelRenderer body2;
/*     */   
/*     */   ModelRenderer head1;
/*     */   ModelRenderer head2;
/*     */   ModelRenderer head3;
/*     */   ModelRenderer head4;
/*     */   ModelRenderer head5;
/*     */   ModelRenderer head6;
/*     */   ModelRenderer head8;
/*     */   ModelRenderer jaw1;
/*     */   ModelRenderer jaw2;
/*     */   ModelRenderer jaw3;
/*     */   ModelRenderer jaw4;
/*     */   ModelRenderer head7;
/*     */   ModelRenderer lfleg1;
/*     */   ModelRenderer lfleg2;
/*     */   ModelRenderer lfleg3;
/*     */   ModelRenderer lmleg1;
/*     */   ModelRenderer lmleg2;
/*     */   ModelRenderer lmleg3;
/*     */   ModelRenderer lrleg1;
/*     */   ModelRenderer lrleg2;
/*     */   ModelRenderer lrleg3;
/*     */   ModelRenderer jaw5;
/*     */   ModelRenderer jaw6;
/*     */   ModelRenderer jaw7;
/*     */   ModelRenderer jaw8;
/*     */   ModelRenderer rfleg1;
/*     */   ModelRenderer rfleg2;
/*     */   ModelRenderer rfleg3;
/*     */   ModelRenderer rmleg1;
/*     */   ModelRenderer rmleg2;
/*     */   ModelRenderer rmleg3;
/*     */   ModelRenderer rrleg1;
/*     */   ModelRenderer rrleg2;
/*     */   ModelRenderer rrleg3;
/*     */   ModelRenderer jaw9;
/*     */   
/*     */   public ModelHerculesBeetle(float f1) {
/*  53 */     this.wingspeed = f1;
/*     */     
/*  55 */     this.field_78090_t = 256;
/*  56 */     this.field_78089_u = 256;
/*     */ 
/*     */     
/*  59 */     this.body1 = new ModelRenderer(this, 0, 30);
/*  60 */     this.body1.func_78789_a(-8.0F, 0.0F, 0.0F, 16, 16, 23);
/*  61 */     this.body1.func_78793_a(0.0F, 0.0F, 0.0F);
/*  62 */     this.body1.func_78787_b(256, 256);
/*  63 */     this.body1.field_78809_i = true;
/*  64 */     setRotation(this.body1, 0.0F, 0.0F, 0.0F);
/*  65 */     this.body2 = new ModelRenderer(this, 80, 41);
/*  66 */     this.body2.func_78789_a(-6.0F, 0.0F, 0.0F, 12, 12, 4);
/*  67 */     this.body2.func_78793_a(0.0F, 3.0F, 23.0F);
/*  68 */     this.body2.func_78787_b(256, 256);
/*  69 */     this.body2.field_78809_i = true;
/*  70 */     setRotation(this.body2, 0.0F, 0.0F, 0.0F);
/*  71 */     this.head1 = new ModelRenderer(this, 0, 71);
/*  72 */     this.head1.func_78789_a(-9.0F, 0.0F, 0.0F, 18, 16, 12);
/*  73 */     this.head1.func_78793_a(0.0F, -1.0F, -10.0F);
/*  74 */     this.head1.func_78787_b(256, 256);
/*  75 */     this.head1.field_78809_i = true;
/*  76 */     setRotation(this.head1, -0.122173F, 0.0F, 0.0F);
/*  77 */     this.head2 = new ModelRenderer(this, 0, 100);
/*  78 */     this.head2.func_78789_a(-7.0F, 0.0F, 0.0F, 14, 10, 6);
/*  79 */     this.head2.func_78793_a(0.0F, -2.0F, -16.0F);
/*  80 */     this.head2.func_78787_b(256, 256);
/*  81 */     this.head2.field_78809_i = true;
/*  82 */     setRotation(this.head2, -0.122173F, 0.0F, 0.0F);
/*  83 */     this.head3 = new ModelRenderer(this, 0, 117);
/*  84 */     this.head3.func_78789_a(-5.0F, 0.0F, 0.0F, 10, 6, 9);
/*  85 */     this.head3.func_78793_a(0.0F, -3.0F, -25.0F);
/*  86 */     this.head3.func_78787_b(256, 256);
/*  87 */     this.head3.field_78809_i = true;
/*  88 */     setRotation(this.head3, -0.122173F, 0.0F, 0.0F);
/*  89 */     this.head4 = new ModelRenderer(this, 0, 133);
/*  90 */     this.head4.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 4, 12);
/*  91 */     this.head4.func_78793_a(0.0F, -4.0F, -37.0F);
/*  92 */     this.head4.func_78787_b(256, 256);
/*  93 */     this.head4.field_78809_i = true;
/*  94 */     setRotation(this.head4, -0.122173F, 0.0F, 0.0F);
/*  95 */     this.head5 = new ModelRenderer(this, 0, 150);
/*  96 */     this.head5.func_78789_a(-3.0F, 0.0F, 0.0F, 6, 3, 21);
/*  97 */     this.head5.func_78793_a(0.0F, -4.0F, -58.0F);
/*  98 */     this.head5.func_78787_b(256, 256);
/*  99 */     this.head5.field_78809_i = true;
/* 100 */     setRotation(this.head5, 0.0F, 0.0F, 0.0F);
/* 101 */     this.head6 = new ModelRenderer(this, 0, 175);
/* 102 */     this.head6.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 2, 14);
/* 103 */     this.head6.func_78793_a(0.0F, -2.0F, -72.0F);
/* 104 */     this.head6.func_78787_b(256, 256);
/* 105 */     this.head6.field_78809_i = true;
/* 106 */     setRotation(this.head6, 0.122173F, 0.0F, 0.0F);
/* 107 */     this.head8 = new ModelRenderer(this, 6, 193);
/* 108 */     this.head8.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 109 */     this.head8.func_78793_a(0.0F, -2.0F, -46.0F);
/* 110 */     this.head8.func_78787_b(256, 256);
/* 111 */     this.head8.field_78809_i = true;
/* 112 */     setRotation(this.head8, -0.2094395F, 0.0F, 0.0F);
/* 113 */     this.jaw1 = new ModelRenderer(this, 114, 0);
/* 114 */     this.jaw1.func_78789_a(-3.0F, -3.0F, -4.0F, 6, 7, 5);
/* 115 */     this.jaw1.func_78793_a(0.0F, 12.0F, -12.0F);
/* 116 */     this.jaw1.func_78787_b(256, 256);
/* 117 */     this.jaw1.field_78809_i = true;
/* 118 */     setRotation(this.jaw1, 0.122173F, 0.0F, 0.0F);
/* 119 */     this.jaw2 = new ModelRenderer(this, 115, 14);
/* 120 */     this.jaw2.func_78789_a(-2.5F, -3.0F, -27.0F, 5, 5, 23);
/* 121 */     this.jaw2.func_78793_a(0.0F, 12.0F, -12.0F);
/* 122 */     this.jaw2.func_78787_b(256, 256);
/* 123 */     this.jaw2.field_78809_i = true;
/* 124 */     setRotation(this.jaw2, 0.122173F, 0.0F, 0.0F);
/* 125 */     this.jaw3 = new ModelRenderer(this, 115, 43);
/* 126 */     this.jaw3.func_78789_a(-1.5F, 0.0F, -44.0F, 3, 5, 18);
/* 127 */     this.jaw3.func_78793_a(0.0F, 12.0F, -12.0F);
/* 128 */     this.jaw3.func_78787_b(256, 256);
/* 129 */     this.jaw3.field_78809_i = true;
/* 130 */     setRotation(this.jaw3, 0.0F, 0.0F, 0.0F);
/* 131 */     this.jaw4 = new ModelRenderer(this, 115, 70);
/* 132 */     this.jaw4.func_78789_a(-0.5F, -2.0F, -45.0F, 1, 5, 1);
/* 133 */     this.jaw4.func_78793_a(0.0F, 12.0F, -12.0F);
/* 134 */     this.jaw4.func_78787_b(256, 256);
/* 135 */     this.jaw4.field_78809_i = true;
/* 136 */     setRotation(this.jaw4, 0.0F, 0.0F, 0.0F);
/* 137 */     this.head7 = new ModelRenderer(this, 0, 193);
/* 138 */     this.head7.func_78789_a(-0.5F, 0.0F, 0.0F, 1, 4, 1);
/* 139 */     this.head7.func_78793_a(0.0F, -2.0F, -73.0F);
/* 140 */     this.head7.func_78787_b(256, 256);
/* 141 */     this.head7.field_78809_i = true;
/* 142 */     setRotation(this.head7, 0.122173F, 0.0F, 0.0F);
/* 143 */     this.lfleg1 = new ModelRenderer(this, 60, 0);
/* 144 */     this.lfleg1.func_78789_a(0.0F, 0.0F, -0.5F, 10, 3, 3);
/* 145 */     this.lfleg1.func_78793_a(6.0F, 15.0F, -5.0F);
/* 146 */     this.lfleg1.func_78787_b(256, 256);
/* 147 */     this.lfleg1.field_78809_i = true;
/* 148 */     setRotation(this.lfleg1, 0.0F, 0.3490659F, 0.0872665F);
/* 149 */     this.lfleg2 = new ModelRenderer(this, 60, 8);
/* 150 */     this.lfleg2.func_78789_a(10.0F, -1.0F, 0.0F, 11, 2, 2);
/* 151 */     this.lfleg2.func_78793_a(6.0F, 15.0F, -5.0F);
/* 152 */     this.lfleg2.func_78787_b(256, 256);
/* 153 */     this.lfleg2.field_78809_i = true;
/* 154 */     setRotation(this.lfleg2, 0.0F, 0.3490659F, 0.2617994F);
/* 155 */     this.lfleg3 = new ModelRenderer(this, 60, 14);
/* 156 */     this.lfleg3.func_78789_a(21.0F, -2.0F, 0.5F, 10, 1, 1);
/* 157 */     this.lfleg3.func_78793_a(6.0F, 15.0F, -5.0F);
/* 158 */     this.lfleg3.func_78787_b(256, 256);
/* 159 */     this.lfleg3.field_78809_i = true;
/* 160 */     setRotation(this.lfleg3, 0.0F, 0.3490659F, 0.3490659F);
/* 161 */     this.lmleg1 = new ModelRenderer(this, 60, 0);
/* 162 */     this.lmleg1.func_78789_a(0.0F, 0.0F, -0.5F, 10, 3, 3);
/* 163 */     this.lmleg1.func_78793_a(6.0F, 15.0F, 0.0F);
/* 164 */     this.lmleg1.func_78787_b(256, 256);
/* 165 */     this.lmleg1.field_78809_i = true;
/* 166 */     setRotation(this.lmleg1, 0.0F, 0.0F, 0.0872665F);
/* 167 */     this.lmleg2 = new ModelRenderer(this, 60, 8);
/* 168 */     this.lmleg2.func_78789_a(10.0F, -1.0F, 0.0F, 11, 2, 2);
/* 169 */     this.lmleg2.func_78793_a(6.0F, 15.0F, 0.0F);
/* 170 */     this.lmleg2.func_78787_b(256, 256);
/* 171 */     this.lmleg2.field_78809_i = true;
/* 172 */     setRotation(this.lmleg2, 0.0F, 0.0F, 0.2617994F);
/* 173 */     this.lmleg3 = new ModelRenderer(this, 60, 14);
/* 174 */     this.lmleg3.func_78789_a(21.0F, -2.0F, 0.5F, 10, 1, 1);
/* 175 */     this.lmleg3.func_78793_a(6.0F, 15.0F, 0.0F);
/* 176 */     this.lmleg3.func_78787_b(256, 256);
/* 177 */     this.lmleg3.field_78809_i = true;
/* 178 */     setRotation(this.lmleg3, 0.0F, 0.0F, 0.3490659F);
/* 179 */     this.lrleg1 = new ModelRenderer(this, 60, 0);
/* 180 */     this.lrleg1.func_78789_a(0.0F, 0.0F, -0.5F, 10, 3, 3);
/* 181 */     this.lrleg1.func_78793_a(6.0F, 15.0F, 5.0F);
/* 182 */     this.lrleg1.func_78787_b(256, 256);
/* 183 */     this.lrleg1.field_78809_i = true;
/* 184 */     setRotation(this.lrleg1, 0.0F, -0.3490659F, 0.0872665F);
/* 185 */     this.lrleg2 = new ModelRenderer(this, 60, 8);
/* 186 */     this.lrleg2.func_78789_a(10.0F, -1.0F, 0.0F, 11, 2, 2);
/* 187 */     this.lrleg2.func_78793_a(6.0F, 15.0F, 5.0F);
/* 188 */     this.lrleg2.func_78787_b(256, 256);
/* 189 */     this.lrleg2.field_78809_i = true;
/* 190 */     setRotation(this.lrleg2, 0.0F, -0.3490659F, 0.2617994F);
/* 191 */     this.lrleg3 = new ModelRenderer(this, 60, 14);
/* 192 */     this.lrleg3.func_78789_a(21.0F, -2.0F, 0.5F, 10, 1, 1);
/* 193 */     this.lrleg3.func_78793_a(6.0F, 15.0F, 5.0F);
/* 194 */     this.lrleg3.func_78787_b(256, 256);
/* 195 */     this.lrleg3.field_78809_i = true;
/* 196 */     setRotation(this.lrleg3, 0.0F, -0.3490659F, 0.3490659F);
/* 197 */     this.jaw5 = new ModelRenderer(this, 115, 78);
/* 198 */     this.jaw5.func_78789_a(2.0F, -2.0F, -9.0F, 2, 3, 3);
/* 199 */     this.jaw5.func_78793_a(0.0F, 12.0F, -12.0F);
/* 200 */     this.jaw5.func_78787_b(256, 256);
/* 201 */     this.jaw5.field_78809_i = true;
/* 202 */     setRotation(this.jaw5, 0.122173F, 0.0F, 0.0F);
/* 203 */     this.jaw6 = new ModelRenderer(this, 127, 78);
/* 204 */     this.jaw6.func_78789_a(-4.0F, -2.0F, -9.0F, 2, 3, 3);
/* 205 */     this.jaw6.func_78793_a(0.0F, 12.0F, -12.0F);
/* 206 */     this.jaw6.func_78787_b(256, 256);
/* 207 */     this.jaw6.field_78809_i = true;
/* 208 */     setRotation(this.jaw6, 0.122173F, 0.0F, 0.0F);
/* 209 */     this.jaw7 = new ModelRenderer(this, 115, 86);
/* 210 */     this.jaw7.func_78789_a(5.0F, 1.0F, -6.0F, 9, 1, 1);
/* 211 */     this.jaw7.func_78793_a(0.0F, 12.0F, -12.0F);
/* 212 */     this.jaw7.func_78787_b(256, 256);
/* 213 */     this.jaw7.field_78809_i = true;
/* 214 */     setRotation(this.jaw7, 0.0F, 0.5585054F, 0.2268928F);
/* 215 */     this.jaw8 = new ModelRenderer(this, 115, 89);
/* 216 */     this.jaw8.func_78789_a(-14.0F, 1.0F, -6.0F, 9, 1, 1);
/* 217 */     this.jaw8.func_78793_a(0.0F, 12.0F, -12.0F);
/* 218 */     this.jaw8.func_78787_b(256, 256);
/* 219 */     this.jaw8.field_78809_i = true;
/* 220 */     setRotation(this.jaw8, 0.0F, -0.5585054F, -0.2268928F);
/* 221 */     this.rfleg1 = new ModelRenderer(this, 30, 0);
/* 222 */     this.rfleg1.func_78789_a(-10.0F, 0.0F, -0.5F, 10, 3, 3);
/* 223 */     this.rfleg1.func_78793_a(-6.0F, 15.0F, -5.0F);
/* 224 */     this.rfleg1.func_78787_b(256, 256);
/* 225 */     this.rfleg1.field_78809_i = true;
/* 226 */     setRotation(this.rfleg1, 0.0F, -0.3490659F, -0.0872665F);
/* 227 */     this.rfleg2 = new ModelRenderer(this, 30, 8);
/* 228 */     this.rfleg2.func_78789_a(-21.0F, -1.0F, 0.0F, 11, 2, 2);
/* 229 */     this.rfleg2.func_78793_a(-6.0F, 15.0F, -5.0F);
/* 230 */     this.rfleg2.func_78787_b(256, 256);
/* 231 */     this.rfleg2.field_78809_i = true;
/* 232 */     setRotation(this.rfleg2, 0.0F, -0.3490659F, -0.2617994F);
/* 233 */     this.rfleg3 = new ModelRenderer(this, 30, 14);
/* 234 */     this.rfleg3.func_78789_a(-31.0F, -2.0F, 0.5F, 10, 1, 1);
/* 235 */     this.rfleg3.func_78793_a(-6.0F, 15.0F, -5.0F);
/* 236 */     this.rfleg3.func_78787_b(256, 256);
/* 237 */     this.rfleg3.field_78809_i = true;
/* 238 */     setRotation(this.rfleg3, 0.0F, -0.3490659F, -0.3490659F);
/* 239 */     this.rmleg1 = new ModelRenderer(this, 30, 0);
/* 240 */     this.rmleg1.func_78789_a(-10.0F, 0.0F, -0.5F, 10, 3, 3);
/* 241 */     this.rmleg1.func_78793_a(-6.0F, 15.0F, 0.0F);
/* 242 */     this.rmleg1.func_78787_b(256, 256);
/* 243 */     this.rmleg1.field_78809_i = true;
/* 244 */     setRotation(this.rmleg1, 0.0F, 0.0F, -0.0872665F);
/* 245 */     this.rmleg2 = new ModelRenderer(this, 30, 8);
/* 246 */     this.rmleg2.func_78789_a(-21.0F, -1.0F, 0.0F, 11, 2, 2);
/* 247 */     this.rmleg2.func_78793_a(-6.0F, 15.0F, 0.0F);
/* 248 */     this.rmleg2.func_78787_b(256, 256);
/* 249 */     this.rmleg2.field_78809_i = true;
/* 250 */     setRotation(this.rmleg2, 0.0F, 0.0F, -0.2617994F);
/* 251 */     this.rmleg3 = new ModelRenderer(this, 30, 14);
/* 252 */     this.rmleg3.func_78789_a(-31.0F, -2.0F, 0.5F, 10, 1, 1);
/* 253 */     this.rmleg3.func_78793_a(-6.0F, 15.0F, 0.0F);
/* 254 */     this.rmleg3.func_78787_b(256, 256);
/* 255 */     this.rmleg3.field_78809_i = true;
/* 256 */     setRotation(this.rmleg3, 0.0F, 0.0F, -0.3490659F);
/* 257 */     this.rrleg1 = new ModelRenderer(this, 30, 0);
/* 258 */     this.rrleg1.func_78789_a(-10.0F, 0.0F, -0.5F, 10, 3, 3);
/* 259 */     this.rrleg1.func_78793_a(-6.0F, 15.0F, 5.0F);
/* 260 */     this.rrleg1.func_78787_b(256, 256);
/* 261 */     this.rrleg1.field_78809_i = true;
/* 262 */     setRotation(this.rrleg1, 0.0F, 0.3490659F, -0.0872665F);
/* 263 */     this.rrleg2 = new ModelRenderer(this, 30, 8);
/* 264 */     this.rrleg2.func_78789_a(-21.0F, -1.0F, 0.0F, 11, 2, 2);
/* 265 */     this.rrleg2.func_78793_a(-6.0F, 15.0F, 5.0F);
/* 266 */     this.rrleg2.func_78787_b(256, 256);
/* 267 */     this.rrleg2.field_78809_i = true;
/* 268 */     setRotation(this.rrleg2, 0.0F, 0.3490659F, -0.2617994F);
/* 269 */     this.rrleg3 = new ModelRenderer(this, 30, 14);
/* 270 */     this.rrleg3.func_78789_a(-31.0F, -2.0F, 0.5F, 10, 1, 1);
/* 271 */     this.rrleg3.func_78793_a(-6.0F, 15.0F, 5.0F);
/* 272 */     this.rrleg3.func_78787_b(256, 256);
/* 273 */     this.rrleg3.field_78809_i = true;
/* 274 */     setRotation(this.rrleg3, 0.0F, 0.3490659F, -0.3490659F);
/* 275 */     this.jaw9 = new ModelRenderer(this, 121, 70);
/* 276 */     this.jaw9.func_78789_a(-0.5F, -12.0F, -25.0F, 1, 5, 1);
/* 277 */     this.jaw9.func_78793_a(0.0F, 12.0F, -12.0F);
/* 278 */     this.jaw9.func_78787_b(256, 256);
/* 279 */     this.jaw9.field_78809_i = true;
/* 280 */     setRotation(this.jaw9, 0.3141593F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 285 */     float newangle = 0.0F;
/* 286 */     HerculesBeetle b = (HerculesBeetle)entity;
/*     */     
/* 288 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 289 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 292 */     newangle = MathHelper.func_76134_b(f2 * this.wingspeed * 0.45F) * 3.1415927F * 0.12F * f1;
/* 293 */     this.lfleg1.field_78796_g = 0.349F + newangle;
/* 294 */     this.lfleg2.field_78796_g = this.lfleg1.field_78796_g;
/* 295 */     this.lmleg1.field_78796_g = -newangle;
/* 296 */     this.lmleg2.field_78796_g = this.lmleg1.field_78796_g;
/* 297 */     this.lrleg1.field_78796_g = -0.349F + newangle;
/* 298 */     this.lrleg2.field_78796_g = this.lrleg1.field_78796_g;
/*     */     
/* 300 */     this.rfleg1.field_78796_g = -0.349F + newangle;
/* 301 */     this.rfleg2.field_78796_g = this.rfleg1.field_78796_g;
/* 302 */     this.rmleg1.field_78796_g = -newangle;
/* 303 */     this.rmleg2.field_78796_g = this.rmleg1.field_78796_g;
/* 304 */     this.rrleg1.field_78796_g = 0.349F + newangle;
/* 305 */     this.rrleg2.field_78796_g = this.rrleg1.field_78796_g;
/*     */ 
/*     */     
/* 308 */     if (b.getAttacking() == 0) {
/* 309 */       newangle = MathHelper.func_76134_b(f2 * 0.051F * this.wingspeed) * 3.1415927F * 0.01F;
/*     */     } else {
/* 311 */       newangle = MathHelper.func_76134_b(f2 * 0.51F * this.wingspeed) * 3.1415927F * 0.07F;
/*     */     } 
/* 313 */     this.jaw1.field_78795_f = 0.122F + newangle;
/* 314 */     this.jaw2.field_78795_f = 0.122F + newangle;
/* 315 */     this.jaw3.field_78795_f = 0.0F + newangle;
/* 316 */     this.jaw4.field_78795_f = 0.0F + newangle;
/* 317 */     this.jaw5.field_78795_f = 0.122F + newangle;
/* 318 */     this.jaw6.field_78795_f = 0.122F + newangle;
/* 319 */     this.jaw7.field_78795_f = 0.0F + newangle;
/* 320 */     this.jaw8.field_78795_f = 0.0F + newangle;
/* 321 */     this.jaw9.field_78795_f = 0.314F + newangle;
/*     */     
/* 323 */     this.body1.func_78785_a(f5);
/* 324 */     this.body2.func_78785_a(f5);
/* 325 */     this.head1.func_78785_a(f5);
/* 326 */     this.head2.func_78785_a(f5);
/* 327 */     this.head3.func_78785_a(f5);
/* 328 */     this.head4.func_78785_a(f5);
/* 329 */     this.head5.func_78785_a(f5);
/* 330 */     this.head6.func_78785_a(f5);
/* 331 */     this.head8.func_78785_a(f5);
/* 332 */     this.jaw1.func_78785_a(f5);
/* 333 */     this.jaw2.func_78785_a(f5);
/* 334 */     this.jaw3.func_78785_a(f5);
/* 335 */     this.jaw4.func_78785_a(f5);
/* 336 */     this.head7.func_78785_a(f5);
/* 337 */     this.lfleg1.func_78785_a(f5);
/* 338 */     this.lfleg2.func_78785_a(f5);
/* 339 */     this.lfleg3.func_78785_a(f5);
/* 340 */     this.lmleg1.func_78785_a(f5);
/* 341 */     this.lmleg2.func_78785_a(f5);
/* 342 */     this.lmleg3.func_78785_a(f5);
/* 343 */     this.lrleg1.func_78785_a(f5);
/* 344 */     this.lrleg2.func_78785_a(f5);
/* 345 */     this.lrleg3.func_78785_a(f5);
/* 346 */     this.jaw5.func_78785_a(f5);
/* 347 */     this.jaw6.func_78785_a(f5);
/* 348 */     this.jaw7.func_78785_a(f5);
/* 349 */     this.jaw8.func_78785_a(f5);
/* 350 */     this.rfleg1.func_78785_a(f5);
/* 351 */     this.rfleg2.func_78785_a(f5);
/* 352 */     this.rfleg3.func_78785_a(f5);
/* 353 */     this.rmleg1.func_78785_a(f5);
/* 354 */     this.rmleg2.func_78785_a(f5);
/* 355 */     this.rmleg3.func_78785_a(f5);
/* 356 */     this.rrleg1.func_78785_a(f5);
/* 357 */     this.rrleg2.func_78785_a(f5);
/* 358 */     this.rrleg3.func_78785_a(f5);
/* 359 */     this.jaw9.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 365 */     model.field_78795_f = x;
/* 366 */     model.field_78796_g = y;
/* 367 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 372 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelHerculesBeetle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */