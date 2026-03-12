/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelBandP
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer belly;
/*     */   
/*     */   ModelRenderer chest;
/*     */   
/*     */   ModelRenderer head;
/*     */   ModelRenderer lleg;
/*     */   ModelRenderer rleg;
/*     */   ModelRenderer larm;
/*     */   ModelRenderer rarm;
/*     */   
/*     */   public ModelBandP(float f1) {
/*  24 */     this.wingspeed = f1;
/*     */     
/*  26 */     this.field_78090_t = 64;
/*  27 */     this.field_78089_u = 128;
/*     */     
/*  29 */     this.belly = new ModelRenderer(this, 0, 61);
/*  30 */     this.belly.func_78789_a(-8.0F, -5.0F, -7.0F, 16, 10, 16);
/*  31 */     this.belly.func_78793_a(0.0F, 12.0F, 0.0F);
/*  32 */     this.belly.func_78787_b(64, 32);
/*  33 */     this.belly.field_78809_i = true;
/*  34 */     setRotation(this.belly, 0.0698132F, 0.0F, 0.0F);
/*  35 */     this.chest = new ModelRenderer(this, 0, 42);
/*  36 */     this.chest.func_78789_a(-5.0F, -3.0F, -5.0F, 10, 6, 10);
/*  37 */     this.chest.func_78793_a(0.0F, 5.0F, 2.0F);
/*  38 */     this.chest.func_78787_b(64, 32);
/*  39 */     this.chest.field_78809_i = true;
/*  40 */     setRotation(this.chest, 0.0F, 0.0F, 0.0F);
/*  41 */     this.head = new ModelRenderer(this, 0, 11);
/*  42 */     this.head.func_78789_a(-3.0F, -5.0F, -3.0F, 6, 6, 6);
/*  43 */     this.head.func_78793_a(0.0F, 1.0F, 3.0F);
/*  44 */     this.head.func_78787_b(64, 32);
/*  45 */     this.head.field_78809_i = true;
/*  46 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  47 */     this.lleg = new ModelRenderer(this, 25, 90);
/*  48 */     this.lleg.func_78789_a(-2.0F, 0.0F, -3.0F, 6, 8, 6);
/*  49 */     this.lleg.func_78793_a(2.0F, 16.0F, 2.0F);
/*  50 */     this.lleg.func_78787_b(64, 32);
/*  51 */     this.lleg.field_78809_i = true;
/*  52 */     setRotation(this.lleg, 0.0F, 0.0F, 0.0F);
/*  53 */     this.rleg = new ModelRenderer(this, 0, 90);
/*  54 */     this.rleg.func_78789_a(-4.0F, 0.0F, -3.0F, 6, 8, 6);
/*  55 */     this.rleg.func_78793_a(-2.0F, 16.0F, 2.0F);
/*  56 */     this.rleg.func_78787_b(64, 32);
/*  57 */     this.rleg.field_78809_i = true;
/*  58 */     setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
/*  59 */     this.larm = new ModelRenderer(this, 0, 25);
/*  60 */     this.larm.func_78789_a(-1.0F, -1.0F, -2.0F, 4, 10, 4);
/*  61 */     this.larm.func_78793_a(6.0F, 4.0F, 3.0F);
/*  62 */     this.larm.func_78787_b(64, 32);
/*  63 */     this.larm.field_78809_i = true;
/*  64 */     setRotation(this.larm, 0.0F, 0.0F, -0.4886922F);
/*  65 */     this.rarm = new ModelRenderer(this, 18, 25);
/*  66 */     this.rarm.func_78789_a(-3.0F, -1.0F, -2.0F, 4, 10, 4);
/*  67 */     this.rarm.func_78793_a(-6.0F, 4.0F, 3.0F);
/*  68 */     this.rarm.func_78787_b(64, 32);
/*  69 */     this.rarm.field_78809_i = true;
/*  70 */     setRotation(this.rarm, 0.0F, 0.0F, 0.4886922F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  76 */     BandP e = (BandP)entity;
/*  77 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  78 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*  79 */     float newangle = 0.0F;
/*  80 */     float newangle2 = 0.0F;
/*  81 */     float newangle3 = 0.0F;
/*     */     
/*  83 */     if (f1 > 0.1D) {
/*  84 */       newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
/*  85 */       newangle2 = MathHelper.func_76134_b(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.025F * f1;
/*  86 */       newangle3 = newangle;
/*     */     } else {
/*  88 */       newangle = 0.0F;
/*  89 */       newangle2 = MathHelper.func_76134_b(f2 * 0.6F * this.wingspeed) * 3.1415927F * 0.005F;
/*  90 */       newangle3 = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.02F;
/*     */     } 
/*     */     
/*  93 */     this.lleg.field_78795_f = newangle;
/*  94 */     this.rleg.field_78795_f = -newangle;
/*  95 */     this.belly.field_78795_f = 0.07F + newangle2;
/*  96 */     this.larm.field_78795_f = -newangle3;
/*  97 */     this.rarm.field_78795_f = newangle3;
/*  98 */     this.belly.field_78796_g = -newangle / 2.0F;
/*     */     
/* 100 */     this.head.field_78796_g = (float)Math.toRadians(f3);
/* 101 */     this.head.field_78795_f = (float)Math.toRadians(f4);
/*     */     
/* 103 */     this.belly.func_78785_a(f5);
/* 104 */     this.chest.func_78785_a(f5);
/* 105 */     this.head.func_78785_a(f5);
/* 106 */     this.lleg.func_78785_a(f5);
/* 107 */     this.rleg.func_78785_a(f5);
/* 108 */     this.larm.func_78785_a(f5);
/* 109 */     this.rarm.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 115 */     model.field_78795_f = x;
/* 116 */     model.field_78796_g = y;
/* 117 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 122 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelBandP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */