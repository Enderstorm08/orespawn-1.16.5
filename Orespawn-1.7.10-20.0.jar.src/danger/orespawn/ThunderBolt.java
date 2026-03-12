/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.effect.EntityLightningBolt;
/*    */ import net.minecraft.entity.projectile.EntityThrowable;
/*    */ import net.minecraft.util.DamageSource;
/*    */ import net.minecraft.util.MovingObjectPosition;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ThunderBolt
/*    */   extends EntityThrowable
/*    */ {
/*    */   public ThunderBolt(World par1World) {
/* 18 */     super(par1World);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ThunderBolt(World par1World, EntityLivingBase par3EntityPlayer) {
/* 24 */     super(par1World, par3EntityPlayer);
/*    */   }
/*    */ 
/*    */   
/*    */   public ThunderBolt(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/* 29 */     super(par1World, par2EntityLiving);
/*    */   }
/*    */ 
/*    */   
/*    */   public ThunderBolt(World par1World, double par2, double par4, double par6) {
/* 34 */     super(par1World, par2, par4, par6);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/* 42 */     if (par1MovingObjectPosition.field_72308_g != null) {
/*    */       
/* 44 */       float var2 = 40.0F;
/*    */       
/* 46 */       if (MyUtils.isRoyalty(par1MovingObjectPosition.field_72308_g)) {
/* 47 */         func_70106_y();
/*    */         
/*    */         return;
/*    */       } 
/* 51 */       par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)func_85052_h()), var2 / 2.0F);
/* 52 */       par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76358_a(func_85052_h()), var2 / 2.0F);
/* 53 */       par1MovingObjectPosition.field_72308_g.func_70015_d(1);
/*    */     } 
/*    */     
/* 56 */     int mx = 20;
/* 57 */     for (int var3 = 0; var3 < mx; var3++) {
/*    */       
/* 59 */       this.field_70170_p.func_72869_a("smoke", this.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70161_v + this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 60 */       this.field_70170_p.func_72869_a("largesmoke", this.field_70165_t + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70163_u + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), this.field_70161_v + this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 61 */       this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70170_p.field_73012_v.nextGaussian(), this.field_70170_p.field_73012_v.nextGaussian(), this.field_70170_p.field_73012_v.nextGaussian());
/*    */     } 
/*    */     
/* 64 */     func_85030_a("random.explode", 0.5F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/* 65 */     if (!this.field_70170_p.field_72995_K)
/*    */     {
/* 67 */       this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, 3.0F, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/*    */     }
/* 69 */     this.field_70170_p.func_72942_c((Entity)new EntityLightningBolt(this.field_70170_p, this.field_70165_t, this.field_70163_u + 1.0D, this.field_70161_v));
/*    */     
/* 71 */     func_70106_y();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_70071_h_() {
/* 80 */     super.func_70071_h_();
/*    */ 
/*    */     
/* 83 */     int mx = 4;
/* 84 */     for (int i = 0; i < mx; i++)
/* 85 */       this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70170_p.field_73012_v.nextGaussian() / 10.0D, this.field_70170_p.field_73012_v.nextGaussian() / 10.0D, this.field_70170_p.field_73012_v.nextGaussian() / 10.0D); 
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ThunderBolt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */