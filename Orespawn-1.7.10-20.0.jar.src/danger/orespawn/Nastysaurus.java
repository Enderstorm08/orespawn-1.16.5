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
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class Nastysaurus
/*     */   extends EntityMob
/*     */ {
/*  51 */   private GenericTargetSorter TargetSorter = null;
/*  52 */   private float moveSpeed = 0.35F;
/*  53 */   private RenderInfo renderdata = new RenderInfo();
/*  54 */   private EntityLivingBase rt = null;
/*     */ 
/*     */   
/*     */   public Nastysaurus(World par1World) {
/*  58 */     super(par1World);
/*  59 */     func_70105_a(2.2F, 4.6F);
/*  60 */     func_70661_as().func_75491_a(true);
/*  61 */     this.field_70728_aV = 40;
/*  62 */     this.field_70174_ab = 100;
/*  63 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  64 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  65 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  66 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
/*  67 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  68 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  69 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  74 */     super.func_110147_ax();
/*  75 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  76 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  77 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Nastysaurus_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  82 */     super.func_70088_a();
/*  83 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  84 */     if (this.renderdata == null) {
/*  85 */       this.renderdata = new RenderInfo();
/*     */     }
/*  87 */     this.renderdata.rf1 = 0.0F;
/*  88 */     this.renderdata.rf2 = 0.0F;
/*  89 */     this.renderdata.rf3 = 0.0F;
/*  90 */     this.renderdata.rf4 = 0.0F;
/*  91 */     this.renderdata.ri1 = 0;
/*  92 */     this.renderdata.ri2 = 0;
/*  93 */     this.renderdata.ri3 = 0;
/*  94 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 101 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 106 */     this.renderdata.rf1 = r.rf1;
/* 107 */     this.renderdata.rf2 = r.rf2;
/* 108 */     this.renderdata.rf3 = r.rf3;
/* 109 */     this.renderdata.rf4 = r.rf4;
/* 110 */     this.renderdata.ri1 = r.ri1;
/* 111 */     this.renderdata.ri2 = r.ri2;
/* 112 */     this.renderdata.ri3 = r.ri3;
/* 113 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 117 */     if (func_104002_bU()) return false; 
/* 118 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 126 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 127 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 132 */     return OreSpawnMain.Nastysaurus_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 140 */     return OreSpawnMain.Nastysaurus_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 148 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 157 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 166 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 167 */       return "orespawn:alo_living";
/*     */     }
/* 169 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 178 */     return "orespawn:alo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 186 */     return "orespawn:alo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 193 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 200 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 210 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 215 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 3.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
/*     */     
/* 217 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/*     */     int var4;
/* 224 */     for (var4 = 0; var4 < 10; var4++) {
/* 225 */       dropItemRand(Items.field_151042_j, 1);
/*     */     }
/* 227 */     for (var4 = 0; var4 < 10; var4++) {
/* 228 */       dropItemRand(Items.field_151078_bh, 1);
/*     */     }
/* 230 */     for (var4 = 0; var4 < 10; var4++) {
/* 231 */       dropItemRand(Items.field_151116_aA, 1);
/*     */     }
/* 233 */     for (var4 = 0; var4 < 10; var4++) {
/* 234 */       dropItemRand(Items.field_151007_F, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 251 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 258 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 260 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 262 */         double ks = 1.2D;
/* 263 */         double inair = 0.1D;
/* 264 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 265 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 266 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 268 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 272 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 281 */     boolean ret = false;
/*     */     
/* 283 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*     */       
/* 285 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 286 */       Entity e = par1DamageSource.func_76346_g();
/*     */       
/* 288 */       if (e != null && e instanceof EntityLivingBase) {
/* 289 */         this.rt = (EntityLivingBase)e;
/*     */       }
/*     */     } 
/* 292 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 297 */     if (this.field_70128_L)
/* 298 */       return;  super.func_70619_bc();
/* 299 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/* 300 */       EntityLivingBase e = null;
/* 301 */       e = this.rt;
/* 302 */       if (OreSpawnMain.PlayNicely != 0) e = null; 
/* 303 */       if (e != null) {
/* 304 */         if (e.field_70128_L || this.field_70170_p.field_73012_v.nextInt(250) == 1) {
/* 305 */           e = null;
/* 306 */           this.rt = null;
/*     */         } 
/* 308 */         if (e != null && 
/* 309 */           !func_70635_at().func_75522_a((Entity)e)) {
/* 310 */           e = null;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 315 */       if (e == null) {
/* 316 */         e = findSomethingToAttack();
/*     */       }
/* 318 */       if (e != null) {
/* 319 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 320 */         if (func_70068_e((Entity)e) < ((4.5F + e.field_70130_N / 2.0F) * (4.5F + e.field_70130_N / 2.0F))) {
/* 321 */           setAttacking(1);
/*     */           
/* 323 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 325 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 328 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*     */         } 
/*     */       } else {
/* 331 */         setAttacking(0);
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
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 344 */     if (par1EntityLiving == null)
/*     */     {
/* 346 */       return false;
/*     */     }
/* 348 */     if (par1EntityLiving == this)
/*     */     {
/* 350 */       return false;
/*     */     }
/* 352 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 354 */       return false;
/*     */     }
/*     */     
/* 357 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 359 */     if (par1EntityLiving instanceof Nastysaurus)
/*     */     {
/* 361 */       return false;
/*     */     }
/*     */     
/* 364 */     if (par1EntityLiving instanceof Cryolophosaurus)
/*     */     {
/* 366 */       return false;
/*     */     }
/*     */     
/* 369 */     if (par1EntityLiving instanceof VelocityRaptor)
/*     */     {
/* 371 */       return false;
/*     */     }
/*     */     
/* 374 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 377 */       return false;
/*     */     }
/*     */     
/* 380 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 382 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 383 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 384 */         return false;
/*     */       }
/* 386 */       return true;
/*     */     } 
/*     */     
/* 389 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 394 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 395 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(32.0D, 8.0D, 32.0D));
/* 396 */     Collections.sort(var5, this.TargetSorter);
/* 397 */     Iterator<?> var2 = var5.iterator();
/* 398 */     Entity var3 = null;
/* 399 */     EntityLivingBase var4 = null;
/*     */     
/* 401 */     while (var2.hasNext()) {
/*     */       
/* 403 */       var3 = (Entity)var2.next();
/* 404 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 406 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 408 */         return var4;
/*     */       }
/*     */     } 
/* 411 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getAttacking() {
/* 416 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttacking(int par1) {
/* 421 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/*     */     int k;
/* 433 */     for (k = -3; k < 3; k++) {
/*     */       
/* 435 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 437 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 439 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 440 */           if (bid == Blocks.field_150474_ac) {
/* 441 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 442 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 443 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 444 */             if (s != null && 
/* 445 */               s.equals("Nastysaurus")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 451 */     if (!func_70814_o()) return false; 
/* 452 */     if (this.field_70163_u < 50.0D) return false; 
/* 453 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 457 */     for (k = -1; k < 1; k++) {
/*     */       
/* 459 */       for (int j = -1; j < 1; j++) {
/*     */         
/* 461 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 463 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 464 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 470 */     Nastysaurus target = null;
/* 471 */     target = (Nastysaurus)this.field_70170_p.func_72857_a(Nastysaurus.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D), (Entity)this);
/* 472 */     if (target != null)
/*     */     {
/* 474 */       return false;
/*     */     }
/* 476 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Nastysaurus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */