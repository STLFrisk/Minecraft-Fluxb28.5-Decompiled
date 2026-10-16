import java.util.Random;

public class u10$kme implements ps6 {
   public int yzh;

   public void rqa(Random param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: bipush 5
      // 06: invokevirtual java/util/Random.nextInt (I)I
      // 09: istore 3
      // 0a: iload 3
      // 0b: bipush 1
      // 0c: iload 2
      // 0d: ifne 38
      // 10: if_icmpgt 2f
      // 13: goto 1a
      // 16: invokestatic u10$kme.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getstatic mcs.uwx Lmcs;
      // 1e: getfield mcs.zr9 I
      // 21: putfield u10$kme.yzh I
      // 24: iload 2
      // 25: ifeq a4
      // 28: goto 2f
      // 2b: invokestatic u10$kme.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 3
      // 30: bipush 2
      // 31: goto 38
      // 34: invokestatic u10$kme.a (Loov;)Loov;
      // 37: athrow
      // 38: iload 2
      // 39: ifne 64
      // 3c: if_icmpgt 5b
      // 3f: goto 46
      // 42: invokestatic u10$kme.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getstatic mcs.faz Lmcs;
      // 4a: getfield mcs.zr9 I
      // 4d: putfield u10$kme.yzh I
      // 50: iload 2
      // 51: ifeq a4
      // 54: goto 5b
      // 57: invokestatic u10$kme.a (Loov;)Loov;
      // 5a: athrow
      // 5b: iload 3
      // 5c: bipush 3
      // 5d: goto 64
      // 60: invokestatic u10$kme.a (Loov;)Loov;
      // 63: athrow
      // 64: iload 2
      // 65: ifne 90
      // 68: if_icmpgt 87
      // 6b: goto 72
      // 6e: invokestatic u10$kme.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: getstatic mcs.kkg Lmcs;
      // 76: getfield mcs.zr9 I
      // 79: putfield u10$kme.yzh I
      // 7c: iload 2
      // 7d: ifeq a4
      // 80: goto 87
      // 83: invokestatic u10$kme.a (Loov;)Loov;
      // 86: athrow
      // 87: iload 3
      // 88: bipush 4
      // 89: goto 90
      // 8c: invokestatic u10$kme.a (Loov;)Loov;
      // 8f: athrow
      // 90: if_icmpgt a4
      // 93: aload 0
      // 94: getstatic mcs.zgt Lmcs;
      // 97: getfield mcs.zr9 I
      // 9a: putfield u10$kme.yzh I
      // 9d: goto a4
      // a0: invokestatic u10$kme.a (Loov;)Loov;
      // a3: athrow
      // a4: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
