#!/usr/bin/env python3
"""Flux: make a Mode dropdown change take effect immediately.

Picking a different entry stored the new value but did not re-run the enable
dispatch, so the previously selected engine kept running:

    config / dropdown : Single (or Switch)
    actual behaviour  : unchanged until the module was toggled off and on again

ar7.asw(boolean) is where the engine is chosen - by comparing each sub-object's
name against the current mode - and asw only runs from ron()/ne2().  So the fix is
to call FluxBus.sync(module) right after the dropdown stores its value.

c_3.n1j(String) is that setter:

    if (value == null) return;
    if (!Arrays.asList(this.mh8).contains(value)) return;   // validate
    this.ktv = value;                                       // store

and dzm, its base class, carries the owning module name in rn2, so the setting can
hand its module straight back to sync().

Appending before the terminal return adds no branch target and shifts no code, so
the existing branch offsets, exception table and stack map frames stay valid.

Usage: patch_modechanged.py <in/c_3.class> <out/c_3.class>
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

TARGET = ('n1j', '(Ljava/lang/String;)V')


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    pb, count, notify, note = patch_autoload.build_ref(
        pb, pool, count, 'FluxBus', 'modeChanged', '(Ljava/lang/Object;)V', 10)

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn != TARGET[0] or md != TARGET[1]:
            continue
        if code[-1] != 0xB1:
            raise SystemExit('FAIL-CLOSED: c_3.%s does not end with return' % mn)
        for off, op, ops, ln in callscan.decode_instructions(code):
            if op in (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
                      0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6):
                if off + struct.unpack_from('>h', ops, 0)[0] == len(code) - 1:
                    raise SystemExit('FAIL-CLOSED: a branch targets the trailing return')
        inject = bytes([0x2A, 0xB8]) + struct.pack('>H', notify)
        at = cfo + len(code) - 1
        buf = bytearray(new)
        attr = struct.unpack_from('>I', new, cfo - 12)[0]
        struct.pack_into('>I', buf, cfo - 12, attr + len(inject))
        struct.pack_into('>I', buf, cfo - 4, len(code) + len(inject))
        out = bytes(bytearray(buf[:at]) + bytearray(inject) + bytearray(buf[at:]))
        io.open(dst, 'wb').write(out)
        print('  c_3.n1j: %d -> %d bytes  (+ aload_0; invokestatic FluxBus.modeChanged)'
              % (len(code), len(code) + len(inject)))
        if note:
            print('  pool: %s' % note)
        print('  效果: 下拉框改值后立刻重新分派引擎(asw), Switch/Single 即时生效')
        return
    raise SystemExit('FAIL-CLOSED: c_3.n1j not found')


if __name__ == '__main__':
    main()
