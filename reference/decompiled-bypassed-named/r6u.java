public class r6u extends gun {
   public r6u(e0x var1) {
      super(var1);
      this.rlr(0);
      this.oml(true);
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 9
      // 005: aload 1
      // 006: getfield erg.qd2 I
      // 009: iload 9
      // 00b: ifne 027
      // 00e: ifne 01e
      // 011: goto 018
      // 014: invokestatic r6u.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 0
      // 019: ireturn
      // 01a: invokestatic r6u.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 2
      // 01f: aload 4
      // 021: aload 5
      // 023: aload 1
      // 024: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 027: iload 9
      // 029: ifne 037
      // 02c: ifne 038
      // 02f: goto 036
      // 032: invokestatic r6u.a (Loov;)Loov;
      // 035: athrow
      // 036: bipush 0
      // 037: ireturn
      // 038: aload 3
      // 039: aload 4
      // 03b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 03e: astore 10
      // 040: aload 10
      // 042: invokeinterface zfz.r_y ()Le0x; 1
      // 047: astore 11
      // 049: aload 4
      // 04b: astore 12
      // 04d: aload 5
      // 04f: getstatic vt2.rf3 Lvt2;
      // 052: if_acmpne 071
      // 055: aload 11
      // 057: aload 0
      // 058: getfield r6u.ekx Le0x;
      // 05b: iload 9
      // 05d: ifne 0af
      // 060: goto 067
      // 063: invokestatic r6u.a (Loov;)Loov;
      // 066: athrow
      // 067: if_acmpeq 0a9
      // 06a: goto 071
      // 06d: invokestatic r6u.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 11
      // 073: iload 9
      // 075: ifne 0ab
      // 078: goto 07f
      // 07b: invokestatic r6u.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 3
      // 080: aload 4
      // 082: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 085: ifne 0a9
      // 088: goto 08f
      // 08b: invokestatic r6u.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 4
      // 091: aload 5
      // 093: invokevirtual mew.offset (Lvt2;)Lmew;
      // 096: astore 12
      // 098: aload 3
      // 099: aload 12
      // 09b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 09e: astore 10
      // 0a0: aload 10
      // 0a2: invokeinterface zfz.r_y ()Le0x; 1
      // 0a7: astore 11
      // 0a9: aload 11
      // 0ab: aload 0
      // 0ac: getfield r6u.ekx Le0x;
      // 0af: if_acmpne 198
      // 0b2: aload 10
      // 0b4: getstatic e7p.sxl L_ku;
      // 0b7: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0bc: checkcast java/lang/Integer
      // 0bf: invokevirtual java/lang/Integer.intValue ()I
      // 0c2: istore 13
      // 0c4: iload 13
      // 0c6: iload 9
      // 0c8: ifne 1a9
      // 0cb: bipush 7
      // 0cd: if_icmpgt 198
      // 0d0: goto 0d7
      // 0d3: invokestatic r6u.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 10
      // 0d9: getstatic e7p.sxl L_ku;
      // 0dc: iload 13
      // 0de: bipush 1
      // 0df: iadd
      // 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0e8: astore 14
      // 0ea: aload 0
      // 0eb: iload 9
      // 0ed: ifne 199
      // 0f0: getfield r6u.ekx Le0x;
      // 0f3: aload 3
      // 0f4: aload 12
      // 0f6: aload 14
      // 0f8: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 0fb: astore 15
      // 0fd: aload 15
      // 0ff: ifnull 198
      // 102: aload 3
      // 103: aload 15
      // 105: invokevirtual OpaquePredicate.z09 (Lnh4;)Z
      // 108: iload 9
      // 10a: ifne 1a9
      // 10d: goto 114
      // 110: invokestatic r6u.a (Loov;)Loov;
      // 113: athrow
      // 114: ifeq 198
      // 117: goto 11e
      // 11a: invokestatic r6u.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 3
      // 11f: aload 12
      // 121: aload 14
      // 123: bipush 2
      // 124: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 127: iload 9
      // 129: ifne 1a9
      // 12c: goto 133
      // 12f: invokestatic r6u.a (Loov;)Loov;
      // 132: athrow
      // 133: ifeq 198
      // 136: goto 13d
      // 139: invokestatic r6u.a (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 3
      // 13e: aload 12
      // 140: invokevirtual mew.getX ()I
      // 143: i2f
      // 144: ldc 0.5
      // 146: nop
      // 147: fadd
      // 148: f2d
      // 149: aload 12
      // 14b: invokevirtual mew.getY ()I
      // 14e: i2f
      // 14f: ldc 0.5
      // 151: nop
      // 152: fadd
      // 153: f2d
      // 154: aload 12
      // 156: invokevirtual mew.getZ ()I
      // 159: i2f
      // 15a: ldc 0.5
      // 15c: nop
      // 15d: fadd
      // 15e: f2d
      // 15f: aload 0
      // 160: getfield r6u.ekx Le0x;
      // 163: getfield e0x.zu6 Le0x$zvv;
      // 166: invokevirtual e0x$zvv.jfo ()Ljava/lang/String;
      // 169: aload 0
      // 16a: getfield r6u.ekx Le0x;
      // 16d: getfield e0x.zu6 Le0x$zvv;
      // 170: invokevirtual e0x$zvv.dnt ()F
      // 173: fconst_1
      // 174: fadd
      // 175: fconst_2
      // 176: fdiv
      // 177: aload 0
      // 178: getfield r6u.ekx Le0x;
      // 17b: getfield e0x.zu6 Le0x$zvv;
      // 17e: invokevirtual e0x$zvv.kjj ()F
      // 181: ldc 0.8
      // 183: nop
      // 184: fmul
      // 185: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 188: aload 1
      // 189: dup
      // 18a: getfield erg.qd2 I
      // 18d: bipush 1
      // 18e: isub
      // 18f: putfield erg.qd2 I
      // 192: bipush 1
      // 193: ireturn
      // 194: invokestatic r6u.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: aload 1
      // 19a: aload 2
      // 19b: aload 3
      // 19c: aload 12
      // 19e: aload 5
      // 1a0: fload 6
      // 1a2: fload 7
      // 1a4: fload 8
      // 1a6: invokespecial gun.ghw (Lerg;Lha9;Lt9d;Lmew;Lvt2;FFF)Z
      // 1a9: ireturn
   }

   @Override
   public int v05(int var1) {
      return var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
