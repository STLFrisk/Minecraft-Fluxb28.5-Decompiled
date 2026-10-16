import java.util.Random;

public abstract class wgw extends e9q {
   public final int ddh;
   public final zfz _f6;
   public final zfz _p4;
   public int cc3;

   public wgw(boolean var1, int var2, int var3, zfz var4, zfz var5) {
      super(var1);
      this.ddh = var2;
      this.cc3 = var3;
      this._f6 = var4;
      this._p4 = var5;
   }

   public int wl1(Random var1) {
      int var2 = OpaquePredicate.b();
      int var3 = var1.nextInt(3) + this.ddh;

      try {
         if (var2 == 0) {
            return this.cc3;
         }

         if (this.cc3 <= 1) {
            return var3;
         }
      } catch (oov var4) {
         throw d(var4);
      }

      var3 += var1.nextInt(this.cc3);
      return var3;
   }

   private boolean nby(OpaquePredicate param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: bipush 1
      // 006: istore 5
      // 008: aload 2
      // 009: invokevirtual mew.getY ()I
      // 00c: iload 4
      // 00e: ifeq 164
      // 011: bipush 1
      // 012: if_icmplt 163
      // 015: goto 01c
      // 018: invokestatic wgw.d (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 2
      // 01d: invokevirtual mew.getY ()I
      // 020: iload 3
      // 021: iadd
      // 022: bipush 1
      // 023: iadd
      // 024: iload 4
      // 026: ifeq 164
      // 029: goto 030
      // 02c: invokestatic wgw.d (Loov;)Loov;
      // 02f: athrow
      // 030: sipush 256
      // 033: if_icmpgt 163
      // 036: goto 03d
      // 039: invokestatic wgw.d (Loov;)Loov;
      // 03c: athrow
      // 03d: bipush 0
      // 03e: istore 6
      // 040: iload 6
      // 042: bipush 1
      // 043: iload 3
      // 044: iadd
      // 045: if_icmpgt 160
      // 048: bipush 2
      // 049: istore 7
      // 04b: iload 6
      // 04d: iload 4
      // 04f: ifeq 162
      // 052: iload 4
      // 054: ifeq 079
      // 057: goto 05e
      // 05a: invokestatic wgw.d (Loov;)Loov;
      // 05d: athrow
      // 05e: ifne 070
      // 061: goto 068
      // 064: invokestatic wgw.d (Loov;)Loov;
      // 067: athrow
      // 068: bipush 1
      // 069: istore 7
      // 06b: iload 4
      // 06d: ifne 090
      // 070: iload 6
      // 072: goto 079
      // 075: invokestatic wgw.d (Loov;)Loov;
      // 078: athrow
      // 079: iload 4
      // 07b: ifeq 093
      // 07e: bipush 1
      // 07f: iload 3
      // 080: iadd
      // 081: bipush 2
      // 082: isub
      // 083: if_icmplt 090
      // 086: goto 08d
      // 089: invokestatic wgw.d (Loov;)Loov;
      // 08c: athrow
      // 08d: bipush 2
      // 08e: istore 7
      // 090: iload 7
      // 092: ineg
      // 093: istore 8
      // 095: iload 8
      // 097: iload 7
      // 099: if_icmpgt 158
      // 09c: iload 5
      // 09e: iload 4
      // 0a0: ifeq 042
      // 0a3: iload 4
      // 0a5: ifeq 0bc
      // 0a8: ifeq 158
      // 0ab: goto 0b2
      // 0ae: invokestatic wgw.d (Loov;)Loov;
      // 0b1: athrow
      // 0b2: iload 7
      // 0b4: ineg
      // 0b5: goto 0bc
      // 0b8: invokestatic wgw.d (Loov;)Loov;
      // 0bb: athrow
      // 0bc: istore 9
      // 0be: iload 9
      // 0c0: iload 7
      // 0c2: if_icmpgt 150
      // 0c5: iload 5
      // 0c7: iload 4
      // 0c9: ifeq 097
      // 0cc: iload 4
      // 0ce: ifeq 0e9
      // 0d1: ifeq 150
      // 0d4: goto 0db
      // 0d7: invokestatic wgw.d (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 2
      // 0dc: invokevirtual mew.getY ()I
      // 0df: iload 6
      // 0e1: iadd
      // 0e2: goto 0e9
      // 0e5: invokestatic wgw.d (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 4
      // 0eb: ifeq 146
      // 0ee: iflt 145
      // 0f1: goto 0f8
      // 0f4: invokestatic wgw.d (Loov;)Loov;
      // 0f7: athrow
      // 0f8: aload 2
      // 0f9: invokevirtual mew.getY ()I
      // 0fc: iload 6
      // 0fe: iadd
      // 0ff: iload 4
      // 101: ifeq 146
      // 104: goto 10b
      // 107: invokestatic wgw.d (Loov;)Loov;
      // 10a: athrow
      // 10b: sipush 256
      // 10e: if_icmpge 145
      // 111: goto 118
      // 114: invokestatic wgw.d (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: aload 1
      // 11a: aload 2
      // 11b: iload 8
      // 11d: iload 6
      // 11f: iload 9
      // 121: invokevirtual mew.ec4 (III)Lmew;
      // 124: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 127: invokeinterface zfz.r_y ()Le0x; 1
      // 12c: invokevirtual wgw.mgy (Le0x;)Z
      // 12f: iload 4
      // 131: ifeq 146
      // 134: goto 13b
      // 137: invokestatic wgw.d (Loov;)Loov;
      // 13a: athrow
      // 13b: ifne 148
      // 13e: goto 145
      // 141: invokestatic wgw.d (Loov;)Loov;
      // 144: athrow
      // 145: bipush 0
      // 146: istore 5
      // 148: iinc 9 1
      // 14b: iload 4
      // 14d: ifne 0be
      // 150: iinc 8 1
      // 153: iload 4
      // 155: ifne 095
      // 158: iinc 6 1
      // 15b: iload 4
      // 15d: ifne 040
      // 160: iload 5
      // 162: ireturn
      // 163: bipush 0
      // 164: ireturn
   }

   private boolean ev3(mew param1, OpaquePredicate param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual mew.eve ()Lmew;
      // 04: astore 4
      // 06: invokestatic OpaquePredicate.b ()I
      // 09: aload 2
      // 0a: aload 4
      // 0c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0f: invokeinterface zfz.r_y ()Le0x; 1
      // 14: astore 5
      // 16: istore 3
      // 17: aload 5
      // 19: getstatic ox_.l11 Lx82;
      // 1c: iload 3
      // 1d: ifeq 36
      // 20: if_acmpeq 39
      // 23: goto 2a
      // 26: invokestatic wgw.d (Loov;)Loov;
      // 29: athrow
      // 2a: aload 5
      // 2c: getstatic ox_.kqk Le0x;
      // 2f: goto 36
      // 32: invokestatic wgw.d (Loov;)Loov;
      // 35: athrow
      // 36: if_acmpne 81
      // 39: aload 1
      // 3a: invokevirtual mew.getY ()I
      // 3d: iload 3
      // 3e: ifeq 82
      // 41: goto 48
      // 44: invokestatic wgw.d (Loov;)Loov;
      // 47: athrow
      // 48: bipush 2
      // 49: if_icmplt 81
      // 4c: goto 53
      // 4f: invokestatic wgw.d (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: aload 2
      // 55: aload 4
      // 57: invokevirtual wgw.g27 (Lt9d;Lmew;)V
      // 5a: aload 0
      // 5b: aload 2
      // 5c: aload 4
      // 5e: invokevirtual mew.o_8 ()Lmew;
      // 61: invokevirtual wgw.g27 (Lt9d;Lmew;)V
      // 64: aload 0
      // 65: aload 2
      // 66: aload 4
      // 68: invokevirtual mew.z6x ()Lmew;
      // 6b: invokevirtual wgw.g27 (Lt9d;Lmew;)V
      // 6e: aload 0
      // 6f: aload 2
      // 70: aload 4
      // 72: invokevirtual mew.z6x ()Lmew;
      // 75: invokevirtual mew.o_8 ()Lmew;
      // 78: invokevirtual wgw.g27 (Lt9d;Lmew;)V
      // 7b: bipush 1
      // 7c: ireturn
      // 7d: invokestatic wgw.d (Loov;)Loov;
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
   }

   public boolean ku6(OpaquePredicate param1, Random param2, mew param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 3
      // 08: iload 4
      // 0a: invokespecial wgw.nby (Lt9d;Lmew;I)Z
      // 0d: iload 5
      // 0f: ifne 29
      // 12: ifeq 3c
      // 15: goto 1c
      // 18: invokestatic wgw.d (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 3
      // 1e: aload 1
      // 1f: invokespecial wgw.ev3 (Lmew;Lt9d;)Z
      // 22: goto 29
      // 25: invokestatic wgw.d (Loov;)Loov;
      // 28: athrow
      // 29: iload 5
      // 2b: ifne 39
      // 2e: ifeq 3c
      // 31: goto 38
      // 34: invokestatic wgw.d (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   public void c9n(OpaquePredicate param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: iload 3
      // 002: imul
      // 003: istore 5
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: iload 3
      // 009: ineg
      // 00a: istore 6
      // 00c: istore 4
      // 00e: iload 6
      // 010: iload 3
      // 011: bipush 1
      // 012: iadd
      // 013: if_icmpgt 10c
      // 016: iload 3
      // 017: ineg
      // 018: istore 7
      // 01a: iload 7
      // 01c: iload 3
      // 01d: bipush 1
      // 01e: iadd
      // 01f: if_icmpgt 104
      // 022: iload 6
      // 024: bipush 1
      // 025: isub
      // 026: istore 8
      // 028: iload 7
      // 02a: bipush 1
      // 02b: isub
      // 02c: istore 9
      // 02e: iload 6
      // 030: iload 6
      // 032: imul
      // 033: iload 7
      // 035: iload 7
      // 037: imul
      // 038: iadd
      // 039: iload 5
      // 03b: iload 4
      // 03d: ifne 013
      // 040: iload 4
      // 042: ifne 063
      // 045: if_icmple 0ac
      // 048: goto 04f
      // 04b: invokestatic wgw.d (Loov;)Loov;
      // 04e: athrow
      // 04f: iload 8
      // 051: iload 8
      // 053: imul
      // 054: iload 9
      // 056: iload 9
      // 058: imul
      // 059: iadd
      // 05a: iload 5
      // 05c: goto 063
      // 05f: invokestatic wgw.d (Loov;)Loov;
      // 062: athrow
      // 063: iload 4
      // 065: ifne 086
      // 068: if_icmple 0ac
      // 06b: goto 072
      // 06e: invokestatic wgw.d (Loov;)Loov;
      // 071: athrow
      // 072: iload 6
      // 074: iload 6
      // 076: imul
      // 077: iload 9
      // 079: iload 9
      // 07b: imul
      // 07c: iadd
      // 07d: iload 5
      // 07f: goto 086
      // 082: invokestatic wgw.d (Loov;)Loov;
      // 085: athrow
      // 086: iload 4
      // 088: ifne 0a9
      // 08b: if_icmple 0ac
      // 08e: goto 095
      // 091: invokestatic wgw.d (Loov;)Loov;
      // 094: athrow
      // 095: iload 8
      // 097: iload 8
      // 099: imul
      // 09a: iload 7
      // 09c: iload 7
      // 09e: imul
      // 09f: iadd
      // 0a0: iload 5
      // 0a2: goto 0a9
      // 0a5: invokestatic wgw.d (Loov;)Loov;
      // 0a8: athrow
      // 0a9: if_icmpgt 0fc
      // 0ac: aload 2
      // 0ad: iload 6
      // 0af: bipush 0
      // 0b0: iload 7
      // 0b2: invokevirtual mew.ec4 (III)Lmew;
      // 0b5: astore 10
      // 0b7: aload 1
      // 0b8: aload 10
      // 0ba: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0bd: invokeinterface zfz.r_y ()Le0x; 1
      // 0c2: invokevirtual e0x.p1r ()Lp3y;
      // 0c5: astore 11
      // 0c7: aload 11
      // 0c9: getstatic p3y.cei Lp3y;
      // 0cc: iload 4
      // 0ce: ifne 0e7
      // 0d1: if_acmpeq 0ea
      // 0d4: goto 0db
      // 0d7: invokestatic wgw.d (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 11
      // 0dd: getstatic p3y.hh1 Lp3y;
      // 0e0: goto 0e7
      // 0e3: invokestatic wgw.d (Loov;)Loov;
      // 0e6: athrow
      // 0e7: if_acmpne 0fc
      // 0ea: aload 0
      // 0eb: aload 1
      // 0ec: aload 10
      // 0ee: aload 0
      // 0ef: getfield wgw._p4 Lzfz;
      // 0f2: invokevirtual wgw.u0f (Lt9d;Lmew;Lzfz;)V
      // 0f5: goto 0fc
      // 0f8: invokestatic wgw.d (Loov;)Loov;
      // 0fb: athrow
      // 0fc: iinc 7 1
      // 0ff: iload 4
      // 101: ifeq 01a
      // 104: iinc 6 1
      // 107: iload 4
      // 109: ifeq 00e
      // 10c: return
   }

   public void l80(OpaquePredicate param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: iload 3
      // 02: imul
      // 03: istore 5
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: iload 3
      // 09: ineg
      // 0a: istore 6
      // 0c: istore 4
      // 0e: iload 6
      // 10: iload 3
      // 11: if_icmpgt 93
      // 14: iload 3
      // 15: ineg
      // 16: istore 7
      // 18: iload 7
      // 1a: iload 3
      // 1b: if_icmpgt 8b
      // 1e: iload 6
      // 20: iload 6
      // 22: imul
      // 23: iload 7
      // 25: iload 7
      // 27: imul
      // 28: iadd
      // 29: iload 5
      // 2b: iload 4
      // 2d: ifne 11
      // 30: if_icmpgt 83
      // 33: aload 2
      // 34: iload 6
      // 36: bipush 0
      // 37: iload 7
      // 39: invokevirtual mew.ec4 (III)Lmew;
      // 3c: astore 8
      // 3e: aload 1
      // 3f: aload 8
      // 41: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 44: invokeinterface zfz.r_y ()Le0x; 1
      // 49: invokevirtual e0x.p1r ()Lp3y;
      // 4c: astore 9
      // 4e: aload 9
      // 50: getstatic p3y.cei Lp3y;
      // 53: iload 4
      // 55: ifne 6e
      // 58: if_acmpeq 71
      // 5b: goto 62
      // 5e: invokestatic wgw.d (Loov;)Loov;
      // 61: athrow
      // 62: aload 9
      // 64: getstatic p3y.hh1 Lp3y;
      // 67: goto 6e
      // 6a: invokestatic wgw.d (Loov;)Loov;
      // 6d: athrow
      // 6e: if_acmpne 83
      // 71: aload 0
      // 72: aload 1
      // 73: aload 8
      // 75: aload 0
      // 76: getfield wgw._p4 Lzfz;
      // 79: invokevirtual wgw.u0f (Lt9d;Lmew;Lzfz;)V
      // 7c: goto 83
      // 7f: invokestatic wgw.d (Loov;)Loov;
      // 82: athrow
      // 83: iinc 7 1
      // 86: iload 4
      // 88: ifeq 18
      // 8b: iinc 6 1
      // 8e: iload 4
      // 90: ifeq 0e
      // 93: return
   }

   private static oov d(oov var0) {
      return var0;
   }
}
