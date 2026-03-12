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
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
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
/*     */ public class Bee
/*     */   extends EntityMob
/*     */ {
/*  58 */   private ChunkCoordinates currentFlightTarget = null;
/*  59 */   private GenericTargetSorter TargetSorter = null;
/*  60 */   private int stuck_count = 0;
/*  61 */   private int lastX = 0;
/*  62 */   private int lastZ = 0;
/*  63 */   private Entity rt = null;
/*     */   
/*     */   public Bee(World par1World) {
/*  66 */     super(par1World);
/*  67 */     func_70105_a(1.5F, 2.5F);
/*  68 */     func_70661_as().func_75491_a(false);
/*  69 */     this.field_70728_aV = 25;
/*  70 */     this.field_70178_ae = false;
/*  71 */     this.field_70174_ab = 5;
/*  72 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  78 */     super.func_110147_ax();
/*  79 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  80 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3199999928474426D);
/*     */     
/*  82 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Bee_stats.attack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  88 */     super.func_70088_a();
/*  89 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  93 */     if (func_104002_bU()) return false; 
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/*  99 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 104 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 111 */     return 0.25F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 118 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 125 */     return "orespawn:Beebuzz";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 132 */     return "orespawn:dragonfly_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 139 */     return "orespawn:alo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 146 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 153 */     return OreSpawnMain.Bee_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 161 */     return Item.func_150898_a((Block)Blocks.field_150327_N);
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 166 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
/*     */     
/* 168 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 175 */     int var4 = 2 + this.field_70170_p.field_73012_v.nextInt(10); int i;
/* 176 */     for (i = 0; i < var4; i++) {
/* 177 */       dropItemRand(Items.field_151074_bl, 1);
/*     */     }
/* 179 */     var4 = 2 + this.field_70170_p.field_73012_v.nextInt(10);
/* 180 */     for (i = 0; i < var4; i++) {
/* 181 */       dropItemRand(OreSpawnMain.MyButterCandy, 1);
/*     */     }
/* 183 */     var4 = 2 + this.field_70170_p.field_73012_v.nextInt(10);
/* 184 */     for (i = 0; i < var4; i++) {
/* 185 */       dropItemRand(Item.func_150898_a((Block)Blocks.field_150327_N), 1);
/*     */     }
/* 187 */     var4 = 2 + this.field_70170_p.field_73012_v.nextInt(10);
/* 188 */     for (i = 0; i < var4; i++) {
/* 189 */       dropItemRand(Items.field_151102_aT, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 198 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 206 */     super.func_70071_h_();
/*     */     
/* 208 */     this.field_70181_x *= 0.6D;
/* 209 */     if (func_70090_H() && this.field_70170_p.field_73012_v.nextInt(4) == 1) {
/* 210 */       func_70652_k((Entity)this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 219 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), OreSpawnMain.Bee_stats.attack);
/* 220 */     if (this.field_70170_p.field_73012_v.nextInt(3) == 1 && par1Entity != null) {
/* 221 */       ((EntityLivingBase)par1Entity).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, 50, 0));
/*     */     }
/* 223 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 231 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 237 */     int xdir = 1;
/* 238 */     int zdir = 1;
/*     */     
/* 240 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 244 */     if (this.field_70128_L)
/* 245 */       return;  super.func_70619_bc();
/*     */     
/* 247 */     if (this.lastX == (int)this.field_70165_t && this.lastZ == (int)this.field_70161_v) {
/*     */       
/* 249 */       this.stuck_count++;
/*     */     } else {
/* 251 */       this.stuck_count = 0;
/* 252 */       this.lastX = (int)this.field_70165_t;
/* 253 */       this.lastZ = (int)this.field_70161_v;
/*     */     } 
/*     */ 
/*     */     
/* 257 */     if (this.currentFlightTarget == null) {
/* 258 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */ 
/*     */     
/* 262 */     if (this.stuck_count > 50 || this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 264 */       Block bid = Blocks.field_150348_b;
/* 265 */       this.stuck_count = 0;
/* 266 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 267 */         zdir = this.field_70146_Z.nextInt(9) + 4;
/* 268 */         xdir = this.field_70146_Z.nextInt(9) + 4;
/* 269 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 270 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 271 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 3, (int)this.field_70161_v + zdir);
/* 272 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 273 */         if (bid == Blocks.field_150350_a && 
/* 274 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 275 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 278 */         keep_trying--;
/*     */       }
/*     */     
/* 281 */     } else if (this.field_70146_Z.nextInt(15) == 0) {
/*     */ 
/*     */       
/* 284 */       EntityLivingBase e = null;
/* 285 */       e = (EntityLivingBase)this.rt;
/* 286 */       if (e != null && 
/* 287 */         e.field_70128_L) e = null;
/*     */       
/* 289 */       if (e == null) {
/* 290 */         e = findSomethingToAttack();
/*     */       }
/* 292 */       if (e != null) {
/*     */ 
/*     */         
/* 295 */         setAttacking(1);
/* 296 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 1, (int)e.field_70161_v);
/* 297 */         if (func_70068_e((Entity)e) < 16.0D) {
/* 298 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } else {
/* 301 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 305 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 306 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 307 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 308 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.30000000149011613D;
/* 309 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 310 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.30000000149011613D;
/* 311 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 312 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 313 */     this.field_70701_bs = 1.0F;
/* 314 */     this.field_70177_z += var8 / 4.0F;
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
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 329 */     return true;
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
/* 347 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 357 */     boolean ret = super.func_70097_a(par1DamageSource, par2);
/* 358 */     Entity e = par1DamageSource.func_76346_g();
/* 359 */     if (e != null && e instanceof EntityLivingBase && this.currentFlightTarget != null) {
/*     */       
/* 361 */       this.rt = e;
/* 362 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     } 
/* 364 */     return ret;
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
/* 376 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) return true;  int k;
/* 377 */     for (k = -2; k < 2; k++) {
/*     */       
/* 379 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 381 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 383 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 384 */           if (bid == Blocks.field_150474_ac) {
/* 385 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 386 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 387 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 388 */             if (s != null && 
/* 389 */               s.equals("Bee")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 395 */     for (k = -1; k < 2; k++) {
/*     */       
/* 397 */       for (int j = -1; j < 2; j++) {
/*     */         
/* 399 */         for (int i = 1; i < 5; i++) {
/*     */           
/* 401 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 402 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 406 */     if (this.field_70163_u < 50.0D) return false; 
/* 407 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 408 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 416 */     return OreSpawnMain.Bee_stats.defense;
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
/* 432 */     if (par1EntityLiving == null)
/*     */     {
/* 434 */       return false;
/*     */     }
/* 436 */     if (par1EntityLiving == this)
/*     */     {
/* 438 */       return false;
/*     */     }
/* 440 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 443 */       return false;
/*     */     }
/* 445 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 448 */       return false;
/*     */     }
/* 450 */     if (par1EntityLiving.func_70090_H())
/*     */     {
/* 452 */       return false;
/*     */     }
/* 454 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 456 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 457 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 458 */         return false;
/*     */       }
/* 460 */       return true;
/*     */     } 
/* 462 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
/*     */     {
/* 464 */       return true;
/*     */     }
/* 466 */     if (par1EntityLiving instanceof Girlfriend)
/*     */     {
/* 468 */       return true;
/*     */     }
/* 470 */     if (par1EntityLiving instanceof Boyfriend)
/*     */     {
/* 472 */       return true;
/*     */     }
/*     */     
/* 475 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 480 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 481 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 6.0D, 10.0D));
/* 482 */     Collections.sort(var5, this.TargetSorter);
/* 483 */     Iterator<?> var2 = var5.iterator();
/* 484 */     Entity var3 = null;
/* 485 */     EntityLivingBase var4 = null;
/*     */     
/* 487 */     while (var2.hasNext()) {
/*     */       
/* 489 */       var3 = (Entity)var2.next();
/* 490 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 492 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 494 */         return var4;
/*     */       }
/*     */     } 
/* 497 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Bee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */