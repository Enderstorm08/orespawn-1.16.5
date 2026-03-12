/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelMolenoid
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer shoulders;
/*     */   
/*     */   ModelRenderer head1;
/*     */   ModelRenderer head2;
/*     */   ModelRenderer head3;
/*     */   ModelRenderer nosestar1;
/*     */   ModelRenderer nosestar2;
/*     */   ModelRenderer nosestar3;
/*     */   ModelRenderer larm;
/*     */   ModelRenderer lhand;
/*     */   ModelRenderer lclaw1;
/*     */   ModelRenderer lclaw2;
/*     */   ModelRenderer lclaw3;
/*     */   ModelRenderer lclaw4;
/*     */   ModelRenderer nosestar4;
/*     */   ModelRenderer nosestar5;
/*     */   ModelRenderer nosestar6;
/*     */   ModelRenderer butt;
/*     */   ModelRenderer tail;
/*     */   ModelRenderer lleg;
/*     */   ModelRenderer lfoot;
/*     */   ModelRenderer ltoe1;
/*     */   ModelRenderer ltoe2;
/*     */   ModelRenderer ltoe3;
/*     */   ModelRenderer ltoe4;
/*     */   ModelRenderer rarm;
/*     */   ModelRenderer rhand;
/*     */   ModelRenderer rclaw1;
/*     */   ModelRenderer rclaw2;
/*     */   ModelRenderer rclaw3;
/*     */   ModelRenderer rclaw4;
/*     */   ModelRenderer rleg;
/*     */   ModelRenderer rfoot;
/*     */   ModelRenderer rtoe1;
/*     */   ModelRenderer rtoe2;
/*     */   ModelRenderer rtoe3;
/*     */   ModelRenderer rtoe4;
/*     */   
/*     */   public ModelMolenoid(float f1) {
/*  54 */     this.wingspeed = f1;
/*     */     
/*  56 */     this.field_78090_t = 256;
/*  57 */     this.field_78089_u = 256;
/*     */     
/*  59 */     this.body = new ModelRenderer(this, 0, 176);
/*  60 */     this.body.func_78789_a(-16.0F, 0.0F, 0.0F, 32, 20, 56);
/*  61 */     this.body.func_78793_a(0.0F, 1.0F, 6.0F);
/*  62 */     this.body.func_78787_b(64, 32);
/*  63 */     this.body.field_78809_i = true;
/*  64 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  65 */     this.shoulders = new ModelRenderer(this, 0, 143);
/*  66 */     this.shoulders.func_78789_a(-17.0F, 0.0F, 0.0F, 34, 17, 10);
/*  67 */     this.shoulders.func_78793_a(0.0F, 3.0F, -4.0F);
/*  68 */     this.shoulders.func_78787_b(64, 32);
/*  69 */     this.shoulders.field_78809_i = true;
/*  70 */     setRotation(this.shoulders, 0.0F, 0.0F, 0.0F);
/*  71 */     this.head1 = new ModelRenderer(this, 0, 114);
/*  72 */     this.head1.func_78789_a(-14.0F, 0.0F, 0.0F, 28, 14, 10);
/*  73 */     this.head1.func_78793_a(0.0F, 5.0F, -14.0F);
/*  74 */     this.head1.func_78787_b(64, 32);
/*  75 */     this.head1.field_78809_i = true;
/*  76 */     setRotation(this.head1, 0.0F, 0.0F, 0.0F);
/*  77 */     this.head2 = new ModelRenderer(this, 0, 89);
/*  78 */     this.head2.func_78789_a(-11.0F, 0.0F, 0.0F, 22, 10, 10);
/*  79 */     this.head2.func_78793_a(0.0F, 6.0F, -24.0F);
/*  80 */     this.head2.func_78787_b(64, 32);
/*  81 */     this.head2.field_78809_i = true;
/*  82 */     setRotation(this.head2, 0.0F, 0.0F, 0.0F);
/*  83 */     this.head3 = new ModelRenderer(this, 0, 67);
/*  84 */     this.head3.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 8, 10);
/*  85 */     this.head3.func_78793_a(0.0F, 7.0F, -34.0F);
/*  86 */     this.head3.func_78787_b(64, 32);
/*  87 */     this.head3.field_78809_i = true;
/*  88 */     setRotation(this.head3, 0.0F, 0.0F, 0.0F);
/*  89 */     this.nosestar1 = new ModelRenderer(this, 0, 32);
/*  90 */     this.nosestar1.func_78789_a(-0.5F, -8.0F, 0.0F, 1, 16, 1);
/*  91 */     this.nosestar1.func_78793_a(0.0F, 11.0F, -35.0F);
/*  92 */     this.nosestar1.func_78787_b(64, 32);
/*  93 */     this.nosestar1.field_78809_i = true;
/*  94 */     setRotation(this.nosestar1, 0.0F, 0.0F, 0.0F);
/*  95 */     this.nosestar2 = new ModelRenderer(this, 20, 32);
/*  96 */     this.nosestar2.func_78789_a(-0.5F, -8.0F, 0.0F, 1, 16, 1);
/*  97 */     this.nosestar2.func_78793_a(0.0F, 11.0F, -35.0F);
/*  98 */     this.nosestar2.func_78787_b(64, 32);
/*  99 */     this.nosestar2.field_78809_i = true;
/* 100 */     setRotation(this.nosestar2, 0.0F, 0.0F, 1.047198F);
/* 101 */     this.nosestar3 = new ModelRenderer(this, 40, 32);
/* 102 */     this.nosestar3.func_78789_a(-0.5F, -8.0F, 0.0F, 1, 16, 1);
/* 103 */     this.nosestar3.func_78793_a(0.0F, 11.0F, -35.0F);
/* 104 */     this.nosestar3.func_78787_b(64, 32);
/* 105 */     this.nosestar3.field_78809_i = true;
/* 106 */     setRotation(this.nosestar3, 0.0F, 0.0F, -1.047198F);
/* 107 */     this.larm = new ModelRenderer(this, 80, 0);
/* 108 */     this.larm.func_78789_a(0.0F, 0.0F, -2.0F, 17, 11, 5);
/* 109 */     this.larm.func_78793_a(13.0F, 8.0F, 0.0F);
/* 110 */     this.larm.func_78787_b(64, 32);
/* 111 */     this.larm.field_78809_i = true;
/* 112 */     setRotation(this.larm, 0.0F, 0.6283185F, 0.0F);
/* 113 */     this.lhand = new ModelRenderer(this, 80, 20);
/* 114 */     this.lhand.func_78789_a(0.0F, 0.0F, -2.0F, 12, 14, 4);
/* 115 */     this.lhand.func_78793_a(25.0F, 7.0F, -9.0F);
/* 116 */     this.lhand.func_78787_b(64, 32);
/* 117 */     this.lhand.field_78809_i = true;
/* 118 */     setRotation(this.lhand, 0.0F, 0.0F, 0.0F);
/* 119 */     this.lclaw1 = new ModelRenderer(this, 80, 42);
/* 120 */     this.lclaw1.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 121 */     this.lclaw1.func_78793_a(35.0F, 20.0F, -9.0F);
/* 122 */     this.lclaw1.func_78787_b(64, 32);
/* 123 */     this.lclaw1.field_78809_i = true;
/* 124 */     setRotation(this.lclaw1, 0.0F, -0.1745329F, 0.0F);
/* 125 */     this.lclaw2 = new ModelRenderer(this, 80, 52);
/* 126 */     this.lclaw2.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 127 */     this.lclaw2.func_78793_a(35.0F, 15.0F, -9.0F);
/* 128 */     this.lclaw2.func_78787_b(64, 32);
/* 129 */     this.lclaw2.field_78809_i = true;
/* 130 */     setRotation(this.lclaw2, 0.0F, -0.1745329F, 0.0F);
/* 131 */     this.lclaw3 = new ModelRenderer(this, 80, 62);
/* 132 */     this.lclaw3.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 133 */     this.lclaw3.func_78793_a(35.0F, 10.0F, -9.0F);
/* 134 */     this.lclaw3.func_78787_b(64, 32);
/* 135 */     this.lclaw3.field_78809_i = true;
/* 136 */     setRotation(this.lclaw3, 0.0F, -0.1745329F, 0.0F);
/* 137 */     this.lclaw4 = new ModelRenderer(this, 80, 72);
/* 138 */     this.lclaw4.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 139 */     this.lclaw4.func_78793_a(35.0F, 5.0F, -9.0F);
/* 140 */     this.lclaw4.func_78787_b(64, 32);
/* 141 */     this.lclaw4.field_78809_i = true;
/* 142 */     setRotation(this.lclaw4, 0.0F, -0.1745329F, 0.0F);
/* 143 */     this.nosestar4 = new ModelRenderer(this, 10, 32);
/* 144 */     this.nosestar4.func_78789_a(-0.5F, -8.0F, 0.0F, 1, 16, 1);
/* 145 */     this.nosestar4.func_78793_a(0.0F, 11.0F, -35.0F);
/* 146 */     this.nosestar4.func_78787_b(64, 32);
/* 147 */     this.nosestar4.field_78809_i = true;
/* 148 */     setRotation(this.nosestar4, 0.0F, 0.0F, 0.5235988F);
/* 149 */     this.nosestar5 = new ModelRenderer(this, 30, 32);
/* 150 */     this.nosestar5.func_78789_a(-0.5F, -8.0F, 0.0F, 1, 16, 1);
/* 151 */     this.nosestar5.func_78793_a(0.0F, 11.0F, -35.0F);
/* 152 */     this.nosestar5.func_78787_b(64, 32);
/* 153 */     this.nosestar5.field_78809_i = true;
/* 154 */     setRotation(this.nosestar5, 0.0F, 0.0F, 1.570796F);
/* 155 */     this.nosestar6 = new ModelRenderer(this, 50, 32);
/* 156 */     this.nosestar6.func_78789_a(-0.5F, -8.0F, 0.0F, 1, 16, 1);
/* 157 */     this.nosestar6.func_78793_a(0.0F, 11.0F, -35.0F);
/* 158 */     this.nosestar6.func_78787_b(64, 32);
/* 159 */     this.nosestar6.field_78809_i = true;
/* 160 */     setRotation(this.nosestar6, 0.0F, 0.0F, -0.5235988F);
/* 161 */     this.butt = new ModelRenderer(this, 196, 215);
/* 162 */     this.butt.func_78789_a(-11.0F, 0.0F, 0.0F, 22, 11, 5);
/* 163 */     this.butt.func_78793_a(0.0F, 6.0F, 62.0F);
/* 164 */     this.butt.func_78787_b(64, 32);
/* 165 */     this.butt.field_78809_i = true;
/* 166 */     setRotation(this.butt, 0.0F, 0.0F, 0.0F);
/* 167 */     this.tail = new ModelRenderer(this, 196, 200);
/* 168 */     this.tail.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 3, 5);
/* 169 */     this.tail.func_78793_a(0.0F, 7.0F, 67.0F);
/* 170 */     this.tail.func_78787_b(64, 32);
/* 171 */     this.tail.field_78809_i = true;
/* 172 */     setRotation(this.tail, 0.0F, 0.0F, 0.0F);
/* 173 */     this.lleg = new ModelRenderer(this, 90, 80);
/* 174 */     this.lleg.func_78789_a(0.0F, 0.0F, -2.0F, 17, 11, 5);
/* 175 */     this.lleg.func_78793_a(14.0F, 9.0F, 58.0F);
/* 176 */     this.lleg.func_78787_b(64, 32);
/* 177 */     this.lleg.field_78809_i = true;
/* 178 */     setRotation(this.lleg, 0.0F, 0.6283185F, 0.0F);
/* 179 */     this.lfoot = new ModelRenderer(this, 90, 100);
/* 180 */     this.lfoot.func_78789_a(0.0F, 0.0F, -2.0F, 12, 14, 4);
/* 181 */     this.lfoot.func_78793_a(26.0F, 8.0F, 49.0F);
/* 182 */     this.lfoot.func_78787_b(64, 32);
/* 183 */     this.lfoot.field_78809_i = true;
/* 184 */     setRotation(this.lfoot, 0.0F, 0.0F, 0.0F);
/* 185 */     this.ltoe1 = new ModelRenderer(this, 90, 120);
/* 186 */     this.ltoe1.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 187 */     this.ltoe1.func_78793_a(36.0F, 21.0F, 48.0F);
/* 188 */     this.ltoe1.func_78787_b(64, 32);
/* 189 */     this.ltoe1.field_78809_i = true;
/* 190 */     setRotation(this.ltoe1, 0.0F, -0.2617994F, 0.0F);
/* 191 */     this.ltoe2 = new ModelRenderer(this, 90, 130);
/* 192 */     this.ltoe2.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 193 */     this.ltoe2.func_78793_a(36.0F, 16.0F, 48.0F);
/* 194 */     this.ltoe2.func_78787_b(64, 32);
/* 195 */     this.ltoe2.field_78809_i = true;
/* 196 */     setRotation(this.ltoe2, 0.0F, -0.2617994F, 0.0F);
/* 197 */     this.ltoe3 = new ModelRenderer(this, 90, 140);
/* 198 */     this.ltoe3.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 199 */     this.ltoe3.func_78793_a(36.0F, 11.0F, 48.0F);
/* 200 */     this.ltoe3.func_78787_b(64, 32);
/* 201 */     this.ltoe3.field_78809_i = true;
/* 202 */     setRotation(this.ltoe3, 0.0F, -0.2617994F, 0.0F);
/* 203 */     this.ltoe4 = new ModelRenderer(this, 90, 150);
/* 204 */     this.ltoe4.func_78789_a(0.0F, 0.0F, -1.0F, 13, 3, 2);
/* 205 */     this.ltoe4.func_78793_a(36.0F, 6.0F, 48.0F);
/* 206 */     this.ltoe4.func_78787_b(64, 32);
/* 207 */     this.ltoe4.field_78809_i = true;
/* 208 */     setRotation(this.ltoe4, 0.0F, -0.2617994F, 0.0F);
/* 209 */     this.rarm = new ModelRenderer(this, 130, 0);
/* 210 */     this.rarm.func_78789_a(-17.0F, 0.0F, -2.0F, 17, 11, 5);
/* 211 */     this.rarm.func_78793_a(-14.0F, 8.0F, 0.0F);
/* 212 */     this.rarm.func_78787_b(64, 32);
/* 213 */     this.rarm.field_78809_i = true;
/* 214 */     setRotation(this.rarm, 0.0F, -0.6283185F, 0.0F);
/* 215 */     this.rhand = new ModelRenderer(this, 130, 20);
/* 216 */     this.rhand.func_78789_a(-12.0F, 0.0F, -2.0F, 12, 14, 4);
/* 217 */     this.rhand.func_78793_a(-26.0F, 7.0F, -9.0F);
/* 218 */     this.rhand.func_78787_b(64, 32);
/* 219 */     this.rhand.field_78809_i = true;
/* 220 */     setRotation(this.rhand, 0.0F, 0.0F, 0.0F);
/* 221 */     this.rclaw1 = new ModelRenderer(this, 130, 42);
/* 222 */     this.rclaw1.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 223 */     this.rclaw1.func_78793_a(-36.0F, 20.0F, -9.0F);
/* 224 */     this.rclaw1.func_78787_b(64, 32);
/* 225 */     this.rclaw1.field_78809_i = true;
/* 226 */     setRotation(this.rclaw1, 0.0F, 0.1745329F, 0.0F);
/* 227 */     this.rclaw2 = new ModelRenderer(this, 130, 52);
/* 228 */     this.rclaw2.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 229 */     this.rclaw2.func_78793_a(-36.0F, 15.0F, -9.0F);
/* 230 */     this.rclaw2.func_78787_b(64, 32);
/* 231 */     this.rclaw2.field_78809_i = true;
/* 232 */     setRotation(this.rclaw2, 0.0F, 0.1745329F, 0.0F);
/* 233 */     this.rclaw3 = new ModelRenderer(this, 130, 62);
/* 234 */     this.rclaw3.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 235 */     this.rclaw3.func_78793_a(-36.0F, 10.0F, -9.0F);
/* 236 */     this.rclaw3.func_78787_b(64, 32);
/* 237 */     this.rclaw3.field_78809_i = true;
/* 238 */     setRotation(this.rclaw3, 0.0F, 0.1745329F, 0.0F);
/* 239 */     this.rclaw4 = new ModelRenderer(this, 130, 72);
/* 240 */     this.rclaw4.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 241 */     this.rclaw4.func_78793_a(-36.0F, 5.0F, -9.0F);
/* 242 */     this.rclaw4.func_78787_b(64, 32);
/* 243 */     this.rclaw4.field_78809_i = true;
/* 244 */     setRotation(this.rclaw4, 0.0F, 0.1745329F, 0.0F);
/* 245 */     this.rleg = new ModelRenderer(this, 150, 80);
/* 246 */     this.rleg.func_78789_a(-17.0F, 0.0F, -2.0F, 17, 11, 5);
/* 247 */     this.rleg.func_78793_a(-14.0F, 9.0F, 58.0F);
/* 248 */     this.rleg.func_78787_b(64, 32);
/* 249 */     this.rleg.field_78809_i = true;
/* 250 */     setRotation(this.rleg, 0.0F, -0.6283185F, 0.0F);
/* 251 */     this.rfoot = new ModelRenderer(this, 150, 100);
/* 252 */     this.rfoot.func_78789_a(-12.0F, 0.0F, -2.0F, 12, 14, 4);
/* 253 */     this.rfoot.func_78793_a(-26.0F, 8.0F, 49.0F);
/* 254 */     this.rfoot.func_78787_b(64, 32);
/* 255 */     this.rfoot.field_78809_i = true;
/* 256 */     setRotation(this.rfoot, 0.0F, 0.0F, 0.0F);
/* 257 */     this.rtoe1 = new ModelRenderer(this, 150, 120);
/* 258 */     this.rtoe1.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 259 */     this.rtoe1.func_78793_a(-36.0F, 21.0F, 48.0F);
/* 260 */     this.rtoe1.func_78787_b(64, 32);
/* 261 */     this.rtoe1.field_78809_i = true;
/* 262 */     setRotation(this.rtoe1, 0.0F, 0.2617994F, 0.0F);
/* 263 */     this.rtoe2 = new ModelRenderer(this, 150, 130);
/* 264 */     this.rtoe2.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 265 */     this.rtoe2.func_78793_a(-36.0F, 16.0F, 48.0F);
/* 266 */     this.rtoe2.func_78787_b(64, 32);
/* 267 */     this.rtoe2.field_78809_i = true;
/* 268 */     setRotation(this.rtoe2, 0.0F, 0.2617994F, 0.0F);
/* 269 */     this.rtoe3 = new ModelRenderer(this, 150, 140);
/* 270 */     this.rtoe3.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 271 */     this.rtoe3.func_78793_a(-36.0F, 11.0F, 48.0F);
/* 272 */     this.rtoe3.func_78787_b(64, 32);
/* 273 */     this.rtoe3.field_78809_i = true;
/* 274 */     setRotation(this.rtoe3, 0.0F, 0.2617994F, 0.0F);
/* 275 */     this.rtoe4 = new ModelRenderer(this, 150, 150);
/* 276 */     this.rtoe4.func_78789_a(-13.0F, 0.0F, -1.0F, 13, 3, 2);
/* 277 */     this.rtoe4.func_78793_a(-36.0F, 6.0F, 48.0F);
/* 278 */     this.rtoe4.func_78787_b(64, 32);
/* 279 */     this.rtoe4.field_78809_i = true;
/* 280 */     setRotation(this.rtoe4, 0.0F, 0.2617994F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 286 */     Molenoid e = (Molenoid)entity;
/* 287 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 288 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 289 */     float newangle = 0.0F;
/*     */     
/* 291 */     if (e.getAttacking() != 0) {
/* 292 */       newangle = MathHelper.func_76134_b(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.25F;
/*     */     }
/* 294 */     else if (f1 > 0.1F) {
/* 295 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 297 */       newangle = 0.0F;
/*     */     } 
/*     */ 
/*     */     
/* 301 */     this.larm.field_78796_g = newangle + 0.628F;
/* 302 */     this.larm.field_78798_e -= (float)Math.sin(this.larm.field_78796_g) * 15.0F;
/* 303 */     this.larm.field_78800_c += (float)Math.cos(this.larm.field_78796_g) * 15.0F;
/* 304 */     this.lhand.field_78796_g = newangle * 1.25F;
/* 305 */     this.lhand.field_78798_e -= (float)Math.sin(this.lhand.field_78796_g) * 10.0F;
/* 306 */     this.lhand.field_78800_c += (float)Math.cos(this.lhand.field_78796_g) * 10.0F;
/* 307 */     this.lclaw1.field_78796_g = newangle * 1.5F - 0.174F;
/* 308 */     this.lclaw2.field_78798_e = this.lclaw1.field_78798_e;
/* 309 */     this.lclaw2.field_78800_c = this.lclaw1.field_78800_c;
/* 310 */     this.lclaw2.field_78796_g = this.lclaw1.field_78796_g;
/* 311 */     this.lclaw3.field_78798_e = this.lclaw1.field_78798_e;
/* 312 */     this.lclaw3.field_78800_c = this.lclaw1.field_78800_c;
/* 313 */     this.lclaw3.field_78796_g = this.lclaw1.field_78796_g;
/* 314 */     this.lclaw4.field_78798_e = this.lclaw1.field_78798_e;
/* 315 */     this.lclaw4.field_78800_c = this.lclaw1.field_78800_c;
/* 316 */     this.lclaw4.field_78796_g = this.lclaw1.field_78796_g;
/*     */     
/* 318 */     this.rarm.field_78796_g = newangle - 0.628F;
/* 319 */     this.rarm.field_78798_e += (float)Math.sin(this.rarm.field_78796_g) * 15.0F;
/* 320 */     this.rarm.field_78800_c -= (float)Math.cos(this.rarm.field_78796_g) * 15.0F;
/* 321 */     this.rhand.field_78796_g = newangle * 1.25F;
/* 322 */     this.rhand.field_78798_e += (float)Math.sin(this.rhand.field_78796_g) * 10.0F;
/* 323 */     this.rhand.field_78800_c -= (float)Math.cos(this.rhand.field_78796_g) * 10.0F;
/* 324 */     this.rclaw1.field_78796_g = newangle * 1.5F + 0.174F;
/* 325 */     this.rclaw2.field_78798_e = this.rclaw1.field_78798_e;
/* 326 */     this.rclaw2.field_78800_c = this.rclaw1.field_78800_c;
/* 327 */     this.rclaw2.field_78796_g = this.rclaw1.field_78796_g;
/* 328 */     this.rclaw3.field_78798_e = this.rclaw1.field_78798_e;
/* 329 */     this.rclaw3.field_78800_c = this.rclaw1.field_78800_c;
/* 330 */     this.rclaw3.field_78796_g = this.rclaw1.field_78796_g;
/* 331 */     this.rclaw4.field_78798_e = this.rclaw1.field_78798_e;
/* 332 */     this.rclaw4.field_78800_c = this.rclaw1.field_78800_c;
/* 333 */     this.rclaw4.field_78796_g = this.rclaw1.field_78796_g;
/*     */     
/* 335 */     if (f1 > 0.1F) {
/* 336 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 338 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 341 */     this.lleg.field_78796_g = -newangle + 0.628F;
/* 342 */     this.lleg.field_78798_e -= (float)Math.sin(this.lleg.field_78796_g) * 15.0F;
/* 343 */     this.lleg.field_78800_c += (float)Math.cos(this.lleg.field_78796_g) * 15.0F;
/* 344 */     this.lfoot.field_78796_g = -newangle * 1.25F;
/* 345 */     this.lfoot.field_78798_e -= (float)Math.sin(this.lfoot.field_78796_g) * 10.0F;
/* 346 */     this.lfoot.field_78800_c += (float)Math.cos(this.lfoot.field_78796_g) * 10.0F;
/* 347 */     this.ltoe1.field_78796_g = -newangle * 1.5F - 0.261F;
/* 348 */     this.ltoe2.field_78798_e = this.ltoe1.field_78798_e;
/* 349 */     this.ltoe2.field_78800_c = this.ltoe1.field_78800_c;
/* 350 */     this.ltoe2.field_78796_g = this.ltoe1.field_78796_g;
/* 351 */     this.ltoe3.field_78798_e = this.ltoe1.field_78798_e;
/* 352 */     this.ltoe3.field_78800_c = this.ltoe1.field_78800_c;
/* 353 */     this.ltoe3.field_78796_g = this.ltoe1.field_78796_g;
/* 354 */     this.ltoe4.field_78798_e = this.ltoe1.field_78798_e;
/* 355 */     this.ltoe4.field_78800_c = this.ltoe1.field_78800_c;
/* 356 */     this.ltoe4.field_78796_g = this.ltoe1.field_78796_g;
/*     */     
/* 358 */     this.rleg.field_78796_g = -newangle - 0.628F;
/* 359 */     this.rleg.field_78798_e += (float)Math.sin(this.rleg.field_78796_g) * 15.0F;
/* 360 */     this.rleg.field_78800_c -= (float)Math.cos(this.rleg.field_78796_g) * 15.0F;
/* 361 */     this.rfoot.field_78796_g = -newangle * 1.25F;
/* 362 */     this.rfoot.field_78798_e += (float)Math.sin(this.rfoot.field_78796_g) * 10.0F;
/* 363 */     this.rfoot.field_78800_c -= (float)Math.cos(this.rfoot.field_78796_g) * 10.0F;
/* 364 */     this.rtoe1.field_78796_g = -newangle * 1.5F + 0.261F;
/* 365 */     this.rtoe2.field_78798_e = this.rtoe1.field_78798_e;
/* 366 */     this.rtoe2.field_78800_c = this.rtoe1.field_78800_c;
/* 367 */     this.rtoe2.field_78796_g = this.rtoe1.field_78796_g;
/* 368 */     this.rtoe3.field_78798_e = this.rtoe1.field_78798_e;
/* 369 */     this.rtoe3.field_78800_c = this.rtoe1.field_78800_c;
/* 370 */     this.rtoe3.field_78796_g = this.rtoe1.field_78796_g;
/* 371 */     this.rtoe4.field_78798_e = this.rtoe1.field_78798_e;
/* 372 */     this.rtoe4.field_78800_c = this.rtoe1.field_78800_c;
/* 373 */     this.rtoe4.field_78796_g = this.rtoe1.field_78796_g;
/*     */     
/* 375 */     newangle = MathHelper.func_76134_b(f2 * 0.1F * this.wingspeed) * 3.1415927F;
/* 376 */     this.nosestar1.field_78808_h = newangle;
/* 377 */     this.nosestar2.field_78808_h = newangle + 0.523F;
/* 378 */     this.nosestar3.field_78808_h = newangle + 1.047F;
/* 379 */     this.nosestar4.field_78808_h = newangle + 1.57F;
/* 380 */     this.nosestar5.field_78808_h = newangle - 1.047F;
/* 381 */     this.nosestar6.field_78808_h = newangle - 0.523F;
/*     */     
/* 383 */     this.body.func_78785_a(f5);
/* 384 */     this.shoulders.func_78785_a(f5);
/* 385 */     this.head1.func_78785_a(f5);
/* 386 */     this.head2.func_78785_a(f5);
/* 387 */     this.head3.func_78785_a(f5);
/* 388 */     this.nosestar1.func_78785_a(f5);
/* 389 */     this.nosestar2.func_78785_a(f5);
/* 390 */     this.nosestar3.func_78785_a(f5);
/* 391 */     this.larm.func_78785_a(f5);
/* 392 */     this.lhand.func_78785_a(f5);
/* 393 */     this.lclaw1.func_78785_a(f5);
/* 394 */     this.lclaw2.func_78785_a(f5);
/* 395 */     this.lclaw3.func_78785_a(f5);
/* 396 */     this.lclaw4.func_78785_a(f5);
/* 397 */     this.nosestar4.func_78785_a(f5);
/* 398 */     this.nosestar5.func_78785_a(f5);
/* 399 */     this.nosestar6.func_78785_a(f5);
/* 400 */     this.butt.func_78785_a(f5);
/* 401 */     this.tail.func_78785_a(f5);
/* 402 */     this.lleg.func_78785_a(f5);
/* 403 */     this.lfoot.func_78785_a(f5);
/* 404 */     this.ltoe1.func_78785_a(f5);
/* 405 */     this.ltoe2.func_78785_a(f5);
/* 406 */     this.ltoe3.func_78785_a(f5);
/* 407 */     this.ltoe4.func_78785_a(f5);
/* 408 */     this.rarm.func_78785_a(f5);
/* 409 */     this.rhand.func_78785_a(f5);
/* 410 */     this.rclaw1.func_78785_a(f5);
/* 411 */     this.rclaw2.func_78785_a(f5);
/* 412 */     this.rclaw3.func_78785_a(f5);
/* 413 */     this.rclaw4.func_78785_a(f5);
/* 414 */     this.rleg.func_78785_a(f5);
/* 415 */     this.rfoot.func_78785_a(f5);
/* 416 */     this.rtoe1.func_78785_a(f5);
/* 417 */     this.rtoe2.func_78785_a(f5);
/* 418 */     this.rtoe3.func_78785_a(f5);
/* 419 */     this.rtoe4.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 425 */     model.field_78795_f = x;
/* 426 */     model.field_78796_g = y;
/* 427 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 432 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelMolenoid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */