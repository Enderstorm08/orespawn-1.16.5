/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
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
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
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
/*     */ public class Scorpion
/*     */   extends EntityMob
/*     */ {
/*  56 */   private GenericTargetSorter TargetSorter = null;
/*  57 */   private RenderInfo renderdata = new RenderInfo();
/*  58 */   private float moveSpeed = 0.2F;
/*     */   
/*     */   public Scorpion(World par1World) {
/*  61 */     super(par1World);
/*  62 */     func_70105_a(0.85F, 0.55F);
/*  63 */     func_70661_as().func_75491_a(true);
/*  64 */     this.field_70728_aV = 10;
/*  65 */     this.field_70174_ab = 100;
/*  66 */     this.field_70178_ae = false;
/*  67 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  68 */     this.renderdata = new RenderInfo();
/*  69 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  70 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  71 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  72 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  73 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  74 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  79 */     super.func_110147_ax();
/*  80 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  81 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  82 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Scorpion_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  87 */     super.func_70088_a();
/*  88 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  89 */     if (this.renderdata == null) {
/*  90 */       this.renderdata = new RenderInfo();
/*     */     }
/*  92 */     this.renderdata.rf1 = 0.0F;
/*  93 */     this.renderdata.rf2 = 0.0F;
/*  94 */     this.renderdata.rf3 = 0.0F;
/*  95 */     this.renderdata.rf4 = 0.0F;
/*  96 */     this.renderdata.ri1 = 0;
/*  97 */     this.renderdata.ri2 = 0;
/*  98 */     this.renderdata.ri3 = 0;
/*  99 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 103 */     if (func_104002_bU()) return false; 
/* 104 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 112 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 113 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 118 */     return OreSpawnMain.Scorpion_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 125 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 130 */     this.renderdata.rf1 = r.rf1;
/* 131 */     this.renderdata.rf2 = r.rf2;
/* 132 */     this.renderdata.rf3 = r.rf3;
/* 133 */     this.renderdata.rf4 = r.rf4;
/* 134 */     this.renderdata.ri1 = r.ri1;
/* 135 */     this.renderdata.ri2 = r.ri2;
/* 136 */     this.renderdata.ri3 = r.ri3;
/* 137 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 145 */     return OreSpawnMain.Scorpion_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 153 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 162 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 171 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 179 */     return "orespawn:scorpion_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 187 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 194 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 201 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 210 */     int i = this.field_70170_p.field_73012_v.nextInt(10);
/* 211 */     if (i == 0) return Items.field_151074_bl; 
/* 212 */     if (i == 1) return OreSpawnMain.UraniumNugget; 
/* 213 */     if (i == 2) return OreSpawnMain.TitaniumNugget; 
/* 214 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 222 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 228 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 233 */     if (this.field_70128_L)
/* 234 */       return;  super.func_70619_bc();
/* 235 */     if (this.field_70170_p.field_73012_v.nextInt(6) == 0) {
/* 236 */       EntityLivingBase e = findSomethingToAttack();
/* 237 */       if (e != null) {
/* 238 */         if (func_70068_e((Entity)e) < 9.0D) {
/* 239 */           setAttacking(1);
/*     */           
/* 241 */           if (this.field_70170_p.field_73012_v.nextInt(5) == 0 || this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*     */             
/* 243 */             func_70652_k((Entity)e);
/* 244 */             if (!this.field_70170_p.field_72995_K && 
/* 245 */               this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 246 */               this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_attack", 0.75F, 1.5F);
/*     */             }
/*     */           } 
/*     */         } else {
/*     */           
/* 251 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/* 254 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 265 */     boolean ret = false;
/* 266 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 267 */       ret = super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 269 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 279 */     if (par1EntityLiving == null)
/*     */     {
/* 281 */       return false;
/*     */     }
/* 283 */     if (par1EntityLiving == this)
/*     */     {
/* 285 */       return false;
/*     */     }
/* 287 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 289 */       return false;
/*     */     }
/*     */     
/* 292 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 294 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 297 */       return false;
/*     */     }
/*     */     
/* 300 */     if (par1EntityLiving instanceof Ghost)
/*     */     {
/* 302 */       return false;
/*     */     }
/* 304 */     if (par1EntityLiving instanceof GhostSkelly)
/*     */     {
/* 306 */       return false;
/*     */     }
/*     */     
/* 309 */     if (par1EntityLiving instanceof VelocityRaptor)
/*     */     {
/* 311 */       return true;
/*     */     }
/* 313 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
/*     */     {
/* 315 */       return true;
/*     */     }
/* 317 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
/*     */     {
/* 319 */       return true;
/*     */     }
/* 321 */     if (par1EntityLiving instanceof Scorpion)
/*     */     {
/* 323 */       return false;
/*     */     }
/* 325 */     if (par1EntityLiving instanceof EmperorScorpion)
/*     */     {
/* 327 */       return false;
/*     */     }
/* 329 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */     {
/* 331 */       return true;
/*     */     }
/* 333 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 335 */       return false;
/*     */     }
/* 337 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 339 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 340 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 341 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 345 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 350 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 351 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(8.0D, 3.0D, 8.0D));
/* 352 */     Collections.sort(var5, this.TargetSorter);
/* 353 */     Iterator<?> var2 = var5.iterator();
/* 354 */     Entity var3 = null;
/* 355 */     EntityLivingBase var4 = null;
/*     */     
/* 357 */     while (var2.hasNext()) {
/*     */       
/* 359 */       var3 = (Entity)var2.next();
/* 360 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 362 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 364 */         return var4;
/*     */       }
/*     */     } 
/* 367 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 373 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 378 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 389 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 391 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 393 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 395 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 396 */           if (bid == Blocks.field_150474_ac) {
/* 397 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 398 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 399 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 400 */             if (s != null && 
/* 401 */               s.equals("Scorpion")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 409 */     if (!func_70814_o()) return false; 
/* 410 */     if (this.field_70170_p.func_72935_r() == true && this.field_70163_u > 50.0D) return false;
/*     */     
/* 412 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Scorpion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */