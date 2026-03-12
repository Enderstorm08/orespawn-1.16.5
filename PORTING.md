# OreSpawn 1.16.5 Port Notes

This workspace started with only the legacy `Orespawn-1.7.10-20.0.jar`, so the first step of the port was rebuilding a workable source baseline around it. The recovered legacy references now live inside this repository.

## Recovered Baseline

- `legacy-jar`: extracted contents of the 1.7.10 JAR for asset lookup
- `legacy-src`: CFR decompilation of the full legacy codebase for reference while porting
- `Orespawn-1.7.10-20.0.jar.src`: extracted legacy source tree used as the highest-priority source reference
- `Orespawn-1.7.10-20.0.jar`: original legacy JAR preserved in-repo
- repository root: Forge 1.16.5 workspace used for the actual port

## Legacy Inventory

- 596 legacy classes under `danger.orespawn`
- 211 legacy `GameRegistry.registerBlock(...)` registrations
- 471 legacy `GameRegistry.registerItem(...)` registrations
- 131 legacy `EntityRegistry.registerModEntity(...)` registrations
- 1,300+ bundled textures and sounds under `assets/orespawn`

## Ported In This Slice

- Replaced the MDK example mod with a real `danger.orespawn.OreSpawn` entrypoint
- Added DeferredRegister-based 1.16.5 registries for a first core materials-and-gear slice
- Ported the following blocks as modern registry entries:
  - `ore_uranium`
  - `block_uranium`
  - `ore_titanium`
  - `block_titanium`
  - `ore_ruby`
  - `block_ruby`
  - `ore_amethyst`
  - `block_amethyst`
  - `crystal_pink_block`
  - `tigers_eye_block`
- Ported the following standalone items:
  - `ingot_uranium`
  - `ingot_titanium`
  - `uranium_nugget`
  - `titanium_nugget`
  - `crystal_pink_ingot`
  - `tigers_eye_ingot`
  - `ruby`
  - `amethyst`
  - `moth_scale`
  - `lava_eel`
  - `peacock_feather`
  - `nightmare_scale`
  - `queen_scale`
  - `ruby_sword`
  - `amethyst_sword`
  - `ultimate_sword`
  - `nightmare_sword`
  - `bertha`
  - `ultimate_pickaxe`
  - `slice`
  - `royal_guardian_sword`
  - `attitude_adjuster`
  - `queen_battle_axe`
  - `ultimate_bow`
  - `skate_bow`
  - `ultimate_fishing_rod`
  - `emerald_sword`
  - `experience_sword`
  - `emerald_pickaxe`
  - `emerald_axe`
  - `emerald_shovel`
  - `emerald_hoe`
  - `crystal_wood_sword`
  - `crystal_wood_pickaxe`
  - `crystal_wood_axe`
  - `crystal_wood_shovel`
  - `crystal_wood_hoe`
  - `crystal_stone_sword`
  - `crystal_stone_pickaxe`
  - `crystal_stone_axe`
  - `crystal_stone_shovel`
  - `crystal_stone_hoe`
  - `crystal_pink_sword`
  - `crystal_pink_pickaxe`
  - `crystal_pink_axe`
  - `crystal_pink_shovel`
  - `crystal_pink_hoe`
  - `tigers_eye_sword`
  - `tigers_eye_pickaxe`
  - `tigers_eye_axe`
  - `tigers_eye_shovel`
  - `tigers_eye_hoe`
  - `ruby_pickaxe`
  - `ruby_axe`
  - `ruby_shovel`
  - `ruby_hoe`
  - `amethyst_pickaxe`
  - `amethyst_axe`
  - `amethyst_shovel`
  - `amethyst_hoe`
- Ported the following armor set:
  - `experience_helmet`
  - `experience_chestplate`
  - `experience_leggings`
  - `experience_boots`
- Ported the following armor set:
  - `moth_scale_helmet`
  - `moth_scale_chestplate`
  - `moth_scale_leggings`
  - `moth_scale_boots`
- Ported the following armor set:
  - `lava_eel_helmet`
  - `lava_eel_chestplate`
  - `lava_eel_leggings`
  - `lava_eel_boots`
- Ported the following armor set:
  - `peacock_helmet`
  - `peacock_chestplate`
  - `peacock_leggings`
  - `peacock_boots`
- Ported the following armor set:
  - `emerald_helmet`
  - `emerald_chestplate`
  - `emerald_leggings`
  - `emerald_boots`
- Ported the following armor set:
  - `crystal_pink_helmet`
  - `crystal_pink_chestplate`
  - `crystal_pink_leggings`
  - `crystal_pink_boots`
- Ported the following armor set:
  - `tigers_eye_helmet`
  - `tigers_eye_chestplate`
  - `tigers_eye_leggings`
  - `tigers_eye_boots`
- Ported the following armor set:
  - `ruby_helmet`
  - `ruby_chestplate`
  - `ruby_leggings`
  - `ruby_boots`
- Ported the following armor set:
  - `amethyst_helmet`
  - `amethyst_chestplate`
  - `amethyst_leggings`
  - `amethyst_boots`
- Ported the following armor set:
  - `royal_guardian_helmet`
  - `royal_guardian_chestplate`
  - `royal_guardian_leggings`
  - `royal_guardian_boots`
- Ported the following armor set:
  - `queen_scale_helmet`
  - `queen_scale_chestplate`
  - `queen_scale_leggings`
  - `queen_scale_boots`
- Ported the following armor set:
  - `ultimate_helmet`
  - `ultimate_chestplate`
  - `ultimate_leggings`
  - `ultimate_boots`
- Registered a small modern sound baseline over the recovered legacy sound assets:
  - `chainsaw`
  - `chainsawshort`
  - `big_splat`
  - `roar`
  - `hover`

## Next Migration Slices

1. Generate 1.16.5 blockstates/models/lang coverage for the remaining block and item registries.
2. Port the old spawn-block system into either proper spawn eggs, blocks with block-entity data, or both.
3. Migrate entities in vertical slices, starting with simple passive mobs before bosses and multipart entities.
4. Rebuild worldgen and dimensions around 1.16.5 biome loading, configured features, and `RegistryKey<World>`.
5. Port GUIs, containers, networking, and client renderers using modern screen/container/entity renderer APIs.
