/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ 
/*     */ public class Mantis
/*     */   extends EntityMob
/*     */ {
/*  56 */   private ChunkCoordinates currentFlightTarget = null;
/*  57 */   private GenericTargetSorter TargetSorter = null;
/*  58 */   private int stuck_count = 0;
/*  59 */   private int lastX = 0;
/*  60 */   private int lastZ = 0;
/*  61 */   private Entity rt = null;
/*     */   
/*     */   public Mantis(World par1World) {
/*  64 */     super(par1World);
/*  65 */     func_70105_a(2.5F, 3.25F);
/*  66 */     func_70661_as().func_75491_a(false);
/*  67 */     this.field_70728_aV = 100;
/*  68 */     this.field_70178_ae = false;
/*  69 */     this.field_70174_ab = 5;
/*  70 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  75 */     super.func_110147_ax();
/*  76 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  77 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3199999928474426D);
/*     */     
/*  79 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Mantis_stats.attack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  85 */     super.func_70088_a();
/*  86 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  90 */     if (func_104002_bU()) return false; 
/*  91 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/*  96 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 101 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 108 */     return 0.35F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 115 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 122 */     return "orespawn:Beebuzz";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 129 */     return "orespawn:dragonfly_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 136 */     return "orespawn:alo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 150 */     return OreSpawnMain.Mantis_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 158 */     return Item.func_150898_a((Block)Blocks.field_150327_N);
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 163 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), new ItemStack(index, par1, 0));
/*     */     
/* 165 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 172 */     dropItemRand(OreSpawnMain.MyMantisClaw, 1);
/* 173 */     dropItemRand(OreSpawnMain.MyMantisClaw, 1);
/* 174 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 176 */     int var4 = 2 + this.field_70170_p.field_73012_v.nextInt(10); int i;
/* 177 */     for (i = 0; i < var4; i++) {
/* 178 */       dropItemRand(Items.field_151074_bl, 1);
/*     */     }
/* 180 */     var4 = 1 + this.field_70170_p.field_73012_v.nextInt(3);
/* 181 */     for (i = 0; i < var4; i++) {
/* 182 */       dropItemRand(OreSpawnMain.UraniumNugget, 1);
/*     */     }
/* 184 */     var4 = 1 + this.field_70170_p.field_73012_v.nextInt(3);
/* 185 */     for (i = 0; i < var4; i++) {
/* 186 */       dropItemRand(OreSpawnMain.TitaniumNugget, 1);
/*     */     }
/* 188 */     var4 = 2 + this.field_70170_p.field_73012_v.nextInt(3);
/* 189 */     for (i = 0; i < var4; i++) {
/* 190 */       dropItemRand(Items.field_151045_i, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 199 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 207 */     super.func_70071_h_();
/*     */     
/* 209 */     this.field_70181_x *= 0.6D;
/* 210 */     if (func_70090_H() && this.field_70170_p.field_73012_v.nextInt(20) == 1) {
/* 211 */       func_70652_k((Entity)this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 222 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 228 */     int xdir = 1;
/* 229 */     int zdir = 1;
/*     */     
/* 231 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 235 */     if (this.field_70128_L)
/* 236 */       return;  super.func_70619_bc();
/*     */     
/* 238 */     if (this.lastX == (int)this.field_70165_t && this.lastZ == (int)this.field_70161_v) {
/*     */       
/* 240 */       this.stuck_count++;
/*     */     } else {
/* 242 */       this.stuck_count = 0;
/* 243 */       this.lastX = (int)this.field_70165_t;
/* 244 */       this.lastZ = (int)this.field_70161_v;
/*     */     } 
/*     */ 
/*     */     
/* 248 */     if (this.currentFlightTarget == null) {
/* 249 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */ 
/*     */     
/* 253 */     if (this.stuck_count > 50 || this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 255 */       Block bid = Blocks.field_150348_b;
/* 256 */       this.stuck_count = 0;
/* 257 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 258 */         zdir = this.field_70146_Z.nextInt(9) + 4;
/* 259 */         xdir = this.field_70146_Z.nextInt(9) + 4;
/* 260 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 261 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 262 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 3, (int)this.field_70161_v + zdir);
/* 263 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 264 */         if (bid == Blocks.field_150350_a && 
/* 265 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 266 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 269 */         keep_trying--;
/*     */       }
/*     */     
/* 272 */     } else if (this.field_70146_Z.nextInt(8) == 0) {
/*     */ 
/*     */       
/* 275 */       EntityLivingBase e = null;
/* 276 */       e = (EntityLivingBase)this.rt;
/* 277 */       if (e != null && 
/* 278 */         e.field_70128_L) e = null;
/*     */       
/* 280 */       if (e == null) {
/* 281 */         e = findSomethingToAttack();
/*     */       }
/* 283 */       if (e != null) {
/*     */ 
/*     */         
/* 286 */         setAttacking(1);
/* 287 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 1, (int)e.field_70161_v);
/* 288 */         if (func_70068_e((Entity)e) < ((5.0F + e.field_70130_N / 2.0F) * (5.0F + e.field_70130_N / 2.0F))) {
/* 289 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } else {
/* 292 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 296 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 297 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 298 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 299 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.30000000149011613D;
/* 300 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 301 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.30000000149011613D;
/* 302 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 303 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 304 */     this.field_70701_bs = 1.0F;
/* 305 */     this.field_70177_z += var8 / 4.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 311 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1) {
/* 312 */       func_70691_i(1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 323 */     return true;
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
/* 341 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 351 */     boolean ret = super.func_70097_a(par1DamageSource, par2);
/* 352 */     Entity e = par1DamageSource.func_76346_g();
/* 353 */     if (e != null && e instanceof EntityLivingBase && this.currentFlightTarget != null) {
/*     */       
/* 355 */       this.rt = e;
/* 356 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     } 
/* 358 */     return ret;
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
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 373 */     for (k = -2; k <= 2; k++) {
/*     */       
/* 375 */       for (int j = -2; j <= 2; j++) {
/*     */         
/* 377 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 379 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 380 */           if (bid == Blocks.field_150474_ac) {
/* 381 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 382 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 383 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 384 */             if (s != null && 
/* 385 */               s.equals("Mantis")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 391 */     for (k = -2; k < 2; k++) {
/*     */       
/* 393 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 395 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 397 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 398 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 402 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID6 && this.field_70170_p.field_73012_v.nextInt(6) != 0) return false; 
/* 403 */     if (this.field_70163_u < 50.0D) return false; 
/* 404 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 405 */     Mantis target = null;
/* 406 */     target = (Mantis)this.field_70170_p.func_72857_a(Mantis.class, this.field_70121_D.func_72314_b(32.0D, 16.0D, 32.0D), (Entity)this);
/* 407 */     if (target != null)
/*     */     {
/* 409 */       return false;
/*     */     }
/* 411 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 419 */     return OreSpawnMain.Mantis_stats.defense;
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 435 */     if (par1EntityLiving == null)
/*     */     {
/* 437 */       return false;
/*     */     }
/* 439 */     if (par1EntityLiving == this)
/*     */     {
/* 441 */       return false;
/*     */     }
/* 443 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 446 */       return false;
/*     */     }
/* 448 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 451 */       return false;
/*     */     }
/* 453 */     if (par1EntityLiving.func_70090_H())
/*     */     {
/* 455 */       return false;
/*     */     }
/* 457 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 459 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 460 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 461 */         return false;
/*     */       }
/* 463 */       return true;
/*     */     } 
/* 465 */     if (par1EntityLiving instanceof Mantis)
/*     */     {
/* 467 */       return false;
/*     */     }
/* 469 */     if (par1EntityLiving instanceof Irukandji)
/*     */     {
/* 471 */       return false;
/*     */     }
/* 473 */     if (par1EntityLiving instanceof Skate)
/*     */     {
/* 475 */       return false;
/*     */     }
/* 477 */     if (par1EntityLiving instanceof Flounder)
/*     */     {
/* 479 */       return false;
/*     */     }
/* 481 */     if (par1EntityLiving instanceof Whale)
/*     */     {
/* 483 */       return false;
/*     */     }
/* 485 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntitySquid)
/*     */     {
/* 487 */       return false;
/*     */     }
/* 489 */     if (par1EntityLiving instanceof WaterDragon)
/*     */     {
/* 491 */       return false;
/*     */     }
/* 493 */     if (par1EntityLiving instanceof AttackSquid)
/*     */     {
/* 495 */       return false;
/*     */     }
/* 497 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 499 */       return false;
/*     */     }
/* 501 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 503 */       return false;
/*     */     }
/* 505 */     if (par1EntityLiving instanceof CloudShark)
/*     */     {
/* 507 */       return false;
/*     */     }
/* 509 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 511 */       return false;
/*     */     }
/* 513 */     if (par1EntityLiving instanceof Bee)
/*     */     {
/* 515 */       return false;
/*     */     }
/* 517 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 519 */       return false;
/*     */     }
/* 521 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 523 */       return true;
/*     */     }
/* 525 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 527 */       return true;
/*     */     }
/* 529 */     if (par1EntityLiving instanceof Cockateil)
/*     */     {
/* 531 */       return true;
/*     */     }
/* 533 */     if (par1EntityLiving instanceof Fairy)
/*     */     {
/* 535 */       return true;
/*     */     }
/* 537 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 539 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 540 */       if (p.field_71075_bZ.field_75098_d != true) {
/* 541 */         return true;
/*     */       }
/*     */     } 
/* 544 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 545 */       return true;
/*     */     }
/* 547 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 552 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 553 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D));
/* 554 */     Collections.sort(var5, this.TargetSorter);
/* 555 */     Iterator<?> var2 = var5.iterator();
/* 556 */     Entity var3 = null;
/* 557 */     EntityLivingBase var4 = null;
/*     */     
/* 559 */     while (var2.hasNext()) {
/*     */       
/* 561 */       var3 = (Entity)var2.next();
/* 562 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 564 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 566 */         return var4;
/*     */       }
/*     */     } 
/* 569 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Mantis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */