/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.enchantment.Enchantment;
/*    */ import net.minecraft.enchantment.EnchantmentHelper;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import net.minecraft.potion.Potion;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PoisonSword
/*    */   extends ItemSword
/*    */ {
/*    */   private int weaponDamage;
/*    */   private final Item.ToolMaterial toolMaterial;
/*    */   
/*    */   public PoisonSword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 29 */     super(par2EnumToolMaterial);
/* 30 */     this.toolMaterial = par2EnumToolMaterial;
/* 31 */     this.weaponDamage = 15;
/* 32 */     this.field_77777_bU = 1;
/* 33 */     func_77656_e(1300);
/* 34 */     func_77637_a(CreativeTabs.field_78037_j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 39 */     par1ItemStack.func_77966_a(Enchantment.field_77338_j, 1);
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
/* 50 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77338_j.field_77352_x, stack);
/* 51 */     if (lvl <= 0) {
/* 52 */       stack.func_77966_a(Enchantment.field_77338_j, 1);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 60 */     return "Emerald";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
/* 67 */     int var2 = 5;
/*    */     
/* 69 */     if (par2EntityLiving != null) {
/* 70 */       var2 = 10 + par2EntityLiving.field_70170_p.field_73012_v.nextInt(10);
/* 71 */       par2EntityLiving.func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, var2 * 20, 0));
/* 72 */       var2 = 10 + par2EntityLiving.field_70170_p.field_73012_v.nextInt(10);
/* 73 */       par2EntityLiving.func_70690_d(new PotionEffect(Potion.field_82731_v.field_76415_H, var2 * 20, 0));
/* 74 */       var2 = 10 + par2EntityLiving.field_70170_p.field_73012_v.nextInt(10);
/* 75 */       par2EntityLiving.func_70690_d(new PotionEffect(Potion.field_76437_t.field_76415_H, var2 * 20, 0));
/*    */     } 
/*    */     
/* 78 */     par1ItemStack.func_77972_a(1, par3EntityLiving);
/* 79 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_77626_a(ItemStack par1ItemStack) {
/* 87 */     return 3000;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 93 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\PoisonSword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */