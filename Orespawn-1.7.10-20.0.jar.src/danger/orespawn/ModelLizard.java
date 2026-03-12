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
/*     */ public class ModelLizard
/*     */   extends ModelBase
/*     */ {
/*  14 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer BodyBack;
/*     */   
/*     */   ModelRenderer TopBackLeftLeg;
/*     */   ModelRenderer TailTip;
/*     */   ModelRenderer BodyFront;
/*     */   ModelRenderer TailBase1;
/*     */   ModelRenderer Tail2;
/*     */   ModelRenderer Tail3;
/*     */   ModelRenderer Tail4;
/*     */   ModelRenderer Neck;
/*     */   ModelRenderer TopFrontLeftLeg;
/*     */   ModelRenderer TopBackRightLeg;
/*     */   ModelRenderer BottomBackRightLeg;
/*     */   ModelRenderer TopFrontRightLeg;
/*     */   ModelRenderer BottomBackLeftLeg;
/*     */   ModelRenderer BottomFrontRightLeg;
/*     */   ModelRenderer BottomFrontLeftLeg;
/*     */   ModelRenderer BodyCenter;
/*     */   ModelRenderer Toe7;
/*     */   ModelRenderer Toe6;
/*     */   ModelRenderer BackLeftFoot;
/*     */   ModelRenderer Toe4;
/*     */   ModelRenderer Toe5;
/*     */   ModelRenderer BackRightFoot;
/*     */   ModelRenderer Toe8;
/*     */   ModelRenderer Toe1;
/*     */   ModelRenderer FrontLeftFoot;
/*     */   ModelRenderer Toe3;
/*     */   ModelRenderer Toe2;
/*     */   ModelRenderer FrontRightFoot;
/*     */   ModelRenderer FinRidge7;
/*     */   ModelRenderer FinRidge6;
/*     */   ModelRenderer FinRidge5;
/*     */   ModelRenderer FinRidge4;
/*     */   ModelRenderer FinRidge3;
/*     */   ModelRenderer FinRidge2;
/*     */   ModelRenderer FinRidge1;
/*     */   ModelRenderer Fin10;
/*     */   ModelRenderer Fin9;
/*     */   ModelRenderer Fin8;
/*     */   ModelRenderer Fin7;
/*     */   ModelRenderer Fin6;
/*     */   ModelRenderer Fin5;
/*     */   ModelRenderer Fin3;
/*     */   ModelRenderer Fin2;
/*     */   ModelRenderer Tooth11;
/*     */   ModelRenderer Tooth10;
/*     */   ModelRenderer Tooth8;
/*     */   ModelRenderer Tooth7;
/*     */   ModelRenderer Tooth6;
/*     */   ModelRenderer Tooth5;
/*     */   ModelRenderer Tooth4;
/*     */   ModelRenderer Tooth3;
/*     */   ModelRenderer Tooth2;
/*     */   ModelRenderer CenterRightNose;
/*     */   ModelRenderer CenterLeftNose;
/*     */   ModelRenderer Tooth1;
/*     */   ModelRenderer BottomNose;
/*     */   ModelRenderer TopNose;
/*     */   ModelRenderer JawTop;
/*     */   ModelRenderer CenterMiddleNose;
/*     */   ModelRenderer RightEye;
/*     */   ModelRenderer LeftEye;
/*     */   ModelRenderer Tooth16;
/*     */   ModelRenderer Tooth15;
/*     */   ModelRenderer Tooth14;
/*     */   ModelRenderer Tooth13;
/*     */   ModelRenderer Tooth12;
/*     */   ModelRenderer Tooth9;
/*     */   ModelRenderer BottomJaw;
/*     */   ModelRenderer Hat1;
/*     */   ModelRenderer Hat2;
/*     */   
/*     */   public ModelLizard(float f1) {
/*  90 */     this.wingspeed = f1;
/*     */     
/*  92 */     this.field_78090_t = 128;
/*  93 */     this.field_78089_u = 128;
/*     */     
/*  95 */     this.BodyBack = new ModelRenderer(this, 92, 48);
/*  96 */     this.BodyBack.func_78789_a(-4.0F, -4.0F, 0.0F, 8, 8, 8);
/*  97 */     this.BodyBack.func_78793_a(0.0F, 14.0F, 0.0F);
/*  98 */     this.BodyBack.func_78787_b(64, 32);
/*  99 */     this.BodyBack.field_78809_i = true;
/* 100 */     setRotation(this.BodyBack, 0.0F, 0.0F, 0.0F);
/* 101 */     this.TopBackLeftLeg = new ModelRenderer(this, 54, 32);
/* 102 */     this.TopBackLeftLeg.func_78789_a(0.0F, -2.0F, -2.0F, 8, 3, 3);
/* 103 */     this.TopBackLeftLeg.func_78793_a(3.0F, 13.0F, 2.0F);
/* 104 */     this.TopBackLeftLeg.func_78787_b(64, 32);
/* 105 */     this.TopBackLeftLeg.field_78809_i = true;
/* 106 */     setRotation(this.TopBackLeftLeg, 0.0F, 0.0F, 0.2617994F);
/* 107 */     this.TailTip = new ModelRenderer(this, 100, 118);
/* 108 */     this.TailTip.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 8);
/* 109 */     this.TailTip.func_78793_a(0.0F, 23.0F, 41.0F);
/* 110 */     this.TailTip.func_78787_b(64, 32);
/* 111 */     this.TailTip.field_78809_i = true;
/* 112 */     setRotation(this.TailTip, 0.0F, 0.0F, 0.0F);
/* 113 */     this.BodyFront = new ModelRenderer(this, 92, 16);
/* 114 */     this.BodyFront.func_78789_a(-4.0F, -4.0F, -8.0F, 8, 8, 8);
/* 115 */     this.BodyFront.func_78793_a(0.0F, 14.0F, -8.0F);
/* 116 */     this.BodyFront.func_78787_b(64, 32);
/* 117 */     this.BodyFront.field_78809_i = true;
/* 118 */     setRotation(this.BodyFront, 0.0F, 0.0F, 0.0F);
/* 119 */     this.TailBase1 = new ModelRenderer(this, 88, 64);
/* 120 */     this.TailBase1.func_78789_a(-3.0F, -3.0F, 0.0F, 6, 6, 14);
/* 121 */     this.TailBase1.func_78793_a(0.0F, 14.0F, 7.0F);
/* 122 */     this.TailBase1.func_78787_b(64, 32);
/* 123 */     this.TailBase1.field_78809_i = true;
/* 124 */     setRotation(this.TailBase1, -0.2617994F, 0.0F, 0.0F);
/* 125 */     this.Tail2 = new ModelRenderer(this, 95, 84);
/* 126 */     this.Tail2.func_78789_a(-2.0F, -2.0F, 0.0F, 4, 4, 10);
/* 127 */     this.Tail2.func_78793_a(0.0F, 17.0F, 19.0F);
/* 128 */     this.Tail2.func_78787_b(64, 32);
/* 129 */     this.Tail2.field_78809_i = true;
/* 130 */     setRotation(this.Tail2, -0.5235988F, 0.0F, 0.0F);
/* 131 */     this.Tail3 = new ModelRenderer(this, 100, 98);
/* 132 */     this.Tail3.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 8);
/* 133 */     this.Tail3.func_78793_a(0.0F, 21.0F, 26.0F);
/* 134 */     this.Tail3.func_78787_b(64, 32);
/* 135 */     this.Tail3.field_78809_i = true;
/* 136 */     setRotation(this.Tail3, -0.2617994F, 0.0F, 0.0F);
/* 137 */     this.Tail4 = new ModelRenderer(this, 100, 108);
/* 138 */     this.Tail4.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 8);
/* 139 */     this.Tail4.func_78793_a(0.0F, 23.0F, 33.0F);
/* 140 */     this.Tail4.func_78787_b(64, 32);
/* 141 */     this.Tail4.field_78809_i = true;
/* 142 */     setRotation(this.Tail4, 0.0F, 0.0F, 0.0F);
/* 143 */     this.Neck = new ModelRenderer(this, 100, 9);
/* 144 */     this.Neck.func_78789_a(-3.0F, -2.0F, -2.0F, 6, 5, 2);
/* 145 */     this.Neck.func_78793_a(0.0F, 12.0F, -16.0F);
/* 146 */     this.Neck.func_78787_b(64, 32);
/* 147 */     this.Neck.field_78809_i = true;
/* 148 */     setRotation(this.Neck, 0.0F, 0.0F, 0.0F);
/* 149 */     this.TopFrontLeftLeg = new ModelRenderer(this, 26, 12);
/* 150 */     this.TopFrontLeftLeg.func_78789_a(0.0F, -2.0F, -2.0F, 8, 3, 3);
/* 151 */     this.TopFrontLeftLeg.func_78793_a(3.0F, 13.0F, -12.0F);
/* 152 */     this.TopFrontLeftLeg.func_78787_b(64, 32);
/* 153 */     this.TopFrontLeftLeg.field_78809_i = true;
/* 154 */     setRotation(this.TopFrontLeftLeg, 0.0F, 0.0F, 0.2617994F);
/* 155 */     this.TopBackRightLeg = new ModelRenderer(this, 26, 32);
/* 156 */     this.TopBackRightLeg.func_78789_a(-8.0F, -2.0F, -2.0F, 8, 3, 3);
/* 157 */     this.TopBackRightLeg.func_78793_a(-3.0F, 13.0F, 2.0F);
/* 158 */     this.TopBackRightLeg.func_78787_b(64, 32);
/* 159 */     this.TopBackRightLeg.field_78809_i = true;
/* 160 */     setRotation(this.TopBackRightLeg, 0.0F, 0.0F, -0.2617994F);
/* 161 */     this.BottomBackRightLeg = new ModelRenderer(this, 25, 26);
/* 162 */     this.BottomBackRightLeg.func_78789_a(-12.0F, -8.0F, -2.0F, 9, 3, 3);
/* 163 */     this.BottomBackRightLeg.func_78793_a(-3.0F, 13.0F, 2.0F);
/* 164 */     this.BottomBackRightLeg.func_78787_b(64, 32);
/* 165 */     this.BottomBackRightLeg.field_78809_i = true;
/* 166 */     setRotation(this.BottomBackRightLeg, 0.0F, 0.0F, -1.308997F);
/* 167 */     this.TopFrontRightLeg = new ModelRenderer(this, 54, 12);
/* 168 */     this.TopFrontRightLeg.func_78789_a(-8.0F, -2.0F, -2.0F, 8, 3, 3);
/* 169 */     this.TopFrontRightLeg.func_78793_a(-3.0F, 13.0F, -12.0F);
/* 170 */     this.TopFrontRightLeg.func_78787_b(64, 32);
/* 171 */     this.TopFrontRightLeg.field_78809_i = true;
/* 172 */     setRotation(this.TopFrontRightLeg, 0.0F, 0.0F, -0.2617994F);
/* 173 */     this.BottomBackLeftLeg = new ModelRenderer(this, 53, 26);
/* 174 */     this.BottomBackLeftLeg.func_78789_a(3.0F, -8.0F, -2.0F, 9, 3, 3);
/* 175 */     this.BottomBackLeftLeg.func_78793_a(3.0F, 13.0F, 2.0F);
/* 176 */     this.BottomBackLeftLeg.func_78787_b(64, 32);
/* 177 */     this.BottomBackLeftLeg.field_78809_i = true;
/* 178 */     setRotation(this.BottomBackLeftLeg, 0.0F, 0.0F, 1.308997F);
/* 179 */     this.BottomFrontRightLeg = new ModelRenderer(this, 53, 18);
/* 180 */     this.BottomFrontRightLeg.func_78789_a(-12.0F, -8.0F, -2.0F, 9, 3, 3);
/* 181 */     this.BottomFrontRightLeg.func_78793_a(-3.0F, 13.0F, -12.0F);
/* 182 */     this.BottomFrontRightLeg.func_78787_b(64, 32);
/* 183 */     this.BottomFrontRightLeg.field_78809_i = true;
/* 184 */     setRotation(this.BottomFrontRightLeg, 0.0F, 0.0F, -1.308997F);
/* 185 */     this.BottomFrontLeftLeg = new ModelRenderer(this, 25, 18);
/* 186 */     this.BottomFrontLeftLeg.func_78789_a(3.0F, -8.0F, -2.0F, 9, 3, 3);
/* 187 */     this.BottomFrontLeftLeg.func_78793_a(3.0F, 13.0F, -12.0F);
/* 188 */     this.BottomFrontLeftLeg.func_78787_b(64, 32);
/* 189 */     this.BottomFrontLeftLeg.field_78809_i = true;
/* 190 */     setRotation(this.BottomFrontLeftLeg, 0.0F, 0.0F, 1.308997F);
/* 191 */     this.BodyCenter = new ModelRenderer(this, 92, 32);
/* 192 */     this.BodyCenter.func_78789_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 193 */     this.BodyCenter.func_78793_a(0.0F, 14.0F, -4.0F);
/* 194 */     this.BodyCenter.func_78787_b(64, 32);
/* 195 */     this.BodyCenter.field_78809_i = true;
/* 196 */     setRotation(this.BodyCenter, 0.0F, 0.0F, 0.0F);
/* 197 */     this.Toe7 = new ModelRenderer(this, 104, 0);
/* 198 */     this.Toe7.func_78789_a(10.0F, 10.0F, -5.0F, 1, 1, 1);
/* 199 */     this.Toe7.func_78793_a(3.0F, 13.0F, 2.0F);
/* 200 */     this.Toe7.func_78787_b(64, 32);
/* 201 */     this.Toe7.field_78809_i = true;
/* 202 */     setRotation(this.Toe7, 0.0F, 0.0F, 0.0F);
/* 203 */     this.Toe6 = new ModelRenderer(this, 108, 0);
/* 204 */     this.Toe6.func_78789_a(8.0F, 10.0F, -5.0F, 1, 1, 1);
/* 205 */     this.Toe6.func_78793_a(3.0F, 13.0F, 2.0F);
/* 206 */     this.Toe6.func_78787_b(64, 32);
/* 207 */     this.Toe6.field_78809_i = true;
/* 208 */     setRotation(this.Toe6, 0.0F, 0.0F, 0.0F);
/* 209 */     this.BackLeftFoot = new ModelRenderer(this, 20, 0);
/* 210 */     this.BackLeftFoot.func_78789_a(7.0F, 9.0F, -4.0F, 4, 2, 6);
/* 211 */     this.BackLeftFoot.func_78793_a(3.0F, 13.0F, 2.0F);
/* 212 */     this.BackLeftFoot.func_78787_b(64, 32);
/* 213 */     this.BackLeftFoot.field_78809_i = true;
/* 214 */     setRotation(this.BackLeftFoot, 0.0F, 0.0F, 0.0F);
/* 215 */     this.Toe4 = new ModelRenderer(this, 80, 0);
/* 216 */     this.Toe4.func_78789_a(-11.0F, 10.0F, -5.0F, 1, 1, 1);
/* 217 */     this.Toe4.func_78793_a(-3.0F, 13.0F, 2.0F);
/* 218 */     this.Toe4.func_78787_b(64, 32);
/* 219 */     this.Toe4.field_78809_i = true;
/* 220 */     setRotation(this.Toe4, 0.0F, 0.0F, 0.0F);
/* 221 */     this.Toe5 = new ModelRenderer(this, 84, 0);
/* 222 */     this.Toe5.func_78789_a(-9.0F, 10.0F, -5.0F, 1, 1, 1);
/* 223 */     this.Toe5.func_78793_a(-3.0F, 13.0F, 2.0F);
/* 224 */     this.Toe5.func_78787_b(64, 32);
/* 225 */     this.Toe5.field_78809_i = true;
/* 226 */     setRotation(this.Toe5, 0.0F, 0.0F, 0.0F);
/* 227 */     this.BackRightFoot = new ModelRenderer(this, 60, 0);
/* 228 */     this.BackRightFoot.func_78789_a(-11.0F, 9.0F, -4.0F, 4, 2, 6);
/* 229 */     this.BackRightFoot.func_78793_a(-3.0F, 13.0F, 2.0F);
/* 230 */     this.BackRightFoot.func_78787_b(64, 32);
/* 231 */     this.BackRightFoot.field_78809_i = true;
/* 232 */     setRotation(this.BackRightFoot, 0.0F, 0.0F, 0.0F);
/* 233 */     this.Toe8 = new ModelRenderer(this, 100, 0);
/* 234 */     this.Toe8.func_78789_a(10.0F, 10.0F, -5.0F, 1, 1, 1);
/* 235 */     this.Toe8.func_78793_a(3.0F, 13.0F, -12.0F);
/* 236 */     this.Toe8.func_78787_b(64, 32);
/* 237 */     this.Toe8.field_78809_i = true;
/* 238 */     setRotation(this.Toe8, 0.0F, 0.0F, 0.0F);
/* 239 */     this.Toe1 = new ModelRenderer(this, 96, 0);
/* 240 */     this.Toe1.func_78789_a(8.0F, 10.0F, -5.0F, 1, 1, 1);
/* 241 */     this.Toe1.func_78793_a(3.0F, 13.0F, -12.0F);
/* 242 */     this.Toe1.func_78787_b(64, 32);
/* 243 */     this.Toe1.field_78809_i = true;
/* 244 */     setRotation(this.Toe1, 0.0F, 0.0F, 0.0F);
/* 245 */     this.FrontLeftFoot = new ModelRenderer(this, 40, 0);
/* 246 */     this.FrontLeftFoot.func_78789_a(7.0F, 9.0F, -4.0F, 4, 2, 6);
/* 247 */     this.FrontLeftFoot.func_78793_a(3.0F, 13.0F, -12.0F);
/* 248 */     this.FrontLeftFoot.func_78787_b(64, 32);
/* 249 */     this.FrontLeftFoot.field_78809_i = true;
/* 250 */     setRotation(this.FrontLeftFoot, 0.0F, 0.0F, 0.0F);
/* 251 */     this.Toe3 = new ModelRenderer(this, 88, 0);
/* 252 */     this.Toe3.func_78789_a(-11.0F, 10.0F, -5.0F, 1, 1, 1);
/* 253 */     this.Toe3.func_78793_a(-3.0F, 13.0F, -12.0F);
/* 254 */     this.Toe3.func_78787_b(64, 32);
/* 255 */     this.Toe3.field_78809_i = true;
/* 256 */     setRotation(this.Toe3, 0.0F, 0.0F, 0.0F);
/* 257 */     this.Toe2 = new ModelRenderer(this, 92, 0);
/* 258 */     this.Toe2.func_78789_a(-9.0F, 10.0F, -5.0F, 1, 1, 1);
/* 259 */     this.Toe2.func_78793_a(-3.0F, 13.0F, -12.0F);
/* 260 */     this.Toe2.func_78787_b(64, 32);
/* 261 */     this.Toe2.field_78809_i = true;
/* 262 */     setRotation(this.Toe2, 0.0F, 0.0F, 0.0F);
/* 263 */     this.FrontRightFoot = new ModelRenderer(this, 0, 0);
/* 264 */     this.FrontRightFoot.func_78789_a(-11.0F, 9.0F, -4.0F, 4, 2, 6);
/* 265 */     this.FrontRightFoot.func_78793_a(-3.0F, 13.0F, -12.0F);
/* 266 */     this.FrontRightFoot.func_78787_b(64, 32);
/* 267 */     this.FrontRightFoot.field_78809_i = true;
/* 268 */     setRotation(this.FrontRightFoot, 0.0F, 0.0F, 0.0F);
/* 269 */     this.FinRidge7 = new ModelRenderer(this, 0, 99);
/* 270 */     this.FinRidge7.func_78789_a(0.0F, -13.0F, 0.0F, 2, 13, 1);
/* 271 */     this.FinRidge7.func_78793_a(-1.0F, 10.0F, -4.5F);
/* 272 */     this.FinRidge7.func_78787_b(64, 32);
/* 273 */     this.FinRidge7.field_78809_i = true;
/* 274 */     setRotation(this.FinRidge7, -0.9666439F, 0.0F, 0.0F);
/* 275 */     this.FinRidge6 = new ModelRenderer(this, 6, 98);
/* 276 */     this.FinRidge6.func_78789_a(0.0F, -13.0F, 0.0F, 2, 13, 1);
/* 277 */     this.FinRidge6.func_78793_a(-1.0F, 10.0F, -4.0F);
/* 278 */     this.FinRidge6.func_78787_b(64, 32);
/* 279 */     this.FinRidge6.field_78809_i = true;
/* 280 */     setRotation(this.FinRidge6, -0.5205006F, 0.0F, 0.0F);
/* 281 */     this.FinRidge5 = new ModelRenderer(this, 12, 99);
/* 282 */     this.FinRidge5.func_78789_a(0.0F, -13.0F, 0.0F, 2, 13, 1);
/* 283 */     this.FinRidge5.func_78793_a(-1.0F, 10.0F, -4.0F);
/* 284 */     this.FinRidge5.func_78787_b(64, 32);
/* 285 */     this.FinRidge5.field_78809_i = true;
/* 286 */     setRotation(this.FinRidge5, 0.0F, 0.0F, 0.0F);
/* 287 */     this.FinRidge4 = new ModelRenderer(this, 6, 114);
/* 288 */     this.FinRidge4.func_78789_a(0.0F, -13.0F, 0.0F, 2, 13, 1);
/* 289 */     this.FinRidge4.func_78793_a(-1.0F, 10.0F, -3.5F);
/* 290 */     this.FinRidge4.func_78787_b(64, 32);
/* 291 */     this.FinRidge4.field_78809_i = true;
/* 292 */     setRotation(this.FinRidge4, 0.9666439F, 0.0F, 0.0F);
/* 293 */     this.FinRidge3 = new ModelRenderer(this, 12, 115);
/* 294 */     this.FinRidge3.func_78789_a(0.0F, -13.0F, 0.0F, 2, 13, 1);
/* 295 */     this.FinRidge3.func_78793_a(-1.0F, 10.0F, -4.0F);
/* 296 */     this.FinRidge3.func_78787_b(64, 32);
/* 297 */     this.FinRidge3.field_78809_i = true;
/* 298 */     setRotation(this.FinRidge3, 0.5205006F, 0.0F, 0.0F);
/* 299 */     this.FinRidge2 = new ModelRenderer(this, 0, 84);
/* 300 */     this.FinRidge2.func_78789_a(0.0F, -13.0F, 0.0F, 2, 13, 1);
/* 301 */     this.FinRidge2.func_78793_a(-1.0F, 10.0F, -4.5F);
/* 302 */     this.FinRidge2.func_78787_b(64, 32);
/* 303 */     this.FinRidge2.field_78809_i = true;
/* 304 */     setRotation(this.FinRidge2, -1.375609F, 0.0F, 0.0F);
/* 305 */     this.FinRidge1 = new ModelRenderer(this, 0, 114);
/* 306 */     this.FinRidge1.func_78789_a(0.0F, -13.0F, 0.0F, 2, 13, 1);
/* 307 */     this.FinRidge1.func_78793_a(-1.0F, 10.0F, -3.5F);
/* 308 */     this.FinRidge1.func_78787_b(64, 32);
/* 309 */     this.FinRidge1.field_78809_i = true;
/* 310 */     setRotation(this.FinRidge1, 1.412787F, 0.0F, 0.0F);
/* 311 */     this.Fin10 = new ModelRenderer(this, 0, 58);
/* 312 */     this.Fin10.func_78789_a(0.0F, -13.0F, -2.0F, 0, 11, 6);
/* 313 */     this.Fin10.func_78793_a(0.0F, 10.5F, -5.0F);
/* 314 */     this.Fin10.func_78787_b(64, 32);
/* 315 */     this.Fin10.field_78809_i = true;
/* 316 */     setRotation(this.Fin10, 0.2094395F, 0.0F, 0.0F);
/* 317 */     this.Fin9 = new ModelRenderer(this, 7, 84);
/* 318 */     this.Fin9.func_78789_a(0.0F, -11.0F, 0.0F, 0, 11, 3);
/* 319 */     this.Fin9.func_78793_a(0.0F, 10.0F, -5.0F);
/* 320 */     this.Fin9.func_78787_b(64, 32);
/* 321 */     this.Fin9.field_78809_i = true;
/* 322 */     setRotation(this.Fin9, 1.570796F, 0.0F, 0.0F);
/* 323 */     this.Fin8 = new ModelRenderer(this, 12, 34);
/* 324 */     this.Fin8.func_78789_a(0.0F, -7.0F, -4.0F, 0, 7, 4);
/* 325 */     this.Fin8.func_78793_a(0.0F, 10.0F, 1.0F);
/* 326 */     this.Fin8.func_78787_b(64, 32);
/* 327 */     this.Fin8.field_78809_i = true;
/* 328 */     setRotation(this.Fin8, -1.570796F, 0.0F, 0.0F);
/* 329 */     this.Fin7 = new ModelRenderer(this, 12, 46);
/* 330 */     this.Fin7.func_78789_a(0.0F, -8.0F, -4.0F, 0, 8, 4);
/* 331 */     this.Fin7.func_78793_a(0.0F, 10.0F, 1.0F);
/* 332 */     this.Fin7.func_78787_b(64, 32);
/* 333 */     this.Fin7.field_78809_i = true;
/* 334 */     setRotation(this.Fin7, -1.033256F, 0.0F, 0.0F);
/* 335 */     this.Fin6 = new ModelRenderer(this, 0, 31);
/* 336 */     this.Fin6.func_78789_a(0.0F, -10.0F, -4.0F, 0, 10, 4);
/* 337 */     this.Fin6.func_78793_a(0.0F, 10.0F, -1.0F);
/* 338 */     this.Fin6.func_78787_b(64, 32);
/* 339 */     this.Fin6.field_78809_i = true;
/* 340 */     setRotation(this.Fin6, -0.7267386F, 0.0F, 0.0F);
/* 341 */     this.Fin5 = new ModelRenderer(this, 30, 59);
/* 342 */     this.Fin5.func_78789_a(0.0F, -12.0F, -5.0F, 0, 11, 6);
/* 343 */     this.Fin5.func_78793_a(0.0F, 10.0F, -2.0F);
/* 344 */     this.Fin5.func_78787_b(64, 32);
/* 345 */     this.Fin5.field_78809_i = true;
/* 346 */     setRotation(this.Fin5, -0.3003206F, 0.0F, 0.0F);
/* 347 */     this.Fin3 = new ModelRenderer(this, 14, 60);
/* 348 */     this.Fin3.func_78789_a(0.0F, -12.0F, -3.0F, 0, 12, 6);
/* 349 */     this.Fin3.func_78793_a(0.0F, 10.0F, -4.0F);
/* 350 */     this.Fin3.func_78787_b(64, 32);
/* 351 */     this.Fin3.field_78809_i = true;
/* 352 */     setRotation(this.Fin3, 0.7073231F, 0.0F, 0.0F);
/* 353 */     this.Fin2 = new ModelRenderer(this, 14, 79);
/* 354 */     this.Fin2.func_78789_a(0.0F, -12.0F, -4.0F, 0, 11, 6);
/* 355 */     this.Fin2.func_78793_a(0.0F, 10.0F, -4.0F);
/* 356 */     this.Fin2.func_78787_b(64, 32);
/* 357 */     this.Fin2.field_78809_i = true;
/* 358 */     setRotation(this.Fin2, 1.048747F, 0.0F, 0.0F);
/* 359 */     this.Tooth11 = new ModelRenderer(this, 24, 110);
/* 360 */     this.Tooth11.func_78789_a(3.0F, 3.0F, -8.0F, 1, 1, 1);
/* 361 */     this.Tooth11.func_78793_a(0.0F, 12.0F, -18.0F);
/* 362 */     this.Tooth11.func_78787_b(64, 32);
/* 363 */     this.Tooth11.field_78809_i = true;
/* 364 */     setRotation(this.Tooth11, 0.0F, 0.0F, 0.0F);
/* 365 */     this.Tooth10 = new ModelRenderer(this, 24, 106);
/* 366 */     this.Tooth10.func_78789_a(3.0F, 3.0F, -10.0F, 1, 1, 1);
/* 367 */     this.Tooth10.func_78793_a(0.0F, 12.0F, -18.0F);
/* 368 */     this.Tooth10.func_78787_b(64, 32);
/* 369 */     this.Tooth10.field_78809_i = true;
/* 370 */     setRotation(this.Tooth10, 0.0F, 0.0F, 0.0F);
/* 371 */     this.Tooth8 = new ModelRenderer(this, 28, 95);
/* 372 */     this.Tooth8.func_78789_a(3.0F, 3.0F, -14.0F, 1, 1, 1);
/* 373 */     this.Tooth8.func_78793_a(0.0F, 12.0F, -18.0F);
/* 374 */     this.Tooth8.func_78787_b(64, 32);
/* 375 */     this.Tooth8.field_78809_i = true;
/* 376 */     setRotation(this.Tooth8, 0.0F, 0.0F, 0.0F);
/* 377 */     this.Tooth7 = new ModelRenderer(this, 70, 106);
/* 378 */     this.Tooth7.func_78789_a(-4.0F, 3.0F, -10.0F, 1, 1, 1);
/* 379 */     this.Tooth7.func_78793_a(0.0F, 12.0F, -18.0F);
/* 380 */     this.Tooth7.func_78787_b(64, 32);
/* 381 */     this.Tooth7.field_78809_i = true;
/* 382 */     setRotation(this.Tooth7, 0.0F, 0.0F, 0.0F);
/* 383 */     this.Tooth6 = new ModelRenderer(this, 70, 102);
/* 384 */     this.Tooth6.func_78789_a(-4.0F, 3.0F, -12.0F, 1, 1, 1);
/* 385 */     this.Tooth6.func_78793_a(0.0F, 12.0F, -18.0F);
/* 386 */     this.Tooth6.func_78787_b(64, 32);
/* 387 */     this.Tooth6.field_78809_i = true;
/* 388 */     setRotation(this.Tooth6, 0.0F, 0.0F, 0.0F);
/* 389 */     this.Tooth5 = new ModelRenderer(this, 66, 95);
/* 390 */     this.Tooth5.func_78789_a(-4.0F, 3.0F, -14.0F, 1, 1, 1);
/* 391 */     this.Tooth5.func_78793_a(0.0F, 12.0F, -18.0F);
/* 392 */     this.Tooth5.func_78787_b(64, 32);
/* 393 */     this.Tooth5.field_78809_i = true;
/* 394 */     setRotation(this.Tooth5, 0.0F, 0.0F, 0.0F);
/* 395 */     this.Tooth4 = new ModelRenderer(this, 60, 95);
/* 396 */     this.Tooth4.func_78789_a(1.0F, 3.0F, -14.0F, 1, 1, 1);
/* 397 */     this.Tooth4.func_78793_a(0.0F, 12.0F, -18.0F);
/* 398 */     this.Tooth4.func_78787_b(64, 32);
/* 399 */     this.Tooth4.field_78809_i = true;
/* 400 */     setRotation(this.Tooth4, 0.0F, 0.0F, 0.0F);
/* 401 */     this.Tooth3 = new ModelRenderer(this, 34, 95);
/* 402 */     this.Tooth3.func_78789_a(-2.0F, 3.0F, -14.0F, 1, 1, 1);
/* 403 */     this.Tooth3.func_78793_a(0.0F, 12.0F, -18.0F);
/* 404 */     this.Tooth3.func_78787_b(64, 32);
/* 405 */     this.Tooth3.field_78809_i = true;
/* 406 */     setRotation(this.Tooth3, 0.0F, 0.0F, 0.0F);
/* 407 */     this.Tooth2 = new ModelRenderer(this, 70, 110);
/* 408 */     this.Tooth2.func_78789_a(-4.0F, 3.0F, -8.0F, 1, 1, 1);
/* 409 */     this.Tooth2.func_78793_a(0.0F, 12.0F, -18.0F);
/* 410 */     this.Tooth2.func_78787_b(64, 32);
/* 411 */     this.Tooth2.field_78809_i = true;
/* 412 */     setRotation(this.Tooth2, 0.0F, 0.0F, 0.0F);
/* 413 */     this.CenterRightNose = new ModelRenderer(this, 40, 88);
/* 414 */     this.CenterRightNose.func_78789_a(-4.0F, 0.0F, -14.0F, 1, 1, 1);
/* 415 */     this.CenterRightNose.func_78793_a(0.0F, 12.0F, -18.0F);
/* 416 */     this.CenterRightNose.func_78787_b(64, 32);
/* 417 */     this.CenterRightNose.field_78809_i = true;
/* 418 */     setRotation(this.CenterRightNose, 0.0F, 0.0F, 0.0F);
/* 419 */     this.CenterLeftNose = new ModelRenderer(this, 54, 88);
/* 420 */     this.CenterLeftNose.func_78789_a(3.0F, 0.0F, -14.0F, 1, 1, 1);
/* 421 */     this.CenterLeftNose.func_78793_a(0.0F, 12.0F, -18.0F);
/* 422 */     this.CenterLeftNose.func_78787_b(64, 32);
/* 423 */     this.CenterLeftNose.field_78809_i = true;
/* 424 */     setRotation(this.CenterLeftNose, 0.0F, 0.0F, 0.0F);
/* 425 */     this.Tooth1 = new ModelRenderer(this, 24, 102);
/* 426 */     this.Tooth1.func_78789_a(3.0F, 3.0F, -12.0F, 1, 1, 1);
/* 427 */     this.Tooth1.func_78793_a(0.0F, 12.0F, -18.0F);
/* 428 */     this.Tooth1.func_78787_b(64, 32);
/* 429 */     this.Tooth1.field_78809_i = true;
/* 430 */     setRotation(this.Tooth1, 0.0F, 0.0F, 0.0F);
/* 431 */     this.BottomNose = new ModelRenderer(this, 40, 90);
/* 432 */     this.BottomNose.func_78789_a(-4.0F, 1.0F, -14.0F, 8, 2, 1);
/* 433 */     this.BottomNose.func_78793_a(0.0F, 12.0F, -18.0F);
/* 434 */     this.BottomNose.func_78787_b(64, 32);
/* 435 */     this.BottomNose.field_78809_i = true;
/* 436 */     setRotation(this.BottomNose, 0.0F, 0.0F, 0.0F);
/* 437 */     this.TopNose = new ModelRenderer(this, 40, 84);
/* 438 */     this.TopNose.func_78789_a(-4.0F, -3.0F, -14.0F, 8, 3, 1);
/* 439 */     this.TopNose.func_78793_a(0.0F, 12.0F, -18.0F);
/* 440 */     this.TopNose.func_78787_b(64, 32);
/* 441 */     this.TopNose.field_78809_i = true;
/* 442 */     setRotation(this.TopNose, 0.0F, 0.0F, 0.0F);
/* 443 */     this.JawTop = new ModelRenderer(this, 28, 97);
/* 444 */     this.JawTop.func_78789_a(-4.0F, -3.0F, -13.0F, 8, 6, 13);
/* 445 */     this.JawTop.func_78793_a(0.0F, 12.0F, -18.0F);
/* 446 */     this.JawTop.func_78787_b(64, 32);
/* 447 */     this.JawTop.field_78809_i = true;
/* 448 */     setRotation(this.JawTop, 0.0F, 0.0F, 0.0F);
/* 449 */     this.CenterMiddleNose = new ModelRenderer(this, 46, 88);
/* 450 */     this.CenterMiddleNose.func_78789_a(-1.0F, 0.0F, -14.0F, 2, 1, 1);
/* 451 */     this.CenterMiddleNose.func_78793_a(0.0F, 12.0F, -18.0F);
/* 452 */     this.CenterMiddleNose.func_78787_b(64, 32);
/* 453 */     this.CenterMiddleNose.field_78809_i = true;
/* 454 */     setRotation(this.CenterMiddleNose, 0.0F, 0.0F, 0.0F);
/* 455 */     this.RightEye = new ModelRenderer(this, 116, 10);
/* 456 */     this.RightEye.func_78789_a(-2.0F, -4.0F, -4.0F, 2, 2, 1);
/* 457 */     this.RightEye.func_78793_a(0.0F, 12.0F, -18.0F);
/* 458 */     this.RightEye.func_78787_b(64, 32);
/* 459 */     this.RightEye.field_78809_i = true;
/* 460 */     setRotation(this.RightEye, 0.0F, 0.7853982F, 0.3490659F);
/* 461 */     this.LeftEye = new ModelRenderer(this, 94, 10);
/* 462 */     this.LeftEye.func_78789_a(0.0F, -4.0F, -4.0F, 2, 2, 1);
/* 463 */     this.LeftEye.func_78793_a(0.0F, 12.0F, -18.0F);
/* 464 */     this.LeftEye.func_78787_b(64, 32);
/* 465 */     this.LeftEye.field_78809_i = true;
/* 466 */     setRotation(this.LeftEye, 0.0F, -0.7853982F, -0.3490659F);
/* 467 */     this.Tooth16 = new ModelRenderer(this, 24, 97);
/* 468 */     this.Tooth16.func_78789_a(3.0F, -1.0F, -10.0F, 1, 1, 1);
/* 469 */     this.Tooth16.func_78793_a(0.0F, 14.0F, -19.0F);
/* 470 */     this.Tooth16.func_78787_b(64, 32);
/* 471 */     this.Tooth16.field_78809_i = true;
/* 472 */     setRotation(this.Tooth16, 0.5235988F, 0.0F, 0.0F);
/* 473 */     this.Tooth15 = new ModelRenderer(this, 70, 97);
/* 474 */     this.Tooth15.func_78789_a(-4.0F, -1.0F, -10.0F, 1, 1, 1);
/* 475 */     this.Tooth15.func_78793_a(0.0F, 14.0F, -19.0F);
/* 476 */     this.Tooth15.func_78787_b(64, 32);
/* 477 */     this.Tooth15.field_78809_i = true;
/* 478 */     setRotation(this.Tooth15, 0.5235988F, 0.0F, 0.0F);
/* 479 */     this.Tooth14 = new ModelRenderer(this, 42, 95);
/* 480 */     this.Tooth14.func_78789_a(-2.0F, -1.0F, -10.0F, 1, 1, 1);
/* 481 */     this.Tooth14.func_78793_a(0.0F, 14.0F, -19.0F);
/* 482 */     this.Tooth14.func_78787_b(64, 32);
/* 483 */     this.Tooth14.field_78809_i = true;
/* 484 */     setRotation(this.Tooth14, 0.5235988F, 0.0F, 0.0F);
/* 485 */     this.Tooth13 = new ModelRenderer(this, 52, 95);
/* 486 */     this.Tooth13.func_78789_a(1.0F, -1.0F, -10.0F, 1, 1, 1);
/* 487 */     this.Tooth13.func_78793_a(0.0F, 14.0F, -19.0F);
/* 488 */     this.Tooth13.func_78787_b(64, 32);
/* 489 */     this.Tooth13.field_78809_i = true;
/* 490 */     setRotation(this.Tooth13, 0.5235988F, 0.0F, 0.0F);
/* 491 */     this.Tooth12 = new ModelRenderer(this, 24, 114);
/* 492 */     this.Tooth12.func_78789_a(3.0F, -1.0F, -7.0F, 1, 1, 1);
/* 493 */     this.Tooth12.func_78793_a(0.0F, 14.0F, -19.0F);
/* 494 */     this.Tooth12.func_78787_b(64, 32);
/* 495 */     this.Tooth12.field_78809_i = true;
/* 496 */     setRotation(this.Tooth12, 0.5235988F, 0.0F, 0.0F);
/* 497 */     this.Tooth9 = new ModelRenderer(this, 70, 114);
/* 498 */     this.Tooth9.func_78789_a(-4.0F, -1.0F, -7.0F, 1, 1, 1);
/* 499 */     this.Tooth9.func_78793_a(0.0F, 14.0F, -19.0F);
/* 500 */     this.Tooth9.func_78787_b(64, 32);
/* 501 */     this.Tooth9.field_78809_i = true;
/* 502 */     setRotation(this.Tooth9, 0.5235988F, 0.0F, 0.0F);
/* 503 */     this.BottomJaw = new ModelRenderer(this, 31, 116);
/* 504 */     this.BottomJaw.func_78789_a(-4.0F, 0.0F, -10.0F, 8, 2, 10);
/* 505 */     this.BottomJaw.func_78793_a(0.0F, 14.0F, -19.0F);
/* 506 */     this.BottomJaw.func_78787_b(64, 32);
/* 507 */     this.BottomJaw.field_78809_i = true;
/* 508 */     setRotation(this.BottomJaw, 0.5235988F, 0.0F, 0.0F);
/* 509 */     this.Hat1 = new ModelRenderer(this, 30, 40);
/* 510 */     this.Hat1.func_78789_a(-2.0F, -4.0F, -6.0F, 4, 1, 6);
/* 511 */     this.Hat1.func_78793_a(0.0F, 12.0F, -18.0F);
/* 512 */     this.Hat1.func_78787_b(128, 128);
/* 513 */     this.Hat1.field_78809_i = true;
/* 514 */     setRotation(this.Hat1, 0.0F, 0.0F, 0.0F);
/* 515 */     this.Hat2 = new ModelRenderer(this, 30, 40);
/* 516 */     this.Hat2.func_78789_a(-1.5F, -6.0F, -4.0F, 3, 2, 4);
/* 517 */     this.Hat2.func_78793_a(0.0F, 12.0F, -18.0F);
/* 518 */     this.Hat2.func_78787_b(128, 128);
/* 519 */     this.Hat2.field_78809_i = true;
/* 520 */     setRotation(this.Hat2, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 526 */     Lizard e = (Lizard)entity;
/* 527 */     float newangle = 0.0F;
/* 528 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 529 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 531 */     if (f1 > 0.1D) {
/* 532 */       newangle = MathHelper.func_76134_b(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 534 */       newangle = 0.0F;
/*     */     } 
/*     */ 
/*     */     
/* 538 */     this.TopFrontLeftLeg.field_78796_g = newangle;
/* 539 */     this.BottomFrontLeftLeg.field_78795_f = newangle;
/* 540 */     this.FrontLeftFoot.field_78796_g = newangle;
/* 541 */     this.Toe8.field_78796_g = newangle;
/* 542 */     this.Toe1.field_78796_g = newangle;
/*     */     
/* 544 */     this.TopFrontRightLeg.field_78796_g = newangle;
/* 545 */     this.BottomFrontRightLeg.field_78795_f = -newangle;
/* 546 */     this.FrontRightFoot.field_78796_g = newangle;
/* 547 */     this.Toe3.field_78796_g = newangle;
/* 548 */     this.Toe2.field_78796_g = newangle;
/*     */     
/* 550 */     this.TopBackLeftLeg.field_78796_g = -newangle;
/* 551 */     this.BottomBackLeftLeg.field_78795_f = -newangle;
/* 552 */     this.BackLeftFoot.field_78796_g = -newangle;
/* 553 */     this.Toe7.field_78796_g = -newangle;
/* 554 */     this.Toe6.field_78796_g = -newangle;
/*     */     
/* 556 */     this.TopBackRightLeg.field_78796_g = -newangle;
/* 557 */     this.BottomBackRightLeg.field_78795_f = newangle;
/* 558 */     this.BackRightFoot.field_78796_g = -newangle;
/* 559 */     this.Toe4.field_78796_g = -newangle;
/* 560 */     this.Toe5.field_78796_g = -newangle;
/*     */ 
/*     */ 
/*     */     
/* 564 */     if (e.getAttacking() != 0) {
/* 565 */       this.BottomJaw.field_78795_f = 0.52F + MathHelper.func_76134_b(f2 * 0.45F) * 0.35F;
/*     */     } else {
/* 567 */       this.BottomJaw.field_78795_f = 0.25F;
/*     */     } 
/* 569 */     this.Tooth9.field_78795_f = this.BottomJaw.field_78795_f;
/* 570 */     this.Tooth15.field_78795_f = this.BottomJaw.field_78795_f;
/* 571 */     this.Tooth14.field_78795_f = this.BottomJaw.field_78795_f;
/* 572 */     this.Tooth13.field_78795_f = this.BottomJaw.field_78795_f;
/* 573 */     this.Tooth16.field_78795_f = this.BottomJaw.field_78795_f;
/* 574 */     this.Tooth12.field_78795_f = this.BottomJaw.field_78795_f;
/*     */ 
/*     */     
/* 577 */     newangle = MathHelper.func_76134_b(f2 * 0.25F * this.wingspeed) * 3.1415927F * 0.05F;
/* 578 */     if (e.getAttacking() != 0) {
/* 579 */       newangle = MathHelper.func_76134_b(f2 * 1.25F * this.wingspeed) * 3.1415927F * 0.35F;
/*     */     }
/*     */     
/* 582 */     this.TailBase1.field_78796_g = newangle * 0.25F;
/* 583 */     this.TailBase1.field_78798_e += (float)Math.cos(this.TailBase1.field_78796_g) * 12.0F;
/* 584 */     this.TailBase1.field_78800_c += (float)Math.sin(this.TailBase1.field_78796_g) * 12.0F;
/* 585 */     this.Tail2.field_78796_g = newangle * 0.5F;
/* 586 */     this.Tail2.field_78798_e += (float)Math.cos(this.Tail2.field_78796_g) * 9.0F;
/* 587 */     this.Tail2.field_78800_c += (float)Math.sin(this.Tail2.field_78796_g) * 9.0F;
/* 588 */     this.Tail3.field_78796_g = newangle * 0.75F;
/* 589 */     this.Tail3.field_78798_e += (float)Math.cos(this.Tail3.field_78796_g) * 7.0F;
/* 590 */     this.Tail3.field_78800_c += (float)Math.sin(this.Tail3.field_78796_g) * 7.0F;
/* 591 */     this.Tail4.field_78796_g = newangle * 1.0F;
/* 592 */     this.Tail4.field_78798_e += (float)Math.cos(this.Tail4.field_78796_g) * 7.0F;
/* 593 */     this.Tail4.field_78800_c += (float)Math.sin(this.Tail4.field_78796_g) * 7.0F;
/* 594 */     this.TailTip.field_78796_g = newangle * 1.25F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 600 */     this.Neck.field_78796_g = (float)Math.toRadians(f3) * 0.25F;
/* 601 */     this.Neck.field_78798_e -= (float)Math.cos(this.Neck.field_78796_g) * 2.0F;
/* 602 */     this.Neck.field_78800_c -= (float)Math.sin(this.Neck.field_78796_g) * 2.0F;
/* 603 */     this.JawTop.field_78796_g = (float)Math.toRadians(f3) * 0.5F;
/* 604 */     this.TopNose.field_78798_e = this.JawTop.field_78798_e;
/* 605 */     this.TopNose.field_78800_c = this.JawTop.field_78800_c;
/* 606 */     this.TopNose.field_78796_g = this.JawTop.field_78796_g;
/* 607 */     this.BottomNose.field_78798_e = this.JawTop.field_78798_e;
/* 608 */     this.BottomNose.field_78800_c = this.JawTop.field_78800_c;
/* 609 */     this.BottomNose.field_78796_g = this.JawTop.field_78796_g;
/* 610 */     this.CenterRightNose.field_78798_e = this.JawTop.field_78798_e;
/* 611 */     this.CenterRightNose.field_78800_c = this.JawTop.field_78800_c;
/* 612 */     this.CenterRightNose.field_78796_g = this.JawTop.field_78796_g;
/* 613 */     this.CenterMiddleNose.field_78798_e = this.JawTop.field_78798_e;
/* 614 */     this.CenterMiddleNose.field_78800_c = this.JawTop.field_78800_c;
/* 615 */     this.CenterMiddleNose.field_78796_g = this.JawTop.field_78796_g;
/* 616 */     this.CenterLeftNose.field_78798_e = this.JawTop.field_78798_e;
/* 617 */     this.CenterLeftNose.field_78800_c = this.JawTop.field_78800_c;
/* 618 */     this.CenterLeftNose.field_78796_g = this.JawTop.field_78796_g;
/* 619 */     this.RightEye.field_78798_e = this.JawTop.field_78798_e;
/* 620 */     this.RightEye.field_78800_c = this.JawTop.field_78800_c;
/* 621 */     this.JawTop.field_78796_g += 0.78F;
/* 622 */     this.LeftEye.field_78798_e = this.JawTop.field_78798_e;
/* 623 */     this.LeftEye.field_78800_c = this.JawTop.field_78800_c;
/* 624 */     this.JawTop.field_78796_g -= 0.78F;
/* 625 */     this.Tooth11.field_78798_e = this.JawTop.field_78798_e;
/* 626 */     this.Tooth11.field_78800_c = this.JawTop.field_78800_c;
/* 627 */     this.Tooth11.field_78796_g = this.JawTop.field_78796_g;
/* 628 */     this.Tooth10.field_78798_e = this.JawTop.field_78798_e;
/* 629 */     this.Tooth10.field_78800_c = this.JawTop.field_78800_c;
/* 630 */     this.Tooth10.field_78796_g = this.JawTop.field_78796_g;
/* 631 */     this.Tooth1.field_78798_e = this.JawTop.field_78798_e;
/* 632 */     this.Tooth1.field_78800_c = this.JawTop.field_78800_c;
/* 633 */     this.Tooth1.field_78796_g = this.JawTop.field_78796_g;
/* 634 */     this.Tooth8.field_78798_e = this.JawTop.field_78798_e;
/* 635 */     this.Tooth8.field_78800_c = this.JawTop.field_78800_c;
/* 636 */     this.Tooth8.field_78796_g = this.JawTop.field_78796_g;
/* 637 */     this.Tooth4.field_78798_e = this.JawTop.field_78798_e;
/* 638 */     this.Tooth4.field_78800_c = this.JawTop.field_78800_c;
/* 639 */     this.Tooth4.field_78796_g = this.JawTop.field_78796_g;
/* 640 */     this.Tooth3.field_78798_e = this.JawTop.field_78798_e;
/* 641 */     this.Tooth3.field_78800_c = this.JawTop.field_78800_c;
/* 642 */     this.Tooth3.field_78796_g = this.JawTop.field_78796_g;
/* 643 */     this.Tooth5.field_78798_e = this.JawTop.field_78798_e;
/* 644 */     this.Tooth5.field_78800_c = this.JawTop.field_78800_c;
/* 645 */     this.Tooth5.field_78796_g = this.JawTop.field_78796_g;
/* 646 */     this.Tooth6.field_78798_e = this.JawTop.field_78798_e;
/* 647 */     this.Tooth6.field_78800_c = this.JawTop.field_78800_c;
/* 648 */     this.Tooth6.field_78796_g = this.JawTop.field_78796_g;
/* 649 */     this.Tooth7.field_78798_e = this.JawTop.field_78798_e;
/* 650 */     this.Tooth7.field_78800_c = this.JawTop.field_78800_c;
/* 651 */     this.Tooth7.field_78796_g = this.JawTop.field_78796_g;
/* 652 */     this.Tooth2.field_78798_e = this.JawTop.field_78798_e;
/* 653 */     this.Tooth2.field_78800_c = this.JawTop.field_78800_c;
/* 654 */     this.Tooth2.field_78796_g = this.JawTop.field_78796_g;
/*     */     
/* 656 */     this.Hat1.field_78798_e = this.JawTop.field_78798_e;
/* 657 */     this.Hat1.field_78800_c = this.JawTop.field_78800_c;
/* 658 */     this.Hat1.field_78796_g = this.JawTop.field_78796_g;
/* 659 */     this.Hat2.field_78798_e = this.JawTop.field_78798_e;
/* 660 */     this.Hat2.field_78800_c = this.JawTop.field_78800_c;
/* 661 */     this.Hat2.field_78796_g = this.JawTop.field_78796_g;
/*     */     
/* 663 */     this.Neck.field_78798_e -= (float)Math.cos(this.Neck.field_78796_g) * 3.0F;
/* 664 */     this.Neck.field_78800_c -= (float)Math.sin(this.Neck.field_78796_g) * 3.0F;
/* 665 */     this.BottomJaw.field_78796_g = (float)Math.toRadians(f3) * 0.5F;
/* 666 */     this.Tooth9.field_78798_e = this.BottomJaw.field_78798_e;
/* 667 */     this.Tooth9.field_78800_c = this.BottomJaw.field_78800_c;
/* 668 */     this.Tooth9.field_78796_g = this.BottomJaw.field_78796_g;
/* 669 */     this.Tooth16.field_78798_e = this.BottomJaw.field_78798_e;
/* 670 */     this.Tooth16.field_78800_c = this.BottomJaw.field_78800_c;
/* 671 */     this.Tooth16.field_78796_g = this.BottomJaw.field_78796_g;
/* 672 */     this.Tooth15.field_78798_e = this.BottomJaw.field_78798_e;
/* 673 */     this.Tooth15.field_78800_c = this.BottomJaw.field_78800_c;
/* 674 */     this.Tooth15.field_78796_g = this.BottomJaw.field_78796_g;
/* 675 */     this.Tooth14.field_78798_e = this.BottomJaw.field_78798_e;
/* 676 */     this.Tooth14.field_78800_c = this.BottomJaw.field_78800_c;
/* 677 */     this.Tooth14.field_78796_g = this.BottomJaw.field_78796_g;
/* 678 */     this.Tooth13.field_78798_e = this.BottomJaw.field_78798_e;
/* 679 */     this.Tooth13.field_78800_c = this.BottomJaw.field_78800_c;
/* 680 */     this.Tooth13.field_78796_g = this.BottomJaw.field_78796_g;
/* 681 */     this.Tooth12.field_78798_e = this.BottomJaw.field_78798_e;
/* 682 */     this.Tooth12.field_78800_c = this.BottomJaw.field_78800_c;
/* 683 */     this.Tooth12.field_78796_g = this.BottomJaw.field_78796_g;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 691 */     this.BodyBack.func_78785_a(f5);
/* 692 */     this.TopBackLeftLeg.func_78785_a(f5);
/* 693 */     this.TailTip.func_78785_a(f5);
/* 694 */     this.BodyFront.func_78785_a(f5);
/* 695 */     this.TailBase1.func_78785_a(f5);
/* 696 */     this.Tail2.func_78785_a(f5);
/* 697 */     this.Tail3.func_78785_a(f5);
/* 698 */     this.Tail4.func_78785_a(f5);
/* 699 */     this.Neck.func_78785_a(f5);
/* 700 */     this.TopFrontLeftLeg.func_78785_a(f5);
/* 701 */     this.TopBackRightLeg.func_78785_a(f5);
/* 702 */     this.BottomBackRightLeg.func_78785_a(f5);
/* 703 */     this.TopFrontRightLeg.func_78785_a(f5);
/* 704 */     this.BottomBackLeftLeg.func_78785_a(f5);
/* 705 */     this.BottomFrontRightLeg.func_78785_a(f5);
/* 706 */     this.BottomFrontLeftLeg.func_78785_a(f5);
/* 707 */     this.BodyCenter.func_78785_a(f5);
/* 708 */     this.Toe7.func_78785_a(f5);
/* 709 */     this.Toe6.func_78785_a(f5);
/* 710 */     this.BackLeftFoot.func_78785_a(f5);
/* 711 */     this.Toe4.func_78785_a(f5);
/* 712 */     this.Toe5.func_78785_a(f5);
/* 713 */     this.BackRightFoot.func_78785_a(f5);
/* 714 */     this.Toe8.func_78785_a(f5);
/* 715 */     this.Toe1.func_78785_a(f5);
/* 716 */     this.FrontLeftFoot.func_78785_a(f5);
/* 717 */     this.Toe3.func_78785_a(f5);
/* 718 */     this.Toe2.func_78785_a(f5);
/* 719 */     this.FrontRightFoot.func_78785_a(f5);
/* 720 */     this.FinRidge7.func_78785_a(f5);
/* 721 */     this.FinRidge6.func_78785_a(f5);
/* 722 */     this.FinRidge5.func_78785_a(f5);
/* 723 */     this.FinRidge4.func_78785_a(f5);
/* 724 */     this.FinRidge3.func_78785_a(f5);
/* 725 */     this.FinRidge2.func_78785_a(f5);
/* 726 */     this.FinRidge1.func_78785_a(f5);
/* 727 */     this.Tooth11.func_78785_a(f5);
/* 728 */     this.Tooth10.func_78785_a(f5);
/* 729 */     this.Tooth8.func_78785_a(f5);
/* 730 */     this.Tooth7.func_78785_a(f5);
/* 731 */     this.Tooth6.func_78785_a(f5);
/* 732 */     this.Tooth5.func_78785_a(f5);
/* 733 */     this.Tooth4.func_78785_a(f5);
/* 734 */     this.Tooth3.func_78785_a(f5);
/* 735 */     this.Tooth2.func_78785_a(f5);
/* 736 */     this.CenterRightNose.func_78785_a(f5);
/* 737 */     this.CenterLeftNose.func_78785_a(f5);
/* 738 */     this.Tooth1.func_78785_a(f5);
/* 739 */     this.BottomNose.func_78785_a(f5);
/* 740 */     this.TopNose.func_78785_a(f5);
/* 741 */     this.JawTop.func_78785_a(f5);
/* 742 */     this.CenterMiddleNose.func_78785_a(f5);
/* 743 */     this.RightEye.func_78785_a(f5);
/* 744 */     this.LeftEye.func_78785_a(f5);
/* 745 */     this.Tooth16.func_78785_a(f5);
/* 746 */     this.Tooth15.func_78785_a(f5);
/* 747 */     this.Tooth14.func_78785_a(f5);
/* 748 */     this.Tooth13.func_78785_a(f5);
/* 749 */     this.Tooth12.func_78785_a(f5);
/* 750 */     this.Tooth9.func_78785_a(f5);
/* 751 */     this.BottomJaw.func_78785_a(f5);
/* 752 */     if (e instanceof EntityCannonFodder && 
/* 753 */       e.get_is_activated() != 0) {
/* 754 */       this.Hat1.func_78785_a(f5);
/* 755 */       if (e.get_is_activated() > 1) {
/* 756 */         this.Hat2.func_78785_a(f5);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 764 */     this.Fin10.func_78785_a(f5);
/* 765 */     this.Fin9.func_78785_a(f5);
/* 766 */     this.Fin8.func_78785_a(f5);
/* 767 */     this.Fin7.func_78785_a(f5);
/* 768 */     this.Fin6.func_78785_a(f5);
/* 769 */     this.Fin5.func_78785_a(f5);
/* 770 */     this.Fin3.func_78785_a(f5);
/* 771 */     this.Fin2.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 783 */     model.field_78795_f = x;
/* 784 */     model.field_78796_g = y;
/* 785 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 790 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelLizard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */