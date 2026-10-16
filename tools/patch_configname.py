#!/usr/bin/env python3
"""Flux: supply the config name when the native session object is missing.

Evidence chain
--------------
`szk._k4()` is the config loader:

    void _k4() {
        if (c05.vz1().tij == null) return;
        ux_(zwr.bxb.d7c() ? "" : yn6.w40());     // <-- the config name
        bxh(); kvr(); ece(); ss8(); ax1(); j02(); mw6(); tev();
    }

A log4j probe on `szk.<init>` printed, in the live game:

    FLUX-DIAG: szk.<init> reached
    kh3@6ca61940                 <- c05.tij present, the guard passed
    FLUX-DIAG cfg name:
    null                         <- yn6.w40() returned null
    FLUX-DIAG zwr.bxb.d7c():
    false                        <- so _k4 did take the yn6.w40() branch

`yn6.w40()` is

    static String w40() {
        if (c05.vz1().fcm() == null) return null;      // <-- taken
        return c05.vz1().fcm().s4c.toLowerCase();
    }

and `c05.fcm()` is `{ return this.ezu; }` where `c05.ezu : r1l` is the account /
session object.  `r1l.<init>` has ZERO Java call sites in all 3,394 classes, so
that object is produced by the native layer at login.  With the auth server gone
it is never built, `c05.ezu` stays null, the config name is null, and every module
setting stays at its default - which is why the feature handlers that do run fall
straight through and the client looks inert.

The config itself is present on disk:

    versions/Flux/flux/lastConfig                 -> "hypixel_best_config"
    versions/Flux/flux/prs-hypixel_best_config.txt        (9,010 bytes)

Patch
-----
The null path in `yn6.w40()` is exactly four bytes:

    24: aconst_null                      (0x01)
    25: goto 44                          (0xa7 0x00 0x13)

and `ldc_w <constant> ; areturn` is also exactly four bytes, so the substitution
is completely in place - no offset, branch, exception range or stack map frame
moves.  Offset 24 is a branch target (`17: goto 24`) and remains the entry point
of the new code, and no branch targets 25..27.

Usage: patch_configname.py <in/yn6.class> <out/yn6.class> [config-name]
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_ref, append_utf8

DEFAULT_NAME = 'hypixel_best_config'
WANT = bytes.fromhex('01 a7 00 13')          # aconst_null ; goto +19
BRANCHES = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
            0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xC8, 0xC9)


def main():
    src, dst = sys.argv[1], sys.argv[2]
    name = sys.argv[3] if len(sys.argv) > 3 else DEFAULT_NAME
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)

    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
        if mn == 'w40' and md == '()Ljava/lang/String;':
            hit = (cfo, code, mp)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: yn6.w40()Ljava/lang/String; not found')
    cfo, code, mp = hit

    at = code.find(WANT)
    if at < 0:
        raise SystemExit('FAIL-CLOSED: null-return idiom %s not found in w40'
                         % WANT.hex(' '))
    if code.find(WANT, at + 1) >= 0:
        raise SystemExit('FAIL-CLOSED: the idiom appears more than once')
    if at != 24:
        print('   note: idiom found at %d (expected 24)' % at)

    # nothing may land inside the two bytes we are about to overwrite
    for off, op, ops, ln in callscan.decode_instructions(code):
        if op in BRANCHES:
            tgt = off + struct.unpack_from('>h', ops, 0)[0]
            if at + 1 <= tgt <= at + 3:
                raise SystemExit('FAIL-CLOSED: branch at %d targets %d inside patch'
                                 % (off, tgt))

    # append Utf8 + String for the config name
    count = pool.count
    pb = blob[:pool.end]
    tail = blob[pool.end:]
    added = []
    str_idx = None
    for i, (tag, val) in pool.entries.items():
        if tag == 8 and pool.utf8.get(val) == name:
            str_idx = i
    if str_idx is None:
        pb, _ = append_utf8(pb, name)
        utf = count
        count += 1
        pb += bytes([8]) + struct.pack('>H', utf)
        str_idx = count
        count += 1
        added.append('Utf8 "%s" = #%d, String = #%d' % (name, utf, str_idx))

    new = bytearray(pb) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    # re-locate after the pool grew
    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn == 'w40' and md == '()Ljava/lang/String;':
            hit = (cfo, code, mp)
            break
    cfo, code, mp = hit
    at = code.find(WANT)
    if at < 0:
        raise SystemExit('FAIL-CLOSED: idiom lost after pool append')
    if str_idx > 0xFFFF:
        raise SystemExit('FAIL-CLOSED: string index out of range')

    before = code[at:at + 4]
    out = bytearray(new)
    out[cfo + at] = 0x13                                   # ldc_w
    struct.pack_into('>H', out, cfo + at + 1, str_idx)
    out[cfo + at + 3] = 0xB0                               # areturn

    io.open(dst, 'wb').write(bytes(out))
    print('yn6.w40(): %s  ->  %s     (config name = "%s")'
          % (before.hex(' '), bytes(out[cfo + at:cfo + at + 4]).hex(' '), name))
    print('   the null branch now yields the config name instead of null')
    if added:
        print('   appended to pool: %s' % added)


if __name__ == '__main__':
    main()
