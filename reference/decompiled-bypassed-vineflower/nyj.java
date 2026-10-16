public class nyj {
   public static c05 pb5 = c05.vz1();

   public static i2h vsf(double var0, nyj$xty var2) {
      return q9x(var0, ixh.ujo[0], ixh.ujo[1], var2);
   }

   private static i2h q9x(double param0, float param2, float param3, nyj$xty param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 5
      // 005: getstatic nyj.pb5 Lc05;
      // 008: invokevirtual c05.nsd ()Li2h;
      // 00b: astore 6
      // 00d: aload 6
      // 00f: ifnull 220
      // 012: getstatic nyj.pb5 Lc05;
      // 015: getfield c05.tij Lkh3;
      // 018: ifnull 220
      // 01b: goto 022
      // 01e: invokestatic nyj.a (Loov;)Loov;
      // 021: athrow
      // 022: dload 0
      // 023: dstore 7
      // 025: aload 6
      // 027: fconst_1
      // 028: invokevirtual i2h.tib (F)Lfqr;
      // 02b: astore 9
      // 02d: fload 2
      // 02e: fneg
      // 02f: ldc 0.017453292
      // 031: nop
      // 032: fmul
      // 033: ldc 3.1415927
      // 035: nop
      // 036: fsub
      // 037: invokestatic fe6.ssk (F)F
      // 03a: fstore 10
      // 03c: fload 2
      // 03d: fneg
      // 03e: ldc 0.017453292
      // 040: nop
      // 041: fmul
      // 042: ldc 3.1415927
      // 044: nop
      // 045: fsub
      // 046: invokestatic fe6.rtn (F)F
      // 049: fstore 11
      // 04b: fload 3
      // 04c: fneg
      // 04d: ldc 0.017453292
      // 04f: nop
      // 050: fmul
      // 051: invokestatic fe6.ssk (F)F
      // 054: fneg
      // 055: fstore 12
      // 057: fload 3
      // 058: fneg
      // 059: ldc 0.017453292
      // 05b: nop
      // 05c: fmul
      // 05d: invokestatic fe6.rtn (F)F
      // 060: fstore 13
      // 062: new who
      // 065: dup
      // 066: fload 11
      // 068: fload 12
      // 06a: fmul
      // 06b: f2d
      // 06c: fload 13
      // 06e: f2d
      // 06f: fload 10
      // 071: fload 12
      // 073: fmul
      // 074: f2d
      // 075: invokespecial who.<init> (DDD)V
      // 078: astore 14
      // 07a: aload 9
      // 07c: aload 14
      // 07e: invokevirtual who.ovf ()D
      // 081: dload 7
      // 083: dmul
      // 084: aload 14
      // 086: invokevirtual who.xnw ()D
      // 089: dload 7
      // 08b: dmul
      // 08c: aload 14
      // 08e: invokevirtual who.b9g ()D
      // 091: dload 7
      // 093: dmul
      // 094: invokevirtual fqr.r2x (DDD)Lfqr;
      // 097: astore 15
      // 099: getstatic nyj.pb5 Lc05;
      // 09c: getfield c05.tij Lkh3;
      // 09f: aload 6
      // 0a1: aload 6
      // 0a3: invokevirtual i2h.aaw ()Lnh4;
      // 0a6: aload 14
      // 0a8: invokevirtual who.ovf ()D
      // 0ab: dload 7
      // 0ad: dmul
      // 0ae: aload 14
      // 0b0: invokevirtual who.xnw ()D
      // 0b3: dload 7
      // 0b5: dmul
      // 0b6: aload 14
      // 0b8: invokevirtual who.b9g ()D
      // 0bb: dload 7
      // 0bd: dmul
      // 0be: invokevirtual nh4.z9h (DDD)Lnh4;
      // 0c1: dconst_1
      // 0c2: dconst_1
      // 0c3: dconst_1
      // 0c4: invokevirtual nh4.c2h (DDD)Lnh4;
      // 0c7: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 0ca: invokedynamic apply ()Lcom/google/common/base/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, i2h.mzu ()Z, (Li2h;)Z ]
      // 0cf: invokestatic com/google/common/base/Predicates.and (Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 0d2: invokevirtual kh3.sr2 (Li2h;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 0d5: astore 16
      // 0d7: aconst_null
      // 0d8: astore 17
      // 0da: aload 16
      // 0dc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e1: astore 18
      // 0e3: aload 18
      // 0e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ea: ifeq 21d
      // 0ed: aload 18
      // 0ef: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f4: checkcast i2h
      // 0f7: iload 5
      // 0f9: ifeq 21f
      // 0fc: goto 103
      // 0ff: invokestatic nyj.a (Loov;)Loov;
      // 102: athrow
      // 103: astore 19
      // 105: aload 4
      // 107: aload 19
      // 109: invokeinterface nyj$xty.k1s (Li2h;)Z 2
      // 10e: ifne 118
      // 111: goto 0e3
      // 114: invokestatic nyj.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 19
      // 11a: invokevirtual i2h.npl ()F
      // 11d: fstore 20
      // 11f: aload 19
      // 121: invokevirtual i2h.aaw ()Lnh4;
      // 124: fload 20
      // 126: f2d
      // 127: fload 20
      // 129: f2d
      // 12a: fload 20
      // 12c: f2d
      // 12d: invokevirtual nh4.c2h (DDD)Lnh4;
      // 130: astore 21
      // 132: aload 21
      // 134: aload 9
      // 136: aload 15
      // 138: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 13b: astore 22
      // 13d: aload 21
      // 13f: aload 9
      // 141: invokevirtual nh4.fd8 (Lfqr;)Z
      // 144: iload 5
      // 146: ifeq 16a
      // 149: ifeq 179
      // 14c: goto 153
      // 14f: invokestatic nyj.a (Loov;)Loov;
      // 152: athrow
      // 153: dload 7
      // 155: iload 5
      // 157: ifeq 172
      // 15a: goto 161
      // 15d: invokestatic nyj.a (Loov;)Loov;
      // 160: athrow
      // 161: dconst_0
      // 162: dcmpl
      // 163: goto 16a
      // 166: invokestatic nyj.a (Loov;)Loov;
      // 169: athrow
      // 16a: iflt 218
      // 16d: aload 19
      // 16f: astore 17
      // 171: dconst_0
      // 172: dstore 7
      // 174: iload 5
      // 176: ifne 218
      // 179: aload 22
      // 17b: ifnull 218
      // 17e: goto 185
      // 181: invokestatic nyj.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 9
      // 187: aload 22
      // 189: getfield akm.jhn Lfqr;
      // 18c: invokevirtual fqr.b4d (Lfqr;)D
      // 18f: dstore 23
      // 191: dload 23
      // 193: dload 7
      // 195: dcmpg
      // 196: iload 5
      // 198: ifeq 1b0
      // 19b: iflt 1b3
      // 19e: goto 1a5
      // 1a1: invokestatic nyj.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: dload 7
      // 1a7: dconst_0
      // 1a8: dcmpl
      // 1a9: goto 1b0
      // 1ac: invokestatic nyj.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: ifne 218
      // 1b3: aload 19
      // 1b5: iload 5
      // 1b7: ifeq 212
      // 1ba: goto 1c1
      // 1bd: invokestatic nyj.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: aload 6
      // 1c3: getfield i2h.hzp Li2h;
      // 1c6: if_acmpne 209
      // 1c9: goto 1d0
      // 1cc: invokestatic nyj.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 6
      // 1d2: iload 5
      // 1d4: ifeq 212
      // 1d7: goto 1de
      // 1da: invokestatic nyj.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: getstatic net/optifine/reflect/Reflector.ForgeEntity_canRiderInteract Lnet/optifine/reflect/ReflectorMethod;
      // 1e1: bipush 0
      // 1e2: anewarray 6
      // 1e5: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 1e8: ifne 209
      // 1eb: goto 1f2
      // 1ee: invokestatic nyj.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: dload 7
      // 1f4: dconst_0
      // 1f5: dcmpl
      // 1f6: ifne 218
      // 1f9: goto 200
      // 1fc: invokestatic nyj.a (Loov;)Loov;
      // 1ff: athrow
      // 200: aload 19
      // 202: astore 17
      // 204: iload 5
      // 206: ifne 218
      // 209: aload 19
      // 20b: goto 212
      // 20e: invokestatic nyj.a (Loov;)Loov;
      // 211: athrow
      // 212: astore 17
      // 214: dload 23
      // 216: dstore 7
      // 218: iload 5
      // 21a: ifne 0e3
      // 21d: aload 17
      // 21f: areturn
      // 220: aconst_null
      // 221: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
