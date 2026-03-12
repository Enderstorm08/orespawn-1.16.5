/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.monster.EntitySpider;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.world.EnumDifficulty;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SpiderDriver
/*     */   extends EntitySpider
/*     */ {
/*  29 */   private GenericTargetSorter TargetSorter = null;
/*     */   
/*     */   public SpiderDriver(World par1World) {
/*  32 */     super(par1World);
/*  33 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  34 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  35 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  36 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIWander((EntityCreature)this, 0.65F));
/*  37 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  38 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  42 */     if (func_104002_bU()) return false; 
/*  43 */     if (this.field_70154_o != null) return false; 
/*  44 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/*  52 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Entity func_70782_k() {
/*  57 */     double d0 = 16.0D;
/*  58 */     return (Entity)this.field_70170_p.func_72856_b((Entity)this, d0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/*  64 */     if (this.field_70128_L)
/*  65 */       return;  super.func_70619_bc();
/*  66 */     if (this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(5) == 0 && this.field_70154_o == null) {
/*  67 */       EntityLivingBase e = findSpiderRobot();
/*  68 */       if (e != null) {
/*  69 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/*  70 */         if (func_70068_e((Entity)e) < ((4.0F + e.field_70130_N / 2.0F) * (4.0F + e.field_70130_N / 2.0F))) {
/*  71 */           func_70078_a((Entity)e);
/*     */         } else {
/*  73 */           func_70661_as().func_75497_a((Entity)e, 0.55D);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  78 */     if (this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(4) == 0 && this.field_70154_o != null) {
/*  79 */       EntityLivingBase e = findSomethingToAttack();
/*  80 */       if (e != null) {
/*  81 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/*  82 */         if (func_70068_e((Entity)e) >= ((11.0F + e.field_70130_N / 2.0F) * (11.0F + e.field_70130_N / 2.0F)))
/*     */         {
/*     */           
/*  85 */           if (this.field_70154_o instanceof SpiderRobot) {
/*  86 */             SpiderRobot sp = (SpiderRobot)this.field_70154_o;
/*     */             
/*  88 */             double d1 = e.field_70161_v - this.field_70161_v;
/*  89 */             double d2 = e.field_70165_t - this.field_70165_t;
/*  90 */             double dd = Math.atan2(d1, d2);
/*  91 */             sp.goThisWay(0.35D * Math.cos(dd), 0.35D * Math.sin(dd));
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70785_a(Entity par1Entity, float par2) {
/* 105 */     if (this.field_70724_aR <= 0 && par2 < 2.0F && par1Entity.field_70121_D.field_72337_e > this.field_70121_D.field_72338_b && par1Entity.field_70121_D.field_72338_b < this.field_70121_D.field_72337_e) {
/*     */       
/* 107 */       this.field_70724_aR = 16;
/* 108 */       func_70652_k(par1Entity);
/* 109 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/* 110 */         ((EntityLivingBase)par1Entity).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, 60, 0));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 120 */     if (this.field_70154_o != null) return 8; 
/* 121 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSpiderRobot() {
/* 126 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 127 */     List<?> var5 = this.field_70170_p.func_72872_a(SpiderRobot.class, this.field_70121_D.func_72314_b(25.0D, 15.0D, 25.0D));
/* 128 */     Collections.sort(var5, this.TargetSorter);
/* 129 */     Iterator<?> var2 = var5.iterator();
/* 130 */     Entity var3 = null;
/* 131 */     EntityLivingBase var4 = null;
/*     */     
/* 133 */     while (var2.hasNext()) {
/*     */       
/* 135 */       var3 = (Entity)var2.next();
/* 136 */       var4 = (EntityLivingBase)var3;
/* 137 */       if (var4.field_70153_n == null) {
/* 138 */         return var4;
/*     */       }
/*     */     } 
/* 141 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 150 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 152 */     if (par1EntityLiving == null)
/*     */     {
/* 154 */       return false;
/*     */     }
/* 156 */     if (par1EntityLiving == this)
/*     */     {
/* 158 */       return false;
/*     */     }
/* 160 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 162 */       return false;
/*     */     }
/*     */     
/* 165 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 167 */     if (par1EntityLiving instanceof SpiderRobot)
/*     */     {
/* 169 */       return false;
/*     */     }
/*     */     
/* 172 */     if (par1EntityLiving instanceof SpiderDriver)
/*     */     {
/* 174 */       return false;
/*     */     }
/*     */     
/* 177 */     if (par1EntityLiving instanceof EntitySpider)
/*     */     {
/* 179 */       return false;
/*     */     }
/* 181 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
/*     */     {
/* 183 */       return false;
/*     */     }
/*     */     
/* 186 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 189 */       return false;
/*     */     }
/*     */     
/* 192 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 194 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 195 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 196 */         return false;
/*     */       }
/* 198 */       return true;
/*     */     } 
/* 200 */     if (func_70068_e((Entity)par1EntityLiving) < 36.0D) return false;
/*     */     
/* 202 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 207 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 208 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(35.0D, 15.0D, 35.0D));
/* 209 */     Collections.sort(var5, this.TargetSorter);
/* 210 */     Iterator<?> var2 = var5.iterator();
/* 211 */     Entity var3 = null;
/* 212 */     EntityLivingBase var4 = null;
/*     */     
/* 214 */     while (var2.hasNext()) {
/*     */       
/* 216 */       var3 = (Entity)var2.next();
/* 217 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 219 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 221 */         return var4;
/*     */       }
/*     */     } 
/* 224 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 232 */     SpiderRobot target = null;
/* 233 */     target = (SpiderRobot)this.field_70170_p.func_72857_a(SpiderRobot.class, this.field_70121_D.func_72314_b(24.0D, 12.0D, 24.0D), (Entity)this);
/* 234 */     if (target != null)
/*     */     {
/* 236 */       return true;
/*     */     }
/* 238 */     return super.func_70601_bi();
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\SpiderDriver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */