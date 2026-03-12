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
/*     */ 
/*     */ public class Cryolophosaurus
/*     */   extends EntityMob
/*     */ {
/*  42 */   private GenericTargetSorter TargetSorter = null;
/*  43 */   private float moveSpeed = 0.25F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Cryolophosaurus(World par1World) {
/*  49 */     super(par1World);
/*  50 */     func_70105_a(0.75F, 0.75F);
/*  51 */     func_70661_as().func_75491_a(true);
/*  52 */     this.field_70728_aV = 10;
/*  53 */     this.field_70174_ab = 10;
/*  54 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  55 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858D));
/*  56 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  57 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*  58 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
/*  59 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  60 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  61 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  66 */     super.func_110147_ax();
/*  67 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  69 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Cryolophosaurus_stats.attack);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  74 */     super.func_70088_a();
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  78 */     if (func_104002_bU()) return false; 
/*  79 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/*  84 */     return OreSpawnMain.Cryolophosaurus_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/*  92 */     return OreSpawnMain.Cryolophosaurus_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 100 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 109 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 117 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 118 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 127 */     if (this.field_70146_Z.nextInt(6) == 0) {
/* 128 */       return "orespawn:cryo_living";
/*     */     }
/* 130 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 138 */     return "orespawn:cryo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 146 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 153 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 160 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 170 */     int i = this.field_70170_p.field_73012_v.nextInt(10);
/* 171 */     if (i == 0) return Items.field_151076_bf; 
/* 172 */     if (i == 1) return OreSpawnMain.UraniumNugget; 
/* 173 */     if (i == 2) return OreSpawnMain.TitaniumNugget; 
/* 174 */     return null;
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
/* 189 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 194 */     if (this.field_70128_L)
/* 195 */       return;  super.func_70619_bc();
/* 196 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 197 */     if (this.field_70170_p.field_73012_v.nextInt(5) == 1) {
/* 198 */       EntityLivingBase e = findSomethingToAttack();
/* 199 */       if (e != null) {
/* 200 */         func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 201 */         if (func_70068_e((Entity)e) < 5.0D)
/*     */         {
/* 203 */           if (this.field_70146_Z.nextInt(12) == 0 || this.field_70146_Z.nextInt(14) == 1)
/*     */           {
/* 205 */             func_70652_k((Entity)e);
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
/* 220 */     if (par1EntityLiving == null)
/*     */     {
/* 222 */       return false;
/*     */     }
/* 224 */     if (par1EntityLiving == this)
/*     */     {
/* 226 */       return false;
/*     */     }
/* 228 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 230 */       return false;
/*     */     }
/* 232 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 235 */       return false;
/*     */     }
/* 237 */     if (par1EntityLiving instanceof Alosaurus)
/*     */     {
/* 239 */       return false;
/*     */     }
/* 241 */     if (par1EntityLiving instanceof TRex)
/*     */     {
/* 243 */       return false;
/*     */     }
/* 245 */     if (par1EntityLiving instanceof Cryolophosaurus)
/*     */     {
/* 247 */       return false;
/*     */     }
/* 249 */     if (par1EntityLiving instanceof Ghost)
/*     */     {
/* 251 */       return false;
/*     */     }
/* 253 */     if (par1EntityLiving instanceof GhostSkelly)
/*     */     {
/* 255 */       return false;
/*     */     }
/* 257 */     if (par1EntityLiving instanceof CaveFisher)
/*     */     {
/* 259 */       return false;
/*     */     }
/* 261 */     if (par1EntityLiving instanceof GammaMetroid)
/*     */     {
/* 263 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 270 */     if (par1EntityLiving instanceof EntityButterfly)
/*     */     {
/* 272 */       return false;
/*     */     }
/* 274 */     if (par1EntityLiving instanceof Firefly)
/*     */     {
/* 276 */       return false;
/*     */     }
/* 278 */     if (par1EntityLiving instanceof EntityMosquito)
/*     */     {
/* 280 */       return false;
/*     */     }
/* 282 */     if (par1EntityLiving instanceof RockBase)
/*     */     {
/* 284 */       return false;
/*     */     }
/* 286 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 288 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 289 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 290 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 294 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 299 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 300 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(9.0D, 2.0D, 9.0D));
/* 301 */     Collections.sort(var5, this.TargetSorter);
/* 302 */     Iterator<?> var2 = var5.iterator();
/* 303 */     Entity var3 = null;
/* 304 */     EntityLivingBase var4 = null;
/*     */     
/* 306 */     while (var2.hasNext()) {
/*     */       
/* 308 */       var3 = (Entity)var2.next();
/* 309 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 311 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 313 */         return var4;
/*     */       }
/*     */     } 
/* 316 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 326 */     if (!func_70814_o()) return false; 
/* 327 */     if (this.field_70170_p.func_72935_r() == true && this.field_70163_u > 50.0D) return false;
/*     */ 
/*     */ 
/*     */     
/* 331 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Cryolophosaurus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */