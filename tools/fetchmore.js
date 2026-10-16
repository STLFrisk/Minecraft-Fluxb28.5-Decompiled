const fs=require('fs'),path=require('path');
const [outDir]=process.argv.slice(2); fs.mkdirSync(outDir,{recursive:true});
const MC='https://libraries.minecraft.net/';
const coords=['net.java.jinput:jinput-platform:2.0.5','tv.twitch:twitch-platform:6.5','tv.twitch:twitch-external-platform:4.5'];
(async()=>{
 for(const co of coords){
   const [g,a,v]=co.split(':');
   const url=MC+g.replace(/\./g,'/')+'/'+a+'/'+v+'/'+a+'-'+v+'.jar';
   const dest=path.join(outDir,a+'-'+v+'.jar');
   try{
     const r=await fetch(url); if(!r.ok){console.log('MISS',co,r.status);continue;}
     const b=Buffer.from(await r.arrayBuffer());
     if(b[0]!==0x50){console.log('BAD',co);continue;}
     fs.writeFileSync(dest,b); console.log('OK  ',a+'-'+v+'.jar',b.length);
   }catch(e){console.log('FAIL',co,e.message);}
 }
})();
