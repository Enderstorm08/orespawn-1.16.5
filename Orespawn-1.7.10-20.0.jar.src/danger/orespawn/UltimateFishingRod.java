/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.enchantment.Enchantment;
/*    */ import net.minecraft.enchantment.EnchantmentHelper;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UltimateFishingRod
/*    */   extends Item
/*    */ {
/*    */   public UltimateFishingRod(int par1) {
/* 22 */     func_77656_e(3000);
/* 23 */     func_77625_d(1);
/* 24 */     func_77637_a(CreativeTabs.field_78040_i);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_77662_d() {
/* 32 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 37 */     par1ItemStack.func_77966_a(Enchantment.field_77347_r, 2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/* 48 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77347_r.field_77352_x, stack);
/* 49 */     if (lvl <= 0) {
/* 50 */       stack.func_77966_a(Enchantment.field_77347_r, 2);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_77629_n_() {
/* 61 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 69 */     if (par3EntityPlayer.field_71104_cf != null) {
/*    */       
/* 71 */       int var4 = par3EntityPlayer.field_71104_cf.func_146034_e();
/* 72 */       par1ItemStack.func_77972_a(var4, (EntityLivingBase)par3EntityPlayer);
/* 73 */       par3EntityPlayer.func_71038_i();
/*    */     }
/*    */     else {
/*    */       
/* 77 */       par2World.func_72956_a((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
/*    */       
/* 79 */       if (!par2World.field_72995_K)
/*    */       {
/* 81 */         par2World.func_72838_d((Entity)new UltimateFishHook(par2World, par3EntityPlayer));
/*    */       }
/*    */       
/* 84 */       par3EntityPlayer.func_71038_i();
/*    */     } 
/*    */     
/* 87 */     return par1ItemStack;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 92 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\UltimateFishingRod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */