/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemHoe;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UltimateHoe
/*     */   extends ItemHoe
/*     */ {
/*     */   public UltimateHoe(int par1, Item.ToolMaterial par2) {
/*  28 */     super(par2);
/*  29 */     this.field_77777_bU = 1;
/*  30 */     func_77656_e(3000);
/*  31 */     func_77637_a(CreativeTabs.field_78040_i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  36 */     par1ItemStack.func_77966_a(Enchantment.field_77349_p, 2);
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
/*  47 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77349_p.field_77352_x, stack);
/*  48 */     if (lvl <= 0) {
/*  49 */       stack.func_77966_a(Enchantment.field_77349_p, 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/*  54 */     onUsingTick(stack, (EntityPlayer)null, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  63 */     if (!par2EntityPlayer.func_82247_a(par4, par5, par6, par7, par1ItemStack))
/*     */     {
/*  65 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  69 */     Block i1 = par3World.func_147439_a(par4, par5, par6);
/*  70 */     boolean air = par3World.func_147437_c(par4, par5 + 1, par6);
/*     */     
/*  72 */     if (par7 != 0 && air && (i1 == Blocks.field_150349_c || i1 == Blocks.field_150346_d)) {
/*     */       
/*  74 */       Block block = Blocks.field_150458_ak;
/*  75 */       par3World.func_72908_a((par4 + 0.5F), (par5 + 0.5F), (par6 + 0.5F), block.field_149762_H.func_150495_a(), (block.field_149762_H.func_150497_c() + 1.0F) / 2.0F, block.field_149762_H.func_150494_d() * 0.8F);
/*     */       
/*  77 */       if (par3World.field_72995_K)
/*     */       {
/*  79 */         return true;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*  84 */       for (int i = -1; i <= 1; i++) {
/*  85 */         for (int k = -1; k <= 1; k++) {
/*  86 */           for (int j = -1; j <= 1; j++) {
/*  87 */             i1 = par3World.func_147439_a(par4 + i, par5 + j, par6 + k);
/*  88 */             air = par3World.func_147437_c(par4 + i, par5 + j + 1, par6 + k);
/*  89 */             if (air && (i1 == Blocks.field_150349_c || i1 == Blocks.field_150346_d)) {
/*  90 */               par3World.func_147465_d(par4 + i, par5 + j, par6 + k, block, 7, 2);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  96 */       par1ItemStack.func_77972_a(1, (EntityLivingBase)par2EntityPlayer);
/*  97 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/* 110 */     return "Uranium/Titanium";
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 115 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\UltimateHoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */