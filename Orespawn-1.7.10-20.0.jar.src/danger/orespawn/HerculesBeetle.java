/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.enchantment.Enchantment;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HerculesBeetle
/*     */   extends EntityMob
/*     */ {
/*  58 */   private GenericTargetSorter TargetSorter = null;
/*  59 */   private int hurt_timer = 0;
/*  60 */   private float moveSpeed = 0.25F;
/*     */ 
/*     */   
/*     */   public HerculesBeetle(World par1World) {
/*  64 */     super(par1World);
/*     */     
/*  66 */     func_70105_a(3.25F, 2.75F);
/*  67 */     func_70661_as().func_75491_a(true);
/*  68 */     this.field_70728_aV = 200;
/*  69 */     this.field_70174_ab = 100;
/*  70 */     this.field_70178_ae = true;
/*  71 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  72 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  73 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  74 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*     */     
/*  76 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  77 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  78 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  84 */     super.func_70088_a();
/*  85 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  90 */     super.func_110147_ax();
/*  91 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  92 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  93 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.HerculesBeetle_stats.attack);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  97 */     if (func_104002_bU()) return false; 
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 106 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 107 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 112 */     return OreSpawnMain.HerculesBeetle_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 121 */     return OreSpawnMain.HerculesBeetle_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 138 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 144 */     super.func_70664_aZ();
/* 145 */     this.field_70181_x += 0.25D;
/* 146 */     this.field_70163_u += 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHerculesBeetleHealth() {
/* 153 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 162 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 170 */     return "orespawn:alo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 178 */     return "orespawn:hercules_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 185 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 192 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 202 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 207 */     EntityItem var3 = null;
/* 208 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 210 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
/*     */     
/* 212 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 213 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 222 */     dropItemRand(OreSpawnMain.MyBigHammer, 1);
/* 223 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 225 */     int i = 4 + this.field_70170_p.field_73012_v.nextInt(8); int var4;
/* 226 */     for (var4 = 0; var4 < i; var4++) {
/* 227 */       dropItemRand(Items.field_151082_bd, 1);
/*     */     }
/*     */     
/* 230 */     i = 1 + this.field_70170_p.field_73012_v.nextInt(5);
/* 231 */     for (var4 = 0; var4 < i; var4++) {
/* 232 */       ItemStack is; int var3 = this.field_70170_p.field_73012_v.nextInt(20);
/* 233 */       switch (var3) {
/*     */ 
/*     */ 
/*     */         
/*     */         case 1:
/* 238 */           is = dropItemRand(Items.field_151045_i, 1);
/*     */           break;
/*     */         case 2:
/* 241 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150484_ah), 1);
/*     */           break;
/*     */         case 3:
/* 244 */           is = dropItemRand(Items.field_151048_u, 1);
/* 245 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 246 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 247 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 248 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 249 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 250 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 251 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 4:
/* 254 */           is = dropItemRand(Items.field_151047_v, 1);
/* 255 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 256 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 5:
/* 259 */           is = dropItemRand(Items.field_151046_w, 1);
/* 260 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 261 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 262 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 6:
/* 265 */           is = dropItemRand(Items.field_151056_x, 1);
/* 266 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 267 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 7:
/* 270 */           is = dropItemRand(Items.field_151012_L, 1);
/* 271 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 272 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 8:
/* 275 */           is = dropItemRand((Item)Items.field_151161_ac, 1);
/* 276 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 277 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 278 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 279 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 280 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 281 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2)); 
/* 282 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 9:
/* 285 */           is = dropItemRand((Item)Items.field_151163_ad, 1);
/* 286 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 287 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 288 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 289 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 290 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 10:
/* 293 */           is = dropItemRand((Item)Items.field_151173_ae, 1);
/* 294 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 295 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 296 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 297 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 298 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 11:
/* 301 */           is = dropItemRand((Item)Items.field_151175_af, 1);
/* 302 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 303 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));
/*     */           
/*     */           break;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 322 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 327 */     double ks = 0.45D;
/* 328 */     double inair = 1.25D;
/*     */ 
/*     */     
/* 331 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 333 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */ 
/*     */         
/* 336 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 337 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 338 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair * Math.abs(this.field_70170_p.field_73012_v.nextFloat()), Math.sin(f3) * ks);
/*     */       } 
/*     */ 
/*     */       
/* 342 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 346 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 355 */     boolean ret = false;
/* 356 */     if (this.hurt_timer > 0) return false;
/*     */     
/* 358 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 359 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 360 */       this.hurt_timer = 20;
/*     */       
/* 362 */       Entity e = par1DamageSource.func_76346_g();
/* 363 */       if (e != null && e instanceof EntityLiving) {
/*     */         
/* 365 */         func_70624_b((EntityLivingBase)e);
/* 366 */         func_70784_b(e);
/* 367 */         func_70661_as().func_75497_a(e, 1.2D);
/*     */       } 
/*     */     } 
/*     */     
/* 371 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 377 */     EntityLivingBase e = null;
/* 378 */     if (this.field_70128_L)
/* 379 */       return;  super.func_70619_bc();
/* 380 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/* 381 */     if (this.field_70170_p.field_73012_v.nextInt(4) == 0) {
/* 382 */       e = func_70638_az();
/* 383 */       if (e != null && !e.func_70089_S()) {
/* 384 */         func_70624_b(null);
/* 385 */         e = null;
/*     */       } 
/* 387 */       if (e == null) {
/* 388 */         e = findSomethingToAttack();
/*     */       }
/* 390 */       if (e != null) {
/* 391 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 392 */         if (func_70068_e((Entity)e) < ((5.0F + e.field_70130_N / 2.0F) * (5.0F + e.field_70130_N / 2.0F))) {
/* 393 */           setAttacking(1);
/*     */           
/* 395 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 0 || this.field_70170_p.field_73012_v.nextInt(4) == 1) {
/*     */             
/* 397 */             func_70652_k((Entity)e);
/* 398 */             if (!this.field_70170_p.field_72995_K) {
/* 399 */               if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 400 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_attack", 1.4F, 1.0F);
/*     */               } else {
/* 402 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_living", 1.0F, 1.0F);
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } else {
/* 407 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       } else {
/*     */         
/* 411 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 415 */     if (this.field_70170_p.field_73012_v.nextInt(150) == 1 && 
/* 416 */       func_110143_aJ() < mygetMaxHealth())
/*     */     {
/* 418 */       func_70691_i(2.0F);
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
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 431 */     if (par1EntityLiving == null)
/*     */     {
/* 433 */       return false;
/*     */     }
/* 435 */     if (par1EntityLiving == this)
/*     */     {
/* 437 */       return false;
/*     */     }
/* 439 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 441 */       return false;
/*     */     }
/*     */     
/* 444 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 446 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 449 */       return false;
/*     */     }
/*     */     
/* 452 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */     {
/* 454 */       return false;
/*     */     }
/* 456 */     if (par1EntityLiving instanceof HerculesBeetle)
/*     */     {
/* 458 */       return false;
/*     */     }
/* 460 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 462 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 463 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 464 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 468 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 473 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 474 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D));
/* 475 */     Collections.sort(var5, this.TargetSorter);
/* 476 */     Iterator<?> var2 = var5.iterator();
/* 477 */     Entity var3 = null;
/* 478 */     EntityLivingBase var4 = null;
/*     */     
/* 480 */     while (var2.hasNext()) {
/*     */       
/* 482 */       var3 = (Entity)var2.next();
/* 483 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 485 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 487 */         return var4;
/*     */       }
/*     */     } 
/* 490 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 495 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 500 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 511 */     for (k = -3; k < 3; k++) {
/*     */       
/* 513 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 515 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 517 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 518 */           if (bid == Blocks.field_150474_ac) {
/* 519 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 520 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 521 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 522 */             if (s != null && 
/* 523 */               s.equals("Hercules Beetle")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 529 */     if (!func_70814_o()) return false; 
/* 530 */     if (this.field_70170_p.func_72935_r() == true) return false; 
/* 531 */     if (this.field_70163_u < 50.0D) return false;
/*     */ 
/*     */ 
/*     */     
/* 535 */     for (k = -2; k < 2; k++) {
/*     */       
/* 537 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 539 */         for (int i = 2; i < 5; i++) {
/*     */           
/* 541 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 542 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 548 */     HerculesBeetle target = null;
/* 549 */     target = (HerculesBeetle)this.field_70170_p.func_72857_a(HerculesBeetle.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D), (Entity)this);
/* 550 */     if (target != null)
/*     */     {
/* 552 */       return false;
/*     */     }
/* 554 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\HerculesBeetle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */