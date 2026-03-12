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
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.DamageSource;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Basilisk
/*     */   extends EntityMob
/*     */ {
/*  54 */   private GenericTargetSorter TargetSorter = null;
/*  55 */   private int hurt_timer = 0;
/*  56 */   private float moveSpeed = 0.4F;
/*     */ 
/*     */   
/*     */   public Basilisk(World par1World) {
/*  60 */     super(par1World);
/*  61 */     func_70105_a(1.6F, 3.5F);
/*  62 */     this.field_70728_aV = 150;
/*  63 */     this.field_70174_ab = 2000;
/*  64 */     this.field_70178_ae = true;
/*  65 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  66 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  67 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  68 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 20, 1.0D));
/*  69 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  70 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  71 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  76 */     super.func_110147_ax();
/*  77 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  78 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  79 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Basilisk_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  84 */     super.func_70088_a();
/*  85 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  89 */     if (func_104002_bU()) return false; 
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  99 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 100 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 105 */     return OreSpawnMain.Basilisk_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 113 */     return OreSpawnMain.Basilisk_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 121 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 127 */     this.field_70181_x += 0.25D;
/* 128 */     super.func_70664_aZ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 137 */     super.func_70636_d();
/* 138 */     if (this.field_70128_L)
/* 139 */       return;  if (this.field_70146_Z.nextInt(200) == 0) {
/* 140 */       func_70691_i(1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBasiliskHealth() {
/* 148 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 157 */     if (this.field_70146_Z.nextInt(2) == 0) {
/* 158 */       return "orespawn:basilisk_living";
/*     */     }
/* 160 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 169 */     return "orespawn:alo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 177 */     return "orespawn:emperorscorpion_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 184 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 191 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 199 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 204 */     EntityItem var3 = null;
/* 205 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 207 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), is);
/*     */     
/* 209 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 210 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 216 */     ItemStack is = null;
/*     */     
/* 218 */     dropItemRand(OreSpawnMain.MyBasiliskScale, 1);
/* 219 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 221 */     int i = 12 + this.field_70170_p.field_73012_v.nextInt(6); int var4;
/* 222 */     for (var4 = 0; var4 < i; var4++) {
/* 223 */       dropItemRand(Items.field_151166_bC, 1);
/*     */     }
/*     */     
/* 226 */     i = 8 + this.field_70170_p.field_73012_v.nextInt(5);
/* 227 */     for (var4 = 0; var4 < i; var4++) {
/* 228 */       dropItemRand(Items.field_151076_bf, 1);
/*     */     }
/*     */     
/* 231 */     i = 3 + this.field_70170_p.field_73012_v.nextInt(5);
/* 232 */     for (var4 = 0; var4 < i; var4++) {
/* 233 */       int var3 = this.field_70170_p.field_73012_v.nextInt(15);
/* 234 */       switch (var3) {
/*     */         case 1:
/* 236 */           is = dropItemRand(Items.field_151166_bC, 1);
/*     */           break;
/*     */         case 2:
/* 239 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150475_bE), 1);
/*     */           break;
/*     */         case 3:
/* 242 */           is = dropItemRand(OreSpawnMain.MyEmeraldSword, 1);
/* 243 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 244 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 245 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 246 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 247 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 248 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 249 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 4:
/* 252 */           is = dropItemRand(OreSpawnMain.MyEmeraldShovel, 1);
/* 253 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 254 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 5:
/* 257 */           is = dropItemRand(OreSpawnMain.MyEmeraldPickaxe, 1);
/* 258 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 259 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 260 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 6:
/* 263 */           is = dropItemRand(OreSpawnMain.MyEmeraldAxe, 1);
/* 264 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 265 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 7:
/* 268 */           is = dropItemRand(OreSpawnMain.MyEmeraldHoe, 1);
/* 269 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 270 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 8:
/* 273 */           is = dropItemRand((Item)OreSpawnMain.EmeraldHelmet, 1);
/* 274 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 275 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 276 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 277 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 278 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 279 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2)); 
/* 280 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 9:
/* 283 */           is = dropItemRand((Item)OreSpawnMain.EmeraldBody, 1);
/* 284 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 285 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 286 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 287 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 288 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 10:
/* 291 */           is = dropItemRand((Item)OreSpawnMain.EmeraldLegs, 1);
/* 292 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 293 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 294 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 295 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 296 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 11:
/* 299 */           is = dropItemRand((Item)OreSpawnMain.EmeraldBoots, 1);
/* 300 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 301 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 317 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 323 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 325 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */         
/* 327 */         int var2 = 8;
/*     */         
/* 329 */         if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY)
/*     */         {
/* 331 */           var2 = 10;
/*     */         }
/* 333 */         if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) {
/*     */           
/* 335 */           var2 = 12;
/*     */         }
/* 337 */         else if (this.field_70170_p.field_73013_u == EnumDifficulty.HARD) {
/*     */           
/* 339 */           var2 = 14;
/*     */         } 
/*     */         
/* 342 */         if (this.field_70170_p.field_73012_v.nextInt(3) == 0)
/*     */         {
/* 344 */           ((EntityLivingBase)par1Entity).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, var2 * 20, 0));
/*     */         }
/* 346 */         double ks = 1.5D;
/* 347 */         double inair = 0.15D;
/* 348 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 349 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 350 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/*     */ 
/*     */       
/* 354 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 358 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 365 */     if (this.hurt_timer > 0) return false; 
/* 366 */     this.hurt_timer = 30;
/* 367 */     return super.func_70097_a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 373 */     if (this.field_70128_L)
/* 374 */       return;  super.func_70619_bc();
/*     */     
/* 376 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/* 377 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/* 378 */       EntityLivingBase e = findSomethingToAttack();
/* 379 */       if (e != null) {
/* 380 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 381 */         if (func_70068_e((Entity)e) < ((6.0F + e.field_70130_N / 2.0F) * (6.0F + e.field_70130_N / 2.0F))) {
/* 382 */           setAttacking(1);
/*     */           
/* 384 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 0 || this.field_70170_p.field_73012_v.nextInt(4) == 1)
/*     */           {
/* 386 */             func_70652_k((Entity)e);
/*     */           }
/*     */         } else {
/* 389 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*     */         } 
/*     */         
/* 392 */         if (e instanceof EntityLivingBase)
/*     */         {
/* 394 */           e.func_70690_d(new PotionEffect(Potion.field_76421_d.field_76415_H, 100, 5));
/*     */         }
/*     */       } else {
/* 397 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 401 */     if (this.field_70170_p.field_73012_v.nextInt(75) == 1 && 
/* 402 */       func_110143_aJ() < mygetMaxHealth()) {
/* 403 */       func_70691_i(1.0F);
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
/* 415 */     if (par1EntityLiving == null)
/*     */     {
/* 417 */       return false;
/*     */     }
/* 419 */     if (par1EntityLiving == this)
/*     */     {
/* 421 */       return false;
/*     */     }
/* 423 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 425 */       return false;
/*     */     }
/* 427 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false; 
/* 428 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 431 */       return false;
/*     */     }
/* 433 */     if (par1EntityLiving instanceof Basilisk)
/*     */     {
/* 435 */       return false;
/*     */     }
/*     */     
/* 438 */     if (par1EntityLiving instanceof LeafMonster)
/*     */     {
/* 440 */       return false;
/*     */     }
/*     */     
/* 443 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 445 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 446 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 447 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 451 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 456 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 457 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(24.0D, 7.0D, 24.0D));
/* 458 */     Collections.sort(var5, this.TargetSorter);
/* 459 */     Iterator<?> var2 = var5.iterator();
/* 460 */     Entity var3 = null;
/* 461 */     EntityLivingBase var4 = null;
/*     */     
/* 463 */     while (var2.hasNext()) {
/*     */       
/* 465 */       var3 = (Entity)var2.next();
/* 466 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 468 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 470 */         return var4;
/*     */       }
/*     */     } 
/* 473 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 478 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 483 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 494 */     for (k = -3; k < 3; k++) {
/*     */       
/* 496 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 498 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 500 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 501 */           if (bid == Blocks.field_150474_ac) {
/* 502 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 503 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 504 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 505 */             if (s != null && 
/* 506 */               s.equals("Basilisk")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 512 */     if (!func_70814_o()) return false; 
/* 513 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 517 */     for (k = -1; k < 2; k++) {
/*     */       
/* 519 */       for (int j = -1; j < 2; j++) {
/*     */         
/* 521 */         for (int i = 1; i < 5; i++) {
/*     */           
/* 523 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 524 */           if (bid != Blocks.field_150350_a) return false;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 530 */     Basilisk target = null;
/* 531 */     target = (Basilisk)this.field_70170_p.func_72857_a(Basilisk.class, this.field_70121_D.func_72314_b(20.0D, 6.0D, 20.0D), (Entity)this);
/* 532 */     if (target != null)
/*     */     {
/* 534 */       return false;
/*     */     }
/* 536 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Basilisk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */