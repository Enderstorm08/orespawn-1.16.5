/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemPickaxe;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AmethystPickaxe
/*    */   extends ItemPickaxe
/*    */ {
/* 21 */   private int weaponDamage = 12;
/*    */ 
/*    */   
/*    */   public AmethystPickaxe(int par1, Item.ToolMaterial par2) {
/* 25 */     super(par2);
/* 26 */     this.field_77777_bU = 1;
/* 27 */     func_77656_e(2000);
/* 28 */     func_77637_a(CreativeTabs.field_78040_i);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getDamageVsEntity(Entity par1Entity) {
/* 36 */     return this.weaponDamage;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getDamageVsEntity() {
/* 41 */     return this.weaponDamage;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 46 */     return "Amethyst";
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 51 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\AmethystPickaxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */