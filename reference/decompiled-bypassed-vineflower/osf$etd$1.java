import com.google.common.base.Predicate;

public class osf$etd$1 implements Predicate {
   public final Predicate z64;
   public final laq _sd;
   public final osf$etd kd3;

   public osf$etd$1(osf$etd var1, Predicate var2, laq var3) {
      this.kd3 = var1;
      this.z64 = var2;
      this._sd = var3;
   }

   public boolean vwo(g_3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield osf$etd$1.z64 Lcom/google/common/base/Predicate;
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifnull 3b
      // 0f: goto 16
      // 12: invokestatic osf$etd$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield osf$etd$1.z64 Lcom/google/common/base/Predicate;
      // 1a: goto 21
      // 1d: invokestatic osf$etd$1.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 27: iload 2
      // 28: ifne 3f
      // 2b: ifne 3b
      // 2e: goto 35
      // 31: invokestatic osf$etd$1.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic osf$etd$1.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: instanceof gze
      // 3f: iload 2
      // 40: ifne 57
      // 43: ifeq 53
      // 46: goto 4d
      // 49: invokestatic osf$etd$1.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 0
      // 4e: ireturn
      // 4f: invokestatic osf$etd$1.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 1
      // 54: instanceof ha9
      // 57: iload 2
      // 58: ifne f2
      // 5b: ifeq e9
      // 5e: goto 65
      // 61: invokestatic osf$etd$1.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: getfield osf$etd$1.kd3 Losf$etd;
      // 69: invokestatic osf$etd.bxt (Losf$etd;)D
      // 6c: dstore 3
      // 6d: aload 1
      // 6e: invokevirtual g_3.hzv ()Z
      // 71: iload 2
      // 72: ifne 89
      // 75: ifeq 85
      // 78: goto 7f
      // 7b: invokestatic osf$etd$1.a (Loov;)Loov;
      // 7e: athrow
      // 7f: dload 3
      // 80: ldc2_w 0.800000011920929
      // 83: dmul
      // 84: dstore 3
      // 85: aload 1
      // 86: invokevirtual g_3.h5u ()Z
      // 89: iload 2
      // 8a: ifne d5
      // 8d: ifeq ca
      // 90: goto 97
      // 93: invokestatic osf$etd$1.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 1
      // 98: checkcast ha9
      // 9b: invokevirtual ha9.ws9 ()F
      // 9e: fstore 5
      // a0: fload 5
      // a2: iload 2
      // a3: ifne be
      // a6: ldc 0.1
      // a8: nop
      // a9: fcmpg
      // aa: ifge c0
      // ad: goto b4
      // b0: invokestatic osf$etd$1.a (Loov;)Loov;
      // b3: athrow
      // b4: ldc 0.1
      // b6: nop
      // b7: goto be
      // ba: invokestatic osf$etd$1.a (Loov;)Loov;
      // bd: athrow
      // be: fstore 5
      // c0: dload 3
      // c1: ldc 0.7
      // c3: nop
      // c4: fload 5
      // c6: fmul
      // c7: f2d
      // c8: dmul
      // c9: dstore 3
      // ca: aload 1
      // cb: aload 0
      // cc: getfield osf$etd$1._sd Llaq;
      // cf: invokevirtual g_3.tm6 (Li2h;)F
      // d2: f2d
      // d3: dload 3
      // d4: dcmpl
      // d5: iload 2
      // d6: ifne f2
      // d9: ifle e9
      // dc: goto e3
      // df: invokestatic osf$etd$1.a (Loov;)Loov;
      // e2: athrow
      // e3: bipush 0
      // e4: ireturn
      // e5: invokestatic osf$etd$1.a (Loov;)Loov;
      // e8: athrow
      // e9: aload 0
      // ea: getfield osf$etd$1.kd3 Losf$etd;
      // ed: aload 1
      // ee: bipush 0
      // ef: invokestatic osf$etd._68 (Losf$etd;Lg_3;Z)Z
      // f2: ireturn
   }

   public boolean apply(Object var1) {
      return this.vwo((g_3)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
