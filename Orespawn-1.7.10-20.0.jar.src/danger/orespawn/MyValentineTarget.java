/*    */ package danger.orespawn;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import net.minecraft.command.IEntitySelector;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MyValentineTarget
/*    */   extends MyEntityAITarget
/*    */ {
/*    */   EntityLivingBase targetEntity;
/*    */   Class targetClass;
/*    */   int targetChance;
/*    */   private final IEntitySelector field_82643_g;
/*    */   private MyValentineTargetSorter theNearestAttackableTargetSorter;
/*    */   
/*    */   public MyValentineTarget(EntityLiving par1EntityLiving, Class par2Class, float par3, int par4, boolean par5) {
/* 26 */     this(par1EntityLiving, par2Class, par3, par4, par5, false);
/*    */   }
/*    */ 
/*    */   
/*    */   public MyValentineTarget(EntityLiving par1EntityLiving, Class par2Class, float par3, int par4, boolean par5, boolean par6) {
/* 31 */     this(par1EntityLiving, par2Class, par3, par4, par5, par6, (IEntitySelector)null);
/*    */   }
/*    */ 
/*    */   
/*    */   public MyValentineTarget(EntityLiving par1, Class par2, float par3, int par4, boolean par5, boolean par6, IEntitySelector par7IEntitySelector) {
/* 36 */     super(par1, par3, par5, par6);
/* 37 */     this.targetClass = par2;
/* 38 */     this.targetDistance = par3;
/* 39 */     this.targetChance = par4;
/* 40 */     this.theNearestAttackableTargetSorter = new MyValentineTargetSorter(this, (Entity)par1);
/* 41 */     this.field_82643_g = par7IEntitySelector;
/* 42 */     func_75248_a(1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_75250_a() {
/* 50 */     if (OreSpawnMain.valentines_day == 0) return false;
/*    */ 
/*    */     
/* 53 */     if (this.targetChance > 0 && this.taskOwner.func_70681_au().nextInt(100) > this.targetChance)
/*    */     {
/* 55 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 59 */     List<?> var5 = this.taskOwner.field_70170_p.func_82733_a(this.targetClass, this.taskOwner.field_70121_D.func_72314_b(this.targetDistance, 4.0D, this.targetDistance), this.field_82643_g);
/* 60 */     Collections.sort(var5, this.theNearestAttackableTargetSorter);
/* 61 */     Iterator<?> var2 = var5.iterator();
/*    */     
/* 63 */     while (var2.hasNext()) {
/*    */       
/* 65 */       Entity var3 = (Entity)var2.next();
/* 66 */       if (var3 instanceof EntityLivingBase) {
/* 67 */         EntityLivingBase var4 = (EntityLivingBase)var3;
/*    */         
/* 69 */         if (isSuitableTarget(var4, false)) {
/*    */           
/* 71 */           this.targetEntity = var4;
/* 72 */           return true;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 77 */     this.targetEntity = null;
/* 78 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_75249_e() {
/* 87 */     this.taskOwner.func_70624_b(this.targetEntity);
/* 88 */     super.func_75249_e();
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyValentineTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */