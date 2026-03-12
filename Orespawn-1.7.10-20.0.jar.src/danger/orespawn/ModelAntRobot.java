/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelAntRobot
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Leg1;
/*     */   
/*     */   ModelRenderer Leg2;
/*     */   ModelRenderer Leg3;
/*     */   ModelRenderer Foot1;
/*     */   ModelRenderer Foot2;
/*     */   ModelRenderer Foot3;
/*     */   ModelRenderer Foot4;
/*     */   ModelRenderer Foot5;
/*     */   ModelRenderer Foot6;
/*     */   ModelRenderer Foot7;
/*     */   ModelRenderer Body;
/*     */   ModelRenderer Abdomen;
/*     */   ModelRenderer Head;
/*     */   ModelRenderer Jet1;
/*     */   ModelRenderer Jet2;
/*     */   ModelRenderer Hip1;
/*     */   ModelRenderer Hip2;
/*     */   ModelRenderer LJaw1;
/*     */   ModelRenderer RJaw1;
/*     */   ModelRenderer LJaw2;
/*     */   ModelRenderer RJaw2;
/*     */   ModelRenderer LAntenna;
/*     */   ModelRenderer RAntenna;
/*     */   ModelRenderer Hip3;
/*     */   ModelRenderer Hip4;
/*     */   ModelRenderer Hip5;
/*     */   ModelRenderer Hip6;
/*     */   
/*     */   public ModelAntRobot(float f1) {
/*  43 */     this.wingspeed = f1;
/*  44 */     this.field_78090_t = 128;
/*  45 */     this.field_78089_u = 256;
/*     */     
/*  47 */     this.Leg1 = new ModelRenderer(this, 19, 40);
/*  48 */     this.Leg1.func_78789_a(-1.5F, -1.5F, 0.0F, 3, 3, 50);
/*  49 */     this.Leg1.func_78793_a(0.0F, 0.0F, 0.0F);
/*  50 */     this.Leg1.func_78787_b(64, 32);
/*  51 */     this.Leg1.field_78809_i = true;
/*  52 */     setRotation(this.Leg1, 0.7853982F, 0.0F, 0.0F);
/*  53 */     this.Leg2 = new ModelRenderer(this, 19, 41);
/*  54 */     this.Leg2.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 50);
/*  55 */     this.Leg2.func_78793_a(0.0F, -35.0F, 35.0F);
/*  56 */     this.Leg2.func_78787_b(64, 32);
/*  57 */     this.Leg2.field_78809_i = true;
/*  58 */     setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
/*  59 */     this.Leg3 = new ModelRenderer(this, 20, 42);
/*  60 */     this.Leg3.func_78789_a(-0.5F, -0.5F, 0.0F, 1, 1, 50);
/*  61 */     this.Leg3.func_78793_a(0.0F, -35.0F, 85.0F);
/*  62 */     this.Leg3.func_78787_b(64, 32);
/*  63 */     this.Leg3.field_78809_i = true;
/*  64 */     setRotation(this.Leg3, -0.7853982F, 0.0F, 0.0F);
/*  65 */     this.Foot1 = new ModelRenderer(this, 28, 0);
/*  66 */     this.Foot1.func_78789_a(-2.5F, -0.5F, 50.0F, 5, 1, 2);
/*  67 */     this.Foot1.func_78793_a(0.0F, -35.0F, 85.0F);
/*  68 */     this.Foot1.func_78787_b(64, 32);
/*  69 */     this.Foot1.field_78809_i = true;
/*  70 */     setRotation(this.Foot1, -0.7853982F, 0.0F, 0.0F);
/*  71 */     this.Foot2 = new ModelRenderer(this, 30, 4);
/*  72 */     this.Foot2.func_78789_a(1.5F, -0.5F, 52.0F, 1, 1, 3);
/*  73 */     this.Foot2.func_78793_a(0.0F, -35.0F, 85.0F);
/*  74 */     this.Foot2.func_78787_b(64, 32);
/*  75 */     this.Foot2.field_78809_i = true;
/*  76 */     setRotation(this.Foot2, -0.7853982F, 0.0F, 0.0F);
/*  77 */     this.Foot3 = new ModelRenderer(this, 44, 0);
/*  78 */     this.Foot3.func_78789_a(-0.5F, -0.5F, 52.0F, 1, 1, 5);
/*  79 */     this.Foot3.func_78793_a(0.0F, -35.0F, 85.0F);
/*  80 */     this.Foot3.func_78787_b(64, 32);
/*  81 */     this.Foot3.field_78809_i = true;
/*  82 */     setRotation(this.Foot3, -0.7853982F, 0.0F, 0.0F);
/*  83 */     this.Foot4 = new ModelRenderer(this, 30, 9);
/*  84 */     this.Foot4.func_78789_a(-2.5F, -0.5F, 52.0F, 1, 1, 3);
/*  85 */     this.Foot4.func_78793_a(0.0F, -35.0F, 85.0F);
/*  86 */     this.Foot4.func_78787_b(64, 32);
/*  87 */     this.Foot4.field_78809_i = true;
/*  88 */     setRotation(this.Foot4, -0.7853982F, 0.0F, 0.0F);
/*  89 */     this.Foot5 = new ModelRenderer(this, 40, 8);
/*  90 */     this.Foot5.func_78789_a(-0.5F, -2.5F, 50.0F, 1, 5, 2);
/*  91 */     this.Foot5.func_78793_a(0.0F, -35.0F, 85.0F);
/*  92 */     this.Foot5.func_78787_b(64, 32);
/*  93 */     this.Foot5.field_78809_i = true;
/*  94 */     setRotation(this.Foot5, -0.7853982F, 0.0F, 0.0F);
/*  95 */     this.Foot6 = new ModelRenderer(this, 48, 9);
/*  96 */     this.Foot6.func_78789_a(-0.5F, -2.5F, 52.0F, 1, 1, 2);
/*  97 */     this.Foot6.func_78793_a(0.0F, -35.0F, 85.0F);
/*  98 */     this.Foot6.func_78787_b(64, 32);
/*  99 */     this.Foot6.field_78809_i = true;
/* 100 */     setRotation(this.Foot6, -0.7853982F, 0.0F, 0.0F);
/* 101 */     this.Foot7 = new ModelRenderer(this, 48, 14);
/* 102 */     this.Foot7.func_78789_a(-0.5F, 1.5F, 52.0F, 1, 1, 2);
/* 103 */     this.Foot7.func_78793_a(0.0F, -35.0F, 85.0F);
/* 104 */     this.Foot7.func_78787_b(64, 32);
/* 105 */     this.Foot7.field_78809_i = true;
/* 106 */     setRotation(this.Foot7, -0.7853982F, 0.0F, 0.0F);
/* 107 */     this.Body = new ModelRenderer(this, 0, 151);
/* 108 */     this.Body.func_78789_a(-11.0F, 0.0F, -16.0F, 22, 14, 32);
/* 109 */     this.Body.func_78793_a(0.0F, 0.0F, 0.0F);
/* 110 */     this.Body.func_78787_b(64, 32);
/* 111 */     this.Body.field_78809_i = true;
/* 112 */     setRotation(this.Body, 0.0F, 0.0F, 0.0F);
/* 113 */     this.Abdomen = new ModelRenderer(this, 0, 199);
/* 114 */     this.Abdomen.func_78789_a(-15.0F, -10.0F, 16.0F, 30, 22, 34);
/* 115 */     this.Abdomen.func_78793_a(0.0F, 0.0F, 0.0F);
/* 116 */     this.Abdomen.func_78787_b(64, 32);
/* 117 */     this.Abdomen.field_78809_i = true;
/* 118 */     setRotation(this.Abdomen, 0.0F, 0.0F, 0.0F);
/* 119 */     this.Head = new ModelRenderer(this, 0, 120);
/* 120 */     this.Head.func_78789_a(-7.0F, 4.0F, -34.0F, 14, 11, 18);
/* 121 */     this.Head.func_78793_a(0.0F, 0.0F, 0.0F);
/* 122 */     this.Head.func_78787_b(64, 32);
/* 123 */     this.Head.field_78809_i = true;
/* 124 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/* 125 */     this.Jet1 = new ModelRenderer(this, 78, 0);
/* 126 */     this.Jet1.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 18);
/* 127 */     this.Jet1.func_78793_a(8.0F, -12.0F, 35.0F);
/* 128 */     this.Jet1.func_78787_b(64, 32);
/* 129 */     this.Jet1.field_78809_i = true;
/* 130 */     setRotation(this.Jet1, 0.0F, 0.0F, 0.0F);
/* 131 */     this.Jet2 = new ModelRenderer(this, 78, 0);
/* 132 */     this.Jet2.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 18);
/* 133 */     this.Jet2.func_78793_a(-14.0F, -12.0F, 35.0F);
/* 134 */     this.Jet2.func_78787_b(64, 32);
/* 135 */     this.Jet2.field_78809_i = true;
/* 136 */     setRotation(this.Jet2, 0.0F, 0.0F, 0.0F);
/* 137 */     this.Hip1 = new ModelRenderer(this, 0, 96);
/* 138 */     this.Hip1.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 6);
/* 139 */     this.Hip1.func_78793_a(11.0F, 9.0F, -3.0F);
/* 140 */     this.Hip1.func_78787_b(128, 256);
/* 141 */     this.Hip1.field_78809_i = true;
/* 142 */     setRotation(this.Hip1, 0.0F, 0.0F, 0.0F);
/* 143 */     this.Hip2 = new ModelRenderer(this, 0, 96);
/* 144 */     this.Hip2.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 6);
/* 145 */     this.Hip2.func_78793_a(-17.0F, 9.0F, -3.0F);
/* 146 */     this.Hip2.func_78787_b(128, 256);
/* 147 */     this.Hip2.field_78809_i = true;
/* 148 */     setRotation(this.Hip2, 0.0F, 0.0F, 0.0F);
/* 149 */     this.LJaw1 = new ModelRenderer(this, 0, 33);
/* 150 */     this.LJaw1.func_78789_a(-2.0F, 0.0F, -2.0F, 17, 1, 4);
/* 151 */     this.LJaw1.func_78793_a(5.0F, 13.0F, -33.0F);
/* 152 */     this.LJaw1.func_78787_b(128, 256);
/* 153 */     this.LJaw1.field_78809_i = true;
/* 154 */     setRotation(this.LJaw1, 0.0F, 0.8901179F, 0.0F);
/* 155 */     this.RJaw1 = new ModelRenderer(this, 0, 33);
/* 156 */     this.RJaw1.func_78789_a(-2.0F, 0.0F, -2.0F, 17, 1, 4);
/* 157 */     this.RJaw1.func_78793_a(-5.0F, 13.0F, -33.0F);
/* 158 */     this.RJaw1.func_78787_b(128, 256);
/* 159 */     this.RJaw1.field_78809_i = true;
/* 160 */     setRotation(this.RJaw1, 0.0F, 2.216568F, 0.0F);
/* 161 */     this.LJaw2 = new ModelRenderer(this, 0, 27);
/* 162 */     this.LJaw2.func_78789_a(12.0F, 0.0F, 5.0F, 17, 1, 3);
/* 163 */     this.LJaw2.func_78793_a(5.0F, 13.0F, -33.0F);
/* 164 */     this.LJaw2.func_78787_b(128, 256);
/* 165 */     this.LJaw2.field_78809_i = true;
/* 166 */     setRotation(this.LJaw2, 0.0F, 1.37881F, 0.0F);
/* 167 */     this.RJaw2 = new ModelRenderer(this, 0, 27);
/* 168 */     this.RJaw2.func_78789_a(12.0F, 0.0F, -8.0F, 17, 1, 3);
/* 169 */     this.RJaw2.func_78793_a(-5.0F, 13.0F, -33.0F);
/* 170 */     this.RJaw2.func_78787_b(128, 256);
/* 171 */     this.RJaw2.field_78809_i = true;
/* 172 */     setRotation(this.RJaw2, 0.0F, 1.745329F, 0.0F);
/* 173 */     this.LAntenna = new ModelRenderer(this, 70, 0);
/* 174 */     this.LAntenna.func_78789_a(-0.5F, -12.0F, -0.5F, 1, 12, 1);
/* 175 */     this.LAntenna.func_78793_a(0.0F, 4.0F, -32.0F);
/* 176 */     this.LAntenna.func_78787_b(128, 256);
/* 177 */     this.LAntenna.field_78809_i = true;
/* 178 */     setRotation(this.LAntenna, 0.0F, 0.0F, 0.5410521F);
/* 179 */     this.RAntenna = new ModelRenderer(this, 70, 0);
/* 180 */     this.RAntenna.func_78789_a(-0.5F, -12.0F, -0.5F, 1, 12, 1);
/* 181 */     this.RAntenna.func_78793_a(0.0F, 4.0F, -32.0F);
/* 182 */     this.RAntenna.func_78787_b(128, 256);
/* 183 */     this.RAntenna.field_78809_i = true;
/* 184 */     setRotation(this.RAntenna, 0.0F, 0.0F, -0.5410521F);
/* 185 */     this.Hip3 = new ModelRenderer(this, 0, 96);
/* 186 */     this.Hip3.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 6);
/* 187 */     this.Hip3.func_78793_a(-17.0F, 9.0F, 10.0F);
/* 188 */     this.Hip3.func_78787_b(128, 256);
/* 189 */     this.Hip3.field_78809_i = true;
/* 190 */     setRotation(this.Hip3, 0.0F, 0.0F, 0.0F);
/* 191 */     this.Hip4 = new ModelRenderer(this, 0, 96);
/* 192 */     this.Hip4.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 6);
/* 193 */     this.Hip4.func_78793_a(11.0F, 9.0F, 10.0F);
/* 194 */     this.Hip4.func_78787_b(128, 256);
/* 195 */     this.Hip4.field_78809_i = true;
/* 196 */     setRotation(this.Hip4, 0.0F, 0.0F, 0.0F);
/* 197 */     this.Hip5 = new ModelRenderer(this, 0, 96);
/* 198 */     this.Hip5.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 6);
/* 199 */     this.Hip5.func_78793_a(11.0F, 9.0F, -16.0F);
/* 200 */     this.Hip5.func_78787_b(128, 256);
/* 201 */     this.Hip5.field_78809_i = true;
/* 202 */     setRotation(this.Hip5, 0.0F, 0.0F, 0.0F);
/* 203 */     this.Hip6 = new ModelRenderer(this, 0, 96);
/* 204 */     this.Hip6.func_78789_a(0.0F, 0.0F, 0.0F, 6, 6, 6);
/* 205 */     this.Hip6.func_78793_a(-17.0F, 9.0F, -16.0F);
/* 206 */     this.Hip6.func_78787_b(128, 256);
/* 207 */     this.Hip6.field_78809_i = true;
/* 208 */     setRotation(this.Hip6, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 214 */     AntRobot e = (AntRobot)entity;
/* 215 */     RenderSpiderRobotInfo r = null;
/* 216 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 217 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     r = e.getRenderSpiderRobotInfo();
/*     */     
/* 224 */     for (int i = 0; i < 6; i++) {
/*     */       
/* 226 */       this.Leg3.field_78796_g = r.ydisplayangle[i];
/* 227 */       this.Foot1.field_78796_g = r.ydisplayangle[i];
/* 228 */       this.Foot2.field_78796_g = r.ydisplayangle[i];
/* 229 */       this.Foot3.field_78796_g = r.ydisplayangle[i];
/* 230 */       this.Foot4.field_78796_g = r.ydisplayangle[i];
/* 231 */       this.Foot5.field_78796_g = r.ydisplayangle[i];
/* 232 */       this.Foot6.field_78796_g = r.ydisplayangle[i];
/* 233 */       this.Foot7.field_78796_g = r.ydisplayangle[i];
/*     */       
/* 235 */       this.Leg1.field_78795_f = (float)r.p1xangle[i] + r.uddisplayangle[i];
/*     */       
/* 237 */       this.Leg2.field_78795_f = (float)r.p2xangle[i] + r.uddisplayangle[i];
/*     */       
/* 239 */       this.Leg3.field_78795_f = (float)r.p3xangle[i] + r.uddisplayangle[i];
/* 240 */       this.Foot1.field_78795_f = this.Leg3.field_78795_f;
/* 241 */       this.Foot2.field_78795_f = this.Leg3.field_78795_f;
/* 242 */       this.Foot3.field_78795_f = this.Leg3.field_78795_f;
/* 243 */       this.Foot4.field_78795_f = this.Leg3.field_78795_f;
/* 244 */       this.Foot5.field_78795_f = this.Leg3.field_78795_f;
/* 245 */       this.Foot6.field_78795_f = this.Leg3.field_78795_f;
/* 246 */       this.Foot7.field_78795_f = this.Leg3.field_78795_f;
/*     */       
/* 248 */       this.Leg1.field_78800_c = -((float)Math.cos(r.ymid[i])) * r.legoff[i] * 16.0F;
/* 249 */       this.Leg1.field_78798_e = (float)Math.sin(r.ymid[i]) * r.legoff[i] * 16.0F;
/* 250 */       this.Leg1.field_78797_d = r.yoff[i] * -16.0F;
/*     */ 
/*     */       
/* 253 */       this.Leg1.field_78797_d -= (float)Math.sin(this.Leg1.field_78795_f) * 49.0F;
/* 254 */       this.Leg1.field_78798_e += (float)Math.cos(this.Leg1.field_78795_f) * (float)Math.cos(this.Leg1.field_78796_g) * 49.0F;
/* 255 */       this.Leg1.field_78800_c += (float)Math.cos(this.Leg1.field_78795_f) * (float)Math.sin(this.Leg1.field_78796_g) * 49.0F;
/*     */ 
/*     */       
/* 258 */       this.Leg2.field_78797_d -= (float)Math.sin(this.Leg2.field_78795_f) * 49.0F;
/* 259 */       this.Leg2.field_78798_e += (float)Math.cos(this.Leg2.field_78795_f) * (float)Math.cos(this.Leg2.field_78796_g) * 49.0F;
/* 260 */       this.Leg2.field_78800_c += (float)Math.cos(this.Leg2.field_78795_f) * (float)Math.sin(this.Leg2.field_78796_g) * 49.0F;
/*     */       
/* 262 */       this.Foot1.field_78800_c = this.Leg3.field_78800_c;
/* 263 */       this.Foot1.field_78797_d = this.Leg3.field_78797_d;
/* 264 */       this.Foot1.field_78798_e = this.Leg3.field_78798_e;
/*     */       
/* 266 */       this.Foot2.field_78800_c = this.Leg3.field_78800_c;
/* 267 */       this.Foot2.field_78797_d = this.Leg3.field_78797_d;
/* 268 */       this.Foot2.field_78798_e = this.Leg3.field_78798_e;
/*     */       
/* 270 */       this.Foot3.field_78800_c = this.Leg3.field_78800_c;
/* 271 */       this.Foot3.field_78797_d = this.Leg3.field_78797_d;
/* 272 */       this.Foot3.field_78798_e = this.Leg3.field_78798_e;
/*     */       
/* 274 */       this.Foot4.field_78800_c = this.Leg3.field_78800_c;
/* 275 */       this.Foot4.field_78797_d = this.Leg3.field_78797_d;
/* 276 */       this.Foot4.field_78798_e = this.Leg3.field_78798_e;
/*     */       
/* 278 */       this.Foot5.field_78800_c = this.Leg3.field_78800_c;
/* 279 */       this.Foot5.field_78797_d = this.Leg3.field_78797_d;
/* 280 */       this.Foot5.field_78798_e = this.Leg3.field_78798_e;
/*     */       
/* 282 */       this.Foot6.field_78800_c = this.Leg3.field_78800_c;
/* 283 */       this.Foot6.field_78797_d = this.Leg3.field_78797_d;
/* 284 */       this.Foot6.field_78798_e = this.Leg3.field_78798_e;
/*     */       
/* 286 */       this.Foot7.field_78800_c = this.Leg3.field_78800_c;
/* 287 */       this.Foot7.field_78797_d = this.Leg3.field_78797_d;
/* 288 */       this.Foot7.field_78798_e = this.Leg3.field_78798_e;
/*     */ 
/*     */ 
/*     */       
/* 292 */       this.Leg1.func_78785_a(f5);
/* 293 */       this.Leg2.func_78785_a(f5);
/* 294 */       this.Leg3.func_78785_a(f5);
/* 295 */       this.Foot1.func_78785_a(f5);
/* 296 */       this.Foot2.func_78785_a(f5);
/* 297 */       this.Foot3.func_78785_a(f5);
/* 298 */       this.Foot4.func_78785_a(f5);
/* 299 */       this.Foot5.func_78785_a(f5);
/* 300 */       this.Foot6.func_78785_a(f5);
/* 301 */       this.Foot7.func_78785_a(f5);
/*     */     } 
/*     */     
/* 304 */     if (e.getAttacking() == 0) {
/* 305 */       this.LJaw1.field_78796_g = 0.89F;
/* 306 */       this.LJaw2.field_78796_g = 1.378F;
/* 307 */       this.RJaw1.field_78796_g = 2.216F;
/* 308 */       this.RJaw2.field_78796_g = 1.745F;
/* 309 */       this.LAntenna.field_78795_f = MathHelper.func_76134_b(r.gpcounter * 0.35F) * 3.1415927F * 0.05F;
/* 310 */       this.LAntenna.field_78808_h = 0.54F + MathHelper.func_76134_b(r.gpcounter * 0.25F) * 3.1415927F * 0.05F;
/* 311 */       this.RAntenna.field_78795_f = MathHelper.func_76134_b(r.gpcounter * 0.3F) * 3.1415927F * 0.05F;
/* 312 */       this.RAntenna.field_78808_h = -0.54F + MathHelper.func_76134_b(r.gpcounter * 0.45F) * 3.1415927F * 0.05F;
/*     */     } else {
/*     */       
/* 315 */       float newangle = MathHelper.func_76134_b(r.gpcounter * 0.25F) * 3.1415927F * 0.22F;
/* 316 */       this.LJaw1.field_78796_g = newangle + 0.89F;
/* 317 */       this.LJaw2.field_78796_g = newangle + 1.378F;
/* 318 */       this.RJaw1.field_78796_g = -newangle + 2.216F;
/* 319 */       this.RJaw2.field_78796_g = 1.745F - newangle;
/* 320 */       this.LAntenna.field_78795_f = MathHelper.func_76134_b(r.gpcounter * 0.45F) * 3.1415927F * 0.1F;
/* 321 */       this.LAntenna.field_78808_h = 0.54F + MathHelper.func_76134_b(r.gpcounter * 0.35F) * 3.1415927F * 0.1F;
/* 322 */       this.RAntenna.field_78795_f = MathHelper.func_76134_b(r.gpcounter * 0.4F) * 3.1415927F * 0.1F;
/* 323 */       this.RAntenna.field_78808_h = -0.54F + MathHelper.func_76134_b(r.gpcounter * 0.55F) * 3.1415927F * 0.1F;
/*     */     } 
/*     */     
/* 326 */     this.Body.func_78785_a(f5);
/* 327 */     this.Abdomen.func_78785_a(f5);
/* 328 */     this.Head.func_78785_a(f5);
/* 329 */     this.Jet1.func_78785_a(f5);
/* 330 */     this.Jet2.func_78785_a(f5);
/* 331 */     this.Hip1.func_78785_a(f5);
/* 332 */     this.Hip2.func_78785_a(f5);
/* 333 */     this.Hip3.func_78785_a(f5);
/* 334 */     this.Hip4.func_78785_a(f5);
/* 335 */     this.Hip5.func_78785_a(f5);
/* 336 */     this.Hip6.func_78785_a(f5);
/* 337 */     this.LJaw1.func_78785_a(f5);
/* 338 */     this.RJaw1.func_78785_a(f5);
/* 339 */     this.LJaw2.func_78785_a(f5);
/* 340 */     this.RJaw2.func_78785_a(f5);
/* 341 */     this.LAntenna.func_78785_a(f5);
/* 342 */     this.RAntenna.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 348 */     model.field_78795_f = x;
/* 349 */     model.field_78796_g = y;
/* 350 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 355 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelAntRobot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */