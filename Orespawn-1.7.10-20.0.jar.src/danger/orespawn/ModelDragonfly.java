/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelDragonfly
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Shape1;
/*     */   
/*     */   ModelRenderer lfwing;
/*     */   ModelRenderer Shape3;
/*     */   ModelRenderer Shape4;
/*     */   ModelRenderer Shape5;
/*     */   ModelRenderer rjaw;
/*     */   ModelRenderer ljaw;
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer Shape10;
/*     */   ModelRenderer Shape11;
/*     */   ModelRenderer Shape12;
/*     */   ModelRenderer Shape13;
/*     */   ModelRenderer Shape14;
/*     */   ModelRenderer Shape15;
/*     */   ModelRenderer Shape16;
/*     */   ModelRenderer Shape17;
/*     */   ModelRenderer Shape18;
/*     */   ModelRenderer Shape19;
/*     */   ModelRenderer Shape20;
/*     */   ModelRenderer Shape21;
/*     */   ModelRenderer Shape22;
/*     */   ModelRenderer Shape23;
/*     */   ModelRenderer lrwing;
/*     */   ModelRenderer rfwing;
/*     */   ModelRenderer rrwing;
/*     */   
/*     */   public ModelDragonfly(float f1) {
/*  42 */     this.wingspeed = f1;
/*     */     
/*  44 */     this.field_78090_t = 64;
/*  45 */     this.field_78089_u = 64;
/*     */     
/*  47 */     this.Shape1 = new ModelRenderer(this, 0, 0);
/*  48 */     this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 5, 4, 7);
/*  49 */     this.Shape1.func_78793_a(0.0F, 16.0F, 0.0F);
/*  50 */     this.Shape1.func_78787_b(64, 64);
/*  51 */     this.Shape1.field_78809_i = true;
/*  52 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/*  53 */     this.lfwing = new ModelRenderer(this, 0, 33);
/*  54 */     this.lfwing.func_78789_a(0.0F, 0.0F, 0.0F, 10, 1, 3);
/*  55 */     this.lfwing.func_78793_a(5.0F, 16.0F, 1.0F);
/*  56 */     this.lfwing.func_78787_b(64, 64);
/*  57 */     this.lfwing.field_78809_i = true;
/*  58 */     setRotation(this.lfwing, 0.0F, 0.4886922F, 0.0F);
/*  59 */     this.Shape3 = new ModelRenderer(this, 0, 13);
/*  60 */     this.Shape3.func_78789_a(-2.0F, 0.0F, -4.0F, 4, 3, 4);
/*  61 */     this.Shape3.func_78793_a(2.5F, 16.0F, -1.0F);
/*  62 */     this.Shape3.func_78787_b(64, 64);
/*  63 */     this.Shape3.field_78809_i = true;
/*  64 */     setRotation(this.Shape3, 0.4886922F, 0.0F, 0.0F);
/*  65 */     this.Shape4 = new ModelRenderer(this, 9, 21);
/*  66 */     this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 3);
/*  67 */     this.Shape4.func_78793_a(1.0F, 18.0F, -6.0F);
/*  68 */     this.Shape4.func_78787_b(64, 64);
/*  69 */     this.Shape4.field_78809_i = true;
/*  70 */     setRotation(this.Shape4, 0.4886922F, 0.1745329F, 0.0F);
/*  71 */     this.Shape5 = new ModelRenderer(this, 0, 21);
/*  72 */     this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 3);
/*  73 */     this.Shape5.func_78793_a(3.0F, 18.0F, -6.0F);
/*  74 */     this.Shape5.func_78787_b(64, 64);
/*  75 */     this.Shape5.field_78809_i = true;
/*  76 */     setRotation(this.Shape5, 0.4886922F, -0.1745329F, 0.0F);
/*  77 */     this.rjaw = new ModelRenderer(this, 0, 27);
/*  78 */     this.rjaw.func_78789_a(-1.0F, 0.0F, 0.0F, 1, 3, 1);
/*  79 */     this.rjaw.func_78793_a(2.0F, 19.0F, -5.0F);
/*  80 */     this.rjaw.func_78787_b(64, 64);
/*  81 */     this.rjaw.field_78809_i = true;
/*  82 */     setRotation(this.rjaw, 0.4363323F, 0.1745329F, 0.0F);
/*  83 */     this.ljaw = new ModelRenderer(this, 5, 27);
/*  84 */     this.ljaw.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/*  85 */     this.ljaw.func_78793_a(3.0F, 19.0F, -5.0F);
/*  86 */     this.ljaw.func_78787_b(64, 64);
/*  87 */     this.ljaw.field_78809_i = true;
/*  88 */     setRotation(this.ljaw, 0.4363323F, -0.1745329F, 0.0F);
/*  89 */     this.tail1 = new ModelRenderer(this, 25, 0);
/*  90 */     this.tail1.func_78789_a(-1.0F, 0.0F, 0.0F, 3, 3, 7);
/*  91 */     this.tail1.func_78793_a(2.0F, 16.0F, 7.0F);
/*  92 */     this.tail1.func_78787_b(64, 64);
/*  93 */     this.tail1.field_78809_i = true;
/*  94 */     setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
/*  95 */     this.tail2 = new ModelRenderer(this, 25, 11);
/*  96 */     this.tail2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 9);
/*  97 */     this.tail2.func_78793_a(2.0F, 16.0F, 14.0F);
/*  98 */     this.tail2.func_78787_b(64, 64);
/*  99 */     this.tail2.field_78809_i = true;
/* 100 */     setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
/* 101 */     this.Shape10 = new ModelRenderer(this, 23, 0);
/* 102 */     this.Shape10.func_78789_a(-1.0F, 0.0F, 0.0F, 1, 4, 1);
/* 103 */     this.Shape10.func_78793_a(1.0F, 18.0F, 0.0F);
/* 104 */     this.Shape10.func_78787_b(64, 64);
/* 105 */     this.Shape10.field_78809_i = true;
/* 106 */     setRotation(this.Shape10, -0.2792527F, 0.0F, 0.3490659F);
/* 107 */     this.Shape11 = new ModelRenderer(this, 40, 0);
/* 108 */     this.Shape11.func_78789_a(0.0F, 0.0F, -4.0F, 1, 1, 4);
/* 109 */     this.Shape11.func_78793_a(-1.0F, 21.0F, 0.0F);
/* 110 */     this.Shape11.func_78787_b(64, 64);
/* 111 */     this.Shape11.field_78809_i = true;
/* 112 */     setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
/* 113 */     this.Shape12 = new ModelRenderer(this, 18, 12);
/* 114 */     this.Shape12.func_78789_a(-1.0F, 0.0F, 0.0F, 1, 3, 1);
/* 115 */     this.Shape12.func_78793_a(0.0F, 21.0F, -4.0F);
/* 116 */     this.Shape12.func_78787_b(64, 64);
/* 117 */     this.Shape12.field_78809_i = true;
/* 118 */     setRotation(this.Shape12, 0.0F, 0.0F, -0.1919862F);
/* 119 */     this.Shape13 = new ModelRenderer(this, 18, 0);
/* 120 */     this.Shape13.func_78789_a(0.0F, 0.0F, 0.0F, 1, 4, 1);
/* 121 */     this.Shape13.func_78793_a(4.0F, 18.0F, 0.0F);
/* 122 */     this.Shape13.func_78787_b(64, 64);
/* 123 */     this.Shape13.field_78809_i = true;
/* 124 */     setRotation(this.Shape13, -0.2792527F, 0.0F, -0.3490659F);
/* 125 */     this.Shape14 = new ModelRenderer(this, 51, 0);
/* 126 */     this.Shape14.func_78789_a(0.0F, 0.0F, -4.0F, 1, 1, 4);
/* 127 */     this.Shape14.func_78793_a(5.0F, 21.0F, 0.0F);
/* 128 */     this.Shape14.func_78787_b(64, 64);
/* 129 */     this.Shape14.field_78809_i = true;
/* 130 */     setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
/* 131 */     this.Shape15 = new ModelRenderer(this, 13, 12);
/* 132 */     this.Shape15.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 133 */     this.Shape15.func_78793_a(5.0F, 21.0F, -4.0F);
/* 134 */     this.Shape15.func_78787_b(64, 64);
/* 135 */     this.Shape15.field_78809_i = true;
/* 136 */     setRotation(this.Shape15, 0.0F, 0.0F, 0.1919862F);
/* 137 */     this.Shape16 = new ModelRenderer(this, 9, 53);
/* 138 */     this.Shape16.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 1);
/* 139 */     this.Shape16.func_78793_a(5.0F, 19.5F, 3.0F);
/* 140 */     this.Shape16.func_78787_b(64, 64);
/* 141 */     this.Shape16.field_78809_i = true;
/* 142 */     setRotation(this.Shape16, 0.0F, 0.0F, 0.6457718F);
/* 143 */     this.Shape17 = new ModelRenderer(this, 0, 56);
/* 144 */     this.Shape17.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 145 */     this.Shape17.func_78793_a(6.0F, 21.0F, 3.0F);
/* 146 */     this.Shape17.func_78787_b(64, 64);
/* 147 */     this.Shape17.field_78809_i = true;
/* 148 */     setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
/* 149 */     this.Shape18 = new ModelRenderer(this, 0, 53);
/* 150 */     this.Shape18.func_78789_a(-3.0F, 0.0F, 0.0F, 3, 1, 1);
/* 151 */     this.Shape18.func_78793_a(0.0F, 19.5F, 3.0F);
/* 152 */     this.Shape18.func_78787_b(64, 64);
/* 153 */     this.Shape18.field_78809_i = true;
/* 154 */     setRotation(this.Shape18, 0.0F, 0.0F, -0.6457718F);
/* 155 */     this.Shape19 = new ModelRenderer(this, 5, 56);
/* 156 */     this.Shape19.func_78789_a(-1.0F, 0.0F, 0.0F, 1, 3, 1);
/* 157 */     this.Shape19.func_78793_a(-1.0F, 21.0F, 3.0F);
/* 158 */     this.Shape19.func_78787_b(64, 64);
/* 159 */     this.Shape19.field_78809_i = true;
/* 160 */     setRotation(this.Shape19, 0.0F, 0.0F, 0.0F);
/* 161 */     this.Shape20 = new ModelRenderer(this, 9, 61);
/* 162 */     this.Shape20.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 1);
/* 163 */     this.Shape20.func_78793_a(4.0F, 19.5F, 6.0F);
/* 164 */     this.Shape20.func_78787_b(64, 64);
/* 165 */     this.Shape20.field_78809_i = true;
/* 166 */     setRotation(this.Shape20, 0.0F, -0.6457718F, 0.5061455F);
/* 167 */     this.Shape21 = new ModelRenderer(this, 0, 61);
/* 168 */     this.Shape21.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 1);
/* 169 */     this.Shape21.func_78793_a(1.5F, 19.5F, 7.0F);
/* 170 */     this.Shape21.func_78787_b(64, 64);
/* 171 */     this.Shape21.field_78809_i = true;
/* 172 */     setRotation(this.Shape21, 0.0F, -2.391101F, 0.5061455F);
/* 173 */     this.Shape22 = new ModelRenderer(this, 0, 0);
/* 174 */     this.Shape22.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 175 */     this.Shape22.func_78793_a(-1.0F, 21.0F, 7.5F);
/* 176 */     this.Shape22.func_78787_b(64, 64);
/* 177 */     this.Shape22.field_78809_i = true;
/* 178 */     setRotation(this.Shape22, 0.0F, 0.0F, 0.0F);
/* 179 */     this.Shape23 = new ModelRenderer(this, 0, 13);
/* 180 */     this.Shape23.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 181 */     this.Shape23.func_78793_a(5.0F, 21.0F, 7.5F);
/* 182 */     this.Shape23.func_78787_b(64, 64);
/* 183 */     this.Shape23.field_78809_i = true;
/* 184 */     setRotation(this.Shape23, 0.0F, 0.0F, 0.0F);
/* 185 */     this.lrwing = new ModelRenderer(this, 0, 38);
/* 186 */     this.lrwing.func_78789_a(0.0F, 0.0F, -3.0F, 10, 1, 3);
/* 187 */     this.lrwing.func_78793_a(5.0F, 16.0F, 6.0F);
/* 188 */     this.lrwing.func_78787_b(64, 64);
/* 189 */     this.lrwing.field_78809_i = true;
/* 190 */     setRotation(this.lrwing, 0.0F, -0.3839724F, 0.0F);
/* 191 */     this.rfwing = new ModelRenderer(this, 0, 48);
/* 192 */     this.rfwing.func_78789_a(-10.0F, 0.0F, 0.0F, 10, 1, 3);
/* 193 */     this.rfwing.func_78793_a(0.0F, 16.0F, 1.0F);
/* 194 */     this.rfwing.func_78787_b(64, 64);
/* 195 */     this.rfwing.field_78809_i = true;
/* 196 */     setRotation(this.rfwing, 0.0F, -0.4886922F, 0.0F);
/* 197 */     this.rrwing = new ModelRenderer(this, 0, 43);
/* 198 */     this.rrwing.func_78789_a(-10.0F, 0.0F, -3.0F, 10, 1, 3);
/* 199 */     this.rrwing.func_78793_a(0.0F, 16.0F, 6.0F);
/* 200 */     this.rrwing.func_78787_b(64, 64);
/* 201 */     this.rrwing.field_78809_i = true;
/* 202 */     setRotation(this.rrwing, 0.0F, 0.3839724F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 207 */     float newangle = 0.0F;
/* 208 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 209 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 212 */     newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F;
/* 213 */     this.lfwing.field_78808_h = newangle;
/* 214 */     this.rfwing.field_78808_h = -newangle;
/* 215 */     this.lrwing.field_78808_h = newangle + 3.14F;
/* 216 */     this.rrwing.field_78808_h = -newangle + 3.14F;
/*     */     
/* 218 */     newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.1F;
/* 219 */     this.ljaw.field_78795_f = newangle;
/* 220 */     this.rjaw.field_78795_f = -newangle;
/*     */     
/* 222 */     this.Shape1.func_78785_a(f5);
/* 223 */     this.lfwing.func_78785_a(f5);
/* 224 */     this.Shape3.func_78785_a(f5);
/* 225 */     this.Shape4.func_78785_a(f5);
/* 226 */     this.Shape5.func_78785_a(f5);
/* 227 */     this.rjaw.func_78785_a(f5);
/* 228 */     this.ljaw.func_78785_a(f5);
/* 229 */     this.tail1.func_78785_a(f5);
/* 230 */     this.tail2.func_78785_a(f5);
/* 231 */     this.Shape10.func_78785_a(f5);
/* 232 */     this.Shape11.func_78785_a(f5);
/* 233 */     this.Shape12.func_78785_a(f5);
/* 234 */     this.Shape13.func_78785_a(f5);
/* 235 */     this.Shape14.func_78785_a(f5);
/* 236 */     this.Shape15.func_78785_a(f5);
/* 237 */     this.Shape16.func_78785_a(f5);
/* 238 */     this.Shape17.func_78785_a(f5);
/* 239 */     this.Shape18.func_78785_a(f5);
/* 240 */     this.Shape19.func_78785_a(f5);
/* 241 */     this.Shape20.func_78785_a(f5);
/* 242 */     this.Shape21.func_78785_a(f5);
/* 243 */     this.Shape22.func_78785_a(f5);
/* 244 */     this.Shape23.func_78785_a(f5);
/* 245 */     this.lrwing.func_78785_a(f5);
/* 246 */     this.rfwing.func_78785_a(f5);
/* 247 */     this.rrwing.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 254 */     model.field_78795_f = x;
/* 255 */     model.field_78796_g = y;
/* 256 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 261 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelDragonfly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */