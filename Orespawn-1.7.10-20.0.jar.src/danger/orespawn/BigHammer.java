/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemSword;
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
/*    */ 
/*    */ public class BigHammer
/*    */   extends ItemSword
/*    */ {
/*    */   private int weaponDamage;
/*    */   private final Item.ToolMaterial toolMaterial;
/*    */   
/*    */   public BigHammer(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 29 */     super(par2EnumToolMaterial);
/* 30 */     this.toolMaterial = par2EnumToolMaterial;
/* 31 */     this.weaponDamage = 15;
/* 32 */     this.field_77777_bU = 1;
/* 33 */     func_77656_e(9000);
/* 34 */     func_77637_a(CreativeTabs.field_78037_j);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 40 */     return "AMETHYST";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
/* 48 */     int var2 = 5;
/*    */     
/* 50 */     if (par2EntityLiving != null && 
/* 51 */       !par2EntityLiving.field_70170_p.field_72995_K)
/*    */     {
/* 53 */       par2EntityLiving.func_70024_g(0.0D, Math.abs(par2EntityLiving.field_70170_p.field_73012_v.nextFloat() * 2.0F / 3.0F), 0.0D);
/*    */     }
/*    */ 
/*    */     
/* 57 */     par1ItemStack.func_77972_a(1, par3EntityLiving);
/* 58 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_77626_a(ItemStack par1ItemStack) {
/* 68 */     return 3000;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 74 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BigHammer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */