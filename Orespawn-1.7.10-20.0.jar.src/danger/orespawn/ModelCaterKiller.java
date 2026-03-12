/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelCaterKiller
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Head;
/*     */   
/*     */   ModelRenderer falsehead;
/*     */   
/*     */   ModelRenderer seg1;
/*     */   ModelRenderer ltusk1;
/*     */   ModelRenderer ltusk2;
/*     */   ModelRenderer rtusk1;
/*     */   ModelRenderer rtusk2;
/*     */   ModelRenderer ljaw;
/*     */   ModelRenderer rjaw;
/*     */   ModelRenderer seg1lspike;
/*     */   ModelRenderer seg1rspike;
/*     */   ModelRenderer seg1ltopspike;
/*     */   ModelRenderer seg1rtopspike;
/*     */   ModelRenderer seg1lleg;
/*     */   ModelRenderer seg1rleg;
/*     */   ModelRenderer seg2;
/*     */   ModelRenderer seg2lfoot;
/*     */   ModelRenderer seg2rfoot;
/*     */   ModelRenderer seg2ltopspike;
/*     */   ModelRenderer seg2rtopspike;
/*     */   ModelRenderer seg2lspike;
/*     */   ModelRenderer seg2rspike;
/*     */   ModelRenderer seg3;
/*     */   ModelRenderer seg3lfoot;
/*     */   ModelRenderer seg3rfoot;
/*     */   ModelRenderer seg3lspike;
/*     */   ModelRenderer seg3rspike;
/*     */   ModelRenderer seg3ltopspike;
/*     */   ModelRenderer seg3rtopspike;
/*     */   ModelRenderer seg3lbackspike;
/*     */   ModelRenderer seg3rbackspike;
/*     */   
/*     */   public ModelCaterKiller(float f1) {
/*  48 */     this.wingspeed = f1;
/*     */     
/*  50 */     this.field_78090_t = 256;
/*  51 */     this.field_78089_u = 512;
/*     */     
/*  53 */     this.Head = new ModelRenderer(this, 0, 50);
/*  54 */     this.Head.func_78789_a(-8.0F, -8.0F, -8.0F, 16, 16, 8);
/*  55 */     this.Head.func_78793_a(0.0F, -8.0F, -12.0F);
/*  56 */     this.Head.func_78787_b(64, 32);
/*  57 */     this.Head.field_78809_i = true;
/*  58 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  59 */     this.falsehead = new ModelRenderer(this, 0, 100);
/*  60 */     this.falsehead.func_78789_a(-10.0F, -27.0F, -11.0F, 20, 20, 10);
/*  61 */     this.falsehead.func_78793_a(0.0F, -8.0F, -12.0F);
/*  62 */     this.falsehead.func_78787_b(64, 32);
/*  63 */     this.falsehead.field_78809_i = true;
/*  64 */     setRotation(this.falsehead, -0.1570796F, 0.0F, 0.0F);
/*  65 */     this.seg1 = new ModelRenderer(this, 0, 200);
/*  66 */     this.seg1.func_78789_a(-14.0F, -31.0F, 0.0F, 28, 32, 14);
/*  67 */     this.seg1.func_78793_a(0.0F, -8.0F, -12.0F);
/*  68 */     this.seg1.func_78787_b(64, 32);
/*  69 */     this.seg1.field_78809_i = true;
/*  70 */     setRotation(this.seg1, 0.0F, 0.0F, 0.0F);
/*  71 */     this.ltusk1 = new ModelRenderer(this, 0, 140);
/*  72 */     this.ltusk1.func_78789_a(-1.0F, -1.0F, -1.0F, 33, 3, 3);
/*  73 */     this.ltusk1.func_78793_a(9.0F, -25.0F, -19.0F);
/*  74 */     this.ltusk1.func_78787_b(64, 32);
/*  75 */     this.ltusk1.field_78809_i = true;
/*  76 */     setRotation(this.ltusk1, 0.0F, 0.5585054F, 0.0F);
/*  77 */     this.ltusk2 = new ModelRenderer(this, 0, 160);
/*  78 */     this.ltusk2.func_78789_a(0.0F, 0.0F, 0.0F, 20, 1, 1);
/*  79 */     this.ltusk2.func_78793_a(36.0F, -25.0F, -36.0F);
/*  80 */     this.ltusk2.func_78787_b(64, 32);
/*  81 */     this.ltusk2.field_78809_i = true;
/*  82 */     setRotation(this.ltusk2, 0.0F, 0.8028515F, 0.0F);
/*  83 */     this.rtusk1 = new ModelRenderer(this, 0, 150);
/*  84 */     this.rtusk1.func_78789_a(-33.0F, 0.0F, 0.0F, 33, 3, 3);
/*  85 */     this.rtusk1.func_78793_a(-8.0F, -25.0F, -17.0F);
/*  86 */     this.rtusk1.func_78787_b(64, 32);
/*  87 */     this.rtusk1.field_78809_i = true;
/*  88 */     setRotation(this.rtusk1, 0.0F, -0.5585054F, 0.0F);
/*  89 */     this.rtusk2 = new ModelRenderer(this, 0, 170);
/*  90 */     this.rtusk2.func_78789_a(-20.0F, 0.0F, 0.0F, 20, 1, 1);
/*  91 */     this.rtusk2.func_78793_a(-36.0F, -24.0F, -34.0F);
/*  92 */     this.rtusk2.func_78787_b(64, 32);
/*  93 */     this.rtusk2.field_78809_i = true;
/*  94 */     setRotation(this.rtusk2, 0.0F, -0.8028515F, 0.0F);
/*  95 */     this.ljaw = new ModelRenderer(this, 100, 50);
/*  96 */     this.ljaw.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 4);
/*  97 */     this.ljaw.func_78793_a(4.0F, -1.0F, -18.0F);
/*  98 */     this.ljaw.func_78787_b(64, 32);
/*  99 */     this.ljaw.field_78809_i = true;
/* 100 */     setRotation(this.ljaw, 0.0F, 0.0F, 0.1396263F);
/* 101 */     this.rjaw = new ModelRenderer(this, 125, 50);
/* 102 */     this.rjaw.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 4);
/* 103 */     this.rjaw.func_78793_a(-5.0F, -1.0F, -18.0F);
/* 104 */     this.rjaw.func_78787_b(64, 32);
/* 105 */     this.rjaw.field_78809_i = true;
/* 106 */     setRotation(this.rjaw, 0.0F, 0.0F, -0.1396263F);
/* 107 */     this.seg1lspike = new ModelRenderer(this, 0, 260);
/* 108 */     this.seg1lspike.func_78789_a(-1.0F, -1.0F, -1.0F, 33, 2, 2);
/* 109 */     this.seg1lspike.func_78793_a(14.0F, -32.0F, -6.0F);
/* 110 */     this.seg1lspike.func_78787_b(64, 32);
/* 111 */     this.seg1lspike.field_78809_i = true;
/* 112 */     setRotation(this.seg1lspike, 0.0F, 0.3316126F, -0.122173F);
/* 113 */     this.seg1rspike = new ModelRenderer(this, 0, 270);
/* 114 */     this.seg1rspike.func_78789_a(-33.0F, -1.0F, -1.0F, 33, 2, 2);
/* 115 */     this.seg1rspike.func_78793_a(-13.0F, -32.0F, -6.0F);
/* 116 */     this.seg1rspike.func_78787_b(64, 32);
/* 117 */     this.seg1rspike.field_78809_i = true;
/* 118 */     setRotation(this.seg1rspike, 0.0F, -0.3316126F, 0.122173F);
/* 119 */     this.seg1ltopspike = new ModelRenderer(this, 125, 260);
/* 120 */     this.seg1ltopspike.func_78789_a(-2.0F, -8.0F, -2.0F, 4, 9, 4);
/* 121 */     this.seg1ltopspike.func_78793_a(8.0F, -39.0F, -6.0F);
/* 122 */     this.seg1ltopspike.func_78787_b(64, 32);
/* 123 */     this.seg1ltopspike.field_78809_i = true;
/* 124 */     setRotation(this.seg1ltopspike, 0.0F, 0.0F, 0.1396263F);
/* 125 */     this.seg1rtopspike = new ModelRenderer(this, 150, 260);
/* 126 */     this.seg1rtopspike.func_78789_a(-2.0F, -8.0F, -2.0F, 4, 9, 4);
/* 127 */     this.seg1rtopspike.func_78793_a(-10.0F, -39.0F, -6.0F);
/* 128 */     this.seg1rtopspike.func_78787_b(64, 32);
/* 129 */     this.seg1rtopspike.field_78809_i = true;
/* 130 */     setRotation(this.seg1rtopspike, 0.0F, 0.0F, -0.1396263F);
/* 131 */     this.seg1lleg = new ModelRenderer(this, 125, 200);
/* 132 */     this.seg1lleg.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 16, 2);
/* 133 */     this.seg1lleg.func_78793_a(8.0F, -8.0F, -5.0F);
/* 134 */     this.seg1lleg.func_78787_b(64, 32);
/* 135 */     this.seg1lleg.field_78809_i = true;
/* 136 */     setRotation(this.seg1lleg, 0.0F, 0.0F, 0.1570796F);
/* 137 */     this.seg1rleg = new ModelRenderer(this, 150, 200);
/* 138 */     this.seg1rleg.func_78789_a(0.0F, 0.0F, 0.0F, 2, 16, 2);
/* 139 */     this.seg1rleg.func_78793_a(-9.0F, -8.0F, -5.0F);
/* 140 */     this.seg1rleg.func_78787_b(64, 32);
/* 141 */     this.seg1rleg.field_78809_i = true;
/* 142 */     setRotation(this.seg1rleg, 0.0F, 0.0F, -0.1570796F);
/* 143 */     this.seg2 = new ModelRenderer(this, 0, 300);
/* 144 */     this.seg2.func_78789_a(-20.0F, -17.0F, -9.0F, 40, 34, 18);
/* 145 */     this.seg2.func_78793_a(0.0F, -2.0F, 32.0F);
/* 146 */     this.seg2.func_78787_b(64, 32);
/* 147 */     this.seg2.field_78809_i = true;
/* 148 */     setRotation(this.seg2, 0.0F, 0.0F, 0.0F);
/* 149 */     this.seg2lfoot = new ModelRenderer(this, 125, 300);
/* 150 */     this.seg2lfoot.func_78789_a(-5.0F, 0.0F, -5.0F, 10, 10, 10);
/* 151 */     this.seg2lfoot.func_78793_a(13.0F, 14.0F, 32.0F);
/* 152 */     this.seg2lfoot.func_78787_b(64, 32);
/* 153 */     this.seg2lfoot.field_78809_i = true;
/* 154 */     setRotation(this.seg2lfoot, 0.0F, 0.0F, 0.0F);
/* 155 */     this.seg2rfoot = new ModelRenderer(this, 175, 300);
/* 156 */     this.seg2rfoot.func_78789_a(-5.0F, 0.0F, -5.0F, 10, 10, 10);
/* 157 */     this.seg2rfoot.func_78793_a(-13.0F, 14.0F, 32.0F);
/* 158 */     this.seg2rfoot.func_78787_b(64, 32);
/* 159 */     this.seg2rfoot.field_78809_i = true;
/* 160 */     setRotation(this.seg2rfoot, 0.0F, 0.0F, 0.0F);
/* 161 */     this.seg2ltopspike = new ModelRenderer(this, 100, 360);
/* 162 */     this.seg2ltopspike.func_78789_a(-2.0F, -9.0F, -2.0F, 4, 9, 4);
/* 163 */     this.seg2ltopspike.func_78793_a(14.0F, -18.0F, 32.0F);
/* 164 */     this.seg2ltopspike.func_78787_b(64, 32);
/* 165 */     this.seg2ltopspike.field_78809_i = true;
/* 166 */     setRotation(this.seg2ltopspike, 0.0F, 0.0F, 0.1396263F);
/* 167 */     this.seg2rtopspike = new ModelRenderer(this, 125, 360);
/* 168 */     this.seg2rtopspike.func_78789_a(-2.0F, -9.0F, -2.0F, 4, 9, 4);
/* 169 */     this.seg2rtopspike.func_78793_a(-14.0F, -18.0F, 32.0F);
/* 170 */     this.seg2rtopspike.func_78787_b(64, 32);
/* 171 */     this.seg2rtopspike.field_78809_i = true;
/* 172 */     setRotation(this.seg2rtopspike, 0.0F, 0.0F, -0.1396263F);
/* 173 */     this.seg2lspike = new ModelRenderer(this, 0, 360);
/* 174 */     this.seg2lspike.func_78789_a(0.0F, -1.0F, -1.0F, 20, 2, 2);
/* 175 */     this.seg2lspike.func_78793_a(18.0F, -9.0F, 32.0F);
/* 176 */     this.seg2lspike.func_78787_b(64, 32);
/* 177 */     this.seg2lspike.field_78809_i = true;
/* 178 */     setRotation(this.seg2lspike, 0.0F, 0.0F, -0.0698132F);
/* 179 */     this.seg2rspike = new ModelRenderer(this, 0, 370);
/* 180 */     this.seg2rspike.func_78789_a(-20.0F, -1.0F, -1.0F, 20, 2, 2);
/* 181 */     this.seg2rspike.func_78793_a(-18.0F, -9.0F, 32.0F);
/* 182 */     this.seg2rspike.func_78787_b(64, 32);
/* 183 */     this.seg2rspike.field_78809_i = true;
/* 184 */     setRotation(this.seg2rspike, 0.0F, 0.0F, 0.0698132F);
/* 185 */     this.seg3 = new ModelRenderer(this, 0, 400);
/* 186 */     this.seg3.func_78789_a(-15.0F, -14.0F, -7.0F, 30, 28, 14);
/* 187 */     this.seg3.func_78793_a(0.0F, 3.0F, 48.0F);
/* 188 */     this.seg3.func_78787_b(64, 32);
/* 189 */     this.seg3.field_78809_i = true;
/* 190 */     setRotation(this.seg3, 0.0F, 0.0F, 0.0F);
/* 191 */     this.seg3lfoot = new ModelRenderer(this, 100, 400);
/* 192 */     this.seg3lfoot.func_78789_a(-4.0F, 0.0F, -6.0F, 8, 8, 12);
/* 193 */     this.seg3lfoot.func_78793_a(10.0F, 16.0F, 48.0F);
/* 194 */     this.seg3lfoot.func_78787_b(64, 32);
/* 195 */     this.seg3lfoot.field_78809_i = true;
/* 196 */     setRotation(this.seg3lfoot, 0.0F, 0.0F, 0.0F);
/* 197 */     this.seg3rfoot = new ModelRenderer(this, 150, 400);
/* 198 */     this.seg3rfoot.func_78789_a(-4.0F, 0.0F, -6.0F, 8, 8, 12);
/* 199 */     this.seg3rfoot.func_78793_a(-10.0F, 16.0F, 48.0F);
/* 200 */     this.seg3rfoot.func_78787_b(64, 32);
/* 201 */     this.seg3rfoot.field_78809_i = true;
/* 202 */     setRotation(this.seg3rfoot, 0.0F, 0.0F, 0.0F);
/* 203 */     this.seg3lspike = new ModelRenderer(this, 0, 450);
/* 204 */     this.seg3lspike.func_78789_a(0.0F, -1.0F, -1.0F, 14, 2, 2);
/* 205 */     this.seg3lspike.func_78793_a(14.0F, -4.0F, 48.0F);
/* 206 */     this.seg3lspike.func_78787_b(64, 32);
/* 207 */     this.seg3lspike.field_78809_i = true;
/* 208 */     setRotation(this.seg3lspike, 0.0F, 0.0F, -0.0698132F);
/* 209 */     this.seg3rspike = new ModelRenderer(this, 0, 460);
/* 210 */     this.seg3rspike.func_78789_a(-14.0F, -1.0F, -1.0F, 14, 2, 2);
/* 211 */     this.seg3rspike.func_78793_a(-14.0F, -4.0F, 48.0F);
/* 212 */     this.seg3rspike.func_78787_b(64, 32);
/* 213 */     this.seg3rspike.field_78809_i = true;
/* 214 */     setRotation(this.seg3rspike, 0.0F, 0.0F, 0.0698132F);
/* 215 */     this.seg3ltopspike = new ModelRenderer(this, 100, 450);
/* 216 */     this.seg3ltopspike.func_78789_a(-2.0F, -13.0F, -2.0F, 3, 13, 3);
/* 217 */     this.seg3ltopspike.func_78793_a(10.0F, -10.0F, 48.0F);
/* 218 */     this.seg3ltopspike.func_78787_b(64, 32);
/* 219 */     this.seg3ltopspike.field_78809_i = true;
/* 220 */     setRotation(this.seg3ltopspike, 0.0F, 0.0F, 0.1396263F);
/* 221 */     this.seg3rtopspike = new ModelRenderer(this, 120, 450);
/* 222 */     this.seg3rtopspike.func_78789_a(-2.0F, -13.0F, -2.0F, 3, 13, 3);
/* 223 */     this.seg3rtopspike.func_78793_a(-10.0F, -10.0F, 48.0F);
/* 224 */     this.seg3rtopspike.func_78787_b(64, 32);
/* 225 */     this.seg3rtopspike.field_78809_i = true;
/* 226 */     setRotation(this.seg3rtopspike, 0.0F, 0.0F, -0.1396263F);
/* 227 */     this.seg3lbackspike = new ModelRenderer(this, 50, 450);
/* 228 */     this.seg3lbackspike.func_78789_a(-2.0F, -20.0F, -2.0F, 4, 20, 4);
/* 229 */     this.seg3lbackspike.func_78793_a(13.0F, -8.0F, 54.0F);
/* 230 */     this.seg3lbackspike.func_78787_b(64, 32);
/* 231 */     this.seg3lbackspike.field_78809_i = true;
/* 232 */     setRotation(this.seg3lbackspike, -0.9773844F, 0.2792527F, 0.1396263F);
/* 233 */     this.seg3rbackspike = new ModelRenderer(this, 75, 450);
/* 234 */     this.seg3rbackspike.func_78789_a(-2.0F, -20.0F, -2.0F, 4, 20, 4);
/* 235 */     this.seg3rbackspike.func_78793_a(-13.0F, -8.0F, 54.0F);
/* 236 */     this.seg3rbackspike.func_78787_b(64, 32);
/* 237 */     this.seg3rbackspike.field_78809_i = true;
/* 238 */     setRotation(this.seg3rbackspike, -0.9773844F, -0.3490659F, 0.1396263F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 244 */     CaterKiller e = (CaterKiller)entity;
/* 245 */     float newangle = 0.0F;
/* 246 */     float headoff = 0.0F;
/* 247 */     float zpi = 0.0F;
/* 248 */     float zdist = 0.0F;
/*     */     
/* 250 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 251 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 254 */     if (e.getAttacking() != 0) {
/* 255 */       newangle = MathHelper.func_76134_b(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.07F;
/*     */     } else {
/* 257 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.025F;
/*     */     } 
/* 259 */     this.ljaw.field_78808_h = 0.139F + newangle;
/* 260 */     this.rjaw.field_78808_h = -0.139F - newangle;
/*     */ 
/*     */     
/* 263 */     if (e.getAttacking() != 0) {
/* 264 */       headoff = MathHelper.func_76134_b(f2 * 1.7F * this.wingspeed) * 8.0F;
/*     */     } else {
/* 266 */       headoff = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 2.0F;
/*     */     } 
/* 268 */     this.Head.field_78797_d = -8.0F + headoff;
/* 269 */     this.falsehead.field_78797_d = -8.0F + headoff;
/* 270 */     this.ltusk1.field_78797_d = -25.0F + headoff;
/* 271 */     this.ltusk2.field_78797_d = -25.0F + headoff;
/* 272 */     this.rtusk1.field_78797_d = -25.0F + headoff;
/* 273 */     this.rtusk2.field_78797_d = -25.0F + headoff;
/* 274 */     this.ljaw.field_78797_d = -1.0F + headoff;
/* 275 */     this.rjaw.field_78797_d = -1.0F + headoff;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 282 */     newangle = MathHelper.func_76134_b(f2 * 2.11F * this.wingspeed) * 3.1415927F * 0.08F;
/* 283 */     this.ltusk2.field_78796_g = 0.802F + newangle;
/* 284 */     newangle = MathHelper.func_76134_b(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.08F;
/* 285 */     this.rtusk2.field_78796_g = -0.802F + newangle;
/*     */ 
/*     */     
/* 288 */     this.Head.func_78785_a(f5);
/* 289 */     this.falsehead.func_78785_a(f5);
/* 290 */     this.ltusk1.func_78785_a(f5);
/* 291 */     this.ltusk2.func_78785_a(f5);
/* 292 */     this.rtusk1.func_78785_a(f5);
/* 293 */     this.rtusk2.func_78785_a(f5);
/* 294 */     this.ljaw.func_78785_a(f5);
/* 295 */     this.rjaw.func_78785_a(f5);
/*     */     int i;
/* 297 */     for (i = 0; i < 3; i++) {
/* 298 */       this.seg1.field_78797_d = -8.0F + headoff / (i + 1) + (8 * i);
/* 299 */       this.seg1lspike.field_78797_d = -32.0F + headoff / (i + 1) + (8 * i);
/* 300 */       this.seg1rspike.field_78797_d = -32.0F + headoff / (i + 1) + (8 * i);
/* 301 */       this.seg1ltopspike.field_78797_d = -39.0F + headoff / (i + 1) + (8 * i);
/* 302 */       this.seg1rtopspike.field_78797_d = -39.0F + headoff / (i + 1) + (8 * i);
/* 303 */       this.seg1lleg.field_78797_d = -8.0F + headoff / (i + 1) + (8 * i);
/* 304 */       this.seg1rleg.field_78797_d = -8.0F + headoff / (i + 1) + (8 * i);
/*     */       
/* 306 */       this.seg1.field_78798_e = (-12 + 14 * i);
/* 307 */       this.seg1lspike.field_78798_e = (-6 + 14 * i);
/* 308 */       this.seg1rspike.field_78798_e = (-6 + 14 * i);
/* 309 */       this.seg1ltopspike.field_78798_e = (-6 + 14 * i);
/* 310 */       this.seg1rtopspike.field_78798_e = (-6 + 14 * i);
/* 311 */       this.seg1lleg.field_78798_e = (-5 + 14 * i);
/* 312 */       this.seg1rleg.field_78798_e = (-5 + 14 * i);
/*     */       
/* 314 */       newangle = MathHelper.func_76134_b((float)((f2 * 0.91F * this.wingspeed) + 0.39269908169872414D * i)) * 3.1415927F * 0.08F;
/* 315 */       this.seg1lspike.field_78808_h = newangle;
/* 316 */       this.seg1rspike.field_78808_h = -newangle;
/*     */       
/* 318 */       if (e.getAttacking() != 0) {
/* 319 */         newangle = MathHelper.func_76134_b((float)((f2 * 2.91F * this.wingspeed) + 0.39269908169872414D * i)) * 3.1415927F * 0.15F;
/*     */       } else {
/* 321 */         newangle = MathHelper.func_76134_b((float)((f2 * 0.35F * this.wingspeed) + 0.39269908169872414D * i)) * 3.1415927F * 0.04F;
/*     */       } 
/*     */       
/* 324 */       this.seg1lleg.field_78795_f = newangle;
/* 325 */       this.seg1rleg.field_78795_f = -newangle;
/*     */       
/* 327 */       this.seg1.func_78785_a(f5);
/* 328 */       this.seg1lspike.func_78785_a(f5);
/* 329 */       this.seg1rspike.func_78785_a(f5);
/* 330 */       this.seg1ltopspike.func_78785_a(f5);
/* 331 */       this.seg1rtopspike.func_78785_a(f5);
/* 332 */       this.seg1lleg.func_78785_a(f5);
/* 333 */       this.seg1rleg.func_78785_a(f5);
/*     */     } 
/*     */     
/* 336 */     for (i = 0; i < 6; i++) {
/*     */       
/* 338 */       zdist = MathHelper.func_76134_b(f2 * 1.7F * this.wingspeed + zpi) * 1.5F * f1;
/*     */       
/* 340 */       this.seg2.field_78798_e = 39.0F + (16.0F + zdist) * i;
/* 341 */       this.seg2lfoot.field_78798_e = 39.0F + (16.0F + zdist) * i;
/* 342 */       this.seg2rfoot.field_78798_e = 39.0F + (16.0F + zdist) * i;
/* 343 */       this.seg2ltopspike.field_78798_e = 39.0F + (16.0F + zdist) * i;
/* 344 */       this.seg2rtopspike.field_78798_e = 39.0F + (16.0F + zdist) * i;
/* 345 */       this.seg2lspike.field_78798_e = 39.0F + (16.0F + zdist) * i;
/* 346 */       this.seg2rspike.field_78798_e = 39.0F + (16.0F + zdist) * i;
/*     */       
/* 348 */       newangle = MathHelper.func_76134_b((float)((f2 * 0.4F * this.wingspeed) - 0.39269908169872414D * i)) * 3.1415927F * 0.07F;
/* 349 */       this.seg2lspike.field_78808_h = newangle;
/* 350 */       this.seg2rspike.field_78808_h = -newangle;
/*     */       
/* 352 */       this.seg2.func_78785_a(f5);
/* 353 */       this.seg2lfoot.func_78785_a(f5);
/* 354 */       this.seg2rfoot.func_78785_a(f5);
/* 355 */       this.seg2ltopspike.func_78785_a(f5);
/* 356 */       this.seg2rtopspike.func_78785_a(f5);
/* 357 */       this.seg2lspike.func_78785_a(f5);
/* 358 */       this.seg2rspike.func_78785_a(f5);
/*     */       
/* 360 */       zpi += 0.7853982F;
/*     */     } 
/*     */     
/* 363 */     this.seg2rspike.field_78798_e += 16.0F;
/* 364 */     this.seg3lfoot.field_78798_e = this.seg3.field_78798_e;
/* 365 */     this.seg3rfoot.field_78798_e = this.seg3.field_78798_e;
/* 366 */     this.seg3lspike.field_78798_e = this.seg3.field_78798_e;
/* 367 */     this.seg3rspike.field_78798_e = this.seg3.field_78798_e;
/* 368 */     this.seg3ltopspike.field_78798_e = this.seg3.field_78798_e;
/* 369 */     this.seg3rtopspike.field_78798_e = this.seg3.field_78798_e;
/* 370 */     this.seg3.field_78798_e += 6.0F;
/* 371 */     this.seg3.field_78798_e += 6.0F;
/*     */     
/* 373 */     i = 6;
/* 374 */     newangle = MathHelper.func_76134_b((float)((f2 * 0.4F * this.wingspeed) - 0.39269908169872414D * i)) * 3.1415927F * 0.07F;
/* 375 */     this.seg3lspike.field_78808_h = newangle;
/* 376 */     this.seg3rspike.field_78808_h = -newangle;
/*     */     
/* 378 */     newangle = MathHelper.func_76134_b(f2 * 0.81F * this.wingspeed) * 3.1415927F * 0.04F;
/* 379 */     this.seg3lbackspike.field_78795_f = -0.977F + newangle;
/* 380 */     newangle = MathHelper.func_76134_b(f2 * 0.87F * this.wingspeed) * 3.1415927F * 0.04F;
/* 381 */     this.seg3rbackspike.field_78795_f = -0.977F + newangle;
/*     */     
/* 383 */     newangle = MathHelper.func_76134_b(f2 * 1.11F * this.wingspeed) * 3.1415927F * 0.04F;
/* 384 */     this.seg3lbackspike.field_78796_g = 0.28F + newangle;
/* 385 */     newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.04F;
/* 386 */     this.seg3rbackspike.field_78796_g = -0.28F + newangle;
/*     */     
/* 388 */     this.seg3.func_78785_a(f5);
/* 389 */     this.seg3lfoot.func_78785_a(f5);
/* 390 */     this.seg3rfoot.func_78785_a(f5);
/* 391 */     this.seg3lspike.func_78785_a(f5);
/* 392 */     this.seg3rspike.func_78785_a(f5);
/* 393 */     this.seg3ltopspike.func_78785_a(f5);
/* 394 */     this.seg3rtopspike.func_78785_a(f5);
/* 395 */     this.seg3lbackspike.func_78785_a(f5);
/* 396 */     this.seg3rbackspike.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 402 */     model.field_78795_f = x;
/* 403 */     model.field_78796_g = y;
/* 404 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 409 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCaterKiller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */