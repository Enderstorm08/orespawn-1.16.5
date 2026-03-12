# OreSpawn Item Continuity

This file keeps the 1.16.5 port aligned with the player-facing OreSpawn item taxonomy from the community OreSpawn wiki and the exact item registrations in the recovered 1.7.10 source.

Reference sources:
- Community-facing item categories and names: <https://minecraft-mods.fandom.com/wiki/OreSpawn#Items>
- Exact 1.7.10 registration names and display names: `F:\CODEX\P10\legacy-src\danger\orespawn\OreSpawnMain.java`

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
| Royal Guardian Sword | `OreSpawn_Royal`, display name `Royal Guardian Sword` | Pending |
| Ruby Sword | `OreSpawn_RubySword` | Ported |
| The Slice | `OreSpawn_Slice`, display name `Slice` | Pending |
| The Ultimate Sword | `OreSpawn_UltimateSword`, display name `The Ultimate Sword` | Ported; display name aligned |
| The Ultimate Bow | `OreSpawn_UltimateBow`, display name `The Ultimate Bow` | Pending |
| The Skate String Bow | `OreSpawn_SkateBow`, display name `Skate String Bow` | Pending |
| Attitude Adjuster | `OreSpawn_Hammy`, display name `Attitude Adjuster` | Pending |
| Queen Battle Axe | `OreSpawn_QueenBattleAxe` | Pending |
| Ultimate Fishing Rod | `OreSpawn_UltimateFishingRod`, display name `The Ultimate Fishing Rod` | Pending |

### Ore Drops

| Wiki name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Amethyst | `OreSpawn_Amethyst` | Ported |
| Ruby | `OreSpawn_Ruby` | Ported |
| Titanium Nugget | `OreSpawn_TitaniumNugget` | Pending |
| Uranium Nugget | `OreSpawn_UraniumNugget` | Pending |

### Misc Items

| Wiki name | Legacy 1.7.10 evidence | Current 1.16.5 state |
| --- | --- | --- |
| Ancient Dried Ore Spawn Egg | Implemented in legacy as many individual dried spawn blocks plus matching egg items | Pending modern design pass |
| Ant Nest | `MyAntBlock`, display name `Ant Nest` | Pending block port |
| Big Bertha Handle | `OreSpawn_BerthaHandle` | Ported |
| Big Bertha Guard | `OreSpawn_BerthaGuard` | Ported |
| Big Bertha Blade | `OreSpawn_BerthaBlade` | Ported |

## Continuity Rules For Future Ports

1. Keep legacy registry intent from the 1.7.10 source, even if the modern registry id is normalized to lowercase snake_case.
2. Prefer legacy display names when they are explicit in the 1.7.10 source.
3. Use the wiki categories to group items in docs, creative tabs, and milestone planning so the modern port still feels like OreSpawn to players.
4. When the wiki and the 1.7.10 source disagree, note the difference in this file before implementing the item.
