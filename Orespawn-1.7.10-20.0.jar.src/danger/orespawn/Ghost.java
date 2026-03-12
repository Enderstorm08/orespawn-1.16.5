/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAmbientCreature;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Ghost
/*     */   extends EntityAmbientCreature
/*     */ {
/*  22 */   private ChunkCoordinates currentFlightTarget = null;
/*     */ 
/*     */   
/*     */   public Ghost(World par1World) {
/*  26 */     super(par1World);
/*     */     
/*  28 */     func_70105_a(0.5F, 1.5F);
/*  29 */     func_70661_as().func_75491_a(false);
/*  30 */     this.field_70728_aV = 5;
/*  31 */     this.field_70145_X = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  36 */     super.func_110147_ax();
/*  37 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  38 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  39 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  40 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  46 */     super.func_70088_a();
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  50 */     if (func_104002_bU()) return false; 
/*  51 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  59 */     return 0.3F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  67 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  75 */     if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/*  76 */       return "orespawn:ghost_sound";
/*     */     }
/*  78 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/*  86 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/*  94 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 111 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 127 */     if (func_104002_bU()) this.field_70145_X = false; 
/* 128 */     super.func_70071_h_();
/* 129 */     this.field_70181_x *= 0.65D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 134 */     int i = 0, j = 0;
/*     */     
/* 136 */     if (this.field_70128_L)
/* 137 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 140 */     if (this.currentFlightTarget == null) {
/* 141 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 143 */     if (this.field_70170_p.field_73012_v.nextInt(40) == 1 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.0F) {
/*     */       
/* 145 */       EntityPlayer target = null;
/*     */       
/* 147 */       target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(16.0D, 16.0D, 16.0D), (Entity)this);
/* 148 */       if (target != null) {
/*     */         
/* 150 */         this.currentFlightTarget.func_71571_b((int)target.field_70165_t + this.field_70146_Z.nextInt(3) - this.field_70146_Z.nextInt(3), (int)target.field_70163_u + 1, (int)target.field_70161_v + this.field_70146_Z.nextInt(3) - this.field_70146_Z.nextInt(3));
/*     */       } else {
/* 152 */         for (i = 0; i < 3; i++) {
/* 153 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + i, (int)this.field_70161_v);
/* 154 */           if (bid == Blocks.field_150350_a)
/*     */             break; 
/*     */         } 
/* 157 */         for (j = -1; j >= -3; j--) {
/* 158 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + j, (int)this.field_70161_v);
/* 159 */           if (bid != Blocks.field_150350_a)
/*     */             break; 
/* 161 */         }  this.currentFlightTarget.func_71571_b((int)this.field_70165_t + this.field_70146_Z.nextInt(10) - this.field_70146_Z.nextInt(10), (int)this.field_70163_u + i + j + this.field_70146_Z.nextInt(4) + 1, (int)this.field_70161_v + this.field_70146_Z.nextInt(10) - this.field_70146_Z.nextInt(10));
/*     */       } 
/*     */     } 
/*     */     
/* 165 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 166 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 167 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 168 */     this.field_70159_w += (Math.signum(var1) * 0.1D - this.field_70159_w) * 0.05D;
/* 169 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.1D;
/* 170 */     this.field_70179_y += (Math.signum(var5) * 0.1D - this.field_70179_y) * 0.05D;
/* 171 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 172 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 173 */     this.field_70701_bs = 0.05F;
/* 174 */     this.field_70177_z += var8 / 6.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 183 */     return false;
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
/* 202 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 213 */     for (int k = -2; k < 2; k++) {
/*     */       
/* 215 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 217 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 219 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 220 */           if (bid == Blocks.field_150474_ac) {
/* 221 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 222 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 223 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 224 */             if (s != null && 
/* 225 */               s.equals("Ghost")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 232 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 233 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 243 */     boolean ret = false;
/*     */     
/* 245 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 246 */       return ret;
/*     */     }
/*     */     
/* 249 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 251 */     return ret;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Ghost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */