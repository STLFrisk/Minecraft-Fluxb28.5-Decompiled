# NOTICE

This is a reverse-engineering **research project**. It documents the internals of a
third-party Minecraft client. Read this before you contribute or redistribute anything.

## 1. Repository contents

| path | contents |
|---|---|
| `reference/decompiled-bypassed-named/`, `reference/decompiled-bypassed-vineflower/`, `reference/decompiled-bypassed-cfr/` | decompiled source of the patched client |
| `decompiled/` | decompiled output for the bundled IRC library and the runtime probes |
| `releases/Flux_login_bypassed.jar` | the patched client build |
| `docs/`, `mappings/`, `patches/`, `evidence/` | analysis: reports, symbol mappings, patch records, raw findings |
| `tools/`, `scripts/` | the toolchain that produced the above |

The original unmodified sample and all build intermediates are kept out of version
control; `scripts/bootstrap.ps1` regenerates what is needed from a copy of the target
that *you* supply.

## 2. The analysed target is not ours

| component | owner |
|---|---|
| `Flux.jar` (Minecraft 1.8 client, ZKM 12.0.4) | the Flux authors |
| `libsoter.dll` (`META-INF/Soter`, 50,531,856 B) | the Flux authors |
| `irc-1.3.jar` | the Flux authors |
| `net.minecraft.*`, `net.optifine.*`, LWJGL, authlib | Mojang / OptiFine / their authors |
| bundled Minecraft libraries | Mojang |

None of the above is licensed to this project. The MIT license in `LICENSE` covers the
project's own tooling and documentation and does not extend to any of it.

Decompiled output is a derivative work and carries the rights of the parties above,
wherever it is stored. `releases/Flux_login_bypassed.jar` is a modified copy of the
target, provided for local, offline, self-owned analysis only.

`evidence/*.javap.txt` quotes short disassembly of the specific patched methods — enough
to verify each finding, limited to the few hundred bytes it is about.

## 3. Intent and authorized scope

The work was performed on an artefact supplied by, and stated to be authored by, the
person who requested the analysis, on their own machine. It covers:

* the **authentication and licensing mechanism** of the client, and
* a **local bypass of its client-side login gate**.

It deliberately does **not** cover:

* any server-side enforcement;
* attacking, probing, or even contacting `flux.today`, `killaura.cn`, `xinchen.space`
  or any other endpoint named in the analysis. Every endpoint in `mappings/` and
  `docs/` was recovered **statically from the binary**; no request was ever made to any
  of them.

The only outbound network activity in the whole session was downloading 29 public
Minecraft dependency JARs from Maven Central and `libraries.minecraft.net`, so that the
obfuscated classes could be linked and their string tables decrypted.

## 4. What the bypass does and does not do

The patched build skips the client's **local** login screen. It does not grant a Flux
account, does not forge a server session, and does not defeat any server-side check —
the IRC login and HWID validation happen in the packed native module and on the server,
and the vendor's authentication server is no longer reachable. Anyone reading this
expecting a working account will be disappointed.

## 5. If you are a rights holder

If you own the target and want material here removed, open an issue. Analysis notes,
tooling and mappings can stay; any derived artefact can be removed or replaced by
reproduction instructions.
