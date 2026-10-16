public final class jpt$1 extends kea {
   @Override
   public erg lno(sdf param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokeinterface sdf.taq ()Lmew; 1
      // 006: aload 1
      // 007: invokeinterface sdf.lcq ()I 1
      // 00c: invokestatic okn.dwc (I)Lvt2;
      // 00f: invokevirtual mew.offset (Lvt2;)Lmew;
      // 012: astore 4
      // 014: invokestatic OpaquePredicate.c ()I
      // 017: aload 4
      // 019: invokevirtual mew.getX ()I
      // 01c: istore 5
      // 01e: istore 3
      // 01f: aload 4
      // 021: invokevirtual mew.getY ()I
      // 024: istore 6
      // 026: aload 4
      // 028: invokevirtual mew.getZ ()I
      // 02b: istore 7
      // 02d: new nh4
      // 030: dup
      // 031: iload 5
      // 033: i2d
      // 034: iload 6
      // 036: i2d
      // 037: iload 7
      // 039: i2d
      // 03a: iload 5
      // 03c: bipush 1
      // 03d: iadd
      // 03e: i2d
      // 03f: iload 6
      // 041: bipush 1
      // 042: iadd
      // 043: i2d
      // 044: iload 7
      // 046: bipush 1
      // 047: iadd
      // 048: i2d
      // 049: invokespecial nh4.<init> (DDDDDD)V
      // 04c: astore 8
      // 04e: aload 1
      // 04f: invokeinterface sdf.acz ()Lt9d; 1
      // 054: ldc Entity
      // 056: nop
      // 057: aload 8
      // 059: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 05c: new k0_$gup
      // 05f: dup
      // 060: aload 2
      // 061: invokespecial k0_$gup.<init> (Lerg;)V
      // 064: invokestatic com/google/common/base/Predicates.and (Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 067: invokevirtual OpaquePredicate.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 06a: astore 9
      // 06c: aload 9
      // 06e: iload 3
      // 06f: ifne 090
      // 072: invokeinterface java/util/List.size ()I 1
      // 077: ifle 0fe
      // 07a: goto 081
      // 07d: invokestatic jpt$1.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 9
      // 083: bipush 0
      // 084: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 089: goto 090
      // 08c: invokestatic jpt$1.a (Loov;)Loov;
      // 08f: athrow
      // 090: checkcast Entity
      // 093: astore 10
      // 095: aload 10
      // 097: instanceof ha9
      // 09a: iload 3
      // 09b: ifne 0a9
      // 09e: ifeq 0ac
      // 0a1: goto 0a8
      // 0a4: invokestatic jpt$1.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: bipush 1
      // 0a9: goto 0ad
      // 0ac: bipush 0
      // 0ad: istore 11
      // 0af: aload 2
      // 0b0: invokestatic yqv.vu5 (Lerg;)I
      // 0b3: istore 12
      // 0b5: aload 2
      // 0b6: invokevirtual erg.yaq ()Lerg;
      // 0b9: astore 13
      // 0bb: aload 13
      // 0bd: bipush 1
      // 0be: putfield erg.qd2 I
      // 0c1: aload 10
      // 0c3: iload 12
      // 0c5: iload 11
      // 0c7: isub
      // 0c8: aload 13
      // 0ca: invokevirtual Entity.fga (ILerg;)V
      // 0cd: iload 3
      // 0ce: ifne 0fc
      // 0d1: aload 10
      // 0d3: instanceof yqv
      // 0d6: ifeq 0f2
      // 0d9: goto 0e0
      // 0dc: invokestatic jpt$1.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 10
      // 0e2: checkcast yqv
      // 0e5: iload 12
      // 0e7: fconst_2
      // 0e8: invokevirtual yqv.kwm (IF)V
      // 0eb: goto 0f2
      // 0ee: invokestatic jpt$1.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 2
      // 0f3: dup
      // 0f4: getfield erg.qd2 I
      // 0f7: bipush 1
      // 0f8: isub
      // 0f9: putfield erg.qd2 I
      // 0fc: aload 2
      // 0fd: areturn
      // 0fe: aload 0
      // 0ff: aload 1
      // 100: aload 2
      // 101: invokespecial kea.lno (Lsdf;Lerg;)Lerg;
      // 104: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
