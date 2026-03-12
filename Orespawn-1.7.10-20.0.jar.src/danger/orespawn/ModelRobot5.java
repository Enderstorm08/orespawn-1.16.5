/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ 
/*     */ 
/*     */ public class ModelRobot5
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer lwheel1;
/*     */   
/*     */   ModelRenderer lwheel2;
/*     */   ModelRenderer rwheel1;
/*     */   ModelRenderer rwheel2;
/*     */   ModelRenderer axle;
/*     */   ModelRenderer drivebox;
/*     */   ModelRenderer stand;
/*     */   ModelRenderer swivel;
/*     */   ModelRenderer barrel1;
/*     */   ModelRenderer barrel2;
/*     */   ModelRenderer ammobox;
/*     */   
/*     */   public ModelRobot5(float f1) {
/*  27 */     this.wingspeed = f1;
/*     */     
/*  29 */     this.field_78090_t = 128;
/*  30 */     this.field_78089_u = 128;
/*     */     
/*  32 */     this.lwheel1 = new ModelRenderer(this, 0, 23);
/*  33 */     this.lwheel1.func_78789_a(0.0F, -4.0F, -4.0F, 2, 8, 8);
/*  34 */     this.lwheel1.func_78793_a(6.0F, 19.0F, 0.0F);
/*  35 */     this.lwheel1.func_78787_b(128, 128);
/*  36 */     this.lwheel1.field_78809_i = true;
/*  37 */     setRotation(this.lwheel1, 0.0F, 0.0F, 0.0F);
/*  38 */     this.lwheel2 = new ModelRenderer(this, 0, 43);
/*  39 */     this.lwheel2.func_78789_a(0.0F, -4.0F, -4.0F, 2, 8, 8);
/*  40 */     this.lwheel2.func_78793_a(6.0F, 19.0F, 0.0F);
/*  41 */     this.lwheel2.func_78787_b(128, 128);
/*  42 */     this.lwheel2.field_78809_i = true;
/*  43 */     setRotation(this.lwheel2, 0.7853982F, 0.0F, 0.0F);
/*  44 */     this.rwheel1 = new ModelRenderer(this, 0, 23);
/*  45 */     this.rwheel1.func_78789_a(0.0F, -4.0F, -4.0F, 2, 8, 8);
/*  46 */     this.rwheel1.func_78793_a(-8.0F, 19.0F, 0.0F);
/*  47 */     this.rwheel1.func_78787_b(128, 128);
/*  48 */     this.rwheel1.field_78809_i = true;
/*  49 */     setRotation(this.rwheel1, 0.0F, 0.0F, 0.0F);
/*  50 */     this.rwheel2 = new ModelRenderer(this, 0, 43);
/*  51 */     this.rwheel2.func_78789_a(0.0F, -4.0F, -4.0F, 2, 8, 8);
/*  52 */     this.rwheel2.func_78793_a(-8.0F, 19.0F, 0.0F);
/*  53 */     this.rwheel2.func_78787_b(128, 128);
/*  54 */     this.rwheel2.field_78809_i = true;
/*  55 */     setRotation(this.rwheel2, 0.7853982F, 0.0F, 0.0F);
/*  56 */     this.axle = new ModelRenderer(this, 42, 0);
/*  57 */     this.axle.func_78789_a(-6.0F, -0.5F, -0.5F, 12, 1, 1);
/*  58 */     this.axle.func_78793_a(0.0F, 19.0F, 0.0F);
/*  59 */     this.axle.func_78787_b(128, 128);
/*  60 */     this.axle.field_78809_i = true;
/*  61 */     setRotation(this.axle, 0.0F, 0.0F, 0.0F);
/*  62 */     this.drivebox = new ModelRenderer(this, 47, 4);
/*  63 */     this.drivebox.func_78789_a(-2.0F, -1.5F, -1.5F, 4, 3, 3);
/*  64 */     this.drivebox.func_78793_a(0.0F, 19.0F, 0.0F);
/*  65 */     this.drivebox.func_78787_b(128, 128);
/*  66 */     this.drivebox.field_78809_i = true;
/*  67 */     setRotation(this.drivebox, 0.0F, 0.0F, 0.0F);
/*  68 */     this.stand = new ModelRenderer(this, 35, 0);
/*  69 */     this.stand.func_78789_a(-0.5F, 0.0F, -0.5F, 1, 18, 1);
/*  70 */     this.stand.func_78793_a(0.0F, 0.0F, 0.0F);
/*  71 */     this.stand.func_78787_b(128, 128);
/*  72 */     this.stand.field_78809_i = true;
/*  73 */     setRotation(this.stand, 0.0F, 0.0F, 0.0F);
/*  74 */     this.swivel = new ModelRenderer(this, 22, 0);
/*  75 */     this.swivel.func_78789_a(-1.0F, 0.0F, -1.0F, 2, 1, 2);
/*  76 */     this.swivel.func_78793_a(0.0F, 0.0F, 0.0F);
/*  77 */     this.swivel.func_78787_b(128, 128);
/*  78 */     this.swivel.field_78809_i = true;
/*  79 */     setRotation(this.swivel, 0.0F, 0.0F, 0.0F);
/*  80 */     this.barrel1 = new ModelRenderer(this, 24, 25);
/*  81 */     this.barrel1.func_78789_a(-1.0F, -2.0F, -10.0F, 2, 2, 13);
/*  82 */     this.barrel1.func_78793_a(0.0F, 0.0F, 0.0F);
/*  83 */     this.barrel1.func_78787_b(128, 128);
/*  84 */     this.barrel1.field_78809_i = true;
/*  85 */     setRotation(this.barrel1, 0.0F, 0.0F, 0.0F);
/*  86 */     this.barrel2 = new ModelRenderer(this, 27, 43);
/*  87 */     this.barrel2.func_78789_a(-0.5F, -1.5F, -19.0F, 1, 1, 9);
/*  88 */     this.barrel2.func_78793_a(0.0F, 0.0F, 0.0F);
/*  89 */     this.barrel2.func_78787_b(128, 128);
/*  90 */     this.barrel2.field_78809_i = true;
/*  91 */     setRotation(this.barrel2, 0.0F, 0.0F, 0.0F);
/*  92 */     this.ammobox = new ModelRenderer(this, 0, 0);
/*  93 */     this.ammobox.func_78789_a(-2.0F, -2.0F, 3.0F, 4, 3, 5);
/*  94 */     this.ammobox.func_78793_a(0.0F, 0.0F, 0.0F);
/*  95 */     this.ammobox.func_78787_b(128, 128);
/*  96 */     this.ammobox.field_78809_i = true;
/*  97 */     setRotation(this.ammobox, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 103 */     Robot5 e = (Robot5)entity;
/*     */     
/* 105 */     float newangle = 0.0F;
/*     */     
/* 107 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 108 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 111 */     if (f1 > 0.1D) {
/* 112 */       newangle = f2 * 0.15F % 6.2831855F;
/* 113 */       newangle = Math.abs(newangle);
/*     */     } else {
/* 115 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 118 */     this.lwheel1.field_78795_f = newangle;
/* 119 */     this.lwheel2.field_78795_f = (float)(newangle + 0.7853981633974483D);
/* 120 */     this.rwheel1.field_78795_f = newangle;
/* 121 */     this.rwheel2.field_78795_f = (float)(newangle + 0.7853981633974483D);
/*     */     
/* 123 */     this.ammobox.field_78796_g = (float)Math.toRadians(f3 / 2.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 128 */     this.lwheel1.func_78785_a(f5);
/* 129 */     this.lwheel2.func_78785_a(f5);
/* 130 */     this.rwheel1.func_78785_a(f5);
/* 131 */     this.rwheel2.func_78785_a(f5);
/* 132 */     this.axle.func_78785_a(f5);
/* 133 */     this.drivebox.func_78785_a(f5);
/* 134 */     this.stand.func_78785_a(f5);
/* 135 */     this.swivel.func_78785_a(f5);
/* 136 */     this.barrel1.func_78785_a(f5);
/* 137 */     this.barrel2.func_78785_a(f5);
/* 138 */     this.ammobox.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 145 */     model.field_78795_f = x;
/* 146 */     model.field_78796_g = y;
/* 147 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 152 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelRobot5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */