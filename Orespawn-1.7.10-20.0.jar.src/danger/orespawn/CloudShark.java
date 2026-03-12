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
/*     */ public class CloudShark
/*     */   extends EntityMob
/*     */ {
/*  51 */   private ChunkCoordinates currentFlightTarget = null;
/*  52 */   private GenericTargetSorter TargetSorter = null;
/*     */ 
/*     */   
/*     */   public CloudShark(World par1World) {
/*  56 */     super(par1World);
/*  57 */     func_70105_a(1.0F, 0.75F);
/*  58 */     this.field_70728_aV = 5;
/*  59 */     this.field_70178_ae = false;
/*  60 */     this.field_70174_ab = 5;
/*  61 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  66 */     super.func_110147_ax();
/*  67 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.30000001192092896D);
/*     */     
/*  70 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.CloudShark_stats.attack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/*  76 */     float f = (float)func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e();
/*  77 */     boolean flag = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), f);
/*  78 */     return flag;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  82 */     if (func_104002_bU()) return false; 
/*  83 */     if (this.field_70170_p.func_72935_r()) return false; 
/*  84 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  91 */     return 0.25F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  98 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 105 */     return "splash";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 112 */     return "orespawn:little_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 119 */     return "orespawn:big_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 126 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 133 */     return OreSpawnMain.CloudShark_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 140 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 148 */     super.func_70071_h_();
/*     */     
/* 150 */     this.field_70181_x *= 0.6D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 158 */     return OreSpawnMain.CloudShark_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 165 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 171 */     int xdir = 1;
/* 172 */     int zdir = 1;
/*     */     
/* 174 */     int keep_trying = 50;
/*     */ 
/*     */     
/* 177 */     int updown = 0;
/*     */     
/* 179 */     if (this.field_70128_L)
/* 180 */       return;  super.func_70619_bc();
/*     */     
/* 182 */     if (this.currentFlightTarget == null) {
/* 183 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 185 */     if ((int)this.field_70163_u < 120) updown = 2; 
/* 186 */     if ((int)this.field_70163_u > 140) updown = -2; 
/* 187 */     if (this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 189 */       Block bid = Blocks.field_150348_b;
/* 190 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 191 */         zdir = this.field_70146_Z.nextInt(10) + 8;
/* 192 */         xdir = this.field_70146_Z.nextInt(10) + 8;
/* 193 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 194 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 195 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(5) - 2 + updown, (int)this.field_70161_v + zdir);
/* 196 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 197 */         if (bid == Blocks.field_150350_a && 
/* 198 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 199 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 202 */         keep_trying--;
/*     */       } 
/*     */     } 
/*     */     
/* 206 */     if (this.field_70146_Z.nextInt(9) == 2) {
/*     */ 
/*     */       
/* 209 */       EntityLivingBase e = null;
/* 210 */       e = findSomethingToAttack();
/* 211 */       if (e != null) {
/*     */ 
/*     */         
/* 214 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/* 215 */         if (func_70068_e((Entity)e) < 9.0D) {
/* 216 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 222 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 223 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 224 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 225 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.30000000149011613D;
/* 226 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 227 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.30000000149011613D;
/* 228 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 229 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 230 */     this.field_70701_bs = 1.0F;
/* 231 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 240 */     return true;
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
/* 258 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 268 */     boolean ret = super.func_70097_a(par1DamageSource, par2);
/* 269 */     Entity e = par1DamageSource.func_76346_g();
/* 270 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 272 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     }
/* 274 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 284 */     return true;
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 296 */     if (par1EntityLiving == null)
/*     */     {
/* 298 */       return false;
/*     */     }
/* 300 */     if (par1EntityLiving == this)
/*     */     {
/* 302 */       return false;
/*     */     }
/* 304 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 307 */       return false;
/*     */     }
/* 309 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 312 */       return false;
/*     */     }
/* 314 */     if (par1EntityLiving instanceof RockBase)
/*     */     {
/* 316 */       return false;
/*     */     }
/* 318 */     if (par1EntityLiving instanceof EntityAnt)
/*     */     {
/* 320 */       return false;
/*     */     }
/* 322 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 324 */       return true;
/*     */     }
/* 326 */     if (par1EntityLiving instanceof Cockateil)
/*     */     {
/* 328 */       return true;
/*     */     }
/* 330 */     if (par1EntityLiving instanceof EntityMosquito)
/*     */     {
/* 332 */       return true;
/*     */     }
/* 334 */     if (par1EntityLiving instanceof Firefly)
/*     */     {
/* 336 */       return true;
/*     */     }
/* 338 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 340 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 341 */       if (p.field_71075_bZ.field_75098_d != true) {
/* 342 */         return true;
/*     */       }
/*     */     } 
/* 345 */     if (par1EntityLiving instanceof GoldFish)
/*     */     {
/* 347 */       return true;
/*     */     }
/* 349 */     if (par1EntityLiving instanceof CliffRacer)
/*     */     {
/* 351 */       return true;
/*     */     }
/*     */     
/* 354 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 359 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 360 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 10.0D, 12.0D));
/* 361 */     Collections.sort(var5, this.TargetSorter);
/* 362 */     Iterator<?> var2 = var5.iterator();
/* 363 */     Entity var3 = null;
/* 364 */     EntityLivingBase var4 = null;
/*     */     
/* 366 */     while (var2.hasNext()) {
/*     */       
/* 368 */       var3 = (Entity)var2.next();
/* 369 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 371 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 373 */         return var4;
/*     */       }
/*     */     } 
/* 376 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 385 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 386 */     if (i == 0) return Items.field_151121_aF; 
/* 387 */     if (i == 1) return Items.field_151007_F; 
/* 388 */     if (i == 2) return Items.field_151103_aS; 
/* 389 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 395 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CloudShark.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */