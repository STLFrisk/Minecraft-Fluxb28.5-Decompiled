#!/usr/bin/env python3
"""Flux: give `zwr.zj2()` a lazily created `kgt` so all 39 call sites are safe.

Finding
-------
Entering a world and then touching any key crashed with

    java.lang.NullPointerException: Cannot invoke "kgt.wau()"
        because the return value of "zwr.zj2()" is null
        at c05.tur            (the client tick / input dispatch)
        at c05.e3x / c05.z11 / net.minecraft.client.main.Main.main

The whole surface is one field and one getter:

    zwr.coi : Lkgt;                       // 1 reader, 1 writer
    zwr.zj2()  { return this.coi; }       //   -> only reader
    zwr.spc(kgt) { this.coi = k; }        //   -> the only writer

`zwr.spc` has ZERO Java call sites anywhere in the 3,394 classes, so the `kgt`
instance is created by the native layer (as part of a successful login/init) and
handed in through JNI.  Bypassing the login therefore leaves `coi == null`, and
`zwr.zj2()` has 39 call sites:

    b4o.u4c x2   b4o.xc9 x2   b4o.xcu x2   b4o.y88 x2   b4o.zh4 x2
    c05.tur      c7u.run      iah.lml      ih8.xjl      ju6.lml
    jvy.fwo      kgt.cre      kgt.cwd      n9l x5       obh.lml
    slo.lml      szk x8       vc3.ron      wg9.xjl x2   z0g.xjl x2
    z_p.xjl

Patching 39 sites one at a time is whack-a-mole.  Fixing the getter fixes all of
them at once, which is also the semantically right place: the getter is the single
point through which every consumer asks for the registry.

Patch
-----
`zwr.zj2()` is rewritten as

    public kgt zj2() {
        if (this.coi == null) this.coi = new kgt();
        return this.coi;
    }

Compiled with a single forward branch:

     0: aload_0                  // [this]
     1: getfield coi             // [kgt]
     4: ifnonnull 18             // []
     7: aload_0                  // [this]
     8: new kgt                  // [this, kgt]
    11: dup                      // [this, kgt, kgt]
    12: invokespecial kgt.<init>()V
    15: putfield coi             // []
    18: aload_0                  // [this]      <- both paths arrive with stack []
    19: getfield coi             // [kgt]
    22: areturn

max_stack becomes 3, max_locals stays 1, the exception table is empty, and because
the method now has a branch target it carries an explicit StackMapTable with one
`same_frame` entry at offset 18 (locals unchanged, empty stack on both paths).

`new kgt()` is safe here: by the time any consumer calls `zj2()` (input dispatch
happens in-world), `kgt` is already fully initialised, and a recursive entry while
`<clinit>` is still running is handled by the JVM's re-entrant initialisation.

Usage: patch_zj2.py <in/zwr.class> <out/zwr.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, find_ref, append_utf8, find_method

TARGET_NAME = 'zj2'
TARGET_DESC = '()Lkgt;'
FRAME_OFFSET = 18


def build_code(coi_index, kgt_class, kgt_init):
    return (
        bytes([0x2A]) +                                   # aload_0
        bytes([0xB4]) + struct.pack('>H', coi_index) +    # getfield zwr.coi
        bytes([0xC7]) + struct.pack('>H', FRAME_OFFSET - 4) +   # ifnonnull 18
        bytes([0x2A]) +                                   # aload_0
        bytes([0xBB]) + struct.pack('>H', kgt_class) +    # new kgt
        bytes([0x59]) +                                   # dup
        bytes([0xB7]) + struct.pack('>H', kgt_init) +     # invokespecial kgt.<init>
        bytes([0xB5]) + struct.pack('>H', coi_index) +    # putfield zwr.coi
        bytes([0x2A]) +                                   # aload_0
        bytes([0xB4]) + struct.pack('>H', coi_index) +    # getfield zwr.coi
        bytes([0xB0])                                     # areturn
    )


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count

    # --- ensure the pool has: Fieldref zwr.coi, Class kgt, Methodref kgt.<init>()V,
    # --- and the Utf8 "StackMapTable"
    added = []
    pool_blob = blob[:pool.end]
    tail = blob[pool.end:]

    coi_index = find_ref(pool, 'zwr', 'coi', 'Lkgt;', tags=(9,))
    if coi_index is None:
        raise SystemExit('FAIL-CLOSED: Fieldref zwr.coi:Lkgt; not found')

    kgt_class = find_class(pool, 'kgt')
    if kgt_class is None:
        pool_blob, _ = append_utf8(pool_blob, 'kgt')
        utf = count
        count += 1
        pool_blob += bytes([7]) + struct.pack('>H', utf)
        kgt_class = count
        count += 1
        added.append('Class kgt = #%d' % kgt_class)

    kgt_init = find_ref(pool, 'kgt', '<init>', '()V')
    if kgt_init is None:
        pool_blob, _ = append_utf8(pool_blob, '<init>')
        n = count
        count += 1
        pool_blob, _ = append_utf8(pool_blob, '()V')
        d = count
        count += 1
        pool_blob += bytes([12]) + struct.pack('>H', n) + struct.pack('>H', d)
        nt = count
        count += 1
        pool_blob += bytes([10]) + struct.pack('>H', kgt_class) + struct.pack('>H', nt)
        kgt_init = count
        count += 1
        added.append('Methodref kgt.<init>()V = #%d' % kgt_init)

    smt_name = None
    for idx, name in pool.utf8.items():
        if name == 'StackMapTable':
            smt_name = idx
            break
    if smt_name is None:
        pool_blob, _ = append_utf8(pool_blob, 'StackMapTable')
        smt_name = count
        count += 1
        added.append('Utf8 StackMapTable = #%d' % smt_name)

    new = bytearray(pool_blob) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    pool2 = Pool(new)
    body, alen = find_method(new, pool2, TARGET_NAME, TARGET_DESC)
    max_locals = struct.unpack_from('>H', new, body + 2)[0]
    code_name_index = struct.unpack_from('>H', new, body - 6)[0]

    code = build_code(coi_index, kgt_class, kgt_init)
    if len(code) != 23:
        raise SystemExit('FAIL-CLOSED: new body is %d bytes' % len(code))

    # StackMapTable: 1 entry, same_frame(18)  -> locals unchanged, empty stack
    smt = struct.pack('>H', 1) + bytes([FRAME_OFFSET])
    code_attr = (
        struct.pack('>H', 3) +               # max_stack (this, kgt, kgt)
        struct.pack('>H', max_locals) +
        struct.pack('>I', len(code)) + code +
        struct.pack('>H', 0) +               # exception_table_length
        struct.pack('>H', 1) +               # attributes_count
        struct.pack('>H', smt_name) + struct.pack('>I', len(smt)) + smt
    )

    out = bytearray(new[:body - 6])
    out += struct.pack('>H', code_name_index)
    out += struct.pack('>I', len(code_attr))
    out += code_attr
    out += new[body + alen:]
    io.open(dst, 'wb').write(bytes(out))

    print('zwr.zj2() rewritten to lazily create the kgt registry')
    print('  appended pool entries : %s' % (added or 'none'))
    print('  code %d bytes -> %d bytes ; attribute %d -> %d bytes'
          % (struct.unpack_from('>I', new, body + 4)[0], len(code), alen, len(code_attr)))
    print('  StackMapTable: same_frame(@%d)' % FRAME_OFFSET)
    print('  fixes all 39 zwr.zj2() call sites at once')


if __name__ == '__main__':
    main()
