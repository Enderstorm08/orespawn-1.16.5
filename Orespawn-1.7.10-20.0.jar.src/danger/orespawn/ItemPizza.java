/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class ItemPizza
/*     */   extends Item
/*     */ {
/*     */   private Block spawnID;
/*     */   
/*     */   public ItemPizza(int par1, Block par2Block) {
/*  22 */     this.spawnID = par2Block;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  31 */     Block i1 = par3World.func_147439_a(par4, par5, par6);
/*     */     
/*  33 */     if (i1 == Blocks.field_150433_aE && (par3World.func_72805_g(par4, par5, par6) & 0x7) < 1) {
/*     */       
/*  35 */       par7 = 1;
/*     */     }
/*  37 */     else if (i1 != Blocks.field_150395_bd && i1 != Blocks.field_150329_H && i1 != Blocks.field_150330_I) {
/*     */       
/*  39 */       if (par7 == 0)
/*     */       {
/*  41 */         par5--;
/*     */       }
/*     */       
/*  44 */       if (par7 == 1)
/*     */       {
/*  46 */         par5++;
/*     */       }
/*     */       
/*  49 */       if (par7 == 2)
/*     */       {
/*  51 */         par6--;
/*     */       }
/*     */       
/*  54 */       if (par7 == 3)
/*     */       {
/*  56 */         par6++;
/*     */       }
/*     */       
/*  59 */       if (par7 == 4)
/*     */       {
/*  61 */         par4--;
/*     */       }
/*     */       
/*  64 */       if (par7 == 5)
/*     */       {
/*  66 */         par4++;
/*     */       }
/*     */     } 
/*     */     
/*  70 */     if (!par2EntityPlayer.func_82247_a(par4, par5, par6, par7, par1ItemStack))
/*     */     {
/*  72 */       return false;
/*     */     }
/*  74 */     if (par1ItemStack.field_77994_a == 0)
/*     */     {
/*  76 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  80 */     if (par3World.func_147472_a(this.spawnID, par4, par5, par6, false, par7, (Entity)null, par1ItemStack)) {
/*     */ 
/*     */       
/*  83 */       int j1 = this.spawnID.func_149660_a(par3World, par4, par5, par6, par7, par8, par9, par10, 0);
/*     */       
/*  85 */       if (par3World.func_147465_d(par4, par5, par6, this.spawnID, j1, 3)) {
/*     */         
/*  87 */         if (par3World.func_147439_a(par4, par5, par6) == this.spawnID) {
/*     */           
/*  89 */           this.spawnID.func_149689_a(par3World, par4, par5, par6, (EntityLivingBase)par2EntityPlayer, par1ItemStack);
/*  90 */           this.spawnID.func_149714_e(par3World, par4, par5, par6, j1);
/*     */         } 
/*     */         
/*  93 */         par3World.func_72908_a((par4 + 0.5F), (par5 + 0.5F), (par6 + 0.5F), this.spawnID.field_149762_H.func_150498_e(), (this.spawnID.field_149762_H.func_150497_c() + 1.0F) / 2.0F, this.spawnID.field_149762_H.func_150494_d() * 0.8F);
/*  94 */         par1ItemStack.field_77994_a--;
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 105 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemPizza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */