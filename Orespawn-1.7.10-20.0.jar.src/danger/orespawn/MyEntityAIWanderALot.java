/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.EntityCreature;
/*    */ import net.minecraft.entity.ai.EntityAIBase;
/*    */ import net.minecraft.entity.ai.RandomPositionGenerator;
/*    */ import net.minecraft.entity.passive.EntityTameable;
/*    */ import net.minecraft.util.Vec3;
/*    */ 
/*    */ 
/*    */ public class MyEntityAIWanderALot
/*    */   extends EntityAIBase
/*    */ {
/*    */   private EntityCreature entity;
/*    */   private double xPosition;
/*    */   private double yPosition;
/*    */   private double zPosition;
/*    */   private double speed;
/* 18 */   private int xzRange = 10;
/* 19 */   private int busy = 0;
/*    */ 
/*    */   
/*    */   public MyEntityAIWanderALot(EntityCreature par1EntityCreature, int par1, double par2) {
/* 23 */     this.entity = par1EntityCreature;
/* 24 */     this.xzRange = par1;
/* 25 */     this.speed = par2;
/* 26 */     func_75248_a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setBusy(int i) {
/* 31 */     this.busy = i;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_75250_a() {
/* 39 */     if (this.busy != 0) return false;
/*    */     
/* 41 */     if (this.entity.func_70681_au().nextInt(30) != 0)
/*    */     {
/* 43 */       return false;
/*    */     }
/*    */     
/* 46 */     if (this.entity instanceof EntityTameable && ((EntityTameable)this.entity).func_70906_o())
/*    */     {
/* 48 */       return false;
/*    */     }
/*    */     
/* 51 */     Vec3 var1 = RandomPositionGenerator.func_75463_a(this.entity, this.xzRange, 7);
/*    */     
/* 53 */     if (var1 == null)
/*    */     {
/* 55 */       return false;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 60 */     this.xPosition = var1.field_72450_a;
/* 61 */     this.yPosition = var1.field_72448_b;
/* 62 */     this.zPosition = var1.field_72449_c;
/* 63 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_75253_b() {
/* 73 */     return !this.entity.func_70661_as().func_75500_f();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_75249_e() {
/* 81 */     this.entity.func_70661_as().func_75492_a(this.xPosition, this.yPosition, this.zPosition, this.speed);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyEntityAIWanderALot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */