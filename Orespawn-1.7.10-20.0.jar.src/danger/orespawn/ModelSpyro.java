/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelSpyro
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer RightFrontPaw;
/*     */   
/*     */   ModelRenderer WingLeft;
/*     */   ModelRenderer LegRightFrontTop;
/*     */   ModelRenderer LegRightFrontBottom;
/*     */   ModelRenderer LegRightBackTop;
/*     */   ModelRenderer LegRightBackBottom;
/*     */   ModelRenderer RightBackPaw;
/*     */   ModelRenderer LegLeftFrontTop;
/*     */   ModelRenderer SnoutRight;
/*     */   ModelRenderer LeftFrontPaw;
/*     */   ModelRenderer LegLeftBackTop;
/*     */   ModelRenderer LegLeftBackBottom;
/*     */   ModelRenderer LeftBackPaw;
/*     */   ModelRenderer LegLeftFrontBottom;
/*     */   ModelRenderer TailPieceSmall;
/*     */   ModelRenderer JawPiece;
/*     */   ModelRenderer HeadPieceBottom;
/*     */   ModelRenderer HeadPieceTop;
/*     */   ModelRenderer HornRightBottom;
/*     */   ModelRenderer HornLeftBottom;
/*     */   ModelRenderer HornRightTop;
/*     */   ModelRenderer HornLeftTop;
/*     */   ModelRenderer Torso;
/*     */   ModelRenderer SnoutLeft;
/*     */   ModelRenderer WingPieceLeft;
/*     */   ModelRenderer WingRight;
/*     */   ModelRenderer WingPieceRight;
/*     */   ModelRenderer Neck;
/*     */   ModelRenderer TailBack;
/*     */   ModelRenderer TailFront;
/*     */   ModelRenderer ScaleBackHead;
/*     */   ModelRenderer TailPieceLarge;
/*     */   ModelRenderer ScaleTailPiece;
/*     */   ModelRenderer ScaleHead;
/*     */   ModelRenderer ScaleTop1;
/*     */   ModelRenderer ScaleBackPiece1;
/*     */   ModelRenderer ScaleBackPiece2;
/*     */   
/*     */   public ModelSpyro(float f1) {
/*  53 */     this.wingspeed = f1;
/*     */     
/*  55 */     this.field_78090_t = 64;
/*  56 */     this.field_78089_u = 64;
/*     */     
/*  58 */     this.RightFrontPaw = new ModelRenderer(this, 12, 31);
/*  59 */     this.RightFrontPaw.func_78789_a(0.0F, 5.0F, -4.0F, 2, 1, 4);
/*  60 */     this.RightFrontPaw.func_78793_a(3.0F, 18.0F, -2.0F);
/*  61 */     this.RightFrontPaw.func_78787_b(64, 64);
/*  62 */     this.RightFrontPaw.field_78809_i = true;
/*  63 */     setRotation(this.RightFrontPaw, 0.0F, 0.0F, 0.0F);
/*  64 */     this.WingLeft = new ModelRenderer(this, 2, 51);
/*  65 */     this.WingLeft.func_78789_a(-10.0F, -1.0F, -2.0F, 10, 0, 4);
/*  66 */     this.WingLeft.func_78793_a(-1.0F, 16.0F, 0.0F);
/*  67 */     this.WingLeft.func_78787_b(64, 64);
/*  68 */     this.WingLeft.field_78809_i = true;
/*  69 */     setRotation(this.WingLeft, 0.1745329F, 0.0F, -0.1745329F);
/*  70 */     this.LegRightFrontTop = new ModelRenderer(this, 20, 19);
/*  71 */     this.LegRightFrontTop.func_78789_a(0.0F, 0.0F, -2.0F, 2, 3, 3);
/*  72 */     this.LegRightFrontTop.func_78793_a(3.0F, 18.0F, -2.0F);
/*  73 */     this.LegRightFrontTop.func_78787_b(64, 64);
/*  74 */     this.LegRightFrontTop.field_78809_i = true;
/*  75 */     setRotation(this.LegRightFrontTop, -0.0872665F, 0.0F, 0.0F);
/*  76 */     this.LegRightFrontBottom = new ModelRenderer(this, 0, 25);
/*  77 */     this.LegRightFrontBottom.func_78789_a(0.0F, 2.0F, -1.5F, 2, 4, 2);
/*  78 */     this.LegRightFrontBottom.func_78793_a(3.0F, 18.0F, -2.0F);
/*  79 */     this.LegRightFrontBottom.func_78787_b(64, 64);
/*  80 */     this.LegRightFrontBottom.field_78809_i = true;
/*  81 */     setRotation(this.LegRightFrontBottom, -0.1745329F, 0.0F, 0.0F);
/*  82 */     this.LegRightBackTop = new ModelRenderer(this, 30, 19);
/*  83 */     this.LegRightBackTop.func_78789_a(0.0F, 0.0F, -2.0F, 2, 3, 3);
/*  84 */     this.LegRightBackTop.func_78793_a(3.0F, 18.0F, 3.0F);
/*  85 */     this.LegRightBackTop.func_78787_b(64, 64);
/*  86 */     this.LegRightBackTop.field_78809_i = true;
/*  87 */     setRotation(this.LegRightBackTop, 0.1396263F, 0.0F, 0.0F);
/*  88 */     this.LegRightBackBottom = new ModelRenderer(this, 16, 25);
/*  89 */     this.LegRightBackBottom.func_78789_a(0.0F, 2.0F, -1.0F, 2, 4, 2);
/*  90 */     this.LegRightBackBottom.func_78793_a(3.0F, 18.0F, 3.0F);
/*  91 */     this.LegRightBackBottom.func_78787_b(64, 64);
/*  92 */     this.LegRightBackBottom.field_78809_i = true;
/*  93 */     setRotation(this.LegRightBackBottom, -0.1745329F, 0.0F, 0.0F);
/*  94 */     this.RightBackPaw = new ModelRenderer(this, 36, 31);
/*  95 */     this.RightBackPaw.func_78789_a(0.0F, 5.0F, -3.0F, 2, 1, 4);
/*  96 */     this.RightBackPaw.func_78793_a(3.0F, 18.0F, 3.0F);
/*  97 */     this.RightBackPaw.func_78787_b(64, 64);
/*  98 */     this.RightBackPaw.field_78809_i = true;
/*  99 */     setRotation(this.RightBackPaw, 0.0F, 0.0F, 0.0F);
/* 100 */     this.LegLeftFrontTop = new ModelRenderer(this, 0, 19);
/* 101 */     this.LegLeftFrontTop.func_78789_a(-2.0F, 0.0F, -1.0F, 2, 3, 3);
/* 102 */     this.LegLeftFrontTop.func_78793_a(-2.0F, 18.0F, -3.0F);
/* 103 */     this.LegLeftFrontTop.func_78787_b(64, 64);
/* 104 */     this.LegLeftFrontTop.field_78809_i = true;
/* 105 */     setRotation(this.LegLeftFrontTop, -0.0872665F, 0.0F, 0.0F);
/* 106 */     this.SnoutRight = new ModelRenderer(this, 48, 2);
/* 107 */     this.SnoutRight.func_78789_a(1.0F, -3.0F, -5.0F, 1, 1, 1);
/* 108 */     this.SnoutRight.func_78793_a(1.0F, 16.0F, -3.0F);
/* 109 */     this.SnoutRight.func_78787_b(64, 64);
/* 110 */     this.SnoutRight.field_78809_i = true;
/* 111 */     setRotation(this.SnoutRight, 0.0F, 0.0F, 0.0F);
/* 112 */     this.LeftFrontPaw = new ModelRenderer(this, 0, 31);
/* 113 */     this.LeftFrontPaw.func_78789_a(-2.0F, 5.0F, -3.0F, 2, 1, 4);
/* 114 */     this.LeftFrontPaw.func_78793_a(-2.0F, 18.0F, -3.0F);
/* 115 */     this.LeftFrontPaw.func_78787_b(64, 64);
/* 116 */     this.LeftFrontPaw.field_78809_i = true;
/* 117 */     setRotation(this.LeftFrontPaw, 0.0F, 0.0F, 0.0F);
/* 118 */     this.LegLeftBackTop = new ModelRenderer(this, 10, 19);
/* 119 */     this.LegLeftBackTop.func_78789_a(-2.0F, 0.0F, -2.0F, 2, 3, 3);
/* 120 */     this.LegLeftBackTop.func_78793_a(-2.0F, 18.0F, 3.0F);
/* 121 */     this.LegLeftBackTop.func_78787_b(64, 64);
/* 122 */     this.LegLeftBackTop.field_78809_i = true;
/* 123 */     setRotation(this.LegLeftBackTop, 0.1396263F, 0.0F, 0.0F);
/* 124 */     this.LegLeftBackBottom = new ModelRenderer(this, 24, 25);
/* 125 */     this.LegLeftBackBottom.func_78789_a(-2.0F, 2.0F, -1.0F, 2, 4, 2);
/* 126 */     this.LegLeftBackBottom.func_78793_a(-2.0F, 18.0F, 3.0F);
/* 127 */     this.LegLeftBackBottom.func_78787_b(64, 64);
/* 128 */     this.LegLeftBackBottom.field_78809_i = true;
/* 129 */     setRotation(this.LegLeftBackBottom, -0.1745329F, 0.0F, 0.0F);
/* 130 */     this.LeftBackPaw = new ModelRenderer(this, 24, 31);
/* 131 */     this.LeftBackPaw.func_78789_a(-2.0F, 5.0F, -3.0F, 2, 1, 4);
/* 132 */     this.LeftBackPaw.func_78793_a(-2.0F, 18.0F, 3.0F);
/* 133 */     this.LeftBackPaw.func_78787_b(64, 64);
/* 134 */     this.LeftBackPaw.field_78809_i = true;
/* 135 */     setRotation(this.LeftBackPaw, 0.0F, 0.0F, 0.0F);
/* 136 */     this.LegLeftFrontBottom = new ModelRenderer(this, 8, 25);
/* 137 */     this.LegLeftFrontBottom.func_78789_a(-2.0F, 2.0F, -0.5F, 2, 4, 2);
/* 138 */     this.LegLeftFrontBottom.func_78793_a(-2.0F, 18.0F, -3.0F);
/* 139 */     this.LegLeftFrontBottom.func_78787_b(64, 64);
/* 140 */     this.LegLeftFrontBottom.field_78809_i = true;
/* 141 */     setRotation(this.LegLeftFrontBottom, -0.1745329F, 0.0F, 0.0F);
/* 142 */     this.TailPieceSmall = new ModelRenderer(this, 28, 36);
/* 143 */     this.TailPieceSmall.func_78789_a(0.0F, -0.5F, 4.0F, 1, 1, 1);
/* 144 */     this.TailPieceSmall.func_78793_a(0.0F, 16.0F, 7.0F);
/* 145 */     this.TailPieceSmall.func_78787_b(64, 64);
/* 146 */     this.TailPieceSmall.field_78809_i = true;
/* 147 */     setRotation(this.TailPieceSmall, 0.1745329F, 0.0F, 0.0F);
/* 148 */     this.JawPiece = new ModelRenderer(this, 52, 0);
/* 149 */     this.JawPiece.func_78789_a(-2.0F, -1.0F, -4.0F, 3, 1, 3);
/* 150 */     this.JawPiece.func_78793_a(1.0F, 16.0F, -3.0F);
/* 151 */     this.JawPiece.func_78787_b(64, 64);
/* 152 */     this.JawPiece.field_78809_i = true;
/* 153 */     setRotation(this.JawPiece, 0.1745329F, 0.0F, 0.0F);
/* 154 */     this.HeadPieceBottom = new ModelRenderer(this, 30, 7);
/* 155 */     this.HeadPieceBottom.func_78789_a(-3.0F, -2.0F, -5.0F, 5, 2, 6);
/* 156 */     this.HeadPieceBottom.func_78793_a(1.0F, 16.0F, -3.0F);
/* 157 */     this.HeadPieceBottom.func_78787_b(64, 64);
/* 158 */     this.HeadPieceBottom.field_78809_i = true;
/* 159 */     setRotation(this.HeadPieceBottom, 0.0F, 0.0F, 0.0F);
/* 160 */     this.HeadPieceTop = new ModelRenderer(this, 30, 0);
/* 161 */     this.HeadPieceTop.func_78789_a(-3.0F, -5.0F, -3.0F, 5, 3, 4);
/* 162 */     this.HeadPieceTop.func_78793_a(1.0F, 16.0F, -3.0F);
/* 163 */     this.HeadPieceTop.func_78787_b(64, 64);
/* 164 */     this.HeadPieceTop.field_78809_i = true;
/* 165 */     setRotation(this.HeadPieceTop, 0.0F, 0.0F, 0.0F);
/* 166 */     this.HornRightBottom = new ModelRenderer(this, 8, 14);
/* 167 */     this.HornRightBottom.func_78789_a(0.0F, -6.0F, -3.5F, 2, 3, 2);
/* 168 */     this.HornRightBottom.func_78793_a(1.0F, 16.0F, -3.0F);
/* 169 */     this.HornRightBottom.func_78787_b(64, 64);
/* 170 */     this.HornRightBottom.field_78809_i = true;
/* 171 */     setRotation(this.HornRightBottom, -0.7853982F, 0.7853982F, 0.0F);
/* 172 */     this.HornLeftBottom = new ModelRenderer(this, 0, 14);
/* 173 */     this.HornLeftBottom.func_78789_a(-2.75F, -6.5F, -3.0F, 2, 3, 2);
/* 174 */     this.HornLeftBottom.func_78793_a(1.0F, 16.0F, -3.0F);
/* 175 */     this.HornLeftBottom.func_78787_b(64, 64);
/* 176 */     this.HornLeftBottom.field_78809_i = true;
/* 177 */     setRotation(this.HornLeftBottom, -0.7853982F, -0.7853982F, 0.0F);
/* 178 */     this.HornRightTop = new ModelRenderer(this, 20, 14);
/* 179 */     this.HornRightTop.func_78789_a(0.5F, -9.0F, -3.0F, 1, 3, 1);
/* 180 */     this.HornRightTop.func_78793_a(1.0F, 16.0F, -3.0F);
/* 181 */     this.HornRightTop.func_78787_b(64, 64);
/* 182 */     this.HornRightTop.field_78809_i = true;
/* 183 */     setRotation(this.HornRightTop, -0.7853982F, 0.7853982F, 0.0F);
/* 184 */     this.HornLeftTop = new ModelRenderer(this, 16, 14);
/* 185 */     this.HornLeftTop.func_78789_a(-2.2F, -9.5F, -2.5F, 1, 3, 1);
/* 186 */     this.HornLeftTop.func_78793_a(1.0F, 16.0F, -3.0F);
/* 187 */     this.HornLeftTop.func_78787_b(64, 64);
/* 188 */     this.HornLeftTop.field_78809_i = true;
/* 189 */     setRotation(this.HornLeftTop, -0.7853982F, -0.7853982F, 0.0F);
/* 190 */     this.Torso = new ModelRenderer(this, 0, 0);
/* 191 */     this.Torso.func_78789_a(-2.0F, -2.0F, -5.0F, 5, 4, 10);
/* 192 */     this.Torso.func_78793_a(0.0F, 19.0F, 0.0F);
/* 193 */     this.Torso.func_78787_b(64, 64);
/* 194 */     this.Torso.field_78809_i = true;
/* 195 */     setRotation(this.Torso, 0.0F, 0.0F, 0.0F);
/* 196 */     this.SnoutLeft = new ModelRenderer(this, 48, 0);
/* 197 */     this.SnoutLeft.func_78789_a(-3.0F, -3.0F, -5.0F, 1, 1, 1);
/* 198 */     this.SnoutLeft.func_78793_a(1.0F, 16.0F, -3.0F);
/* 199 */     this.SnoutLeft.func_78787_b(64, 64);
/* 200 */     this.SnoutLeft.field_78809_i = true;
/* 201 */     setRotation(this.SnoutLeft, 0.0F, 0.0F, 0.0F);
/* 202 */     this.WingPieceLeft = new ModelRenderer(this, 4, 42);
/* 203 */     this.WingPieceLeft.func_78789_a(-1.0F, -2.0F, -1.0F, 1, 2, 1);
/* 204 */     this.WingPieceLeft.func_78793_a(0.0F, 17.2F, 0.0F);
/* 205 */     this.WingPieceLeft.func_78787_b(64, 64);
/* 206 */     this.WingPieceLeft.field_78809_i = true;
/* 207 */     setRotation(this.WingPieceLeft, 0.1745329F, 0.0F, -0.1745329F);
/* 208 */     this.WingRight = new ModelRenderer(this, 2, 45);
/* 209 */     this.WingRight.func_78789_a(0.0F, -1.0F, -2.0F, 10, 0, 4);
/* 210 */     this.WingRight.func_78793_a(2.0F, 16.0F, 0.0F);
/* 211 */     this.WingRight.func_78787_b(64, 64);
/* 212 */     this.WingRight.field_78809_i = true;
/* 213 */     setRotation(this.WingRight, 0.1745329F, 0.0F, 0.1745329F);
/* 214 */     this.WingPieceRight = new ModelRenderer(this, 0, 42);
/* 215 */     this.WingPieceRight.func_78789_a(-1.0F, -2.0F, 0.0F, 1, 2, 1);
/* 216 */     this.WingPieceRight.func_78793_a(2.0F, 17.5F, -1.0F);
/* 217 */     this.WingPieceRight.func_78787_b(64, 64);
/* 218 */     this.WingPieceRight.field_78809_i = true;
/* 219 */     setRotation(this.WingPieceRight, 0.1745329F, 0.0F, 0.1745329F);
/* 220 */     this.Neck = new ModelRenderer(this, 52, 7);
/* 221 */     this.Neck.func_78789_a(-1.0F, -2.0F, -1.0F, 3, 3, 3);
/* 222 */     this.Neck.func_78793_a(0.0F, 17.0F, -4.0F);
/* 223 */     this.Neck.func_78787_b(64, 64);
/* 224 */     this.Neck.field_78809_i = true;
/* 225 */     setRotation(this.Neck, 0.4537856F, 0.0F, 0.0F);
/* 226 */     this.TailBack = new ModelRenderer(this, 0, 36);
/* 227 */     this.TailBack.func_78789_a(-1.0F, -1.0F, -1.0F, 2, 2, 4);
/* 228 */     this.TailBack.func_78793_a(0.5F, 17.5F, 5.0F);
/* 229 */     this.TailBack.func_78787_b(64, 64);
/* 230 */     this.TailBack.field_78809_i = true;
/* 231 */     setRotation(this.TailBack, 0.4537856F, 0.0F, 0.0F);
/* 232 */     this.TailFront = new ModelRenderer(this, 12, 36);
/* 233 */     this.TailFront.func_78789_a(0.0F, 0.0F, -1.0F, 1, 1, 4);
/* 234 */     this.TailFront.func_78793_a(0.0F, 16.0F, 7.0F);
/* 235 */     this.TailFront.func_78787_b(64, 64);
/* 236 */     this.TailFront.field_78809_i = true;
/* 237 */     setRotation(this.TailFront, 0.2617994F, 0.0F, 0.0F);
/* 238 */     this.ScaleBackHead = new ModelRenderer(this, 38, 36);
/* 239 */     this.ScaleBackHead.func_78789_a(-1.0F, -3.0F, 2.0F, 1, 2, 1);
/* 240 */     this.ScaleBackHead.func_78793_a(1.0F, 16.0F, -4.0F);
/* 241 */     this.ScaleBackHead.func_78787_b(64, 64);
/* 242 */     this.ScaleBackHead.field_78809_i = true;
/* 243 */     setRotation(this.ScaleBackHead, 0.0F, 0.0F, 0.0F);
/* 244 */     this.TailPieceLarge = new ModelRenderer(this, 22, 36);
/* 245 */     this.TailPieceLarge.func_78789_a(0.0F, -1.0F, 2.0F, 1, 2, 2);
/* 246 */     this.TailPieceLarge.func_78793_a(0.0F, 16.0F, 7.0F);
/* 247 */     this.TailPieceLarge.func_78787_b(64, 64);
/* 248 */     this.TailPieceLarge.field_78809_i = true;
/* 249 */     setRotation(this.TailPieceLarge, 0.1745329F, 0.0F, 0.0F);
/* 250 */     this.ScaleTailPiece = new ModelRenderer(this, 48, 36);
/* 251 */     this.ScaleTailPiece.func_78789_a(-0.5F, -2.0F, 0.2F, 1, 1, 2);
/* 252 */     this.ScaleTailPiece.func_78793_a(0.5F, 17.5F, 5.0F);
/* 253 */     this.ScaleTailPiece.func_78787_b(64, 64);
/* 254 */     this.ScaleTailPiece.field_78809_i = true;
/* 255 */     setRotation(this.ScaleTailPiece, 0.4537856F, 0.0F, 0.0F);
/* 256 */     this.ScaleHead = new ModelRenderer(this, 42, 36);
/* 257 */     this.ScaleHead.func_78789_a(-1.0F, -6.0F, 0.0F, 1, 2, 2);
/* 258 */     this.ScaleHead.func_78793_a(1.0F, 16.0F, -3.0F);
/* 259 */     this.ScaleHead.func_78787_b(64, 64);
/* 260 */     this.ScaleHead.field_78809_i = true;
/* 261 */     setRotation(this.ScaleHead, 0.0F, 0.0F, 0.0F);
/* 262 */     this.ScaleTop1 = new ModelRenderer(this, 48, 36);
/* 263 */     this.ScaleTop1.func_78789_a(-1.0F, -6.0F, -4.0F, 1, 1, 2);
/* 264 */     this.ScaleTop1.func_78793_a(1.0F, 16.0F, -2.0F);
/* 265 */     this.ScaleTop1.func_78787_b(64, 64);
/* 266 */     this.ScaleTop1.field_78809_i = true;
/* 267 */     setRotation(this.ScaleTop1, 0.0F, 0.0F, 0.0F);
/* 268 */     this.ScaleBackPiece1 = new ModelRenderer(this, 48, 36);
/* 269 */     this.ScaleBackPiece1.func_78789_a(0.0F, -1.0F, -1.0F, 1, 1, 2);
/* 270 */     this.ScaleBackPiece1.func_78793_a(0.0F, 17.0F, 0.0F);
/* 271 */     this.ScaleBackPiece1.func_78787_b(64, 64);
/* 272 */     this.ScaleBackPiece1.field_78809_i = true;
/* 273 */     setRotation(this.ScaleBackPiece1, 0.0F, 0.0F, 0.0F);
/* 274 */     this.ScaleBackPiece2 = new ModelRenderer(this, 48, 36);
/* 275 */     this.ScaleBackPiece2.func_78789_a(0.0F, -1.0F, -1.0F, 1, 1, 2);
/* 276 */     this.ScaleBackPiece2.func_78793_a(0.0F, 17.0F, 3.0F);
/* 277 */     this.ScaleBackPiece2.func_78787_b(64, 64);
/* 278 */     this.ScaleBackPiece2.field_78809_i = true;
/* 279 */     setRotation(this.ScaleBackPiece2, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 287 */     Spyro c = (Spyro)entity;
/* 288 */     float hf = 0.0F;
/* 289 */     float newangle = 0.0F;
/* 290 */     int current_activity = c.getActivity();
/*     */     
/* 292 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 293 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 298 */     if (f1 > 0.1D) {
/* 299 */       newangle = MathHelper.func_76134_b(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.4F * f1;
/*     */     } else {
/* 301 */       newangle = 0.0F;
/*     */     } 
/* 303 */     if (current_activity == 3) newangle *= 0.5F;
/*     */     
/* 305 */     this.WingLeft.field_78808_h = newangle;
/* 306 */     this.WingRight.field_78808_h = -newangle;
/*     */ 
/*     */ 
/*     */     
/* 310 */     if (f1 > 0.1D) {
/* 311 */       newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 313 */       newangle = 0.0F;
/*     */     } 
/* 315 */     if (current_activity == 3) newangle = 0.0F;
/*     */     
/* 317 */     if (current_activity != 2) {
/* 318 */       this.LegRightFrontTop.field_78795_f = newangle - 0.087F;
/* 319 */       this.LegRightFrontBottom.field_78795_f = newangle - 0.17F;
/* 320 */       this.RightFrontPaw.field_78795_f = newangle;
/*     */       
/* 322 */       this.LegLeftFrontTop.field_78795_f = -newangle - 0.087F;
/* 323 */       this.LegLeftFrontBottom.field_78795_f = -newangle - 0.17F;
/* 324 */       this.LeftFrontPaw.field_78795_f = -newangle;
/*     */       
/* 326 */       this.LegRightBackBottom.field_78795_f = -newangle + 0.139F;
/* 327 */       this.LegRightBackTop.field_78795_f = -newangle - 0.174F;
/* 328 */       this.RightBackPaw.field_78795_f = -newangle;
/*     */       
/* 330 */       this.LegLeftBackBottom.field_78795_f = newangle + 0.139F;
/* 331 */       this.LegLeftBackTop.field_78795_f = newangle - 0.174F;
/* 332 */       this.LeftBackPaw.field_78795_f = newangle;
/*     */     } else {
/*     */       
/* 335 */       newangle = -1.0F;
/* 336 */       this.LegRightFrontTop.field_78795_f = newangle - 0.087F;
/* 337 */       this.LegRightFrontBottom.field_78795_f = newangle - 0.17F;
/* 338 */       this.RightFrontPaw.field_78795_f = newangle;
/* 339 */       this.LegLeftFrontTop.field_78795_f = newangle - 0.087F;
/* 340 */       this.LegLeftFrontBottom.field_78795_f = newangle - 0.17F;
/* 341 */       this.LeftFrontPaw.field_78795_f = newangle;
/*     */       
/* 343 */       newangle = 1.0F;
/* 344 */       this.LegRightBackBottom.field_78795_f = newangle + 0.139F;
/* 345 */       this.LegRightBackTop.field_78795_f = newangle - 0.174F;
/* 346 */       this.RightBackPaw.field_78795_f = newangle;
/* 347 */       this.LegLeftBackBottom.field_78795_f = newangle + 0.139F;
/* 348 */       this.LegLeftBackTop.field_78795_f = newangle - 0.174F;
/* 349 */       this.LeftBackPaw.field_78795_f = newangle;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 354 */     newangle = MathHelper.func_76134_b(f2 * 1.2F * this.wingspeed) * 3.1415927F * 0.25F;
/* 355 */     if (c.func_70906_o() == true || current_activity == 3) {
/* 356 */       newangle = 0.0F;
/*     */     }
/* 358 */     this.TailBack.field_78796_g = newangle;
/* 359 */     this.ScaleTailPiece.field_78796_g = newangle;
/*     */     
/* 361 */     this.TailBack.field_78798_e += (float)Math.cos(this.TailBack.field_78796_g) * 3.0F;
/* 362 */     this.TailFront.field_78800_c = this.TailBack.field_78800_c + (float)Math.sin(this.TailBack.field_78796_g) * 3.0F - 0.5F;
/* 363 */     this.TailFront.field_78796_g = newangle * 1.6F;
/* 364 */     this.TailPieceLarge.field_78798_e = this.TailFront.field_78798_e;
/* 365 */     this.TailPieceLarge.field_78800_c = this.TailFront.field_78800_c;
/* 366 */     this.TailPieceLarge.field_78796_g = this.TailFront.field_78796_g;
/* 367 */     this.TailPieceSmall.field_78798_e = this.TailFront.field_78798_e;
/* 368 */     this.TailPieceSmall.field_78800_c = this.TailFront.field_78800_c;
/* 369 */     this.TailPieceSmall.field_78796_g = this.TailFront.field_78796_g;
/*     */ 
/*     */ 
/*     */     
/* 373 */     this.HeadPieceTop.field_78796_g = (float)Math.toRadians(f3);
/* 374 */     this.HeadPieceBottom.field_78796_g = (float)Math.toRadians(f3);
/* 375 */     this.JawPiece.field_78796_g = (float)Math.toRadians(f3);
/* 376 */     this.SnoutRight.field_78796_g = (float)Math.toRadians(f3);
/* 377 */     this.SnoutLeft.field_78796_g = (float)Math.toRadians(f3);
/* 378 */     this.ScaleTop1.field_78796_g = (float)Math.toRadians(f3);
/* 379 */     this.ScaleHead.field_78796_g = (float)Math.toRadians(f3);
/* 380 */     this.ScaleBackHead.field_78796_g = (float)Math.toRadians(f3);
/* 381 */     this.HornRightBottom.field_78796_g = (float)Math.toRadians(f3) + 0.785F;
/* 382 */     this.HornRightTop.field_78796_g = (float)Math.toRadians(f3) + 0.785F;
/* 383 */     this.HornLeftBottom.field_78796_g = (float)Math.toRadians(f3) - 0.785F;
/* 384 */     this.HornLeftTop.field_78796_g = (float)Math.toRadians(f3) - 0.785F;
/*     */ 
/*     */     
/* 387 */     this.HeadPieceTop.field_78795_f = (float)Math.toRadians(f4);
/* 388 */     this.HeadPieceBottom.field_78795_f = (float)Math.toRadians(f4);
/* 389 */     this.JawPiece.field_78795_f = (float)Math.toRadians(f4);
/* 390 */     this.SnoutRight.field_78795_f = (float)Math.toRadians(f4);
/* 391 */     this.SnoutLeft.field_78795_f = (float)Math.toRadians(f4);
/* 392 */     this.ScaleTop1.field_78795_f = (float)Math.toRadians(f4);
/* 393 */     this.ScaleHead.field_78795_f = (float)Math.toRadians(f4);
/* 394 */     this.ScaleBackHead.field_78795_f = (float)Math.toRadians(f4);
/* 395 */     this.HornRightBottom.field_78795_f = (float)Math.toRadians(f4) - 0.785F;
/* 396 */     this.HornRightTop.field_78795_f = (float)Math.toRadians(f4) - 0.785F;
/* 397 */     this.HornLeftBottom.field_78795_f = (float)Math.toRadians(f4) - 0.785F;
/* 398 */     this.HornLeftTop.field_78795_f = (float)Math.toRadians(f4) - 0.785F;
/*     */     
/* 400 */     this.RightFrontPaw.func_78785_a(f5);
/* 401 */     this.WingLeft.func_78785_a(f5);
/* 402 */     this.LegRightFrontTop.func_78785_a(f5);
/* 403 */     this.LegRightFrontBottom.func_78785_a(f5);
/* 404 */     this.LegRightBackTop.func_78785_a(f5);
/* 405 */     this.LegRightBackBottom.func_78785_a(f5);
/* 406 */     this.RightBackPaw.func_78785_a(f5);
/* 407 */     this.LegLeftFrontTop.func_78785_a(f5);
/* 408 */     this.SnoutRight.func_78785_a(f5);
/* 409 */     this.LeftFrontPaw.func_78785_a(f5);
/* 410 */     this.LegLeftBackTop.func_78785_a(f5);
/* 411 */     this.LegLeftBackBottom.func_78785_a(f5);
/* 412 */     this.LeftBackPaw.func_78785_a(f5);
/* 413 */     this.LegLeftFrontBottom.func_78785_a(f5);
/* 414 */     this.TailPieceSmall.func_78785_a(f5);
/* 415 */     this.JawPiece.func_78785_a(f5);
/* 416 */     this.HeadPieceBottom.func_78785_a(f5);
/* 417 */     this.HeadPieceTop.func_78785_a(f5);
/* 418 */     this.HornRightBottom.func_78785_a(f5);
/* 419 */     this.HornLeftBottom.func_78785_a(f5);
/* 420 */     this.HornRightTop.func_78785_a(f5);
/* 421 */     this.HornLeftTop.func_78785_a(f5);
/* 422 */     this.Torso.func_78785_a(f5);
/* 423 */     this.SnoutLeft.func_78785_a(f5);
/* 424 */     this.WingPieceLeft.func_78785_a(f5);
/* 425 */     this.WingRight.func_78785_a(f5);
/* 426 */     this.WingPieceRight.func_78785_a(f5);
/* 427 */     this.Neck.func_78785_a(f5);
/* 428 */     this.TailBack.func_78785_a(f5);
/* 429 */     this.TailFront.func_78785_a(f5);
/* 430 */     this.ScaleBackHead.func_78785_a(f5);
/* 431 */     this.TailPieceLarge.func_78785_a(f5);
/* 432 */     this.ScaleTailPiece.func_78785_a(f5);
/* 433 */     this.ScaleHead.func_78785_a(f5);
/* 434 */     this.ScaleTop1.func_78785_a(f5);
/* 435 */     this.ScaleBackPiece1.func_78785_a(f5);
/* 436 */     this.ScaleBackPiece2.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 442 */     model.field_78795_f = x;
/* 443 */     model.field_78796_g = y;
/* 444 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 449 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelSpyro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */