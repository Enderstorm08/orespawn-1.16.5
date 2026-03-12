/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.world.biome.BiomeGenBase;
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
/*     */ public class BiomeGenUtopianPlains
/*     */   extends BiomeGenBase
/*     */ {
/*     */   protected BiomeGenUtopianPlains(int par1) {
/*  20 */     super(par1);
/*     */ 
/*     */ 
/*     */     
/*  24 */     if (OreSpawnMain.GazelleEnable != 0) {
/*  25 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(Gazelle.class, 10, 2, 4));
/*     */     }
/*  27 */     if (OreSpawnMain.FireflyEnable != 0) {
/*  28 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Firefly.class, 15, 3, 6));
/*     */     }
/*  30 */     if (OreSpawnMain.GirlfriendEnable != 0) {
/*  31 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(Girlfriend.class, 5, 2, 3));
/*     */     }
/*  33 */     if (OreSpawnMain.BoyfriendEnable != 0) {
/*  34 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(Boyfriend.class, 5, 2, 3));
/*     */     }
/*  36 */     if (OreSpawnMain.CowEnable != 0) {
/*     */       
/*  38 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(RedCow.class, 10, 4, 8));
/*     */       
/*  40 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(GoldCow.class, 8, 2, 6));
/*     */       
/*  42 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(EnchantedCow.class, 5, 2, 4));
/*     */     } 
/*  44 */     if (OreSpawnMain.ButterflyEnable != 0) {
/*  45 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityButterfly.class, 20, 3, 6));
/*     */     }
/*  47 */     if (OreSpawnMain.MothEnable != 0) {
/*  48 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityLunaMoth.class, 10, 1, 5));
/*     */     }
/*  50 */     if (OreSpawnMain.ChipmunkEnable != 0) {
/*  51 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Chipmunk.class, 5, 1, 2));
/*     */     }
/*  53 */     if (OreSpawnMain.CockateilEnable != 0) {
/*  54 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Cockateil.class, 10, 2, 4));
/*     */     }
/*     */     
/*  57 */     if (OreSpawnMain.BlackAntEnable != 0) {
/*  58 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityAnt.class, 10, 5, 15));
/*     */     }
/*     */     
/*  61 */     if (OreSpawnMain.RedAntEnable != 0) {
/*  62 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityRedAnt.class, 4, 3, 6));
/*     */     }
/*     */     
/*  65 */     if (OreSpawnMain.RainbowAntEnable != 0) {
/*  66 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityRainbowAnt.class, 8, 3, 6));
/*     */     }
/*     */     
/*  69 */     if (OreSpawnMain.UnstableAntEnable != 0) {
/*  70 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityUnstableAnt.class, 4, 3, 6));
/*     */     }
/*  72 */     if (OreSpawnMain.GoldFishEnable != 0) {
/*  73 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(GoldFish.class, 1, 1, 1));
/*     */     }
/*  75 */     if (OreSpawnMain.WhaleEnable != 0) {
/*  76 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Whale.class, 1, 1, 1));
/*     */     }
/*  78 */     if (OreSpawnMain.FlounderEnable != 0) {
/*  79 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Flounder.class, 2, 2, 4));
/*     */     }
/*  81 */     if (OreSpawnMain.CoinEnable != 0) {
/*  82 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Coin.class, 2, 1, 1));
/*     */     }
/*  84 */     if (OreSpawnMain.CricketEnable != 0) {
/*  85 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Cricket.class, 5, 4, 6));
/*     */     }
/*  87 */     if (OreSpawnMain.FrogEnable != 0) {
/*  88 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Frog.class, 5, 4, 6));
/*     */     }
/*  90 */     this.field_76760_I.field_76832_z = -999;
/*  91 */     this.field_76760_I.field_76802_A = 4;
/*  92 */     this.field_76760_I.field_76803_B = 6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIslandCreatures() {
/* 101 */     this.field_76762_K = null;
/* 102 */     this.field_76761_J = null;
/* 103 */     this.field_76755_L = null;
/* 104 */     this.field_82914_M = null;
/* 105 */     this.field_76762_K = new ArrayList();
/* 106 */     this.field_76761_J = new ArrayList();
/* 107 */     this.field_76755_L = new ArrayList();
/* 108 */     this.field_82914_M = new ArrayList();
/*     */ 
/*     */     
/* 111 */     if (OreSpawnMain.ButterflyEnable != 0) {
/* 112 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityButterfly.class, 8, 2, 6));
/*     */     }
/* 114 */     if (OreSpawnMain.CockateilEnable != 0) {
/* 115 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Cockateil.class, 4, 1, 2));
/*     */     }
/* 117 */     if (OreSpawnMain.MothEnable != 0) {
/* 118 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityLunaMoth.class, 8, 2, 4));
/*     */     }
/* 120 */     if (OreSpawnMain.FireflyEnable != 0) {
/* 121 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Firefly.class, 10, 4, 8));
/*     */     }
/* 123 */     if (OreSpawnMain.DragonEnable != 0) {
/* 124 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Dragon.class, 1, 1, 2));
/*     */     }
/* 126 */     if (OreSpawnMain.StinkyEnable != 0) {
/* 127 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Stinky.class, 2, 1, 2));
/*     */     }
/* 129 */     if (OreSpawnMain.CliffRacerEnable != 0) {
/* 130 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(CliffRacer.class, 20, 3, 6));
/*     */     }
/* 132 */     if (OreSpawnMain.CloudSharkEnable != 0) {
/* 133 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(CloudShark.class, 1, 1, 1));
/*     */     }
/* 135 */     if (OreSpawnMain.GoldFishEnable != 0) {
/* 136 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(GoldFish.class, 5, 2, 4));
/*     */     }
/* 138 */     if (OreSpawnMain.CreepingHorrorEnable != 0) {
/* 139 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(CreepingHorror.class, 60, 4, 8));
/*     */     }
/* 141 */     if (OreSpawnMain.TerribleTerrorEnable != 0) {
/* 142 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(TerribleTerror.class, 25, 3, 6));
/*     */     }
/* 144 */     if (OreSpawnMain.LurkingTerrorEnable != 0) {
/* 145 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(LurkingTerror.class, 1, 1, 1));
/*     */     }
/* 147 */     if (OreSpawnMain.PitchBlackEnable != 0) {
/* 148 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(PitchBlack.class, 15, 3, 6));
/*     */     }
/* 150 */     if (OreSpawnMain.LeafMonsterEnable != 0) {
/* 151 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(LeafMonster.class, 35, 2, 4));
/*     */     }
/* 153 */     if (OreSpawnMain.EnderReaperEnable != 0) {
/* 154 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(EnderReaper.class, 25, 2, 4));
/*     */     }
/* 156 */     if (OreSpawnMain.HerculesBeetleEnable != 0) {
/* 157 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(HerculesBeetle.class, 5, 1, 2));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCrystalCreatures() {
/* 167 */     this.field_76762_K = null;
/* 168 */     this.field_76761_J = null;
/* 169 */     this.field_76755_L = null;
/* 170 */     this.field_82914_M = null;
/* 171 */     this.field_76762_K = new ArrayList();
/* 172 */     this.field_76761_J = new ArrayList();
/* 173 */     this.field_76755_L = new ArrayList();
/* 174 */     this.field_82914_M = new ArrayList();
/*     */ 
/*     */     
/* 177 */     if (OreSpawnMain.CowEnable != 0) {
/* 178 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(CrystalCow.class, 1, 1, 4));
/*     */     }
/* 180 */     if (OreSpawnMain.FairyEnable != 0) {
/* 181 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Fairy.class, 15, 4, 8));
/*     */     }
/* 183 */     if (OreSpawnMain.PeacockEnable != 0) {
/* 184 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Peacock.class, 25, 4, 8));
/*     */     }
/* 186 */     if (OreSpawnMain.MantisEnable != 0) {
/* 187 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Mantis.class, 2, 1, 2));
/*     */     }
/* 189 */     if (OreSpawnMain.RotatorEnable != 0) {
/* 190 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Rotator.class, 4, 1, 2));
/*     */     }
/* 192 */     if (OreSpawnMain.VortexEnable != 0) {
/* 193 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Vortex.class, 3, 1, 2));
/*     */     }
/* 195 */     if (OreSpawnMain.UrchinEnable != 0) {
/* 196 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Urchin.class, 15, 2, 4));
/*     */     }
/* 198 */     if (OreSpawnMain.DungeonBeastEnable != 0) {
/* 199 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(DungeonBeast.class, 30, 4, 6));
/*     */     }
/* 201 */     if (OreSpawnMain.RatEnable != 0) {
/* 202 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Rat.class, 40, 4, 6));
/*     */     }
/* 204 */     if (OreSpawnMain.ButterflyEnable != 0) {
/* 205 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityButterfly.class, 10, 2, 4));
/*     */     }
/* 207 */     if (OreSpawnMain.CockateilEnable != 0) {
/* 208 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Cockateil.class, 2, 1, 2));
/*     */     }
/* 210 */     if (OreSpawnMain.MothEnable != 0) {
/* 211 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityLunaMoth.class, 4, 1, 2));
/*     */     }
/* 213 */     if (OreSpawnMain.WhaleEnable != 0) {
/* 214 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Whale.class, 1, 1, 2));
/*     */     }
/* 216 */     if (OreSpawnMain.CrabEnable != 0) {
/* 217 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Crab.class, 1, 2, 4));
/*     */     }
/* 219 */     if (OreSpawnMain.FlounderEnable != 0) {
/* 220 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Flounder.class, 5, 6, 8));
/*     */     }
/* 222 */     if (OreSpawnMain.IrukandjiEnable != 0) {
/* 223 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Irukandji.class, 4, 2, 3));
/*     */     }
/* 225 */     if (OreSpawnMain.SkateEnable != 0) {
/* 226 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Skate.class, 2, 3, 6));
/*     */     }
/* 228 */     if (OreSpawnMain.FrogEnable != 0) {
/* 229 */       this.field_76755_L.add(new BiomeGenBase.SpawnListEntry(Frog.class, 1, 3, 5));
/*     */     }
/*     */     
/* 232 */     this.field_76760_I.field_76802_A = -999;
/* 233 */     this.field_76760_I.field_76803_B = -999;
/* 234 */     this.field_76760_I.field_76832_z = -999;
/* 235 */     this.field_76760_I.field_76807_J = -999;
/* 236 */     this.field_76760_I.field_76798_D = -999;
/* 237 */     this.field_76760_I.field_76799_E = -999;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVillageCreatures() {
/* 247 */     if (OreSpawnMain.Robot1Enable != 0) {
/* 248 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot1.class, 25, 4, 8));
/*     */     }
/* 250 */     if (OreSpawnMain.Robot2Enable != 0) {
/* 251 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot2.class, 16, 2, 8));
/*     */     }
/* 253 */     if (OreSpawnMain.Robot3Enable != 0) {
/* 254 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot3.class, 12, 2, 4));
/*     */     }
/* 256 */     if (OreSpawnMain.Robot4Enable != 0) {
/* 257 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot4.class, 8, 1, 2));
/*     */     }
/* 259 */     if (OreSpawnMain.Robot5Enable != 0) {
/* 260 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot5.class, 20, 4, 8));
/*     */     }
/* 262 */     if (OreSpawnMain.JefferyEnable != 0) {
/* 263 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(GiantRobot.class, 8, 1, 2));
/*     */     }
/* 265 */     if (OreSpawnMain.SpiderDriverEnable != 0) {
/* 266 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(SpiderDriver.class, 20, 3, 5));
/*     */     }
/* 268 */     if (OreSpawnMain.GodzillaEnable != 0) {
/* 269 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Godzilla.class, 2, 1, 1));
/*     */     }
/*     */     
/* 272 */     if (OreSpawnMain.FireflyEnable != 0) {
/* 273 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Firefly.class, 20, 3, 6));
/*     */     }
/* 275 */     if (OreSpawnMain.GirlfriendEnable != 0) {
/* 276 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(Girlfriend.class, 4, 2, 3));
/*     */     }
/* 278 */     if (OreSpawnMain.BoyfriendEnable != 0) {
/* 279 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(Boyfriend.class, 4, 2, 3));
/*     */     }
/* 281 */     if (OreSpawnMain.CowEnable != 0) {
/*     */       
/* 283 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(RedCow.class, 15, 4, 8));
/*     */       
/* 285 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(GoldCow.class, 12, 2, 6));
/*     */       
/* 287 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(EnchantedCow.class, 8, 2, 4));
/*     */     } 
/* 289 */     if (OreSpawnMain.ButterflyEnable != 0) {
/* 290 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityButterfly.class, 25, 3, 6));
/*     */     }
/* 292 */     if (OreSpawnMain.MothEnable != 0) {
/* 293 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityLunaMoth.class, 20, 1, 5));
/*     */     }
/* 295 */     if (OreSpawnMain.ChipmunkEnable != 0) {
/* 296 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Chipmunk.class, 8, 1, 2));
/*     */     }
/* 298 */     if (OreSpawnMain.CockateilEnable != 0) {
/* 299 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Cockateil.class, 15, 2, 4));
/*     */     }
/*     */     
/* 302 */     if (OreSpawnMain.BlackAntEnable != 0) {
/* 303 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityAnt.class, 6, 3, 6));
/*     */     }
/*     */     
/* 306 */     if (OreSpawnMain.RedAntEnable != 0) {
/* 307 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityRedAnt.class, 6, 3, 6));
/*     */     }
/*     */     
/* 310 */     if (OreSpawnMain.RainbowAntEnable != 0) {
/* 311 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityRainbowAnt.class, 15, 4, 8));
/*     */     }
/*     */     
/* 314 */     if (OreSpawnMain.UnstableAntEnable != 0) {
/* 315 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityUnstableAnt.class, 6, 3, 6));
/*     */     }
/* 317 */     if (OreSpawnMain.TermiteEnable != 0) {
/* 318 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Termite.class, 3, 2, 4));
/*     */     }
/* 320 */     if (OreSpawnMain.TshirtEnable != 0) {
/* 321 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Tshirt.class, 10, 1, 1));
/*     */     }
/* 323 */     if (OreSpawnMain.CoinEnable != 0) {
/* 324 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Coin.class, 4, 1, 1));
/*     */     }
/* 326 */     if (OreSpawnMain.CriminalEnable != 0) {
/* 327 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(BandP.class, 45, 1, 2));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChaosCreatures() {
/* 337 */     this.field_76762_K = null;
/* 338 */     this.field_76761_J = null;
/* 339 */     this.field_76755_L = null;
/* 340 */     this.field_82914_M = null;
/* 341 */     this.field_76762_K = new ArrayList();
/* 342 */     this.field_76761_J = new ArrayList();
/* 343 */     this.field_76755_L = new ArrayList();
/* 344 */     this.field_82914_M = new ArrayList();
/*     */     
/* 346 */     this.field_76760_I.field_76802_A = 2;
/* 347 */     this.field_76760_I.field_76803_B = 4;
/* 348 */     this.field_76760_I.field_76832_z = 1;
/* 349 */     this.field_76760_I.field_76807_J = -999;
/* 350 */     this.field_76760_I.field_76798_D = -999;
/* 351 */     this.field_76760_I.field_76799_E = -999;
/*     */ 
/*     */     
/* 354 */     if (OreSpawnMain.ButterflyEnable != 0) {
/* 355 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityButterfly.class, 20, 3, 6));
/*     */     }
/* 357 */     if (OreSpawnMain.MothEnable != 0) {
/* 358 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(EntityLunaMoth.class, 10, 1, 5));
/*     */     }
/* 360 */     if (OreSpawnMain.CockateilEnable != 0) {
/* 361 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Cockateil.class, 10, 2, 4));
/*     */     }
/* 363 */     if (OreSpawnMain.FireflyEnable != 0) {
/* 364 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Firefly.class, 15, 3, 6));
/*     */     }
/* 366 */     if (OreSpawnMain.CliffRacerEnable != 0) {
/* 367 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(CliffRacer.class, 30, 3, 6));
/*     */     }
/* 369 */     if (OreSpawnMain.CloudSharkEnable != 0) {
/* 370 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(CloudShark.class, 2, 1, 1));
/*     */     }
/* 372 */     if (OreSpawnMain.GoldFishEnable != 0) {
/* 373 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(GoldFish.class, 10, 2, 4));
/*     */     }
/* 375 */     if (OreSpawnMain.FairyEnable != 0) {
/* 376 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Fairy.class, 5, 2, 4));
/*     */     }
/* 378 */     if (OreSpawnMain.BaryonyxEnable != 0) {
/* 379 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Baryonyx.class, 5, 2, 4));
/*     */     }
/* 381 */     if (OreSpawnMain.BeeEnable != 0) {
/* 382 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Bee.class, 2, 2, 4));
/*     */     }
/* 384 */     if (OreSpawnMain.CassowaryEnable != 0) {
/* 385 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Cassowary.class, 15, 2, 4));
/*     */     }
/* 387 */     if (OreSpawnMain.DragonflyEnable != 0) {
/* 388 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Dragonfly.class, 5, 2, 4));
/*     */     }
/* 390 */     if (OreSpawnMain.PeacockEnable != 0) {
/* 391 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Peacock.class, 15, 2, 4));
/*     */     }
/* 393 */     if (OreSpawnMain.StinkBugEnable != 0) {
/* 394 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(StinkBug.class, 10, 2, 4));
/*     */     }
/* 396 */     if (OreSpawnMain.OstrichEnable != 0) {
/* 397 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Ostrich.class, 1, 1, 2));
/*     */     }
/* 399 */     if (OreSpawnMain.ChipmunkEnable != 0) {
/* 400 */       this.field_82914_M.add(new BiomeGenBase.SpawnListEntry(Chipmunk.class, 1, 1, 2));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 406 */     if (OreSpawnMain.BeaverEnable != 0) {
/* 407 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(Beaver.class, 1, 1, 2));
/*     */     }
/* 409 */     if (OreSpawnMain.CowEnable != 0) {
/*     */       
/* 411 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(RedCow.class, 3, 2, 4));
/*     */       
/* 413 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(GoldCow.class, 2, 2, 4));
/*     */       
/* 415 */       this.field_76762_K.add(new BiomeGenBase.SpawnListEntry(EnchantedCow.class, 1, 2, 4));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 422 */     if (OreSpawnMain.VortexEnable != 0) {
/* 423 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Vortex.class, 1, 1, 2));
/*     */     }
/* 425 */     if (OreSpawnMain.PitchBlackEnable != 0) {
/* 426 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(PitchBlack.class, 1, 1, 2));
/*     */     }
/* 428 */     if (OreSpawnMain.TerribleTerrorEnable != 0) {
/* 429 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(TerribleTerror.class, 4, 2, 6));
/*     */     }
/* 431 */     if (OreSpawnMain.AlosaurusEnable != 0) {
/* 432 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Alosaurus.class, 1, 1, 1));
/*     */     }
/* 434 */     if (OreSpawnMain.BasiliskEnable != 0) {
/* 435 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Basilisk.class, 1, 1, 1));
/*     */     }
/* 437 */     if (OreSpawnMain.Robot1Enable != 0) {
/* 438 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot1.class, 5, 2, 8));
/*     */     }
/* 440 */     if (OreSpawnMain.Robot2Enable != 0) {
/* 441 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot2.class, 2, 1, 4));
/*     */     }
/* 443 */     if (OreSpawnMain.Robot3Enable != 0) {
/* 444 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot3.class, 2, 1, 4));
/*     */     }
/* 446 */     if (OreSpawnMain.Robot4Enable != 0) {
/* 447 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot4.class, 1, 1, 2));
/*     */     }
/* 449 */     if (OreSpawnMain.Robot5Enable != 0) {
/* 450 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Robot5.class, 2, 3, 5));
/*     */     }
/* 452 */     if (OreSpawnMain.CaterKillerEnable != 0) {
/* 453 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(CaterKiller.class, 1, 1, 1));
/*     */     }
/* 455 */     if (OreSpawnMain.CaveFisherEnable != 0) {
/* 456 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(CaveFisher.class, 5, 1, 5));
/*     */     }
/* 458 */     if (OreSpawnMain.CreepingHorrorEnable != 0) {
/* 459 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(CreepingHorror.class, 5, 1, 5));
/*     */     }
/* 461 */     if (OreSpawnMain.CryolophosaurusEnable != 0) {
/* 462 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Cryolophosaurus.class, 5, 1, 5));
/*     */     }
/* 464 */     if (OreSpawnMain.UrchinEnable != 0) {
/* 465 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Urchin.class, 2, 1, 5));
/*     */     }
/* 467 */     if (OreSpawnMain.DungeonBeastEnable != 0) {
/* 468 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(DungeonBeast.class, 2, 1, 5));
/*     */     }
/* 470 */     if (OreSpawnMain.EmperorScorpionEnable != 0) {
/* 471 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(EmperorScorpion.class, 1, 1, 1));
/*     */     }
/* 473 */     if (OreSpawnMain.EnderKnightEnable != 0) {
/* 474 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(EnderKnight.class, 2, 1, 2));
/*     */     }
/* 476 */     if (OreSpawnMain.EnderReaperEnable != 0) {
/* 477 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(EnderReaper.class, 1, 1, 1));
/*     */     }
/* 479 */     if (OreSpawnMain.HammerheadEnable != 0) {
/* 480 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Hammerhead.class, 1, 1, 1));
/*     */     }
/* 482 */     if (OreSpawnMain.HerculesBeetleEnable != 0) {
/* 483 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(HerculesBeetle.class, 1, 1, 1));
/*     */     }
/* 485 */     if (OreSpawnMain.TrooperBugEnable != 0) {
/* 486 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(TrooperBug.class, 1, 1, 1));
/*     */     }
/* 488 */     if (OreSpawnMain.MolenoidEnable != 0) {
/* 489 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Molenoid.class, 1, 1, 1));
/*     */     }
/* 491 */     if (OreSpawnMain.MothraEnable != 0) {
/* 492 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Mothra.class, 1, 1, 1));
/*     */     }
/* 494 */     if (OreSpawnMain.BrutalflyEnable != 0) {
/* 495 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Brutalfly.class, 1, 1, 1));
/*     */     }
/* 497 */     if (OreSpawnMain.RatEnable != 0) {
/* 498 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Rat.class, 10, 1, 10));
/*     */     }
/* 500 */     if (OreSpawnMain.RotatorEnable != 0) {
/* 501 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Rotator.class, 1, 1, 3));
/*     */     }
/* 503 */     if (OreSpawnMain.ScorpionEnable != 0) {
/* 504 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Scorpion.class, 2, 1, 3));
/*     */     }
/* 506 */     if (OreSpawnMain.SpitBugEnable != 0) {
/* 507 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(SpitBug.class, 2, 1, 3));
/*     */     }
/* 509 */     if (OreSpawnMain.NastysaurusEnable != 0) {
/* 510 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Nastysaurus.class, 1, 1, 1));
/*     */     }
/* 512 */     if (OreSpawnMain.TRexEnable != 0) {
/* 513 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(TRex.class, 1, 1, 1));
/*     */     }
/* 515 */     if (OreSpawnMain.LeafMonsterEnable != 0) {
/* 516 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(LeafMonster.class, 2, 1, 4));
/*     */     }
/* 518 */     if (OreSpawnMain.PointysaurusEnable != 0) {
/* 519 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Pointysaurus.class, 2, 1, 4));
/*     */     }
/* 521 */     if (OreSpawnMain.LeonEnable != 0) {
/* 522 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Leon.class, 1, 1, 1));
/*     */     }
/* 524 */     if (OreSpawnMain.MantisEnable != 0) {
/* 525 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(Mantis.class, 1, 1, 1));
/*     */     }
/* 527 */     if (OreSpawnMain.LurkingTerrorEnable != 0) {
/* 528 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(LurkingTerror.class, 1, 1, 1));
/*     */     }
/* 530 */     if (OreSpawnMain.GammaMetroidEnable != 0)
/* 531 */       this.field_76761_J.add(new BiomeGenBase.SpawnListEntry(GammaMetroid.class, 1, 1, 1)); 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\BiomeGenUtopianPlains.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */