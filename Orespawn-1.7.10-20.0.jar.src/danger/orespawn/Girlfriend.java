/*      */ package danger.orespawn;
/*      */ 
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.enchantment.Enchantment;
/*      */ import net.minecraft.enchantment.EnchantmentHelper;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityAgeable;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.IRangedAttackMob;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIArrowAttack;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*      */ import net.minecraft.entity.ai.EntityAIOpenDoor;
/*      */ import net.minecraft.entity.ai.EntityAIPanic;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.ai.EntityAITempt;
/*      */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*      */ import net.minecraft.entity.monster.EntityCreeper;
/*      */ import net.minecraft.entity.monster.IMob;
/*      */ import net.minecraft.entity.passive.EntityTameable;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.entity.projectile.EntityArrow;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemArmor;
/*      */ import net.minecraft.item.ItemFood;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.potion.Potion;
/*      */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*      */ import net.minecraft.util.ChatComponentText;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.util.IChatComponent;
/*      */ import net.minecraft.util.MathHelper;
/*      */ import net.minecraft.util.ResourceLocation;
/*      */ import net.minecraft.world.World;
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Girlfriend
/*      */   extends EntityTameable
/*      */   implements IRangedAttackMob
/*      */ {
/*   49 */   public int which_girl = 0;
/*   50 */   public int which_wet_girl = 0;
/*   51 */   public int wet_count = 0;
/*   52 */   private int auto_heal = 200;
/*   53 */   private int force_sync = 50;
/*   54 */   private int fight_sound_ticker = 0;
/*   55 */   private int taunt_sound_ticker = 0;
/*   56 */   private int had_target = 0;
/*   57 */   private int voice = 0;
/*   58 */   private int is_princess = 0;
/*   59 */   public MyEntityAIDance Dance = null;
/*   60 */   private float moveSpeed = 0.3F;
/*   61 */   private int voice_enable = 1;
/*   62 */   public int passenger = 0;
/*   63 */   private static final ResourceLocation DryTexture0 = new ResourceLocation("orespawn", "girlfriend0.png");
/*   64 */   private static final ResourceLocation DryTexture1 = new ResourceLocation("orespawn", "girlfriend1.png");
/*   65 */   private static final ResourceLocation DryTexture2 = new ResourceLocation("orespawn", "girlfriend2.png");
/*   66 */   private static final ResourceLocation DryTexture3 = new ResourceLocation("orespawn", "girlfriend3.png");
/*   67 */   private static final ResourceLocation DryTexture4 = new ResourceLocation("orespawn", "girlfriend4.png");
/*   68 */   private static final ResourceLocation DryTexture5 = new ResourceLocation("orespawn", "girlfriend5.png");
/*   69 */   private static final ResourceLocation DryTexture6 = new ResourceLocation("orespawn", "girlfriend6.png");
/*   70 */   private static final ResourceLocation DryTexture7 = new ResourceLocation("orespawn", "girlfriend7.png");
/*   71 */   private static final ResourceLocation DryTexture8 = new ResourceLocation("orespawn", "girlfriend8.png");
/*   72 */   private static final ResourceLocation DryTexture9 = new ResourceLocation("orespawn", "girlfriend9.png");
/*   73 */   private static final ResourceLocation DryTexture10 = new ResourceLocation("orespawn", "girlfriend10.png");
/*   74 */   private static final ResourceLocation DryTexture11 = new ResourceLocation("orespawn", "girlfriend11.png");
/*   75 */   private static final ResourceLocation DryTexture12 = new ResourceLocation("orespawn", "girlfriend12.png");
/*   76 */   private static final ResourceLocation DryTexture13 = new ResourceLocation("orespawn", "girlfriend13.png");
/*   77 */   private static final ResourceLocation DryTexture14 = new ResourceLocation("orespawn", "girlfriend14.png");
/*   78 */   private static final ResourceLocation DryTexture15 = new ResourceLocation("orespawn", "girlfriend15.png");
/*   79 */   private static final ResourceLocation DryTexture16 = new ResourceLocation("orespawn", "girlfriend16.png");
/*   80 */   private static final ResourceLocation DryTexture17 = new ResourceLocation("orespawn", "girlfriend17.png");
/*   81 */   private static final ResourceLocation DryTexture18 = new ResourceLocation("orespawn", "girlfriend18.png");
/*   82 */   private static final ResourceLocation DryTexture19 = new ResourceLocation("orespawn", "girlfriend19.png");
/*   83 */   private static final ResourceLocation DryTexture20 = new ResourceLocation("orespawn", "girlfriend20.png");
/*   84 */   private static final ResourceLocation DryTexture21 = new ResourceLocation("orespawn", "girlfriend21.png");
/*   85 */   private static final ResourceLocation DryTexture22 = new ResourceLocation("orespawn", "girlfriend22.png");
/*   86 */   private static final ResourceLocation DryTexture23 = new ResourceLocation("orespawn", "girlfriend23.png");
/*   87 */   private static final ResourceLocation DryTexture24 = new ResourceLocation("orespawn", "girlfriend24.png");
/*   88 */   private static final ResourceLocation DryTexture25 = new ResourceLocation("orespawn", "girlfriend25.png");
/*   89 */   private static final ResourceLocation DryTexture26 = new ResourceLocation("orespawn", "girlfriend26.png");
/*   90 */   private static final ResourceLocation DryTexture27 = new ResourceLocation("orespawn", "girlfriend27.png");
/*   91 */   private static final ResourceLocation DryTexture28 = new ResourceLocation("orespawn", "girlfriend28.png");
/*   92 */   private static final ResourceLocation DryTexture29 = new ResourceLocation("orespawn", "girlfriend29.png");
/*   93 */   private static final ResourceLocation DryTexture30 = new ResourceLocation("orespawn", "girlfriend30.png");
/*   94 */   private static final ResourceLocation DryTexture31 = new ResourceLocation("orespawn", "girlfriend31.png");
/*   95 */   private static final ResourceLocation DryTexture32 = new ResourceLocation("orespawn", "girlfriend32.png");
/*   96 */   private static final ResourceLocation DryTexture33 = new ResourceLocation("orespawn", "girlfriend33.png");
/*   97 */   private static final ResourceLocation DryTexture34 = new ResourceLocation("orespawn", "girlfriend34.png");
/*   98 */   private static final ResourceLocation DryTexture35 = new ResourceLocation("orespawn", "girlfriend35.png");
/*   99 */   private static final ResourceLocation DryTexture36 = new ResourceLocation("orespawn", "girlfriend36.png");
/*  100 */   private static final ResourceLocation DryTexture37 = new ResourceLocation("orespawn", "girlfriend37.png");
/*  101 */   private static final ResourceLocation DryTexture38 = new ResourceLocation("orespawn", "girlfriend38.png");
/*  102 */   private static final ResourceLocation DryTexture39 = new ResourceLocation("orespawn", "girlfriend39.png");
/*  103 */   private static final ResourceLocation DryTexture40 = new ResourceLocation("orespawn", "girlfriend40.png");
/*  104 */   private static final ResourceLocation ValentineTexture = new ResourceLocation("orespawn", "girlfriendv.png");
/*      */   
/*  106 */   private static final ResourceLocation WetTexture0 = new ResourceLocation("orespawn", "bikini0.png");
/*  107 */   private static final ResourceLocation WetTexture1 = new ResourceLocation("orespawn", "bikini1.png");
/*  108 */   private static final ResourceLocation WetTexture2 = new ResourceLocation("orespawn", "bikini2.png");
/*  109 */   private static final ResourceLocation WetTexture3 = new ResourceLocation("orespawn", "bikini3.png");
/*  110 */   private static final ResourceLocation WetTexture4 = new ResourceLocation("orespawn", "bikini4.png");
/*  111 */   private static final ResourceLocation WetTexture5 = new ResourceLocation("orespawn", "bikini5.png");
/*  112 */   private static final ResourceLocation WetTexture6 = new ResourceLocation("orespawn", "bikini6.png");
/*  113 */   private static final ResourceLocation WetTexture7 = new ResourceLocation("orespawn", "bikini7.png");
/*  114 */   private static final ResourceLocation WetTexture8 = new ResourceLocation("orespawn", "bikini8.png");
/*  115 */   private static final ResourceLocation WetTexture9 = new ResourceLocation("orespawn", "bikini9.png");
/*  116 */   private static final ResourceLocation WetTexture10 = new ResourceLocation("orespawn", "bikini10.png");
/*  117 */   private static final ResourceLocation WetTexture11 = new ResourceLocation("orespawn", "bikini11.png");
/*  118 */   private static final ResourceLocation WetTexture12 = new ResourceLocation("orespawn", "bikini12.png");
/*  119 */   private static final ResourceLocation WetTexture13 = new ResourceLocation("orespawn", "bikini13.png");
/*  120 */   private static final ResourceLocation WetTexture14 = new ResourceLocation("orespawn", "bikini14.png");
/*  121 */   private static final ResourceLocation WetTexture15 = new ResourceLocation("orespawn", "bikini15.png");
/*  122 */   private static final ResourceLocation WetTexture16 = new ResourceLocation("orespawn", "bikini16.png");
/*  123 */   private static final ResourceLocation WetTexture17 = new ResourceLocation("orespawn", "bikini17.png");
/*      */   
/*  125 */   private static final ResourceLocation PrincessTexture1 = new ResourceLocation("orespawn", "FrogPrincess.png");
/*  126 */   private static final ResourceLocation PrincessTexture2 = new ResourceLocation("orespawn", "FrogPrincess2.png");
/*      */ 
/*      */   
/*      */   public Girlfriend(World par1World) {
/*  130 */     super(par1World);
/*      */     
/*  132 */     this.which_girl = this.field_70146_Z.nextInt(41);
/*  133 */     this.which_wet_girl = this.field_70146_Z.nextInt(18);
/*  134 */     this.voice = this.field_70146_Z.nextInt(10);
/*  135 */     func_70105_a(0.5F, 1.6F);
/*  136 */     this.field_70178_ae = true;
/*  137 */     this.field_70174_ab = 100;
/*      */ 
/*      */     
/*  140 */     func_70661_as().func_75491_a(false);
/*  141 */     func_70904_g(false);
/*  142 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 1.4F, 12.0F, 1.5F));
/*  143 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Item.func_150898_a((Block)Blocks.field_150328_O), false));
/*  144 */     this.Dance = new MyEntityAIDance(this);
/*  145 */     this.field_70714_bg.func_75776_a(3, this.Dance);
/*  146 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIArrowAttack(this, 1.25D, 20, 10.0F));
/*  147 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  148 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  149 */     this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
/*  150 */     this.field_70714_bg.func_75776_a(8, new MyEntityAIWander((EntityCreature)this, 0.75F));
/*  151 */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  152 */     this.field_70714_bg.func_75776_a(10, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
/*  153 */     this.field_70714_bg.func_75776_a(11, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*  154 */     this.field_70715_bh.func_75776_a(1, new MyValentineTarget((EntityLiving)this, EntityPlayer.class, 16.0F, 0, true, true));
/*      */     
/*  156 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(2, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityCreeper.class, 20.0F, 0, true, true, IMob.field_82192_a));
/*      */     
/*  158 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(3, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityLiving.class, 15.0F, 0, true, true, IMob.field_82192_a));
/*      */     
/*  160 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(4, new MyEntityAIJealousy(this, Girlfriend.class, 6.0F, 5, true)); 
/*  161 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(5, new MyEntityAIJealousy(this, Girlfriend.class, 3.0F, 15, true));
/*      */ 
/*      */     
/*  164 */     this.field_70728_aV = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  169 */     super.func_70088_a();
/*      */     
/*  171 */     this.which_girl = this.field_70146_Z.nextInt(41);
/*  172 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.which_girl));
/*  173 */     this.wet_count = 0;
/*  174 */     this.which_wet_girl = this.field_70146_Z.nextInt(18);
/*  175 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(this.which_wet_girl));
/*  176 */     this.voice = this.field_70146_Z.nextInt(10);
/*  177 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(this.voice));
/*  178 */     this.field_70180_af.func_75682_a(23, Integer.valueOf(this.voice_enable));
/*  179 */     this.field_70180_af.func_75682_a(24, Integer.valueOf(this.is_princess));
/*  180 */     this.auto_heal = 200;
/*  181 */     this.force_sync = 50;
/*  182 */     this.fight_sound_ticker = 0;
/*  183 */     this.taunt_sound_ticker = 0;
/*  184 */     this.had_target = 0;
/*  185 */     func_70904_g(false);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  190 */     super.func_110147_ax();
/*  191 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  192 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  193 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  194 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(8.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  199 */     int i = 0;
/*  200 */     ItemStack[] aitemstack = func_70035_c();
/*  201 */     int j = aitemstack.length;
/*      */     
/*  203 */     for (int k = 0; k < j; k++) {
/*      */       
/*  205 */       ItemStack itemstack = aitemstack[k];
/*      */       
/*  207 */       if (itemstack != null && itemstack.func_77973_b() instanceof ItemArmor) {
/*      */         
/*  209 */         int l = ((ItemArmor)itemstack.func_77973_b()).field_77879_b;
/*  210 */         i += l;
/*      */       } 
/*      */     } 
/*  213 */     if (i < 8) i = 8; 
/*  214 */     if (i > 23) i = 23; 
/*  215 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  223 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  224 */     super.func_70071_h_();
/*  225 */     this.passenger = 0;
/*  226 */     if (func_70909_n() && !func_70906_o()) {
/*  227 */       EntityLivingBase entityLivingBase = func_70902_q();
/*  228 */       if (entityLivingBase != null && entityLivingBase instanceof EntityPlayer) {
/*  229 */         EntityPlayer p = (EntityPlayer)entityLivingBase;
/*  230 */         Entity r = ((Entity)entityLivingBase).field_70154_o;
/*  231 */         if (r != null && 
/*  232 */           r instanceof Elevator) {
/*      */ 
/*      */           
/*  235 */           float f = -0.45F;
/*  236 */           func_70107_b(r.field_70165_t - f * Math.sin(Math.toRadians(r.field_70177_z)), r.field_70163_u, r.field_70161_v + f * Math.cos(Math.toRadians(r.field_70177_z)));
/*      */ 
/*      */           
/*  239 */           this.field_70177_z = r.field_70177_z;
/*  240 */           this.field_70125_A = r.field_70125_A;
/*      */           
/*  242 */           this.field_70754_ba = this.field_70721_aZ = 0.0F;
/*  243 */           this.field_70143_R = 0.0F;
/*  244 */           this.passenger = 1;
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
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/*  258 */     super.func_70014_b(par1NBTTagCompound);
/*  259 */     par1NBTTagCompound.func_74768_a("GirlType", getTameSkin());
/*  260 */     par1NBTTagCompound.func_74768_a("WetGirlType", getWetTameSkin());
/*  261 */     par1NBTTagCompound.func_74768_a("GirlVoice", this.field_70180_af.func_75679_c(21));
/*  262 */     par1NBTTagCompound.func_74768_a("GirlVoiceEnable", this.field_70180_af.func_75679_c(23));
/*  263 */     par1NBTTagCompound.func_74768_a("IsPrincess", this.field_70180_af.func_75679_c(24));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/*  272 */     super.func_70037_a(par1NBTTagCompound);
/*  273 */     this.which_girl = par1NBTTagCompound.func_74762_e("GirlType");
/*  274 */     setTameSkin(this.which_girl);
/*  275 */     this.which_wet_girl = par1NBTTagCompound.func_74762_e("WetGirlType");
/*  276 */     setWetTameSkin(this.which_wet_girl);
/*  277 */     this.voice = par1NBTTagCompound.func_74762_e("GirlVoice");
/*  278 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(this.voice));
/*  279 */     this.voice_enable = par1NBTTagCompound.func_74762_e("GirlVoiceEnable");
/*  280 */     this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  281 */     this.is_princess = par1NBTTagCompound.func_74762_e("IsPrincess");
/*  282 */     this.field_70180_af.func_75692_b(24, Integer.valueOf(this.is_princess));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70629_bd() {
/*  293 */     ItemStack stack = getCurrentEquippedItem();
/*  294 */     EntityLivingBase entityLivingBase = func_70638_az();
/*  295 */     if (OreSpawnMain.PlayNicely != 0) entityLivingBase = null; 
/*  296 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1) func_70604_c(null);
/*      */     
/*  298 */     if (stack != null && !func_70906_o())
/*      */     {
/*  300 */       if (entityLivingBase != null) {
/*      */         
/*  302 */         if (entityLivingBase instanceof EntityLivingBase)
/*      */         {
/*  304 */           if (func_70694_bm() != null)
/*      */           {
/*  306 */             if (func_70032_d((Entity)entityLivingBase) < 4.0F || (stack.func_77973_b() == OreSpawnMain.MyBertha && func_70032_d((Entity)entityLivingBase) < 10.0F)) {
/*      */               
/*  308 */               this.field_70724_aR--;
/*  309 */               if (this.field_70724_aR <= 0)
/*      */               {
/*  311 */                 this.field_70724_aR = 25;
/*      */                 
/*  313 */                 func_71038_i();
/*      */                 
/*  315 */                 attackTargetEntityWithCurrentItem((Entity)entityLivingBase);
/*  316 */                 this.fight_sound_ticker--;
/*  317 */                 if (this.fight_sound_ticker <= 0) {
/*      */                   
/*  319 */                   if (!this.field_70170_p.field_72995_K && this.voice_enable != 0) this.field_70170_p.func_72956_a((Entity)this, "orespawn:o_fight", 0.5F, func_70647_i()); 
/*  320 */                   this.fight_sound_ticker = 3;
/*      */                 } 
/*  322 */                 this.had_target = 1;
/*      */               }
/*      */             
/*  325 */             } else if (func_70032_d((Entity)entityLivingBase) < 7.0F && stack.func_77973_b() != OreSpawnMain.MyUltimateBow) {
/*      */               
/*  327 */               this.taunt_sound_ticker--;
/*  328 */               if (this.taunt_sound_ticker <= 0) {
/*      */                 
/*  330 */                 if (!this.field_70170_p.field_72995_K && this.voice_enable != 0) this.field_70170_p.func_72956_a((Entity)this, "orespawn:o_taunt", 0.5F, func_70647_i()); 
/*  331 */                 this.taunt_sound_ticker = 300;
/*      */               } 
/*      */               
/*  334 */               func_70661_as().func_75497_a((Entity)entityLivingBase, 1.25D);
/*      */             } 
/*      */           }
/*      */         }
/*      */       } else {
/*      */         
/*  340 */         this.fight_sound_ticker = 0;
/*  341 */         this.field_70724_aR = 0;
/*  342 */         if (this.had_target != 0) {
/*  343 */           this.had_target = 0;
/*  344 */           if (!this.field_70170_p.field_72995_K && this.voice_enable != 0) this.field_70170_p.func_72956_a((Entity)this, "orespawn:o_woohoo", 0.4F, func_70647_i());
/*      */         
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public void setPrincess(int par1) {
/*  352 */     this.is_princess = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ResourceLocation getTexture() {
/*  360 */     if (OreSpawnMain.valentines_day != 0) return ValentineTexture; 
/*  361 */     if (this.wet_count <= 0) {
/*      */       
/*  363 */       int txture = getTameSkin();
/*      */       
/*  365 */       if (this.is_princess == 1) return PrincessTexture1; 
/*  366 */       if (this.is_princess == 2) return PrincessTexture2;
/*      */       
/*  368 */       if (txture == 0) return DryTexture0; 
/*  369 */       if (txture == 1) return DryTexture1; 
/*  370 */       if (txture == 2) return DryTexture2; 
/*  371 */       if (txture == 3) return DryTexture3; 
/*  372 */       if (txture == 4) return DryTexture4; 
/*  373 */       if (txture == 5) return DryTexture5; 
/*  374 */       if (txture == 6) return DryTexture6; 
/*  375 */       if (txture == 7) return DryTexture7; 
/*  376 */       if (txture == 8) return DryTexture8; 
/*  377 */       if (txture == 9) return DryTexture9; 
/*  378 */       if (txture == 10) return DryTexture10; 
/*  379 */       if (txture == 11) return DryTexture11; 
/*  380 */       if (txture == 12) return DryTexture12; 
/*  381 */       if (txture == 13) return DryTexture13; 
/*  382 */       if (txture == 14) return DryTexture14; 
/*  383 */       if (txture == 15) return DryTexture15; 
/*  384 */       if (txture == 16) return DryTexture16; 
/*  385 */       if (txture == 17) return DryTexture17; 
/*  386 */       if (txture == 18) return DryTexture18; 
/*  387 */       if (txture == 19) return DryTexture19; 
/*  388 */       if (txture == 20) return DryTexture20; 
/*  389 */       if (txture == 21) return DryTexture21; 
/*  390 */       if (txture == 22) return DryTexture22; 
/*  391 */       if (txture == 23) return DryTexture23; 
/*  392 */       if (txture == 24) return DryTexture24; 
/*  393 */       if (txture == 25) return DryTexture25; 
/*  394 */       if (txture == 26) return DryTexture26; 
/*  395 */       if (txture == 27) return DryTexture27; 
/*  396 */       if (txture == 28) return DryTexture28; 
/*  397 */       if (txture == 29) return DryTexture29; 
/*  398 */       if (txture == 30) return DryTexture30; 
/*  399 */       if (txture == 31) return DryTexture31; 
/*  400 */       if (txture == 32) return DryTexture32; 
/*  401 */       if (txture == 33) return DryTexture33; 
/*  402 */       if (txture == 34) return DryTexture34; 
/*  403 */       if (txture == 35) return DryTexture35; 
/*  404 */       if (txture == 36) return DryTexture36; 
/*  405 */       if (txture == 37) return DryTexture37; 
/*  406 */       if (txture == 38) return DryTexture38; 
/*  407 */       if (txture == 39) return DryTexture39; 
/*  408 */       if (txture == 40) return DryTexture40;
/*      */     
/*      */     } else {
/*  411 */       int temp = getWetTameSkin();
/*      */       
/*  413 */       if (temp == 0) return WetTexture0; 
/*  414 */       if (temp == 1) return WetTexture1; 
/*  415 */       if (temp == 2) return WetTexture2; 
/*  416 */       if (temp == 3) return WetTexture3; 
/*  417 */       if (temp == 4) return WetTexture4; 
/*  418 */       if (temp == 5) return WetTexture5; 
/*  419 */       if (temp == 6) return WetTexture6; 
/*  420 */       if (temp == 7) return WetTexture7; 
/*  421 */       if (temp == 8) return WetTexture8; 
/*  422 */       if (temp == 9) return WetTexture9; 
/*  423 */       if (temp == 10) return WetTexture10; 
/*  424 */       if (temp == 11) return WetTexture11; 
/*  425 */       if (temp == 12) return WetTexture12; 
/*  426 */       if (temp == 13) return WetTexture13; 
/*  427 */       if (temp == 14) return WetTexture14; 
/*  428 */       if (temp == 15) return WetTexture15; 
/*  429 */       if (temp == 16) return WetTexture16; 
/*  430 */       if (temp == 17) return WetTexture17;
/*      */     
/*      */     } 
/*  433 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getTameSkin() {
/*  439 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */   
/*      */   public int getVoice() {
/*  443 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTameSkin(int par1) {
/*  448 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*  449 */     this.which_girl = par1;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getWetTameSkin() {
/*  454 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setWetTameSkin(int par1) {
/*  459 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*  460 */     this.which_wet_girl = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  468 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  474 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70069_a(float par1) {
/*  480 */     float i = MathHelper.func_76123_f(par1 - 3.0F);
/*      */     
/*  482 */     if (i > 0.0F) {
/*      */       
/*  484 */       if (i > 3.0F) {
/*      */         
/*  486 */         func_85030_a("damage.fallbig", 1.0F, 1.0F);
/*  487 */         i = 3.0F;
/*      */       }
/*      */       else {
/*      */         
/*  491 */         func_85030_a("damage.fallsmall", 1.0F, 1.0F);
/*      */       } 
/*      */       
/*  494 */       func_70097_a(DamageSource.field_76379_h, i);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  501 */     return 80;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  510 */     func_82168_bl();
/*      */     
/*  512 */     super.func_70636_d();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  518 */     if (func_70090_H() || func_70058_J()) {
/*  519 */       this.wet_count = 500;
/*      */     }
/*  521 */     else if (this.wet_count > 0) {
/*  522 */       this.wet_count--;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  529 */     this.auto_heal--;
/*  530 */     if (this.auto_heal <= 0) {
/*  531 */       if (mygetMaxHealth() > getGirlfriendHealth())
/*      */       {
/*  533 */         func_70691_i(1.0F);
/*      */       }
/*      */       
/*  536 */       this.auto_heal = 100;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  544 */     this.force_sync--;
/*  545 */     if (this.force_sync <= 0) {
/*  546 */       this.force_sync = 20;
/*  547 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  549 */         this.field_70180_af.func_75692_b(21, Integer.valueOf(this.voice));
/*  550 */         this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  551 */         this.field_70180_af.func_75692_b(24, Integer.valueOf(this.is_princess));
/*  552 */         func_70904_g(func_70906_o());
/*      */       } else {
/*      */         
/*  555 */         this.voice = getVoice();
/*  556 */         this.voice_enable = this.field_70180_af.func_75679_c(23);
/*  557 */         this.is_princess = this.field_70180_af.func_75679_c(24);
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
/*      */   public int getGirlfriendHealth() {
/*  575 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  583 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */ 
/*      */     
/*  586 */     if (var2 != null)
/*      */     {
/*  588 */       if (var2.field_77994_a <= 0) {
/*      */         
/*  590 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  591 */         var2 = null;
/*      */       } 
/*      */     }
/*      */     
/*  595 */     if (var2 != null && (var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150328_O) || var2.func_77973_b() == Item.func_150898_a(OreSpawnMain.CrystalFlowerRedBlock)) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */       
/*  597 */       if (!func_70909_n()) {
/*      */         
/*  599 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*  601 */           if (this.field_70146_Z.nextInt(3) == 0)
/*      */           {
/*  603 */             func_70903_f(true);
/*  604 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*  605 */             func_70908_e(true);
/*  606 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  607 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */           
/*      */           }
/*      */           else
/*      */           {
/*  612 */             func_70908_e(false);
/*  613 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */           }
/*      */         
/*      */         }
/*      */       }
/*  618 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */         
/*  620 */         if (this.field_70170_p.field_72995_K) {
/*  621 */           func_70908_e(true);
/*  622 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/*  625 */         if (mygetMaxHealth() > func_110143_aJ()) {
/*  626 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         }
/*      */       } 
/*      */       
/*  630 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  632 */         var2.field_77994_a--;
/*  633 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  635 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  638 */       return true;
/*      */     } 
/*  640 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  643 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  645 */         func_70903_f(false);
/*  646 */         func_152115_b("");
/*  647 */         func_70908_e(false);
/*  648 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */       } 
/*      */       
/*  651 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  653 */         var2.field_77994_a--;
/*  654 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  656 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  659 */       return true;
/*      */     } 
/*      */     
/*  662 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == OreSpawnMain.MyRuby && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  665 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  667 */         this.voice_enable = 0;
/*  668 */         this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  669 */         func_70908_e(true);
/*  670 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */       } 
/*      */       
/*  673 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  675 */         var2.field_77994_a--;
/*  676 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  678 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  681 */       return true;
/*      */     } 
/*  683 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == OreSpawnMain.MyAmethyst && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  686 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  688 */         this.voice_enable = 1;
/*  689 */         this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  690 */         func_70908_e(true);
/*  691 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */       } 
/*      */       
/*  694 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  696 */         var2.field_77994_a--;
/*  697 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  699 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  702 */       return true;
/*      */     } 
/*  704 */     if (func_70909_n() && var2 != null && (var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150327_N) || var2.func_77973_b() == Item.func_150898_a(OreSpawnMain.CrystalFlowerYellowBlock)) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  707 */       if (!this.field_70170_p.field_72995_K)
/*      */       {
/*  709 */         if (this.wet_count > 0 || func_70090_H() || func_70058_J()) {
/*  710 */           this.which_wet_girl++;
/*  711 */           if (this.which_wet_girl > 17) this.which_wet_girl = 0; 
/*  712 */           setWetTameSkin(this.which_wet_girl);
/*  713 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  714 */           if (func_70090_H() || func_70058_J()) {
/*  715 */             this.wet_count = 500;
/*      */           }
/*      */         } else {
/*  718 */           this.which_girl++;
/*  719 */           if (this.which_girl > 40) this.which_girl = 0; 
/*  720 */           setTameSkin(this.which_girl);
/*  721 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */       }
/*      */       
/*  725 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  727 */         var2.field_77994_a--;
/*  728 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  730 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  733 */       return true;
/*  734 */     }  if (func_70909_n() && var2 != null && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */ 
/*      */       
/*  737 */       if (var2.func_77973_b() instanceof ItemFood) {
/*      */         
/*  739 */         if (!this.field_70170_p.field_72995_K) {
/*      */ 
/*      */           
/*  742 */           ItemFood var3 = (ItemFood)var2.func_77973_b();
/*      */           
/*  744 */           if (mygetMaxHealth() > func_110143_aJ())
/*      */           {
/*  746 */             func_70691_i((var3.func_150905_g(var2) * 5));
/*      */           }
/*      */           
/*  749 */           func_70908_e(true);
/*  750 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/*  753 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/*  755 */           var2.field_77994_a--;
/*  756 */           if (var2.field_77994_a <= 0)
/*      */           {
/*  758 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/*      */       } else {
/*  762 */         if (!this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */           
/*  766 */           func_70908_e(true);
/*  767 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/*  770 */         ItemStack var3 = getCurrentEquippedItem();
/*  771 */         func_70062_b(0, var2);
/*  772 */         if (var2.func_77973_b() == Items.field_151045_i) {
/*  773 */           func_70904_g(true);
/*      */         } else {
/*  775 */           func_70904_g(false);
/*      */         } 
/*      */         
/*  778 */         if (var3 != null) {
/*  779 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, var3);
/*      */         } else {
/*      */           
/*  782 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  783 */           Item itm = var2.func_77973_b();
/*  784 */           if (itm instanceof ItemOreSpawnArmor) {
/*  785 */             if (itm == OreSpawnMain.CrystalPinkHelmet || itm == OreSpawnMain.TigersEyeHelmet) {
/*  786 */               ItemStack v4 = func_71124_b(4);
/*  787 */               func_70062_b(4, var2);
/*  788 */               func_70062_b(0, v4);
/*      */             } 
/*  790 */             if (itm == OreSpawnMain.CrystalPinkBody || itm == OreSpawnMain.TigersEyeBody) {
/*  791 */               ItemStack v4 = func_71124_b(3);
/*  792 */               func_70062_b(3, var2);
/*  793 */               func_70062_b(0, v4);
/*      */             } 
/*  795 */             if (itm == OreSpawnMain.CrystalPinkLegs || itm == OreSpawnMain.TigersEyeLegs) {
/*  796 */               ItemStack v4 = func_71124_b(2);
/*  797 */               func_70062_b(2, var2);
/*  798 */               func_70062_b(0, v4);
/*      */             } 
/*  800 */             if (itm == OreSpawnMain.CrystalPinkBoots || itm == OreSpawnMain.TigersEyeBoots) {
/*  801 */               ItemStack v4 = func_71124_b(1);
/*  802 */               func_70062_b(1, var2);
/*  803 */               func_70062_b(0, v4);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  809 */       return true;
/*      */     } 
/*  811 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150484_ah) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */       
/*  813 */       func_70904_g(false);
/*  814 */       func_70903_f(true);
/*  815 */       func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*  816 */       func_70908_e(true);
/*  817 */       this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  818 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  820 */         var2.field_77994_a--;
/*  821 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  823 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  826 */       return true;
/*  827 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  829 */       func_94058_c(var2.func_82833_r());
/*  830 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  832 */         var2.field_77994_a--;
/*  833 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  835 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  838 */       return true;
/*      */     } 
/*  840 */     if (func_70909_n() && var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  843 */       ItemStack var3 = func_71124_b(0);
/*  844 */       int it = 0;
/*  845 */       if (var3 == null) {
/*  846 */         it++;
/*  847 */         var3 = func_71124_b(it);
/*      */       } 
/*  849 */       if (var3 == null) {
/*  850 */         it++;
/*  851 */         var3 = func_71124_b(it);
/*      */       } 
/*  853 */       if (var3 == null) {
/*  854 */         it++;
/*  855 */         var3 = func_71124_b(it);
/*      */       } 
/*  857 */       if (var3 == null) {
/*  858 */         it++;
/*  859 */         var3 = func_71124_b(it);
/*      */       } 
/*  861 */       if (var3 != null) {
/*  862 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, var3);
/*  863 */         func_70062_b(it, null);
/*  864 */         func_70904_g(false);
/*  865 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*  867 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */         }
/*      */       }
/*  870 */       else if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  872 */         func_70904_g(false);
/*  873 */         func_70908_e(true);
/*  874 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  875 */         String healthMessage = new String();
/*  876 */         healthMessage = String.format("I have %d health. Thank you for asking! xoxo", new Object[] { Integer.valueOf(getGirlfriendHealth()) });
/*      */ 
/*      */         
/*  879 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */       } 
/*      */       
/*  882 */       return true;
/*      */     } 
/*      */     
/*  885 */     return super.func_70085_c(par1EntityPlayer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/*  893 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150328_O));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  901 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  909 */     if (func_70906_o() || this.voice_enable == 0)
/*      */     {
/*  911 */       return null;
/*      */     }
/*  913 */     if (this.Dance.is_dancing != 0) return null;
/*      */     
/*  915 */     if (this.field_70146_Z.nextInt(11) == 1) {
/*      */       
/*  917 */       EntityLivingBase entityLivingBase = func_70638_az();
/*  918 */       if (entityLivingBase != null) {
/*  919 */         return null;
/*      */       }
/*      */       
/*  922 */       if (func_70090_H() || func_70058_J()) {
/*  923 */         return "orespawn:o_water";
/*      */       }
/*      */       
/*  926 */       if (this.field_70146_Z.nextInt(4) != 0) {
/*      */         
/*  928 */         if (this.field_70163_u < 60.0D) {
/*  929 */           return null;
/*      */         }
/*      */         
/*  932 */         if (this.field_70170_p.func_72911_I()) {
/*  933 */           return "orespawn:o_thunder";
/*      */         }
/*      */         
/*  936 */         if (this.field_70170_p.func_72896_J()) {
/*  937 */           return "orespawn:o_rain";
/*      */         }
/*      */         
/*  940 */         if (!this.field_70170_p.func_72935_r() && 
/*  941 */           this.field_70170_p.func_72937_j((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v)) {
/*  942 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 0) return "orespawn:o_dark"; 
/*  943 */           return null;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  948 */       if (func_70909_n()) {
/*      */         
/*  950 */         if (mygetMaxHealth() > func_110143_aJ() || OreSpawnMain.valentines_day != 0) {
/*  951 */           return "orespawn:o_hurt";
/*      */         }
/*  953 */         return "orespawn:o_happy";
/*      */       } 
/*  955 */       return null;
/*      */     } 
/*      */ 
/*      */     
/*  959 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  968 */     if (this.voice_enable == 0)
/*      */     {
/*  970 */       return null;
/*      */     }
/*  972 */     return "orespawn:o_ow";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  980 */     return func_70909_n() ? "orespawn:o_death_girlfriend" : "orespawn:o_death_single";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  988 */     return 0.3F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  996 */     return Item.func_150898_a((Block)Blocks.field_150328_O);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/* 1004 */     int var3 = 0;
/*      */     
/* 1006 */     if (func_70909_n()) {
/*      */       
/* 1008 */       var3 = this.field_70146_Z.nextInt(5);
/* 1009 */       var3 += 2;
/* 1010 */       for (int i = 0; i < var3; i++)
/*      */       {
/* 1012 */         func_145779_a(Item.func_150898_a((Block)Blocks.field_150328_O), 1);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1017 */     Item v6 = OreSpawnMain.MyItemShoes;
/* 1018 */     Item v7 = OreSpawnMain.MyItemShoes_1;
/* 1019 */     Item v8 = OreSpawnMain.MyItemShoes_2;
/* 1020 */     Item v9 = OreSpawnMain.MyItemShoes_3;
/*      */     
/* 1022 */     var3 = this.field_70146_Z.nextInt(16);
/* 1023 */     var3 += 4; int var4;
/* 1024 */     for (var4 = 0; var4 < var3; var4++)
/*      */     {
/* 1026 */       func_145779_a(v6, 1);
/*      */     }
/*      */     
/* 1029 */     var3 = this.field_70146_Z.nextInt(16);
/* 1030 */     var3 += 4;
/* 1031 */     for (var4 = 0; var4 < var3; var4++)
/*      */     {
/* 1033 */       func_145779_a(v7, 1);
/*      */     }
/*      */     
/* 1036 */     var3 = this.field_70146_Z.nextInt(16);
/* 1037 */     var3 += 4;
/* 1038 */     for (var4 = 0; var4 < var3; var4++)
/*      */     {
/* 1040 */       func_145779_a(v8, 1);
/*      */     }
/*      */     
/* 1043 */     var3 = this.field_70146_Z.nextInt(16);
/* 1044 */     var3 += 4;
/* 1045 */     for (var4 = 0; var4 < var3; var4++)
/*      */     {
/* 1047 */       func_145779_a(v9, 1);
/*      */     }
/*      */ 
/*      */     
/* 1051 */     if (func_70909_n()) {
/*      */       
/* 1053 */       ItemStack var5 = getCurrentEquippedItem();
/* 1054 */       if (var5 != null && 
/* 1055 */         var5.field_77994_a > 0) {
/* 1056 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1059 */       var5 = func_71124_b(1);
/* 1060 */       if (var5 != null && 
/* 1061 */         var5.field_77994_a > 0) {
/* 1062 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1065 */       var5 = func_71124_b(2);
/* 1066 */       if (var5 != null && 
/* 1067 */         var5.field_77994_a > 0) {
/* 1068 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1071 */       var5 = func_71124_b(3);
/* 1072 */       if (var5 != null && 
/* 1073 */         var5.field_77994_a > 0) {
/* 1074 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1077 */       var5 = func_71124_b(4);
/* 1078 */       if (var5 != null && 
/* 1079 */         var5.field_77994_a > 0) {
/* 1080 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLiving) {
/* 1090 */     ItemStack it = null;
/* 1091 */     if (this.field_82175_bq) {
/*      */       return;
/*      */     }
/*      */     
/* 1095 */     it = getCurrentEquippedItem();
/* 1096 */     if (it != null && it.func_77973_b() == OreSpawnMain.MyUltimateBow) {
/*      */       
/* 1098 */       EntityArrow var8 = new UltimateArrow(this.field_70170_p, (EntityLiving)this, par1EntityLiving, 2.0F, 10.0F);
/*      */ 
/*      */       
/* 1101 */       if (this.field_70170_p.field_73012_v.nextInt(4) == 1) var8.func_70243_d(true);
/*      */       
/* 1103 */       int var10 = EnchantmentHelper.func_77506_a(Enchantment.field_77344_u.field_77352_x, it);
/* 1104 */       if (var10 > 0)
/*      */       {
/* 1106 */         var8.func_70240_a(var10);
/*      */       }
/*      */       
/* 1109 */       if (EnchantmentHelper.func_77506_a(Enchantment.field_77343_v.field_77352_x, it) > 0)
/*      */       {
/* 1111 */         var8.func_70015_d(100);
/*      */       }
/*      */       
/* 1114 */       it.func_77972_a(1, (EntityLivingBase)this);
/* 1115 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (this.field_70170_p.field_73012_v.nextFloat() * 0.4F + 1.2F) + 0.5F);
/*      */       
/* 1117 */       var8.field_70251_a = 2;
/*      */       
/* 1119 */       this.field_70170_p.func_72838_d((Entity)var8);
/*      */     } else {
/*      */       
/* 1122 */       Shoes var2 = new Shoes(this.field_70170_p, (EntityLivingBase)this, 2 + this.field_70146_Z.nextInt(4));
/* 1123 */       double var3 = par1EntityLiving.field_70165_t - this.field_70165_t;
/* 1124 */       double var5 = par1EntityLiving.field_70163_u + par1EntityLiving.func_70047_e() - 1.1D - var2.field_70163_u;
/* 1125 */       double var7 = par1EntityLiving.field_70161_v - this.field_70161_v;
/* 1126 */       float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1127 */       var2.func_70186_c(var3, var5 + var9, var7, 1.8F, 4.0F);
/* 1128 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1129 */       this.field_70170_p.func_72838_d((Entity)var2);
/*      */     } 
/* 1131 */     func_71038_i();
/*      */   }
/*      */ 
/*      */   
/*      */   public ItemStack getCurrentEquippedItem() {
/* 1136 */     return func_71124_b(0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void attackTargetEntityWithCurrentItem(Entity par1Entity) {
/* 1144 */     ItemStack stack = getCurrentEquippedItem();
/*      */ 
/*      */     
/* 1147 */     if (stack != null) {
/*      */       
/* 1149 */       float var2 = 0.0F;
/*      */       
/* 1151 */       if (func_70644_a(Potion.field_76420_g))
/*      */       {
/* 1153 */         var2 += (3 << func_70660_b(Potion.field_76420_g).func_76458_c());
/*      */       }
/*      */       
/* 1156 */       if (func_70644_a(Potion.field_76437_t))
/*      */       {
/* 1158 */         var2 -= (2 << func_70660_b(Potion.field_76437_t).func_76458_c());
/*      */       }
/*      */       
/* 1161 */       int var3 = 0;
/* 1162 */       float var4 = (float)func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e();
/*      */       
/* 1164 */       if (par1Entity instanceof EntityLiving) {
/*      */         
/* 1166 */         var4 += EnchantmentHelper.func_77512_a((EntityLivingBase)this, (EntityLivingBase)par1Entity);
/* 1167 */         var3 += EnchantmentHelper.func_77507_b((EntityLivingBase)this, (EntityLivingBase)par1Entity);
/*      */       } 
/*      */       
/* 1170 */       if (func_70051_ag())
/*      */       {
/* 1172 */         var3++;
/*      */       }
/*      */       
/* 1175 */       if (var2 > 0.0F || var4 > 0.0F) {
/*      */         
/* 1177 */         boolean var5 = (this.field_70143_R > 0.0F && !this.field_70122_E && !func_70617_f_() && !func_70090_H() && !func_70058_J() && !func_70644_a(Potion.field_76440_q) && this.field_70154_o == null && par1Entity instanceof EntityLiving);
/*      */         
/* 1179 */         if (var5)
/*      */         {
/* 1181 */           var2 += this.field_70146_Z.nextInt((int)var2 / 2 + 2);
/*      */         }
/*      */         
/* 1184 */         var2 += var4;
/* 1185 */         boolean var6 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), var2);
/*      */         
/* 1187 */         if (var6)
/*      */         {
/* 1189 */           if (var3 > 0) {
/*      */             
/* 1191 */             par1Entity.func_70024_g((-MathHelper.func_76126_a(this.field_70177_z * 3.1415927F / 180.0F) * var3 * 0.5F), 0.1D, (MathHelper.func_76134_b(this.field_70177_z * 3.1415927F / 180.0F) * var3 * 0.5F));
/* 1192 */             this.field_70159_w *= 0.6D;
/* 1193 */             this.field_70179_y *= 0.6D;
/* 1194 */             func_70031_b(false);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1200 */         ItemStack var7 = getCurrentEquippedItem();
/*      */ 
/*      */         
/* 1203 */         if (par1Entity instanceof EntityLiving) {
/*      */ 
/*      */           
/* 1206 */           int var8 = EnchantmentHelper.func_77506_a(Enchantment.field_77334_n.field_77352_x, var7);
/*      */           
/* 1208 */           if (var8 > 0 && var6)
/*      */           {
/* 1210 */             par1Entity.func_70015_d(var8 * 4);
/*      */           }
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
/*      */   protected float func_70647_i() {
/* 1226 */     return (this.voice - 5) * 0.02F + 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/* 1232 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_82196_d(EntityLivingBase entityliving, float f) {
/* 1238 */     attackEntityWithRangedAttack(entityliving);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 1246 */     boolean ret = false;
/* 1247 */     float p2 = par2;
/* 1248 */     if (p2 > 10.0F) p2 = 10.0F; 
/* 1249 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 1250 */       ret = super.func_70097_a(par1DamageSource, p2);
/*      */     }
/*      */     
/* 1253 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/* 1262 */     for (int k = -3; k < 3; k++) {
/*      */       
/* 1264 */       for (int j = -3; j < 3; j++) {
/*      */         
/* 1266 */         for (int i = 0; i < 5; i++) {
/*      */           
/* 1268 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 1269 */           if (bid == Blocks.field_150474_ac) {
/* 1270 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 1271 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 1272 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 1273 */             if (s != null && 
/* 1274 */               s.equals("Girlfriend")) {
/* 1275 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1283 */     return super.func_70601_bi();
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Girlfriend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */