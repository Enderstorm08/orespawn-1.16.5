/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.pathfinding.PathEntity;
/*     */ import net.minecraft.pathfinding.PathPoint;
/*     */ import net.minecraft.util.MathHelper;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class MyEntityAITarget
/*     */   extends EntityAIBase
/*     */ {
/*     */   protected EntityLiving taskOwner;
/*     */   protected float targetDistance;
/*     */   protected boolean shouldCheckSight;
/*     */   private boolean field_75303_a;
/*     */   private int field_75301_b;
/*     */   private int field_75302_c;
/*     */   private int field_75298_g;
/*     */   
/*     */   public MyEntityAITarget(EntityLiving par1EntityLiving, float par2, boolean par3) {
/*  38 */     this(par1EntityLiving, par2, par3, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public MyEntityAITarget(EntityLiving par1EntityLiving, float par2, boolean par3, boolean par4) {
/*  43 */     this.field_75301_b = 0;
/*  44 */     this.field_75302_c = 0;
/*  45 */     this.field_75298_g = 0;
/*  46 */     this.taskOwner = par1EntityLiving;
/*  47 */     this.targetDistance = par2;
/*  48 */     this.shouldCheckSight = par3;
/*  49 */     this.field_75303_a = par4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_75253_b() {
/*  57 */     EntityLivingBase var1 = this.taskOwner.func_70638_az();
/*     */     
/*  59 */     if (var1 == null)
/*     */     {
/*  61 */       return false;
/*     */     }
/*  63 */     if (!var1.func_70089_S()) {
/*     */       
/*  65 */       this.taskOwner.func_70624_b(null);
/*  66 */       return false;
/*     */     } 
/*  68 */     if (this.taskOwner.func_70068_e((Entity)var1) > (this.targetDistance * this.targetDistance))
/*     */     {
/*  70 */       return false;
/*     */     }
/*     */     
/*  73 */     if (this.taskOwner instanceof EntityTameable && ((EntityTameable)this.taskOwner).func_70909_n())
/*     */     {
/*  75 */       if (var1 instanceof EntityTameable && ((EntityTameable)var1).func_70909_n())
/*     */       {
/*     */         
/*  78 */         return false;
/*     */       }
/*     */     }
/*     */     
/*  82 */     if (this.shouldCheckSight)
/*     */     {
/*  84 */       if (this.taskOwner.func_70635_at().func_75522_a((Entity)var1)) {
/*     */         
/*  86 */         this.field_75298_g = 0;
/*     */       }
/*  88 */       else if (++this.field_75298_g > 60) {
/*     */         
/*  90 */         return false;
/*     */       } 
/*     */     }
/*     */     
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75249_e() {
/* 103 */     this.field_75301_b = 0;
/* 104 */     this.field_75302_c = 0;
/* 105 */     this.field_75298_g = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75251_c() {
/* 113 */     this.taskOwner.func_70624_b((EntityLivingBase)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 123 */     if (par1EntityLiving == null)
/*     */     {
/*     */       
/* 126 */       return false;
/*     */     }
/*     */     
/* 129 */     if (par1EntityLiving == this.taskOwner)
/*     */     {
/*     */       
/* 132 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 137 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 140 */       return false;
/*     */     }
/*     */     
/* 143 */     if (this.taskOwner instanceof EntityTameable && ((EntityTameable)this.taskOwner).func_70909_n()) {
/*     */       
/* 145 */       if (par1EntityLiving instanceof EntityTameable && ((EntityTameable)par1EntityLiving).func_70909_n())
/*     */       {
/*     */         
/* 148 */         return false;
/*     */       }
/* 150 */       if (par1EntityLiving == ((EntityTameable)this.taskOwner).func_70902_q())
/*     */       {
/*     */         
/* 153 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 157 */     if (par1EntityLiving instanceof net.minecraft.entity.player.EntityPlayer) {
/*     */ 
/*     */       
/* 160 */       if (OreSpawnMain.valentines_day != 0) return true; 
/* 161 */       return false;
/*     */     } 
/*     */     
/* 164 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityPigZombie)
/*     */     {
/*     */       
/* 167 */       return false;
/*     */     }
/* 169 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityEnderman)
/*     */     {
/*     */       
/* 172 */       return false;
/*     */     }
/* 174 */     if (par1EntityLiving instanceof Mothra)
/*     */     {
/* 176 */       return true;
/*     */     }
/*     */     
/* 179 */     if (this.shouldCheckSight && !this.taskOwner.func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 182 */       return false;
/*     */     }
/* 184 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */     {
/*     */       
/* 187 */       return true;
/*     */     }
/*     */     
/* 190 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityGhast)
/*     */     {
/*     */       
/* 193 */       return true;
/*     */     }
/* 195 */     if (this.field_75303_a) {
/*     */       
/* 197 */       if (--this.field_75302_c <= 0)
/*     */       {
/* 199 */         this.field_75301_b = 0;
/*     */       }
/*     */       
/* 202 */       if (this.field_75301_b == 0)
/*     */       {
/* 204 */         this.field_75301_b = func_75295_a(par1EntityLiving) ? 1 : 2;
/*     */       }
/*     */       
/* 207 */       if (this.field_75301_b == 2)
/*     */       {
/*     */         
/* 210 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 214 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean func_75295_a(EntityLivingBase par1EntityLiving) {
/* 219 */     this.field_75302_c = 10 + this.taskOwner.func_70681_au().nextInt(5);
/* 220 */     PathEntity var2 = this.taskOwner.func_70661_as().func_75494_a((Entity)par1EntityLiving);
/*     */     
/* 222 */     if (var2 == null)
/*     */     {
/* 224 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 228 */     PathPoint var3 = var2.func_75870_c();
/*     */     
/* 230 */     if (var3 == null)
/*     */     {
/* 232 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 236 */     int var4 = var3.field_75839_a - MathHelper.func_76128_c(par1EntityLiving.field_70165_t);
/* 237 */     int var5 = var3.field_75838_c - MathHelper.func_76128_c(par1EntityLiving.field_70161_v);
/* 238 */     return ((var4 * var4 + var5 * var5) <= 2.25D);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyEntityAITarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */