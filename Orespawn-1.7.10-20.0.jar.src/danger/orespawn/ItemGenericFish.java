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
/*    */ public class ItemGenericFish
/*    */   extends ItemFood
/*    */ {
/*    */   public ItemGenericFish(int par1, int par2, float par3, boolean par4) {
/* 20 */     super(par2, par3, par4);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_77849_c(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 26 */     super.func_77849_c(par1ItemStack, par2World, par3EntityPlayer);
/* 27 */     if (!par2World.field_72995_K)
/*    */     {
/* 29 */       if (par2World.field_73012_v.nextInt(4) == 1) par3EntityPlayer.func_70690_d(new PotionEffect(Potion.field_76438_s.field_76415_H, 20, 0));
/*    */     
/*    */     }
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 36 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemGenericFish.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */