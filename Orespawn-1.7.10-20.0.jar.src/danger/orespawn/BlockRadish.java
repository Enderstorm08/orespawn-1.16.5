/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.BlockCrops;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.util.IIcon;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockRadish
/*    */   extends BlockCrops
/*    */ {
/*    */   private IIcon[] iconArray;
/*    */   
/*    */   public BlockRadish(int par1) {}
/*    */   
/*    */   public IIcon func_149691_a(int par1, int par2) {
/* 30 */     if (par2 < 7) {
/*    */       
/* 32 */       if (par2 >= 6)
/*    */       {
/* 34 */         par2 = 4;
/*    */       }
/* 36 */       return this.iconArray[par2 >> 1];
/*    */     } 
/*    */ 
/*    */     
/* 40 */     return this.iconArray[3];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_149745_a(Random par1Random) {
/* 49 */     return 2 + par1Random.nextInt(4);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected Item func_149866_i() {
/* 57 */     return OreSpawnMain.MyRadish;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected Item func_149865_P() {
/* 65 */     return OreSpawnMain.MyRadish;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister par1IIconRegister) {
/* 72 */     this.iconArray = new IIcon[4];
/*    */     
/* 74 */     for (int i = 0; i < this.iconArray.length; i++)
/*    */     {
/* 76 */       this.iconArray[i] = par1IIconRegister.func_94245_a("OreSpawn:radish_" + i);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BlockRadish.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */