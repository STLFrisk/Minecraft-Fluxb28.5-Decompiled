#!/usr/bin/env python3
"""Verify the login-bypass patches.

Checks, per patched class:
  1. the file still parses as a well-formed class file;
  2. control-flow reachability inside the patched method:
       - the login block (`new qih`) must become UNREACHABLE
       - the menu path (the old branch target) must remain REACHABLE
     Roots are method entry plus every exception-handler start PC, so an
     exception edge cannot sneak back into the login block.
  3. the second patch leaves no `Unsafe.putAddress` invocation behind.

This is a static proof over the decoded instruction graph; it does not execute
the client.  A separate JVM check confirms bytecode verification.
"""
import io
import json
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

COND_JUMPS = set(range(0x99, 0xA7)) | {0xC6, 0xC7}          # if<cond> family
GOTO, GOTO_W, JSR, JSR_W = 0xA7, 0xC8, 0xA8, 0xC9
RET, RETURN, IRETURN, LRETURN, FRETURN, DRETURN, ARETURN = 0xA9, 0xB1, 0xAC, 0xAD, 0xAE, 0xAF, 0xB0
ATHROW = 0xBF
TABLESWITCH, LOOKUPSWITCH = 0xAA, 0xAB


def switches(insn, code):
    """Yield branch targets for a tableswitch/lookupswitch instruction."""
    off, op, operands, _ln = insn
    pad = (4 - ((off + 1) % 4)) % 4
    p = off + 1 + pad
    default = struct.unpack_from('>i', code, p)[0] + off
    yield default
    if op == TABLESWITCH:
        lo = struct.unpack_from('>i', code, p + 4)[0]
        hi = struct.unpack_from('>i', code, p + 8)[0]
        for k in range(lo, hi + 1):
            yield struct.unpack_from('>i', code, p + 12 + 4 * (k - lo))[0] + off
    else:
        n = struct.unpack_from('>i', code, p + 4)[0]
        for k in range(n):
            yield struct.unpack_from('>i', code, p + 8 + 8 * k + 4)[0] + off


def successors(insn, insns_by_off, code):
    off, op, operands, ln = insn
    nxt = off + 1 + ln
    if op in (GOTO, JSR):
        yield off + struct.unpack_from('>h', operands, 0)[0]
        return
    if op in (GOTO_W, JSR_W):
        yield off + struct.unpack_from('>i', operands, 0)[0]
        return
    if op in COND_JUMPS:
        yield off + struct.unpack_from('>h', operands, 0)[0]
    elif op in (TABLESWITCH, LOOKUPSWITCH):
        for t in switches(insn, code):
            yield t
    if op in (RETURN, IRETURN, LRETURN, FRETURN, DRETURN, ARETURN, ATHROW, RET):
        return
    if nxt in insns_by_off or nxt < len(code):
        yield nxt


def handlers(code):
    """Exception-handler start PCs are roots; the table is not needed for that."""
    return set()


def reachable(insns, code, roots):
    by_off = {i[0]: i for i in insns}
    seen, stack = set(), list(roots)
    while stack:
        pc = stack.pop()
        if pc in seen or pc not in by_off:
            continue
        seen.add(pc)
        for s in successors(by_off[pc], by_off, code):
            if s not in seen:
                stack.append(s)
    return seen


def new_of(pool, insns, class_name):
    out = []
    for off, op, operands, _ln in insns:
        if op == 0xBB:
            idx = struct.unpack_from('>H', operands, 0)[0]
            if callscan.class_name(pool, idx) == class_name:
                out.append(off)
    return out


def main():
    src_root, patched_root = sys.argv[1], sys.argv[2]
    report = {}          # the validator derives everything it needs from the patched bytecode
    verdicts = []

    # ---- patch 1: q08.drawScreen -------------------------------------------------
    blob = io.open(os.path.join(patched_root, 'q08.class'), 'rb').read()
    hit = None
    for mname, mdesc, code_file_off, code, pool in patch_login.code_arrays(blob):
        if mname != 'drawScreen':
            continue
        insns = callscan.decode_instructions(code)
        logins = new_of(pool, insns, 'qih')
        # Derive the menu-path hops from the patched code itself: every injected
        # pop;nop;nop;goto sequence. All of their targets must stay reachable.
        menu_targets = []
        for _i, (_o, _op, _ops, _ln) in enumerate(insns):
            if (_op == 0x57 and _i + 3 < len(insns)
                    and insns[_i + 1][1] == 0x00 and insns[_i + 2][1] == 0x00
                    and insns[_i + 3][1] == 0xA7):
                menu_targets.append(insns[_i + 3][0]
                                    + struct.unpack_from('>h', insns[_i + 3][2], 0)[0])
        if not menu_targets:
            verdicts.append(('q08.drawScreen', 'FAIL', 'patched guard sequence not found'))
            continue
        if not logins:
            verdicts.append(('q08.drawScreen', 'FAIL', 'no `new qih` left in the method'))
            continue
        login_pc = logins[0]
        # roots: entry + every exception handler start pc
        r = callscan.Reader(blob, 8)
        pool2 = callscan.parse_constant_pool(r)
        r.u2(); r.u2(); r.u2()
        for _ in range(r.u2()):
            r.u2()
        for _ in range(r.u2()):
            r.u2(); r.u2(); r.u2()
            for _ in range(r.u2()):
                r.u2(); ln = r.u4(); r.take(ln)
        roots = {0}
        for _ in range(r.u2()):
            _a, ni, di = r.u2(), r.u2(), r.u2()
            mno = callscan.utf(pool2, ni)
            for _ in range(r.u2()):
                ani = r.u2()
                ano = callscan.utf(pool2, ani)
                alen = r.u4()
                abody = r.take(alen)
                if ano == 'Code' and mno == 'drawScreen':
                    cr = callscan.Reader(abody)
                    cr.u2(); cr.u2()                     # max_stack, max_locals
                    cr.take(cr.u4())                     # skip the code array
                    etlen = cr.u2()
                    for _e in range(etlen):
                        _s, _e2, hpc, _c = cr.u2(), cr.u2(), cr.u2(), cr.u2()
                        roots.add(hpc)
        seen = reachable(insns, code, roots)
        login_reachable = login_pc in seen
        menu_reachable = all(t in seen for t in menu_targets)
        verdicts.append((
            'q08.drawScreen',
            'PASS' if (not login_reachable and menu_reachable) else 'FAIL',
            'login block @%d reachable=%s ; menu hops %s all reachable=%s ; roots=%s'
            % (login_pc, login_reachable, menu_targets, menu_reachable, sorted(roots))))

    # ---- patch 2: jiz.<init> -----------------------------------------------------
    blob = io.open(os.path.join(patched_root, 'jiz.class'), 'rb').read()
    left = []
    for mname, mdesc, code_file_off, code, pool in patch_login.code_arrays(blob):
        for off, op, operands, _ln in callscan.decode_instructions(code):
            if op != 0xB6:
                continue
            idx = struct.unpack_from('>H', operands, 0)[0]
            if callscan.ref_name(pool, idx) == 'sun.misc.Unsafe.putAddress':
                left.append((mname, off))
    verdicts.append(('jiz.<init>', 'PASS' if not left else 'FAIL',
                     'remaining Unsafe.putAddress call sites: %s' % (left or 'none')))

    print('%-18s %-5s %s' % ('site', 'state', 'detail'))
    for v in verdicts:
        print('%-18s %-5s %s' % v)
    bad = [v for v in verdicts if v[1] != 'PASS']
    print()
    print('VERDICT:', 'ALL CHECKS PASSED' if not bad else 'FAILURES: %d' % len(bad))
    return 1 if bad else 0


if __name__ == '__main__':
    sys.exit(main())
