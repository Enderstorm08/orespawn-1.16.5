/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelRobot2
/*     */   extends ModelBase
/*     */ {
/*  12 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer rleg1;
/*     */   
/*     */   ModelRenderer rleg2;
/*     */   
/*     */   ModelRenderer Shape3;
/*     */   ModelRenderer lleg2;
/*     */   ModelRenderer lleg1;
/*     */   ModelRenderer Shape6;
/*     */   ModelRenderer Shape7;
/*     */   ModelRenderer Shape8;
/*     */   ModelRenderer rarm3;
/*     */   ModelRenderer rarm2;
/*     */   ModelRenderer rarm1;
/*     */   ModelRenderer larm3;
/*     */   ModelRenderer larm2;
/*     */   ModelRenderer larm1;
/*     */   ModelRenderer head;
/*     */   
/*     */   public ModelRobot2(float f1) {
/*  33 */     this.wingspeed = f1;
/*     */     
/*  35 */     this.field_78090_t = 256;
/*  36 */     this.field_78089_u = 512;
/*     */     
/*  38 */     this.rleg1 = new ModelRenderer(this, 10, 250);
/*  39 */     this.rleg1.func_78789_a(-14.0F, 24.0F, -7.0F, 16, 24, 16);
/*  40 */     this.rleg1.func_78793_a(-10.0F, -24.0F, 0.0F);
/*  41 */     this.rleg1.func_78787_b(256, 512);
/*  42 */     this.rleg1.field_78809_i = true;
/*  43 */     setRotation(this.rleg1, 0.0F, 0.0F, 0.0F);
/*  44 */     this.rleg2 = new ModelRenderer(this, 10, 150);
/*  45 */     this.rleg2.func_78789_a(-12.0F, 0.0F, -6.0F, 12, 24, 12);
/*  46 */     this.rleg2.func_78793_a(-10.0F, -24.0F, 1.0F);
/*  47 */     this.rleg2.func_78787_b(256, 512);
/*  48 */     this.rleg2.field_78809_i = true;
/*  49 */     setRotation(this.rleg2, 0.0F, 0.0F, 0.0F);
/*  50 */     this.Shape3 = new ModelRenderer(this, 10, 50);
/*  51 */     this.Shape3.func_78789_a(-4.0F, 0.0F, -2.0F, 26, 8, 12);
/*  52 */     this.Shape3.func_78793_a(-9.0F, -32.0F, -3.0F);
/*  53 */     this.Shape3.func_78787_b(256, 512);
/*  54 */     this.Shape3.field_78809_i = true;
/*  55 */     setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
/*  56 */     this.lleg2 = new ModelRenderer(this, 10, 200);
/*  57 */     this.lleg2.func_78789_a(0.0F, 0.0F, -6.0F, 12, 24, 12);
/*  58 */     this.lleg2.func_78793_a(10.0F, -24.0F, 1.0F);
/*  59 */     this.lleg2.func_78787_b(256, 512);
/*  60 */     this.lleg2.field_78809_i = true;
/*  61 */     setRotation(this.lleg2, 0.0F, 0.0F, 0.0F);
/*  62 */     this.lleg1 = new ModelRenderer(this, 10, 300);
/*  63 */     this.lleg1.func_78789_a(-2.0F, 24.0F, -7.0F, 16, 24, 16);
/*  64 */     this.lleg1.func_78793_a(10.0F, -24.0F, 0.0F);
/*  65 */     this.lleg1.func_78787_b(256, 512);
/*  66 */     this.lleg1.field_78809_i = true;
/*  67 */     setRotation(this.lleg1, 0.0F, 0.0F, 0.0F);
/*  68 */     this.Shape6 = new ModelRenderer(this, 10, 100);
/*  69 */     this.Shape6.func_78789_a(-4.0F, -8.0F, -3.0F, 8, 8, 8);
/*  70 */     this.Shape6.func_78793_a(0.0F, -32.0F, 0.0F);
/*  71 */     this.Shape6.func_78787_b(256, 512);
/*  72 */     this.Shape6.field_78809_i = true;
/*  73 */     setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
/*  74 */     this.Shape7 = new ModelRenderer(this, 10, 350);
/*  75 */     this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 26, 8, 12);
/*  76 */     this.Shape7.func_78793_a(-13.0F, -48.0F, -5.0F);
/*  77 */     this.Shape7.func_78787_b(256, 512);
/*  78 */     this.Shape7.field_78809_i = true;
/*  79 */     setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
/*  80 */     this.Shape8 = new ModelRenderer(this, 16, 400);
/*  81 */     this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 44, 18, 14);
/*  82 */     this.Shape8.func_78793_a(-22.0F, -66.0F, -6.0F);
/*  83 */     this.Shape8.func_78787_b(256, 512);
/*  84 */     this.Shape8.field_78809_i = true;
/*  85 */     setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
/*  86 */     this.rarm3 = new ModelRenderer(this, 100, 100);
/*  87 */     this.rarm3.func_78789_a(-16.0F, -16.0F, -7.0F, 16, 24, 17);
/*  88 */     this.rarm3.func_78793_a(-22.0F, -58.0F, 0.0F);
/*  89 */     this.rarm3.func_78787_b(256, 512);
/*  90 */     this.rarm3.field_78809_i = true;
/*  91 */     setRotation(this.rarm3, 0.0F, 0.0F, 0.0F);
/*  92 */     this.rarm2 = new ModelRenderer(this, 100, 200);
/*  93 */     this.rarm2.func_78789_a(-14.0F, 8.0F, -5.0F, 12, 24, 12);
/*  94 */     this.rarm2.func_78793_a(-22.0F, -58.0F, 0.0F);
/*  95 */     this.rarm2.func_78787_b(256, 512);
/*  96 */     this.rarm2.field_78809_i = true;
/*  97 */     setRotation(this.rarm2, 0.0F, 0.0F, 0.0F);
/*  98 */     this.rarm1 = new ModelRenderer(this, 100, 300);
/*  99 */     this.rarm1.func_78789_a(-14.0F, 32.0F, -5.0F, 12, 24, 12);
/* 100 */     this.rarm1.func_78793_a(-22.0F, -58.0F, 0.0F);
/* 101 */     this.rarm1.func_78787_b(256, 512);
/* 102 */     this.rarm1.field_78809_i = true;
/* 103 */     setRotation(this.rarm1, 0.0F, 0.0F, 0.0F);
/* 104 */     this.larm3 = new ModelRenderer(this, 100, 50);
/* 105 */     this.larm3.func_78789_a(0.0F, -16.0F, -7.0F, 16, 24, 17);
/* 106 */     this.larm3.func_78793_a(22.0F, -58.0F, 0.0F);
/* 107 */     this.larm3.func_78787_b(256, 512);
/* 108 */     this.larm3.field_78809_i = true;
/* 109 */     setRotation(this.larm3, 0.0F, 0.0F, 0.0F);
/* 110 */     this.larm2 = new ModelRenderer(this, 100, 150);
/* 111 */     this.larm2.func_78789_a(2.0F, 8.0F, -5.0F, 12, 24, 12);
/* 112 */     this.larm2.func_78793_a(21.0F, -58.0F, 0.0F);
/* 113 */     this.larm2.func_78787_b(256, 512);
/* 114 */     this.larm2.field_78809_i = true;
/* 115 */     setRotation(this.larm2, 0.0F, 0.0F, 0.0F);
/* 116 */     this.larm1 = new ModelRenderer(this, 100, 250);
/* 117 */     this.larm1.func_78789_a(2.0F, 32.0F, -5.0F, 12, 24, 12);
/* 118 */     this.larm1.func_78793_a(21.0F, -58.0F, 0.0F);
/* 119 */     this.larm1.func_78787_b(256, 512);
/* 120 */     this.larm1.field_78809_i = true;
/* 121 */     setRotation(this.larm1, 0.0F, 0.0F, 0.0F);
/* 122 */     this.head = new ModelRenderer(this, 50, 10);
/* 123 */     this.head.func_78789_a(-7.0F, -12.0F, -5.0F, 15, 12, 10);
/* 124 */     this.head.func_78793_a(0.0F, -66.0F, 1.0F);
/* 125 */     this.head.func_78787_b(256, 512);
/* 126 */     this.head.field_78809_i = true;
/* 127 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 134 */     Robot2 e = (Robot2)entity;
/* 135 */     RenderInfo r = null;
/*     */     
/* 137 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 138 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */ 
/*     */     
/* 141 */     if (f1 > 0.1D) {
/* 142 */       newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/*     */     } else {
/* 144 */       newangle = 0.0F;
/*     */     } 
/*     */     
/* 147 */     this.lleg1.field_78795_f = newangle;
/* 148 */     this.lleg2.field_78795_f = newangle;
/* 149 */     this.rleg1.field_78795_f = -newangle;
/* 150 */     this.rleg2.field_78795_f = -newangle;
/*     */     
/* 152 */     this.head.field_78796_g = (float)Math.toRadians(f3);
/*     */     
/* 154 */     float newangle = MathHelper.func_76126_a((float)Math.toRadians((f2 * 20.0F * this.wingspeed)));
/* 155 */     float nextangle = MathHelper.func_76126_a((float)Math.toRadians((f2 * 20.0F * this.wingspeed + 1.5F)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     r = e.getRenderInfo();
/*     */     
/* 162 */     if (nextangle > 0.0F && newangle < 0.0F) {
/*     */       
/* 164 */       r.ri1 = 0;
/* 165 */       if (e.getAttacking() == 0) {
/* 166 */         r.ri1 = 0;
/*     */       } else {
/* 168 */         for (; r.ri1 == 0; r.ri1 = e.field_70170_p.field_73012_v.nextInt(4));
/*     */       } 
/*     */     } 
/*     */     
/* 172 */     newangle = (float)Math.toRadians((f2 * 20.0F * this.wingspeed));
/*     */     
/* 174 */     if (r.ri1 == 1 || r.ri1 == 3) {
/* 175 */       this.rarm1.field_78795_f = newangle;
/* 176 */       this.rarm2.field_78795_f = newangle;
/* 177 */       this.rarm3.field_78795_f = newangle;
/*     */     } else {
/* 179 */       this.rarm1.field_78795_f = 0.0F;
/* 180 */       this.rarm2.field_78795_f = 0.0F;
/* 181 */       this.rarm3.field_78795_f = 0.0F;
/*     */     } 
/* 183 */     if (r.ri1 == 2 || r.ri1 == 3) {
/* 184 */       this.larm1.field_78795_f = newangle;
/* 185 */       this.larm2.field_78795_f = newangle;
/* 186 */       this.larm3.field_78795_f = newangle;
/*     */     } else {
/* 188 */       this.larm1.field_78795_f = 0.0F;
/* 189 */       this.larm2.field_78795_f = 0.0F;
/* 190 */       this.larm3.field_78795_f = 0.0F;
/*     */     } 
/*     */ 
/*     */     
/* 194 */     e.setRenderInfo(r);
/*     */     
/* 196 */     this.rleg1.func_78785_a(f5);
/* 197 */     this.rleg2.func_78785_a(f5);
/* 198 */     this.Shape3.func_78785_a(f5);
/* 199 */     this.lleg2.func_78785_a(f5);
/* 200 */     this.lleg1.func_78785_a(f5);
/* 201 */     this.Shape6.func_78785_a(f5);
/* 202 */     this.Shape7.func_78785_a(f5);
/* 203 */     this.Shape8.func_78785_a(f5);
/* 204 */     this.rarm3.func_78785_a(f5);
/* 205 */     this.rarm2.func_78785_a(f5);
/* 206 */     this.rarm1.func_78785_a(f5);
/* 207 */     this.larm3.func_78785_a(f5);
/* 208 */     this.larm2.func_78785_a(f5);
/* 209 */     this.larm1.func_78785_a(f5);
/* 210 */     this.head.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 216 */     model.field_78795_f = x;
/* 217 */     model.field_78796_g = y;
/* 218 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 223 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelRobot2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */