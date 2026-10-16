public class a_k extends u7m {
   private e0x euj;

   public a_k(e0x var1) {
      this.euj = var1;
      this.qfy(uja.yj_);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 9
      // 05: aload 5
      // 07: getstatic vt2.rf3 Lvt2;
      // 0a: if_acmpeq 13
      // 0d: bipush 0
      // 0e: ireturn
      // 0f: invokestatic a_k.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 3
      // 14: aload 4
      // 16: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 19: astore 10
      // 1b: aload 10
      // 1d: invokeinterface zfz.r_y ()Le0x; 1
      // 22: astore 11
      // 24: aload 11
      // 26: aload 3
      // 27: aload 4
      // 29: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 2c: iload 9
      // 2e: ifeq 4d
      // 31: ifne 44
      // 34: goto 3b
      // 37: invokestatic a_k.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 4
      // 3d: aload 5
      // 3f: invokevirtual mew.offset (Lvt2;)Lmew;
      // 42: astore 4
      // 44: aload 2
      // 45: aload 4
      // 47: aload 5
      // 49: aload 1
      // 4a: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 4d: iload 9
      // 4f: ifeq 6c
      // 52: ifne 62
      // 55: goto 5c
      // 58: invokestatic a_k.a (Loov;)Loov;
      // 5b: athrow
      // 5c: bipush 0
      // 5d: ireturn
      // 5e: invokestatic a_k.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 0
      // 63: getfield a_k.euj Le0x;
      // 66: aload 3
      // 67: aload 4
      // 69: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 6c: iload 9
      // 6e: ifeq 9e
      // 71: ifne 81
      // 74: goto 7b
      // 77: invokestatic a_k.a (Loov;)Loov;
      // 7a: athrow
      // 7b: bipush 0
      // 7c: ireturn
      // 7d: invokestatic a_k.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 3
      // 82: aload 4
      // 84: aload 2
      // 85: getfield ha9.x5k F
      // 88: f2d
      // 89: invokestatic vt2.ni1 (D)Lvt2;
      // 8c: aload 0
      // 8d: getfield a_k.euj Le0x;
      // 90: invokestatic a_k.o08 (Lt9d;Lmew;Lvt2;Le0x;)V
      // 93: aload 1
      // 94: dup
      // 95: getfield erg.qd2 I
      // 98: bipush 1
      // 99: isub
      // 9a: putfield erg.qd2 I
      // 9d: bipush 1
      // 9e: ireturn
   }

   public static void o08(OpaquePredicate param0, mew param1, vt2 param2, e0x param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: invokevirtual vt2.drv ()Lvt2;
      // 005: invokevirtual mew.offset (Lvt2;)Lmew;
      // 008: astore 5
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: aload 1
      // 00e: aload 2
      // 00f: invokevirtual vt2.tgw ()Lvt2;
      // 012: invokevirtual mew.offset (Lvt2;)Lmew;
      // 015: astore 6
      // 017: istore 4
      // 019: aload 0
      // 01a: aload 6
      // 01c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 01f: invokeinterface zfz.r_y ()Le0x; 1
      // 024: invokevirtual e0x.y0n ()Z
      // 027: iload 4
      // 029: ifeq 037
      // 02c: ifeq 03a
      // 02f: goto 036
      // 032: invokestatic a_k.a (Loov;)Loov;
      // 035: athrow
      // 036: bipush 1
      // 037: goto 03b
      // 03a: bipush 0
      // 03b: aload 0
      // 03c: aload 6
      // 03e: invokevirtual mew.nuv ()Lmew;
      // 041: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 044: invokeinterface zfz.r_y ()Le0x; 1
      // 049: invokevirtual e0x.y0n ()Z
      // 04c: iload 4
      // 04e: ifeq 05c
      // 051: ifeq 05f
      // 054: goto 05b
      // 057: invokestatic a_k.a (Loov;)Loov;
      // 05a: athrow
      // 05b: bipush 1
      // 05c: goto 060
      // 05f: bipush 0
      // 060: iadd
      // 061: istore 7
      // 063: aload 0
      // 064: aload 5
      // 066: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 069: invokeinterface zfz.r_y ()Le0x; 1
      // 06e: invokevirtual e0x.y0n ()Z
      // 071: iload 4
      // 073: ifeq 081
      // 076: ifeq 084
      // 079: goto 080
      // 07c: invokestatic a_k.a (Loov;)Loov;
      // 07f: athrow
      // 080: bipush 1
      // 081: goto 085
      // 084: bipush 0
      // 085: aload 0
      // 086: aload 5
      // 088: invokevirtual mew.nuv ()Lmew;
      // 08b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 08e: invokeinterface zfz.r_y ()Le0x; 1
      // 093: invokevirtual e0x.y0n ()Z
      // 096: iload 4
      // 098: ifeq 0a6
      // 09b: ifeq 0a9
      // 09e: goto 0a5
      // 0a1: invokestatic a_k.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: bipush 1
      // 0a6: goto 0aa
      // 0a9: bipush 0
      // 0aa: iadd
      // 0ab: istore 8
      // 0ad: aload 0
      // 0ae: aload 6
      // 0b0: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0b3: invokeinterface zfz.r_y ()Le0x; 1
      // 0b8: aload 3
      // 0b9: iload 4
      // 0bb: ifeq 0de
      // 0be: if_acmpeq 0e1
      // 0c1: goto 0c8
      // 0c4: invokestatic a_k.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: aload 6
      // 0cb: invokevirtual mew.nuv ()Lmew;
      // 0ce: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0d1: invokeinterface zfz.r_y ()Le0x; 1
      // 0d6: aload 3
      // 0d7: goto 0de
      // 0da: invokestatic a_k.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: if_acmpne 0e9
      // 0e1: bipush 1
      // 0e2: goto 0ea
      // 0e5: invokestatic a_k.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: bipush 0
      // 0ea: istore 9
      // 0ec: aload 0
      // 0ed: aload 5
      // 0ef: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0f2: invokeinterface zfz.r_y ()Le0x; 1
      // 0f7: aload 3
      // 0f8: iload 4
      // 0fa: ifeq 11d
      // 0fd: if_acmpeq 120
      // 100: goto 107
      // 103: invokestatic a_k.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 0
      // 108: aload 5
      // 10a: invokevirtual mew.nuv ()Lmew;
      // 10d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 110: invokeinterface zfz.r_y ()Le0x; 1
      // 115: aload 3
      // 116: goto 11d
      // 119: invokestatic a_k.a (Loov;)Loov;
      // 11c: athrow
      // 11d: if_acmpne 128
      // 120: bipush 1
      // 121: goto 129
      // 124: invokestatic a_k.a (Loov;)Loov;
      // 127: athrow
      // 128: bipush 0
      // 129: istore 10
      // 12b: bipush 0
      // 12c: istore 11
      // 12e: iload 9
      // 130: iload 4
      // 132: ifeq 159
      // 135: ifeq 157
      // 138: goto 13f
      // 13b: invokestatic a_k.a (Loov;)Loov;
      // 13e: athrow
      // 13f: iload 10
      // 141: iload 4
      // 143: ifeq 172
      // 146: goto 14d
      // 149: invokestatic a_k.a (Loov;)Loov;
      // 14c: athrow
      // 14d: ifeq 16a
      // 150: goto 157
      // 153: invokestatic a_k.a (Loov;)Loov;
      // 156: athrow
      // 157: iload 8
      // 159: iload 4
      // 15b: ifeq 172
      // 15e: iload 7
      // 160: if_icmple 174
      // 163: goto 16a
      // 166: invokestatic a_k.a (Loov;)Loov;
      // 169: athrow
      // 16a: bipush 1
      // 16b: goto 172
      // 16e: invokestatic a_k.a (Loov;)Loov;
      // 171: athrow
      // 172: istore 11
      // 174: aload 1
      // 175: invokevirtual mew.nuv ()Lmew;
      // 178: astore 12
      // 17a: aload 3
      // 17b: invokevirtual e0x.l4i ()Lzfz;
      // 17e: getstatic w4e.kyp Lqx_;
      // 181: aload 2
      // 182: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 187: getstatic w4e.m_q Lzb_;
      // 18a: iload 11
      // 18c: ifeq 199
      // 18f: getstatic w4e$d2r.plj Lw4e$d2r;
      // 192: goto 19c
      // 195: invokestatic a_k.a (Loov;)Loov;
      // 198: athrow
      // 199: getstatic w4e$d2r.cd4 Lw4e$d2r;
      // 19c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1a1: astore 13
      // 1a3: aload 0
      // 1a4: aload 1
      // 1a5: aload 13
      // 1a7: getstatic w4e.raj Lzb_;
      // 1aa: getstatic w4e$w0e.lf4 Lw4e$w0e;
      // 1ad: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1b2: bipush 2
      // 1b3: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1b6: pop
      // 1b7: aload 0
      // 1b8: aload 12
      // 1ba: aload 13
      // 1bc: getstatic w4e.raj Lzb_;
      // 1bf: getstatic w4e$w0e._bw Lw4e$w0e;
      // 1c2: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1c7: bipush 2
      // 1c8: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1cb: pop
      // 1cc: aload 0
      // 1cd: aload 1
      // 1ce: aload 3
      // 1cf: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 1d2: aload 0
      // 1d3: aload 12
      // 1d5: aload 3
      // 1d6: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 1d9: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
