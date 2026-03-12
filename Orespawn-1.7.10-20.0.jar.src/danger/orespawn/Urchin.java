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
/*     */ public class Urchin
/*     */   extends EntityMob
/*     */ {
/*  54 */   private GenericTargetSorter TargetSorter = null;
/*  55 */   private RenderInfo renderdata = new RenderInfo();
/*  56 */   private float moveSpeed = 0.3F;
/*  57 */   private int was_spawnered = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   public Urchin(World par1World) {
/*  62 */     super(par1World);
/*  63 */     func_70105_a(1.35F, 2.1F);
/*  64 */     func_70661_as().func_75491_a(true);
/*  65 */     this.field_70728_aV = 20;
/*  66 */     this.field_70174_ab = 1000;
/*  67 */     this.field_70178_ae = true;
/*  68 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  69 */     this.renderdata = new RenderInfo();
/*  70 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  71 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  72 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  73 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  74 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  79 */     super.func_110147_ax();
/*  80 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  81 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  82 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Urchin_stats.attack);
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
/* 104 */     if (this.was_spawnered != 0) return false; 
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
/*     */     
/* 117 */     if (func_104002_bU())
/* 118 */       return;  if (this.was_spawnered != 0)
/* 119 */       return;  long t = this.field_70170_p.func_72820_D();
/* 120 */     t %= 24000L;
/* 121 */     if (t < 12000L && this.field_70170_p.field_73012_v.nextInt(400) == 1) func_70106_y();
/*     */   
/*     */   }
/*     */   
/*     */   public int mygetMaxHealth() {
/* 126 */     return OreSpawnMain.Urchin_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 133 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 138 */     this.renderdata.rf1 = r.rf1;
/* 139 */     this.renderdata.rf2 = r.rf2;
/* 140 */     this.renderdata.rf3 = r.rf3;
/* 141 */     this.renderdata.rf4 = r.rf4;
/* 142 */     this.renderdata.ri1 = r.ri1;
/* 143 */     this.renderdata.ri2 = r.ri2;
/* 144 */     this.renderdata.ri3 = r.ri3;
/* 145 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 153 */     return OreSpawnMain.Urchin_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 161 */     return true;
/*     */   }
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
/*     */   public void func_70636_d() {
/* 174 */     super.func_70636_d();
/* 175 */     if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 176 */       this.field_70170_p.func_72869_a("flame", this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v, 0.0D, (this.field_70170_p.field_73012_v.nextFloat() / 10.0F), 0.0D);
/* 177 */       if (func_70090_H() && this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 178 */         func_70652_k((Entity)this);
/* 179 */         this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u + 1.75D, this.field_70161_v, 0.0D, (this.field_70170_p.field_73012_v.nextFloat() / 10.0F), 0.0D);
/* 180 */         this.field_70170_p.func_72869_a("largesmoke", this.field_70165_t, this.field_70163_u + 1.75D, this.field_70161_v, 0.0D, (this.field_70170_p.field_73012_v.nextFloat() / 10.0F), 0.0D);
/* 181 */         this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u + 2.0D, this.field_70161_v, 0.0D, (this.field_70170_p.field_73012_v.nextFloat() / 10.0F), 0.0D);
/* 182 */         this.field_70170_p.func_72869_a("largesmoke", this.field_70165_t, this.field_70163_u + 2.0D, this.field_70161_v, 0.0D, (this.field_70170_p.field_73012_v.nextFloat() / 10.0F), 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 193 */     return "orespawn:kyuubi_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 201 */     return "orespawn:glasshit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 209 */     return "orespawn:glassdead";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 216 */     return 1.1F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 223 */     return 1.25F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 232 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 233 */     if (i == 1) return OreSpawnMain.MyCrystalPinkIngot; 
/* 234 */     if (i == 2) return OreSpawnMain.MyCrystalApple; 
/* 235 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 243 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 248 */     par1Entity.func_70015_d(5);
/* 249 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 254 */     if (this.field_70128_L)
/* 255 */       return;  super.func_70619_bc();
/* 256 */     if (this.field_70170_p.field_73012_v.nextInt(8) == 0) {
/* 257 */       EntityLivingBase e = findSomethingToAttack();
/* 258 */       if (e != null) {
/* 259 */         if (func_70068_e((Entity)e) < 8.0D) {
/* 260 */           setAttacking(1);
/*     */           
/* 262 */           if (this.field_70170_p.field_73012_v.nextInt(7) == 0 || this.field_70170_p.field_73012_v.nextInt(8) == 1)
/*     */           {
/* 264 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 267 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/* 270 */         setAttacking(0);
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
/* 281 */     boolean ret = false;
/* 282 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 283 */       ret = super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 285 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 295 */     if (par1EntityLiving == null)
/*     */     {
/* 297 */       return false;
/*     */     }
/* 299 */     if (par1EntityLiving == this)
/*     */     {
/* 301 */       return false;
/*     */     }
/* 303 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 305 */       return false;
/*     */     }
/*     */     
/* 308 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 310 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 313 */       return false;
/*     */     }
/*     */     
/* 316 */     if (par1EntityLiving instanceof Vortex)
/*     */     {
/* 318 */       return false;
/*     */     }
/* 320 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 322 */       return false;
/*     */     }
/* 324 */     if (par1EntityLiving instanceof Peacock)
/*     */     {
/* 326 */       return false;
/*     */     }
/* 328 */     if (par1EntityLiving instanceof CrystalCow)
/*     */     {
/* 330 */       return false;
/*     */     }
/* 332 */     if (par1EntityLiving instanceof Irukandji)
/*     */     {
/* 334 */       return false;
/*     */     }
/* 336 */     if (par1EntityLiving instanceof Skate)
/*     */     {
/* 338 */       return false;
/*     */     }
/* 340 */     if (par1EntityLiving instanceof Whale)
/*     */     {
/* 342 */       return false;
/*     */     }
/* 344 */     if (par1EntityLiving instanceof Flounder)
/*     */     {
/* 346 */       return false;
/*     */     }
/* 348 */     if (par1EntityLiving instanceof Urchin)
/*     */     {
/* 350 */       return false;
/*     */     }
/* 352 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 354 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 355 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 356 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 360 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 365 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 366 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 3.0D, 16.0D));
/* 367 */     Collections.sort(var5, this.TargetSorter);
/* 368 */     Iterator<?> var2 = var5.iterator();
/* 369 */     Entity var3 = null;
/* 370 */     EntityLivingBase var4 = null;
/*     */     
/* 372 */     while (var2.hasNext()) {
/*     */       
/* 374 */       var3 = (Entity)var2.next();
/* 375 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 377 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 379 */         return var4;
/*     */       }
/*     */     } 
/* 382 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 388 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 393 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 403 */     int sc = 0;
/*     */     int k;
/* 405 */     for (k = -2; k <= 2; k++) {
/*     */       
/* 407 */       for (int j = -2; j <= 2; j++) {
/*     */         
/* 409 */         for (int i = 1; i < 4; i++) {
/*     */           
/* 411 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 412 */           if (bid == Blocks.field_150474_ac) {
/* 413 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 414 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 415 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 416 */             if (s != null && 
/* 417 */               s.equals("Crystal Urchin")) {
/* 418 */               this.was_spawnered = 1;
/* 419 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 427 */     for (k = -1; k <= 1; k++) {
/*     */       
/* 429 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 431 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + 1, (int)this.field_70161_v + k);
/* 432 */         if (bid == Blocks.field_150350_a) sc++; 
/*     */       } 
/*     */     } 
/* 435 */     if (sc < 6) return false; 
/* 436 */     if (!func_70814_o()) return false; 
/* 437 */     long t = this.field_70170_p.func_72820_D();
/* 438 */     t %= 24000L;
/* 439 */     if (t < 13000L) return false;
/*     */     
/* 441 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Urchin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */