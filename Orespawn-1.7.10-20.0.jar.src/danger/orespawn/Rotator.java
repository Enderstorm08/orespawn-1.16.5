/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
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
/*     */ public class Rotator
/*     */   extends EntityMob
/*     */ {
/*  53 */   private ChunkCoordinates currentFlightTarget = null;
/*  54 */   private GenericTargetSorter TargetSorter = null;
/*  55 */   private RenderInfo renderdata = new RenderInfo();
/*  56 */   private int busy_fighting = 0;
/*  57 */   private int was_spawnered = 0;
/*     */   
/*     */   public Rotator(World par1World) {
/*  60 */     super(par1World);
/*  61 */     func_70105_a(1.0F, 2.0F);
/*  62 */     this.field_70728_aV = 35;
/*  63 */     this.field_70178_ae = true;
/*  64 */     this.field_70174_ab = 25;
/*  65 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  66 */     this.renderdata = new RenderInfo();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  71 */     super.func_110147_ax();
/*  72 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  73 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.25D);
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Rotator_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  79 */     super.func_70088_a();
/*  80 */     if (this.renderdata == null) {
/*  81 */       this.renderdata = new RenderInfo();
/*     */     }
/*  83 */     this.renderdata.rf1 = 0.0F;
/*  84 */     this.renderdata.rf2 = 0.0F;
/*  85 */     this.renderdata.rf3 = 0.0F;
/*  86 */     this.renderdata.rf4 = 0.0F;
/*  87 */     this.renderdata.ri1 = 0;
/*  88 */     this.renderdata.ri2 = 0;
/*  89 */     this.renderdata.ri3 = 0;
/*  90 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/*  97 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 102 */     this.renderdata.rf1 = r.rf1;
/* 103 */     this.renderdata.rf2 = r.rf2;
/* 104 */     this.renderdata.rf3 = r.rf3;
/* 105 */     this.renderdata.rf4 = r.rf4;
/* 106 */     this.renderdata.ri1 = r.ri1;
/* 107 */     this.renderdata.ri2 = r.ri2;
/* 108 */     this.renderdata.ri3 = r.ri3;
/* 109 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 114 */     if (func_104002_bU()) return false; 
/* 115 */     if (this.busy_fighting != 0) return false; 
/* 116 */     if (this.was_spawnered != 0) return false; 
/* 117 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 124 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 131 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 138 */     return "vortexlive";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 145 */     return "orespawn:glasshit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 152 */     return "orespawn:glassdead";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 166 */     return OreSpawnMain.Rotator_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 173 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 181 */     EntityLivingBase e = null;
/* 182 */     super.func_70071_h_();
/*     */     
/* 184 */     this.field_70181_x *= 0.6D;
/* 185 */     if (this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 186 */       this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u + 1.399999976158142D, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 4.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 4.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 4.0F));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 191 */     this.busy_fighting = 0;
/* 192 */     e = findSomethingToAttack();
/* 193 */     if (e != null) {
/*     */       
/* 195 */       double a = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/* 196 */       this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u + 1.399999976158142D, this.field_70161_v, Math.cos(a), (e.field_70163_u - this.field_70163_u) / 10.0D, Math.sin(a));
/*     */ 
/*     */ 
/*     */       
/* 200 */       this.busy_fighting = 1;
/*     */     } 
/*     */ 
/*     */     
/* 204 */     if (func_104002_bU())
/* 205 */       return;  if (this.busy_fighting != 0)
/* 206 */       return;  if (this.was_spawnered != 0)
/* 207 */       return;  long t = this.field_70170_p.func_72820_D();
/* 208 */     t %= 24000L;
/* 209 */     if (t < 12000L && this.field_70170_p.field_73012_v.nextInt(400) == 1) func_70106_y();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 218 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 224 */     int xdir = 1;
/* 225 */     int zdir = 1;
/*     */     
/* 227 */     int keep_trying = 50;
/*     */ 
/*     */     
/* 230 */     EntityLivingBase e = null;
/*     */     
/* 232 */     if (this.field_70128_L)
/* 233 */       return;  super.func_70619_bc();
/*     */     
/* 235 */     if (this.currentFlightTarget == null) {
/* 236 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */     
/* 239 */     if (this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 241 */       Block bid = Blocks.field_150348_b;
/* 242 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 243 */         zdir = this.field_70146_Z.nextInt(10) + 8;
/* 244 */         xdir = this.field_70146_Z.nextInt(10) + 8;
/* 245 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 246 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 247 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 3, (int)this.field_70161_v + zdir);
/* 248 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 249 */         if (bid == Blocks.field_150350_a && 
/* 250 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 251 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 254 */         keep_trying--;
/*     */       }
/*     */     
/* 257 */     } else if (this.field_70146_Z.nextInt(9) == 2) {
/*     */ 
/*     */ 
/*     */       
/* 261 */       e = findSomethingToAttack();
/* 262 */       if (e != null) {
/*     */ 
/*     */ 
/*     */         
/* 266 */         double a = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/* 267 */         a += 1.5707963267948966D;
/* 268 */         this.currentFlightTarget.func_71571_b((int)(e.field_70165_t + 2.5D * Math.cos(a)), (int)e.field_70163_u, (int)(e.field_70161_v + 2.5D * Math.sin(a)));
/*     */         
/* 270 */         if (func_70068_e((Entity)e) < 9.0D) {
/* 271 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 278 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 279 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 280 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 281 */     this.field_70159_w += (Math.signum(var1) * 0.4D - this.field_70159_w) * 0.2D;
/* 282 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 283 */     this.field_70179_y += (Math.signum(var5) * 0.4D - this.field_70179_y) * 0.2D;
/* 284 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 285 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 286 */     this.field_70701_bs = 0.75F;
/* 287 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 296 */     return true;
/*     */   }
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
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_145773_az() {
/* 314 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 322 */     boolean ret = false;
/* 323 */     Entity e = par1DamageSource.func_76346_g();
/* 324 */     if (e != null && e instanceof net.minecraft.entity.projectile.EntityArrow)
/*     */     {
/* 326 */       return false;
/*     */     }
/* 328 */     ret = super.func_70097_a(par1DamageSource, par2);
/* 329 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 331 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     }
/* 333 */     return ret;
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
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 346 */     for (k = -2; k <= 2; k++) {
/*     */       
/* 348 */       for (int j = -2; j <= 2; j++) {
/*     */         
/* 350 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 352 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 353 */           if (bid == Blocks.field_150474_ac) {
/* 354 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 355 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 356 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 357 */             if (s != null && 
/* 358 */               s.equals("Rotator")) {
/* 359 */               this.was_spawnered = 1;
/* 360 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 367 */     if (!func_70814_o()) return false;
/*     */     
/* 369 */     for (k = -1; k <= 1; k++) {
/*     */       
/* 371 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 373 */         for (int i = 1; i < 3; i++) {
/*     */           
/* 375 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 376 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 380 */     long t = this.field_70170_p.func_72820_D();
/* 381 */     t %= 24000L;
/* 382 */     if (t < 12000L) return false;
/*     */     
/* 384 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 392 */     return OreSpawnMain.Rotator_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 402 */     if (par1EntityLiving == null)
/*     */     {
/* 404 */       return false;
/*     */     }
/* 406 */     if (par1EntityLiving == this)
/*     */     {
/* 408 */       return false;
/*     */     }
/* 410 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 413 */       return false;
/*     */     }
/*     */     
/* 416 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 418 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 421 */       return false;
/*     */     }
/*     */     
/* 424 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 426 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 427 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 428 */         return false;
/*     */       }
/*     */     } 
/* 431 */     if (par1EntityLiving instanceof Termite)
/*     */     {
/* 433 */       return false;
/*     */     }
/* 435 */     if (par1EntityLiving instanceof Vortex)
/*     */     {
/* 437 */       return false;
/*     */     }
/* 439 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 441 */       return false;
/*     */     }
/* 443 */     if (par1EntityLiving instanceof DungeonBeast)
/*     */     {
/* 445 */       return false;
/*     */     }
/* 447 */     if (par1EntityLiving instanceof Peacock)
/*     */     {
/* 449 */       return false;
/*     */     }
/* 451 */     if (par1EntityLiving instanceof CrystalCow)
/*     */     {
/* 453 */       return false;
/*     */     }
/* 455 */     if (par1EntityLiving instanceof Irukandji)
/*     */     {
/* 457 */       return false;
/*     */     }
/* 459 */     if (par1EntityLiving instanceof Skate)
/*     */     {
/* 461 */       return false;
/*     */     }
/* 463 */     if (par1EntityLiving instanceof Whale)
/*     */     {
/* 465 */       return false;
/*     */     }
/* 467 */     if (par1EntityLiving instanceof Flounder)
/*     */     {
/* 469 */       return false;
/*     */     }
/* 471 */     if (par1EntityLiving instanceof Urchin)
/*     */     {
/* 473 */       return false;
/*     */     }
/* 475 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 477 */       return false;
/*     */     }
/* 479 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 481 */       return false;
/*     */     }
/* 483 */     if (par1EntityLiving instanceof CloudShark)
/*     */     {
/* 485 */       return false;
/*     */     }
/* 487 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 489 */       return false;
/*     */     }
/* 491 */     if (par1EntityLiving instanceof Bee)
/*     */     {
/* 493 */       return false;
/*     */     }
/* 495 */     if (par1EntityLiving instanceof Mantis)
/*     */     {
/* 497 */       return false;
/*     */     }
/*     */     
/* 500 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 505 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 506 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 10.0D, 12.0D));
/* 507 */     Collections.sort(var5, this.TargetSorter);
/* 508 */     Iterator<?> var2 = var5.iterator();
/* 509 */     Entity var3 = null;
/* 510 */     EntityLivingBase var4 = null;
/*     */     
/* 512 */     while (var2.hasNext()) {
/*     */       
/* 514 */       var3 = (Entity)var2.next();
/* 515 */       var4 = (EntityLivingBase)var3;
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
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 531 */     int i = this.field_70170_p.field_73012_v.nextInt(4);
/* 532 */     if (i == 0) return OreSpawnMain.MyCrystalPinkIngot; 
/* 533 */     if (i == 1) return OreSpawnMain.MyTigersEyeIngot; 
/* 534 */     if (i == 2) return Item.func_150898_a(OreSpawnMain.CrystalCoal); 
/* 535 */     if (i == 3) return Items.field_151042_j; 
/* 536 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Rotator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */