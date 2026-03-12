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
/*    */ public class ItemShoes
/*    */   extends Item
/*    */ {
/* 19 */   private int my_id = 0;
/*    */ 
/*    */   
/*    */   public ItemShoes(int i, int j) {
/* 23 */     this.my_id = j;
/* 24 */     this.field_77777_bU = 64;
/* 25 */     func_77637_a(CreativeTabs.field_78031_c);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 35 */     if (!par3EntityPlayer.field_71075_bZ.field_75098_d)
/*    */     {
/* 37 */       par1ItemStack.field_77994_a--;
/*    */     }
/*    */     
/* 40 */     par2World.func_72956_a((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
/*    */     
/* 42 */     if (!par2World.field_72995_K)
/*    */     {
/* 44 */       par2World.func_72838_d((Entity)new Shoes(par2World, (EntityLivingBase)par3EntityPlayer, this.my_id));
/*    */     }
/*    */     
/* 47 */     return par1ItemStack;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 52 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemShoes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */