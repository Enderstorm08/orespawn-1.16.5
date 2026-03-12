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
  - `crystal_pink_ingot`
  - `tigers_eye_ingot`
  - `ruby`
  - `amethyst`
  - `nightmare_scale`
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
