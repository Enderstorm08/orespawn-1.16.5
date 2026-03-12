/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelRobot1
/*     */   extends ModelBase
/*     */ {
/*  12 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Shape1;
/*     */   
/*     */   ModelRenderer Shape2;
/*     */   
/*     */   ModelRenderer Shape2a;
/*     */   ModelRenderer Shape3;
/*     */   ModelRenderer Shape4;
/*     */   ModelRenderer Shape5;
/*     */   ModelRenderer Shape6;
/*     */   ModelRenderer Shape7;
/*     */   ModelRenderer Shape8;
/*     */   ModelRenderer Shape9;
/*     */   ModelRenderer Shape10;
/*     */   ModelRenderer Shape11;
/*     */   ModelRenderer Shape12;
/*     */   ModelRenderer Shape13;
/*     */   ModelRenderer Shape14;
/*     */   ModelRenderer Shape15;
/*     */   ModelRenderer Shape15a;
/*     */   ModelRenderer Shape16;
/*     */   ModelRenderer Shape17;
/*     */   ModelRenderer Shape18;
/*     */   ModelRenderer rfoot;
/*     */   ModelRenderer lfoot;
/*     */   ModelRenderer key2;
/*     */   ModelRenderer key1;
/*     */   ModelRenderer key3;
/*     */   ModelRenderer key4;
/*     */   ModelRenderer key5;
/*     */   
/*     */   public ModelRobot1(float f1) {
/*  45 */     this.wingspeed = f1;
/*     */     
/*  47 */     this.field_78090_t = 64;
/*  48 */     this.field_78089_u = 32;
/*     */     
/*  50 */     this.Shape1 = new ModelRenderer(this, 0, 0);
/*  51 */     this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 3, 9, 3);
/*  52 */     this.Shape1.func_78793_a(-1.0F, 13.0F, -1.0F);
/*  53 */     this.Shape1.func_78787_b(64, 32);
/*  54 */     this.Shape1.field_78809_i = true;
/*  55 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/*  56 */     this.Shape2 = new ModelRenderer(this, 0, 0);
/*  57 */     this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 9, 5);
/*  58 */     this.Shape2.func_78793_a(0.0F, 13.0F, -2.0F);
/*  59 */     this.Shape2.func_78787_b(64, 32);
/*  60 */     this.Shape2.field_78809_i = true;
/*  61 */     setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/*  62 */     this.Shape2a = new ModelRenderer(this, 0, 0);
/*  63 */     this.Shape2a.func_78789_a(0.0F, 0.0F, 0.0F, 5, 9, 1);
/*  64 */     this.Shape2a.func_78793_a(-2.0F, 13.0F, 0.0F);
/*  65 */     this.Shape2a.func_78787_b(64, 32);
/*  66 */     this.Shape2a.field_78809_i = true;
/*  67 */     setRotation(this.Shape2a, 0.0F, 0.0F, 0.0F);
/*  68 */     this.Shape3 = new ModelRenderer(this, 0, 0);
/*  69 */     this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 7, 7, 3);
/*  70 */     this.Shape3.func_78793_a(-3.0F, 14.0F, -1.0F);
/*  71 */     this.Shape3.func_78787_b(64, 32);
/*  72 */     this.Shape3.field_78809_i = true;
/*  73 */     setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
/*  74 */     this.Shape4 = new ModelRenderer(this, 0, 0);
/*  75 */     this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 3, 7, 7);
/*  76 */     this.Shape4.func_78793_a(-1.0F, 14.0F, -3.0F);
/*  77 */     this.Shape4.func_78787_b(64, 32);
/*  78 */     this.Shape4.field_78809_i = true;
/*  79 */     setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
/*  80 */     this.Shape5 = new ModelRenderer(this, 0, 0);
/*  81 */     this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 5, 7, 5);
/*  82 */     this.Shape5.func_78793_a(-2.0F, 14.0F, -2.0F);
/*  83 */     this.Shape5.func_78787_b(64, 32);
/*  84 */     this.Shape5.field_78809_i = true;
/*  85 */     setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
/*  86 */     this.Shape6 = new ModelRenderer(this, 0, 0);
/*  87 */     this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 5, 5, 7);
/*  88 */     this.Shape6.func_78793_a(-2.0F, 15.0F, -3.0F);
/*  89 */     this.Shape6.func_78787_b(64, 32);
/*  90 */     this.Shape6.field_78809_i = true;
/*  91 */     setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
/*  92 */     this.Shape7 = new ModelRenderer(this, 0, 0);
/*  93 */     this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 1, 5, 1);
/*  94 */     this.Shape7.func_78793_a(0.0F, 15.0F, 4.0F);
/*  95 */     this.Shape7.func_78787_b(64, 32);
/*  96 */     this.Shape7.field_78809_i = true;
/*  97 */     setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
/*  98 */     this.Shape8 = new ModelRenderer(this, 0, 0);
/*  99 */     this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 7, 5, 5);
/* 100 */     this.Shape8.func_78793_a(-3.0F, 15.0F, -2.0F);
/* 101 */     this.Shape8.func_78787_b(64, 32);
/* 102 */     this.Shape8.field_78809_i = true;
/* 103 */     setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
/* 104 */     this.Shape9 = new ModelRenderer(this, 0, 0);
/* 105 */     this.Shape9.func_78789_a(0.0F, 0.0F, 0.0F, 9, 5, 1);
/* 106 */     this.Shape9.func_78793_a(-4.0F, 15.0F, 0.0F);
/* 107 */     this.Shape9.func_78787_b(64, 32);
/* 108 */     this.Shape9.field_78809_i = true;
/* 109 */     setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
/* 110 */     this.Shape10 = new ModelRenderer(this, 0, 0);
/* 111 */     this.Shape10.func_78789_a(0.0F, 0.0F, 1.0F, 3, 3, 8);
/* 112 */     this.Shape10.func_78793_a(-1.0F, 16.0F, -4.0F);
/* 113 */     this.Shape10.func_78787_b(64, 32);
/* 114 */     this.Shape10.field_78809_i = true;
/* 115 */     setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
/* 116 */     this.Shape11 = new ModelRenderer(this, 0, 0);
/* 117 */     this.Shape11.func_78789_a(0.0F, 0.0F, 0.0F, 9, 3, 3);
/* 118 */     this.Shape11.func_78793_a(-4.0F, 16.0F, -1.0F);
/* 119 */     this.Shape11.func_78787_b(64, 32);
/* 120 */     this.Shape11.field_78809_i = true;
/* 121 */     setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
/* 122 */     this.Shape12 = new ModelRenderer(this, 0, 0);
/* 123 */     this.Shape12.func_78789_a(0.0F, 0.0F, 0.0F, 7, 3, 7);
/* 124 */     this.Shape12.func_78793_a(-3.0F, 16.0F, -3.0F);
/* 125 */     this.Shape12.func_78787_b(64, 32);
/* 126 */     this.Shape12.field_78809_i = true;
/* 127 */     setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
/* 128 */     this.Shape13 = new ModelRenderer(this, 0, 0);
/* 129 */     this.Shape13.func_78789_a(0.0F, 0.0F, 0.0F, 9, 1, 5);
/* 130 */     this.Shape13.func_78793_a(-4.0F, 17.0F, -2.0F);
/* 131 */     this.Shape13.func_78787_b(64, 32);
/* 132 */     this.Shape13.field_78809_i = true;
/* 133 */     setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
/* 134 */     this.Shape14 = new ModelRenderer(this, 0, 0);
/* 135 */     this.Shape14.func_78789_a(0.0F, 0.0F, 0.0F, 5, 1, 1);
/* 136 */     this.Shape14.func_78793_a(-2.0F, 17.0F, 4.0F);
/* 137 */     this.Shape14.func_78787_b(64, 32);
/* 138 */     this.Shape14.field_78809_i = true;
/* 139 */     setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
/* 140 */     this.Shape15 = new ModelRenderer(this, 32, 0);
/* 141 */     this.Shape15.func_78789_a(0.0F, 0.0F, 0.0F, 2, 3, 1);
/* 142 */     this.Shape15.func_78793_a(-2.0F, 15.0F, -4.0F);
/* 143 */     this.Shape15.func_78787_b(64, 32);
/* 144 */     this.Shape15.field_78809_i = true;
/* 145 */     setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
/* 146 */     this.Shape15a = new ModelRenderer(this, 32, 0);
/* 147 */     this.Shape15a.func_78789_a(0.0F, 0.0F, 0.0F, 2, 3, 1);
/* 148 */     this.Shape15a.func_78793_a(1.0F, 15.0F, -4.0F);
/* 149 */     this.Shape15a.func_78787_b(64, 32);
/* 150 */     this.Shape15a.field_78809_i = true;
/* 151 */     setRotation(this.Shape15a, 0.0F, 0.0F, 0.0F);
/* 152 */     this.Shape16 = new ModelRenderer(this, 45, 0);
/* 153 */     this.Shape16.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 3);
/* 154 */     this.Shape16.func_78793_a(-1.0F, 12.0F, -1.0F);
/* 155 */     this.Shape16.func_78787_b(64, 32);
/* 156 */     this.Shape16.field_78809_i = true;
/* 157 */     setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
/* 158 */     this.Shape17 = new ModelRenderer(this, 33, 7);
/* 159 */     this.Shape17.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/* 160 */     this.Shape17.func_78793_a(0.0F, 10.0F, 0.0F);
/* 161 */     this.Shape17.func_78787_b(64, 32);
/* 162 */     this.Shape17.field_78809_i = true;
/* 163 */     setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
/* 164 */     this.Shape18 = new ModelRenderer(this, 33, 7);
/* 165 */     this.Shape18.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/* 166 */     this.Shape18.func_78793_a(1.7F, 8.733334F, 0.0F);
/* 167 */     this.Shape18.func_78787_b(64, 32);
/* 168 */     this.Shape18.field_78809_i = true;
/* 169 */     setRotation(this.Shape18, 0.0F, 0.0F, 0.9667472F);
/* 170 */     this.rfoot = new ModelRenderer(this, 46, 8);
/* 171 */     this.rfoot.func_78789_a(0.0F, 3.0F, -2.0F, 2, 2, 4);
/* 172 */     this.rfoot.func_78793_a(-3.0F, 19.0F, 0.0F);
/* 173 */     this.rfoot.func_78787_b(64, 32);
/* 174 */     this.rfoot.field_78809_i = true;
/* 175 */     setRotation(this.rfoot, 0.0F, 0.0F, 0.0F);
/* 176 */     this.lfoot = new ModelRenderer(this, 46, 8);
/* 177 */     this.lfoot.func_78789_a(0.0F, 3.0F, -2.0F, 2, 2, 4);
/* 178 */     this.lfoot.func_78793_a(2.0F, 19.0F, 0.0F);
/* 179 */     this.lfoot.func_78787_b(64, 32);
/* 180 */     this.lfoot.field_78809_i = true;
/* 181 */     setRotation(this.lfoot, 0.0F, 0.0F, 0.0F);
/* 182 */     this.key2 = new ModelRenderer(this, 46, 8);
/* 183 */     this.key2.func_78789_a(-0.5F, -1.5F, 1.0F, 1, 3, 1);
/* 184 */     this.key2.func_78793_a(0.5F, 17.5F, 5.0F);
/* 185 */     this.key2.func_78787_b(64, 32);
/* 186 */     this.key2.field_78809_i = true;
/* 187 */     setRotation(this.key2, 0.0F, 0.0F, 0.0F);
/* 188 */     this.key1 = new ModelRenderer(this, 46, 8);
/* 189 */     this.key1.func_78789_a(-0.5F, -0.5F, 0.0F, 1, 1, 3);
/* 190 */     this.key1.func_78793_a(0.5F, 17.5F, 5.0F);
/* 191 */     this.key1.func_78787_b(64, 32);
/* 192 */     this.key1.field_78809_i = true;
/* 193 */     setRotation(this.key1, 0.0F, 0.0F, 0.0F);
/* 194 */     this.key3 = new ModelRenderer(this, 46, 8);
/* 195 */     this.key3.func_78789_a(-0.5F, -2.5F, 1.0F, 1, 1, 2);
/* 196 */     this.key3.func_78793_a(0.5F, 17.5F, 5.0F);
/* 197 */     this.key3.func_78787_b(64, 32);
/* 198 */     this.key3.field_78809_i = true;
/* 199 */     setRotation(this.key3, 0.0F, 0.0F, 0.0F);
/* 200 */     this.key4 = new ModelRenderer(this, 46, 8);
/* 201 */     this.key4.func_78789_a(-0.5F, 1.5F, 1.0F, 1, 1, 2);
/* 202 */     this.key4.func_78793_a(0.5F, 17.5F, 5.0F);
/* 203 */     this.key4.func_78787_b(64, 32);
/* 204 */     this.key4.field_78809_i = true;
/* 205 */     setRotation(this.key4, 0.0F, 0.0F, 0.0F);
/* 206 */     this.key5 = new ModelRenderer(this, 46, 8);
/* 207 */     this.key5.func_78789_a(-0.5F, -1.5F, 3.0F, 1, 3, 1);
/* 208 */     this.key5.func_78793_a(0.5F, 17.5F, 5.0F);
/* 209 */     this.key5.func_78787_b(64, 32);
/* 210 */     this.key5.field_78809_i = true;
/* 211 */     setRotation(this.key5, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 218 */     Robot1 e = (Robot1)entity;
/* 219 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 220 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */ 
/*     */     
/* 224 */     if (f1 > 0.1D) {
/* 225 */       newangle = MathHelper.func_76134_b(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.75F * f1;
/*     */     } else {
/* 227 */       newangle = 0.0F;
/*     */     } 
/* 229 */     this.lfoot.field_78795_f = newangle;
/* 230 */     this.rfoot.field_78795_f = -newangle;
/*     */     
/* 232 */     float newangle = (float)Math.toRadians((f2 * 0.75F * this.wingspeed));
/* 233 */     this.key1.field_78808_h = newangle;
/* 234 */     this.key2.field_78808_h = newangle;
/* 235 */     this.key3.field_78808_h = newangle;
/* 236 */     this.key4.field_78808_h = newangle;
/* 237 */     this.key5.field_78808_h = newangle;
/*     */     
/* 239 */     this.Shape1.func_78785_a(f5);
/* 240 */     this.Shape2.func_78785_a(f5);
/* 241 */     this.Shape2a.func_78785_a(f5);
/* 242 */     this.Shape3.func_78785_a(f5);
/* 243 */     this.Shape4.func_78785_a(f5);
/* 244 */     this.Shape5.func_78785_a(f5);
/* 245 */     this.Shape6.func_78785_a(f5);
/* 246 */     this.Shape7.func_78785_a(f5);
/* 247 */     this.Shape8.func_78785_a(f5);
/* 248 */     this.Shape9.func_78785_a(f5);
/* 249 */     this.Shape10.func_78785_a(f5);
/* 250 */     this.Shape11.func_78785_a(f5);
/* 251 */     this.Shape12.func_78785_a(f5);
/* 252 */     this.Shape13.func_78785_a(f5);
/* 253 */     this.Shape14.func_78785_a(f5);
/* 254 */     this.Shape15.func_78785_a(f5);
/* 255 */     this.Shape15a.func_78785_a(f5);
/* 256 */     this.Shape16.func_78785_a(f5);
/* 257 */     this.Shape17.func_78785_a(f5);
/* 258 */     this.Shape18.func_78785_a(f5);
/* 259 */     this.rfoot.func_78785_a(f5);
/* 260 */     this.lfoot.func_78785_a(f5);
/* 261 */     this.key2.func_78785_a(f5);
/* 262 */     this.key1.func_78785_a(f5);
/* 263 */     this.key3.func_78785_a(f5);
/* 264 */     this.key4.func_78785_a(f5);
/* 265 */     this.key5.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 271 */     model.field_78795_f = x;
/* 272 */     model.field_78796_g = y;
/* 273 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 278 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelRobot1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */