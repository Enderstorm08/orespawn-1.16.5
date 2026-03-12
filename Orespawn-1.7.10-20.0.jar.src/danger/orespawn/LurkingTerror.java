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
/*     */ public class LurkingTerror
/*     */   extends EntityMob
/*     */ {
/*  52 */   private ChunkCoordinates currentFlightTarget = null;
/*  53 */   private GenericTargetSorter TargetSorter = null;
/*  54 */   private RenderInfo renderdata = new RenderInfo();
/*     */   
/*     */   public LurkingTerror(World par1World) {
/*  57 */     super(par1World);
/*  58 */     func_70105_a(1.75F, 1.25F);
/*  59 */     func_70661_as().func_75491_a(false);
/*  60 */     this.field_70728_aV = 20;
/*  61 */     this.field_70178_ae = false;
/*  62 */     this.field_70174_ab = 5;
/*  63 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  68 */     super.func_110147_ax();
/*  69 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  70 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.25D);
/*  71 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.LurkingTerror_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  76 */     super.func_70088_a();
/*  77 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  78 */     if (this.renderdata == null) {
/*  79 */       this.renderdata = new RenderInfo();
/*     */     }
/*  81 */     this.renderdata.rf1 = 0.0F;
/*  82 */     this.renderdata.rf2 = 0.0F;
/*  83 */     this.renderdata.rf3 = 0.0F;
/*  84 */     this.renderdata.rf4 = 0.0F;
/*  85 */     this.renderdata.ri1 = 0;
/*  86 */     this.renderdata.ri2 = 0;
/*  87 */     this.renderdata.ri3 = 0;
/*  88 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  92 */     if (func_104002_bU()) return false; 
/*  93 */     if (getAttacking() != 0) return false; 
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getAttacking() {
/*  99 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttacking(int par1) {
/* 104 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 111 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 116 */     this.renderdata.rf1 = r.rf1;
/* 117 */     this.renderdata.rf2 = r.rf2;
/* 118 */     this.renderdata.rf3 = r.rf3;
/* 119 */     this.renderdata.rf4 = r.rf4;
/* 120 */     this.renderdata.ri1 = r.ri1;
/* 121 */     this.renderdata.ri2 = r.ri2;
/* 122 */     this.renderdata.ri3 = r.ri3;
/* 123 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 131 */     return 0.55F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 138 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 145 */     return "orespawn:lurkinghorror_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 152 */     return "orespawn:lurkinghorror_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 159 */     return "orespawn:lurkinghorror_dead";
/*     */   }
/*     */   
/*     */   public int mygetMaxHealth() {
/* 163 */     return OreSpawnMain.LurkingTerror_stats.health;
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 168 */     return OreSpawnMain.LurkingTerror_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 176 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 184 */     super.func_70071_h_();
/*     */     
/* 186 */     this.field_70181_x *= 0.6D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 194 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 5.0F);
/* 195 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 203 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 209 */     int xdir = 1;
/* 210 */     int zdir = 1;
/*     */     
/* 212 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 216 */     if (this.field_70128_L)
/* 217 */       return;  super.func_70619_bc();
/*     */     
/* 219 */     if (this.currentFlightTarget == null) {
/* 220 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */ 
/*     */     
/* 224 */     if (this.field_70146_Z.nextInt(120) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 226 */       Block bid = Blocks.field_150348_b;
/* 227 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 228 */         zdir = this.field_70146_Z.nextInt(10) + 2;
/* 229 */         xdir = this.field_70146_Z.nextInt(10) + 2;
/* 230 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 231 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 232 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(5) - 2, (int)this.field_70161_v + zdir);
/* 233 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 234 */         if (bid == Blocks.field_150350_a && 
/* 235 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 236 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 239 */         keep_trying--;
/*     */       }
/*     */     
/* 242 */     } else if (this.field_70146_Z.nextInt(9) == 0) {
/*     */ 
/*     */       
/* 245 */       EntityLivingBase e = null;
/* 246 */       e = findSomethingToAttack();
/* 247 */       if (e != null) {
/*     */         
/* 249 */         setAttacking(1);
/*     */         
/* 251 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/* 252 */         if (func_70068_e((Entity)e) < 6.0D) {
/* 253 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } else {
/*     */         
/* 257 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 261 */     double var1 = this.currentFlightTarget.field_71574_a + 0.4D - this.field_70165_t;
/* 262 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 263 */     double var5 = this.currentFlightTarget.field_71573_c + 0.4D - this.field_70161_v;
/* 264 */     this.field_70159_w += (Math.signum(var1) * 0.4D - this.field_70159_w) * 0.30000000149011613D;
/* 265 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 266 */     this.field_70179_y += (Math.signum(var5) * 0.4D - this.field_70179_y) * 0.30000000149011613D;
/* 267 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 268 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 269 */     this.field_70701_bs = 0.75F;
/* 270 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 279 */     return true;
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
/* 297 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 307 */     boolean ret = super.func_70097_a(par1DamageSource, par2);
/* 308 */     Entity e = par1DamageSource.func_76346_g();
/* 309 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 311 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     }
/* 313 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 323 */     LurkingTerror target = null;
/*     */ 
/*     */     
/* 326 */     for (int k = -2; k < 2; k++) {
/*     */       
/* 328 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 330 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 332 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 333 */           if (bid == Blocks.field_150474_ac) {
/* 334 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 335 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 336 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 337 */             if (s != null && 
/* 338 */               s.equals("Lurking Terror")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 344 */     if (!func_70814_o()) return false; 
/* 345 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 346 */     if (this.field_70170_p.field_73012_v.nextInt(2) != 1) return false; 
/* 347 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID6 && this.field_70170_p.field_73012_v.nextInt(6) != 0) return false; 
/* 348 */     target = (LurkingTerror)this.field_70170_p.func_72857_a(LurkingTerror.class, this.field_70121_D.func_72314_b(32.0D, 16.0D, 32.0D), (Entity)this);
/* 349 */     if (target != null)
/*     */     {
/* 351 */       return false;
/*     */     }
/* 353 */     if (this.field_70163_u < 10.0D) return false; 
/* 354 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 365 */     if (par1EntityLiving == null)
/*     */     {
/* 367 */       return false;
/*     */     }
/* 369 */     if (par1EntityLiving == this)
/*     */     {
/* 371 */       return false;
/*     */     }
/* 373 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 376 */       return false;
/*     */     }
/*     */     
/* 379 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 382 */       return false;
/*     */     }
/* 384 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 386 */       return false;
/*     */     }
/* 388 */     if (par1EntityLiving instanceof RockBase)
/*     */     {
/* 390 */       return false;
/*     */     }
/* 392 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 394 */       return false;
/*     */     }
/* 396 */     if (par1EntityLiving instanceof LeafMonster)
/*     */     {
/* 398 */       return false;
/*     */     }
/* 400 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 402 */       return false;
/*     */     }
/* 404 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 406 */       return false;
/*     */     }
/* 408 */     if (par1EntityLiving instanceof CloudShark)
/*     */     {
/* 410 */       return false;
/*     */     }
/* 412 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 414 */       return false;
/*     */     }
/* 416 */     if (par1EntityLiving instanceof Bee)
/*     */     {
/* 418 */       return false;
/*     */     }
/* 420 */     if (par1EntityLiving instanceof Mantis)
/*     */     {
/* 422 */       return false;
/*     */     }
/* 424 */     if (par1EntityLiving instanceof CreepingHorror)
/*     */     {
/* 426 */       return false;
/*     */     }
/* 428 */     if (par1EntityLiving instanceof Triffid)
/*     */     {
/* 430 */       return false;
/*     */     }
/* 432 */     if (par1EntityLiving instanceof PitchBlack)
/*     */     {
/* 434 */       return false;
/*     */     }
/* 436 */     if (par1EntityLiving instanceof Dragon)
/*     */     {
/* 438 */       return false;
/*     */     }
/* 440 */     if (par1EntityLiving instanceof Island)
/*     */     {
/* 442 */       return false;
/*     */     }
/* 444 */     if (par1EntityLiving instanceof IslandToo)
/*     */     {
/* 446 */       return false;
/*     */     }
/* 448 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 450 */       return false;
/*     */     }
/*     */     
/* 453 */     if (par1EntityLiving instanceof Firefly)
/*     */     {
/* 455 */       return false;
/*     */     }
/* 457 */     if (par1EntityLiving instanceof Triffid)
/*     */     {
/* 459 */       return false;
/*     */     }
/* 461 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 463 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 464 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 465 */         return false;
/*     */       }
/*     */     } 
/* 468 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 473 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 474 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 8.0D, 12.0D));
/* 475 */     Collections.sort(var5, this.TargetSorter);
/* 476 */     Iterator<?> var2 = var5.iterator();
/* 477 */     Entity var3 = null;
/* 478 */     EntityLivingBase var4 = null;
/*     */     
/* 480 */     while (var2.hasNext()) {
/*     */       
/* 482 */       var3 = (Entity)var2.next();
/* 483 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 485 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 487 */         return var4;
/*     */       }
/*     */     } 
/* 490 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 499 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 500 */     if (i == 0) return Items.field_151082_bd; 
/* 501 */     if (i == 1) return Items.field_151145_ak; 
/* 502 */     return Items.field_151008_G;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\LurkingTerror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */