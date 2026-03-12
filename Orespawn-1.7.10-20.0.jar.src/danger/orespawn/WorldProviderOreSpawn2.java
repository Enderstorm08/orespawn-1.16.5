/*    */ package danger.orespawn;
/*    */ 
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.world.WorldProvider;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import net.minecraft.world.biome.BiomeGenBase;
/*    */ import net.minecraft.world.biome.WorldChunkManager;
/*    */ import net.minecraft.world.biome.WorldChunkManagerHell;
/*    */ import net.minecraft.world.chunk.IChunkProvider;
/*    */ import net.minecraft.world.storage.WorldInfo;
/*    */ import net.minecraftforge.common.DimensionManager;
/*    */ 
/*    */ public class WorldProviderOreSpawn2
/*    */   extends WorldProvider {
/*    */   public String func_80007_l() {
/* 16 */     return "Dimension-Extreme";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_76567_e() {
/* 21 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_76572_b() {
/* 26 */     this.field_76578_c = (WorldChunkManager)new WorldChunkManagerHell(BiomeGenBase.field_76770_e, 0.01F);
/* 27 */     this.field_76578_c.func_76935_a(0, 0).func_76732_a(0.8F, 0.01F);
/* 28 */     this.field_76574_g = OreSpawnMain.DimensionID2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWorldTime(long time) {
/* 33 */     WorldServer ws = DimensionManager.getWorld(this.field_76574_g);
/* 34 */     if (ws != null) {
/* 35 */       WorldInfo w = ws.func_72912_H();
/* 36 */       if (w != null) {
/*    */         
/* 38 */         if (time % 24000L > 12000L && ws.func_73056_e()) {
/*    */           
/* 40 */           long i = time + 24000L;
/* 41 */           i -= i % 24000L;
/* 42 */           for (int j = 0; j < (MinecraftServer.func_71276_C()).field_71305_c.length; j++)
/*    */           {
/* 44 */             (MinecraftServer.func_71276_C()).field_71305_c[j].func_72877_b(i);
/*    */           }
/*    */         } else {
/* 47 */           super.setWorldTime(time);
/*    */         } 
/*    */       } else {
/*    */         
/* 51 */         super.setWorldTime(time);
/*    */       } 
/*    */     } else {
/*    */       
/* 55 */       super.setWorldTime(time);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public IChunkProvider func_76555_c() {
/* 62 */     return new ChunkProviderOreSpawn2(this.field_76579_a, this.field_76579_a.func_72905_C(), true);
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WorldProviderOreSpawn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */