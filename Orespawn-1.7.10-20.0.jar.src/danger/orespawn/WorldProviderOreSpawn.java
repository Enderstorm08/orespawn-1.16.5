/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.world.WorldProvider;
/*     */ import net.minecraft.world.WorldServer;
/*     */ import net.minecraft.world.biome.WorldChunkManager;
/*     */ import net.minecraft.world.biome.WorldChunkManagerHell;
/*     */ import net.minecraft.world.chunk.IChunkProvider;
/*     */ import net.minecraft.world.storage.WorldInfo;
/*     */ import net.minecraftforge.common.DimensionManager;
/*     */ 
/*     */ public class WorldProviderOreSpawn
/*     */   extends WorldProvider {
/*  14 */   private BiomeGenUtopianPlains MyPlains = (BiomeGenUtopianPlains)(new BiomeGenUtopianPlains(OreSpawnMain.BiomeUtopiaID)).func_76739_b(353825).func_76735_a("Utopia").func_76732_a(0.7F, 0.5F);
/*     */ 
/*     */   
/*     */   public String func_80007_l() {
/*  18 */     return "Dimension-Utopia";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_76567_e() {
/*  23 */     return true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWorldTime(long time) {
/*  87 */     WorldServer ws = DimensionManager.getWorld(this.field_76574_g);
/*  88 */     if (ws != null) {
/*  89 */       WorldInfo w = ws.func_72912_H();
/*  90 */       if (w != null) {
/*     */         
/*  92 */         if (time % 24000L > 12000L && ws.func_73056_e()) {
/*     */           
/*  94 */           long i = time + 24000L;
/*  95 */           i -= i % 24000L;
/*  96 */           for (int j = 0; j < (MinecraftServer.func_71276_C()).field_71305_c.length; j++)
/*     */           {
/*  98 */             (MinecraftServer.func_71276_C()).field_71305_c[j].func_72877_b(i);
/*     */           }
/*     */         } else {
/* 101 */           super.setWorldTime(time);
/*     */         } 
/*     */       } else {
/*     */         
/* 105 */         super.setWorldTime(time);
/*     */       } 
/*     */     } else {
/*     */       
/* 109 */       super.setWorldTime(time);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_76572_b() {
/* 115 */     this.field_76578_c = (WorldChunkManager)new WorldChunkManagerHell(this.MyPlains, 0.5F);
/* 116 */     this.field_76578_c.func_76935_a(0, 0).func_76732_a(0.7F, 0.5F);
/* 117 */     this.field_76574_g = OreSpawnMain.DimensionID;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public IChunkProvider func_76555_c() {
/* 123 */     return new ChunkProviderOreSpawn(this.field_76579_a, this.field_76579_a.func_72905_C(), true);
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\WorldProviderOreSpawn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */