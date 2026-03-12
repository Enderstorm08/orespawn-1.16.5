/*    */ package danger.orespawn;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.minecraft.world.gen.structure.MapGenVillage;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MapGenMoreVillages
/*    */   extends MapGenVillage
/*    */ {
/* 31 */   private int field_82665_g = 9;
/* 32 */   private int field_82666_h = 7;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean func_75047_a(int par1, int par2) {
/* 38 */     int var3 = par1;
/* 39 */     int var4 = par2;
/*    */     
/* 41 */     if (par1 < 0)
/*    */     {
/* 43 */       par1 -= this.field_82665_g - 1;
/*    */     }
/*    */     
/* 46 */     if (par2 < 0)
/*    */     {
/* 48 */       par2 -= this.field_82665_g - 1;
/*    */     }
/*    */     
/* 51 */     int var5 = par1 / this.field_82665_g;
/* 52 */     int var6 = par2 / this.field_82665_g;
/* 53 */     Random var7 = this.field_75039_c.func_72843_D(var5, var6, 10387312);
/* 54 */     var5 *= this.field_82665_g;
/* 55 */     var6 *= this.field_82665_g;
/* 56 */     var5 += var7.nextInt(this.field_82665_g - this.field_82666_h);
/* 57 */     var6 += var7.nextInt(this.field_82665_g - this.field_82666_h);
/*    */     
/* 59 */     if (var3 == var5 && var4 == var6) {
/*    */       
/* 61 */       boolean var8 = this.field_75039_c.func_72959_q().func_76940_a(var3 * 16 + 8, var4 * 16 + 8, 0, field_75055_e);
/*    */ 
/*    */       
/* 64 */       return true;
/*    */     } 
/*    */ 
/*    */     
/* 68 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MapGenMoreVillages.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */