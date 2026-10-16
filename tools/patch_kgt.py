#!/usr/bin/env python3
"""Flux: let `kgt.<init>` survive a failing native `eyk()` without losing the
module registry.

Finding
-------
`kgt` is Flux's feature registry.  Its wire-up is:

    kgt.<clinit>   vuo = new ArrayList();  ... new <module>() ; putstatic kgt.<module>
    kgt.<init>     0: aload_0
                   1: invokespecial java/lang/Object.<init>()V
                   4: aload_0
                   5: invokevirtual kgt.eyk()V          <-- NATIVE
                   8: getstatic kgt.vuo
                  11: invokedynamic apply
                  16: Comparator.comparing
                  19: ArrayList.sort(Comparator)
                  22: return

`kgt.vuo` has exactly ONE writer in all 3,394 classes - the `new ArrayList()` in
`<clinit>` - and no Java code ever adds to it.  The only thing that runs between
that allocation and the `sort` call is the native `eyk()`.  So `eyk()` is what
populates the registry, and `kgt.wau()` (which returns `vuo`) is exactly what
`c05.tur` iterates when dispatching input.

That explains the observed symptom chain:

    Press Right Shift -> no effect -> the ClickGUI module was never registered,
    because the registry is empty.

and it explains why P9 was wrong: P9 removed the `eyk()` call outright, so the
registry could never be populated, guaranteeing the GUI keybind stays dead.
`eyk()` does throw (it builds a java.awt.Color from out-of-range values), but the
right answer is to keep the call and contain the failure.

Patch
-----
Wrap the initialisation in an implicit try/catch, appended after the existing
`return` so that **no existing bytecode offset moves**:

    4: aload_0
    5: invokevirtual kgt.eyk()V          } protected range [4, 23)
    8: getstatic kgt.vuo                 }
   11: invokedynamic apply               }
   16: Comparator.comparing              }
   19: ArrayList.sort(Comparator)        }
   22: return                            }
   23: astore_1                          <-- appended handler
   24: return

plus the exception-table entry [4, 23) -> 23 catch java/lang/Throwable,
`max_locals` 1 -> 2, and a StackMapTable carrying one `full_frame` at 23
(locals = [kgt, Throwable], stack = [Throwable]) - the method had no Code
attributes at all before, so nothing existing has to be rewritten.

Net effect: if `eyk()` completes, the registry is populated and the GUI works; if
it throws, the constructor still returns normally instead of taking the client
down.

Usage: patch_kgt.py <in/kgt.class> <out/kgt.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, append_utf8, find_method

TARGET_DESC = '()V'
PROTECT_START = 4
PROTECT_END = 23
HANDLER_PC = 23
APPEND = bytes([0x4C, 0xB1])          # astore_1 ; return


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    added = []
    pool_blob = blob[:pool.end]
    tail = blob[pool.end:]

    kgt_class = find_class(pool, 'kgt')
    if kgt_class is None:
        pool_blob, _ = append_utf8(pool_blob, 'kgt')
        pool_blob += bytes([7]) + struct.pack('>H', count)
        kgt_class = count + 1
        count += 2
        added.append('Class kgt = #%d' % kgt_class)

    thr_class = find_class(pool, 'java/lang/Throwable')
    if thr_class is None:
        pool_blob, _ = append_utf8(pool_blob, 'java/lang/Throwable')
        pool_blob += bytes([7]) + struct.pack('>H', count)
        thr_class = count + 1
        count += 2
        added.append('Class java/lang/Throwable = #%d' % thr_class)

    smt_name = None
    for idx, name in pool.utf8.items():
        if name == 'StackMapTable':
            smt_name = idx
            break
    if smt_name is None:
        pool_blob, _ = append_utf8(pool_blob, 'StackMapTable')
        smt_name = count
        count += 1
        added.append('Utf8 StackMapTable = #%d' % smt_name)

    new = bytearray(pool_blob) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    pool2 = Pool(new)
    body, alen = find_method(new, pool2, '<init>', TARGET_DESC)
    code_name_index = struct.unpack_from('>H', new, body - 6)[0]
    max_stack, max_locals = struct.unpack_from('>HH', new, body)
    code_len = struct.unpack_from('>I', new, body + 4)[0]
    code = new[body + 8:body + 8 + code_len]

    if code_len != 23 or code[5:8] != bytes.fromhex('b6 00 dc'):
        raise SystemExit('FAIL-CLOSED: kgt.<init> shape changed (len=%d, %s)'
                         % (code_len, code[5:8].hex(' ')))
    if struct.unpack_from('>H', new, body + 8 + code_len)[0] != 0:
        raise SystemExit('FAIL-CLOSED: kgt.<init> unexpectedly has an exception table')

    new_code = code + APPEND

    # full_frame @23 : at a handler the pending exception is on the OPERAND STACK,
    # not in a local (locals[1] is still `top` until astore_1 executes), so the
    # frame is locals [kgt] / stack [Throwable].
    frame = (
        bytes([0xFF]) + struct.pack('>H', HANDLER_PC) +
        struct.pack('>H', 1) +
        bytes([7]) + struct.pack('>H', kgt_class) +
        struct.pack('>H', 1) +
        bytes([7]) + struct.pack('>H', thr_class)
    )
    smt = struct.pack('>H', 1) + frame

    exc = struct.pack('>HHHH', PROTECT_START, PROTECT_END, HANDLER_PC, thr_class)

    code_attr = (
        struct.pack('>H', max_stack) +
        struct.pack('>H', max(max_locals, 2)) +
        struct.pack('>I', len(new_code)) + new_code +
        struct.pack('>H', 1) + exc +
        struct.pack('>H', 1) +
        struct.pack('>H', smt_name) + struct.pack('>I', len(smt)) + smt
    )

    out = bytearray(new[:body - 6])
    out += struct.pack('>H', code_name_index)
    out += struct.pack('>I', len(code_attr))
    out += code_attr
    out += new[body + alen:]
    io.open(dst, 'wb').write(bytes(out))

    print('kgt.<init>: native eyk() is now contained instead of skipped')
    print('  appended pool entries : %s' % (added or 'none'))
    print('  code %d -> %d bytes (handler @%d), max_locals %d -> %d'
          % (code_len, len(new_code), HANDLER_PC, max_locals, max(max_locals, 2)))
    print('  exception table: [%d, %d) -> %d catch java/lang/Throwable'
          % (PROTECT_START, PROTECT_END, HANDLER_PC))
    print('  StackMapTable: full_frame(@%d)' % HANDLER_PC)
    print('  effect: registry is populated whenever eyk() can run; never crashes when it cannot')


if __name__ == '__main__':
    main()
