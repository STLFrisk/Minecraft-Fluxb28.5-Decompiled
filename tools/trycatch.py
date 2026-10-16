#!/usr/bin/env python3
"""Wrapping a whole method body in a catch-all, without moving any offset.

Appending `<astore N> ; return` after the existing `return` and adding one
exception-table entry that covers the original body keeps every original bytecode
offset - and therefore every existing branch target and stack map frame - exactly
where it was.  The only new metadata is one stack map frame for the handler.

Reusable helper: `wrap(blob, method, desc, throwable_class, max_locals_hint)`.
"""
import struct

from patch_qih import Pool, find_class, append_utf8, find_method
from patch_login import code_arrays


def _vti_len(data, p):
    tag = data[p]
    if tag <= 6:
        return 1
    if tag in (7, 8):
        return 3
    raise ValueError('bad verification_type_info tag %d' % tag)


def parse_stackmap(data):
    """Return (entry_count, bytes_consumed, [frame_offsets], last_offset)."""
    n = struct.unpack_from('>H', data, 0)[0]
    p = 2
    offs = []
    cur = -1
    for _ in range(n):
        ft = data[p]
        p += 1
        if ft <= 63:
            delta = ft
        elif ft <= 127:
            delta = ft - 64
            p += _vti_len(data, p)
        elif ft == 247:
            delta = struct.unpack_from('>H', data, p)[0]; p += 2
            p += _vti_len(data, p)
        elif ft <= 250:
            delta = struct.unpack_from('>H', data, p)[0]; p += 2
        elif ft == 251:
            delta = struct.unpack_from('>H', data, p)[0]; p += 2
        elif ft <= 254:
            delta = struct.unpack_from('>H', data, p)[0]; p += 2
            for _ in range(ft - 251):
                p += _vti_len(data, p)
        elif ft == 255:
            delta = struct.unpack_from('>H', data, p)[0]; p += 2
            nl = struct.unpack_from('>H', data, p)[0]; p += 2
            for _ in range(nl):
                p += _vti_len(data, p)
            ns = struct.unpack_from('>H', data, p)[0]; p += 2
            for _ in range(ns):
                p += _vti_len(data, p)
        else:
            raise ValueError('bad stack map frame type %d' % ft)
        cur = cur + delta + 1
        offs.append(cur)
    return n, p, offs, cur


def _default_return(desc):
    """(opcodes, extra_stack) that produce a default value of the return type.

    A catch-all handler must leave a value of the declared return type on the
    stack, so the appended handler tail depends on the descriptor.  Handled
    in-place: the handler's own evaluation depth is 1 for a reference/int and 2
    for a long/double.
    """
    ret = desc[desc.index(')') + 1:]
    if ret == 'V':
        return bytes([0xB1]), 0                                  # return
    if ret[0] == 'L' or ret[0] == '[':
        return bytes([0x01, 0xB0]), 0                            # aconst_null ; areturn
    if ret in ('J',):
        return bytes([0x09, 0xAD]), 1                            # lconst_0 ; lreturn
    if ret in ('D',):
        return bytes([0x0E, 0xAF]), 1                            # dconst_0 ; dreturn
    if ret in ('F',):
        return bytes([0x0B, 0xAE]), 0                            # fconst_0 ; freturn
    return bytes([0x03, 0xAC]), 0                                # iconst_0 ; ireturn


def wrap(blob, method, desc, throwable='java/lang/Throwable', handler_code=b''):
    """Wrap one method's whole body in try/catch(Throwable){return default}.

    `handler_code` is raw bytecode inserted immediately after the `astore` that
    parks the Throwable, with that slot on the local stack; it may be empty.  It
    lets a caller log from inside the handler to prove whether the catch fires.

    Returns (new_blob, report_dict).
    """
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    tail = blob[pool.end:]
    added = []

    thr = find_class(pool, throwable)
    if thr is None:
        pb, _ = append_utf8(pb, throwable)
        pb += bytes([7]) + struct.pack('>H', count)
        thr = count + 1
        count += 2
        added.append('Class %s = #%d' % (throwable, thr))

    smt_name_idx = None
    for i, v in pool.utf8.items():
        if v == 'StackMapTable':
            smt_name_idx = i
            break
    if smt_name_idx is None:
        pb, _ = append_utf8(pb, 'StackMapTable')
        smt_name_idx = count
        count += 1
        added.append('Utf8 StackMapTable = #%d' % smt_name_idx)

    new = bytearray(pb) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    body, alen = find_method(new, Pool(new), method, desc)
    name_index = struct.unpack_from('>H', new, body - 6)[0]
    max_stack, max_locals = struct.unpack_from('>HH', new, body)
    code_len = struct.unpack_from('>I', new, body + 4)[0]
    code = new[body + 8:body + 8 + code_len]
    p = body + 8 + code_len
    etl = struct.unpack_from('>H', new, p)[0]
    p += 2
    exc = [new[p + 8 * i:p + 8 * i + 8] for i in range(etl)]
    p += 8 * etl
    nac = struct.unpack_from('>H', new, p)[0]
    p += 2
    attrs = []
    smt = None
    for _ in range(nac):
        an = struct.unpack_from('>H', new, p)[0]
        aln = struct.unpack_from('>I', new, p + 2)[0]
        aname = Pool(new).utf8.get(an)
        arr = new[p:p + 6 + aln]
        if aname == 'StackMapTable':
            smt = new[p + 6:p + 6 + aln]
        else:
            attrs.append(arr)
        p += 6 + aln

    handler = code_len
    slot = max_locals
    ret_bytes, ret_stack = _default_return(desc)
    new_code = (bytes(code) + bytes([0x3A, slot]) + bytes(handler_code) + ret_bytes)
    max_stack = max(max_stack, 1 + ret_stack)
    exc = exc + [struct.pack('>HHHH', 0, code_len, handler, thr)]

    pool2 = Pool(new)
    this_cls = pool2.cls.get(struct.unpack_from('>H', new, pool2.end + 2)[0])
    this_idx = find_class(pool2, this_cls)
    if this_idx is None:
        raise SystemExit('FAIL-CLOSED: own class %s not in pool' % this_cls)

    def handler_frame(offset_delta):
        return (bytes([0xFF]) + struct.pack('>H', offset_delta) +
                struct.pack('>H', 1) + bytes([7]) + struct.pack('>H', this_idx) +
                struct.pack('>H', 1) + bytes([7]) + struct.pack('>H', thr))

    if smt is None:
        n_existing = 0
        frames = struct.pack('>H', 1) + handler_frame(handler)
    else:
        n_existing, used, offs, last = parse_stackmap(smt)
        last = last if offs else -1
        delta = handler - last - 1
        if delta < 0:
            raise SystemExit('FAIL-CLOSED: handler offset behind last frame')
        frames = struct.pack('>H', n_existing + 1) + smt[2:used] + handler_frame(delta)

    out_attrs = attrs + [struct.pack('>H', smt_name_idx) + struct.pack('>I', len(frames)) + frames]
    attr = (
        struct.pack('>H', max_stack) +
        struct.pack('>H', max_locals + 1) +
        struct.pack('>I', len(new_code)) + new_code +
        struct.pack('>H', len(exc)) + b''.join(exc) +
        struct.pack('>H', len(out_attrs)) + b''.join(out_attrs)
    )
    o = bytearray(new[:body - 6])
    o += struct.pack('>H', name_index)
    o += struct.pack('>I', len(attr))
    o += attr
    o += new[body + alen:]

    return bytes(o), {
        'method': '%s%s' % (method, desc),
        'code': '%d -> %d' % (code_len, len(new_code)),
        'handler': handler,
        'frames': '%d -> %d' % (n_existing, n_existing + 1),
        'max_locals': '%d -> %d' % (max_locals, max_locals + 1),
        'exc_entries': '%d -> %d' % (etl, len(exc)),
        'pool_added': added,
    }


if __name__ == '__main__':
    print('reusable helper; import wrap()')
