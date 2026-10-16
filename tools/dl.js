const fs=require('fs');
const url='https://repo1.maven.org/maven2/org/benf/cfr/0.152/cfr-0.152.jar';
fetch(url).then(async r=>{
  if(!r.ok) throw new Error('HTTP '+r.status);
  const b=Buffer.from(await r.arrayBuffer());
  fs.writeFileSync(process.argv[2],b);
  console.log('saved bytes='+b.length);
}).catch(e=>{console.error('FAIL '+e.message);process.exit(1);});
