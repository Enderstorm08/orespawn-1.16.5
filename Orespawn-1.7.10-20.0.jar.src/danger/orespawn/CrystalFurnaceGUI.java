/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.client.resources.I18n;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class CrystalFurnaceGUI
/*    */   extends GuiContainer
/*    */ {
/* 15 */   private static final ResourceLocation furnaceGuiTextures = new ResourceLocation("textures/gui/container/furnace.png");
/*    */   
/*    */   private TileEntityCrystalFurnace furnaceInventory;
/*    */   
/*    */   public CrystalFurnaceGUI(InventoryPlayer par1InventoryPlayer, TileEntityCrystalFurnace par2TileEntityCrystalFurnace) {
/* 20 */     super(new ContainerCrystalFurnace(par1InventoryPlayer, par2TileEntityCrystalFurnace));
/* 21 */     this.furnaceInventory = par2TileEntityCrystalFurnace;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_146979_b(int par1, int par2) {
/* 29 */     String s = this.furnaceInventory.func_145818_k_() ? this.furnaceInventory.func_145825_b() : I18n.func_135052_a(this.furnaceInventory.func_145825_b(), new Object[0]);
/* 30 */     this.field_146289_q.func_78276_b(s, this.field_146999_f / 2 - this.field_146289_q.func_78256_a(s) / 2, 6, 4210752);
/* 31 */     this.field_146289_q.func_78276_b(I18n.func_135052_a("container.inventory", new Object[0]), 8, this.field_147000_g - 96 + 2, 4210752);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_146976_a(float par1, int par2, int par3) {
/* 39 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 40 */     this.field_146297_k.func_110434_K().func_110577_a(furnaceGuiTextures);
/* 41 */     int k = (this.field_146294_l - this.field_146999_f) / 2;
/* 42 */     int l = (this.field_146295_m - this.field_147000_g) / 2;
/* 43 */     func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */ 
/*    */     
/* 46 */     if (this.furnaceInventory.isBurning()) {
/*    */       
/* 48 */       int i = this.furnaceInventory.getBurnTimeRemainingScaled(12);
/* 49 */       func_73729_b(k + 56, l + 36 + 12 - i, 176, 12 - i, 14, i + 2);
/*    */     } 
/*    */     
/* 52 */     int i1 = this.furnaceInventory.getCookProgressScaled(24);
/* 53 */     func_73729_b(k + 79, l + 34, 176, 14, i1 + 1, 16);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CrystalFurnaceGUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */