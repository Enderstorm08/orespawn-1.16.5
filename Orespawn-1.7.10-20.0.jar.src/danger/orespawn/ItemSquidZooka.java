/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class ItemSquidZooka
/*     */   extends Item
/*     */ {
/*     */   public ItemSquidZooka(int i) {
/*  21 */     this.field_77777_bU = 1;
/*  22 */     func_77656_e(100);
/*  23 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  33 */     if (par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() <= 1) {
/*  34 */       return par1ItemStack;
/*     */     }
/*     */     
/*  37 */     par2World.func_72956_a((Entity)par3EntityPlayer, "random.explode", 0.5F, 0.5F);
/*     */     
/*  39 */     if (!par2World.field_72995_K) {
/*  40 */       double xzoff = 2.5D;
/*  41 */       double yoff = 1.65D;
/*     */       
/*  43 */       this; Entity e = spawnCreature(par2World, "Attack Squid", par3EntityPlayer.field_70165_t - xzoff * Math.sin(Math.toRadians((par3EntityPlayer.field_70759_as + 15.0F))), par3EntityPlayer.field_70163_u + yoff, par3EntityPlayer.field_70161_v + xzoff * Math.cos(Math.toRadians((par3EntityPlayer.field_70759_as + 15.0F))));
/*     */ 
/*     */       
/*  46 */       if (e instanceof AttackSquid) {
/*  47 */         AttackSquid a = (AttackSquid)e;
/*  48 */         a.setWasShot();
/*     */       } 
/*     */       
/*  51 */       float f = 3.6F;
/*  52 */       e.field_70159_w = (-MathHelper.func_76126_a(par3EntityPlayer.field_70177_z / 180.0F * 3.1415927F) * MathHelper.func_76134_b(par3EntityPlayer.field_70125_A / 180.0F * 3.1415927F) * f);
/*  53 */       e.field_70179_y = (MathHelper.func_76134_b(par3EntityPlayer.field_70177_z / 180.0F * 3.1415927F) * MathHelper.func_76134_b(par3EntityPlayer.field_70125_A / 180.0F * 3.1415927F) * f);
/*  54 */       e.field_70181_x = (-MathHelper.func_76126_a(par3EntityPlayer.field_70125_A / 180.0F * 3.1415927F) * f);
/*     */       
/*  56 */       e.field_70159_w += (par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) * 0.05D;
/*  57 */       e.field_70181_x += (par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) * 0.05D;
/*  58 */       e.field_70179_y += (par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) * 0.05D;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     par3EntityPlayer.func_71038_i();
/*     */     
/*  66 */     par3EntityPlayer.func_70024_g(Math.cos(Math.toRadians((par3EntityPlayer.field_70759_as - 90.0F))) * 0.45D, 0.1D, Math.sin(Math.toRadians((par3EntityPlayer.field_70759_as - 90.0F))) * 0.45D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityPlayer);
/*  76 */     return par1ItemStack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/*  86 */     Entity var8 = null;
/*  87 */     var8 = EntityList.func_75620_a(par1, par0World);
/*  88 */     if (var8 != null) {
/*     */ 
/*     */       
/*  91 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/*  94 */       par0World.func_72838_d(var8);
/*     */     } 
/*  96 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/* 105 */     return "Unknown";
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 110 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemSquidZooka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */