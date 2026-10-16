#!/usr/bin/env python3
"""Flux client: offline login bypass + anti-tamper neutralisation.

Two independent, byte-exact patches, each fail-closed (the tool refuses to write
unless the original bytes match what the analysis predicted):

PATCH 1  q08.drawScreen  (the Flux title screen)
    The only `new qih` in the whole jar lives here.  Effective control flow with
    ZKM's opaque predicate t9d.b()==0 is:

        14: getstatic  zwr.tgs : Lprq;            push session
        19: ifeq 35                               (opaque predicate, taken)
        32/35: getfield prq.dbd : LLoggedPacket;  push auth state
        38: ifnonnull 60                          auth -> proceed to menu
        41: <build qih> c05.z2i(..) return        else -> login screen

    We rewrite the 6 bytes at the `getfield`/`ifnonnull` pair as
        pop                       drop whatever session object is there
        goto 60                   unconditional jump to the menu path
        nop nop
    This is operand-stack neutral at every merge point (both predecessors of
    offset 35 leave exactly one reference, and offset 60 was only ever reached
    with an empty stack), so the method still passes verification.

PATCH 2  jiz.<init>  (deliberate self-destruct)
        if ((double) zwr.tgs.dbd.getToken().length() < <const>) {
            Unsafe u = ...; u.putAddress(0L, 0L);   // hard JVM crash
        }
    `invokevirtual sun/misc/Unsafe.putAddress(JJ)V` is replaced by
    `pop2 pop2 pop`, which discards the receiver and both long arguments.
"""
import io
import json
import os
import re
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan

GETFIELD, INVOKEVIRTUAL = 0xB4, 0xB6
IFNONNULL, IFNULL, IFEQ, GOTO, POP, NOP = 0xC7, 0xC6, 0x99, 0xA7, 0x57, 0x00


def code_arrays(blob):
    """Yield (method_name, method_desc, code_start_offset_in_file, code_bytes, pool)."""
    r = callscan.Reader(blob, 8)
    pool = callscan.parse_constant_pool(r)
    r.u2(); r.u2(); r.u2()                        # access, this, super
    for _ in range(r.u2()):
        r.u2()
    for _ in range(r.u2()):                       # fields
        r.u2(); r.u2(); r.u2()
        for _ in range(r.u2()):
            r.u2(); ln = r.u4(); r.take(ln)
    out = []
    for _ in range(r.u2()):                       # methods
        _acc, name_i, desc_i = r.u2(), r.u2(), r.u2()
        mname = callscan.utf(pool, name_i)
        mdesc = callscan.utf(pool, desc_i)
        for _ in range(r.u2()):
            an_i = r.u2()
            aname = callscan.utf(pool, an_i)
            alen = r.u4()
            body_start = r.o
            body = r.take(alen)
            if aname == 'Code':
                cr = callscan.Reader(body)
                cr.u2(); cr.u2()
                clen = cr.u4()
                yield mname, mdesc, body_start + 8, body[8:8 + clen], pool
    return


def instruction_at(insns, off):
    for i, (o, op, operands, size) in enumerate(insns):
        if o == off:
            return i, o, op, operands, size
    return None


def patch_q08(blob):
    report = {}
    for mname, mdesc, code_file_off, code, pool in code_arrays(blob):
        if mname != 'drawScreen':
            continue
        insns = callscan.decode_instructions(code)
        for i, (off, op, operands, size) in enumerate(insns):
            if op != GETFIELD:
                continue
            idx = struct.unpack_from('>H', operands, 0)[0]
            ref = callscan.ref_name(pool, idx)
            if ref != 'prq.dbd':
                continue
            nxt = insns[i + 1]
            if nxt[1] != IFNONNULL:
                raise SystemExit('FAIL-CLOSED: instruction after getfield prq.dbd '
                                 'is 0x%02x, expected ifnonnull' % nxt[1])
            target = nxt[0] + struct.unpack_from('>h', nxt[2], 0)[0]
            # sanity: the login block (new qih) must sit right after the ifnonnull
            after = nxt[0] + 1 + nxt[3]
            login_off = None
            for o2, op2, operands2, _s2 in insns:
                if o2 < after or op2 != 0xBB:
                    continue
                if callscan.class_name(pool, struct.unpack_from('>H', operands2, 0)[0]) == 'qih':
                    login_off = o2
                    break
            if login_off is None:
                raise SystemExit('FAIL-CLOSED: no `new qih` found after the guard; '
                                 'the gate layout is not what was analysed')
            site = off + 1 + size                      # first byte of the ifnonnull
            span = (1 + size) + (1 + nxt[3])           # getfield + ifnonnull = 6
            if span != 6:
                raise SystemExit('FAIL-CLOSED: guard span is %d bytes, expected 6' % span)
            # Layout inside the 6-byte slot: pop; nop; nop; goto <menu>.
            # `goto` must be the LAST instruction of the slot: if it came first, the
            # two filler bytes would be unreachable, and a class carrying a
            # StackMapTable is rejected by the split verifier for dead code
            # ("Expected stackmap frame at this location").
            # `goto` lands at off+3, so its displacement is relative to off+3.
            rel = target - (off + 3)
            if not (-128 <= rel <= 127):
                raise SystemExit('FAIL-CLOSED: goto displacement %d out of range' % rel)
            before = bytes(blob[code_file_off + off:code_file_off + off + span])
            wanted = bytes([0xB4, operands[0], operands[1], IFNONNULL,
                            nxt[2][0], nxt[2][1]])
            if before != wanted:
                raise SystemExit('FAIL-CLOSED: guard bytes %s != predicted %s'
                                 % (before.hex(' '), wanted.hex(' ')))
            new = bytes([POP, NOP, NOP, GOTO, (rel >> 8) & 0xFF, rel & 0xFF])
            blob[code_file_off + off:code_file_off + off + span] = new
            sites = [{
                'offset': off,
                'kind': 'getfield prq.dbd + ifnonnull -> pop; nop; nop; goto menu',
                'before_hex': before.hex(' '),
                'after_hex': new.hex(' '),
            }]

            # The opaque predicate t9d.b() also guards a SECOND route into the login
            # block (`ifnull <login entry>`). With the predicate constant-zero that
            # route is dead in practice, but a conservative reachability proof must
            # still see it removed.
            login_entry = after
            for o2, op2, operands2, _ln2 in insns:
                if op2 != IFNULL:
                    continue
                if o2 + struct.unpack_from('>h', operands2, 0)[0] != login_entry:
                    continue
                b4 = bytes(blob[code_file_off + o2:code_file_off + o2 + 3])
                blob[code_file_off + o2:code_file_off + o2 + 3] = bytes([POP, NOP, NOP])
                sites.append({
                    'offset': o2,
                    'kind': 'ifnull -> login block : pop; nop; nop',
                    'before_hex': b4.hex(' '),
                    'after_hex': '57 00 00',
                })
            report['q08_drawScreen'] = {
                'code_file_offset': code_file_off,
                'login_block_offset': login_off,
                'login_block_entry': login_entry,
                'menu_path_offset': target,
                'sites': sites,
            }
    if not report:
        raise SystemExit('FAIL-CLOSED: no getfield prq.dbd guard found in q08.drawScreen')
    return report


def patch_jiz(blob):
    report = {}
    for mname, mdesc, code_file_off, code, pool in code_arrays(blob):
        insns = callscan.decode_instructions(code)
        for off, op, operands, size in insns:
            if op != INVOKEVIRTUAL:
                continue
            idx = struct.unpack_from('>H', operands, 0)[0]
            ref = callscan.ref_name(pool, idx)
            if ref != 'sun.misc.Unsafe.putAddress':
                continue
            desc = callscan.nat_desc(pool, pool[idx][1][1])
            if desc != '(JJ)V':
                raise SystemExit('FAIL-CLOSED: Unsafe.putAddress descriptor is %s, expected (JJ)V'
                                 % desc)
            before = bytes(blob[code_file_off + off:code_file_off + off + 1 + size])
            blob[code_file_off + off:code_file_off + off + 1 + size] = bytes([0x58, 0x58, 0x57])
            report.setdefault(mname, {'code_file_offset': code_file_off, 'sites': []})
            report[mname]['sites'].append({'offset': off,
                                           'before_hex': before.hex(' '),
                                           'after_hex': '58 58 57'})
    return report


def main():
    src, dst = sys.argv[1], sys.argv[2]
    os.makedirs(dst, exist_ok=True)
    overall = {}
    for cls, fn in (('q08', patch_q08), ('jiz', patch_jiz)):
        p = os.path.join(src, cls + '.class')
        blob = bytearray(io.open(p, 'rb').read())
        rep = fn(blob)
        out = os.path.join(dst, cls + '.class')
        io.open(out, 'wb').write(bytes(blob))
        overall[cls] = rep
        print('patched %-6s -> %s' % (cls, out))
    with io.open(os.path.join(dst, 'patch_report.json'), 'w', encoding='utf-8') as fh:
        json.dump(overall, fh, indent=2, ensure_ascii=False)
    print(json.dumps(overall, indent=2, ensure_ascii=False))


if __name__ == '__main__':
    main()
