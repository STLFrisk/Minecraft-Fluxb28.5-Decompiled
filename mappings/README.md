# mappings/

Everything a contributor needs to turn `a07` into a name they can reason about.

> **实际执行的重命名**（哪一层、改了哪些名字、为什么有些名字不能全局改）见 [RENAME.md](RENAME.md)。
> 命名版源码树在 `reference/decompiled-bypassed-named/`，逐条替换记录在 `rename-map.tsv`。

| file | generated? | contents |
|---|---|---|
| `classes.yaml` | **hand-written** | Class identity claims with confidence + evidence. This is the knowledge base. |
| `class-index.tsv` | generated | All 3,394 classes: literal counts, referencing-class count, native-method count, a role hint. |
| `native.yaml` | generated | All 41 `ACC_NATIVE` methods across 17 classes, with Java-side callers. |
| `strings.tsv` | generated | All 14,315 decrypted literals (`class`, `method`, `code_offset`, text). |
| `strings-by-category.md` | generated | The interesting literals bucketed into endpoints / auth / vendors / UI labels / CJK. |

Regenerate the generated files with:

```powershell
python tools/gen_mappings.py <workdir> <workdir>/FluxClasses mappings
```

## `classes.yaml` schema

```yaml
- obf: qih                 # name as it appears in Flux.jar (default package)
  name: GuiFluxLogin       # proposed rename
  subsystem: auth          # see vocabulary below
  confidence: confirmed    # confirmed | strong | inferred
  stats: {literals: 19, interesting_literals: 17, referenced_by: 3, native_methods: 2}
  evidence: >-             # the specific, checkable reason for the claim
    ...
```

`confidence` is not decoration — it tells the next reader how much to trust the name
before they have re-derived it:

- **confirmed** — direct proof: an `extends` clause, an exact literal, a native flag, or a
  call site that leaves no other reading.
- **strong** — two or more independent signals agree.
- **inferred** — one weak signal. Treat as a hypothesis to falsify, not a fact.

`stats` values come from `class-index.tsv`; if you regenerate that file, refresh the
numbers here too. `interesting_literals` excludes i18n-style resource keys
(`gui.done`, `item.swordIron.name`), which are inherited from Minecraft and say nothing
about the class.

## Subsystem vocabulary

`obfuscation`, `core`, `ui`, `auth`, `network`, `crypto`, `anti-tamper`, `config`,
`render`, `util`.

Keep this list short. If a class genuinely needs a new bucket, add it here first so the
next contributor does not invent a synonym.

## How to map a class

1. Look it up in `class-index.tsv` and read the `hint` column.
2. `python tools/search_strings.py <workdir>/plain2/strings_plain.tsv <needle>`
   to see every literal that class owns.
3. Decompile just that class:
   `java -jar tools/cfr.jar --extraclasspath <jars> --outputdir out <workdir>/FluxClasses/<cls>.class`
4. Cross-check relations in `class-index.tsv` (`referenced_by`) — a class called by
   OptiFine's `net.optifine.*` classes is usually render/world plumbing, not Flux logic.
5. Add the entry with the evidence that convinced you, and set `confidence` honestly.

## Known-unmapped queue

Ranked by referencing-class count in `class-index.tsv`:

| class | referenced_by | working hypothesis |
|---|---|---|
| `mew` | 556 | world/entity plumbing |
| `zfz` | 424 | ? |
| `ox_` | 373 | ? |
| `i2h` | 350 | registry-like (`id` literals) |
| `vt2` | 338 | enum-like (`UP` literal) |
| `ha9` | 300 | ? |
| `p3y` | 257 | ? |
| `u7m` | 235 | item/block table |
| `gdz` | 225 | ? |
| `hzu` | 224 | render (`", tex: "`) |
| `xbr` | 197 | ? |
| `g_3` | 187 | AI/goal (`ai`) |
| `bdo` | 187 | NBT (`NBT Tag`) |
| `l86` | 160 | block ids (`minecraft:chest`) |

Do not guess these into `classes.yaml`. An entry with `confidence: inferred` and one
literal is worse than no entry, because it costs the next reader time to disprove.
