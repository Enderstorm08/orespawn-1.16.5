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
/*     */ public class Molenoid
/*     */   extends EntityMob
/*     */ {
/*  51 */   private GenericTargetSorter TargetSorter = null;
/*  52 */   private float moveSpeed = 0.35F;
/*     */ 
/*     */   
/*     */   public Molenoid(World par1World) {
/*  56 */     super(par1World);
/*  57 */     func_70105_a(3.9F, 2.6F);
/*  58 */     func_70661_as().func_75491_a(true);
/*  59 */     this.field_70728_aV = 40;
/*  60 */     this.field_70174_ab = 100;
/*  61 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  62 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  63 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  64 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
/*  65 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  66 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  67 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  72 */     super.func_110147_ax();
/*  73 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  75 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Molenoid_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  80 */     super.func_70088_a();
/*  81 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  85 */     if (func_104002_bU()) return false; 
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  94 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  95 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 100 */     return OreSpawnMain.Molenoid_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 108 */     return OreSpawnMain.Molenoid_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 125 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 135 */     if (this.field_70146_Z.nextInt(3) == 0) {
/* 136 */       return "orespawn:molenoid_living";
/*     */     }
/* 138 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 147 */     return "orespawn:molenoid_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 155 */     return "orespawn:molenoid_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 162 */     return 1.1F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 169 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 179 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 184 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
/*     */     
/* 186 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 193 */     dropItemRand(OreSpawnMain.MolenoidNose, 1);
/* 194 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/*     */     int var4;
/* 197 */     for (var4 = 0; var4 < 10; var4++) {
/* 198 */       dropItemRand(Items.field_151074_bl, 1);
/*     */     }
/* 200 */     for (var4 = 0; var4 < 6; var4++) {
/* 201 */       dropItemRand(Items.field_151082_bd, 1);
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
/* 218 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 223 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 224 */       return false;
/*     */     }
/* 226 */     return super.func_70097_a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 233 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 235 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 237 */         double ks = 0.8D;
/* 238 */         double inair = 0.1D;
/* 239 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 240 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 241 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 243 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 247 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 255 */     EntityLivingBase e = null;
/* 256 */     if (this.field_70128_L)
/* 257 */       return;  super.func_70619_bc();
/* 258 */     if (this.field_70170_p.field_73012_v.nextInt(4) == 0) {
/* 259 */       e = findSomethingToAttack();
/* 260 */       if (e != null) {
/* 261 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 262 */         if (func_70068_e((Entity)e) < ((6.0F + e.field_70130_N / 2.0F) * (6.0F + e.field_70130_N / 2.0F))) {
/* 263 */           setAttacking(1);
/*     */           
/* 265 */           if (func_70068_e((Entity)e) < 16.0D && (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)) {
/*     */             
/* 267 */             func_70652_k((Entity)e);
/*     */           
/*     */           }
/* 270 */           else if (OreSpawnMain.PlayNicely == 0) {
/* 271 */             int j = 1 + this.field_70170_p.field_73012_v.nextInt(4);
/* 272 */             for (int k = 0; k < j; k++) {
/* 273 */               double d1 = e.field_70165_t;
/* 274 */               double d2 = e.field_70161_v;
/* 275 */               d1 += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 2.0D;
/* 276 */               d2 += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 2.0D;
/* 277 */               for (int i = 4; i > -3; i--) {
/* 278 */                 if (this.field_70170_p.func_147439_a((int)d1, (int)e.field_70163_u + i + 1, (int)d2) == Blocks.field_150350_a && 
/* 279 */                   this.field_70170_p.func_147439_a((int)d1, (int)e.field_70163_u + i, (int)d2) != Blocks.field_150350_a) {
/* 280 */                   this.field_70170_p.func_147449_b((int)d1, (int)e.field_70163_u + i + 1, (int)d2, OreSpawnMain.MyMoleDirtBlock);
/*     */ 
/*     */                   
/*     */                   break;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } else {
/* 289 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*     */         } 
/*     */       } else {
/* 292 */         setAttacking(0);
/*     */       } 
/*     */     } 
/* 295 */     if (this.field_70170_p.field_72995_K)
/* 296 */       return;  if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/* 297 */       double spd = 0.0D;
/*     */       
/* 299 */       spd = this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y;
/* 300 */       spd = Math.sqrt(spd);
/* 301 */       if (spd > this.moveSpeed) spd = this.moveSpeed; 
/* 302 */       int odds = (int)(100.0D * spd / this.moveSpeed);
/*     */       
/* 304 */       if (odds > 0 && 
/* 305 */         this.field_70170_p.field_73012_v.nextInt(100) < odds && OreSpawnMain.PlayNicely == 0) {
/*     */ 
/*     */         
/* 308 */         double d1 = this.field_70165_t + 6.0D * Math.sin(Math.toRadians(this.field_70759_as));
/* 309 */         double d2 = this.field_70161_v - 6.0D * Math.cos(Math.toRadians(this.field_70759_as));
/* 310 */         d1 += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 3.0D;
/* 311 */         d2 += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 3.0D;
/* 312 */         for (int i = 4; i > -4; i--) {
/* 313 */           if (this.field_70170_p.func_147439_a((int)d1, (int)this.field_70163_u + i + 1, (int)d2) == Blocks.field_150350_a && 
/* 314 */             this.field_70170_p.func_147439_a((int)d1, (int)this.field_70163_u + i, (int)d2) != Blocks.field_150350_a) {
/* 315 */             this.field_70170_p.func_147449_b((int)d1, (int)this.field_70163_u + i + 1, (int)d2, OreSpawnMain.MyMoleDirtBlock);
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 326 */     double dx = this.field_70165_t - 3.0D * Math.sin(Math.toRadians(this.field_70759_as));
/* 327 */     double dz = this.field_70161_v + 3.0D * Math.cos(Math.toRadians(this.field_70759_as));
/* 328 */     dx += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 3.0D;
/* 329 */     dz += (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 3.0D;
/* 330 */     int dir = 1;
/* 331 */     if (e != null) {
/* 332 */       if ((int)e.field_70163_u > (int)this.field_70163_u) dir = 2; 
/* 333 */       if ((int)e.field_70163_u < (int)this.field_70163_u) dir = 0; 
/*     */     } 
/* 335 */     if (OreSpawnMain.PlayNicely == 0) {
/* 336 */       for (int i = dir; i < dir + 3; i++) {
/* 337 */         Block bid = this.field_70170_p.func_147439_a((int)dx, (int)this.field_70163_u + i, (int)dz);
/* 338 */         if ((bid == Blocks.field_150346_d || bid == Blocks.field_150349_c || bid == Blocks.field_150351_n || bid == Blocks.field_150354_m || bid == Blocks.field_150362_t) && 
/* 339 */           this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147449_b((int)dx, (int)this.field_70163_u + i, (int)dz, Blocks.field_150350_a);
/*     */         
/* 341 */         if (bid == OreSpawnMain.MyMoleDirtBlock) {
/* 342 */           this.field_70170_p.func_147449_b((int)dx, (int)this.field_70163_u + i, (int)dz, Blocks.field_150350_a);
/*     */         }
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 356 */     if (par1EntityLiving == null)
/*     */     {
/* 358 */       return false;
/*     */     }
/* 360 */     if (par1EntityLiving == this)
/*     */     {
/* 362 */       return false;
/*     */     }
/* 364 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 366 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     if (!MyCanSee(par1EntityLiving)) {
/* 376 */       return false;
/*     */     }
/*     */     
/* 379 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 381 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 382 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 383 */         return false;
/*     */       }
/* 385 */       return true;
/*     */     } 
/* 387 */     if (par1EntityLiving instanceof Molenoid)
/*     */     {
/* 389 */       return false;
/*     */     }
/*     */     
/* 392 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 394 */       return true;
/*     */     }
/* 396 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 397 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 401 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 406 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 407 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 6.0D, 12.0D));
/* 408 */     Collections.sort(var5, this.TargetSorter);
/* 409 */     Iterator<?> var2 = var5.iterator();
/* 410 */     Entity var3 = null;
/* 411 */     EntityLivingBase var4 = null;
/*     */     
/* 413 */     while (var2.hasNext()) {
/*     */       
/* 415 */       var3 = (Entity)var2.next();
/* 416 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 418 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 420 */         return var4;
/*     */       }
/*     */     } 
/* 423 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 428 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 433 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 445 */     for (k = -3; k < 3; k++) {
/*     */       
/* 447 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 449 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 451 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 452 */           if (bid == Blocks.field_150474_ac) {
/* 453 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 454 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 455 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 456 */             if (s != null && 
/* 457 */               s.equals("Molenoid")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 463 */     if (!func_70814_o()) return false; 
/* 464 */     if (this.field_70163_u < 50.0D) return false; 
/* 465 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 469 */     for (k = -1; k < 1; k++) {
/*     */       
/* 471 */       for (int j = -1; j < 1; j++) {
/*     */         
/* 473 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 475 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 476 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 482 */     Molenoid target = null;
/* 483 */     target = (Molenoid)this.field_70170_p.func_72857_a(Molenoid.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D), (Entity)this);
/* 484 */     if (target != null)
/*     */     {
/* 486 */       return false;
/*     */     }
/* 488 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean MyCanSee(EntityLivingBase e) {
/* 499 */     double xzoff = 2.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 506 */     int nblks = 10;
/*     */     
/* 508 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 509 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 510 */     float startx = (float)cx;
/* 511 */     float starty = (float)(this.field_70163_u + 1.0D);
/* 512 */     float startz = (float)cz;
/* 513 */     float dx = (float)((e.field_70165_t - startx) / 10.0D);
/* 514 */     float dy = (float)((e.field_70163_u + (e.field_70131_O / 2.0F) - starty) / 10.0D);
/* 515 */     float dz = (float)((e.field_70161_v - startz) / 10.0D);
/*     */     
/* 517 */     if (Math.abs(dx) > 1.0D) {
/* 518 */       dy /= Math.abs(dx);
/* 519 */       dz /= Math.abs(dx);
/* 520 */       nblks = (int)(nblks * Math.abs(dx));
/* 521 */       if (dx > 1.0F) dx = 1.0F; 
/* 522 */       if (dx < -1.0F) dx = -1.0F; 
/*     */     } 
/* 524 */     if (Math.abs(dy) > 1.0D) {
/* 525 */       dx /= Math.abs(dy);
/* 526 */       dz /= Math.abs(dy);
/* 527 */       nblks = (int)(nblks * Math.abs(dy));
/* 528 */       if (dy > 1.0F) dy = 1.0F; 
/* 529 */       if (dy < -1.0F) dy = -1.0F; 
/*     */     } 
/* 531 */     if (Math.abs(dz) > 1.0D) {
/* 532 */       dy /= Math.abs(dz);
/* 533 */       dx /= Math.abs(dz);
/* 534 */       nblks = (int)(nblks * Math.abs(dz));
/* 535 */       if (dz > 1.0F) dz = 1.0F; 
/* 536 */       if (dz < -1.0F) dz = -1.0F;
/*     */     
/*     */     } 
/* 539 */     for (int i = 0; i < nblks; ) {
/* 540 */       startx += dx;
/* 541 */       starty += dy;
/* 542 */       startz += dz;
/* 543 */       Block bid = this.field_70170_p.func_147439_a((int)startx, (int)starty, (int)startz);
/* 544 */       if (bid == Blocks.field_150350_a || 
/* 545 */         bid == OreSpawnMain.MyMoleDirtBlock || 
/* 546 */         bid == Blocks.field_150346_d || 
/* 547 */         bid == Blocks.field_150349_c || 
/* 548 */         bid == Blocks.field_150329_H || 
/* 549 */         bid == Blocks.field_150354_m || 
/* 550 */         bid == Blocks.field_150351_n) { i++; continue; }
/* 551 */        return false;
/*     */     } 
/*     */ 
/*     */     
/* 555 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Molenoid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */