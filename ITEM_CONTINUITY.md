# OreSpawn Item Continuity

This file keeps the 1.16.5 port aligned with the player-facing OreSpawn item taxonomy from the community OreSpawn wiki and the exact item registrations in the recovered 1.7.10 source.

Reference sources:
- Community-facing item categories and names: <https://minecraft-mods.fandom.com/wiki/OreSpawn#Items>
- Exact 1.7.10 registration names and display names: `legacy-src/danger/orespawn/OreSpawnMain.java`

Important note:
- The Fandom page is tagged as a `1.12.2` page, so it is best treated as a continuity guide for names/categories.
- The decompiled `1.7.10` source is the authoritative reference for what the original mod actually registered.
- Where those differ, preserve the original behavior/registry identity and prefer the established player-facing display name. That is why the current port keeps the internal `bertha` id but shows `Big Bertha`.

## Sourced Legacy Weapon Notes

### Big Bertha

- The community OreSpawn wiki describes Big Bertha as dealing `500 damage per hit` and having `long reach`, and its dedicated page says the sword is `MASSIVE` and built from multiple parts.
- The legacy `1.7.10` source backs that up directly:
  - `OreSpawnMain.java` defines Bertha weapon stats as harvest level `3`, max uses `9000`, efficiency `15`, damage `496`, enchantability `100`.
  - In `1.7.10`, `ItemSword` adds base sword damage on top of tool-material damage, which is why Bertha lands at roughly `500` damage in practice.
  - `RenderBertha.java` uses a dedicated custom item renderer and model instead of the normal flat handheld item path.
  - `Bertha.java` spawns a separate `BerthaHit` attack entity on swing, which is part of why the weapon feels like it reaches beyond a normal sword.
  - `OreSpawnMain.java` also registers `BerthaHandle`, `BerthaGuard`, and `BerthaBlade`, matching the wiki claim that it comes in specific parts.

### Royal Guardian Sword

- The community OreSpawn wiki lists the Royal Guardian Sword at `750 attack damage` with `very far reach`.
- The legacy source defines `royal_stats` with damage `746`, which maps to roughly `750` in the old sword system.
- `RenderRoyal.java` also uses a dedicated custom item renderer and model, not a normal sword sprite.

### The Slice

- The OreSpawn overview page describes The Slice as a clone of Big Bertha with even longer reach.
- The legacy source registers it as its own item and gives it a dedicated renderer in `RenderSlice.java`.

### Continuity Implications

- Iconic OreSpawn weapons should not be treated as normal vanilla-scale handheld items.
- For Big Bertha specifically, continuity means all three of these should stay true together:
  - oversized presentation in-hand
  - extreme durability/damage values
  - extended reach behavior

## Wiki Item Categories

### Weapons and Tools

| Wiki name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Big Bertha | `OreSpawn_Bertha`, display name `Big Bertha` | Ported as `bertha`; display name aligned, legacy-sized presentation restored, legacy durability/damage profile restored, Bertha parts added |
| Emerald Sword | `OreSpawn_EmeraldSword` | Ported |
| Poison Sword | `OreSpawn_PoisonSword` | Ported with legacy-style built-in Sharpness I and poison, wither, and weakness hit effects |
| Rat Sword | `OreSpawn_RatSword` | Ported as a simplified creature-summoning sword that still spawns attacking silverfish stand-ins until dedicated hostile Rat combat AI is ported, with a modernized crystal-tier crafting path using Tiger's Eye and Crystal Sticks |
| Fairy Sword | `OreSpawn_FairySword` | Ported as a simplified creature-summoning sword that still spawns attacking bee stand-ins until dedicated Fairy combat AI is ported, with a modernized crystal-tier crafting path using Crystal Pink and Crystal Sticks |
| Mantis Claw | `OreSpawn_MantisClaw` | Ported with the legacy-style vampiric hit feel by lightly damaging the target and healing the attacker on contact |
| Big Hammer | `OreSpawn_BigHammer` | Ported with the legacy knock-up feel by launching hit targets upward while keeping its extreme durability, and now craftable as a Battle Axe upgrade |
| Experience Sword | `OreSpawn_ExperienceSword` | Ported |
| Emerald Pickaxe | `OreSpawn_EmeraldPickaxe` | Ported |
| Emerald Axe | `OreSpawn_EmeraldAxe` | Ported |
| Emerald Shovel | `OreSpawn_EmeraldShovel` | Ported |
| Emerald Hoe | `OreSpawn_EmeraldHoe` | Ported |
| Royal Guardian Sword | `OreSpawn_Royal`, display name `Royal Guardian Sword` | Ported |
| Ruby Sword | `OreSpawn_RubySword` | Ported |
| Ruby Pickaxe | `OreSpawn_RubyPickaxe` | Ported |
| Ruby Axe | `OreSpawn_RubyAxe` | Ported |
| Ruby Shovel | `OreSpawn_RubyShovel` | Ported |
| Ruby Hoe | `OreSpawn_RubyHoe` | Ported |
| Crystal Pink Sword | `OreSpawn_PinkSword` | Ported as `crystal_pink_sword` |
| Crystal Pink Pickaxe | `OreSpawn_PinkPickaxe` | Ported as `crystal_pink_pickaxe` |
| Crystal Pink Axe | `OreSpawn_PinkAxe` | Ported as `crystal_pink_axe` |
| Crystal Pink Shovel | `OreSpawn_PinkShovel` | Ported as `crystal_pink_shovel` |
| Crystal Pink Hoe | `OreSpawn_PinkHoe` | Ported as `crystal_pink_hoe` |
| Crystal Wood Sword | `OreSpawn_CrystalWoodSword` | Ported as `crystal_wood_sword`, with a modernized crafting path using planks and Crystal Sticks |
| Crystal Wood Pickaxe | `OreSpawn_CrystalWoodPickaxe` | Ported as `crystal_wood_pickaxe`, with a modernized crafting path using planks and Crystal Sticks |
| Crystal Wood Axe | `OreSpawn_CrystalWoodAxe` | Ported as `crystal_wood_axe`, with a modernized crafting path using planks and Crystal Sticks |
| Crystal Wood Shovel | `OreSpawn_CrystalWoodShovel` | Ported as `crystal_wood_shovel`, with a modernized crafting path using planks and Crystal Sticks |
| Crystal Wood Hoe | `OreSpawn_CrystalWoodHoe` | Ported as `crystal_wood_hoe`, with a modernized crafting path using planks and Crystal Sticks |
| Crystal Stone Sword | `OreSpawn_CrystalStoneSword` | Ported as `crystal_stone_sword`, with a modernized crafting path using cobblestone and Crystal Sticks |
| Crystal Stone Pickaxe | `OreSpawn_CrystalStonePickaxe` | Ported as `crystal_stone_pickaxe`, with a modernized crafting path using cobblestone and Crystal Sticks |
| Crystal Stone Axe | `OreSpawn_CrystalStoneAxe` | Ported as `crystal_stone_axe`, with a modernized crafting path using cobblestone and Crystal Sticks |
| Crystal Stone Shovel | `OreSpawn_CrystalStoneShovel` | Ported as `crystal_stone_shovel`, with a modernized crafting path using cobblestone and Crystal Sticks |
| Crystal Stone Hoe | `OreSpawn_CrystalStoneHoe` | Ported as `crystal_stone_hoe`, with a modernized crafting path using cobblestone and Crystal Sticks |
| Tiger's Eye Sword | `OreSpawn_TigersEyeSword` | Ported as `tigers_eye_sword` |
| Tiger's Eye Pickaxe | `OreSpawn_TigersEyePickaxe` | Ported as `tigers_eye_pickaxe` |
| Tiger's Eye Axe | `OreSpawn_TigersEyeAxe` | Ported as `tigers_eye_axe` |
| Tiger's Eye Shovel | `OreSpawn_TigersEyeShovel` | Ported as `tigers_eye_shovel` |
| Tiger's Eye Hoe | `OreSpawn_TigersEyeHoe` | Ported as `tigers_eye_hoe` |
| Amethyst Pickaxe | `OreSpawn_AmethystPickaxe` | Ported |
| Amethyst Axe | `OreSpawn_AmethystAxe` | Ported |
| Amethyst Shovel | `OreSpawn_AmethystShovel` | Ported |
| Amethyst Hoe | `OreSpawn_AmethystHoe` | Ported |
| The Slice | `OreSpawn_Slice`, display name `Slice` | Ported with its legacy-style Bertha-plus-diamond upgrade recipe |
| Nightmare Sword | `OreSpawn_NightmareSword` | Ported with a modernized survival recipe built around nightmare scales, titanium, blaze energy, and diamond instead of staying loot-only |
| The Ultimate Sword | `OreSpawn_UltimateSword`, display name `The Ultimate Sword` | Ported; display name aligned |
| Battle Axe | `OreSpawn_BattleAxe`, internal name `battleaxesmall` | Ported with legacy durability and damage profile plus the reduced battle-axe enchant package instead of full Ultimate Sword enchants |
| Chainsaw | `OreSpawn_Chainsaw`, internal name `chainsawsmall` | Ported with legacy durability and damage profile plus modernized chainsaw sound and short-range area hit behavior instead of the exact legacy target sweep |
| The Ultimate Bow | `OreSpawn_UltimateBow`, display name `The Ultimate Bow` | Ported |
| The Skate String Bow | `OreSpawn_SkateBow`, display name `Skate String Bow` | Ported with its legacy-style crystal-stick and string recipe |
| Attitude Adjuster | `OreSpawn_Hammy`, display name `Attitude Adjuster` | Ported with the legacy-style shapeless progression recipe using two Ultimate Swords, a Big Hammer, and Green Goo |
| Queen Battle Axe | `OreSpawn_QueenBattleAxe` | Ported as `queen_battle_axe`; display name aligned to `Queen Scale Battle Axe` |
| Ultimate Fishing Rod | `OreSpawn_UltimateFishingRod`, display name `The Ultimate Fishing Rod` | Ported |

### Ore Drops

| Wiki name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Amethyst | `OreSpawn_Amethyst` | Ported, with ore-processing, direct ore loot, and storage-block recipe coverage |
| Ruby | `OreSpawn_Ruby` | Ported, with ore-processing, direct ore loot, and storage-block recipe coverage |
| Salt | `OreSpawn_Salt` | Ported, with salt ore now dropping direct salt loot as well as smelting coverage |
| Titanium Nugget | `OreSpawn_TitaniumNugget` | Ported, with nugget, ingot, ore-processing, direct ore loot, and storage-block recipe coverage |
| Uranium Nugget | `OreSpawn_UraniumNugget` | Ported, with nugget, ingot, ore-processing, direct ore loot, and storage-block recipe coverage |

### Misc Items

| Wiki name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Ancient Dried Ore Spawn Egg | Implemented in legacy as many individual dried spawn blocks plus matching egg items | Ported as a first large modern block wave with simplified timed hatching; current wave includes spider, bat, cow, pig, squid, chicken, creeper, skeleton, zombie, slime, ghast, enderman, cave spider, silverfish, magma cube, witch, sheep, wolf, mooshroom, ocelot, blaze, wither skeleton, snow golem, iron golem, villager, Cloud Shark, and MOTHRA, with Cloud Shark and MOTHRA using phantom stand-ins until those entities are ported; selected Ancient Dried blocks now also generate as themed landmark heaps in the new OreSpawn dimensions |
| Ant Nest | `MyAntBlock`, display name `Ant Nest` | Ported as simplified teleporter nest variants for red ant, termite, crystal termite, rainbow ant, and unstable ant destinations, now with real cross-dimension travel plus themed arrival sanctuaries when the new starter OreSpawn dimensions are present; unstable ant nests now roulette across the OreSpawn travel dimensions instead of only picking a random Overworld destination, and the ant dimensions now naturally generate their own nest blocks as first-pass world landmarks |
| Apple Tree Seed | `OreSpawn_AppleSeed` | Ported as a simplified orchard-tree seed that grows an apple-leaf tree |
| Big Bertha Handle | `OreSpawn_BerthaHandle` | Ported |
| Big Bertha Guard | `OreSpawn_BerthaGuard` | Ported |
| Big Bertha Blade | `OreSpawn_BerthaBlade` | Ported |
| Firefly Seed | `OreSpawn_FireflySeed` | Ported as a simplified single-block 4-stage crop seed, with a modernized glowstone-and-seeds crafting path |
| Butterfly Plant | `OreSpawn_ButterflySeed`, `OreSpawn_ButterflyPlant`, internal names `butterfly_seed` and `butterfly_plant` | Ported as a simplified single-block 4-stage decorative insect plant, with a modernized flower-and-seeds crafting path |
| Moth Plant | `OreSpawn_MothSeed`, `OreSpawn_MothPlant`, internal names `moth_seed` and `moth_plant` | Ported as a simplified single-block 4-stage decorative insect plant, with a modernized phantom-membrane-and-seeds crafting path |
| Firefly | `OreSpawn_Firefly` | Ported as a first custom 1.16.5 ambient mob using a simplified vanilla bat-style renderer and glow particles until the legacy model and texture are restored; now also has a light glowstone-style loot hook |
| Butterfly | `OreSpawn_Butterfly` | Ported as a first custom 1.16.5 ambient mob using a simplified vanilla bat-style renderer until the legacy model and texture are restored; now also has a light flower-themed loot hook |
| Moth | `OreSpawn_Moth` | Ported as a first custom 1.16.5 ambient mob using a simplified vanilla bat-style renderer until the legacy model and texture are restored; now also drops Moth Scale to support the armor branch |
| Peacock | `OreSpawn_Peacock` | Ported as a custom 1.16.5 passive creature using a simplified vanilla chicken-style renderer and behavior until the legacy model and AI are restored; now also drops raw peacock and peacock feathers to support the food and armor branches |
| Fairy | `OreSpawn_Fairy` | Ported as a custom 1.16.5 passive flying creature using a simplified vanilla bee-style renderer and behavior until the legacy model and AI are restored; now also has a light Crystal Pink loot hook to support the Fairy Sword branch |
| Rat | `OreSpawn_Rat` | Ported as a custom 1.16.5 passive small creature using a simplified vanilla rabbit-style renderer and behavior until the legacy model and hostile AI are restored; now also has a light Tiger's Eye loot hook to support the Rat Sword branch |
| Stink Bug | `OreSpawn_StinkBug` | Ported as a custom 1.16.5 passive flying creature using a simplified vanilla bee-style renderer and behavior until the legacy model and stink effects are restored; now also drops Dead Stink Bug for poison and repellent progression |
| Red Ant | `OreSpawn_RedAnt` | Ported as a first custom 1.16.5 passive ground mob with a simplified endermite-style renderer; red ant nests now target the new `danger_isles` dimension when available |
| Brown Ant | `OreSpawn_BrownAnt` | Ported as a custom 1.16.5 passive ground mob with a simplified endermite-style renderer and added to the forest-adjacent and Danger Isles biome spawn mixes |
| Rainbow Ant | `OreSpawn_RainbowAnt` | Ported as a first custom 1.16.5 passive ground mob with a simplified endermite-style renderer; rainbow ant nests now target the new `rainbow_dimension` dimension when available |
| Termite | `OreSpawn_Termite` | Ported as a first custom 1.16.5 passive ground mob with a simplified silverfish-style renderer; termite nests now target `mining_paradise` and crystal termite nests target `crystal_world` when available |
| Unstable Ant | `OreSpawn_UnstableAnt` | Ported as a custom 1.16.5 passive ground mob with a simplified silverfish-style renderer and added lightly to the more chaotic OreSpawn dimension biome spawn mixes |
| Experience Orb Catcher | `OreSpawn_ExperienceCatcher` | Ported as simplified XP-orb utility item, with a modernized survival recipe using a bottle, string, and emerald |
| Experience Tree Seed | `OreSpawn_ExperienceTreeSeed` | Ported as simplified modern sapling planter |
| Instant Survival Shelter | `OreSpawn_InstantShelter` | Ported as a simplified modern prefab cobblestone shelter with starter supplies |
| Instant Survival Garden | `OreSpawn_InstantGarden` | Ported as a simplified modern hydrated mixed-crop field |
| Random Dungeon | `OreSpawn_RandomDungeon` | Ported as a simplified dungeon placer that builds a compact vanilla-style spawner room |
| Miner's Dream | `OreSpawn_MinersDream` | Ported as a simplified tunnel-carving utility item with torch placement |
| Nether Tracker | `OreSpawn_NetherLost`, internal name `netherlost` | Ported as a glowing breadcrumb tool that marks netherrack underfoot while held in the Nether |
| Sifter | `OreSpawn_Sifter` | Ported as a simplified modern block-sifting utility for sand, gravel, clay, and dirt-like blocks |
| Creeper Launcher | `OreSpawn_CreeperLauncher` | Ported as a simplified modern anti-creeper utility item that right-click-launches creepers upward and is consumed on use |
| A Freakin' Ray Gun! | `OreSpawn_RayGun`, internal name `RayGun` | Ported as a simplified modern laser launcher that fires a fast laser-ball shot with recoil and legacy-style durability |
| Thunder Staff | `OreSpawn_ThunderStaff` | Ported as a simplified modern lightning launcher with legacy-style durability and storm-based recharge |
| Wrench | `OreSpawn_Wrench` | Ported as a simplified modern mechanical repair tool for golems instead of the legacy robot-dismantling behavior, which depends on unported robot entities |
| SquidZooka! | `OreSpawn_SquidZooka`, internal name `squidzookasmall` | Ported as a simplified launcher that fires a vanilla squid in place of the legacy Attack Squid entity |
| ZooKeeper Shard | `OreSpawn_ZooKeeper`, internal name `zookeeper` | Ported as a continuity item for zoo/capture progression, now with a craftable crystal-and-bars recipe |
| Zoo Cage 2 | `OreSpawn_ZooCage2` | Ported as a continuity progression item, now with a base craft path from the ZooKeeper shard |
| Zoo Cage 4 | `OreSpawn_ZooCage4` | Ported as a continuity progression item with the upgrade chain restored |
| Zoo Cage 6 | `OreSpawn_ZooCage6` | Ported as a continuity progression item with the upgrade chain restored |
| Zoo Cage 8 | `OreSpawn_ZooCage8` | Ported as a continuity progression item with the upgrade chain restored |
| Zoo Cage 10 | `OreSpawn_ZooCage10` | Ported as a continuity progression item with the upgrade chain restored |
| Empty Critter Cage | `OreSpawn_CageEmpty`, internal name `cageempty` | Ported with simplified modern capture and release behavior for a first vanilla mob set, plus both crystal-tier and vanilla iron-and-string crafting paths |
| Caged Cow | `OreSpawn_CagedCow`, internal name `cagecow` | Ported with simplified release behavior |
| Caged Pig | `OreSpawn_CagedPig`, internal name `cagepig` | Ported with simplified release behavior |
| Caged Chicken | `OreSpawn_CagedChicken`, internal name `cagechicken` | Ported with simplified release behavior |
| Caged Sheep | `OreSpawn_CagedSheep`, internal name `cagesheep` | Ported with simplified release behavior |
| Caged Wolf | `OreSpawn_CagedWolf`, internal name `cagewolf` | Ported with simplified release behavior |
| Caged Ocelot | `OreSpawn_CagedOcelot`, internal name `cageocelot` | Ported with simplified release behavior |
| Caged Horse | `OreSpawn_CagedHorse`, internal name `cagehorse` | Ported with simplified release behavior |
| Caged Villager | `OreSpawn_CagedVillager`, internal name `cagevillager` | Ported with simplified release behavior |
| Caged Creeper | `OreSpawn_CagedCreeper`, internal name `cagecreeper` | Ported with simplified release behavior |
| Caged Zombie | `OreSpawn_CagedZombie`, internal name `cagezombie` | Ported with simplified release behavior |
| Caged Skeleton | `OreSpawn_CagedSkeleton`, internal name `cageskeleton` | Ported with simplified release behavior |
| Caged Spider | `OreSpawn_CagedSpider`, internal name `cagespider` | Ported with simplified release behavior |
| Caged Bat | `OreSpawn_CagedBat`, internal name `cagebat` | Ported with simplified release behavior |
| Caged Squid | `OreSpawn_CagedSquid`, internal name `cagesquid` | Ported with simplified release behavior |
| Caged Slime | `OreSpawn_CagedSlime`, internal name `cageslime` | Ported with simplified release behavior |
| Caged Ghast | `OreSpawn_CagedGhast`, internal name `cageghast` | Ported with simplified release behavior |
| Caged Enderman | `OreSpawn_CagedEnderman`, internal name `cageenderman` | Ported with simplified release behavior |
| Caged Cave Spider | `OreSpawn_CagedCaveSpider`, internal name `cagecavespider` | Ported with simplified release behavior |
| Caged Silverfish | `OreSpawn_CagedSilverfish`, internal name `cagesilverfish` | Ported with simplified release behavior |
| Caged Magma Cube | `OreSpawn_CagedMagmaCube`, internal name `cagemagmacube` | Ported with simplified release behavior |
| Caged Witch | `OreSpawn_CagedWitch`, internal name `cagewitch` | Ported with simplified release behavior |
| Caged Blaze | `OreSpawn_CagedBlaze`, internal name `cageblaze` | Ported with simplified release behavior |
| Caged Mooshroom | `OreSpawn_CagedMooshroom`, internal name `cagemooshroom` | Ported with simplified release behavior |
| Caged Wither Skeleton | `OreSpawn_CagedWitherSkeleton`, internal name `cagewitherskeleton` | Ported with simplified release behavior |
| Caged Snow Golem | `OreSpawn_CagedSnowGolem`, internal name `cagesnowgolem` | Ported with simplified release behavior |
| Caged Iron Golem | `OreSpawn_CagedIronGolem`, internal name `cageirongolem` | Ported with simplified release behavior |
| Caged Peacock | `OreSpawn_CagedPeacock`, internal name `cagepeacock` | Ported with real release behavior for the new custom Peacock entity |
| Caged Fairy | `OreSpawn_CagedFairy`, internal name `cagefairy` | Ported with real release behavior for the new custom Fairy entity |
| Caged Rat | `OreSpawn_CagedRat`, internal name `cagerat` | Ported with real release behavior for the new custom Rat entity |
| Caged Gazelle | `OreSpawn_CagedGazelle`, internal name `cagegazelle` | Ported with real release behavior for a new custom Gazelle entity, currently using a simplified vanilla cow-style renderer and passive behavior until the legacy model and AI are restored |
| Caged Stink Bug | `OreSpawn_CagedStink`, internal name `cagestink` | Ported with real release behavior for the new custom Stink Bug entity |
| Caged Mantis | `OreSpawn_CagedMantis`, internal name `cagemantis` | Ported with real release behavior for a new custom Mantis entity, currently using a simplified vanilla cave-spider renderer and hostile behavior until the legacy model and AI are restored |
| Caged Stinky | `OreSpawn_CagedStinky`, internal name `cagestinky` | Ported with real release behavior for a new custom Stinky entity, currently using a simplified vanilla pig-style renderer and passive behavior until the legacy model and AI are restored |
| Caged Crab | `OreSpawn_CagedCrab`, internal name `cagecrab` | Ported with simplified release behavior using a turtle stand-in until Crab entities are ported |
| Caged Cloud Shark | `OreSpawn_CagedCloudShark`, internal name `cagecloudshark` | Ported with simplified release behavior using a phantom stand-in until Cloud Shark entities are ported |
| Caged MOTHRA | `OreSpawn_CagedMOTHRA`, internal name `cagemothra` | Ported with simplified release behavior using a phantom stand-in until MOTHRA is ported |
| Caged Firefly | `OreSpawn_CagedFirefly`, internal name `cagefirefly` | Ported as a real release item for the new custom Firefly entity |
| Spawn Gazelle | `OreSpawn_GazelleEgg`, internal name `egggazelle` | Ported as a real spawn egg for the new custom Gazelle entity |
| Spawn Stink Bug | `OreSpawn_StinkBugEgg`, internal name `eggstink` | Ported as a real spawn egg for the new custom Stink Bug entity |
| Spawn Mantis | `OreSpawn_MantisEgg`, internal name `eggmantis` | Ported as a real spawn egg for the new custom Mantis entity |
| Spawn Stinky | `OreSpawn_StinkyEgg`, internal name `eggstinky` | Ported as a real spawn egg for the new custom Stinky entity |
| Spawn Firefly | `OreSpawn_FireflyEgg`, internal name `eggfirefly` | Ported as a real spawn egg for the new custom Firefly entity |
| Spawn Butterfly | `OreSpawn_ButterflyEgg`, internal name `eggbutterfly` | Ported as a real spawn egg for the new custom Butterfly entity |
| Spawn Termite | `OreSpawn_TermiteEgg`, internal name `eggtermite` | Ported as a real spawn egg for the new custom Termite entity |
| Spawn Cloud Shark | `OreSpawn_CloudSharkEgg`, internal name `eggcloudshark` | Ported as a modern spawn egg using a phantom stand-in until Cloud Shark entities are ported |
| Spawn Moth | `OreSpawn_MothEgg`, internal name `eggmoth` | Ported as a real spawn egg for the new custom Moth entity |
| Spawn MOTHRA! | `OreSpawn_MOTHRAEgg`, internal name `eggmothra` | Ported as a modern spawn egg using a phantom stand-in until MOTHRA is ported |
| Spawn Brown Ant | `OreSpawn_BrownAntEgg`, internal name `eggbrownant` | Ported as a real spawn egg for the new custom Brown Ant entity |
| Spawn Rainbow Ant | `OreSpawn_RainbowAntEgg`, internal name `eggrainbowant` | Ported as a real spawn egg for the new custom Rainbow Ant entity |
| Spawn Unstable Ant | `OreSpawn_UnstableAntEgg`, internal name `eggunstableant` | Ported as a real spawn egg for the new custom Unstable Ant entity |
| Spawn Bomb-Omb | `OreSpawn_Robot1Egg`, internal name `eggrobot1` | Ported as a modern spawn egg using a creeper stand-in until robot entities are ported |
| Spawn Robo-Pounder | `OreSpawn_Robot2Egg`, internal name `eggrobot2` | Ported as a modern spawn egg using an iron golem stand-in until robot entities are ported |
| Spawn Robo-Gunner | `OreSpawn_Robot3Egg`, internal name `eggrobot3` | Ported as a modern spawn egg using a pillager stand-in until robot entities are ported |
| Spawn Robo-Warrior | `OreSpawn_Robot4Egg`, internal name `eggrobot4` | Ported as a modern spawn egg using a vindicator stand-in until robot entities are ported |
| Spawn Red Ant | `OreSpawn_RedAntEgg`, internal name `eggredant` | Ported as a real spawn egg for the new custom Red Ant entity |
| Spawn Robo-Sniper | `OreSpawn_Robot5Egg`, internal name `eggrobot5` | Ported as a modern spawn egg using a skeleton stand-in until robot entities are ported |
| Spawn Jeffery | `OreSpawn_JefferyEgg`, internal name `eggrobot6` | Ported as a modern spawn egg using a stray stand-in until Jeffery is ported |
| Spawn Red Ant Robot | `OreSpawn_AntRobotEgg`, internal name `eggantrobot` | Ported as a modern spawn egg using an endermite stand-in until Red Ant Robot entities are ported |
| Spawn Giant Spider Robot | `OreSpawn_SpiderRobotEgg`, internal name `eggspiderrobot` | Ported as a modern spawn egg using a spider stand-in until Giant Spider Robot entities are ported |
| Kraken Tooth | `OreSpawn_KrakenTooth` | Ported |
| Worm Tooth | `OreSpawn_WormTooth` | Ported |
| TRex Tooth | `OreSpawn_TRexTooth` | Ported |
| Sea Monster Scale | `OreSpawn_SeaMonsterScale` | Ported |
| CaterKiller Jaws | `OreSpawn_CaterKillerJaws` | Ported |
| Sea Viper Tongue | `OreSpawn_SeaViperTongue` | Ported |
| Vortex Eye | `OreSpawn_VortexEye` | Ported |
| Green Goo | `OreSpawn_GreenGoo` | Ported |
| Crystal Shards | `OreSpawn_CrystalSticks`, internal name `crystalsticks` | Ported |
| Spider Robot Kit | `OreSpawn_SpiderRobotKit` | Ported as a continuity crafting item; robot entity deployment is still pending |
| Red Ant Robot Kit | `OreSpawn_AntRobotKit` | Ported as a continuity crafting item; robot entity deployment is still pending |
| Acid | `OreSpawn_Acid` | Ported as a throwable corrosive ammo item with simplified poison and weakness behavior |
| Dead Irukandji | `OreSpawn_Irukandji`, internal name `deadirukandji` | Ported as a throwable toxic ammo item with simplified poison and slowness behavior |
| Irukandji Arrow | `OreSpawn_IrukandjiArrow` | Ported as a continuity crafting and ammo item; dedicated custom bow behavior is still pending |
| Dead Stink Bug | `OreSpawn_DeadStinkBug` | Ported as a continuity crafting item for poison and repellent recipes |
| Small Rock | `OreSpawn_SmallRock`, internal name `rocksmall` | Ported as a throwable ammo item with simplified light-damage behavior |
| Big Rock | `OreSpawn_BigRock`, internal name `rock` | Ported as a throwable ammo item with simplified heavy-hit and brief slowness behavior |
| Flame Rock | `OreSpawn_RedRock`, internal name `rockred` | Ported as a throwable ammo item with simplified fire-hit and fire-starting behavior |
| Crystal Flame Rock | `OreSpawn_CrystalRedRock`, internal name `rockcrystalred` | Ported as a throwable ammo item with simplified stronger fire-hit behavior |
| Crystal Poison Rock | `OreSpawn_CrystalGreenRock`, internal name `rockcrystalgreen` | Ported as a throwable ammo item with simplified stronger poison-hit behavior |
| Crystal Frost Rock | `OreSpawn_CrystalBlueRock`, internal name `rockcrystalblue` | Ported as a throwable ammo item with simplified stronger slow-hit behavior |
| Crystal TNT Rock | `OreSpawn_CrystalTNTRock`, internal name `rockcrystaltnt` | Ported as a throwable ammo item with simplified explosive impact behavior |
| Poison Rock | `OreSpawn_GreenRock`, internal name `rockgreen` | Ported as a throwable ammo item with simplified poison-hit behavior |
| Frost Rock | `OreSpawn_BlueRock`, internal name `rockblue` | Ported as a throwable ammo item with simplified slow-hit behavior |
| Chaos Rock | `OreSpawn_PurpleRock`, internal name `rockpurple` | Ported as a throwable ammo item with simplified confusion and weakness-hit behavior |
| Spikey Rock | `OreSpawn_SpikeyRock`, internal name `rockspikey` | Ported as a throwable ammo item with simplified heavy physical-hit behavior |
| TNT Rock | `OreSpawn_TNTRock`, internal name `rocktnt` | Ported as a throwable ammo item with simplified explosive impact behavior |
| Sunspot Urchin | `OreSpawn_SunspotUrchin` | Ported as a throwable ammo item with simplified poison-hit behavior |
| WaterDragon Charge | `OreSpawn_WaterBall`, internal name `waterball` | Ported as a throwable ammo item with simplified water and extinguish behavior |
| Robot Laser Charge | `OreSpawn_LaserBall`, internal name `laserball` | Ported as a throwable ammo item with simplified high-damage fire behavior |
| Ice Ball | `OreSpawn_IceBall`, internal name `iceball` | Ported as a throwable ammo item with simplified slowing and snow-placing behavior |
| Cherry Pit | `OreSpawn_CherrySeed` | Ported as `cherrytree_seed` with a simplified cherry-leaf tree builder |
| Peach Pit | `OreSpawn_PeachSeed` | Ported as `peachtree_seed` with a simplified peach-leaf tree builder |
| Pizza! | `OreSpawn_PizzaBlock`, `OreSpawn_PizzaItem` | Ported as a simplified placeable edible pizza block with six slices |
| Peacock Feather | `OreSpawn_PeacockFeather` | Ported |
| Lava Eel | `OreSpawn_LavaEel` | Ported |
| Moth Scale | `OreSpawn_MothScale` | Ported |
| Queen Scale | `OreSpawn_QueenScale` | Ported |
| Experience Armor | `OreSpawn_ExperienceHelmet`, `OreSpawn_ExperienceBody`, `OreSpawn_ExperienceLegs`, `OreSpawn_ExperienceBoots` | Ported with modernized upgrade recipes built from Emerald Armor and bottled experience |
| Moth Scale Armor | `OreSpawn_MothScaleHelmet`, `OreSpawn_MothScaleBody`, `OreSpawn_MothScaleLegs`, `OreSpawn_MothScaleBoots` | Ported with direct moth-scale crafting recipes |
| Lava Eel Armor | `OreSpawn_LavaEelHelmet`, `OreSpawn_LavaEelBody`, `OreSpawn_LavaEelLegs`, `OreSpawn_LavaEelBoots` | Ported with direct lava-eel crafting recipes |
| Peacock Feather Armor | `OreSpawn_PeacockFeatherHelmet`, `OreSpawn_PeacockFeatherBody`, `OreSpawn_PeacockFeatherLegs`, `OreSpawn_PeacockFeatherBoots` | Ported as `peacock_*`, with direct feather-based crafting recipes |
| Emerald Armor | `OreSpawn_EmeraldHelmet`, `OreSpawn_EmeraldBody`, `OreSpawn_EmeraldLegs`, `OreSpawn_EmeraldBoots` | Ported |
| Crystal Pink Armor | `OreSpawn_PinkHelmet`, `OreSpawn_PinkBody`, `OreSpawn_PinkLegs`, `OreSpawn_PinkBoots` | Ported as `crystal_pink_*` |
| Tiger's Eye Armor | `OreSpawn_TigersEyeHelmet`, `OreSpawn_TigersEyeBody`, `OreSpawn_TigersEyeLegs`, `OreSpawn_TigersEyeBoots` | Ported as `tigers_eye_*` |
| Ruby Armor | `OreSpawn_RubyHelmet`, `OreSpawn_RubyBody`, `OreSpawn_RubyLegs`, `OreSpawn_RubyBoots` | Ported |
| Amethyst Armor | `OreSpawn_AmethystHelmet`, `OreSpawn_AmethystBody`, `OreSpawn_AmethystLegs`, `OreSpawn_AmethystBoots` | Ported |
| Royal Guardian Armor | `OreSpawn_RoyalHelmet`, `OreSpawn_RoyalBody`, `OreSpawn_RoyalLegs`, `OreSpawn_RoyalBoots` | Ported |
| Queen Scale Armor | `OreSpawn_QueenHelmet`, `OreSpawn_QueenBody`, `OreSpawn_QueenLegs`, `OreSpawn_QueenBoots` | Ported |
| Ultimate Armor | `OreSpawn_UltimateHelmet`, `OreSpawn_UltimateBody`, `OreSpawn_UltimateLegs`, `OreSpawn_UltimateBoots` | Ported |

### Food and Farming

| Wiki/legacy name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Butter | `func_77655_b("butter")` in `OreSpawnMain.java` | Ported |
| Salt | `func_77655_b("salt")` in `OreSpawnMain.java`, smelted from `MyOreSaltBlock` | Ported with salt ore and smelting path restored |
| Popcorn | `OreSpawnMain.MyPopcorn` | Ported |
| Buttered Popcorn | `OreSpawnMain.MyButteredPopcorn` | Ported |
| Buttered and Salted Popcorn | `OreSpawnMain.MyButteredSaltedPopcorn` | Ported |
| Bag of Popcorn | `OreSpawnMain.MyPopcornBag` | Ported |
| Raw Corn Dog | `OreSpawnMain.MyRawCornDog` | Ported |
| Corn Dog | `OreSpawnMain.MyCornDog` | Ported |
| Raw Bacon | `OreSpawnMain.MyRawBacon` | Ported as `bacon` |
| Bacon! | `OreSpawnMain.MyBacon` | Ported as `cooked_bacon` with legacy resistance/strength food buffs |
| Butter Candy! | `OreSpawnMain.MyButterCandy` | Ported as `butter_candy` with legacy speed/jump food buffs |
| Cheese | `OreSpawnMain.MyCheese` | Ported |
| Garden Salad | `OreSpawnMain.MySalad` | Ported |
| BLT Sandwich! | `OreSpawnMain.MyBLT` | Ported |
| Strawberry | `OreSpawnMain.MyStrawberry` | Ported |
| Strawberry Plant | `OreSpawnMain.MyStrawberrySeed`, `OreSpawnMain.MyStrawberryPlant` | Ported as a simplified single-block 4-stage crop |
| Cherries | `OreSpawnMain.MyCherry` | Ported as `cherries` |
| Peach | `OreSpawnMain.MyPeach` | Ported |
| Raw Peacock | `OreSpawnMain.MyRawPeacock` | Ported with legacy hunger values and smelting path into cooked peacock |
| Cooked Peacock | `OreSpawnMain.MyPeacock`, internal name `cookedpeacock` | Ported with legacy hunger values |
| Rock Fish | `OreSpawnMain.MyRockFish` | Ported with the legacy-style short hunger drawback chance on eat |
| Raw Crab Meat | `OreSpawnMain.MyRawCrabMeat`, internal name `crabmeat` | Ported with legacy hunger values and smelting path into crab meat |
| Crab Meat! | `OreSpawnMain.MyCrabMeat`, internal name `cookedcrabmeat` | Ported with legacy hunger values |
| A Crabby Patty! | `OreSpawnMain.MyCrabbyPatty`, internal name `crabbypatty` | Ported with legacy-style food chain recipe using cooked crab meat, lettuce, tomato, and bread |
| Apple Tree Leaves | `OreSpawnMain.MyAppleLeaves`, referenced by `ItemAppleSeed.java` | Ported |
| Cherry Tree Leaves | `OreSpawnMain.MyCherryLeaves` | Ported |
| Peach Tree Leaves | `OreSpawnMain.MyPeachLeaves` | Ported |
| Crystal Apple | `OreSpawnMain.MyCrystalApple` | Ported as `crystal_apple` with legacy resistance/strength food buffs and a modernized crystal-material crafting recipe |
| Radish | `OreSpawnMain.MyRadish`, `OreSpawnMain.MyRadishPlant` | Ported as a simplified single-block 4-stage crop/item hybrid instead of the old staged block set |
| Rice | `OreSpawnMain.MyRice`, `OreSpawnMain.MyRicePlant` | Ported as a simplified single-block 4-stage crop/item hybrid instead of the old staged block set |
| Corn | `OreSpawnMain.MyCornCob`, internal name `corn_seed`, plus `MyCornPlant1..4` | Ported under legacy-style `corn_seed` id as a simplified single-block 4-stage crop/item hybrid instead of the old staged vertical block set |
| Quinoa | `OreSpawnMain.MyQuinoa`, plus `MyQuinoaPlant1..4` | Ported as a simplified single-block 4-stage crop/item hybrid instead of the old staged vertical block set |
| Tomato | `OreSpawnMain.MyTomato`, internal name `tomato_seed`, plus `MyTomatoPlant1..4` | Ported under legacy-style `tomato_seed` id as a simplified single-block 4-stage crop/item hybrid instead of the old staged vertical block set |
| Lettuce | `OreSpawnMain.MyLettuce`, internal name `lettuce_seed`, plus `MyLettucePlant1..4` | Ported under legacy-style `lettuce_seed` id as a simplified single-block 4-stage crop/item hybrid instead of the old staged vertical block set |
| Magic Apple | `OreSpawn_MagicApple`, `ItemMagicApple.java` | Ported as a simplified enchanted utility item that instantly plants and grows a tree instead of recreating the full legacy giant-tree generator, with a modernized upgrade recipe from the Crystal Apple |
| Extreme Torch | `OreSpawn_ExtremeTorch` | Ported |
| Crystal Torch | `OreSpawn_CrystalTorch` | Ported |
| Kraken Repellent | `OreSpawn_KrakenRepellent` | Ported as a repellent torch that pushes away modern hostile and neutral aquatic mobs instead of only legacy Kraken and ant entities |
| Creeper Repellent | `OreSpawn_CreeperRepellent` | Ported as a repellent torch that pushes away creepers instead of the full legacy creeper, ant, and purple-power mix |
| Ender Pearl Block | `OreSpawn_MyEnderPearlBlock`, internal name `blockenderpearl` | Ported as a storage/decorative utility block |
| Eye of Ender Block | `OreSpawn_MyEyeOfEnderBlock`, internal name `blockeyeofender` | Ported as a storage/decorative utility block |
| Island Spawner | `OreSpawn_MyIslandBlock`, internal name `island` | Ported as a simplified modern floating-island generator block that creates a small grass island above the placed block |
| Red Ant Troll Block | `OreSpawn_OreRedAntTrollBlock` | Ported as a continuity decorative block |
| Termite Troll Block | `OreSpawn_OreTermiteTrollBlock` | Ported as a continuity decorative block |
| Red Ant Nest | `OreSpawn_RedAntBlock` | Ported as a simplified teleporter nest that searches for plains and forest biomes in the Overworld |
| Rainbow Ant Nest | `OreSpawn_RainbowAntBlock` | Ported as a simplified teleporter nest that now targets the starter `rainbow_dimension`, with Overworld biome-search fallback if the dimension is unavailable |
| Danger Isles / Mining Paradise / Crystal World / Rainbow Dimension | Legacy OreSpawn ant-travel dimensions | Ported as first modern starter dimensions with unique dimension types, custom terrain noise settings, safe arrival sanctuaries, dedicated registered OreSpawn biomes for each world, first-pass dimension-specific deposits and replacement features, lightweight surface landmark decoration, larger boulder-style landmark generation, small structure-lite mixed landmark heaps, custom ambient particles/sounds, stronger dimension-type tuning, richer dimension-native spawn makeup, first custom ruin landmarks, generated grove/spire formations, large monolith landmarks, themed flora-cluster landmark patches, and new multi-piece compound landmark sites; each dimension now uses a small biome set instead of a single placeholder biome, but vegetation and decoration are still a starter pass rather than full legacy biome generation |
| Unstable Ant Nest | `OreSpawn_UnstableAntBlock` | Ported as a simplified chaotic teleporter nest that sends players to a random Overworld location |
| Termite Nest | `OreSpawn_TermiteBlock` | Ported as a simplified teleporter nest that searches for desert and badlands-style biomes in the Overworld |
| Crystal Termite Nest | `OreSpawn_CrystalTermiteBlock` | Ported as a simplified teleporter nest that searches for cold and mountain-style biomes in the Overworld |

## Continuity Rules For Future Ports

1. Keep legacy registry intent from the 1.7.10 source, even if the modern registry id is normalized to lowercase snake_case.
2. Prefer legacy display names when they are explicit in the 1.7.10 source.
3. Use the wiki categories to group items in docs, creative tabs, and milestone planning so the modern port still feels like OreSpawn to players.
4. When the wiki and the 1.7.10 source disagree, note the difference in this file before implementing the item.
