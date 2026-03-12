/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
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
/*     */ public class Cricket
/*     */   extends EntityAnimal
/*     */ {
/*  28 */   public double moveSpeed = 0.15000000596046448D;
/*  29 */   private int singing = 0;
/*  30 */   private int jumpcount = 0;
/*     */   
/*     */   public Cricket(World par1World) {
/*  33 */     super(par1World);
/*  34 */     func_70105_a(0.1F, 0.1F);
/*  35 */     this.field_70728_aV = 1;
/*  36 */     func_70661_as().func_75491_a(true);
/*  37 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4D));
/*  38 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 8, 1.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  43 */     super.func_110147_ax();
/*  44 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  45 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  46 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  47 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  52 */     super.func_70088_a();
/*  53 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  58 */     if (func_104002_bU()) return false; 
/*  59 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSinging() {
/*  64 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSinging(int par1) {
/*  69 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jumpAround() {
/*  75 */     this.field_70181_x += (0.55F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.35F));
/*  76 */     this.field_70163_u += 0.25D;
/*  77 */     float f = 0.3F + Math.abs(this.field_70170_p.field_73012_v.nextFloat() * 0.25F);
/*  78 */     float d = (float)(this.field_70170_p.field_73012_v.nextFloat() * Math.PI * 2.0D);
/*  79 */     this.field_70159_w += f * Math.sin(d);
/*  80 */     this.field_70179_y += f * Math.cos(d);
/*  81 */     this.field_70160_al = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  89 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  90 */     super.func_70071_h_();
/*  91 */     if (!this.field_70170_p.field_72995_K) {
/*  92 */       if (this.singing != 0) {
/*  93 */         this.singing--;
/*  94 */         if (this.singing <= 0) {
/*  95 */           setSinging(0);
/*     */         }
/*     */       } 
/*  98 */       if (this.jumpcount > 0) this.jumpcount--; 
/*  99 */       if (this.jumpcount == 0 && 
/* 100 */         this.field_70170_p.field_73012_v.nextInt(50) == 1) {
/* 101 */         jumpAround();
/* 102 */         this.jumpcount = 50;
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
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 117 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 123 */     return 3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 132 */     if (!this.field_70170_p.field_72995_K) {
/* 133 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) return null; 
/* 134 */       this.singing = 40;
/* 135 */       setSinging(this.singing);
/*     */     } 
/* 137 */     return "orespawn:cricket";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 145 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 153 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 162 */     return 0.7F;
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
/*     */   protected void playStepSound(int par1, int par2, int par3, int par4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 192 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/* 209 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 217 */     if (this.field_70163_u < 30.0D) return false; 
/* 218 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 219 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Cricket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */