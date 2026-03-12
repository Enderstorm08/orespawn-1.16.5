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
/*     */ 
/*     */ public class CaveFisher
/*     */   extends EntityMob
/*     */ {
/*  56 */   private GenericTargetSorter TargetSorter = null;
/*  57 */   private RenderInfo renderdata = new RenderInfo();
/*  58 */   private float moveSpeed = 0.2F;
/*     */ 
/*     */ 
/*     */   
/*     */   public CaveFisher(World par1World) {
/*  63 */     super(par1World);
/*  64 */     func_70105_a(1.35F, 0.75F);
/*  65 */     func_70661_as().func_75491_a(false);
/*  66 */     this.field_70728_aV = 10;
/*  67 */     this.field_70174_ab = 10;
/*  68 */     this.field_70178_ae = false;
/*  69 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  70 */     this.renderdata = new RenderInfo();
/*  71 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  72 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  73 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  74 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  75 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  80 */     super.func_110147_ax();
/*  81 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  82 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  83 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.CaveFisher_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  88 */     super.func_70088_a();
/*  89 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  90 */     if (this.renderdata == null) {
/*  91 */       this.renderdata = new RenderInfo();
/*     */     }
/*  93 */     this.renderdata.rf1 = 0.0F;
/*  94 */     this.renderdata.rf2 = 0.0F;
/*  95 */     this.renderdata.rf3 = 0.0F;
/*  96 */     this.renderdata.rf4 = 0.0F;
/*  97 */     this.renderdata.ri1 = 0;
/*  98 */     this.renderdata.ri2 = 0;
/*  99 */     this.renderdata.ri3 = 0;
/* 100 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 104 */     if (func_104002_bU()) return false; 
/* 105 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 114 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 115 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 120 */     return OreSpawnMain.CaveFisher_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 127 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 132 */     this.renderdata.rf1 = r.rf1;
/* 133 */     this.renderdata.rf2 = r.rf2;
/* 134 */     this.renderdata.rf3 = r.rf3;
/* 135 */     this.renderdata.rf4 = r.rf4;
/* 136 */     this.renderdata.ri1 = r.ri1;
/* 137 */     this.renderdata.ri2 = r.ri2;
/* 138 */     this.renderdata.ri3 = r.ri3;
/* 139 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 147 */     return OreSpawnMain.CaveFisher_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 155 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 164 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 173 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 181 */     return "orespawn:cryo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 189 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 196 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 203 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 212 */     int i = this.field_70170_p.field_73012_v.nextInt(6);
/* 213 */     if (i == 0) return Items.field_151074_bl; 
/* 214 */     if (i == 1) return OreSpawnMain.UraniumNugget; 
/* 215 */     if (i == 2) return OreSpawnMain.TitaniumNugget; 
/* 216 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 224 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 229 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 234 */     if (this.field_70128_L)
/* 235 */       return;  super.func_70619_bc();
/* 236 */     if (this.field_70170_p.field_73012_v.nextInt(8) == 0) {
/* 237 */       EntityLivingBase e = findSomethingToAttack();
/* 238 */       if (e != null) {
/* 239 */         if (func_70068_e((Entity)e) < 8.0D) {
/* 240 */           setAttacking(1);
/*     */           
/* 242 */           if (this.field_70170_p.field_73012_v.nextInt(7) == 0 || this.field_70170_p.field_73012_v.nextInt(8) == 1)
/*     */           {
/* 244 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 247 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/* 250 */         setAttacking(0);
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
/* 261 */     boolean ret = false;
/* 262 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 263 */       ret = super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 265 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 275 */     if (par1EntityLiving == null)
/*     */     {
/* 277 */       return false;
/*     */     }
/* 279 */     if (par1EntityLiving == this)
/*     */     {
/* 281 */       return false;
/*     */     }
/* 283 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 285 */       return false;
/*     */     }
/* 287 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false; 
/* 288 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 291 */       return false;
/*     */     }
/* 293 */     if (par1EntityLiving instanceof CaveFisher)
/*     */     {
/* 295 */       return false;
/*     */     }
/* 297 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 299 */       return false;
/*     */     }
/* 301 */     if (par1EntityLiving instanceof EnderKnight)
/*     */     {
/* 303 */       return false;
/*     */     }
/* 305 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 307 */       return false;
/*     */     }
/* 309 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 311 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 312 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 313 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 317 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 322 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 323 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 3.0D, 10.0D));
/* 324 */     Collections.sort(var5, this.TargetSorter);
/* 325 */     Iterator<?> var2 = var5.iterator();
/* 326 */     Entity var3 = null;
/* 327 */     EntityLivingBase var4 = null;
/*     */     
/* 329 */     while (var2.hasNext()) {
/*     */       
/* 331 */       var3 = (Entity)var2.next();
/* 332 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 334 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 336 */         return var4;
/*     */       }
/*     */     } 
/* 339 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 345 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 350 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 360 */     int sc = 0;
/*     */     
/* 362 */     for (int k = -2; k < 2; k++) {
/*     */       
/* 364 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 366 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 368 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 369 */           if (bid == Blocks.field_150474_ac) {
/* 370 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 371 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 372 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 373 */             if (s != null && 
/* 374 */               s.equals("CaveFisher")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 380 */     if (!func_70814_o()) return false; 
/* 381 */     if (this.field_70163_u > 50.0D) return false; 
/* 382 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CaveFisher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */