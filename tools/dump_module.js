/*
 * Dump the sections of a live module, given a substring of its name.
 * The Flux native core loads under a random GUID name, so it cannot be matched
 * by searching for "soter".
 *
 *   node dump_module.js <pid> <name-substring> [max-mb-per-section]
 */
'use strict';

const fs = require('fs');
const path = require('path');
const frida = require(process.env.FRIDA_PATH ||
  path.join(__dirname, '..', '..', 'tools', 'rea', 'node_modules', 'frida'));

function entropy(buf) {
  const hist = new Array(256).fill(0);
  for (let i = 0; i < buf.length; i++) hist[buf[i]]++;
  let h = 0;
  for (let i = 0; i < 256; i++) {
    if (!hist[i]) continue;
    const p = hist[i] / buf.length;
    h -= p * Math.log2(p);
  }
  return h;
}

(async () => {
  const pid = parseInt(process.argv[2], 10);
  const want = process.argv[3];
  const cap = (parseFloat(process.argv[4]) || 128) * 1024 * 1024;

  const device = await frida.getLocalDevice();
  const session = await device.attach(pid);
  const script = await session.createScript(`
    rpc.exports = {
      mods: function () {
        return Process.enumerateModules().map(function (m) {
          return { n: m.name, b: m.base, s: m.size, p: m.path };
        });
      },
      sections: function (baseStr) {
        var base = ptr(baseStr);
        var e_lfanew = base.add(0x3c).readU32();
        var pe = base.add(e_lfanew);
        if (pe.readU32() !== 0x00004550) throw new Error('not PE');
        var nsec = pe.add(6).readU16();
        var optSize = pe.add(20).readU16();
        var opt = pe.add(24);
        var magic = opt.readU16();
        var imageBase = magic === 0x20b ? opt.add(24).readU64().toNumber()
                                        : opt.add(28).readU32();
        var entry = opt.add(16).readU32();
        var secTab = opt.add(optSize);
        var out = [];
        for (var i = 0; i < nsec; i++) {
          var s = secTab.add(40 * i);
          var nm = '';
          for (var j = 0; j < 8; j++) { var c = s.add(j).readU8(); if (!c) break; nm += String.fromCharCode(c); }
          out.push({
            name: nm,
            va: s.add(12).readU32(),
            vsize: s.add(8).readU32(),
            rawSize: s.add(16).readU32(),
            flags: s.add(36).readU32()
          });
        }
        return { imageBase: imageBase, entry: entry, sections: out };
      },
      read: function (baseStr, rva, len) { return ptr(baseStr).add(rva).readByteArray(len); }
    };
  `);
  await script.load();

  const mods = await script.exports.mods();
  const hits = mods.filter(m => m.n.toLowerCase().indexOf(want.toLowerCase()) >= 0 ||
                                m.p.toLowerCase().indexOf(want.toLowerCase()) >= 0);
  if (!hits.length) { console.log('no module matches "' + want + '"'); await session.detach(); return; }

  const outDir = path.join(__dirname, '..', 'evidence', 'runtime-dump');
  fs.mkdirSync(outDir, { recursive: true });

  for (const m of hits) {
    console.log('=== ' + m.n + ' ===');
    console.log('  base ' + m.b + '  size ' + (m.s / 1048576).toFixed(1) + ' MB');
    console.log('  path ' + m.p);
    const info = await script.exports.sections(m.b);
    console.log('  imageBase 0x' + info.imageBase.toString(16) + '  entryRVA 0x' + info.entry.toString(16));
    for (const s of info.sections) {
      const fl = ((s.flags & 0x20000000) ? 'X' : '-') + ((s.flags & 0x80000000) ? 'W' : '-') +
                 ((s.flags & 0x40000000) ? 'R' : '-');
      console.log('    ' + s.name.padEnd(10) + ' va=0x' + s.va.toString(16).padStart(8, '0') +
                  ' vsize=0x' + s.vsize.toString(16).padStart(8, '0') +
                  ' raw=0x' + s.rawSize.toString(16).padStart(8, '0') + '  ' + fl);
    }
    
    for (let idx = 0; idx < info.sections.length; idx++) {
      const s = info.sections[idx];
      if (!s.vsize) continue;
      const len = Math.min(s.vsize, cap);
      let buf;
      try {
        buf = Buffer.from(await script.exports.read(m.b, s.va, len));
      } catch (e) {
        console.log('    ' + (s.name || ('sec' + idx)) + ': unreadable (' + e.message + ')');
        continue;
      }
      const h = entropy(buf.subarray(0, Math.min(buf.length, 1 << 20)));
      const f = path.join(outDir, (m.n.replace(/[^\w.-]/g, '_') + '.' +
                    String(idx).padStart(2, '0') + '.' +
                    (s.name.replace(/[^\w.-]/g, '_') || 'sec') + '.bin'));
      fs.writeFileSync(f, buf);
      console.log('    -> ' + path.basename(f) + '  ' + buf.length + ' bytes  entropy=' + h.toFixed(3));
    }
  }
  await session.detach();
  console.log('detached');
})().catch(e => { console.error('ERR ' + e.message); process.exit(1); });
