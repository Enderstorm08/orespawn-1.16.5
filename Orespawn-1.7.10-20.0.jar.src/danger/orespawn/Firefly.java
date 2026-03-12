/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAmbientCreature;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Firefly
/*     */   extends EntityAmbientCreature
/*     */ {
/*  23 */   private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "Fireflytexture.png");
/*  24 */   int my_blink = 0;
/*  25 */   int blinker = 0;
/*  26 */   int myspace = 0;
/*     */ 
/*     */   
/*  29 */   private ChunkCoordinates currentFlightTarget = null;
/*     */   
/*     */   public Firefly(World par1World) {
/*  32 */     super(par1World);
/*  33 */     this.my_blink = 20 + this.field_70146_Z.nextInt(20);
/*  34 */     func_70105_a(0.4F, 0.8F);
/*  35 */     func_70661_as().func_75491_a(true);
/*  36 */     this.field_70155_l = 3.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  41 */     super.func_110147_ax();
/*  42 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  43 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  44 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  45 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */   
/*     */   public ResourceLocation getTexture(Firefly a) {
/*  49 */     return texture1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  54 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */   
/*     */   public float getBlink() {
/*  59 */     if (this.blinker < this.my_blink / 2) return 240.0F; 
/*  60 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  68 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  76 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  84 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/*  92 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 100 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 108 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 117 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 122 */     return Item.func_150898_a(OreSpawnMain.ExtremeTorch);
/*     */   }
/*     */ 
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
/*     */   
/*     */   public void func_70071_h_() {
/* 139 */     super.func_70071_h_();
/* 140 */     this.field_70181_x *= 0.600000023841D;
/* 141 */     this.blinker++;
/* 142 */     if (this.blinker > this.my_blink) this.blinker = 0; 
/* 143 */     if (func_104002_bU()) {
/*     */       return;
/*     */     }
/* 146 */     long t = this.field_70170_p.func_72820_D();
/* 147 */     t %= 24000L;
/* 148 */     if (t > 11000L)
/* 149 */       return;  if (this.field_70170_p.field_73012_v.nextInt(500) == 1) func_70106_y();
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 155 */     int keep_trying = 25;
/* 156 */     if (this.field_70128_L)
/* 157 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 160 */     if (this.currentFlightTarget == null) {
/* 161 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 163 */     if (this.field_70146_Z.nextInt(40) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.0F) {
/*     */       
/* 165 */       Block bid = Blocks.field_150348_b;
/* 166 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 167 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + this.field_70146_Z.nextInt(4) - this.field_70146_Z.nextInt(4), (int)this.field_70163_u + this.field_70146_Z.nextInt(4) - 2, (int)this.field_70161_v + this.field_70146_Z.nextInt(4) - this.field_70146_Z.nextInt(4));
/*     */ 
/*     */         
/* 170 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 171 */         keep_trying--;
/*     */       } 
/*     */     } 
/*     */     
/* 175 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 176 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 177 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 178 */     this.field_70159_w += (Math.signum(var1) * 0.2D - this.field_70159_w) * 0.1D;
/* 179 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.1D;
/* 180 */     this.field_70179_y += (Math.signum(var5) * 0.2D - this.field_70179_y) * 0.1D;
/* 181 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 182 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 183 */     this.field_70701_bs = 0.2F;
/* 184 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 193 */     return false;
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
/* 212 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 222 */     Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/* 223 */     if (bid != Blocks.field_150350_a) return false; 
/* 224 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 225 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) return true; 
/* 226 */     if (this.field_70163_u < 50.0D) return false; 
/* 227 */     return true;
/*     */   }
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
/*     */   protected boolean func_70692_ba() {
/* 240 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 241 */     if (func_104002_bU()) return false; 
/* 242 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Firefly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */