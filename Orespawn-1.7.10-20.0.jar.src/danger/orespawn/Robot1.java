/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.DamageSource;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Robot1
/*     */   extends EntityMob
/*     */ {
/*  54 */   private GenericTargetSorter TargetSorter = null;
/*  55 */   private RenderInfo renderdata = new RenderInfo();
/*  56 */   private float moveSpeed = 0.2F;
/*     */ 
/*     */   
/*     */   public Robot1(World par1World) {
/*  60 */     super(par1World);
/*  61 */     func_70105_a(0.5F, 0.5F);
/*  62 */     func_70661_as().func_75491_a(true);
/*  63 */     this.field_70728_aV = 5;
/*  64 */     this.field_70174_ab = 5;
/*  65 */     this.field_70178_ae = true;
/*  66 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  67 */     this.renderdata = new RenderInfo();
/*  68 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  69 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*  70 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  71 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  72 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  73 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  78 */     super.func_110147_ax();
/*  79 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  80 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  81 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(4.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  86 */     super.func_70088_a();
/*  87 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  88 */     if (this.renderdata == null) {
/*  89 */       this.renderdata = new RenderInfo();
/*     */     }
/*  91 */     this.renderdata.rf1 = 0.0F;
/*  92 */     this.renderdata.rf2 = 0.0F;
/*  93 */     this.renderdata.rf3 = 0.0F;
/*  94 */     this.renderdata.rf4 = 0.0F;
/*  95 */     this.renderdata.ri1 = 0;
/*  96 */     this.renderdata.ri2 = 0;
/*  97 */     this.renderdata.ri3 = 0;
/*  98 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 102 */     if (func_104002_bU()) return false; 
/* 103 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 111 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 112 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 117 */     return 5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 124 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 129 */     this.renderdata.rf1 = r.rf1;
/* 130 */     this.renderdata.rf2 = r.rf2;
/* 131 */     this.renderdata.rf3 = r.rf3;
/* 132 */     this.renderdata.rf4 = r.rf4;
/* 133 */     this.renderdata.ri1 = r.ri1;
/* 134 */     this.renderdata.ri2 = r.ri2;
/* 135 */     this.renderdata.ri3 = r.ri3;
/* 136 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 144 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 152 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 162 */     super.func_70636_d();
/* 163 */     if (this.field_70170_p.field_73012_v.nextInt(8) == 0) {
/* 164 */       EntityLivingBase e = findSomethingToAttack();
/* 165 */       if (e != null) {
/* 166 */         if (func_70068_e((Entity)e) < 5.0D && !this.field_70170_p.field_72995_K && 
/* 167 */           this.field_70170_p.field_73012_v.nextInt(18) == 1) {
/* 168 */           this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, 2.5F, this.field_70170_p.func_82736_K().func_82766_b("mobGriefing"));
/* 169 */           func_70106_y();
/*     */         } 
/*     */         
/* 172 */         for (int i = 0; i < 2; i++) {
/* 173 */           this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u + 1.0D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 174 */           this.field_70170_p.func_72869_a("lava", this.field_70165_t, this.field_70163_u + 1.0D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/*     */         } 
/* 176 */         func_70661_as().func_75497_a((Entity)e, 1.2D);
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
/*     */   protected String func_70639_aQ() {
/* 188 */     return "orespawn:kyuubi_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 196 */     return "orespawn:scorpion_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 204 */     return "orespawn:robot1_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 211 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 218 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 226 */     return Items.field_151016_H;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 234 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 241 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 246 */     if (this.field_70128_L)
/* 247 */       return;  super.func_70619_bc();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 255 */     boolean ret = false;
/* 256 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 257 */       ret = super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 259 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 269 */     if (par1EntityLiving == null)
/*     */     {
/* 271 */       return false;
/*     */     }
/* 273 */     if (par1EntityLiving == this)
/*     */     {
/* 275 */       return false;
/*     */     }
/* 277 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 279 */       return false;
/*     */     }
/*     */     
/* 282 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 284 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 287 */       return false;
/*     */     }
/*     */     
/* 290 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 292 */       return false;
/*     */     }
/* 294 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 296 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 297 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 298 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 302 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 307 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 308 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(8.0D, 3.0D, 8.0D));
/* 309 */     Collections.sort(var5, this.TargetSorter);
/* 310 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 312 */     while (var2.hasNext()) {
/*     */       
/* 314 */       Entity var3 = (Entity)var2.next();
/* 315 */       EntityLivingBase var4 = (EntityLivingBase)var3;
/*     */       
/* 317 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 319 */         return var4;
/*     */       }
/*     */     } 
/* 322 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 328 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 333 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 341 */     if (this.field_70163_u < 50.0D) return false; 
/* 342 */     if (!func_70814_o()) return false; 
/* 343 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */     
/* 345 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Robot1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */