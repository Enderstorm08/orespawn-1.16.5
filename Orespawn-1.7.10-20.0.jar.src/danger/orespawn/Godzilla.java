/*      */ package danger.orespawn;
/*      */ 
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.enchantment.Enchantment;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityList;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*      */ import net.minecraft.entity.boss.EntityDragon;
/*      */ import net.minecraft.entity.effect.EntityLightningBolt;
/*      */ import net.minecraft.entity.item.EntityItem;
/*      */ import net.minecraft.entity.monster.EntityMob;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.util.AxisAlignedBB;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.world.World;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Godzilla
/*      */   extends EntityMob
/*      */ {
/*   59 */   private GenericTargetSorter TargetSorter = null;
/*   60 */   private float moveSpeed = 0.75F;
/*   61 */   private int hurt_timer = 0;
/*   62 */   private int jumped = 0;
/*   63 */   private int jump_timer = 0;
/*   64 */   private int ticker = 0;
/*   65 */   private RenderInfo renderdata = new RenderInfo();
/*   66 */   private int stream_count = 8;
/*   67 */   private MyEntityAIWanderALot wander = null;
/*   68 */   private int head_found = 0;
/*   69 */   private int large_unknown_detected = 0;
/*      */ 
/*      */   
/*      */   public Godzilla(World par1World) {
/*   73 */     super(par1World);
/*   74 */     if (OreSpawnMain.PlayNicely == 0) {
/*   75 */       func_70105_a(9.9F, 25.0F);
/*      */     } else {
/*   77 */       func_70105_a(2.475F, 6.25F);
/*      */     } 
/*   79 */     func_70661_as().func_75491_a(true);
/*   80 */     this.field_70728_aV = 10000;
/*   81 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*   82 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*   83 */     this.wander = new MyEntityAIWanderALot((EntityCreature)this, 15, 1.0D);
/*   84 */     this.field_70714_bg.func_75776_a(2, this.wander);
/*   85 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 50.0F));
/*   86 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*   87 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*   88 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*   89 */     this.field_70174_ab = 10000;
/*   90 */     this.field_70178_ae = true;
/*   91 */     this.field_70155_l = 12.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*   97 */     super.func_110147_ax();
/*   98 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*   99 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  100 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Godzilla_stats.attack);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  105 */     super.func_70088_a();
/*  106 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  107 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*  108 */     if (this.renderdata == null) {
/*  109 */       this.renderdata = new RenderInfo();
/*      */     }
/*  111 */     this.renderdata.rf1 = 0.0F;
/*  112 */     this.renderdata.rf2 = 0.0F;
/*  113 */     this.renderdata.rf3 = 0.0F;
/*  114 */     this.renderdata.rf4 = 0.0F;
/*  115 */     this.renderdata.ri1 = 0;
/*  116 */     this.renderdata.ri2 = 0;
/*  117 */     this.renderdata.ri3 = 0;
/*  118 */     this.renderdata.ri4 = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getPlayNicely() {
/*  123 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RenderInfo getRenderInfo() {
/*  130 */     return this.renderdata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenderInfo(RenderInfo r) {
/*  135 */     this.renderdata.rf1 = r.rf1;
/*  136 */     this.renderdata.rf2 = r.rf2;
/*  137 */     this.renderdata.rf3 = r.rf3;
/*  138 */     this.renderdata.rf4 = r.rf4;
/*  139 */     this.renderdata.ri1 = r.ri1;
/*  140 */     this.renderdata.ri2 = r.ri2;
/*  141 */     this.renderdata.ri3 = r.ri3;
/*  142 */     this.renderdata.ri4 = r.ri4;
/*      */   }
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  146 */     if (func_104002_bU()) return false; 
/*  147 */     if (OreSpawnMain.PlayNicely != 0) return true; 
/*  148 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  153 */     return OreSpawnMain.Godzilla_stats.health;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  161 */     if (this.large_unknown_detected != 0) return 25; 
/*  162 */     return OreSpawnMain.Godzilla_stats.defense;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70650_aV() {
/*  170 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  178 */     double xzoff = 0.0D;
/*      */     
/*  180 */     double myoff = 20.0D;
/*  181 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  182 */     super.func_70071_h_();
/*  183 */     if (this.field_70160_al) {
/*  184 */       func_70661_as().func_75484_a(null, 0.0D);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  190 */     super.func_70636_d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70069_a(float par1) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70064_a(double par1, boolean par3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  210 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/*  211 */       return "orespawn:godzilla_living";
/*      */     }
/*  213 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  221 */     return "orespawn:alo_hurt";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  229 */     return "orespawn:godzilla_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  236 */     return 1.65F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70647_i() {
/*  243 */     return 1.1F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  252 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70664_aZ() {
/*  260 */     for (; this.field_70177_z < 0.0F; this.field_70177_z += 360.0F);
/*  261 */     for (; this.field_70759_as < 0.0F; this.field_70759_as += 360.0F);
/*  262 */     for (; this.field_70177_z > 360.0F; this.field_70177_z -= 360.0F);
/*  263 */     for (; this.field_70759_as > 360.0F; this.field_70759_as -= 360.0F);
/*      */     
/*  265 */     this.field_70181_x += 0.44999998807907104D;
/*  266 */     this.field_70163_u += 0.5D;
/*  267 */     float f = 0.2F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.45F);
/*  268 */     this.field_70159_w += f * Math.cos(Math.toRadians((this.field_70759_as + 90.0F)));
/*  269 */     this.field_70179_y += f * Math.sin(Math.toRadians((this.field_70759_as + 90.0F)));
/*  270 */     this.field_70160_al = true;
/*  271 */     func_70661_as().func_75484_a(null, 0.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void jumpAtEntity(EntityLivingBase e) {
/*  278 */     this.field_70181_x += 1.25D;
/*  279 */     this.field_70163_u += 1.5499999523162842D;
/*  280 */     double d1 = e.field_70165_t - this.field_70165_t;
/*  281 */     double d2 = e.field_70161_v - this.field_70161_v;
/*  282 */     float d = (float)Math.atan2(d2, d1);
/*  283 */     float f2 = (float)(d * 180.0D / Math.PI) - 90.0F;
/*  284 */     this.field_70177_z = f2;
/*  285 */     d1 = Math.sqrt(d1 * d1 + d2 * d2);
/*  286 */     this.field_70159_w += d1 * 0.05D * Math.cos(d);
/*  287 */     this.field_70179_y += d1 * 0.05D * Math.sin(d);
/*  288 */     this.field_70160_al = true;
/*  289 */     func_70661_as().func_75484_a(null, 0.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private double getHorizontalDistanceSqToEntity(Entity e) {
/*  295 */     double d1 = e.field_70161_v - this.field_70161_v;
/*  296 */     double d2 = e.field_70165_t - this.field_70165_t;
/*  297 */     return d1 * d1 + d2 * d2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double MygetDistanceSqToEntity(Entity par1Entity) {
/*  305 */     double d0 = this.field_70165_t - par1Entity.field_70165_t;
/*  306 */     double d1 = par1Entity.field_70163_u - this.field_70163_u;
/*  307 */     double d2 = this.field_70161_v - par1Entity.field_70161_v;
/*  308 */     if (d1 > 0.0D && d1 < 20.0D) d1 = 0.0D; 
/*  309 */     if (d1 > 20.0D) d1 -= 10.0D; 
/*  310 */     return d0 * d0 + d1 * d1 + d2 * d2;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70619_bc() {
/*  315 */     EntityLivingBase e = null;
/*      */     
/*  317 */     int xzrange = 9;
/*      */ 
/*      */     
/*  320 */     if (this.field_70128_L)
/*  321 */       return;  if (this.field_70170_p.field_72995_K)
/*  322 */       return;  this.field_70180_af.func_75692_b(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*      */     
/*  324 */     super.func_70619_bc();
/*      */     
/*  326 */     this.ticker++;
/*  327 */     if (this.ticker > 30000) this.ticker = 0; 
/*  328 */     if (this.ticker % 100 == 0) this.stream_count = 8; 
/*  329 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/*  330 */     if (this.jump_timer > 0) this.jump_timer--; 
/*  331 */     OreSpawnMain.godzilla_has_spawned = 1;
/*      */     
/*  333 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 0) {
/*  334 */       func_70624_b(null);
/*      */     }
/*      */     
/*  337 */     if (OreSpawnMain.PlayNicely == 0) {
/*      */       
/*  339 */       if (this.field_70181_x < -0.95D) this.jumped = 1; 
/*  340 */       if (this.field_70181_x < -1.5D) this.jumped = 2; 
/*  341 */       if (this.jumped != 0 && this.field_70181_x > -0.1D) {
/*      */         
/*  343 */         double df = 1.0D;
/*  344 */         if (this.jumped == 2) df = 1.5D; 
/*  345 */         doJumpDamage(this.field_70165_t, this.field_70163_u, this.field_70161_v, 10.0D, OreSpawnMain.Godzilla_stats.attack * df, 0);
/*  346 */         doJumpDamage(this.field_70165_t, this.field_70163_u, this.field_70161_v, 15.0D, (OreSpawnMain.Godzilla_stats.attack / 2) * df, 0);
/*  347 */         doJumpDamage(this.field_70165_t, this.field_70163_u, this.field_70161_v, 25.0D, (OreSpawnMain.Godzilla_stats.attack / 4) * df, 0);
/*  348 */         this.jumped = 0;
/*      */       } 
/*      */     } 
/*      */     
/*  352 */     xzrange = 12;
/*  353 */     if (getAttacking() != 0) xzrange = 16;
/*      */ 
/*      */     
/*  356 */     int k = -3 + this.ticker % 30;
/*  357 */     if (OreSpawnMain.PlayNicely == 0) {
/*  358 */       for (int i = -xzrange; i <= xzrange; i++) {
/*  359 */         for (int j = -xzrange; j <= xzrange; j++) {
/*      */           
/*  361 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + k, (int)this.field_70161_v + j);
/*  362 */           if (isCrushable(bid)) {
/*  363 */             this.field_70170_p.func_147449_b((int)this.field_70165_t + i, (int)this.field_70163_u + k, (int)this.field_70161_v + j, Blocks.field_150350_a);
/*  364 */             if (this.field_70170_p.field_73012_v.nextInt(15) == 1) dropItemRand(Item.func_150898_a(bid), 1); 
/*      */           } else {
/*  366 */             if (bid == Blocks.field_150349_c && 
/*  367 */               this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)this.field_70165_t + i, (int)this.field_70163_u + k, (int)this.field_70161_v + j, Blocks.field_150346_d);
/*      */             
/*  369 */             if (bid == Blocks.field_150458_ak && 
/*  370 */               this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)this.field_70165_t + i, (int)this.field_70163_u + k, (int)this.field_70161_v + j, Blocks.field_150346_d);
/*      */           
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  378 */     double dx = this.field_70165_t + 16.0D * Math.sin(Math.toRadians(this.field_70759_as));
/*  379 */     double dz = this.field_70161_v - 16.0D * Math.cos(Math.toRadians(this.field_70759_as));
/*  380 */     k = -3 + this.ticker % 12;
/*  381 */     if (OreSpawnMain.PlayNicely == 0) {
/*  382 */       for (int i = -xzrange; i <= xzrange; i++) {
/*  383 */         for (int j = -xzrange; j <= xzrange; j++) {
/*  384 */           Block bid = this.field_70170_p.func_147439_a((int)dx + i, (int)this.field_70163_u + k, (int)dz + j);
/*  385 */           if (isCrushable(bid)) {
/*  386 */             this.field_70170_p.func_147449_b((int)dx + i, (int)this.field_70163_u + k, (int)dz + j, Blocks.field_150350_a);
/*  387 */             if (this.field_70170_p.field_73012_v.nextInt(15) == 1) dropItemRandAt(Item.func_150898_a(bid), 1, dx, dz); 
/*      */           } else {
/*  389 */             if (bid == Blocks.field_150349_c && 
/*  390 */               this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)dx + i, (int)this.field_70163_u + k, (int)dz + j, Blocks.field_150346_d);
/*      */             
/*  392 */             if (bid == Blocks.field_150458_ak && 
/*  393 */               this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)dx + i, (int)this.field_70163_u + k, (int)dz + j, Blocks.field_150346_d);
/*      */           
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*  399 */     if (OreSpawnMain.PlayNicely == 0 && 
/*  400 */       k == 0) doJumpDamage(dx, this.field_70163_u, dz, 15.0D, (OreSpawnMain.Godzilla_stats.attack / 2), 1);
/*      */ 
/*      */ 
/*      */     
/*  404 */     if (this.field_70170_p.field_73012_v.nextInt(5 - this.large_unknown_detected) == 1) {
/*  405 */       e = func_70638_az();
/*  406 */       if (OreSpawnMain.PlayNicely != 0) e = null; 
/*  407 */       if (e != null) {
/*  408 */         if (!e.func_70089_S()) {
/*  409 */           func_70624_b(null);
/*  410 */           e = null;
/*      */         }
/*  412 */         else if (e instanceof Godzilla || e instanceof GodzillaHead) {
/*  413 */           func_70624_b(null);
/*  414 */           e = null;
/*      */         } 
/*      */       }
/*      */       
/*  418 */       if (e == null) {
/*  419 */         e = findSomethingToAttack();
/*      */         
/*  421 */         if (this.head_found == 0)
/*      */         {
/*      */           
/*  424 */           EntityLiving newent = (EntityLiving)spawnCreature(this.field_70170_p, "MobzillaHead", this.field_70165_t, this.field_70163_u + 20.0D, this.field_70161_v);
/*      */         }
/*      */       } 
/*  427 */       if (e != null) {
/*  428 */         this.wander.setBusy(1);
/*  429 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/*  430 */         if (this.field_70170_p.field_73012_v.nextInt(65) == 1 && MygetDistanceSqToEntity((Entity)e) > 300.0D) {
/*  431 */           doLightningAttack(e);
/*  432 */         } else if (this.field_70170_p.field_73012_v.nextInt(20 - this.large_unknown_detected * 5) == 1 && this.jump_timer == 0) {
/*  433 */           jumpAtEntity(e);
/*  434 */           this.jump_timer = 30;
/*      */         }
/*  436 */         else if (MygetDistanceSqToEntity((Entity)e) < (300.0F + e.field_70130_N / 2.0F * e.field_70130_N / 2.0F)) {
/*  437 */           setAttacking(1);
/*  438 */           func_70661_as().func_75497_a((Entity)e, 1.0D);
/*      */           
/*  440 */           if (this.field_70170_p.field_73012_v.nextInt(4 - this.large_unknown_detected) == 0 || this.field_70170_p.field_73012_v.nextInt(3 - this.large_unknown_detected) == 1)
/*      */           {
/*  442 */             func_70652_k((Entity)e);
/*      */           }
/*      */         } else {
/*  445 */           func_70661_as().func_75497_a((Entity)e, 1.0D);
/*  446 */           if (getHorizontalDistanceSqToEntity((Entity)e) > 625.0D) {
/*      */             
/*  448 */             if (this.stream_count > 0) {
/*  449 */               setAttacking(1);
/*      */ 
/*      */               
/*  452 */               double rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  453 */               double rhdir = Math.toRadians(((this.field_70759_as + 90.0F) % 360.0F));
/*      */               
/*  455 */               double pi = 3.1415926545D;
/*      */               
/*  457 */               double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  458 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  459 */               rdd = Math.abs(rdd);
/*      */               
/*  461 */               if (rdd < 0.5D) {
/*  462 */                 firecanon(e);
/*      */               }
/*      */             } else {
/*  465 */               setAttacking(0);
/*      */             } 
/*      */           } else {
/*  468 */             setAttacking(0);
/*      */           }
/*      */         
/*      */         } 
/*      */       } else {
/*      */         
/*  474 */         setAttacking(0);
/*  475 */         this.wander.setBusy(0);
/*  476 */         this.stream_count = 8;
/*      */       } 
/*      */     } 
/*      */     
/*  480 */     if (this.field_70170_p.field_73012_v.nextInt(35) == 1 && 
/*  481 */       func_110143_aJ() < mygetMaxHealth())
/*      */     {
/*  483 */       func_70691_i(5.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/*  495 */     Entity var8 = null;
/*  496 */     var8 = EntityList.func_75620_a(par1, par0World);
/*  497 */     if (var8 != null) {
/*      */ 
/*      */       
/*  500 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/*  503 */       par0World.func_72838_d(var8);
/*      */     } 
/*  505 */     return var8;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  515 */     if (par1EntityLiving == null)
/*      */     {
/*  517 */       return false;
/*      */     }
/*  519 */     if (par1EntityLiving == this)
/*      */     {
/*  521 */       return false;
/*      */     }
/*  523 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*  525 */       return false;
/*      */     }
/*      */     
/*  528 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*      */     
/*  530 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  533 */       return false;
/*      */     }
/*  535 */     if (par1EntityLiving instanceof Godzilla)
/*      */     {
/*  537 */       return false;
/*      */     }
/*  539 */     if (par1EntityLiving instanceof GodzillaHead)
/*      */     {
/*  541 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  545 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*      */     {
/*  547 */       return false;
/*      */     }
/*  549 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityZombie)
/*      */     {
/*  551 */       return false;
/*      */     }
/*  553 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
/*      */     {
/*  555 */       return false;
/*      */     }
/*  557 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySkeleton)
/*      */     {
/*  559 */       return false;
/*      */     }
/*  561 */     if (par1EntityLiving instanceof Ghost)
/*      */     {
/*  563 */       return false;
/*      */     }
/*  565 */     if (par1EntityLiving instanceof GhostSkelly)
/*      */     {
/*  567 */       return false;
/*      */     }
/*  569 */     if (par1EntityLiving instanceof EntityPlayer) {
/*      */       
/*  571 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/*  572 */       if (p.field_71075_bZ.field_75098_d == true) {
/*  573 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  577 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isVillagerTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  586 */     if (par1EntityLiving == null)
/*      */     {
/*  588 */       return false;
/*      */     }
/*  590 */     if (par1EntityLiving == this)
/*      */     {
/*  592 */       return false;
/*      */     }
/*  594 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*  596 */       return false;
/*      */     }
/*  598 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  601 */       return false;
/*      */     }
/*      */     
/*  604 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
/*      */     {
/*  606 */       return true;
/*      */     }
/*      */     
/*  609 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase doJumpDamage(double X, double Y, double Z, double dist, double damage, int knock) {
/*  614 */     AxisAlignedBB bb = AxisAlignedBB.func_72330_a(X - dist, Y - 10.0D, Z - dist, X + dist, Y + 10.0D, Z + dist);
/*  615 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, bb);
/*  616 */     Collections.sort(var5, this.TargetSorter);
/*  617 */     Iterator<?> var2 = var5.iterator();
/*  618 */     Entity var3 = null;
/*  619 */     EntityLivingBase var4 = null;
/*      */     
/*  621 */     while (var2.hasNext()) {
/*      */       
/*  623 */       var3 = (Entity)var2.next();
/*  624 */       var4 = (EntityLivingBase)var3;
/*      */ 
/*      */ 
/*      */       
/*  628 */       if (var4 == null) {
/*      */         continue;
/*      */       }
/*      */       
/*  632 */       if (var4 == this) {
/*      */         continue;
/*      */       }
/*      */       
/*  636 */       if (!var4.func_70089_S()) {
/*      */         continue;
/*      */       }
/*      */       
/*  640 */       if (var4 instanceof Godzilla) {
/*      */         continue;
/*      */       }
/*  643 */       if (var4 instanceof GodzillaHead) {
/*      */         continue;
/*      */       }
/*  646 */       if (var4 instanceof Ghost || 
/*  647 */         var4 instanceof GhostSkelly)
/*      */         continue; 
/*  649 */       DamageSource var21 = null;
/*  650 */       var21 = DamageSource.func_94539_a(null);
/*  651 */       var21.func_94540_d();
/*  652 */       var4.func_70097_a(var21, (float)damage / 2.0F);
/*  653 */       var4.func_70097_a(DamageSource.field_76379_h, (float)damage / 2.0F);
/*  654 */       this.field_70170_p.func_72956_a((Entity)var4, "random.explode", 0.85F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/*  655 */       if (knock != 0) {
/*  656 */         double ks = 3.5D;
/*  657 */         double inair = 0.75D;
/*  658 */         float f3 = (float)Math.atan2(var4.field_70161_v - this.field_70161_v, var4.field_70165_t - this.field_70165_t);
/*  659 */         var4.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */       } 
/*      */     } 
/*      */     
/*  663 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/*  670 */     if (OreSpawnMain.PlayNicely != 0) {
/*  671 */       this.head_found = 1;
/*  672 */       return null;
/*      */     } 
/*  674 */     List<?> var5 = null;
/*  675 */     Iterator<?> var2 = null;
/*  676 */     Entity var3 = null;
/*  677 */     EntityLivingBase var4 = null;
/*  678 */     EntityLivingBase ret = null;
/*  679 */     int vf = 0;
/*      */     
/*  681 */     var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(64.0D, 40.0D, 64.0D));
/*  682 */     if (var5 == null) return null; 
/*  683 */     Collections.sort(var5, this.TargetSorter);
/*  684 */     var2 = var5.iterator();
/*      */     
/*  686 */     this.head_found = 0;
/*  687 */     while (var2.hasNext()) {
/*      */       
/*  689 */       var3 = (Entity)var2.next();
/*  690 */       var4 = (EntityLivingBase)var3;
/*      */       
/*  692 */       if (var4 instanceof GodzillaHead) {
/*  693 */         this.head_found = 1;
/*      */       }
/*  695 */       if (vf == 0 && isVillagerTarget(var4, false)) {
/*      */         
/*  697 */         ret = var4;
/*  698 */         vf = 1;
/*      */       } 
/*      */       
/*  701 */       if (ret == null && vf == 0 && isSuitableTarget(var4, false))
/*      */       {
/*  703 */         ret = var4;
/*      */       }
/*      */     } 
/*      */     
/*  707 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  715 */     if (!func_70814_o()) return false; 
/*  716 */     if (this.field_70170_p.func_72935_r() == true) return false; 
/*  717 */     if (this.field_70163_u < 50.0D) return false;
/*      */     
/*  719 */     if (OreSpawnMain.godzilla_has_spawned != 0) return false; 
/*  720 */     if (this.field_70170_p.field_73012_v.nextInt(40) != 1) return false;
/*      */ 
/*      */     
/*  723 */     for (int k = -8; k <= 8; k++) {
/*      */       
/*  725 */       for (int j = -8; j <= 8; j++) {
/*      */         
/*  727 */         for (int i = 5; i < 15; i++) {
/*      */           
/*  729 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/*  730 */           if (bid != Blocks.field_150350_a) return false;
/*      */         
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  736 */     Godzilla target = null;
/*  737 */     target = (Godzilla)this.field_70170_p.func_72857_a(Godzilla.class, this.field_70121_D.func_72314_b(64.0D, 16.0D, 64.0D), (Entity)this);
/*  738 */     if (target != null)
/*      */     {
/*  740 */       return false;
/*      */     }
/*  742 */     if (!this.field_70170_p.field_72995_K) OreSpawnMain.godzilla_has_spawned = 1; 
/*  743 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getAttacking() {
/*  748 */     return this.field_70180_af.func_75683_a(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public final void setAttacking(int par1) {
/*  753 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRand(Item index, int par1) {
/*  758 */     EntityItem var3 = null;
/*  759 */     ItemStack is = new ItemStack(index, par1, 0);
/*  760 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), this.field_70163_u + 4.0D + this.field_70170_p.field_73012_v.nextInt(10), this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), is);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  765 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  766 */     return is;
/*      */   }
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRandAt(Item index, int par1, double dx, double dz) {
/*  771 */     EntityItem var3 = null;
/*  772 */     ItemStack is = new ItemStack(index, par1, 0);
/*  773 */     var3 = new EntityItem(this.field_70170_p, dx + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), this.field_70163_u + 4.0D + this.field_70170_p.field_73012_v.nextInt(6), dz + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), is);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  778 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  779 */     return is;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isCrushable(Block bid) {
/*  847 */     if (bid == null) return false; 
/*  848 */     if (!this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) return false; 
/*  849 */     if (bid == Blocks.field_150349_c) return false; 
/*  850 */     if (bid == Blocks.field_150346_d) return false; 
/*  851 */     if (bid == Blocks.field_150348_b) return false; 
/*  852 */     if (bid == Blocks.field_150458_ak) return false; 
/*  853 */     if (bid == Blocks.field_150355_j) return false; 
/*  854 */     if (bid == Blocks.field_150358_i) return false; 
/*  855 */     if (bid == Blocks.field_150353_l) return false; 
/*  856 */     if (bid == Blocks.field_150356_k) return false; 
/*  857 */     if (bid == Blocks.field_150357_h) return false; 
/*  858 */     if (bid == Blocks.field_150343_Z) return false; 
/*  859 */     if (bid == Blocks.field_150354_m) return false; 
/*  860 */     if (bid == Blocks.field_150351_n) return false; 
/*  861 */     if (bid == Blocks.field_150339_S) return false; 
/*  862 */     if (bid == Blocks.field_150484_ah) return false; 
/*  863 */     if (bid == Blocks.field_150475_bE) return false; 
/*  864 */     if (bid == Blocks.field_150340_R) return false; 
/*  865 */     if (bid == Blocks.field_150424_aL) return false; 
/*  866 */     if (bid == Blocks.field_150377_bs) return false;
/*      */     
/*  868 */     if (bid == OreSpawnMain.MyBlockAmethystBlock) return false; 
/*  869 */     if (bid == OreSpawnMain.MyBlockRubyBlock) return false; 
/*  870 */     if (bid == OreSpawnMain.MyBlockUraniumBlock) return false; 
/*  871 */     if (bid == OreSpawnMain.MyBlockTitaniumBlock) return false; 
/*  872 */     if (bid == OreSpawnMain.CrystalStone) return false; 
/*  873 */     if (bid == OreSpawnMain.CrystalGrass) return false;
/*      */     
/*  875 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanon(EntityLivingBase e) {
/*  880 */     double yoff = 19.0D;
/*  881 */     double xzoff = 22.0D;
/*      */ 
/*      */     
/*  884 */     BetterFireball bf = null;
/*      */     
/*  886 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/*  887 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*  888 */     if (this.stream_count > 0) {
/*      */ 
/*      */ 
/*      */       
/*  892 */       bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff, e.field_70161_v - cz);
/*  893 */       bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/*  894 */       bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/*  895 */       bf.setBig();
/*  896 */       this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  897 */       this.field_70170_p.func_72838_d((Entity)bf);
/*  898 */       for (int i = 0; i < 5; i++) {
/*  899 */         float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  900 */         float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  901 */         float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  902 */         bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx + r1, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff + r2, e.field_70161_v - cz + r3);
/*  903 */         bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/*  904 */         bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/*  905 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) bf.setSmall(); 
/*  906 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  907 */         this.field_70170_p.func_72838_d((Entity)bf);
/*      */       } 
/*  909 */       this.stream_count--;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  916 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */       
/*  918 */       float s = par1Entity.field_70131_O * par1Entity.field_70130_N;
/*  919 */       if (s > 30.0F && 
/*  920 */         !MyUtils.isRoyalty(par1Entity) && !(par1Entity instanceof Godzilla) && !(par1Entity instanceof GodzillaHead) && !(par1Entity instanceof PitchBlack) && !(par1Entity instanceof Kraken)) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  925 */         EntityLivingBase e = (EntityLivingBase)par1Entity;
/*  926 */         e.func_70606_j(e.func_110143_aJ() / 2.0F);
/*  927 */         e.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), OreSpawnMain.Godzilla_stats.attack * 10.0F);
/*  928 */         this.large_unknown_detected = 1;
/*      */       } 
/*      */     } 
/*      */     
/*  932 */     if (par1Entity != null && par1Entity instanceof EntityDragon) {
/*  933 */       EntityDragon dr = (EntityDragon)par1Entity;
/*  934 */       DamageSource var21 = null;
/*  935 */       var21 = DamageSource.func_94539_a(null);
/*  936 */       var21.func_94540_d();
/*  937 */       if (this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*  938 */         dr.func_70965_a(dr.field_70986_h, var21, OreSpawnMain.Godzilla_stats.attack / 2.0F);
/*      */       } else {
/*  940 */         dr.func_70965_a(dr.field_70987_i, var21, OreSpawnMain.Godzilla_stats.attack / 2.0F);
/*      */       } 
/*      */     } 
/*  943 */     if (super.func_70652_k(par1Entity)) {
/*      */       
/*  945 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */         
/*  947 */         double ks = 3.2D;
/*  948 */         double inair = 0.3D;
/*  949 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  950 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/*  951 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */       } 
/*  953 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  957 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  966 */     boolean ret = false;
/*  967 */     float dm = par2;
/*  968 */     float s = 0.0F;
/*  969 */     if (this.hurt_timer > 0) return false; 
/*  970 */     if (dm > 750.0F) dm = 750.0F;
/*      */     
/*  972 */     Entity e = par1DamageSource.func_76346_g();
/*  973 */     if (e != null && e instanceof EntityLivingBase) {
/*      */       
/*  975 */       EntityLivingBase enl = (EntityLivingBase)e;
/*  976 */       s = enl.field_70131_O * enl.field_70130_N;
/*  977 */       if (s > 30.0F && 
/*  978 */         !MyUtils.isRoyalty((Entity)enl) && !(enl instanceof Godzilla) && !(enl instanceof GodzillaHead) && !(enl instanceof PitchBlack) && !(enl instanceof Kraken)) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  983 */         dm /= 10.0F;
/*  984 */         this.hurt_timer = 50;
/*  985 */         this.large_unknown_detected = 1;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  990 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*  991 */       ret = super.func_70097_a(par1DamageSource, dm);
/*  992 */       this.hurt_timer = 20;
/*      */       
/*  994 */       e = par1DamageSource.func_76346_g();
/*  995 */       if (e != null && e instanceof EntityLivingBase)
/*      */       {
/*  997 */         if (!(e instanceof GodzillaHead) && !(e instanceof Godzilla)) {
/*  998 */           func_70624_b((EntityLivingBase)e);
/*  999 */           func_70784_b(e);
/* 1000 */           func_70661_as().func_75497_a(e, 1.2D);
/*      */         } 
/*      */       }
/*      */     } 
/* 1004 */     return ret;
/*      */   }
/*      */ 
/*      */   
/*      */   public void func_70077_a(EntityLightningBolt par1EntityLightningBolt) {}
/*      */ 
/*      */   
/*      */   private void doLightningAttack(EntityLivingBase e) {
/* 1012 */     if (e == null)
/* 1013 */       return;  float var2 = 100.0F;
/* 1014 */     e.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), var2);
/* 1015 */     e.func_70015_d(5);
/* 1016 */     for (int var3 = 0; var3 < 20; var3++) {
/*      */       
/* 1018 */       this.field_70170_p.func_72869_a("smoke", e.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), e.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), e.field_70161_v + this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 1019 */       this.field_70170_p.func_72869_a("largesmoke", e.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), e.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), e.field_70161_v + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 1020 */       this.field_70170_p.func_72869_a("fireworksSpark", e.field_70165_t, e.field_70163_u, e.field_70161_v, this.field_70170_p.field_73012_v.nextGaussian(), this.field_70170_p.field_73012_v.nextGaussian(), this.field_70170_p.field_73012_v.nextGaussian());
/*      */     } 
/*      */     
/* 1023 */     this.field_70170_p.func_72956_a((Entity)e, "random.explode", 0.5F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/*      */     
/* 1025 */     if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72876_a((Entity)this, e.field_70165_t, e.field_70163_u, e.field_70161_v, 3.0F, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*      */     
/* 1027 */     this.field_70170_p.func_72942_c((Entity)new EntityLightningBolt(this.field_70170_p, e.field_70165_t, e.field_70163_u + 1.0D, e.field_70161_v));
/* 1028 */     this.field_70170_p.func_72942_c((Entity)new EntityLightningBolt(this.field_70170_p, this.field_70165_t, this.field_70163_u + 15.0D, this.field_70161_v));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/* 1035 */     ItemStack is = null;
/*      */ 
/*      */     
/* 1038 */     dropItemRand(Items.field_151160_bD, 1);
/*      */     
/* 1040 */     int var5 = 50 + this.field_70170_p.field_73012_v.nextInt(30); int var4;
/* 1041 */     for (var4 = 0; var4 < var5; var4++) {
/* 1042 */       dropItemRand(OreSpawnMain.MyGodzillaScale, 1);
/*      */     }
/* 1044 */     var5 = 100 + this.field_70170_p.field_73012_v.nextInt(160);
/* 1045 */     for (var4 = 0; var4 < var5; var4++) {
/* 1046 */       dropItemRand(Items.field_151082_bd, 1);
/*      */     }
/* 1048 */     var5 = 50 + this.field_70170_p.field_73012_v.nextInt(60);
/* 1049 */     for (var4 = 0; var4 < var5; var4++) {
/* 1050 */       dropItemRand(Items.field_151103_aS, 1);
/*      */     }
/*      */ 
/*      */     
/* 1054 */     int i = 25 + this.field_70170_p.field_73012_v.nextInt(15);
/* 1055 */     for (var4 = 0; var4 < i; var4++) {
/* 1056 */       EntityItem var33; int var3 = this.field_70170_p.field_73012_v.nextInt(80);
/* 1057 */       switch (var3) {
/*      */         case 0:
/* 1059 */           is = dropItemRand(OreSpawnMain.MyUltimateSword, 1);
/*      */           break;
/*      */         case 1:
/* 1062 */           is = dropItemRand(Items.field_151045_i, 1);
/*      */           break;
/*      */         case 2:
/* 1065 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150484_ah), 1);
/*      */           break;
/*      */         case 3:
/* 1068 */           is = dropItemRand(Items.field_151048_u, 1);
/* 1069 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1070 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1071 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1072 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1073 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1074 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1075 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 4:
/* 1078 */           is = dropItemRand(Items.field_151047_v, 1);
/* 1079 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1080 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 5:
/* 1083 */           is = dropItemRand(Items.field_151046_w, 1);
/* 1084 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1085 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1086 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 6:
/* 1089 */           is = dropItemRand(Items.field_151056_x, 1);
/* 1090 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1091 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 7:
/* 1094 */           is = dropItemRand(Items.field_151012_L, 1);
/* 1095 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1096 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 8:
/* 1099 */           is = dropItemRand((Item)Items.field_151161_ac, 1);
/* 1100 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1101 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1102 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1103 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1104 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1105 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2)); 
/* 1106 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 9:
/* 1109 */           is = dropItemRand((Item)Items.field_151163_ad, 1);
/* 1110 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1111 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1112 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1113 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1114 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 10:
/* 1117 */           is = dropItemRand((Item)Items.field_151173_ae, 1);
/* 1118 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1119 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1120 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1121 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1122 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 11:
/* 1125 */           is = dropItemRand((Item)Items.field_151175_af, 1);
/* 1126 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1127 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 12:
/* 1130 */           is = dropItemRand(OreSpawnMain.MyUltimateBow, 1);
/*      */           break;
/*      */         case 13:
/* 1133 */           is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1);
/*      */           break;
/*      */         case 14:
/* 1136 */           is = dropItemRand(Items.field_151042_j, 1);
/*      */           break;
/*      */         case 15:
/* 1139 */           is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1);
/*      */           break;
/*      */         case 16:
/* 1142 */           is = dropItemRand(Items.field_151040_l, 1);
/* 1143 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1144 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1145 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1146 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1147 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1148 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1149 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 17:
/* 1152 */           is = dropItemRand(Items.field_151037_a, 1);
/* 1153 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1154 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 18:
/* 1157 */           is = dropItemRand(Items.field_151035_b, 1);
/* 1158 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1159 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1160 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 19:
/* 1163 */           is = dropItemRand(Items.field_151036_c, 1);
/* 1164 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1165 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 20:
/* 1168 */           is = dropItemRand(Items.field_151019_K, 1);
/* 1169 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1170 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 21:
/* 1173 */           is = dropItemRand((Item)Items.field_151028_Y, 1);
/* 1174 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1175 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1176 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1177 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1178 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1179 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1180 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 22:
/* 1183 */           is = dropItemRand((Item)Items.field_151030_Z, 1);
/* 1184 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1185 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1186 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1187 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1188 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 23:
/* 1191 */           is = dropItemRand((Item)Items.field_151165_aa, 1);
/* 1192 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1193 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1194 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1195 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1196 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 24:
/* 1199 */           is = dropItemRand((Item)Items.field_151167_ab, 1);
/* 1200 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1201 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 25:
/* 1204 */           is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1);
/*      */           break;
/*      */         case 26:
/* 1207 */           dropItemRand(Item.func_150898_a(Blocks.field_150339_S), 1);
/*      */           break;
/*      */         case 27:
/* 1210 */           is = dropItemRand(Items.field_151074_bl, 1);
/*      */           break;
/*      */         case 28:
/* 1213 */           is = dropItemRand(Items.field_151043_k, 1);
/*      */           break;
/*      */         case 29:
/* 1216 */           is = dropItemRand(Items.field_151150_bK, 1);
/*      */           break;
/*      */         case 30:
/* 1219 */           is = dropItemRand(Items.field_151010_B, 1);
/* 1220 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1221 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1222 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1223 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1224 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1225 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1226 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 31:
/* 1229 */           is = dropItemRand(Items.field_151011_C, 1);
/* 1230 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1231 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 32:
/* 1234 */           is = dropItemRand(Items.field_151005_D, 1);
/* 1235 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1236 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1237 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 33:
/* 1240 */           is = dropItemRand(Items.field_151006_E, 1);
/* 1241 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1242 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 34:
/* 1245 */           is = dropItemRand(Items.field_151013_M, 1);
/* 1246 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1247 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 35:
/* 1250 */           is = dropItemRand((Item)Items.field_151169_ag, 1);
/* 1251 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1252 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1253 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1254 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1255 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1256 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1257 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 36:
/* 1260 */           is = dropItemRand((Item)Items.field_151171_ah, 1);
/* 1261 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1262 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1263 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1264 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1265 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 37:
/* 1268 */           is = dropItemRand((Item)Items.field_151149_ai, 1);
/* 1269 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1270 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1271 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1272 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1273 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 38:
/* 1276 */           is = dropItemRand((Item)Items.field_151151_aj, 1);
/* 1277 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1278 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 39:
/* 1281 */           dropItemRand(Items.field_151153_ao, 1);
/*      */           break;
/*      */         case 40:
/* 1284 */           dropItemRand(Item.func_150898_a(Blocks.field_150340_R), 1);
/*      */           break;
/*      */         
/*      */         case 41:
/* 1288 */           var33 = null;
/* 1289 */           is = new ItemStack(Items.field_151153_ao, 1, 1);
/* 1290 */           var33 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
/*      */           
/* 1292 */           if (var33 != null) this.field_70170_p.func_72838_d((Entity)var33);
/*      */           
/*      */           break;
/*      */         case 42:
/* 1296 */           is = dropItemRand(OreSpawnMain.MyExperienceSword, 1);
/* 1297 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1298 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1299 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1300 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1301 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1302 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1303 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 43:
/* 1306 */           is = dropItemRand((Item)OreSpawnMain.ExperienceHelmet, 1);
/* 1307 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1308 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1309 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1310 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1311 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1312 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1313 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 44:
/* 1316 */           is = dropItemRand((Item)OreSpawnMain.ExperienceBody, 1);
/* 1317 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1318 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1319 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1320 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1321 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 45:
/* 1324 */           is = dropItemRand((Item)OreSpawnMain.ExperienceLegs, 1);
/* 1325 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1326 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1327 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1328 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1329 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 46:
/* 1332 */           is = dropItemRand((Item)OreSpawnMain.ExperienceBoots, 1);
/* 1333 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1334 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 47:
/* 1337 */           is = dropItemRand(OreSpawnMain.MyAmethystSword, 1);
/* 1338 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1339 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1340 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1341 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1342 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1343 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1344 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 48:
/* 1347 */           is = dropItemRand(OreSpawnMain.MyAmethystShovel, 1);
/* 1348 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1349 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 49:
/* 1352 */           is = dropItemRand(OreSpawnMain.MyAmethystPickaxe, 1);
/* 1353 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1354 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1355 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 50:
/* 1358 */           is = dropItemRand(OreSpawnMain.MyAmethystAxe, 1);
/* 1359 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1360 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 51:
/* 1363 */           is = dropItemRand(OreSpawnMain.MyAmethystHoe, 1);
/* 1364 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1365 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 52:
/* 1368 */           is = dropItemRand(Item.func_150898_a(OreSpawnMain.MyBlockAmethystBlock), 1);
/*      */           break;
/*      */         case 53:
/* 1371 */           is = dropItemRand((Item)OreSpawnMain.AmethystHelmet, 1);
/* 1372 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1373 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1374 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1375 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1376 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1377 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1378 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 54:
/* 1381 */           is = dropItemRand((Item)OreSpawnMain.AmethystBody, 1);
/* 1382 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1383 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1384 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1385 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1386 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 55:
/* 1389 */           is = dropItemRand((Item)OreSpawnMain.AmethystLegs, 1);
/* 1390 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1391 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1392 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1393 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1394 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 56:
/* 1397 */           is = dropItemRand((Item)OreSpawnMain.AmethystBoots, 1);
/* 1398 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1399 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 57:
/* 1402 */           is = dropItemRand((Item)OreSpawnMain.RubyHelmet, 1);
/* 1403 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1404 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1405 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1406 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1407 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1408 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1409 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 58:
/* 1412 */           is = dropItemRand((Item)OreSpawnMain.RubyBody, 1);
/* 1413 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1414 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1415 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1416 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1417 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 59:
/* 1420 */           is = dropItemRand((Item)OreSpawnMain.RubyLegs, 1);
/* 1421 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1422 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1423 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1424 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1425 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 60:
/* 1428 */           is = dropItemRand((Item)OreSpawnMain.RubyBoots, 1);
/* 1429 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1430 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 61:
/* 1433 */           is = dropItemRand(OreSpawnMain.MyRubySword, 1);
/* 1434 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1435 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1436 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1437 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1438 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1439 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1440 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 62:
/* 1443 */           is = dropItemRand(OreSpawnMain.MyRubyShovel, 1);
/* 1444 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1445 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 63:
/* 1448 */           is = dropItemRand(OreSpawnMain.MyRubyPickaxe, 1);
/* 1449 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1450 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1451 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 64:
/* 1454 */           is = dropItemRand(OreSpawnMain.MyRubyAxe, 1);
/* 1455 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1456 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 65:
/* 1459 */           is = dropItemRand(OreSpawnMain.MyRubyHoe, 1);
/* 1460 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1461 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 66:
/* 1464 */           is = dropItemRand(Item.func_150898_a(OreSpawnMain.MyBlockRubyBlock), 1);
/*      */           break;
/*      */         case 67:
/* 1467 */           is = dropItemRand((Item)OreSpawnMain.UltimateHelmet, 1);
/* 1468 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1469 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1470 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1471 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1472 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1473 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1474 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 68:
/* 1477 */           is = dropItemRand((Item)OreSpawnMain.UltimateBody, 1);
/* 1478 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1479 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1480 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1481 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1482 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 69:
/* 1485 */           is = dropItemRand((Item)OreSpawnMain.UltimateLegs, 1);
/* 1486 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1487 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1488 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1489 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1490 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 70:
/* 1493 */           is = dropItemRand((Item)OreSpawnMain.UltimateBoots, 1);
/* 1494 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1495 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 71:
/* 1498 */           is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1);
/* 1499 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1500 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 73:
/* 1503 */           is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1);
/* 1504 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1505 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 1506 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 74:
/* 1509 */           is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1);
/* 1510 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1511 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 75:
/* 1514 */           is = dropItemRand(OreSpawnMain.MyUltimateHoe, 1);
/* 1515 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 1516 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Godzilla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */