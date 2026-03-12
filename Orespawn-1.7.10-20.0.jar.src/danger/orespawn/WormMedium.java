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
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class WormMedium
/*     */   extends EntityMob
/*     */ {
/*  21 */   public int upcount = 0;
/*  22 */   public int downcount = 0;
/*     */   
/*     */   public WormMedium(World par1World) {
/*  25 */     super(par1World);
/*     */     
/*  27 */     func_70105_a(0.5F, 2.0F);
/*  28 */     func_70661_as().func_75491_a(true);
/*  29 */     this.field_70728_aV = 0;
/*  30 */     this.field_70145_X = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  35 */     super.func_110147_ax();
/*  36 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  37 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  38 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.WormMedium_stats.attack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  44 */     super.func_70088_a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/*  57 */     return 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/*  65 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/*  73 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/*  81 */     return "orespawn:little_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/*  89 */     return "orespawn:big_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 106 */     return OreSpawnMain.WormMedium_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 119 */     Block bid = Blocks.field_150350_a;
/* 120 */     EntityPlayer target = null;
/* 121 */     WormSmall worms = null;
/* 122 */     super.func_70636_d();
/* 123 */     if (this.field_70170_p.field_72995_K)
/*     */       return; 
/* 125 */     worms = (WormSmall)this.field_70170_p.func_72857_a(WormSmall.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D), (Entity)this);
/* 126 */     if (worms == null) target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D), (Entity)this); 
/* 127 */     if ((worms == null && target != null) || OreSpawnMain.PlayNicely != 0) {
/*     */       
/* 129 */       if (this.upcount > 0) {
/* 130 */         this.upcount--;
/* 131 */         if (this.upcount == 0) this.downcount = 100 + this.field_70170_p.field_73012_v.nextInt(150); 
/* 132 */         if (target != null) pointAtEntity((EntityLivingBase)target); 
/* 133 */         bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)(this.field_70163_u + 0.25D), (int)this.field_70161_v);
/* 134 */         if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 135 */         if (bid != Blocks.field_150350_a) {
/* 136 */           if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150348_b) func_70106_y(); 
/* 137 */           this.field_70181_x += 0.20000000298023224D;
/* 138 */           this.field_70163_u += 0.10000000149011612D;
/*     */         } 
/*     */       } else {
/* 141 */         if (this.downcount > 0) {
/* 142 */           this.downcount--;
/*     */         } else {
/* 144 */           this.upcount = 25 + this.field_70170_p.field_73012_v.nextInt(75);
/*     */         } 
/* 146 */         bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + 3, (int)this.field_70161_v);
/* 147 */         if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 148 */         if (bid != Blocks.field_150350_a) {
/* 149 */           if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150348_b) func_70106_y(); 
/* 150 */           this.field_70181_x += 0.10000000149011612D;
/* 151 */           this.field_70163_u += 0.05000000074505806D;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 155 */       this.upcount = this.field_70170_p.field_73012_v.nextInt(50);
/* 156 */       this.downcount = 0;
/* 157 */       bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u + 3, (int)this.field_70161_v);
/* 158 */       if (bid == Blocks.field_150329_H) bid = Blocks.field_150350_a; 
/* 159 */       if (bid != Blocks.field_150350_a) {
/* 160 */         if (bid != Blocks.field_150349_c && bid != Blocks.field_150346_d && bid != Blocks.field_150348_b) func_70106_y(); 
/* 161 */         this.field_70181_x += 0.10000000149011612D;
/* 162 */         this.field_70163_u += 0.05000000074505806D;
/*     */       } 
/*     */     } 
/*     */     
/* 166 */     this.field_70181_x -= 0.01D;
/* 167 */     this.field_70159_w = 0.0D;
/* 168 */     this.field_70179_y = 0.0D;
/* 169 */     this.field_70701_bs = 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 178 */     if (func_104002_bU()) this.field_70145_X = false; 
/* 179 */     super.func_70071_h_();
/* 180 */     this.field_70181_x *= 0.65D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void pointAtEntity(EntityLivingBase e) {
/* 186 */     double d1 = e.field_70165_t - this.field_70165_t;
/* 187 */     double d2 = e.field_70161_v - this.field_70161_v;
/* 188 */     float d = (float)Math.atan2(d2, d1);
/* 189 */     float f2 = (float)(d * 180.0D / Math.PI) - 90.0F;
/* 190 */     this.field_70177_z = this.field_70759_as = f2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 199 */     return OreSpawnMain.WormMedium_stats.defense;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 204 */     int bid = 0;
/*     */     
/* 206 */     EntityPlayer target = null;
/* 207 */     WormSmall worms = null;
/* 208 */     if (this.field_70128_L)
/* 209 */       return;  super.func_70619_bc();
/* 210 */     if (OreSpawnMain.PlayNicely != 0)
/* 211 */       return;  worms = (WormSmall)this.field_70170_p.func_72857_a(WormSmall.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D), (Entity)this);
/* 212 */     if (worms != null)
/*     */       return; 
/* 214 */     target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(2.25D, 8.0D, 2.25D), (Entity)this);
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
/* 230 */             if (bid > 15) {
/* 231 */               bid /= 15;
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
/*     */           } else {
/* 243 */             boots = target.func_71124_b(2);
/* 244 */             if (boots != null) {
/* 245 */               target.func_70062_b(2, null);
/* 246 */               bid = boots.func_77958_k() - boots.func_77960_j();
/* 247 */               if (bid > 15) {
/* 248 */                 bid /= 15;
/*     */               } else {
/* 250 */                 bid = 1;
/*     */               } 
/* 252 */               boots.func_77972_a(bid, (EntityLivingBase)this);
/* 253 */               EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 3.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 258 */               this.field_70170_p.func_72838_d((Entity)var3);
/*     */             } 
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
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 274 */     return false;
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
/* 293 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 301 */     if (this.field_70170_p.func_72935_r()) return false; 
/* 302 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCreature() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 312 */     boolean ret = false;
/*     */ 
/*     */     
/* 315 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 316 */       return ret;
/*     */     }
/*     */     
/* 319 */     ret = super.func_70097_a(par1DamageSource, par2);
/*     */     
/* 321 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 329 */     return Items.field_151078_bh;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItemRand(Item index, int par1) {
/* 334 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.field_70163_u + 2.5D + this.field_70170_p.field_73012_v.nextInt(3), this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), new ItemStack(index, par1, 0));
/*     */     
/* 336 */     this.field_70170_p.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/*     */     int var4;
/* 343 */     for (var4 = 0; var4 < 2; var4++) {
/* 344 */       dropItemRand(Items.field_151078_bh, 1);
/*     */     }
/* 346 */     for (var4 = 0; var4 < 2; var4++)
/* 347 */       dropItemRand(Items.field_151116_aA, 1); 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WormMedium.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */