/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelWhale
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer belly;
/*     */   ModelRenderer body;
/*     */   ModelRenderer back;
/*     */   ModelRenderer tail1;
/*     */   ModelRenderer tail2;
/*     */   ModelRenderer tailfin1;
/*     */   ModelRenderer tailfin2;
/*     */   ModelRenderer backfin;
/*     */   ModelRenderer head;
/*     */   ModelRenderer jaw;
/*     */   ModelRenderer lfin1;
/*     */   ModelRenderer lfin2;
/*     */   ModelRenderer rfin1;
/*     */   ModelRenderer rfin2;
/*     */   
/*     */   public ModelWhale() {
/*  32 */     this.field_78090_t = 256;
/*  33 */     this.field_78089_u = 256;
/*     */     
/*  35 */     this.belly = new ModelRenderer(this, 0, 92);
/*  36 */     this.belly.func_78789_a(-6.0F, 0.0F, 0.0F, 12, 2, 32);
/*  37 */     this.belly.func_78793_a(0.0F, 22.0F, 6.0F);
/*  38 */     this.belly.func_78787_b(256, 256);
/*  39 */     this.belly.field_78809_i = true;
/*  40 */     setRotation(this.belly, 0.0F, 0.0F, 0.0F);
/*  41 */     this.body = new ModelRenderer(this, 0, 188);
/*  42 */     this.body.func_78789_a(-10.0F, 0.0F, 0.0F, 20, 12, 52);
/*  43 */     this.body.func_78793_a(0.0F, 10.0F, 0.0F);
/*  44 */     this.body.func_78787_b(256, 256);
/*  45 */     this.body.field_78809_i = true;
/*  46 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  47 */     this.back = new ModelRenderer(this, 0, 45);
/*  48 */     this.back.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 2, 40);
/*  49 */     this.back.func_78793_a(0.0F, 8.0F, 3.0F);
/*  50 */     this.back.func_78787_b(256, 256);
/*  51 */     this.back.field_78809_i = true;
/*  52 */     setRotation(this.back, 0.0F, 0.0F, 0.0F);
/*  53 */     this.tail1 = new ModelRenderer(this, 186, 0);
/*  54 */     this.tail1.func_78789_a(-6.0F, 0.0F, 0.0F, 12, 7, 14);
/*  55 */     this.tail1.func_78793_a(0.0F, 11.0F, 52.0F);
/*  56 */     this.tail1.func_78787_b(256, 256);
/*  57 */     this.tail1.field_78809_i = true;
/*  58 */     setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
/*  59 */     this.tail2 = new ModelRenderer(this, 186, 24);
/*  60 */     this.tail2.func_78789_a(-4.0F, 0.0F, 0.0F, 8, 5, 10);
/*  61 */     this.tail2.func_78793_a(0.0F, 12.0F, 66.0F);
/*  62 */     this.tail2.func_78787_b(256, 256);
/*  63 */     this.tail2.field_78809_i = true;
/*  64 */     setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
/*  65 */     this.tailfin1 = new ModelRenderer(this, 186, 43);
/*  66 */     this.tailfin1.func_78789_a(0.0F, 0.0F, 0.0F, 17, 2, 11);
/*  67 */     this.tailfin1.func_78793_a(2.0F, 13.0F, 74.0F);
/*  68 */     this.tailfin1.func_78787_b(256, 256);
/*  69 */     this.tailfin1.field_78809_i = true;
/*  70 */     setRotation(this.tailfin1, 0.0872665F, -0.0872665F, 0.0F);
/*  71 */     this.tailfin2 = new ModelRenderer(this, 186, 59);
/*  72 */     this.tailfin2.func_78789_a(-17.0F, 0.0F, 0.0F, 17, 2, 11);
/*  73 */     this.tailfin2.func_78793_a(-2.0F, 13.0F, 74.0F);
/*  74 */     this.tailfin2.func_78787_b(256, 256);
/*  75 */     this.tailfin2.field_78809_i = true;
/*  76 */     setRotation(this.tailfin2, 0.0872665F, 0.0872665F, 0.0F);
/*  77 */     this.backfin = new ModelRenderer(this, 0, 15);
/*  78 */     this.backfin.func_78789_a(-0.5F, 0.0F, 0.0F, 1, 4, 8);
/*  79 */     this.backfin.func_78793_a(0.0F, 8.0F, 11.0F);
/*  80 */     this.backfin.func_78787_b(256, 256);
/*  81 */     this.backfin.field_78809_i = true;
/*  82 */     setRotation(this.backfin, 0.3665191F, 0.0F, 0.0F);
/*  83 */     this.head = new ModelRenderer(this, 0, 155);
/*  84 */     this.head.func_78789_a(-8.0F, 0.0F, -16.0F, 16, 8, 22);
/*  85 */     this.head.func_78793_a(0.0F, 11.0F, -6.0F);
/*  86 */     this.head.func_78787_b(256, 256);
/*  87 */     this.head.field_78809_i = true;
/*  88 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  89 */     this.jaw = new ModelRenderer(this, 0, 130);
/*  90 */     this.jaw.func_78789_a(-7.0F, -1.0F, -20.0F, 14, 2, 20);
/*  91 */     this.jaw.func_78793_a(0.0F, 20.0F, 0.0F);
/*  92 */     this.jaw.func_78787_b(256, 256);
/*  93 */     this.jaw.field_78809_i = true;
/*  94 */     setRotation(this.jaw, 0.0698132F, 0.0F, 0.0F);
/*  95 */     this.lfin1 = new ModelRenderer(this, 96, 0);
/*  96 */     this.lfin1.func_78789_a(0.0F, -1.0F, -3.0F, 4, 3, 6);
/*  97 */     this.lfin1.func_78793_a(10.0F, 18.0F, 8.0F);
/*  98 */     this.lfin1.func_78787_b(256, 256);
/*  99 */     this.lfin1.field_78809_i = true;
/* 100 */     setRotation(this.lfin1, 0.0F, -0.0872665F, 0.0F);
/* 101 */     this.lfin2 = new ModelRenderer(this, 120, 0);
/* 102 */     this.lfin2.func_78789_a(2.0F, -0.5F, -3.0F, 22, 2, 8);
/* 103 */     this.lfin2.func_78793_a(10.0F, 18.0F, 8.0F);
/* 104 */     this.lfin2.func_78787_b(256, 256);
/* 105 */     this.lfin2.field_78809_i = true;
/* 106 */     setRotation(this.lfin2, 0.0F, -0.0872665F, 0.0F);
/* 107 */     this.rfin1 = new ModelRenderer(this, 96, 12);
/* 108 */     this.rfin1.func_78789_a(-4.0F, -1.0F, -3.0F, 4, 3, 6);
/* 109 */     this.rfin1.func_78793_a(-10.0F, 18.0F, 8.0F);
/* 110 */     this.rfin1.func_78787_b(256, 256);
/* 111 */     this.rfin1.field_78809_i = true;
/* 112 */     setRotation(this.rfin1, 0.0F, 0.0872665F, 0.0F);
/* 113 */     this.rfin2 = new ModelRenderer(this, 120, 13);
/* 114 */     this.rfin2.func_78789_a(-24.0F, -0.5F, -3.0F, 22, 2, 8);
/* 115 */     this.rfin2.func_78793_a(-10.0F, 18.0F, 8.0F);
/* 116 */     this.rfin2.func_78787_b(256, 256);
/* 117 */     this.rfin2.field_78809_i = true;
/* 118 */     setRotation(this.rfin2, 0.0F, 0.0872665F, 0.0F);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: fload_2
/*     */     //   3: fload_3
/*     */     //   4: fload #4
/*     */     //   6: fload #5
/*     */     //   8: fload #6
/*     */     //   10: fload #7
/*     */     //   12: invokespecial func_78088_a : (Lnet/minecraft/entity/Entity;FFFFFF)V
/*     */     //   15: aload_0
/*     */     //   16: fload_2
/*     */     //   17: fload_3
/*     */     //   18: fload #4
/*     */     //   20: fload #5
/*     */     //   22: fload #6
/*     */     //   24: fload #7
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual func_78087_a : (FFFFFFLnet/minecraft/entity/Entity;)V
/*     */     //   30: fload #4
/*     */     //   32: ldc 0.55
/*     */     //   34: fmul
/*     */     //   35: invokestatic func_76134_b : (F)F
/*     */     //   38: ldc 3.1415927
/*     */     //   40: fmul
/*     */     //   41: ldc 0.15
/*     */     //   43: fmul
/*     */     //   44: fstore #8
/*     */     //   46: fload_3
/*     */     //   47: f2d
/*     */     //   48: ldc2_w 0.1
/*     */     //   51: dcmpl
/*     */     //   52: ifle -> 76
/*     */     //   55: fload #4
/*     */     //   57: ldc 0.3
/*     */     //   59: fmul
/*     */     //   60: invokestatic func_76134_b : (F)F
/*     */     //   63: ldc 3.1415927
/*     */     //   65: fmul
/*     */     //   66: ldc 0.2
/*     */     //   68: fmul
/*     */     //   69: fload_3
/*     */     //   70: fmul
/*     */     //   71: fstore #8
/*     */     //   73: goto -> 92
/*     */     //   76: fload #4
/*     */     //   78: ldc 0.08
/*     */     //   80: fmul
/*     */     //   81: invokestatic func_76134_b : (F)F
/*     */     //   84: ldc 3.1415927
/*     */     //   86: fmul
/*     */     //   87: ldc 0.05
/*     */     //   89: fmul
/*     */     //   90: fstore #8
/*     */     //   92: aload_0
/*     */     //   93: getfield lfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   96: ldc 0.436
/*     */     //   98: fload #8
/*     */     //   100: fadd
/*     */     //   101: putfield field_78808_h : F
/*     */     //   104: aload_0
/*     */     //   105: getfield lfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   108: aload_0
/*     */     //   109: getfield lfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   112: getfield field_78808_h : F
/*     */     //   115: fconst_2
/*     */     //   116: fdiv
/*     */     //   117: putfield field_78808_h : F
/*     */     //   120: aload_0
/*     */     //   121: getfield rfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   124: ldc -0.436
/*     */     //   126: fload #8
/*     */     //   128: fsub
/*     */     //   129: putfield field_78808_h : F
/*     */     //   132: aload_0
/*     */     //   133: getfield rfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   136: aload_0
/*     */     //   137: getfield rfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   140: getfield field_78808_h : F
/*     */     //   143: fconst_2
/*     */     //   144: fdiv
/*     */     //   145: putfield field_78808_h : F
/*     */     //   148: fload #4
/*     */     //   150: ldc 0.03
/*     */     //   152: fmul
/*     */     //   153: invokestatic func_76134_b : (F)F
/*     */     //   156: ldc 3.1415927
/*     */     //   158: fmul
/*     */     //   159: ldc 0.02
/*     */     //   161: fmul
/*     */     //   162: fstore #8
/*     */     //   164: aload_0
/*     */     //   165: getfield jaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   168: ldc 0.087
/*     */     //   170: fload #8
/*     */     //   172: fadd
/*     */     //   173: putfield field_78795_f : F
/*     */     //   176: fload_3
/*     */     //   177: f2d
/*     */     //   178: ldc2_w 0.1
/*     */     //   181: dcmpl
/*     */     //   182: ifle -> 206
/*     */     //   185: fload #4
/*     */     //   187: ldc 0.4
/*     */     //   189: fmul
/*     */     //   190: invokestatic func_76134_b : (F)F
/*     */     //   193: ldc 3.1415927
/*     */     //   195: fmul
/*     */     //   196: ldc 0.16
/*     */     //   198: fmul
/*     */     //   199: fload_3
/*     */     //   200: fmul
/*     */     //   201: fstore #8
/*     */     //   203: goto -> 222
/*     */     //   206: fload #4
/*     */     //   208: ldc 0.05
/*     */     //   210: fmul
/*     */     //   211: invokestatic func_76134_b : (F)F
/*     */     //   214: ldc 3.1415927
/*     */     //   216: fmul
/*     */     //   217: ldc 0.03
/*     */     //   219: fmul
/*     */     //   220: fstore #8
/*     */     //   222: aload_0
/*     */     //   223: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   226: fload #8
/*     */     //   228: ldc 0.5
/*     */     //   230: fmul
/*     */     //   231: putfield field_78795_f : F
/*     */     //   234: aload_0
/*     */     //   235: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   238: fload #8
/*     */     //   240: ldc 1.25
/*     */     //   242: fmul
/*     */     //   243: putfield field_78795_f : F
/*     */     //   246: aload_0
/*     */     //   247: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   250: aload_0
/*     */     //   251: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   254: fload #8
/*     */     //   256: ldc 2.25
/*     */     //   258: fmul
/*     */     //   259: dup_x1
/*     */     //   260: putfield field_78795_f : F
/*     */     //   263: putfield field_78795_f : F
/*     */     //   266: aload_0
/*     */     //   267: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   270: aload_0
/*     */     //   271: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   274: getfield field_78798_e : F
/*     */     //   277: aload_0
/*     */     //   278: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   281: getfield field_78795_f : F
/*     */     //   284: f2d
/*     */     //   285: invokestatic cos : (D)D
/*     */     //   288: d2f
/*     */     //   289: ldc 14.0
/*     */     //   291: fmul
/*     */     //   292: fadd
/*     */     //   293: putfield field_78798_e : F
/*     */     //   296: aload_0
/*     */     //   297: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   300: aload_0
/*     */     //   301: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   304: getfield field_78797_d : F
/*     */     //   307: aload_0
/*     */     //   308: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   311: getfield field_78795_f : F
/*     */     //   314: f2d
/*     */     //   315: invokestatic sin : (D)D
/*     */     //   318: d2f
/*     */     //   319: ldc 14.0
/*     */     //   321: fmul
/*     */     //   322: fsub
/*     */     //   323: putfield field_78797_d : F
/*     */     //   326: aload_0
/*     */     //   327: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   330: aload_0
/*     */     //   331: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   334: aload_0
/*     */     //   335: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   338: getfield field_78798_e : F
/*     */     //   341: aload_0
/*     */     //   342: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   345: getfield field_78795_f : F
/*     */     //   348: f2d
/*     */     //   349: invokestatic cos : (D)D
/*     */     //   352: d2f
/*     */     //   353: ldc 8.0
/*     */     //   355: fmul
/*     */     //   356: fadd
/*     */     //   357: dup_x1
/*     */     //   358: putfield field_78798_e : F
/*     */     //   361: putfield field_78798_e : F
/*     */     //   364: aload_0
/*     */     //   365: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   368: aload_0
/*     */     //   369: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   372: aload_0
/*     */     //   373: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   376: getfield field_78797_d : F
/*     */     //   379: aload_0
/*     */     //   380: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   383: getfield field_78795_f : F
/*     */     //   386: f2d
/*     */     //   387: invokestatic sin : (D)D
/*     */     //   390: d2f
/*     */     //   391: ldc 8.0
/*     */     //   393: fmul
/*     */     //   394: fsub
/*     */     //   395: dup_x1
/*     */     //   396: putfield field_78797_d : F
/*     */     //   399: putfield field_78797_d : F
/*     */     //   402: aload_0
/*     */     //   403: getfield belly : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   406: fload #7
/*     */     //   408: invokevirtual func_78785_a : (F)V
/*     */     //   411: aload_0
/*     */     //   412: getfield body : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   415: fload #7
/*     */     //   417: invokevirtual func_78785_a : (F)V
/*     */     //   420: aload_0
/*     */     //   421: getfield back : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   424: fload #7
/*     */     //   426: invokevirtual func_78785_a : (F)V
/*     */     //   429: aload_0
/*     */     //   430: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   433: fload #7
/*     */     //   435: invokevirtual func_78785_a : (F)V
/*     */     //   438: aload_0
/*     */     //   439: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   442: fload #7
/*     */     //   444: invokevirtual func_78785_a : (F)V
/*     */     //   447: aload_0
/*     */     //   448: getfield tailfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   451: fload #7
/*     */     //   453: invokevirtual func_78785_a : (F)V
/*     */     //   456: aload_0
/*     */     //   457: getfield tailfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   460: fload #7
/*     */     //   462: invokevirtual func_78785_a : (F)V
/*     */     //   465: aload_0
/*     */     //   466: getfield backfin : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   469: fload #7
/*     */     //   471: invokevirtual func_78785_a : (F)V
/*     */     //   474: aload_0
/*     */     //   475: getfield head : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   478: fload #7
/*     */     //   480: invokevirtual func_78785_a : (F)V
/*     */     //   483: aload_0
/*     */     //   484: getfield jaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   487: fload #7
/*     */     //   489: invokevirtual func_78785_a : (F)V
/*     */     //   492: aload_0
/*     */     //   493: getfield lfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   496: fload #7
/*     */     //   498: invokevirtual func_78785_a : (F)V
/*     */     //   501: aload_0
/*     */     //   502: getfield lfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   505: fload #7
/*     */     //   507: invokevirtual func_78785_a : (F)V
/*     */     //   510: aload_0
/*     */     //   511: getfield rfin1 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   514: fload #7
/*     */     //   516: invokevirtual func_78785_a : (F)V
/*     */     //   519: aload_0
/*     */     //   520: getfield rfin2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   523: fload #7
/*     */     //   525: invokevirtual func_78785_a : (F)V
/*     */     //   528: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 0
/*     */     //   #125	-> 15
/*     */     //   #127	-> 30
/*     */     //   #129	-> 46
/*     */     //   #130	-> 55
/*     */     //   #132	-> 76
/*     */     //   #135	-> 92
/*     */     //   #136	-> 104
/*     */     //   #137	-> 120
/*     */     //   #138	-> 132
/*     */     //   #140	-> 148
/*     */     //   #141	-> 164
/*     */     //   #144	-> 176
/*     */     //   #145	-> 185
/*     */     //   #147	-> 206
/*     */     //   #149	-> 222
/*     */     //   #150	-> 234
/*     */     //   #151	-> 246
/*     */     //   #152	-> 266
/*     */     //   #153	-> 296
/*     */     //   #154	-> 326
/*     */     //   #155	-> 364
/*     */     //   #157	-> 402
/*     */     //   #158	-> 411
/*     */     //   #159	-> 420
/*     */     //   #160	-> 429
/*     */     //   #161	-> 438
/*     */     //   #162	-> 447
/*     */     //   #163	-> 456
/*     */     //   #164	-> 465
/*     */     //   #165	-> 474
/*     */     //   #166	-> 483
/*     */     //   #167	-> 492
/*     */     //   #168	-> 501
/*     */     //   #169	-> 510
/*     */     //   #170	-> 519
/*     */     //   #171	-> 528
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	529	0	this	Ldanger/orespawn/ModelWhale;
/*     */     //   0	529	1	entity	Lnet/minecraft/entity/Entity;
/*     */     //   0	529	2	f	F
/*     */     //   0	529	3	f1	F
/*     */     //   0	529	4	f2	F
/*     */     //   0	529	5	f3	F
/*     */     //   0	529	6	f4	F
/*     */     //   0	529	7	f5	F
/*     */     //   46	483	8	newangle	F
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 175 */     model.field_78795_f = x;
/* 176 */     model.field_78796_g = y;
/* 177 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 182 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelWhale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */