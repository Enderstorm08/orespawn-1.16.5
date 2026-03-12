# OreSpawn Continuity Agent Guide

This file is the project-level continuity guide for any agent working in this `1.16.5` OreSpawn port.

## Mission

Preserve OreSpawn identity while porting from `1.7.10` to `1.16.5`.

Do not treat this as a generic Forge mod. The goal is not just feature parity; it is player-facing continuity in:

- names
- visuals
- weapon feel
- iconic item scale
- category structure
- expected drops/crafting parts

## Source Priority

Use sources in this order:

1. `Orespawn-1.7.10-20.0.jar.src/danger/orespawn/OreSpawnMain.java`
2. other extracted legacy classes in `Orespawn-1.7.10-20.0.jar.src/danger/orespawn`
3. `legacy-src/danger/orespawn/OreSpawnMain.java`
4. other decompiled legacy classes in `legacy-src/danger/orespawn`
5. `ITEM_CONTINUITY.md`
6. community-facing OreSpawn wiki pages for naming/category continuity

Interpretation rule:

- The extracted `1.7.10` source in `Orespawn-1.7.10-20.0.jar.src` is the primary authority for what actually existed.
- The decompiled fallback in `legacy-src` is still useful for cross-checking renderer behavior or recovering files that are clearer in CFR output.
- The community wiki is the authority for how players commonly remember and group iconic content.
- If those differ, preserve original behavior/registry intent first, then document the naming/category decision in `ITEM_CONTINUITY.md`.

## Required Reading Before Changes

Before touching any iconic item, weapon, block, mob, or UI element, read:

- `ITEM_CONTINUITY.md`
- `PORTING.md`

If the change involves any iconic oversized weapon, also inspect the relevant legacy renderer and item class in `legacy-src`.

## Continuity Rules

1. Keep legacy identity even when modern registry ids are normalized.
   Example: internal id can stay `bertha`, but display name should stay `Big Bertha`.

2. Preserve explicit legacy display names.
   If `OreSpawnMain.java` or legacy language registration gives a name, prefer that name.

3. Iconic OreSpawn weapons are not normal vanilla-scale items.
   If a legacy item had a dedicated renderer/model, do not accept a plain default handheld presentation as "done".

4. Iconic weapon continuity means more than a texture.
   Each should remain visually oversized, extremely durable, and mechanically exceptional.

5. Do not silently flatten iconic weapons into normal balance.
   If a legacy stat or behavior is intentionally reduced for technical reasons, document the gap in `ITEM_CONTINUITY.md`.

6. Keep category continuity.
   Use the same recognizable groupings players expect from OreSpawn:
   - Weapons and Tools
   - Ore Drops
   - Misc Items
   - Ancient Dried spawn content
   - Ant nests / teleporting ant blocks

7. When porting partial slices, prefer complete continuity for a small set over shallow stubs for a large set.

## Visual Rules

For visual tuning:

- Validate both first-person and third-person item presentation.
- Do not assume one screenshot explains both; ask or infer carefully from context.
- If JSON transforms cannot preserve the old feel, move to a custom renderer rather than accepting a bad approximation.

## Oversized Weapon Display Transforms

Any weapon intended to appear oversized uses the following confirmed working display transforms in its item model JSON:

```json
"thirdperson_righthand": {
  "rotation": [0, -90, 55],
  "translation": [0, 3.5, 2.0],
  "scale": [1.75, 1.75, 1.75]
},
"thirdperson_lefthand": {
  "rotation": [0, 90, -55],
  "translation": [0, 3.5, 2.0],
  "scale": [1.75, 1.75, 1.75]
},
"firstperson_righthand": {
  "rotation": [0, -90, 25],
  "translation": [1.13, 3.2, 1.13],
  "scale": [1.45, 1.45, 1.45]
},
"firstperson_lefthand": {
  "rotation": [0, 90, -25],
  "translation": [1.13, 3.2, 1.13],
  "scale": [1.45, 1.45, 1.45]
}
```

Key notes:
- Rotations mirror vanilla `item/handheld` exactly. **Do not deviate** — wrong values cause the blade to point sideways or flip upside-down.
- Scale is 1.75x third-person and 1.45x first-person to preserve the oversized feel.
- Z translation of `2.0` in third-person moves the handle forward into the player's grip; vanilla `0.5` leaves the handle too far back at this scale.
- The build must always be run from the **main repo root** (`C:\Codex\orespawn-1.16.5`), not a worktree — Gradle in worktrees may fail due to version mismatches. Changes in a worktree must be copied to the main repo before building.

## Documentation Rules

Whenever you add or change continuity-sensitive behavior:

- update `ITEM_CONTINUITY.md`
- note any deliberate deviations from legacy
- include the legacy class or wiki page that motivated the change

## Avoid

- renaming iconic items to cleaner modern names if the old name is part of OreSpawn identity
- replacing unique weapon behavior with generic vanilla behavior without documenting it
- declaring continuity "finished" after only matching textures
- using community wiki pages as the only source when the legacy code says otherwise

## Preferred Workflow

1. inspect legacy source
2. inspect current `1.16.5` implementation
3. compare against `ITEM_CONTINUITY.md`
4. implement
5. rebuild
6. update the test jar in the CurseForge instance if relevant
7. document what continuity improved and what is still missing
