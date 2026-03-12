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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelEmperorScorpion
/*     */   extends ModelBase
/*     */ {
/*  23 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Head;
/*     */   
/*     */   ModelRenderer Seg1;
/*     */   ModelRenderer Seg2;
/*     */   ModelRenderer Seg3;
/*     */   ModelRenderer Seg4;
/*     */   ModelRenderer Seg5;
/*     */   ModelRenderer Seg6;
/*     */   ModelRenderer Seg7;
/*     */   ModelRenderer Seg8;
/*     */   ModelRenderer Tailseg1;
/*     */   ModelRenderer Tailseg2;
/*     */   ModelRenderer Tailseg3;
/*     */   ModelRenderer Tailseg4;
/*     */   ModelRenderer Tailseg5;
/*     */   ModelRenderer Tailseg6;
/*     */   ModelRenderer Tailseg7;
/*     */   ModelRenderer Tailseg8;
/*     */   ModelRenderer Stinger1;
/*     */   ModelRenderer Stinger2;
/*     */   ModelRenderer Stinger3;
/*     */   ModelRenderer LeftShoulder;
/*     */   ModelRenderer LeftArmSeg1;
/*     */   ModelRenderer LeftArmSeg2;
/*     */   ModelRenderer LeftArmSeg3;
/*     */   ModelRenderer LeftArmSeg4;
/*     */   ModelRenderer RightShoulder;
/*     */   ModelRenderer RightArmSeg1;
/*     */   ModelRenderer RightArmSeg2;
/*     */   ModelRenderer RightArmSeg3;
/*     */   ModelRenderer RightArmSeg4;
/*     */   ModelRenderer RightPincer;
/*     */   ModelRenderer LeftPincer;
/*     */   ModelRenderer Lefteye;
/*     */   ModelRenderer Righteye;
/*     */   ModelRenderer RightMandible;
/*     */   ModelRenderer LeftMandible;
/*     */   ModelRenderer RightManPart2;
/*     */   ModelRenderer LeftManPart2;
/*     */   ModelRenderer Leg1Seg1;
/*     */   ModelRenderer Leg1Seg2;
/*     */   ModelRenderer Leg1Seg3;
/*     */   ModelRenderer Leg1Seg4;
/*     */   ModelRenderer Leg1Seg5;
/*     */   ModelRenderer Leg2Seg1;
/*     */   ModelRenderer Leg2Seg2;
/*     */   ModelRenderer Leg2Seg3;
/*     */   ModelRenderer Leg2Seg4;
/*     */   ModelRenderer Leg2Seg5;
/*     */   ModelRenderer Leg3Seg1;
/*     */   ModelRenderer Leg3Seg2;
/*     */   ModelRenderer Leg3Seg3;
/*     */   ModelRenderer Leg3Seg4;
/*     */   ModelRenderer Leg3Seg5;
/*     */   ModelRenderer Leg4Seg1;
/*     */   ModelRenderer Leg4Seg2;
/*     */   ModelRenderer Leg4Seg3;
/*     */   ModelRenderer Leg4Seg4;
/*     */   ModelRenderer Leg4Seg5;
/*     */   ModelRenderer Leg5Seg1;
/*     */   ModelRenderer Leg5Seg2;
/*     */   ModelRenderer Leg5Seg3;
/*     */   ModelRenderer Leg5Seg4;
/*     */   ModelRenderer Leg5Seg5;
/*     */   ModelRenderer Leg6Seg1;
/*     */   ModelRenderer Leg6Seg2;
/*     */   ModelRenderer Leg6Seg3;
/*     */   ModelRenderer Leg6Seg4;
/*     */   ModelRenderer Leg6Seg5;
/*     */   ModelRenderer Leg7Seg1;
/*     */   ModelRenderer Leg7Seg2;
/*     */   ModelRenderer Leg7Seg3;
/*     */   ModelRenderer Leg7Seg4;
/*     */   ModelRenderer Leg7Seg5;
/*     */   ModelRenderer Leg8Seg1;
/*     */   ModelRenderer Leg8Seg2;
/*     */   ModelRenderer Leg8Seg3;
/*     */   ModelRenderer Leg8Seg4;
/*     */   ModelRenderer Leg8Seg5;
/*     */   
/*     */   public ModelEmperorScorpion(float f1) {
/* 106 */     this.wingspeed = f1;
/*     */     
/* 108 */     this.field_78090_t = 256;
/* 109 */     this.field_78089_u = 128;
/*     */     
/* 111 */     this.Head = new ModelRenderer(this, 0, 104);
/* 112 */     this.Head.func_78789_a(-9.0F, -4.0F, -16.0F, 18, 8, 16);
/* 113 */     this.Head.func_78793_a(0.0F, 13.0F, -8.0F);
/* 114 */     this.Head.func_78787_b(256, 128);
/* 115 */     this.Head.field_78809_i = true;
/* 116 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/* 117 */     this.Seg1 = new ModelRenderer(this, 0, 78);
/* 118 */     this.Seg1.func_78789_a(-9.0F, -4.0F, 0.0F, 18, 8, 4);
/* 119 */     this.Seg1.func_78793_a(0.0F, 13.0F, -8.0F);
/* 120 */     this.Seg1.func_78787_b(256, 128);
/* 121 */     this.Seg1.field_78809_i = true;
/* 122 */     setRotation(this.Seg1, 0.0F, 0.0F, 0.0F);
/* 123 */     this.Seg2 = new ModelRenderer(this, 0, 65);
/* 124 */     this.Seg2.func_78789_a(-8.5F, -4.1F, 4.0F, 17, 8, 4);
/* 125 */     this.Seg2.func_78793_a(0.0F, 13.0F, -8.0F);
/* 126 */     this.Seg2.func_78787_b(256, 128);
/* 127 */     this.Seg2.field_78809_i = true;
/* 128 */     setRotation(this.Seg2, 0.0F, 0.0F, 0.0F);
/* 129 */     this.Seg3 = new ModelRenderer(this, 0, 50);
/* 130 */     this.Seg3.func_78789_a(-9.5F, -4.0F, 8.0F, 19, 8, 5);
/* 131 */     this.Seg3.func_78793_a(0.0F, 13.0F, -8.0F);
/* 132 */     this.Seg3.func_78787_b(256, 128);
/* 133 */     this.Seg3.field_78809_i = true;
/* 134 */     setRotation(this.Seg3, 0.0F, 0.0F, 0.0F);
/* 135 */     this.Seg4 = new ModelRenderer(this, 0, 35);
/* 136 */     this.Seg4.func_78789_a(-9.0F, -4.1F, 13.0F, 18, 8, 6);
/* 137 */     this.Seg4.func_78793_a(0.0F, 13.0F, -8.0F);
/* 138 */     this.Seg4.func_78787_b(256, 128);
/* 139 */     this.Seg4.field_78809_i = true;
/* 140 */     setRotation(this.Seg4, 0.0F, 0.0F, 0.0F);
/* 141 */     this.Seg5 = new ModelRenderer(this, 45, 91);
/* 142 */     this.Seg5.func_78789_a(-8.5F, -4.0F, 19.0F, 17, 8, 3);
/* 143 */     this.Seg5.func_78793_a(0.0F, 13.0F, -8.0F);
/* 144 */     this.Seg5.func_78787_b(256, 128);
/* 145 */     this.Seg5.field_78809_i = true;
/* 146 */     setRotation(this.Seg5, 0.0F, 0.0F, 0.0F);
/* 147 */     this.Seg6 = new ModelRenderer(this, 45, 79);
/* 148 */     this.Seg6.func_78789_a(-8.0F, -4.1F, 22.0F, 16, 8, 3);
/* 149 */     this.Seg6.func_78793_a(0.0F, 13.0F, -8.0F);
/* 150 */     this.Seg6.func_78787_b(256, 128);
/* 151 */     this.Seg6.field_78809_i = true;
/* 152 */     setRotation(this.Seg6, 0.0F, 0.0F, 0.0F);
/* 153 */     this.Seg7 = new ModelRenderer(this, 43, 66);
/* 154 */     this.Seg7.func_78789_a(-7.0F, -4.0F, 25.0F, 14, 8, 3);
/* 155 */     this.Seg7.func_78793_a(0.0F, 13.0F, -8.0F);
/* 156 */     this.Seg7.func_78787_b(256, 128);
/* 157 */     this.Seg7.field_78809_i = true;
/* 158 */     setRotation(this.Seg7, 0.0F, 0.0F, 0.0F);
/* 159 */     this.Seg8 = new ModelRenderer(this, 49, 53);
/* 160 */     this.Seg8.func_78789_a(-5.5F, -4.1F, 28.0F, 11, 8, 2);
/* 161 */     this.Seg8.func_78793_a(0.0F, 13.0F, -8.0F);
/* 162 */     this.Seg8.func_78787_b(256, 128);
/* 163 */     this.Seg8.field_78809_i = true;
/* 164 */     setRotation(this.Seg8, 0.0F, 0.0F, 0.0F);
/* 165 */     this.Tailseg1 = new ModelRenderer(this, 92, 0);
/* 166 */     this.Tailseg1.func_78789_a(-4.0F, -1.0F, 0.0F, 8, 4, 10);
/* 167 */     this.Tailseg1.func_78793_a(0.0F, 13.0F, 20.0F);
/* 168 */     this.Tailseg1.func_78787_b(256, 128);
/* 169 */     this.Tailseg1.field_78809_i = true;
/* 170 */     setRotation(this.Tailseg1, 0.5948578F, 0.0F, 0.0F);
/* 171 */     this.Tailseg2 = new ModelRenderer(this, 90, 15);
/* 172 */     this.Tailseg2.func_78789_a(-3.5F, -2.0F, 0.0F, 7, 4, 12);
/* 173 */     this.Tailseg2.func_78793_a(0.0F, 10.0F, 27.0F);
/* 174 */     this.Tailseg2.func_78787_b(256, 128);
/* 175 */     this.Tailseg2.field_78809_i = true;
/* 176 */     setRotation(this.Tailseg2, 1.07818F, 0.0F, 0.0F);
/* 177 */     this.Tailseg3 = new ModelRenderer(this, 96, 32);
/* 178 */     this.Tailseg3.func_78789_a(-3.0F, -2.0F, 1.0F, 6, 4, 10);
/* 179 */     this.Tailseg3.func_78793_a(0.0F, 2.0F, 32.0F);
/* 180 */     this.Tailseg3.func_78787_b(256, 128);
/* 181 */     this.Tailseg3.field_78809_i = true;
/* 182 */     setRotation(this.Tailseg3, 1.710216F, 0.0F, 0.0F);
/* 183 */     this.Tailseg4 = new ModelRenderer(this, 96, 47);
/* 184 */     this.Tailseg4.func_78789_a(-2.5F, -2.0F, 0.0F, 5, 4, 11);
/* 185 */     this.Tailseg4.func_78793_a(0.0F, -7.0F, 31.0F);
/* 186 */     this.Tailseg4.func_78787_b(256, 128);
/* 187 */     this.Tailseg4.field_78809_i = true;
/* 188 */     setRotation(this.Tailseg4, 2.267895F, 0.0F, 0.0F);
/* 189 */     this.Tailseg5 = new ModelRenderer(this, 98, 63);
/* 190 */     this.Tailseg5.func_78789_a(-2.0F, -2.0F, 0.0F, 4, 4, 11);
/* 191 */     this.Tailseg5.func_78793_a(0.0F, -14.0F, 25.0F);
/* 192 */     this.Tailseg5.func_78787_b(256, 128);
/* 193 */     this.Tailseg5.field_78809_i = true;
/* 194 */     setRotation(this.Tailseg5, 2.899932F, 0.0F, 0.0F);
/* 195 */     this.Tailseg6 = new ModelRenderer(this, 98, 79);
/* 196 */     this.Tailseg6.func_78789_a(-2.0F, -2.0F, 0.0F, 4, 4, 11);
/* 197 */     this.Tailseg6.func_78793_a(0.0F, -17.0F, 16.0F);
/* 198 */     this.Tailseg6.func_78787_b(256, 128);
/* 199 */     this.Tailseg6.field_78809_i = true;
/* 200 */     setRotation(this.Tailseg6, -2.602503F, 0.0F, 0.0F);
/* 201 */     this.Tailseg7 = new ModelRenderer(this, 94, 95);
/* 202 */     this.Tailseg7.func_78789_a(-3.0F, -2.0F, 0.0F, 6, 4, 11);
/* 203 */     this.Tailseg7.func_78793_a(0.0F, -12.0F, 8.0F);
/* 204 */     this.Tailseg7.func_78787_b(256, 128);
/* 205 */     this.Tailseg7.field_78809_i = true;
/* 206 */     setRotation(this.Tailseg7, -0.2230717F, 0.0F, 0.0F);
/* 207 */     this.Tailseg8 = new ModelRenderer(this, 102, 111);
/* 208 */     this.Tailseg8.func_78789_a(-4.0F, -2.0F, 4.0F, 8, 4, 5);
/* 209 */     this.Tailseg8.func_78793_a(0.0F, -12.0F, 8.0F);
/* 210 */     this.Tailseg8.func_78787_b(256, 128);
/* 211 */     this.Tailseg8.field_78809_i = true;
/* 212 */     setRotation(this.Tailseg8, -0.2230717F, 0.0F, 0.0F);
/* 213 */     this.Stinger1 = new ModelRenderer(this, 83, 0);
/* 214 */     this.Stinger1.func_78789_a(-0.5F, -0.5F, 0.0F, 1, 1, 3);
/* 215 */     this.Stinger1.func_78793_a(0.0F, -10.0F, 18.0F);
/* 216 */     this.Stinger1.func_78787_b(256, 128);
/* 217 */     this.Stinger1.field_78809_i = true;
/* 218 */     setRotation(this.Stinger1, 0.2230717F, 0.0F, 0.0F);
/* 219 */     this.Stinger2 = new ModelRenderer(this, 83, 0);
/* 220 */     this.Stinger2.func_78789_a(-0.5F, -0.5F, 0.0F, 1, 1, 3);
/* 221 */     this.Stinger2.func_78793_a(0.0F, -10.5F, 20.5F);
/* 222 */     this.Stinger2.func_78787_b(256, 128);
/* 223 */     this.Stinger2.field_78809_i = true;
/* 224 */     setRotation(this.Stinger2, -0.2602503F, 0.0F, 0.0F);
/* 225 */     this.Stinger3 = new ModelRenderer(this, 79, 5);
/* 226 */     this.Stinger3.func_78789_a(-0.5F, -0.5F, 0.0F, 1, 1, 5);
/* 227 */     this.Stinger3.func_78793_a(0.0F, -10.0F, 23.0F);
/* 228 */     this.Stinger3.func_78787_b(256, 128);
/* 229 */     this.Stinger3.field_78809_i = true;
/* 230 */     setRotation(this.Stinger3, -0.8551081F, 0.0F, 0.0F);
/* 231 */     this.LeftShoulder = new ModelRenderer(this, 69, 103);
/* 232 */     this.LeftShoulder.func_78789_a(-3.0F, -3.0F, -4.0F, 6, 6, 4);
/* 233 */     this.LeftShoulder.func_78793_a(7.0F, 13.0F, -22.0F);
/* 234 */     this.LeftShoulder.func_78787_b(256, 128);
/* 235 */     this.LeftShoulder.field_78809_i = true;
/* 236 */     setRotation(this.LeftShoulder, 0.0F, -0.8551081F, 0.0F);
/* 237 */     this.LeftArmSeg1 = new ModelRenderer(this, 55, 0);
/* 238 */     this.LeftArmSeg1.func_78789_a(-3.0F, -3.0F, -10.0F, 4, 6, 13);
/* 239 */     this.LeftArmSeg1.func_78793_a(10.0F, 13.0F, -24.0F);
/* 240 */     this.LeftArmSeg1.func_78787_b(256, 128);
/* 241 */     this.LeftArmSeg1.field_78809_i = true;
/* 242 */     setRotation(this.LeftArmSeg1, 0.0F, -2.044824F, 0.0F);
/* 243 */     this.LeftArmSeg2 = new ModelRenderer(this, 130, 0);
/* 244 */     this.LeftArmSeg2.func_78789_a(-7.0F, -3.0F, -17.0F, 8, 6, 17);
/* 245 */     this.LeftArmSeg2.func_78793_a(19.0F, 13.0F, -22.0F);
/* 246 */     this.LeftArmSeg2.func_78787_b(256, 128);
/* 247 */     this.LeftArmSeg2.field_78809_i = true;
/* 248 */     setRotation(this.LeftArmSeg2, 0.0F, -0.7435722F, 0.0F);
/* 249 */     this.LeftArmSeg3 = new ModelRenderer(this, 130, 50);
/* 250 */     this.LeftArmSeg3.func_78789_a(-3.0F, -3.0F, -24.0F, 4, 6, 24);
/* 251 */     this.LeftArmSeg3.func_78793_a(29.0F, 13.0F, -33.0F);
/* 252 */     this.LeftArmSeg3.func_78787_b(256, 128);
/* 253 */     this.LeftArmSeg3.field_78809_i = true;
/* 254 */     setRotation(this.LeftArmSeg3, 0.0F, 0.3717861F, 0.0F);
/* 255 */     this.LeftArmSeg4 = new ModelRenderer(this, 181, 0);
/* 256 */     this.LeftArmSeg4.func_78789_a(-3.0F, -3.0F, -14.0F, 8, 6, 12);
/* 257 */     this.LeftArmSeg4.func_78793_a(29.0F, 13.0F, -33.0F);
/* 258 */     this.LeftArmSeg4.func_78787_b(256, 128);
/* 259 */     this.LeftArmSeg4.field_78809_i = true;
/* 260 */     setRotation(this.LeftArmSeg4, 0.0F, 1.487144F, 0.0F);
/* 261 */     this.RightShoulder = new ModelRenderer(this, 69, 103);
/* 262 */     this.RightShoulder.func_78789_a(-3.0F, -3.0F, -4.0F, 6, 6, 4);
/* 263 */     this.RightShoulder.func_78793_a(-7.0F, 13.0F, -22.0F);
/* 264 */     this.RightShoulder.func_78787_b(256, 128);
/* 265 */     this.RightShoulder.field_78809_i = true;
/* 266 */     setRotation(this.RightShoulder, 0.0F, 0.8551066F, 0.0F);
/* 267 */     this.RightArmSeg1 = new ModelRenderer(this, 55, 0);
/* 268 */     this.RightArmSeg1.func_78789_a(-1.0F, -3.0F, -10.0F, 4, 6, 13);
/* 269 */     this.RightArmSeg1.func_78793_a(-10.0F, 13.0F, -24.0F);
/* 270 */     this.RightArmSeg1.func_78787_b(256, 128);
/* 271 */     this.RightArmSeg1.field_78809_i = true;
/* 272 */     setRotation(this.RightArmSeg1, 0.0F, 2.044828F, 0.0F);
/* 273 */     this.RightArmSeg2 = new ModelRenderer(this, 130, 0);
/* 274 */     this.RightArmSeg2.func_78789_a(-1.0F, -3.0F, -17.0F, 8, 6, 17);
/* 275 */     this.RightArmSeg2.func_78793_a(-19.0F, 13.0F, -22.0F);
/* 276 */     this.RightArmSeg2.func_78787_b(256, 128);
/* 277 */     this.RightArmSeg2.field_78809_i = true;
/* 278 */     setRotation(this.RightArmSeg2, 0.0F, 0.7435801F, 0.0F);
/* 279 */     this.RightArmSeg3 = new ModelRenderer(this, 130, 50);
/* 280 */     this.RightArmSeg3.func_78789_a(-1.0F, -3.0F, -24.0F, 4, 6, 24);
/* 281 */     this.RightArmSeg3.func_78793_a(-29.0F, 13.0F, -33.0F);
/* 282 */     this.RightArmSeg3.func_78787_b(256, 128);
/* 283 */     this.RightArmSeg3.field_78809_i = true;
/* 284 */     setRotation(this.RightArmSeg3, 0.0F, -0.37179F, 0.0F);
/* 285 */     this.RightArmSeg4 = new ModelRenderer(this, 181, 0);
/* 286 */     this.RightArmSeg4.func_78789_a(-5.0F, -3.0F, -14.0F, 8, 6, 12);
/* 287 */     this.RightArmSeg4.func_78793_a(-29.0F, 13.0F, -33.0F);
/* 288 */     this.RightArmSeg4.func_78787_b(256, 128);
/* 289 */     this.RightArmSeg4.field_78809_i = true;
/* 290 */     setRotation(this.RightArmSeg4, 0.0F, -1.487143F, 0.0F);
/* 291 */     this.RightPincer = new ModelRenderer(this, 130, 24);
/* 292 */     this.RightPincer.func_78789_a(-1.0F, -3.0F, -19.0F, 2, 6, 19);
/* 293 */     this.RightPincer.func_78793_a(-17.0F, 13.0F, -33.0F);
/* 294 */     this.RightPincer.func_78787_b(256, 128);
/* 295 */     this.RightPincer.field_78809_i = true;
/* 296 */     setRotation(this.RightPincer, 0.0F, -0.0743611F, 0.0F);
/* 297 */     this.LeftPincer = new ModelRenderer(this, 130, 24);
/* 298 */     this.LeftPincer.func_78789_a(-1.0F, -3.0F, -19.0F, 2, 6, 19);
/* 299 */     this.LeftPincer.func_78793_a(17.0F, 13.0F, -33.0F);
/* 300 */     this.LeftPincer.func_78787_b(256, 128);
/* 301 */     this.LeftPincer.field_78809_i = true;
/* 302 */     setRotation(this.LeftPincer, 0.0F, 0.0743685F, 0.0F);
/* 303 */     this.Lefteye = new ModelRenderer(this, 0, 113);
/* 304 */     this.Lefteye.func_78789_a(-0.5F, -5.0F, -7.5F, 3, 2, 3);
/* 305 */     this.Lefteye.func_78793_a(0.0F, 13.0F, -8.0F);
/* 306 */     this.Lefteye.func_78787_b(256, 128);
/* 307 */     this.Lefteye.field_78809_i = true;
/* 308 */     setRotation(this.Lefteye, 0.0F, 0.0F, 0.2974289F);
/* 309 */     this.Righteye = new ModelRenderer(this, 0, 113);
/* 310 */     this.Righteye.func_78789_a(-2.5F, -5.0F, -7.5F, 3, 2, 3);
/* 311 */     this.Righteye.func_78793_a(0.0F, 13.0F, -8.0F);
/* 312 */     this.Righteye.func_78787_b(256, 128);
/* 313 */     this.Righteye.field_78809_i = true;
/* 314 */     setRotation(this.Righteye, 0.0F, 0.0F, -0.2974216F);
/* 315 */     this.RightMandible = new ModelRenderer(this, 76, 55);
/* 316 */     this.RightMandible.func_78789_a(-2.0F, -3.0F, -4.0F, 4, 4, 4);
/* 317 */     this.RightMandible.func_78793_a(-2.0F, 13.0F, -23.0F);
/* 318 */     this.RightMandible.func_78787_b(256, 128);
/* 319 */     this.RightMandible.field_78809_i = true;
/* 320 */     setRotation(this.RightMandible, 0.1115358F, 0.3346075F, 0.0F);
/* 321 */     this.LeftMandible = new ModelRenderer(this, 76, 55);
/* 322 */     this.LeftMandible.func_78789_a(-2.0F, -3.0F, -4.0F, 4, 4, 4);
/* 323 */     this.LeftMandible.func_78793_a(2.0F, 13.0F, -23.0F);
/* 324 */     this.LeftMandible.func_78787_b(256, 128);
/* 325 */     this.LeftMandible.field_78809_i = true;
/* 326 */     setRotation(this.LeftMandible, 0.111544F, -0.3346145F, 0.0F);
/* 327 */     this.RightManPart2 = new ModelRenderer(this, 82, 64);
/* 328 */     this.RightManPart2.func_78789_a(-0.5F, -0.5F, -6.0F, 1, 1, 6);
/* 329 */     this.RightManPart2.func_78793_a(-3.0F, 11.0F, -26.0F);
/* 330 */     this.RightManPart2.func_78787_b(256, 128);
/* 331 */     this.RightManPart2.field_78809_i = true;
/* 332 */     setRotation(this.RightManPart2, 1.189716F, 0.0F, 0.0F);
/* 333 */     this.LeftManPart2 = new ModelRenderer(this, 82, 64);
/* 334 */     this.LeftManPart2.func_78789_a(-0.5F, -0.5F, -6.0F, 1, 1, 6);
/* 335 */     this.LeftManPart2.func_78793_a(3.0F, 11.0F, -26.0F);
/* 336 */     this.LeftManPart2.func_78787_b(256, 128);
/* 337 */     this.LeftManPart2.field_78809_i = true;
/* 338 */     setRotation(this.LeftManPart2, 1.188848F, 0.0F, 0.0F);
/* 339 */     this.Leg1Seg1 = new ModelRenderer(this, 20, 20);
/* 340 */     this.Leg1Seg1.func_78789_a(0.0F, -1.5F, -2.0F, 4, 3, 4);
/* 341 */     this.Leg1Seg1.func_78793_a(9.0F, 13.0F, -10.0F);
/* 342 */     this.Leg1Seg1.func_78787_b(256, 128);
/* 343 */     this.Leg1Seg1.field_78809_i = true;
/* 344 */     setRotation(this.Leg1Seg1, 0.0F, 0.0F, 0.0F);
/* 345 */     this.Leg1Seg2 = new ModelRenderer(this, 21, 0);
/* 346 */     this.Leg1Seg2.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 347 */     this.Leg1Seg2.func_78793_a(12.0F, 13.0F, -10.0F);
/* 348 */     this.Leg1Seg2.func_78787_b(256, 128);
/* 349 */     this.Leg1Seg2.field_78809_i = true;
/* 350 */     setRotation(this.Leg1Seg2, 0.0F, 0.0F, -0.9294576F);
/* 351 */     this.Leg1Seg3 = new ModelRenderer(this, 15, 8);
/* 352 */     this.Leg1Seg3.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 353 */     this.Leg1Seg3.func_78793_a(18.0F, 3.0F, -10.0F);
/* 354 */     this.Leg1Seg3.func_78787_b(256, 128);
/* 355 */     this.Leg1Seg3.field_78809_i = true;
/* 356 */     setRotation(this.Leg1Seg3, 0.0F, 0.0F, 0.6320361F);
/* 357 */     this.Leg1Seg4 = new ModelRenderer(this, 0, 14);
/* 358 */     this.Leg1Seg4.func_78789_a(0.0F, -1.5F, -1.5F, 3, 10, 3);
/* 359 */     this.Leg1Seg4.func_78793_a(26.0F, 12.0F, -10.0F);
/* 360 */     this.Leg1Seg4.func_78787_b(256, 128);
/* 361 */     this.Leg1Seg4.field_78809_i = true;
/* 362 */     setRotation(this.Leg1Seg4, 0.0F, 0.0F, 0.0F);
/* 363 */     this.Leg1Seg5 = new ModelRenderer(this, 0, 0);
/* 364 */     this.Leg1Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 365 */     this.Leg1Seg5.func_78793_a(27.0F, 19.0F, -10.0F);
/* 366 */     this.Leg1Seg5.func_78787_b(256, 128);
/* 367 */     this.Leg1Seg5.field_78809_i = true;
/* 368 */     setRotation(this.Leg1Seg5, 0.0F, 0.0F, 0.669215F);
/* 369 */     this.Leg2Seg1 = new ModelRenderer(this, 20, 20);
/* 370 */     this.Leg2Seg1.func_78789_a(0.0F, -1.5F, -2.0F, 4, 3, 4);
/* 371 */     this.Leg2Seg1.func_78793_a(8.5F, 13.0F, -4.0F);
/* 372 */     this.Leg2Seg1.func_78787_b(256, 128);
/* 373 */     this.Leg2Seg1.field_78809_i = true;
/* 374 */     setRotation(this.Leg2Seg1, 0.0F, 0.0F, 0.0F);
/* 375 */     this.Leg2Seg2 = new ModelRenderer(this, 21, 0);
/* 376 */     this.Leg2Seg2.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 377 */     this.Leg2Seg2.func_78793_a(12.0F, 13.0F, -4.0F);
/* 378 */     this.Leg2Seg2.func_78787_b(256, 128);
/* 379 */     this.Leg2Seg2.field_78809_i = true;
/* 380 */     setRotation(this.Leg2Seg2, 0.0F, 0.0F, -0.9294576F);
/* 381 */     this.Leg2Seg3 = new ModelRenderer(this, 15, 8);
/* 382 */     this.Leg2Seg3.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 383 */     this.Leg2Seg3.func_78793_a(18.0F, 3.0F, -4.0F);
/* 384 */     this.Leg2Seg3.func_78787_b(256, 128);
/* 385 */     this.Leg2Seg3.field_78809_i = true;
/* 386 */     setRotation(this.Leg2Seg3, 0.0F, 0.0F, 0.6320361F);
/* 387 */     this.Leg2Seg4 = new ModelRenderer(this, 0, 14);
/* 388 */     this.Leg2Seg4.func_78789_a(0.0F, -1.5F, -1.5F, 3, 10, 3);
/* 389 */     this.Leg2Seg4.func_78793_a(26.0F, 12.0F, -4.0F);
/* 390 */     this.Leg2Seg4.func_78787_b(256, 128);
/* 391 */     this.Leg2Seg4.field_78809_i = true;
/* 392 */     setRotation(this.Leg2Seg4, 0.0F, 0.0F, 0.0F);
/* 393 */     this.Leg2Seg5 = new ModelRenderer(this, 0, 0);
/* 394 */     this.Leg2Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 395 */     this.Leg2Seg5.func_78793_a(27.0F, 19.0F, -4.0F);
/* 396 */     this.Leg2Seg5.func_78787_b(256, 128);
/* 397 */     this.Leg2Seg5.field_78809_i = true;
/* 398 */     setRotation(this.Leg2Seg5, 0.0F, 0.0F, 0.669215F);
/* 399 */     this.Leg3Seg1 = new ModelRenderer(this, 20, 20);
/* 400 */     this.Leg3Seg1.func_78789_a(0.0F, -1.5F, -2.0F, 4, 3, 4);
/* 401 */     this.Leg3Seg1.func_78793_a(9.5F, 13.0F, 2.0F);
/* 402 */     this.Leg3Seg1.func_78787_b(256, 128);
/* 403 */     this.Leg3Seg1.field_78809_i = true;
/* 404 */     setRotation(this.Leg3Seg1, 0.0F, 0.0F, 0.0F);
/* 405 */     this.Leg3Seg2 = new ModelRenderer(this, 21, 0);
/* 406 */     this.Leg3Seg2.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 407 */     this.Leg3Seg2.func_78793_a(12.0F, 13.0F, 2.0F);
/* 408 */     this.Leg3Seg2.func_78787_b(256, 128);
/* 409 */     this.Leg3Seg2.field_78809_i = true;
/* 410 */     setRotation(this.Leg3Seg2, 0.0F, 0.0F, -0.9294576F);
/* 411 */     this.Leg3Seg3 = new ModelRenderer(this, 15, 8);
/* 412 */     this.Leg3Seg3.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 413 */     this.Leg3Seg3.func_78793_a(18.0F, 3.0F, 2.0F);
/* 414 */     this.Leg3Seg3.func_78787_b(256, 128);
/* 415 */     this.Leg3Seg3.field_78809_i = true;
/* 416 */     setRotation(this.Leg3Seg3, 0.0F, 0.0F, 0.6320361F);
/* 417 */     this.Leg3Seg4 = new ModelRenderer(this, 0, 14);
/* 418 */     this.Leg3Seg4.func_78789_a(0.0F, -1.5F, -1.5F, 3, 10, 3);
/* 419 */     this.Leg3Seg4.func_78793_a(26.0F, 12.0F, 2.0F);
/* 420 */     this.Leg3Seg4.func_78787_b(256, 128);
/* 421 */     this.Leg3Seg4.field_78809_i = true;
/* 422 */     setRotation(this.Leg3Seg4, 0.0F, 0.0F, 0.0F);
/* 423 */     this.Leg3Seg5 = new ModelRenderer(this, 0, 0);
/* 424 */     this.Leg3Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 425 */     this.Leg3Seg5.func_78793_a(27.0F, 19.0F, 2.0F);
/* 426 */     this.Leg3Seg5.func_78787_b(256, 128);
/* 427 */     this.Leg3Seg5.field_78809_i = true;
/* 428 */     setRotation(this.Leg3Seg5, 0.0F, 0.0F, 0.669215F);
/* 429 */     this.Leg4Seg1 = new ModelRenderer(this, 20, 20);
/* 430 */     this.Leg4Seg1.func_78789_a(0.0F, -1.5F, -2.0F, 4, 3, 4);
/* 431 */     this.Leg4Seg1.func_78793_a(9.0F, 13.0F, 8.0F);
/* 432 */     this.Leg4Seg1.func_78787_b(256, 128);
/* 433 */     this.Leg4Seg1.field_78809_i = true;
/* 434 */     setRotation(this.Leg4Seg1, 0.0F, 0.0F, 0.0F);
/* 435 */     this.Leg4Seg2 = new ModelRenderer(this, 21, 0);
/* 436 */     this.Leg4Seg2.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 437 */     this.Leg4Seg2.func_78793_a(12.0F, 13.0F, 8.0F);
/* 438 */     this.Leg4Seg2.func_78787_b(256, 128);
/* 439 */     this.Leg4Seg2.field_78809_i = true;
/* 440 */     setRotation(this.Leg4Seg2, 0.0F, 0.0F, -0.9294576F);
/* 441 */     this.Leg4Seg3 = new ModelRenderer(this, 15, 8);
/* 442 */     this.Leg4Seg3.func_78789_a(0.0F, -1.5F, -1.5F, 13, 3, 3);
/* 443 */     this.Leg4Seg3.func_78793_a(18.0F, 3.0F, 8.0F);
/* 444 */     this.Leg4Seg3.func_78787_b(256, 128);
/* 445 */     this.Leg4Seg3.field_78809_i = true;
/* 446 */     setRotation(this.Leg4Seg3, 0.0F, 0.0F, 0.6320361F);
/* 447 */     this.Leg4Seg4 = new ModelRenderer(this, 0, 14);
/* 448 */     this.Leg4Seg4.func_78789_a(0.0F, -1.5F, -1.5F, 3, 10, 3);
/* 449 */     this.Leg4Seg4.func_78793_a(26.0F, 12.0F, 8.0F);
/* 450 */     this.Leg4Seg4.func_78787_b(256, 128);
/* 451 */     this.Leg4Seg4.field_78809_i = true;
/* 452 */     setRotation(this.Leg4Seg4, 0.0F, 0.0F, 0.0F);
/* 453 */     this.Leg4Seg5 = new ModelRenderer(this, 0, 0);
/* 454 */     this.Leg4Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 455 */     this.Leg4Seg5.func_78793_a(27.0F, 19.0F, 8.0F);
/* 456 */     this.Leg4Seg5.func_78787_b(256, 128);
/* 457 */     this.Leg4Seg5.field_78809_i = true;
/* 458 */     setRotation(this.Leg4Seg5, 0.0F, 0.0F, 0.669215F);
/* 459 */     this.Leg5Seg1 = new ModelRenderer(this, 20, 20);
/* 460 */     this.Leg5Seg1.func_78789_a(-4.0F, -1.5F, -2.0F, 4, 3, 4);
/* 461 */     this.Leg5Seg1.func_78793_a(-9.0F, 13.0F, -10.0F);
/* 462 */     this.Leg5Seg1.func_78787_b(256, 128);
/* 463 */     this.Leg5Seg1.field_78809_i = true;
/* 464 */     setRotation(this.Leg5Seg1, 0.0F, 0.0F, 0.0F);
/* 465 */     this.Leg5Seg2 = new ModelRenderer(this, 21, 0);
/* 466 */     this.Leg5Seg2.func_78789_a(-13.0F, -1.5F, -1.5F, 13, 3, 3);
/* 467 */     this.Leg5Seg2.func_78793_a(-12.0F, 14.0F, -10.0F);
/* 468 */     this.Leg5Seg2.func_78787_b(256, 128);
/* 469 */     this.Leg5Seg2.field_78809_i = true;
/* 470 */     setRotation(this.Leg5Seg2, 0.0F, 0.0F, 0.9294653F);
/* 471 */     this.Leg5Seg3 = new ModelRenderer(this, 15, 8);
/* 472 */     this.Leg5Seg3.func_78789_a(-13.0F, -1.5F, -1.5F, 13, 3, 3);
/* 473 */     this.Leg5Seg3.func_78793_a(-18.0F, 4.0F, -10.0F);
/* 474 */     this.Leg5Seg3.func_78787_b(256, 128);
/* 475 */     this.Leg5Seg3.field_78809_i = true;
/* 476 */     setRotation(this.Leg5Seg3, 0.0F, 0.0F, -0.6320364F);
/* 477 */     this.Leg5Seg4 = new ModelRenderer(this, 0, 14);
/* 478 */     this.Leg5Seg4.func_78789_a(-3.0F, -1.5F, -1.5F, 3, 10, 3);
/* 479 */     this.Leg5Seg4.func_78793_a(-26.0F, 12.0F, -10.0F);
/* 480 */     this.Leg5Seg4.func_78787_b(256, 128);
/* 481 */     this.Leg5Seg4.field_78809_i = true;
/* 482 */     setRotation(this.Leg5Seg4, 0.0F, 0.0F, 0.0F);
/* 483 */     this.Leg5Seg5 = new ModelRenderer(this, 0, 0);
/* 484 */     this.Leg5Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 485 */     this.Leg5Seg5.func_78793_a(-27.0F, 19.0F, -10.0F);
/* 486 */     this.Leg5Seg5.func_78787_b(256, 128);
/* 487 */     this.Leg5Seg5.field_78809_i = true;
/* 488 */     setRotation(this.Leg5Seg5, 0.0F, 0.0F, 2.240008F);
/* 489 */     this.Leg6Seg1 = new ModelRenderer(this, 20, 20);
/* 490 */     this.Leg6Seg1.func_78789_a(-4.0F, -1.5F, -2.0F, 4, 3, 4);
/* 491 */     this.Leg6Seg1.func_78793_a(-8.5F, 13.0F, -4.0F);
/* 492 */     this.Leg6Seg1.func_78787_b(256, 128);
/* 493 */     this.Leg6Seg1.field_78809_i = true;
/* 494 */     setRotation(this.Leg6Seg1, 0.0F, 0.0F, 0.0F);
/* 495 */     this.Leg6Seg2 = new ModelRenderer(this, 21, 0);
/* 496 */     this.Leg6Seg2.func_78789_a(-13.0F, -1.5F, -1.5F, 13, 3, 3);
/* 497 */     this.Leg6Seg2.func_78793_a(-12.0F, 14.0F, -4.0F);
/* 498 */     this.Leg6Seg2.func_78787_b(256, 128);
/* 499 */     this.Leg6Seg2.field_78809_i = true;
/* 500 */     setRotation(this.Leg6Seg2, 0.0F, 0.0F, 0.9294576F);
/* 501 */     this.Leg6Seg3 = new ModelRenderer(this, 15, 8);
/* 502 */     this.Leg6Seg3.func_78789_a(-13.0F, -1.5F, -1.5F, 13, 3, 3);
/* 503 */     this.Leg6Seg3.func_78793_a(-18.0F, 4.0F, -4.0F);
/* 504 */     this.Leg6Seg3.func_78787_b(256, 128);
/* 505 */     this.Leg6Seg3.field_78809_i = true;
/* 506 */     setRotation(this.Leg6Seg3, 0.0F, 0.0F, -0.6320361F);
/* 507 */     this.Leg6Seg4 = new ModelRenderer(this, 0, 14);
/* 508 */     this.Leg6Seg4.func_78789_a(-3.0F, -1.5F, -1.5F, 3, 10, 3);
/* 509 */     this.Leg6Seg4.func_78793_a(-26.0F, 12.0F, -4.0F);
/* 510 */     this.Leg6Seg4.func_78787_b(256, 128);
/* 511 */     this.Leg6Seg4.field_78809_i = true;
/* 512 */     setRotation(this.Leg6Seg4, 0.0F, 0.0F, 0.0F);
/* 513 */     this.Leg6Seg5 = new ModelRenderer(this, 0, 0);
/* 514 */     this.Leg6Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 515 */     this.Leg6Seg5.func_78793_a(-27.0F, 19.0F, -4.0F);
/* 516 */     this.Leg6Seg5.func_78787_b(256, 128);
/* 517 */     this.Leg6Seg5.field_78809_i = true;
/* 518 */     setRotation(this.Leg6Seg5, 0.0F, 0.0F, 2.240008F);
/* 519 */     this.Leg7Seg1 = new ModelRenderer(this, 20, 20);
/* 520 */     this.Leg7Seg1.func_78789_a(-4.0F, -1.5F, -2.0F, 4, 3, 4);
/* 521 */     this.Leg7Seg1.func_78793_a(-9.5F, 13.0F, 2.0F);
/* 522 */     this.Leg7Seg1.func_78787_b(256, 128);
/* 523 */     this.Leg7Seg1.field_78809_i = true;
/* 524 */     setRotation(this.Leg7Seg1, 0.0F, 0.0F, 0.0F);
/* 525 */     this.Leg7Seg2 = new ModelRenderer(this, 21, 0);
/* 526 */     this.Leg7Seg2.func_78789_a(-13.0F, -1.5F, -1.5F, 13, 3, 3);
/* 527 */     this.Leg7Seg2.func_78793_a(-12.0F, 14.0F, 2.0F);
/* 528 */     this.Leg7Seg2.func_78787_b(256, 128);
/* 529 */     this.Leg7Seg2.field_78809_i = true;
/* 530 */     setRotation(this.Leg7Seg2, 0.0F, 0.0F, 0.9294576F);
/* 531 */     this.Leg7Seg3 = new ModelRenderer(this, 15, 8);
/* 532 */     this.Leg7Seg3.func_78789_a(-13.0F, -1.5F, -1.5F, 13, 3, 3);
/* 533 */     this.Leg7Seg3.func_78793_a(-18.0F, 4.0F, 2.0F);
/* 534 */     this.Leg7Seg3.func_78787_b(256, 128);
/* 535 */     this.Leg7Seg3.field_78809_i = true;
/* 536 */     setRotation(this.Leg7Seg3, 0.0F, 0.0F, -0.6320361F);
/* 537 */     this.Leg7Seg4 = new ModelRenderer(this, 0, 14);
/* 538 */     this.Leg7Seg4.func_78789_a(-3.0F, -1.5F, -1.5F, 3, 10, 3);
/* 539 */     this.Leg7Seg4.func_78793_a(-26.0F, 12.0F, 2.0F);
/* 540 */     this.Leg7Seg4.func_78787_b(256, 128);
/* 541 */     this.Leg7Seg4.field_78809_i = true;
/* 542 */     setRotation(this.Leg7Seg4, 0.0F, 0.0F, 0.0F);
/* 543 */     this.Leg7Seg5 = new ModelRenderer(this, 0, 0);
/* 544 */     this.Leg7Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 545 */     this.Leg7Seg5.func_78793_a(-27.0F, 19.0F, 2.0F);
/* 546 */     this.Leg7Seg5.func_78787_b(256, 128);
/* 547 */     this.Leg7Seg5.field_78809_i = true;
/* 548 */     setRotation(this.Leg7Seg5, 0.0F, 0.0F, 2.240008F);
/* 549 */     this.Leg8Seg1 = new ModelRenderer(this, 20, 20);
/* 550 */     this.Leg8Seg1.func_78789_a(-4.0F, -1.5F, -2.0F, 4, 3, 4);
/* 551 */     this.Leg8Seg1.func_78793_a(-9.0F, 13.0F, 8.0F);
/* 552 */     this.Leg8Seg1.func_78787_b(256, 128);
/* 553 */     this.Leg8Seg1.field_78809_i = true;
/* 554 */     setRotation(this.Leg8Seg1, 0.0F, 0.0F, 0.0F);
/* 555 */     this.Leg8Seg2 = new ModelRenderer(this, 21, 0);
/* 556 */     this.Leg8Seg2.func_78789_a(-12.0F, -1.5F, -1.5F, 13, 3, 3);
/* 557 */     this.Leg8Seg2.func_78793_a(-12.0F, 14.0F, 8.0F);
/* 558 */     this.Leg8Seg2.func_78787_b(256, 128);
/* 559 */     this.Leg8Seg2.field_78809_i = true;
/* 560 */     setRotation(this.Leg8Seg2, 0.0F, 0.0F, 0.9294576F);
/* 561 */     this.Leg8Seg3 = new ModelRenderer(this, 15, 8);
/* 562 */     this.Leg8Seg3.func_78789_a(-13.0F, -1.5F, -1.5F, 13, 3, 3);
/* 563 */     this.Leg8Seg3.func_78793_a(-18.0F, 4.0F, 8.0F);
/* 564 */     this.Leg8Seg3.func_78787_b(256, 128);
/* 565 */     this.Leg8Seg3.field_78809_i = true;
/* 566 */     setRotation(this.Leg8Seg3, 0.0F, 0.0F, -0.6320361F);
/* 567 */     this.Leg8Seg4 = new ModelRenderer(this, 0, 14);
/* 568 */     this.Leg8Seg4.func_78789_a(-3.0F, -1.5F, -1.5F, 3, 10, 3);
/* 569 */     this.Leg8Seg4.func_78793_a(-26.0F, 12.0F, 8.0F);
/* 570 */     this.Leg8Seg4.func_78787_b(256, 128);
/* 571 */     this.Leg8Seg4.field_78809_i = true;
/* 572 */     setRotation(this.Leg8Seg4, 0.0F, 0.0F, 0.0F);
/* 573 */     this.Leg8Seg5 = new ModelRenderer(this, 0, 0);
/* 574 */     this.Leg8Seg5.func_78789_a(0.0F, -1.5F, -1.5F, 7, 3, 3);
/* 575 */     this.Leg8Seg5.func_78793_a(-27.0F, 19.0F, 8.0F);
/* 576 */     this.Leg8Seg5.func_78787_b(256, 128);
/* 577 */     this.Leg8Seg5.field_78809_i = true;
/* 578 */     setRotation(this.Leg8Seg5, 0.0F, 0.0F, 2.240008F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 585 */     EmperorScorpion e = (EmperorScorpion)entity;
/* 586 */     RenderInfo r = null;
/* 587 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 588 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 589 */     float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 596 */     float pi4 = 1.570795F;
/*     */     
/* 598 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/* 599 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/* 600 */     upangle = 0.0F;
/* 601 */     if (nextangle > newangle)
/* 602 */       upangle = 0.47F * f1 - Math.abs(newangle); 
/* 603 */     doLeftLeg(this.Leg1Seg1, this.Leg1Seg2, this.Leg1Seg3, this.Leg1Seg4, this.Leg1Seg5, newangle, upangle);
/* 604 */     doRightLeg(this.Leg5Seg1, this.Leg5Seg2, this.Leg5Seg3, this.Leg5Seg4, this.Leg5Seg5, -newangle, upangle);
/*     */     
/* 606 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed - 1.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 607 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 2.0F * this.wingspeed - 1.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 608 */     upangle = 0.0F;
/* 609 */     if (nextangle > newangle)
/* 610 */       upangle = 0.47F * f1 - Math.abs(newangle); 
/* 611 */     doLeftLeg(this.Leg2Seg1, this.Leg2Seg2, this.Leg2Seg3, this.Leg2Seg4, this.Leg2Seg5, newangle, upangle);
/* 612 */     doRightLeg(this.Leg6Seg1, this.Leg6Seg2, this.Leg6Seg3, this.Leg6Seg4, this.Leg6Seg5, -newangle, upangle);
/*     */     
/* 614 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 615 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 2.0F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 616 */     upangle = 0.0F;
/* 617 */     if (nextangle > newangle)
/* 618 */       upangle = 0.47F * f1 - Math.abs(newangle); 
/* 619 */     doLeftLeg(this.Leg3Seg1, this.Leg3Seg2, this.Leg3Seg3, this.Leg3Seg4, this.Leg3Seg5, newangle, upangle);
/* 620 */     doRightLeg(this.Leg7Seg1, this.Leg7Seg2, this.Leg7Seg3, this.Leg7Seg4, this.Leg7Seg5, -newangle, upangle);
/*     */     
/* 622 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 623 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 2.0F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 624 */     upangle = 0.0F;
/* 625 */     if (nextangle > newangle)
/* 626 */       upangle = 0.47F * f1 - Math.abs(newangle); 
/* 627 */     doLeftLeg(this.Leg4Seg1, this.Leg4Seg2, this.Leg4Seg3, this.Leg4Seg4, this.Leg4Seg5, newangle, upangle);
/* 628 */     doRightLeg(this.Leg8Seg1, this.Leg8Seg2, this.Leg8Seg3, this.Leg8Seg4, this.Leg8Seg5, -newangle, upangle);
/*     */ 
/*     */     
/* 631 */     if (e.getAttacking() == 0) {
/* 632 */       newangle = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.05F;
/*     */     } else {
/* 634 */       newangle = MathHelper.func_76134_b(f2 * 2.5F * this.wingspeed) * 3.1415927F * 0.15F;
/*     */     } 
/* 636 */     this.LeftManPart2.field_78808_h = newangle;
/* 637 */     this.RightManPart2.field_78808_h = -newangle;
/*     */ 
/*     */     
/* 640 */     r = e.getRenderInfo();
/*     */ 
/*     */     
/* 643 */     newangle = MathHelper.func_76134_b(f2 * 3.0F * this.wingspeed) * 3.1415927F * 0.15F;
/* 644 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 3.0F * this.wingspeed) * 3.1415927F * 0.15F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 649 */     if (nextangle > 0.0F && newangle < 0.0F) {
/*     */       
/* 651 */       r.ri1 = 0;
/* 652 */       if (e.getAttacking() == 0) {
/* 653 */         r.ri1 = e.field_70170_p.field_73012_v.nextInt(20);
/* 654 */         r.ri2 = e.field_70170_p.field_73012_v.nextInt(25);
/*     */       } else {
/* 656 */         r.ri1 = e.field_70170_p.field_73012_v.nextInt(4);
/* 657 */         r.ri2 = e.field_70170_p.field_73012_v.nextInt(3);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 662 */     if (r.ri1 == 1 || r.ri1 == 3) {
/* 663 */       doLeftClaw(newangle);
/*     */     } else {
/* 665 */       doLeftClaw(0.0F);
/*     */     } 
/* 667 */     if (r.ri1 == 2 || r.ri1 == 3) {
/* 668 */       doRightClaw(newangle);
/*     */     } else {
/* 670 */       doRightClaw(0.0F);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 676 */     if (r.ri2 == 1) {
/* 677 */       doTail(newangle);
/*     */     } else {
/* 679 */       doTail(0.0F);
/*     */     } 
/*     */ 
/*     */     
/* 683 */     e.setRenderInfo(r);
/*     */     
/* 685 */     this.Head.func_78785_a(f5);
/* 686 */     this.Seg1.func_78785_a(f5);
/* 687 */     this.Seg2.func_78785_a(f5);
/* 688 */     this.Seg3.func_78785_a(f5);
/* 689 */     this.Seg4.func_78785_a(f5);
/* 690 */     this.Seg5.func_78785_a(f5);
/* 691 */     this.Seg6.func_78785_a(f5);
/* 692 */     this.Seg7.func_78785_a(f5);
/* 693 */     this.Seg8.func_78785_a(f5);
/* 694 */     this.Tailseg1.func_78785_a(f5);
/* 695 */     this.Tailseg2.func_78785_a(f5);
/* 696 */     this.Tailseg3.func_78785_a(f5);
/* 697 */     this.Tailseg4.func_78785_a(f5);
/* 698 */     this.Tailseg5.func_78785_a(f5);
/* 699 */     this.Tailseg6.func_78785_a(f5);
/* 700 */     this.Tailseg7.func_78785_a(f5);
/* 701 */     this.Tailseg8.func_78785_a(f5);
/* 702 */     this.Stinger1.func_78785_a(f5);
/* 703 */     this.Stinger2.func_78785_a(f5);
/* 704 */     this.Stinger3.func_78785_a(f5);
/* 705 */     this.LeftShoulder.func_78785_a(f5);
/* 706 */     this.LeftArmSeg1.func_78785_a(f5);
/* 707 */     this.LeftArmSeg2.func_78785_a(f5);
/* 708 */     this.LeftArmSeg3.func_78785_a(f5);
/* 709 */     this.LeftArmSeg4.func_78785_a(f5);
/* 710 */     this.RightShoulder.func_78785_a(f5);
/* 711 */     this.RightArmSeg1.func_78785_a(f5);
/* 712 */     this.RightArmSeg2.func_78785_a(f5);
/* 713 */     this.RightArmSeg3.func_78785_a(f5);
/* 714 */     this.RightArmSeg4.func_78785_a(f5);
/* 715 */     this.RightPincer.func_78785_a(f5);
/* 716 */     this.LeftPincer.func_78785_a(f5);
/* 717 */     this.Lefteye.func_78785_a(f5);
/* 718 */     this.Righteye.func_78785_a(f5);
/* 719 */     this.RightMandible.func_78785_a(f5);
/* 720 */     this.LeftMandible.func_78785_a(f5);
/* 721 */     this.RightManPart2.func_78785_a(f5);
/* 722 */     this.LeftManPart2.func_78785_a(f5);
/* 723 */     this.Leg1Seg1.func_78785_a(f5);
/* 724 */     this.Leg1Seg2.func_78785_a(f5);
/* 725 */     this.Leg1Seg3.func_78785_a(f5);
/* 726 */     this.Leg1Seg4.func_78785_a(f5);
/* 727 */     this.Leg1Seg5.func_78785_a(f5);
/* 728 */     this.Leg2Seg1.func_78785_a(f5);
/* 729 */     this.Leg2Seg2.func_78785_a(f5);
/* 730 */     this.Leg2Seg3.func_78785_a(f5);
/* 731 */     this.Leg2Seg4.func_78785_a(f5);
/* 732 */     this.Leg2Seg5.func_78785_a(f5);
/* 733 */     this.Leg3Seg1.func_78785_a(f5);
/* 734 */     this.Leg3Seg2.func_78785_a(f5);
/* 735 */     this.Leg3Seg3.func_78785_a(f5);
/* 736 */     this.Leg3Seg4.func_78785_a(f5);
/* 737 */     this.Leg3Seg5.func_78785_a(f5);
/* 738 */     this.Leg4Seg1.func_78785_a(f5);
/* 739 */     this.Leg4Seg2.func_78785_a(f5);
/* 740 */     this.Leg4Seg3.func_78785_a(f5);
/* 741 */     this.Leg4Seg4.func_78785_a(f5);
/* 742 */     this.Leg4Seg5.func_78785_a(f5);
/* 743 */     this.Leg5Seg1.func_78785_a(f5);
/* 744 */     this.Leg5Seg2.func_78785_a(f5);
/* 745 */     this.Leg5Seg3.func_78785_a(f5);
/* 746 */     this.Leg5Seg4.func_78785_a(f5);
/* 747 */     this.Leg5Seg5.func_78785_a(f5);
/* 748 */     this.Leg6Seg1.func_78785_a(f5);
/* 749 */     this.Leg6Seg2.func_78785_a(f5);
/* 750 */     this.Leg6Seg3.func_78785_a(f5);
/* 751 */     this.Leg6Seg4.func_78785_a(f5);
/* 752 */     this.Leg6Seg5.func_78785_a(f5);
/* 753 */     this.Leg7Seg1.func_78785_a(f5);
/* 754 */     this.Leg7Seg2.func_78785_a(f5);
/* 755 */     this.Leg7Seg3.func_78785_a(f5);
/* 756 */     this.Leg7Seg4.func_78785_a(f5);
/* 757 */     this.Leg7Seg5.func_78785_a(f5);
/* 758 */     this.Leg8Seg1.func_78785_a(f5);
/* 759 */     this.Leg8Seg2.func_78785_a(f5);
/* 760 */     this.Leg8Seg3.func_78785_a(f5);
/* 761 */     this.Leg8Seg4.func_78785_a(f5);
/* 762 */     this.Leg8Seg5.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 768 */     model.field_78795_f = x;
/* 769 */     model.field_78796_g = y;
/* 770 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 776 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void doLeftLeg(ModelRenderer seg1, ModelRenderer seg2, ModelRenderer seg3, ModelRenderer seg4, ModelRenderer seg5, float angle, float upangle) {
/* 785 */     seg2.field_78796_g = angle;
/* 786 */     seg3.field_78796_g = angle;
/* 787 */     seg4.field_78796_g = angle;
/* 788 */     seg5.field_78796_g = angle;
/*     */     
/* 790 */     seg3.field_78798_e = (float)(seg2.field_78798_e - Math.sin(angle) * 6.0D);
/* 791 */     seg3.field_78800_c = (float)(seg2.field_78800_c - Math.abs(Math.sin(angle) * 6.0D) + 6.0D);
/* 792 */     seg4.field_78798_e = (float)(seg3.field_78798_e - Math.sin(angle) * 9.0D);
/* 793 */     seg4.field_78800_c = (float)(seg3.field_78800_c - Math.abs(Math.sin(angle) * 9.0D) + 9.0D);
/* 794 */     seg5.field_78798_e = (float)(seg4.field_78798_e - Math.sin(angle) * 1.0D);
/* 795 */     seg5.field_78800_c = (float)(seg4.field_78800_c - Math.abs(Math.sin(angle) * 1.0D) + 1.0D);
/*     */ 
/*     */     
/* 798 */     seg2.field_78808_h = -upangle - 0.929F;
/* 799 */     seg3.field_78808_h = -upangle + 0.632F;
/* 800 */     seg2.field_78797_d += (float)(11.5D * Math.sin(seg2.field_78808_h));
/* 801 */     seg3.field_78797_d += (float)(11.5D * Math.sin(seg3.field_78808_h));
/* 802 */     seg4.field_78797_d += 6.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void doRightLeg(ModelRenderer seg1, ModelRenderer seg2, ModelRenderer seg3, ModelRenderer seg4, ModelRenderer seg5, float angle, float upangle) {
/* 808 */     seg2.field_78796_g = angle;
/* 809 */     seg3.field_78796_g = angle;
/* 810 */     seg4.field_78796_g = angle;
/* 811 */     seg5.field_78796_g = -angle;
/*     */     
/* 813 */     seg3.field_78798_e = (float)(seg2.field_78798_e + Math.sin(angle) * 6.0D);
/* 814 */     seg3.field_78800_c = (float)(seg2.field_78800_c + Math.abs(Math.sin(angle) * 6.0D) - 6.0D);
/* 815 */     seg4.field_78798_e = (float)(seg3.field_78798_e + Math.sin(angle) * 9.0D);
/* 816 */     seg4.field_78800_c = (float)(seg3.field_78800_c + Math.abs(Math.sin(angle) * 9.0D) - 9.0D);
/* 817 */     seg5.field_78798_e = (float)(seg4.field_78798_e + Math.sin(angle) * 1.0D);
/* 818 */     seg5.field_78800_c = (float)(seg4.field_78800_c + Math.abs(Math.sin(angle) * 1.0D) - 1.0D);
/*     */ 
/*     */     
/* 821 */     seg2.field_78808_h = upangle + 0.929F;
/* 822 */     seg3.field_78808_h = upangle - 0.632F;
/* 823 */     seg2.field_78797_d -= (float)(11.5D * Math.sin(seg2.field_78808_h));
/* 824 */     seg3.field_78797_d -= (float)(11.5D * Math.sin(seg3.field_78808_h));
/* 825 */     seg4.field_78797_d += 6.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   private void doLeftClaw(float angle) {
/* 830 */     this.LeftArmSeg1.field_78796_g = -1.57F + angle;
/* 831 */     this.LeftArmSeg2.field_78798_e = (float)(-22.0D - Math.cos(this.LeftArmSeg1.field_78796_g) * 12.0D);
/* 832 */     this.LeftArmSeg2.field_78798_e -= 11.0F;
/* 833 */     this.LeftArmSeg2.field_78798_e -= 11.0F;
/* 834 */     this.LeftArmSeg2.field_78798_e -= 11.0F;
/*     */     
/* 836 */     this.LeftArmSeg3.field_78796_g = 0.074F + angle;
/* 837 */     this.LeftPincer.field_78796_g = 0.371F - angle;
/*     */   }
/*     */ 
/*     */   
/*     */   private void doRightClaw(float angle) {
/* 842 */     this.RightArmSeg1.field_78796_g = 1.57F - angle;
/* 843 */     this.RightArmSeg2.field_78798_e = (float)(-22.0D - Math.cos(this.RightArmSeg1.field_78796_g) * 12.0D);
/* 844 */     this.RightArmSeg2.field_78798_e -= 11.0F;
/* 845 */     this.RightArmSeg2.field_78798_e -= 11.0F;
/* 846 */     this.RightArmSeg2.field_78798_e -= 11.0F;
/*     */     
/* 848 */     this.RightArmSeg3.field_78796_g = -0.074F - angle;
/* 849 */     this.RightPincer.field_78796_g = -0.371F + angle;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void doTail(float angle) {
/* 855 */     this.Tailseg1.field_78795_f = 0.594F + angle;
/*     */ 
/*     */     
/* 858 */     this.Tailseg2.field_78795_f = this.Tailseg1.field_78795_f + 0.48399997F + angle;
/* 859 */     this.Tailseg2.field_78797_d = (float)(this.Tailseg1.field_78797_d - Math.sin(this.Tailseg1.field_78795_f) * 9.0D);
/* 860 */     this.Tailseg2.field_78798_e = (float)(this.Tailseg1.field_78798_e + Math.cos(this.Tailseg1.field_78795_f) * 9.0D);
/*     */     
/* 862 */     this.Tailseg3.field_78795_f = this.Tailseg2.field_78795_f + 0.6320001F + angle;
/* 863 */     this.Tailseg3.field_78797_d = (float)(this.Tailseg2.field_78797_d - Math.sin(this.Tailseg2.field_78795_f) * 10.0D);
/* 864 */     this.Tailseg3.field_78798_e = (float)(this.Tailseg2.field_78798_e + Math.cos(this.Tailseg2.field_78795_f) * 10.0D);
/*     */     
/* 866 */     this.Tailseg4.field_78795_f = this.Tailseg3.field_78795_f + 0.5569999F - angle;
/* 867 */     this.Tailseg4.field_78797_d = (float)(this.Tailseg3.field_78797_d - Math.sin(this.Tailseg3.field_78795_f) * 10.0D);
/* 868 */     this.Tailseg4.field_78798_e = (float)(this.Tailseg3.field_78798_e + Math.cos(this.Tailseg3.field_78795_f) * 10.0D);
/*     */     
/* 870 */     this.Tailseg5.field_78795_f = this.Tailseg4.field_78795_f + 0.63199997F - angle;
/* 871 */     this.Tailseg5.field_78797_d = (float)(this.Tailseg4.field_78797_d - Math.sin(this.Tailseg4.field_78795_f) * 10.0D);
/* 872 */     this.Tailseg5.field_78798_e = (float)(this.Tailseg4.field_78798_e + Math.cos(this.Tailseg4.field_78795_f) * 10.0D);
/*     */     
/* 874 */     this.Tailseg6.field_78795_f = this.Tailseg5.field_78795_f + -5.501F - angle * 3.0F / 2.0F - 0.4F;
/* 875 */     this.Tailseg6.field_78797_d = (float)(this.Tailseg5.field_78797_d - Math.sin(this.Tailseg5.field_78795_f) * 10.0D);
/* 876 */     this.Tailseg6.field_78798_e = (float)(this.Tailseg5.field_78798_e + Math.cos(this.Tailseg5.field_78795_f) * 10.0D);
/*     */     
/* 878 */     this.Tailseg7.field_78795_f = this.Tailseg6.field_78795_f + -2.822F - angle * 2.5F - 2.2F;
/* 879 */     this.Tailseg7.field_78797_d = (float)(this.Tailseg6.field_78797_d - Math.sin(this.Tailseg6.field_78795_f) * 10.0D);
/* 880 */     this.Tailseg7.field_78798_e = (float)(this.Tailseg6.field_78798_e + Math.cos(this.Tailseg6.field_78795_f) * 10.0D);
/*     */ 
/*     */     
/* 883 */     this.Tailseg8.field_78795_f = this.Tailseg7.field_78795_f;
/* 884 */     this.Tailseg8.field_78797_d = this.Tailseg7.field_78797_d;
/* 885 */     this.Tailseg8.field_78798_e = this.Tailseg7.field_78798_e;
/*     */ 
/*     */     
/* 888 */     this.Stinger1.field_78795_f = this.Tailseg7.field_78795_f + 0.0F + angle * 0.66F;
/* 889 */     this.Stinger1.field_78797_d = (float)(this.Tailseg7.field_78797_d - Math.sin(this.Tailseg7.field_78795_f) * 10.0D);
/* 890 */     this.Stinger1.field_78798_e = (float)(this.Tailseg7.field_78798_e + Math.cos(this.Tailseg7.field_78795_f) * 10.0D);
/*     */     
/* 892 */     this.Stinger2.field_78795_f = this.Stinger1.field_78795_f + -0.48F + angle;
/* 893 */     this.Stinger2.field_78797_d = (float)(this.Stinger1.field_78797_d - Math.sin(this.Stinger1.field_78795_f) * 3.0D);
/* 894 */     this.Stinger2.field_78798_e = (float)(this.Stinger1.field_78798_e + Math.cos(this.Stinger1.field_78795_f) * 3.0D);
/*     */     
/* 896 */     this.Stinger3.field_78795_f = this.Stinger2.field_78795_f + -1.01F + angle * 1.7F;
/* 897 */     this.Stinger3.field_78797_d = (float)(this.Stinger2.field_78797_d - Math.sin(this.Stinger2.field_78795_f) * 3.0D);
/* 898 */     this.Stinger3.field_78798_e = (float)(this.Stinger2.field_78798_e + Math.cos(this.Stinger2.field_78795_f) * 3.0D);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelEmperorScorpion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */