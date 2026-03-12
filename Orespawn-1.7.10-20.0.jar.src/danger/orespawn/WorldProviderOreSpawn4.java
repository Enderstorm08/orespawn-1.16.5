/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.world.WorldProvider;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import net.minecraft.world.biome.WorldChunkManager;
/*    */ import net.minecraft.world.biome.WorldChunkManagerHell;
/*    */ import net.minecraft.world.chunk.IChunkProvider;
/*    */ import net.minecraft.world.storage.WorldInfo;
/*    */ import net.minecraftforge.common.DimensionManager;
/*    */ 
/*    */ public class WorldProviderOreSpawn4
/*    */   extends WorldProvider {
/* 14 */   private BiomeGenUtopianPlains MyPlains = (BiomeGenUtopianPlains)(new BiomeGenUtopianPlains(OreSpawnMain.BiomeIslandsID)).func_76739_b(353825).func_76735_a("Islands").func_76732_a(0.7F, 0.5F);
/*    */ 
/*    */   
/*    */   public String func_80007_l() {
/* 18 */     return "Dimension-Islands";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_76567_e() {
/* 23 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76572_b() {
/* 28 */     this.MyPlains.setIslandCreatures();
/* 29 */     this.field_76578_c = (WorldChunkManager)new WorldChunkManagerHell(this.MyPlains, 0.01F);
/* 30 */     this.field_76578_c.func_76935_a(0, 0).func_76732_a(0.8F, 0.01F);
/* 31 */     this.field_76574_g = OreSpawnMain.DimensionID4;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWorldTime(long time) {
/* 36 */     WorldServer ws = DimensionManager.getWorld(this.field_76574_g);
/* 37 */     if (ws != null) {
/* 38 */       WorldInfo w = ws.func_72912_H();
/* 39 */       if (w != null) {
/*    */         
/* 41 */         if (time % 24000L > 12000L && ws.func_73056_e()) {
/*    */           
/* 43 */           long i = time + 24000L;
/* 44 */           i -= i % 24000L;
/* 45 */           for (int j = 0; j < (MinecraftServer.func_71276_C()).field_71305_c.length; j++)
/*    */           {
/* 47 */             (MinecraftServer.func_71276_C()).field_71305_c[j].func_72877_b(i);
/*    */           }
/*    */         } else {
/* 50 */           super.setWorldTime(time);
/*    */         } 
/*    */       } else {
/*    */         
/* 54 */         super.setWorldTime(time);
/*    */       } 
/*    */     } else {
/*    */       
/* 58 */       super.setWorldTime(time);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public IChunkProvider func_76555_c() {
/* 65 */     return new ChunkProviderOreSpawn4(this.field_76579_a, this.field_76579_a.func_72905_C(), true);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WorldProviderOreSpawn4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */