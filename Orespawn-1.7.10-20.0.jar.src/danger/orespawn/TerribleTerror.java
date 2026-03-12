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
/*     */ public class TerribleTerror
/*     */   extends EntityMob
/*     */ {
/*  52 */   private ChunkCoordinates currentFlightTarget = null;
/*  53 */   private GenericTargetSorter TargetSorter = null;
/*     */   
/*     */   public TerribleTerror(World par1World) {
/*  56 */     super(par1World);
/*  57 */     func_70105_a(1.0F, 0.75F);
/*  58 */     func_70661_as().func_75491_a(false);
/*  59 */     this.field_70728_aV = 10;
/*  60 */     this.field_70178_ae = false;
/*  61 */     this.field_70174_ab = 5;
/*  62 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  67 */     super.func_110147_ax();
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  69 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  70 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.TerribleTerror_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  75 */     if (func_104002_bU()) return false; 
/*  76 */     if (!this.field_70170_p.func_72935_r()) return false; 
/*  77 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  84 */     return 0.45F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  91 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  98 */     return "orespawn:terribleterror_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 105 */     return "orespawn:terribleterror_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 112 */     return "orespawn:terribleterror_dead";
/*     */   }
/*     */   
/*     */   public int mygetMaxHealth() {
/* 116 */     return OreSpawnMain.TerribleTerror_stats.health;
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 121 */     return OreSpawnMain.TerribleTerror_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 128 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 136 */     super.func_70071_h_();
/*     */     
/* 138 */     this.field_70181_x *= 0.6D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 146 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 5.0F);
/* 147 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 155 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 161 */     int xdir = 1;
/* 162 */     int zdir = 1;
/*     */     
/* 164 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 168 */     if (this.field_70128_L)
/* 169 */       return;  super.func_70619_bc();
/*     */     
/* 171 */     if (this.currentFlightTarget == null) {
/* 172 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */ 
/*     */     
/* 176 */     if (this.field_70146_Z.nextInt(100) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 178 */       Block bid = Blocks.field_150348_b;
/* 179 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 180 */         zdir = this.field_70146_Z.nextInt(5) + 5;
/* 181 */         xdir = this.field_70146_Z.nextInt(5) + 5;
/* 182 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 183 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 184 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(5) - 2, (int)this.field_70161_v + zdir);
/* 185 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 186 */         if (bid == Blocks.field_150350_a && 
/* 187 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 188 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 191 */         keep_trying--;
/*     */       }
/*     */     
/* 194 */     } else if (this.field_70146_Z.nextInt(9) == 0) {
/*     */ 
/*     */       
/* 197 */       EntityLivingBase e = null;
/* 198 */       e = findSomethingToAttack();
/* 199 */       if (e != null) {
/*     */ 
/*     */         
/* 202 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/* 203 */         if (func_70068_e((Entity)e) < 6.0D) {
/* 204 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 210 */     double var1 = this.currentFlightTarget.field_71574_a + 0.4D - this.field_70165_t;
/* 211 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 212 */     double var5 = this.currentFlightTarget.field_71573_c + 0.4D - this.field_70161_v;
/* 213 */     this.field_70159_w += (Math.signum(var1) * 0.4D - this.field_70159_w) * 0.30000000149011613D;
/* 214 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 215 */     this.field_70179_y += (Math.signum(var5) * 0.4D - this.field_70179_y) * 0.30000000149011613D;
/* 216 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 217 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 218 */     this.field_70701_bs = 0.75F;
/* 219 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 228 */     return true;
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
/* 246 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 256 */     boolean ret = super.func_70097_a(par1DamageSource, par2);
/* 257 */     Entity e = par1DamageSource.func_76346_g();
/* 258 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 260 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     }
/* 262 */     return ret;
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
/* 274 */     for (int k = -2; k < 2; k++) {
/*     */       
/* 276 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 278 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 280 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 281 */           if (bid == Blocks.field_150474_ac) {
/* 282 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 283 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 284 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 285 */             if (s != null && 
/* 286 */               s.equals("Terrible Terror")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 292 */     if (!func_70814_o()) return false; 
/* 293 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 294 */     if (this.field_70170_p.field_73011_w.field_76574_g != OreSpawnMain.DimensionID6 && 
/* 295 */       this.field_70163_u > 40.0D) return false;
/*     */     
/* 297 */     return true;
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
/* 308 */     if (par1EntityLiving == null)
/*     */     {
/* 310 */       return false;
/*     */     }
/* 312 */     if (par1EntityLiving == this)
/*     */     {
/* 314 */       return false;
/*     */     }
/* 316 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 319 */       return false;
/*     */     }
/* 321 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 324 */       return false;
/*     */     }
/* 326 */     if (par1EntityLiving instanceof RockBase)
/*     */     {
/* 328 */       return false;
/*     */     }
/* 330 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 332 */       return false;
/*     */     }
/* 334 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 336 */       return false;
/*     */     }
/* 338 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 340 */       return false;
/*     */     }
/* 342 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 344 */       return false;
/*     */     }
/* 346 */     if (par1EntityLiving instanceof CloudShark)
/*     */     {
/* 348 */       return false;
/*     */     }
/* 350 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 352 */       return false;
/*     */     }
/* 354 */     if (par1EntityLiving instanceof Bee)
/*     */     {
/* 356 */       return false;
/*     */     }
/* 358 */     if (par1EntityLiving instanceof Mantis)
/*     */     {
/* 360 */       return false;
/*     */     }
/* 362 */     if (par1EntityLiving instanceof LeafMonster)
/*     */     {
/* 364 */       return false;
/*     */     }
/* 366 */     if (par1EntityLiving instanceof CreepingHorror)
/*     */     {
/* 368 */       return false;
/*     */     }
/* 370 */     if (par1EntityLiving instanceof Triffid)
/*     */     {
/* 372 */       return false;
/*     */     }
/* 374 */     if (par1EntityLiving instanceof PitchBlack)
/*     */     {
/* 376 */       return false;
/*     */     }
/* 378 */     if (par1EntityLiving instanceof Dragon)
/*     */     {
/* 380 */       return false;
/*     */     }
/* 382 */     if (par1EntityLiving instanceof Island)
/*     */     {
/* 384 */       return false;
/*     */     }
/* 386 */     if (par1EntityLiving instanceof IslandToo)
/*     */     {
/* 388 */       return false;
/*     */     }
/* 390 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 392 */       return false;
/*     */     }
/* 394 */     if (par1EntityLiving instanceof Firefly)
/*     */     {
/* 396 */       return false;
/*     */     }
/* 398 */     if (par1EntityLiving instanceof Triffid)
/*     */     {
/* 400 */       return false;
/*     */     }
/* 402 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 404 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 405 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 406 */         return false;
/*     */       }
/*     */     } 
/* 409 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 414 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 415 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 8.0D, 12.0D));
/* 416 */     Collections.sort(var5, this.TargetSorter);
/* 417 */     Iterator<?> var2 = var5.iterator();
/* 418 */     Entity var3 = null;
/* 419 */     EntityLivingBase var4 = null;
/*     */     
/* 421 */     while (var2.hasNext()) {
/*     */       
/* 423 */       var3 = (Entity)var2.next();
/* 424 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 426 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 428 */         return var4;
/*     */       }
/*     */     } 
/* 431 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 440 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 441 */     if (i == 0) return Items.field_151078_bh; 
/* 442 */     if (i == 1) return Items.field_151166_bC; 
/* 443 */     return Items.field_151008_G;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\TerribleTerror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */