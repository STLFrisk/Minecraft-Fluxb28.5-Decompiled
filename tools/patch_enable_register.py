#!/usr/bin/env python3
"""Flux: make a module that the config enables actually register on the event bus.

Why features stayed inert
-------------------------
Toggling a module from the GUI goes through ar7.tp_, which an earlier patch made
call ar7.ron() - and ron() is what registers the module's @jev handlers:

    if (vlm == 1) mtl.__x(this);

A module that the *config* enables never goes through tp_.  It uses the plain
setters, which earlier patches had reduced to a field write:

    ar7.z5z()      -> putfield iio (true)
    ar7.dv9(boolean)-> putfield iio (arg)

so the enabled flag was set but mtl.__x was never called.  The module showed as
on and its hooks never ran - which is exactly "the config enables modules but the
features do nothing, until I open the ClickGUI".

Patch
-----
Append `aload_0 ; invokevirtual ar7.ron()` to both setters.  Both are six bytes of
straight-line code ending in return, with no branch, no exception table and no
stack map table, so appending moves nothing.  ron() re-checks vlm itself, so
calling it unconditionally is safe, and registering an already-registered listener
is idempotent in mtl.vpm.

Both insertions are computed from the ORIGINAL bytes and applied from the highest
offset down, so the second edit cannot invalidate the first one's coordinates.

Usage: patch_enable_register.py <in/ar7.class> <out/ar7.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_ref

TARGETS = ('z5z', 'dv9')
BRANCHES = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
            0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6)


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    ron = find_ref(pool, 'ar7', 'ron', '()V')
    if ron is None:
        raise SystemExit('FAIL-CLOSED: Methodref ar7.ron()V not in ar7 own pool')

    edits = []
    for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
        if mn not in TARGETS:
            continue
        if code[-1] != 0xB1:
            raise SystemExit('FAIL-CLOSED: %s does not end with return' % mn)
        for off, op, ops, ln in callscan.decode_instructions(code):
            if op in BRANCHES:
                raise SystemExit('FAIL-CLOSED: %s has a branch; cannot append' % mn)
        edits.append((cfo, mi := mn, len(code), md))
    if len(edits) != len(TARGETS):
        raise SystemExit('FAIL-CLOSED: found %d of %d setters (%s)'
                         % (len(edits), len(TARGETS), [e[1] for e in edits]))

    inject = bytes([0x2A]) + bytes([0xB6]) + struct.pack('>H', ron)
    out = blob
    # highest offset first so earlier coordinates stay valid
    for cfo, mn, clen, md in sorted(edits, key=lambda e: -e[0]):
        at = cfo + clen - 1
        buf = bytearray(out)
        attr = struct.unpack_from('>I', out, cfo - 12)[0]
        struct.pack_into('>I', buf, cfo - 12, attr + len(inject))
        struct.pack_into('>I', buf, cfo - 4, clen + len(inject))
        out = bytes(bytearray(buf[:at]) + bytearray(inject) + bytearray(buf[at:]))
        print('  ar7.%s%s : %d -> %d 字节，追加 aload_0; invokevirtual ron()'
              % (mn, md, clen, clen + len(inject)))

    # re-parse and confirm
    seen = {}
    for mn, md, cfo, code, mp in patch_login.code_arrays(out):
        if mn in TARGETS:
            seen[mn] = code
    for mn in TARGETS:
        c = seen[mn]
        tail = c[-10:]
        if tail != bytes([0x2A, 0x04, 0xB5, 0x00, 0x91] if mn == 'z5z'
                         else [0x2A, 0x1B, 0xB5, 0x00, 0x91]) + bytes([0x2A, 0xB6]) + struct.pack('>H', ron)[:2]:
            print('  note: ar7.%s now %d bytes, tail %s' % (mn, len(c), c[-8:].hex(' ')))
    io.open(dst, 'wb').write(out)
    print('  ar7 共 %d 字节（原 %d）' % (len(out), len(blob)))


if __name__ == '__main__':
    main()
