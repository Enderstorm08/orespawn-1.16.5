/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.item.EntityXPOrb;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.AxisAlignedBB;
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
/*     */ 
/*     */ public class ExperienceCatcher
/*     */   extends Item
/*     */ {
/*     */   public ExperienceCatcher(int i) {
/*  35 */     this.field_77777_bU = 16;
/*  36 */     func_77637_a(CreativeTabs.field_78040_i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
/*  43 */     par2EntityPlayer.func_71038_i();
/*  44 */     System.out.printf("x, y,z, 7,8,9,10 == %d, %d, %d - %d, %f, %f, %f\n", new Object[] { Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(z), Integer.valueOf(par7), Float.valueOf(par8), Float.valueOf(par9), Float.valueOf(par10) });
/*  45 */     if (!par2EntityPlayer.field_70170_p.field_72995_K) {
/*  46 */       AxisAlignedBB bb = AxisAlignedBB.func_72330_a(x - 0.5D + par8, y, z - 0.5D + par10, x + 0.5D + par8, y + 2.0D, z + 0.5D + par10);
/*  47 */       List var5 = world.func_72872_a(EntityXPOrb.class, bb);
/*  48 */       Iterator<Entity> var2 = var5.iterator();
/*  49 */       while (var2.hasNext()) {
/*     */         
/*  51 */         Entity var3 = var2.next();
/*  52 */         if (var3 instanceof EntityXPOrb) {
/*     */           
/*  54 */           EntityXPOrb ex = (EntityXPOrb)var3;
/*     */           
/*  56 */           if (ex.func_70526_d() < 3 || world.field_73012_v.nextInt(5) == 1) {
/*     */             continue;
/*     */           }
/*  59 */           var3.func_70106_y();
/*     */           
/*  61 */           EntityItem entityItem = null;
/*  62 */           ItemStack itemStack = new ItemStack(Items.field_151062_by, 1, 0);
/*  63 */           entityItem = new EntityItem(par2EntityPlayer.field_70170_p, (par8 + x), y + 1.0D, (par10 + z), itemStack);
/*  64 */           if (entityItem != null) par2EntityPlayer.field_70170_p.func_72838_d((Entity)entityItem);
/*     */           
/*  66 */           itemStack = new ItemStack(Items.field_151007_F, 1, 0);
/*  67 */           entityItem = new EntityItem(par2EntityPlayer.field_70170_p, (par8 + x), y + 1.0D, (par10 + z), itemStack);
/*  68 */           if (entityItem != null) par2EntityPlayer.field_70170_p.func_72838_d((Entity)entityItem);
/*     */           
/*  70 */           itemStack = new ItemStack(Items.field_151055_y, 1, 0);
/*  71 */           entityItem = new EntityItem(par2EntityPlayer.field_70170_p, (par8 + x), y + 1.0D, (par10 + z), itemStack);
/*  72 */           if (entityItem != null) par2EntityPlayer.field_70170_p.func_72838_d((Entity)entityItem);
/*     */           
/*  74 */           if (!par2EntityPlayer.field_71075_bZ.field_75098_d)
/*     */           {
/*  76 */             par1ItemStack.field_77994_a--;
/*     */           }
/*  78 */           return true;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/*  83 */       EntityItem var4 = null;
/*  84 */       ItemStack is = new ItemStack(OreSpawnMain.MyExperienceCatcher, 1, 0);
/*  85 */       var4 = new EntityItem(par2EntityPlayer.field_70170_p, (par8 + x), y + 1.0D, (par10 + z), is);
/*  86 */       if (var4 != null) par2EntityPlayer.field_70170_p.func_72838_d((Entity)var4);
/*     */       
/*  88 */       par1ItemStack.field_77994_a--;
/*     */     } 
/*     */ 
/*     */     
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/* 100 */     par3EntityPlayer.func_71038_i();
/* 101 */     return par1ItemStack;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 106 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ExperienceCatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */