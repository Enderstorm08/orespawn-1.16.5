/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAISwimming;
/*     */ import net.minecraft.entity.ai.EntityAITempt;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public class Camarasaurus
/*     */   extends EntityTameable
/*     */ {
/*  43 */   private float moveSpeed = 0.2F;
/*     */   private int closest; private int tx; private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*     */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  47 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D); } public Camarasaurus(World par1World) { super(par1World);
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
/* 125 */     this.closest = 99999;
/* 126 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.5F, 1.2F); this.moveSpeed = 0.2F; this.field_70174_ab = 100; func_70661_as().func_75491_a(true); func_70904_g(false); this.field_70728_aV = 5; this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D)); this.field_70714_bg.func_75776_a(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F)); this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.field_151034_e, false)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F)); this.field_70714_bg.func_75776_a(7, new MyEntityAIWander((EntityCreature)this, 1.0F)); this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*     */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this)); }
/*     */   protected void func_70088_a() { super.func_70088_a();
/* 129 */     func_70904_g(false); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 134 */     for (i = -dy; i <= dy; i++) {
/* 135 */       for (int j = -dz; j <= dz; j++) {
/* 136 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 137 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150329_H || bid == Blocks.field_150434_aF || bid == Blocks.field_150398_cm) {
/* 138 */           int d = dx * dx + j * j + i * i;
/* 139 */           if (d < this.closest) {
/* 140 */             this.closest = d;
/* 141 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 142 */             found++;
/*     */           } 
/*     */         } 
/* 145 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 146 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150329_H || bid == Blocks.field_150434_aF || bid == Blocks.field_150398_cm) {
/* 147 */           int d = dx * dx + j * j + i * i;
/* 148 */           if (d < this.closest) {
/* 149 */             this.closest = d;
/* 150 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 151 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 157 */     for (i = -dx; i <= dx; i++) {
/* 158 */       for (int j = -dz; j <= dz; j++) {
/* 159 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 160 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150329_H || bid == Blocks.field_150434_aF || bid == Blocks.field_150398_cm) {
/* 161 */           int d = dy * dy + j * j + i * i;
/* 162 */           if (d < this.closest) {
/* 163 */             this.closest = d;
/* 164 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 165 */             found++;
/*     */           } 
/*     */         } 
/* 168 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 169 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150329_H || bid == Blocks.field_150434_aF || bid == Blocks.field_150398_cm) {
/* 170 */           int d = dy * dy + j * j + i * i;
/* 171 */           if (d < this.closest) {
/* 172 */             this.closest = d;
/* 173 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 174 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 180 */     for (i = -dx; i <= dx; i++) {
/* 181 */       for (int j = -dy; j <= dy; j++) {
/* 182 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 183 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150329_H || bid == Blocks.field_150434_aF || bid == Blocks.field_150398_cm) {
/* 184 */           int d = dz * dz + j * j + i * i;
/* 185 */           if (d < this.closest) {
/* 186 */             this.closest = d;
/* 187 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 188 */             found++;
/*     */           } 
/*     */         } 
/* 191 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 192 */         if (bid == Blocks.field_150362_t || bid == Blocks.field_150395_bd || bid == Blocks.field_150329_H || bid == Blocks.field_150434_aF || bid == Blocks.field_150398_cm) {
/* 193 */           int d = dz * dz + j * j + i * i;
/* 194 */           if (d < this.closest) {
/* 195 */             this.closest = d;
/* 196 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 197 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 203 */     if (found != 0) return true; 
/* 204 */     return false; } public boolean func_70601_bi() { if (this.field_70163_u < 50.0D)
/*     */       return false;  if (!this.field_70170_p.func_72935_r())
/*     */       return false;  return true; }
/*     */   public void func_70071_h_() { func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed); super.func_70071_h_(); }
/*     */   protected void func_70069_a(float par1) { float i = MathHelper.func_76123_f(par1 - 3.0F); if (i > 0.0F) { if (i > 3.0F) { func_85030_a("damage.fallbig", 1.0F, 1.0F); }
/*     */       else
/*     */       { func_85030_a("damage.fallsmall", 1.0F, 1.0F); }
/*     */        if (i > 2.0F)
/*     */         i = 2.0F;  func_70097_a(DamageSource.field_76379_h, i); }
/*     */      }
/* 214 */   protected void func_70629_bd() { if (this.field_70128_L)
/* 215 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 216 */     super.func_70629_bd();
/* 217 */     if (!func_70906_o() && ((
/* 218 */       this.field_70170_p.field_73012_v.nextInt(20) == 0 && getCamarasaurusHealth() < mygetMaxHealth()) || this.field_70170_p.field_73012_v.nextInt(250) == 0))
/*     */     {
/* 220 */       if (OreSpawnMain.PlayNicely == 0) {
/*     */ 
/*     */         
/* 223 */         this.closest = 99999;
/* 224 */         this.tx = this.ty = this.tz = 0;
/* 225 */         for (int i = 1; i < 11; i++) {
/* 226 */           int j = i;
/* 227 */           if (j > 2) j = 2; 
/* 228 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 229 */             break;  if (i >= 6) i++;
/*     */         
/*     */         } 
/* 232 */         if (this.closest < 99999) {
/*     */           
/* 234 */           func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 235 */           if (this.closest < 12) {
/*     */             
/* 237 */             if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2); 
/* 238 */             func_70691_i(1.0F);
/* 239 */             func_85030_a("random.burp", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 253 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70648_aU() {
/* 259 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 264 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCamarasaurusHealth() {
/* 271 */     return (int)func_110143_aJ();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 279 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */ 
/*     */     
/* 282 */     if (var2 != null)
/*     */     {
/* 284 */       if (var2.field_77994_a <= 0) {
/*     */         
/* 286 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 287 */         var2 = null;
/*     */       } 
/*     */     }
/*     */     
/* 291 */     if (super.func_70085_c(par1EntityPlayer)) {
/* 292 */       return true;
/*     */     }
/*     */     
/* 295 */     if (var2 != null && var2.func_77973_b() == Items.field_151034_e && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 297 */       if (!func_70909_n()) {
/*     */         
/* 299 */         if (!this.field_70170_p.field_72995_K)
/*     */         {
/* 301 */           if (this.field_70146_Z.nextInt(2) == 0)
/*     */           {
/* 303 */             func_70903_f(true);
/* 304 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/* 305 */             func_70908_e(true);
/* 306 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/* 307 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */           
/*     */           }
/*     */           else
/*     */           {
/* 312 */             func_70908_e(false);
/* 313 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*     */           }
/*     */         
/*     */         }
/*     */       }
/* 318 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */         
/* 320 */         if (this.field_70170_p.field_72995_K) {
/* 321 */           func_70908_e(true);
/* 322 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*     */         } 
/*     */         
/* 325 */         if (mygetMaxHealth() > func_110143_aJ()) {
/* 326 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*     */         }
/*     */       } 
/*     */       
/* 330 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 332 */         var2.field_77994_a--;
/* 333 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 335 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 338 */       return true;
/*     */     } 
/* 340 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*     */       
/* 342 */       func_94058_c(var2.func_82833_r());
/* 343 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 345 */         var2.field_77994_a--;
/* 346 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 348 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 351 */       return true;
/* 352 */     }  if (func_70909_n() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 354 */       if (!func_70906_o()) {
/* 355 */         func_70904_g(true);
/*     */       } else {
/* 357 */         func_70904_g(false);
/*     */       } 
/* 359 */       return true;
/*     */     } 
/*     */     
/* 362 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 370 */     if (func_70906_o())
/*     */     {
/* 372 */       return null;
/*     */     }
/* 374 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 382 */     return "orespawn:cryo_hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 390 */     return "orespawn:cryo_death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 398 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 406 */     return Item.func_150898_a((Block)Blocks.field_150328_O);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 414 */     int var3 = 0;
/*     */     
/* 416 */     if (func_70909_n()) {
/*     */       
/* 418 */       var3 = this.field_70146_Z.nextInt(5);
/* 419 */       var3 += 2;
/* 420 */       for (int var4 = 0; var4 < var3; var4++)
/*     */       {
/* 422 */         func_145779_a(Item.func_150898_a((Block)Blocks.field_150328_O), 1);
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
/*     */   protected float func_70647_i() {
/* 434 */     return func_70631_g_() ? ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.5F) : ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.1F + 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 444 */     boolean ret = false;
/* 445 */     ret = super.func_70097_a(par1DamageSource, par2);
/* 446 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/* 455 */     if (func_70631_g_()) {
/* 456 */       func_110163_bv();
/* 457 */       return false;
/*     */     } 
/* 459 */     if (func_104002_bU()) return false; 
/* 460 */     if (func_70909_n()) return false; 
/* 461 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 466 */     return (EntityAgeable)spawnBabyAnimal(entityageable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Camarasaurus spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
/* 472 */     return new Camarasaurus(this.field_70170_p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ItemStack par1ItemStack) {
/* 480 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151034_e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70877_b(ItemStack par1ItemStack) {
/* 489 */     return (par1ItemStack.func_77973_b() == OreSpawnMain.MyCrystalApple);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Camarasaurus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */