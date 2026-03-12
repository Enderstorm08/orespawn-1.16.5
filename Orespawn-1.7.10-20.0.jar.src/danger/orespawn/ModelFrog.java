/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelFrog
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer body;
/*     */   
/*     */   ModelRenderer jaw;
/*     */   
/*     */   ModelRenderer lfleg;
/*     */   ModelRenderer rfleg;
/*     */   ModelRenderer lleg1;
/*     */   ModelRenderer rleg1;
/*     */   ModelRenderer lleg2;
/*     */   ModelRenderer rleg2;
/*     */   ModelRenderer leye;
/*     */   ModelRenderer reye;
/*     */   
/*     */   public ModelFrog(float f1) {
/*  27 */     this.wingspeed = f1;
/*     */     
/*  29 */     this.field_78090_t = 64;
/*  30 */     this.field_78089_u = 64;
/*     */     
/*  32 */     this.body = new ModelRenderer(this, 41, 0);
/*  33 */     this.body.func_78789_a(-4.0F, -10.0F, 0.0F, 8, 11, 2);
/*  34 */     this.body.func_78793_a(0.0F, 24.0F, 2.0F);
/*  35 */     this.body.func_78787_b(64, 64);
/*  36 */     this.body.field_78809_i = true;
/*  37 */     setRotation(this.body, 0.7330383F, 0.0F, 0.0F);
/*  38 */     this.jaw = new ModelRenderer(this, 42, 15);
/*  39 */     this.jaw.func_78789_a(-4.0F, -8.0F, 0.0F, 8, 8, 1);
/*  40 */     this.jaw.func_78793_a(0.0F, 24.0F, 2.0F);
/*  41 */     this.jaw.func_78787_b(64, 64);
/*  42 */     this.jaw.field_78809_i = true;
/*  43 */     setRotation(this.jaw, 1.22173F, 0.0F, 0.0F);
/*  44 */     this.lfleg = new ModelRenderer(this, 14, 0);
/*  45 */     this.lfleg.func_78789_a(0.0F, 0.0F, 0.0F, 1, 5, 1);
/*  46 */     this.lfleg.func_78793_a(3.0F, 20.0F, 0.0F);
/*  47 */     this.lfleg.func_78787_b(64, 64);
/*  48 */     this.lfleg.field_78809_i = true;
/*  49 */     setRotation(this.lfleg, -0.5235988F, 0.0F, -0.4712389F);
/*  50 */     this.rfleg = new ModelRenderer(this, 20, 0);
/*  51 */     this.rfleg.func_78789_a(-1.0F, 0.0F, 0.0F, 1, 5, 1);
/*  52 */     this.rfleg.func_78793_a(-3.0F, 20.0F, 0.0F);
/*  53 */     this.rfleg.func_78787_b(64, 64);
/*  54 */     this.rfleg.field_78809_i = true;
/*  55 */     setRotation(this.rfleg, -0.5235988F, 0.0F, 0.4712389F);
/*  56 */     this.lleg1 = new ModelRenderer(this, 10, 8);
/*  57 */     this.lleg1.func_78789_a(0.0F, -9.0F, -1.0F, 1, 9, 2);
/*  58 */     this.lleg1.func_78793_a(3.0F, 24.0F, 3.0F);
/*  59 */     this.lleg1.func_78787_b(64, 64);
/*  60 */     this.lleg1.field_78809_i = true;
/*  61 */     setRotation(this.lleg1, 0.0F, 0.0F, 0.2268928F);
/*  62 */     this.rleg1 = new ModelRenderer(this, 18, 8);
/*  63 */     this.rleg1.func_78789_a(-1.0F, -9.0F, -1.0F, 1, 9, 2);
/*  64 */     this.rleg1.func_78793_a(-3.0F, 24.0F, 3.0F);
/*  65 */     this.rleg1.func_78787_b(64, 64);
/*  66 */     this.rleg1.field_78809_i = true;
/*  67 */     setRotation(this.rleg1, 0.0F, 0.0F, -0.2268928F);
/*  68 */     this.lleg2 = new ModelRenderer(this, 11, 20);
/*  69 */     this.lleg2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 10, 1);
/*  70 */     this.lleg2.func_78793_a(5.0F, 15.0F, 3.0F);
/*  71 */     this.lleg2.func_78787_b(64, 64);
/*  72 */     this.lleg2.field_78809_i = true;
/*  73 */     setRotation(this.lleg2, 0.0F, 0.0F, -0.3839724F);
/*  74 */     this.rleg2 = new ModelRenderer(this, 19, 20);
/*  75 */     this.rleg2.func_78789_a(-1.0F, 0.0F, 0.0F, 1, 10, 1);
/*  76 */     this.rleg2.func_78793_a(-5.0F, 15.0F, 3.0F);
/*  77 */     this.rleg2.func_78787_b(64, 64);
/*  78 */     this.rleg2.field_78809_i = true;
/*  79 */     setRotation(this.rleg2, 0.0F, 0.0F, 0.3839724F);
/*  80 */     this.leye = new ModelRenderer(this, 0, 8);
/*  81 */     this.leye.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/*  82 */     this.leye.func_78793_a(2.0F, 17.0F, -2.0F);
/*  83 */     this.leye.func_78787_b(64, 64);
/*  84 */     this.leye.field_78809_i = true;
/*  85 */     setRotation(this.leye, 0.7330383F, 0.0F, 0.0F);
/*  86 */     this.reye = new ModelRenderer(this, 0, 4);
/*  87 */     this.reye.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/*  88 */     this.reye.func_78793_a(-3.0F, 17.0F, -2.0F);
/*  89 */     this.reye.func_78787_b(64, 64);
/*  90 */     this.reye.field_78809_i = true;
/*  91 */     setRotation(this.reye, 0.7330383F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  97 */     Frog c = (Frog)entity;
/*  98 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  99 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 100 */     float newangle = 0.0F;
/*     */     
/* 102 */     if (f1 > 0.1D) {
/* 103 */       newangle = MathHelper.func_76134_b(f2 * this.wingspeed * 1.4F) * 3.1415927F * 0.55F * f1;
/*     */     } else {
/* 105 */       newangle = 0.0F;
/*     */     } 
/* 107 */     this.lfleg.field_78796_g = newangle;
/* 108 */     this.rfleg.field_78796_g = -newangle;
/* 109 */     this.lleg2.field_78796_g = -newangle / 2.0F;
/* 110 */     this.rleg2.field_78796_g = newangle / 2.0F;
/*     */ 
/*     */     
/* 113 */     if (c.getSinging() != 0) {
/* 114 */       newangle = MathHelper.func_76134_b(f2 * 0.85F * this.wingspeed) * 3.1415927F * 0.15F;
/*     */     } else {
/* 116 */       newangle = 0.0F;
/*     */     } 
/* 118 */     this.jaw.field_78795_f = newangle + 1.22F;
/*     */     
/* 120 */     if (c.field_70181_x > 0.10000000149011612D || c.field_70181_x < -0.10000000149011612D) {
/* 121 */       this.lleg1.field_78808_h = 2.44F;
/* 122 */       this.rleg1.field_78808_h = -2.44F;
/*     */     } else {
/* 124 */       this.lleg1.field_78808_h = 0.227F;
/* 125 */       this.rleg1.field_78808_h = -0.227F;
/*     */     } 
/* 127 */     this.lleg1.field_78797_d -= (float)Math.cos(this.lleg1.field_78808_h) * 9.0F;
/* 128 */     this.lleg1.field_78800_c += (float)Math.sin(this.lleg1.field_78808_h) * 9.0F;
/*     */     
/* 130 */     this.rleg1.field_78797_d -= (float)Math.cos(this.rleg1.field_78808_h) * 9.0F;
/* 131 */     this.rleg1.field_78800_c += (float)Math.sin(this.rleg1.field_78808_h) * 9.0F;
/*     */     
/* 133 */     this.body.func_78785_a(f5);
/* 134 */     this.jaw.func_78785_a(f5);
/* 135 */     this.lfleg.func_78785_a(f5);
/* 136 */     this.rfleg.func_78785_a(f5);
/* 137 */     this.lleg1.func_78785_a(f5);
/* 138 */     this.rleg1.func_78785_a(f5);
/* 139 */     this.lleg2.func_78785_a(f5);
/* 140 */     this.rleg2.func_78785_a(f5);
/* 141 */     this.leye.func_78785_a(f5);
/* 142 */     this.reye.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 148 */     model.field_78795_f = x;
/* 149 */     model.field_78796_g = y;
/* 150 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 155 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelFrog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */