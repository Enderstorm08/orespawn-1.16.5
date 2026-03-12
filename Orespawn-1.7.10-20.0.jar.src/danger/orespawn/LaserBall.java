/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntityThrowable;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class LaserBall
/*     */   extends EntityThrowable
/*     */ {
/*  15 */   private float my_rotation = 0.0F;
/*  16 */   private int my_index = 81;
/*  17 */   private int is_special = 0;
/*  18 */   private int is_iceball = 0;
/*  19 */   private int is_acid = 0;
/*  20 */   private int is_irukandji = 0;
/*  21 */   private int ticksalive = 0;
/*     */ 
/*     */   
/*     */   public LaserBall(World par1World) {
/*  25 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public LaserBall(World par1World, int par2) {
/*  30 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public LaserBall(World par1World, EntityLivingBase par2EntityLiving) {
/*  35 */     super(par1World, par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public LaserBall(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/*  40 */     super(par1World, par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public LaserBall(World par1World, double par2, double par4, double par6) {
/*  45 */     super(par1World, par2, par4, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLaserBallIndex() {
/*  51 */     return this.my_index;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSpecial() {
/*  56 */     this.is_special = 1;
/*     */   }
/*     */   
/*     */   public void setIceBall() {
/*  60 */     this.is_iceball = 1;
/*     */   }
/*     */   
/*     */   public void setAcid() {
/*  64 */     this.is_acid = 1;
/*     */   }
/*     */   
/*     */   public void setIrukandji() {
/*  68 */     this.is_irukandji = 1;
/*  69 */     this.is_acid = 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*  77 */     if (par1MovingObjectPosition.field_72308_g != null) {
/*     */       
/*  79 */       float var2 = 16.0F;
/*     */       
/*  81 */       if (this.is_irukandji != 0) {
/*  82 */         par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)func_85052_h()), 100.0F);
/*  83 */         func_70106_y();
/*     */         
/*     */         return;
/*     */       } 
/*  87 */       if (this.is_acid != 0) {
/*  88 */         if (par1MovingObjectPosition.field_72308_g instanceof TrooperBug) {
/*     */           
/*  90 */           func_70106_y();
/*     */           return;
/*     */         } 
/*  93 */         if (par1MovingObjectPosition.field_72308_g instanceof SpitBug) {
/*     */           
/*  95 */           func_70106_y();
/*     */           return;
/*     */         } 
/*     */       } 
/*  99 */       if (this.is_iceball == 0 && this.is_acid == 0) {
/* 100 */         if (par1MovingObjectPosition.field_72308_g instanceof Robot2) {
/*     */           
/* 102 */           func_70106_y();
/*     */           return;
/*     */         } 
/* 105 */         if (par1MovingObjectPosition.field_72308_g instanceof Robot3) {
/*     */           
/* 107 */           func_70106_y();
/*     */           return;
/*     */         } 
/* 110 */         if (par1MovingObjectPosition.field_72308_g instanceof Robot4) {
/*     */           
/* 112 */           func_70106_y();
/*     */           return;
/*     */         } 
/* 115 */         if (par1MovingObjectPosition.field_72308_g instanceof Robot5) {
/*     */           
/* 117 */           func_70106_y();
/*     */           return;
/*     */         } 
/* 120 */         if (par1MovingObjectPosition.field_72308_g instanceof GiantRobot) {
/*     */           
/* 122 */           func_70106_y();
/*     */           return;
/*     */         } 
/*     */       } 
/* 126 */       if (par1MovingObjectPosition.field_72308_g instanceof Dragon && this.is_acid == 0) {
/*     */         
/* 128 */         Dragon d = (Dragon)par1MovingObjectPosition.field_72308_g;
/* 129 */         if (d.field_70153_n != null) {
/* 130 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/* 134 */         if (d.getDragonType() != 0 && this.is_iceball != 0) {
/* 135 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/* 140 */       if (par1MovingObjectPosition.field_72308_g instanceof EntityPlayer && this.is_acid == 0) {
/*     */         
/* 142 */         EntityPlayer d = (EntityPlayer)par1MovingObjectPosition.field_72308_g;
/* 143 */         if (d.field_70154_o != null) {
/* 144 */           func_70106_y();
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/* 149 */       par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)func_85052_h()), var2);
/* 150 */       if (this.is_iceball == 0) par1MovingObjectPosition.field_72308_g.func_70015_d(1);
/*     */     
/*     */     }
/* 153 */     else if (this.is_irukandji != 0 && 
/* 154 */       !this.field_70170_p.field_72995_K) {
/* 155 */       func_145779_a(OreSpawnMain.MyIrukandji, 1);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 160 */     if (this.is_acid == 0) {
/* 161 */       int mx = 10;
/* 162 */       if (this.is_special != 0) mx = 20; 
/* 163 */       for (int var3 = 0; var3 < mx; var3++) {
/*     */         
/* 165 */         this.field_70170_p.func_72869_a("smoke", this.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70161_v + this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 166 */         this.field_70170_p.func_72869_a("largesmoke", this.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70161_v + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 167 */         this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70170_p.field_73012_v.nextGaussian(), this.field_70170_p.field_73012_v.nextGaussian(), this.field_70170_p.field_73012_v.nextGaussian());
/*     */       } 
/*     */       
/* 170 */       func_85030_a("random.explode", 0.5F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/* 171 */       if (!this.field_70170_p.field_72995_K && (this.is_special != 0 || this.is_iceball != 0)) {
/* 172 */         this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, 3.0F, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*     */       }
/*     */     } 
/* 175 */     func_70106_y();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 183 */     this.ticksalive++;
/* 184 */     if (this.ticksalive > 200) {
/* 185 */       func_70106_y();
/*     */       return;
/*     */     } 
/* 188 */     super.func_70071_h_();
/* 189 */     this.my_rotation += 50.0F;
/*     */     
/* 191 */     while (this.my_rotation > 360.0F) {
/* 192 */       this.my_rotation -= 360.0F;
/*     */     }
/*     */     
/* 195 */     this.field_70125_A = this.field_70127_C = this.my_rotation;
/* 196 */     if (this.is_acid != 0) {
/*     */       return;
/*     */     }
/* 199 */     int mx = 4;
/* 200 */     if (this.is_special != 0) mx = 10; 
/* 201 */     if (this.is_iceball != 0 && this.is_special == 0) mx = 2; 
/* 202 */     for (int i = 0; i < mx; i++) {
/* 203 */       this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70170_p.field_73012_v.nextGaussian() / 2.0D, this.field_70170_p.field_73012_v.nextGaussian() / 2.0D, this.field_70170_p.field_73012_v.nextGaussian() / 2.0D);
/*     */       
/* 205 */       if (this.is_iceball == 0) this.field_70170_p.func_72869_a("reddust", this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70170_p.field_73012_v.nextGaussian() / 10.0D, this.field_70170_p.field_73012_v.nextGaussian() / 10.0D, this.field_70170_p.field_73012_v.nextGaussian() / 10.0D); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\LaserBall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */