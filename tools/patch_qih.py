#!/usr/bin/env python3
"""Flux: neutralise the login screen at the renderer, not at the gate.

Why this patch exists
---------------------
`q08.drawScreen` contains the ONLY `new qih` in the whole jar, and after patch P1
that block is provably unreachable.  Yet a live run still showed the login screen
and dispatched a mouse click into `qih.mouseClicked` (native) -> `qih.mjy`
(native) -> `prq.<init>`.  Exhaustive checks rule out every Java-side
construction route:

  * exactly one `invokespecial qih.<init>` exists in all 3,394 classes,
  * it is the site P1 made unreachable,
  * the single `q08.class` on the real classpath is the patched one,
  * the jar contains no duplicate entries and no second `q08.class` anywhere.

So the instance is created by `META-INF/Soter` (libsoter.dll) through JNI, which
is invisible to bytecode analysis.  Blocking the *creation* is therefore not
possible from Java.  Blocking the *rendering* is:

    public void qih.drawScreen(int, int, float) {
        c05.vz1().z2i(new q08());   // whatever put us here, go to the real menu
        return;
    }

`drawScreen` runs on every frame while the login screen is current, so the client
is kicked back to the Flux main menu immediately, and again if the native side
re-arms the screen.

Implementation note
-------------------
The whole `Code` attribute body is replaced with straight-line code (no branches,
no exception table, no stack map table), and only that attribute's own
`attribute_length` changes.  A `method_info` has no length field, so no enclosing
structure needs fixing.

Usage: patch_qih.py <in/qih.class> <out/qih.class>
"""
import io
import os
import struct
import sys

ATTRIBUTE_CODE = b'Code'


class Pool:
    """Minimal constant-pool reader/append-only writer."""

    def __init__(self, blob):
        self.blob = blob
        if struct.unpack_from('>I', blob, 0)[0] != 0xCAFEBABE:
            raise SystemExit('FAIL-CLOSED: not a class file')
        self.count = struct.unpack_from('>H', blob, 8)[0]
        self.entries = {}          # index -> (tag, payload_bytes)
        self.utf8 = {}             # index -> str
        self.cls = {}              # index -> class name
        self.nat = {}              # index -> (name, desc)
        self.ref = {}              # index -> (class_name, name, desc)
        off = 10
        i = 1
        while i < self.count:
            tag = blob[off]
            if tag == 1:
                ln = struct.unpack_from('>H', blob, off + 1)[0]
                raw = blob[off + 3:off + 3 + ln]
                self.utf8[i] = raw.decode('utf-8', 'replace')
                off += 3 + ln
            elif tag in (7, 8, 16, 19, 20):
                self.entries[i] = (tag, blob[off:off + 3])
                off += 3
            elif tag in (15,):
                off += 4
            elif tag in (3, 4, 9, 10, 11, 12, 17, 18):
                self.entries[i] = (tag, blob[off:off + 5])
                off += 5
            elif tag in (5, 6):
                self.entries[i] = (tag, blob[off:off + 9])
                off += 9
                i += 1             # long/double take two slots
            else:
                raise SystemExit('FAIL-CLOSED: unknown constant tag %d at %d' % (tag, off))
            i += 1
        self.end = off             # first byte after the constant pool
        for idx, (tag, payload) in self.entries.items():
            if tag == 7:
                self.cls[idx] = self.utf8.get(struct.unpack_from('>H', payload, 1)[0])
        for idx, (tag, payload) in self.entries.items():
            if tag == 12:
                n = struct.unpack_from('>H', payload, 1)[0]
                d = struct.unpack_from('>H', payload, 3)[0]
                self.nat[idx] = (self.utf8.get(n), self.utf8.get(d))
        for idx, (tag, payload) in self.entries.items():
            if tag in (9, 10, 11):          # Fieldref, Methodref, InterfaceMethodref
                c = struct.unpack_from('>H', payload, 1)[0]
                nt = struct.unpack_from('>H', payload, 3)[0]
                nm, de = self.nat.get(nt, (None, None))
                self.ref[idx] = (self.cls.get(c), nm, de)


def find_class(pool, name):
    for idx, n in pool.cls.items():
        if n == name:
            return idx
    return None


def find_ref(pool, cname, mname, mdesc, tags=(10, 11)):
    for idx, (tag, _p) in pool.entries.items():
        if tag not in tags:
            continue
        c, n, d = pool.ref.get(idx, (None, None, None))
        if c == cname and n == mname and d == mdesc:
            return idx
    return None


def find_method(blob, pool, name, desc):
    """Return (code_attr_body_offset, code_attr_length) for one method."""
    off = pool.end
    off += 6                                    # access_flags, this_class, super_class
    ifc = struct.unpack_from('>H', blob, off)[0]
    off += 2 + 2 * ifc                          # interfaces
    fc = struct.unpack_from('>H', blob, off)[0]
    off += 2
    for _ in range(fc):                         # fields
        off += 6
        ac = struct.unpack_from('>H', blob, off)[0]
        off += 2
        for _ in range(ac):
            ln = struct.unpack_from('>I', blob, off + 2)[0]
            off += 6 + ln
    mc = struct.unpack_from('>H', blob, off)[0]
    off += 2
    for _ in range(mc):                         # methods
        m_name = pool.utf8.get(struct.unpack_from('>H', blob, off + 2)[0])
        m_desc = pool.utf8.get(struct.unpack_from('>H', blob, off + 4)[0])
        ac = struct.unpack_from('>H', blob, off + 6)[0]
        aoff = off + 8
        for _ in range(ac):
            an = pool.utf8.get(struct.unpack_from('>H', blob, aoff)[0])
            alen = struct.unpack_from('>I', blob, aoff + 2)[0]
            body = aoff + 6
            if m_name == name and m_desc == desc and an == 'Code':
                return body, alen
            aoff = body + alen
        off = aoff
    raise SystemExit('FAIL-CLOSED: method %s%s not found' % (name, desc))


def append_utf8(blob, text):
    raw = text.encode('utf-8')
    return blob + bytes([1]) + struct.pack('>H', len(raw)) + raw, len(raw) + 3


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count

    needs = [
        ('class', 'c05'),
        ('class', 'q08'),
        ('ref', 'c05', 'vz1', '()Lc05;'),
        ('ref', 'q08', '<init>', '()V'),
        ('ref', 'c05', 'z2i', '(Lgbe;)V'),
    ]

    # append missing pool entries; appending never renumbers an existing index
    idx = {}
    added = []
    pool_blob = blob[:pool.end]
    tail = blob[pool.end:]
    for kind, *rest in needs:
        if kind == 'class':
            name = rest[0]
            if name in idx:
                continue
            i = find_class(pool, name)
            if i is None:
                pool_blob, dl = append_utf8(pool_blob, name)
                utf = count
                count += 1
                pool_blob += bytes([7]) + struct.pack('>H', utf)
                i = count
                count += 1
                added.append('Class %s = #%d' % (name, i))
            idx[name] = i
        else:
            cname, mname, mdesc = rest
            key = (cname, mname, mdesc)
            i = find_ref(pool, cname, mname, mdesc)
            if i is None:
                # class must already be present
                cidx = idx.get(cname) or find_class(pool, cname)
                if cidx is None:
                    raise SystemExit('FAIL-CLOSED: class %s missing for ref %s' % (cname, key))
                pool_blob, _ = append_utf8(pool_blob, mname)
                nidx = count
                count += 1
                pool_blob, _ = append_utf8(pool_blob, mdesc)
                didx = count
                count += 1
                pool_blob += bytes([12]) + struct.pack('>H', nidx) + struct.pack('>H', didx)
                nt = count
                count += 1
                pool_blob += bytes([10]) + struct.pack('>H', cidx) + struct.pack('>H', nt)
                i = count
                count += 1
                added.append('Methodref %s.%s%s = #%d' % (cname, mname, mdesc, i))
            idx[key] = i

    # assemble the new file: pool (grown) + rest, with constant_pool_count fixed
    new = bytearray(pool_blob) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)

    # re-parse the grown file so offsets are authoritative
    pool2 = Pool(bytes(new))
    body, alen = find_method(bytes(new), pool2, 'drawScreen', '(IIF)V')

    max_stack = struct.unpack_from('>H', new, body)[0]
    max_locals = struct.unpack_from('>H', new, body + 2)[0]
    old_len = struct.unpack_from('>I', new, body + 4)[0]

    body_code = (
        bytes([0xB8]) + struct.pack('>H', idx['c05', 'vz1', '()Lc05;']) +   # invokestatic c05.vz1()
        bytes([0xBB]) + struct.pack('>H', idx['q08']) +                    # new q08
        bytes([0x59]) +                                                    # dup
        bytes([0xB7]) + struct.pack('>H', idx['q08', '<init>', '()V']) +   # invokespecial q08.<init>
        bytes([0xB6]) + struct.pack('>H', idx['c05', 'z2i', '(Lgbe;)V']) +  # invokevirtual c05.z2i
        bytes([0xB1])                                                      # return
    )
    if len(body_code) != 14:
        raise SystemExit('FAIL-CLOSED: body is %d bytes' % len(body_code))

    # Code attribute body: straight-line code, no handlers, no attributes
    code_attr = (
        struct.pack('>H', max(max_stack, 3)) +
        struct.pack('>H', max_locals) +
        struct.pack('>I', len(body_code)) + body_code +
        struct.pack('>H', 0) +      # exception_table_length
        struct.pack('>H', 0)        # attributes_count (drops StackMapTable etc.)
    )

    # body - 6 is the start of the Code attribute header: name_index(u2)+length(u4).
    # Both must be re-emitted; dropping name_index produces
    # "Invalid method attribute name index 0".
    code_name_index = struct.unpack_from('>H', new, body - 6)[0]

    out = bytearray(new[:body - 6])           # everything up to the attribute header
    out += struct.pack('>H', code_name_index)  # attribute_name_index (unchanged)
    out += struct.pack('>I', len(code_attr))   # attribute_length
    out += code_attr
    out += new[body + alen:]                   # everything after the old Code attribute
    io.open(dst, 'wb').write(bytes(out))

    print('qih.drawScreen rewritten')
    print('  appended pool entries : %s' % (added or 'none'))
    print('  max_stack %d -> %d   max_locals %d' % (max_stack, max(max_stack, 3), max_locals))
    print('  code %d bytes -> %d bytes   attribute %d -> %d bytes' %
          (old_len, len(body_code), alen, len(code_attr)))
    print('  new body: invokestatic c05.vz1() ; new q08 ; dup ; invokespecial q08.<init>() ; '
          'invokevirtual c05.z2i(Lgbe;)V ; return')


if __name__ == '__main__':
    main()
