/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.enchantment.Enchantment;
/*    */ import net.minecraft.enchantment.EnchantmentHelper;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NightmareSword
/*    */   extends ItemSword
/*    */ {
/*    */   public NightmareSword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 28 */     super(par2EnumToolMaterial);
/*    */     
/* 30 */     this.field_77777_bU = 1;
/* 31 */     func_77656_e(1200);
/* 32 */     func_77637_a(CreativeTabs.field_78037_j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 37 */     par1ItemStack.func_77966_a(Enchantment.field_77338_j, 1);
/* 38 */     par1ItemStack.func_77966_a(Enchantment.field_77337_m, 3);
/* 39 */     par1ItemStack.func_77966_a(Enchantment.field_77334_n, 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/* 51 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77337_m.field_77352_x, stack);
/* 52 */     if (lvl <= 0) {
/* 53 */       stack.func_77966_a(Enchantment.field_77338_j, 1);
/* 54 */       stack.func_77966_a(Enchantment.field_77337_m, 3);
/* 55 */       stack.func_77966_a(Enchantment.field_77334_n, 1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/* 60 */     onUsingTick(stack, (EntityPlayer)null, 0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 66 */     return "Uranium/Titanium";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
/* 71 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityLiving);
/* 72 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_77626_a(ItemStack par1ItemStack) {
/* 80 */     return 5000;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 85 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\NightmareSword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */