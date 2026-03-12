/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.world.EnumDifficulty;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityCannonFodder
/*     */   extends EntityTameable
/*     */ {
/*  26 */   String name_one = null;
/*  27 */   String name_two = null;
/*  28 */   private int is_activated = 0;
/*  29 */   private int hat_color = 0;
/*  30 */   private int syncer = 0;
/*  31 */   private int px = 0;
/*  32 */   private int pz = 0;
/*  33 */   private int py = 0;
/*  34 */   private GenericTargetSorter LocalTargetSorter = null;
/*     */   
/*     */   public EntityCannonFodder(World par1World) {
/*  37 */     super(par1World);
/*  38 */     this.LocalTargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  43 */     super.func_110147_ax();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  49 */     super.func_70088_a();
/*  50 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(0));
/*  51 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  56 */     super.func_70071_h_();
/*  57 */     this.syncer++;
/*  58 */     if (this.syncer > 5) {
/*  59 */       if (this.field_70170_p.field_72995_K) {
/*  60 */         this.is_activated = this.field_70180_af.func_75679_c(20);
/*  61 */         this.hat_color = this.field_70180_af.func_75679_c(21);
/*     */       } else {
/*     */         
/*  64 */         this.field_70180_af.func_75692_b(20, Integer.valueOf(this.is_activated));
/*  65 */         this.field_70180_af.func_75692_b(21, Integer.valueOf(this.hat_color));
/*     */       } 
/*     */       
/*  68 */       this.syncer = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  74 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*     */     
/*  76 */     if (var2 != null)
/*     */     {
/*  78 */       if (var2.field_77994_a <= 0) {
/*     */         
/*  80 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  81 */         var2 = null;
/*     */       } 
/*     */     }
/*     */     
/*  85 */     if (super.func_70085_c(par1EntityPlayer)) {
/*  86 */       return true;
/*     */     }
/*     */     
/*  89 */     if (this.name_one != null && func_70909_n()) {
/*  90 */       if (this.name_one.equals(par1EntityPlayer.func_110124_au().toString())) {
/*  91 */         if (this.name_two == null)
/*     */         {
/*     */           
/*  94 */           this.name_two = this.name_one;
/*  95 */           this.name_one = par1EntityPlayer.func_110124_au().toString();
/*     */           
/*  97 */           func_152115_b(this.name_one);
/*  98 */           this.is_activated = 2;
/*     */         }
/*     */       
/* 101 */       } else if (this.name_two != null) {
/* 102 */         if (this.name_two.equals(par1EntityPlayer.func_110124_au().toString())) {
/*     */           
/* 104 */           this.name_two = this.name_one;
/* 105 */           this.name_one = par1EntityPlayer.func_110124_au().toString();
/* 106 */           func_152115_b(this.name_one);
/* 107 */           this.is_activated = 2;
/*     */         } else {
/*     */           
/* 110 */           return true;
/*     */         } 
/*     */       } else {
/* 113 */         this.name_two = this.name_one;
/* 114 */         this.name_one = par1EntityPlayer.func_110124_au().toString();
/* 115 */         func_152115_b(this.name_one);
/* 116 */         this.is_activated = 2;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 121 */     if (var2 != null && var2.func_77973_b() == Items.field_151172_bF && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/* 122 */       this.hat_color = 1;
/*     */       
/* 124 */       if (this.name_one == null) this.name_one = par1EntityPlayer.func_110124_au().toString(); 
/* 125 */       if (this.is_activated == 0) this.is_activated = 1; 
/* 126 */       func_70903_f(true);
/* 127 */       func_152115_b(this.name_one);
/* 128 */       func_70908_e(true);
/* 129 */       func_70691_i(func_110138_aP() - func_110143_aJ());
/* 130 */       func_110163_bv();
/* 131 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 133 */         var2.field_77994_a--;
/* 134 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 136 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 139 */       return true;
/* 140 */     }  if (var2 != null && var2.func_77973_b() == Items.field_151174_bG && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/* 141 */       this.hat_color = 3;
/*     */       
/* 143 */       if (this.name_one == null) this.name_one = par1EntityPlayer.func_110124_au().toString(); 
/* 144 */       if (this.is_activated == 0) this.is_activated = 1; 
/* 145 */       func_70903_f(true);
/* 146 */       func_152115_b(this.name_one);
/* 147 */       func_70908_e(true);
/* 148 */       func_70691_i(func_110138_aP() - func_110143_aJ());
/* 149 */       func_110163_bv();
/* 150 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 152 */         var2.field_77994_a--;
/* 153 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 155 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 158 */       return true;
/* 159 */     }  if (var2 != null && var2.func_77973_b() == OreSpawnMain.MyQuinoa && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/* 160 */       this.hat_color = 2;
/*     */       
/* 162 */       if (this.name_one == null) this.name_one = par1EntityPlayer.func_110124_au().toString(); 
/* 163 */       if (this.is_activated == 0) this.is_activated = 1; 
/* 164 */       func_70903_f(true);
/* 165 */       func_152115_b(this.name_one);
/* 166 */       func_70908_e(true);
/* 167 */       func_70691_i(func_110138_aP() - func_110143_aJ());
/* 168 */       func_110163_bv();
/* 169 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 171 */         var2.field_77994_a--;
/* 172 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 174 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 177 */       return true;
/* 178 */     }  if (var2 != null && this.is_activated == 2 && var2.func_77973_b() == OreSpawnMain.MyCornCob && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*     */       
/* 180 */       String myname = "Ostrich";
/* 181 */       if (this instanceof Lizard) myname = "Lizard"; 
/* 182 */       if (this instanceof Chipmunk) myname = "Chipmunk"; 
/* 183 */       if (this instanceof VelocityRaptor) myname = "Velocity Raptor"; 
/* 184 */       if (!this.field_70170_p.field_72995_K) {
/* 185 */         Entity newent = spawnCreature(this.field_70170_p, myname, this.field_70165_t + this.field_70170_p.field_73012_v.nextFloat(), this.field_70163_u + 0.01D, this.field_70161_v + this.field_70170_p.field_73012_v.nextFloat());
/* 186 */         if (newent != null) {
/* 187 */           EntityCannonFodder cf = (EntityCannonFodder)newent;
/* 188 */           cf.func_152115_b(func_152113_b());
/* 189 */           cf.func_70903_f(true);
/* 190 */           cf.setStuff(this.hat_color, this.is_activated, this.name_one, this.name_two);
/*     */         } 
/*     */       } 
/*     */       
/* 194 */       func_70908_e(true);
/* 195 */       this.field_70170_p.func_72956_a((Entity)par1EntityPlayer, "random.explode", 0.75F, 2.0F);
/*     */       
/* 197 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*     */         
/* 199 */         var2.field_77994_a--;
/* 200 */         if (var2.field_77994_a <= 0)
/*     */         {
/* 202 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*     */         }
/*     */       } 
/* 205 */       return true;
/* 206 */     }  if (this.is_activated == 2 && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/* 207 */       if (func_70906_o()) {
/* 208 */         func_70904_g(false);
/* 209 */         func_70908_e(true);
/*     */       } else {
/* 211 */         func_70904_g(true);
/* 212 */         func_70908_e(false);
/* 213 */         this.px = (int)this.field_70165_t;
/* 214 */         this.py = (int)this.field_70163_u;
/* 215 */         this.pz = (int)this.field_70161_v;
/*     */       } 
/* 217 */       return true;
/*     */     } 
/*     */     
/* 220 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 229 */     Entity var8 = null;
/* 230 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 231 */     if (var8 != null) {
/*     */ 
/*     */       
/* 234 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 237 */       par0World.func_72838_d(var8);
/*     */       
/* 239 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/* 241 */     return var8;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStuff(int hc, int ia, String s1, String s2) {
/* 246 */     this.hat_color = hc;
/* 247 */     this.is_activated = ia;
/* 248 */     this.name_one = s1;
/* 249 */     this.name_two = s2;
/* 250 */     func_110163_bv();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHatColor() {
/* 256 */     return this.hat_color;
/*     */   }
/*     */ 
/*     */   
/*     */   public int get_is_activated() {
/* 261 */     return this.is_activated;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 270 */     super.func_70014_b(par1NBTTagCompound);
/* 271 */     if (this.name_one == null) {
/*     */       
/* 273 */       par1NBTTagCompound.func_74778_a("NameOne", "");
/*     */     }
/*     */     else {
/*     */       
/* 277 */       par1NBTTagCompound.func_74778_a("NameOne", this.name_one);
/*     */     } 
/* 279 */     if (this.name_two == null) {
/*     */       
/* 281 */       par1NBTTagCompound.func_74778_a("NameTwo", "");
/*     */     }
/*     */     else {
/*     */       
/* 285 */       par1NBTTagCompound.func_74778_a("NameTwo", this.name_two);
/*     */     } 
/* 287 */     par1NBTTagCompound.func_74768_a("IsActivated", this.is_activated);
/* 288 */     par1NBTTagCompound.func_74768_a("HatColor", this.hat_color);
/* 289 */     par1NBTTagCompound.func_74768_a("PatrolX", this.px);
/* 290 */     par1NBTTagCompound.func_74768_a("PatrolY", this.py);
/* 291 */     par1NBTTagCompound.func_74768_a("PatrolZ", this.pz);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 299 */     super.func_70037_a(par1NBTTagCompound);
/* 300 */     this.name_one = par1NBTTagCompound.func_74779_i("NameOne");
/* 301 */     if (this.name_one != null && this.name_one.equals("")) this.name_one = null; 
/* 302 */     this.name_two = par1NBTTagCompound.func_74779_i("NameTwo");
/* 303 */     if (this.name_two != null && this.name_two.equals("")) this.name_two = null; 
/* 304 */     this.is_activated = par1NBTTagCompound.func_74762_e("IsActivated");
/* 305 */     this.hat_color = par1NBTTagCompound.func_74762_e("HatColor");
/* 306 */     this.px = par1NBTTagCompound.func_74762_e("PatrolX");
/* 307 */     this.py = par1NBTTagCompound.func_74762_e("PatrolY");
/* 308 */     this.pz = par1NBTTagCompound.func_74762_e("PatrolZ");
/* 309 */     if (this.name_one != null) {
/* 310 */       func_70903_f(true);
/* 311 */       func_152115_b(this.name_one);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 320 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 322 */     if (par1EntityLiving == null)
/*     */     {
/* 324 */       return false;
/*     */     }
/* 326 */     if (par1EntityLiving == this)
/*     */     {
/* 328 */       return false;
/*     */     }
/* 330 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 332 */       return false;
/*     */     }
/* 334 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 337 */       return false;
/*     */     }
/*     */     
/* 340 */     if (func_70906_o()) {
/*     */       
/* 342 */       double dx = this.px - par1EntityLiving.field_70165_t;
/* 343 */       double dy = this.py - par1EntityLiving.field_70163_u;
/* 344 */       double dz = this.pz - par1EntityLiving.field_70161_v;
/* 345 */       if (dx * dx + dy * dy + dz * dz > 144.0D) return false;
/*     */     
/*     */     } 
/* 348 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*     */     {
/* 350 */       return true;
/*     */     }
/*     */     
/* 353 */     if (par1EntityLiving instanceof EntityCannonFodder) {
/*     */       
/* 355 */       EntityCannonFodder cf = (EntityCannonFodder)par1EntityLiving;
/* 356 */       int i = cf.getHatColor();
/* 357 */       if (i != 0 && i != this.hat_color) return true; 
/* 358 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 362 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 364 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 365 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 366 */         return false;
/*     */       }
/* 368 */       if (this.name_one != null && this.name_one.equals(p.func_110124_au().toString())) return false; 
/* 369 */       if (this.name_two != null && this.name_two.equals(p.func_110124_au().toString())) return false; 
/* 370 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 374 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 379 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(10.0D, 4.0D, 10.0D));
/* 380 */     Collections.sort(var5, this.LocalTargetSorter);
/* 381 */     Iterator<?> var2 = var5.iterator();
/* 382 */     Entity var3 = null;
/* 383 */     EntityLivingBase var4 = null;
/*     */     
/* 385 */     while (var2.hasNext()) {
/*     */       
/* 387 */       var3 = (Entity)var2.next();
/* 388 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 390 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 392 */         return var4;
/*     */       }
/*     */     } 
/* 395 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 403 */     if (this.is_activated == 2) return 3; 
/* 404 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void attackEntityAsFodder(Entity par1Entity, float f) {
/* 409 */     par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 416 */     if (this.field_70128_L)
/* 417 */       return;  super.func_70619_bc();
/* 418 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 419 */     if (this.is_activated != 2)
/* 420 */       return;  int pfreq = 5;
/* 421 */     int sfreq = 7;
/* 422 */     float dm = 4.0F;
/* 423 */     if (this instanceof Chipmunk) {
/* 424 */       dm = 3.0F;
/* 425 */       sfreq = 6;
/*     */     } 
/* 427 */     if (this instanceof Lizard) {
/* 428 */       dm = 6.0F;
/* 429 */       sfreq = 8;
/*     */     } 
/* 431 */     if (this instanceof VelocityRaptor) {
/* 432 */       sfreq = 6;
/* 433 */       pfreq = 4;
/*     */     } 
/* 435 */     if (this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.field_70170_p.field_73012_v.nextInt(pfreq) == 1) {
/* 436 */       EntityLivingBase e = findSomethingToAttack();
/* 437 */       if (e != null) {
/* 438 */         func_70661_as().func_75497_a((Entity)e, 1.25D);
/* 439 */         if (func_70068_e((Entity)e) < 9.0D)
/*     */         {
/* 441 */           if (this.field_70146_Z.nextInt(sfreq + 1) == 0 || this.field_70146_Z.nextInt(sfreq) == 1)
/*     */           {
/* 443 */             attackEntityAsFodder((Entity)e, dm);
/*     */           }
/*     */         }
/*     */       }
/* 447 */       else if (func_70906_o()) {
/* 448 */         func_70661_as().func_75492_a(this.px, this.py, this.pz, 0.6499999761581421D);
/*     */       } 
/*     */     } 
/*     */     
/* 452 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1) func_70691_i(1.0F);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable entityageable) {
/* 459 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityCannonFodder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */