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
/*     */ public class ItemNetherLost
/*     */   extends Item
/*     */ {
/*     */   public ItemNetherLost(int par1) {
/*  32 */     this.field_77777_bU = 1;
/*  33 */     func_77656_e(3000);
/*  34 */     func_77637_a(CreativeTabs.field_78031_c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  39 */     par1ItemStack.func_77966_a(Enchantment.field_77338_j, 2);
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
/*     */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/*  51 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77338_j.field_77352_x, stack);
/*  52 */     if (lvl <= 0) {
/*  53 */       stack.func_77966_a(Enchantment.field_77338_j, 2);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/*  62 */     EntityLivingBase e = null;
/*  63 */     EntityPlayer p = null;
/*     */     
/*  65 */     onUsingTick(stack, (EntityPlayer)null, 0);
/*  66 */     if (par2World == null)
/*     */       return; 
/*  68 */     if (par3Entity != null && 
/*  69 */       par3Entity instanceof EntityLivingBase) {
/*  70 */       e = (EntityLivingBase)par3Entity;
/*     */       
/*  72 */       if (e instanceof EntityPlayer) {
/*  73 */         p = (EntityPlayer)e;
/*  74 */         ItemStack is = p.func_71045_bC();
/*  75 */         if (is != null) {
/*  76 */           Item it = is.func_77973_b();
/*  77 */           if (it != null)
/*     */           {
/*  79 */             if (it instanceof ItemNetherLost && 
/*  80 */               par2World.field_73011_w.field_76574_g == -1) {
/*  81 */               Block i = par2World.func_147439_a((int)p.field_70165_t, (int)p.field_70163_u - 1, (int)p.field_70161_v);
/*  82 */               if (i == Blocks.field_150424_aL) {
/*  83 */                 par2World.func_147449_b((int)p.field_70165_t, (int)p.field_70163_u - 1, (int)p.field_70161_v, Blocks.field_150371_ca);
/*     */               }
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
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
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 101 */     return 3000;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 107 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemNetherLost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */