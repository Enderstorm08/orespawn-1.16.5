/*      */ package danger.orespawn;
/*      */ 
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.boss.EntityDragon;
/*      */ import net.minecraft.entity.boss.EntityDragonPart;
/*      */ import net.minecraft.entity.monster.EntitySkeleton;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.entity.projectile.EntityThrowable;
/*      */ import net.minecraft.util.MovingObjectPosition;
/*      */ import net.minecraft.world.World;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class EntityCage
/*      */   extends EntityThrowable
/*      */ {
/*   23 */   private float my_rotation = 0.0F;
/*   24 */   public int my_index = 160;
/*   25 */   private World throwerWorld = null;
/*   26 */   private EntityPlayer thrower = null;
/*      */ 
/*      */   
/*      */   public EntityCage(World par1World) {
/*   30 */     super(par1World);
/*   31 */     this.throwerWorld = par1World;
/*      */   }
/*      */ 
/*      */   
/*      */   public EntityCage(World par1World, int i) {
/*   36 */     super(par1World);
/*   37 */     this.throwerWorld = par1World;
/*   38 */     this.my_index = i;
/*      */   }
/*      */ 
/*      */   
/*      */   public EntityCage(World par1World, EntityPlayer par2EntityLiving, int i) {
/*   43 */     super(par1World, (EntityLivingBase)par2EntityLiving);
/*   44 */     this.throwerWorld = par1World;
/*   45 */     this.thrower = par2EntityLiving;
/*   46 */     this.my_index = i;
/*   47 */     if (this.thrower.field_70170_p != null) this.throwerWorld = this.thrower.field_70170_p;
/*      */   
/*      */   }
/*      */ 
/*      */   
/*      */   public int getCageIndex() {
/*   53 */     return this.my_index;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*   62 */     if (par1MovingObjectPosition.field_72308_g != null && this.field_70146_Z.nextInt(10) >= 2) {
/*      */       
/*   64 */       if (this.throwerWorld != null) {
/*      */ 
/*      */ 
/*      */         
/*   68 */         for (int var3 = 0; var3 < 4; var3++) {
/*      */           
/*   70 */           this.throwerWorld.func_72869_a("smoke", par1MovingObjectPosition.field_72308_g.field_70165_t, par1MovingObjectPosition.field_72308_g.field_70163_u + 0.25D, par1MovingObjectPosition.field_72308_g.field_70161_v, 0.0D, 0.0D, 0.0D);
/*   71 */           this.throwerWorld.func_72869_a("explode", par1MovingObjectPosition.field_72308_g.field_70165_t, par1MovingObjectPosition.field_72308_g.field_70163_u + 0.25D, par1MovingObjectPosition.field_72308_g.field_70161_v, 0.0D, 0.0D, 0.0D);
/*   72 */           this.throwerWorld.func_72869_a("reddust", par1MovingObjectPosition.field_72308_g.field_70165_t, par1MovingObjectPosition.field_72308_g.field_70163_u + 0.25D, par1MovingObjectPosition.field_72308_g.field_70161_v, 0.0D, 0.0D, 0.0D);
/*      */         } 
/*   74 */         if (this.thrower != null)
/*      */         {
/*   76 */           this.throwerWorld.func_72956_a((Entity)this.thrower, "random.explode", 1.0F, 1.5F);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*   81 */       if (par1MovingObjectPosition.field_72308_g instanceof EntityPlayer) {
/*      */         
/*   83 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/*   85 */           func_145779_a(OreSpawnMain.CageEmpty, 1);
/*   86 */           func_70106_y();
/*      */         } 
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */ 
/*      */       
/*   94 */       if (par1MovingObjectPosition.field_72308_g instanceof SpiderDriver) {
/*      */         
/*   96 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*   97 */         func_145779_a(OreSpawnMain.CagedSpiderDriver, 1);
/*      */       }
/*   99 */       else if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntitySpider) {
/*      */         
/*  101 */         if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityCaveSpider) {
/*      */           
/*  103 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  104 */           func_145779_a(OreSpawnMain.CagedCaveSpider, 1);
/*      */         } else {
/*  106 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  107 */           func_145779_a(OreSpawnMain.CagedSpider, 1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  112 */       if (par1MovingObjectPosition.field_72308_g instanceof Crab) {
/*      */         
/*  114 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  115 */         func_145779_a(OreSpawnMain.CagedCrab, 1);
/*      */       } 
/*      */       
/*  118 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityBat) {
/*      */         
/*  120 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  121 */         func_145779_a(OreSpawnMain.CagedBat, 2);
/*      */       } 
/*      */       
/*  124 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityPig) {
/*      */         
/*  126 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  127 */         func_145779_a(OreSpawnMain.CagedPig, 1);
/*      */       } 
/*      */       
/*  130 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntitySquid) {
/*      */         
/*  132 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  133 */         func_145779_a(OreSpawnMain.CagedSquid, 1);
/*      */       } 
/*      */       
/*  136 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityChicken) {
/*      */         
/*  138 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  139 */         func_145779_a(OreSpawnMain.CagedChicken, 1);
/*      */       } 
/*      */       
/*  142 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityCreeper) {
/*      */         
/*  144 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  145 */         func_145779_a(OreSpawnMain.CagedCreeper, 1);
/*      */       } 
/*      */       
/*  148 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityHorse) {
/*      */         
/*  150 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  151 */         func_145779_a(OreSpawnMain.CagedHorse, 1);
/*      */       } 
/*      */       
/*  154 */       if (par1MovingObjectPosition.field_72308_g instanceof EntitySkeleton) {
/*      */         
/*  156 */         EntitySkeleton sk = (EntitySkeleton)par1MovingObjectPosition.field_72308_g;
/*  157 */         if (sk.func_82202_m() != 0) {
/*      */           
/*  159 */           func_145779_a(OreSpawnMain.CagedWitherSkeleton, 1);
/*      */         } else {
/*  161 */           func_145779_a(OreSpawnMain.CagedSkeleton, 1);
/*      */         } 
/*  163 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*      */       } 
/*      */       
/*  166 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityZombie)
/*      */       {
/*  168 */         if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityPigZombie) {
/*      */           
/*  170 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  171 */           func_145779_a(OreSpawnMain.CagedZombiePigman, 1);
/*      */         } else {
/*  173 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  174 */           func_145779_a(OreSpawnMain.CagedZombie, 1);
/*      */         } 
/*      */       }
/*      */       
/*  178 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntitySlime)
/*      */       {
/*      */         
/*  181 */         if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityMagmaCube) {
/*      */           
/*  183 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  184 */           func_145779_a(OreSpawnMain.CagedMagmaCube, 1);
/*      */         } else {
/*  186 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  187 */           func_145779_a(OreSpawnMain.CagedSlime, 1);
/*      */         } 
/*      */       }
/*      */       
/*  191 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityGhast) {
/*      */         
/*  193 */         if (this.field_70146_Z.nextInt(10) < 2) {
/*      */           
/*  195 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  197 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  198 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  202 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  203 */         func_145779_a(OreSpawnMain.CagedGhast, 1);
/*      */       } 
/*      */       
/*  206 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityEnderman) {
/*      */         
/*  208 */         if (this.field_70146_Z.nextInt(10) < 2) {
/*      */           
/*  210 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  212 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  213 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  217 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  218 */         func_145779_a(OreSpawnMain.CagedEnderman, 1);
/*      */       } 
/*      */       
/*  221 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntitySilverfish) {
/*      */         
/*  223 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  224 */         func_145779_a(OreSpawnMain.CagedSilverfish, 2);
/*      */       } 
/*      */       
/*  227 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityWitch) {
/*      */         
/*  229 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  230 */         func_145779_a(OreSpawnMain.CagedWitch, 1);
/*      */       } 
/*      */       
/*  233 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntitySheep) {
/*      */ 
/*      */         
/*  236 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  237 */         func_145779_a(OreSpawnMain.CagedSheep, 1);
/*      */       } 
/*      */       
/*  240 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityWolf) {
/*      */         
/*  242 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  243 */         func_145779_a(OreSpawnMain.CagedWolf, 1);
/*      */       } 
/*      */       
/*  246 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityOcelot) {
/*      */         
/*  248 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  249 */         func_145779_a(OreSpawnMain.CagedOcelot, 1);
/*      */       } 
/*      */       
/*  252 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityBlaze) {
/*      */         
/*  254 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  255 */         func_145779_a(OreSpawnMain.CagedBlaze, 1);
/*      */       } 
/*      */       
/*  258 */       if (par1MovingObjectPosition.field_72308_g instanceof Girlfriend) {
/*      */         
/*  260 */         Girlfriend gf = (Girlfriend)par1MovingObjectPosition.field_72308_g;
/*  261 */         if (!gf.func_70909_n()) {
/*  262 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  263 */           func_145779_a(OreSpawnMain.CagedGirlfriend, 1);
/*      */         } 
/*      */       } 
/*  266 */       if (par1MovingObjectPosition.field_72308_g instanceof Boyfriend) {
/*      */         
/*  268 */         Boyfriend gf = (Boyfriend)par1MovingObjectPosition.field_72308_g;
/*  269 */         if (!gf.func_70909_n()) {
/*  270 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  271 */           func_145779_a(OreSpawnMain.CagedBoyfriend, 1);
/*      */         } 
/*      */       } 
/*      */       
/*  275 */       if (par1MovingObjectPosition.field_72308_g instanceof EntityDragon) {
/*      */         
/*  277 */         if (this.field_70146_Z.nextInt(10) < 5) {
/*      */           
/*  279 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  281 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  282 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  286 */         EntityDragon dr = (EntityDragon)par1MovingObjectPosition.field_72308_g;
/*  287 */         dr.func_70106_y();
/*  288 */         func_145779_a(OreSpawnMain.CagedEnderDragon, 1);
/*      */       } 
/*  290 */       if (par1MovingObjectPosition.field_72308_g instanceof EntityDragonPart) {
/*      */         
/*  292 */         if (this.field_70146_Z.nextInt(10) < 5) {
/*      */           
/*  294 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  296 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  297 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  301 */         EntityDragonPart dp = (EntityDragonPart)par1MovingObjectPosition.field_72308_g;
/*  302 */         EntityDragon dr = (EntityDragon)dp.field_70259_a;
/*  303 */         dr.func_70106_y();
/*  304 */         func_145779_a(OreSpawnMain.CagedEnderDragon, 1);
/*      */       } 
/*      */       
/*  307 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntitySnowman) {
/*      */         
/*  309 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  310 */         func_145779_a(OreSpawnMain.CagedSnowGolem, 1);
/*      */       } 
/*      */       
/*  313 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityIronGolem) {
/*      */         
/*  315 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  316 */         func_145779_a(OreSpawnMain.CagedIronGolem, 1);
/*      */       } 
/*      */       
/*  319 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.boss.EntityWither) {
/*      */         
/*  321 */         if (this.field_70146_Z.nextInt(10) < 2) {
/*      */           
/*  323 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  325 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  326 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  330 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  331 */         func_145779_a(OreSpawnMain.CagedWitherBoss, 1);
/*      */       } 
/*  333 */       if (par1MovingObjectPosition.field_72308_g instanceof CrystalCow) {
/*      */         
/*  335 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  336 */         func_145779_a(OreSpawnMain.CagedCrystalCow, 1);
/*  337 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*      */           
/*  340 */           func_70106_y();
/*      */         }
/*      */         return;
/*      */       } 
/*  344 */       if (par1MovingObjectPosition.field_72308_g instanceof EnchantedCow) {
/*      */         
/*  346 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  347 */         func_145779_a(OreSpawnMain.CagedEnchantedCow, 1);
/*  348 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*      */           
/*  351 */           func_70106_y();
/*      */         }
/*      */         return;
/*      */       } 
/*  355 */       if (par1MovingObjectPosition.field_72308_g instanceof GoldCow) {
/*      */         
/*  357 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  358 */         func_145779_a(OreSpawnMain.CagedGoldCow, 1);
/*  359 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*      */           
/*  362 */           func_70106_y();
/*      */         }
/*      */         return;
/*      */       } 
/*  366 */       if (par1MovingObjectPosition.field_72308_g instanceof RedCow) {
/*      */         
/*  368 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  369 */         func_145779_a(OreSpawnMain.CagedRedCow, 1);
/*  370 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*      */           
/*  373 */           func_70106_y();
/*      */         }
/*      */         return;
/*      */       } 
/*  377 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityCow) {
/*      */         
/*  379 */         if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityMooshroom) {
/*      */           
/*  381 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  382 */           func_145779_a(OreSpawnMain.CagedMooshroom, 1);
/*      */         } else {
/*  384 */           par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  385 */           func_145779_a(OreSpawnMain.CagedCow, 1);
/*      */         } 
/*  387 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*      */           
/*  390 */           func_70106_y();
/*      */         }
/*      */         return;
/*      */       } 
/*  394 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.passive.EntityVillager) {
/*      */         
/*  396 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  397 */         func_145779_a(OreSpawnMain.CagedVillager, 1);
/*  398 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*      */           
/*  401 */           func_70106_y();
/*      */         }
/*      */         return;
/*      */       } 
/*  405 */       if (par1MovingObjectPosition.field_72308_g instanceof Mothra) {
/*      */         
/*  407 */         if (this.field_70146_Z.nextInt(10) < 4) {
/*      */           
/*  409 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  411 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  412 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  416 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  417 */         func_145779_a(OreSpawnMain.CagedMOTHRA, 1);
/*      */       } 
/*  419 */       if (par1MovingObjectPosition.field_72308_g instanceof Alosaurus) {
/*      */         
/*  421 */         if (this.field_70146_Z.nextInt(10) < 4) {
/*      */           
/*  423 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  425 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  426 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  430 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  431 */         func_145779_a(OreSpawnMain.CagedAlo, 1);
/*      */       } 
/*  433 */       if (par1MovingObjectPosition.field_72308_g instanceof Cryolophosaurus) {
/*      */         
/*  435 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  436 */         func_145779_a(OreSpawnMain.CagedCryo, 1);
/*      */       } 
/*  438 */       if (par1MovingObjectPosition.field_72308_g instanceof Camarasaurus) {
/*      */         
/*  440 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  441 */         func_145779_a(OreSpawnMain.CagedCama, 1);
/*      */       } 
/*  443 */       if (par1MovingObjectPosition.field_72308_g instanceof VelocityRaptor) {
/*      */         
/*  445 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  446 */         func_145779_a(OreSpawnMain.CagedVelo, 1);
/*      */       } 
/*  448 */       if (par1MovingObjectPosition.field_72308_g instanceof Hydrolisc) {
/*      */         
/*  450 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  451 */         func_145779_a(OreSpawnMain.CagedHydro, 1);
/*      */       } 
/*  453 */       if (par1MovingObjectPosition.field_72308_g instanceof Basilisk) {
/*      */         
/*  455 */         if (this.field_70146_Z.nextInt(10) < 6) {
/*      */           
/*  457 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  459 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  460 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  464 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  465 */         func_145779_a(OreSpawnMain.CagedBasil, 1);
/*      */       } 
/*  467 */       if (par1MovingObjectPosition.field_72308_g instanceof Dragonfly) {
/*      */         
/*  469 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  470 */         func_145779_a(OreSpawnMain.CagedDragonfly, 2);
/*      */       } 
/*  472 */       if (par1MovingObjectPosition.field_72308_g instanceof EmperorScorpion) {
/*      */         
/*  474 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/*  476 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  478 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  479 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  483 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  484 */         func_145779_a(OreSpawnMain.CagedEmperorScorpion, 1);
/*      */       } 
/*  486 */       if (par1MovingObjectPosition.field_72308_g instanceof Cephadrome) {
/*      */         
/*  488 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/*  490 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  492 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  493 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  497 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  498 */         func_145779_a(OreSpawnMain.CagedCephadrome, 1);
/*      */       } 
/*  500 */       if (par1MovingObjectPosition.field_72308_g instanceof Dragon) {
/*      */         
/*  502 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/*  504 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  506 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  507 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  511 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  512 */         func_145779_a(OreSpawnMain.CagedDragon, 1);
/*      */       } 
/*  514 */       if (par1MovingObjectPosition.field_72308_g instanceof Scorpion) {
/*      */         
/*  516 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  517 */         func_145779_a(OreSpawnMain.CagedScorpion, 1);
/*      */       } 
/*  519 */       if (par1MovingObjectPosition.field_72308_g instanceof CaveFisher) {
/*      */         
/*  521 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  522 */         func_145779_a(OreSpawnMain.CagedCaveFisher, 1);
/*      */       } 
/*  524 */       if (par1MovingObjectPosition.field_72308_g instanceof Spyro) {
/*      */         
/*  526 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  527 */         func_145779_a(OreSpawnMain.CagedSpyro, 1);
/*      */       } 
/*  529 */       if (par1MovingObjectPosition.field_72308_g instanceof Baryonyx) {
/*      */         
/*  531 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  532 */         func_145779_a(OreSpawnMain.CagedBaryonyx, 1);
/*      */       } 
/*  534 */       if (par1MovingObjectPosition.field_72308_g instanceof GammaMetroid) {
/*      */         
/*  536 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  537 */         func_145779_a(OreSpawnMain.CagedGammaMetroid, 1);
/*      */       } 
/*  539 */       if (par1MovingObjectPosition.field_72308_g instanceof Cockateil) {
/*      */         
/*  541 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  542 */         func_145779_a(OreSpawnMain.CagedCockateil, 4);
/*      */       } 
/*  544 */       if (par1MovingObjectPosition.field_72308_g instanceof AttackSquid) {
/*      */         
/*  546 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  547 */         func_145779_a(OreSpawnMain.CagedAttackSquid, 6);
/*      */       } 
/*  549 */       if (par1MovingObjectPosition.field_72308_g instanceof Kyuubi) {
/*      */         
/*  551 */         if (this.field_70146_Z.nextInt(10) < 3) {
/*      */           
/*  553 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  555 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  556 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  560 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  561 */         func_145779_a(OreSpawnMain.CagedKyuubi, 1);
/*      */       } 
/*  563 */       if (par1MovingObjectPosition.field_72308_g instanceof WaterDragon) {
/*      */         
/*  565 */         if (this.field_70146_Z.nextInt(10) < 6) {
/*      */           
/*  567 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  569 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  570 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  574 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  575 */         func_145779_a(OreSpawnMain.CagedWaterDragon, 1);
/*      */       } 
/*  577 */       if (par1MovingObjectPosition.field_72308_g instanceof Kraken) {
/*      */         
/*  579 */         if (this.field_70146_Z.nextInt(100) < 95) {
/*      */           
/*  581 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  583 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  584 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  588 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  589 */         func_145779_a(OreSpawnMain.CagedKraken, 1);
/*      */       } 
/*  591 */       if (par1MovingObjectPosition.field_72308_g instanceof Lizard) {
/*      */         
/*  593 */         if (this.field_70146_Z.nextInt(10) < 2) {
/*      */           
/*  595 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  597 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  598 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  602 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  603 */         func_145779_a(OreSpawnMain.CagedLizard, 1);
/*      */       } 
/*  605 */       if (par1MovingObjectPosition.field_72308_g instanceof Alien) {
/*      */         
/*  607 */         if (this.field_70146_Z.nextInt(10) < 5) {
/*      */           
/*  609 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  611 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  612 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  616 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  617 */         func_145779_a(OreSpawnMain.CagedAlien, 1);
/*      */       } 
/*  619 */       if (par1MovingObjectPosition.field_72308_g instanceof Bee) {
/*      */         
/*  621 */         if (this.field_70146_Z.nextInt(10) < 3) {
/*      */           
/*  623 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  625 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  626 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  630 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  631 */         func_145779_a(OreSpawnMain.CagedBee, 1);
/*      */       } 
/*  633 */       if (par1MovingObjectPosition.field_72308_g instanceof Firefly) {
/*      */         
/*  635 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  636 */         func_145779_a(OreSpawnMain.CagedFirefly, 1);
/*      */       } 
/*  638 */       if (par1MovingObjectPosition.field_72308_g instanceof Chipmunk) {
/*      */         
/*  640 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  641 */         func_145779_a(OreSpawnMain.CagedChipmunk, 1);
/*      */       } 
/*  643 */       if (par1MovingObjectPosition.field_72308_g instanceof Gazelle) {
/*      */         
/*  645 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  646 */         func_145779_a(OreSpawnMain.CagedGazelle, 1);
/*      */       } 
/*  648 */       if (par1MovingObjectPosition.field_72308_g instanceof Ostrich) {
/*      */         
/*  650 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  651 */         func_145779_a(OreSpawnMain.CagedOstrich, 1);
/*      */       } 
/*  653 */       if (par1MovingObjectPosition.field_72308_g instanceof TrooperBug) {
/*      */         
/*  655 */         if (this.field_70146_Z.nextInt(10) < 6) {
/*      */           
/*  657 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  659 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  660 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  664 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  665 */         func_145779_a(OreSpawnMain.CagedTrooper, 1);
/*      */       } 
/*  667 */       if (par1MovingObjectPosition.field_72308_g instanceof SpitBug) {
/*      */         
/*  669 */         if (this.field_70146_Z.nextInt(10) < 3) {
/*      */           
/*  671 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  673 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  674 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  678 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  679 */         func_145779_a(OreSpawnMain.CagedSpit, 1);
/*      */       } 
/*  681 */       if (par1MovingObjectPosition.field_72308_g instanceof StinkBug) {
/*      */         
/*  683 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  684 */         func_145779_a(OreSpawnMain.CagedStink, 1);
/*      */       } 
/*  686 */       if (par1MovingObjectPosition.field_72308_g instanceof CreepingHorror) {
/*      */         
/*  688 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  689 */         func_145779_a(OreSpawnMain.CagedCreepingHorror, 1);
/*      */       } 
/*  691 */       if (par1MovingObjectPosition.field_72308_g instanceof TerribleTerror) {
/*      */         
/*  693 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  694 */         func_145779_a(OreSpawnMain.CagedTerribleTerror, 1);
/*      */       } 
/*  696 */       if (par1MovingObjectPosition.field_72308_g instanceof CliffRacer) {
/*      */         
/*  698 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  699 */         func_145779_a(OreSpawnMain.CagedCliffRacer, 1);
/*      */       } 
/*  701 */       if (par1MovingObjectPosition.field_72308_g instanceof Triffid) {
/*      */         
/*  703 */         if (this.field_70146_Z.nextInt(10) < 6) {
/*      */           
/*  705 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  707 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  708 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  712 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  713 */         func_145779_a(OreSpawnMain.CagedTriffid, 1);
/*      */       } 
/*  715 */       if (par1MovingObjectPosition.field_72308_g instanceof PitchBlack) {
/*      */         
/*  717 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/*  719 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  721 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  722 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  726 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  727 */         func_145779_a(OreSpawnMain.CagedPitchBlack, 1);
/*      */       } 
/*  729 */       if (par1MovingObjectPosition.field_72308_g instanceof LurkingTerror) {
/*      */         
/*  731 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  732 */         func_145779_a(OreSpawnMain.CagedLurkingTerror, 1);
/*      */       } 
/*  734 */       if (par1MovingObjectPosition.field_72308_g instanceof WormSmall) {
/*      */         
/*  736 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  737 */         func_145779_a(OreSpawnMain.CagedSmallWorm, 1);
/*      */       } 
/*  739 */       if (par1MovingObjectPosition.field_72308_g instanceof WormMedium) {
/*      */         
/*  741 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  742 */         func_145779_a(OreSpawnMain.CagedMediumWorm, 1);
/*      */       } 
/*  744 */       if (par1MovingObjectPosition.field_72308_g instanceof Cassowary) {
/*      */         
/*  746 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  747 */         func_145779_a(OreSpawnMain.CagedCassowary, 1);
/*      */       } 
/*  749 */       if (par1MovingObjectPosition.field_72308_g instanceof CloudShark) {
/*      */         
/*  751 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  752 */         func_145779_a(OreSpawnMain.CagedCloudShark, 1);
/*      */       } 
/*  754 */       if (par1MovingObjectPosition.field_72308_g instanceof GoldFish) {
/*      */         
/*  756 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  757 */         func_145779_a(OreSpawnMain.CagedGoldFish, 1);
/*      */       } 
/*  759 */       if (par1MovingObjectPosition.field_72308_g instanceof LeafMonster) {
/*      */         
/*  761 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  762 */         func_145779_a(OreSpawnMain.CagedLeafMonster, 1);
/*      */       } 
/*  764 */       if (par1MovingObjectPosition.field_72308_g instanceof WormLarge) {
/*      */         
/*  766 */         if (this.field_70146_Z.nextInt(10) < 5) {
/*      */           
/*  768 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  770 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  771 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  775 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  776 */         func_145779_a(OreSpawnMain.CagedLargeWorm, 1);
/*      */       } 
/*  778 */       if (par1MovingObjectPosition.field_72308_g instanceof EnderKnight) {
/*      */         
/*  780 */         if (this.field_70146_Z.nextInt(10) < 3) {
/*      */           
/*  782 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  784 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  785 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  789 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  790 */         func_145779_a(OreSpawnMain.CagedEnderKnight, 1);
/*      */       } 
/*  792 */       if (par1MovingObjectPosition.field_72308_g instanceof EnderReaper) {
/*      */         
/*  794 */         if (this.field_70146_Z.nextInt(10) < 2) {
/*      */           
/*  796 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  798 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  799 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  803 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  804 */         func_145779_a(OreSpawnMain.CagedEnderReaper, 1);
/*      */       } 
/*  806 */       if (par1MovingObjectPosition.field_72308_g instanceof Beaver) {
/*      */         
/*  808 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  809 */         func_145779_a(OreSpawnMain.CagedBeaver, 1);
/*      */       } 
/*  811 */       if (par1MovingObjectPosition.field_72308_g instanceof Urchin) {
/*      */         
/*  813 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  814 */         func_145779_a(OreSpawnMain.CagedUrchin, 1);
/*      */       } 
/*  816 */       if (par1MovingObjectPosition.field_72308_g instanceof Flounder) {
/*      */         
/*  818 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  819 */         func_145779_a(OreSpawnMain.CagedFlounder, 1);
/*      */       } 
/*  821 */       if (par1MovingObjectPosition.field_72308_g instanceof Skate) {
/*      */         
/*  823 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  824 */         func_145779_a(OreSpawnMain.CagedSkate, 1);
/*      */       } 
/*  826 */       if (par1MovingObjectPosition.field_72308_g instanceof Rotator) {
/*      */         
/*  828 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  829 */         func_145779_a(OreSpawnMain.CagedRotator, 1);
/*      */       } 
/*  831 */       if (par1MovingObjectPosition.field_72308_g instanceof Peacock) {
/*      */         
/*  833 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  834 */         func_145779_a(OreSpawnMain.CagedPeacock, 1);
/*      */       } 
/*  836 */       if (par1MovingObjectPosition.field_72308_g instanceof Fairy) {
/*      */         
/*  838 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  839 */         func_145779_a(OreSpawnMain.CagedFairy, 1);
/*      */       } 
/*  841 */       if (par1MovingObjectPosition.field_72308_g instanceof DungeonBeast) {
/*      */         
/*  843 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  844 */         func_145779_a(OreSpawnMain.CagedDungeonBeast, 1);
/*      */       } 
/*  846 */       if (par1MovingObjectPosition.field_72308_g instanceof Vortex) {
/*      */         
/*  848 */         if (this.field_70146_Z.nextInt(10) < 3) {
/*      */           
/*  850 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  852 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  853 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  857 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  858 */         func_145779_a(OreSpawnMain.CagedVortex, 1);
/*      */       } 
/*  860 */       if (par1MovingObjectPosition.field_72308_g instanceof Rat) {
/*      */         
/*  862 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  863 */         func_145779_a(OreSpawnMain.CagedRat, 1);
/*      */       } 
/*  865 */       if (par1MovingObjectPosition.field_72308_g instanceof Whale) {
/*      */         
/*  867 */         if (this.field_70146_Z.nextInt(10) < 2) {
/*      */           
/*  869 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  871 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  872 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  876 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  877 */         func_145779_a(OreSpawnMain.CagedWhale, 1);
/*      */       } 
/*  879 */       if (par1MovingObjectPosition.field_72308_g instanceof Irukandji) {
/*      */         
/*  881 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  882 */         func_145779_a(OreSpawnMain.CagedIrukandji, 1);
/*      */       } 
/*  884 */       if (par1MovingObjectPosition.field_72308_g instanceof Stinky) {
/*      */         
/*  886 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  887 */         func_145779_a(OreSpawnMain.CagedStinky, 1);
/*      */       } 
/*  889 */       if (par1MovingObjectPosition.field_72308_g instanceof Mantis) {
/*      */         
/*  891 */         if (this.field_70146_Z.nextInt(10) < 3) {
/*      */           
/*  893 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  895 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  896 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  900 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  901 */         func_145779_a(OreSpawnMain.CagedMantis, 1);
/*      */       } 
/*  903 */       if (par1MovingObjectPosition.field_72308_g instanceof TRex) {
/*      */         
/*  905 */         if (this.field_70146_Z.nextInt(10) < 4) {
/*      */           
/*  907 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  909 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  910 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  914 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  915 */         func_145779_a(OreSpawnMain.CagedTRex, 1);
/*      */       } 
/*  917 */       if (par1MovingObjectPosition.field_72308_g instanceof HerculesBeetle) {
/*      */         
/*  919 */         if (this.field_70146_Z.nextInt(10) < 5) {
/*      */           
/*  921 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  923 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  924 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  928 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  929 */         func_145779_a(OreSpawnMain.CagedHercules, 1);
/*      */       } 
/*  931 */       if (par1MovingObjectPosition.field_72308_g instanceof EasterBunny) {
/*      */         
/*  933 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  934 */         func_145779_a(OreSpawnMain.CagedEasterBunny, 1);
/*      */       } 
/*  936 */       if (par1MovingObjectPosition.field_72308_g instanceof CaterKiller) {
/*      */         
/*  938 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/*  940 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  942 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  943 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  947 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  948 */         func_145779_a(OreSpawnMain.CagedCaterKiller, 1);
/*      */       } 
/*  950 */       if (par1MovingObjectPosition.field_72308_g instanceof Molenoid) {
/*      */         
/*  952 */         if (this.field_70146_Z.nextInt(10) < 5) {
/*      */           
/*  954 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  956 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  957 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  961 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  962 */         func_145779_a(OreSpawnMain.CagedMolenoid, 1);
/*      */       } 
/*  964 */       if (par1MovingObjectPosition.field_72308_g instanceof SeaMonster) {
/*      */         
/*  966 */         if (this.field_70146_Z.nextInt(10) < 3) {
/*      */           
/*  968 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  970 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  971 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  975 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  976 */         func_145779_a(OreSpawnMain.CagedSeaMonster, 1);
/*      */       } 
/*  978 */       if (par1MovingObjectPosition.field_72308_g instanceof SeaViper) {
/*      */         
/*  980 */         if (this.field_70146_Z.nextInt(10) < 4) {
/*      */           
/*  982 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/*  984 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/*  985 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/*  989 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  990 */         func_145779_a(OreSpawnMain.CagedSeaViper, 1);
/*      */       } 
/*  992 */       if (par1MovingObjectPosition.field_72308_g instanceof RubberDucky) {
/*      */         
/*  994 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/*  995 */         func_145779_a(OreSpawnMain.CagedRubberDucky, 1);
/*      */       } 
/*  997 */       if (par1MovingObjectPosition.field_72308_g instanceof Leon) {
/*      */         
/*  999 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/* 1001 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1003 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/* 1004 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/* 1008 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1009 */         func_145779_a(OreSpawnMain.CagedLeon, 1);
/*      */       } 
/* 1011 */       if (par1MovingObjectPosition.field_72308_g instanceof Hammerhead) {
/*      */         
/* 1013 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/* 1015 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1017 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/* 1018 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/* 1022 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1023 */         func_145779_a(OreSpawnMain.CagedHammerhead, 1);
/*      */       } 
/* 1025 */       if (par1MovingObjectPosition.field_72308_g instanceof BandP) {
/*      */         
/* 1027 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1028 */         func_145779_a(OreSpawnMain.CagedCriminal, 1);
/*      */       } 
/* 1030 */       if (par1MovingObjectPosition.field_72308_g instanceof Cricket) {
/*      */         
/* 1032 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1033 */         func_145779_a(OreSpawnMain.CagedCricket, 1);
/*      */       } 
/* 1035 */       if (par1MovingObjectPosition.field_72308_g instanceof Frog) {
/*      */         
/* 1037 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1038 */         func_145779_a(OreSpawnMain.CagedFrog, 1);
/*      */       } 
/* 1040 */       if (par1MovingObjectPosition.field_72308_g instanceof Brutalfly) {
/*      */         
/* 1042 */         if (this.field_70146_Z.nextInt(10) < 5) {
/*      */           
/* 1044 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1046 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/* 1047 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/* 1051 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1052 */         func_145779_a(OreSpawnMain.CagedBrutalfly, 1);
/*      */       } 
/* 1054 */       if (par1MovingObjectPosition.field_72308_g instanceof Nastysaurus) {
/*      */         
/* 1056 */         if (this.field_70146_Z.nextInt(10) < 7) {
/*      */           
/* 1058 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1060 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/* 1061 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/* 1065 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1066 */         func_145779_a(OreSpawnMain.CagedNastysaurus, 1);
/*      */       } 
/* 1068 */       if (par1MovingObjectPosition.field_72308_g instanceof Pointysaurus)
/*      */       {
/* 1070 */         if (this.field_70146_Z.nextInt(10) < 2) {
/*      */           
/* 1072 */           if (!this.field_70170_p.field_72995_K) {
/*      */             
/* 1074 */             func_145779_a(OreSpawnMain.CageEmpty, 1);
/* 1075 */             func_70106_y();
/*      */           } 
/*      */           return;
/*      */         } 
/* 1079 */         par1MovingObjectPosition.field_72308_g.func_70106_y();
/* 1080 */         func_145779_a(OreSpawnMain.CagedPointysaurus, 1);
/*      */       }
/*      */     
/*      */     }
/* 1084 */     else if (!this.field_70170_p.field_72995_K) {
/*      */ 
/*      */       
/* 1087 */       func_145779_a(OreSpawnMain.CageEmpty, 1);
/*      */     } 
/*      */ 
/*      */     
/* 1091 */     if (!this.field_70170_p.field_72995_K)
/*      */     {
/*      */       
/* 1094 */       func_70106_y();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/* 1111 */     super.func_70071_h_();
/*      */ 
/*      */     
/* 1114 */     this.my_rotation += 20.0F;
/*      */     
/* 1116 */     while (this.my_rotation > 360.0F) {
/* 1117 */       this.my_rotation -= 360.0F;
/*      */     }
/*      */ 
/*      */     
/* 1121 */     this.field_70125_A = this.field_70127_C = this.my_rotation;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityCage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */