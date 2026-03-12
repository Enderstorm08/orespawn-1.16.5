/*      */ package danger.orespawn;
/*      */ 
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityList;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.boss.EntityDragon;
/*      */ import net.minecraft.entity.effect.EntityLightningBolt;
/*      */ import net.minecraft.entity.item.EntityItem;
/*      */ import net.minecraft.entity.monster.EntityMob;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.util.AxisAlignedBB;
/*      */ import net.minecraft.util.ChatComponentText;
/*      */ import net.minecraft.util.ChunkCoordinates;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.util.IChatComponent;
/*      */ import net.minecraft.util.MathHelper;
/*      */ import net.minecraft.util.Vec3;
/*      */ import net.minecraft.world.World;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class TheKing
/*      */   extends EntityMob
/*      */ {
/*   66 */   private ChunkCoordinates currentFlightTarget = null;
/*   67 */   private GenericTargetSorter TargetSorter = null;
/*   68 */   private EntityLivingBase rt = null;
/*   69 */   private double attdam = 250.0D;
/*   70 */   private int hurt_timer = 0;
/*   71 */   private int homex = 0;
/*   72 */   private int homez = 0;
/*   73 */   private int stream_count = 0;
/*   74 */   private int stream_count_l = 0;
/*   75 */   private int stream_count_i = 0;
/*   76 */   private int ticker = 0;
/*   77 */   private int player_hit_count = 0;
/*   78 */   private int backoff_timer = 0;
/*   79 */   private int guard_mode = 0;
/*   80 */   private volatile int head_found = 0;
/*   81 */   private int wing_sound = 0;
/*   82 */   private int large_unknown_detected = 0;
/*   83 */   private int isEnd = 0;
/*   84 */   private int endCounter = 0;
/*      */   
/*      */   public TheKing(World par1World) {
/*   87 */     super(par1World);
/*   88 */     if (OreSpawnMain.PlayNicely == 0) {
/*   89 */       func_70105_a(22.0F, 24.0F);
/*      */     } else {
/*   91 */       func_70105_a(5.5F, 6.0F);
/*      */     } 
/*   93 */     func_70661_as().func_75491_a(false);
/*   94 */     this.field_70728_aV = 25000;
/*   95 */     this.field_70178_ae = true;
/*   96 */     this.field_70174_ab = 5000;
/*   97 */     this.field_70145_X = true;
/*   98 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*   99 */     this.field_70155_l = 12.0D;
/*  100 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  101 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  102 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  107 */     super.func_110147_ax();
/*  108 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  109 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.6200000047683716D);
/*      */     
/*  111 */     this.attdam = OreSpawnMain.TheKing_stats.attack;
/*  112 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(this.attdam);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  118 */     super.func_70088_a();
/*  119 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  120 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*  121 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(this.isEnd));
/*      */   }
/*      */   
/*      */   public int getPlayNicely() {
/*  125 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean func_70112_a(double par1) {
/*  135 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean isInRangeToRenderVec3D(Vec3 par1Vec3) {
/*  143 */     return true;
/*      */   }
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  147 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getAttacking() {
/*  152 */     return this.field_70180_af.func_75683_a(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public final void setAttacking(int par1) {
/*  157 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  164 */     return 1.35F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70647_i() {
/*  171 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  178 */     return "orespawn:king_living";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  185 */     return "orespawn:king_hit";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  192 */     return "orespawn:trex_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70104_M() {
/*  199 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_82167_n(Entity par1Entity) {}
/*      */   
/*      */   public int mygetMaxHealth() {
/*  206 */     return OreSpawnMain.TheKing_stats.health;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  214 */     return Item.func_150898_a((Block)Blocks.field_150327_N);
/*      */   }
/*      */ 
/*      */   
/*      */   private void dropItemRand(Item index, int par1) {
/*  219 */     EntityItem var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(20) - OreSpawnMain.OreSpawnRand.nextInt(20), this.field_70163_u + 12.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(20) - OreSpawnMain.OreSpawnRand.nextInt(20), new ItemStack(index, par1, 0));
/*      */     
/*  221 */     this.field_70170_p.func_72838_d((Entity)var3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  227 */     Item it = null;
/*  228 */     Block bl = null;
/*      */ 
/*      */     
/*  231 */     this; spawnCreature(this.field_70170_p, "The Prince", this.field_70165_t, this.field_70163_u + 10.0D, this.field_70161_v);
/*      */     
/*  233 */     dropItemRand((Item)OreSpawnMain.RoyalBody, 1);
/*  234 */     dropItemRand((Item)OreSpawnMain.RoyalHelmet, 1);
/*  235 */     dropItemRand((Item)OreSpawnMain.RoyalLegs, 1);
/*  236 */     dropItemRand((Item)OreSpawnMain.RoyalBoots, 1);
/*  237 */     dropItemRand(OreSpawnMain.MyRoyal, 1);
/*      */     
/*  239 */     Iterator<Item> ilist = Item.field_150901_e.iterator();
/*  240 */     int icount = 0;
/*  241 */     while (ilist.hasNext()) {
/*  242 */       it = ilist.next();
/*  243 */       if (it != null) icount++;
/*      */     
/*      */     } 
/*      */     int j;
/*  247 */     for (j = 0; j < 150; ) {
/*  248 */       int k = 1 + this.field_70170_p.field_73012_v.nextInt(icount);
/*  249 */       ilist = Item.field_150901_e.iterator();
/*  250 */       while (k > 0 && ilist.hasNext()) {
/*  251 */         it = ilist.next();
/*  252 */         k--;
/*      */       } 
/*  254 */       if (it != null) {
/*  255 */         j++;
/*  256 */         dropItemRand(it, 1);
/*      */       } 
/*      */     } 
/*      */     
/*  260 */     Iterator<Block> blist = Block.field_149771_c.iterator();
/*  261 */     int bcount = 0;
/*  262 */     while (blist.hasNext()) {
/*  263 */       bl = blist.next();
/*  264 */       if (bl != null) bcount++;
/*      */     
/*      */     } 
/*      */     
/*  268 */     for (j = 0; j < 150; ) {
/*  269 */       int k = 1 + this.field_70170_p.field_73012_v.nextInt(bcount);
/*  270 */       blist = Block.field_149771_c.iterator();
/*  271 */       while (k > 0 && blist.hasNext()) {
/*  272 */         bl = blist.next();
/*  273 */         k--;
/*      */       } 
/*  275 */       if (bl != null) {
/*  276 */         j++;
/*  277 */         dropItemRand(Item.func_150898_a(bl), 1);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70650_aV() {
/*  310 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  318 */     super.func_70071_h_();
/*      */     
/*  320 */     this.wing_sound++;
/*  321 */     if (this.wing_sound > 30) {
/*      */       
/*  323 */       if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 1.75F, 0.75F); 
/*  324 */       this.wing_sound = 0;
/*      */     } 
/*      */     
/*  327 */     this.field_70145_X = true;
/*  328 */     this.field_70181_x *= 0.6D;
/*  329 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() * 2 / 3)) this.attdam = (OreSpawnMain.TheKing_stats.attack * 2); 
/*  330 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 2)) this.attdam = (OreSpawnMain.TheKing_stats.attack * 4); 
/*  331 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 4)) this.attdam = (OreSpawnMain.TheKing_stats.attack * 8); 
/*  332 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 8)) this.attdam = (OreSpawnMain.TheKing_stats.attack * 16);
/*      */     
/*  334 */     if (this.field_70170_p.field_72995_K) {
/*  335 */       float f = 7.0F;
/*  336 */       this.isEnd = this.field_70180_af.func_75679_c(22);
/*      */       
/*  338 */       if (this.isEnd != 0 && this.field_70170_p.field_73012_v.nextInt(3) == 1)
/*      */       {
/*  340 */         for (int i = 0; i < 10; i++) {
/*  341 */           this.field_70170_p.func_72869_a("fireworksSpark", this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + 14.0D, this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)), (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 4.0D + this.field_70159_w * 6.0D, (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 4.0D, (this.field_70170_p.field_73012_v.nextGaussian() - this.field_70170_p.field_73012_v.nextGaussian()) / 4.0D + this.field_70179_y * 6.0D);
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  358 */     if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */       
/*  360 */       float s = par1Entity.field_70131_O * par1Entity.field_70130_N;
/*  361 */       if (s > 30.0F && 
/*  362 */         !MyUtils.isRoyalty(par1Entity) && !(par1Entity instanceof Godzilla) && !(par1Entity instanceof GodzillaHead) && !(par1Entity instanceof PitchBlack) && !(par1Entity instanceof Kraken)) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  367 */         EntityLivingBase e = (EntityLivingBase)par1Entity;
/*  368 */         e.func_70606_j(e.func_110143_aJ() / 2.0F);
/*  369 */         e.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), (float)this.attdam * 10.0F);
/*  370 */         this.large_unknown_detected = 1;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  375 */     if (par1Entity != null && par1Entity instanceof EntityDragon) {
/*  376 */       EntityDragon dr = (EntityDragon)par1Entity;
/*  377 */       DamageSource var21 = null;
/*  378 */       var21 = DamageSource.func_94539_a(null);
/*  379 */       var21.func_94540_d();
/*  380 */       if (this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*  381 */         dr.func_70965_a(dr.field_70986_h, var21, (float)this.attdam);
/*      */       } else {
/*  383 */         dr.func_70965_a(dr.field_70987_i, var21, (float)this.attdam);
/*      */       } 
/*      */     } 
/*      */     
/*  387 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), (float)this.attdam);
/*  388 */     if (var4) {
/*  389 */       double ks = 3.3D;
/*  390 */       double inair = 0.25D;
/*  391 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  392 */       inair += (this.field_70170_p.field_73012_v.nextFloat() * 0.25F);
/*  393 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 1.5D; 
/*  394 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */     } 
/*      */     
/*  397 */     return var4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  405 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 8.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean tooFarFromHome() {
/*  411 */     float d1 = (float)(this.field_70165_t - this.homex);
/*  412 */     float d2 = (float)(this.field_70161_v - this.homez);
/*      */     
/*  414 */     d1 = (float)Math.sqrt((d1 * d1 + d2 * d2));
/*  415 */     if (d1 > 120.0F) return true; 
/*  416 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private void msgToPlayers(String s) {
/*  421 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityPlayer.class, this.field_70121_D.func_72314_b(80.0D, 64.0D, 80.0D));
/*  422 */     Collections.sort(var5, this.TargetSorter);
/*  423 */     Iterator<?> var2 = var5.iterator();
/*  424 */     Entity var3 = null;
/*  425 */     EntityPlayer var4 = null;
/*      */     
/*  427 */     while (var2.hasNext()) {
/*      */       
/*  429 */       var3 = (Entity)var2.next();
/*  430 */       var4 = (EntityPlayer)var3;
/*  431 */       var4.func_146105_b((IChatComponent)new ChatComponentText(s));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityPlayer findNearestPlayer() {
/*  437 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityPlayer.class, this.field_70121_D.func_72314_b(80.0D, 64.0D, 80.0D));
/*  438 */     Collections.sort(var5, this.TargetSorter);
/*  439 */     Iterator<?> var2 = var5.iterator();
/*  440 */     Entity var3 = null;
/*  441 */     EntityPlayer var4 = null;
/*      */     
/*  443 */     while (var2.hasNext()) {
/*      */       
/*  445 */       var3 = (Entity)var2.next();
/*  446 */       if (var3 instanceof EntityPlayer) var4 = (EntityPlayer)var3; 
/*  447 */       if (var4 != null)
/*      */         break; 
/*      */     } 
/*  450 */     return var4;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70619_bc() {
/*  455 */     int xdir = 1;
/*  456 */     int zdir = 1;
/*      */ 
/*      */ 
/*      */     
/*  460 */     int attrand = 5;
/*  461 */     int updown = 0;
/*  462 */     int which = 0;
/*  463 */     EntityLivingBase e = null;
/*  464 */     EntityLivingBase f = null;
/*      */     
/*  466 */     double rr = 0.0D;
/*  467 */     double rhdir = 0.0D;
/*  468 */     double rdd = 0.0D;
/*  469 */     double pi = 3.1415926545D;
/*  470 */     double var1 = 0.0D;
/*  471 */     double var3 = 0.0D;
/*  472 */     double var5 = 0.0D;
/*  473 */     float var7 = 0.0F;
/*  474 */     float var8 = 0.0F;
/*      */     
/*  476 */     EntityPlayer p = null;
/*      */     
/*  478 */     if (this.field_70128_L)
/*  479 */       return;  super.func_70619_bc();
/*  480 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(this.isEnd));
/*  481 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*      */     
/*  483 */     if (this.isEnd == 1) {
/*  484 */       this.endCounter++;
/*  485 */       this.field_70145_X = true;
/*  486 */       this.field_70159_w = 0.0D;
/*  487 */       this.field_70181_x = 0.0D;
/*  488 */       this.field_70179_y = 0.0D;
/*  489 */       this.hurt_timer = 10;
/*      */       
/*  491 */       if (this.field_70128_L)
/*      */         return; 
/*  493 */       p = findNearestPlayer();
/*  494 */       if (p != null) {
/*  495 */         func_70625_a((Entity)p, 10.0F, 10.0F);
/*  496 */         p.field_70159_w = 0.0D;
/*  497 */         p.field_70181_x = 0.0D;
/*  498 */         p.field_70179_y = 0.0D;
/*  499 */         double dd0 = this.field_70165_t - p.field_70165_t;
/*  500 */         double dd1 = this.field_70161_v - p.field_70161_v;
/*  501 */         float f2 = (float)(Math.atan2(dd1, dd0) * 180.0D / Math.PI) - 90.0F;
/*  502 */         p.field_70177_z = f2;
/*  503 */         p.func_70606_j(1.0F);
/*      */       } 
/*      */       
/*  506 */       if (this.endCounter == 10) {
/*  507 */         msgToPlayers("The King: Enough of this charade. I am done. You have shown me what I wanted to know.");
/*      */         return;
/*      */       } 
/*  510 */       if (this.endCounter == 80) {
/*  511 */         msgToPlayers("The King: That's right my little pet. It has all been a game. You never killed me. You can't.");
/*      */         return;
/*      */       } 
/*  514 */       if (this.endCounter == 160) {
/*  515 */         msgToPlayers("The King: I am the one. The only. The many. I exist within both space and time. Everywhere and always.");
/*      */         return;
/*      */       } 
/*  518 */       if (this.endCounter == 240) {
/*  519 */         msgToPlayers("The King: I used you to learn your ways, and I have reached my conclusion on your species.");
/*      */         return;
/*      */       } 
/*  522 */       if (this.endCounter == 300) {
/*  523 */         msgToPlayers("The King: You have 10 seconds to run...");
/*      */         return;
/*      */       } 
/*  526 */       if (this.endCounter == 320) {
/*  527 */         msgToPlayers("9.");
/*      */         return;
/*      */       } 
/*  530 */       if (this.endCounter == 340) {
/*  531 */         msgToPlayers("8.");
/*      */         return;
/*      */       } 
/*  534 */       if (this.endCounter == 360) {
/*  535 */         msgToPlayers("7.");
/*      */         return;
/*      */       } 
/*  538 */       if (this.endCounter == 380) {
/*  539 */         msgToPlayers("6.");
/*      */         return;
/*      */       } 
/*  542 */       if (this.endCounter == 400) {
/*  543 */         msgToPlayers("5.");
/*      */         return;
/*      */       } 
/*  546 */       if (this.endCounter == 420) {
/*  547 */         msgToPlayers("4.");
/*      */         return;
/*      */       } 
/*  550 */       if (this.endCounter == 440) {
/*  551 */         msgToPlayers("3.");
/*      */         return;
/*      */       } 
/*  554 */       if (this.endCounter == 460) {
/*  555 */         msgToPlayers("2.");
/*      */         return;
/*      */       } 
/*  558 */       if (this.endCounter == 480) {
/*  559 */         msgToPlayers("1.");
/*      */         return;
/*      */       } 
/*  562 */       if (this.endCounter == 500) {
/*  563 */         msgToPlayers("The King: Prepare to die!");
/*  564 */         this.isEnd = 2;
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*      */       return;
/*      */     } 
/*  571 */     if (this.isEnd == 2) {
/*  572 */       this.hurt_timer = 10;
/*  573 */       this.player_hit_count = 0;
/*  574 */       this.stream_count = 10;
/*  575 */       this.stream_count_l = 10;
/*  576 */       this.stream_count_i = 10;
/*  577 */       attrand = 3;
/*  578 */       this.guard_mode = 0;
/*  579 */       this.large_unknown_detected = 1;
/*  580 */       if (this.backoff_timer > 0) this.backoff_timer--;
/*      */     
/*      */     } 
/*  583 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/*  584 */     if ((this.homex == 0 && this.homez == 0) || this.guard_mode == 0) {
/*  585 */       this.homex = (int)this.field_70165_t;
/*  586 */       this.homez = (int)this.field_70161_v;
/*      */     } 
/*      */ 
/*      */     
/*  590 */     this.ticker++;
/*  591 */     if (this.ticker > 30000) this.ticker = 0; 
/*  592 */     if (this.ticker % 80 == 0) this.stream_count = 10; 
/*  593 */     if (this.ticker % 90 == 0) this.stream_count_l = 5; 
/*  594 */     if (this.ticker % 70 == 0) this.stream_count_i = 8; 
/*  595 */     if (this.backoff_timer > 0) this.backoff_timer--;
/*      */     
/*  597 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 2)) attrand = 3; 
/*  598 */     this.field_70145_X = true;
/*      */ 
/*      */ 
/*      */     
/*  602 */     if (this.currentFlightTarget == null) {
/*  603 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     }
/*      */ 
/*      */     
/*  607 */     if (tooFarFromHome() || this.field_70170_p.field_73012_v.nextInt(200) == 0 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 9.1F) {
/*      */ 
/*      */ 
/*      */       
/*  611 */       zdir = this.field_70170_p.field_73012_v.nextInt(120);
/*  612 */       xdir = this.field_70170_p.field_73012_v.nextInt(120);
/*  613 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  614 */       if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir;
/*      */ 
/*      */       
/*  617 */       int dist = 0;
/*  618 */       for (int i = -5; i <= 5; i += 5) {
/*  619 */         for (int j = -5; j <= 5; j += 5) {
/*  620 */           Block bid = this.field_70170_p.func_147439_a(this.homex + j, (int)this.field_70163_u, this.homez + i);
/*  621 */           if (bid != Blocks.field_150350_a)
/*  622 */           { for (int k = 1; k < 20; k++) {
/*  623 */               bid = this.field_70170_p.func_147439_a(this.homex + j, (int)this.field_70163_u + k, this.homez + i);
/*  624 */               dist++;
/*  625 */               if (bid == Blocks.field_150350_a)
/*      */                 break; 
/*      */             }  }
/*  628 */           else { for (int k = 1; k < 20; k++) {
/*  629 */               bid = this.field_70170_p.func_147439_a(this.homex + j, (int)this.field_70163_u - k, this.homez + i);
/*  630 */               dist--;
/*  631 */               if (bid != Blocks.field_150350_a)
/*      */                 break; 
/*      */             }  }
/*      */         
/*      */         } 
/*  636 */       }  dist = dist / 9 + 2;
/*  637 */       if ((int)(this.field_70163_u + dist) > 230) dist = 230 - (int)this.field_70163_u; 
/*  638 */       this.currentFlightTarget.func_71571_b(this.homex + xdir, (int)(this.field_70163_u + dist), this.homez + zdir);
/*      */     
/*      */     }
/*  641 */     else if (this.field_70170_p.field_73012_v.nextInt(attrand) == 0) {
/*      */ 
/*      */       
/*  644 */       e = this.rt;
/*  645 */       if (OreSpawnMain.PlayNicely != 0) e = null; 
/*  646 */       if (e != null && (
/*  647 */         e instanceof TheKing || e instanceof KingHead)) {
/*  648 */         this.rt = null;
/*  649 */         e = null;
/*      */       } 
/*      */       
/*  652 */       if (e != null) {
/*      */         
/*  654 */         float d1 = (float)(e.field_70165_t - this.homex);
/*  655 */         float d2 = (float)(e.field_70161_v - this.homez);
/*  656 */         d1 = (float)Math.sqrt((d1 * d1 + d2 * d2));
/*  657 */         if (e.field_70128_L || this.field_70170_p.field_73012_v.nextInt(250) == 1 || (d1 > 128.0F && this.guard_mode == 1)) {
/*  658 */           e = null;
/*  659 */           this.rt = null;
/*      */         } 
/*  661 */         if (e != null && 
/*  662 */           !MyCanSee(e)) {
/*  663 */           e = null;
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  669 */       f = findSomethingToAttack();
/*  670 */       if (this.head_found == 0)
/*      */       {
/*  672 */         EntityLiving entityLiving = (EntityLiving)spawnCreature(this.field_70170_p, "KingHead", this.field_70165_t, this.field_70163_u + 20.0D, this.field_70161_v);
/*      */       }
/*      */ 
/*      */       
/*  676 */       if (e == null) {
/*  677 */         e = f;
/*      */       }
/*      */       
/*  680 */       if (e != null) {
/*      */ 
/*      */         
/*  683 */         setAttacking(1);
/*  684 */         if (this.backoff_timer == 0) {
/*  685 */           int dist = (int)(e.field_70163_u + (e.field_70131_O / 2.0F) + 1.0D);
/*  686 */           if (dist > 230) dist = 230; 
/*  687 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, dist, (int)e.field_70161_v);
/*  688 */           if (this.field_70170_p.field_73012_v.nextInt(70) == 1) this.backoff_timer = 80 + this.field_70170_p.field_73012_v.nextInt(80);
/*      */         
/*  690 */         } else if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 9.1F) {
/*      */ 
/*      */           
/*  693 */           zdir = this.field_70170_p.field_73012_v.nextInt(20) + 30;
/*  694 */           xdir = this.field_70170_p.field_73012_v.nextInt(20) + 30;
/*  695 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  696 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir;
/*      */ 
/*      */           
/*  699 */           int dist = 0;
/*  700 */           for (int i = -5; i <= 5; i += 5) {
/*  701 */             for (int j = -5; j <= 5; j += 5) {
/*  702 */               Block bid = this.field_70170_p.func_147439_a((int)e.field_70165_t + j, (int)this.field_70163_u, (int)e.field_70161_v + i);
/*  703 */               if (bid != Blocks.field_150350_a)
/*  704 */               { for (int k = 1; k < 20; k++) {
/*  705 */                   bid = this.field_70170_p.func_147439_a((int)e.field_70165_t + j, (int)this.field_70163_u + k, (int)e.field_70161_v + i);
/*  706 */                   dist++;
/*  707 */                   if (bid == Blocks.field_150350_a)
/*      */                     break; 
/*      */                 }  }
/*  710 */               else { for (int k = 1; k < 20; k++) {
/*  711 */                   bid = this.field_70170_p.func_147439_a((int)e.field_70165_t + j, (int)this.field_70163_u - k, (int)e.field_70161_v + i);
/*  712 */                   dist--;
/*  713 */                   if (bid != Blocks.field_150350_a)
/*      */                     break; 
/*      */                 }  }
/*      */             
/*      */             } 
/*  718 */           }  dist = dist / 9 + 2;
/*  719 */           if ((int)(this.field_70163_u + dist) > 230) dist = 230 - (int)this.field_70163_u; 
/*  720 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t + xdir, (int)(this.field_70163_u + dist), (int)e.field_70161_v + zdir);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  726 */         if (func_70068_e((Entity)e) < 900.0D) {
/*  727 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) doJumpDamage(this.field_70165_t, this.field_70163_u, this.field_70161_v, 15.0D, (OreSpawnMain.TheKing_stats.attack / 4), 0); 
/*  728 */           func_70652_k((Entity)e);
/*      */         } 
/*      */         
/*  731 */         double dx = this.field_70165_t + 20.0D * Math.sin(Math.toRadians(this.field_70759_as));
/*  732 */         double dz = this.field_70161_v - 20.0D * Math.cos(Math.toRadians(this.field_70759_as));
/*  733 */         if (this.field_70170_p.field_73012_v.nextInt(3) == 1) doJumpDamage(dx, this.field_70163_u + 10.0D, dz, 15.0D, (OreSpawnMain.TheKing_stats.attack / 2), 1);
/*      */         
/*  735 */         if (getHorizontalDistanceSqToEntity((Entity)e) > 900.0D) {
/*  736 */           which = this.field_70170_p.field_73012_v.nextInt(3);
/*  737 */           if (which == 0) {
/*      */             
/*  739 */             if (this.stream_count > 0) {
/*  740 */               setAttacking(1);
/*      */ 
/*      */               
/*  743 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  744 */               rhdir = Math.toRadians(((this.field_70759_as + 90.0F) % 360.0F));
/*      */               
/*  746 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  747 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  748 */               rdd = Math.abs(rdd);
/*      */               
/*  750 */               if (rdd < 0.5D) {
/*  751 */                 firecanon(e);
/*      */               }
/*      */             }
/*      */           
/*  755 */           } else if (which == 1) {
/*  756 */             if (this.stream_count_l > 0) {
/*  757 */               setAttacking(1);
/*      */ 
/*      */               
/*  760 */               rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  761 */               rhdir = Math.toRadians(((this.field_70759_as + 90.0F) % 360.0F));
/*      */               
/*  763 */               rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  764 */               if (rdd > pi) rdd -= pi * 2.0D; 
/*  765 */               rdd = Math.abs(rdd);
/*      */               
/*  767 */               if (rdd < 0.5D) {
/*  768 */                 firecanonl(e);
/*      */               }
/*      */             }
/*      */           
/*      */           }
/*  773 */           else if (this.stream_count_i > 0) {
/*  774 */             setAttacking(1);
/*      */ 
/*      */             
/*  777 */             rr = Math.atan2(e.field_70161_v - this.field_70161_v, e.field_70165_t - this.field_70165_t);
/*  778 */             rhdir = Math.toRadians(((this.field_70759_as + 90.0F) % 360.0F));
/*      */             
/*  780 */             rdd = Math.abs(rr - rhdir) % pi * 2.0D;
/*  781 */             if (rdd > pi) rdd -= pi * 2.0D; 
/*  782 */             rdd = Math.abs(rdd);
/*      */             
/*  784 */             if (rdd < 0.5D) {
/*  785 */               firecanoni(e);
/*      */             }
/*      */           }
/*      */         
/*      */         } 
/*      */       } else {
/*      */         
/*  792 */         setAttacking(0);
/*  793 */         this.stream_count = 10;
/*  794 */         this.stream_count_l = 5;
/*  795 */         this.stream_count_i = 8;
/*      */       } 
/*      */     } 
/*      */     
/*  799 */     if (getAttacking() != 0 && this.isEnd == 2) {
/*  800 */       double xzoff = 10.0D;
/*  801 */       double yoff = 14.0D;
/*  802 */       this; Entity ppwr = spawnCreature(this.field_70170_p, "PurplePower", this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + yoff, this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z)));
/*      */ 
/*      */ 
/*      */       
/*  806 */       if (ppwr != null) {
/*  807 */         PurplePower pwr = (PurplePower)ppwr;
/*  808 */         pwr.field_70159_w = this.field_70159_w * 3.0D;
/*  809 */         pwr.field_70179_y = this.field_70179_y * 3.0D;
/*  810 */         pwr.setPurpleType(10);
/*      */       } 
/*      */     } 
/*      */     
/*  814 */     var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/*  815 */     var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/*  816 */     var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  822 */     this.field_70159_w += (Math.signum(var1) * 0.7D - this.field_70159_w) * 0.35D;
/*  823 */     this.field_70181_x += (Math.signum(var3) * 0.69999D - this.field_70181_x) * 0.3D;
/*  824 */     this.field_70179_y += (Math.signum(var5) * 0.7D - this.field_70179_y) * 0.35D;
/*      */     
/*  826 */     var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/*  827 */     var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/*  828 */     this.field_70701_bs = 1.0F;
/*  829 */     this.field_70177_z += var8 / 8.0F;
/*      */ 
/*      */     
/*  832 */     if (this.field_70170_p.field_73012_v.nextInt(30) == 1 && 
/*  833 */       func_110143_aJ() < mygetMaxHealth()) {
/*      */       
/*  835 */       func_70691_i(5.0F);
/*  836 */       if (this.large_unknown_detected != 0) func_70691_i(200.0F);
/*      */     
/*      */     } 
/*  839 */     if (this.player_hit_count < 10 && func_110143_aJ() < 2000.0F) func_70691_i(2000.0F - func_110143_aJ());
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private double getHorizontalDistanceSqToEntity(Entity e) {
/*  850 */     double d1 = e.field_70161_v - this.field_70161_v;
/*  851 */     double d2 = e.field_70165_t - this.field_70165_t;
/*  852 */     return d1 * d1 + d2 * d2;
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanon(EntityLivingBase e) {
/*  857 */     double yoff = 14.0D;
/*  858 */     double xzoff = 32.0D;
/*      */ 
/*      */     
/*  861 */     BetterFireball bf = null;
/*      */     
/*  863 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/*  864 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*  865 */     if (this.stream_count > 0) {
/*      */ 
/*      */ 
/*      */       
/*  869 */       bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff, e.field_70161_v - cz);
/*  870 */       bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/*  871 */       bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/*  872 */       bf.setReallyBig();
/*  873 */       this.field_70170_p.func_72956_a((Entity)this, "random.fuse", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  874 */       this.field_70170_p.func_72838_d((Entity)bf);
/*  875 */       for (int i = 0; i < 6; i++) {
/*  876 */         float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  877 */         float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  878 */         float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  879 */         bf = new BetterFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - cx + r1, e.field_70163_u + (e.field_70131_O / 2.0F) - this.field_70163_u + yoff + r2, e.field_70161_v - cz + r3);
/*  880 */         bf.func_70012_b(cx, this.field_70163_u + yoff, cz, this.field_70177_z, 0.0F);
/*  881 */         bf.func_70107_b(cx, this.field_70163_u + yoff, cz);
/*  882 */         bf.setBig();
/*  883 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 1) bf.setSmall(); 
/*  884 */         this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  885 */         this.field_70170_p.func_72838_d((Entity)bf);
/*      */       } 
/*  887 */       this.stream_count--;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void firecanonl(EntityLivingBase e) {
/*  894 */     double yoff = 14.0D;
/*  895 */     double xzoff = 32.0D;
/*      */ 
/*      */ 
/*      */     
/*  899 */     double var3 = 0.0D;
/*  900 */     double var5 = 0.0D;
/*  901 */     double var7 = 0.0D;
/*  902 */     float var9 = 0.0F;
/*  903 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/*  904 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*  905 */     if (this.stream_count_l > 0) {
/*  906 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  907 */       for (int i = 0; i < 3; i++) {
/*  908 */         float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  909 */         float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  910 */         float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  911 */         ThunderBolt lb = new ThunderBolt(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/*  912 */         lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/*  913 */         var3 = e.field_70165_t - lb.field_70165_t;
/*  914 */         var5 = e.field_70163_u + 0.25D - lb.field_70163_u;
/*  915 */         var7 = e.field_70161_v - lb.field_70161_v;
/*  916 */         var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/*  917 */         lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/*  918 */         lb.field_70159_w *= 3.0D;
/*  919 */         lb.field_70181_x *= 3.0D;
/*  920 */         lb.field_70179_y *= 3.0D;
/*  921 */         this.field_70170_p.func_72838_d((Entity)lb);
/*      */       } 
/*  923 */       this.stream_count_l--;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void firecanoni(EntityLivingBase e) {
/*  929 */     double yoff = 14.0D;
/*  930 */     double xzoff = 32.0D;
/*      */ 
/*      */ 
/*      */     
/*  934 */     double var3 = 0.0D;
/*  935 */     double var5 = 0.0D;
/*  936 */     double var7 = 0.0D;
/*  937 */     float var9 = 0.0F;
/*  938 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/*  939 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/*  940 */     if (this.stream_count_i > 0) {
/*  941 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  942 */       for (int i = 0; i < 5; i++) {
/*  943 */         float r1 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  944 */         float r2 = 3.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  945 */         float r3 = 5.0F * (this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat());
/*  946 */         IceBall lb = new IceBall(this.field_70170_p, cx, this.field_70163_u + yoff, cz);
/*  947 */         lb.setIceMaker(1);
/*  948 */         lb.func_70012_b(cx, this.field_70163_u + yoff, cz, 0.0F, 0.0F);
/*  949 */         var3 = e.field_70165_t - lb.field_70165_t;
/*  950 */         var5 = e.field_70163_u + 0.25D - lb.field_70163_u;
/*  951 */         var7 = e.field_70161_v - lb.field_70161_v;
/*  952 */         var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/*  953 */         lb.func_70186_c(var3, var5 + var9, var7, 1.4F, 4.0F);
/*  954 */         lb.field_70159_w *= 3.0D;
/*  955 */         lb.field_70181_x *= 3.0D;
/*  956 */         lb.field_70179_y *= 3.0D;
/*  957 */         this.field_70170_p.func_72838_d((Entity)lb);
/*      */       } 
/*  959 */       this.stream_count_i--;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  968 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70069_a(float par1) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70064_a(double par1, boolean par3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_145773_az() {
/*  986 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  994 */     boolean ret = false;
/*  995 */     float dm = par2;
/*      */ 
/*      */     
/*  998 */     if (this.hurt_timer > 0) return false; 
/*  999 */     if (dm > 750.0F) dm = 750.0F;
/*      */     
/* 1001 */     if (par1DamageSource.func_76355_l().equals("inWall")) {
/* 1002 */       return false;
/*      */     }
/*      */     
/* 1005 */     Entity e = par1DamageSource.func_76346_g();
/* 1006 */     if (e != null && e instanceof EntityLivingBase) {
/*      */       
/* 1008 */       EntityLivingBase enl = (EntityLivingBase)e;
/* 1009 */       float s = enl.field_70131_O * enl.field_70130_N;
/* 1010 */       if (s > 30.0F && 
/* 1011 */         !MyUtils.isRoyalty((Entity)enl) && !(enl instanceof Godzilla) && !(enl instanceof GodzillaHead) && !(enl instanceof PitchBlack) && !(enl instanceof Kraken)) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1016 */         dm /= 10.0F;
/* 1017 */         this.hurt_timer = 50;
/* 1018 */         this.large_unknown_detected = 1;
/*      */       } 
/*      */       
/* 1021 */       if (e instanceof EntityMob && 
/* 1022 */         s < 3.0F) {
/* 1023 */         e.func_70106_y();
/* 1024 */         return false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1029 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 1030 */       this.hurt_timer = 20;
/* 1031 */       ret = super.func_70097_a(par1DamageSource, dm);
/*      */       
/* 1033 */       if (e != null && e instanceof EntityPlayer)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 1038 */         this.player_hit_count++;
/*      */       }
/*      */       
/* 1041 */       if (e != null && e instanceof EntityLivingBase && this.currentFlightTarget != null)
/*      */       {
/* 1043 */         if (!MyUtils.isRoyalty(e)) {
/* 1044 */           this.rt = (EntityLivingBase)e;
/* 1045 */           int dist = (int)e.field_70163_u;
/* 1046 */           if (dist > 230) dist = 230; 
/* 1047 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, dist, (int)e.field_70161_v);
/*      */         } 
/*      */       }
/*      */     } 
/* 1051 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/* 1061 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/* 1069 */     if (this.large_unknown_detected != 0) return 25; 
/* 1070 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() * 2 / 3)) return OreSpawnMain.TheKing_stats.defense + 1; 
/* 1071 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 2)) return OreSpawnMain.TheKing_stats.defense + 2; 
/* 1072 */     if (this.player_hit_count < 10 && func_110143_aJ() < (mygetMaxHealth() / 4)) return OreSpawnMain.TheKing_stats.defense + 3; 
/* 1073 */     return OreSpawnMain.TheKing_stats.defense;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70077_a(EntityLightningBolt par1EntityLightningBolt) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void initCreature() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean MyCanSee(EntityLivingBase e) {
/* 1093 */     double xzoff = 22.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1099 */     int nblks = 20;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1105 */     double cx = this.field_70165_t - xzoff * Math.sin(Math.toRadians(this.field_70177_z));
/* 1106 */     double cz = this.field_70161_v + xzoff * Math.cos(Math.toRadians(this.field_70177_z));
/* 1107 */     float startx = (float)cx;
/* 1108 */     float starty = (float)(this.field_70163_u + (this.field_70131_O * 7.0F / 8.0F));
/* 1109 */     float startz = (float)cz;
/* 1110 */     float dx = (float)((e.field_70165_t - startx) / 20.0D);
/* 1111 */     float dy = (float)((e.field_70163_u + (e.field_70131_O / 2.0F) - starty) / 20.0D);
/* 1112 */     float dz = (float)((e.field_70161_v - startz) / 20.0D);
/*      */     
/* 1114 */     if (Math.abs(dx) > 1.0D) {
/* 1115 */       dy /= Math.abs(dx);
/* 1116 */       dz /= Math.abs(dx);
/* 1117 */       nblks = (int)(nblks * Math.abs(dx));
/* 1118 */       if (dx > 1.0F) dx = 1.0F; 
/* 1119 */       if (dx < -1.0F) dx = -1.0F; 
/*      */     } 
/* 1121 */     if (Math.abs(dy) > 1.0D) {
/* 1122 */       dx /= Math.abs(dy);
/* 1123 */       dz /= Math.abs(dy);
/* 1124 */       nblks = (int)(nblks * Math.abs(dy));
/* 1125 */       if (dy > 1.0F) dy = 1.0F; 
/* 1126 */       if (dy < -1.0F) dy = -1.0F; 
/*      */     } 
/* 1128 */     if (Math.abs(dz) > 1.0D) {
/* 1129 */       dy /= Math.abs(dz);
/* 1130 */       dx /= Math.abs(dz);
/* 1131 */       nblks = (int)(nblks * Math.abs(dz));
/* 1132 */       if (dz > 1.0F) dz = 1.0F; 
/* 1133 */       if (dz < -1.0F) dz = -1.0F;
/*      */     
/*      */     } 
/* 1136 */     for (int i = 0; i < nblks; i++) {
/* 1137 */       startx += dx;
/* 1138 */       starty += dy;
/* 1139 */       startz += dz;
/* 1140 */       Block bid = this.field_70170_p.func_147439_a((int)startx, (int)starty, (int)startz);
/* 1141 */       if (bid != Blocks.field_150358_i && bid != Blocks.field_150355_j && bid != Blocks.field_150362_t && bid != Blocks.field_150395_bd && 
/* 1142 */         bid != Blocks.field_150350_a) return false;
/*      */     
/*      */     } 
/*      */     
/* 1146 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 1156 */     if (par1EntityLiving == null)
/*      */     {
/* 1158 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1162 */     if (par1EntityLiving == this)
/*      */     {
/* 1164 */       return false;
/*      */     }
/* 1166 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*      */       
/* 1169 */       return false;
/*      */     }
/*      */     
/* 1172 */     if (par1EntityLiving instanceof KingHead) {
/*      */       
/* 1174 */       this.head_found = 1;
/* 1175 */       return false;
/*      */     } 
/* 1177 */     if (MyUtils.isRoyalty((Entity)par1EntityLiving))
/*      */     {
/* 1179 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1184 */     float d1 = (float)(par1EntityLiving.field_70165_t - this.homex);
/* 1185 */     float d2 = (float)(par1EntityLiving.field_70161_v - this.homez);
/* 1186 */     d1 = (float)Math.sqrt((d1 * d1 + d2 * d2));
/* 1187 */     if (d1 > 144.0F) return false;
/*      */     
/* 1189 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*      */     
/* 1191 */     if (this.isEnd == 2) {
/* 1192 */       if (par1EntityLiving instanceof EntityPlayer) {
/*      */         
/* 1194 */         EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 1195 */         if (p.field_71075_bZ.field_75098_d == true) {
/* 1196 */           return false;
/*      */         }
/* 1198 */         return true;
/*      */       } 
/* 1200 */       if (par1EntityLiving instanceof Girlfriend)
/*      */       {
/* 1202 */         return true;
/*      */       }
/* 1204 */       if (par1EntityLiving instanceof Boyfriend)
/*      */       {
/* 1206 */         return true;
/*      */       }
/* 1208 */       if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
/*      */       {
/* 1210 */         return true;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1215 */     if (!MyCanSee(par1EntityLiving))
/*      */     {
/*      */       
/* 1218 */       return false;
/*      */     }
/*      */     
/* 1221 */     if (par1EntityLiving instanceof EntityPlayer) {
/*      */       
/* 1223 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 1224 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 1225 */         return false;
/*      */       }
/* 1227 */       return true;
/*      */     } 
/*      */     
/* 1230 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityHorse)
/*      */     {
/* 1232 */       return true;
/*      */     }
/* 1234 */     if (par1EntityLiving instanceof EntityMob)
/*      */     {
/* 1236 */       return true;
/*      */     }
/*      */     
/* 1239 */     if (par1EntityLiving instanceof EntityDragon)
/*      */     {
/* 1241 */       return true;
/*      */     }
/* 1243 */     if (MyUtils.isAttackableNonMob(par1EntityLiving)) {
/* 1244 */       return true;
/*      */     }
/*      */     
/* 1247 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/* 1252 */     if (OreSpawnMain.PlayNicely != 0) {
/* 1253 */       this.head_found = 1;
/* 1254 */       return null;
/*      */     } 
/*      */     
/* 1257 */     if (this.isEnd == 2) {
/* 1258 */       List<?> var5p = this.field_70170_p.func_72872_a(EntityPlayer.class, this.field_70121_D.func_72314_b(80.0D, 64.0D, 80.0D));
/* 1259 */       Collections.sort(var5p, this.TargetSorter);
/* 1260 */       Iterator<?> var2p = var5p.iterator();
/* 1261 */       Entity var3p = null;
/* 1262 */       EntityLivingBase var4p = null;
/* 1263 */       EntityLivingBase retp = null;
/* 1264 */       this.head_found = 1;
/* 1265 */       while (var2p.hasNext()) {
/*      */         
/* 1267 */         var3p = (Entity)var2p.next();
/* 1268 */         var4p = (EntityLivingBase)var3p;
/*      */         
/* 1270 */         if (isSuitableTarget(var4p, false))
/*      */         {
/* 1272 */           return var4p;
/*      */         }
/*      */       } 
/*      */     } 
/* 1276 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(80.0D, 64.0D, 80.0D));
/* 1277 */     Collections.sort(var5, this.TargetSorter);
/* 1278 */     Iterator<?> var2 = var5.iterator();
/* 1279 */     Entity var3 = null;
/* 1280 */     EntityLivingBase var4 = null;
/* 1281 */     EntityLivingBase ret = null;
/*      */     
/* 1283 */     this.head_found = 0;
/* 1284 */     while (var2.hasNext()) {
/*      */       
/* 1286 */       var3 = (Entity)var2.next();
/* 1287 */       var4 = (EntityLivingBase)var3;
/*      */       
/* 1289 */       if (isSuitableTarget(var4, false))
/*      */       {
/*      */         
/* 1292 */         if (ret == null) ret = var4; 
/*      */       }
/* 1294 */       if (ret != null && this.head_found != 0)
/*      */         break; 
/* 1296 */     }  return ret;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setGuardMode(int i) {
/* 1301 */     this.guard_mode = i;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFree() {
/* 1306 */     this.isEnd = 1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 1316 */     super.func_70014_b(par1NBTTagCompound);
/*      */     
/* 1318 */     par1NBTTagCompound.func_74768_a("KingHomeX", this.homex);
/* 1319 */     par1NBTTagCompound.func_74768_a("KingHomeZ", this.homez);
/* 1320 */     par1NBTTagCompound.func_74768_a("GuardMode", this.guard_mode);
/* 1321 */     par1NBTTagCompound.func_74768_a("PlayerHits", this.player_hit_count);
/* 1322 */     par1NBTTagCompound.func_74768_a("IsEnd", this.isEnd);
/* 1323 */     par1NBTTagCompound.func_74768_a("EndCounter", this.endCounter);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 1333 */     super.func_70037_a(par1NBTTagCompound);
/*      */     
/* 1335 */     this.homex = par1NBTTagCompound.func_74762_e("KingHomeX");
/* 1336 */     this.homez = par1NBTTagCompound.func_74762_e("KingHomeZ");
/* 1337 */     this.guard_mode = par1NBTTagCompound.func_74762_e("GuardMode");
/* 1338 */     this.player_hit_count = par1NBTTagCompound.func_74762_e("PlayerHits");
/* 1339 */     this.isEnd = par1NBTTagCompound.func_74762_e("IsEnd");
/* 1340 */     this.endCounter = par1NBTTagCompound.func_74762_e("EndCounter");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 1349 */     Entity var8 = null;
/* 1350 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 1351 */     if (var8 != null) {
/*      */ 
/*      */       
/* 1354 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1357 */       par0World.func_72838_d(var8);
/*      */     } 
/* 1359 */     return var8;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase doJumpDamage(double X, double Y, double Z, double dist, double damage, int knock) {
/* 1364 */     AxisAlignedBB bb = AxisAlignedBB.func_72330_a(X - dist, Y - 10.0D, Z - dist, X + dist, Y + 10.0D, Z + dist);
/* 1365 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, bb);
/* 1366 */     Collections.sort(var5, this.TargetSorter);
/* 1367 */     Iterator<?> var2 = var5.iterator();
/* 1368 */     Entity var3 = null;
/* 1369 */     EntityLivingBase var4 = null;
/*      */     
/* 1371 */     while (var2.hasNext()) {
/*      */       
/* 1373 */       var3 = (Entity)var2.next();
/* 1374 */       var4 = (EntityLivingBase)var3;
/*      */       
/* 1376 */       if (var4 == null) {
/*      */         continue;
/*      */       }
/*      */       
/* 1380 */       if (var4 == this) {
/*      */         continue;
/*      */       }
/*      */       
/* 1384 */       if (!var4.func_70089_S()) {
/*      */         continue;
/*      */       }
/*      */       
/* 1388 */       if (MyUtils.isRoyalty((Entity)var4)) {
/*      */         continue;
/*      */       }
/*      */       
/* 1392 */       if (var4 instanceof Ghost || 
/* 1393 */         var4 instanceof GhostSkelly)
/*      */         continue; 
/* 1395 */       DamageSource var21 = null;
/* 1396 */       var21 = DamageSource.func_94539_a(null);
/* 1397 */       var21.func_94540_d();
/* 1398 */       var4.func_70097_a(var21, (float)damage / 2.0F);
/* 1399 */       var4.func_70097_a(DamageSource.field_76379_h, (float)damage / 2.0F);
/* 1400 */       this.field_70170_p.func_72956_a((Entity)var4, "random.explode", 0.65F, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.5F);
/* 1401 */       if (knock != 0) {
/* 1402 */         double ks = 2.75D;
/* 1403 */         double inair = 0.65D;
/* 1404 */         float f3 = (float)Math.atan2(var4.field_70161_v - this.field_70161_v, var4.field_70165_t - this.field_70165_t);
/* 1405 */         var4.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */       } 
/*      */     } 
/*      */     
/* 1409 */     return null;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\TheKing.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */