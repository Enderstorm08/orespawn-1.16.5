/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.command.IEntitySelector;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MyEntityAINearestAttackableTarget
/*     */   extends MyEntityAITarget
/*     */ {
/*     */   EntityLiving targetEntity;
/*     */   Class targetClass;
/*     */   int targetChance;
/*     */   private final IEntitySelector field_82643_g;
/*     */   private MyEntityAINearestAttackableTargetSorter theNearestAttackableTargetSorter;
/*     */   
/*     */   public MyEntityAINearestAttackableTarget(EntityLiving par1EntityLiving, Class par2Class, float par3, int par4, boolean par5) {
/*  25 */     this(par1EntityLiving, par2Class, par3, par4, par5, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public MyEntityAINearestAttackableTarget(EntityLiving par1EntityLiving, Class par2Class, float par3, int par4, boolean par5, boolean par6) {
/*  30 */     this(par1EntityLiving, par2Class, par3, par4, par5, par6, (IEntitySelector)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public MyEntityAINearestAttackableTarget(EntityLiving par1, Class par2, float par3, int par4, boolean par5, boolean par6, IEntitySelector par7IEntitySelector) {
/*  35 */     super(par1, par3, par5, par6);
/*  36 */     this.targetClass = par2;
/*  37 */     this.targetDistance = par3;
/*  38 */     this.targetChance = par4;
/*  39 */     this.theNearestAttackableTargetSorter = new MyEntityAINearestAttackableTargetSorter(this, (Entity)par1);
/*  40 */     this.field_82643_g = par7IEntitySelector;
/*  41 */     func_75248_a(1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_75250_a() {
/*  51 */     if (this.taskOwner instanceof EntityTameable && !((EntityTameable)this.taskOwner).func_70909_n())
/*     */     {
/*  53 */       return false;
/*     */     }
/*     */     
/*  56 */     if (this.taskOwner instanceof Girlfriend && !((Girlfriend)this.taskOwner).func_70909_n())
/*     */     {
/*  58 */       return false;
/*     */     }
/*     */     
/*  61 */     if (this.taskOwner instanceof Girlfriend && ((Girlfriend)this.taskOwner).func_70906_o())
/*     */     {
/*  63 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  67 */     if (this.targetChance > 0 && this.taskOwner.func_70681_au().nextInt(100) > this.targetChance)
/*     */     {
/*  69 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  73 */     List<?> var5 = this.taskOwner.field_70170_p.func_82733_a(this.targetClass, this.taskOwner.field_70121_D.func_72314_b(this.targetDistance, 4.0D, this.targetDistance), this.field_82643_g);
/*  74 */     Collections.sort(var5, this.theNearestAttackableTargetSorter);
/*  75 */     Iterator<?> var2 = var5.iterator();
/*     */     
/*  77 */     while (var2.hasNext()) {
/*     */       
/*  79 */       Entity var3 = (Entity)var2.next();
/*  80 */       EntityLiving var4 = (EntityLiving)var3;
/*     */       
/*  82 */       if (isSuitableTarget((EntityLivingBase)var4, false)) {
/*     */         
/*  84 */         this.targetEntity = var4;
/*  85 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/*  89 */     this.targetEntity = null;
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75249_e() {
/*  99 */     this.taskOwner.func_70624_b((EntityLivingBase)this.targetEntity);
/* 100 */     super.func_75249_e();
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyEntityAINearestAttackableTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */