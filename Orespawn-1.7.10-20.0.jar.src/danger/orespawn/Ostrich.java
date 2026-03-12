/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAITempt;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
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
/*     */ public class Ostrich
/*     */   extends EntityCannonFodder
/*     */ {
/*  48 */   private float moveSpeed = 0.2F;
/*  49 */   private RenderInfo renderdata = new RenderInfo();
/*     */   
/*     */   private int boatPosRotationIncrements;
/*     */   
/*     */   private double boatX;
/*     */   private double boatY;
/*     */   private double boatZ;
/*     */   private double boatYaw;
/*     */   private double boatPitch;
/*     */   private double boatYawHead;
/*     */   private double velocityX;
/*     */   private double velocityY;
/*     */   private double velocityZ;
/*  62 */   float deltasmooth = 0.0F;
/*  63 */   private int didjump = 0;
/*     */ 
/*     */   
/*     */   public Ostrich(World par1World) {
/*  67 */     super(par1World);
/*     */     
/*  69 */     func_70105_a(0.85F, 2.1F);
/*  70 */     this.moveSpeed = 0.38F;
/*  71 */     this.field_70174_ab = 100;
/*  72 */     func_70661_as().func_75491_a(true);
/*  73 */     func_70904_g(false);
/*  74 */     this.field_70728_aV = 10;
/*  75 */     this.renderdata = new RenderInfo();
/*  76 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  77 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
/*  78 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F));
/*  79 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.899999976158142D));
/*  80 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.field_151034_e, false));
/*  81 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  82 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
/*  83 */     this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 5.0F));
/*  84 */     this.field_70714_bg.func_75776_a(8, new MyEntityAIWander((EntityCreature)this, 1.0F));
/*  85 */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  86 */     this.field_70714_bg.func_75776_a(10, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  91 */     super.func_110147_ax();
/*  92 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  93 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  94 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  95 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(6.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/* 101 */     super.func_70088_a();
/* 102 */     func_70904_g(false);
/* 103 */     if (this.renderdata == null) {
/* 104 */       this.renderdata = new RenderInfo();
/*     */     }
/* 106 */     this.renderdata.rf1 = 0.0F;
/* 107 */     this.renderdata.rf2 = 0.0F;
/* 108 */     this.renderdata.rf3 = 0.0F;
/* 109 */     this.renderdata.rf4 = 0.0F;
/* 110 */     this.renderdata.ri1 = 0;
/* 111 */     this.renderdata.ri2 = 0;
/* 112 */     this.renderdata.ri3 = 0;
/* 113 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 120 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 125 */     this.renderdata.rf1 = r.rf1;
/* 126 */     this.renderdata.rf2 = r.rf2;
/* 127 */     this.renderdata.rf3 = r.rf3;
/* 128 */     this.renderdata.rf4 = r.rf4;
/* 129 */     this.renderdata.ri1 = r.ri1;
/* 130 */     this.renderdata.ri2 = r.ri2;
/* 131 */     this.renderdata.ri3 = r.ri3;
/* 132 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 140 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 141 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 150 */     super.func_70014_b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 158 */     super.func_70037_a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 166 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 167 */       super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 169 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70629_bd() {
/* 179 */     if (this.field_70128_L)
/* 180 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 181 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 0)
/*     */     {
/* 183 */       func_70691_i(1.0F);
/*     */     }
/*     */     
/* 186 */     if (this.field_70153_n != null)
/* 187 */       return;  super.func_70629_bd();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 196 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 202 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 207 */     return 25;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOstrichHealth() {
/* 214 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 222 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */     
/* 224 */     if (var2 != null)
/*     */     {
/* 226 */       if (var2.field_77994_a <= 0) {
/*     */         
/* 228 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 229 */         var2 = null;
/*     */       } 
/*     */     }
/*     */     
/* 233 */     if (super.func_70085_c(par1EntityPlayer)) {
/* 234 */       return true;
/*     */     }
/*     */     
/* 237 */     if (var2 != null && var2.func_77973_b() == Items.field_151034_e && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 239 */       if (!func_70909_n()) {
/*     */         
/* 241 */         if (!this.field_70170_p.field_72995_K)
/*     */         {
/* 243 */           if (this.field_70146_Z.nextInt(2) == 0)
/*     */           {
/* 245 */             func_70903_f(true);
/* 246 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 247 */             func_70908_e(true);
/* 248 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 249 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */           
/*     */           }
/*     */           else
/*     */           {
/* 254 */             func_70908_e(false);
/* 255 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */           }
/*     */         
/*     */         }
/*     */       }
/* 260 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */         
/* 262 */         if (this.field_70170_p.field_72995_K) {
/* 263 */           func_70908_e(true);
/* 264 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*     */         } 
/*     */         
/* 267 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 268 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */         }
/*     */       } 
/*     */       
/* 272 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 274 */         var2.field_77994_a--;
/* 275 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 277 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 280 */       return true;
/* 281 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */ 
/*     */       
/* 284 */       if (!this.field_70170_p.field_72995_K) {
/*     */         
/* 286 */         func_70903_f(false);
/* 287 */         func_152115_b("");
/* 288 */         func_70908_e(false);
/* 289 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */       } 
/* 291 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 293 */         var2.field_77994_a--;
/* 294 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 296 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 299 */       return true;
/*     */     } 
/*     */     
/* 302 */     if (var2 != null && func_70909_n() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 304 */       if (!this.field_70170_p.field_72995_K)
/*     */       {
/* 306 */         if (!func_70906_o()) {
/*     */           
/* 308 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v);
/* 309 */           if (bid == Blocks.field_150354_m || bid == Blocks.field_150351_n || bid == Blocks.field_150346_d || bid == Blocks.field_150458_ak || bid == Blocks.field_150349_c) {
/* 310 */             func_70904_g(true);
/*     */           }
/*     */         } else {
/* 313 */           func_70904_g(false);
/*     */         } 
/*     */       }
/* 316 */       return true;
/* 317 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 319 */       func_94058_c(var2.func_82833_r());
/* 320 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 322 */         var2.field_77994_a--;
/* 323 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 325 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 328 */       return true;
/*     */     } 
/* 330 */     if (var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/* 331 */       if (!this.field_70170_p.field_72995_K) {
/*     */         
/* 333 */         par1EntityPlayer.func_70078_a((Entity)this);
/*     */         
/* 335 */         func_70904_g(false);
/*     */       } 
/* 337 */       return true;
/*     */     } 
/*     */     
/* 340 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 349 */     if (func_70906_o())
/*     */     {
/* 351 */       return null;
/*     */     }
/* 353 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 361 */     return "orespawn:cryo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 369 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 377 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 385 */     return Items.field_151008_G;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 393 */     int var3 = 0;
/*     */     
/* 395 */     if (func_70909_n()) {
/*     */       
/* 397 */       var3 = this.field_70146_Z.nextInt(5);
/* 398 */       var3 += 2;
/* 399 */       for (int var4 = 0; var4 < var3; var4++)
/*     */       {
/* 401 */         func_145779_a(Item.func_150898_a((Block)Blocks.field_150328_O), 1);
/*     */       }
/*     */     } else {
/* 404 */       super.func_70628_a(par1, par2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 415 */     return func_70631_g_() ? ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.5F) : ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean shouldRiderSit() {
/* 425 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTrackingRange() {
/* 430 */     return 128;
/*     */   }
/*     */   
/*     */   public int getUpdateFrequency() {
/* 434 */     return 10;
/*     */   }
/*     */   
/*     */   public boolean sendsVelocityUpdates() {
/* 438 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 444 */     this.field_70181_x += 0.25D;
/* 445 */     super.func_70664_aZ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double func_70042_X() {
/* 453 */     return 1.4D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 458 */     if (this.field_70163_u < 50.0D) return false; 
/* 459 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 460 */     if (this.field_70170_p.field_73012_v.nextInt(4) != 1) return false; 
/* 461 */     Ostrich target = null;
/* 462 */     target = (Ostrich)this.field_70170_p.func_72857_a(Ostrich.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D), (Entity)this);
/* 463 */     if (target != null)
/*     */     {
/* 465 */       return false;
/*     */     }
/* 467 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70056_a(double par1, double par3, double par5, float par7, float par8, int par9) {
/* 479 */     this.boatPosRotationIncrements = 10;
/*     */ 
/*     */     
/* 482 */     this.boatX = par1;
/* 483 */     this.boatY = par3;
/* 484 */     this.boatZ = par5;
/* 485 */     this.boatYaw = par7;
/* 486 */     this.boatPitch = par8;
/* 487 */     this.boatYawHead = par9;
/* 488 */     this.field_70159_w = this.velocityX;
/* 489 */     this.field_70181_x = this.velocityY;
/* 490 */     this.field_70179_y = this.velocityZ;
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
/* 501 */     this.velocityX = this.field_70159_w = par1;
/* 502 */     this.velocityY = this.field_70181_x = par3;
/* 503 */     this.velocityZ = this.field_70179_y = par5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 512 */     List list = null;
/* 513 */     Entity listEntity = null;
/*     */ 
/*     */ 
/*     */     
/* 517 */     double d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/* 518 */     double d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 524 */     double obstruction_factor = 0.0D;
/*     */     
/* 526 */     double relative_g = 0.0D;
/*     */     
/* 528 */     double max_speed = 0.75D;
/* 529 */     double gh = 1.0D;
/*     */ 
/*     */ 
/*     */     
/* 533 */     double rt = 0.0D;
/*     */     
/* 535 */     double pi = 3.1415926545D;
/* 536 */     double deltav = 0.0D;
/*     */ 
/*     */     
/* 539 */     int dist = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 544 */     if (this.field_70153_n == null && !this.field_70170_p.field_72995_K) {
/* 545 */       super.func_70636_d();
/*     */       
/*     */       return;
/*     */     } 
/* 549 */     if (this.field_70128_L) {
/*     */       return;
/*     */     }
/* 552 */     if (this.field_70153_n == null) {
/* 553 */       float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 554 */       float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 555 */       this.field_70177_z += var8 / 5.0F;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 561 */     if (this.field_70170_p.field_72995_K) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 566 */       if (this.boatPosRotationIncrements > 0)
/*     */       {
/* 568 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/* 569 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/* 570 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/* 571 */         func_70107_b(d4, d5, d11);
/*     */         
/* 573 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/* 574 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/* 575 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/* 576 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/* 577 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/*     */ 
/*     */         
/* 580 */         this.boatPosRotationIncrements--;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 591 */     else if (this.field_70153_n != null) {
/* 592 */       EntityPlayer pp = (EntityPlayer)this.field_70153_n;
/*     */ 
/*     */ 
/*     */       
/* 596 */       if (this.field_70159_w < -2.0D) this.field_70159_w = -2.0D; 
/* 597 */       if (this.field_70159_w > 2.0D) this.field_70159_w = 2.0D; 
/* 598 */       if (this.field_70179_y < -2.0D) this.field_70179_y = -2.0D; 
/* 599 */       if (this.field_70179_y > 2.0D) this.field_70179_y = 2.0D; 
/* 600 */       double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 606 */       obstruction_factor = 0.0D;
/* 607 */       dist = 1 + (int)(velocity * 10.0D);
/*     */       
/* 609 */       for (int k = 0; k < dist; k++) {
/* 610 */         for (int i = 1; i < dist * 2; i++) {
/* 611 */           double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/* 612 */           double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/* 613 */           Block bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - 1 + k, (int)(this.field_70161_v + dz));
/* 614 */           if (bid != Blocks.field_150350_a) {
/* 615 */             obstruction_factor += 0.075D;
/*     */           }
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 622 */       this.field_70181_x += obstruction_factor;
/* 623 */       this.field_70163_u += obstruction_factor;
/* 624 */       if (this.field_70181_x > 4.0D) this.field_70181_x = 4.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 630 */       double d4 = this.field_70153_n.field_70177_z;
/* 631 */       d4 %= 360.0D;
/* 632 */       for (; d4 < 0.0D; d4 += 360.0D);
/* 633 */       double d5 = this.field_70177_z;
/* 634 */       d5 %= 360.0D;
/* 635 */       for (; d5 < 0.0D; d5 += 360.0D);
/* 636 */       relative_g = (d4 - d5) % 180.0D;
/* 637 */       for (; relative_g < 0.0D; relative_g += 180.0D);
/* 638 */       if (relative_g > 90.0D) relative_g -= 180.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 645 */       if (velocity > 0.01D) {
/*     */         
/* 647 */         d4 = 1.85D - velocity;
/* 648 */         d4 = Math.abs(d4);
/* 649 */         if (d4 < 0.01D) d4 = 0.01D; 
/* 650 */         if (d4 > 0.9D) d4 = 0.9D; 
/* 651 */         this.field_70177_z = this.field_70153_n.field_70177_z + (float)(relative_g * d4);
/*     */       } else {
/*     */         
/* 654 */         this.field_70177_z = this.field_70153_n.field_70177_z;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 660 */       this.field_70125_A = 2.0F * (float)velocity;
/* 661 */       func_70101_b(this.field_70177_z, this.field_70125_A);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 667 */       double newvelocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 675 */       double rr = Math.atan2(this.field_70153_n.field_70179_y, this.field_70153_n.field_70159_w);
/* 676 */       double rhm = Math.atan2(this.field_70179_y, this.field_70159_w);
/* 677 */       double rhdir = Math.toRadians(((this.field_70153_n.field_70177_z + 90.0F) % 360.0F));
/* 678 */       rt = 0.0D;
/* 679 */       pi = 3.1415926545D;
/* 680 */       deltav = 0.0D;
/* 681 */       float im = pp.field_70701_bs;
/*     */ 
/*     */       
/* 684 */       if (OreSpawnMain.flyup_keystate != 0)
/* 685 */       { if (this.didjump == 0) {
/* 686 */           this.field_70181_x++;
/* 687 */           this.field_70181_x += velocity * 6.0D;
/* 688 */           this.didjump = 20;
/*     */         }
/*     */          }
/* 691 */       else if (this.didjump > 0) { this.didjump--; }
/*     */ 
/*     */ 
/*     */       
/* 695 */       double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
/* 696 */       if (rdv > pi) rdv -= pi * 2.0D; 
/* 697 */       rdv = Math.abs(rdv);
/* 698 */       if (Math.abs(newvelocity) < 0.01D) rdv = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 706 */       if (rdv > 1.5D) newvelocity = -newvelocity;
/*     */       
/* 708 */       if (Math.abs(im) > 0.001F) {
/* 709 */         if (im > 0.0F) {
/* 710 */           deltav = 0.045D;
/* 711 */           if (this.deltasmooth < 0.0F) this.deltasmooth = 0.0F; 
/* 712 */           this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 713 */           if (this.deltasmooth > deltav) this.deltasmooth = (float)deltav;
/*     */         
/*     */         } else {
/* 716 */           max_speed = 0.25D;
/* 717 */           deltav = -0.03D;
/* 718 */           if (this.deltasmooth > 0.0F) this.deltasmooth = 0.0F; 
/* 719 */           this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
/* 720 */           if (this.deltasmooth < deltav) this.deltasmooth = (float)deltav; 
/*     */         } 
/* 722 */         newvelocity += this.deltasmooth;
/* 723 */         if (newvelocity >= 0.0D) {
/* 724 */           if (newvelocity > max_speed) newvelocity = max_speed; 
/* 725 */           this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 726 */           this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*     */         } else {
/* 728 */           if (newvelocity < -max_speed) newvelocity = -max_speed; 
/* 729 */           newvelocity = -newvelocity;
/* 730 */           this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/* 731 */           this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/*     */         }
/*     */       
/*     */       }
/* 735 */       else if (newvelocity >= 0.0D) {
/* 736 */         this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 737 */         this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*     */       } else {
/* 739 */         this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/* 740 */         this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 747 */       func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*     */ 
/*     */       
/* 750 */       this.field_70181_x -= 0.25D;
/* 751 */       this.field_70159_w *= 0.95D;
/* 752 */       this.field_70181_x *= 0.85D;
/* 753 */       this.field_70179_y *= 0.95D;
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
/* 780 */       if (this.field_70153_n != null && this.field_70153_n.field_70128_L)
/*     */       {
/* 782 */         this.field_70153_n = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70043_V() {
/* 790 */     if (this.field_70153_n != null) {
/*     */ 
/*     */ 
/*     */       
/* 794 */       float f = -0.15F;
/* 795 */       this.field_70153_n.func_70107_b(this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + func_70042_X() + this.field_70153_n.func_70033_W(), this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70908_e(boolean par1) {
/* 807 */     String s = "heart";
/*     */     
/* 809 */     if (!par1)
/*     */     {
/* 811 */       s = "smoke";
/*     */     }
/*     */     
/* 814 */     for (int i = 0; i < 20; i++) {
/*     */       
/* 816 */       double d0 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 817 */       double d1 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 818 */       double d2 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 819 */       this.field_70170_p.func_72869_a(s, this.field_70165_t + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), this.field_70163_u + 0.5D + this.field_70146_Z.nextFloat() * 1.5D, this.field_70161_v + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), d0, d1, d2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 841 */     if (func_70631_g_()) {
/* 842 */       func_110163_bv();
/* 843 */       return false;
/*     */     } 
/* 845 */     if (this.field_70153_n != null) {
/* 846 */       return false;
/*     */     }
/* 848 */     if (func_104002_bU()) return false; 
/* 849 */     if (func_70909_n()) return false; 
/* 850 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 855 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Ostrich spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 861 */     return new Ostrich(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 869 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 878 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Ostrich.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */