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
/*    */ 
/*    */ public class MantisClaw
/*    */   extends ItemSword
/*    */ {
/*    */   private int weaponDamage;
/*    */   private final Item.ToolMaterial toolMaterial;
/*    */   
/*    */   public MantisClaw(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 30 */     super(par2EnumToolMaterial);
/* 31 */     this.toolMaterial = par2EnumToolMaterial;
/* 32 */     this.weaponDamage = 10;
/* 33 */     this.field_77777_bU = 1;
/* 34 */     func_77656_e(1000);
/* 35 */     func_77637_a(CreativeTabs.field_78037_j);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 41 */     return "AMETHYST";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
/* 49 */     int var2 = 5;
/*    */     
/* 51 */     if (par2EntityLiving != null && par3EntityLiving != null && 
/* 52 */       !par2EntityLiving.field_70170_p.field_72995_K) {
/*    */       
/* 54 */       par2EntityLiving.func_70691_i(-1.0F);
/* 55 */       par3EntityLiving.func_70691_i(1.0F);
/*    */     } 
/*    */ 
/*    */     
/* 59 */     par1ItemStack.func_77972_a(1, par3EntityLiving);
/* 60 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_77626_a(ItemStack par1ItemStack) {
/* 70 */     return 3000;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 76 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\MantisClaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */