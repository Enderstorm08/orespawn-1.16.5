/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelLeafMonster
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer body;
/*     */   ModelRenderer larm;
/*     */   ModelRenderer rarm;
/*     */   ModelRenderer lleg;
/*     */   ModelRenderer rleg;
/*     */   
/*     */   public ModelLeafMonster() {
/*  19 */     this.field_78090_t = 128;
/*  20 */     this.field_78089_u = 128;
/*     */     
/*  22 */     this.body = new ModelRenderer(this, 32, 32);
/*  23 */     this.body.func_78789_a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
/*  24 */     this.body.func_78793_a(0.0F, 0.0F, 0.0F);
/*  25 */     this.body.func_78787_b(64, 32);
/*  26 */     this.body.field_78809_i = true;
/*  27 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  28 */     this.larm = new ModelRenderer(this, 64, 0);
/*  29 */     this.larm.func_78789_a(0.0F, -16.0F, -8.0F, 16, 16, 16);
/*  30 */     this.larm.func_78793_a(8.0F, -8.0F, 0.0F);
/*  31 */     this.larm.func_78787_b(64, 32);
/*  32 */     this.larm.field_78809_i = true;
/*  33 */     setRotation(this.larm, 0.0F, 0.0F, 0.0F);
/*  34 */     this.rarm = new ModelRenderer(this, 0, 0);
/*  35 */     this.rarm.func_78789_a(-16.0F, -16.0F, -8.0F, 16, 16, 16);
/*  36 */     this.rarm.func_78793_a(-8.0F, -8.0F, 0.0F);
/*  37 */     this.rarm.func_78787_b(64, 32);
/*  38 */     this.rarm.field_78809_i = true;
/*  39 */     setRotation(this.rarm, 0.0F, 0.0F, 0.0F);
/*  40 */     this.lleg = new ModelRenderer(this, 64, 64);
/*  41 */     this.lleg.func_78789_a(0.0F, 0.0F, -8.0F, 16, 16, 16);
/*  42 */     this.lleg.func_78793_a(8.0F, 8.0F, 0.0F);
/*  43 */     this.lleg.func_78787_b(64, 32);
/*  44 */     this.lleg.field_78809_i = true;
/*  45 */     setRotation(this.lleg, 0.0F, 0.0F, 0.0F);
/*  46 */     this.rleg = new ModelRenderer(this, 0, 64);
/*  47 */     this.rleg.func_78789_a(-16.0F, 0.0F, -8.0F, 16, 16, 16);
/*  48 */     this.rleg.func_78793_a(-8.0F, 8.0F, 0.0F);
/*  49 */     this.rleg.func_78787_b(64, 32);
/*  50 */     this.rleg.field_78809_i = true;
/*  51 */     setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  57 */     LeafMonster lm = (LeafMonster)entity;
/*  58 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  59 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/*  61 */     if (lm.getAttacking() == 0) {
/*  62 */       this.body.field_78797_d = 16.0F;
/*  63 */       this.rarm.field_78797_d = 8.0F;
/*  64 */       this.larm.field_78797_d = 8.0F;
/*  65 */       this.rarm.field_78796_g = 0.0F;
/*  66 */       this.larm.field_78796_g = 0.0F;
/*  67 */       this.rarm.field_78795_f = 0.0F;
/*  68 */       this.larm.field_78795_f = 0.0F;
/*  69 */       this.lleg.field_78795_f = 0.0F;
/*  70 */       this.rleg.field_78795_f = 0.0F;
/*     */     } else {
/*  72 */       this.body.field_78797_d = 0.0F;
/*  73 */       this.rarm.field_78797_d = -8.0F;
/*  74 */       this.larm.field_78797_d = -8.0F;
/*  75 */       if (f1 > 0.1D) {
/*  76 */         newangle = MathHelper.func_76134_b(f2 * 0.95F) * 3.1415927F * 0.25F * f1;
/*     */       } else {
/*  78 */         newangle = 0.0F;
/*     */       } 
/*  80 */       this.lleg.field_78795_f = newangle;
/*  81 */       this.rleg.field_78795_f = -newangle;
/*     */       
/*  83 */       float newangle = MathHelper.func_76134_b(f2 * 0.7F) * 3.1415927F * 0.55F;
/*  84 */       this.rarm.field_78796_g = -Math.abs(newangle);
/*  85 */       this.larm.field_78796_g = Math.abs(newangle);
/*  86 */       this.rarm.field_78795_f = -Math.abs(newangle);
/*  87 */       this.larm.field_78795_f = -Math.abs(newangle);
/*     */     } 
/*     */     
/*  90 */     this.body.func_78785_a(f5);
/*  91 */     this.larm.func_78785_a(f5);
/*  92 */     this.rarm.func_78785_a(f5);
/*  93 */     this.lleg.func_78785_a(f5);
/*  94 */     this.rleg.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 100 */     model.field_78795_f = x;
/* 101 */     model.field_78796_g = y;
/* 102 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 107 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelLeafMonster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */