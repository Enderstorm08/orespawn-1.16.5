/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
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
/*     */ public class CreepingHorror
/*     */   extends EntityMob
/*     */ {
/*  41 */   private GenericTargetSorter TargetSorter = null;
/*  42 */   private float moveSpeed = 0.25F;
/*     */ 
/*     */ 
/*     */   
/*     */   public CreepingHorror(World par1World) {
/*  47 */     super(par1World);
/*  48 */     func_70105_a(0.75F, 0.5F);
/*  49 */     func_70661_as().func_75491_a(true);
/*  50 */     this.field_70728_aV = 5;
/*  51 */     this.field_70174_ab = 10;
/*  52 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  53 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858D));
/*  54 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  55 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*  56 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  57 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  58 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  59 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  64 */     super.func_110147_ax();
/*  65 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  66 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  67 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.CreepingHorror_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  72 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/*  77 */     return OreSpawnMain.CreepingHorror_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/*  85 */     return OreSpawnMain.CreepingHorror_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/*  93 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 102 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 103 */     super.func_70071_h_();
/* 104 */     if (func_104002_bU()) {
/*     */       return;
/*     */     }
/* 107 */     long t = this.field_70170_p.func_72820_D();
/* 108 */     t %= 24000L;
/* 109 */     if (t > 11000L)
/* 110 */       return;  if (this.field_70170_p.field_73012_v.nextInt(500) == 1) func_70106_y();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 120 */     return "orespawn:creepinghorror_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 128 */     return "orespawn:creepinghorror_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 136 */     return "orespawn:creepinghorror_dead";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 143 */     return 0.65F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 150 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 160 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 161 */     if (i == 0) return Items.field_151078_bh; 
/* 162 */     if (i == 1) return Items.field_151103_aS; 
/* 163 */     return Items.field_151007_F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 169 */     if (this.field_70128_L)
/* 170 */       return;  super.func_70619_bc();
/* 171 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 172 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 173 */       EntityLivingBase e = findSomethingToAttack();
/* 174 */       if (e != null) {
/* 175 */         func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 176 */         if (func_70068_e((Entity)e) < 5.0D)
/*     */         {
/* 178 */           if (this.field_70146_Z.nextInt(12) == 0 || this.field_70146_Z.nextInt(14) == 1)
/*     */           {
/* 180 */             func_70652_k((Entity)e);
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
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 195 */     if (par1EntityLiving == null)
/*     */     {
/* 197 */       return false;
/*     */     }
/* 199 */     if (par1EntityLiving == this)
/*     */     {
/* 201 */       return false;
/*     */     }
/* 203 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 205 */       return false;
/*     */     }
/* 207 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 210 */       return false;
/*     */     }
/* 212 */     if (par1EntityLiving instanceof CreepingHorror)
/*     */     {
/* 214 */       return false;
/*     */     }
/* 216 */     if (par1EntityLiving instanceof RockBase)
/*     */     {
/* 218 */       return false;
/*     */     }
/* 220 */     if (par1EntityLiving instanceof EnderReaper)
/*     */     {
/* 222 */       return false;
/*     */     }
/* 224 */     if (par1EntityLiving instanceof LeafMonster)
/*     */     {
/* 226 */       return false;
/*     */     }
/* 228 */     if (par1EntityLiving instanceof Dragon)
/*     */     {
/* 230 */       return false;
/*     */     }
/* 232 */     if (par1EntityLiving instanceof TerribleTerror)
/*     */     {
/* 234 */       return false;
/*     */     }
/* 236 */     if (par1EntityLiving instanceof LurkingTerror)
/*     */     {
/* 238 */       return false;
/*     */     }
/* 240 */     if (par1EntityLiving instanceof PitchBlack)
/*     */     {
/* 242 */       return false;
/*     */     }
/* 244 */     if (par1EntityLiving instanceof Firefly)
/*     */     {
/* 246 */       return false;
/*     */     }
/* 248 */     if (par1EntityLiving instanceof Island)
/*     */     {
/* 250 */       return false;
/*     */     }
/* 252 */     if (par1EntityLiving instanceof IslandToo)
/*     */     {
/* 254 */       return false;
/*     */     }
/*     */     
/* 257 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 259 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 260 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 261 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 265 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 270 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 271 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 4.0D, 16.0D));
/* 272 */     Collections.sort(var5, this.TargetSorter);
/* 273 */     Iterator<?> var2 = var5.iterator();
/* 274 */     Entity var3 = null;
/* 275 */     EntityLivingBase var4 = null;
/*     */     
/* 277 */     while (var2.hasNext()) {
/*     */       
/* 279 */       var3 = (Entity)var2.next();
/* 280 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 282 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 284 */         return var4;
/*     */       }
/*     */     } 
/* 287 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 295 */     if (!func_70814_o()) return false; 
/* 296 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 297 */     if (this.field_70170_p.field_73011_w.field_76574_g != OreSpawnMain.DimensionID6 && 
/* 298 */       this.field_70163_u > 15.0D) return false;
/*     */     
/* 300 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 307 */     if (func_104002_bU()) return false; 
/* 308 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 309 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CreepingHorror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */