/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.enchantment.Enchantment;
/*    */ import net.minecraft.enchantment.EnchantmentHelper;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.passive.EntityTameable;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemAxe;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ public class UltimateAxe
/*    */   extends ItemAxe
/*    */ {
/* 21 */   private int weaponDamage = 15;
/*    */ 
/*    */   
/*    */   public UltimateAxe(int par1, Item.ToolMaterial par2) {
/* 25 */     super(par2);
/* 26 */     this.field_77777_bU = 1;
/* 27 */     func_77656_e(3000);
/* 28 */     func_77637_a(CreativeTabs.field_78040_i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 33 */     par1ItemStack.func_77966_a(Enchantment.field_77349_p, 5);
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
/* 44 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77349_p.field_77352_x, stack);
/* 45 */     if (lvl <= 0) {
/* 46 */       stack.func_77966_a(Enchantment.field_77349_p, 5);
/*    */     }
/*    */   }
/*    */   
/*    */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/* 51 */     onUsingTick(stack, (EntityPlayer)null, 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
/* 56 */     if (entity != null && OreSpawnMain.ultimate_sword_pvp == 0) {
/* 57 */       if (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend) {
/* 58 */         return true;
/*    */       }
/* 60 */       if (entity instanceof EntityTameable) {
/* 61 */         EntityTameable t = (EntityTameable)entity;
/* 62 */         if (t.func_70909_n()) {
/* 63 */           return true;
/*    */         }
/*    */       } 
/*    */     } 
/* 67 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getDamageVsEntity(Entity par1Entity) {
/* 75 */     if (par1Entity instanceof Girlfriend) {
/* 76 */       return 1;
/*    */     }
/* 78 */     if (par1Entity instanceof EntityPlayer) {
/* 79 */       return 1;
/*    */     }
/* 81 */     return this.weaponDamage;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 87 */     return "Uranium/Titanium";
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 92 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\UltimateAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */