import com.google.common.collect.Lists;
import java.util.List;

public class gkx extends dxd {
   private final List hwk = Lists.newArrayList();
   private final pni bpr = new pni();
   private final List wwi = Lists.newArrayList();
   private final gkx$nul[][] d4e;
   private int hs2;
   private gkx$lpc nrn;
   private b0t puz;

   public gkx(Minecraft var1, int var2, int var3, int var4, int var5, int var6, gkx$lpc var7, gkx$nul[][] var8) {
      super(var1, var2, var3, var4, var5, var6);
      this.nrn = var7;
      this.d4e = var8;
      this.n05 = false;
      this.vzu();
      this.wcs();
   }

   private void vzu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield gkx.d4e [[Lgkx$nul;
      // 004: astore 2
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: aload 2
      // 009: arraylength
      // 00a: istore 3
      // 00b: istore 1
      // 00c: bipush 0
      // 00d: istore 4
      // 00f: iload 4
      // 011: iload 3
      // 012: if_icmpge 162
      // 015: aload 2
      // 016: iload 4
      // 018: aaload
      // 019: astore 5
      // 01b: bipush 0
      // 01c: istore 6
      // 01e: iload 6
      // 020: aload 5
      // 022: arraylength
      // 023: if_icmpge 15b
      // 026: aload 5
      // 028: iload 6
      // 02a: aaload
      // 02b: astore 7
      // 02d: iload 6
      // 02f: aload 5
      // 031: arraylength
      // 032: bipush 1
      // 033: isub
      // 034: iload 1
      // 035: ifne 012
      // 038: if_icmpge 049
      // 03b: aload 5
      // 03d: iload 6
      // 03f: bipush 1
      // 040: iadd
      // 041: aaload
      // 042: goto 04a
      // 045: invokestatic gkx.c (Loov;)Loov;
      // 048: athrow
      // 049: aconst_null
      // 04a: astore 8
      // 04c: aload 0
      // 04d: aload 7
      // 04f: bipush 0
      // 050: aload 8
      // 052: ifnonnull 05d
      // 055: bipush 1
      // 056: goto 05e
      // 059: invokestatic gkx.c (Loov;)Loov;
      // 05c: athrow
      // 05d: bipush 0
      // 05e: invokespecial gkx.sft (Lgkx$nul;IZ)Lb0t;
      // 061: astore 9
      // 063: aload 0
      // 064: aload 8
      // 066: sipush 160
      // 069: aload 7
      // 06b: ifnonnull 076
      // 06e: bipush 1
      // 06f: goto 077
      // 072: invokestatic gkx.c (Loov;)Loov;
      // 075: athrow
      // 076: bipush 0
      // 077: invokespecial gkx.sft (Lgkx$nul;IZ)Lb0t;
      // 07a: astore 10
      // 07c: new gkx$kyg
      // 07f: dup
      // 080: aload 9
      // 082: aload 10
      // 084: invokespecial gkx$kyg.<init> (Lb0t;Lb0t;)V
      // 087: astore 11
      // 089: aload 0
      // 08a: getfield gkx.hwk Ljava/util/List;
      // 08d: aload 11
      // 08f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 094: pop
      // 095: aload 7
      // 097: iload 1
      // 098: ifne 0fc
      // 09b: ifnull 0fa
      // 09e: goto 0a5
      // 0a1: invokestatic gkx.c (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 9
      // 0a7: iload 1
      // 0a8: ifne 0d3
      // 0ab: goto 0b2
      // 0ae: invokestatic gkx.c (Loov;)Loov;
      // 0b1: athrow
      // 0b2: ifnull 0fa
      // 0b5: goto 0bc
      // 0b8: invokestatic gkx.c (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield gkx.bpr Lpni;
      // 0c0: aload 7
      // 0c2: invokevirtual gkx$nul.j8v ()I
      // 0c5: aload 9
      // 0c7: invokevirtual pni.yfe (ILjava/lang/Object;)V
      // 0ca: aload 9
      // 0cc: goto 0d3
      // 0cf: invokestatic gkx.c (Loov;)Loov;
      // 0d2: athrow
      // 0d3: instanceof jqk
      // 0d6: iload 1
      // 0d7: ifne 0f9
      // 0da: ifeq 0fa
      // 0dd: goto 0e4
      // 0e0: invokestatic gkx.c (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield gkx.wwi Ljava/util/List;
      // 0e8: aload 9
      // 0ea: checkcast jqk
      // 0ed: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f2: goto 0f9
      // 0f5: invokestatic gkx.c (Loov;)Loov;
      // 0f8: athrow
      // 0f9: pop
      // 0fa: aload 8
      // 0fc: ifnull 154
      // 0ff: aload 10
      // 101: iload 1
      // 102: ifne 138
      // 105: goto 10c
      // 108: invokestatic gkx.c (Loov;)Loov;
      // 10b: athrow
      // 10c: ifnull 154
      // 10f: goto 116
      // 112: invokestatic gkx.c (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: getfield gkx.bpr Lpni;
      // 11a: aload 8
      // 11c: invokevirtual gkx$nul.j8v ()I
      // 11f: aload 10
      // 121: invokevirtual pni.yfe (ILjava/lang/Object;)V
      // 124: iload 1
      // 125: ifne 157
      // 128: goto 12f
      // 12b: invokestatic gkx.c (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 10
      // 131: goto 138
      // 134: invokestatic gkx.c (Loov;)Loov;
      // 137: athrow
      // 138: instanceof jqk
      // 13b: ifeq 154
      // 13e: aload 0
      // 13f: getfield gkx.wwi Ljava/util/List;
      // 142: aload 10
      // 144: checkcast jqk
      // 147: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14c: pop
      // 14d: goto 154
      // 150: invokestatic gkx.c (Loov;)Loov;
      // 153: athrow
      // 154: iinc 6 2
      // 157: iload 1
      // 158: ifeq 01e
      // 15b: iinc 4 1
      // 15e: iload 1
      // 15f: ifeq 00f
      // 162: return
   }

   private void wcs() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield gkx.hwk Ljava/util/List;
      // 04: invokeinterface java/util/List.clear ()V 1
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: bipush 0
      // 0d: istore 2
      // 0e: istore 1
      // 0f: iload 2
      // 10: aload 0
      // 11: getfield gkx.d4e [[Lgkx$nul;
      // 14: aload 0
      // 15: getfield gkx.hs2 I
      // 18: aaload
      // 19: arraylength
      // 1a: if_icmpge ac
      // 1d: aload 0
      // 1e: getfield gkx.d4e [[Lgkx$nul;
      // 21: aload 0
      // 22: getfield gkx.hs2 I
      // 25: aaload
      // 26: iload 2
      // 27: aaload
      // 28: astore 3
      // 29: iload 2
      // 2a: aload 0
      // 2b: getfield gkx.d4e [[Lgkx$nul;
      // 2e: aload 0
      // 2f: getfield gkx.hs2 I
      // 32: aaload
      // 33: arraylength
      // 34: bipush 1
      // 35: isub
      // 36: if_icmpge 4d
      // 39: aload 0
      // 3a: getfield gkx.d4e [[Lgkx$nul;
      // 3d: aload 0
      // 3e: getfield gkx.hs2 I
      // 41: aaload
      // 42: iload 2
      // 43: bipush 1
      // 44: iadd
      // 45: aaload
      // 46: goto 4e
      // 49: invokestatic gkx.c (Loov;)Loov;
      // 4c: athrow
      // 4d: aconst_null
      // 4e: astore 4
      // 50: aload 0
      // 51: getfield gkx.bpr Lpni;
      // 54: aload 3
      // 55: invokevirtual gkx$nul.j8v ()I
      // 58: invokevirtual pni.ij8 (I)Ljava/lang/Object;
      // 5b: checkcast b0t
      // 5e: astore 5
      // 60: aload 4
      // 62: iload 1
      // 63: ifeq 83
      // 66: ifnull 89
      // 69: goto 70
      // 6c: invokestatic gkx.c (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield gkx.bpr Lpni;
      // 74: aload 4
      // 76: invokevirtual gkx$nul.j8v ()I
      // 79: invokevirtual pni.ij8 (I)Ljava/lang/Object;
      // 7c: goto 83
      // 7f: invokestatic gkx.c (Loov;)Loov;
      // 82: athrow
      // 83: checkcast b0t
      // 86: goto 8a
      // 89: aconst_null
      // 8a: astore 6
      // 8c: new gkx$kyg
      // 8f: dup
      // 90: aload 5
      // 92: aload 6
      // 94: invokespecial gkx$kyg.<init> (Lb0t;Lb0t;)V
      // 97: astore 7
      // 99: aload 0
      // 9a: getfield gkx.hwk Ljava/util/List;
      // 9d: aload 7
      // 9f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a4: pop
      // a5: iinc 2 2
      // a8: iload 1
      // a9: ifne 0f
      // ac: return
   }

   public void pxr(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 22
      // 09: aload 0
      // 0a: getfield gkx.hs2 I
      // 0d: if_icmpeq 37
      // 10: goto 17
      // 13: invokestatic gkx.c (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield gkx.hs2 I
      // 1b: goto 22
      // 1e: invokestatic gkx.c (Loov;)Loov;
      // 21: athrow
      // 22: istore 3
      // 23: aload 0
      // 24: iload 1
      // 25: putfield gkx.hs2 I
      // 28: aload 0
      // 29: invokespecial gkx.wcs ()V
      // 2c: aload 0
      // 2d: iload 3
      // 2e: iload 1
      // 2f: invokespecial gkx.cpy (II)V
      // 32: aload 0
      // 33: fconst_0
      // 34: putfield gkx.fx8 F
      // 37: return
   }

   public int up5() {
      return this.hs2;
   }

   public int uwj() {
      return this.d4e.length;
   }

   public b0t z0t() {
      return this.puz;
   }

   public void m8a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 1e
      // 09: getfield gkx.hs2 I
      // 0c: ifle 27
      // 0f: goto 16
      // 12: invokestatic gkx.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic gkx.c (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield gkx.hs2 I
      // 22: bipush 1
      // 23: isub
      // 24: invokevirtual gkx.pxr (I)V
      // 27: return
   }

   public void usq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 25
      // 09: getfield gkx.hs2 I
      // 0c: aload 0
      // 0d: getfield gkx.d4e [[Lgkx$nul;
      // 10: arraylength
      // 11: bipush 1
      // 12: isub
      // 13: if_icmpge 2e
      // 16: goto 1d
      // 19: invokestatic gkx.c (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: goto 25
      // 21: invokestatic gkx.c (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield gkx.hs2 I
      // 29: bipush 1
      // 2a: iadd
      // 2b: invokevirtual gkx.pxr (I)V
      // 2e: return
   }

   public b0t qph(int var1) {
      return (b0t)this.bpr.ij8(var1);
   }

   private void cpy(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield gkx.d4e [[Lgkx$nul;
      // 04: iload 1
      // 05: aaload
      // 06: astore 4
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 4
      // 0d: arraylength
      // 0e: istore 5
      // 10: bipush 0
      // 11: istore 6
      // 13: istore 3
      // 14: iload 6
      // 16: iload 5
      // 18: if_icmpge 5f
      // 1b: aload 4
      // 1d: iload 6
      // 1f: aaload
      // 20: astore 7
      // 22: iload 3
      // 23: ifne 5b
      // 26: aload 7
      // 28: iload 3
      // 29: ifne 8a
      // 2c: goto 33
      // 2f: invokestatic gkx.c (Loov;)Loov;
      // 32: athrow
      // 33: ifnull 58
      // 36: goto 3d
      // 39: invokestatic gkx.c (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 0
      // 3f: getfield gkx.bpr Lpni;
      // 42: aload 7
      // 44: invokevirtual gkx$nul.j8v ()I
      // 47: invokevirtual pni.ij8 (I)Ljava/lang/Object;
      // 4a: checkcast b0t
      // 4d: bipush 0
      // 4e: invokespecial gkx.fcz (Lb0t;Z)V
      // 51: goto 58
      // 54: invokestatic gkx.c (Loov;)Loov;
      // 57: athrow
      // 58: iinc 6 1
      // 5b: iload 3
      // 5c: ifeq 14
      // 5f: aload 0
      // 60: getfield gkx.d4e [[Lgkx$nul;
      // 63: iload 2
      // 64: aaload
      // 65: astore 4
      // 67: aload 4
      // 69: arraylength
      // 6a: istore 5
      // 6c: bipush 0
      // 6d: istore 6
      // 6f: iload 6
      // 71: iload 5
      // 73: if_icmpge af
      // 76: aload 4
      // 78: iload 6
      // 7a: aaload
      // 7b: astore 7
      // 7d: iload 3
      // 7e: ifne ab
      // 81: aload 7
      // 83: goto 8a
      // 86: invokestatic gkx.c (Loov;)Loov;
      // 89: athrow
      // 8a: ifnull a8
      // 8d: aload 0
      // 8e: aload 0
      // 8f: getfield gkx.bpr Lpni;
      // 92: aload 7
      // 94: invokevirtual gkx$nul.j8v ()I
      // 97: invokevirtual pni.ij8 (I)Ljava/lang/Object;
      // 9a: checkcast b0t
      // 9d: bipush 1
      // 9e: invokespecial gkx.fcz (Lb0t;Z)V
      // a1: goto a8
      // a4: invokestatic gkx.c (Loov;)Loov;
      // a7: athrow
      // a8: iinc 6 1
      // ab: iload 3
      // ac: ifeq 6f
      // af: return
   }

   private void fcz(b0t param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: instanceof gt4
      // 08: iload 3
      // 09: ifeq 34
      // 0c: ifeq 29
      // 0f: goto 16
      // 12: invokestatic gkx.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast gt4
      // 1a: iload 2
      // 1b: putfield gt4.c1s Z
      // 1e: iload 3
      // 1f: ifne 76
      // 22: goto 29
      // 25: invokestatic gkx.c (Loov;)Loov;
      // 28: athrow
      // 29: aload 1
      // 2a: instanceof jqk
      // 2d: goto 34
      // 30: invokestatic gkx.c (Loov;)Loov;
      // 33: athrow
      // 34: iload 3
      // 35: ifeq 6b
      // 38: ifeq 55
      // 3b: goto 42
      // 3e: invokestatic gkx.c (Loov;)Loov;
      // 41: athrow
      // 42: aload 1
      // 43: checkcast jqk
      // 46: iload 2
      // 47: invokevirtual jqk.qo7 (Z)V
      // 4a: iload 3
      // 4b: ifne 76
      // 4e: goto 55
      // 51: invokestatic gkx.c (Loov;)Loov;
      // 54: athrow
      // 55: aload 1
      // 56: iload 3
      // 57: ifeq 6f
      // 5a: goto 61
      // 5d: invokestatic gkx.c (Loov;)Loov;
      // 60: athrow
      // 61: instanceof p6a
      // 64: goto 6b
      // 67: invokestatic gkx.c (Loov;)Loov;
      // 6a: athrow
      // 6b: ifeq 76
      // 6e: aload 1
      // 6f: checkcast p6a
      // 72: iload 2
      // 73: putfield p6a.xiq Z
      // 76: return
   }

   private b0t sft(gkx$nul param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: instanceof gkx$wuo
      // 09: iload 4
      // 0b: ifne 38
      // 0e: ifeq 34
      // 11: goto 18
      // 14: invokestatic gkx.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 0
      // 1a: getfield gkx.wde I
      // 1d: bipush 2
      // 1e: idiv
      // 1f: sipush 155
      // 22: isub
      // 23: iload 2
      // 24: iadd
      // 25: bipush 0
      // 26: aload 1
      // 27: checkcast gkx$wuo
      // 2a: invokespecial gkx.wni (IILgkx$wuo;)Lscc;
      // 2d: goto b7
      // 30: invokestatic gkx.c (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: instanceof gkx$uc2
      // 38: iload 4
      // 3a: ifne 67
      // 3d: ifeq 63
      // 40: goto 47
      // 43: invokestatic gkx.c (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: aload 0
      // 49: getfield gkx.wde I
      // 4c: bipush 2
      // 4d: idiv
      // 4e: sipush 155
      // 51: isub
      // 52: iload 2
      // 53: iadd
      // 54: bipush 0
      // 55: aload 1
      // 56: checkcast gkx$uc2
      // 59: invokespecial gkx.avy (IILgkx$uc2;)Ljhy;
      // 5c: goto b7
      // 5f: invokestatic gkx.c (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: instanceof gkx$plo
      // 67: iload 4
      // 69: ifne 96
      // 6c: ifeq 92
      // 6f: goto 76
      // 72: invokestatic gkx.c (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: aload 0
      // 78: getfield gkx.wde I
      // 7b: bipush 2
      // 7c: idiv
      // 7d: sipush 155
      // 80: isub
      // 81: iload 2
      // 82: iadd
      // 83: bipush 0
      // 84: aload 1
      // 85: checkcast gkx$plo
      // 88: invokespecial gkx.cru (IILgkx$plo;)Ljqk;
      // 8b: goto b7
      // 8e: invokestatic gkx.c (Loov;)Loov;
      // 91: athrow
      // 92: aload 1
      // 93: instanceof gkx$c2g
      // 96: ifeq b6
      // 99: aload 0
      // 9a: aload 0
      // 9b: getfield gkx.wde I
      // 9e: bipush 2
      // 9f: idiv
      // a0: sipush 155
      // a3: isub
      // a4: iload 2
      // a5: iadd
      // a6: bipush 0
      // a7: aload 1
      // a8: checkcast gkx$c2g
      // ab: iload 3
      // ac: invokespecial gkx.wet (IILgkx$c2g;Z)Lp6a;
      // af: goto b7
      // b2: invokestatic gkx.c (Loov;)Loov;
      // b5: athrow
      // b6: aconst_null
      // b7: areturn
   }

   public void z3y(boolean param1) {
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
      // 05: getfield gkx.hwk Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 78
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast gkx$kyg
      // 20: astore 4
      // 22: aload 4
      // 24: invokestatic gkx$kyg.e0a (Lgkx$kyg;)Lb0t;
      // 27: instanceof gt4
      // 2a: iload 2
      // 2b: ifne 5e
      // 2e: ifeq 4b
      // 31: goto 38
      // 34: invokestatic gkx.c (Loov;)Loov;
      // 37: athrow
      // 38: aload 4
      // 3a: invokestatic gkx$kyg.e0a (Lgkx$kyg;)Lb0t;
      // 3d: checkcast gt4
      // 40: iload 1
      // 41: putfield gt4.c9a Z
      // 44: goto 4b
      // 47: invokestatic gkx.c (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 4
      // 4d: invokestatic gkx$kyg.qke (Lgkx$kyg;)Lb0t;
      // 50: iload 2
      // 51: ifne 6d
      // 54: instanceof gt4
      // 57: goto 5e
      // 5a: invokestatic gkx.c (Loov;)Loov;
      // 5d: athrow
      // 5e: ifeq 74
      // 61: aload 4
      // 63: invokestatic gkx$kyg.qke (Lgkx$kyg;)Lb0t;
      // 66: goto 6d
      // 69: invokestatic gkx.c (Loov;)Loov;
      // 6c: athrow
      // 6d: checkcast gt4
      // 70: iload 1
      // 71: putfield gt4.c9a Z
      // 74: iload 2
      // 75: ifeq 0e
      // 78: return
   }

   @Override
   public boolean dsd(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: iload 3
      // 04: invokespecial dxd.dsd (III)Z
      // 07: istore 5
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: iload 1
      // 0e: iload 2
      // 0f: invokevirtual gkx.dwe (II)I
      // 12: istore 6
      // 14: istore 4
      // 16: iload 6
      // 18: iload 4
      // 1a: ifeq 9b
      // 1d: iflt 99
      // 20: goto 27
      // 23: invokestatic gkx.c (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: iload 6
      // 2a: invokevirtual gkx.jb4 (I)Lgkx$kyg;
      // 2d: astore 7
      // 2f: aload 0
      // 30: iload 4
      // 32: ifeq 91
      // 35: getfield gkx.puz Lb0t;
      // 38: aload 7
      // 3a: invokestatic gkx$kyg.tbl (Lgkx$kyg;)Lb0t;
      // 3d: if_acmpeq 90
      // 40: goto 47
      // 43: invokestatic gkx.c (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: iload 4
      // 4a: ifeq 91
      // 4d: goto 54
      // 50: invokestatic gkx.c (Loov;)Loov;
      // 53: athrow
      // 54: getfield gkx.puz Lb0t;
      // 57: ifnull 90
      // 5a: goto 61
      // 5d: invokestatic gkx.c (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: iload 4
      // 64: ifeq 91
      // 67: goto 6e
      // 6a: invokestatic gkx.c (Loov;)Loov;
      // 6d: athrow
      // 6e: getfield gkx.puz Lb0t;
      // 71: instanceof jqk
      // 74: ifeq 90
      // 77: goto 7e
      // 7a: invokestatic gkx.c (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield gkx.puz Lb0t;
      // 82: checkcast jqk
      // 85: bipush 0
      // 86: invokevirtual jqk._c6 (Z)V
      // 89: goto 90
      // 8c: invokestatic gkx.c (Loov;)Loov;
      // 8f: athrow
      // 90: aload 0
      // 91: aload 7
      // 93: invokestatic gkx$kyg.tbl (Lgkx$kyg;)Lb0t;
      // 96: putfield gkx.puz Lb0t;
      // 99: iload 5
      // 9b: ireturn
   }

   private scc wni(int var1, int var2, gkx$wuo var3) {
      scc var4 = new scc(this.nrn, var3.j8v(), var1, var2, var3.a7e(), var3.tq4(), var3.l48(), var3.m_x(), var3.eye());
      var4.c1s = var3.crj();
      return var4;
   }

   private jhy avy(int var1, int var2, gkx$uc2 var3) {
      jhy var4 = new jhy(this.nrn, var3.j8v(), var1, var2, var3.a7e(), var3.xdp());
      var4.c1s = var3.crj();
      return var4;
   }

   private jqk cru(int var1, int var2, gkx$plo var3) {
      jqk var4 = new jqk(var3.j8v(), this.gk_.tx1, var1, var2, 150, 20);
      var4.nrl(var3.a7e());
      var4.zku(this.nrn);
      var4.qo7(var3.crj());
      var4.m00(var3.ozw());
      return var4;
   }

   private p6a wet(int var1, int var2, gkx$c2g var3, boolean var4) {
      p6a var6;
      label11: {
         int var5 = OpaquePredicate.c();
         if (var4) {
            var6 = new p6a(this.gk_.tx1, var3.j8v(), var1, var2, this.wde - var1 * 2, 20, -1);
            if (var5 == 0) {
               break label11;
            }
         }

         var6 = new p6a(this.gk_.tx1, var3.j8v(), var1, var2, 150, 20, -1);
      }

      var6.xiq = var3.crj();
      var6.d26(var3.a7e());
      var6.o4e();
      return var6;
   }

   public void z7h(char param1, int param2) {
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
      // 005: getfield gkx.puz Lb0t;
      // 008: iload 3
      // 009: ifeq 024
      // 00c: instanceof jqk
      // 00f: ifeq 219
      // 012: goto 019
      // 015: invokestatic gkx.c (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield gkx.puz Lb0t;
      // 01d: goto 024
      // 020: invokestatic gkx.c (Loov;)Loov;
      // 023: athrow
      // 024: checkcast jqk
      // 027: astore 4
      // 029: iload 2
      // 02a: invokestatic ShaderHelper.foo (I)Z
      // 02d: iload 3
      // 02e: ifeq 03c
      // 031: ifne 182
      // 034: goto 03b
      // 037: invokestatic gkx.c (Loov;)Loov;
      // 03a: athrow
      // 03b: iload 2
      // 03c: iload 3
      // 03d: ifeq 17d
      // 040: bipush 15
      // 042: if_icmpne 16f
      // 045: goto 04c
      // 048: invokestatic gkx.c (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 4
      // 04e: bipush 0
      // 04f: invokevirtual jqk._c6 (Z)V
      // 052: aload 0
      // 053: getfield gkx.wwi Ljava/util/List;
      // 056: aload 0
      // 057: getfield gkx.puz Lb0t;
      // 05a: invokeinterface java/util/List.indexOf (Ljava/lang/Object;)I 2
      // 05f: istore 5
      // 061: invokestatic ShaderHelper.dmk ()Z
      // 064: iload 3
      // 065: ifeq 0b8
      // 068: ifeq 0af
      // 06b: goto 072
      // 06e: invokestatic gkx.c (Loov;)Loov;
      // 071: athrow
      // 072: iload 5
      // 074: iload 3
      // 075: ifeq 09b
      // 078: goto 07f
      // 07b: invokestatic gkx.c (Loov;)Loov;
      // 07e: athrow
      // 07f: ifne 0a1
      // 082: goto 089
      // 085: invokestatic gkx.c (Loov;)Loov;
      // 088: athrow
      // 089: aload 0
      // 08a: getfield gkx.wwi Ljava/util/List;
      // 08d: invokeinterface java/util/List.size ()I 1
      // 092: bipush 1
      // 093: isub
      // 094: goto 09b
      // 097: invokestatic gkx.c (Loov;)Loov;
      // 09a: athrow
      // 09b: istore 5
      // 09d: iload 3
      // 09e: ifne 0e9
      // 0a1: iinc 5 -1
      // 0a4: iload 3
      // 0a5: ifne 0e9
      // 0a8: goto 0af
      // 0ab: invokestatic gkx.c (Loov;)Loov;
      // 0ae: athrow
      // 0af: iload 5
      // 0b1: goto 0b8
      // 0b4: invokestatic gkx.c (Loov;)Loov;
      // 0b7: athrow
      // 0b8: iload 3
      // 0b9: ifeq 0d9
      // 0bc: aload 0
      // 0bd: getfield gkx.wwi Ljava/util/List;
      // 0c0: invokeinterface java/util/List.size ()I 1
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: if_icmpne 0df
      // 0ca: goto 0d1
      // 0cd: invokestatic gkx.c (Loov;)Loov;
      // 0d0: athrow
      // 0d1: bipush 0
      // 0d2: goto 0d9
      // 0d5: invokestatic gkx.c (Loov;)Loov;
      // 0d8: athrow
      // 0d9: istore 5
      // 0db: iload 3
      // 0dc: ifne 0e9
      // 0df: iinc 5 1
      // 0e2: goto 0e9
      // 0e5: invokestatic gkx.c (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: aload 0
      // 0eb: getfield gkx.wwi Ljava/util/List;
      // 0ee: iload 5
      // 0f0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0f5: checkcast b0t
      // 0f8: putfield gkx.puz Lb0t;
      // 0fb: aload 0
      // 0fc: getfield gkx.puz Lb0t;
      // 0ff: checkcast jqk
      // 102: astore 4
      // 104: aload 4
      // 106: bipush 1
      // 107: invokevirtual jqk._c6 (Z)V
      // 10a: aload 4
      // 10c: getfield jqk.mr4 I
      // 10f: aload 0
      // 110: getfield gkx.qc1 I
      // 113: iadd
      // 114: istore 6
      // 116: aload 4
      // 118: getfield jqk.mr4 I
      // 11b: istore 7
      // 11d: iload 6
      // 11f: aload 0
      // 120: getfield gkx.chj I
      // 123: iload 3
      // 124: ifeq 15a
      // 127: if_icmple 14d
      // 12a: goto 131
      // 12d: invokestatic gkx.c (Loov;)Loov;
      // 130: athrow
      // 131: aload 0
      // 132: dup
      // 133: getfield gkx.fx8 F
      // 136: iload 6
      // 138: aload 0
      // 139: getfield gkx.chj I
      // 13c: isub
      // 13d: i2f
      // 13e: fadd
      // 13f: putfield gkx.fx8 F
      // 142: iload 3
      // 143: ifne 16b
      // 146: goto 14d
      // 149: invokestatic gkx.c (Loov;)Loov;
      // 14c: athrow
      // 14d: iload 7
      // 14f: aload 0
      // 150: getfield gkx.vem I
      // 153: goto 15a
      // 156: invokestatic gkx.c (Loov;)Loov;
      // 159: athrow
      // 15a: if_icmpge 16b
      // 15d: aload 0
      // 15e: iload 7
      // 160: i2f
      // 161: putfield gkx.fx8 F
      // 164: goto 16b
      // 167: invokestatic gkx.c (Loov;)Loov;
      // 16a: athrow
      // 16b: iload 3
      // 16c: ifne 219
      // 16f: aload 4
      // 171: iload 1
      // 172: iload 2
      // 173: invokevirtual jqk.pst (CI)Z
      // 176: goto 17d
      // 179: invokestatic gkx.c (Loov;)Loov;
      // 17c: athrow
      // 17d: pop
      // 17e: iload 3
      // 17f: ifne 219
      // 182: invokestatic ShaderHelper.b0r ()Ljava/lang/String;
      // 185: astore 5
      // 187: aload 5
      // 189: ldc ";"
      // 18b: nop
      // 18c: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 18f: astore 6
      // 191: aload 0
      // 192: getfield gkx.wwi Ljava/util/List;
      // 195: aload 0
      // 196: getfield gkx.puz Lb0t;
      // 199: invokeinterface java/util/List.indexOf (Ljava/lang/Object;)I 2
      // 19e: istore 7
      // 1a0: iload 7
      // 1a2: istore 8
      // 1a4: aload 6
      // 1a6: astore 9
      // 1a8: aload 9
      // 1aa: arraylength
      // 1ab: istore 10
      // 1ad: bipush 0
      // 1ae: istore 11
      // 1b0: iload 11
      // 1b2: iload 10
      // 1b4: if_icmpge 219
      // 1b7: aload 9
      // 1b9: iload 11
      // 1bb: aaload
      // 1bc: astore 12
      // 1be: aload 0
      // 1bf: getfield gkx.wwi Ljava/util/List;
      // 1c2: iload 8
      // 1c4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1c9: checkcast jqk
      // 1cc: aload 12
      // 1ce: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 1d1: iload 8
      // 1d3: iload 3
      // 1d4: ifeq 1f4
      // 1d7: aload 0
      // 1d8: getfield gkx.wwi Ljava/util/List;
      // 1db: invokeinterface java/util/List.size ()I 1
      // 1e0: bipush 1
      // 1e1: isub
      // 1e2: if_icmpne 1fa
      // 1e5: goto 1ec
      // 1e8: invokestatic gkx.c (Loov;)Loov;
      // 1eb: athrow
      // 1ec: bipush 0
      // 1ed: goto 1f4
      // 1f0: invokestatic gkx.c (Loov;)Loov;
      // 1f3: athrow
      // 1f4: istore 8
      // 1f6: iload 3
      // 1f7: ifne 204
      // 1fa: iinc 8 1
      // 1fd: goto 204
      // 200: invokestatic gkx.c (Loov;)Loov;
      // 203: athrow
      // 204: iload 8
      // 206: iload 7
      // 208: if_icmpne 212
      // 20b: goto 219
      // 20e: invokestatic gkx.c (Loov;)Loov;
      // 211: athrow
      // 212: iinc 11 1
      // 215: iload 3
      // 216: ifne 1b0
      // 219: return
   }

   public gkx$kyg jb4(int var1) {
      return (gkx$kyg)this.hwk.get(var1);
   }

   @Override
   public int getSize() {
      return this.hwk.size();
   }

   @Override
   public int getListWidth() {
      return 400;
   }

   @Override
   public int getScrollBarX() {
      return super.getScrollBarX() + 32;
   }

   @Override
   public dxd$v9l jb4(int var1) {
      return this.jb4(var1);
   }

   private static oov c(oov var0) {
      return var0;
   }
}
