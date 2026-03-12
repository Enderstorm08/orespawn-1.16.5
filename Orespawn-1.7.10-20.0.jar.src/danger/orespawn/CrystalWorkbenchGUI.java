/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.client.resources.I18n;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraft.world.World;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class CrystalWorkbenchGUI
/*    */   extends GuiContainer
/*    */ {
/* 16 */   private static final ResourceLocation craftingTableGuiTextures = new ResourceLocation("textures/gui/container/crafting_table.png");
/*    */ 
/*    */   
/*    */   public CrystalWorkbenchGUI(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
/* 20 */     super(new ContainerCrystalWorkbench(par1InventoryPlayer, par2World, par3, par4, par5));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_146979_b(int par1, int par2) {
/* 28 */     this.field_146289_q.func_78276_b(I18n.func_135052_a("container.crafting", new Object[0]), 28, 6, 4210752);
/* 29 */     this.field_146289_q.func_78276_b(I18n.func_135052_a("container.inventory", new Object[0]), 8, this.field_147000_g - 96 + 2, 4210752);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_146976_a(float par1, int par2, int par3) {
/* 37 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 38 */     this.field_146297_k.func_110434_K().func_110577_a(craftingTableGuiTextures);
/* 39 */     int k = (this.field_146294_l - this.field_146999_f) / 2;
/* 40 */     int l = (this.field_146295_m - this.field_147000_g) / 2;
/* 41 */     func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CrystalWorkbenchGUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */