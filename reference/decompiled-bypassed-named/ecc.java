import java.util.Random;

public class ecc extends cdu {
   public ecc(e0x var1, int var2) {
      this.kl8 = var1;
      this.fn7 = var2;
   }

   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 00a: invokeinterface zfz.r_y ()Le0x; 1
      // 00f: invokevirtual e0x.p1r ()Lp3y;
      // 012: getstatic p3y.six Lp3y;
      // 015: if_acmpeq 01e
      // 018: bipush 0
      // 019: ireturn
      // 01a: invokestatic ecc.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 2
      // 01f: aload 0
      // 020: getfield ecc.fn7 I
      // 023: bipush 2
      // 024: isub
      // 025: invokevirtual java/util/Random.nextInt (I)I
      // 028: bipush 2
      // 029: iadd
      // 02a: istore 5
      // 02c: bipush 2
      // 02d: istore 6
      // 02f: aload 3
      // 030: invokevirtual mew.getX ()I
      // 033: iload 5
      // 035: isub
      // 036: istore 7
      // 038: iload 7
      // 03a: aload 3
      // 03b: invokevirtual mew.getX ()I
      // 03e: iload 5
      // 040: iadd
      // 041: if_icmpgt 122
      // 044: aload 3
      // 045: invokevirtual mew.getZ ()I
      // 048: iload 5
      // 04a: isub
      // 04b: iload 4
      // 04d: ifeq 123
      // 050: istore 8
      // 052: iload 8
      // 054: aload 3
      // 055: invokevirtual mew.getZ ()I
      // 058: iload 5
      // 05a: iadd
      // 05b: if_icmpgt 11a
      // 05e: iload 7
      // 060: aload 3
      // 061: invokevirtual mew.getX ()I
      // 064: isub
      // 065: istore 9
      // 067: iload 8
      // 069: aload 3
      // 06a: invokevirtual mew.getZ ()I
      // 06d: isub
      // 06e: istore 10
      // 070: iload 4
      // 072: ifeq 115
      // 075: iload 9
      // 077: iload 9
      // 079: imul
      // 07a: iload 10
      // 07c: iload 10
      // 07e: imul
      // 07f: iadd
      // 080: iload 5
      // 082: iload 5
      // 084: imul
      // 085: iload 4
      // 087: ifeq 041
      // 08a: goto 091
      // 08d: invokestatic ecc.a (Loov;)Loov;
      // 090: athrow
      // 091: if_icmpgt 112
      // 094: aload 3
      // 095: invokevirtual mew.getY ()I
      // 098: iload 6
      // 09a: isub
      // 09b: istore 11
      // 09d: iload 11
      // 09f: aload 3
      // 0a0: invokevirtual mew.getY ()I
      // 0a3: iload 6
      // 0a5: iadd
      // 0a6: if_icmpgt 112
      // 0a9: new mew
      // 0ac: dup
      // 0ad: iload 7
      // 0af: iload 11
      // 0b1: iload 8
      // 0b3: invokespecial mew.<init> (III)V
      // 0b6: astore 12
      // 0b8: aload 1
      // 0b9: aload 12
      // 0bb: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0be: invokeinterface zfz.r_y ()Le0x; 1
      // 0c3: astore 13
      // 0c5: iload 4
      // 0c7: ifeq 115
      // 0ca: aload 13
      // 0cc: iload 4
      // 0ce: ifeq 0ee
      // 0d1: goto 0d8
      // 0d4: invokestatic ecc.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: getstatic ox_.kqk Le0x;
      // 0db: if_acmpeq 0f4
      // 0de: goto 0e5
      // 0e1: invokestatic ecc.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 13
      // 0e7: goto 0ee
      // 0ea: invokestatic ecc.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: getstatic ox_.l11 Lx82;
      // 0f1: if_acmpne 10a
      // 0f4: aload 1
      // 0f5: aload 12
      // 0f7: aload 0
      // 0f8: getfield ecc.kl8 Le0x;
      // 0fb: invokevirtual e0x.l4i ()Lzfz;
      // 0fe: bipush 2
      // 0ff: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 102: pop
      // 103: goto 10a
      // 106: invokestatic ecc.a (Loov;)Loov;
      // 109: athrow
      // 10a: iinc 11 1
      // 10d: iload 4
      // 10f: ifne 09d
      // 112: iinc 8 1
      // 115: iload 4
      // 117: ifne 052
      // 11a: iinc 7 1
      // 11d: iload 4
      // 11f: ifne 038
      // 122: bipush 1
      // 123: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
