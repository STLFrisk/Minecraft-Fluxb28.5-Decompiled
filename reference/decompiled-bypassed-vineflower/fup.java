import java.util.Random;

public class fup extends cdu {
   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: bipush 0
      // 006: istore 5
      // 008: iload 5
      // 00a: bipush 20
      // 00c: if_icmpge 149
      // 00f: aload 3
      // 010: aload 2
      // 011: bipush 4
      // 012: invokevirtual java/util/Random.nextInt (I)I
      // 015: aload 2
      // 016: bipush 4
      // 017: invokevirtual java/util/Random.nextInt (I)I
      // 01a: isub
      // 01b: bipush 0
      // 01c: aload 2
      // 01d: bipush 4
      // 01e: invokevirtual java/util/Random.nextInt (I)I
      // 021: aload 2
      // 022: bipush 4
      // 023: invokevirtual java/util/Random.nextInt (I)I
      // 026: isub
      // 027: invokevirtual mew.ec4 (III)Lmew;
      // 02a: astore 6
      // 02c: iload 4
      // 02e: ifeq 144
      // 031: aload 1
      // 032: aload 6
      // 034: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 037: iload 4
      // 039: ifeq 14a
      // 03c: goto 043
      // 03f: invokestatic fup.a (Loov;)Loov;
      // 042: athrow
      // 043: ifeq 141
      // 046: goto 04d
      // 049: invokestatic fup.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 6
      // 04f: invokevirtual mew.eve ()Lmew;
      // 052: astore 7
      // 054: aload 1
      // 055: aload 7
      // 057: invokevirtual mew.y8e ()Lmew;
      // 05a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 05d: invokeinterface zfz.r_y ()Le0x; 1
      // 062: invokevirtual e0x.p1r ()Lp3y;
      // 065: getstatic p3y.six Lp3y;
      // 068: iload 4
      // 06a: ifeq 092
      // 06d: if_acmpeq 0e9
      // 070: goto 077
      // 073: invokestatic fup.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 1
      // 078: aload 7
      // 07a: invokevirtual mew.o_8 ()Lmew;
      // 07d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 080: invokeinterface zfz.r_y ()Le0x; 1
      // 085: invokevirtual e0x.p1r ()Lp3y;
      // 088: getstatic p3y.six Lp3y;
      // 08b: goto 092
      // 08e: invokestatic fup.a (Loov;)Loov;
      // 091: athrow
      // 092: iload 4
      // 094: ifeq 0bc
      // 097: if_acmpeq 0e9
      // 09a: goto 0a1
      // 09d: invokestatic fup.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 1
      // 0a2: aload 7
      // 0a4: invokevirtual mew.idu ()Lmew;
      // 0a7: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0aa: invokeinterface zfz.r_y ()Le0x; 1
      // 0af: invokevirtual e0x.p1r ()Lp3y;
      // 0b2: getstatic p3y.six Lp3y;
      // 0b5: goto 0bc
      // 0b8: invokestatic fup.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: iload 4
      // 0be: ifeq 0e6
      // 0c1: if_acmpeq 0e9
      // 0c4: goto 0cb
      // 0c7: invokestatic fup.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: aload 7
      // 0ce: invokevirtual mew.z6x ()Lmew;
      // 0d1: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0d4: invokeinterface zfz.r_y ()Le0x; 1
      // 0d9: invokevirtual e0x.p1r ()Lp3y;
      // 0dc: getstatic p3y.six Lp3y;
      // 0df: goto 0e6
      // 0e2: invokestatic fup.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: if_acmpne 141
      // 0e9: bipush 2
      // 0ea: aload 2
      // 0eb: aload 2
      // 0ec: bipush 3
      // 0ed: invokevirtual java/util/Random.nextInt (I)I
      // 0f0: bipush 1
      // 0f1: iadd
      // 0f2: invokevirtual java/util/Random.nextInt (I)I
      // 0f5: iadd
      // 0f6: istore 8
      // 0f8: bipush 0
      // 0f9: istore 9
      // 0fb: iload 9
      // 0fd: iload 8
      // 0ff: if_icmpge 141
      // 102: getstatic ox_.x65 Lvme;
      // 105: aload 1
      // 106: aload 6
      // 108: invokevirtual vme.rbp (Lt9d;Lmew;)Z
      // 10b: iload 4
      // 10d: ifeq 00a
      // 110: iload 4
      // 112: ifeq 138
      // 115: ifeq 139
      // 118: goto 11f
      // 11b: invokestatic fup.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 1
      // 120: aload 6
      // 122: iload 9
      // 124: invokevirtual mew.z89 (I)Lmew;
      // 127: getstatic ox_.x65 Lvme;
      // 12a: invokevirtual vme.l4i ()Lzfz;
      // 12d: bipush 2
      // 12e: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 131: goto 138
      // 134: invokestatic fup.a (Loov;)Loov;
      // 137: athrow
      // 138: pop
      // 139: iinc 9 1
      // 13c: iload 4
      // 13e: ifne 0fb
      // 141: iinc 5 1
      // 144: iload 4
      // 146: ifne 008
      // 149: bipush 1
      // 14a: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
