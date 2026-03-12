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
/*     */ public class TRex
/*     */   extends EntityMob
/*     */ {
/*  51 */   private GenericTargetSorter TargetSorter = null;
/*  52 */   private float moveSpeed = 0.38F;
/*  53 */   private EntityLivingBase rt = null;
/*     */ 
/*     */   
/*     */   public TRex(World par1World) {
/*  57 */     super(par1World);
/*  58 */     func_70105_a(2.0F, 4.2F);
/*  59 */     func_70661_as().func_75491_a(true);
/*  60 */     this.field_70728_aV = 150;
/*  61 */     this.field_70174_ab = 100;
/*  62 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  63 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  64 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  65 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
/*  66 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  67 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  68 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  73 */     super.func_110147_ax();
/*  74 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  75 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  76 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.TRex_stats.attack);
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
/* 101 */     return OreSpawnMain.TRex_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 109 */     return OreSpawnMain.TRex_stats.defense;
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
/* 135 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 136 */       return "orespawn:trex_living";
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
/* 155 */     return "orespawn:trex_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 162 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 169 */     return 1.0F;
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
/* 184 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
/*     */     
/* 186 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 193 */     dropItemRand(OreSpawnMain.TRexTooth, 1);
/* 194 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     int var4;
/* 196 */     for (var4 = 0; var4 < 7; var4++) {
/* 197 */       dropItemRand(Items.field_151082_bd, 1);
/*     */     }
/* 199 */     var4 = 2 + this.field_70170_p.field_73012_v.nextInt(4);
/* 200 */     for (int i = 0; i < var4; i++) {
/* 201 */       dropItemRand(OreSpawnMain.UraniumNugget, 1);
/* 202 */       dropItemRand(OreSpawnMain.TitaniumNugget, 1);
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 218 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 225 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 227 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 229 */         double ks = 1.2D;
/* 230 */         double inair = 0.1D;
/* 231 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 232 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 233 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 235 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 239 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 248 */     boolean ret = false;
/*     */     
/* 250 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*     */       
/* 252 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 253 */       Entity e = par1DamageSource.func_76346_g();
/*     */       
/* 255 */       if (e != null && e instanceof EntityLivingBase) {
/* 256 */         this.rt = (EntityLivingBase)e;
/*     */       }
/*     */     } 
/* 259 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 264 */     if (this.field_70128_L)
/* 265 */       return;  super.func_70619_bc();
/* 266 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 267 */       EntityLivingBase e = null;
/* 268 */       e = this.rt;
/* 269 */       if (OreSpawnMain.PlayNicely != 0) e = null; 
/* 270 */       if (e != null) {
/* 271 */         if (e.field_70128_L || this.field_70170_p.field_73012_v.nextInt(200) == 1) {
/* 272 */           e = null;
/* 273 */           this.rt = null;
/*     */         } 
/* 275 */         if (e != null && 
/* 276 */           !func_70635_at().func_75522_a((Entity)e)) {
/* 277 */           e = null;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 282 */       if (e == null) {
/* 283 */         e = findSomethingToAttack();
/*     */       }
/* 285 */       if (e != null) {
/* 286 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 287 */         if (func_70068_e((Entity)e) < ((4.0F + e.field_70130_N / 2.0F) * (4.0F + e.field_70130_N / 2.0F))) {
/* 288 */           setAttacking(1);
/*     */           
/* 290 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 292 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 295 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*     */         } 
/*     */       } else {
/* 298 */         setAttacking(0);
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
/* 311 */     if (par1EntityLiving == null)
/*     */     {
/* 313 */       return false;
/*     */     }
/* 315 */     if (par1EntityLiving == this)
/*     */     {
/* 317 */       return false;
/*     */     }
/* 319 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 321 */       return false;
/*     */     }
/*     */     
/* 324 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 326 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 329 */       return false;
/*     */     }
/* 331 */     if (par1EntityLiving instanceof TRex)
/*     */     {
/* 333 */       return false;
/*     */     }
/* 335 */     if (par1EntityLiving instanceof Cryolophosaurus)
/*     */     {
/* 337 */       return false;
/*     */     }
/*     */     
/* 340 */     if (par1EntityLiving instanceof VelocityRaptor)
/*     */     {
/* 342 */       return false;
/*     */     }
/* 344 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 346 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 347 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 348 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 352 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 357 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 358 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(20.0D, 6.0D, 20.0D));
/* 359 */     Collections.sort(var5, this.TargetSorter);
/* 360 */     Iterator<?> var2 = var5.iterator();
/* 361 */     Entity var3 = null;
/* 362 */     EntityLivingBase var4 = null;
/*     */     
/* 364 */     while (var2.hasNext()) {
/*     */       
/* 366 */       var3 = (Entity)var2.next();
/* 367 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 369 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 371 */         return var4;
/*     */       }
/*     */     } 
/* 374 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 379 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 384 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/*     */     int k;
/* 395 */     for (k = -3; k < 3; k++) {
/*     */       
/* 397 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 399 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 401 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 402 */           if (bid == Blocks.field_150474_ac) {
/* 403 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 404 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 405 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 406 */             if (s != null && 
/* 407 */               s.equals("T. Rex")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 413 */     if (!func_70814_o()) return false; 
/* 414 */     if (this.field_70163_u < 50.0D) return false; 
/* 415 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 419 */     for (k = -1; k <= 1; k++) {
/*     */       
/* 421 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 423 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 425 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 426 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 432 */     TRex target = null;
/* 433 */     target = (TRex)this.field_70170_p.func_72857_a(TRex.class, this.field_70121_D.func_72314_b(24.0D, 12.0D, 24.0D), (Entity)this);
/* 434 */     if (target != null)
/*     */     {
/* 436 */       return false;
/*     */     }
/* 438 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\TRex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */