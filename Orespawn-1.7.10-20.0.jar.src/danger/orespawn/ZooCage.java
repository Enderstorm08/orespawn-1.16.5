/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
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
/*     */ 
/*     */ 
/*     */ public class ZooCage
/*     */   extends Item
/*     */ {
/*  28 */   private int cage_size = 2;
/*     */ 
/*     */   
/*     */   public ZooCage(int i, int j) {
/*  32 */     this.field_77777_bU = 16;
/*  33 */     func_77637_a(CreativeTabs.field_78031_c);
/*  34 */     this.cage_size = j;
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
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
/*  49 */     int bid = 0;
/*     */     
/*  51 */     int dirx = 0, dirz = 0;
/*     */     
/*  53 */     int length = this.cage_size / 2 + 1, width = length, height = width;
/*     */ 
/*     */ 
/*     */     
/*  57 */     if (cposx < 0) dirx = -1; 
/*  58 */     if (cposz < 0) dirz = -1; 
/*  59 */     int x = (int)(Player.field_70165_t + 0.99D * dirx);
/*  60 */     int y = (int)Player.field_70163_u - 1;
/*  61 */     int z = (int)(Player.field_70161_v + 0.99D * dirz);
/*     */ 
/*     */     
/*  64 */     Player.field_70170_p.func_72956_a((Entity)Player, "random.explode", 1.0F, 1.5F);
/*     */     
/*  66 */     if (world.field_72995_K)
/*     */     {
/*     */       
/*  69 */       return true;
/*     */     }
/*     */ 
/*     */     
/*  73 */     for (int i = -width; i <= width; i++) {
/*     */       
/*  75 */       for (int j = -length; j <= length; j++) {
/*     */         
/*  77 */         for (int k = 0; k <= height + 1; k++) {
/*     */           
/*  79 */           if (k == height + 1) {
/*  80 */             world.func_147449_b(x + i, y + k, z + j, Blocks.field_150371_ca);
/*  81 */           } else if (k == 0) {
/*  82 */             world.func_147449_b(x + i, y + k, z + j, Blocks.field_150371_ca);
/*  83 */           } else if (i == width || j == length || i == -width || j == -length) {
/*  84 */             world.func_147449_b(x + i, y + k, z + j, Blocks.field_150359_w);
/*     */           } else {
/*  86 */             world.func_147449_b(x + i, y + k, z + j, Blocks.field_150350_a);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  94 */     if (!Player.field_71075_bZ.field_75098_d)
/*     */     {
/*  96 */       par1ItemStack.field_77994_a--;
/*     */     }
/*     */     
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 106 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ZooCage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */