/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.EnumDifficulty;
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
/*     */ public class Frog
/*     */   extends EntityAnimal
/*     */ {
/*  40 */   private GenericTargetSorter TargetSorter = null;
/*  41 */   public double moveSpeed = 0.10000000149011612D;
/*  42 */   private int singing = 0;
/*  43 */   private int jumpcount = 0;
/*     */   
/*     */   public Frog(World par1World) {
/*  46 */     super(par1World);
/*  47 */     func_70105_a(0.75F, 0.75F);
/*  48 */     this.field_70728_aV = 5;
/*  49 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  50 */     func_70661_as().func_75491_a(false);
/*  51 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  52 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4D));
/*  53 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWander((EntityCreature)this, 1.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  58 */     super.func_110147_ax();
/*  59 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  60 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  61 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  62 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  67 */     super.func_70088_a();
/*  68 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/*  74 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  78 */     if (func_104002_bU()) return false; 
/*  79 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSinging() {
/*  84 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSinging(int par1) {
/*  89 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jumpAround() {
/*  95 */     this.field_70181_x += (0.75F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.55F));
/*  96 */     this.field_70163_u += 0.3499999940395355D;
/*  97 */     float f = 0.7F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.75F);
/*  98 */     float d = (float)Math.toRadians(this.field_70177_z);
/*  99 */     this.field_70159_w -= f * Math.sin(d);
/* 100 */     this.field_70179_y += f * Math.cos(d);
/* 101 */     this.field_70160_al = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 109 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 110 */     super.func_70071_h_();
/* 111 */     if (!this.field_70170_p.field_72995_K) {
/* 112 */       if (this.singing != 0) {
/* 113 */         this.singing--;
/* 114 */         if (this.singing <= 0) {
/* 115 */           setSinging(0);
/*     */         }
/*     */       } 
/* 118 */       if (this.jumpcount > 0) this.jumpcount--; 
/* 119 */       if (this.jumpcount == 0 && 
/* 120 */         this.field_70170_p.field_73012_v.nextInt(70) == 1) {
/* 121 */         jumpAround();
/* 122 */         this.jumpcount = 50;
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 134 */     if (par1EntityPlayer != null && 
/* 135 */       par1EntityPlayer.func_70093_af() && 
/* 136 */       par1EntityPlayer.field_71071_by.func_70448_g() == null) {
/* 137 */       World world = par1EntityPlayer.field_70170_p;
/* 138 */       func_70106_y();
/* 139 */       par1EntityPlayer.field_70170_p.func_72956_a((Entity)par1EntityPlayer, "random.explode", 1.0F, world.field_73012_v.nextFloat() * 0.2F + 0.9F);
/* 140 */       if (!world.field_72995_K) {
/* 141 */         if (world.field_73012_v.nextInt(2) == 0) {
/* 142 */           Boyfriend ent = null;
/* 143 */           ent = (Boyfriend)spawnCreature(world, "Boyfriend", this.field_70165_t, this.field_70163_u + 0.01D, this.field_70161_v);
/* 144 */           if (ent != null) ent.setPrince(1 + world.field_73012_v.nextInt(2)); 
/*     */         } else {
/* 146 */           Girlfriend ent = null;
/* 147 */           ent = (Girlfriend)spawnCreature(world, "Girlfriend", this.field_70165_t, this.field_70163_u + 0.01D, this.field_70161_v);
/* 148 */           if (ent != null) ent.setPrincess(1 + world.field_73012_v.nextInt(2)); 
/*     */         } 
/*     */       } else {
/* 151 */         for (int var3 = 0; var3 < 16; var3++) {
/*     */           
/* 153 */           world.func_72869_a("smoke", ((float)this.field_70165_t + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), ((float)this.field_70163_u + world.field_73012_v.nextFloat()), ((float)this.field_70161_v + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/* 154 */           world.func_72869_a("explode", ((float)this.field_70165_t + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), ((float)this.field_70163_u + world.field_73012_v.nextFloat()), ((float)this.field_70161_v + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/* 155 */           world.func_72869_a("reddust", ((float)this.field_70165_t + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), ((float)this.field_70163_u + world.field_73012_v.nextFloat()), ((float)this.field_70161_v + world.field_73012_v.nextFloat() - world.field_73012_v.nextFloat()), 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 162 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 177 */     return 8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 186 */     if (!this.field_70170_p.field_72995_K) {
/* 187 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) return null; 
/* 188 */       this.singing = 35;
/* 189 */       setSinging(this.singing);
/*     */     } 
/* 191 */     return "orespawn:frog";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 199 */     return "orespawn:scorpion_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 207 */     return "orespawn:big_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 216 */     return 0.7F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void playStepSound(int par1, int par2, int par3, int par4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 241 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), new ItemStack(index, par1, 0));
/*     */     
/* 243 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 252 */     for (int i = 0; i < 4; i++) {
/* 253 */       dropItemRand(Items.field_151123_aH, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 261 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 3.0F);
/* 262 */     if (par1Entity.field_70128_L) func_70691_i(1.0F); 
/* 263 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 271 */     boolean ret = false;
/*     */     
/* 273 */     ret = super.func_70097_a(par1DamageSource, par2);
/* 274 */     if (!this.field_70170_p.field_72995_K && this.jumpcount <= 0) {
/* 275 */       jumpAround();
/* 276 */       this.jumpcount = 25;
/*     */     } 
/* 278 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 287 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.25D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 305 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/* 312 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 317 */     List var5 = this.field_70170_p.func_72872_a(Frog.class, this.field_70121_D.func_72314_b(20.0D, 8.0D, 20.0D));
/* 318 */     return var5.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 326 */     if (this.field_70163_u < 50.0D) return false; 
/* 327 */     if (!this.field_70170_p.func_72935_r()) return false;
/*     */     
/* 329 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID5) {
/* 330 */       if (this.field_70170_p.field_73012_v.nextInt(20) != 1) return false; 
/* 331 */       if (findBuddies() > 5) return false; 
/*     */     } 
/* 333 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 338 */     int xdir = 1;
/* 339 */     int zdir = 1;
/*     */     
/* 341 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 345 */     if (this.field_70128_L)
/* 346 */       return;  super.func_70619_bc();
/* 347 */     if (this.field_70146_Z.nextInt(12) == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*     */ 
/*     */       
/* 350 */       EntityLivingBase e = null;
/* 351 */       e = findSomethingToAttack();
/* 352 */       if (e != null) {
/*     */ 
/*     */         
/* 355 */         func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 356 */         if (func_70068_e((Entity)e) < 6.0D) {
/* 357 */           func_70652_k((Entity)e);
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
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 369 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 371 */     if (par1EntityLiving == null)
/*     */     {
/* 373 */       return false;
/*     */     }
/* 375 */     if (par1EntityLiving == this)
/*     */     {
/* 377 */       return false;
/*     */     }
/* 379 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 382 */       return false;
/*     */     }
/* 384 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 387 */       return false;
/*     */     }
/* 389 */     if (par1EntityLiving instanceof EntityAnt)
/*     */     {
/* 391 */       return true;
/*     */     }
/* 393 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 395 */       return true;
/*     */     }
/* 397 */     if (par1EntityLiving instanceof Cricket)
/*     */     {
/* 399 */       return true;
/*     */     }
/* 401 */     if (par1EntityLiving instanceof EntityMosquito)
/*     */     {
/* 403 */       return true;
/*     */     }
/* 405 */     if (par1EntityLiving instanceof Firefly)
/*     */     {
/* 407 */       return true;
/*     */     }
/* 409 */     if (par1EntityLiving instanceof WormSmall)
/*     */     {
/* 411 */       return true;
/*     */     }
/*     */     
/* 414 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 419 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 420 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(8.0D, 3.0D, 8.0D));
/* 421 */     Collections.sort(var5, this.TargetSorter);
/* 422 */     Iterator<?> var2 = var5.iterator();
/* 423 */     Entity var3 = null;
/* 424 */     EntityLivingBase var4 = null;
/*     */     
/* 426 */     while (var2.hasNext()) {
/*     */       
/* 428 */       var3 = (Entity)var2.next();
/* 429 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 431 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 433 */         return var4;
/*     */       }
/*     */     } 
/* 436 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 445 */     Entity var8 = null;
/* 446 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 447 */     if (var8 != null) {
/*     */ 
/*     */       
/* 450 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 453 */       par0World.func_72838_d(var8);
/*     */       
/* 455 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/* 457 */     return var8;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Frog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */