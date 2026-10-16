#!/usr/bin/env python3
"""Flux: let the config actually load, and stop szk.gqz from erasing it.

Two facts about szk.gqz(ccn), the per-tick bus handler:

    if (yt8 == 0 && !zwr.bxb.d7c()) {
        t8a(null); ux_(null); kvr();          // clear the active config   (A)
    }
    if (yt8 != 0 && !zwr.bxb.d7c()) {
        t8a(yn6.w40()); ux_(yn6.w40()); kvr();// reload                    (B)
    }
    yt8 = zwr.bxb.d7c();

and one about szk._k4(), the loader:

    ux_(zwr.bxb.d7c() ? "" : yn6.w40());      // (C)

A previous patch (P21) set zwr.bxb = true to stop branch (A) from clearing the
config name every tick.  That worked - but (C) then selected the EMPTY string, so
_k4 asked for `Flux/prs-.txt`, which does not exist, and loaded nothing.  The
diagnostic output showed exactly that combination:

    FLUX-DIAG cfg name:  hypixel_best_config     <- yn6.w40() is fine
    FLUX-DIAG zwr.bxb.d7c():  true               <- and this made _k4 ignore it

The fix keeps zwr.bxb at its real default (false, so (C) uses the config name) and
disables branch (A) directly.  Its two calls occupy exactly ten bytes in
szk.gqz:

    52: 2a 01 b7 00 66   aload_0; aconst_null; invokespecial szk.t8a(String)
    57: 2a 01 b6 00 69   aload_0; aconst_null; invokevirtual  szk.ux_(String)

Both are balanced (push this, push null, consume), so replacing them with nops
leaves the operand stack unchanged and moves no offset.  `kvr()` at 62 is left
alone - it only re-reads the global config.

Usage: patch_gqz.py <in/zwr.class> <out/zwr.class> <in/szk.class> <out/szk.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

CLEAR = bytes.fromhex('2a 01 b7 00 66 2a 01 b6 00 69')      # szk.gqz @52..61
BXB_TRUE = 0x04
BXB_FALSE = 0x03


def nop_clear(src, dst):
    blob = bytearray(io.open(src, 'rb').read())
    for mn, md, cfo, code, mp in patch_login.code_arrays(bytes(blob)):
        if mn != 'gqz':
            continue
        at = code.find(CLEAR)
        if at < 0:
            raise SystemExit('FAIL-CLOSED: clear idiom %s not found in szk.gqz'
                             % CLEAR.hex(' '))
        if code.find(CLEAR, at + 1) >= 0:
            raise SystemExit('FAIL-CLOSED: clear idiom appears more than once')
        for i in range(len(CLEAR)):
            blob[cfo + at + i] = 0x00
        io.open(dst, 'wb').write(bytes(blob))
        print('  szk.gqz @%d..%d : 10 字节配置清空代码 -> nop' % (at, at + len(CLEAR) - 1))
        return
    raise SystemExit('FAIL-CLOSED: szk.gqz not found')


def restore_bxb(src, dst):
    """Put zwr.bxb back to false.

    The initialiser is not adjacent to the putstatic: the sequence is
    `iconst_1 ; invokestatic Boolean.valueOf ; invokespecial cn7.<init> ;
    putstatic zwr.bxb`, so walk back over the three preceding instructions.
    """
    blob = bytearray(io.open(src, 'rb').read())
    for mn, md, cfo, code, mp in patch_login.code_arrays(bytes(blob)):
        if mn != '<clinit>':
            continue
        ins = list(callscan.decode_instructions(code))
        for i, (off, op, ops, ln) in enumerate(ins):
            if op != 0xB3:
                continue
            if (callscan.ref_name(mp, struct.unpack_from('>H', ops, 0)[0])
                    or '') != 'zwr.bxb':
                continue
            init = None
            for j in range(i - 1, max(-1, i - 6), -1):
                o2, op2, ops2, _ = ins[j]
                r = callscan.ref_name(mp, struct.unpack_from('>H', ops2, 0)[0]) \
                    if op2 in (0xB6, 0xB7, 0xB8, 0xB9) else ''
                if op2 == 0xB8 and r == 'java.lang.Boolean.valueOf':
                    if j - 1 >= 0 and ins[j - 1][1] in (0x03, 0x04):
                        init = ins[j - 1]
                    break
            if init is None:
                raise SystemExit('FAIL-CLOSED: could not locate the zwr.bxb initialiser')
            if init[1] == 0x03:
                print('  zwr.<clinit>@%d 已经是 iconst_0 [zwr.bxb = false]，无需改动' % init[0])
            else:
                blob[cfo + init[0]] = BXB_FALSE
                print('  zwr.<clinit>@%d : 04 -> 03  [zwr.bxb = false]' % init[0])
            io.open(dst, 'wb').write(bytes(blob))
            return
    raise SystemExit('FAIL-CLOSED: zwr.bxb initialiser not located')


if __name__ == '__main__':
    if len(sys.argv) != 5:
        raise SystemExit(__doc__.strip().splitlines()[-1])
    restore_bxb(sys.argv[1], sys.argv[2])
    nop_clear(sys.argv[3], sys.argv[4])
    print('  效果: _k4 使用真实配置名; gqz 不再每 tick 清空')
