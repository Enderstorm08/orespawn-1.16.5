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
/*     */ public class Robot2
/*     */   extends EntityMob
/*     */ {
/*  57 */   private GenericTargetSorter TargetSorter = null;
/*  58 */   private RenderInfo renderdata = new RenderInfo();
/*  59 */   private int just_for_fun = 0;
/*  60 */   private float moveSpeed = 0.3F;
/*     */   
/*     */   public Robot2(World par1World) {
/*  63 */     super(par1World);
/*  64 */     func_70105_a(3.0F, 6.2F);
/*  65 */     func_70661_as().func_75491_a(true);
/*  66 */     this.field_70728_aV = 100;
/*  67 */     this.field_70174_ab = 200;
/*  68 */     this.field_70178_ae = true;
/*  69 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  70 */     this.renderdata = new RenderInfo();
/*  71 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  72 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  73 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  74 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
/*  75 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  76 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  81 */     super.func_110147_ax();
/*  82 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  83 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  84 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Robot2_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  89 */     super.func_70088_a();
/*  90 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  91 */     if (this.renderdata == null) {
/*  92 */       this.renderdata = new RenderInfo();
/*     */     }
/*  94 */     this.renderdata.rf1 = 0.0F;
/*  95 */     this.renderdata.rf2 = 0.0F;
/*  96 */     this.renderdata.rf3 = 0.0F;
/*  97 */     this.renderdata.rf4 = 0.0F;
/*  98 */     this.renderdata.ri1 = 0;
/*  99 */     this.renderdata.ri2 = 0;
/* 100 */     this.renderdata.ri3 = 0;
/* 101 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 105 */     if (func_104002_bU()) return false; 
/* 106 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 114 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 115 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 120 */     return OreSpawnMain.Robot2_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 127 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 132 */     this.renderdata.rf1 = r.rf1;
/* 133 */     this.renderdata.rf2 = r.rf2;
/* 134 */     this.renderdata.rf3 = r.rf3;
/* 135 */     this.renderdata.rf4 = r.rf4;
/* 136 */     this.renderdata.ri1 = r.ri1;
/* 137 */     this.renderdata.ri2 = r.ri2;
/* 138 */     this.renderdata.ri3 = r.ri3;
/* 139 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 147 */     return OreSpawnMain.Robot2_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 155 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 164 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 170 */     this.field_70181_x += 0.25D;
/* 171 */     super.func_70664_aZ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 180 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 181 */       return "orespawn:robot_living";
/*     */     }
/* 183 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 191 */     return "orespawn:robot_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 199 */     return "orespawn:robot_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 207 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 214 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 222 */     return Item.func_150898_a(Blocks.field_150339_S);
/*     */   }
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 226 */     EntityItem var3 = null;
/* 227 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 229 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*     */     
/* 231 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 232 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 240 */     ItemStack is = null;
/*     */ 
/*     */     
/* 243 */     int var5 = 2 + this.field_70170_p.field_73012_v.nextInt(8); int var4;
/* 244 */     for (var4 = 0; var4 < var5; var4++) {
/* 245 */       dropItemRand(Item.func_150898_a(Blocks.field_150339_S), 1);
/*     */     }
/*     */     
/* 248 */     var5 = 5 + this.field_70170_p.field_73012_v.nextInt(6);
/* 249 */     for (var4 = 0; var4 < var5; var4++) {
/* 250 */       dropItemRand(Items.field_151042_j, 1);
/*     */     }
/*     */ 
/*     */     
/* 254 */     int i = 5 + this.field_70170_p.field_73012_v.nextInt(10);
/* 255 */     for (var4 = 0; var4 < i; var4++) {
/* 256 */       int var3 = this.field_70170_p.field_73012_v.nextInt(15);
/* 257 */       switch (var3) {
/*     */         case 0:
/* 259 */           is = dropItemRand(Items.field_151137_ax, 1);
/*     */           break;
/*     */         case 1:
/* 262 */           is = dropItemRand(Items.field_151107_aW, 1);
/*     */           break;
/*     */         case 2:
/* 265 */           is = dropItemRand(Items.field_151132_bS, 1);
/*     */           break;
/*     */         case 3:
/* 268 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */           break;
/*     */         case 4:
/* 271 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150367_z), 1);
/*     */           break;
/*     */         case 5:
/* 274 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150320_F), 1);
/*     */           break;
/*     */         case 6:
/* 277 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150331_J), 1);
/*     */           break;
/*     */         case 7:
/* 280 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150442_at), 1);
/*     */           break;
/*     */         case 8:
/* 283 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */           break;
/*     */         case 9:
/* 286 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150445_bS), 1);
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
/* 300 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 306 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void destroyBlock(EntityLivingBase e) {
/* 312 */     double x = e.field_70165_t + this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat();
/* 313 */     double y = e.field_70163_u - 1.0D;
/* 314 */     double z = e.field_70161_v + this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat();
/*     */ 
/*     */     
/* 317 */     Block bid = this.field_70170_p.func_147439_a((int)x, (int)y, (int)z);
/* 318 */     if (bid == Blocks.field_150343_Z)
/* 319 */       return;  if (bid == Blocks.field_150357_h)
/* 320 */       return;  if (bid == Blocks.field_150371_ca)
/* 321 */       return;  if (bid == Blocks.field_150474_ac)
/* 322 */       return;  if (bid == Blocks.field_150451_bX)
/* 323 */       return;  if (bid == Blocks.field_150339_S)
/* 324 */       return;  if (bid == Blocks.field_150486_ae) {
/*     */       return;
/*     */     }
/* 327 */     if (bid != Blocks.field_150350_a && 
/* 328 */       this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)x, (int)y, (int)z, Blocks.field_150350_a);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void destroyNearbyBlocks() {
/* 337 */     for (int i = 0; i < 50; i++) {
/* 338 */       double x = this.field_70165_t + this.field_70170_p.field_73012_v.nextFloat() * 6.5D - this.field_70170_p.field_73012_v.nextFloat() * 6.5D;
/* 339 */       double y = this.field_70163_u + 0.1D + this.field_70170_p.field_73012_v.nextFloat() * 8.5D;
/* 340 */       double z = this.field_70161_v + this.field_70170_p.field_73012_v.nextFloat() * 6.5D - this.field_70170_p.field_73012_v.nextFloat() * 6.5D;
/*     */ 
/*     */       
/* 343 */       Block bid = this.field_70170_p.func_147439_a((int)x, (int)y, (int)z);
/* 344 */       if (bid != Blocks.field_150343_Z && 
/* 345 */         bid != Blocks.field_150357_h && 
/* 346 */         bid != Blocks.field_150371_ca && 
/* 347 */         bid != Blocks.field_150474_ac && 
/* 348 */         bid != Blocks.field_150451_bX && 
/* 349 */         bid != Blocks.field_150339_S && 
/* 350 */         bid != Blocks.field_150486_ae)
/*     */       {
/*     */         
/* 353 */         if (bid != Blocks.field_150350_a && 
/* 354 */           this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)x, (int)y, (int)z, Blocks.field_150350_a);
/*     */       
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void func_70619_bc() {
/* 361 */     if (this.field_70128_L)
/* 362 */       return;  super.func_70619_bc();
/* 363 */     if (this.field_70170_p.field_73012_v.nextInt(6) == 1 && OreSpawnMain.PlayNicely == 0) {
/* 364 */       EntityLivingBase e = null;
/* 365 */       if (this.field_70170_p.field_73012_v.nextInt(50) == 1) func_70624_b(null); 
/* 366 */       e = func_70638_az();
/* 367 */       if (e != null && !e.func_70089_S()) {
/* 368 */         func_70624_b(null);
/* 369 */         e = null;
/*     */       } 
/* 371 */       if (e == null) {
/* 372 */         e = findSomethingToAttack();
/*     */       }
/* 374 */       if (e != null) {
/*     */         
/* 376 */         double rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/* 377 */         double rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*     */         
/* 379 */         double pi = 3.1415926545D;
/*     */         
/* 381 */         double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 382 */         if (rdd > pi) rdd -= pi * 2.0D; 
/* 383 */         rdd = Math.abs(rdd);
/*     */         
/* 385 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 386 */         if (rdd < 1.25D) {
/* 387 */           if (func_70068_e((Entity)e) < ((5.0F + e.field_70130_N / 2.0F) * (5.0F + e.field_70130_N / 2.0F))) {
/* 388 */             setAttacking(1);
/*     */             
/* 390 */             if (this.field_70170_p.field_73012_v.nextInt(5) == 0 || this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*     */               
/* 392 */               func_70652_k((Entity)e);
/* 393 */               for (int i = 0; i < 6; ) { destroyBlock(e); i++; }
/*     */             
/*     */             } 
/* 396 */             destroyNearbyBlocks();
/*     */           } 
/*     */         } else {
/* 399 */           setAttacking(0);
/*     */         } 
/* 401 */         func_70661_as().func_75497_a((Entity)e, 1.0D);
/*     */       } else {
/* 403 */         setAttacking(0);
/*     */       } 
/*     */     } 
/* 406 */     if (getAttacking() == 0 && OreSpawnMain.PlayNicely == 0) {
/* 407 */       if (this.field_70170_p.field_73012_v.nextInt(450) == 1) {
/* 408 */         this.just_for_fun = 50;
/*     */       }
/* 410 */       if (this.just_for_fun > 0) this.just_for_fun--; 
/* 411 */       if (this.just_for_fun > 0) {
/* 412 */         setAttacking(1);
/* 413 */         if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 414 */           destroyNearbyBlocks();
/*     */         }
/*     */       } else {
/* 417 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 428 */     boolean ret = false;
/* 429 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 430 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 431 */       Entity e = par1DamageSource.func_76346_g();
/* 432 */       if (e != null && e instanceof EntityLiving) {
/*     */         
/* 434 */         func_70624_b((EntityLivingBase)e);
/* 435 */         func_70784_b(e);
/* 436 */         func_70661_as().func_75497_a(e, 1.2D);
/*     */       } 
/* 438 */       return ret;
/*     */     } 
/* 440 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 450 */     if (par1EntityLiving == null)
/*     */     {
/* 452 */       return false;
/*     */     }
/* 454 */     if (par1EntityLiving == this)
/*     */     {
/* 456 */       return false;
/*     */     }
/* 458 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 460 */       return false;
/*     */     }
/*     */     
/* 463 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 465 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 468 */       return false;
/*     */     }
/*     */     
/* 471 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 473 */       return false;
/*     */     }
/* 475 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 477 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 478 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 479 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 483 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 488 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 489 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(14.0D, 3.0D, 14.0D));
/* 490 */     Collections.sort(var5, this.TargetSorter);
/* 491 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 493 */     while (var2.hasNext()) {
/*     */       
/* 495 */       Entity var3 = (Entity)var2.next();
/* 496 */       EntityLivingBase var4 = (EntityLivingBase)var3;
/*     */       
/* 498 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 500 */         return var4;
/*     */       }
/*     */     } 
/* 503 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 509 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 514 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 526 */     for (k = -3; k < 3; k++) {
/*     */       
/* 528 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 530 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 532 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 533 */           if (bid == Blocks.field_150474_ac) {
/* 534 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 535 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 536 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 537 */             if (s != null && 
/* 538 */               s.equals("Robo-Pounder")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 545 */     if (this.field_70163_u < 50.0D) return false; 
/* 546 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 551 */     for (k = -1; k < 1; k++) {
/*     */       
/* 553 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 555 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 557 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 558 */           if (bid != Blocks.field_150350_a && bid != Blocks.field_150329_H) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 562 */     if (!func_70814_o()) return false;
/*     */     
/* 564 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Robot2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */