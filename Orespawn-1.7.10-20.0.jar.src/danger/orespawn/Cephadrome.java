/*      */ package danger.orespawn;
/*      */ 
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.enchantment.Enchantment;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*      */ import net.minecraft.entity.boss.EntityDragon;
/*      */ import net.minecraft.entity.item.EntityItem;
/*      */ import net.minecraft.entity.passive.EntityTameable;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.util.MathHelper;
/*      */ import net.minecraft.world.EnumDifficulty;
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
/*      */ 
/*      */ 
/*      */ public class Cephadrome
/*      */   extends EntityCreature
/*      */ {
/*      */   private int boatPosRotationIncrements;
/*      */   private double boatX;
/*      */   private double boatY;
/*      */   private double boatZ;
/*      */   private double boatYaw;
/*      */   private double boatPitch;
/*      */   private double boatYawHead;
/*   73 */   private int damage_counter = 100;
/*   74 */   private int updateit = 1;
/*   75 */   private int color = 1;
/*   76 */   private int playing = 0;
/*   77 */   private GenericTargetSorter TargetSorter = null;
/*   78 */   private RenderInfo renderdata = new RenderInfo();
/*   79 */   private int hurt_timer = 0;
/*      */   private int wasfed;
/*   81 */   private int shouldattack = 0;
/*   82 */   private int wing_sound = 0;
/*   83 */   private int hit_by_player = 0;
/*   84 */   private int badmood = 0;
/*   85 */   private float moveSpeed = 0.25F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Cephadrome(World par1World) {
/*   92 */     super(par1World);
/*   93 */     func_70105_a(2.5F, 2.25F);
/*   94 */     func_70661_as().func_75491_a(true);
/*   95 */     this.field_70728_aV = 200;
/*   96 */     this.field_70174_ab = 100;
/*   97 */     this.field_70178_ae = false;
/*   98 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*   99 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot(this, 16, 1.0D));
/*  100 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 9.0F));
/*  101 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  102 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget(this, false));
/*  103 */     this.field_70153_n = null;
/*  104 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*  105 */     this.renderdata = new RenderInfo();
/*      */   }
/*      */ 
/*      */   
/*      */   public Cephadrome(World par1World, double par2, double par4, double par6) {
/*  110 */     this(par1World);
/*  111 */     func_70107_b(par2, par4 + this.field_70129_M, par6);
/*  112 */     this.field_70159_w = 0.0D;
/*  113 */     this.field_70181_x = 0.0D;
/*  114 */     this.field_70179_y = 0.0D;
/*  115 */     this.field_70169_q = par2;
/*  116 */     this.field_70167_r = par4;
/*  117 */     this.field_70166_s = par6;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  123 */     super.func_110147_ax();
/*  124 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  125 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  126 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  127 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(70.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean shouldRiderSit() {
/*  136 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getTrackingRange() {
/*  141 */     return 128;
/*      */   }
/*      */   
/*      */   public int getUpdateFrequency() {
/*  145 */     return 10;
/*      */   }
/*      */   
/*      */   public boolean sendsVelocityUpdates() {
/*  149 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70069_a(float par1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70064_a(double par1, boolean par3) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  163 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  168 */     super.func_70088_a();
/*  169 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  170 */     this.field_70180_af.func_75682_a(21, Byte.valueOf((byte)0));
/*      */     
/*  172 */     setActivity(0);
/*  173 */     setAttacking(0);
/*      */     
/*  175 */     if (this.renderdata == null) {
/*  176 */       this.renderdata = new RenderInfo();
/*      */     }
/*  178 */     this.renderdata.rf1 = 0.0F;
/*  179 */     this.renderdata.rf2 = 0.0F;
/*  180 */     this.renderdata.rf3 = 0.0F;
/*  181 */     this.renderdata.rf4 = 0.0F;
/*  182 */     this.renderdata.ri1 = 0;
/*  183 */     this.renderdata.ri2 = 0;
/*  184 */     this.renderdata.ri3 = 0;
/*  185 */     this.renderdata.ri4 = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  192 */     return 300;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RenderInfo getRenderInfo() {
/*  199 */     return this.renderdata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenderInfo(RenderInfo r) {
/*  204 */     this.renderdata.rf1 = r.rf1;
/*  205 */     this.renderdata.rf2 = r.rf2;
/*  206 */     this.renderdata.rf3 = r.rf3;
/*  207 */     this.renderdata.rf4 = r.rf4;
/*  208 */     this.renderdata.ri1 = r.ri1;
/*  209 */     this.renderdata.ri2 = r.ri2;
/*  210 */     this.renderdata.ri3 = r.ri3;
/*  211 */     this.renderdata.ri4 = r.ri4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  219 */     return 16;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70664_aZ() {
/*  224 */     super.func_70664_aZ();
/*  225 */     this.field_70181_x += 0.1D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  233 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String func_70639_aQ() {
/*  241 */     if (getActivity() != 1 && this.field_70146_Z.nextInt(6) == 1) {
/*  242 */       return "orespawn:MothraWings";
/*      */     }
/*  244 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  252 */     return "orespawn:alo_hurt";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  260 */     return "orespawn:alo_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  267 */     return 1.5F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float func_70647_i() {
/*  274 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70104_M() {
/*  283 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double func_70042_X() {
/*  291 */     return 2.5D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  299 */     return Items.field_151082_bd;
/*      */   }
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRand(Item index, int par1) {
/*  304 */     EntityItem var3 = null;
/*  305 */     ItemStack is = new ItemStack(index, par1, 0);
/*      */     
/*  307 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
/*      */     
/*  309 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  310 */     return is;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  318 */     int i = 4 + this.field_70170_p.field_73012_v.nextInt(6); int var4;
/*  319 */     for (var4 = 0; var4 < i; var4++) {
/*  320 */       dropItemRand(OreSpawnMain.UraniumNugget, 1);
/*      */     }
/*      */     
/*  323 */     i = 4 + this.field_70170_p.field_73012_v.nextInt(6);
/*  324 */     for (var4 = 0; var4 < i; var4++) {
/*  325 */       dropItemRand(OreSpawnMain.TitaniumNugget, 1);
/*      */     }
/*      */     
/*  328 */     i = 1 + this.field_70170_p.field_73012_v.nextInt(5);
/*  329 */     for (var4 = 0; var4 < i; var4++) {
/*  330 */       ItemStack is; int var3 = this.field_70170_p.field_73012_v.nextInt(20);
/*  331 */       switch (var3) {
/*      */         case 0:
/*  333 */           is = dropItemRand(OreSpawnMain.MyRubySword, 1);
/*      */           break;
/*      */         case 1:
/*  336 */           is = dropItemRand(Items.field_151045_i, 1);
/*      */           break;
/*      */         case 2:
/*  339 */           is = dropItemRand(OreSpawnMain.MyThunderStaff, 1);
/*      */           break;
/*      */         case 3:
/*  342 */           is = dropItemRand(OreSpawnMain.MyRubySword, 1);
/*  343 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  344 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  345 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  346 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  347 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  348 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  349 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 4:
/*  352 */           is = dropItemRand(OreSpawnMain.MyRubyShovel, 1);
/*  353 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  354 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 5:
/*  357 */           is = dropItemRand(OreSpawnMain.MyRubyPickaxe, 1);
/*  358 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  359 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  360 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 6:
/*  363 */           is = dropItemRand(OreSpawnMain.MyRubyAxe, 1);
/*  364 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  365 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 7:
/*  368 */           is = dropItemRand(OreSpawnMain.MyRubyHoe, 1);
/*  369 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  370 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 8:
/*  373 */           is = dropItemRand((Item)OreSpawnMain.RubyHelmet, 1);
/*  374 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  375 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  376 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  377 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  378 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  379 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2)); 
/*  380 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 9:
/*  383 */           is = dropItemRand((Item)OreSpawnMain.RubyBody, 1);
/*  384 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  385 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  386 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  387 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  388 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 10:
/*  391 */           is = dropItemRand((Item)OreSpawnMain.RubyLegs, 1);
/*  392 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  393 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  394 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  395 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  396 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 11:
/*  399 */           is = dropItemRand((Item)OreSpawnMain.RubyBoots, 1);
/*  400 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  401 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 12:
/*      */         case 13:
/*      */         case 14:
/*      */         case 15:
/*      */         case 16:
/*      */         case 17:
/*  409 */           is = dropItemRand(OreSpawnMain.MyRuby, 1);
/*      */           break;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getCephadromeHealth() {
/*  421 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  429 */     double ks = 2.5D;
/*  430 */     double inair = 0.35D;
/*  431 */     float iskraken = 1.0F;
/*  432 */     boolean ret = false;
/*  433 */     if (par1Entity != null && par1Entity instanceof EntityDragon) {
/*  434 */       EntityDragon dr = (EntityDragon)par1Entity;
/*  435 */       DamageSource var21 = null;
/*  436 */       var21 = DamageSource.func_94539_a(null);
/*  437 */       var21.func_94540_d();
/*  438 */       if (this.field_70170_p.field_73012_v.nextInt(6) == 1) {
/*  439 */         dr.func_70965_a(dr.field_70986_h, var21, 70.0F);
/*      */       } else {
/*  441 */         dr.func_70965_a(dr.field_70987_i, var21, 70.0F);
/*      */       } 
/*  443 */       ret = true;
/*      */     }
/*  445 */     else if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
/*      */       
/*  447 */       if (par1Entity instanceof Kraken) iskraken = 1.5F; 
/*  448 */       ret = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), iskraken * 70.0F);
/*      */       
/*  450 */       float f3 = (float)Math.atan2(par1Entity.field_70161_v - this.field_70161_v, par1Entity.field_70165_t - this.field_70165_t);
/*  451 */       if (par1Entity.field_70128_L || par1Entity instanceof EntityPlayer) inair *= 2.0D; 
/*  452 */       par1Entity.func_70024_g(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*      */     } 
/*      */     
/*  455 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  463 */     boolean ret = false;
/*  464 */     if (this.hurt_timer > 0) return false;
/*      */     
/*  466 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*  467 */       ret = super.func_70097_a(par1DamageSource, par2);
/*  468 */       this.hurt_timer = 25;
/*      */       
/*  470 */       Entity e = par1DamageSource.func_76346_g();
/*  471 */       if (e != null && e instanceof EntityLivingBase) {
/*      */         
/*  473 */         func_70624_b((EntityLivingBase)e);
/*  474 */         func_70784_b(e);
/*  475 */         func_70661_as().func_75497_a(e, 1.2D);
/*  476 */         ret = true;
/*      */       } 
/*  478 */       if (e != null && e instanceof EntityPlayer && func_110143_aJ() < func_110138_aP() * 9.0F / 10.0F)
/*      */       {
/*  480 */         this.hit_by_player = 1;
/*      */       }
/*      */     } 
/*  483 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public double getHorizontalDistanceSqToEntity(Entity par1Entity) {
/*  489 */     double d0 = this.field_70165_t - par1Entity.field_70165_t;
/*  490 */     double d2 = this.field_70161_v - par1Entity.field_70161_v;
/*  491 */     return d0 * d0 + d2 * d2;
/*      */   }
/*      */ 
/*      */   
/*      */   public void func_70619_bc() {
/*  496 */     EntityLivingBase e = null;
/*  497 */     double maxdist = 10.0D;
/*      */     
/*  499 */     if (this.field_70128_L)
/*      */       return; 
/*  501 */     if (this.updateit > 0) this.updateit--; 
/*  502 */     if (this.hurt_timer > 0) this.hurt_timer--;
/*      */     
/*  504 */     if (this.updateit <= 0 && !this.field_70170_p.field_72995_K) {
/*  505 */       this.updateit = 30;
/*  506 */       if (this.field_70153_n != null) {
/*  507 */         setActivity(1);
/*      */       } else {
/*  509 */         setActivity(0);
/*      */       } 
/*      */     } 
/*      */     
/*  513 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1 && 
/*  514 */       func_110143_aJ() < mygetMaxHealth()) {
/*  515 */       func_70691_i(2.0F);
/*      */     }
/*      */ 
/*      */     
/*  519 */     if (getActivity() == 0) {
/*  520 */       super.func_70619_bc();
/*      */     }
/*  522 */     if (this.field_70170_p.field_73012_v.nextInt(7) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */       
/*  524 */       e = func_70638_az();
/*  525 */       if (e != null && !e.func_70089_S()) {
/*  526 */         func_70624_b(null);
/*  527 */         e = null;
/*      */       } 
/*  529 */       if (e == null) {
/*  530 */         e = findSomethingToAttack();
/*      */       }
/*  532 */       if (e != null)
/*      */       
/*  534 */       { if (getActivity() == 0) {
/*  535 */           func_70661_as().func_75497_a((Entity)e, 1.7D);
/*  536 */           maxdist = 6.0D;
/*      */         } 
/*  538 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/*  539 */         setAttacking(1);
/*  540 */         if (func_70068_e((Entity)e) < (maxdist + (e.field_70130_N / 2.0F)) * (maxdist + (e.field_70130_N / 2.0F))) {
/*  541 */           func_70652_k((Entity)e);
/*      */         }
/*  543 */         else if (e instanceof Kraken && getHorizontalDistanceSqToEntity((Entity)e) < (maxdist + (e.field_70130_N / 2.0F)) * (maxdist + (e.field_70130_N / 2.0F))) {
/*  544 */           func_70652_k((Entity)e);
/*      */         }
/*      */          }
/*      */       
/*  548 */       else if (getAttacking() != 0) { setAttacking(0); }
/*      */     
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  559 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*      */     
/*  561 */     if (par1EntityLiving == null)
/*      */     {
/*  563 */       return false;
/*      */     }
/*  565 */     if (par1EntityLiving == this)
/*      */     {
/*  567 */       return false;
/*      */     }
/*  569 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*  571 */       return false;
/*      */     }
/*  573 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*  575 */       return false;
/*      */     }
/*  577 */     if (par1EntityLiving instanceof Cephadrome)
/*      */     {
/*  579 */       return false;
/*      */     }
/*  581 */     if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
/*      */     {
/*  583 */       return true;
/*      */     }
/*  585 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/*  587 */       return true;
/*      */     }
/*  589 */     if (par1EntityLiving instanceof Leon) {
/*      */       
/*  591 */       EntityTameable et = (EntityTameable)par1EntityLiving;
/*  592 */       if (et.func_70909_n()) return false; 
/*  593 */       return true;
/*      */     } 
/*  595 */     if (par1EntityLiving instanceof GammaMetroid) {
/*      */       
/*  597 */       EntityTameable et = (EntityTameable)par1EntityLiving;
/*  598 */       if (et.func_70909_n()) return false; 
/*  599 */       return true;
/*      */     } 
/*  601 */     if (par1EntityLiving instanceof WaterDragon) {
/*      */       
/*  603 */       EntityTameable et = (EntityTameable)par1EntityLiving;
/*  604 */       if (et.func_70909_n()) return false; 
/*  605 */       return true;
/*      */     } 
/*      */     
/*  608 */     if (par1EntityLiving instanceof EntityDragon)
/*      */     {
/*  610 */       return true;
/*      */     }
/*  612 */     if (par1EntityLiving instanceof EntityPlayer) {
/*      */       
/*  614 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/*  615 */       if (p.field_71075_bZ.field_75098_d == true) {
/*  616 */         return false;
/*      */       }
/*  618 */       if (this.hit_by_player != 0) return true; 
/*  619 */       if (this.badmood != 0) return true; 
/*  620 */       if (this.shouldattack > 0) {
/*  621 */         this.shouldattack = 0;
/*  622 */         return true;
/*      */       } 
/*  624 */       return false;
/*      */     } 
/*      */     
/*  627 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/*  632 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/*  633 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(16.0D, 20.0D, 16.0D));
/*  634 */     Collections.sort(var5, this.TargetSorter);
/*  635 */     Iterator<?> var2 = var5.iterator();
/*  636 */     Entity var3 = null;
/*  637 */     EntityLivingBase var4 = null;
/*      */     
/*  639 */     while (var2.hasNext()) {
/*      */       
/*  641 */       var3 = (Entity)var2.next();
/*  642 */       var4 = (EntityLivingBase)var3;
/*      */       
/*  644 */       if (isSuitableTarget(var4, false))
/*      */       {
/*  646 */         return var4;
/*      */       }
/*      */     } 
/*  649 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*      */     int k;
/*  658 */     for (k = -3; k < 3; k++) {
/*      */       
/*  660 */       for (int j = -3; j < 3; j++) {
/*      */         
/*  662 */         for (int i = 0; i < 5; i++) {
/*      */           
/*  664 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/*  665 */           if (bid == Blocks.field_150474_ac) {
/*  666 */             TileEntityMobSpawner tileentitymobspawner = null;
/*  667 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/*  668 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/*  669 */             if (s != null && 
/*  670 */               s.equals("Cephadrome")) {
/*  671 */               this.badmood = 1;
/*  672 */               return true;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  680 */     if ((!this.field_70170_p.func_72935_r() ? true : false) == true) return false; 
/*  681 */     if (this.field_70163_u < 50.0D) return false;
/*      */ 
/*      */     
/*  684 */     for (k = -2; k < 2; k++) {
/*      */       
/*  686 */       for (int j = -2; j < 2; j++) {
/*      */         
/*  688 */         for (int i = 1; i < 5; i++) {
/*      */           
/*  690 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/*  691 */           if (bid != Blocks.field_150350_a) return false;
/*      */         
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  697 */     Cephadrome target = null;
/*  698 */     target = (Cephadrome)this.field_70170_p.func_72857_a(Cephadrome.class, this.field_70121_D.func_72314_b(16.0D, 6.0D, 16.0D), (Entity)this);
/*  699 */     if (target != null)
/*      */     {
/*  701 */       return false;
/*      */     }
/*  703 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70056_a(double par1, double par3, double par5, float par7, float par8, int par9) {
/*  715 */     super.func_70056_a(par1, par3, par5, par7, par8, par9);
/*  716 */     this.boatPosRotationIncrements = par9;
/*      */     
/*  718 */     this.boatX = par1;
/*  719 */     this.boatY = par3;
/*  720 */     this.boatZ = par5;
/*  721 */     this.boatYaw = par7;
/*  722 */     this.boatPitch = par8;
/*  723 */     this.boatYawHead = par7;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void func_70016_h(double par1, double par3, double par5) {
/*  733 */     super.func_70016_h(par1, par3, par5);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  739 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  740 */     super.func_70071_h_();
/*  741 */     if (getActivity() == 1) {
/*  742 */       this.wing_sound++;
/*  743 */       if (this.wing_sound > 22) {
/*      */         
/*  745 */         if (!this.field_70170_p.field_72995_K) this.field_70170_p.func_72956_a((Entity)this, "orespawn:MothraWings", 0.5F, 1.0F); 
/*  746 */         this.wing_sound = 0;
/*      */       } 
/*      */     } 
/*  749 */     if (OreSpawnMain.PlayNicely == 0) this.wasfed = 1;
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  759 */     List<Entity> list = null;
/*  760 */     Entity listEntity = null;
/*      */ 
/*      */ 
/*      */     
/*  764 */     double d6 = (this.field_70146_Z.nextFloat() * 2.0F - 1.0F);
/*  765 */     double d7 = (this.field_70146_Z.nextInt(2) * 2 - 1) * 0.7D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  771 */     double obstruction_factor = 0.0D;
/*      */     
/*  773 */     double relative_g = 0.0D;
/*      */     
/*  775 */     double max_speed = 1.15D;
/*  776 */     double gh = 1.0D;
/*      */ 
/*      */ 
/*      */     
/*  780 */     double rt = 0.0D;
/*      */     
/*  782 */     double pi = 3.1415926545D;
/*  783 */     double deltav = 0.0D;
/*      */ 
/*      */ 
/*      */     
/*  787 */     int dist = 2;
/*      */ 
/*      */ 
/*      */     
/*  791 */     if (getActivity() == 0) {
/*      */       
/*  793 */       super.func_70636_d();
/*      */     
/*      */     }
/*  796 */     else if (this.field_70128_L) {
/*  797 */       super.func_70636_d();
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  802 */     if (this.field_70128_L) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  813 */     if (this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */       
/*  817 */       if (this.boatPosRotationIncrements > 0 && getActivity() != 0)
/*      */       {
/*  819 */         double d4 = this.field_70165_t + (this.boatX - this.field_70165_t) / this.boatPosRotationIncrements;
/*  820 */         double d5 = this.field_70163_u + (this.boatY - this.field_70163_u) / this.boatPosRotationIncrements;
/*  821 */         double d11 = this.field_70161_v + (this.boatZ - this.field_70161_v) / this.boatPosRotationIncrements;
/*  822 */         func_70107_b(d4, d5, d11);
/*      */         
/*  824 */         this.field_70125_A = (float)(this.field_70125_A + (this.boatPitch - this.field_70125_A) / this.boatPosRotationIncrements);
/*  825 */         double d10 = MathHelper.func_76138_g(this.boatYaw - this.field_70177_z);
/*  826 */         if (this.field_70153_n != null) d10 = MathHelper.func_76138_g(this.field_70153_n.field_70177_z - this.field_70177_z); 
/*  827 */         this.field_70177_z = (float)(this.field_70177_z + d10 / this.boatPosRotationIncrements);
/*  828 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/*      */ 
/*      */         
/*  831 */         this.boatPosRotationIncrements--;
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  836 */     else if (getActivity() != 0) {
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
/*  854 */       if (this.field_70153_n != null) {
/*  855 */         EntityPlayer pp = (EntityPlayer)this.field_70153_n;
/*      */ 
/*      */ 
/*      */         
/*  859 */         if (this.field_70159_w < -2.0D) this.field_70159_w = -2.0D; 
/*  860 */         if (this.field_70159_w > 2.0D) this.field_70159_w = 2.0D; 
/*  861 */         if (this.field_70179_y < -2.0D) this.field_70179_y = -2.0D; 
/*  862 */         if (this.field_70179_y > 2.0D) this.field_70179_y = 2.0D; 
/*  863 */         double velocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */         
/*  865 */         gh = 1.55D;
/*  866 */         Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)((float)this.field_70163_u - (float)gh), (int)this.field_70161_v);
/*  867 */         if (bid != Blocks.field_150350_a) {
/*  868 */           this.field_70181_x += 0.07D;
/*  869 */           this.field_70163_u += 0.1D;
/*      */         } else {
/*  871 */           this.field_70181_x -= 0.018D;
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  878 */         obstruction_factor = 0.0D;
/*  879 */         dist = 2;
/*  880 */         dist += (int)(velocity * 6.0D);
/*  881 */         for (int k = 1; k < dist; k++) {
/*  882 */           for (int i = 1; i < dist * 2; i++) {
/*  883 */             double dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/*  884 */             double dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/*  885 */             bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u - k, (int)(this.field_70161_v + dz));
/*  886 */             if (bid != Blocks.field_150350_a) {
/*  887 */               obstruction_factor += 0.04D;
/*      */             }
/*      */           } 
/*      */         } 
/*  891 */         this.field_70181_x += obstruction_factor * 0.09D;
/*  892 */         this.field_70163_u += obstruction_factor * 0.09D;
/*  893 */         if (this.field_70181_x > 2.0D) this.field_70181_x = 2.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  902 */         double d4 = this.field_70153_n.field_70177_z;
/*  903 */         d4 %= 360.0D;
/*  904 */         for (; d4 < 0.0D; d4 += 360.0D);
/*  905 */         double d5 = this.field_70177_z;
/*  906 */         d5 %= 360.0D;
/*  907 */         for (; d5 < 0.0D; d5 += 360.0D);
/*  908 */         relative_g = (d4 - d5) % 180.0D;
/*  909 */         for (; relative_g < 0.0D; relative_g += 180.0D);
/*  910 */         if (relative_g > 90.0D) relative_g -= 180.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  916 */         if (velocity > 0.1D) {
/*  917 */           d4 = 1.5D - velocity;
/*  918 */           d4 = Math.abs(d4);
/*  919 */           if (d4 < 0.01D) d4 = 0.01D; 
/*  920 */           if (d4 > 0.9D) d4 = 0.9D; 
/*  921 */           this.field_70177_z = this.field_70153_n.field_70177_z + (float)(relative_g * d4);
/*      */         } else {
/*      */           
/*  924 */           this.field_70177_z = this.field_70153_n.field_70177_z;
/*      */         } 
/*  926 */         relative_g = Math.abs(relative_g) * velocity;
/*  927 */         if (relative_g > 50.0D) relative_g = 0.0D;
/*      */ 
/*      */ 
/*      */         
/*  931 */         if (this.field_70181_x > 0.0D) {
/*  932 */           this.field_70125_A = 360.0F - 2.0F * (float)velocity;
/*      */         } else {
/*  934 */           this.field_70125_A = 2.0F * (float)velocity;
/*      */         } 
/*  936 */         func_70101_b(this.field_70177_z, this.field_70125_A);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  943 */         double newvelocity = Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  952 */         double rr = Math.atan2(this.field_70153_n.field_70179_y, this.field_70153_n.field_70159_w);
/*  953 */         double rhm = Math.atan2(this.field_70179_y, this.field_70159_w);
/*  954 */         double rhdir = Math.toRadians(((this.field_70153_n.field_70177_z + 90.0F) % 360.0F));
/*  955 */         rt = 0.0D;
/*  956 */         pi = 3.1415926545D;
/*  957 */         deltav = 0.0D;
/*  958 */         double im = pp.field_70701_bs;
/*      */ 
/*      */         
/*  961 */         if (OreSpawnMain.flyup_keystate != 0) {
/*  962 */           this.field_70181_x += 0.04D;
/*  963 */           this.field_70181_x += velocity * 0.05D;
/*      */         } 
/*      */ 
/*      */         
/*  967 */         double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
/*  968 */         if (rdv > pi) rdv -= pi * 2.0D; 
/*  969 */         rdv = Math.abs(rdv);
/*  970 */         if (Math.abs(newvelocity) < 0.01D) rdv = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  978 */         if (rdv > 1.5D) newvelocity = -newvelocity;
/*      */         
/*  980 */         if (Math.abs(im) > 0.0010000000474974513D) {
/*  981 */           if (im > 0.0D) {
/*  982 */             deltav = 0.03D;
/*  983 */             if (max_speed > 0.85D) deltav += 0.05D;
/*      */           
/*      */           } else {
/*  986 */             max_speed = 0.35D;
/*      */             
/*  988 */             deltav = -0.03D;
/*      */           } 
/*      */           
/*  991 */           newvelocity += deltav;
/*  992 */           if (newvelocity >= 0.0D) {
/*  993 */             if (newvelocity > max_speed) newvelocity = max_speed; 
/*  994 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*  995 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */           } else {
/*  997 */             if (newvelocity < -max_speed) newvelocity = -max_speed; 
/*  998 */             newvelocity = -newvelocity;
/*  999 */             this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/* 1000 */             this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity;
/*      */           }
/*      */         
/*      */         }
/* 1004 */         else if (newvelocity >= 0.0D) {
/* 1005 */           this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/* 1006 */           this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 90.0F))) * newvelocity;
/*      */         } else {
/* 1008 */           this.field_70159_w = Math.cos(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/* 1009 */           this.field_70179_y = Math.sin(Math.toRadians((this.field_70177_z + 270.0F))) * newvelocity * -1.0D;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1015 */       func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
/*      */       
/* 1017 */       this.field_70159_w *= 0.985D;
/* 1018 */       this.field_70181_x *= 0.94D;
/* 1019 */       this.field_70179_y *= 0.985D;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1024 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/* 1026 */         list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b(2.25D, 2.0D, 2.25D));
/*      */         
/* 1028 */         if (list != null && !list.isEmpty())
/*      */         {
/* 1030 */           for (int l = 0; l < list.size(); l++) {
/*      */             
/* 1032 */             listEntity = list.get(l);
/*      */             
/* 1034 */             if (listEntity != this.field_70153_n && !listEntity.field_70128_L && listEntity.func_70104_M())
/*      */             {
/* 1036 */               listEntity.func_70108_f((Entity)this);
/*      */             }
/*      */           } 
/*      */         }
/*      */       } 
/* 1041 */       if (this.field_70153_n != null && this.field_70153_n.field_70128_L)
/*      */       {
/* 1043 */         this.field_70153_n = null;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1049 */     if (getActivity() == 1) {
/* 1050 */       func_70619_bc();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70043_V() {
/* 1058 */     if (this.field_70153_n != null) {
/*      */ 
/*      */       
/* 1061 */       float f = 0.75F;
/* 1062 */       this.field_70153_n.func_70107_b(this.field_70165_t - f * Math.sin(Math.toRadians(this.field_70177_z)), this.field_70163_u + func_70042_X() + this.field_70153_n.func_70033_W(), this.field_70161_v + f * Math.cos(Math.toRadians(this.field_70177_z)));
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
/*      */   protected void playTameEffect(boolean par1) {
/* 1074 */     String s = "heart";
/*      */     
/* 1076 */     if (!par1)
/*      */     {
/* 1078 */       s = "smoke";
/*      */     }
/*      */     
/* 1081 */     for (int i = 0; i < 20; i++) {
/*      */       
/* 1083 */       double d0 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1084 */       double d1 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1085 */       double d2 = this.field_70146_Z.nextGaussian() * 0.08D;
/* 1086 */       this.field_70170_p.func_72869_a(s, this.field_70165_t + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), this.field_70163_u + 0.5D + this.field_70146_Z.nextFloat() * 1.5D, this.field_70161_v + ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 2.5F), d0, d1, d2);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 1097 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */     
/* 1099 */     if (var2 != null && 
/* 1100 */       var2.field_77994_a <= 0) {
/* 1101 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 1102 */       var2 = null;
/*      */     } 
/*      */     
/* 1105 */     if (var2 != null && (var2.func_77973_b() == Items.field_151082_bd || var2.func_77973_b() == Items.field_151076_bf || var2.func_77973_b() == Items.field_151147_al) && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D) {
/*      */ 
/*      */       
/* 1108 */       if (!this.field_70170_p.field_72995_K)
/*      */       {
/* 1110 */         func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */       }
/* 1112 */       this.wasfed = 1;
/* 1113 */       this.shouldattack = 0;
/* 1114 */       playTameEffect(true);
/* 1115 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/* 1117 */         var2.field_77994_a--;
/* 1118 */         if (var2.field_77994_a <= 0) {
/*      */           
/* 1120 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 1121 */           var2 = null;
/*      */         } 
/*      */       } 
/*      */     } else {
/* 1125 */       if (this.field_70153_n != null && this.field_70153_n instanceof EntityPlayer && this.field_70153_n != par1EntityPlayer)
/*      */       {
/* 1127 */         return true;
/*      */       }
/*      */ 
/*      */       
/* 1131 */       if (var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 25.0D)
/*      */       {
/* 1133 */         if (!this.field_70170_p.field_72995_K) {
/*      */           
/* 1135 */           if (this.wasfed == 0) {
/*      */ 
/*      */             
/* 1138 */             func_70661_as().func_75497_a((Entity)par1EntityPlayer, 1.2D);
/* 1139 */             this.shouldattack = 1;
/* 1140 */             return false;
/*      */           } 
/* 1142 */           par1EntityPlayer.func_70078_a((Entity)this);
/* 1143 */           this.wasfed = 0;
/*      */         } 
/*      */       }
/*      */       
/* 1147 */       return true;
/*      */     } 
/* 1149 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAttacking() {
/* 1155 */     return this.field_70180_af.func_75683_a(20);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAttacking(int par1) {
/* 1160 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1161 */       return;  this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public int getActivity() {
/* 1166 */     return this.field_70180_af.func_75683_a(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/* 1171 */     if (this.field_70170_p != null && this.field_70170_p.field_72995_K)
/* 1172 */       return;  this.field_70180_af.func_75692_b(21, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/* 1180 */     if (func_104002_bU()) return false; 
/* 1181 */     if (this.field_70153_n != null) {
/* 1182 */       return false;
/*      */     }
/* 1184 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 1193 */     super.func_70014_b(par1NBTTagCompound);
/* 1194 */     par1NBTTagCompound.func_74768_a("CephaWasFed", this.wasfed);
/* 1195 */     par1NBTTagCompound.func_74768_a("CephaAttacking", getAttacking());
/* 1196 */     par1NBTTagCompound.func_74768_a("CephaActivity", getActivity());
/* 1197 */     par1NBTTagCompound.func_74768_a("CephaHitByPlayer", this.hit_by_player);
/* 1198 */     par1NBTTagCompound.func_74768_a("CephaBadMood", this.badmood);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 1207 */     super.func_70037_a(par1NBTTagCompound);
/* 1208 */     this.wasfed = par1NBTTagCompound.func_74762_e("CephaWasFed");
/* 1209 */     this.hit_by_player = par1NBTTagCompound.func_74762_e("CephaHitByPlayer");
/* 1210 */     this.badmood = par1NBTTagCompound.func_74762_e("CephaBadMood");
/* 1211 */     setAttacking(par1NBTTagCompound.func_74762_e("CephaAttacking"));
/* 1212 */     setActivity(par1NBTTagCompound.func_74762_e("CephaActivity"));
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Cephadrome.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */