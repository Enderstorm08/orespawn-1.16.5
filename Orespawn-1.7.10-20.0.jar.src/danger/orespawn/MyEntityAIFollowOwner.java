/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.pathfinding.PathNavigate;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MyEntityAIFollowOwner
/*     */   extends EntityAIBase
/*     */ {
/*     */   private EntityTameable thePet;
/*     */   private EntityLivingBase theOwner;
/*     */   World theWorld;
/*     */   private float field_75336_f;
/*     */   private PathNavigate petPathfinder;
/*     */   private int field_75343_h;
/*     */   float maxDist;
/*     */   float minDist;
/*     */   private boolean field_75344_i;
/*     */   
/*     */   public MyEntityAIFollowOwner(EntityTameable par1EntityTameable, float par2, float par3, float par4) {
/*  30 */     this.thePet = par1EntityTameable;
/*  31 */     this.theWorld = par1EntityTameable.field_70170_p;
/*  32 */     this.field_75336_f = par2;
/*  33 */     this.petPathfinder = par1EntityTameable.func_70661_as();
/*  34 */     this.minDist = par4;
/*  35 */     this.maxDist = par3;
/*  36 */     func_75248_a(3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_75250_a() {
/*  44 */     EntityLivingBase var1 = this.thePet.func_70902_q();
/*     */     
/*  46 */     if (var1 == null)
/*     */     {
/*  48 */       return false;
/*     */     }
/*  50 */     this.theOwner = var1;
/*     */     
/*  52 */     if (this.thePet.func_70906_o())
/*     */     {
/*  54 */       return false;
/*     */     }
/*  56 */     if (this.thePet instanceof Girlfriend && 
/*  57 */       OreSpawnMain.valentines_day != 0) {
/*  58 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  63 */     if (this.thePet != null && (
/*  64 */       this.thePet.field_70163_u < 60.0D || !this.thePet.field_70170_p.func_72935_r()) && 
/*  65 */       this.thePet.func_70068_e((Entity)var1) > (this.maxDist / 2.0F * this.maxDist / 2.0F))
/*     */     {
/*  67 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  72 */     if (this.thePet.func_70068_e((Entity)var1) < (this.maxDist * this.maxDist))
/*     */     {
/*  74 */       return false;
/*     */     }
/*     */     
/*  77 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_75253_b() {
/*  86 */     if (this.thePet.func_70906_o()) {
/*  87 */       return false;
/*     */     }
/*     */     
/*  90 */     if (this.petPathfinder.func_75500_f()) {
/*  91 */       return false;
/*     */     }
/*     */     
/*  94 */     if (this.thePet != null && 
/*  95 */       this.thePet instanceof EntityTameable) {
/*  96 */       EntityTameable gf = this.thePet;
/*  97 */       EntityLivingBase var1 = gf.func_70902_q();
/*  98 */       if (var1 != null && 
/*  99 */         (int)gf.field_70161_v == (int)var1.field_70161_v && 
/* 100 */         (int)gf.field_70165_t == (int)var1.field_70165_t && 
/* 101 */         (int)gf.field_70163_u < (int)var1.field_70163_u + 2 && 
/* 102 */         (int)gf.field_70163_u > (int)var1.field_70163_u - 2) {
/* 103 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     return (this.thePet.func_70068_e((Entity)this.theOwner) > (this.minDist * this.minDist));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75249_e() {
/* 120 */     this.field_75343_h = 0;
/* 121 */     this.field_75344_i = this.thePet.func_70661_as().func_75486_a();
/* 122 */     this.thePet.func_70661_as().func_75491_a(false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75251_c() {
/* 130 */     this.theOwner = null;
/* 131 */     this.petPathfinder.func_75499_g();
/* 132 */     this.thePet.func_70661_as().func_75491_a(this.field_75344_i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75246_d() {
/* 140 */     this.thePet.func_70671_ap().func_75651_a((Entity)this.theOwner, 10.0F, this.thePet.func_70646_bf());
/*     */     
/* 142 */     if (!this.thePet.func_70906_o())
/*     */     {
/* 144 */       if (--this.field_75343_h <= 0) {
/*     */         
/* 146 */         this.field_75343_h = 10;
/*     */         
/* 148 */         if (!this.petPathfinder.func_75497_a((Entity)this.theOwner, this.field_75336_f))
/*     */         {
/* 150 */           if (this.thePet.func_70068_e((Entity)this.theOwner) >= 144.0D) {
/*     */             
/* 152 */             int var1 = MathHelper.func_76128_c(this.theOwner.field_70165_t) - 2;
/* 153 */             int var2 = MathHelper.func_76128_c(this.theOwner.field_70161_v) - 2;
/* 154 */             int var3 = MathHelper.func_76128_c(this.theOwner.field_70121_D.field_72338_b);
/*     */             
/* 156 */             for (int var4 = 0; var4 <= 4; var4++) {
/*     */               
/* 158 */               for (int var5 = 0; var5 <= 4; var5++) {
/*     */                 
/* 160 */                 if ((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && World.func_147466_a((IBlockAccess)this.theWorld, var1 + var4, var3 - 1, var2 + var5) && !this.theWorld.func_147439_a(var1 + var4, var3, var2 + var5).func_149721_r() && !this.theWorld.func_147439_a(var1 + var4, var3 + 1, var2 + var5).func_149721_r()) {
/*     */                   
/* 162 */                   this.thePet.func_70012_b(((var1 + var4) + 0.5F), var3, ((var2 + var5) + 0.5F), this.thePet.field_70177_z, this.thePet.field_70125_A);
/* 163 */                   this.petPathfinder.func_75499_g();
/*     */                   return;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MyEntityAIFollowOwner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */