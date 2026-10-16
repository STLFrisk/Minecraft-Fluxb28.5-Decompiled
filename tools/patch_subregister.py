#!/usr/bin/env python3
"""Flux: make ar7.ron()/ne2() also register/unregister the module's sub-objects.

ar7 keeps its sub-objects - the KillAura engine xbs is one, and it extends j1s
rather than ar7 - in the private list ar7._w6, populated by ar7.jpe(j1s).  Both
ron() and ne2() only ever act on `this`:

    public void ron() { if (ar7.vlm == 1) mtl.__x(this);  ... }
    public void ne2() { if (ar7.vlm == 1) mtl.mn9(this); ... }

so the sub-objects are neither registered (which is why KillAura did nothing until
it was registered by hand) nor unregistered (which is why disabling KillAura left
it attacking).

Rather than emit an iterator loop - which would need new stack map frames in a
method that already has eight - this appends a call to the JDK's own

    java.util.List.forEach(java.util.function.Consumer)

with a singleton from FluxBus that forwards to mtl.__x / mtl.mn9 reflectively.  The
iteration happens inside ArrayList, so the patched method gains no branch, no loop
and no new frame:

    aload_0 ; getfield ar7._w6 ; getstatic FluxBus.REG  ; invokeinterface forEach
    aload_0 ; getfield ar7._w6 ; getstatic FluxBus.UNREG; invokeinterface forEach

Both methods end in return, and no exception table range reaches the end, so
appending before the terminal return moves nothing.

Usage: patch_subregister.py <in/ar7.class> <out/ar7.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
import patch_autoload
from patch_qih import Pool, find_ref

TARGETS = (('ron', 'REG'), ('ne2', 'UNREG'))


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    notes = []

    w6 = find_ref(pool, 'ar7', '_w6', 'Ljava/util/List;', tags=(9,))
    if w6 is None:
        raise SystemExit('FAIL-CLOSED: Fieldref ar7._w6 not found')

    pb, count, foreach, n = patch_autoload.build_ref(
        pb, pool, count, 'java/util/List', 'forEach',
        '(Ljava/util/function/Consumer;)V', 11)
    if n:
        notes.append(n)

    regs = {}
    for label in ('REG', 'UNREG'):
        pb, count, idx, n = patch_autoload.build_ref(
            pb, pool, count, 'FluxBus', label, 'LFluxBus;', 9)
        regs[label] = idx
        if n:
            notes.append(n)

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    # Collect both sites from the ORIGINAL bytes first.  ron and ne2 both live in
    # the method table, so inserting into one invalidates the other's coordinates;
    # applying the edits from the highest offset down keeps every cfo valid.
    edits = []
    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        want = None
        for tname, label in TARGETS:
            if mn == tname:
                want = label
        if want is None:
            continue
        if code[-1] != 0xB1:
            raise SystemExit('FAIL-CLOSED: ar7.%s does not end with return' % mn)
        edits.append((cfo, mn, md, len(code), want))
    if len(edits) != len(TARGETS):
        raise SystemExit('FAIL-CLOSED: found %d of %d methods (%s)'
                         % (len(edits), len(TARGETS), [e[1] for e in edits]))

    done = []
    for cfo, mn, md, clen, want in sorted(edits, key=lambda e: -e[0]):
        inject = (bytes([0x2A]) + bytes([0xB4]) + struct.pack('>H', w6) +
                  bytes([0xB2]) + struct.pack('>H', regs[want]) +
                  bytes([0xB9]) + struct.pack('>H', foreach) + bytes([0x02, 0x00]))
        at = cfo + clen - 1
        buf = bytearray(new)
        attr = struct.unpack_from('>I', new, cfo - 12)[0]
        struct.pack_into('>I', buf, cfo - 12, attr + len(inject))
        struct.pack_into('>I', buf, cfo - 4, clen + len(inject))
        new = bytes(bytearray(buf[:at]) + bytearray(inject) + bytearray(buf[at:]))
        done.append('ar7.%s%s: %d -> %d bytes  (forEach FluxBus.%s)'
                    % (mn, md, clen, clen + len(inject), want))

    if not done:
        raise SystemExit('FAIL-CLOSED: neither ron nor ne2 found')
    io.open(dst, 'wb').write(new)
    for d in done:
        print('  ' + d)
    for x in notes:
        print('  pool: %s' % x)
    print('  效果: 启用/关闭模块时, 它拥有的子引擎(xbs 等)一起注册/注销')


if __name__ == '__main__':
    main()
