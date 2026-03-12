/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.inventory.ISidedInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemHoe;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.ItemSword;
/*     */ import net.minecraft.item.ItemTool;
/*     */ import net.minecraft.item.crafting.FurnaceRecipes;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ 
/*     */ public class TileEntityCrystalFurnace
/*     */   extends TileEntity
/*     */   implements ISidedInventory {
/*  26 */   private static final int[] slots_top = new int[] { 0 };
/*  27 */   private static final int[] slots_bottom = new int[] { 2, 1 };
/*  28 */   private static final int[] slots_sides = new int[] { 1 };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  33 */   private ItemStack[] furnaceItemStacks = new ItemStack[3];
/*     */ 
/*     */ 
/*     */   
/*     */   public int furnaceBurnTime;
/*     */ 
/*     */ 
/*     */   
/*     */   public int currentItemBurnTime;
/*     */ 
/*     */   
/*     */   public int furnaceCookTime;
/*     */ 
/*     */   
/*     */   private String field_94130_e;
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70302_i_() {
/*  52 */     return this.furnaceItemStacks.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_70301_a(int par1) {
/*  60 */     return this.furnaceItemStacks[par1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_70298_a(int par1, int par2) {
/*  69 */     if (this.furnaceItemStacks[par1] != null) {
/*     */ 
/*     */ 
/*     */       
/*  73 */       if ((this.furnaceItemStacks[par1]).field_77994_a <= par2) {
/*     */         
/*  75 */         ItemStack itemStack = this.furnaceItemStacks[par1];
/*  76 */         this.furnaceItemStacks[par1] = null;
/*  77 */         return itemStack;
/*     */       } 
/*     */ 
/*     */       
/*  81 */       ItemStack itemstack = this.furnaceItemStacks[par1].func_77979_a(par2);
/*     */       
/*  83 */       if ((this.furnaceItemStacks[par1]).field_77994_a == 0)
/*     */       {
/*  85 */         this.furnaceItemStacks[par1] = null;
/*     */       }
/*     */       
/*  88 */       return itemstack;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  93 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_70304_b(int par1) {
/* 103 */     if (this.furnaceItemStacks[par1] != null) {
/*     */       
/* 105 */       ItemStack itemstack = this.furnaceItemStacks[par1];
/* 106 */       this.furnaceItemStacks[par1] = null;
/* 107 */       return itemstack;
/*     */     } 
/*     */ 
/*     */     
/* 111 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70299_a(int par1, ItemStack par2ItemStack) {
/* 120 */     this.furnaceItemStacks[par1] = par2ItemStack;
/*     */     
/* 122 */     if (par2ItemStack != null && par2ItemStack.field_77994_a > func_70297_j_())
/*     */     {
/* 124 */       par2ItemStack.field_77994_a = func_70297_j_();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String func_145825_b() {
/* 133 */     return func_145818_k_() ? this.field_94130_e : "container.furnace";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_145818_k_() {
/* 141 */     return (this.field_94130_e != null && this.field_94130_e.length() > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145951_a(String par1Str) {
/* 150 */     this.field_94130_e = par1Str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145839_a(NBTTagCompound par1NBTTagCompound) {
/* 158 */     super.func_145839_a(par1NBTTagCompound);
/* 159 */     NBTTagList nbttaglist = par1NBTTagCompound.func_150295_c("Items", 10);
/* 160 */     this.furnaceItemStacks = new ItemStack[func_70302_i_()];
/*     */     
/* 162 */     for (int i = 0; i < nbttaglist.func_74745_c(); i++) {
/*     */       
/* 164 */       NBTTagCompound nbttagcompound1 = nbttaglist.func_150305_b(i);
/* 165 */       byte b0 = nbttagcompound1.func_74771_c("Slot");
/*     */       
/* 167 */       if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
/*     */       {
/* 169 */         this.furnaceItemStacks[b0] = ItemStack.func_77949_a(nbttagcompound1);
/*     */       }
/*     */     } 
/*     */     
/* 173 */     this.furnaceBurnTime = par1NBTTagCompound.func_74765_d("BurnTime");
/* 174 */     this.furnaceCookTime = par1NBTTagCompound.func_74765_d("CookTime");
/* 175 */     this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */     
/* 177 */     if (par1NBTTagCompound.func_74764_b("CustomName"))
/*     */     {
/* 179 */       this.field_94130_e = par1NBTTagCompound.func_74779_i("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145841_b(NBTTagCompound par1NBTTagCompound) {
/* 188 */     super.func_145841_b(par1NBTTagCompound);
/* 189 */     par1NBTTagCompound.func_74777_a("BurnTime", (short)this.furnaceBurnTime);
/* 190 */     par1NBTTagCompound.func_74777_a("CookTime", (short)this.furnaceCookTime);
/* 191 */     NBTTagList nbttaglist = new NBTTagList();
/*     */     
/* 193 */     for (int i = 0; i < this.furnaceItemStacks.length; i++) {
/*     */       
/* 195 */       if (this.furnaceItemStacks[i] != null) {
/*     */         
/* 197 */         NBTTagCompound nbttagcompound1 = new NBTTagCompound();
/* 198 */         nbttagcompound1.func_74774_a("Slot", (byte)i);
/* 199 */         this.furnaceItemStacks[i].func_77955_b(nbttagcompound1);
/* 200 */         nbttaglist.func_74742_a((NBTBase)nbttagcompound1);
/*     */       } 
/*     */     } 
/*     */     
/* 204 */     par1NBTTagCompound.func_74782_a("Items", (NBTBase)nbttaglist);
/*     */     
/* 206 */     if (func_145818_k_())
/*     */     {
/* 208 */       par1NBTTagCompound.func_74778_a("CustomName", this.field_94130_e);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70297_j_() {
/* 218 */     return 64;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getCookProgressScaled(int par1) {
/* 229 */     return this.furnaceCookTime * par1 / 150;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getBurnTimeRemainingScaled(int par1) {
/* 240 */     if (this.currentItemBurnTime == 0)
/*     */     {
/* 242 */       this.currentItemBurnTime = 150;
/*     */     }
/*     */     
/* 245 */     return this.furnaceBurnTime * par1 / this.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBurning() {
/* 253 */     return (this.furnaceBurnTime > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145845_h() {
/* 262 */     boolean flag = (this.furnaceBurnTime > 0);
/* 263 */     boolean flag1 = false;
/*     */     
/* 265 */     if (this.furnaceBurnTime > 0)
/*     */     {
/* 267 */       this.furnaceBurnTime--;
/*     */     }
/*     */     
/* 270 */     if (!this.field_145850_b.field_72995_K) {
/*     */       
/* 272 */       if (this.furnaceBurnTime == 0 && canSmelt()) {
/*     */         
/* 274 */         this.currentItemBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */         
/* 276 */         if (this.furnaceBurnTime > 0) {
/*     */           
/* 278 */           flag1 = true;
/*     */           
/* 280 */           if (this.furnaceItemStacks[1] != null) {
/*     */             
/* 282 */             (this.furnaceItemStacks[1]).field_77994_a--;
/*     */             
/* 284 */             if ((this.furnaceItemStacks[1]).field_77994_a == 0)
/*     */             {
/* 286 */               this.furnaceItemStacks[1] = this.furnaceItemStacks[1].func_77973_b().getContainerItem(this.furnaceItemStacks[1]);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 292 */       if (isBurning() && canSmelt()) {
/*     */         
/* 294 */         this.furnaceCookTime++;
/*     */         
/* 296 */         if (this.furnaceCookTime == 150)
/*     */         {
/* 298 */           this.furnaceCookTime = 0;
/* 299 */           smeltItem();
/* 300 */           flag1 = true;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 305 */         this.furnaceCookTime = 0;
/*     */       } 
/*     */       
/* 308 */       if (flag != ((this.furnaceBurnTime > 0))) {
/*     */         
/* 310 */         flag1 = true;
/* 311 */         CrystalFurnace.updateFurnaceBlockState((this.furnaceBurnTime > 0), this.field_145850_b, this.field_145851_c, this.field_145848_d, this.field_145849_e);
/*     */       } 
/*     */     } 
/*     */     
/* 315 */     if (flag1)
/*     */     {
/* 317 */       func_70296_d();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmelt() {
/* 326 */     if (this.furnaceItemStacks[0] == null)
/*     */     {
/* 328 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 332 */     ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.furnaceItemStacks[0]);
/* 333 */     if (itemstack == null) return false; 
/* 334 */     if (this.furnaceItemStacks[2] == null) return true; 
/* 335 */     if (!this.furnaceItemStacks[2].func_77969_a(itemstack)) return false; 
/* 336 */     int result = (this.furnaceItemStacks[2]).field_77994_a + itemstack.field_77994_a;
/* 337 */     return (result <= func_70297_j_() && result <= itemstack.func_77976_d());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smeltItem() {
/* 346 */     if (canSmelt()) {
/*     */       
/* 348 */       ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.furnaceItemStacks[0]);
/*     */       
/* 350 */       if (this.furnaceItemStacks[2] == null) {
/*     */         
/* 352 */         this.furnaceItemStacks[2] = itemstack.func_77946_l();
/*     */       }
/* 354 */       else if (this.furnaceItemStacks[2].func_77969_a(itemstack)) {
/*     */         
/* 356 */         (this.furnaceItemStacks[2]).field_77994_a += itemstack.field_77994_a;
/*     */       } 
/*     */       
/* 359 */       (this.furnaceItemStacks[0]).field_77994_a--;
/*     */       
/* 361 */       if ((this.furnaceItemStacks[0]).field_77994_a <= 0)
/*     */       {
/* 363 */         this.furnaceItemStacks[0] = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getItemBurnTime(ItemStack par0ItemStack) {
/* 374 */     if (par0ItemStack == null)
/*     */     {
/* 376 */       return 0;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 381 */     Item item = par0ItemStack.func_77973_b();
/*     */     
/* 383 */     if (item instanceof net.minecraft.item.ItemBlock && Block.func_149634_a(item) != Blocks.field_150350_a) {
/*     */       
/* 385 */       Block block = Block.func_149634_a(item);
/*     */       
/* 387 */       if (block == Blocks.field_150376_bx)
/*     */       {
/* 389 */         return 150;
/*     */       }
/*     */       
/* 392 */       if (block.func_149688_o() == Material.field_151575_d)
/*     */       {
/* 394 */         return 300;
/*     */       }
/*     */       
/* 397 */       if (block == Blocks.field_150402_ci)
/*     */       {
/* 399 */         return 16000;
/*     */       }
/*     */     } 
/*     */     
/* 403 */     if (item instanceof ItemTool && ((ItemTool)item).func_77861_e().equals("WOOD")) return 200; 
/* 404 */     if (item instanceof ItemSword && ((ItemSword)item).func_150932_j().equals("WOOD")) return 200; 
/* 405 */     if (item instanceof ItemHoe && ((ItemHoe)item).func_77842_f().equals("WOOD")) return 200; 
/* 406 */     if (item == Items.field_151055_y) return 100; 
/* 407 */     if (item == Items.field_151044_h) return 1600; 
/* 408 */     if (item == Items.field_151129_at) return 20000; 
/* 409 */     if (item == Item.func_150898_a(Blocks.field_150345_g)) return 100; 
/* 410 */     if (item == Items.field_151072_bj) return 2400; 
/* 411 */     if (item == Item.func_150898_a(OreSpawnMain.CrystalCoal)) return 20000; 
/* 412 */     if (item == Item.func_150898_a(OreSpawnMain.MyCrystalTreeLog)) return 800; 
/* 413 */     if (item == Item.func_150898_a(OreSpawnMain.CrystalPlanksBlock)) return 400; 
/* 414 */     return GameRegistry.getFuelValue(par0ItemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isItemFuel(ItemStack par0ItemStack) {
/* 423 */     return (getItemBurnTime(par0ItemStack) > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70300_a(EntityPlayer par1EntityPlayer) {
/* 431 */     return (this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) != this) ? false : ((par1EntityPlayer.func_70092_e(this.field_145851_c + 0.5D, this.field_145848_d + 0.5D, this.field_145849_e + 0.5D) <= 64.0D));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void openChest() {}
/*     */ 
/*     */   
/*     */   public void closeChest() {}
/*     */ 
/*     */   
/*     */   public boolean func_94041_b(int par1, ItemStack par2ItemStack) {
/* 443 */     return (par1 == 2) ? false : ((par1 == 1) ? isItemFuel(par2ItemStack) : true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] func_94128_d(int par1) {
/* 452 */     return (par1 == 0) ? slots_bottom : ((par1 == 1) ? slots_top : slots_sides);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_102007_a(int par1, ItemStack par2ItemStack, int par3) {
/* 461 */     return func_94041_b(par1, par2ItemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_102008_b(int par1, ItemStack par2ItemStack, int par3) {
/* 470 */     return (par3 != 0 || par1 != 1 || par2ItemStack.func_77973_b() == Items.field_151133_ar);
/*     */   }
/*     */   
/*     */   public void func_70295_k_() {}
/*     */   
/*     */   public void func_70305_f() {}
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\TileEntityCrystalFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */