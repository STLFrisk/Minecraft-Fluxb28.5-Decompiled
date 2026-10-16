#!/usr/bin/env python3
"""Neutralise java.awt.Color's range validation.

Why
---
Flux's native core (libsoter.dll) constructs `java.awt.Color` from JNI on several
paths - `prq.lz_`, `kgt.eyk`, `j1s.d2z` among them - and it consistently passes
component values outside 0..255.  `java.awt.Color` then throws

    java.lang.IllegalArgumentException: Color parameter outside of expected range: Red Green Blue

and because the throw happens *inside* a native frame, it unwinds the entire native
call, aborting whatever the native engine was in the middle of.  That is why every
feature is inert: the engine dies on a colour on every path that matters.

The check is purely advisory.  `Color`'s own constructors already mask every
component before storing it:

    value = ((a & 0xFF) << 24) | ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | (b & 0xFF);
    testColorValueRange(r, g, b, a);      // <- only validates, after the fact

so making `testColorValueRange` a no-op cannot produce an invalid colour - it only
stops an out-of-range input from being fatal.  Correct programs are unaffected.

Patch
-----
`testColorValueRange(IIII)V` is rewritten to a bare `return`.  The method has no
branch, so no stack map table is required; the exception table is empty and only
this one Code attribute changes.

Usage: patch_color.py <in/Color.class> <out/Color.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from patch_qih import Pool, find_method


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()

    body, alen = find_method(blob, Pool(blob), 'testColorValueRange', '(IIII)V')
    name_index = struct.unpack_from('>H', blob, body - 6)[0]
    max_stack, max_locals = struct.unpack_from('>HH', blob, body)
    code_len = struct.unpack_from('>I', blob, body + 4)[0]
    print('  testColorValueRange(IIII)V : max_stack=%d max_locals=%d code=%d bytes'
          % (max_stack, max_locals, code_len))

    new_code = bytes([0xB1])                      # return
    attr = (
        struct.pack('>H', 0) +                    # max_stack
        struct.pack('>H', max_locals) +
        struct.pack('>I', len(new_code)) + new_code +
        struct.pack('>H', 0) +                    # exception_table_length
        struct.pack('>H', 0)                      # attributes_count
    )

    out = bytearray(blob[:body - 6])
    out += struct.pack('>H', name_index)
    out += struct.pack('>I', len(attr))
    out += attr
    out += blob[body + alen:]
    io.open(dst, 'wb').write(bytes(out))
    print('  -> replaced with a bare `return`; Code attribute %d -> %d bytes'
          % (alen, len(attr)))


if __name__ == '__main__':
    main()
