/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RTPBlock
/*    */   extends Block
/*    */ {
/*    */   public RTPBlock(int i) {
/* 26 */     super(Material.field_151576_e);
/* 27 */     func_149647_a(CreativeTabs.field_78030_b);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_149724_b(World world, int par2, int par3, int par4, Entity par5Entity) {
/* 36 */     if (par5Entity instanceof EntityPlayer) {
/* 37 */       EntityPlayer p = (EntityPlayer)par5Entity;
/* 38 */       EntityPlayerMP mp = null;
/* 39 */       if (par5Entity instanceof EntityPlayerMP) {
/* 40 */         mp = (EntityPlayerMP)par5Entity;
/*    */       }
/* 42 */       int x = par2, y = par3, z = par4, found = 0;
/*    */       
/* 44 */       for (int tries = 0; tries < 1000 && found == 0; tries++) {
/* 45 */         if (world.field_73012_v.nextInt(2) == 0) {
/* 46 */           x = par2 + 16 + world.field_73012_v.nextInt(8) - world.field_73012_v.nextInt(8);
/*    */         } else {
/* 48 */           x = par2 - 16 + world.field_73012_v.nextInt(8) - world.field_73012_v.nextInt(8);
/*    */         } 
/* 50 */         if (world.field_73012_v.nextInt(2) == 0) {
/* 51 */           z = par4 + 16 + world.field_73012_v.nextInt(8) - world.field_73012_v.nextInt(8);
/*    */         } else {
/* 53 */           z = par4 - 16 + world.field_73012_v.nextInt(8) - world.field_73012_v.nextInt(8);
/*    */         } 
/* 55 */         for (y = par3 - 4; y <= par3 + 4; y++) {
/* 56 */           if (world.func_147439_a(x, y - 1, z).func_149688_o().func_76220_a() && 
/* 57 */             world.func_147439_a(x, y, z) == Blocks.field_150350_a && 
/* 58 */             world.func_147439_a(x, y + 1, z) == Blocks.field_150350_a) {
/* 59 */             found = 1;
/*    */ 
/*    */             
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */       
/* 67 */       if (found != 0) {
/*    */         
/* 69 */         if (mp != null) {
/* 70 */           mp.field_71135_a.func_147364_a((x + 0.5F), y, (z + 0.5F), p.field_70177_z, 0.0F);
/*    */         } else {
/* 72 */           p.func_70012_b((x + 0.5F), y, (z + 0.5F), p.field_70177_z, 0.0F);
/*    */         } 
/*    */         
/* 75 */         for (int var3 = 0; var3 < 6; var3++) {
/*    */           
/* 77 */           world.func_72869_a("smoke", (x + 0.5F), (y + 2.25F), (z + 0.5F), 0.0D, 0.0D, 0.0D);
/* 78 */           world.func_72869_a("explode", (x + 0.5F), (y + 2.25F), (z + 0.5F), 0.0D, 0.0D, 0.0D);
/* 79 */           world.func_72869_a("reddust", (x + 0.5F), (y + 2.25F), (z + 0.5F), 0.0D, 0.0D, 0.0D);
/*    */         } 
/* 81 */         p.field_70170_p.func_72956_a((Entity)p, "random.explode", 1.0F, 1.5F);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 89 */     this.field_149761_L = iconRegister.func_94245_a("OreSpawn:" + func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\RTPBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */