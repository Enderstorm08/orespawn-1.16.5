/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
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
/*     */ import net.minecraft.nbt.NBTTagCompound;
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
/*     */ public class WormLarge
/*     */   extends EntityMob
/*     */ {
/*  36 */   private int wormsSpawned = 0;
/*  37 */   private int spawnered = 0;
/*     */   
/*     */   public WormLarge(World par1World) {
/*  40 */     super(par1World);
/*     */     
/*  42 */     func_70105_a(1.55F, 2.5F);
/*  43 */     func_70661_as().func_75491_a(true);
/*  44 */     this.field_70728_aV = 2050;
/*  45 */     this.field_70145_X = true;
/*  46 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  47 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  48 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
/*  49 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  50 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  55 */     super.func_110147_ax();
/*  56 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  57 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.20000000298023224D);
/*  58 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.WormLarge_stats.attack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  64 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  69 */     if (this.spawnered != 0) return true; 
/*  70 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  78 */     return 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  86 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  94 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 102 */     return "orespawn:big_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 110 */     return "orespawn:alo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 118 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 127 */     return OreSpawnMain.WormLarge_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 135 */     return OreSpawnMain.WormLarge_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void pointAtEntity(EntityLivingBase e) {
/* 149 */     double d1 = e.field_70165_t - this.field_70165_t;
/* 150 */     double d2 = e.field_70161_v - this.field_70161_v;
/* 151 */     float d = (float)Math.atan2(d2, d1);
/* 152 */     float f2 = (float)(d * 180.0D / Math.PI) - 90.0F;
/* 153 */     this.field_70177_z = this.field_70759_as = f2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 161 */     EntityPlayer target = null;
/* 162 */     WormMedium worms = null;
/* 163 */     EntityCreature newent = null;
/* 164 */     super.func_70636_d();
/*     */ 
/*     */     
/* 167 */     worms = (WormMedium)this.field_70170_p.func_72857_a(WormMedium.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D), (Entity)this);
/* 168 */     if (worms == null) target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D), (Entity)this); 
/* 169 */     if ((worms == null && target != null) || OreSpawnMain.PlayNicely != 0) {
/*     */       
/* 171 */       if (target != null) pointAtEntity((EntityLivingBase)target); 
/* 172 */       Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/* 173 */       if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 174 */       if (bid != Blocks.field_150350_a) {
/* 175 */         this.field_70181_x += 0.25D;
/* 176 */         this.field_70163_u += 0.10000000149011612D;
/*     */       } else {
/* 178 */         this.field_70145_X = false;
/*     */       } 
/*     */     } else {
/* 181 */       this.field_70145_X = true;
/* 182 */       Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)(this.field_70163_u + 3.5D), (int)this.field_70161_v);
/* 183 */       if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 184 */       if (bid != Blocks.field_150350_a) {
/* 185 */         this.field_70181_x += 0.10000000149011612D;
/* 186 */         this.field_70163_u += 0.05000000074505806D;
/* 187 */         if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150348_b) func_70106_y();
/*     */       
/*     */       } 
/*     */     } 
/* 191 */     if (this.field_70145_X == true) {
/* 192 */       this.field_70181_x -= 0.01D;
/* 193 */       this.field_70159_w = 0.0D;
/* 194 */       this.field_70179_y = 0.0D;
/* 195 */       this.field_70701_bs = 0.0F;
/*     */     } 
/*     */     
/* 198 */     if (this.field_70170_p.field_72995_K)
/*     */       return; 
/* 200 */     if (this.wormsSpawned != 0)
/* 201 */       return;  this.wormsSpawned = 1;
/*     */     
/* 203 */     for (int i = 0; i < 20; i++) {
/*     */ 
/*     */       
/* 206 */       newent = (EntityCreature)spawnCreature(this.field_70170_p, "Small Worm", this.field_70165_t + this.field_70170_p.field_73012_v.nextInt(6) - this.field_70170_p.field_73012_v.nextInt(6), this.field_70163_u, this.field_70161_v + this.field_70170_p.field_73012_v.nextInt(6) - this.field_70170_p.field_73012_v.nextInt(6));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 211 */       newent = (EntityCreature)spawnCreature(this.field_70170_p, "Medium Worm", this.field_70165_t + this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5), this.field_70163_u, this.field_70161_v + this.field_70170_p.field_73012_v.nextInt(5) - this.field_70170_p.field_73012_v.nextInt(5));
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
/*     */   public void func_70071_h_() {
/* 223 */     if (func_104002_bU()) this.field_70145_X = false; 
/* 224 */     super.func_70071_h_();
/* 225 */     this.field_70181_x *= 0.85D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 230 */     int bid = 0;
/* 231 */     EntityPlayer target = null;
/* 232 */     WormMedium worms = null;
/*     */     
/* 234 */     if (this.field_70128_L)
/* 235 */       return;  if (!this.field_70145_X) super.func_70619_bc(); 
/* 236 */     if (OreSpawnMain.PlayNicely != 0)
/* 237 */       return;  worms = (WormMedium)this.field_70170_p.func_72857_a(WormMedium.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D), (Entity)this);
/* 238 */     if (worms != null)
/*     */       return; 
/* 240 */     target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(8.0D, 6.0D, 8.0D), (Entity)this);
/* 241 */     if (target != null && 
/* 242 */       target.field_71075_bZ.field_75098_d == true) {
/* 243 */       target = null;
/*     */     }
/*     */     
/* 246 */     if (target != null) {
/*     */       
/* 248 */       pointAtEntity((EntityLivingBase)target);
/* 249 */       func_70661_as().func_75492_a(target.field_70165_t, target.field_70163_u, target.field_70161_v, 1.0D);
/* 250 */       if (this.field_70170_p.field_73012_v.nextInt(10) == 1 && func_70032_d((Entity)target) < 3.0D) {
/*     */         
/* 252 */         func_70652_k((Entity)target);
/* 253 */         if (this.field_70170_p.field_73012_v.nextInt(4) == 1) {
/* 254 */           ItemStack boots = target.func_71124_b(4);
/* 255 */           if (boots != null) {
/* 256 */             target.func_70062_b(4, null);
/* 257 */             bid = boots.func_77958_k() - boots.func_77960_j();
/* 258 */             if (bid > 10) {
/* 259 */               bid /= 10;
/*     */             } else {
/* 261 */               bid = 1;
/*     */             } 
/* 263 */             boots.func_77972_a(bid, (EntityLivingBase)this);
/* 264 */             EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 3.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 269 */             this.field_70170_p.func_72838_d((Entity)var3);
/*     */           } else {
/* 271 */             boots = target.func_71124_b(3);
/* 272 */             if (boots != null) {
/* 273 */               target.func_70062_b(3, null);
/* 274 */               bid = boots.func_77958_k() - boots.func_77960_j();
/* 275 */               if (bid > 10) {
/* 276 */                 bid /= 10;
/*     */               } else {
/* 278 */                 bid = 1;
/*     */               } 
/* 280 */               boots.func_77972_a(bid, (EntityLivingBase)this);
/* 281 */               EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 3.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 286 */               this.field_70170_p.func_72838_d((Entity)var3);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 291 */         if (this.field_70170_p.field_73012_v.nextInt(4) == 1) {
/* 292 */           ItemStack boots = target.func_71124_b(0);
/* 293 */           if (boots != null) {
/* 294 */             target.func_70062_b(0, null);
/* 295 */             bid = boots.func_77958_k() - boots.func_77960_j();
/* 296 */             if (bid > 10) {
/* 297 */               bid /= 10;
/*     */             } else {
/* 299 */               bid = 1;
/*     */             } 
/* 301 */             boots.func_77972_a(bid, (EntityLivingBase)this);
/* 302 */             EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 3.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 307 */             this.field_70170_p.func_72838_d((Entity)var3);
/*     */           } 
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
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 321 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {
/* 328 */     if (!this.field_70145_X) super.func_70069_a(par1);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {
/* 336 */     if (!this.field_70145_X) super.func_70064_a(par1, par3);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_145773_az() {
/* 344 */     return true;
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
/* 355 */     for (k = -3; k < 3; k++) {
/*     */       
/* 357 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 359 */         for (int m = 0; m < 5; m++) {
/*     */           
/* 361 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + m, (int)this.field_70161_v + k);
/* 362 */           if (bid == Blocks.field_150474_ac) {
/* 363 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 364 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + m, (int)this.field_70161_v + k);
/* 365 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 366 */             if (s != null && 
/* 367 */               s.equals("Large Worm")) {
/* 368 */               this.wormsSpawned = 1;
/* 369 */               this.spawnered = 1;
/* 370 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 378 */     if (this.field_70163_u < 50.0D) return false;
/*     */     
/* 380 */     WormLarge target = null;
/* 381 */     target = (WormLarge)this.field_70170_p.func_72857_a(WormLarge.class, this.field_70121_D.func_72314_b(32.0D, 8.0D, 32.0D), (Entity)this);
/* 382 */     if (target != null)
/*     */     {
/* 384 */       return false;
/*     */     }
/*     */     int i;
/* 387 */     for (i = -6; i <= 6; i++) {
/* 388 */       for (int j = -6; j <= 6; j++) {
/* 389 */         for (k = -2; k >= -8; k--) {
/* 390 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + k, (int)this.field_70161_v + j);
/* 391 */           if (bid == Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 395 */     for (i = -6; i <= 6; i++) {
/* 396 */       for (int j = -6; j <= 6; j++) {
/* 397 */         for (k = 2; k <= 8; k++) {
/* 398 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + i, (int)this.field_70163_u + k, (int)this.field_70161_v + j);
/* 399 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 403 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 413 */     boolean ret = false;
/*     */     
/* 415 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 416 */       return ret;
/*     */     }
/*     */     
/* 419 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 421 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 429 */     super.func_70014_b(par1NBTTagCompound);
/* 430 */     par1NBTTagCompound.func_74768_a("wormsSpawned", this.wormsSpawned);
/* 431 */     par1NBTTagCompound.func_74768_a("wormsSpawnered", this.spawnered);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 439 */     super.func_70037_a(par1NBTTagCompound);
/* 440 */     this.wormsSpawned = par1NBTTagCompound.func_74762_e("wormsSpawned");
/* 441 */     this.spawnered = par1NBTTagCompound.func_74762_e("wormsSpawnered");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 450 */     Entity var8 = null;
/* 451 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 452 */     if (var8 != null) {
/*     */ 
/*     */       
/* 455 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 458 */       par0World.func_72838_d(var8);
/*     */     } 
/*     */     
/* 461 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 469 */     return Items.field_151078_bh;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 474 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 2.5D + this.field_70170_p.field_73012_v.nextInt(4), this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
/*     */     
/* 476 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 482 */     dropItemRand(OreSpawnMain.WormTooth, 1);
/* 483 */     dropItemRand(Items.field_151160_bD, 1);
/*     */     int var4;
/* 485 */     for (var4 = 0; var4 < 6; var4++) {
/* 486 */       dropItemRand(Items.field_151078_bh, 1);
/*     */     }
/* 488 */     for (var4 = 0; var4 < 6; var4++) {
/* 489 */       dropItemRand(Items.field_151116_aA, 1);
/*     */     }
/* 491 */     for (var4 = 0; var4 < 8; var4++) {
/* 492 */       dropItemRand(Item.func_150898_a(Blocks.field_150346_d), 1);
/*     */     }
/* 494 */     for (var4 = 0; var4 < 16; var4++) {
/* 495 */       dropItemRand(Items.field_151074_bl, 1);
/*     */     }
/* 497 */     for (var4 = 0; var4 < 5; var4++) {
/* 498 */       dropItemRand(Items.field_151045_i, 1);
/*     */     }
/* 500 */     for (var4 = 0; var4 < 4; var4++) {
/* 501 */       dropItemRand(OreSpawnMain.UraniumNugget, 1);
/*     */     }
/* 503 */     for (var4 = 0; var4 < 4; var4++)
/* 504 */       dropItemRand(OreSpawnMain.TitaniumNugget, 1); 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WormLarge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */