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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EmperorScorpion
/*     */   extends EntityMob
/*     */ {
/*  60 */   private GenericTargetSorter TargetSorter = null;
/*  61 */   private RenderInfo renderdata = new RenderInfo();
/*  62 */   private int hurt_timer = 0;
/*  63 */   private float moveSpeed = 0.35F;
/*     */ 
/*     */   
/*     */   public EmperorScorpion(World par1World) {
/*  67 */     super(par1World);
/*     */     
/*  69 */     func_70105_a(3.5F, 3.0F);
/*  70 */     func_70661_as().func_75491_a(true);
/*  71 */     this.field_70728_aV = 200;
/*  72 */     this.field_70174_ab = 100;
/*  73 */     this.field_70178_ae = true;
/*  74 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  75 */     this.renderdata = new RenderInfo();
/*  76 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  77 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  78 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*     */     
/*  80 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  81 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  82 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  88 */     super.func_70088_a();
/*  89 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  90 */     if (this.renderdata == null) {
/*  91 */       this.renderdata = new RenderInfo();
/*     */     }
/*  93 */     this.renderdata.rf1 = 0.0F;
/*  94 */     this.renderdata.rf2 = 0.0F;
/*  95 */     this.renderdata.rf3 = 0.0F;
/*  96 */     this.renderdata.rf4 = 0.0F;
/*  97 */     this.renderdata.ri1 = 0;
/*  98 */     this.renderdata.ri2 = 0;
/*  99 */     this.renderdata.ri3 = 0;
/* 100 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/* 105 */     super.func_110147_ax();
/* 106 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/* 107 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 108 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.EmperorScorpion_stats.attack);
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
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 127 */     return OreSpawnMain.EmperorScorpion_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 134 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 139 */     this.renderdata.rf1 = r.rf1;
/* 140 */     this.renderdata.rf2 = r.rf2;
/* 141 */     this.renderdata.rf3 = r.rf3;
/* 142 */     this.renderdata.rf4 = r.rf4;
/* 143 */     this.renderdata.ri1 = r.ri1;
/* 144 */     this.renderdata.ri2 = r.ri2;
/* 145 */     this.renderdata.ri3 = r.ri3;
/* 146 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 154 */     return OreSpawnMain.EmperorScorpion_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 162 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 171 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 177 */     super.func_70664_aZ();
/* 178 */     this.field_70181_x += 0.25D;
/* 179 */     this.field_70163_u += 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEmperorScorpionHealth() {
/* 186 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 195 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 203 */     return "orespawn:alo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 211 */     return "orespawn:emperorscorpion_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 218 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 225 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 235 */     return Items.field_151082_bd;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 240 */     EntityItem var3 = null;
/* 241 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 243 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
/*     */     
/* 245 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 246 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 254 */     dropItemRand(OreSpawnMain.MyEmperorScorpionScale, 1);
/* 255 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     
/* 257 */     int i = 4 + this.field_70170_p.field_73012_v.nextInt(5); int var4;
/* 258 */     for (var4 = 0; var4 < i; var4++) {
/* 259 */       dropItemRand(Item.func_150898_a(Blocks.field_150343_Z), 1);
/*     */     }
/*     */     
/* 262 */     i = 4 + this.field_70170_p.field_73012_v.nextInt(8);
/* 263 */     for (var4 = 0; var4 < i; var4++) {
/* 264 */       dropItemRand(Items.field_151082_bd, 1);
/*     */     }
/*     */     
/* 267 */     i = 1 + this.field_70170_p.field_73012_v.nextInt(5);
/* 268 */     for (var4 = 0; var4 < i; var4++) {
/* 269 */       ItemStack is; int var3 = this.field_70170_p.field_73012_v.nextInt(20);
/* 270 */       switch (var3) {
/*     */         case 0:
/* 272 */           is = dropItemRand(OreSpawnMain.MyUltimateSword, 1);
/*     */           break;
/*     */         case 1:
/* 275 */           is = dropItemRand(Items.field_151045_i, 1);
/*     */           break;
/*     */         case 2:
/* 278 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150484_ah), 1);
/*     */           break;
/*     */         case 3:
/* 281 */           is = dropItemRand(Items.field_151048_u, 1);
/* 282 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 283 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 284 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 285 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 286 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 287 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 288 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 4:
/* 291 */           is = dropItemRand(Items.field_151047_v, 1);
/* 292 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 293 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 5:
/* 296 */           is = dropItemRand(Items.field_151046_w, 1);
/* 297 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 298 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 299 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 6:
/* 302 */           is = dropItemRand(Items.field_151056_x, 1);
/* 303 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 304 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 7:
/* 307 */           is = dropItemRand(Items.field_151012_L, 1);
/* 308 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 309 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 8:
/* 312 */           is = dropItemRand((Item)Items.field_151161_ac, 1);
/* 313 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 314 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 315 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 316 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 317 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/* 318 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2)); 
/* 319 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*     */           break;
/*     */         case 9:
/* 322 */           is = dropItemRand((Item)Items.field_151163_ad, 1);
/* 323 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 324 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 325 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 326 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 327 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 10:
/* 330 */           is = dropItemRand((Item)Items.field_151173_ae, 1);
/* 331 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 332 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 333 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 334 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 335 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 11:
/* 338 */           is = dropItemRand((Item)Items.field_151175_af, 1);
/* 339 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/* 340 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*     */           break;
/*     */         case 12:
/* 343 */           is = dropItemRand(OreSpawnMain.MyUltimateBow, 1);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 367 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 372 */     double ks = 3.0D;
/* 373 */     double inair = 0.2D;
/* 374 */     int var2 = 6;
/*     */     
/* 376 */     if (super.func_70652_k(par1Entity)) {
/*     */       
/* 378 */       if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*     */ 
/*     */         
/* 381 */         if (this.field_70170_p.field_73013_u == EnumDifficulty.EASY) {
/*     */           
/* 383 */           var2 = 8;
/* 384 */           if (this.field_70170_p.field_73013_u == EnumDifficulty.NORMAL) {
/*     */             
/* 386 */             var2 = 10;
/*     */           }
/* 388 */           else if (this.field_70170_p.field_73013_u == EnumDifficulty.HARD) {
/*     */             
/* 390 */             var2 = 12;
/*     */           } 
/*     */         } 
/*     */         
/* 394 */         if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 395 */           ((EntityLivingBase)par1Entity).func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, var2 * 15, 0));
/*     */         }
/*     */         
/* 398 */         float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/* 399 */         if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/* 400 */         par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/*     */ 
/*     */       
/* 404 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 408 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 417 */     boolean ret = false;
/* 418 */     if (this.hurt_timer > 0) return false;
/*     */     
/* 420 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 421 */       ret = super.func_70097_a(par1DamageSource, par2);
/* 422 */       this.hurt_timer = 30;
/*     */       
/* 424 */       Entity e = par1DamageSource.func_76346_g();
/* 425 */       if (e != null && e instanceof EntityLiving) {
/*     */         
/* 427 */         func_70624_b((EntityLivingBase)e);
/* 428 */         func_70784_b(e);
/* 429 */         func_70661_as().func_75497_a(e, 1.2D);
/*     */       } 
/*     */     } 
/*     */     
/* 433 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 439 */     EntityLivingBase e = null;
/* 440 */     if (this.field_70128_L)
/* 441 */       return;  super.func_70619_bc();
/* 442 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/* 443 */     if (this.field_70170_p.field_73012_v.nextInt(4) == 0) {
/* 444 */       e = func_70638_az();
/* 445 */       if (e != null && !e.func_70089_S()) {
/* 446 */         func_70624_b(null);
/* 447 */         e = null;
/*     */       } 
/* 449 */       if (this.field_70170_p.field_73012_v.nextInt(100) == 0) func_70624_b(null); 
/* 450 */       if (e == null) {
/* 451 */         e = findSomethingToAttack();
/*     */       }
/* 453 */       if (e != null) {
/* 454 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 455 */         if (func_70068_e((Entity)e) < ((6.0F + e.field_70130_N / 2.0F) * (6.0F + e.field_70130_N / 2.0F))) {
/* 456 */           setAttacking(1);
/*     */           
/* 458 */           if (this.field_70170_p.field_73012_v.nextInt(4) == 0 || this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*     */             
/* 460 */             func_70652_k((Entity)e);
/* 461 */             if (!this.field_70170_p.field_72995_K) {
/* 462 */               if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 463 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_attack", 1.4F, 1.0F);
/*     */               } else {
/* 465 */                 this.field_70170_p.func_72956_a((Entity)e, "orespawn:scorpion_living", 1.0F, 1.0F);
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } else {
/* 470 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */ 
/*     */         
/* 474 */         if (this.field_70170_p.field_73012_v.nextInt(20) == 1)
/*     */         {
/*     */           
/* 477 */           EntityCreature newent = (EntityCreature)spawnCreature(this.field_70170_p, "Scorpion", (this.field_70165_t + e.field_70165_t) / 2.0D + this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5), (this.field_70163_u + e.field_70163_u) / 2.0D + 1.01D, (this.field_70161_v + e.field_70161_v) / 2.0D + this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5));
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 482 */         setAttacking(0);
/*     */       } 
/*     */     } 
/*     */     
/* 486 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1 && 
/* 487 */       func_110143_aJ() < mygetMaxHealth())
/*     */     {
/* 489 */       func_70691_i(2.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 500 */     Entity var8 = null;
/* 501 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 502 */     if (var8 != null) {
/*     */ 
/*     */       
/* 505 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 508 */       par0World.func_72838_d(var8);
/*     */       
/* 510 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/* 512 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 522 */     if (par1EntityLiving == null)
/*     */     {
/* 524 */       return false;
/*     */     }
/* 526 */     if (par1EntityLiving == this)
/*     */     {
/* 528 */       return false;
/*     */     }
/* 530 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 532 */       return false;
/*     */     }
/* 534 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 537 */       return false;
/*     */     }
/*     */     
/* 540 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 542 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityEnderman)
/*     */     {
/* 544 */       return false;
/*     */     }
/* 546 */     if (par1EntityLiving instanceof EnderKnight)
/*     */     {
/* 548 */       return false;
/*     */     }
/* 550 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 552 */       return false;
/*     */     }
/*     */     
/* 555 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */     {
/* 557 */       return false;
/*     */     }
/* 559 */     if (par1EntityLiving instanceof Scorpion)
/*     */     {
/* 561 */       return false;
/*     */     }
/* 563 */     if (par1EntityLiving instanceof EmperorScorpion)
/*     */     {
/* 565 */       return false;
/*     */     }
/* 567 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 569 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 570 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 571 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 575 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 580 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 581 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(24.0D, 6.0D, 24.0D));
/* 582 */     Collections.sort(var5, this.TargetSorter);
/* 583 */     Iterator<?> var2 = var5.iterator();
/* 584 */     Entity var3 = null;
/* 585 */     EntityLivingBase var4 = null;
/*     */     
/* 587 */     while (var2.hasNext()) {
/*     */       
/* 589 */       var3 = (Entity)var2.next();
/* 590 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 592 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 594 */         return var4;
/*     */       }
/*     */     } 
/* 597 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 602 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 607 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/*     */   public boolean func_70601_bi() {
/* 624 */     for (int k = -2; k < 2; k++) {
/*     */       
/* 626 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 628 */         for (int i = 2; i < 5; i++) {
/*     */           
/* 630 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 631 */           if (bid == Blocks.field_150474_ac) {
/* 632 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 633 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 634 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 635 */             if (s != null && 
/* 636 */               s.equals("Emperor Scorpion")) return true;
/*     */           
/*     */           } 
/* 639 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 643 */     if (!func_70814_o()) return false; 
/* 644 */     if (this.field_70170_p.func_72935_r() == true) return false; 
/* 645 */     if (this.field_70163_u < 50.0D) return false;
/*     */ 
/*     */     
/* 648 */     EmperorScorpion target = null;
/* 649 */     target = (EmperorScorpion)this.field_70170_p.func_72857_a(EmperorScorpion.class, this.field_70121_D.func_72314_b(20.0D, 6.0D, 20.0D), (Entity)this);
/* 650 */     if (target != null)
/*     */     {
/* 652 */       return false;
/*     */     }
/* 654 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EmperorScorpion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */