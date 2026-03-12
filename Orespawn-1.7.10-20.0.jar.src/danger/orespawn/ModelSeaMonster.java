/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ 
/*     */ 
/*     */ public class ModelSeaMonster
/*     */   extends ModelBase
/*     */ {
/*  11 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer TailTip;
/*     */   
/*     */   ModelRenderer TailBase;
/*     */   ModelRenderer Tail2;
/*     */   ModelRenderer Tail3;
/*     */   ModelRenderer BodyBack;
/*     */   ModelRenderer Neck6;
/*     */   ModelRenderer BodyFront;
/*     */   ModelRenderer NeckBase;
/*     */   ModelRenderer Neck2;
/*     */   ModelRenderer Neck3;
/*     */   ModelRenderer Neck4;
/*     */   ModelRenderer Neck5;
/*     */   ModelRenderer BottomJaw;
/*     */   ModelRenderer FinBackRight;
/*     */   ModelRenderer FinBackLeft;
/*     */   ModelRenderer FinFrontLeft;
/*     */   ModelRenderer FinFrontRight;
/*     */   ModelRenderer Tail4;
/*     */   ModelRenderer Tail5;
/*     */   ModelRenderer Tail6;
/*     */   ModelRenderer TopJaw;
/*     */   ModelRenderer RightEye;
/*     */   ModelRenderer LeftEye;
/*     */   
/*     */   public ModelSeaMonster(float f1) {
/*  39 */     this.wingspeed = f1;
/*     */     
/*  41 */     this.field_78090_t = 256;
/*  42 */     this.field_78089_u = 128;
/*     */     
/*  44 */     this.TailTip = new ModelRenderer(this, 158, 36);
/*  45 */     this.TailTip.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 6);
/*  46 */     this.TailTip.func_78793_a(0.0F, 16.0F, 70.0F);
/*  47 */     this.TailTip.func_78787_b(256, 128);
/*  48 */     this.TailTip.field_78809_i = true;
/*  49 */     setRotation(this.TailTip, 0.0F, 0.0F, 0.0F);
/*  50 */     this.TailBase = new ModelRenderer(this, 68, 64);
/*  51 */     this.TailBase.func_78789_a(-7.0F, -7.0F, 0.0F, 14, 14, 12);
/*  52 */     this.TailBase.func_78793_a(0.0F, 16.0F, 26.0F);
/*  53 */     this.TailBase.func_78787_b(256, 128);
/*  54 */     this.TailBase.field_78809_i = true;
/*  55 */     setRotation(this.TailBase, 0.0F, 0.0F, 0.0F);
/*  56 */     this.Tail2 = new ModelRenderer(this, 74, 90);
/*  57 */     this.Tail2.func_78789_a(-6.0F, -6.0F, 0.0F, 12, 12, 8);
/*  58 */     this.Tail2.func_78793_a(0.0F, 16.0F, 38.0F);
/*  59 */     this.Tail2.func_78787_b(256, 128);
/*  60 */     this.Tail2.field_78809_i = true;
/*  61 */     setRotation(this.Tail2, 0.0F, 0.0F, 0.0F);
/*  62 */     this.Tail3 = new ModelRenderer(this, 78, 110);
/*  63 */     this.Tail3.func_78789_a(-5.0F, -5.0F, 0.0F, 10, 10, 6);
/*  64 */     this.Tail3.func_78793_a(0.0F, 16.0F, 46.0F);
/*  65 */     this.Tail3.func_78787_b(256, 128);
/*  66 */     this.Tail3.field_78809_i = true;
/*  67 */     setRotation(this.Tail3, 0.0F, 0.0F, 0.0F);
/*  68 */     this.BodyBack = new ModelRenderer(this, 62, 32);
/*  69 */     this.BodyBack.func_78789_a(-8.0F, -8.0F, 0.0F, 16, 16, 16);
/*  70 */     this.BodyBack.func_78793_a(0.0F, 16.0F, 10.0F);
/*  71 */     this.BodyBack.func_78787_b(256, 128);
/*  72 */     this.BodyBack.field_78809_i = true;
/*  73 */     setRotation(this.BodyBack, 0.0F, 0.0F, 0.0F);
/*  74 */     this.Neck6 = new ModelRenderer(this, 20, 28);
/*  75 */     this.Neck6.func_78789_a(-2.0F, -6.0F, -2.0F, 4, 6, 4);
/*  76 */     this.Neck6.func_78793_a(0.0F, -21.0F, -25.0F);
/*  77 */     this.Neck6.func_78787_b(256, 128);
/*  78 */     this.Neck6.field_78809_i = true;
/*  79 */     setRotation(this.Neck6, 1.22173F, 0.0F, 0.0F);
/*  80 */     this.BodyFront = new ModelRenderer(this, 62, 0);
/*  81 */     this.BodyFront.func_78789_a(-8.0F, -8.0F, -16.0F, 16, 16, 16);
/*  82 */     this.BodyFront.func_78793_a(0.0F, 16.0F, 10.0F);
/*  83 */     this.BodyFront.func_78787_b(256, 128);
/*  84 */     this.BodyFront.field_78809_i = true;
/*  85 */     setRotation(this.BodyFront, 0.0F, 0.0F, 0.0F);
/*  86 */     this.NeckBase = new ModelRenderer(this, 8, 96);
/*  87 */     this.NeckBase.func_78789_a(-5.0F, -10.0F, -5.0F, 10, 10, 10);
/*  88 */     this.NeckBase.func_78793_a(0.0F, 12.0F, -2.0F);
/*  89 */     this.NeckBase.func_78787_b(256, 128);
/*  90 */     this.NeckBase.field_78809_i = true;
/*  91 */     setRotation(this.NeckBase, 0.7853982F, 0.0F, 0.0F);
/*  92 */     this.Neck2 = new ModelRenderer(this, 14, 78);
/*  93 */     this.Neck2.func_78789_a(-3.0F, -10.0F, -4.0F, 6, 10, 8);
/*  94 */     this.Neck2.func_78793_a(0.0F, 6.0F, -9.0F);
/*  95 */     this.Neck2.func_78787_b(256, 128);
/*  96 */     this.Neck2.field_78809_i = true;
/*  97 */     setRotation(this.Neck2, 0.6981317F, 0.0F, 0.0F);
/*  98 */     this.Neck3 = new ModelRenderer(this, 16, 62);
/*  99 */     this.Neck3.func_78789_a(-3.0F, -10.0F, -3.0F, 6, 10, 6);
/* 100 */     this.Neck3.func_78793_a(0.0F, -1.0F, -15.0F);
/* 101 */     this.Neck3.func_78787_b(256, 128);
/* 102 */     this.Neck3.field_78809_i = true;
/* 103 */     setRotation(this.Neck3, 0.5235988F, 0.0F, 0.0F);
/* 104 */     this.Neck4 = new ModelRenderer(this, 20, 48);
/* 105 */     this.Neck4.func_78789_a(-2.0F, -10.0F, -2.0F, 4, 10, 4);
/* 106 */     this.Neck4.func_78793_a(0.0F, -9.0F, -20.0F);
/* 107 */     this.Neck4.func_78787_b(256, 128);
/* 108 */     this.Neck4.field_78809_i = true;
/* 109 */     setRotation(this.Neck4, 0.2617994F, 0.0F, 0.0F);
/* 110 */     this.Neck5 = new ModelRenderer(this, 20, 38);
/* 111 */     this.Neck5.func_78789_a(-2.0F, -6.0F, -2.0F, 4, 6, 4);
/* 112 */     this.Neck5.func_78793_a(0.0F, -17.6F, -22.0F);
/* 113 */     this.Neck5.func_78787_b(256, 128);
/* 114 */     this.Neck5.field_78809_i = true;
/* 115 */     setRotation(this.Neck5, 0.7853982F, 0.0F, 0.0F);
/* 116 */     this.BottomJaw = new ModelRenderer(this, 10, 0);
/* 117 */     this.BottomJaw.func_78789_a(-4.0F, 0.0F, -10.0F, 8, 3, 10);
/* 118 */     this.BottomJaw.func_78793_a(0.0F, -23.0F, -29.0F);
/* 119 */     this.BottomJaw.func_78787_b(256, 128);
/* 120 */     this.BottomJaw.field_78809_i = true;
/* 121 */     setRotation(this.BottomJaw, 0.1745329F, 0.0F, 0.0F);
/* 122 */     this.FinBackRight = new ModelRenderer(this, 132, 95);
/* 123 */     this.FinBackRight.func_78789_a(-8.0F, 0.0F, 0.0F, 8, 1, 16);
/* 124 */     this.FinBackRight.func_78793_a(-7.0F, 16.0F, 16.0F);
/* 125 */     this.FinBackRight.func_78787_b(256, 128);
/* 126 */     this.FinBackRight.field_78809_i = true;
/* 127 */     setRotation(this.FinBackRight, -0.5235988F, -0.6981317F, 0.0F);
/* 128 */     this.FinBackLeft = new ModelRenderer(this, 132, 61);
/* 129 */     this.FinBackLeft.func_78789_a(0.0F, 0.0F, 0.0F, 8, 1, 16);
/* 130 */     this.FinBackLeft.func_78793_a(7.0F, 16.0F, 16.0F);
/* 131 */     this.FinBackLeft.func_78787_b(256, 128);
/* 132 */     this.FinBackLeft.field_78809_i = true;
/* 133 */     setRotation(this.FinBackLeft, -0.5235988F, 0.6981317F, 0.0F);
/* 134 */     this.FinFrontLeft = new ModelRenderer(this, 132, 44);
/* 135 */     this.FinFrontLeft.func_78789_a(0.0F, 0.0F, 0.0F, 8, 1, 16);
/* 136 */     this.FinFrontLeft.func_78793_a(7.0F, 16.0F, -1.0F);
/* 137 */     this.FinFrontLeft.func_78787_b(256, 128);
/* 138 */     this.FinFrontLeft.field_78809_i = true;
/* 139 */     setRotation(this.FinFrontLeft, -0.5235988F, 0.6981317F, 0.0F);
/* 140 */     this.FinFrontRight = new ModelRenderer(this, 132, 78);
/* 141 */     this.FinFrontRight.func_78789_a(-8.0F, 0.0F, 0.0F, 8, 1, 16);
/* 142 */     this.FinFrontRight.func_78793_a(-7.0F, 16.0F, -1.0F);
/* 143 */     this.FinFrontRight.func_78787_b(256, 128);
/* 144 */     this.FinFrontRight.field_78809_i = true;
/* 145 */     setRotation(this.FinFrontRight, -0.5235988F, -0.6981317F, 0.0F);
/* 146 */     this.Tail4 = new ModelRenderer(this, 152, 0);
/* 147 */     this.Tail4.func_78789_a(-4.0F, -4.0F, 0.0F, 8, 8, 6);
/* 148 */     this.Tail4.func_78793_a(0.0F, 16.0F, 52.0F);
/* 149 */     this.Tail4.func_78787_b(256, 128);
/* 150 */     this.Tail4.field_78809_i = true;
/* 151 */     setRotation(this.Tail4, 0.0F, 0.0F, 0.0F);
/* 152 */     this.Tail5 = new ModelRenderer(this, 154, 14);
/* 153 */     this.Tail5.func_78789_a(-3.0F, -3.0F, 0.0F, 6, 6, 6);
/* 154 */     this.Tail5.func_78793_a(0.0F, 16.0F, 58.0F);
/* 155 */     this.Tail5.func_78787_b(256, 128);
/* 156 */     this.Tail5.field_78809_i = true;
/* 157 */     setRotation(this.Tail5, 0.0F, 0.0F, 0.0F);
/* 158 */     this.Tail6 = new ModelRenderer(this, 156, 26);
/* 159 */     this.Tail6.func_78789_a(-2.0F, -2.0F, 0.0F, 4, 4, 6);
/* 160 */     this.Tail6.func_78793_a(0.0F, 16.0F, 64.0F);
/* 161 */     this.Tail6.func_78787_b(256, 128);
/* 162 */     this.Tail6.field_78809_i = true;
/* 163 */     setRotation(this.Tail6, 0.0F, 0.0F, 0.0F);
/* 164 */     this.TopJaw = new ModelRenderer(this, 10, 13);
/* 165 */     this.TopJaw.func_78789_a(-4.0F, -4.0F, -10.0F, 8, 4, 10);
/* 166 */     this.TopJaw.func_78793_a(0.0F, -23.0F, -29.0F);
/* 167 */     this.TopJaw.func_78787_b(256, 128);
/* 168 */     this.TopJaw.field_78809_i = true;
/* 169 */     setRotation(this.TopJaw, 0.0F, 0.0F, 0.0F);
/* 170 */     this.RightEye = new ModelRenderer(this, 46, 16);
/* 171 */     this.RightEye.func_78789_a(-3.0F, -6.0F, -5.0F, 2, 2, 1);
/* 172 */     this.RightEye.func_78793_a(0.0F, -23.0F, -29.0F);
/* 173 */     this.RightEye.func_78787_b(256, 128);
/* 174 */     this.RightEye.field_78809_i = true;
/* 175 */     setRotation(this.RightEye, 0.0F, 0.0F, 0.0F);
/* 176 */     this.LeftEye = new ModelRenderer(this, 4, 16);
/* 177 */     this.LeftEye.func_78789_a(1.0F, -6.0F, -5.0F, 2, 2, 1);
/* 178 */     this.LeftEye.func_78793_a(0.0F, -23.0F, -29.0F);
/* 179 */     this.LeftEye.func_78787_b(256, 128);
/* 180 */     this.LeftEye.field_78809_i = true;
/* 181 */     setRotation(this.LeftEye, 0.0F, 0.0F, 0.0F);
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
/*     */     //   1: checkcast danger/orespawn/SeaMonster
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
/*     */     //   39: ldc 0.7853982
/*     */     //   41: fstore #10
/*     */     //   43: fload_3
/*     */     //   44: f2d
/*     */     //   45: ldc2_w 0.1
/*     */     //   48: dcmpl
/*     */     //   49: ifgt -> 60
/*     */     //   52: aload #8
/*     */     //   54: invokevirtual getAttacking : ()I
/*     */     //   57: ifeq -> 86
/*     */     //   60: fload #4
/*     */     //   62: ldc 1.3
/*     */     //   64: fmul
/*     */     //   65: aload_0
/*     */     //   66: getfield wingspeed : F
/*     */     //   69: fmul
/*     */     //   70: invokestatic func_76134_b : (F)F
/*     */     //   73: ldc 3.1415927
/*     */     //   75: fmul
/*     */     //   76: ldc 0.2
/*     */     //   78: fmul
/*     */     //   79: fload_3
/*     */     //   80: fmul
/*     */     //   81: fstore #9
/*     */     //   83: goto -> 89
/*     */     //   86: fconst_0
/*     */     //   87: fstore #9
/*     */     //   89: aload_0
/*     */     //   90: getfield TailBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   93: fload #9
/*     */     //   95: ldc 7.0
/*     */     //   97: fdiv
/*     */     //   98: putfield field_78796_g : F
/*     */     //   101: aload_0
/*     */     //   102: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   105: aload_0
/*     */     //   106: getfield TailBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   109: getfield field_78798_e : F
/*     */     //   112: aload_0
/*     */     //   113: getfield TailBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   116: getfield field_78796_g : F
/*     */     //   119: f2d
/*     */     //   120: invokestatic cos : (D)D
/*     */     //   123: d2f
/*     */     //   124: ldc 10.0
/*     */     //   126: fmul
/*     */     //   127: fadd
/*     */     //   128: putfield field_78798_e : F
/*     */     //   131: aload_0
/*     */     //   132: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   135: aload_0
/*     */     //   136: getfield TailBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   139: getfield field_78800_c : F
/*     */     //   142: aload_0
/*     */     //   143: getfield TailBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   146: getfield field_78796_g : F
/*     */     //   149: f2d
/*     */     //   150: invokestatic sin : (D)D
/*     */     //   153: d2f
/*     */     //   154: ldc 10.0
/*     */     //   156: fmul
/*     */     //   157: fadd
/*     */     //   158: putfield field_78800_c : F
/*     */     //   161: aload_0
/*     */     //   162: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   165: fload #9
/*     */     //   167: ldc 6.0
/*     */     //   169: fdiv
/*     */     //   170: putfield field_78796_g : F
/*     */     //   173: aload_0
/*     */     //   174: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   177: aload_0
/*     */     //   178: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   181: getfield field_78798_e : F
/*     */     //   184: aload_0
/*     */     //   185: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   188: getfield field_78796_g : F
/*     */     //   191: f2d
/*     */     //   192: invokestatic cos : (D)D
/*     */     //   195: d2f
/*     */     //   196: ldc 7.0
/*     */     //   198: fmul
/*     */     //   199: fadd
/*     */     //   200: putfield field_78798_e : F
/*     */     //   203: aload_0
/*     */     //   204: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   207: aload_0
/*     */     //   208: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   211: getfield field_78800_c : F
/*     */     //   214: aload_0
/*     */     //   215: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   218: getfield field_78796_g : F
/*     */     //   221: f2d
/*     */     //   222: invokestatic sin : (D)D
/*     */     //   225: d2f
/*     */     //   226: ldc 7.0
/*     */     //   228: fmul
/*     */     //   229: fadd
/*     */     //   230: putfield field_78800_c : F
/*     */     //   233: aload_0
/*     */     //   234: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   237: fload #9
/*     */     //   239: ldc 5.0
/*     */     //   241: fdiv
/*     */     //   242: putfield field_78796_g : F
/*     */     //   245: aload_0
/*     */     //   246: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   249: aload_0
/*     */     //   250: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   253: getfield field_78798_e : F
/*     */     //   256: aload_0
/*     */     //   257: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   260: getfield field_78796_g : F
/*     */     //   263: f2d
/*     */     //   264: invokestatic cos : (D)D
/*     */     //   267: d2f
/*     */     //   268: ldc 5.0
/*     */     //   270: fmul
/*     */     //   271: fadd
/*     */     //   272: putfield field_78798_e : F
/*     */     //   275: aload_0
/*     */     //   276: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   279: aload_0
/*     */     //   280: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   283: getfield field_78800_c : F
/*     */     //   286: aload_0
/*     */     //   287: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   290: getfield field_78796_g : F
/*     */     //   293: f2d
/*     */     //   294: invokestatic sin : (D)D
/*     */     //   297: d2f
/*     */     //   298: ldc 5.0
/*     */     //   300: fmul
/*     */     //   301: fadd
/*     */     //   302: putfield field_78800_c : F
/*     */     //   305: aload_0
/*     */     //   306: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   309: fload #9
/*     */     //   311: ldc 4.0
/*     */     //   313: fdiv
/*     */     //   314: putfield field_78796_g : F
/*     */     //   317: aload_0
/*     */     //   318: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   321: aload_0
/*     */     //   322: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   325: getfield field_78798_e : F
/*     */     //   328: aload_0
/*     */     //   329: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   332: getfield field_78796_g : F
/*     */     //   335: f2d
/*     */     //   336: invokestatic cos : (D)D
/*     */     //   339: d2f
/*     */     //   340: ldc 5.0
/*     */     //   342: fmul
/*     */     //   343: fadd
/*     */     //   344: putfield field_78798_e : F
/*     */     //   347: aload_0
/*     */     //   348: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   351: aload_0
/*     */     //   352: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   355: getfield field_78800_c : F
/*     */     //   358: aload_0
/*     */     //   359: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   362: getfield field_78796_g : F
/*     */     //   365: f2d
/*     */     //   366: invokestatic sin : (D)D
/*     */     //   369: d2f
/*     */     //   370: ldc 5.0
/*     */     //   372: fmul
/*     */     //   373: fadd
/*     */     //   374: putfield field_78800_c : F
/*     */     //   377: aload_0
/*     */     //   378: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   381: fload #9
/*     */     //   383: ldc 3.0
/*     */     //   385: fdiv
/*     */     //   386: putfield field_78796_g : F
/*     */     //   389: aload_0
/*     */     //   390: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   393: aload_0
/*     */     //   394: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   397: getfield field_78798_e : F
/*     */     //   400: aload_0
/*     */     //   401: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   404: getfield field_78796_g : F
/*     */     //   407: f2d
/*     */     //   408: invokestatic cos : (D)D
/*     */     //   411: d2f
/*     */     //   412: ldc 5.0
/*     */     //   414: fmul
/*     */     //   415: fadd
/*     */     //   416: putfield field_78798_e : F
/*     */     //   419: aload_0
/*     */     //   420: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   423: aload_0
/*     */     //   424: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   427: getfield field_78800_c : F
/*     */     //   430: aload_0
/*     */     //   431: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   434: getfield field_78796_g : F
/*     */     //   437: f2d
/*     */     //   438: invokestatic sin : (D)D
/*     */     //   441: d2f
/*     */     //   442: ldc 5.0
/*     */     //   444: fmul
/*     */     //   445: fadd
/*     */     //   446: putfield field_78800_c : F
/*     */     //   449: aload_0
/*     */     //   450: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   453: fload #9
/*     */     //   455: fconst_2
/*     */     //   456: fdiv
/*     */     //   457: putfield field_78796_g : F
/*     */     //   460: aload_0
/*     */     //   461: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   464: aload_0
/*     */     //   465: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   468: getfield field_78798_e : F
/*     */     //   471: aload_0
/*     */     //   472: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   475: getfield field_78796_g : F
/*     */     //   478: f2d
/*     */     //   479: invokestatic cos : (D)D
/*     */     //   482: d2f
/*     */     //   483: ldc 5.0
/*     */     //   485: fmul
/*     */     //   486: fadd
/*     */     //   487: putfield field_78798_e : F
/*     */     //   490: aload_0
/*     */     //   491: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   494: aload_0
/*     */     //   495: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   498: getfield field_78800_c : F
/*     */     //   501: aload_0
/*     */     //   502: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   505: getfield field_78796_g : F
/*     */     //   508: f2d
/*     */     //   509: invokestatic sin : (D)D
/*     */     //   512: d2f
/*     */     //   513: ldc 5.0
/*     */     //   515: fmul
/*     */     //   516: fadd
/*     */     //   517: putfield field_78800_c : F
/*     */     //   520: aload_0
/*     */     //   521: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   524: fload #9
/*     */     //   526: putfield field_78796_g : F
/*     */     //   529: fload_3
/*     */     //   530: f2d
/*     */     //   531: ldc2_w 0.1
/*     */     //   534: dcmpl
/*     */     //   535: ifgt -> 546
/*     */     //   538: aload #8
/*     */     //   540: invokevirtual getAttacking : ()I
/*     */     //   543: ifeq -> 572
/*     */     //   546: fload #4
/*     */     //   548: ldc 1.2
/*     */     //   550: fmul
/*     */     //   551: aload_0
/*     */     //   552: getfield wingspeed : F
/*     */     //   555: fmul
/*     */     //   556: invokestatic func_76134_b : (F)F
/*     */     //   559: ldc 3.1415927
/*     */     //   561: fmul
/*     */     //   562: ldc 0.2
/*     */     //   564: fmul
/*     */     //   565: fload_3
/*     */     //   566: fmul
/*     */     //   567: fstore #9
/*     */     //   569: goto -> 593
/*     */     //   572: fload #4
/*     */     //   574: ldc 1.2
/*     */     //   576: fmul
/*     */     //   577: aload_0
/*     */     //   578: getfield wingspeed : F
/*     */     //   581: fmul
/*     */     //   582: invokestatic func_76134_b : (F)F
/*     */     //   585: ldc 3.1415927
/*     */     //   587: fmul
/*     */     //   588: ldc 0.02
/*     */     //   590: fmul
/*     */     //   591: fstore #9
/*     */     //   593: aload_0
/*     */     //   594: getfield FinFrontLeft : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   597: fload #9
/*     */     //   599: ldc 0.523
/*     */     //   601: fsub
/*     */     //   602: putfield field_78795_f : F
/*     */     //   605: aload_0
/*     */     //   606: getfield FinFrontLeft : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   609: fload #9
/*     */     //   611: ldc 0.698
/*     */     //   613: fadd
/*     */     //   614: putfield field_78796_g : F
/*     */     //   617: aload_0
/*     */     //   618: getfield FinBackLeft : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   621: fload #9
/*     */     //   623: fneg
/*     */     //   624: ldc 0.523
/*     */     //   626: fsub
/*     */     //   627: putfield field_78795_f : F
/*     */     //   630: aload_0
/*     */     //   631: getfield FinBackLeft : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   634: fload #9
/*     */     //   636: fneg
/*     */     //   637: ldc 0.698
/*     */     //   639: fadd
/*     */     //   640: putfield field_78796_g : F
/*     */     //   643: aload_0
/*     */     //   644: getfield FinFrontRight : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   647: fload #9
/*     */     //   649: ldc 0.523
/*     */     //   651: fsub
/*     */     //   652: putfield field_78795_f : F
/*     */     //   655: aload_0
/*     */     //   656: getfield FinFrontRight : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   659: fload #9
/*     */     //   661: ldc 0.698
/*     */     //   663: fsub
/*     */     //   664: putfield field_78796_g : F
/*     */     //   667: aload_0
/*     */     //   668: getfield FinBackRight : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   671: fload #9
/*     */     //   673: fneg
/*     */     //   674: ldc 0.523
/*     */     //   676: fsub
/*     */     //   677: putfield field_78795_f : F
/*     */     //   680: aload_0
/*     */     //   681: getfield FinBackRight : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   684: fload #9
/*     */     //   686: fneg
/*     */     //   687: ldc 0.698
/*     */     //   689: fsub
/*     */     //   690: putfield field_78796_g : F
/*     */     //   693: fload_3
/*     */     //   694: f2d
/*     */     //   695: ldc2_w 0.1
/*     */     //   698: dcmpl
/*     */     //   699: ifgt -> 710
/*     */     //   702: aload #8
/*     */     //   704: invokevirtual getAttacking : ()I
/*     */     //   707: ifeq -> 741
/*     */     //   710: ldc 0.455
/*     */     //   712: fload_3
/*     */     //   713: fmul
/*     */     //   714: fload #4
/*     */     //   716: ldc 0.9
/*     */     //   718: fmul
/*     */     //   719: aload_0
/*     */     //   720: getfield wingspeed : F
/*     */     //   723: fmul
/*     */     //   724: invokestatic func_76134_b : (F)F
/*     */     //   727: ldc 3.1415927
/*     */     //   729: fmul
/*     */     //   730: ldc 0.25
/*     */     //   732: fmul
/*     */     //   733: fload_3
/*     */     //   734: fmul
/*     */     //   735: fadd
/*     */     //   736: fstore #9
/*     */     //   738: goto -> 762
/*     */     //   741: fload #4
/*     */     //   743: ldc 0.3
/*     */     //   745: fmul
/*     */     //   746: aload_0
/*     */     //   747: getfield wingspeed : F
/*     */     //   750: fmul
/*     */     //   751: invokestatic func_76134_b : (F)F
/*     */     //   754: ldc 3.1415927
/*     */     //   756: fmul
/*     */     //   757: ldc 0.02
/*     */     //   759: fmul
/*     */     //   760: fstore #9
/*     */     //   762: aload_0
/*     */     //   763: getfield NeckBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   766: ldc 0.455
/*     */     //   768: fload #9
/*     */     //   770: ldc 5.0
/*     */     //   772: fdiv
/*     */     //   773: fadd
/*     */     //   774: putfield field_78795_f : F
/*     */     //   777: aload_0
/*     */     //   778: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   781: aload_0
/*     */     //   782: getfield NeckBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   785: getfield field_78798_e : F
/*     */     //   788: aload_0
/*     */     //   789: getfield NeckBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   792: getfield field_78795_f : F
/*     */     //   795: f2d
/*     */     //   796: invokestatic sin : (D)D
/*     */     //   799: d2f
/*     */     //   800: ldc 9.0
/*     */     //   802: fmul
/*     */     //   803: fsub
/*     */     //   804: putfield field_78798_e : F
/*     */     //   807: aload_0
/*     */     //   808: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   811: aload_0
/*     */     //   812: getfield NeckBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   815: getfield field_78797_d : F
/*     */     //   818: aload_0
/*     */     //   819: getfield NeckBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   822: getfield field_78795_f : F
/*     */     //   825: f2d
/*     */     //   826: invokestatic cos : (D)D
/*     */     //   829: d2f
/*     */     //   830: ldc 9.0
/*     */     //   832: fmul
/*     */     //   833: fsub
/*     */     //   834: putfield field_78797_d : F
/*     */     //   837: aload_0
/*     */     //   838: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   841: aload_0
/*     */     //   842: getfield NeckBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   845: getfield field_78795_f : F
/*     */     //   848: fload #9
/*     */     //   850: ldc 4.0
/*     */     //   852: fdiv
/*     */     //   853: fadd
/*     */     //   854: putfield field_78795_f : F
/*     */     //   857: aload_0
/*     */     //   858: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   861: aload_0
/*     */     //   862: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   865: getfield field_78798_e : F
/*     */     //   868: aload_0
/*     */     //   869: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   872: getfield field_78795_f : F
/*     */     //   875: f2d
/*     */     //   876: invokestatic sin : (D)D
/*     */     //   879: d2f
/*     */     //   880: ldc 9.0
/*     */     //   882: fmul
/*     */     //   883: fsub
/*     */     //   884: putfield field_78798_e : F
/*     */     //   887: aload_0
/*     */     //   888: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   891: aload_0
/*     */     //   892: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   895: getfield field_78797_d : F
/*     */     //   898: aload_0
/*     */     //   899: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   902: getfield field_78795_f : F
/*     */     //   905: f2d
/*     */     //   906: invokestatic cos : (D)D
/*     */     //   909: d2f
/*     */     //   910: ldc 9.0
/*     */     //   912: fmul
/*     */     //   913: fsub
/*     */     //   914: putfield field_78797_d : F
/*     */     //   917: aload_0
/*     */     //   918: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   921: aload_0
/*     */     //   922: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   925: getfield field_78795_f : F
/*     */     //   928: fload #9
/*     */     //   930: ldc 3.0
/*     */     //   932: fdiv
/*     */     //   933: fadd
/*     */     //   934: putfield field_78795_f : F
/*     */     //   937: aload_0
/*     */     //   938: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   941: aload_0
/*     */     //   942: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   945: getfield field_78798_e : F
/*     */     //   948: aload_0
/*     */     //   949: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   952: getfield field_78795_f : F
/*     */     //   955: f2d
/*     */     //   956: invokestatic sin : (D)D
/*     */     //   959: d2f
/*     */     //   960: ldc 9.0
/*     */     //   962: fmul
/*     */     //   963: fsub
/*     */     //   964: putfield field_78798_e : F
/*     */     //   967: aload_0
/*     */     //   968: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   971: aload_0
/*     */     //   972: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   975: getfield field_78797_d : F
/*     */     //   978: aload_0
/*     */     //   979: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   982: getfield field_78795_f : F
/*     */     //   985: f2d
/*     */     //   986: invokestatic cos : (D)D
/*     */     //   989: d2f
/*     */     //   990: ldc 9.0
/*     */     //   992: fmul
/*     */     //   993: fsub
/*     */     //   994: putfield field_78797_d : F
/*     */     //   997: aload_0
/*     */     //   998: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1001: aload_0
/*     */     //   1002: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1005: getfield field_78795_f : F
/*     */     //   1008: fload #9
/*     */     //   1010: fconst_2
/*     */     //   1011: fdiv
/*     */     //   1012: fadd
/*     */     //   1013: putfield field_78795_f : F
/*     */     //   1016: aload_0
/*     */     //   1017: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1020: aload_0
/*     */     //   1021: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1024: getfield field_78798_e : F
/*     */     //   1027: aload_0
/*     */     //   1028: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1031: getfield field_78795_f : F
/*     */     //   1034: f2d
/*     */     //   1035: invokestatic sin : (D)D
/*     */     //   1038: d2f
/*     */     //   1039: ldc 9.0
/*     */     //   1041: fmul
/*     */     //   1042: fsub
/*     */     //   1043: putfield field_78798_e : F
/*     */     //   1046: aload_0
/*     */     //   1047: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1050: aload_0
/*     */     //   1051: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1054: getfield field_78797_d : F
/*     */     //   1057: aload_0
/*     */     //   1058: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1061: getfield field_78795_f : F
/*     */     //   1064: f2d
/*     */     //   1065: invokestatic cos : (D)D
/*     */     //   1068: d2f
/*     */     //   1069: ldc 9.0
/*     */     //   1071: fmul
/*     */     //   1072: fsub
/*     */     //   1073: putfield field_78797_d : F
/*     */     //   1076: aload_0
/*     */     //   1077: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1080: aload_0
/*     */     //   1081: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1084: getfield field_78795_f : F
/*     */     //   1087: fload #9
/*     */     //   1089: fconst_2
/*     */     //   1090: fdiv
/*     */     //   1091: fsub
/*     */     //   1092: putfield field_78795_f : F
/*     */     //   1095: aload_0
/*     */     //   1096: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1099: aload_0
/*     */     //   1100: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1103: getfield field_78798_e : F
/*     */     //   1106: aload_0
/*     */     //   1107: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1110: getfield field_78795_f : F
/*     */     //   1113: f2d
/*     */     //   1114: invokestatic sin : (D)D
/*     */     //   1117: d2f
/*     */     //   1118: ldc 5.0
/*     */     //   1120: fmul
/*     */     //   1121: fsub
/*     */     //   1122: putfield field_78798_e : F
/*     */     //   1125: aload_0
/*     */     //   1126: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1129: aload_0
/*     */     //   1130: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1133: getfield field_78797_d : F
/*     */     //   1136: aload_0
/*     */     //   1137: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1140: getfield field_78795_f : F
/*     */     //   1143: f2d
/*     */     //   1144: invokestatic cos : (D)D
/*     */     //   1147: d2f
/*     */     //   1148: ldc 5.0
/*     */     //   1150: fmul
/*     */     //   1151: fsub
/*     */     //   1152: putfield field_78797_d : F
/*     */     //   1155: aload_0
/*     */     //   1156: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1159: aload_0
/*     */     //   1160: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1163: getfield field_78795_f : F
/*     */     //   1166: fload #9
/*     */     //   1168: ldc 3.0
/*     */     //   1170: fdiv
/*     */     //   1171: fsub
/*     */     //   1172: putfield field_78795_f : F
/*     */     //   1175: aload_0
/*     */     //   1176: getfield BottomJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1179: aload_0
/*     */     //   1180: getfield LeftEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1183: aload_0
/*     */     //   1184: getfield RightEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1187: aload_0
/*     */     //   1188: getfield TopJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1191: aload_0
/*     */     //   1192: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1195: getfield field_78798_e : F
/*     */     //   1198: aload_0
/*     */     //   1199: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1202: getfield field_78795_f : F
/*     */     //   1205: f2d
/*     */     //   1206: invokestatic sin : (D)D
/*     */     //   1209: d2f
/*     */     //   1210: ldc 5.0
/*     */     //   1212: fmul
/*     */     //   1213: fsub
/*     */     //   1214: dup_x1
/*     */     //   1215: putfield field_78798_e : F
/*     */     //   1218: dup_x1
/*     */     //   1219: putfield field_78798_e : F
/*     */     //   1222: dup_x1
/*     */     //   1223: putfield field_78798_e : F
/*     */     //   1226: putfield field_78798_e : F
/*     */     //   1229: aload_0
/*     */     //   1230: getfield BottomJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1233: aload_0
/*     */     //   1234: getfield LeftEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1237: aload_0
/*     */     //   1238: getfield RightEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1241: aload_0
/*     */     //   1242: getfield TopJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1245: aload_0
/*     */     //   1246: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1249: getfield field_78797_d : F
/*     */     //   1252: aload_0
/*     */     //   1253: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1256: getfield field_78795_f : F
/*     */     //   1259: f2d
/*     */     //   1260: invokestatic cos : (D)D
/*     */     //   1263: d2f
/*     */     //   1264: ldc 5.0
/*     */     //   1266: fmul
/*     */     //   1267: fsub
/*     */     //   1268: dup_x1
/*     */     //   1269: putfield field_78797_d : F
/*     */     //   1272: dup_x1
/*     */     //   1273: putfield field_78797_d : F
/*     */     //   1276: dup_x1
/*     */     //   1277: putfield field_78797_d : F
/*     */     //   1280: putfield field_78797_d : F
/*     */     //   1283: fload #5
/*     */     //   1285: f2d
/*     */     //   1286: invokestatic toRadians : (D)D
/*     */     //   1289: d2f
/*     */     //   1290: ldc 0.5
/*     */     //   1292: fmul
/*     */     //   1293: fstore #9
/*     */     //   1295: aload_0
/*     */     //   1296: getfield BottomJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1299: aload_0
/*     */     //   1300: getfield LeftEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1303: aload_0
/*     */     //   1304: getfield RightEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1307: aload_0
/*     */     //   1308: getfield TopJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1311: fload #9
/*     */     //   1313: dup_x1
/*     */     //   1314: putfield field_78796_g : F
/*     */     //   1317: dup_x1
/*     */     //   1318: putfield field_78796_g : F
/*     */     //   1321: dup_x1
/*     */     //   1322: putfield field_78796_g : F
/*     */     //   1325: putfield field_78796_g : F
/*     */     //   1328: aload #8
/*     */     //   1330: invokevirtual getAttacking : ()I
/*     */     //   1333: ifeq -> 1372
/*     */     //   1336: fload #4
/*     */     //   1338: ldc 1.7
/*     */     //   1340: fmul
/*     */     //   1341: aload_0
/*     */     //   1342: getfield wingspeed : F
/*     */     //   1345: fmul
/*     */     //   1346: invokestatic func_76134_b : (F)F
/*     */     //   1349: ldc 3.1415927
/*     */     //   1351: fmul
/*     */     //   1352: ldc 0.17
/*     */     //   1354: fmul
/*     */     //   1355: fstore #9
/*     */     //   1357: aload_0
/*     */     //   1358: getfield BottomJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1361: ldc 0.45
/*     */     //   1363: fload #9
/*     */     //   1365: fadd
/*     */     //   1366: putfield field_78795_f : F
/*     */     //   1369: goto -> 1405
/*     */     //   1372: fload #4
/*     */     //   1374: ldc 0.2
/*     */     //   1376: fmul
/*     */     //   1377: aload_0
/*     */     //   1378: getfield wingspeed : F
/*     */     //   1381: fmul
/*     */     //   1382: invokestatic func_76134_b : (F)F
/*     */     //   1385: ldc 3.1415927
/*     */     //   1387: fmul
/*     */     //   1388: ldc 0.05
/*     */     //   1390: fmul
/*     */     //   1391: fstore #9
/*     */     //   1393: aload_0
/*     */     //   1394: getfield BottomJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1397: ldc 0.17
/*     */     //   1399: fload #9
/*     */     //   1401: fadd
/*     */     //   1402: putfield field_78795_f : F
/*     */     //   1405: aload_0
/*     */     //   1406: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1409: fload #7
/*     */     //   1411: invokevirtual func_78785_a : (F)V
/*     */     //   1414: aload_0
/*     */     //   1415: getfield TailBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1418: fload #7
/*     */     //   1420: invokevirtual func_78785_a : (F)V
/*     */     //   1423: aload_0
/*     */     //   1424: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1427: fload #7
/*     */     //   1429: invokevirtual func_78785_a : (F)V
/*     */     //   1432: aload_0
/*     */     //   1433: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1436: fload #7
/*     */     //   1438: invokevirtual func_78785_a : (F)V
/*     */     //   1441: aload_0
/*     */     //   1442: getfield BodyBack : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1445: fload #7
/*     */     //   1447: invokevirtual func_78785_a : (F)V
/*     */     //   1450: aload_0
/*     */     //   1451: getfield Neck6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1454: fload #7
/*     */     //   1456: invokevirtual func_78785_a : (F)V
/*     */     //   1459: aload_0
/*     */     //   1460: getfield BodyFront : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1463: fload #7
/*     */     //   1465: invokevirtual func_78785_a : (F)V
/*     */     //   1468: aload_0
/*     */     //   1469: getfield NeckBase : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1472: fload #7
/*     */     //   1474: invokevirtual func_78785_a : (F)V
/*     */     //   1477: aload_0
/*     */     //   1478: getfield Neck2 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1481: fload #7
/*     */     //   1483: invokevirtual func_78785_a : (F)V
/*     */     //   1486: aload_0
/*     */     //   1487: getfield Neck3 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1490: fload #7
/*     */     //   1492: invokevirtual func_78785_a : (F)V
/*     */     //   1495: aload_0
/*     */     //   1496: getfield Neck4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1499: fload #7
/*     */     //   1501: invokevirtual func_78785_a : (F)V
/*     */     //   1504: aload_0
/*     */     //   1505: getfield Neck5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1508: fload #7
/*     */     //   1510: invokevirtual func_78785_a : (F)V
/*     */     //   1513: aload_0
/*     */     //   1514: getfield BottomJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1517: fload #7
/*     */     //   1519: invokevirtual func_78785_a : (F)V
/*     */     //   1522: aload_0
/*     */     //   1523: getfield FinBackRight : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1526: fload #7
/*     */     //   1528: invokevirtual func_78785_a : (F)V
/*     */     //   1531: aload_0
/*     */     //   1532: getfield FinBackLeft : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1535: fload #7
/*     */     //   1537: invokevirtual func_78785_a : (F)V
/*     */     //   1540: aload_0
/*     */     //   1541: getfield FinFrontLeft : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1544: fload #7
/*     */     //   1546: invokevirtual func_78785_a : (F)V
/*     */     //   1549: aload_0
/*     */     //   1550: getfield FinFrontRight : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1553: fload #7
/*     */     //   1555: invokevirtual func_78785_a : (F)V
/*     */     //   1558: aload_0
/*     */     //   1559: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1562: fload #7
/*     */     //   1564: invokevirtual func_78785_a : (F)V
/*     */     //   1567: aload_0
/*     */     //   1568: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1571: fload #7
/*     */     //   1573: invokevirtual func_78785_a : (F)V
/*     */     //   1576: aload_0
/*     */     //   1577: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1580: fload #7
/*     */     //   1582: invokevirtual func_78785_a : (F)V
/*     */     //   1585: aload_0
/*     */     //   1586: getfield TopJaw : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1589: fload #7
/*     */     //   1591: invokevirtual func_78785_a : (F)V
/*     */     //   1594: aload_0
/*     */     //   1595: getfield RightEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1598: fload #7
/*     */     //   1600: invokevirtual func_78785_a : (F)V
/*     */     //   1603: aload_0
/*     */     //   1604: getfield LeftEye : Lnet/minecraft/client/model/ModelRenderer;
/*     */     //   1607: fload #7
/*     */     //   1609: invokevirtual func_78785_a : (F)V
/*     */     //   1612: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #187	-> 0
/*     */     //   #188	-> 6
/*     */     //   #189	-> 21
/*     */     //   #190	-> 36
/*     */     //   #191	-> 39
/*     */     //   #194	-> 43
/*     */     //   #195	-> 60
/*     */     //   #197	-> 86
/*     */     //   #201	-> 89
/*     */     //   #202	-> 101
/*     */     //   #203	-> 131
/*     */     //   #204	-> 161
/*     */     //   #206	-> 173
/*     */     //   #207	-> 203
/*     */     //   #208	-> 233
/*     */     //   #210	-> 245
/*     */     //   #211	-> 275
/*     */     //   #212	-> 305
/*     */     //   #214	-> 317
/*     */     //   #215	-> 347
/*     */     //   #216	-> 377
/*     */     //   #218	-> 389
/*     */     //   #219	-> 419
/*     */     //   #220	-> 449
/*     */     //   #222	-> 460
/*     */     //   #223	-> 490
/*     */     //   #224	-> 520
/*     */     //   #226	-> 529
/*     */     //   #227	-> 546
/*     */     //   #229	-> 572
/*     */     //   #232	-> 593
/*     */     //   #233	-> 605
/*     */     //   #235	-> 617
/*     */     //   #236	-> 630
/*     */     //   #238	-> 643
/*     */     //   #239	-> 655
/*     */     //   #241	-> 667
/*     */     //   #242	-> 680
/*     */     //   #245	-> 693
/*     */     //   #246	-> 710
/*     */     //   #248	-> 741
/*     */     //   #252	-> 762
/*     */     //   #254	-> 777
/*     */     //   #255	-> 807
/*     */     //   #256	-> 837
/*     */     //   #258	-> 857
/*     */     //   #259	-> 887
/*     */     //   #260	-> 917
/*     */     //   #262	-> 937
/*     */     //   #263	-> 967
/*     */     //   #264	-> 997
/*     */     //   #266	-> 1016
/*     */     //   #267	-> 1046
/*     */     //   #268	-> 1076
/*     */     //   #270	-> 1095
/*     */     //   #271	-> 1125
/*     */     //   #272	-> 1155
/*     */     //   #274	-> 1175
/*     */     //   #275	-> 1229
/*     */     //   #280	-> 1283
/*     */     //   #281	-> 1295
/*     */     //   #283	-> 1328
/*     */     //   #284	-> 1336
/*     */     //   #285	-> 1357
/*     */     //   #287	-> 1372
/*     */     //   #288	-> 1393
/*     */     //   #293	-> 1405
/*     */     //   #294	-> 1414
/*     */     //   #295	-> 1423
/*     */     //   #296	-> 1432
/*     */     //   #297	-> 1441
/*     */     //   #298	-> 1450
/*     */     //   #299	-> 1459
/*     */     //   #300	-> 1468
/*     */     //   #301	-> 1477
/*     */     //   #302	-> 1486
/*     */     //   #303	-> 1495
/*     */     //   #304	-> 1504
/*     */     //   #305	-> 1513
/*     */     //   #306	-> 1522
/*     */     //   #307	-> 1531
/*     */     //   #308	-> 1540
/*     */     //   #309	-> 1549
/*     */     //   #310	-> 1558
/*     */     //   #311	-> 1567
/*     */     //   #312	-> 1576
/*     */     //   #313	-> 1585
/*     */     //   #314	-> 1594
/*     */     //   #315	-> 1603
/*     */     //   #317	-> 1612
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1613	0	this	Ldanger/orespawn/ModelSeaMonster;
/*     */     //   0	1613	1	entity	Lnet/minecraft/entity/Entity;
/*     */     //   0	1613	2	f	F
/*     */     //   0	1613	3	f1	F
/*     */     //   0	1613	4	f2	F
/*     */     //   0	1613	5	f3	F
/*     */     //   0	1613	6	f4	F
/*     */     //   0	1613	7	f5	F
/*     */     //   6	1607	8	e	Ldanger/orespawn/SeaMonster;
/*     */     //   39	1574	9	newangle	F
/*     */     //   43	1570	10	pi4	F
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
/* 321 */     model.field_78795_f = x;
/* 322 */     model.field_78796_g = y;
/* 323 */     model.field_78808_h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 328 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelSeaMonster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */