#!/usr/bin/env python3
"""Flux: give `jej` a lazily created timer so the HUD/ArrayList actually updates.

Finding
-------
`jej` is the on-screen module list (the "ArrayList" HUD).  Its timer field is
created in the constructor:

    jej.<init>(c05)  14: aload_0
                     15: new nhs
                     18: dup
                     19: invokespecial nhs.<init>()V
                     22: putfield wc1:Lnhs;

but **`jej.<init>` has ZERO call sites in all 3,394 classes** - instances come from
the native layer through JNI `AllocObject`, which allocates without running any
constructor.  So `wc1` is null and

    jej.vuw(float)  18: aload_0
                    19: getfield wc1:Lnhs;
                    22: dconst_1
                    23: invokevirtual nhs.yrv:(D)Z   <-- NPE, frame at jej.vuw

throws on entry.  Patch P12 contained that with a catch-all, which is exactly why
the HUD stayed invisible until a world reload produced a properly built instance.
`k1h` and `z19` are only touched inside `<init>`, so `wc1` is the only field that
matters here.

Patch
-----
Add one private helper to `jej`:

    private nhs fluxEnsureTimer() {
        if (this.wc1 == null) this.wc1 = new nhs();
        return this.wc1;
    }

and turn both `getfield wc1` reads inside `jej.vuw` into
`invokevirtual fluxEnsureTimer()Lnhs;`.  Both are 3-byte opcode+index edits, so no
offset moves.  Appending the helper needs only `methods_count` bumped, because a
`method_info` carries no length field - the class attributes that follow are simply
shifted.

Usage: patch_jej2.py <in/jej.class> <out/jej.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, find_ref, append_utf8

HELPER = 'fluxEnsureTimer'
HELPER_DESC = '()Lnhs;'
FIELD_DESC = 'Lnhs;'


def methods_table_range(blob, pool):
    """Return (count_field_offset, methods_count, methods_end_offset)."""
    off = pool.end + 6
    ifc = struct.unpack_from('>H', blob, off)[0]
    off += 2 + 2 * ifc
    fc = struct.unpack_from('>H', blob, off)[0]
    off += 2
    for _ in range(fc):
        off += 6
        ac = struct.unpack_from('>H', blob, off)[0]
        off += 2
        for _ in range(ac):
            off += 6 + struct.unpack_from('>I', blob, off + 2)[0]
    pos = off
    mc = struct.unpack_from('>H', blob, pos)[0]
    off += 2
    for _ in range(mc):
        ac = struct.unpack_from('>H', blob, off + 6)[0]
        o = off + 8
        for _ in range(ac):
            o += 6 + struct.unpack_from('>I', blob, o + 2)[0]
        off = o
    return pos, mc, off


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)

    wc1 = find_ref(pool, 'jej', 'wc1', FIELD_DESC, tags=(9,))
    nhs_cls = find_class(pool, 'nhs')
    nhs_init = find_ref(pool, 'nhs', '<init>', '()V')
    for name, v in (('Fieldref jej.wc1', wc1), ('Class nhs', nhs_cls),
                    ('Methodref nhs.<init>', nhs_init)):
        if v is None:
            raise SystemExit('FAIL-CLOSED: %s not in jej pool' % name)

    code_utf = None
    for i, v in pool.utf8.items():
        if v == 'Code':
            code_utf = i
            break
    if code_utf is None:
        raise SystemExit('FAIL-CLOSED: no Utf8 "Code" in pool')

    count = pool.count
    pb = blob[:pool.end]
    tail = blob[pool.end:]
    added = []

    def utf8_idx(text):
        nonlocal pb, count
        for i, v in pool.utf8.items():
            if v == text:
                return i
        pb, _ = append_utf8(pb, text)
        i = count
        count += 1
        added.append('Utf8 %s = #%d' % (text, i))
        return i

    name_i = utf8_idx(HELPER)
    desc_i = utf8_idx(HELPER_DESC)
    smt_i = utf8_idx('StackMapTable')

    jej_cls = find_class(pool, 'jej')
    if jej_cls is None:
        raise SystemExit('FAIL-CLOSED: Class jej not in its own pool')
    # a Methodref needs its own NameAndType: appending the two Utf8s is not enough
    pb += bytes([12]) + struct.pack('>H', name_i) + struct.pack('>H', desc_i)
    nt_i = count
    count += 1
    pb += bytes([10]) + struct.pack('>H', jej_cls) + struct.pack('>H', nt_i)
    helper_ref = count
    count += 1
    added.append('NameAndType %s%s = #%d' % (HELPER, HELPER_DESC, nt_i))
    added.append('Methodref jej.%s%s = #%d' % (HELPER, HELPER_DESC, helper_ref))

    new = bytearray(pb) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    # helper body: if (wc1 != null) goto 18; wc1 = new nhs(); return wc1;
    body = (bytes([0x2A]) +                                   # aload_0
            bytes([0xB4]) + struct.pack('>H', wc1) +          # getfield wc1
            bytes([0xC7]) + struct.pack('>H', 14) +           # ifnonnull 18
            bytes([0x2A]) +                                   # aload_0
            bytes([0xBB]) + struct.pack('>H', nhs_cls) +      # new nhs
            bytes([0x59]) +                                   # dup
            bytes([0xB7]) + struct.pack('>H', nhs_init) +     # invokespecial nhs.<init>
            bytes([0xB5]) + struct.pack('>H', wc1) +          # putfield wc1
            bytes([0x2A]) +                                   # aload_0
            bytes([0xB4]) + struct.pack('>H', wc1) +          # getfield wc1
            bytes([0xB0]))                                    # areturn
    if len(body) != 23:
        raise SystemExit('FAIL-CLOSED: helper body is %d bytes' % len(body))
    smt = struct.pack('>H', 1) + bytes([18])                  # same_frame(@18)
    code_attr = (
        struct.pack('>H', 3) + struct.pack('>H', 1) +
        struct.pack('>I', len(body)) + body +
        struct.pack('>H', 0) +
        struct.pack('>H', 1) +
        struct.pack('>H', smt_i) + struct.pack('>I', len(smt)) + smt
    )
    method_info = (
        struct.pack('>H', 0x0002) +
        struct.pack('>H', name_i) + struct.pack('>H', desc_i) +
        struct.pack('>H', 1) +
        struct.pack('>H', code_utf) + struct.pack('>I', len(code_attr)) + code_attr
    )

    mc_pos, mc, methods_end = methods_table_range(new, Pool(new))
    out = bytearray(new[:methods_end]) + bytearray(method_info) + bytearray(new[methods_end:])
    struct.pack_into('>H', out, mc_pos, mc + 1)

    # helper_ref was resolved while appending the Methodref above
    if helper_ref is None:
        raise SystemExit('FAIL-CLOSED: helper Methodref was not created')

    redirects = 0
    for mname, mdesc, cfo, code, mp in patch_login.code_arrays(bytes(out)):
        if mname != 'vuw':
            continue
        for o, op, ops, ln in callscan.decode_instructions(code):
            if op != 0xB4:
                continue
            if struct.unpack_from('>H', ops, 0)[0] != wc1:
                continue
            if o < 1 or code[o - 1] != 0x2A:
                continue                       # needs the receiver already on stack
            out[cfo + o] = 0xB6                # getfield -> invokevirtual
            struct.pack_into('>H', out, cfo + o + 1, helper_ref)
            redirects += 1
    if redirects == 0:
        raise SystemExit('FAIL-CLOSED: no jej.vuw getfield wc1 sites redirected')

    io.open(dst, 'wb').write(bytes(out))
    print('jej: appended private %s%s, redirected %d read(s)'
          % (HELPER, HELPER_DESC, redirects))
    print('  methods_count %d -> %d' % (mc, mc + 1))
    if added:
        print('  appended to pool: %s' % added)


if __name__ == '__main__':
    main()
