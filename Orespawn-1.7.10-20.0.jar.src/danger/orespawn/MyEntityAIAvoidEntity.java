/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.RandomPositionGenerator;
/*     */ import net.minecraft.entity.monster.IMob;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.pathfinding.PathEntity;
/*     */ import net.minecraft.pathfinding.PathNavigate;
/*     */ import net.minecraft.util.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MyEntityAIAvoidEntity
/*     */   extends EntityAIBase
/*     */ {
/*     */   private EntityCreature theEntity;
/*     */   private double farSpeed;
/*     */   private double nearSpeed;
/*     */   private Entity closestLivingEntity;
/*     */   private float distanceFromEntity;
/*     */   private PathEntity entityPathEntity;
/*     */   private PathNavigate entityPathNavigate;
/*     */   private Class targetEntityClass;
/*     */   
/*     */   public MyEntityAIAvoidEntity(EntityCreature par1EntityCreature, Class par2Class, float par3, double par4, double par6) {
/*  37 */     this.theEntity = par1EntityCreature;
/*  38 */     this.targetEntityClass = par2Class;
/*  39 */     this.distanceFromEntity = par3;
/*  40 */     this.farSpeed = par4;
/*  41 */     this.nearSpeed = par6;
/*  42 */     this.entityPathNavigate = par1EntityCreature.func_70661_as();
/*  43 */     func_75248_a(1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_75250_a() {
/*  51 */     if (this.theEntity != null && this.theEntity instanceof EntityCannonFodder) {
/*  52 */       EntityCannonFodder cf = (EntityCannonFodder)this.theEntity;
/*  53 */       if (cf.get_is_activated() != 0) return false;
/*     */     
/*     */     } 
/*  56 */     if (this.targetEntityClass == EntityPlayer.class) {
/*     */       
/*  58 */       if (this.theEntity instanceof EntityTameable && ((EntityTameable)this.theEntity).func_70909_n())
/*     */       {
/*  60 */         return false;
/*     */       }
/*     */       
/*  63 */       this.closestLivingEntity = (Entity)this.theEntity.field_70170_p.func_72890_a((Entity)this.theEntity, this.distanceFromEntity);
/*     */       
/*  65 */       if (this.closestLivingEntity == null)
/*     */       {
/*  67 */         return false;
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/*  72 */       List<Entity> list = this.theEntity.field_70170_p.func_82733_a(this.targetEntityClass, this.theEntity.field_70121_D.func_72314_b(this.distanceFromEntity, 3.0D, this.distanceFromEntity), IMob.field_82192_a);
/*     */       
/*  74 */       if (list.isEmpty())
/*     */       {
/*  76 */         return false;
/*     */       }
/*     */       
/*  79 */       this.closestLivingEntity = list.get(0);
/*     */     } 
/*     */     
/*  82 */     Vec3 vec3 = RandomPositionGenerator.func_75461_b(this.theEntity, 16, 7, Vec3.func_72443_a(this.closestLivingEntity.field_70165_t, this.closestLivingEntity.field_70163_u, this.closestLivingEntity.field_70161_v));
/*     */     
/*  84 */     if (vec3 == null)
/*     */     {
/*  86 */       return false;
/*     */     }
/*  88 */     if (this.closestLivingEntity.func_70092_e(vec3.field_72450_a, vec3.field_72448_b, vec3.field_72449_c) < this.closestLivingEntity.func_70068_e((Entity)this.theEntity))
/*     */     {
/*  90 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  94 */     this.entityPathEntity = this.entityPathNavigate.func_75488_a(vec3.field_72450_a, vec3.field_72448_b, vec3.field_72449_c);
/*  95 */     return (this.entityPathEntity == null) ? false : this.entityPathEntity.func_75880_b(vec3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_75253_b() {
/* 104 */     return !this.entityPathNavigate.func_75500_f();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75249_e() {
/* 112 */     this.entityPathNavigate.func_75484_a(this.entityPathEntity, this.farSpeed);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75251_c() {
/* 120 */     this.closestLivingEntity = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75246_d() {
/* 128 */     if (this.theEntity.func_70068_e(this.closestLivingEntity) < 49.0D) {
/*     */       
/* 130 */       this.theEntity.func_70661_as().func_75489_a(this.nearSpeed);
/*     */     }
/*     */     else {
/*     */       
/* 134 */       this.theEntity.func_70661_as().func_75489_a(this.farSpeed);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static EntityCreature func_98217_a(MyEntityAIAvoidEntity par0EntityAIAvoidEntity) {
/* 140 */     return par0EntityAIAvoidEntity.theEntity;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyEntityAIAvoidEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */