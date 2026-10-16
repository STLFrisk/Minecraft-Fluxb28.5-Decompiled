#!/usr/bin/env python3
"""Flux: tolerate the class-initialisation re-entrancy around `kgt.iy7`.

Finding
-------
Creating a world crashes with

    java.lang.ExceptionInInitializerError
        at hh6.gxw / v3i.vul / v3i.wiy / v3i.lpp / c05.e3x / c05.z11
    Caused by: java.lang.NullPointerException: Cannot invoke "v2w.klu()"
        because "kgt.iy7" is null
        at kh3.wd_
        at l86.lhu
        at ar7.yse(Native Method)
        at ar9.<init>
        at kgt.<clinit>

`kgt` is a flat registry of modules built entirely inside its static initialiser:

    kgt.<clinit>
      247: new ar9 ; invokespecial ar9.<init>() ; putstatic kgt.p71
      ...
     1057: new v2w ; invokespecial v2w.<init>() ; putstatic kgt.iy7

`ar9.<init>` calls the native `ar7.yse(boolean)`, and that native call synchronously
re-enters Java (l86.lhu -> kh3.wd_), which dereferences `kgt.iy7` - a field that is
not assigned until offset 1064, i.e. ~800 bytes later.  So the dereference happens
while the class is still being initialised and the field is necessarily null.

The reachability of this re-entrant path depends on runtime state that a successful
login normally establishes, which is why the stock client does not trip it here.

Patch
-----
`kh3.wd_` opens with

     9: t9d.c()            -> istore 13
    14: getstatic kgt.iy7 : Lv2w;
    17: invokevirtual v2w.klu : ()Z
    20: iload 13
    22: ifne 74
    25: ifeq 134           // klu() == false -> early return

so a `false` result simply makes the routine a no-op.  The 6-byte span
`getstatic kgt.iy7 ; invokevirtual v2w.klu()Z` is therefore replaced by
`iconst_0 ; nop x5`:

  * identical operand-stack effect (one int pushed),
  * no branch added, no offset moved, no stack map frame change,
  * no constant-pool entry needed.

The only behaviour change is that this HUD routine declines to run when it is
re-entered before `kgt` finished initialising - which is exactly the window in
which it cannot run correctly anyway.

Usage: patch_reentrancy.py <in/kh3.class> <out/kh3.class>
"""
import io
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

TARGET_METHOD = 'wd_'
SPAN_START = 14
SPAN_LEN = 6
EXPECTED = bytes.fromhex('b2 02 42 b6 02 47')      # getstatic kgt.iy7 ; invokevirtual v2w.klu()Z


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()

    hit = None
    for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
        if mname != TARGET_METHOD:
            continue
        if not mdesc.startswith('(DDDLjava/lang/String;FFZ)'):
            continue
        hit = (cfo, code)
        break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: kh3.wd_(DDDLjava/lang/String;FFZ)V not found')
    cfo, code = hit

    before = bytes(code[SPAN_START:SPAN_START + SPAN_LEN])
    if before != EXPECTED:
        raise SystemExit('FAIL-CLOSED: span is %s, expected %s'
                         % (before.hex(' '), EXPECTED.hex(' ')))

    insns = callscan.decode_instructions(code[SPAN_START:SPAN_START + SPAN_LEN])
    ops = [op for _o, op, _ops, _ln in insns]
    if ops != [0xB2, 0xB6]:
        raise SystemExit('FAIL-CLOSED: span decodes to %s, expected [getstatic, invokevirtual]'
                         % [hex(o) for o in ops])

    # iconst_0 pushes exactly the one int the original pair left on the stack
    out = bytearray(blob)
    out[cfo + SPAN_START:cfo + SPAN_START + SPAN_LEN] = bytes([0x03] + [0x00] * 5)
    io.open(dst, 'wb').write(bytes(out))

    print('kh3.wd_: removed the re-entrant kgt.iy7 dereference')
    print('  code offset %d..%d' % (SPAN_START, SPAN_START + SPAN_LEN - 1))
    print('  before : %s' % before.hex(' '))
    print('  after  : 03 00 00 00 00 00   (iconst_0 + 5 nop)')
    print('  operand-stack effect unchanged (one int pushed)')


if __name__ == '__main__':
    main()
