/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public class Acid
/*    */   extends LaserBall {
/*  8 */   private int my_index = 85;
/*    */ 
/*    */   
/*    */   public Acid(World par1World) {
/* 12 */     super(par1World);
/* 13 */     setAcid();
/*    */   }
/*    */ 
/*    */   
/*    */   public Acid(World par1World, int par2) {
/* 18 */     super(par1World);
/* 19 */     setAcid();
/*    */   }
/*    */ 
/*    */   
/*    */   public Acid(World par1World, EntityLivingBase par2EntityLiving) {
/* 24 */     super(par1World, par2EntityLiving);
/* 25 */     setAcid();
/*    */   }
/*    */ 
/*    */   
/*    */   public Acid(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/* 30 */     super(par1World, par2EntityLiving);
/* 31 */     setAcid();
/*    */   }
/*    */ 
/*    */   
/*    */   public Acid(World par1World, double par2, double par4, double par6) {
/* 36 */     super(par1World, par2, par4, par6);
/* 37 */     setAcid();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getAcidIndex() {
/* 43 */     return this.my_index;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Acid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */