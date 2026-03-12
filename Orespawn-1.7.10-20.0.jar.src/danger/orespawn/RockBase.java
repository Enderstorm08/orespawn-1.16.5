/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
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
/*     */ public class RockBase
/*     */   extends EntityLiving
/*     */ {
/*  47 */   public int rock_type = 0;
/*     */   private double dx;
/*     */   private double dz;
/*     */   
/*     */   public RockBase(World par1World) {
/*  52 */     super(par1World);
/*  53 */     func_70105_a(0.25F, 0.15F);
/*  54 */     this.field_70174_ab = 100000;
/*  55 */     this.field_70178_ae = true;
/*  56 */     this.dx = this.dz = 0.0D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  62 */     super.func_70088_a();
/*  63 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  68 */     super.func_110147_ax();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  73 */     Entity e = par1DamageSource.func_76346_g();
/*  74 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/*  75 */       return false;
/*     */     }
/*  77 */     if (e != null && e instanceof net.minecraft.entity.EntityLivingBase) {
/*  78 */       func_85030_a("random.pop", 0.75F, 2.25F);
/*     */     }
/*  80 */     return super.func_70097_a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRockType() {
/*  91 */     return this.field_70180_af.func_75679_c(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRockType(int par1) {
/*  96 */     if (this.field_70170_p == null)
/*  97 */       return;  if (this.field_70170_p.field_72995_K)
/*  98 */       return;  this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void placeRock(int par1) {
/* 103 */     this.rock_type = par1;
/* 104 */     setRockType(par1);
/* 105 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a((1 + this.rock_type / 4));
/* 106 */     func_70606_j((1 + this.rock_type / 4));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 114 */     return 0;
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
/*     */   public void func_70071_h_() {
/* 126 */     if (this.dx == 0.0D && this.dz == 0.0D) {
/* 127 */       this.dx = this.field_70165_t;
/* 128 */       this.dz = this.field_70161_v;
/*     */     } 
/* 130 */     super.func_70071_h_();
/* 131 */     this.field_70125_A = 0.0F;
/* 132 */     this.field_70177_z = this.field_70759_as = 0.0F;
/*     */ 
/*     */ 
/*     */     
/* 136 */     if (this.field_70170_p.field_72995_K) {
/* 137 */       this.rock_type = getRockType();
/*     */     }
/* 139 */     if (!this.field_70170_p.field_72995_K && this.rock_type == 0) {
/* 140 */       if (this.field_70170_p.field_73011_w.field_76574_g != OreSpawnMain.DimensionID5) {
/* 141 */         this.rock_type = 1;
/* 142 */         if (this.field_70170_p.field_73012_v.nextInt(10) == 0) this.rock_type = 2; 
/* 143 */         if (this.field_70170_p.field_73012_v.nextInt(20) == 0) this.rock_type = 3; 
/* 144 */         if (this.field_70170_p.field_73012_v.nextInt(30) == 0) this.rock_type = 4; 
/* 145 */         if (this.field_70170_p.field_73012_v.nextInt(40) == 0) this.rock_type = 5; 
/* 146 */         if (this.field_70170_p.field_73012_v.nextInt(50) == 0) this.rock_type = 6; 
/* 147 */         if (this.field_70170_p.field_73012_v.nextInt(100) == 0) this.rock_type = 7; 
/* 148 */         if (this.field_70170_p.field_73012_v.nextInt(200) == 0) this.rock_type = 8; 
/* 149 */         if (this.field_70170_p.field_73012_v.nextInt(500) == 0) this.rock_type = 9; 
/* 150 */         if (this.field_70170_p.field_73012_v.nextInt(500) == 0) this.rock_type = 10; 
/* 151 */         if (this.field_70170_p.field_73012_v.nextInt(500) == 0) this.rock_type = 11; 
/* 152 */         if (this.field_70170_p.field_73012_v.nextInt(1000) == 0) this.rock_type = 12; 
/*     */       } else {
/* 154 */         this.rock_type = 9;
/* 155 */         if (this.field_70170_p.field_73012_v.nextInt(3) == 0) this.rock_type = 10; 
/* 156 */         if (this.field_70170_p.field_73012_v.nextInt(5) == 0) this.rock_type = 11; 
/* 157 */         if (this.field_70170_p.field_73012_v.nextInt(10) == 0) this.rock_type = 12;
/*     */       
/*     */       } 
/*     */       
/* 161 */       func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a((1 + this.rock_type / 4));
/* 162 */       func_70606_j((1 + this.rock_type / 4));
/*     */     } 
/* 164 */     if (!this.field_70170_p.field_72995_K) setRockType(this.rock_type);
/*     */     
/* 166 */     if (this.field_70170_p.field_72995_K) {
/* 167 */       if (this.rock_type == 9 && this.field_70170_p.field_73012_v.nextInt(20) == 0) {
/* 168 */         this.field_70170_p.func_72869_a("flame", this.field_70165_t, this.field_70163_u, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F), (this.field_70170_p.field_73012_v.nextFloat() / 10.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 174 */       if (this.rock_type == 10 && this.field_70170_p.field_73012_v.nextInt(20) == 0) {
/* 175 */         this.field_70170_p.func_72869_a("happyVillager", this.field_70165_t, this.field_70163_u + 0.25D, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F), (this.field_70170_p.field_73012_v.nextFloat() / 2.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 181 */       if (this.rock_type == 11 && this.field_70170_p.field_73012_v.nextInt(20) == 0) {
/* 182 */         this.field_70170_p.func_72869_a("smoke", this.field_70165_t, this.field_70163_u, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F), (this.field_70170_p.field_73012_v.nextFloat() / 10.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 188 */       if (this.rock_type == 12 && this.field_70170_p.field_73012_v.nextInt(20) == 0) {
/* 189 */         this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u + 0.25D, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F), (this.field_70170_p.field_73012_v.nextFloat() / 5.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 60.0F));
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
/*     */   protected String func_70639_aQ() {
/* 204 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 212 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 220 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 227 */     return 0.65F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 234 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 243 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70692_ba() {
/* 248 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 253 */     if (this.field_70163_u < 50.0D) return false; 
/* 254 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70067_L() {
/* 262 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 270 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70057_ab() {
/* 278 */     this.field_70737_aN = this.field_70738_aO = 0;
/* 279 */     this.field_70739_aP = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70609_aI() {
/* 284 */     func_70106_y();
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70645_a(DamageSource par1DamageSource) {
/* 289 */     func_70106_y();
/* 290 */     if (this.rock_type == 1) dropItemRand(OreSpawnMain.MySmallRock, 1); 
/* 291 */     if (this.rock_type == 2) dropItemRand(OreSpawnMain.MyRock, 1); 
/* 292 */     if (this.rock_type == 3) dropItemRand(OreSpawnMain.MyRedRock, 1); 
/* 293 */     if (this.rock_type == 4) dropItemRand(OreSpawnMain.MyGreenRock, 1); 
/* 294 */     if (this.rock_type == 5) dropItemRand(OreSpawnMain.MyBlueRock, 1); 
/* 295 */     if (this.rock_type == 6) dropItemRand(OreSpawnMain.MyPurpleRock, 1); 
/* 296 */     if (this.rock_type == 7) dropItemRand(OreSpawnMain.MySpikeyRock, 1); 
/* 297 */     if (this.rock_type == 8) dropItemRand(OreSpawnMain.MyTNTRock, 1); 
/* 298 */     if (this.rock_type == 9) dropItemRand(OreSpawnMain.MyCrystalRedRock, 1); 
/* 299 */     if (this.rock_type == 10) dropItemRand(OreSpawnMain.MyCrystalGreenRock, 1); 
/* 300 */     if (this.rock_type == 11) dropItemRand(OreSpawnMain.MyCrystalBlueRock, 1); 
/* 301 */     if (this.rock_type == 12) dropItemRand(OreSpawnMain.MyCrystalTNTRock, 1);
/*     */   
/*     */   }
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 306 */     EntityItem var3 = null;
/* 307 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 309 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + ((OreSpawnMain.OreSpawnRand.nextFloat() - OreSpawnMain.OreSpawnRand.nextFloat()) / 3.0F), this.field_70163_u + 0.25D, this.field_70161_v + ((OreSpawnMain.OreSpawnRand.nextFloat() - OreSpawnMain.OreSpawnRand.nextFloat()) / 3.0F), is);
/*     */     
/* 311 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 312 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 321 */     super.func_70014_b(par1NBTTagCompound);
/*     */     
/* 323 */     par1NBTTagCompound.func_74768_a("ButterflyType", this.rock_type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 332 */     super.func_70037_a(par1NBTTagCompound);
/*     */     
/* 334 */     this.rock_type = par1NBTTagCompound.func_74762_e("ButterflyType");
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RockBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */