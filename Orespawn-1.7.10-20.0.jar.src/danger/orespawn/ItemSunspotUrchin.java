/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
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
/*    */ public class ItemSunspotUrchin
/*    */   extends Item
/*    */ {
/*    */   public ItemSunspotUrchin(int i) {
/* 24 */     this.field_77777_bU = 64;
/* 25 */     func_77637_a(CreativeTabs.field_78037_j);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 36 */     if (!par3EntityPlayer.field_71075_bZ.field_75098_d)
/*    */     {
/* 38 */       par1ItemStack.field_77994_a--;
/*    */     }
/*    */     
/* 41 */     par2World.func_72956_a((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
/*    */     
/* 43 */     if (!par2World.field_72995_K)
/*    */     {
/* 45 */       par2World.func_72838_d((Entity)new SunspotUrchin(par2World, (EntityLivingBase)par3EntityPlayer));
/*    */     }
/*    */     
/* 48 */     return par1ItemStack;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 53 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemSunspotUrchin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */