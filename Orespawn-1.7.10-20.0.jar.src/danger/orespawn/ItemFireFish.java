/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemFood;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.potion.Potion;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemFireFish
/*    */   extends ItemFood
/*    */ {
/*    */   public ItemFireFish(int par1, int par2, float par3, boolean par4) {
/* 21 */     super(par2, par3, par4);
/* 22 */     func_77848_i();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_77849_c(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 28 */     super.func_77849_c(par1ItemStack, par2World, par3EntityPlayer);
/* 29 */     if (!par2World.field_72995_K)
/*    */     {
/* 31 */       par3EntityPlayer.func_70690_d(new PotionEffect(Potion.field_76426_n.field_76415_H, 1200, 0));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 38 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemFireFish.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */