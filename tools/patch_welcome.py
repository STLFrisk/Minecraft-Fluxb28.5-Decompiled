#!/usr/bin/env python3
"""Flux client: null-guard the title screen's session lookup.

q08.drawScreen renders

    "Welcome, " + zwr.ooi().qr2().getUserName()

with no null check at all. `zwr.tgs` (and therefore `prq.yjm`, i.e. `qr2()`) is
only populated by the native layer *after* a successful login, so once the login
gate is bypassed this chain raises a NullPointerException on every frame and the
title screen never renders.

Patch: the 9-byte triple

    541: invokestatic  zwr.ooi()                       ()Lprq;
    544: invokevirtual prq.qr2()                       ()Ltoday/.../ClientNetwork;
    547: invokevirtual ClientNetwork.getUserName()     ()Ljava/lang/String;

is replaced by

    ldc_w  <new CONSTANT_String "" >   3 bytes
    nop x6                             6 bytes

which leaves exactly one String on the operand stack, so every merge point keeps
its stack shape.  The empty-string constant is appended to the END of the
constant pool, which does not renumber any existing index; only the pool count is
bumped and the code that follows is shifted by the 5 inserted bytes.
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

INVOKESTATIC, INVOKEVIRTUAL = 0xB8, 0xB6
LDC_W, NOP = 0x13, 0x00
PLACEHOLDER = ''          # rendered text becomes "Welcome, "


def append_string_constant(blob, text):
    """Append a CONSTANT_Utf8 + CONSTANT_String pair and bump the pool count.

    Returns (new_blob, string_index, inserted_byte_count). Appending never
    renumbers existing pool entries, so no other index in the class changes.
    """
    r = callscan.Reader(blob, 8)
    pool = callscan.parse_constant_pool(r)
    insert_at = r.o
    utf_index = len(pool)
    str_index = len(pool) + 1
    raw = text.encode('utf-8')
    utf_entry = bytes([1]) + struct.pack('>H', len(raw)) + raw
    str_entry = bytes([8]) + struct.pack('>H', utf_index)
    extra = utf_entry + str_entry

    out = bytearray(blob[:insert_at]) + bytearray(extra) + bytearray(blob[insert_at:])
    struct.pack_into('>H', out, 8, len(pool) + 2)
    return bytes(out), str_index, len(extra)


def find_triples(blob):
    """Locate every <zwr.ooi()><prq.qr2()><ClientNetwork.getUserName()> triple."""
    found = []
    for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
        insns = callscan.decode_instructions(code)
        by_off = {o: (o, op, ops, ln) for o, op, ops, ln in insns}
        for off, op, operands, ln in insns:
            if op != INVOKESTATIC:
                continue
            idx = struct.unpack_from('>H', operands, 0)[0]
            if callscan.ref_name(pool, idx) != 'zwr.ooi':
                continue
            a = by_off.get(off + 3)
            b = by_off.get(off + 6)
            if not a or not b or a[1] != INVOKEVIRTUAL or b[1] != INVOKEVIRTUAL:
                raise SystemExit('FAIL-CLOSED: call chain after zwr.ooi() at %d is not the '
                                 'expected two invokevirtuals' % off)
            ia = struct.unpack_from('>H', a[2], 0)[0]
            ib = struct.unpack_from('>H', b[2], 0)[0]
            if callscan.ref_name(pool, ia) != 'prq.qr2':
                raise SystemExit('FAIL-CLOSED: second call at %d is %s, expected prq.qr2'
                                 % (off + 3, callscan.ref_name(pool, ia)))
            if callscan.ref_name(pool, ib) != \
                    'today.flux.irc.client.network.ClientNetwork.getUserName':
                raise SystemExit('FAIL-CLOSED: third call at %d is %s, expected ClientNetwork.getUserName'
                                 % (off + 6, callscan.ref_name(pool, ib)))
            found.append((mname, mdesc, cfo, off,
                          bytes(blob[cfo + off:cfo + off + 9])))
    return found


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()

    # 1) record the triples and their original bytes (before any insertion)
    triples = find_triples(blob)
    if not triples:
        raise SystemExit('FAIL-CLOSED: no zwr.ooi()/qr2()/getUserName() chain found')
    for mname, mdesc, cfo, off, before in triples:
        if len(before) != 9:
            raise SystemExit('FAIL-CLOSED: triple at %d spans %d bytes, expected 9'
                             % (off, len(before)))

    # 2) append the empty-string constant (shifts all later file offsets by 5)
    blob2, str_index, shift = append_string_constant(blob, PLACEHOLDER)

    # 3) rewrite each triple as ldc_w ""; nop x6, at the shifted offsets
    report = []
    for mname, mdesc, cfo, off, before in triples:
        new_cfo = cfo + shift
        new = bytes([LDC_W, (str_index >> 8) & 0xFF, str_index & 0xFF]) + bytes([NOP] * 6)
        blob2 = (blob2[:new_cfo + off] + new + blob2[new_cfo + off + 9:])
        report.append({'method': mname, 'code_offset': off,
                       'before_hex': before.hex(' '), 'after_hex': new.hex(' ') + ' (ldc_w #%d + 6 nop)' % str_index})

    io.open(dst, 'wb').write(blob2)
    print('appended constant pool entries: Utf8 #%d, String #%d (+%d bytes)'
          % (str_index - 1, str_index, shift))
    print('guarded call chains           : %d' % len(report))
    for r in report:
        print('   %-14s offset %-5d %s  ->  %s' % (r['method'], r['code_offset'],
                                                   r['before_hex'], r['after_hex']))


if __name__ == '__main__':
    main()
