/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelAnt
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer thorax;
/*     */   ModelRenderer thorax1;
/*     */   ModelRenderer thorax3;
/*     */   ModelRenderer abdomen;
/*     */   ModelRenderer abdomen1;
/*     */   ModelRenderer head;
/*     */   ModelRenderer jawsr;
/*     */   ModelRenderer jawsl;
/*     */   ModelRenderer llegtop1;
/*     */   ModelRenderer llegbot1;
/*     */   ModelRenderer llegtop2;
/*     */   ModelRenderer llegbot2;
/*     */   ModelRenderer llegtop3;
/*     */   ModelRenderer llegbot3;
/*     */   ModelRenderer rlegtop1;
/*     */   ModelRenderer rlegbot1;
/*     */   ModelRenderer rlegtop2;
/*     */   ModelRenderer rlegbot2;
/*     */   ModelRenderer rlegtop3;
/*     */   ModelRenderer rlegbot3;
/*     */   
/*     */   public ModelAnt() {
/*  34 */     this.field_78090_t = 64;
/*  35 */     this.field_78089_u = 32;
/*  36 */     this.thorax = new ModelRenderer(this, 22, 0);
/*  37 */     this.thorax.func_78789_a(0.0F, 0.0F, 0.0F, 3, 3, 3);
/*  38 */     this.thorax.func_78793_a(0.0F, 17.0F, 0.0F);
/*  39 */     this.thorax.func_78787_b(64, 32);
/*  40 */     this.thorax.field_78809_i = true;
/*  41 */     setRotation(this.thorax, 0.0F, 0.0F, 0.0F);
/*  42 */     this.thorax1 = new ModelRenderer(this, 18, 0);
/*  43 */     this.thorax1.func_78789_a(1.0F, 1.0F, -1.0F, 1, 1, 1);
/*  44 */     this.thorax1.func_78793_a(0.0F, 17.0F, 0.0F);
/*  45 */     this.thorax1.func_78787_b(64, 32);
/*  46 */     this.thorax1.field_78809_i = true;
/*  47 */     setRotation(this.thorax1, 0.0F, 0.0F, 0.0F);
/*  48 */     this.thorax3 = new ModelRenderer(this, 34, 0);
/*  49 */     this.thorax3.func_78789_a(1.0F, 1.0F, 3.0F, 1, 1, 1);
/*  50 */     this.thorax3.func_78793_a(0.0F, 17.0F, 0.0F);
/*  51 */     this.thorax3.func_78787_b(64, 32);
/*  52 */     this.thorax3.field_78809_i = true;
/*  53 */     setRotation(this.thorax3, 0.0F, 0.0F, 0.0F);
/*  54 */     this.abdomen = new ModelRenderer(this, 38, 0);
/*  55 */     this.abdomen.func_78789_a(0.0F, 0.0F, 4.0F, 3, 3, 5);
/*  56 */     this.abdomen.func_78793_a(0.0F, 17.0F, 0.0F);
/*  57 */     this.abdomen.func_78787_b(64, 32);
/*  58 */     this.abdomen.field_78809_i = true;
/*  59 */     setRotation(this.abdomen, 0.0F, 0.0F, 0.0F);
/*  60 */     this.abdomen1 = new ModelRenderer(this, 54, 0);
/*  61 */     this.abdomen1.func_78789_a(1.0F, 1.0F, 9.0F, 1, 1, 1);
/*  62 */     this.abdomen1.func_78793_a(0.0F, 17.0F, 0.0F);
/*  63 */     this.abdomen1.func_78787_b(64, 32);
/*  64 */     this.abdomen1.field_78809_i = true;
/*  65 */     setRotation(this.abdomen1, 0.0F, 0.0F, 0.0F);
/*  66 */     this.head = new ModelRenderer(this, 6, 0);
/*  67 */     this.head.func_78789_a(0.0F, -1.0F, -4.0F, 3, 3, 3);
/*  68 */     this.head.func_78793_a(0.0F, 17.0F, 0.0F);
/*  69 */     this.head.func_78787_b(64, 32);
/*  70 */     this.head.field_78809_i = true;
/*  71 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  72 */     this.jawsr = new ModelRenderer(this, 0, 9);
/*  73 */     this.jawsr.func_78789_a(-1.0F, 0.0F, -6.0F, 1, 1, 3);
/*  74 */     this.jawsr.func_78793_a(0.0F, 17.0F, 0.0F);
/*  75 */     this.jawsr.func_78787_b(64, 32);
/*  76 */     this.jawsr.field_78809_i = true;
/*  77 */     setRotation(this.jawsr, 0.0F, 0.0F, 0.0F);
/*  78 */     this.jawsl = new ModelRenderer(this, 0, 14);
/*  79 */     this.jawsl.func_78789_a(3.0F, 0.0F, -6.0F, 1, 1, 3);
/*  80 */     this.jawsl.func_78793_a(0.0F, 17.0F, 0.0F);
/*  81 */     this.jawsl.func_78787_b(64, 32);
/*  82 */     this.jawsl.field_78809_i = true;
/*  83 */     setRotation(this.jawsl, 0.0F, 0.0F, 0.0F);
/*  84 */     this.llegtop1 = new ModelRenderer(this, 15, 10);
/*  85 */     this.llegtop1.func_78789_a(3.0F, 1.0F, 1.0F, 3, 1, 1);
/*  86 */     this.llegtop1.func_78793_a(0.0F, 17.0F, 0.0F);
/*  87 */     this.llegtop1.func_78787_b(64, 32);
/*  88 */     this.llegtop1.field_78809_i = true;
/*  89 */     setRotation(this.llegtop1, 0.0F, 0.0F, 0.3839724F);
/*  90 */     this.llegbot1 = new ModelRenderer(this, 15, 19);
/*  91 */     this.llegbot1.func_78789_a(5.0F, -3.0F, 1.0F, 3, 1, 1);
/*  92 */     this.llegbot1.func_78793_a(0.0F, 17.0F, 0.0F);
/*  93 */     this.llegbot1.func_78787_b(64, 32);
/*  94 */     this.llegbot1.field_78809_i = true;
/*  95 */     setRotation(this.llegbot1, 0.0F, 0.0F, 1.064651F);
/*  96 */     this.llegtop2 = new ModelRenderer(this, 15, 13);
/*  97 */     this.llegtop2.func_78789_a(3.0F, 1.0F, 2.0F, 3, 1, 1);
/*  98 */     this.llegtop2.func_78793_a(0.0F, 17.0F, 0.0F);
/*  99 */     this.llegtop2.func_78787_b(64, 32);
/* 100 */     this.llegtop2.field_78809_i = true;
/* 101 */     setRotation(this.llegtop2, 0.0F, -0.2094395F, 0.3839724F);
/* 102 */     this.llegbot2 = new ModelRenderer(this, 15, 22);
/* 103 */     this.llegbot2.func_78789_a(5.0F, -3.0F, 2.0F, 3, 1, 1);
/* 104 */     this.llegbot2.func_78793_a(0.0F, 17.0F, 0.0F);
/* 105 */     this.llegbot2.func_78787_b(64, 32);
/* 106 */     this.llegbot2.field_78809_i = true;
/* 107 */     setRotation(this.llegbot2, 0.0F, -0.2268928F, 1.064651F);
/* 108 */     this.llegtop3 = new ModelRenderer(this, 15, 16);
/* 109 */     this.llegtop3.func_78789_a(3.0F, 1.0F, 0.0F, 3, 1, 1);
/* 110 */     this.llegtop3.func_78793_a(0.0F, 17.0F, 0.0F);
/* 111 */     this.llegtop3.func_78787_b(64, 32);
/* 112 */     this.llegtop3.field_78809_i = true;
/* 113 */     setRotation(this.llegtop3, 0.0F, 0.3490659F, 0.3839724F);
/* 114 */     this.llegbot3 = new ModelRenderer(this, 15, 25);
/* 115 */     this.llegbot3.func_78789_a(5.0F, -3.0F, 0.0F, 3, 1, 1);
/* 116 */     this.llegbot3.func_78793_a(0.0F, 17.0F, 0.0F);
/* 117 */     this.llegbot3.func_78787_b(64, 32);
/* 118 */     this.llegbot3.field_78809_i = true;
/* 119 */     setRotation(this.llegbot3, 0.0F, 0.3490659F, 1.064651F);
/* 120 */     this.rlegtop1 = new ModelRenderer(this, 25, 10);
/* 121 */     this.rlegtop1.func_78789_a(-4.0F, 2.0F, 1.0F, 3, 1, 1);
/* 122 */     this.rlegtop1.func_78793_a(0.0F, 17.0F, 0.0F);
/* 123 */     this.rlegtop1.func_78787_b(64, 32);
/* 124 */     this.rlegtop1.field_78809_i = true;
/* 125 */     setRotation(this.rlegtop1, 0.0F, 0.0F, -0.4712389F);
/* 126 */     this.rlegbot1 = new ModelRenderer(this, 25, 19);
/* 127 */     this.rlegbot1.func_78789_a(-7.0F, 0.0F, 1.0F, 3, 1, 1);
/* 128 */     this.rlegbot1.func_78793_a(0.0F, 17.0F, 0.0F);
/* 129 */     this.rlegbot1.func_78787_b(64, 32);
/* 130 */     this.rlegbot1.field_78809_i = true;
/* 131 */     setRotation(this.rlegbot1, 0.0F, 0.0F, -0.9773844F);
/* 132 */     this.rlegtop2 = new ModelRenderer(this, 25, 13);
/* 133 */     this.rlegtop2.func_78789_a(-4.0F, 2.0F, 0.0F, 3, 1, 1);
/* 134 */     this.rlegtop2.func_78793_a(0.0F, 17.0F, 0.0F);
/* 135 */     this.rlegtop2.func_78787_b(64, 32);
/* 136 */     this.rlegtop2.field_78809_i = true;
/* 137 */     setRotation(this.rlegtop2, 0.0F, -0.5934119F, -0.4712389F);
/* 138 */     this.rlegbot2 = new ModelRenderer(this, 25, 22);
/* 139 */     this.rlegbot2.func_78789_a(-7.0F, 0.0F, 0.0F, 3, 1, 1);
/* 140 */     this.rlegbot2.func_78793_a(0.0F, 17.0F, 0.0F);
/* 141 */     this.rlegbot2.func_78787_b(64, 32);
/* 142 */     this.rlegbot2.field_78809_i = true;
/* 143 */     setRotation(this.rlegbot2, 0.0F, -0.5934119F, -0.9773844F);
/* 144 */     this.rlegtop3 = new ModelRenderer(this, 25, 16);
/* 145 */     this.rlegtop3.func_78789_a(-4.0F, 2.0F, 2.0F, 3, 1, 1);
/* 146 */     this.rlegtop3.func_78793_a(0.0F, 17.0F, 0.0F);
/* 147 */     this.rlegtop3.func_78787_b(64, 32);
/* 148 */     this.rlegtop3.field_78809_i = true;
/* 149 */     setRotation(this.rlegtop3, 0.0F, 0.418879F, -0.4712389F);
/* 150 */     this.rlegbot3 = new ModelRenderer(this, 25, 25);
/* 151 */     this.rlegbot3.func_78789_a(-7.0F, 0.0F, 2.0F, 3, 1, 1);
/* 152 */     this.rlegbot3.func_78793_a(0.0F, 17.0F, 0.0F);
/* 153 */     this.rlegbot3.func_78787_b(64, 32);
/* 154 */     this.rlegbot3.field_78809_i = true;
/* 155 */     setRotation(this.rlegbot3, 0.0F, 0.418879F, -0.9773844F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 160 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 161 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 164 */     this.llegtop1.field_78795_f = MathHelper.func_76134_b(f2 * 2.7F) * 3.1415927F * 0.45F * f1;
/* 165 */     this.llegbot1.field_78795_f = this.llegtop1.field_78795_f;
/* 166 */     this.rlegtop2.field_78795_f = this.llegtop1.field_78795_f;
/* 167 */     this.rlegbot2.field_78795_f = this.llegtop1.field_78795_f;
/* 168 */     this.rlegtop3.field_78795_f = this.llegtop1.field_78795_f;
/* 169 */     this.rlegbot3.field_78795_f = this.llegtop1.field_78795_f;
/*     */     
/* 171 */     this.rlegtop1.field_78795_f = -this.llegtop1.field_78795_f;
/* 172 */     this.rlegbot1.field_78795_f = -this.llegtop1.field_78795_f;
/* 173 */     this.llegtop2.field_78795_f = -this.llegtop1.field_78795_f;
/* 174 */     this.llegbot2.field_78795_f = -this.llegtop1.field_78795_f;
/* 175 */     this.llegtop3.field_78795_f = -this.llegtop1.field_78795_f;
/* 176 */     this.llegbot3.field_78795_f = -this.llegtop1.field_78795_f;
/*     */     
/* 178 */     this.jawsl.field_78796_g = MathHelper.func_76134_b(f2 * 0.4F) * 3.1415927F * 0.05F;
/* 179 */     this.jawsr.field_78796_g = -this.jawsl.field_78796_g;
/*     */     
/* 181 */     this.thorax.func_78785_a(f5);
/* 182 */     this.thorax1.func_78785_a(f5);
/* 183 */     this.thorax3.func_78785_a(f5);
/* 184 */     this.abdomen.func_78785_a(f5);
/* 185 */     this.abdomen1.func_78785_a(f5);
/* 186 */     this.head.func_78785_a(f5);
/* 187 */     this.jawsr.func_78785_a(f5);
/* 188 */     this.jawsl.func_78785_a(f5);
/* 189 */     this.llegtop1.func_78785_a(f5);
/* 190 */     this.llegbot1.func_78785_a(f5);
/* 191 */     this.llegtop2.func_78785_a(f5);
/* 192 */     this.llegbot2.func_78785_a(f5);
/* 193 */     this.llegtop3.func_78785_a(f5);
/* 194 */     this.llegbot3.func_78785_a(f5);
/* 195 */     this.rlegtop1.func_78785_a(f5);
/* 196 */     this.rlegbot1.func_78785_a(f5);
/* 197 */     this.rlegtop2.func_78785_a(f5);
/* 198 */     this.rlegbot2.func_78785_a(f5);
/* 199 */     this.rlegtop3.func_78785_a(f5);
/* 200 */     this.rlegbot3.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 205 */     model.field_78795_f = x;
/* 206 */     model.field_78796_g = y;
/* 207 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 212 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelAnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */