/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
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
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.AxisAlignedBB;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StinkBug
/*     */   extends EntityAnimal
/*     */ {
/*  52 */   private float moveSpeed = 0.15F;
/*     */ 
/*     */   
/*     */   public StinkBug(World par1World) {
/*  56 */     super(par1World);
/*     */     
/*  58 */     func_70105_a(0.55F, 0.55F);
/*  59 */     this.field_70174_ab = 10;
/*  60 */     func_70661_as().func_75491_a(true);
/*  61 */     this.field_70728_aV = 2;
/*  62 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  63 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate(this, 1.0D));
/*  64 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  65 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 4.0F, 1.0D, 1.399999976158142D));
/*  66 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
/*  67 */     this.field_70714_bg.func_75776_a(8, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*  68 */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  69 */     this.field_70714_bg.func_75776_a(10, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  74 */     super.func_110147_ax();
/*  75 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  76 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  77 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  78 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  83 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  92 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  93 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70629_bd() {
/* 103 */     if (this.field_70128_L)
/* 104 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 105 */     super.func_70629_bd();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 123 */     boolean ret = false;
/*     */     
/* 125 */     if (this.field_70128_L) return false;
/*     */     
/* 127 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */ 
/*     */     
/* 130 */     if (func_110143_aJ() <= 0.0F || this.field_70128_L) {
/* 131 */       AxisAlignedBB bb = AxisAlignedBB.func_72330_a(this.field_70165_t - 8.0D, this.field_70163_u - 5.0D, this.field_70161_v - 8.0D, this.field_70165_t + 8.0D, this.field_70163_u + 10.0D, this.field_70161_v + 8.0D);
/*     */       
/* 133 */       List var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, bb);
/* 134 */       Iterator<EntityLivingBase> var2 = var5.iterator();
/* 135 */       EntityLivingBase var3 = null;
/*     */       
/* 137 */       while (var2.hasNext()) {
/*     */         
/* 139 */         var3 = var2.next();
/* 140 */         if (var3 != null)
/*     */         {
/* 142 */           var3.func_70690_d(new PotionEffect(Potion.field_76431_k.field_76415_H, 300, 0));
/*     */         }
/*     */       } 
/*     */     } 
/* 146 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 152 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 157 */     return 5;
/*     */   }
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
/* 173 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 181 */     return "orespawn:fart";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 189 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 197 */     return OreSpawnMain.MyDeadStinkBug;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 207 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 209 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 211 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 213 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 214 */           if (bid == Blocks.field_150474_ac) {
/* 215 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 216 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 217 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 218 */             if (s != null && 
/* 219 */               s.equals("Stink Bug")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 225 */     if (this.field_70163_u < 50.0D) return false; 
/* 226 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 234 */     if (func_70631_g_()) {
/* 235 */       func_110163_bv();
/* 236 */       return false;
/*     */     } 
/* 238 */     if (func_104002_bU()) return false; 
/* 239 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 244 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public StinkBug spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 250 */     return new StinkBug(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 258 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151115_aP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 267 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\StinkBug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */