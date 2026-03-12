/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityLunaMoth
/*     */   extends EntityButterfly
/*     */ {
/*  17 */   private ChunkCoordinates currentFlightTarget = null;
/*  18 */   public int moth_type = 0;
/*     */   private int closest; private int tx; private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax();
/*     */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  22 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D); } public EntityLunaMoth(World par1World) { super(par1World);
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
/*     */ 
/*     */     
/*  67 */     this.closest = 99999;
/*  68 */     this.tx = 0; this.ty = 0; this.tz = 0;
/*     */     this.moth_type = OreSpawnMain.OreSpawnRand.nextInt(4);
/*     */     func_70105_a(0.5F, 0.5F);
/*     */     func_70661_as().func_75491_a(true); }
/*  72 */   protected void func_70088_a() { super.func_70088_a(); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/*  77 */     for (i = -dy; i <= dy; i++) {
/*  78 */       for (int j = -dz; j <= dz; j++) {
/*  79 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/*  80 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/*  81 */           int d = dx * dx + j * j + i * i;
/*  82 */           if (d < this.closest) {
/*  83 */             this.closest = d;
/*  84 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/*  85 */             found++;
/*     */           } 
/*     */         } 
/*  88 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/*  89 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/*  90 */           int d = dx * dx + j * j + i * i;
/*  91 */           if (d < this.closest) {
/*  92 */             this.closest = d;
/*  93 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/*  94 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 100 */     for (i = -dx; i <= dx; i++) {
/* 101 */       for (int j = -dz; j <= dz; j++) {
/* 102 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 103 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 104 */           int d = dy * dy + j * j + i * i;
/* 105 */           if (d < this.closest) {
/* 106 */             this.closest = d;
/* 107 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 108 */             found++;
/*     */           } 
/*     */         } 
/* 111 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 112 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 113 */           int d = dy * dy + j * j + i * i;
/* 114 */           if (d < this.closest) {
/* 115 */             this.closest = d;
/* 116 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 117 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     for (i = -dx; i <= dx; i++) {
/* 124 */       for (int j = -dy; j <= dy; j++) {
/* 125 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 126 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 127 */           int d = dz * dz + j * j + i * i;
/* 128 */           if (d < this.closest) {
/* 129 */             this.closest = d;
/* 130 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 131 */             found++;
/*     */           } 
/*     */         } 
/* 134 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 135 */         if (bid == Blocks.field_150478_aa || bid == OreSpawnMain.ExtremeTorch) {
/* 136 */           int d = dz * dz + j * j + i * i;
/* 137 */           if (d < this.closest) {
/* 138 */             this.closest = d;
/* 139 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 140 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 146 */     if (found != 0) return true; 
/* 147 */     return false; } protected void func_82167_n(Entity par1Entity) {} protected boolean func_70650_aV() {
/*     */     return true;
/*     */   } public void func_70071_h_() {
/*     */     super.func_70071_h_();
/*     */     this.field_70181_x *= 0.6D;
/*     */   } protected void func_70619_bc() {
/* 153 */     int keep_trying = 25;
/*     */     
/* 155 */     if (this.field_70128_L)
/* 156 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 159 */     if (this.currentFlightTarget == null) {
/* 160 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 162 */     if (this.field_70146_Z.nextInt(100) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 4.0F) {
/*     */       
/* 164 */       Block bid = Blocks.field_150348_b;
/* 165 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 166 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + this.field_70146_Z.nextInt(10) - this.field_70146_Z.nextInt(10), (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 2, (int)this.field_70161_v + this.field_70146_Z.nextInt(10) - this.field_70146_Z.nextInt(10));
/* 167 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 168 */         keep_trying--;
/*     */       }
/*     */     
/* 171 */     } else if (!this.field_70170_p.func_72935_r() && this.field_70146_Z.nextInt(10) == 0) {
/*     */       
/* 173 */       this.closest = 99999;
/* 174 */       this.tx = this.ty = this.tz = 0;
/* 175 */       for (int i = 2; i < 15 && 
/* 176 */         scan_it((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v, i, i, i) != true; i++) {
/* 177 */         if (i >= 6) i++;
/*     */       
/*     */       } 
/* 180 */       if (this.closest < 99999)
/*     */       {
/* 182 */         this.currentFlightTarget.func_71571_b(this.tx, this.ty + 1, this.tz);
/*     */       }
/*     */     } 
/*     */     
/* 186 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 187 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 188 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 189 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.10000000149011612D;
/* 190 */     this.field_70181_x += (Math.signum(var3) * 0.68D - this.field_70181_x) * 0.10000000149011612D;
/* 191 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.10000000149011612D;
/* 192 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 193 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 194 */     this.field_70701_bs = 0.75F;
/* 195 */     this.field_70177_z += var8;
/*     */   }
/*     */ 
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
/*     */   
/*     */   public boolean func_145773_az() {
/* 216 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 225 */     Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/* 226 */     if (bid != Blocks.field_150350_a) return false; 
/* 227 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 228 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) return true; 
/* 229 */     if (this.field_70163_u < 50.0D) return false; 
/* 230 */     return true;
/*     */   }
/*     */   
/*     */   public void initCreature() {}
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityLunaMoth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */