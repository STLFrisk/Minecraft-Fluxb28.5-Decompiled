#!/usr/bin/env python3
"""Flux: complete the reconstruction of native `ar7.yse(boolean)` by calling `ron()`.

Why
---
The native method's real semantics are `iio = b; ron()`, which is visible in a
recorded crash stack:

    at ar7.asw
    at ar7.ron
    at fyk.ron
    at ar7.yse(Native Method)      <-- native calls back into ron()
    at fkf$afe.g71

Patch P13 took back the first half (`iio`) but not the second, and that is exactly
why the ClickGUI opened once and then never again:

    ib3.ron()   12: getstatic ek1 ; getfield c05.u0y ; instanceof fkf   // open?
                36: invokevirtual kkj()                                // yes -> close
                96: invokevirtual zwr.ch4() : Lfkf;                    // cached screen
               119: new fkf ; invokespecial fkf.<init>()V
               126: invokevirtual zwr.r_n(Lfkf;)V
               138: invokevirtual c05.z2i(Lgbe;)V                     // show it

    ar7.ron()    4: getstatic vlm ; ... mtl.__x(this)                  // HUD list
                53: invokevirtual asw(Z)V                              // refresh

`fkf.<init>` has exactly ONE caller (`ib3.ron@123`) and `ib3.ron` has ZERO Java
callers, so only the native callback could ever open the screen.  The force-enable
pass in `smq.w0y` still reaches native `yse` and therefore opened it once.

Patch
-----
`ar7.tp_` builds a chat notification at the end and hands it to `zet.sh0`:

    146: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
    149: aload_0
    150: invokestatic  zet.sh0:(Ljava/lang/String;Ljava/lang/String;Lar7;)V
    153: getstatic     zwr.qkk
    156: invokevirtual zwr.up0:()Lszk;
    159: invokevirtual szk.m0g:()V
    162: return

The 7 bytes at 146..152 become

    146: pop                  discard the StringBuilder
    147: pop                  discard the notification prefix
    148: aload_0
    149: invokevirtual ar7.ron:()V
    152: nop

which leaves the operand stack empty exactly where it was before, keeps the
`szk.m0g()` config refresh intact, and drops only the toast.  A notification is
the cheapest thing to lose here; `ron()` is what actually enables the feature,
opens the ClickGUI and updates the HUD list.

Usage: patch_ron.py <in/ar7.class> <out/ar7.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_ref

SPAN = (146, 153)                    # [start, end) - 7 bytes


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)

    ron = find_ref(pool, 'ar7', 'ron', '()V')
    if ron is None:
        raise SystemExit('FAIL-CLOSED: Methodref ar7.ron()V not found')

    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
        if mn == 'tp_' and md == '()V':
            hit = (cfo, code, mp)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: ar7.tp_()V not found')
    cfo, code, mp = hit

    # the span must still be the notification tail we analysed
    want = bytes.fromhex('b600a2' '2a' 'b800a8')
    if code[SPAN[0]:SPAN[1]][:7] != want:
        raise SystemExit('FAIL-CLOSED: tp_ %d..%d is %s, expected %s'
                         % (SPAN[0], SPAN[1] - 1,
                            code[SPAN[0]:SPAN[1]].hex(' '), want.hex(' ')))

    # nothing may branch into the span, and no handler may cover its start
    for off, op, ops, ln in callscan.decode_instructions(code):
        if op in (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
                  0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xC8, 0xC9):
            tgt = off + struct.unpack_from('>h', ops, 0)[0]
            if SPAN[0] < tgt < SPAN[1]:
                raise SystemExit('FAIL-CLOSED: branch at %d targets %d inside span'
                                 % (off, tgt))
    p = cfo + len(code)
    etl = struct.unpack_from('>H', blob, p)[0]
    for i in range(etl):
        s, e, h, t = struct.unpack_from('>HHHH', blob, p + 2 + 8 * i)
        if s < SPAN[0] < e:
            raise SystemExit('FAIL-CLOSED: the span starts inside protected [%d,%d)'
                             % (s, e))

    new = (bytes([0x57]) +                                  # pop
           bytes([0x57]) +                                  # pop
           bytes([0x2A]) +                                  # aload_0
           bytes([0xB6]) + struct.pack('>H', ron) +         # invokevirtual ar7.ron
           bytes([0x00]))                                   # nop
    if len(new) != SPAN[1] - SPAN[0]:
        raise SystemExit('FAIL-CLOSED: replacement is %d bytes, span is %d'
                         % (len(new), SPAN[1] - SPAN[0]))

    out = bytearray(blob)
    out[cfo + SPAN[0]:cfo + SPAN[1]] = new
    io.open(dst, 'wb').write(bytes(out))
    print('ar7.tp_: %s  ->  %s' % (code[SPAN[0]:SPAN[1]].hex(' '), new.hex(' ')))
    print('  the notification is dropped; ar7.ron() (HUD list + ClickGUI + asw) '
          'now runs on every toggle, matching native yse()')


if __name__ == '__main__':
    main()
