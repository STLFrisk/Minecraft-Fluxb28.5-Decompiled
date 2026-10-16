#!/usr/bin/env python3
"""Minimal PE32/PE32+ reader: sections, exports, imports, TLS, resources.
Pure stdlib; enough to triage a dropped native payload without a disassembler.
"""
import struct
import sys


def parse(path):
    b = open(path, 'rb').read()
    info = {'path': path, 'size': len(b)}
    e_lfanew = struct.unpack_from('<I', b, 0x3C)[0]
    info['pe_offset'] = e_lfanew
    (mach, nsec, ts, _psym, _nsym, optsz, chars) = struct.unpack_from('<HHIIIHH', b, e_lfanew + 4)
    info['machine'] = mach
    info['sections_n'] = nsec
    info['timestamp'] = ts
    info['characteristics'] = chars
    off = e_lfanew + 24
    magic = struct.unpack_from('<H', b, off)[0]
    info['optional_magic'] = magic
    plus = magic == 0x20B
    if plus:
        info['entry_rva'] = struct.unpack_from('<I', b, off + 16)[0]
        info['image_base'] = struct.unpack_from('<Q', b, off + 24)[0]
        ndd = struct.unpack_from('<I', b, off + 108)[0]
        ddoff = off + 112
    else:
        info['entry_rva'] = struct.unpack_from('<I', b, off + 16)[0]
        info['image_base'] = struct.unpack_from('<I', b, off + 28)[0]
        ndd = struct.unpack_from('<I', b, off + 92)[0]
        ddoff = off + 96
    dd = []
    for i in range(ndd):
        rva, sz = struct.unpack_from('<II', b, ddoff + 8 * i)
        dd.append((rva, sz))
    info['data_dirs'] = dd

    secoff = off + optsz
    secs = []
    for i in range(nsec):
        o = secoff + 40 * i
        name = b[o:o + 8].rstrip(b'\x00').decode('latin1')
        vsize, vaddr, rsize, raddr = struct.unpack_from('<IIII', b, o + 8)
        sflags = struct.unpack_from('<I', b, o + 36)[0]
        secs.append({'name': name, 'vsize': vsize, 'vaddr': vaddr,
                     'rsize': rsize, 'raddr': raddr, 'flags': sflags})
    info['sections'] = secs
    info['_blob'] = b
    return info


def rva2off(info, rva):
    for s in info['sections']:
        if s['vaddr'] <= rva < s['vaddr'] + max(s['vsize'], s['rsize']):
            d = rva - s['vaddr']
            if d < s['rsize']:
                return s['raddr'] + d
            return None
    return None


def cstr(b, off, limit=512):
    end = b.find(b'\x00', off, off + limit)
    if end < 0:
        end = min(off + limit, len(b))
    return b[off:end].decode('latin1')


def exports(info):
    b = info['_blob']
    rva, size = info['data_dirs'][0]
    if not rva or not size:
        return None
    o = rva2off(info, rva)
    if o is None:
        return None
    (chars, ts, maj, mnr, name_rva, base, nfunc, nname,
     afunc, aname, aord) = struct.unpack_from('<IIHHIIIIIII', b, o)
    dll = cstr(b, rva2off(info, name_rva))
    out = {'dll': dll, 'base': base, 'nfunc': nfunc, 'nname': nname, 'names': []}
    no = rva2off(info, aname)
    oo = rva2off(info, aord)
    fo = rva2off(info, afunc)
    for i in range(nname):
        nr = struct.unpack_from('<I', b, no + 4 * i)[0]
        ordi = struct.unpack_from('<H', b, oo + 2 * i)[0]
        fr = struct.unpack_from('<I', b, fo + 4 * ordi)[0]
        out['names'].append((ordi, fr, cstr(b, rva2off(info, nr))))
    return out


def imports(info):
    b = info['_blob']
    rva, size = info['data_dirs'][1]
    if not rva:
        return []
    plus = info['optional_magic'] == 0x20B
    o = rva2off(info, rva)
    out = []
    i = 0
    while True:
        ent = o + 20 * i
        if ent + 20 > len(b):
            break
        ilt, ts, fc, nrva, iat = struct.unpack_from('<IIIII', b, ent)
        if ilt == 0 and nrva == 0 and iat == 0:
            break
        dll = cstr(b, rva2off(info, nrva)) if nrva else '?'
        thunk = ilt or iat
        to = rva2off(info, thunk)
        funcs = []
        if to:
            step = 8 if plus else 4
            fmt = '<Q' if plus else '<I'
            ordinal_flag = (1 << 63) if plus else (1 << 31)
            j = 0
            while True:
                v = struct.unpack_from(fmt, b, to + step * j)[0]
                if v == 0:
                    break
                if v & ordinal_flag:
                    funcs.append('#%d' % (v & 0xFFFF))
                else:
                    funcs.append(cstr(b, rva2off(info, v) + 2))
                j += 1
                if j > 5000:
                    break
        out.append({'dll': dll, 'funcs': funcs})
        i += 1
        if i > 400:
            break
    return out


def main():
    p = sys.argv[1]
    info = parse(p)
    print('file            :', info['path'], info['size'], 'bytes')
    print('machine         : %#x' % info['machine'],
          '(x86-64)' if info['machine'] == 0x8664 else '')
    print('timestamp       :', info['timestamp'])
    print('image base      : %#x' % info['image_base'])
    print('entry RVA       : %#x  -> VA %#x' % (info['entry_rva'],
                                                info['image_base'] + info['entry_rva']))
    print('DLL flag        :', bool(info['characteristics'] & 0x2000))
    print()
    print('%-10s %-12s %-12s %-12s %-12s %s' % ('name', 'vaddr', 'vsize', 'raddr', 'rsize', 'flags'))
    for s in info['sections']:
        print('%-10s %#-12x %-12d %#-12x %-12d %#x' % (
            s['name'], s['vaddr'], s['vsize'], s['raddr'], s['rsize'], s['flags']))
    print()
    ex = exports(info)
    if ex:
        print('exports dll=%s base=%d nfunc=%d nname=%d' % (ex['dll'], ex['base'],
                                                           ex['nfunc'], ex['nname']))
        for ordi, fr, nm in ex['names'][:60]:
            print('   #%-6d %#-12x %s' % (ordi, fr, nm))
    print()
    imps = imports(info)
    print('imported DLLs (%d):' % len(imps))
    for e in imps:
        print('   %-32s %4d funcs  %s' % (e['dll'], len(e['funcs']),
                                          ', '.join(e['funcs'][:12])))


if __name__ == '__main__':
    main()
