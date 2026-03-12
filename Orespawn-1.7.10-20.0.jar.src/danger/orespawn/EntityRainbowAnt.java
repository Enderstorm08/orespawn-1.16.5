/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.entity.EntityCreature;
/*    */ import net.minecraft.entity.SharedMonsterAttributes;
/*    */ import net.minecraft.entity.ai.EntityAIBase;
/*    */ import net.minecraft.entity.ai.EntityAIPanic;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.world.World;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntityRainbowAnt
/*    */   extends EntityAnt
/*    */ {
/*    */   public EntityRainbowAnt(World par1World) {
/* 31 */     super(par1World);
/*    */     
/* 33 */     func_70105_a(0.1F, 0.1F);
/* 34 */     this.field_70728_aV = 0;
/* 35 */     func_70661_as().func_75491_a(true);
/* 36 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142D));
/* 37 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 9, 1.0D));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void func_110147_ax() {
/* 42 */     super.func_110147_ax();
/* 43 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/* 44 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/* 45 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/* 54 */     if (par1EntityPlayer == null) return false;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 60 */     if (!(par1EntityPlayer instanceof EntityPlayerMP)) return false;
/*    */ 
/*    */     
/* 63 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/* 64 */     if (var2 != null && 
/* 65 */       var2.field_77994_a <= 0) {
/* 66 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/* 67 */       var2 = null;
/*    */     } 
/*    */     
/* 70 */     if (var2 != null) {
/* 71 */       return false;
/*    */     }
/*    */     
/* 74 */     if (par1EntityPlayer.field_71093_bK != OreSpawnMain.DimensionID3) {
/* 75 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID3, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(OreSpawnMain.DimensionID3), OreSpawnMain.DimensionID3, this.field_70170_p));
/*    */     } else {
/*    */       
/* 78 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(0), 0, this.field_70170_p));
/*    */     } 
/*    */ 
/*    */     
/* 82 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityRainbowAnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */