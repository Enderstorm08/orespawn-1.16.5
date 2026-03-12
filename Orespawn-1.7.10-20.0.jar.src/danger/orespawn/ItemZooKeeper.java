/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLiving;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemZooKeeper
/*    */   extends Item
/*    */ {
/*    */   public ItemZooKeeper(int i) {
/* 26 */     func_77637_a(CreativeTabs.field_78031_c);
/* 27 */     func_77656_e(1);
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
/*    */ 
/*    */   
/*    */   public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
/* 46 */     for (int var3 = 0; var3 < 8; var3++) {
/*    */       
/* 48 */       float f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/* 49 */       float f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/* 50 */       float f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/* 51 */       player.field_70170_p.func_72869_a("smoke", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/* 52 */       f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/* 53 */       f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/* 54 */       f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/* 55 */       player.field_70170_p.func_72869_a("explode", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/* 56 */       f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/* 57 */       f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/* 58 */       f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/* 59 */       player.field_70170_p.func_72869_a("reddust", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/*    */     } 
/* 61 */     player.field_70170_p.func_72956_a((Entity)player, "random.explode", 0.5F, 1.5F);
/*    */ 
/*    */     
/* 64 */     if (entity != null && entity instanceof EntityLiving) {
/* 65 */       EntityLiving e = (EntityLiving)entity;
/* 66 */       e.func_110163_bv();
/*    */     } else {
/* 68 */       return false;
/*    */     } 
/*    */ 
/*    */     
/* 72 */     stack.func_77972_a(2, (EntityLivingBase)player);
/* 73 */     if (stack.field_77994_a <= 0)
/*    */     {
/* 75 */       player.field_71071_by.func_70299_a(player.field_71071_by.field_70461_c, (ItemStack)null);
/*    */     }
/* 77 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister iconRegister) {
/* 85 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemZooKeeper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */