import java.util.Random;

public class hu6 extends cdu {
   public hu6(e0x var1) {
      this.u90 = var1;
   }

   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual mew.nuv ()Lmew;
      // 00a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 00d: invokeinterface zfz.r_y ()Le0x; 1
      // 012: getstatic ox_.pu8 Le0x;
      // 015: iload 4
      // 017: ifne 046
      // 01a: if_acmpeq 02a
      // 01d: goto 024
      // 020: invokestatic hu6.a (Loov;)Loov;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic hu6.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 1
      // 02b: aload 3
      // 02c: invokevirtual mew.eve ()Lmew;
      // 02f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 032: invokeinterface zfz.r_y ()Le0x; 1
      // 037: iload 4
      // 039: ifne 059
      // 03c: getstatic ox_.pu8 Le0x;
      // 03f: goto 046
      // 042: invokestatic hu6.a (Loov;)Loov;
      // 045: athrow
      // 046: if_acmpeq 04f
      // 049: bipush 0
      // 04a: ireturn
      // 04b: invokestatic hu6.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 1
      // 050: aload 3
      // 051: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 054: invokeinterface zfz.r_y ()Le0x; 1
      // 059: iload 4
      // 05b: ifne 07f
      // 05e: invokevirtual e0x.p1r ()Lp3y;
      // 061: getstatic p3y.cei Lp3y;
      // 064: if_acmpeq 08b
      // 067: goto 06e
      // 06a: invokestatic hu6.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 1
      // 06f: aload 3
      // 070: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 073: invokeinterface zfz.r_y ()Le0x; 1
      // 078: goto 07f
      // 07b: invokestatic hu6.a (Loov;)Loov;
      // 07e: athrow
      // 07f: getstatic ox_.pu8 Le0x;
      // 082: if_acmpeq 08b
      // 085: bipush 0
      // 086: ireturn
      // 087: invokestatic hu6.a (Loov;)Loov;
      // 08a: athrow
      // 08b: bipush 0
      // 08c: istore 5
      // 08e: aload 1
      // 08f: aload 3
      // 090: invokevirtual mew.y8e ()Lmew;
      // 093: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 096: invokeinterface zfz.r_y ()Le0x; 1
      // 09b: getstatic ox_.pu8 Le0x;
      // 09e: iload 4
      // 0a0: ifne 0c0
      // 0a3: if_acmpne 0b0
      // 0a6: goto 0ad
      // 0a9: invokestatic hu6.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: iinc 5 1
      // 0b0: aload 1
      // 0b1: aload 3
      // 0b2: invokevirtual mew.o_8 ()Lmew;
      // 0b5: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b8: invokeinterface zfz.r_y ()Le0x; 1
      // 0bd: getstatic ox_.pu8 Le0x;
      // 0c0: iload 4
      // 0c2: ifne 0e2
      // 0c5: if_acmpne 0d2
      // 0c8: goto 0cf
      // 0cb: invokestatic hu6.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iinc 5 1
      // 0d2: aload 1
      // 0d3: aload 3
      // 0d4: invokevirtual mew.idu ()Lmew;
      // 0d7: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0da: invokeinterface zfz.r_y ()Le0x; 1
      // 0df: getstatic ox_.pu8 Le0x;
      // 0e2: iload 4
      // 0e4: ifne 104
      // 0e7: if_acmpne 0f4
      // 0ea: goto 0f1
      // 0ed: invokestatic hu6.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iinc 5 1
      // 0f4: aload 1
      // 0f5: aload 3
      // 0f6: invokevirtual mew.z6x ()Lmew;
      // 0f9: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0fc: invokeinterface zfz.r_y ()Le0x; 1
      // 101: getstatic ox_.pu8 Le0x;
      // 104: if_acmpne 10a
      // 107: iinc 5 1
      // 10a: bipush 0
      // 10b: istore 6
      // 10d: aload 1
      // 10e: aload 3
      // 10f: invokevirtual mew.y8e ()Lmew;
      // 112: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 115: iload 4
      // 117: ifne 12f
      // 11a: ifeq 127
      // 11d: goto 124
      // 120: invokestatic hu6.a (Loov;)Loov;
      // 123: athrow
      // 124: iinc 6 1
      // 127: aload 1
      // 128: aload 3
      // 129: invokevirtual mew.o_8 ()Lmew;
      // 12c: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 12f: iload 4
      // 131: ifne 149
      // 134: ifeq 141
      // 137: goto 13e
      // 13a: invokestatic hu6.a (Loov;)Loov;
      // 13d: athrow
      // 13e: iinc 6 1
      // 141: aload 1
      // 142: aload 3
      // 143: invokevirtual mew.idu ()Lmew;
      // 146: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 149: iload 4
      // 14b: ifne 163
      // 14e: ifeq 15b
      // 151: goto 158
      // 154: invokestatic hu6.a (Loov;)Loov;
      // 157: athrow
      // 158: iinc 6 1
      // 15b: aload 1
      // 15c: aload 3
      // 15d: invokevirtual mew.z6x ()Lmew;
      // 160: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 163: iload 4
      // 165: ifne 177
      // 168: ifeq 175
      // 16b: goto 172
      // 16e: invokestatic hu6.a (Loov;)Loov;
      // 171: athrow
      // 172: iinc 6 1
      // 175: iload 5
      // 177: iload 4
      // 179: ifne 1c0
      // 17c: bipush 3
      // 17d: if_icmpne 1bf
      // 180: goto 187
      // 183: invokestatic hu6.a (Loov;)Loov;
      // 186: athrow
      // 187: iload 6
      // 189: iload 4
      // 18b: ifne 1c0
      // 18e: goto 195
      // 191: invokestatic hu6.a (Loov;)Loov;
      // 194: athrow
      // 195: bipush 1
      // 196: if_icmpne 1bf
      // 199: goto 1a0
      // 19c: invokestatic hu6.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: aload 1
      // 1a1: aload 3
      // 1a2: aload 0
      // 1a3: getfield hu6.u90 Le0x;
      // 1a6: invokevirtual e0x.l4i ()Lzfz;
      // 1a9: bipush 2
      // 1aa: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1ad: pop
      // 1ae: aload 1
      // 1af: aload 0
      // 1b0: getfield hu6.u90 Le0x;
      // 1b3: aload 3
      // 1b4: aload 2
      // 1b5: invokevirtual t9d.g0z (Le0x;Lmew;Ljava/util/Random;)V
      // 1b8: goto 1bf
      // 1bb: invokestatic hu6.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: bipush 1
      // 1c0: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
