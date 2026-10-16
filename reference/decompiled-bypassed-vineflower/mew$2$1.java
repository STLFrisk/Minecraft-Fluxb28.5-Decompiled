import com.google.common.collect.AbstractIterator;

public class mew$2$1 extends AbstractIterator {
   private mew$mix o1i;
   public final mew$2 f91;

   public mew$2$1(mew$2 var1) {
      this.f91 = var1;
      this.o1i = null;
   }

   public mew$mix computeNext() {
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
      // 005: getfield mew$2$1.o1i Lmew$mix;
      // 008: iload 1
      // 009: ifne 04c
      // 00c: ifnonnull 048
      // 00f: goto 016
      // 012: invokestatic mew$2$1.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: new mew$mix
      // 01a: dup
      // 01b: aload 0
      // 01c: getfield mew$2$1.f91 Lmew$2;
      // 01f: getfield mew$2.apc Lmew;
      // 022: invokevirtual mew.getX ()I
      // 025: aload 0
      // 026: getfield mew$2$1.f91 Lmew$2;
      // 029: getfield mew$2.apc Lmew;
      // 02c: invokevirtual mew.getY ()I
      // 02f: aload 0
      // 030: getfield mew$2$1.f91 Lmew$2;
      // 033: getfield mew$2.apc Lmew;
      // 036: invokevirtual mew.getZ ()I
      // 039: invokespecial mew$mix.<init> (III)V
      // 03c: putfield mew$2$1.o1i Lmew$mix;
      // 03f: aload 0
      // 040: getfield mew$2$1.o1i Lmew$mix;
      // 043: areturn
      // 044: invokestatic mew$2$1.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: getfield mew$2$1.o1i Lmew$mix;
      // 04c: aload 0
      // 04d: getfield mew$2$1.f91 Lmew$2;
      // 050: getfield mew$2.k_7 Lmew;
      // 053: invokevirtual mew$mix.equals (Ljava/lang/Object;)Z
      // 056: iload 1
      // 057: ifne 077
      // 05a: ifeq 070
      // 05d: goto 064
      // 060: invokestatic mew$2$1.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 0
      // 065: invokevirtual mew$2$1.endOfData ()Ljava/lang/Object;
      // 068: checkcast mew$mix
      // 06b: areturn
      // 06c: invokestatic mew$2$1.a (Loov;)Loov;
      // 06f: athrow
      // 070: aload 0
      // 071: getfield mew$2$1.o1i Lmew$mix;
      // 074: invokevirtual mew$mix.getX ()I
      // 077: istore 2
      // 078: aload 0
      // 079: getfield mew$2$1.o1i Lmew$mix;
      // 07c: invokevirtual mew$mix.getY ()I
      // 07f: istore 3
      // 080: aload 0
      // 081: getfield mew$2$1.o1i Lmew$mix;
      // 084: invokevirtual mew$mix.getZ ()I
      // 087: istore 4
      // 089: iload 2
      // 08a: aload 0
      // 08b: getfield mew$2$1.f91 Lmew$2;
      // 08e: getfield mew$2.k_7 Lmew;
      // 091: invokevirtual mew.getX ()I
      // 094: iload 1
      // 095: ifne 0c2
      // 098: if_icmpge 0b0
      // 09b: goto 0a2
      // 09e: invokestatic mew$2$1.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: iinc 2 1
      // 0a5: iload 1
      // 0a6: ifeq 11c
      // 0a9: goto 0b0
      // 0ac: invokestatic mew$2$1.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: iload 3
      // 0b1: aload 0
      // 0b2: getfield mew$2$1.f91 Lmew$2;
      // 0b5: getfield mew$2.k_7 Lmew;
      // 0b8: invokevirtual mew.getY ()I
      // 0bb: goto 0c2
      // 0be: invokestatic mew$2$1.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: iload 1
      // 0c3: ifne 100
      // 0c6: if_icmpge 0e2
      // 0c9: goto 0d0
      // 0cc: invokestatic mew$2$1.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield mew$2$1.f91 Lmew$2;
      // 0d4: getfield mew$2.apc Lmew;
      // 0d7: invokevirtual mew.getX ()I
      // 0da: istore 2
      // 0db: iinc 3 1
      // 0de: iload 1
      // 0df: ifeq 11c
      // 0e2: iload 4
      // 0e4: iload 1
      // 0e5: ifne 137
      // 0e8: goto 0ef
      // 0eb: invokestatic mew$2$1.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield mew$2$1.f91 Lmew$2;
      // 0f3: getfield mew$2.k_7 Lmew;
      // 0f6: invokevirtual mew.getZ ()I
      // 0f9: goto 100
      // 0fc: invokestatic mew$2$1.a (Loov;)Loov;
      // 0ff: athrow
      // 100: if_icmpge 11c
      // 103: aload 0
      // 104: getfield mew$2$1.f91 Lmew$2;
      // 107: getfield mew$2.apc Lmew;
      // 10a: invokevirtual mew.getX ()I
      // 10d: istore 2
      // 10e: aload 0
      // 10f: getfield mew$2$1.f91 Lmew$2;
      // 112: getfield mew$2.apc Lmew;
      // 115: invokevirtual mew.getY ()I
      // 118: istore 3
      // 119: iinc 4 1
      // 11c: aload 0
      // 11d: getfield mew$2$1.o1i Lmew$mix;
      // 120: iload 2
      // 121: invokestatic mew$mix.zvf (Lmew$mix;I)I
      // 124: pop
      // 125: aload 0
      // 126: getfield mew$2$1.o1i Lmew$mix;
      // 129: iload 3
      // 12a: invokestatic mew$mix.jir (Lmew$mix;I)I
      // 12d: pop
      // 12e: aload 0
      // 12f: getfield mew$2$1.o1i Lmew$mix;
      // 132: iload 4
      // 134: invokestatic mew$mix.irw (Lmew$mix;I)I
      // 137: pop
      // 138: aload 0
      // 139: getfield mew$2$1.o1i Lmew$mix;
      // 13c: areturn
   }

   public Object computeNext() {
      return this.computeNext();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
