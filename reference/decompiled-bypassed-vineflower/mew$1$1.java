import com.google.common.collect.AbstractIterator;

public class mew$1$1 extends AbstractIterator {
   private mew dte;
   public final mew$1 p1g;

   public mew$1$1(mew$1 var1) {
      this.p1g = var1;
      this.dte = null;
   }

   public mew computeNext() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield mew$1$1.dte Lmew;
      // 008: iload 1
      // 009: ifne 02e
      // 00c: ifnonnull 02a
      // 00f: goto 016
      // 012: invokestatic mew$1$1.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: aload 0
      // 018: getfield mew$1$1.p1g Lmew$1;
      // 01b: getfield mew$1.ogp Lmew;
      // 01e: putfield mew$1$1.dte Lmew;
      // 021: aload 0
      // 022: getfield mew$1$1.dte Lmew;
      // 025: areturn
      // 026: invokestatic mew$1$1.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield mew$1$1.dte Lmew;
      // 02e: aload 0
      // 02f: getfield mew$1$1.p1g Lmew$1;
      // 032: getfield mew$1.w1z Lmew;
      // 035: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 038: iload 1
      // 039: ifne 059
      // 03c: ifeq 052
      // 03f: goto 046
      // 042: invokestatic mew$1$1.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: invokevirtual mew$1$1.endOfData ()Ljava/lang/Object;
      // 04a: checkcast mew
      // 04d: areturn
      // 04e: invokestatic mew$1$1.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: getfield mew$1$1.dte Lmew;
      // 056: invokevirtual mew.getX ()I
      // 059: istore 2
      // 05a: aload 0
      // 05b: getfield mew$1$1.dte Lmew;
      // 05e: invokevirtual mew.getY ()I
      // 061: istore 3
      // 062: aload 0
      // 063: getfield mew$1$1.dte Lmew;
      // 066: invokevirtual mew.getZ ()I
      // 069: istore 4
      // 06b: iload 2
      // 06c: aload 0
      // 06d: getfield mew$1$1.p1g Lmew$1;
      // 070: getfield mew$1.w1z Lmew;
      // 073: invokevirtual mew.getX ()I
      // 076: iload 1
      // 077: ifne 0a4
      // 07a: if_icmpge 092
      // 07d: goto 084
      // 080: invokestatic mew$1$1.a (Loov;)Loov;
      // 083: athrow
      // 084: iinc 2 1
      // 087: iload 1
      // 088: ifeq 0fe
      // 08b: goto 092
      // 08e: invokestatic mew$1$1.a (Loov;)Loov;
      // 091: athrow
      // 092: iload 3
      // 093: aload 0
      // 094: getfield mew$1$1.p1g Lmew$1;
      // 097: getfield mew$1.w1z Lmew;
      // 09a: invokevirtual mew.getY ()I
      // 09d: goto 0a4
      // 0a0: invokestatic mew$1$1.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: iload 1
      // 0a5: ifne 0e2
      // 0a8: if_icmpge 0c4
      // 0ab: goto 0b2
      // 0ae: invokestatic mew$1$1.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield mew$1$1.p1g Lmew$1;
      // 0b6: getfield mew$1.ogp Lmew;
      // 0b9: invokevirtual mew.getX ()I
      // 0bc: istore 2
      // 0bd: iinc 3 1
      // 0c0: iload 1
      // 0c1: ifeq 0fe
      // 0c4: iload 4
      // 0c6: iload 1
      // 0c7: ifne 0fa
      // 0ca: goto 0d1
      // 0cd: invokestatic mew$1$1.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield mew$1$1.p1g Lmew$1;
      // 0d5: getfield mew$1.w1z Lmew;
      // 0d8: invokevirtual mew.getZ ()I
      // 0db: goto 0e2
      // 0de: invokestatic mew$1$1.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: if_icmpge 0fe
      // 0e5: aload 0
      // 0e6: getfield mew$1$1.p1g Lmew$1;
      // 0e9: getfield mew$1.ogp Lmew;
      // 0ec: invokevirtual mew.getX ()I
      // 0ef: istore 2
      // 0f0: aload 0
      // 0f1: getfield mew$1$1.p1g Lmew$1;
      // 0f4: getfield mew$1.ogp Lmew;
      // 0f7: invokevirtual mew.getY ()I
      // 0fa: istore 3
      // 0fb: iinc 4 1
      // 0fe: aload 0
      // 0ff: new mew
      // 102: dup
      // 103: iload 2
      // 104: iload 3
      // 105: iload 4
      // 107: invokespecial mew.<init> (III)V
      // 10a: putfield mew$1$1.dte Lmew;
      // 10d: aload 0
      // 10e: getfield mew$1$1.dte Lmew;
      // 111: areturn
   }

   public Object computeNext() {
      return this.computeNext();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
