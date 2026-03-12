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
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SkateBow
/*     */   extends Item
/*     */ {
/*     */   public SkateBow(int par1) {
/*  26 */     this.field_77777_bU = 1;
/*  27 */     func_77656_e(300);
/*  28 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_77615_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
/*  52 */     int var6 = func_77626_a(par1ItemStack) - par4;
/*     */     
/*  54 */     boolean flag = (par3EntityPlayer.field_71075_bZ.field_75098_d || EnchantmentHelper.func_77506_a(Enchantment.field_77342_w.field_77352_x, par1ItemStack) > 0);
/*     */     
/*  56 */     if (flag || par3EntityPlayer.field_71071_by.func_146028_b(OreSpawnMain.MyIrukandjiArrow)) {
/*     */ 
/*     */       
/*  59 */       float f = var6 / 20.0F;
/*  60 */       f = (f * f + f * 2.0F) / 3.0F;
/*     */       
/*  62 */       if (f < 0.1D) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/*  67 */       if (f > 1.75F)
/*     */       {
/*  69 */         f = 1.75F;
/*     */       }
/*     */ 
/*     */       
/*  73 */       IrukandjiArrow var8 = new IrukandjiArrow(par2World, par3EntityPlayer, f);
/*     */ 
/*     */       
/*  76 */       if (par2World.field_73012_v.nextInt(20) == 1) var8.func_70243_d(true);
/*     */ 
/*     */       
/*  79 */       int var10 = EnchantmentHelper.func_77506_a(Enchantment.field_77344_u.field_77352_x, par1ItemStack);
/*  80 */       if (var10 > 0)
/*     */       {
/*  82 */         var8.func_70240_a(var10);
/*     */       }
/*     */       
/*  85 */       if (EnchantmentHelper.func_77506_a(Enchantment.field_77343_v.field_77352_x, par1ItemStack) > 0)
/*     */       {
/*  87 */         var8.func_70015_d(100);
/*     */       }
/*     */       
/*  90 */       par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityPlayer);
/*  91 */       par2World.func_72956_a((Entity)par3EntityPlayer, "random.bow", 1.0F, 1.0F / (field_77697_d.nextFloat() * 0.4F + 1.2F) + 0.5F);
/*     */       
/*  93 */       if (!flag) {
/*  94 */         par3EntityPlayer.field_71071_by.func_146026_a(OreSpawnMain.MyIrukandjiArrow);
/*     */       }
/*     */       
/*  97 */       if (!par2World.field_72995_K)
/*     */       {
/*  99 */         par2World.func_72838_d((Entity)var8);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 106 */     return par1ItemStack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 114 */     return 9000;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumAction func_77661_b(ItemStack par1ItemStack) {
/* 122 */     return EnumAction.bow;
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
/* 137 */     par3EntityPlayer.func_71008_a(par1ItemStack, func_77626_a(par1ItemStack));
/*     */     
/* 139 */     return par1ItemStack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77619_b() {
/* 147 */     return 50;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 152 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\SkateBow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */