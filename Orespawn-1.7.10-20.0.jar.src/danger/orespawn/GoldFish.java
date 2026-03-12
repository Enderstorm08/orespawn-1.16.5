/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.init.Blocks;
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
/*     */ public class GoldFish
/*     */   extends EntityAnimal
/*     */ {
/*  50 */   private ChunkCoordinates currentFlightTarget = null;
/*     */ 
/*     */   
/*     */   public GoldFish(World par1World) {
/*  54 */     super(par1World);
/*  55 */     func_70105_a(0.75F, 0.5F);
/*  56 */     this.field_70728_aV = 5;
/*  57 */     this.field_70178_ae = false;
/*  58 */     this.field_70174_ab = 5;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  64 */     super.func_110147_ax();
/*  65 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  66 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.2199999988079071D);
/*  67 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  68 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  72 */     if (func_104002_bU()) return false; 
/*  73 */     if (this.field_70170_p.func_72935_r()) return false; 
/*  74 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  81 */     return 0.45F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  88 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  95 */     return "splash";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 102 */     return "splash";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 109 */     return "orespawn:little_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 123 */     return 6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 130 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 138 */     super.func_70071_h_();
/*     */     
/* 140 */     this.field_70181_x *= 0.6D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 149 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 155 */     int xdir = 1;
/* 156 */     int zdir = 1;
/*     */     
/* 158 */     int keep_trying = 50;
/*     */ 
/*     */     
/* 161 */     int updown = 0;
/*     */     
/* 163 */     if (this.field_70128_L)
/* 164 */       return;  super.func_70619_bc();
/*     */     
/* 166 */     if (this.currentFlightTarget == null) {
/* 167 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/*     */     
/* 170 */     if ((int)this.field_70163_u < 120) updown = 2; 
/* 171 */     if ((int)this.field_70163_u > 140) updown = -2; 
/* 172 */     if (this.field_70146_Z.nextInt(300) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F) {
/*     */       
/* 174 */       Block bid = Blocks.field_150348_b;
/* 175 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 176 */         zdir = this.field_70146_Z.nextInt(5) + 5;
/* 177 */         xdir = this.field_70146_Z.nextInt(5) + 5;
/* 178 */         if (this.field_70146_Z.nextInt(2) == 0) zdir = -zdir; 
/* 179 */         if (this.field_70146_Z.nextInt(2) == 0) xdir = -xdir; 
/* 180 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70146_Z.nextInt(11) - 5 + updown, (int)this.field_70161_v + zdir);
/* 181 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 182 */         if (bid == Blocks.field_150350_a && 
/* 183 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 184 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 187 */         keep_trying--;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 192 */     double var1 = this.currentFlightTarget.field_71574_a + 0.4D - this.field_70165_t;
/* 193 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 194 */     double var5 = this.currentFlightTarget.field_71573_c + 0.4D - this.field_70161_v;
/* 195 */     this.field_70159_w += (Math.signum(var1) * 0.4D - this.field_70159_w) * 0.3D;
/* 196 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.2D;
/* 197 */     this.field_70179_y += (Math.signum(var5) * 0.4D - this.field_70179_y) * 0.3D;
/* 198 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 199 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 200 */     this.field_70701_bs = 0.75F;
/* 201 */     this.field_70177_z += var8 / 6.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 210 */     return true;
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
/* 228 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 236 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 245 */     int i = this.field_70170_p.field_73012_v.nextInt(3);
/* 246 */     if (i == 0) return Item.func_150898_a(Blocks.field_150340_R); 
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
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 261 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\GoldFish.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */