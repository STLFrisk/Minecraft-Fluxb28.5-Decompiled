import java.util.Random;

public class fhq extends cdu {
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
      // 007: iload 4
      // 009: ifeq 024
      // 00c: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 00f: ifne 01f
      // 012: goto 019
      // 015: invokestatic fhq.a (Loov;)Loov;
      // 018: athrow
      // 019: bipush 0
      // 01a: ireturn
      // 01b: invokestatic fhq.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 1
      // 020: aload 3
      // 021: invokevirtual mew.nuv ()Lmew;
      // 024: iload 4
      // 026: ifeq 046
      // 029: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 02c: invokeinterface zfz.r_y ()Le0x; 1
      // 031: getstatic ox_.pzt Le0x;
      // 034: if_acmpeq 044
      // 037: goto 03e
      // 03a: invokestatic fhq.a (Loov;)Loov;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: ireturn
      // 040: invokestatic fhq.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 1
      // 045: aload 3
      // 046: getstatic ox_.t7q Le0x;
      // 049: invokevirtual e0x.l4i ()Lzfz;
      // 04c: bipush 2
      // 04d: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 050: pop
      // 051: bipush 0
      // 052: istore 5
      // 054: iload 5
      // 056: sipush 1500
      // 059: if_icmpge 12a
      // 05c: aload 3
      // 05d: aload 2
      // 05e: bipush 8
      // 060: invokevirtual java/util/Random.nextInt (I)I
      // 063: aload 2
      // 064: bipush 8
      // 066: invokevirtual java/util/Random.nextInt (I)I
      // 069: isub
      // 06a: aload 2
      // 06b: bipush 12
      // 06d: invokevirtual java/util/Random.nextInt (I)I
      // 070: ineg
      // 071: aload 2
      // 072: bipush 8
      // 074: invokevirtual java/util/Random.nextInt (I)I
      // 077: aload 2
      // 078: bipush 8
      // 07a: invokevirtual java/util/Random.nextInt (I)I
      // 07d: isub
      // 07e: invokevirtual mew.ec4 (III)Lmew;
      // 081: astore 6
      // 083: iload 4
      // 085: ifeq 125
      // 088: aload 1
      // 089: aload 6
      // 08b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 08e: invokeinterface zfz.r_y ()Le0x; 1
      // 093: goto 09a
      // 096: invokestatic fhq.a (Loov;)Loov;
      // 099: athrow
      // 09a: invokevirtual e0x.p1r ()Lp3y;
      // 09d: getstatic p3y.cei Lp3y;
      // 0a0: if_acmpne 122
      // 0a3: bipush 0
      // 0a4: istore 7
      // 0a6: invokestatic vt2.values ()[Lvt2;
      // 0a9: astore 8
      // 0ab: aload 8
      // 0ad: arraylength
      // 0ae: istore 9
      // 0b0: bipush 0
      // 0b1: istore 10
      // 0b3: iload 10
      // 0b5: iload 9
      // 0b7: if_icmpge 0fb
      // 0ba: aload 8
      // 0bc: iload 10
      // 0be: aaload
      // 0bf: astore 11
      // 0c1: aload 1
      // 0c2: aload 6
      // 0c4: aload 11
      // 0c6: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0c9: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0cc: invokeinterface zfz.r_y ()Le0x; 1
      // 0d1: iload 4
      // 0d3: ifeq 09a
      // 0d6: getstatic ox_.t7q Le0x;
      // 0d9: if_acmpne 0e6
      // 0dc: iinc 7 1
      // 0df: goto 0e6
      // 0e2: invokestatic fhq.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: iload 7
      // 0e8: bipush 1
      // 0e9: if_icmple 0f3
      // 0ec: goto 0fb
      // 0ef: invokestatic fhq.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: iinc 10 1
      // 0f6: iload 4
      // 0f8: ifne 0b3
      // 0fb: iload 7
      // 0fd: iload 4
      // 0ff: ifeq 121
      // 102: bipush 1
      // 103: if_icmpne 122
      // 106: goto 10d
      // 109: invokestatic fhq.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 1
      // 10e: aload 6
      // 110: getstatic ox_.t7q Le0x;
      // 113: invokevirtual e0x.l4i ()Lzfz;
      // 116: bipush 2
      // 117: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 11a: goto 121
      // 11d: invokestatic fhq.a (Loov;)Loov;
      // 120: athrow
      // 121: pop
      // 122: iinc 5 1
      // 125: iload 4
      // 127: ifne 054
      // 12a: bipush 1
      // 12b: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
