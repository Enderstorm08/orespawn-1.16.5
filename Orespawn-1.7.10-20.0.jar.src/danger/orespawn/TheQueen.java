/*      */ package danger.orespawn;
/*      */ 
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityList;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.boss.EntityDragon;
/*      */ import net.minecraft.entity.effect.EntityLightningBolt;
/*      */ import net.minecraft.entity.item.EntityItem;
/*      */ import net.minecraft.entity.monster.EntityMob;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.util.AxisAlignedBB;
/*      */ import net.minecraft.util.ChunkCoordinates;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.util.MathHelper;
/*      */ import net.minecraft.util.Vec3;
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
/*      */ 
/*      */ 
/*      */ public class TheQueen
/*      */   extends EntityMob
/*      */ {
/*   64 */   private ChunkCoordinates currentFlightTarget = null;
/*   65 */   private GenericTargetSorter TargetSorter = null;
/*   66 */   private EntityLivingBase rt = null;
/*   67 */   private double attdam = 250.0D;
/*   68 */   private int hurt_timer = 0;
/*   69 */   private int homex = 0;
/*   70 */   private int homez = 0;
/*   71 */   private int stream_count = 0;
/*   72 */   private int stream_count_l = 0;
/*   73 */   private int ticker = 0;
/*   74 */   private int player_hit_count = 0;
/*   75 */   private int backoff_timer = 0;
/*   76 */   private int guard_mode = 0;
/*   77 */   private volatile int head_found = 0;
/*   78 */   private int wing_sound = 0;
/*   79 */   private int attack_level = 1;
/*   80 */   private EntityLivingBase ev = null;
/*   81 */   private float evh = 0.0F;
/*   82 */   private int mood = 0;
/*   83 */   private int always_mad = 0;
/*      */ 
/*      */   
/*      */   public TheQueen(World par1World) {
/*   87 */     super(par1World);
/*   88 */     if (OreSpawnMain.PlayNicely == 0) {
/*   89 */       func_70105_a(22.0F, 24.0F);
/*      */     } else {
/*   91 */       func_70105_a(5.5F, 6.0F);
/*      */     } 
/*   93 */     func_70661_as().func_75491_a(false);
/*   94 */     this.field_70728_aV = 25000;
/*   95 */     this.field_70178_ae = true;
/*   96 */     this.field_70174_ab = 5000;
/*   97 */     this.field_70145_X = true;
/*   98 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*   99 */     this.field_70155_l = 12.0D;
/*  100 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  101 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  102 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  107 */     super.func_110147_ax();
/*  108 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  109 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.6200000047683716D);
/*      */     
/*  111 */     this.attdam = OreSpawnMain.TheQueen_stats.attack;
/*  112 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(this.attdam);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  118 */     int i = 0;
/*  119 */     super.func_70088_a();
/*  120 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(i));
/*  121 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*  122 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(this.mood));
/*  123 */     this.field_70180_af.func_75682_a(23, Integer.valueOf(this.attack_level));
/*      */   }
/*      */   
/*      */   public int getPlayNicely() {
/*  127 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */   
/*      */   public int getIsHappy() {
/*  131 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean func_70112_a(double par1) {
/*  141 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean isInRangeToRenderVec3D(Vec3 par1Vec3) {
/*  149 */     return true;
/*      */   }
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  153 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/*  158 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/*  163 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*      */   }
/*      */   
/*      */   public int getPower() {
/*  167 */     return this.field_70180_af.func_75679_c(23);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPower(int par1) {
/*  172 */     this.field_70180_af.func_75692_b(23, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  179 */     return 1.35F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70647_i() {
/*  186 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  193 */     return "orespawn:king_living";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  200 */     return "orespawn:king_hit";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  207 */     return "orespawn:trex_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70104_M() {
/*  214 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_82167_n(Entity par1Entity) {}
/*      */   
/*      */   public int mygetMaxHealth() {
/*  221 */     return OreSpawnMain.TheQueen_stats.health;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  229 */     return Item.func_150898_a((Block)Blocks.field_150327_N);
/*      */   }
/*      */ 
/*      */   
/*      */   private void dropItemRand(Item index, int par1) {
/*  234 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(20) - OreSpawnMain.OreSpawnRand.nextInt(20), this.field_70163_u + 12.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(20) - OreSpawnMain.OreSpawnRand.nextInt(20), new ItemStack(index, par1, 0));
/*      */     
/*  236 */     this.field_70170_p.func_72838_d((Entity)var3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  243 */     dropItemRand(OreSpawnMain.MyRoyal, 1);
/*  244 */     dropItemRand(OreSpawnMain.ThePrinceEgg, 1);
/*      */     
/*  246 */     this; spawnCreature(this.field_70170_p, "The Princess", this.field_70165_t, this.field_70163_u + 10.0D, this.field_70161_v);
/*      */     
/*  248 */     for (int i = 0; i < 56; i++) {
/*  249 */       dropItemRand(OreSpawnMain.MyQueenScale, 1);
/*  250 */       dropItemRand(Items.field_151082_bd, 1);
/*  251 */       dropItemRand(Items.field_151103_aS, 1);
/*  252 */       dropItemRand(Items.field_151078_bh, 1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70650_aV() {
/*  261 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isHappy() {
/*  266 */     if (getIsHappy() == 0) return true; 
/*  267 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  275 */     super.func_70071_h_();
/*      */     
/*  277 */     this.wing_sound++;
/*  278 */     if (this.wing_sound > 30) {
/*      */       
/*  280 */       if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 1.75F, 0.75F); 
/*  281 */       this.wing_sound = 0;
/*      */     } 
/*      */     
/*  284 */     this.field_70145_X = true;
/*  285 */     this.field_70181_x *= 0.6D;
/*  286 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() * 3 / 4)) this.attdam = (OreSpawnMain.TheQueen_stats.attack * 20); 
/*  287 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 2)) this.attdam = (OreSpawnMain.TheQueen_stats.attack * 100); 
/*  288 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 3)) this.attdam = (OreSpawnMain.TheQueen_stats.attack * 500); 
/*  289 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 4)) this.attdam = (OreSpawnMain.TheQueen_stats.attack * 1000);
/*      */     
/*  291 */     if (this.field_70170_p.field_72995_K && getPower() > 800) {
/*  292 */       float f = 7.0F;
/*      */       
/*  294 */       if (this.field_70170_p.field_73012_v.nextInt(4) == 1)
/*      */       {
/*      */         
/*  297 */         for (int i = 0; i < 10; i++) {
/*  298 */           this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + 14.0D, this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)), (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 5.0D + this.field_70159_w * 3.0D, (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 5.0D, (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 5.0D + this.field_70179_y * 3.0D);
/*      */         }
/*      */       }
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
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  315 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase)
/*      */     {
/*  317 */       if (!this.field_70170_p.field_72995_K) {
/*  318 */         EntityLivingBase e = (EntityLivingBase)par1Entity;
/*  319 */         if (!e.field_70128_L) {
/*  320 */           if (this.ev == e) {
/*  321 */             if (this.evh < e.func_110143_aJ()) e.func_70606_j(this.evh); 
/*      */           } else {
/*  323 */             this.ev = e;
/*      */           } 
/*  325 */           if (e.field_70130_N * e.field_70131_O > 30.0F) {
/*  326 */             e.func_70606_j(e.func_110143_aJ() * 3.0F / 4.0F);
/*  327 */             e.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), (float)this.attdam);
/*      */           } 
/*  329 */           this.evh = e.func_110143_aJ();
/*  330 */           if (this.evh <= 0.0F) this.ev.func_70106_y(); 
/*      */         } else {
/*  332 */           this.ev = null;
/*  333 */           this.evh = 0.0F;
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  339 */     if (par1Entity != null && par1Entity instanceof EntityDragon) {
/*  340 */       EntityDragon dr = (EntityDragon)par1Entity;
/*  341 */       DamageSource var21 = null;
/*  342 */       var21 = DamageSource.func_94539_a(null);
/*  343 */       var21.func_94540_d();
/*  344 */       if (this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*  345 */         dr.func_70965_a(dr.field_70986_h, var21, (float)this.attdam);
/*      */       } else {
/*  347 */         dr.func_70965_a(dr.field_70987_i, var21, (float)this.attdam);
/*      */       } 
/*      */     } 
/*      */     
/*  351 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), (float)this.attdam);
/*  352 */     if (var4) {
/*  353 */       double ks = 2.75D;
/*  354 */       double inair = 0.2D;
/*  355 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  356 */       inair += (this.field_70170_p.field_73012_v.nextFloat() * 0.25F);
/*  357 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 1.5D; 
/*  358 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */     } 
/*      */     
/*  361 */     return var4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  369 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 8.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean tooFarFromHome() {
/*  375 */     float d1 = (float)(this.field_70165_t - this.homex);
/*  376 */     float d2 = (float)(this.field_70161_v - this.homez);
/*      */     
/*  378 */     d1 = (float)Math.sqrt((d1 * d1 + d2 * d2));
/*  379 */     if (d1 > 120.0F) return true; 
/*  380 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70619_bc() {
/*  385 */     int xdir = 1;
/*  386 */     int zdir = 1;
/*      */ 
/*      */ 
/*      */     
/*  390 */     int attrand = 5;
/*  391 */     int updown = 0;
/*  392 */     int which = 0;
/*  393 */     EntityLivingBase e = null;
/*  394 */     EntityLivingBase f = null;
/*      */     
/*  396 */     double rr = 0.0D;
/*  397 */     double rhdir = 0.0D;
/*  398 */     double rdd = 0.0D;
/*  399 */     double pi = 3.1415926545D;
/*  400 */     double var1 = 0.0D;
/*  401 */     double var3 = 0.0D;
/*  402 */     double var5 = 0.0D;
/*  403 */     float var7 = 0.0F;
/*  404 */     float var8 = 0.0F;
/*  405 */     EntityLiving newent = null;
/*  406 */     double xzoff = 8.0D;
/*  407 */     double yoff = 14.0D;
/*  408 */     List<?> kinglist = null;
/*  409 */     Iterator<?> var2 = null;
/*  410 */     TheKing var4 = null;
/*      */     
/*  412 */     if (this.field_70128_L)
/*  413 */       return;  super.func_70619_bc();
/*      */     
/*  415 */     if (this.ev != null) {
/*  416 */       if (func_70068_e((Entity)this.ev) < 2000.0D && !this.ev.field_70128_L) {
/*  417 */         if (this.evh < this.ev.func_110143_aJ()) {
/*  418 */           this.ev.func_70606_j(this.evh);
/*      */         } else {
/*  420 */           this.evh = this.ev.func_110143_aJ();
/*      */         } 
/*  422 */         if (this.evh <= 0.0F) this.ev.func_70106_y(); 
/*      */       } else {
/*  424 */         this.ev = null;
/*  425 */         this.evh = 0.0F;
/*      */       } 
/*      */     }
/*      */     
/*  429 */     if (this.attack_level > 1000) {
/*      */       
/*  431 */       if (this.mood == 1) {
/*  432 */         int j = 15;
/*  433 */         if (this.player_hit_count < 10) j = 45; 
/*  434 */         for (int i = 0; i < j; i++) {
/*  435 */           this; Entity ppwr = spawnCreature(this.field_70170_p, "PurplePower", this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)));
/*      */ 
/*      */ 
/*      */           
/*  439 */           if (ppwr != null) {
/*  440 */             ppwr.field_70159_w = this.field_70159_w * 3.0D;
/*  441 */             ppwr.field_70179_y = this.field_70179_y * 3.0D;
/*      */           } 
/*      */         } 
/*      */       } else {
/*  445 */         if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"))
/*  446 */           for (int i = 0; i < 25; i++) {
/*  447 */             int n = this.field_70170_p.field_73012_v.nextInt(25) - this.field_70170_p.field_73012_v.nextInt(25);
/*  448 */             int k = this.field_70170_p.field_73012_v.nextInt(25) - this.field_70170_p.field_73012_v.nextInt(25);
/*  449 */             for (int j = -20; j < 20; j++) {
/*  450 */               Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k);
/*  451 */               if (bid == Blocks.field_150349_c) {
/*  452 */                 if (this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  453 */                   which = this.field_70170_p.field_73012_v.nextInt(8);
/*  454 */                   if (which == 0) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, (Block)Blocks.field_150328_O); 
/*  455 */                   if (which == 1) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, (Block)Blocks.field_150327_N); 
/*  456 */                   if (which == 2) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.MyFlowerBlueBlock); 
/*  457 */                   if (which == 3) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.MyFlowerPinkBlock); 
/*  458 */                   if (which == 4) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerRedBlock); 
/*  459 */                   if (which == 5) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerGreenBlock); 
/*  460 */                   if (which == 6) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerBlueBlock); 
/*  461 */                   if (which == 7) this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, OreSpawnMain.CrystalFlowerYellowBlock); 
/*      */                 } 
/*      */                 break;
/*      */               } 
/*  465 */               if (bid == Blocks.field_150346_d && 
/*  466 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  467 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, (Block)Blocks.field_150349_c);
/*      */                 
/*      */                 break;
/*      */               } 
/*  471 */               if (bid == Blocks.field_150348_b && 
/*  472 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  473 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, Blocks.field_150346_d);
/*      */                 
/*      */                 break;
/*      */               } 
/*  477 */               if (bid == Blocks.field_150354_m && 
/*  478 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  479 */                 if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/*  480 */                   this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k, Blocks.field_150434_aF); break;
/*      */                 } 
/*  482 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, Blocks.field_150346_d);
/*      */                 
/*      */                 break;
/*      */               } 
/*      */               
/*  487 */               if (bid == Blocks.field_150353_l && 
/*  488 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  489 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, Blocks.field_150355_j);
/*      */                 
/*      */                 break;
/*      */               } 
/*  493 */               if (bid == Blocks.field_150356_k && 
/*  494 */                 this.field_70170_p.func_147439_a((int)this.field_70165_t + n, (int)this.field_70163_u + j + 1, (int)this.field_70161_v + k) == Blocks.field_150350_a) {
/*  495 */                 this.field_70170_p.func_147449_b((int)this.field_70165_t + n, (int)this.field_70163_u + j, (int)this.field_70161_v + k, (Block)Blocks.field_150358_i);
/*      */                 
/*      */                 break;
/*      */               } 
/*  499 */               if (bid == Blocks.field_150350_a && j > 0) {
/*      */                 break;
/*      */               }
/*      */             } 
/*      */           }  
/*  504 */         for (int m = 0; m < 10; m++) {
/*  505 */           int i = this.field_70170_p.field_73012_v.nextInt(15) - this.field_70170_p.field_73012_v.nextInt(15);
/*  506 */           int k = this.field_70170_p.field_73012_v.nextInt(15) - this.field_70170_p.field_73012_v.nextInt(15);
/*  507 */           int j = this.field_70170_p.field_73012_v.nextInt(20);
/*  508 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + j, (int)this.field_70161_v + k);
/*  509 */           if (bid == Blocks.field_150350_a) {
/*  510 */             if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/*  511 */               newent = (EntityLiving)spawnCreature(this.field_70170_p, "Butterfly", this.field_70165_t + i, this.field_70163_u + j, this.field_70161_v + k);
/*      */             } else {
/*  513 */               newent = (EntityLiving)spawnCreature(this.field_70170_p, "Bird", this.field_70165_t + i, this.field_70163_u + j, this.field_70161_v + k);
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*  518 */       this.attack_level = 1;
/*      */     } 
/*      */     
/*  521 */     if (this.attack_level > 1) this.attack_level--;
/*      */     
/*  523 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/*  524 */     if ((this.homex == 0 && this.homez == 0) || this.guard_mode == 0) {
/*  525 */       this.homex = (int)this.field_70165_t;
/*  526 */       this.homez = (int)this.field_70161_v;
/*      */     } 
/*      */     
/*  529 */     if (func_110143_aJ() > (mygetMaxHealth() - 2) && this.field_70170_p.field_73012_v.nextInt(500) == 1) {
/*  530 */       this.mood = 0;
/*      */     }
/*  532 */     if (this.always_mad != 0) {
/*  533 */       this.mood = 1;
/*      */     }
/*      */     
/*  536 */     if (this.mood == 0) {
/*  537 */       this.attack_level += 10;
/*      */     }
/*      */     
/*  540 */     this.ticker++;
/*  541 */     if (this.ticker > 30000) this.ticker = 0; 
/*  542 */     if (this.ticker % 60 == 0) this.stream_count = 10; 
/*  543 */     if (this.ticker % 70 == 0) this.stream_count_l = 6; 
/*  544 */     if (this.ticker % 10 == 0) {
/*  545 */       this.field_70180_af.func_75692_b(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*  546 */       this.field_70180_af.func_75692_b(22, Integer.valueOf(this.mood));
/*  547 */       setPower(this.attack_level);
/*      */     } 
/*      */     
/*  550 */     if (this.backoff_timer > 0) this.backoff_timer--;
/*      */     
/*  552 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 2)) attrand = 3; 
/*  553 */     this.field_70145_X = true;
/*      */ 
/*      */ 
/*      */     
/*  557 */     if (this.currentFlightTarget == null) {
/*  558 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  564 */     if (tooFarFromHome() || this.field_70170_p.field_73012_v.nextInt(200) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 9.1F) {
/*      */ 
/*      */ 
/*      */       
/*  568 */       zdir = this.field_70170_p.field_73012_v.nextInt(120);
/*  569 */       xdir = this.field_70170_p.field_73012_v.nextInt(120);
/*  570 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  571 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir;
/*      */ 
/*      */       
/*  574 */       int dist = 0;
/*  575 */       for (int i = -5; i <= 5; i += 5) {
/*  576 */         for (int j = -5; j <= 5; j += 5) {
/*  577 */           Block bid = this.field_70170_p.func_147439_a(this.homex + j, (int)this.field_70163_u, this.homez + i);
/*  578 */           if (bid != Blocks.field_150350_a)
/*  579 */           { for (int k = 1; k < 20; k++) {
/*  580 */               bid = this.field_70170_p.func_147439_a(this.homex + j, (int)this.field_70163_u + k, this.homez + i);
/*  581 */               dist++;
/*  582 */               if (bid == Blocks.field_150350_a)
/*      */                 break; 
/*      */             }  }
/*  585 */           else { for (int k = 1; k < 20; k++) {
/*  586 */               bid = this.field_70170_p.func_147439_a(this.homex + j, (int)this.field_70163_u - k, this.homez + i);
/*  587 */               dist--;
/*  588 */               if (bid != Blocks.field_150350_a)
/*      */                 break; 
/*      */             }  }
/*      */         
/*      */         } 
/*  593 */       }  dist = dist / 9 + 2;
/*  594 */       if ((int)(this.field_70163_u + dist) > 230) dist = 230 - (int)this.field_70163_u; 
/*  595 */       this.currentFlightTarget.func_71571_b(this.homex + xdir, (int)(this.field_70163_u + dist), this.homez + zdir);
/*  596 */       if (this.mood == 0) {
/*  597 */         kinglist = this.field_70170_p.func_72872_a(TheKing.class, this.field_70121_D.func_72314_b(64.0D, 32.0D, 64.0D));
/*  598 */         if (kinglist != null) {
/*  599 */           Collections.sort(kinglist, this.TargetSorter);
/*  600 */           var2 = kinglist.iterator();
/*  601 */           if (var2.hasNext()) {
/*  602 */             var4 = null;
/*  603 */             var4 = (TheKing)var2.next();
/*  604 */             this.guard_mode = 0;
/*  605 */             zdir = this.field_70170_p.field_73012_v.nextInt(16);
/*  606 */             xdir = this.field_70170_p.field_73012_v.nextInt(16);
/*  607 */             if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  608 */             if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir; 
/*  609 */             this.currentFlightTarget.func_71571_b((int)var4.field_70165_t + xdir, (int)(var4.field_70163_u + (this.field_70170_p.field_73012_v.nextInt(8) - this.field_70170_p.field_73012_v.nextInt(8))), (int)var4.field_70161_v + zdir);
/*      */           }
/*      */         
/*      */         } 
/*      */       } 
/*  614 */     } else if (this.field_70170_p.field_73012_v.nextInt(attrand) == 0) {
/*      */ 
/*      */       
/*  617 */       e = this.rt;
/*  618 */       if (OreSpawnMain.PlayNicely != 0 || isHappy()) e = null; 
/*  619 */       if (e != null && (
/*  620 */         e instanceof TheQueen || e instanceof QueenHead)) {
/*  621 */         this.rt = null;
/*  622 */         e = null;
/*      */       } 
/*      */       
/*  625 */       if (e != null) {
/*      */         
/*  627 */         float d1 = (float)(e.field_70165_t - this.homex);
/*  628 */         float d2 = (float)(e.field_70161_v - this.homez);
/*  629 */         d1 = (float)Math.sqrt((d1 * d1 + d2 * d2));
/*  630 */         if (e.field_70128_L || this.field_70170_p.field_73012_v.nextInt(450) == 1 || (d1 > 128.0F && this.guard_mode == 1)) {
/*  631 */           e = null;
/*  632 */           this.rt = null;
/*      */         } 
/*  634 */         if (e != null && 
/*  635 */           !MyCanSee(e)) {
/*  636 */           e = null;
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  642 */       f = findSomethingToAttack();
/*  643 */       if (this.head_found == 0 && this.mood == 1)
/*      */       {
/*  645 */         newent = (EntityLiving)spawnCreature(this.field_70170_p, "QueenHead", this.field_70165_t, this.field_70163_u + 20.0D, this.field_70161_v);
/*      */       }
/*      */ 
/*      */       
/*  649 */       if (e == null) {
/*  650 */         e = f;
/*      */       }
/*      */       
/*  653 */       if (e != null) {
/*      */ 
/*      */         
/*  656 */         float d1 = e.field_70130_N * e.field_70131_O;
/*  657 */         if (this.attack_level < 1000) {
/*  658 */           this.attack_level += 15;
/*  659 */           if (func_110143_aJ() < (mygetMaxHealth() / 2)) this.attack_level += 15; 
/*  660 */           if (d1 > 50.0F) this.attack_level += 15; 
/*  661 */           if (d1 > 100.0F) this.attack_level += 15; 
/*  662 */           if (d1 > 200.0F) this.attack_level += 25; 
/*      */         } 
/*  664 */         setAttacking(1);
/*  665 */         if (this.backoff_timer == 0) {
/*  666 */           int dist = (int)(e.field_70163_u + (e.field_70131_O / 2.0F) + 1.0D);
/*  667 */           if (dist > 230) dist = 230; 
/*  668 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, dist, (int)e.field_70161_v);
/*  669 */           if (this.field_70170_p.field_73012_v.nextInt(50) == 1) this.backoff_timer = 90 + this.field_70170_p.field_73012_v.nextInt(90);
/*      */         
/*  671 */         } else if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 9.1F) {
/*      */ 
/*      */           
/*  674 */           zdir = this.field_70170_p.field_73012_v.nextInt(20) + 30;
/*  675 */           xdir = this.field_70170_p.field_73012_v.nextInt(20) + 30;
/*  676 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  677 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir;
/*      */ 
/*      */           
/*  680 */           int dist = 0;
/*  681 */           for (int i = -5; i <= 5; i += 5) {
/*  682 */             for (int j = -5; j <= 5; j += 5) {
/*  683 */               Block bid = this.field_70170_p.func_147439_a((int)e.field_70165_t + j, (int)this.field_70163_u, (int)e.field_70161_v + i);
/*  684 */               if (bid != Blocks.field_150350_a)
/*  685 */               { for (int k = 1; k < 20; k++) {
/*  686 */                   bid = this.field_70170_p.func_147439_a((int)e.field_70165_t + j, (int)this.field_70163_u + k, (int)e.field_70161_v + i);
/*  687 */                   dist++;
/*  688 */                   if (bid == Blocks.field_150350_a)
/*      */                     break; 
/*      */                 }  }
/*  691 */               else { for (int k = 1; k < 20; k++) {
/*  692 */                   bid = this.field_70170_p.func_147439_a((int)e.field_70165_t + j, (int)this.field_70163_u - k, (int)e.field_70161_v + i);
/*  693 */                   dist--;
/*  694 */                   if (bid != Blocks.field_150350_a)
/*      */                     break; 
/*      */                 }  }
/*      */             
/*      */             } 
/*  699 */           }  dist = dist / 9 + 2;
/*  700 */           if ((int)(this.field_70163_u + dist) > 230) dist = 230 - (int)this.field_70163_u; 
/*  701 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t + xdir, (int)(this.field_70163_u + dist), (int)e.field_70161_v + zdir);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  707 */         if (func_70068_e((Entity)e) < 900.0D) {
/*  708 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) doJumpDamage(this.field_70165_t, this.field_70163_u, this.field_70161_v, 15.0D, (OreSpawnMain.TheQueen_stats.attack / 4), 0); 
/*  709 */           func_70652_k((Entity)e);
/*      */         } 
/*      */         
/*  712 */         double dx = this.field_70165_t + 20.0D * Math.sin(Math.toRadians(this.field_70177_z));
/*  713 */         double dz = this.field_70161_v - 20.0D * Math.cos(Math.toRadians(this.field_70177_z));
/*  714 */         if (this.field_70170_p.field_73012_v.nextInt(3) == 1) doJumpDamage(dx, this.field_70163_u + 10.0D, dz, 15.0D, (OreSpawnMain.TheQueen_stats.attack / 2), 1);
/*      */         
/*  716 */         if (getHorizontalDistanceSqToEntity((Entity)e) > 900.0D) {
/*  717 */           which = this.field_70170_p.field_73012_v.nextInt(2);
/*  718 */           if (which == 0) {
/*      */             
/*  720 */             if (this.stream_count > 0) {
/*  721 */               setAttacking(1);
/*      */ 
/*      */               
/*  724 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  725 */               rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */               
/*  727 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  728 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  729 */               rdd = Math.abs(rdd);
/*      */               
/*  731 */               if (rdd < 0.5D) {
/*  732 */                 firecanon(e);
/*      */               }
/*      */             }
/*      */           
/*      */           }
/*  737 */           else if (this.stream_count_l > 0) {
/*  738 */             setAttacking(1);
/*      */ 
/*      */             
/*  741 */             rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  742 */             rhdir = Math.toRadians(((this.field_70177_z + 90.0F) % 360.0F));
/*      */             
/*  744 */             rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  745 */             if (rdd > pi) rdd -= pi * 2.0D; 
/*  746 */             rdd = Math.abs(rdd);
/*      */             
/*  748 */             if (rdd < 0.5D) {
/*  749 */               firecanonl(e);
/*      */             }
/*      */           }
/*      */         
/*      */         } 
/*      */       } else {
/*      */         
/*  756 */         setAttacking(0);
/*  757 */         this.stream_count = 10;
/*  758 */         this.stream_count_l = 6;
/*      */       } 
/*      */     } 
/*      */     
/*  762 */     var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/*  763 */     var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/*  764 */     var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  770 */     this.field_70159_w += (Math.signum(var1) * 0.65D - this.field_70159_w) * 0.35D;
/*  771 */     this.field_70181_x += (Math.signum(var3) * 0.69999D - this.field_70181_x) * 0.3D;
/*  772 */     this.field_70179_y += (Math.signum(var5) * 0.65D - this.field_70179_y) * 0.35D;
/*      */     
/*  774 */     var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/*  775 */     var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/*  776 */     this.field_70701_bs = 0.75F;
/*  777 */     this.field_70177_z += var8 / 8.0F;
/*      */ 
/*      */     
/*  780 */     if (this.field_70170_p.field_73012_v.nextInt(32) == 1 && 
/*  781 */       func_110143_aJ() < mygetMaxHealth()) {
/*      */       
/*  783 */       func_70691_i(5.0F);
/*  784 */       if (this.player_hit_count < 10) func_70691_i(50.0F);
/*      */     
/*      */     } 
/*      */     
/*  788 */     if (this.player_hit_count < 10 && func_110143_aJ() < 2000.0F) func_70691_i(2000.0F - func_110143_aJ());
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private double getHorizontalDistanceSqToEntity(Entity e) {
/*  800 */     double d1 = e.field_70161_v - this.field_70161_v;
/*  801 */     double d2 = e.field_70165_t - this.field_70165_t;
/*  802 */     return d1 * d1 + d2 * d2;
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanon(EntityLivingBase e) {
/*  807 */     double yoff = 14.0D;
/*  808 */     double xzoff = 32.0D;
/*      */ 
/*      */     
/*  811 */     BetterFireball bf = null;
/*      */     
/*  813 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/*  814 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*  815 */     if (this.stream_count > 0) {
/*      */ 
/*      */ 
/*      */       
/*  819 */       bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff, e.field_70161_v - cz);
/*  820 */       bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/*  821 */       bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/*  822 */       bf.setReallyBig();
/*  823 */       this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  824 */       this.field_70170_p.func_72838_d((Entity)bf);
/*  825 */       for (int i = 0; i < 6; i++) {
/*  826 */         float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  827 */         float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  828 */         float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  829 */         bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx + r1, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff + r2, e.field_70161_v - cz + r3);
/*  830 */         bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/*  831 */         bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/*  832 */         bf.setBig();
/*  833 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) bf.setSmall(); 
/*  834 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  835 */         this.field_70170_p.func_72838_d((Entity)bf);
/*      */       } 
/*  837 */       this.stream_count--;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanonl(EntityLivingBase e) {
/*  844 */     double yoff = 14.0D;
/*  845 */     double xzoff = 32.0D;
/*      */ 
/*      */ 
/*      */     
/*  849 */     double var3 = 0.0D;
/*  850 */     double var5 = 0.0D;
/*  851 */     double var7 = 0.0D;
/*  852 */     float var9 = 0.0F;
/*  853 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/*  854 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*  855 */     if (this.stream_count_l > 0) {
/*  856 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  857 */       for (int i = 0; i < 3; i++) {
/*  858 */         ThunderBolt lb = new ThunderBolt(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/*  859 */         lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/*  860 */         var3 = e.field_70165_t - lb.field_70165_t;
/*  861 */         var5 = e.field_70163_u + 0.25D - lb.field_70163_u;
/*  862 */         var7 = e.field_70161_v - lb.field_70161_v;
/*  863 */         var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/*  864 */         lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/*  865 */         lb.field_70159_w *= 3.0D;
/*  866 */         lb.field_70181_x *= 3.0D;
/*  867 */         lb.field_70179_y *= 3.0D;
/*  868 */         this.field_70170_p.func_72838_d((Entity)lb);
/*      */       } 
/*  870 */       this.stream_count_l--;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  880 */     return true;
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
/*      */   protected void func_70064_a(double par1, boolean par3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_145773_az() {
/*  898 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  906 */     boolean ret = false;
/*  907 */     float dm = par2;
/*      */ 
/*      */     
/*  910 */     if (this.hurt_timer > 0) return false; 
/*  911 */     if (dm > 750.0F) dm = 750.0F;
/*      */     
/*  913 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  914 */       return false;
/*      */     }
/*  916 */     this.mood = 1;
/*      */     
/*  918 */     if (par1DamageSource.func_94541_c()) {
/*  919 */       float s = func_110143_aJ();
/*  920 */       s += par2 / 2.0F;
/*  921 */       if (s > func_110138_aP()) s = func_110138_aP(); 
/*  922 */       func_70606_j(s);
/*  923 */       return false;
/*      */     } 
/*      */     
/*  926 */     Entity e = par1DamageSource.func_76346_g();
/*  927 */     if (e != null && e instanceof EntityLivingBase) {
/*      */       
/*  929 */       if (e instanceof PurplePower) return false; 
/*  930 */       float s = e.field_70131_O * e.field_70130_N;
/*  931 */       if (e instanceof EntityMob && 
/*  932 */         s < 3.0F) {
/*  933 */         e.func_70106_y();
/*  934 */         return false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  939 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*  940 */       this.hurt_timer = 20;
/*  941 */       ret = super.func_70097_a(par1DamageSource, dm);
/*      */       
/*  943 */       if (e != null && e instanceof EntityPlayer)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*  948 */         this.player_hit_count++;
/*      */       }
/*      */       
/*  951 */       if (e != null && e instanceof EntityLivingBase && this.currentFlightTarget != null)
/*      */       {
/*  953 */         if (!MyUtils.isRoyalty(e)) {
/*  954 */           this.rt = (EntityLivingBase)e;
/*  955 */           int dist = (int)e.field_70163_u;
/*  956 */           if (dist > 230) dist = 230; 
/*  957 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, dist, (int)e.field_70161_v);
/*      */         } 
/*      */       }
/*      */     } 
/*  961 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  971 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  979 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() * 2 / 3)) return OreSpawnMain.TheQueen_stats.defense + 2; 
/*  980 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 2)) return OreSpawnMain.TheQueen_stats.defense + 3; 
/*  981 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 3)) return OreSpawnMain.TheQueen_stats.defense + 5;
/*      */     
/*  983 */     return OreSpawnMain.TheQueen_stats.defense;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70077_a(EntityLightningBolt par1EntityLightningBolt) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void initCreature() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean MyCanSee(EntityLivingBase e) {
/* 1003 */     double xzoff = 10.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1010 */     int nblks = 20;
/*      */     
/* 1012 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1013 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1014 */     float startx = (float)cx;
/* 1015 */     float starty = (float)(this.field_70163_u + 14.0D);
/* 1016 */     float startz = (float)cz;
/* 1017 */     float dx = (float)((e.field_70165_t - startx) / 20.0D);
/* 1018 */     float dy = (float)((e.field_70163_u + (e.field_70131_O / 2.0F) - starty) / 20.0D);
/* 1019 */     float dz = (float)((e.field_70161_v - startz) / 20.0D);
/*      */     
/* 1021 */     if (Math.abs(dx) > 1.0D) {
/* 1022 */       dy /= Math.abs(dx);
/* 1023 */       dz /= Math.abs(dx);
/* 1024 */       nblks = (int)(nblks * Math.abs(dx));
/* 1025 */       if (dx > 1.0F) dx = 1.0F; 
/* 1026 */       if (dx < -1.0F) dx = -1.0F; 
/*      */     } 
/* 1028 */     if (Math.abs(dy) > 1.0D) {
/* 1029 */       dx /= Math.abs(dy);
/* 1030 */       dz /= Math.abs(dy);
/* 1031 */       nblks = (int)(nblks * Math.abs(dy));
/* 1032 */       if (dy > 1.0F) dy = 1.0F; 
/* 1033 */       if (dy < -1.0F) dy = -1.0F; 
/*      */     } 
/* 1035 */     if (Math.abs(dz) > 1.0D) {
/* 1036 */       dy /= Math.abs(dz);
/* 1037 */       dx /= Math.abs(dz);
/* 1038 */       nblks = (int)(nblks * Math.abs(dz));
/* 1039 */       if (dz > 1.0F) dz = 1.0F; 
/* 1040 */       if (dz < -1.0F) dz = -1.0F;
/*      */     
/*      */     } 
/* 1043 */     for (int i = 0; i < nblks; i++) {
/* 1044 */       startx += dx;
/* 1045 */       starty += dy;
/* 1046 */       startz += dz;
/* 1047 */       Block bid = this.field_70170_p.func_147439_a((int)startx, (int)starty, (int)startz);
/* 1048 */       if (bid != Blocks.field_150350_a) return false;
/*      */     
/*      */     } 
/*      */     
/* 1052 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 1062 */     if (par1EntityLiving == null)
/*      */     {
/* 1064 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1068 */     if (par1EntityLiving == this)
/*      */     {
/* 1070 */       return false;
/*      */     }
/* 1072 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*      */       
/* 1075 */       return false;
/*      */     }
/*      */     
/* 1078 */     if (par1EntityLiving instanceof QueenHead) {
/*      */       
/* 1080 */       this.head_found = 1;
/* 1081 */       return false;
/*      */     } 
/* 1083 */     if (MyUtils.isRoyalty((Entity)par1EntityLiving))
/*      */     {
/* 1085 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1090 */     float d1 = (float)(par1EntityLiving.field_70165_t - this.homex);
/* 1091 */     float d2 = (float)(par1EntityLiving.field_70161_v - this.homez);
/* 1092 */     d1 = (float)Math.sqrt((d1 * d1 + d2 * d2));
/* 1093 */     if (d1 > 144.0F) return false;
/*      */     
/* 1095 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*      */     
/* 1097 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */ 
/*      */       
/* 1101 */       return false;
/*      */     }
/*      */     
/* 1104 */     if (par1EntityLiving instanceof EntityPlayer) {
/*      */       
/* 1106 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 1107 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 1108 */         return false;
/*      */       }
/* 1110 */       return true;
/*      */     } 
/*      */     
/* 1113 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityHorse)
/*      */     {
/* 1115 */       return true;
/*      */     }
/* 1117 */     if (par1EntityLiving instanceof EntityMob)
/*      */     {
/* 1119 */       return true;
/*      */     }
/*      */     
/* 1122 */     if (par1EntityLiving instanceof EntityDragon)
/*      */     {
/* 1124 */       return true;
/*      */     }
/* 1126 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 1127 */       return true;
/*      */     }
/*      */     
/* 1130 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/* 1135 */     if (OreSpawnMain.PlayNicely != 0 || isHappy()) {
/* 1136 */       this.head_found = 1;
/* 1137 */       return null;
/*      */     } 
/* 1139 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(80.0D, 60.0D, 80.0D));
/* 1140 */     Collections.sort(var5, this.TargetSorter);
/* 1141 */     Iterator<?> var2 = var5.iterator();
/* 1142 */     Entity var3 = null;
/* 1143 */     EntityLivingBase var4 = null;
/* 1144 */     EntityLivingBase ret = null;
/*      */     
/* 1146 */     this.head_found = 0;
/* 1147 */     while (var2.hasNext()) {
/*      */       
/* 1149 */       var3 = (Entity)var2.next();
/* 1150 */       var4 = (EntityLivingBase)var3;
/*      */       
/* 1152 */       if (isSuitableTarget(var4, false))
/*      */       {
/*      */         
/* 1155 */         if (ret == null) ret = var4;
/*      */       
/*      */       }
/* 1158 */       if (ret != null && this.head_found != 0)
/*      */         break; 
/* 1160 */     }  return ret;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setGuardMode(int i) {
/* 1165 */     this.guard_mode = i;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setBadMood(int i) {
/* 1170 */     this.always_mad = i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 1180 */     super.func_70014_b(par1NBTTagCompound);
/*      */     
/* 1182 */     par1NBTTagCompound.func_74768_a("KingHomeX", this.homex);
/* 1183 */     par1NBTTagCompound.func_74768_a("KingHomeZ", this.homez);
/* 1184 */     par1NBTTagCompound.func_74768_a("GuardMode", this.guard_mode);
/* 1185 */     par1NBTTagCompound.func_74768_a("PlayerHits", this.player_hit_count);
/* 1186 */     par1NBTTagCompound.func_74768_a("MeanMode", this.always_mad);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 1195 */     super.func_70037_a(par1NBTTagCompound);
/*      */     
/* 1197 */     this.homex = par1NBTTagCompound.func_74762_e("KingHomeX");
/* 1198 */     this.homez = par1NBTTagCompound.func_74762_e("KingHomeZ");
/* 1199 */     this.guard_mode = par1NBTTagCompound.func_74762_e("GuardMode");
/* 1200 */     this.player_hit_count = par1NBTTagCompound.func_74762_e("PlayerHits");
/* 1201 */     this.always_mad = par1NBTTagCompound.func_74762_e("MeanMode");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 1210 */     Entity var8 = null;
/* 1211 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 1212 */     if (var8 != null) {
/*      */ 
/*      */       
/* 1215 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1218 */       par0World.func_72838_d(var8);
/*      */     } 
/* 1220 */     return var8;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase doJumpDamage(double X, double Y, double Z, double dist, double damage, int knock) {
/* 1225 */     AxisAlignedBB bb = AxisAlignedBB.func_72330_a(X - dist, Y - 10.0D, Z - dist, X + dist, Y + 10.0D, Z + dist);
/* 1226 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, bb);
/* 1227 */     Collections.sort(var5, this.TargetSorter);
/* 1228 */     Iterator<?> var2 = var5.iterator();
/* 1229 */     Entity var3 = null;
/* 1230 */     EntityLivingBase var4 = null;
/*      */     
/* 1232 */     while (var2.hasNext()) {
/*      */       
/* 1234 */       var3 = (Entity)var2.next();
/* 1235 */       var4 = (EntityLivingBase)var3;
/*      */       
/* 1237 */       if (var4 == null) {
/*      */         continue;
/*      */       }
/*      */       
/* 1241 */       if (var4 == this) {
/*      */         continue;
/*      */       }
/*      */       
/* 1245 */       if (!var4.func_70089_S()) {
/*      */         continue;
/*      */       }
/*      */       
/* 1249 */       if (MyUtils.isRoyalty((Entity)var4)) {
/*      */         continue;
/*      */       }
/*      */       
/* 1253 */       if (var4 instanceof Ghost || 
/* 1254 */         var4 instanceof GhostSkelly)
/*      */         continue; 
/* 1256 */       DamageSource var21 = null;
/* 1257 */       var21 = DamageSource.func_94539_a(null);
/* 1258 */       var21.func_94540_d();
/* 1259 */       var4.func_70097_a(var21, (float)damage / 2.0F);
/* 1260 */       var4.func_70097_a(DamageSource.field_76379_h, (float)damage / 2.0F);
/* 1261 */       this.field_70170_p.func_72956_a((Entity)var4, "random.explode", 0.65F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/* 1262 */       if (knock != 0) {
/* 1263 */         double ks = 2.75D;
/* 1264 */         double inair = 0.65D;
/* 1265 */         float f3 = (float)Math.atan2(var4.field_70161_v - this.field_70161_v, var4.field_70165_t - this.field_70165_t);
/* 1266 */         var4.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */       } 
/*      */     } 
/*      */     
/* 1270 */     return null;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\TheQueen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */