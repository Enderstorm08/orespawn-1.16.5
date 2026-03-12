/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemHoe;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RubyHoe
/*    */   extends ItemHoe
/*    */ {
/*    */   public RubyHoe(int par1, Item.ToolMaterial par2) {
/* 23 */     super(par2);
/* 24 */     this.field_77777_bU = 1;
/* 25 */     func_77656_e(1500);
/* 26 */     func_77637_a(CreativeTabs.field_78040_i);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getDamageVsEntity(Entity par1Entity) {
/* 34 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 39 */     return "Ruby";
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 44 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RubyHoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */