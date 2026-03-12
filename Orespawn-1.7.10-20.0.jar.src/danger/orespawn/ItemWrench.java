/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemWrench
/*     */   extends Item
/*     */ {
/*     */   public ItemWrench(int i) {
/*  25 */     func_77637_a(CreativeTabs.field_78040_i);
/*  26 */     func_77656_e(100);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
/*  44 */     if (entity != null && entity instanceof SpiderRobot && entity.field_70153_n == null) {
/*  45 */       EntityLiving e = (EntityLiving)entity;
/*     */       
/*  47 */       float h = e.func_110138_aP() - e.func_110143_aJ();
/*  48 */       e.func_70106_y();
/*  49 */       dropItem(player.field_70170_p, e, OreSpawnMain.SpiderRobotKit, 1, (int)h);
/*     */       
/*  51 */       for (int var3 = 0; var3 < 8; var3++) {
/*     */         
/*  53 */         float f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  54 */         float f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/*  55 */         float f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  56 */         player.field_70170_p.func_72869_a("smoke", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/*  57 */         f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  58 */         f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/*  59 */         f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  60 */         player.field_70170_p.func_72869_a("explode", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/*  61 */         f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  62 */         f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/*  63 */         f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  64 */         player.field_70170_p.func_72869_a("reddust", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*  66 */       player.field_70170_p.func_72956_a((Entity)player, "random.explode", 0.5F, 1.5F);
/*     */     
/*     */     }
/*  69 */     else if (entity != null && entity instanceof AntRobot && entity.field_70153_n == null) {
/*  70 */       AntRobot e = (AntRobot)entity;
/*     */       
/*  72 */       if (e.getOwned() == 0) {
/*  73 */         if (e.func_110143_aJ() / e.func_110138_aP() > 0.5F) return false; 
/*  74 */         e.setOwned();
/*     */       } 
/*  76 */       float h = e.func_110138_aP() - e.func_110143_aJ();
/*  77 */       e.func_70106_y();
/*  78 */       dropItem(player.field_70170_p, e, OreSpawnMain.AntRobotKit, 1, (int)h);
/*     */       
/*  80 */       for (int var3 = 0; var3 < 8; var3++) {
/*     */         
/*  82 */         float f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  83 */         float f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/*  84 */         float f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  85 */         player.field_70170_p.func_72869_a("smoke", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/*  86 */         f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  87 */         f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/*  88 */         f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  89 */         player.field_70170_p.func_72869_a("explode", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/*  90 */         f1 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  91 */         f2 = 0.25F + player.field_70170_p.field_73012_v.nextFloat() * 2.0F;
/*  92 */         f3 = player.field_70170_p.field_73012_v.nextFloat() * 3.0F - player.field_70170_p.field_73012_v.nextFloat() * 3.0F;
/*  93 */         player.field_70170_p.func_72869_a("reddust", ((float)entity.field_70165_t + f1), ((float)entity.field_70163_u + f2), ((float)entity.field_70161_v + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*  95 */       player.field_70170_p.func_72956_a((Entity)player, "random.explode", 0.5F, 1.5F);
/*     */     } else {
/*     */       
/*  98 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 102 */     stack.func_77972_a(2, (EntityLivingBase)player);
/* 103 */     if (stack.field_77994_a <= 0)
/*     */     {
/* 105 */       player.field_71071_by.func_70299_a(player.field_71071_by.field_70461_c, (ItemStack)null);
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void dropItem(World world, EntityLiving e, Item index, int par1, int par2) {
/* 112 */     if (world.field_72995_K)
/* 113 */       return;  ItemStack is = new ItemStack(index, par1, 0);
/* 114 */     is.func_77964_b(par2);
/* 115 */     EntityItem var3 = new EntityItem(world, e.field_70165_t, e.field_70163_u + 1.0D, e.field_70161_v, is);
/* 116 */     world.func_72838_d((Entity)var3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 123 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemWrench.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */