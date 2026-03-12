/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.InventoryPlayer;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.InventoryCraftResult;
/*     */ import net.minecraft.inventory.InventoryCrafting;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.inventory.SlotCrafting;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.CraftingManager;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class ContainerCrystalWorkbench
/*     */   extends Container
/*     */ {
/*  19 */   public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
/*  20 */   public IInventory craftResult = (IInventory)new InventoryCraftResult();
/*     */   
/*     */   private World worldObj;
/*     */   private int posX;
/*     */   private int posY;
/*     */   private int posZ;
/*     */   
/*     */   public ContainerCrystalWorkbench(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
/*  28 */     this.worldObj = par2World;
/*  29 */     this.posX = par3;
/*  30 */     this.posY = par4;
/*  31 */     this.posZ = par5;
/*  32 */     func_75146_a((Slot)new SlotCrafting(par1InventoryPlayer.field_70458_d, (IInventory)this.craftMatrix, this.craftResult, 0, 124, 35));
/*     */     
/*     */     int l;
/*     */     
/*  36 */     for (l = 0; l < 3; l++) {
/*     */       
/*  38 */       for (int i1 = 0; i1 < 3; i1++)
/*     */       {
/*  40 */         func_75146_a(new Slot((IInventory)this.craftMatrix, i1 + l * 3, 30 + i1 * 18, 17 + l * 18));
/*     */       }
/*     */     } 
/*     */     
/*  44 */     for (l = 0; l < 3; l++) {
/*     */       
/*  46 */       for (int i1 = 0; i1 < 9; i1++)
/*     */       {
/*  48 */         func_75146_a(new Slot((IInventory)par1InventoryPlayer, i1 + l * 9 + 9, 8 + i1 * 18, 84 + l * 18));
/*     */       }
/*     */     } 
/*     */     
/*  52 */     for (l = 0; l < 9; l++)
/*     */     {
/*  54 */       func_75146_a(new Slot((IInventory)par1InventoryPlayer, l, 8 + l * 18, 142));
/*     */     }
/*     */     
/*  57 */     func_75130_a((IInventory)this.craftMatrix);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75130_a(IInventory par1IInventory) {
/*  65 */     this.craftResult.func_70299_a(0, CraftingManager.func_77594_a().func_82787_a(this.craftMatrix, this.worldObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75134_a(EntityPlayer par1EntityPlayer) {
/*  73 */     super.func_75134_a(par1EntityPlayer);
/*     */     
/*  75 */     if (!this.worldObj.field_72995_K)
/*     */     {
/*  77 */       for (int i = 0; i < 9; i++) {
/*     */         
/*  79 */         ItemStack itemstack = this.craftMatrix.func_70304_b(i);
/*     */         
/*  81 */         if (itemstack != null)
/*     */         {
/*  83 */           par1EntityPlayer.func_71019_a(itemstack, false);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_75145_c(EntityPlayer par1EntityPlayer) {
/*  91 */     return (this.worldObj.func_147439_a(this.posX, this.posY, this.posZ) != OreSpawnMain.CrystalWorkbenchBlock) ? false : ((par1EntityPlayer.func_70092_e(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D) <= 64.0D));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_82846_b(EntityPlayer par1EntityPlayer, int par2) {
/*  99 */     ItemStack itemstack = null;
/* 100 */     Slot slot = this.field_75151_b.get(par2);
/*     */     
/* 102 */     if (slot != null && slot.func_75216_d()) {
/*     */       
/* 104 */       ItemStack itemstack1 = slot.func_75211_c();
/* 105 */       itemstack = itemstack1.func_77946_l();
/*     */       
/* 107 */       if (par2 == 0) {
/*     */         
/* 109 */         if (!func_75135_a(itemstack1, 10, 46, true))
/*     */         {
/* 111 */           return null;
/*     */         }
/*     */         
/* 114 */         slot.func_75220_a(itemstack1, itemstack);
/*     */       }
/* 116 */       else if (par2 >= 10 && par2 < 37) {
/*     */         
/* 118 */         if (!func_75135_a(itemstack1, 37, 46, false))
/*     */         {
/* 120 */           return null;
/*     */         }
/*     */       }
/* 123 */       else if (par2 >= 37 && par2 < 46) {
/*     */         
/* 125 */         if (!func_75135_a(itemstack1, 10, 37, false))
/*     */         {
/* 127 */           return null;
/*     */         }
/*     */       }
/* 130 */       else if (!func_75135_a(itemstack1, 10, 46, false)) {
/*     */         
/* 132 */         return null;
/*     */       } 
/*     */       
/* 135 */       if (itemstack1.field_77994_a == 0) {
/*     */         
/* 137 */         slot.func_75215_d((ItemStack)null);
/*     */       }
/*     */       else {
/*     */         
/* 141 */         slot.func_75218_e();
/*     */       } 
/*     */       
/* 144 */       if (itemstack1.field_77994_a == itemstack.field_77994_a)
/*     */       {
/* 146 */         return null;
/*     */       }
/*     */       
/* 149 */       slot.func_82870_a(par1EntityPlayer, itemstack1);
/*     */     } 
/*     */     
/* 152 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_94530_a(ItemStack par1ItemStack, Slot par2Slot) {
/* 157 */     return (par2Slot.field_75224_c != this.craftResult && super.func_94530_a(par1ItemStack, par2Slot));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ContainerCrystalWorkbench.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */