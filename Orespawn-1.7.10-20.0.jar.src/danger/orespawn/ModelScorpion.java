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
/*     */ public class ModelScorpion
/*     */   extends ModelBase
/*     */ {
/*  23 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer tail3;
/*     */   ModelRenderer tail4;
/*     */   ModelRenderer tail5;
/*     */   ModelRenderer tail6;
/*     */   ModelRenderer lleg1;
/*     */   ModelRenderer rleg1;
/*     */   ModelRenderer rleg2;
/*     */   ModelRenderer lleg3;
/*     */   ModelRenderer rleg4;
/*     */   ModelRenderer rleg3;
/*     */   ModelRenderer lleg4;
/*     */   ModelRenderer lleg2;
/*     */   ModelRenderer head;
/*     */   ModelRenderer larm2;
/*     */   ModelRenderer rarm2;
/*     */   ModelRenderer larm1;
/*     */   ModelRenderer rarm1;
/*     */   ModelRenderer lclaw;
/*     */   ModelRenderer rclaw;
/*     */   
/*     */   public ModelScorpion(float f1) {
/*  50 */     this.wingspeed = f1;
/*     */     
/*  52 */     this.field_78090_t = 88;
/*  53 */     this.field_78089_u = 24;
/*     */     
/*  55 */     this.body = new ModelRenderer(this, 0, 0);
/*  56 */     this.body.func_78789_a(0.0F, 0.0F, 0.0F, 6, 4, 8);
/*  57 */     this.body.func_78793_a(-3.0F, 17.0F, -4.0F);
/*  58 */     this.body.func_78787_b(88, 24);
/*  59 */     this.body.field_78809_i = true;
/*  60 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  61 */     this.tail1 = new ModelRenderer(this, 28, 0);
/*  62 */     this.tail1.func_78789_a(0.0F, 0.0F, 0.0F, 4, 4, 5);
/*  63 */     this.tail1.func_78793_a(-2.0F, 17.0F, 3.0F);
/*  64 */     this.tail1.func_78787_b(88, 24);
/*  65 */     this.tail1.field_78809_i = true;
/*  66 */     setRotation(this.tail1, 0.2617994F, 0.0F, 0.0F);
/*  67 */     this.tail2 = new ModelRenderer(this, 46, 0);
/*  68 */     this.tail2.func_78789_a(0.0F, 0.0F, 0.0F, 3, 3, 5);
/*  69 */     this.tail2.func_78793_a(-1.5F, 16.8F, 6.0F);
/*  70 */     this.tail2.func_78787_b(88, 24);
/*  71 */     this.tail2.field_78809_i = true;
/*  72 */     setRotation(this.tail2, 1.029744F, 0.0F, 0.0F);
/*  73 */     this.tail3 = new ModelRenderer(this, 62, 0);
/*  74 */     this.tail3.func_78789_a(0.0F, 0.0F, 0.0F, 3, 3, 4);
/*  75 */     this.tail3.func_78793_a(-1.5F, 14.5F, 8.0F);
/*  76 */     this.tail3.func_78787_b(88, 24);
/*  77 */     this.tail3.field_78809_i = true;
/*  78 */     setRotation(this.tail3, 1.727876F, 0.0F, 0.0F);
/*  79 */     this.tail4 = new ModelRenderer(this, 0, 17);
/*  80 */     this.tail4.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 5);
/*  81 */     this.tail4.func_78793_a(-1.0F, 12.0F, 9.0F);
/*  82 */     this.tail4.func_78787_b(88, 24);
/*  83 */     this.tail4.field_78809_i = true;
/*  84 */     setRotation(this.tail4, 2.513274F, 0.0F, 0.0F);
/*  85 */     this.tail5 = new ModelRenderer(this, 70, 7);
/*  86 */     this.tail5.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 4);
/*  87 */     this.tail5.func_78793_a(-1.0F, 9.0F, 6.0F);
/*  88 */     this.tail5.func_78787_b(88, 24);
/*  89 */     this.tail5.field_78809_i = true;
/*  90 */     setRotation(this.tail5, 3.141593F, 0.0F, 0.0F);
/*  91 */     this.tail6 = new ModelRenderer(this, 62, 7);
/*  92 */     this.tail6.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 3);
/*  93 */     this.tail6.func_78793_a(-0.5F, 8.0F, 2.0F);
/*  94 */     this.tail6.func_78787_b(88, 24);
/*  95 */     this.tail6.field_78809_i = true;
/*  96 */     setRotation(this.tail6, 3.141593F, 0.0F, 0.0F);
/*  97 */     this.lleg1 = new ModelRenderer(this, 0, 12);
/*  98 */     this.lleg1.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/*  99 */     this.lleg1.func_78793_a(2.0F, 18.0F, -3.0F);
/* 100 */     this.lleg1.func_78787_b(88, 24);
/* 101 */     this.lleg1.field_78809_i = true;
/* 102 */     setRotation(this.lleg1, 0.0F, 0.4886922F, 0.3665191F);
/* 103 */     this.rleg1 = new ModelRenderer(this, 0, 12);
/* 104 */     this.rleg1.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/* 105 */     this.rleg1.func_78793_a(-2.0F, 18.0F, -1.0F);
/* 106 */     this.rleg1.func_78787_b(88, 24);
/* 107 */     this.rleg1.field_78809_i = true;
/* 108 */     setRotation(this.rleg1, 0.0F, 2.6529F, -0.3665191F);
/* 109 */     this.rleg2 = new ModelRenderer(this, 0, 12);
/* 110 */     this.rleg2.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/* 111 */     this.rleg2.func_78793_a(-2.0F, 18.0F, 1.0F);
/* 112 */     this.rleg2.func_78787_b(88, 24);
/* 113 */     this.rleg2.field_78809_i = true;
/* 114 */     setRotation(this.rleg2, 0.0F, 2.897247F, -0.3665191F);
/* 115 */     this.lleg3 = new ModelRenderer(this, 0, 12);
/* 116 */     this.lleg3.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/* 117 */     this.lleg3.func_78793_a(2.0F, 18.0F, 1.0F);
/* 118 */     this.lleg3.func_78787_b(88, 24);
/* 119 */     this.lleg3.field_78809_i = true;
/* 120 */     setRotation(this.lleg3, 0.0F, -0.2443461F, 0.3665191F);
/* 121 */     this.rleg4 = new ModelRenderer(this, 0, 12);
/* 122 */     this.rleg4.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/* 123 */     this.rleg4.func_78793_a(-2.0F, 18.0F, 5.0F);
/* 124 */     this.rleg4.func_78787_b(88, 24);
/* 125 */     this.rleg4.field_78809_i = true;
/* 126 */     setRotation(this.rleg4, 0.0F, -2.6529F, -0.3665191F);
/* 127 */     this.rleg3 = new ModelRenderer(this, 0, 12);
/* 128 */     this.rleg3.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/* 129 */     this.rleg3.func_78793_a(-2.0F, 18.0F, 3.0F);
/* 130 */     this.rleg3.func_78787_b(88, 24);
/* 131 */     this.rleg3.field_78809_i = true;
/* 132 */     setRotation(this.rleg3, 0.0F, -2.897247F, -0.3665191F);
/* 133 */     this.lleg4 = new ModelRenderer(this, 0, 12);
/* 134 */     this.lleg4.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/* 135 */     this.lleg4.func_78793_a(2.0F, 18.0F, 3.0F);
/* 136 */     this.lleg4.func_78787_b(88, 24);
/* 137 */     this.lleg4.field_78809_i = true;
/* 138 */     setRotation(this.lleg4, 0.0F, -0.4886922F, 0.3665191F);
/* 139 */     this.lleg2 = new ModelRenderer(this, 0, 12);
/* 140 */     this.lleg2.func_78789_a(0.0F, 0.0F, 0.0F, 11, 2, 2);
/* 141 */     this.lleg2.func_78793_a(2.0F, 18.0F, -1.0F);
/* 142 */     this.lleg2.func_78787_b(88, 24);
/* 143 */     this.lleg2.field_78809_i = true;
/* 144 */     setRotation(this.lleg2, 0.0F, 0.2443461F, 0.3665191F);
/* 145 */     this.head = new ModelRenderer(this, 28, 9);
/* 146 */     this.head.func_78789_a(0.0F, 0.0F, 0.0F, 5, 3, 4);
/* 147 */     this.head.func_78793_a(-2.5F, 17.5F, -8.0F);
/* 148 */     this.head.func_78787_b(88, 24);
/* 149 */     this.head.field_78809_i = true;
/* 150 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 151 */     this.larm2 = new ModelRenderer(this, 46, 8);
/* 152 */     this.larm2.func_78789_a(0.0F, 0.0F, 0.0F, 6, 2, 2);
/* 153 */     this.larm2.func_78793_a(1.0F, 18.0F, -6.0F);
/* 154 */     this.larm2.func_78787_b(88, 24);
/* 155 */     this.larm2.field_78809_i = true;
/* 156 */     setRotation(this.larm2, 0.0F, 0.5235988F, 0.1745329F);
/* 157 */     this.rarm2 = new ModelRenderer(this, 46, 8);
/* 158 */     this.rarm2.func_78789_a(0.0F, 0.0F, -2.0F, 6, 2, 2);
/* 159 */     this.rarm2.func_78793_a(-1.0F, 18.0F, -6.0F);
/* 160 */     this.rarm2.func_78787_b(88, 24);
/* 161 */     this.rarm2.field_78809_i = true;
/* 162 */     setRotation(this.rarm2, 0.0F, 2.617994F, -0.1745329F);
/* 163 */     this.larm1 = new ModelRenderer(this, 70, 13);
/* 164 */     this.larm1.func_78789_a(-2.0F, 0.0F, -3.0F, 2, 2, 3);
/* 165 */     this.larm1.func_78793_a(7.0F, 19.0F, -7.2F);
/* 166 */     this.larm1.func_78787_b(88, 24);
/* 167 */     this.larm1.field_78809_i = true;
/* 168 */     setRotation(this.larm1, 0.1745329F, 0.1745329F, 0.0F);
/* 169 */     this.rarm1 = new ModelRenderer(this, 70, 13);
/* 170 */     this.rarm1.func_78789_a(0.0F, 0.0F, -3.0F, 2, 2, 3);
/* 171 */     this.rarm1.func_78793_a(-7.0F, 19.0F, -7.2F);
/* 172 */     this.rarm1.func_78787_b(88, 24);
/* 173 */     this.rarm1.field_78809_i = true;
/* 174 */     setRotation(this.rarm1, 0.1745329F, -0.1745329F, 0.0F);
/* 175 */     this.lclaw = new ModelRenderer(this, 46, 12);
/* 176 */     this.lclaw.func_78789_a(-3.0F, 0.0F, -4.0F, 3, 2, 4);
/* 177 */     this.lclaw.func_78793_a(7.0F, 19.0F, -10.0F);
/* 178 */     this.lclaw.func_78787_b(88, 24);
/* 179 */     this.lclaw.field_78809_i = true;
/* 180 */     setRotation(this.lclaw, 0.0174533F, 0.3839724F, 0.1396263F);
/* 181 */     this.rclaw = new ModelRenderer(this, 46, 12);
/* 182 */     this.rclaw.func_78789_a(0.0F, 0.0F, -4.0F, 3, 2, 4);
/* 183 */     this.rclaw.func_78793_a(-7.0F, 19.0F, -10.0F);
/* 184 */     this.rclaw.func_78787_b(88, 24);
/* 185 */     this.rclaw.field_78809_i = true;
/* 186 */     setRotation(this.rclaw, 0.0174533F, -0.3839724F, 0.1396263F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 193 */     Scorpion e = (Scorpion)entity;
/* 194 */     RenderInfo r = null;
/* 195 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 196 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 197 */     float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
/*     */ 
/*     */     
/* 200 */     float pi4 = 1.570795F;
/*     */ 
/*     */     
/* 203 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/* 204 */     this.lleg1.field_78796_g = newangle + 0.49F;
/* 205 */     this.rleg1.field_78796_g = -newangle + 2.65F;
/*     */     
/* 207 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed - 1.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 208 */     this.lleg2.field_78796_g = newangle + 0.24F;
/* 209 */     this.rleg2.field_78796_g = -newangle + 2.9F;
/*     */     
/* 211 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 212 */     this.lleg3.field_78796_g = newangle - 0.24F;
/* 213 */     this.rleg3.field_78796_g = -newangle - 2.9F;
/*     */     
/* 215 */     newangle = MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.12F * f1;
/* 216 */     this.lleg4.field_78796_g = newangle - 0.49F;
/* 217 */     this.rleg4.field_78796_g = -newangle - 2.65F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     r = e.getRenderInfo();
/*     */ 
/*     */     
/* 225 */     newangle = MathHelper.func_76134_b(f2 * 3.0F * this.wingspeed) * 3.1415927F * 0.15F;
/* 226 */     nextangle = MathHelper.func_76134_b((f2 + 0.1F) * 3.0F * this.wingspeed) * 3.1415927F * 0.15F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     if (nextangle > 0.0F && newangle < 0.0F) {
/*     */       
/* 233 */       r.ri1 = 0;
/* 234 */       if (e.getAttacking() == 0) {
/* 235 */         r.ri1 = e.field_70170_p.field_73012_v.nextInt(20);
/* 236 */         r.ri2 = e.field_70170_p.field_73012_v.nextInt(25);
/*     */       } else {
/* 238 */         r.ri1 = e.field_70170_p.field_73012_v.nextInt(4);
/* 239 */         r.ri2 = e.field_70170_p.field_73012_v.nextInt(3);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 244 */     if (r.ri1 == 1 || r.ri1 == 3) {
/* 245 */       doLeftClaw(newangle);
/*     */     } else {
/* 247 */       doLeftClaw(0.0F);
/*     */     } 
/* 249 */     if (r.ri1 == 2 || r.ri1 == 3) {
/* 250 */       doRightClaw(newangle);
/*     */     } else {
/* 252 */       doRightClaw(0.0F);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 258 */     if (r.ri2 == 1) {
/* 259 */       doTail(newangle);
/*     */     } else {
/* 261 */       doTail(0.0F);
/*     */     } 
/*     */ 
/*     */     
/* 265 */     e.setRenderInfo(r);
/*     */     
/* 267 */     this.body.func_78785_a(f5);
/* 268 */     this.tail1.func_78785_a(f5);
/* 269 */     this.tail2.func_78785_a(f5);
/* 270 */     this.tail3.func_78785_a(f5);
/* 271 */     this.tail4.func_78785_a(f5);
/* 272 */     this.tail5.func_78785_a(f5);
/* 273 */     this.tail6.func_78785_a(f5);
/* 274 */     this.lleg1.func_78785_a(f5);
/* 275 */     this.rleg1.func_78785_a(f5);
/* 276 */     this.rleg2.func_78785_a(f5);
/* 277 */     this.lleg3.func_78785_a(f5);
/* 278 */     this.rleg4.func_78785_a(f5);
/* 279 */     this.rleg3.func_78785_a(f5);
/* 280 */     this.lleg4.func_78785_a(f5);
/* 281 */     this.lleg2.func_78785_a(f5);
/* 282 */     this.head.func_78785_a(f5);
/* 283 */     this.larm2.func_78785_a(f5);
/* 284 */     this.rarm2.func_78785_a(f5);
/* 285 */     this.larm1.func_78785_a(f5);
/* 286 */     this.rarm1.func_78785_a(f5);
/* 287 */     this.lclaw.func_78785_a(f5);
/* 288 */     this.rclaw.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 294 */     model.field_78795_f = x;
/* 295 */     model.field_78796_g = y;
/* 296 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 302 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void doLeftClaw(float angle) {
/* 308 */     this.larm2.field_78796_g = 0.52F + angle;
/* 309 */     this.larm1.field_78798_e = (float)(this.larm2.field_78798_e - Math.sin(this.larm2.field_78796_g) * 4.5D);
/* 310 */     this.larm1.field_78798_e -= 3.0F;
/* 311 */     this.lclaw.field_78796_g = 0.381F - angle;
/*     */   }
/*     */ 
/*     */   
/*     */   private void doRightClaw(float angle) {
/* 316 */     this.rarm2.field_78796_g = 2.61F - angle;
/* 317 */     this.rarm1.field_78798_e = (float)(this.rarm2.field_78798_e - Math.sin(this.rarm2.field_78796_g) * 4.5D);
/* 318 */     this.rarm1.field_78798_e -= 3.0F;
/* 319 */     this.rclaw.field_78796_g = -0.381F + angle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void doTail(float angle) {
/* 326 */     this.tail1.field_78795_f = 0.26F + angle;
/*     */ 
/*     */     
/* 329 */     this.tail2.field_78795_f = this.tail1.field_78795_f + 0.76900005F + angle;
/* 330 */     this.tail2.field_78797_d = (float)(this.tail1.field_78797_d - Math.sin(this.tail1.field_78795_f) * 4.0D);
/* 331 */     this.tail2.field_78798_e = (float)(this.tail1.field_78798_e + Math.cos(this.tail1.field_78795_f) * 4.0D);
/*     */     
/* 333 */     this.tail3.field_78795_f = this.tail2.field_78795_f + 0.701F + angle;
/* 334 */     this.tail3.field_78797_d = (float)(this.tail2.field_78797_d - Math.sin(this.tail2.field_78795_f) * 4.0D);
/* 335 */     this.tail3.field_78798_e = (float)(this.tail2.field_78798_e + Math.cos(this.tail2.field_78795_f) * 4.0D);
/*     */     
/* 337 */     this.tail4.field_78795_f = this.tail3.field_78795_f + -5.501F - angle * 3.0F / 2.0F - 0.4F;
/* 338 */     this.tail4.field_78797_d = (float)(this.tail3.field_78797_d - Math.sin(this.tail3.field_78795_f) * 3.0D);
/* 339 */     this.tail4.field_78798_e = (float)(this.tail3.field_78798_e + Math.cos(this.tail3.field_78795_f) * 3.0D);
/*     */     
/* 341 */     this.tail5.field_78797_d = (float)(this.tail4.field_78797_d - Math.sin(this.tail4.field_78795_f) * 4.0D);
/* 342 */     this.tail5.field_78798_e = (float)(this.tail4.field_78798_e + Math.cos(this.tail4.field_78795_f) * 4.0D);
/*     */     
/* 344 */     this.tail6.field_78797_d = (float)(this.tail5.field_78797_d - Math.sin(this.tail5.field_78795_f) * 4.0D);
/* 345 */     this.tail6.field_78798_e = (float)(this.tail5.field_78798_e + Math.cos(this.tail5.field_78795_f) * 4.0D);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelScorpion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */