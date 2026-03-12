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
/*     */ public class Alosaurus
/*     */   extends EntityMob
/*     */ {
/*  52 */   private GenericTargetSorter TargetSorter = null;
/*  53 */   private float moveSpeed = 0.35F;
/*     */ 
/*     */   
/*     */   public Alosaurus(World par1World) {
/*  57 */     super(par1World);
/*  58 */     func_70105_a(1.9F, 3.6F);
/*  59 */     func_70661_as().func_75491_a(true);
/*  60 */     this.field_70728_aV = 40;
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
/*  76 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Alosaurus_stats.attack);
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
/* 101 */     return OreSpawnMain.Alosaurus_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 109 */     return OreSpawnMain.Alosaurus_stats.defense;
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
/* 136 */       return "orespawn:alo_living";
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
/* 155 */     return "orespawn:alo_death";
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
/*     */   
/*     */   protected Item func_146068_u() {
/* 180 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 185 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
/*     */     
/* 187 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/*     */     int var4;
/* 194 */     for (var4 = 0; var4 < 10; var4++) {
/* 195 */       dropItemRand(Items.field_151074_bl, 1);
/*     */     }
/* 197 */     for (var4 = 0; var4 < 6; var4++) {
/* 198 */       dropItemRand(Items.field_151082_bd, 1);
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
/* 215 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 222 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 224 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 226 */         double ks = 1.2D;
/* 227 */         double inair = 0.1D;
/* 228 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 229 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 230 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 232 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 236 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 242 */     if (this.field_70128_L)
/* 243 */       return;  super.func_70619_bc();
/* 244 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/* 245 */       EntityLivingBase e = findSomethingToAttack();
/* 246 */       if (e != null) {
/* 247 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 248 */         if (func_70068_e((Entity)e) < ((4.0F + e.field_70130_N / 2.0F) * (4.0F + e.field_70130_N / 2.0F))) {
/* 249 */           setAttacking(1);
/*     */           
/* 251 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(5) == 1)
/*     */           {
/* 253 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 256 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*     */         } 
/*     */       } else {
/* 259 */         setAttacking(0);
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
/* 272 */     if (par1EntityLiving == null)
/*     */     {
/* 274 */       return false;
/*     */     }
/* 276 */     if (par1EntityLiving == this)
/*     */     {
/* 278 */       return false;
/*     */     }
/* 280 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 282 */       return false;
/*     */     }
/*     */     
/* 285 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 287 */     if (par1EntityLiving instanceof Alosaurus)
/*     */     {
/* 289 */       return false;
/*     */     }
/*     */     
/* 292 */     if (par1EntityLiving instanceof Cryolophosaurus)
/*     */     {
/* 294 */       return false;
/*     */     }
/*     */     
/* 297 */     if (par1EntityLiving instanceof VelocityRaptor)
/*     */     {
/* 299 */       return false;
/*     */     }
/*     */     
/* 302 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 305 */       return false;
/*     */     }
/*     */     
/* 308 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 310 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 311 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 312 */         return false;
/*     */       }
/* 314 */       return true;
/*     */     } 
/*     */     
/* 317 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 322 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 323 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 5.0D, 12.0D));
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
/*     */   public int getAttacking() {
/* 344 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttacking(int par1) {
/* 349 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 361 */     for (k = -3; k < 3; k++) {
/*     */       
/* 363 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 365 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 367 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 368 */           if (bid == Blocks.field_150474_ac) {
/* 369 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 370 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 371 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 372 */             if (s != null && 
/* 373 */               s.equals("Alosaurus")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 379 */     if (!func_70814_o()) return false; 
/* 380 */     if (this.field_70163_u < 50.0D) return false; 
/* 381 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 385 */     for (k = -1; k < 1; k++) {
/*     */       
/* 387 */       for (int j = -1; j < 1; j++) {
/*     */         
/* 389 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 391 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 392 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 398 */     Alosaurus target = null;
/* 399 */     target = (Alosaurus)this.field_70170_p.func_72857_a(Alosaurus.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D), (Entity)this);
/* 400 */     if (target != null)
/*     */     {
/* 402 */       return false;
/*     */     }
/* 404 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Alosaurus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */