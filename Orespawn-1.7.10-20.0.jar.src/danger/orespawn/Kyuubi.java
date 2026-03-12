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
/*     */ import net.minecraft.entity.ai.EntityAIWander;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntitySmallFireball;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class Kyuubi
/*     */   extends EntityMob
/*     */ {
/*  47 */   private GenericTargetSorter TargetSorter = null;
/*  48 */   private float moveSpeed = 0.25F;
/*     */   
/*     */   public Kyuubi(World par1World) {
/*  51 */     super(par1World);
/*  52 */     func_70105_a(0.5F, 1.25F);
/*  53 */     func_70661_as().func_75491_a(true);
/*  54 */     this.field_70728_aV = 30;
/*  55 */     this.field_70174_ab = 1000;
/*  56 */     this.field_70178_ae = true;
/*  57 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  58 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858D));
/*  59 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
/*  60 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
/*  61 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
/*  62 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  63 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*  64 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  69 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  74 */     super.func_110147_ax();
/*  75 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  76 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  77 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Kyuubi_stats.attack);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  81 */     if (func_104002_bU()) return false; 
/*  82 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  90 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  91 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/*  96 */     return OreSpawnMain.Kyuubi_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 104 */     return OreSpawnMain.Kyuubi_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 112 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 121 */     super.func_70636_d();
/* 122 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 123 */       this.field_70170_p.func_72869_a("reddust", this.field_70165_t, this.field_70163_u + 2.0D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 124 */       this.field_70170_p.func_72869_a("lava", this.field_70165_t, this.field_70163_u + 2.0D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 125 */       func_70015_d(5);
/* 126 */       if (func_70090_H()) {
/* 127 */         func_70652_k((Entity)this);
/* 128 */         this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u + 1.75D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 129 */         this.field_70170_p.func_72869_a("largesmoke", this.field_70165_t, this.field_70163_u + 1.75D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 130 */         this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u + 2.0D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/* 131 */         this.field_70170_p.func_72869_a("largesmoke", this.field_70165_t, this.field_70163_u + 2.0D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAttackStrength(Entity par1Entity) {
/* 142 */     return 3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 150 */     return "orespawn:kyuubi_living";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 158 */     return "orespawn:alo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 166 */     return "orespawn:alo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 173 */     return 0.75F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 180 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 190 */     int i = this.field_70170_p.field_73012_v.nextInt(6);
/* 191 */     if (i == 0) return Items.field_151074_bl; 
/* 192 */     if (i == 1) return OreSpawnMain.UraniumNugget; 
/* 193 */     if (i == 2) return OreSpawnMain.TitaniumNugget; 
/* 194 */     return null;
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
/* 209 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 214 */     if (this.field_70128_L)
/* 215 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 216 */     super.func_70619_bc();
/* 217 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/* 218 */       EntityLivingBase e = findSomethingToAttack();
/* 219 */       if (e != null) {
/* 220 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 221 */         func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 222 */         if (func_70068_e((Entity)e) < 64.0D)
/*     */         {
/* 224 */           if (this.field_70146_Z.nextInt(6) == 0 || this.field_70146_Z.nextInt(8) == 1) {
/*     */ 
/*     */             
/* 227 */             EntitySmallFireball var2 = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - this.field_70165_t, e.field_70163_u + 0.75D - this.field_70163_u + 1.25D, e.field_70161_v - this.field_70161_v);
/* 228 */             var2.func_70012_b(this.field_70165_t, this.field_70163_u + 1.25D, this.field_70161_v, this.field_70177_z, this.field_70125_A);
/* 229 */             this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 230 */             this.field_70170_p.func_72838_d((Entity)var2);
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
/* 245 */     if (par1EntityLiving == null)
/*     */     {
/* 247 */       return false;
/*     */     }
/* 249 */     if (par1EntityLiving == this)
/*     */     {
/* 251 */       return false;
/*     */     }
/* 253 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 255 */       return false;
/*     */     }
/*     */     
/* 258 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*     */     
/* 260 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 263 */       return false;
/*     */     }
/* 265 */     if (par1EntityLiving instanceof EntityMob)
/*     */     {
/* 267 */       return false;
/*     */     }
/*     */     
/* 270 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityPigZombie)
/*     */     {
/* 272 */       return false;
/*     */     }
/* 274 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 276 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 277 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 278 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 282 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 287 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 288 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 4.0D, 12.0D));
/* 289 */     Collections.sort(var5, this.TargetSorter);
/* 290 */     Iterator<?> var2 = var5.iterator();
/* 291 */     Entity var3 = null;
/* 292 */     EntityLivingBase var4 = null;
/*     */     
/* 294 */     while (var2.hasNext()) {
/*     */       
/* 296 */       var3 = (Entity)var2.next();
/* 297 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 299 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 301 */         return var4;
/*     */       }
/*     */     } 
/* 304 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 313 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 318 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
/*     */     
/* 320 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/*     */     int var4;
/* 327 */     for (var4 = 0; var4 < 10; var4++) {
/* 328 */       dropItemRand(Items.field_151044_h, 1);
/*     */     }
/* 330 */     for (var4 = 0; var4 < 3; var4++) {
/* 331 */       dropItemRand(Item.func_150898_a(Blocks.field_150451_bX), 1);
/*     */     }
/* 333 */     for (var4 = 0; var4 < 4; var4++)
/* 334 */       dropItemRand(Item.func_150898_a(Blocks.field_150371_ca), 1); 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Kyuubi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */