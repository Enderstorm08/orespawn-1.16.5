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
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
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
/*     */ public class LeafMonster
/*     */   extends EntityMob
/*     */ {
/*  47 */   private GenericTargetSorter TargetSorter = null;
/*  48 */   private float moveSpeed = 0.25F;
/*     */ 
/*     */ 
/*     */   
/*     */   public LeafMonster(World par1World) {
/*  53 */     super(par1World);
/*  54 */     func_70105_a(1.0F, 2.5F);
/*  55 */     func_70661_as().func_75491_a(true);
/*  56 */     this.field_70728_aV = 5;
/*  57 */     this.field_70174_ab = 0;
/*  58 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  59 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858D));
/*  60 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  61 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  66 */     super.func_110147_ax();
/*  67 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  69 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.LeafMonster_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  74 */     super.func_70088_a();
/*  75 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getAttacking() {
/*  80 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setAttacking(int par1) {
/*  85 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/*  90 */     return OreSpawnMain.LeafMonster_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/*  98 */     return OreSpawnMain.LeafMonster_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 106 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {
/* 112 */     float i = MathHelper.func_76123_f(par1 - 3.0F);
/*     */     
/* 114 */     if (i > 0.0F) {
/*     */       
/* 116 */       if (i > 2.0F) {
/*     */         
/* 118 */         func_85030_a("damage.fallbig", 1.0F, 1.0F);
/* 119 */         i = 2.0F;
/*     */       }
/*     */       else {
/*     */         
/* 123 */         func_85030_a("damage.fallsmall", 1.0F, 1.0F);
/*     */       } 
/*     */       
/* 126 */       func_70097_a(DamageSource.field_76379_h, i);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 137 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 138 */     super.func_70071_h_();
/* 139 */     if (getAttacking() == 0) {
/*     */       
/* 141 */       int px = (int)this.field_70165_t;
/* 142 */       int py = (int)this.field_70163_u;
/* 143 */       int pz = (int)this.field_70161_v;
/* 144 */       this.field_70165_t = px;
/* 145 */       this.field_70163_u = py;
/* 146 */       this.field_70161_v = pz;
/* 147 */       if (this.field_70165_t > 0.0D) this.field_70165_t += 0.5D; 
/* 148 */       if (this.field_70161_v > 0.0D) this.field_70161_v += 0.5D; 
/* 149 */       if (this.field_70165_t < 0.0D) this.field_70165_t -= 0.5D; 
/* 150 */       if (this.field_70161_v < 0.0D) this.field_70161_v -= 0.5D; 
/* 151 */       this.field_70125_A = 0.0F;
/* 152 */       px = (int)this.field_70759_as;
/* 153 */       px /= 90;
/* 154 */       this.field_70177_z = this.field_70759_as = (px * 90);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 165 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 173 */     return "orespawn:leaves_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 181 */     return "orespawn:leaves_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 188 */     return 0.65F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 195 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 205 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 206 */     if (i == 0) return Item.func_150898_a(Blocks.field_150364_r); 
/* 207 */     if (i == 1) return Item.func_150898_a((Block)Blocks.field_150362_t); 
/* 208 */     return Items.field_151078_bh;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 214 */     super.func_70619_bc();
/* 215 */     if (this.field_70128_L)
/* 216 */       return;  if (this.field_70170_p.field_73012_v.nextInt(100) == 1) func_70604_c(null); 
/* 217 */     if (this.field_70170_p.field_73012_v.nextInt(4) == 1) {
/* 218 */       EntityLivingBase e = findSomethingToAttack();
/* 219 */       if (e != null) {
/* 220 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 221 */         setAttacking(1);
/* 222 */         func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 223 */         if (func_70068_e((Entity)e) < 5.0D)
/*     */         {
/* 225 */           if (this.field_70146_Z.nextInt(8) == 0 || this.field_70146_Z.nextInt(10) == 1)
/*     */           {
/* 227 */             func_70652_k((Entity)e);
/*     */           }
/*     */         }
/*     */       } else {
/* 231 */         setAttacking(0);
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
/* 242 */     if (par1EntityLiving == null)
/*     */     {
/* 244 */       return false;
/*     */     }
/* 246 */     if (par1EntityLiving == this)
/*     */     {
/* 248 */       return false;
/*     */     }
/* 250 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 252 */       return false;
/*     */     }
/* 254 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 257 */       return false;
/*     */     }
/* 259 */     if (par1EntityLiving instanceof EntityAnt)
/*     */     {
/* 261 */       return true;
/*     */     }
/* 263 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 265 */       return true;
/*     */     }
/* 267 */     if (par1EntityLiving instanceof EntityLunaMoth)
/*     */     {
/* 269 */       return true;
/*     */     }
/* 271 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 273 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 274 */       if (!p.field_71075_bZ.field_75098_d) {
/* 275 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 279 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 284 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 285 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(4.0D, 6.0D, 4.0D));
/* 286 */     Collections.sort(var5, this.TargetSorter);
/* 287 */     Iterator<?> var2 = var5.iterator();
/* 288 */     Entity var3 = null;
/* 289 */     EntityLivingBase var4 = null;
/*     */     
/* 291 */     while (var2.hasNext()) {
/*     */       
/* 293 */       var3 = (Entity)var2.next();
/* 294 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 296 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 298 */         return var4;
/*     */       }
/*     */     } 
/* 301 */     return null;
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
/*     */   public boolean func_70601_bi() {
/* 313 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 315 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 317 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 319 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 320 */           if (bid == Blocks.field_150474_ac) {
/* 321 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 322 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 323 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 324 */             if (s != null && 
/* 325 */               s.equals("Leaf Monster")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 331 */     if (!func_70814_o()) return false; 
/* 332 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 333 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4)
/* 334 */     { if (this.field_70163_u > 20.0D) return false;
/*     */        }
/* 336 */     else if (this.field_70163_u < 50.0D) { return false; }
/*     */     
/* 338 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 345 */     if (func_104002_bU()) return false; 
/* 346 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\LeafMonster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */