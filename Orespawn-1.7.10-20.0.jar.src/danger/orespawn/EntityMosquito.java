/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAmbientCreature;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityMosquito
/*     */   extends EntityAmbientCreature
/*     */ {
/*  18 */   private ChunkCoordinates currentFlightTarget = null;
/*     */ 
/*     */   
/*     */   public EntityMosquito(World par1World) {
/*  22 */     super(par1World);
/*     */     
/*  24 */     func_70105_a(0.2F, 0.2F);
/*  25 */     func_70661_as().func_75491_a(true);
/*  26 */     this.field_70728_aV = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  31 */     super.func_110147_ax();
/*  32 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  33 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  34 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  35 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  41 */     super.func_70088_a();
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  45 */     if (func_104002_bU()) return false; 
/*  46 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  54 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  62 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  70 */     return "orespawn:mosquito";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/*  78 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/*  86 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/*  94 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 103 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 111 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 119 */     super.func_70071_h_();
/* 120 */     this.field_70181_x *= 0.6000000238418579D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 128 */     int keep_trying = 50;
/* 129 */     if (this.field_70128_L)
/* 130 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 133 */     if (this.currentFlightTarget == null) {
/* 134 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 136 */     if (this.field_70146_Z.nextInt(20) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 3.0F) {
/*     */       
/* 138 */       EntityPlayer target = null;
/*     */       
/* 140 */       if (OreSpawnMain.OreSpawnRand.nextInt(4) == 0) {
/*     */         
/* 142 */         target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(10.0D, 6.0D, 10.0D), (Entity)this);
/* 143 */         if (target != null) {
/*     */           
/* 145 */           this.currentFlightTarget.func_71571_b((int)target.field_70165_t, (int)target.field_70163_u + 2, (int)target.field_70161_v);
/*     */         } else {
/* 147 */           Block bid = Blocks.field_150348_b;
/* 148 */           while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 149 */             this.currentFlightTarget.func_71571_b((int)this.field_70165_t + this.field_70146_Z.nextInt(6) - this.field_70146_Z.nextInt(6), (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 2, (int)this.field_70161_v + this.field_70146_Z.nextInt(6) - this.field_70146_Z.nextInt(6));
/* 150 */             bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 151 */             keep_trying--;
/*     */           } 
/*     */         } 
/*     */       } else {
/* 155 */         Block bid = Blocks.field_150348_b;
/* 156 */         while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 157 */           this.currentFlightTarget.func_71571_b((int)this.field_70165_t + this.field_70146_Z.nextInt(6) - this.field_70146_Z.nextInt(6), (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 2, (int)this.field_70161_v + this.field_70146_Z.nextInt(6) - this.field_70146_Z.nextInt(6));
/* 158 */           bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 159 */           keep_trying--;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 164 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 165 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 166 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 167 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.10000000149011612D;
/* 168 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.10000000149011612D;
/* 169 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.10000000149011612D;
/* 170 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 171 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 172 */     this.field_70701_bs = 0.3F;
/* 173 */     this.field_70177_z += var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 182 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_145773_az() {
/* 201 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 209 */     return true;
/*     */   }
/*     */   
/*     */   public void initCreature() {}
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityMosquito.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */