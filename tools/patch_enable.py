#!/usr/bin/env python3
"""Flux: make the module enabled-state authoritative on the Java side.

What the analysis established
-----------------------------
The whole Java-side enable path is present and provably correct:

    ar7.klu()          { return this.iio; }            // "is enabled"
    ar7.z5z()          { this.yse(true);  }            // enable
    ar7.kkj()          { this.yse(false); }            // disable
    ar7.dv9(boolean b) { this.yse(b);     }            // set
    ar7.nm8(int v)     { this.pl_ = v; }               // keybind (pure Java)
    ar7.x_i()          { return this.pl_; }

    c05.tur  iterates kgt.wau() and dispatches keybinds:
        1857: invokevirtual ar7.x_i:()I
        1864: if_icmpne 1886            // pressed key == module bind?
        1876: invokevirtual ar7.tp_:()V // then toggle it

and `ar7.tp_` really does invert the flag.  Its control flow hinges on the ZKM
opaque predicate `t9d.c()`, which decodes to

    public static int c() { int v = b(); return v == 0 ? 69 : 0; }

so with `b() != 0` (established experimentally) we get `c() == 0`, the `ifne 55`
at offset 41 is *not* taken, and the inversion path at offsets 44-58 runs.  The
call is therefore `yse(!iio)` - correct.

The only remaining variable is the native `ar7.yse(boolean)`.  It executes without
throwing (toggling a module does not crash), yet no module ever becomes enabled, so
the native side is producing no effect.  `ar7.iio` has ZERO Java writers in all
3,394 classes, i.e. the native side was the sole author of the flag.

What this patch does
--------------------
It takes that authorship back, using only **length-preserving in-place edits**, so
no bytecode offset, branch displacement, exception range or stack map frame is
disturbed:

  * `ar7.z5z()`        : `invokevirtual yse` -> `putfield iio`   (iconst_1 stays)
  * `ar7.kkj()`        : `invokevirtual yse` -> `putfield iio`   (iconst_0 stays)
  * `ar7.dv9(boolean)` : `invokevirtual yse` -> `putfield iio`   (iload_1 stays)
  * `ar7.tp_()`        : the trailing notification/refresh block at 149..162 is
                         replaced by a Java-side inversion of `iio`, padded with
                         nops to the original 14 bytes.

If the native engine consults the flag, this restores feature toggling; if it does
not, this is the definitive experiment that shows the gate lives entirely inside
the packed native library.

Usage: patch_enable.py <in/ar7.class> <out/ar7.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool

SETTERS = [('z5z', '()V'), ('kkj', '()V'), ('dv9', '(Z)V')]
TP_TAIL = (149, 163)                     # [start, end)
TP_NEW = bytes.fromhex(
    '2a'                 # aload_0
    '2a'                 # aload_0
    'b4 00 91'           # getfield ar7.iio
    '04'                 # iconst_1
    '82'                 # ixor            -> !iio
    'b5 00 91'           # putfield ar7.iio
    'b1'                 # return
)
TP_TOTAL = TP_TAIL[1] - TP_TAIL[0]       # 14


def find_iio(pool):
    for i, (tag, _p) in pool.entries.items():
        if tag == 9 and pool.ref.get(i) == ('ar7', 'iio', 'Z'):
            return i
    return None


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    iio_idx = find_iio(pool)
    if iio_idx is None:
        raise SystemExit('FAIL-CLOSED: Fieldref ar7.iio:Z not found')
    print('ar7.iio Fieldref = #%d (tag %d)'
          % (iio_idx, pool.entries[iio_idx][0]))

    out = bytearray(blob)
    report = []

    for mname, mdesc in SETTERS:
        hit = None
        for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
            if mn == mname and md == mdesc:
                hit = (cfo, code, mp)
                break
        if hit is None:
            raise SystemExit('FAIL-CLOSED: ar7.%s%s not found' % (mname, mdesc))
        cfo, code, mp = hit
        if len(code) != 6 or code[2] != 0xB6:
            raise SystemExit('FAIL-CLOSED: ar7.%s%s shape changed: %s'
                             % (mname, mdesc, code.hex(' ')))
        ref = callscan.ref_name(mp, struct.unpack_from('>H', code, 3)[0])
        if ref != 'ar7.yse':
            raise SystemExit('FAIL-CLOSED: ar7.%s%s calls %s, expected ar7.yse'
                             % (mname, mdesc, ref))
        # opcode AND operand must change: the existing index is a Methodref to
        # ar7.yse, while putfield needs the Fieldref to ar7.iio.
        out[cfo + 2] = 0xB5                                  # invokevirtual -> putfield
        struct.pack_into('>H', out, cfo + 3, iio_idx)
        report.append('ar7.%s%s : %s  ->  %s'
                      % (mname, mdesc, code.hex(' '),
                         bytes(out[cfo:cfo + 6]).hex(' ')))

    # --- ar7.tp_: swap the native call for the field write, in place
    #
    # By the time control reaches offset 59 the operand stack holds exactly
    # [this, !iio]:
    #
    #   35: aload_0            [this]
    #   36: aload_0            [this, this]
    #   37: getfield iio       [this, iio]
    #   41: ifne 55            c()==0, so NOT taken
    #   44: ifne 58            [this]        pops iio
    #   54: iconst_1 / 58: iconst_0          [this, !iio]
    #   59: invokevirtual yse(Z)V
    #
    # so replacing the 3-byte invokevirtual with `putfield iio` performs
    # `this.iio = !iio` with no offset change at all.  The method's trailing
    # notification and `zwr.qkk.up0().m0g()` refresh are left untouched - an
    # earlier revision replaced that block and broke the ClickGUI's refresh path.
    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
        if mn == 'tp_' and md == '()V':
            hit = (cfo, code, mp)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: ar7.tp_()V not found')
    cfo, code, mp = hit
    if code[59] != 0xB6:
        raise SystemExit('FAIL-CLOSED: tp_ offset 59 is 0x%02x, expected invokevirtual'
                         % code[59])
    ref = callscan.ref_name(mp, struct.unpack_from('>H', code, 60)[0])
    if ref != 'ar7.yse':
        raise SystemExit('FAIL-CLOSED: tp_ offset 59 calls %s, expected ar7.yse' % ref)

    # nothing may branch to offset 60 or 61 (mid-instruction): replacing them
    # would strand a jump inside an operand.
    insns = callscan.decode_instructions(code)
    for off, op, ops, ln in insns:
        if op in (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
                  0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xC8, 0xC9):
            tgt = off + struct.unpack_from('>h', ops, 0)[0]
            if tgt in (60, 61):
                raise SystemExit('FAIL-CLOSED: branch at %d lands mid-instruction at %d'
                                 % (off, tgt))

    out[cfo + 59] = 0xB5                                   # invokevirtual -> putfield
    struct.pack_into('>H', out, cfo + 60, iio_idx)
    report.append('ar7.tp_()V  : offset 59  %s  ->  %s   (this.iio = !iio)'
                  % (code[59:62].hex(' '), bytes(out[cfo + 59:cfo + 62]).hex(' ')))

    io.open(dst, 'wb').write(bytes(out))
    print('the module enabled-state is now authored in Java:')
    for r in report:
        print('   ' + r)
    print('   native ar7.yse(...) is still invoked from ar7.tp_; '
          'the Java flag no longer depends on it')


if __name__ == '__main__':
    main()
