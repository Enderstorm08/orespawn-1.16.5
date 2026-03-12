/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.projectile.EntityThrowable;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Shoes
/*     */   extends EntityThrowable
/*     */ {
/*  16 */   public int ShoeId = 0;
/*  17 */   private float my_rotation = 0.0F;
/*     */ 
/*     */   
/*     */   public Shoes(World par1World) {
/*  21 */     super(par1World);
/*  22 */     this.ShoeId = this.field_70146_Z.nextInt(4) + 2;
/*     */     
/*  24 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.ShoeId));
/*     */   }
/*     */ 
/*     */   
/*     */   public Shoes(World par1World, int par2) {
/*  29 */     super(par1World);
/*  30 */     this.ShoeId = par2;
/*     */     
/*  32 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.ShoeId));
/*     */   }
/*     */ 
/*     */   
/*     */   public Shoes(World par1World, EntityLivingBase par2EntityLiving) {
/*  37 */     super(par1World, par2EntityLiving);
/*  38 */     this.ShoeId = this.field_70146_Z.nextInt(4) + 2;
/*     */     
/*  40 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.ShoeId));
/*     */   }
/*     */ 
/*     */   
/*     */   public Shoes(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/*  45 */     super(par1World, par2EntityLiving);
/*  46 */     this.ShoeId = par3;
/*     */     
/*  48 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.ShoeId));
/*     */   }
/*     */ 
/*     */   
/*     */   public Shoes(World par1World, double par2, double par4, double par6) {
/*  53 */     super(par1World, par2, par4, par6);
/*  54 */     this.ShoeId = this.field_70146_Z.nextInt(4) + 2;
/*     */     
/*  56 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.ShoeId));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getShoeId() {
/*  61 */     return this.field_70180_af.func_75679_c(20);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
/*  69 */     if (par1MovingObjectPosition.field_72308_g != null) {
/*     */       
/*  71 */       float var2 = 2.0F;
/*     */       
/*  73 */       if (getShoeId() == 6) {
/*  74 */         var2 = 6.0F;
/*     */       }
/*     */       
/*  77 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */       {
/*  79 */         var2 += 4.0F;
/*     */       }
/*     */       
/*  82 */       if (par1MovingObjectPosition.field_72308_g instanceof Girlfriend)
/*     */       {
/*  84 */         var2 = 1.0F;
/*     */       }
/*  86 */       if (par1MovingObjectPosition.field_72308_g instanceof Boyfriend)
/*     */       {
/*  88 */         var2 = 1.0F;
/*     */       }
/*     */ 
/*     */       
/*  92 */       if (par1MovingObjectPosition.field_72308_g instanceof net.minecraft.entity.player.EntityPlayer) {
/*     */         
/*  94 */         var2 = 0.0F;
/*  95 */         if (OreSpawnMain.valentines_day != 0) var2 = 2.0F; 
/*     */       } 
/*  97 */       par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a((Entity)this, (Entity)func_85052_h()), var2);
/*     */     } 
/*     */     
/* 100 */     for (int var3 = 0; var3 < 4; var3++) {
/*     */       
/* 102 */       this.field_70170_p.func_72869_a("snowballpoof", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 103 */       this.field_70170_p.func_72869_a("reddust", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 106 */     if (!this.field_70170_p.field_72995_K)
/*     */     {
/* 108 */       func_70106_y();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 118 */     super.func_70071_h_();
/*     */ 
/*     */     
/* 121 */     this.my_rotation += 20.0F;
/*     */     
/* 123 */     while (this.my_rotation > 360.0F) {
/* 124 */       this.my_rotation -= 360.0F;
/*     */     }
/*     */ 
/*     */     
/* 128 */     this.field_70125_A = this.field_70127_C = this.my_rotation;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Shoes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */