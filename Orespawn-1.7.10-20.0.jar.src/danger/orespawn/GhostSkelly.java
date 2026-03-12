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
/*     */ public class GhostSkelly
/*     */   extends EntityAmbientCreature
/*     */ {
/*  22 */   private ChunkCoordinates currentFlightTarget = null;
/*  23 */   private RenderInfo renderdata = new RenderInfo();
/*     */   
/*     */   public GhostSkelly(World par1World) {
/*  26 */     super(par1World);
/*     */     
/*  28 */     func_70105_a(1.5F, 2.0F);
/*  29 */     func_70661_as().func_75491_a(false);
/*  30 */     this.field_70728_aV = 10;
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
/*  47 */     if (this.renderdata == null) {
/*  48 */       this.renderdata = new RenderInfo();
/*     */     }
/*  50 */     this.renderdata.rf1 = 0.0F;
/*  51 */     this.renderdata.rf2 = 0.0F;
/*  52 */     this.renderdata.rf3 = 0.0F;
/*  53 */     this.renderdata.rf4 = 0.0F;
/*  54 */     this.renderdata.ri1 = 0;
/*  55 */     this.renderdata.ri2 = 0;
/*  56 */     this.renderdata.ri3 = 0;
/*  57 */     this.renderdata.ri4 = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenderInfo getRenderInfo() {
/*  64 */     return this.renderdata;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderInfo(RenderInfo r) {
/*  69 */     this.renderdata.rf1 = r.rf1;
/*  70 */     this.renderdata.rf2 = r.rf2;
/*  71 */     this.renderdata.rf3 = r.rf3;
/*  72 */     this.renderdata.rf4 = r.rf4;
/*  73 */     this.renderdata.ri1 = r.ri1;
/*  74 */     this.renderdata.ri2 = r.ri2;
/*  75 */     this.renderdata.ri3 = r.ri3;
/*  76 */     this.renderdata.ri4 = r.ri4;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  80 */     if (func_104002_bU()) return false; 
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  89 */     return 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  97 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 105 */     if (this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/* 106 */       return "orespawn:chain_rattles";
/*     */     }
/* 108 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 116 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 124 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 132 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 141 */     return 5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 149 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 157 */     if (func_104002_bU()) this.field_70145_X = false; 
/* 158 */     super.func_70071_h_();
/* 159 */     this.field_70181_x *= 0.65D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 164 */     Block bid = Blocks.field_150350_a;
/* 165 */     int i = 0, j = 0;
/* 166 */     if (this.field_70128_L)
/* 167 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 170 */     if (this.currentFlightTarget == null) {
/* 171 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 173 */     if (this.field_70170_p.field_73012_v.nextInt(40) == 1 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.0F) {
/*     */       
/* 175 */       EntityPlayer target = null;
/*     */       
/* 177 */       target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(16.0D, 16.0D, 16.0D), (Entity)this);
/* 178 */       if (target != null) {
/*     */         
/* 180 */         this.currentFlightTarget.func_71571_b((int)target.field_70165_t + this.field_70146_Z.nextInt(3) - this.field_70146_Z.nextInt(3), (int)(target.field_70163_u + 1.0D), (int)target.field_70161_v + this.field_70146_Z.nextInt(3) - this.field_70146_Z.nextInt(3));
/*     */       } else {
/*     */         
/* 183 */         for (i = 0; i < 3; i++) {
/* 184 */           bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + i, (int)this.field_70161_v);
/* 185 */           if (bid == Blocks.field_150350_a)
/*     */             break; 
/*     */         } 
/* 188 */         for (j = -1; j >= -3; j--) {
/* 189 */           bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + j, (int)this.field_70161_v);
/* 190 */           if (bid != Blocks.field_150350_a)
/*     */             break; 
/* 192 */         }  this.currentFlightTarget.func_71571_b((int)this.field_70165_t + this.field_70146_Z.nextInt(10) - this.field_70146_Z.nextInt(10), (int)this.field_70163_u + i + j + this.field_70146_Z.nextInt(4) + 1, (int)this.field_70161_v + this.field_70146_Z.nextInt(10) - this.field_70146_Z.nextInt(10));
/*     */       } 
/*     */     } 
/*     */     
/* 196 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 197 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 198 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 199 */     this.field_70159_w += (Math.signum(var1) * 0.1D - this.field_70159_w) * 0.05D;
/* 200 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.1D;
/* 201 */     this.field_70179_y += (Math.signum(var5) * 0.1D - this.field_70179_y) * 0.05D;
/* 202 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 203 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 204 */     this.field_70701_bs = 0.05F;
/* 205 */     this.field_70177_z += var8 / 6.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 214 */     return false;
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
/* 233 */     return true;
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
/* 244 */     for (int k = -2; k < 2; k++) {
/*     */       
/* 246 */       for (int j = -2; j < 2; j++) {
/*     */         
/* 248 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 250 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 251 */           if (bid == Blocks.field_150474_ac) {
/* 252 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 253 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 254 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 255 */             if (s != null && 
/* 256 */               s.equals("Ghost Pumpkin Skelly")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 262 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 263 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 273 */     boolean ret = false;
/*     */     
/* 275 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 276 */       return ret;
/*     */     }
/*     */     
/* 279 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 281 */     return ret;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\GhostSkelly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */