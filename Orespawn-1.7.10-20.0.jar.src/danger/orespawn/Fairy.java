/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.passive.EntityAmbientCreature;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.EnumDifficulty;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Fairy
/*     */   extends EntityAmbientCreature
/*     */ {
/*  36 */   private static final ResourceLocation texture0 = new ResourceLocation("orespawn", "fairytexture.png");
/*  37 */   private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "fairytexture2.png");
/*  38 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "fairytexture3.png");
/*  39 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "fairytexture4.png");
/*  40 */   private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "fairytexture5.png");
/*  41 */   private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "fairytexture6.png");
/*  42 */   private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "fairytexture7.png");
/*  43 */   private static final ResourceLocation texture7 = new ResourceLocation("orespawn", "fairytexture8.png");
/*  44 */   private static final ResourceLocation texture8 = new ResourceLocation("orespawn", "fairytexture9.png");
/*     */   
/*  46 */   int my_blink = 0;
/*  47 */   int blinker = 0;
/*  48 */   int myspace = 0;
/*  49 */   public int fairy_type = 0;
/*  50 */   private int force_sync = 10;
/*  51 */   private ChunkCoordinates currentFlightTarget = null;
/*  52 */   private String myowner = null;
/*  53 */   private GenericTargetSorter TargetSorter = null;
/*     */   
/*     */   public Fairy(World par1World) {
/*  56 */     super(par1World);
/*  57 */     this.my_blink = 20 + this.field_70146_Z.nextInt(20);
/*  58 */     func_70105_a(0.4F, 0.8F);
/*  59 */     if (par1World != null) this.fairy_type = par1World.field_73012_v.nextInt(9); 
/*  60 */     func_70661_as().func_75491_a(true);
/*  61 */     this.field_70155_l = 3.0D;
/*  62 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F));
/*  63 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  64 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  69 */     super.func_110147_ax();
/*  70 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  71 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  72 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  73 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(3.0D);
/*     */   }
/*     */   
/*     */   public ResourceLocation getTexture(Fairy a) {
/*  77 */     if (this.fairy_type == 8) return texture8; 
/*  78 */     if (this.fairy_type == 7) return texture7; 
/*  79 */     if (this.fairy_type == 6) return texture6; 
/*  80 */     if (this.fairy_type == 5) return texture5; 
/*  81 */     if (this.fairy_type == 4) return texture4; 
/*  82 */     if (this.fairy_type == 3) return texture3; 
/*  83 */     if (this.fairy_type == 2) return texture2; 
/*  84 */     if (this.fairy_type == 1) return texture1; 
/*  85 */     return texture0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  90 */     super.func_70088_a();
/*  91 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.fairy_type));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOwner(EntityLivingBase e) {
/*  96 */     EntityPlayer p = null;
/*  97 */     if (e != null && 
/*  98 */       e instanceof EntityPlayer) {
/*  99 */       p = (EntityPlayer)e;
/* 100 */       String s = p.getDisplayName();
/* 101 */       if (s != null) {
/* 102 */         this.myowner = s;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float getBlink() {
/* 110 */     if (this.blinker < this.my_blink / 2) return 240.0F; 
/* 111 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 118 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false; 
/* 119 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 2.0F);
/* 120 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 128 */     return 4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 136 */     return 0.25F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 144 */     return 1.7F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 152 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 160 */     return "orespawn:rat_hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 168 */     return "orespawn:big_splat";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 176 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 185 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 190 */     return Item.func_150898_a(OreSpawnMain.CrystalTorch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 198 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 207 */     super.func_70071_h_();
/* 208 */     this.field_70181_x *= 0.600000023841D;
/* 209 */     this.blinker++;
/* 210 */     if (this.blinker > this.my_blink) this.blinker = 0; 
/* 211 */     this.force_sync--;
/* 212 */     if (this.force_sync < 0) {
/* 213 */       this.force_sync = 10;
/* 214 */       if (this.field_70170_p.field_72995_K) {
/* 215 */         this.fairy_type = this.field_70180_af.func_75679_c(20);
/*     */       } else {
/* 217 */         this.field_70180_af.func_75692_b(20, Integer.valueOf(this.fairy_type));
/*     */       } 
/*     */     } 
/*     */     
/* 221 */     long t = this.field_70170_p.func_72820_D();
/* 222 */     t %= 24000L;
/* 223 */     if (t < 12000L)
/*     */       return; 
/* 225 */     if (this.field_70170_p.field_72995_K && this.field_70170_p.field_73012_v.nextInt(5) == 0 && getBlink() > 1.0F) {
/* 226 */       this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t, this.field_70163_u - 0.15000000596046448D, this.field_70161_v, ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 8.0F), (-this.field_70170_p.field_73012_v.nextFloat() / 8.0F), ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) / 8.0F));
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
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 239 */     super.func_70014_b(par1NBTTagCompound);
/* 240 */     if (this.myowner == null) this.myowner = "null"; 
/* 241 */     par1NBTTagCompound.func_74778_a("MyOwner", this.myowner);
/* 242 */     par1NBTTagCompound.func_74768_a("FairyType", this.fairy_type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 251 */     super.func_70037_a(par1NBTTagCompound);
/* 252 */     this.myowner = par1NBTTagCompound.func_74779_i("MyOwner");
/* 253 */     if (this.myowner != null && 
/* 254 */       this.myowner.equals("null")) {
/* 255 */       this.myowner = null;
/*     */     }
/*     */     
/* 258 */     this.fairy_type = par1NBTTagCompound.func_74762_e("fairyType");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 266 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 268 */     if (par1EntityLiving == null)
/*     */     {
/* 270 */       return false;
/*     */     }
/* 272 */     if (par1EntityLiving == this)
/*     */     {
/* 274 */       return false;
/*     */     }
/* 276 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 279 */       return false;
/*     */     }
/* 281 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 284 */       return false;
/*     */     }
/*     */     
/* 287 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*     */     {
/* 289 */       return true;
/*     */     }
/*     */     
/* 292 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 299 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 300 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(8.0D, 8.0D, 8.0D));
/* 301 */     Collections.sort(var5, this.TargetSorter);
/* 302 */     Iterator<?> var2 = var5.iterator();
/* 303 */     Entity var3 = null;
/* 304 */     EntityLivingBase var4 = null;
/*     */     
/* 306 */     while (var2.hasNext()) {
/*     */       
/* 308 */       var3 = (Entity)var2.next();
/* 309 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 311 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 313 */         return var4;
/*     */       }
/*     */     } 
/* 316 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/* 322 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.25D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 329 */     int keep_trying = 25;
/*     */     
/* 331 */     if (this.field_70128_L)
/* 332 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 335 */     if (this.currentFlightTarget == null) {
/* 336 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 338 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.5F) {
/*     */       
/* 340 */       Block bid = Blocks.field_150348_b;
/* 341 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 342 */         int zdir = this.field_70170_p.field_73012_v.nextInt(8);
/* 343 */         int xdir = this.field_70170_p.field_73012_v.nextInt(8);
/* 344 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/* 345 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir; 
/* 346 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + this.field_70170_p.field_73012_v.nextInt(5) - 2, (int)this.field_70161_v + zdir);
/* 347 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 348 */         if (bid == Blocks.field_150350_a && 
/* 349 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/* 350 */           bid = Blocks.field_150348_b;
/*     */         }
/*     */         
/* 353 */         keep_trying--;
/*     */       } 
/* 355 */     } else if (this.field_70170_p.field_73012_v.nextInt(12) == 0 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*     */ 
/*     */       
/* 358 */       EntityLivingBase e = null;
/* 359 */       e = findSomethingToAttack();
/* 360 */       if (e != null)
/*     */       {
/*     */         
/* 363 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/* 364 */         if (func_70068_e((Entity)e) < 6.0D) {
/* 365 */           func_70652_k((Entity)e);
/*     */         }
/*     */       }
/*     */     
/* 369 */     } else if (this.myowner != null) {
/* 370 */       EntityPlayer p = this.field_70170_p.func_72924_a(this.myowner);
/* 371 */       if (p != null) {
/* 372 */         if (func_70068_e((Entity)p) > 64.0D) {
/* 373 */           this.currentFlightTarget.func_71571_b((int)p.field_70165_t + this.field_70170_p.field_73012_v.nextInt(3) - this.field_70170_p.field_73012_v.nextInt(3), (int)(p.field_70163_u + 1.0D), (int)p.field_70161_v + this.field_70170_p.field_73012_v.nextInt(3) - this.field_70170_p.field_73012_v.nextInt(3));
/*     */         }
/*     */         
/* 376 */         if (func_70068_e((Entity)p) > 256.0D) {
/* 377 */           func_70107_b(p.field_70165_t + this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat(), p.field_70163_u, p.field_70161_v + this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 382 */     if (this.field_70170_p.field_73012_v.nextInt(250) == 1) func_70691_i(1.0F);
/*     */     
/* 384 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 385 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 386 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 387 */     this.field_70159_w += (Math.signum(var1) * 0.2D - this.field_70159_w) * 0.1D;
/* 388 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.1D;
/* 389 */     this.field_70179_y += (Math.signum(var5) * 0.2D - this.field_70179_y) * 0.1D;
/* 390 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 391 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 392 */     this.field_70701_bs = 0.2F;
/* 393 */     this.field_70177_z += var8 / 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 402 */     return false;
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
/* 421 */     return true;
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
/*     */   public boolean func_70601_bi() {
/* 433 */     int sc = 0;
/*     */ 
/*     */     
/* 436 */     for (int k = -1; k <= 1; k++) {
/*     */       
/* 438 */       for (int j = -1; j <= 1; j++) {
/*     */         
/* 440 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u, (int)this.field_70161_v + k);
/* 441 */         if (bid == Blocks.field_150350_a) sc++; 
/*     */       } 
/*     */     } 
/* 444 */     if (sc < 6) return false; 
/* 445 */     if (this.field_70163_u < 50.0D) return false; 
/* 446 */     return true;
/*     */   }
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
/* 458 */     if (func_104002_bU()) return false; 
/* 459 */     if (this.myowner != null) return false; 
/* 460 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Fairy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */