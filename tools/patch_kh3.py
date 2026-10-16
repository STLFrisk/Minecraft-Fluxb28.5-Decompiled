#!/usr/bin/env python3
"""Compose every per-class patch for kh3, then, optionally, log from the handler.

`kh3` carries two patches and rebuilding it from the pristine class silently
dropped the first one:

  P7   kh3.wd_ @14..19   getstatic kgt.iy7; invokevirtual v2w.klu()
                         -> iconst_0; nop*5
       Without it, wd_ reads kgt.iy7 while kgt.<clinit> is still running, and the
       native ar7.yse -> l86.lhu -> kh3.wd_ callback from a module constructor
       raises the NPE that kills client startup.

  P22  kh3.utr(e1i)      whole body wrapped in catch(Throwable){ return null }
       t9d.utr(arg) comes back null on some path and the result is dereferenced by
       wsc.h1o two instructions later.

`--log-handler` additionally emits a log4j line from inside the catch, which is
the only way to tell "the catch ran but the NPE came from somewhere else" apart
from "the catch never ran at all".

Usage: patch_kh3.py <in/kh3.class> <out/kh3.class> [--log-handler]
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
import trycatch
from patch_qih import Pool, find_class, find_ref, append_utf8

P7_AT = 14
P7_WANT = bytes.fromhex('b2 02 42 b6 02 47')
P7_NEW = bytes.fromhex('03 00 00 00 00 00')

UTR_DESC = '(Le1i;)Lwsc;'


class PoolBuilder(object):
    def __init__(self, blob):
        self.pool = Pool(blob)
        self.pb = blob[:self.pool.end]
        self.count = self.pool.count
        self.added = []

    def utf8(self, t):
        for i, v in self.pool.utf8.items():
            if v == t:
                return i
        self.pb, _ = append_utf8(self.pb, t)
        i = self.count
        self.count += 1
        self.added.append('Utf8 "%s" = #%d' % (t, i))
        return i

    def string(self, t):
        for i, (tag, val) in self.pool.entries.items():
            if tag == 8 and self.pool.utf8.get(val) == t:
                return i
        u = self.utf8(t)
        self.pb += bytes([8]) + struct.pack('>H', u)
        i = self.count
        self.count += 1
        self.added.append('String "%s" = #%d' % (t, i))
        return i

    def cls(self, owner):
        for i, (tag, val) in self.pool.entries.items():
            if tag == 7 and self.pool.utf8.get(val) == owner:
                return i
        u = self.utf8(owner)
        self.pb += bytes([7]) + struct.pack('>H', u)
        i = self.count
        self.count += 1
        self.added.append('Class %s = #%d' % (owner, i))
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
        self.added.append('%s.%s = #%d' % (owner, name, i))
        return i


def main():
    src, dst = sys.argv[1], sys.argv[2]
    log_handler = '--log-handler' in sys.argv

    blob = io.open(src, 'rb').read()

    handler_code = b''
    if log_handler:
        b = PoolBuilder(blob)
        get_logger = b.ref('org/apache/logging/log4j/LogManager', 'getLogger',
                           '(Ljava/lang/String;)Lorg/apache/logging/log4j/Logger;', 10)
        info_obj = b.ref('org/apache/logging/log4j/Logger', 'info',
                         '(Ljava/lang/Object;)V', 11)
        name_ref = b.string('FluxDiag')
        msg_ref = b.string('FLUX-DIAG kh3.utr catch:')
        blob = bytes(bytearray(b.pb) + bytearray(blob[b.pool.end:]))
        blob = bytearray(blob)
        struct.pack_into('>H', blob, 8, b.count)
        blob = bytes(blob)

        hit = None
        for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
            if mn == 'utr' and md == UTR_DESC:
                hit = (cfo, code)
                break
        cfo, code = hit
        # slot = max_locals of the original method
        slot = struct.unpack_from('>H', blob, cfo - 6)[0]
        # Logger.info(String) consumes the logger, so it must be fetched again
        # before the second call.
        logger = (bytes([0x13]) + struct.pack('>H', name_ref) +
                  bytes([0xB8]) + struct.pack('>H', get_logger))
        call_str = (bytes([0x13]) + struct.pack('>H', msg_ref) +
                    bytes([0xB9]) + struct.pack('>H', info_obj) + bytes([2, 0]))
        call_obj = (bytes([0x19, slot]) +
                    bytes([0xB9]) + struct.pack('>H', info_obj) + bytes([2, 0]))
        handler_code = logger + call_str + logger + call_obj
        print('   handler log: %d bytes, throwable slot %d' % (len(handler_code), slot))
        for a in b.added:
            print('   appended: %s' % a)

    out, rep = trycatch.wrap(blob, 'utr', UTR_DESC, handler_code=handler_code)

    ok = False
    for mn, md, cfo, code, mp in patch_login.code_arrays(out):
        if mn != 'wd_':
            continue
        if code[P7_AT:P7_AT + len(P7_WANT)] != P7_WANT:
            raise SystemExit('FAIL-CLOSED: kh3.wd_@%d is %s, expected %s'
                             % (P7_AT, code[P7_AT:P7_AT + 6].hex(' '), P7_WANT.hex(' ')))
        o = bytearray(out)
        for i, byte in enumerate(P7_NEW):
            o[cfo + P7_AT + i] = byte
        out = bytes(o)
        ok = True
        break
    if not ok:
        raise SystemExit('FAIL-CLOSED: kh3.wd_ not found')

    io.open(dst, 'wb').write(out)
    print('   P7  kh3.wd_ @%d : %s -> %s' % (P7_AT, P7_WANT.hex(' '), P7_NEW.hex(' ')))
    print('   P22 kh3.utr     : %s' % rep['code'])
    print('        handler @%s  frames %s  max_locals %s  exc %s'
          % (rep['handler'], rep['frames'], rep['max_locals'], rep['exc_entries']))


if __name__ == '__main__':
    main()
