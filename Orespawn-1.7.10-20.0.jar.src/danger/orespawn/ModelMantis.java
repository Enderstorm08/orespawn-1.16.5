/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelMantis
/*     */   extends ModelBase {
/*  10 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer lfleg1;
/*     */   
/*     */   ModelRenderer lfleg2;
/*     */   
/*     */   ModelRenderer lfleg3;
/*     */   ModelRenderer lfleg4;
/*     */   ModelRenderer lrleg1;
/*     */   ModelRenderer lrleg2;
/*     */   ModelRenderer lrleg3;
/*     */   ModelRenderer lrleg4;
/*     */   ModelRenderer abdomen;
/*     */   ModelRenderer thorax;
/*     */   ModelRenderer neck1;
/*     */   ModelRenderer neck2;
/*     */   ModelRenderer head1;
/*     */   ModelRenderer head2;
/*     */   ModelRenderer leye;
/*     */   ModelRenderer reye;
/*     */   ModelRenderer lantenna;
/*     */   ModelRenderer rantenna;
/*     */   ModelRenderer larm1;
/*     */   ModelRenderer larm2;
/*     */   ModelRenderer larm3;
/*     */   ModelRenderer lfwing;
/*     */   ModelRenderer rfwing;
/*     */   ModelRenderer lrwing;
/*     */   ModelRenderer rrwing;
/*     */   ModelRenderer rarm1;
/*     */   ModelRenderer rarm2;
/*     */   ModelRenderer rarm3;
/*     */   ModelRenderer rlfleg3;
/*     */   ModelRenderer rfleg4;
/*     */   ModelRenderer rfleg2;
/*     */   ModelRenderer rfleg1;
/*     */   ModelRenderer rrleg3;
/*     */   ModelRenderer rrleg4;
/*     */   ModelRenderer rrleg2;
/*     */   ModelRenderer rrleg1;
/*     */   
/*     */   public ModelMantis(float f1) {
/*  52 */     this.wingspeed = f1;
/*     */     
/*  54 */     this.field_78090_t = 256;
/*  55 */     this.field_78089_u = 256;
/*     */ 
/*     */     
/*  58 */     this.lfleg1 = new ModelRenderer(this, 28, 35);
/*  59 */     this.lfleg1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 10, 1);
/*  60 */     this.lfleg1.func_78793_a(27.0F, 16.0F, -3.0F);
/*  61 */     this.lfleg1.func_78787_b(256, 256);
/*  62 */     this.lfleg1.field_78809_i = true;
/*  63 */     setRotation(this.lfleg1, 0.0F, 0.0F, -0.6283185F);
/*  64 */     this.lfleg2 = new ModelRenderer(this, 0, 32);
/*  65 */     this.lfleg2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 22, 1);
/*  66 */     this.lfleg2.func_78793_a(21.0F, -5.0F, -3.0F);
/*  67 */     this.lfleg2.func_78787_b(256, 256);
/*  68 */     this.lfleg2.field_78809_i = true;
/*  69 */     setRotation(this.lfleg2, 0.0F, 0.0F, -0.2792527F);
/*  70 */     this.lfleg3 = new ModelRenderer(this, 64, 2);
/*  71 */     this.lfleg3.func_78789_a(0.0F, 0.0F, 0.0F, 20, 1, 1);
/*  72 */     this.lfleg3.func_78793_a(2.0F, -5.0F, 0.0F);
/*  73 */     this.lfleg3.func_78787_b(256, 256);
/*  74 */     this.lfleg3.field_78809_i = true;
/*  75 */     setRotation(this.lfleg3, 0.0F, 0.1570796F, 0.0F);
/*  76 */     this.lfleg4 = new ModelRenderer(this, 64, 20);
/*  77 */     this.lfleg4.func_78789_a(15.0F, 0.0F, -2.0F, 4, 1, 5);
/*  78 */     this.lfleg4.func_78793_a(2.0F, -5.0F, 0.0F);
/*  79 */     this.lfleg4.func_78787_b(256, 256);
/*  80 */     this.lfleg4.field_78809_i = true;
/*  81 */     setRotation(this.lfleg4, 0.0F, 0.1570796F, 0.0F);
/*  82 */     this.lrleg1 = new ModelRenderer(this, 35, 35);
/*  83 */     this.lrleg1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 10, 1);
/*  84 */     this.lrleg1.func_78793_a(32.0F, 18.0F, 11.0F);
/*  85 */     this.lrleg1.func_78787_b(256, 256);
/*  86 */     this.lrleg1.field_78809_i = true;
/*  87 */     setRotation(this.lrleg1, 0.0F, 0.0F, -0.8726646F);
/*  88 */     this.lrleg2 = new ModelRenderer(this, 14, 32);
/*  89 */     this.lrleg2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 22, 1);
/*  90 */     this.lrleg2.func_78793_a(21.0F, 0.0F, 11.0F);
/*  91 */     this.lrleg2.func_78787_b(256, 256);
/*  92 */     this.lrleg2.field_78809_i = true;
/*  93 */     setRotation(this.lrleg2, 0.0F, 0.0F, -0.5410521F);
/*  94 */     this.lrleg3 = new ModelRenderer(this, 64, 11);
/*  95 */     this.lrleg3.func_78789_a(0.0F, 0.0F, 0.0F, 20, 1, 1);
/*  96 */     this.lrleg3.func_78793_a(2.0F, 0.0F, 8.0F);
/*  97 */     this.lrleg3.func_78787_b(256, 256);
/*  98 */     this.lrleg3.field_78809_i = true;
/*  99 */     setRotation(this.lrleg3, 0.0F, -0.1570796F, 0.0F);
/* 100 */     this.lrleg4 = new ModelRenderer(this, 64, 36);
/* 101 */     this.lrleg4.func_78789_a(15.0F, 0.0F, -2.0F, 4, 1, 5);
/* 102 */     this.lrleg4.func_78793_a(2.0F, 0.0F, 8.0F);
/* 103 */     this.lrleg4.func_78787_b(256, 256);
/* 104 */     this.lrleg4.field_78809_i = true;
/* 105 */     setRotation(this.lrleg4, 0.0F, -0.1570796F, 0.0F);
/* 106 */     this.abdomen = new ModelRenderer(this, 118, 0);
/* 107 */     this.abdomen.func_78789_a(0.0F, 0.0F, 0.0F, 9, 5, 53);
/* 108 */     this.abdomen.func_78793_a(-4.0F, -11.0F, 0.0F);
/* 109 */     this.abdomen.func_78787_b(256, 256);
/* 110 */     this.abdomen.field_78809_i = true;
/* 111 */     setRotation(this.abdomen, -0.5061455F, 0.0F, 0.0F);
/* 112 */     this.thorax = new ModelRenderer(this, 145, 62);
/* 113 */     this.thorax.func_78789_a(0.0F, 0.0F, 0.0F, 15, 3, 13);
/* 114 */     this.thorax.func_78793_a(-7.0F, -14.0F, -12.0F);
/* 115 */     this.thorax.func_78787_b(256, 256);
/* 116 */     this.thorax.field_78809_i = true;
/* 117 */     setRotation(this.thorax, -0.2443461F, 0.0F, 0.0F);
/* 118 */     this.neck1 = new ModelRenderer(this, 145, 82);
/* 119 */     this.neck1.func_78789_a(0.0F, 0.0F, 0.0F, 9, 1, 15);
/* 120 */     this.neck1.func_78793_a(-4.0F, -15.0F, -27.0F);
/* 121 */     this.neck1.func_78787_b(256, 256);
/* 122 */     this.neck1.field_78809_i = true;
/* 123 */     setRotation(this.neck1, -0.0698132F, 0.0F, 0.0F);
/* 124 */     this.neck2 = new ModelRenderer(this, 40, 150);
/* 125 */     this.neck2.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 2);
/* 126 */     this.neck2.func_78793_a(-1.0F, -15.0F, -29.0F);
/* 127 */     this.neck2.func_78787_b(256, 256);
/* 128 */     this.neck2.field_78809_i = true;
/* 129 */     setRotation(this.neck2, 0.0F, 0.0F, 0.0F);
/* 130 */     this.head1 = new ModelRenderer(this, 0, 150);
/* 131 */     this.head1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 6, 1);
/* 132 */     this.head1.func_78793_a(0.0F, -16.0F, -30.0F);
/* 133 */     this.head1.func_78787_b(256, 256);
/* 134 */     this.head1.field_78809_i = true;
/* 135 */     setRotation(this.head1, 0.0F, 0.0F, 0.1396263F);
/* 136 */     this.head2 = new ModelRenderer(this, 10, 150);
/* 137 */     this.head2.func_78789_a(-2.0F, 0.0F, 0.0F, 2, 6, 1);
/* 138 */     this.head2.func_78793_a(0.0F, -16.0F, -30.0F);
/* 139 */     this.head2.func_78787_b(256, 256);
/* 140 */     this.head2.field_78809_i = true;
/* 141 */     setRotation(this.head2, 0.0F, 0.0F, -0.1745329F);
/* 142 */     this.leye = new ModelRenderer(this, 20, 150);
/* 143 */     this.leye.func_78789_a(1.0F, 0.0F, -0.5F, 2, 2, 1);
/* 144 */     this.leye.func_78793_a(0.0F, -16.0F, -30.0F);
/* 145 */     this.leye.func_78787_b(256, 256);
/* 146 */     this.leye.field_78809_i = true;
/* 147 */     setRotation(this.leye, 0.0F, 0.0F, 0.1396263F);
/* 148 */     this.reye = new ModelRenderer(this, 30, 150);
/* 149 */     this.reye.func_78789_a(-3.0F, 0.0F, -0.5F, 2, 2, 1);
/* 150 */     this.reye.func_78793_a(0.0F, -16.0F, -30.0F);
/* 151 */     this.reye.func_78787_b(256, 256);
/* 152 */     this.reye.field_78809_i = true;
/* 153 */     setRotation(this.reye, 0.0F, 0.0F, -0.1745329F);
/* 154 */     this.lantenna = new ModelRenderer(this, 53, 150);
/* 155 */     this.lantenna.func_78789_a(0.0F, -20.0F, 0.0F, 1, 20, 1);
/* 156 */     this.lantenna.func_78793_a(0.0F, -16.0F, -30.0F);
/* 157 */     this.lantenna.func_78787_b(256, 256);
/* 158 */     this.lantenna.field_78809_i = true;
/* 159 */     setRotation(this.lantenna, 0.0F, 0.0F, 0.2792527F);
/* 160 */     this.rantenna = new ModelRenderer(this, 60, 150);
/* 161 */     this.rantenna.func_78789_a(-1.0F, -20.0F, 0.0F, 1, 20, 1);
/* 162 */     this.rantenna.func_78793_a(0.0F, -16.0F, -30.0F);
/* 163 */     this.rantenna.func_78787_b(256, 256);
/* 164 */     this.rantenna.field_78809_i = true;
/* 165 */     setRotation(this.rantenna, 0.0F, 0.0F, -0.2792527F);
/* 166 */     this.larm1 = new ModelRenderer(this, 51, 0);
/* 167 */     this.larm1.func_78789_a(0.0F, 0.0F, -1.0F, 1, 23, 4);
/* 168 */     this.larm1.func_78793_a(2.0F, -14.0F, -23.0F);
/* 169 */     this.larm1.func_78787_b(256, 256);
/* 170 */     this.larm1.field_78809_i = true;
/* 171 */     setRotation(this.larm1, 0.0349066F, 0.0F, 0.0F);
/* 172 */     this.larm2 = new ModelRenderer(this, 30, 0);
/* 173 */     this.larm2.func_78789_a(0.0F, -18.0F, -2.0F, 1, 18, 2);
/* 174 */     this.larm2.func_78793_a(2.0F, 8.0F, -22.0F);
/* 175 */     this.larm2.func_78787_b(256, 256);
/* 176 */     this.larm2.field_78809_i = true;
/* 177 */     setRotation(this.larm2, 0.5585054F, 0.0F, 0.0F);
/* 178 */     this.larm3 = new ModelRenderer(this, 16, 0);
/* 179 */     this.larm3.func_78789_a(0.0F, 0.0F, 0.0F, 1, 21, 1);
/* 180 */     this.larm3.func_78793_a(2.0F, -7.0F, -33.0F);
/* 181 */     this.larm3.func_78787_b(256, 256);
/* 182 */     this.larm3.field_78809_i = true;
/* 183 */     setRotation(this.larm3, 0.0F, 0.0F, 0.0F);
/* 184 */     this.lfwing = new ModelRenderer(this, 0, 67);
/* 185 */     this.lfwing.func_78789_a(0.0F, 0.0F, 0.0F, 48, 1, 12);
/* 186 */     this.lfwing.func_78793_a(2.0F, -11.0F, 0.0F);
/* 187 */     this.lfwing.func_78787_b(256, 256);
/* 188 */     this.lfwing.field_78809_i = true;
/* 189 */     setRotation(this.lfwing, -0.2268928F, 0.0F, -0.6981317F);
/* 190 */     this.rfwing = new ModelRenderer(this, 0, 83);
/* 191 */     this.rfwing.func_78789_a(-48.0F, 0.0F, 0.0F, 48, 1, 12);
/* 192 */     this.rfwing.func_78793_a(-1.0F, -11.0F, 0.0F);
/* 193 */     this.rfwing.func_78787_b(256, 256);
/* 194 */     this.rfwing.field_78809_i = true;
/* 195 */     setRotation(this.rfwing, -0.2268928F, 0.0F, 0.6981317F);
/* 196 */     this.lrwing = new ModelRenderer(this, 0, 100);
/* 197 */     this.lrwing.func_78789_a(0.0F, 0.0F, 0.0F, 42, 1, 17);
/* 198 */     this.lrwing.func_78793_a(2.0F, -6.0F, 10.0F);
/* 199 */     this.lrwing.func_78787_b(256, 256);
/* 200 */     this.lrwing.field_78809_i = true;
/* 201 */     setRotation(this.lrwing, -0.2268928F, 0.0F, -0.3490659F);
/* 202 */     this.rrwing = new ModelRenderer(this, 0, 122);
/* 203 */     this.rrwing.func_78789_a(-42.0F, 0.0F, 0.0F, 42, 1, 17);
/* 204 */     this.rrwing.func_78793_a(-1.0F, -6.0F, 10.0F);
/* 205 */     this.rrwing.func_78787_b(256, 256);
/* 206 */     this.rrwing.field_78809_i = true;
/* 207 */     setRotation(this.rrwing, -0.2268928F, 0.0F, 0.3490659F);
/* 208 */     this.rarm1 = new ModelRenderer(this, 38, 0);
/* 209 */     this.rarm1.func_78789_a(0.0F, 0.0F, -1.0F, 1, 23, 4);
/* 210 */     this.rarm1.func_78793_a(-1.0F, -14.0F, -23.0F);
/* 211 */     this.rarm1.func_78787_b(256, 256);
/* 212 */     this.rarm1.field_78809_i = true;
/* 213 */     setRotation(this.rarm1, 0.0349066F, 0.0F, 0.0F);
/* 214 */     this.rarm2 = new ModelRenderer(this, 22, 0);
/* 215 */     this.rarm2.func_78789_a(0.0F, -18.0F, -2.0F, 1, 18, 2);
/* 216 */     this.rarm2.func_78793_a(-1.0F, 8.0F, -22.0F);
/* 217 */     this.rarm2.func_78787_b(256, 256);
/* 218 */     this.rarm2.field_78809_i = true;
/* 219 */     setRotation(this.rarm2, 0.5585054F, 0.0F, 0.0F);
/* 220 */     this.rarm3 = new ModelRenderer(this, 10, 0);
/* 221 */     this.rarm3.func_78789_a(0.0F, 0.0F, 0.0F, 1, 21, 1);
/* 222 */     this.rarm3.func_78793_a(-1.0F, -7.0F, -33.0F);
/* 223 */     this.rarm3.func_78787_b(256, 256);
/* 224 */     this.rarm3.field_78809_i = true;
/* 225 */     setRotation(this.rarm3, 0.0F, 0.0F, 0.0F);
/* 226 */     this.rlfleg3 = new ModelRenderer(this, 64, 6);
/* 227 */     this.rlfleg3.func_78789_a(-20.0F, 0.0F, 0.0F, 20, 1, 1);
/* 228 */     this.rlfleg3.func_78793_a(-1.0F, -5.0F, 0.0F);
/* 229 */     this.rlfleg3.func_78787_b(256, 256);
/* 230 */     this.rlfleg3.field_78809_i = true;
/* 231 */     setRotation(this.rlfleg3, 0.0F, -0.1570796F, 0.0F);
/* 232 */     this.rfleg4 = new ModelRenderer(this, 64, 28);
/* 233 */     this.rfleg4.func_78789_a(-19.0F, 0.0F, -2.0F, 4, 1, 5);
/* 234 */     this.rfleg4.func_78793_a(-1.0F, -5.0F, 0.0F);
/* 235 */     this.rfleg4.func_78787_b(256, 256);
/* 236 */     this.rfleg4.field_78809_i = true;
/* 237 */     setRotation(this.rfleg4, 0.0F, -0.1570796F, 0.0F);
/* 238 */     this.rfleg2 = new ModelRenderer(this, 7, 32);
/* 239 */     this.rfleg2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 22, 1);
/* 240 */     this.rfleg2.func_78793_a(-21.0F, -5.0F, -3.0F);
/* 241 */     this.rfleg2.func_78787_b(256, 256);
/* 242 */     this.rfleg2.field_78809_i = true;
/* 243 */     setRotation(this.rfleg2, 0.0F, 0.0F, 0.2792527F);
/* 244 */     this.rfleg1 = new ModelRenderer(this, 42, 35);
/* 245 */     this.rfleg1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 10, 1);
/* 246 */     this.rfleg1.func_78793_a(-27.0F, 16.0F, -3.0F);
/* 247 */     this.rfleg1.func_78787_b(256, 256);
/* 248 */     this.rfleg1.field_78809_i = true;
/* 249 */     setRotation(this.rfleg1, 0.0F, 0.0F, 0.6283185F);
/* 250 */     this.rrleg3 = new ModelRenderer(this, 64, 16);
/* 251 */     this.rrleg3.func_78789_a(-20.0F, 0.0F, 0.0F, 20, 1, 1);
/* 252 */     this.rrleg3.func_78793_a(-1.0F, 0.0F, 8.0F);
/* 253 */     this.rrleg3.func_78787_b(256, 256);
/* 254 */     this.rrleg3.field_78809_i = true;
/* 255 */     setRotation(this.rrleg3, 0.0F, 0.1570796F, 0.0F);
/* 256 */     this.rrleg4 = new ModelRenderer(this, 64, 44);
/* 257 */     this.rrleg4.func_78789_a(-19.0F, 0.0F, -2.0F, 4, 1, 5);
/* 258 */     this.rrleg4.func_78793_a(-1.0F, 0.0F, 8.0F);
/* 259 */     this.rrleg4.func_78787_b(256, 256);
/* 260 */     this.rrleg4.field_78809_i = true;
/* 261 */     setRotation(this.rrleg4, 0.0F, 0.1570796F, 0.0F);
/* 262 */     this.rrleg2 = new ModelRenderer(this, 21, 32);
/* 263 */     this.rrleg2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 22, 1);
/* 264 */     this.rrleg2.func_78793_a(-21.0F, 0.0F, 11.0F);
/* 265 */     this.rrleg2.func_78787_b(256, 256);
/* 266 */     this.rrleg2.field_78809_i = true;
/* 267 */     setRotation(this.rrleg2, 0.0F, 0.0F, 0.5410521F);
/* 268 */     this.rrleg1 = new ModelRenderer(this, 49, 35);
/* 269 */     this.rrleg1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 10, 1);
/* 270 */     this.rrleg1.func_78793_a(-32.0F, 18.0F, 11.0F);
/* 271 */     this.rrleg1.func_78787_b(256, 256);
/* 272 */     this.rrleg1.field_78809_i = true;
/* 273 */     setRotation(this.rrleg1, 0.0F, 0.0F, 0.8726646F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 278 */     float a1, newangle = 0.0F;
/*     */     
/* 280 */     Mantis b = (Mantis)entity;
/*     */     
/* 282 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 283 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */     
/* 287 */     newangle = MathHelper.func_76134_b(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.25F;
/* 288 */     this.lfwing.field_78808_h = -0.698F - newangle;
/* 289 */     this.rfwing.field_78808_h = 0.698F + newangle;
/* 290 */     newangle = MathHelper.func_76134_b(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.35F;
/* 291 */     this.lrwing.field_78808_h = -0.349F + newangle;
/* 292 */     this.rrwing.field_78808_h = 0.349F - newangle;
/*     */ 
/*     */     
/* 295 */     if (b.getAttacking() == 0) {
/* 296 */       newangle = MathHelper.func_76134_b(f2 * 0.051F * this.wingspeed) * 3.1415927F * 0.013F;
/* 297 */       a1 = -0.2F;
/*     */     } else {
/* 299 */       newangle = MathHelper.func_76134_b(f2 * 0.51F * this.wingspeed) * 3.1415927F * 0.25F;
/* 300 */       a1 = -0.698F;
/*     */     } 
/* 302 */     this.larm1.field_78795_f = a1 + newangle;
/* 303 */     this.larm2.field_78798_e = (float)((this.larm1.field_78798_e + 1.0F) + Math.sin(this.larm1.field_78795_f) * 22.0D);
/* 304 */     this.larm2.field_78797_d = (float)(this.larm1.field_78797_d + Math.cos(this.larm1.field_78795_f) * 22.0D);
/* 305 */     this.larm2.field_78795_f = -a1 - newangle;
/* 306 */     this.larm3.field_78798_e = (float)((this.larm2.field_78798_e + 1.0F) - Math.sin(this.larm2.field_78795_f) * 17.0D);
/* 307 */     this.larm3.field_78797_d = (float)(this.larm2.field_78797_d - Math.cos(this.larm2.field_78795_f) * 17.0D);
/* 308 */     this.larm3.field_78795_f = a1 + newangle;
/*     */     
/* 310 */     this.rarm1.field_78795_f = a1 - newangle;
/* 311 */     this.rarm2.field_78798_e = (float)((this.rarm1.field_78798_e + 1.0F) + Math.sin(this.rarm1.field_78795_f) * 22.0D);
/* 312 */     this.rarm2.field_78797_d = (float)(this.rarm1.field_78797_d + Math.cos(this.rarm1.field_78795_f) * 22.0D);
/* 313 */     this.rarm2.field_78795_f = -a1 + newangle;
/* 314 */     this.rarm3.field_78798_e = (float)((this.rarm2.field_78798_e + 1.0F) - Math.sin(this.rarm2.field_78795_f) * 17.0D);
/* 315 */     this.rarm3.field_78797_d = (float)(this.rarm2.field_78797_d - Math.cos(this.rarm2.field_78795_f) * 17.0D);
/* 316 */     this.rarm3.field_78795_f = a1 - newangle;
/*     */ 
/*     */ 
/*     */     
/* 320 */     this.lfleg1.func_78785_a(f5);
/* 321 */     this.lfleg2.func_78785_a(f5);
/* 322 */     this.lfleg3.func_78785_a(f5);
/* 323 */     this.lfleg4.func_78785_a(f5);
/* 324 */     this.lrleg1.func_78785_a(f5);
/* 325 */     this.lrleg2.func_78785_a(f5);
/* 326 */     this.lrleg3.func_78785_a(f5);
/* 327 */     this.lrleg4.func_78785_a(f5);
/* 328 */     this.abdomen.func_78785_a(f5);
/* 329 */     this.thorax.func_78785_a(f5);
/* 330 */     this.neck1.func_78785_a(f5);
/* 331 */     this.neck2.func_78785_a(f5);
/* 332 */     this.head1.func_78785_a(f5);
/* 333 */     this.head2.func_78785_a(f5);
/* 334 */     this.leye.func_78785_a(f5);
/* 335 */     this.reye.func_78785_a(f5);
/* 336 */     this.lantenna.func_78785_a(f5);
/* 337 */     this.rantenna.func_78785_a(f5);
/* 338 */     this.larm1.func_78785_a(f5);
/* 339 */     this.larm2.func_78785_a(f5);
/* 340 */     this.larm3.func_78785_a(f5);
/* 341 */     this.lfwing.func_78785_a(f5);
/* 342 */     this.rfwing.func_78785_a(f5);
/* 343 */     this.lrwing.func_78785_a(f5);
/* 344 */     this.rrwing.func_78785_a(f5);
/* 345 */     this.rarm1.func_78785_a(f5);
/* 346 */     this.rarm2.func_78785_a(f5);
/* 347 */     this.rarm3.func_78785_a(f5);
/* 348 */     this.rlfleg3.func_78785_a(f5);
/* 349 */     this.rfleg4.func_78785_a(f5);
/* 350 */     this.rfleg2.func_78785_a(f5);
/* 351 */     this.rfleg1.func_78785_a(f5);
/* 352 */     this.rrleg3.func_78785_a(f5);
/* 353 */     this.rrleg4.func_78785_a(f5);
/* 354 */     this.rrleg2.func_78785_a(f5);
/* 355 */     this.rrleg1.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 362 */     model.field_78795_f = x;
/* 363 */     model.field_78796_g = y;
/* 364 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 369 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelMantis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */