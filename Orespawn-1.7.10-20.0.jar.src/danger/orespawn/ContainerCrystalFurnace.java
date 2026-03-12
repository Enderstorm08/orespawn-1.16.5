/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.InventoryPlayer;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.ICrafting;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.inventory.SlotFurnace;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.FurnaceRecipes;
/*     */ 
/*     */ public class ContainerCrystalFurnace
/*     */   extends Container {
/*     */   private TileEntityCrystalFurnace furnace;
/*     */   private int lastCookTime;
/*     */   private int lastBurnTime;
/*     */   private int lastItemBurnTime;
/*     */   
/*     */   public ContainerCrystalFurnace(InventoryPlayer par1InventoryPlayer, TileEntityCrystalFurnace par2TileEntityCrystalFurnace) {
/*  23 */     this.furnace = par2TileEntityCrystalFurnace;
/*  24 */     func_75146_a(new Slot((IInventory)par2TileEntityCrystalFurnace, 0, 56, 17));
/*  25 */     func_75146_a(new Slot((IInventory)par2TileEntityCrystalFurnace, 1, 56, 53));
/*  26 */     func_75146_a((Slot)new SlotFurnace(par1InventoryPlayer.field_70458_d, (IInventory)par2TileEntityCrystalFurnace, 2, 116, 35));
/*     */     
/*     */     int i;
/*  29 */     for (i = 0; i < 3; i++) {
/*     */       
/*  31 */       for (int j = 0; j < 9; j++)
/*     */       {
/*  33 */         func_75146_a(new Slot((IInventory)par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  37 */     for (i = 0; i < 9; i++)
/*     */     {
/*  39 */       func_75146_a(new Slot((IInventory)par1InventoryPlayer, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_75132_a(ICrafting par1ICrafting) {
/*  45 */     super.func_75132_a(par1ICrafting);
/*  46 */     par1ICrafting.func_71112_a(this, 0, this.furnace.furnaceCookTime);
/*  47 */     par1ICrafting.func_71112_a(this, 1, this.furnace.furnaceBurnTime);
/*  48 */     par1ICrafting.func_71112_a(this, 2, this.furnace.currentItemBurnTime);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75142_b() {
/*  56 */     super.func_75142_b();
/*     */     
/*  58 */     for (int i = 0; i < this.field_75149_d.size(); i++) {
/*     */       
/*  60 */       ICrafting icrafting = this.field_75149_d.get(i);
/*     */       
/*  62 */       if (this.lastCookTime != this.furnace.furnaceCookTime)
/*     */       {
/*  64 */         icrafting.func_71112_a(this, 0, this.furnace.furnaceCookTime);
/*     */       }
/*     */       
/*  67 */       if (this.lastBurnTime != this.furnace.furnaceBurnTime)
/*     */       {
/*  69 */         icrafting.func_71112_a(this, 1, this.furnace.furnaceBurnTime);
/*     */       }
/*     */       
/*  72 */       if (this.lastItemBurnTime != this.furnace.currentItemBurnTime)
/*     */       {
/*  74 */         icrafting.func_71112_a(this, 2, this.furnace.currentItemBurnTime);
/*     */       }
/*     */     } 
/*     */     
/*  78 */     this.lastCookTime = this.furnace.furnaceCookTime;
/*  79 */     this.lastBurnTime = this.furnace.furnaceBurnTime;
/*  80 */     this.lastItemBurnTime = this.furnace.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_75137_b(int par1, int par2) {
/*  86 */     if (par1 == 0)
/*     */     {
/*  88 */       this.furnace.furnaceCookTime = par2;
/*     */     }
/*     */     
/*  91 */     if (par1 == 1)
/*     */     {
/*  93 */       this.furnace.furnaceBurnTime = par2;
/*     */     }
/*     */     
/*  96 */     if (par1 == 2)
/*     */     {
/*  98 */       this.furnace.currentItemBurnTime = par2;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_75145_c(EntityPlayer par1EntityPlayer) {
/* 104 */     return this.furnace.func_70300_a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_82846_b(EntityPlayer par1EntityPlayer, int par2) {
/* 112 */     ItemStack itemstack = null;
/* 113 */     Slot slot = this.field_75151_b.get(par2);
/*     */     
/* 115 */     if (slot != null && slot.func_75216_d()) {
/*     */       
/* 117 */       ItemStack itemstack1 = slot.func_75211_c();
/* 118 */       itemstack = itemstack1.func_77946_l();
/*     */       
/* 120 */       if (par2 == 2) {
/*     */         
/* 122 */         if (!func_75135_a(itemstack1, 3, 39, true))
/*     */         {
/* 124 */           return null;
/*     */         }
/*     */         
/* 127 */         slot.func_75220_a(itemstack1, itemstack);
/*     */       }
/* 129 */       else if (par2 != 1 && par2 != 0) {
/*     */         
/* 131 */         if (FurnaceRecipes.func_77602_a().func_151395_a(itemstack1) != null)
/*     */         {
/* 133 */           if (!func_75135_a(itemstack1, 0, 1, false))
/*     */           {
/* 135 */             return null;
/*     */           }
/*     */         }
/* 138 */         else if (TileEntityCrystalFurnace.isItemFuel(itemstack1))
/*     */         {
/* 140 */           if (!func_75135_a(itemstack1, 1, 2, false))
/*     */           {
/* 142 */             return null;
/*     */           }
/*     */         }
/* 145 */         else if (par2 >= 3 && par2 < 30)
/*     */         {
/* 147 */           if (!func_75135_a(itemstack1, 30, 39, false))
/*     */           {
/* 149 */             return null;
/*     */           }
/*     */         }
/* 152 */         else if (par2 >= 30 && par2 < 39 && !func_75135_a(itemstack1, 3, 30, false))
/*     */         {
/* 154 */           return null;
/*     */         }
/*     */       
/* 157 */       } else if (!func_75135_a(itemstack1, 3, 39, false)) {
/*     */         
/* 159 */         return null;
/*     */       } 
/*     */       
/* 162 */       if (itemstack1.field_77994_a == 0) {
/*     */         
/* 164 */         slot.func_75215_d((ItemStack)null);
/*     */       }
/*     */       else {
/*     */         
/* 168 */         slot.func_75218_e();
/*     */       } 
/*     */       
/* 171 */       if (itemstack1.field_77994_a == itemstack.field_77994_a)
/*     */       {
/* 173 */         return null;
/*     */       }
/*     */       
/* 176 */       slot.func_82870_a(par1EntityPlayer, itemstack1);
/*     */     } 
/*     */     
/* 179 */     return itemstack;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ContainerCrystalFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */