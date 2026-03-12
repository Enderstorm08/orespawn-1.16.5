/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelHammerhead
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer chest;
/*     */   
/*     */   ModelRenderer abdomen;
/*     */   
/*     */   ModelRenderer neck;
/*     */   ModelRenderer head;
/*     */   ModelRenderer snout;
/*     */   ModelRenderer neck_armour;
/*     */   ModelRenderer horn_base;
/*     */   ModelRenderer horn_1;
/*     */   ModelRenderer horn_2;
/*     */   ModelRenderer horn_R;
/*     */   ModelRenderer horn_L;
/*     */   ModelRenderer back_armour1;
/*     */   ModelRenderer back_armour_2;
/*     */   ModelRenderer back_armour_3;
/*     */   ModelRenderer back_armour_3R;
/*     */   ModelRenderer back_armour_4;
/*     */   ModelRenderer back_armour_4R;
/*     */   ModelRenderer tail;
/*     */   ModelRenderer leg_1R;
/*     */   ModelRenderer leg_1;
/*     */   ModelRenderer leg_2;
/*     */   ModelRenderer leg_2R;
/*     */   ModelRenderer leg_3R;
/*     */   ModelRenderer leg_3;
/*     */   ModelRenderer leg_1Rb;
/*     */   ModelRenderer leg_1b;
/*     */   ModelRenderer leg_2b;
/*     */   ModelRenderer leg_2Rb;
/*     */   ModelRenderer leg_3Rb;
/*     */   ModelRenderer leg_3b;
/*     */   ModelRenderer fan1;
/*     */   ModelRenderer Lfan2;
/*     */   ModelRenderer Rfan2;
/*     */   ModelRenderer Lfan3;
/*     */   ModelRenderer Rfan3;
/*     */   ModelRenderer Lear;
/*     */   ModelRenderer Rear;
/*     */   
/*     */   public ModelHammerhead(float f1) {
/*  54 */     this.wingspeed = f1;
/*     */     
/*  56 */     this.field_78090_t = 222;
/*  57 */     this.field_78089_u = 256;
/*     */     
/*  59 */     this.chest = new ModelRenderer(this, 0, 0);
/*  60 */     this.chest.func_78789_a(-9.0F, -1.0F, 0.0F, 19, 16, 17);
/*  61 */     this.chest.func_78793_a(0.0F, -1.0F, -12.0F);
/*  62 */     this.chest.func_78787_b(222, 256);
/*  63 */     this.chest.field_78809_i = true;
/*  64 */     setRotation(this.chest, 0.0349066F, 0.0F, 0.0F);
/*  65 */     this.abdomen = new ModelRenderer(this, 0, 34);
/*  66 */     this.abdomen.func_78789_a(-7.5F, 0.0F, 0.0F, 16, 14, 16);
/*  67 */     this.abdomen.func_78793_a(0.0F, -2.0F, 4.0F);
/*  68 */     this.abdomen.func_78787_b(222, 256);
/*  69 */     this.abdomen.field_78809_i = true;
/*  70 */     setRotation(this.abdomen, -0.0349066F, 0.0F, 0.0F);
/*  71 */     this.neck = new ModelRenderer(this, 146, 59);
/*  72 */     this.neck.func_78789_a(-6.5F, -0.5F, -12.0F, 14, 13, 13);
/*  73 */     this.neck.func_78793_a(0.0F, -1.0F, -12.0F);
/*  74 */     this.neck.func_78787_b(222, 256);
/*  75 */     this.neck.field_78809_i = true;
/*  76 */     setRotation(this.neck, 0.1570796F, 0.0F, 0.0F);
/*  77 */     this.head = new ModelRenderer(this, 101, 59);
/*  78 */     this.head.func_78789_a(-6.0F, -0.5F, -21.0F, 13, 11, 9);
/*  79 */     this.head.func_78793_a(0.0F, -1.0F, -12.0F);
/*  80 */     this.head.func_78787_b(222, 256);
/*  81 */     this.head.field_78809_i = true;
/*  82 */     setRotation(this.head, 0.2094395F, 0.0F, 0.0F);
/*  83 */     this.snout = new ModelRenderer(this, 166, 86);
/*  84 */     this.snout.func_78789_a(-4.0F, -6.0F, -27.0F, 9, 8, 8);
/*  85 */     this.snout.func_78793_a(0.0F, -1.0F, -12.0F);
/*  86 */     this.snout.func_78787_b(222, 256);
/*  87 */     this.snout.field_78809_i = true;
/*  88 */     setRotation(this.snout, 0.6108652F, 0.0F, 0.0F);
/*  89 */     this.neck_armour = new ModelRenderer(this, 73, 0);
/*  90 */     this.neck_armour.func_78789_a(-7.0F, -1.5F, -18.0F, 15, 4, 18);
/*  91 */     this.neck_armour.func_78793_a(0.0F, -1.0F, -12.0F);
/*  92 */     this.neck_armour.func_78787_b(222, 256);
/*  93 */     this.neck_armour.field_78809_i = true;
/*  94 */     setRotation(this.neck_armour, 0.1570796F, 0.0F, 0.0F);
/*  95 */     this.horn_base = new ModelRenderer(this, 49, 35);
/*  96 */     this.horn_base.func_78789_a(-7.0F, -1.5F, -27.0F, 15, 5, 9);
/*  97 */     this.horn_base.func_78793_a(0.0F, -1.0F, -12.0F);
/*  98 */     this.horn_base.func_78787_b(222, 256);
/*  99 */     this.horn_base.field_78809_i = true;
/* 100 */     setRotation(this.horn_base, 0.0872665F, 0.0F, 0.0F);
/* 101 */     this.horn_1 = new ModelRenderer(this, 122, 23);
/* 102 */     this.horn_1.func_78789_a(-12.0F, -4.5F, -40.0F, 25, 6, 14);
/* 103 */     this.horn_1.func_78793_a(0.0F, -1.0F, -12.0F);
/* 104 */     this.horn_1.func_78787_b(222, 256);
/* 105 */     this.horn_1.field_78809_i = true;
/* 106 */     setRotation(this.horn_1, 0.1919862F, 0.0F, 0.0F);
/* 107 */     this.horn_2 = new ModelRenderer(this, 106, 44);
/* 108 */     this.horn_2.func_78789_a(-18.0F, -3.5F, -37.0F, 37, 4, 10);
/* 109 */     this.horn_2.func_78793_a(0.0F, -1.0F, -12.0F);
/* 110 */     this.horn_2.func_78787_b(222, 256);
/* 111 */     this.horn_2.field_78809_i = true;
/* 112 */     setRotation(this.horn_2, 0.1919862F, 0.0F, 0.0F);
/* 113 */     this.horn_R = new ModelRenderer(this, 158, 0);
/* 114 */     this.horn_R.func_78789_a(-26.0F, -5.5F, -38.5F, 8, 7, 13);
/* 115 */     this.horn_R.func_78793_a(0.0F, -1.0F, -12.0F);
/* 116 */     this.horn_R.func_78787_b(222, 256);
/* 117 */     this.horn_R.field_78809_i = true;
/* 118 */     setRotation(this.horn_R, 0.1919862F, 0.0F, -0.0174533F);
/* 119 */     this.horn_L = new ModelRenderer(this, 158, 0);
/* 120 */     this.horn_L.func_78789_a(19.0F, -5.5F, -38.5F, 8, 7, 13);
/* 121 */     this.horn_L.func_78793_a(0.0F, -1.0F, -12.0F);
/* 122 */     this.horn_L.func_78787_b(222, 256);
/* 123 */     this.horn_L.field_78809_i = true;
/* 124 */     setRotation(this.horn_L, 0.1919862F, 0.0F, -0.0174533F);
/* 125 */     this.back_armour1 = new ModelRenderer(this, 0, 98);
/* 126 */     this.back_armour1.func_78789_a(-5.0F, -2.5F, -6.0F, 9, 3, 7);
/* 127 */     this.back_armour1.func_78793_a(1.0F, -4.0F, -15.0F);
/* 128 */     this.back_armour1.func_78787_b(222, 256);
/* 129 */     this.back_armour1.field_78809_i = true;
/* 130 */     setRotation(this.back_armour1, -0.0872665F, 0.0F, 0.0F);
/* 131 */     this.back_armour_2 = new ModelRenderer(this, 0, 65);
/* 132 */     this.back_armour_2.func_78789_a(-8.0F, -4.5F, -13.0F, 17, 4, 28);
/* 133 */     this.back_armour_2.func_78793_a(0.0F, -1.0F, -3.0F);
/* 134 */     this.back_armour_2.func_78787_b(222, 256);
/* 135 */     this.back_armour_2.field_78809_i = true;
/* 136 */     setRotation(this.back_armour_2, -0.122173F, 0.0F, 0.0F);
/* 137 */     this.back_armour_3 = new ModelRenderer(this, 15, 104);
/* 138 */     this.back_armour_3.func_78789_a(0.5F, -3.5F, -13.0F, 4, 4, 20);
/* 139 */     this.back_armour_3.func_78793_a(8.0F, 1.0F, -2.0F);
/* 140 */     this.back_armour_3.func_78787_b(222, 256);
/* 141 */     this.back_armour_3.field_78809_i = true;
/* 142 */     setRotation(this.back_armour_3, 0.0174533F, 0.1570796F, 0.0F);
/* 143 */     this.back_armour_3R = new ModelRenderer(this, 15, 104);
/* 144 */     this.back_armour_3R.func_78789_a(-3.5F, -3.5F, -13.0F, 4, 4, 20);
/* 145 */     this.back_armour_3R.func_78793_a(-8.0F, 1.0F, -2.0F);
/* 146 */     this.back_armour_3R.func_78787_b(222, 256);
/* 147 */     this.back_armour_3R.field_78809_i = true;
/* 148 */     setRotation(this.back_armour_3R, 0.0174533F, -0.1570796F, 0.0F);
/* 149 */     this.back_armour_4 = new ModelRenderer(this, 0, 65);
/* 150 */     this.back_armour_4.func_78789_a(1.5F, -1.5F, -3.0F, 3, 4, 10);
/* 151 */     this.back_armour_4.func_78793_a(6.0F, 5.0F, -10.0F);
/* 152 */     this.back_armour_4.func_78787_b(222, 256);
/* 153 */     this.back_armour_4.field_78809_i = true;
/* 154 */     setRotation(this.back_armour_4, -0.1396263F, 0.3490659F, 0.0F);
/* 155 */     this.back_armour_4R = new ModelRenderer(this, 0, 65);
/* 156 */     this.back_armour_4R.func_78789_a(-1.5F, -1.5F, -3.0F, 3, 4, 10);
/* 157 */     this.back_armour_4R.func_78793_a(-8.0F, 5.0F, -11.0F);
/* 158 */     this.back_armour_4R.func_78787_b(222, 256);
/* 159 */     this.back_armour_4R.field_78809_i = true;
/* 160 */     setRotation(this.back_armour_4R, -0.1396263F, -0.3490659F, 0.0F);
/* 161 */     this.tail = new ModelRenderer(this, 66, 52);
/* 162 */     this.tail.func_78789_a(-2.0F, 0.0F, -3.0F, 5, 5, 3);
/* 163 */     this.tail.func_78793_a(0.0F, 0.0F, 20.0F);
/* 164 */     this.tail.func_78787_b(222, 256);
/* 165 */     this.tail.field_78809_i = true;
/* 166 */     setRotation(this.tail, 0.5061455F, 0.0F, 0.0F);
/* 167 */     this.leg_1R = new ModelRenderer(this, 71, 102);
/* 168 */     this.leg_1R.func_78789_a(-2.5F, -2.5F, -3.0F, 5, 10, 6);
/* 169 */     this.leg_1R.func_78793_a(-9.0F, 11.0F, -10.0F);
/* 170 */     this.leg_1R.func_78787_b(222, 256);
/* 171 */     this.leg_1R.field_78809_i = true;
/* 172 */     setRotation(this.leg_1R, -0.0872665F, 0.0F, 0.0F);
/* 173 */     this.leg_1 = new ModelRenderer(this, 64, 76);
/* 174 */     this.leg_1.func_78789_a(-1.5F, -2.5F, -3.0F, 5, 10, 6);
/* 175 */     this.leg_1.func_78793_a(9.0F, 11.0F, -10.0F);
/* 176 */     this.leg_1.func_78787_b(222, 256);
/* 177 */     this.leg_1.field_78809_i = true;
/* 178 */     setRotation(this.leg_1, -0.0872665F, 0.0F, 0.0F);
/* 179 */     this.leg_2 = new ModelRenderer(this, 98, 28);
/* 180 */     this.leg_2.func_78789_a(-1.5F, -2.5F, -3.0F, 5, 9, 6);
/* 181 */     this.leg_2.func_78793_a(9.0F, 12.0F, -2.0F);
/* 182 */     this.leg_2.func_78787_b(222, 256);
/* 183 */     this.leg_2.field_78809_i = true;
/* 184 */     setRotation(this.leg_2, -0.0523599F, 0.0F, 0.0F);
/* 185 */     this.leg_2R = new ModelRenderer(this, 98, 80);
/* 186 */     this.leg_2R.func_78789_a(-1.5F, -2.5F, -3.0F, 5, 9, 6);
/* 187 */     this.leg_2R.func_78793_a(-10.0F, 12.0F, -2.0F);
/* 188 */     this.leg_2R.func_78787_b(222, 256);
/* 189 */     this.leg_2R.field_78809_i = true;
/* 190 */     setRotation(this.leg_2R, -0.0523599F, 0.0F, 0.0F);
/* 191 */     this.leg_3R = new ModelRenderer(this, 44, 129);
/* 192 */     this.leg_3R.func_78789_a(-3.5F, -2.5F, -3.0F, 5, 11, 8);
/* 193 */     this.leg_3R.func_78793_a(-7.0F, 9.0F, 14.0F);
/* 194 */     this.leg_3R.func_78787_b(222, 256);
/* 195 */     this.leg_3R.field_78809_i = true;
/* 196 */     setRotation(this.leg_3R, -0.3490659F, 0.0F, 0.0F);
/* 197 */     this.leg_3 = new ModelRenderer(this, 44, 99);
/* 198 */     this.leg_3.func_78789_a(-3.5F, -2.5F, -3.0F, 5, 11, 8);
/* 199 */     this.leg_3.func_78793_a(10.0F, 9.0F, 14.0F);
/* 200 */     this.leg_3.func_78787_b(222, 256);
/* 201 */     this.leg_3.field_78809_i = true;
/* 202 */     setRotation(this.leg_3, -0.3490659F, 0.0F, 0.0F);
/* 203 */     this.leg_1Rb = new ModelRenderer(this, 15, 129);
/* 204 */     this.leg_1Rb.func_78789_a(-2.0F, 5.5F, -3.0F, 4, 8, 5);
/* 205 */     this.leg_1Rb.func_78793_a(-9.0F, 11.0F, -10.0F);
/* 206 */     this.leg_1Rb.func_78787_b(222, 256);
/* 207 */     this.leg_1Rb.field_78809_i = true;
/* 208 */     setRotation(this.leg_1Rb, 0.0F, 0.0F, 0.0F);
/* 209 */     this.leg_1b = new ModelRenderer(this, 15, 110);
/* 210 */     this.leg_1b.func_78789_a(-1.0F, 5.5F, -3.0F, 4, 8, 5);
/* 211 */     this.leg_1b.func_78793_a(9.0F, 11.0F, -10.0F);
/* 212 */     this.leg_1b.func_78787_b(222, 256);
/* 213 */     this.leg_1b.field_78809_i = true;
/* 214 */     setRotation(this.leg_1b, 0.0F, 0.0F, 0.0F);
/* 215 */     this.leg_2b = new ModelRenderer(this, 57, 1);
/* 216 */     this.leg_2b.func_78789_a(-1.0F, 5.5F, -3.0F, 4, 7, 5);
/* 217 */     this.leg_2b.func_78793_a(9.0F, 12.0F, -2.0F);
/* 218 */     this.leg_2b.func_78787_b(222, 256);
/* 219 */     this.leg_2b.field_78809_i = true;
/* 220 */     setRotation(this.leg_2b, 0.0523599F, 0.0F, 0.0F);
/* 221 */     this.leg_2Rb = new ModelRenderer(this, 94, 106);
/* 222 */     this.leg_2Rb.func_78789_a(-2.0F, 5.5F, -3.0F, 4, 7, 5);
/* 223 */     this.leg_2Rb.func_78793_a(-9.0F, 12.0F, -2.0F);
/* 224 */     this.leg_2Rb.func_78787_b(222, 256);
/* 225 */     this.leg_2Rb.field_78809_i = true;
/* 226 */     setRotation(this.leg_2Rb, 0.0523599F, 0.0F, 0.0F);
/* 227 */     this.leg_3Rb = new ModelRenderer(this, 122, 81);
/* 228 */     this.leg_3Rb.func_78789_a(-2.0F, 6.5F, -5.0F, 4, 9, 5);
/* 229 */     this.leg_3Rb.func_78793_a(-8.0F, 9.0F, 14.0F);
/* 230 */     this.leg_3Rb.func_78787_b(222, 256);
/* 231 */     this.leg_3Rb.field_78809_i = true;
/* 232 */     setRotation(this.leg_3Rb, 0.122173F, 0.0F, 0.0F);
/* 233 */     this.leg_3b = new ModelRenderer(this, 122, 0);
/* 234 */     this.leg_3b.func_78789_a(-3.0F, 6.5F, -5.0F, 4, 9, 5);
/* 235 */     this.leg_3b.func_78793_a(10.0F, 9.0F, 14.0F);
/* 236 */     this.leg_3b.func_78787_b(222, 256);
/* 237 */     this.leg_3b.field_78809_i = true;
/* 238 */     setRotation(this.leg_3b, 0.122173F, 0.0F, 0.0F);
/* 239 */     this.fan1 = new ModelRenderer(this, 0, 109);
/* 240 */     this.fan1.func_78789_a(-1.0F, -7.0F, -34.0F, 4, 15, 1);
/* 241 */     this.fan1.func_78793_a(0.0F, -1.0F, -12.0F);
/* 242 */     this.fan1.func_78787_b(222, 256);
/* 243 */     this.fan1.field_78809_i = true;
/* 244 */     setRotation(this.fan1, -0.1396263F, 0.0F, 0.0F);
/* 245 */     this.Lfan2 = new ModelRenderer(this, 0, 109);
/* 246 */     this.Lfan2.func_78789_a(-1.0F, -3.0F, -31.5F, 4, 12, 1);
/* 247 */     this.Lfan2.func_78793_a(0.0F, -1.0F, -14.0F);
/* 248 */     this.Lfan2.func_78787_b(222, 256);
/* 249 */     this.Lfan2.field_78809_i = true;
/* 250 */     setRotation(this.Lfan2, -0.2094395F, -0.122173F, 0.0F);
/* 251 */     this.Rfan2 = new ModelRenderer(this, 0, 109);
/* 252 */     this.Rfan2.func_78789_a(-1.0F, -3.0F, -33.5F, 4, 12, 1);
/* 253 */     this.Rfan2.func_78793_a(0.0F, -1.0F, -12.0F);
/* 254 */     this.Rfan2.func_78787_b(222, 256);
/* 255 */     this.Rfan2.field_78809_i = true;
/* 256 */     setRotation(this.Rfan2, -0.2094395F, 0.122173F, 0.0F);
/* 257 */     this.Lfan3 = new ModelRenderer(this, 0, 109);
/* 258 */     this.Lfan3.func_78789_a(-1.0F, 4.0F, -32.0F, 4, 9, 1);
/* 259 */     this.Lfan3.func_78793_a(0.0F, -1.0F, -12.0F);
/* 260 */     this.Lfan3.func_78787_b(222, 256);
/* 261 */     this.Lfan3.field_78809_i = true;
/* 262 */     setRotation(this.Lfan3, -0.3316126F, -0.2268928F, 0.0F);
/* 263 */     this.Rfan3 = new ModelRenderer(this, 0, 109);
/* 264 */     this.Rfan3.func_78789_a(-1.0F, 4.0F, -32.0F, 4, 9, 1);
/* 265 */     this.Rfan3.func_78793_a(0.0F, -1.0F, -12.0F);
/* 266 */     this.Rfan3.func_78787_b(222, 256);
/* 267 */     this.Rfan3.field_78809_i = true;
/* 268 */     setRotation(this.Rfan3, -0.3316126F, 0.2443461F, 0.0F);
/* 269 */     this.Lear = new ModelRenderer(this, 0, 80);
/* 270 */     this.Lear.func_78789_a(8.5F, 2.5F, -10.0F, 1, 1, 10);
/* 271 */     this.Lear.func_78793_a(0.0F, -1.0F, -12.0F);
/* 272 */     this.Lear.func_78787_b(222, 256);
/* 273 */     this.Lear.field_78809_i = true;
/* 274 */     setRotation(this.Lear, 0.3665191F, 0.2268928F, 0.0F);
/* 275 */     this.Rear = new ModelRenderer(this, 0, 80);
/* 276 */     this.Rear.func_78789_a(-8.5F, 2.5F, -11.0F, 1, 1, 10);
/* 277 */     this.Rear.func_78793_a(0.0F, -1.0F, -12.0F);
/* 278 */     this.Rear.func_78787_b(222, 256);
/* 279 */     this.Rear.field_78809_i = true;
/* 280 */     setRotation(this.Rear, 0.3665191F, -0.2268928F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 286 */     Hammerhead e = (Hammerhead)entity;
/* 287 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 288 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 289 */     float newangle = 0.0F;
/* 290 */     float newangle2 = 0.0F;
/*     */     
/* 292 */     if (f1 > 0.1D) {
/* 293 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F * f1;
/* 294 */       newangle2 = MathHelper.func_76134_b((float)((f2 * 1.3F * this.wingspeed) + 0.7853981633974483D)) * 3.1415927F * 0.1F * f1;
/*     */     } else {
/* 296 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 299 */     this.leg_1.field_78795_f = -0.087F + newangle;
/* 300 */     this.leg_1b.field_78795_f = newangle;
/* 301 */     this.leg_1R.field_78795_f = -0.087F - newangle;
/* 302 */     this.leg_1Rb.field_78795_f = -newangle;
/*     */     
/* 304 */     this.leg_2.field_78795_f = -0.052F + newangle2;
/* 305 */     this.leg_2b.field_78795_f = newangle2;
/* 306 */     this.leg_2R.field_78795_f = -0.052F - newangle2;
/* 307 */     this.leg_2Rb.field_78795_f = -newangle2;
/*     */     
/* 309 */     this.leg_3.field_78795_f = -0.349F - newangle;
/* 310 */     this.leg_3b.field_78795_f = -newangle;
/* 311 */     this.leg_3R.field_78795_f = -0.349F + newangle;
/* 312 */     this.leg_3Rb.field_78795_f = newangle;
/*     */     
/* 314 */     this.neck.field_78796_g = (float)Math.toRadians(f3) * 0.25F;
/* 315 */     this.neck_armour.field_78796_g = this.neck.field_78796_g;
/* 316 */     this.horn_base.field_78796_g = this.neck.field_78796_g;
/* 317 */     this.horn_1.field_78796_g = this.neck.field_78796_g;
/* 318 */     this.horn_2.field_78796_g = this.neck.field_78796_g;
/* 319 */     this.horn_L.field_78796_g = this.neck.field_78796_g;
/* 320 */     this.horn_R.field_78796_g = this.neck.field_78796_g;
/* 321 */     this.head.field_78796_g = this.neck.field_78796_g;
/* 322 */     this.snout.field_78796_g = this.neck.field_78796_g;
/* 323 */     this.fan1.field_78796_g = this.neck.field_78796_g;
/* 324 */     this.neck.field_78796_g -= 0.122F;
/* 325 */     this.neck.field_78796_g -= 0.226F;
/* 326 */     this.neck.field_78796_g += 0.122F;
/* 327 */     this.neck.field_78796_g += 0.226F;
/* 328 */     this.neck.field_78796_g += 0.227F;
/* 329 */     this.neck.field_78796_g -= 0.227F;
/*     */     
/* 331 */     newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.03F;
/* 332 */     this.back_armour_4.field_78796_g = 0.349F + newangle;
/* 333 */     this.back_armour_4R.field_78796_g = -0.349F - newangle;
/*     */     
/* 335 */     if (e.getAttacking() != 0) {
/* 336 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.13F;
/*     */     } else {
/* 338 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 341 */     this.neck.field_78795_f = newangle + 0.157F;
/* 342 */     this.neck_armour.field_78795_f = newangle + 0.157F;
/* 343 */     this.horn_base.field_78795_f = newangle + 0.087F;
/* 344 */     this.horn_1.field_78795_f = newangle + 0.192F;
/* 345 */     this.horn_2.field_78795_f = newangle + 0.192F;
/* 346 */     this.horn_L.field_78795_f = newangle + 0.192F;
/* 347 */     this.horn_R.field_78795_f = newangle + 0.192F;
/* 348 */     this.head.field_78795_f = newangle + 0.209F;
/* 349 */     this.snout.field_78795_f = newangle + 0.611F;
/* 350 */     this.fan1.field_78795_f = newangle - 0.139F;
/* 351 */     this.Lfan2.field_78795_f = newangle - 0.209F;
/* 352 */     this.Lfan3.field_78795_f = newangle - 0.331F;
/* 353 */     this.Rfan2.field_78795_f = newangle - 0.209F;
/* 354 */     this.Rfan3.field_78795_f = newangle - 0.331F;
/* 355 */     this.Lear.field_78795_f = newangle + 0.366F;
/* 356 */     this.Rear.field_78795_f = newangle + 0.366F;
/*     */ 
/*     */     
/* 359 */     this.chest.func_78785_a(f5);
/* 360 */     this.abdomen.func_78785_a(f5);
/* 361 */     this.neck.func_78785_a(f5);
/* 362 */     this.head.func_78785_a(f5);
/* 363 */     this.snout.func_78785_a(f5);
/* 364 */     this.neck_armour.func_78785_a(f5);
/* 365 */     this.horn_base.func_78785_a(f5);
/* 366 */     this.horn_1.func_78785_a(f5);
/* 367 */     this.horn_2.func_78785_a(f5);
/* 368 */     this.horn_R.func_78785_a(f5);
/* 369 */     this.horn_L.func_78785_a(f5);
/* 370 */     this.back_armour1.func_78785_a(f5);
/* 371 */     this.back_armour_2.func_78785_a(f5);
/* 372 */     this.back_armour_3.func_78785_a(f5);
/* 373 */     this.back_armour_3R.func_78785_a(f5);
/* 374 */     this.back_armour_4.func_78785_a(f5);
/* 375 */     this.back_armour_4R.func_78785_a(f5);
/* 376 */     this.tail.func_78785_a(f5);
/* 377 */     this.leg_1R.func_78785_a(f5);
/* 378 */     this.leg_1.func_78785_a(f5);
/* 379 */     this.leg_2.func_78785_a(f5);
/* 380 */     this.leg_2R.func_78785_a(f5);
/* 381 */     this.leg_3R.func_78785_a(f5);
/* 382 */     this.leg_3.func_78785_a(f5);
/* 383 */     this.leg_1Rb.func_78785_a(f5);
/* 384 */     this.leg_1b.func_78785_a(f5);
/* 385 */     this.leg_2b.func_78785_a(f5);
/* 386 */     this.leg_2Rb.func_78785_a(f5);
/* 387 */     this.leg_3Rb.func_78785_a(f5);
/* 388 */     this.leg_3b.func_78785_a(f5);
/* 389 */     this.fan1.func_78785_a(f5);
/* 390 */     this.Lfan2.func_78785_a(f5);
/* 391 */     this.Rfan2.func_78785_a(f5);
/* 392 */     this.Lfan3.func_78785_a(f5);
/* 393 */     this.Rfan3.func_78785_a(f5);
/* 394 */     this.Lear.func_78785_a(f5);
/* 395 */     this.Rear.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 401 */     model.field_78795_f = x;
/* 402 */     model.field_78796_g = y;
/* 403 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 408 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelHammerhead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */