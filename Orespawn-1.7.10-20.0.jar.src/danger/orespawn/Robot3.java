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
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
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
/*     */ public class Robot3
/*     */   extends EntityMob
/*     */ {
/*  58 */   private GenericTargetSorter TargetSorter = null;
/*  59 */   private RenderInfo renderdata = new RenderInfo();
/*  60 */   private int reload_ticker = 0;
/*  61 */   private float moveSpeed = 0.35F;
/*     */ 
/*     */   
/*     */   public Robot3(World par1World) {
/*  65 */     super(par1World);
/*  66 */     func_70105_a(2.5F, 5.0F);
/*  67 */     func_70661_as().func_75491_a(true);
/*  68 */     this.field_70728_aV = 60;
/*  69 */     this.field_70174_ab = 40;
/*  70 */     this.field_70178_ae = true;
/*  71 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  72 */     this.renderdata = new RenderInfo();
/*  73 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  74 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
/*  75 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
/*  76 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  77 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  78 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  83 */     super.func_110147_ax();
/*  84 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  85 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  86 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Robot3_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  91 */     super.func_70088_a();
/*  92 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  93 */     if (this.renderdata == null) {
/*  94 */       this.renderdata = new RenderInfo();
/*     */     }
/*  96 */     this.renderdata.rf1 = 0.0F;
/*  97 */     this.renderdata.rf2 = 0.0F;
/*  98 */     this.renderdata.rf3 = 0.0F;
/*  99 */     this.renderdata.rf4 = 0.0F;
/* 100 */     this.renderdata.ri1 = 0;
/* 101 */     this.renderdata.ri2 = 0;
/* 102 */     this.renderdata.ri3 = 0;
/* 103 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 107 */     if (func_104002_bU()) return false; 
/* 108 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 116 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 117 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 122 */     return OreSpawnMain.Robot3_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 129 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 134 */     this.renderdata.rf1 = r.rf1;
/* 135 */     this.renderdata.rf2 = r.rf2;
/* 136 */     this.renderdata.rf3 = r.rf3;
/* 137 */     this.renderdata.rf4 = r.rf4;
/* 138 */     this.renderdata.ri1 = r.ri1;
/* 139 */     this.renderdata.ri2 = r.ri2;
/* 140 */     this.renderdata.ri3 = r.ri3;
/* 141 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 149 */     return OreSpawnMain.Robot3_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 157 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 166 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 172 */     this.field_70181_x += 0.25D;
/* 173 */     super.func_70664_aZ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 183 */     if (this.field_70146_Z.nextInt(4) == 0) {
/* 184 */       return "orespawn:robot_living";
/*     */     }
/* 186 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 194 */     return "orespawn:robot_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 202 */     return "orespawn:robot_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 210 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 217 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 225 */     return Items.field_151042_j;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 230 */     EntityItem var3 = null;
/* 231 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 233 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*     */     
/* 235 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 236 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 244 */     ItemStack is = null;
/*     */ 
/*     */     
/* 247 */     int var5 = 5 + this.field_70170_p.field_73012_v.nextInt(6); int var4;
/* 248 */     for (var4 = 0; var4 < var5; var4++) {
/* 249 */       dropItemRand(OreSpawnMain.MyLaserBall, 4);
/*     */     }
/*     */     
/* 252 */     int i = 5 + this.field_70170_p.field_73012_v.nextInt(10);
/* 253 */     for (var4 = 0; var4 < i; var4++) {
/* 254 */       int var3 = this.field_70170_p.field_73012_v.nextInt(15);
/* 255 */       switch (var3) {
/*     */         case 0:
/* 257 */           is = dropItemRand(Items.field_151137_ax, 1);
/*     */           break;
/*     */         case 1:
/* 260 */           is = dropItemRand(Items.field_151107_aW, 1);
/*     */           break;
/*     */         case 2:
/* 263 */           is = dropItemRand(Items.field_151132_bS, 1);
/*     */           break;
/*     */         case 3:
/* 266 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */           break;
/*     */         case 4:
/* 269 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150367_z), 1);
/*     */           break;
/*     */         case 5:
/* 272 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150320_F), 1);
/*     */           break;
/*     */         case 6:
/* 275 */           is = dropItemRand(Item.func_150898_a((Block)Blocks.field_150331_J), 1);
/*     */           break;
/*     */         case 7:
/* 278 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150442_at), 1);
/*     */           break;
/*     */         case 8:
/* 281 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */           break;
/*     */         case 9:
/* 284 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150445_bS), 1);
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 300 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 307 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 312 */     if (this.field_70128_L)
/* 313 */       return;  super.func_70619_bc();
/* 314 */     if (this.reload_ticker > 0) {
/* 315 */       this.reload_ticker--;
/* 316 */       if (this.reload_ticker < 25) setAttacking(0); 
/*     */     } 
/* 318 */     if (this.reload_ticker == 0) {
/* 319 */       EntityLivingBase e = null;
/* 320 */       if (this.field_70170_p.field_73012_v.nextInt(50) == 1) func_70624_b(null); 
/* 321 */       e = func_70638_az();
/* 322 */       if (e != null && !e.func_70089_S()) {
/* 323 */         func_70624_b(null);
/* 324 */         e = null;
/*     */       } 
/* 326 */       if (e == null) {
/* 327 */         e = findSomethingToAttack();
/*     */       }
/* 329 */       this.reload_ticker = 35;
/* 330 */       if (e != null) {
/* 331 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 332 */         if (func_70068_e((Entity)e) < 256.0D) {
/*     */ 
/*     */           
/* 335 */           double rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/* 336 */           double rhdir = Math.toRadians(((this.field_70759_as + 90.0F) % 360.0F));
/*     */           
/* 338 */           double pi = 3.1415926545D;
/*     */           
/* 340 */           double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/* 341 */           if (rdd > pi) rdd -= pi * 2.0D; 
/* 342 */           rdd = Math.abs(rdd);
/*     */           
/* 344 */           if (rdd < 0.5D) {
/* 345 */             double yoff = 3.0D;
/* 346 */             double xzoff = 1.75D;
/* 347 */             LaserBall var2 = new LaserBall(this.field_70170_p, e.field_70165_t - this.field_70165_t, e.field_70163_u - this.field_70163_u + yoff, e.field_70161_v - this.field_70161_v);
/* 348 */             var2.func_70012_b(this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70759_as)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70759_as)), this.field_70759_as, this.field_70125_A);
/* 349 */             double var3 = e.field_70165_t - var2.field_70165_t;
/* 350 */             double var5 = e.field_70163_u - var2.field_70163_u;
/* 351 */             double var7 = e.field_70161_v - var2.field_70161_v;
/* 352 */             float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 353 */             var2.func_70186_c(var3, var5 + var9, var7, 1.4F, 5.0F);
/* 354 */             this.field_70170_p.func_72956_a((Entity)this, "fireworks.launch", 3.0F, 1.0F);
/* 355 */             this.field_70170_p.func_72838_d((Entity)var2);
/* 356 */             setAttacking(1);
/*     */           } 
/* 358 */           func_70661_as().func_75497_a((Entity)e, 0.5D);
/*     */         } 
/*     */       } else {
/* 361 */         setAttacking(0);
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
/* 372 */     boolean ret = false;
/* 373 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 374 */       ret = super.func_70097_a(par1DamageSource, par2);
/*     */     }
/* 376 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 386 */     if (par1EntityLiving == null)
/*     */     {
/* 388 */       return false;
/*     */     }
/* 390 */     if (par1EntityLiving == this)
/*     */     {
/* 392 */       return false;
/*     */     }
/* 394 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 396 */       return false;
/*     */     }
/*     */     
/* 399 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 401 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 404 */       return false;
/*     */     }
/*     */     
/* 407 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 409 */       return false;
/*     */     }
/* 411 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 413 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 414 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 415 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 419 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 424 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 425 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 3.0D, 16.0D));
/* 426 */     Collections.sort(var5, this.TargetSorter);
/* 427 */     Iterator<?> var2 = var5.iterator();
/*     */     
/* 429 */     while (var2.hasNext()) {
/*     */       
/* 431 */       Entity var3 = (Entity)var2.next();
/* 432 */       EntityLivingBase var4 = (EntityLivingBase)var3;
/*     */       
/* 434 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 436 */         return var4;
/*     */       }
/*     */     } 
/* 439 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 445 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 450 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 461 */     if (this.field_70163_u < 50.0D) return false; 
/* 462 */     if (this.field_70170_p.func_72935_r() == true) return false;
/*     */ 
/*     */ 
/*     */     
/* 466 */     for (int k = -1; k < 1; k++) {
/*     */       
/* 468 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 470 */         for (int i = 1; i < 6; i++) {
/*     */           
/* 472 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 473 */           if (bid != Blocks.field_150350_a && bid != Blocks.field_150329_H) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 477 */     if (!func_70814_o()) return false; 
/* 478 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Robot3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */