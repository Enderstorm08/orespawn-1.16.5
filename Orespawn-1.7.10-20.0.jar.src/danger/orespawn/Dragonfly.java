/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.EnumDifficulty;
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
/*     */ public class Dragonfly
/*     */   extends EntityAnimal
/*     */ {
/*  52 */   private ChunkCoordinates currentFlightTarget = null;
/*  53 */   private GenericTargetSorter TargetSorter = null;
/*     */ 
/*     */   
/*     */   public Dragonfly(World par1World) {
/*  57 */     super(par1World);
/*  58 */     func_70105_a(1.5F, 0.5F);
/*  59 */     func_70661_as().func_75491_a(false);
/*  60 */     this.field_70728_aV = 5;
/*  61 */     this.field_70178_ae = false;
/*  62 */     this.field_70174_ab = 5;
/*  63 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  68 */     super.func_110147_ax();
/*  69 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  70 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.33000001311302185D);
/*  71 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  72 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(2.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  78 */     super.func_70088_a();
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  82 */     if (func_104002_bU()) return false; 
/*  83 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  90 */     return 0.25F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  97 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 104 */     return "orespawn:dragonfly_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 111 */     return "orespawn:dragonfly_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 118 */     return "orespawn:dragonfly_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 125 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 132 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 139 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 147 */     super.func_70071_h_();
/*     */     
/* 149 */     this.field_70181_x *= 0.6D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 157 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 2.0F);
/* 158 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 166 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.25D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 172 */     int xdir = 1;
/* 173 */     int zdir = 1;
/*     */     
/* 175 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 179 */     if (this.field_70128_L)
/* 180 */       return;  super.func_70619_bc();
/*     */     
/* 182 */     if (this.currentFlightTarget == null) {
/* 183 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */ 
/*     */     
/* 187 */     if (this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 189 */       Block bid = Blocks.field_150348_b;
/* 190 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 191 */         zdir = this.field_70146_Z.nextInt(5) + 5;
/* 192 */         xdir = this.field_70146_Z.nextInt(5) + 5;
/* 193 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 194 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 195 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(5) - 2, (int)this.field_70161_v + zdir);
/* 196 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 197 */         if (bid == Blocks.field_150350_a && 
/* 198 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 199 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 202 */         keep_trying--;
/*     */       }
/*     */     
/* 205 */     } else if (this.field_70146_Z.nextInt(12) == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*     */ 
/*     */       
/* 208 */       EntityLivingBase e = null;
/* 209 */       e = findSomethingToAttack();
/* 210 */       if (e != null) {
/*     */ 
/*     */         
/* 213 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/* 214 */         if (func_70068_e((Entity)e) < 6.0D) {
/* 215 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 221 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 222 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 223 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 224 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.30000000149011613D;
/* 225 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 226 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.30000000149011613D;
/* 227 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 228 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 229 */     this.field_70701_bs = 1.0F;
/* 230 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 239 */     return true;
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
/* 257 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 267 */     boolean ret = super.func_70097_a(par1DamageSource, par2);
/* 268 */     Entity e = par1DamageSource.func_76346_g();
/* 269 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 271 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u, (int)e.field_70161_v);
/*     */     }
/* 273 */     return ret;
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
/* 284 */     if (this.field_70163_u < 50.0D) return false; 
/* 285 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 286 */     return true;
/*     */   }
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 300 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 302 */     if (par1EntityLiving == null)
/*     */     {
/* 304 */       return false;
/*     */     }
/* 306 */     if (par1EntityLiving == this)
/*     */     {
/* 308 */       return false;
/*     */     }
/* 310 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 313 */       return false;
/*     */     }
/* 315 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 318 */       return false;
/*     */     }
/* 320 */     if (par1EntityLiving instanceof EntityAnt)
/*     */     {
/* 322 */       return true;
/*     */     }
/* 324 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 326 */       return true;
/*     */     }
/* 328 */     if (par1EntityLiving instanceof Cockateil)
/*     */     {
/* 330 */       return true;
/*     */     }
/* 332 */     if (par1EntityLiving instanceof EntityMosquito)
/*     */     {
/* 334 */       return true;
/*     */     }
/* 336 */     if (par1EntityLiving instanceof Firefly)
/*     */     {
/* 338 */       return true;
/*     */     }
/* 340 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityHorse && OreSpawnMain.DragonflyHorseFriendly == 0)
/*     */     {
/* 342 */       return true;
/*     */     }
/* 344 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 349 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 350 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 6.0D, 10.0D));
/* 351 */     Collections.sort(var5, this.TargetSorter);
/* 352 */     Iterator<?> var2 = var5.iterator();
/* 353 */     Entity var3 = null;
/* 354 */     EntityLivingBase var4 = null;
/*     */     
/* 356 */     while (var2.hasNext()) {
/*     */       
/* 358 */       var3 = (Entity)var2.next();
/* 359 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 361 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 363 */         return var4;
/*     */       }
/*     */     } 
/* 366 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 375 */     int i = this.field_70170_p.field_73012_v.nextInt(6);
/* 376 */     if (i == 0) return Items.field_151074_bl; 
/* 377 */     if (i == 1) return OreSpawnMain.UraniumNugget; 
/* 378 */     if (i == 2) return OreSpawnMain.TitaniumNugget; 
/* 379 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/* 385 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Dragonfly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */