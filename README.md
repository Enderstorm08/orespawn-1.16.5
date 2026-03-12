# OreSpawn 1.16.5 Port

Unofficial work-in-progress port of OreSpawn to Minecraft Forge 1.16.5.

This repository started from the legacy `Orespawn-1.7.10-20.0.jar` and is being rebuilt into a modern Forge project in small, verifiable slices.

## Current Status

The repo is in active porting, not feature-complete.

Implemented so far:

- Forge 1.16.5 project bootstrap
- Real `danger.orespawn.OreSpawn` mod entrypoint
- Deferred-register block and item setup
- First materials-and-gear slice
- Legacy texture recovery and normalization for the current ported content
- Small baseline sound event registry

Currently ported blocks:

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

Currently ported standalone items:

- `ingot_uranium`
- `ingot_titanium`
- `crystal_pink_ingot`
- `tigers_eye_ingot`
- `ruby`
- `amethyst`
- `nightmare_scale`
- `bertha_handle`
- `bertha_guard`
- `bertha_blade`
- `ruby_sword`
- `amethyst_sword`
- `ultimate_sword`
- `nightmare_sword`
- `bertha`
- `ultimate_pickaxe`

## Project Layout

- `src/main/java` - current 1.16.5 source
- `src/main/resources` - current 1.16.5 assets and data
- `legacy-jar` - extracted 1.7.10 JAR contents used for reference and asset recovery
- `legacy-src` - decompiled 1.7.10 source used for behavior lookup
- `PORTING.md` - porting notes and migration slices
- `ITEM_CONTINUITY.md` - naming and continuity notes for iconic OreSpawn content

## Requirements

- Java 8 toolchain for compilation
- Java 21 is also usable for running Gradle in this workspace

## Setup

Clone the repo and open the project root:

```powershell
git clone https://github.com/Enderstorm08/orespawn-1.16.5.git
cd orespawn-1.16.5
```

Generate IDE runs:

```powershell
.\gradlew.bat genIntellijRuns
.\gradlew.bat genEclipseRuns
```

Run the game client:

```powershell
.\gradlew.bat runClient
```

Build the mod jar:

```powershell
.\gradlew.bat build
```

## Porting Notes

This is not a direct drop-in reproduction of the 1.7.10 codebase. The goal is to preserve OreSpawn's identity while moving systems onto modern Forge patterns.

Near-term priorities:

1. Expand blockstates, models, language entries, and item coverage.
2. Port spawn blocks and entity workflows in modern 1.16.5 form.
3. Migrate entities in vertical slices, starting with simpler mobs.
4. Rebuild world generation, dimensions, and structure hooks.
5. Port GUIs, networking, and client renderers.

## Legal Note

OreSpawn is a legacy mod with its own original authorship and history. This repository is an unofficial fan port workspace and should be treated as a preservation and porting effort, not an official release from the original creators.
