/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelRobot4
/*     */   extends ModelBase
/*     */ {
/*  12 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer leftfootfront;
/*     */   
/*     */   ModelRenderer leftfootbase;
/*     */   ModelRenderer leftfootback;
/*     */   ModelRenderer leftfoottip;
/*     */   ModelRenderer leftshin;
/*     */   ModelRenderer leftcalf;
/*     */   ModelRenderer leftkneegaurd;
/*     */   ModelRenderer leftthigh;
/*     */   ModelRenderer rightfootfront;
/*     */   ModelRenderer rightfoottip;
/*     */   ModelRenderer rightfootbase;
/*     */   ModelRenderer rightfootback;
/*     */   ModelRenderer rightshin;
/*     */   ModelRenderer rightcalf;
/*     */   ModelRenderer rightkneegaurd;
/*     */   ModelRenderer rightthigh;
/*     */   ModelRenderer hips;
/*     */   ModelRenderer stomach;
/*     */   ModelRenderer chest;
/*     */   ModelRenderer neck;
/*     */   ModelRenderer head;
/*     */   ModelRenderer righttopspinebase;
/*     */   ModelRenderer lefttopspinebase;
/*     */   ModelRenderer righttopspinetip;
/*     */   ModelRenderer lefttopspinetip;
/*     */   ModelRenderer middlerightspinebase;
/*     */   ModelRenderer middleleftspinebase;
/*     */   ModelRenderer middleleftspinetip;
/*     */   ModelRenderer middlerightspinetip;
/*     */   ModelRenderer torso;
/*     */   ModelRenderer rightsholder;
/*     */   ModelRenderer leftsholder;
/*     */   ModelRenderer rightsholdergaurd;
/*     */   ModelRenderer sheildbase;
/*     */   ModelRenderer sheildtip;
/*     */   ModelRenderer rightupperarm;
/*     */   ModelRenderer rightlowerarm;
/*     */   ModelRenderer sheildend;
/*     */   ModelRenderer leftupperarm;
/*     */   ModelRenderer sholdergaurdtip;
/*     */   ModelRenderer cannonbase;
/*     */   ModelRenderer cannonend;
/*     */   ModelRenderer leftcannonpiece;
/*     */   ModelRenderer topcannonpiece;
/*     */   ModelRenderer rightcannonpiece;
/*     */   ModelRenderer bottomcannonpiece;
/*     */   ModelRenderer glowycannonbit1;
/*     */   ModelRenderer glowycannonbit2;
/*     */   ModelRenderer glowycannonbit3;
/*     */   ModelRenderer glowycannonbit4;
/*     */   ModelRenderer glowycannonbit5;
/*     */   ModelRenderer cannonammo;
/*     */   ModelRenderer lowerrightspinebase;
/*     */   ModelRenderer lowerleftspinebase;
/*     */   ModelRenderer lowerrightspinetip;
/*     */   ModelRenderer lowerleftspinetip;
/*     */   
/*     */   public ModelRobot4(float f1) {
/*  73 */     this.wingspeed = f1;
/*     */     
/*  75 */     this.field_78090_t = 512;
/*  76 */     this.field_78089_u = 512;
/*     */     
/*  78 */     this.leftfootfront = new ModelRenderer(this, 20, 50);
/*  79 */     this.leftfootfront.func_78789_a(-6.0F, 22.0F, -9.0F, 8, 5, 7);
/*  80 */     this.leftfootfront.func_78793_a(-8.0F, -3.0F, 6.0F);
/*  81 */     this.leftfootfront.func_78787_b(512, 512);
/*  82 */     this.leftfootfront.field_78809_i = true;
/*  83 */     setRotation(this.leftfootfront, 0.0F, 0.0F, 0.0F);
/*  84 */     this.leftfootbase = new ModelRenderer(this, 20, 100);
/*  85 */     this.leftfootbase.func_78789_a(-4.0F, 22.0F, -4.0F, 4, 5, 5);
/*  86 */     this.leftfootbase.func_78793_a(-8.0F, -3.0F, 6.0F);
/*  87 */     this.leftfootbase.func_78787_b(512, 512);
/*  88 */     this.leftfootbase.field_78809_i = true;
/*  89 */     setRotation(this.leftfootbase, 0.0F, 0.0F, 0.0F);
/*  90 */     this.leftfootback = new ModelRenderer(this, 20, 150);
/*  91 */     this.leftfootback.func_78789_a(-4.5F, 22.0F, 1.0F, 5, 5, 4);
/*  92 */     this.leftfootback.func_78793_a(-8.0F, -3.0F, 6.0F);
/*  93 */     this.leftfootback.func_78787_b(512, 512);
/*  94 */     this.leftfootback.field_78809_i = true;
/*  95 */     setRotation(this.leftfootback, 0.0F, 0.0F, 0.0F);
/*  96 */     this.leftfoottip = new ModelRenderer(this, 20, 200);
/*  97 */     this.leftfoottip.func_78789_a(-4.5F, 23.0F, -12.0F, 5, 4, 3);
/*  98 */     this.leftfoottip.func_78793_a(-8.0F, -3.0F, 6.0F);
/*  99 */     this.leftfoottip.func_78787_b(512, 512);
/* 100 */     this.leftfoottip.field_78809_i = true;
/* 101 */     setRotation(this.leftfoottip, 0.0F, 0.0F, 0.0F);
/* 102 */     this.leftshin = new ModelRenderer(this, 20, 250);
/* 103 */     this.leftshin.func_78789_a(-5.0F, 10.0F, -9.0F, 6, 13, 6);
/* 104 */     this.leftshin.func_78793_a(-8.0F, -3.0F, 6.0F);
/* 105 */     this.leftshin.func_78787_b(512, 512);
/* 106 */     this.leftshin.field_78809_i = true;
/* 107 */     setRotation(this.leftshin, 0.1745329F, 0.0F, 0.0F);
/* 108 */     this.leftcalf = new ModelRenderer(this, 20, 300);
/* 109 */     this.leftcalf.func_78789_a(-6.0F, 10.0F, -9.0F, 8, 8, 9);
/* 110 */     this.leftcalf.func_78793_a(-8.0F, -3.0F, 6.0F);
/* 111 */     this.leftcalf.func_78787_b(512, 512);
/* 112 */     this.leftcalf.field_78809_i = true;
/* 113 */     setRotation(this.leftcalf, 0.1745329F, 0.0F, 0.0F);
/* 114 */     this.leftkneegaurd = new ModelRenderer(this, 20, 350);
/* 115 */     this.leftkneegaurd.func_78789_a(-5.5F, 4.0F, -14.0F, 7, 7, 1);
/* 116 */     this.leftkneegaurd.func_78793_a(-8.0F, -3.0F, 6.0F);
/* 117 */     this.leftkneegaurd.func_78787_b(512, 512);
/* 118 */     this.leftkneegaurd.field_78809_i = true;
/* 119 */     setRotation(this.leftkneegaurd, 0.6283185F, 0.0F, 0.0F);
/* 120 */     this.leftthigh = new ModelRenderer(this, 20, 400);
/* 121 */     this.leftthigh.func_78789_a(-5.0F, 0.0F, -4.0F, 6, 13, 8);
/* 122 */     this.leftthigh.func_78793_a(-8.0F, -3.0F, 6.0F);
/* 123 */     this.leftthigh.func_78787_b(512, 512);
/* 124 */     this.leftthigh.field_78809_i = true;
/* 125 */     setRotation(this.leftthigh, -0.1745329F, 0.1745329F, 0.0F);
/* 126 */     this.rightfootfront = new ModelRenderer(this, 20, 450);
/* 127 */     this.rightfootfront.func_78789_a(0.0F, 22.0F, -9.0F, 8, 5, 7);
/* 128 */     this.rightfootfront.func_78793_a(5.0F, -3.0F, 6.0F);
/* 129 */     this.rightfootfront.func_78787_b(512, 512);
/* 130 */     this.rightfootfront.field_78809_i = true;
/* 131 */     setRotation(this.rightfootfront, 0.0F, 0.0F, 0.0F);
/* 132 */     this.rightfoottip = new ModelRenderer(this, 100, 50);
/* 133 */     this.rightfoottip.func_78789_a(1.5F, 23.0F, -12.0F, 5, 4, 3);
/* 134 */     this.rightfoottip.func_78793_a(5.0F, -3.0F, 6.0F);
/* 135 */     this.rightfoottip.func_78787_b(512, 512);
/* 136 */     this.rightfoottip.field_78809_i = true;
/* 137 */     setRotation(this.rightfoottip, 0.0F, 0.0F, 0.0F);
/* 138 */     this.rightfootbase = new ModelRenderer(this, 100, 150);
/* 139 */     this.rightfootbase.func_78789_a(2.0F, 22.0F, -4.0F, 4, 5, 5);
/* 140 */     this.rightfootbase.func_78793_a(5.0F, -3.0F, 6.0F);
/* 141 */     this.rightfootbase.func_78787_b(512, 512);
/* 142 */     this.rightfootbase.field_78809_i = true;
/* 143 */     setRotation(this.rightfootbase, 0.0F, 0.0F, 0.0F);
/* 144 */     this.rightfootback = new ModelRenderer(this, 100, 100);
/* 145 */     this.rightfootback.func_78789_a(1.5F, 22.0F, 1.0F, 5, 5, 4);
/* 146 */     this.rightfootback.func_78793_a(5.0F, -3.0F, 6.0F);
/* 147 */     this.rightfootback.func_78787_b(512, 512);
/* 148 */     this.rightfootback.field_78809_i = true;
/* 149 */     setRotation(this.rightfootback, 0.0F, 0.0F, 0.0F);
/* 150 */     this.rightshin = new ModelRenderer(this, 100, 200);
/* 151 */     this.rightshin.func_78789_a(1.0F, 10.0F, -9.0F, 6, 13, 6);
/* 152 */     this.rightshin.func_78793_a(5.0F, -3.0F, 6.0F);
/* 153 */     this.rightshin.func_78787_b(512, 512);
/* 154 */     this.rightshin.field_78809_i = true;
/* 155 */     setRotation(this.rightshin, 0.1745329F, 0.0F, 0.0F);
/* 156 */     this.rightcalf = new ModelRenderer(this, 100, 250);
/* 157 */     this.rightcalf.func_78789_a(0.0F, 10.0F, -10.0F, 8, 8, 9);
/* 158 */     this.rightcalf.func_78793_a(5.0F, -3.0F, 6.0F);
/* 159 */     this.rightcalf.func_78787_b(512, 512);
/* 160 */     this.rightcalf.field_78809_i = true;
/* 161 */     setRotation(this.rightcalf, 0.1745329F, 0.0F, 0.0F);
/* 162 */     this.rightkneegaurd = new ModelRenderer(this, 100, 300);
/* 163 */     this.rightkneegaurd.func_78789_a(0.5F, 4.0F, -15.0F, 7, 7, 1);
/* 164 */     this.rightkneegaurd.func_78793_a(5.0F, -3.0F, 6.0F);
/* 165 */     this.rightkneegaurd.func_78787_b(512, 512);
/* 166 */     this.rightkneegaurd.field_78809_i = true;
/* 167 */     setRotation(this.rightkneegaurd, 0.6283185F, 0.0F, 0.0F);
/* 168 */     this.rightthigh = new ModelRenderer(this, 100, 400);
/* 169 */     this.rightthigh.func_78789_a(0.0F, 0.0F, -5.0F, 6, 13, 8);
/* 170 */     this.rightthigh.func_78793_a(5.0F, -3.0F, 6.0F);
/* 171 */     this.rightthigh.func_78787_b(512, 512);
/* 172 */     this.rightthigh.field_78809_i = true;
/* 173 */     setRotation(this.rightthigh, -0.1745329F, -0.1745329F, 0.0F);
/* 174 */     this.rightthigh.field_78809_i = false;
/* 175 */     this.hips = new ModelRenderer(this, 100, 350);
/* 176 */     this.hips.func_78789_a(0.0F, 0.0F, 0.0F, 14, 7, 8);
/* 177 */     this.hips.func_78793_a(-8.0F, -3.0F, 2.0F);
/* 178 */     this.hips.func_78787_b(512, 512);
/* 179 */     this.hips.field_78809_i = true;
/* 180 */     setRotation(this.hips, 0.1396263F, 0.0F, 0.0F);
/* 181 */     this.stomach = new ModelRenderer(this, 100, 450);
/* 182 */     this.stomach.func_78789_a(0.0F, 0.0F, 0.0F, 12, 6, 7);
/* 183 */     this.stomach.func_78793_a(-7.0F, -9.0F, 2.0F);
/* 184 */     this.stomach.func_78787_b(512, 512);
/* 185 */     this.stomach.field_78809_i = true;
/* 186 */     setRotation(this.stomach, 0.1396263F, 0.0F, 0.0F);
/* 187 */     this.chest = new ModelRenderer(this, 200, 50);
/* 188 */     this.chest.func_78789_a(0.0F, 0.0F, 0.0F, 18, 12, 13);
/* 189 */     this.chest.func_78793_a(-10.0F, -23.0F, -4.0F);
/* 190 */     this.chest.func_78787_b(512, 512);
/* 191 */     this.chest.field_78809_i = true;
/* 192 */     setRotation(this.chest, 0.2443461F, 0.0F, 0.0F);
/* 193 */     this.neck = new ModelRenderer(this, 200, 100);
/* 194 */     this.neck.func_78789_a(0.0F, 0.0F, 0.0F, 6, 7, 6);
/* 195 */     this.neck.func_78793_a(-4.0F, -22.0F, -7.0F);
/* 196 */     this.neck.func_78787_b(512, 512);
/* 197 */     this.neck.field_78809_i = true;
/* 198 */     setRotation(this.neck, 0.8726646F, 0.0F, 0.0F);
/* 199 */     this.head = new ModelRenderer(this, 200, 150);
/* 200 */     this.head.func_78789_a(-3.0F, -3.0F, -5.0F, 6, 6, 8);
/* 201 */     this.head.func_78793_a(-1.0F, -26.0F, -5.0F);
/* 202 */     this.head.func_78787_b(512, 512);
/* 203 */     this.head.field_78809_i = true;
/* 204 */     setRotation(this.head, 0.5235988F, 0.0F, 0.0F);
/* 205 */     this.righttopspinebase = new ModelRenderer(this, 200, 200);
/* 206 */     this.righttopspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/* 207 */     this.righttopspinebase.func_78793_a(3.0F, -29.0F, 5.0F);
/* 208 */     this.righttopspinebase.func_78787_b(512, 512);
/* 209 */     this.righttopspinebase.field_78809_i = true;
/* 210 */     setRotation(this.righttopspinebase, -0.1396263F, 0.0F, 0.0F);
/* 211 */     this.lefttopspinebase = new ModelRenderer(this, 200, 250);
/* 212 */     this.lefttopspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/* 213 */     this.lefttopspinebase.func_78793_a(-7.0F, -29.0F, 5.0F);
/* 214 */     this.lefttopspinebase.func_78787_b(512, 512);
/* 215 */     this.lefttopspinebase.field_78809_i = true;
/* 216 */     setRotation(this.lefttopspinebase, -0.1396263F, 0.0F, 0.0F);
/* 217 */     this.righttopspinetip = new ModelRenderer(this, 200, 300);
/* 218 */     this.righttopspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/* 219 */     this.righttopspinetip.func_78793_a(3.5F, -35.0F, 8.0F);
/* 220 */     this.righttopspinetip.func_78787_b(512, 512);
/* 221 */     this.righttopspinetip.field_78809_i = true;
/* 222 */     setRotation(this.righttopspinetip, -0.3316126F, 0.0F, 0.0F);
/* 223 */     this.lefttopspinetip = new ModelRenderer(this, 200, 350);
/* 224 */     this.lefttopspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
/* 225 */     this.lefttopspinetip.func_78793_a(-6.5F, -35.0F, 8.0F);
/* 226 */     this.lefttopspinetip.func_78787_b(512, 512);
/* 227 */     this.lefttopspinetip.field_78809_i = true;
/* 228 */     setRotation(this.lefttopspinetip, -0.3316126F, 0.0F, 0.0F);
/* 229 */     this.middlerightspinebase = new ModelRenderer(this, 200, 400);
/* 230 */     this.middlerightspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/* 231 */     this.middlerightspinebase.func_78793_a(-6.0F, -25.0F, 14.0F);
/* 232 */     this.middlerightspinebase.func_78787_b(512, 512);
/* 233 */     this.middlerightspinebase.field_78809_i = true;
/* 234 */     setRotation(this.middlerightspinebase, -0.6981317F, 0.0F, 0.0F);
/* 235 */     this.middleleftspinebase = new ModelRenderer(this, 200, 450);
/* 236 */     this.middleleftspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/* 237 */     this.middleleftspinebase.func_78793_a(2.0F, -25.0F, 14.0F);
/* 238 */     this.middleleftspinebase.func_78787_b(512, 512);
/* 239 */     this.middleleftspinebase.field_78809_i = true;
/* 240 */     setRotation(this.middleleftspinebase, -0.6981317F, 0.0F, 0.0F);
/* 241 */     this.middleleftspinetip = new ModelRenderer(this, 300, 50);
/* 242 */     this.middleleftspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/* 243 */     this.middleleftspinetip.func_78793_a(2.5F, -28.0F, 18.0F);
/* 244 */     this.middleleftspinetip.func_78787_b(512, 512);
/* 245 */     this.middleleftspinetip.field_78809_i = true;
/* 246 */     setRotation(this.middleleftspinetip, -0.7853982F, 0.0F, 0.0F);
/* 247 */     this.middlerightspinetip = new ModelRenderer(this, 300, 100);
/* 248 */     this.middlerightspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/* 249 */     this.middlerightspinetip.func_78793_a(-5.5F, -28.0F, 18.0F);
/* 250 */     this.middlerightspinetip.func_78787_b(512, 512);
/* 251 */     this.middlerightspinetip.field_78809_i = true;
/* 252 */     setRotation(this.middlerightspinetip, -0.7853982F, 0.0F, 0.0F);
/* 253 */     this.torso = new ModelRenderer(this, 300, 150);
/* 254 */     this.torso.func_78789_a(0.0F, 0.0F, 0.0F, 14, 6, 10);
/* 255 */     this.torso.func_78793_a(-8.0F, -13.0F, 0.0F);
/* 256 */     this.torso.func_78787_b(512, 512);
/* 257 */     this.torso.field_78809_i = true;
/* 258 */     setRotation(this.torso, 0.1396263F, 0.0F, 0.0F);
/* 259 */     this.rightsholder = new ModelRenderer(this, 300, 200);
/* 260 */     this.rightsholder.func_78789_a(0.0F, -3.0F, -3.0F, 6, 6, 6);
/* 261 */     this.rightsholder.func_78793_a(7.0F, -18.0F, 4.0F);
/* 262 */     this.rightsholder.func_78787_b(512, 512);
/* 263 */     this.rightsholder.field_78809_i = true;
/* 264 */     setRotation(this.rightsholder, 0.0F, 0.0F, 0.0F);
/* 265 */     this.leftsholder = new ModelRenderer(this, 300, 250);
/* 266 */     this.leftsholder.func_78789_a(-6.0F, -3.0F, -3.0F, 6, 6, 6);
/* 267 */     this.leftsholder.func_78793_a(-9.0F, -18.0F, 4.0F);
/* 268 */     this.leftsholder.func_78787_b(512, 512);
/* 269 */     this.leftsholder.field_78809_i = true;
/* 270 */     setRotation(this.leftsholder, 0.0F, 0.0F, 0.0F);
/* 271 */     this.rightsholdergaurd = new ModelRenderer(this, 300, 300);
/* 272 */     this.rightsholdergaurd.func_78789_a(8.0F, -4.0F, -4.0F, 4, 12, 9);
/* 273 */     this.rightsholdergaurd.func_78793_a(7.0F, -18.0F, 4.0F);
/* 274 */     this.rightsholdergaurd.func_78787_b(512, 512);
/* 275 */     this.rightsholdergaurd.field_78809_i = true;
/* 276 */     setRotation(this.rightsholdergaurd, -0.2094395F, 0.0F, 0.0F);
/* 277 */     this.sheildbase = new ModelRenderer(this, 300, 350);
/* 278 */     this.sheildbase.func_78789_a(8.0F, -4.0F, -30.0F, 3, 12, 19);
/* 279 */     this.sheildbase.func_78793_a(7.0F, -18.0F, 4.0F);
/* 280 */     this.sheildbase.func_78787_b(512, 512);
/* 281 */     this.sheildbase.field_78809_i = true;
/* 282 */     setRotation(this.sheildbase, 1.047198F, 0.0F, 0.0F);
/* 283 */     this.sheildtip = new ModelRenderer(this, 300, 400);
/* 284 */     this.sheildtip.func_78789_a(9.0F, -2.0F, -34.0F, 3, 8, 4);
/* 285 */     this.sheildtip.func_78793_a(6.0F, -18.0F, 4.0F);
/* 286 */     this.sheildtip.func_78787_b(512, 512);
/* 287 */     this.sheildtip.field_78809_i = true;
/* 288 */     setRotation(this.sheildtip, 1.047198F, 0.0F, 0.0F);
/* 289 */     this.rightupperarm = new ModelRenderer(this, 300, 450);
/* 290 */     this.rightupperarm.func_78789_a(3.0F, -1.0F, -4.0F, 6, 13, 6);
/* 291 */     this.rightupperarm.func_78793_a(7.0F, -18.0F, 4.0F);
/* 292 */     this.rightupperarm.func_78787_b(512, 512);
/* 293 */     this.rightupperarm.field_78809_i = true;
/* 294 */     setRotation(this.rightupperarm, -0.2094395F, 0.0F, 0.0F);
/* 295 */     this.rightlowerarm = new ModelRenderer(this, 350, 50);
/* 296 */     this.rightlowerarm.func_78789_a(3.0F, 0.0F, -25.0F, 6, 6, 14);
/* 297 */     this.rightlowerarm.func_78793_a(7.0F, -18.0F, 4.0F);
/* 298 */     this.rightlowerarm.func_78787_b(512, 512);
/* 299 */     this.rightlowerarm.field_78809_i = true;
/* 300 */     setRotation(this.rightlowerarm, 1.047198F, 0.0F, 0.0F);
/* 301 */     this.sheildend = new ModelRenderer(this, 350, 100);
/* 302 */     this.sheildend.func_78789_a(8.0F, -1.0F, -11.0F, 3, 8, 4);
/* 303 */     this.sheildend.func_78793_a(7.0F, -18.0F, 4.0F);
/* 304 */     this.sheildend.func_78787_b(512, 512);
/* 305 */     this.sheildend.field_78809_i = true;
/* 306 */     setRotation(this.sheildend, 1.047198F, 0.0F, 0.0F);
/* 307 */     this.leftupperarm = new ModelRenderer(this, 350, 200);
/* 308 */     this.leftupperarm.func_78789_a(-9.0F, -1.0F, -4.0F, 6, 15, 6);
/* 309 */     this.leftupperarm.func_78793_a(-9.0F, -18.0F, 4.0F);
/* 310 */     this.leftupperarm.func_78787_b(512, 512);
/* 311 */     this.leftupperarm.field_78809_i = true;
/* 312 */     setRotation(this.leftupperarm, -0.2094395F, 0.0F, 0.0F);
/* 313 */     this.sholdergaurdtip = new ModelRenderer(this, 350, 250);
/* 314 */     this.sholdergaurdtip.func_78789_a(10.0F, -3.0F, -7.0F, 2, 5, 3);
/* 315 */     this.sholdergaurdtip.func_78793_a(7.0F, -18.0F, 4.0F);
/* 316 */     this.sholdergaurdtip.func_78787_b(512, 512);
/* 317 */     this.sholdergaurdtip.field_78809_i = true;
/* 318 */     setRotation(this.sholdergaurdtip, -0.2094395F, 0.0F, 0.0F);
/* 319 */     this.cannonbase = new ModelRenderer(this, 350, 300);
/* 320 */     this.cannonbase.func_78789_a(-4.0F, 0.0F, -4.0F, 8, 12, 8);
/* 321 */     this.cannonbase.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 322 */     this.cannonbase.func_78787_b(512, 512);
/* 323 */     this.cannonbase.field_78809_i = true;
/* 324 */     setRotation(this.cannonbase, -0.6981317F, 0.0F, 0.0F);
/* 325 */     this.cannonend = new ModelRenderer(this, 350, 400);
/* 326 */     this.cannonend.func_78789_a(-3.0F, 11.0F, -3.0F, 6, 4, 6);
/* 327 */     this.cannonend.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 328 */     this.cannonend.func_78787_b(512, 512);
/* 329 */     this.cannonend.field_78809_i = true;
/* 330 */     setRotation(this.cannonend, -0.6981317F, 0.0F, 0.0F);
/* 331 */     this.leftcannonpiece = new ModelRenderer(this, 20, 20);
/* 332 */     this.leftcannonpiece.func_78789_a(-5.0F, 11.0F, -1.5F, 3, 6, 3);
/* 333 */     this.leftcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 334 */     this.leftcannonpiece.func_78787_b(512, 512);
/* 335 */     this.leftcannonpiece.field_78809_i = true;
/* 336 */     setRotation(this.leftcannonpiece, -0.6981317F, 0.0F, 0.0F);
/* 337 */     this.topcannonpiece = new ModelRenderer(this, 40, 20);
/* 338 */     this.topcannonpiece.func_78789_a(-1.5F, 11.0F, -5.0F, 3, 6, 3);
/* 339 */     this.topcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 340 */     this.topcannonpiece.func_78787_b(512, 512);
/* 341 */     this.topcannonpiece.field_78809_i = true;
/* 342 */     setRotation(this.topcannonpiece, -0.6981317F, 0.0F, 0.0F);
/* 343 */     this.rightcannonpiece = new ModelRenderer(this, 80, 20);
/* 344 */     this.rightcannonpiece.func_78789_a(2.0F, 11.0F, -1.5F, 3, 6, 3);
/* 345 */     this.rightcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 346 */     this.rightcannonpiece.func_78787_b(512, 512);
/* 347 */     this.rightcannonpiece.field_78809_i = true;
/* 348 */     setRotation(this.rightcannonpiece, -0.6981317F, 0.0F, 0.0F);
/* 349 */     this.bottomcannonpiece = new ModelRenderer(this, 100, 20);
/* 350 */     this.bottomcannonpiece.func_78789_a(-1.5F, 11.0F, 2.0F, 3, 6, 3);
/* 351 */     this.bottomcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 352 */     this.bottomcannonpiece.func_78787_b(512, 512);
/* 353 */     this.bottomcannonpiece.field_78809_i = true;
/* 354 */     setRotation(this.bottomcannonpiece, -0.6981317F, 0.0F, 0.0F);
/* 355 */     this.glowycannonbit1 = new ModelRenderer(this, 150, 20);
/* 356 */     this.glowycannonbit1.func_78789_a(-3.5F, 0.0F, -11.0F, 2, 5, 2);
/* 357 */     this.glowycannonbit1.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 358 */     this.glowycannonbit1.func_78787_b(512, 512);
/* 359 */     this.glowycannonbit1.field_78809_i = true;
/* 360 */     setRotation(this.glowycannonbit1, 0.1745329F, 0.0F, 0.0F);
/* 361 */     this.glowycannonbit2 = new ModelRenderer(this, 200, 20);
/* 362 */     this.glowycannonbit2.func_78789_a(1.5F, 0.0F, -11.0F, 2, 5, 2);
/* 363 */     this.glowycannonbit2.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 364 */     this.glowycannonbit2.func_78787_b(512, 512);
/* 365 */     this.glowycannonbit2.field_78809_i = true;
/* 366 */     setRotation(this.glowycannonbit2, 0.1745329F, 0.0F, 0.0F);
/* 367 */     this.glowycannonbit3 = new ModelRenderer(this, 250, 20);
/* 368 */     this.glowycannonbit3.func_78789_a(-3.0F, -2.0F, -8.0F, 2, 5, 2);
/* 369 */     this.glowycannonbit3.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 370 */     this.glowycannonbit3.func_78787_b(512, 512);
/* 371 */     this.glowycannonbit3.field_78809_i = true;
/* 372 */     setRotation(this.glowycannonbit3, 0.0872665F, 0.0F, 0.0F);
/* 373 */     this.glowycannonbit4 = new ModelRenderer(this, 300, 20);
/* 374 */     this.glowycannonbit4.func_78789_a(1.0F, -2.0F, -8.0F, 2, 5, 2);
/* 375 */     this.glowycannonbit4.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 376 */     this.glowycannonbit4.func_78787_b(512, 512);
/* 377 */     this.glowycannonbit4.field_78809_i = true;
/* 378 */     setRotation(this.glowycannonbit4, 0.0872665F, 0.0F, 0.0F);
/* 379 */     this.glowycannonbit5 = new ModelRenderer(this, 350, 20);
/* 380 */     this.glowycannonbit5.func_78789_a(-1.0F, -5.0F, -5.0F, 2, 5, 2);
/* 381 */     this.glowycannonbit5.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 382 */     this.glowycannonbit5.func_78787_b(512, 512);
/* 383 */     this.glowycannonbit5.field_78809_i = true;
/* 384 */     setRotation(this.glowycannonbit5, 0.0F, 0.0F, 0.0F);
/* 385 */     this.cannonammo = new ModelRenderer(this, 400, 400);
/* 386 */     this.cannonammo.func_78789_a(-6.0F, 3.0F, 0.0F, 5, 5, 5);
/* 387 */     this.cannonammo.func_78793_a(-15.0F, -5.0F, 1.0F);
/* 388 */     this.cannonammo.func_78787_b(512, 512);
/* 389 */     this.cannonammo.field_78809_i = true;
/* 390 */     setRotation(this.cannonammo, -0.6981317F, 0.0F, 0.0F);
/* 391 */     this.lowerrightspinebase = new ModelRenderer(this, 400, 450);
/* 392 */     this.lowerrightspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/* 393 */     this.lowerrightspinebase.func_78793_a(4.0F, -19.0F, 15.0F);
/* 394 */     this.lowerrightspinebase.func_78787_b(512, 512);
/* 395 */     this.lowerrightspinebase.field_78809_i = true;
/* 396 */     setRotation(this.lowerrightspinebase, -1.047198F, 0.0F, 0.0F);
/* 397 */     this.lowerleftspinebase = new ModelRenderer(this, 360, 450);
/* 398 */     this.lowerleftspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/* 399 */     this.lowerleftspinebase.func_78793_a(-8.0F, -19.0F, 15.0F);
/* 400 */     this.lowerleftspinebase.func_78787_b(512, 512);
/* 401 */     this.lowerleftspinebase.field_78809_i = true;
/* 402 */     setRotation(this.lowerleftspinebase, -1.047198F, 0.0F, 0.0F);
/* 403 */     this.lowerrightspinetip = new ModelRenderer(this, 250, 100);
/* 404 */     this.lowerrightspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/* 405 */     this.lowerrightspinetip.func_78793_a(4.5F, -21.0F, 20.0F);
/* 406 */     this.lowerrightspinetip.func_78787_b(512, 512);
/* 407 */     this.lowerrightspinetip.field_78809_i = true;
/* 408 */     setRotation(this.lowerrightspinetip, -1.134464F, 0.0F, 0.0F);
/* 409 */     this.lowerleftspinetip = new ModelRenderer(this, 150, 100);
/* 410 */     this.lowerleftspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/* 411 */     this.lowerleftspinetip.func_78793_a(-7.5F, -21.0F, 20.0F);
/* 412 */     this.lowerleftspinetip.func_78787_b(512, 512);
/* 413 */     this.lowerleftspinetip.field_78809_i = true;
/* 414 */     setRotation(this.lowerleftspinetip, -1.134464F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 421 */     Robot4 e = (Robot4)entity;
/* 422 */     float newangle = 0.0F;
/* 423 */     float nextangle = 0.0F;
/* 424 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 425 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 428 */     if (f1 > 0.1D) {
/* 429 */       newangle = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/*     */     } else {
/* 431 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 434 */     this.leftfootfront.field_78795_f = newangle;
/* 435 */     this.leftfootbase.field_78795_f = newangle;
/* 436 */     this.leftfootback.field_78795_f = newangle;
/* 437 */     this.leftfoottip.field_78795_f = newangle;
/* 438 */     this.leftshin.field_78795_f = newangle;
/* 439 */     this.leftcalf.field_78795_f = newangle + 0.175F;
/* 440 */     this.leftkneegaurd.field_78795_f = newangle + 0.63F;
/* 441 */     this.leftthigh.field_78795_f = newangle - 0.175F;
/* 442 */     this.rightfootfront.field_78795_f = -newangle;
/* 443 */     this.rightfoottip.field_78795_f = -newangle;
/* 444 */     this.rightfootbase.field_78795_f = -newangle;
/* 445 */     this.rightfootback.field_78795_f = -newangle;
/* 446 */     this.rightshin.field_78795_f = -newangle;
/* 447 */     this.rightcalf.field_78795_f = -newangle + 0.175F;
/* 448 */     this.rightkneegaurd.field_78795_f = -newangle + 0.63F;
/* 449 */     this.rightthigh.field_78795_f = -newangle - 0.175F;
/*     */     
/* 451 */     this.head.field_78796_g = (float)Math.toRadians(f3 / 1.5D);
/*     */     
/* 453 */     float amp = 0.7853982F;
/* 454 */     if (e.getAttacking() != 0) {
/* 455 */       newangle = MathHelper.func_76134_b((float)Math.toRadians((f2 % 360.0F)) * this.wingspeed * 6.0F) * amp;
/* 456 */       newangle = Math.abs(newangle);
/* 457 */       newangle += 0.75F;
/*     */     } else {
/* 459 */       newangle = 0.0F;
/*     */     } 
/*     */ 
/*     */     
/* 463 */     if (newangle > amp / 3.0D) {
/*     */ 
/*     */       
/* 466 */       e.setShielding(1);
/*     */     } else {
/* 468 */       e.setShielding(0);
/*     */     } 
/*     */     
/* 471 */     this.rightsholder.field_78795_f = -newangle;
/* 472 */     this.rightsholdergaurd.field_78795_f = -newangle - 0.21F;
/* 473 */     this.sheildbase.field_78795_f = -newangle + 1.047F;
/* 474 */     this.sheildtip.field_78795_f = -newangle + 1.047F;
/* 475 */     this.rightupperarm.field_78795_f = -newangle - 0.21F;
/* 476 */     this.rightlowerarm.field_78795_f = -newangle + 1.047F;
/* 477 */     this.sheildend.field_78795_f = -newangle + 1.04F;
/* 478 */     this.sholdergaurdtip.field_78795_f = -newangle - 0.21F;
/*     */     
/* 480 */     if (e.getAttacking() != 0) {
/* 481 */       newangle = 0.85F;
/*     */     } else {
/* 483 */       newangle = 0.0F;
/*     */     } 
/* 485 */     this.leftsholder.field_78795_f = -newangle;
/* 486 */     this.leftupperarm.field_78795_f = -newangle - 0.21F;
/*     */     
/* 488 */     this.cannonbase.field_78795_f = -newangle - 0.7F;
/* 489 */     this.cannonend.field_78795_f = -newangle - 0.7F;
/* 490 */     this.leftcannonpiece.field_78795_f = -newangle - 0.7F;
/* 491 */     this.topcannonpiece.field_78795_f = -newangle - 0.7F;
/* 492 */     this.rightcannonpiece.field_78795_f = -newangle - 0.7F;
/* 493 */     this.bottomcannonpiece.field_78795_f = -newangle - 0.7F;
/* 494 */     this.glowycannonbit1.field_78795_f = -newangle + 0.17F;
/* 495 */     this.glowycannonbit2.field_78795_f = -newangle + 0.17F;
/* 496 */     this.glowycannonbit3.field_78795_f = -newangle + 0.08F;
/* 497 */     this.glowycannonbit4.field_78795_f = -newangle + 0.08F;
/* 498 */     this.glowycannonbit5.field_78795_f = -newangle;
/* 499 */     this.cannonammo.field_78795_f = -newangle - 0.7F;
/*     */ 
/*     */     
/* 502 */     double newposy = (float)(this.leftsholder.field_78797_d + Math.cos(this.leftupperarm.field_78795_f) * 14.0D);
/* 503 */     double newposz = (float)(this.leftsholder.field_78798_e + Math.sin(this.leftupperarm.field_78795_f) * 14.0D);
/* 504 */     this.cannonbase.field_78797_d = (float)newposy;
/* 505 */     this.cannonbase.field_78798_e = (float)newposz;
/* 506 */     this.cannonend.field_78797_d = (float)newposy;
/* 507 */     this.cannonend.field_78798_e = (float)newposz;
/* 508 */     this.leftcannonpiece.field_78797_d = (float)newposy;
/* 509 */     this.leftcannonpiece.field_78798_e = (float)newposz;
/* 510 */     this.topcannonpiece.field_78797_d = (float)newposy;
/* 511 */     this.topcannonpiece.field_78798_e = (float)newposz;
/* 512 */     this.rightcannonpiece.field_78797_d = (float)newposy;
/* 513 */     this.rightcannonpiece.field_78798_e = (float)newposz;
/* 514 */     this.bottomcannonpiece.field_78797_d = (float)newposy;
/* 515 */     this.bottomcannonpiece.field_78798_e = (float)newposz;
/* 516 */     this.glowycannonbit1.field_78797_d = (float)newposy;
/* 517 */     this.glowycannonbit1.field_78798_e = (float)newposz;
/* 518 */     this.glowycannonbit2.field_78797_d = (float)newposy;
/* 519 */     this.glowycannonbit2.field_78798_e = (float)newposz;
/* 520 */     this.glowycannonbit3.field_78797_d = (float)newposy;
/* 521 */     this.glowycannonbit3.field_78798_e = (float)newposz;
/* 522 */     this.glowycannonbit4.field_78797_d = (float)newposy;
/* 523 */     this.glowycannonbit4.field_78798_e = (float)newposz;
/* 524 */     this.glowycannonbit5.field_78797_d = (float)newposy;
/* 525 */     this.glowycannonbit5.field_78798_e = (float)newposz;
/* 526 */     this.cannonammo.field_78797_d = (float)newposy;
/* 527 */     this.cannonammo.field_78798_e = (float)newposz;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 532 */     this.leftfootfront.func_78785_a(f5);
/* 533 */     this.leftfootbase.func_78785_a(f5);
/* 534 */     this.leftfootback.func_78785_a(f5);
/* 535 */     this.leftfoottip.func_78785_a(f5);
/* 536 */     this.leftshin.func_78785_a(f5);
/* 537 */     this.leftcalf.func_78785_a(f5);
/* 538 */     this.leftkneegaurd.func_78785_a(f5);
/* 539 */     this.leftthigh.func_78785_a(f5);
/* 540 */     this.rightfootfront.func_78785_a(f5);
/* 541 */     this.rightfoottip.func_78785_a(f5);
/* 542 */     this.rightfootbase.func_78785_a(f5);
/* 543 */     this.rightfootback.func_78785_a(f5);
/* 544 */     this.rightshin.func_78785_a(f5);
/* 545 */     this.rightcalf.func_78785_a(f5);
/* 546 */     this.rightkneegaurd.func_78785_a(f5);
/* 547 */     this.rightthigh.func_78785_a(f5);
/* 548 */     this.hips.func_78785_a(f5);
/* 549 */     this.stomach.func_78785_a(f5);
/* 550 */     this.chest.func_78785_a(f5);
/* 551 */     this.neck.func_78785_a(f5);
/* 552 */     this.head.func_78785_a(f5);
/* 553 */     this.righttopspinebase.func_78785_a(f5);
/* 554 */     this.lefttopspinebase.func_78785_a(f5);
/* 555 */     this.righttopspinetip.func_78785_a(f5);
/* 556 */     this.lefttopspinetip.func_78785_a(f5);
/* 557 */     this.middlerightspinebase.func_78785_a(f5);
/* 558 */     this.middleleftspinebase.func_78785_a(f5);
/* 559 */     this.middleleftspinetip.func_78785_a(f5);
/* 560 */     this.middlerightspinetip.func_78785_a(f5);
/* 561 */     this.torso.func_78785_a(f5);
/* 562 */     this.rightsholder.func_78785_a(f5);
/* 563 */     this.leftsholder.func_78785_a(f5);
/* 564 */     this.rightsholdergaurd.func_78785_a(f5);
/* 565 */     this.sheildbase.func_78785_a(f5);
/* 566 */     this.sheildtip.func_78785_a(f5);
/* 567 */     this.rightupperarm.func_78785_a(f5);
/* 568 */     this.rightlowerarm.func_78785_a(f5);
/* 569 */     this.sheildend.func_78785_a(f5);
/* 570 */     this.leftupperarm.func_78785_a(f5);
/* 571 */     this.sholdergaurdtip.func_78785_a(f5);
/* 572 */     this.cannonbase.func_78785_a(f5);
/* 573 */     this.cannonend.func_78785_a(f5);
/* 574 */     this.leftcannonpiece.func_78785_a(f5);
/* 575 */     this.topcannonpiece.func_78785_a(f5);
/* 576 */     this.rightcannonpiece.func_78785_a(f5);
/* 577 */     this.bottomcannonpiece.func_78785_a(f5);
/* 578 */     this.glowycannonbit1.func_78785_a(f5);
/* 579 */     this.glowycannonbit2.func_78785_a(f5);
/* 580 */     this.glowycannonbit3.func_78785_a(f5);
/* 581 */     this.glowycannonbit4.func_78785_a(f5);
/* 582 */     this.glowycannonbit5.func_78785_a(f5);
/* 583 */     this.cannonammo.func_78785_a(f5);
/* 584 */     this.lowerrightspinebase.func_78785_a(f5);
/* 585 */     this.lowerleftspinebase.func_78785_a(f5);
/* 586 */     this.lowerrightspinetip.func_78785_a(f5);
/* 587 */     this.lowerleftspinetip.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 593 */     model.field_78795_f = x;
/* 594 */     model.field_78796_g = y;
/* 595 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 600 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelRobot4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */