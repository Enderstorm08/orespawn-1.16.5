/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntityThrowable;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class BerthaHit
/*     */   extends EntityThrowable
/*     */ {
/*  17 */   private int hit_type = 0;
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World) {
/*  21 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, int par2) {
/*  26 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, EntityLivingBase par2EntityLiving) {
/*  31 */     super(par1World, par2EntityLiving);
/*     */     
/*  33 */     func_70105_a(0.33F, 0.33F);
/*  34 */     func_70012_b(par2EntityLiving.field_70165_t, par2EntityLiving.field_70163_u + par2EntityLiving.func_70047_e(), par2EntityLiving.field_70161_v, par2EntityLiving.field_70177_z, par2EntityLiving.field_70125_A);
/*  35 */     this.field_70165_t -= (MathHelper.func_76134_b(this.field_70177_z / 180.0F * 3.1415927F) * 0.16F);
/*  36 */     this.field_70163_u -= 0.1D;
/*  37 */     this.field_70161_v -= (MathHelper.func_76126_a(this.field_70177_z / 180.0F * 3.1415927F) * 0.16F);
/*  38 */     func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  39 */     this.field_70129_M = 0.0F;
/*  40 */     float f = 0.4F;
/*  41 */     this.field_70159_w = (-MathHelper.func_76126_a(this.field_70177_z / 180.0F * 3.1415927F) * MathHelper.func_76134_b(this.field_70125_A / 180.0F * 3.1415927F) * f);
/*  42 */     this.field_70179_y = (MathHelper.func_76134_b(this.field_70177_z / 180.0F * 3.1415927F) * MathHelper.func_76134_b(this.field_70125_A / 180.0F * 3.1415927F) * f);
/*  43 */     this.field_70181_x = (-MathHelper.func_76126_a((this.field_70125_A + func_70183_g()) / 180.0F * 3.1415927F) * f);
/*  44 */     func_70186_c(this.field_70159_w, this.field_70181_x, this.field_70179_y, func_70182_d(), 0.1F);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/*  49 */     super(par1World, par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, double par2, double par4, double par6) {
/*  54 */     super(par1World, par2, par4, par6);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setHitType(int i) {
/*  59 */     this.hit_type = i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*  68 */     if (this.field_70128_L) {
/*     */       return;
/*     */     }
/*  71 */     if (par1MovingObjectPosition.field_72308_g != null && func_85052_h() != null) {
/*     */       
/*  73 */       Entity e = par1MovingObjectPosition.field_72308_g;
/*  74 */       if ((OreSpawnMain.big_bertha_pvp == 0 && e instanceof EntityPlayer) || e instanceof Girlfriend || e instanceof Boyfriend) {
/*  75 */         func_70106_y();
/*     */         return;
/*     */       } 
/*  78 */       if (OreSpawnMain.big_bertha_pvp == 0 && e instanceof EntityTameable) {
/*  79 */         EntityTameable t = (EntityTameable)e;
/*  80 */         if (t.func_70909_n()) {
/*  81 */           func_70106_y();
/*     */           return;
/*     */         } 
/*     */       } 
/*  85 */       if (this.hit_type == 0 && func_70068_e((Entity)func_85052_h()) < 81.0D && e != func_85052_h()) {
/*  86 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), OreSpawnMain.bertha_stats.damage);
/*  87 */         e.func_70015_d(10);
/*  88 */         double ks = 2.25D;
/*  89 */         double inair = 0.35D;
/*  90 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/*  91 */         if (e.field_70128_L) inair *= 2.0D; 
/*  92 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 102 */       if (this.hit_type == 2 && func_70068_e((Entity)func_85052_h()) < 101.0D && e != func_85052_h()) {
/* 103 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), OreSpawnMain.royal_stats.damage);
/*     */         
/* 105 */         double ks = 1.5D;
/* 106 */         double inair = 0.25D;
/* 107 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 108 */         if (e.field_70128_L) inair *= 2.0D; 
/* 109 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 111 */       if (this.hit_type == 3 && func_70068_e((Entity)func_85052_h()) < 64.0D && e != func_85052_h()) {
/* 112 */         e.func_70097_a(DamageSource.func_76365_a((EntityPlayer)func_85052_h()), OreSpawnMain.hammy_stats.damage);
/* 113 */         double ks = 1.25D;
/* 114 */         double inair = 0.65D;
/* 115 */         float f3 = (float)Math.atan2(e.field_70161_v - (func_85052_h()).field_70161_v, e.field_70165_t - (func_85052_h()).field_70165_t);
/* 116 */         if (e.field_70128_L) inair *= 2.0D; 
/* 117 */         e.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 118 */         if (!this.field_70170_p.field_72995_K && 
/* 119 */           this.hit_type == 3 && func_70068_e((Entity)func_85052_h()) < 64.0D) {
/* 120 */           this.field_70170_p.func_72885_a((Entity)null, this.field_70165_t, this.field_70163_u, this.field_70161_v, 1.5F, true, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */         
/*     */         }
/*     */       }
/*     */     
/*     */     }
/* 126 */     else if (!this.field_70170_p.field_72995_K && 
/* 127 */       this.hit_type == 3 && func_70068_e((Entity)func_85052_h()) < 64.0D) {
/* 128 */       this.field_70170_p.func_72885_a((Entity)null, this.field_70165_t, this.field_70163_u, this.field_70161_v, 2.1F, true, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 133 */     func_70106_y();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 141 */     super.func_70071_h_();
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BerthaHit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */