#!/usr/bin/env python3
"""Flux: rebuild the feature registry (`kgt.vuo`) in Java, because the native
registrar cannot run in this build.

Background
----------
`kgt` is Flux's feature registry and `kgt.vuo` (`java.util.ArrayList`) is the list
the client walks when it dispatches input:

    c05.tur   -> zwr.zj2().wau().iterator()          (input dispatch / keybinds)
    kgt.vc3   -> vuo.stream().filter(...)            (lookup)
    fkf$afe.g71 / fkf$r79.x5_ / smq.w0y -> iterate
    c7u.run   -> vuo.size()
    c7u.wq_   -> vuo.stream().filter(...).count()

`vuo` has exactly ONE writer in all 3,394 classes - `new ArrayList()` in
`kgt.<clinit>` - and **none of the eight readers ever calls `ArrayList.add`**.
So the list is populated exclusively by the native method `kgt.eyk()`, which
`kgt.<init>` calls immediately before `vuo.sort(...)`:

    kgt.<init>  0: aload_0
                1: invokespecial java/lang/Object.<init>()V
                4: aload_0
                5: invokevirtual kgt.eyk()V          <-- the only registrar
                8: getstatic kgt.vuo
               11: invokedynamic apply                 -> Function<ar7,String>
               16: Comparator.comparing
               19: ArrayList.sort(Comparator)
               22: return

`eyk()` cannot run: it builds a `java.awt.Color` from out-of-range values and
throws `IllegalArgumentException` on both Java 8 and Java 21.  Wrapping it in a
try/catch (the first version of P9') stops the crash but cannot make it register
anything, which is exactly why the Right-Shift ClickGUI keybind stayed dead.

What this patch does
--------------------
`kgt.<clinit>` already constructs every module and parks it in a static field -
98 of them, every one a subclass of `ar7`:

    kgt.dej : rlx    kgt.nd5 : fyk    kgt.irb : f5k   ...   kgt.l33 : nlh

So `kgt.<init>` is rewritten to build the registry itself, straight-line:

    aload_0 ; invokespecial Object.<init>()V
    for each of the 98 module fields:
        getstatic kgt.vuo
        getstatic kgt.<field>
        invokevirtual java/util/ArrayList.add(Object)Z
        pop
    getstatic kgt.vuo
    invokedynamic #244 apply                  (the class's own Function<ar7,String>)
    invokestatic java/util/Comparator.comparing
    invokevirtual java/util/ArrayList.sort(Comparator)V
    return

There are no branches, so no StackMapTable is required, the exception table is
empty, and because a `method_info` has no length field only this one Code
attribute changes.  The comparator is the class's own lambda, whose instantiated
type is `(Lar7;)Ljava/lang/String;`, so every element added is type-correct.

The native `eyk()` call is dropped rather than wrapped: it throws unconditionally
in this build, so it provably registers nothing today.

Usage: patch_registry.py <in/kgt.class> <out/kgt.class> <class-root>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import patch_login
from patch_qih import Pool, find_ref, append_utf8, find_method
from scan_kgt_modules import fields_of, super_chain

MODULE_BASE = 'ar7'
ADD_DESC = '(Ljava/lang/Object;)Z'


def module_fields(root, path):
    out = []
    for acc, name, desc in fields_of(path):
        if not (acc & 0x0008):                       # only statics
            continue
        if not desc.startswith('L') or not desc.endswith(';'):
            continue
        cls = desc[1:-1]
        chain, _complete = super_chain(root, cls)
        if MODULE_BASE in chain:
            out.append((name, desc))
    return out


def main():
    src, dst, root = sys.argv[1], sys.argv[2], sys.argv[3]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)

    modules = module_fields(root, src)
    if len(modules) < 50:
        raise SystemExit('FAIL-CLOSED: only %d modules found, expected ~98' % len(modules))

    # --- resolve / append pool entries
    added = []
    count = pool.count
    pool_blob = blob[:pool.end]
    tail = blob[pool.end:]

    def need_field(name, desc):
        i = find_ref(pool, 'kgt', name, desc, tags=(9,))
        if i is None:
            raise SystemExit('FAIL-CLOSED: Fieldref kgt.%s:%s not found' % (name, desc))
        return i

    def need_ref(cname, mname, mdesc):
        # search both Methodref and InterfaceMethodref: Comparator.comparing is a
        # static interface method, so it is stored as an InterfaceMethodref.
        i = find_ref(pool, cname, mname, mdesc, tags=(10, 11))
        return i

    vuo_i = need_field('vuo', 'Ljava/util/ArrayList;')
    obj_init = need_ref('java/lang/Object', '<init>', '()V')
    sort_i = need_ref('java/util/ArrayList', 'sort', '(Ljava/util/Comparator;)V')
    cmp_i = need_ref('java/util/Comparator', 'comparing', '(Ljava/util/function/Function;)Ljava/util/Comparator;')
    if obj_init is None or sort_i is None or cmp_i is None:
        raise SystemExit('FAIL-CLOSED: missing Object.<init>=%s sort=%s comparing=%s'
                         % (obj_init, sort_i, cmp_i))

    indy = 244
    tag, pl = pool.entries[indy]
    if tag != 18:
        raise SystemExit('FAIL-CLOSED: constant #%d is not InvokeDynamic' % indy)

    add_i = find_ref(pool, 'java/util/ArrayList', 'add', ADD_DESC, tags=(10,))
    if add_i is None:
        nonlocal_count = count
        pool_blob, _ = append_utf8(pool_blob, 'add')
        n = nonlocal_count
        nonlocal_count += 1
        pool_blob, _ = append_utf8(pool_blob, ADD_DESC)
        d = nonlocal_count
        nonlocal_count += 1
        pool_blob += bytes([12]) + struct.pack('>H', n) + struct.pack('>H', d)
        nt = nonlocal_count
        nonlocal_count += 1
        arr_cls = None
        for idx, cname in pool.cls.items():
            if cname == 'java/util/ArrayList':
                arr_cls = idx
                break
        if arr_cls is None:
            raise SystemExit('FAIL-CLOSED: Class java/util/ArrayList not in pool')
        pool_blob += bytes([10]) + struct.pack('>H', arr_cls) + struct.pack('>H', nt)
        add_i = nonlocal_count
        nonlocal_count += 1
        count = nonlocal_count
        added.append('Methodref ArrayList.add%s = #%d' % (ADD_DESC, add_i))

    new = bytearray(pool_blob) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    pool2 = Pool(new)
    body, alen = find_method(new, pool2, '<init>', '()V')
    code_name_index = struct.unpack_from('>H', new, body - 6)[0]
    max_locals = struct.unpack_from('>H', new, body + 2)[0]

    # --- build the new straight-line body
    code = bytearray()
    code += bytes([0x2A])                                   # aload_0
    code += bytes([0xB7]) + struct.pack('>H', obj_init)     # invokespecial Object.<init>
    for name, desc in modules:
        fi = need_field(name, desc)
        code += bytes([0xB2]) + struct.pack('>H', vuo_i)    # getstatic vuo
        code += bytes([0xB2]) + struct.pack('>H', fi)       # getstatic kgt.<field>
        code += bytes([0xB6]) + struct.pack('>H', add_i)    # invokevirtual add
        code += bytes([0x57])                               # pop
    code += bytes([0xB2]) + struct.pack('>H', vuo_i)        # getstatic vuo
    code += bytes([0xBA]) + struct.pack('>H', indy) + b'\x00\x00'   # invokedynamic
    code += bytes([0xB8]) + struct.pack('>H', cmp_i)        # Comparator.comparing
    code += bytes([0xB6]) + struct.pack('>H', sort_i)       # ArrayList.sort
    code += bytes([0xB1])                                   # return

    code_attr = (
        struct.pack('>H', 2) +                              # max_stack (list, module)
        struct.pack('>H', max_locals) +
        struct.pack('>I', len(code)) + bytes(code) +
        struct.pack('>H', 0) +                              # exception_table_length
        struct.pack('>H', 0)                                # attributes_count
    )

    out = bytearray(new[:body - 6])
    out += struct.pack('>H', code_name_index)
    out += struct.pack('>I', len(code_attr))
    out += code_attr
    out += new[body + alen:]
    io.open(dst, 'wb').write(bytes(out))

    print('kgt.<init>: the feature registry is now built in Java')
    print('  modules registered : %d (every kgt static whose type extends ar7)' % len(modules))
    print('  appended pool      : %s' % (added or 'none'))
    print('  code %d -> %d bytes ; attribute %d -> %d bytes'
          % (struct.unpack_from('>I', new, body + 4)[0], len(code), alen, len(code_attr)))
    print('  native eyk() dropped (it throws unconditionally in this build)')


if __name__ == '__main__':
    main()
