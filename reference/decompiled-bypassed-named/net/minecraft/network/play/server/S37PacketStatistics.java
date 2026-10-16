package net.minecraft.network.play.server;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class S37PacketStatistics implements mz2 {
   private Map uj2;

   public S37PacketStatistics() {
   }

   public S37PacketStatistics(Map var1) {
      this.uj2 = var1;
   }

   public void _ef(jsv var1) {
      var1.w17(this);
   }

   @Override
   public void ajj(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual nfj.gux ()I
      // 04: istore 3
      // 05: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 08: aload 0
      // 09: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 0c: putfield net/minecraft/network/play/server/S37PacketStatistics.uj2 Ljava/util/Map;
      // 0f: astore 2
      // 10: bipush 0
      // 11: istore 4
      // 13: iload 4
      // 15: iload 3
      // 16: if_icmpge 5a
      // 19: aload 1
      // 1a: sipush 32767
      // 1d: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 20: invokestatic l9p._02 (Ljava/lang/String;)L_ss;
      // 23: astore 5
      // 25: aload 1
      // 26: invokevirtual nfj.gux ()I
      // 29: istore 6
      // 2b: aload 2
      // 2c: ifnull 56
      // 2f: aload 5
      // 31: ifnull 53
      // 34: goto 3b
      // 37: invokestatic net/minecraft/network/play/server/S37PacketStatistics.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield net/minecraft/network/play/server/S37PacketStatistics.uj2 Ljava/util/Map;
      // 3f: aload 5
      // 41: iload 6
      // 43: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 46: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4b: pop
      // 4c: goto 53
      // 4f: invokestatic net/minecraft/network/play/server/S37PacketStatistics.a (Loov;)Loov;
      // 52: athrow
      // 53: iinc 4 1
      // 56: aload 2
      // 57: ifnonnull 13
      // 5a: return
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.uj2.size());
      String var10000 = S14PacketEntity.b();
      Iterator var3 = this.uj2.entrySet().iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var1.p3z(((_ss)var4.getKey()).yr5);
         var1.tao((Integer)var4.getValue());
         if (var2 == null) {
            break;
         }
      }
   }

   public Map jmb() {
      return this.uj2;
   }

   @Override
   public void ito(yw3 var1) {
      this._ef((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
