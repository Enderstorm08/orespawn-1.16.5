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
/*    */ public class ItemThunderStaff
/*    */   extends Item
/*    */ {
/* 18 */   private int ticker = 50;
/*    */ 
/*    */   
/*    */   public ItemThunderStaff(int i) {
/* 22 */     this.field_77777_bU = 1;
/* 23 */     func_77656_e(50);
/* 24 */     func_77637_a(CreativeTabs.field_78037_j);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 34 */     if (par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() <= 1) {
/* 35 */       return par1ItemStack;
/*    */     }
/*    */ 
/*    */     
/* 39 */     double xzoff = 1.0D;
/* 40 */     double yoff = 1.55D;
/* 41 */     ThunderBolt lb = new ThunderBolt(par2World, (EntityLivingBase)par3EntityPlayer);
/* 42 */     lb.func_70012_b(par3EntityPlayer.field_70165_t - xzoff * Math.sin(Math.toRadians((par3EntityPlayer.field_70759_as + 45.0F))), par3EntityPlayer.field_70163_u + yoff, par3EntityPlayer.field_70161_v + xzoff * Math.cos(Math.toRadians((par3EntityPlayer.field_70759_as + 45.0F))), par3EntityPlayer.field_70759_as, par3EntityPlayer.field_70125_A);
/* 43 */     lb.field_70159_w *= 3.0D;
/* 44 */     lb.field_70181_x *= 3.0D;
/* 45 */     lb.field_70179_y *= 3.0D;
/* 46 */     par2World.func_72838_d((Entity)lb);
/*    */ 
/*    */ 
/*    */     
/* 50 */     par3EntityPlayer.func_71038_i();
/*    */     
/* 52 */     par3EntityPlayer.func_70024_g(Math.cos(Math.toRadians((par3EntityPlayer.field_70759_as - 90.0F))) * 0.5D, 0.15D, Math.sin(Math.toRadians((par3EntityPlayer.field_70759_as - 90.0F))) * 0.5D);
/*    */     
/* 54 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityPlayer);
/* 55 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_77663_a(ItemStack par1ItemStack, World world, Entity par3Entity, int par4, boolean par5) {
/* 61 */     if (world.func_72896_J() && 
/* 62 */       world.func_72911_I()) {
/* 63 */       if (this.ticker > 0) this.ticker--; 
/* 64 */       if (this.ticker <= 0 && 
/* 65 */         par1ItemStack.func_77960_j() > 0) {
/*    */         
/* 67 */         par1ItemStack.func_77964_b(par1ItemStack.func_77960_j() - 1);
/* 68 */         this.ticker = 50;
/*    */       } 
/*    */     } 
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
/*    */   public String getMaterialName() {
/* 82 */     return "Unknown";
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 87 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemThunderStaff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */