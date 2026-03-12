/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMoveIndoors;
/*     */ import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
/*     */ import net.minecraft.entity.ai.EntityAIOpenDoor;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.passive.EntityVillager;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraft.tileentity.TileEntityMobSpawner;
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
/*     */ public class BandP
/*     */   extends EntityMob
/*     */ {
/*  54 */   private GenericTargetSorter TargetSorter = null;
/*  55 */   private float moveSpeed = 0.32F;
/*  56 */   private int whatset = 0;
/*  57 */   private int whatami = 0;
/*  58 */   public ItemStack[] MymainInventory = new ItemStack[100];
/*  59 */   int got_stuff = 0;
/*     */ 
/*     */   
/*     */   public BandP(World par1World) {
/*  63 */     super(par1World);
/*  64 */     func_70105_a(0.75F, 1.75F);
/*  65 */     func_70661_as().func_75491_a(true);
/*  66 */     this.field_70728_aV = 1000;
/*  67 */     this.field_70174_ab = 2;
/*  68 */     this.TargetSorter = new GenericTargetSorter((Entity)this);
/*     */     
/*  70 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.5D, false));
/*  71 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 0.5D));
/*  72 */     this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
/*  73 */     this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  74 */     this.field_70714_bg.func_75776_a(4, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
/*  75 */     this.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  81 */     super.func_110147_ax();
/*  82 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  83 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  84 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(OreSpawnMain.BandP_stats.attack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70088_a() {
/*  90 */     super.func_70088_a();
/*  91 */     this.field_70180_af.func_75682_a(20, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  96 */     if (func_104002_bU()) return false; 
/*  97 */     if (this.got_stuff != 0) return false; 
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 106 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 107 */     super.func_70071_h_();
/* 108 */     if (!this.field_70170_p.field_72995_K && 
/* 109 */       this.whatset == 0) {
/* 110 */       this.whatset = 1;
/* 111 */       this.whatami = this.field_70170_p.field_73012_v.nextInt(2);
/* 112 */       setWhat(this.whatami);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 119 */     return OreSpawnMain.BandP_stats.health;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70658_aO() {
/* 127 */     return OreSpawnMain.BandP_stats.defense;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70650_aV() {
/* 135 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70636_d() {
/* 144 */     super.func_70636_d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 153 */     return "mob.villager.idle";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 161 */     return "mob.villager.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 169 */     return "mob.villager.death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 176 */     return 1.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70647_i() {
/* 183 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Item func_146068_u() {
/* 191 */     return Items.field_151166_bC;
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(Item index, int par1) {
/* 196 */     EntityItem var3 = null;
/* 197 */     if (index == null) return null; 
/* 198 */     ItemStack is = new ItemStack(index, par1, 0);
/*     */     
/* 200 */     var3 = new EntityItem(this.field_70170_p, this.field_70165_t + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.field_70163_u + 1.0D, this.field_70161_v + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
/*     */     
/* 202 */     if (var3 != null) this.field_70170_p.func_72838_d((Entity)var3); 
/* 203 */     return is;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {
/* 211 */     int var4 = 10 + this.field_70170_p.field_73012_v.nextInt(5); int i;
/* 212 */     for (i = 0; i < var4; i++) {
/* 213 */       dropItemRand(Items.field_151166_bC, 1);
/*     */     }
/*     */     
/* 216 */     if (getWhat() == 0) {
/* 217 */       var4 = 2 + this.field_70170_p.field_73012_v.nextInt(3);
/* 218 */       for (i = 0; i < var4; i++) {
/* 219 */         dropItemRand(OreSpawnMain.UraniumNugget, 1);
/* 220 */         dropItemRand(OreSpawnMain.TitaniumNugget, 1);
/*     */       } 
/*     */     } 
/* 223 */     for (i = 0; i < this.MymainInventory.length; i++) {
/* 224 */       if (this.MymainInventory[i] != null && 
/* 225 */         (this.MymainInventory[i]).field_77994_a != 0) {
/* 226 */         ItemStack is = dropItemRand(this.MymainInventory[i].func_77973_b(), (this.MymainInventory[i]).field_77994_a);
/* 227 */         if ((this.MymainInventory[i]).field_77994_a == 1) is.func_77964_b(this.MymainInventory[i].func_77960_j());
/*     */       
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
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 240 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/* 247 */     return super.func_70652_k(par1Entity);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70619_bc() {
/* 253 */     if (this.field_70128_L)
/* 254 */       return;  super.func_70619_bc();
/* 255 */     if (this.field_70170_p.field_73012_v.nextInt(12) == 1) {
/* 256 */       EntityLivingBase e = findSomethingToAttack();
/* 257 */       if (e != null) {
/* 258 */         func_70625_a((Entity)e, 10.0F, 10.0F);
/* 259 */         if (func_70068_e((Entity)e) < 9.0D) {
/*     */           
/* 261 */           func_70652_k((Entity)e);
/* 262 */           if (e instanceof EntityPlayer) {
/* 263 */             EntityPlayer p = (EntityPlayer)e;
/*     */ 
/*     */             
/* 266 */             int k = -1;
/* 267 */             int kp = -1; int i;
/* 268 */             for (i = 0; i < this.MymainInventory.length; i++) {
/* 269 */               if (this.MymainInventory[i] == null) {
/* 270 */                 k = i;
/*     */                 break;
/*     */               } 
/*     */             } 
/* 274 */             if (k >= 0) {
/* 275 */               for (i = p.field_71071_by.field_70460_b.length - 1; i >= 0; i--) {
/* 276 */                 if (p.field_71071_by.field_70460_b[i] != null) {
/* 277 */                   kp = i;
/*     */                   break;
/*     */                 } 
/*     */               } 
/* 281 */               if (kp >= 0) {
/* 282 */                 this.MymainInventory[k] = p.field_71071_by.field_70460_b[kp];
/* 283 */                 p.field_71071_by.field_70460_b[kp] = null;
/* 284 */                 this.got_stuff++;
/*     */               } 
/* 286 */               if (kp < 0) {
/* 287 */                 for (i = p.field_71071_by.field_70462_a.length - 1; i >= 0; i--) {
/* 288 */                   if (p.field_71071_by.field_70462_a[i] != null) {
/* 289 */                     kp = i;
/*     */                     break;
/*     */                   } 
/*     */                 } 
/* 293 */                 if (kp >= 0) {
/* 294 */                   this.MymainInventory[k] = p.field_71071_by.field_70462_a[kp];
/* 295 */                   p.field_71071_by.field_70462_a[kp] = null;
/* 296 */                   this.got_stuff++;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } else {
/* 302 */           func_70661_as().func_75497_a((Entity)e, 1.25D);
/*     */         } 
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
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
/* 318 */     if (par1EntityLiving == null)
/*     */     {
/* 320 */       return false;
/*     */     }
/* 322 */     if (par1EntityLiving == this)
/*     */     {
/* 324 */       return false;
/*     */     }
/* 326 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 328 */       return false;
/*     */     }
/* 330 */     if (!func_70635_at().func_75522_a((Entity)par1EntityLiving))
/*     */     {
/*     */       
/* 333 */       return false;
/*     */     }
/*     */     
/* 336 */     if (par1EntityLiving instanceof EntityPlayer) {
/*     */       
/* 338 */       EntityPlayer p = (EntityPlayer)par1EntityLiving;
/* 339 */       if (p.field_71075_bZ.field_75098_d == true) {
/* 340 */         return false;
/*     */       }
/* 342 */       return true;
/*     */     } 
/* 344 */     if (par1EntityLiving instanceof EntityVillager)
/*     */     {
/* 346 */       return true;
/*     */     }
/* 348 */     if (par1EntityLiving instanceof Girlfriend)
/*     */     {
/* 350 */       return true;
/*     */     }
/* 352 */     if (par1EntityLiving instanceof Boyfriend)
/*     */     {
/* 354 */       return true;
/*     */     }
/*     */     
/* 357 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private EntityLivingBase findSomethingToAttack() {
/* 362 */     if (OreSpawnMain.PlayNicely != 0) return null; 
/* 363 */     List<?> var5 = this.field_70170_p.func_72872_a(EntityLivingBase.class, this.field_70121_D.func_72314_b(20.0D, 6.0D, 20.0D));
/* 364 */     Collections.sort(var5, this.TargetSorter);
/* 365 */     Iterator<?> var2 = var5.iterator();
/* 366 */     Entity var3 = null;
/* 367 */     EntityLivingBase var4 = null;
/*     */     
/* 369 */     while (var2.hasNext()) {
/*     */       
/* 371 */       var3 = (Entity)var2.next();
/* 372 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 374 */       if (isSuitableTarget(var4, false))
/*     */       {
/* 376 */         return var4;
/*     */       }
/*     */     } 
/* 379 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getWhat() {
/* 384 */     return this.field_70180_af.func_75683_a(20);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWhat(int par1) {
/* 389 */     this.field_70180_af.func_75692_b(20, Byte.valueOf((byte)par1));
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
/* 401 */     for (int k = -3; k < 3; k++) {
/*     */       
/* 403 */       for (int j = -3; j < 3; j++) {
/*     */         
/* 405 */         for (int i = 0; i < 5; i++) {
/*     */           
/* 407 */           Block bid = this.field_70170_p.func_147439_a((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 408 */           if (bid == Blocks.field_150474_ac) {
/* 409 */             TileEntityMobSpawner tileentitymobspawner = null;
/* 410 */             tileentitymobspawner = (TileEntityMobSpawner)this.field_70170_p.func_147438_o((int)this.field_70165_t + j, (int)this.field_70163_u + i, (int)this.field_70161_v + k);
/* 411 */             String s = tileentitymobspawner.func_145881_a().func_98276_e();
/* 412 */             if (s != null && 
/* 413 */               s.equals("Criminal")) return true;
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 419 */     if (!this.field_70170_p.func_72935_r()) return false; 
/* 420 */     if (this.field_70163_u < 50.0D) return false; 
/* 421 */     if (this.field_70163_u < 100.0D) return false; 
/* 422 */     BandP target = null;
/* 423 */     target = (BandP)this.field_70170_p.func_72857_a(BandP.class, this.field_70121_D.func_72314_b(32.0D, 12.0D, 32.0D), (Entity)this);
/* 424 */     if (target != null)
/*     */     {
/* 426 */       return false;
/*     */     }
/* 428 */     EntityVillager target2 = null;
/* 429 */     target2 = (EntityVillager)this.field_70170_p.func_72857_a(EntityVillager.class, this.field_70121_D.func_72314_b(36.0D, 12.0D, 36.0D), (Entity)this);
/* 430 */     if (target2 == null)
/*     */     {
/* 432 */       return false;
/*     */     }
/* 434 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
/* 442 */     super.func_70014_b(par1NBTTagCompound);
/* 443 */     if (this.got_stuff != 0) {
/* 444 */       par1NBTTagCompound.func_74782_a("Inventory", (NBTBase)writeToNBT(new NBTTagList()));
/*     */     }
/* 446 */     par1NBTTagCompound.func_74768_a("GotStuff", this.got_stuff);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
/* 454 */     super.func_70037_a(par1NBTTagCompound);
/* 455 */     this.got_stuff = par1NBTTagCompound.func_74762_e("GotStuff");
/* 456 */     if (this.got_stuff != 0) {
/* 457 */       NBTTagList nbttaglist = par1NBTTagCompound.func_150295_c("Inventory", 10);
/* 458 */       readFromNBT(nbttaglist);
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
/*     */   
/*     */   public NBTTagList writeToNBT(NBTTagList par1NBTTagList) {
/* 472 */     for (int i = 0; i < this.MymainInventory.length; i++) {
/*     */       
/* 474 */       if (this.MymainInventory[i] != null) {
/*     */         
/* 476 */         NBTTagCompound nbttagcompound = new NBTTagCompound();
/* 477 */         nbttagcompound.func_74774_a("Slot", (byte)i);
/* 478 */         this.MymainInventory[i].func_77955_b(nbttagcompound);
/* 479 */         par1NBTTagList.func_74742_a((NBTBase)nbttagcompound);
/*     */       } 
/*     */     } 
/*     */     
/* 483 */     return par1NBTTagList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void readFromNBT(NBTTagList par1NBTTagList) {
/* 491 */     this.MymainInventory = new ItemStack[100];
/*     */     
/* 493 */     for (int i = 0; i < par1NBTTagList.func_74745_c(); i++) {
/*     */       
/* 495 */       NBTTagCompound nbttagcompound = par1NBTTagList.func_150305_b(i);
/* 496 */       int j = nbttagcompound.func_74771_c("Slot") & 0xFF;
/* 497 */       ItemStack itemstack = ItemStack.func_77949_a(nbttagcompound);
/* 498 */       if (itemstack != null)
/*     */       {
/* 500 */         if (j >= 0 && j < this.MymainInventory.length)
/*     */         {
/* 502 */           this.MymainInventory[j] = itemstack;
/*     */         }
/*     */       }
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BandP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */