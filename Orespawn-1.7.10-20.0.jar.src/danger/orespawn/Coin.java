/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.item.EntityItem;
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
/*     */ public class Coin
/*     */   extends EntityAnimal
/*     */ {
/*  51 */   private float moveSpeed = 0.0F;
/*     */ 
/*     */   
/*     */   public Coin(World par1World) {
/*  55 */     super(par1World);
/*  56 */     func_70105_a(1.5F, 1.5F);
/*     */     
/*  58 */     this.field_70728_aV = 10;
/*  59 */     this.field_70174_ab = 100;
/*     */ 
/*     */     
/*  62 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  67 */     super.func_110147_ax();
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  69 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  70 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  71 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  77 */     super.func_70088_a();
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
/*     */   
/*     */   public void func_70071_h_() {
/*  91 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/*  96 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 104 */     return 0;
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
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 130 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 139 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 147 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 154 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 161 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 171 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 176 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), new ItemStack(index, par1, 0));
/*     */     
/* 178 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 186 */     int i = this.field_70170_p.field_73012_v.nextInt(10);
/*     */     
/* 188 */     Item j = OreSpawnMain.MyEmeraldSword;
/* 189 */     if (i == 0) j = Items.field_151045_i; 
/* 190 */     if (i == 1) j = OreSpawnMain.UraniumNugget; 
/* 191 */     if (i == 2) j = OreSpawnMain.TitaniumNugget; 
/* 192 */     if (i == 3) j = Items.field_151166_bC; 
/* 193 */     if (i == 4) j = OreSpawnMain.MyEmeraldAxe; 
/* 194 */     if (i == 5) j = OreSpawnMain.MyEmeraldShovel; 
/* 195 */     if (i == 6) j = OreSpawnMain.MyEmeraldPickaxe; 
/* 196 */     if (i == 7) j = OreSpawnMain.MyEmeraldHoe; 
/* 197 */     if (i == 8) j = OreSpawnMain.CoinEgg;
/*     */     
/* 199 */     dropItemRand(j, 1);
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
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 215 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 224 */     if ((!this.field_70170_p.func_72935_r() ? true : false) == true) return false; 
/* 225 */     if (this.field_70163_u < 50.0D) return false; 
/* 226 */     Coin target = null;
/* 227 */     target = (Coin)this.field_70170_p.func_72857_a(Coin.class, this.field_70121_D.func_72314_b(20.0D, 8.0D, 20.0D), (Entity)this);
/* 228 */     if (target != null)
/*     */     {
/* 230 */       return false;
/*     */     }
/* 232 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 238 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Coin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */