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
/*     */ public class DungeonBeast
/*     */   extends EntityMob
/*     */ {
/*  54 */   private GenericTargetSorter TargetSorter = null;
/*  55 */   private RenderInfo renderdata = new RenderInfo();
/*  56 */   private float moveSpeed = 0.29F;
/*     */ 
/*     */ 
/*     */   
/*     */   public DungeonBeast(World par1World) {
/*  61 */     super(par1World);
/*  62 */     func_70105_a(1.15F, 1.1F);
/*  63 */     func_70661_as().func_75491_a(true);
/*  64 */     this.field_70728_aV = 60;
/*  65 */     this.field_70174_ab = 10;
/*  66 */     this.field_70178_ae = false;
/*  67 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  68 */     this.renderdata = new RenderInfo();
/*  69 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  70 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  71 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  72 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  73 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  78 */     super.func_110147_ax();
/*  79 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  80 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  81 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.DungeonBeast_stats.attack);
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
/*     */   
/*     */   public void func_70071_h_() {
/* 112 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 113 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 118 */     return OreSpawnMain.DungeonBeast_stats.health;
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
/* 145 */     return OreSpawnMain.DungeonBeast_stats.defense;
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
/* 179 */     return "orespawn:dbhit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 187 */     return "orespawn:dbdead";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 194 */     return 0.8F;
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
/* 210 */     int i = this.field_70170_p.field_73012_v.nextInt(4);
/* 211 */     if (i == 1) return OreSpawnMain.MyCrystalPinkIngot; 
/* 212 */     if (i == 2) return OreSpawnMain.MyCrystalApple; 
/* 213 */     if (i == 3) return Item.func_150898_a(Blocks.field_150364_r); 
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
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 227 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 232 */     if (this.field_70128_L)
/* 233 */       return;  super.func_70619_bc();
/* 234 */     if (this.field_70170_p.field_73012_v.nextInt(8) == 0) {
/* 235 */       EntityLivingBase e = findSomethingToAttack();
/* 236 */       if (e != null) {
/* 237 */         if (func_70068_e((Entity)e) < 8.0D) {
/* 238 */           setAttacking(1);
/*     */           
/* 240 */           if (this.field_70170_p.field_73012_v.nextInt(7) == 0 || this.field_70170_p.field_73012_v.nextInt(8) == 1)
/*     */           {
/* 242 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 245 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/* 248 */         setAttacking(0);
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
/* 259 */     boolean ret = false;
/* 260 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 261 */       return ret;
/*     */     }
/* 263 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 264 */       ret = super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 266 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 276 */     if (par1EntityLiving == null)
/*     */     {
/* 278 */       return false;
/*     */     }
/* 280 */     if (par1EntityLiving == this)
/*     */     {
/* 282 */       return false;
/*     */     }
/* 284 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 286 */       return false;
/*     */     }
/* 288 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 290 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 293 */       return false;
/*     */     }
/*     */     
/* 296 */     if (par1EntityLiving instanceof Rat)
/*     */     {
/* 298 */       return false;
/*     */     }
/* 300 */     if (par1EntityLiving instanceof DungeonBeast)
/*     */     {
/* 302 */       return false;
/*     */     }
/* 304 */     if (par1EntityLiving instanceof Rotator)
/*     */     {
/* 306 */       return false;
/*     */     }
/* 308 */     if (par1EntityLiving instanceof Peacock)
/*     */     {
/* 310 */       return false;
/*     */     }
/* 312 */     if (par1EntityLiving instanceof Irukandji)
/*     */     {
/* 314 */       return false;
/*     */     }
/* 316 */     if (par1EntityLiving instanceof Skate)
/*     */     {
/* 318 */       return false;
/*     */     }
/* 320 */     if (par1EntityLiving instanceof Whale)
/*     */     {
/* 322 */       return false;
/*     */     }
/* 324 */     if (par1EntityLiving instanceof Flounder)
/*     */     {
/* 326 */       return false;
/*     */     }
/*     */     
/* 329 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 331 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 332 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 333 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 337 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 342 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 343 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 3.0D, 16.0D));
/* 344 */     Collections.sort(var5, this.TargetSorter);
/* 345 */     Iterator<?> var2 = var5.iterator();
/* 346 */     Entity var3 = null;
/* 347 */     EntityLivingBase var4 = null;
/*     */     
/* 349 */     while (var2.hasNext()) {
/*     */       
/* 351 */       var3 = (Entity)var2.next();
/* 352 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 354 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 356 */         return var4;
/*     */       }
/*     */     } 
/* 359 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 365 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 370 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 381 */     int sc = 0;
/*     */     int k;
/* 383 */     for (k = -3; k < 3; k++) {
/*     */       
/* 385 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 387 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 389 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 390 */           if (bid == Blocks.field_150474_ac) {
/* 391 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 392 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 393 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 394 */             if (s != null && 
/* 395 */               s.equals("Dungeon Beast")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 403 */     if (!func_70814_o()) return false; 
/* 404 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID5) {
/* 405 */       if (this.field_70163_u > 28.0D || this.field_70163_u < 25.0D) return false;
/*     */       
/* 407 */       for (k = -1; k <= 1; k++) {
/*     */         
/* 409 */         for (int j = -1; j <= 1; j++) {
/*     */           
/* 411 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + 1, (int)this.field_70161_v + k);
/* 412 */           if (bid == Blocks.field_150350_a) sc++; 
/*     */         } 
/*     */       } 
/* 415 */       if (sc < 6) return false;
/*     */     
/*     */     } 
/* 418 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\DungeonBeast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */