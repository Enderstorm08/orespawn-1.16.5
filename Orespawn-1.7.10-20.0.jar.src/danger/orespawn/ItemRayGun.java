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
/*    */ public class ItemRayGun
/*    */   extends Item
/*    */ {
/*    */   public ItemRayGun(int i) {
/* 19 */     this.field_77777_bU = 1;
/* 20 */     func_77656_e(50);
/* 21 */     func_77637_a(CreativeTabs.field_78037_j);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 31 */     if (par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() <= 1) {
/* 32 */       return par1ItemStack;
/*    */     }
/*    */     
/* 35 */     par2World.func_72956_a((Entity)par3EntityPlayer, "fireworks.launch", 3.5F, 0.5F);
/*    */     
/* 37 */     if (!par2World.field_72995_K) {
/*    */       
/* 39 */       double xzoff = 1.0D;
/* 40 */       double yoff = 1.55D;
/* 41 */       LaserBall lb = new LaserBall(par2World, (EntityLivingBase)par3EntityPlayer);
/* 42 */       lb.setSpecial();
/* 43 */       lb.func_70012_b(par3EntityPlayer.field_70165_t - xzoff * Math.sin(Math.toRadians((par3EntityPlayer.field_70759_as + 45.0F))), par3EntityPlayer.field_70163_u + yoff, par3EntityPlayer.field_70161_v + xzoff * Math.cos(Math.toRadians((par3EntityPlayer.field_70759_as + 45.0F))), par3EntityPlayer.field_70759_as, par3EntityPlayer.field_70125_A);
/* 44 */       lb.field_70159_w *= 3.0D;
/* 45 */       lb.field_70181_x *= 3.0D;
/* 46 */       lb.field_70179_y *= 3.0D;
/* 47 */       par2World.func_72838_d((Entity)lb);
/*    */     } 
/*    */ 
/*    */     
/* 51 */     par3EntityPlayer.func_71038_i();
/*    */     
/* 53 */     par3EntityPlayer.func_70024_g(Math.cos(Math.toRadians((par3EntityPlayer.field_70759_as - 90.0F))) * 1.5D, 0.3D, Math.sin(Math.toRadians((par3EntityPlayer.field_70759_as - 90.0F))) * 1.5D);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 62 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityPlayer);
/* 63 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMaterialName() {
/* 72 */     return "Unknown";
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 77 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemRayGun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */