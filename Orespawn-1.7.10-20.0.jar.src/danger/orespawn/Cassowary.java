/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Cassowary
/*     */   extends EntityAnimal
/*     */ {
/*  44 */   private float moveSpeed = 0.25F;
/*     */ 
/*     */   
/*     */   public Cassowary(World par1World) {
/*  48 */     super(par1World);
/*     */     
/*  50 */     func_70105_a(0.5F, 1.2F);
/*  51 */     this.moveSpeed = 0.25F;
/*  52 */     this.field_70174_ab = 100;
/*  53 */     this.field_70728_aV = 5;
/*  54 */     func_70661_as().func_75491_a(true);
/*  55 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  56 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate(this, 1.0D));
/*  57 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D));
/*  58 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 8.0F, 1.0D, 1.399999976158142D));
/*  59 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  60 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 12.0F));
/*  61 */     this.field_70714_bg.func_75776_a(6, new MyEntityAIWander((EntityCreature)this, 1.0F));
/*  62 */     this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  67 */     super.func_110147_ax();
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  69 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  70 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  71 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(8.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  76 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  83 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  84 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/*  93 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/*  99 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 104 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 112 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 120 */     return "orespawn:duck_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 128 */     return "orespawn:duck_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 136 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 144 */     return Items.field_151076_bf;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 152 */     int var3 = 0;
/* 153 */     var3 = this.field_70146_Z.nextInt(3);
/* 154 */     var3 += 2;
/* 155 */     for (int var4 = 0; var4 < var3; var4++)
/*     */     {
/* 157 */       func_145779_a(Items.field_151076_bf, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70629_bd() {
/* 168 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 169 */     super.func_70629_bd();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 174 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 175 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 183 */     if (func_70631_g_()) {
/* 184 */       func_110163_bv();
/* 185 */       return false;
/*     */     } 
/* 187 */     if (func_104002_bU()) return false; 
/* 188 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 193 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Cassowary spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 199 */     return new Cassowary(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 207 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 216 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Cassowary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */