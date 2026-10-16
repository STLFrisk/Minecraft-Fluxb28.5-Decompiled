/*
 * Flux dynamic probe - runs under Node + frida.
 *
 *   node frida_run.js --list                     list candidate processes
 *   node frida_run.js --attach <pid> [--dump]    attach, enumerate the native
 *                                                module, optionally dump its
 *                                                unpacked sections
 *
 * The target is Minecraft running the patched Flux client.  Its native core
 * (libsoter.dll, shipped inside the jar as META-INF/Soter) is WinLicense
 * protected: the .winlice section is 82 MB of virtual space with ZERO raw bytes
 * on disk, so nothing meaningful can be read statically.  Reading it from a live
 * process is the only way to see the real code.
 *
 * This probe is read-only: it enumerates modules, parses the in-memory PE header
 * and dumps bytes.  It does not hook, patch or execute anything in the target.
 */
'use strict';

const fs = require('fs');
const path = require('path');

const FRIDA = process.env.FRIDA_MODULE ||
  path.join(__dirname, '..', '..', 'tools', 'rea', 'node_modules', 'frida');
const frida = require(FRIDA);

function arg(name, def) {
  const i = process.argv.indexOf(name);
  return i >= 0 ? (process.argv[i + 1] || true) : def;
}

async function list() {
  // frida 17 exposes enumerateDevices(); getLocalDevices() is gone.
  if (typeof frida.enumerateDevices === 'function') {
    const devices = await frida.enumerateDevices();
    for (const d of devices) {
      console.log('device: ' + d.name + '  id=' + d.id + '  type=' + d.type);
    }
  }
  const local = await frida.getLocalDevice();
  const procs = await local.enumerateProcesses();
  const hits = procs.filter(p => /java|minecraft|flux|pcl/i.test(p.name));
  console.log('\n' + procs.length + ' processes, ' + hits.length + ' candidates:');
  for (const p of hits) {
    console.log('  pid=' + p.pid + '  ' + p.name);
  }
  if (!hits.length) {
    console.log('  (none - start the game first)');
  }
}

function readSections(ptr) {
  // DOS header -> e_lfanew -> PE header -> section table
  const e_lfanew = ptr.add(0x3c).readU32();
  const pe = ptr.add(e_lfanew);
  const sig = pe.readU32();
  if (sig !== 0x00004550) throw new Error('not a PE image (sig=0x' + sig.toString(16) + ')');
  const nsec = pe.add(6).readU16();
  const optSize = pe.add(20).readU16();
  const opt = pe.add(24);
  const magic = opt.readU16();
  const entry = opt.add(16).readU32();
  const base = magic === 0x20b ? opt.add(24).readU64().toNumber() : opt.add(28).readU32();
  const secTab = opt.add(optSize);
  const secs = [];
  for (let i = 0; i < nsec; i++) {
    const s = secTab.add(40 * i);
    let name = '';
    for (let j = 0; j < 8; j++) {
      const c = s.add(j).readU8();
      if (!c) break;
      name += String.fromCharCode(c);
    }
    secs.push({
      name,
      va: s.add(12).readU32(),
      vsize: s.add(8).readU32(),
      rawSize: s.add(16).readU32(),
      rawPtr: s.add(20).readU32(),
      flags: s.add(36).readU32(),
    });
  }
  return { base, entry, secs, e_lfanew };
}

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

async function attach(pid, doDump) {
  const device = await frida.getLocalDevice();
  const session = await device.attach(pid);
  console.log('attached to pid ' + pid);

  const script = await session.createScript(`
    rpc.exports = {
      modules: function () {
        return Process.enumerateModules().map(function (m) {
          return { name: m.name, base: m.base.toString(), size: m.size, path: m.path };
        });
      }
    };
  `);
  await script.load();
  const mods = await script.exports.modules();

  const cand = mods.filter(m => /soter|libsoter/i.test(m.name) || /soter/i.test(m.path));
  console.log('\nloaded modules: ' + mods.length);
  if (!cand.length) {
    console.log('libsoter is NOT loaded.');
    console.log('modules containing "sol", "flux" or jvm:');
    for (const m of mods.filter(x => /sol|flux|jvm|java/i.test(x.name))) {
      console.log('  ' + m.name + '  base=' + m.base + '  size=' + m.size + '  ' + m.path);
    }
    await session.detach();
    return;
  }

  for (const m of cand) {
    console.log('\n=== ' + m.name + ' ===');
    console.log('  base ' + m.base + '   size ' + m.size + ' (' + (m.size / 1048576).toFixed(1) + ' MB)');
    console.log('  path ' + m.path);

    const base = ptr(m.base);
    const info = readSections(base);
    console.log('  image base 0x' + info.base.toString(16) + '   entry RVA 0x' + info.entry.toString(16));
    console.log('  ' + info.secs.length + ' sections:');
    for (const s of info.secs) {
      const flagStr = ((s.flags & 0x20000000) ? 'X' : '-') +
                      ((s.flags & 0x80000000) ? 'W' : '-') +
                      ((s.flags & 0x40000000) ? 'R' : '-');
      console.log('    ' + s.name.padEnd(10) + ' va=0x' + s.va.toString(16).padStart(8, '0') +
                  ' vsize=0x' + s.vsize.toString(16).padStart(8, '0') +
                  ' raw=0x' + s.rawSize.toString(16).padStart(8, '0') + '  ' + flagStr);
    }

    if (!doDump) continue;
    const outDir = path.join(__dirname, '..', 'evidence', 'runtime-dump');
    fs.mkdirSync(outDir, { recursive: true });
    for (const s of info.secs) {
      if (!s.vsize) continue;
      const want = Math.min(s.vsize, 96 * 1024 * 1024);
      let buf;
      try {
        buf = base.add(s.va).readByteArray(want);
        buf = Buffer.from(buf);
      } catch (e) {
        console.log('    ' + s.name + ': unreadable (' + e.message + ')');
        continue;
      }
      const h = entropy(buf.subarray(0, Math.min(buf.length, 1 << 20)));
      const file = path.join(outDir, m.name.replace(/[^\w.-]/g, '_') + '.' + s.name.replace(/[^\w.-]/g, '_') + '.bin');
      fs.writeFileSync(file, buf);
      console.log('    ' + s.name + ': dumped ' + buf.length + ' bytes, entropy(first 1MB)=' +
                  h.toFixed(3) + ' -> ' + path.relative(path.join(__dirname, '..'), file));
    }
  }

  await session.detach();
  console.log('\ndetached');
}

(async () => {
  try {
    if (arg('--list')) {
      await list();
    } else if (arg('--attach')) {
      await attach(parseInt(arg('--attach'), 10), !!arg('--dump'));
    } else {
      console.log('usage: node frida_run.js --list | --attach <pid> [--dump]');
    }
  } catch (e) {
    console.error('ERROR: ' + e.message);
    process.exit(1);
  }
})();
