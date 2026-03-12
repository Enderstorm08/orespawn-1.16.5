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
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Rat
/*     */   extends EntityMob
/*     */ {
/*  45 */   private GenericTargetSorter TargetSorter = null;
/*  46 */   private float moveSpeed = 0.25F;
/*  47 */   private String myowner = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public Rat(World par1World) {
/*  52 */     super(par1World);
/*  53 */     func_70105_a(0.25F, 0.5F);
/*  54 */     func_70661_as().func_75491_a(true);
/*  55 */     this.field_70728_aV = 5;
/*  56 */     this.field_70174_ab = 10;
/*  57 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  58 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858D));
/*  59 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  60 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*  61 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  62 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  63 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  64 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  69 */     super.func_110147_ax();
/*  70 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  71 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  72 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Rat_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  77 */     super.func_70088_a();
/*  78 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  82 */     if (func_104002_bU()) return false; 
/*  83 */     if (this.myowner != null) return false; 
/*  84 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/*  89 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/*  94 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/*  99 */     return OreSpawnMain.Rat_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 107 */     return OreSpawnMain.Rat_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 115 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 124 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 132 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 133 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70664_aZ() {
/* 139 */     super.func_70664_aZ();
/* 140 */     this.field_70181_x += 0.25D;
/* 141 */     this.field_70163_u += 0.25D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 149 */     return "orespawn:ratlive";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 157 */     return "orespawn:rathit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 165 */     return "orespawn:ratdead";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 172 */     return 0.45F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 179 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 188 */     return Items.field_151078_bh;
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 203 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 208 */     if (this.field_70128_L)
/* 209 */       return;  super.func_70619_bc();
/* 210 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 211 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 212 */       EntityLivingBase e = findSomethingToAttack();
/* 213 */       if (e != null) {
/* 214 */         setAttacking(1);
/* 215 */         func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 216 */         if (func_70068_e((Entity)e) < 4.0D)
/*     */         {
/* 218 */           if (this.field_70146_Z.nextInt(8) == 0 || this.field_70146_Z.nextInt(7) == 1)
/*     */           {
/* 220 */             func_70652_k((Entity)e);
/*     */           }
/*     */         }
/*     */       } else {
/* 224 */         setAttacking(0);
/* 225 */         if (this.myowner != null) {
/* 226 */           EntityPlayer p = this.field_70170_p.func_72924_a(this.myowner);
/* 227 */           if (p != null) {
/* 228 */             if (func_70068_e((Entity)p) > 64.0D) {
/* 229 */               func_70661_as().func_75497_a((Entity)p, 1.75D);
/*     */             }
/* 231 */             if (func_70068_e((Entity)p) > 256.0D) {
/* 232 */               func_70107_b(p.field_70165_t + this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat(), p.field_70163_u, p.field_70161_v + this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 239 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1) func_70691_i(1.0F);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 250 */     if (par1EntityLiving == null)
/*     */     {
/* 252 */       return false;
/*     */     }
/* 254 */     if (par1EntityLiving == this)
/*     */     {
/* 256 */       return false;
/*     */     }
/* 258 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 260 */       return false;
/*     */     }
/*     */     
/* 263 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 265 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 268 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 272 */     if (par1EntityLiving instanceof Irukandji)
/*     */     {
/* 274 */       return false;
/*     */     }
/* 276 */     if (par1EntityLiving instanceof Skate)
/*     */     {
/* 278 */       return false;
/*     */     }
/* 280 */     if (par1EntityLiving instanceof Whale)
/*     */     {
/* 282 */       return false;
/*     */     }
/* 284 */     if (par1EntityLiving instanceof Flounder)
/*     */     {
/* 286 */       return false;
/*     */     }
/* 288 */     if (par1EntityLiving instanceof Rat)
/*     */     {
/* 290 */       return false;
/*     */     }
/* 292 */     if (par1EntityLiving instanceof Ghost)
/*     */     {
/* 294 */       return false;
/*     */     }
/* 296 */     if (par1EntityLiving instanceof GhostSkelly)
/*     */     {
/* 298 */       return false;
/*     */     }
/* 300 */     if (par1EntityLiving instanceof DungeonBeast)
/*     */     {
/* 302 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 306 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 308 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 309 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 310 */         return false;
/*     */       }
/*     */       
/* 313 */       if (this.myowner != null) {
/* 314 */         if (this.myowner.equals(p.func_110124_au().toString())) {
/* 315 */           return false;
/*     */         }
/* 317 */         if (OreSpawnMain.RatPlayerFriendly != 0) {
/* 318 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 324 */     if (this.myowner != null && 
/* 325 */       par1EntityLiving instanceof EntityTameable) {
/* 326 */       EntityTameable e = (EntityTameable)par1EntityLiving;
/* 327 */       if (OreSpawnMain.RatPetFriendly != 0 && e.func_70909_n()) {
/* 328 */         return false;
/*     */       }
/* 330 */       if (e.func_152113_b() != null && this.myowner.equals(e.func_152113_b())) {
/* 331 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 336 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 341 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 342 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(9.0D, 2.0D, 9.0D));
/* 343 */     Collections.sort(var5, this.TargetSorter);
/* 344 */     Iterator<?> var2 = var5.iterator();
/* 345 */     Entity var3 = null;
/* 346 */     EntityLivingBase var4 = null;
/*     */     
/* 348 */     while (var2.hasNext()) {
/*     */       
/* 350 */       var3 = (Entity)var2.next();
/* 351 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 353 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 355 */         return var4;
/*     */       }
/*     */     } 
/* 358 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOwner(EntityLivingBase e) {
/* 363 */     EntityPlayer p = null;
/* 364 */     if (e != null && 
/* 365 */       e instanceof EntityPlayer) {
/* 366 */       p = (EntityPlayer)e;
/* 367 */       String s = p.func_110124_au().toString();
/* 368 */       if (s != null) {
/* 369 */         this.myowner = s;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 380 */     super.func_70014_b(par1NBTTagCompound);
/* 381 */     if (this.myowner == null) this.myowner = "null"; 
/* 382 */     par1NBTTagCompound.func_74778_a("MyOwner", this.myowner);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 390 */     super.func_70037_a(par1NBTTagCompound);
/* 391 */     this.myowner = par1NBTTagCompound.func_74779_i("MyOwner");
/* 392 */     if (this.myowner != null && 
/* 393 */       this.myowner.equals("null")) {
/* 394 */       this.myowner = null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 403 */     boolean ret = false;
/* 404 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 405 */       return ret;
/*     */     }
/*     */     
/* 408 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 410 */     return ret;
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
/* 421 */     int sc = 0;
/*     */     int k;
/* 423 */     for (k = -2; k < 2; k++) {
/*     */       
/* 425 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 427 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 429 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 430 */           if (bid == Blocks.field_150474_ac) {
/* 431 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 432 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 433 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 434 */             if (s != null && 
/* 435 */               s.equals("Rat")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 443 */     if (!func_70814_o()) return false;
/*     */ 
/*     */     
/* 446 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID5) {
/* 447 */       if (this.field_70163_u > 50.0D) return false; 
/* 448 */       for (k = -1; k <= 1; k++) {
/*     */         
/* 450 */         for (int j = -1; j <= 1; j++) {
/*     */           
/* 452 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + 1, (int)this.field_70161_v + k);
/* 453 */           if (bid == Blocks.field_150350_a) sc++; 
/*     */         } 
/*     */       } 
/* 456 */       if (sc < 4) return false; 
/*     */     } 
/* 458 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Rat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */