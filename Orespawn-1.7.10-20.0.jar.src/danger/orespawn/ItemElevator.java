/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityList;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemElevator
/*    */   extends Item
/*    */ {
/*    */   public ItemElevator(int par1) {
/* 27 */     this.field_77777_bU = 1;
/* 28 */     func_77637_a(CreativeTabs.field_78029_e);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 33 */     if (par3World.field_72995_K) return true;
/*    */ 
/*    */     
/* 36 */     Elevator elevator = (Elevator)EntityList.func_75620_a("Hoverboard", par3World);
/* 37 */     elevator.func_70012_b((par4 + 0.5F), (par5 + 1.2F), (par6 + 0.5F), par3World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/* 38 */     par3World.func_72838_d((Entity)elevator);
/*    */     
/* 40 */     if (!par2EntityPlayer.field_71075_bZ.field_75098_d)
/*    */     {
/* 42 */       par1ItemStack.field_77994_a--;
/*    */     }
/*    */     
/* 45 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 52 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemElevator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */