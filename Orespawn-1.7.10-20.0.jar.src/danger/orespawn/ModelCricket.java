/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelCricket
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer head;
/*     */   
/*     */   ModelRenderer abdomen;
/*     */   ModelRenderer lfleg;
/*     */   ModelRenderer lrleg;
/*     */   ModelRenderer rfleg;
/*     */   ModelRenderer rrleg;
/*     */   ModelRenderer lleg1;
/*     */   ModelRenderer rleg1;
/*     */   ModelRenderer lleg2;
/*     */   ModelRenderer rleg2;
/*     */   
/*     */   public ModelCricket(float f1) {
/*  28 */     this.wingspeed = f1;
/*     */     
/*  30 */     this.field_78090_t = 64;
/*  31 */     this.field_78089_u = 64;
/*     */     
/*  33 */     this.body = new ModelRenderer(this, 0, 25);
/*  34 */     this.body.func_78789_a(-1.0F, -1.0F, -3.0F, 3, 3, 6);
/*  35 */     this.body.func_78793_a(0.0F, 21.0F, 0.0F);
/*  36 */     this.body.func_78787_b(64, 64);
/*  37 */     this.body.field_78809_i = true;
/*  38 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  39 */     this.head = new ModelRenderer(this, 0, 17);
/*  40 */     this.head.func_78789_a(-1.0F, -2.0F, -1.0F, 3, 4, 3);
/*  41 */     this.head.func_78793_a(0.0F, 21.0F, -5.0F);
/*  42 */     this.head.func_78787_b(64, 64);
/*  43 */     this.head.field_78809_i = true;
/*  44 */     setRotation(this.head, -0.1745329F, 0.0F, 0.0F);
/*  45 */     this.abdomen = new ModelRenderer(this, 0, 36);
/*  46 */     this.abdomen.func_78789_a(-0.5F, -1.0F, 3.0F, 2, 2, 3);
/*  47 */     this.abdomen.func_78793_a(0.0F, 21.0F, 0.0F);
/*  48 */     this.abdomen.func_78787_b(64, 64);
/*  49 */     this.abdomen.field_78809_i = true;
/*  50 */     setRotation(this.abdomen, 0.0F, 0.0F, 0.0F);
/*  51 */     this.lfleg = new ModelRenderer(this, 25, 0);
/*  52 */     this.lfleg.func_78789_a(2.0F, 0.0F, 0.0F, 5, 1, 1);
/*  53 */     this.lfleg.func_78793_a(0.0F, 21.0F, -2.0F);
/*  54 */     this.lfleg.func_78787_b(64, 64);
/*  55 */     this.lfleg.field_78809_i = true;
/*  56 */     setRotation(this.lfleg, 0.0F, 0.4712389F, 0.418879F);
/*  57 */     this.lrleg = new ModelRenderer(this, 23, 4);
/*  58 */     this.lrleg.func_78789_a(1.0F, 0.0F, -2.0F, 6, 1, 1);
/*  59 */     this.lrleg.func_78793_a(0.0F, 21.0F, 0.0F);
/*  60 */     this.lrleg.func_78787_b(64, 64);
/*  61 */     this.lrleg.field_78809_i = true;
/*  62 */     setRotation(this.lrleg, 0.0F, -0.296706F, 0.418879F);
/*  63 */     this.rfleg = new ModelRenderer(this, 25, 8);
/*  64 */     this.rfleg.func_78789_a(-7.0F, 0.0F, 0.0F, 5, 1, 1);
/*  65 */     this.rfleg.func_78793_a(1.0F, 21.0F, -2.0F);
/*  66 */     this.rfleg.func_78787_b(64, 64);
/*  67 */     this.rfleg.field_78809_i = true;
/*  68 */     setRotation(this.rfleg, 0.0F, -0.5410521F, -0.4363323F);
/*  69 */     this.rrleg = new ModelRenderer(this, 25, 12);
/*  70 */     this.rrleg.func_78789_a(-7.0F, -1.0F, 0.0F, 5, 1, 1);
/*  71 */     this.rrleg.func_78793_a(1.0F, 22.0F, -2.0F);
/*  72 */     this.rrleg.func_78787_b(64, 64);
/*  73 */     this.rrleg.field_78809_i = true;
/*  74 */     setRotation(this.rrleg, 0.0F, 0.3839724F, -0.418879F);
/*  75 */     this.lleg1 = new ModelRenderer(this, 40, 0);
/*  76 */     this.lleg1.func_78789_a(-1.0F, -1.0F, 0.0F, 1, 2, 8);
/*  77 */     this.lleg1.func_78793_a(2.0F, 22.0F, 0.0F);
/*  78 */     this.lleg1.func_78787_b(64, 64);
/*  79 */     this.lleg1.field_78809_i = true;
/*  80 */     setRotation(this.lleg1, 0.5585054F, 0.4363323F, 0.0F);
/*  81 */     this.rleg1 = new ModelRenderer(this, 40, 11);
/*  82 */     this.rleg1.func_78789_a(0.0F, -1.0F, 0.0F, 1, 2, 8);
/*  83 */     this.rleg1.func_78793_a(-1.0F, 22.0F, 0.0F);
/*  84 */     this.rleg1.func_78787_b(64, 64);
/*  85 */     this.rleg1.field_78809_i = true;
/*  86 */     setRotation(this.rleg1, 0.5585054F, -0.4363323F, 0.0F);
/*  87 */     this.lleg2 = new ModelRenderer(this, 21, 23);
/*  88 */     this.lleg2.func_78789_a(-0.5F, -6.5F, 4.5F, 1, 1, 8);
/*  89 */     this.lleg2.func_78793_a(2.0F, 22.0F, 0.0F);
/*  90 */     this.lleg2.func_78787_b(64, 64);
/*  91 */     this.lleg2.field_78809_i = true;
/*  92 */     setRotation(this.lleg2, -0.3665191F, 0.3490659F, 0.0F);
/*  93 */     this.rleg2 = new ModelRenderer(this, 21, 34);
/*  94 */     this.rleg2.func_78789_a(-0.5F, -6.5F, 4.0F, 1, 1, 8);
/*  95 */     this.rleg2.func_78793_a(-1.0F, 22.0F, 0.0F);
/*  96 */     this.rleg2.func_78787_b(64, 64);
/*  97 */     this.rleg2.field_78809_i = true;
/*  98 */     setRotation(this.rleg2, -0.3665191F, -0.3490659F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 104 */     Cricket c = (Cricket)entity;
/* 105 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 106 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 107 */     float newangle = 0.0F;
/*     */     
/* 109 */     if (f1 > 0.1D) {
/* 110 */       newangle = MathHelper.func_76134_b(f2 * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*     */     } else {
/* 112 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 115 */     this.lfleg.field_78796_g = 0.47F + newangle;
/* 116 */     this.rfleg.field_78796_g = -0.54F + newangle;
/* 117 */     this.lrleg.field_78796_g = -0.296F - newangle;
/* 118 */     this.rrleg.field_78796_g = 0.384F - newangle;
/*     */     
/* 120 */     if (c.getSinging() != 0) {
/* 121 */       newangle = MathHelper.func_76134_b(f2 * 3.0F * this.wingspeed) * 3.1415927F * 0.25F;
/* 122 */       this.lleg1.field_78796_g = -0.035F;
/* 123 */       this.lleg2.field_78796_g = -0.105F;
/* 124 */       this.rleg1.field_78796_g = 0.035F;
/* 125 */       this.rleg2.field_78796_g = 0.105F;
/*     */     } else {
/* 127 */       newangle = 0.0F;
/* 128 */       this.lleg1.field_78796_g = 0.436F;
/* 129 */       this.lleg2.field_78796_g = 0.349F;
/* 130 */       this.rleg1.field_78796_g = -0.436F;
/* 131 */       this.rleg2.field_78796_g = -0.349F;
/*     */     } 
/* 133 */     this.lleg1.field_78795_f = newangle + 0.558F;
/* 134 */     this.lleg2.field_78795_f = newangle - 0.366F;
/* 135 */     this.rleg1.field_78795_f = -newangle + 0.558F;
/* 136 */     this.rleg2.field_78795_f = -newangle - 0.366F;
/*     */     
/* 138 */     this.body.func_78785_a(f5);
/* 139 */     this.head.func_78785_a(f5);
/* 140 */     this.abdomen.func_78785_a(f5);
/* 141 */     this.lfleg.func_78785_a(f5);
/* 142 */     this.lrleg.func_78785_a(f5);
/* 143 */     this.rfleg.func_78785_a(f5);
/* 144 */     this.rrleg.func_78785_a(f5);
/* 145 */     this.lleg1.func_78785_a(f5);
/* 146 */     this.rleg1.func_78785_a(f5);
/* 147 */     this.lleg2.func_78785_a(f5);
/* 148 */     this.rleg2.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 154 */     model.field_78795_f = x;
/* 155 */     model.field_78796_g = y;
/* 156 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 161 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCricket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */