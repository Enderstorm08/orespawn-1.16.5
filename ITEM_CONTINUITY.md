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
| Emerald Sword | `OreSpawn_EmeraldSword` | Pending |
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
| Crystal Wood Sword | `OreSpawn_CrystalWoodSword` | Ported as `crystal_wood_sword` |
| Crystal Wood Pickaxe | `OreSpawn_CrystalWoodPickaxe` | Ported as `crystal_wood_pickaxe` |
| Crystal Wood Axe | `OreSpawn_CrystalWoodAxe` | Ported as `crystal_wood_axe` |
| Crystal Wood Shovel | `OreSpawn_CrystalWoodShovel` | Ported as `crystal_wood_shovel` |
| Crystal Wood Hoe | `OreSpawn_CrystalWoodHoe` | Ported as `crystal_wood_hoe` |
| Crystal Stone Sword | `OreSpawn_CrystalStoneSword` | Ported as `crystal_stone_sword` |
| Crystal Stone Pickaxe | `OreSpawn_CrystalStonePickaxe` | Ported as `crystal_stone_pickaxe` |
| Crystal Stone Axe | `OreSpawn_CrystalStoneAxe` | Ported as `crystal_stone_axe` |
| Crystal Stone Shovel | `OreSpawn_CrystalStoneShovel` | Ported as `crystal_stone_shovel` |
| Crystal Stone Hoe | `OreSpawn_CrystalStoneHoe` | Ported as `crystal_stone_hoe` |
| Tiger's Eye Sword | `OreSpawn_TigersEyeSword` | Ported as `tigers_eye_sword` |
| Tiger's Eye Pickaxe | `OreSpawn_TigersEyePickaxe` | Ported as `tigers_eye_pickaxe` |
| Tiger's Eye Axe | `OreSpawn_TigersEyeAxe` | Ported as `tigers_eye_axe` |
| Tiger's Eye Shovel | `OreSpawn_TigersEyeShovel` | Ported as `tigers_eye_shovel` |
| Tiger's Eye Hoe | `OreSpawn_TigersEyeHoe` | Ported as `tigers_eye_hoe` |
| Amethyst Pickaxe | `OreSpawn_AmethystPickaxe` | Ported |
| Amethyst Axe | `OreSpawn_AmethystAxe` | Ported |
| Amethyst Shovel | `OreSpawn_AmethystShovel` | Ported |
| Amethyst Hoe | `OreSpawn_AmethystHoe` | Ported |
| The Slice | `OreSpawn_Slice`, display name `Slice` | Ported |
| The Ultimate Sword | `OreSpawn_UltimateSword`, display name `The Ultimate Sword` | Ported; display name aligned |
| The Ultimate Bow | `OreSpawn_UltimateBow`, display name `The Ultimate Bow` | Ported |
| The Skate String Bow | `OreSpawn_SkateBow`, display name `Skate String Bow` | Ported |
| Attitude Adjuster | `OreSpawn_Hammy`, display name `Attitude Adjuster` | Ported |
| Queen Battle Axe | `OreSpawn_QueenBattleAxe` | Ported as `queen_battle_axe`; display name aligned to `Queen Scale Battle Axe` |
| Ultimate Fishing Rod | `OreSpawn_UltimateFishingRod`, display name `The Ultimate Fishing Rod` | Ported |

### Ore Drops

| Wiki name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Amethyst | `OreSpawn_Amethyst` | Ported |
| Ruby | `OreSpawn_Ruby` | Ported |
| Titanium Nugget | `OreSpawn_TitaniumNugget` | Ported |
| Uranium Nugget | `OreSpawn_UraniumNugget` | Ported |

### Misc Items

| Wiki name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Ancient Dried Ore Spawn Egg | Implemented in legacy as many individual dried spawn blocks plus matching egg items | Pending modern design pass |
| Ant Nest | `MyAntBlock`, display name `Ant Nest` | Pending block port |
| Big Bertha Handle | `OreSpawn_BerthaHandle` | Ported |
| Big Bertha Guard | `OreSpawn_BerthaGuard` | Ported |
| Big Bertha Blade | `OreSpawn_BerthaBlade` | Ported |
| Peacock Feather | `OreSpawn_PeacockFeather` | Ported |
| Lava Eel | `OreSpawn_LavaEel` | Ported |
| Moth Scale | `OreSpawn_MothScale` | Ported |
| Queen Scale | `OreSpawn_QueenScale` | Ported |
| Experience Armor | `OreSpawn_ExperienceHelmet`, `OreSpawn_ExperienceBody`, `OreSpawn_ExperienceLegs`, `OreSpawn_ExperienceBoots` | Ported |
| Moth Scale Armor | `OreSpawn_MothScaleHelmet`, `OreSpawn_MothScaleBody`, `OreSpawn_MothScaleLegs`, `OreSpawn_MothScaleBoots` | Ported |
| Lava Eel Armor | `OreSpawn_LavaEelHelmet`, `OreSpawn_LavaEelBody`, `OreSpawn_LavaEelLegs`, `OreSpawn_LavaEelBoots` | Ported |
| Peacock Feather Armor | `OreSpawn_PeacockFeatherHelmet`, `OreSpawn_PeacockFeatherBody`, `OreSpawn_PeacockFeatherLegs`, `OreSpawn_PeacockFeatherBoots` | Ported as `peacock_*` |
| Emerald Armor | `OreSpawn_EmeraldHelmet`, `OreSpawn_EmeraldBody`, `OreSpawn_EmeraldLegs`, `OreSpawn_EmeraldBoots` | Ported |
| Crystal Pink Armor | `OreSpawn_PinkHelmet`, `OreSpawn_PinkBody`, `OreSpawn_PinkLegs`, `OreSpawn_PinkBoots` | Ported as `crystal_pink_*` |
| Tiger's Eye Armor | `OreSpawn_TigersEyeHelmet`, `OreSpawn_TigersEyeBody`, `OreSpawn_TigersEyeLegs`, `OreSpawn_TigersEyeBoots` | Ported as `tigers_eye_*` |
| Ruby Armor | `OreSpawn_RubyHelmet`, `OreSpawn_RubyBody`, `OreSpawn_RubyLegs`, `OreSpawn_RubyBoots` | Ported |
| Amethyst Armor | `OreSpawn_AmethystHelmet`, `OreSpawn_AmethystBody`, `OreSpawn_AmethystLegs`, `OreSpawn_AmethystBoots` | Ported |
| Royal Guardian Armor | `OreSpawn_RoyalHelmet`, `OreSpawn_RoyalBody`, `OreSpawn_RoyalLegs`, `OreSpawn_RoyalBoots` | Ported |
| Queen Scale Armor | `OreSpawn_QueenHelmet`, `OreSpawn_QueenBody`, `OreSpawn_QueenLegs`, `OreSpawn_QueenBoots` | Ported |
| Ultimate Armor | `OreSpawn_UltimateHelmet`, `OreSpawn_UltimateBody`, `OreSpawn_UltimateLegs`, `OreSpawn_UltimateBoots` | Ported |

## Continuity Rules For Future Ports

1. Keep legacy registry intent from the 1.7.10 source, even if the modern registry id is normalized to lowercase snake_case.
2. Prefer legacy display names when they are explicit in the 1.7.10 source.
3. Use the wiki categories to group items in docs, creative tabs, and milestone planning so the modern port still feels like OreSpawn to players.
4. When the wiki and the 1.7.10 source disagree, note the difference in this file before implementing the item.
