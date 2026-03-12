/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityList;
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
/*     */ public class TrooperBug
/*     */   extends EntityMob
/*     */ {
/*  59 */   private GenericTargetSorter TargetSorter = null;
/*  60 */   private RenderInfo renderdata = new RenderInfo();
/*  61 */   private int force_sync = 50;
/*  62 */   private int hurt_timer = 0;
/*  63 */   private float moveSpeed = 0.4F;
/*     */ 
/*     */   
/*     */   public TrooperBug(World par1World) {
/*  67 */     super(par1World);
/*     */     
/*  69 */     func_70105_a(3.0F, 3.5F);
/*  70 */     func_70661_as().func_75491_a(true);
/*  71 */     this.field_70728_aV = 150;
/*  72 */     this.field_70174_ab = 100;
/*  73 */     this.field_70178_ae = false;
/*  74 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  75 */     this.renderdata = new RenderInfo();
/*  76 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  77 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  78 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  79 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
/*  80 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  81 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
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
/* 100 */     this.force_sync = 50;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/* 105 */     super.func_110147_ax();
/* 106 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/* 107 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 108 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.TrooperBug_stats.attack);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 112 */     if (func_104002_bU()) return false; 
/* 113 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 121 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 122 */     super.func_70071_h_();
/* 123 */     if (this.field_70160_al)
/*     */     {
/*     */       
/* 126 */       func_70661_as().func_75484_a(null, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 132 */     return OreSpawnMain.TrooperBug_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 140 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 145 */     this.renderdata.rf1 = r.rf1;
/* 146 */     this.renderdata.rf2 = r.rf2;
/* 147 */     this.renderdata.rf3 = r.rf3;
/* 148 */     this.renderdata.rf4 = r.rf4;
/* 149 */     this.renderdata.ri1 = r.ri1;
/* 150 */     this.renderdata.ri2 = r.ri2;
/* 151 */     this.renderdata.ri3 = r.ri3;
/* 152 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 160 */     return OreSpawnMain.TrooperBug_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 168 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 177 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 184 */     this.field_70181_x += 1.149999976158142D;
/* 185 */     this.field_70163_u += 1.5D;
/* 186 */     float f = 0.2F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.45F);
/* 187 */     this.field_70159_w -= f * Math.sin(Math.toRadians(this.field_70759_as));
/* 188 */     this.field_70179_y += f * Math.cos(Math.toRadians(this.field_70759_as));
/* 189 */     this.field_70160_al = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void jumpAtEntity(EntityLivingBase e) {
/* 195 */     this.field_70181_x += 1.25D;
/* 196 */     this.field_70163_u += 1.25D;
/* 197 */     float f = 0.3F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.25F);
/* 198 */     float d = (float)Math.atan2(e.field_70165_t - this.field_70165_t, e.field_70161_v - this.field_70161_v);
/* 199 */     this.field_70159_w += f * Math.sin(d);
/* 200 */     this.field_70179_y += f * Math.cos(d);
/* 201 */     this.field_70160_al = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTrooperBugHealth() {
/* 208 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 217 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 218 */       return "orespawn:clatter";
/*     */     }
/* 220 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 228 */     return "orespawn:crunch";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 236 */     return "orespawn:emperorscorpion_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 243 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 250 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 260 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 265 */     EntityItem var3 = null;
/* 266 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 268 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
/*     */     
/* 270 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 271 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 279 */     dropItemRand(OreSpawnMain.MyJumpyBugScale, 1);
/* 280 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 282 */     int i = 2 + this.field_70170_p.field_73012_v.nextInt(5); int var4;
/* 283 */     for (var4 = 0; var4 < i; var4++) {
/* 284 */       dropItemRand(OreSpawnMain.MyAmethyst, 1);
/*     */     }
/*     */     
/* 287 */     i = 1 + this.field_70170_p.field_73012_v.nextInt(5);
/* 288 */     for (var4 = 0; var4 < i; var4++) {
/* 289 */       ItemStack is; int var3 = this.field_70170_p.field_73012_v.nextInt(14);
/* 290 */       switch (var3) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case 2:
/* 296 */           is = dropItemRand(Item.func_150898_a(OreSpawnMain.MyBlockAmethystBlock), 1);
/*     */           break;
/*     */         case 3:
/* 299 */           is = dropItemRand(OreSpawnMain.MyAmethystSword, 1);
/* 300 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 301 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 302 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 303 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 304 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 305 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 306 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 4:
/* 309 */           is = dropItemRand(OreSpawnMain.MyAmethystShovel, 1);
/* 310 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 311 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 5:
/* 314 */           is = dropItemRand(OreSpawnMain.MyAmethystPickaxe, 1);
/* 315 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 316 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 317 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 6:
/* 320 */           is = dropItemRand(OreSpawnMain.MyAmethystAxe, 1);
/* 321 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 322 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 7:
/* 325 */           is = dropItemRand(OreSpawnMain.MyAmethystHoe, 1);
/* 326 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 327 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 8:
/* 330 */           is = dropItemRand((Item)OreSpawnMain.AmethystHelmet, 1);
/* 331 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 332 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 333 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 334 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 335 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 336 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2)); 
/* 337 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 9:
/* 340 */           is = dropItemRand((Item)OreSpawnMain.AmethystBody, 1);
/* 341 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 342 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 343 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 344 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 345 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 10:
/* 348 */           is = dropItemRand((Item)OreSpawnMain.AmethystLegs, 1);
/* 349 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 350 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 351 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 352 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 353 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 11:
/* 356 */           is = dropItemRand((Item)OreSpawnMain.AmethystBoots, 1);
/* 357 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 358 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4));
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
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 382 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 388 */     double ks = 1.8D;
/* 389 */     double inair = 0.2D;
/* 390 */     int var2 = 6;
/* 391 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 393 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */ 
/*     */         
/* 396 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 397 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 398 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/*     */ 
/*     */       
/* 402 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 406 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 415 */     boolean ret = false;
/* 416 */     if (this.hurt_timer > 0) return false;
/*     */     
/* 418 */     if (!par1DamageSource.func_76355_l().equals("cactus") && !par1DamageSource.func_76355_l().equals("fall")) {
/* 419 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 420 */       this.hurt_timer = 20;
/*     */       
/* 422 */       Entity e = par1DamageSource.func_76346_g();
/* 423 */       if (e != null && e instanceof EntityLiving) {
/*     */         
/* 425 */         func_70624_b((EntityLivingBase)e);
/* 426 */         func_70784_b(e);
/* 427 */         func_70661_as().func_75497_a(e, 1.2D);
/* 428 */         ret = true;
/*     */       } 
/*     */     } 
/* 431 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 437 */     EntityLivingBase e = null;
/* 438 */     if (this.field_70128_L)
/* 439 */       return;  super.func_70619_bc();
/* 440 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/* 441 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 0) {
/* 442 */       e = func_70638_az();
/* 443 */       if (e != null && !e.func_70089_S()) {
/* 444 */         func_70624_b(null);
/* 445 */         e = null;
/*     */       } 
/* 447 */       if (e == null) {
/* 448 */         e = findSomethingToAttack();
/*     */       }
/* 450 */       if (e != null) {
/* 451 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 452 */         if (this.field_70170_p.field_73012_v.nextInt(10) == 1 && !this.field_70160_al)
/* 453 */         { jumpAtEntity(e); }
/*     */         
/* 455 */         else if (func_70068_e((Entity)e) < ((5.0F + e.field_70130_N / 2.0F) * (5.0F + e.field_70130_N / 2.0F)))
/* 456 */         { setAttacking(1);
/*     */           
/* 458 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 0 || this.field_70170_p.field_73012_v.nextInt(7) == 1) {
/*     */             
/* 460 */             func_70652_k((Entity)e);
/* 461 */             if (!this.field_70170_p.field_72995_K) {
/* 462 */               if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 463 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_attack", 1.4F, 1.0F);
/*     */               } else {
/* 465 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:clatter", 1.0F, 1.0F);
/*     */               }
/*     */             
/*     */             }
/*     */           }  }
/* 470 */         else if (!this.field_70160_al) { func_70661_as().func_75497_a((Entity)e, 1.2D); }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 475 */         if (this.field_70170_p.field_73012_v.nextInt(30) == 1)
/*     */         {
/*     */           
/* 478 */           EntityCreature newent = (EntityCreature)spawnCreature(this.field_70170_p, "Spit Bug", (this.field_70165_t + e.field_70165_t) / 2.0D + this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5), (this.field_70163_u + e.field_70163_u) / 2.0D + 1.01D, (this.field_70161_v + e.field_70161_v) / 2.0D + this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5));
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 483 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 487 */     if (this.field_70170_p.field_73012_v.nextInt(150) == 1 && 
/* 488 */       func_110143_aJ() < mygetMaxHealth())
/*     */     {
/* 490 */       func_70691_i(1.0F);
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
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 502 */     Entity var8 = null;
/* 503 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 504 */     if (var8 != null) {
/*     */ 
/*     */       
/* 507 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 510 */       par0World.func_72838_d(var8);
/*     */       
/* 512 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/* 514 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 524 */     if (par1EntityLiving == null)
/*     */     {
/* 526 */       return false;
/*     */     }
/* 528 */     if (par1EntityLiving == this)
/*     */     {
/* 530 */       return false;
/*     */     }
/* 532 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 534 */       return false;
/*     */     }
/*     */     
/* 537 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 539 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 542 */       return false;
/*     */     }
/*     */     
/* 545 */     if (par1EntityLiving instanceof Hydrolisc)
/*     */     {
/* 547 */       return false;
/*     */     }
/* 549 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 551 */       return false;
/*     */     }
/* 553 */     if (par1EntityLiving instanceof EnderKnight)
/*     */     {
/* 555 */       return false;
/*     */     }
/* 557 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityEnderman)
/*     */     {
/* 559 */       return false;
/*     */     }
/*     */     
/* 562 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */     {
/* 564 */       return false;
/*     */     }
/* 566 */     if (par1EntityLiving instanceof TrooperBug)
/*     */     {
/* 568 */       return false;
/*     */     }
/* 570 */     if (par1EntityLiving instanceof SpitBug)
/*     */     {
/* 572 */       return false;
/*     */     }
/* 574 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 576 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 577 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 578 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 582 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 587 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 588 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 7.0D, 12.0D));
/* 589 */     Collections.sort(var5, this.TargetSorter);
/* 590 */     Iterator<?> var2 = var5.iterator();
/* 591 */     Entity var3 = null;
/* 592 */     EntityLivingBase var4 = null;
/*     */     
/* 594 */     while (var2.hasNext()) {
/*     */       
/* 596 */       var3 = (Entity)var2.next();
/* 597 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 599 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 601 */         return var4;
/*     */       }
/*     */     } 
/* 604 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 609 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 614 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 625 */     for (k = -3; k < 3; k++) {
/*     */       
/* 627 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 629 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 631 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 632 */           if (bid == Blocks.field_150474_ac) {
/* 633 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 634 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 635 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 636 */             if (s != null && 
/* 637 */               s.equals("Jumpy Bug")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 643 */     if (!func_70814_o()) return false; 
/* 644 */     if (this.field_70170_p.func_72935_r() == true && 
/* 645 */       this.field_70170_p.field_73012_v.nextInt(20) > 1) {
/* 646 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 651 */     for (k = -2; k < 2; k++) {
/*     */       
/* 653 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 655 */         for (int i = 1; i < 5; i++) {
/*     */           
/* 657 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 658 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 662 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\TrooperBug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */