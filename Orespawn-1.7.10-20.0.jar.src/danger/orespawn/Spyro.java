/*      */ package danger.orespawn;
/*      */ 
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EntityAgeable;
/*      */ import net.minecraft.entity.EntityCreature;
/*      */ import net.minecraft.entity.EntityList;
/*      */ import net.minecraft.entity.EntityLiving;
/*      */ import net.minecraft.entity.EntityLivingBase;
/*      */ import net.minecraft.entity.SharedMonsterAttributes;
/*      */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*      */ import net.minecraft.entity.ai.EntityAIBase;
/*      */ import net.minecraft.entity.ai.EntityAILookIdle;
/*      */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*      */ import net.minecraft.entity.ai.EntityAIPanic;
/*      */ import net.minecraft.entity.ai.EntityAISwimming;
/*      */ import net.minecraft.entity.ai.EntityAITempt;
/*      */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*      */ import net.minecraft.entity.monster.EntityMob;
/*      */ import net.minecraft.entity.passive.EntityTameable;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.entity.projectile.EntitySmallFireball;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.util.ChatComponentText;
/*      */ import net.minecraft.util.ChunkCoordinates;
/*      */ import net.minecraft.util.DamageSource;
/*      */ import net.minecraft.util.IChatComponent;
/*      */ import net.minecraft.util.MathHelper;
/*      */ import net.minecraft.util.Vec3;
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
/*      */ public class Spyro
/*      */   extends EntityTameable
/*      */ {
/*      */   private ChunkCoordinates currentFlightTarget;
/*   60 */   private GenericTargetSorter TargetSorter = null;
/*   61 */   public int activity = 1;
/*   62 */   private int owner_flying = 0;
/*      */   
/*      */   private boolean target_in_sight = false;
/*   65 */   private float moveSpeed = 0.3F;
/*      */   private int closest; private int tx; private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*      */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*      */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*   69 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(5.0D); } public Spyro(World par1World) { super(par1World);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  135 */     this.closest = 99999;
/*  136 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.5F, 0.5F); this.moveSpeed = 0.3F; this.field_70174_ab = 1000; this.field_70178_ae = true; func_70661_as().func_75491_a(true); func_70904_g(false); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this)); this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 0.30000001192092896D, 0.4000000059604645D)); this.field_70714_bg.func_75776_a(3, new MyEntityAIFollowOwner(this, 1.15F, 12.0F, 2.0F)); this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.field_151082_bd, false)); this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D)); this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F)); this.field_70714_bg.func_75776_a(7, new MyEntityAIWander((EntityCreature)this, 0.75F)); this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this)); this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this)); this.TargetSorter = new GenericTargetSorter((Entity)this); this.field_70728_aV = 35; }
/*      */   protected void func_70088_a() { super.func_70088_a(); this.activity = 1; this.field_70180_af.func_75682_a(21, Integer.valueOf(this.activity)); this.field_70180_af.func_75682_a(20, Integer.valueOf(1));
/*      */     func_70904_g(false);
/*  139 */     func_70903_f(false); } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*      */ 
/*      */     
/*      */     int i;
/*      */     
/*  144 */     for (i = -dy; i <= dy; i++) {
/*  145 */       for (int j = -dz; j <= dz; j++) {
/*  146 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/*  147 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  148 */           int d = dx * dx + j * j + i * i;
/*  149 */           if (d < this.closest) {
/*  150 */             this.closest = d;
/*  151 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/*  152 */             found++;
/*      */           } 
/*      */         } 
/*  155 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/*  156 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  157 */           int d = dx * dx + j * j + i * i;
/*  158 */           if (d < this.closest) {
/*  159 */             this.closest = d;
/*  160 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/*  161 */             found++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  167 */     for (i = -dx; i <= dx; i++) {
/*  168 */       for (int j = -dz; j <= dz; j++) {
/*  169 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/*  170 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  171 */           int d = dy * dy + j * j + i * i;
/*  172 */           if (d < this.closest) {
/*  173 */             this.closest = d;
/*  174 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/*  175 */             found++;
/*      */           } 
/*      */         } 
/*  178 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/*  179 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  180 */           int d = dy * dy + j * j + i * i;
/*  181 */           if (d < this.closest) {
/*  182 */             this.closest = d;
/*  183 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/*  184 */             found++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  190 */     for (i = -dx; i <= dx; i++) {
/*  191 */       for (int j = -dy; j <= dy; j++) {
/*  192 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/*  193 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  194 */           int d = dz * dz + j * j + i * i;
/*  195 */           if (d < this.closest) {
/*  196 */             this.closest = d;
/*  197 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/*  198 */             found++;
/*      */           } 
/*      */         } 
/*  201 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/*  202 */         if (bid == Blocks.field_150353_l || bid == Blocks.field_150356_k) {
/*  203 */           int d = dz * dz + j * j + i * i;
/*  204 */           if (d < this.closest) {
/*  205 */             this.closest = d;
/*  206 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/*  207 */             found++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  213 */     if (found != 0) return true; 
/*  214 */     return false; } public void func_70014_b(NBTTagCompound par1NBTTagCompound) { super.func_70014_b(par1NBTTagCompound);
/*      */     par1NBTTagCompound.func_74768_a("SpyroActivity", this.field_70180_af.func_75679_c(21));
/*      */     par1NBTTagCompound.func_74768_a("SpyroFire", this.field_70180_af.func_75679_c(20)); }
/*      */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) { super.func_70037_a(par1NBTTagCompound);
/*      */     this.activity = par1NBTTagCompound.func_74762_e("SpyroActivity");
/*      */     this.field_70180_af.func_75692_b(21, Integer.valueOf(this.activity));
/*      */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1NBTTagCompound.func_74762_e("SpyroFire"))); }
/*  221 */   public int getActivity() { int i = this.field_70180_af.func_75679_c(21);
/*  222 */     return i; }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setActivity(int par1) {
/*  228 */     this.activity = par1;
/*  229 */     this.field_70180_af.func_75692_b(21, Integer.valueOf(this.activity));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getSpyroFire() {
/*  235 */     return this.field_70180_af.func_75679_c(20);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSpyroFire(int par1) {
/*  241 */     this.field_70180_af.func_75692_b(20, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70650_aV() {
/*  250 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70648_aU() {
/*  256 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public int mygetMaxHealth() {
/*  261 */     return 200;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getSpyroHealth() {
/*  268 */     return (int)func_110143_aJ();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  276 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*      */ 
/*      */     
/*  279 */     if (var2 != null)
/*      */     {
/*  281 */       if (var2.field_77994_a <= 0) {
/*      */         
/*  283 */         par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  284 */         var2 = null;
/*      */       } 
/*      */     }
/*      */     
/*  288 */     if (var2 != null && var2.func_77973_b() == Items.field_151082_bd && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D) {
/*      */       
/*  290 */       if (!func_70909_n()) {
/*      */         
/*  292 */         if (!this.field_70170_p.field_72995_K)
/*      */         {
/*  294 */           if (this.field_70170_p.field_73012_v.nextInt(2) == 1) {
/*  295 */             func_70903_f(true);
/*  296 */             func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*  297 */             func_70908_e(true);
/*  298 */             this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*  299 */             func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */           } else {
/*      */             
/*  302 */             func_70908_e(false);
/*  303 */             this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */           }
/*      */         
/*      */         }
/*      */       }
/*  308 */       else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */         
/*  310 */         if (this.field_70170_p.field_72995_K) {
/*  311 */           func_70908_e(true);
/*  312 */           this.field_70170_p.func_72960_a((Entity)this, (byte)7);
/*      */         } 
/*      */         
/*  315 */         if (mygetMaxHealth() > func_110143_aJ()) {
/*  316 */           func_70691_i(mygetMaxHealth() - func_110143_aJ());
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  321 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  323 */         var2.field_77994_a--;
/*  324 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  326 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  329 */       return true;
/*  330 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a((Block)Blocks.field_150330_I) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  333 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  335 */         func_70903_f(false);
/*  336 */         func_70606_j(mygetMaxHealth());
/*      */         
/*  338 */         func_152115_b("");
/*  339 */         func_70908_e(false);
/*  340 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*      */       } 
/*  342 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  344 */         var2.field_77994_a--;
/*  345 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  347 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  350 */       return true;
/*  351 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Item.func_150898_a(Blocks.field_150432_aD) && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  354 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  356 */         func_70908_e(true);
/*  357 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*  358 */         setSpyroFire(0);
/*  359 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Baby Dragon fireballs extinguished."));
/*      */       } 
/*      */       
/*  362 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  364 */         var2.field_77994_a--;
/*  365 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  367 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  370 */       return true;
/*  371 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151045_i && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer) && !this.field_70170_p.field_72995_K) {
/*      */ 
/*      */ 
/*      */       
/*  375 */       Entity ent = null;
/*  376 */       Dragon d = null;
/*  377 */       ent = spawnCreature(this.field_70170_p, "Dragon", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  378 */       if (ent != null) {
/*  379 */         d = (Dragon)ent;
/*  380 */         if (func_70909_n()) {
/*  381 */           d.func_70903_f(true);
/*  382 */           d.func_152115_b(par1EntityPlayer.func_110124_au().toString());
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  388 */         func_70106_y();
/*      */       } 
/*  390 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  392 */         var2.field_77994_a--;
/*  393 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  395 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  398 */       return true;
/*  399 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151033_d && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */ 
/*      */       
/*  402 */       if (!this.field_70170_p.field_72995_K) {
/*      */         
/*  404 */         func_70908_e(true);
/*  405 */         this.field_70170_p.func_72960_a((Entity)this, (byte)6);
/*  406 */         setSpyroFire(1);
/*  407 */         par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Baby Dragon fireballs lit!"));
/*      */       } 
/*      */       
/*  410 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  412 */         var2.field_77994_a--;
/*  413 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  415 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  418 */       return true;
/*  419 */     }  if (func_70909_n() && var2 != null && var2.func_77973_b() == Items.field_151057_cb && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  421 */       func_94058_c(var2.func_82833_r());
/*  422 */       if (!par1EntityPlayer.field_71075_bZ.field_75098_d) {
/*      */         
/*  424 */         var2.field_77994_a--;
/*  425 */         if (var2.field_77994_a <= 0)
/*      */         {
/*  427 */           par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*      */         }
/*      */       } 
/*  430 */       return true;
/*  431 */     }  if (func_70909_n() && par1EntityPlayer.func_70068_e((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
/*      */       
/*  433 */       if (!func_70906_o()) {
/*  434 */         func_70904_g(true);
/*      */       } else {
/*  436 */         func_70904_g(false);
/*      */       } 
/*  438 */       return true;
/*      */     } 
/*      */     
/*  441 */     return super.func_70085_c(par1EntityPlayer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWheat(ItemStack par1ItemStack) {
/*  449 */     return (par1ItemStack != null && par1ItemStack.func_77973_b() == Items.field_151082_bd);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70692_ba() {
/*  457 */     if (func_104002_bU()) return false; 
/*  458 */     if (func_70909_n()) {
/*  459 */       return false;
/*      */     }
/*  461 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int func_70658_aO() {
/*  469 */     return 5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70639_aQ() {
/*  477 */     if (func_70906_o())
/*      */     {
/*  479 */       return null;
/*      */     }
/*  481 */     if (getActivity() != 2) {
/*  482 */       return null;
/*      */     }
/*  484 */     return "orespawn:roar";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70621_aR() {
/*  492 */     return "orespawn:duck_hurt";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String func_70673_aS() {
/*  500 */     return "orespawn:cryo_death";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70599_aP() {
/*  508 */     return 0.4F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Item func_146068_u() {
/*  516 */     return Items.field_151082_bd;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70628_a(boolean par1, int par2) {
/*  524 */     int var3 = 0;
/*      */     
/*  526 */     if (func_70909_n()) {
/*      */       
/*  528 */       var3 = this.field_70170_p.field_73012_v.nextInt(4);
/*  529 */       var3++;
/*  530 */       for (int var4 = 0; var4 < var3; var4++)
/*      */       {
/*  532 */         func_145779_a(Items.field_151082_bd, 1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float func_70647_i() {
/*  543 */     return func_70631_g_() ? ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 0.1F + 1.5F) : ((this.field_70170_p.field_73012_v.nextFloat() - this.field_70170_p.field_73012_v.nextFloat()) * 0.1F + 1.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean func_70041_e_() {
/*  551 */     return true;
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
/*  569 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70601_bi() {
/*  577 */     if (!this.field_70170_p.func_72935_r()) return false; 
/*  578 */     if (this.field_70163_u < 50.0D) return false; 
/*  579 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/*  585 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public float getAttackStrength(Entity par1Entity) {
/*  590 */     return 4.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70652_k(Entity par1Entity) {
/*  597 */     float var2 = getAttackStrength(par1Entity);
/*  598 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), var2);
/*  599 */     return var4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
/*  607 */     boolean ret = false;
/*  608 */     if (!par1DamageSource.func_76355_l().equals("cactus")) {
/*  609 */       ret = super.func_70097_a(par1DamageSource, par2);
/*      */     }
/*  611 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSeeTarget(double pX, double pY, double pZ) {
/*  619 */     return (this.field_70170_p.func_72901_a(Vec3.func_72443_a(this.field_70165_t, this.field_70163_u + 0.75D, this.field_70161_v), Vec3.func_72443_a(pX, pY, pZ), false) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70071_h_() {
/*  630 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  631 */     super.func_70071_h_();
/*      */     
/*  633 */     if (func_70090_H()) {
/*  634 */       this.field_70181_x += 0.07D;
/*      */     }
/*      */     
/*  637 */     if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  639 */     if (this.currentFlightTarget == null) {
/*  640 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     }
/*      */     
/*  643 */     if (this.field_70170_p.field_73012_v.nextInt(100000) == 1 && !func_104002_bU()) {
/*      */       
/*  645 */       Entity ent = null;
/*  646 */       Dragon d = null;
/*  647 */       ent = spawnCreature(this.field_70170_p, "Dragon", this.field_70165_t, this.field_70163_u, this.field_70161_v);
/*  648 */       if (ent != null) {
/*  649 */         d = (Dragon)ent;
/*  650 */         if (func_70909_n()) {
/*  651 */           d.func_70903_f(true);
/*  652 */           d.func_152115_b(func_152113_b());
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  658 */         func_70106_y();
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*  663 */     if (this.activity == 2) {
/*  664 */       if (this.field_70163_u < this.currentFlightTarget.field_71572_b + 2.0D) {
/*  665 */         this.field_70181_x *= 0.7D;
/*  666 */       } else if (this.field_70163_u > this.currentFlightTarget.field_71572_b - 2.0D) {
/*  667 */         this.field_70181_x *= 0.5D;
/*      */       } else {
/*  669 */         this.field_70181_x *= 0.61D;
/*      */       } 
/*      */     }
/*      */     
/*  673 */     if (this.activity == 1 && func_70909_n() && func_70902_q() != null) {
/*  674 */       EntityLivingBase e = func_70902_q();
/*      */       
/*  676 */       if (func_70068_e((Entity)e) > 256.0D)
/*      */       {
/*  678 */         setActivity(2);
/*      */       }
/*      */     } 
/*      */     
/*  682 */     do_movement();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_70636_d() {
/*  693 */     super.func_70636_d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70629_bd() {
/*  702 */     int fly = 0;
/*      */     
/*  704 */     if (this.field_70128_L)
/*  705 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null);
/*      */     
/*  707 */     if (this.field_70170_p.field_72995_K)
/*      */       return; 
/*  709 */     if (!func_70906_o()) {
/*  710 */       if (this.activity == 0) {
/*  711 */         this.activity = 1;
/*      */       }
/*      */       
/*  714 */       if (this.field_70170_p.field_73012_v.nextInt(20) == 0) {
/*      */ 
/*      */ 
/*      */         
/*  718 */         this.closest = 99999;
/*  719 */         this.tx = this.ty = this.tz = 0;
/*  720 */         for (int i = 1; i < 11; i++) {
/*  721 */           int j = i;
/*  722 */           if (j > 4) j = 4; 
/*  723 */           if (scan_it((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v, i, j, i) == true)
/*  724 */             break;  if (i >= 6) i++;
/*      */         
/*      */         } 
/*  727 */         if (this.closest < 99999) {
/*      */           
/*  729 */           setActivity(1);
/*  730 */           func_70661_as().func_75492_a(this.tx, (this.ty - 1), this.tz, 1.0D);
/*  731 */           if (func_70058_J()) {
/*  732 */             func_70691_i(1.0F);
/*  733 */             func_85030_a("splash", 1.0F, this.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  738 */       if (this.field_70170_p.field_73012_v.nextInt(100) == 1 && 
/*  739 */         !this.target_in_sight) {
/*  740 */         this.activity = 1;
/*  741 */         if (this.field_70170_p.field_73012_v.nextInt(8) == 1) this.activity = 2; 
/*  742 */         setActivity(this.activity);
/*      */       } 
/*      */ 
/*      */       
/*  746 */       this.owner_flying = 0;
/*  747 */       if (func_70909_n() && func_70902_q() != null) {
/*  748 */         EntityPlayer e = (EntityPlayer)func_70902_q();
/*      */         
/*  750 */         if (e.field_71075_bZ.field_75100_b) fly = 1; 
/*  751 */         if (fly == 1) {
/*  752 */           this.owner_flying = 1;
/*  753 */           setActivity(2);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void func_70619_bc() {
/*  762 */     if (this.field_70128_L)
/*  763 */       return;  super.func_70619_bc();
/*      */ 
/*      */     
/*  766 */     if (this.field_70170_p.field_73012_v.nextInt(100) == 1 && 
/*  767 */       func_110143_aJ() < mygetMaxHealth()) {
/*  768 */       func_70691_i(1.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void do_movement() {
/*  776 */     int xdir = 1;
/*  777 */     int zdir = 1;
/*      */     
/*  779 */     int keep_trying = 50;
/*      */ 
/*      */     
/*  782 */     int do_new = 0;
/*  783 */     double ox = 0.0D, oy = 0.0D, oz = 0.0D;
/*      */     
/*  785 */     int has_owner = 0;
/*  786 */     EntityLivingBase e = null;
/*      */ 
/*      */     
/*  789 */     if (this.currentFlightTarget == null) {
/*  790 */       do_new = 1;
/*  791 */       this.currentFlightTarget = new ChunkCoordinates((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v);
/*      */     } 
/*      */     
/*  794 */     if (func_70906_o())
/*  795 */       return;  if (this.activity == 1) {
/*      */       return;
/*      */     }
/*  798 */     if (getActivity() == 2 && this.field_70170_p.field_73012_v.nextInt(300) == 0) do_new = 1;
/*      */ 
/*      */     
/*  801 */     if (func_70909_n() && func_70902_q() != null) {
/*  802 */       e = func_70902_q();
/*  803 */       has_owner = 1;
/*  804 */       ox = e.field_70165_t;
/*  805 */       oy = e.field_70163_u;
/*  806 */       oz = e.field_70161_v;
/*      */       
/*  808 */       if (func_70068_e((Entity)e) > 100.0D) {
/*  809 */         do_new = 1;
/*      */       }
/*  811 */       if (this.owner_flying != 0 && 
/*  812 */         func_70068_e((Entity)e) > 36.0D) {
/*  813 */         do_new = 1;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  819 */     if (this.field_70170_p.field_73012_v.nextInt(6) == 1 && this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL) {
/*      */ 
/*      */ 
/*      */       
/*  823 */       e = findSomethingToAttack();
/*  824 */       if (e != null) {
/*      */         
/*  826 */         if (func_70909_n() && func_110143_aJ() / mygetMaxHealth() < 0.25F) {
/*  827 */           setActivity(2);
/*  828 */           this.target_in_sight = false;
/*  829 */           do_new = 0;
/*  830 */           this.currentFlightTarget.func_71571_b((int)(this.field_70165_t + this.field_70165_t - e.field_70165_t), (int)(this.field_70163_u + 1.0D), (int)(this.field_70161_v + this.field_70161_v - e.field_70161_v));
/*      */         } else {
/*      */           
/*  833 */           setActivity(2);
/*  834 */           this.target_in_sight = true;
/*  835 */           this.currentFlightTarget.func_71571_b((int)e.field_70165_t, (int)(e.field_70163_u + 1.0D), (int)e.field_70161_v);
/*  836 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*  837 */           do_new = 0;
/*  838 */           if (func_70068_e((Entity)e) < ((3.0F + e.field_70130_N / 2.0F) * (3.0F + e.field_70130_N / 2.0F))) {
/*  839 */             func_70652_k((Entity)e);
/*  840 */           } else if (func_70068_e((Entity)e) < 64.0D && !func_70090_H() && ((
/*  841 */             getSpyroFire() == 1 && this.field_70170_p.field_73012_v.nextInt(10) == 0) || this.field_70170_p.field_73012_v.nextInt(15) == 1)) {
/*      */             
/*  843 */             EntitySmallFireball var2 = new EntitySmallFireball(this.field_70170_p, (EntityLivingBase)this, e.field_70165_t - this.field_70165_t, e.field_70163_u + 0.25D - this.field_70163_u + 1.25D, e.field_70161_v - this.field_70161_v);
/*  844 */             var2.func_70012_b(this.field_70165_t, this.field_70163_u + 1.25D, this.field_70161_v, this.field_70177_z, this.field_70125_A);
/*  845 */             this.field_70170_p.func_72956_a((Entity)this, "random.bow", 0.75F, 1.0F / (func_70681_au().nextFloat() * 0.4F + 0.8F));
/*  846 */             this.field_70170_p.func_72838_d((Entity)var2);
/*      */           } 
/*      */         } 
/*      */       } else {
/*      */         
/*  851 */         this.target_in_sight = false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  856 */     if (this.currentFlightTarget.func_71569_e((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 2.1F && 
/*  857 */       getActivity() != 3) do_new = 1;
/*      */ 
/*      */ 
/*      */     
/*  861 */     if (do_new != 0 && !this.target_in_sight) {
/*      */       
/*  863 */       Block bid = Blocks.field_150348_b;
/*  864 */       while (bid != Blocks.field_150350_a && keep_trying != 0) {
/*  865 */         int gox = (int)this.field_70165_t;
/*  866 */         int goy = (int)this.field_70163_u;
/*  867 */         int goz = (int)this.field_70161_v;
/*  868 */         if (has_owner == 1) {
/*  869 */           gox = (int)ox;
/*  870 */           goy = (int)oy;
/*  871 */           goz = (int)oz;
/*  872 */           if (this.owner_flying == 0) {
/*  873 */             zdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/*  874 */             xdir = this.field_70170_p.field_73012_v.nextInt(4) + 6;
/*      */           } else {
/*  876 */             zdir = this.field_70170_p.field_73012_v.nextInt(6);
/*  877 */             xdir = this.field_70170_p.field_73012_v.nextInt(6);
/*      */           } 
/*      */         } else {
/*  880 */           zdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/*  881 */           xdir = this.field_70170_p.field_73012_v.nextInt(5) + 6;
/*      */         } 
/*  883 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) zdir = -zdir; 
/*  884 */         if (this.field_70170_p.field_73012_v.nextInt(2) == 0) xdir = -xdir; 
/*  885 */         this.currentFlightTarget.func_71571_b(gox + xdir, goy + this.field_70170_p.field_73012_v.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
/*  886 */         bid = this.field_70170_p.func_147439_a(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c);
/*  887 */         if (bid == Blocks.field_150350_a && 
/*  888 */           !canSeeTarget(this.currentFlightTarget.field_71574_a, this.currentFlightTarget.field_71572_b, this.currentFlightTarget.field_71573_c)) {
/*  889 */           bid = Blocks.field_150348_b;
/*      */         }
/*      */         
/*  892 */         keep_trying--;
/*      */       } 
/*      */     } 
/*      */     
/*  896 */     double speed_factor = 0.5D;
/*  897 */     double var1 = this.currentFlightTarget.field_71574_a + 0.5D - this.field_70165_t;
/*  898 */     double var3 = this.currentFlightTarget.field_71572_b + 0.1D - this.field_70163_u;
/*  899 */     double var5 = this.currentFlightTarget.field_71573_c + 0.5D - this.field_70161_v;
/*  900 */     if (this.owner_flying != 0) {
/*  901 */       speed_factor = 1.75D;
/*  902 */       if (func_70909_n() && func_70902_q() != null) {
/*  903 */         e = func_70902_q();
/*  904 */         if (func_70068_e((Entity)e) > 49.0D) {
/*  905 */           speed_factor = 3.5D;
/*      */         }
/*      */       } 
/*      */     } 
/*  909 */     this.field_70159_w += (Math.signum(var1) * 0.5D - this.field_70159_w) * 0.15D * speed_factor;
/*  910 */     this.field_70181_x += (Math.signum(var3) * 0.7D - this.field_70181_x) * 0.21D * speed_factor;
/*  911 */     this.field_70179_y += (Math.signum(var5) * 0.5D - this.field_70179_y) * 0.15D * speed_factor;
/*  912 */     float var7 = (float)(Math.atan2(this.field_70179_y, this.field_70159_w) * 180.0D / Math.PI) - 90.0F;
/*  913 */     float var8 = MathHelper.func_76142_g(var7 - this.field_70177_z);
/*  914 */     this.field_70701_bs = (float)(0.75D * speed_factor);
/*      */     
/*  916 */     this.field_70177_z += var8 / 3.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/*  924 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false;
/*      */     
/*  926 */     if (par1EntityLiving == null)
/*      */     {
/*  928 */       return false;
/*      */     }
/*  930 */     if (par1EntityLiving == this)
/*      */     {
/*  932 */       return false;
/*      */     }
/*  934 */     if (!par1EntityLiving.func_70089_S())
/*      */     {
/*  936 */       return false;
/*      */     }
/*  938 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*      */     {
/*      */       
/*  941 */       return false;
/*      */     }
/*  943 */     if (par1EntityLiving instanceof Spyro)
/*      */     {
/*  945 */       return false;
/*      */     }
/*      */     
/*  948 */     if (par1EntityLiving instanceof Mothra)
/*      */     {
/*  950 */       return true;
/*      */     }
/*      */     
/*  953 */     if (par1EntityLiving instanceof EntityMob)
/*      */     {
/*  955 */       return true;
/*      */     }
/*      */     
/*  958 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private EntityLivingBase findSomethingToAttack() {
/*  963 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/*  964 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(12.0D, 6.0D, 12.0D));
/*  965 */     Collections.sort(var5, this.TargetSorter);
/*  966 */     Iterator<?> var2 = var5.iterator();
/*  967 */     Entity var3 = null;
/*  968 */     EntityLivingBase var4 = null;
/*      */     
/*  970 */     while (var2.hasNext()) {
/*      */       
/*  972 */       var3 = (Entity)var2.next();
/*  973 */       var4 = (EntityLivingBase)var3;
/*      */       
/*  975 */       if (isSuitableTarget(var4, false) && canSeeTarget(var4.field_70165_t, var4.field_70163_u, var4.field_70161_v))
/*      */       {
/*  977 */         return var4;
/*      */       }
/*      */     } 
/*  980 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/*  989 */     Entity var8 = null;
/*      */ 
/*      */     
/*  992 */     var8 = EntityList.func_75620_a(par1, par0World);
/*      */     
/*  994 */     if (var8 != null) {
/*      */ 
/*      */       
/*  997 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*      */ 
/*      */       
/* 1000 */       par0World.func_72838_d(var8);
/*      */       
/* 1002 */       ((EntityLiving)var8).func_70642_aH();
/*      */     } 
/*      */     
/* 1005 */     return var8;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Spyro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */