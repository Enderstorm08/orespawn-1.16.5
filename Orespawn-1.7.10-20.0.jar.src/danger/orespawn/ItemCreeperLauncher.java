/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemCreeperLauncher
/*    */   extends Item
/*    */ {
/*    */   public ItemCreeperLauncher(int i) {
/* 22 */     func_77637_a(CreativeTabs.field_78028_d);
/* 23 */     func_77656_e(1);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
/* 40 */     if (entity != null && entity instanceof net.minecraft.entity.monster.EntityCreeper) {
/*    */       
/* 42 */       for (int var3 = 0; var3 < 6; var3++) {
/*    */         
/* 44 */         float f1 = player.field_70170_p.field_73012_v.nextFloat() - player.field_70170_p.field_73012_v.nextFloat();
/* 45 */         float f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 6.0F;
/* 46 */         float f3 = player.field_70170_p.field_73012_v.nextFloat() - player.field_70170_p.field_73012_v.nextFloat();
/* 47 */         player.field_70170_p.func_72869_a("smoke", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, (f2 / 4.0F), 0.0D);
/* 48 */         f1 = player.field_70170_p.field_73012_v.nextFloat() - player.field_70170_p.field_73012_v.nextFloat();
/* 49 */         f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 6.0F;
/* 50 */         f3 = player.field_70170_p.field_73012_v.nextFloat() - player.field_70170_p.field_73012_v.nextFloat();
/* 51 */         player.field_70170_p.func_72869_a("explode", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, (f2 / 4.0F), 0.0D);
/* 52 */         f1 = player.field_70170_p.field_73012_v.nextFloat() - player.field_70170_p.field_73012_v.nextFloat();
/* 53 */         f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 6.0F;
/* 54 */         f3 = player.field_70170_p.field_73012_v.nextFloat() - player.field_70170_p.field_73012_v.nextFloat();
/* 55 */         player.field_70170_p.func_72869_a("reddust", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, (f2 / 4.0F), 0.0D);
/*    */       } 
/* 57 */       player.field_70170_p.func_72956_a((Entity)player, "fireworks.launch", 2.0F, 1.2F);
/*    */       
/* 59 */       EntityLiving e = (EntityLiving)entity;
/* 60 */       e.func_70024_g(0.0D, 4.5D, 0.0D);
/*    */     } else {
/* 62 */       return false;
/*    */     } 
/*    */     
/* 65 */     if (!player.field_71075_bZ.field_75098_d)
/*    */     {
/* 67 */       stack.field_77994_a--;
/*    */     }
/* 69 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 75 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemCreeperLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */