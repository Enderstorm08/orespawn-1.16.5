/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemSpiderRobotKit
/*     */   extends Item
/*     */ {
/*     */   public ItemSpiderRobotKit(int i) {
/*  30 */     this.field_77777_bU = 1;
/*  31 */     func_77637_a(CreativeTabs.field_78040_i);
/*  32 */     if (i == OreSpawnMain.BaseItemID + 471) {
/*  33 */       func_77656_e(OreSpawnMain.SpiderRobot_stats.health);
/*     */     } else {
/*  35 */       func_77656_e(OreSpawnMain.AntRobot_stats.health);
/*     */     } 
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
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  51 */     if (par3World.field_72995_K)
/*     */     {
/*     */       
/*  54 */       return true;
/*     */     }
/*  56 */     String name = null;
/*  57 */     name = "Robot Spider";
/*  58 */     if (par1ItemStack.func_77973_b() == OreSpawnMain.AntRobotKit) {
/*  59 */       name = "Robot Red Ant";
/*     */     }
/*     */     
/*  62 */     Entity ent = spawnCreature(par3World, 0, name, par4 + 0.5D, par5 + 1.01D, par6 + 0.5D);
/*     */     
/*  64 */     if (ent != null) {
/*     */       
/*  66 */       EntityLiving e = (EntityLiving)ent;
/*  67 */       e.func_70606_j((func_77612_l() - getDamage(par1ItemStack)));
/*     */       
/*  69 */       if (ent instanceof EntityLiving && par1ItemStack.func_82837_s())
/*     */       {
/*  71 */         ((EntityLiving)ent).func_94058_c(par1ItemStack.func_82833_r());
/*     */       }
/*  73 */       par3World.func_72956_a((Entity)par2EntityPlayer, "random.explode", 1.0F, par3World.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*  74 */       if (ent instanceof AntRobot) {
/*  75 */         AntRobot a = (AntRobot)ent;
/*  76 */         a.setOwned();
/*     */       } 
/*     */     } 
/*     */     
/*  80 */     if (!par2EntityPlayer.field_71075_bZ.field_75098_d)
/*     */     {
/*  82 */       par1ItemStack.field_77994_a--;
/*     */     }
/*     */     
/*  85 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, int par1, String name, double par2, double par4, double par6) {
/*  96 */     Entity var8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     if (name == null) {
/* 103 */       var8 = EntityList.func_75616_a(par1, par0World);
/*     */     } else {
/* 105 */       var8 = EntityList.func_75620_a(name, par0World);
/*     */     } 
/*     */     
/* 108 */     if (var8 != null) {
/*     */ 
/*     */       
/* 111 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/* 112 */       par0World.func_72838_d(var8);
/*     */       
/* 114 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/* 117 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 125 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemSpiderRobotKit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */