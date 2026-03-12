/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class ModelThePrince
/*     */   extends ModelBase
/*     */ {
/*  12 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer neck1;
/*     */   ModelRenderer neck;
/*     */   ModelRenderer neckbase;
/*     */   ModelRenderer head;
/*     */   ModelRenderer Rleg1;
/*     */   ModelRenderer Lleg1;
/*     */   ModelRenderer snout;
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer tail3;
/*     */   ModelRenderer tail4;
/*     */   ModelRenderer Lwing;
/*     */   ModelRenderer Rwing;
/*     */   ModelRenderer Tail5;
/*     */   ModelRenderer Tail6;
/*     */   ModelRenderer Lneck1;
/*     */   ModelRenderer Lneck;
/*     */   ModelRenderer Lhead;
/*     */   ModelRenderer Lsnout;
/*     */   ModelRenderer Rneck1;
/*     */   ModelRenderer Rneck;
/*     */   ModelRenderer Rhead;
/*     */   ModelRenderer Rsnout;
/*     */   ModelRenderer headfin;
/*     */   ModelRenderer Lheadfin;
/*     */   ModelRenderer Rheadfin;
/*     */   ModelRenderer Backfin;
/*     */   ModelRenderer Rwing2;
/*     */   ModelRenderer Rwing3;
/*     */   ModelRenderer Lwing2;
/*     */   ModelRenderer Lwing3;
/*     */   ModelRenderer Ljaw;
/*     */   ModelRenderer jaw;
/*     */   ModelRenderer Rjaw;
/*     */   
/*     */   public ModelThePrince(float f1) {
/*  52 */     this.wingspeed = f1;
/*     */     
/*  54 */     this.field_78090_t = 128;
/*  55 */     this.field_78089_u = 128;
/*     */     
/*  57 */     this.body = new ModelRenderer(this, 59, 34);
/*  58 */     this.body.func_78789_a(-7.0F, -3.0F, -5.0F, 13, 8, 10);
/*  59 */     this.body.func_78793_a(0.5F, 15.0F, 1.0F);
/*  60 */     this.body.func_78787_b(128, 128);
/*  61 */     this.body.field_78809_i = true;
/*  62 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  63 */     this.neck1 = new ModelRenderer(this, 20, 45);
/*  64 */     this.neck1.func_78789_a(-1.5F, -2.0F, -1.0F, 3, 4, 4);
/*  65 */     this.neck1.func_78793_a(0.0F, 16.0F, -5.0F);
/*  66 */     this.neck1.func_78787_b(128, 128);
/*  67 */     this.neck1.field_78809_i = true;
/*  68 */     setRotation(this.neck1, 0.715585F, 0.0F, 0.0F);
/*  69 */     this.neck = new ModelRenderer(this, 20, 31);
/*  70 */     this.neck.func_78789_a(-1.5F, -8.0F, -1.0F, 3, 8, 3);
/*  71 */     this.neck.func_78793_a(0.0F, 15.0F, -6.0F);
/*  72 */     this.neck.func_78787_b(128, 128);
/*  73 */     this.neck.field_78809_i = true;
/*  74 */     setRotation(this.neck, 0.0F, 0.0F, 0.0F);
/*  75 */     this.neckbase = new ModelRenderer(this, 0, 76);
/*  76 */     this.neckbase.func_78789_a(-4.5F, -4.0F, 0.0F, 9, 6, 3);
/*  77 */     this.neckbase.func_78793_a(0.0F, 17.0F, 5.0F);
/*  78 */     this.neckbase.func_78787_b(128, 128);
/*  79 */     this.neckbase.field_78809_i = true;
/*  80 */     setRotation(this.neckbase, 0.0F, 0.0F, 0.0F);
/*  81 */     this.head = new ModelRenderer(this, 20, 20);
/*  82 */     this.head.func_78789_a(-2.0F, -3.0F, -3.5F, 4, 4, 5);
/*  83 */     this.head.func_78793_a(0.0F, 8.0F, -6.0F);
/*  84 */     this.head.func_78787_b(128, 128);
/*  85 */     this.head.field_78809_i = true;
/*  86 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  87 */     this.Rleg1 = new ModelRenderer(this, 0, 58);
/*  88 */     this.Rleg1.func_78789_a(-1.5F, 0.0F, -2.0F, 3, 8, 4);
/*  89 */     this.Rleg1.func_78793_a(6.0F, 16.0F, 1.0F);
/*  90 */     this.Rleg1.func_78787_b(128, 128);
/*  91 */     this.Rleg1.field_78809_i = true;
/*  92 */     setRotation(this.Rleg1, 0.0F, 0.0F, 0.0F);
/*  93 */     this.Lleg1 = new ModelRenderer(this, 15, 58);
/*  94 */     this.Lleg1.func_78789_a(-1.5F, 0.0F, -2.0F, 3, 8, 4);
/*  95 */     this.Lleg1.func_78793_a(-6.0F, 16.0F, 1.0F);
/*  96 */     this.Lleg1.func_78787_b(128, 128);
/*  97 */     this.Lleg1.field_78809_i = true;
/*  98 */     setRotation(this.Lleg1, 0.0F, 0.0F, 0.0F);
/*  99 */     this.snout = new ModelRenderer(this, 20, 11);
/* 100 */     this.snout.func_78789_a(-1.5F, -2.0F, -8.5F, 3, 3, 5);
/* 101 */     this.snout.func_78793_a(0.0F, 8.0F, -6.0F);
/* 102 */     this.snout.func_78787_b(128, 128);
/* 103 */     this.snout.field_78809_i = true;
/* 104 */     setRotation(this.snout, 0.0F, 0.0F, 0.0F);
/* 105 */     this.tail1 = new ModelRenderer(this, 59, 55);
/* 106 */     this.tail1.func_78789_a(-6.0F, -3.0F, -3.0F, 12, 5, 3);
/* 107 */     this.tail1.func_78793_a(0.0F, 16.5F, -2.0F);
/* 108 */     this.tail1.func_78787_b(128, 128);
/* 109 */     this.tail1.field_78809_i = true;
/* 110 */     setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
/* 111 */     this.tail2 = new ModelRenderer(this, 0, 86);
/* 112 */     this.tail2.func_78789_a(-3.0F, -2.5F, 0.0F, 6, 4, 7);
/* 113 */     this.tail2.func_78793_a(0.0F, 16.0F, 7.0F);
/* 114 */     this.tail2.func_78787_b(128, 128);
/* 115 */     this.tail2.field_78809_i = true;
/* 116 */     setRotation(this.tail2, -0.3839724F, 0.0F, 0.0F);
/* 117 */     this.tail3 = new ModelRenderer(this, 0, 98);
/* 118 */     this.tail3.func_78789_a(-2.0F, -2.0F, 0.0F, 4, 3, 6);
/* 119 */     this.tail3.func_78793_a(0.0F, 18.2F, 13.0F);
/* 120 */     this.tail3.func_78787_b(128, 128);
/* 121 */     this.tail3.field_78809_i = true;
/* 122 */     setRotation(this.tail3, -0.2094395F, 0.0F, 0.0F);
/* 123 */     this.tail4 = new ModelRenderer(this, 0, 108);
/* 124 */     this.tail4.func_78789_a(-1.5F, -1.5F, 0.0F, 3, 2, 5);
/* 125 */     this.tail4.func_78793_a(0.0F, 19.5F, 18.0F);
/* 126 */     this.tail4.func_78787_b(128, 128);
/* 127 */     this.tail4.field_78809_i = true;
/* 128 */     setRotation(this.tail4, -0.0698132F, 0.0F, 0.0F);
/* 129 */     this.Lwing = new ModelRenderer(this, 59, 0);
/* 130 */     this.Lwing.func_78789_a(-22.0F, 0.0F, -3.0F, 22, 0, 10);
/* 131 */     this.Lwing.func_78793_a(-6.0F, 12.6F, 0.0F);
/* 132 */     this.Lwing.func_78787_b(128, 128);
/* 133 */     this.Lwing.field_78809_i = true;
/* 134 */     setRotation(this.Lwing, 0.0F, 0.0F, 0.4014257F);
/* 135 */     this.Rwing = new ModelRenderer(this, 59, 66);
/* 136 */     this.Rwing.func_78789_a(0.0F, 0.0F, -3.0F, 22, 0, 10);
/* 137 */     this.Rwing.func_78793_a(6.0F, 12.6F, 0.0F);
/* 138 */     this.Rwing.func_78787_b(128, 128);
/* 139 */     this.Rwing.field_78809_i = true;
/* 140 */     setRotation(this.Rwing, 0.0F, 0.0F, -0.4014257F);
/* 141 */     this.Tail5 = new ModelRenderer(this, 0, 116);
/* 142 */     this.Tail5.func_78789_a(-3.0F, 0.0F, 0.0F, 6, 2, 4);
/* 143 */     this.Tail5.func_78793_a(0.0F, 18.0F, 22.0F);
/* 144 */     this.Tail5.func_78787_b(128, 128);
/* 145 */     this.Tail5.field_78809_i = true;
/* 146 */     setRotation(this.Tail5, 0.0F, 0.0F, 0.0F);
/* 147 */     this.Tail6 = new ModelRenderer(this, 0, 123);
/* 148 */     this.Tail6.func_78789_a(-1.0F, 0.0F, 0.0F, 2, 2, 2);
/* 149 */     this.Tail6.func_78793_a(0.0F, 18.0F, 26.0F);
/* 150 */     this.Tail6.func_78787_b(128, 128);
/* 151 */     this.Tail6.field_78809_i = true;
/* 152 */     setRotation(this.Tail6, 0.0F, 0.0F, 0.0F);
/* 153 */     this.Lneck1 = new ModelRenderer(this, 0, 45);
/* 154 */     this.Lneck1.func_78789_a(-1.5F, -2.0F, -1.0F, 3, 4, 4);
/* 155 */     this.Lneck1.func_78793_a(4.5F, 16.0F, -5.0F);
/* 156 */     this.Lneck1.func_78787_b(128, 128);
/* 157 */     this.Lneck1.field_78809_i = true;
/* 158 */     setRotation(this.Lneck1, 0.715585F, 0.0F, 0.0F);
/* 159 */     this.Lneck = new ModelRenderer(this, 0, 30);
/* 160 */     this.Lneck.func_78789_a(-1.5F, -8.0F, -1.0F, 3, 8, 3);
/* 161 */     this.Lneck.func_78793_a(4.5F, 15.0F, -6.0F);
/* 162 */     this.Lneck.func_78787_b(128, 128);
/* 163 */     this.Lneck.field_78809_i = true;
/* 164 */     setRotation(this.Lneck, 0.0F, 0.0F, 0.0F);
/* 165 */     this.Lhead = new ModelRenderer(this, 0, 20);
/* 166 */     this.Lhead.func_78789_a(-2.0F, -3.0F, -3.5F, 4, 4, 5);
/* 167 */     this.Lhead.func_78793_a(4.5F, 8.0F, -6.0F);
/* 168 */     this.Lhead.func_78787_b(128, 128);
/* 169 */     this.Lhead.field_78809_i = true;
/* 170 */     setRotation(this.Lhead, -0.0174533F, 0.0F, 0.0F);
/* 171 */     this.Lsnout = new ModelRenderer(this, 0, 11);
/* 172 */     this.Lsnout.func_78789_a(-1.5F, -2.0F, -8.5F, 3, 3, 5);
/* 173 */     this.Lsnout.func_78793_a(4.5F, 8.0F, -6.0F);
/* 174 */     this.Lsnout.func_78787_b(128, 128);
/* 175 */     this.Lsnout.field_78809_i = true;
/* 176 */     setRotation(this.Lsnout, 0.0F, 0.0F, 0.0F);
/* 177 */     this.Rneck1 = new ModelRenderer(this, 40, 45);
/* 178 */     this.Rneck1.func_78789_a(-1.5F, -2.0F, -1.0F, 3, 4, 4);
/* 179 */     this.Rneck1.func_78793_a(-4.5F, 16.0F, -5.0F);
/* 180 */     this.Rneck1.func_78787_b(128, 128);
/* 181 */     this.Rneck1.field_78809_i = true;
/* 182 */     setRotation(this.Rneck1, 0.715585F, 0.0F, 0.0F);
/* 183 */     this.Rneck = new ModelRenderer(this, 40, 31);
/* 184 */     this.Rneck.func_78789_a(-1.5F, -8.0F, -1.0F, 3, 8, 3);
/* 185 */     this.Rneck.func_78793_a(-4.5F, 15.0F, -6.0F);
/* 186 */     this.Rneck.func_78787_b(128, 128);
/* 187 */     this.Rneck.field_78809_i = true;
/* 188 */     setRotation(this.Rneck, 0.0F, 0.0F, 0.0F);
/* 189 */     this.Rhead = new ModelRenderer(this, 40, 20);
/* 190 */     this.Rhead.func_78789_a(-2.0F, -3.0F, -3.5F, 4, 4, 5);
/* 191 */     this.Rhead.func_78793_a(-4.5F, 8.0F, -6.0F);
/* 192 */     this.Rhead.func_78787_b(128, 128);
/* 193 */     this.Rhead.field_78809_i = true;
/* 194 */     setRotation(this.Rhead, 0.0F, 0.0F, 0.0F);
/* 195 */     this.Rsnout = new ModelRenderer(this, 40, 11);
/* 196 */     this.Rsnout.func_78789_a(-1.5F, -2.0F, -8.5F, 3, 3, 5);
/* 197 */     this.Rsnout.func_78793_a(-4.5F, 8.0F, -6.0F);
/* 198 */     this.Rsnout.func_78787_b(128, 128);
/* 199 */     this.Rsnout.field_78809_i = true;
/* 200 */     setRotation(this.Rsnout, 0.0F, 0.0F, 0.0F);
/* 201 */     this.headfin = new ModelRenderer(this, 20, 0);
/* 202 */     this.headfin.func_78789_a(-0.5F, -3.0F, 1.0F, 1, 4, 3);
/* 203 */     this.headfin.func_78793_a(0.0F, 8.0F, -6.0F);
/* 204 */     this.headfin.func_78787_b(128, 128);
/* 205 */     this.headfin.field_78809_i = true;
/* 206 */     setRotation(this.headfin, -0.122173F, 0.0F, 0.0F);
/* 207 */     this.Lheadfin = new ModelRenderer(this, 0, 0);
/* 208 */     this.Lheadfin.func_78789_a(-0.5F, -3.0F, 1.0F, 1, 4, 3);
/* 209 */     this.Lheadfin.func_78793_a(4.5F, 8.0F, -6.0F);
/* 210 */     this.Lheadfin.func_78787_b(128, 128);
/* 211 */     this.Lheadfin.field_78809_i = true;
/* 212 */     setRotation(this.Lheadfin, -0.122173F, 0.0F, 0.0F);
/* 213 */     this.Rheadfin = new ModelRenderer(this, 40, 0);
/* 214 */     this.Rheadfin.func_78789_a(-0.5F, -3.0F, 1.0F, 1, 4, 3);
/* 215 */     this.Rheadfin.func_78793_a(-4.5F, 8.0F, -6.0F);
/* 216 */     this.Rheadfin.func_78787_b(128, 128);
/* 217 */     this.Rheadfin.field_78809_i = true;
/* 218 */     setRotation(this.Rheadfin, -0.122173F, 0.0F, 0.0F);
/* 219 */     this.Backfin = new ModelRenderer(this, 35, 57);
/* 220 */     this.Backfin.func_78789_a(-0.5F, 0.0F, 0.0F, 1, 3, 5);
/* 221 */     this.Backfin.func_78793_a(0.0F, 12.0F, -1.0F);
/* 222 */     this.Backfin.func_78787_b(128, 128);
/* 223 */     this.Backfin.field_78809_i = true;
/* 224 */     setRotation(this.Backfin, 0.5061455F, 0.0F, 0.0F);
/* 225 */     this.Rwing2 = new ModelRenderer(this, 59, 77);
/* 226 */     this.Rwing2.func_78789_a(0.0F, 0.0F, -3.0F, 12, 0, 10);
/* 227 */     this.Rwing2.func_78793_a(6.0F, 12.6F, 0.0F);
/* 228 */     this.Rwing2.func_78787_b(128, 128);
/* 229 */     this.Rwing2.field_78809_i = true;
/* 230 */     setRotation(this.Rwing2, 0.0F, 0.0F, -0.6981317F);
/* 231 */     this.Rwing3 = new ModelRenderer(this, 59, 88);
/* 232 */     this.Rwing3.func_78789_a(0.0F, 0.0F, -3.0F, 10, 0, 10);
/* 233 */     this.Rwing3.func_78793_a(6.0F, 12.6F, 0.0F);
/* 234 */     this.Rwing3.func_78787_b(128, 128);
/* 235 */     this.Rwing3.field_78809_i = true;
/* 236 */     setRotation(this.Rwing3, 0.0F, 0.0F, -0.0698132F);
/* 237 */     this.Lwing2 = new ModelRenderer(this, 59, 11);
/* 238 */     this.Lwing2.func_78789_a(-12.0F, 0.0F, -3.0F, 12, 0, 10);
/* 239 */     this.Lwing2.func_78793_a(-6.0F, 12.6F, 0.0F);
/* 240 */     this.Lwing2.func_78787_b(128, 128);
/* 241 */     this.Lwing2.field_78809_i = true;
/* 242 */     setRotation(this.Lwing2, 0.0F, 0.0F, 0.6981317F);
/* 243 */     this.Lwing3 = new ModelRenderer(this, 59, 22);
/* 244 */     this.Lwing3.func_78789_a(-10.0F, 0.0F, -3.0F, 10, 0, 10);
/* 245 */     this.Lwing3.func_78793_a(-6.0F, 12.6F, 0.0F);
/* 246 */     this.Lwing3.func_78787_b(128, 128);
/* 247 */     this.Lwing3.field_78809_i = true;
/* 248 */     setRotation(this.Lwing3, 0.0F, 0.0F, 0.0698132F);
/* 249 */     this.Ljaw = new ModelRenderer(this, 30, 70);
/* 250 */     this.Ljaw.func_78789_a(-1.5F, 1.0F, -5.0F, 3, 1, 5);
/* 251 */     this.Ljaw.func_78793_a(4.5F, 8.0F, -7.0F);
/* 252 */     this.Ljaw.func_78787_b(128, 128);
/* 253 */     this.Ljaw.field_78809_i = true;
/* 254 */     setRotation(this.Ljaw, 0.2443461F, 0.0F, 0.0F);
/* 255 */     this.jaw = new ModelRenderer(this, 30, 80);
/* 256 */     this.jaw.func_78789_a(-1.5F, 1.0F, -5.0F, 3, 1, 5);
/* 257 */     this.jaw.func_78793_a(0.0F, 8.0F, -7.0F);
/* 258 */     this.jaw.func_78787_b(128, 128);
/* 259 */     this.jaw.field_78809_i = true;
/* 260 */     setRotation(this.jaw, 0.2443461F, 0.0F, 0.0F);
/* 261 */     this.Rjaw = new ModelRenderer(this, 30, 90);
/* 262 */     this.Rjaw.func_78789_a(-1.5F, 1.0F, -5.0F, 3, 1, 5);
/* 263 */     this.Rjaw.func_78793_a(-4.5F, 8.0F, -7.0F);
/* 264 */     this.Rjaw.func_78787_b(128, 128);
/* 265 */     this.Rjaw.field_78809_i = true;
/* 266 */     setRotation(this.Rjaw, 0.2443461F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 274 */     ThePrince c = (ThePrince)entity;
/* 275 */     float hf = 0.0F;
/* 276 */     float newangle = 0.0F;
/*     */ 
/*     */ 
/*     */     
/* 280 */     int current_activity = c.getActivity();
/*     */     
/* 282 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 283 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */     
/* 287 */     if (f1 > 0.1D || c.getAttacking() != 0) {
/* 288 */       newangle = MathHelper.func_76134_b(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.4F * f1;
/*     */     } else {
/* 290 */       newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.04F;
/*     */     } 
/*     */     
/* 293 */     this.Rwing.field_78808_h = newangle - 0.4F;
/* 294 */     this.Rwing2.field_78808_h = newangle - 0.6F;
/* 295 */     this.Rwing3.field_78808_h = newangle - 0.2F;
/* 296 */     this.Lwing.field_78808_h = -newangle + 0.4F;
/* 297 */     this.Lwing2.field_78808_h = -newangle + 0.6F;
/* 298 */     this.Lwing3.field_78808_h = -newangle + 0.2F;
/*     */ 
/*     */ 
/*     */     
/* 302 */     if (f1 > 0.1D) {
/* 303 */       newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 305 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 308 */     if (current_activity != 2 || c.getAttacking() != 0) {
/* 309 */       this.Rleg1.field_78795_f = newangle;
/* 310 */       this.Lleg1.field_78795_f = -newangle;
/*     */     } else {
/*     */       
/* 313 */       newangle = -1.0F;
/* 314 */       this.Rleg1.field_78795_f = newangle;
/* 315 */       this.Lleg1.field_78795_f = newangle;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 320 */     newangle = MathHelper.func_76134_b(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.06F;
/* 321 */     if (c.func_70906_o() == true) {
/* 322 */       newangle = 0.0F;
/*     */     }
/* 324 */     if (c.getAttacking() != 0) {
/* 325 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.12F;
/*     */     }
/* 327 */     this.tail2.field_78796_g = newangle;
/*     */     
/* 329 */     this.tail2.field_78798_e += (float)Math.cos(this.tail2.field_78796_g) * 6.0F;
/* 330 */     this.tail2.field_78800_c += (float)Math.sin(this.tail2.field_78796_g) * 6.0F;
/* 331 */     this.tail3.field_78796_g = newangle * 1.6F;
/*     */     
/* 333 */     this.tail3.field_78798_e += (float)Math.cos(this.tail3.field_78796_g) * 5.0F;
/* 334 */     this.tail3.field_78800_c += (float)Math.sin(this.tail3.field_78796_g) * 5.0F;
/* 335 */     this.tail4.field_78796_g = newangle * 2.6F;
/*     */     
/* 337 */     this.tail4.field_78798_e += (float)Math.cos(this.tail4.field_78796_g) * 4.0F;
/* 338 */     this.tail4.field_78800_c += (float)Math.sin(this.tail4.field_78796_g) * 4.0F;
/* 339 */     this.Tail5.field_78796_g = newangle * 3.6F;
/*     */     
/* 341 */     this.Tail5.field_78798_e += (float)Math.cos(this.Tail5.field_78796_g) * 4.0F;
/* 342 */     this.Tail5.field_78800_c += (float)Math.sin(this.Tail5.field_78796_g) * 4.0F;
/* 343 */     this.Tail6.field_78796_g = newangle * 4.6F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 348 */     float h3 = f3 * 2.0F / 3.0F, h2 = h3, h1 = h2;
/* 349 */     float d3 = f4 * 2.0F / 3.0F, d2 = d3, d1 = d2;
/* 350 */     if (h1 < 0.0F) {
/* 351 */       h2 = h3 = h1 / 2.0F;
/* 352 */       d2 = d3 = d1 / 2.0F;
/*     */     } else {
/* 354 */       h2 = h1 = h3 / 2.0F;
/* 355 */       d2 = d1 = d3 / 2.0F;
/*     */     } 
/* 357 */     this.head.field_78796_g = (float)Math.toRadians(h2);
/* 358 */     this.snout.field_78796_g = (float)Math.toRadians(h2);
/* 359 */     this.headfin.field_78796_g = (float)Math.toRadians(h2);
/* 360 */     this.jaw.field_78796_g = (float)Math.toRadians(h2);
/* 361 */     this.snout.field_78798_e -= (float)Math.cos(this.snout.field_78796_g);
/* 362 */     this.snout.field_78800_c -= (float)Math.sin(this.snout.field_78796_g);
/* 363 */     this.neck.field_78796_g = (float)Math.toRadians(h2) / 2.0F;
/*     */     
/* 365 */     this.Lhead.field_78796_g = (float)Math.toRadians(h1);
/* 366 */     this.Lsnout.field_78796_g = (float)Math.toRadians(h1);
/* 367 */     this.Lheadfin.field_78796_g = (float)Math.toRadians(h1);
/* 368 */     this.Ljaw.field_78796_g = (float)Math.toRadians(h1);
/* 369 */     this.Lsnout.field_78798_e -= (float)Math.cos(this.Lsnout.field_78796_g);
/* 370 */     this.Lsnout.field_78800_c -= (float)Math.sin(this.Lsnout.field_78796_g);
/* 371 */     this.Lneck.field_78796_g = (float)Math.toRadians(h1) / 2.0F;
/*     */     
/* 373 */     this.Rhead.field_78796_g = (float)Math.toRadians(h3);
/* 374 */     this.Rsnout.field_78796_g = (float)Math.toRadians(h3);
/* 375 */     this.Rheadfin.field_78796_g = (float)Math.toRadians(h3);
/* 376 */     this.Rjaw.field_78796_g = (float)Math.toRadians(h3);
/* 377 */     this.Rsnout.field_78798_e -= (float)Math.cos(this.Rsnout.field_78796_g);
/* 378 */     this.Rsnout.field_78800_c -= (float)Math.sin(this.Rsnout.field_78796_g);
/* 379 */     this.Rneck.field_78796_g = (float)Math.toRadians(h3) / 2.0F;
/*     */     
/* 381 */     float Rjx = 0.0F, jx = Rjx, Ljx = jx;
/* 382 */     if (c.getAttacking() != 0) {
/* 383 */       newangle = MathHelper.func_76134_b(f2 * 1.9F * this.wingspeed) * 3.1415927F * 0.2F;
/* 384 */       Ljx = 0.2F + newangle;
/* 385 */       newangle = MathHelper.func_76134_b(f2 * 2.1F * this.wingspeed) * 3.1415927F * 0.2F;
/* 386 */       Rjx = 0.2F + newangle;
/* 387 */       newangle = MathHelper.func_76134_b(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.2F;
/* 388 */       jx = 0.2F + newangle;
/*     */     } 
/*     */ 
/*     */     
/* 392 */     this.head.field_78795_f = (float)Math.toRadians(d2);
/* 393 */     this.snout.field_78795_f = (float)Math.toRadians(d2);
/* 394 */     this.headfin.field_78795_f = (float)Math.toRadians(d2);
/* 395 */     this.jaw.field_78795_f = (float)Math.toRadians(d2) + jx;
/*     */     
/* 397 */     this.Lhead.field_78795_f = (float)Math.toRadians(d1);
/* 398 */     this.Lsnout.field_78795_f = (float)Math.toRadians(d1);
/* 399 */     this.Lheadfin.field_78795_f = (float)Math.toRadians(d1);
/* 400 */     this.Ljaw.field_78795_f = (float)Math.toRadians(d1) + Ljx;
/*     */     
/* 402 */     this.Rhead.field_78795_f = (float)Math.toRadians(d3);
/* 403 */     this.Rsnout.field_78795_f = (float)Math.toRadians(d3);
/* 404 */     this.Rheadfin.field_78795_f = (float)Math.toRadians(d3);
/* 405 */     this.Rjaw.field_78795_f = (float)Math.toRadians(d3) + Rjx;
/*     */ 
/*     */     
/* 408 */     d1 = c.getHead1Ext();
/* 409 */     d2 = c.getHead2Ext();
/* 410 */     d3 = c.getHead3Ext();
/*     */     
/* 412 */     this.Lneck.field_78795_f = (float)Math.toRadians(d1);
/* 413 */     this.neck.field_78795_f = (float)Math.toRadians(d2);
/* 414 */     this.Rneck.field_78795_f = (float)Math.toRadians(d3);
/*     */     
/* 416 */     this.Lneck.field_78797_d -= (float)Math.cos(this.Lneck.field_78795_f) * 7.0F;
/* 417 */     this.Ljaw.field_78797_d = this.Lhead.field_78797_d;
/* 418 */     this.Lneck.field_78798_e -= (float)Math.sin(this.Lneck.field_78795_f) * 7.0F;
/* 419 */     this.Ljaw.field_78798_e = this.Lhead.field_78798_e;
/* 420 */     this.Lneck.field_78800_c -= (float)Math.sin(this.Lneck.field_78796_g) * 7.0F * (float)Math.sin(this.Lneck.field_78795_f);
/* 421 */     this.Ljaw.field_78800_c = this.Lhead.field_78800_c;
/*     */     
/* 423 */     this.Rneck.field_78797_d -= (float)Math.cos(this.Rneck.field_78795_f) * 7.0F;
/* 424 */     this.Rjaw.field_78797_d = this.Rhead.field_78797_d;
/* 425 */     this.Rneck.field_78798_e -= (float)Math.sin(this.Rneck.field_78795_f) * 7.0F;
/* 426 */     this.Rjaw.field_78798_e = this.Rhead.field_78798_e;
/* 427 */     this.Rneck.field_78800_c -= (float)Math.sin(this.Rneck.field_78796_g) * 7.0F * (float)Math.sin(this.Rneck.field_78795_f);
/* 428 */     this.Rjaw.field_78800_c = this.Rhead.field_78800_c;
/*     */     
/* 430 */     this.neck.field_78797_d -= (float)Math.cos(this.neck.field_78795_f) * 7.0F;
/* 431 */     this.jaw.field_78797_d = this.head.field_78797_d;
/* 432 */     this.neck.field_78798_e -= (float)Math.sin(this.neck.field_78795_f) * 7.0F;
/* 433 */     this.jaw.field_78798_e = this.head.field_78798_e;
/* 434 */     this.neck.field_78800_c -= (float)Math.sin(this.neck.field_78796_g) * 7.0F * (float)Math.sin(this.neck.field_78795_f);
/* 435 */     this.jaw.field_78800_c = this.head.field_78800_c;
/*     */     
/* 437 */     this.body.func_78785_a(f5);
/* 438 */     this.neck1.func_78785_a(f5);
/* 439 */     this.neck.func_78785_a(f5);
/* 440 */     this.neckbase.func_78785_a(f5);
/* 441 */     this.head.func_78785_a(f5);
/* 442 */     this.Rleg1.func_78785_a(f5);
/* 443 */     this.Lleg1.func_78785_a(f5);
/* 444 */     this.snout.func_78785_a(f5);
/* 445 */     this.tail1.func_78785_a(f5);
/* 446 */     this.tail2.func_78785_a(f5);
/* 447 */     this.tail3.func_78785_a(f5);
/* 448 */     this.tail4.func_78785_a(f5);
/* 449 */     this.Tail5.func_78785_a(f5);
/* 450 */     this.Tail6.func_78785_a(f5);
/* 451 */     this.Lneck1.func_78785_a(f5);
/* 452 */     this.Lneck.func_78785_a(f5);
/* 453 */     this.Lhead.func_78785_a(f5);
/* 454 */     this.Lsnout.func_78785_a(f5);
/* 455 */     this.Rneck1.func_78785_a(f5);
/* 456 */     this.Rneck.func_78785_a(f5);
/* 457 */     this.Rhead.func_78785_a(f5);
/* 458 */     this.Rsnout.func_78785_a(f5);
/* 459 */     this.headfin.func_78785_a(f5);
/* 460 */     this.Lheadfin.func_78785_a(f5);
/* 461 */     this.Rheadfin.func_78785_a(f5);
/* 462 */     this.Backfin.func_78785_a(f5);
/* 463 */     this.Ljaw.func_78785_a(f5);
/* 464 */     this.jaw.func_78785_a(f5);
/* 465 */     this.Rjaw.func_78785_a(f5);
/*     */     
/* 467 */     GL11.glPushMatrix();
/* 468 */     GL11.glEnable(2977);
/* 469 */     GL11.glEnable(3042);
/* 470 */     GL11.glBlendFunc(770, 771);
/*     */     
/* 472 */     GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.55F);
/* 473 */     this.Rwing2.func_78785_a(f5);
/* 474 */     this.Rwing3.func_78785_a(f5);
/* 475 */     this.Lwing2.func_78785_a(f5);
/* 476 */     this.Lwing3.func_78785_a(f5);
/* 477 */     this.Lwing.func_78785_a(f5);
/* 478 */     this.Rwing.func_78785_a(f5);
/* 479 */     GL11.glDisable(3042);
/* 480 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 485 */     model.field_78795_f = x;
/* 486 */     model.field_78796_g = y;
/* 487 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 492 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelThePrince.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */