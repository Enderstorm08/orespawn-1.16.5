/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelPeacock
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer lleg;
/*     */   ModelRenderer rleg;
/*     */   ModelRenderer body;
/*     */   ModelRenderer neck;
/*     */   ModelRenderer head1;
/*     */   ModelRenderer head2;
/*     */   ModelRenderer hf1;
/*     */   ModelRenderer hf2;
/*     */   ModelRenderer hf3;
/*     */   ModelRenderer tailf1;
/*     */   ModelRenderer tailf2;
/*     */   ModelRenderer tailf3;
/*     */   ModelRenderer tailf4;
/*     */   ModelRenderer tailf5;
/*     */   ModelRenderer tailf6;
/*     */   ModelRenderer tailf7;
/*     */   
/*     */   public ModelPeacock(float f1) {
/*  31 */     this.wingspeed = f1;
/*     */     
/*  33 */     this.field_78090_t = 128;
/*  34 */     this.field_78089_u = 128;
/*     */     
/*  36 */     this.lleg = new ModelRenderer(this, 0, 20);
/*  37 */     this.lleg.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  38 */     this.lleg.func_78793_a(1.0F, 17.0F, 0.0F);
/*  39 */     this.lleg.func_78787_b(128, 128);
/*  40 */     this.lleg.field_78809_i = true;
/*  41 */     setRotation(this.lleg, 0.0F, 0.0F, 0.0F);
/*  42 */     this.rleg = new ModelRenderer(this, 5, 20);
/*  43 */     this.rleg.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
/*  44 */     this.rleg.func_78793_a(-1.0F, 17.0F, 0.0F);
/*  45 */     this.rleg.func_78787_b(128, 128);
/*  46 */     this.rleg.field_78809_i = true;
/*  47 */     setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
/*  48 */     this.body = new ModelRenderer(this, 88, 0);
/*  49 */     this.body.func_78789_a(-2.0F, -2.0F, -5.0F, 5, 4, 11);
/*  50 */     this.body.func_78793_a(0.0F, 15.0F, 1.0F);
/*  51 */     this.body.func_78787_b(128, 128);
/*  52 */     this.body.field_78809_i = true;
/*  53 */     setRotation(this.body, -0.1396263F, 0.0F, 0.0F);
/*  54 */     this.neck = new ModelRenderer(this, 70, 0);
/*  55 */     this.neck.func_78789_a(-0.5F, -1.0F, -6.0F, 2, 2, 6);
/*  56 */     this.neck.func_78793_a(0.0F, 14.0F, -3.0F);
/*  57 */     this.neck.func_78787_b(128, 128);
/*  58 */     this.neck.field_78809_i = true;
/*  59 */     setRotation(this.neck, -0.5585054F, 0.0F, 0.0F);
/*  60 */     this.head1 = new ModelRenderer(this, 56, 0);
/*  61 */     this.head1.func_78789_a(-0.5F, -2.0F, -2.0F, 2, 2, 4);
/*  62 */     this.head1.func_78793_a(0.0F, 12.0F, -8.0F);
/*  63 */     this.head1.func_78787_b(128, 128);
/*  64 */     this.head1.field_78809_i = true;
/*  65 */     setRotation(this.head1, 0.0F, 0.0F, 0.0F);
/*  66 */     this.head2 = new ModelRenderer(this, 48, 0);
/*  67 */     this.head2.func_78789_a(0.0F, -1.0F, -4.0F, 1, 1, 2);
/*  68 */     this.head2.func_78793_a(0.0F, 12.0F, -8.0F);
/*  69 */     this.head2.func_78787_b(128, 128);
/*  70 */     this.head2.field_78809_i = true;
/*  71 */     setRotation(this.head2, 0.0F, 0.0F, 0.0F);
/*  72 */     this.hf1 = new ModelRenderer(this, 8, 0);
/*  73 */     this.hf1.func_78789_a(0.5F, -9.0F, -1.5F, 0, 7, 3);
/*  74 */     this.hf1.func_78793_a(0.0F, 12.0F, -8.0F);
/*  75 */     this.hf1.func_78787_b(128, 128);
/*  76 */     this.hf1.field_78809_i = true;
/*  77 */     setRotation(this.hf1, 0.4014257F, 0.0F, 0.0F);
/*  78 */     this.hf2 = new ModelRenderer(this, 8, 0);
/*  79 */     this.hf2.func_78789_a(0.5F, -9.0F, -1.5F, 0, 7, 3);
/*  80 */     this.hf2.func_78793_a(0.0F, 12.0F, -8.0F);
/*  81 */     this.hf2.func_78787_b(128, 128);
/*  82 */     this.hf2.field_78809_i = true;
/*  83 */     setRotation(this.hf2, -0.1745329F, 0.0F, 0.0F);
/*  84 */     this.hf3 = new ModelRenderer(this, 8, 0);
/*  85 */     this.hf3.func_78789_a(0.5F, -9.0F, -1.5F, 0, 7, 3);
/*  86 */     this.hf3.func_78793_a(0.0F, 12.0F, -8.0F);
/*  87 */     this.hf3.func_78787_b(128, 128);
/*  88 */     this.hf3.field_78809_i = true;
/*  89 */     setRotation(this.hf3, -0.6981317F, 0.0F, 0.0F);
/*  90 */     this.tailf1 = new ModelRenderer(this, 0, 50);
/*  91 */     this.tailf1.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 30);
/*  92 */     this.tailf1.func_78793_a(0.5F, 14.0F, 7.0F);
/*  93 */     this.tailf1.func_78787_b(128, 128);
/*  94 */     this.tailf1.field_78809_i = true;
/*  95 */     setRotation(this.tailf1, 0.0F, 0.0F, 0.0F);
/*  96 */     this.tailf2 = new ModelRenderer(this, 0, 50);
/*  97 */     this.tailf2.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 30);
/*  98 */     this.tailf2.func_78793_a(0.5F, 14.0F, 7.0F);
/*  99 */     this.tailf2.func_78787_b(128, 128);
/* 100 */     this.tailf2.field_78809_i = true;
/* 101 */     setRotation(this.tailf2, 0.0F, 0.0F, 0.0F);
/* 102 */     this.tailf3 = new ModelRenderer(this, 0, 50);
/* 103 */     this.tailf3.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 30);
/* 104 */     this.tailf3.func_78793_a(0.5F, 14.0F, 7.0F);
/* 105 */     this.tailf3.func_78787_b(128, 128);
/* 106 */     this.tailf3.field_78809_i = true;
/* 107 */     setRotation(this.tailf3, 0.0F, 0.0F, 0.0F);
/* 108 */     this.tailf4 = new ModelRenderer(this, 0, 50);
/* 109 */     this.tailf4.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 30);
/* 110 */     this.tailf4.func_78793_a(0.5F, 14.0F, 7.0F);
/* 111 */     this.tailf4.func_78787_b(128, 128);
/* 112 */     this.tailf4.field_78809_i = true;
/* 113 */     setRotation(this.tailf4, 0.0F, 0.0F, 0.0F);
/* 114 */     this.tailf5 = new ModelRenderer(this, 0, 50);
/* 115 */     this.tailf5.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 30);
/* 116 */     this.tailf5.func_78793_a(0.5F, 14.0F, 7.0F);
/* 117 */     this.tailf5.func_78787_b(128, 128);
/* 118 */     this.tailf5.field_78809_i = true;
/* 119 */     setRotation(this.tailf5, 0.0F, 0.0F, 0.0F);
/* 120 */     this.tailf6 = new ModelRenderer(this, 0, 50);
/* 121 */     this.tailf6.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 30);
/* 122 */     this.tailf6.func_78793_a(0.5F, 14.0F, 7.0F);
/* 123 */     this.tailf6.func_78787_b(128, 128);
/* 124 */     this.tailf6.field_78809_i = true;
/* 125 */     setRotation(this.tailf6, 0.0F, 0.0F, 0.0F);
/* 126 */     this.tailf7 = new ModelRenderer(this, 0, 50);
/* 127 */     this.tailf7.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 0, 30);
/* 128 */     this.tailf7.func_78793_a(0.514F, 14.0F, 7.0F);
/* 129 */     this.tailf7.func_78787_b(128, 128);
/* 130 */     this.tailf7.field_78809_i = true;
/* 131 */     setRotation(this.tailf7, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 137 */     Peacock p = (Peacock)entity;
/*     */     
/* 139 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 140 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 142 */     float newangle = 0.0F;
/*     */ 
/*     */     
/* 145 */     if (f1 > 0.1D) {
/* 146 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.15F * f1;
/*     */     } else {
/* 148 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 151 */     this.lleg.field_78795_f = newangle;
/* 152 */     this.rleg.field_78795_f = -newangle;
/*     */     
/* 154 */     if (p.getBlink() > 0) {
/* 155 */       this.hf1.field_78795_f = 0.401F;
/* 156 */       this.hf2.field_78795_f = -0.174F;
/* 157 */       this.hf3.field_78795_f = -0.698F;
/* 158 */       this.tailf1.field_78795_f = 1.047F;
/* 159 */       this.tailf2.field_78795_f = 1.047F;
/* 160 */       this.tailf3.field_78795_f = 1.047F;
/* 161 */       this.tailf4.field_78795_f = 1.047F;
/* 162 */       this.tailf5.field_78795_f = 1.047F;
/* 163 */       this.tailf6.field_78795_f = 1.047F;
/* 164 */       this.tailf7.field_78795_f = 1.047F;
/*     */       
/* 166 */       this.tailf1.field_78808_h = -0.4F;
/* 167 */       this.tailf2.field_78808_h = -0.8F;
/* 168 */       this.tailf3.field_78808_h = -1.2F;
/* 169 */       this.tailf4.field_78808_h = 0.4F;
/* 170 */       this.tailf5.field_78808_h = 0.8F;
/* 171 */       this.tailf6.field_78808_h = 1.2F;
/*     */     } else {
/* 173 */       this.hf1.field_78795_f = -1.06F;
/* 174 */       this.hf2.field_78795_f = -1.06F;
/* 175 */       this.hf3.field_78795_f = -1.06F;
/* 176 */       this.tailf1.field_78795_f = 0.0F;
/* 177 */       this.tailf2.field_78795_f = 0.0F;
/* 178 */       this.tailf3.field_78795_f = 0.0F;
/* 179 */       this.tailf4.field_78795_f = 0.0F;
/* 180 */       this.tailf5.field_78795_f = 0.0F;
/* 181 */       this.tailf6.field_78795_f = 0.0F;
/* 182 */       this.tailf7.field_78795_f = 0.0F;
/* 183 */       this.tailf1.field_78808_h = 0.0F;
/* 184 */       this.tailf2.field_78808_h = 0.0F;
/* 185 */       this.tailf3.field_78808_h = 0.0F;
/* 186 */       this.tailf4.field_78808_h = 0.0F;
/* 187 */       this.tailf5.field_78808_h = 0.0F;
/* 188 */       this.tailf6.field_78808_h = 0.0F;
/*     */     } 
/*     */     
/* 191 */     this.lleg.func_78785_a(f5);
/* 192 */     this.rleg.func_78785_a(f5);
/* 193 */     this.body.func_78785_a(f5);
/* 194 */     this.neck.func_78785_a(f5);
/* 195 */     this.head1.func_78785_a(f5);
/* 196 */     this.head2.func_78785_a(f5);
/* 197 */     this.hf1.func_78785_a(f5);
/* 198 */     this.hf2.func_78785_a(f5);
/* 199 */     this.hf3.func_78785_a(f5);
/* 200 */     this.tailf1.func_78785_a(f5);
/* 201 */     this.tailf2.func_78785_a(f5);
/* 202 */     this.tailf3.func_78785_a(f5);
/* 203 */     this.tailf4.func_78785_a(f5);
/* 204 */     this.tailf5.func_78785_a(f5);
/* 205 */     this.tailf6.func_78785_a(f5);
/* 206 */     this.tailf7.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 212 */     model.field_78795_f = x;
/* 213 */     model.field_78796_g = y;
/* 214 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 219 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelPeacock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */