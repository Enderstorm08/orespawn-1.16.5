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
/*      */ public class Boyfriend
/*      */   extends EntityTameable
/*      */   implements IRangedAttackMob
/*      */ {
/*   49 */   public int which_guy = 0;
/*   50 */   public int which_wet_guy = 0;
/*   51 */   public int wet_count = 0;
/*   52 */   private int auto_heal = 200;
/*   53 */   private int force_sync = 50;
/*   54 */   private int fight_sound_ticker = 0;
/*   55 */   private int taunt_sound_ticker = 0;
/*   56 */   private int had_target = 0;
/*   57 */   private int voice = 0;
/*   58 */   private float moveSpeed = 0.3F;
/*   59 */   private int voice_enable = 1;
/*   60 */   public int passenger = 0;
/*   61 */   private int is_prince = 0;
/*   62 */   private static final ResourceLocation DryTexture0 = new ResourceLocation("orespawn", "boyfriend0.png");
/*   63 */   private static final ResourceLocation DryTexture1 = new ResourceLocation("orespawn", "boyfriend1.png");
/*   64 */   private static final ResourceLocation DryTexture2 = new ResourceLocation("orespawn", "boyfriend2.png");
/*   65 */   private static final ResourceLocation DryTexture3 = new ResourceLocation("orespawn", "boyfriend3.png");
/*   66 */   private static final ResourceLocation DryTexture4 = new ResourceLocation("orespawn", "boyfriend4.png");
/*   67 */   private static final ResourceLocation DryTexture5 = new ResourceLocation("orespawn", "boyfriend5.png");
/*   68 */   private static final ResourceLocation DryTexture6 = new ResourceLocation("orespawn", "boyfriend6.png");
/*   69 */   private static final ResourceLocation DryTexture7 = new ResourceLocation("orespawn", "boyfriend7.png");
/*   70 */   private static final ResourceLocation DryTexture8 = new ResourceLocation("orespawn", "boyfriend8.png");
/*   71 */   private static final ResourceLocation DryTexture9 = new ResourceLocation("orespawn", "boyfriend9.png");
/*   72 */   private static final ResourceLocation DryTexture10 = new ResourceLocation("orespawn", "boyfriend10.png");
/*   73 */   private static final ResourceLocation DryTexture11 = new ResourceLocation("orespawn", "boyfriend11.png");
/*   74 */   private static final ResourceLocation DryTexture12 = new ResourceLocation("orespawn", "boyfriend12.png");
/*   75 */   private static final ResourceLocation DryTexture13 = new ResourceLocation("orespawn", "boyfriend13.png");
/*   76 */   private static final ResourceLocation DryTexture14 = new ResourceLocation("orespawn", "boyfriend14.png");
/*   77 */   private static final ResourceLocation DryTexture15 = new ResourceLocation("orespawn", "boyfriend15.png");
/*   78 */   private static final ResourceLocation DryTexture16 = new ResourceLocation("orespawn", "boyfriend16.png");
/*   79 */   private static final ResourceLocation DryTexture17 = new ResourceLocation("orespawn", "boyfriend17.png");
/*   80 */   private static final ResourceLocation DryTexture18 = new ResourceLocation("orespawn", "boyfriend18.png");
/*   81 */   private static final ResourceLocation DryTexture19 = new ResourceLocation("orespawn", "boyfriend19.png");
/*   82 */   private static final ResourceLocation DryTexture20 = new ResourceLocation("orespawn", "boyfriend20.png");
/*   83 */   private static final ResourceLocation DryTexture21 = new ResourceLocation("orespawn", "boyfriend21.png");
/*   84 */   private static final ResourceLocation DryTexture22 = new ResourceLocation("orespawn", "boyfriend22.png");
/*   85 */   private static final ResourceLocation DryTexture23 = new ResourceLocation("orespawn", "boyfriend23.png");
/*   86 */   private static final ResourceLocation DryTexture24 = new ResourceLocation("orespawn", "boyfriend24.png");
/*   87 */   private static final ResourceLocation DryTexture25 = new ResourceLocation("orespawn", "boyfriend25.png");
/*   88 */   private static final ResourceLocation DryTexture26 = new ResourceLocation("orespawn", "boyfriend26.png");
/*   89 */   private static final ResourceLocation DryTexture27 = new ResourceLocation("orespawn", "boyfriend27.png");
/*      */   
/*   91 */   private static final ResourceLocation WetTexture0 = new ResourceLocation("orespawn", "swimshorts0.png");
/*   92 */   private static final ResourceLocation WetTexture1 = new ResourceLocation("orespawn", "swimshorts1.png");
/*   93 */   private static final ResourceLocation WetTexture2 = new ResourceLocation("orespawn", "swimshorts2.png");
/*   94 */   private static final ResourceLocation WetTexture3 = new ResourceLocation("orespawn", "swimshorts3.png");
/*   95 */   private static final ResourceLocation WetTexture4 = new ResourceLocation("orespawn", "swimshorts4.png");
/*   96 */   private static final ResourceLocation WetTexture5 = new ResourceLocation("orespawn", "swimshorts5.png");
/*   97 */   private static final ResourceLocation WetTexture6 = new ResourceLocation("orespawn", "swimshorts6.png");
/*   98 */   private static final ResourceLocation WetTexture7 = new ResourceLocation("orespawn", "swimshorts7.png");
/*   99 */   private static final ResourceLocation WetTexture8 = new ResourceLocation("orespawn", "swimshorts8.png");
/*  100 */   private static final ResourceLocation WetTexture9 = new ResourceLocation("orespawn", "swimshorts9.png");
/*  101 */   private static final ResourceLocation WetTexture10 = new ResourceLocation("orespawn", "swimshorts10.png");
/*  102 */   private static final ResourceLocation WetTexture11 = new ResourceLocation("orespawn", "swimshorts11.png");
/*  103 */   private static final ResourceLocation WetTexture12 = new ResourceLocation("orespawn", "swimshorts12.png");
/*  104 */   private static final ResourceLocation WetTexture13 = new ResourceLocation("orespawn", "swimshorts13.png");
/*  105 */   private static final ResourceLocation WetTexture14 = new ResourceLocation("orespawn", "swimshorts14.png");
/*  106 */   private static final ResourceLocation WetTexture15 = new ResourceLocation("orespawn", "swimshorts15.png");
/*  107 */   private static final ResourceLocation WetTexture16 = new ResourceLocation("orespawn", "swimshorts16.png");
/*  108 */   private static final ResourceLocation WetTexture17 = new ResourceLocation("orespawn", "swimshorts17.png");
/*      */   
/*  110 */   private static final ResourceLocation PrinceTexture1 = new ResourceLocation("orespawn", "FrogPrince.png");
/*  111 */   private static final ResourceLocation PrinceTexture2 = new ResourceLocation("orespawn", "FrogPrince2.png");
/*      */ 
/*      */   
/*      */   public Boyfriend(World par1World) {
/*  115 */     super(par1World);
/*      */     
/*  117 */     this.which_guy = this.field_70146_Z.nextInt(28);
/*  118 */     this.voice = this.field_70146_Z.nextInt(10);
/*  119 */     this.which_wet_guy = this.field_70146_Z.nextInt(18);
/*  120 */     func_70105_a(0.5F, 1.6F);
/*  121 */     this.field_70178_ae = true;
/*  122 */     this.field_70174_ab = 100;
/*      */ 
/*      */     
/*  125 */     func_70661_as().func_75491_a(false);
/*  126 */     func_70904_g(false);
/*  127 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIFollowOwner(this, 1.4F, 12.0F, 1.5F));
/*  128 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151083_be, false));
/*  129 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIArrowAttack(this, 1.25D, 20, 10.0F));
/*  130 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  131 */     this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
/*  132 */     this.field_70714_bg.func_75776_a(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
/*  133 */     this.field_70714_bg.func_75776_a(8, new MyEntityAIWander((EntityCreature)this, 0.75F));
/*  134 */     this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  135 */     this.field_70714_bg.func_75776_a(10, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
/*  136 */     this.field_70714_bg.func_75776_a(11, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*  137 */     this.field_70715_bh.func_75776_a(1, new MyValentineTarget((EntityLiving)this, EntityPlayer.class, 16.0F, 0, true, true));
/*      */     
/*  139 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(2, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityCreeper.class, 20.0F, 0, true, true, IMob.field_82192_a));
/*      */     
/*  141 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(3, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityLiving.class, 15.0F, 0, true, true, IMob.field_82192_a));
/*      */     
/*  143 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(4, new MyEntityAIJealousy(this, Boyfriend.class, 6.0F, 5, true)); 
/*  144 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(5, new MyEntityAIJealousy(this, Boyfriend.class, 3.0F, 15, true));
/*      */ 
/*      */     
/*  147 */     this.field_70728_aV = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_70088_a() {
/*  152 */     super.func_70088_a();
/*      */     
/*  154 */     this.which_guy = this.field_70146_Z.nextInt(28);
/*  155 */     this.field_70180_af.func_75682_a(20, Integer.valueOf(this.which_guy));
/*  156 */     this.wet_count = 0;
/*  157 */     this.which_wet_guy = this.field_70146_Z.nextInt(18);
/*  158 */     this.field_70180_af.func_75682_a(22, Integer.valueOf(this.which_wet_guy));
/*  159 */     this.voice = this.field_70146_Z.nextInt(10);
/*  160 */     this.field_70180_af.func_75682_a(21, Integer.valueOf(this.voice));
/*  161 */     this.field_70180_af.func_75682_a(23, Integer.valueOf(this.voice_enable));
/*  162 */     this.field_70180_af.func_75682_a(24, Integer.valueOf(this.is_prince));
/*  163 */     this.auto_heal = 200;
/*  164 */     this.force_sync = 50;
/*  165 */     this.fight_sound_ticker = 0;
/*  166 */     this.taunt_sound_ticker = 0;
/*  167 */     this.had_target = 0;
/*  168 */     func_70904_g(false);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void func_110147_ax() {
/*  173 */     super.func_110147_ax();
/*  174 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  175 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  176 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  177 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(8.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  182 */     int i = 0;
/*  183 */     ItemStack[] aitemstack = func_70035_c();
/*  184 */     int j = aitemstack.length;
/*      */     
/*  186 */     for (int k = 0; k < j; k++) {
/*      */       
/*  188 */       ItemStack itemstack = aitemstack[k];
/*      */       
/*  190 */       if (itemstack != null && itemstack.func_77973_b() instanceof ItemArmor) {
/*      */         
/*  192 */         int l = ((ItemArmor)itemstack.func_77973_b()).field_77879_b;
/*  193 */         i += l;
/*      */       } 
/*      */     } 
/*  196 */     if (i < 8) i = 8; 
/*  197 */     if (i > 23) i = 23; 
/*  198 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  206 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  207 */     super.func_70071_h_();
/*  208 */     this.passenger = 0;
/*  209 */     if (func_70909_n() && !func_70906_o()) {
/*  210 */       EntityLivingBase entityLivingBase = func_70902_q();
/*  211 */       if (entityLivingBase != null && entityLivingBase instanceof EntityPlayer) {
/*  212 */         EntityPlayer p = (EntityPlayer)entityLivingBase;
/*  213 */         Entity r = ((Entity)entityLivingBase).field_70154_o;
/*  214 */         if (r != null && 
/*  215 */           r instanceof Elevator) {
/*      */ 
/*      */           
/*  218 */           float f = -0.45F;
/*  219 */           func_70107_b(r.field_70165_t - f * Math.sin(Math.toRadians(r.field_70177_z)), r.field_70163_u, r.field_70161_v + f * Math.cos(Math.toRadians(r.field_70177_z)));
/*      */ 
/*      */           
/*  222 */           this.field_70177_z = r.field_70177_z;
/*  223 */           this.field_70125_A = r.field_70125_A;
/*      */           
/*  225 */           this.field_70754_ba = this.field_70721_aZ = 0.0F;
/*  226 */           this.field_70143_R = 0.0F;
/*  227 */           this.passenger = 1;
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
/*      */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/*  240 */     super.func_70014_b(par1NBTTagCompound);
/*  241 */     par1NBTTagCompound.func_74768_a("GirlType", getTameSkin());
/*  242 */     par1NBTTagCompound.func_74768_a("WetGirlType", getWetTameSkin());
/*  243 */     par1NBTTagCompound.func_74768_a("GirlVoice", this.field_70180_af.func_75679_c(21));
/*  244 */     par1NBTTagCompound.func_74768_a("GirlVoiceEnable", this.field_70180_af.func_75679_c(23));
/*  245 */     par1NBTTagCompound.func_74768_a("IsPrince", this.field_70180_af.func_75679_c(24));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/*  254 */     super.func_70037_a(par1NBTTagCompound);
/*  255 */     this.which_guy = par1NBTTagCompound.func_74762_e("GirlType");
/*  256 */     setTameSkin(this.which_guy);
/*  257 */     this.which_wet_guy = par1NBTTagCompound.func_74762_e("WetGirlType");
/*  258 */     setWetTameSkin(this.which_wet_guy);
/*  259 */     this.voice = par1NBTTagCompound.func_74762_e("GirlVoice");
/*  260 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(this.voice));
/*  261 */     this.voice_enable = par1NBTTagCompound.func_74762_e("GirlVoiceEnable");
/*  262 */     this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  263 */     this.is_prince = par1NBTTagCompound.func_74762_e("IsPrince");
/*  264 */     this.field_70180_af.func_75692_b(24, Integer.valueOf(this.is_prince));
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
/*  275 */     ItemStack stack = getCurrentEquippedItem();
/*  276 */     EntityLivingBase entityLivingBase = func_70638_az();
/*  277 */     if (OreSpawnMain.PlayNicely != 0) entityLivingBase = null; 
/*  278 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1) func_70604_c(null);
/*      */     
/*  280 */     if (stack != null && !func_70906_o())
/*      */     {
/*  282 */       if (entityLivingBase != null) {
/*      */         
/*  284 */         if (entityLivingBase instanceof EntityLivingBase)
/*      */         {
/*  286 */           if (func_70694_bm() != null)
/*      */           {
/*  288 */             if (func_70032_d((Entity)entityLivingBase) < 4.0F || (stack.func_77973_b() == OreSpawnMain.MyBertha && func_70032_d((Entity)entityLivingBase) < 10.0F)) {
/*      */               
/*  290 */               this.field_70724_aR--;
/*  291 */               if (this.field_70724_aR <= 0)
/*      */               {
/*  293 */                 this.field_70724_aR = 25;
/*      */                 
/*  295 */                 func_71038_i();
/*      */                 
/*  297 */                 attackTargetEntityWithCurrentItem((Entity)entityLivingBase);
/*  298 */                 this.fight_sound_ticker--;
/*  299 */                 if (this.fight_sound_ticker <= 0) {
/*      */                   
/*  301 */                   if (!this.field_70170_p.field_72995_K && this.voice_enable != 0) this.field_70170_p.func_72956_a((Entity)this, "orespawn:b_fight", 0.5F, func_70647_i()); 
/*  302 */                   this.fight_sound_ticker = 3;
/*      */                 } 
/*  304 */                 this.had_target = 1;
/*      */               }
/*      */             
/*  307 */             } else if (func_70032_d((Entity)entityLivingBase) < 7.0F && stack.func_77973_b() != OreSpawnMain.MyUltimateBow) {
/*      */               
/*  309 */               this.taunt_sound_ticker--;
/*  310 */               if (this.taunt_sound_ticker <= 0) {
/*      */                 
/*  312 */                 if (!this.field_70170_p.field_72995_K && this.voice_enable != 0) this.field_70170_p.func_72956_a((Entity)this, "orespawn:b_taunt", 0.5F, func_70647_i()); 
/*  313 */                 this.taunt_sound_ticker = 300;
/*      */               } 
/*      */               
/*  316 */               func_70661_as().func_75497_a((Entity)entityLivingBase, 1.25D);
/*      */             } 
/*      */           }
/*      */         }
/*      */       } else {
/*      */         
/*  322 */         this.fight_sound_ticker = 0;
/*  323 */         this.field_70724_aR = 0;
/*  324 */         if (this.had_target != 0) {
/*  325 */           this.had_target = 0;
/*  326 */           if (!this.field_70170_p.field_72995_K && this.voice_enable != 0) this.field_70170_p.func_72956_a((Entity)this, "orespawn:b_woohoo", 0.4F, func_70647_i());
/*      */         
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public void setPrince(int par1) {
/*  334 */     this.is_prince = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ResourceLocation getTexture() {
/*  342 */     if (this.wet_count <= 0) {
/*      */       
/*  344 */       int txture = getTameSkin();
/*      */       
/*  346 */       if (this.is_prince == 1) return PrinceTexture1; 
/*  347 */       if (this.is_prince == 2) return PrinceTexture2;
/*      */       
/*  349 */       if (txture == 0) return DryTexture0; 
/*  350 */       if (txture == 1) return DryTexture1; 
/*  351 */       if (txture == 2) return DryTexture2; 
/*  352 */       if (txture == 3) return DryTexture3; 
/*  353 */       if (txture == 4) return DryTexture4; 
/*  354 */       if (txture == 5) return DryTexture5; 
/*  355 */       if (txture == 6) return DryTexture6; 
/*  356 */       if (txture == 7) return DryTexture7; 
/*  357 */       if (txture == 8) return DryTexture8; 
/*  358 */       if (txture == 9) return DryTexture9; 
/*  359 */       if (txture == 10) return DryTexture10; 
/*  360 */       if (txture == 11) return DryTexture11; 
/*  361 */       if (txture == 12) return DryTexture12; 
/*  362 */       if (txture == 13) return DryTexture13; 
/*  363 */       if (txture == 14) return DryTexture14; 
/*  364 */       if (txture == 15) return DryTexture15; 
/*  365 */       if (txture == 16) return DryTexture16; 
/*  366 */       if (txture == 17) return DryTexture17; 
/*  367 */       if (txture == 18) return DryTexture18; 
/*  368 */       if (txture == 19) return DryTexture19; 
/*  369 */       if (txture == 20) return DryTexture20; 
/*  370 */       if (txture == 21) return DryTexture21; 
/*  371 */       if (txture == 22) return DryTexture22; 
/*  372 */       if (txture == 23) return DryTexture23; 
/*  373 */       if (txture == 24) return DryTexture24; 
/*  374 */       if (txture == 25) return DryTexture25; 
/*  375 */       if (txture == 26) return DryTexture26; 
/*  376 */       if (txture == 27) return DryTexture27;
/*      */     
/*      */     } else {
/*  379 */       int temp = getWetTameSkin();
/*      */       
/*  381 */       if (temp == 0) return WetTexture0; 
/*  382 */       if (temp == 1) return WetTexture1; 
/*  383 */       if (temp == 2) return WetTexture2; 
/*  384 */       if (temp == 3) return WetTexture3; 
/*  385 */       if (temp == 4) return WetTexture4; 
/*  386 */       if (temp == 5) return WetTexture5; 
/*  387 */       if (temp == 6) return WetTexture6; 
/*  388 */       if (temp == 7) return WetTexture7; 
/*  389 */       if (temp == 8) return WetTexture8; 
/*  390 */       if (temp == 9) return WetTexture9; 
/*  391 */       if (temp == 10) return WetTexture10; 
/*  392 */       if (temp == 11) return WetTexture11; 
/*  393 */       if (temp == 12) return WetTexture12; 
/*  394 */       if (temp == 13) return WetTexture13; 
/*  395 */       if (temp == 14) return WetTexture14; 
/*  396 */       if (temp == 15) return WetTexture15; 
/*  397 */       if (temp == 16) return WetTexture16; 
/*  398 */       if (temp == 17) return WetTexture17;
/*      */     
/*      */     } 
/*      */     
/*  402 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getTameSkin() {
/*  408 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */   
/*      */   public int getVoice() {
/*  412 */     return this.field_70180_af.func_75679_c(21);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTameSkin(int par1) {
/*  417 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*  418 */     this.which_guy = par1;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getWetTameSkin() {
/*  423 */     return this.field_70180_af.func_75679_c(22);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setWetTameSkin(int par1) {
/*  428 */     this.field_70180_af.func_75692_b(22, Integer.valueOf(par1));
/*  429 */     this.which_wet_guy = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  437 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  443 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70069_a(float par1) {
/*  449 */     float i = MathHelper.func_76123_f(par1 - 3.0F);
/*      */     
/*  451 */     if (i > 0.0F) {
/*      */       
/*  453 */       if (i > 3.0F) {
/*      */         
/*  455 */         func_85030_a("damage.fallbig", 1.0F, 1.0F);
/*  456 */         i = 3.0F;
/*      */       }
/*      */       else {
/*      */         
/*  460 */         func_85030_a("damage.fallsmall", 1.0F, 1.0F);
/*      */       } 
/*      */       
/*  463 */       func_70097_a(DamageSource.field_76379_h, i);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  470 */     return 80;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  479 */     func_82168_bl();
/*      */     
/*  481 */     super.func_70636_d();
/*      */ 
/*      */ 
/*      */     
/*  485 */     if (func_70090_H() || func_70058_J()) {
/*  486 */       this.wet_count = 500;
/*      */     }
/*  488 */     else if (this.wet_count > 0) {
/*  489 */       this.wet_count--;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  496 */     this.auto_heal--;
/*  497 */     if (this.auto_heal <= 0) {
/*  498 */       if (mygetMaxHealth() > getBoyfriendHealth())
/*      */       {
/*  500 */         func_70691_i(1.0F);
/*      */       }
/*      */       
/*  503 */       this.auto_heal = 150;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  511 */     this.force_sync--;
/*  512 */     if (this.force_sync <= 0) {
/*  513 */       this.force_sync = 20;
/*  514 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  516 */         this.field_70180_af.func_75692_b(21, Integer.valueOf(this.voice));
/*  517 */         this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  518 */         this.field_70180_af.func_75692_b(24, Integer.valueOf(this.is_prince));
/*  519 */         func_70904_g(func_70906_o());
/*      */       } else {
/*      */         
/*  522 */         this.voice = getVoice();
/*  523 */         this.voice_enable = this.field_70180_af.func_75679_c(23);
/*  524 */         this.is_prince = this.field_70180_af.func_75679_c(24);
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
/*      */   public int getBoyfriendHealth() {
/*  542 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  550 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */ 
/*      */     
/*  553 */     if (var2 != null)
/*      */     {
/*  555 */       if (var2.field_77994_a <= 0) {
/*      */         
/*  557 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  558 */         var2 = null;
/*      */       } 
/*      */     }
/*      */     
/*  562 */     if (var2 != null && (var2.func_77973_b() == Items.field_151083_be || var2.func_77973_b() == OreSpawnMain.MyPeacock) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */       
/*  564 */       if (!func_70909_n()) {
/*      */         
/*  566 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*  568 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 0)
/*      */           {
/*  570 */             func_70903_f(true);
/*  571 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*  572 */             func_70908_e(true);
/*  573 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  574 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */           
/*      */           }
/*      */           else
/*      */           {
/*  579 */             func_70908_e(false);
/*  580 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */           }
/*      */         
/*      */         }
/*      */       }
/*  585 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */         
/*  587 */         if (this.field_70170_p.field_72995_K) {
/*  588 */           func_70908_e(true);
/*  589 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/*  592 */         if (mygetMaxHealth() > func_110143_aJ()) {
/*  593 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         }
/*      */       } 
/*      */       
/*  597 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  599 */         var2.field_77994_a--;
/*  600 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  602 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  605 */       return true;
/*      */     } 
/*  607 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  610 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  612 */         func_70903_f(false);
/*  613 */         func_152115_b("");
/*  614 */         func_70908_e(false);
/*  615 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */       } 
/*      */       
/*  618 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  620 */         var2.field_77994_a--;
/*  621 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  623 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  626 */       return true;
/*      */     } 
/*      */     
/*  629 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == OreSpawnMain.MyRuby && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  632 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  634 */         this.voice_enable = 0;
/*  635 */         this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  636 */         func_70908_e(true);
/*  637 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */       } 
/*      */       
/*  640 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  642 */         var2.field_77994_a--;
/*  643 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  645 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  648 */       return true;
/*      */     } 
/*  650 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == OreSpawnMain.MyAmethyst && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  653 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  655 */         this.voice_enable = 1;
/*  656 */         this.field_70180_af.func_75692_b(23, Integer.valueOf(this.voice_enable));
/*  657 */         func_70908_e(true);
/*  658 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */       } 
/*      */       
/*  661 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  663 */         var2.field_77994_a--;
/*  664 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  666 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  669 */       return true;
/*      */     } 
/*  671 */     if (func_70909_n() && var2 != null && (var2.func_77973_b() == Items.field_151116_aA || var2.func_77973_b() == OreSpawnMain.MyPeacockFeather) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  674 */       if (!this.field_70170_p.field_72995_K)
/*      */       {
/*  676 */         if (this.wet_count > 0 || func_70090_H() || func_70058_J()) {
/*  677 */           this.which_wet_guy++;
/*  678 */           if (this.which_wet_guy > 17) this.which_wet_guy = 0; 
/*  679 */           setWetTameSkin(this.which_wet_guy);
/*  680 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  681 */           if (func_70090_H() || func_70058_J()) {
/*  682 */             this.wet_count = 500;
/*      */           }
/*      */         } else {
/*  685 */           this.which_guy++;
/*  686 */           if (this.which_guy > 27) this.which_guy = 0; 
/*  687 */           setTameSkin(this.which_guy);
/*  688 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/*  693 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  695 */         var2.field_77994_a--;
/*  696 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  698 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  701 */       return true;
/*  702 */     }  if (func_70909_n() && var2 != null && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */ 
/*      */       
/*  705 */       if (var2.func_77973_b() instanceof ItemFood) {
/*      */         
/*  707 */         if (!this.field_70170_p.field_72995_K) {
/*      */ 
/*      */           
/*  710 */           ItemFood var3 = (ItemFood)var2.func_77973_b();
/*      */           
/*  712 */           if (mygetMaxHealth() > func_110143_aJ())
/*      */           {
/*  714 */             func_70691_i((var3.func_150905_g(var2) * 5));
/*      */           }
/*      */           
/*  717 */           func_70908_e(true);
/*  718 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/*  721 */         if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */           
/*  723 */           var2.field_77994_a--;
/*  724 */           if (var2.field_77994_a <= 0)
/*      */           {
/*  726 */             par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */           }
/*      */         } 
/*      */       } else {
/*  730 */         if (!this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */           
/*  734 */           func_70908_e(true);
/*  735 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/*  738 */         ItemStack var3 = getCurrentEquippedItem();
/*  739 */         func_70062_b(0, var2);
/*  740 */         if (var2.func_77973_b() == Items.field_151045_i) {
/*  741 */           func_70904_g(true);
/*      */         } else {
/*  743 */           func_70904_g(false);
/*      */         } 
/*      */         
/*  746 */         if (var3 != null) {
/*  747 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, var3);
/*      */         } else {
/*      */           
/*  750 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  751 */           Item itm = var2.func_77973_b();
/*  752 */           if (itm instanceof ItemOreSpawnArmor) {
/*  753 */             if (itm == OreSpawnMain.EmeraldHelmet || itm == OreSpawnMain.AmethystHelmet || itm == OreSpawnMain.UltimateHelmet) {
/*  754 */               ItemStack v4 = func_71124_b(4);
/*  755 */               func_70062_b(4, var2);
/*  756 */               func_70062_b(0, v4);
/*      */             } 
/*  758 */             if (itm == OreSpawnMain.EmeraldBody || itm == OreSpawnMain.AmethystBody || itm == OreSpawnMain.UltimateBody) {
/*  759 */               ItemStack v4 = func_71124_b(3);
/*  760 */               func_70062_b(3, var2);
/*  761 */               func_70062_b(0, v4);
/*      */             } 
/*  763 */             if (itm == OreSpawnMain.EmeraldLegs || itm == OreSpawnMain.AmethystLegs || itm == OreSpawnMain.UltimateLegs) {
/*  764 */               ItemStack v4 = func_71124_b(2);
/*  765 */               func_70062_b(2, var2);
/*  766 */               func_70062_b(0, v4);
/*      */             } 
/*  768 */             if (itm == OreSpawnMain.EmeraldBoots || itm == OreSpawnMain.AmethystBoots || itm == OreSpawnMain.UltimateBoots) {
/*  769 */               ItemStack v4 = func_71124_b(1);
/*  770 */               func_70062_b(1, var2);
/*  771 */               func_70062_b(0, v4);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  778 */       return true;
/*      */     } 
/*  780 */     if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150484_ah) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */       
/*  782 */       func_70904_g(false);
/*  783 */       func_70903_f(true);
/*  784 */       func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*  785 */       func_70908_e(true);
/*  786 */       this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  787 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  789 */         var2.field_77994_a--;
/*  790 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  792 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  795 */       return true;
/*  796 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  798 */       func_94058_c(var2.func_82833_r());
/*  799 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  801 */         var2.field_77994_a--;
/*  802 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  804 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  807 */       return true;
/*      */     } 
/*  809 */     if (func_70909_n() && var2 == null && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  812 */       ItemStack var3 = func_71124_b(0);
/*  813 */       int it = 0;
/*  814 */       if (var3 == null) {
/*  815 */         it++;
/*  816 */         var3 = func_71124_b(it);
/*      */       } 
/*  818 */       if (var3 == null) {
/*  819 */         it++;
/*  820 */         var3 = func_71124_b(it);
/*      */       } 
/*  822 */       if (var3 == null) {
/*  823 */         it++;
/*  824 */         var3 = func_71124_b(it);
/*      */       } 
/*  826 */       if (var3 == null) {
/*  827 */         it++;
/*  828 */         var3 = func_71124_b(it);
/*      */       } 
/*  830 */       if (var3 != null) {
/*  831 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, var3);
/*  832 */         func_70062_b(it, null);
/*  833 */         func_70904_g(false);
/*  834 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*  836 */           this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */         }
/*      */       }
/*  839 */       else if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  841 */         func_70904_g(false);
/*  842 */         func_70908_e(true);
/*  843 */         this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  844 */         String healthMessage = new String();
/*  845 */         healthMessage = String.format("I have %d health. Thanks for asking!", new Object[] { Integer.valueOf(getBoyfriendHealth()) });
/*      */ 
/*      */         
/*  848 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText(healthMessage));
/*      */       } 
/*      */       
/*  851 */       return true;
/*      */     } 
/*      */     
/*  854 */     return super.func_70085_c(par1EntityPlayer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/*  863 */     if (par1ItemStack != null && (
/*  864 */       par1ItemStack.func_77973_b() == Items.field_151083_be || par1ItemStack.func_77973_b() == OreSpawnMain.MyPeacock)) return true;
/*      */ 
/*      */     
/*  867 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  875 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  883 */     if (func_70906_o() || this.voice_enable == 0)
/*      */     {
/*  885 */       return null;
/*      */     }
/*      */     
/*  888 */     if (OreSpawnMain.bro_mode != 0 && this.field_70170_p.field_73012_v.nextInt(2) == 1) return null;
/*      */     
/*  890 */     if (this.field_70170_p.field_73012_v.nextInt(11) == 1) {
/*      */       
/*  892 */       EntityLivingBase entityLivingBase = func_70638_az();
/*  893 */       if (entityLivingBase != null) {
/*  894 */         return null;
/*      */       }
/*      */       
/*  897 */       if (func_70090_H() || func_70058_J()) {
/*  898 */         return "orespawn:b_water";
/*      */       }
/*      */       
/*  901 */       if (this.field_70170_p.field_73012_v.nextInt(4) != 0) {
/*      */         
/*  903 */         if (this.field_70163_u < 60.0D) {
/*  904 */           return null;
/*      */         }
/*      */         
/*  907 */         if (this.field_70170_p.func_72911_I()) {
/*  908 */           return "orespawn:b_thunder";
/*      */         }
/*      */         
/*  911 */         if (this.field_70170_p.func_72896_J()) {
/*  912 */           return "orespawn:b_rain";
/*      */         }
/*      */         
/*  915 */         if (!this.field_70170_p.func_72935_r() && 
/*  916 */           this.field_70170_p.func_72937_j((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v)) {
/*  917 */           if (this.field_70170_p.field_73012_v.nextInt(3) == 0) return "orespawn:b_dark"; 
/*  918 */           return null;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  923 */       if (func_70909_n()) {
/*      */         
/*  925 */         if (mygetMaxHealth() > func_110143_aJ()) {
/*  926 */           return "orespawn:b_hurt";
/*      */         }
/*  928 */         if (OreSpawnMain.bro_mode != 0) return "orespawn:bb_happy"; 
/*  929 */         return "orespawn:b_happy";
/*      */       } 
/*  931 */       return null;
/*      */     } 
/*      */ 
/*      */     
/*  935 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  944 */     if (this.voice_enable == 0)
/*      */     {
/*  946 */       return null;
/*      */     }
/*  948 */     if (OreSpawnMain.bro_mode != 0 && this.field_70170_p.field_73012_v.nextInt(2) == 1) return null; 
/*  949 */     return "orespawn:b_ow";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  957 */     if (OreSpawnMain.bro_mode != 0) return null; 
/*  958 */     return func_70909_n() ? "orespawn:b_death_boyfriend" : "orespawn:b_death_single";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  966 */     return 0.3F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  974 */     return Item.func_150898_a((Block)Blocks.field_150328_O);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  982 */     int var3 = 0;
/*      */     
/*  984 */     if (func_70909_n()) {
/*      */       
/*  986 */       var3 = this.field_70146_Z.nextInt(5);
/*  987 */       var3 += 2;
/*  988 */       for (int i = 0; i < var3; i++)
/*      */       {
/*  990 */         func_145779_a(Item.func_150898_a((Block)Blocks.field_150328_O), 1);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  995 */     Item v6 = OreSpawnMain.MyItemGameController;
/*      */ 
/*      */     
/*  998 */     var3 = this.field_70170_p.field_73012_v.nextInt(26);
/*  999 */     var3 += 10;
/* 1000 */     for (int var4 = 0; var4 < var3; var4++)
/*      */     {
/* 1002 */       func_145779_a(v6, 1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1007 */     if (func_70909_n()) {
/*      */       
/* 1009 */       ItemStack var5 = getCurrentEquippedItem();
/* 1010 */       if (var5 != null && 
/* 1011 */         var5.field_77994_a > 0) {
/* 1012 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1015 */       var5 = func_71124_b(1);
/* 1016 */       if (var5 != null && 
/* 1017 */         var5.field_77994_a > 0) {
/* 1018 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1021 */       var5 = func_71124_b(2);
/* 1022 */       if (var5 != null && 
/* 1023 */         var5.field_77994_a > 0) {
/* 1024 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1027 */       var5 = func_71124_b(3);
/* 1028 */       if (var5 != null && 
/* 1029 */         var5.field_77994_a > 0) {
/* 1030 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */       
/* 1033 */       var5 = func_71124_b(4);
/* 1034 */       if (var5 != null && 
/* 1035 */         var5.field_77994_a > 0) {
/* 1036 */         func_145779_a(var5.func_77973_b(), var5.field_77994_a);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLiving) {
/* 1046 */     ItemStack it = null;
/* 1047 */     if (this.field_82175_bq) {
/*      */       return;
/*      */     }
/*      */     
/* 1051 */     it = getCurrentEquippedItem();
/* 1052 */     if (it != null && it.func_77973_b() == OreSpawnMain.MyUltimateBow) {
/*      */       
/* 1054 */       EntityArrow var8 = new UltimateArrow(this.field_70170_p, (EntityLiving)this, par1EntityLiving, 2.0F, 10.0F);
/*      */ 
/*      */       
/* 1057 */       if (this.field_70170_p.field_73012_v.nextInt(4) == 1) var8.func_70243_d(true);
/*      */       
/* 1059 */       int var10 = EnchantmentHelper.func_77506_a(Enchantment.field_77344_u.field_77352_x, it);
/* 1060 */       if (var10 > 0)
/*      */       {
/* 1062 */         var8.func_70240_a(var10);
/*      */       }
/*      */       
/* 1065 */       if (EnchantmentHelper.func_77506_a(Enchantment.field_77343_v.field_77352_x, it) > 0)
/*      */       {
/* 1067 */         var8.func_70015_d(100);
/*      */       }
/*      */       
/* 1070 */       it.func_77972_a(1, (EntityLivingBase)this);
/* 1071 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 1.0F, 1.0F / (this.field_70170_p.field_73012_v.nextFloat() * 0.4F + 1.2F) + 0.5F);
/*      */       
/* 1073 */       var8.field_70251_a = 2;
/*      */       
/* 1075 */       this.field_70170_p.func_72838_d((Entity)var8);
/*      */     } else {
/*      */       
/* 1078 */       Shoes var2 = new Shoes(this.field_70170_p, (EntityLivingBase)this, 6);
/* 1079 */       double var3 = par1EntityLiving.field_70165_t - this.field_70165_t;
/* 1080 */       double var5 = par1EntityLiving.field_70163_u + par1EntityLiving.func_70047_e() - 1.1D - var2.field_70163_u;
/* 1081 */       double var7 = par1EntityLiving.field_70161_v - this.field_70161_v;
/* 1082 */       float var9 = MathHelper.func_76133_a(var3 * var3 + var7 * var7) * 0.2F;
/* 1083 */       var2.func_70186_c(var3, var5 + var9, var7, 1.8F, 4.0F);
/* 1084 */       this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/* 1085 */       this.field_70170_p.func_72838_d((Entity)var2);
/*      */     } 
/* 1087 */     func_71038_i();
/*      */   }
/*      */ 
/*      */   
/*      */   public ItemStack getCurrentEquippedItem() {
/* 1092 */     return func_71124_b(0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void attackTargetEntityWithCurrentItem(Entity par1Entity) {
/* 1100 */     ItemStack stack = getCurrentEquippedItem();
/*      */ 
/*      */     
/* 1103 */     if (stack != null) {
/*      */       
/* 1105 */       float var2 = 0.0F;
/*      */       
/* 1107 */       if (func_70644_a(Potion.field_76420_g))
/*      */       {
/* 1109 */         var2 += (3 << func_70660_b(Potion.field_76420_g).func_76458_c());
/*      */       }
/*      */       
/* 1112 */       if (func_70644_a(Potion.field_76437_t))
/*      */       {
/* 1114 */         var2 -= (2 << func_70660_b(Potion.field_76437_t).func_76458_c());
/*      */       }
/*      */       
/* 1117 */       int var3 = 0;
/* 1118 */       float var4 = (float)func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e();
/*      */       
/* 1120 */       if (par1Entity instanceof EntityLiving) {
/*      */         
/* 1122 */         var4 += EnchantmentHelper.func_77512_a((EntityLivingBase)this, (EntityLivingBase)par1Entity);
/* 1123 */         var3 += EnchantmentHelper.func_77507_b((EntityLivingBase)this, (EntityLivingBase)par1Entity);
/*      */       } 
/*      */       
/* 1126 */       if (func_70051_ag())
/*      */       {
/* 1128 */         var3++;
/*      */       }
/*      */       
/* 1131 */       if (var2 > 0.0F || var4 > 0.0F) {
/*      */         
/* 1133 */         boolean var5 = (this.field_70143_R > 0.0F && !this.field_70122_E && !func_70617_f_() && !func_70090_H() && !func_70058_J() && !func_70644_a(Potion.field_76440_q) && this.field_70154_o == null && par1Entity instanceof EntityLiving);
/*      */         
/* 1135 */         if (var5)
/*      */         {
/* 1137 */           var2 += this.field_70170_p.field_73012_v.nextInt((int)var2 / 2 + 2);
/*      */         }
/*      */         
/* 1140 */         var2 += var4;
/* 1141 */         boolean var6 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), var2);
/*      */         
/* 1143 */         if (var6)
/*      */         {
/* 1145 */           if (var3 > 0) {
/*      */             
/* 1147 */             par1Entity.func_70024_g((-MathHelper.func_76126_a(this.field_70177_z * 3.1415927F / 180.0F) * var3 * 0.5F), 0.1D, (MathHelper.func_76134_b(this.field_70177_z * 3.1415927F / 180.0F) * var3 * 0.5F));
/* 1148 */             this.field_70159_w *= 0.6D;
/* 1149 */             this.field_70179_y *= 0.6D;
/* 1150 */             func_70031_b(false);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1156 */         ItemStack var7 = getCurrentEquippedItem();
/*      */ 
/*      */         
/* 1159 */         if (par1Entity instanceof EntityLiving) {
/*      */ 
/*      */           
/* 1162 */           int var8 = EnchantmentHelper.func_77506_a(Enchantment.field_77334_n.field_77352_x, var7);
/*      */           
/* 1164 */           if (var8 > 0 && var6)
/*      */           {
/* 1166 */             par1Entity.func_70015_d(var8 * 4);
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
/* 1182 */     return (this.voice - 5) * 0.02F + 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/* 1188 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_82196_d(EntityLivingBase entityliving, float f) {
/* 1194 */     attackEntityWithRangedAttack(entityliving);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/* 1202 */     boolean ret = false;
/* 1203 */     float p2 = par2;
/* 1204 */     if (p2 > 10.0F) p2 = 10.0F; 
/* 1205 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/* 1206 */       ret = super.func_70097_a(par1DamageSource, p2);
/*      */     }
/* 1208 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/* 1217 */     for (int k = -3; k < 3; k++) {
/*      */       
/* 1219 */       for (int j = -3; j < 3; j++) {
/*      */         
/* 1221 */         for (int i = 0; i < 5; i++) {
/*      */           
/* 1223 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 1224 */           if (bid == Blocks.field_150474_ac) {
/* 1225 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 1226 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 1227 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 1228 */             if (s != null && 
/* 1229 */               s.equals("Boyfriend")) {
/* 1230 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1238 */     return super.func_70601_bi();
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Boyfriend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */