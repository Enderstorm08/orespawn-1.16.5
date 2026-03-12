/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public class RubyBird
/*    */   extends Cockateil {
/*    */   public RubyBird(World par1World) {
/*  8 */     super(par1World);
/*    */   }
/*    */   
/*    */   protected void func_70088_a() {
/* 12 */     super.func_70088_a();
/* 13 */     this.birdtype = 5;
/* 14 */     setBirdType(this.birdtype);
/* 15 */     setFlyUp();
/*    */   }
/*    */   
/*    */   protected String func_70639_aQ() {
/* 19 */     if (this.field_70170_p.func_72935_r() && !this.field_70170_p.func_72896_J()) {
/* 20 */       return "orespawn:rubybird";
/*    */     }
/* 22 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_70601_bi() {
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RubyBird.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */