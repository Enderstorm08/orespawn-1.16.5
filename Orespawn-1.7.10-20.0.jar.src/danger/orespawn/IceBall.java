/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.util.MovingObjectPosition;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public class IceBall
/*    */   extends LaserBall
/*    */ {
/* 11 */   private int my_index = 84;
/* 12 */   private int icemaker = 0;
/*    */ 
/*    */   
/*    */   public IceBall(World par1World) {
/* 16 */     super(par1World);
/* 17 */     setIceBall();
/*    */   }
/*    */ 
/*    */   
/*    */   public IceBall(World par1World, int par2) {
/* 22 */     super(par1World);
/* 23 */     setIceBall();
/*    */   }
/*    */ 
/*    */   
/*    */   public IceBall(World par1World, EntityLivingBase par2EntityLiving) {
/* 28 */     super(par1World, par2EntityLiving);
/* 29 */     setIceBall();
/*    */   }
/*    */ 
/*    */   
/*    */   public IceBall(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/* 34 */     super(par1World, par2EntityLiving);
/* 35 */     setIceBall();
/*    */   }
/*    */ 
/*    */   
/*    */   public IceBall(World par1World, double par2, double par4, double par6) {
/* 40 */     super(par1World, par2, par4, par6);
/* 41 */     setIceBall();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIceBallIndex() {
/* 47 */     return this.my_index;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIceMaker(int i) {
/* 52 */     this.icemaker = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/* 57 */     if (par1MovingObjectPosition.field_72308_g != null)
/*    */     {
/* 59 */       if (MyUtils.isRoyalty(par1MovingObjectPosition.field_72308_g)) {
/* 60 */         func_70106_y();
/*    */         return;
/*    */       } 
/*    */     }
/* 64 */     super.func_70184_a(par1MovingObjectPosition);
/* 65 */     if (this.icemaker != 0)
/*    */     {
/* 67 */       for (int i = 0; i < 5; i++) {
/* 68 */         int x = this.field_70170_p.field_73012_v.nextInt(4);
/* 69 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) x = -x; 
/* 70 */         int y = this.field_70170_p.field_73012_v.nextInt(4);
/* 71 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) y = -y; 
/* 72 */         int z = this.field_70170_p.field_73012_v.nextInt(4);
/* 73 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) z = -z; 
/* 74 */         x = (int)(x + par1MovingObjectPosition.field_72307_f.field_72450_a);
/* 75 */         y = (int)(y + par1MovingObjectPosition.field_72307_f.field_72448_b);
/* 76 */         z = (int)(z + par1MovingObjectPosition.field_72307_f.field_72449_c);
/* 77 */         this.field_70170_p.func_147449_b(x, y, z, Blocks.field_150432_aD);
/*    */       } 
/*    */     }
/* 80 */     func_70106_y();
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\IceBall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */