import java.util.List;

public class ufx implements ui9 {
   public ufx(erg var1, List var2) {
      this.dd7 = var1;
      this.ej5 = var2;
   }

   @Override
   public erg oot() {
      return this.dd7;
   }

   @Override
   public erg[] qq2(z0_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual z0_.opt ()I
      // 04: anewarray 32
      // 07: astore 3
      // 08: invokestatic t9d.c ()I
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: istore 2
      // 0f: iload 4
      // 11: aload 3
      // 12: arraylength
      // 13: if_icmpge 61
      // 16: aload 1
      // 17: iload 4
      // 19: invokevirtual z0_.ibn (I)Lerg;
      // 1c: astore 5
      // 1e: iload 2
      // 1f: ifne 5d
      // 22: aload 5
      // 24: ifnull 5a
      // 27: goto 2e
      // 2a: invokestatic ufx.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 5
      // 30: invokevirtual erg.gn1 ()Lu7m;
      // 33: invokevirtual u7m.jof ()Z
      // 36: ifeq 5a
      // 39: goto 40
      // 3c: invokestatic ufx.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 3
      // 41: iload 4
      // 43: new erg
      // 46: dup
      // 47: aload 5
      // 49: invokevirtual erg.gn1 ()Lu7m;
      // 4c: invokevirtual u7m.cqe ()Lu7m;
      // 4f: invokespecial erg.<init> (Lu7m;)V
      // 52: aastore
      // 53: goto 5a
      // 56: invokestatic ufx.a (Loov;)Loov;
      // 59: athrow
      // 5a: iinc 4 1
      // 5d: iload 2
      // 5e: ifeq 0f
      // 61: aload 3
      // 62: areturn
   }

   @Override
   public boolean mve(z0_ param1, t9d param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield ufx.ej5 Ljava/util/List;
      // 004: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 007: astore 4
      // 009: invokestatic t9d.c ()I
      // 00c: bipush 0
      // 00d: istore 5
      // 00f: istore 3
      // 010: iload 5
      // 012: aload 1
      // 013: invokevirtual z0_.fv2 ()I
      // 016: if_icmpge 104
      // 019: bipush 0
      // 01a: iload 3
      // 01b: ifne 10b
      // 01e: istore 6
      // 020: iload 6
      // 022: aload 1
      // 023: invokevirtual z0_.gx0 ()I
      // 026: if_icmpge 0fd
      // 029: aload 1
      // 02a: iload 6
      // 02c: iload 5
      // 02e: invokevirtual z0_.grp (II)Lerg;
      // 031: astore 7
      // 033: iload 3
      // 034: ifne 100
      // 037: iload 3
      // 038: ifne 0f9
      // 03b: goto 042
      // 03e: invokestatic ufx.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 7
      // 044: goto 04b
      // 047: invokestatic ufx.a (Loov;)Loov;
      // 04a: athrow
      // 04b: ifnull 0f6
      // 04e: bipush 0
      // 04f: istore 8
      // 051: aload 4
      // 053: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 058: astore 9
      // 05a: aload 9
      // 05c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 061: ifeq 0e4
      // 064: aload 9
      // 066: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06b: checkcast erg
      // 06e: astore 10
      // 070: aload 7
      // 072: iload 3
      // 073: ifne 04b
      // 076: iload 3
      // 077: ifne 095
      // 07a: invokevirtual erg.gn1 ()Lu7m;
      // 07d: aload 10
      // 07f: invokevirtual erg.gn1 ()Lu7m;
      // 082: if_acmpne 0d9
      // 085: goto 08c
      // 088: invokestatic ufx.a (Loov;)Loov;
      // 08b: athrow
      // 08c: aload 10
      // 08e: goto 095
      // 091: invokestatic ufx.a (Loov;)Loov;
      // 094: athrow
      // 095: invokevirtual erg.j6_ ()I
      // 098: iload 3
      // 099: ifne 0d4
      // 09c: sipush 32767
      // 09f: if_icmpeq 0c8
      // 0a2: goto 0a9
      // 0a5: invokestatic ufx.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 7
      // 0ab: invokevirtual erg.j6_ ()I
      // 0ae: iload 3
      // 0af: ifne 0d4
      // 0b2: goto 0b9
      // 0b5: invokestatic ufx.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 10
      // 0bb: invokevirtual erg.j6_ ()I
      // 0be: if_icmpne 0d9
      // 0c1: goto 0c8
      // 0c4: invokestatic ufx.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: bipush 1
      // 0c9: istore 8
      // 0cb: aload 4
      // 0cd: aload 10
      // 0cf: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 0d4: pop
      // 0d5: iload 3
      // 0d6: ifeq 0e4
      // 0d9: iload 3
      // 0da: ifeq 05a
      // 0dd: goto 0e4
      // 0e0: invokestatic ufx.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: iload 8
      // 0e6: iload 3
      // 0e7: ifne 0f5
      // 0ea: ifne 0f6
      // 0ed: goto 0f4
      // 0f0: invokestatic ufx.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: bipush 0
      // 0f5: ireturn
      // 0f6: iinc 6 1
      // 0f9: iload 3
      // 0fa: ifeq 020
      // 0fd: iinc 5 1
      // 100: iload 3
      // 101: ifeq 010
      // 104: aload 4
      // 106: invokeinterface java/util/List.isEmpty ()Z 1
      // 10b: ireturn
   }

   @Override
   public erg hd0(z0_ var1) {
      return this.dd7.yaq();
   }

   @Override
   public int hmy() {
      return this.ej5.size();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
