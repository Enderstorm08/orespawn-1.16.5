/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelGhostSkelly
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer body;
/*     */   ModelRenderer shirt;
/*     */   ModelRenderer head;
/*     */   ModelRenderer stem;
/*     */   ModelRenderer rarm;
/*     */   ModelRenderer larm;
/*     */   ModelRenderer rsleeve;
/*     */   ModelRenderer lsleeve;
/*     */   ModelRenderer lchains;
/*     */   ModelRenderer rchains;
/*     */   
/*     */   public ModelGhostSkelly() {
/*  26 */     this.field_78090_t = 128;
/*  27 */     this.field_78089_u = 64;
/*     */     
/*  29 */     this.body = new ModelRenderer(this, 0, 0);
/*  30 */     this.body.func_78789_a(0.0F, 0.0F, 0.0F, 1, 21, 1);
/*  31 */     this.body.func_78793_a(0.0F, -1.0F, 0.0F);
/*  32 */     this.body.func_78787_b(128, 64);
/*  33 */     this.body.field_78809_i = true;
/*  34 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  35 */     this.shirt = new ModelRenderer(this, 42, 43);
/*  36 */     this.shirt.func_78789_a(-2.0F, 0.0F, -2.0F, 5, 12, 5);
/*  37 */     this.shirt.func_78793_a(0.0F, 0.0F, 0.0F);
/*  38 */     this.shirt.func_78787_b(128, 64);
/*  39 */     this.shirt.field_78809_i = true;
/*  40 */     setRotation(this.shirt, 0.0F, 0.0F, 0.0F);
/*  41 */     this.head = new ModelRenderer(this, 40, 29);
/*  42 */     this.head.func_78789_a(-3.0F, 0.0F, -3.0F, 7, 5, 7);
/*  43 */     this.head.func_78793_a(0.0F, -6.0F, 0.0F);
/*  44 */     this.head.func_78787_b(128, 64);
/*  45 */     this.head.field_78809_i = true;
/*  46 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  47 */     this.stem = new ModelRenderer(this, 49, 23);
/*  48 */     this.stem.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/*  49 */     this.stem.func_78793_a(0.0F, -8.0F, 0.0F);
/*  50 */     this.stem.func_78787_b(128, 64);
/*  51 */     this.stem.field_78809_i = true;
/*  52 */     setRotation(this.stem, 0.1745329F, 0.0F, 0.1745329F);
/*  53 */     this.rarm = new ModelRenderer(this, 26, 0);
/*  54 */     this.rarm.func_78789_a(-14.0F, 0.0F, 0.0F, 15, 1, 1);
/*  55 */     this.rarm.func_78793_a(0.0F, 0.0F, 0.0F);
/*  56 */     this.rarm.func_78787_b(128, 64);
/*  57 */     this.rarm.field_78809_i = true;
/*  58 */     setRotation(this.rarm, 0.0F, 0.0F, 0.0F);
/*  59 */     this.larm = new ModelRenderer(this, 63, 0);
/*  60 */     this.larm.func_78789_a(0.0F, 0.0F, 0.0F, 15, 1, 1);
/*  61 */     this.larm.func_78793_a(0.0F, 0.0F, 0.0F);
/*  62 */     this.larm.func_78787_b(128, 64);
/*  63 */     this.larm.field_78809_i = true;
/*  64 */     setRotation(this.larm, 0.0F, 0.0F, 0.0F);
/*  65 */     this.rsleeve = new ModelRenderer(this, 31, 7);
/*  66 */     this.rsleeve.func_78789_a(-11.0F, 0.0F, -1.0F, 9, 8, 3);
/*  67 */     this.rsleeve.func_78793_a(0.0F, 0.0F, 0.0F);
/*  68 */     this.rsleeve.func_78787_b(128, 64);
/*  69 */     this.rsleeve.field_78809_i = true;
/*  70 */     setRotation(this.rsleeve, 0.0F, 0.0F, 0.0F);
/*  71 */     this.lsleeve = new ModelRenderer(this, 71, 7);
/*  72 */     this.lsleeve.func_78789_a(3.0F, 0.0F, -1.0F, 9, 8, 3);
/*  73 */     this.lsleeve.func_78793_a(0.0F, 0.0F, 0.0F);
/*  74 */     this.lsleeve.func_78787_b(128, 64);
/*  75 */     this.lsleeve.field_78809_i = true;
/*  76 */     setRotation(this.lsleeve, 0.0F, 0.0F, 0.0F);
/*  77 */     this.lchains = new ModelRenderer(this, 98, 0);
/*  78 */     this.lchains.func_78789_a(11.0F, -1.0F, 0.0F, 3, 16, 1);
/*  79 */     this.lchains.func_78793_a(0.0F, 0.0F, 0.0F);
/*  80 */     this.lchains.func_78787_b(128, 64);
/*  81 */     this.lchains.field_78809_i = true;
/*  82 */     setRotation(this.lchains, 0.0F, 0.0F, 0.0F);
/*  83 */     this.rchains = new ModelRenderer(this, 12, 0);
/*  84 */     this.rchains.func_78789_a(-13.0F, -1.0F, 0.0F, 3, 10, 1);
/*  85 */     this.rchains.func_78793_a(0.0F, 0.0F, 0.0F);
/*  86 */     this.rchains.func_78787_b(128, 64);
/*  87 */     this.rchains.field_78809_i = true;
/*  88 */     setRotation(this.rchains, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  93 */     GhostSkelly e = (GhostSkelly)entity;
/*  94 */     RenderInfo r = null;
/*  95 */     float newangle = 0.0F;
/*  96 */     float newrf1 = 0.0F;
/*     */     
/*  98 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  99 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/* 100 */     r = e.getRenderInfo();
/*     */     
/* 102 */     this.lchains.field_78808_h = MathHelper.func_76134_b(f2 * 0.2F) * 3.1415927F * 0.05F;
/* 103 */     this.rchains.field_78808_h = MathHelper.func_76134_b(f2 * 0.22F) * 3.1415927F * 0.05F;
/* 104 */     this.lchains.field_78796_g = MathHelper.func_76134_b(f2 * 0.24F) * 3.1415927F * 0.05F;
/* 105 */     this.rchains.field_78796_g = MathHelper.func_76134_b(f2 * 0.26F) * 3.1415927F * 0.05F;
/*     */ 
/*     */ 
/*     */     
/* 109 */     newangle = MathHelper.func_76134_b(f2 * 0.05F) * 3.1415927F * 2.0F;
/* 110 */     newrf1 = f2 * 0.05F % 6.2831855F;
/* 111 */     newrf1 = Math.abs(newrf1);
/*     */     
/* 113 */     if (newrf1 < r.rf2) {
/*     */       
/* 115 */       r.ri2 = 0;
/* 116 */       if (e.field_70170_p.field_73012_v.nextInt(3) == 1) r.ri2 |= 0x1; 
/*     */     } 
/* 118 */     r.rf2 = newrf1;
/* 119 */     if ((r.ri2 & 0x1) == 0) {
/* 120 */       newangle = 0.0F;
/*     */     }
/*     */     
/* 123 */     this.head.field_78796_g = newangle;
/*     */ 
/*     */     
/* 126 */     e.setRenderInfo(r);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     GL11.glPushMatrix();
/* 132 */     GL11.glEnable(2977);
/* 133 */     GL11.glEnable(3042);
/* 134 */     GL11.glBlendFunc(770, 771);
/* 135 */     GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.25F);
/*     */     
/* 137 */     this.body.func_78785_a(f5);
/* 138 */     this.shirt.func_78785_a(f5);
/* 139 */     this.head.func_78785_a(f5);
/* 140 */     this.stem.func_78785_a(f5);
/* 141 */     this.rarm.func_78785_a(f5);
/* 142 */     this.larm.func_78785_a(f5);
/* 143 */     this.rsleeve.func_78785_a(f5);
/* 144 */     this.lsleeve.func_78785_a(f5);
/* 145 */     this.lchains.func_78785_a(f5);
/* 146 */     this.rchains.func_78785_a(f5);
/*     */     
/* 148 */     GL11.glDisable(3042);
/* 149 */     GL11.glPopMatrix();
/*     */   }
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


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelGhostSkelly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */