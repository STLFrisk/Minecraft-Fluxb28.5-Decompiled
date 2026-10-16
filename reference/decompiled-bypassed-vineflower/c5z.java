public class c5z {
   public static g_3 mi2(float var0, float var1, float var2) {
      hpk var3 = new hpk(c05.vz1().tij, c05.vz1().vg8.x6l());
      float var4 = c05.vz1().nsd().x5k;
      float var5 = c05.vz1().nsd().y2i;
      c05.vz1().nsd().x5k = var0;
      c05.vz1().nsd().y2i = var1;
      var3.oyu(c05.vz1().nsd());
      var3.nyk(c05.vz1().nsd());
      c05.vz1().nsd().y2i = var5;
      c05.vz1().nsd().x5k = var4;
      return vc6(var3, 1.0F, (double)var2);
   }

   private static g_3 vc6(i2h param0, float param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 5
      // 003: invokestatic t9d.b ()I
      // 006: aload 0
      // 007: fload 1
      // 008: invokevirtual i2h.tib (F)Lfqr;
      // 00b: astore 6
      // 00d: aload 0
      // 00e: fload 1
      // 00f: invokevirtual i2h.wej (F)Lfqr;
      // 012: astore 7
      // 014: istore 4
      // 016: aload 6
      // 018: aload 7
      // 01a: getfield fqr.lvi D
      // 01d: dload 2
      // 01e: dmul
      // 01f: aload 7
      // 021: getfield fqr.gn5 D
      // 024: dload 2
      // 025: dmul
      // 026: aload 7
      // 028: getfield fqr.bn2 D
      // 02b: dload 2
      // 02c: dmul
      // 02d: invokevirtual fqr.r2x (DDD)Lfqr;
      // 030: astore 8
      // 032: fconst_1
      // 033: fstore 9
      // 035: invokestatic c05.vz1 ()Lc05;
      // 038: getfield c05.tij Lkh3;
      // 03b: aload 0
      // 03c: aload 0
      // 03d: invokevirtual i2h.aaw ()Lnh4;
      // 040: aload 7
      // 042: getfield fqr.lvi D
      // 045: dload 2
      // 046: dmul
      // 047: aload 7
      // 049: getfield fqr.gn5 D
      // 04c: dload 2
      // 04d: dmul
      // 04e: aload 7
      // 050: getfield fqr.bn2 D
      // 053: dload 2
      // 054: dmul
      // 055: invokevirtual nh4.z9h (DDD)Lnh4;
      // 058: fload 9
      // 05a: f2d
      // 05b: fload 9
      // 05d: f2d
      // 05e: fload 9
      // 060: f2d
      // 061: invokevirtual nh4.c2h (DDD)Lnh4;
      // 064: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 067: new c5z$1
      // 06a: dup
      // 06b: invokespecial c5z$1.<init> ()V
      // 06e: invokestatic com/google/common/base/Predicates.and (Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 071: invokevirtual kh3.sr2 (Li2h;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 074: astore 10
      // 076: dload 2
      // 077: dstore 11
      // 079: bipush 0
      // 07a: istore 13
      // 07c: iload 13
      // 07e: aload 10
      // 080: invokeinterface java/util/List.size ()I 1
      // 085: if_icmpge 1a5
      // 088: aload 10
      // 08a: iload 13
      // 08c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 091: checkcast i2h
      // 094: astore 14
      // 096: aload 14
      // 098: iload 4
      // 09a: ifeq 1a7
      // 09d: iload 4
      // 09f: ifeq 0c2
      // 0a2: goto 0a9
      // 0a5: invokestatic c5z.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: invokestatic c05.vz1 ()Lc05;
      // 0ac: getfield c05.vg8 Ll86;
      // 0af: if_acmpne 0c0
      // 0b2: goto 0b9
      // 0b5: invokestatic c5z.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: goto 19d
      // 0bc: invokestatic c5z.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 14
      // 0c2: invokevirtual i2h.npl ()F
      // 0c5: fstore 15
      // 0c7: aload 14
      // 0c9: invokevirtual i2h.aaw ()Lnh4;
      // 0cc: fload 15
      // 0ce: f2d
      // 0cf: fload 15
      // 0d1: f2d
      // 0d2: fload 15
      // 0d4: f2d
      // 0d5: invokevirtual nh4.c2h (DDD)Lnh4;
      // 0d8: astore 16
      // 0da: aload 16
      // 0dc: aload 6
      // 0de: aload 8
      // 0e0: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 0e3: astore 17
      // 0e5: aload 16
      // 0e7: aload 6
      // 0e9: invokevirtual nh4.fd8 (Lfqr;)Z
      // 0ec: iload 4
      // 0ee: ifeq 112
      // 0f1: ifeq 121
      // 0f4: goto 0fb
      // 0f7: invokestatic c5z.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: dload 11
      // 0fd: iload 4
      // 0ff: ifeq 11a
      // 102: goto 109
      // 105: invokestatic c5z.a (Loov;)Loov;
      // 108: athrow
      // 109: dconst_0
      // 10a: dcmpl
      // 10b: goto 112
      // 10e: invokestatic c5z.a (Loov;)Loov;
      // 111: athrow
      // 112: iflt 19d
      // 115: aload 14
      // 117: astore 5
      // 119: dconst_0
      // 11a: dstore 11
      // 11c: iload 4
      // 11e: ifne 19d
      // 121: aload 17
      // 123: ifnull 19d
      // 126: goto 12d
      // 129: invokestatic c5z.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 6
      // 12f: aload 17
      // 131: getfield akm.jhn Lfqr;
      // 134: invokevirtual fqr.b4d (Lfqr;)D
      // 137: dstore 18
      // 139: dload 18
      // 13b: dload 11
      // 13d: dcmpg
      // 13e: iload 4
      // 140: ifeq 158
      // 143: iflt 15b
      // 146: goto 14d
      // 149: invokestatic c5z.a (Loov;)Loov;
      // 14c: athrow
      // 14d: dload 11
      // 14f: dconst_0
      // 150: dcmpl
      // 151: goto 158
      // 154: invokestatic c5z.a (Loov;)Loov;
      // 157: athrow
      // 158: ifne 19d
      // 15b: aload 14
      // 15d: iload 4
      // 15f: ifeq 197
      // 162: goto 169
      // 165: invokestatic c5z.a (Loov;)Loov;
      // 168: athrow
      // 169: aload 0
      // 16a: getfield i2h.hzp Li2h;
      // 16d: if_acmpne 18e
      // 170: goto 177
      // 173: invokestatic c5z.a (Loov;)Loov;
      // 176: athrow
      // 177: dload 11
      // 179: dconst_0
      // 17a: dcmpl
      // 17b: ifne 19d
      // 17e: goto 185
      // 181: invokestatic c5z.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 14
      // 187: astore 5
      // 189: iload 4
      // 18b: ifne 19d
      // 18e: aload 14
      // 190: goto 197
      // 193: invokestatic c5z.a (Loov;)Loov;
      // 196: athrow
      // 197: astore 5
      // 199: dload 18
      // 19b: dstore 11
      // 19d: iinc 13 1
      // 1a0: iload 4
      // 1a2: ifne 07c
      // 1a5: aload 5
      // 1a7: checkcast g_3
      // 1aa: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
