#!/usr/bin/env python3
"""Flux: close out the remaining native-populated singletons.

`zwr` is the client's global state holder.  Of its 13 object-valued instance
fields, 8 are assigned ONLY by the native layer - there is no Java writer anywhere
in the 3,394 classes, because a successful login is what populates them.  Seven of
them have a plain `return this.<field>;` getter:

    zwr.up0() -> fge : szk      zwr.up6() -> e6f : _x3     zwr.dlc() -> em8 : txz
    zwr.pev() -> fji : b4o      zwr.zr7() -> j76 : az4     zwr.w34() -> kly : f62
    zwr.gt2() -> pfn : lxj

(the eighth, `cw_ : g5m`, has no getter; its readers are already safe - `gbe.g76`
null-checks it and patch P5 removed the unguarded use in `q08.drawScreen`.)

With login bypassed every getter returns null, so every caller NPEs.  The crash
this patch was written for:

    java.lang.NullPointerException
        at ar7.tp_                 (the ClickGUI keybind handler)
        at c05.tur                 (input dispatch)
    because ar7.tp_ ends with  zwr.qkk.up0().m0g()

Part 1 - the seven getters, rewritten as

        public szk up0() {
            if (this.fge == null) this.fge = new szk();
            return this.fge;
        }

    one forward branch, explicit StackMapTable `same_frame(@18)`.

Part 2 - `lxj.<init>`, which has the same shape as `kgt.<init>`:

         0: aload_0
         1: invokespecial java/lang/Object.<init>()V
         4: aload_0 ; new ArrayList ; ... ; putfield bcd
        15: aload_0
        16: invokevirtual lxj.ib5()V          <-- NATIVE, the only writer of bcd
        19: aload_0 ; getfield bcd ; ... ; List.sort
        36: return

    The native call is wrapped, not removed: an appended handler plus an exception
    table entry keep the failure from crashing the client while still allowing the
    sort to run if `ib5()` does complete.

Usage: patch_singletons.py <class-root> <outdir>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from patch_qih import Pool, find_class, find_ref, append_utf8, find_method
from patch_login import code_arrays

GETTERS = [
    ('up0', 'fge', 'szk'),
    ('up6', 'e6f', '_x3'),
    ('dlc', 'em8', 'txz'),
    ('pev', 'fji', 'b4o'),
    ('zr7', 'j76', 'az4'),
    ('w34', 'kly', 'f62'),
    ('gt2', 'pfn', 'lxj'),
]
GETTER_FIELD = {g: f for g, f, _t in GETTERS}
GETTER_TYPE = {g: t for g, _f, t in GETTERS}
FRAME_OFFSET = 18
SMT = 'StackMapTable'


def grow_pool(blob, want_classes, want_utf8, want_refs):
    """Append every missing constant and return (new_blob, index maps).

    want_refs: iterable of (class_name, member_name, member_desc, tag).
    Appending never renumbers an existing index, so callers may resolve freely.
    """
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    tail = blob[pool.end:]
    added = []

    idx_class = {}
    for name in want_classes:
        i = find_class(pool, name)
        if i is None:
            pb, _ = append_utf8(pb, name)
            pb += bytes([7]) + struct.pack('>H', count)
            i = count + 1
            count += 2
            added.append('Class %s = #%d' % (name, i))
        idx_class[name] = i

    idx_utf8 = {}
    for text in want_utf8:
        found = None
        for i, v in pool.utf8.items():
            if v == text:
                found = i
                break
        if found is None:
            pb, _ = append_utf8(pb, text)
            found = count
            count += 1
            added.append('Utf8 %s = #%d' % (text, found))
        idx_utf8[text] = found

    idx_ref = {}
    for cname, mname, mdesc, tag in want_refs:
        i = find_ref(pool, cname, mname, mdesc, tags=(tag,))
        if i is None:
            ci = idx_class.get(cname) or find_class(pool, cname)
            if ci is None:
                raise SystemExit('FAIL-CLOSED: class %s missing for ref %s.%s%s'
                                 % (cname, cname, mname, mdesc))
            pb, _ = append_utf8(pb, mname)
            n = count
            count += 1
            pb, _ = append_utf8(pb, mdesc)
            d = count
            count += 1
            pb += bytes([12]) + struct.pack('>H', n) + struct.pack('>H', d)
            nt = count
            count += 1
            pb += bytes([tag]) + struct.pack('>H', ci) + struct.pack('>H', nt)
            i = count
            count += 1
            added.append('Ref %s.%s%s = #%d' % (cname, mname, mdesc, i))
        idx_ref[(cname, mname, mdesc, tag)] = i

    new = bytearray(pb) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    return bytes(new), idx_class, idx_utf8, idx_ref, added


def replace_code(blob, out_path, plan, utf8_idx):
    """plan: {(name, desc): (new_code, exc_bytes_list, max_stack_or_None,
                             max_locals_or_None, stackmap_or_None)}"""
    out = bytearray(blob)
    done = 0
    for (mname, mdesc), (new_code, exc, ns, nl, smt) in plan.items():
        body, alen = find_method(bytes(out), Pool(bytes(out)), mname, mdesc)
        name_index = struct.unpack_from('>H', out, body - 6)[0]
        max_stack, max_locals = struct.unpack_from('>HH', out, body)
        attrs = b''
        nattrs = 0
        if smt is not None:
            attrs = (struct.pack('>H', utf8_idx[SMT]) +
                     struct.pack('>I', len(smt)) + smt)
            nattrs = 1
        attr = (
            struct.pack('>H', ns if ns is not None else max_stack) +
            struct.pack('>H', nl if nl is not None else max_locals) +
            struct.pack('>I', len(new_code)) + new_code +
            struct.pack('>H', len(exc)) + b''.join(exc) +
            struct.pack('>H', nattrs) + attrs
        )
        o = bytearray(out[:body - 6])
        o += struct.pack('>H', name_index)
        o += struct.pack('>I', len(attr))
        o += attr
        o += out[body + alen:]
        out = o
        done += 1
    if done != len(plan):
        raise SystemExit('FAIL-CLOSED: patched %d/%d methods' % (done, len(plan)))
    io.open(out_path, 'wb').write(bytes(out))


def patch_zwr(root, outdir):
    blob = io.open(os.path.join(root, 'zwr.class'), 'rb').read()
    types = sorted({t for _g, _f, t in GETTERS})
    want_refs = [(t, '<init>', '()V', 10) for t in types]
    blob2, idx_class, idx_utf8, idx_ref, added = grow_pool(
        blob, types, [SMT], want_refs)

    plan = {}
    for getter, field, typ in GETTERS:
        fi = find_ref(Pool(blob2), 'zwr', field, 'L%s;' % typ, tags=(9,))
        ci = idx_class[typ]
        init = idx_ref[(typ, '<init>', '()V', 10)]
        code = (
            bytes([0x2A]) + bytes([0xB4]) + struct.pack('>H', fi) +
            bytes([0xC7]) + struct.pack('>H', FRAME_OFFSET - 4) +
            bytes([0x2A]) + bytes([0xBB]) + struct.pack('>H', ci) +
            bytes([0x59]) + bytes([0xB7]) + struct.pack('>H', init) +
            bytes([0xB5]) + struct.pack('>H', fi) +
            bytes([0x2A]) + bytes([0xB4]) + struct.pack('>H', fi) +
            bytes([0xB0])
        )
        if len(code) != 23:
            raise SystemExit('FAIL-CLOSED: getter body is %d bytes' % len(code))
        smt = struct.pack('>H', 1) + bytes([FRAME_OFFSET])
        plan[(getter, '()L%s;' % typ)] = (code, [], 3, None, smt)

    replace_code(blob2, os.path.join(outdir, 'zwr.class'), plan, idx_utf8)
    print('zwr: %d singleton getters rewritten to lazy init' % len(GETTERS))
    for g, f, t in GETTERS:
        print('   %-4s() -> %-6s (field %s)' % (g, t, f))
    if added:
        print('  appended to pool: %s' % added)


def patch_lxj(root, outdir):
    blob = io.open(os.path.join(root, 'lxj.class'), 'rb').read()
    orig = None
    for mname, mdesc, cfo, code, mp in code_arrays(blob):
        if mname == '<init>' and mdesc == '()V':
            orig = code
            break
    if orig is None:
        raise SystemExit('FAIL-CLOSED: lxj.<init>()V not found')
    if len(orig) != 37 or orig[16] != 0xB6:
        raise SystemExit('FAIL-CLOSED: lxj.<init> shape changed (%d bytes, op@16=0x%02x)'
                         % (len(orig), orig[16] if len(orig) > 16 else 0))

    blob2, idx_class, idx_utf8, _r, added = grow_pool(
        blob, ['lxj', 'java/lang/Throwable'], [SMT], [])
    self_c = idx_class['lxj']
    thr_c = idx_class['java/lang/Throwable']

    code = bytes(orig) + bytes([0x4C, 0xB1])            # astore_1 ; return
    exc = [struct.pack('>HHHH', 15, 36, 37, thr_c)]     # [15,36) -> 37
    smt = (struct.pack('>H', 1) +
           bytes([0xFF]) + struct.pack('>H', 37) +
           struct.pack('>H', 1) + bytes([7]) + struct.pack('>H', self_c) +
           struct.pack('>H', 1) + bytes([7]) + struct.pack('>H', thr_c))
    replace_code(blob2, os.path.join(outdir, 'lxj.class'),
                 {('<init>', '()V'): (code, exc, None, 2, smt)}, idx_utf8)
    print('lxj.<init>: native ib5() call wrapped in try/catch (code 37 -> %d bytes)'
          % len(code))
    if added:
        print('  appended to pool: %s' % added)


def main():
    root, outdir = sys.argv[1], sys.argv[2]
    os.makedirs(outdir, exist_ok=True)
    patch_zwr(root, outdir)
    print()
    patch_lxj(root, outdir)


if __name__ == '__main__':
    main()
