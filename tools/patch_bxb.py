#!/usr/bin/env python3
"""Flux: stop szk.gqz() from wiping the config name on every tick.

`szk.gqz(ccn)` is a @jev handler dispatched from the event bus on every client
tick.  Its body is

    if (yt8 == 0 && !zwr.bxb.d7c()) {
        t8a(null); ux_(null); kvr();          // reset to "no config"
    }
    if (yt8 != 0 && !zwr.bxb.d7c()) {
        t8a(yn6.w40()); ux_(yn6.w40()); kvr(); // reload
    }
    yt8 = zwr.bxb.d7c();

`zwr.bxb` defaults to false, so `yt8` is written back as 0 on every pass, the
first branch is taken every tick, and `ux_(null)` clears the config name that
`_k4` had just loaded.  Nothing a module setting holds survives, keybinds fall
back to their defaults, and every feature stays inert.

`zwr.bxb` has exactly one reader - `szk.gqz` (three sites) - so flipping its
initialiser changes nothing else.  With it true the guard at `42: ifne 77`
short-circuits, `yt8` is set to 1 once, and from then on the reset branch is
never reached while `_k4`'s load is left intact.

The initialiser is a single `iconst_0` in `zwr.<clinit>`:

    934: iconst_0                       (0x03)
    935: invokestatic Boolean.valueOf
    938: invokespecial cn7.<init>
    941: putstatic zwr.bxb

Usage: patch_bxb.py <in/zwr.class> <out/zwr.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

FIELD = 'zwr.bxb'


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()

    for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
        if mname != '<clinit>':
            continue
        insns = list(callscan.decode_instructions(code))
        for i, (off, op, ops, ln) in enumerate(insns):
            if op != 0xB3:
                continue
            if (callscan.ref_name(pool, struct.unpack_from('>H', ops, 0)[0])
                    or '') != FIELD:
                continue
            # walk back over  invokespecial cn7.<init> / Boolean.valueOf / iconst_0
            back = []
            j = i - 1
            while j >= 0 and len(back) < 6:
                back.append(insns[j])
                j -= 1
            names = []
            for o2, op2, ops2, ln2 in back:
                r = callscan.ref_name(pool, struct.unpack_from('>H', ops2, 0)[0]) \
                    if op2 in (0xB6, 0xB7, 0xB8, 0xB9) else ''
                names.append((o2, op2, r or ''))

            init = None
            for k, (o2, op2, r) in enumerate(names):
                if op2 == 0xB8 and r == 'java.lang.Boolean.valueOf':
                    if k + 1 < len(names) and names[k + 1][1] == 0x03:
                        init = names[k + 1][0]
                    break
            if init is None:
                raise SystemExit('FAIL-CLOSED: could not find the iconst_0 feeding '
                                 '%s (backtrace: %s)' % (FIELD, names[:4]))

            out = bytearray(blob)
            out[cfo + init] = 0x04                    # iconst_0 -> iconst_1
            io.open(dst, 'wb').write(bytes(out))
            print('zwr.<clinit>@%d: iconst_0(0x03) -> iconst_1(0x04)   [%s = true]'
                  % (init, FIELD))
            print('   szk.gqz no longer clears the config name each tick')
            return

    raise SystemExit('FAIL-CLOSED: no <clinit> writes %s' % FIELD)


if __name__ == '__main__':
    main()
