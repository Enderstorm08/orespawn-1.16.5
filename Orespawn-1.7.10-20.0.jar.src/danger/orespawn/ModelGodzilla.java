/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelGodzilla
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer LToe1;
/*     */   
/*     */   ModelRenderer LToe3;
/*     */   
/*     */   ModelRenderer LToe2;
/*     */   
/*     */   ModelRenderer LToe9;
/*     */   ModelRenderer LToe8;
/*     */   ModelRenderer LToe7;
/*     */   ModelRenderer LToe6;
/*     */   ModelRenderer LToe5;
/*     */   ModelRenderer LToe4;
/*     */   ModelRenderer RToe9;
/*     */   ModelRenderer RToe6;
/*     */   ModelRenderer RToe5;
/*     */   ModelRenderer RToe2;
/*     */   ModelRenderer RToe1;
/*     */   ModelRenderer RToe4;
/*     */   ModelRenderer RToe7;
/*     */   ModelRenderer RToe8;
/*     */   ModelRenderer RToe3;
/*     */   ModelRenderer LThigh;
/*     */   ModelRenderer LLowerLeg;
/*     */   ModelRenderer LUpperLeg;
/*     */   ModelRenderer TailTip;
/*     */   ModelRenderer RLegLower;
/*     */   ModelRenderer RLegUpper;
/*     */   ModelRenderer RThigh;
/*     */   ModelRenderer LowerJaw;
/*     */   ModelRenderer TailBase;
/*     */   ModelRenderer Tail2;
/*     */   ModelRenderer Tail3;
/*     */   ModelRenderer Tail4;
/*     */   ModelRenderer Tail5;
/*     */   ModelRenderer Tail6;
/*     */   ModelRenderer Tail7;
/*     */   ModelRenderer BodyBottom;
/*     */   ModelRenderer RLowerArm;
/*     */   ModelRenderer BodyCenter;
/*     */   ModelRenderer Neck;
/*     */   ModelRenderer TopJaw;
/*     */   ModelRenderer Head;
/*     */   ModelRenderer BodyTop;
/*     */   ModelRenderer RShoulder;
/*     */   ModelRenderer RThumbTip;
/*     */   ModelRenderer RUpperArm;
/*     */   ModelRenderer RHand;
/*     */   ModelRenderer RThumbBase;
/*     */   ModelRenderer R3rdFingerTip;
/*     */   ModelRenderer R3rdFingerBase;
/*     */   ModelRenderer RIndexTip;
/*     */   ModelRenderer RIndexBase;
/*     */   ModelRenderer LShoulder;
/*     */   ModelRenderer LUpperArm;
/*     */   ModelRenderer LLowerArm;
/*     */   ModelRenderer LIndexBase;
/*     */   ModelRenderer LIndexTip;
/*     */   ModelRenderer LHand;
/*     */   ModelRenderer LThumbBase;
/*     */   ModelRenderer LThumbTip;
/*     */   ModelRenderer L3rdFingerTip;
/*     */   ModelRenderer L3rdFingerBase;
/*     */   ModelRenderer Lspikes1;
/*     */   ModelRenderer Rspikes1;
/*     */   ModelRenderer Lspike2;
/*     */   ModelRenderer Rspike2;
/*     */   ModelRenderer Lspike3;
/*     */   ModelRenderer Rspike3;
/*     */   ModelRenderer Lspike4;
/*     */   ModelRenderer Rspike4;
/*     */   ModelRenderer Lspike5;
/*     */   ModelRenderer Rspike5;
/*     */   ModelRenderer Spike6;
/*     */   ModelRenderer Spikes7;
/*     */   
/*     */   public ModelGodzilla(float f1) {
/*  88 */     this.wingspeed = f1;
/*     */     
/*  90 */     this.field_78090_t = 1024;
/*  91 */     this.field_78089_u = 1024;
/*     */     
/*  93 */     this.LToe1 = new ModelRenderer(this, 45, 1002);
/*  94 */     this.LToe1.func_78789_a(-5.0F, -2.0F, -40.0F, 10, 10, 6);
/*  95 */     this.LToe1.func_78793_a(54.0F, 16.0F, 6.0F);
/*  96 */     this.LToe1.func_78787_b(1024, 1024);
/*  97 */     this.LToe1.field_78809_i = true;
/*  98 */     setRotation(this.LToe1, 0.0F, 0.7853982F, 0.0F);
/*  99 */     this.LToe3 = new ModelRenderer(this, 0, 955);
/* 100 */     this.LToe3.func_78789_a(-8.0F, -8.0F, -26.0F, 16, 16, 30);
/* 101 */     this.LToe3.func_78793_a(54.0F, 16.0F, 6.0F);
/* 102 */     this.LToe3.func_78787_b(1024, 1024);
/* 103 */     this.LToe3.field_78809_i = true;
/* 104 */     setRotation(this.LToe3, 0.0F, 0.7853982F, 0.0F);
/* 105 */     this.LToe2 = new ModelRenderer(this, 0, 1002);
/* 106 */     this.LToe2.func_78789_a(-7.0F, -6.0F, -34.0F, 14, 14, 8);
/* 107 */     this.LToe2.func_78793_a(54.0F, 16.0F, 6.0F);
/* 108 */     this.LToe2.func_78787_b(1024, 1024);
/* 109 */     this.LToe2.field_78809_i = true;
/* 110 */     setRotation(this.LToe2, 0.0F, 0.7853982F, 0.0F);
/* 111 */     this.LToe9 = new ModelRenderer(this, 0, 955);
/* 112 */     this.LToe9.func_78789_a(-8.0F, -8.0F, -26.0F, 16, 16, 30);
/* 113 */     this.LToe9.func_78793_a(54.0F, 16.0F, 6.0F);
/* 114 */     this.LToe9.func_78787_b(1024, 1024);
/* 115 */     this.LToe9.field_78809_i = true;
/* 116 */     setRotation(this.LToe9, 0.0F, -0.7853982F, 0.0F);
/* 117 */     this.LToe8 = new ModelRenderer(this, 0, 1002);
/* 118 */     this.LToe8.func_78789_a(-7.0F, -6.0F, -34.0F, 14, 14, 8);
/* 119 */     this.LToe8.func_78793_a(54.0F, 16.0F, 6.0F);
/* 120 */     this.LToe8.func_78787_b(1024, 1024);
/* 121 */     this.LToe8.field_78809_i = true;
/* 122 */     setRotation(this.LToe8, 0.0F, -0.7853982F, 0.0F);
/* 123 */     this.LToe7 = new ModelRenderer(this, 45, 1002);
/* 124 */     this.LToe7.func_78789_a(-5.0F, -2.0F, -40.0F, 10, 10, 6);
/* 125 */     this.LToe7.func_78793_a(54.0F, 16.0F, 6.0F);
/* 126 */     this.LToe7.func_78787_b(1024, 1024);
/* 127 */     this.LToe7.field_78809_i = true;
/* 128 */     setRotation(this.LToe7, 0.0F, -0.7853982F, 0.0F);
/* 129 */     this.LToe6 = new ModelRenderer(this, 92, 955);
/* 130 */     this.LToe6.func_78789_a(-8.0F, -8.0F, -26.0F, 16, 16, 36);
/* 131 */     this.LToe6.func_78793_a(54.0F, 16.0F, 6.0F);
/* 132 */     this.LToe6.func_78787_b(1024, 1024);
/* 133 */     this.LToe6.field_78809_i = true;
/* 134 */     setRotation(this.LToe6, 0.0F, 0.0F, 0.0F);
/* 135 */     this.LToe5 = new ModelRenderer(this, 0, 1002);
/* 136 */     this.LToe5.func_78789_a(-7.0F, -6.0F, -34.0F, 14, 14, 8);
/* 137 */     this.LToe5.func_78793_a(54.0F, 16.0F, 6.0F);
/* 138 */     this.LToe5.func_78787_b(1024, 1024);
/* 139 */     this.LToe5.field_78809_i = true;
/* 140 */     setRotation(this.LToe5, 0.0F, 0.0F, 0.0F);
/* 141 */     this.LToe4 = new ModelRenderer(this, 45, 1002);
/* 142 */     this.LToe4.func_78789_a(-5.0F, -2.0F, -40.0F, 10, 10, 6);
/* 143 */     this.LToe4.func_78793_a(54.0F, 16.0F, 6.0F);
/* 144 */     this.LToe4.func_78787_b(1024, 1024);
/* 145 */     this.LToe4.field_78809_i = true;
/* 146 */     setRotation(this.LToe4, 0.0F, 0.0F, 0.0F);
/* 147 */     this.RToe9 = new ModelRenderer(this, 0, 955);
/* 148 */     this.RToe9.func_78789_a(-8.0F, -8.0F, -26.0F, 16, 16, 30);
/* 149 */     this.RToe9.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 150 */     this.RToe9.func_78787_b(1024, 1024);
/* 151 */     this.RToe9.field_78809_i = true;
/* 152 */     setRotation(this.RToe9, 0.0F, 0.7853982F, 0.0F);
/* 153 */     this.RToe6 = new ModelRenderer(this, 92, 955);
/* 154 */     this.RToe6.func_78789_a(-8.0F, -8.0F, -26.0F, 16, 16, 36);
/* 155 */     this.RToe6.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 156 */     this.RToe6.func_78787_b(1024, 1024);
/* 157 */     this.RToe6.field_78809_i = true;
/* 158 */     setRotation(this.RToe6, 0.0F, 0.0F, 0.0F);
/* 159 */     this.RToe5 = new ModelRenderer(this, 0, 1002);
/* 160 */     this.RToe5.func_78789_a(-7.0F, -6.0F, -34.0F, 14, 14, 8);
/* 161 */     this.RToe5.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 162 */     this.RToe5.func_78787_b(1024, 1024);
/* 163 */     this.RToe5.field_78809_i = true;
/* 164 */     setRotation(this.RToe5, 0.0F, 0.0F, 0.0F);
/* 165 */     this.RToe2 = new ModelRenderer(this, 0, 1002);
/* 166 */     this.RToe2.func_78789_a(-7.0F, -6.0F, -34.0F, 14, 14, 8);
/* 167 */     this.RToe2.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 168 */     this.RToe2.func_78787_b(1024, 1024);
/* 169 */     this.RToe2.field_78809_i = true;
/* 170 */     setRotation(this.RToe2, 0.0F, -0.7853982F, 0.0F);
/* 171 */     this.RToe1 = new ModelRenderer(this, 45, 1002);
/* 172 */     this.RToe1.func_78789_a(-5.0F, -2.0F, -40.0F, 10, 10, 6);
/* 173 */     this.RToe1.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 174 */     this.RToe1.func_78787_b(1024, 1024);
/* 175 */     this.RToe1.field_78809_i = true;
/* 176 */     setRotation(this.RToe1, 0.0F, -0.7853982F, 0.0F);
/* 177 */     this.RToe4 = new ModelRenderer(this, 45, 1002);
/* 178 */     this.RToe4.func_78789_a(-5.0F, -2.0F, -40.0F, 10, 10, 6);
/* 179 */     this.RToe4.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 180 */     this.RToe4.func_78787_b(1024, 1024);
/* 181 */     this.RToe4.field_78809_i = true;
/* 182 */     setRotation(this.RToe4, 0.0F, 0.0F, 0.0F);
/* 183 */     this.RToe7 = new ModelRenderer(this, 45, 1002);
/* 184 */     this.RToe7.func_78789_a(-5.0F, -2.0F, -40.0F, 10, 10, 6);
/* 185 */     this.RToe7.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 186 */     this.RToe7.func_78787_b(1024, 1024);
/* 187 */     this.RToe7.field_78809_i = true;
/* 188 */     setRotation(this.RToe7, 0.0F, 0.7853982F, 0.0F);
/* 189 */     this.RToe8 = new ModelRenderer(this, 0, 1002);
/* 190 */     this.RToe8.func_78789_a(-7.0F, -6.0F, -34.0F, 14, 14, 8);
/* 191 */     this.RToe8.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 192 */     this.RToe8.func_78787_b(1024, 1024);
/* 193 */     this.RToe8.field_78809_i = true;
/* 194 */     setRotation(this.RToe8, 0.0F, 0.7853982F, 0.0F);
/* 195 */     this.RToe3 = new ModelRenderer(this, 0, 955);
/* 196 */     this.RToe3.func_78789_a(-8.0F, -8.0F, -26.0F, 16, 16, 30);
/* 197 */     this.RToe3.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 198 */     this.RToe3.func_78787_b(1024, 1024);
/* 199 */     this.RToe3.field_78809_i = true;
/* 200 */     setRotation(this.RToe3, 0.0F, -0.7853982F, 0.0F);
/* 201 */     this.LThigh = new ModelRenderer(this, 192, 350);
/* 202 */     this.LThigh.func_78789_a(0.0F, -14.0F, -21.0F, 28, 28, 42);
/* 203 */     this.LThigh.func_78793_a(40.0F, -91.0F, 2.0F);
/* 204 */     this.LThigh.func_78787_b(1024, 1024);
/* 205 */     this.LThigh.field_78809_i = true;
/* 206 */     setRotation(this.LThigh, -0.5585054F, 0.0F, 0.0F);
/* 207 */     this.LLowerLeg = new ModelRenderer(this, 202, 556);
/* 208 */     this.LLowerLeg.func_78789_a(-15.0F, -62.0F, -15.0F, 30, 62, 30);
/* 209 */     this.LLowerLeg.func_78793_a(54.0F, 14.0F, 6.0F);
/* 210 */     this.LLowerLeg.func_78787_b(1024, 1024);
/* 211 */     this.LLowerLeg.field_78809_i = true;
/* 212 */     setRotation(this.LLowerLeg, 0.1745329F, -0.1308997F, 0.0F);
/* 213 */     this.LUpperLeg = new ModelRenderer(this, 152, 420);
/* 214 */     this.LUpperLeg.func_78789_a(-16.0F, -52.0F, -16.0F, 32, 52, 32);
/* 215 */     this.LUpperLeg.func_78793_a(56.0F, -36.0F, -5.0F);
/* 216 */     this.LUpperLeg.func_78787_b(1024, 1024);
/* 217 */     this.LUpperLeg.field_78809_i = true;
/* 218 */     setRotation(this.LUpperLeg, -0.1745329F, -0.3926991F, -0.0872665F);
/* 219 */     this.TailTip = new ModelRenderer(this, 0, 694);
/* 220 */     this.TailTip.func_78789_a(-6.0F, 0.0F, -5.0F, 12, 21, 10);
/* 221 */     this.TailTip.func_78793_a(0.0F, 18.0F, 203.0F);
/* 222 */     this.TailTip.func_78787_b(1024, 1024);
/* 223 */     this.TailTip.field_78809_i = true;
/* 224 */     setRotation(this.TailTip, 1.53589F, 0.0F, 0.0F);
/* 225 */     this.RLegLower = new ModelRenderer(this, 200, 646);
/* 226 */     this.RLegLower.func_78789_a(-15.0F, -62.0F, -15.0F, 30, 62, 30);
/* 227 */     this.RLegLower.func_78793_a(-54.0F, 16.0F, 6.0F);
/* 228 */     this.RLegLower.func_78787_b(1024, 1024);
/* 229 */     this.RLegLower.field_78809_i = true;
/* 230 */     setRotation(this.RLegLower, 0.1745329F, 0.1308997F, 0.0F);
/* 231 */     this.RLegUpper = new ModelRenderer(this, 152, 420);
/* 232 */     this.RLegUpper.func_78789_a(-16.0F, -52.0F, -16.0F, 32, 52, 32);
/* 233 */     this.RLegUpper.func_78793_a(-56.0F, -36.0F, -5.0F);
/* 234 */     this.RLegUpper.func_78787_b(1024, 1024);
/* 235 */     this.RLegUpper.field_78809_i = true;
/* 236 */     setRotation(this.RLegUpper, -0.1745329F, 0.3926991F, 0.0872665F);
/* 237 */     this.RThigh = new ModelRenderer(this, 192, 350);
/* 238 */     this.RThigh.func_78789_a(-28.0F, -14.0F, -21.0F, 28, 28, 42);
/* 239 */     this.RThigh.func_78793_a(-40.0F, -91.0F, 2.0F);
/* 240 */     this.RThigh.func_78787_b(1024, 1024);
/* 241 */     this.RThigh.field_78809_i = true;
/* 242 */     setRotation(this.RThigh, -0.5585054F, 0.0F, 0.0F);
/* 243 */     this.LowerJaw = new ModelRenderer(this, 272, 0);
/* 244 */     this.LowerJaw.func_78789_a(-13.0F, -5.0F, -50.0F, 26, 11, 50);
/* 245 */     this.LowerJaw.func_78793_a(0.0F, -142.0F, -109.0F);
/* 246 */     this.LowerJaw.func_78787_b(1024, 1024);
/* 247 */     this.LowerJaw.field_78809_i = true;
/* 248 */     setRotation(this.LowerJaw, 0.5235988F, 0.0F, 0.0F);
/* 249 */     this.TailBase = new ModelRenderer(this, 0, 240);
/* 250 */     this.TailBase.func_78789_a(-32.0F, 0.0F, -29.0F, 64, 40, 58);
/* 251 */     this.TailBase.func_78793_a(0.0F, -73.0F, 26.0F);
/* 252 */     this.TailBase.func_78787_b(1024, 1024);
/* 253 */     this.TailBase.field_78809_i = true;
/* 254 */     setRotation(this.TailBase, 0.7853982F, 0.0F, 0.0F);
/* 255 */     this.Tail2 = new ModelRenderer(this, 0, 338);
/* 256 */     this.Tail2.func_78789_a(-25.0F, 0.0F, -23.0F, 50, 36, 46);
/* 257 */     this.Tail2.func_78793_a(0.0F, -48.0F, 48.0F);
/* 258 */     this.Tail2.func_78787_b(1024, 1024);
/* 259 */     this.Tail2.field_78809_i = true;
/* 260 */     setRotation(this.Tail2, 0.6981317F, 0.0F, 0.0F);
/* 261 */     this.Tail3 = new ModelRenderer(this, 0, 420);
/* 262 */     this.Tail3.func_78789_a(-20.0F, 0.0F, -18.0F, 40, 36, 36);
/* 263 */     this.Tail3.func_78793_a(0.0F, -24.0F, 66.0F);
/* 264 */     this.Tail3.func_78787_b(1024, 1024);
/* 265 */     this.Tail3.field_78809_i = true;
/* 266 */     setRotation(this.Tail3, 0.8726646F, 0.0F, 0.0F);
/* 267 */     this.Tail4 = new ModelRenderer(this, 0, 492);
/* 268 */     this.Tail4.func_78789_a(-16.0F, 0.0F, -14.0F, 32, 42, 28);
/* 269 */     this.Tail4.func_78793_a(0.0F, -3.0F, 87.0F);
/* 270 */     this.Tail4.func_78787_b(1024, 1024);
/* 271 */     this.Tail4.field_78809_i = true;
/* 272 */     setRotation(this.Tail4, 1.134464F, 0.0F, 0.0F);
/* 273 */     this.Tail5 = new ModelRenderer(this, 0, 556);
/* 274 */     this.Tail5.func_78789_a(-13.0F, 0.0F, -11.0F, 26, 42, 22);
/* 275 */     this.Tail5.func_78793_a(0.0F, 12.0F, 116.0F);
/* 276 */     this.Tail5.func_78787_b(1024, 1024);
/* 277 */     this.Tail5.field_78809_i = true;
/* 278 */     setRotation(this.Tail5, 1.53589F, 0.0F, 0.0F);
/* 279 */     this.Tail6 = new ModelRenderer(this, 0, 614);
/* 280 */     this.Tail6.func_78789_a(-10.0F, 0.0F, -9.0F, 20, 32, 18);
/* 281 */     this.Tail6.func_78793_a(0.0F, 14.0F, 154.0F);
/* 282 */     this.Tail6.func_78787_b(1024, 1024);
/* 283 */     this.Tail6.field_78809_i = true;
/* 284 */     setRotation(this.Tail6, 1.53589F, 0.0F, 0.0F);
/* 285 */     this.Tail7 = new ModelRenderer(this, 0, 658);
/* 286 */     this.Tail7.func_78789_a(-8.0F, 0.0F, -7.0F, 16, 22, 14);
/* 287 */     this.Tail7.func_78793_a(0.0F, 16.0F, 185.0F);
/* 288 */     this.Tail7.func_78787_b(1024, 1024);
/* 289 */     this.Tail7.field_78809_i = true;
/* 290 */     setRotation(this.Tail7, 1.53589F, 0.0F, 0.0F);
/* 291 */     this.BodyBottom = new ModelRenderer(this, 0, 104);
/* 292 */     this.BodyBottom.func_78789_a(-40.0F, 0.0F, -36.0F, 80, 64, 72);
/* 293 */     this.BodyBottom.func_78793_a(0.0F, -112.0F, -20.0F);
/* 294 */     this.BodyBottom.func_78787_b(1024, 1024);
/* 295 */     this.BodyBottom.field_78809_i = true;
/* 296 */     setRotation(this.BodyBottom, 0.8726646F, 0.0F, 0.0F);
/* 297 */     this.RLowerArm = new ModelRenderer(this, 245, 240);
/* 298 */     this.RLowerArm.func_78789_a(-48.0F, -11.0F, -11.0F, 48, 22, 22);
/* 299 */     this.RLowerArm.func_78793_a(-80.0F, -115.0F, -61.0F);
/* 300 */     this.RLowerArm.func_78787_b(1024, 1024);
/* 301 */     this.RLowerArm.field_78809_i = true;
/* 302 */     setRotation(this.RLowerArm, 0.0F, -0.7853982F, -0.2617994F);
/* 303 */     this.BodyCenter = new ModelRenderer(this, 0, 0);
/* 304 */     this.BodyCenter.func_78789_a(-36.0F, -32.0F, -32.0F, 72, 40, 64);
/* 305 */     this.BodyCenter.func_78793_a(0.0F, -112.0F, -20.0F);
/* 306 */     this.BodyCenter.func_78787_b(1024, 1024);
/* 307 */     this.BodyCenter.field_78809_i = true;
/* 308 */     setRotation(this.BodyCenter, 1.134464F, 0.0F, 0.0F);
/* 309 */     this.Neck = new ModelRenderer(this, 0, 720);
/* 310 */     this.Neck.func_78789_a(-23.0F, -23.0F, -32.0F, 46, 46, 32);
/* 311 */     this.Neck.func_78793_a(0.0F, -144.0F, -71.0F);
/* 312 */     this.Neck.func_78787_b(1024, 1024);
/* 313 */     this.Neck.field_78809_i = true;
/* 314 */     setRotation(this.Neck, -0.0698132F, 0.0F, 0.0F);
/* 315 */     this.TopJaw = new ModelRenderer(this, 0, 892);
/* 316 */     this.TopJaw.func_78789_a(-14.0F, -8.0F, -73.0F, 28, 26, 33);
/* 317 */     this.TopJaw.func_78793_a(0.0F, -156.0F, -98.0F);
/* 318 */     this.TopJaw.func_78787_b(1024, 1024);
/* 319 */     this.TopJaw.field_78809_i = true;
/* 320 */     setRotation(this.TopJaw, 0.0872665F, 0.0F, 0.0F);
/* 321 */     this.Head = new ModelRenderer(this, 0, 808);
/* 322 */     this.Head.func_78789_a(-17.0F, -18.0F, -40.0F, 34, 36, 40);
/* 323 */     this.Head.func_78793_a(0.0F, -156.0F, -98.0F);
/* 324 */     this.Head.func_78787_b(1024, 1024);
/* 325 */     this.Head.field_78809_i = true;
/* 326 */     setRotation(this.Head, 0.0872665F, 0.0F, 0.0F);
/* 327 */     this.BodyTop = new ModelRenderer(this, 0, 0);
/* 328 */     this.BodyTop.func_78789_a(-36.0F, -32.0F, -32.0F, 72, 40, 64);
/* 329 */     this.BodyTop.func_78793_a(0.0F, -126.0F, -50.0F);
/* 330 */     this.BodyTop.func_78787_b(1024, 1024);
/* 331 */     this.BodyTop.field_78809_i = true;
/* 332 */     setRotation(this.BodyTop, 1.308997F, 0.0F, 0.0F);
/* 333 */     this.RShoulder = new ModelRenderer(this, 304, 96);
/* 334 */     this.RShoulder.func_78789_a(-16.0F, -32.0F, -32.0F, 16, 42, 46);
/* 335 */     this.RShoulder.func_78793_a(-36.0F, -130.0F, -42.0F);
/* 336 */     this.RShoulder.func_78787_b(1024, 1024);
/* 337 */     this.RShoulder.field_78809_i = true;
/* 338 */     setRotation(this.RShoulder, 1.308997F, 0.0F, 0.0F);
/* 339 */     this.RThumbTip = new ModelRenderer(this, 422, 18);
/* 340 */     this.RThumbTip.func_78789_a(5.0F, 1.0F, -43.0F, 8, 8, 12);
/* 341 */     this.RThumbTip.func_78793_a(-115.0F, -100.0F, -99.0F);
/* 342 */     this.RThumbTip.func_78787_b(1024, 1024);
/* 343 */     this.RThumbTip.field_78809_i = true;
/* 344 */     setRotation(this.RThumbTip, 0.0F, 0.0F, 0.0F);
/* 345 */     this.RUpperArm = new ModelRenderer(this, 304, 184);
/* 346 */     this.RUpperArm.func_78789_a(-54.0F, -13.0F, -13.0F, 54, 26, 26);
/* 347 */     this.RUpperArm.func_78793_a(-38.0F, -130.0F, -52.0F);
/* 348 */     this.RUpperArm.func_78787_b(1024, 1024);
/* 349 */     this.RUpperArm.field_78809_i = true;
/* 350 */     setRotation(this.RUpperArm, 0.0F, -0.2617994F, -0.3490659F);
/* 351 */     this.RHand = new ModelRenderer(this, 245, 292);
/* 352 */     this.RHand.func_78789_a(-13.0F, -13.0F, -13.0F, 26, 26, 26);
/* 353 */     this.RHand.func_78793_a(-115.0F, -100.0F, -99.0F);
/* 354 */     this.RHand.func_78787_b(1024, 1024);
/* 355 */     this.RHand.field_78809_i = true;
/* 356 */     setRotation(this.RHand, -1.071467F, 2.007129F, 0.1745329F);
/* 357 */     this.RThumbBase = new ModelRenderer(this, 424, 57);
/* 358 */     this.RThumbBase.func_78789_a(2.0F, 1.0F, -32.0F, 8, 8, 20);
/* 359 */     this.RThumbBase.func_78793_a(-115.0F, -100.0F, -99.0F);
/* 360 */     this.RThumbBase.func_78787_b(1024, 1024);
/* 361 */     this.RThumbBase.field_78809_i = true;
/* 362 */     setRotation(this.RThumbBase, 0.0F, -0.1047198F, 0.0F);
/* 363 */     this.R3rdFingerTip = new ModelRenderer(this, 422, 18);
/* 364 */     this.R3rdFingerTip.func_78789_a(-10.0F, 0.0F, -41.0F, 8, 8, 12);
/* 365 */     this.R3rdFingerTip.func_78793_a(-115.0F, -100.0F, -99.0F);
/* 366 */     this.R3rdFingerTip.func_78787_b(1024, 1024);
/* 367 */     this.R3rdFingerTip.field_78809_i = true;
/* 368 */     setRotation(this.R3rdFingerTip, 0.0F, 0.6806784F, 0.0F);
/* 369 */     this.R3rdFingerBase = new ModelRenderer(this, 424, 57);
/* 370 */     this.R3rdFingerBase.func_78789_a(-11.0F, -3.0F, -30.0F, 8, 8, 20);
/* 371 */     this.R3rdFingerBase.func_78793_a(-115.0F, -100.0F, -99.0F);
/* 372 */     this.R3rdFingerBase.func_78787_b(1024, 1024);
/* 373 */     this.R3rdFingerBase.field_78809_i = true;
/* 374 */     setRotation(this.R3rdFingerBase, 0.122173F, 0.6457718F, 0.0F);
/* 375 */     this.RIndexTip = new ModelRenderer(this, 422, 18);
/* 376 */     this.RIndexTip.func_78789_a(-4.0F, -12.0F, -43.0F, 8, 8, 12);
/* 377 */     this.RIndexTip.func_78793_a(-115.0F, -100.0F, -99.0F);
/* 378 */     this.RIndexTip.func_78787_b(1024, 1024);
/* 379 */     this.RIndexTip.field_78809_i = true;
/* 380 */     setRotation(this.RIndexTip, -0.2094395F, 0.1745329F, 0.0F);
/* 381 */     this.RIndexBase = new ModelRenderer(this, 424, 57);
/* 382 */     this.RIndexBase.func_78789_a(-4.0F, -9.0F, -34.0F, 8, 8, 20);
/* 383 */     this.RIndexBase.func_78793_a(-115.0F, -100.0F, -99.0F);
/* 384 */     this.RIndexBase.func_78787_b(1024, 1024);
/* 385 */     this.RIndexBase.field_78809_i = true;
/* 386 */     setRotation(this.RIndexBase, -0.2792527F, 0.1570796F, 0.0F);
/* 387 */     this.LShoulder = new ModelRenderer(this, 304, 96);
/* 388 */     this.LShoulder.func_78789_a(0.0F, -32.0F, -32.0F, 16, 42, 46);
/* 389 */     this.LShoulder.func_78793_a(36.0F, -130.0F, -42.0F);
/* 390 */     this.LShoulder.func_78787_b(1024, 1024);
/* 391 */     this.LShoulder.field_78809_i = true;
/* 392 */     setRotation(this.LShoulder, 1.308997F, 0.0F, 0.0F);
/* 393 */     this.LUpperArm = new ModelRenderer(this, 304, 184);
/* 394 */     this.LUpperArm.func_78789_a(0.0F, -13.0F, -13.0F, 54, 26, 26);
/* 395 */     this.LUpperArm.func_78793_a(38.0F, -130.0F, -52.0F);
/* 396 */     this.LUpperArm.func_78787_b(1024, 1024);
/* 397 */     this.LUpperArm.field_78809_i = true;
/* 398 */     setRotation(this.LUpperArm, 0.0F, 0.296706F, 0.3490659F);
/* 399 */     this.LLowerArm = new ModelRenderer(this, 245, 240);
/* 400 */     this.LLowerArm.func_78789_a(0.0F, -11.0F, -11.0F, 48, 22, 22);
/* 401 */     this.LLowerArm.func_78793_a(80.0F, -115.0F, -61.0F);
/* 402 */     this.LLowerArm.func_78787_b(1024, 1024);
/* 403 */     this.LLowerArm.field_78809_i = true;
/* 404 */     setRotation(this.LLowerArm, 0.0F, 0.7853982F, 0.2617994F);
/* 405 */     this.LIndexBase = new ModelRenderer(this, 424, 57);
/* 406 */     this.LIndexBase.func_78789_a(-4.0F, -13.0F, -32.0F, 8, 8, 20);
/* 407 */     this.LIndexBase.func_78793_a(115.0F, -100.0F, -99.0F);
/* 408 */     this.LIndexBase.func_78787_b(1024, 1024);
/* 409 */     this.LIndexBase.field_78809_i = true;
/* 410 */     setRotation(this.LIndexBase, -0.1570796F, -0.1396263F, 0.0F);
/* 411 */     this.LIndexTip = new ModelRenderer(this, 422, 18);
/* 412 */     this.LIndexTip.func_78789_a(-1.0F, -18.0F, -41.0F, 8, 8, 12);
/* 413 */     this.LIndexTip.func_78793_a(115.0F, -100.0F, -99.0F);
/* 414 */     this.LIndexTip.func_78787_b(1024, 1024);
/* 415 */     this.LIndexTip.field_78809_i = true;
/* 416 */     setRotation(this.LIndexTip, 0.0F, -0.0349066F, 0.0F);
/* 417 */     this.LHand = new ModelRenderer(this, 245, 292);
/* 418 */     this.LHand.func_78789_a(-13.0F, -13.0F, -13.0F, 26, 26, 26);
/* 419 */     this.LHand.func_78793_a(115.0F, -100.0F, -99.0F);
/* 420 */     this.LHand.func_78787_b(1024, 1024);
/* 421 */     this.LHand.field_78809_i = true;
/* 422 */     setRotation(this.LHand, 0.9599311F, 1.308997F, 0.1745329F);
/* 423 */     this.LThumbBase = new ModelRenderer(this, 424, 57);
/* 424 */     this.LThumbBase.func_78789_a(-8.0F, -2.0F, -32.0F, 8, 8, 20);
/* 425 */     this.LThumbBase.func_78793_a(115.0F, -100.0F, -98.0F);
/* 426 */     this.LThumbBase.func_78787_b(1024, 1024);
/* 427 */     this.LThumbBase.field_78809_i = true;
/* 428 */     setRotation(this.LThumbBase, 0.1396263F, 0.2617994F, 0.0F);
/* 429 */     this.LThumbTip = new ModelRenderer(this, 422, 18);
/* 430 */     this.LThumbTip.func_78789_a(-12.0F, 2.0F, -40.0F, 8, 8, 12);
/* 431 */     this.LThumbTip.func_78793_a(115.0F, -100.0F, -99.0F);
/* 432 */     this.LThumbTip.func_78787_b(1024, 1024);
/* 433 */     this.LThumbTip.field_78809_i = true;
/* 434 */     setRotation(this.LThumbTip, 0.0F, 0.1396263F, 0.0F);
/* 435 */     this.L3rdFingerTip = new ModelRenderer(this, 422, 18);
/* 436 */     this.L3rdFingerTip.func_78789_a(9.0F, 2.0F, -42.0F, 8, 8, 12);
/* 437 */     this.L3rdFingerTip.func_78793_a(115.0F, -100.0F, -99.0F);
/* 438 */     this.L3rdFingerTip.func_78787_b(1024, 1024);
/* 439 */     this.L3rdFingerTip.field_78809_i = true;
/* 440 */     setRotation(this.L3rdFingerTip, 0.0349066F, -0.3316126F, 0.0F);
/* 441 */     this.L3rdFingerBase = new ModelRenderer(this, 424, 57);
/* 442 */     this.L3rdFingerBase.func_78789_a(4.0F, -5.0F, -33.0F, 8, 8, 20);
/* 443 */     this.L3rdFingerBase.func_78793_a(115.0F, -100.0F, -99.0F);
/* 444 */     this.L3rdFingerBase.func_78787_b(1024, 1024);
/* 445 */     this.L3rdFingerBase.field_78809_i = true;
/* 446 */     setRotation(this.L3rdFingerBase, 0.2617994F, -0.4712389F, 0.0F);
/* 447 */     this.Lspikes1 = new ModelRenderer(this, 500, 0);
/* 448 */     this.Lspikes1.func_78789_a(0.0F, -10.0F, 0.0F, 0, 10, 11);
/* 449 */     this.Lspikes1.func_78793_a(5.0F, -168.0F, -86.0F);
/* 450 */     this.Lspikes1.func_78787_b(1024, 1024);
/* 451 */     this.Lspikes1.field_78809_i = true;
/* 452 */     setRotation(this.Lspikes1, -0.0872665F, 0.0F, -0.0174533F);
/* 453 */     this.Rspikes1 = new ModelRenderer(this, 500, 0);
/* 454 */     this.Rspikes1.func_78789_a(0.0F, -10.0F, 0.0F, 0, 10, 11);
/* 455 */     this.Rspikes1.func_78793_a(-5.0F, -168.0F, -86.0F);
/* 456 */     this.Rspikes1.func_78787_b(1024, 1024);
/* 457 */     this.Rspikes1.field_78809_i = true;
/* 458 */     setRotation(this.Rspikes1, -0.0872665F, 0.0F, -0.0174533F);
/* 459 */     this.Lspike2 = new ModelRenderer(this, 500, 30);
/* 460 */     this.Lspike2.func_78789_a(0.0F, -25.0F, 0.0F, 0, 25, 21);
/* 461 */     this.Lspike2.func_78793_a(10.0F, -162.0F, -63.0F);
/* 462 */     this.Lspike2.func_78787_b(1024, 1024);
/* 463 */     this.Lspike2.field_78809_i = true;
/* 464 */     setRotation(this.Lspike2, -0.2617994F, 0.0F, -0.0174533F);
/* 465 */     this.Rspike2 = new ModelRenderer(this, 500, 30);
/* 466 */     this.Rspike2.func_78789_a(0.0F, -25.0F, 0.0F, 0, 25, 21);
/* 467 */     this.Rspike2.func_78793_a(-10.0F, -162.0F, -63.0F);
/* 468 */     this.Rspike2.func_78787_b(1024, 1024);
/* 469 */     this.Rspike2.field_78809_i = true;
/* 470 */     setRotation(this.Rspike2, -0.2617994F, 0.0F, -0.0174533F);
/* 471 */     this.Lspike3 = new ModelRenderer(this, 500, 80);
/* 472 */     this.Lspike3.func_78789_a(0.0F, -45.0F, 0.0F, 0, 45, 34);
/* 473 */     this.Lspike3.func_78793_a(14.0F, -153.0F, -32.0F);
/* 474 */     this.Lspike3.func_78787_b(1024, 1024);
/* 475 */     this.Lspike3.field_78809_i = true;
/* 476 */     setRotation(this.Lspike3, -0.4363323F, 0.0F, -0.0174533F);
/* 477 */     this.Rspike3 = new ModelRenderer(this, 500, 80);
/* 478 */     this.Rspike3.func_78789_a(0.0F, -45.0F, 0.0F, 0, 45, 34);
/* 479 */     this.Rspike3.func_78793_a(-14.0F, -153.0F, -32.0F);
/* 480 */     this.Rspike3.func_78787_b(1024, 1024);
/* 481 */     this.Rspike3.field_78809_i = true;
/* 482 */     setRotation(this.Rspike3, -0.4363323F, 0.0F, -0.0174533F);
/* 483 */     this.Lspike4 = new ModelRenderer(this, 500, 165);
/* 484 */     this.Lspike4.func_78789_a(0.0F, -50.0F, 0.0F, 0, 50, 36);
/* 485 */     this.Lspike4.func_78793_a(18.0F, -131.0F, 13.0F);
/* 486 */     this.Lspike4.func_78787_b(1024, 1024);
/* 487 */     this.Lspike4.field_78809_i = true;
/* 488 */     setRotation(this.Lspike4, -0.715585F, 0.0F, -0.0174533F);
/* 489 */     this.Rspike4 = new ModelRenderer(this, 500, 165);
/* 490 */     this.Rspike4.func_78789_a(0.0F, -50.0F, 0.0F, 0, 50, 36);
/* 491 */     this.Rspike4.func_78793_a(-18.0F, -131.0F, 13.0F);
/* 492 */     this.Rspike4.func_78787_b(1024, 1024);
/* 493 */     this.Rspike4.field_78809_i = true;
/* 494 */     setRotation(this.Rspike4, -0.715585F, 0.0F, -0.0174533F);
/* 495 */     this.Lspike5 = new ModelRenderer(this, 500, 255);
/* 496 */     this.Lspike5.func_78789_a(12.0F, -67.0F, 5.0F, 0, 39, 27);
/* 497 */     this.Lspike5.func_78793_a(0.0F, -73.0F, 26.0F);
/* 498 */     this.Lspike5.func_78787_b(1024, 1024);
/* 499 */     this.Lspike5.field_78809_i = true;
/* 500 */     setRotation(this.Lspike5, -0.7853982F, 0.0F, -0.0174533F);
/* 501 */     this.Rspike5 = new ModelRenderer(this, 500, 255);
/* 502 */     this.Rspike5.func_78789_a(-12.0F, -67.0F, 5.0F, 0, 39, 27);
/* 503 */     this.Rspike5.func_78793_a(0.0F, -73.0F, 26.0F);
/* 504 */     this.Rspike5.func_78787_b(1024, 1024);
/* 505 */     this.Rspike5.field_78809_i = true;
/* 506 */     setRotation(this.Rspike5, -0.7853982F, 0.0F, -0.0174533F);
/* 507 */     this.Spike6 = new ModelRenderer(this, 500, 325);
/* 508 */     this.Spike6.func_78789_a(0.0F, -48.0F, 11.0F, 0, 25, 21);
/* 509 */     this.Spike6.func_78793_a(0.0F, -48.0F, 48.0F);
/* 510 */     this.Spike6.func_78787_b(1024, 1024);
/* 511 */     this.Spike6.field_78809_i = true;
/* 512 */     setRotation(this.Spike6, -0.8901179F, 0.0F, -0.0174533F);
/* 513 */     this.Spikes7 = new ModelRenderer(this, 500, 376);
/* 514 */     this.Spikes7.func_78789_a(0.0F, -29.0F, 20.0F, 0, 10, 11);
/* 515 */     this.Spikes7.func_78793_a(0.0F, -24.0F, 66.0F);
/* 516 */     this.Spikes7.func_78787_b(1024, 1024);
/* 517 */     this.Spikes7.field_78809_i = true;
/* 518 */     setRotation(this.Spikes7, -0.7504916F, 0.0F, -0.0174533F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 525 */     Godzilla e = (Godzilla)entity;
/* 526 */     RenderInfo r = null;
/* 527 */     float newangle = 0.0F;
/* 528 */     float newangle2 = 0.0F;
/* 529 */     float pscale = 1.0F;
/*     */ 
/*     */     
/* 532 */     float pi4 = 0.7853982F;
/* 533 */     float clawZ = 6.0F;
/* 534 */     float clawY = 16.0F;
/* 535 */     float clawZamp = 35.0F * pscale;
/* 536 */     float clawYamp = 18.0F * pscale;
/* 537 */     float spikeamp = 1.0F;
/* 538 */     float spikefreq = 1.0F;
/*     */     
/* 540 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 541 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */     
/* 545 */     r = e.getRenderInfo();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 552 */     float t1 = 0.0F;
/* 553 */     float t2 = 0.0F;
/* 554 */     if (f1 > 0.001D) {
/* 555 */       newangle = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed / pscale);
/* 556 */       newangle2 = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed / pscale + pi4);
/* 557 */       t1 = MathHelper.func_76126_a(f2 * 0.75F * this.wingspeed / pscale);
/*     */     } else {
/* 559 */       newangle = newangle2 = 0.0F;
/* 560 */       t1 = 0.0F;
/* 561 */       t2 = 0.0F;
/*     */     } 
/* 563 */     if (t1 > 0.0F) {
/* 564 */       t2 = t1 * clawYamp * f1;
/* 565 */       this.LToe1.field_78797_d = clawY - t2;
/*     */     } else {
/* 567 */       this.LToe1.field_78797_d = clawY;
/*     */     } 
/*     */     
/* 570 */     this.LToe1.field_78798_e = clawZ + clawZamp * newangle * f1;
/* 571 */     this.LToe9.field_78798_e = this.LToe1.field_78798_e;
/* 572 */     this.LToe9.field_78797_d = this.LToe1.field_78797_d;
/*     */     
/* 574 */     this.LLowerLeg.field_78798_e = this.LToe1.field_78798_e;
/* 575 */     this.LLowerLeg.field_78797_d = this.LToe1.field_78797_d;
/* 576 */     this.LLowerLeg.field_78795_f = 0.22F + newangle * 3.1415927F * 0.09F * f1;
/*     */     
/* 578 */     this.LUpperLeg.field_78795_f = -0.17F + newangle2 * 3.1415927F * 0.15F * f1;
/* 579 */     this.LLowerLeg.field_78797_d -= (float)Math.cos(this.LLowerLeg.field_78795_f) * 55.0F;
/* 580 */     this.LLowerLeg.field_78798_e -= (float)Math.sin(this.LLowerLeg.field_78795_f) * 55.0F;
/*     */     
/* 582 */     this.LThigh.field_78795_f = -0.558F + newangle2 * 3.1415927F * 0.1F * f1;
/* 583 */     this.LThigh.field_78798_e = 2.0F + clawZamp * newangle * f1 / 4.0F;
/*     */     
/* 585 */     t1 = 0.0F;
/* 586 */     t2 = 0.0F;
/* 587 */     if (f1 > 0.001D) {
/* 588 */       newangle = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed / pscale + pi4 * 4.0F);
/* 589 */       newangle2 = MathHelper.func_76134_b(f2 * 0.75F * this.wingspeed / pscale + pi4 * 5.0F);
/* 590 */       t1 = MathHelper.func_76126_a(f2 * 0.75F * this.wingspeed / pscale + pi4 * 4.0F);
/*     */     } else {
/* 592 */       newangle = 0.0F;
/* 593 */       t1 = 0.0F;
/* 594 */       t2 = 0.0F;
/*     */     } 
/* 596 */     if (t1 > 0.0F) {
/* 597 */       t2 = t1 * clawYamp * f1;
/* 598 */       this.RToe1.field_78797_d = clawY - t2;
/*     */     } else {
/* 600 */       this.RToe1.field_78797_d = clawY;
/*     */     } 
/* 602 */     this.RToe1.field_78798_e = clawZ + clawZamp * newangle * f1;
/* 603 */     this.RToe9.field_78798_e = this.RToe1.field_78798_e;
/* 604 */     this.RToe9.field_78797_d = this.RToe1.field_78797_d;
/*     */     
/* 606 */     this.RLegLower.field_78798_e = this.RToe1.field_78798_e;
/* 607 */     this.RLegLower.field_78797_d = this.RToe1.field_78797_d;
/* 608 */     this.RLegLower.field_78795_f = 0.22F + newangle * 3.1415927F * 0.09F * f1;
/*     */ 
/*     */     
/* 611 */     this.RLegUpper.field_78795_f = -0.17F + newangle2 * 3.1415927F * 0.15F * f1;
/* 612 */     this.RLegLower.field_78797_d -= (float)Math.cos(this.RLegLower.field_78795_f) * 55.0F;
/* 613 */     this.RLegLower.field_78798_e -= (float)Math.sin(this.RLegLower.field_78795_f) * 55.0F;
/*     */     
/* 615 */     this.RThigh.field_78795_f = -0.558F + newangle2 * 3.1415927F * 0.1F * f1;
/* 616 */     this.RThigh.field_78798_e = 2.0F + clawZamp * newangle * f1 / 4.0F;
/*     */     
/* 618 */     this.LToe1.field_78795_f = 0.0F;
/* 619 */     this.RToe1.field_78795_f = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 626 */     if (e.getAttacking() != 0) {
/* 627 */       newangle = MathHelper.func_76134_b(f2 * this.wingspeed * 1.75F) * 3.1415927F * 0.2F;
/*     */     } else {
/* 629 */       newangle = MathHelper.func_76134_b(f2 * this.wingspeed * 0.75F) * 3.1415927F * 0.05F;
/*     */     } 
/* 631 */     doTail(newangle);
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
/* 665 */     newangle = (float)Math.toRadians(f3) * 0.55F;
/* 666 */     this.Head.field_78796_g = newangle;
/* 667 */     this.TopJaw.field_78796_g = newangle;
/* 668 */     this.LowerJaw.field_78796_g = newangle;
/* 669 */     this.Head.field_78798_e -= (float)Math.cos(this.Head.field_78796_g) * 11.0F;
/* 670 */     this.Head.field_78800_c -= (float)Math.sin(this.Head.field_78796_g) * 11.0F;
/*     */     
/* 672 */     this.Head.field_78795_f = (float)Math.toRadians(f4);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 678 */     newangle = MathHelper.func_76134_b(f2 * this.wingspeed * 1.5F) * 3.1415927F * 0.12F;
/* 679 */     float newrf1 = f2 * 1.5F * this.wingspeed % 6.2831855F;
/* 680 */     newrf1 = Math.abs(newrf1);
/*     */     
/* 682 */     if (newrf1 < r.rf2) {
/*     */       
/* 684 */       r.ri2 = 0;
/* 685 */       if (e.getAttacking() == 0)
/* 686 */       { if (e.field_70170_p.field_73012_v.nextInt(20) == 1) r.ri2 |= 0x1;
/*     */          }
/* 688 */       else if (e.field_70170_p.field_73012_v.nextInt(2) == 1) { r.ri2 |= 0x1; }
/*     */     
/*     */     } 
/* 691 */     r.rf2 = newrf1;
/* 692 */     if ((r.ri2 & 0x1) == 0) {
/* 693 */       newangle = 0.0F;
/*     */     }
/*     */ 
/*     */     
/* 697 */     this.LowerJaw.field_78795_f = 0.52F + newangle + this.TopJaw.field_78795_f;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 702 */     newangle = newangle2 = MathHelper.func_76126_a(f2 * this.wingspeed * 1.75F) * 3.1415927F * 0.16F;
/* 703 */     newrf1 = f2 * 1.75F * this.wingspeed % 6.2831855F;
/* 704 */     newrf1 = Math.abs(newrf1);
/*     */     
/* 706 */     if (newrf1 < r.rf1) {
/*     */       
/* 708 */       r.ri1 = 0;
/* 709 */       if (e.getAttacking() == 0) {
/* 710 */         if (e.field_70170_p.field_73012_v.nextInt(20) == 1) r.ri1 |= 0x1; 
/* 711 */         if (e.field_70170_p.field_73012_v.nextInt(20) == 1) r.ri1 |= 0x2; 
/*     */       } else {
/* 713 */         if (e.field_70170_p.field_73012_v.nextInt(2) == 1) r.ri1 |= 0x1; 
/* 714 */         if (e.field_70170_p.field_73012_v.nextInt(2) == 1) r.ri1 |= 0x2;
/*     */       
/*     */       } 
/*     */     } 
/* 718 */     r.rf1 = newrf1;
/*     */     
/* 720 */     if ((r.ri1 & 0x1) == 0) {
/* 721 */       newangle = 0.0F;
/*     */     }
/* 723 */     if ((r.ri1 & 0x2) == 0) {
/* 724 */       newangle2 = 0.0F;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 729 */     this.LUpperArm.field_78796_g = 0.65F + newangle;
/* 730 */     this.LLowerArm.field_78796_g = 0.78F + newangle * 3.0F / 2.0F;
/* 731 */     this.LUpperArm.field_78798_e -= (float)Math.sin(this.LUpperArm.field_78796_g) * 50.0F;
/* 732 */     this.LUpperArm.field_78800_c += (float)Math.cos(this.LUpperArm.field_78796_g) * 50.0F;
/* 733 */     this.LLowerArm.field_78797_d = this.LUpperArm.field_78797_d - (float)Math.sin(this.LUpperArm.field_78796_g) * 10.0F + 18.0F;
/*     */     
/* 735 */     this.LLowerArm.field_78798_e -= (float)Math.sin(this.LLowerArm.field_78796_g) * 45.0F;
/* 736 */     this.LLowerArm.field_78800_c += (float)Math.cos(this.LLowerArm.field_78796_g) * 45.0F;
/* 737 */     this.LHand.field_78797_d = this.LLowerArm.field_78797_d - (float)Math.sin(this.LLowerArm.field_78796_g) * 10.0F + 15.0F;
/*     */     
/* 739 */     this.L3rdFingerBase.field_78798_e = this.LHand.field_78798_e;
/* 740 */     this.L3rdFingerTip.field_78798_e = this.LHand.field_78798_e;
/* 741 */     this.L3rdFingerBase.field_78797_d = this.LHand.field_78797_d;
/* 742 */     this.L3rdFingerTip.field_78797_d = this.LHand.field_78797_d;
/* 743 */     this.L3rdFingerBase.field_78800_c = this.LHand.field_78800_c;
/* 744 */     this.L3rdFingerTip.field_78800_c = this.LHand.field_78800_c;
/*     */     
/* 746 */     this.LHand.field_78796_g = 1.308F + newangle * 2.0F;
/* 747 */     this.LIndexBase.field_78796_g = -0.139F + newangle * 2.0F;
/* 748 */     this.LIndexTip.field_78796_g = -0.034F + newangle * 2.0F;
/*     */     
/* 750 */     this.LThumbBase.field_78796_g = 0.261F + newangle;
/* 751 */     this.LThumbTip.field_78796_g = 0.139F + newangle;
/*     */     
/* 753 */     this.L3rdFingerBase.field_78796_g = -0.471F + newangle * 3.0F;
/* 754 */     this.L3rdFingerTip.field_78796_g = -0.331F + newangle * 3.0F;
/*     */ 
/*     */     
/* 757 */     this.RUpperArm.field_78796_g = -0.65F - newangle2;
/* 758 */     this.RLowerArm.field_78796_g = -0.78F - newangle2 * 3.0F / 2.0F;
/* 759 */     this.RUpperArm.field_78798_e += (float)Math.sin(this.RUpperArm.field_78796_g) * 50.0F;
/* 760 */     this.RUpperArm.field_78800_c -= (float)Math.cos(this.RUpperArm.field_78796_g) * 50.0F;
/* 761 */     this.RLowerArm.field_78797_d = this.RUpperArm.field_78797_d + (float)Math.sin(this.RUpperArm.field_78796_g) * 10.0F + 18.0F;
/*     */     
/* 763 */     this.RLowerArm.field_78798_e += (float)Math.sin(this.RLowerArm.field_78796_g) * 45.0F;
/* 764 */     this.RLowerArm.field_78800_c -= (float)Math.cos(this.RLowerArm.field_78796_g) * 45.0F;
/* 765 */     this.RHand.field_78797_d = this.RLowerArm.field_78797_d + (float)Math.sin(this.RLowerArm.field_78796_g) * 10.0F + 15.0F;
/*     */     
/* 767 */     this.R3rdFingerBase.field_78798_e = this.RHand.field_78798_e;
/* 768 */     this.R3rdFingerTip.field_78798_e = this.RHand.field_78798_e;
/* 769 */     this.R3rdFingerBase.field_78797_d = this.RHand.field_78797_d;
/* 770 */     this.R3rdFingerTip.field_78797_d = this.RHand.field_78797_d;
/* 771 */     this.R3rdFingerBase.field_78800_c = this.RHand.field_78800_c;
/* 772 */     this.R3rdFingerTip.field_78800_c = this.RHand.field_78800_c;
/*     */     
/* 774 */     this.RHand.field_78796_g = -2.0F - newangle2 * 2.0F;
/* 775 */     this.RIndexBase.field_78796_g = 0.157F - newangle2 * 2.0F;
/* 776 */     this.RIndexTip.field_78796_g = 0.174F - newangle2 * 2.0F;
/*     */     
/* 778 */     this.RThumbBase.field_78796_g = -0.104F - newangle2;
/* 779 */     this.RThumbTip.field_78796_g = 0.001F - newangle2;
/*     */     
/* 781 */     this.R3rdFingerTip.field_78796_g = 0.68F - newangle2 * 3.0F;
/* 782 */     this.R3rdFingerBase.field_78796_g = 0.645F - newangle2 * 3.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 787 */     e.setRenderInfo(r);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 792 */     this.LToe1.func_78785_a(f5);
/* 793 */     this.LToe3.func_78785_a(f5);
/* 794 */     this.LToe2.func_78785_a(f5);
/* 795 */     this.LToe9.func_78785_a(f5);
/* 796 */     this.LToe8.func_78785_a(f5);
/* 797 */     this.LToe7.func_78785_a(f5);
/* 798 */     this.LToe6.func_78785_a(f5);
/* 799 */     this.LToe5.func_78785_a(f5);
/* 800 */     this.LToe4.func_78785_a(f5);
/* 801 */     this.RToe9.func_78785_a(f5);
/* 802 */     this.RToe6.func_78785_a(f5);
/* 803 */     this.RToe5.func_78785_a(f5);
/* 804 */     this.RToe2.func_78785_a(f5);
/* 805 */     this.RToe1.func_78785_a(f5);
/* 806 */     this.RToe4.func_78785_a(f5);
/* 807 */     this.RToe7.func_78785_a(f5);
/* 808 */     this.RToe8.func_78785_a(f5);
/* 809 */     this.RToe3.func_78785_a(f5);
/* 810 */     this.LThigh.func_78785_a(f5);
/* 811 */     this.LLowerLeg.func_78785_a(f5);
/* 812 */     this.LUpperLeg.func_78785_a(f5);
/* 813 */     this.TailTip.func_78785_a(f5);
/* 814 */     this.RLegLower.func_78785_a(f5);
/* 815 */     this.RLegUpper.func_78785_a(f5);
/* 816 */     this.RThigh.func_78785_a(f5);
/* 817 */     this.LowerJaw.func_78785_a(f5);
/* 818 */     this.TailBase.func_78785_a(f5);
/* 819 */     this.Tail2.func_78785_a(f5);
/* 820 */     this.Tail3.func_78785_a(f5);
/* 821 */     this.Tail4.func_78785_a(f5);
/* 822 */     this.Tail5.func_78785_a(f5);
/* 823 */     this.Tail6.func_78785_a(f5);
/* 824 */     this.Tail7.func_78785_a(f5);
/* 825 */     this.BodyBottom.func_78785_a(f5);
/* 826 */     this.RLowerArm.func_78785_a(f5);
/* 827 */     this.BodyCenter.func_78785_a(f5);
/* 828 */     this.Neck.func_78785_a(f5);
/* 829 */     this.TopJaw.func_78785_a(f5);
/* 830 */     this.Head.func_78785_a(f5);
/* 831 */     this.BodyTop.func_78785_a(f5);
/* 832 */     this.RShoulder.func_78785_a(f5);
/* 833 */     this.RThumbTip.func_78785_a(f5);
/* 834 */     this.RUpperArm.func_78785_a(f5);
/* 835 */     this.RHand.func_78785_a(f5);
/* 836 */     this.RThumbBase.func_78785_a(f5);
/* 837 */     this.R3rdFingerTip.func_78785_a(f5);
/* 838 */     this.R3rdFingerBase.func_78785_a(f5);
/* 839 */     this.RIndexTip.func_78785_a(f5);
/* 840 */     this.RIndexBase.func_78785_a(f5);
/* 841 */     this.LShoulder.func_78785_a(f5);
/* 842 */     this.LUpperArm.func_78785_a(f5);
/* 843 */     this.LLowerArm.func_78785_a(f5);
/* 844 */     this.LIndexBase.func_78785_a(f5);
/* 845 */     this.LIndexTip.func_78785_a(f5);
/* 846 */     this.LHand.func_78785_a(f5);
/* 847 */     this.LThumbBase.func_78785_a(f5);
/* 848 */     this.LThumbTip.func_78785_a(f5);
/* 849 */     this.L3rdFingerTip.func_78785_a(f5);
/* 850 */     this.L3rdFingerBase.func_78785_a(f5);
/* 851 */     this.Lspikes1.func_78785_a(f5);
/* 852 */     this.Rspikes1.func_78785_a(f5);
/* 853 */     this.Lspike2.func_78785_a(f5);
/* 854 */     this.Rspike2.func_78785_a(f5);
/* 855 */     this.Lspike3.func_78785_a(f5);
/* 856 */     this.Rspike3.func_78785_a(f5);
/* 857 */     this.Lspike4.func_78785_a(f5);
/* 858 */     this.Rspike4.func_78785_a(f5);
/* 859 */     this.Lspike5.func_78785_a(f5);
/* 860 */     this.Rspike5.func_78785_a(f5);
/* 861 */     this.Spike6.func_78785_a(f5);
/* 862 */     this.Spikes7.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 868 */     model.field_78795_f = x;
/* 869 */     model.field_78796_g = y;
/* 870 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 875 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   private void doTail(float angle) {
/* 880 */     this.TailBase.field_78796_g = angle * 0.25F;
/* 881 */     this.Rspike5.field_78796_g = this.TailBase.field_78796_g;
/*     */     
/* 883 */     this.Tail2.field_78796_g = angle * 0.5F;
/* 884 */     this.TailBase.field_78798_e += (float)Math.cos(this.TailBase.field_78796_g) * 25.0F;
/* 885 */     this.TailBase.field_78800_c += (float)Math.sin(this.TailBase.field_78796_g) * 25.0F;
/* 886 */     this.Spike6.field_78796_g = this.Tail2.field_78796_g;
/* 887 */     this.Spike6.field_78798_e = this.Tail2.field_78798_e;
/* 888 */     this.Spike6.field_78800_c = this.Tail2.field_78800_c;
/*     */     
/* 890 */     this.Tail3.field_78796_g = angle * 0.75F;
/* 891 */     this.Tail2.field_78798_e += (float)Math.cos(this.Tail2.field_78796_g) * 20.0F;
/* 892 */     this.Tail2.field_78800_c += (float)Math.sin(this.Tail2.field_78796_g) * 20.0F;
/* 893 */     this.Spikes7.field_78796_g = this.Tail3.field_78796_g;
/* 894 */     this.Spikes7.field_78798_e = this.Tail3.field_78798_e;
/* 895 */     this.Spikes7.field_78800_c = this.Tail3.field_78800_c;
/*     */     
/* 897 */     this.Tail4.field_78796_g = angle * 1.25F;
/* 898 */     this.Tail3.field_78798_e += (float)Math.cos(this.Tail3.field_78796_g) * 20.0F;
/* 899 */     this.Tail3.field_78800_c += (float)Math.sin(this.Tail3.field_78796_g) * 20.0F;
/*     */     
/* 901 */     this.Tail5.field_78796_g = angle * 1.5F;
/* 902 */     this.Tail4.field_78798_e += (float)Math.cos(this.Tail4.field_78796_g) * 25.0F;
/* 903 */     this.Tail4.field_78800_c += (float)Math.sin(this.Tail4.field_78796_g) * 25.0F;
/*     */     
/* 905 */     this.Tail6.field_78796_g = angle * 1.75F;
/* 906 */     this.Tail5.field_78798_e += (float)Math.cos(this.Tail5.field_78796_g) * 27.0F;
/* 907 */     this.Tail5.field_78800_c += (float)Math.sin(this.Tail5.field_78796_g) * 27.0F;
/*     */     
/* 909 */     this.Tail7.field_78796_g = angle * 2.0F;
/* 910 */     this.Tail6.field_78798_e += (float)Math.cos(this.Tail6.field_78796_g) * 28.0F;
/* 911 */     this.Tail6.field_78800_c += (float)Math.sin(this.Tail6.field_78796_g) * 28.0F;
/*     */     
/* 913 */     this.TailTip.field_78796_g = angle * 2.25F;
/* 914 */     this.Tail7.field_78798_e += (float)Math.cos(this.Tail7.field_78796_g) * 18.0F;
/* 915 */     this.Tail7.field_78800_c += (float)Math.sin(this.Tail7.field_78796_g) * 18.0F;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelGodzilla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */