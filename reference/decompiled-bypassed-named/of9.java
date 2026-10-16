public class of9 extends u7m {
   private e0x eyx;

   public of9(e0x var1) {
      this.eyx = var1;
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: aload 4
      // 003: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 006: astore 10
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: aload 10
      // 00d: invokeinterface zfz.r_y ()Le0x; 1
      // 012: astore 11
      // 014: istore 9
      // 016: aload 11
      // 018: iload 9
      // 01a: ifne 064
      // 01d: getstatic ox_.dxo Le0x;
      // 020: if_acmpne 05b
      // 023: goto 02a
      // 026: invokestatic of9.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 10
      // 02c: getstatic e7p.sxl L_ku;
      // 02f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 034: checkcast java/lang/Integer
      // 037: invokevirtual java/lang/Integer.intValue ()I
      // 03a: iload 9
      // 03c: ifne 06a
      // 03f: goto 046
      // 042: invokestatic of9.a (Loov;)Loov;
      // 045: athrow
      // 046: bipush 1
      // 047: if_icmpge 05b
      // 04a: goto 051
      // 04d: invokestatic of9.a (Loov;)Loov;
      // 050: athrow
      // 051: getstatic vt2.rf3 Lvt2;
      // 054: astore 5
      // 056: iload 9
      // 058: ifeq 082
      // 05b: aload 11
      // 05d: goto 064
      // 060: invokestatic of9.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 3
      // 065: aload 4
      // 067: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 06a: iload 9
      // 06c: ifne 08b
      // 06f: ifne 082
      // 072: goto 079
      // 075: invokestatic of9.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 4
      // 07b: aload 5
      // 07d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 080: astore 4
      // 082: aload 2
      // 083: aload 4
      // 085: aload 5
      // 087: aload 1
      // 088: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 08b: iload 9
      // 08d: ifne 0a4
      // 090: ifne 0a0
      // 093: goto 09a
      // 096: invokestatic of9.a (Loov;)Loov;
      // 099: athrow
      // 09a: bipush 0
      // 09b: ireturn
      // 09c: invokestatic of9.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 1
      // 0a1: getfield erg.qd2 I
      // 0a4: iload 9
      // 0a6: ifne 0cb
      // 0a9: ifne 0b9
      // 0ac: goto 0b3
      // 0af: invokestatic of9.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: bipush 0
      // 0b4: ireturn
      // 0b5: invokestatic of9.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 3
      // 0ba: aload 0
      // 0bb: getfield of9.eyx Le0x;
      // 0be: aload 4
      // 0c0: bipush 0
      // 0c1: aload 5
      // 0c3: aconst_null
      // 0c4: checkcast EntityLivingBase
      // 0c7: aload 1
      // 0c8: invokevirtual OpaquePredicate.ask (Le0x;Lmew;ZLvt2;Li2h;Lerg;)Z
      // 0cb: iload 9
      // 0cd: ifne 1a3
      // 0d0: ifeq 1a2
      // 0d3: goto 0da
      // 0d6: invokestatic of9.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: getfield of9.eyx Le0x;
      // 0de: aload 3
      // 0df: aload 4
      // 0e1: aload 5
      // 0e3: fload 6
      // 0e5: fload 7
      // 0e7: fload 8
      // 0e9: bipush 0
      // 0ea: aload 2
      // 0eb: invokevirtual e0x.qk_ (Lt9d;Lmew;Lvt2;FFFILg_3;)Lzfz;
      // 0ee: astore 12
      // 0f0: aload 3
      // 0f1: aload 4
      // 0f3: aload 12
      // 0f5: bipush 3
      // 0f6: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0f9: iload 9
      // 0fb: ifne 1a3
      // 0fe: ifeq 1a2
      // 101: goto 108
      // 104: invokestatic of9.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 3
      // 109: aload 4
      // 10b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 10e: astore 12
      // 110: iload 9
      // 112: ifne 1a0
      // 115: aload 12
      // 117: invokeinterface zfz.r_y ()Le0x; 1
      // 11c: aload 0
      // 11d: getfield of9.eyx Le0x;
      // 120: if_acmpne 14b
      // 123: goto 12a
      // 126: invokestatic of9.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 3
      // 12b: aload 2
      // 12c: aload 4
      // 12e: aload 1
      // 12f: invokestatic gun.v79 (Lt9d;Lha9;Lmew;Lerg;)Z
      // 132: pop
      // 133: aload 12
      // 135: invokeinterface zfz.r_y ()Le0x; 1
      // 13a: aload 3
      // 13b: aload 4
      // 13d: aload 12
      // 13f: aload 2
      // 140: aload 1
      // 141: invokevirtual e0x.qh0 (Lt9d;Lmew;Lzfz;Lg_3;Lerg;)V
      // 144: goto 14b
      // 147: invokestatic of9.a (Loov;)Loov;
      // 14a: athrow
      // 14b: aload 3
      // 14c: aload 4
      // 14e: invokevirtual mew.getX ()I
      // 151: i2f
      // 152: ldc 0.5
      // 154: nop
      // 155: fadd
      // 156: f2d
      // 157: aload 4
      // 159: invokevirtual mew.getY ()I
      // 15c: i2f
      // 15d: ldc 0.5
      // 15f: nop
      // 160: fadd
      // 161: f2d
      // 162: aload 4
      // 164: invokevirtual mew.getZ ()I
      // 167: i2f
      // 168: ldc 0.5
      // 16a: nop
      // 16b: fadd
      // 16c: f2d
      // 16d: aload 0
      // 16e: getfield of9.eyx Le0x;
      // 171: getfield e0x.zu6 Le0x$zvv;
      // 174: invokevirtual e0x$zvv.jfo ()Ljava/lang/String;
      // 177: aload 0
      // 178: getfield of9.eyx Le0x;
      // 17b: getfield e0x.zu6 Le0x$zvv;
      // 17e: invokevirtual e0x$zvv.dnt ()F
      // 181: fconst_1
      // 182: fadd
      // 183: fconst_2
      // 184: fdiv
      // 185: aload 0
      // 186: getfield of9.eyx Le0x;
      // 189: getfield e0x.zu6 Le0x$zvv;
      // 18c: invokevirtual e0x$zvv.kjj ()F
      // 18f: ldc 0.8
      // 191: nop
      // 192: fmul
      // 193: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 196: aload 1
      // 197: dup
      // 198: getfield erg.qd2 I
      // 19b: bipush 1
      // 19c: isub
      // 19d: putfield erg.qd2 I
      // 1a0: bipush 1
      // 1a1: ireturn
      // 1a2: bipush 0
      // 1a3: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
