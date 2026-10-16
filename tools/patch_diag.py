#!/usr/bin/env python3
"""Flux: append log4j diagnostics to szk.<init> so latest.log tells us the truth.

Why log4j and not System.out
----------------------------
Minecraft's client redirects log4j events to `logs/latest.log`, but `System.out`
only reaches the launch console - a first attempt using `System.out.println`
produced no line in the log at all, which is not the same as "the code did not
run".  Logging through `org.apache.logging.log4j.LogManager` guarantees capture.

What it prints
--------------
`szk.<init>` is 36 bytes of straight-line code (no branch, no exception table, no
stack map table) and ends with a `return`, so code can be appended freely:

    LogManager.getLogger("FluxDiag").info("FLUX-DIAG: szk.<init> reached");
    LogManager.getLogger("FluxDiag").info(c05.vz1().tij);

`info(Object)` is used for the second one precisely because it is branch-free: a
null argument simply logs `null`, so no stack map frame is needed.  That answers
whether the config manager is built before the world exists - in which case
`szk._k4()`'s guard (`if (c05.vz1().tij == null) return;`) silently skips the load.

Usage: patch_diag.py <in/szk.class> <out/szk.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, find_ref, append_utf8

LOGGER = 'FluxDiag'
MSG = 'FLUX-DIAG: szk.<init> reached'
BRANCHES = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
            0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xAA, 0xAB)


class PoolBuilder(object):
    def __init__(self, blob, pool):
        self.pool = pool
        self.pb = blob[:pool.end]
        self.count = pool.count
        self.added = []

    def utf8(self, text):
        for i, v in self.pool.utf8.items():
            if v == text:
                return i
        self.pb, _ = append_utf8(self.pb, text)
        i = self.count
        self.count += 1
        self.added.append('Utf8 "%s" = #%d' % (text, i))
        return i

    def string(self, text):
        for i, (tag, val) in self.pool.entries.items():
            if tag == 8 and self.pool.utf8.get(val) == text:
                return i
        u = self.utf8(text)
        self.pb += bytes([8]) + struct.pack('>H', u)
        i = self.count
        self.count += 1
        self.added.append('String "%s" = #%d' % (text, i))
        return i

    def cls(self, owner):
        """Class constant for `owner`, appended if this class's pool lacks it."""
        for i, (tag, val) in self.pool.entries.items():
            if tag == 7 and self.pool.utf8.get(val) == owner:
                return i
        u = self.utf8(owner)
        self.pb += bytes([7]) + struct.pack('>H', u)
        i = self.count
        self.count += 1
        self.added.append('Class %s = #%d' % (owner.replace('/', '.'), i))
        return i

    def ref(self, owner, name, desc, tag):
        r = find_ref(self.pool, owner, name, desc, tags=(tag,))
        if r:
            return r
        n = self.utf8(name)
        d = self.utf8(desc)
        self.pb += bytes([12]) + struct.pack('>H', n) + struct.pack('>H', d)
        nt = self.count
        self.count += 1
        c = self.cls(owner)
        self.pb += bytes([tag]) + struct.pack('>H', c) + struct.pack('>H', nt)
        i = self.count
        self.count += 1
        self.added.append('%s.%s = #%d' % (owner.replace('/', '.'), name, i))
        return i


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    b = PoolBuilder(blob, pool)

    get_logger = b.ref('org/apache/logging/log4j/LogManager', 'getLogger',
                       '(Ljava/lang/String;)Lorg/apache/logging/log4j/Logger;', 10)
    info_str = b.ref('org/apache/logging/log4j/Logger', 'info',
                     '(Ljava/lang/String;)V', 11)
    info_obj = b.ref('org/apache/logging/log4j/Logger', 'info',
                     '(Ljava/lang/Object;)V', 11)
    name_ref = b.string(LOGGER)
    msg_ref = b.string(MSG)

    fld_tij = find_ref(pool, 'c05', 'tij', 'Lkh3;', tags=(9,))
    if fld_tij is None:
        raise SystemExit('FAIL-CLOSED: Fieldref c05.tij not found')
    m_vz1 = find_ref(pool, 'c05', 'vz1', '()Lc05;')
    if m_vz1 is None:
        raise SystemExit('FAIL-CLOSED: Methodref c05.vz1 not found')

    # Every pool entry must be appended BEFORE `new` is assembled - touching
    # b.pb afterwards produces valid indices that point past the pool.
    y40 = b.ref('yn6', 'w40', '()Ljava/lang/String;', 10)
    fld_bxb = find_ref(pool, 'zwr', 'bxb', 'Lcn7;', tags=(9,))
    if fld_bxb is None:
        raise SystemExit('FAIL-CLOSED: Fieldref zwr.bxb not found')
    d7c = b.ref('cn7', 'd7c', '()Ljava/lang/Boolean;', 10)
    msg2 = b.string('FLUX-DIAG cfg name:')
    msg3 = b.string('FLUX-DIAG zwr.bxb.d7c():')

    new = bytearray(b.pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, b.count)
    new = bytes(new)

    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn == '<init>' and md == '()V':
            hit = (cfo, code)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: szk.<init> lost after pool append')
    cfo, code = hit
    if code[-1] != 0xB1:
        raise SystemExit('FAIL-CLOSED: szk.<init> does not end with return')
    for off, op, ops, ln in callscan.decode_instructions(code):
        if op in BRANCHES:
            raise SystemExit('FAIL-CLOSED: szk.<init> has a branch; cannot append')

    def ldcw(idx):
        return bytes([0x13]) + struct.pack('>H', idx)

    def iface(idx, desc):
        """invokeinterface: the count operand counts argument slots INCLUDING
        the objectref, and long/double take two slots."""
        args = desc[desc.index('(') + 1:desc.index(')')]
        slots = 1                                    # objectref
        i = 0
        while i < len(args):
            c = args[i]
            if c == '[':
                while args[i] == '[':
                    i += 1
                if args[i] == 'L':
                    i = args.index(';', i)
                slots += 1
            elif c == 'L':
                i = args.index(';', i)
                slots += 1
            elif c in 'JD':
                slots += 2
            else:
                slots += 1
            i += 1
        return bytes([0xB9]) + struct.pack('>H', idx) + bytes([slots, 0])

    # extra branch-free probes: the config name and the one boolean that decides
    # whether _k4 substitutes an empty name (zwr.bxb defaults to false).
    inject = (
        ldcw(name_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +   # getLogger
        ldcw(msg_ref) + iface(info_str, '(Ljava/lang/String;)V') +        # info(String)
        ldcw(name_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +   # getLogger
        bytes([0xB8]) + struct.pack('>H', m_vz1) +                        # c05.vz1()
        bytes([0xB4]) + struct.pack('>H', fld_tij) +                      # getfield tij
        iface(info_obj, '(Ljava/lang/Object;)V') +                        # info(Object)
        ldcw(name_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +
        ldcw(msg2) + iface(info_str, '(Ljava/lang/String;)V') +
        ldcw(name_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +
        bytes([0xB8]) + struct.pack('>H', y40) +                          # yn6.w40()
        iface(info_obj, '(Ljava/lang/Object;)V') +
        ldcw(name_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +
        ldcw(msg3) + iface(info_str, '(Ljava/lang/String;)V') +
        ldcw(name_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +
        bytes([0xB2]) + struct.pack('>H', fld_bxb) +                      # zwr.bxb
        bytes([0xB6]) + struct.pack('>H', d7c) +                          # cn7.d7c()
        iface(info_obj, '(Ljava/lang/Object;)V') +
        bytes([0xB1])                                                     # return
    )

    at = cfo + len(code) - 1
    out = bytearray(new[:at]) + bytearray(inject) + bytearray(new[at + 1:])
    delta = len(inject) - 1
    attr_len = struct.unpack_from('>I', new, cfo - 12)[0]
    struct.pack_into('>I', out, cfo - 12, attr_len + delta)
    struct.pack_into('>I', out, cfo - 4, len(code) + delta)

    io.open(dst, 'wb').write(bytes(out))
    print('szk.<init>: appended log4j diagnostics (%d -> %d bytes)'
          % (len(code), len(code) + delta))
    print('   latest.log will carry "FLUX-DIAG: szk.<init> reached" then c05.tij')
    for a in b.added:
        print('   appended: %s' % a)


if __name__ == '__main__':
    main()
