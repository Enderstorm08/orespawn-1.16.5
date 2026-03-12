/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.UUID;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.attributes.AttributeModifier;
/*     */ import net.minecraft.entity.ai.attributes.IAttributeInstance;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EnderReaper
/*     */   extends EntityMob
/*     */ {
/*  28 */   private static final UUID attackingSpeedBoostModifierUUID = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
/*  29 */   private static final AttributeModifier attackingSpeedBoostModifier = (new AttributeModifier(attackingSpeedBoostModifierUUID, "Attacking speed boost", 6.199999809265137D, 0)).func_111168_a(false);
/*     */ 
/*     */ 
/*     */   
/*     */   private int teleportDelay;
/*     */ 
/*     */ 
/*     */   
/*     */   private int stareTimer;
/*     */ 
/*     */   
/*     */   private Entity lastEntityToAttack;
/*     */ 
/*     */ 
/*     */   
/*     */   public EnderReaper(World par1World) {
/*  45 */     super(par1World);
/*  46 */     func_70105_a(0.7F, 2.9F);
/*  47 */     this.field_70138_W = 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  52 */     super.func_110147_ax();
/*  53 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(OreSpawnMain.EnderReaper_stats.health);
/*  54 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.37D);
/*  55 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.EnderReaper_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  60 */     super.func_70088_a();
/*  61 */     this.field_70180_af.func_75682_a(18, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/*  69 */     super.func_70014_b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/*  77 */     super.func_70037_a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Entity func_70782_k() {
/*  86 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/*  87 */     EntityPlayer entityplayer = this.field_70170_p.func_72856_b((Entity)this, 81.0D);
/*     */     
/*  89 */     if (entityplayer != null) {
/*     */       
/*  91 */       if (shouldAttackPlayer(entityplayer)) {
/*     */ 
/*     */         
/*  94 */         if (this.stareTimer == 0)
/*     */         {
/*  96 */           this.field_70170_p.func_72956_a((Entity)entityplayer, "mob.endermen.stare", 1.0F, 1.0F);
/*     */         }
/*     */         
/*  99 */         if (this.stareTimer++ == 5)
/*     */         {
/* 101 */           this.stareTimer = 0;
/*     */         }
/*     */         
/* 104 */         setScreaming(true);
/* 105 */         return (Entity)entityplayer;
/*     */       } 
/*     */ 
/*     */       
/* 109 */       this.stareTimer = 0;
/* 110 */       setScreaming(false);
/*     */     } 
/*     */ 
/*     */     
/* 114 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean shouldAttackPlayer(EntityPlayer par1EntityPlayer) {
/* 122 */     ItemStack itemstack = par1EntityPlayer.field_71071_by.field_70460_b[3];
/*     */     
/* 124 */     if (itemstack != null && itemstack.func_77973_b() == Item.func_150898_a(Blocks.field_150423_aK))
/*     */     {
/* 126 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 130 */     Vec3 vec3 = par1EntityPlayer.func_70676_i(1.0F).func_72432_b();
/* 131 */     Vec3 vec31 = Vec3.func_72443_a(this.field_70165_t - par1EntityPlayer.field_70165_t, this.field_70121_D.field_72338_b + (this.field_70131_O / 2.0F) - par1EntityPlayer.field_70163_u + par1EntityPlayer.func_70047_e(), this.field_70161_v - par1EntityPlayer.field_70161_v);
/* 132 */     double d0 = vec31.func_72433_c();
/* 133 */     vec31 = vec31.func_72432_b();
/* 134 */     double d1 = vec3.func_72430_b(vec31);
/* 135 */     return (d1 > 1.0D - 0.025D / d0) ? par1EntityPlayer.func_70685_l((Entity)this) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 145 */     if (func_70026_G())
/*     */     {
/* 147 */       func_70097_a(DamageSource.field_76369_e, 1.0F);
/*     */     }
/*     */     
/* 150 */     if (this.lastEntityToAttack != this.field_70789_a) {
/*     */       
/* 152 */       IAttributeInstance attributeinstance = func_110148_a(SharedMonsterAttributes.field_111263_d);
/* 153 */       attributeinstance.func_111124_b(attackingSpeedBoostModifier);
/*     */       
/* 155 */       if (this.field_70789_a != null)
/*     */       {
/* 157 */         attributeinstance.func_111121_a(attackingSpeedBoostModifier);
/*     */       }
/*     */     } 
/*     */     
/* 161 */     this.lastEntityToAttack = this.field_70789_a;
/*     */ 
/*     */ 
/*     */     
/* 165 */     for (int i = 0; i < 2; i++)
/*     */     {
/* 167 */       this.field_70170_p.func_72869_a("portal", this.field_70165_t + (this.field_70146_Z.nextDouble() - 0.5D) * this.field_70130_N, this.field_70163_u + this.field_70146_Z.nextDouble() * this.field_70131_O - 0.25D, this.field_70161_v + (this.field_70146_Z.nextDouble() - 0.5D) * this.field_70130_N, (this.field_70146_Z.nextDouble() - 0.5D) * 2.0D, -this.field_70146_Z.nextDouble(), (this.field_70146_Z.nextDouble() - 0.5D) * 2.0D);
/*     */     }
/*     */     
/* 170 */     if (this.field_70170_p.func_72935_r() && !this.field_70170_p.field_72995_K) {
/*     */       
/* 172 */       float f = func_70013_c(1.0F);
/*     */       
/* 174 */       if (f > 0.5F && this.field_70170_p.func_72937_j(MathHelper.func_76128_c(this.field_70165_t), MathHelper.func_76128_c(this.field_70163_u), MathHelper.func_76128_c(this.field_70161_v)) && this.field_70146_Z.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/*     */         
/* 176 */         this.field_70789_a = null;
/* 177 */         setScreaming(false);
/* 178 */         teleportRandomly();
/*     */       } 
/*     */     } 
/*     */     
/* 182 */     if (func_70026_G() || func_70027_ad()) {
/*     */       
/* 184 */       setScreaming(false);
/* 185 */       teleportRandomly();
/*     */     } 
/*     */ 
/*     */     
/* 189 */     this.field_70703_bu = false;
/*     */     
/* 191 */     if (this.field_70789_a != null)
/*     */     {
/* 193 */       func_70625_a(this.field_70789_a, 100.0F, 100.0F);
/*     */     }
/*     */     
/* 196 */     if (!this.field_70170_p.field_72995_K && func_70089_S())
/*     */     {
/* 198 */       if (this.field_70789_a != null) {
/*     */         
/* 200 */         if (this.field_70789_a instanceof EntityPlayer && shouldAttackPlayer((EntityPlayer)this.field_70789_a))
/*     */         {
/* 202 */           if (this.field_70789_a.func_70068_e((Entity)this) < 16.0D)
/*     */           {
/* 204 */             teleportRandomly();
/*     */           }
/*     */           
/* 207 */           this.teleportDelay = 0;
/*     */         }
/* 209 */         else if (this.field_70789_a.func_70068_e((Entity)this) > 256.0D && this.teleportDelay++ >= 30 && teleportToEntity(this.field_70789_a))
/*     */         {
/* 211 */           this.teleportDelay = 0;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 216 */         setScreaming(false);
/* 217 */         this.teleportDelay = 0;
/*     */       } 
/*     */     }
/*     */     
/* 221 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportRandomly() {
/* 229 */     double d0 = this.field_70165_t + (this.field_70146_Z.nextDouble() - 0.5D) * 64.0D;
/* 230 */     double d1 = this.field_70163_u + (this.field_70146_Z.nextInt(64) - 32);
/* 231 */     double d2 = this.field_70161_v + (this.field_70146_Z.nextDouble() - 0.5D) * 64.0D;
/* 232 */     return teleportTo(d0, d1, d2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportToEntity(Entity par1Entity) {
/* 240 */     Vec3 vec3 = Vec3.func_72443_a(this.field_70165_t - par1Entity.field_70165_t, this.field_70121_D.field_72338_b + (this.field_70131_O / 2.0F) - par1Entity.field_70163_u + par1Entity.func_70047_e(), this.field_70161_v - par1Entity.field_70161_v);
/* 241 */     vec3 = vec3.func_72432_b();
/* 242 */     double d0 = 16.0D;
/* 243 */     double d1 = this.field_70165_t + (this.field_70146_Z.nextDouble() - 0.5D) * 8.0D - vec3.field_72450_a * d0;
/* 244 */     double d2 = this.field_70163_u + (this.field_70146_Z.nextInt(16) - 8) - vec3.field_72448_b * d0;
/* 245 */     double d3 = this.field_70161_v + (this.field_70146_Z.nextDouble() - 0.5D) * 8.0D - vec3.field_72449_c * d0;
/* 246 */     return teleportTo(d1, d2, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportTo(double par1, double par3, double par5) {
/* 256 */     double d3 = this.field_70165_t;
/* 257 */     double d4 = this.field_70163_u;
/* 258 */     double d5 = this.field_70161_v;
/* 259 */     this.field_70165_t = par1;
/* 260 */     this.field_70163_u = par3;
/* 261 */     this.field_70161_v = par5;
/* 262 */     boolean flag = false;
/* 263 */     int i = MathHelper.func_76128_c(this.field_70165_t);
/* 264 */     int j = MathHelper.func_76128_c(this.field_70163_u);
/* 265 */     int k = MathHelper.func_76128_c(this.field_70161_v);
/*     */ 
/*     */     
/* 268 */     if (this.field_70170_p.func_72899_e(i, j, k)) {
/*     */       
/* 270 */       boolean flag1 = false;
/*     */       
/* 272 */       while (!flag1 && j > 0) {
/*     */         
/* 274 */         Block l = this.field_70170_p.func_147439_a(i, j - 1, k);
/*     */         
/* 276 */         if (l != Blocks.field_150350_a && l.func_149688_o().func_76230_c()) {
/*     */           
/* 278 */           flag1 = true;
/*     */           
/*     */           continue;
/*     */         } 
/* 282 */         this.field_70163_u--;
/* 283 */         j--;
/*     */       } 
/*     */ 
/*     */       
/* 287 */       if (flag1) {
/*     */         
/* 289 */         func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*     */         
/* 291 */         if (this.field_70170_p.func_72945_a((Entity)this, this.field_70121_D).isEmpty() && !this.field_70170_p.func_72953_d(this.field_70121_D))
/*     */         {
/* 293 */           flag = true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 298 */     if (!flag) {
/*     */       
/* 300 */       func_70107_b(d3, d4, d5);
/* 301 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 305 */     short short1 = 128;
/*     */     
/* 307 */     for (int lx = 0; lx < short1; lx++) {
/*     */       
/* 309 */       double d6 = lx / (short1 - 1.0D);
/* 310 */       float f = (this.field_70146_Z.nextFloat() - 0.5F) * 0.2F;
/* 311 */       float f1 = (this.field_70146_Z.nextFloat() - 0.5F) * 0.2F;
/* 312 */       float f2 = (this.field_70146_Z.nextFloat() - 0.5F) * 0.2F;
/* 313 */       double d7 = d3 + (this.field_70165_t - d3) * d6 + (this.field_70146_Z.nextDouble() - 0.5D) * this.field_70130_N * 2.0D;
/* 314 */       double d8 = d4 + (this.field_70163_u - d4) * d6 + this.field_70146_Z.nextDouble() * this.field_70131_O;
/* 315 */       double d9 = d5 + (this.field_70161_v - d5) * d6 + (this.field_70146_Z.nextDouble() - 0.5D) * this.field_70130_N * 2.0D;
/* 316 */       this.field_70170_p.func_72869_a("portal", d7, d8, d9, f, f1, f2);
/*     */     } 
/*     */     
/* 319 */     this.field_70170_p.func_72908_a(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
/* 320 */     func_85030_a("mob.endermen.portal", 1.0F, 1.0F);
/* 321 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 330 */     return isScreaming() ? "mob.endermen.scream" : "mob.endermen.idle";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 338 */     return "mob.endermen.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 346 */     return "mob.endermen.death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 354 */     return Items.field_151061_bv;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 362 */     return OreSpawnMain.EnderReaper_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 371 */     Item j = func_146068_u();
/*     */     
/* 373 */     if (j != null) {
/*     */       
/* 375 */       int k = this.field_70146_Z.nextInt(2 + par2);
/*     */       
/* 377 */       for (int l = 0; l < k; l++)
/*     */       {
/* 379 */         func_145779_a(j, 1);
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
/* 390 */     if (func_85032_ar())
/*     */     {
/* 392 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 396 */     setScreaming(true);
/*     */     
/* 398 */     if (par1DamageSource instanceof net.minecraft.util.EntityDamageSourceIndirect) {
/*     */ 
/*     */       
/* 401 */       for (int i = 0; i < 16; i++) {
/*     */         
/* 403 */         if (teleportRandomly())
/*     */         {
/* 405 */           return true;
/*     */         }
/*     */       } 
/*     */       
/* 409 */       return super.func_70097_a(par1DamageSource, par2);
/*     */     } 
/*     */ 
/*     */     
/* 413 */     return super.func_70097_a(par1DamageSource, par2);
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
/* 424 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 426 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 428 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 430 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 431 */           if (bid == Blocks.field_150474_ac) {
/* 432 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 433 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 434 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 435 */             if (s != null && 
/* 436 */               s.equals("Ender Reaper")) {
/* 437 */               return true;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 444 */     if (!func_70814_o()) return false; 
/* 445 */     if (this.field_70170_p.func_72935_r() == true) return false; 
/* 446 */     if (this.field_70163_u < 30.0D) return false; 
/* 447 */     EnderReaper target = null;
/* 448 */     target = (EnderReaper)this.field_70170_p.func_72857_a(EnderReaper.class, this.field_70121_D.func_72314_b(16.0D, 8.0D, 16.0D), (Entity)this);
/* 449 */     if (target != null)
/*     */     {
/* 451 */       return false;
/*     */     }
/* 453 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isScreaming() {
/* 458 */     return (this.field_70180_af.func_75683_a(18) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setScreaming(boolean par1) {
/* 463 */     this.field_70180_af.func_75692_b(18, Byte.valueOf((byte)(par1 ? 1 : 0)));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EnderReaper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */