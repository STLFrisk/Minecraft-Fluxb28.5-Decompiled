#!/usr/bin/env python3
"""Harvest the JVM constant pool of every .class file:
   - UTF8 constants (strings + descriptors + names)
   - CONSTANT_String literals
   - CONSTANT_Class references
   - CONSTANT_Methodref/Fieldref owners + name+type
No external deps; pure stdlib. Outputs JSON indexes for fast triage.
"""
import os, sys, json, struct, re, collections

CLASS_MAGIC = 0xCAFEBABE

CONST_UTF8 = 1
CONST_INT = 3
CONST_FLOAT = 4
CONST_LONG = 5
CONST_DOUBLE = 6
CONST_CLASS = 7
CONST_STRING = 8
CONST_FIELDREF = 9
CONST_METHODREF = 10
CONST_IFACEMETHODREF = 11
CONST_NAMEANDTYPE = 12
CONST_METHODHANDLE = 15
CONST_METHODTYPE = 16
CONST_DYNAMIC = 17
CONST_INVOKEDYNAMIC = 18
CONST_MODULE = 19
CONST_PACKAGE = 20


def parse_pool(blob, off):
    """Return (entries, new_off). entries[i] = (tag, payload) 1-indexed."""
    (count,) = struct.unpack_from('>H', blob, off)
    off += 2
    entries = [None] * count
    i = 1
    while i < count:
        tag = blob[off]
        off += 1
        if tag == CONST_UTF8:
            (ln,) = struct.unpack_from('>H', blob, off)
            off += 2
            raw = blob[off:off + ln]
            off += ln
            entries[i] = (tag, raw.decode('utf-8', 'replace'))
        elif tag in (CONST_INT, CONST_FLOAT):
            entries[i] = (tag, struct.unpack_from('>i', blob, off)[0])
            off += 4
        elif tag in (CONST_LONG, CONST_DOUBLE):
            entries[i] = (tag, struct.unpack_from('>q', blob, off)[0])
            off += 8
            i += 1  # 8-byte constants take two pool slots
        elif tag in (CONST_CLASS, CONST_STRING, CONST_METHODTYPE, CONST_MODULE, CONST_PACKAGE):
            entries[i] = (tag, struct.unpack_from('>H', blob, off)[0])
            off += 2
        elif tag in (CONST_FIELDREF, CONST_METHODREF, CONST_IFACEMETHODREF,
                     CONST_NAMEANDTYPE, CONST_DYNAMIC, CONST_INVOKEDYNAMIC):
            entries[i] = (tag, struct.unpack_from('>HH', blob, off))
            off += 4
        elif tag == CONST_METHODHANDLE:
            entries[i] = (tag, struct.unpack_from('>BH', blob, off))
            off += 3
        else:
            raise ValueError('unknown constant tag %d at %d' % (tag, off - 1))
        i += 1
    return entries, off


def class_name_from_pool(pool, idx):
    """Resolve CONSTANT_Class index -> dotted name, strictly (None if not a Class)."""
    if idx is None or idx == 0 or idx >= len(pool) or pool[idx] is None:
        return None
    tag, val = pool[idx]
    if tag != CONST_CLASS:
        return None
    if val == 0 or val >= len(pool) or pool[val] is None:
        return None
    if pool[val][0] != CONST_UTF8:
        return None
    return pool[val][1].replace('/', '.')


def harvest(path):
    with open(path, 'rb') as fh:
        blob = fh.read()
    if len(blob) < 10 or struct.unpack_from('>I', blob, 0)[0] != CLASS_MAGIC:
        return None
    minor, major = struct.unpack_from('>HH', blob, 4)
    pool, _ = parse_pool(blob, 8)

    tag_mismatch = []

    def class_name(idx):
        """Resolve a CONSTANT_Class index to its dotted binary name."""
        if idx is None or idx == 0 or idx >= len(pool) or pool[idx] is None:
            return None
        tag, val = pool[idx]
        if tag != CONST_CLASS:
            tag_mismatch.append((idx, tag))
            return None
        return (utf(val) or '').replace('/', '.')

    def utf(idx):
        """Resolve a pool index to its UTF8 text, strictly.

        Returns None for anything that is not a live CONSTANT_Utf8 entry so a
        desynchronised or unusual pool can never yield a non-string value.
        """
        if idx is None or idx == 0 or idx >= len(pool) or pool[idx] is None:
            return None
        tag, val = pool[idx]
        if tag != CONST_UTF8:
            tag_mismatch.append((idx, tag))
            return None
        return val

    strings, classes, member_refs = set(), set(), []
    for e in pool:
        if e is None:
            continue
        tag, val = e
        if tag == CONST_STRING:
            s = utf(val)
            if s is not None:
                strings.add(s)
        elif tag == CONST_CLASS:
            s = utf(val)          # val is the Utf8 name_index
            if s:
                classes.add(s.replace('/', '.'))
        elif tag in (CONST_FIELDREF, CONST_METHODREF, CONST_IFACEMETHODREF):
            cls_i, nat_i = val
            owner = class_name_from_pool(pool, cls_i) or ''
            name = typ = None
            if nat_i and nat_i < len(pool) and pool[nat_i]:
                name = utf(pool[nat_i][1][0])
                typ = utf(pool[nat_i][1][1])
            kind = {CONST_FIELDREF: 'field', CONST_METHODREF: 'method',
                    CONST_IFACEMETHODREF: 'iface'}[tag]
            member_refs.append([kind, owner, name, typ])
    return {
        'major': major,
        'strings': sorted(strings),
        'classes': sorted(classes),
        'members': member_refs,
        'tag_mismatch': tag_mismatch,
    }


def main():
    root = sys.argv[1]
    out = sys.argv[2]
    os.makedirs(out, exist_ok=True)

    index = {}
    string_owners = collections.defaultdict(set)   # literal -> declaring classes
    class_users = collections.defaultdict(set)     # referenced class/simple name -> users
    member_owners = collections.defaultdict(set)   # owner.name -> callers
    majors = collections.Counter()
    mismatches = {}

    files = []
    for dirpath, _dirnames, filenames in os.walk(root):
        for fn in filenames:
            if fn.endswith('.class'):
                files.append(os.path.join(dirpath, fn))
    files.sort()

    for path in files:
        rel = os.path.relpath(path, root).replace('\\', '/')
        cls_name = rel[:-6].replace('/', '.')
        try:
            data = harvest(path)
        except Exception as exc:                     # keep going, record the hole
            index[cls_name] = {'error': str(exc)}
            continue
        if data is None:
            continue
        majors[data['major']] += 1
        if data['tag_mismatch']:
            mismatches[cls_name] = data['tag_mismatch'][:5]
        index[cls_name] = {
            'major': data['major'],
            'strings': data['strings'],
            'refs': data['classes'],
            'members': data['members'],
        }
        for s in data['strings']:
            string_owners[s].add(cls_name)
        for c in data['classes']:
            class_users[c].add(cls_name)
        for kind, owner, name, typ in data['members']:
            member_owners['%s.%s' % (owner, name or '?')].add(cls_name)

    with open(os.path.join(out, 'classes.json'), 'w', encoding='utf-8') as fh:
        json.dump(index, fh)
    with open(os.path.join(out, 'string_index.json'), 'w', encoding='utf-8') as fh:
        json.dump({k: sorted(v) for k, v in sorted(string_owners.items())}, fh, indent=0)
    with open(os.path.join(out, 'class_index.json'), 'w', encoding='utf-8') as fh:
        json.dump({k: sorted(v) for k, v in sorted(class_users.items())}, fh, indent=0)
    with open(os.path.join(out, 'member_index.json'), 'w', encoding='utf-8') as fh:
        json.dump({k: sorted(v) for k, v in sorted(member_owners.items())}, fh, indent=0)

    print('classes parsed      :', len(index))
    print('distinct literals   :', len(string_owners))
    print('distinct class refs :', len(class_users))
    print('distinct members    :', len(member_owners))
    print('class file versions :', dict(majors))
    print('pool tag mismatches :', len(mismatches))


if __name__ == '__main__':
    main()
