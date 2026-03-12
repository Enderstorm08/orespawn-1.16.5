/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
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
/*     */ public class PurplePower
/*     */   extends EntityLiving
/*     */ {
/*  54 */   private ChunkCoordinates currentFlightTarget = null;
/*  55 */   private GenericTargetSorter TargetSorter = null;
/*  56 */   private int purple_type = 0;
/*     */   
/*     */   public PurplePower(World par1World) {
/*  59 */     super(par1World);
/*  60 */     func_70105_a(0.75F, 0.75F);
/*  61 */     this.field_70728_aV = 35;
/*  62 */     this.field_70178_ae = true;
/*  63 */     this.field_70174_ab = 25;
/*  64 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  65 */     this.field_70145_X = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  70 */     super.func_110147_ax();
/*  71 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  72 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.25D);
/*  73 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(500.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  79 */     super.func_70088_a();
/*  80 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPurpleType(int par1) {
/*  85 */     if (this.field_70170_p == null)
/*  86 */       return;  if (this.field_70170_p.field_72995_K)
/*  87 */       return;  this.purple_type = par1;
/*  88 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*     */   }
/*     */   
/*     */   public int getPurpleType() {
/*  92 */     return this.field_70180_af.func_75679_c(20);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  96 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 103 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 110 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 117 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 124 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 131 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 138 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 145 */     return 1000;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 152 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 160 */     EntityLivingBase e = null;
/* 161 */     super.func_70071_h_();
/*     */     
/* 163 */     this.field_70181_x *= 0.6D;
/*     */     
/* 165 */     if (getPurpleType() == 0) {
/* 166 */       if (this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(4) == 1) {
/* 167 */         this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u + 1.25D, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 2.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 2.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 2.0F));
/*     */ 
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 173 */     else if (this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/* 174 */       this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u + 0.6499999761581421D, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 5.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 5.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 5.0F));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     if (this.field_70170_p.field_72995_K) {
/* 182 */       this.purple_type = getPurpleType();
/*     */     } else {
/* 184 */       setPurpleType(this.purple_type);
/*     */     } 
/*     */     
/* 187 */     if (!this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(2500) == 1) {
/* 188 */       if (getPurpleType() == 10) {
/* 189 */         this.field_70170_p.func_72885_a((Entity)null, this.field_70165_t, this.field_70163_u + 0.25D, this.field_70161_v, 9.1F, true, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */       }
/*     */       
/* 192 */       func_70106_y();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 202 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.55D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 208 */     int xdir = 1;
/* 209 */     int zdir = 1;
/*     */     
/* 211 */     int keep_trying = 50;
/*     */ 
/*     */     
/* 214 */     EntityLivingBase e = null;
/*     */     
/* 216 */     if (this.field_70128_L)
/* 217 */       return;  super.func_70619_bc();
/*     */     
/* 219 */     if (this.currentFlightTarget == null) {
/* 220 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */     
/* 223 */     if (this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 225 */       Block bid = Blocks.field_150348_b;
/* 226 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 227 */         zdir = this.field_70146_Z.nextInt(10) + 8;
/* 228 */         xdir = this.field_70146_Z.nextInt(10) + 8;
/* 229 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 230 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 231 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(20) - 10, (int)this.field_70161_v + zdir);
/* 232 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 233 */         if (bid == Blocks.field_150350_a && 
/* 234 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 235 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 238 */         keep_trying--;
/*     */       }
/*     */     
/* 241 */     } else if (this.field_70146_Z.nextInt(7) == 2 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*     */ 
/*     */ 
/*     */       
/* 245 */       e = findSomethingToAttack();
/* 246 */       if (e != null) {
/*     */ 
/*     */         
/* 249 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + (e.field_70131_O / 2.0F)), (int)e.field_70161_v);
/*     */         
/* 251 */         if (func_70068_e((Entity)e) < ((4.0F + e.field_70130_N / 2.0F) * (4.0F + e.field_70130_N / 2.0F))) {
/* 252 */           func_70652_k((Entity)e);
/* 253 */           func_70106_y();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 259 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) {
/* 260 */       func_70106_y();
/*     */     }
/*     */ 
/*     */     
/* 264 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 265 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 266 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 267 */     this.field_70159_w += (Math.signum(var1) * 0.4D - this.field_70159_w) * 0.2D;
/* 268 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.20000000149011612D;
/* 269 */     this.field_70179_y += (Math.signum(var5) * 0.4D - this.field_70179_y) * 0.2D;
/* 270 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 271 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 272 */     this.field_70701_bs = 0.75F;
/* 273 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 282 */     return false;
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
/* 300 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 308 */     boolean ret = false;
/* 309 */     Entity e = par1DamageSource.func_76346_g();
/* 310 */     float dm = par2;
/* 311 */     if (e != null && e instanceof net.minecraft.entity.projectile.EntityArrow)
/*     */     {
/* 313 */       return false;
/*     */     }
/* 315 */     if (dm > 10.0F) dm = 10.0F; 
/* 316 */     ret = super.func_70097_a(par1DamageSource, dm);
/* 317 */     if (e != null && this.currentFlightTarget != null)
/*     */     {
/* 319 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + (e.field_70131_O / 2.0F)), (int)e.field_70161_v);
/*     */     }
/* 321 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 331 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 339 */     return 25;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 347 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 349 */     if (par1EntityLiving == null)
/*     */     {
/* 351 */       return false;
/*     */     }
/* 353 */     if (par1EntityLiving == this)
/*     */     {
/* 355 */       return false;
/*     */     }
/* 357 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 360 */       return false;
/*     */     }
/*     */     
/* 363 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 365 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 368 */       return false;
/*     */     }
/*     */     
/* 371 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 373 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 374 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 375 */         return false;
/*     */       }
/* 377 */       if (getPurpleType() > 0 && getPurpleType() != 10) return false; 
/* 378 */       return true;
/*     */     } 
/*     */     
/* 381 */     if (getPurpleType() != 0 && getPurpleType() != 10 && 
/* 382 */       par1EntityLiving instanceof EntityTameable) {
/*     */       
/* 384 */       EntityTameable e = (EntityTameable)par1EntityLiving;
/* 385 */       if (e.func_70909_n()) {
/* 386 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 391 */     if (MyUtils.isRoyalty((Entity)par1EntityLiving))
/*     */     {
/* 393 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 397 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 402 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 403 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(32.0D, 24.0D, 32.0D));
/* 404 */     Collections.sort(var5, this.TargetSorter);
/* 405 */     Iterator<?> var2 = var5.iterator();
/* 406 */     Entity var3 = null;
/* 407 */     EntityLivingBase var4 = null;
/*     */     
/* 409 */     while (var2.hasNext()) {
/*     */       
/* 411 */       var3 = (Entity)var2.next();
/* 412 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 414 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 416 */         return var4;
/*     */       }
/*     */     } 
/* 419 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 424 */     boolean var4 = false;
/*     */     
/* 426 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */       
/* 428 */       EntityLivingBase e = (EntityLivingBase)par1Entity;
/* 429 */       if (getPurpleType() == 0 || getPurpleType() == 10) {
/* 430 */         e.func_70606_j(e.func_110143_aJ() / 4.0F - 1.0F);
/* 431 */         var4 = e.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), e.func_110138_aP() / 8.0F);
/* 432 */         if (getPurpleType() == 10) {
/* 433 */           this.field_70170_p.func_72885_a((Entity)null, e.field_70165_t, e.field_70163_u - 0.25D, e.field_70161_v, 9.1F, true, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */         }
/*     */       } else {
/*     */         
/* 437 */         e.func_70606_j(e.func_110143_aJ() * 15.0F / 16.0F);
/* 438 */         var4 = e.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 5.0F);
/* 439 */         if (getPurpleType() == 1) e.func_70015_d(10); 
/* 440 */         if (getPurpleType() == 2) e.func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, 50, 0)); 
/* 441 */         if (getPurpleType() == 3) e.func_70690_d(new PotionEffect(Potion.field_76437_t.field_76415_H, 50, 0)); 
/*     */       } 
/*     */     } 
/* 444 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 452 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 460 */     super.func_70014_b(par1NBTTagCompound);
/* 461 */     par1NBTTagCompound.func_74768_a("PurpleType", this.purple_type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 469 */     super.func_70037_a(par1NBTTagCompound);
/* 470 */     this.purple_type = par1NBTTagCompound.func_74762_e("PurpleType");
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\PurplePower.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */