#!/usr/bin/env python3
"""Flux: rebuild kgt.<init> so a null module never enters kgt.vuo.

Why this shape
--------------
P9 replaced the original native-populated registry bootstrap with 98 straight-line
registrations:

    kgt.vuo.add(kgt.dej);
    kgt.vuo.add(kgt.nd5);
    ...

`kgt.vuo` is what the keybind dispatcher in c05.tur walks:

    for (ar7 m : zwr.qkk.zj2().wau()) { if (m.x_i() == key) m.tp_(); }

so a single null - a module whose static field the native layer was supposed to
fill in, exactly like c05.ezu and the zwr singletons - makes that loop throw a
whole-method NPE at c05.tur, which is what "any key press crashes" looks like.

Design constraints that shaped this patch
-----------------------------------------
* The first attempt added a helper method plus its constant-pool entries and the
  pool construction drifted, producing an unloadable class.  This version touches
  **no pool entries at all**: every reference it needs (kgt.vuo, the 98 module
  fields, java/util/ArrayList.add, the invokedynamic lambda, the Comparator call)
  already exists.

* A guard needs a branch, and kgt.<init> had no StackMapTable.  The chosen shape
  puts the value in local slot 1 first so that the single branch target has an
  EMPTY operand stack, and every target's locals are (kgt, Object) - one
  full_frame per module and nothing else:

      getstatic  kgt.<module>          value      (pushed once)
      astore_1                         -> locals (this, value)
      aload_1 / ifnull NEXT            empty stack at NEXT
      getstatic  kgt.vuo
      aload_1
      invokevirtual ArrayList.add
      pop
  NEXT:

Usage: patch_registry_guard.py <in/kgt.class> <out/kgt.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, find_ref

VUO_OWNER, VUO_NAME, VUO_DESC = 'kgt', 'vuo', 'Ljava/util/ArrayList;'
ADD_OWNER, ADD_NAME, ADD_DESC = 'java/util/ArrayList', 'add', '(Ljava/lang/Object;)Z'
SMT_NAME = 'StackMapTable'


def u2(v):
    return struct.pack('>H', v)


def parse_class(blob):
    """Return the byte ranges of the header, pool, fields, methods and class attrs."""
    pool = Pool(blob)
    p = pool.end
    p += 6
    ifc = struct.unpack_from('>H', blob, p)[0]
    p += 2 + 2 * ifc
    fc = struct.unpack_from('>H', blob, p)[0]
    p += 2
    for _ in range(fc):
        p += 6
        ac = struct.unpack_from('>H', blob, p)[0]
        p += 2
        for _ in range(ac):
            p += 6 + struct.unpack_from('>I', blob, p + 2)[0]
    methods_start = p
    mc = struct.unpack_from('>H', blob, p)[0]
    q = p + 2
    methods = []
    for _ in range(mc):
        acc, ni, di = struct.unpack_from('>HHH', blob, q)
        nac = struct.unpack_from('>H', blob, q + 6)[0]
        r = q + 8
        attrs = []
        for _ in range(nac):
            an = struct.unpack_from('>H', blob, r)[0]
            al = struct.unpack_from('>I', blob, r + 2)[0]
            attrs.append((r, an, al))
            r += 6 + al
        methods.append((q, r, acc, ni, di, attrs))
        q = r
    return pool, methods_start, methods, q


def rebuild(blob, want='<init>', desc='()V'):
    pool, methods_start, methods, class_attrs_at = parse_class(blob)

    target = None
    for (ms, me, acc, ni, di, attrs) in methods:
        if pool.utf8.get(ni) == want and pool.utf8.get(di) == desc:
            target = (ms, me, acc, ni, di, attrs)
            break
    if target is None:
        raise SystemExit('FAIL-CLOSED: %s%s not found' % (want, desc))
    ms, me, acc, ni, di, attrs = target

    code_attr = None
    extra_attrs = []
    for (ar, an, al) in attrs:
        if pool.utf8.get(an) == 'Code':
            code_attr = (ar, al)
        else:
            extra_attrs.append((ar, al))
    if code_attr is None:
        raise SystemExit('FAIL-CLOSED: no Code attribute')
    ar, al = code_attr

    body = ar + 6
    max_stack, max_locals = struct.unpack_from('>HH', blob, body)
    code_len = struct.unpack_from('>I', blob, body + 4)[0]
    code = blob[body + 8:body + 8 + code_len]
    p = body + 8 + code_len
    etl = struct.unpack_from('>H', blob, p)[0]
    exc = blob[p + 2:p + 2 + 8 * etl]
    q = p + 2 + 8 * etl
    nac = struct.unpack_from('>H', blob, q)[0]
    q += 2
    tail_attrs = []
    for _ in range(nac):
        an = struct.unpack_from('>H', blob, q)[0]
        ln = struct.unpack_from('>I', blob, q + 2)[0]
        name = pool.utf8.get(an)
        if name != SMT_NAME:
            tail_attrs.append(blob[q:q + 6 + ln])
        q += 6 + ln

    # ---- read the existing registrations in order -------------------------
    insns = list(callscan.decode_instructions(code))
    vuo_ref = find_ref(pool, VUO_OWNER, VUO_NAME, VUO_DESC, tags=(9,))
    add_ref = find_ref(pool, ADD_OWNER, ADD_NAME, ADD_DESC)
    if vuo_ref is None:
        raise SystemExit('FAIL-CLOSED: Fieldref kgt.vuo not found')
    if add_ref is None:
        raise SystemExit('FAIL-CLOSED: Methodref ArrayList.add not found')

    modules = []
    last_end = None
    for i, (off, op, ops, ln) in enumerate(insns):
        if op != 0xB2 or struct.unpack_from('>H', ops, 0)[0] != vuo_ref:
            continue
        if i + 3 >= len(insns):
            break
        _, op2, ops2, _ = insns[i + 1]
        _, op3, ops3, _ = insns[i + 2]
        _, op4, ops4, _ = insns[i + 3]
        if op2 != 0xB2 or op3 != 0xB6 or op4 != 0x57:
            continue
        if struct.unpack_from('>H', ops3, 0)[0] != add_ref:
            continue
        modules.append(struct.unpack_from('>H', ops2, 0)[0])
        # callscan reports ln == 0 for `pop`, so never derive the end from
        # offset + ln here; take the start of the next instruction instead.
        last_end = insns[i + 4][0] if i + 4 < len(insns) else len(code)
    if not modules:
        raise SystemExit('FAIL-CLOSED: no registration sites found')

    tail = code[last_end:]
    if not tail.endswith(b'\xb1'):
        raise SystemExit('FAIL-CLOSED: unexpected tail %s' % tail[-4:].hex(' '))

    # ---- emit the guarded body -------------------------------------------
    out = bytearray()
    out += bytes([0x2A])                                        # aload_0
    out += bytes([0xB7]) + u2(find_ref(pool, 'java/lang/Object', '<init>', '()V'))
    frames = []
    for fld in modules:
        out += bytes([0xB2]) + u2(fld)                          # getstatic <module>
        out += bytes([0x3A, 0x01])                              # astore_1
        out += bytes([0x19, 0x01])                              # aload_1
        out += bytes([0xC6, 0x00, 0x00])                        # ifnull NEXT (patched)
        patch_at = len(out) - 2
        out += bytes([0xB2]) + u2(vuo_ref)                      # getstatic kgt.vuo
        out += bytes([0x19, 0x01])                              # aload_1
        out += bytes([0xB6]) + u2(add_ref)                      # ArrayList.add
        out += bytes([0x57])                                    # pop
        next_off = len(out)
        struct.pack_into('>h', out, patch_at, next_off - (patch_at - 1))
        frames.append(next_off)
    out += tail

    # ---- StackMapTable: one full_frame per branch target -----------------
    obj_i = find_class(pool, 'java/lang/Object')
    this_i = find_class(pool, 'kgt')
    if obj_i is None or this_i is None:
        raise SystemExit('FAIL-CLOSED: need Class java/lang/Object and kgt')
    buf = bytearray()
    buf += u2(len(frames))
    prev = -1
    for f in frames:
        delta = f - prev - 1
        buf += bytes([0xFF]) + u2(delta)
        buf += u2(2) + bytes([7]) + u2(this_i) + bytes([7]) + u2(obj_i)
        buf += u2(0)
        prev = f
    smt = bytes(buf)

    # ---- reassemble the Code attribute -----------------------------------
    new_code = bytes(out)
    attr = (u2(max(max_stack, 2)) + u2(max(max_locals, 2)) + struct.pack('>I', len(new_code)) +
            new_code + u2(etl) + exc +
            u2(len(tail_attrs) + 1) + b''.join(tail_attrs) +
            u2(find_utf8(pool, SMT_NAME)) + struct.pack('>I', len(smt)) + smt)

    o = bytearray(blob[:ar])
    o += u2(find_utf8(pool, 'Code'))
    o += struct.pack('>I', len(attr))
    o += attr
    o += blob[ar + 6 + al:]
    return bytes(o), {
        'modules': len(modules),
        'code': '%d -> %d' % (code_len, len(new_code)),
        'frames': len(frames),
        'max_locals': '%d -> %d' % (max_locals, max(max_locals, 2)),
        'tail': '%d bytes preserved' % len(tail),
    }


def find_utf8(pool, text):
    for i, v in pool.utf8.items():
        if v == text:
            return i
    raise SystemExit('FAIL-CLOSED: Utf8 %r missing (patch adds no pool entries)' % text)


if __name__ == '__main__':
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    out, rep = rebuild(blob)
    io.open(dst, 'wb').write(out)
    for k in ('modules', 'code', 'frames', 'max_locals', 'tail'):
        print('  %-11s %s' % (k, rep[k]))
