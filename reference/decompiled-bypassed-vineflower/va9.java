import java.util.Random;

public class va9 extends cdu {
   public va9(e0x var1, boolean var2) {
      this.jv3 = var1;
      this.hma = var2;
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual mew.nuv ()Lmew;
      // 00a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 00d: invokeinterface zfz.r_y ()Le0x; 1
      // 012: iload 4
      // 014: ifeq 034
      // 017: getstatic ox_.pzt Le0x;
      // 01a: if_acmpeq 02a
      // 01d: goto 024
      // 020: invokestatic va9.a (Loov;)Loov;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic va9.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 1
      // 02b: aload 3
      // 02c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 02f: invokeinterface zfz.r_y ()Le0x; 1
      // 034: iload 4
      // 036: ifeq 05a
      // 039: invokevirtual e0x.p1r ()Lp3y;
      // 03c: getstatic p3y.cei Lp3y;
      // 03f: if_acmpeq 066
      // 042: goto 049
      // 045: invokestatic va9.a (Loov;)Loov;
      // 048: athrow
      // 049: aload 1
      // 04a: aload 3
      // 04b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 04e: invokeinterface zfz.r_y ()Le0x; 1
      // 053: goto 05a
      // 056: invokestatic va9.a (Loov;)Loov;
      // 059: athrow
      // 05a: getstatic ox_.pzt Le0x;
      // 05d: if_acmpeq 066
      // 060: bipush 0
      // 061: ireturn
      // 062: invokestatic va9.a (Loov;)Loov;
      // 065: athrow
      // 066: bipush 0
      // 067: istore 5
      // 069: aload 1
      // 06a: aload 3
      // 06b: invokevirtual mew.y8e ()Lmew;
      // 06e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 071: invokeinterface zfz.r_y ()Le0x; 1
      // 076: getstatic ox_.pzt Le0x;
      // 079: iload 4
      // 07b: ifeq 09b
      // 07e: if_acmpne 08b
      // 081: goto 088
      // 084: invokestatic va9.a (Loov;)Loov;
      // 087: athrow
      // 088: iinc 5 1
      // 08b: aload 1
      // 08c: aload 3
      // 08d: invokevirtual mew.o_8 ()Lmew;
      // 090: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 093: invokeinterface zfz.r_y ()Le0x; 1
      // 098: getstatic ox_.pzt Le0x;
      // 09b: iload 4
      // 09d: ifeq 0bd
      // 0a0: if_acmpne 0ad
      // 0a3: goto 0aa
      // 0a6: invokestatic va9.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: iinc 5 1
      // 0ad: aload 1
      // 0ae: aload 3
      // 0af: invokevirtual mew.idu ()Lmew;
      // 0b2: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b5: invokeinterface zfz.r_y ()Le0x; 1
      // 0ba: getstatic ox_.pzt Le0x;
      // 0bd: iload 4
      // 0bf: ifeq 0df
      // 0c2: if_acmpne 0cf
      // 0c5: goto 0cc
      // 0c8: invokestatic va9.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: iinc 5 1
      // 0cf: aload 1
      // 0d0: aload 3
      // 0d1: invokevirtual mew.z6x ()Lmew;
      // 0d4: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0d7: invokeinterface zfz.r_y ()Le0x; 1
      // 0dc: getstatic ox_.pzt Le0x;
      // 0df: iload 4
      // 0e1: ifeq 101
      // 0e4: if_acmpne 0f1
      // 0e7: goto 0ee
      // 0ea: invokestatic va9.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: iinc 5 1
      // 0f1: aload 1
      // 0f2: aload 3
      // 0f3: invokevirtual mew.eve ()Lmew;
      // 0f6: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0f9: invokeinterface zfz.r_y ()Le0x; 1
      // 0fe: getstatic ox_.pzt Le0x;
      // 101: if_acmpne 107
      // 104: iinc 5 1
      // 107: bipush 0
      // 108: istore 6
      // 10a: aload 1
      // 10b: aload 3
      // 10c: invokevirtual mew.y8e ()Lmew;
      // 10f: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 112: iload 4
      // 114: ifeq 12c
      // 117: ifeq 124
      // 11a: goto 121
      // 11d: invokestatic va9.a (Loov;)Loov;
      // 120: athrow
      // 121: iinc 6 1
      // 124: aload 1
      // 125: aload 3
      // 126: invokevirtual mew.o_8 ()Lmew;
      // 129: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 12c: iload 4
      // 12e: ifeq 146
      // 131: ifeq 13e
      // 134: goto 13b
      // 137: invokestatic va9.a (Loov;)Loov;
      // 13a: athrow
      // 13b: iinc 6 1
      // 13e: aload 1
      // 13f: aload 3
      // 140: invokevirtual mew.idu ()Lmew;
      // 143: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 146: iload 4
      // 148: ifeq 160
      // 14b: ifeq 158
      // 14e: goto 155
      // 151: invokestatic va9.a (Loov;)Loov;
      // 154: athrow
      // 155: iinc 6 1
      // 158: aload 1
      // 159: aload 3
      // 15a: invokevirtual mew.z6x ()Lmew;
      // 15d: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 160: iload 4
      // 162: ifeq 17a
      // 165: ifeq 172
      // 168: goto 16f
      // 16b: invokestatic va9.a (Loov;)Loov;
      // 16e: athrow
      // 16f: iinc 6 1
      // 172: aload 1
      // 173: aload 3
      // 174: invokevirtual mew.eve ()Lmew;
      // 177: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 17a: iload 4
      // 17c: ifeq 190
      // 17f: ifeq 18c
      // 182: goto 189
      // 185: invokestatic va9.a (Loov;)Loov;
      // 188: athrow
      // 189: iinc 6 1
      // 18c: aload 0
      // 18d: getfield va9.hma Z
      // 190: iload 4
      // 192: ifeq 1da
      // 195: ifne 1d1
      // 198: goto 19f
      // 19b: invokestatic va9.a (Loov;)Loov;
      // 19e: athrow
      // 19f: iload 5
      // 1a1: bipush 4
      // 1a2: iload 4
      // 1a4: ifeq 1e7
      // 1a7: goto 1ae
      // 1aa: invokestatic va9.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: if_icmpne 1d1
      // 1b1: goto 1b8
      // 1b4: invokestatic va9.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: iload 6
      // 1ba: iload 4
      // 1bc: ifeq 1fe
      // 1bf: goto 1c6
      // 1c2: invokestatic va9.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: bipush 1
      // 1c7: if_icmpeq 1ea
      // 1ca: goto 1d1
      // 1cd: invokestatic va9.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: iload 5
      // 1d3: goto 1da
      // 1d6: invokestatic va9.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: iload 4
      // 1dc: ifeq 20a
      // 1df: bipush 5
      // 1e0: goto 1e7
      // 1e3: invokestatic va9.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: if_icmpne 209
      // 1ea: aload 1
      // 1eb: aload 3
      // 1ec: aload 0
      // 1ed: getfield va9.jv3 Le0x;
      // 1f0: invokevirtual e0x.l4i ()Lzfz;
      // 1f3: bipush 2
      // 1f4: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1f7: goto 1fe
      // 1fa: invokestatic va9.a (Loov;)Loov;
      // 1fd: athrow
      // 1fe: pop
      // 1ff: aload 1
      // 200: aload 0
      // 201: getfield va9.jv3 Le0x;
      // 204: aload 3
      // 205: aload 2
      // 206: invokevirtual t9d.g0z (Le0x;Lmew;Ljava/util/Random;)V
      // 209: bipush 1
      // 20a: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
