/*      */ package danger.orespawn;
/*      */ 
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.enchantment.Enchantment;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityList;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAIHurtByTarget;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.effect.EntityLightningBolt;
/*      */ import net.minecraft.entity.item.EntityItem;
/*      */ import net.minecraft.entity.monster.EntityMob;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.util.ChunkCoordinates;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.util.MathHelper;
/*      */ import net.minecraft.util.Vec3;
/*      */ import net.minecraft.world.World;
/*      */ import net.minecraft.world.storage.WorldInfo;
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
/*      */ public class Kraken
/*      */   extends EntityMob
/*      */ {
/*   64 */   private GenericTargetSorter TargetSorter = null;
/*   65 */   private RenderInfo renderdata = new RenderInfo();
/*   66 */   private ChunkCoordinates currentFlightTarget = null;
/*   67 */   private EntityLivingBase caught = null;
/*   68 */   private int newtarget = 0;
/*   69 */   private int release = 0;
/*   70 */   private int weather_set = 10;
/*   71 */   private int long_enough = 3600;
/*   72 */   private int call_reinforcements = 0;
/*      */   private boolean hit_by_player = false;
/*   74 */   private int straight_down = 1;
/*   75 */   private int hurt_timer = 0;
/*      */ 
/*      */   
/*      */   public Kraken(World par1World) {
/*   79 */     super(par1World);
/*   80 */     if (OreSpawnMain.PlayNicely == 0) {
/*   81 */       func_70105_a(4.0F, 15.0F);
/*      */     } else {
/*   83 */       func_70105_a(1.3333334F, 5.0F);
/*      */     } 
/*   85 */     func_70661_as().func_75491_a(false);
/*   86 */     this.field_70728_aV = 500;
/*   87 */     this.field_70174_ab = 120;
/*   88 */     this.field_70178_ae = true;
/*   89 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*   90 */     this.renderdata = new RenderInfo();
/*   91 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*   92 */     this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*   97 */     super.func_110147_ax();
/*   98 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*   99 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3700000047683716D);
/*  100 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.Kraken_stats.attack);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  105 */     super.func_70088_a();
/*  106 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*  107 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*  108 */     if (this.renderdata == null) {
/*  109 */       this.renderdata = new RenderInfo();
/*      */     }
/*  111 */     this.renderdata.rf1 = 0.0F;
/*  112 */     this.renderdata.rf2 = 0.0F;
/*  113 */     this.renderdata.rf3 = 0.0F;
/*  114 */     this.renderdata.rf4 = 0.0F;
/*  115 */     this.renderdata.ri1 = 0;
/*  116 */     this.renderdata.ri2 = 0;
/*  117 */     this.renderdata.ri3 = 0;
/*  118 */     this.renderdata.ri4 = 0;
/*      */   }
/*      */   
/*      */   public int getPlayNicely() {
/*  122 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  127 */     return OreSpawnMain.Kraken_stats.health;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getKrakenHealth() {
/*  134 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RenderInfo getRenderInfo() {
/*  141 */     return this.renderdata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenderInfo(RenderInfo r) {
/*  146 */     this.renderdata.rf1 = r.rf1;
/*  147 */     this.renderdata.rf2 = r.rf2;
/*  148 */     this.renderdata.rf3 = r.rf3;
/*  149 */     this.renderdata.rf4 = r.rf4;
/*  150 */     this.renderdata.ri1 = r.ri1;
/*  151 */     this.renderdata.ri2 = r.ri2;
/*  152 */     this.renderdata.ri3 = r.ri3;
/*  153 */     this.renderdata.ri4 = r.ri4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  161 */     return OreSpawnMain.Kraken_stats.defense;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70650_aV() {
/*  169 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  178 */     super.func_70636_d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/*  186 */     Entity var8 = null;
/*  187 */     var8 = EntityList.func_75620_a(par1, par0World);
/*  188 */     if (var8 != null) {
/*      */ 
/*      */       
/*  191 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/*  194 */       par0World.func_72838_d(var8);
/*      */       
/*  196 */       ((EntityLiving)var8).func_70642_aH();
/*      */     } 
/*  198 */     return var8;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  207 */     super.func_70071_h_();
/*      */     
/*  209 */     if (this.field_70128_L) {
/*      */       return;
/*      */     }
/*      */     
/*  213 */     if (this.currentFlightTarget == null) {
/*  214 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)(this.field_70163_u - 10.0D), (int)this.field_70161_v);
/*      */     }
/*  216 */     else if (this.field_70163_u < this.currentFlightTarget.field_71572_b) {
/*  217 */       this.field_70181_x *= 0.72D;
/*      */     } else {
/*  219 */       this.field_70181_x *= 0.5D;
/*      */     } 
/*      */ 
/*      */     
/*  223 */     if (this.weather_set > 0 && OreSpawnMain.PlayNicely == 0) {
/*  224 */       this.weather_set--;
/*  225 */       if (this.weather_set == 0 && !this.field_70170_p.field_72995_K) {
/*      */         
/*  227 */         WorldInfo worldinfo = this.field_70170_p.func_72912_H();
/*  228 */         if (!this.field_70170_p.func_72896_J()) {
/*  229 */           worldinfo.func_76080_g(300);
/*  230 */           worldinfo.func_76090_f(300);
/*  231 */           worldinfo.func_76084_b(true);
/*  232 */           worldinfo.func_76069_a(true);
/*      */         } else {
/*  234 */           worldinfo.func_76080_g(300);
/*  235 */           worldinfo.func_76090_f(300);
/*      */         } 
/*  237 */         this.weather_set = 100;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/*  246 */     super.func_70014_b(par1NBTTagCompound);
/*  247 */     par1NBTTagCompound.func_74768_a("LongEnough", this.long_enough);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/*  256 */     super.func_70037_a(par1NBTTagCompound);
/*  257 */     this.long_enough = par1NBTTagCompound.func_74762_e("LongEnough");
/*      */   }
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  262 */     if (this.field_70146_Z.nextInt(5) == 0) {
/*  263 */       return "orespawn:kraken_living";
/*      */     }
/*  265 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  273 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  281 */     return "orespawn:alo_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  288 */     return 2.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70647_i() {
/*  295 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  303 */     return Items.field_151128_bU;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private ItemStack dropItemRand(Item index, int par1) {
/*  309 */     EntityItem var3 = null;
/*  310 */     ItemStack is = new ItemStack(index, par1, 0);
/*      */     
/*  312 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), is);
/*      */     
/*  314 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/*  315 */     return is;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  323 */     ItemStack is = null;
/*      */ 
/*      */     
/*  326 */     dropItemRand(OreSpawnMain.MyKrakenTooth, 1);
/*  327 */     dropItemRand(Items.field_151160_bD, 1);
/*      */     
/*  329 */     int var5 = 120 + this.field_70170_p.field_73012_v.nextInt(160); int var4;
/*  330 */     for (var4 = 0; var4 < var5; var4++) {
/*  331 */       dropItemRand(Items.field_151100_aR, 1);
/*      */     }
/*      */     
/*  334 */     int i = 5 + this.field_70170_p.field_73012_v.nextInt(10);
/*  335 */     for (var4 = 0; var4 < i; var4++) {
/*  336 */       EntityItem var33; int var3 = this.field_70170_p.field_73012_v.nextInt(53);
/*  337 */       switch (var3) {
/*      */         case 0:
/*  339 */           is = dropItemRand(OreSpawnMain.MyUltimateSword, 1);
/*      */           break;
/*      */         case 1:
/*  342 */           is = dropItemRand(Items.field_151045_i, 1);
/*      */           break;
/*      */         case 2:
/*  345 */           is = dropItemRand(Item.func_150898_a(Blocks.field_150484_ah), 1);
/*      */           break;
/*      */         case 3:
/*  348 */           is = dropItemRand(Items.field_151048_u, 1);
/*  349 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  350 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  351 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  352 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  353 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  354 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  355 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 4:
/*  358 */           is = dropItemRand(Items.field_151047_v, 1);
/*  359 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  360 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 5:
/*  363 */           is = dropItemRand(Items.field_151046_w, 1);
/*  364 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  365 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  366 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 6:
/*  369 */           is = dropItemRand(Items.field_151056_x, 1);
/*  370 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  371 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 7:
/*  374 */           is = dropItemRand(Items.field_151012_L, 1);
/*  375 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  376 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 8:
/*  379 */           is = dropItemRand((Item)Items.field_151161_ac, 1);
/*  380 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  381 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  382 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  383 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  384 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  385 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(2)); 
/*  386 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 9:
/*  389 */           is = dropItemRand((Item)Items.field_151163_ad, 1);
/*  390 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  391 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  392 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  393 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  394 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 10:
/*  397 */           is = dropItemRand((Item)Items.field_151173_ae, 1);
/*  398 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  399 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  400 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  401 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  402 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 11:
/*  405 */           is = dropItemRand((Item)Items.field_151175_af, 1);
/*  406 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  407 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 12:
/*  410 */           is = dropItemRand(OreSpawnMain.MyUltimateBow, 1);
/*      */           break;
/*      */         case 13:
/*  413 */           is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1);
/*      */           break;
/*      */         case 14:
/*  416 */           is = dropItemRand(Items.field_151042_j, 1);
/*      */           break;
/*      */         case 15:
/*  419 */           is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1);
/*      */           break;
/*      */         case 16:
/*  422 */           is = dropItemRand(Items.field_151040_l, 1);
/*  423 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  424 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  425 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  426 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  427 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  428 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  429 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 17:
/*  432 */           is = dropItemRand(Items.field_151037_a, 1);
/*  433 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  434 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 18:
/*  437 */           is = dropItemRand(Items.field_151035_b, 1);
/*  438 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  439 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  440 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 19:
/*  443 */           is = dropItemRand(Items.field_151036_c, 1);
/*  444 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  445 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 20:
/*  448 */           is = dropItemRand(Items.field_151019_K, 1);
/*  449 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  450 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 21:
/*  453 */           is = dropItemRand((Item)Items.field_151028_Y, 1);
/*  454 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  455 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  456 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  457 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  458 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  459 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  460 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 22:
/*  463 */           is = dropItemRand((Item)Items.field_151030_Z, 1);
/*  464 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  465 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  466 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  467 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  468 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 23:
/*  471 */           is = dropItemRand((Item)Items.field_151165_aa, 1);
/*  472 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  473 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  474 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  475 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  476 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 24:
/*  479 */           is = dropItemRand((Item)Items.field_151167_ab, 1);
/*  480 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  481 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 25:
/*  484 */           is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1);
/*      */           break;
/*      */         case 26:
/*  487 */           dropItemRand(Item.func_150898_a(Blocks.field_150339_S), 1);
/*      */           break;
/*      */         case 27:
/*  490 */           is = dropItemRand(Items.field_151074_bl, 1);
/*      */           break;
/*      */         case 28:
/*  493 */           is = dropItemRand(Items.field_151043_k, 1);
/*      */           break;
/*      */         case 29:
/*  496 */           is = dropItemRand(Items.field_151150_bK, 1);
/*      */           break;
/*      */         case 30:
/*  499 */           is = dropItemRand(Items.field_151010_B, 1);
/*  500 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  501 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  502 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  503 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  504 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  505 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  506 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 31:
/*  509 */           is = dropItemRand(Items.field_151011_C, 1);
/*  510 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  511 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 32:
/*  514 */           is = dropItemRand(Items.field_151005_D, 1);
/*  515 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  516 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  517 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 33:
/*  520 */           is = dropItemRand(Items.field_151006_E, 1);
/*  521 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  522 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 34:
/*  525 */           is = dropItemRand(Items.field_151013_M, 1);
/*  526 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  527 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 35:
/*  530 */           is = dropItemRand((Item)Items.field_151169_ag, 1);
/*  531 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  532 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  533 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  534 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  535 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  536 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  537 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 36:
/*  540 */           is = dropItemRand((Item)Items.field_151171_ah, 1);
/*  541 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  542 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  543 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  544 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  545 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 37:
/*  548 */           is = dropItemRand((Item)Items.field_151149_ai, 1);
/*  549 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  550 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  551 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  552 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  553 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 38:
/*  556 */           is = dropItemRand((Item)Items.field_151151_aj, 1);
/*  557 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  558 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 39:
/*  561 */           dropItemRand(Items.field_151153_ao, 1);
/*      */           break;
/*      */         case 40:
/*  564 */           dropItemRand(Item.func_150898_a(Blocks.field_150340_R), 1);
/*      */           break;
/*      */         
/*      */         case 41:
/*  568 */           var33 = null;
/*  569 */           is = new ItemStack(Items.field_151153_ao, 1, 1);
/*  570 */           var33 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
/*      */           
/*  572 */           if (var33 != null) this.field_70170_p.func_72838_d((Entity)var33);
/*      */           
/*      */           break;
/*      */         case 42:
/*  576 */           is = dropItemRand(OreSpawnMain.MyExperienceSword, 1);
/*  577 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  578 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  579 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  580 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  581 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  582 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  583 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 43:
/*  586 */           is = dropItemRand((Item)OreSpawnMain.ExperienceHelmet, 1);
/*  587 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  588 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  589 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  590 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  591 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  592 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77340_h, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  593 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77341_i, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 44:
/*  596 */           is = dropItemRand((Item)OreSpawnMain.ExperienceBody, 1);
/*  597 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  598 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  599 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  600 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  601 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 45:
/*  604 */           is = dropItemRand((Item)OreSpawnMain.ExperienceLegs, 1);
/*  605 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77332_c, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  606 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77327_f, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  607 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77329_d, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  608 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77328_g, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  609 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 46:
/*  612 */           is = dropItemRand((Item)OreSpawnMain.ExperienceBoots, 1);
/*  613 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77330_e, 5 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  614 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*      */           break;
/*      */         case 47:
/*  617 */           is = dropItemRand(OreSpawnMain.MyAmethystSword, 1);
/*  618 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  619 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77336_l, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  620 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77337_m, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  621 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77335_o, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  622 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  623 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77334_n, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  624 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77338_j, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 48:
/*  627 */           is = dropItemRand(OreSpawnMain.MyAmethystShovel, 1);
/*  628 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  629 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 49:
/*  632 */           is = dropItemRand(OreSpawnMain.MyAmethystPickaxe, 1);
/*  633 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  634 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*  635 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77346_s, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 50:
/*  638 */           is = dropItemRand(OreSpawnMain.MyAmethystAxe, 1);
/*  639 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  640 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 51:
/*  643 */           is = dropItemRand(OreSpawnMain.MyAmethystHoe, 1);
/*  644 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) is.func_77966_a(Enchantment.field_77347_r, 2 + this.field_70170_p.field_73012_v.nextInt(4)); 
/*  645 */           if (this.field_70170_p.field_73012_v.nextInt(6) == 1) is.func_77966_a(Enchantment.field_77349_p, 1 + this.field_70170_p.field_73012_v.nextInt(5)); 
/*      */           break;
/*      */         case 52:
/*  648 */           is = dropItemRand(Item.func_150898_a(OreSpawnMain.MyBlockAmethystBlock), 1);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  664 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  672 */     if (func_104002_bU()) return false; 
/*  673 */     if (this.long_enough <= 0) return true; 
/*  674 */     if (this.field_70163_u > 150.0D && func_110143_aJ() < (mygetMaxHealth() / 2)) return true; 
/*  675 */     if (this.field_70163_u > 180.0D && this.long_enough <= 0) {
/*  676 */       func_70106_y();
/*  677 */       return true;
/*      */     } 
/*  679 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  687 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70619_bc() {
/*  693 */     int xdir = 1;
/*  694 */     int zdir = 1;
/*      */     
/*  696 */     int keep_trying = 50;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  701 */     if (this.field_70128_L)
/*      */       return; 
/*  703 */     super.func_70619_bc();
/*      */     
/*  705 */     if (this.hurt_timer > 0) this.hurt_timer--; 
/*  706 */     if (this.long_enough > 0) this.long_enough--;
/*      */     
/*  708 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(OreSpawnMain.PlayNicely));
/*      */     
/*  710 */     if (this.field_70170_p.field_73012_v.nextInt(400) == 1 && OreSpawnMain.PlayNicely == 0)
/*      */     {
/*  712 */       this.field_70170_p.func_72942_c((Entity)new EntityLightningBolt(this.field_70170_p, this.field_70165_t, this.field_70163_u - 16.0D, this.field_70161_v));
/*      */     }
/*      */ 
/*      */     
/*  716 */     if (this.currentFlightTarget == null) {
/*  717 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     }
/*      */ 
/*      */     
/*  721 */     if (this.newtarget != 0 || this.field_70146_Z.nextInt(250) == 1 || this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 9.1F) {
/*      */       
/*  723 */       this.newtarget = 0;
/*      */       int ground_dist;
/*  725 */       for (ground_dist = 0; ground_dist < 31; ground_dist++) {
/*  726 */         Block block = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - ground_dist, (int)this.field_70161_v);
/*  727 */         if (block != Blocks.field_150350_a) {
/*  728 */           this.straight_down = 0;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*  733 */       ground_dist = 20 - ground_dist;
/*      */       
/*  735 */       Block bid = Blocks.field_150348_b;
/*  736 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/*  737 */         zdir = this.field_70170_p.field_73012_v.nextInt(6) + 12;
/*  738 */         xdir = this.field_70170_p.field_73012_v.nextInt(6) + 12;
/*  739 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  740 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir; 
/*  741 */         if (this.straight_down != 0) {
/*  742 */           zdir = xdir = 0;
/*      */         }
/*  744 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t + xdir, (int)this.field_70163_u + ground_dist + this.field_70146_Z.nextInt(9) - 6, (int)this.field_70161_v + zdir);
/*  745 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/*  746 */         if (bid == Blocks.field_150350_a && 
/*  747 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/*  748 */           bid = Blocks.field_150348_b;
/*      */         }
/*      */         
/*  751 */         keep_trying--;
/*      */       } 
/*      */       
/*  754 */       if (this.long_enough <= 0 || (this.field_70163_u < 200.0D && func_110143_aJ() < (mygetMaxHealth() / 4))) {
/*  755 */         this.currentFlightTarget.func_71571_b(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b + 30, this.currentFlightTarget.field_71573_c);
/*  756 */         if (this.hit_by_player == true && this.call_reinforcements == 0 && func_110143_aJ() < (mygetMaxHealth() / 8) && this.field_70163_u > 130.0D)
/*      */         {
/*  758 */           this.call_reinforcements = 1;
/*      */           
/*  760 */           for (int i = 0; i < 10; i++) {
/*  761 */             EntityCreature newent = (EntityCreature)spawnCreature(this.field_70170_p, "The Kraken", this.field_70165_t + this.field_70170_p.field_73012_v.nextInt(10) - this.field_70170_p.field_73012_v.nextInt(10), 170.0D, this.field_70161_v + this.field_70170_p.field_73012_v.nextInt(10) - this.field_70170_p.field_73012_v.nextInt(10));
/*      */           
/*      */           }
/*      */         }
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  769 */     else if (this.caught == null && this.field_70170_p.field_73012_v.nextInt(8) == 1 && OreSpawnMain.PlayNicely == 0) {
/*      */       
/*  771 */       EntityPlayer target = null;
/*      */       
/*  773 */       target = (EntityPlayer)this.field_70170_p.func_72857_a(EntityPlayer.class, this.field_70121_D.func_72314_b(25.0D, 40.0D, 25.0D), (Entity)this);
/*  774 */       if (target != null)
/*      */       {
/*  776 */         if (!target.field_71075_bZ.field_75098_d) {
/*      */           
/*  778 */           if (func_70635_at().func_75522_a((Entity)target)) {
/*  779 */             this.currentFlightTarget.func_71571_b((int)target.field_70165_t, (int)target.field_70163_u + 15, (int)target.field_70161_v);
/*  780 */             attackWithSomething((EntityLivingBase)target);
/*      */           } 
/*      */         } else {
/*  783 */           target = null;
/*      */         } 
/*      */       }
/*      */       
/*  787 */       if (target == null && this.field_70170_p.field_73012_v.nextInt(2) == 0) {
/*  788 */         EntityLivingBase e = null;
/*  789 */         e = findSomethingToAttack();
/*  790 */         if (e != null) {
/*      */ 
/*      */           
/*  793 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 15, (int)e.field_70161_v);
/*  794 */           attackWithSomething(e);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  800 */     if (this.caught != null) {
/*  801 */       if (!this.caught.field_70128_L) {
/*  802 */         this.currentFlightTarget.func_71571_b((int)this.field_70165_t, 200, (int)this.field_70161_v);
/*  803 */         if (this.field_70163_u > 190.0D) this.release = 1; 
/*  804 */         this.caught.field_70159_w = this.field_70159_w;
/*  805 */         this.caught.field_70179_y = this.field_70179_y;
/*  806 */         this.caught.field_70181_x = this.field_70181_x;
/*  807 */         this.caught.field_70165_t = this.field_70165_t;
/*  808 */         if (this.field_70163_u - this.caught.field_70163_u > 16.0D) {
/*  809 */           this.caught.field_70181_x += 0.25D;
/*      */         }
/*  811 */         this.caught.field_70163_u = this.field_70163_u - 15.0D;
/*  812 */         this.caught.field_70161_v = this.field_70161_v;
/*      */         
/*  814 */         this.caught.field_70177_z = this.field_70177_z;
/*  815 */         if (this.field_70170_p.field_73012_v.nextInt(50) == 1) {
/*  816 */           func_70652_k((Entity)this.caught);
/*      */         }
/*  818 */         if (this.release != 0 || this.field_70170_p.field_73012_v.nextInt(250) == 1) {
/*  819 */           this.caught = null;
/*      */           
/*  821 */           this.newtarget = 1;
/*  822 */           this.release = 0;
/*  823 */           setAttacking(0);
/*      */         } 
/*      */       } else {
/*  826 */         this.caught = null;
/*      */         
/*  828 */         this.newtarget = 1;
/*  829 */         this.release = 0;
/*  830 */         setAttacking(0);
/*      */       } 
/*      */     }
/*      */     
/*  834 */     double var1 = this.currentFlightTarget.field_71574_a + 0.3D - this.field_70165_t;
/*  835 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/*  836 */     double var5 = this.currentFlightTarget.field_71573_c + 0.3D - this.field_70161_v;
/*  837 */     this.field_70159_w += (Math.signum(var1) * 0.45D - this.field_70159_w) * 0.15D;
/*  838 */     this.field_70181_x += (Math.signum(var3) * 0.70999D - this.field_70181_x) * 0.202D;
/*  839 */     this.field_70179_y += (Math.signum(var5) * 0.45D - this.field_70179_y) * 0.15D;
/*  840 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/*  841 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/*  842 */     this.field_70701_bs = 0.4F;
/*  843 */     if (Math.abs(this.field_70159_w) + Math.abs(this.field_70179_y) < 0.15D) var8 = 0.0F; 
/*  844 */     this.field_70177_z += var8 / 5.0F;
/*      */ 
/*      */     
/*  847 */     double obstruction_factor = 0.0D;
/*  848 */     double dx = 0.0D, dz = 0.0D;
/*  849 */     int dist = 10;
/*      */     
/*  851 */     for (int k = -20; k < 18; k += 2) {
/*  852 */       for (int i = 1; i < dist; i += 2) {
/*  853 */         dx = i * Math.cos(Math.toRadians((this.field_70177_z + 90.0F)));
/*  854 */         dz = i * Math.sin(Math.toRadians((this.field_70177_z + 90.0F)));
/*  855 */         Block bid = this.field_70170_p.func_147439_a((int)(this.field_70165_t + dx), (int)this.field_70163_u + k, (int)(this.field_70161_v + dz));
/*      */         
/*  857 */         if (bid != Blocks.field_150350_a) {
/*  858 */           obstruction_factor += 0.1D;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  865 */     this.field_70181_x += obstruction_factor * 0.08D;
/*  866 */     this.field_70163_u += obstruction_factor * 0.08D;
/*      */     
/*  868 */     if (this.field_70163_u > 256.0D && !func_104002_bU()) func_70106_y();
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void attackWithSomething(EntityLivingBase par1) {
/*  876 */     if (this.caught != null)
/*  877 */       return;  double dist = (this.field_70165_t - par1.field_70165_t) * (this.field_70165_t - par1.field_70165_t);
/*  878 */     dist += (this.field_70161_v - par1.field_70161_v) * (this.field_70161_v - par1.field_70161_v);
/*  879 */     dist += (this.field_70163_u - par1.field_70163_u - 15.0D) * (this.field_70163_u - par1.field_70163_u - 15.0D);
/*  880 */     if (dist < 30.0D) {
/*      */       
/*  882 */       this.caught = par1;
/*  883 */       this.release = 0;
/*  884 */       setAttacking(1);
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
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  896 */     if (par1EntityLiving == null)
/*      */     {
/*  898 */       return false;
/*      */     }
/*  900 */     if (par1EntityLiving == this)
/*      */     {
/*  902 */       return false;
/*      */     }
/*  904 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*  906 */       return false;
/*      */     }
/*      */     
/*  909 */     if (MyUtils.isIgnoreable(par1EntityLiving)) return false;
/*      */     
/*  911 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  914 */       return false;
/*      */     }
/*      */     
/*  917 */     if (par1EntityLiving instanceof EntityPlayer) {
/*      */       
/*  919 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/*  920 */       if (p.field_71075_bZ.field_75098_d == true) {
/*  921 */         return false;
/*      */       }
/*  923 */       if (p.field_71075_bZ.field_75100_b == true) {
/*  924 */         return false;
/*      */       }
/*  926 */       return true;
/*      */     } 
/*  928 */     if (!par1EntityLiving.field_70122_E && !par1EntityLiving.func_70090_H())
/*      */     {
/*  930 */       return false;
/*      */     }
/*      */     
/*  933 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntitySquid)
/*      */     {
/*  935 */       return false;
/*      */     }
/*  937 */     if (par1EntityLiving instanceof AttackSquid)
/*      */     {
/*  939 */       return false;
/*      */     }
/*  941 */     if (par1EntityLiving instanceof Kraken)
/*      */     {
/*  943 */       return false;
/*      */     }
/*  945 */     if (par1EntityLiving instanceof Spyro)
/*      */     {
/*  947 */       return false;
/*      */     }
/*  949 */     if (par1EntityLiving instanceof Dragon) {
/*      */       
/*  951 */       Dragon c = (Dragon)par1EntityLiving;
/*  952 */       if (c.field_70153_n != null) return false; 
/*  953 */       return true;
/*      */     } 
/*  955 */     if (par1EntityLiving instanceof Cephadrome) {
/*      */       
/*  957 */       Cephadrome c = (Cephadrome)par1EntityLiving;
/*  958 */       if (c.field_70153_n != null) return false; 
/*  959 */       return true;
/*      */     } 
/*  961 */     if (par1EntityLiving instanceof Leon) {
/*      */       
/*  963 */       Leon c = (Leon)par1EntityLiving;
/*  964 */       if (c.field_70153_n != null) return false; 
/*  965 */       return true;
/*      */     } 
/*  967 */     if (par1EntityLiving instanceof ThePrinceTeen) {
/*      */       
/*  969 */       ThePrinceTeen c = (ThePrinceTeen)par1EntityLiving;
/*  970 */       if (c.field_70153_n != null) return false; 
/*  971 */       return true;
/*      */     } 
/*  973 */     if (par1EntityLiving instanceof ThePrinceAdult) {
/*      */       
/*  975 */       ThePrinceAdult c = (ThePrinceAdult)par1EntityLiving;
/*  976 */       if (c.field_70153_n != null) return false; 
/*  977 */       return true;
/*      */     } 
/*      */     
/*  980 */     if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityChicken)
/*      */     {
/*  982 */       return false;
/*      */     }
/*  984 */     if (par1EntityLiving instanceof Chipmunk)
/*      */     {
/*  986 */       return false;
/*      */     }
/*  988 */     if (par1EntityLiving instanceof StinkBug)
/*      */     {
/*  990 */       return false;
/*      */     }
/*  992 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/*  994 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  998 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/* 1003 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 1004 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(20.0D, 40.0D, 20.0D));
/* 1005 */     Collections.sort(var5, this.TargetSorter);
/* 1006 */     Iterator<?> var2 = var5.iterator();
/* 1007 */     Entity var3 = null;
/* 1008 */     EntityLivingBase var4 = null;
/*      */     
/* 1010 */     while (var2.hasNext()) {
/*      */       
/* 1012 */       var3 = (Entity)var2.next();
/* 1013 */       var4 = (EntityLivingBase)var3;
/*      */       
/* 1015 */       if (isSuitableTarget(var4, false))
/*      */       {
/* 1017 */         return var4;
/*      */       }
/*      */     } 
/* 1020 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70077_a(EntityLightningBolt par1EntityLightningBolt) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 1031 */     Entity e = par1DamageSource.func_76346_g();
/* 1032 */     boolean ret = false;
/* 1033 */     if (this.currentFlightTarget != null && e != null && e instanceof EntityPlayer && func_110143_aJ() > (mygetMaxHealth() / 4)) {
/*      */       
/* 1035 */       this.hit_by_player = true;
/*      */       
/* 1037 */       this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)e.field_70163_u + 15, (int)e.field_70161_v);
/*      */     } 
/*      */     
/* 1040 */     if (this.hurt_timer > 0) return false; 
/* 1041 */     this.hurt_timer = 30;
/* 1042 */     ret = super.func_70097_a(par1DamageSource, par2);
/* 1043 */     if (this.field_70170_p.field_73012_v.nextInt(2) == 1) {
/* 1044 */       this.release = 1;
/*      */     }
/*      */     
/* 1047 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getAttacking() {
/* 1053 */     return this.field_70180_af.func_75683_a(20);
/*      */   }
/*      */   
/*      */   public final void setAttacking(int par1) {
/* 1057 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */ 
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
/*      */ 
/*      */   
/*      */   protected void func_70064_a(double par1, boolean par3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/* 1081 */     if (this.field_70163_u < 50.0D) return false;
/*      */ 
/*      */ 
/*      */     
/* 1085 */     for (int k = -1; k < 2; k++) {
/*      */       
/* 1087 */       for (int j = -1; j < 1; j++) {
/*      */         
/* 1089 */         for (int i = 1; i < 6; i++) {
/*      */           
/* 1091 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 1092 */           if (bid != Blocks.field_150350_a && bid != Blocks.field_150329_H) return false; 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1096 */     return true;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Kraken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */