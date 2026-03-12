/*     */ package danger.orespawn;
/*     */ 
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
/*     */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAITempt;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
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
/*     */ public class Chipmunk
/*     */   extends EntityCannonFodder
/*     */ {
/*  43 */   private float moveSpeed = 0.38F;
/*     */ 
/*     */   
/*     */   public Chipmunk(World par1World) {
/*  47 */     super(par1World);
/*     */     
/*  49 */     func_70105_a(0.35F, 0.35F);
/*  50 */     this.moveSpeed = 0.38F;
/*  51 */     this.field_70174_ab = 100;
/*  52 */     func_70661_as().func_75491_a(true);
/*  53 */     func_70904_g(false);
/*  54 */     this.field_70728_aV = 5;
/*  55 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  56 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
/*  57 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F));
/*  58 */     this.field_70714_bg.func_75776_a(3, new MyEntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.600000023841858D));
/*  59 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.field_151034_e, false));
/*  60 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  61 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 8.0F, 1.0D, 1.399999976158142D));
/*  62 */     this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
/*  63 */     this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 5.0F));
/*  64 */     this.field_70714_bg.func_75776_a(9, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*  65 */     this.field_70714_bg.func_75776_a(10, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  66 */     this.field_70714_bg.func_75776_a(11, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  71 */     super.func_110147_ax();
/*  72 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  73 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  74 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  75 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  80 */     super.func_70088_a();
/*  81 */     func_70904_g(false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  89 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  90 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {
/*  97 */     float i = MathHelper.func_76123_f(par1 - 3.0F);
/*     */     
/*  99 */     if (i > 0.0F) {
/*     */       
/* 101 */       if (i > 3.0F) {
/*     */         
/* 103 */         func_85030_a("damage.fallbig", 1.0F, 1.0F);
/*     */       }
/*     */       else {
/*     */         
/* 107 */         func_85030_a("damage.fallsmall", 1.0F, 1.0F);
/*     */       } 
/* 109 */       if (i > 2.0F)
/*     */       {
/* 111 */         i = 2.0F;
/*     */       }
/* 113 */       func_70097_a(DamageSource.field_76379_h, i);
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
/*     */   protected void func_70629_bd() {
/* 126 */     if (this.field_70128_L)
/* 127 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 128 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 0)
/*     */     {
/* 130 */       func_70691_i(1.0F);
/*     */     }
/* 132 */     if (!this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(600) == 1) {
/* 133 */       Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v);
/* 134 */       if ((bid == Blocks.field_150346_d || bid == Blocks.field_150458_ak) && 
/* 135 */         this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, Blocks.field_150350_a, 0, 2);
/*     */     
/*     */     } 
/* 138 */     super.func_70629_bd();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 147 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 158 */     return 5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChipmunkHealth() {
/* 165 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 173 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */ 
/*     */     
/* 176 */     if (var2 != null)
/*     */     {
/* 178 */       if (var2.field_77994_a <= 0) {
/*     */         
/* 180 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 181 */         var2 = null;
/*     */       } 
/*     */     }
/*     */     
/* 185 */     if (super.func_70085_c(par1EntityPlayer)) {
/* 186 */       return true;
/*     */     }
/*     */     
/* 189 */     if (var2 != null && var2.func_77973_b() == Items.field_151034_e && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 191 */       if (!func_70909_n()) {
/*     */         
/* 193 */         if (!this.field_70170_p.field_72995_K)
/*     */         {
/* 195 */           if (this.field_70146_Z.nextInt(2) == 0)
/*     */           {
/* 197 */             func_70903_f(true);
/* 198 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 199 */             func_70908_e(true);
/* 200 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 201 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */           
/*     */           }
/*     */           else
/*     */           {
/* 206 */             func_70908_e(false);
/* 207 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */           }
/*     */         
/*     */         }
/*     */       }
/* 212 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */         
/* 214 */         if (this.field_70170_p.field_72995_K) {
/* 215 */           func_70908_e(true);
/* 216 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*     */         } 
/*     */         
/* 219 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 220 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */         }
/*     */       } 
/*     */       
/* 224 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 226 */         var2.field_77994_a--;
/* 227 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 229 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 232 */       return true;
/* 233 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */ 
/*     */       
/* 236 */       if (!this.field_70170_p.field_72995_K) {
/*     */         
/* 238 */         func_70903_f(false);
/* 239 */         func_152115_b("");
/* 240 */         func_70908_e(false);
/* 241 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */       } 
/* 243 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 245 */         var2.field_77994_a--;
/* 246 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 248 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 251 */       return true;
/*     */     } 
/*     */     
/* 254 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 256 */       func_94058_c(var2.func_82833_r());
/* 257 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 259 */         var2.field_77994_a--;
/* 260 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 262 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 265 */       return true;
/* 266 */     }  if (func_70909_n() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 268 */       if (!func_70906_o()) {
/* 269 */         func_70904_g(true);
/*     */       } else {
/* 271 */         func_70904_g(false);
/*     */       } 
/* 273 */       return true;
/*     */     } 
/*     */     
/* 276 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 285 */     if (func_70906_o())
/*     */     {
/* 287 */       return null;
/*     */     }
/* 289 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 297 */     return "orespawn:scorpion_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 305 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 313 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 321 */     return Items.field_151015_O;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 329 */     int var3 = 0;
/*     */     
/* 331 */     if (func_70909_n()) {
/*     */       
/* 333 */       var3 = this.field_70146_Z.nextInt(5);
/* 334 */       var3 += 2;
/* 335 */       for (int var4 = 0; var4 < var3; var4++)
/*     */       {
/* 337 */         func_145779_a(Item.func_150898_a((Block)Blocks.field_150328_O), 1);
/*     */       }
/*     */     } else {
/* 340 */       super.func_70628_a(par1, par2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 351 */     return func_70631_g_() ? ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.5F) : ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 358 */     if (this.field_70163_u < 50.0D) return false; 
/* 359 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 367 */     if (func_70631_g_()) {
/* 368 */       func_110163_bv();
/* 369 */       return false;
/*     */     } 
/* 371 */     if (func_104002_bU()) return false; 
/* 372 */     if (func_70909_n()) return false; 
/* 373 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 378 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Chipmunk spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 384 */     return new Chipmunk(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 392 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 401 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Chipmunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */