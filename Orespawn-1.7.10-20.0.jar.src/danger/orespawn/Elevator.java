/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.entity.EntityClientPlayerMP;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.network.play.client.C0CPacketInput;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.world.World;
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
/*     */ public class Elevator
/*     */   extends EntityLiving
/*     */ {
/*     */   private int boatPosRotationIncrements;
/*     */   private double boatX;
/*     */   private double boatY;
/*     */   private double boatZ;
/*     */   private double boatYaw;
/*     */   private double boatPitch;
/*     */   private double velocityX;
/*     */   private double velocityY;
/*     */   private double velocityZ;
/*  72 */   private int damage_counter = 100;
/*  73 */   private int exploding = 0;
/*  74 */   private int color = 1;
/*  75 */   private int playing = 0;
/*     */ 
/*     */ 
/*     */   
/*  79 */   private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "Elevator1.png");
/*  80 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "Elevator2.png");
/*  81 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "Elevator3.png");
/*  82 */   private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "Elevator4.png");
/*  83 */   private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "Elevator5.png");
/*  84 */   private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "Elevator6.png");
/*  85 */   private static final ResourceLocation texture7 = new ResourceLocation("orespawn", "Elevator7.png");
/*  86 */   private static final ResourceLocation texture8 = new ResourceLocation("orespawn", "Elevator8.png");
/*  87 */   private static final ResourceLocation texture9 = new ResourceLocation("orespawn", "Elevator9.png");
/*  88 */   private static final ResourceLocation texture10 = new ResourceLocation("orespawn", "Elevator10.png");
/*     */ 
/*     */   
/*     */   public Elevator(World par1World) {
/*  92 */     super(par1World);
/*  93 */     func_70105_a(1.25F, 1.0F);
/*  94 */     this.field_70153_n = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Elevator(World par1World, double par2, double par4, double par6) {
/*  99 */     this(par1World);
/* 100 */     func_70107_b(par2, par4 + this.field_70129_M, par6);
/* 101 */     this.field_70159_w = 0.0D;
/* 102 */     this.field_70181_x = 0.0D;
/* 103 */     this.field_70179_y = 0.0D;
/* 104 */     this.field_70169_q = par2;
/* 105 */     this.field_70167_r = par4;
/* 106 */     this.field_70166_s = par6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResourceLocation getTexture() {
/* 113 */     switch (getColor()) {
/*     */       case 1:
/* 115 */         return texture1;
/*     */       case 2:
/* 117 */         return texture2;
/*     */       case 3:
/* 119 */         return texture3;
/*     */       case 4:
/* 121 */         return texture4;
/*     */       case 5:
/* 123 */         return texture5;
/*     */       case 6:
/* 125 */         return texture6;
/*     */       case 7:
/* 127 */         return texture7;
/*     */       case 8:
/* 129 */         return texture8;
/*     */       case 9:
/* 131 */         return texture9;
/*     */       case 10:
/* 133 */         return texture10;
/*     */     } 
/* 135 */     return texture1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/* 141 */     super.func_110147_ax();
/* 142 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(60.0D);
/* 143 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.3300000429153442D);
/* 144 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/* 145 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 149 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean shouldRiderSit() {
/* 157 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTrackingRange() {
/* 162 */     return 128;
/*     */   }
/*     */   
/*     */   public int getUpdateFrequency() {
/* 166 */     return 10;
/*     */   }
/*     */   
/*     */   public boolean sendsVelocityUpdates() {
/* 170 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 184 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/* 189 */     super.func_70088_a();
/* 190 */     this.field_70180_af.func_75682_a(22, new Integer(0));
/* 191 */     this.field_70180_af.func_75682_a(23, new Integer(1));
/* 192 */     this.field_70180_af.func_75682_a(24, new Float(0.0F));
/* 193 */     this.field_70180_af.func_75682_a(20, new Integer(0));
/* 194 */     this.field_70180_af.func_75682_a(21, new Integer(0));
/* 195 */     func_110163_bv();
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
/*     */   public boolean func_70104_M() {
/* 220 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double func_70042_X() {
/* 228 */     return 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 236 */     boolean p = par1DamageSource.func_76346_g() instanceof EntityPlayer;
/* 237 */     if (this.field_70153_n != null && !p)
/*     */     {
/* 239 */       return false;
/*     */     }
/*     */     
/* 242 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 243 */       return false;
/*     */     }
/*     */     
/* 246 */     if (!this.field_70170_p.field_72995_K && !this.field_70128_L) {
/*     */       
/* 248 */       setForwardDirection(-getForwardDirection());
/* 249 */       setTimeSinceHit(10);
/* 250 */       setDamageTaken(getDamageTaken() + par2 * 10.0F);
/* 251 */       func_70018_K();
/* 252 */       boolean flag = (par1DamageSource.func_76346_g() instanceof EntityPlayer && ((EntityPlayer)par1DamageSource.func_76346_g()).field_71075_bZ.field_75098_d);
/*     */       
/* 254 */       if (flag || getDamageTaken() > 40.0F) {
/*     */         
/* 256 */         if (this.field_70153_n != null)
/*     */         {
/* 258 */           this.field_70153_n.func_70078_a((Entity)this);
/*     */         }
/*     */         
/* 261 */         if (!flag)
/*     */         {
/* 263 */           func_145779_a(OreSpawnMain.MyElevator, 1);
/*     */         }
/*     */         
/* 266 */         func_70106_y();
/*     */       } 
/*     */       
/* 269 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 273 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70057_ab() {
/* 284 */     setForwardDirection(-getForwardDirection());
/* 285 */     setTimeSinceHit(10);
/* 286 */     setDamageTaken(getDamageTaken() * 11.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70067_L() {
/* 294 */     return !this.field_70128_L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70056_a(double par1, double par3, double par5, float par7, float par8, int par9) {
/* 305 */     if (this.field_70153_n != null) {
/*     */       
/* 307 */       this.boatPosRotationIncrements = par9 + 8;
/*     */     }
/*     */     else {
/*     */       
/* 311 */       this.boatPosRotationIncrements = 6;
/*     */     } 
/*     */     
/* 314 */     this.boatX = par1;
/* 315 */     this.boatY = par3;
/* 316 */     this.boatZ = par5;
/* 317 */     this.boatYaw = par7;
/* 318 */     this.boatPitch = par8;
/* 319 */     this.field_70159_w = this.velocityX;
/* 320 */     this.field_70181_x = this.velocityY;
/* 321 */     this.field_70179_y = this.velocityZ;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70016_h(double par1, double par3, double par5) {
/* 332 */     this.velocityX = this.field_70159_w = par1;
/* 333 */     this.velocityY = this.field_70181_x = par3;
/* 334 */     this.velocityZ = this.field_70179_y = par5;
/*     */   }
/*     */   
/*     */   public void onLivingpdate() {
/* 338 */     if (this.field_70153_n == null) {
/* 339 */       func_70636_d();
/*     */     }
/* 341 */     func_70015_d(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 350 */     List<Entity> list = null;
/* 351 */     double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*     */ 
/*     */     
/* 354 */     double d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/* 355 */     double d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 361 */     double obstruction_factor = 0.0D;
/*     */     
/* 363 */     double relative_g = 0.0D;
/*     */     
/* 365 */     double max_speed = 0.85D;
/* 366 */     double gh = 0.75D;
/*     */     
/* 368 */     int dist = 2;
/*     */ 
/*     */     
/* 371 */     if (this.field_70128_L)
/* 372 */       return;  this.field_70160_al = true;
/*     */     
/* 374 */     if (getTimeSinceHit() > 0)
/*     */     {
/* 376 */       setTimeSinceHit(getTimeSinceHit() - 1);
/*     */     }
/*     */     
/* 379 */     if (getDamageTaken() > 0.0F)
/*     */     {
/* 381 */       setDamageTaken(getDamageTaken() - 1.0F);
/*     */     }
/*     */     
/* 384 */     this.field_70169_q = this.field_70165_t;
/* 385 */     this.field_70167_r = this.field_70163_u;
/* 386 */     this.field_70166_s = this.field_70161_v;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 393 */     if (velocity > 0.15D && this.field_70153_n != null) {
/*     */       
/* 395 */       double d4 = Math.cos(Math.toRadians((this.field_70177_z + 270.0F)));
/* 396 */       double d5 = Math.sin(Math.toRadians((this.field_70177_z + 270.0F)));
/*     */       
/* 398 */       Block bid = Blocks.field_150350_a; int i;
/* 399 */       for (i = 1; i < 10; i++) {
/* 400 */         bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - i, (int)this.field_70161_v);
/* 401 */         if (bid != Blocks.field_150350_a)
/*     */           break; 
/*     */       } 
/* 404 */       for (int j = 0; j < 1.0D + velocity * 10.0D; j++) {
/*     */         
/* 406 */         d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/* 407 */         d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*     */         
/* 409 */         if (this.field_70146_Z.nextBoolean()) {
/*     */           
/* 411 */           double d8 = this.field_70165_t - d4 * d6 * 0.8D + d5 * d7;
/* 412 */           double d9 = this.field_70161_v - d5 * d6 * 0.8D - d4 * d7;
/* 413 */           if (this.field_70146_Z.nextBoolean()) {
/* 414 */             this.field_70170_p.func_72869_a("smoke", d8, this.field_70163_u - 0.25D, d9, this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */           } else {
/* 416 */             this.field_70170_p.func_72869_a("reddust", d8, this.field_70163_u - 0.25D, d9, this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */           } 
/*     */         } else {
/*     */           
/* 420 */           double d8 = this.field_70165_t + d4 + d5 * d6 * 0.7D;
/* 421 */           double d9 = this.field_70161_v + d5 - d4 * d6 * 0.7D;
/* 422 */           if (this.field_70146_Z.nextBoolean()) {
/* 423 */             this.field_70170_p.func_72869_a("smoke", d8, this.field_70163_u - 0.225D, d9, this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */           } else {
/* 425 */             this.field_70170_p.func_72869_a("reddust", d8, this.field_70163_u - 0.225D, d9, this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */           } 
/* 427 */         }  if (bid == Blocks.field_150355_j || bid == Blocks.field_150358_i)
/*     */         {
/* 429 */           for (int k = 0; k < 5; k++) {
/* 430 */             this.field_70170_p.func_72869_a("splash", this.field_70165_t + this.field_70146_Z.nextFloat(), this.field_70163_u - i + 1.25D, this.field_70161_v + this.field_70146_Z.nextFloat(), this.field_70159_w / 2.0D, this.field_70181_x + velocity, this.field_70179_y / 2.0D);
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 439 */     if (this.playing > 0) this.playing--; 
/* 440 */     if (this.field_70153_n != null && this.playing == 0 && this.field_70170_p.field_73012_v.nextInt(80) == 1) {
/* 441 */       this.field_70170_p.func_72956_a(this.field_70153_n, "orespawn:hover", 0.45F, 1.0F);
/* 442 */       this.playing = 55;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 451 */     if (!this.field_70170_p.field_72995_K) {
/*     */       
/* 453 */       if (this.exploding > 0) this.exploding--; 
/* 454 */       if (this.exploding == 0 && velocity > 0.65D && this.field_70170_p.field_73012_v.nextInt(20000) == 1) {
/* 455 */         this.exploding = 45;
/* 456 */         this.playing = 50;
/*     */       } 
/* 458 */       setExploding(this.exploding);
/*     */     } else {
/* 460 */       this.exploding = getExploding();
/*     */     } 
/*     */     
/* 463 */     if (getExploding() > 0 && this.field_70153_n != null) {
/*     */ 
/*     */       
/* 466 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 467 */         this.field_70170_p.func_72956_a(this.field_70153_n, "random.explode", 0.55F, 0.75F + this.field_70170_p.field_73012_v.nextFloat());
/*     */       }
/*     */       
/* 470 */       for (int i = 0; i < 15; i++) {
/* 471 */         this.field_70170_p.func_72869_a("explode", (int)(this.field_70165_t + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 4.0F)), (int)(this.field_70163_u + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 4.0F)), (int)(this.field_70161_v + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 4.0F)), this.field_70159_w, 0.0D, this.field_70179_y);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 476 */         this.field_70170_p.func_72869_a("largeexplode", (int)(this.field_70165_t + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 2.0F)), (int)(this.field_70163_u + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 2.0F)), (int)(this.field_70161_v + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 2.0F)), this.field_70159_w, 0.0D, this.field_70179_y);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 481 */         this.field_70170_p.func_72869_a("smoke", (int)(this.field_70165_t + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 5.0F)), (int)(this.field_70163_u + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 5.0F)), (int)(this.field_70161_v + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 5.0F)), this.field_70159_w, 0.0D, this.field_70179_y);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 486 */         this.field_70170_p.func_72869_a("largesmoke", (int)(this.field_70165_t + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 3.0F)), (int)(this.field_70163_u + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 3.0F)), (int)(this.field_70161_v + ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 3.0F)), this.field_70159_w, 0.0D, this.field_70179_y);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 498 */     if (this.field_70170_p.field_72995_K) {
/*     */ 
/*     */ 
/*     */       
/* 502 */       if (this.field_70153_n == null) {
/* 503 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)((float)this.field_70163_u - (float)gh), (int)this.field_70161_v);
/* 504 */         if (bid != Blocks.field_150350_a) {
/* 505 */           this.field_70181_x += 0.06D;
/* 506 */           this.field_70163_u += 0.07D;
/* 507 */           this.boatY += 0.07D;
/*     */         } else {
/* 509 */           this.field_70181_x -= 0.003D;
/*     */         }
/*     */       
/* 512 */       } else if (this.field_70153_n instanceof EntityClientPlayerMP) {
/* 513 */         EntityClientPlayerMP pp = (EntityClientPlayerMP)this.field_70153_n;
/* 514 */         pp.field_71174_a.func_147297_a((Packet)new C03PacketPlayer.C05PacketPlayerLook(pp.field_70177_z, pp.field_70125_A, pp.field_70122_E));
/* 515 */         pp.field_71174_a.func_147297_a((Packet)new C0CPacketInput(pp.field_70702_br, pp.field_70701_bs, pp.field_71158_b.field_78901_c, pp.field_71158_b.field_78899_d));
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 520 */       if (this.boatPosRotationIncrements > 0)
/*     */       {
/* 522 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/* 523 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/* 524 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/* 525 */         func_70107_b(d4, d5, d11);
/*     */         
/* 527 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/* 528 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/* 529 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/* 530 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/* 531 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/*     */         
/* 533 */         this.boatPosRotationIncrements--;
/*     */ 
/*     */       
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */         
/* 541 */         double d4 = this.field_70165_t + this.field_70159_w;
/* 542 */         double d5 = this.field_70163_u + this.field_70181_x;
/* 543 */         double d11 = this.field_70161_v + this.field_70179_y;
/* 544 */         func_70107_b(d4, d5, d11);
/*     */ 
/*     */ 
/*     */         
/* 548 */         this.field_70159_w *= 0.99D;
/* 549 */         this.field_70181_x *= 0.95D;
/* 550 */         this.field_70179_y *= 0.99D;
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 565 */       if (this.field_70153_n != null) {
/* 566 */         gh = 1.25D;
/*     */       }
/* 568 */       Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)((float)this.field_70163_u - (float)gh), (int)this.field_70161_v);
/* 569 */       if (bid != Blocks.field_150350_a) {
/* 570 */         this.field_70181_x += 0.06D;
/* 571 */         this.field_70163_u += 0.1D;
/*     */         
/* 573 */         if (bid == Blocks.field_150329_H && this.field_70153_n != null && this.field_70170_p.field_73012_v.nextInt(200) == 1 && 
/* 574 */           this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)this.field_70165_t, (int)(this.field_70163_u - gh), (int)this.field_70161_v, Blocks.field_150350_a);
/*     */         
/* 576 */         if (bid == Blocks.field_150349_c && this.field_70153_n != null && this.field_70170_p.field_73012_v.nextInt(200) == 1 && 
/* 577 */           this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)this.field_70165_t, (int)(this.field_70163_u - gh), (int)this.field_70161_v, Blocks.field_150346_d);
/*     */       
/*     */       } else {
/* 580 */         this.field_70181_x -= 0.01D;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 586 */       if (this.field_70153_n != null) {
/* 587 */         EntityPlayer pp = (EntityPlayer)this.field_70153_n;
/*     */         
/* 589 */         obstruction_factor = 0.0D;
/* 590 */         dist = 3;
/* 591 */         dist += (int)(velocity * 8.0D);
/*     */         
/* 593 */         for (int k = 1; k < dist; k++) {
/* 594 */           for (int i = 1; i < dist * 2; i++) {
/* 595 */             double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 596 */             double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 597 */             bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/* 598 */             if (bid != Blocks.field_150350_a) {
/* 599 */               obstruction_factor += 0.05D;
/*     */             }
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 606 */         this.field_70181_x += obstruction_factor * 0.11D;
/* 607 */         this.field_70163_u += obstruction_factor * 0.11D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 617 */         double d4 = this.field_70153_n.field_70177_z;
/* 618 */         d4 %= 360.0D;
/* 619 */         for (; d4 < 0.0D; d4 += 360.0D);
/* 620 */         double d5 = this.field_70177_z;
/* 621 */         d5 %= 360.0D;
/* 622 */         for (; d5 < 0.0D; d5 += 360.0D);
/* 623 */         relative_g = (d4 - d5) % 180.0D;
/* 624 */         for (; relative_g < 0.0D; relative_g += 180.0D);
/* 625 */         if (relative_g > 90.0D) relative_g -= 180.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 632 */         if (velocity > 0.01D) {
/*     */           
/* 634 */           d4 = 1.85D - velocity;
/* 635 */           d4 = Math.abs(d4);
/* 636 */           if (d4 < 0.01D) d4 = 0.01D; 
/* 637 */           if (d4 > 0.9D) d4 = 0.9D; 
/* 638 */           this.field_70177_z = this.field_70153_n.field_70177_z + (float)(relative_g * d4);
/*     */         } else {
/*     */           
/* 641 */           this.field_70177_z = this.field_70153_n.field_70177_z;
/*     */         } 
/* 643 */         relative_g = Math.abs(relative_g) * velocity;
/* 644 */         if (relative_g > 50.0D) relative_g = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 649 */         this.field_70125_A = 10.0F * (float)velocity;
/* 650 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 656 */         double newvelocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/* 657 */         if (this.exploding != 0) {
/* 658 */           newvelocity -= 0.05D;
/* 659 */           if (newvelocity < 0.0D) newvelocity = 0.0D;
/*     */         
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 668 */         double rr = Math.atan2(this.field_70153_n.field_70179_y, this.field_70153_n.field_70159_w);
/* 669 */         double rhm = Math.atan2(this.field_70179_y, this.field_70159_w);
/* 670 */         double rhdir = Math.toRadians(((this.field_70153_n.field_70177_z + 90.0F) % 360.0F));
/* 671 */         double rt = 0.0D;
/*     */         
/* 673 */         double pi = 3.1415926545D;
/* 674 */         double deltav = 0.0D;
/* 675 */         float im = pp.field_70701_bs;
/*     */         
/* 677 */         if (OreSpawnMain.flyup_keystate != 0) max_speed++;
/*     */ 
/*     */         
/* 680 */         double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
/* 681 */         if (rdv > pi) rdv -= pi * 2.0D; 
/* 682 */         rdv = Math.abs(rdv);
/* 683 */         if (Math.abs(newvelocity) < 0.01D) rdv = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 691 */         if (rdv > 1.5D) newvelocity = -newvelocity;
/*     */         
/* 693 */         if (Math.abs(im) > 0.001F) {
/* 694 */           if (im > 0.0F) {
/* 695 */             deltav = 0.025D;
/* 696 */             if (max_speed > 1.0D) deltav += 0.15D;
/*     */           
/*     */           } else {
/* 699 */             max_speed = 0.35D;
/*     */             
/* 701 */             deltav = -0.02D;
/*     */           } 
/*     */           
/* 704 */           newvelocity += deltav;
/* 705 */           if (newvelocity >= 0.0D) {
/* 706 */             if (newvelocity > max_speed) newvelocity = max_speed; 
/* 707 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 708 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*     */           } else {
/* 710 */             if (newvelocity < -max_speed) newvelocity = -max_speed; 
/* 711 */             newvelocity = -newvelocity;
/* 712 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/* 713 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/*     */           }
/*     */         
/*     */         }
/* 717 */         else if (newvelocity >= 0.0D) {
/* 718 */           this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 719 */           this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*     */         } else {
/* 721 */           this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/* 722 */           this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/*     */         }
/*     */       
/*     */       }
/* 726 */       else if (this.field_70153_n == null) {
/* 727 */         this.field_70159_w = 0.0D;
/* 728 */         this.field_70179_y = 0.0D;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 734 */       func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 741 */       if (this.field_70123_F && velocity > 0.75D) {
/*     */ 
/*     */ 
/*     */         
/* 745 */         func_70106_y();
/* 746 */         int p = this.field_70170_p.field_73012_v.nextInt(10); int k;
/* 747 */         for (k = 0; k < 6 + p; k++) {
/* 748 */           func_145779_a(Items.field_151055_y, 1);
/*     */         }
/* 750 */         for (k = 0; k < 2; k++) {
/* 751 */           func_145779_a(Items.field_151045_i, 1);
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 756 */         this.field_70159_w *= 0.98D;
/* 757 */         this.field_70181_x *= 0.94D;
/* 758 */         this.field_70179_y *= 0.98D;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 766 */       list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b(0.25D, 0.0D, 0.25D));
/*     */       
/* 768 */       if (list != null && !list.isEmpty())
/*     */       {
/* 770 */         for (int l = 0; l < list.size(); l++) {
/*     */           
/* 772 */           Entity entity = list.get(l);
/*     */           
/* 774 */           if (entity != this.field_70153_n && entity.func_70104_M() && !(entity instanceof Girlfriend) && !(entity instanceof Boyfriend))
/*     */           {
/* 776 */             entity.func_70108_f((Entity)this);
/*     */           }
/*     */         } 
/*     */       }
/*     */       
/* 781 */       if (this.field_70153_n != null && this.field_70153_n.field_70128_L)
/*     */       {
/* 783 */         this.field_70153_n = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70043_V() {
/* 790 */     if (this.field_70153_n != null)
/*     */     {
/*     */       
/* 793 */       this.field_70153_n.func_70107_b(this.field_70165_t, this.field_70163_u + func_70042_X() + this.field_70153_n.func_70033_W(), this.field_70161_v);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 799 */     par1NBTTagCompound.func_74768_a("HoverColor", getColor());
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 804 */     this.color = par1NBTTagCompound.func_74762_e("HoverColor");
/* 805 */     if (this.color < 1) this.color = 1; 
/* 806 */     if (this.color > 10) this.color = 10; 
/* 807 */     setColor(this.color);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float func_70053_R() {
/* 813 */     return 0.25F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 821 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */     
/* 823 */     if (var2 != null && 
/* 824 */       var2.field_77994_a <= 0) {
/* 825 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 826 */       var2 = null;
/*     */     } 
/*     */ 
/*     */     
/* 830 */     if (var2 != null && var2.func_77973_b() == OreSpawnMain.MyUltimateSword && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/* 831 */       if (!this.field_70170_p.field_72995_K) {
/* 832 */         this.color++;
/* 833 */         if (this.color > 10) this.color = 1; 
/* 834 */         setColor(this.color);
/*     */       } 
/* 836 */       return true;
/*     */     } 
/*     */     
/* 839 */     if (this.field_70153_n != null && this.field_70153_n instanceof EntityPlayer && this.field_70153_n != par1EntityPlayer)
/*     */     {
/* 841 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 845 */     if (!this.field_70170_p.field_72995_K)
/*     */     {
/* 847 */       par1EntityPlayer.func_70078_a((Entity)this);
/*     */     }
/* 849 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDamageTaken(float f) {
/* 858 */     this.field_70180_af.func_75692_b(24, Float.valueOf(f));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getDamageTaken() {
/* 866 */     return this.field_70180_af.func_111145_d(24);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTimeSinceHit(int par1) {
/* 874 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTimeSinceHit() {
/* 882 */     return this.field_70180_af.func_75679_c(22);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setForwardDirection(int par1) {
/* 890 */     this.field_70180_af.func_75692_b(23, Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getForwardDirection() {
/* 898 */     return this.field_70180_af.func_75679_c(23);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setExploding(int par1) {
/* 903 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getExploding() {
/* 909 */     return this.field_70180_af.func_75679_c(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setColor(int par1) {
/* 914 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getColor() {
/* 920 */     return this.field_70180_af.func_75679_c(21);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Elevator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */