public class txr extends xg0 {
   public txr(t9d var1) {
      super(var1);
   }

   public txr(t9d var1, g_3 var2) {
      super(var1, var2);
   }

   public txr(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public void _7u(akm param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield akm.sc8 Li2h;
      // 08: ifnull 36
      // 0b: bipush 0
      // 0c: istore 3
      // 0d: aload 1
      // 0e: getfield akm.sc8 Li2h;
      // 11: instanceof j91
      // 14: iload 2
      // 15: ifne 35
      // 18: ifeq 24
      // 1b: goto 22
      // 1e: invokestatic txr.a (Loov;)Loov;
      // 21: athrow
      // 22: bipush 3
      // 23: istore 3
      // 24: aload 1
      // 25: getfield akm.sc8 Li2h;
      // 28: aload 0
      // 29: aload 0
      // 2a: invokevirtual txr.lmd ()Lg_3;
      // 2d: invokestatic ofh.lr9 (Li2h;Li2h;)Lofh;
      // 30: iload 3
      // 31: i2f
      // 32: invokevirtual i2h.m1t (Lofh;F)Z
      // 35: pop
      // 36: bipush 0
      // 37: istore 3
      // 38: iload 3
      // 39: bipush 8
      // 3b: if_icmpge 6c
      // 3e: aload 0
      // 3f: getfield txr.oay Lt9d;
      // 42: getstatic w_0.t6l Lw_0;
      // 45: aload 0
      // 46: getfield txr.o2v D
      // 49: aload 0
      // 4a: getfield txr.kfp D
      // 4d: aload 0
      // 4e: getfield txr.vbd D
      // 51: dconst_0
      // 52: dconst_0
      // 53: dconst_0
      // 54: bipush 0
      // 55: newarray 10
      // 57: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 5a: iinc 3 1
      // 5d: iload 2
      // 5e: ifne 8c
      // 61: iload 2
      // 62: ifeq 38
      // 65: goto 6c
      // 68: invokestatic txr.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: iload 2
      // 6e: ifne 89
      // 71: getfield txr.oay Lt9d;
      // 74: getfield t9d.v0f Z
      // 77: ifne 8c
      // 7a: goto 81
      // 7d: invokestatic txr.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 0
      // 82: goto 89
      // 85: invokestatic txr.a (Loov;)Loov;
      // 88: athrow
      // 89: invokevirtual txr._kl ()V
      // 8c: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
