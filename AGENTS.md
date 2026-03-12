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

1. `F:\CODEX\P10\Orespawn-1.7.10-20.0.jar.src\danger\orespawn\OreSpawnMain.java`
2. other extracted legacy classes in `F:\CODEX\P10\Orespawn-1.7.10-20.0.jar.src\danger\orespawn`
3. `F:\CODEX\P10\legacy-src\danger\orespawn\OreSpawnMain.java`
4. other decompiled legacy classes in `F:\CODEX\P10\legacy-src\danger\orespawn`
5. `F:\CODEX\P10\orespawn-1.16.5\ITEM_CONTINUITY.md`
6. community-facing OreSpawn wiki pages for naming/category continuity

Interpretation rule:

- The extracted `1.7.10` source in `Orespawn-1.7.10-20.0.jar.src` is the primary authority for what actually existed.
- The decompiled fallback in `legacy-src` is still useful for cross-checking renderer behavior or recovering files that are clearer in CFR output.
- The community wiki is the authority for how players commonly remember and group iconic content.
- If those differ, preserve original behavior/registry intent first, then document the naming/category decision in `ITEM_CONTINUITY.md`.

## Required Reading Before Changes

Before touching any iconic item, weapon, block, mob, or UI element, read:

- `F:\CODEX\P10\orespawn-1.16.5\ITEM_CONTINUITY.md`
- `F:\CODEX\P10\orespawn-1.16.5\PORTING.md`

If the change involves Big Bertha, Royal Guardian Sword, The Slice, Attitude Adjuster, Queen Battle Axe, Ultimate Bow, or Ultimate Fishing Rod, also inspect the relevant legacy renderer and item class in `legacy-src`.

## Continuity Rules

1. Keep legacy identity even when modern registry ids are normalized.
   Example: internal id can stay `bertha`, but display name should stay `Big Bertha`.

2. Preserve explicit legacy display names.
   If `OreSpawnMain.java` or legacy language registration gives a name, prefer that name.

3. Iconic OreSpawn weapons are not normal vanilla-scale items.
   If a legacy item had a dedicated renderer/model, do not accept a plain default handheld presentation as "done".

4. Big Bertha continuity means more than a texture.
   It should remain visually oversized, extremely durable, and mechanically exceptional.

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
