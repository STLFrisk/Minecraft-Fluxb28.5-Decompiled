#!/usr/bin/env python3
"""Flux: remove the menu's unguarded use of the login-initialised shader.

Finding
-------
`q08` is the Flux title screen, and `c05` installs it as the initial screen, so
`q08.drawScreen` runs on the very first frame.  In the stock client that never
matters, because the login gate returns early (it pushes the `qih` login screen
and returns before the menu code is reached).

Once the gate is bypassed, `q08.drawScreen` reaches the menu and dies on

    124: getstatic  zwr.qkk   : Lzwr;
    127: getfield   zwr.cw_   : Lg5m;
    130: aload_0 / getfield dt7
    134: aload_0 / getfield o1e
    138: invokevirtual g5m.iyv(II)V

`zwr.cw_` is a GLSL program wrapper (`g5m extends ni3`, and `ni3` compiles
shaders through `ARBShaderObjects`/`GL20`).  It has NO Java writer anywhere in the
3,394 classes - only the native layer populates it, as part of a successful login:

    java.lang.NullPointerException: Cannot invoke "g5m.iyv(int, int)"
        because "zwr.qkk.cw_" is null
        at q08.drawScreen(Unknown Source)

Every other global the menu touches is safe: `vnx`, `swt`, `b1u` and `qkk` are set
in `zwr.<clinit>`; `uec` has an explicit `ifnonnull` fallback; `tgs` is handled by
patch P1/P3.  `cw_` is the only unguarded one.

`gbe` (GuiScreen) shows the intended contract - it guards the same field with
`ifnull` and simply skips the shader call when it is absent.  So skipping it in
`q08` is the behaviour the client already tolerates.

Patch
-----
The 17-byte span 124..140 has a **net operand-stack effect of zero**, so it is
replaced by 17 `nop`s:

  * no branch is added, so no stack map frame changes,
  * no offset moves, so no branch displacement or exception range changes,
  * no constant-pool entry is needed,
  * only 17 bytes are rewritten in place.

The cost is purely cosmetic: the menu loses that one shader pass.

Usage: patch_menu.py <in/q08.class> <out/q08.class>
"""
import io
import struct
import sys

sys.path.insert(0, __import__('os').path.dirname(__import__('os').path.abspath(__file__)))
import callscan
import patch_login

TARGET_METHOD = 'drawScreen'
TARGET_DESC = '(IIF)V'
SPAN_START = 124
SPAN_LEN = 17
EXPECTED = bytes.fromhex('b2 00 ac b4 00 b0 2a b4 00 91 2a b4 00 94 b6 00 b6')


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()

    hit = None
    for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
        if mname == TARGET_METHOD and mdesc == TARGET_DESC:
            hit = (cfo, code)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: %s%s not found' % (TARGET_METHOD, TARGET_DESC))
    cfo, code = hit

    before = bytes(code[SPAN_START:SPAN_START + SPAN_LEN])
    if before != EXPECTED:
        raise SystemExit('FAIL-CLOSED: span 124..140 is %s, expected %s'
                         % (before.hex(' '), EXPECTED.hex(' ')))

    # decode the span and prove the operand-stack effect really is zero.
    # Per-instruction net effect (operand stack slots):
    #   getstatic  +1        getfield  -1 +1 = 0
    #   aload_0    +1        invokevirtual g5m.iyv(II)V = -(1 objref + 2 ints) = -3
    #   total = 1 + 0 + 1 + 0 + 1 + 0 - 3 = 0
    insns = callscan.decode_instructions(code[SPAN_START:SPAN_START + SPAN_LEN])
    ops = [op for _off, op, _ops, _ln in insns]
    expected_ops = [0xB2, 0xB4, 0x2A, 0xB4, 0x2A, 0xB4, 0xB6]
    if ops != expected_ops:
        raise SystemExit('FAIL-CLOSED: span decodes to %s, expected %s'
                         % ([hex(o) for o in ops], [hex(o) for o in expected_ops]))
    net = 0
    for op in ops:
        if op == 0xB2 or op == 0x2A:      # getstatic / aload_0
            net += 1
        elif op == 0xB4:                  # getfield: pops objectref, pushes value
            net += 0
        elif op == 0xB6:                  # invokevirtual g5m.iyv(II)V
            net -= 3
    if net != 0:
        raise SystemExit('FAIL-CLOSED: span stack effect is %+d, expected 0' % net)

    out = bytearray(blob)
    out[cfo + SPAN_START:cfo + SPAN_START + SPAN_LEN] = b'\x00' * SPAN_LEN
    io.open(dst, 'wb').write(bytes(out))

    print('q08.drawScreen: removed the unguarded login shader call')
    print('  code offset %d..%d' % (SPAN_START, SPAN_START + SPAN_LEN - 1))
    print('  before : %s' % before.hex(' '))
    print('  after  : %s' % ('00 ' * SPAN_LEN).strip())
    print('  stack effect verified: 0')


if __name__ == '__main__':
    main()
