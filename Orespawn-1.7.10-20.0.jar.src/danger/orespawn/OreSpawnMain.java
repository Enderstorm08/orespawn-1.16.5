/*      */ package danger.orespawn;
/*      */ 
/*      */ import cpw.mods.fml.common.Mod;
/*      */ import cpw.mods.fml.common.Mod.EventHandler;
/*      */ import cpw.mods.fml.common.Mod.Instance;
/*      */ import cpw.mods.fml.common.SidedProxy;
/*      */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*      */ import cpw.mods.fml.common.event.FMLPostInitializationEvent;
/*      */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*      */ import cpw.mods.fml.common.network.NetworkRegistry;
/*      */ import cpw.mods.fml.common.registry.EntityRegistry;
/*      */ import cpw.mods.fml.common.registry.GameRegistry;
/*      */ import cpw.mods.fml.common.registry.LanguageRegistry;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.GregorianCalendar;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.block.BlockDispenser;
/*      */ import net.minecraft.creativetab.CreativeTabs;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.EnumCreatureType;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.Item;
/*      */ import net.minecraft.item.ItemArmor;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.util.AxisAlignedBB;
/*      */ import net.minecraft.util.MovingObjectPosition;
/*      */ import net.minecraft.util.Vec3;
/*      */ import net.minecraft.util.WeightedRandomChestContent;
/*      */ import net.minecraft.world.World;
/*      */ import net.minecraft.world.biome.BiomeGenBase;
/*      */ import net.minecraft.world.chunk.Chunk;
/*      */ import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
/*      */ import net.minecraftforge.common.ChestGenHooks;
/*      */ import net.minecraftforge.common.DimensionManager;
/*      */ import net.minecraftforge.common.config.Configuration;
/*      */ import net.minecraftforge.common.util.EnumHelper;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Mod(modid = "OreSpawn", name = "OreSpawn", version = "1.7.10.20")
/*      */ public class OreSpawnMain
/*      */ {
/*      */   @SidedProxy(clientSide = "danger.orespawn.ClientProxyOreSpawn", serverSide = "danger.orespawn.CommonProxyOreSpawn")
/*      */   public static CommonProxyOreSpawn proxy;
/*      */   @Instance("OreSpawn")
/*      */   public static OreSpawnMain instance;
/*  101 */   public static KeyHandler MyKeyhandler = null;
/*  102 */   public static int flyup_keystate = 0;
/*      */   
/*  104 */   public static int BaseBlockID = 2700;
/*  105 */   public static int BaseItemID = 9000;
/*  106 */   public static int BaseBiomeID = 120;
/*  107 */   public static int BaseDimensionID = 80;
/*      */   
/*  109 */   public static int BiomeUtopiaID = 0;
/*  110 */   public static int BiomeIslandsID = 0;
/*  111 */   public static int BiomeCrystalID = 0;
/*  112 */   public static int BiomeVillageID = 0;
/*  113 */   public static int BiomeChaosID = 0;
/*  114 */   public static int DimensionID = 0;
/*  115 */   public static int DimensionID2 = 0;
/*  116 */   public static int DimensionID3 = 0;
/*  117 */   public static int DimensionID4 = 0;
/*  118 */   public static int DimensionID5 = 0;
/*  119 */   public static int DimensionID6 = 0;
/*      */   
/*  121 */   public static int godzilla_has_spawned = 0;
/*  122 */   public static int current_dimension = 0;
/*  123 */   public static int valentines_day = 0;
/*  124 */   public static int easter_day = 0;
/*  125 */   public static int ultimate_sword_pvp = 0;
/*  126 */   public static int big_bertha_pvp = 0;
/*  127 */   public static int bro_mode = 0;
/*  128 */   public static int enableduplicatortree = 1;
/*  129 */   public static int RoyalGlideEnable = 1;
/*  130 */   public static int DragonflyHorseFriendly = 0;
/*  131 */   public static int PlayNicely = 0;
/*  132 */   public static int MinersDreamExpensive = 0;
/*  133 */   public static int DisableOverworldDungeons = 0;
/*  134 */   public static int FullPowerKingEnable = 0;
/*      */   
/*  136 */   public static ArmorStats Amethyst_armorstats = null;
/*  137 */   public static ArmorStats Emerald_armorstats = null;
/*  138 */   public static ArmorStats Experience_armorstats = null;
/*  139 */   public static ArmorStats MothScale_armorstats = null;
/*  140 */   public static ArmorStats LavaEel_armorstats = null;
/*  141 */   public static ArmorStats Ultimate_armorstats = null;
/*  142 */   public static ArmorStats Pink_armorstats = null;
/*  143 */   public static ArmorStats TigersEye_armorstats = null;
/*  144 */   public static ArmorStats Peacock_armorstats = null;
/*  145 */   public static ArmorStats Mobzilla_armorstats = null;
/*  146 */   public static ArmorStats Ruby_armorstats = null;
/*  147 */   public static ArmorStats Royal_armorstats = null;
/*  148 */   public static ArmorStats Lapis_armorstats = null;
/*  149 */   public static ArmorStats Queen_armorstats = null;
/*      */   
/*  151 */   public static int AllMobsDisable = 0;
/*  152 */   public static int MosquitoEnable = 1;
/*  153 */   public static int RockEnable = 1;
/*  154 */   public static int GhostEnable = 1;
/*  155 */   public static int GhostSkellyEnable = 1;
/*  156 */   public static int SpiderDriverEnable = 1;
/*  157 */   public static int JefferyEnable = 1;
/*  158 */   public static int MothraEnable = 1;
/*  159 */   public static int BrutalflyEnable = 1;
/*  160 */   public static int NastysaurusEnable = 1;
/*  161 */   public static int PointysaurusEnable = 1;
/*  162 */   public static int CricketEnable = 1;
/*  163 */   public static int FrogEnable = 1;
/*  164 */   public static int MothraPeaceful = 0;
/*  165 */   public static int BlackAntEnable = 1;
/*  166 */   public static int RedAntEnable = 1;
/*  167 */   public static int TermiteEnable = 1;
/*  168 */   public static int UnstableAntEnable = 1;
/*  169 */   public static int RainbowAntEnable = 1;
/*  170 */   public static int AlosaurusEnable = 1;
/*  171 */   public static int HammerheadEnable = 1;
/*  172 */   public static int LeonEnable = 1;
/*  173 */   public static int CaterKillerEnable = 1;
/*  174 */   public static int MolenoidEnable = 1;
/*  175 */   public static int TRexEnable = 1;
/*  176 */   public static int CriminalEnable = 1;
/*  177 */   public static int CryolophosaurusEnable = 1;
/*  178 */   public static int RatEnable = 1;
/*  179 */   public static int RatPlayerFriendly = 0;
/*  180 */   public static int RatPetFriendly = 0;
/*  181 */   public static int UrchinEnable = 1;
/*  182 */   public static int CamarasaurusEnable = 1;
/*  183 */   public static int ChipmunkEnable = 1;
/*  184 */   public static int OstrichEnable = 1;
/*  185 */   public static int GazelleEnable = 1;
/*  186 */   public static int VelocityRaptorEnable = 1;
/*  187 */   public static int HydroliscEnable = 1;
/*  188 */   public static int SpyroEnable = 1;
/*  189 */   public static int BaryonyxEnable = 1;
/*  190 */   public static int CockateilEnable = 1;
/*  191 */   public static int CassowaryEnable = 1;
/*  192 */   public static int EasterBunnyEnable = 1;
/*  193 */   public static int PeacockEnable = 1;
/*  194 */   public static int KyuubiEnable = 1;
/*  195 */   public static int CephadromeEnable = 1;
/*  196 */   public static int DragonEnable = 1;
/*  197 */   public static int GammaMetroidEnable = 1;
/*  198 */   public static int BasiliskEnable = 1;
/*  199 */   public static int DragonflyEnable = 1;
/*  200 */   public static int EmperorScorpionEnable = 1;
/*  201 */   public static int TrooperBugEnable = 1;
/*  202 */   public static int SpitBugEnable = 1;
/*  203 */   public static int StinkBugEnable = 1;
/*  204 */   public static int ScorpionEnable = 1;
/*  205 */   public static int CaveFisherEnable = 1;
/*  206 */   public static int AlienEnable = 1;
/*  207 */   public static int WaterDragonEnable = 1;
/*  208 */   public static int SeaMonsterEnable = 1;
/*  209 */   public static int SeaViperEnable = 1;
/*  210 */   public static int AttackSquidEnable = 1;
/*  211 */   public static int GodzillaEnable = 1;
/*  212 */   public static int LessOre = 0;
/*  213 */   public static int LessLag = 0;
/*  214 */   public static int Robot1Enable = 1;
/*  215 */   public static int Robot2Enable = 1;
/*  216 */   public static int Robot3Enable = 1;
/*  217 */   public static int Robot4Enable = 1;
/*  218 */   public static int Robot5Enable = 1;
/*  219 */   public static int RotatorEnable = 1;
/*  220 */   public static int VortexEnable = 1;
/*  221 */   public static int DungeonBeastEnable = 1;
/*  222 */   public static int KrakenEnable = 1;
/*  223 */   public static int LizardEnable = 1;
/*  224 */   public static int RubberDuckyEnable = 1;
/*  225 */   public static int GirlfriendEnable = 1;
/*  226 */   public static int BoyfriendEnable = 0;
/*  227 */   public static int FireflyEnable = 1;
/*  228 */   public static int FairyEnable = 1;
/*  229 */   public static int BeeEnable = 1;
/*  230 */   public static int TheKingEnable = 1;
/*  231 */   public static int TheQueenEnable = 1;
/*  232 */   public static int ThePrinceEnable = 1;
/*  233 */   public static int ThePrincessEnable = 1;
/*  234 */   public static int MantisEnable = 1;
/*  235 */   public static int StinkyEnable = 1;
/*  236 */   public static int HerculesBeetleEnable = 1;
/*  237 */   public static int CowEnable = 1;
/*  238 */   public static int ButterflyEnable = 1;
/*  239 */   public static int MothEnable = 1;
/*  240 */   public static int TshirtEnable = 1;
/*  241 */   public static int CoinEnable = 1;
/*  242 */   public static int CreepingHorrorEnable = 1;
/*  243 */   public static int TerribleTerrorEnable = 1;
/*  244 */   public static int CliffRacerEnable = 1;
/*  245 */   public static int TriffidEnable = 1;
/*  246 */   public static int UltimateSwordMagic = 10;
/*  247 */   public static int UltimateBowDamage = 10;
/*  248 */   public static int PitchBlackEnable = 1;
/*  249 */   public static int NightmareSize = 0;
/*  250 */   public static int LurkingTerrorEnable = 1;
/*  251 */   public static int IslandSpeedFactor = 2;
/*  252 */   public static int IslandSizeFactor = 2;
/*  253 */   public static int GinormousEmeraldTreeEnable = 1;
/*  254 */   public static int GuiOverlayEnable = 1;
/*  255 */   public static int FastGraphicsLeaves = 0;
/*  256 */   public static int WormEnable = 1;
/*  257 */   public static int CloudSharkEnable = 1;
/*  258 */   public static int GoldFishEnable = 1;
/*  259 */   public static int LeafMonsterEnable = 1;
/*  260 */   public static int EnderKnightEnable = 1;
/*  261 */   public static int EnderReaperEnable = 1;
/*  262 */   public static int BeaverEnable = 1;
/*  263 */   public static int IrukandjiEnable = 1;
/*  264 */   public static int SkateEnable = 1;
/*  265 */   public static int WhaleEnable = 1;
/*  266 */   public static int FlounderEnable = 1;
/*  267 */   public static int CrabEnable = 1;
/*      */ 
/*      */ 
/*      */   
/*  271 */   public OreSpawnWorld OreSpawnGen = new OreSpawnWorld();
/*  272 */   public static Random OreSpawnRand = new Random(151L);
/*  273 */   public static Trees OreSpawnTrees = null;
/*      */   
/*      */   public static BasiliskMaze BMaze;
/*      */   
/*      */   public static RubyBirdDungeon RubyDungeon;
/*      */   
/*      */   public static GenericDungeon MyDungeon;
/*      */   
/*      */   public static MyUtils OreSpawnUtils;
/*      */   
/*      */   public static ChunkOreGenerator Chunker;
/*      */   
/*      */   public static OreGenericEgg MySpiderSpawnBlock;
/*      */   
/*      */   public static OreGenericEgg MyBatSpawnBlock;
/*      */   
/*      */   public static OreGenericEgg MyCowSpawnBlock;
/*      */   
/*      */   public static OreGenericEgg MyPigSpawnBlock;
/*      */   public static OreGenericEgg MySquidSpawnBlock;
/*      */   public static OreGenericEgg MyChickenSpawnBlock;
/*      */   public static OreGenericEgg MyCreeperSpawnBlock;
/*      */   public static OreGenericEgg MySkeletonSpawnBlock;
/*      */   public static OreGenericEgg MyZombieSpawnBlock;
/*      */   public static OreGenericEgg MySlimeSpawnBlock;
/*      */   public static OreGenericEgg MyGhastSpawnBlock;
/*      */   public static OreGenericEgg MyZombiePigmanSpawnBlock;
/*      */   public static OreGenericEgg MyEndermanSpawnBlock;
/*      */   public static OreGenericEgg MyCaveSpiderSpawnBlock;
/*      */   public static OreGenericEgg MySilverfishSpawnBlock;
/*      */   public static OreGenericEgg MyMagmaCubeSpawnBlock;
/*      */   public static OreGenericEgg MyWitchSpawnBlock;
/*      */   public static OreGenericEgg MySheepSpawnBlock;
/*      */   public static OreGenericEgg MyWolfSpawnBlock;
/*      */   public static OreGenericEgg MyMooshroomSpawnBlock;
/*      */   public static OreGenericEgg MyOcelotSpawnBlock;
/*      */   public static OreGenericEgg MyBlazeSpawnBlock;
/*      */   public static OreGenericEgg MyWitherSkeletonSpawnBlock;
/*      */   public static OreGenericEgg MyEnderDragonSpawnBlock;
/*      */   public static OreGenericEgg MySnowGolemSpawnBlock;
/*      */   public static OreGenericEgg MyIronGolemSpawnBlock;
/*      */   public static OreGenericEgg MyWitherBossSpawnBlock;
/*      */   public static OreGenericEgg MyGirlfriendSpawnBlock;
/*      */   public static OreGenericEgg MyBoyfriendSpawnBlock;
/*      */   public static OreGenericEgg MyRedCowSpawnBlock;
/*      */   public static OreGenericEgg MyCrystalCowSpawnBlock;
/*      */   public static OreGenericEgg MyVillagerSpawnBlock;
/*      */   public static OreGenericEgg MyGoldCowSpawnBlock;
/*      */   public static OreGenericEgg MyEnchantedCowSpawnBlock;
/*      */   public static OreGenericEgg MyMOTHRASpawnBlock;
/*      */   public static OreGenericEgg MyAloSpawnBlock;
/*      */   public static OreGenericEgg MyCryoSpawnBlock;
/*      */   public static OreGenericEgg MyCamaSpawnBlock;
/*      */   public static OreGenericEgg MyVeloSpawnBlock;
/*      */   public static OreGenericEgg MyHydroSpawnBlock;
/*      */   public static OreGenericEgg MyBasilSpawnBlock;
/*      */   public static OreGenericEgg MyDragonflySpawnBlock;
/*      */   public static OreGenericEgg MyEmperorScorpionSpawnBlock;
/*      */   public static OreGenericEgg MyScorpionSpawnBlock;
/*      */   public static OreGenericEgg MyCaveFisherSpawnBlock;
/*      */   public static OreGenericEgg MySpyroSpawnBlock;
/*      */   public static OreGenericEgg MyBaryonyxSpawnBlock;
/*      */   public static OreGenericEgg MyGammaMetroidSpawnBlock;
/*      */   public static OreGenericEgg MyCockateilSpawnBlock;
/*      */   public static OreGenericEgg MyKyuubiSpawnBlock;
/*      */   public static OreGenericEgg MyAlienSpawnBlock;
/*      */   public static OreGenericEgg MyAttackSquidSpawnBlock;
/*      */   public static OreGenericEgg MyWaterDragonSpawnBlock;
/*      */   public static OreGenericEgg MyKrakenSpawnBlock;
/*      */   public static OreGenericEgg MyLizardSpawnBlock;
/*      */   public static OreGenericEgg MyCephadromeSpawnBlock;
/*      */   public static OreGenericEgg MyDragonSpawnBlock;
/*      */   public static OreGenericEgg MyBeeSpawnBlock;
/*      */   public static OreGenericEgg MyHorseSpawnBlock;
/*      */   public static OreGenericEgg MyTrooperBugSpawnBlock;
/*      */   public static OreGenericEgg MySpitBugSpawnBlock;
/*      */   public static OreGenericEgg MyStinkBugSpawnBlock;
/*      */   public static OreGenericEgg MyOstrichSpawnBlock;
/*      */   public static OreGenericEgg MyGazelleSpawnBlock;
/*      */   public static OreGenericEgg MyChipmunkSpawnBlock;
/*      */   public static OreGenericEgg MyCreepingHorrorSpawnBlock;
/*      */   public static OreGenericEgg MyTerribleTerrorSpawnBlock;
/*      */   public static OreGenericEgg MyCliffRacerSpawnBlock;
/*      */   public static OreGenericEgg MyTriffidSpawnBlock;
/*      */   public static OreGenericEgg MyPitchBlackSpawnBlock;
/*      */   public static OreGenericEgg MyLurkingTerrorSpawnBlock;
/*      */   public static OreGenericEgg MyGodzillaPartSpawnBlock;
/*      */   public static OreGenericEgg MyGodzillaSpawnBlock;
/*      */   public static OreGenericEgg MyTheKingPartSpawnBlock;
/*      */   public static OreGenericEgg MyTheQueenPartSpawnBlock;
/*      */   public static OreGenericEgg MyTheKingSpawnBlock;
/*      */   public static OreGenericEgg MyTheQueenSpawnBlock;
/*      */   public static OreGenericEgg MySmallWormSpawnBlock;
/*      */   public static OreGenericEgg MyMediumWormSpawnBlock;
/*      */   public static OreGenericEgg MyLargeWormSpawnBlock;
/*      */   public static OreGenericEgg MyCassowarySpawnBlock;
/*      */   public static OreGenericEgg MyCloudSharkSpawnBlock;
/*      */   public static OreGenericEgg MyGoldFishSpawnBlock;
/*      */   public static OreGenericEgg MyLeafMonsterSpawnBlock;
/*      */   public static OreGenericEgg MyTshirtSpawnBlock;
/*      */   public static OreGenericEgg MyEnderKnightSpawnBlock;
/*      */   public static OreGenericEgg MyEnderReaperSpawnBlock;
/*      */   public static OreGenericEgg MyBeaverSpawnBlock;
/*      */   public static OreGenericEgg MyUrchinSpawnBlock;
/*      */   public static OreGenericEgg MyFlounderSpawnBlock;
/*      */   public static OreGenericEgg MySkateSpawnBlock;
/*      */   public static OreGenericEgg MyRotatorSpawnBlock;
/*      */   public static OreGenericEgg MyPeacockSpawnBlock;
/*      */   public static OreGenericEgg MyFairySpawnBlock;
/*      */   public static OreGenericEgg MyDungeonBeastSpawnBlock;
/*      */   public static OreGenericEgg MyVortexSpawnBlock;
/*      */   public static OreGenericEgg MyRatSpawnBlock;
/*      */   public static OreGenericEgg MyWhaleSpawnBlock;
/*      */   public static OreGenericEgg MyIrukandjiSpawnBlock;
/*      */   public static OreGenericEgg MyTRexSpawnBlock;
/*      */   public static OreGenericEgg MyHerculesSpawnBlock;
/*      */   public static OreGenericEgg MyMantisSpawnBlock;
/*      */   public static OreGenericEgg MyStinkySpawnBlock;
/*      */   public static OreGenericEgg MyEasterBunnySpawnBlock;
/*      */   public static OreGenericEgg MyCaterKillerSpawnBlock;
/*      */   public static OreGenericEgg MyMolenoidSpawnBlock;
/*      */   public static OreGenericEgg MySeaMonsterSpawnBlock;
/*      */   public static OreGenericEgg MySeaViperSpawnBlock;
/*      */   public static OreGenericEgg MyLeonSpawnBlock;
/*      */   public static OreGenericEgg MyHammerheadSpawnBlock;
/*      */   public static OreGenericEgg MyRubberDuckySpawnBlock;
/*      */   public static OreGenericEgg MyCriminalSpawnBlock;
/*      */   public static OreGenericEgg MyBrutalflySpawnBlock;
/*      */   public static OreGenericEgg MyNastysaurusSpawnBlock;
/*      */   public static OreGenericEgg MyPointysaurusSpawnBlock;
/*      */   public static OreGenericEgg MyCricketSpawnBlock;
/*      */   public static OreGenericEgg MyFrogSpawnBlock;
/*      */   public static OreGenericEgg MySpiderDriverSpawnBlock;
/*      */   public static OreGenericEgg MyCrabSpawnBlock;
/*      */   public static Block MyOreUraniumBlock;
/*      */   public static Block MyOreTitaniumBlock;
/*      */   public static Item MyIngotUranium;
/*      */   public static Item MyIngotTitanium;
/*      */   public static Block MyBlockUraniumBlock;
/*      */   public static Block MyBlockTitaniumBlock;
/*      */   public static Block MyBlockMobzillaScaleBlock;
/*      */   public static Block MyBlockRubyBlock;
/*      */   public static Block MyBlockAmethystBlock;
/*      */   public static Block MyLavafoamBlock;
/*      */   public static Block MyPizzaBlock;
/*      */   public static Item MyPizzaItem;
/*      */   public static Block MyDuctTapeBlock;
/*      */   public static Item MyDuctTapeItem;
/*      */   public static Block MyAntBlock;
/*      */   public static Block MyRedAntBlock;
/*      */   public static Block TermiteBlock;
/*      */   public static Block CrystalTermiteBlock;
/*      */   public static Block MyRainbowAntBlock;
/*      */   public static Block MyUnstableAntBlock;
/*      */   public static Block MyFlowerPinkBlock;
/*      */   public static Block MyFlowerBlueBlock;
/*      */   public static Block MyFlowerBlackBlock;
/*      */   public static Block MyFlowerScaryBlock;
/*      */   public static Block CrystalFlowerRedBlock;
/*      */   public static Block CrystalFlowerGreenBlock;
/*      */   public static Block CrystalFlowerBlueBlock;
/*      */   public static Block CrystalFlowerYellowBlock;
/*      */   public static Block CrystalPlanksBlock;
/*      */   public static Block CrystalWorkbenchBlock;
/*      */   public static CrystalFurnace CrystalFurnaceBlock;
/*      */   public static Block CrystalFurnaceOnBlock;
/*      */   public static Item MyUltimateSword;
/*      */   public static Item MyUltimatePickaxe;
/*      */   public static Item MyUltimateShovel;
/*      */   public static Item MyUltimateHoe;
/*      */   public static Item MyUltimateAxe;
/*      */   public static Item MyNightmareSword;
/*      */   public static Item MyBertha;
/*      */   public static Item MyHammy;
/*      */   public static Item MyBattleAxe;
/*      */   public static Item MyQueenBattleAxe;
/*      */   public static Item MyChainsaw;
/*      */   public static Item MySquidZooka;
/*      */   public static Item MySlice;
/*      */   public static Item MyRoyal;
/*      */   public static Item MyEmeraldSword;
/*      */   public static Item MyEmeraldPickaxe;
/*      */   public static Item MyEmeraldShovel;
/*      */   public static Item MyEmeraldHoe;
/*      */   public static Item MyEmeraldAxe;
/*      */   public static Item MyExperienceSword;
/*      */   public static Item MyPoisonSword;
/*      */   public static Item MyRatSword;
/*      */   public static Item MyFairySword;
/*      */   public static Item MyMantisClaw;
/*      */   public static Item MyBigHammer;
/*      */   public static Item MyRubySword;
/*      */   public static Item MyRubyPickaxe;
/*      */   public static Item MyRubyShovel;
/*      */   public static Item MyRubyHoe;
/*      */   public static Item MyRubyAxe;
/*      */   public static Item MyAmethystSword;
/*      */   public static Item MyAmethystPickaxe;
/*      */   public static Item MyAmethystShovel;
/*      */   public static Item MyAmethystHoe;
/*      */   public static Item MyAmethystAxe;
/*      */   static Item.ToolMaterial toolULTIMATE;
/*      */   static Item.ToolMaterial toolNIGHTMARE;
/*      */   static Item.ToolMaterial toolBERTHA;
/*      */   static Item.ToolMaterial toolCRYSTALWOOD;
/*      */   static Item.ToolMaterial toolCRYSTALSTONE;
/*      */   static Item.ToolMaterial toolCRYSTALPINK;
/*      */   static Item.ToolMaterial toolTIGERSEYE;
/*      */   static Item.ToolMaterial toolRUBY;
/*      */   static Item.ToolMaterial toolAMETHYST;
/*      */   static Item.ToolMaterial toolEMERALD;
/*      */   static Item.ToolMaterial toolROYAL;
/*      */   static Item.ToolMaterial toolHAMMY;
/*      */   static Item.ToolMaterial toolBATTLE;
/*      */   static Item.ToolMaterial toolCHAINSAW;
/*      */   static Item.ToolMaterial toolQUEENBATTLE;
/*  489 */   static WeaponStats ultimate_stats = null;
/*  490 */   static WeaponStats nightmare_stats = null;
/*  491 */   static WeaponStats bertha_stats = null;
/*  492 */   static WeaponStats crystalwood_stats = null;
/*  493 */   static WeaponStats crystalstone_stats = null;
/*  494 */   static WeaponStats crystalpink_stats = null;
/*  495 */   static WeaponStats tigerseye_stats = null;
/*  496 */   static WeaponStats ruby_stats = null;
/*  497 */   static WeaponStats amethyst_stats = null;
/*  498 */   static WeaponStats emerald_stats = null;
/*  499 */   static WeaponStats royal_stats = null;
/*  500 */   static WeaponStats hammy_stats = null;
/*  501 */   static WeaponStats battleaxe_stats = null;
/*  502 */   static WeaponStats queenbattleaxe_stats = null;
/*  503 */   static WeaponStats chainsaw_stats = null;
/*      */   
/*      */   public static Item MyCrystalWoodSword;
/*      */   
/*      */   public static Item MyCrystalWoodPickaxe;
/*      */   
/*      */   public static Item MyCrystalWoodShovel;
/*      */   
/*      */   public static Item MyCrystalWoodHoe;
/*      */   
/*      */   public static Item MyCrystalWoodAxe;
/*      */   
/*      */   public static Item MyCrystalPinkSword;
/*      */   
/*      */   public static Item MyCrystalPinkPickaxe;
/*      */   
/*      */   public static Item MyCrystalPinkShovel;
/*      */   
/*      */   public static Item MyCrystalPinkHoe;
/*      */   
/*      */   public static Item MyCrystalPinkAxe;
/*      */   
/*      */   public static Item MyTigersEyeSword;
/*      */   
/*      */   public static Item MyTigersEyePickaxe;
/*      */   
/*      */   public static Item MyTigersEyeShovel;
/*      */   
/*      */   public static Item MyTigersEyeHoe;
/*      */   
/*      */   public static Item MyTigersEyeAxe;
/*      */   
/*      */   public static Item MyCrystalStoneSword;
/*      */   
/*      */   public static Item MyCrystalStonePickaxe;
/*      */   
/*      */   public static Item MyCrystalStoneShovel;
/*      */   
/*      */   public static Item MyCrystalStoneHoe;
/*      */   
/*      */   public static Item MyCrystalStoneAxe;
/*      */   
/*      */   public static Item MyCrystalPinkIngot;
/*      */   
/*      */   public static Block MyCrystalPinkBlock;
/*      */   
/*      */   public static Item MyTigersEyeIngot;
/*      */   public static Block MyTigersEyeBlock;
/*      */   public static Item MyItemShoes;
/*      */   public static Item MyItemShoes_1;
/*      */   public static Item MyItemShoes_2;
/*      */   public static Item MyItemShoes_3;
/*      */   public static Item MyItemGameController;
/*      */   public static Item MyUltimateBow;
/*      */   public static Item MySkateBow;
/*      */   public static Item MyUltimateFishingRod;
/*      */   public static ItemStack UltimateFishingRod;
/*      */   public static Item MyFireFish;
/*      */   public static Item MySunFish;
/*      */   public static Item MyLavaEel;
/*      */   public static Item MyMothScale;
/*      */   public static Item MyQueenScale;
/*      */   public static Item MyNightmareScale;
/*      */   public static Item MyEmperorScorpionScale;
/*      */   public static Item MyBasiliskScale;
/*      */   public static Item MyWaterDragonScale;
/*      */   public static Item MyJumpyBugScale;
/*      */   public static Item MyKrakenTooth;
/*      */   public static Item MyGodzillaScale;
/*      */   public static Item GreenGoo;
/*      */   public static Item SpiderRobotKit;
/*      */   public static Item AntRobotKit;
/*      */   public static Item ZooKeeper;
/*      */   public static Item CreeperLauncher;
/*      */   public static Item NetherLost;
/*      */   public static Item CrystalSticks;
/*      */   public static Item Sifter;
/*      */   public static Item MySunspotUrchin;
/*      */   public static Item MySparkFish;
/*      */   public static Item MyWaterBall;
/*      */   public static Item MyLaserBall;
/*      */   public static Item MyRayGun;
/*      */   public static Item MyThunderStaff;
/*      */   public static Item MyWrench;
/*      */   public static Item MyIceBall;
/*      */   public static Item MySmallRock;
/*      */   public static Item MyRock;
/*      */   public static Item MyRedRock;
/*      */   public static Item MyCrystalRedRock;
/*      */   public static Item MyCrystalGreenRock;
/*      */   public static Item MyCrystalBlueRock;
/*      */   public static Item MyCrystalTNTRock;
/*      */   public static Item MyBlueRock;
/*      */   public static Item MyGreenRock;
/*      */   public static Item MyPurpleRock;
/*      */   public static Item MySpikeyRock;
/*      */   public static Item MyTNTRock;
/*      */   public static Item MyAcid;
/*      */   public static Item MyIrukandji;
/*      */   public static Item MyIrukandjiArrow;
/*      */   public static Item MyGreenFish;
/*      */   public static Item MyBlueFish;
/*      */   public static Item MyPinkFish;
/*      */   public static Item MyRockFish;
/*      */   public static Item MyWoodFish;
/*      */   public static Item MyGreyFish;
/*      */   public static Item BerthaHandle;
/*      */   public static Item BerthaGuard;
/*      */   public static Item BerthaBlade;
/*      */   public static Item MolenoidNose;
/*      */   public static Item SeaMonsterScale;
/*      */   public static Item WormTooth;
/*      */   public static Item TRexTooth;
/*      */   public static Item CaterKillerJaw;
/*      */   public static Item SeaViperTongue;
/*      */   public static Item VortexEye;
/*      */   public static Item MyStepUp;
/*      */   public static Item MyStepDown;
/*      */   public static Item MyStepAccross;
/*      */   static ItemArmor.ArmorMaterial armorULTIMATE;
/*      */   static ItemArmor.ArmorMaterial armorMOBZILLA;
/*      */   static ItemArmor.ArmorMaterial armorLAVAEEL;
/*      */   static ItemArmor.ArmorMaterial armorMOTHSCALE;
/*      */   static ItemArmor.ArmorMaterial armorEMERALD;
/*      */   static ItemArmor.ArmorMaterial armorEXPERIENCE;
/*      */   static ItemArmor.ArmorMaterial armorRUBY;
/*      */   static ItemArmor.ArmorMaterial armorAMETHYST;
/*      */   static ItemArmor.ArmorMaterial armorPINK;
/*      */   static ItemArmor.ArmorMaterial armorTIGERSEYE;
/*      */   static ItemArmor.ArmorMaterial armorPEACOCK;
/*      */   static ItemArmor.ArmorMaterial armorROYAL;
/*      */   static ItemArmor.ArmorMaterial armorLAPIS;
/*      */   static ItemArmor.ArmorMaterial armorQUEEN;
/*      */   public static ItemOreSpawnArmor UltimateHelmet;
/*      */   public static ItemOreSpawnArmor UltimateBody;
/*      */   public static ItemOreSpawnArmor UltimateLegs;
/*      */   public static ItemOreSpawnArmor UltimateBoots;
/*      */   public static ItemOreSpawnArmor LavaEelHelmet;
/*      */   public static ItemOreSpawnArmor LavaEelBody;
/*      */   public static ItemOreSpawnArmor LavaEelLegs;
/*      */   public static ItemOreSpawnArmor LavaEelBoots;
/*      */   public static ItemOreSpawnArmor MothScaleHelmet;
/*      */   public static ItemOreSpawnArmor MothScaleBody;
/*      */   public static ItemOreSpawnArmor MothScaleLegs;
/*      */   public static ItemOreSpawnArmor MothScaleBoots;
/*      */   public static ItemOreSpawnArmor EmeraldHelmet;
/*      */   public static ItemOreSpawnArmor EmeraldBody;
/*      */   public static ItemOreSpawnArmor EmeraldLegs;
/*      */   public static ItemOreSpawnArmor EmeraldBoots;
/*      */   public static ItemOreSpawnArmor ExperienceHelmet;
/*      */   public static ItemOreSpawnArmor ExperienceBody;
/*      */   public static ItemOreSpawnArmor ExperienceLegs;
/*      */   public static ItemOreSpawnArmor ExperienceBoots;
/*      */   public static ItemOreSpawnArmor RubyHelmet;
/*      */   public static ItemOreSpawnArmor RubyBody;
/*      */   public static ItemOreSpawnArmor RubyLegs;
/*      */   public static ItemOreSpawnArmor RubyBoots;
/*      */   public static ItemOreSpawnArmor AmethystHelmet;
/*      */   public static ItemOreSpawnArmor AmethystBody;
/*      */   public static ItemOreSpawnArmor AmethystLegs;
/*      */   public static ItemOreSpawnArmor AmethystBoots;
/*      */   public static ItemOreSpawnArmor CrystalPinkHelmet;
/*      */   public static ItemOreSpawnArmor CrystalPinkBody;
/*      */   public static ItemOreSpawnArmor CrystalPinkLegs;
/*      */   public static ItemOreSpawnArmor CrystalPinkBoots;
/*      */   public static ItemOreSpawnArmor TigersEyeHelmet;
/*      */   public static ItemOreSpawnArmor TigersEyeBody;
/*      */   public static ItemOreSpawnArmor TigersEyeLegs;
/*      */   public static ItemOreSpawnArmor TigersEyeBoots;
/*      */   public static Block TigersEye;
/*      */   public static ItemOreSpawnArmor PeacockFeatherBoots;
/*      */   public static ItemOreSpawnArmor PeacockFeatherHelmet;
/*      */   public static ItemOreSpawnArmor PeacockFeatherBody;
/*      */   public static ItemOreSpawnArmor PeacockFeatherLegs;
/*      */   public static ItemOreSpawnArmor MobzillaHelmet;
/*      */   public static ItemOreSpawnArmor MobzillaBody;
/*      */   public static ItemOreSpawnArmor MobzillaLegs;
/*      */   public static ItemOreSpawnArmor MobzillaBoots;
/*      */   public static ItemOreSpawnArmor RoyalHelmet;
/*      */   public static ItemOreSpawnArmor RoyalBody;
/*      */   public static ItemOreSpawnArmor RoyalLegs;
/*      */   public static ItemOreSpawnArmor RoyalBoots;
/*      */   public static ItemOreSpawnArmor LapisHelmet;
/*      */   public static ItemOreSpawnArmor LapisBody;
/*      */   public static ItemOreSpawnArmor LapisLegs;
/*      */   public static ItemOreSpawnArmor LapisBoots;
/*      */   public static ItemOreSpawnArmor QueenHelmet;
/*      */   public static ItemOreSpawnArmor QueenBody;
/*      */   public static ItemOreSpawnArmor QueenLegs;
/*      */   public static ItemOreSpawnArmor QueenBoots;
/*      */   public static Block MyOreSaltBlock;
/*      */   public static Block MyRTPBlock;
/*      */   public static Block MyMoleDirtBlock;
/*      */   public static Item MySalt;
/*      */   public static Item MyPopcorn;
/*      */   public static Item MyButteredPopcorn;
/*      */   public static Item MyButteredSaltedPopcorn;
/*      */   public static Item MyPopcornBag;
/*      */   public static Item MyButter;
/*      */   public static Item MyCornDog;
/*      */   public static Item MyRawCornDog;
/*      */   public static Item MyPeacock;
/*      */   public static Item MyRawPeacock;
/*      */   public static Item MyElevator;
/*      */   public static Block MyOreRubyBlock;
/*      */   public static Item MyRuby;
/*      */   public static Item MyBacon;
/*      */   public static Item MyRawBacon;
/*      */   public static Item MyCrabMeat;
/*      */   public static Item MyRawCrabMeat;
/*      */   public static Item MyButterCandy;
/*      */   public static Block MyOreAmethystBlock;
/*      */   public static Item MyAmethyst;
/*      */   public static Item UraniumNugget;
/*      */   public static Item TitaniumNugget;
/*      */   public static Item MySalad;
/*      */   public static Item MyBLT;
/*      */   public static Item MyCrabbyPatty;
/*      */   public static Block CrystalStone;
/*      */   public static Block CrystalRat;
/*      */   public static Block CrystalFairy;
/*      */   public static Block CrystalCoal;
/*      */   public static Block CrystalGrass;
/*      */   public static Block CrystalCrystal;
/*      */   public static Block RedAntTroll;
/*      */   public static Block TermiteTroll;
/*      */   public static Item CageEmpty;
/*      */   public static Item CagedSpider;
/*      */   public static Item CagedBat;
/*      */   public static Item CagedCow;
/*      */   public static Item CagedPig;
/*      */   public static Item CagedSquid;
/*      */   public static Item CagedChicken;
/*      */   public static Item CagedCreeper;
/*      */   public static Item CagedSkeleton;
/*      */   public static Item CagedZombie;
/*      */   public static Item CagedSlime;
/*      */   public static Item CagedGhast;
/*      */   public static Item CagedZombiePigman;
/*      */   public static Item CagedEnderman;
/*      */   public static Item CagedCaveSpider;
/*      */   public static Item CagedSilverfish;
/*      */   public static Item CagedMagmaCube;
/*      */   public static Item CagedWitch;
/*      */   public static Item CagedSheep;
/*      */   public static Item CagedWolf;
/*      */   public static Item CagedMooshroom;
/*      */   public static Item CagedOcelot;
/*      */   public static Item CagedBlaze;
/*      */   public static Item CagedGirlfriend;
/*      */   public static Item CagedBoyfriend;
/*      */   public static Item CagedWitherSkeleton;
/*      */   public static Item CagedEnderDragon;
/*      */   public static Item CagedSnowGolem;
/*      */   public static Item CagedIronGolem;
/*      */   public static Item CagedWitherBoss;
/*      */   public static Item CagedRedCow;
/*      */   public static Item CagedCrystalCow;
/*      */   public static Item CagedVillager;
/*      */   public static Item CagedGoldCow;
/*      */   public static Item CagedEnchantedCow;
/*      */   public static Item CagedMOTHRA;
/*      */   public static Item CagedAlo;
/*      */   public static Item CagedCryo;
/*      */   public static Item CagedCama;
/*      */   public static Item CagedVelo;
/*      */   public static Item CagedHydro;
/*      */   public static Item CagedBasil;
/*      */   public static Item CagedDragonfly;
/*      */   public static Item CagedEmperorScorpion;
/*      */   public static Item CagedScorpion;
/*      */   public static Item CagedCaveFisher;
/*      */   public static Item CagedSpyro;
/*      */   public static Item CagedBaryonyx;
/*      */   public static Item CagedGammaMetroid;
/*      */   public static Item CagedCockateil;
/*      */   public static Item CagedKyuubi;
/*      */   public static Item CagedAlien;
/*      */   public static Item CagedAttackSquid;
/*      */   public static Item CagedWaterDragon;
/*      */   public static Item CagedCephadrome;
/*      */   public static Item CagedDragon;
/*      */   public static Item CagedKraken;
/*      */   public static Item CagedLizard;
/*      */   public static Item CagedBee;
/*      */   public static Item CagedHorse;
/*      */   public static Item CagedFirefly;
/*      */   public static Item CagedChipmunk;
/*      */   public static Item CagedGazelle;
/*      */   public static Item CagedOstrich;
/*      */   public static Item CagedTrooper;
/*      */   public static Item CagedSpit;
/*      */   public static Item CagedStink;
/*      */   public static Item CagedCreepingHorror;
/*      */   public static Item CagedTerribleTerror;
/*      */   public static Item CagedCliffRacer;
/*      */   public static Item CagedTriffid;
/*      */   public static Item CagedPitchBlack;
/*      */   public static Item CagedLurkingTerror;
/*      */   public static Item CagedSmallWorm;
/*      */   public static Item CagedMediumWorm;
/*      */   public static Item CagedLargeWorm;
/*      */   public static Item CagedCassowary;
/*      */   public static Item CagedCloudShark;
/*      */   public static Item CagedGoldFish;
/*      */   public static Item CagedLeafMonster;
/*      */   public static Item CagedEnderKnight;
/*      */   public static Item CagedEnderReaper;
/*      */   public static Item CagedBeaver;
/*      */   public static Item CagedUrchin;
/*      */   public static Item CagedFlounder;
/*      */   public static Item CagedSkate;
/*      */   public static Item CagedRotator;
/*      */   public static Item CagedPeacock;
/*      */   public static Item CagedFairy;
/*      */   public static Item CagedDungeonBeast;
/*      */   public static Item CagedVortex;
/*      */   public static Item CagedRat;
/*      */   public static Item CagedWhale;
/*      */   public static Item CagedIrukandji;
/*      */   public static Item CagedTRex;
/*      */   public static Item CagedHercules;
/*      */   public static Item CagedMantis;
/*      */   public static Item CagedStinky;
/*      */   public static Item CagedEasterBunny;
/*      */   public static Item CagedCaterKiller;
/*      */   public static Item CagedMolenoid;
/*      */   public static Item CagedSeaMonster;
/*      */   public static Item CagedSeaViper;
/*      */   public static Item CagedLeon;
/*      */   public static Item CagedHammerhead;
/*      */   public static Item CagedRubberDucky;
/*      */   public static Item CagedCriminal;
/*      */   public static Item CagedBrutalfly;
/*      */   public static Item CagedNastysaurus;
/*      */   public static Item CagedPointysaurus;
/*      */   public static Item CagedCricket;
/*      */   public static Item CagedFrog;
/*      */   public static Item CagedSpiderDriver;
/*      */   public static Item CagedCrab;
/*      */   public static Item WitherSkeletonEgg;
/*      */   public static Item EnderDragonEgg;
/*      */   public static Item SnowGolemEgg;
/*      */   public static Item IronGolemEgg;
/*      */   public static Item WitherBossEgg;
/*      */   public static Item GirlfriendEgg;
/*      */   public static Item RedCowEgg;
/*      */   public static Item CrystalCowEgg;
/*      */   public static Item GoldCowEgg;
/*      */   public static Item EnchantedCowEgg;
/*      */   public static Item MOTHRAEgg;
/*      */   public static Item AloEgg;
/*      */   public static Item CryoEgg;
/*      */   public static Item CamaEgg;
/*      */   public static Item VeloEgg;
/*      */   public static Item HydroEgg;
/*      */   public static Item BasilEgg;
/*      */   public static Item DragonflyEgg;
/*      */   public static Item EmperorScorpionEgg;
/*      */   public static Item ScorpionEgg;
/*      */   public static Item CaveFisherEgg;
/*      */   public static Item SpyroEgg;
/*      */   public static Item BaryonyxEgg;
/*      */   public static Item GammaMetroidEgg;
/*      */   public static Item CockateilEgg;
/*      */   public static Item KyuubiEgg;
/*      */   public static Item AlienEgg;
/*      */   public static Item AttackSquidEgg;
/*      */   public static Item WaterDragonEgg;
/*      */   public static Item CephadromeEgg;
/*      */   public static Item DragonEgg;
/*      */   public static Item KrakenEgg;
/*      */   public static Item LizardEgg;
/*      */   public static Item BeeEgg;
/*      */   public static Item TrooperBugEgg;
/*      */   public static Item SpitBugEgg;
/*      */   public static Item StinkBugEgg;
/*      */   public static Item OstrichEgg;
/*      */   public static Item GazelleEgg;
/*      */   public static Item ChipmunkEgg;
/*      */   public static Item CreepingHorrorEgg;
/*      */   public static Item TerribleTerrorEgg;
/*      */   public static Item CliffRacerEgg;
/*      */   public static Item TriffidEgg;
/*      */   public static Item PitchBlackEgg;
/*      */   public static Item LurkingTerrorEgg;
/*      */   public static Item GodzillaEgg;
/*      */   public static Item SmallWormEgg;
/*      */   public static Item MediumWormEgg;
/*      */   public static Item LargeWormEgg;
/*      */   public static Item CassowaryEgg;
/*      */   public static Item CloudSharkEgg;
/*      */   public static Item GoldFishEgg;
/*      */   public static Item LeafMonsterEgg;
/*      */   public static Item TshirtEgg;
/*      */   public static Item EnderKnightEgg;
/*      */   public static Item EnderReaperEgg;
/*      */   public static Item BeaverEgg;
/*      */   public static Item RotatorEgg;
/*      */   public static Item VortexEgg;
/*      */   public static Item PeacockEgg;
/*      */   public static Item FairyEgg;
/*      */   public static Item DungeonBeastEgg;
/*      */   public static Item RatEgg;
/*      */   public static Item FlounderEgg;
/*      */   public static Item WhaleEgg;
/*      */   public static Item IrukandjiEgg;
/*      */   public static Item SkateEgg;
/*      */   public static Item UrchinEgg;
/*      */   public static Item Robot1Egg;
/*      */   public static Item Robot2Egg;
/*      */   public static Item Robot3Egg;
/*      */   public static Item Robot4Egg;
/*      */   public static Item GhostEgg;
/*      */   public static Item GhostSkellyEgg;
/*      */   public static Item BrownAntEgg;
/*      */   public static Item RedAntEgg;
/*      */   public static Item RainbowAntEgg;
/*      */   public static Item UnstableAntEgg;
/*      */   public static Item TermiteEgg;
/*      */   public static Item ButterflyEgg;
/*      */   public static Item MothEgg;
/*      */   public static Item MosquitoEgg;
/*      */   public static Item FireflyEgg;
/*      */   public static Item TRexEgg;
/*      */   public static Item HerculesEgg;
/*      */   public static Item MantisEgg;
/*      */   public static Item StinkyEgg;
/*      */   public static Item Robot5Egg;
/*      */   public static Item CoinEgg;
/*      */   public static Item BoyfriendEgg;
/*      */   public static Item TheKingEgg;
/*      */   public static Item TheQueenEgg;
/*      */   public static Item ThePrinceEgg;
/*      */   public static Item EasterBunnyEgg;
/*      */   public static Item MolenoidEgg;
/*      */   public static Item SeaMonsterEgg;
/*      */   public static Item SeaViperEgg;
/*      */   public static Item CaterKillerEgg;
/*      */   public static Item LeonEgg;
/*      */   public static Item HammerheadEgg;
/*      */   public static Item RubberDuckyEgg;
/*      */   public static Item CriminalEgg;
/*      */   public static Item BrutalflyEgg;
/*      */   public static Item NastysaurusEgg;
/*      */   public static Item PointysaurusEgg;
/*      */   public static Item CricketEgg;
/*      */   public static Item ThePrincessEgg;
/*      */   public static Item FrogEgg;
/*      */   public static Item JefferyEgg;
/*      */   public static Item AntRobotEgg;
/*      */   public static Item SpiderRobotEgg;
/*      */   public static Item SpiderDriverEgg;
/*      */   public static Item CrabEgg;
/*      */   public static Item MyStrawberry;
/*      */   public static Item MyCrystalApple;
/*      */   public static Item MyCheese;
/*      */   public static Item MyCherry;
/*      */   public static Item MyPeach;
/*      */   public static Item MyStrawberrySeed;
/*      */   public static Block MyStrawberryPlant;
/*      */   public static Item MyButterflySeed;
/*      */   public static Block MyButterflyPlant;
/*      */   public static Item MyMothSeed;
/*      */   public static Block MyMothPlant;
/*      */   public static Item MyMosquitoSeed;
/*      */   public static Block MyMosquitoPlant;
/*      */   public static Item MyFireflySeed;
/*      */   public static Block MyFireflyPlant;
/*      */   public static Item MyRadish;
/*      */   public static Item MyRice;
/*      */   public static Block MyRadishPlant;
/*      */   public static Block MyRicePlant;
/*      */   public static Block MyCornPlant1;
/*      */   public static Block MyCornPlant2;
/*      */   public static Block MyCornPlant3;
/*      */   public static Block MyCornPlant4;
/*      */   public static Item MyCornCob;
/*      */   public static Block MyQuinoaPlant1;
/*      */   public static Block MyQuinoaPlant2;
/*      */   public static Block MyQuinoaPlant3;
/*      */   public static Block MyQuinoaPlant4;
/*      */   public static Item MyQuinoa;
/*      */   public static Block MyTomatoPlant1;
/*      */   public static Block MyTomatoPlant2;
/*      */   public static Block MyTomatoPlant3;
/*      */   public static Block MyTomatoPlant4;
/*      */   public static Item MyTomato;
/*      */   public static Block MyLettucePlant1;
/*      */   public static Block MyLettucePlant2;
/*      */   public static Block MyLettucePlant3;
/*      */   public static Block MyLettucePlant4;
/*      */   public static Item MyLettuce;
/*      */   public static Item MagicApple;
/*      */   public static Item RandomDungeon;
/*      */   public static Item MinersDream;
/*      */   public static Block ExtremeTorch;
/*      */   public static Block MyEnderPearlBlock;
/*      */   public static Block MyEyeOfEnderBlock;
/*      */   public static Block MyExperiencePlant;
/*      */   public static Block KrakenRepellent;
/*      */   public static Block MyIslandBlock;
/*      */   public static Block CreeperRepellent;
/*      */   public static Item ZooCage2;
/*      */   public static Item ZooCage4;
/*      */   public static Item ZooCage6;
/*      */   public static Item ZooCage8;
/*      */   public static Item ZooCage10;
/*      */   public static Item InstantShelter;
/*      */   public static Item InstantGarden;
/*      */   public static Block CrystalTorch;
/*      */   public static Item MyPeacockFeather;
/*      */   public static Block MyKingSpawnerBlock;
/*      */   public static Block MyQueenSpawnerBlock;
/*      */   public static Block MyDungeonSpawnerBlock;
/*      */   public static Block MyCrystalPlant;
/*      */   public static Block MyCrystalPlant2;
/*      */   public static Block MyCrystalPlant3;
/*      */   public static Block MyAppleLeaves;
/*      */   public static Item MyAppleSeed;
/*      */   public static Item MyCherrySeed;
/*      */   public static Item MyPeachSeed;
/*      */   public static Block MySkyTreeLog;
/*      */   public static Block MyDT;
/*      */   public static Block MyExperienceLeaves;
/*      */   public static Block MyScaryLeaves;
/*      */   public static Block MyCherryLeaves;
/*      */   public static Block MyPeachLeaves;
/*      */   public static Item MyExperienceCatcher;
/*      */   public static Item MyExperienceTreeSeed;
/*      */   public static Item MyDeadStinkBug;
/*      */   public static Block MyCrystalLeaves;
/*      */   public static Block MyCrystalLeaves2;
/*      */   public static Block MyCrystalLeaves3;
/*      */   public static Block MyCrystalTreeLog;
/* 1038 */   public static int GirlfriendID = 0;
/* 1039 */   public static int BoyfriendID = 0;
/* 1040 */   public static int RedCowID = 0;
/* 1041 */   public static int GoldCowID = 0;
/* 1042 */   public static int CrystalCowID = 0;
/* 1043 */   public static int ButterflyID = 0;
/* 1044 */   public static int FireflyID = 0;
/* 1045 */   public static int FairyID = 0;
/* 1046 */   public static int BeeID = 0;
/* 1047 */   public static int TheKingID = 0;
/* 1048 */   public static int TheQueenID = 0;
/* 1049 */   public static int ThePrinceID = 0;
/* 1050 */   public static int ThePrincessID = 0;
/* 1051 */   public static int ThePrinceTeenID = 0;
/* 1052 */   public static int ThePrinceAdultID = 0;
/* 1053 */   public static int MantisID = 0;
/* 1054 */   public static int StinkyID = 0;
/* 1055 */   public static int HerculesBeetleID = 0;
/* 1056 */   public static int LunaMothID = 0;
/* 1057 */   public static int MosquitoID = 0;
/* 1058 */   public static int GhostID = 0;
/* 1059 */   public static int GhostSkellyID = 0;
/* 1060 */   public static int SpiderRobotID = 0;
/* 1061 */   public static int AntRobotID = 0;
/* 1062 */   public static int JefferyID = 0;
/* 1063 */   public static int SpiderDriverID = 0;
/* 1064 */   public static int MothraID = 0;
/* 1065 */   public static int BrutalflyID = 0;
/* 1066 */   public static int NastysaurusID = 0;
/* 1067 */   public static int PointysaurusID = 0;
/* 1068 */   public static int CricketID = 0;
/* 1069 */   public static int FrogID = 0;
/* 1070 */   public static int EnchantedCowID = 0;
/* 1071 */   public static int AntID = 0;
/* 1072 */   public static int UnstableAntID = 0;
/* 1073 */   public static int RedAntID = 0;
/* 1074 */   public static int TermiteID = 0;
/* 1075 */   public static int RockBaseID = 0;
/* 1076 */   public static int RainbowAntID = 0;
/* 1077 */   public static int AlosaurusID = 0;
/* 1078 */   public static int LeonID = 0;
/* 1079 */   public static int CaterKillerID = 0;
/* 1080 */   public static int MolenoidID = 0;
/* 1081 */   public static int TRexID = 0;
/* 1082 */   public static int BandPID = 0;
/* 1083 */   public static int CryolophosaurusID = 0;
/* 1084 */   public static int RatID = 0;
/* 1085 */   public static int UrchinID = 0;
/* 1086 */   public static int CamarasaurusID = 0;
/* 1087 */   public static int VelocityRaptorID = 0;
/* 1088 */   public static int HydroliscID = 0;
/* 1089 */   public static int SpyroID = 0;
/* 1090 */   public static int BaryonyxID = 0;
/* 1091 */   public static int CassowaryID = 0;
/* 1092 */   public static int EasterBunnyID = 0;
/* 1093 */   public static int PeacockID = 0;
/* 1094 */   public static int CockateilID = 0;
/* 1095 */   public static int RubyBirdID = 0;
/* 1096 */   public static int KyuubiID = 0;
/* 1097 */   public static int CephadromeID = 0;
/* 1098 */   public static int DragonID = 0;
/* 1099 */   public static int GammaMetroidID = 0;
/* 1100 */   public static int BasiliskID = 0;
/* 1101 */   public static int DragonflyID = 0;
/* 1102 */   public static int EmperorScorpionID = 0;
/* 1103 */   public static int TrooperBugID = 0;
/* 1104 */   public static int SpitBugID = 0;
/* 1105 */   public static int StinkBugID = 0;
/* 1106 */   public static int ScorpionID = 0;
/* 1107 */   public static int CaveFisherID = 0;
/* 1108 */   public static int AlienID = 0;
/* 1109 */   public static int WaterDragonID = 0;
/* 1110 */   public static int SeaMonsterID = 0;
/* 1111 */   public static int SeaViperID = 0;
/* 1112 */   public static int AttackSquidID = 0;
/* 1113 */   public static int ElevatorID = 0;
/* 1114 */   public static int Robot1ID = 0;
/* 1115 */   public static int Robot2ID = 0;
/* 1116 */   public static int Robot3ID = 0;
/* 1117 */   public static int Robot4ID = 0;
/* 1118 */   public static int Robot5ID = 0;
/* 1119 */   public static int RotatorID = 0;
/* 1120 */   public static int VortexID = 0;
/* 1121 */   public static int DungeonBeastID = 0;
/* 1122 */   public static int KrakenID = 0;
/* 1123 */   public static int LizardID = 0;
/* 1124 */   public static int RubberDuckyID = 0;
/* 1125 */   public static int ChipmunkID = 0;
/* 1126 */   public static int OstrichID = 0;
/* 1127 */   public static int GazelleID = 0;
/* 1128 */   public static int TshirtID = 0;
/* 1129 */   public static int CoinID = 0;
/* 1130 */   public static int IslandID = 0;
/* 1131 */   public static int IslandTooID = 0;
/* 1132 */   public static int CreepingHorrorID = 0;
/* 1133 */   public static int TerribleTerrorID = 0;
/* 1134 */   public static int CliffRacerID = 0;
/* 1135 */   public static int TriffidID = 0;
/* 1136 */   public static int PitchBlackID = 0;
/* 1137 */   public static int LurkingTerrorID = 0;
/* 1138 */   public static int GodzillaID = 0;
/* 1139 */   public static int WormSmallID = 0;
/* 1140 */   public static int WormMediumID = 0;
/* 1141 */   public static int WormLargeID = 0;
/* 1142 */   public static int CloudSharkID = 0;
/* 1143 */   public static int GoldFishID = 0;
/* 1144 */   public static int LeafMonsterID = 0;
/* 1145 */   public static int GodzillaHeadID = 0;
/* 1146 */   public static int KingHeadID = 0;
/* 1147 */   public static int QueenHeadID = 0;
/* 1148 */   public static int EnderKnightID = 0;
/* 1149 */   public static int EnderReaperID = 0;
/* 1150 */   public static int BeaverID = 0;
/* 1151 */   public static int SkateID = 0;
/* 1152 */   public static int IrukandjiID = 0;
/* 1153 */   public static int FlounderID = 0;
/* 1154 */   public static int WhaleID = 0;
/* 1155 */   public static int HammerheadID = 0;
/* 1156 */   public static int CrabID = 0;
/*      */ 
/*      */   
/* 1159 */   public static MobStats Bee_stats = null;
/* 1160 */   public static MobStats Mantis_stats = null;
/* 1161 */   public static MobStats HerculesBeetle_stats = null;
/* 1162 */   public static MobStats Mothra_stats = null;
/* 1163 */   public static MobStats Brutalfly_stats = null;
/* 1164 */   public static MobStats Nastysaurus_stats = null;
/* 1165 */   public static MobStats Pointysaurus_stats = null;
/* 1166 */   public static MobStats Alosaurus_stats = null;
/* 1167 */   public static MobStats SpiderRobot_stats = null;
/* 1168 */   public static MobStats AntRobot_stats = null;
/* 1169 */   public static MobStats Jeffery_stats = null;
/* 1170 */   public static MobStats Hammerhead_stats = null;
/* 1171 */   public static MobStats Leon_stats = null;
/* 1172 */   public static MobStats CaterKiller_stats = null;
/* 1173 */   public static MobStats Molenoid_stats = null;
/* 1174 */   public static MobStats TRex_stats = null;
/* 1175 */   public static MobStats BandP_stats = null;
/* 1176 */   public static MobStats Cryolophosaurus_stats = null;
/* 1177 */   public static MobStats Rat_stats = null;
/* 1178 */   public static MobStats Urchin_stats = null;
/* 1179 */   public static MobStats Kyuubi_stats = null;
/* 1180 */   public static MobStats GammaMetroid_stats = null;
/* 1181 */   public static MobStats Basilisk_stats = null;
/* 1182 */   public static MobStats EmperorScorpion_stats = null;
/* 1183 */   public static MobStats TrooperBug_stats = null;
/* 1184 */   public static MobStats SpitBug_stats = null;
/* 1185 */   public static MobStats Alien_stats = null;
/* 1186 */   public static MobStats WaterDragon_stats = null;
/* 1187 */   public static MobStats SeaMonster_stats = null;
/* 1188 */   public static MobStats SeaViper_stats = null;
/* 1189 */   public static MobStats Robot2_stats = null;
/* 1190 */   public static MobStats Robot3_stats = null;
/* 1191 */   public static MobStats Robot4_stats = null;
/* 1192 */   public static MobStats Robot5_stats = null;
/* 1193 */   public static MobStats Rotator_stats = null;
/* 1194 */   public static MobStats Vortex_stats = null;
/* 1195 */   public static MobStats DungeonBeast_stats = null;
/* 1196 */   public static MobStats Triffid_stats = null;
/* 1197 */   public static MobStats LurkingTerror_stats = null;
/* 1198 */   public static MobStats WormSmall_stats = null;
/* 1199 */   public static MobStats WormMedium_stats = null;
/* 1200 */   public static MobStats WormLarge_stats = null;
/* 1201 */   public static MobStats EnderKnight_stats = null;
/* 1202 */   public static MobStats EnderReaper_stats = null;
/* 1203 */   public static MobStats Irukandji_stats = null;
/* 1204 */   public static MobStats AttackSquid_stats = null;
/* 1205 */   public static MobStats CaveFisher_stats = null;
/* 1206 */   public static MobStats CloudShark_stats = null;
/* 1207 */   public static MobStats CreepingHorror_stats = null;
/* 1208 */   public static MobStats Godzilla_stats = null;
/* 1209 */   public static MobStats Kraken_stats = null;
/* 1210 */   public static MobStats LeafMonster_stats = null;
/* 1211 */   public static MobStats PitchBlack_stats = null;
/* 1212 */   public static MobStats Crab_stats = null;
/* 1213 */   public static MobStats Scorpion_stats = null;
/* 1214 */   public static MobStats Skate_stats = null;
/* 1215 */   public static MobStats TerribleTerror_stats = null;
/* 1216 */   public static MobStats TheKing_stats = null;
/* 1217 */   public static MobStats TheQueen_stats = null;
/*      */   
/* 1219 */   public static OreStats Ruby_stats = null;
/* 1220 */   public static OreStats BlkRuby_stats = null;
/* 1221 */   public static OreStats Uranium_stats = null;
/* 1222 */   public static OreStats Titanium_stats = null;
/* 1223 */   public static OreStats Amethyst_stats = null;
/* 1224 */   public static OreStats Salt_stats = null;
/* 1225 */   public static OreStats SpawnOres_stats = null;
/* 1226 */   public static OreStats Diamond_stats = null;
/* 1227 */   public static OreStats BlkDiamond_stats = null;
/* 1228 */   public static OreStats Emerald_stats = null;
/* 1229 */   public static OreStats BlkEmerald_stats = null;
/* 1230 */   public static OreStats Gold_stats = null;
/* 1231 */   public static OreStats BlkGold_stats = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @EventHandler
/*      */   public void preInit(FMLPreInitializationEvent event) {
/* 1241 */     Configuration config = new Configuration(event.getSuggestedConfigurationFile());
/* 1242 */     String ids = "OreSpawnIDS";
/* 1243 */     String mobs = "OreSpawnMOBS";
/* 1244 */     String tweaks = "OreSpawnTWEAKS";
/* 1245 */     String weapons = "OreSpawnWEAPONS";
/* 1246 */     String ores = "OreSpawnORES";
/*      */     
/* 1248 */     config.load();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1256 */     BaseBlockID = config.get(ids, "BaseBlockID", 2700).getInt();
/* 1257 */     BaseItemID = config.get(ids, "BaseItemID", 9000).getInt();
/* 1258 */     BaseBiomeID = config.get(ids, "BaseBiomeID", 120).getInt();
/* 1259 */     BaseDimensionID = config.get(ids, "BaseDimensionID", 80).getInt();
/*      */     
/* 1261 */     getMobs(config, mobs);
/*      */ 
/*      */     
/* 1264 */     AllMobsDisable = config.get(tweaks, "AllMobsDisable", 0).getInt();
/* 1265 */     LessOre = config.get(tweaks, "LessOre", 0).getInt();
/* 1266 */     LessLag = config.get(tweaks, "LessLag", 0).getInt();
/* 1267 */     RatPlayerFriendly = config.get(tweaks, "RatPlayerFriendly", 1).getInt();
/* 1268 */     RatPetFriendly = config.get(tweaks, "RatPetFriendly", 1).getInt();
/* 1269 */     NightmareSize = config.get(tweaks, "NightmareSize", 0).getInt();
/* 1270 */     IslandSpeedFactor = config.get(tweaks, "IslandSpeedFactor", 2).getInt();
/* 1271 */     IslandSizeFactor = config.get(tweaks, "IslandSizeFactor", 2).getInt();
/* 1272 */     GinormousEmeraldTreeEnable = config.get(tweaks, "GinormousEmeraldTreeEnable", 1).getInt();
/* 1273 */     GuiOverlayEnable = config.get(tweaks, "GuiOverlayEnable", 1).getInt();
/* 1274 */     ultimate_sword_pvp = config.get(tweaks, "UltimateSwordPvp", 0).getInt();
/* 1275 */     big_bertha_pvp = config.get(tweaks, "BigBerthaPvp", 0).getInt();
/* 1276 */     bro_mode = config.get(tweaks, "BoyfriendBroMode", 0).getInt();
/* 1277 */     enableduplicatortree = config.get(tweaks, "DuplicatorTreeEnable", 1).getInt();
/* 1278 */     RoyalGlideEnable = config.get(tweaks, "RoyalGlideEnable", 1).getInt();
/* 1279 */     DragonflyHorseFriendly = config.get(tweaks, "DragonflyHorseFriendly", 0).getInt();
/* 1280 */     PlayNicely = config.get(tweaks, "PlayNicely", 0).getInt();
/* 1281 */     MinersDreamExpensive = config.get(tweaks, "MinersDreamExpensive", 0).getInt();
/* 1282 */     DisableOverworldDungeons = config.get(tweaks, "DisableOverworldDungeons", 0).getInt();
/* 1283 */     FullPowerKingEnable = config.get(tweaks, "FullPowerKingEnable", 0).getInt();
/*      */     
/* 1285 */     Amethyst_armorstats = get_armorstats(config, "Amethyst", 100, 4, 8, 7, 3, 40, 0, 0, 0, 0, 0, 0, 0, 0);
/* 1286 */     Emerald_armorstats = get_armorstats(config, "Emerald", 60, 3, 8, 6, 3, 40, 0, 0, 0, 0, 0, 0, 0, 0);
/* 1287 */     Experience_armorstats = get_armorstats(config, "Experience", 70, 5, 9, 7, 4, 50, 0, 0, 2, 0, 1, 0, 0, 1);
/* 1288 */     MothScale_armorstats = get_armorstats(config, "MothScale", 50, 2, 7, 5, 2, 50, 0, 0, 3, 3, 3, 0, 0, 5);
/* 1289 */     LavaEel_armorstats = get_armorstats(config, "LavaEel", 40, 2, 7, 5, 2, 35, 1, 2, 3, 2, 10, 0, 0, 2);
/* 1290 */     Ultimate_armorstats = get_armorstats(config, "Ultimate", 200, 6, 12, 10, 6, 100, 2, 3, 5, 5, 5, 5, 0, 3);
/* 1291 */     Pink_armorstats = get_armorstats(config, "Pink", 50, 3, 7, 5, 2, 40, 0, 0, 0, 0, 0, 0, 0, 0);
/* 1292 */     TigersEye_armorstats = get_armorstats(config, "TigersEye", 80, 4, 8, 7, 4, 55, 0, 0, 0, 0, 0, 0, 0, 0);
/* 1293 */     Peacock_armorstats = get_armorstats(config, "Peacock", 40, 2, 5, 4, 2, 30, 0, 0, 0, 0, 0, 0, 0, 10);
/* 1294 */     Mobzilla_armorstats = get_armorstats(config, "Mobzilla", 1000, 7, 13, 11, 7, 150, 0, 0, 10, 10, 10, 10, 5, 10);
/* 1295 */     Ruby_armorstats = get_armorstats(config, "Ruby", 90, 4, 9, 8, 4, 40, 0, 0, 0, 0, 0, 0, 0, 0);
/* 1296 */     Royal_armorstats = get_armorstats(config, "Royal", 2000, 8, 14, 12, 8, 200, 1, 2, 10, 10, 10, 10, 5, 10);
/* 1297 */     Lapis_armorstats = get_armorstats(config, "Lapis", 60, 2, 7, 5, 2, 60, 1, 1, 1, 0, 0, 1, 0, 0);
/* 1298 */     Queen_armorstats = get_armorstats(config, "Queen", 1500, 9, 16, 14, 9, 150, 0, 0, 0, 0, 0, 0, 0, 0);
/*      */ 
/*      */     
/* 1301 */     ultimate_stats = get_weaponstats(config, weapons, "Ultimate", 10, 3000, 15, 36, 100);
/* 1302 */     nightmare_stats = get_weaponstats(config, weapons, "Nightmare", 3, 1800, 12, 26, 60);
/* 1303 */     bertha_stats = get_weaponstats(config, weapons, "Bertha", 3, 9000, 15, 496, 100);
/* 1304 */     crystalwood_stats = get_weaponstats(config, weapons, "CrystalWood", 2, 300, 3, 2, 15);
/* 1305 */     crystalstone_stats = get_weaponstats(config, weapons, "CrystalStone", 3, 800, 6, 5, 45);
/* 1306 */     crystalpink_stats = get_weaponstats(config, weapons, "Pink", 4, 1100, 10, 7, 65);
/* 1307 */     tigerseye_stats = get_weaponstats(config, weapons, "TigersEye", 4, 1600, 12, 8, 75);
/* 1308 */     ruby_stats = get_weaponstats(config, weapons, "Ruby", 5, 1500, 11, 16, 85);
/* 1309 */     amethyst_stats = get_weaponstats(config, weapons, "Amethyst", 4, 2000, 11, 11, 70);
/* 1310 */     emerald_stats = get_weaponstats(config, weapons, "Emerald", 3, 1300, 10, 6, 75);
/* 1311 */     royal_stats = get_weaponstats(config, weapons, "Royal", 3, 10000, 15, 746, 150);
/* 1312 */     hammy_stats = get_weaponstats(config, weapons, "Attitude", 5, 2000, 15, 82, 100);
/* 1313 */     battleaxe_stats = get_weaponstats(config, weapons, "BattleAxe", 3, 1500, 15, 46, 75);
/* 1314 */     chainsaw_stats = get_weaponstats(config, weapons, "Chainsaw", 3, 1500, 10, 56, 75);
/* 1315 */     queenbattleaxe_stats = get_weaponstats(config, weapons, "QueenBattleAxe", 3, 2200, 15, 662, 100);
/*      */     
/* 1317 */     UltimateSwordMagic = config.get(weapons, "UltimateSwordEnchantmentLevel", 5).getInt();
/* 1318 */     UltimateBowDamage = config.get(weapons, "UltimateBowDamage", 10).getInt();
/*      */     
/* 1320 */     if (UltimateSwordMagic < 1) UltimateSwordMagic = 1; 
/* 1321 */     if (UltimateSwordMagic > 10) UltimateSwordMagic = 10; 
/* 1322 */     if (UltimateBowDamage < 2) UltimateBowDamage = 2; 
/* 1323 */     if (UltimateBowDamage > 20) UltimateBowDamage = 20;
/*      */     
/* 1325 */     if (IslandSpeedFactor < 1) IslandSpeedFactor = 1; 
/* 1326 */     if (IslandSpeedFactor > 5) IslandSpeedFactor = 5; 
/* 1327 */     if (IslandSizeFactor < 1) IslandSizeFactor = 1; 
/* 1328 */     if (IslandSizeFactor > 5) IslandSizeFactor = 5;
/*      */     
/* 1330 */     if (NightmareSize < 0) NightmareSize = 0; 
/* 1331 */     if (NightmareSize > 5) NightmareSize = 5; 
/* 1332 */     if (LessLag < 0) LessLag = 0; 
/* 1333 */     if (LessLag > 2) LessLag = 2; 
/* 1334 */     if (LessLag == 1) {
/* 1335 */       if (IslandSizeFactor > 2) IslandSizeFactor = 2; 
/* 1336 */       if (IslandSpeedFactor > 2) IslandSpeedFactor = 2; 
/*      */     } 
/* 1338 */     if (LessLag == 2) {
/* 1339 */       if (IslandSizeFactor > 1) IslandSizeFactor = 1; 
/* 1340 */       if (IslandSpeedFactor > 1) IslandSpeedFactor = 1; 
/* 1341 */       LessOre = 1;
/*      */     } 
/*      */     
/* 1344 */     Ruby_stats = get_orestats(config, ores, "Ruby", 10, 1, 0, 50);
/* 1345 */     BlkRuby_stats = get_orestats(config, ores, "BlockRuby", 1, 2, 0, 15);
/* 1346 */     Uranium_stats = get_orestats(config, ores, "Uranium", 3, 4, 0, 30);
/* 1347 */     Titanium_stats = get_orestats(config, ores, "Titanium", 3, 4, 0, 20);
/* 1348 */     Amethyst_stats = get_orestats(config, ores, "Amethyst", 2, 6, 0, 25);
/* 1349 */     Salt_stats = get_orestats(config, ores, "Salt", 5, 12, 50, 128);
/* 1350 */     SpawnOres_stats = get_orestats(config, ores, "SpawnOres", 28, 4, 50, 128);
/* 1351 */     Diamond_stats = get_orestats(config, ores, "Diamond", 4, 6, 0, 30);
/* 1352 */     BlkDiamond_stats = get_orestats(config, ores, "BlockDiamond", 2, 4, 0, 20);
/* 1353 */     Emerald_stats = get_orestats(config, ores, "Emerald", 4, 6, 0, 40);
/* 1354 */     BlkEmerald_stats = get_orestats(config, ores, "BlockEmerald", 2, 4, 0, 20);
/* 1355 */     Gold_stats = get_orestats(config, ores, "Gold", 4, 8, 0, 40);
/* 1356 */     BlkGold_stats = get_orestats(config, ores, "BlockGold", 2, 4, 0, 25);
/*      */ 
/*      */     
/* 1359 */     config.save();
/*      */     
/* 1361 */     if (AllMobsDisable != 0) {
/* 1362 */       disableAllMobs();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1368 */     BiomeUtopiaID = BaseBiomeID;
/* 1369 */     BiomeIslandsID = BaseBiomeID + 1;
/* 1370 */     BiomeCrystalID = BaseBiomeID + 2;
/* 1371 */     BiomeVillageID = BaseBiomeID + 3;
/* 1372 */     BiomeChaosID = BaseBiomeID + 4;
/* 1373 */     DimensionID = BaseDimensionID;
/* 1374 */     DimensionID2 = BaseDimensionID + 1;
/* 1375 */     DimensionID3 = BaseDimensionID + 2;
/* 1376 */     DimensionID4 = BaseDimensionID + 3;
/* 1377 */     DimensionID5 = BaseDimensionID + 4;
/* 1378 */     DimensionID6 = BaseDimensionID + 5;
/*      */ 
/*      */     
/* 1381 */     proxy.registerSoundThings();
/*      */     
/* 1383 */     laySomeEggs();
/*      */ 
/*      */ 
/*      */     
/* 1387 */     MyOreUraniumBlock = (new OreUranium(BaseBlockID + 101)).func_149663_c("oreuranium");
/* 1388 */     MyOreTitaniumBlock = (new OreTitanium(BaseBlockID + 102)).func_149663_c("oretitanium");
/* 1389 */     MyIngotUranium = (new IngotUranium(BaseItemID + 152)).func_77655_b("ingoturanium");
/* 1390 */     MyIngotTitanium = (new IngotTitanium(BaseItemID + 153)).func_77655_b("ingottitanium");
/* 1391 */     MyBlockUraniumBlock = (new BlockUranium(BaseBlockID + 107)).func_149663_c("blockuranium");
/* 1392 */     MyBlockTitaniumBlock = (new BlockTitanium(BaseBlockID + 108)).func_149663_c("blocktitanium");
/* 1393 */     MyBlockMobzillaScaleBlock = (new BlockRuby(BaseBlockID + 124)).func_149663_c("blockmobzillascale");
/* 1394 */     MyLavafoamBlock = (new Lavafoam(BaseBlockID + 106)).func_149663_c("lavafoam");
/* 1395 */     MyBlockRubyBlock = (new BlockRuby(BaseBlockID + 109)).func_149663_c("blockruby");
/* 1396 */     MyBlockAmethystBlock = (new BlockRuby(BaseBlockID + 110)).func_149663_c("blockamethyst");
/* 1397 */     MyCrystalPinkBlock = (new BlockCrystal(BaseBlockID + 216)).func_149663_c("crystalpink_block");
/* 1398 */     MyCrystalPinkIngot = (new IngotUranium(BaseItemID + 348)).func_77655_b("crystalpink_ingot");
/* 1399 */     MyTigersEyeBlock = (new BlockCrystal(BaseBlockID + 218)).func_149663_c("tigerseye_block");
/* 1400 */     MyTigersEyeIngot = (new IngotUranium(BaseItemID + 358)).func_77655_b("tigerseye_ingot");
/*      */     
/* 1402 */     MyPizzaBlock = (new BlockPizza(BaseBlockID + 194)).func_149663_c("pizza");
/* 1403 */     MyPizzaItem = (new ItemPizza(BaseItemID + 204, MyPizzaBlock)).func_77625_d(1).func_77637_a(CreativeTabs.field_78039_h).func_77655_b("pizza");
/* 1404 */     MyDuctTapeBlock = (new BlockDuctTape(BaseBlockID + 198)).func_149663_c("ducttape");
/* 1405 */     MyDuctTapeItem = (new ItemDuctTape(BaseItemID + 458, MyDuctTapeBlock)).func_77625_d(1).func_77637_a(CreativeTabs.field_78040_i).func_77655_b("ducttape");
/*      */     
/* 1407 */     toolULTIMATE = EnumHelper.addToolMaterial("ULTIMATE", ultimate_stats.harvestlevel, ultimate_stats.maxuses, ultimate_stats.efficiency, ultimate_stats.damage, ultimate_stats.enchantability);
/*      */     
/* 1409 */     toolNIGHTMARE = EnumHelper.addToolMaterial("NIGHTMARE", nightmare_stats.harvestlevel, nightmare_stats.maxuses, nightmare_stats.efficiency, nightmare_stats.damage, nightmare_stats.enchantability);
/*      */     
/* 1411 */     toolEMERALD = EnumHelper.addToolMaterial("REALEMERALD", emerald_stats.harvestlevel, emerald_stats.maxuses, emerald_stats.efficiency, emerald_stats.damage, emerald_stats.enchantability);
/*      */     
/* 1413 */     toolRUBY = EnumHelper.addToolMaterial("RUBY", ruby_stats.harvestlevel, ruby_stats.maxuses, ruby_stats.efficiency, ruby_stats.damage, ruby_stats.enchantability);
/*      */     
/* 1415 */     toolAMETHYST = EnumHelper.addToolMaterial("AMETHYST", amethyst_stats.harvestlevel, amethyst_stats.maxuses, amethyst_stats.efficiency, amethyst_stats.damage, amethyst_stats.enchantability);
/*      */     
/* 1417 */     toolBERTHA = EnumHelper.addToolMaterial("BERTHA", bertha_stats.harvestlevel, bertha_stats.maxuses, bertha_stats.efficiency, bertha_stats.damage, bertha_stats.enchantability);
/*      */     
/* 1419 */     toolCRYSTALWOOD = EnumHelper.addToolMaterial("CRYSTALWOOD", crystalwood_stats.harvestlevel, crystalwood_stats.maxuses, crystalwood_stats.efficiency, crystalwood_stats.damage, crystalwood_stats.enchantability);
/*      */     
/* 1421 */     toolCRYSTALSTONE = EnumHelper.addToolMaterial("CRYSTALSTONE", crystalstone_stats.harvestlevel, crystalstone_stats.maxuses, crystalstone_stats.efficiency, crystalstone_stats.damage, crystalstone_stats.enchantability);
/*      */     
/* 1423 */     toolCRYSTALPINK = EnumHelper.addToolMaterial("CRYSTALPINK", crystalpink_stats.harvestlevel, crystalpink_stats.maxuses, crystalpink_stats.efficiency, crystalpink_stats.damage, crystalpink_stats.enchantability);
/*      */     
/* 1425 */     toolTIGERSEYE = EnumHelper.addToolMaterial("TIGERSEYE", tigerseye_stats.harvestlevel, tigerseye_stats.maxuses, tigerseye_stats.efficiency, tigerseye_stats.damage, tigerseye_stats.enchantability);
/*      */     
/* 1427 */     toolROYAL = EnumHelper.addToolMaterial("ROYAL", royal_stats.harvestlevel, royal_stats.maxuses, royal_stats.efficiency, royal_stats.damage, royal_stats.enchantability);
/*      */     
/* 1429 */     toolHAMMY = EnumHelper.addToolMaterial("HAMMY", hammy_stats.harvestlevel, hammy_stats.maxuses, hammy_stats.efficiency, hammy_stats.damage, hammy_stats.enchantability);
/*      */     
/* 1431 */     toolBATTLE = EnumHelper.addToolMaterial("BATTLE", battleaxe_stats.harvestlevel, battleaxe_stats.maxuses, battleaxe_stats.efficiency, battleaxe_stats.damage, battleaxe_stats.enchantability);
/*      */     
/* 1433 */     toolCHAINSAW = EnumHelper.addToolMaterial("CHAINSAW", chainsaw_stats.harvestlevel, chainsaw_stats.maxuses, chainsaw_stats.efficiency, chainsaw_stats.damage, chainsaw_stats.enchantability);
/*      */     
/* 1435 */     toolQUEENBATTLE = EnumHelper.addToolMaterial("QUEENBATTLE", queenbattleaxe_stats.harvestlevel, queenbattleaxe_stats.maxuses, queenbattleaxe_stats.efficiency, queenbattleaxe_stats.damage, queenbattleaxe_stats.enchantability);
/*      */ 
/*      */ 
/*      */     
/* 1439 */     MyUltimateSword = (new UltimateSword(BaseItemID + 302, toolULTIMATE)).func_77655_b("ultimatesword");
/* 1440 */     MyUltimatePickaxe = (new UltimatePickaxe(BaseItemID + 305, toolULTIMATE)).func_77655_b("ultimatepickaxe");
/* 1441 */     MyUltimatePickaxe.setHarvestLevel("pickaxe", ultimate_stats.harvestlevel);
/* 1442 */     MyUltimateShovel = (new UltimateShovel(BaseItemID + 306, toolULTIMATE)).func_77655_b("ultimateshovel");
/* 1443 */     MyUltimateShovel.setHarvestLevel("shovel", ultimate_stats.harvestlevel);
/* 1444 */     MyUltimateHoe = (new UltimateHoe(BaseItemID + 307, toolULTIMATE)).func_77655_b("ultimatehoe");
/* 1445 */     MyUltimateAxe = (new UltimateAxe(BaseItemID + 308, toolULTIMATE)).func_77655_b("ultimateaxe");
/* 1446 */     MyUltimateAxe.setHarvestLevel("axe", ultimate_stats.harvestlevel);
/* 1447 */     MyNightmareSword = (new NightmareSword(BaseItemID + 326, toolNIGHTMARE)).func_77655_b("nightmaresword");
/* 1448 */     MyBertha = (new Bertha(BaseItemID + 313, toolBERTHA)).func_77655_b("berthasmall");
/* 1449 */     MySlice = (new Bertha(BaseItemID + 314, toolBERTHA)).func_77655_b("slicesmall");
/* 1450 */     MyRoyal = (new Bertha(BaseItemID + 318, toolROYAL)).func_77655_b("royalsmall");
/* 1451 */     MyHammy = (new Bertha(BaseItemID + 319, toolHAMMY)).func_77655_b("hammysmall");
/* 1452 */     MyBattleAxe = (new UltimateSword(BaseItemID + 422, toolBATTLE)).func_77655_b("battleaxesmall");
/* 1453 */     MyChainsaw = (new UltimateSword(BaseItemID + 447, toolCHAINSAW)).func_77655_b("chainsawsmall");
/* 1454 */     MyQueenBattleAxe = (new UltimateSword(BaseItemID + 470, toolQUEENBATTLE)).func_77655_b("queenbattleaxesmall");
/*      */     
/* 1456 */     MyEmeraldSword = (new EmeraldSword(BaseItemID + 280, toolEMERALD)).func_77655_b("emeraldsword");
/* 1457 */     MyEmeraldPickaxe = (new EmeraldPickaxe(BaseItemID + 281, toolEMERALD)).func_77655_b("emeraldpickaxe");
/* 1458 */     MyEmeraldShovel = (new EmeraldShovel(BaseItemID + 282, toolEMERALD)).func_77655_b("emeraldshovel");
/* 1459 */     MyEmeraldHoe = (new EmeraldHoe(BaseItemID + 283, toolEMERALD)).func_77655_b("emeraldhoe");
/* 1460 */     MyEmeraldAxe = (new EmeraldAxe(BaseItemID + 284, toolEMERALD)).func_77655_b("emeraldaxe");
/* 1461 */     MyExperienceSword = (new ExperienceSword(BaseItemID + 289, toolEMERALD)).func_77655_b("experiencesword");
/* 1462 */     MyPoisonSword = (new PoisonSword(BaseItemID + 241, toolEMERALD)).func_77655_b("poisonsword");
/* 1463 */     MyRatSword = (new RatSword(BaseItemID + 256, toolEMERALD)).func_77655_b("ratsword");
/* 1464 */     MyFairySword = (new FairySword(BaseItemID + 257, toolEMERALD)).func_77655_b("fairysword");
/* 1465 */     MyMantisClaw = (new MantisClaw(BaseItemID + 315, toolEMERALD)).func_77655_b("mantisclaw");
/* 1466 */     MyBigHammer = (new BigHammer(BaseItemID + 316, toolAMETHYST)).func_77655_b("bighammer");
/* 1467 */     MyRubySword = (new RubySword(BaseItemID + 271, toolRUBY)).func_77655_b("rubysword");
/* 1468 */     MyRubyPickaxe = (new RubyPickaxe(BaseItemID + 272, toolRUBY)).func_77655_b("rubypickaxe");
/* 1469 */     MyRubyPickaxe.setHarvestLevel("pickaxe", ruby_stats.harvestlevel);
/* 1470 */     MyRubyShovel = (new RubyShovel(BaseItemID + 273, toolRUBY)).func_77655_b("rubyshovel");
/* 1471 */     MyRubyShovel.setHarvestLevel("shovel", ruby_stats.harvestlevel);
/* 1472 */     MyRubyHoe = (new RubyHoe(BaseItemID + 274, toolRUBY)).func_77655_b("rubyhoe");
/* 1473 */     MyRubyAxe = (new RubyAxe(BaseItemID + 275, toolRUBY)).func_77655_b("rubyaxe");
/* 1474 */     MyRubyAxe.setHarvestLevel("axe", ruby_stats.harvestlevel);
/* 1475 */     MyAmethystSword = (new AmethystSword(BaseItemID + 261, toolAMETHYST)).func_77655_b("amethystsword");
/* 1476 */     MyAmethystPickaxe = (new AmethystPickaxe(BaseItemID + 262, toolAMETHYST)).func_77655_b("amethystpickaxe");
/* 1477 */     MyAmethystPickaxe.setHarvestLevel("pickaxe", amethyst_stats.harvestlevel);
/* 1478 */     MyAmethystShovel = (new AmethystShovel(BaseItemID + 263, toolAMETHYST)).func_77655_b("amethystshovel");
/* 1479 */     MyAmethystShovel.setHarvestLevel("shovel", amethyst_stats.harvestlevel);
/* 1480 */     MyAmethystHoe = (new AmethystHoe(BaseItemID + 264, toolAMETHYST)).func_77655_b("amethysthoe");
/* 1481 */     MyAmethystAxe = (new AmethystAxe(BaseItemID + 265, toolAMETHYST)).func_77655_b("amethystaxe");
/* 1482 */     MyAmethystAxe.setHarvestLevel("axe", amethyst_stats.harvestlevel);
/* 1483 */     MyCrystalWoodSword = (new CrystalSword(BaseItemID + 329, toolCRYSTALWOOD)).func_77655_b("crystalwoodsword");
/* 1484 */     MyCrystalWoodPickaxe = (new CrystalPickaxe(BaseItemID + 330, toolCRYSTALWOOD)).func_77655_b("crystalwoodpickaxe");
/* 1485 */     MyCrystalWoodShovel = (new CrystalShovel(BaseItemID + 331, toolCRYSTALWOOD)).func_77655_b("crystalwoodshovel");
/* 1486 */     MyCrystalWoodHoe = (new CrystalHoe(BaseItemID + 332, toolCRYSTALWOOD)).func_77655_b("crystalwoodhoe");
/* 1487 */     MyCrystalWoodAxe = (new CrystalAxe(BaseItemID + 333, toolCRYSTALWOOD)).func_77655_b("crystalwoodaxe");
/* 1488 */     MyCrystalPinkSword = (new CrystalSword(BaseItemID + 334, toolCRYSTALPINK)).func_77655_b("crystalpinksword");
/* 1489 */     MyCrystalPinkPickaxe = (new CrystalPickaxe(BaseItemID + 335, toolCRYSTALPINK)).func_77655_b("crystalpinkpickaxe");
/* 1490 */     MyCrystalPinkShovel = (new CrystalShovel(BaseItemID + 336, toolCRYSTALPINK)).func_77655_b("crystalpinkshovel");
/* 1491 */     MyCrystalPinkHoe = (new CrystalHoe(BaseItemID + 337, toolCRYSTALPINK)).func_77655_b("crystalpinkhoe");
/* 1492 */     MyCrystalPinkAxe = (new CrystalAxe(BaseItemID + 338, toolCRYSTALPINK)).func_77655_b("crystalpinkaxe");
/* 1493 */     MyCrystalStoneSword = (new CrystalSword(BaseItemID + 339, toolCRYSTALSTONE)).func_77655_b("crystalstonesword");
/* 1494 */     MyCrystalStonePickaxe = (new CrystalPickaxe(BaseItemID + 340, toolCRYSTALSTONE)).func_77655_b("crystalstonepickaxe");
/* 1495 */     MyCrystalStoneShovel = (new CrystalShovel(BaseItemID + 341, toolCRYSTALSTONE)).func_77655_b("crystalstoneshovel");
/* 1496 */     MyCrystalStoneHoe = (new CrystalHoe(BaseItemID + 342, toolCRYSTALSTONE)).func_77655_b("crystalstonehoe");
/* 1497 */     MyCrystalStoneAxe = (new CrystalAxe(BaseItemID + 343, toolCRYSTALSTONE)).func_77655_b("crystalstoneaxe");
/* 1498 */     MyTigersEyeSword = (new CrystalSword(BaseItemID + 349, toolTIGERSEYE)).func_77655_b("tigerseye_sword");
/* 1499 */     MyTigersEyePickaxe = (new CrystalPickaxe(BaseItemID + 350, toolTIGERSEYE)).func_77655_b("tigerseye_pickaxe");
/* 1500 */     MyTigersEyeShovel = (new CrystalShovel(BaseItemID + 351, toolTIGERSEYE)).func_77655_b("tigerseye_shovel");
/* 1501 */     MyTigersEyeHoe = (new CrystalHoe(BaseItemID + 352, toolTIGERSEYE)).func_77655_b("tigerseye_hoe");
/* 1502 */     MyTigersEyeAxe = (new CrystalAxe(BaseItemID + 353, toolTIGERSEYE)).func_77655_b("tigerseye_axe");
/*      */ 
/*      */     
/* 1505 */     MyItemShoes = (new ItemShoes(BaseItemID + 248, 2)).func_77655_b("redheels");
/* 1506 */     MyItemShoes_1 = (new ItemShoes(BaseItemID + 249, 3)).func_77655_b("blackheels");
/* 1507 */     MyItemShoes_2 = (new ItemShoes(BaseItemID + 250, 4)).func_77655_b("slippers");
/* 1508 */     MyItemShoes_3 = (new ItemShoes(BaseItemID + 251, 5)).func_77655_b("boots");
/* 1509 */     MyItemGameController = (new ItemShoes(BaseItemID + 259, 6)).func_77655_b("gamecontroller");
/*      */     
/* 1511 */     MyUltimateBow = (new UltimateBow(BaseItemID + 303)).func_77655_b("ultimatebow");
/* 1512 */     MySkateBow = (new SkateBow(BaseItemID + 373)).func_77655_b("skatebow");
/*      */     
/* 1514 */     MyUltimateFishingRod = (new UltimateFishingRod(BaseItemID + 304)).func_77655_b("ultimatefishingrod");
/* 1515 */     UltimateFishingRod = new ItemStack(MyUltimateFishingRod);
/*      */     
/* 1517 */     MyFireFish = (new ItemFireFish(BaseItemID + 175, 4, 0.6F, false)).func_77655_b("firefish");
/* 1518 */     MySunFish = (new ItemSunFish(BaseItemID + 176, 6, 0.6F, false)).func_77655_b("sunfish");
/* 1519 */     MyLavaEel = (new ItemLavaEel(BaseItemID + 157, 2, 0.6F, false)).func_77655_b("lavaeel");
/* 1520 */     MyMothScale = (new ItemSalt(BaseItemID + 156)).func_77655_b("mothscale");
/* 1521 */     MyQueenScale = (new ItemSalt(BaseItemID + 453)).func_77655_b("queenscale");
/* 1522 */     MyNightmareScale = (new ItemSalt(BaseItemID + 158)).func_77655_b("nightmarescale");
/* 1523 */     MyEmperorScorpionScale = (new ItemSalt(BaseItemID + 159)).func_77655_b("emperorscorpionscale");
/* 1524 */     MyBasiliskScale = (new ItemSalt(BaseItemID + 160)).func_77655_b("basiliskscale");
/* 1525 */     MyWaterDragonScale = (new ItemSalt(BaseItemID + 161)).func_77655_b("waterdragonscale");
/* 1526 */     MyPeacockFeather = (new ItemSalt(BaseItemID + 255)).func_77655_b("peacockfeather");
/* 1527 */     MyJumpyBugScale = (new ItemSalt(BaseItemID + 162)).func_77655_b("jumpybugscale");
/* 1528 */     MyKrakenTooth = (new ItemSalt(BaseItemID + 163)).func_77655_b("krakentooth");
/* 1529 */     MyGodzillaScale = (new ItemSalt(BaseItemID + 164)).func_77655_b("godzillascale");
/* 1530 */     GreenGoo = (new ItemSalt(BaseItemID + 154)).func_77655_b("greengoo");
/* 1531 */     SpiderRobotKit = (new ItemSpiderRobotKit(BaseItemID + 471)).func_77655_b("spiderrobotkit");
/* 1532 */     AntRobotKit = (new ItemSpiderRobotKit(BaseItemID + 473)).func_77655_b("antrobotkit");
/* 1533 */     ZooKeeper = (new ItemZooKeeper(BaseItemID + 230)).func_77655_b("zookeeper");
/* 1534 */     CreeperLauncher = (new ItemCreeperLauncher(BaseItemID + 252)).func_77655_b("creeperlauncher");
/* 1535 */     NetherLost = (new ItemNetherLost(BaseItemID + 253)).func_77655_b("netherlost");
/* 1536 */     CrystalSticks = (new ItemCrystalSticks(BaseItemID + 254)).func_77655_b("crystalsticks");
/* 1537 */     MySunspotUrchin = (new ItemSunspotUrchin(BaseItemID + 246)).func_77655_b("sunspoturchin");
/* 1538 */     MySparkFish = (new ItemSparkFish(BaseItemID + 177, 1, 0.2F, false)).func_77655_b("sparkfish");
/* 1539 */     MyWaterBall = (new ItemWaterBall(BaseItemID + 244)).func_77655_b("waterball");
/* 1540 */     MyLaserBall = (new ItemLaserBall(BaseItemID + 242)).func_77655_b("laserball");
/* 1541 */     MyIceBall = (new ItemIceBall(BaseItemID + 239)).func_77655_b("iceball");
/* 1542 */     MySmallRock = (new ItemRock(BaseItemID + 436)).func_77655_b("rocksmall");
/* 1543 */     MyRock = (new ItemRock(BaseItemID + 435)).func_77655_b("rock");
/* 1544 */     MyRedRock = (new ItemRock(BaseItemID + 437)).func_77655_b("rockred");
/* 1545 */     MyCrystalRedRock = (new ItemRock(BaseItemID + 443)).func_77655_b("rockcrystalred");
/* 1546 */     MyCrystalGreenRock = (new ItemRock(BaseItemID + 444)).func_77655_b("rockcrystalgreen");
/* 1547 */     MyCrystalBlueRock = (new ItemRock(BaseItemID + 445)).func_77655_b("rockcrystalblue");
/* 1548 */     MyCrystalTNTRock = (new ItemRock(BaseItemID + 446)).func_77655_b("rockcrystaltnt");
/* 1549 */     MyGreenRock = (new ItemRock(BaseItemID + 438)).func_77655_b("rockgreen");
/* 1550 */     MyBlueRock = (new ItemRock(BaseItemID + 439)).func_77655_b("rockblue");
/* 1551 */     MyPurpleRock = (new ItemRock(BaseItemID + 440)).func_77655_b("rockpurple");
/* 1552 */     MySpikeyRock = (new ItemRock(BaseItemID + 441)).func_77655_b("rockspikey");
/* 1553 */     MyTNTRock = (new ItemRock(BaseItemID + 442)).func_77655_b("rocktnt");
/* 1554 */     MyRayGun = (new ItemRayGun(BaseItemID + 243)).func_77655_b("RayGun");
/* 1555 */     MyThunderStaff = (new ItemThunderStaff(BaseItemID + 240)).func_77655_b("thunderstaff");
/* 1556 */     MyWrench = (new ItemWrench(BaseItemID + 472)).func_77655_b("wrench");
/* 1557 */     MyAcid = (new ItemAcid(BaseItemID + 247)).func_77655_b("acid");
/* 1558 */     MyIrukandji = (new ItemIrukandji(BaseItemID + 258)).func_77655_b("deadirukandji");
/* 1559 */     MyIrukandjiArrow = (new ItemIrukandjiArrow(BaseItemID + 372)).func_77655_b("irukandjiarrow");
/* 1560 */     MyGreenFish = (new ItemGenericFish(BaseItemID + 191, 3, 0.5F, false)).func_77655_b("greenfish");
/* 1561 */     MyBlueFish = (new ItemGenericFish(BaseItemID + 192, 4, 0.4F, false)).func_77655_b("bluefish");
/* 1562 */     MyPinkFish = (new ItemGenericFish(BaseItemID + 193, 4, 0.6F, false)).func_77655_b("pinkfish");
/* 1563 */     MyRockFish = (new ItemGenericFish(BaseItemID + 194, 3, 0.7F, false)).func_77655_b("rockfish");
/* 1564 */     MyWoodFish = (new ItemGenericFish(BaseItemID + 195, 5, 0.7F, false)).func_77655_b("woodfish");
/* 1565 */     MyGreyFish = (new ItemGenericFish(BaseItemID + 196, 5, 0.5F, false)).func_77655_b("greyfish");
/* 1566 */     Sifter = (new ItemSifter(BaseItemID + 325)).func_77655_b("sifter");
/* 1567 */     MySquidZooka = (new ItemSquidZooka(BaseItemID + 317)).func_77655_b("squidzookasmall");
/*      */     
/* 1569 */     BerthaHandle = (new ItemSalt(BaseItemID + 406)).func_77655_b("bbhandle");
/* 1570 */     BerthaGuard = (new ItemSalt(BaseItemID + 407)).func_77655_b("bbguard");
/* 1571 */     BerthaBlade = (new ItemSalt(BaseItemID + 408)).func_77655_b("bbblade");
/* 1572 */     MolenoidNose = (new ItemSalt(BaseItemID + 409)).func_77655_b("molenoidnose");
/* 1573 */     SeaMonsterScale = (new ItemSalt(BaseItemID + 410)).func_77655_b("seamonsterscale");
/* 1574 */     WormTooth = (new ItemSalt(BaseItemID + 411)).func_77655_b("wormtooth");
/* 1575 */     TRexTooth = (new ItemSalt(BaseItemID + 412)).func_77655_b("trextooth");
/* 1576 */     CaterKillerJaw = (new ItemSalt(BaseItemID + 413)).func_77655_b("caterkillerjaw");
/* 1577 */     SeaViperTongue = (new ItemSalt(BaseItemID + 414)).func_77655_b("seavipertongue");
/* 1578 */     VortexEye = (new ItemSalt(BaseItemID + 415)).func_77655_b("vortexeye");
/*      */ 
/*      */ 
/*      */     
/* 1582 */     armorULTIMATE = EnumHelper.addArmorMaterial("ULTIMATE", Ultimate_armorstats.durability, new int[] { Ultimate_armorstats.head_protection, Ultimate_armorstats.chest_protection, Ultimate_armorstats.leg_protection, Ultimate_armorstats.boot_protection }, Ultimate_armorstats.enchantability);
/*      */ 
/*      */     
/* 1585 */     armorMOBZILLA = EnumHelper.addArmorMaterial("MOBZILLA", Mobzilla_armorstats.durability, new int[] { Mobzilla_armorstats.head_protection, Mobzilla_armorstats.chest_protection, Mobzilla_armorstats.leg_protection, Mobzilla_armorstats.boot_protection }, Mobzilla_armorstats.enchantability);
/*      */ 
/*      */     
/* 1588 */     armorLAVAEEL = EnumHelper.addArmorMaterial("LAVAEEL", LavaEel_armorstats.durability, new int[] { LavaEel_armorstats.head_protection, LavaEel_armorstats.chest_protection, LavaEel_armorstats.leg_protection, LavaEel_armorstats.boot_protection }, LavaEel_armorstats.enchantability);
/*      */ 
/*      */     
/* 1591 */     armorMOTHSCALE = EnumHelper.addArmorMaterial("MOTHSCALE", MothScale_armorstats.durability, new int[] { MothScale_armorstats.head_protection, MothScale_armorstats.chest_protection, MothScale_armorstats.leg_protection, MothScale_armorstats.boot_protection }, MothScale_armorstats.enchantability);
/*      */ 
/*      */     
/* 1594 */     armorEMERALD = EnumHelper.addArmorMaterial("EMERALD", Emerald_armorstats.durability, new int[] { Emerald_armorstats.head_protection, Emerald_armorstats.chest_protection, Emerald_armorstats.leg_protection, Emerald_armorstats.boot_protection }, Emerald_armorstats.enchantability);
/*      */ 
/*      */     
/* 1597 */     armorEXPERIENCE = EnumHelper.addArmorMaterial("EXPERIENCE", Experience_armorstats.durability, new int[] { Experience_armorstats.head_protection, Experience_armorstats.chest_protection, Experience_armorstats.leg_protection, Experience_armorstats.boot_protection }, Experience_armorstats.enchantability);
/*      */ 
/*      */     
/* 1600 */     armorRUBY = EnumHelper.addArmorMaterial("RUBY", Ruby_armorstats.durability, new int[] { Ruby_armorstats.head_protection, Ruby_armorstats.chest_protection, Ruby_armorstats.leg_protection, Ruby_armorstats.boot_protection }, Ruby_armorstats.enchantability);
/*      */ 
/*      */     
/* 1603 */     armorAMETHYST = EnumHelper.addArmorMaterial("AMETHYST", Amethyst_armorstats.durability, new int[] { Amethyst_armorstats.head_protection, Amethyst_armorstats.chest_protection, Amethyst_armorstats.leg_protection, Amethyst_armorstats.boot_protection }, Amethyst_armorstats.enchantability);
/*      */ 
/*      */     
/* 1606 */     armorPINK = EnumHelper.addArmorMaterial("PINK", Pink_armorstats.durability, new int[] { Pink_armorstats.head_protection, Pink_armorstats.chest_protection, Pink_armorstats.leg_protection, Pink_armorstats.boot_protection }, Pink_armorstats.enchantability);
/*      */ 
/*      */     
/* 1609 */     armorTIGERSEYE = EnumHelper.addArmorMaterial("TIGERSEYE", TigersEye_armorstats.durability, new int[] { TigersEye_armorstats.head_protection, TigersEye_armorstats.chest_protection, TigersEye_armorstats.leg_protection, TigersEye_armorstats.boot_protection }, TigersEye_armorstats.enchantability);
/*      */ 
/*      */     
/* 1612 */     armorPEACOCK = EnumHelper.addArmorMaterial("PEACOCK", Peacock_armorstats.durability, new int[] { Peacock_armorstats.head_protection, Peacock_armorstats.chest_protection, Peacock_armorstats.leg_protection, Peacock_armorstats.boot_protection }, Peacock_armorstats.enchantability);
/*      */ 
/*      */     
/* 1615 */     armorROYAL = EnumHelper.addArmorMaterial("ROYAL", Royal_armorstats.durability, new int[] { Royal_armorstats.head_protection, Royal_armorstats.chest_protection, Royal_armorstats.leg_protection, Royal_armorstats.boot_protection }, Royal_armorstats.enchantability);
/*      */ 
/*      */     
/* 1618 */     armorLAPIS = EnumHelper.addArmorMaterial("LAPIS", Lapis_armorstats.durability, new int[] { Lapis_armorstats.head_protection, Lapis_armorstats.chest_protection, Lapis_armorstats.leg_protection, Lapis_armorstats.boot_protection }, Lapis_armorstats.enchantability);
/*      */ 
/*      */     
/* 1621 */     armorQUEEN = EnumHelper.addArmorMaterial("QUEEN", Queen_armorstats.durability, new int[] { Queen_armorstats.head_protection, Queen_armorstats.chest_protection, Queen_armorstats.leg_protection, Queen_armorstats.boot_protection }, Queen_armorstats.enchantability);
/*      */ 
/*      */ 
/*      */     
/* 1625 */     UltimateHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 309, armorULTIMATE, proxy.setArmorPrefix("ultimate"), 0)).func_77655_b("ultimate_helmet");
/* 1626 */     UltimateBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 310, armorULTIMATE, proxy.setArmorPrefix("ultimate"), 1)).func_77655_b("ultimate_chest");
/* 1627 */     UltimateLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 311, armorULTIMATE, proxy.setArmorPrefix("ultimate"), 2)).func_77655_b("ultimate_leggings");
/* 1628 */     UltimateBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 312, armorULTIMATE, proxy.setArmorPrefix("ultimate"), 3)).func_77655_b("ultimate_boots");
/* 1629 */     LavaEelHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 298, armorLAVAEEL, proxy.setArmorPrefix("lavaeel"), 0)).func_77655_b("lavaeel_helmet");
/* 1630 */     LavaEelBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 299, armorLAVAEEL, proxy.setArmorPrefix("lavaeel"), 1)).func_77655_b("lavaeel_chest");
/* 1631 */     LavaEelLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 300, armorLAVAEEL, proxy.setArmorPrefix("lavaeel"), 2)).func_77655_b("lavaeel_leggings");
/* 1632 */     LavaEelBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 301, armorLAVAEEL, proxy.setArmorPrefix("lavaeel"), 3)).func_77655_b("lavaeel_boots");
/* 1633 */     MothScaleHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 294, armorMOTHSCALE, proxy.setArmorPrefix("mothscale"), 0)).func_77655_b("mothscale_helmet");
/* 1634 */     MothScaleBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 295, armorMOTHSCALE, proxy.setArmorPrefix("mothscale"), 1)).func_77655_b("mothscale_chest");
/* 1635 */     MothScaleLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 296, armorMOTHSCALE, proxy.setArmorPrefix("mothscale"), 2)).func_77655_b("mothscale_leggings");
/* 1636 */     MothScaleBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 297, armorMOTHSCALE, proxy.setArmorPrefix("mothscale"), 3)).func_77655_b("mothscale_boots");
/* 1637 */     EmeraldHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 285, armorEMERALD, proxy.setArmorPrefix("emerald"), 0)).func_77655_b("emerald_helmet");
/* 1638 */     EmeraldBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 286, armorEMERALD, proxy.setArmorPrefix("emerald"), 1)).func_77655_b("emerald_chest");
/* 1639 */     EmeraldLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 287, armorEMERALD, proxy.setArmorPrefix("emerald"), 2)).func_77655_b("emerald_leggings");
/* 1640 */     EmeraldBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 288, armorEMERALD, proxy.setArmorPrefix("emerald"), 3)).func_77655_b("emerald_boots");
/* 1641 */     ExperienceHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 290, armorEXPERIENCE, proxy.setArmorPrefix("experience"), 0)).func_77655_b("experience_helmet");
/* 1642 */     ExperienceBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 291, armorEXPERIENCE, proxy.setArmorPrefix("experience"), 1)).func_77655_b("experience_chest");
/* 1643 */     ExperienceLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 292, armorEXPERIENCE, proxy.setArmorPrefix("experience"), 2)).func_77655_b("experience_leggings");
/* 1644 */     ExperienceBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 293, armorEXPERIENCE, proxy.setArmorPrefix("experience"), 3)).func_77655_b("experience_boots");
/* 1645 */     RubyHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 276, armorRUBY, proxy.setArmorPrefix("ruby"), 0)).func_77655_b("ruby_helmet");
/* 1646 */     RubyBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 277, armorRUBY, proxy.setArmorPrefix("ruby"), 1)).func_77655_b("ruby_chest");
/* 1647 */     RubyLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 278, armorRUBY, proxy.setArmorPrefix("ruby"), 2)).func_77655_b("ruby_leggings");
/* 1648 */     RubyBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 279, armorRUBY, proxy.setArmorPrefix("ruby"), 3)).func_77655_b("ruby_boots");
/* 1649 */     AmethystHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 266, armorAMETHYST, proxy.setArmorPrefix("amethyst"), 0)).func_77655_b("amethyst_helmet");
/* 1650 */     AmethystBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 267, armorAMETHYST, proxy.setArmorPrefix("amethyst"), 1)).func_77655_b("amethyst_chest");
/* 1651 */     AmethystLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 268, armorAMETHYST, proxy.setArmorPrefix("amethyst"), 2)).func_77655_b("amethyst_leggings");
/* 1652 */     AmethystBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 269, armorAMETHYST, proxy.setArmorPrefix("amethyst"), 3)).func_77655_b("amethyst_boots");
/* 1653 */     CrystalPinkHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 344, armorPINK, proxy.setArmorPrefix("pink"), 0)).func_77655_b("pink_helmet");
/* 1654 */     CrystalPinkBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 345, armorPINK, proxy.setArmorPrefix("pink"), 1)).func_77655_b("pink_chest");
/* 1655 */     CrystalPinkLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 346, armorPINK, proxy.setArmorPrefix("pink"), 2)).func_77655_b("pink_leggings");
/* 1656 */     CrystalPinkBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 347, armorPINK, proxy.setArmorPrefix("pink"), 3)).func_77655_b("pink_boots");
/* 1657 */     TigersEyeHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 354, armorTIGERSEYE, proxy.setArmorPrefix("tigerseye"), 0)).func_77655_b("tigerseye_helmet");
/* 1658 */     TigersEyeBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 355, armorTIGERSEYE, proxy.setArmorPrefix("tigerseye"), 1)).func_77655_b("tigerseye_chest");
/* 1659 */     TigersEyeLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 356, armorTIGERSEYE, proxy.setArmorPrefix("tigerseye"), 2)).func_77655_b("tigerseye_leggings");
/* 1660 */     TigersEyeBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 357, armorTIGERSEYE, proxy.setArmorPrefix("tigerseye"), 3)).func_77655_b("tigerseye_boots");
/* 1661 */     PeacockFeatherBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 371, armorPEACOCK, proxy.setArmorPrefix("peacock"), 3)).func_77655_b("peacock_boots");
/* 1662 */     PeacockFeatherHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 359, armorPEACOCK, proxy.setArmorPrefix("peacock"), 0)).func_77655_b("peacock_helmet");
/* 1663 */     PeacockFeatherBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 360, armorPEACOCK, proxy.setArmorPrefix("peacock"), 1)).func_77655_b("peacock_chest");
/* 1664 */     PeacockFeatherLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 370, armorPEACOCK, proxy.setArmorPrefix("peacock"), 2)).func_77655_b("peacock_leggings");
/* 1665 */     MobzillaHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 395, armorMOBZILLA, proxy.setArmorPrefix("mobzilla"), 0)).func_77655_b("mobzilla_helmet");
/* 1666 */     MobzillaBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 396, armorMOBZILLA, proxy.setArmorPrefix("mobzilla"), 1)).func_77655_b("mobzilla_chest");
/* 1667 */     MobzillaLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 397, armorMOBZILLA, proxy.setArmorPrefix("mobzilla"), 2)).func_77655_b("mobzilla_leggings");
/* 1668 */     MobzillaBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 398, armorMOBZILLA, proxy.setArmorPrefix("mobzilla"), 3)).func_77655_b("mobzilla_boots");
/* 1669 */     RoyalHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 402, armorROYAL, proxy.setArmorPrefix("royal"), 0)).func_77655_b("royal_helmet");
/* 1670 */     RoyalBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 403, armorROYAL, proxy.setArmorPrefix("royal"), 1)).func_77655_b("royal_chest");
/* 1671 */     RoyalLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 404, armorROYAL, proxy.setArmorPrefix("royal"), 2)).func_77655_b("royal_leggings");
/* 1672 */     RoyalBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 405, armorROYAL, proxy.setArmorPrefix("royal"), 3)).func_77655_b("royal_boots");
/* 1673 */     LapisHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 449, armorLAPIS, proxy.setArmorPrefix("lapis"), 0)).func_77655_b("lapis_helmet");
/* 1674 */     LapisBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 450, armorLAPIS, proxy.setArmorPrefix("lapis"), 1)).func_77655_b("lapis_chest");
/* 1675 */     LapisLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 451, armorLAPIS, proxy.setArmorPrefix("lapis"), 2)).func_77655_b("lapis_leggings");
/* 1676 */     LapisBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 452, armorLAPIS, proxy.setArmorPrefix("lapis"), 3)).func_77655_b("lapis_boots");
/* 1677 */     QueenHelmet = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 454, armorQUEEN, proxy.setArmorPrefix("queen"), 0)).func_77655_b("queen_helmet");
/* 1678 */     QueenBody = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 455, armorQUEEN, proxy.setArmorPrefix("queen"), 1)).func_77655_b("queen_chest");
/* 1679 */     QueenLegs = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 456, armorQUEEN, proxy.setArmorPrefix("queen"), 2)).func_77655_b("queen_leggings");
/* 1680 */     QueenBoots = (ItemOreSpawnArmor)(new ItemOreSpawnArmor(BaseItemID + 457, armorQUEEN, proxy.setArmorPrefix("queen"), 3)).func_77655_b("queen_boots");
/*      */ 
/*      */ 
/*      */     
/* 1684 */     MyOreSaltBlock = (new OreSalt(BaseBlockID + 100)).func_149663_c("oresalt");
/* 1685 */     MySalt = (new ItemSalt(BaseItemID + 178)).func_77655_b("salt");
/* 1686 */     MyPopcorn = (new ItemPopcorn(BaseItemID + 179, 1, 0.5F, false)).func_77655_b("popcorn");
/* 1687 */     MyButteredPopcorn = (new ItemPopcorn(BaseItemID + 180, 2, 0.6F, false)).func_77655_b("popcorn_buttered");
/* 1688 */     MyButteredSaltedPopcorn = (new ItemPopcorn(BaseItemID + 181, 3, 0.75F, false)).func_77655_b("popcorn_buttered_salted");
/* 1689 */     MyPopcornBag = (new ItemPopcorn(BaseItemID + 182, 10, 1.25F, false)).func_77655_b("popcorn_bag");
/* 1690 */     MyButter = (new ItemPopcorn(BaseItemID + 183, 1, 0.5F, false)).func_77655_b("butter");
/* 1691 */     MyCornDog = (new ItemPopcorn(BaseItemID + 186, 16, 2.5F, false)).func_77655_b("corndog_cooked");
/* 1692 */     MyRawCornDog = (new ItemPopcorn(BaseItemID + 187, 4, 0.6F, false)).func_77655_b("corndog_raw");
/* 1693 */     MyButterCandy = (new ItemSunFish(BaseItemID + 188, 4, 0.5F, false)).func_77655_b("buttercandy");
/* 1694 */     MyBacon = (new ItemSunFish(BaseItemID + 189, 14, 1.5F, false)).func_77655_b("cookedbacon");
/* 1695 */     MyRawBacon = (new ItemPopcorn(BaseItemID + 190, 8, 1.0F, false)).func_77655_b("bacon");
/* 1696 */     MyCrabMeat = (new ItemSunFish(BaseItemID + 480, 6, 0.75F, false)).func_77655_b("cookedcrabmeat");
/* 1697 */     MyRawCrabMeat = (new ItemPopcorn(BaseItemID + 479, 4, 0.25F, false)).func_77655_b("crabmeat");
/* 1698 */     MyCheese = (new ItemPopcorn(BaseItemID + 205, 4, 0.5F, false)).func_77655_b("cheese");
/* 1699 */     MySalad = (new ItemPopcorn(BaseItemID + 200, 10, 0.95F, false)).func_77655_b("salad");
/* 1700 */     MyBLT = (new ItemPopcorn(BaseItemID + 201, 12, 0.95F, false)).func_77655_b("blt_sandwich");
/* 1701 */     MyCrabbyPatty = (new ItemPopcorn(BaseItemID + 481, 16, 2.35F, false)).func_77655_b("crabbypatty");
/* 1702 */     MyOreRubyBlock = (new OreRuby(BaseBlockID + 104)).func_149663_c("oreruby");
/* 1703 */     MyRuby = (new ItemSalt(BaseItemID + 270)).func_77655_b("ruby");
/* 1704 */     MyOreAmethystBlock = (new OreAmethyst(BaseBlockID + 103)).func_149663_c("oreamethyst");
/* 1705 */     MyAmethyst = (new ItemSalt(BaseItemID + 260)).func_77655_b("amethyst");
/* 1706 */     UraniumNugget = (new ItemSalt(BaseItemID + 150)).func_77655_b("uranium_nugget");
/* 1707 */     TitaniumNugget = (new ItemSalt(BaseItemID + 151)).func_77655_b("titanium_nugget");
/* 1708 */     CrystalStone = (new OreBasicStone(BaseBlockID + 200, 2.0F, 10.0F)).func_149663_c("crystalstone");
/* 1709 */     CrystalCoal = (new OreCrystal(BaseBlockID + 201, 0.6F, 6.0F, 20.0F)).func_149663_c("crystalcoal");
/* 1710 */     CrystalGrass = (new CrystalGrass(BaseBlockID + 202, 0.6F, 2.0F)).func_149663_c("crystalgrass");
/* 1711 */     CrystalCrystal = (new OreCrystalCrystal(BaseBlockID + 209, 0.4F, 12.0F, 40.0F)).func_149663_c("crystalcrystal");
/* 1712 */     TigersEye = (new OreCrystalCrystal(BaseBlockID + 217, 0.5F, 15.0F, 60.0F)).func_149663_c("tigerseye");
/* 1713 */     CrystalPlanksBlock = (new CrystalWood(BaseBlockID + 210, 1.5F, 4.0F)).func_149663_c("crystalplanks");
/* 1714 */     CrystalWorkbenchBlock = (new CrystalWorkbench(BaseBlockID + 211, 1.0F, 5.0F)).func_149663_c("crystalworkbench");
/* 1715 */     CrystalFurnaceBlock = (CrystalFurnace)(new CrystalFurnace(BaseBlockID + 212, false, 2.0F, 10.0F)).func_149663_c("crystalfurnace");
/* 1716 */     CrystalFurnaceOnBlock = (new CrystalFurnace(BaseBlockID + 213, true, 2.0F, 10.0F)).func_149663_c("crystalfurnace");
/* 1717 */     MyPeacock = (new ItemPopcorn(BaseItemID + 207, 12, 1.4F, false)).func_77655_b("cookedpeacock");
/* 1718 */     MyRawPeacock = (new ItemPopcorn(BaseItemID + 206, 6, 0.7F, false)).func_77655_b("rawpeacock");
/* 1719 */     CrystalRat = (new OreBasicStone(BaseBlockID + 219, 2.5F, 14.0F)).func_149663_c("crystalrat");
/* 1720 */     CrystalFairy = (new OreBasicStone(BaseBlockID + 220, 2.5F, 14.0F)).func_149663_c("crystalfairy");
/* 1721 */     RedAntTroll = (new OreBasicStone(BaseBlockID + 225, 2.5F, 14.0F)).func_149663_c("redanttroll");
/* 1722 */     TermiteTroll = (new OreBasicStone(BaseBlockID + 226, 2.5F, 14.0F)).func_149663_c("termitetroll");
/*      */ 
/*      */     
/* 1725 */     MyRTPBlock = (new RTPBlock(BaseBlockID + 105)).func_149663_c("blockteleport").func_149672_a(Block.field_149769_e);
/* 1726 */     MyStepUp = (new StepUp(BaseItemID + 232)).func_77655_b("step_up");
/* 1727 */     MyStepDown = (new StepDown(BaseItemID + 233)).func_77655_b("step_down");
/* 1728 */     MyStepAccross = (new StepAccross(BaseItemID + 234)).func_77655_b("step_accross");
/* 1729 */     MyMoleDirtBlock = (new MoleDirtBlock(BaseBlockID + 123)).func_149711_c(0.6F).func_149663_c("moledirt").func_149672_a(new Block.SoundType("gravel", 1.0F, 1.0F));
/*      */ 
/*      */     
/* 1732 */     initializeCagesAndEggs();
/*      */ 
/*      */     
/* 1735 */     MyStrawberry = (new ItemStrawberry(BaseItemID + 184, 2, 0.65F, false)).func_77655_b("strawberry");
/* 1736 */     MyStrawberryPlant = (Block)new BlockStrawberry(BaseBlockID + 153);
/* 1737 */     MyStrawberrySeed = (new ItemStrawberrySeed(BaseItemID + 210, MyStrawberryPlant, Blocks.field_150458_ak)).func_77655_b("strawberry_seed");
/* 1738 */     MyButterflyPlant = (Block)new BlockButterflyPlant(BaseBlockID + 155);
/* 1739 */     MyButterflySeed = (new ItemButterflySeed(BaseItemID + 212, MyButterflyPlant, Blocks.field_150458_ak)).func_77655_b("butterfly_seed");
/* 1740 */     MyMothPlant = (Block)new BlockMothPlant(BaseBlockID + 156);
/* 1741 */     MyMothSeed = (new ItemMothSeed(BaseItemID + 213, MyMothPlant, Blocks.field_150458_ak)).func_77655_b("moth_seed");
/* 1742 */     MyMosquitoPlant = (Block)new BlockMosquitoPlant(BaseBlockID + 157);
/* 1743 */     MyMosquitoSeed = (new ItemMosquitoSeed(BaseItemID + 214, MyMosquitoPlant, Blocks.field_150458_ak)).func_77655_b("mosquito_seed");
/* 1744 */     MyFireflyPlant = (Block)new BlockFireflyPlant(BaseBlockID + 154);
/* 1745 */     MyFireflySeed = (new ItemFireflySeed(BaseItemID + 215, MyFireflyPlant, Blocks.field_150458_ak)).func_77655_b("firefly_seed");
/* 1746 */     MyRadishPlant = (Block)new BlockRadish(BaseBlockID + 175);
/* 1747 */     MyRadish = (new ItemRadish(BaseItemID + 199, 2, 0.45F, MyRadishPlant, Blocks.field_150458_ak)).func_77655_b("radish");
/* 1748 */     MyCherry = (new ItemStrawberry(BaseItemID + 202, 3, 0.45F, false)).func_77655_b("cherries");
/* 1749 */     MyPeach = (new ItemStrawberry(BaseItemID + 203, 4, 0.55F, false)).func_77655_b("peach");
/* 1750 */     MyCrystalApple = (new ItemSunFish(BaseItemID + 208, 5, 0.85F, false)).func_77655_b("crystalapple");
/* 1751 */     MyRicePlant = (Block)new BlockRice(BaseBlockID + 178);
/* 1752 */     MyRice = (new ItemRadish(BaseItemID + 209, 5, 0.65F, MyRicePlant, CrystalGrass)).func_77655_b("rice");
/*      */     
/* 1754 */     MyElevator = (new ItemElevator(BaseItemID + 235)).func_77655_b("elevator");
/*      */     
/* 1756 */     MyCornPlant1 = (new BlockCorn(BaseBlockID + 163)).func_149663_c("corn_0");
/* 1757 */     MyCornPlant2 = (new BlockCorn(BaseBlockID + 164)).func_149663_c("corn_1");
/* 1758 */     MyCornPlant3 = (new BlockCorn(BaseBlockID + 165)).func_149663_c("corn_2");
/* 1759 */     MyCornPlant4 = (new BlockCorn(BaseBlockID + 166)).func_149663_c("corn_3");
/* 1760 */     MyCornCob = (new ItemCornCob(BaseItemID + 185, 6, 0.75F, MyCornPlant1, Blocks.field_150458_ak)).func_77655_b("corn_seed");
/* 1761 */     MyQuinoaPlant1 = (new BlockQuinoa(BaseBlockID + 179)).func_149663_c("quinoa_0");
/* 1762 */     MyQuinoaPlant2 = (new BlockQuinoa(BaseBlockID + 180)).func_149663_c("quinoa_1");
/* 1763 */     MyQuinoaPlant3 = (new BlockQuinoa(BaseBlockID + 181)).func_149663_c("quinoa_2");
/* 1764 */     MyQuinoaPlant4 = (new BlockQuinoa(BaseBlockID + 182)).func_149663_c("quinoa_3");
/* 1765 */     MyQuinoa = (new ItemCornCob(BaseItemID + 224, 7, 0.85F, MyQuinoaPlant1, CrystalGrass)).func_77655_b("quinoa");
/*      */     
/* 1767 */     MyTomatoPlant1 = (new BlockTomato(BaseBlockID + 167)).func_149663_c("tomato_0");
/* 1768 */     MyTomatoPlant2 = (new BlockTomato(BaseBlockID + 168)).func_149663_c("tomato_1");
/* 1769 */     MyTomatoPlant3 = (new BlockTomato(BaseBlockID + 169)).func_149663_c("tomato_2");
/* 1770 */     MyTomatoPlant4 = (new BlockTomato(BaseBlockID + 170)).func_149663_c("tomato_3");
/* 1771 */     MyTomato = (new ItemTomato(BaseItemID + 197, 4, 0.55F, MyTomatoPlant1, Blocks.field_150458_ak)).func_77655_b("tomato_seed");
/* 1772 */     MyLettucePlant1 = (new BlockLettuce(BaseBlockID + 171)).func_149663_c("lettuce_0");
/* 1773 */     MyLettucePlant2 = (new BlockLettuce(BaseBlockID + 172)).func_149663_c("lettuce_1");
/* 1774 */     MyLettucePlant3 = (new BlockLettuce(BaseBlockID + 173)).func_149663_c("lettuce_2");
/* 1775 */     MyLettucePlant4 = (new BlockLettuce(BaseBlockID + 174)).func_149663_c("lettuce_3");
/* 1776 */     MyLettuce = (new ItemLettuce(BaseItemID + 198, 3, 0.45F, MyLettucePlant1, Blocks.field_150458_ak)).func_77655_b("lettuce_seed");
/*      */     
/* 1778 */     MagicApple = (new ItemMagicApple(BaseItemID + 236)).func_77655_b("magicapple");
/* 1779 */     MinersDream = (new ItemMinersDream(BaseItemID + 237)).func_77655_b("minersdream");
/* 1780 */     ExtremeTorch = (new BlockExtremeTorch(BaseBlockID + 192)).func_149715_a(1.0F).func_149663_c("extremetorch");
/* 1781 */     KrakenRepellent = (new KrakenRepellent(BaseBlockID + 190)).func_149715_a(0.8F).func_149663_c("krakenrepellent");
/* 1782 */     MyIslandBlock = (new IslandBlock(BaseBlockID + 193)).func_149715_a(0.9F).func_149663_c("island");
/* 1783 */     CreeperRepellent = (new CreeperRepellent(BaseBlockID + 191)).func_149715_a(0.8F).func_149663_c("creeperrepellent");
/* 1784 */     ZooCage2 = (new ZooCage(BaseItemID + 320, 3)).func_77655_b("zoo2");
/* 1785 */     ZooCage4 = (new ZooCage(BaseItemID + 321, 5)).func_77655_b("zoo4");
/* 1786 */     ZooCage6 = (new ZooCage(BaseItemID + 322, 9)).func_77655_b("zoo6");
/* 1787 */     ZooCage8 = (new ZooCage(BaseItemID + 323, 13)).func_77655_b("zoo8");
/* 1788 */     ZooCage10 = (new ZooCage(BaseItemID + 324, 17)).func_77655_b("zoo10");
/* 1789 */     InstantShelter = (new InstantShelter(BaseItemID + 327)).func_77655_b("instantshelter");
/* 1790 */     InstantGarden = (new InstantGarden(BaseItemID + 328)).func_77655_b("instantgarden");
/* 1791 */     CrystalTorch = (new BlockCrystalTorch(BaseBlockID + 214)).func_149715_a(0.99F).func_149663_c("crystaltorch");
/* 1792 */     MyKingSpawnerBlock = (new KingSpawnerBlock(BaseBlockID + 195)).func_149715_a(0.9F).func_149663_c("kingspawner");
/* 1793 */     MyQueenSpawnerBlock = (new QueenSpawnerBlock(BaseBlockID + 197)).func_149715_a(0.9F).func_149663_c("queenspawner");
/* 1794 */     RandomDungeon = (new ItemRandomDungeon(BaseItemID + 421)).func_77655_b("randomdungeon");
/* 1795 */     MyDungeonSpawnerBlock = (new DungeonSpawnerBlock(BaseBlockID + 196)).func_149715_a(0.9F).func_149663_c("dungeonspawner");
/*      */ 
/*      */     
/* 1798 */     MyAppleLeaves = (new BlockAppleLeaves(BaseBlockID + 150)).func_149711_c(0.2F).func_149713_g(1).func_149672_a(Block.field_149779_h).func_149663_c("leaves_apple");
/* 1799 */     MyAppleSeed = (new ItemAppleSeed(BaseItemID + 211)).func_77655_b("appletree_seed");
/* 1800 */     MySkyTreeLog = (new BlockSkyTreeLog(BaseBlockID + 113, 20)).func_149711_c(0.2F).func_149672_a(Block.field_149766_f).func_149663_c("skytreelog");
/*      */ 
/*      */     
/* 1803 */     MyDT = (new BlockDuplicatorLog(BaseBlockID + 114)).func_149711_c(0.2F).func_149672_a(Block.field_149766_f).func_149663_c("duplicatortreelog");
/* 1804 */     MyExperienceLeaves = (new BlockExperienceLeaves(BaseBlockID + 151)).func_149711_c(0.2F).func_149713_g(1).func_149672_a(Block.field_149779_h).func_149663_c("leaves_experience");
/* 1805 */     MyExperienceCatcher = (new ExperienceCatcher(BaseItemID + 238)).func_77655_b("experiencecatcher");
/* 1806 */     MyExperienceTreeSeed = (new ItemExperienceTreeSeed(BaseItemID + 216)).func_77655_b("experiencetree_seed");
/* 1807 */     MyExperiencePlant = (new BlockExperiencePlant(BaseBlockID + 158)).func_149663_c("experiencesapling");
/* 1808 */     MyDeadStinkBug = (new ItemSalt(BaseItemID + 155)).func_77655_b("deadstinkbug");
/* 1809 */     MyFlowerPinkBlock = (new MyBlockFlower(BaseBlockID + 159)).func_149711_c(0.0F).func_149672_a(Block.field_149779_h).func_149663_c("flower_pink");
/* 1810 */     MyFlowerBlueBlock = (new MyBlockFlower(BaseBlockID + 160)).func_149711_c(0.0F).func_149672_a(Block.field_149779_h).func_149663_c("flower_blue");
/* 1811 */     MyFlowerBlackBlock = (new MyBlockFlower(BaseBlockID + 161)).func_149711_c(0.0F).func_149672_a(Block.field_149779_h).func_149663_c("flower_black");
/* 1812 */     MyFlowerScaryBlock = (new MyBlockFlower(BaseBlockID + 162)).func_149711_c(0.0F).func_149672_a(Block.field_149779_h).func_149663_c("flower_scary");
/* 1813 */     MyScaryLeaves = (new BlockScaryLeaves(BaseBlockID + 152)).func_149711_c(0.2F).func_149713_g(1).func_149672_a(Block.field_149779_h).func_149663_c("leaves_scary");
/* 1814 */     MyCherryLeaves = (new BlockScaryLeaves(BaseBlockID + 176)).func_149711_c(0.15F).func_149713_g(1).func_149672_a(Block.field_149779_h).func_149663_c("leaves_cherry");
/* 1815 */     MyPeachLeaves = (new BlockScaryLeaves(BaseBlockID + 177)).func_149711_c(0.15F).func_149713_g(1).func_149672_a(Block.field_149779_h).func_149663_c("leaves_peach");
/* 1816 */     MyCherrySeed = (new ItemAppleSeed(BaseItemID + 217)).func_77655_b("cherrytree_seed");
/* 1817 */     MyPeachSeed = (new ItemAppleSeed(BaseItemID + 218)).func_77655_b("peachtree_seed");
/* 1818 */     CrystalFlowerRedBlock = (new MyBlockFlower(BaseBlockID + 203)).func_149711_c(0.0F).func_149672_a(new Block.SoundType("grass", 1.0F, 1.0F)).func_149663_c("crystalflower_red");
/* 1819 */     CrystalFlowerGreenBlock = (new MyBlockFlower(BaseBlockID + 204)).func_149711_c(0.0F).func_149672_a(new Block.SoundType("grass", 1.0F, 1.0F)).func_149663_c("crystalflower_green");
/* 1820 */     CrystalFlowerBlueBlock = (new MyBlockFlower(BaseBlockID + 205)).func_149711_c(0.0F).func_149672_a(new Block.SoundType("grass", 1.0F, 1.0F)).func_149663_c("crystalflower_blue");
/* 1821 */     CrystalFlowerYellowBlock = (new MyBlockFlower(BaseBlockID + 206)).func_149711_c(0.0F).func_149672_a(new Block.SoundType("grass", 1.0F, 1.0F)).func_149663_c("crystalflower_yellow");
/* 1822 */     MyCrystalLeaves = (new BlockCrystalLeaves(BaseBlockID + 208)).func_149711_c(0.2F).func_149713_g(1).func_149672_a(new Block.SoundType("grass", 1.0F, 1.0F)).func_149663_c("crystaltreeleaves");
/* 1823 */     MyCrystalTreeLog = (new BlockCrystalTreeLog(BaseBlockID + 207, 20)).func_149711_c(0.2F).func_149672_a(new Block.SoundType("wood", 1.0F, 1.0F)).func_149663_c("crystaltreelog");
/* 1824 */     MyCrystalLeaves2 = (new BlockCrystalLeaves(BaseBlockID + 215)).func_149711_c(0.25F).func_149713_g(1).func_149672_a(new Block.SoundType("grass", 1.0F, 1.0F)).func_149663_c("crystaltreeleaves2");
/* 1825 */     MyCrystalLeaves3 = (new BlockCrystalLeaves(BaseBlockID + 221)).func_149711_c(0.25F).func_149713_g(1).func_149672_a(new Block.SoundType("grass", 1.0F, 1.0F)).func_149663_c("crystaltreeleaves3");
/* 1826 */     MyCrystalPlant = (new BlockCrystalPlant(BaseBlockID + 222)).func_149663_c("crystalsapling");
/* 1827 */     MyCrystalPlant2 = (new BlockCrystalPlant(BaseBlockID + 223)).func_149663_c("crystalsapling2");
/* 1828 */     MyCrystalPlant3 = (new BlockCrystalPlant(BaseBlockID + 224)).func_149663_c("crystalsapling3");
/*      */     
/* 1830 */     MyEnderPearlBlock = (new OreGenericEgg(BaseBlockID + 111)).func_149663_c("blockenderpearl");
/* 1831 */     MyEyeOfEnderBlock = (new OreGenericEgg(BaseBlockID + 112)).func_149663_c("blockeyeofender");
/*      */ 
/*      */ 
/*      */     
/* 1835 */     make_some_more_things();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void make_some_more_things() {
/* 1841 */     GameRegistry.registerBlock(MySpiderSpawnBlock, "OreSpawn_SpiderSpawnBlock");
/* 1842 */     GameRegistry.registerBlock(MyBatSpawnBlock, "OreSpawn_BatSpawnBlock");
/* 1843 */     GameRegistry.registerBlock(MyCowSpawnBlock, "OreSpawn_CowSpawnBlock");
/* 1844 */     GameRegistry.registerBlock(MyPigSpawnBlock, "OreSpawn_PigSpawnBlock");
/* 1845 */     GameRegistry.registerBlock(MySquidSpawnBlock, "OreSpawn_SquidSpawnBlock");
/* 1846 */     GameRegistry.registerBlock(MyChickenSpawnBlock, "OreSpawn_ChickenSpawnBlock");
/* 1847 */     GameRegistry.registerBlock(MyCreeperSpawnBlock, "OreSpawn_CreeperSpawnBlock");
/* 1848 */     GameRegistry.registerBlock(MySkeletonSpawnBlock, "OreSpawn_SkeletonSpawnBlock");
/* 1849 */     GameRegistry.registerBlock(MyZombieSpawnBlock, "OreSpawn_ZombieSpawnBlock");
/* 1850 */     GameRegistry.registerBlock(MySlimeSpawnBlock, "OreSpawn_SlimeSpawnBlock");
/* 1851 */     GameRegistry.registerBlock(MyGhastSpawnBlock, "OreSpawn_GhastSpawnBlock");
/* 1852 */     GameRegistry.registerBlock(MyZombiePigmanSpawnBlock, "OreSpawn_ZombiePigmanSpawnBlock");
/* 1853 */     GameRegistry.registerBlock(MyEndermanSpawnBlock, "OreSpawn_EndermanSpawnBlock");
/* 1854 */     GameRegistry.registerBlock(MyCaveSpiderSpawnBlock, "OreSpawn_CaveSpiderSpawnBlock");
/* 1855 */     GameRegistry.registerBlock(MySilverfishSpawnBlock, "OreSpawn_SilverfishSpawnBlock");
/* 1856 */     GameRegistry.registerBlock(MyMagmaCubeSpawnBlock, "OreSpawn_MagmaCubeSpawnBlock");
/* 1857 */     GameRegistry.registerBlock(MyWitchSpawnBlock, "OreSpawn_WitchSpawnBlock");
/* 1858 */     GameRegistry.registerBlock(MySheepSpawnBlock, "OreSpawn_SheepSpawnBlock");
/* 1859 */     GameRegistry.registerBlock(MyWolfSpawnBlock, "OreSpawn_WolfSpawnBlock");
/* 1860 */     GameRegistry.registerBlock(MyMooshroomSpawnBlock, "OreSpawn_MooshroomSpawnBlock");
/* 1861 */     GameRegistry.registerBlock(MyWitherBossSpawnBlock, "OreSpawn_WitherBossSpawnBlock");
/* 1862 */     GameRegistry.registerBlock(MyGirlfriendSpawnBlock, "OreSpawn_GirlfriendSpawnBlock");
/* 1863 */     GameRegistry.registerBlock(MyBoyfriendSpawnBlock, "OreSpawn_BoyfriendSpawnBlock");
/* 1864 */     GameRegistry.registerBlock(MyRedCowSpawnBlock, "OreSpawn_RedCowSpawnBlock");
/* 1865 */     GameRegistry.registerBlock(MyCrystalCowSpawnBlock, "OreSpawn_CrystalCowSpawnBlock");
/* 1866 */     GameRegistry.registerBlock(MyVillagerSpawnBlock, "OreSpawn_VillagerSpawnBlock");
/* 1867 */     GameRegistry.registerBlock(MyGoldCowSpawnBlock, "OreSpawn_GoldCowSpawnBlock");
/* 1868 */     GameRegistry.registerBlock(MyEnchantedCowSpawnBlock, "OreSpawn_EnchantedCowSpawnBlock");
/* 1869 */     GameRegistry.registerBlock(MyMOTHRASpawnBlock, "OreSpawn_MOTHRASpawnBlock");
/* 1870 */     GameRegistry.registerBlock(MyAloSpawnBlock, "OreSpawn_AloSpawnBlock");
/* 1871 */     GameRegistry.registerBlock(MyCryoSpawnBlock, "OreSpawn_CryoSpawnBlock");
/* 1872 */     GameRegistry.registerBlock(MyCamaSpawnBlock, "OreSpawn_CamaSpawnBlock");
/* 1873 */     GameRegistry.registerBlock(MyVeloSpawnBlock, "OreSpawn_VeloSpawnBlock");
/* 1874 */     GameRegistry.registerBlock(MyHydroSpawnBlock, "OreSpawn_HydroSpawnBlock");
/* 1875 */     GameRegistry.registerBlock(MyBasilSpawnBlock, "OreSpawn_BasilSpawnBlock");
/* 1876 */     GameRegistry.registerBlock(MyDragonflySpawnBlock, "OreSpawn_DragonflySpawnBlock");
/* 1877 */     GameRegistry.registerBlock(MyEmperorScorpionSpawnBlock, "OreSpawn_EmperorScorpionSpawnBlock");
/* 1878 */     GameRegistry.registerBlock(MyScorpionSpawnBlock, "OreSpawn_ScorpionSpawnBlock");
/* 1879 */     GameRegistry.registerBlock(MyCaveFisherSpawnBlock, "OreSpawn_CaveFisherSpawnBlock");
/* 1880 */     GameRegistry.registerBlock(MySpyroSpawnBlock, "OreSpawn_SpyroSpawnBlock");
/* 1881 */     GameRegistry.registerBlock(MyBaryonyxSpawnBlock, "OreSpawn_BaryonyxSpawnBlock");
/* 1882 */     GameRegistry.registerBlock(MyGammaMetroidSpawnBlock, "OreSpawn_GammaMetroidSpawnBlock");
/* 1883 */     GameRegistry.registerBlock(MyCockateilSpawnBlock, "OreSpawn_CockateilSpawnBlock");
/* 1884 */     GameRegistry.registerBlock(MyKyuubiSpawnBlock, "OreSpawn_KyuubiSpawnBlock");
/* 1885 */     GameRegistry.registerBlock(MyAlienSpawnBlock, "OreSpawn_AlienSpawnBlock");
/* 1886 */     GameRegistry.registerBlock(MyIronGolemSpawnBlock, "OreSpawn_IronGolemSpawnBlock");
/* 1887 */     GameRegistry.registerBlock(MySnowGolemSpawnBlock, "OreSpawn_SnowGolemSpawnBlock");
/* 1888 */     GameRegistry.registerBlock(MyEnderDragonSpawnBlock, "OreSpawn_EnderDragonSpawnBlock");
/* 1889 */     GameRegistry.registerBlock(MyOcelotSpawnBlock, "OreSpawn_OcelotSpawnBlock");
/* 1890 */     GameRegistry.registerBlock(MyWitherSkeletonSpawnBlock, "OreSpawn_WitherSkeletonSpawnBlock");
/* 1891 */     GameRegistry.registerBlock(MyBlazeSpawnBlock, "OreSpawn_BlazeSpawnBlock");
/* 1892 */     GameRegistry.registerBlock(MyAttackSquidSpawnBlock, "OreSpawn_AttackSquidSpawnBlock");
/* 1893 */     GameRegistry.registerBlock(MyWaterDragonSpawnBlock, "OreSpawn_WaterDragonSpawnBlock");
/* 1894 */     GameRegistry.registerBlock(MyCephadromeSpawnBlock, "OreSpawn_CephadromeSpawnBlock");
/* 1895 */     GameRegistry.registerBlock(MyKrakenSpawnBlock, "OreSpawn_KrakenSpawnBlock");
/* 1896 */     GameRegistry.registerBlock(MyLizardSpawnBlock, "OreSpawn_LizardSpawnBlock");
/* 1897 */     GameRegistry.registerBlock(MyDragonSpawnBlock, "OreSpawn_DragonSpawnBlock");
/* 1898 */     GameRegistry.registerBlock(MyBeeSpawnBlock, "OreSpawn_BeeSpawnBlock");
/* 1899 */     GameRegistry.registerBlock(MyHorseSpawnBlock, "OreSpawn_HorseSpawnBlock");
/* 1900 */     GameRegistry.registerBlock(MyTrooperBugSpawnBlock, "OreSpawn_TrooperBugSpawnBlock");
/* 1901 */     GameRegistry.registerBlock(MySpitBugSpawnBlock, "OreSpawn_SpitBugSpawnBlock");
/* 1902 */     GameRegistry.registerBlock(MyStinkBugSpawnBlock, "OreSpawn_StinkBugSpawnBlock");
/* 1903 */     GameRegistry.registerBlock(MyOstrichSpawnBlock, "OreSpawn_OstrichSpawnBlock");
/* 1904 */     GameRegistry.registerBlock(MyGazelleSpawnBlock, "OreSpawn_GazelleSpawnBlock");
/* 1905 */     GameRegistry.registerBlock(MyChipmunkSpawnBlock, "OreSpawn_ChipmunkSpawnBlock");
/* 1906 */     GameRegistry.registerBlock(MyCreepingHorrorSpawnBlock, "OreSpawn_CreepingHorrorSpawnBlock");
/* 1907 */     GameRegistry.registerBlock(MyTerribleTerrorSpawnBlock, "OreSpawn_TerribleTerrorSpawnBlock");
/* 1908 */     GameRegistry.registerBlock(MyCliffRacerSpawnBlock, "OreSpawn_CliffRacerSpawnBlock");
/* 1909 */     GameRegistry.registerBlock(MyTriffidSpawnBlock, "OreSpawn_TriffidSpawnBlock");
/* 1910 */     GameRegistry.registerBlock(MyPitchBlackSpawnBlock, "OreSpawn_PitchBlackSpawnBlock");
/* 1911 */     GameRegistry.registerBlock(MyLurkingTerrorSpawnBlock, "OreSpawn_LurkingTerrorSpawnBlock");
/* 1912 */     GameRegistry.registerBlock(MyGodzillaPartSpawnBlock, "OreSpawn_GodzillaPartSpawnBlock");
/* 1913 */     GameRegistry.registerBlock(MyGodzillaSpawnBlock, "OreSpawn_GodzillaSpawnBlock");
/* 1914 */     GameRegistry.registerBlock(MyTheKingPartSpawnBlock, "OreSpawn_TheKingPartSpawnBlock");
/* 1915 */     GameRegistry.registerBlock(MyTheKingSpawnBlock, "OreSpawn_TheKingSpawnBlock");
/* 1916 */     GameRegistry.registerBlock(MyTheQueenPartSpawnBlock, "OreSpawn_TheQueenPartSpawnBlock");
/* 1917 */     GameRegistry.registerBlock(MyTheQueenSpawnBlock, "OreSpawn_TheQueenSpawnBlock");
/* 1918 */     GameRegistry.registerBlock(MySmallWormSpawnBlock, "OreSpawn_SmallWormSpawnBlock");
/* 1919 */     GameRegistry.registerBlock(MyMediumWormSpawnBlock, "OreSpawn_MediumWormSpawnBlock");
/* 1920 */     GameRegistry.registerBlock(MyLargeWormSpawnBlock, "OreSpawn_LargeWormSpawnBlock");
/* 1921 */     GameRegistry.registerBlock(MyCassowarySpawnBlock, "OreSpawn_CassowarySpawnBlock");
/* 1922 */     GameRegistry.registerBlock(MyCloudSharkSpawnBlock, "OreSpawn_CloudSharkSpawnBlock");
/* 1923 */     GameRegistry.registerBlock(MyGoldFishSpawnBlock, "OreSpawn_GoldFishSpawnBlock");
/* 1924 */     GameRegistry.registerBlock(MyLeafMonsterSpawnBlock, "OreSpawn_LeafMonsterSpawnBlock");
/* 1925 */     GameRegistry.registerBlock(MyTshirtSpawnBlock, "OreSpawn_TshirtSpawnBlock");
/* 1926 */     GameRegistry.registerBlock(MyEnderKnightSpawnBlock, "OreSpawn_EnderKnightSpawnBlock");
/* 1927 */     GameRegistry.registerBlock(MyEnderReaperSpawnBlock, "OreSpawn_EnderReaperSpawnBlock");
/* 1928 */     GameRegistry.registerBlock(MyBeaverSpawnBlock, "OreSpawn_BeaverSpawnBlock");
/* 1929 */     GameRegistry.registerBlock(MyUrchinSpawnBlock, "OreSpawn_UrchinSpawnBlock");
/* 1930 */     GameRegistry.registerBlock(MyFlounderSpawnBlock, "OreSpawn_FlounderSpawnBlock");
/* 1931 */     GameRegistry.registerBlock(MySkateSpawnBlock, "OreSpawn_SkateSpawnBlock");
/* 1932 */     GameRegistry.registerBlock(MyRotatorSpawnBlock, "OreSpawn_RotatorSpawnBlock");
/* 1933 */     GameRegistry.registerBlock(MyPeacockSpawnBlock, "OreSpawn_PeacockSpawnBlock");
/* 1934 */     GameRegistry.registerBlock(MyFairySpawnBlock, "OreSpawn_FairySpawnBlock");
/* 1935 */     GameRegistry.registerBlock(MyDungeonBeastSpawnBlock, "OreSpawn_DungeonBeastSpawnBlock");
/* 1936 */     GameRegistry.registerBlock(MyVortexSpawnBlock, "OreSpawn_VortexSpawnBlock");
/* 1937 */     GameRegistry.registerBlock(MyRatSpawnBlock, "OreSpawn_RatSpawnBlock");
/* 1938 */     GameRegistry.registerBlock(MyWhaleSpawnBlock, "OreSpawn_WhaleSpawnBlock");
/* 1939 */     GameRegistry.registerBlock(MyIrukandjiSpawnBlock, "OreSpawn_IrukandjiSpawnBlock");
/* 1940 */     GameRegistry.registerBlock(MyTRexSpawnBlock, "OreSpawn_TRexSpawnBlock");
/* 1941 */     GameRegistry.registerBlock(MyHerculesSpawnBlock, "OreSpawn_HerculesSpawnBlock");
/* 1942 */     GameRegistry.registerBlock(MyMantisSpawnBlock, "OreSpawn_MantisSpawnBlock");
/* 1943 */     GameRegistry.registerBlock(MyStinkySpawnBlock, "OreSpawn_StinkySpawnBlock");
/* 1944 */     GameRegistry.registerBlock(MyEasterBunnySpawnBlock, "OreSpawn_EasterBunnySpawnBlock");
/* 1945 */     GameRegistry.registerBlock(MyCaterKillerSpawnBlock, "OreSpawn_CaterKillerSpawnBlock");
/* 1946 */     GameRegistry.registerBlock(MyMolenoidSpawnBlock, "OreSpawn_MolenoidSpawnBlock");
/* 1947 */     GameRegistry.registerBlock(MySeaMonsterSpawnBlock, "OreSpawn_SeaMonsterSpawnBlock");
/* 1948 */     GameRegistry.registerBlock(MySeaViperSpawnBlock, "OreSpawn_SeaViperSpawnBlock");
/* 1949 */     GameRegistry.registerBlock(MyLeonSpawnBlock, "OreSpawn_LeonSpawnBlock");
/* 1950 */     GameRegistry.registerBlock(MyHammerheadSpawnBlock, "OreSpawn_HammerheadSpawnBlock");
/* 1951 */     GameRegistry.registerBlock(MyRubberDuckySpawnBlock, "OreSpawn_RubberDuckySpawnBlock");
/* 1952 */     GameRegistry.registerBlock(MyCriminalSpawnBlock, "OreSpawn_CriminalSpawnBlock");
/* 1953 */     GameRegistry.registerBlock(MyBrutalflySpawnBlock, "OreSpawn_BrutalflySpawnBlock");
/* 1954 */     GameRegistry.registerBlock(MyNastysaurusSpawnBlock, "OreSpawn_NastysaurusSpawnBlock");
/* 1955 */     GameRegistry.registerBlock(MyPointysaurusSpawnBlock, "OreSpawn_PointysaurusSpawnBlock");
/* 1956 */     GameRegistry.registerBlock(MyCricketSpawnBlock, "OreSpawn_CricketSpawnBlock");
/* 1957 */     GameRegistry.registerBlock(MyFrogSpawnBlock, "OreSpawn_FrogSpawnBlock");
/* 1958 */     GameRegistry.registerBlock(MySpiderDriverSpawnBlock, "OreSpawn_SpiderDriverSpawnBlock");
/* 1959 */     GameRegistry.registerBlock(MyCrabSpawnBlock, "OreSpawn_CrabSpawnBlock");
/*      */     
/* 1961 */     GameRegistry.registerBlock(MyOreSaltBlock, "OreSpawn_OreSaltBlock");
/* 1962 */     GameRegistry.registerBlock(MyRTPBlock, "OreSpawn_RTPBlock");
/* 1963 */     GameRegistry.registerBlock(MyMoleDirtBlock, "OreSpawn_MoleDirtBlock");
/* 1964 */     GameRegistry.registerBlock(MyOreTitaniumBlock, "OreSpawn_OreTitaniumBlock");
/* 1965 */     GameRegistry.registerBlock(MyOreUraniumBlock, "OreSpawn_OreUraniumBlock");
/* 1966 */     GameRegistry.registerBlock(MyBlockTitaniumBlock, "OreSpawn_BlockTitaniumBlock");
/* 1967 */     GameRegistry.registerBlock(MyBlockMobzillaScaleBlock, "OreSpawn_BlockMobzillaScaleBlock");
/* 1968 */     GameRegistry.registerBlock(MyBlockUraniumBlock, "OreSpawn_BlockUraniumBlock");
/* 1969 */     GameRegistry.registerBlock(MyLavafoamBlock, "OreSpawn_LavafoamBlock");
/* 1970 */     GameRegistry.registerBlock(MyOreRubyBlock, "OreSpawn_OreRubyBlock");
/* 1971 */     GameRegistry.registerBlock(MyBlockRubyBlock, "OreSpawn_BlockRubyBlock");
/* 1972 */     GameRegistry.registerBlock(MyOreAmethystBlock, "OreSpawn_OreAmethystBlock");
/* 1973 */     GameRegistry.registerBlock(MyBlockAmethystBlock, "OreSpawn_BlockAmethystBlock");
/* 1974 */     GameRegistry.registerBlock(MyCrystalPinkBlock, "OreSpawn_CrystalPinkBlock");
/* 1975 */     GameRegistry.registerBlock(MyTigersEyeBlock, "OreSpawn_TigersEyeBlock");
/* 1976 */     GameRegistry.registerBlock(MyPizzaBlock, "OreSpawn_PizzaBlock");
/* 1977 */     GameRegistry.registerItem(MyPizzaItem, "OreSpawn_PizzaItem");
/* 1978 */     GameRegistry.registerBlock(MyDuctTapeBlock, "OreSpawn_DuctTapeBlock");
/* 1979 */     GameRegistry.registerItem(MyDuctTapeItem, "OreSpawn_DuctTapeItem");
/* 1980 */     GameRegistry.registerBlock(CrystalStone, "OreSpawn_OreCrystalStoneBlock");
/* 1981 */     GameRegistry.registerBlock(CrystalRat, "OreSpawn_OreCrystalRatBlock");
/* 1982 */     GameRegistry.registerBlock(RedAntTroll, "OreSpawn_OreRedAntTrollBlock");
/* 1983 */     GameRegistry.registerBlock(TermiteTroll, "OreSpawn_OreTermiteTrollBlock");
/* 1984 */     GameRegistry.registerBlock(CrystalFairy, "OreSpawn_OreCrystalFairyBlock");
/* 1985 */     GameRegistry.registerBlock(CrystalCoal, "OreSpawn_OreCrystalCoalBlock");
/* 1986 */     GameRegistry.registerBlock(CrystalGrass, "OreSpawn_OreCrystalGrassBlock");
/* 1987 */     GameRegistry.registerBlock(CrystalCrystal, "OreSpawn_OreCrystalCrystalBlock");
/* 1988 */     GameRegistry.registerBlock(TigersEye, "OreSpawn_OreTigersEyeBlock");
/* 1989 */     GameRegistry.registerBlock(CrystalPlanksBlock, "OreSpawn_CrystalPlanksBlock");
/* 1990 */     GameRegistry.registerBlock(CrystalWorkbenchBlock, "OreSpawn_CrystalWorkbenchBlock");
/* 1991 */     GameRegistry.registerBlock((Block)CrystalFurnaceBlock, "OreSpawn_CrystalFurnaceBlock");
/* 1992 */     GameRegistry.registerBlock(CrystalFurnaceOnBlock, "OreSpawn_CrystalFurnaceOnBlock");
/*      */     
/* 1994 */     GameRegistry.registerBlock(MyStrawberryPlant, "OreSpawn_StrawberryPlant");
/* 1995 */     GameRegistry.registerBlock(MyRadishPlant, "OreSpawn_RadishPlant");
/* 1996 */     GameRegistry.registerBlock(MyRicePlant, "OreSpawn_RicePlant");
/* 1997 */     GameRegistry.registerBlock(MyButterflyPlant, "OreSpawn_ButterflyPlant");
/* 1998 */     GameRegistry.registerBlock(MyMothPlant, "OreSpawn_MothPlant");
/* 1999 */     GameRegistry.registerBlock(MyMosquitoPlant, "OreSpawn_MosquitoPlant");
/* 2000 */     GameRegistry.registerBlock(MyFireflyPlant, "OreSpawn_FireflyPlant");
/* 2001 */     GameRegistry.registerBlock(MyCornPlant1, "OreSpawn_CornPlant1");
/* 2002 */     GameRegistry.registerBlock(MyCornPlant2, "OreSpawn_CornPlant2");
/* 2003 */     GameRegistry.registerBlock(MyCornPlant3, "OreSpawn_CornPlant3");
/* 2004 */     GameRegistry.registerBlock(MyCornPlant4, "OreSpawn_CornPlant4");
/* 2005 */     GameRegistry.registerBlock(MyQuinoaPlant1, "OreSpawn_QuinoaPlant1");
/* 2006 */     GameRegistry.registerBlock(MyQuinoaPlant2, "OreSpawn_QuinoaPlant2");
/* 2007 */     GameRegistry.registerBlock(MyQuinoaPlant3, "OreSpawn_QuinoaPlant3");
/* 2008 */     GameRegistry.registerBlock(MyQuinoaPlant4, "OreSpawn_QuinoaPlant4");
/* 2009 */     GameRegistry.registerBlock(MyTomatoPlant1, "OreSpawn_TomatoPlant1");
/* 2010 */     GameRegistry.registerBlock(MyTomatoPlant2, "OreSpawn_TomatoPlant2");
/* 2011 */     GameRegistry.registerBlock(MyTomatoPlant3, "OreSpawn_TomatoPlant3");
/* 2012 */     GameRegistry.registerBlock(MyTomatoPlant4, "OreSpawn_TomatoPlant4");
/* 2013 */     GameRegistry.registerBlock(MyLettucePlant1, "OreSpawn_LettucePlant1");
/* 2014 */     GameRegistry.registerBlock(MyLettucePlant2, "OreSpawn_LettucePlant2");
/* 2015 */     GameRegistry.registerBlock(MyLettucePlant3, "OreSpawn_LettucePlant3");
/* 2016 */     GameRegistry.registerBlock(MyLettucePlant4, "OreSpawn_LettucePlant4");
/* 2017 */     GameRegistry.registerBlock(MyAppleLeaves, "OreSpawn_AppleLeaves");
/* 2018 */     GameRegistry.registerBlock(MyExperienceLeaves, "OreSpawn_ExperienceLeaves");
/* 2019 */     GameRegistry.registerBlock(MyScaryLeaves, "OreSpawn_ScaryLeaves");
/* 2020 */     GameRegistry.registerBlock(MyCherryLeaves, "OreSpawn_CherryLeaves");
/* 2021 */     GameRegistry.registerBlock(MyPeachLeaves, "OreSpawn_PeachLeaves");
/* 2022 */     GameRegistry.registerBlock(MySkyTreeLog, "OreSpawn_SkyTreeLog");
/* 2023 */     GameRegistry.registerBlock(MyDT, "OreSpawn_DuplicatorLog");
/* 2024 */     GameRegistry.registerBlock(MyExperiencePlant, "OreSpawn_ExperiencePlant");
/* 2025 */     GameRegistry.registerBlock(MyCrystalPlant, "OreSpawn_CrystalPlant");
/* 2026 */     GameRegistry.registerBlock(MyCrystalPlant2, "OreSpawn_CrystalPlant2");
/* 2027 */     GameRegistry.registerBlock(MyCrystalPlant3, "OreSpawn_CrystalPlant3");
/* 2028 */     GameRegistry.registerBlock(MyFlowerPinkBlock, "OreSpawn_FlowerPink");
/* 2029 */     GameRegistry.registerBlock(MyFlowerBlueBlock, "OreSpawn_FlowerBlue");
/* 2030 */     GameRegistry.registerBlock(MyFlowerBlackBlock, "OreSpawn_FlowerBlack");
/* 2031 */     GameRegistry.registerBlock(MyFlowerScaryBlock, "OreSpawn_FlowerScary");
/* 2032 */     GameRegistry.registerBlock(CrystalFlowerRedBlock, "OreSpawn_CrystalFlowerRed");
/* 2033 */     GameRegistry.registerBlock(CrystalFlowerGreenBlock, "OreSpawn_CrystalFlowerGreen");
/* 2034 */     GameRegistry.registerBlock(CrystalFlowerBlueBlock, "OreSpawn_CrystalFlowerBlue");
/* 2035 */     GameRegistry.registerBlock(CrystalFlowerYellowBlock, "OreSpawn_CrystalFlowerYellow");
/* 2036 */     GameRegistry.registerBlock(MyCrystalLeaves, "OreSpawn_CrystalLeaves");
/* 2037 */     GameRegistry.registerBlock(MyCrystalLeaves2, "OreSpawn_CrystalLeaves2");
/* 2038 */     GameRegistry.registerBlock(MyCrystalLeaves3, "OreSpawn_CrystalLeaves3");
/* 2039 */     GameRegistry.registerBlock(MyCrystalTreeLog, "OreSpawn_CrystalTreeLog");
/*      */     
/* 2041 */     GameRegistry.registerBlock(ExtremeTorch, "OreSpawn_ExtremeTorch");
/* 2042 */     GameRegistry.registerBlock(CrystalTorch, "OreSpawn_CrystalTorch");
/* 2043 */     GameRegistry.registerBlock(KrakenRepellent, "OreSpawn_KrakenRepellent");
/* 2044 */     GameRegistry.registerBlock(CreeperRepellent, "OreSpawn_CreeperRepellent");
/* 2045 */     GameRegistry.registerBlock(MyIslandBlock, "OreSpawn_Island");
/* 2046 */     GameRegistry.registerBlock(MyKingSpawnerBlock, "OreSpawn_KingSpawner");
/* 2047 */     GameRegistry.registerBlock(MyQueenSpawnerBlock, "OreSpawn_QueenSpawner");
/* 2048 */     GameRegistry.registerBlock(MyDungeonSpawnerBlock, "OreSpawn_DungeonSpawner");
/*      */     
/* 2050 */     GameRegistry.registerBlock(MyEnderPearlBlock, "OreSpawn_EnderPearlBlock");
/* 2051 */     GameRegistry.registerBlock(MyEyeOfEnderBlock, "OreSpawn_EyeOfEnderBlock");
/* 2052 */     GameRegistry.registerBlock(MyAntBlock, "OreSpawn_AntBlock");
/* 2053 */     GameRegistry.registerBlock(MyRedAntBlock, "OreSpawn_RedAntBlock");
/* 2054 */     GameRegistry.registerBlock(TermiteBlock, "OreSpawn_TermiteBlock");
/* 2055 */     GameRegistry.registerBlock(CrystalTermiteBlock, "OreSpawn_CrystalTermiteBlock");
/* 2056 */     GameRegistry.registerBlock(MyRainbowAntBlock, "OreSpawn_RainbowAntBlock");
/* 2057 */     GameRegistry.registerBlock(MyUnstableAntBlock, "OreSpawn_UnstableAntBlock");
/*      */     
/* 2059 */     GameRegistry.registerItem(MyIngotUranium, "OreSpawn_IngotUranium");
/* 2060 */     GameRegistry.registerItem(MyCrystalPinkIngot, "OreSpawn_CrystalPinkIngot");
/* 2061 */     GameRegistry.registerItem(MyTigersEyeIngot, "OreSpawn_TigersEyeIngot");
/* 2062 */     GameRegistry.registerItem(MyIngotTitanium, "OreSpawn_IngotTitanium");
/* 2063 */     GameRegistry.registerItem(MyUltimateSword, "OreSpawn_UltimateSword");
/* 2064 */     GameRegistry.registerItem(MyNightmareSword, "OreSpawn_NightmareSword");
/* 2065 */     GameRegistry.registerItem(MyBertha, "OreSpawn_Bertha");
/* 2066 */     GameRegistry.registerItem(MyHammy, "OreSpawn_Hammy");
/* 2067 */     GameRegistry.registerItem(MySlice, "OreSpawn_Slice");
/* 2068 */     GameRegistry.registerItem(MyRoyal, "OreSpawn_Royal");
/* 2069 */     GameRegistry.registerItem(MyBattleAxe, "OreSpawn_BattleAxe");
/* 2070 */     GameRegistry.registerItem(MyQueenBattleAxe, "OreSpawn_QueenBattleAxe");
/* 2071 */     GameRegistry.registerItem(MyChainsaw, "OreSpawn_Chainsaw");
/* 2072 */     GameRegistry.registerItem(MyUltimatePickaxe, "OreSpawn_UltimatePickaxe");
/* 2073 */     GameRegistry.registerItem(MyUltimateShovel, "OreSpawn_UltimateShovel");
/* 2074 */     GameRegistry.registerItem(MyUltimateHoe, "OreSpawn_UltimateHoe");
/* 2075 */     GameRegistry.registerItem(MyUltimateAxe, "OreSpawn_UltimateAxe");
/* 2076 */     GameRegistry.registerItem(MyEmeraldSword, "OreSpawn_EmeraldSword");
/* 2077 */     GameRegistry.registerItem(MyExperienceSword, "OreSpawn_ExperienceSword");
/* 2078 */     GameRegistry.registerItem(MyPoisonSword, "OreSpawn_PoisonSword");
/* 2079 */     GameRegistry.registerItem(MyRatSword, "OreSpawn_RatSword");
/* 2080 */     GameRegistry.registerItem(MyFairySword, "OreSpawn_FairySword");
/* 2081 */     GameRegistry.registerItem(MyMantisClaw, "OreSpawn_MantisClaw");
/* 2082 */     GameRegistry.registerItem(MyBigHammer, "OreSpawn_BigHammer");
/* 2083 */     GameRegistry.registerItem(MyEmeraldPickaxe, "OreSpawn_EmeraldPickaxe");
/* 2084 */     GameRegistry.registerItem(MyEmeraldShovel, "OreSpawn_EmeraldShovel");
/* 2085 */     GameRegistry.registerItem(MyEmeraldHoe, "OreSpawn_EmeraldHoe");
/* 2086 */     GameRegistry.registerItem(MyEmeraldAxe, "OreSpawn_EmeraldAxe");
/* 2087 */     GameRegistry.registerItem(MyCrystalWoodSword, "OreSpawn_CrystalWoodSword");
/* 2088 */     GameRegistry.registerItem(MyCrystalWoodPickaxe, "OreSpawn_CrystalWoodPickaxe");
/* 2089 */     GameRegistry.registerItem(MyCrystalWoodShovel, "OreSpawn_CrystalWoodShovel");
/* 2090 */     GameRegistry.registerItem(MyCrystalWoodHoe, "OreSpawn_CrystalWoodHoe");
/* 2091 */     GameRegistry.registerItem(MyCrystalWoodAxe, "OreSpawn_CrystalWoodAxe");
/* 2092 */     GameRegistry.registerItem(MyCrystalPinkSword, "OreSpawn_CrystalPinkSword");
/* 2093 */     GameRegistry.registerItem(MyCrystalPinkPickaxe, "OreSpawn_CrystalPinkPickaxe");
/* 2094 */     GameRegistry.registerItem(MyCrystalPinkShovel, "OreSpawn_CrystalPinkShovel");
/* 2095 */     GameRegistry.registerItem(MyCrystalPinkHoe, "OreSpawn_CrystalPinkHoe");
/* 2096 */     GameRegistry.registerItem(MyCrystalPinkAxe, "OreSpawn_CrystalPinkAxe");
/* 2097 */     GameRegistry.registerItem(MyTigersEyeSword, "OreSpawn_TigersEyeSword");
/* 2098 */     GameRegistry.registerItem(MyTigersEyePickaxe, "OreSpawn_TigersEyePickaxe");
/* 2099 */     GameRegistry.registerItem(MyTigersEyeShovel, "OreSpawn_TigersEyeShovel");
/* 2100 */     GameRegistry.registerItem(MyTigersEyeHoe, "OreSpawn_TigersEyeHoe");
/* 2101 */     GameRegistry.registerItem(MyTigersEyeAxe, "OreSpawn_TigersEyeAxe");
/* 2102 */     GameRegistry.registerItem(MyCrystalStoneSword, "OreSpawn_CrystalStoneSword");
/* 2103 */     GameRegistry.registerItem(MyCrystalStonePickaxe, "OreSpawn_CrystalStonePickaxe");
/* 2104 */     GameRegistry.registerItem(MyCrystalStoneShovel, "OreSpawn_CrystalStoneShovel");
/* 2105 */     GameRegistry.registerItem(MyCrystalStoneHoe, "OreSpawn_CrystalStoneHoe");
/* 2106 */     GameRegistry.registerItem(MyCrystalStoneAxe, "OreSpawn_CrystalStoneAxe");
/* 2107 */     GameRegistry.registerItem(MyRubySword, "OreSpawn_RubySword");
/* 2108 */     GameRegistry.registerItem(MyRubyPickaxe, "OreSpawn_RubyPickaxe");
/* 2109 */     GameRegistry.registerItem(MyRubyShovel, "OreSpawn_RubyShovel");
/* 2110 */     GameRegistry.registerItem(MyRubyHoe, "OreSpawn_RubyHoe");
/* 2111 */     GameRegistry.registerItem(MyRubyAxe, "OreSpawn_RubyAxe");
/* 2112 */     GameRegistry.registerItem(MyAmethystSword, "OreSpawn_AmethystSword");
/* 2113 */     GameRegistry.registerItem(MyAmethystPickaxe, "OreSpawn_AmethystPickaxe");
/* 2114 */     GameRegistry.registerItem(MyAmethystShovel, "OreSpawn_AmethystShovel");
/* 2115 */     GameRegistry.registerItem(MyAmethystHoe, "OreSpawn_AmethystHoe");
/* 2116 */     GameRegistry.registerItem(MyAmethystAxe, "OreSpawn_AmethystAxe");
/* 2117 */     GameRegistry.registerItem(MyItemShoes, "OreSpawn_RedHeels");
/* 2118 */     GameRegistry.registerItem(MyItemShoes_1, "OreSpawn_BlackHeels");
/* 2119 */     GameRegistry.registerItem(MyItemShoes_2, "OreSpawn_Slippers");
/* 2120 */     GameRegistry.registerItem(MyItemShoes_3, "OreSpawn_Boots");
/* 2121 */     GameRegistry.registerItem(MyItemGameController, "OreSpawn_GameController");
/* 2122 */     GameRegistry.registerItem(MyUltimateBow, "OreSpawn_UltimateBow");
/* 2123 */     GameRegistry.registerItem(MySkateBow, "OreSpawn_SkateBow");
/* 2124 */     GameRegistry.registerItem(MyUltimateFishingRod, "OreSpawn_UltimateFishingRod");
/* 2125 */     GameRegistry.registerItem(MyFireFish, "OreSpawn_FireFish");
/* 2126 */     GameRegistry.registerItem(MySunFish, "OreSpawn_SunFish");
/* 2127 */     GameRegistry.registerItem(MyLavaEel, "OreSpawn_LavaEel");
/* 2128 */     GameRegistry.registerItem(MyMothScale, "OreSpawn_MothScale");
/* 2129 */     GameRegistry.registerItem(MyQueenScale, "OreSpawn_QueenScale");
/* 2130 */     GameRegistry.registerItem(MyNightmareScale, "OreSpawn_NightmareScale");
/* 2131 */     GameRegistry.registerItem(MyEmperorScorpionScale, "OreSpawn_EmperorScorpionScale");
/* 2132 */     GameRegistry.registerItem(MyBasiliskScale, "OreSpawn_BasiliskScale");
/* 2133 */     GameRegistry.registerItem(MyWaterDragonScale, "OreSpawn_WaterDragonScale");
/* 2134 */     GameRegistry.registerItem(MyPeacockFeather, "OreSpawn_PeacockFeather");
/* 2135 */     GameRegistry.registerItem(MyJumpyBugScale, "OreSpawn_JumpyBugScale");
/* 2136 */     GameRegistry.registerItem(MyKrakenTooth, "OreSpawn_KrakenTooth");
/* 2137 */     GameRegistry.registerItem(MyGodzillaScale, "OreSpawn_GodzillaScale");
/* 2138 */     GameRegistry.registerItem(GreenGoo, "OreSpawn_GreenGoo");
/* 2139 */     GameRegistry.registerItem(SpiderRobotKit, "OreSpawn_SpiderRobotKit");
/* 2140 */     GameRegistry.registerItem(AntRobotKit, "OreSpawn_AntRobotKit");
/* 2141 */     GameRegistry.registerItem(ZooKeeper, "OreSpawn_ZooKeeper");
/* 2142 */     GameRegistry.registerItem(CreeperLauncher, "OreSpawn_CreeperLauncher");
/* 2143 */     GameRegistry.registerItem(NetherLost, "OreSpawn_NetherLost");
/* 2144 */     GameRegistry.registerItem(CrystalSticks, "OreSpawn_CrystalSticks");
/* 2145 */     GameRegistry.registerItem(Sifter, "OreSpawn_Sifter");
/* 2146 */     GameRegistry.registerItem(MySunspotUrchin, "OreSpawn_SunspotUrchin");
/* 2147 */     GameRegistry.registerItem(MyWaterBall, "OreSpawn_WaterBall");
/* 2148 */     GameRegistry.registerItem(MyLaserBall, "OreSpawn_LaserBall");
/* 2149 */     GameRegistry.registerItem(MyIceBall, "OreSpawn_IceBall");
/* 2150 */     GameRegistry.registerItem(MySmallRock, "OreSpawn_SmallRock");
/* 2151 */     GameRegistry.registerItem(MyRock, "OreSpawn_Rock");
/* 2152 */     GameRegistry.registerItem(MyRedRock, "OreSpawn_RedRock");
/* 2153 */     GameRegistry.registerItem(MyCrystalRedRock, "OreSpawn_CrystalRedRock");
/* 2154 */     GameRegistry.registerItem(MyCrystalGreenRock, "OreSpawn_CrystalGreenRock");
/* 2155 */     GameRegistry.registerItem(MyCrystalBlueRock, "OreSpawn_CrystalBlueRock");
/* 2156 */     GameRegistry.registerItem(MyCrystalTNTRock, "OreSpawn_CrystalTNTRock");
/* 2157 */     GameRegistry.registerItem(MyGreenRock, "OreSpawn_GreenRock");
/* 2158 */     GameRegistry.registerItem(MyBlueRock, "OreSpawn_BlueRock");
/* 2159 */     GameRegistry.registerItem(MyPurpleRock, "OreSpawn_PurpleRock");
/* 2160 */     GameRegistry.registerItem(MySpikeyRock, "OreSpawn_SpikeyRock");
/* 2161 */     GameRegistry.registerItem(MyTNTRock, "OreSpawn_TNTRock");
/* 2162 */     GameRegistry.registerItem(MyAcid, "OreSpawn_Acid");
/* 2163 */     GameRegistry.registerItem(MyIrukandji, "OreSpawn_Irukandji");
/* 2164 */     GameRegistry.registerItem(MyIrukandjiArrow, "OreSpawn_IrukandjiArrow");
/* 2165 */     GameRegistry.registerItem(MyRayGun, "OreSpawn_RayGun");
/* 2166 */     GameRegistry.registerItem(MySquidZooka, "OreSpawn_SquidZooka");
/* 2167 */     GameRegistry.registerItem(MySparkFish, "OreSpawn_SparkFish");
/* 2168 */     GameRegistry.registerItem(MySalt, "OreSpawn_Salt");
/* 2169 */     GameRegistry.registerItem(MyPopcorn, "OreSpawn_Popcorn");
/* 2170 */     GameRegistry.registerItem(MyButteredPopcorn, "OreSpawn_ButteredPopcorn");
/* 2171 */     GameRegistry.registerItem(MyButteredSaltedPopcorn, "OreSpawn_ButteredSaltedPopcorn");
/* 2172 */     GameRegistry.registerItem(MyPopcornBag, "OreSpawn_PopcornBag");
/* 2173 */     GameRegistry.registerItem(MyButter, "OreSpawn_Butter");
/* 2174 */     GameRegistry.registerItem(MyCornDog, "OreSpawn_CornDog");
/* 2175 */     GameRegistry.registerItem(MyCheese, "OreSpawn_Cheese");
/* 2176 */     GameRegistry.registerItem(MyRawCornDog, "OreSpawn_RawCornDog");
/* 2177 */     GameRegistry.registerItem(MyPeacock, "OreSpawn_Peacock");
/* 2178 */     GameRegistry.registerItem(MyRawPeacock, "OreSpawn_RawPeacock");
/* 2179 */     GameRegistry.registerItem(MyRuby, "OreSpawn_Ruby");
/* 2180 */     GameRegistry.registerItem(MyAmethyst, "OreSpawn_Amethyst");
/* 2181 */     GameRegistry.registerItem(MyThunderStaff, "OreSpawn_ThunderStaff");
/* 2182 */     GameRegistry.registerItem(MyWrench, "OreSpawn_Wrench");
/* 2183 */     GameRegistry.registerItem(MyRawBacon, "OreSpawn_RawBacon");
/* 2184 */     GameRegistry.registerItem(MyBacon, "OreSpawn_Bacon");
/* 2185 */     GameRegistry.registerItem(MyRawCrabMeat, "OreSpawn_RawCrabMeat");
/* 2186 */     GameRegistry.registerItem(MyCrabMeat, "OreSpawn_CrabMeat");
/* 2187 */     GameRegistry.registerItem(MyButterCandy, "OreSpawn_ButterCandy");
/* 2188 */     GameRegistry.registerItem(UraniumNugget, "OreSpawn_UraniumNugget");
/* 2189 */     GameRegistry.registerItem(TitaniumNugget, "OreSpawn_TitaniumNugget");
/* 2190 */     GameRegistry.registerItem(MyGreenFish, "OreSpawn_GreenFish");
/* 2191 */     GameRegistry.registerItem(MyBlueFish, "OreSpawn_BlueFish");
/* 2192 */     GameRegistry.registerItem(MyPinkFish, "OreSpawn_PinkFish");
/* 2193 */     GameRegistry.registerItem(MyRockFish, "OreSpawn_RockFish");
/* 2194 */     GameRegistry.registerItem(MyWoodFish, "OreSpawn_WoodFish");
/* 2195 */     GameRegistry.registerItem(MyGreyFish, "OreSpawn_GreyFish");
/* 2196 */     GameRegistry.registerItem(MySalad, "OreSpawn_Salad");
/* 2197 */     GameRegistry.registerItem(MyBLT, "OreSpawn_BLT");
/* 2198 */     GameRegistry.registerItem(MyCrabbyPatty, "OreSpawn_CrabbyPatty");
/*      */     
/* 2200 */     GameRegistry.registerItem(BerthaHandle, "OreSpawn_BerthaHandle");
/* 2201 */     GameRegistry.registerItem(BerthaGuard, "OreSpawn_BerthaGuard");
/* 2202 */     GameRegistry.registerItem(BerthaBlade, "OreSpawn_BerthaBlade");
/* 2203 */     GameRegistry.registerItem(MolenoidNose, "OreSpawn_MolenoidNose");
/* 2204 */     GameRegistry.registerItem(SeaMonsterScale, "OreSpawn_SeaMonsterScale");
/* 2205 */     GameRegistry.registerItem(WormTooth, "OreSpawn_WormTooth");
/* 2206 */     GameRegistry.registerItem(TRexTooth, "OreSpawn_TRexTooth");
/* 2207 */     GameRegistry.registerItem(CaterKillerJaw, "OreSpawn_CaterKillerJaw");
/* 2208 */     GameRegistry.registerItem(SeaViperTongue, "OreSpawn_SeaViperTongue");
/* 2209 */     GameRegistry.registerItem(VortexEye, "OreSpawn_VortexEye");
/*      */ 
/*      */ 
/*      */     
/* 2213 */     GameRegistry.registerItem(WitherSkeletonEgg, "OreSpawn_WitherSkeletonEgg");
/* 2214 */     GameRegistry.registerItem(EnderDragonEgg, "OreSpawn_EnderDragonEgg");
/* 2215 */     GameRegistry.registerItem(SnowGolemEgg, "OreSpawn_SnowGolemEgg");
/* 2216 */     GameRegistry.registerItem(IronGolemEgg, "OreSpawn_IronGolemEgg");
/* 2217 */     GameRegistry.registerItem(WitherBossEgg, "OreSpawn_WitherBossEgg");
/* 2218 */     GameRegistry.registerItem(GirlfriendEgg, "OreSpawn_GirlfriendEgg");
/* 2219 */     GameRegistry.registerItem(BoyfriendEgg, "OreSpawn_BoyfriendEgg");
/* 2220 */     GameRegistry.registerItem(TheKingEgg, "OreSpawn_TheKingEgg");
/* 2221 */     GameRegistry.registerItem(TheQueenEgg, "OreSpawn_TheQueenEgg");
/* 2222 */     GameRegistry.registerItem(ThePrinceEgg, "OreSpawn_ThePrinceEgg");
/* 2223 */     GameRegistry.registerItem(RedCowEgg, "OreSpawn_RedCowEgg");
/* 2224 */     GameRegistry.registerItem(CrystalCowEgg, "OreSpawn_CrystalCowEgg");
/* 2225 */     GameRegistry.registerItem(GoldCowEgg, "OreSpawn_GoldCowEgg");
/* 2226 */     GameRegistry.registerItem(EnchantedCowEgg, "OreSpawn_EnchantedCowEgg");
/* 2227 */     GameRegistry.registerItem(MOTHRAEgg, "OreSpawn_MOTHRAEgg");
/* 2228 */     GameRegistry.registerItem(AloEgg, "OreSpawn_AloEgg");
/* 2229 */     GameRegistry.registerItem(CryoEgg, "OreSpawn_CryoEgg");
/* 2230 */     GameRegistry.registerItem(CamaEgg, "OreSpawn_CamaEgg");
/* 2231 */     GameRegistry.registerItem(VeloEgg, "OreSpawn_VeloEgg");
/* 2232 */     GameRegistry.registerItem(HydroEgg, "OreSpawn_HydroEgg");
/* 2233 */     GameRegistry.registerItem(BasilEgg, "OreSpawn_BasilEgg");
/* 2234 */     GameRegistry.registerItem(DragonflyEgg, "OreSpawn_DragonflyEgg");
/* 2235 */     GameRegistry.registerItem(EmperorScorpionEgg, "OreSpawn_EmperorScorpionEgg");
/* 2236 */     GameRegistry.registerItem(ScorpionEgg, "OreSpawn_ScorpionEgg");
/* 2237 */     GameRegistry.registerItem(CaveFisherEgg, "OreSpawn_CaveFisherEgg");
/* 2238 */     GameRegistry.registerItem(SpyroEgg, "OreSpawn_SpyroEgg");
/* 2239 */     GameRegistry.registerItem(BaryonyxEgg, "OreSpawn_BaryonyxEgg");
/* 2240 */     GameRegistry.registerItem(GammaMetroidEgg, "OreSpawn_GammaMetroidEgg");
/* 2241 */     GameRegistry.registerItem(CockateilEgg, "OreSpawn_CockateilEgg");
/* 2242 */     GameRegistry.registerItem(KyuubiEgg, "OreSpawn_KyuubiEgg");
/* 2243 */     GameRegistry.registerItem(AlienEgg, "OreSpawn_AlienEgg");
/* 2244 */     GameRegistry.registerItem(AttackSquidEgg, "OreSpawn_AttackSquidEgg");
/* 2245 */     GameRegistry.registerItem(WaterDragonEgg, "OreSpawn_WaterDragonEgg");
/* 2246 */     GameRegistry.registerItem(CephadromeEgg, "OreSpawn_CephadromeEgg");
/* 2247 */     GameRegistry.registerItem(KrakenEgg, "OreSpawn_KrakenEgg");
/* 2248 */     GameRegistry.registerItem(LizardEgg, "OreSpawn_LizardEgg");
/* 2249 */     GameRegistry.registerItem(DragonEgg, "OreSpawn_DragonEgg");
/* 2250 */     GameRegistry.registerItem(BeeEgg, "OreSpawn_BeeEgg");
/* 2251 */     GameRegistry.registerItem(TrooperBugEgg, "OreSpawn_TrooperBugEgg");
/* 2252 */     GameRegistry.registerItem(SpitBugEgg, "OreSpawn_SpitBugEgg");
/* 2253 */     GameRegistry.registerItem(StinkBugEgg, "OreSpawn_StinkBugEgg");
/* 2254 */     GameRegistry.registerItem(OstrichEgg, "OreSpawn_OstrichEgg");
/* 2255 */     GameRegistry.registerItem(GazelleEgg, "OreSpawn_GazelleEgg");
/* 2256 */     GameRegistry.registerItem(ChipmunkEgg, "OreSpawn_ChipmunkEgg");
/* 2257 */     GameRegistry.registerItem(CreepingHorrorEgg, "OreSpawn_CreepingHorrorEgg");
/* 2258 */     GameRegistry.registerItem(TerribleTerrorEgg, "OreSpawn_TerribleTerrorEgg");
/* 2259 */     GameRegistry.registerItem(CliffRacerEgg, "OreSpawn_CliffRacerEgg");
/* 2260 */     GameRegistry.registerItem(TriffidEgg, "OreSpawn_TriffidEgg");
/* 2261 */     GameRegistry.registerItem(PitchBlackEgg, "OreSpawn_PitchBlackEgg");
/* 2262 */     GameRegistry.registerItem(LurkingTerrorEgg, "OreSpawn_LurkingTerrorEgg");
/* 2263 */     GameRegistry.registerItem(GodzillaEgg, "OreSpawn_GodzillaEgg");
/* 2264 */     GameRegistry.registerItem(SmallWormEgg, "OreSpawn_SmallWormEgg");
/* 2265 */     GameRegistry.registerItem(MediumWormEgg, "OreSpawn_MediumWormEgg");
/* 2266 */     GameRegistry.registerItem(LargeWormEgg, "OreSpawn_LargeWormEgg");
/* 2267 */     GameRegistry.registerItem(CassowaryEgg, "OreSpawn_CassowaryEgg");
/* 2268 */     GameRegistry.registerItem(CloudSharkEgg, "OreSpawn_CloudSharkEgg");
/* 2269 */     GameRegistry.registerItem(GoldFishEgg, "OreSpawn_GoldFishEgg");
/* 2270 */     GameRegistry.registerItem(LeafMonsterEgg, "OreSpawn_LeafMonsterEgg");
/* 2271 */     GameRegistry.registerItem(TshirtEgg, "OreSpawn_TshirtEgg");
/* 2272 */     GameRegistry.registerItem(EnderKnightEgg, "OreSpawn_EnderKnightEgg");
/* 2273 */     GameRegistry.registerItem(EnderReaperEgg, "OreSpawn_EnderReaperEgg");
/* 2274 */     GameRegistry.registerItem(BeaverEgg, "OreSpawn_BeaverEgg");
/* 2275 */     GameRegistry.registerItem(DungeonBeastEgg, "OreSpawn_DungeonBeastEgg");
/* 2276 */     GameRegistry.registerItem(RotatorEgg, "OreSpawn_RotatorEgg");
/* 2277 */     GameRegistry.registerItem(VortexEgg, "OreSpawn_VortexEgg");
/* 2278 */     GameRegistry.registerItem(PeacockEgg, "OreSpawn_PeacockEgg");
/* 2279 */     GameRegistry.registerItem(FairyEgg, "OreSpawn_FairyEgg");
/* 2280 */     GameRegistry.registerItem(RatEgg, "OreSpawn_RatEgg");
/* 2281 */     GameRegistry.registerItem(FlounderEgg, "OreSpawn_FlounderEgg");
/* 2282 */     GameRegistry.registerItem(WhaleEgg, "OreSpawn_WhaleEgg");
/* 2283 */     GameRegistry.registerItem(IrukandjiEgg, "OreSpawn_IrukandjiEgg");
/* 2284 */     GameRegistry.registerItem(SkateEgg, "OreSpawn_SkateEgg");
/* 2285 */     GameRegistry.registerItem(UrchinEgg, "OreSpawn_UrchinEgg");
/* 2286 */     GameRegistry.registerItem(Robot1Egg, "OreSpawn_Robot1Egg");
/* 2287 */     GameRegistry.registerItem(Robot2Egg, "OreSpawn_Robot2Egg");
/* 2288 */     GameRegistry.registerItem(Robot3Egg, "OreSpawn_Robot3Egg");
/* 2289 */     GameRegistry.registerItem(Robot4Egg, "OreSpawn_Robot4Egg");
/* 2290 */     GameRegistry.registerItem(GhostEgg, "OreSpawn_GhostEgg");
/* 2291 */     GameRegistry.registerItem(GhostSkellyEgg, "OreSpawn_GhostSkellyEgg");
/* 2292 */     GameRegistry.registerItem(BrownAntEgg, "OreSpawn_BrownAntEgg");
/* 2293 */     GameRegistry.registerItem(RedAntEgg, "OreSpawn_RedAntEgg");
/* 2294 */     GameRegistry.registerItem(RainbowAntEgg, "OreSpawn_RainbowAntEgg");
/* 2295 */     GameRegistry.registerItem(UnstableAntEgg, "OreSpawn_UnstableAntEgg");
/* 2296 */     GameRegistry.registerItem(TermiteEgg, "OreSpawn_TermiteEgg");
/* 2297 */     GameRegistry.registerItem(ButterflyEgg, "OreSpawn_ButterflyEgg");
/* 2298 */     GameRegistry.registerItem(MothEgg, "OreSpawn_MothEgg");
/* 2299 */     GameRegistry.registerItem(MosquitoEgg, "OreSpawn_MosquitoEgg");
/* 2300 */     GameRegistry.registerItem(FireflyEgg, "OreSpawn_FireflyEgg");
/* 2301 */     GameRegistry.registerItem(TRexEgg, "OreSpawn_TRexEgg");
/* 2302 */     GameRegistry.registerItem(HerculesEgg, "OreSpawn_HerculesEgg");
/* 2303 */     GameRegistry.registerItem(MantisEgg, "OreSpawn_MantisEgg");
/* 2304 */     GameRegistry.registerItem(StinkyEgg, "OreSpawn_StinkyEgg");
/* 2305 */     GameRegistry.registerItem(Robot5Egg, "OreSpawn_Robot5Egg");
/* 2306 */     GameRegistry.registerItem(CoinEgg, "OreSpawn_CoinEgg");
/* 2307 */     GameRegistry.registerItem(EasterBunnyEgg, "OreSpawn_EasterBunnyEgg");
/* 2308 */     GameRegistry.registerItem(MolenoidEgg, "OreSpawn_MolenoidEgg");
/* 2309 */     GameRegistry.registerItem(SeaMonsterEgg, "OreSpawn_SeaMonsterEgg");
/* 2310 */     GameRegistry.registerItem(SeaViperEgg, "OreSpawn_SeaViperEgg");
/* 2311 */     GameRegistry.registerItem(CaterKillerEgg, "OreSpawn_CaterKillerEgg");
/* 2312 */     GameRegistry.registerItem(RubberDuckyEgg, "OreSpawn_RubberDuckyEgg");
/* 2313 */     GameRegistry.registerItem(HammerheadEgg, "OreSpawn_HammerheadEgg");
/* 2314 */     GameRegistry.registerItem(LeonEgg, "OreSpawn_LeonEgg");
/* 2315 */     GameRegistry.registerItem(CriminalEgg, "OreSpawn_CriminalEgg");
/* 2316 */     GameRegistry.registerItem(BrutalflyEgg, "OreSpawn_BrutalflyEgg");
/* 2317 */     GameRegistry.registerItem(NastysaurusEgg, "OreSpawn_NastysaurusEgg");
/* 2318 */     GameRegistry.registerItem(PointysaurusEgg, "OreSpawn_PointysaurusEgg");
/* 2319 */     GameRegistry.registerItem(CricketEgg, "OreSpawn_CricketEgg");
/* 2320 */     GameRegistry.registerItem(ThePrincessEgg, "OreSpawn_ThePrincessEgg");
/* 2321 */     GameRegistry.registerItem(FrogEgg, "OreSpawn_FrogEgg");
/* 2322 */     GameRegistry.registerItem(JefferyEgg, "OreSpawn_JefferyEgg");
/* 2323 */     GameRegistry.registerItem(AntRobotEgg, "OreSpawn_AntRobotEgg");
/* 2324 */     GameRegistry.registerItem(SpiderRobotEgg, "OreSpawn_SpiderRobotEgg");
/* 2325 */     GameRegistry.registerItem(SpiderDriverEgg, "OreSpawn_SpiderDriverEgg");
/* 2326 */     GameRegistry.registerItem(CrabEgg, "OreSpawn_CrabEgg");
/*      */ 
/*      */     
/* 2329 */     GameRegistry.registerItem(CageEmpty, "OreSpawn_CageEmpty");
/* 2330 */     GameRegistry.registerItem(CagedSpider, "OreSpawn_CagedSpider");
/* 2331 */     GameRegistry.registerItem(CagedBat, "OreSpawn_CagedBat");
/* 2332 */     GameRegistry.registerItem(CagedCow, "OreSpawn_CagedCow");
/* 2333 */     GameRegistry.registerItem(CagedPig, "OreSpawn_CagePig");
/* 2334 */     GameRegistry.registerItem(CagedSquid, "OreSpawn_CagedSquid");
/* 2335 */     GameRegistry.registerItem(CagedChicken, "OreSpawn_CagedChicken");
/* 2336 */     GameRegistry.registerItem(CagedCreeper, "OreSpawn_CagedCreeper");
/* 2337 */     GameRegistry.registerItem(CagedSkeleton, "OreSpawn_CagedSkeleton");
/* 2338 */     GameRegistry.registerItem(CagedZombie, "OreSpawn_CagedZombie");
/* 2339 */     GameRegistry.registerItem(CagedSlime, "OreSpawn_CagedSlime");
/* 2340 */     GameRegistry.registerItem(CagedGhast, "OreSpawn_CagedGhast");
/* 2341 */     GameRegistry.registerItem(CagedZombiePigman, "OreSpawn_CagedZombiePigman");
/* 2342 */     GameRegistry.registerItem(CagedEnderman, "OreSpawn_CagedEnderman");
/* 2343 */     GameRegistry.registerItem(CagedCaveSpider, "OreSpawn_CagedCaveSpider");
/* 2344 */     GameRegistry.registerItem(CagedSilverfish, "OreSpawn_CagedSilverfish");
/* 2345 */     GameRegistry.registerItem(CagedMagmaCube, "OreSpawn_CagedMagmaCube");
/* 2346 */     GameRegistry.registerItem(CagedWitch, "OreSpawn_CagedWitch");
/* 2347 */     GameRegistry.registerItem(CagedSheep, "OreSpawn_CagedSheep");
/* 2348 */     GameRegistry.registerItem(CagedWolf, "OreSpawn_CagedWolf");
/* 2349 */     GameRegistry.registerItem(CagedMooshroom, "OreSpawn_CagedMooshroom");
/* 2350 */     GameRegistry.registerItem(CagedOcelot, "OreSpawn_CagedOcelot");
/* 2351 */     GameRegistry.registerItem(CagedBlaze, "OreSpawn_CagedBlaze");
/* 2352 */     GameRegistry.registerItem(CagedGirlfriend, "OreSpawn_CagedGirlfriend");
/* 2353 */     GameRegistry.registerItem(CagedBoyfriend, "OreSpawn_CagedBoyfriend");
/* 2354 */     GameRegistry.registerItem(CagedWitherSkeleton, "OreSpawn_CagedWitherSkeleton");
/* 2355 */     GameRegistry.registerItem(CagedEnderDragon, "OreSpawn_CagedEnderDragon");
/* 2356 */     GameRegistry.registerItem(CagedSnowGolem, "OreSpawn_CagedSnowGolem");
/* 2357 */     GameRegistry.registerItem(CagedIronGolem, "OreSpawn_CagedIronGolem");
/* 2358 */     GameRegistry.registerItem(CagedWitherBoss, "OreSpawn_CagedWitherBoss");
/* 2359 */     GameRegistry.registerItem(CagedRedCow, "OreSpawn_CagedRedCow");
/* 2360 */     GameRegistry.registerItem(CagedCrystalCow, "OreSpawn_CagedCrystalCow");
/* 2361 */     GameRegistry.registerItem(CagedVillager, "OreSpawn_CagedVillager");
/* 2362 */     GameRegistry.registerItem(CagedGoldCow, "OreSpawn_CagedGoldCow");
/* 2363 */     GameRegistry.registerItem(CagedEnchantedCow, "OreSpawn_CagedEnchantedCow");
/* 2364 */     GameRegistry.registerItem(CagedMOTHRA, "OreSpawn_CagedMOTHRA");
/* 2365 */     GameRegistry.registerItem(CagedAlo, "OreSpawn_CagedAlo");
/* 2366 */     GameRegistry.registerItem(CagedCryo, "OreSpawn_CagedCryo");
/* 2367 */     GameRegistry.registerItem(CagedCama, "OreSpawn_CagedCama");
/* 2368 */     GameRegistry.registerItem(CagedVelo, "OreSpawn_CagedVelo");
/* 2369 */     GameRegistry.registerItem(CagedHydro, "OreSpawn_CagedHydro");
/* 2370 */     GameRegistry.registerItem(CagedBasil, "OreSpawn_CagedBasil");
/* 2371 */     GameRegistry.registerItem(CagedDragonfly, "OreSpawn_CagedDragonfly");
/* 2372 */     GameRegistry.registerItem(CagedEmperorScorpion, "OreSpawn_CagedEmperorScorpion");
/* 2373 */     GameRegistry.registerItem(CagedScorpion, "OreSpawn_CagedScorpion");
/* 2374 */     GameRegistry.registerItem(CagedCaveFisher, "OreSpawn_CagedCaveFisher");
/* 2375 */     GameRegistry.registerItem(CagedSpyro, "OreSpawn_CagedSpyro");
/* 2376 */     GameRegistry.registerItem(CagedBaryonyx, "OreSpawn_CagedBaryonyx");
/* 2377 */     GameRegistry.registerItem(CagedGammaMetroid, "OreSpawn_CagedGammaMetroid");
/* 2378 */     GameRegistry.registerItem(CagedCockateil, "OreSpawn_CagedCockateil");
/* 2379 */     GameRegistry.registerItem(CagedKyuubi, "OreSpawn_CagedKyuubi");
/* 2380 */     GameRegistry.registerItem(CagedAlien, "OreSpawn_CagedAlien");
/* 2381 */     GameRegistry.registerItem(MyElevator, "OreSpawn_Elevator");
/* 2382 */     GameRegistry.registerItem(CagedAttackSquid, "OreSpawn_CagedAttackSquid");
/* 2383 */     GameRegistry.registerItem(CagedWaterDragon, "OreSpawn_CagedWaterDragon");
/* 2384 */     GameRegistry.registerItem(CagedCephadrome, "OreSpawn_CagedCephadrome");
/* 2385 */     GameRegistry.registerItem(CagedKraken, "OreSpawn_CagedKraken");
/* 2386 */     GameRegistry.registerItem(CagedLizard, "OreSpawn_CagedLizard");
/* 2387 */     GameRegistry.registerItem(CagedDragon, "OreSpawn_CagedDragon");
/* 2388 */     GameRegistry.registerItem(CagedBee, "OreSpawn_CagedBee");
/* 2389 */     GameRegistry.registerItem(CagedHorse, "OreSpawn_CagedHorse");
/* 2390 */     GameRegistry.registerItem(CagedFirefly, "OreSpawn_CagedFirefly");
/* 2391 */     GameRegistry.registerItem(CagedChipmunk, "OreSpawn_CagedChipmunk");
/* 2392 */     GameRegistry.registerItem(CagedGazelle, "OreSpawn_CagedGazelle");
/* 2393 */     GameRegistry.registerItem(CagedOstrich, "OreSpawn_CagedOstrich");
/* 2394 */     GameRegistry.registerItem(CagedTrooper, "OreSpawn_CagedTrooper");
/* 2395 */     GameRegistry.registerItem(CagedSpit, "OreSpawn_CagedSpit");
/* 2396 */     GameRegistry.registerItem(CagedStink, "OreSpawn_CagedStink");
/* 2397 */     GameRegistry.registerItem(CagedCreepingHorror, "OreSpawn_CagedCreepingHorror");
/* 2398 */     GameRegistry.registerItem(CagedTerribleTerror, "OreSpawn_CagedTerribleTerror");
/* 2399 */     GameRegistry.registerItem(CagedCliffRacer, "OreSpawn_CagedCliffRacer");
/* 2400 */     GameRegistry.registerItem(CagedTriffid, "OreSpawn_CagedTriffid");
/* 2401 */     GameRegistry.registerItem(CagedPitchBlack, "OreSpawn_CagedPitchBlack");
/* 2402 */     GameRegistry.registerItem(CagedLurkingTerror, "OreSpawn_CagedLurkingTerror");
/* 2403 */     GameRegistry.registerItem(CagedSmallWorm, "OreSpawn_CagedSmallWorm");
/* 2404 */     GameRegistry.registerItem(CagedMediumWorm, "OreSpawn_CagedMediumWorm");
/* 2405 */     GameRegistry.registerItem(CagedLargeWorm, "OreSpawn_CagedLargeWorm");
/* 2406 */     GameRegistry.registerItem(CagedCassowary, "OreSpawn_CagedCassowary");
/* 2407 */     GameRegistry.registerItem(CagedCloudShark, "OreSpawn_CagedCloudShark");
/* 2408 */     GameRegistry.registerItem(CagedGoldFish, "OreSpawn_CagedGoldFish");
/* 2409 */     GameRegistry.registerItem(CagedLeafMonster, "OreSpawn_CagedLeafMonster");
/* 2410 */     GameRegistry.registerItem(CagedEnderKnight, "OreSpawn_CagedEnderKnight");
/* 2411 */     GameRegistry.registerItem(CagedEnderReaper, "OreSpawn_CagedEnderReaper");
/* 2412 */     GameRegistry.registerItem(CagedBeaver, "OreSpawn_CagedBeaver");
/* 2413 */     GameRegistry.registerItem(CagedUrchin, "OreSpawn_CagedUrchin");
/* 2414 */     GameRegistry.registerItem(CagedFlounder, "OreSpawn_CagedFlounder");
/* 2415 */     GameRegistry.registerItem(CagedSkate, "OreSpawn_CagedSkate");
/* 2416 */     GameRegistry.registerItem(CagedRotator, "OreSpawn_CagedRotator");
/* 2417 */     GameRegistry.registerItem(CagedPeacock, "OreSpawn_CagedPeacock");
/* 2418 */     GameRegistry.registerItem(CagedFairy, "OreSpawn_CagedFairy");
/* 2419 */     GameRegistry.registerItem(CagedDungeonBeast, "OreSpawn_CagedDungeonBeast");
/* 2420 */     GameRegistry.registerItem(CagedVortex, "OreSpawn_CagedVortex");
/* 2421 */     GameRegistry.registerItem(CagedRat, "OreSpawn_CagedRat");
/* 2422 */     GameRegistry.registerItem(CagedWhale, "OreSpawn_CagedWhale");
/* 2423 */     GameRegistry.registerItem(CagedIrukandji, "OreSpawn_CagedIrukandji");
/* 2424 */     GameRegistry.registerItem(CagedTRex, "OreSpawn_CagedTRex");
/* 2425 */     GameRegistry.registerItem(CagedHercules, "OreSpawn_CagedHercules");
/* 2426 */     GameRegistry.registerItem(CagedMantis, "OreSpawn_CagedMantis");
/* 2427 */     GameRegistry.registerItem(CagedStinky, "OreSpawn_CagedStinky");
/* 2428 */     GameRegistry.registerItem(CagedEasterBunny, "OreSpawn_CagedEasterBunny");
/* 2429 */     GameRegistry.registerItem(CagedCaterKiller, "OreSpawn_CagedCaterKiller");
/* 2430 */     GameRegistry.registerItem(CagedMolenoid, "OreSpawn_CagedMolenoid");
/* 2431 */     GameRegistry.registerItem(CagedSeaMonster, "OreSpawn_CagedSeaMonster");
/* 2432 */     GameRegistry.registerItem(CagedSeaViper, "OreSpawn_CagedSeaViper");
/* 2433 */     GameRegistry.registerItem(CagedLeon, "OreSpawn_CagedLeon");
/* 2434 */     GameRegistry.registerItem(CagedHammerhead, "OreSpawn_CagedHammerhead");
/* 2435 */     GameRegistry.registerItem(CagedRubberDucky, "OreSpawn_CagedRubberDucky");
/* 2436 */     GameRegistry.registerItem(CagedCriminal, "OreSpawn_CagedCriminal");
/* 2437 */     GameRegistry.registerItem(CagedBrutalfly, "OreSpawn_CagedBrutalfly");
/* 2438 */     GameRegistry.registerItem(CagedNastysaurus, "OreSpawn_CagedNastysaurus");
/* 2439 */     GameRegistry.registerItem(CagedPointysaurus, "OreSpawn_CagedPointysaurus");
/* 2440 */     GameRegistry.registerItem(CagedCricket, "OreSpawn_CagedCricket");
/* 2441 */     GameRegistry.registerItem(CagedFrog, "OreSpawn_CagedFrog");
/* 2442 */     GameRegistry.registerItem(CagedSpiderDriver, "OreSpawn_CagedSpiderDriver");
/* 2443 */     GameRegistry.registerItem(CagedCrab, "OreSpawn_CagedCrab");
/*      */     
/* 2445 */     GameRegistry.registerItem(MyStrawberry, "OreSpawn_Strawberry");
/* 2446 */     GameRegistry.registerItem(MyCrystalApple, "OreSpawn_CrystalApple");
/* 2447 */     GameRegistry.registerItem(MyCherry, "OreSpawn_Cherry");
/* 2448 */     GameRegistry.registerItem(MyPeach, "OreSpawn_Peach");
/* 2449 */     GameRegistry.registerItem(MyRadish, "OreSpawn_Radish");
/* 2450 */     GameRegistry.registerItem(MyRice, "OreSpawn_Rice");
/* 2451 */     GameRegistry.registerItem(MyCornCob, "OreSpawn_CornCob");
/* 2452 */     GameRegistry.registerItem(MyQuinoa, "OreSpawn_Quinoa");
/* 2453 */     GameRegistry.registerItem(MyTomato, "OreSpawn_Tomato");
/* 2454 */     GameRegistry.registerItem(MyLettuce, "OreSpawn_Lettuce");
/* 2455 */     GameRegistry.registerItem(MyStrawberrySeed, "OreSpawn_StrawberrySeed");
/* 2456 */     GameRegistry.registerItem(MyButterflySeed, "OreSpawn_ButterflySeed");
/* 2457 */     GameRegistry.registerItem(MyMothSeed, "OreSpawn_MothSeed");
/* 2458 */     GameRegistry.registerItem(MyMosquitoSeed, "OreSpawn_MosquitoSeed");
/* 2459 */     GameRegistry.registerItem(MyFireflySeed, "OreSpawn_FireflySeed");
/* 2460 */     GameRegistry.registerItem(MagicApple, "OreSpawn_MagicApple");
/* 2461 */     GameRegistry.registerItem(RandomDungeon, "OreSpawn_RandomDungeon");
/* 2462 */     GameRegistry.registerItem(MinersDream, "OreSpawn_MinersDream");
/* 2463 */     GameRegistry.registerItem((Item)UltimateHelmet, "OreSpawn_UltimateHelmet");
/* 2464 */     GameRegistry.registerItem((Item)UltimateBody, "OreSpawn_UltimateBody");
/* 2465 */     GameRegistry.registerItem((Item)UltimateLegs, "OreSpawn_UltimateLegs");
/* 2466 */     GameRegistry.registerItem((Item)UltimateBoots, "OreSpawn_UltimateBoots");
/* 2467 */     GameRegistry.registerItem((Item)LavaEelHelmet, "OreSpawn_LavaEelHelmet");
/* 2468 */     GameRegistry.registerItem((Item)LavaEelBody, "OreSpawn_LavaEelBody");
/* 2469 */     GameRegistry.registerItem((Item)LavaEelLegs, "OreSpawn_LavaEelLegs");
/* 2470 */     GameRegistry.registerItem((Item)LavaEelBoots, "OreSpawn_LavaEelBoots");
/* 2471 */     GameRegistry.registerItem((Item)MothScaleHelmet, "OreSpawn_MothScaleHelmet");
/* 2472 */     GameRegistry.registerItem((Item)MothScaleBody, "OreSpawn_MothScaleBody");
/* 2473 */     GameRegistry.registerItem((Item)MothScaleLegs, "OreSpawn_MothScaleLegs");
/* 2474 */     GameRegistry.registerItem((Item)MothScaleBoots, "OreSpawn_MothScaleBoots");
/* 2475 */     GameRegistry.registerItem(MyAppleSeed, "OreSpawn_AppleSeed");
/* 2476 */     GameRegistry.registerItem(MyCherrySeed, "OreSpawn_CherrySeed");
/* 2477 */     GameRegistry.registerItem(MyPeachSeed, "OreSpawn_PeachSeed");
/* 2478 */     GameRegistry.registerItem(MyStepUp, "OreSpawn_StepUp");
/* 2479 */     GameRegistry.registerItem(MyStepDown, "OreSpawn_StepDown");
/* 2480 */     GameRegistry.registerItem(MyStepAccross, "OreSpawn_StepAccross");
/* 2481 */     GameRegistry.registerItem((Item)EmeraldHelmet, "OreSpawn_EmeraldHelmet");
/* 2482 */     GameRegistry.registerItem((Item)EmeraldBody, "OreSpawn_EmeraldBody");
/* 2483 */     GameRegistry.registerItem((Item)EmeraldLegs, "OreSpawn_EmeraldLegs");
/* 2484 */     GameRegistry.registerItem((Item)EmeraldBoots, "OreSpawn_EmeraldBoots");
/* 2485 */     GameRegistry.registerItem(MyExperienceCatcher, "OreSpawn_ExperienceCatcher");
/* 2486 */     GameRegistry.registerItem(MyDeadStinkBug, "OreSpawn_DeadStinkBug");
/* 2487 */     GameRegistry.registerItem(MyExperienceTreeSeed, "OreSpawn_ExperienceTreeSeed");
/* 2488 */     GameRegistry.registerItem((Item)ExperienceHelmet, "OreSpawn_ExperienceHelmet");
/* 2489 */     GameRegistry.registerItem((Item)ExperienceBody, "OreSpawn_ExperienceBody");
/* 2490 */     GameRegistry.registerItem((Item)ExperienceLegs, "OreSpawn_ExperienceLegs");
/* 2491 */     GameRegistry.registerItem((Item)ExperienceBoots, "OreSpawn_ExperienceBoots");
/* 2492 */     GameRegistry.registerItem((Item)RubyHelmet, "OreSpawn_RubyHelmet");
/* 2493 */     GameRegistry.registerItem((Item)RubyBody, "OreSpawn_RubyBody");
/* 2494 */     GameRegistry.registerItem((Item)RubyLegs, "OreSpawn_RubyLegs");
/* 2495 */     GameRegistry.registerItem((Item)RubyBoots, "OreSpawn_RubyBoots");
/* 2496 */     GameRegistry.registerItem((Item)AmethystHelmet, "OreSpawn_AmethystHelmet");
/* 2497 */     GameRegistry.registerItem((Item)AmethystBody, "OreSpawn_AmethystBody");
/* 2498 */     GameRegistry.registerItem((Item)AmethystLegs, "OreSpawn_AmethystLegs");
/* 2499 */     GameRegistry.registerItem((Item)AmethystBoots, "OreSpawn_AmethystBoots");
/* 2500 */     GameRegistry.registerItem(ZooCage2, "OreSpawn_ZooCage2");
/* 2501 */     GameRegistry.registerItem(ZooCage4, "OreSpawn_ZooCage4");
/* 2502 */     GameRegistry.registerItem(ZooCage6, "OreSpawn_ZooCage6");
/* 2503 */     GameRegistry.registerItem(ZooCage8, "OreSpawn_ZooCage8");
/* 2504 */     GameRegistry.registerItem(ZooCage10, "OreSpawn_ZooCage10");
/* 2505 */     GameRegistry.registerItem(InstantShelter, "OreSpawn_InstantShelter");
/* 2506 */     GameRegistry.registerItem(InstantGarden, "OreSpawn_InstantGarden");
/* 2507 */     GameRegistry.registerItem((Item)CrystalPinkHelmet, "OreSpawn_CrystalPinkHelmet");
/* 2508 */     GameRegistry.registerItem((Item)CrystalPinkBody, "OreSpawn_CrystalPinkBody");
/* 2509 */     GameRegistry.registerItem((Item)CrystalPinkLegs, "OreSpawn_CrystalPinkLegs");
/* 2510 */     GameRegistry.registerItem((Item)CrystalPinkBoots, "OreSpawn_CrystalPinkBoots");
/* 2511 */     GameRegistry.registerItem((Item)TigersEyeHelmet, "OreSpawn_TigersEyeHelmet");
/* 2512 */     GameRegistry.registerItem((Item)TigersEyeBody, "OreSpawn_TigersEyeBody");
/* 2513 */     GameRegistry.registerItem((Item)TigersEyeLegs, "OreSpawn_TigersEyeLegs");
/* 2514 */     GameRegistry.registerItem((Item)TigersEyeBoots, "OreSpawn_TigersEyeBoots");
/* 2515 */     GameRegistry.registerItem((Item)PeacockFeatherBoots, "OreSpawn_PeacockFeatherBoots");
/* 2516 */     GameRegistry.registerItem((Item)PeacockFeatherHelmet, "OreSpawn_PeacockFeatherHelmet");
/* 2517 */     GameRegistry.registerItem((Item)PeacockFeatherBody, "OreSpawn_PeacockFeatherBody");
/* 2518 */     GameRegistry.registerItem((Item)PeacockFeatherLegs, "OreSpawn_PeacockFeatherLegs");
/* 2519 */     GameRegistry.registerItem((Item)MobzillaHelmet, "OreSpawn_MobzillaHelmet");
/* 2520 */     GameRegistry.registerItem((Item)MobzillaBody, "OreSpawn_MobzillaBody");
/* 2521 */     GameRegistry.registerItem((Item)MobzillaLegs, "OreSpawn_MobzillaLegs");
/* 2522 */     GameRegistry.registerItem((Item)MobzillaBoots, "OreSpawn_MobzillaBoots");
/* 2523 */     GameRegistry.registerItem((Item)RoyalHelmet, "OreSpawn_RoyalHelmet");
/* 2524 */     GameRegistry.registerItem((Item)RoyalBody, "OreSpawn_RoyalBody");
/* 2525 */     GameRegistry.registerItem((Item)RoyalLegs, "OreSpawn_RoyalLegs");
/* 2526 */     GameRegistry.registerItem((Item)RoyalBoots, "OreSpawn_RoyalBoots");
/* 2527 */     GameRegistry.registerItem((Item)LapisHelmet, "OreSpawn_LapisHelmet");
/* 2528 */     GameRegistry.registerItem((Item)LapisBody, "OreSpawn_LapisBody");
/* 2529 */     GameRegistry.registerItem((Item)LapisLegs, "OreSpawn_LapisLegs");
/* 2530 */     GameRegistry.registerItem((Item)LapisBoots, "OreSpawn_LapisBoots");
/* 2531 */     GameRegistry.registerItem((Item)QueenHelmet, "OreSpawn_QueenHelmet");
/* 2532 */     GameRegistry.registerItem((Item)QueenBody, "OreSpawn_QueenBody");
/* 2533 */     GameRegistry.registerItem((Item)QueenLegs, "OreSpawn_QueenLegs");
/* 2534 */     GameRegistry.registerItem((Item)QueenBoots, "OreSpawn_QueenBoots");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2539 */     ItemStack OreSpiderEggStack = new ItemStack(MySpiderSpawnBlock);
/*      */     
/* 2541 */     LanguageRegistry.instance().addNameForObject(MySpiderSpawnBlock, "en_US", "Ancient Dried Spider Spawn Egg");
/* 2542 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 52), new Object[] { new ItemStack(Items.field_151131_as), OreSpiderEggStack });
/*      */     
/* 2544 */     ItemStack OreBatEggStack = new ItemStack(MyBatSpawnBlock);
/*      */     
/* 2546 */     LanguageRegistry.instance().addNameForObject(MyBatSpawnBlock, "en_US", "Ancient Dried Bat Spawn Egg");
/* 2547 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 65), new Object[] { new ItemStack(Items.field_151131_as), OreBatEggStack });
/*      */     
/* 2549 */     ItemStack OreCowEggStack = new ItemStack(MyCowSpawnBlock);
/*      */     
/* 2551 */     LanguageRegistry.instance().addNameForObject(MyCowSpawnBlock, "en_US", "Ancient Dried Cow Spawn Egg");
/* 2552 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 92), new Object[] { new ItemStack(Items.field_151131_as), OreCowEggStack });
/*      */     
/* 2554 */     ItemStack OrePigEggStack = new ItemStack(MyPigSpawnBlock);
/*      */     
/* 2556 */     LanguageRegistry.instance().addNameForObject(MyPigSpawnBlock, "en_US", "Ancient Dried Pig Spawn Egg");
/* 2557 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 90), new Object[] { new ItemStack(Items.field_151131_as), OrePigEggStack });
/*      */     
/* 2559 */     ItemStack OreSquidEggStack = new ItemStack(MySquidSpawnBlock);
/*      */     
/* 2561 */     LanguageRegistry.instance().addNameForObject(MySquidSpawnBlock, "en_US", "Ancient Dried Squid Spawn Egg");
/* 2562 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 94), new Object[] { new ItemStack(Items.field_151131_as), OreSquidEggStack });
/*      */     
/* 2564 */     ItemStack OreChickenEggStack = new ItemStack(MyChickenSpawnBlock);
/*      */     
/* 2566 */     LanguageRegistry.instance().addNameForObject(MyChickenSpawnBlock, "en_US", "Ancient Dried Chicken Spawn Egg");
/* 2567 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 93), new Object[] { new ItemStack(Items.field_151131_as), OreChickenEggStack });
/*      */     
/* 2569 */     ItemStack OreCreeperEggStack = new ItemStack(MyCreeperSpawnBlock);
/*      */     
/* 2571 */     LanguageRegistry.instance().addNameForObject(MyCreeperSpawnBlock, "en_US", "Ancient Dried Creeper Spawn Egg");
/* 2572 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 50), new Object[] { new ItemStack(Items.field_151131_as), OreCreeperEggStack });
/*      */     
/* 2574 */     ItemStack OreSkeletonEggStack = new ItemStack(MySkeletonSpawnBlock);
/*      */     
/* 2576 */     LanguageRegistry.instance().addNameForObject(MySkeletonSpawnBlock, "en_US", "Ancient Dried Skeleton Spawn Egg");
/* 2577 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 51), new Object[] { new ItemStack(Items.field_151131_as), OreSkeletonEggStack });
/*      */     
/* 2579 */     ItemStack OreZombieEggStack = new ItemStack(MyZombieSpawnBlock);
/*      */     
/* 2581 */     LanguageRegistry.instance().addNameForObject(MyZombieSpawnBlock, "en_US", "Ancient Dried Zombie Spawn Egg");
/* 2582 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 54), new Object[] { new ItemStack(Items.field_151131_as), OreZombieEggStack });
/*      */     
/* 2584 */     ItemStack OreSlimeEggStack = new ItemStack(MySlimeSpawnBlock);
/*      */     
/* 2586 */     LanguageRegistry.instance().addNameForObject(MySlimeSpawnBlock, "en_US", "Ancient Dried Slime Spawn Egg");
/* 2587 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 55), new Object[] { new ItemStack(Items.field_151131_as), OreSlimeEggStack });
/*      */     
/* 2589 */     ItemStack OreGhastEggStack = new ItemStack(MyGhastSpawnBlock);
/*      */     
/* 2591 */     LanguageRegistry.instance().addNameForObject(MyGhastSpawnBlock, "en_US", "Ancient Dried Ghast Spawn Egg");
/* 2592 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 56), new Object[] { new ItemStack(Items.field_151131_as), OreGhastEggStack });
/*      */     
/* 2594 */     ItemStack OreZombiePigmanEggStack = new ItemStack(MyZombiePigmanSpawnBlock);
/*      */     
/* 2596 */     LanguageRegistry.instance().addNameForObject(MyZombiePigmanSpawnBlock, "en_US", "Ancient Dried Zombie Pigman Spawn Egg");
/* 2597 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 57), new Object[] { new ItemStack(Items.field_151131_as), OreZombiePigmanEggStack });
/*      */     
/* 2599 */     ItemStack OreEndermanEggStack = new ItemStack(MyEndermanSpawnBlock);
/*      */     
/* 2601 */     LanguageRegistry.instance().addNameForObject(MyEndermanSpawnBlock, "en_US", "Ancient Dried Enderman Spawn Egg");
/* 2602 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 58), new Object[] { new ItemStack(Items.field_151131_as), OreEndermanEggStack });
/*      */     
/* 2604 */     ItemStack OreCaveSpiderEggStack = new ItemStack(MyCaveSpiderSpawnBlock);
/*      */     
/* 2606 */     LanguageRegistry.instance().addNameForObject(MyCaveSpiderSpawnBlock, "en_US", "Ancient Dried Cave Spider Spawn Egg");
/* 2607 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 59), new Object[] { new ItemStack(Items.field_151131_as), OreCaveSpiderEggStack });
/*      */     
/* 2609 */     ItemStack OreSilverfishEggStack = new ItemStack(MySilverfishSpawnBlock);
/*      */     
/* 2611 */     LanguageRegistry.instance().addNameForObject(MySilverfishSpawnBlock, "en_US", "Ancient Dried Silverfish Spawn Egg");
/* 2612 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 60), new Object[] { new ItemStack(Items.field_151131_as), OreSilverfishEggStack });
/*      */     
/* 2614 */     ItemStack OreMagmaCubeEggStack = new ItemStack(MyMagmaCubeSpawnBlock);
/*      */     
/* 2616 */     LanguageRegistry.instance().addNameForObject(MyMagmaCubeSpawnBlock, "en_US", "Ancient Dried Magma Cube Spawn Egg");
/* 2617 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 62), new Object[] { new ItemStack(Items.field_151131_as), OreMagmaCubeEggStack });
/*      */     
/* 2619 */     ItemStack OreWitchEggStack = new ItemStack(MyWitchSpawnBlock);
/*      */     
/* 2621 */     LanguageRegistry.instance().addNameForObject(MyWitchSpawnBlock, "en_US", "Ancient Dried Witch Spawn Egg");
/* 2622 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 66), new Object[] { new ItemStack(Items.field_151131_as), OreWitchEggStack });
/*      */     
/* 2624 */     ItemStack OreSheepEggStack = new ItemStack(MySheepSpawnBlock);
/*      */     
/* 2626 */     LanguageRegistry.instance().addNameForObject(MySheepSpawnBlock, "en_US", "Ancient Dried Sheep Spawn Egg");
/* 2627 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 91), new Object[] { new ItemStack(Items.field_151131_as), OreSheepEggStack });
/*      */     
/* 2629 */     ItemStack OreWolfEggStack = new ItemStack(MyWolfSpawnBlock);
/*      */     
/* 2631 */     LanguageRegistry.instance().addNameForObject(MyWolfSpawnBlock, "en_US", "Ancient Dried Wolf Spawn Egg");
/* 2632 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 95), new Object[] { new ItemStack(Items.field_151131_as), OreWolfEggStack });
/*      */     
/* 2634 */     ItemStack OreMooshroomEggStack = new ItemStack(MyMooshroomSpawnBlock);
/*      */     
/* 2636 */     LanguageRegistry.instance().addNameForObject(MyMooshroomSpawnBlock, "en_US", "Ancient Dried Mooshroom Spawn Egg");
/* 2637 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 96), new Object[] { new ItemStack(Items.field_151131_as), OreMooshroomEggStack });
/*      */     
/* 2639 */     ItemStack OreOcelotEggStack = new ItemStack(MyOcelotSpawnBlock);
/*      */     
/* 2641 */     LanguageRegistry.instance().addNameForObject(MyOcelotSpawnBlock, "en_US", "Ancient Dried Ocelot Spawn Egg");
/* 2642 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 98), new Object[] { new ItemStack(Items.field_151131_as), OreOcelotEggStack });
/*      */     
/* 2644 */     ItemStack OreBlazeEggStack = new ItemStack(MyBlazeSpawnBlock);
/*      */     
/* 2646 */     LanguageRegistry.instance().addNameForObject(MyBlazeSpawnBlock, "en_US", "Ancient Dried Blaze Spawn Egg");
/* 2647 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 61), new Object[] { new ItemStack(Items.field_151131_as), OreBlazeEggStack });
/*      */     
/* 2649 */     ItemStack OreWitherSkeletonEggStack = new ItemStack(MyWitherSkeletonSpawnBlock);
/*      */     
/* 2651 */     LanguageRegistry.instance().addNameForObject(MyWitherSkeletonSpawnBlock, "en_US", "Ancient Dried Wither Skeleton Spawn Egg");
/* 2652 */     GameRegistry.addShapelessRecipe(new ItemStack(WitherSkeletonEgg), new Object[] { new ItemStack(Items.field_151131_as), OreWitherSkeletonEggStack });
/*      */     
/* 2654 */     ItemStack OreEnderDragonEggStack = new ItemStack(MyEnderDragonSpawnBlock);
/*      */     
/* 2656 */     LanguageRegistry.instance().addNameForObject(MyEnderDragonSpawnBlock, "en_US", "Ancient Dried Ender Dragon Spawn Egg");
/* 2657 */     GameRegistry.addShapelessRecipe(new ItemStack(EnderDragonEgg), new Object[] { new ItemStack(Items.field_151131_as), OreEnderDragonEggStack });
/*      */     
/* 2659 */     ItemStack OreSnowGolemEggStack = new ItemStack(MySnowGolemSpawnBlock);
/*      */     
/* 2661 */     LanguageRegistry.instance().addNameForObject(MySnowGolemSpawnBlock, "en_US", "Ancient Dried Snow Golem Spawn Egg");
/* 2662 */     GameRegistry.addShapelessRecipe(new ItemStack(SnowGolemEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSnowGolemEggStack });
/*      */     
/* 2664 */     ItemStack OreIronGolemEggStack = new ItemStack(MyIronGolemSpawnBlock);
/*      */     
/* 2666 */     LanguageRegistry.instance().addNameForObject(MyIronGolemSpawnBlock, "en_US", "Ancient Dried Iron Golem Spawn Egg");
/* 2667 */     GameRegistry.addShapelessRecipe(new ItemStack(IronGolemEgg), new Object[] { new ItemStack(Items.field_151131_as), OreIronGolemEggStack });
/*      */     
/* 2669 */     ItemStack OreWitherBossEggStack = new ItemStack(MyWitherBossSpawnBlock);
/*      */     
/* 2671 */     LanguageRegistry.instance().addNameForObject(MyWitherBossSpawnBlock, "en_US", "Ancient Dried Wither Boss Spawn Egg");
/* 2672 */     GameRegistry.addShapelessRecipe(new ItemStack(WitherBossEgg, 1, 64), new Object[] { new ItemStack(Items.field_151131_as), OreWitherBossEggStack });
/*      */     
/* 2674 */     ItemStack OreGirlfriendEggStack = new ItemStack(MyGirlfriendSpawnBlock);
/*      */     
/* 2676 */     LanguageRegistry.instance().addNameForObject(MyGirlfriendSpawnBlock, "en_US", "Ancient Dried Girlfriend Spawn Egg");
/* 2677 */     GameRegistry.addShapelessRecipe(new ItemStack(GirlfriendEgg), new Object[] { new ItemStack(Items.field_151131_as), OreGirlfriendEggStack });
/*      */     
/* 2679 */     ItemStack OreBoyfriendEggStack = new ItemStack(MyBoyfriendSpawnBlock);
/*      */     
/* 2681 */     LanguageRegistry.instance().addNameForObject(MyBoyfriendSpawnBlock, "en_US", "Ancient Dried Boyfriend Spawn Egg");
/* 2682 */     GameRegistry.addShapelessRecipe(new ItemStack(BoyfriendEgg), new Object[] { new ItemStack(Items.field_151131_as), OreBoyfriendEggStack });
/*      */     
/* 2684 */     ItemStack OreRedCowEggStack = new ItemStack(MyRedCowSpawnBlock);
/*      */     
/* 2686 */     LanguageRegistry.instance().addNameForObject(MyRedCowSpawnBlock, "en_US", "Ancient Dried Apple Cow Spawn Egg");
/* 2687 */     GameRegistry.addShapelessRecipe(new ItemStack(RedCowEgg), new Object[] { new ItemStack(Items.field_151131_as), OreRedCowEggStack });
/*      */     
/* 2689 */     ItemStack OreCrystalCowEggStack = new ItemStack(MyCrystalCowSpawnBlock);
/*      */     
/* 2691 */     LanguageRegistry.instance().addNameForObject(MyCrystalCowSpawnBlock, "en_US", "Ancient Dried Crystal Cow Spawn Egg");
/* 2692 */     GameRegistry.addShapelessRecipe(new ItemStack(CrystalCowEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCrystalCowEggStack });
/*      */     
/* 2694 */     ItemStack OreVillagerEggStack = new ItemStack(MyVillagerSpawnBlock);
/*      */     
/* 2696 */     LanguageRegistry.instance().addNameForObject(MyVillagerSpawnBlock, "en_US", "Ancient Dried Villager Spawn Egg");
/* 2697 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 120), new Object[] { new ItemStack(Items.field_151131_as), OreVillagerEggStack });
/*      */     
/* 2699 */     ItemStack OreGoldCowEggStack = new ItemStack(MyGoldCowSpawnBlock);
/*      */     
/* 2701 */     LanguageRegistry.instance().addNameForObject(MyGoldCowSpawnBlock, "en_US", "Ancient Dried Golden Apple Cow Spawn Egg");
/* 2702 */     GameRegistry.addShapelessRecipe(new ItemStack(GoldCowEgg), new Object[] { new ItemStack(Items.field_151131_as), OreGoldCowEggStack });
/*      */     
/* 2704 */     ItemStack OreEnchantedCowEggStack = new ItemStack(MyEnchantedCowSpawnBlock);
/*      */     
/* 2706 */     LanguageRegistry.instance().addNameForObject(MyEnchantedCowSpawnBlock, "en_US", "Ancient Dried Enchanted Golden Apple Cow Spawn Egg");
/* 2707 */     GameRegistry.addShapelessRecipe(new ItemStack(EnchantedCowEgg), new Object[] { new ItemStack(Items.field_151131_as), OreEnchantedCowEggStack });
/*      */     
/* 2709 */     ItemStack OreMOTHRAEggStack = new ItemStack(MyMOTHRASpawnBlock);
/*      */     
/* 2711 */     LanguageRegistry.instance().addNameForObject(MyMOTHRASpawnBlock, "en_US", "Ancient Dried MOTHRA Spawn Egg");
/* 2712 */     GameRegistry.addShapelessRecipe(new ItemStack(MOTHRAEgg), new Object[] { new ItemStack(Items.field_151131_as), OreMOTHRAEggStack });
/*      */     
/* 2714 */     ItemStack OreAloEggStack = new ItemStack(MyAloSpawnBlock);
/*      */     
/* 2716 */     LanguageRegistry.instance().addNameForObject(MyAloSpawnBlock, "en_US", "Ancient Dried Alosaurus Spawn Egg");
/* 2717 */     GameRegistry.addShapelessRecipe(new ItemStack(AloEgg), new Object[] { new ItemStack(Items.field_151131_as), OreAloEggStack });
/*      */     
/* 2719 */     ItemStack OreCryoEggStack = new ItemStack(MyCryoSpawnBlock);
/*      */     
/* 2721 */     LanguageRegistry.instance().addNameForObject(MyCryoSpawnBlock, "en_US", "Ancient Dried Cryolophosaurus Spawn Egg");
/* 2722 */     GameRegistry.addShapelessRecipe(new ItemStack(CryoEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCryoEggStack });
/*      */     
/* 2724 */     ItemStack OreCamaEggStack = new ItemStack(MyCamaSpawnBlock);
/*      */     
/* 2726 */     LanguageRegistry.instance().addNameForObject(MyCamaSpawnBlock, "en_US", "Ancient Dried Camarasaurus Spawn Egg");
/* 2727 */     GameRegistry.addShapelessRecipe(new ItemStack(CamaEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCamaEggStack });
/*      */     
/* 2729 */     ItemStack OreVeloEggStack = new ItemStack(MyVeloSpawnBlock);
/*      */     
/* 2731 */     LanguageRegistry.instance().addNameForObject(MyVeloSpawnBlock, "en_US", "Ancient Dried Velocity Raptor Spawn Egg");
/* 2732 */     GameRegistry.addShapelessRecipe(new ItemStack(VeloEgg), new Object[] { new ItemStack(Items.field_151131_as), OreVeloEggStack });
/*      */     
/* 2734 */     ItemStack OreHydroEggStack = new ItemStack(MyHydroSpawnBlock);
/*      */     
/* 2736 */     LanguageRegistry.instance().addNameForObject(MyHydroSpawnBlock, "en_US", "Ancient Dried Hydrolisc Spawn Egg");
/* 2737 */     GameRegistry.addShapelessRecipe(new ItemStack(HydroEgg), new Object[] { new ItemStack(Items.field_151131_as), OreHydroEggStack });
/*      */     
/* 2739 */     ItemStack OreBasilEggStack = new ItemStack(MyBasilSpawnBlock);
/*      */     
/* 2741 */     LanguageRegistry.instance().addNameForObject(MyBasilSpawnBlock, "en_US", "Ancient Dried Basilisk Spawn Egg");
/* 2742 */     GameRegistry.addShapelessRecipe(new ItemStack(BasilEgg), new Object[] { new ItemStack(Items.field_151131_as), OreBasilEggStack });
/*      */     
/* 2744 */     ItemStack OreDragonflyEggStack = new ItemStack(MyDragonflySpawnBlock);
/*      */     
/* 2746 */     LanguageRegistry.instance().addNameForObject(MyDragonflySpawnBlock, "en_US", "Ancient Dried Dragonfly Spawn Egg");
/* 2747 */     GameRegistry.addShapelessRecipe(new ItemStack(DragonflyEgg), new Object[] { new ItemStack(Items.field_151131_as), OreDragonflyEggStack });
/*      */     
/* 2749 */     ItemStack OreEmperorScorpionEggStack = new ItemStack(MyEmperorScorpionSpawnBlock);
/*      */     
/* 2751 */     LanguageRegistry.instance().addNameForObject(MyEmperorScorpionSpawnBlock, "en_US", "Ancient Dried Emperor Scorpion Spawn Egg");
/* 2752 */     GameRegistry.addShapelessRecipe(new ItemStack(EmperorScorpionEgg), new Object[] { new ItemStack(Items.field_151131_as), OreEmperorScorpionEggStack });
/*      */     
/* 2754 */     ItemStack OreScorpionEggStack = new ItemStack(MyScorpionSpawnBlock);
/*      */     
/* 2756 */     LanguageRegistry.instance().addNameForObject(MyScorpionSpawnBlock, "en_US", "Ancient Dried Scorpion Spawn Egg");
/* 2757 */     GameRegistry.addShapelessRecipe(new ItemStack(ScorpionEgg), new Object[] { new ItemStack(Items.field_151131_as), OreScorpionEggStack });
/*      */     
/* 2759 */     ItemStack OreCaveFisherEggStack = new ItemStack(MyCaveFisherSpawnBlock);
/*      */     
/* 2761 */     LanguageRegistry.instance().addNameForObject(MyCaveFisherSpawnBlock, "en_US", "Ancient Dried Cave Fisher Spawn Egg");
/* 2762 */     GameRegistry.addShapelessRecipe(new ItemStack(CaveFisherEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCaveFisherEggStack });
/*      */     
/* 2764 */     ItemStack OreSpyroEggStack = new ItemStack(MySpyroSpawnBlock);
/*      */     
/* 2766 */     LanguageRegistry.instance().addNameForObject(MySpyroSpawnBlock, "en_US", "Ancient Dried Baby Dragon Spawn Egg");
/* 2767 */     GameRegistry.addShapelessRecipe(new ItemStack(SpyroEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSpyroEggStack });
/*      */     
/* 2769 */     ItemStack OreBaryonyxEggStack = new ItemStack(MyBaryonyxSpawnBlock);
/*      */     
/* 2771 */     LanguageRegistry.instance().addNameForObject(MyBaryonyxSpawnBlock, "en_US", "Ancient Dried Baryonyx Spawn Egg");
/* 2772 */     GameRegistry.addShapelessRecipe(new ItemStack(BaryonyxEgg), new Object[] { new ItemStack(Items.field_151131_as), OreBaryonyxEggStack });
/*      */     
/* 2774 */     ItemStack OreGammaMetroidEggStack = new ItemStack(MyGammaMetroidSpawnBlock);
/*      */     
/* 2776 */     LanguageRegistry.instance().addNameForObject(MyGammaMetroidSpawnBlock, "en_US", "Ancient Dried WTF? Spawn Egg");
/* 2777 */     GameRegistry.addShapelessRecipe(new ItemStack(GammaMetroidEgg), new Object[] { new ItemStack(Items.field_151131_as), OreGammaMetroidEggStack });
/*      */     
/* 2779 */     ItemStack OreCockateilEggStack = new ItemStack(MyCockateilSpawnBlock);
/*      */     
/* 2781 */     LanguageRegistry.instance().addNameForObject(MyCockateilSpawnBlock, "en_US", "Ancient Dried Bird Spawn Egg");
/* 2782 */     GameRegistry.addShapelessRecipe(new ItemStack(CockateilEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCockateilEggStack });
/*      */     
/* 2784 */     ItemStack OreKyuubiEggStack = new ItemStack(MyKyuubiSpawnBlock);
/*      */     
/* 2786 */     LanguageRegistry.instance().addNameForObject(MyKyuubiSpawnBlock, "en_US", "Ancient Dried Kyuubi Spawn Egg");
/* 2787 */     GameRegistry.addShapelessRecipe(new ItemStack(KyuubiEgg), new Object[] { new ItemStack(Items.field_151131_as), OreKyuubiEggStack });
/*      */     
/* 2789 */     ItemStack OreAlienEggStack = new ItemStack(MyAlienSpawnBlock);
/*      */     
/* 2791 */     LanguageRegistry.instance().addNameForObject(MyAlienSpawnBlock, "en_US", "Ancient Dried Alien Spawn Egg");
/* 2792 */     GameRegistry.addShapelessRecipe(new ItemStack(AlienEgg), new Object[] { new ItemStack(Items.field_151131_as), OreAlienEggStack });
/*      */     
/* 2794 */     ItemStack OreAttackSquidEggStack = new ItemStack(MyAttackSquidSpawnBlock);
/*      */     
/* 2796 */     LanguageRegistry.instance().addNameForObject(MyAttackSquidSpawnBlock, "en_US", "Ancient Dried Attack Squid Spawn Egg");
/* 2797 */     GameRegistry.addShapelessRecipe(new ItemStack(AttackSquidEgg), new Object[] { new ItemStack(Items.field_151131_as), OreAttackSquidEggStack });
/*      */     
/* 2799 */     ItemStack OreWaterDragonEggStack = new ItemStack(MyWaterDragonSpawnBlock);
/*      */     
/* 2801 */     LanguageRegistry.instance().addNameForObject(MyWaterDragonSpawnBlock, "en_US", "Ancient Dried WaterDragon Spawn Egg");
/* 2802 */     GameRegistry.addShapelessRecipe(new ItemStack(WaterDragonEgg), new Object[] { new ItemStack(Items.field_151131_as), OreWaterDragonEggStack });
/*      */     
/* 2804 */     ItemStack OreKrakenEggStack = new ItemStack(MyKrakenSpawnBlock);
/*      */     
/* 2806 */     LanguageRegistry.instance().addNameForObject(MyKrakenSpawnBlock, "en_US", "Ancient Dried Kraken Spawn Egg");
/* 2807 */     GameRegistry.addShapelessRecipe(new ItemStack(KrakenEgg), new Object[] { new ItemStack(Items.field_151131_as), OreKrakenEggStack });
/*      */     
/* 2809 */     ItemStack OreLizardEggStack = new ItemStack(MyLizardSpawnBlock);
/*      */     
/* 2811 */     LanguageRegistry.instance().addNameForObject(MyLizardSpawnBlock, "en_US", "Ancient Dried Lizard Spawn Egg");
/* 2812 */     GameRegistry.addShapelessRecipe(new ItemStack(LizardEgg), new Object[] { new ItemStack(Items.field_151131_as), OreLizardEggStack });
/*      */     
/* 2814 */     ItemStack OreCephadromeEggStack = new ItemStack(MyCephadromeSpawnBlock);
/*      */     
/* 2816 */     LanguageRegistry.instance().addNameForObject(MyCephadromeSpawnBlock, "en_US", "Ancient Dried Cephadrome Spawn Egg");
/* 2817 */     GameRegistry.addShapelessRecipe(new ItemStack(CephadromeEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCephadromeEggStack });
/*      */     
/* 2819 */     ItemStack OreDragonEggStack = new ItemStack(MyDragonSpawnBlock);
/*      */     
/* 2821 */     LanguageRegistry.instance().addNameForObject(MyDragonSpawnBlock, "en_US", "Ancient Dried Dragon Spawn Egg");
/* 2822 */     GameRegistry.addShapelessRecipe(new ItemStack(DragonEgg), new Object[] { new ItemStack(Items.field_151131_as), OreDragonEggStack });
/*      */     
/* 2824 */     ItemStack OreBeeEggStack = new ItemStack(MyBeeSpawnBlock);
/*      */     
/* 2826 */     LanguageRegistry.instance().addNameForObject(MyBeeSpawnBlock, "en_US", "Ancient Dried Bee Spawn Egg");
/* 2827 */     GameRegistry.addShapelessRecipe(new ItemStack(BeeEgg), new Object[] { new ItemStack(Items.field_151131_as), OreBeeEggStack });
/*      */     
/* 2829 */     ItemStack OreHorseEggStack = new ItemStack(MyHorseSpawnBlock);
/*      */     
/* 2831 */     LanguageRegistry.instance().addNameForObject(MyHorseSpawnBlock, "en_US", "Ancient Dried Horse Spawn Egg");
/* 2832 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151063_bx, 1, 100), new Object[] { new ItemStack(Items.field_151131_as), OreHorseEggStack });
/*      */     
/* 2834 */     ItemStack OreTrooperBugEggStack = new ItemStack(MyTrooperBugSpawnBlock);
/*      */     
/* 2836 */     LanguageRegistry.instance().addNameForObject(MyTrooperBugSpawnBlock, "en_US", "Ancient Dried Jumpy Bug Spawn Egg");
/* 2837 */     GameRegistry.addShapelessRecipe(new ItemStack(TrooperBugEgg), new Object[] { new ItemStack(Items.field_151131_as), OreTrooperBugEggStack });
/*      */     
/* 2839 */     ItemStack OreSpitBugEggStack = new ItemStack(MySpitBugSpawnBlock);
/*      */     
/* 2841 */     LanguageRegistry.instance().addNameForObject(MySpitBugSpawnBlock, "en_US", "Ancient Dried Spit Bug Spawn Egg");
/* 2842 */     GameRegistry.addShapelessRecipe(new ItemStack(SpitBugEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSpitBugEggStack });
/*      */     
/* 2844 */     ItemStack OreStinkBugEggStack = new ItemStack(MyStinkBugSpawnBlock);
/*      */     
/* 2846 */     LanguageRegistry.instance().addNameForObject(MyStinkBugSpawnBlock, "en_US", "Ancient Dried Stink Bug Spawn Egg");
/* 2847 */     GameRegistry.addShapelessRecipe(new ItemStack(StinkBugEgg), new Object[] { new ItemStack(Items.field_151131_as), OreStinkBugEggStack });
/*      */     
/* 2849 */     ItemStack OreOstrichEggStack = new ItemStack(MyOstrichSpawnBlock);
/*      */     
/* 2851 */     LanguageRegistry.instance().addNameForObject(MyOstrichSpawnBlock, "en_US", "Ancient Dried Ostrich Spawn Egg");
/* 2852 */     GameRegistry.addShapelessRecipe(new ItemStack(OstrichEgg), new Object[] { new ItemStack(Items.field_151131_as), OreOstrichEggStack });
/*      */     
/* 2854 */     ItemStack OreGazelleEggStack = new ItemStack(MyGazelleSpawnBlock);
/*      */     
/* 2856 */     LanguageRegistry.instance().addNameForObject(MyGazelleSpawnBlock, "en_US", "Ancient Dried Gazelle Spawn Egg");
/* 2857 */     GameRegistry.addShapelessRecipe(new ItemStack(GazelleEgg), new Object[] { new ItemStack(Items.field_151131_as), OreGazelleEggStack });
/*      */     
/* 2859 */     ItemStack OreChipmunkEggStack = new ItemStack(MyChipmunkSpawnBlock);
/*      */     
/* 2861 */     LanguageRegistry.instance().addNameForObject(MyChipmunkSpawnBlock, "en_US", "Ancient Dried Chipmunk Spawn Egg");
/* 2862 */     GameRegistry.addShapelessRecipe(new ItemStack(ChipmunkEgg), new Object[] { new ItemStack(Items.field_151131_as), OreChipmunkEggStack });
/*      */ 
/*      */     
/* 2865 */     LanguageRegistry.instance().addNameForObject(MyCreepingHorrorSpawnBlock, "en_US", "Ancient Dried Creeping Horror Spawn Egg");
/* 2866 */     ItemStack OreCreepingHorrorEggStack = new ItemStack(MyCreepingHorrorSpawnBlock);
/* 2867 */     GameRegistry.addShapelessRecipe(new ItemStack(CreepingHorrorEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCreepingHorrorEggStack });
/*      */ 
/*      */     
/* 2870 */     LanguageRegistry.instance().addNameForObject(MyTerribleTerrorSpawnBlock, "en_US", "Ancient Dried Terrible Terror Spawn Egg");
/* 2871 */     ItemStack OreTerribleTerrorEggStack = new ItemStack(MyTerribleTerrorSpawnBlock);
/* 2872 */     GameRegistry.addShapelessRecipe(new ItemStack(TerribleTerrorEgg), new Object[] { new ItemStack(Items.field_151131_as), OreTerribleTerrorEggStack });
/*      */ 
/*      */     
/* 2875 */     LanguageRegistry.instance().addNameForObject(MyCliffRacerSpawnBlock, "en_US", "Ancient Dried Cliff Racer Spawn Egg");
/* 2876 */     ItemStack OreCliffRacerEggStack = new ItemStack(MyCliffRacerSpawnBlock);
/* 2877 */     GameRegistry.addShapelessRecipe(new ItemStack(CliffRacerEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCliffRacerEggStack });
/*      */ 
/*      */     
/* 2880 */     LanguageRegistry.instance().addNameForObject(MyTriffidSpawnBlock, "en_US", "Ancient Dried Triffid Spawn Egg");
/* 2881 */     ItemStack OreTriffidEggStack = new ItemStack(MyTriffidSpawnBlock);
/* 2882 */     GameRegistry.addShapelessRecipe(new ItemStack(TriffidEgg), new Object[] { new ItemStack(Items.field_151131_as), OreTriffidEggStack });
/*      */ 
/*      */     
/* 2885 */     LanguageRegistry.instance().addNameForObject(MyPitchBlackSpawnBlock, "en_US", "Ancient Dried Nightmare Spawn Egg");
/* 2886 */     ItemStack OrePitchBlackEggStack = new ItemStack(MyPitchBlackSpawnBlock);
/* 2887 */     GameRegistry.addShapelessRecipe(new ItemStack(PitchBlackEgg), new Object[] { new ItemStack(Items.field_151131_as), OrePitchBlackEggStack });
/*      */ 
/*      */     
/* 2890 */     LanguageRegistry.instance().addNameForObject(MyLurkingTerrorSpawnBlock, "en_US", "Ancient Dried Lurking Terror Spawn Egg");
/* 2891 */     ItemStack OreLurkingTerrorEggStack = new ItemStack(MyLurkingTerrorSpawnBlock);
/* 2892 */     GameRegistry.addShapelessRecipe(new ItemStack(LurkingTerrorEgg), new Object[] { new ItemStack(Items.field_151131_as), OreLurkingTerrorEggStack });
/*      */ 
/*      */     
/* 2895 */     LanguageRegistry.instance().addNameForObject(MyEnderKnightSpawnBlock, "en_US", "Ancient Dried Ender Knight Spawn Egg");
/* 2896 */     ItemStack OreEnderKnightEggStack = new ItemStack(MyEnderKnightSpawnBlock);
/* 2897 */     GameRegistry.addShapelessRecipe(new ItemStack(EnderKnightEgg), new Object[] { new ItemStack(Items.field_151131_as), OreEnderKnightEggStack });
/*      */ 
/*      */     
/* 2900 */     LanguageRegistry.instance().addNameForObject(MyEnderReaperSpawnBlock, "en_US", "Ancient Dried Ender Reaper Spawn Egg");
/* 2901 */     ItemStack OreEnderReaperEggStack = new ItemStack(MyEnderReaperSpawnBlock);
/* 2902 */     GameRegistry.addShapelessRecipe(new ItemStack(EnderReaperEgg), new Object[] { new ItemStack(Items.field_151131_as), OreEnderReaperEggStack });
/*      */ 
/*      */     
/* 2905 */     LanguageRegistry.instance().addNameForObject(MyGodzillaPartSpawnBlock, "en_US", "Ancient Dried Mobzilla Spawn Egg Part");
/* 2906 */     ItemStack OreGodzillaPartEggStack = new ItemStack(MyGodzillaPartSpawnBlock);
/* 2907 */     GameRegistry.addShapelessRecipe(new ItemStack(MyGodzillaSpawnBlock), new Object[] { OreGodzillaPartEggStack, OreGodzillaPartEggStack, OreGodzillaPartEggStack, OreGodzillaPartEggStack, OreGodzillaPartEggStack, OreGodzillaPartEggStack, OreGodzillaPartEggStack, OreGodzillaPartEggStack, OreGodzillaPartEggStack });
/*      */ 
/*      */ 
/*      */     
/* 2911 */     LanguageRegistry.instance().addNameForObject(MyGodzillaSpawnBlock, "en_US", "Ancient Dried Mobzilla Spawn Egg");
/* 2912 */     ItemStack OreGodzillaEggStack = new ItemStack(MyGodzillaSpawnBlock);
/* 2913 */     GameRegistry.addShapelessRecipe(new ItemStack(GodzillaEgg), new Object[] { new ItemStack(Items.field_151131_as), OreGodzillaEggStack });
/*      */ 
/*      */     
/* 2916 */     LanguageRegistry.instance().addNameForObject(MyTheKingPartSpawnBlock, "en_US", "Ancient Dried The King Spawn Egg Part");
/* 2917 */     ItemStack OreTheKingPartEggStack = new ItemStack(MyTheKingPartSpawnBlock);
/* 2918 */     GameRegistry.addShapelessRecipe(new ItemStack(MyTheKingSpawnBlock), new Object[] { OreTheKingPartEggStack, OreTheKingPartEggStack, OreTheKingPartEggStack, OreTheKingPartEggStack, OreTheKingPartEggStack, OreTheKingPartEggStack, OreTheKingPartEggStack, OreTheKingPartEggStack, OreTheKingPartEggStack });
/*      */ 
/*      */ 
/*      */     
/* 2922 */     LanguageRegistry.instance().addNameForObject(MyTheKingSpawnBlock, "en_US", "Ancient Dried The King Spawn Egg");
/* 2923 */     ItemStack OreTheKingEggStack = new ItemStack(MyTheKingSpawnBlock);
/* 2924 */     GameRegistry.addShapelessRecipe(new ItemStack(TheKingEgg), new Object[] { new ItemStack(Items.field_151131_as), OreTheKingEggStack });
/*      */ 
/*      */     
/* 2927 */     LanguageRegistry.instance().addNameForObject(MyTheQueenPartSpawnBlock, "en_US", "Ancient Dried The Queen Spawn Egg Part");
/* 2928 */     ItemStack OreTheQueenPartEggStack = new ItemStack(MyTheQueenPartSpawnBlock);
/* 2929 */     GameRegistry.addShapelessRecipe(new ItemStack(MyTheQueenSpawnBlock), new Object[] { OreTheQueenPartEggStack, OreTheQueenPartEggStack, OreTheQueenPartEggStack, OreTheQueenPartEggStack, OreTheQueenPartEggStack, OreTheQueenPartEggStack, OreTheQueenPartEggStack, OreTheQueenPartEggStack, OreTheQueenPartEggStack });
/*      */ 
/*      */ 
/*      */     
/* 2933 */     LanguageRegistry.instance().addNameForObject(MyTheQueenSpawnBlock, "en_US", "Ancient Dried The Queen Spawn Egg");
/* 2934 */     ItemStack OreTheQueenEggStack = new ItemStack(MyTheQueenSpawnBlock);
/* 2935 */     GameRegistry.addShapelessRecipe(new ItemStack(TheQueenEgg), new Object[] { new ItemStack(Items.field_151131_as), OreTheQueenEggStack });
/*      */ 
/*      */     
/* 2938 */     LanguageRegistry.instance().addNameForObject(MySmallWormSpawnBlock, "en_US", "Ancient Dried Small Worm Spawn Egg");
/* 2939 */     ItemStack OreSmallWormEggStack = new ItemStack(MySmallWormSpawnBlock);
/* 2940 */     GameRegistry.addShapelessRecipe(new ItemStack(SmallWormEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSmallWormEggStack });
/*      */ 
/*      */     
/* 2943 */     LanguageRegistry.instance().addNameForObject(MyMediumWormSpawnBlock, "en_US", "Ancient Dried Medium Worm Spawn Egg");
/* 2944 */     ItemStack OreMediumWormEggStack = new ItemStack(MyMediumWormSpawnBlock);
/* 2945 */     GameRegistry.addShapelessRecipe(new ItemStack(MediumWormEgg), new Object[] { new ItemStack(Items.field_151131_as), OreMediumWormEggStack });
/*      */ 
/*      */     
/* 2948 */     LanguageRegistry.instance().addNameForObject(MyLargeWormSpawnBlock, "en_US", "Ancient Dried Large Worm Spawn Egg");
/* 2949 */     ItemStack OreLargeWormEggStack = new ItemStack(MyLargeWormSpawnBlock);
/* 2950 */     GameRegistry.addShapelessRecipe(new ItemStack(LargeWormEgg), new Object[] { new ItemStack(Items.field_151131_as), OreLargeWormEggStack });
/*      */ 
/*      */     
/* 2953 */     LanguageRegistry.instance().addNameForObject(MyCassowarySpawnBlock, "en_US", "Ancient Dried Cassowary Spawn Egg");
/* 2954 */     ItemStack OreCassowaryEggStack = new ItemStack(MyCassowarySpawnBlock);
/* 2955 */     GameRegistry.addShapelessRecipe(new ItemStack(CassowaryEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCassowaryEggStack });
/*      */ 
/*      */     
/* 2958 */     LanguageRegistry.instance().addNameForObject(MyCloudSharkSpawnBlock, "en_US", "Ancient Dried Cloud Shark Spawn Egg");
/* 2959 */     ItemStack OreCloudSharkEggStack = new ItemStack(MyCloudSharkSpawnBlock);
/* 2960 */     GameRegistry.addShapelessRecipe(new ItemStack(CloudSharkEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCloudSharkEggStack });
/*      */ 
/*      */     
/* 2963 */     LanguageRegistry.instance().addNameForObject(MyGoldFishSpawnBlock, "en_US", "Ancient Dried Gold Fish Spawn Egg");
/* 2964 */     ItemStack OreGoldFishEggStack = new ItemStack(MyGoldFishSpawnBlock);
/* 2965 */     GameRegistry.addShapelessRecipe(new ItemStack(GoldFishEgg), new Object[] { new ItemStack(Items.field_151131_as), OreGoldFishEggStack });
/*      */ 
/*      */     
/* 2968 */     LanguageRegistry.instance().addNameForObject(MyLeafMonsterSpawnBlock, "en_US", "Ancient Dried Leaf Monster Spawn Egg");
/* 2969 */     ItemStack OreLeafMonsterEggStack = new ItemStack(MyLeafMonsterSpawnBlock);
/* 2970 */     GameRegistry.addShapelessRecipe(new ItemStack(LeafMonsterEgg), new Object[] { new ItemStack(Items.field_151131_as), OreLeafMonsterEggStack });
/*      */ 
/*      */     
/* 2973 */     LanguageRegistry.instance().addNameForObject(MyTshirtSpawnBlock, "en_US", "Ancient Dried T-Shirt Spawn Egg");
/* 2974 */     ItemStack OreTshirtEggStack = new ItemStack(MyTshirtSpawnBlock);
/* 2975 */     GameRegistry.addShapelessRecipe(new ItemStack(TshirtEgg), new Object[] { new ItemStack(Items.field_151131_as), OreTshirtEggStack });
/*      */ 
/*      */     
/* 2978 */     LanguageRegistry.instance().addNameForObject(MyBeaverSpawnBlock, "en_US", "Ancient Dried Beaver Spawn Egg");
/* 2979 */     ItemStack OreBeaverEggStack = new ItemStack(MyBeaverSpawnBlock);
/* 2980 */     GameRegistry.addShapelessRecipe(new ItemStack(BeaverEgg), new Object[] { new ItemStack(Items.field_151131_as), OreBeaverEggStack });
/*      */ 
/*      */     
/* 2983 */     LanguageRegistry.instance().addNameForObject(MyUrchinSpawnBlock, "en_US", "Ancient Dried Urchin Spawn Egg");
/* 2984 */     ItemStack OreUrchinEggStack = new ItemStack(MyUrchinSpawnBlock);
/* 2985 */     GameRegistry.addShapelessRecipe(new ItemStack(UrchinEgg), new Object[] { new ItemStack(Items.field_151131_as), OreUrchinEggStack });
/*      */ 
/*      */     
/* 2988 */     LanguageRegistry.instance().addNameForObject(MyFlounderSpawnBlock, "en_US", "Ancient Dried Flounder Spawn Egg");
/* 2989 */     ItemStack OreFlounderEggStack = new ItemStack(MyFlounderSpawnBlock);
/* 2990 */     GameRegistry.addShapelessRecipe(new ItemStack(FlounderEgg), new Object[] { new ItemStack(Items.field_151131_as), OreFlounderEggStack });
/*      */ 
/*      */     
/* 2993 */     LanguageRegistry.instance().addNameForObject(MySkateSpawnBlock, "en_US", "Ancient Dried Skate Spawn Egg");
/* 2994 */     ItemStack OreSkateEggStack = new ItemStack(MySkateSpawnBlock);
/* 2995 */     GameRegistry.addShapelessRecipe(new ItemStack(SkateEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSkateEggStack });
/*      */ 
/*      */     
/* 2998 */     LanguageRegistry.instance().addNameForObject(MyRotatorSpawnBlock, "en_US", "Ancient Dried Rotator Spawn Egg");
/* 2999 */     ItemStack OreRotatorEggStack = new ItemStack(MyRotatorSpawnBlock);
/* 3000 */     GameRegistry.addShapelessRecipe(new ItemStack(RotatorEgg), new Object[] { new ItemStack(Items.field_151131_as), OreRotatorEggStack });
/*      */ 
/*      */     
/* 3003 */     LanguageRegistry.instance().addNameForObject(MyPeacockSpawnBlock, "en_US", "Ancient Dried Peacock Spawn Egg");
/* 3004 */     ItemStack OrePeacockEggStack = new ItemStack(MyPeacockSpawnBlock);
/* 3005 */     GameRegistry.addShapelessRecipe(new ItemStack(PeacockEgg), new Object[] { new ItemStack(Items.field_151131_as), OrePeacockEggStack });
/*      */ 
/*      */     
/* 3008 */     LanguageRegistry.instance().addNameForObject(MyFairySpawnBlock, "en_US", "Ancient Dried Fairy Spawn Egg");
/* 3009 */     ItemStack OreFairyEggStack = new ItemStack(MyFairySpawnBlock);
/* 3010 */     GameRegistry.addShapelessRecipe(new ItemStack(FairyEgg), new Object[] { new ItemStack(Items.field_151131_as), OreFairyEggStack });
/*      */ 
/*      */     
/* 3013 */     LanguageRegistry.instance().addNameForObject(MyDungeonBeastSpawnBlock, "en_US", "Ancient Dried Dungeon Beast Spawn Egg");
/* 3014 */     ItemStack OreDungeonBeastEggStack = new ItemStack(MyDungeonBeastSpawnBlock);
/* 3015 */     GameRegistry.addShapelessRecipe(new ItemStack(DungeonBeastEgg), new Object[] { new ItemStack(Items.field_151131_as), OreDungeonBeastEggStack });
/*      */ 
/*      */     
/* 3018 */     LanguageRegistry.instance().addNameForObject(MyVortexSpawnBlock, "en_US", "Ancient Dried Vortex Spawn Egg");
/* 3019 */     ItemStack OreVortexEggStack = new ItemStack(MyVortexSpawnBlock);
/* 3020 */     GameRegistry.addShapelessRecipe(new ItemStack(VortexEgg), new Object[] { new ItemStack(Items.field_151131_as), OreVortexEggStack });
/*      */ 
/*      */     
/* 3023 */     LanguageRegistry.instance().addNameForObject(MyRatSpawnBlock, "en_US", "Ancient Dried Rat Spawn Egg");
/* 3024 */     ItemStack OreRatEggStack = new ItemStack(MyRatSpawnBlock);
/* 3025 */     GameRegistry.addShapelessRecipe(new ItemStack(RatEgg), new Object[] { new ItemStack(Items.field_151131_as), OreRatEggStack });
/*      */ 
/*      */     
/* 3028 */     LanguageRegistry.instance().addNameForObject(MyWhaleSpawnBlock, "en_US", "Ancient Dried Whale Spawn Egg");
/* 3029 */     ItemStack OreWhaleEggStack = new ItemStack(MyWhaleSpawnBlock);
/* 3030 */     GameRegistry.addShapelessRecipe(new ItemStack(WhaleEgg), new Object[] { new ItemStack(Items.field_151131_as), OreWhaleEggStack });
/*      */ 
/*      */     
/* 3033 */     LanguageRegistry.instance().addNameForObject(MyIrukandjiSpawnBlock, "en_US", "Ancient Dried Irukandji Spawn Egg");
/* 3034 */     ItemStack OreIrukandjiEggStack = new ItemStack(MyIrukandjiSpawnBlock);
/* 3035 */     GameRegistry.addShapelessRecipe(new ItemStack(IrukandjiEgg), new Object[] { new ItemStack(Items.field_151131_as), OreIrukandjiEggStack });
/*      */ 
/*      */     
/* 3038 */     LanguageRegistry.instance().addNameForObject(MyTRexSpawnBlock, "en_US", "Ancient Dried T. Rex Spawn Egg");
/* 3039 */     ItemStack OreTRexEggStack = new ItemStack(MyTRexSpawnBlock);
/* 3040 */     GameRegistry.addShapelessRecipe(new ItemStack(TRexEgg), new Object[] { new ItemStack(Items.field_151131_as), OreTRexEggStack });
/*      */ 
/*      */     
/* 3043 */     LanguageRegistry.instance().addNameForObject(MyHerculesSpawnBlock, "en_US", "Ancient Dried Hercules Beetle Spawn Egg");
/* 3044 */     ItemStack OreHerculesEggStack = new ItemStack(MyHerculesSpawnBlock);
/* 3045 */     GameRegistry.addShapelessRecipe(new ItemStack(HerculesEgg), new Object[] { new ItemStack(Items.field_151131_as), OreHerculesEggStack });
/*      */ 
/*      */     
/* 3048 */     LanguageRegistry.instance().addNameForObject(MyMantisSpawnBlock, "en_US", "Ancient Dried Mantis Spawn Egg");
/* 3049 */     ItemStack OreMantisEggStack = new ItemStack(MyMantisSpawnBlock);
/* 3050 */     GameRegistry.addShapelessRecipe(new ItemStack(MantisEgg), new Object[] { new ItemStack(Items.field_151131_as), OreMantisEggStack });
/*      */ 
/*      */     
/* 3053 */     LanguageRegistry.instance().addNameForObject(MyStinkySpawnBlock, "en_US", "Ancient Dried Stinky Spawn Egg");
/* 3054 */     ItemStack OreStinkyEggStack = new ItemStack(MyStinkySpawnBlock);
/* 3055 */     GameRegistry.addShapelessRecipe(new ItemStack(StinkyEgg), new Object[] { new ItemStack(Items.field_151131_as), OreStinkyEggStack });
/*      */ 
/*      */     
/* 3058 */     LanguageRegistry.instance().addNameForObject(MyEasterBunnySpawnBlock, "en_US", "Ancient Dried Easter Bunny Spawn Egg");
/* 3059 */     ItemStack OreEasterBunnyEggStack = new ItemStack(MyEasterBunnySpawnBlock);
/* 3060 */     GameRegistry.addShapelessRecipe(new ItemStack(EasterBunnyEgg), new Object[] { new ItemStack(Items.field_151131_as), OreEasterBunnyEggStack });
/*      */ 
/*      */     
/* 3063 */     LanguageRegistry.instance().addNameForObject(MyCriminalSpawnBlock, "en_US", "Ancient Dried Criminal Spawn Egg");
/* 3064 */     ItemStack OreCriminalEggStack = new ItemStack(MyCriminalSpawnBlock);
/* 3065 */     GameRegistry.addShapelessRecipe(new ItemStack(CriminalEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCriminalEggStack });
/*      */ 
/*      */     
/* 3068 */     LanguageRegistry.instance().addNameForObject(MyBrutalflySpawnBlock, "en_US", "Ancient Dried Brutalfly Spawn Egg");
/* 3069 */     ItemStack OreBrutalflyEggStack = new ItemStack(MyBrutalflySpawnBlock);
/* 3070 */     GameRegistry.addShapelessRecipe(new ItemStack(BrutalflyEgg), new Object[] { new ItemStack(Items.field_151131_as), OreBrutalflyEggStack });
/*      */ 
/*      */     
/* 3073 */     LanguageRegistry.instance().addNameForObject(MyNastysaurusSpawnBlock, "en_US", "Ancient Dried Nastysaurus Spawn Egg");
/* 3074 */     ItemStack OreNastysaurusEggStack = new ItemStack(MyNastysaurusSpawnBlock);
/* 3075 */     GameRegistry.addShapelessRecipe(new ItemStack(NastysaurusEgg), new Object[] { new ItemStack(Items.field_151131_as), OreNastysaurusEggStack });
/*      */ 
/*      */     
/* 3078 */     LanguageRegistry.instance().addNameForObject(MyPointysaurusSpawnBlock, "en_US", "Ancient Dried Pointysaurus Spawn Egg");
/* 3079 */     ItemStack OrePointysaurusEggStack = new ItemStack(MyPointysaurusSpawnBlock);
/* 3080 */     GameRegistry.addShapelessRecipe(new ItemStack(PointysaurusEgg), new Object[] { new ItemStack(Items.field_151131_as), OrePointysaurusEggStack });
/*      */ 
/*      */     
/* 3083 */     LanguageRegistry.instance().addNameForObject(MyCricketSpawnBlock, "en_US", "Ancient Dried Cricket Spawn Egg");
/* 3084 */     ItemStack OreCricketEggStack = new ItemStack(MyCricketSpawnBlock);
/* 3085 */     GameRegistry.addShapelessRecipe(new ItemStack(CricketEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCricketEggStack });
/*      */ 
/*      */     
/* 3088 */     LanguageRegistry.instance().addNameForObject(MyFrogSpawnBlock, "en_US", "Ancient Dried Frog Spawn Egg");
/* 3089 */     ItemStack OreFrogEggStack = new ItemStack(MyFrogSpawnBlock);
/* 3090 */     GameRegistry.addShapelessRecipe(new ItemStack(FrogEgg), new Object[] { new ItemStack(Items.field_151131_as), OreFrogEggStack });
/*      */ 
/*      */     
/* 3093 */     LanguageRegistry.instance().addNameForObject(MySpiderDriverSpawnBlock, "en_US", "Ancient Dried Spider Driver Spawn Egg");
/* 3094 */     ItemStack OreSpiderDriverEggStack = new ItemStack(MySpiderDriverSpawnBlock);
/* 3095 */     GameRegistry.addShapelessRecipe(new ItemStack(SpiderDriverEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSpiderDriverEggStack });
/*      */ 
/*      */     
/* 3098 */     LanguageRegistry.instance().addNameForObject(MyCrabSpawnBlock, "en_US", "Ancient Dried Crab Spawn Egg");
/* 3099 */     ItemStack OreCrabEggStack = new ItemStack(MyCrabSpawnBlock);
/* 3100 */     GameRegistry.addShapelessRecipe(new ItemStack(CrabEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCrabEggStack });
/*      */ 
/*      */     
/* 3103 */     LanguageRegistry.instance().addNameForObject(MyCaterKillerSpawnBlock, "en_US", "Ancient Dried CaterKiller Spawn Egg");
/* 3104 */     ItemStack OreCaterKillerEggStack = new ItemStack(MyCaterKillerSpawnBlock);
/* 3105 */     GameRegistry.addShapelessRecipe(new ItemStack(CaterKillerEgg), new Object[] { new ItemStack(Items.field_151131_as), OreCaterKillerEggStack });
/*      */ 
/*      */     
/* 3108 */     LanguageRegistry.instance().addNameForObject(MyMolenoidSpawnBlock, "en_US", "Ancient Dried Molenoid Spawn Egg");
/* 3109 */     ItemStack OreMolenoidEggStack = new ItemStack(MyMolenoidSpawnBlock);
/* 3110 */     GameRegistry.addShapelessRecipe(new ItemStack(MolenoidEgg), new Object[] { new ItemStack(Items.field_151131_as), OreMolenoidEggStack });
/*      */ 
/*      */     
/* 3113 */     LanguageRegistry.instance().addNameForObject(MySeaMonsterSpawnBlock, "en_US", "Ancient Dried Sea Monster Spawn Egg");
/* 3114 */     ItemStack OreSeaMonsterEggStack = new ItemStack(MySeaMonsterSpawnBlock);
/* 3115 */     GameRegistry.addShapelessRecipe(new ItemStack(SeaMonsterEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSeaMonsterEggStack });
/*      */ 
/*      */     
/* 3118 */     LanguageRegistry.instance().addNameForObject(MySeaViperSpawnBlock, "en_US", "Ancient Dried Sea Viper Spawn Egg");
/* 3119 */     ItemStack OreSeaViperEggStack = new ItemStack(MySeaViperSpawnBlock);
/* 3120 */     GameRegistry.addShapelessRecipe(new ItemStack(SeaViperEgg), new Object[] { new ItemStack(Items.field_151131_as), OreSeaViperEggStack });
/*      */ 
/*      */     
/* 3123 */     LanguageRegistry.instance().addNameForObject(MyRubberDuckySpawnBlock, "en_US", "Ancient Dried Rubber Ducky Spawn Egg");
/* 3124 */     ItemStack OreRubberDuckyEggStack = new ItemStack(MyRubberDuckySpawnBlock);
/* 3125 */     GameRegistry.addShapelessRecipe(new ItemStack(RubberDuckyEgg), new Object[] { new ItemStack(Items.field_151131_as), OreRubberDuckyEggStack });
/*      */ 
/*      */     
/* 3128 */     LanguageRegistry.instance().addNameForObject(MyHammerheadSpawnBlock, "en_US", "Ancient Dried Hammerhead Spawn Egg");
/* 3129 */     ItemStack OreHammerheadEggStack = new ItemStack(MyHammerheadSpawnBlock);
/* 3130 */     GameRegistry.addShapelessRecipe(new ItemStack(HammerheadEgg), new Object[] { new ItemStack(Items.field_151131_as), OreHammerheadEggStack });
/*      */ 
/*      */     
/* 3133 */     LanguageRegistry.instance().addNameForObject(MyLeonSpawnBlock, "en_US", "Ancient Dried Leonopteryx Spawn Egg");
/* 3134 */     ItemStack OreLeonEggStack = new ItemStack(MyLeonSpawnBlock);
/* 3135 */     GameRegistry.addShapelessRecipe(new ItemStack(LeonEgg), new Object[] { new ItemStack(Items.field_151131_as), OreLeonEggStack });
/*      */ 
/*      */     
/* 3138 */     ItemStack OreUraniumStack = new ItemStack(MyOreUraniumBlock);
/*      */     
/* 3140 */     LanguageRegistry.instance().addNameForObject(MyOreUraniumBlock, "en_US", "Uranium Ore");
/*      */     
/* 3142 */     ItemStack OreTitaniumStack = new ItemStack(MyOreTitaniumBlock);
/*      */     
/* 3144 */     LanguageRegistry.instance().addNameForObject(MyOreTitaniumBlock, "en_US", "Titanium Ore");
/*      */     
/* 3146 */     ItemStack OreSaltStack = new ItemStack(MyOreSaltBlock);
/*      */     
/* 3148 */     LanguageRegistry.instance().addNameForObject(MyOreSaltBlock, "en_US", "Salt Ore");
/*      */     
/* 3150 */     ItemStack OreCrystalStoneStack = new ItemStack(CrystalStone);
/*      */     
/* 3152 */     LanguageRegistry.instance().addNameForObject(CrystalStone, "en_US", "Kyanite");
/*      */     
/* 3154 */     ItemStack OreCrystalRatStack = new ItemStack(CrystalRat);
/*      */     
/* 3156 */     LanguageRegistry.instance().addNameForObject(CrystalRat, "en_US", "Crystalized Rats");
/*      */     
/* 3158 */     ItemStack OreRedAntTrollStack = new ItemStack(RedAntTroll);
/*      */     
/* 3160 */     LanguageRegistry.instance().addNameForObject(RedAntTroll, "en_US", "Red Ant Troll Block");
/*      */     
/* 3162 */     ItemStack OreTermiteTrollStack = new ItemStack(TermiteTroll);
/*      */     
/* 3164 */     LanguageRegistry.instance().addNameForObject(TermiteTroll, "en_US", "Termite Troll Block");
/*      */     
/* 3166 */     ItemStack OreCrystalFairyStack = new ItemStack(CrystalFairy);
/*      */     
/* 3168 */     LanguageRegistry.instance().addNameForObject(CrystalFairy, "en_US", "Crystalized Fairies");
/*      */     
/* 3170 */     ItemStack OreCrystalCrystalStack = new ItemStack(CrystalCrystal);
/*      */     
/* 3172 */     LanguageRegistry.instance().addNameForObject(CrystalCrystal, "en_US", "Pink Tourmaline");
/*      */     
/* 3174 */     ItemStack OreTigersEyeStack = new ItemStack(TigersEye);
/*      */     
/* 3176 */     LanguageRegistry.instance().addNameForObject(TigersEye, "en_US", "Tiger's Eye");
/*      */     
/* 3178 */     ItemStack OreCrystalCoalStack = new ItemStack(CrystalCoal);
/*      */     
/* 3180 */     LanguageRegistry.instance().addNameForObject(CrystalCoal, "en_US", "Crystal Energy");
/*      */     
/* 3182 */     ItemStack OreCrystalGrassStack = new ItemStack(CrystalGrass);
/*      */     
/* 3184 */     LanguageRegistry.instance().addNameForObject(CrystalGrass, "en_US", "Crystal Grass");
/*      */     
/* 3186 */     ItemStack OreRubyStack = new ItemStack(MyOreRubyBlock);
/*      */     
/* 3188 */     LanguageRegistry.instance().addNameForObject(MyOreRubyBlock, "en_US", "Ruby Ore");
/*      */     
/* 3190 */     ItemStack OreAmethystStack = new ItemStack(MyOreAmethystBlock);
/*      */     
/* 3192 */     LanguageRegistry.instance().addNameForObject(MyOreAmethystBlock, "en_US", "Amethyst Ore");
/*      */ 
/*      */     
/* 3195 */     ItemStack BlockUraniumStack = new ItemStack(MyBlockUraniumBlock);
/*      */     
/* 3197 */     LanguageRegistry.instance().addNameForObject(MyBlockUraniumBlock, "en_US", "Uranium Block");
/*      */     
/* 3199 */     ItemStack LavafoamStack = new ItemStack(MyLavafoamBlock);
/*      */     
/* 3201 */     LanguageRegistry.instance().addNameForObject(MyLavafoamBlock, "en_US", "Lava Foam");
/*      */     
/* 3203 */     ItemStack BlockTitaniumStack = new ItemStack(MyBlockTitaniumBlock);
/*      */     
/* 3205 */     LanguageRegistry.instance().addNameForObject(MyBlockTitaniumBlock, "en_US", "Titanium Block");
/*      */     
/* 3207 */     ItemStack BlockMobzillaScaleStack = new ItemStack(MyBlockMobzillaScaleBlock);
/*      */     
/* 3209 */     LanguageRegistry.instance().addNameForObject(MyBlockMobzillaScaleBlock, "en_US", "Mobzilla Scale Block");
/*      */     
/* 3211 */     ItemStack BlockRubyStack = new ItemStack(MyBlockRubyBlock);
/*      */     
/* 3213 */     LanguageRegistry.instance().addNameForObject(MyBlockRubyBlock, "en_US", "Ruby Block");
/*      */     
/* 3215 */     ItemStack BlockAmethystStack = new ItemStack(MyBlockAmethystBlock);
/*      */     
/* 3217 */     LanguageRegistry.instance().addNameForObject(MyBlockAmethystBlock, "en_US", "Amethyst Block");
/*      */     
/* 3219 */     ItemStack BlockCrystalPinkStack = new ItemStack(MyCrystalPinkBlock);
/*      */     
/* 3221 */     LanguageRegistry.instance().addNameForObject(MyCrystalPinkBlock, "en_US", "Pink Tourmaline Block");
/*      */     
/* 3223 */     ItemStack BlockTigersEyeStack = new ItemStack(MyTigersEyeBlock);
/*      */     
/* 3225 */     LanguageRegistry.instance().addNameForObject(MyTigersEyeBlock, "en_US", "Tiger's Eye Block");
/*      */     
/* 3227 */     ItemStack EnderPearlStack = new ItemStack(MyEnderPearlBlock);
/*      */     
/* 3229 */     LanguageRegistry.instance().addNameForObject(MyEnderPearlBlock, "en_US", "Ender-Pearl Block");
/*      */     
/* 3231 */     ItemStack EyeOfEnderStack = new ItemStack(MyEyeOfEnderBlock);
/*      */     
/* 3233 */     LanguageRegistry.instance().addNameForObject(MyEyeOfEnderBlock, "en_US", "Eye-of-Ender Block");
/*      */ 
/*      */     
/* 3236 */     LanguageRegistry.instance().addNameForObject(MyRTPBlock, "en_US", "Random Teleport Block");
/*      */ 
/*      */     
/* 3239 */     LanguageRegistry.instance().addNameForObject(MyMoleDirtBlock, "en_US", "Molenoid Dirt");
/*      */     
/* 3241 */     ItemStack CrystalPlanksStack = new ItemStack(CrystalPlanksBlock);
/*      */     
/* 3243 */     LanguageRegistry.instance().addNameForObject(CrystalPlanksBlock, "en_US", "Crystal Planks");
/*      */     
/* 3245 */     ItemStack CrystalWorkbenchStack = new ItemStack(CrystalWorkbenchBlock);
/*      */     
/* 3247 */     LanguageRegistry.instance().addNameForObject(CrystalWorkbenchBlock, "en_US", "Crystal Workbench");
/*      */ 
/*      */     
/* 3250 */     ItemStack CrystalFurnaceStack = new ItemStack((Block)CrystalFurnaceBlock);
/*      */     
/* 3252 */     LanguageRegistry.instance().addNameForObject(CrystalFurnaceBlock, "en_US", "Crystal Furnace");
/*      */     
/* 3254 */     ItemStack CrystalFurnaceOnStack = new ItemStack(CrystalFurnaceOnBlock);
/*      */     
/* 3256 */     LanguageRegistry.instance().addNameForObject(CrystalFurnaceOnBlock, "en_US", "Crystal Furnace");
/*      */     
/* 3258 */     GameRegistry.addShapelessRecipe(new ItemStack(CrystalPlanksBlock, 4), new Object[] { MyCrystalTreeLog });
/* 3259 */     GameRegistry.addShapelessRecipe(new ItemStack(CrystalWorkbenchBlock), new Object[] { CrystalPlanksBlock, CrystalPlanksBlock, CrystalPlanksBlock, CrystalPlanksBlock });
/*      */     
/* 3261 */     GameRegistry.addRecipe(new ItemStack((Block)CrystalFurnaceBlock), new Object[] { "FFF", "F F", "FFF", Character.valueOf('F'), CrystalStone });
/*      */ 
/*      */     
/* 3264 */     GameRegistry.addRecipe(new ItemStack((Block)Blocks.field_150486_ae), new Object[] { "FFF", "F F", "FFF", Character.valueOf('F'), CrystalPlanksBlock });
/*      */ 
/*      */     
/* 3267 */     GameRegistry.addRecipe(new ItemStack(Items.field_151135_aq), new Object[] { "FF ", "FF ", "FF ", Character.valueOf('F'), CrystalPlanksBlock });
/*      */ 
/*      */     
/* 3270 */     GameRegistry.addRecipe(new ItemStack(Items.field_151135_aq), new Object[] { " FF", " FF", " FF", Character.valueOf('F'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3279 */     LanguageRegistry.instance().addNameForObject(MyAntBlock, "en_US", "Ant Nest");
/* 3280 */     LanguageRegistry.instance().addNameForObject(MyRedAntBlock, "en_US", "Red Ant Nest");
/* 3281 */     LanguageRegistry.instance().addNameForObject(MyRainbowAntBlock, "en_US", "Rainbow Ant Nest");
/* 3282 */     LanguageRegistry.instance().addNameForObject(MyUnstableAntBlock, "en_US", "Unstable Ant Nest");
/* 3283 */     LanguageRegistry.instance().addNameForObject(TermiteBlock, "en_US", "Termite Nest");
/* 3284 */     LanguageRegistry.instance().addNameForObject(CrystalTermiteBlock, "en_US", "Crystal Termite Nest");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3290 */     GameRegistry.addSmelting(MyOreUraniumBlock, new ItemStack(UraniumNugget), 0.3F);
/* 3291 */     LanguageRegistry.instance().addNameForObject(MyIngotUranium, "en_US", "Uranium Ingot");
/* 3292 */     GameRegistry.addSmelting(MyOreTitaniumBlock, new ItemStack(TitaniumNugget), 0.3F);
/* 3293 */     LanguageRegistry.instance().addNameForObject(MyIngotTitanium, "en_US", "Titanium Ingot");
/* 3294 */     GameRegistry.addSmelting(MyOreSaltBlock, new ItemStack(MySalt, 8), 0.1F);
/* 3295 */     LanguageRegistry.instance().addNameForObject(MySalt, "en_US", "Salt");
/* 3296 */     GameRegistry.addSmelting(MyCornCob, new ItemStack(MyPopcorn), 0.1F);
/* 3297 */     LanguageRegistry.instance().addNameForObject(MyPopcorn, "en_US", "Popcorn");
/* 3298 */     GameRegistry.addSmelting(MyRawCornDog, new ItemStack(MyCornDog), 0.4F);
/* 3299 */     LanguageRegistry.instance().addNameForObject(MyCornDog, "en_US", "Corn Dog");
/* 3300 */     GameRegistry.addSmelting(MyRawBacon, new ItemStack(MyBacon), 0.2F);
/* 3301 */     LanguageRegistry.instance().addNameForObject(MyBacon, "en_US", "Bacon!");
/* 3302 */     GameRegistry.addSmelting(CrystalCrystal, new ItemStack(MyCrystalPinkIngot), 0.3F);
/* 3303 */     LanguageRegistry.instance().addNameForObject(MyCrystalPinkIngot, "en_US", "Pink Tourmaline Ingot");
/* 3304 */     GameRegistry.addSmelting(TigersEye, new ItemStack(MyTigersEyeIngot), 0.3F);
/* 3305 */     LanguageRegistry.instance().addNameForObject(MyTigersEyeIngot, "en_US", "Tiger's Eye Ingot");
/* 3306 */     GameRegistry.addSmelting(MyRawPeacock, new ItemStack(MyPeacock), 0.4F);
/* 3307 */     LanguageRegistry.instance().addNameForObject(MyPeacock, "en_US", "Cooked Peacock");
/* 3308 */     GameRegistry.addSmelting(MyRawCrabMeat, new ItemStack(MyCrabMeat), 0.2F);
/* 3309 */     LanguageRegistry.instance().addNameForObject(MyCrabMeat, "en_US", "Crab Meat!");
/*      */ 
/*      */     
/* 3312 */     GameRegistry.addSmelting(MyGreenFish, new ItemStack(Items.field_151101_aQ), 0.2F);
/* 3313 */     GameRegistry.addSmelting(MyBlueFish, new ItemStack(Items.field_151101_aQ), 0.2F);
/* 3314 */     GameRegistry.addSmelting(MyPinkFish, new ItemStack(Items.field_151101_aQ), 0.2F);
/* 3315 */     GameRegistry.addSmelting(MyRockFish, new ItemStack(Items.field_151101_aQ), 0.2F);
/* 3316 */     GameRegistry.addSmelting(MyWoodFish, new ItemStack(Items.field_151101_aQ), 0.2F);
/* 3317 */     GameRegistry.addSmelting(MyGreyFish, new ItemStack(Items.field_151101_aQ), 0.2F);
/*      */     
/* 3319 */     LanguageRegistry.instance().addNameForObject(MyRuby, "en_US", "Ruby");
/* 3320 */     LanguageRegistry.instance().addNameForObject(MyAmethyst, "en_US", "Amethyst");
/* 3321 */     LanguageRegistry.instance().addNameForObject(UraniumNugget, "en_US", "Uranium Nugget");
/* 3322 */     LanguageRegistry.instance().addNameForObject(TitaniumNugget, "en_US", "Titanium Nugget");
/*      */ 
/*      */     
/* 3325 */     LanguageRegistry.instance().addNameForObject(MyButter, "en_US", "Butter");
/* 3326 */     LanguageRegistry.instance().addNameForObject(MyButterCandy, "en_US", "Butter Candy!");
/* 3327 */     LanguageRegistry.instance().addNameForObject(MyButteredPopcorn, "en_US", "Buttered Popcorn");
/* 3328 */     LanguageRegistry.instance().addNameForObject(MyButteredSaltedPopcorn, "en_US", "Buttered and Salted Popcorn");
/* 3329 */     LanguageRegistry.instance().addNameForObject(MyPopcornBag, "en_US", "Bag of Popcorn");
/* 3330 */     LanguageRegistry.instance().addNameForObject(MyRawCornDog, "en_US", "Raw Corn Dog");
/* 3331 */     LanguageRegistry.instance().addNameForObject(MyRawBacon, "en_US", "Raw Bacon");
/* 3332 */     LanguageRegistry.instance().addNameForObject(MyRawCrabMeat, "en_US", "Raw Crab Meat");
/* 3333 */     LanguageRegistry.instance().addNameForObject(MySalad, "en_US", "Garden Salad");
/* 3334 */     LanguageRegistry.instance().addNameForObject(MyBLT, "en_US", "BLT Sandwich!");
/* 3335 */     LanguageRegistry.instance().addNameForObject(MyRawPeacock, "en_US", "Raw Peacock");
/* 3336 */     LanguageRegistry.instance().addNameForObject(MyCrabbyPatty, "en_US", "A Crabby Patty!");
/*      */ 
/*      */     
/* 3339 */     LanguageRegistry.instance().addNameForObject(MyUltimateSword, "en_US", "The Ultimate Sword");
/* 3340 */     LanguageRegistry.instance().addNameForObject(MyUltimatePickaxe, "en_US", "The Ultimate Pickaxe");
/* 3341 */     LanguageRegistry.instance().addNameForObject(MyUltimateShovel, "en_US", "The Ultimate Shovel");
/* 3342 */     LanguageRegistry.instance().addNameForObject(MyUltimateHoe, "en_US", "The Ultimate Hoe");
/* 3343 */     LanguageRegistry.instance().addNameForObject(MyUltimateAxe, "en_US", "The Ultimate Axe");
/* 3344 */     LanguageRegistry.instance().addNameForObject(MyUltimateBow, "en_US", "The Ultimate Bow");
/* 3345 */     LanguageRegistry.instance().addNameForObject(MySkateBow, "en_US", "Skate String Bow");
/* 3346 */     LanguageRegistry.instance().addNameForObject(MyUltimateFishingRod, "en_US", "The Ultimate Fishing Rod");
/* 3347 */     LanguageRegistry.instance().addNameForObject(MyNightmareSword, "en_US", "Nightmare Sword");
/* 3348 */     LanguageRegistry.instance().addNameForObject(MyBertha, "en_US", "Big Bertha");
/* 3349 */     LanguageRegistry.instance().addNameForObject(MySlice, "en_US", "Slice");
/* 3350 */     LanguageRegistry.instance().addNameForObject(MyRoyal, "en_US", "Royal Guardian Sword");
/* 3351 */     LanguageRegistry.instance().addNameForObject(MyHammy, "en_US", "Attitude Adjuster");
/* 3352 */     LanguageRegistry.instance().addNameForObject(MyBattleAxe, "en_US", "Battle Axe");
/* 3353 */     LanguageRegistry.instance().addNameForObject(MyChainsaw, "en_US", "Chainsaw");
/* 3354 */     LanguageRegistry.instance().addNameForObject(MyQueenBattleAxe, "en_US", "Queen Scale Battle Axe");
/*      */     
/* 3356 */     GameRegistry.addRecipe(new ItemStack(MyUltimateSword), new Object[] { " T ", " U ", " I ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3361 */     GameRegistry.addRecipe(new ItemStack(MyUltimateSword), new Object[] { "T  ", "U  ", "I  ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3366 */     GameRegistry.addRecipe(new ItemStack(MyUltimateSword), new Object[] { "  T", "  U", "  I", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3371 */     GameRegistry.addRecipe(new ItemStack(MyUltimatePickaxe), new Object[] { "TUT", " U ", " I ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3376 */     GameRegistry.addRecipe(new ItemStack(MyUltimateShovel), new Object[] { " U ", " T ", " I ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3381 */     GameRegistry.addRecipe(new ItemStack(MyUltimateShovel), new Object[] { "U  ", "T  ", "I  ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3386 */     GameRegistry.addRecipe(new ItemStack(MyUltimateShovel), new Object[] { "  U", "  T", "  I", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3391 */     GameRegistry.addRecipe(new ItemStack(MyUltimateHoe), new Object[] { "TU ", " I ", " I ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3396 */     GameRegistry.addRecipe(new ItemStack(MyUltimateAxe), new Object[] { "TU ", "TI ", " I ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3401 */     GameRegistry.addRecipe(new ItemStack(MyUltimateBow), new Object[] { " TS", "I S", " US", Character.valueOf('S'), Items.field_151007_F, Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3407 */     GameRegistry.addRecipe(new ItemStack(MySkateBow), new Object[] { " TS", "T S", " TS", Character.valueOf('S'), Items.field_151007_F, Character.valueOf('T'), CrystalSticks });
/*      */ 
/*      */ 
/*      */     
/* 3411 */     GameRegistry.addRecipe(new ItemStack(MyUltimateFishingRod), new Object[] { "  T", " US", "I S", Character.valueOf('S'), Items.field_151007_F, Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3417 */     GameRegistry.addRecipe(new ItemStack(MyNightmareSword), new Object[] { "ODO", "RTR", "OIO", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('O'), MyNightmareScale, Character.valueOf('D'), Items.field_151045_i, Character.valueOf('R'), Items.field_151137_ax, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3426 */     LanguageRegistry.instance().addNameForObject(MyEmeraldSword, "en_US", "Emerald Sword");
/* 3427 */     LanguageRegistry.instance().addNameForObject(MyEmeraldPickaxe, "en_US", "Emerald Pickaxe");
/* 3428 */     LanguageRegistry.instance().addNameForObject(MyEmeraldShovel, "en_US", "Emerald Shovel");
/* 3429 */     LanguageRegistry.instance().addNameForObject(MyEmeraldHoe, "en_US", "Emerald Hoe");
/* 3430 */     LanguageRegistry.instance().addNameForObject(MyEmeraldAxe, "en_US", "Emerald Axe");
/* 3431 */     LanguageRegistry.instance().addNameForObject(MyExperienceSword, "en_US", "Experience Sword");
/* 3432 */     LanguageRegistry.instance().addNameForObject(MyPoisonSword, "en_US", "Poison Sword");
/* 3433 */     LanguageRegistry.instance().addNameForObject(MyRatSword, "en_US", "Rat Sword");
/* 3434 */     LanguageRegistry.instance().addNameForObject(MyFairySword, "en_US", "Fairy Sword");
/* 3435 */     LanguageRegistry.instance().addNameForObject(MyMantisClaw, "en_US", "Mantis Claw");
/* 3436 */     LanguageRegistry.instance().addNameForObject(MyBigHammer, "en_US", "Big Hammer");
/*      */ 
/*      */     
/* 3439 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldSword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3443 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldSword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3447 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldSword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3451 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldPickaxe), new Object[] { "EEE", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3455 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldShovel), new Object[] { " E ", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3459 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldShovel), new Object[] { "E  ", "I  ", "I  ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3463 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldShovel), new Object[] { "  E", "  I", "  I", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3467 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldHoe), new Object[] { "EE ", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3471 */     GameRegistry.addRecipe(new ItemStack(MyEmeraldAxe), new Object[] { "EE ", "EI ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 3475 */     GameRegistry.addRecipe(new ItemStack(MyExperienceSword), new Object[] { "EEE", "EIE", "EEE", Character.valueOf('I'), MyEmeraldSword, Character.valueOf('E'), Items.field_151062_by });
/*      */ 
/*      */ 
/*      */     
/* 3479 */     GameRegistry.addRecipe(new ItemStack(MyPoisonSword), new Object[] { "EEE", "EIE", "EEE", Character.valueOf('I'), MyEmeraldSword, Character.valueOf('E'), MyDeadStinkBug });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3484 */     GameRegistry.addRecipe(new ItemStack(MyRatSword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalRat });
/*      */ 
/*      */ 
/*      */     
/* 3488 */     GameRegistry.addRecipe(new ItemStack(MyRatSword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalRat });
/*      */ 
/*      */ 
/*      */     
/* 3492 */     GameRegistry.addRecipe(new ItemStack(MyRatSword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalRat });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3497 */     GameRegistry.addRecipe(new ItemStack(MyFairySword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalFairy });
/*      */ 
/*      */ 
/*      */     
/* 3501 */     GameRegistry.addRecipe(new ItemStack(MyFairySword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalFairy });
/*      */ 
/*      */ 
/*      */     
/* 3505 */     GameRegistry.addRecipe(new ItemStack(MyFairySword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalFairy });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3510 */     LanguageRegistry.instance().addNameForObject(MyCrystalWoodSword, "en_US", "Crystal Wood Sword");
/* 3511 */     LanguageRegistry.instance().addNameForObject(MyCrystalWoodPickaxe, "en_US", "Crystal Wood Pickaxe");
/* 3512 */     LanguageRegistry.instance().addNameForObject(MyCrystalWoodShovel, "en_US", "Crystal Wood Shovel");
/* 3513 */     LanguageRegistry.instance().addNameForObject(MyCrystalWoodHoe, "en_US", "Crystal Wood Hoe");
/* 3514 */     LanguageRegistry.instance().addNameForObject(MyCrystalWoodAxe, "en_US", "Crystal Wood Axe");
/*      */     
/* 3516 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodSword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3520 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodSword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3524 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodSword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3528 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodPickaxe), new Object[] { "EEE", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3532 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodShovel), new Object[] { " E ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3536 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodShovel), new Object[] { "E  ", "I  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3540 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodShovel), new Object[] { "  E", "  I", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3544 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodHoe), new Object[] { "EE ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3548 */     GameRegistry.addRecipe(new ItemStack(MyCrystalWoodAxe), new Object[] { "EE ", "EI ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3554 */     GameRegistry.addRecipe(new ItemStack((Block)Blocks.field_150486_ae), new Object[] { "EEE", "E E", "EEE", Character.valueOf('E'), CrystalPlanksBlock });
/*      */ 
/*      */ 
/*      */     
/* 3558 */     LanguageRegistry.instance().addNameForObject(MyCrystalPinkSword, "en_US", "Pink Tourmaline Sword");
/* 3559 */     LanguageRegistry.instance().addNameForObject(MyCrystalPinkPickaxe, "en_US", "Pink Tourmaline Pickaxe");
/* 3560 */     LanguageRegistry.instance().addNameForObject(MyCrystalPinkShovel, "en_US", "Pink Tourmaline Shovel");
/* 3561 */     LanguageRegistry.instance().addNameForObject(MyCrystalPinkHoe, "en_US", "Pink Tourmaline Hoe");
/* 3562 */     LanguageRegistry.instance().addNameForObject(MyCrystalPinkAxe, "en_US", "Pink Tourmaline Axe");
/*      */     
/* 3564 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkSword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3568 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkSword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3572 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkSword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3576 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkPickaxe), new Object[] { "EEE", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3580 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkShovel), new Object[] { " E ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3584 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkShovel), new Object[] { "E  ", "I  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3588 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkShovel), new Object[] { "  E", "  I", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3592 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkHoe), new Object[] { "EE ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3596 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkAxe), new Object[] { "EE ", "EI ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3601 */     GameRegistry.addRecipe(new ItemStack(Items.field_151133_ar), new Object[] { "   ", "I I", " I ", Character.valueOf('I'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 3605 */     LanguageRegistry.instance().addNameForObject(MyTigersEyeSword, "en_US", "Tiger's Eye Sword");
/* 3606 */     LanguageRegistry.instance().addNameForObject(MyTigersEyePickaxe, "en_US", "Tiger's Eye Pickaxe");
/* 3607 */     LanguageRegistry.instance().addNameForObject(MyTigersEyeShovel, "en_US", "Tiger's Eye Shovel");
/* 3608 */     LanguageRegistry.instance().addNameForObject(MyTigersEyeHoe, "en_US", "Tiger's Eye Hoe");
/* 3609 */     LanguageRegistry.instance().addNameForObject(MyTigersEyeAxe, "en_US", "Tiger's Eye Axe");
/*      */     
/* 3611 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeSword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3615 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeSword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3619 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeSword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3623 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyePickaxe), new Object[] { "EEE", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3627 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeShovel), new Object[] { " E ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3631 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeShovel), new Object[] { "E  ", "I  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3635 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeShovel), new Object[] { "  E", "  I", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3639 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeHoe), new Object[] { "EE ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 3643 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeAxe), new Object[] { "EE ", "EI ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3648 */     LanguageRegistry.instance().addNameForObject(MyCrystalStoneSword, "en_US", "Kyanite Sword");
/* 3649 */     LanguageRegistry.instance().addNameForObject(MyCrystalStonePickaxe, "en_US", "Kyanite Pickaxe");
/* 3650 */     LanguageRegistry.instance().addNameForObject(MyCrystalStoneShovel, "en_US", "Kyanite Shovel");
/* 3651 */     LanguageRegistry.instance().addNameForObject(MyCrystalStoneHoe, "en_US", "Kyanite Hoe");
/* 3652 */     LanguageRegistry.instance().addNameForObject(MyCrystalStoneAxe, "en_US", "Kyanite Axe");
/*      */     
/* 3654 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneSword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3658 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneSword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3662 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneSword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3666 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStonePickaxe), new Object[] { "EEE", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3670 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneShovel), new Object[] { " E ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3674 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneShovel), new Object[] { "E  ", "I  ", "I  ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3678 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneShovel), new Object[] { "  E", "  I", "  I", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3682 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneHoe), new Object[] { "EE ", " I ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */     
/* 3686 */     GameRegistry.addRecipe(new ItemStack(MyCrystalStoneAxe), new Object[] { "EE ", "EI ", " I ", Character.valueOf('I'), CrystalSticks, Character.valueOf('E'), CrystalStone });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3691 */     LanguageRegistry.instance().addNameForObject(MyRubySword, "en_US", "Ruby Sword");
/* 3692 */     LanguageRegistry.instance().addNameForObject(MyRubyPickaxe, "en_US", "Ruby Pickaxe");
/* 3693 */     LanguageRegistry.instance().addNameForObject(MyRubyShovel, "en_US", "Ruby Shovel");
/* 3694 */     LanguageRegistry.instance().addNameForObject(MyRubyHoe, "en_US", "Ruby Hoe");
/* 3695 */     LanguageRegistry.instance().addNameForObject(MyRubyAxe, "en_US", "Ruby Axe");
/*      */     
/* 3697 */     GameRegistry.addRecipe(new ItemStack(MyRubySword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3701 */     GameRegistry.addRecipe(new ItemStack(MyRubySword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3705 */     GameRegistry.addRecipe(new ItemStack(MyRubySword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3709 */     GameRegistry.addRecipe(new ItemStack(MyRubyPickaxe), new Object[] { "EEE", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3713 */     GameRegistry.addRecipe(new ItemStack(MyRubyShovel), new Object[] { " E ", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3717 */     GameRegistry.addRecipe(new ItemStack(MyRubyShovel), new Object[] { "E  ", "I  ", "I  ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3721 */     GameRegistry.addRecipe(new ItemStack(MyRubyShovel), new Object[] { "  E", "  I", "  I", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3725 */     GameRegistry.addRecipe(new ItemStack(MyRubyHoe), new Object[] { "EE ", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 3729 */     GameRegistry.addRecipe(new ItemStack(MyRubyAxe), new Object[] { "EE ", "EI ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyRuby });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3734 */     LanguageRegistry.instance().addNameForObject(MyAmethystSword, "en_US", "Amethyst Sword");
/* 3735 */     LanguageRegistry.instance().addNameForObject(MyAmethystPickaxe, "en_US", "Amethyst Pickaxe");
/* 3736 */     LanguageRegistry.instance().addNameForObject(MyAmethystShovel, "en_US", "Amethyst Shovel");
/* 3737 */     LanguageRegistry.instance().addNameForObject(MyAmethystHoe, "en_US", "Amethyst Hoe");
/* 3738 */     LanguageRegistry.instance().addNameForObject(MyAmethystAxe, "en_US", "Amethyst Axe");
/*      */     
/* 3740 */     GameRegistry.addRecipe(new ItemStack(MyAmethystSword), new Object[] { " E ", " E ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3744 */     GameRegistry.addRecipe(new ItemStack(MyAmethystSword), new Object[] { "E  ", "E  ", "I  ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3748 */     GameRegistry.addRecipe(new ItemStack(MyAmethystSword), new Object[] { "  E", "  E", "  I", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3752 */     GameRegistry.addRecipe(new ItemStack(MyAmethystPickaxe), new Object[] { "EEE", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3756 */     GameRegistry.addRecipe(new ItemStack(MyAmethystShovel), new Object[] { " E ", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3760 */     GameRegistry.addRecipe(new ItemStack(MyAmethystShovel), new Object[] { "E  ", "I  ", "I  ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3764 */     GameRegistry.addRecipe(new ItemStack(MyAmethystShovel), new Object[] { "  E", "  I", "  I", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3768 */     GameRegistry.addRecipe(new ItemStack(MyAmethystHoe), new Object[] { "EE ", " I ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 3772 */     GameRegistry.addRecipe(new ItemStack(MyAmethystAxe), new Object[] { "EE ", "EI ", " I ", Character.valueOf('I'), Items.field_151055_y, Character.valueOf('E'), MyAmethyst });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3778 */     GameRegistry.addShapelessRecipe(new ItemStack(MyHammy), new Object[] { MyUltimateSword, MyUltimateSword, MyBigHammer, GreenGoo });
/* 3779 */     GameRegistry.addShapelessRecipe(new ItemStack(MyBattleAxe), new Object[] { MyUltimateSword, MyUltimateAxe, GreenGoo });
/* 3780 */     GameRegistry.addRecipe(new ItemStack(MyChainsaw), new Object[] { "EEE", "EIE", "EEE", Character.valueOf('I'), MyUltimateAxe, Character.valueOf('E'), Blocks.field_150451_bX });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3785 */     GameRegistry.addRecipe(new ItemStack(MyQueenBattleAxe), new Object[] { "EIE", "EIE", " I ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('E'), MyQueenScale });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3790 */     GameRegistry.addShapelessRecipe(new ItemStack(MyBertha), new Object[] { BerthaHandle, BerthaGuard, BerthaBlade });
/* 3791 */     GameRegistry.addShapelessRecipe(new ItemStack(BerthaHandle), new Object[] { MyRayGun, MyBigHammer, MyMantisClaw, MyWaterDragonScale, GreenGoo });
/* 3792 */     GameRegistry.addShapelessRecipe(new ItemStack(BerthaGuard), new Object[] { MolenoidNose, SeaMonsterScale, MyMothScale, MyBasiliskScale, MyNightmareScale, MyEmperorScorpionScale, MyJumpyBugScale });
/* 3793 */     GameRegistry.addShapelessRecipe(new ItemStack(BerthaBlade), new Object[] { MyKrakenTooth, WormTooth, TRexTooth, MyUltimateSword, CaterKillerJaw, SeaViperTongue, VortexEye });
/* 3794 */     GameRegistry.addShapelessRecipe(new ItemStack(MySlice), new Object[] { MyBertha, Items.field_151042_j });
/*      */     
/* 3796 */     GameRegistry.addShapelessRecipe(new ItemStack(MyIrukandjiArrow), new Object[] { MyPeacockFeather, MyIrukandji, CrystalSticks });
/* 3797 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151104_aV), new Object[] { MyPeacockFeather, CrystalPlanksBlock, MyPeacockFeather, CrystalPlanksBlock, MyPeacockFeather, CrystalPlanksBlock });
/* 3798 */     GameRegistry.addShapelessRecipe(new ItemStack(MySquidZooka), new Object[] { Items.field_151042_j, Items.field_151042_j, Items.field_151042_j, Items.field_151100_aR, Items.field_151100_aR, Items.field_151100_aR, Items.field_151042_j, Items.field_151042_j, Items.field_151042_j });
/*      */ 
/*      */ 
/*      */     
/* 3802 */     GameRegistry.addRecipe(new ItemStack(MyIngotUranium), new Object[] { "UUU", "UUU", "UUU", Character.valueOf('U'), UraniumNugget });
/*      */ 
/*      */     
/* 3805 */     GameRegistry.addShapelessRecipe(new ItemStack(UraniumNugget, 9), new Object[] { new ItemStack(MyIngotUranium) });
/* 3806 */     GameRegistry.addRecipe(new ItemStack(MyIngotTitanium), new Object[] { "UUU", "UUU", "UUU", Character.valueOf('U'), TitaniumNugget });
/*      */ 
/*      */     
/* 3809 */     GameRegistry.addShapelessRecipe(new ItemStack(TitaniumNugget, 9), new Object[] { new ItemStack(MyIngotTitanium) });
/*      */     
/* 3811 */     GameRegistry.addRecipe(new ItemStack(MyBlockUraniumBlock), new Object[] { "UUU", "UUU", "UUU", Character.valueOf('U'), MyIngotUranium });
/*      */ 
/*      */     
/* 3814 */     GameRegistry.addShapelessRecipe(new ItemStack(MyIngotUranium, 9), new Object[] { new ItemStack(MyBlockUraniumBlock) });
/*      */     
/* 3816 */     GameRegistry.addRecipe(new ItemStack(MyBlockTitaniumBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */     
/* 3819 */     GameRegistry.addShapelessRecipe(new ItemStack(MyIngotTitanium, 9), new Object[] { new ItemStack(MyBlockTitaniumBlock) });
/*      */     
/* 3821 */     GameRegistry.addRecipe(new ItemStack(MyBlockMobzillaScaleBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), MyGodzillaScale });
/*      */ 
/*      */     
/* 3824 */     GameRegistry.addShapelessRecipe(new ItemStack(MyGodzillaScale, 9), new Object[] { new ItemStack(MyBlockMobzillaScaleBlock) });
/*      */     
/* 3826 */     GameRegistry.addRecipe(new ItemStack(MyBlockRubyBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), MyRuby });
/*      */ 
/*      */     
/* 3829 */     GameRegistry.addShapelessRecipe(new ItemStack(MyRuby, 9), new Object[] { new ItemStack(MyBlockRubyBlock) });
/*      */     
/* 3831 */     GameRegistry.addRecipe(new ItemStack(MyBlockAmethystBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), MyAmethyst });
/*      */ 
/*      */     
/* 3834 */     GameRegistry.addRecipe(new ItemStack(MyCrystalPinkBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), MyCrystalPinkIngot });
/*      */ 
/*      */     
/* 3837 */     GameRegistry.addRecipe(new ItemStack(MyTigersEyeBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), MyTigersEyeIngot });
/*      */ 
/*      */     
/* 3840 */     GameRegistry.addShapelessRecipe(new ItemStack(MyAmethyst, 9), new Object[] { new ItemStack(MyBlockAmethystBlock) });
/* 3841 */     GameRegistry.addShapelessRecipe(new ItemStack(MyCrystalPinkIngot, 9), new Object[] { new ItemStack(MyCrystalPinkBlock) });
/* 3842 */     GameRegistry.addShapelessRecipe(new ItemStack(MyTigersEyeIngot, 9), new Object[] { new ItemStack(MyTigersEyeBlock) });
/*      */     
/* 3844 */     GameRegistry.addRecipe(new ItemStack(MyEnderPearlBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), Items.field_151079_bi });
/*      */ 
/*      */     
/* 3847 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151079_bi, 9), new Object[] { new ItemStack(MyEnderPearlBlock) });
/*      */     
/* 3849 */     GameRegistry.addRecipe(new ItemStack(MyEyeOfEnderBlock), new Object[] { "TTT", "TTT", "TTT", Character.valueOf('T'), Items.field_151061_bv });
/*      */ 
/*      */     
/* 3852 */     GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151061_bv, 9), new Object[] { new ItemStack(MyEyeOfEnderBlock) });
/*      */     
/* 3854 */     GameRegistry.addRecipe(new ItemStack(MyThunderStaff), new Object[] { "DR ", "RR ", "  R", Character.valueOf('D'), Items.field_151045_i, Character.valueOf('R'), MyRuby });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3859 */     GameRegistry.addRecipe(new ItemStack(MyWrench), new Object[] { "D D", " D ", " D ", Character.valueOf('D'), Items.field_151042_j });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3864 */     ItemStack MilkBucket = new ItemStack(Items.field_151117_aB);
/* 3865 */     ItemStack SomePaper = new ItemStack(Items.field_151121_aF);
/* 3866 */     GameRegistry.addShapelessRecipe(new ItemStack(MyButter, 4), new Object[] { MilkBucket, MilkBucket });
/* 3867 */     GameRegistry.addShapelessRecipe(new ItemStack(MyCheese, 2), new Object[] { MilkBucket, MilkBucket, MilkBucket, MilkBucket });
/* 3868 */     GameRegistry.addShapelessRecipe(new ItemStack(MyButteredPopcorn), new Object[] { MyPopcorn, MyButter });
/* 3869 */     GameRegistry.addShapelessRecipe(new ItemStack(MyButteredSaltedPopcorn), new Object[] { MyButteredPopcorn, MySalt });
/* 3870 */     GameRegistry.addShapelessRecipe(new ItemStack(MyButteredSaltedPopcorn), new Object[] { MyPopcorn, MySalt, MyButter });
/* 3871 */     GameRegistry.addShapelessRecipe(new ItemStack(MyPopcornBag), new Object[] { MyButteredSaltedPopcorn, MyButteredSaltedPopcorn, MyButteredSaltedPopcorn, MyButteredSaltedPopcorn, MyButteredSaltedPopcorn, MyButteredSaltedPopcorn, SomePaper, SomePaper, SomePaper });
/*      */ 
/*      */     
/* 3874 */     GameRegistry.addShapelessRecipe(new ItemStack(MyRawCornDog, 4), new Object[] { MyCornCob, Items.field_151076_bf, Items.field_151147_al, Items.field_151055_y });
/* 3875 */     GameRegistry.addShapelessRecipe(new ItemStack(MyRawBacon, 2), new Object[] { MySalt, Items.field_151147_al });
/* 3876 */     GameRegistry.addShapelessRecipe(new ItemStack(MyButterCandy, 4), new Object[] { MyButter, Items.field_151102_aT });
/*      */     
/* 3878 */     GameRegistry.addShapelessRecipe(new ItemStack(MySalad, 1), new Object[] { MyLettuce, MyTomato, MyRadish, Items.field_151172_bF, Items.field_151054_z });
/* 3879 */     GameRegistry.addShapelessRecipe(new ItemStack(MyBLT, 1), new Object[] { MyBacon, MyLettuce, MyTomato, MyButter, Items.field_151025_P });
/* 3880 */     GameRegistry.addShapelessRecipe(new ItemStack(MyPizzaItem, 1), new Object[] { MyTomato, MyCheese, MyBacon, Items.field_151025_P });
/* 3881 */     GameRegistry.addRecipe(new ItemStack(MyDuctTapeItem), new Object[] { "   ", "AAA", "RRR", Character.valueOf('R'), Items.field_151007_F, Character.valueOf('A'), Items.field_151123_aH });
/*      */ 
/*      */ 
/*      */     
/* 3885 */     GameRegistry.addShapelessRecipe(new ItemStack(MyCrabbyPatty, 1), new Object[] { MyCrabMeat, MyLettuce, MyTomato, Items.field_151025_P });
/*      */     
/* 3887 */     LanguageRegistry.instance().addNameForObject(MyCheese, "en_US", "Cheese");
/* 3888 */     LanguageRegistry.instance().addNameForObject(MyPizzaBlock, "en_US", "Pizza!");
/* 3889 */     LanguageRegistry.instance().addNameForObject(MyPizzaItem, "en_US", "Pizza!");
/* 3890 */     LanguageRegistry.instance().addNameForObject(MyDuctTapeBlock, "en_US", "Duct Tape!");
/* 3891 */     LanguageRegistry.instance().addNameForObject(MyDuctTapeItem, "en_US", "Duct Tape!");
/*      */     
/* 3893 */     LanguageRegistry.instance().addNameForObject(ZooCage2, "en_US", "Extra Small Zoo Cage");
/* 3894 */     LanguageRegistry.instance().addNameForObject(ZooCage4, "en_US", "Small Zoo Cage");
/* 3895 */     LanguageRegistry.instance().addNameForObject(ZooCage6, "en_US", "Medium Zoo Cage");
/* 3896 */     LanguageRegistry.instance().addNameForObject(ZooCage8, "en_US", "Large Zoo Cage");
/* 3897 */     LanguageRegistry.instance().addNameForObject(ZooCage10, "en_US", "Extra Large Zoo Cage");
/*      */     
/* 3899 */     GameRegistry.addShapelessRecipe(new ItemStack(ZooCage2), new Object[] { Blocks.field_150339_S, Blocks.field_150359_w, Blocks.field_150371_ca });
/* 3900 */     GameRegistry.addShapelessRecipe(new ItemStack(ZooCage4), new Object[] { ZooCage2, Blocks.field_150339_S, Blocks.field_150359_w, Blocks.field_150371_ca });
/* 3901 */     GameRegistry.addShapelessRecipe(new ItemStack(ZooCage6), new Object[] { ZooCage4, Blocks.field_150339_S, Blocks.field_150359_w, Blocks.field_150371_ca });
/* 3902 */     GameRegistry.addShapelessRecipe(new ItemStack(ZooCage8), new Object[] { ZooCage6, Blocks.field_150339_S, Blocks.field_150359_w, Blocks.field_150371_ca });
/* 3903 */     GameRegistry.addShapelessRecipe(new ItemStack(ZooCage10), new Object[] { ZooCage8, Blocks.field_150339_S, Blocks.field_150359_w, Blocks.field_150371_ca });
/*      */     
/* 3905 */     LanguageRegistry.instance().addNameForObject(InstantShelter, "en_US", "Instant Survival Shelter");
/* 3906 */     LanguageRegistry.instance().addNameForObject(InstantGarden, "en_US", "Instant Survival Garden");
/* 3907 */     GameRegistry.addShapelessRecipe(new ItemStack(InstantShelter), new Object[] { Blocks.field_150451_bX, Items.field_151055_y, Blocks.field_150347_e });
/* 3908 */     GameRegistry.addShapelessRecipe(new ItemStack(InstantGarden), new Object[] { Blocks.field_150451_bX, Items.field_151015_O, Items.field_151016_H });
/*      */     
/* 3910 */     GameRegistry.addShapelessRecipe(new ItemStack(CreeperLauncher, 4), new Object[] { Items.field_151121_aF, Items.field_151137_ax, Items.field_151055_y });
/* 3911 */     GameRegistry.addShapelessRecipe(new ItemStack(NetherLost, 1), new Object[] { Items.field_151156_bN, Blocks.field_150424_aL });
/*      */     
/* 3913 */     GameRegistry.addRecipe(new ItemStack(Sifter), new Object[] { "RRR", "RAR", "RRR", Character.valueOf('R'), Items.field_151055_y, Character.valueOf('A'), Items.field_151007_F });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3919 */     LanguageRegistry.instance().addNameForObject(MagicApple, "en_US", "OMG! No! Don't do it!!!");
/* 3920 */     GameRegistry.addRecipe(new ItemStack(MagicApple), new Object[] { "RRR", "RAR", "RRR", Character.valueOf('R'), Blocks.field_150451_bX, Character.valueOf('A'), Items.field_151034_e });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3925 */     LanguageRegistry.instance().addNameForObject(RandomDungeon, "en_US", "Random Dungeon");
/* 3926 */     GameRegistry.addRecipe(new ItemStack(RandomDungeon), new Object[] { "RRR", "RAR", "RRR", Character.valueOf('R'), Blocks.field_150451_bX, Character.valueOf('A'), Items.field_151044_h });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3931 */     if (MinersDreamExpensive == 0) {
/*      */       
/* 3933 */       LanguageRegistry.instance().addNameForObject(MinersDream, "en_US", "Miner's Dream");
/* 3934 */       GameRegistry.addRecipe(new ItemStack(MinersDream), new Object[] { "CCC", "RRR", "GGG", Character.valueOf('R'), Blocks.field_150451_bX, Character.valueOf('C'), Blocks.field_150434_aF, Character.valueOf('G'), Items.field_151016_H });
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 3941 */       LanguageRegistry.instance().addNameForObject(MinersDream, "en_US", "Miner's Dream");
/* 3942 */       GameRegistry.addRecipe(new ItemStack(MinersDream), new Object[] { "CCC", "RRR", "GGG", Character.valueOf('R'), Blocks.field_150451_bX, Character.valueOf('C'), Blocks.field_150434_aF, Character.valueOf('G'), Blocks.field_150335_W });
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3950 */     LanguageRegistry.instance().addNameForObject(MyStepUp, "en_US", "Stairs going Up");
/* 3951 */     GameRegistry.addRecipe(new ItemStack(MyStepUp, 8), new Object[] { "GC ", " C ", " C ", Character.valueOf('C'), Blocks.field_150347_e, Character.valueOf('G'), Items.field_151016_H });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3956 */     LanguageRegistry.instance().addNameForObject(MyStepDown, "en_US", "Stairs going Down");
/* 3957 */     GameRegistry.addRecipe(new ItemStack(MyStepDown, 8), new Object[] { " C ", " C ", "GC ", Character.valueOf('C'), Blocks.field_150347_e, Character.valueOf('G'), Items.field_151016_H });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3962 */     LanguageRegistry.instance().addNameForObject(MyStepAccross, "en_US", "Insta-Bridge");
/* 3963 */     GameRegistry.addRecipe(new ItemStack(MyStepAccross, 8), new Object[] { " C ", "GC ", " C ", Character.valueOf('C'), Blocks.field_150347_e, Character.valueOf('G'), Items.field_151016_H });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3971 */     LanguageRegistry.instance().addNameForObject(ExtremeTorch, "en_US", "Extreme Torch");
/* 3972 */     GameRegistry.addShapelessRecipe(new ItemStack(ExtremeTorch, 4), new Object[] { Items.field_151137_ax, Items.field_151055_y, Items.field_151044_h });
/* 3973 */     GameRegistry.addShapelessRecipe(new ItemStack(ExtremeTorch, 1), new Object[] { Items.field_151137_ax, Blocks.field_150478_aa });
/* 3974 */     GameRegistry.addShapelessRecipe(new ItemStack(CrystalSticks, 6), new Object[] { CrystalPlanksBlock, CrystalPlanksBlock });
/* 3975 */     GameRegistry.addShapelessRecipe(new ItemStack(CrystalTorch, 6), new Object[] { CrystalCoal, CrystalSticks });
/*      */     
/* 3977 */     LanguageRegistry.instance().addNameForObject(CrystalTorch, "en_US", "Crystal Torch");
/*      */     
/* 3979 */     LanguageRegistry.instance().addNameForObject(KrakenRepellent, "en_US", "Kraken Repellent");
/* 3980 */     LanguageRegistry.instance().addNameForObject(MyDeadStinkBug, "en_US", "Dead Stink Bug");
/* 3981 */     GameRegistry.addRecipe(new ItemStack(KrakenRepellent, 1), new Object[] { "D D", "STS", "D D", Character.valueOf('D'), MyDeadStinkBug, Character.valueOf('T'), ExtremeTorch, Character.valueOf('S'), Items.field_151007_F });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3986 */     LanguageRegistry.instance().addNameForObject(CreeperRepellent, "en_US", "Creeper Repellent");
/* 3987 */     GameRegistry.addRecipe(new ItemStack(CreeperRepellent, 1), new Object[] { "D D", "STS", "D D", Character.valueOf('D'), GreenGoo, Character.valueOf('T'), ExtremeTorch, Character.valueOf('S'), Items.field_151007_F });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3993 */     LanguageRegistry.instance().addNameForObject(MyIslandBlock, "en_US", "Island Block");
/* 3994 */     LanguageRegistry.instance().addNameForObject(MyKingSpawnerBlock, "en_US", "The King Spawner Block");
/* 3995 */     LanguageRegistry.instance().addNameForObject(MyQueenSpawnerBlock, "en_US", "The Queen Spawner Block");
/* 3996 */     LanguageRegistry.instance().addNameForObject(MyDungeonSpawnerBlock, "en_US", "Random Dungeon Spawner");
/*      */     
/* 3998 */     LanguageRegistry.instance().addNameForObject(MyAppleSeed, "en_US", "Apple Tree Seed");
/* 3999 */     GameRegistry.addShapelessRecipe(new ItemStack(MyAppleSeed, 6), new Object[] { Items.field_151034_e });
/* 4000 */     LanguageRegistry.instance().addNameForObject(MyCherrySeed, "en_US", "Cherry Pit");
/* 4001 */     GameRegistry.addShapelessRecipe(new ItemStack(MyCherrySeed, 1), new Object[] { MyCherry });
/* 4002 */     LanguageRegistry.instance().addNameForObject(MyPeachSeed, "en_US", "Peach Pit");
/* 4003 */     GameRegistry.addShapelessRecipe(new ItemStack(MyPeachSeed, 1), new Object[] { MyPeach });
/*      */     
/* 4005 */     LanguageRegistry.instance().addNameForObject(MyExperienceCatcher, "en_US", "Experience Orb Catcher");
/* 4006 */     GameRegistry.addShapelessRecipe(new ItemStack(MyExperienceCatcher, 1), new Object[] { Items.field_151069_bo, Items.field_151055_y, Items.field_151007_F });
/*      */     
/* 4008 */     LanguageRegistry.instance().addNameForObject(MyExperienceTreeSeed, "en_US", "Experience Tree Seed");
/* 4009 */     GameRegistry.addRecipe(new ItemStack(MyExperienceTreeSeed, 1), new Object[] { "EEE", "EAE", "EEE", Character.valueOf('A'), MyAppleSeed, Character.valueOf('E'), Items.field_151062_by });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4028 */     EntityRegistry.instance(); int hookid = EntityRegistry.findGlobalUniqueEntityId();
/* 4029 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(UltimateFishHook.class, "UltimateFishHook", hookid);
/*      */     
/* 4031 */     EntityRegistry.instance(); int urchinid = EntityRegistry.findGlobalUniqueEntityId();
/* 4032 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(SunspotUrchin.class, "SunspotUrchin", urchinid);
/* 4033 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(SunspotUrchin.class, "SunspotUrchin", urchinid, this, 64, 1, true);
/*      */     
/* 4035 */     EntityRegistry.instance(); int waterballid = EntityRegistry.findGlobalUniqueEntityId();
/* 4036 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(WaterBall.class, "WaterBall", waterballid);
/* 4037 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(WaterBall.class, "WaterBall", waterballid, this, 64, 1, true);
/*      */     
/* 4039 */     EntityRegistry.instance(); int inksackid = EntityRegistry.findGlobalUniqueEntityId();
/* 4040 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(InkSack.class, "InkSack", inksackid);
/* 4041 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(InkSack.class, "InkSack", inksackid, this, 64, 1, true);
/*      */     
/* 4043 */     EntityRegistry.instance(); int laserballid = EntityRegistry.findGlobalUniqueEntityId();
/* 4044 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(LaserBall.class, "LaserBall", laserballid);
/* 4045 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(LaserBall.class, "LaserBall", laserballid, this, 64, 1, true);
/*      */     
/* 4047 */     EntityRegistry.instance(); int iceballid = EntityRegistry.findGlobalUniqueEntityId();
/* 4048 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(IceBall.class, "IceBall", iceballid);
/* 4049 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(IceBall.class, "IceBall", iceballid, this, 64, 1, true);
/*      */     
/* 4051 */     EntityRegistry.instance(); int acidid = EntityRegistry.findGlobalUniqueEntityId();
/* 4052 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Acid.class, "Acid", acidid);
/* 4053 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Acid.class, "Acid", acidid, this, 64, 1, true);
/*      */     
/* 4055 */     EntityRegistry.instance(); int Irukandjiid = EntityRegistry.findGlobalUniqueEntityId();
/* 4056 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(DeadIrukandji.class, "DeadIrukandji", Irukandjiid);
/* 4057 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(DeadIrukandji.class, "DeadIrukandji", Irukandjiid, this, 64, 1, true);
/*      */     
/* 4059 */     EntityRegistry.instance(); int berthahitid = EntityRegistry.findGlobalUniqueEntityId();
/* 4060 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(BerthaHit.class, "BerthaHit", berthahitid);
/* 4061 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(BerthaHit.class, "BerthaHit", berthahitid, this, 64, 1, true);
/*      */     
/* 4063 */     EntityRegistry.instance(); int purplepowerid = EntityRegistry.findGlobalUniqueEntityId();
/* 4064 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(PurplePower.class, "PurplePower", purplepowerid);
/* 4065 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(PurplePower.class, "PurplePower", purplepowerid, this, 64, 1, true);
/*      */     
/* 4067 */     EntityRegistry.instance(); int rockid = EntityRegistry.findGlobalUniqueEntityId();
/* 4068 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityThrownRock.class, "EntityThrownRock", rockid);
/* 4069 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityThrownRock.class, "EntityThrownRock", rockid, this, 64, 1, true);
/*      */     
/* 4071 */     LanguageRegistry.instance().addNameForObject(MyFireFish, "en_US", "Fire Fish");
/* 4072 */     LanguageRegistry.instance().addNameForObject(MySunFish, "en_US", "Sun Fish");
/* 4073 */     LanguageRegistry.instance().addNameForObject(MyLavaEel, "en_US", "Lava Eel");
/* 4074 */     LanguageRegistry.instance().addNameForObject(MyMothScale, "en_US", "Moth Scale");
/* 4075 */     LanguageRegistry.instance().addNameForObject(MyQueenScale, "en_US", "The Queen Scale");
/* 4076 */     LanguageRegistry.instance().addNameForObject(MyNightmareScale, "en_US", "Nightmare Scale");
/* 4077 */     LanguageRegistry.instance().addNameForObject(MyEmperorScorpionScale, "en_US", "Emperor Scorpion Scale");
/* 4078 */     LanguageRegistry.instance().addNameForObject(MyBasiliskScale, "en_US", "Basilisk Scale");
/* 4079 */     LanguageRegistry.instance().addNameForObject(MyWaterDragonScale, "en_US", "Water Dragon Scale");
/* 4080 */     LanguageRegistry.instance().addNameForObject(MyJumpyBugScale, "en_US", "Jumpy Bug Scale");
/* 4081 */     LanguageRegistry.instance().addNameForObject(MyKrakenTooth, "en_US", "Kraken Tooth");
/* 4082 */     LanguageRegistry.instance().addNameForObject(MyGodzillaScale, "en_US", "Mobzilla Scale");
/* 4083 */     LanguageRegistry.instance().addNameForObject(GreenGoo, "en_US", "Green Goo");
/* 4084 */     LanguageRegistry.instance().addNameForObject(SpiderRobotKit, "en_US", "Spider Robot Kit");
/* 4085 */     LanguageRegistry.instance().addNameForObject(AntRobotKit, "en_US", "Red Ant Robot Kit");
/* 4086 */     LanguageRegistry.instance().addNameForObject(ZooKeeper, "en_US", "ZooKeeper Shard");
/* 4087 */     LanguageRegistry.instance().addNameForObject(MySunspotUrchin, "en_US", "Sunspot Urchin");
/* 4088 */     LanguageRegistry.instance().addNameForObject(MySparkFish, "en_US", "Spark Fish");
/* 4089 */     LanguageRegistry.instance().addNameForObject(MyWaterBall, "en_US", "WaterDragon Charge");
/* 4090 */     LanguageRegistry.instance().addNameForObject(MyLaserBall, "en_US", "Robot Laser Charge");
/* 4091 */     LanguageRegistry.instance().addNameForObject(MyIceBall, "en_US", "Ice Ball");
/* 4092 */     LanguageRegistry.instance().addNameForObject(MySmallRock, "en_US", "Small Rock");
/* 4093 */     LanguageRegistry.instance().addNameForObject(MyRock, "en_US", "Big Rock");
/* 4094 */     LanguageRegistry.instance().addNameForObject(MyRedRock, "en_US", "Flame Rock");
/* 4095 */     LanguageRegistry.instance().addNameForObject(MyCrystalRedRock, "en_US", "Flame Crystal");
/* 4096 */     LanguageRegistry.instance().addNameForObject(MyCrystalGreenRock, "en_US", "Poison Crystal");
/* 4097 */     LanguageRegistry.instance().addNameForObject(MyCrystalBlueRock, "en_US", "Slowness Crystal");
/* 4098 */     LanguageRegistry.instance().addNameForObject(MyCrystalTNTRock, "en_US", "Explosive Crystal");
/* 4099 */     LanguageRegistry.instance().addNameForObject(MyBlueRock, "en_US", "Slowness Rock");
/* 4100 */     LanguageRegistry.instance().addNameForObject(MyGreenRock, "en_US", "Poison Rock");
/* 4101 */     LanguageRegistry.instance().addNameForObject(MyPurpleRock, "en_US", "Weakness Rock");
/* 4102 */     LanguageRegistry.instance().addNameForObject(MySpikeyRock, "en_US", "Painful Rock");
/* 4103 */     LanguageRegistry.instance().addNameForObject(MyTNTRock, "en_US", "Explosive Rock");
/* 4104 */     LanguageRegistry.instance().addNameForObject(MyAcid, "en_US", "Acid");
/* 4105 */     LanguageRegistry.instance().addNameForObject(MyIrukandji, "en_US", "Dead Irukandji");
/* 4106 */     LanguageRegistry.instance().addNameForObject(MyIrukandjiArrow, "en_US", "Irukandji Arrow");
/* 4107 */     LanguageRegistry.instance().addNameForObject(MyRayGun, "en_US", "A Freakin' Ray Gun!");
/* 4108 */     LanguageRegistry.instance().addNameForObject(MySquidZooka, "en_US", "SquidZooka!");
/* 4109 */     LanguageRegistry.instance().addNameForObject(MyThunderStaff, "en_US", "Thunder Staff");
/* 4110 */     LanguageRegistry.instance().addNameForObject(MyWrench, "en_US", "Wrench");
/* 4111 */     LanguageRegistry.instance().addNameForObject(MyGreenFish, "en_US", "Green Fish");
/* 4112 */     LanguageRegistry.instance().addNameForObject(MyBlueFish, "en_US", "Blue Fish");
/* 4113 */     LanguageRegistry.instance().addNameForObject(MyPinkFish, "en_US", "Pink Fish");
/* 4114 */     LanguageRegistry.instance().addNameForObject(MyRockFish, "en_US", "Rock Fish");
/* 4115 */     LanguageRegistry.instance().addNameForObject(MyWoodFish, "en_US", "Wood Fish");
/* 4116 */     LanguageRegistry.instance().addNameForObject(MyGreyFish, "en_US", "Grey Fish");
/* 4117 */     LanguageRegistry.instance().addNameForObject(Sifter, "en_US", "Sifter");
/* 4118 */     LanguageRegistry.instance().addNameForObject(CreeperLauncher, "en_US", "Creeper Launcher");
/* 4119 */     LanguageRegistry.instance().addNameForObject(NetherLost, "en_US", "Nether Tracker");
/* 4120 */     LanguageRegistry.instance().addNameForObject(CrystalSticks, "en_US", "Crystal Shards");
/* 4121 */     LanguageRegistry.instance().addNameForObject(MyPeacockFeather, "en_US", "Peacock Feather");
/*      */     
/* 4123 */     LanguageRegistry.instance().addNameForObject(BerthaHandle, "en_US", "Big Bertha Handle");
/* 4124 */     LanguageRegistry.instance().addNameForObject(BerthaGuard, "en_US", "Big Bertha Guard");
/* 4125 */     LanguageRegistry.instance().addNameForObject(BerthaBlade, "en_US", "Big Bertha Blade");
/* 4126 */     LanguageRegistry.instance().addNameForObject(MolenoidNose, "en_US", "Molenoid Nose");
/* 4127 */     LanguageRegistry.instance().addNameForObject(SeaMonsterScale, "en_US", "Sea Monster Scale");
/* 4128 */     LanguageRegistry.instance().addNameForObject(WormTooth, "en_US", "Worm Tooth");
/* 4129 */     LanguageRegistry.instance().addNameForObject(TRexTooth, "en_US", "TRex Tooth");
/* 4130 */     LanguageRegistry.instance().addNameForObject(CaterKillerJaw, "en_US", "CaterKiller Jaws");
/* 4131 */     LanguageRegistry.instance().addNameForObject(SeaViperTongue, "en_US", "Sea Viper Tongue");
/* 4132 */     LanguageRegistry.instance().addNameForObject(VortexEye, "en_US", "Vortex Eye");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4137 */     ItemStack RayStack = new ItemStack(MyRayGun);
/* 4138 */     RayStack.func_77964_b(32767);
/* 4139 */     GameRegistry.addShapelessRecipe(new ItemStack(MyRayGun), new Object[] { new ItemStack(Blocks.field_150451_bX), RayStack });
/*      */ 
/*      */     
/* 4142 */     ItemStack SquidStack = new ItemStack(MySquidZooka);
/* 4143 */     SquidStack.func_77964_b(32767);
/* 4144 */     GameRegistry.addShapelessRecipe(new ItemStack(MySquidZooka), new Object[] { new ItemStack(Items.field_151100_aR), SquidStack });
/*      */ 
/*      */     
/* 4147 */     LanguageRegistry.instance().addNameForObject(MyStrawberry, "en_US", "Strawberry");
/* 4148 */     LanguageRegistry.instance().addNameForObject(MyStrawberrySeed, "en_US", "Strawberry Plant");
/* 4149 */     LanguageRegistry.instance().addNameForObject(MyButterflySeed, "en_US", "Butterfly Plant");
/* 4150 */     LanguageRegistry.instance().addNameForObject(MyMothSeed, "en_US", "Moth Plant");
/* 4151 */     LanguageRegistry.instance().addNameForObject(MyMosquitoSeed, "en_US", "Mosquito Plant");
/* 4152 */     LanguageRegistry.instance().addNameForObject(MyFireflySeed, "en_US", "Firefly Plant");
/* 4153 */     LanguageRegistry.instance().addNameForObject(MyRadish, "en_US", "Radish");
/* 4154 */     LanguageRegistry.instance().addNameForObject(MyRice, "en_US", "Rice");
/* 4155 */     LanguageRegistry.instance().addNameForObject(MyCherry, "en_US", "Cherries");
/* 4156 */     LanguageRegistry.instance().addNameForObject(MyPeach, "en_US", "Peach");
/* 4157 */     LanguageRegistry.instance().addNameForObject(MyCrystalApple, "en_US", "Crystal Apple");
/*      */ 
/*      */     
/* 4160 */     LanguageRegistry.instance().addNameForObject(MyCornCob, "en_US", "Corn");
/* 4161 */     LanguageRegistry.instance().addNameForObject(MyCornPlant1, "en_US", "Corn Plant");
/* 4162 */     LanguageRegistry.instance().addNameForObject(MyCornPlant2, "en_US", "Corn Plant");
/* 4163 */     LanguageRegistry.instance().addNameForObject(MyCornPlant3, "en_US", "Corn Plant");
/* 4164 */     LanguageRegistry.instance().addNameForObject(MyCornPlant4, "en_US", "Corn Plant");
/* 4165 */     LanguageRegistry.instance().addNameForObject(MyQuinoa, "en_US", "Quinoa");
/* 4166 */     LanguageRegistry.instance().addNameForObject(MyQuinoaPlant1, "en_US", "Quinoa Plant");
/* 4167 */     LanguageRegistry.instance().addNameForObject(MyQuinoaPlant2, "en_US", "Quinoa Plant");
/* 4168 */     LanguageRegistry.instance().addNameForObject(MyQuinoaPlant3, "en_US", "Quinoa Plant");
/* 4169 */     LanguageRegistry.instance().addNameForObject(MyQuinoaPlant4, "en_US", "Quinoa Plant");
/* 4170 */     LanguageRegistry.instance().addNameForObject(MyTomato, "en_US", "Tomato");
/* 4171 */     LanguageRegistry.instance().addNameForObject(MyTomatoPlant1, "en_US", "Tomato Plant");
/* 4172 */     LanguageRegistry.instance().addNameForObject(MyTomatoPlant2, "en_US", "Tomato Plant");
/* 4173 */     LanguageRegistry.instance().addNameForObject(MyTomatoPlant3, "en_US", "Tomato Plant");
/* 4174 */     LanguageRegistry.instance().addNameForObject(MyTomatoPlant4, "en_US", "Tomato Plant");
/* 4175 */     LanguageRegistry.instance().addNameForObject(MyLettuce, "en_US", "Lettuce");
/* 4176 */     LanguageRegistry.instance().addNameForObject(MyLettucePlant1, "en_US", "Lettuce Plant");
/* 4177 */     LanguageRegistry.instance().addNameForObject(MyLettucePlant2, "en_US", "Lettuce Plant");
/* 4178 */     LanguageRegistry.instance().addNameForObject(MyLettucePlant3, "en_US", "Lettuce Plant");
/* 4179 */     LanguageRegistry.instance().addNameForObject(MyLettucePlant4, "en_US", "Lettuce Plant");
/* 4180 */     LanguageRegistry.instance().addNameForObject(MyExperiencePlant, "en_US", "Experience Tree Sapling");
/* 4181 */     LanguageRegistry.instance().addNameForObject(MyFlowerPinkBlock, "en_US", "Pink Flower");
/* 4182 */     LanguageRegistry.instance().addNameForObject(MyFlowerBlueBlock, "en_US", "Blue Flower");
/* 4183 */     LanguageRegistry.instance().addNameForObject(MyFlowerBlackBlock, "en_US", "Black Flower");
/* 4184 */     LanguageRegistry.instance().addNameForObject(MyFlowerScaryBlock, "en_US", "Dead Flower");
/* 4185 */     LanguageRegistry.instance().addNameForObject(CrystalFlowerRedBlock, "en_US", "Red Crystal Flower");
/* 4186 */     LanguageRegistry.instance().addNameForObject(CrystalFlowerGreenBlock, "en_US", "Green Crystal Flower");
/* 4187 */     LanguageRegistry.instance().addNameForObject(CrystalFlowerBlueBlock, "en_US", "Blue Crystal Flower");
/* 4188 */     LanguageRegistry.instance().addNameForObject(CrystalFlowerYellowBlock, "en_US", "Yellow Crystal Flower");
/* 4189 */     LanguageRegistry.instance().addNameForObject(MyCrystalPlant, "en_US", "Red Crystal Tree Sapling");
/* 4190 */     LanguageRegistry.instance().addNameForObject(MyCrystalPlant2, "en_US", "Yellow Crystal Tree Sapling");
/* 4191 */     LanguageRegistry.instance().addNameForObject(MyCrystalPlant3, "en_US", "Blue Crystal Tree Sapling");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4196 */     EntityRegistry.instance(); GirlfriendID = EntityRegistry.findGlobalUniqueEntityId();
/* 4197 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Girlfriend.class, "Girlfriend", GirlfriendID);
/* 4198 */     LanguageRegistry.instance().addStringLocalization("Girlfriend", "en_US", "Girlfriend");
/* 4199 */     LanguageRegistry.instance().addStringLocalization("entity.Girlfriend.name", "en_US", "Girlfriend");
/* 4200 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Girlfriend.class, "Girlfriend", GirlfriendID, this, 64, 1, false);
/*      */     
/* 4202 */     EntityRegistry.instance(); RedCowID = EntityRegistry.findGlobalUniqueEntityId();
/* 4203 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(RedCow.class, "Apple Cow", RedCowID);
/* 4204 */     LanguageRegistry.instance().addStringLocalization("Apple Cow", "en_US", "Apple Cow");
/* 4205 */     LanguageRegistry.instance().addStringLocalization("entity.Apple Cow.name", "en_US", "Apple Cow");
/* 4206 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(RedCow.class, "Apple Cow", RedCowID, this, 64, 1, false);
/*      */     
/* 4208 */     EntityRegistry.instance(); GoldCowID = EntityRegistry.findGlobalUniqueEntityId();
/* 4209 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(GoldCow.class, "Golden Apple Cow", GoldCowID);
/* 4210 */     LanguageRegistry.instance().addStringLocalization("Golden Apple Cow", "en_US", "Golden Apple Cow");
/* 4211 */     LanguageRegistry.instance().addStringLocalization("entity.Golden Apple Cow.name", "en_US", "Golden Apple Cow");
/* 4212 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(GoldCow.class, "Golden Apple Cow", GoldCowID, this, 64, 1, false);
/*      */     
/* 4214 */     EntityRegistry.instance(); EnchantedCowID = EntityRegistry.findGlobalUniqueEntityId();
/* 4215 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EnchantedCow.class, "Enchanted Golden Apple Cow", EnchantedCowID);
/* 4216 */     LanguageRegistry.instance().addStringLocalization("Enchanted Golden Apple Cow", "en_US", "Enchanted Golden Apple Cow");
/* 4217 */     LanguageRegistry.instance().addStringLocalization("entity.Enchanted Golden Apple Cow.name", "en_US", "Enchanted Golden Apple Cow");
/* 4218 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EnchantedCow.class, "Enchanted Golden Apple Cow", EnchantedCowID, this, 64, 1, false);
/*      */     
/* 4220 */     EntityRegistry.instance(); ButterflyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4221 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityButterfly.class, "Butterfly", ButterflyID);
/* 4222 */     LanguageRegistry.instance().addStringLocalization("entity.Butterfly.name", "en_US", "Butterfly");
/* 4223 */     LanguageRegistry.instance().addStringLocalization("Butterfly", "en_US", "Butterfly");
/* 4224 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityButterfly.class, "Butterfly", ButterflyID, this, 32, 1, false);
/*      */     
/* 4226 */     EntityRegistry.instance(); LunaMothID = EntityRegistry.findGlobalUniqueEntityId();
/* 4227 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityLunaMoth.class, "Moth", LunaMothID);
/* 4228 */     LanguageRegistry.instance().addStringLocalization("entity.Moth.name", "en_US", "Moth");
/* 4229 */     LanguageRegistry.instance().addStringLocalization("Moth", "en_US", "Moth");
/* 4230 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityLunaMoth.class, "Moth", LunaMothID, this, 32, 1, false);
/*      */     
/* 4232 */     EntityRegistry.instance(); MosquitoID = EntityRegistry.findGlobalUniqueEntityId();
/* 4233 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityMosquito.class, "Mosquito", MosquitoID);
/* 4234 */     LanguageRegistry.instance().addStringLocalization("entity.Mosquito.name", "en_US", "Mosquito");
/* 4235 */     LanguageRegistry.instance().addStringLocalization("Mosquito", "en_US", "Mosquito");
/* 4236 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityMosquito.class, "Mosquito", MosquitoID, this, 16, 1, false);
/*      */     
/* 4238 */     EntityRegistry.instance(); FireflyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4239 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Firefly.class, "Firefly", FireflyID);
/* 4240 */     LanguageRegistry.instance().addStringLocalization("entity.Firefly.name", "en_US", "Firefly");
/* 4241 */     LanguageRegistry.instance().addStringLocalization("Firefly", "en_US", "Firefly");
/* 4242 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Firefly.class, "Firefly", FireflyID, this, 64, 1, false);
/*      */     
/* 4244 */     EntityRegistry.instance(); BeeID = EntityRegistry.findGlobalUniqueEntityId();
/* 4245 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Bee.class, "Bee", BeeID);
/* 4246 */     LanguageRegistry.instance().addStringLocalization("Bee", "en_US", "Bee");
/* 4247 */     LanguageRegistry.instance().addStringLocalization("entity.Bee.name", "en_US", "Bee");
/* 4248 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Bee.class, "Bee", BeeID, this, 64, 1, false);
/*      */     
/* 4250 */     EntityRegistry.instance(); MothraID = EntityRegistry.findGlobalUniqueEntityId();
/* 4251 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Mothra.class, "Mothra", MothraID);
/* 4252 */     LanguageRegistry.instance().addStringLocalization("Mothra", "en_US", "Mothra");
/* 4253 */     LanguageRegistry.instance().addStringLocalization("entity.Mothra.name", "en_US", "Mothra");
/* 4254 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Mothra.class, "Mothra", MothraID, this, 128, 1, false);
/*      */     
/* 4256 */     EntityRegistry.instance(); AntID = EntityRegistry.findGlobalUniqueEntityId();
/* 4257 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityAnt.class, "Ant", AntID);
/* 4258 */     LanguageRegistry.instance().addStringLocalization("entity.Ant.name", "en_US", "Ant");
/* 4259 */     LanguageRegistry.instance().addStringLocalization("Ant", "en_US", "Ant");
/* 4260 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityAnt.class, "Ant", AntID, this, 16, 1, false);
/* 4261 */     EntityRegistry.instance(); RedAntID = EntityRegistry.findGlobalUniqueEntityId();
/* 4262 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityRedAnt.class, "Red Ant", RedAntID);
/* 4263 */     LanguageRegistry.instance().addStringLocalization("entity.Red Ant.name", "en_US", "Red Ant");
/* 4264 */     LanguageRegistry.instance().addStringLocalization("Red Ant", "en_US", "Red Ant");
/* 4265 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityRedAnt.class, "Red Ant", RedAntID, this, 16, 1, false);
/* 4266 */     EntityRegistry.instance(); RainbowAntID = EntityRegistry.findGlobalUniqueEntityId();
/* 4267 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityRainbowAnt.class, "Rainbow Ant", RainbowAntID);
/* 4268 */     LanguageRegistry.instance().addStringLocalization("entity.Rainbow Ant.name", "en_US", "Rainbow Ant");
/* 4269 */     LanguageRegistry.instance().addStringLocalization("Rainbow Ant", "en_US", "Rainbow Ant");
/* 4270 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityRainbowAnt.class, "Rainbow Ant", RainbowAntID, this, 16, 1, false);
/* 4271 */     EntityRegistry.instance(); UnstableAntID = EntityRegistry.findGlobalUniqueEntityId();
/* 4272 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityUnstableAnt.class, "Unstable Ant", UnstableAntID);
/* 4273 */     LanguageRegistry.instance().addStringLocalization("entity.Unstable Ant.name", "en_US", "Unstable Ant");
/* 4274 */     LanguageRegistry.instance().addStringLocalization("Unstable Ant", "en_US", "Unstable Ant");
/* 4275 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityUnstableAnt.class, "Unstable Ant", UnstableAntID, this, 16, 1, false);
/*      */ 
/*      */     
/* 4278 */     EntityRegistry.instance(); Robot1ID = EntityRegistry.findGlobalUniqueEntityId();
/* 4279 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Robot1.class, "Bomb-Omb", Robot1ID);
/* 4280 */     LanguageRegistry.instance().addStringLocalization("entity.Bomb-Omb.name", "en_US", "Bomb-Omb");
/* 4281 */     LanguageRegistry.instance().addStringLocalization("Bomb-Omb", "en_US", "Bomb-Omb");
/* 4282 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Robot1.class, "Bomb-Omb", Robot1ID, this, 32, 1, false);
/*      */     
/* 4284 */     EntityRegistry.instance(); Robot2ID = EntityRegistry.findGlobalUniqueEntityId();
/* 4285 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Robot2.class, "Robo-Pounder", Robot2ID);
/* 4286 */     LanguageRegistry.instance().addStringLocalization("entity.Robo-Pounder.name", "en_US", "Robo-Pounder");
/* 4287 */     LanguageRegistry.instance().addStringLocalization("Robo-Pounder", "en_US", "Robo-Pounder");
/* 4288 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Robot2.class, "Robo-Pounder", Robot2ID, this, 64, 1, false);
/*      */     
/* 4290 */     EntityRegistry.instance(); Robot3ID = EntityRegistry.findGlobalUniqueEntityId();
/* 4291 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Robot3.class, "Robo-Gunner", Robot3ID);
/* 4292 */     LanguageRegistry.instance().addStringLocalization("entity.Robo-Gunner.name", "en_US", "Robo-Gunner");
/* 4293 */     LanguageRegistry.instance().addStringLocalization("Robo-Gunner", "en_US", "Robo-Gunner");
/* 4294 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Robot3.class, "Robo-Gunner", Robot3ID, this, 64, 1, false);
/*      */     
/* 4296 */     EntityRegistry.instance(); Robot4ID = EntityRegistry.findGlobalUniqueEntityId();
/* 4297 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Robot4.class, "Robo-Warrior", Robot4ID);
/* 4298 */     LanguageRegistry.instance().addStringLocalization("entity.Robo-Warrior.name", "en_US", "Robo-Warrior");
/* 4299 */     LanguageRegistry.instance().addStringLocalization("Robo-Warrior", "en_US", "Robo-Warrior");
/* 4300 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Robot4.class, "Robo-Warrior", Robot4ID, this, 64, 1, false);
/*      */     
/* 4302 */     EntityRegistry.instance(); Robot5ID = EntityRegistry.findGlobalUniqueEntityId();
/* 4303 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Robot5.class, "Robo-Sniper", Robot5ID);
/* 4304 */     LanguageRegistry.instance().addStringLocalization("entity.Robo-Sniper.name", "en_US", "Robo-Sniper");
/* 4305 */     LanguageRegistry.instance().addStringLocalization("Robo-Sniper", "en_US", "Robo-Sniper");
/* 4306 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Robot5.class, "Robo-Sniper", Robot5ID, this, 64, 1, false);
/*      */ 
/*      */     
/* 4309 */     EntityRegistry.instance(); AlosaurusID = EntityRegistry.findGlobalUniqueEntityId();
/* 4310 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Alosaurus.class, "Alosaurus", AlosaurusID);
/* 4311 */     LanguageRegistry.instance().addStringLocalization("Alosaurus", "en_US", "Alosaurus");
/* 4312 */     LanguageRegistry.instance().addStringLocalization("entity.Alosaurus.name", "en_US", "Alosaurus");
/* 4313 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Alosaurus.class, "Alosaurus", AlosaurusID, this, 64, 1, false);
/* 4314 */     EntityRegistry.instance(); CryolophosaurusID = EntityRegistry.findGlobalUniqueEntityId();
/* 4315 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Cryolophosaurus.class, "Cryolophosaurus", CryolophosaurusID);
/* 4316 */     LanguageRegistry.instance().addStringLocalization("Cryolophosaurus", "en_US", "Cryolophosaurus");
/* 4317 */     LanguageRegistry.instance().addStringLocalization("entity.Cryolophosaurus.name", "en_US", "Cryolophosaurus");
/* 4318 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Cryolophosaurus.class, "Cryolophosaurus", CryolophosaurusID, this, 64, 1, false);
/* 4319 */     EntityRegistry.instance(); BasiliskID = EntityRegistry.findGlobalUniqueEntityId();
/* 4320 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Basilisk.class, "Basilisk", BasiliskID);
/* 4321 */     LanguageRegistry.instance().addStringLocalization("Basilisk", "en_US", "Basilisk");
/* 4322 */     LanguageRegistry.instance().addStringLocalization("entity.Basilisk.name", "en_US", "Basilisk");
/* 4323 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Basilisk.class, "Basilisk", BasiliskID, this, 64, 1, false);
/* 4324 */     EntityRegistry.instance(); CamarasaurusID = EntityRegistry.findGlobalUniqueEntityId();
/* 4325 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Camarasaurus.class, "Camarasaurus", CamarasaurusID);
/* 4326 */     LanguageRegistry.instance().addStringLocalization("Camarasaurus", "en_US", "Camarasaurus");
/* 4327 */     LanguageRegistry.instance().addStringLocalization("entity.Camarasaurus.name", "en_US", "Camarasaurus");
/* 4328 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Camarasaurus.class, "Camarasaurus", CamarasaurusID, this, 64, 1, false);
/* 4329 */     EntityRegistry.instance(); HydroliscID = EntityRegistry.findGlobalUniqueEntityId();
/* 4330 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Hydrolisc.class, "Hydrolisc", HydroliscID);
/* 4331 */     LanguageRegistry.instance().addStringLocalization("Hydrolisc", "en_US", "Hydrolisc");
/* 4332 */     LanguageRegistry.instance().addStringLocalization("entity.Hydrolisc.name", "en_US", "Hydrolisc");
/* 4333 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Hydrolisc.class, "Hydrolisc", HydroliscID, this, 64, 1, false);
/* 4334 */     EntityRegistry.instance(); VelocityRaptorID = EntityRegistry.findGlobalUniqueEntityId();
/* 4335 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(VelocityRaptor.class, "Velocity Raptor", VelocityRaptorID);
/* 4336 */     LanguageRegistry.instance().addStringLocalization("Velocity Raptor", "en_US", "Velocity Raptor");
/* 4337 */     LanguageRegistry.instance().addStringLocalization("entity.Velocity Raptor.name", "en_US", "Velocity Raptor");
/* 4338 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(VelocityRaptor.class, "Velocity Raptor", VelocityRaptorID, this, 64, 1, false);
/*      */     
/* 4340 */     EntityRegistry.instance(); DragonflyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4341 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Dragonfly.class, "Dragonfly", DragonflyID);
/* 4342 */     LanguageRegistry.instance().addStringLocalization("Dragonfly", "en_US", "Dragonfly");
/* 4343 */     LanguageRegistry.instance().addStringLocalization("entity.Dragonfly.name", "en_US", "Dragonfly");
/* 4344 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Dragonfly.class, "Dragonfly", DragonflyID, this, 64, 1, false);
/*      */     
/* 4346 */     EntityRegistry.instance(); EmperorScorpionID = EntityRegistry.findGlobalUniqueEntityId();
/* 4347 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EmperorScorpion.class, "Emperor Scorpion", EmperorScorpionID);
/* 4348 */     LanguageRegistry.instance().addStringLocalization("Emperor Scorpion", "en_US", "Emperor Scorpion");
/* 4349 */     LanguageRegistry.instance().addStringLocalization("entity.Emperor Scorpion.name", "en_US", "Emperor Scorpion");
/* 4350 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EmperorScorpion.class, "Emperor Scorpion", EmperorScorpionID, this, 64, 1, false);
/*      */     
/* 4352 */     EntityRegistry.instance(); ScorpionID = EntityRegistry.findGlobalUniqueEntityId();
/* 4353 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Scorpion.class, "Scorpion", ScorpionID);
/* 4354 */     LanguageRegistry.instance().addStringLocalization("Scorpion", "en_US", "Scorpion");
/* 4355 */     LanguageRegistry.instance().addStringLocalization("entity.Scorpion.name", "en_US", "Scorpion");
/* 4356 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Scorpion.class, "Scorpion", ScorpionID, this, 32, 1, false);
/*      */     
/* 4358 */     EntityRegistry.instance(); CaveFisherID = EntityRegistry.findGlobalUniqueEntityId();
/* 4359 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(CaveFisher.class, "CaveFisher", CaveFisherID);
/* 4360 */     LanguageRegistry.instance().addStringLocalization("CaveFisher", "en_US", "CaveFisher");
/* 4361 */     LanguageRegistry.instance().addStringLocalization("entity.CaveFisher.name", "en_US", "CaveFisher");
/* 4362 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(CaveFisher.class, "CaveFisher", CaveFisherID, this, 32, 1, false);
/*      */     
/* 4364 */     EntityRegistry.instance(); SpyroID = EntityRegistry.findGlobalUniqueEntityId();
/* 4365 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Spyro.class, "Baby Dragon", SpyroID);
/* 4366 */     LanguageRegistry.instance().addStringLocalization("Baby Dragon", "en_US", "Baby Dragon");
/* 4367 */     LanguageRegistry.instance().addStringLocalization("entity.Baby Dragon.name", "en_US", "Baby Dragon");
/* 4368 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Spyro.class, "Baby Dragon", SpyroID, this, 64, 1, false);
/*      */     
/* 4370 */     EntityRegistry.instance(); BaryonyxID = EntityRegistry.findGlobalUniqueEntityId();
/* 4371 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Baryonyx.class, "Baryonyx", BaryonyxID);
/* 4372 */     LanguageRegistry.instance().addStringLocalization("Baryonyx", "en_US", "Baryonyx");
/* 4373 */     LanguageRegistry.instance().addStringLocalization("entity.Baryonyx.name", "en_US", "Baryonyx");
/* 4374 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Baryonyx.class, "Baryonyx", BaryonyxID, this, 64, 1, false);
/*      */     
/* 4376 */     EntityRegistry.instance(); GammaMetroidID = EntityRegistry.findGlobalUniqueEntityId();
/* 4377 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(GammaMetroid.class, "WTF?", GammaMetroidID);
/* 4378 */     LanguageRegistry.instance().addStringLocalization("WTF?", "en_US", "WTF?");
/* 4379 */     LanguageRegistry.instance().addStringLocalization("entity.WTF?.name", "en_US", "WTF?");
/* 4380 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(GammaMetroid.class, "WTF?", GammaMetroidID, this, 64, 1, false);
/*      */     
/* 4382 */     EntityRegistry.instance(); CockateilID = EntityRegistry.findGlobalUniqueEntityId();
/* 4383 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Cockateil.class, "Bird", CockateilID);
/* 4384 */     LanguageRegistry.instance().addStringLocalization("Bird", "en_US", "Bird");
/* 4385 */     LanguageRegistry.instance().addStringLocalization("entity.Bird.name", "en_US", "Bird");
/* 4386 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Cockateil.class, "Bird", CockateilID, this, 32, 1, false);
/*      */     
/* 4388 */     EntityRegistry.instance(); RubyBirdID = EntityRegistry.findGlobalUniqueEntityId();
/* 4389 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(RubyBird.class, "Ruby Bird", RubyBirdID);
/* 4390 */     LanguageRegistry.instance().addStringLocalization("Ruby Bird", "en_US", "Ruby Bird");
/* 4391 */     LanguageRegistry.instance().addStringLocalization("entity.Ruby Bird.name", "en_US", "Ruby Bird");
/* 4392 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(RubyBird.class, "Ruby Bird", RubyBirdID, this, 32, 1, false);
/*      */     
/* 4394 */     EntityRegistry.instance(); KyuubiID = EntityRegistry.findGlobalUniqueEntityId();
/* 4395 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Kyuubi.class, "Kyuubi", KyuubiID);
/* 4396 */     LanguageRegistry.instance().addStringLocalization("Kyuubi", "en_US", "Kyuubi");
/* 4397 */     LanguageRegistry.instance().addStringLocalization("entity.Kyuubi.name", "en_US", "Kyuubi");
/* 4398 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Kyuubi.class, "Kyuubi", KyuubiID, this, 64, 1, false);
/*      */     
/* 4400 */     EntityRegistry.instance(); WaterDragonID = EntityRegistry.findGlobalUniqueEntityId();
/* 4401 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(WaterDragon.class, "Water Dragon", WaterDragonID);
/* 4402 */     LanguageRegistry.instance().addStringLocalization("Water Dragon", "en_US", "Water Dragon");
/* 4403 */     LanguageRegistry.instance().addStringLocalization("entity.Water Dragon.name", "en_US", "Water Dragon");
/* 4404 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(WaterDragon.class, "Water Dragon", WaterDragonID, this, 64, 1, false);
/*      */     
/* 4406 */     EntityRegistry.instance(); AttackSquidID = EntityRegistry.findGlobalUniqueEntityId();
/* 4407 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(AttackSquid.class, "Attack Squid", AttackSquidID);
/* 4408 */     LanguageRegistry.instance().addStringLocalization("AttackSquid", "en_US", "Attack Squid");
/* 4409 */     LanguageRegistry.instance().addStringLocalization("entity.AttackSquid.name", "en_US", "Attack Squid");
/* 4410 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(AttackSquid.class, "Attack Squid", AttackSquidID, this, 32, 1, false);
/*      */     
/* 4412 */     EntityRegistry.instance(); AlienID = EntityRegistry.findGlobalUniqueEntityId();
/* 4413 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Alien.class, "Alien", AlienID);
/* 4414 */     LanguageRegistry.instance().addStringLocalization("Alien", "en_US", "Alien");
/* 4415 */     LanguageRegistry.instance().addStringLocalization("entity.Alien.name", "en_US", "Alien");
/* 4416 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Alien.class, "Alien", AlienID, this, 64, 1, false);
/*      */ 
/*      */     
/* 4419 */     EntityRegistry.instance(); ElevatorID = EntityRegistry.findGlobalUniqueEntityId();
/* 4420 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Elevator.class, "Hoverboard", ElevatorID);
/* 4421 */     LanguageRegistry.instance().addStringLocalization("Hoverboard", "en_US", "Hoverboard");
/* 4422 */     LanguageRegistry.instance().addStringLocalization("entity.Hoverboard.name", "en_US", "Hoverboard");
/*      */     
/* 4424 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Elevator.class, "Hoverboard", ElevatorID, this, 128, 1, true);
/*      */     
/* 4426 */     EntityRegistry.instance(); KrakenID = EntityRegistry.findGlobalUniqueEntityId();
/* 4427 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Kraken.class, "The Kraken", KrakenID);
/* 4428 */     LanguageRegistry.instance().addStringLocalization("The Kraken", "en_US", "The Kraken");
/* 4429 */     LanguageRegistry.instance().addStringLocalization("entity.The Kraken.name", "en_US", "The Kraken");
/* 4430 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Kraken.class, "The Kraken", KrakenID, this, 128, 1, false);
/*      */     
/* 4432 */     EntityRegistry.instance(); LizardID = EntityRegistry.findGlobalUniqueEntityId();
/* 4433 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Lizard.class, "Lizard", LizardID);
/* 4434 */     LanguageRegistry.instance().addStringLocalization("Lizard", "en_US", "Lizard");
/* 4435 */     LanguageRegistry.instance().addStringLocalization("entity.Lizard.name", "en_US", "Lizard");
/* 4436 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Lizard.class, "Lizard", LizardID, this, 64, 1, false);
/*      */     
/* 4438 */     EntityRegistry.instance(); CephadromeID = EntityRegistry.findGlobalUniqueEntityId();
/* 4439 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Cephadrome.class, "Cephadrome", CephadromeID);
/* 4440 */     LanguageRegistry.instance().addStringLocalization("Cephadrome", "en_US", "Cephadrome");
/* 4441 */     LanguageRegistry.instance().addStringLocalization("entity.Cephadrome.name", "en_US", "Cephadrome");
/*      */     
/* 4443 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Cephadrome.class, "Cephadrome", CephadromeID, this, 128, 1, true);
/*      */     
/* 4445 */     EntityRegistry.instance(); DragonID = EntityRegistry.findGlobalUniqueEntityId();
/* 4446 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Dragon.class, "Dragon", DragonID);
/* 4447 */     LanguageRegistry.instance().addStringLocalization("entity.Dragon.name", "en_US", "Dragon");
/* 4448 */     LanguageRegistry.instance().addStringLocalization("Dragon", "en_US", "Dragon");
/*      */     
/* 4450 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Dragon.class, "Dragon", DragonID, this, 128, 1, true);
/*      */     
/* 4452 */     EntityRegistry.instance(); ChipmunkID = EntityRegistry.findGlobalUniqueEntityId();
/* 4453 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Chipmunk.class, "Chipmunk", ChipmunkID);
/* 4454 */     LanguageRegistry.instance().addStringLocalization("Chipmunk", "en_US", "Chipmunk");
/* 4455 */     LanguageRegistry.instance().addStringLocalization("entity.Chipmunk.name", "en_US", "Chipmunk");
/* 4456 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Chipmunk.class, "Chipmunk", ChipmunkID, this, 32, 1, false);
/*      */     
/* 4458 */     EntityRegistry.instance(); GazelleID = EntityRegistry.findGlobalUniqueEntityId();
/* 4459 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Gazelle.class, "Gazelle", GazelleID);
/* 4460 */     LanguageRegistry.instance().addStringLocalization("Gazelle", "en_US", "Gazelle");
/* 4461 */     LanguageRegistry.instance().addStringLocalization("entity.Gazelle.name", "en_US", "Gazelle");
/* 4462 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Gazelle.class, "Gazelle", GazelleID, this, 64, 1, false);
/*      */     
/* 4464 */     EntityRegistry.instance(); OstrichID = EntityRegistry.findGlobalUniqueEntityId();
/* 4465 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Ostrich.class, "Ostrich", OstrichID);
/* 4466 */     LanguageRegistry.instance().addStringLocalization("Ostrich", "en_US", "Ostrich");
/* 4467 */     LanguageRegistry.instance().addStringLocalization("entity.Ostrich.name", "en_US", "Ostrich");
/*      */     
/* 4469 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Ostrich.class, "Ostrich", OstrichID, this, 64, 1, true);
/*      */     
/* 4471 */     EntityRegistry.instance(); TrooperBugID = EntityRegistry.findGlobalUniqueEntityId();
/* 4472 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(TrooperBug.class, "Jumpy Bug", TrooperBugID);
/* 4473 */     LanguageRegistry.instance().addStringLocalization("Jumpy Bug", "en_US", "Jumpy Bug");
/* 4474 */     LanguageRegistry.instance().addStringLocalization("entity.Jumpy Bug.name", "en_US", "Jumpy Bug");
/* 4475 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(TrooperBug.class, "Jumpy Bug", TrooperBugID, this, 64, 1, false);
/*      */     
/* 4477 */     EntityRegistry.instance(); SpitBugID = EntityRegistry.findGlobalUniqueEntityId();
/* 4478 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(SpitBug.class, "Spit Bug", SpitBugID);
/* 4479 */     LanguageRegistry.instance().addStringLocalization("Spit Bug", "en_US", "Spit Bug");
/* 4480 */     LanguageRegistry.instance().addStringLocalization("entity.Spit Bug.name", "en_US", "Spit Bug");
/* 4481 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(SpitBug.class, "Spit Bug", SpitBugID, this, 64, 1, false);
/*      */     
/* 4483 */     EntityRegistry.instance(); StinkBugID = EntityRegistry.findGlobalUniqueEntityId();
/* 4484 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(StinkBug.class, "Stink Bug", StinkBugID);
/* 4485 */     LanguageRegistry.instance().addStringLocalization("Stink Bug", "en_US", "Stink Bug");
/* 4486 */     LanguageRegistry.instance().addStringLocalization("entity.Stink Bug.name", "en_US", "Stink Bug");
/* 4487 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(StinkBug.class, "Stink Bug", StinkBugID, this, 32, 1, false);
/*      */     
/* 4489 */     EntityRegistry.instance(); TshirtID = EntityRegistry.findGlobalUniqueEntityId();
/* 4490 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Tshirt.class, "T-Shirt", TshirtID);
/* 4491 */     LanguageRegistry.instance().addStringLocalization("entity.T-Shirt.name", "en_US", "T-Shirt!");
/* 4492 */     LanguageRegistry.instance().addStringLocalization("T-Shirt", "en_US", "T-Shirt!");
/* 4493 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Tshirt.class, "T-Shirt", TshirtID, this, 32, 1, false);
/*      */     
/* 4495 */     EntityRegistry.instance(); IslandID = EntityRegistry.findGlobalUniqueEntityId();
/* 4496 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Island.class, "Island", IslandID);
/* 4497 */     LanguageRegistry.instance().addStringLocalization("Island", "en_US", "Light Floating Island");
/* 4498 */     LanguageRegistry.instance().addStringLocalization("entity.Island.name", "en_US", "Light Floating Island");
/* 4499 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Island.class, "Island", IslandID, this, 64, 1, false);
/*      */     
/* 4501 */     EntityRegistry.instance(); IslandTooID = EntityRegistry.findGlobalUniqueEntityId();
/* 4502 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(IslandToo.class, "IslandToo", IslandTooID);
/* 4503 */     LanguageRegistry.instance().addStringLocalization("IslandToo", "en_US", "Dark Floating Island");
/* 4504 */     LanguageRegistry.instance().addStringLocalization("entity.IslandToo.name", "en_US", "Dark Floating Island");
/* 4505 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(IslandToo.class, "IslandToo", IslandTooID, this, 64, 1, false);
/*      */     
/* 4507 */     EntityRegistry.instance(); CreepingHorrorID = EntityRegistry.findGlobalUniqueEntityId();
/* 4508 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(CreepingHorror.class, "Creeping Horror", CreepingHorrorID);
/* 4509 */     LanguageRegistry.instance().addStringLocalization("Creeping Horror", "en_US", "Creeping Horror");
/* 4510 */     LanguageRegistry.instance().addStringLocalization("entity.Creeping Horror.name", "en_US", "Creeping Horror");
/* 4511 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(CreepingHorror.class, "Creeping Horror", CreepingHorrorID, this, 64, 1, false);
/*      */     
/* 4513 */     EntityRegistry.instance(); TerribleTerrorID = EntityRegistry.findGlobalUniqueEntityId();
/* 4514 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(TerribleTerror.class, "Terrible Terror", TerribleTerrorID);
/* 4515 */     LanguageRegistry.instance().addStringLocalization("Terrible Terror", "en_US", "Terrible Terror");
/* 4516 */     LanguageRegistry.instance().addStringLocalization("entity.Terrible Terror.name", "en_US", "Terrible Terror");
/* 4517 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(TerribleTerror.class, "Terrible Terror", TerribleTerrorID, this, 64, 1, false);
/*      */     
/* 4519 */     EntityRegistry.instance(); CliffRacerID = EntityRegistry.findGlobalUniqueEntityId();
/* 4520 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(CliffRacer.class, "Cliff Racer", CliffRacerID);
/* 4521 */     LanguageRegistry.instance().addStringLocalization("Cliff Racer", "en_US", "Cliff Racer");
/* 4522 */     LanguageRegistry.instance().addStringLocalization("entity.Cliff Racer.name", "en_US", "Cliff Racer");
/* 4523 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(CliffRacer.class, "Cliff Racer", CliffRacerID, this, 32, 1, false);
/*      */     
/* 4525 */     EntityRegistry.instance(); TriffidID = EntityRegistry.findGlobalUniqueEntityId();
/* 4526 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Triffid.class, "Triffid", TriffidID);
/* 4527 */     LanguageRegistry.instance().addStringLocalization("Triffid", "en_US", "Triffid");
/* 4528 */     LanguageRegistry.instance().addStringLocalization("entity.Triffid.name", "en_US", "Triffid");
/* 4529 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Triffid.class, "Triffid", TriffidID, this, 64, 1, false);
/*      */     
/* 4531 */     EntityRegistry.instance(); PitchBlackID = EntityRegistry.findGlobalUniqueEntityId();
/* 4532 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(PitchBlack.class, "Nightmare", PitchBlackID);
/* 4533 */     LanguageRegistry.instance().addStringLocalization("Nightmare", "en_US", "Nightmare");
/* 4534 */     LanguageRegistry.instance().addStringLocalization("entity.Nightmare.name", "en_US", "Nightmare");
/* 4535 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(PitchBlack.class, "Nightmare", PitchBlackID, this, 64, 1, false);
/*      */     
/* 4537 */     EntityRegistry.instance(); LurkingTerrorID = EntityRegistry.findGlobalUniqueEntityId();
/* 4538 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(LurkingTerror.class, "Lurking Terror", LurkingTerrorID);
/* 4539 */     LanguageRegistry.instance().addStringLocalization("Lurking Terror", "en_US", "Lurking Terror");
/* 4540 */     LanguageRegistry.instance().addStringLocalization("entity.Lurking Terror.name", "en_US", "Lurking Terror");
/* 4541 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(LurkingTerror.class, "Lurking Terror", LurkingTerrorID, this, 64, 1, false);
/*      */     
/* 4543 */     EntityRegistry.instance(); GodzillaID = EntityRegistry.findGlobalUniqueEntityId();
/* 4544 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Godzilla.class, "Mobzilla", GodzillaID);
/* 4545 */     LanguageRegistry.instance().addStringLocalization("Mobzilla", "en_US", "Mobzilla");
/* 4546 */     LanguageRegistry.instance().addStringLocalization("entity.Mobzilla.name", "en_US", "Mobzilla");
/* 4547 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Godzilla.class, "Mobzilla", GodzillaID, this, 128, 1, false);
/*      */ 
/*      */     
/* 4550 */     EntityRegistry.instance(); GhostID = EntityRegistry.findGlobalUniqueEntityId();
/* 4551 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Ghost.class, "Ghost", GhostID);
/* 4552 */     LanguageRegistry.instance().addStringLocalization("entity.Ghost.name", "en_US", "Ghost");
/* 4553 */     LanguageRegistry.instance().addStringLocalization("Ghost", "en_US", "Ghost");
/* 4554 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Ghost.class, "Ghost", GhostID, this, 32, 1, false);
/*      */ 
/*      */     
/* 4557 */     EntityRegistry.instance(); GhostSkellyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4558 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(GhostSkelly.class, "Ghost Pumpkin Skelly", GhostSkellyID);
/* 4559 */     LanguageRegistry.instance().addStringLocalization("entity.Ghost Pumpkin Skelly.name", "en_US", "Ghost Pumpkin Skelly");
/* 4560 */     LanguageRegistry.instance().addStringLocalization("Ghost Pumpkin Skelly", "en_US", "Ghost Pumpkin Skelly");
/* 4561 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(GhostSkelly.class, "Ghost Pumpkin Skelly", GhostSkellyID, this, 64, 1, false);
/*      */ 
/*      */     
/* 4564 */     EntityRegistry.instance(); WormSmallID = EntityRegistry.findGlobalUniqueEntityId();
/* 4565 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(WormSmall.class, "Small Worm", WormSmallID);
/* 4566 */     LanguageRegistry.instance().addStringLocalization("Small Worm", "en_US", "Small Worm");
/* 4567 */     LanguageRegistry.instance().addStringLocalization("entity.Small Worm.name", "en_US", "Small Worm");
/* 4568 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(WormSmall.class, "Small Worm", WormSmallID, this, 32, 1, false);
/*      */     
/* 4570 */     EntityRegistry.instance(); WormMediumID = EntityRegistry.findGlobalUniqueEntityId();
/* 4571 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(WormMedium.class, "Medium Worm", WormMediumID);
/* 4572 */     LanguageRegistry.instance().addStringLocalization("Medium Worm", "en_US", "Medium Worm");
/* 4573 */     LanguageRegistry.instance().addStringLocalization("entity.Medium Worm.name", "en_US", "Medium Worm");
/* 4574 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(WormMedium.class, "Medium Worm", WormMediumID, this, 64, 1, false);
/*      */     
/* 4576 */     EntityRegistry.instance(); WormLargeID = EntityRegistry.findGlobalUniqueEntityId();
/* 4577 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(WormLarge.class, "Large Worm", WormLargeID);
/* 4578 */     LanguageRegistry.instance().addStringLocalization("Large Worm", "en_US", "Large Worm");
/* 4579 */     LanguageRegistry.instance().addStringLocalization("entity.Large Worm.name", "en_US", "Large Worm");
/* 4580 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(WormLarge.class, "Large Worm", WormLargeID, this, 64, 1, false);
/*      */ 
/*      */     
/* 4583 */     EntityRegistry.instance(); CassowaryID = EntityRegistry.findGlobalUniqueEntityId();
/* 4584 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Cassowary.class, "Cassowary", CassowaryID);
/* 4585 */     LanguageRegistry.instance().addStringLocalization("Cassowary", "en_US", "Cassowary");
/* 4586 */     LanguageRegistry.instance().addStringLocalization("entity.Cassowary.name", "en_US", "Cassowary");
/* 4587 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Cassowary.class, "Cassowary", CassowaryID, this, 64, 1, false);
/*      */     
/* 4589 */     EntityRegistry.instance(); CloudSharkID = EntityRegistry.findGlobalUniqueEntityId();
/* 4590 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(CloudShark.class, "Cloud Shark", CloudSharkID);
/* 4591 */     LanguageRegistry.instance().addStringLocalization("Cloud Shark", "en_US", "Cloud Shark");
/* 4592 */     LanguageRegistry.instance().addStringLocalization("entity.Cloud Shark.name", "en_US", "Cloud Shark");
/* 4593 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(CloudShark.class, "Cloud Shark", CloudSharkID, this, 64, 1, false);
/*      */     
/* 4595 */     EntityRegistry.instance(); GoldFishID = EntityRegistry.findGlobalUniqueEntityId();
/* 4596 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(GoldFish.class, "Gold Fish", GoldFishID);
/* 4597 */     LanguageRegistry.instance().addStringLocalization("Gold Fish", "en_US", "Goldfish");
/* 4598 */     LanguageRegistry.instance().addStringLocalization("entity.Gold Fish.name", "en_US", "Goldfish");
/* 4599 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(GoldFish.class, "Gold Fish", GoldFishID, this, 32, 1, false);
/*      */     
/* 4601 */     EntityRegistry.instance(); LeafMonsterID = EntityRegistry.findGlobalUniqueEntityId();
/* 4602 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(LeafMonster.class, "Leaf Monster", LeafMonsterID);
/* 4603 */     LanguageRegistry.instance().addStringLocalization("Leaf Monster", "en_US", "LeafMonster");
/* 4604 */     LanguageRegistry.instance().addStringLocalization("entity.Leaf Monster.name", "en_US", "LeafMonster");
/* 4605 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(LeafMonster.class, "Leaf Monster", LeafMonsterID, this, 64, 1, false);
/*      */     
/* 4607 */     EntityRegistry.instance(); GodzillaHeadID = EntityRegistry.findGlobalUniqueEntityId();
/* 4608 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(GodzillaHead.class, "MobzillaHead", GodzillaHeadID);
/* 4609 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(GodzillaHead.class, "MobzillaHead", GodzillaHeadID, this, 128, 10, true);
/*      */     
/* 4611 */     EntityRegistry.instance(); EnderKnightID = EntityRegistry.findGlobalUniqueEntityId();
/* 4612 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EnderKnight.class, "Ender Knight", EnderKnightID);
/* 4613 */     LanguageRegistry.instance().addStringLocalization("Ender Knight", "en_US", "Ender Knight");
/* 4614 */     LanguageRegistry.instance().addStringLocalization("entity.Ender Knight.name", "en_US", "Ender Knight");
/* 4615 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EnderKnight.class, "Ender Knight", EnderKnightID, this, 64, 1, false);
/*      */     
/* 4617 */     EntityRegistry.instance(); EnderReaperID = EntityRegistry.findGlobalUniqueEntityId();
/* 4618 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EnderReaper.class, "Ender Reaper", EnderReaperID);
/* 4619 */     LanguageRegistry.instance().addStringLocalization("Ender Reaper", "en_US", "Ender Reaper");
/* 4620 */     LanguageRegistry.instance().addStringLocalization("entity.Ender Reaper.name", "en_US", "Ender Reaper");
/* 4621 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EnderReaper.class, "Ender Reaper", EnderReaperID, this, 64, 1, false);
/*      */     
/* 4623 */     EntityRegistry.instance(); BeaverID = EntityRegistry.findGlobalUniqueEntityId();
/* 4624 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Beaver.class, "Beaver", BeaverID);
/* 4625 */     LanguageRegistry.instance().addStringLocalization("Beaver", "en_US", "Beaver");
/* 4626 */     LanguageRegistry.instance().addStringLocalization("entity.Beaver.name", "en_US", "Beaver");
/* 4627 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Beaver.class, "Beaver", BeaverID, this, 64, 1, false);
/*      */     
/* 4629 */     EntityRegistry.instance(); TermiteID = EntityRegistry.findGlobalUniqueEntityId();
/* 4630 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Termite.class, "Termite", TermiteID);
/* 4631 */     LanguageRegistry.instance().addStringLocalization("Termite", "en_US", "Termite");
/* 4632 */     LanguageRegistry.instance().addStringLocalization("entity.Termite.name", "en_US", "Termite");
/* 4633 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Termite.class, "Termite", TermiteID, this, 32, 1, false);
/*      */     
/* 4635 */     EntityRegistry.instance(); FairyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4636 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Fairy.class, "Fairy", FairyID);
/* 4637 */     LanguageRegistry.instance().addStringLocalization("Fairy", "en_US", "Fairy");
/* 4638 */     LanguageRegistry.instance().addStringLocalization("entity.Fairy.name", "en_US", "Fairy");
/* 4639 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Fairy.class, "Fairy", FairyID, this, 32, 1, false);
/*      */     
/* 4641 */     EntityRegistry.instance(); PeacockID = EntityRegistry.findGlobalUniqueEntityId();
/* 4642 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Peacock.class, "Peacock", PeacockID);
/* 4643 */     LanguageRegistry.instance().addStringLocalization("Peacock", "en_US", "Peacock");
/* 4644 */     LanguageRegistry.instance().addStringLocalization("entity.Peacock.name", "en_US", "Peacock");
/* 4645 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Peacock.class, "Peacock", PeacockID, this, 64, 1, false);
/*      */     
/* 4647 */     EntityRegistry.instance(); RotatorID = EntityRegistry.findGlobalUniqueEntityId();
/* 4648 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Rotator.class, "Rotator", RotatorID);
/* 4649 */     LanguageRegistry.instance().addStringLocalization("Rotator", "en_US", "Rotator");
/* 4650 */     LanguageRegistry.instance().addStringLocalization("entity.Rotator.name", "en_US", "Rotator");
/* 4651 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Rotator.class, "Rotator", RotatorID, this, 64, 1, false);
/*      */     
/* 4653 */     EntityRegistry.instance(); VortexID = EntityRegistry.findGlobalUniqueEntityId();
/* 4654 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Vortex.class, "Vortex", VortexID);
/* 4655 */     LanguageRegistry.instance().addStringLocalization("Vortex", "en_US", "Vortex");
/* 4656 */     LanguageRegistry.instance().addStringLocalization("entity.Vortex.name", "en_US", "Vortex");
/* 4657 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Vortex.class, "Vortex", VortexID, this, 64, 1, false);
/*      */     
/* 4659 */     EntityRegistry.instance(); DungeonBeastID = EntityRegistry.findGlobalUniqueEntityId();
/* 4660 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(DungeonBeast.class, "Dungeon Beast", DungeonBeastID);
/* 4661 */     LanguageRegistry.instance().addStringLocalization("Dungeon Beast", "en_US", "Dungeon Beast");
/* 4662 */     LanguageRegistry.instance().addStringLocalization("entity.Dungeon Beast.name", "en_US", "Dungeon Beast");
/* 4663 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(DungeonBeast.class, "Dungeon Beast", DungeonBeastID, this, 64, 1, false);
/*      */     
/* 4665 */     EntityRegistry.instance(); RatID = EntityRegistry.findGlobalUniqueEntityId();
/* 4666 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Rat.class, "Rat", RatID);
/* 4667 */     LanguageRegistry.instance().addStringLocalization("Rat", "en_US", "Rat");
/* 4668 */     LanguageRegistry.instance().addStringLocalization("entity.Rat.name", "en_US", "Rat");
/* 4669 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Rat.class, "Rat", RatID, this, 32, 1, false);
/*      */     
/* 4671 */     EntityRegistry.instance(); FlounderID = EntityRegistry.findGlobalUniqueEntityId();
/* 4672 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Flounder.class, "Flounder", FlounderID);
/* 4673 */     LanguageRegistry.instance().addStringLocalization("Flounder", "en_US", "Flounder");
/* 4674 */     LanguageRegistry.instance().addStringLocalization("entity.Flounder.name", "en_US", "Flounder");
/* 4675 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Flounder.class, "Flounder", FlounderID, this, 32, 1, false);
/*      */     
/* 4677 */     EntityRegistry.instance(); WhaleID = EntityRegistry.findGlobalUniqueEntityId();
/* 4678 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Whale.class, "Whale", WhaleID);
/* 4679 */     LanguageRegistry.instance().addStringLocalization("Whale", "en_US", "Whale");
/* 4680 */     LanguageRegistry.instance().addStringLocalization("entity.Whale.name", "en_US", "Whale");
/* 4681 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Whale.class, "Whale", WhaleID, this, 64, 1, false);
/*      */     
/* 4683 */     EntityRegistry.instance(); IrukandjiID = EntityRegistry.findGlobalUniqueEntityId();
/* 4684 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Irukandji.class, "Irukandji", IrukandjiID);
/* 4685 */     LanguageRegistry.instance().addStringLocalization("Irukandji", "en_US", "Irukandji");
/* 4686 */     LanguageRegistry.instance().addStringLocalization("entity.Irukandji.name", "en_US", "Irukandji");
/* 4687 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Irukandji.class, "Irukandji", IrukandjiID, this, 32, 1, false);
/*      */     
/* 4689 */     EntityRegistry.instance(); SkateID = EntityRegistry.findGlobalUniqueEntityId();
/* 4690 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Skate.class, "Skate", SkateID);
/* 4691 */     LanguageRegistry.instance().addStringLocalization("Skate", "en_US", "Skate");
/* 4692 */     LanguageRegistry.instance().addStringLocalization("entity.Skate.name", "en_US", "Skate");
/* 4693 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Skate.class, "Skate", SkateID, this, 32, 1, false);
/*      */     
/* 4695 */     EntityRegistry.instance(); UrchinID = EntityRegistry.findGlobalUniqueEntityId();
/* 4696 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Urchin.class, "Crystal Urchin", UrchinID);
/* 4697 */     LanguageRegistry.instance().addStringLocalization("Crystal Urchin", "en_US", "Crystal Urchin");
/* 4698 */     LanguageRegistry.instance().addStringLocalization("entity.Crystal Urchin.name", "en_US", "Crystal Urchin");
/* 4699 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Urchin.class, "Crystal Urchin", UrchinID, this, 64, 1, false);
/*      */ 
/*      */     
/* 4702 */     EntityRegistry.instance(); MantisID = EntityRegistry.findGlobalUniqueEntityId();
/* 4703 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Mantis.class, "Mantis", MantisID);
/* 4704 */     LanguageRegistry.instance().addStringLocalization("Mantis", "en_US", "Mantis");
/* 4705 */     LanguageRegistry.instance().addStringLocalization("entity.Mantis.name", "en_US", "Mantis");
/* 4706 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Mantis.class, "Mantis", MantisID, this, 64, 1, false);
/*      */ 
/*      */     
/* 4709 */     EntityRegistry.instance(); HerculesBeetleID = EntityRegistry.findGlobalUniqueEntityId();
/* 4710 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(HerculesBeetle.class, "Hercules Beetle", HerculesBeetleID);
/* 4711 */     LanguageRegistry.instance().addStringLocalization("Hercules Beetle", "en_US", "Hercules Beetle");
/* 4712 */     LanguageRegistry.instance().addStringLocalization("entity.Hercules Beetle.name", "en_US", "Hercules Beetle");
/* 4713 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(HerculesBeetle.class, "Hercules Beetle", HerculesBeetleID, this, 64, 1, false);
/*      */     
/* 4715 */     EntityRegistry.instance(); TRexID = EntityRegistry.findGlobalUniqueEntityId();
/* 4716 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(TRex.class, "T. Rex", TRexID);
/* 4717 */     LanguageRegistry.instance().addStringLocalization("T. Rex", "en_US", "T. Rex");
/* 4718 */     LanguageRegistry.instance().addStringLocalization("entity.T. Rex.name", "en_US", "T. Rex");
/* 4719 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(TRex.class, "T. Rex", TRexID, this, 64, 1, false);
/*      */     
/* 4721 */     EntityRegistry.instance(); StinkyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4722 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Stinky.class, "Stinky", StinkyID);
/* 4723 */     LanguageRegistry.instance().addStringLocalization("Stinky", "en_US", "Stinky");
/* 4724 */     LanguageRegistry.instance().addStringLocalization("entity.Stinky.name", "en_US", "Stinky");
/* 4725 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Stinky.class, "Stinky", StinkyID, this, 64, 1, false);
/*      */     
/* 4727 */     EntityRegistry.instance(); CoinID = EntityRegistry.findGlobalUniqueEntityId();
/* 4728 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Coin.class, "Coin", CoinID);
/* 4729 */     LanguageRegistry.instance().addStringLocalization("entity.Coin.name", "en_US", "Coin!");
/* 4730 */     LanguageRegistry.instance().addStringLocalization("Coin", "en_US", "Coin!");
/* 4731 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Coin.class, "Coin", CoinID, this, 64, 1, false);
/*      */ 
/*      */     
/* 4734 */     EntityRegistry.instance(); TheKingID = EntityRegistry.findGlobalUniqueEntityId();
/* 4735 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(TheKing.class, "The King", TheKingID);
/* 4736 */     LanguageRegistry.instance().addStringLocalization("The King", "en_US", "The King");
/* 4737 */     LanguageRegistry.instance().addStringLocalization("entity.The King.name", "en_US", "The King");
/* 4738 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(TheKing.class, "The King", TheKingID, this, 128, 1, false);
/*      */     
/* 4740 */     EntityRegistry.instance(); KingHeadID = EntityRegistry.findGlobalUniqueEntityId();
/* 4741 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(KingHead.class, "KingHead", KingHeadID);
/* 4742 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(KingHead.class, "KingHead", KingHeadID, this, 128, 10, true);
/*      */     
/* 4744 */     EntityRegistry.instance(); TheQueenID = EntityRegistry.findGlobalUniqueEntityId();
/* 4745 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(TheQueen.class, "The Queen", TheQueenID);
/* 4746 */     LanguageRegistry.instance().addStringLocalization("The Queen", "en_US", "The Queen");
/* 4747 */     LanguageRegistry.instance().addStringLocalization("entity.The Queen.name", "en_US", "The Queen");
/* 4748 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(TheQueen.class, "The Queen", TheQueenID, this, 128, 1, false);
/*      */     
/* 4750 */     EntityRegistry.instance(); QueenHeadID = EntityRegistry.findGlobalUniqueEntityId();
/* 4751 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(QueenHead.class, "QueenHead", QueenHeadID);
/* 4752 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(QueenHead.class, "QueenHead", QueenHeadID, this, 128, 10, true);
/*      */     
/* 4754 */     EntityRegistry.instance(); BoyfriendID = EntityRegistry.findGlobalUniqueEntityId();
/* 4755 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Boyfriend.class, "Boyfriend", BoyfriendID);
/* 4756 */     LanguageRegistry.instance().addStringLocalization("Boyfriend", "en_US", "Boyfriend");
/* 4757 */     LanguageRegistry.instance().addStringLocalization("entity.Boyfriend.name", "en_US", "Boyfriend");
/* 4758 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Boyfriend.class, "Boyfriend", BoyfriendID, this, 64, 1, false);
/*      */     
/* 4760 */     EntityRegistry.instance(); ThePrinceID = EntityRegistry.findGlobalUniqueEntityId();
/* 4761 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(ThePrince.class, "The Prince", ThePrinceID);
/* 4762 */     LanguageRegistry.instance().addStringLocalization("The Prince", "en_US", "The Prince");
/* 4763 */     LanguageRegistry.instance().addStringLocalization("entity.The Prince.name", "en_US", "The Prince");
/* 4764 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(ThePrince.class, "The Prince", ThePrinceID, this, 64, 1, false);
/*      */     
/* 4766 */     EntityRegistry.instance(); MolenoidID = EntityRegistry.findGlobalUniqueEntityId();
/* 4767 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Molenoid.class, "Molenoid", MolenoidID);
/* 4768 */     LanguageRegistry.instance().addStringLocalization("Molenoid", "en_US", "Molenoid");
/* 4769 */     LanguageRegistry.instance().addStringLocalization("entity.Molenoid.name", "en_US", "Molenoid");
/* 4770 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Molenoid.class, "Molenoid", MolenoidID, this, 64, 1, false);
/*      */     
/* 4772 */     EntityRegistry.instance(); SeaMonsterID = EntityRegistry.findGlobalUniqueEntityId();
/* 4773 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(SeaMonster.class, "Sea Monster", SeaMonsterID);
/* 4774 */     LanguageRegistry.instance().addStringLocalization("Sea Monster", "en_US", "Sea Monster");
/* 4775 */     LanguageRegistry.instance().addStringLocalization("entity.Sea Monster.name", "en_US", "Sea Monster");
/* 4776 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(SeaMonster.class, "Sea Monster", SeaMonsterID, this, 64, 1, false);
/*      */     
/* 4778 */     EntityRegistry.instance(); SeaViperID = EntityRegistry.findGlobalUniqueEntityId();
/* 4779 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(SeaViper.class, "Sea Viper", SeaViperID);
/* 4780 */     LanguageRegistry.instance().addStringLocalization("Sea Viper", "en_US", "Sea Viper");
/* 4781 */     LanguageRegistry.instance().addStringLocalization("entity.Sea Viper.name", "en_US", "Sea Viper");
/* 4782 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(SeaViper.class, "Sea Viper", SeaViperID, this, 64, 1, false);
/*      */     
/* 4784 */     EntityRegistry.instance(); EasterBunnyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4785 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EasterBunny.class, "Easter Bunny", EasterBunnyID);
/* 4786 */     LanguageRegistry.instance().addStringLocalization("Easter Bunny", "en_US", "Easter Bunny");
/* 4787 */     LanguageRegistry.instance().addStringLocalization("entity.Easter Bunny.name", "en_US", "Easter Bunny");
/* 4788 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EasterBunny.class, "EasterBunny", EasterBunnyID, this, 64, 1, false);
/*      */     
/* 4790 */     EntityRegistry.instance(); CaterKillerID = EntityRegistry.findGlobalUniqueEntityId();
/* 4791 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(CaterKiller.class, "CaterKiller", CaterKillerID);
/* 4792 */     LanguageRegistry.instance().addStringLocalization("CaterKiller", "en_US", "CaterKiller");
/* 4793 */     LanguageRegistry.instance().addStringLocalization("entity.CaterKiller.name", "en_US", "CaterKiller");
/* 4794 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(CaterKiller.class, "CaterKiller", CaterKillerID, this, 64, 1, false);
/*      */     
/* 4796 */     EntityRegistry.instance(); CrystalCowID = EntityRegistry.findGlobalUniqueEntityId();
/* 4797 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(CrystalCow.class, "Crystal Apple Cow", CrystalCowID);
/* 4798 */     LanguageRegistry.instance().addStringLocalization("Crystal Apple Cow", "en_US", "Crystal Apple Cow");
/* 4799 */     LanguageRegistry.instance().addStringLocalization("entity.Crystal Apple Cow.name", "en_US", "Crystal Apple Cow");
/* 4800 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(CrystalCow.class, "Crystal Apple Cow", CrystalCowID, this, 64, 1, false);
/*      */     
/* 4802 */     EntityRegistry.instance(); LeonID = EntityRegistry.findGlobalUniqueEntityId();
/* 4803 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Leon.class, "Leonopteryx", LeonID);
/* 4804 */     LanguageRegistry.instance().addStringLocalization("Leonopteryx", "en_US", "Leonopteryx");
/* 4805 */     LanguageRegistry.instance().addStringLocalization("entity.Leonopteryx.name", "en_US", "Leonopteryx");
/* 4806 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Leon.class, "Leonopteryx", LeonID, this, 64, 1, false);
/*      */     
/* 4808 */     EntityRegistry.instance(); HammerheadID = EntityRegistry.findGlobalUniqueEntityId();
/* 4809 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Hammerhead.class, "Hammerhead", HammerheadID);
/* 4810 */     LanguageRegistry.instance().addStringLocalization("Hammerhead", "en_US", "Hammerhead");
/* 4811 */     LanguageRegistry.instance().addStringLocalization("entity.Hammerhead.name", "en_US", "Hammerhead");
/* 4812 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Hammerhead.class, "Hammerhead", HammerheadID, this, 64, 1, false);
/*      */     
/* 4814 */     EntityRegistry.instance(); RubberDuckyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4815 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(RubberDucky.class, "Rubber Ducky", RubberDuckyID);
/* 4816 */     LanguageRegistry.instance().addStringLocalization("Rubber Ducky", "en_US", "Rubber Ducky");
/* 4817 */     LanguageRegistry.instance().addStringLocalization("entity.Rubber Ducky.name", "en_US", "Rubber Ducky");
/* 4818 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(RubberDucky.class, "Rubber Ducky", RubberDuckyID, this, 64, 1, false);
/*      */     
/* 4820 */     EntityRegistry.instance(); ThePrinceTeenID = EntityRegistry.findGlobalUniqueEntityId();
/* 4821 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(ThePrinceTeen.class, "The Young Prince", ThePrinceTeenID);
/* 4822 */     LanguageRegistry.instance().addStringLocalization("The Young Prince", "en_US", "The Young Prince");
/* 4823 */     LanguageRegistry.instance().addStringLocalization("entity.The Young Prince.name", "en_US", "The Young Prince");
/* 4824 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(ThePrinceTeen.class, "The Young Prince", ThePrinceTeenID, this, 64, 1, false);
/*      */     
/* 4826 */     EntityRegistry.instance(); BandPID = EntityRegistry.findGlobalUniqueEntityId();
/* 4827 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(BandP.class, "Criminal", BandPID);
/* 4828 */     LanguageRegistry.instance().addStringLocalization("Criminal", "en_US", "Criminal");
/* 4829 */     LanguageRegistry.instance().addStringLocalization("entity.Criminal.name", "en_US", "Criminal");
/* 4830 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(BandP.class, "Criminal", BandPID, this, 64, 1, false);
/*      */     
/* 4832 */     EntityRegistry.instance(); RockBaseID = EntityRegistry.findGlobalUniqueEntityId();
/* 4833 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(RockBase.class, "Rock", RockBaseID, 1118481, 16777215);
/* 4834 */     LanguageRegistry.instance().addStringLocalization("Rock", "en_US", "Rock");
/* 4835 */     LanguageRegistry.instance().addStringLocalization("entity.Rock.name", "en_US", "Rock");
/* 4836 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(RockBase.class, "Rock", RockBaseID, this, 32, 1, false);
/*      */     
/* 4838 */     EntityRegistry.instance(); BrutalflyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4839 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Brutalfly.class, "Brutalfly", BrutalflyID);
/* 4840 */     LanguageRegistry.instance().addStringLocalization("Brutalfly", "en_US", "Brutalfly");
/* 4841 */     LanguageRegistry.instance().addStringLocalization("entity.Brutalfly.name", "en_US", "Brutalfly");
/* 4842 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Brutalfly.class, "Brutalfly", BrutalflyID, this, 128, 1, false);
/*      */     
/* 4844 */     EntityRegistry.instance(); NastysaurusID = EntityRegistry.findGlobalUniqueEntityId();
/* 4845 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Nastysaurus.class, "Nastysaurus", NastysaurusID);
/* 4846 */     LanguageRegistry.instance().addStringLocalization("Nastysaurus", "en_US", "Nastysaurus");
/* 4847 */     LanguageRegistry.instance().addStringLocalization("entity.Nastysaurus.name", "en_US", "Nastysaurus");
/* 4848 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Nastysaurus.class, "Nastysaurus", NastysaurusID, this, 128, 1, false);
/*      */     
/* 4850 */     EntityRegistry.instance(); PointysaurusID = EntityRegistry.findGlobalUniqueEntityId();
/* 4851 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Pointysaurus.class, "Pointysaurus", PointysaurusID);
/* 4852 */     LanguageRegistry.instance().addStringLocalization("Pointysaurus", "en_US", "Pointysaurus");
/* 4853 */     LanguageRegistry.instance().addStringLocalization("entity.Pointysaurus.name", "en_US", "Pointysaurus");
/* 4854 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Pointysaurus.class, "Pointysaurus", PointysaurusID, this, 64, 1, false);
/*      */     
/* 4856 */     EntityRegistry.instance(); CricketID = EntityRegistry.findGlobalUniqueEntityId();
/* 4857 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Cricket.class, "Cricket", CricketID);
/* 4858 */     LanguageRegistry.instance().addStringLocalization("Cricket", "en_US", "Cricket");
/* 4859 */     LanguageRegistry.instance().addStringLocalization("entity.Cricket.name", "en_US", "Cricket");
/* 4860 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Cricket.class, "Cricket", CricketID, this, 32, 1, false);
/*      */     
/* 4862 */     EntityRegistry.instance(); ThePrincessID = EntityRegistry.findGlobalUniqueEntityId();
/* 4863 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(ThePrincess.class, "The Princess", ThePrincessID);
/* 4864 */     LanguageRegistry.instance().addStringLocalization("The Princess", "en_US", "The Princess");
/* 4865 */     LanguageRegistry.instance().addStringLocalization("entity.The Princess.name", "en_US", "The Princess");
/* 4866 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(ThePrincess.class, "The Princess", ThePrincessID, this, 64, 1, false);
/*      */     
/* 4868 */     EntityRegistry.instance(); FrogID = EntityRegistry.findGlobalUniqueEntityId();
/* 4869 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Frog.class, "Frog", FrogID);
/* 4870 */     LanguageRegistry.instance().addStringLocalization("Frog", "en_US", "Frog");
/* 4871 */     LanguageRegistry.instance().addStringLocalization("entity.Frog.name", "en_US", "Frog");
/* 4872 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Frog.class, "Frog", FrogID, this, 32, 1, false);
/*      */     
/* 4874 */     EntityRegistry.instance(); ThePrinceAdultID = EntityRegistry.findGlobalUniqueEntityId();
/* 4875 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(ThePrinceAdult.class, "The Young Adult Prince", ThePrinceAdultID);
/* 4876 */     LanguageRegistry.instance().addStringLocalization("The Young Adult Prince", "en_US", "The Young Adult Prince");
/* 4877 */     LanguageRegistry.instance().addStringLocalization("entity.The Young Adult Prince.name", "en_US", "The Young Adult Prince");
/* 4878 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(ThePrinceAdult.class, "The Young Adult Prince", ThePrinceAdultID, this, 128, 1, false);
/*      */     
/* 4880 */     EntityRegistry.instance(); SpiderRobotID = EntityRegistry.findGlobalUniqueEntityId();
/* 4881 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(SpiderRobot.class, "Robot Spider", SpiderRobotID);
/* 4882 */     LanguageRegistry.instance().addStringLocalization("entity.Robot Spider.name", "en_US", "Robot Spider");
/* 4883 */     LanguageRegistry.instance().addStringLocalization("Robot Spider", "en_US", "Robot Spider");
/* 4884 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(SpiderRobot.class, "Robot Spider", SpiderRobotID, this, 128, 1, false);
/*      */     
/* 4886 */     EntityRegistry.instance(); SpiderDriverID = EntityRegistry.findGlobalUniqueEntityId();
/* 4887 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(SpiderDriver.class, "Spider Driver", SpiderDriverID);
/* 4888 */     LanguageRegistry.instance().addStringLocalization("entity.Spider Driver.name", "en_US", "Spider Driver");
/* 4889 */     LanguageRegistry.instance().addStringLocalization("Spider Driver", "en_US", "Spider Driver");
/* 4890 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(SpiderDriver.class, "Spider Driver", SpiderDriverID, this, 64, 1, false);
/*      */     
/* 4892 */     EntityRegistry.instance(); JefferyID = EntityRegistry.findGlobalUniqueEntityId();
/* 4893 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(GiantRobot.class, "Jeffery", JefferyID);
/* 4894 */     LanguageRegistry.instance().addStringLocalization("entity.Jeffery.name", "en_US", "Jeffery");
/* 4895 */     LanguageRegistry.instance().addStringLocalization("Jeffery", "en_US", "Jeffery");
/* 4896 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(GiantRobot.class, "Jeffery", JefferyID, this, 128, 1, false);
/*      */     
/* 4898 */     EntityRegistry.instance(); AntRobotID = EntityRegistry.findGlobalUniqueEntityId();
/* 4899 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(AntRobot.class, "Robot Red Ant", AntRobotID);
/* 4900 */     LanguageRegistry.instance().addStringLocalization("entity.Robot Red Ant.name", "en_US", "Robot Red Ant");
/* 4901 */     LanguageRegistry.instance().addStringLocalization("Robot Red Ant", "en_US", "Robot Red Ant");
/* 4902 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(AntRobot.class, "Robot Red Ant", AntRobotID, this, 128, 1, false);
/*      */     
/* 4904 */     EntityRegistry.instance(); CrabID = EntityRegistry.findGlobalUniqueEntityId();
/* 4905 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Crab.class, "Crab", CrabID);
/* 4906 */     LanguageRegistry.instance().addStringLocalization("Crab", "en_US", "Crab");
/* 4907 */     LanguageRegistry.instance().addStringLocalization("entity.Crab.name", "en_US", "Crab");
/* 4908 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Crab.class, "Crab", CrabID, this, 64, 1, false);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4914 */     GregorianCalendar gcalendar = new GregorianCalendar();
/*      */     
/* 4916 */     int nowmonth = gcalendar.get(2);
/* 4917 */     int nowday = gcalendar.get(5);
/*      */ 
/*      */     
/* 4920 */     if (nowmonth == 9 && nowday == 31) {
/* 4921 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76787_r });
/* 4922 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 4923 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 4924 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 4925 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 4926 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 4927 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 4928 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 4929 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 4930 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 4931 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 4932 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 4933 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 4934 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 4935 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 4936 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/* 4937 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150607_aa });
/* 4938 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150608_ab });
/* 4939 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150589_Z });
/* 4940 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150579_T });
/* 4941 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150584_S });
/* 4942 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */       
/* 4944 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76787_r });
/* 4945 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 4946 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 4947 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 4948 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 4949 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 4950 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 4951 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 4952 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 4953 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 4954 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 4955 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 4956 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 4957 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 4958 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 4959 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/* 4960 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150607_aa });
/* 4961 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150608_ab });
/* 4962 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150589_Z });
/* 4963 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150579_T });
/* 4964 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150584_S });
/* 4965 */       EntityRegistry.addSpawn(Ghost.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/*      */ 
/*      */     
/* 4969 */     if (nowmonth == 1 && nowday == 14) {
/* 4970 */       valentines_day = 1;
/*      */     }
/*      */ 
/*      */     
/* 4974 */     if (nowmonth == 3 && nowday == 20) {
/* 4975 */       easter_day = 1;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4985 */     if (GirlfriendEnable != 0) {
/* 4986 */       EntityRegistry.addSpawn(Girlfriend.class, 30, 8, 15, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76787_r });
/* 4987 */       EntityRegistry.addSpawn(Girlfriend.class, 10, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 4988 */       EntityRegistry.addSpawn(Girlfriend.class, 8, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 4989 */       EntityRegistry.addSpawn(Girlfriend.class, 5, 2, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 4990 */       EntityRegistry.addSpawn(Girlfriend.class, 10, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 4991 */       EntityRegistry.addSpawn(Girlfriend.class, 10, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/* 4992 */       EntityRegistry.addSpawn(Girlfriend.class, 5, 2, 4, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 4993 */       EntityRegistry.addSpawn(Girlfriend.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 4994 */       EntityRegistry.addSpawn(Girlfriend.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 4995 */       EntityRegistry.addSpawn(Girlfriend.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 4996 */       EntityRegistry.addSpawn(Girlfriend.class, 2, 1, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 4997 */       EntityRegistry.addSpawn(Girlfriend.class, 2, 1, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5000 */     if (BoyfriendEnable != 0) {
/* 5001 */       EntityRegistry.addSpawn(Boyfriend.class, 30, 8, 15, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76787_r });
/* 5002 */       EntityRegistry.addSpawn(Boyfriend.class, 10, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5003 */       EntityRegistry.addSpawn(Boyfriend.class, 8, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5004 */       EntityRegistry.addSpawn(Boyfriend.class, 5, 2, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5005 */       EntityRegistry.addSpawn(Boyfriend.class, 10, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5006 */       EntityRegistry.addSpawn(Boyfriend.class, 10, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/* 5007 */       EntityRegistry.addSpawn(Boyfriend.class, 5, 2, 4, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5008 */       EntityRegistry.addSpawn(Boyfriend.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5009 */       EntityRegistry.addSpawn(Boyfriend.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5010 */       EntityRegistry.addSpawn(Boyfriend.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5011 */       EntityRegistry.addSpawn(Boyfriend.class, 2, 1, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5012 */       EntityRegistry.addSpawn(Boyfriend.class, 2, 1, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5015 */     if (BeaverEnable != 0) {
/* 5016 */       EntityRegistry.addSpawn(Beaver.class, 10, 2, 4, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5017 */       EntityRegistry.addSpawn(Beaver.class, 3, 2, 4, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5018 */       EntityRegistry.addSpawn(Beaver.class, 2, 2, 4, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5019 */       EntityRegistry.addSpawn(Beaver.class, 2, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5020 */       EntityRegistry.addSpawn(Beaver.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5021 */       EntityRegistry.addSpawn(Beaver.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/*      */     } 
/*      */     
/* 5024 */     if (CowEnable != 0) {
/*      */       
/* 5026 */       EntityRegistry.addSpawn(RedCow.class, 8, 4, 8, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5027 */       EntityRegistry.addSpawn(RedCow.class, 8, 4, 8, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5028 */       EntityRegistry.addSpawn(RedCow.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5029 */       EntityRegistry.addSpawn(RedCow.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5030 */       EntityRegistry.addSpawn(RedCow.class, 8, 1, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5031 */       EntityRegistry.addSpawn(RedCow.class, 2, 1, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */ 
/*      */       
/* 5034 */       EntityRegistry.addSpawn(GoldCow.class, 5, 2, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5035 */       EntityRegistry.addSpawn(GoldCow.class, 5, 2, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5036 */       EntityRegistry.addSpawn(GoldCow.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5037 */       EntityRegistry.addSpawn(GoldCow.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/*      */ 
/*      */       
/* 5040 */       EntityRegistry.addSpawn(EnchantedCow.class, 3, 2, 4, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5041 */       EntityRegistry.addSpawn(EnchantedCow.class, 3, 2, 4, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5042 */       EntityRegistry.addSpawn(EnchantedCow.class, 5, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5043 */       EntityRegistry.addSpawn(EnchantedCow.class, 15, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76789_p });
/*      */     } 
/*      */     
/* 5046 */     if (CriminalEnable != 0) {
/* 5047 */       EntityRegistry.addSpawn(BandP.class, 20, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5048 */       EntityRegistry.addSpawn(BandP.class, 20, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 5049 */       EntityRegistry.addSpawn(BandP.class, 20, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/*      */     } 
/*      */     
/* 5052 */     if (WormEnable != 0) {
/* 5053 */       EntityRegistry.addSpawn(WormLarge.class, 25, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5054 */       EntityRegistry.addSpawn(WormLarge.class, 15, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5055 */       EntityRegistry.addSpawn(WormLarge.class, 10, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */ 
/*      */     
/* 5059 */     if (ButterflyEnable != 0) {
/* 5060 */       EntityRegistry.addSpawn(EntityButterfly.class, 8, 5, 15, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76787_r });
/* 5061 */       EntityRegistry.addSpawn(EntityButterfly.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5062 */       EntityRegistry.addSpawn(EntityButterfly.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5063 */       EntityRegistry.addSpawn(EntityButterfly.class, 30, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5064 */       EntityRegistry.addSpawn(EntityButterfly.class, 20, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5065 */       EntityRegistry.addSpawn(EntityButterfly.class, 20, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5066 */       EntityRegistry.addSpawn(EntityButterfly.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5067 */       EntityRegistry.addSpawn(EntityButterfly.class, 20, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5068 */       EntityRegistry.addSpawn(EntityButterfly.class, 20, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5069 */       EntityRegistry.addSpawn(EntityButterfly.class, 20, 4, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5070 */       EntityRegistry.addSpawn(EntityButterfly.class, 15, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5071 */       EntityRegistry.addSpawn(EntityButterfly.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5072 */       EntityRegistry.addSpawn(EntityButterfly.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5073 */       EntityRegistry.addSpawn(EntityButterfly.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5074 */       EntityRegistry.addSpawn(EntityButterfly.class, 10, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5075 */       EntityRegistry.addSpawn(EntityButterfly.class, 10, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */ 
/*      */     
/* 5079 */     if (MothEnable != 0) {
/* 5080 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 8, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5081 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 8, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5082 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5083 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 20, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5084 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 20, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5085 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5086 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 20, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5087 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 10, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5088 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 15, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5089 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5090 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/* 5091 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5092 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5093 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 10, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5094 */       EntityRegistry.addSpawn(EntityLunaMoth.class, 10, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5097 */     if (CassowaryEnable != 0) {
/* 5098 */       EntityRegistry.addSpawn(Cassowary.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5099 */       EntityRegistry.addSpawn(Cassowary.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5100 */       EntityRegistry.addSpawn(Cassowary.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150580_W });
/* 5101 */       EntityRegistry.addSpawn(Cassowary.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5102 */       EntityRegistry.addSpawn(Cassowary.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5103 */       EntityRegistry.addSpawn(Cassowary.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5104 */       EntityRegistry.addSpawn(Cassowary.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150581_V });
/* 5105 */       EntityRegistry.addSpawn(Cassowary.class, 3, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5106 */       EntityRegistry.addSpawn(Cassowary.class, 10, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5109 */     if (EasterBunnyEnable != 0 && easter_day != 0) {
/* 5110 */       EntityRegistry.addSpawn(EasterBunny.class, 10, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5111 */       EntityRegistry.addSpawn(EasterBunny.class, 10, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5112 */       EntityRegistry.addSpawn(EasterBunny.class, 10, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5113 */       EntityRegistry.addSpawn(EasterBunny.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5114 */       EntityRegistry.addSpawn(EasterBunny.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5115 */       EntityRegistry.addSpawn(EasterBunny.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5116 */       EntityRegistry.addSpawn(EasterBunny.class, 8, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 5121 */     if (FireflyEnable != 0) {
/* 5122 */       EntityRegistry.addSpawn(Firefly.class, 15, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5123 */       EntityRegistry.addSpawn(Firefly.class, 15, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5124 */       EntityRegistry.addSpawn(Firefly.class, 10, 4, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5125 */       EntityRegistry.addSpawn(Firefly.class, 15, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5126 */       EntityRegistry.addSpawn(Firefly.class, 15, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5127 */       EntityRegistry.addSpawn(Firefly.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/* 5128 */       EntityRegistry.addSpawn(Firefly.class, 15, 3, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5129 */       EntityRegistry.addSpawn(Firefly.class, 15, 3, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5130 */       EntityRegistry.addSpawn(Firefly.class, 15, 2, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5131 */       EntityRegistry.addSpawn(Firefly.class, 15, 2, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5132 */       EntityRegistry.addSpawn(Firefly.class, 15, 2, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150581_V });
/* 5133 */       EntityRegistry.addSpawn(Firefly.class, 10, 2, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5134 */       EntityRegistry.addSpawn(Firefly.class, 10, 2, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5137 */     if (WhaleEnable != 0) {
/* 5138 */       EntityRegistry.addSpawn(Whale.class, 1, 1, 2, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_150575_M });
/*      */     }
/*      */     
/* 5141 */     if (BeeEnable != 0) {
/* 5142 */       EntityRegistry.addSpawn(Bee.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5143 */       EntityRegistry.addSpawn(Bee.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5144 */       EntityRegistry.addSpawn(Bee.class, 20, 3, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5145 */       EntityRegistry.addSpawn(Bee.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5146 */       EntityRegistry.addSpawn(Bee.class, 10, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5147 */       EntityRegistry.addSpawn(Bee.class, 10, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5148 */       EntityRegistry.addSpawn(Bee.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5149 */       EntityRegistry.addSpawn(Bee.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5150 */       EntityRegistry.addSpawn(Bee.class, 3, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5151 */       EntityRegistry.addSpawn(Bee.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5154 */     if (MantisEnable != 0) {
/* 5155 */       EntityRegistry.addSpawn(Mantis.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5156 */       EntityRegistry.addSpawn(Mantis.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5157 */       EntityRegistry.addSpawn(Mantis.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5158 */       EntityRegistry.addSpawn(Mantis.class, 1, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5159 */       EntityRegistry.addSpawn(Mantis.class, 1, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5160 */       EntityRegistry.addSpawn(Mantis.class, 1, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5161 */       EntityRegistry.addSpawn(Mantis.class, 1, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5162 */       EntityRegistry.addSpawn(Mantis.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5163 */       EntityRegistry.addSpawn(Mantis.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5166 */     if (HerculesBeetleEnable != 0) {
/* 5167 */       EntityRegistry.addSpawn(HerculesBeetle.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5168 */       EntityRegistry.addSpawn(HerculesBeetle.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5169 */       EntityRegistry.addSpawn(HerculesBeetle.class, 5, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5170 */       EntityRegistry.addSpawn(HerculesBeetle.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76784_u });
/* 5171 */       EntityRegistry.addSpawn(HerculesBeetle.class, 5, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5172 */       EntityRegistry.addSpawn(HerculesBeetle.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150579_T });
/* 5173 */       EntityRegistry.addSpawn(HerculesBeetle.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150581_V });
/*      */     } 
/*      */     
/* 5176 */     if (MolenoidEnable != 0) {
/* 5177 */       EntityRegistry.addSpawn(Molenoid.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5178 */       EntityRegistry.addSpawn(Molenoid.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5179 */       EntityRegistry.addSpawn(Molenoid.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5182 */     if (CaterKillerEnable != 0) {
/* 5183 */       EntityRegistry.addSpawn(CaterKiller.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5184 */       EntityRegistry.addSpawn(CaterKiller.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5185 */       EntityRegistry.addSpawn(CaterKiller.class, 4, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5186 */       EntityRegistry.addSpawn(CaterKiller.class, 4, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5187 */       EntityRegistry.addSpawn(CaterKiller.class, 6, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5188 */       EntityRegistry.addSpawn(CaterKiller.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5189 */       EntityRegistry.addSpawn(CaterKiller.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5190 */       EntityRegistry.addSpawn(CaterKiller.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5191 */       EntityRegistry.addSpawn(CaterKiller.class, 10, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/*      */     
/* 5194 */     if (ChipmunkEnable != 0) {
/* 5195 */       EntityRegistry.addSpawn(Chipmunk.class, 8, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5196 */       EntityRegistry.addSpawn(Chipmunk.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5197 */       EntityRegistry.addSpawn(Chipmunk.class, 4, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5198 */       EntityRegistry.addSpawn(Chipmunk.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5199 */       EntityRegistry.addSpawn(Chipmunk.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5200 */       EntityRegistry.addSpawn(Chipmunk.class, 4, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5201 */       EntityRegistry.addSpawn(Chipmunk.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/* 5202 */       EntityRegistry.addSpawn(Chipmunk.class, 2, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5203 */       EntityRegistry.addSpawn(Chipmunk.class, 6, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/*      */     } 
/*      */     
/* 5206 */     if (OstrichEnable != 0) {
/* 5207 */       EntityRegistry.addSpawn(Ostrich.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 5208 */       EntityRegistry.addSpawn(Ostrich.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/* 5209 */       EntityRegistry.addSpawn(Ostrich.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5210 */       EntityRegistry.addSpawn(Ostrich.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */ 
/*      */     
/* 5214 */     if (CephadromeEnable != 0) {
/* 5215 */       EntityRegistry.addSpawn(Cephadrome.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76774_n });
/* 5216 */       EntityRegistry.addSpawn(Cephadrome.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150584_S });
/*      */     } 
/*      */ 
/*      */     
/* 5220 */     if (MosquitoEnable != 0) {
/* 5221 */       EntityRegistry.addSpawn(EntityMosquito.class, 30, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5222 */       EntityRegistry.addSpawn(EntityMosquito.class, 20, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5223 */       EntityRegistry.addSpawn(EntityMosquito.class, 20, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5224 */       EntityRegistry.addSpawn(EntityMosquito.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/*      */ 
/*      */     
/* 5228 */     if (GhostEnable != 0) {
/* 5229 */       EntityRegistry.addSpawn(Ghost.class, 15, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150584_S });
/* 5230 */       EntityRegistry.addSpawn(Ghost.class, 10, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76784_u });
/* 5231 */       EntityRegistry.addSpawn(Ghost.class, 6, 4, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76777_m });
/* 5232 */       EntityRegistry.addSpawn(Ghost.class, 2, 1, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5233 */       EntityRegistry.addSpawn(Ghost.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/*      */ 
/*      */     
/* 5237 */     if (GhostSkellyEnable != 0) {
/* 5238 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150584_S });
/* 5239 */       EntityRegistry.addSpawn(GhostSkelly.class, 10, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76784_u });
/* 5240 */       EntityRegistry.addSpawn(GhostSkelly.class, 6, 4, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76777_m });
/* 5241 */       EntityRegistry.addSpawn(GhostSkelly.class, 2, 1, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5242 */       EntityRegistry.addSpawn(GhostSkelly.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/*      */     
/* 5245 */     if (DragonflyEnable != 0) {
/* 5246 */       EntityRegistry.addSpawn(Dragonfly.class, 15, 3, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5247 */       EntityRegistry.addSpawn(Dragonfly.class, 8, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/*      */     } 
/*      */ 
/*      */     
/* 5251 */     if (KyuubiEnable != 0) {
/* 5252 */       EntityRegistry.addSpawn(Kyuubi.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.field_76778_j });
/*      */     }
/*      */     
/* 5255 */     if (StinkyEnable != 0) {
/* 5256 */       EntityRegistry.addSpawn(Stinky.class, 2, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.field_76778_j });
/* 5257 */       EntityRegistry.addSpawn(Stinky.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150589_Z });
/* 5258 */       EntityRegistry.addSpawn(Stinky.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150608_ab });
/* 5259 */       EntityRegistry.addSpawn(Stinky.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150607_aa });
/*      */     } 
/*      */     
/* 5262 */     if (CockateilEnable != 0) {
/* 5263 */       EntityRegistry.addSpawn(Cockateil.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76787_r });
/* 5264 */       EntityRegistry.addSpawn(Cockateil.class, 10, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5265 */       EntityRegistry.addSpawn(Cockateil.class, 10, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5266 */       EntityRegistry.addSpawn(Cockateil.class, 25, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5267 */       EntityRegistry.addSpawn(Cockateil.class, 20, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5268 */       EntityRegistry.addSpawn(Cockateil.class, 35, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5269 */       EntityRegistry.addSpawn(Cockateil.class, 25, 5, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5270 */       EntityRegistry.addSpawn(Cockateil.class, 10, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5271 */       EntityRegistry.addSpawn(Cockateil.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5272 */       EntityRegistry.addSpawn(Cockateil.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/* 5273 */       EntityRegistry.addSpawn(Cockateil.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5274 */       EntityRegistry.addSpawn(Cockateil.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5275 */       EntityRegistry.addSpawn(Cockateil.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5276 */       EntityRegistry.addSpawn(Cockateil.class, 15, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5277 */       EntityRegistry.addSpawn(Cockateil.class, 11, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5278 */       EntityRegistry.addSpawn(Cockateil.class, 11, 1, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */ 
/*      */     
/* 5282 */     if (HydroliscEnable != 0) {
/* 5283 */       EntityRegistry.addSpawn(Hydrolisc.class, 25, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5284 */       EntityRegistry.addSpawn(Hydrolisc.class, 15, 2, 5, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5285 */       EntityRegistry.addSpawn(Hydrolisc.class, 10, 1, 3, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5286 */       EntityRegistry.addSpawn(Hydrolisc.class, 5, 3, 6, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/*      */     } 
/*      */ 
/*      */     
/* 5290 */     if (MothraEnable != 0) {
/* 5291 */       EntityRegistry.addSpawn(Mothra.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5292 */       EntityRegistry.addSpawn(Mothra.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150580_W });
/*      */     } 
/* 5294 */     if (BrutalflyEnable != 0) {
/* 5295 */       EntityRegistry.addSpawn(Brutalfly.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150581_V });
/* 5296 */       EntityRegistry.addSpawn(Brutalfly.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150580_W });
/* 5297 */       EntityRegistry.addSpawn(Brutalfly.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150608_ab });
/*      */     } 
/* 5299 */     if (WaterDragonEnable != 0) {
/* 5300 */       EntityRegistry.addSpawn(WaterDragon.class, 5, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5301 */       EntityRegistry.addSpawn(WaterDragon.class, 3, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5302 */       EntityRegistry.addSpawn(WaterDragon.class, 2, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76771_b });
/* 5303 */       EntityRegistry.addSpawn(WaterDragon.class, 2, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/*      */     } 
/* 5305 */     if (SeaMonsterEnable != 0) {
/* 5306 */       EntityRegistry.addSpawn(SeaMonster.class, 4, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76771_b });
/* 5307 */       EntityRegistry.addSpawn(SeaMonster.class, 2, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/*      */     } 
/* 5309 */     if (SeaViperEnable != 0) {
/* 5310 */       EntityRegistry.addSpawn(SeaViper.class, 3, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76771_b });
/* 5311 */       EntityRegistry.addSpawn(SeaViper.class, 2, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/*      */     } 
/* 5313 */     if (CrabEnable != 0) {
/* 5314 */       EntityRegistry.addSpawn(Crab.class, 2, 3, 6, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76771_b });
/* 5315 */       EntityRegistry.addSpawn(Crab.class, 1, 3, 6, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5316 */       EntityRegistry.addSpawn(Crab.class, 1, 2, 4, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/*      */     } 
/* 5318 */     if (AttackSquidEnable != 0) {
/* 5319 */       EntityRegistry.addSpawn(AttackSquid.class, 12, 6, 10, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5320 */       EntityRegistry.addSpawn(AttackSquid.class, 10, 5, 9, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5321 */       EntityRegistry.addSpawn(AttackSquid.class, 7, 4, 8, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76771_b });
/*      */     } 
/* 5323 */     if (LizardEnable != 0) {
/* 5324 */       EntityRegistry.addSpawn(Lizard.class, 5, 2, 4, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5325 */       EntityRegistry.addSpawn(Lizard.class, 4, 2, 4, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5326 */       EntityRegistry.addSpawn(Lizard.class, 2, 2, 4, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76771_b });
/*      */     } 
/* 5328 */     if (RubberDuckyEnable != 0) {
/* 5329 */       EntityRegistry.addSpawn(RubberDucky.class, 10, 10, 20, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5330 */       EntityRegistry.addSpawn(RubberDucky.class, 4, 4, 6, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_150576_N });
/*      */     } 
/* 5332 */     if (BasiliskEnable != 0) {
/* 5333 */       EntityRegistry.addSpawn(Basilisk.class, 3, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5334 */       EntityRegistry.addSpawn(Basilisk.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5335 */       EntityRegistry.addSpawn(Basilisk.class, 4, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5336 */       EntityRegistry.addSpawn(Basilisk.class, 15, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/* 5338 */     if (EmperorScorpionEnable != 0) {
/* 5339 */       EntityRegistry.addSpawn(EmperorScorpion.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 5340 */       EntityRegistry.addSpawn(EmperorScorpion.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/*      */     } 
/* 5342 */     if (TrooperBugEnable != 0) {
/* 5343 */       EntityRegistry.addSpawn(TrooperBug.class, 3, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5344 */       EntityRegistry.addSpawn(TrooperBug.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150589_Z });
/*      */     } 
/* 5346 */     if (SpitBugEnable != 0) {
/* 5347 */       EntityRegistry.addSpawn(SpitBug.class, 6, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/*      */     }
/* 5349 */     if (StinkBugEnable != 0) {
/* 5350 */       EntityRegistry.addSpawn(StinkBug.class, 10, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5351 */       EntityRegistry.addSpawn(StinkBug.class, 8, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5352 */       EntityRegistry.addSpawn(StinkBug.class, 6, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5353 */       EntityRegistry.addSpawn(StinkBug.class, 4, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5354 */       EntityRegistry.addSpawn(StinkBug.class, 8, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/*      */     } 
/* 5356 */     if (ScorpionEnable != 0) {
/* 5357 */       EntityRegistry.addSpawn(Scorpion.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 5358 */       EntityRegistry.addSpawn(Scorpion.class, 28, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/* 5359 */       EntityRegistry.addSpawn(Scorpion.class, 15, 3, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5360 */       EntityRegistry.addSpawn(Scorpion.class, 15, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/* 5361 */       EntityRegistry.addSpawn(Scorpion.class, 6, 1, 3, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150589_Z });
/* 5362 */       EntityRegistry.addSpawn(Scorpion.class, 4, 1, 3, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150608_ab });
/* 5363 */       EntityRegistry.addSpawn(Scorpion.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150607_aa });
/*      */     } 
/*      */ 
/*      */     
/* 5367 */     if (BlackAntEnable != 0) {
/* 5368 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 4, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5369 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 4, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5370 */       EntityRegistry.addSpawn(EntityAnt.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5371 */       EntityRegistry.addSpawn(EntityAnt.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5372 */       EntityRegistry.addSpawn(EntityAnt.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5373 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 4, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5374 */       EntityRegistry.addSpawn(EntityAnt.class, 10, 5, 15, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5375 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5376 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5377 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5378 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5379 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5380 */       EntityRegistry.addSpawn(EntityAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5383 */     if (RedAntEnable != 0) {
/* 5384 */       EntityRegistry.addSpawn(EntityRedAnt.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5385 */       EntityRegistry.addSpawn(EntityRedAnt.class, 2, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5386 */       EntityRegistry.addSpawn(EntityRedAnt.class, 6, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5387 */       EntityRegistry.addSpawn(EntityRedAnt.class, 4, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5388 */       EntityRegistry.addSpawn(EntityRedAnt.class, 15, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5389 */       EntityRegistry.addSpawn(EntityRedAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5390 */       EntityRegistry.addSpawn(EntityRedAnt.class, 4, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5391 */       EntityRegistry.addSpawn(EntityRedAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5392 */       EntityRegistry.addSpawn(EntityRedAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5393 */       EntityRegistry.addSpawn(EntityRedAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5394 */       EntityRegistry.addSpawn(EntityRedAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5395 */       EntityRegistry.addSpawn(EntityRedAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5396 */       EntityRegistry.addSpawn(EntityRedAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5399 */     if (RainbowAntEnable != 0) {
/* 5400 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 4, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5401 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 4, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5402 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 12, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5403 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 8, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5404 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5405 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5406 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 8, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5407 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5408 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5409 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5410 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5411 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5412 */       EntityRegistry.addSpawn(EntityRainbowAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5415 */     if (UnstableAntEnable != 0) {
/* 5416 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5417 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 2, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5418 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 6, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5419 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 4, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5420 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5421 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5422 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 4, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5423 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5424 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 5, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5425 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5426 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 5, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5427 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150588_X });
/* 5428 */       EntityRegistry.addSpawn(EntityUnstableAnt.class, 5, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/*      */     
/* 5431 */     if (LeafMonsterEnable != 0) {
/* 5432 */       EntityRegistry.addSpawn(LeafMonster.class, 25, 2, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5433 */       EntityRegistry.addSpawn(LeafMonster.class, 20, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5434 */       EntityRegistry.addSpawn(LeafMonster.class, 15, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5435 */       EntityRegistry.addSpawn(LeafMonster.class, 15, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5436 */       EntityRegistry.addSpawn(LeafMonster.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5437 */       EntityRegistry.addSpawn(LeafMonster.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5438 */       EntityRegistry.addSpawn(LeafMonster.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5439 */       EntityRegistry.addSpawn(LeafMonster.class, 10, 2, 5, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/*      */     } 
/*      */     
/* 5442 */     if (EnderKnightEnable != 0) {
/* 5443 */       EntityRegistry.addSpawn(EnderKnight.class, 4, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5444 */       EntityRegistry.addSpawn(EnderKnight.class, 4, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5445 */       EntityRegistry.addSpawn(EnderKnight.class, 4, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5446 */       EntityRegistry.addSpawn(EnderKnight.class, 4, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5447 */       EntityRegistry.addSpawn(EnderKnight.class, 4, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5448 */       EntityRegistry.addSpawn(EnderKnight.class, 2, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5449 */       EntityRegistry.addSpawn(EnderKnight.class, 2, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5450 */       EntityRegistry.addSpawn(EnderKnight.class, 2, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 5451 */       EntityRegistry.addSpawn(EnderKnight.class, 20, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/* 5453 */     if (EnderReaperEnable != 0) {
/* 5454 */       EntityRegistry.addSpawn(EnderReaper.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76770_e });
/* 5455 */       EntityRegistry.addSpawn(EnderReaper.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76783_v });
/* 5456 */       EntityRegistry.addSpawn(EnderReaper.class, 1, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5457 */       EntityRegistry.addSpawn(EnderReaper.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5458 */       EntityRegistry.addSpawn(EnderReaper.class, 2, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5459 */       EntityRegistry.addSpawn(EnderReaper.class, 1, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5460 */       EntityRegistry.addSpawn(EnderReaper.class, 1, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5461 */       EntityRegistry.addSpawn(EnderReaper.class, 1, 1, 2, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76769_d });
/* 5462 */       EntityRegistry.addSpawn(EnderReaper.class, 38, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     } 
/*      */     
/* 5465 */     if (CoinEnable != 0) {
/* 5466 */       EntityRegistry.addSpawn(Coin.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5467 */       EntityRegistry.addSpawn(Coin.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5468 */       EntityRegistry.addSpawn(Coin.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5469 */       EntityRegistry.addSpawn(Coin.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5470 */       EntityRegistry.addSpawn(Coin.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150584_S });
/* 5471 */       EntityRegistry.addSpawn(Coin.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/*      */     } 
/*      */     
/* 5474 */     if (CricketEnable != 0) {
/* 5475 */       EntityRegistry.addSpawn(Cricket.class, 25, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 5476 */       EntityRegistry.addSpawn(Cricket.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76785_t });
/* 5477 */       EntityRegistry.addSpawn(Cricket.class, 25, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5478 */       EntityRegistry.addSpawn(Cricket.class, 10, 4, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76792_x });
/* 5479 */       EntityRegistry.addSpawn(Cricket.class, 25, 5, 15, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76772_c });
/* 5480 */       EntityRegistry.addSpawn(Cricket.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150583_P });
/* 5481 */       EntityRegistry.addSpawn(Cricket.class, 10, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150582_Q });
/* 5482 */       EntityRegistry.addSpawn(Cricket.class, 22, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/* 5483 */       EntityRegistry.addSpawn(Cricket.class, 12, 1, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150578_U });
/* 5484 */       EntityRegistry.addSpawn(Cricket.class, 12, 1, 10, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/* 5485 */       EntityRegistry.addSpawn(Cricket.class, 10, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150587_Y });
/*      */     } 
/* 5487 */     if (FrogEnable != 0) {
/* 5488 */       EntityRegistry.addSpawn(Frog.class, 20, 3, 6, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5489 */       EntityRegistry.addSpawn(Frog.class, 35, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76781_i });
/* 5490 */       EntityRegistry.addSpawn(Frog.class, 20, 3, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76782_w });
/* 5491 */       EntityRegistry.addSpawn(Frog.class, 20, 2, 6, EnumCreatureType.waterCreature, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/* 5492 */       EntityRegistry.addSpawn(Frog.class, 35, 2, 6, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76780_h });
/*      */     } 
/*      */     
/* 5495 */     if (PeacockEnable != 0) {
/* 5496 */       EntityRegistry.addSpawn(Peacock.class, 1, 1, 3, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150589_Z });
/* 5497 */       EntityRegistry.addSpawn(Peacock.class, 1, 1, 3, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150608_ab });
/*      */     } 
/*      */     
/* 5500 */     if (FairyEnable != 0) {
/* 5501 */       EntityRegistry.addSpawn(Fairy.class, 25, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     }
/* 5503 */     if (RatEnable != 0) {
/* 5504 */       EntityRegistry.addSpawn(Rat.class, 35, 10, 20, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/* 5505 */       EntityRegistry.addSpawn(Rat.class, 25, 2, 8, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_76768_g });
/*      */     } 
/* 5507 */     if (DungeonBeastEnable != 0) {
/* 5508 */       EntityRegistry.addSpawn(DungeonBeast.class, 20, 2, 4, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.field_150585_R });
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5516 */     EntityRegistry.instance(); int shoeid = EntityRegistry.findGlobalUniqueEntityId();
/* 5517 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(Shoes.class, "Shoes", shoeid);
/* 5518 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(Shoes.class, "Shoes", shoeid, this, 64, 1, true);
/* 5519 */     LanguageRegistry.instance().addNameForObject(MyItemShoes, "en_US", "Red Heels");
/* 5520 */     LanguageRegistry.instance().addNameForObject(MyItemShoes_1, "en_US", "Black Heels");
/* 5521 */     LanguageRegistry.instance().addNameForObject(MyItemShoes_2, "en_US", "Slippers");
/* 5522 */     LanguageRegistry.instance().addNameForObject(MyItemShoes_3, "en_US", "Boots");
/* 5523 */     LanguageRegistry.instance().addNameForObject(MyItemGameController, "en_US", "Game Controller");
/*      */ 
/*      */     
/* 5526 */     LanguageRegistry.instance().addNameForObject(UltimateHelmet, "en_US", "The Ultimate Helmet");
/* 5527 */     LanguageRegistry.instance().addNameForObject(UltimateBody, "en_US", "The Ultimate Chestplate");
/* 5528 */     LanguageRegistry.instance().addNameForObject(UltimateLegs, "en_US", "The Ultimate Leggings");
/* 5529 */     LanguageRegistry.instance().addNameForObject(UltimateBoots, "en_US", "The Ultimate Boots");
/*      */     
/* 5531 */     GameRegistry.addRecipe(new ItemStack((Item)UltimateHelmet), new Object[] { "   ", "TIT", "U U", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5536 */     GameRegistry.addRecipe(new ItemStack((Item)UltimateHelmet), new Object[] { "TIT", "U U", "   ", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5541 */     GameRegistry.addRecipe(new ItemStack((Item)UltimateBody), new Object[] { "I I", "TTT", "UUU", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5546 */     GameRegistry.addRecipe(new ItemStack((Item)UltimateLegs), new Object[] { "III", "T T", "U U", Character.valueOf('I'), Items.field_151042_j, Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5551 */     GameRegistry.addRecipe(new ItemStack((Item)UltimateBoots), new Object[] { "   ", "T T", "U U", Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */     
/* 5555 */     GameRegistry.addRecipe(new ItemStack((Item)UltimateBoots), new Object[] { "T T", "U U", "   ", Character.valueOf('U'), MyIngotUranium, Character.valueOf('T'), MyIngotTitanium });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5561 */     LanguageRegistry.instance().addNameForObject(LavaEelHelmet, "en_US", "Lava Eel Helmet");
/* 5562 */     LanguageRegistry.instance().addNameForObject(LavaEelBody, "en_US", "Lava Eel Chestplate");
/* 5563 */     LanguageRegistry.instance().addNameForObject(LavaEelLegs, "en_US", "Lava Eel Leggings");
/* 5564 */     LanguageRegistry.instance().addNameForObject(LavaEelBoots, "en_US", "Lava Eel Boots");
/*      */     
/* 5566 */     GameRegistry.addRecipe(new ItemStack((Item)LavaEelHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyLavaEel });
/*      */ 
/*      */     
/* 5569 */     GameRegistry.addRecipe(new ItemStack((Item)LavaEelHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyLavaEel });
/*      */ 
/*      */     
/* 5572 */     GameRegistry.addRecipe(new ItemStack((Item)LavaEelBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyLavaEel });
/*      */ 
/*      */     
/* 5575 */     GameRegistry.addRecipe(new ItemStack((Item)LavaEelLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyLavaEel });
/*      */ 
/*      */     
/* 5578 */     GameRegistry.addRecipe(new ItemStack((Item)LavaEelBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyLavaEel });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5583 */     LanguageRegistry.instance().addNameForObject(MothScaleHelmet, "en_US", "Moth Scale Helmet");
/* 5584 */     LanguageRegistry.instance().addNameForObject(MothScaleBody, "en_US", "Moth Scale Chestplate");
/* 5585 */     LanguageRegistry.instance().addNameForObject(MothScaleLegs, "en_US", "Moth Scale Leggings");
/* 5586 */     LanguageRegistry.instance().addNameForObject(MothScaleBoots, "en_US", "Moth Scale Boots");
/*      */     
/* 5588 */     GameRegistry.addRecipe(new ItemStack((Item)MothScaleHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyMothScale });
/*      */ 
/*      */     
/* 5591 */     GameRegistry.addRecipe(new ItemStack((Item)MothScaleHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyMothScale });
/*      */ 
/*      */     
/* 5594 */     GameRegistry.addRecipe(new ItemStack((Item)MothScaleBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyMothScale });
/*      */ 
/*      */     
/* 5597 */     GameRegistry.addRecipe(new ItemStack((Item)MothScaleLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyMothScale });
/*      */ 
/*      */     
/* 5600 */     GameRegistry.addRecipe(new ItemStack((Item)MothScaleBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyMothScale });
/*      */ 
/*      */ 
/*      */     
/* 5604 */     LanguageRegistry.instance().addNameForObject(EmeraldHelmet, "en_US", "Emerald Helmet");
/* 5605 */     LanguageRegistry.instance().addNameForObject(EmeraldBody, "en_US", "Emerald Chestplate");
/* 5606 */     LanguageRegistry.instance().addNameForObject(EmeraldLegs, "en_US", "Emerald Leggings");
/* 5607 */     LanguageRegistry.instance().addNameForObject(EmeraldBoots, "en_US", "Emerald Boots");
/*      */     
/* 5609 */     GameRegistry.addRecipe(new ItemStack((Item)EmeraldHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), Items.field_151166_bC });
/*      */ 
/*      */     
/* 5612 */     GameRegistry.addRecipe(new ItemStack((Item)EmeraldHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), Items.field_151166_bC });
/*      */ 
/*      */     
/* 5615 */     GameRegistry.addRecipe(new ItemStack((Item)EmeraldBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), Items.field_151166_bC });
/*      */ 
/*      */     
/* 5618 */     GameRegistry.addRecipe(new ItemStack((Item)EmeraldLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), Items.field_151166_bC });
/*      */ 
/*      */     
/* 5621 */     GameRegistry.addRecipe(new ItemStack((Item)EmeraldBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), Items.field_151166_bC });
/*      */ 
/*      */ 
/*      */     
/* 5625 */     LanguageRegistry.instance().addNameForObject(RubyHelmet, "en_US", "Ruby Helmet");
/* 5626 */     LanguageRegistry.instance().addNameForObject(RubyBody, "en_US", "Ruby Chestplate");
/* 5627 */     LanguageRegistry.instance().addNameForObject(RubyLegs, "en_US", "Ruby Leggings");
/* 5628 */     LanguageRegistry.instance().addNameForObject(RubyBoots, "en_US", "Ruby Boots");
/*      */     
/* 5630 */     GameRegistry.addRecipe(new ItemStack((Item)RubyHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyRuby });
/*      */ 
/*      */     
/* 5633 */     GameRegistry.addRecipe(new ItemStack((Item)RubyHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyRuby });
/*      */ 
/*      */     
/* 5636 */     GameRegistry.addRecipe(new ItemStack((Item)RubyBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyRuby });
/*      */ 
/*      */     
/* 5639 */     GameRegistry.addRecipe(new ItemStack((Item)RubyLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyRuby });
/*      */ 
/*      */     
/* 5642 */     GameRegistry.addRecipe(new ItemStack((Item)RubyBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyRuby });
/*      */ 
/*      */ 
/*      */     
/* 5646 */     LanguageRegistry.instance().addNameForObject(AmethystHelmet, "en_US", "Amethyst Helmet");
/* 5647 */     LanguageRegistry.instance().addNameForObject(AmethystBody, "en_US", "Amethyst Chestplate");
/* 5648 */     LanguageRegistry.instance().addNameForObject(AmethystLegs, "en_US", "Amethyst Leggings");
/* 5649 */     LanguageRegistry.instance().addNameForObject(AmethystBoots, "en_US", "Amethyst Boots");
/*      */     
/* 5651 */     GameRegistry.addRecipe(new ItemStack((Item)AmethystHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyAmethyst });
/*      */ 
/*      */     
/* 5654 */     GameRegistry.addRecipe(new ItemStack((Item)AmethystHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyAmethyst });
/*      */ 
/*      */     
/* 5657 */     GameRegistry.addRecipe(new ItemStack((Item)AmethystBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyAmethyst });
/*      */ 
/*      */     
/* 5660 */     GameRegistry.addRecipe(new ItemStack((Item)AmethystLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyAmethyst });
/*      */ 
/*      */     
/* 5663 */     GameRegistry.addRecipe(new ItemStack((Item)AmethystBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyAmethyst });
/*      */ 
/*      */ 
/*      */     
/* 5667 */     LanguageRegistry.instance().addNameForObject(CrystalPinkHelmet, "en_US", "Pink Tourmailine Helmet");
/* 5668 */     LanguageRegistry.instance().addNameForObject(CrystalPinkBody, "en_US", "Pink Tourmailine Chestplate");
/* 5669 */     LanguageRegistry.instance().addNameForObject(CrystalPinkLegs, "en_US", "Pink Tourmailine Leggings");
/* 5670 */     LanguageRegistry.instance().addNameForObject(CrystalPinkBoots, "en_US", "Pink Tourmailine Boots");
/*      */ 
/*      */     
/* 5673 */     GameRegistry.addRecipe(new ItemStack((Item)CrystalPinkHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyCrystalPinkIngot });
/*      */ 
/*      */     
/* 5676 */     GameRegistry.addRecipe(new ItemStack((Item)CrystalPinkHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyCrystalPinkIngot });
/*      */ 
/*      */     
/* 5679 */     GameRegistry.addRecipe(new ItemStack((Item)CrystalPinkBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyCrystalPinkIngot });
/*      */ 
/*      */     
/* 5682 */     GameRegistry.addRecipe(new ItemStack((Item)CrystalPinkLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyCrystalPinkIngot });
/*      */ 
/*      */     
/* 5685 */     GameRegistry.addRecipe(new ItemStack((Item)CrystalPinkBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */     
/* 5689 */     LanguageRegistry.instance().addNameForObject(MobzillaHelmet, "en_US", "Mobzilla Scale Helmet");
/* 5690 */     LanguageRegistry.instance().addNameForObject(MobzillaBody, "en_US", "Mobzilla Scale Chestplate");
/* 5691 */     LanguageRegistry.instance().addNameForObject(MobzillaLegs, "en_US", "Mobzilla Scale Leggings");
/* 5692 */     LanguageRegistry.instance().addNameForObject(MobzillaBoots, "en_US", "Mobzilla Scale Boots");
/*      */     
/* 5694 */     LanguageRegistry.instance().addNameForObject(RoyalHelmet, "en_US", "Royal Guardian Helmet");
/* 5695 */     LanguageRegistry.instance().addNameForObject(RoyalBody, "en_US", "Royal Guardian Chestplate");
/* 5696 */     LanguageRegistry.instance().addNameForObject(RoyalLegs, "en_US", "Royal Guardian Leggings");
/* 5697 */     LanguageRegistry.instance().addNameForObject(RoyalBoots, "en_US", "Royal Guardian Boots");
/*      */     
/* 5699 */     LanguageRegistry.instance().addNameForObject(LapisHelmet, "en_US", "Lapis Lazuli Helmet");
/* 5700 */     LanguageRegistry.instance().addNameForObject(LapisBody, "en_US", "Lapis Lazuli Chestplate");
/* 5701 */     LanguageRegistry.instance().addNameForObject(LapisLegs, "en_US", "Lapis Lazuli Leggings");
/* 5702 */     LanguageRegistry.instance().addNameForObject(LapisBoots, "en_US", "Lapis Lazuli Boots");
/*      */     
/* 5704 */     LanguageRegistry.instance().addNameForObject(QueenHelmet, "en_US", "Queen Scale Helmet");
/* 5705 */     LanguageRegistry.instance().addNameForObject(QueenBody, "en_US", "Queen Scale Chestplate");
/* 5706 */     LanguageRegistry.instance().addNameForObject(QueenLegs, "en_US", "Queen Scale Leggings");
/* 5707 */     LanguageRegistry.instance().addNameForObject(QueenBoots, "en_US", "Queen Scale Boots");
/*      */ 
/*      */     
/* 5710 */     GameRegistry.addRecipe(new ItemStack((Item)MobzillaHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyGodzillaScale });
/*      */ 
/*      */     
/* 5713 */     GameRegistry.addRecipe(new ItemStack((Item)MobzillaHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyGodzillaScale });
/*      */ 
/*      */     
/* 5716 */     GameRegistry.addRecipe(new ItemStack((Item)MobzillaBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyGodzillaScale });
/*      */ 
/*      */     
/* 5719 */     GameRegistry.addRecipe(new ItemStack((Item)MobzillaLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyGodzillaScale });
/*      */ 
/*      */     
/* 5722 */     GameRegistry.addRecipe(new ItemStack((Item)MobzillaBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyGodzillaScale });
/*      */ 
/*      */ 
/*      */     
/* 5726 */     GameRegistry.addRecipe(new ItemStack((Item)LapisHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), Blocks.field_150368_y });
/*      */ 
/*      */     
/* 5729 */     GameRegistry.addRecipe(new ItemStack((Item)LapisHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), Blocks.field_150368_y });
/*      */ 
/*      */     
/* 5732 */     GameRegistry.addRecipe(new ItemStack((Item)LapisBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), Blocks.field_150368_y });
/*      */ 
/*      */     
/* 5735 */     GameRegistry.addRecipe(new ItemStack((Item)LapisLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), Blocks.field_150368_y });
/*      */ 
/*      */     
/* 5738 */     GameRegistry.addRecipe(new ItemStack((Item)LapisBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), Blocks.field_150368_y });
/*      */ 
/*      */ 
/*      */     
/* 5742 */     GameRegistry.addRecipe(new ItemStack((Item)QueenHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyQueenScale });
/*      */ 
/*      */     
/* 5745 */     GameRegistry.addRecipe(new ItemStack((Item)QueenHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyQueenScale });
/*      */ 
/*      */     
/* 5748 */     GameRegistry.addRecipe(new ItemStack((Item)QueenBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyQueenScale });
/*      */ 
/*      */     
/* 5751 */     GameRegistry.addRecipe(new ItemStack((Item)QueenLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyQueenScale });
/*      */ 
/*      */     
/* 5754 */     GameRegistry.addRecipe(new ItemStack((Item)QueenBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyQueenScale });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5759 */     LanguageRegistry.instance().addNameForObject(PeacockFeatherBoots, "en_US", "Peacock Feather Boots");
/* 5760 */     LanguageRegistry.instance().addNameForObject(PeacockFeatherHelmet, "en_US", "Peacock Feather Helmet");
/* 5761 */     LanguageRegistry.instance().addNameForObject(PeacockFeatherBody, "en_US", "Peacock Feather Chestplate");
/* 5762 */     LanguageRegistry.instance().addNameForObject(PeacockFeatherLegs, "en_US", "Peacock Feather Leggings");
/*      */     
/* 5764 */     GameRegistry.addRecipe(new ItemStack((Item)PeacockFeatherHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyPeacockFeather });
/*      */ 
/*      */     
/* 5767 */     GameRegistry.addRecipe(new ItemStack((Item)PeacockFeatherHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyPeacockFeather });
/*      */ 
/*      */     
/* 5770 */     GameRegistry.addRecipe(new ItemStack((Item)PeacockFeatherBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyPeacockFeather });
/*      */ 
/*      */     
/* 5773 */     GameRegistry.addRecipe(new ItemStack((Item)PeacockFeatherLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyPeacockFeather });
/*      */ 
/*      */     
/* 5776 */     GameRegistry.addRecipe(new ItemStack((Item)PeacockFeatherBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyPeacockFeather });
/*      */ 
/*      */ 
/*      */     
/* 5780 */     LanguageRegistry.instance().addNameForObject(TigersEyeHelmet, "en_US", "Tiger's Eye Helmet");
/* 5781 */     LanguageRegistry.instance().addNameForObject(TigersEyeBody, "en_US", "Tiger's Eye Chestplate");
/* 5782 */     LanguageRegistry.instance().addNameForObject(TigersEyeLegs, "en_US", "Tiger's Eye Leggings");
/* 5783 */     LanguageRegistry.instance().addNameForObject(TigersEyeBoots, "en_US", "Tiger's Eye Boots");
/*      */     
/* 5785 */     GameRegistry.addRecipe(new ItemStack((Item)TigersEyeHelmet), new Object[] { "   ", "***", "* *", Character.valueOf('*'), MyTigersEyeIngot });
/*      */ 
/*      */     
/* 5788 */     GameRegistry.addRecipe(new ItemStack((Item)TigersEyeHelmet), new Object[] { "***", "* *", "   ", Character.valueOf('*'), MyTigersEyeIngot });
/*      */ 
/*      */     
/* 5791 */     GameRegistry.addRecipe(new ItemStack((Item)TigersEyeBody), new Object[] { "* *", "***", "***", Character.valueOf('*'), MyTigersEyeIngot });
/*      */ 
/*      */     
/* 5794 */     GameRegistry.addRecipe(new ItemStack((Item)TigersEyeLegs), new Object[] { "***", "* *", "* *", Character.valueOf('*'), MyTigersEyeIngot });
/*      */ 
/*      */     
/* 5797 */     GameRegistry.addRecipe(new ItemStack((Item)TigersEyeBoots), new Object[] { "   ", "* *", "* *", Character.valueOf('*'), MyTigersEyeIngot });
/*      */ 
/*      */ 
/*      */     
/* 5801 */     LanguageRegistry.instance().addNameForObject(ExperienceHelmet, "en_US", "Experience Helmet");
/* 5802 */     LanguageRegistry.instance().addNameForObject(ExperienceBody, "en_US", "Experience Chestplate");
/* 5803 */     LanguageRegistry.instance().addNameForObject(ExperienceLegs, "en_US", "Experience Leggings");
/* 5804 */     LanguageRegistry.instance().addNameForObject(ExperienceBoots, "en_US", "Experience Boots");
/*      */     
/* 5806 */     GameRegistry.addRecipe(new ItemStack((Item)ExperienceHelmet), new Object[] { "EEE", "EAE", "EEE", Character.valueOf('A'), EmeraldHelmet, Character.valueOf('E'), Items.field_151062_by });
/*      */ 
/*      */ 
/*      */     
/* 5810 */     GameRegistry.addRecipe(new ItemStack((Item)ExperienceBody), new Object[] { "EEE", "EAE", "EEE", Character.valueOf('A'), EmeraldBody, Character.valueOf('E'), Items.field_151062_by });
/*      */ 
/*      */ 
/*      */     
/* 5814 */     GameRegistry.addRecipe(new ItemStack((Item)ExperienceLegs), new Object[] { "EEE", "EAE", "EEE", Character.valueOf('A'), EmeraldLegs, Character.valueOf('E'), Items.field_151062_by });
/*      */ 
/*      */ 
/*      */     
/* 5818 */     GameRegistry.addRecipe(new ItemStack((Item)ExperienceBoots), new Object[] { "EEE", "EAE", "EEE", Character.valueOf('A'), EmeraldBoots, Character.valueOf('E'), Items.field_151062_by });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5824 */     GameRegistry.addRecipe(new ItemStack(Blocks.field_150321_G), new Object[] { "***", "* *", "***", Character.valueOf('*'), Items.field_151007_F });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5829 */     EntityRegistry.instance(); int cageid = EntityRegistry.findGlobalUniqueEntityId();
/* 5830 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(EntityCage.class, "EntityCage", cageid);
/* 5831 */     EntityRegistry.instance(); EntityRegistry.registerModEntity(EntityCage.class, "EntityCage", cageid, this, 64, 1, true);
/*      */     
/* 5833 */     LanguageRegistry.instance().addNameForObject(CageEmpty, "en_US", "Empty Critter Cage");
/* 5834 */     LanguageRegistry.instance().addNameForObject(CagedSpider, "en_US", "Caged Spider");
/* 5835 */     LanguageRegistry.instance().addNameForObject(CagedBat, "en_US", "Caged Bat");
/* 5836 */     LanguageRegistry.instance().addNameForObject(CagedCow, "en_US", "Caged Cow");
/* 5837 */     LanguageRegistry.instance().addNameForObject(CagedPig, "en_US", "Caged Pig");
/* 5838 */     LanguageRegistry.instance().addNameForObject(CagedSquid, "en_US", "Caged Squid");
/* 5839 */     LanguageRegistry.instance().addNameForObject(CagedChicken, "en_US", "Caged Chicken");
/* 5840 */     LanguageRegistry.instance().addNameForObject(CagedCreeper, "en_US", "Caged Creeper");
/* 5841 */     LanguageRegistry.instance().addNameForObject(CagedSkeleton, "en_US", "Caged Skeleton");
/* 5842 */     LanguageRegistry.instance().addNameForObject(CagedZombie, "en_US", "Caged Zombie");
/* 5843 */     LanguageRegistry.instance().addNameForObject(CagedSlime, "en_US", "Caged Slime");
/* 5844 */     LanguageRegistry.instance().addNameForObject(CagedGhast, "en_US", "Caged Ghast");
/* 5845 */     LanguageRegistry.instance().addNameForObject(CagedZombiePigman, "en_US", "Caged ZombiePigman");
/* 5846 */     LanguageRegistry.instance().addNameForObject(CagedEnderman, "en_US", "Caged Enderman");
/* 5847 */     LanguageRegistry.instance().addNameForObject(CagedCaveSpider, "en_US", "Caged Cave Spider");
/* 5848 */     LanguageRegistry.instance().addNameForObject(CagedSilverfish, "en_US", "Caged Silverfish");
/* 5849 */     LanguageRegistry.instance().addNameForObject(CagedMagmaCube, "en_US", "Caged Magma Cube");
/* 5850 */     LanguageRegistry.instance().addNameForObject(CagedWitch, "en_US", "Caged Witch");
/* 5851 */     LanguageRegistry.instance().addNameForObject(CagedSheep, "en_US", "Caged Sheep");
/* 5852 */     LanguageRegistry.instance().addNameForObject(CagedWolf, "en_US", "Caged Wolf");
/* 5853 */     LanguageRegistry.instance().addNameForObject(CagedMooshroom, "en_US", "Caged Mooshroom");
/* 5854 */     LanguageRegistry.instance().addNameForObject(CagedOcelot, "en_US", "Caged Ocelot");
/* 5855 */     LanguageRegistry.instance().addNameForObject(CagedBlaze, "en_US", "Caged Blaze");
/* 5856 */     LanguageRegistry.instance().addNameForObject(CagedGirlfriend, "en_US", "Caged Girlfriend");
/* 5857 */     LanguageRegistry.instance().addNameForObject(CagedBoyfriend, "en_US", "Caged Boyfriend");
/* 5858 */     LanguageRegistry.instance().addNameForObject(CagedWitherSkeleton, "en_US", "Caged Wither Skeleton");
/* 5859 */     LanguageRegistry.instance().addNameForObject(CagedEnderDragon, "en_US", "Caged Ender Dragon");
/* 5860 */     LanguageRegistry.instance().addNameForObject(CagedSnowGolem, "en_US", "Caged Snow Golem");
/* 5861 */     LanguageRegistry.instance().addNameForObject(CagedIronGolem, "en_US", "Caged Iron Golem");
/* 5862 */     LanguageRegistry.instance().addNameForObject(CagedWitherBoss, "en_US", "Caged Wither Boss");
/* 5863 */     LanguageRegistry.instance().addNameForObject(CagedRedCow, "en_US", "Caged Apple Cow");
/* 5864 */     LanguageRegistry.instance().addNameForObject(CagedCrystalCow, "en_US", "Caged Crystal Cow");
/* 5865 */     LanguageRegistry.instance().addNameForObject(CagedVillager, "en_US", "Caged Villager");
/* 5866 */     LanguageRegistry.instance().addNameForObject(CagedGoldCow, "en_US", "Caged Golden Apple Cow");
/* 5867 */     LanguageRegistry.instance().addNameForObject(CagedEnchantedCow, "en_US", "Caged Enchanted Golden Apple Cow");
/* 5868 */     LanguageRegistry.instance().addNameForObject(CagedMOTHRA, "en_US", "Caged MOTHRA");
/* 5869 */     LanguageRegistry.instance().addNameForObject(CagedAlo, "en_US", "Caged Alosaurus");
/* 5870 */     LanguageRegistry.instance().addNameForObject(CagedCryo, "en_US", "Caged Cryosaurus");
/* 5871 */     LanguageRegistry.instance().addNameForObject(CagedCama, "en_US", "Caged Camarasaurus");
/* 5872 */     LanguageRegistry.instance().addNameForObject(CagedVelo, "en_US", "Caged Velocity Raptor");
/* 5873 */     LanguageRegistry.instance().addNameForObject(CagedHydro, "en_US", "Caged Hydrolisc");
/* 5874 */     LanguageRegistry.instance().addNameForObject(CagedBasil, "en_US", "Caged Basilisk");
/* 5875 */     LanguageRegistry.instance().addNameForObject(CagedDragonfly, "en_US", "Caged Dragonfly");
/* 5876 */     LanguageRegistry.instance().addNameForObject(CagedEmperorScorpion, "en_US", "Caged Emperor Scorpion");
/* 5877 */     LanguageRegistry.instance().addNameForObject(CagedScorpion, "en_US", "Caged Scorpion");
/* 5878 */     LanguageRegistry.instance().addNameForObject(CagedCaveFisher, "en_US", "Caged Cave Fisher");
/* 5879 */     LanguageRegistry.instance().addNameForObject(CagedSpyro, "en_US", "Caged Baby Dragon");
/* 5880 */     LanguageRegistry.instance().addNameForObject(CagedBaryonyx, "en_US", "Caged Baryonyx");
/* 5881 */     LanguageRegistry.instance().addNameForObject(CagedGammaMetroid, "en_US", "Caged WTF?");
/* 5882 */     LanguageRegistry.instance().addNameForObject(CagedCockateil, "en_US", "Caged Bird");
/* 5883 */     LanguageRegistry.instance().addNameForObject(CagedKyuubi, "en_US", "Caged Kyuubi");
/* 5884 */     LanguageRegistry.instance().addNameForObject(CagedAlien, "en_US", "Caged Alien");
/* 5885 */     LanguageRegistry.instance().addNameForObject(MyElevator, "en_US", "Hoverboard");
/* 5886 */     LanguageRegistry.instance().addNameForObject(CagedAttackSquid, "en_US", "Caged Attack Squid");
/* 5887 */     LanguageRegistry.instance().addNameForObject(CagedWaterDragon, "en_US", "Caged Water Dragon");
/* 5888 */     LanguageRegistry.instance().addNameForObject(CagedCephadrome, "en_US", "Caged Cephadrome");
/* 5889 */     LanguageRegistry.instance().addNameForObject(CagedKraken, "en_US", "Caged Kraken");
/* 5890 */     LanguageRegistry.instance().addNameForObject(CagedLizard, "en_US", "Caged Lizard");
/* 5891 */     LanguageRegistry.instance().addNameForObject(CagedDragon, "en_US", "Caged Dragon");
/* 5892 */     LanguageRegistry.instance().addNameForObject(CagedBee, "en_US", "Caged Bee");
/* 5893 */     LanguageRegistry.instance().addNameForObject(CagedHorse, "en_US", "Caged Horse");
/* 5894 */     LanguageRegistry.instance().addNameForObject(CagedFirefly, "en_US", "Caged Firefly");
/* 5895 */     LanguageRegistry.instance().addNameForObject(CagedChipmunk, "en_US", "Caged Chipmunk");
/* 5896 */     LanguageRegistry.instance().addNameForObject(CagedGazelle, "en_US", "Caged Gazelle");
/* 5897 */     LanguageRegistry.instance().addNameForObject(CagedOstrich, "en_US", "Caged Ostrich");
/* 5898 */     LanguageRegistry.instance().addNameForObject(CagedTrooper, "en_US", "Caged Jumpy Bug");
/* 5899 */     LanguageRegistry.instance().addNameForObject(CagedSpit, "en_US", "Caged Spit Bug");
/* 5900 */     LanguageRegistry.instance().addNameForObject(CagedStink, "en_US", "Caged Stink Bug");
/* 5901 */     LanguageRegistry.instance().addNameForObject(CagedCreepingHorror, "en_US", "Caged Creeping Horror");
/* 5902 */     LanguageRegistry.instance().addNameForObject(CagedTerribleTerror, "en_US", "Caged Terrible Terror");
/* 5903 */     LanguageRegistry.instance().addNameForObject(CagedCliffRacer, "en_US", "Caged Cliff Racer");
/* 5904 */     LanguageRegistry.instance().addNameForObject(CagedTriffid, "en_US", "Caged Triffid");
/* 5905 */     LanguageRegistry.instance().addNameForObject(CagedPitchBlack, "en_US", "Caged Nightmare");
/* 5906 */     LanguageRegistry.instance().addNameForObject(CagedLurkingTerror, "en_US", "Caged Lurking Terror");
/* 5907 */     LanguageRegistry.instance().addNameForObject(CagedSmallWorm, "en_US", "Caged Small Worm");
/* 5908 */     LanguageRegistry.instance().addNameForObject(CagedMediumWorm, "en_US", "Caged Medium Worm");
/* 5909 */     LanguageRegistry.instance().addNameForObject(CagedLargeWorm, "en_US", "Caged Large Worm");
/* 5910 */     LanguageRegistry.instance().addNameForObject(CagedCassowary, "en_US", "Caged Cassowary");
/* 5911 */     LanguageRegistry.instance().addNameForObject(CagedCloudShark, "en_US", "Caged Cloud Shark");
/* 5912 */     LanguageRegistry.instance().addNameForObject(CagedGoldFish, "en_US", "Caged Gold Fish");
/* 5913 */     LanguageRegistry.instance().addNameForObject(CagedLeafMonster, "en_US", "Caged Leaf Monster");
/* 5914 */     LanguageRegistry.instance().addNameForObject(CagedEnderKnight, "en_US", "Caged Ender Knight");
/* 5915 */     LanguageRegistry.instance().addNameForObject(CagedEnderReaper, "en_US", "Caged Ender Reaper");
/* 5916 */     LanguageRegistry.instance().addNameForObject(CagedBeaver, "en_US", "Caged Beaver");
/* 5917 */     LanguageRegistry.instance().addNameForObject(CagedUrchin, "en_US", "Caged Crystal Urchin");
/* 5918 */     LanguageRegistry.instance().addNameForObject(CagedFlounder, "en_US", "Caged Flounder");
/* 5919 */     LanguageRegistry.instance().addNameForObject(CagedSkate, "en_US", "Caged Skate");
/* 5920 */     LanguageRegistry.instance().addNameForObject(CagedRotator, "en_US", "Caged Rotator");
/* 5921 */     LanguageRegistry.instance().addNameForObject(CagedPeacock, "en_US", "Caged Peacock");
/* 5922 */     LanguageRegistry.instance().addNameForObject(CagedFairy, "en_US", "Caged Fairy");
/* 5923 */     LanguageRegistry.instance().addNameForObject(CagedDungeonBeast, "en_US", "Caged Dungeon Beast");
/* 5924 */     LanguageRegistry.instance().addNameForObject(CagedVortex, "en_US", "Caged Vortex");
/* 5925 */     LanguageRegistry.instance().addNameForObject(CagedRat, "en_US", "Caged Rat");
/* 5926 */     LanguageRegistry.instance().addNameForObject(CagedWhale, "en_US", "Caged Whale");
/* 5927 */     LanguageRegistry.instance().addNameForObject(CagedIrukandji, "en_US", "Caged Irukandji");
/* 5928 */     LanguageRegistry.instance().addNameForObject(CagedTRex, "en_US", "Caged T. Rex");
/* 5929 */     LanguageRegistry.instance().addNameForObject(CagedHercules, "en_US", "Caged Hercules Beetle");
/* 5930 */     LanguageRegistry.instance().addNameForObject(CagedMantis, "en_US", "Caged Mantis");
/* 5931 */     LanguageRegistry.instance().addNameForObject(CagedStinky, "en_US", "Caged Stinky");
/* 5932 */     LanguageRegistry.instance().addNameForObject(CagedEasterBunny, "en_US", "Caged Easter Bunny");
/* 5933 */     LanguageRegistry.instance().addNameForObject(CagedCaterKiller, "en_US", "Caged CaterKiller");
/* 5934 */     LanguageRegistry.instance().addNameForObject(CagedMolenoid, "en_US", "Caged Molenoid");
/* 5935 */     LanguageRegistry.instance().addNameForObject(CagedSeaMonster, "en_US", "Caged Sea Monster");
/* 5936 */     LanguageRegistry.instance().addNameForObject(CagedSeaViper, "en_US", "Caged Sea Viper");
/* 5937 */     LanguageRegistry.instance().addNameForObject(CagedLeon, "en_US", "Caged Leonopteryx");
/* 5938 */     LanguageRegistry.instance().addNameForObject(CagedHammerhead, "en_US", "Caged Hammerhead");
/* 5939 */     LanguageRegistry.instance().addNameForObject(CagedRubberDucky, "en_US", "Caged Rubber Ducky");
/* 5940 */     LanguageRegistry.instance().addNameForObject(CagedCriminal, "en_US", "Caged Criminal");
/* 5941 */     LanguageRegistry.instance().addNameForObject(CagedNastysaurus, "en_US", "Caged Nastysaurus");
/* 5942 */     LanguageRegistry.instance().addNameForObject(CagedPointysaurus, "en_US", "Caged Pointysaurus");
/* 5943 */     LanguageRegistry.instance().addNameForObject(CagedCricket, "en_US", "Caged Cricket");
/* 5944 */     LanguageRegistry.instance().addNameForObject(CagedBrutalfly, "en_US", "Caged Brutalfly");
/* 5945 */     LanguageRegistry.instance().addNameForObject(CagedFrog, "en_US", "Caged Frog");
/* 5946 */     LanguageRegistry.instance().addNameForObject(CagedSpiderDriver, "en_US", "Caged Spider Driver");
/* 5947 */     LanguageRegistry.instance().addNameForObject(CagedCrab, "en_US", "Caged Crab");
/*      */ 
/*      */     
/* 5950 */     LanguageRegistry.instance().addNameForObject(WitherSkeletonEgg, "en_US", "Spawn Wither Skeleton");
/* 5951 */     LanguageRegistry.instance().addNameForObject(EnderDragonEgg, "en_US", "Spawn Ender Dragon");
/* 5952 */     LanguageRegistry.instance().addNameForObject(SnowGolemEgg, "en_US", "Spawn Snow Golem");
/* 5953 */     LanguageRegistry.instance().addNameForObject(IronGolemEgg, "en_US", "Spawn Iron Golem");
/* 5954 */     LanguageRegistry.instance().addNameForObject(WitherBossEgg, "en_US", "Spawn Wither Boss");
/* 5955 */     LanguageRegistry.instance().addNameForObject(GirlfriendEgg, "en_US", "Spawn Girlfriend");
/* 5956 */     LanguageRegistry.instance().addNameForObject(BoyfriendEgg, "en_US", "Spawn Boyfriend");
/* 5957 */     LanguageRegistry.instance().addNameForObject(TheKingEgg, "en_US", "Spawn The King");
/* 5958 */     LanguageRegistry.instance().addNameForObject(TheQueenEgg, "en_US", "Spawn The Queen");
/* 5959 */     LanguageRegistry.instance().addNameForObject(ThePrinceEgg, "en_US", "Spawn The Prince");
/* 5960 */     LanguageRegistry.instance().addNameForObject(RedCowEgg, "en_US", "Spawn Apple Cow");
/* 5961 */     LanguageRegistry.instance().addNameForObject(CrystalCowEgg, "en_US", "Spawn Crystal Cow");
/* 5962 */     LanguageRegistry.instance().addNameForObject(GoldCowEgg, "en_US", "Spawn Golden Apple Cow");
/* 5963 */     LanguageRegistry.instance().addNameForObject(EnchantedCowEgg, "en_US", "Spawn Enchanted Golden Apple Cow");
/* 5964 */     LanguageRegistry.instance().addNameForObject(MOTHRAEgg, "en_US", "Spawn MOTHRA!");
/* 5965 */     LanguageRegistry.instance().addNameForObject(AloEgg, "en_US", "Spawn Alosaurus");
/* 5966 */     LanguageRegistry.instance().addNameForObject(CryoEgg, "en_US", "Spawn Cryolophosaurus");
/* 5967 */     LanguageRegistry.instance().addNameForObject(CamaEgg, "en_US", "Spawn Camarasaurus");
/* 5968 */     LanguageRegistry.instance().addNameForObject(VeloEgg, "en_US", "Spawn Velocity Raptor");
/* 5969 */     LanguageRegistry.instance().addNameForObject(HydroEgg, "en_US", "Spawn Hydrolisc");
/* 5970 */     LanguageRegistry.instance().addNameForObject(BasilEgg, "en_US", "Spawn Basilisk");
/* 5971 */     LanguageRegistry.instance().addNameForObject(DragonflyEgg, "en_US", "Spawn Dragonfly");
/* 5972 */     LanguageRegistry.instance().addNameForObject(EmperorScorpionEgg, "en_US", "Spawn Emperor Scorpion!");
/* 5973 */     LanguageRegistry.instance().addNameForObject(ScorpionEgg, "en_US", "Spawn Scorpion");
/* 5974 */     LanguageRegistry.instance().addNameForObject(CaveFisherEgg, "en_US", "Spawn Cave Fisher");
/* 5975 */     LanguageRegistry.instance().addNameForObject(SpyroEgg, "en_US", "Spawn Baby Dragon");
/* 5976 */     LanguageRegistry.instance().addNameForObject(BaryonyxEgg, "en_US", "Spawn Baryonyx");
/* 5977 */     LanguageRegistry.instance().addNameForObject(GammaMetroidEgg, "en_US", "Spawn WTF?");
/* 5978 */     LanguageRegistry.instance().addNameForObject(CockateilEgg, "en_US", "Spawn Bird");
/* 5979 */     LanguageRegistry.instance().addNameForObject(KyuubiEgg, "en_US", "Spawn Kyuubi");
/* 5980 */     LanguageRegistry.instance().addNameForObject(AlienEgg, "en_US", "Spawn Alien");
/* 5981 */     LanguageRegistry.instance().addNameForObject(AttackSquidEgg, "en_US", "Spawn Attack Squid");
/* 5982 */     LanguageRegistry.instance().addNameForObject(WaterDragonEgg, "en_US", "Spawn Water Dragon");
/* 5983 */     LanguageRegistry.instance().addNameForObject(CephadromeEgg, "en_US", "Spawn Cephadrome");
/* 5984 */     LanguageRegistry.instance().addNameForObject(KrakenEgg, "en_US", "Uh, no. Don't.");
/* 5985 */     LanguageRegistry.instance().addNameForObject(LizardEgg, "en_US", "Spawn Lizard");
/* 5986 */     LanguageRegistry.instance().addNameForObject(DragonEgg, "en_US", "Spawn Dragon");
/* 5987 */     LanguageRegistry.instance().addNameForObject(BeeEgg, "en_US", "Spawn Bee");
/* 5988 */     LanguageRegistry.instance().addNameForObject(TrooperBugEgg, "en_US", "Spawn Jumpy Bug");
/* 5989 */     LanguageRegistry.instance().addNameForObject(SpitBugEgg, "en_US", "Spawn Spit Bug");
/* 5990 */     LanguageRegistry.instance().addNameForObject(StinkBugEgg, "en_US", "Spawn Stink Bug");
/* 5991 */     LanguageRegistry.instance().addNameForObject(OstrichEgg, "en_US", "Spawn Ostrich");
/* 5992 */     LanguageRegistry.instance().addNameForObject(GazelleEgg, "en_US", "Spawn Gazelle");
/* 5993 */     LanguageRegistry.instance().addNameForObject(ChipmunkEgg, "en_US", "Spawn Chipmunk");
/* 5994 */     LanguageRegistry.instance().addNameForObject(CreepingHorrorEgg, "en_US", "Spawn Creeping Horror");
/* 5995 */     LanguageRegistry.instance().addNameForObject(TerribleTerrorEgg, "en_US", "Spawn Terrible Terror");
/* 5996 */     LanguageRegistry.instance().addNameForObject(CliffRacerEgg, "en_US", "Spawn Cliff Racer");
/* 5997 */     LanguageRegistry.instance().addNameForObject(TriffidEgg, "en_US", "Spawn Triffid");
/* 5998 */     LanguageRegistry.instance().addNameForObject(PitchBlackEgg, "en_US", "Spawn Nightmare!!!");
/* 5999 */     LanguageRegistry.instance().addNameForObject(LurkingTerrorEgg, "en_US", "Spawn Lurking Terror");
/* 6000 */     LanguageRegistry.instance().addNameForObject(GodzillaEgg, "en_US", "Spawn Mobzilla");
/* 6001 */     LanguageRegistry.instance().addNameForObject(SmallWormEgg, "en_US", "Spawn Small Worm");
/* 6002 */     LanguageRegistry.instance().addNameForObject(MediumWormEgg, "en_US", "Spawn Medium Worm");
/* 6003 */     LanguageRegistry.instance().addNameForObject(LargeWormEgg, "en_US", "Spawn Large Worm");
/* 6004 */     LanguageRegistry.instance().addNameForObject(CassowaryEgg, "en_US", "Spawn Cassowary");
/* 6005 */     LanguageRegistry.instance().addNameForObject(CloudSharkEgg, "en_US", "Spawn Cloud Shark");
/* 6006 */     LanguageRegistry.instance().addNameForObject(GoldFishEgg, "en_US", "Spawn Gold Fish");
/* 6007 */     LanguageRegistry.instance().addNameForObject(LeafMonsterEgg, "en_US", "Spawn Leaf Monster");
/* 6008 */     LanguageRegistry.instance().addNameForObject(TshirtEgg, "en_US", "Spawn T-Shirt!");
/* 6009 */     LanguageRegistry.instance().addNameForObject(EnderKnightEgg, "en_US", "Spawn Ender Knight");
/* 6010 */     LanguageRegistry.instance().addNameForObject(EnderReaperEgg, "en_US", "Spawn Ender Reaper");
/* 6011 */     LanguageRegistry.instance().addNameForObject(BeaverEgg, "en_US", "Spawn Beaver");
/* 6012 */     LanguageRegistry.instance().addNameForObject(FairyEgg, "en_US", "Spawn Fairy");
/* 6013 */     LanguageRegistry.instance().addNameForObject(VortexEgg, "en_US", "Spawn Vortex");
/* 6014 */     LanguageRegistry.instance().addNameForObject(RotatorEgg, "en_US", "Spawn Rotator");
/* 6015 */     LanguageRegistry.instance().addNameForObject(PeacockEgg, "en_US", "Spawn Peacock");
/* 6016 */     LanguageRegistry.instance().addNameForObject(DungeonBeastEgg, "en_US", "Spawn Dungeon Beast");
/* 6017 */     LanguageRegistry.instance().addNameForObject(RatEgg, "en_US", "Spawn Rat");
/* 6018 */     LanguageRegistry.instance().addNameForObject(FlounderEgg, "en_US", "Spawn Flounder");
/* 6019 */     LanguageRegistry.instance().addNameForObject(WhaleEgg, "en_US", "Spawn Whale");
/* 6020 */     LanguageRegistry.instance().addNameForObject(IrukandjiEgg, "en_US", "Spawn Irukandji");
/* 6021 */     LanguageRegistry.instance().addNameForObject(SkateEgg, "en_US", "Spawn Skate");
/* 6022 */     LanguageRegistry.instance().addNameForObject(UrchinEgg, "en_US", "Spawn Crystal Urchin");
/* 6023 */     LanguageRegistry.instance().addNameForObject(Robot1Egg, "en_US", "Spawn Bomb-Omb");
/* 6024 */     LanguageRegistry.instance().addNameForObject(Robot2Egg, "en_US", "Spawn Robo-Pounder");
/* 6025 */     LanguageRegistry.instance().addNameForObject(Robot3Egg, "en_US", "Spawn Robo-Gunner");
/* 6026 */     LanguageRegistry.instance().addNameForObject(Robot4Egg, "en_US", "Spawn Robo-Warrior");
/* 6027 */     LanguageRegistry.instance().addNameForObject(GhostEgg, "en_US", "Spawn Ghost");
/* 6028 */     LanguageRegistry.instance().addNameForObject(GhostSkellyEgg, "en_US", "Spawn Ghost Pumpkin Skelly");
/* 6029 */     LanguageRegistry.instance().addNameForObject(BrownAntEgg, "en_US", "Spawn Brown Ant");
/* 6030 */     LanguageRegistry.instance().addNameForObject(RedAntEgg, "en_US", "Spawn Red Ant");
/* 6031 */     LanguageRegistry.instance().addNameForObject(RainbowAntEgg, "en_US", "Spawn Rainbow Ant");
/* 6032 */     LanguageRegistry.instance().addNameForObject(UnstableAntEgg, "en_US", "Spawn Unstable Ant");
/* 6033 */     LanguageRegistry.instance().addNameForObject(TermiteEgg, "en_US", "Spawn Termite");
/* 6034 */     LanguageRegistry.instance().addNameForObject(ButterflyEgg, "en_US", "Spawn Butterfly");
/* 6035 */     LanguageRegistry.instance().addNameForObject(MothEgg, "en_US", "Spawn Moth");
/* 6036 */     LanguageRegistry.instance().addNameForObject(MosquitoEgg, "en_US", "Spawn Mosquito");
/* 6037 */     LanguageRegistry.instance().addNameForObject(FireflyEgg, "en_US", "Spawn Firefly");
/* 6038 */     LanguageRegistry.instance().addNameForObject(TRexEgg, "en_US", "Spawn T. Rex");
/* 6039 */     LanguageRegistry.instance().addNameForObject(HerculesEgg, "en_US", "Spawn Hercules Beetle");
/* 6040 */     LanguageRegistry.instance().addNameForObject(MantisEgg, "en_US", "Spawn Mantis");
/* 6041 */     LanguageRegistry.instance().addNameForObject(StinkyEgg, "en_US", "Spawn Stinky");
/* 6042 */     LanguageRegistry.instance().addNameForObject(Robot5Egg, "en_US", "Spawn Robo-Sniper");
/* 6043 */     LanguageRegistry.instance().addNameForObject(CoinEgg, "en_US", "Spawn Coin");
/* 6044 */     LanguageRegistry.instance().addNameForObject(EasterBunnyEgg, "en_US", "Spawn Easter Bunny");
/* 6045 */     LanguageRegistry.instance().addNameForObject(MolenoidEgg, "en_US", "Spawn Molenoid");
/* 6046 */     LanguageRegistry.instance().addNameForObject(SeaMonsterEgg, "en_US", "Spawn Sea Monster");
/* 6047 */     LanguageRegistry.instance().addNameForObject(SeaViperEgg, "en_US", "Spawn Sea Viper");
/* 6048 */     LanguageRegistry.instance().addNameForObject(CaterKillerEgg, "en_US", "Spawn CaterKiller");
/* 6049 */     LanguageRegistry.instance().addNameForObject(LeonEgg, "en_US", "Spawn Leonopteryx");
/* 6050 */     LanguageRegistry.instance().addNameForObject(HammerheadEgg, "en_US", "Spawn Hammerhead");
/* 6051 */     LanguageRegistry.instance().addNameForObject(RubberDuckyEgg, "en_US", "Spawn Rubber Ducky");
/* 6052 */     LanguageRegistry.instance().addNameForObject(CriminalEgg, "en_US", "Spawn Criminal");
/* 6053 */     LanguageRegistry.instance().addNameForObject(BrutalflyEgg, "en_US", "Spawn Brutalfly");
/* 6054 */     LanguageRegistry.instance().addNameForObject(NastysaurusEgg, "en_US", "Spawn Nastysaurus");
/* 6055 */     LanguageRegistry.instance().addNameForObject(PointysaurusEgg, "en_US", "Spawn Pointysaurus");
/* 6056 */     LanguageRegistry.instance().addNameForObject(CricketEgg, "en_US", "Spawn Cricket");
/* 6057 */     LanguageRegistry.instance().addNameForObject(ThePrincessEgg, "en_US", "Spawn The Princess");
/* 6058 */     LanguageRegistry.instance().addNameForObject(FrogEgg, "en_US", "Spawn Frog");
/* 6059 */     LanguageRegistry.instance().addNameForObject(JefferyEgg, "en_US", "Spawn Jeffery");
/* 6060 */     LanguageRegistry.instance().addNameForObject(AntRobotEgg, "en_US", "Spawn Red Ant Robot");
/* 6061 */     LanguageRegistry.instance().addNameForObject(SpiderRobotEgg, "en_US", "Spawn Giant Spider Robot");
/* 6062 */     LanguageRegistry.instance().addNameForObject(SpiderDriverEgg, "en_US", "Spawn Spider Robot Driver");
/* 6063 */     LanguageRegistry.instance().addNameForObject(CrabEgg, "en_US", "Spawn Crab");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6068 */     GameRegistry.addRecipe(new ItemStack(CageEmpty, 2), new Object[] { "IWI", "W W", "IWI", Character.valueOf('W'), Items.field_151055_y, Character.valueOf('I'), Items.field_151042_j });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6073 */     GameRegistry.addRecipe(new ItemStack(CageEmpty, 2), new Object[] { "IWI", "W W", "IWI", Character.valueOf('W'), CrystalSticks, Character.valueOf('I'), MyCrystalPinkIngot });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6080 */     EntityRegistry.instance(); int arrowid = EntityRegistry.findGlobalUniqueEntityId();
/* 6081 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(UltimateArrow.class, "UltimateArrow", arrowid);
/*      */     
/* 6083 */     EntityRegistry.instance(); int irukandiarrowid = EntityRegistry.findGlobalUniqueEntityId();
/* 6084 */     EntityRegistry.instance(); EntityRegistry.registerGlobalEntityID(IrukandjiArrow.class, "IrukandjiArrow", irukandiarrowid);
/*      */     
/* 6086 */     LanguageRegistry.instance().addNameForObject(MyAppleLeaves, "en_US", "Apple Tree Leaves");
/* 6087 */     LanguageRegistry.instance().addNameForObject(MySkyTreeLog, "en_US", "Sky Tree Wood");
/* 6088 */     GameRegistry.addShapelessRecipe(new ItemStack(Blocks.field_150344_f, 4), new Object[] { new ItemStack(MySkyTreeLog) });
/* 6089 */     LanguageRegistry.instance().addNameForObject(MyDT, "en_US", "Duplicator Tree Wood");
/* 6090 */     GameRegistry.addShapelessRecipe(new ItemStack(Blocks.field_150344_f, 4), new Object[] { new ItemStack(MyDT) });
/* 6091 */     LanguageRegistry.instance().addNameForObject(MyScaryLeaves, "en_US", "Scary Tree Leaves");
/* 6092 */     LanguageRegistry.instance().addNameForObject(MyCherryLeaves, "en_US", "Cherry Tree Leaves");
/* 6093 */     LanguageRegistry.instance().addNameForObject(MyPeachLeaves, "en_US", "Peach Tree Leaves");
/* 6094 */     LanguageRegistry.instance().addNameForObject(MyExperienceLeaves, "en_US", "Experience Tree Leaves");
/* 6095 */     LanguageRegistry.instance().addNameForObject(MyCrystalLeaves, "en_US", "Crystal Tree Leaves");
/* 6096 */     LanguageRegistry.instance().addNameForObject(MyCrystalLeaves2, "en_US", "Crystal Tree Leaves");
/* 6097 */     LanguageRegistry.instance().addNameForObject(MyCrystalLeaves3, "en_US", "Crystal Tree Leaves");
/* 6098 */     LanguageRegistry.instance().addNameForObject(MyCrystalTreeLog, "en_US", "Crystal Tree Wood");
/*      */ 
/*      */     
/* 6101 */     GameRegistry.addRecipe(new ItemStack(MyElevator), new Object[] { "   ", "WWW", "DRD", Character.valueOf('W'), Blocks.field_150344_f, Character.valueOf('R'), Items.field_151137_ax, Character.valueOf('D'), Items.field_151045_i });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6110 */     GameRegistry.registerWorldGenerator(this.OreSpawnGen, 10);
/*      */ 
/*      */ 
/*      */     
/* 6114 */     proxy.registerRenderThings();
/*      */     
/* 6116 */     proxy.registerKeyboardInput();
/*      */     
/* 6118 */     proxy.registerNetworkStuff();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6123 */     DimensionManager.registerProviderType(DimensionID, WorldProviderOreSpawn.class, true);
/* 6124 */     DimensionManager.registerDimension(DimensionID, DimensionID);
/*      */     
/* 6126 */     DimensionManager.registerProviderType(DimensionID2, WorldProviderOreSpawn2.class, true);
/* 6127 */     DimensionManager.registerDimension(DimensionID2, DimensionID2);
/*      */     
/* 6129 */     DimensionManager.registerProviderType(DimensionID3, WorldProviderOreSpawn3.class, true);
/* 6130 */     DimensionManager.registerDimension(DimensionID3, DimensionID3);
/*      */     
/* 6132 */     DimensionManager.registerProviderType(DimensionID4, WorldProviderOreSpawn4.class, true);
/* 6133 */     DimensionManager.registerDimension(DimensionID4, DimensionID4);
/*      */     
/* 6135 */     DimensionManager.registerProviderType(DimensionID5, WorldProviderOreSpawn5.class, true);
/* 6136 */     DimensionManager.registerDimension(DimensionID5, DimensionID5);
/*      */     
/* 6138 */     DimensionManager.registerProviderType(DimensionID6, WorldProviderOreSpawn6.class, true);
/* 6139 */     DimensionManager.registerDimension(DimensionID6, DimensionID6);
/*      */ 
/*      */     
/* 6142 */     ChestGenHooks chestGenHooksDungeon = ChestGenHooks.getInfo("dungeonChest");
/* 6143 */     chestGenHooksDungeon.addItem(new WeightedRandomChestContent(new ItemStack(MyRuby), 1, 1, 3));
/* 6144 */     chestGenHooksDungeon.addItem(new WeightedRandomChestContent(new ItemStack(MyAmethyst), 1, 1, 3));
/* 6145 */     chestGenHooksDungeon.addItem(new WeightedRandomChestContent(new ItemStack(MyThunderStaff), 1, 1, 2));
/*      */     
/* 6147 */     ChestGenHooks chestGenHooksJungleChest = ChestGenHooks.getInfo("pyramidJungleChest");
/* 6148 */     chestGenHooksJungleChest.addItem(new WeightedRandomChestContent(new ItemStack(MyRuby), 1, 1, 3));
/* 6149 */     chestGenHooksJungleChest.addItem(new WeightedRandomChestContent(new ItemStack(MyAmethyst), 1, 1, 3));
/* 6150 */     chestGenHooksJungleChest.addItem(new WeightedRandomChestContent(new ItemStack(AntRobotKit), 1, 1, 3));
/*      */     
/* 6152 */     ChestGenHooks chestGenHooksDesertChest = ChestGenHooks.getInfo("pyramidDesertyChest");
/* 6153 */     chestGenHooksDesertChest.addItem(new WeightedRandomChestContent(new ItemStack(MyRuby), 1, 1, 2));
/* 6154 */     chestGenHooksDesertChest.addItem(new WeightedRandomChestContent(new ItemStack(MyAmethyst), 1, 1, 2));
/* 6155 */     chestGenHooksDesertChest.addItem(new WeightedRandomChestContent(new ItemStack(SpiderRobotKit), 1, 1, 2));
/*      */ 
/*      */     
/* 6158 */     GameRegistry.registerTileEntity(TileEntityCrystalFurnace.class, "TileEntityCrystalFurnace");
/* 6159 */     NetworkRegistry.INSTANCE.registerGuiHandler(this, new OreSpawnGUIHandler());
/*      */     
/* 6161 */     DoDispenserRegistrations();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void initializeCagesAndEggs() {
/* 6167 */     CageEmpty = (new CritterCage(BaseItemID + 0, 160)).func_77655_b("cageempty");
/* 6168 */     CagedSpider = (new CritterCage(BaseItemID + 1, 161)).func_77655_b("cagespider");
/* 6169 */     CagedBat = (new CritterCage(BaseItemID + 2, 162)).func_77655_b("cagebat");
/* 6170 */     CagedCow = (new CritterCage(BaseItemID + 3, 163)).func_77655_b("cagecow");
/* 6171 */     CagedPig = (new CritterCage(BaseItemID + 4, 164)).func_77655_b("cagepig");
/* 6172 */     CagedSquid = (new CritterCage(BaseItemID + 5, 165)).func_77655_b("cagesquid");
/* 6173 */     CagedChicken = (new CritterCage(BaseItemID + 6, 166)).func_77655_b("cagechicken");
/* 6174 */     CagedCreeper = (new CritterCage(BaseItemID + 7, 167)).func_77655_b("cagecreeper");
/* 6175 */     CagedSkeleton = (new CritterCage(BaseItemID + 8, 168)).func_77655_b("cageskeleton");
/* 6176 */     CagedZombie = (new CritterCage(BaseItemID + 9, 169)).func_77655_b("cagezombie");
/* 6177 */     CagedSlime = (new CritterCage(BaseItemID + 10, 170)).func_77655_b("cageslime");
/* 6178 */     CagedGhast = (new CritterCage(BaseItemID + 11, 171)).func_77655_b("cageghast");
/* 6179 */     CagedZombiePigman = (new CritterCage(BaseItemID + 12, 172)).func_77655_b("cagezombiepigman");
/* 6180 */     CagedEnderman = (new CritterCage(BaseItemID + 13, 173)).func_77655_b("cageenderman");
/* 6181 */     CagedCaveSpider = (new CritterCage(BaseItemID + 14, 174)).func_77655_b("cagecavespider");
/* 6182 */     CagedSilverfish = (new CritterCage(BaseItemID + 15, 175)).func_77655_b("cagesilverfish");
/* 6183 */     CagedMagmaCube = (new CritterCage(BaseItemID + 16, 176)).func_77655_b("cagemagmacube");
/* 6184 */     CagedWitch = (new CritterCage(BaseItemID + 17, 177)).func_77655_b("cagewitch");
/* 6185 */     CagedSheep = (new CritterCage(BaseItemID + 18, 178)).func_77655_b("cagesheep");
/* 6186 */     CagedWolf = (new CritterCage(BaseItemID + 19, 179)).func_77655_b("cagewolf");
/* 6187 */     CagedMooshroom = (new CritterCage(BaseItemID + 20, 180)).func_77655_b("cagemooshroom");
/* 6188 */     CagedOcelot = (new CritterCage(BaseItemID + 21, 181)).func_77655_b("cageocelot");
/* 6189 */     CagedBlaze = (new CritterCage(BaseItemID + 22, 182)).func_77655_b("cageblaze");
/* 6190 */     CagedGirlfriend = (new CritterCage(BaseItemID + 23, 183)).func_77655_b("cagegirlfriend");
/* 6191 */     CagedBoyfriend = (new CritterCage(BaseItemID + 95, 215)).func_77655_b("cageboyfriend");
/* 6192 */     CagedWitherSkeleton = (new CritterCage(BaseItemID + 24, 188)).func_77655_b("cagewitherskeleton");
/* 6193 */     CagedEnderDragon = (new CritterCage(BaseItemID + 25, 184)).func_77655_b("cageenderdragon");
/* 6194 */     CagedSnowGolem = (new CritterCage(BaseItemID + 26, 185)).func_77655_b("cagesnowgolem");
/* 6195 */     CagedIronGolem = (new CritterCage(BaseItemID + 27, 186)).func_77655_b("cageirongolem");
/* 6196 */     CagedWitherBoss = (new CritterCage(BaseItemID + 28, 187)).func_77655_b("cagewitherboss");
/* 6197 */     CagedRedCow = (new CritterCage(BaseItemID + 29, 189)).func_77655_b("cageredcow");
/* 6198 */     CagedGoldCow = (new CritterCage(BaseItemID + 30, 190)).func_77655_b("cagegoldcow");
/* 6199 */     CagedEnchantedCow = (new CritterCage(BaseItemID + 31, 191)).func_77655_b("cageenchantedcow");
/* 6200 */     CagedMOTHRA = (new CritterCage(BaseItemID + 32, 208)).func_77655_b("cageMOTHRA");
/* 6201 */     CagedAlo = (new CritterCage(BaseItemID + 33, 209)).func_77655_b("cagealosaurus");
/* 6202 */     CagedCryo = (new CritterCage(BaseItemID + 34, 210)).func_77655_b("cagecryolophosaurus");
/* 6203 */     CagedCama = (new CritterCage(BaseItemID + 35, 211)).func_77655_b("cagecamarasaurus");
/* 6204 */     CagedVelo = (new CritterCage(BaseItemID + 36, 212)).func_77655_b("cagevelocityraptor");
/* 6205 */     CagedHydro = (new CritterCage(BaseItemID + 37, 213)).func_77655_b("cagehydrolisc");
/* 6206 */     CagedBasil = (new CritterCage(BaseItemID + 38, 214)).func_77655_b("cagebasilisc");
/* 6207 */     CagedDragonfly = (new CritterCage(BaseItemID + 39, 220)).func_77655_b("cagedragonfly");
/* 6208 */     CagedEmperorScorpion = (new CritterCage(BaseItemID + 41, 222)).func_77655_b("cageemperorscorpion");
/* 6209 */     CagedScorpion = (new CritterCage(BaseItemID + 40, 224)).func_77655_b("cagescorpion");
/* 6210 */     CagedCaveFisher = (new CritterCage(BaseItemID + 45, 226)).func_77655_b("cagecavefisher");
/* 6211 */     CagedSpyro = (new CritterCage(BaseItemID + 42, 228)).func_77655_b("cagespyro");
/* 6212 */     CagedBaryonyx = (new CritterCage(BaseItemID + 43, 230)).func_77655_b("cagebaryonyx");
/* 6213 */     CagedGammaMetroid = (new CritterCage(BaseItemID + 44, 232)).func_77655_b("cagegammametroid");
/* 6214 */     CagedCockateil = (new CritterCage(BaseItemID + 46, 234)).func_77655_b("cagecockateil");
/* 6215 */     CagedKyuubi = (new CritterCage(BaseItemID + 47, 236)).func_77655_b("cagekyuubi");
/* 6216 */     CagedAlien = (new CritterCage(BaseItemID + 48, 238)).func_77655_b("cagealien");
/* 6217 */     CagedAttackSquid = (new CritterCage(BaseItemID + 49, 240)).func_77655_b("cageattacksquid");
/* 6218 */     CagedWaterDragon = (new CritterCage(BaseItemID + 50, 242)).func_77655_b("cagewaterdragon");
/* 6219 */     CagedCephadrome = (new CritterCage(BaseItemID + 53, 248)).func_77655_b("cagecephadrome");
/* 6220 */     CagedKraken = (new CritterCage(BaseItemID + 51, 244)).func_77655_b("cagekraken");
/* 6221 */     CagedLizard = (new CritterCage(BaseItemID + 52, 246)).func_77655_b("cagelizard");
/* 6222 */     CagedDragon = (new CritterCage(BaseItemID + 54, 250)).func_77655_b("cagedragon");
/* 6223 */     CagedBee = (new CritterCage(BaseItemID + 55, 252)).func_77655_b("cagebee");
/* 6224 */     CagedHorse = (new CritterCage(BaseItemID + 56, 253)).func_77655_b("cagehorse");
/* 6225 */     CagedFirefly = (new CritterCage(BaseItemID + 57, 255)).func_77655_b("cagefirefly");
/* 6226 */     CagedChipmunk = (new CritterCage(BaseItemID + 58, 256)).func_77655_b("cagechipmunk");
/* 6227 */     CagedGazelle = (new CritterCage(BaseItemID + 59, 257)).func_77655_b("cagegazelle");
/* 6228 */     CagedOstrich = (new CritterCage(BaseItemID + 60, 258)).func_77655_b("cageostrich");
/* 6229 */     CagedTrooper = (new CritterCage(BaseItemID + 61, 259)).func_77655_b("cagetrooper");
/* 6230 */     CagedSpit = (new CritterCage(BaseItemID + 62, 260)).func_77655_b("cagespit");
/* 6231 */     CagedStink = (new CritterCage(BaseItemID + 63, 261)).func_77655_b("cagestink");
/* 6232 */     CagedCreepingHorror = (new CritterCage(BaseItemID + 64, 268)).func_77655_b("cagecreepinghorror");
/* 6233 */     CagedTerribleTerror = (new CritterCage(BaseItemID + 65, 269)).func_77655_b("cageterribleterror");
/* 6234 */     CagedCliffRacer = (new CritterCage(BaseItemID + 66, 270)).func_77655_b("cagecliffracer");
/* 6235 */     CagedTriffid = (new CritterCage(BaseItemID + 67, 271)).func_77655_b("cagetriffid");
/* 6236 */     CagedPitchBlack = (new CritterCage(BaseItemID + 68, 272)).func_77655_b("cagenightmare");
/* 6237 */     CagedLurkingTerror = (new CritterCage(BaseItemID + 69, 273)).func_77655_b("cagelurkingterror");
/* 6238 */     CagedSmallWorm = (new CritterCage(BaseItemID + 70, 281)).func_77655_b("cagesmallworm");
/* 6239 */     CagedMediumWorm = (new CritterCage(BaseItemID + 71, 282)).func_77655_b("cagemediumworm");
/* 6240 */     CagedLargeWorm = (new CritterCage(BaseItemID + 72, 283)).func_77655_b("cagelargeworm");
/* 6241 */     CagedCassowary = (new CritterCage(BaseItemID + 73, 284)).func_77655_b("cagecassowary");
/* 6242 */     CagedCloudShark = (new CritterCage(BaseItemID + 74, 285)).func_77655_b("cagecloudshark");
/* 6243 */     CagedGoldFish = (new CritterCage(BaseItemID + 75, 286)).func_77655_b("cagegoldfish");
/* 6244 */     CagedLeafMonster = (new CritterCage(BaseItemID + 76, 287)).func_77655_b("cageleafmonster");
/* 6245 */     CagedEnderKnight = (new CritterCage(BaseItemID + 77, 296)).func_77655_b("cageenderknight");
/* 6246 */     CagedEnderReaper = (new CritterCage(BaseItemID + 78, 297)).func_77655_b("cageenderreaper");
/* 6247 */     CagedBeaver = (new CritterCage(BaseItemID + 79, 300)).func_77655_b("cagebeaver");
/* 6248 */     CagedUrchin = (new CritterCage(BaseItemID + 80, 323)).func_77655_b("cageurchin");
/* 6249 */     CagedFlounder = (new CritterCage(BaseItemID + 81, 319)).func_77655_b("cageflounder");
/* 6250 */     CagedSkate = (new CritterCage(BaseItemID + 82, 322)).func_77655_b("cageskate");
/* 6251 */     CagedRotator = (new CritterCage(BaseItemID + 83, 313)).func_77655_b("cagerotator");
/* 6252 */     CagedPeacock = (new CritterCage(BaseItemID + 84, 315)).func_77655_b("cagepeacock");
/* 6253 */     CagedFairy = (new CritterCage(BaseItemID + 85, 316)).func_77655_b("cagefairy");
/* 6254 */     CagedDungeonBeast = (new CritterCage(BaseItemID + 86, 317)).func_77655_b("cagedungeonbeast");
/* 6255 */     CagedVortex = (new CritterCage(BaseItemID + 87, 314)).func_77655_b("cagevortex");
/* 6256 */     CagedRat = (new CritterCage(BaseItemID + 88, 318)).func_77655_b("cagerat");
/* 6257 */     CagedWhale = (new CritterCage(BaseItemID + 89, 320)).func_77655_b("cagewhale");
/* 6258 */     CagedIrukandji = (new CritterCage(BaseItemID + 90, 321)).func_77655_b("cageirukandji");
/* 6259 */     CagedTRex = (new CritterCage(BaseItemID + 91, 345)).func_77655_b("cagetrex");
/* 6260 */     CagedHercules = (new CritterCage(BaseItemID + 92, 346)).func_77655_b("cagehercules");
/* 6261 */     CagedMantis = (new CritterCage(BaseItemID + 93, 347)).func_77655_b("cagemantis");
/* 6262 */     CagedStinky = (new CritterCage(BaseItemID + 94, 348)).func_77655_b("cagestinky");
/* 6263 */     CagedEasterBunny = (new CritterCage(BaseItemID + 96, 150)).func_77655_b("cageeasterbunny");
/* 6264 */     CagedCaterKiller = (new CritterCage(BaseItemID + 97, 151)).func_77655_b("cagecaterkiller");
/* 6265 */     CagedMolenoid = (new CritterCage(BaseItemID + 98, 152)).func_77655_b("cagemolenoid");
/* 6266 */     CagedSeaMonster = (new CritterCage(BaseItemID + 99, 153)).func_77655_b("cageseamonster");
/* 6267 */     CagedSeaViper = (new CritterCage(BaseItemID + 174, 154)).func_77655_b("cageseaviper");
/* 6268 */     CagedLeon = (new CritterCage(BaseItemID + 423, 357)).func_77655_b("cageleon");
/* 6269 */     CagedHammerhead = (new CritterCage(BaseItemID + 425, 359)).func_77655_b("cagehammerhead");
/* 6270 */     CagedRubberDucky = (new CritterCage(BaseItemID + 427, 361)).func_77655_b("cagerubberducky");
/* 6271 */     CagedCrystalCow = (new CritterCage(BaseItemID + 429, 216)).func_77655_b("cagecrystalcow");
/* 6272 */     CagedVillager = (new CritterCage(BaseItemID + 430, 217)).func_77655_b("cagevillager");
/* 6273 */     CagedCriminal = (new CritterCage(BaseItemID + 433, 218)).func_77655_b("cagecriminal");
/* 6274 */     CagedBrutalfly = (new CritterCage(BaseItemID + 465, 373)).func_77655_b("cagebrutalfly");
/* 6275 */     CagedNastysaurus = (new CritterCage(BaseItemID + 466, 374)).func_77655_b("cagenastysaurus");
/* 6276 */     CagedPointysaurus = (new CritterCage(BaseItemID + 467, 375)).func_77655_b("cagepointysaurus");
/* 6277 */     CagedCricket = (new CritterCage(BaseItemID + 468, 376)).func_77655_b("cagecricket");
/* 6278 */     CagedFrog = (new CritterCage(BaseItemID + 469, 377)).func_77655_b("cagefrog");
/* 6279 */     CagedSpiderDriver = (new CritterCage(BaseItemID + 478, 382)).func_77655_b("cagespiderdriver");
/* 6280 */     CagedCrab = (new CritterCage(BaseItemID + 483, 384)).func_77655_b("cagecrab");
/*      */ 
/*      */     
/* 6283 */     WitherSkeletonEgg = (new ItemSpawnEgg(BaseItemID + 100, 192)).func_77655_b("eggwitherskeleton");
/* 6284 */     EnderDragonEgg = (new ItemSpawnEgg(BaseItemID + 101, 193)).func_77655_b("eggenderdragon");
/* 6285 */     SnowGolemEgg = (new ItemSpawnEgg(BaseItemID + 102, 194)).func_77655_b("eggsnowgolem");
/* 6286 */     IronGolemEgg = (new ItemSpawnEgg(BaseItemID + 103, 195)).func_77655_b("eggirongolem");
/* 6287 */     WitherBossEgg = (new ItemSpawnEgg(BaseItemID + 104, 196)).func_77655_b("eggwitherboss");
/* 6288 */     GirlfriendEgg = (new ItemSpawnEgg(BaseItemID + 105, 197)).func_77655_b("egggirlfriend");
/* 6289 */     RedCowEgg = (new ItemSpawnEgg(BaseItemID + 106, 198)).func_77655_b("eggredcow");
/* 6290 */     CrystalCowEgg = (new ItemSpawnEgg(BaseItemID + 431, 363)).func_77655_b("eggcrystalcow");
/* 6291 */     GoldCowEgg = (new ItemSpawnEgg(BaseItemID + 107, 199)).func_77655_b("egggoldcow");
/* 6292 */     EnchantedCowEgg = (new ItemSpawnEgg(BaseItemID + 108, 200)).func_77655_b("eggenchantedcow");
/* 6293 */     MOTHRAEgg = (new ItemSpawnEgg(BaseItemID + 109, 201)).func_77655_b("eggMOTHRA");
/* 6294 */     AloEgg = (new ItemSpawnEgg(BaseItemID + 110, 202)).func_77655_b("eggalosaurus");
/* 6295 */     CryoEgg = (new ItemSpawnEgg(BaseItemID + 111, 203)).func_77655_b("eggcryolophosaurus");
/* 6296 */     CamaEgg = (new ItemSpawnEgg(BaseItemID + 112, 204)).func_77655_b("eggcamarasaurus");
/* 6297 */     VeloEgg = (new ItemSpawnEgg(BaseItemID + 113, 205)).func_77655_b("eggvelocityraptor");
/* 6298 */     HydroEgg = (new ItemSpawnEgg(BaseItemID + 114, 206)).func_77655_b("egghydrolisc");
/* 6299 */     BasilEgg = (new ItemSpawnEgg(BaseItemID + 115, 207)).func_77655_b("eggbasilisc");
/* 6300 */     DragonflyEgg = (new ItemSpawnEgg(BaseItemID + 116, 221)).func_77655_b("eggdragonfly");
/* 6301 */     EmperorScorpionEgg = (new ItemSpawnEgg(BaseItemID + 117, 223)).func_77655_b("eggemperorscorpion");
/* 6302 */     ScorpionEgg = (new ItemSpawnEgg(BaseItemID + 118, 225)).func_77655_b("eggscorpion");
/* 6303 */     CaveFisherEgg = (new ItemSpawnEgg(BaseItemID + 119, 227)).func_77655_b("eggcavefisher");
/* 6304 */     SpyroEgg = (new ItemSpawnEgg(BaseItemID + 120, 229)).func_77655_b("eggspyro");
/* 6305 */     BaryonyxEgg = (new ItemSpawnEgg(BaseItemID + 121, 231)).func_77655_b("eggbaryonyx");
/* 6306 */     GammaMetroidEgg = (new ItemSpawnEgg(BaseItemID + 122, 233)).func_77655_b("egggammametroid");
/* 6307 */     CockateilEgg = (new ItemSpawnEgg(BaseItemID + 123, 235)).func_77655_b("eggcockateil");
/* 6308 */     KyuubiEgg = (new ItemSpawnEgg(BaseItemID + 124, 237)).func_77655_b("eggkyuubi");
/* 6309 */     AlienEgg = (new ItemSpawnEgg(BaseItemID + 125, 239)).func_77655_b("eggalien");
/* 6310 */     AttackSquidEgg = (new ItemSpawnEgg(BaseItemID + 126, 241)).func_77655_b("eggattacksquid");
/* 6311 */     WaterDragonEgg = (new ItemSpawnEgg(BaseItemID + 127, 243)).func_77655_b("eggwaterdragon");
/* 6312 */     CephadromeEgg = (new ItemSpawnEgg(BaseItemID + 130, 249)).func_77655_b("eggcephadrome");
/* 6313 */     KrakenEgg = (new ItemSpawnEgg(BaseItemID + 128, 245)).func_77655_b("eggkraken");
/* 6314 */     LizardEgg = (new ItemSpawnEgg(BaseItemID + 129, 247)).func_77655_b("egglizard");
/* 6315 */     DragonEgg = (new ItemSpawnEgg(BaseItemID + 131, 251)).func_77655_b("eggdragon");
/* 6316 */     BeeEgg = (new ItemSpawnEgg(BaseItemID + 132, 254)).func_77655_b("eggbee");
/* 6317 */     TrooperBugEgg = (new ItemSpawnEgg(BaseItemID + 133, 262)).func_77655_b("eggtrooper");
/* 6318 */     SpitBugEgg = (new ItemSpawnEgg(BaseItemID + 134, 263)).func_77655_b("eggspit");
/* 6319 */     StinkBugEgg = (new ItemSpawnEgg(BaseItemID + 135, 264)).func_77655_b("eggstink");
/* 6320 */     OstrichEgg = (new ItemSpawnEgg(BaseItemID + 136, 265)).func_77655_b("eggostrich");
/* 6321 */     GazelleEgg = (new ItemSpawnEgg(BaseItemID + 137, 266)).func_77655_b("egggazelle");
/* 6322 */     ChipmunkEgg = (new ItemSpawnEgg(BaseItemID + 138, 267)).func_77655_b("eggchipmunk");
/* 6323 */     CreepingHorrorEgg = (new ItemSpawnEgg(BaseItemID + 139, 274)).func_77655_b("eggcreepinghorror");
/* 6324 */     TerribleTerrorEgg = (new ItemSpawnEgg(BaseItemID + 140, 275)).func_77655_b("eggterribleterror");
/* 6325 */     CliffRacerEgg = (new ItemSpawnEgg(BaseItemID + 141, 276)).func_77655_b("eggcliffracer");
/* 6326 */     TriffidEgg = (new ItemSpawnEgg(BaseItemID + 142, 277)).func_77655_b("eggtriffid");
/* 6327 */     PitchBlackEgg = (new ItemSpawnEgg(BaseItemID + 143, 278)).func_77655_b("eggnightmare");
/* 6328 */     LurkingTerrorEgg = (new ItemSpawnEgg(BaseItemID + 144, 279)).func_77655_b("egglurkingterror");
/* 6329 */     GodzillaEgg = (new ItemSpawnEgg(BaseItemID + 145, 280)).func_77655_b("egggodzilla");
/* 6330 */     SmallWormEgg = (new ItemSpawnEgg(BaseItemID + 146, 288)).func_77655_b("eggsmallworm");
/* 6331 */     MediumWormEgg = (new ItemSpawnEgg(BaseItemID + 147, 289)).func_77655_b("eggmediumworm");
/* 6332 */     LargeWormEgg = (new ItemSpawnEgg(BaseItemID + 148, 290)).func_77655_b("egglargeworm");
/* 6333 */     CassowaryEgg = (new ItemSpawnEgg(BaseItemID + 149, 291)).func_77655_b("eggcassowary");
/* 6334 */     CloudSharkEgg = (new ItemSpawnEgg(BaseItemID + 165, 292)).func_77655_b("eggcloudshark");
/* 6335 */     GoldFishEgg = (new ItemSpawnEgg(BaseItemID + 166, 293)).func_77655_b("egggoldfish");
/* 6336 */     LeafMonsterEgg = (new ItemSpawnEgg(BaseItemID + 167, 294)).func_77655_b("eggleafmonster");
/* 6337 */     TshirtEgg = (new ItemSpawnEgg(BaseItemID + 168, 295)).func_77655_b("eggtshirt");
/* 6338 */     EnderKnightEgg = (new ItemSpawnEgg(BaseItemID + 169, 298)).func_77655_b("eggenderknight");
/* 6339 */     EnderReaperEgg = (new ItemSpawnEgg(BaseItemID + 170, 299)).func_77655_b("eggenderreaper");
/* 6340 */     BeaverEgg = (new ItemSpawnEgg(BaseItemID + 171, 301)).func_77655_b("eggbeaver");
/* 6341 */     RotatorEgg = (new ItemSpawnEgg(BaseItemID + 219, 302)).func_77655_b("eggrotator");
/* 6342 */     VortexEgg = (new ItemSpawnEgg(BaseItemID + 223, 303)).func_77655_b("eggvortex");
/* 6343 */     PeacockEgg = (new ItemSpawnEgg(BaseItemID + 220, 304)).func_77655_b("eggpeacock");
/* 6344 */     FairyEgg = (new ItemSpawnEgg(BaseItemID + 221, 305)).func_77655_b("eggfairy");
/* 6345 */     DungeonBeastEgg = (new ItemSpawnEgg(BaseItemID + 222, 306)).func_77655_b("eggdungeonbeast");
/* 6346 */     RatEgg = (new ItemSpawnEgg(BaseItemID + 374, 307)).func_77655_b("eggrat");
/* 6347 */     FlounderEgg = (new ItemSpawnEgg(BaseItemID + 375, 308)).func_77655_b("eggflounder");
/* 6348 */     WhaleEgg = (new ItemSpawnEgg(BaseItemID + 376, 309)).func_77655_b("eggwhale");
/* 6349 */     IrukandjiEgg = (new ItemSpawnEgg(BaseItemID + 377, 310)).func_77655_b("eggirukandji");
/* 6350 */     SkateEgg = (new ItemSpawnEgg(BaseItemID + 378, 311)).func_77655_b("eggskate");
/* 6351 */     UrchinEgg = (new ItemSpawnEgg(BaseItemID + 379, 312)).func_77655_b("eggurchin");
/* 6352 */     Robot1Egg = (new ItemSpawnEgg(BaseItemID + 380, 324)).func_77655_b("eggrobot1");
/* 6353 */     Robot2Egg = (new ItemSpawnEgg(BaseItemID + 381, 325)).func_77655_b("eggrobot2");
/* 6354 */     Robot3Egg = (new ItemSpawnEgg(BaseItemID + 382, 326)).func_77655_b("eggrobot3");
/* 6355 */     Robot4Egg = (new ItemSpawnEgg(BaseItemID + 383, 327)).func_77655_b("eggrobot4");
/* 6356 */     GhostEgg = (new ItemSpawnEgg(BaseItemID + 384, 328)).func_77655_b("eggghost");
/* 6357 */     GhostSkellyEgg = (new ItemSpawnEgg(BaseItemID + 385, 329)).func_77655_b("eggghostskelly");
/* 6358 */     BrownAntEgg = (new ItemSpawnEgg(BaseItemID + 386, 330)).func_77655_b("eggbrownant");
/* 6359 */     RedAntEgg = (new ItemSpawnEgg(BaseItemID + 387, 331)).func_77655_b("eggredant");
/* 6360 */     RainbowAntEgg = (new ItemSpawnEgg(BaseItemID + 388, 332)).func_77655_b("eggrainbowant");
/* 6361 */     UnstableAntEgg = (new ItemSpawnEgg(BaseItemID + 389, 333)).func_77655_b("eggunstableant");
/* 6362 */     TermiteEgg = (new ItemSpawnEgg(BaseItemID + 390, 334)).func_77655_b("eggtermite");
/* 6363 */     ButterflyEgg = (new ItemSpawnEgg(BaseItemID + 391, 335)).func_77655_b("eggbutterfly");
/* 6364 */     MothEgg = (new ItemSpawnEgg(BaseItemID + 392, 336)).func_77655_b("eggmoth");
/* 6365 */     MosquitoEgg = (new ItemSpawnEgg(BaseItemID + 393, 337)).func_77655_b("eggmosquito");
/* 6366 */     FireflyEgg = (new ItemSpawnEgg(BaseItemID + 394, 338)).func_77655_b("eggfirefly");
/* 6367 */     TRexEgg = (new ItemSpawnEgg(BaseItemID + 225, 339)).func_77655_b("eggtrex");
/* 6368 */     HerculesEgg = (new ItemSpawnEgg(BaseItemID + 226, 340)).func_77655_b("egghercules");
/* 6369 */     MantisEgg = (new ItemSpawnEgg(BaseItemID + 227, 341)).func_77655_b("eggmantis");
/* 6370 */     StinkyEgg = (new ItemSpawnEgg(BaseItemID + 228, 342)).func_77655_b("eggstinky");
/* 6371 */     Robot5Egg = (new ItemSpawnEgg(BaseItemID + 172, 343)).func_77655_b("eggrobot5");
/* 6372 */     CoinEgg = (new ItemSpawnEgg(BaseItemID + 173, 344)).func_77655_b("eggcoin");
/* 6373 */     BoyfriendEgg = (new ItemSpawnEgg(BaseItemID + 399, 349)).func_77655_b("eggboyfriend");
/* 6374 */     TheKingEgg = (new ItemSpawnEgg(BaseItemID + 400, 350)).func_77655_b("eggtheking");
/* 6375 */     TheQueenEgg = (new ItemSpawnEgg(BaseItemID + 448, 366)).func_77655_b("eggthequeen");
/* 6376 */     ThePrinceEgg = (new ItemSpawnEgg(BaseItemID + 401, 351)).func_77655_b("eggtheprince");
/* 6377 */     EasterBunnyEgg = (new ItemSpawnEgg(BaseItemID + 416, 352)).func_77655_b("eggeasterbunny");
/* 6378 */     MolenoidEgg = (new ItemSpawnEgg(BaseItemID + 417, 353)).func_77655_b("eggmolenoid");
/* 6379 */     SeaMonsterEgg = (new ItemSpawnEgg(BaseItemID + 418, 354)).func_77655_b("eggseamonster");
/* 6380 */     SeaViperEgg = (new ItemSpawnEgg(BaseItemID + 419, 355)).func_77655_b("eggseaviper");
/* 6381 */     CaterKillerEgg = (new ItemSpawnEgg(BaseItemID + 420, 356)).func_77655_b("eggcaterkiller");
/* 6382 */     RubberDuckyEgg = (new ItemSpawnEgg(BaseItemID + 428, 362)).func_77655_b("eggrubberducky");
/* 6383 */     HammerheadEgg = (new ItemSpawnEgg(BaseItemID + 426, 360)).func_77655_b("egghammerhead");
/* 6384 */     LeonEgg = (new ItemSpawnEgg(BaseItemID + 424, 358)).func_77655_b("eggleon");
/* 6385 */     CriminalEgg = (new ItemSpawnEgg(BaseItemID + 434, 365)).func_77655_b("eggcriminal");
/* 6386 */     BrutalflyEgg = (new ItemSpawnEgg(BaseItemID + 459, 367)).func_77655_b("eggbrutalfly");
/* 6387 */     NastysaurusEgg = (new ItemSpawnEgg(BaseItemID + 460, 368)).func_77655_b("eggnastysaurus");
/* 6388 */     PointysaurusEgg = (new ItemSpawnEgg(BaseItemID + 461, 369)).func_77655_b("eggpointysaurus");
/* 6389 */     CricketEgg = (new ItemSpawnEgg(BaseItemID + 462, 370)).func_77655_b("eggcricket");
/* 6390 */     ThePrincessEgg = (new ItemSpawnEgg(BaseItemID + 463, 371)).func_77655_b("eggtheprincess");
/* 6391 */     FrogEgg = (new ItemSpawnEgg(BaseItemID + 464, 372)).func_77655_b("eggfrog");
/* 6392 */     JefferyEgg = (new ItemSpawnEgg(BaseItemID + 474, 378)).func_77655_b("eggrobot6");
/* 6393 */     AntRobotEgg = (new ItemSpawnEgg(BaseItemID + 475, 379)).func_77655_b("eggantrobot");
/* 6394 */     SpiderRobotEgg = (new ItemSpawnEgg(BaseItemID + 476, 380)).func_77655_b("eggspiderrobot");
/* 6395 */     SpiderDriverEgg = (new ItemSpawnEgg(BaseItemID + 477, 381)).func_77655_b("eggspiderdriver");
/* 6396 */     CrabEgg = (new ItemSpawnEgg(BaseItemID + 482, 383)).func_77655_b("eggcrab");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void DoDispenserRegistrations() {
/* 6405 */     BlockDispenser.field_149943_a.func_82595_a(LizardEgg, new DispenserBehaviorOreSpawnEgg());
/* 6406 */     BlockDispenser.field_149943_a.func_82595_a(WitherSkeletonEgg, new DispenserBehaviorOreSpawnEgg());
/* 6407 */     BlockDispenser.field_149943_a.func_82595_a(EnderDragonEgg, new DispenserBehaviorOreSpawnEgg());
/* 6408 */     BlockDispenser.field_149943_a.func_82595_a(SnowGolemEgg, new DispenserBehaviorOreSpawnEgg());
/* 6409 */     BlockDispenser.field_149943_a.func_82595_a(IronGolemEgg, new DispenserBehaviorOreSpawnEgg());
/* 6410 */     BlockDispenser.field_149943_a.func_82595_a(WitherBossEgg, new DispenserBehaviorOreSpawnEgg());
/* 6411 */     BlockDispenser.field_149943_a.func_82595_a(GirlfriendEgg, new DispenserBehaviorOreSpawnEgg());
/* 6412 */     BlockDispenser.field_149943_a.func_82595_a(BoyfriendEgg, new DispenserBehaviorOreSpawnEgg());
/* 6413 */     BlockDispenser.field_149943_a.func_82595_a(TheKingEgg, new DispenserBehaviorOreSpawnEgg());
/* 6414 */     BlockDispenser.field_149943_a.func_82595_a(TheQueenEgg, new DispenserBehaviorOreSpawnEgg());
/* 6415 */     BlockDispenser.field_149943_a.func_82595_a(ThePrinceEgg, new DispenserBehaviorOreSpawnEgg());
/* 6416 */     BlockDispenser.field_149943_a.func_82595_a(RedCowEgg, new DispenserBehaviorOreSpawnEgg());
/* 6417 */     BlockDispenser.field_149943_a.func_82595_a(CrystalCowEgg, new DispenserBehaviorOreSpawnEgg());
/* 6418 */     BlockDispenser.field_149943_a.func_82595_a(GoldCowEgg, new DispenserBehaviorOreSpawnEgg());
/* 6419 */     BlockDispenser.field_149943_a.func_82595_a(EnchantedCowEgg, new DispenserBehaviorOreSpawnEgg());
/* 6420 */     BlockDispenser.field_149943_a.func_82595_a(MOTHRAEgg, new DispenserBehaviorOreSpawnEgg());
/* 6421 */     BlockDispenser.field_149943_a.func_82595_a(AloEgg, new DispenserBehaviorOreSpawnEgg());
/* 6422 */     BlockDispenser.field_149943_a.func_82595_a(CryoEgg, new DispenserBehaviorOreSpawnEgg());
/* 6423 */     BlockDispenser.field_149943_a.func_82595_a(CamaEgg, new DispenserBehaviorOreSpawnEgg());
/* 6424 */     BlockDispenser.field_149943_a.func_82595_a(VeloEgg, new DispenserBehaviorOreSpawnEgg());
/* 6425 */     BlockDispenser.field_149943_a.func_82595_a(HydroEgg, new DispenserBehaviorOreSpawnEgg());
/* 6426 */     BlockDispenser.field_149943_a.func_82595_a(BasilEgg, new DispenserBehaviorOreSpawnEgg());
/* 6427 */     BlockDispenser.field_149943_a.func_82595_a(DragonflyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6428 */     BlockDispenser.field_149943_a.func_82595_a(EmperorScorpionEgg, new DispenserBehaviorOreSpawnEgg());
/* 6429 */     BlockDispenser.field_149943_a.func_82595_a(ScorpionEgg, new DispenserBehaviorOreSpawnEgg());
/* 6430 */     BlockDispenser.field_149943_a.func_82595_a(CaveFisherEgg, new DispenserBehaviorOreSpawnEgg());
/* 6431 */     BlockDispenser.field_149943_a.func_82595_a(SpyroEgg, new DispenserBehaviorOreSpawnEgg());
/* 6432 */     BlockDispenser.field_149943_a.func_82595_a(BaryonyxEgg, new DispenserBehaviorOreSpawnEgg());
/* 6433 */     BlockDispenser.field_149943_a.func_82595_a(GammaMetroidEgg, new DispenserBehaviorOreSpawnEgg());
/* 6434 */     BlockDispenser.field_149943_a.func_82595_a(CockateilEgg, new DispenserBehaviorOreSpawnEgg());
/* 6435 */     BlockDispenser.field_149943_a.func_82595_a(KyuubiEgg, new DispenserBehaviorOreSpawnEgg());
/* 6436 */     BlockDispenser.field_149943_a.func_82595_a(AlienEgg, new DispenserBehaviorOreSpawnEgg());
/* 6437 */     BlockDispenser.field_149943_a.func_82595_a(AttackSquidEgg, new DispenserBehaviorOreSpawnEgg());
/* 6438 */     BlockDispenser.field_149943_a.func_82595_a(WaterDragonEgg, new DispenserBehaviorOreSpawnEgg());
/* 6439 */     BlockDispenser.field_149943_a.func_82595_a(CephadromeEgg, new DispenserBehaviorOreSpawnEgg());
/* 6440 */     BlockDispenser.field_149943_a.func_82595_a(DragonEgg, new DispenserBehaviorOreSpawnEgg());
/* 6441 */     BlockDispenser.field_149943_a.func_82595_a(KrakenEgg, new DispenserBehaviorOreSpawnEgg());
/* 6442 */     BlockDispenser.field_149943_a.func_82595_a(LizardEgg, new DispenserBehaviorOreSpawnEgg());
/* 6443 */     BlockDispenser.field_149943_a.func_82595_a(BeeEgg, new DispenserBehaviorOreSpawnEgg());
/* 6444 */     BlockDispenser.field_149943_a.func_82595_a(TrooperBugEgg, new DispenserBehaviorOreSpawnEgg());
/* 6445 */     BlockDispenser.field_149943_a.func_82595_a(SpitBugEgg, new DispenserBehaviorOreSpawnEgg());
/* 6446 */     BlockDispenser.field_149943_a.func_82595_a(StinkBugEgg, new DispenserBehaviorOreSpawnEgg());
/* 6447 */     BlockDispenser.field_149943_a.func_82595_a(OstrichEgg, new DispenserBehaviorOreSpawnEgg());
/* 6448 */     BlockDispenser.field_149943_a.func_82595_a(GazelleEgg, new DispenserBehaviorOreSpawnEgg());
/* 6449 */     BlockDispenser.field_149943_a.func_82595_a(ChipmunkEgg, new DispenserBehaviorOreSpawnEgg());
/* 6450 */     BlockDispenser.field_149943_a.func_82595_a(CreepingHorrorEgg, new DispenserBehaviorOreSpawnEgg());
/* 6451 */     BlockDispenser.field_149943_a.func_82595_a(TerribleTerrorEgg, new DispenserBehaviorOreSpawnEgg());
/* 6452 */     BlockDispenser.field_149943_a.func_82595_a(CliffRacerEgg, new DispenserBehaviorOreSpawnEgg());
/* 6453 */     BlockDispenser.field_149943_a.func_82595_a(TriffidEgg, new DispenserBehaviorOreSpawnEgg());
/* 6454 */     BlockDispenser.field_149943_a.func_82595_a(PitchBlackEgg, new DispenserBehaviorOreSpawnEgg());
/* 6455 */     BlockDispenser.field_149943_a.func_82595_a(LurkingTerrorEgg, new DispenserBehaviorOreSpawnEgg());
/* 6456 */     BlockDispenser.field_149943_a.func_82595_a(GodzillaEgg, new DispenserBehaviorOreSpawnEgg());
/* 6457 */     BlockDispenser.field_149943_a.func_82595_a(SmallWormEgg, new DispenserBehaviorOreSpawnEgg());
/* 6458 */     BlockDispenser.field_149943_a.func_82595_a(MediumWormEgg, new DispenserBehaviorOreSpawnEgg());
/* 6459 */     BlockDispenser.field_149943_a.func_82595_a(LargeWormEgg, new DispenserBehaviorOreSpawnEgg());
/* 6460 */     BlockDispenser.field_149943_a.func_82595_a(CassowaryEgg, new DispenserBehaviorOreSpawnEgg());
/* 6461 */     BlockDispenser.field_149943_a.func_82595_a(CloudSharkEgg, new DispenserBehaviorOreSpawnEgg());
/* 6462 */     BlockDispenser.field_149943_a.func_82595_a(GoldFishEgg, new DispenserBehaviorOreSpawnEgg());
/* 6463 */     BlockDispenser.field_149943_a.func_82595_a(LeafMonsterEgg, new DispenserBehaviorOreSpawnEgg());
/* 6464 */     BlockDispenser.field_149943_a.func_82595_a(TshirtEgg, new DispenserBehaviorOreSpawnEgg());
/* 6465 */     BlockDispenser.field_149943_a.func_82595_a(EnderKnightEgg, new DispenserBehaviorOreSpawnEgg());
/* 6466 */     BlockDispenser.field_149943_a.func_82595_a(EnderReaperEgg, new DispenserBehaviorOreSpawnEgg());
/* 6467 */     BlockDispenser.field_149943_a.func_82595_a(BeaverEgg, new DispenserBehaviorOreSpawnEgg());
/* 6468 */     BlockDispenser.field_149943_a.func_82595_a(RotatorEgg, new DispenserBehaviorOreSpawnEgg());
/* 6469 */     BlockDispenser.field_149943_a.func_82595_a(VortexEgg, new DispenserBehaviorOreSpawnEgg());
/* 6470 */     BlockDispenser.field_149943_a.func_82595_a(PeacockEgg, new DispenserBehaviorOreSpawnEgg());
/* 6471 */     BlockDispenser.field_149943_a.func_82595_a(FairyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6472 */     BlockDispenser.field_149943_a.func_82595_a(DungeonBeastEgg, new DispenserBehaviorOreSpawnEgg());
/* 6473 */     BlockDispenser.field_149943_a.func_82595_a(RatEgg, new DispenserBehaviorOreSpawnEgg());
/* 6474 */     BlockDispenser.field_149943_a.func_82595_a(FlounderEgg, new DispenserBehaviorOreSpawnEgg());
/* 6475 */     BlockDispenser.field_149943_a.func_82595_a(WhaleEgg, new DispenserBehaviorOreSpawnEgg());
/* 6476 */     BlockDispenser.field_149943_a.func_82595_a(IrukandjiEgg, new DispenserBehaviorOreSpawnEgg());
/* 6477 */     BlockDispenser.field_149943_a.func_82595_a(SkateEgg, new DispenserBehaviorOreSpawnEgg());
/* 6478 */     BlockDispenser.field_149943_a.func_82595_a(UrchinEgg, new DispenserBehaviorOreSpawnEgg());
/* 6479 */     BlockDispenser.field_149943_a.func_82595_a(Robot1Egg, new DispenserBehaviorOreSpawnEgg());
/* 6480 */     BlockDispenser.field_149943_a.func_82595_a(Robot2Egg, new DispenserBehaviorOreSpawnEgg());
/* 6481 */     BlockDispenser.field_149943_a.func_82595_a(Robot3Egg, new DispenserBehaviorOreSpawnEgg());
/* 6482 */     BlockDispenser.field_149943_a.func_82595_a(Robot4Egg, new DispenserBehaviorOreSpawnEgg());
/* 6483 */     BlockDispenser.field_149943_a.func_82595_a(GhostEgg, new DispenserBehaviorOreSpawnEgg());
/* 6484 */     BlockDispenser.field_149943_a.func_82595_a(GhostSkellyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6485 */     BlockDispenser.field_149943_a.func_82595_a(BrownAntEgg, new DispenserBehaviorOreSpawnEgg());
/* 6486 */     BlockDispenser.field_149943_a.func_82595_a(RedAntEgg, new DispenserBehaviorOreSpawnEgg());
/* 6487 */     BlockDispenser.field_149943_a.func_82595_a(RainbowAntEgg, new DispenserBehaviorOreSpawnEgg());
/* 6488 */     BlockDispenser.field_149943_a.func_82595_a(UnstableAntEgg, new DispenserBehaviorOreSpawnEgg());
/* 6489 */     BlockDispenser.field_149943_a.func_82595_a(TermiteEgg, new DispenserBehaviorOreSpawnEgg());
/* 6490 */     BlockDispenser.field_149943_a.func_82595_a(ButterflyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6491 */     BlockDispenser.field_149943_a.func_82595_a(MothEgg, new DispenserBehaviorOreSpawnEgg());
/* 6492 */     BlockDispenser.field_149943_a.func_82595_a(MosquitoEgg, new DispenserBehaviorOreSpawnEgg());
/* 6493 */     BlockDispenser.field_149943_a.func_82595_a(FireflyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6494 */     BlockDispenser.field_149943_a.func_82595_a(TRexEgg, new DispenserBehaviorOreSpawnEgg());
/* 6495 */     BlockDispenser.field_149943_a.func_82595_a(HerculesEgg, new DispenserBehaviorOreSpawnEgg());
/* 6496 */     BlockDispenser.field_149943_a.func_82595_a(MantisEgg, new DispenserBehaviorOreSpawnEgg());
/* 6497 */     BlockDispenser.field_149943_a.func_82595_a(StinkyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6498 */     BlockDispenser.field_149943_a.func_82595_a(Robot5Egg, new DispenserBehaviorOreSpawnEgg());
/* 6499 */     BlockDispenser.field_149943_a.func_82595_a(CoinEgg, new DispenserBehaviorOreSpawnEgg());
/* 6500 */     BlockDispenser.field_149943_a.func_82595_a(EasterBunnyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6501 */     BlockDispenser.field_149943_a.func_82595_a(MolenoidEgg, new DispenserBehaviorOreSpawnEgg());
/* 6502 */     BlockDispenser.field_149943_a.func_82595_a(SeaMonsterEgg, new DispenserBehaviorOreSpawnEgg());
/* 6503 */     BlockDispenser.field_149943_a.func_82595_a(SeaViperEgg, new DispenserBehaviorOreSpawnEgg());
/* 6504 */     BlockDispenser.field_149943_a.func_82595_a(CaterKillerEgg, new DispenserBehaviorOreSpawnEgg());
/* 6505 */     BlockDispenser.field_149943_a.func_82595_a(LeonEgg, new DispenserBehaviorOreSpawnEgg());
/* 6506 */     BlockDispenser.field_149943_a.func_82595_a(HammerheadEgg, new DispenserBehaviorOreSpawnEgg());
/* 6507 */     BlockDispenser.field_149943_a.func_82595_a(RubberDuckyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6508 */     BlockDispenser.field_149943_a.func_82595_a(CriminalEgg, new DispenserBehaviorOreSpawnEgg());
/* 6509 */     BlockDispenser.field_149943_a.func_82595_a(BrutalflyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6510 */     BlockDispenser.field_149943_a.func_82595_a(NastysaurusEgg, new DispenserBehaviorOreSpawnEgg());
/* 6511 */     BlockDispenser.field_149943_a.func_82595_a(PointysaurusEgg, new DispenserBehaviorOreSpawnEgg());
/* 6512 */     BlockDispenser.field_149943_a.func_82595_a(CricketEgg, new DispenserBehaviorOreSpawnEgg());
/* 6513 */     BlockDispenser.field_149943_a.func_82595_a(ThePrincessEgg, new DispenserBehaviorOreSpawnEgg());
/* 6514 */     BlockDispenser.field_149943_a.func_82595_a(FrogEgg, new DispenserBehaviorOreSpawnEgg());
/* 6515 */     BlockDispenser.field_149943_a.func_82595_a(JefferyEgg, new DispenserBehaviorOreSpawnEgg());
/* 6516 */     BlockDispenser.field_149943_a.func_82595_a(AntRobotEgg, new DispenserBehaviorOreSpawnEgg());
/* 6517 */     BlockDispenser.field_149943_a.func_82595_a(SpiderRobotEgg, new DispenserBehaviorOreSpawnEgg());
/* 6518 */     BlockDispenser.field_149943_a.func_82595_a(SpiderDriverEgg, new DispenserBehaviorOreSpawnEgg());
/* 6519 */     BlockDispenser.field_149943_a.func_82595_a(CrabEgg, new DispenserBehaviorOreSpawnEgg());
/*      */ 
/*      */     
/* 6522 */     BlockDispenser.field_149943_a.func_82595_a(MyIrukandjiArrow, new MyDispenserBehaviorArrow());
/* 6523 */     BlockDispenser.field_149943_a.func_82595_a(MyWaterBall, new MyDispenserBehaviorWDCharge());
/* 6524 */     BlockDispenser.field_149943_a.func_82595_a(MySunspotUrchin, new MyDispenserBehaviorSunspotUrchin());
/* 6525 */     BlockDispenser.field_149943_a.func_82595_a(MyAcid, new MyDispenserBehaviorAcid());
/* 6526 */     BlockDispenser.field_149943_a.func_82595_a(MyIceBall, new MyDispenserBehaviorIceball());
/* 6527 */     BlockDispenser.field_149943_a.func_82595_a(MyIrukandji, new MyDispenserBehaviorDeadIrukandji());
/* 6528 */     BlockDispenser.field_149943_a.func_82595_a(MyLaserBall, new MyDispenserBehaviorLaserball());
/* 6529 */     BlockDispenser.field_149943_a.func_82595_a(MySmallRock, new MyDispenserBehaviorRock());
/* 6530 */     BlockDispenser.field_149943_a.func_82595_a(MyRock, new MyDispenserBehaviorRock());
/* 6531 */     BlockDispenser.field_149943_a.func_82595_a(MyRedRock, new MyDispenserBehaviorRock());
/* 6532 */     BlockDispenser.field_149943_a.func_82595_a(MyCrystalRedRock, new MyDispenserBehaviorRock());
/* 6533 */     BlockDispenser.field_149943_a.func_82595_a(MyCrystalGreenRock, new MyDispenserBehaviorRock());
/* 6534 */     BlockDispenser.field_149943_a.func_82595_a(MyCrystalBlueRock, new MyDispenserBehaviorRock());
/* 6535 */     BlockDispenser.field_149943_a.func_82595_a(MyCrystalTNTRock, new MyDispenserBehaviorRock());
/* 6536 */     BlockDispenser.field_149943_a.func_82595_a(MyBlueRock, new MyDispenserBehaviorRock());
/* 6537 */     BlockDispenser.field_149943_a.func_82595_a(MyGreenRock, new MyDispenserBehaviorRock());
/* 6538 */     BlockDispenser.field_149943_a.func_82595_a(MyPurpleRock, new MyDispenserBehaviorRock());
/* 6539 */     BlockDispenser.field_149943_a.func_82595_a(MySpikeyRock, new MyDispenserBehaviorRock());
/* 6540 */     BlockDispenser.field_149943_a.func_82595_a(MyTNTRock, new MyDispenserBehaviorRock());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @EventHandler
/*      */   public void load(FMLInitializationEvent event) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @EventHandler
/*      */   public static void postInit(FMLPostInitializationEvent event) {
/* 6557 */     BMaze = new BasiliskMaze();
/* 6558 */     RubyDungeon = new RubyBirdDungeon();
/* 6559 */     MyDungeon = new GenericDungeon();
/* 6560 */     OreSpawnTrees = new Trees();
/* 6561 */     OreSpawnUtils = new MyUtils();
/* 6562 */     Chunker = new ChunkOreGenerator();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public Entity spawnEntity(int entityId, World world, double scaledX, double scaledY, double scaledZ) {
/* 6600 */     return null;
/*      */   }
/*      */   
/*      */   public static Entity getPointedAtEntity(World world, EntityPlayer player, double dist) {
/* 6604 */     Entity pointedAt = null;
/* 6605 */     if (player != null)
/*      */     {
/*      */       
/* 6608 */       if (world != null) {
/*      */ 
/*      */         
/* 6611 */         double d0 = dist;
/* 6612 */         double d1 = dist;
/* 6613 */         Vec3 vec3 = player.func_70666_h(1.0F);
/* 6614 */         Vec3 vec31 = player.func_70676_i(1.0F);
/* 6615 */         Vec3 vec32 = vec3.func_72441_c(vec31.field_72450_a * d0, vec31.field_72448_b * d0, vec31.field_72449_c * d0);
/* 6616 */         pointedAt = null;
/* 6617 */         float f1 = 1.0F;
/* 6618 */         List<Entity> list = world.func_72839_b((Entity)player, player.field_70121_D.func_72321_a(vec31.field_72450_a * d0, vec31.field_72448_b * d0, vec31.field_72449_c * d0).func_72314_b(f1, f1, f1));
/* 6619 */         double d2 = d1;
/*      */         
/* 6621 */         for (int i = 0; i < list.size(); i++) {
/*      */           
/* 6623 */           Entity entity = list.get(i);
/*      */           
/* 6625 */           if (entity.func_70067_L()) {
/*      */             
/* 6627 */             float f2 = entity.func_70111_Y();
/* 6628 */             AxisAlignedBB axisalignedbb = entity.field_70121_D.func_72314_b(f2, f2, f2);
/* 6629 */             MovingObjectPosition movingobjectposition = axisalignedbb.func_72327_a(vec3, vec32);
/*      */             
/* 6631 */             if (axisalignedbb.func_72318_a(vec3)) {
/*      */               
/* 6633 */               if (0.0D < d2 || d2 == 0.0D)
/*      */               {
/* 6635 */                 pointedAt = entity;
/* 6636 */                 d2 = 0.0D;
/*      */               }
/*      */             
/* 6639 */             } else if (movingobjectposition != null) {
/*      */               
/* 6641 */               double d3 = vec3.func_72438_d(movingobjectposition.field_72307_f);
/*      */               
/* 6643 */               if (d3 < d2 || d2 == 0.0D)
/*      */               {
/* 6645 */                 if (entity == player.field_70154_o && !entity.canRiderInteract()) {
/*      */                   
/* 6647 */                   if (d2 == 0.0D)
/*      */                   {
/* 6649 */                     pointedAt = entity;
/*      */                   }
/*      */                 }
/*      */                 else {
/*      */                   
/* 6654 */                   pointedAt = entity;
/* 6655 */                   d2 = d3;
/*      */                 } 
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/* 6663 */     return pointedAt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean setBlockFast(World world, int par1, int par2, int par3, Block par4, int par5, int par6) {
/* 6671 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/* 6673 */       if (par2 < 0)
/*      */       {
/* 6675 */         return false;
/*      */       }
/* 6677 */       if (par2 >= 256)
/*      */       {
/* 6679 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 6683 */       Chunk chunk = world.func_72964_e(par1 >> 4, par3 >> 4);
/*      */       
/* 6685 */       Block k1 = Blocks.field_150350_a;
/* 6686 */       if ((par6 & 0x1) != 0)
/*      */       {
/* 6688 */         k1 = chunk.func_150810_a(par1 & 0xF, par2, par3 & 0xF);
/*      */       }
/*      */       
/* 6691 */       boolean flag = setBlockIDWithMetadataFast(chunk, par1 & 0xF, par2, par3 & 0xF, par4, par5);
/*      */ 
/*      */       
/* 6694 */       if (flag) {
/*      */         
/* 6696 */         if ((par6 & 0x2) != 0 && (!world.field_72995_K || (par6 & 0x4) == 0))
/*      */         {
/* 6698 */           world.func_147471_g(par1, par2, par3);
/*      */         }
/*      */         
/* 6701 */         if (!world.field_72995_K && (par6 & 0x1) != 0)
/*      */         {
/* 6703 */           world.func_147444_c(par1, par2, par3, k1);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 6708 */       return flag;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 6713 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean setBlockSuperFast(World world, int par1, int par2, int par3, Block par4, int par5, int par6, Chunk refChunk) {
/* 6720 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/* 6722 */       if (par2 < 0)
/*      */       {
/* 6724 */         return false;
/*      */       }
/* 6726 */       if (par2 >= 256)
/*      */       {
/* 6728 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 6732 */       Chunk chunk = world.func_72964_e(par1 >> 4, par3 >> 4);
/* 6733 */       boolean flag = true;
/* 6734 */       if (chunk != refChunk) {
/*      */         
/* 6736 */         Block k1 = Blocks.field_150350_a;
/* 6737 */         if ((par6 & 0x1) != 0)
/*      */         {
/* 6739 */           k1 = chunk.func_150810_a(par1 & 0xF, par2, par3 & 0xF);
/*      */         }
/*      */         
/* 6742 */         flag = setBlockIDWithMetadataFast(chunk, par1 & 0xF, par2, par3 & 0xF, par4, par5);
/*      */         
/* 6744 */         if (flag) {
/*      */           
/* 6746 */           if ((par6 & 0x2) != 0 && (!world.field_72995_K || (par6 & 0x4) == 0))
/*      */           {
/* 6748 */             world.func_147471_g(par1, par2, par3);
/*      */           }
/*      */           
/* 6751 */           if (!world.field_72995_K && (par6 & 0x1) != 0)
/*      */           {
/* 6753 */             world.func_147444_c(par1, par2, par3, k1);
/*      */           }
/*      */         } 
/*      */       } else {
/*      */         
/* 6758 */         setBlockIDWithMetadataFast(chunk, par1 & 0xF, par2, par3 & 0xF, par4, par5);
/*      */       } 
/*      */       
/* 6761 */       return flag;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 6766 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean setBlockIDWithMetadataFast(Chunk chunk, int par1, int par2, int par3, Block par4, int par5) {
/* 6777 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/* 6779 */       if (par2 < 0 || par2 > 255) return false;
/*      */       
/* 6781 */       ExtendedBlockStorage[] mystorage = chunk.func_76587_i();
/* 6782 */       ExtendedBlockStorage extendedblockstorage = mystorage[par2 >> 4];
/*      */       
/* 6784 */       if (extendedblockstorage == null) {
/*      */         
/* 6786 */         if (par4 == Blocks.field_150350_a)
/*      */         {
/* 6788 */           return false;
/*      */         }
/* 6790 */         extendedblockstorage = mystorage[par2 >> 4] = new ExtendedBlockStorage(par2 >> 4 << 4, !chunk.field_76637_e.field_73011_w.field_76576_e);
/* 6791 */         chunk.func_76602_a(mystorage);
/*      */       } 
/*      */       
/* 6794 */       extendedblockstorage.func_150818_a(par1, par2 & 0xF, par3, par4);
/* 6795 */       extendedblockstorage.func_76654_b(par1, par2 & 0xF, par3, par5);
/*      */       
/* 6797 */       return true;
/*      */     } 
/* 6799 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static Block getBlockIDInChunk(Chunk chunk, int par1, int par2, int par3) {
/* 6805 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/* 6806 */       if (par1 >> 4 != chunk.field_76635_g) return Blocks.field_150350_a; 
/* 6807 */       if (par3 >> 4 != chunk.field_76647_h) return Blocks.field_150350_a; 
/* 6808 */       if (par2 < 0 || par2 > 255) return Blocks.field_150350_a; 
/* 6809 */       return chunk.func_150810_a(par1 & 0xF, par2, par3 & 0xF);
/*      */     } 
/* 6811 */     return Blocks.field_150350_a;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean setBlockIDWithMetadataInChunk(Chunk chunk, int par1, int par2, int par3, Block par4, int par5) {
/* 6817 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/* 6818 */       if (par1 >> 4 != chunk.field_76635_g) return false; 
/* 6819 */       if (par3 >> 4 != chunk.field_76647_h) return false; 
/* 6820 */       if (par2 < 0 || par2 > 255) return false;
/*      */       
/* 6822 */       ExtendedBlockStorage[] mystorage = chunk.func_76587_i();
/* 6823 */       ExtendedBlockStorage extendedblockstorage = mystorage[par2 >> 4];
/*      */       
/* 6825 */       par1 &= 0xF;
/* 6826 */       par3 &= 0xF;
/*      */       
/* 6828 */       if (extendedblockstorage == null) {
/* 6829 */         if (par4 == Blocks.field_150350_a || par4 == null) {
/* 6830 */           return false;
/*      */         }
/* 6832 */         extendedblockstorage = mystorage[par2 >> 4] = new ExtendedBlockStorage(par2 >> 4 << 4, !chunk.field_76637_e.field_73011_w.field_76576_e);
/* 6833 */         chunk.func_76602_a(mystorage);
/*      */       } 
/* 6835 */       extendedblockstorage.func_150818_a(par1, par2 & 0xF, par3, par4);
/* 6836 */       extendedblockstorage.func_76654_b(par1, par2 & 0xF, par3, par5);
/*      */       
/* 6838 */       return true;
/*      */     } 
/* 6840 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private ArmorStats get_armorstats(Configuration config, String s, int dura, int head, int chest, int leg, int boots, int enchant, int e_resp, int e_aqua, int e_prot, int e_fire, int e_blast, int e_proj, int e_unbreak, int e_feather) {
/* 6847 */     ArmorStats a = new ArmorStats();
/* 6848 */     String arm = "OreSpawnARMOR";
/*      */     
/* 6850 */     a.durability = config.get(arm, s + "_durability", dura).getInt();
/* 6851 */     if (a.durability < dura / 2) a.durability = dura / 2; 
/* 6852 */     if (a.durability > dura * 2) a.durability = dura * 2; 
/* 6853 */     a.head_protection = config.get(arm, s + "_head_damage_reduce", head).getInt();
/* 6854 */     if (a.head_protection < head - 2) a.head_protection = head - 2; 
/* 6855 */     a.chest_protection = config.get(arm, s + "_chest_damage_reduce", chest).getInt();
/* 6856 */     if (a.chest_protection < chest - 2) a.chest_protection = chest - 2; 
/* 6857 */     a.leg_protection = config.get(arm, s + "_leggings_damage_reduce", leg).getInt();
/* 6858 */     if (a.leg_protection < leg - 2) a.leg_protection = leg - 2; 
/* 6859 */     a.boot_protection = config.get(arm, s + "_boots_damage_reduce", boots).getInt();
/* 6860 */     if (a.boot_protection < boots - 2) a.boot_protection = boots - 2; 
/* 6861 */     a.enchantability = config.get(arm, s + "_enchantability", enchant).getInt();
/* 6862 */     if (a.enchantability < enchant / 2) a.enchantability = enchant / 2; 
/* 6863 */     if (a.enchantability > enchant * 2) a.enchantability = enchant * 2;
/*      */     
/* 6865 */     a.e_respiration = config.get(arm, s + "_enchant_respiration", e_resp).getInt();
/* 6866 */     if (a.e_respiration < e_resp / 2) a.e_respiration = e_resp / 2; 
/* 6867 */     a.e_aquaaffinity = config.get(arm, s + "_enchant_aquaaffinity", e_aqua).getInt();
/* 6868 */     if (a.e_aquaaffinity < e_aqua / 2) a.e_aquaaffinity = e_aqua / 2; 
/* 6869 */     a.e_protection = config.get(arm, s + "_enchant_protection", e_prot).getInt();
/* 6870 */     if (a.e_protection < e_prot / 2) a.e_protection = e_prot / 2; 
/* 6871 */     a.e_fireprotection = config.get(arm, s + "_enchant_fireprotection", e_fire).getInt();
/* 6872 */     if (a.e_fireprotection < e_fire / 2) a.e_fireprotection = e_fire / 2; 
/* 6873 */     a.e_blastprotection = config.get(arm, s + "_enchant_blastprotection", e_blast).getInt();
/* 6874 */     if (a.e_blastprotection < e_blast / 2) a.e_blastprotection = e_blast / 2; 
/* 6875 */     a.e_projectileprotection = config.get(arm, s + "_enchant_projectileprotection", e_proj).getInt();
/* 6876 */     if (a.e_projectileprotection < e_proj / 2) a.e_projectileprotection = e_proj / 2; 
/* 6877 */     a.e_unbreaking = config.get(arm, s + "_enchant_unbreaking", e_unbreak).getInt();
/* 6878 */     if (a.e_unbreaking < e_unbreak / 2) a.e_unbreaking = e_unbreak / 2; 
/* 6879 */     a.e_featherfalling = config.get(arm, s + "_enchant_featherfalling", e_feather).getInt();
/* 6880 */     if (a.e_featherfalling < e_feather / 2) a.e_featherfalling = e_feather / 2;
/*      */     
/* 6882 */     return a;
/*      */   }
/*      */ 
/*      */   
/*      */   private WeaponStats get_weaponstats(Configuration config, String arm, String s, int harvest, int maxuses, int efficiency, int damage, int enchantability) {
/* 6887 */     WeaponStats w = new WeaponStats();
/*      */     
/* 6889 */     w.harvestlevel = config.get(arm, s + "_harvestlevel", harvest).getInt();
/* 6890 */     if (w.harvestlevel < harvest - 1) w.harvestlevel = harvest; 
/* 6891 */     w.maxuses = config.get(arm, s + "_maxuses", maxuses).getInt();
/* 6892 */     if (w.maxuses < maxuses / 2) w.maxuses = maxuses / 2; 
/* 6893 */     if (w.maxuses > maxuses * 2) w.maxuses = maxuses * 2; 
/* 6894 */     w.efficiency = config.get(arm, s + "_efficiency", efficiency).getInt();
/* 6895 */     if (w.efficiency < efficiency / 2) w.efficiency = efficiency / 2; 
/* 6896 */     if (w.efficiency > efficiency * 2) w.efficiency = efficiency * 2; 
/* 6897 */     w.damage = config.get(arm, s + "_damage", damage).getInt();
/* 6898 */     if (w.damage < damage / 2) w.damage = damage / 2; 
/* 6899 */     if (w.damage > damage * 2) w.damage = damage * 2; 
/* 6900 */     w.enchantability = config.get(arm, s + "_enchantability", enchantability).getInt();
/* 6901 */     if (w.enchantability < enchantability / 2) w.enchantability = enchantability / 2; 
/* 6902 */     if (w.enchantability > enchantability * 2) w.enchantability = enchantability * 2;
/*      */     
/* 6904 */     return w;
/*      */   }
/*      */ 
/*      */   
/*      */   private MobStats get_mobstats(Configuration config, String arm, String s, int health, int attack, int defense) {
/* 6909 */     MobStats m = new MobStats();
/*      */     
/* 6911 */     m.health = config.get(arm, s + "_health", health).getInt();
/* 6912 */     if (m.health < health / 2) m.health = health / 2; 
/* 6913 */     if (m.health > health * 2) m.health = health * 2; 
/* 6914 */     m.attack = config.get(arm, s + "_attack", attack).getInt();
/* 6915 */     if (m.attack < attack / 2) m.attack = attack / 2; 
/* 6916 */     if (m.attack > attack * 2) m.attack = attack * 2; 
/* 6917 */     m.defense = config.get(arm, s + "_defense", defense).getInt();
/* 6918 */     if (m.defense < defense - 4) m.defense = defense - 4; 
/* 6919 */     if (m.defense > defense + 4) m.defense = defense + 4; 
/* 6920 */     if (m.defense > 22) m.defense = 22; 
/* 6921 */     if (m.defense < 0) m.defense = 0;
/*      */     
/* 6923 */     return m;
/*      */   }
/*      */ 
/*      */   
/*      */   private OreStats get_orestats(Configuration config, String arm, String s, int rate, int clumpsize, int min, int max) {
/* 6928 */     OreStats o = new OreStats();
/*      */     
/* 6930 */     o.rate = config.get(arm, s + "_rate", rate).getInt();
/* 6931 */     if (o.rate < rate / 2) o.rate = rate / 2; 
/* 6932 */     if (o.rate > rate * 2) o.rate = rate * 2; 
/* 6933 */     o.clumpsize = config.get(arm, s + "_clumpsize", clumpsize).getInt();
/* 6934 */     if (o.clumpsize < clumpsize / 2) o.clumpsize = clumpsize / 2; 
/* 6935 */     if (o.clumpsize > clumpsize * 2) o.clumpsize = clumpsize * 2; 
/* 6936 */     if (o.clumpsize < 1) o.clumpsize = 1; 
/* 6937 */     o.mindepth = config.get(arm, s + "_mindepth", min).getInt();
/* 6938 */     if (o.mindepth < 0) o.mindepth = 0; 
/* 6939 */     o.maxdepth = config.get(arm, s + "_maxdepth", max).getInt();
/* 6940 */     if (o.maxdepth < 0) o.maxdepth = 0; 
/* 6941 */     if (o.maxdepth - o.mindepth < 10) {
/* 6942 */       o.mindepth = min;
/* 6943 */       o.maxdepth = max;
/*      */     } 
/* 6945 */     return o;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void disableAllMobs() {
/* 6951 */     MosquitoEnable = 0;
/* 6952 */     GhostEnable = 0;
/* 6953 */     GhostSkellyEnable = 0;
/* 6954 */     SpiderDriverEnable = 0;
/* 6955 */     CrabEnable = 0;
/* 6956 */     JefferyEnable = 0;
/* 6957 */     MothraEnable = 0;
/* 6958 */     BrutalflyEnable = 0;
/* 6959 */     NastysaurusEnable = 0;
/* 6960 */     PointysaurusEnable = 0;
/* 6961 */     MothraPeaceful = 0;
/* 6962 */     BlackAntEnable = 0;
/* 6963 */     RedAntEnable = 0;
/* 6964 */     TermiteEnable = 0;
/* 6965 */     UnstableAntEnable = 0;
/* 6966 */     RainbowAntEnable = 0;
/* 6967 */     AlosaurusEnable = 0;
/* 6968 */     HammerheadEnable = 0;
/* 6969 */     LeonEnable = 0;
/* 6970 */     CaterKillerEnable = 0;
/* 6971 */     MolenoidEnable = 0;
/* 6972 */     TRexEnable = 0;
/* 6973 */     CriminalEnable = 0;
/* 6974 */     CryolophosaurusEnable = 0;
/* 6975 */     RatEnable = 0;
/* 6976 */     UrchinEnable = 0;
/* 6977 */     CamarasaurusEnable = 0;
/* 6978 */     VelocityRaptorEnable = 0;
/* 6979 */     HydroliscEnable = 0;
/* 6980 */     SpyroEnable = 0;
/* 6981 */     BaryonyxEnable = 0;
/* 6982 */     CockateilEnable = 0;
/* 6983 */     CassowaryEnable = 0;
/* 6984 */     EasterBunnyEnable = 0;
/* 6985 */     PeacockEnable = 0;
/* 6986 */     KyuubiEnable = 0;
/* 6987 */     CephadromeEnable = 0;
/* 6988 */     DragonEnable = 0;
/* 6989 */     GammaMetroidEnable = 0;
/* 6990 */     BasiliskEnable = 0;
/* 6991 */     DragonflyEnable = 0;
/* 6992 */     EmperorScorpionEnable = 0;
/* 6993 */     TrooperBugEnable = 0;
/* 6994 */     SpitBugEnable = 0;
/* 6995 */     StinkBugEnable = 0;
/* 6996 */     ScorpionEnable = 0;
/* 6997 */     CaveFisherEnable = 0;
/* 6998 */     AlienEnable = 0;
/* 6999 */     WaterDragonEnable = 0;
/* 7000 */     SeaMonsterEnable = 0;
/* 7001 */     SeaViperEnable = 0;
/* 7002 */     AttackSquidEnable = 0;
/* 7003 */     Robot1Enable = 0;
/* 7004 */     Robot2Enable = 0;
/* 7005 */     Robot3Enable = 0;
/* 7006 */     Robot4Enable = 0;
/* 7007 */     Robot5Enable = 0;
/* 7008 */     RotatorEnable = 0;
/* 7009 */     VortexEnable = 0;
/* 7010 */     DungeonBeastEnable = 0;
/* 7011 */     KrakenEnable = 0;
/* 7012 */     LizardEnable = 0;
/* 7013 */     RubberDuckyEnable = 0;
/* 7014 */     GirlfriendEnable = 0;
/* 7015 */     BoyfriendEnable = 0;
/* 7016 */     FireflyEnable = 0;
/* 7017 */     FairyEnable = 0;
/* 7018 */     BeeEnable = 0;
/* 7019 */     TheKingEnable = 0;
/* 7020 */     TheQueenEnable = 0;
/* 7021 */     MantisEnable = 0;
/* 7022 */     StinkyEnable = 0;
/* 7023 */     HerculesBeetleEnable = 0;
/* 7024 */     ChipmunkEnable = 0;
/* 7025 */     OstrichEnable = 0;
/* 7026 */     GazelleEnable = 0;
/* 7027 */     CowEnable = 0;
/* 7028 */     ButterflyEnable = 0;
/* 7029 */     MothEnable = 0;
/* 7030 */     TshirtEnable = 0;
/* 7031 */     CoinEnable = 0;
/* 7032 */     CreepingHorrorEnable = 0;
/* 7033 */     TerribleTerrorEnable = 0;
/* 7034 */     CliffRacerEnable = 0;
/* 7035 */     TriffidEnable = 0;
/* 7036 */     WormEnable = 0;
/* 7037 */     CloudSharkEnable = 0;
/* 7038 */     GoldFishEnable = 0;
/* 7039 */     LeafMonsterEnable = 0;
/* 7040 */     EnderKnightEnable = 0;
/* 7041 */     EnderReaperEnable = 0;
/* 7042 */     BeaverEnable = 0;
/* 7043 */     IrukandjiEnable = 0;
/* 7044 */     SkateEnable = 0;
/* 7045 */     WhaleEnable = 0;
/* 7046 */     FlounderEnable = 0;
/* 7047 */     PitchBlackEnable = 0;
/* 7048 */     LurkingTerrorEnable = 0;
/* 7049 */     GodzillaEnable = 0;
/* 7050 */     CrabEnable = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void laySomeEggs() {
/* 7056 */     MySpiderSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 0)).func_149663_c("orespider");
/* 7057 */     MyBatSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 1)).func_149663_c("orebat");
/* 7058 */     MyCowSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 2)).func_149663_c("orecow");
/* 7059 */     MyPigSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 3)).func_149663_c("orepig");
/* 7060 */     MySquidSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 4)).func_149663_c("oresquid");
/* 7061 */     MyChickenSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 5)).func_149663_c("orechicken");
/* 7062 */     MyCreeperSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 6)).func_149663_c("orecreeper");
/* 7063 */     MySkeletonSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 7)).func_149663_c("oreskeleton");
/* 7064 */     MyZombieSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 8)).func_149663_c("orezombie");
/* 7065 */     MySlimeSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 9)).func_149663_c("oreslime");
/* 7066 */     MyGhastSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 10)).func_149663_c("oreghast");
/* 7067 */     MyZombiePigmanSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 11)).func_149663_c("orezombiepigman");
/* 7068 */     MyEndermanSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 12)).func_149663_c("oreenderman");
/* 7069 */     MyCaveSpiderSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 13)).func_149663_c("orecavespider");
/* 7070 */     MySilverfishSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 14)).func_149663_c("oresilverfish");
/* 7071 */     MyMagmaCubeSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 15)).func_149663_c("oremagmacube");
/* 7072 */     MyWitchSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 16)).func_149663_c("orewitch");
/* 7073 */     MySheepSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 17)).func_149663_c("oresheep");
/* 7074 */     MyWolfSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 18)).func_149663_c("orewolf");
/* 7075 */     MyMooshroomSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 19)).func_149663_c("oremooshroom");
/* 7076 */     MyOcelotSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 20)).func_149663_c("oreocelot");
/* 7077 */     MyBlazeSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 21)).func_149663_c("oreblaze");
/* 7078 */     MyWitherSkeletonSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 22)).func_149663_c("orewitherskeleton");
/* 7079 */     MyEnderDragonSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 23)).func_149663_c("oreenderdragon");
/* 7080 */     MySnowGolemSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 24)).func_149663_c("oresnowgolem");
/* 7081 */     MyIronGolemSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 25)).func_149663_c("oreirongolem");
/* 7082 */     MyWitherBossSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 26)).func_149663_c("orewitherboss");
/* 7083 */     MyGirlfriendSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 27)).func_149663_c("oregirlfriend");
/* 7084 */     MyBoyfriendSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 84)).func_149663_c("oreboyfriend");
/* 7085 */     MyRedCowSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 28)).func_149663_c("oreredcow");
/* 7086 */     MyCrystalCowSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 261)).func_149663_c("orecrystalcow");
/* 7087 */     MyVillagerSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 94)).func_149663_c("orevillager");
/* 7088 */     MyGoldCowSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 29)).func_149663_c("oregoldcow");
/* 7089 */     MyEnchantedCowSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 30)).func_149663_c("oreenchantedcow");
/* 7090 */     MyMOTHRASpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 31)).func_149663_c("oreMOTHRA");
/* 7091 */     MyAntBlock = (new AntBlock(BaseBlockID + 115)).func_149663_c("AntBlock");
/* 7092 */     MyRedAntBlock = (new AntBlock(BaseBlockID + 116)).func_149663_c("RedAntBlock");
/* 7093 */     TermiteBlock = (new AntBlock(BaseBlockID + 120)).func_149663_c("TermiteBlock");
/* 7094 */     CrystalTermiteBlock = (new CrystalAntBlock(BaseBlockID + 121)).func_149663_c("CrystalTermiteBlock");
/* 7095 */     MyRainbowAntBlock = (new AntBlock(BaseBlockID + 117)).func_149663_c("RainbowAntBlock");
/* 7096 */     MyUnstableAntBlock = (new AntBlock(BaseBlockID + 118)).func_149663_c("UnstableAntBlock");
/* 7097 */     MyAloSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 32)).func_149663_c("orealosaurus");
/* 7098 */     MyCryoSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 33)).func_149663_c("orecryolophosaurus");
/* 7099 */     MyCamaSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 34)).func_149663_c("orecamarasaurus");
/* 7100 */     MyVeloSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 35)).func_149663_c("orevelocityraptor");
/* 7101 */     MyHydroSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 36)).func_149663_c("orehydrolisc");
/* 7102 */     MyBasilSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 37)).func_149663_c("orebasilisc");
/* 7103 */     MyDragonflySpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 38)).func_149663_c("oredragonfly");
/* 7104 */     MyEmperorScorpionSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 39)).func_149663_c("oreemperorscorpion");
/* 7105 */     MyScorpionSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 40)).func_149663_c("orescorpion");
/* 7106 */     MyCaveFisherSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 41)).func_149663_c("orecavefisher");
/* 7107 */     MySpyroSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 42)).func_149663_c("orespyro");
/* 7108 */     MyBaryonyxSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 43)).func_149663_c("orebaryonyx");
/* 7109 */     MyGammaMetroidSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 44)).func_149663_c("oregammametroid");
/* 7110 */     MyCockateilSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 45)).func_149663_c("orecockateil");
/* 7111 */     MyKyuubiSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 46)).func_149663_c("orekyuubi");
/* 7112 */     MyAlienSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 47)).func_149663_c("orealien");
/* 7113 */     MyAttackSquidSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 48)).func_149663_c("oreattacksquid");
/* 7114 */     MyWaterDragonSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 49)).func_149663_c("orewaterdragon");
/* 7115 */     MyCephadromeSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 52)).func_149663_c("orecephadrome");
/* 7116 */     MyDragonSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 53)).func_149663_c("oredragon");
/* 7117 */     MyKrakenSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 50)).func_149663_c("orekraken");
/* 7118 */     MyLizardSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 51)).func_149663_c("orelizard");
/* 7119 */     MyBeeSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 54)).func_149663_c("orebee");
/* 7120 */     MyHorseSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 55)).func_149663_c("orehorse");
/* 7121 */     MyTrooperBugSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 56)).func_149663_c("oretrooper");
/* 7122 */     MySpitBugSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 57)).func_149663_c("orespit");
/* 7123 */     MyStinkBugSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 58)).func_149663_c("orestink");
/* 7124 */     MyOstrichSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 59)).func_149663_c("oreostrich");
/* 7125 */     MyGazelleSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 60)).func_149663_c("oregazelle");
/* 7126 */     MyChipmunkSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 61)).func_149663_c("orechipmunk");
/* 7127 */     MyCreepingHorrorSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 62)).func_149663_c("orecreepinghorror");
/* 7128 */     MyTerribleTerrorSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 63)).func_149663_c("oreterribleterror");
/* 7129 */     MyCliffRacerSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 64)).func_149663_c("orecliffracer");
/* 7130 */     MyTriffidSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 65)).func_149663_c("oretriffid");
/* 7131 */     MyPitchBlackSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 66)).func_149663_c("orenightmare");
/* 7132 */     MyLurkingTerrorSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 67)).func_149663_c("orelurkingterror");
/* 7133 */     MyGodzillaPartSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 68)).func_149663_c("oregodzillapart");
/* 7134 */     MyGodzillaSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 119)).func_149663_c("oregodzilla");
/* 7135 */     MySmallWormSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 69)).func_149663_c("oresmallworm");
/* 7136 */     MyMediumWormSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 70)).func_149663_c("oremediumworm");
/* 7137 */     MyLargeWormSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 71)).func_149663_c("orelargeworm");
/* 7138 */     MyCassowarySpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 72)).func_149663_c("orecassowary");
/* 7139 */     MyCloudSharkSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 73)).func_149663_c("orecloudshark");
/* 7140 */     MyGoldFishSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 74)).func_149663_c("oregoldfish");
/* 7141 */     MyLeafMonsterSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 75)).func_149663_c("oreleafmonster");
/* 7142 */     MyTshirtSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 76)).func_149663_c("oretshirt");
/* 7143 */     MyEnderKnightSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 77)).func_149663_c("oreenderknight");
/* 7144 */     MyEnderReaperSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 78)).func_149663_c("oreenderreaper");
/* 7145 */     MyBeaverSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 79)).func_149663_c("orebeaver");
/* 7146 */     MyUrchinSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 250)).func_149663_c("oreurchin");
/* 7147 */     MyFlounderSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 251)).func_149663_c("oreflounder");
/* 7148 */     MySkateSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 252)).func_149663_c("oreskate");
/* 7149 */     MyRotatorSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 253)).func_149663_c("orerotator");
/* 7150 */     MyPeacockSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 254)).func_149663_c("orepeacock");
/* 7151 */     MyFairySpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 255)).func_149663_c("orefairy");
/* 7152 */     MyDungeonBeastSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 256)).func_149663_c("oredungeonbeast");
/* 7153 */     MyVortexSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 257)).func_149663_c("orevortex");
/* 7154 */     MyRatSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 258)).func_149663_c("orerat");
/* 7155 */     MyWhaleSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 259)).func_149663_c("orewhale");
/* 7156 */     MyIrukandjiSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 260)).func_149663_c("oreirukandji");
/* 7157 */     MyTRexSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 80)).func_149663_c("oretrex");
/* 7158 */     MyHerculesSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 81)).func_149663_c("orehercules");
/* 7159 */     MyMantisSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 82)).func_149663_c("oremantis");
/* 7160 */     MyStinkySpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 83)).func_149663_c("orestinky");
/* 7161 */     MyTheKingPartSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 85)).func_149663_c("orethekingpart");
/* 7162 */     MyTheKingSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 122)).func_149663_c("oretheking");
/* 7163 */     MyTheQueenPartSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 96)).func_149663_c("orethequeenpart");
/* 7164 */     MyTheQueenSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 125)).func_149663_c("orethequeen");
/* 7165 */     MyEasterBunnySpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 86)).func_149663_c("oreeasterbunny");
/* 7166 */     MyCaterKillerSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 87)).func_149663_c("orecaterkiller");
/* 7167 */     MyMolenoidSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 88)).func_149663_c("oremolenoid");
/* 7168 */     MySeaMonsterSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 89)).func_149663_c("oreseamonster");
/* 7169 */     MySeaViperSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 90)).func_149663_c("oreseaviper");
/* 7170 */     MyLeonSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 91)).func_149663_c("oreleon");
/* 7171 */     MyHammerheadSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 92)).func_149663_c("orehammerhead");
/* 7172 */     MyRubberDuckySpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 93)).func_149663_c("orerubberducky");
/* 7173 */     MyCriminalSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 95)).func_149663_c("orecriminal");
/* 7174 */     MyBrutalflySpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 300)).func_149663_c("orebrutalfly");
/* 7175 */     MyNastysaurusSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 301)).func_149663_c("orenastysaurus");
/* 7176 */     MyPointysaurusSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 302)).func_149663_c("orepointysaurus");
/* 7177 */     MyCricketSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 303)).func_149663_c("orecricket");
/* 7178 */     MyFrogSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 304)).func_149663_c("orefrog");
/* 7179 */     MySpiderDriverSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 305)).func_149663_c("orespiderdriver");
/* 7180 */     MyCrabSpawnBlock = (OreGenericEgg)(new OreGenericEgg(BaseBlockID + 306)).func_149663_c("orecrab");
/*      */   }
/*      */ 
/*      */   
/*      */   private void getMobs(Configuration config, String mobs) {
/* 7185 */     MosquitoEnable = config.get(mobs, "MosquitoEnable", 1).getInt();
/* 7186 */     RockEnable = config.get(mobs, "RockEnable", 1).getInt();
/* 7187 */     GhostEnable = config.get(mobs, "GhostEnable", 1).getInt();
/* 7188 */     GhostSkellyEnable = config.get(mobs, "GhostSkellyEnable", 1).getInt();
/* 7189 */     SpiderDriverEnable = config.get(mobs, "SpiderDriverEnable", 1).getInt();
/* 7190 */     JefferyEnable = config.get(mobs, "JefferyEnable", 1).getInt();
/* 7191 */     MothraEnable = config.get(mobs, "MothraEnable", 1).getInt();
/* 7192 */     BrutalflyEnable = config.get(mobs, "BrutalflyEnable", 1).getInt();
/* 7193 */     NastysaurusEnable = config.get(mobs, "NastysaurusEnable", 1).getInt();
/* 7194 */     PointysaurusEnable = config.get(mobs, "PointysaurusEnable", 1).getInt();
/* 7195 */     CricketEnable = config.get(mobs, "CricketEnable", 1).getInt();
/* 7196 */     FrogEnable = config.get(mobs, "FrogEnable", 1).getInt();
/* 7197 */     MothraPeaceful = config.get(mobs, "MothraPeaceful", 0).getInt();
/* 7198 */     BlackAntEnable = config.get(mobs, "BlackAntEnable", 1).getInt();
/* 7199 */     RedAntEnable = config.get(mobs, "RedAntEnable", 1).getInt();
/* 7200 */     TermiteEnable = config.get(mobs, "TermiteEnable", 1).getInt();
/* 7201 */     UnstableAntEnable = config.get(mobs, "UnstableAntEnable", 1).getInt();
/* 7202 */     RainbowAntEnable = config.get(mobs, "RainbowedAntEnable", 1).getInt();
/* 7203 */     AlosaurusEnable = config.get(mobs, "AlosaurusEnable", 1).getInt();
/* 7204 */     HammerheadEnable = config.get(mobs, "HammerheadEnable", 1).getInt();
/* 7205 */     LeonEnable = config.get(mobs, "LeonEnable", 1).getInt();
/* 7206 */     CaterKillerEnable = config.get(mobs, "CaterKillerEnable", 1).getInt();
/* 7207 */     MolenoidEnable = config.get(mobs, "MolenoidEnable", 1).getInt();
/* 7208 */     TRexEnable = config.get(mobs, "TRexEnable", 1).getInt();
/* 7209 */     CriminalEnable = config.get(mobs, "CriminalEnable", 1).getInt();
/* 7210 */     CryolophosaurusEnable = config.get(mobs, "CryolophosaurusEnable", 1).getInt();
/* 7211 */     RatEnable = config.get(mobs, "RatEnable", 1).getInt();
/* 7212 */     UrchinEnable = config.get(mobs, "UrchinEnable", 1).getInt();
/* 7213 */     CamarasaurusEnable = config.get(mobs, "CamarasaurusEnable", 1).getInt();
/* 7214 */     VelocityRaptorEnable = config.get(mobs, "VelocityRaptorEnable", 1).getInt();
/* 7215 */     HydroliscEnable = config.get(mobs, "HydroliscEnable", 1).getInt();
/* 7216 */     SpyroEnable = config.get(mobs, "SpyroEnable", 1).getInt();
/* 7217 */     BaryonyxEnable = config.get(mobs, "BaryonyxEnable", 1).getInt();
/* 7218 */     CockateilEnable = config.get(mobs, "BirdEnable", 1).getInt();
/* 7219 */     CassowaryEnable = config.get(mobs, "CassowaryEnable", 1).getInt();
/* 7220 */     EasterBunnyEnable = config.get(mobs, "EasterBunnyEnable", 1).getInt();
/* 7221 */     PeacockEnable = config.get(mobs, "PeacockEnable", 1).getInt();
/* 7222 */     KyuubiEnable = config.get(mobs, "KyuubiEnable", 1).getInt();
/* 7223 */     CephadromeEnable = config.get(mobs, "CephadromeEnable", 1).getInt();
/* 7224 */     DragonEnable = config.get(mobs, "DragonEnable", 1).getInt();
/* 7225 */     GammaMetroidEnable = config.get(mobs, "GammaMetroidEnable", 1).getInt();
/* 7226 */     BasiliskEnable = config.get(mobs, "BasiliskEnable", 1).getInt();
/* 7227 */     DragonflyEnable = config.get(mobs, "DragonflyEnable", 1).getInt();
/* 7228 */     EmperorScorpionEnable = config.get(mobs, "EmperorScorpionEnable", 1).getInt();
/* 7229 */     TrooperBugEnable = config.get(mobs, "TrooperBugEnable", 1).getInt();
/* 7230 */     SpitBugEnable = config.get(mobs, "SpitBugEnable", 1).getInt();
/* 7231 */     StinkBugEnable = config.get(mobs, "StinkBugEnable", 1).getInt();
/* 7232 */     ScorpionEnable = config.get(mobs, "ScorpionEnable", 1).getInt();
/* 7233 */     CaveFisherEnable = config.get(mobs, "CaveFisherEnable", 1).getInt();
/* 7234 */     AlienEnable = config.get(mobs, "AlienEnable", 1).getInt();
/* 7235 */     WaterDragonEnable = config.get(mobs, "WaterDragonEnable", 1).getInt();
/* 7236 */     SeaMonsterEnable = config.get(mobs, "SeaMonsterEnable", 1).getInt();
/* 7237 */     SeaViperEnable = config.get(mobs, "SeaViperEnable", 1).getInt();
/* 7238 */     AttackSquidEnable = config.get(mobs, "AttackSquidEnable", 1).getInt();
/* 7239 */     Robot1Enable = config.get(mobs, "Robot1Enable", 1).getInt();
/* 7240 */     Robot2Enable = config.get(mobs, "Robot2Enable", 1).getInt();
/* 7241 */     Robot3Enable = config.get(mobs, "Robot3Enable", 1).getInt();
/* 7242 */     Robot4Enable = config.get(mobs, "Robot4Enable", 1).getInt();
/* 7243 */     Robot5Enable = config.get(mobs, "Robot5Enable", 1).getInt();
/* 7244 */     RotatorEnable = config.get(mobs, "RotatorEnable", 1).getInt();
/* 7245 */     VortexEnable = config.get(mobs, "VortexEnable", 1).getInt();
/* 7246 */     DungeonBeastEnable = config.get(mobs, "DungeonBeastEnable", 1).getInt();
/* 7247 */     KrakenEnable = config.get(mobs, "KrakenEnable", 1).getInt();
/* 7248 */     LizardEnable = config.get(mobs, "LizardEnable", 1).getInt();
/* 7249 */     RubberDuckyEnable = config.get(mobs, "RubberDuckyEnable", 1).getInt();
/* 7250 */     GirlfriendEnable = config.get(mobs, "GirlfriendEnable", 1).getInt();
/* 7251 */     BoyfriendEnable = config.get(mobs, "BoyfriendEnable", 0).getInt();
/* 7252 */     FireflyEnable = config.get(mobs, "FireflyEnable", 1).getInt();
/* 7253 */     FairyEnable = config.get(mobs, "FairyEnable", 1).getInt();
/* 7254 */     BeeEnable = config.get(mobs, "BeeEnable", 1).getInt();
/* 7255 */     TheKingEnable = config.get(mobs, "TheKingEnable", 1).getInt();
/* 7256 */     TheQueenEnable = config.get(mobs, "TheQueenEnable", 1).getInt();
/* 7257 */     MantisEnable = config.get(mobs, "MantisEnable", 1).getInt();
/* 7258 */     StinkyEnable = config.get(mobs, "StinkyEnable", 1).getInt();
/* 7259 */     HerculesBeetleEnable = config.get(mobs, "HerculesBeetleEnable", 1).getInt();
/* 7260 */     ChipmunkEnable = config.get(mobs, "ChipmunkEnable", 1).getInt();
/* 7261 */     OstrichEnable = config.get(mobs, "OstrichEnable", 1).getInt();
/* 7262 */     GazelleEnable = config.get(mobs, "GazelleEnable", 1).getInt();
/* 7263 */     CowEnable = config.get(mobs, "CowEnable", 1).getInt();
/* 7264 */     ButterflyEnable = config.get(mobs, "ButterflyEnable", 1).getInt();
/* 7265 */     MothEnable = config.get(mobs, "MothEnable", 1).getInt();
/* 7266 */     TshirtEnable = config.get(mobs, "TshirtEnable", 1).getInt();
/* 7267 */     CoinEnable = config.get(mobs, "CoinEnable", 1).getInt();
/* 7268 */     CreepingHorrorEnable = config.get(mobs, "CreepingHorrorEnable", 1).getInt();
/* 7269 */     TerribleTerrorEnable = config.get(mobs, "TerribleTerrorEnable", 1).getInt();
/* 7270 */     CliffRacerEnable = config.get(mobs, "CliffRacerEnable", 1).getInt();
/* 7271 */     TriffidEnable = config.get(mobs, "TriffidEnable", 1).getInt();
/* 7272 */     WormEnable = config.get(mobs, "WormEnable", 1).getInt();
/* 7273 */     CloudSharkEnable = config.get(mobs, "CloudSharkEnable", 1).getInt();
/* 7274 */     GoldFishEnable = config.get(mobs, "GoldFishEnable", 1).getInt();
/* 7275 */     LeafMonsterEnable = config.get(mobs, "LeafMonsterEnable", 1).getInt();
/* 7276 */     EnderKnightEnable = config.get(mobs, "EnderKnightEnable", 1).getInt();
/* 7277 */     EnderReaperEnable = config.get(mobs, "EnderReaperEnable", 1).getInt();
/* 7278 */     BeaverEnable = config.get(mobs, "BeaverEnable", 1).getInt();
/* 7279 */     IrukandjiEnable = config.get(mobs, "IrukandjiEnable", 1).getInt();
/* 7280 */     SkateEnable = config.get(mobs, "SkateEnable", 1).getInt();
/* 7281 */     WhaleEnable = config.get(mobs, "WhaleEnable", 1).getInt();
/* 7282 */     FlounderEnable = config.get(mobs, "FlounderEnable", 1).getInt();
/* 7283 */     PitchBlackEnable = config.get(mobs, "NightmareEnable", 1).getInt();
/* 7284 */     LurkingTerrorEnable = config.get(mobs, "LurkingTerrorEnable", 1).getInt();
/* 7285 */     GodzillaEnable = config.get(mobs, "GodzillaEnable", 1).getInt();
/* 7286 */     CrabEnable = config.get(mobs, "CrabEnable", 1).getInt();
/*      */     
/* 7288 */     Bee_stats = get_mobstats(config, mobs, "Bee", 80, 12, 5);
/* 7289 */     Mantis_stats = get_mobstats(config, mobs, "Mantis", 120, 16, 10);
/* 7290 */     HerculesBeetle_stats = get_mobstats(config, mobs, "HerculesBeetle", 250, 30, 19);
/* 7291 */     Mothra_stats = get_mobstats(config, mobs, "Mothra", 150, 12, 8);
/* 7292 */     Brutalfly_stats = get_mobstats(config, mobs, "Brutalfly", 110, 10, 6);
/* 7293 */     Nastysaurus_stats = get_mobstats(config, mobs, "Nastysaurus", 200, 32, 17);
/* 7294 */     Pointysaurus_stats = get_mobstats(config, mobs, "Pointysaurus", 80, 10, 16);
/* 7295 */     Alosaurus_stats = get_mobstats(config, mobs, "Alosaurus", 110, 18, 8);
/* 7296 */     SpiderRobot_stats = get_mobstats(config, mobs, "SpiderRobot", 1500, 100, 16);
/* 7297 */     AntRobot_stats = get_mobstats(config, mobs, "AntRobot", 300, 30, 16);
/* 7298 */     Jeffery_stats = get_mobstats(config, mobs, "Jeffery", 550, 40, 18);
/* 7299 */     Hammerhead_stats = get_mobstats(config, mobs, "Hammerhead", 240, 75, 20);
/* 7300 */     Molenoid_stats = get_mobstats(config, mobs, "Molenoid", 200, 18, 12);
/* 7301 */     TRex_stats = get_mobstats(config, mobs, "TRex", 160, 22, 14);
/* 7302 */     BandP_stats = get_mobstats(config, mobs, "BandP", 100, 1, 18);
/* 7303 */     CaterKiller_stats = get_mobstats(config, mobs, "CaterKiller", 450, 32, 19);
/* 7304 */     Cryolophosaurus_stats = get_mobstats(config, mobs, "Cryolophosaurus", 10, 3, 1);
/* 7305 */     Rat_stats = get_mobstats(config, mobs, "Rat", 5, 3, 1);
/* 7306 */     Urchin_stats = get_mobstats(config, mobs, "Urchin", 25, 10, 4);
/* 7307 */     Kyuubi_stats = get_mobstats(config, mobs, "Kyuubi", 125, 10, 10);
/* 7308 */     GammaMetroid_stats = get_mobstats(config, mobs, "GammaMetroid", 100, 10, 12);
/* 7309 */     Basilisk_stats = get_mobstats(config, mobs, "Basilisk", 200, 24, 15);
/* 7310 */     EmperorScorpion_stats = get_mobstats(config, mobs, "EmperorScorpion", 350, 35, 20);
/* 7311 */     TrooperBug_stats = get_mobstats(config, mobs, "TrooperBug", 200, 20, 15);
/* 7312 */     SpitBug_stats = get_mobstats(config, mobs, "SpitBug", 100, 10, 12);
/* 7313 */     Alien_stats = get_mobstats(config, mobs, "Alien", 100, 12, 8);
/* 7314 */     WaterDragon_stats = get_mobstats(config, mobs, "WaterDragon", 150, 20, 8);
/* 7315 */     SeaMonster_stats = get_mobstats(config, mobs, "SeaMonster", 110, 14, 8);
/* 7316 */     SeaViper_stats = get_mobstats(config, mobs, "SeaViper", 160, 22, 12);
/* 7317 */     Robot2_stats = get_mobstats(config, mobs, "Robot2", 200, 22, 18);
/* 7318 */     Robot3_stats = get_mobstats(config, mobs, "Robot3", 80, 16, 14);
/* 7319 */     Robot4_stats = get_mobstats(config, mobs, "Robot4", 170, 12, 18);
/* 7320 */     Robot5_stats = get_mobstats(config, mobs, "Robot5", 20, 5, 6);
/* 7321 */     Rotator_stats = get_mobstats(config, mobs, "Rotator", 35, 10, 8);
/* 7322 */     Vortex_stats = get_mobstats(config, mobs, "Vortex", 150, 26, 10);
/* 7323 */     DungeonBeast_stats = get_mobstats(config, mobs, "DungeonBeast", 65, 12, 6);
/* 7324 */     Triffid_stats = get_mobstats(config, mobs, "Triffid", 100, 20, 12);
/* 7325 */     LurkingTerror_stats = get_mobstats(config, mobs, "LurkingTerror", 30, 6, 5);
/* 7326 */     WormSmall_stats = get_mobstats(config, mobs, "WormSmall", 10, 3, 0);
/* 7327 */     WormMedium_stats = get_mobstats(config, mobs, "WormMedium", 30, 10, 8);
/* 7328 */     WormLarge_stats = get_mobstats(config, mobs, "WormLarge", 90, 18, 14);
/* 7329 */     EnderKnight_stats = get_mobstats(config, mobs, "EnderKnight", 60, 12, 6);
/* 7330 */     EnderReaper_stats = get_mobstats(config, mobs, "EnderReaper", 90, 18, 8);
/* 7331 */     Irukandji_stats = get_mobstats(config, mobs, "Irukandji", 1, 20, 0);
/* 7332 */     AttackSquid_stats = get_mobstats(config, mobs, "AttackSquid", 10, 8, 0);
/* 7333 */     CaveFisher_stats = get_mobstats(config, mobs, "CaveFisher", 10, 4, 4);
/* 7334 */     CloudShark_stats = get_mobstats(config, mobs, "CloudShark", 15, 6, 5);
/* 7335 */     CreepingHorror_stats = get_mobstats(config, mobs, "CreepingHorror", 10, 3, 2);
/* 7336 */     Godzilla_stats = get_mobstats(config, mobs, "Mobzilla", 4000, 175, 21);
/* 7337 */     Kraken_stats = get_mobstats(config, mobs, "Kraken", 1000, 40, 10);
/* 7338 */     LeafMonster_stats = get_mobstats(config, mobs, "LeafMonster", 6, 2, 1);
/* 7339 */     PitchBlack_stats = get_mobstats(config, mobs, "Nightmare", 250, 30, 10);
/* 7340 */     Scorpion_stats = get_mobstats(config, mobs, "Scorpion", 15, 4, 10);
/* 7341 */     Skate_stats = get_mobstats(config, mobs, "Skate", 8, 8, 4);
/* 7342 */     TerribleTerror_stats = get_mobstats(config, mobs, "TerribleTerror", 10, 5, 3);
/* 7343 */     TheKing_stats = get_mobstats(config, mobs, "TheKing", 7000, 350, 21);
/* 7344 */     TheQueen_stats = get_mobstats(config, mobs, "TheQueen", 6000, 225, 21);
/* 7345 */     Leon_stats = get_mobstats(config, mobs, "Leonopteryx", 150, 20, 8);
/* 7346 */     Crab_stats = get_mobstats(config, mobs, "Crab", 180, 24, 16);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getVersion() {
/* 7353 */     return "1.7.10.20";
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreSpawnMain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */