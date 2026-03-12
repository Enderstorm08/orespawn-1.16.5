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
/*     */ 
/*     */ public class Triffid
/*     */   extends EntityMob
/*     */ {
/*  57 */   private GenericTargetSorter TargetSorter = null;
/*  58 */   private RenderInfo renderdata = new RenderInfo();
/*  59 */   private int hurt_timer = 0;
/*  60 */   private float moveSpeed = 0.13F;
/*     */ 
/*     */   
/*     */   public Triffid(World par1World) {
/*  64 */     super(par1World);
/*     */     
/*  66 */     func_70105_a(2.0F, 4.0F);
/*  67 */     func_70661_as().func_75491_a(true);
/*  68 */     this.field_70728_aV = 50;
/*  69 */     this.field_70174_ab = 75;
/*  70 */     this.field_70178_ae = false;
/*  71 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  72 */     this.renderdata = new RenderInfo();
/*  73 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*     */ 
/*     */     
/*  76 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
/*  77 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  78 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  84 */     super.func_70088_a();
/*  85 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  86 */     this.field_70180_af.func_75682_a(21, Byte.valueOf((byte)0));
/*  87 */     if (this.renderdata == null) {
/*  88 */       this.renderdata = new RenderInfo();
/*     */     }
/*  90 */     this.renderdata.rf1 = 0.0F;
/*  91 */     this.renderdata.rf2 = 0.0F;
/*  92 */     this.renderdata.rf3 = 0.0F;
/*  93 */     this.renderdata.rf4 = 0.0F;
/*  94 */     this.renderdata.ri1 = 0;
/*  95 */     this.renderdata.ri2 = 0;
/*  96 */     this.renderdata.ri3 = 0;
/*  97 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/* 103 */     super.func_110147_ax();
/* 104 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/* 105 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 106 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Triffid_stats.attack);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 110 */     if (func_104002_bU()) return false; 
/* 111 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 119 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 120 */     super.func_70071_h_();
/*     */ 
/*     */     
/* 123 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1) {
/*     */ 
/*     */ 
/*     */       
/* 127 */       int ix = (int)this.field_70165_t;
/* 128 */       int iz = (int)this.field_70161_v;
/*     */       int k;
/* 130 */       for (k = -5; k <= 5; k++) {
/*     */         
/* 132 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v + k);
/* 133 */         if (bid != Blocks.field_150350_a) {
/* 134 */           if (k < 0) iz--; 
/* 135 */           if (k > 0) iz++; 
/*     */         } 
/*     */       } 
/* 138 */       for (k = -5; k <= 5; k++) {
/*     */         
/* 140 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + k, (int)this.field_70163_u - 1, (int)this.field_70161_v);
/* 141 */         if (bid != Blocks.field_150350_a) {
/* 142 */           if (k < 0) ix--; 
/* 143 */           if (k > 0) ix++; 
/*     */         } 
/*     */       } 
/* 146 */       func_70661_as().func_75492_a(ix, this.field_70163_u, iz, 1.0D);
/*     */     } 
/*     */     
/* 149 */     if (this.hurt_timer <= 0) {
/* 150 */       EntityLivingBase e = findSomethingToAttack();
/* 151 */       if (e != null) {
/*     */         
/* 153 */         this.field_70177_z = (float)Math.toDegrees(Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t)) - 90.0F;
/* 154 */         for (; this.field_70177_z < 0.0F; this.field_70177_z += 360.0F);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 162 */     return OreSpawnMain.Triffid_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/* 169 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/* 174 */     this.renderdata.rf1 = r.rf1;
/* 175 */     this.renderdata.rf2 = r.rf2;
/* 176 */     this.renderdata.rf3 = r.rf3;
/* 177 */     this.renderdata.rf4 = r.rf4;
/* 178 */     this.renderdata.ri1 = r.ri1;
/* 179 */     this.renderdata.ri2 = r.ri2;
/* 180 */     this.renderdata.ri3 = r.ri3;
/* 181 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 189 */     return OreSpawnMain.Triffid_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 197 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 206 */     super.func_70636_d();
/* 207 */     if (!this.field_70170_p.field_72995_K && this.hurt_timer > 0) {
/* 208 */       this.field_70159_w = this.field_70179_y = 0.0D;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTriffidHealth() {
/* 216 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 226 */     return "orespawn:triffid_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 234 */     return "orespawn:triffid_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 242 */     return "orespawn:triffid_dead";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 249 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 256 */     return 1.0F;
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
/* 267 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 268 */     if (i == 0) return Items.field_151074_bl; 
/* 269 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 274 */     EntityItem var3 = null;
/* 275 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 277 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
/*     */     
/* 279 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 280 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 287 */     int i = 4 + this.field_70170_p.field_73012_v.nextInt(6);
/* 288 */     for (int var4 = 0; var4 < i; var4++) {
/* 289 */       dropItemRand(OreSpawnMain.GreenGoo, 1);
/*     */     }
/* 291 */     dropItemRand(Items.field_151160_bD, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 300 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 305 */     boolean ret = super.func_70652_k(par1Entity);
/* 306 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 314 */     boolean ret = false;
/*     */     
/* 316 */     if (this.hurt_timer > 0 || getOpenClosed() == 0) {
/* 317 */       this.hurt_timer = 300;
/* 318 */       setAttacking(0);
/* 319 */       return false;
/*     */     } 
/* 321 */     ret = super.func_70097_a(par1DamageSource, par2);
/* 322 */     this.hurt_timer = 300;
/* 323 */     setOpenClosed(0);
/* 324 */     setAttacking(0);
/* 325 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 331 */     if (this.field_70128_L)
/*     */       return; 
/* 333 */     super.func_70619_bc();
/*     */     
/* 335 */     if (this.hurt_timer > 0) {
/* 336 */       this.hurt_timer--;
/* 337 */       func_70015_d(0);
/* 338 */       setOpenClosed(0);
/*     */     } 
/*     */     
/* 341 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1 && 
/* 342 */       func_110143_aJ() < mygetMaxHealth())
/*     */     {
/* 344 */       func_70691_i(1.0F);
/*     */     }
/*     */ 
/*     */     
/* 348 */     if (this.field_70170_p.field_73012_v.nextInt(80) == 2 && 
/* 349 */       this.hurt_timer <= 0) {
/* 350 */       if (this.field_70170_p.field_73012_v.nextInt(8) == 1) {
/* 351 */         setOpenClosed(1);
/*     */       } else {
/* 353 */         setOpenClosed(0);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 358 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1 && this.hurt_timer <= 0) {
/* 359 */       EntityLivingBase e = findSomethingToAttack();
/* 360 */       if (e != null) {
/* 361 */         setOpenClosed(1);
/* 362 */         if (func_70068_e((Entity)e) < 25.0D) {
/* 363 */           this.field_70177_z = (float)Math.toDegrees(Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t)) - 90.0F;
/* 364 */           for (; this.field_70177_z < 0.0F; this.field_70177_z += 360.0F);
/* 365 */           setAttacking(1);
/* 366 */           func_70652_k((Entity)e);
/*     */         } else {
/* 368 */           setAttacking(0);
/*     */         } 
/*     */       } else {
/* 371 */         setAttacking(0);
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
/* 384 */     if (par1EntityLiving == null)
/*     */     {
/* 386 */       return false;
/*     */     }
/* 388 */     if (par1EntityLiving == this)
/*     */     {
/* 390 */       return false;
/*     */     }
/* 392 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 394 */       return false;
/*     */     }
/*     */     
/* 397 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 399 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 402 */       return false;
/*     */     }
/* 404 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
/*     */     {
/* 406 */       return false;
/*     */     }
/* 408 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 410 */       return false;
/*     */     }
/* 412 */     if (par1EntityLiving instanceof Triffid)
/*     */     {
/* 414 */       return false;
/*     */     }
/* 416 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 418 */       return false;
/*     */     }
/* 420 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 422 */       return false;
/*     */     }
/* 424 */     if (par1EntityLiving instanceof PitchBlack)
/*     */     {
/* 426 */       return false;
/*     */     }
/* 428 */     if (par1EntityLiving instanceof Dragon)
/*     */     {
/* 430 */       return false;
/*     */     }
/*     */     
/* 433 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 435 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 436 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 437 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 441 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 446 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 447 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 8.0D, 10.0D));
/* 448 */     Collections.sort(var5, this.TargetSorter);
/* 449 */     Iterator<?> var2 = var5.iterator();
/* 450 */     Entity var3 = null;
/* 451 */     EntityLivingBase var4 = null;
/*     */     
/* 453 */     while (var2.hasNext()) {
/*     */       
/* 455 */       var3 = (Entity)var2.next();
/* 456 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 458 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 460 */         return var4;
/*     */       }
/*     */     } 
/* 463 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/* 468 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/* 473 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getOpenClosed() {
/* 478 */     return this.field_70180_af.func_75683_a(21);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setOpenClosed(int par1) {
/* 483 */     this.field_70180_af.func_75692_b(21, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 491 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Triffid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */