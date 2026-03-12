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
/*     */ public class SpitBug
/*     */   extends EntityMob
/*     */ {
/*  59 */   private GenericTargetSorter TargetSorter = null;
/*  60 */   private RenderInfo renderdata = new RenderInfo();
/*  61 */   private int force_sync = 50;
/*  62 */   private int hurt_timer = 0;
/*  63 */   private float moveSpeed = 0.33F;
/*  64 */   private int stream_count = 0;
/*     */ 
/*     */   
/*     */   public SpitBug(World par1World) {
/*  68 */     super(par1World);
/*     */     
/*  70 */     func_70105_a(2.0F, 2.0F);
/*  71 */     func_70661_as().func_75491_a(true);
/*  72 */     this.field_70728_aV = 50;
/*  73 */     this.field_70174_ab = 75;
/*  74 */     this.field_70178_ae = false;
/*  75 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  76 */     this.renderdata = new RenderInfo();
/*  77 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  78 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  79 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  80 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
/*  81 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  82 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  88 */     super.func_70088_a();
/*  89 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  90 */     if (this.renderdata == null) {
/*  91 */       this.renderdata = new RenderInfo();
/*     */     }
/*  93 */     this.renderdata.rf1 = 0.0F;
/*  94 */     this.renderdata.rf2 = 0.0F;
/*  95 */     this.renderdata.rf3 = 0.0F;
/*  96 */     this.renderdata.rf4 = 0.0F;
/*  97 */     this.renderdata.ri1 = 0;
/*  98 */     this.renderdata.ri2 = 0;
/*  99 */     this.renderdata.ri3 = 0;
/* 100 */     this.renderdata.ri4 = 0;
/* 101 */     this.force_sync = 50;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/* 106 */     super.func_110147_ax();
/* 107 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/* 108 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 109 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.SpitBug_stats.attack);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 113 */     if (func_104002_bU()) return false; 
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 122 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 123 */     super.func_70071_h_();
/* 124 */     if (this.field_70160_al)
/*     */     {
/*     */       
/* 127 */       func_70661_as().func_75484_a(null, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 133 */     return OreSpawnMain.SpitBug_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 141 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 146 */     this.renderdata.rf1 = r.rf1;
/* 147 */     this.renderdata.rf2 = r.rf2;
/* 148 */     this.renderdata.rf3 = r.rf3;
/* 149 */     this.renderdata.rf4 = r.rf4;
/* 150 */     this.renderdata.ri1 = r.ri1;
/* 151 */     this.renderdata.ri2 = r.ri2;
/* 152 */     this.renderdata.ri3 = r.ri3;
/* 153 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 161 */     return OreSpawnMain.SpitBug_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 169 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 178 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 185 */     this.field_70181_x += 0.75D;
/* 186 */     this.field_70163_u += 0.75D;
/* 187 */     float f = 0.2F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.45F);
/* 188 */     this.field_70159_w -= f * Math.sin(Math.toRadians(this.field_70759_as));
/* 189 */     this.field_70179_y += f * Math.cos(Math.toRadians(this.field_70759_as));
/* 190 */     this.field_70160_al = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void jumpAtEntity(EntityLivingBase e) {
/* 196 */     this.field_70181_x += 0.75D;
/* 197 */     this.field_70163_u += 0.75D;
/* 198 */     float f = 0.2F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.25F);
/* 199 */     float d = (float)Math.atan2(e.field_70165_t - this.field_70165_t, e.field_70161_v - this.field_70161_v);
/* 200 */     this.field_70159_w += f * Math.sin(d);
/* 201 */     this.field_70179_y += f * Math.cos(d);
/* 202 */     this.field_70160_al = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSpitBugHealth() {
/* 209 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 218 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 219 */       return "orespawn:clatter";
/*     */     }
/* 221 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 229 */     return "orespawn:crunch";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 237 */     return "orespawn:emperorscorpion_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 244 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 251 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 262 */     int i = this.field_70170_p.field_73012_v.nextInt(10);
/* 263 */     if (i == 0) return Items.field_151074_bl; 
/* 264 */     if (i == 1) return OreSpawnMain.UraniumNugget; 
/* 265 */     if (i == 2) return OreSpawnMain.TitaniumNugget; 
/* 266 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 271 */     EntityItem var3 = null;
/* 272 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 274 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
/*     */     
/* 276 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 277 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 285 */     int i = 1 + this.field_70170_p.field_73012_v.nextInt(3);
/* 286 */     for (int var4 = 0; var4 < i; var4++) {
/* 287 */       dropItemRand(OreSpawnMain.MyAmethyst, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 304 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 309 */     double ks = 0.5D;
/* 310 */     double inair = 0.1D;
/* 311 */     int var2 = 6;
/* 312 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 314 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */ 
/*     */         
/* 317 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 318 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 319 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/*     */ 
/*     */       
/* 323 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 327 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 336 */     boolean ret = false;
/* 337 */     if (this.hurt_timer > 0) return false;
/*     */     
/* 339 */     if (!par1DamageSource.func_76355_l().equals("cactus") && !par1DamageSource.func_76355_l().equals("fall")) {
/* 340 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 341 */       this.hurt_timer = 15;
/*     */       
/* 343 */       Entity e = par1DamageSource.func_76346_g();
/* 344 */       if (e != null && e instanceof EntityLiving) {
/*     */         
/* 346 */         func_70624_b((EntityLivingBase)e);
/* 347 */         func_70784_b(e);
/* 348 */         func_70661_as().func_75497_a(e, 1.2D);
/* 349 */         ret = true;
/*     */       } 
/*     */     } 
/* 352 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 358 */     EntityLivingBase e = null;
/* 359 */     if (this.field_70128_L)
/* 360 */       return;  super.func_70619_bc();
/* 361 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/* 362 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/* 363 */       e = func_70638_az();
/* 364 */       if (e != null && !e.func_70089_S()) {
/* 365 */         func_70624_b(null);
/* 366 */         e = null;
/*     */       } 
/* 368 */       if (e == null) {
/* 369 */         e = findSomethingToAttack();
/*     */       }
/* 371 */       if (e != null) {
/* 372 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 373 */         if (this.field_70170_p.field_73012_v.nextInt(15) == 1 && !this.field_70160_al) {
/* 374 */           jumpAtEntity(e);
/*     */         }
/* 376 */         else if (func_70068_e((Entity)e) < 9.0D) {
/* 377 */           setAttacking(1);
/*     */           
/* 379 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 0 || this.field_70170_p.field_73012_v.nextInt(7) == 1)
/*     */           {
/* 381 */             func_70652_k((Entity)e);
/* 382 */             if (!this.field_70170_p.field_72995_K && 
/* 383 */               this.field_70170_p.field_73012_v.nextInt(3) != 1)
/*     */             {
/*     */               
/* 386 */               this.field_70170_p.func_72956_a((Entity)e, "orespawn:clatter", 1.0F, 1.0F);
/*     */             }
/*     */           }
/*     */         
/*     */         }
/* 391 */         else if (!this.field_70160_al) {
/* 392 */           func_70661_as().func_75497_a((Entity)e, 0.5D);
/* 393 */           watercanon(e);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 398 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 402 */     if (this.field_70170_p.field_73012_v.nextInt(150) == 1 && 
/* 403 */       func_110143_aJ() < mygetMaxHealth())
/*     */     {
/* 405 */       func_70691_i(1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void watercanon(EntityLivingBase e) {
/* 413 */     double yoff = 1.5D;
/* 414 */     double xzoff = 1.5D;
/*     */     
/* 416 */     if (this.stream_count > 0) {
/* 417 */       setAttacking(1);
/*     */       
/* 419 */       Acid var2 = new Acid(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u + 0.75D - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 420 */       var2.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)), this.field_70759_as, this.field_70125_A);
/* 421 */       double var3 = e.field_70165_t - var2.field_70165_t;
/* 422 */       double var5 = e.field_70163_u + 0.25D - var2.field_70163_u;
/* 423 */       double var7 = e.field_70161_v - var2.field_70161_v;
/* 424 */       float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 425 */       var2.func_70186_c(var3, var5 + var9, var7, 1.1F, 6.0F);
/* 426 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 427 */       this.field_70170_p.func_72838_d((Entity)var2);
/* 428 */       this.stream_count--;
/*     */     } else {
/* 430 */       setAttacking(0);
/*     */     } 
/*     */     
/* 433 */     if (this.stream_count <= 0 && this.field_70146_Z.nextInt(7) == 1) this.stream_count = 8;
/*     */   
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 446 */     if (par1EntityLiving == null)
/*     */     {
/* 448 */       return false;
/*     */     }
/* 450 */     if (par1EntityLiving == this)
/*     */     {
/* 452 */       return false;
/*     */     }
/* 454 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 456 */       return false;
/*     */     }
/*     */     
/* 459 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 461 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 464 */       return false;
/*     */     }
/*     */     
/* 467 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 469 */       return false;
/*     */     }
/* 471 */     if (par1EntityLiving instanceof EnderKnight)
/*     */     {
/* 473 */       return false;
/*     */     }
/* 475 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityEnderman)
/*     */     {
/* 477 */       return false;
/*     */     }
/* 479 */     if (par1EntityLiving instanceof Hydrolisc)
/*     */     {
/* 481 */       return false;
/*     */     }
/*     */     
/* 484 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */     {
/* 486 */       return false;
/*     */     }
/* 488 */     if (par1EntityLiving instanceof SpitBug)
/*     */     {
/* 490 */       return false;
/*     */     }
/* 492 */     if (par1EntityLiving instanceof TrooperBug)
/*     */     {
/* 494 */       return false;
/*     */     }
/* 496 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 498 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 499 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 500 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 504 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 509 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 510 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 7.0D, 12.0D));
/* 511 */     Collections.sort(var5, this.TargetSorter);
/* 512 */     Iterator<?> var2 = var5.iterator();
/* 513 */     Entity var3 = null;
/* 514 */     EntityLivingBase var4 = null;
/*     */     
/* 516 */     while (var2.hasNext()) {
/*     */       
/* 518 */       var3 = (Entity)var2.next();
/* 519 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 521 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 523 */         return var4;
/*     */       }
/*     */     } 
/* 526 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 531 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 536 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 547 */     for (k = -3; k < 3; k++) {
/*     */       
/* 549 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 551 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 553 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 554 */           if (bid == Blocks.field_150474_ac) {
/* 555 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 556 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 557 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 558 */             if (s != null && 
/* 559 */               s.equals("Spit Bug")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 566 */     if (this.field_70170_p.func_72935_r() == true && 
/* 567 */       this.field_70170_p.field_73012_v.nextInt(20) > 1) {
/* 568 */       return false;
/*     */     }
/*     */     
/* 571 */     if (!func_70814_o()) return false;
/*     */ 
/*     */     
/* 574 */     for (k = -2; k < 2; k++) {
/*     */       
/* 576 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 578 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 580 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 581 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 585 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\SpitBug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */