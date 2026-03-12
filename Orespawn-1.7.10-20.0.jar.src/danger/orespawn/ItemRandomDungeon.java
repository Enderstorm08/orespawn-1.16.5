/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
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
/*     */ public class ItemRandomDungeon
/*     */   extends Item
/*     */ {
/*  30 */   Random rand = OreSpawnMain.OreSpawnRand;
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemRandomDungeon(int i) {
/*  35 */     this.field_77777_bU = 1;
/*  36 */     func_77637_a(CreativeTabs.field_78028_d);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  42 */     par1ItemStack.func_77966_a(Enchantment.field_77346_s, 2);
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
/*  53 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77346_s.field_77352_x, stack);
/*  54 */     if (lvl <= 0) {
/*  55 */       stack.func_77966_a(Enchantment.field_77346_s, 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/*  60 */     onUsingTick(stack, (EntityPlayer)null, 0);
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
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int clickedX, int clickedY, int clickedZ, int par7, float par8, float par9, float par10) {
/*  75 */     Block var1 = world.func_147439_a(clickedX, clickedY, clickedZ);
/*  76 */     if (var1 != Blocks.field_150348_b && var1 != Blocks.field_150347_e && var1 != Blocks.field_150349_c && var1 != Blocks.field_150346_d) {
/*  77 */       return false;
/*     */     }
/*  79 */     if (clickedY < 40) return false;
/*     */     
/*  81 */     if (!world.field_72995_K)
/*     */     {
/*  83 */       world.func_147465_d(clickedX, clickedY + 1, clickedZ, OreSpawnMain.MyDungeonSpawnerBlock, 0, 2);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     if (!par2EntityPlayer.field_71075_bZ.field_75098_d)
/*     */     {
/* 109 */       par1ItemStack.field_77994_a--;
/*     */     }
/* 111 */     return true;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 116 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemRandomDungeon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */