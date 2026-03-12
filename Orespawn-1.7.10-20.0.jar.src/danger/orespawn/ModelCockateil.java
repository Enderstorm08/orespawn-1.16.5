/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ public class ModelCockateil
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Body;
/*     */   
/*     */   ModelRenderer Head;
/*     */   ModelRenderer Beak;
/*     */   ModelRenderer LowerBeak;
/*     */   ModelRenderer feather2;
/*     */   ModelRenderer feather1;
/*     */   ModelRenderer feather3;
/*     */   ModelRenderer tailfeather1;
/*     */   ModelRenderer rwing1;
/*     */   ModelRenderer lwing1;
/*     */   ModelRenderer leg;
/*     */   ModelRenderer otherleg;
/*     */   ModelRenderer lwing2;
/*     */   ModelRenderer rwing2;
/*     */   ModelRenderer tailfeather2;
/*     */   ModelRenderer tailfeather3;
/*     */   
/*     */   public ModelCockateil(float f1) {
/*  32 */     this.wingspeed = f1;
/*     */     
/*  34 */     this.field_78090_t = 64;
/*  35 */     this.field_78089_u = 32;
/*     */     
/*  37 */     this.Body = new ModelRenderer(this, 0, 0);
/*  38 */     this.Body.func_78789_a(0.0F, 0.0F, 0.0F, 5, 3, 6);
/*  39 */     this.Body.func_78793_a(-1.0F, 18.0F, 0.0F);
/*  40 */     this.Body.func_78787_b(64, 32);
/*  41 */     this.Body.field_78809_i = true;
/*  42 */     setRotation(this.Body, 0.0F, 0.0F, 0.0F);
/*  43 */     this.Head = new ModelRenderer(this, 22, 0);
/*  44 */     this.Head.func_78789_a(0.0F, 0.0F, 0.0F, 3, 3, 4);
/*  45 */     this.Head.func_78793_a(0.0F, 16.0F, -3.0F);
/*  46 */     this.Head.func_78787_b(64, 32);
/*  47 */     this.Head.field_78809_i = true;
/*  48 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  49 */     this.Beak = new ModelRenderer(this, 0, 21);
/*  50 */     this.Beak.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 3);
/*  51 */     this.Beak.func_78793_a(1.0F, 17.0F, -6.0F);
/*  52 */     this.Beak.func_78787_b(64, 32);
/*  53 */     this.Beak.field_78809_i = true;
/*  54 */     setRotation(this.Beak, 0.0F, 0.0F, 0.0F);
/*  55 */     this.LowerBeak = new ModelRenderer(this, 1, 17);
/*  56 */     this.LowerBeak.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
/*  57 */     this.LowerBeak.func_78793_a(1.0F, 18.0F, -4.0F);
/*  58 */     this.LowerBeak.func_78787_b(64, 32);
/*  59 */     this.LowerBeak.field_78809_i = true;
/*  60 */     setRotation(this.LowerBeak, 0.0F, 0.0F, 0.0F);
/*  61 */     this.feather2 = new ModelRenderer(this, 15, 9);
/*  62 */     this.feather2.func_78789_a(0.0F, -2.5F, -0.75F, 1, 3, 1);
/*  63 */     this.feather2.func_78793_a(1.0F, 16.0F, 0.0F);
/*  64 */     this.feather2.func_78787_b(64, 32);
/*  65 */     this.feather2.field_78809_i = true;
/*  66 */     setRotation(this.feather2, -0.6426736F, 0.0F, 0.0F);
/*  67 */     this.feather1 = new ModelRenderer(this, 11, 9);
/*  68 */     this.feather1.func_78789_a(0.0F, -2.5F, -0.5F, 1, 3, 1);
/*  69 */     this.feather1.func_78793_a(1.0F, 16.0F, -2.0F);
/*  70 */     this.feather1.func_78787_b(64, 32);
/*  71 */     this.feather1.field_78809_i = true;
/*  72 */     setRotation(this.feather1, -0.2230717F, 0.0F, 0.0F);
/*  73 */     this.feather3 = new ModelRenderer(this, 19, 9);
/*  74 */     this.feather3.func_78789_a(0.0F, -3.0F, 0.5F, 1, 4, 1);
/*  75 */     this.feather3.func_78793_a(1.0F, 16.0F, 1.0F);
/*  76 */     this.feather3.func_78787_b(64, 32);
/*  77 */     this.feather3.field_78809_i = true;
/*  78 */     setRotation(this.feather3, -1.276259F, 0.0F, 0.0F);
/*  79 */     this.tailfeather1 = new ModelRenderer(this, 46, 15);
/*  80 */     this.tailfeather1.func_78789_a(0.0F, 0.0F, 0.0F, 3, 2, 3);
/*  81 */     this.tailfeather1.func_78793_a(0.0F, 18.0F, 6.0F);
/*  82 */     this.tailfeather1.func_78787_b(64, 32);
/*  83 */     this.tailfeather1.field_78809_i = true;
/*  84 */     setRotation(this.tailfeather1, 0.0F, 0.0F, 0.0F);
/*  85 */     this.rwing1 = new ModelRenderer(this, 23, 9);
/*  86 */     this.rwing1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 4, 4);
/*  87 */     this.rwing1.func_78793_a(-1.0F, 18.0F, 1.0F);
/*  88 */     this.rwing1.func_78787_b(64, 32);
/*  89 */     this.rwing1.field_78809_i = true;
/*  90 */     setRotation(this.rwing1, 0.0F, 0.0F, 1.595066F);
/*  91 */     this.lwing1 = new ModelRenderer(this, 33, 9);
/*  92 */     this.lwing1.func_78789_a(-1.0F, 0.0F, 0.0F, 1, 4, 4);
/*  93 */     this.lwing1.func_78793_a(4.0F, 18.0F, 1.0F);
/*  94 */     this.lwing1.func_78787_b(64, 32);
/*  95 */     this.lwing1.field_78809_i = true;
/*  96 */     setRotation(this.lwing1, 0.0F, 0.0F, -1.561488F);
/*  97 */     this.leg = new ModelRenderer(this, 4, 12);
/*  98 */     this.leg.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/*  99 */     this.leg.func_78793_a(2.0F, 21.0F, 3.0F);
/* 100 */     this.leg.func_78787_b(64, 32);
/* 101 */     this.leg.field_78809_i = true;
/* 102 */     setRotation(this.leg, 0.8726646F, 0.0F, 0.0F);
/* 103 */     this.otherleg = new ModelRenderer(this, 0, 12);
/* 104 */     this.otherleg.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 105 */     this.otherleg.func_78793_a(0.0F, 21.0F, 3.0F);
/* 106 */     this.otherleg.func_78787_b(64, 32);
/* 107 */     this.otherleg.field_78809_i = true;
/* 108 */     setRotation(this.otherleg, 0.6108652F, 0.0F, 0.0F);
/* 109 */     this.lwing2 = new ModelRenderer(this, 10, 14);
/* 110 */     this.lwing2.func_78789_a(4.0F, 0.0F, 0.0F, 3, 1, 3);
/* 111 */     this.lwing2.func_78793_a(4.0F, 18.0F, 1.0F);
/* 112 */     this.lwing2.func_78787_b(64, 32);
/* 113 */     this.lwing2.field_78809_i = true;
/* 114 */     setRotation(this.lwing2, 0.0F, 0.0F, 0.0F);
/* 115 */     this.rwing2 = new ModelRenderer(this, 10, 19);
/* 116 */     this.rwing2.func_78789_a(-7.0F, 0.0F, 0.0F, 3, 1, 3);
/* 117 */     this.rwing2.func_78793_a(-1.0F, 18.0F, 1.0F);
/* 118 */     this.rwing2.func_78787_b(64, 32);
/* 119 */     this.rwing2.field_78809_i = true;
/* 120 */     setRotation(this.rwing2, 0.0F, 0.0F, 0.0F);
/* 121 */     this.tailfeather2 = new ModelRenderer(this, 44, 20);
/* 122 */     this.tailfeather2.func_78789_a(-0.5F, 0.0F, 3.0F, 4, 1, 4);
/* 123 */     this.tailfeather2.func_78793_a(0.0F, 18.0F, 6.0F);
/* 124 */     this.tailfeather2.func_78787_b(64, 32);
/* 125 */     this.tailfeather2.field_78809_i = true;
/* 126 */     setRotation(this.tailfeather2, 0.0F, 0.0F, 0.0F);
/* 127 */     this.tailfeather3 = new ModelRenderer(this, 36, 26);
/* 128 */     this.tailfeather3.func_78789_a(-1.0F, 0.0F, 7.0F, 5, 1, 4);
/* 129 */     this.tailfeather3.func_78793_a(0.0F, 18.0F, 6.0F);
/* 130 */     this.tailfeather3.func_78787_b(64, 32);
/* 131 */     this.tailfeather3.field_78809_i = true;
/* 132 */     setRotation(this.tailfeather3, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 138 */     float newangle = 0.0F;
/* 139 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 140 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 142 */     newangle = MathHelper.func_76134_b(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.35F;
/* 143 */     this.lwing1.field_78808_h = -1.5F + newangle;
/* 144 */     this.lwing2.field_78808_h = newangle;
/* 145 */     this.rwing1.field_78808_h = 1.5F - newangle;
/* 146 */     this.rwing2.field_78808_h = -newangle;
/*     */     
/* 148 */     newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.1F;
/* 149 */     this.tailfeather1.field_78795_f = newangle;
/* 150 */     this.tailfeather2.field_78795_f = newangle;
/* 151 */     this.tailfeather3.field_78795_f = newangle;
/*     */     
/* 153 */     newangle = MathHelper.func_76134_b(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.08F;
/* 154 */     this.feather1.field_78808_h = newangle;
/* 155 */     newangle = MathHelper.func_76134_b(f2 * 1.2F * this.wingspeed) * 3.1415927F * 0.08F;
/* 156 */     this.feather2.field_78808_h = newangle;
/* 157 */     newangle = MathHelper.func_76134_b(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.08F;
/* 158 */     this.feather3.field_78808_h = newangle;
/*     */     
/* 160 */     this.Body.func_78785_a(f5);
/* 161 */     this.Head.func_78785_a(f5);
/* 162 */     this.Beak.func_78785_a(f5);
/* 163 */     this.LowerBeak.func_78785_a(f5);
/* 164 */     this.feather2.func_78785_a(f5);
/* 165 */     this.feather1.func_78785_a(f5);
/* 166 */     this.feather3.func_78785_a(f5);
/* 167 */     this.tailfeather1.func_78785_a(f5);
/* 168 */     this.rwing1.func_78785_a(f5);
/* 169 */     this.lwing1.func_78785_a(f5);
/* 170 */     this.leg.func_78785_a(f5);
/* 171 */     this.otherleg.func_78785_a(f5);
/* 172 */     this.lwing2.func_78785_a(f5);
/* 173 */     this.rwing2.func_78785_a(f5);
/* 174 */     this.tailfeather2.func_78785_a(f5);
/* 175 */     this.tailfeather3.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 182 */     model.field_78795_f = x;
/* 183 */     model.field_78796_g = y;
/* 184 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 189 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCockateil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */