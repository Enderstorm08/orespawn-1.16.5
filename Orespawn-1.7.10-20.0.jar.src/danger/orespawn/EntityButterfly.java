/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.passive.EntityAmbientCreature;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.world.EnumDifficulty;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityButterfly
/*     */   extends EntityAmbientCreature
/*     */ {
/*  33 */   private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "butterfly.png");
/*  34 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "butterfly2.png");
/*  35 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "butterfly3.png");
/*  36 */   private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "butterfly4.png");
/*  37 */   private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "eyemoth.png");
/*  38 */   private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "lunamoth.png");
/*  39 */   private static final ResourceLocation texture7 = new ResourceLocation("orespawn", "darkmoth.png");
/*  40 */   private static final ResourceLocation texture8 = new ResourceLocation("orespawn", "firemoth.png");
/*  41 */   private static final ResourceLocation texture9 = new ResourceLocation("orespawn", "vbutterfly1.png");
/*     */   
/*  43 */   public int butterfly_type = 0;
/*  44 */   private int attack_delay = 0;
/*  45 */   private GenericTargetSorter TargetSorter = null;
/*  46 */   private int force_sync = 25;
/*     */   
/*  48 */   private ChunkCoordinates currentFlightTarget = null;
/*     */   
/*     */   public EntityButterfly(World par1World) {
/*  51 */     super(par1World);
/*     */     
/*  53 */     this.butterfly_type = OreSpawnMain.OreSpawnRand.nextInt(4);
/*  54 */     func_70105_a(0.4F, 0.4F);
/*  55 */     func_70661_as().func_75491_a(true);
/*  56 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  61 */     super.func_110147_ax();
/*  62 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  63 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.10000000149011612D);
/*  64 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  65 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */   
/*     */   public ResourceLocation getTexture(EntityButterfly a) {
/*  69 */     if (a instanceof Mothra) return texture5; 
/*  70 */     if (a instanceof EntityLunaMoth) {
/*  71 */       if (((EntityLunaMoth)a).moth_type == 1) return texture5; 
/*  72 */       if (((EntityLunaMoth)a).moth_type == 2) return texture7; 
/*  73 */       if (((EntityLunaMoth)a).moth_type == 3) return texture8; 
/*  74 */       return texture6;
/*     */     } 
/*  76 */     if (this.butterfly_type == 1) {
/*  77 */       if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) {
/*  78 */         return texture9;
/*     */       }
/*  80 */       return texture2;
/*     */     } 
/*  82 */     if (this.butterfly_type == 2) return texture3; 
/*  83 */     if (this.butterfly_type == 3) return texture4; 
/*  84 */     return texture1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  89 */     super.func_70088_a();
/*  90 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.butterfly_type));
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  94 */     if (func_104002_bU()) return false; 
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 103 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 111 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 119 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 127 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 135 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70104_M() {
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82167_n(Entity par1Entity) {}
/*     */   
/*     */   protected void func_85033_bc() {}
/*     */   
/*     */   public int mygetMaxHealth() {
/* 152 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 160 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 167 */     int keep_trying = 25;
/* 168 */     if (this.field_70128_L)
/* 169 */       return;  super.func_70619_bc();
/*     */ 
/*     */     
/* 172 */     if (this.currentFlightTarget == null) {
/* 173 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*     */     }
/* 175 */     if (this.field_70146_Z.nextInt(100) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 4.0F) {
/*     */       
/* 177 */       Block bid = Blocks.field_150348_b;
/* 178 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/* 179 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + this.field_70146_Z.nextInt(7) - this.field_70146_Z.nextInt(7), (int)this.field_70163_u + this.field_70146_Z.nextInt(6) - 2, (int)this.field_70161_v + this.field_70146_Z.nextInt(7) - this.field_70146_Z.nextInt(7));
/* 180 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/* 181 */         keep_trying--;
/*     */       } 
/* 183 */     } else if (this.field_70146_Z.nextInt(10) == 0 && this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4 && this.butterfly_type == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*     */ 
/*     */       
/* 186 */       EntityLivingBase e = null;
/* 187 */       e = findSomethingToAttack();
/* 188 */       if (e != null) {
/*     */ 
/*     */         
/* 191 */         this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/* 192 */         if (func_70068_e((Entity)e) < 6.0D) {
/* 193 */           func_70652_k((Entity)e);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 199 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/* 200 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/* 201 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/* 202 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.10000000149011612D;
/* 203 */     this.field_70181_x += (Math.signum(var3) * 0.699999988079071D - this.field_70181_x) * 0.10000000149011612D;
/* 204 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.10000000149011612D;
/* 205 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/* 206 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/* 207 */     this.field_70701_bs = 0.5F;
/* 208 */     this.field_70177_z += var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 215 */     if (OreSpawnMain.OreSpawnRand.nextInt(2) != 0) return false; 
/* 216 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false; 
/* 217 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 1.0F);
/* 218 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 226 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*     */     
/* 228 */     if (par1EntityLiving == null)
/*     */     {
/* 230 */       return false;
/*     */     }
/* 232 */     if (par1EntityLiving == this)
/*     */     {
/* 234 */       return false;
/*     */     }
/* 236 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/*     */       
/* 239 */       return false;
/*     */     }
/* 241 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 244 */       return false;
/*     */     }
/*     */     
/* 247 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 249 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 250 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 251 */         return false;
/*     */       }
/* 253 */       return true;
/*     */     } 
/* 255 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityHorse)
/*     */     {
/* 257 */       return true;
/*     */     }
/* 259 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 264 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(8.0D, 5.0D, 8.0D));
/* 265 */     Collections.sort(var5, this.TargetSorter);
/* 266 */     Iterator<?> var2 = var5.iterator();
/* 267 */     Entity var3 = null;
/* 268 */     EntityLivingBase var4 = null;
/*     */     
/* 270 */     while (var2.hasNext()) {
/*     */       
/* 272 */       var3 = (Entity)var2.next();
/* 273 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 275 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 277 */         return var4;
/*     */       }
/*     */     } 
/* 280 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 285 */     super.func_70071_h_();
/* 286 */     this.field_70181_x *= 0.6000000238418579D;
/*     */     
/* 288 */     this.force_sync--;
/* 289 */     if (this.force_sync < 0) {
/* 290 */       this.force_sync = 25;
/* 291 */       if (this.field_70170_p.field_72995_K) {
/* 292 */         this.butterfly_type = this.field_70180_af.func_75679_c(20);
/*     */       } else {
/* 294 */         this.field_70180_af.func_75692_b(20, Integer.valueOf(this.butterfly_type));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 305 */     return false;
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
/* 324 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 333 */     if (par1EntityPlayer == null) return false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 339 */     if (!(par1EntityPlayer instanceof EntityPlayerMP)) return false;
/*     */ 
/*     */     
/* 342 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/* 343 */     if (var2 != null && 
/* 344 */       var2.field_77994_a <= 0) {
/* 345 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 346 */       var2 = null;
/*     */     } 
/*     */     
/* 349 */     if (var2 != null) {
/* 350 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 354 */     if (par1EntityPlayer.field_71093_bK != OreSpawnMain.DimensionID6) {
/* 355 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID6, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(OreSpawnMain.DimensionID6), OreSpawnMain.DimensionID6, this.field_70170_p));
/*     */     } else {
/*     */       
/* 358 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(0), 0, this.field_70170_p));
/*     */     } 
/*     */ 
/*     */     
/* 362 */     return true;
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
/* 374 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 376 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 378 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 380 */           Block block = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 381 */           if (block == Blocks.field_150474_ac) {
/* 382 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 383 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 384 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 385 */             if (s != null && 
/* 386 */               s.equals("Butterfly")) {
/* 387 */               this.butterfly_type = 1;
/* 388 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 396 */     Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/* 397 */     if (bid != Blocks.field_150350_a) return false; 
/* 398 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 399 */     if (this.field_70170_p.field_73011_w.field_76574_g == OreSpawnMain.DimensionID4) return true; 
/* 400 */     if (this.field_70163_u < 50.0D) return false; 
/* 401 */     return true;
/*     */   }
/*     */ 
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
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 417 */     super.func_70014_b(par1NBTTagCompound);
/*     */     
/* 419 */     par1NBTTagCompound.func_74768_a("ButterflyType", this.butterfly_type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 428 */     super.func_70037_a(par1NBTTagCompound);
/*     */     
/* 430 */     this.butterfly_type = par1NBTTagCompound.func_74762_e("ButterflyType");
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityButterfly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */