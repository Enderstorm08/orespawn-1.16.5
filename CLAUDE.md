# CLAUDE.md

This file gives Claude-oriented guidance for working in this repository.

## Project

OreSpawn 1.16.5 is an unofficial work-in-progress port of the legacy OreSpawn mod from Minecraft 1.7.10 to Forge 1.16.5.

The goal is not just "make it compile." The goal is to preserve OreSpawn's identity while moving it onto modern Forge APIs.

## Core Rule

Preserve OreSpawn continuity first.

That includes:

- legacy display names
- iconic visuals
- oversized weapon feel
- recognizable item categories
- expected crafting parts and item relationships

Do not flatten OreSpawn into a generic Forge content pack.

## Source Priority

When deciding how something should behave, use sources in this order:

1. `Orespawn-1.7.10-20.0.jar.src/danger/orespawn/OreSpawnMain.java`
2. Other extracted legacy classes in `Orespawn-1.7.10-20.0.jar.src/danger/orespawn`
3. `legacy-src/danger/orespawn/OreSpawnMain.java`
4. Other decompiled legacy classes in `legacy-src/danger/orespawn`
5. `ITEM_CONTINUITY.md`
6. Community OreSpawn wiki pages for naming and category continuity

If sources disagree:

- preserve original registry intent and legacy behavior first
- preserve player-facing names second
- document any compromise in `ITEM_CONTINUITY.md`

## Read Before Changing Content

Before touching any important item, block, mob, renderer, or UI element, read:

- `README.md`
- `PORTING.md`
- `ITEM_CONTINUITY.md`
- `AGENTS.md`

If the change involves iconic weapons like Big Bertha, Royal Guardian Sword, Slice, Attitude Adjuster, Queen Battle Axe, Ultimate Bow, or Ultimate Fishing Rod, inspect the matching legacy item and renderer classes too.

## Current Repo Layout

- `src/main/java` - active 1.16.5 source
- `src/main/resources` - active assets, lang, models, blockstates, sounds, metadata
- `legacy-jar` - extracted 1.7.10 assets for lookup and recovery
- `legacy-src` - decompiled legacy source for behavior reference

## Porting Rules

1. Prefer small complete slices over broad shallow stubs.
2. Keep normalized modern registry ids, but preserve legacy display names.
3. If a weapon was iconic in 1.7.10, do not treat a default vanilla-style implementation as finished.
4. If a legacy behavior cannot be fully ported yet, leave the best practical approximation and document the gap.
5. Update docs whenever continuity-sensitive behavior changes.

## Resource Rules

For currently ported content:

- keep item models and textures aligned with modern registry-shaped names
- do not break existing legacy-named texture files that still support unfinished slices
- verify model texture paths after edits

## Iconic Weapon Display Transforms

Oversized weapons (Bertha, Slice, Royal Guardian Sword, Attitude Adjuster, Queen Battle Axe) use these confirmed working transforms:

```json
"thirdperson_righthand": { "rotation": [0, -90, 55], "translation": [0, 3.5, 2.0], "scale": [1.75, 1.75, 1.75] },
"thirdperson_lefthand":  { "rotation": [0, 90, -55], "translation": [0, 3.5, 2.0], "scale": [1.75, 1.75, 1.75] },
"firstperson_righthand": { "rotation": [0, -90, 25], "translation": [1.13, 3.2, 1.13], "scale": [1.45, 1.45, 1.45] },
"firstperson_lefthand":  { "rotation": [0, 90, -25], "translation": [1.13, 3.2, 1.13], "scale": [1.45, 1.45, 1.45] }
```

- Rotations match vanilla `item/handheld` exactly — deviating breaks the hold angle.
- Z=2.0 in third-person keeps the handle in the player's grip at 1.75x scale (vanilla Z=0.5 sits too far back).
- Always build from the main repo root, not a worktree.

## Build And Test

Build with:

```powershell
.\gradlew.bat build
```

Useful commands:

```powershell
.\gradlew.bat runClient
.\gradlew.bat processResources
```

Current local test instance:

- `C:\Users\Ender\curseforge\minecraft\Instances\Orespawningng`

When asked to install a test build, copy the latest jar from:

- `F:\CODEX\P10\orespawn-1.16.5\build\libs`

into:

- `C:\Users\Ender\curseforge\minecraft\Instances\Orespawningng\mods`

## Workflow

1. Inspect the legacy reference.
2. Inspect the current 1.16.5 implementation.
3. Implement a narrow vertical slice.
4. Update models, lang, and textures with the code.
5. Run `.\gradlew.bat build`.
6. Update `PORTING.md` and `ITEM_CONTINUITY.md` if continuity changed.
7. Copy the jar to the CurseForge instance when relevant.

## Avoid

- renaming iconic items just to make names cleaner
- using only the wiki when legacy source exists
- treating matching textures as equivalent to a finished port
- silently nerfing or normalizing signature OreSpawn weapons without documenting it
