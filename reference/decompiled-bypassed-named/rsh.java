import net.minecraft.network.play.server.S38PacketPlayerListItem;
import net.minecraft.network.play.server.S38PacketPlayerListItem$a1f;

public class rsh {
   public OpaquePredicate bk1;
   public z96 rpl;
   private h50$f05 ox_ = h50$f05.ay6;
   private boolean vzv;
   private int ol7;
   private mew _ml = mew._9b;
   private int ivu;
   private boolean wo0;
   private mew u0t = mew._9b;
   private int bkz;
   private int x1r = -1;

   public rsh(OpaquePredicate var1) {
      this.bk1 = var1;
   }

   public void ppu(h50$f05 var1) {
      this.ox_ = var1;
      var1.zwk(this.rpl.lls);
      this.rpl.gow();
      this.rpl.paw.wh3().v3l(new S38PacketPlayerListItem(S38PacketPlayerListItem$a1f.esa, new z96[]{this.rpl}));
   }

   public h50$f05 tmw() {
      return this.ox_;
   }

   public boolean pcm() {
      return this.ox_.wdc();
   }

   public boolean u7c() {
      return this.ox_.zlv();
   }

   public void asu(h50$f05 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 26
      // 09: getfield rsh.ox_ Lh50$f05;
      // 0c: getstatic h50$f05.ay6 Lh50$f05;
      // 0f: if_acmpne 25
      // 12: goto 19
      // 15: invokestatic rsh.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: putfield rsh.ox_ Lh50$f05;
      // 1e: goto 25
      // 21: invokestatic rsh.b (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 0
      // 27: getfield rsh.ox_ Lh50$f05;
      // 2a: invokevirtual rsh.ppu (Lh50$f05;)V
      // 2d: return
   }

   public void gwt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: dup
      // 006: getfield rsh.ivu I
      // 009: bipush 1
      // 00a: iadd
      // 00b: putfield rsh.ivu I
      // 00e: aload 0
      // 00f: getfield rsh.wo0 Z
      // 012: iload 1
      // 013: ifne 100
      // 016: ifeq 0ea
      // 019: goto 020
      // 01c: invokestatic rsh.b (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield rsh.ivu I
      // 024: aload 0
      // 025: getfield rsh.bkz I
      // 028: isub
      // 029: istore 2
      // 02a: aload 0
      // 02b: getfield rsh.bk1 Lt9d;
      // 02e: aload 0
      // 02f: getfield rsh.u0t Lmew;
      // 032: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 035: invokeinterface zfz.r_y ()Le0x; 1
      // 03a: astore 3
      // 03b: aload 3
      // 03c: iload 1
      // 03d: ifne 068
      // 040: invokevirtual e0x.p1r ()Lp3y;
      // 043: getstatic p3y.cei Lp3y;
      // 046: if_acmpne 060
      // 049: goto 050
      // 04c: invokestatic rsh.b (Loov;)Loov;
      // 04f: athrow
      // 050: aload 0
      // 051: bipush 0
      // 052: putfield rsh.wo0 Z
      // 055: iload 1
      // 056: ifeq 0e6
      // 059: goto 060
      // 05c: invokestatic rsh.b (Loov;)Loov;
      // 05f: athrow
      // 060: aload 3
      // 061: goto 068
      // 064: invokestatic rsh.b (Loov;)Loov;
      // 067: athrow
      // 068: aload 0
      // 069: getfield rsh.rpl Lz96;
      // 06c: aload 0
      // 06d: getfield rsh.rpl Lz96;
      // 070: getfield z96.oay Lt9d;
      // 073: aload 0
      // 074: getfield rsh.u0t Lmew;
      // 077: invokevirtual e0x.lf9 (Lha9;Lt9d;Lmew;)F
      // 07a: iload 2
      // 07b: bipush 1
      // 07c: iadd
      // 07d: i2f
      // 07e: fmul
      // 07f: fstore 4
      // 081: fload 4
      // 083: ldc 10.0
      // 085: nop
      // 086: fmul
      // 087: f2i
      // 088: istore 5
      // 08a: iload 5
      // 08c: iload 1
      // 08d: ifne 0c3
      // 090: aload 0
      // 091: getfield rsh.x1r I
      // 094: if_icmpeq 0bf
      // 097: goto 09e
      // 09a: invokestatic rsh.b (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield rsh.bk1 Lt9d;
      // 0a2: aload 0
      // 0a3: getfield rsh.rpl Lz96;
      // 0a6: invokevirtual z96.jwu ()I
      // 0a9: aload 0
      // 0aa: getfield rsh.u0t Lmew;
      // 0ad: iload 5
      // 0af: invokevirtual OpaquePredicate.vn_ (ILmew;I)V
      // 0b2: aload 0
      // 0b3: iload 5
      // 0b5: putfield rsh.x1r I
      // 0b8: goto 0bf
      // 0bb: invokestatic rsh.b (Loov;)Loov;
      // 0be: athrow
      // 0bf: fload 4
      // 0c1: fconst_1
      // 0c2: fcmpl
      // 0c3: iload 1
      // 0c4: ifne 0e5
      // 0c7: iflt 0e6
      // 0ca: goto 0d1
      // 0cd: invokestatic rsh.b (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: bipush 0
      // 0d3: putfield rsh.wo0 Z
      // 0d6: aload 0
      // 0d7: aload 0
      // 0d8: getfield rsh.u0t Lmew;
      // 0db: invokevirtual rsh.s4o (Lmew;)Z
      // 0de: goto 0e5
      // 0e1: invokestatic rsh.b (Loov;)Loov;
      // 0e4: athrow
      // 0e5: pop
      // 0e6: iload 1
      // 0e7: ifeq 1b3
      // 0ea: aload 0
      // 0eb: iload 1
      // 0ec: ifne 104
      // 0ef: goto 0f6
      // 0f2: invokestatic rsh.b (Loov;)Loov;
      // 0f5: athrow
      // 0f6: getfield rsh.vzv Z
      // 0f9: goto 100
      // 0fc: invokestatic rsh.b (Loov;)Loov;
      // 0ff: athrow
      // 100: ifeq 1b3
      // 103: aload 0
      // 104: getfield rsh.bk1 Lt9d;
      // 107: aload 0
      // 108: getfield rsh._ml Lmew;
      // 10b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 10e: invokeinterface zfz.r_y ()Le0x; 1
      // 113: astore 2
      // 114: iload 1
      // 115: ifne 14d
      // 118: aload 2
      // 119: invokevirtual e0x.p1r ()Lp3y;
      // 11c: getstatic p3y.cei Lp3y;
      // 11f: if_acmpne 151
      // 122: goto 129
      // 125: invokestatic rsh.b (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield rsh.bk1 Lt9d;
      // 12d: aload 0
      // 12e: getfield rsh.rpl Lz96;
      // 131: invokevirtual z96.jwu ()I
      // 134: aload 0
      // 135: getfield rsh._ml Lmew;
      // 138: bipush -1
      // 139: invokevirtual OpaquePredicate.vn_ (ILmew;I)V
      // 13c: aload 0
      // 13d: bipush -1
      // 13e: putfield rsh.x1r I
      // 141: aload 0
      // 142: bipush 0
      // 143: putfield rsh.vzv Z
      // 146: goto 14d
      // 149: invokestatic rsh.b (Loov;)Loov;
      // 14c: athrow
      // 14d: iload 1
      // 14e: ifeq 1b3
      // 151: aload 0
      // 152: getfield rsh.ivu I
      // 155: aload 0
      // 156: getfield rsh.ol7 I
      // 159: isub
      // 15a: istore 3
      // 15b: aload 2
      // 15c: aload 0
      // 15d: getfield rsh.rpl Lz96;
      // 160: aload 0
      // 161: getfield rsh.rpl Lz96;
      // 164: getfield z96.oay Lt9d;
      // 167: aload 0
      // 168: getfield rsh.u0t Lmew;
      // 16b: invokevirtual e0x.lf9 (Lha9;Lt9d;Lmew;)F
      // 16e: iload 3
      // 16f: bipush 1
      // 170: iadd
      // 171: i2f
      // 172: fmul
      // 173: fstore 4
      // 175: fload 4
      // 177: ldc 10.0
      // 179: nop
      // 17a: fmul
      // 17b: f2i
      // 17c: istore 5
      // 17e: iload 1
      // 17f: ifne 1ad
      // 182: iload 5
      // 184: aload 0
      // 185: getfield rsh.x1r I
      // 188: if_icmpeq 1b3
      // 18b: goto 192
      // 18e: invokestatic rsh.b (Loov;)Loov;
      // 191: athrow
      // 192: aload 0
      // 193: getfield rsh.bk1 Lt9d;
      // 196: aload 0
      // 197: getfield rsh.rpl Lz96;
      // 19a: invokevirtual z96.jwu ()I
      // 19d: aload 0
      // 19e: getfield rsh._ml Lmew;
      // 1a1: iload 5
      // 1a3: invokevirtual OpaquePredicate.vn_ (ILmew;I)V
      // 1a6: goto 1ad
      // 1a9: invokestatic rsh.b (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: iload 5
      // 1b0: putfield rsh.x1r I
      // 1b3: return
   }

   public void o29(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 051
      // 009: invokevirtual rsh.u7c ()Z
      // 00c: ifeq 049
      // 00f: goto 016
      // 012: invokestatic rsh.b (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield rsh.bk1 Lt9d;
      // 01a: aconst_null
      // 01b: checkcast ha9
      // 01e: aload 1
      // 01f: aload 2
      // 020: invokevirtual OpaquePredicate.igu (Lha9;Lmew;Lvt2;)Z
      // 023: iload 3
      // 024: ifeq 044
      // 027: goto 02e
      // 02a: invokestatic rsh.b (Loov;)Loov;
      // 02d: athrow
      // 02e: ifne 190
      // 031: goto 038
      // 034: invokestatic rsh.b (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: aload 1
      // 03a: invokevirtual rsh.s4o (Lmew;)Z
      // 03d: goto 044
      // 040: invokestatic rsh.b (Loov;)Loov;
      // 043: athrow
      // 044: pop
      // 045: iload 3
      // 046: ifne 190
      // 049: aload 0
      // 04a: goto 051
      // 04d: invokestatic rsh.b (Loov;)Loov;
      // 050: athrow
      // 051: getfield rsh.bk1 Lt9d;
      // 054: aload 1
      // 055: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 058: invokeinterface zfz.r_y ()Le0x; 1
      // 05d: astore 4
      // 05f: aload 0
      // 060: getfield rsh.ox_ Lh50$f05;
      // 063: invokevirtual h50$f05.p98 ()Z
      // 066: iload 3
      // 067: ifeq 0e7
      // 06a: ifeq 0da
      // 06d: goto 074
      // 070: invokestatic rsh.b (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: iload 3
      // 076: ifeq 096
      // 079: goto 080
      // 07c: invokestatic rsh.b (Loov;)Loov;
      // 07f: athrow
      // 080: getfield rsh.ox_ Lh50$f05;
      // 083: getstatic h50$f05.l18 Lh50$f05;
      // 086: if_acmpne 095
      // 089: goto 090
      // 08c: invokestatic rsh.b (Loov;)Loov;
      // 08f: athrow
      // 090: return
      // 091: invokestatic rsh.b (Loov;)Loov;
      // 094: athrow
      // 095: aload 0
      // 096: getfield rsh.rpl Lz96;
      // 099: invokevirtual z96.gt3 ()Z
      // 09c: iload 3
      // 09d: ifeq 0e7
      // 0a0: ifne 0da
      // 0a3: goto 0aa
      // 0a6: invokestatic rsh.b (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield rsh.rpl Lz96;
      // 0ae: invokevirtual z96.b5z ()Lerg;
      // 0b1: astore 5
      // 0b3: aload 5
      // 0b5: iload 3
      // 0b6: ifeq 0c6
      // 0b9: ifnonnull 0c4
      // 0bc: goto 0c3
      // 0bf: invokestatic rsh.b (Loov;)Loov;
      // 0c2: athrow
      // 0c3: return
      // 0c4: aload 5
      // 0c6: aload 4
      // 0c8: invokevirtual erg.pgf (Le0x;)Z
      // 0cb: iload 3
      // 0cc: ifeq 0e7
      // 0cf: ifne 0da
      // 0d2: goto 0d9
      // 0d5: invokestatic rsh.b (Loov;)Loov;
      // 0d8: athrow
      // 0d9: return
      // 0da: aload 0
      // 0db: getfield rsh.bk1 Lt9d;
      // 0de: aconst_null
      // 0df: checkcast ha9
      // 0e2: aload 1
      // 0e3: aload 2
      // 0e4: invokevirtual OpaquePredicate.igu (Lha9;Lmew;Lvt2;)Z
      // 0e7: pop
      // 0e8: aload 0
      // 0e9: aload 0
      // 0ea: getfield rsh.ivu I
      // 0ed: putfield rsh.ol7 I
      // 0f0: fconst_1
      // 0f1: fstore 5
      // 0f3: aload 4
      // 0f5: invokevirtual e0x.p1r ()Lp3y;
      // 0f8: getstatic p3y.cei Lp3y;
      // 0fb: iload 3
      // 0fc: ifeq 132
      // 0ff: if_acmpeq 12a
      // 102: goto 109
      // 105: invokestatic rsh.b (Loov;)Loov;
      // 108: athrow
      // 109: aload 4
      // 10b: aload 0
      // 10c: getfield rsh.bk1 Lt9d;
      // 10f: aload 1
      // 110: aload 0
      // 111: getfield rsh.rpl Lz96;
      // 114: invokevirtual e0x.uqb (Lt9d;Lmew;Lha9;)V
      // 117: aload 4
      // 119: aload 0
      // 11a: getfield rsh.rpl Lz96;
      // 11d: aload 0
      // 11e: getfield rsh.rpl Lz96;
      // 121: getfield z96.oay Lt9d;
      // 124: aload 1
      // 125: invokevirtual e0x.lf9 (Lha9;Lt9d;Lmew;)F
      // 128: fstore 5
      // 12a: aload 4
      // 12c: invokevirtual e0x.p1r ()Lp3y;
      // 12f: getstatic p3y.cei Lp3y;
      // 132: if_acmpeq 15f
      // 135: fload 5
      // 137: fconst_1
      // 138: fcmpl
      // 139: iload 3
      // 13a: ifeq 177
      // 13d: goto 144
      // 140: invokestatic rsh.b (Loov;)Loov;
      // 143: athrow
      // 144: iflt 15f
      // 147: goto 14e
      // 14a: invokestatic rsh.b (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: aload 1
      // 150: invokevirtual rsh.s4o (Lmew;)Z
      // 153: pop
      // 154: iload 3
      // 155: ifne 190
      // 158: goto 15f
      // 15b: invokestatic rsh.b (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: bipush 1
      // 161: putfield rsh.vzv Z
      // 164: aload 0
      // 165: aload 1
      // 166: putfield rsh._ml Lmew;
      // 169: fload 5
      // 16b: ldc 10.0
      // 16d: nop
      // 16e: fmul
      // 16f: f2i
      // 170: goto 177
      // 173: invokestatic rsh.b (Loov;)Loov;
      // 176: athrow
      // 177: istore 6
      // 179: aload 0
      // 17a: getfield rsh.bk1 Lt9d;
      // 17d: aload 0
      // 17e: getfield rsh.rpl Lz96;
      // 181: invokevirtual z96.jwu ()I
      // 184: aload 1
      // 185: iload 6
      // 187: invokevirtual OpaquePredicate.vn_ (ILmew;I)V
      // 18a: aload 0
      // 18b: iload 6
      // 18d: putfield rsh.x1r I
      // 190: return
   }

   public void z8m(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield rsh._ml Lmew;
      // 09: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 0c: iload 2
      // 0d: ifne 2a
      // 10: ifeq e0
      // 13: goto 1a
      // 16: invokestatic rsh.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield rsh.ivu I
      // 1e: aload 0
      // 1f: getfield rsh.ol7 I
      // 22: isub
      // 23: goto 2a
      // 26: invokestatic rsh.b (Loov;)Loov;
      // 29: athrow
      // 2a: istore 3
      // 2b: aload 0
      // 2c: getfield rsh.bk1 Lt9d;
      // 2f: aload 1
      // 30: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 33: invokeinterface zfz.r_y ()Le0x; 1
      // 38: astore 4
      // 3a: aload 4
      // 3c: iload 2
      // 3d: ifne 59
      // 40: invokevirtual e0x.p1r ()Lp3y;
      // 43: getstatic p3y.cei Lp3y;
      // 46: if_acmpeq e0
      // 49: goto 50
      // 4c: invokestatic rsh.b (Loov;)Loov;
      // 4f: athrow
      // 50: aload 4
      // 52: goto 59
      // 55: invokestatic rsh.b (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield rsh.rpl Lz96;
      // 5d: aload 0
      // 5e: getfield rsh.rpl Lz96;
      // 61: getfield z96.oay Lt9d;
      // 64: aload 1
      // 65: invokevirtual e0x.lf9 (Lha9;Lt9d;Lmew;)F
      // 68: iload 3
      // 69: bipush 1
      // 6a: iadd
      // 6b: i2f
      // 6c: fmul
      // 6d: fstore 5
      // 6f: fload 5
      // 71: ldc 0.7
      // 73: nop
      // 74: fcmpl
      // 75: iload 2
      // 76: ifne bf
      // 79: iflt a9
      // 7c: goto 83
      // 7f: invokestatic rsh.b (Loov;)Loov;
      // 82: athrow
      // 83: aload 0
      // 84: bipush 0
      // 85: putfield rsh.vzv Z
      // 88: aload 0
      // 89: getfield rsh.bk1 Lt9d;
      // 8c: aload 0
      // 8d: getfield rsh.rpl Lz96;
      // 90: invokevirtual z96.jwu ()I
      // 93: aload 1
      // 94: bipush -1
      // 95: invokevirtual OpaquePredicate.vn_ (ILmew;I)V
      // 98: aload 0
      // 99: aload 1
      // 9a: invokevirtual rsh.s4o (Lmew;)Z
      // 9d: pop
      // 9e: iload 2
      // 9f: ifeq e0
      // a2: goto a9
      // a5: invokestatic rsh.b (Loov;)Loov;
      // a8: athrow
      // a9: aload 0
      // aa: iload 2
      // ab: ifne d9
      // ae: goto b5
      // b1: invokestatic rsh.b (Loov;)Loov;
      // b4: athrow
      // b5: getfield rsh.wo0 Z
      // b8: goto bf
      // bb: invokestatic rsh.b (Loov;)Loov;
      // be: athrow
      // bf: ifne e0
      // c2: aload 0
      // c3: bipush 0
      // c4: putfield rsh.vzv Z
      // c7: aload 0
      // c8: bipush 1
      // c9: putfield rsh.wo0 Z
      // cc: aload 0
      // cd: aload 1
      // ce: putfield rsh.u0t Lmew;
      // d1: aload 0
      // d2: goto d9
      // d5: invokestatic rsh.b (Loov;)Loov;
      // d8: athrow
      // d9: aload 0
      // da: getfield rsh.ol7 I
      // dd: putfield rsh.bkz I
      // e0: return
   }

   public void d53() {
      this.vzv = false;
      this.bk1.vn_(this.rpl.jwu(), this._ml, -1);
   }

   private boolean x5b(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rsh.bk1 Lt9d;
      // 04: aload 1
      // 05: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 08: astore 3
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 3
      // 0d: invokeinterface zfz.r_y ()Le0x; 1
      // 12: aload 0
      // 13: getfield rsh.bk1 Lt9d;
      // 16: aload 1
      // 17: aload 3
      // 18: aload 0
      // 19: getfield rsh.rpl Lz96;
      // 1c: invokevirtual e0x.f51 (Lt9d;Lmew;Lzfz;Lha9;)V
      // 1f: aload 0
      // 20: getfield rsh.bk1 Lt9d;
      // 23: aload 1
      // 24: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 27: istore 4
      // 29: istore 2
      // 2a: iload 4
      // 2c: iload 2
      // 2d: ifeq 52
      // 30: ifeq 50
      // 33: goto 3a
      // 36: invokestatic rsh.b (Loov;)Loov;
      // 39: athrow
      // 3a: aload 3
      // 3b: invokeinterface zfz.r_y ()Le0x; 1
      // 40: aload 0
      // 41: getfield rsh.bk1 Lt9d;
      // 44: aload 1
      // 45: aload 3
      // 46: invokevirtual e0x.bf0 (Lt9d;Lmew;Lzfz;)V
      // 49: goto 50
      // 4c: invokestatic rsh.b (Loov;)Loov;
      // 4f: athrow
      // 50: iload 4
      // 52: ireturn
   }

   public boolean s4o(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 05e
      // 009: getfield rsh.ox_ Lh50$f05;
      // 00c: invokevirtual h50$f05.zlv ()Z
      // 00f: ifeq 05d
      // 012: goto 019
      // 015: invokestatic rsh.b (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 2
      // 01b: ifeq 05e
      // 01e: goto 025
      // 021: invokestatic rsh.b (Loov;)Loov;
      // 024: athrow
      // 025: getfield rsh.rpl Lz96;
      // 028: invokevirtual z96.tsc ()Lerg;
      // 02b: ifnull 05d
      // 02e: goto 035
      // 031: invokestatic rsh.b (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: iload 2
      // 037: ifeq 05e
      // 03a: goto 041
      // 03d: invokestatic rsh.b (Loov;)Loov;
      // 040: athrow
      // 041: getfield rsh.rpl Lz96;
      // 044: invokevirtual z96.tsc ()Lerg;
      // 047: invokevirtual erg.gn1 ()Lu7m;
      // 04a: instanceof za6
      // 04d: ifeq 05d
      // 050: goto 057
      // 053: invokestatic rsh.b (Loov;)Loov;
      // 056: athrow
      // 057: bipush 0
      // 058: ireturn
      // 059: invokestatic rsh.b (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield rsh.bk1 Lt9d;
      // 061: aload 1
      // 062: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 065: astore 3
      // 066: aload 0
      // 067: getfield rsh.bk1 Lt9d;
      // 06a: aload 1
      // 06b: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 06e: astore 4
      // 070: aload 0
      // 071: getfield rsh.ox_ Lh50$f05;
      // 074: invokevirtual h50$f05.p98 ()Z
      // 077: iload 2
      // 078: ifeq 112
      // 07b: ifeq 0fa
      // 07e: goto 085
      // 081: invokestatic rsh.b (Loov;)Loov;
      // 084: athrow
      // 085: aload 0
      // 086: iload 2
      // 087: ifeq 0a8
      // 08a: goto 091
      // 08d: invokestatic rsh.b (Loov;)Loov;
      // 090: athrow
      // 091: getfield rsh.ox_ Lh50$f05;
      // 094: getstatic h50$f05.l18 Lh50$f05;
      // 097: if_acmpne 0a7
      // 09a: goto 0a1
      // 09d: invokestatic rsh.b (Loov;)Loov;
      // 0a0: athrow
      // 0a1: bipush 0
      // 0a2: ireturn
      // 0a3: invokestatic rsh.b (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield rsh.rpl Lz96;
      // 0ab: invokevirtual z96.gt3 ()Z
      // 0ae: iload 2
      // 0af: ifeq 112
      // 0b2: ifne 0fa
      // 0b5: goto 0bc
      // 0b8: invokestatic rsh.b (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield rsh.rpl Lz96;
      // 0c0: invokevirtual z96.b5z ()Lerg;
      // 0c3: astore 5
      // 0c5: aload 5
      // 0c7: iload 2
      // 0c8: ifeq 0dd
      // 0cb: ifnonnull 0db
      // 0ce: goto 0d5
      // 0d1: invokestatic rsh.b (Loov;)Loov;
      // 0d4: athrow
      // 0d5: bipush 0
      // 0d6: ireturn
      // 0d7: invokestatic rsh.b (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 5
      // 0dd: aload 3
      // 0de: invokeinterface zfz.r_y ()Le0x; 1
      // 0e3: invokevirtual erg.pgf (Le0x;)Z
      // 0e6: iload 2
      // 0e7: ifeq 112
      // 0ea: ifne 0fa
      // 0ed: goto 0f4
      // 0f0: invokestatic rsh.b (Loov;)Loov;
      // 0f3: athrow
      // 0f4: bipush 0
      // 0f5: ireturn
      // 0f6: invokestatic rsh.b (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: getfield rsh.bk1 Lt9d;
      // 0fe: aload 0
      // 0ff: getfield rsh.rpl Lz96;
      // 102: sipush 2001
      // 105: aload 1
      // 106: aload 3
      // 107: invokestatic e0x.r2y (Lzfz;)I
      // 10a: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // 10d: aload 0
      // 10e: aload 1
      // 10f: invokespecial rsh.x5b (Lmew;)Z
      // 112: istore 5
      // 114: aload 0
      // 115: iload 2
      // 116: ifeq 14f
      // 119: invokevirtual rsh.u7c ()Z
      // 11c: ifeq 147
      // 11f: goto 126
      // 122: invokestatic rsh.b (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: getfield rsh.rpl Lz96;
      // 12a: getfield z96.rhh Lmlk;
      // 12d: new net/minecraft/network/play/server/S23PacketBlockChange
      // 130: dup
      // 131: aload 0
      // 132: getfield rsh.bk1 Lt9d;
      // 135: aload 1
      // 136: invokespecial net/minecraft/network/play/server/S23PacketBlockChange.<init> (Lt9d;Lmew;)V
      // 139: invokevirtual mlk.vnf (Lmz2;)V
      // 13c: iload 2
      // 13d: ifne 1f5
      // 140: goto 147
      // 143: invokestatic rsh.b (Loov;)Loov;
      // 146: athrow
      // 147: aload 0
      // 148: goto 14f
      // 14b: invokestatic rsh.b (Loov;)Loov;
      // 14e: athrow
      // 14f: getfield rsh.rpl Lz96;
      // 152: invokevirtual z96.b5z ()Lerg;
      // 155: astore 6
      // 157: aload 0
      // 158: getfield rsh.rpl Lz96;
      // 15b: aload 3
      // 15c: invokeinterface zfz.r_y ()Le0x; 1
      // 161: invokevirtual z96.vc_ (Le0x;)Z
      // 164: istore 7
      // 166: aload 6
      // 168: iload 2
      // 169: ifeq 193
      // 16c: ifnull 1b2
      // 16f: goto 176
      // 172: invokestatic rsh.b (Loov;)Loov;
      // 175: athrow
      // 176: aload 6
      // 178: aload 0
      // 179: getfield rsh.bk1 Lt9d;
      // 17c: aload 3
      // 17d: invokeinterface zfz.r_y ()Le0x; 1
      // 182: aload 1
      // 183: aload 0
      // 184: getfield rsh.rpl Lz96;
      // 187: invokevirtual erg.yu9 (Lt9d;Le0x;Lmew;Lha9;)V
      // 18a: aload 6
      // 18c: goto 193
      // 18f: invokestatic rsh.b (Loov;)Loov;
      // 192: athrow
      // 193: getfield erg.qd2 I
      // 196: iload 2
      // 197: ifeq 1b4
      // 19a: ifne 1b2
      // 19d: goto 1a4
      // 1a0: invokestatic rsh.b (Loov;)Loov;
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: getfield rsh.rpl Lz96;
      // 1a8: invokevirtual z96.gwo ()V
      // 1ab: goto 1b2
      // 1ae: invokestatic rsh.b (Loov;)Loov;
      // 1b1: athrow
      // 1b2: iload 5
      // 1b4: iload 2
      // 1b5: ifeq 1f7
      // 1b8: ifeq 1f5
      // 1bb: goto 1c2
      // 1be: invokestatic rsh.b (Loov;)Loov;
      // 1c1: athrow
      // 1c2: iload 7
      // 1c4: iload 2
      // 1c5: ifeq 1f7
      // 1c8: goto 1cf
      // 1cb: invokestatic rsh.b (Loov;)Loov;
      // 1ce: athrow
      // 1cf: ifeq 1f5
      // 1d2: goto 1d9
      // 1d5: invokestatic rsh.b (Loov;)Loov;
      // 1d8: athrow
      // 1d9: aload 3
      // 1da: invokeinterface zfz.r_y ()Le0x; 1
      // 1df: aload 0
      // 1e0: getfield rsh.bk1 Lt9d;
      // 1e3: aload 0
      // 1e4: getfield rsh.rpl Lz96;
      // 1e7: aload 1
      // 1e8: aload 3
      // 1e9: aload 4
      // 1eb: invokevirtual e0x.i4u (Lt9d;Lha9;Lmew;Lzfz;Lpyk;)V
      // 1ee: goto 1f5
      // 1f1: invokestatic rsh.b (Loov;)Loov;
      // 1f4: athrow
      // 1f5: iload 5
      // 1f7: ireturn
   }

   public boolean mn_(ha9 param1, OpaquePredicate param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield rsh.ox_ Lh50$f05;
      // 009: getstatic h50$f05.l18 Lh50$f05;
      // 00c: if_acmpne 015
      // 00f: bipush 0
      // 010: ireturn
      // 011: invokestatic rsh.b (Loov;)Loov;
      // 014: athrow
      // 015: aload 3
      // 016: getfield erg.qd2 I
      // 019: istore 5
      // 01b: aload 3
      // 01c: invokevirtual erg.j6_ ()I
      // 01f: istore 6
      // 021: aload 3
      // 022: aload 2
      // 023: aload 1
      // 024: invokevirtual erg.vwi (Lt9d;Lha9;)Lerg;
      // 027: astore 7
      // 029: iload 4
      // 02b: ifeq 0b9
      // 02e: aload 7
      // 030: aload 3
      // 031: if_acmpne 0a1
      // 034: goto 03b
      // 037: invokestatic rsh.b (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 7
      // 03d: iload 4
      // 03f: ifeq 055
      // 042: goto 049
      // 045: invokestatic rsh.b (Loov;)Loov;
      // 048: athrow
      // 049: ifnull 14e
      // 04c: goto 053
      // 04f: invokestatic rsh.b (Loov;)Loov;
      // 052: athrow
      // 053: aload 7
      // 055: getfield erg.qd2 I
      // 058: iload 4
      // 05a: ifeq 0bd
      // 05d: iload 5
      // 05f: if_icmpne 0a1
      // 062: goto 069
      // 065: invokestatic rsh.b (Loov;)Loov;
      // 068: athrow
      // 069: aload 7
      // 06b: invokevirtual erg.ifg ()I
      // 06e: iload 4
      // 070: ifeq 0bd
      // 073: goto 07a
      // 076: invokestatic rsh.b (Loov;)Loov;
      // 079: athrow
      // 07a: ifgt 0a1
      // 07d: goto 084
      // 080: invokestatic rsh.b (Loov;)Loov;
      // 083: athrow
      // 084: aload 7
      // 086: invokevirtual erg.j6_ ()I
      // 089: iload 4
      // 08b: ifeq 14f
      // 08e: goto 095
      // 091: invokestatic rsh.b (Loov;)Loov;
      // 094: athrow
      // 095: iload 6
      // 097: if_icmpeq 14e
      // 09a: goto 0a1
      // 09d: invokestatic rsh.b (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 1
      // 0a2: getfield ha9.up_ Ljnq;
      // 0a5: getfield jnq.c41 [Lerg;
      // 0a8: aload 1
      // 0a9: getfield ha9.up_ Ljnq;
      // 0ac: getfield jnq.nb5 I
      // 0af: aload 7
      // 0b1: aastore
      // 0b2: goto 0b9
      // 0b5: invokestatic rsh.b (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: invokevirtual rsh.u7c ()Z
      // 0bd: iload 4
      // 0bf: ifeq 101
      // 0c2: ifeq 0fc
      // 0c5: goto 0cc
      // 0c8: invokestatic rsh.b (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 7
      // 0ce: iload 5
      // 0d0: putfield erg.qd2 I
      // 0d3: aload 7
      // 0d5: invokevirtual erg.dw2 ()Z
      // 0d8: iload 4
      // 0da: ifeq 101
      // 0dd: goto 0e4
      // 0e0: invokestatic rsh.b (Loov;)Loov;
      // 0e3: athrow
      // 0e4: ifeq 0fc
      // 0e7: goto 0ee
      // 0ea: invokestatic rsh.b (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 7
      // 0f0: iload 6
      // 0f2: invokevirtual erg.awe (I)V
      // 0f5: goto 0fc
      // 0f8: invokestatic rsh.b (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 7
      // 0fe: getfield erg.qd2 I
      // 101: iload 4
      // 103: ifeq 12b
      // 106: ifne 127
      // 109: goto 110
      // 10c: invokestatic rsh.b (Loov;)Loov;
      // 10f: athrow
      // 110: aload 1
      // 111: getfield ha9.up_ Ljnq;
      // 114: getfield jnq.c41 [Lerg;
      // 117: aload 1
      // 118: getfield ha9.up_ Ljnq;
      // 11b: getfield jnq.nb5 I
      // 11e: aconst_null
      // 11f: aastore
      // 120: goto 127
      // 123: invokestatic rsh.b (Loov;)Loov;
      // 126: athrow
      // 127: aload 1
      // 128: invokevirtual ha9.kqa ()Z
      // 12b: iload 4
      // 12d: ifeq 14d
      // 130: ifne 14c
      // 133: goto 13a
      // 136: invokestatic rsh.b (Loov;)Loov;
      // 139: athrow
      // 13a: aload 1
      // 13b: checkcast z96
      // 13e: aload 1
      // 13f: getfield ha9.fv9 L_jc;
      // 142: invokevirtual z96.u1s (L_jc;)V
      // 145: goto 14c
      // 148: invokestatic rsh.b (Loov;)Loov;
      // 14b: athrow
      // 14c: bipush 1
      // 14d: ireturn
      // 14e: bipush 0
      // 14f: ireturn
   }

   public boolean nh0(ha9 param1, OpaquePredicate param2, erg param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 9
      // 005: aload 0
      // 006: getfield rsh.ox_ Lh50$f05;
      // 009: getstatic h50$f05.l18 Lh50$f05;
      // 00c: if_acmpne 0c4
      // 00f: aload 2
      // 010: aload 4
      // 012: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 015: astore 10
      // 017: aload 10
      // 019: instanceof fl3
      // 01c: iload 9
      // 01e: ifeq 0a4
      // 021: ifeq 098
      // 024: goto 02b
      // 027: invokestatic rsh.b (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 2
      // 02c: aload 4
      // 02e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 031: invokeinterface zfz.r_y ()Le0x; 1
      // 036: astore 11
      // 038: aload 10
      // 03a: checkcast fl3
      // 03d: astore 12
      // 03f: aload 12
      // 041: iload 9
      // 043: ifeq 084
      // 046: instanceof net/minecraft/tileentity/TileEntityChest
      // 049: ifeq 082
      // 04c: goto 053
      // 04f: invokestatic rsh.b (Loov;)Loov;
      // 052: athrow
      // 053: aload 11
      // 055: iload 9
      // 057: ifeq 077
      // 05a: goto 061
      // 05d: invokestatic rsh.b (Loov;)Loov;
      // 060: athrow
      // 061: instanceof hrd
      // 064: ifeq 082
      // 067: goto 06e
      // 06a: invokestatic rsh.b (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 11
      // 070: goto 077
      // 073: invokestatic rsh.b (Loov;)Loov;
      // 076: athrow
      // 077: checkcast hrd
      // 07a: aload 2
      // 07b: aload 4
      // 07d: invokevirtual hrd.ffe (Lt9d;Lmew;)Lfl3;
      // 080: astore 12
      // 082: aload 12
      // 084: ifnull 093
      // 087: aload 1
      // 088: aload 12
      // 08a: invokevirtual ha9.a_o (Lrsi;)V
      // 08d: bipush 1
      // 08e: ireturn
      // 08f: invokestatic rsh.b (Loov;)Loov;
      // 092: athrow
      // 093: iload 9
      // 095: ifne 0c2
      // 098: aload 10
      // 09a: instanceof rsi
      // 09d: goto 0a4
      // 0a0: invokestatic rsh.b (Loov;)Loov;
      // 0a3: athrow
      // 0a4: iload 9
      // 0a6: ifeq 0c3
      // 0a9: ifeq 0c2
      // 0ac: goto 0b3
      // 0af: invokestatic rsh.b (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: aload 10
      // 0b6: checkcast rsi
      // 0b9: invokevirtual ha9.a_o (Lrsi;)V
      // 0bc: bipush 1
      // 0bd: ireturn
      // 0be: invokestatic rsh.b (Loov;)Loov;
      // 0c1: athrow
      // 0c2: bipush 0
      // 0c3: ireturn
      // 0c4: aload 1
      // 0c5: iload 9
      // 0c7: ifeq 0df
      // 0ca: invokevirtual ha9.hzv ()Z
      // 0cd: ifeq 0f1
      // 0d0: goto 0d7
      // 0d3: invokestatic rsh.b (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: goto 0df
      // 0db: invokestatic rsh.b (Loov;)Loov;
      // 0de: athrow
      // 0df: invokevirtual ha9.tsc ()Lerg;
      // 0e2: iload 9
      // 0e4: ifeq 123
      // 0e7: ifnonnull 122
      // 0ea: goto 0f1
      // 0ed: invokestatic rsh.b (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: aload 4
      // 0f4: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0f7: astore 10
      // 0f9: aload 10
      // 0fb: invokeinterface zfz.r_y ()Le0x; 1
      // 100: aload 2
      // 101: aload 4
      // 103: aload 10
      // 105: aload 1
      // 106: aload 5
      // 108: fload 6
      // 10a: fload 7
      // 10c: fload 8
      // 10e: invokevirtual e0x.cl2 (Lt9d;Lmew;Lzfz;Lha9;Lvt2;FFF)Z
      // 111: iload 9
      // 113: ifeq 121
      // 116: ifeq 122
      // 119: goto 120
      // 11c: invokestatic rsh.b (Loov;)Loov;
      // 11f: athrow
      // 120: bipush 1
      // 121: ireturn
      // 122: aload 3
      // 123: ifnonnull 12c
      // 126: bipush 0
      // 127: ireturn
      // 128: invokestatic rsh.b (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: invokevirtual rsh.u7c ()Z
      // 130: iload 9
      // 132: ifeq 17c
      // 135: ifeq 16c
      // 138: goto 13f
      // 13b: invokestatic rsh.b (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 3
      // 140: invokevirtual erg.j6_ ()I
      // 143: istore 10
      // 145: aload 3
      // 146: getfield erg.qd2 I
      // 149: istore 11
      // 14b: aload 3
      // 14c: aload 1
      // 14d: aload 2
      // 14e: aload 4
      // 150: aload 5
      // 152: fload 6
      // 154: fload 7
      // 156: fload 8
      // 158: invokevirtual erg.l3w (Lha9;Lt9d;Lmew;Lvt2;FFF)Z
      // 15b: istore 12
      // 15d: aload 3
      // 15e: iload 10
      // 160: invokevirtual erg.awe (I)V
      // 163: aload 3
      // 164: iload 11
      // 166: putfield erg.qd2 I
      // 169: iload 12
      // 16b: ireturn
      // 16c: aload 3
      // 16d: aload 1
      // 16e: aload 2
      // 16f: aload 4
      // 171: aload 5
      // 173: fload 6
      // 175: fload 7
      // 177: fload 8
      // 179: invokevirtual erg.l3w (Lha9;Lt9d;Lmew;Lvt2;FFF)Z
      // 17c: ireturn
   }

   public void nzt(dug var1) {
      this.bk1 = var1;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
