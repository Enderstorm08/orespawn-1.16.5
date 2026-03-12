/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelBee
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Sting;
/*     */   
/*     */   ModelRenderer Abdomnem1;
/*     */   ModelRenderer Abdomnem2;
/*     */   ModelRenderer Abdomnem3;
/*     */   ModelRenderer Abdomnem4;
/*     */   ModelRenderer Abdomnem5;
/*     */   ModelRenderer MainBody;
/*     */   ModelRenderer Neck;
/*     */   ModelRenderer Head;
/*     */   ModelRenderer WingRight;
/*     */   ModelRenderer WingLeft;
/*     */   ModelRenderer RA1;
/*     */   ModelRenderer LA1;
/*     */   ModelRenderer LA2;
/*     */   ModelRenderer RA2;
/*     */   ModelRenderer RA3;
/*     */   ModelRenderer LA3;
/*     */   ModelRenderer LeftPom;
/*     */   ModelRenderer RightPom;
/*     */   ModelRenderer LeftPincerExtra;
/*     */   ModelRenderer LeftPincerMain;
/*     */   ModelRenderer RightPincerMain;
/*     */   ModelRenderer RightPincerExtra;
/*     */   
/*     */   public ModelBee(float f1) {
/*  39 */     this.wingspeed = f1;
/*     */     
/*  41 */     this.field_78090_t = 256;
/*  42 */     this.field_78089_u = 256;
/*     */ 
/*     */     
/*  45 */     this.Sting = new ModelRenderer(this, 68, 0);
/*  46 */     this.Sting.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 10, 2);
/*  47 */     this.Sting.func_78793_a(0.0F, 16.0F, 1.0F);
/*  48 */     this.Sting.func_78787_b(256, 256);
/*  49 */     this.Sting.field_78809_i = true;
/*  50 */     setRotation(this.Sting, -0.7853982F, 0.0F, 0.0F);
/*  51 */     this.Abdomnem1 = new ModelRenderer(this, 64, 12);
/*  52 */     this.Abdomnem1.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 8, 4);
/*  53 */     this.Abdomnem1.func_78793_a(0.0F, 9.0F, 2.0F);
/*  54 */     this.Abdomnem1.func_78787_b(256, 256);
/*  55 */     this.Abdomnem1.field_78809_i = true;
/*  56 */     setRotation(this.Abdomnem1, -0.5235988F, 0.0F, 0.0F);
/*  57 */     this.Abdomnem2 = new ModelRenderer(this, 60, 24);
/*  58 */     this.Abdomnem2.func_78789_a(-3.0F, 0.0F, 0.0F, 6, 6, 6);
/*  59 */     this.Abdomnem2.func_78793_a(0.0F, 5.0F, 0.0F);
/*  60 */     this.Abdomnem2.func_78787_b(256, 256);
/*  61 */     this.Abdomnem2.field_78809_i = true;
/*  62 */     setRotation(this.Abdomnem2, 0.0F, 0.0F, 0.0F);
/*  63 */     this.Abdomnem3 = new ModelRenderer(this, 56, 36);
/*  64 */     this.Abdomnem3.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 7, 8);
/*  65 */     this.Abdomnem3.func_78793_a(0.0F, 1.0F, -2.0F);
/*  66 */     this.Abdomnem3.func_78787_b(256, 256);
/*  67 */     this.Abdomnem3.field_78809_i = true;
/*  68 */     setRotation(this.Abdomnem3, 0.2617994F, 0.0F, 0.0F);
/*  69 */     this.Abdomnem4 = new ModelRenderer(this, 53, 51);
/*  70 */     this.Abdomnem4.func_78789_a(-5.0F, 0.0F, 0.0F, 10, 12, 10);
/*  71 */     this.Abdomnem4.func_78793_a(0.0F, -6.0F, -8.0F);
/*  72 */     this.Abdomnem4.func_78787_b(256, 256);
/*  73 */     this.Abdomnem4.field_78809_i = true;
/*  74 */     setRotation(this.Abdomnem4, 0.5934119F, 0.0F, 0.0F);
/*  75 */     this.Abdomnem5 = new ModelRenderer(this, 48, 73);
/*  76 */     this.Abdomnem5.func_78789_a(-6.0F, 0.0F, 0.0F, 12, 12, 12);
/*  77 */     this.Abdomnem5.func_78793_a(0.0F, -6.0F, -15.0F);
/*  78 */     this.Abdomnem5.func_78787_b(256, 256);
/*  79 */     this.Abdomnem5.field_78809_i = true;
/*  80 */     setRotation(this.Abdomnem5, 1.099557F, 0.0F, 0.0F);
/*  81 */     this.MainBody = new ModelRenderer(this, 48, 97);
/*  82 */     this.MainBody.func_78789_a(-6.0F, 0.0F, -6.0F, 12, 14, 12);
/*  83 */     this.MainBody.func_78793_a(0.0F, -12.0F, -24.0F);
/*  84 */     this.MainBody.func_78787_b(256, 256);
/*  85 */     this.MainBody.field_78809_i = true;
/*  86 */     setRotation(this.MainBody, 1.48353F, 0.0F, 0.0F);
/*  87 */     this.Neck = new ModelRenderer(this, 55, 123);
/*  88 */     this.Neck.func_78789_a(-4.0F, -4.0F, -8.0F, 8, 8, 8);
/*  89 */     this.Neck.func_78793_a(0.0F, -12.0F, -23.0F);
/*  90 */     this.Neck.func_78787_b(256, 256);
/*  91 */     this.Neck.field_78809_i = true;
/*  92 */     setRotation(this.Neck, 0.0F, 0.0F, 0.0F);
/*  93 */     this.Head = new ModelRenderer(this, 51, 139);
/*  94 */     this.Head.func_78789_a(-5.0F, -5.0F, -10.0F, 10, 10, 10);
/*  95 */     this.Head.func_78793_a(0.0F, -13.0F, -28.0F);
/*  96 */     this.Head.func_78787_b(256, 256);
/*  97 */     this.Head.field_78809_i = true;
/*  98 */     setRotation(this.Head, 0.2617994F, 0.0F, 0.0F);
/*  99 */     this.WingRight = new ModelRenderer(this, 0, 91);
/* 100 */     this.WingRight.func_78789_a(0.0F, 0.0F, 0.0F, 0, 8, 24);
/* 101 */     this.WingRight.func_78793_a(-4.0F, -14.0F, -15.0F);
/* 102 */     this.WingRight.func_78787_b(256, 256);
/* 103 */     this.WingRight.field_78809_i = true;
/* 104 */     setRotation(this.WingRight, -0.7853982F, -0.5235988F, 2.617994F);
/* 105 */     this.WingLeft = new ModelRenderer(this, 96, 91);
/* 106 */     this.WingLeft.func_78789_a(0.0F, 0.0F, 0.0F, 0, 8, 24);
/* 107 */     this.WingLeft.func_78793_a(3.0F, -14.0F, -15.0F);
/* 108 */     this.WingLeft.func_78787_b(256, 256);
/* 109 */     this.WingLeft.field_78809_i = true;
/* 110 */     setRotation(this.WingLeft, -0.7853982F, 0.5235988F, -2.617994F);
/* 111 */     this.RA1 = new ModelRenderer(this, 47, 152);
/* 112 */     this.RA1.func_78789_a(0.0F, -6.0F, -1.0F, 1, 6, 1);
/* 113 */     this.RA1.func_78793_a(-3.0F, -17.0F, -31.0F);
/* 114 */     this.RA1.func_78787_b(256, 256);
/* 115 */     this.RA1.field_78809_i = true;
/* 116 */     setRotation(this.RA1, 0.2617994F, 0.5235988F, 0.0F);
/* 117 */     this.LA1 = new ModelRenderer(this, 91, 152);
/* 118 */     this.LA1.func_78789_a(0.0F, -6.0F, -1.0F, 1, 6, 1);
/* 119 */     this.LA1.func_78793_a(2.0F, -17.0F, -32.0F);
/* 120 */     this.LA1.func_78787_b(256, 256);
/* 121 */     this.LA1.field_78809_i = true;
/* 122 */     setRotation(this.LA1, 0.2617994F, -0.5235988F, 0.0F);
/* 123 */     this.LA2 = new ModelRenderer(this, 91, 145);
/* 124 */     this.LA2.func_78789_a(0.0F, -11.0F, 0.0F, 1, 6, 1);
/* 125 */     this.LA2.func_78793_a(2.0F, -17.0F, -32.0F);
/* 126 */     this.LA2.func_78787_b(256, 256);
/* 127 */     this.LA2.field_78809_i = true;
/* 128 */     setRotation(this.LA2, 0.4363323F, -0.6108652F, 0.0F);
/* 129 */     this.RA2 = new ModelRenderer(this, 47, 145);
/* 130 */     this.RA2.func_78789_a(0.0F, -11.0F, 0.0F, 1, 6, 1);
/* 131 */     this.RA2.func_78793_a(-3.0F, -17.0F, -31.0F);
/* 132 */     this.RA2.func_78787_b(256, 256);
/* 133 */     this.RA2.field_78809_i = true;
/* 134 */     setRotation(this.RA2, 0.4363323F, 0.6108652F, 0.0F);
/* 135 */     this.RA3 = new ModelRenderer(this, 47, 138);
/* 136 */     this.RA3.func_78789_a(0.0F, -16.0F, 2.0F, 1, 6, 1);
/* 137 */     this.RA3.func_78793_a(-3.0F, -17.0F, -31.0F);
/* 138 */     this.RA3.func_78787_b(256, 256);
/* 139 */     this.RA3.field_78809_i = true;
/* 140 */     setRotation(this.RA3, 0.6108652F, 0.6981317F, 0.0F);
/* 141 */     this.LA3 = new ModelRenderer(this, 91, 138);
/* 142 */     this.LA3.func_78789_a(0.0F, -16.0F, 2.0F, 1, 6, 1);
/* 143 */     this.LA3.func_78793_a(2.0F, -17.0F, -32.0F);
/* 144 */     this.LA3.func_78787_b(256, 256);
/* 145 */     this.LA3.field_78809_i = true;
/* 146 */     setRotation(this.LA3, 0.6108652F, -0.6981317F, 0.0F);
/* 147 */     this.LeftPom = new ModelRenderer(this, 89, 134);
/* 148 */     this.LeftPom.func_78789_a(4.0F, -16.0F, -6.0F, 2, 2, 2);
/* 149 */     this.LeftPom.func_78793_a(2.0F, -17.0F, -32.0F);
/* 150 */     this.LeftPom.func_78787_b(256, 256);
/* 151 */     this.LeftPom.field_78809_i = true;
/* 152 */     setRotation(this.LeftPom, 0.0F, 0.0F, 0.0F);
/* 153 */     this.RightPom = new ModelRenderer(this, 45, 134);
/* 154 */     this.RightPom.func_78789_a(-5.0F, -16.0F, -7.0F, 2, 2, 2);
/* 155 */     this.RightPom.func_78793_a(-3.0F, -17.0F, -31.0F);
/* 156 */     this.RightPom.func_78787_b(256, 256);
/* 157 */     this.RightPom.field_78809_i = true;
/* 158 */     setRotation(this.RightPom, 0.0F, 0.0F, 0.0F);
/* 159 */     this.LeftPincerExtra = new ModelRenderer(this, 71, 166);
/* 160 */     this.LeftPincerExtra.func_78789_a(-2.0F, 0.0F, -6.0F, 2, 1, 2);
/* 161 */     this.LeftPincerExtra.func_78793_a(2.0F, -8.0F, -36.0F);
/* 162 */     this.LeftPincerExtra.func_78787_b(256, 256);
/* 163 */     this.LeftPincerExtra.field_78809_i = true;
/* 164 */     setRotation(this.LeftPincerExtra, 0.1745329F, -0.1745329F, 0.0F);
/* 165 */     this.LeftPincerMain = new ModelRenderer(this, 71, 159);
/* 166 */     this.LeftPincerMain.func_78789_a(0.0F, 0.0F, -6.0F, 2, 1, 6);
/* 167 */     this.LeftPincerMain.func_78793_a(2.0F, -8.0F, -36.0F);
/* 168 */     this.LeftPincerMain.func_78787_b(256, 256);
/* 169 */     this.LeftPincerMain.field_78809_i = true;
/* 170 */     setRotation(this.LeftPincerMain, 0.1745329F, -0.1745329F, 0.0F);
/* 171 */     this.RightPincerMain = new ModelRenderer(this, 55, 159);
/* 172 */     this.RightPincerMain.func_78789_a(0.0F, 0.0F, -6.0F, 2, 1, 6);
/* 173 */     this.RightPincerMain.func_78793_a(-4.0F, -8.0F, -36.0F);
/* 174 */     this.RightPincerMain.func_78787_b(256, 256);
/* 175 */     this.RightPincerMain.field_78809_i = true;
/* 176 */     setRotation(this.RightPincerMain, 0.1745329F, 0.1745329F, 0.0F);
/* 177 */     this.RightPincerExtra = new ModelRenderer(this, 63, 166);
/* 178 */     this.RightPincerExtra.func_78789_a(2.0F, 0.0F, -6.0F, 2, 1, 2);
/* 179 */     this.RightPincerExtra.func_78793_a(-4.0F, -8.0F, -36.0F);
/* 180 */     this.RightPincerExtra.func_78787_b(256, 256);
/* 181 */     this.RightPincerExtra.field_78809_i = true;
/* 182 */     setRotation(this.RightPincerExtra, 0.1745329F, 0.1745329F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 187 */     float newangle = 0.0F;
/* 188 */     Bee b = (Bee)entity;
/*     */     
/* 190 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 191 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */     
/* 195 */     newangle = MathHelper.func_76134_b(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.3F;
/* 196 */     this.WingLeft.field_78808_h = -1.745F - newangle;
/* 197 */     this.WingRight.field_78808_h = 1.754F + newangle;
/*     */ 
/*     */     
/* 200 */     newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.1F;
/* 201 */     this.LeftPincerMain.field_78796_g = -0.274F + newangle;
/* 202 */     this.LeftPincerExtra.field_78796_g = -0.274F + newangle;
/* 203 */     this.RightPincerMain.field_78796_g = 0.274F - newangle;
/* 204 */     this.RightPincerExtra.field_78796_g = 0.274F - newangle;
/*     */ 
/*     */     
/* 207 */     newangle = MathHelper.func_76134_b(f2 * 0.21F * this.wingspeed) * 3.1415927F * 0.06F;
/* 208 */     this.LA1.field_78795_f = 0.261F + newangle;
/* 209 */     this.LA2.field_78795_f = 0.436F + newangle;
/* 210 */     this.LA3.field_78795_f = 0.611F + newangle;
/* 211 */     this.LeftPom.field_78795_f = newangle;
/* 212 */     newangle = MathHelper.func_76134_b(f2 * 0.27F * this.wingspeed) * 3.1415927F * 0.06F;
/* 213 */     this.RA1.field_78795_f = 0.261F + newangle;
/* 214 */     this.RA2.field_78795_f = 0.436F + newangle;
/* 215 */     this.RA3.field_78795_f = 0.611F + newangle;
/* 216 */     this.RightPom.field_78795_f = newangle;
/*     */     
/* 218 */     newangle = MathHelper.func_76134_b(f2 * 0.31F * this.wingspeed) * 3.1415927F * 0.06F;
/* 219 */     this.LA1.field_78808_h = newangle;
/* 220 */     this.LA2.field_78808_h = newangle;
/* 221 */     this.LA3.field_78808_h = newangle;
/* 222 */     this.LeftPom.field_78808_h = newangle;
/* 223 */     newangle = MathHelper.func_76134_b(f2 * 0.37F * this.wingspeed) * 3.1415927F * 0.06F;
/* 224 */     this.RA1.field_78808_h = newangle;
/* 225 */     this.RA2.field_78808_h = newangle;
/* 226 */     this.RA3.field_78808_h = newangle;
/* 227 */     this.RightPom.field_78808_h = newangle;
/*     */ 
/*     */ 
/*     */     
/* 231 */     if (b.getAttacking() == 0) {
/* 232 */       newangle = MathHelper.func_76134_b(f2 * 0.021F * this.wingspeed) * 3.1415927F * 0.023F;
/*     */     } else {
/* 234 */       newangle = MathHelper.func_76134_b(f2 * 0.11F * this.wingspeed) * 3.1415927F * 0.055F;
/*     */     } 
/*     */     
/* 237 */     this.Abdomnem5.field_78795_f = 1.099F + newangle;
/*     */ 
/*     */     
/* 240 */     this.Abdomnem4.field_78795_f = this.Abdomnem5.field_78795_f + newangle - 0.35F;
/* 241 */     this.Abdomnem4.field_78797_d = (float)(this.Abdomnem5.field_78797_d + Math.cos(this.Abdomnem5.field_78795_f) * 10.0D);
/* 242 */     this.Abdomnem4.field_78798_e = (float)(this.Abdomnem5.field_78798_e + Math.sin(this.Abdomnem5.field_78795_f) * 10.0D);
/*     */     
/* 244 */     this.Abdomnem3.field_78795_f = this.Abdomnem4.field_78795_f + newangle - 0.35F;
/* 245 */     this.Abdomnem3.field_78797_d = (float)(this.Abdomnem4.field_78797_d + Math.cos(this.Abdomnem4.field_78795_f) * 10.0D);
/* 246 */     this.Abdomnem3.field_78798_e = (float)(this.Abdomnem4.field_78798_e + Math.sin(this.Abdomnem4.field_78795_f) * 10.0D);
/*     */     
/* 248 */     this.Abdomnem2.field_78795_f = this.Abdomnem3.field_78795_f + newangle - 0.35F;
/* 249 */     this.Abdomnem2.field_78797_d = (float)(this.Abdomnem3.field_78797_d + Math.cos(this.Abdomnem3.field_78795_f) * 6.0D);
/* 250 */     this.Abdomnem2.field_78798_e = (float)(this.Abdomnem3.field_78798_e + Math.sin(this.Abdomnem3.field_78795_f) * 6.0D);
/*     */     
/* 252 */     this.Abdomnem1.field_78795_f = this.Abdomnem2.field_78795_f + newangle - 0.35F;
/* 253 */     this.Abdomnem1.field_78797_d = (float)(this.Abdomnem2.field_78797_d + Math.cos(this.Abdomnem2.field_78795_f) * 5.0D);
/* 254 */     this.Abdomnem1.field_78798_e = (float)(this.Abdomnem2.field_78798_e + Math.sin(this.Abdomnem2.field_78795_f) * 5.0D);
/*     */     
/* 256 */     this.Sting.field_78795_f = this.Abdomnem1.field_78795_f + newangle - 0.35F;
/* 257 */     this.Sting.field_78797_d = (float)(this.Abdomnem1.field_78797_d + Math.cos(this.Abdomnem1.field_78795_f) * 7.0D);
/* 258 */     this.Sting.field_78798_e = 1.0F + (float)(this.Abdomnem1.field_78798_e + Math.sin(this.Abdomnem1.field_78795_f) * 7.0D);
/*     */ 
/*     */ 
/*     */     
/* 262 */     this.Sting.func_78785_a(f5);
/* 263 */     this.Abdomnem1.func_78785_a(f5);
/* 264 */     this.Abdomnem2.func_78785_a(f5);
/* 265 */     this.Abdomnem3.func_78785_a(f5);
/* 266 */     this.Abdomnem4.func_78785_a(f5);
/* 267 */     this.Abdomnem5.func_78785_a(f5);
/* 268 */     this.MainBody.func_78785_a(f5);
/* 269 */     this.Neck.func_78785_a(f5);
/* 270 */     this.Head.func_78785_a(f5);
/* 271 */     this.WingRight.func_78785_a(f5);
/* 272 */     this.WingLeft.func_78785_a(f5);
/* 273 */     this.RA1.func_78785_a(f5);
/* 274 */     this.LA1.func_78785_a(f5);
/* 275 */     this.LA2.func_78785_a(f5);
/* 276 */     this.RA2.func_78785_a(f5);
/* 277 */     this.RA3.func_78785_a(f5);
/* 278 */     this.LA3.func_78785_a(f5);
/* 279 */     this.LeftPom.func_78785_a(f5);
/* 280 */     this.RightPom.func_78785_a(f5);
/* 281 */     this.LeftPincerExtra.func_78785_a(f5);
/* 282 */     this.LeftPincerMain.func_78785_a(f5);
/* 283 */     this.RightPincerMain.func_78785_a(f5);
/* 284 */     this.RightPincerExtra.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 291 */     model.field_78795_f = x;
/* 292 */     model.field_78796_g = y;
/* 293 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 298 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelBee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */