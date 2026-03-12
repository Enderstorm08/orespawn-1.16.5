/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KingHead
/*     */   extends EntityLiving
/*     */ {
/*     */   private int boatPosRotationIncrements;
/*     */   private double boatX;
/*     */   private double boatY;
/*     */   private double boatZ;
/*     */   private double boatYaw;
/*     */   private double boatPitch;
/*     */   private double velocityX;
/*     */   private double velocityY;
/*     */   private double velocityZ;
/*     */   
/*     */   public KingHead(World par1World) {
/*  69 */     super(par1World);
/*  70 */     func_70105_a(19.9F, 10.0F);
/*  71 */     this.field_70145_X = true;
/*  72 */     this.field_70174_ab = 10000;
/*  73 */     this.field_70178_ae = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  79 */     super.func_110147_ax();
/*  80 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(OreSpawnMain.TheKing_stats.health);
/*  81 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.3300000429153442D);
/*  82 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  83 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70069_a(float par1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70064_a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/* 107 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 125 */     boolean ret = false;
/*     */     
/* 127 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 128 */       return false;
/*     */     }
/* 130 */     Entity e = par1DamageSource.func_76346_g();
/* 131 */     if (e != null && (e instanceof TheKing || e instanceof KingHead)) return false; 
/* 132 */     e = par1DamageSource.func_76364_f();
/* 133 */     if (e != null && (e instanceof TheKing || e instanceof KingHead)) return false;
/*     */     
/* 135 */     List var5 = this.field_70170_p.func_72872_a(TheKing.class, this.field_70121_D.func_72314_b(48.0D, 32.0D, 48.0D));
/* 136 */     Iterator<Entity> var2 = var5.iterator();
/* 137 */     Entity var3 = null;
/* 138 */     TheKing var4 = null;
/*     */     
/* 140 */     if (var2.hasNext()) {
/*     */ 
/*     */       
/* 143 */       var3 = var2.next();
/* 144 */       var4 = (TheKing)var3;
/* 145 */       ret = var4.func_70097_a(par1DamageSource, par2);
/*     */     } 
/* 147 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70067_L() {
/* 155 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70056_a(double par1, double par3, double par5, float par7, float par8, int par9) {
/* 166 */     if (this.field_70153_n != null) {
/*     */       
/* 168 */       this.boatPosRotationIncrements = par9 + 8;
/*     */     }
/*     */     else {
/*     */       
/* 172 */       this.boatPosRotationIncrements = 6;
/*     */     } 
/*     */     
/* 175 */     this.boatX = par1;
/* 176 */     this.boatY = par3;
/* 177 */     this.boatZ = par5;
/* 178 */     this.boatYaw = par7;
/* 179 */     this.boatPitch = par8;
/* 180 */     this.field_70159_w = this.velocityX;
/* 181 */     this.field_70181_x = this.velocityY;
/* 182 */     this.field_70179_y = this.velocityZ;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_70016_h(double par1, double par3, double par5) {
/* 193 */     this.velocityX = this.field_70159_w = par1;
/* 194 */     this.velocityY = this.field_70181_x = par3;
/* 195 */     this.velocityZ = this.field_70179_y = par5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 206 */     if (this.field_70128_L)
/* 207 */       return;  this.field_70160_al = true;
/* 208 */     func_70015_d(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     if (this.field_70170_p.field_72995_K) {
/*     */ 
/*     */       
/* 217 */       if (this.boatPosRotationIncrements > 0)
/*     */       {
/* 219 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/* 220 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/* 221 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/* 222 */         func_70107_b(d4, d5, d11);
/*     */         
/* 224 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/* 225 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/* 226 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/* 227 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/* 228 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/*     */         
/* 230 */         this.boatPosRotationIncrements--;
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 241 */       List var5 = this.field_70170_p.func_72872_a(TheKing.class, this.field_70121_D.func_72314_b(32.0D, 32.0D, 32.0D));
/* 242 */       Iterator<Entity> var2 = var5.iterator();
/* 243 */       Entity var3 = null;
/* 244 */       TheKing var4 = null;
/*     */       
/* 246 */       if (var2.hasNext()) {
/*     */         
/* 248 */         var3 = var2.next();
/* 249 */         var4 = (TheKing)var3;
/* 250 */         this.field_70163_u = var4.field_70163_u + 12.0D;
/* 251 */         this.field_70165_t = var4.field_70165_t - 30.0D * Math.sin(Math.toRadians(var4.field_70759_as));
/* 252 */         this.field_70161_v = var4.field_70161_v + 30.0D * Math.cos(Math.toRadians(var4.field_70759_as));
/* 253 */         this.field_70177_z = var4.field_70177_z;
/* 254 */         this.field_70759_as = var4.field_70759_as;
/* 255 */         this.field_70159_w = var4.field_70159_w;
/* 256 */         this.field_70181_x = var4.field_70181_x;
/* 257 */         this.field_70179_y = var4.field_70179_y;
/* 258 */         func_70606_j(var4.func_110143_aJ());
/*     */       } else {
/* 260 */         func_70106_y();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\KingHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */