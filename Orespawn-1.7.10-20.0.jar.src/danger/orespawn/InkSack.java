/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.projectile.EntityThrowable;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class InkSack
/*     */   extends EntityThrowable
/*     */ {
/*  17 */   private float my_rotation = 0.0F;
/*  18 */   private int my_index = 65;
/*     */ 
/*     */   
/*     */   public InkSack(World par1World) {
/*  22 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public InkSack(World par1World, int par2) {
/*  27 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public InkSack(World par1World, EntityLiving par2EntityLiving) {
/*  32 */     super(par1World, (EntityLivingBase)par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public InkSack(World par1World, EntityLiving par2EntityLiving, int par3) {
/*  37 */     super(par1World, (EntityLivingBase)par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public InkSack(World par1World, double par2, double par4, double par6) {
/*  42 */     super(par1World, par2, par4, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInkSackIndex() {
/*  48 */     return this.my_index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*  56 */     if (par1MovingObjectPosition.field_72308_g != null) {
/*     */       
/*  58 */       float var2 = 1.0F;
/*     */       
/*  60 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */       {
/*  62 */         var2 = 4.0F;
/*     */       }
/*  64 */       if (par1MovingObjectPosition.field_72308_g instanceof WaterDragon) {
/*     */         return;
/*     */       }
/*     */       
/*  68 */       if (par1MovingObjectPosition.field_72308_g instanceof AttackSquid) {
/*     */         return;
/*     */       }
/*     */       
/*  72 */       par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)func_85052_h()), var2);
/*  73 */       if (par1MovingObjectPosition.field_72308_g instanceof EntityLivingBase && 
/*  74 */         this.field_70170_p.field_73012_v.nextInt(2) == 0)
/*     */       {
/*  76 */         ((EntityLivingBase)par1MovingObjectPosition.field_72308_g).func_70690_d(new PotionEffect(Potion.field_76440_q.field_76415_H, 100 + 50 * this.field_70170_p.field_73012_v.nextInt(8), 0));
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  81 */     for (int var3 = 0; var3 < 4; var3++)
/*     */     {
/*  83 */       this.field_70170_p.func_72869_a("smoke", this.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70161_v + this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*  85 */     func_85030_a("random.splash", 0.5F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/*     */     
/*  87 */     if (!this.field_70170_p.field_72995_K)
/*     */     {
/*  89 */       func_70106_y();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  99 */     super.func_70071_h_();
/* 100 */     this.my_rotation += 30.0F;
/*     */     
/* 102 */     while (this.my_rotation > 360.0F) {
/* 103 */       this.my_rotation -= 360.0F;
/*     */     }
/*     */     
/* 106 */     this.field_70125_A = this.field_70127_C = this.my_rotation;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\InkSack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */