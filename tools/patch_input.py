#!/usr/bin/env python3
"""Flux: enable main-menu input without a successful login.

Finding
-------
`q08` (the Flux title screen) validates its clicks like this:

    public void mouseClicked(int x, int y, int button) {
        int v = t9d.b();
        if (!ybv.ph2) return;          // 5: getstatic ybv.ph2  8: ifne 16  11: return
        for (q08$_r5 item : this.f_k) {
            if (item.rwc) item.oyj();
        }
        super.mouseClicked(x, y, button);
    }

`ybv.ph2` is:

    ybv.<clinit>          : iconst_0 -> putstatic ph2     (false at startup)
    qih.drawScreen  @2346 : putstatic ph2                 (set by the LOGIN screen)
    q08.mouseClicked @5   : getstatic ph2                 (the guard above)
    qih.drawScreen  @1887 : getstatic ph2                 (login-screen own use)

So the menu is deliberately inert until the login screen arms it.  With the login
screen bypassed (patch P4), nothing ever sets the flag, the guard always returns
early, and every button - Single Player, Multi Player, Alt Manager, Options - is
dead while still being drawn.

Patch
-----
Flip the initialiser to true:

    ybv.<clinit>  code[4] : 0x03 (iconst_0) -> 0x04 (iconst_1)

One byte.  No offsets move, no constant-pool entry is needed, no branch changes.

Usage: patch_input.py <in/ybv.class> <out/ybv.class>
"""
import io
import sys

EXPECTED = bytes.fromhex('0b b3 00 17 03 b3 00 1a b1')   # fconst_0 putstatic w34 iconst_0 putstatic ph2 return
FLAG_OFFSET = 4                                            # the iconst_0
ICONST_0, ICONST_1 = 0x03, 0x04


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()

    # locate ybv.<clinit>'s Code array
    import os
    sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
    import patch_login

    hit = None
    for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
        if mname == '<clinit>' and mdesc == '()V':
            hit = (cfo, code)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: ybv.<clinit> not found')
    cfo, code = hit

    head = bytes(code[:len(EXPECTED)])
    if head != EXPECTED:
        raise SystemExit('FAIL-CLOSED: <clinit> head is %s, expected %s'
                         % (head.hex(' '), EXPECTED.hex(' ')))
    if code[FLAG_OFFSET] != ICONST_0:
        raise SystemExit('FAIL-CLOSED: code[%d] is 0x%02x, expected iconst_0'
                         % (FLAG_OFFSET, code[FLAG_OFFSET]))

    out = bytearray(blob)
    out[cfo + FLAG_OFFSET] = ICONST_1
    io.open(dst, 'wb').write(bytes(out))

    print('ybv.<clinit>: initialised ph2 = true')
    print('  code offset %d : 0x03 (iconst_0) -> 0x04 (iconst_1)' % FLAG_OFFSET)
    print('  effect: q08.mouseClicked no longer returns early -> menu buttons work')


if __name__ == '__main__':
    main()
