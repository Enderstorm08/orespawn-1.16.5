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
/*     */ public class GiantRobot
/*     */   extends EntityMob
/*     */ {
/*  56 */   private GenericTargetSorter TargetSorter = null;
/*  57 */   private RenderGiantRobotInfo renderdata = new RenderGiantRobotInfo();
/*  58 */   private int reload_ticker = 0;
/*  59 */   private float moveSpeed = 0.55F;
/*     */ 
/*     */   
/*     */   public GiantRobot(World par1World) {
/*  63 */     super(par1World);
/*  64 */     func_70105_a(3.0F, 9.75F);
/*  65 */     func_70661_as().func_75491_a(true);
/*  66 */     this.field_70728_aV = OreSpawnMain.Jeffery_stats.health / 2;
/*  67 */     this.field_70174_ab = 40;
/*  68 */     this.field_70178_ae = true;
/*  69 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  70 */     this.renderdata = new RenderGiantRobotInfo();
/*  71 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  72 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  73 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  74 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  75 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  76 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  81 */     super.func_110147_ax();
/*  82 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  83 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  84 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Jeffery_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  89 */     super.func_70088_a();
/*  90 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  91 */     initLegData();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void initLegData() {
/*  97 */     if (this.renderdata == null) {
/*  98 */       this.renderdata = new RenderGiantRobotInfo();
/*     */     }
/*     */     
/* 101 */     this.renderdata.hipydisplayangle = 0.0F;
/* 102 */     this.renderdata.hipxdisplayangle = 0.0F;
/* 103 */     this.renderdata.gpcounter = 2000000;
/* 104 */     this.renderdata.thighdisplayangle[0] = 0.0F;
/* 105 */     this.renderdata.thighdisplayangle[1] = 0.0F;
/* 106 */     this.renderdata.shindisplayangle[0] = 0.0F;
/* 107 */     this.renderdata.shindisplayangle[1] = 0.0F;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 111 */     if (func_104002_bU()) return false; 
/* 112 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 120 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 121 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 126 */     return OreSpawnMain.Jeffery_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderGiantRobotInfo getRenderGiantRobotInfo() {
/* 133 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 142 */     return OreSpawnMain.Jeffery_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 150 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 159 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 165 */     this.field_70181_x += 0.25D;
/* 166 */     super.func_70664_aZ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 176 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 177 */       return "orespawn:robot_living";
/*     */     }
/* 179 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 187 */     return "orespawn:robot_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 195 */     return "orespawn:robot_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 203 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 210 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 218 */     return Items.field_151042_j;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 223 */     EntityItem var3 = null;
/* 224 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 226 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*     */     
/* 228 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 229 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 237 */     ItemStack is = null;
/*     */ 
/*     */     
/* 240 */     int var5 = 15 + this.field_70170_p.field_73012_v.nextInt(15); int var4;
/* 241 */     for (var4 = 0; var4 < var5; var4++) {
/* 242 */       dropItemRand(OreSpawnMain.MyLaserBall, 4);
/*     */     }
/*     */     
/* 245 */     int i = 10 + this.field_70170_p.field_73012_v.nextInt(10);
/* 246 */     for (var4 = 0; var4 < i; var4++) {
/* 247 */       int var3 = this.field_70170_p.field_73012_v.nextInt(12);
/* 248 */       switch (var3) {
/*     */         case 0:
/* 250 */           is = dropItemRand(OreSpawnMain.SpiderRobotKit, 1);
/*     */           break;
/*     */         case 1:
/* 253 */           is = dropItemRand(OreSpawnMain.AntRobotKit, 1);
/*     */           break;
/*     */         case 2:
/* 256 */           is = dropItemRand(OreSpawnMain.MyRayGun, 1);
/*     */           break;
/*     */         case 3:
/* 259 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */           break;
/*     */         case 4:
/* 262 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150367_z), 1);
/*     */           break;
/*     */         case 5:
/* 265 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150320_F), 1);
/*     */           break;
/*     */         case 6:
/* 268 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150331_J), 1);
/*     */           break;
/*     */         case 7:
/* 271 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150442_at), 1);
/*     */           break;
/*     */         case 8:
/* 274 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150339_S), 1);
/*     */           break;
/*     */         case 9:
/* 277 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150319_E), 1);
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
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 293 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 300 */     double ks = 2.2D;
/* 301 */     double inair = 0.25D;
/*     */     
/* 303 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 305 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 307 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 308 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 309 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 311 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 315 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 321 */     if (this.field_70128_L)
/* 322 */       return;  super.func_70619_bc();
/* 323 */     if (this.reload_ticker > 0) {
/* 324 */       this.reload_ticker--;
/*     */     }
/* 326 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/* 327 */       EntityLivingBase e = null;
/* 328 */       if (this.field_70170_p.field_73012_v.nextInt(100) == 1) func_70624_b(null); 
/* 329 */       e = func_70638_az();
/* 330 */       if (e != null && !e.func_70089_S()) {
/* 331 */         func_70624_b(null);
/* 332 */         e = null;
/*     */       } 
/* 334 */       if (e == null) {
/* 335 */         e = findSomethingToAttack();
/*     */       }
/*     */       
/* 338 */       if (e != null) {
/* 339 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 340 */         if (func_70068_e((Entity)e) < 256.0D) {
/*     */ 
/*     */           
/* 343 */           double rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/* 344 */           double rhdir = Math.toRadians(((this.field_70759_as + 90.0F) % 360.0F));
/*     */           
/* 346 */           double pi = 3.1415926545D;
/*     */           
/* 348 */           double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 349 */           if (rdd > pi) rdd -= pi * 2.0D; 
/* 350 */           rdd = Math.abs(rdd);
/*     */           
/* 352 */           if (rdd < 0.5D) {
/* 353 */             if (this.reload_ticker == 0) {
/* 354 */               double yoff = 10.0D;
/* 355 */               double xzoff = 3.75D;
/* 356 */               LaserBall var2 = new LaserBall(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 357 */               var2.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70759_as)), this.field_70759_as, this.field_70125_A);
/* 358 */               double var3 = e.field_70165_t - var2.field_70165_t;
/* 359 */               double var5 = e.field_70163_u - var2.field_70163_u;
/* 360 */               double var7 = e.field_70161_v - var2.field_70161_v;
/* 361 */               float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 362 */               var2.func_70186_c(var3, var5 + var9, var7, 2.0F, 4.0F);
/* 363 */               if (func_70068_e((Entity)e) > 100.0D) {
/* 364 */                 var2.setSpecial();
/* 365 */                 this.reload_ticker = 25;
/* 366 */                 this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 3.5F, 0.5F);
/*     */               } else {
/* 368 */                 this.reload_ticker = 10;
/* 369 */                 this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 2.5F, 1.0F);
/*     */               } 
/* 371 */               this.field_70170_p.func_72838_d((Entity)var2);
/*     */             } 
/* 373 */             if (func_70068_e((Entity)e) < ((8.0F + e.field_70130_N / 2.0F) * (8.0F + e.field_70130_N / 2.0F))) {
/* 374 */               setAttacking(1);
/* 375 */               func_70652_k((Entity)e);
/*     */             } else {
/* 377 */               setAttacking(0);
/*     */             } 
/*     */           } 
/* 380 */           func_70661_as().func_75497_a((Entity)e, 0.5D);
/*     */         } else {
/* 382 */           setAttacking(0);
/*     */         } 
/*     */       } else {
/* 385 */         setAttacking(0);
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
/* 396 */     boolean ret = false;
/* 397 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 398 */       ret = super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 400 */     Entity e = par1DamageSource.func_76346_g();
/* 401 */     if (e != null && e instanceof EntityLiving) {
/*     */       
/* 403 */       func_70624_b((EntityLivingBase)e);
/* 404 */       func_70784_b(e);
/*     */     } 
/* 406 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 416 */     if (par1EntityLiving == null)
/*     */     {
/* 418 */       return false;
/*     */     }
/* 420 */     if (par1EntityLiving == this)
/*     */     {
/* 422 */       return false;
/*     */     }
/* 424 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 426 */       return false;
/*     */     }
/*     */     
/* 429 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 431 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 434 */       return false;
/*     */     }
/*     */     
/* 437 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 439 */       return false;
/*     */     }
/* 441 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 443 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 444 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 445 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 449 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 454 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 455 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 12.0D, 16.0D));
/* 456 */     Collections.sort(var5, this.TargetSorter);
/* 457 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 459 */     while (var2.hasNext()) {
/*     */       
/* 461 */       Entity var3 = (Entity)var2.next();
/* 462 */       EntityLivingBase var4 = (EntityLivingBase)var3;
/*     */       
/* 464 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 466 */         return var4;
/*     */       }
/*     */     } 
/* 469 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 475 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 480 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 491 */     if (this.field_70163_u < 50.0D) return false; 
/* 492 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 496 */     for (int k = -1; k < 1; k++) {
/*     */       
/* 498 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 500 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 502 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 503 */           if (bid != Blocks.field_150350_a && bid != Blocks.field_150329_H) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 507 */     if (!func_70814_o()) return false; 
/* 508 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\GiantRobot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */