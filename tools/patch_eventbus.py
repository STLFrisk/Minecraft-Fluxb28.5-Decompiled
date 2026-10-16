#!/usr/bin/env python3
"""Flux: enable the Java event bus - the actual gate on every cheat feature.

Root cause
----------
`mtl` is a reflection-based event bus:

    mtl.__x(Object listener)        register: scan getDeclaredMethods, keep handlers
    mtl.a65(mtl$_2w w, vlc event)   invoke:   w.tss.invoke(w._5a, event)
    mtl.esg(vlc event)              dispatch: for each listener of event.getClass()
    mtl.mn9(Object listener)        unregister

and `c05.tur()` (the client tick) constructs `ccn` at its very first instructions and
hands it to the bus:

    c05.tur()V   8: new ccn
                12: invokespecial ccn.<init>()V
                15: astore 4
                20: aload 4
                22: invokestatic mtl.esg:(Lvlc;)Lvlc;      <-- dispatch
                25: pop

Two flags gate the whole mechanism, and BOTH are hard-coded to 0 with no other
writer anywhere in the 3,394 classes:

    u1p.<clinit>    0: iconst_0             // 0x03
                    1: putstatic u1p.jcs    // jcs = 0
                    4: return

        mtl.esg     4: getstatic u1p.jcs
                    8: ifeq 176              // jcs == 0 -> return null, dispatch NOTHING

    ar7.<clinit>  347: iconst_0             // 0x03
                  348: putstatic ar7.vlm    // vlm = 0

        ar7.ron()   4: getstatic vlm
                    8: ifeq 48
                   12: if_icmpne 33         // vlm != 1 -> skip registration
                   23: invokestatic mtl.__x:(Ljava/lang/Object;)V

So no listener is ever registered AND no event is ever dispatched: every module
handler (`fyk.ohn(ccn)`, `fyk.k27(fha)`, `fyk.__1(axn)`, ...) is unreachable, which
is exactly why all features are inert while the GUI, HUD and keybinds still work.

`u1p.jcs` has exactly ONE writer (that clinit) and ONE reader (`mtl.esg`); `ar7.vlm`
has exactly ONE writer (that clinit) and TWO readers (`ar7.ron`, `ar7.ne2`). Flipping
the initialisers to 1 enables the bus permanently.

Patch
-----
`u1p.<clinit>` byte 0 and `ar7.<clinit>` byte 347: `iconst_0` (0x03) -> `iconst_1` (0x04).
Two single-byte, in-place edits; no offset, branch, exception range or stack map frame
is touched.

Usage: patch_eventbus.py <dir-with-u1p-and-ar7> <out-dir>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_ref

TARGETS = [
    # (class,      method,     holder,      field,   expected opcode offset)
    ('u1p', '<clinit>', 'u1p', 'jcs', None),
    ('ar7', '<clinit>', 'ar7', 'vlm', None),
]


def locate(blob, holder, field):
    """Return (cfo, code, pool, putstatic_offset) for the clinit that stores `field`."""
    for mname, mdesc, cfo, code, mp in patch_login.code_arrays(blob):
        if mname != '<clinit>':
            continue
        for off, op, ops, ln in callscan.decode_instructions(code):
            if op != 0xB3:
                continue
            if (callscan.ref_name(mp, struct.unpack_from('>H', ops, 0)[0])
                    or '') == '%s.%s' % (holder, field):
                return cfo, code, mp, off
    return None


def main():
    src_dir, dst_dir = sys.argv[1], sys.argv[2]
    if not os.path.isdir(dst_dir):
        os.makedirs(dst_dir)

    report = []
    for cls, method, holder, field, _ in TARGETS:
        path = os.path.join(src_dir, cls + '.class')
        blob = io.open(path, 'rb').read()
        hit = locate(blob, holder, field)
        if hit is None:
            raise SystemExit('FAIL-CLOSED: no <clinit> stores %s.%s' % (holder, field))
        cfo, code, mp, put_off = hit

        # the instruction immediately before putstatic must be iconst_0
        prev = None
        for off, op, ops, ln in callscan.decode_instructions(code):
            if off == put_off:
                break
            prev = (off, op, ops, ln)
        if prev is None or prev[1] != 0x03:
            raise SystemExit('FAIL-CLOSED: %s.%s is not preceded by iconst_0 (got %s)'
                             % (holder, field,
                                '%02x' % prev[1] if prev else 'nothing'))

        out = bytearray(blob)
        out[cfo + prev[0]] = 0x04                       # iconst_0 -> iconst_1
        io.open(os.path.join(dst_dir, cls + '.class'), 'wb').write(bytes(out))
        report.append('%s.%s : iconst_0(0x03)@%d -> iconst_1(0x04)  [%s = 1]'
                      % (cls, method, prev[0], '%s.%s' % (holder, field)))

    print('the Java event bus is now enabled:')
    for r in report:
        print('   ' + r)
    print('   module handlers are reachable again and mtl.esg will dispatch')


if __name__ == '__main__':
    main()
