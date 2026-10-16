// Fetch the Minecraft 1.8 dependency set so the ZKM <clinit> blocks can link.
const fs = require('fs');
const path = require('path');

const [outDir] = process.argv.slice(2);
fs.mkdirSync(outDir, { recursive: true });

const CENTRAL = 'https://repo1.maven.org/maven2/';
const MC = 'https://libraries.minecraft.net/';

// Maven coordinates exactly as Flux.json declares them.
const coords = [
  ['com.google.guava:guava:17.0', CENTRAL],
  ['com.google.code.gson:gson:2.2.4', CENTRAL],
  ['org.apache.commons:commons-lang3:3.3.2', CENTRAL],
  ['commons-io:commons-io:2.4', CENTRAL],
  ['commons-codec:commons-codec:1.9', CENTRAL],
  ['org.apache.logging.log4j:log4j-api:2.0-beta9', CENTRAL],
  ['org.apache.logging.log4j:log4j-core:2.0-beta9', CENTRAL],
  ['com.mojang:authlib:1.5.21', MC],
  ['com.mojang:realms:1.7.48', MC],
  ['org.apache.commons:commons-compress:1.8.1', CENTRAL],
  ['org.apache.httpcomponents:httpclient:4.3.3', CENTRAL],
  ['org.apache.httpcomponents:httpcore:4.3.2', CENTRAL],
  ['commons-logging:commons-logging:1.1.3', CENTRAL],
  ['net.sf.jopt-simple:jopt-simple:4.6', CENTRAL],
  ['net.java.dev.jna:jna:3.4.0', MC],
  ['net.java.dev.jna:platform:3.4.0', MC],
  ['net.java.jinput:jinput:2.0.5', MC],
  ['net.java.jutils:jutils:1.0.0', MC],
  ['io.netty:netty-all:4.0.23.Final', CENTRAL],
  ['com.paulscode:codecjorbis:20101023', MC],
  ['com.paulscode:codecwav:20101023', MC],
  ['com.paulscode:libraryjavasound:20101123', MC],
  ['com.paulscode:librarylwjglopenal:20100824', MC],
  ['com.paulscode:soundsystem:20120107', MC],
  ['org.lwjgl.lwjgl:lwjgl:2.9.4-nightly-20150209', MC],
  ['org.lwjgl.lwjgl:lwjgl_util:2.9.4-nightly-20150209', MC],
  ['tv.twitch:twitch:6.5', MC],
  ['com.ibm.icu:icu4j-core-mojang:51.2', MC],
  ['oshi-project:oshi-core:1.1', MC],
];

function urlFor(co, base) {
  const [g, a, v] = co.split(':');
  return base + g.replace(/\./g, '/') + '/' + a + '/' + v + '/' + a + '-' + v + '.jar';
}

(async () => {
  let ok = 0;
  const failed = [];
  for (const [co, base] of coords) {
    const name = co.split(':')[1] + '-' + co.split(':')[2] + '.jar';
    const dest = path.join(outDir, name);
    if (fs.existsSync(dest) && fs.statSync(dest).size > 0) { ok++; continue; }
    let done = false;
    for (const b of [base, CENTRAL, MC]) {
      try {
        const r = await fetch(urlFor(co, b));
        if (!r.ok) continue;
        const buf = Buffer.from(await r.arrayBuffer());
        if (buf.length < 200 || buf[0] !== 0x50) continue;   // 'P' of PK
        fs.writeFileSync(dest, buf);
        console.log('OK   ' + name + '  ' + buf.length + ' bytes  (' + b + ')');
        ok++; done = true; break;
      } catch (e) { /* try next mirror */ }
    }
    if (!done) { console.log('MISS ' + co); failed.push(co); }
  }
  console.log('---');
  console.log('downloaded/available: ' + ok + '/' + coords.length);
  if (failed.length) console.log('missing: ' + failed.join(', '));
})();
