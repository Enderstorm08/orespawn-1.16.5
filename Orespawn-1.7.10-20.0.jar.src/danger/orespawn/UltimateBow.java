/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntityArrow;
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UltimateBow
/*     */   extends Item
/*     */ {
/*     */   public UltimateBow(int par1) {
/*  26 */     this.field_77777_bU = 1;
/*  27 */     func_77656_e(1000);
/*  28 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  33 */     par1ItemStack.func_77966_a(Enchantment.field_77345_t, 5);
/*  34 */     par1ItemStack.func_77966_a(Enchantment.field_77343_v, 3);
/*  35 */     par1ItemStack.func_77966_a(Enchantment.field_77344_u, 2);
/*  36 */     par1ItemStack.func_77966_a(Enchantment.field_77342_w, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/*  47 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77342_w.field_77352_x, stack);
/*  48 */     if (lvl <= 0) {
/*  49 */       stack.func_77966_a(Enchantment.field_77345_t, 5);
/*  50 */       stack.func_77966_a(Enchantment.field_77343_v, 3);
/*  51 */       stack.func_77966_a(Enchantment.field_77344_u, 2);
/*  52 */       stack.func_77966_a(Enchantment.field_77342_w, 1);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_77615_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
/*  71 */     EntityArrow var8 = new UltimateArrow(par2World, par3EntityPlayer, 3.0F);
/*     */ 
/*     */     
/*  74 */     if (par2World.field_73012_v.nextInt(4) == 1) var8.func_70243_d(true);
/*     */ 
/*     */     
/*  77 */     int var10 = EnchantmentHelper.func_77506_a(Enchantment.field_77344_u.field_77352_x, par1ItemStack);
/*  78 */     if (var10 > 0)
/*     */     {
/*  80 */       var8.func_70240_a(var10);
/*     */     }
/*     */     
/*  83 */     if (EnchantmentHelper.func_77506_a(Enchantment.field_77343_v.field_77352_x, par1ItemStack) > 0)
/*     */     {
/*  85 */       var8.func_70015_d(100);
/*     */     }
/*     */     
/*  88 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityPlayer);
/*  89 */     par2World.func_72956_a((Entity)par3EntityPlayer, "random.bow", 1.0F, 1.0F / (field_77697_d.nextFloat() * 0.4F + 1.2F) + 0.5F);
/*     */     
/*  91 */     var8.field_70251_a = 2;
/*     */     
/*  93 */     if (!par2World.field_72995_K)
/*     */     {
/*  95 */       par2World.func_72838_d((Entity)var8);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 101 */     return par1ItemStack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 109 */     return 9000;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumAction func_77661_b(ItemStack par1ItemStack) {
/* 117 */     return EnumAction.bow;
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
/*     */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 132 */     par3EntityPlayer.func_71008_a(par1ItemStack, func_77626_a(par1ItemStack));
/*     */     
/* 134 */     return par1ItemStack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77619_b() {
/* 142 */     return 50;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 147 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\UltimateBow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */