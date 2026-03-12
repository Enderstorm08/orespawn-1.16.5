/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.EntityCreature;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.ai.EntityAIBase;
/*    */ import net.minecraft.entity.ai.RandomPositionGenerator;
/*    */ import net.minecraft.entity.passive.EntityTameable;
/*    */ import net.minecraft.util.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MyEntityAIWander
/*    */   extends EntityAIBase
/*    */ {
/*    */   private EntityCreature entity;
/*    */   private double xPosition;
/*    */   private double yPosition;
/*    */   private double zPosition;
/*    */   private float speed;
/*    */   
/*    */   public MyEntityAIWander(EntityCreature par1EntityCreature, float par2) {
/* 22 */     this.entity = par1EntityCreature;
/* 23 */     this.speed = par2;
/* 24 */     func_75248_a(1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_75250_a() {
/* 32 */     if (this.entity.func_70681_au().nextInt(90) != 0)
/*    */     {
/* 34 */       return false;
/*    */     }
/*    */     
/* 37 */     if (this.entity instanceof EntityTameable && ((EntityTameable)this.entity).func_70906_o())
/*    */     {
/* 39 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 43 */     Vec3 var1 = RandomPositionGenerator.func_75463_a(this.entity, 10, 7);
/*    */     
/* 45 */     if (var1 == null)
/*    */     {
/* 47 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 51 */     this.xPosition = var1.field_72450_a;
/* 52 */     this.yPosition = var1.field_72448_b;
/* 53 */     this.zPosition = var1.field_72449_c;
/* 54 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_75253_b() {
/* 64 */     if (this.entity != null && 
/* 65 */       this.entity instanceof EntityTameable) {
/* 66 */       EntityTameable gf = (EntityTameable)this.entity;
/* 67 */       EntityLivingBase var1 = gf.func_70902_q();
/* 68 */       if (var1 != null && 
/* 69 */         (int)gf.field_70161_v == (int)var1.field_70161_v && 
/* 70 */         (int)gf.field_70165_t == (int)var1.field_70165_t && 
/* 71 */         (int)gf.field_70163_u < (int)var1.field_70163_u + 2 && 
/* 72 */         (int)gf.field_70163_u > (int)var1.field_70163_u - 2) {
/* 73 */         return false;
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 82 */     return !this.entity.func_70661_as().func_75500_f();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_75249_e() {
/* 90 */     this.entity.func_70661_as().func_75492_a(this.xPosition, this.yPosition, this.zPosition, this.speed);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyEntityAIWander.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */