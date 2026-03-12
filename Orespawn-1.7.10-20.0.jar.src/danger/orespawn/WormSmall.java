/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class WormSmall
/*     */   extends EntityMob
/*     */ {
/*  26 */   public int upcount = 50;
/*  27 */   public int downcount = 0;
/*     */   
/*     */   public WormSmall(World par1World) {
/*  30 */     super(par1World);
/*     */     
/*  32 */     func_70105_a(0.25F, 1.0F);
/*  33 */     func_70661_as().func_75491_a(true);
/*  34 */     this.field_70728_aV = 0;
/*  35 */     this.field_70145_X = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  40 */     super.func_110147_ax();
/*  41 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  42 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  43 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.WormSmall_stats.attack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  49 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  62 */     return 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  70 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  78 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/*  86 */     return "orespawn:little_splat";
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
/* 102 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 111 */     return OreSpawnMain.WormSmall_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 119 */     return OreSpawnMain.WormSmall_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 127 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 133 */     EntityPlayer target = null;
/* 134 */     super.func_70636_d();
/*     */     
/* 136 */     target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D), (Entity)this);
/* 137 */     if (target != null || OreSpawnMain.PlayNicely != 0) {
/*     */       
/* 139 */       if (this.upcount > 0) {
/* 140 */         this.upcount--;
/* 141 */         if (this.upcount == 0) this.downcount = 100 + this.field_70170_p.field_73012_v.nextInt(150); 
/* 142 */         if (target != null) pointAtEntity((EntityLivingBase)target); 
/* 143 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)(this.field_70163_u + 0.25D), (int)this.field_70161_v);
/* 144 */         if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 145 */         if (bid != Blocks.field_150350_a) {
/* 146 */           if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150348_b) func_70106_y(); 
/* 147 */           this.field_70181_x += 0.15000000596046448D;
/* 148 */           this.field_70163_u += 0.10000000149011612D;
/*     */         } 
/*     */       } else {
/* 151 */         if (this.downcount > 0) {
/* 152 */           this.downcount--;
/*     */         } else {
/* 154 */           this.upcount = 25 + this.field_70170_p.field_73012_v.nextInt(50);
/*     */         } 
/* 156 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + 2, (int)this.field_70161_v);
/* 157 */         if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 158 */         if (bid != Blocks.field_150350_a) {
/* 159 */           if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150348_b) func_70106_y(); 
/* 160 */           this.field_70181_x += 0.20000000298023224D;
/* 161 */           this.field_70163_u += 0.05000000074505806D;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 165 */       this.upcount = this.field_70170_p.field_73012_v.nextInt(50);
/* 166 */       this.downcount = 0;
/* 167 */       Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + 2, (int)this.field_70161_v);
/* 168 */       if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 169 */       if (bid != Blocks.field_150350_a) {
/* 170 */         if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150348_b) func_70106_y(); 
/* 171 */         this.field_70181_x += 0.10000000149011612D;
/* 172 */         this.field_70163_u += 0.05000000074505806D;
/*     */       } 
/*     */     } 
/*     */     
/* 176 */     this.field_70181_x -= 0.01D;
/* 177 */     this.field_70159_w = 0.0D;
/* 178 */     this.field_70179_y = 0.0D;
/* 179 */     this.field_70701_bs = 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 188 */     if (func_104002_bU()) this.field_70145_X = false; 
/* 189 */     super.func_70071_h_();
/* 190 */     this.field_70181_x *= 0.75D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void pointAtEntity(EntityLivingBase e) {
/* 196 */     double d1 = e.field_70165_t - this.field_70165_t;
/* 197 */     double d2 = e.field_70161_v - this.field_70161_v;
/* 198 */     float d = (float)Math.atan2(d2, d1);
/* 199 */     float f2 = (float)(d * 180.0D / Math.PI) - 90.0F;
/* 200 */     this.field_70177_z = this.field_70759_as = f2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 206 */     int bid = 0;
/*     */     
/* 208 */     EntityPlayer target = null;
/*     */     
/* 210 */     if (this.field_70128_L)
/* 211 */       return;  super.func_70619_bc();
/* 212 */     if (OreSpawnMain.PlayNicely != 0)
/*     */       return; 
/* 214 */     target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(1.5D, 4.0D, 1.5D), (Entity)this);
/* 215 */     if (target != null && 
/* 216 */       target.field_71075_bZ.field_75098_d == true) {
/* 217 */       target = null;
/*     */     }
/*     */     
/* 220 */     if (target != null) {
/*     */       
/* 222 */       pointAtEntity((EntityLivingBase)target);
/* 223 */       if (this.upcount > 0 && this.field_70170_p.field_73012_v.nextInt(15) == 1 && !target.field_71075_bZ.field_75098_d) {
/* 224 */         func_70652_k((Entity)target);
/* 225 */         if (this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/* 226 */           ItemStack boots = target.func_71124_b(1);
/* 227 */           if (boots != null) {
/* 228 */             target.func_70062_b(1, null);
/* 229 */             bid = boots.func_77958_k() - boots.func_77960_j();
/* 230 */             if (bid > 20) {
/* 231 */               bid /= 20;
/*     */             } else {
/* 233 */               bid = 1;
/*     */             } 
/* 235 */             boots.func_77972_a(bid, (EntityLivingBase)this);
/* 236 */             EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 3.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 241 */             this.field_70170_p.func_72838_d((Entity)var3);
/*     */           } 
/*     */         } 
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
/*     */   protected boolean func_70041_e_() {
/* 255 */     return false;
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
/* 274 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 282 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 283 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 293 */     boolean ret = false;
/*     */ 
/*     */     
/* 296 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 297 */       return ret;
/*     */     }
/*     */     
/* 300 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 302 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 310 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WormSmall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */