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
/*     */ public class Hammerhead
/*     */   extends EntityMob
/*     */ {
/*  51 */   private GenericTargetSorter TargetSorter = null;
/*  52 */   private float moveSpeed = 0.35F;
/*  53 */   private EntityLivingBase rt = null;
/*     */ 
/*     */   
/*     */   public Hammerhead(World par1World) {
/*  57 */     super(par1World);
/*  58 */     func_70105_a(3.0F, 5.0F);
/*  59 */     func_70661_as().func_75491_a(true);
/*  60 */     this.field_70728_aV = 350;
/*  61 */     this.field_70174_ab = 100;
/*  62 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  63 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  64 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  65 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
/*  66 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F));
/*  67 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  68 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  73 */     super.func_110147_ax();
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  75 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  76 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Hammerhead_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  81 */     super.func_70088_a();
/*  82 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  86 */     if (func_104002_bU()) return false; 
/*  87 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  95 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  96 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 101 */     return OreSpawnMain.Hammerhead_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 109 */     return OreSpawnMain.Hammerhead_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 117 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 126 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 135 */     if (this.field_70146_Z.nextInt(3) == 0) {
/* 136 */       return "orespawn:hammerhead_living";
/*     */     }
/* 138 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 147 */     return "orespawn:alo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 155 */     return "orespawn:hammerhead_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 162 */     return 1.2F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 169 */     return 0.9F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 179 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 184 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 2.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), new ItemStack(index, par1, 0));
/*     */     
/* 186 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/*     */     int var4;
/* 193 */     for (var4 = 0; var4 < 8; var4++) {
/* 194 */       dropItemRand(Items.field_151062_by, 1);
/*     */     }
/* 196 */     for (var4 = 0; var4 < 10; var4++) {
/* 197 */       dropItemRand(OreSpawnMain.MyExperienceCatcher, 1);
/*     */     }
/* 199 */     for (var4 = 0; var4 < 16; var4++) {
/* 200 */       dropItemRand(OreSpawnMain.CreeperLauncher, 1);
/*     */     }
/* 202 */     for (var4 = 0; var4 < 4; var4++) {
/* 203 */       dropItemRand(Item.func_150898_a(OreSpawnMain.CreeperRepellent), 1);
/*     */     }
/* 205 */     for (var4 = 0; var4 < 6; var4++) {
/* 206 */       dropItemRand(Items.field_151082_bd, 1);
/*     */     }
/* 208 */     for (var4 = 0; var4 < 2; var4++) {
/* 209 */       dropItemRand(OreSpawnMain.MyExperienceTreeSeed, 1);
/*     */     }
/* 211 */     if (this.field_70170_p.field_73012_v.nextInt(3) == 1) dropItemRand(OreSpawnMain.MyHammy, 1);
/*     */   
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 227 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 234 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 236 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 238 */         double ks = 1.1D;
/* 239 */         double inair = 0.85D;
/* 240 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 241 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 242 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 244 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 248 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 257 */     boolean ret = false;
/*     */     
/* 259 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*     */       
/* 261 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 262 */       Entity e = par1DamageSource.func_76346_g();
/*     */       
/* 264 */       if (e != null && e instanceof EntityLivingBase) {
/* 265 */         this.rt = (EntityLivingBase)e;
/*     */       }
/*     */     } 
/* 268 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 273 */     if (this.field_70128_L)
/* 274 */       return;  super.func_70619_bc();
/* 275 */     if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 276 */       EntityLivingBase e = null;
/* 277 */       e = this.rt;
/* 278 */       if (OreSpawnMain.PlayNicely != 0) e = null; 
/* 279 */       if (e != null) {
/* 280 */         if (e.field_70128_L || this.field_70170_p.field_73012_v.nextInt(250) == 1) {
/* 281 */           e = null;
/* 282 */           this.rt = null;
/*     */         } 
/* 284 */         if (e != null && 
/* 285 */           !func_70635_at().func_75522_a((Entity)e)) {
/* 286 */           e = null;
/*     */         }
/*     */       } 
/*     */       
/* 290 */       if (e == null) e = findSomethingToAttack(); 
/* 291 */       if (e != null) {
/* 292 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 293 */         if (func_70068_e((Entity)e) < ((7.0F + e.field_70130_N / 2.0F) * (7.0F + e.field_70130_N / 2.0F))) {
/* 294 */           setAttacking(1);
/*     */           
/* 296 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 1 || this.field_70170_p.field_73012_v.nextInt(4) == 1)
/*     */           {
/* 298 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 301 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*     */         } 
/*     */       } else {
/* 304 */         setAttacking(0);
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
/* 317 */     if (par1EntityLiving == null)
/*     */     {
/* 319 */       return false;
/*     */     }
/* 321 */     if (par1EntityLiving == this)
/*     */     {
/* 323 */       return false;
/*     */     }
/* 325 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 327 */       return false;
/*     */     }
/* 329 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 332 */       return false;
/*     */     }
/* 334 */     if (par1EntityLiving instanceof Hammerhead)
/*     */     {
/* 336 */       return false;
/*     */     }
/* 338 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 340 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 341 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 342 */         return false;
/*     */       }
/* 344 */       return true;
/*     */     } 
/* 346 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 348 */       return true;
/*     */     }
/* 350 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 351 */       return true;
/*     */     }
/*     */     
/* 354 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 359 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 360 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(18.0D, 9.0D, 18.0D));
/* 361 */     Collections.sort(var5, this.TargetSorter);
/* 362 */     Iterator<?> var2 = var5.iterator();
/* 363 */     Entity var3 = null;
/* 364 */     EntityLivingBase var4 = null;
/*     */     
/* 366 */     while (var2.hasNext()) {
/*     */       
/* 368 */       var3 = (Entity)var2.next();
/* 369 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 371 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 373 */         return var4;
/*     */       }
/*     */     } 
/* 376 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 381 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 386 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 398 */     for (k = -3; k < 3; k++) {
/*     */       
/* 400 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 402 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 404 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 405 */           if (bid == Blocks.field_150474_ac) {
/* 406 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 407 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 408 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 409 */             if (s != null && 
/* 410 */               s.equals("Hammerhead")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 416 */     if (!func_70814_o()) return false; 
/* 417 */     if (this.field_70163_u < 50.0D) return false; 
/* 418 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 422 */     for (k = -1; k < 1; k++) {
/*     */       
/* 424 */       for (int j = -1; j < 1; j++) {
/*     */         
/* 426 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 428 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 429 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 435 */     Hammerhead target = null;
/* 436 */     target = (Hammerhead)this.field_70170_p.func_72857_a(Hammerhead.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D), (Entity)this);
/* 437 */     if (target != null)
/*     */     {
/* 439 */       return false;
/*     */     }
/* 441 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Hammerhead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */