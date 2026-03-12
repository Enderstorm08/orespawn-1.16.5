/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ 
/*     */ 
/*     */ public class ModelCassowary
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer tail;
/*     */   ModelRenderer body;
/*     */   ModelRenderer neck1;
/*     */   ModelRenderer neck;
/*     */   ModelRenderer head;
/*     */   ModelRenderer beak;
/*     */   ModelRenderer leg1;
/*     */   ModelRenderer leg2;
/*     */   ModelRenderer crest;
/*     */   ModelRenderer foot1;
/*     */   ModelRenderer foot2;
/*     */   ModelRenderer gobbler;
/*     */   
/*     */   public ModelCassowary(float f1) {
/*  27 */     this.wingspeed = f1;
/*     */     
/*  29 */     this.field_78090_t = 64;
/*  30 */     this.field_78089_u = 32;
/*     */     
/*  32 */     this.tail = new ModelRenderer(this, 38, 16);
/*  33 */     this.tail.func_78789_a(-3.0F, 0.0F, 0.0F, 6, 9, 7);
/*  34 */     this.tail.func_78793_a(0.0F, 8.0F, 1.0F);
/*  35 */     this.tail.func_78787_b(64, 32);
/*  36 */     this.tail.field_78809_i = true;
/*  37 */     setRotation(this.tail, 0.8922867F, 0.0F, 0.0F);
/*  38 */     this.body = new ModelRenderer(this, 0, 13);
/*  39 */     this.body.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 10, 9);
/*  40 */     this.body.func_78793_a(0.0F, 5.0F, -3.0F);
/*  41 */     this.body.func_78787_b(64, 32);
/*  42 */     this.body.field_78809_i = true;
/*  43 */     setRotation(this.body, 0.3346075F, 0.0F, 0.0F);
/*  44 */     this.neck1 = new ModelRenderer(this, 48, 0);
/*  45 */     this.neck1.func_78789_a(-2.0F, 0.0F, 0.0F, 4, 5, 4);
/*  46 */     this.neck1.func_78793_a(0.0F, 4.0F, -1.0F);
/*  47 */     this.neck1.func_78787_b(64, 32);
/*  48 */     this.neck1.field_78809_i = true;
/*  49 */     setRotation(this.neck1, -1.189716F, 0.0F, 0.0F);
/*  50 */     this.neck = new ModelRenderer(this, 38, 0);
/*  51 */     this.neck.func_78789_a(-1.0F, 0.0F, 0.0F, 2, 7, 2);
/*  52 */     this.neck.func_78793_a(0.0F, 8.0F, -3.0F);
/*  53 */     this.neck.func_78787_b(64, 32);
/*  54 */     this.neck.field_78809_i = true;
/*  55 */     setRotation(this.neck, -2.806985F, 0.0F, 0.0F);
/*  56 */     this.head = new ModelRenderer(this, 24, 0);
/*  57 */     this.head.func_78789_a(-1.0F, -2.0F, -3.0F, 2, 2, 4);
/*  58 */     this.head.func_78793_a(0.0F, 2.0F, -6.0F);
/*  59 */     this.head.func_78787_b(64, 32);
/*  60 */     this.head.field_78809_i = true;
/*  61 */     setRotation(this.head, 0.0371786F, 0.0F, 0.0F);
/*  62 */     this.beak = new ModelRenderer(this, 28, 7);
/*  63 */     this.beak.func_78789_a(-0.5F, 0.0F, 3.0F, 1, 1, 3);
/*  64 */     this.beak.func_78793_a(0.0F, 2.0F, -6.0F);
/*  65 */     this.beak.func_78787_b(64, 32);
/*  66 */     this.beak.field_78809_i = true;
/*  67 */     setRotation(this.beak, -3.104414F, 0.0F, 0.0F);
/*  68 */     this.leg1 = new ModelRenderer(this, 0, 0);
/*  69 */     this.leg1.func_78789_a(-0.5F, 0.0F, -1.0F, 1, 11, 2);
/*  70 */     this.leg1.func_78793_a(3.0F, 12.0F, 3.0F);
/*  71 */     this.leg1.func_78787_b(64, 32);
/*  72 */     this.leg1.field_78809_i = true;
/*  73 */     setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
/*  74 */     this.leg2 = new ModelRenderer(this, 0, 0);
/*  75 */     this.leg2.func_78789_a(-0.5F, 0.0F, -1.0F, 1, 11, 2);
/*  76 */     this.leg2.func_78793_a(-3.0F, 12.0F, 3.0F);
/*  77 */     this.leg2.func_78787_b(64, 32);
/*  78 */     this.leg2.field_78809_i = true;
/*  79 */     setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
/*  80 */     this.crest = new ModelRenderer(this, 10, 0);
/*  81 */     this.crest.func_78789_a(-0.5F, -4.0F, 1.0F, 1, 4, 5);
/*  82 */     this.crest.func_78793_a(0.0F, 2.0F, -6.0F);
/*  83 */     this.crest.func_78787_b(64, 32);
/*  84 */     this.crest.field_78809_i = true;
/*  85 */     setRotation(this.crest, 1.710216F, 0.0F, 0.0F);
/*  86 */     this.foot1 = new ModelRenderer(this, 47, 10);
/*  87 */     this.foot1.func_78789_a(-1.033333F, 11.0F, -2.0F, 2, 1, 3);
/*  88 */     this.foot1.func_78793_a(-3.0F, 12.0F, 3.0F);
/*  89 */     this.foot1.func_78787_b(64, 32);
/*  90 */     this.foot1.field_78809_i = true;
/*  91 */     setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
/*  92 */     this.foot2 = new ModelRenderer(this, 47, 10);
/*  93 */     this.foot2.func_78789_a(-1.0F, 11.0F, -2.0F, 2, 1, 3);
/*  94 */     this.foot2.func_78793_a(3.0F, 12.0F, 3.0F);
/*  95 */     this.foot2.func_78787_b(64, 32);
/*  96 */     this.foot2.field_78809_i = true;
/*  97 */     setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
/*  98 */     this.gobbler = new ModelRenderer(this, 38, 10);
/*  99 */     this.gobbler.func_78789_a(-0.5F, -1.0F, -2.5F, 1, 5, 1);
/* 100 */     this.gobbler.func_78793_a(0.0F, 8.0F, -3.0F);
/* 101 */     this.gobbler.func_78787_b(64, 32);
/* 102 */     this.gobbler.field_78809_i = true;
/* 103 */     setRotation(this.gobbler, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: checkcast danger/orespawn/Cassowary
/*     */     //   4: astore #8
/*     */     //   6: aload_0
/*     */     //   7: aload_1
/*     */     //   8: fload_2
/*     */     //   9: fload_3
/*     */     //   10: fload #4
/*     */     //   12: fload #5
/*     */     //   14: fload #6
/*     */     //   16: fload #7
/*     */     //   18: invokespecial func_78088_a : (Lnet/minecraft/entity/Entity;FFFFFF)V
/*     */     //   21: aload_0
/*     */     //   22: fload_2
/*     */     //   23: fload_3
/*     */     //   24: fload #4
/*     */     //   26: fload #5
/*     */     //   28: fload #6
/*     */     //   30: fload #7
/*     */     //   32: aload_1
/*     */     //   33: invokevirtual func_78087_a : (FFFFFFLnet/minecraft/entity/Entity;)V
/*     */     //   36: fconst_0
/*     */     //   37: fstore #9
/*     */     //   39: fconst_0
/*     */     //   40: fstore #10
/*     */     //   42: fload_3
/*     */     //   43: f2d
/*     */     //   44: ldc2_w 0.1
/*     */     //   47: dcmpl
/*     */     //   48: ifle -> 100
/*     */     //   51: fload #4
/*     */     //   53: ldc 1.3
/*     */     //   55: fmul
/*     */     //   56: aload_0
/*     */     //   57: getfield wingspeed : F
/*     */     //   60: fmul
/*     */     //   61: invokestatic func_76134_b : (F)F
/*     */     //   64: ldc 3.1415927
/*     */     //   66: fmul
/*     */     //   67: ldc 0.15
/*     */     //   69: fmul
/*     */     //   70: fload_3
/*     */     //   71: fmul
/*     */     //   72: fstore #9
/*     */     //   74: fload #4
/*     */     //   76: ldc 2.6
/*     */     //   78: fmul
/*     */     //   79: aload_0
/*     */     //   80: getfield wingspeed : F
/*     */     //   83: fmul
/*     */     //   84: invokestatic func_76134_b : (F)F
/*     */     //   87: ldc 3.1415927
/*     */     //   89: fmul
/*     */     //   90: ldc 0.1
/*     */     //   92: fmul
/*     */     //   93: fload_3
/*     */     //   94: fmul
/*     */     //   95: fstore #10
/*     */     //   97: goto -> 106
/*     */     //   100: fconst_0
/*     */     //   101: dup
/*     */     //   102: fstore #10
/*     */     //   104: fstore #9
/*     */     //   106: aload_0
/*     */     //   107: getfield leg1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   110: aload_0
/*     */     //   111: getfield foot2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   114: fload #9
/*     */     //   116: dup_x1
/*     */     //   117: putfield field_78795_f : F
/*     */     //   120: putfield field_78795_f : F
/*     */     //   123: aload_0
/*     */     //   124: getfield leg2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   127: aload_0
/*     */     //   128: getfield foot1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   131: fload #9
/*     */     //   133: fneg
/*     */     //   134: dup_x1
/*     */     //   135: putfield field_78795_f : F
/*     */     //   138: putfield field_78795_f : F
/*     */     //   141: aload_0
/*     */     //   142: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   145: ldc -2.827
/*     */     //   147: fload #10
/*     */     //   149: fadd
/*     */     //   150: putfield field_78795_f : F
/*     */     //   153: aload_0
/*     */     //   154: getfield gobbler : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   157: fload #10
/*     */     //   159: putfield field_78795_f : F
/*     */     //   162: aload_0
/*     */     //   163: getfield head : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   166: aload_0
/*     */     //   167: getfield crest : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   170: aload_0
/*     */     //   171: getfield beak : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   174: aload_0
/*     */     //   175: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   178: getfield field_78798_e : F
/*     */     //   181: aload_0
/*     */     //   182: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   185: getfield field_78795_f : F
/*     */     //   188: invokestatic func_76126_a : (F)F
/*     */     //   191: ldc 7.0
/*     */     //   193: fmul
/*     */     //   194: fadd
/*     */     //   195: dup_x1
/*     */     //   196: putfield field_78798_e : F
/*     */     //   199: dup_x1
/*     */     //   200: putfield field_78798_e : F
/*     */     //   203: putfield field_78798_e : F
/*     */     //   206: aload_0
/*     */     //   207: getfield head : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   210: aload_0
/*     */     //   211: getfield crest : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   214: aload_0
/*     */     //   215: getfield beak : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   218: aload_0
/*     */     //   219: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   222: getfield field_78797_d : F
/*     */     //   225: aload_0
/*     */     //   226: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   229: getfield field_78795_f : F
/*     */     //   232: invokestatic func_76134_b : (F)F
/*     */     //   235: ldc 7.0
/*     */     //   237: fmul
/*     */     //   238: fadd
/*     */     //   239: dup_x1
/*     */     //   240: putfield field_78797_d : F
/*     */     //   243: dup_x1
/*     */     //   244: putfield field_78797_d : F
/*     */     //   247: putfield field_78797_d : F
/*     */     //   250: aload_0
/*     */     //   251: getfield tail : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   254: fload #7
/*     */     //   256: invokevirtual func_78785_a : (F)V
/*     */     //   259: aload_0
/*     */     //   260: getfield body : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   263: fload #7
/*     */     //   265: invokevirtual func_78785_a : (F)V
/*     */     //   268: aload_0
/*     */     //   269: getfield neck1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   272: fload #7
/*     */     //   274: invokevirtual func_78785_a : (F)V
/*     */     //   277: aload_0
/*     */     //   278: getfield neck : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   281: fload #7
/*     */     //   283: invokevirtual func_78785_a : (F)V
/*     */     //   286: aload_0
/*     */     //   287: getfield head : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   290: fload #7
/*     */     //   292: invokevirtual func_78785_a : (F)V
/*     */     //   295: aload_0
/*     */     //   296: getfield beak : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   299: fload #7
/*     */     //   301: invokevirtual func_78785_a : (F)V
/*     */     //   304: aload_0
/*     */     //   305: getfield leg1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   308: fload #7
/*     */     //   310: invokevirtual func_78785_a : (F)V
/*     */     //   313: aload_0
/*     */     //   314: getfield leg2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   317: fload #7
/*     */     //   319: invokevirtual func_78785_a : (F)V
/*     */     //   322: aload_0
/*     */     //   323: getfield crest : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   326: fload #7
/*     */     //   328: invokevirtual func_78785_a : (F)V
/*     */     //   331: aload_0
/*     */     //   332: getfield foot1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   335: fload #7
/*     */     //   337: invokevirtual func_78785_a : (F)V
/*     */     //   340: aload_0
/*     */     //   341: getfield foot2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   344: fload #7
/*     */     //   346: invokevirtual func_78785_a : (F)V
/*     */     //   349: aload_0
/*     */     //   350: getfield gobbler : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   353: fload #7
/*     */     //   355: invokevirtual func_78785_a : (F)V
/*     */     //   358: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #109	-> 0
/*     */     //   #110	-> 6
/*     */     //   #111	-> 21
/*     */     //   #113	-> 36
/*     */     //   #114	-> 39
/*     */     //   #116	-> 42
/*     */     //   #117	-> 51
/*     */     //   #118	-> 74
/*     */     //   #120	-> 100
/*     */     //   #123	-> 106
/*     */     //   #124	-> 123
/*     */     //   #126	-> 141
/*     */     //   #127	-> 153
/*     */     //   #129	-> 162
/*     */     //   #130	-> 206
/*     */     //   #132	-> 250
/*     */     //   #133	-> 259
/*     */     //   #134	-> 268
/*     */     //   #135	-> 277
/*     */     //   #136	-> 286
/*     */     //   #137	-> 295
/*     */     //   #138	-> 304
/*     */     //   #139	-> 313
/*     */     //   #140	-> 322
/*     */     //   #141	-> 331
/*     */     //   #142	-> 340
/*     */     //   #143	-> 349
/*     */     //   #145	-> 358
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	359	0	this	Ldanger/orespawn/ModelCassowary;
/*     */     //   0	359	1	entity	Lnet/minecraft/entity/Entity;
/*     */     //   0	359	2	f	F
/*     */     //   0	359	3	f1	F
/*     */     //   0	359	4	f2	F
/*     */     //   0	359	5	f3	F
/*     */     //   0	359	6	f4	F
/*     */     //   0	359	7	f5	F
/*     */     //   6	353	8	e	Ldanger/orespawn/Cassowary;
/*     */     //   39	320	9	newangle	F
/*     */     //   42	317	10	newangle2	F
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 149 */     model.field_78795_f = x;
/* 150 */     model.field_78796_g = y;
/* 151 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 156 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelCassowary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */