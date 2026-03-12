/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.world.WorldProvider;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import net.minecraft.world.biome.WorldChunkManager;
/*    */ import net.minecraft.world.biome.WorldChunkManagerHell;
/*    */ import net.minecraft.world.chunk.IChunkProvider;
/*    */ import net.minecraft.world.storage.WorldInfo;
/*    */ import net.minecraftforge.common.BiomeManager;
/*    */ import net.minecraftforge.common.DimensionManager;
/*    */ 
/*    */ public class WorldProviderOreSpawn3
/*    */   extends WorldProvider {
/* 15 */   private BiomeGenUtopianPlains MyPlains = (BiomeGenUtopianPlains)(new BiomeGenUtopianPlains(OreSpawnMain.BiomeVillageID)).func_76739_b(353825).func_76735_a("Villages").func_76732_a(0.7F, 0.5F);
/*    */ 
/*    */   
/*    */   public String func_80007_l() {
/* 19 */     return "Dimension-VillageMania";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_76567_e() {
/* 24 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76572_b() {
/* 29 */     this.MyPlains.setVillageCreatures();
/* 30 */     this.field_76578_c = (WorldChunkManager)new WorldChunkManagerHell(this.MyPlains, 0.5F);
/* 31 */     this.field_76578_c.func_76935_a(0, 0).func_76732_a(0.7F, 0.5F);
/* 32 */     this.field_76574_g = OreSpawnMain.DimensionID3;
/* 33 */     BiomeManager.addVillageBiome(this.MyPlains, true);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWorldTime(long time) {
/* 38 */     WorldServer ws = DimensionManager.getWorld(this.field_76574_g);
/* 39 */     if (ws != null) {
/* 40 */       WorldInfo w = ws.func_72912_H();
/* 41 */       if (w != null) {
/*    */         
/* 43 */         if (time % 24000L > 12000L && ws.func_73056_e()) {
/*    */           
/* 45 */           long i = time + 24000L;
/* 46 */           i -= i % 24000L;
/* 47 */           for (int j = 0; j < (MinecraftServer.func_71276_C()).field_71305_c.length; j++)
/*    */           {
/* 49 */             (MinecraftServer.func_71276_C()).field_71305_c[j].func_72877_b(i);
/*    */           }
/*    */         } else {
/* 52 */           super.setWorldTime(time);
/*    */         } 
/*    */       } else {
/*    */         
/* 56 */         super.setWorldTime(time);
/*    */       } 
/*    */     } else {
/*    */       
/* 60 */       super.setWorldTime(time);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public IChunkProvider func_76555_c() {
/* 67 */     return new ChunkProviderOreSpawn3(this.field_76579_a, this.field_76579_a.func_72905_C(), true);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WorldProviderOreSpawn3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */