#!/usr/bin/env python3
"""Flux: register the KillAura engine (xbs) with the event bus.

Why KillAura never attacks
--------------------------
fyk (KillAura) registers three handlers - k27(fha), ohn(ccn), __1(axn) - and
k27 is the one that matters: it walks c05.tij.guf (74 live entities) and, for each
one, gets or creates a per-entity filter and calls filter.cag(...), which is only
the TargetHUD renderer.

The entity that actually becomes the target is stored in the static fyk.kfa by

    xbs.nf1(fz2)          1584 bytes

and xbs is the aura engine:

    public class xbs extends j1s {        <-- NOT an ar7
        public static java.util.List lo6;
        public static java.util.List mrm;
        public native float[] a3o(i2h);
        public void nf1(fz2); public void x9y(); public void u57(); public void rxj(axn);
    }

Module registration lives in ar7.ron(), which every ar7 module reaches through
tp_/z5z/dv9.  xbs is not an ar7, so nothing ever calls

    mtl.__x(this)

for it.  A live probe confirmed the consequence:

    HOOK fyk event=fha method=k27(fha)     <- registered
    (no HOOK xbs lines at all)             <- never registered
    xbs.lo6 = List size=0                  <- so no target is ever selected
    fyk.kfa = null

Patch
-----
Append `aload_0 ; invokestatic mtl.__x` before the final return of xbs.<init>(Z).
mtl.__x is static, so no instance is needed, and fyk.<init> constructs two xbs
engines, so both register.  Appending before the terminal return adds no branch
target, shifts no offset and needs no stack map frame.

Usage: patch_xbs_register.py <in/xbs.class> <out/xbs.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
import patch_autoload
from patch_qih import Pool

BRANCH_TARGETS = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
                  0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6)


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    added = []
    # reuse the proven reference builder: it keeps `count` in step with every
    # Utf8/Class/NameAndType it appends, which is where a hand-rolled version
    # silently corrupts the pool.
    pb, count, px, note = patch_autoload.build_ref(
        pb, pool, count, 'mtl', '__x', '(Ljava/lang/Object;)V', 10)
    if note:
        added.append(note)

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    done = []
    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn != '<init>':
            continue
        if code[-1] != 0xB1:
            raise SystemExit('FAIL-CLOSED: xbs.<init>%s does not end with return' % md)
        for off, op, ops, ln in callscan.decode_instructions(code):
            if op in BRANCH_TARGETS and off + struct.unpack_from('>h', ops, 0)[0] >= len(code) - 1:
                raise SystemExit('FAIL-CLOSED: a branch in xbs.<init>%s jumps to the return' % md)
        inject = bytes([0x2A, 0xB8]) + struct.pack('>H', px)
        at = cfo + len(code) - 1
        buf = bytearray(new)
        attr = struct.unpack_from('>I', new, cfo - 12)[0]
        struct.pack_into('>I', buf, cfo - 12, attr + len(inject))
        struct.pack_into('>I', buf, cfo - 4, len(code) + len(inject))
        new = bytes(bytearray(buf[:at]) + bytearray(inject) + bytearray(buf[at:]))
        done.append('%s%s: %d -> %d bytes' % (mn, md, len(code), len(code) + len(inject)))

    if not done:
        raise SystemExit('FAIL-CLOSED: xbs.<init> not found')
    io.open(dst, 'wb').write(new)
    for d in done:
        print('  xbs.' + d + '  (+ aload_0; invokestatic mtl.__x)')
    for a in added:
        print('  pool: %s' % a)
    print('  效果: 两个 xbs 引擎实例都会注册进事件总线, nf1(fz2) 才会被调用')


if __name__ == '__main__':
    main()
