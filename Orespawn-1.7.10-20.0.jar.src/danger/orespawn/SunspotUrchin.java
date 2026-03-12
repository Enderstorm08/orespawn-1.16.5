/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.projectile.EntityThrowable;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SunspotUrchin
/*     */   extends EntityThrowable
/*     */ {
/*  23 */   private float my_rotation = 0.0F;
/*  24 */   private int my_index = 50;
/*     */ 
/*     */   
/*     */   public SunspotUrchin(World par1World) {
/*  28 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public SunspotUrchin(World par1World, int par2) {
/*  33 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public SunspotUrchin(World par1World, EntityLivingBase par2EntityLiving) {
/*  38 */     super(par1World, par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public SunspotUrchin(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/*  43 */     super(par1World, par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public SunspotUrchin(World par1World, double par2, double par4, double par6) {
/*  48 */     super(par1World, par2, par4, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getUrchinIndex() {
/*  54 */     return this.my_index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*  61 */     if (par1MovingObjectPosition.field_72308_g != null) {
/*     */       
/*  63 */       float var2 = 3.0F;
/*     */       
/*  65 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */       {
/*  67 */         var2 = 6.0F;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*  72 */       if (!(par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.player.EntityPlayer)) {
/*     */         
/*  74 */         par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)func_85052_h()), var2);
/*  75 */         if (!par1MovingObjectPosition.field_72308_g.func_70045_F())
/*     */         {
/*  77 */           par1MovingObjectPosition.field_72308_g.func_70015_d(5);
/*     */         }
/*     */       } 
/*     */     } else {
/*  81 */       int i = par1MovingObjectPosition.field_72311_b;
/*  82 */       int j = par1MovingObjectPosition.field_72312_c;
/*  83 */       int k = par1MovingObjectPosition.field_72309_d;
/*     */       
/*  85 */       switch (par1MovingObjectPosition.field_72310_e) {
/*     */         
/*     */         case 0:
/*  88 */           j--;
/*     */           break;
/*     */         case 1:
/*  91 */           j++;
/*     */           break;
/*     */         case 2:
/*  94 */           k--;
/*     */           break;
/*     */         case 3:
/*  97 */           k++;
/*     */           break;
/*     */         case 4:
/* 100 */           i--;
/*     */           break;
/*     */         case 5:
/* 103 */           i++;
/*     */           break;
/*     */       } 
/* 106 */       if (this.field_70170_p.func_147437_c(i, j, k))
/*     */       {
/* 108 */         this.field_70170_p.func_147449_b(i, j, k, (Block)Blocks.field_150480_ab);
/*     */       }
/*     */     } 
/*     */     
/* 112 */     for (int var3 = 0; var3 < 5; var3++) {
/*     */       
/* 114 */       this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70170_p.field_73012_v.nextFloat(), this.field_70170_p.field_73012_v.nextFloat(), this.field_70170_p.field_73012_v.nextFloat());
/*     */       
/* 116 */       this.field_70170_p.func_72869_a("reddust", this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70170_p.field_73012_v.nextFloat(), this.field_70170_p.field_73012_v.nextFloat(), this.field_70170_p.field_73012_v.nextFloat());
/*     */     } 
/*     */ 
/*     */     
/* 120 */     if (!this.field_70170_p.field_72995_K)
/*     */     {
/* 122 */       func_70106_y();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 132 */     super.func_70071_h_();
/* 133 */     func_70015_d(1);
/*     */ 
/*     */     
/* 136 */     this.my_rotation += 30.0F;
/*     */     
/* 138 */     while (this.my_rotation > 360.0F) {
/* 139 */       this.my_rotation -= 360.0F;
/*     */     }
/*     */ 
/*     */     
/* 143 */     this.field_70125_A = this.field_70127_C = this.my_rotation;
/*     */     
/* 145 */     this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\SunspotUrchin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */