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
/*     */ public class WaterBall
/*     */   extends EntityThrowable
/*     */ {
/*  15 */   private float my_rotation = 0.0F;
/*  16 */   private int my_index = 49;
/*     */ 
/*     */   
/*     */   public WaterBall(World par1World) {
/*  20 */     super(par1World);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public WaterBall(World par1World, EntityLivingBase par2EntityLiving) {
/*  26 */     super(par1World, par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public WaterBall(World worldObj, double d, double e, double f) {
/*  31 */     super(worldObj, d, e, f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWaterBallIndex() {
/*  38 */     return this.my_index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*  46 */     if (par1MovingObjectPosition.field_72308_g != null) {
/*     */       
/*  48 */       float var2 = 2.0F;
/*     */       
/*  50 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */       {
/*  52 */         var2 = 5.0F;
/*     */       }
/*  54 */       if (par1MovingObjectPosition.field_72308_g instanceof WaterDragon) {
/*     */         return;
/*     */       }
/*     */       
/*  58 */       if (par1MovingObjectPosition.field_72308_g instanceof AttackSquid) {
/*     */         return;
/*     */       }
/*     */       
/*  62 */       if (par1MovingObjectPosition.field_72308_g instanceof Dragon) {
/*     */         
/*  64 */         Dragon d = (Dragon)par1MovingObjectPosition.field_72308_g;
/*  65 */         if (d.getDragonType() != 0) {
/*     */           return;
/*     */         }
/*     */       } 
/*  69 */       if (par1MovingObjectPosition.field_72308_g instanceof EntityPlayer) {
/*     */         
/*  71 */         EntityPlayer d = (EntityPlayer)par1MovingObjectPosition.field_72308_g;
/*  72 */         if (d.field_70154_o != null) {
/*     */           return;
/*     */         }
/*     */       } 
/*  76 */       par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)func_85052_h()), var2);
/*  77 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1) par1MovingObjectPosition.field_72308_g.func_145779_a(OreSpawnMain.MyWaterBall, 1); 
/*  78 */       par1MovingObjectPosition.field_72308_g.func_70066_B();
/*     */     } 
/*     */     
/*  81 */     for (int var3 = 0; var3 < 8; var3++) {
/*     */       
/*  83 */       this.field_70170_p.func_72869_a("bubble", this.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70161_v + this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/*  84 */       this.field_70170_p.func_72869_a("splash", this.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70161_v + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/*     */     } 
/*  86 */     func_85030_a("random.splash", 0.5F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/*     */     
/*  88 */     if (!this.field_70170_p.field_72995_K)
/*     */     {
/*  90 */       func_70106_y();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 100 */     super.func_70071_h_();
/* 101 */     this.my_rotation += 30.0F;
/*     */     
/* 103 */     while (this.my_rotation > 360.0F) {
/* 104 */       this.my_rotation -= 360.0F;
/*     */     }
/*     */     
/* 107 */     this.field_70125_A = this.field_70127_C = this.my_rotation;
/*     */     
/* 109 */     this.field_70170_p.func_72869_a("splash", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WaterBall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */