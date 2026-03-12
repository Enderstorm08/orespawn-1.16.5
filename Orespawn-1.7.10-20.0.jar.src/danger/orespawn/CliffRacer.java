/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
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
/*     */ 
/*     */ public class CliffRacer
/*     */   extends EntityAnimal
/*     */ {
/*  51 */   private ChunkCoordinates currentFlightTarget = null;
/*     */ 
/*     */   
/*     */   public CliffRacer(World par1World) {
/*  55 */     super(par1World);
/*  56 */     func_70105_a(0.75F, 0.5F);
/*  57 */     func_70661_as().func_75491_a(false);
/*  58 */     this.field_70728_aV = 5;
/*  59 */     this.field_70178_ae = false;
/*  60 */     this.field_70174_ab = 5;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  66 */     super.func_110147_ax();
/*  67 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.33000001311302185D);
/*  69 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  70 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  74 */     if (func_104002_bU()) return false; 
/*  75 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  82 */     return 0.45F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  89 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  96 */     return "orespawn:cliffracer";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 103 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 110 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 117 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 124 */     return 5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 131 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 139 */     super.func_70071_h_();
/*     */     
/* 141 */     this.field_70181_x *= 0.6D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 150 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 156 */     int xdir = 1;
/* 157 */     int zdir = 1;
/*     */     
/* 159 */     int keep_trying = 50;
/*     */ 
/*     */ 
/*     */     
/* 163 */     if (this.field_70128_L)
/* 164 */       return;  super.func_70619_bc();
/*     */     
/* 166 */     if (this.currentFlightTarget == null) {
/* 167 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */ 
/*     */     
/* 171 */     if (this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 173 */       Block bid = Blocks.field_150348_b;
/* 174 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 175 */         zdir = this.field_70146_Z.nextInt(10) + 5;
/* 176 */         xdir = this.field_70146_Z.nextInt(10) + 5;
/* 177 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 178 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 179 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(11) - 5, (int)this.field_70161_v + zdir);
/* 180 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 181 */         if (bid == Blocks.field_150350_a && 
/* 182 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 183 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 186 */         keep_trying--;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 191 */     double var1 = this.currentFlightTarget.field_71574_a + 0.4D - this.field_70165_t;
/* 192 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 193 */     double var5 = this.currentFlightTarget.field_71573_c + 0.4D - this.field_70161_v;
/* 194 */     this.field_70159_w += (Math.signum(var1) * 0.4D - this.field_70159_w) * 0.3D;
/* 195 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.2D;
/* 196 */     this.field_70179_y += (Math.signum(var5) * 0.4D - this.field_70179_y) * 0.3D;
/* 197 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 198 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 199 */     this.field_70701_bs = 0.75F;
/* 200 */     this.field_70177_z += var8 / 6.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 209 */     return true;
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
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_145773_az() {
/* 227 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 235 */     if (this.field_70163_u < 50.0D) return false; 
/* 236 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 245 */     int i = this.field_70170_p.field_73012_v.nextInt(8);
/* 246 */     if (i == 0) return Items.field_151076_bf; 
/* 247 */     if (i == 1) return OreSpawnMain.UraniumNugget; 
/* 248 */     if (i == 2) return OreSpawnMain.TitaniumNugget; 
/* 249 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/* 255 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CliffRacer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */