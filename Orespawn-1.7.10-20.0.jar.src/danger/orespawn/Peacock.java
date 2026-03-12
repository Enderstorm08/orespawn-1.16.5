/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class Peacock
/*     */   extends EntityAnimal
/*     */ {
/*  51 */   private float moveSpeed = 0.38F;
/*  52 */   int my_blink = 0;
/*  53 */   int blinkcount = 0;
/*  54 */   int blinker = 0;
/*  55 */   private GenericTargetSorter TargetSorter = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public Peacock(World par1World) {
/*  60 */     super(par1World);
/*     */     
/*  62 */     func_70105_a(0.65F, 1.2F);
/*  63 */     this.field_70174_ab = 100;
/*  64 */     this.field_70728_aV = 8;
/*  65 */     this.my_blink = 20 + this.field_70146_Z.nextInt(50);
/*  66 */     this.blinkcount = 0;
/*  67 */     this.blinker = 0;
/*  68 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  69 */     func_70661_as().func_75491_a(true);
/*  70 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  71 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate(this, 1.0D));
/*  72 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D));
/*  73 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 12.0F, 1.2000000476837158D, 1.600000023841858D));
/*  74 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  75 */     this.field_70714_bg.func_75776_a(5, new MyEntityAIWander((EntityCreature)this, 1.0F));
/*  76 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  77 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, Termite.class, 6, true));
/*     */   
/*     */   }
/*     */   
/*     */   protected void func_110147_ax() {
/*  82 */     super.func_110147_ax();
/*  83 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  84 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  85 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  86 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(4.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  91 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getBlink() {
/*  96 */     return this.blinker;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 103 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 104 */     super.func_70071_h_();
/* 105 */     this.blinkcount++;
/* 106 */     if (this.blinkcount > this.my_blink) {
/* 107 */       this.blinkcount = 0;
/*     */       
/* 109 */       if (this.blinker > 0) {
/* 110 */         this.blinker = 0;
/* 111 */         this.my_blink = 50 + this.field_70170_p.field_73012_v.nextInt(300);
/*     */       } else {
/* 113 */         this.blinker = 1;
/* 114 */         this.my_blink = 25 + this.field_70170_p.field_73012_v.nextInt(100);
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
/*     */   public boolean func_70601_bi() {
/* 126 */     for (int k = -1; k < 1; k++) {
/*     */       
/* 128 */       for (int j = -1; j < 1; j++) {
/*     */         
/* 130 */         for (int i = 1; i < 3; i++) {
/*     */           
/* 132 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 133 */           if (bid != Blocks.field_150350_a) return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 137 */     long t = this.field_70170_p.func_72820_D();
/* 138 */     t %= 24000L;
/* 139 */     if (t > 12000L) return false; 
/* 140 */     if (this.field_70163_u < 50.0D || this.field_70163_u > 100.0D) return false; 
/* 141 */     if (findBuddies() > 4) return false; 
/* 142 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 150 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 156 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 161 */     return 15;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 169 */     if (this.field_70170_p.field_73012_v.nextInt(8) != 1) return null; 
/* 170 */     return "orespawn:peacocklive";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 178 */     return "orespawn:peacockhit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 186 */     return "orespawn:peacockdead";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 194 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 202 */     return OreSpawnMain.MyRawPeacock;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 211 */     func_145779_a(OreSpawnMain.MyRawPeacock, 1);
/* 212 */     if (this.field_70170_p.field_73012_v.nextInt(3) == 1) {
/* 213 */       func_145779_a(OreSpawnMain.MyRawPeacock, 1);
/*     */     }
/* 215 */     if (this.field_70170_p.field_73012_v.nextInt(2) == 1) {
/* 216 */       func_145779_a(OreSpawnMain.MyPeacockFeather, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 225 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 6.0F);
/* 226 */     return var4;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack LayAnEgg(Item index, int par1) {
/* 231 */     EntityItem var3 = null;
/* 232 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 234 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*     */     
/* 236 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 237 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 245 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 246 */     super.func_70619_bc();
/*     */     
/* 248 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL)
/*     */       return; 
/* 250 */     if (this.field_70170_p.field_73012_v.nextInt(10) == 1) {
/*     */       
/* 252 */       EntityLivingBase e = findSomethingToAttack();
/* 253 */       if (e != null) {
/* 254 */         if (func_70068_e((Entity)e) < 4.0D) {
/* 255 */           func_70652_k((Entity)e);
/*     */         } else {
/* 257 */           func_70661_as().func_75497_a((Entity)e, 1.2D);
/*     */         } 
/*     */       }
/*     */     } 
/* 261 */     if (this.field_70170_p.field_73012_v.nextInt(5000) == 1) LayAnEgg(OreSpawnMain.PeacockEgg, 1 + this.field_70170_p.field_73012_v.nextInt(3));
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 269 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 271 */     if (par1EntityLiving == null)
/*     */     {
/* 273 */       return false;
/*     */     }
/* 275 */     if (par1EntityLiving == this)
/*     */     {
/* 277 */       return false;
/*     */     }
/* 279 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 282 */       return false;
/*     */     }
/* 284 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 287 */       return false;
/*     */     }
/*     */     
/* 290 */     if (par1EntityLiving instanceof Termite)
/*     */     {
/* 292 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 296 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 301 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 302 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 2.0D, 10.0D));
/* 303 */     Collections.sort(var5, this.TargetSorter);
/* 304 */     Iterator<?> var2 = var5.iterator();
/* 305 */     Entity var3 = null;
/* 306 */     EntityLivingBase var4 = null;
/*     */     
/* 308 */     while (var2.hasNext()) {
/*     */       
/* 310 */       var3 = (Entity)var2.next();
/* 311 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 313 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 315 */         return var4;
/*     */       }
/*     */     } 
/* 318 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 326 */     if (func_70631_g_()) {
/* 327 */       func_110163_bv();
/* 328 */       return false;
/*     */     } 
/* 330 */     if (func_104002_bU()) return false; 
/* 331 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 336 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Peacock spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 342 */     return new Peacock(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 350 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 359 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ 
/*     */   
/*     */   private int findBuddies() {
/* 364 */     List var5 = this.field_70170_p.func_72872_a(Peacock.class, this.field_70121_D.func_72314_b(16.0D, 10.0D, 16.0D));
/* 365 */     return var5.size();
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Peacock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */