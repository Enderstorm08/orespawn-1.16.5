/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.EnumDifficulty;
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
/*     */ public class Robot4
/*     */   extends EntityMob
/*     */ {
/*  57 */   private GenericTargetSorter TargetSorter = null;
/*  58 */   private RenderInfo renderdata = new RenderInfo();
/*  59 */   private int reload_ticker = 0;
/*  60 */   private int was_attacked_ticker = 0;
/*  61 */   private float moveSpeed = 0.34F;
/*     */ 
/*     */   
/*     */   public Robot4(World par1World) {
/*  65 */     super(par1World);
/*     */     
/*  67 */     func_70105_a(2.5F, 4.0F);
/*  68 */     func_70661_as().func_75491_a(true);
/*  69 */     this.field_70728_aV = 120;
/*  70 */     this.field_70174_ab = 120;
/*  71 */     this.field_70178_ae = true;
/*  72 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  73 */     this.renderdata = new RenderInfo();
/*  74 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  75 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  76 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  77 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  78 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  79 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  84 */     super.func_110147_ax();
/*  85 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  86 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  87 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Robot4_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  92 */     super.func_70088_a();
/*  93 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  94 */     this.field_70180_af.func_75682_a(21, Byte.valueOf((byte)0));
/*  95 */     if (this.renderdata == null) {
/*  96 */       this.renderdata = new RenderInfo();
/*     */     }
/*  98 */     this.renderdata.rf1 = 0.0F;
/*  99 */     this.renderdata.rf2 = 0.0F;
/* 100 */     this.renderdata.rf3 = 0.0F;
/* 101 */     this.renderdata.rf4 = 0.0F;
/* 102 */     this.renderdata.ri1 = 0;
/* 103 */     this.renderdata.ri2 = 0;
/* 104 */     this.renderdata.ri3 = 0;
/* 105 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 110 */     if (func_104002_bU()) return false; 
/* 111 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 119 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 120 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 125 */     return OreSpawnMain.Robot4_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRobot4Health() {
/* 131 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 138 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 143 */     this.renderdata.rf1 = r.rf1;
/* 144 */     this.renderdata.rf2 = r.rf2;
/* 145 */     this.renderdata.rf3 = r.rf3;
/* 146 */     this.renderdata.rf4 = r.rf4;
/* 147 */     this.renderdata.ri1 = r.ri1;
/* 148 */     this.renderdata.ri2 = r.ri2;
/* 149 */     this.renderdata.ri3 = r.ri3;
/* 150 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 158 */     return OreSpawnMain.Robot4_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 166 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 172 */     this.field_70181_x += 0.25D;
/* 173 */     super.func_70664_aZ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 182 */     super.func_70636_d();
/*     */     
/* 184 */     if (this.field_70170_p.field_72995_K) {
/* 185 */       if (this.field_70146_Z.nextInt(3) == 1) {
/* 186 */         this.field_70170_p.func_72869_a("smoke", this.field_70165_t - 1.25D * Math.sin(Math.toRadians((this.field_70177_z + 180.0F))), this.field_70163_u + 3.0D + this.field_70170_p.field_73012_v.nextFloat(), this.field_70161_v + 1.25D * Math.cos(Math.toRadians((this.field_70177_z + 180.0F))), 0.0D, this.field_70170_p.field_73012_v.nextFloat() / 2.0D, 0.0D);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 191 */       if (getAttacking() != 0) {
/* 192 */         this.field_70170_p.func_72869_a("reddust", this.field_70165_t - 1.55D * Math.sin(Math.toRadians((this.field_70177_z + 35.0F))), this.field_70163_u + 2.25D + this.field_70170_p.field_73012_v.nextFloat(), this.field_70161_v + 1.55D * Math.cos(Math.toRadians((this.field_70177_z + 35.0F))), 0.0D, this.field_70170_p.field_73012_v.nextFloat(), 0.0D);
/*     */       }
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
/*     */ 
/*     */   
/*     */   public int getAttackStrength(Entity par1Entity) {
/* 207 */     int var2 = 0;
/* 208 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY) {
/*     */       
/* 210 */       var2 = 15;
/* 211 */       if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) {
/*     */         
/* 213 */         var2 = 20;
/*     */       }
/* 215 */       else if (this.field_70170_p.field_73013_u == EnumDifficulty.HARD) {
/*     */         
/* 217 */         var2 = 25;
/*     */       } 
/*     */     } 
/* 220 */     return var2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 228 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 229 */       return "orespawn:robot_living";
/*     */     }
/* 231 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 239 */     return "orespawn:robot_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 247 */     return "orespawn:robot_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 254 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 261 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 269 */     return Items.field_151128_bU;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 275 */     EntityItem var3 = null;
/* 276 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 278 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*     */     
/* 280 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 281 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 289 */     ItemStack is = null;
/*     */ 
/*     */     
/* 292 */     int var5 = 5 + this.field_70170_p.field_73012_v.nextInt(10); int var4;
/* 293 */     for (var4 = 0; var4 < var5; var4++) {
/* 294 */       dropItemRand(OreSpawnMain.MyLaserBall, 4);
/*     */     }
/*     */     
/* 297 */     dropItemRand(OreSpawnMain.MyRayGun, 1);
/* 298 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 300 */     int i = 10 + this.field_70170_p.field_73012_v.nextInt(15);
/* 301 */     for (var4 = 0; var4 < i; var4++) {
/* 302 */       int var3 = this.field_70170_p.field_73012_v.nextInt(15);
/* 303 */       switch (var3) {
/*     */         case 0:
/* 305 */           is = dropItemRand(Items.field_151137_ax, 1);
/*     */           break;
/*     */         case 1:
/* 308 */           is = dropItemRand(Items.field_151107_aW, 1);
/*     */           break;
/*     */         case 2:
/* 311 */           is = dropItemRand(Items.field_151132_bS, 1);
/*     */           break;
/*     */         case 3:
/* 314 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */           break;
/*     */         case 4:
/* 317 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150367_z), 1);
/*     */           break;
/*     */         case 5:
/* 320 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150320_F), 1);
/*     */           break;
/*     */         case 6:
/* 323 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150331_J), 1);
/*     */           break;
/*     */         case 7:
/* 326 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150442_at), 1);
/*     */           break;
/*     */         case 8:
/* 329 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */           break;
/*     */         case 9:
/* 332 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150445_bS), 1);
/*     */           break;
/*     */       } 
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 346 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 354 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */       
/* 356 */       double ks = 2.0D;
/* 357 */       double inair = 0.12D;
/* 358 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 359 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 360 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */     } 
/* 362 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 367 */     if (this.field_70128_L)
/* 368 */       return;  super.func_70619_bc();
/* 369 */     if (this.reload_ticker > 0) {
/* 370 */       this.reload_ticker--;
/*     */     }
/* 372 */     if (this.was_attacked_ticker > 0) {
/* 373 */       this.was_attacked_ticker--;
/*     */     }
/* 375 */     if (this.reload_ticker == 0 && this.field_70170_p.field_73012_v.nextInt(8) == 1) {
/* 376 */       EntityLivingBase e = null;
/* 377 */       if (this.field_70170_p.field_73012_v.nextInt(50) == 1) func_70624_b(null); 
/* 378 */       e = func_70638_az();
/* 379 */       if (e != null && !e.func_70089_S()) {
/* 380 */         func_70624_b(null);
/* 381 */         e = null;
/*     */       } 
/* 383 */       if (e == null) {
/* 384 */         e = findSomethingToAttack();
/*     */       }
/* 386 */       if (e != null) {
/* 387 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 388 */         if (func_70068_e((Entity)e) < 256.0D) {
/* 389 */           if (func_70068_e((Entity)e) < ((3.0F + e.field_70130_N / 2.0F) * (3.0F + e.field_70130_N / 2.0F))) {
/* 390 */             func_70652_k((Entity)e);
/*     */           }
/*     */           else {
/*     */             
/* 394 */             double rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/* 395 */             double rhdir = Math.toRadians(((this.field_70759_as + 90.0F) % 360.0F));
/*     */             
/* 397 */             double pi = 3.1415926545D;
/*     */             
/* 399 */             double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 400 */             if (rdd > pi) rdd -= pi * 2.0D; 
/* 401 */             rdd = Math.abs(rdd);
/*     */             
/* 403 */             if (rdd < 0.5D) {
/* 404 */               double yoff = 2.0D;
/* 405 */               double xzoff = 1.75D;
/* 406 */               LaserBall var2 = new LaserBall(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 407 */               var2.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians((this.field_70177_z + 45.0F))), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians((this.field_70177_z + 45.0F))), this.field_70177_z, this.field_70125_A);
/* 408 */               double var3 = e.field_70165_t - var2.field_70165_t;
/* 409 */               double var5 = e.field_70163_u - var2.field_70163_u;
/* 410 */               double var7 = e.field_70161_v - var2.field_70161_v;
/* 411 */               float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 412 */               var2.func_70186_c(var3, var5 + var9, var7, 2.0F, 4.0F);
/* 413 */               if (func_70068_e((Entity)e) > 65.0D) {
/* 414 */                 var2.setSpecial();
/* 415 */                 this.reload_ticker = 30;
/* 416 */                 this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 3.5F, 0.5F);
/*     */               } else {
/* 418 */                 this.reload_ticker = 10;
/* 419 */                 this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 2.5F, 1.0F);
/*     */               } 
/* 421 */               this.field_70170_p.func_72838_d((Entity)var2);
/*     */             } 
/* 423 */             setAttacking(1);
/*     */           } 
/* 425 */           func_70661_as().func_75497_a((Entity)e, 0.75D);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 430 */     if (this.reload_ticker <= 0 && this.was_attacked_ticker <= 0) {
/* 431 */       setAttacking(0);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 440 */     boolean ret = false;
/* 441 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 442 */       if (getShielding() != 0 || this.was_attacked_ticker != 0)
/*     */       {
/* 444 */         return false;
/*     */       }
/* 446 */       this.was_attacked_ticker = 65;
/* 447 */       setAttacking(1);
/* 448 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 449 */       Entity e = par1DamageSource.func_76346_g();
/* 450 */       if (e != null && e instanceof EntityLiving) {
/*     */         
/* 452 */         func_70624_b((EntityLivingBase)e);
/* 453 */         func_70784_b(e);
/* 454 */         func_70661_as().func_75497_a(e, 1.2D);
/* 455 */         ret = true;
/*     */       } 
/* 457 */       return ret;
/*     */     } 
/* 459 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 469 */     if (par1EntityLiving == null)
/*     */     {
/* 471 */       return false;
/*     */     }
/* 473 */     if (par1EntityLiving == this)
/*     */     {
/* 475 */       return false;
/*     */     }
/* 477 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 479 */       return false;
/*     */     }
/*     */     
/* 482 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 484 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 487 */       return false;
/*     */     }
/*     */     
/* 490 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 492 */       return false;
/*     */     }
/* 494 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 496 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 497 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 498 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 502 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 507 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 508 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 4.0D, 16.0D));
/* 509 */     Collections.sort(var5, this.TargetSorter);
/* 510 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 512 */     while (var2.hasNext()) {
/*     */       
/* 514 */       Entity var3 = (Entity)var2.next();
/* 515 */       EntityLivingBase var4 = (EntityLivingBase)var3;
/*     */       
/* 517 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 519 */         return var4;
/*     */       }
/*     */     } 
/* 522 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 528 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 532 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getShielding() {
/* 537 */     return this.field_70180_af.func_75683_a(21);
/*     */   }
/*     */   
/*     */   public final void setShielding(int par1) {
/* 541 */     this.field_70180_af.func_75692_b(21, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 553 */     for (k = -3; k < 3; k++) {
/*     */       
/* 555 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 557 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 559 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 560 */           if (bid == Blocks.field_150474_ac) {
/* 561 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 562 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 563 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 564 */             if (s != null && 
/* 565 */               s.equals("Robo-Warrior")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 572 */     if (this.field_70163_u < 50.0D) return false; 
/* 573 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 577 */     for (k = -1; k < 1; k++) {
/*     */       
/* 579 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 581 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 583 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 584 */           if (bid != Blocks.field_150350_a && bid != Blocks.field_150329_H) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 588 */     if (!func_70814_o()) return false; 
/* 589 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Robot4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */