import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class omn extends b0t {
   private final int nc_;
   private final owt t81;
   public int _qn;
   public int arg;
   private final int a9i;
   private final int zwd;
   private String w2q = "";
   private int pst = 32;
   private int van;
   private boolean nbr = true;
   private boolean ob_ = true;
   private boolean yxy;
   private boolean iby = true;
   private int uei;
   private int nsd;
   private int _43;
   private int br9 = 14737632;
   private int bsk = 7368816;
   private boolean xh8 = true;
   private gkx$lpc t92;
   private Predicate ihw = Predicates.alwaysTrue();

   public omn(int var1, owt var2, int var3, int var4, int var5, int var6) {
      this.nc_ = var1;
      this.t81 = var2;
      this._qn = var3;
      this.arg = var4;
      this.a9i = var5;
      this.zwd = var6;
   }

   public void dt0(gkx$lpc var1) {
      this.t92 = var1;
   }

   public void xxu() {
      this.van++;
   }

   public void qwi(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield omn.ihw Lcom/google/common/base/Predicate;
      // 08: aload 1
      // 09: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 0e: iload 2
      // 0f: ifne 27
      // 12: ifeq 56
      // 15: goto 1c
      // 18: invokestatic omn.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/lang/String.length ()I
      // 20: goto 27
      // 23: invokestatic omn.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield omn.pst I
      // 2b: if_icmple 46
      // 2e: aload 0
      // 2f: aload 1
      // 30: bipush 0
      // 31: aload 0
      // 32: getfield omn.pst I
      // 35: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 38: putfield omn.w2q Ljava/lang/String;
      // 3b: iload 2
      // 3c: ifeq 52
      // 3f: goto 46
      // 42: invokestatic omn.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: aload 1
      // 48: putfield omn.w2q Ljava/lang/String;
      // 4b: goto 52
      // 4e: invokestatic omn.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: invokevirtual omn.do7 ()V
      // 56: return
   }

   public String ina() {
      return this.w2q;
   }

   public String yw4() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 26
      // 09: getfield omn.nsd I
      // 0c: aload 0
      // 0d: getfield omn._43 I
      // 10: if_icmpge 25
      // 13: goto 1a
      // 16: invokestatic omn.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield omn.nsd I
      // 1e: goto 29
      // 21: invokestatic omn.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield omn._43 I
      // 29: istore 2
      // 2a: aload 0
      // 2b: iload 1
      // 2c: ifne 4c
      // 2f: getfield omn.nsd I
      // 32: aload 0
      // 33: getfield omn._43 I
      // 36: if_icmpge 4b
      // 39: goto 40
      // 3c: invokestatic omn.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield omn._43 I
      // 44: goto 4f
      // 47: invokestatic omn.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield omn.nsd I
      // 4f: istore 3
      // 50: aload 0
      // 51: getfield omn.w2q Ljava/lang/String;
      // 54: iload 2
      // 55: iload 3
      // 56: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 59: areturn
   }

   public void oy4(Predicate var1) {
      this.ihw = var1;
   }

   public void ty6(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc ""
      // 002: nop
      // 003: astore 3
      // 004: invokestatic t9d.c ()I
      // 007: aload 1
      // 008: invokestatic _xi._dn (Ljava/lang/String;)Ljava/lang/String;
      // 00b: astore 4
      // 00d: istore 2
      // 00e: aload 0
      // 00f: iload 2
      // 010: ifne 030
      // 013: getfield omn.nsd I
      // 016: aload 0
      // 017: getfield omn._43 I
      // 01a: if_icmpge 02f
      // 01d: goto 024
      // 020: invokestatic omn.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: getfield omn.nsd I
      // 028: goto 033
      // 02b: invokestatic omn.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield omn._43 I
      // 033: istore 5
      // 035: aload 0
      // 036: iload 2
      // 037: ifne 057
      // 03a: getfield omn.nsd I
      // 03d: aload 0
      // 03e: getfield omn._43 I
      // 041: if_icmpge 056
      // 044: goto 04b
      // 047: invokestatic omn.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield omn._43 I
      // 04f: goto 05a
      // 052: invokestatic omn.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: getfield omn.nsd I
      // 05a: istore 6
      // 05c: aload 0
      // 05d: getfield omn.pst I
      // 060: aload 0
      // 061: getfield omn.w2q Ljava/lang/String;
      // 064: invokevirtual java/lang/String.length ()I
      // 067: isub
      // 068: iload 5
      // 06a: iload 6
      // 06c: isub
      // 06d: isub
      // 06e: istore 7
      // 070: bipush 0
      // 071: istore 8
      // 073: aload 0
      // 074: getfield omn.w2q Ljava/lang/String;
      // 077: invokevirtual java/lang/String.length ()I
      // 07a: iload 2
      // 07b: ifne 0a6
      // 07e: ifle 0a4
      // 081: goto 088
      // 084: invokestatic omn.a (Loov;)Loov;
      // 087: athrow
      // 088: new java/lang/StringBuilder
      // 08b: dup
      // 08c: invokespecial java/lang/StringBuilder.<init> ()V
      // 08f: aload 3
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: aload 0
      // 094: getfield omn.w2q Ljava/lang/String;
      // 097: bipush 0
      // 098: iload 5
      // 09a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a3: astore 3
      // 0a4: iload 7
      // 0a6: iload 2
      // 0a7: ifne 0f4
      // 0aa: aload 4
      // 0ac: invokevirtual java/lang/String.length ()I
      // 0af: if_icmpge 0db
      // 0b2: goto 0b9
      // 0b5: invokestatic omn.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: new java/lang/StringBuilder
      // 0bc: dup
      // 0bd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c0: aload 3
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: aload 4
      // 0c6: bipush 0
      // 0c7: iload 7
      // 0c9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d2: astore 3
      // 0d3: iload 7
      // 0d5: istore 8
      // 0d7: iload 2
      // 0d8: ifeq 0f6
      // 0db: new java/lang/StringBuilder
      // 0de: dup
      // 0df: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e2: aload 3
      // 0e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e6: aload 4
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ee: astore 3
      // 0ef: aload 4
      // 0f1: invokevirtual java/lang/String.length ()I
      // 0f4: istore 8
      // 0f6: aload 0
      // 0f7: getfield omn.w2q Ljava/lang/String;
      // 0fa: invokevirtual java/lang/String.length ()I
      // 0fd: iload 2
      // 0fe: ifne 159
      // 101: ifle 144
      // 104: goto 10b
      // 107: invokestatic omn.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 6
      // 10d: iload 2
      // 10e: ifne 159
      // 111: goto 118
      // 114: invokestatic omn.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: getfield omn.w2q Ljava/lang/String;
      // 11c: invokevirtual java/lang/String.length ()I
      // 11f: if_icmpge 144
      // 122: goto 129
      // 125: invokestatic omn.a (Loov;)Loov;
      // 128: athrow
      // 129: new java/lang/StringBuilder
      // 12c: dup
      // 12d: invokespecial java/lang/StringBuilder.<init> ()V
      // 130: aload 3
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: aload 0
      // 135: getfield omn.w2q Ljava/lang/String;
      // 138: iload 6
      // 13a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 143: astore 3
      // 144: aload 0
      // 145: iload 2
      // 146: ifne 177
      // 149: getfield omn.ihw Lcom/google/common/base/Predicate;
      // 14c: aload 3
      // 14d: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 152: goto 159
      // 155: invokestatic omn.a (Loov;)Loov;
      // 158: athrow
      // 159: ifeq 1a0
      // 15c: aload 0
      // 15d: aload 3
      // 15e: putfield omn.w2q Ljava/lang/String;
      // 161: aload 0
      // 162: iload 5
      // 164: aload 0
      // 165: getfield omn._43 I
      // 168: isub
      // 169: iload 8
      // 16b: iadd
      // 16c: invokevirtual omn.v9i (I)V
      // 16f: aload 0
      // 170: goto 177
      // 173: invokestatic omn.a (Loov;)Loov;
      // 176: athrow
      // 177: getfield omn.t92 Lgkx$lpc;
      // 17a: iload 2
      // 17b: ifne 193
      // 17e: ifnull 1a0
      // 181: goto 188
      // 184: invokestatic omn.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 0
      // 189: getfield omn.t92 Lgkx$lpc;
      // 18c: goto 193
      // 18f: invokestatic omn.a (Loov;)Loov;
      // 192: athrow
      // 193: aload 0
      // 194: getfield omn.nc_ I
      // 197: aload 0
      // 198: getfield omn.w2q Ljava/lang/String;
      // 19b: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 1a0: return
   }

   public void bw7(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield omn.w2q Ljava/lang/String;
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: iload 2
      // 0c: ifeq 2f
      // 0f: ifeq 5d
      // 12: goto 19
      // 15: invokestatic omn.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifeq 50
      // 1e: goto 25
      // 21: invokestatic omn.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield omn._43 I
      // 28: goto 2f
      // 2b: invokestatic omn.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield omn.nsd I
      // 33: if_icmpeq 48
      // 36: aload 0
      // 37: ldc ""
      // 39: nop
      // 3a: invokevirtual omn.ty6 (Ljava/lang/String;)V
      // 3d: iload 2
      // 3e: ifne 5d
      // 41: goto 48
      // 44: invokestatic omn.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic omn.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: iload 1
      // 52: invokevirtual omn.y1p (I)I
      // 55: aload 0
      // 56: getfield omn.nsd I
      // 59: isub
      // 5a: invokevirtual omn.sxl (I)V
      // 5d: return
   }

   public void sxl(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield omn.w2q Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: iload 2
      // 00c: ifne 024
      // 00f: ifeq 16b
      // 012: goto 019
      // 015: invokestatic omn.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield omn._43 I
      // 01d: goto 024
      // 020: invokestatic omn.a (Loov;)Loov;
      // 023: athrow
      // 024: iload 2
      // 025: ifne 050
      // 028: aload 0
      // 029: getfield omn.nsd I
      // 02c: if_icmpeq 048
      // 02f: goto 036
      // 032: invokestatic omn.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: ldc ""
      // 039: nop
      // 03a: invokevirtual omn.ty6 (Ljava/lang/String;)V
      // 03d: iload 2
      // 03e: ifeq 16b
      // 041: goto 048
      // 044: invokestatic omn.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 1
      // 049: goto 050
      // 04c: invokestatic omn.a (Loov;)Loov;
      // 04f: athrow
      // 050: iload 2
      // 051: ifne 05f
      // 054: ifge 062
      // 057: goto 05e
      // 05a: invokestatic omn.a (Loov;)Loov;
      // 05d: athrow
      // 05e: bipush 1
      // 05f: goto 063
      // 062: bipush 0
      // 063: istore 3
      // 064: iload 3
      // 065: iload 2
      // 066: ifne 080
      // 069: ifeq 083
      // 06c: goto 073
      // 06f: invokestatic omn.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield omn.nsd I
      // 077: iload 1
      // 078: iadd
      // 079: goto 080
      // 07c: invokestatic omn.a (Loov;)Loov;
      // 07f: athrow
      // 080: goto 087
      // 083: aload 0
      // 084: getfield omn.nsd I
      // 087: istore 4
      // 089: iload 3
      // 08a: iload 2
      // 08b: ifne 0a7
      // 08e: ifeq 0a3
      // 091: goto 098
      // 094: invokestatic omn.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: getfield omn.nsd I
      // 09c: goto 0a9
      // 09f: invokestatic omn.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield omn.nsd I
      // 0a7: iload 1
      // 0a8: iadd
      // 0a9: istore 5
      // 0ab: ldc ""
      // 0ad: nop
      // 0ae: astore 6
      // 0b0: iload 4
      // 0b2: iload 2
      // 0b3: ifne 0ce
      // 0b6: iflt 0cc
      // 0b9: goto 0c0
      // 0bc: invokestatic omn.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield omn.w2q Ljava/lang/String;
      // 0c4: bipush 0
      // 0c5: iload 4
      // 0c7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ca: astore 6
      // 0cc: iload 5
      // 0ce: iload 2
      // 0cf: ifne 10b
      // 0d2: aload 0
      // 0d3: getfield omn.w2q Ljava/lang/String;
      // 0d6: invokevirtual java/lang/String.length ()I
      // 0d9: if_icmpge 100
      // 0dc: goto 0e3
      // 0df: invokestatic omn.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: new java/lang/StringBuilder
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ea: aload 6
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: aload 0
      // 0f0: getfield omn.w2q Ljava/lang/String;
      // 0f3: iload 5
      // 0f5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: astore 6
      // 100: aload 0
      // 101: getfield omn.ihw Lcom/google/common/base/Predicate;
      // 104: aload 6
      // 106: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 10b: iload 2
      // 10c: ifne 132
      // 10f: ifeq 16b
      // 112: goto 119
      // 115: invokestatic omn.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 2
      // 11b: ifne 142
      // 11e: goto 125
      // 121: invokestatic omn.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 6
      // 127: putfield omn.w2q Ljava/lang/String;
      // 12a: iload 3
      // 12b: goto 132
      // 12e: invokestatic omn.a (Loov;)Loov;
      // 131: athrow
      // 132: ifeq 141
      // 135: aload 0
      // 136: iload 1
      // 137: invokevirtual omn.v9i (I)V
      // 13a: goto 141
      // 13d: invokestatic omn.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: getfield omn.t92 Lgkx$lpc;
      // 145: iload 2
      // 146: ifne 15e
      // 149: ifnull 16b
      // 14c: goto 153
      // 14f: invokestatic omn.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 0
      // 154: getfield omn.t92 Lgkx$lpc;
      // 157: goto 15e
      // 15a: invokestatic omn.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 0
      // 15f: getfield omn.nc_ I
      // 162: aload 0
      // 163: getfield omn.w2q Ljava/lang/String;
      // 166: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 16b: return
   }

   public int kv7() {
      return this.nc_;
   }

   public int y1p(int var1) {
      return this.wuq(var1, this.r5o());
   }

   public int wuq(int var1, int var2) {
      return this.f8v(var1, var2, true);
   }

   public int f8v(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: iload 2
      // 006: istore 5
      // 008: iload 1
      // 009: iload 4
      // 00b: ifeq 019
      // 00e: ifge 01c
      // 011: goto 018
      // 014: invokestatic omn.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 1
      // 019: goto 01d
      // 01c: bipush 0
      // 01d: istore 6
      // 01f: iload 1
      // 020: invokestatic java/lang/Math.abs (I)I
      // 023: istore 7
      // 025: bipush 0
      // 026: istore 8
      // 028: iload 8
      // 02a: iload 7
      // 02c: if_icmpge 169
      // 02f: iload 6
      // 031: iload 4
      // 033: ifeq 16b
      // 036: iload 4
      // 038: ifeq 0d8
      // 03b: goto 042
      // 03e: invokestatic omn.a (Loov;)Loov;
      // 041: athrow
      // 042: ifne 0d0
      // 045: goto 04c
      // 048: invokestatic omn.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield omn.w2q Ljava/lang/String;
      // 050: invokevirtual java/lang/String.length ()I
      // 053: istore 9
      // 055: aload 0
      // 056: getfield omn.w2q Ljava/lang/String;
      // 059: bipush 32
      // 05b: iload 5
      // 05d: invokevirtual java/lang/String.indexOf (II)I
      // 060: istore 5
      // 062: iload 5
      // 064: iload 4
      // 066: ifeq 085
      // 069: bipush -1
      // 06a: if_icmpne 07d
      // 06d: goto 074
      // 070: invokestatic omn.a (Loov;)Loov;
      // 073: athrow
      // 074: iload 9
      // 076: istore 5
      // 078: iload 4
      // 07a: ifne 0cb
      // 07d: iload 3
      // 07e: goto 085
      // 081: invokestatic omn.a (Loov;)Loov;
      // 084: athrow
      // 085: ifeq 0cb
      // 088: iload 5
      // 08a: iload 9
      // 08c: iload 4
      // 08e: ifeq 02c
      // 091: goto 098
      // 094: invokestatic omn.a (Loov;)Loov;
      // 097: athrow
      // 098: iload 4
      // 09a: ifeq 0b9
      // 09d: if_icmpge 0cb
      // 0a0: goto 0a7
      // 0a3: invokestatic omn.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield omn.w2q Ljava/lang/String;
      // 0ab: iload 5
      // 0ad: invokevirtual java/lang/String.charAt (I)C
      // 0b0: bipush 32
      // 0b2: goto 0b9
      // 0b5: invokestatic omn.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: if_icmpne 0cb
      // 0bc: iinc 5 1
      // 0bf: iload 4
      // 0c1: ifne 07d
      // 0c4: goto 0cb
      // 0c7: invokestatic omn.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: iload 4
      // 0cd: ifne 161
      // 0d0: iload 3
      // 0d1: goto 0d8
      // 0d4: invokestatic omn.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: ifeq 131
      // 0db: iload 5
      // 0dd: iload 4
      // 0df: ifeq 133
      // 0e2: goto 0e9
      // 0e5: invokestatic omn.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 4
      // 0eb: ifeq 133
      // 0ee: goto 0f5
      // 0f1: invokestatic omn.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifle 131
      // 0f8: goto 0ff
      // 0fb: invokestatic omn.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield omn.w2q Ljava/lang/String;
      // 103: iload 5
      // 105: bipush 1
      // 106: isub
      // 107: invokevirtual java/lang/String.charAt (I)C
      // 10a: iload 4
      // 10c: ifeq 133
      // 10f: goto 116
      // 112: invokestatic omn.a (Loov;)Loov;
      // 115: athrow
      // 116: bipush 32
      // 118: if_icmpne 131
      // 11b: goto 122
      // 11e: invokestatic omn.a (Loov;)Loov;
      // 121: athrow
      // 122: iinc 5 -1
      // 125: iload 4
      // 127: ifne 0d0
      // 12a: goto 131
      // 12d: invokestatic omn.a (Loov;)Loov;
      // 130: athrow
      // 131: iload 5
      // 133: ifle 161
      // 136: aload 0
      // 137: getfield omn.w2q Ljava/lang/String;
      // 13a: iload 5
      // 13c: bipush 1
      // 13d: isub
      // 13e: invokevirtual java/lang/String.charAt (I)C
      // 141: bipush 32
      // 143: iload 4
      // 145: ifeq 02c
      // 148: goto 14f
      // 14b: invokestatic omn.a (Loov;)Loov;
      // 14e: athrow
      // 14f: if_icmpeq 161
      // 152: iinc 5 -1
      // 155: iload 4
      // 157: ifne 131
      // 15a: goto 161
      // 15d: invokestatic omn.a (Loov;)Loov;
      // 160: athrow
      // 161: iinc 8 1
      // 164: iload 4
      // 166: ifne 028
      // 169: iload 5
      // 16b: ireturn
   }

   public void v9i(int var1) {
      this.ykg(this._43 + var1);
   }

   public void ykg(int var1) {
      this.nsd = var1;
      int var2 = this.w2q.length();
      this.nsd = fe6.faa(this.nsd, 0, var2);
      this.y6m(this.nsd);
   }

   public void kay() {
      this.ykg(0);
   }

   public void do7() {
      this.ykg(this.w2q.length());
   }

   public boolean sed(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield omn.yxy Z
      // 008: iload 3
      // 009: ifeq 020
      // 00c: ifne 01c
      // 00f: goto 016
      // 012: invokestatic omn.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic omn.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 2
      // 01d: invokestatic gbe.ul2 (I)Z
      // 020: iload 3
      // 021: ifeq 041
      // 024: ifeq 03d
      // 027: goto 02e
      // 02a: invokestatic omn.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual omn.do7 ()V
      // 032: aload 0
      // 033: bipush 0
      // 034: invokevirtual omn.y6m (I)V
      // 037: bipush 1
      // 038: ireturn
      // 039: invokestatic omn.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iload 2
      // 03e: invokestatic gbe.y4j (I)Z
      // 041: iload 3
      // 042: ifeq 060
      // 045: ifeq 05c
      // 048: goto 04f
      // 04b: invokestatic omn.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: invokevirtual omn.yw4 ()Ljava/lang/String;
      // 053: invokestatic gbe.vjv (Ljava/lang/String;)V
      // 056: bipush 1
      // 057: ireturn
      // 058: invokestatic omn.a (Loov;)Loov;
      // 05b: athrow
      // 05c: iload 2
      // 05d: invokestatic gbe.foo (I)Z
      // 060: iload 3
      // 061: ifeq 09b
      // 064: ifeq 097
      // 067: goto 06e
      // 06a: invokestatic omn.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield omn.iby Z
      // 072: iload 3
      // 073: ifeq 096
      // 076: goto 07d
      // 079: invokestatic omn.a (Loov;)Loov;
      // 07c: athrow
      // 07d: ifeq 095
      // 080: goto 087
      // 083: invokestatic omn.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: invokestatic gbe.b0r ()Ljava/lang/String;
      // 08b: invokevirtual omn.ty6 (Ljava/lang/String;)V
      // 08e: goto 095
      // 091: invokestatic omn.a (Loov;)Loov;
      // 094: athrow
      // 095: bipush 1
      // 096: ireturn
      // 097: iload 2
      // 098: invokestatic gbe.uqk (I)Z
      // 09b: iload 3
      // 09c: ifeq 0da
      // 09f: ifeq 0d9
      // 0a2: goto 0a9
      // 0a5: invokestatic omn.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: invokevirtual omn.yw4 ()Ljava/lang/String;
      // 0ad: invokestatic gbe.vjv (Ljava/lang/String;)V
      // 0b0: aload 0
      // 0b1: getfield omn.iby Z
      // 0b4: iload 3
      // 0b5: ifeq 0d8
      // 0b8: goto 0bf
      // 0bb: invokestatic omn.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifeq 0d7
      // 0c2: goto 0c9
      // 0c5: invokestatic omn.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: ldc ""
      // 0cc: nop
      // 0cd: invokevirtual omn.ty6 (Ljava/lang/String;)V
      // 0d0: goto 0d7
      // 0d3: invokestatic omn.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: bipush 1
      // 0d8: ireturn
      // 0d9: iload 2
      // 0da: iload 3
      // 0db: ifeq 329
      // 0de: lookupswitch 583 6 14 62 199 166 203 201 205 323 207 445 211 486
      // 118: invokestatic omn.a (Loov;)Loov;
      // 11b: athrow
      // 11c: invokestatic gbe.t_s ()Z
      // 11f: iload 3
      // 120: ifeq 168
      // 123: goto 12a
      // 126: invokestatic omn.a (Loov;)Loov;
      // 129: athrow
      // 12a: ifeq 15d
      // 12d: goto 134
      // 130: invokestatic omn.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 0
      // 135: getfield omn.iby Z
      // 138: iload 3
      // 139: ifeq 183
      // 13c: goto 143
      // 13f: invokestatic omn.a (Loov;)Loov;
      // 142: athrow
      // 143: ifeq 182
      // 146: goto 14d
      // 149: invokestatic omn.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: bipush -1
      // 14f: invokevirtual omn.bw7 (I)V
      // 152: iload 3
      // 153: ifne 182
      // 156: goto 15d
      // 159: invokestatic omn.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield omn.iby Z
      // 161: goto 168
      // 164: invokestatic omn.a (Loov;)Loov;
      // 167: athrow
      // 168: iload 3
      // 169: ifeq 183
      // 16c: ifeq 182
      // 16f: goto 176
      // 172: invokestatic omn.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: bipush -1
      // 178: invokevirtual omn.sxl (I)V
      // 17b: goto 182
      // 17e: invokestatic omn.a (Loov;)Loov;
      // 181: athrow
      // 182: bipush 1
      // 183: ireturn
      // 184: invokestatic gbe.dmk ()Z
      // 187: ifeq 19a
      // 18a: aload 0
      // 18b: bipush 0
      // 18c: invokevirtual omn.y6m (I)V
      // 18f: iload 3
      // 190: ifne 1a5
      // 193: goto 19a
      // 196: invokestatic omn.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 0
      // 19b: invokevirtual omn.kay ()V
      // 19e: goto 1a5
      // 1a1: invokestatic omn.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: bipush 1
      // 1a6: ireturn
      // 1a7: invokestatic gbe.dmk ()Z
      // 1aa: iload 3
      // 1ab: ifeq 1fc
      // 1ae: ifeq 1f2
      // 1b1: goto 1b8
      // 1b4: invokestatic omn.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: invokestatic gbe.t_s ()Z
      // 1bb: ifeq 1dd
      // 1be: goto 1c5
      // 1c1: invokestatic omn.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: aload 0
      // 1c7: bipush -1
      // 1c8: aload 0
      // 1c9: invokevirtual omn.k7l ()I
      // 1cc: invokevirtual omn.wuq (II)I
      // 1cf: invokevirtual omn.y6m (I)V
      // 1d2: iload 3
      // 1d3: ifne 21f
      // 1d6: goto 1dd
      // 1d9: invokestatic omn.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: aload 0
      // 1df: invokevirtual omn.k7l ()I
      // 1e2: bipush 1
      // 1e3: isub
      // 1e4: invokevirtual omn.y6m (I)V
      // 1e7: iload 3
      // 1e8: ifne 21f
      // 1eb: goto 1f2
      // 1ee: invokestatic omn.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: invokestatic gbe.t_s ()Z
      // 1f5: goto 1fc
      // 1f8: invokestatic omn.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: ifeq 213
      // 1ff: aload 0
      // 200: aload 0
      // 201: bipush -1
      // 202: invokevirtual omn.y1p (I)I
      // 205: invokevirtual omn.ykg (I)V
      // 208: iload 3
      // 209: ifne 21f
      // 20c: goto 213
      // 20f: invokestatic omn.a (Loov;)Loov;
      // 212: athrow
      // 213: aload 0
      // 214: bipush -1
      // 215: invokevirtual omn.v9i (I)V
      // 218: goto 21f
      // 21b: invokestatic omn.a (Loov;)Loov;
      // 21e: athrow
      // 21f: bipush 1
      // 220: ireturn
      // 221: invokestatic gbe.dmk ()Z
      // 224: iload 3
      // 225: ifeq 276
      // 228: ifeq 26c
      // 22b: goto 232
      // 22e: invokestatic omn.a (Loov;)Loov;
      // 231: athrow
      // 232: invokestatic gbe.t_s ()Z
      // 235: ifeq 257
      // 238: goto 23f
      // 23b: invokestatic omn.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 0
      // 240: aload 0
      // 241: bipush 1
      // 242: aload 0
      // 243: invokevirtual omn.k7l ()I
      // 246: invokevirtual omn.wuq (II)I
      // 249: invokevirtual omn.y6m (I)V
      // 24c: iload 3
      // 24d: ifne 299
      // 250: goto 257
      // 253: invokestatic omn.a (Loov;)Loov;
      // 256: athrow
      // 257: aload 0
      // 258: aload 0
      // 259: invokevirtual omn.k7l ()I
      // 25c: bipush 1
      // 25d: iadd
      // 25e: invokevirtual omn.y6m (I)V
      // 261: iload 3
      // 262: ifne 299
      // 265: goto 26c
      // 268: invokestatic omn.a (Loov;)Loov;
      // 26b: athrow
      // 26c: invokestatic gbe.t_s ()Z
      // 26f: goto 276
      // 272: invokestatic omn.a (Loov;)Loov;
      // 275: athrow
      // 276: ifeq 28d
      // 279: aload 0
      // 27a: aload 0
      // 27b: bipush 1
      // 27c: invokevirtual omn.y1p (I)I
      // 27f: invokevirtual omn.ykg (I)V
      // 282: iload 3
      // 283: ifne 299
      // 286: goto 28d
      // 289: invokestatic omn.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 0
      // 28e: bipush 1
      // 28f: invokevirtual omn.v9i (I)V
      // 292: goto 299
      // 295: invokestatic omn.a (Loov;)Loov;
      // 298: athrow
      // 299: bipush 1
      // 29a: ireturn
      // 29b: invokestatic gbe.dmk ()Z
      // 29e: ifeq 2b7
      // 2a1: aload 0
      // 2a2: aload 0
      // 2a3: getfield omn.w2q Ljava/lang/String;
      // 2a6: invokevirtual java/lang/String.length ()I
      // 2a9: invokevirtual omn.y6m (I)V
      // 2ac: iload 3
      // 2ad: ifne 2c2
      // 2b0: goto 2b7
      // 2b3: invokestatic omn.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: invokevirtual omn.do7 ()V
      // 2bb: goto 2c2
      // 2be: invokestatic omn.a (Loov;)Loov;
      // 2c1: athrow
      // 2c2: bipush 1
      // 2c3: ireturn
      // 2c4: invokestatic gbe.t_s ()Z
      // 2c7: iload 3
      // 2c8: ifeq 309
      // 2cb: ifeq 2fe
      // 2ce: goto 2d5
      // 2d1: invokestatic omn.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: getfield omn.iby Z
      // 2d9: iload 3
      // 2da: ifeq 324
      // 2dd: goto 2e4
      // 2e0: invokestatic omn.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: ifeq 323
      // 2e7: goto 2ee
      // 2ea: invokestatic omn.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: aload 0
      // 2ef: bipush 1
      // 2f0: invokevirtual omn.bw7 (I)V
      // 2f3: iload 3
      // 2f4: ifne 323
      // 2f7: goto 2fe
      // 2fa: invokestatic omn.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: aload 0
      // 2ff: getfield omn.iby Z
      // 302: goto 309
      // 305: invokestatic omn.a (Loov;)Loov;
      // 308: athrow
      // 309: iload 3
      // 30a: ifeq 324
      // 30d: ifeq 323
      // 310: goto 317
      // 313: invokestatic omn.a (Loov;)Loov;
      // 316: athrow
      // 317: aload 0
      // 318: bipush 1
      // 319: invokevirtual omn.sxl (I)V
      // 31c: goto 323
      // 31f: invokestatic omn.a (Loov;)Loov;
      // 322: athrow
      // 323: bipush 1
      // 324: ireturn
      // 325: iload 1
      // 326: invokestatic _xi._m2 (C)Z
      // 329: iload 3
      // 32a: ifeq 362
      // 32d: ifeq 361
      // 330: goto 337
      // 333: invokestatic omn.a (Loov;)Loov;
      // 336: athrow
      // 337: aload 0
      // 338: getfield omn.iby Z
      // 33b: iload 3
      // 33c: ifeq 360
      // 33f: goto 346
      // 342: invokestatic omn.a (Loov;)Loov;
      // 345: athrow
      // 346: ifeq 35f
      // 349: goto 350
      // 34c: invokestatic omn.a (Loov;)Loov;
      // 34f: athrow
      // 350: aload 0
      // 351: iload 1
      // 352: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 355: invokevirtual omn.ty6 (Ljava/lang/String;)V
      // 358: goto 35f
      // 35b: invokestatic omn.a (Loov;)Loov;
      // 35e: athrow
      // 35f: bipush 1
      // 360: ireturn
      // 361: bipush 0
      // 362: ireturn
   }

   public void wuh(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: iload 1
      // 006: aload 0
      // 007: getfield omn._qn I
      // 00a: iload 4
      // 00c: ifne 02a
      // 00f: if_icmplt 078
      // 012: goto 019
      // 015: invokestatic omn.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 1
      // 01a: aload 0
      // 01b: getfield omn._qn I
      // 01e: aload 0
      // 01f: getfield omn.a9i I
      // 022: iadd
      // 023: goto 02a
      // 026: invokestatic omn.a (Loov;)Loov;
      // 029: athrow
      // 02a: iload 4
      // 02c: ifne 045
      // 02f: if_icmpge 078
      // 032: goto 039
      // 035: invokestatic omn.a (Loov;)Loov;
      // 038: athrow
      // 039: iload 2
      // 03a: aload 0
      // 03b: getfield omn.arg I
      // 03e: goto 045
      // 041: invokestatic omn.a (Loov;)Loov;
      // 044: athrow
      // 045: iload 4
      // 047: ifne 071
      // 04a: if_icmplt 078
      // 04d: goto 054
      // 050: invokestatic omn.a (Loov;)Loov;
      // 053: athrow
      // 054: iload 2
      // 055: iload 4
      // 057: ifne 075
      // 05a: goto 061
      // 05d: invokestatic omn.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield omn.arg I
      // 065: aload 0
      // 066: getfield omn.zwd I
      // 069: iadd
      // 06a: goto 071
      // 06d: invokestatic omn.a (Loov;)Loov;
      // 070: athrow
      // 071: if_icmpge 078
      // 074: bipush 1
      // 075: goto 079
      // 078: bipush 0
      // 079: istore 5
      // 07b: aload 0
      // 07c: getfield omn.ob_ Z
      // 07f: iload 4
      // 081: ifne 09f
      // 084: ifeq 09b
      // 087: goto 08e
      // 08a: invokestatic omn.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: iload 5
      // 091: invokevirtual omn.kd0 (Z)V
      // 094: goto 09b
      // 097: invokestatic omn.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield omn.yxy Z
      // 09f: iload 4
      // 0a1: ifne 0b0
      // 0a4: ifeq 12a
      // 0a7: goto 0ae
      // 0aa: invokestatic omn.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: iload 5
      // 0b0: iload 4
      // 0b2: ifne 0c0
      // 0b5: ifeq 12a
      // 0b8: goto 0bf
      // 0bb: invokestatic omn.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: iload 3
      // 0c0: iload 4
      // 0c2: ifne 0dc
      // 0c5: ifne 12a
      // 0c8: goto 0cf
      // 0cb: invokestatic omn.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 1
      // 0d0: aload 0
      // 0d1: getfield omn._qn I
      // 0d4: isub
      // 0d5: goto 0dc
      // 0d8: invokestatic omn.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: istore 6
      // 0de: aload 0
      // 0df: iload 4
      // 0e1: ifne 0fc
      // 0e4: getfield omn.nbr Z
      // 0e7: ifeq 0fb
      // 0ea: goto 0f1
      // 0ed: invokestatic omn.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iinc 6 -4
      // 0f4: goto 0fb
      // 0f7: invokestatic omn.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield omn.t81 Lowt;
      // 0ff: aload 0
      // 100: getfield omn.w2q Ljava/lang/String;
      // 103: aload 0
      // 104: getfield omn.uei I
      // 107: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 10a: aload 0
      // 10b: invokevirtual omn.ppc ()I
      // 10e: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 111: astore 7
      // 113: aload 0
      // 114: aload 0
      // 115: getfield omn.t81 Lowt;
      // 118: aload 7
      // 11a: iload 6
      // 11c: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 11f: invokevirtual java/lang/String.length ()I
      // 122: aload 0
      // 123: getfield omn.uei I
      // 126: iadd
      // 127: invokevirtual omn.ykg (I)V
      // 12a: return
   }

   public void wjv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokevirtual omn.fwy ()Z
      // 008: iload 1
      // 009: ifne 021
      // 00c: ifeq 3b9
      // 00f: goto 016
      // 012: invokestatic omn.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual omn.ex4 ()Z
      // 01a: goto 021
      // 01d: invokestatic omn.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 1
      // 022: ifne 099
      // 025: ifeq 096
      // 028: goto 02f
      // 02b: invokestatic omn.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield omn._qn I
      // 033: bipush 1
      // 034: isub
      // 035: i2f
      // 036: aload 0
      // 037: getfield omn.arg I
      // 03a: bipush 1
      // 03b: isub
      // 03c: i2f
      // 03d: aload 0
      // 03e: getfield omn.a9i I
      // 041: i2f
      // 042: aload 0
      // 043: getfield omn.zwd I
      // 046: i2f
      // 047: ldc 3.0
      // 049: nop
      // 04a: bipush -1
      // 04b: ldc 1.5
      // 04d: nop
      // 04e: aload 0
      // 04f: getfield omn.yxy Z
      // 052: iload 1
      // 053: ifne 078
      // 056: goto 05d
      // 059: invokestatic omn.a (Loov;)Loov;
      // 05c: athrow
      // 05d: ifeq 071
      // 060: goto 067
      // 063: invokestatic omn.a (Loov;)Loov;
      // 066: athrow
      // 067: ldc -8553091
      // 069: nop
      // 06a: goto 093
      // 06d: invokestatic omn.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 0
      // 072: invokevirtual omn.ina ()Ljava/lang/String;
      // 075: invokevirtual java/lang/String.isEmpty ()Z
      // 078: iload 1
      // 079: ifne 092
      // 07c: ifeq 090
      // 07f: goto 086
      // 082: invokestatic omn.a (Loov;)Loov;
      // 085: athrow
      // 086: ldc -2368549
      // 088: nop
      // 089: goto 093
      // 08c: invokestatic omn.a (Loov;)Loov;
      // 08f: athrow
      // 090: ldc -8553091
      // 092: nop
      // 093: invokestatic mkt.o8m (FFFFFIFI)V
      // 096: ldc -16777216
      // 098: nop
      // 099: istore 2
      // 09a: aload 0
      // 09b: getfield omn.nsd I
      // 09e: aload 0
      // 09f: getfield omn.uei I
      // 0a2: isub
      // 0a3: istore 3
      // 0a4: aload 0
      // 0a5: getfield omn._43 I
      // 0a8: aload 0
      // 0a9: getfield omn.uei I
      // 0ac: isub
      // 0ad: istore 4
      // 0af: aload 0
      // 0b0: getfield omn.t81 Lowt;
      // 0b3: aload 0
      // 0b4: getfield omn.w2q Ljava/lang/String;
      // 0b7: aload 0
      // 0b8: getfield omn.uei I
      // 0bb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0be: aload 0
      // 0bf: invokevirtual omn.ppc ()I
      // 0c2: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 0c5: astore 5
      // 0c7: iload 3
      // 0c8: iload 1
      // 0c9: ifne 0d7
      // 0cc: iflt 0f5
      // 0cf: goto 0d6
      // 0d2: invokestatic omn.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: iload 3
      // 0d7: iload 1
      // 0d8: ifne 0f2
      // 0db: aload 5
      // 0dd: invokevirtual java/lang/String.length ()I
      // 0e0: if_icmpgt 0f5
      // 0e3: goto 0ea
      // 0e6: invokestatic omn.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: bipush 1
      // 0eb: goto 0f2
      // 0ee: invokestatic omn.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: goto 0f6
      // 0f5: bipush 0
      // 0f6: istore 6
      // 0f8: aload 0
      // 0f9: getfield omn.yxy Z
      // 0fc: iload 1
      // 0fd: ifne 11a
      // 100: ifeq 13c
      // 103: goto 10a
      // 106: invokestatic omn.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield omn.van I
      // 10e: bipush 6
      // 110: idiv
      // 111: bipush 2
      // 112: irem
      // 113: goto 11a
      // 116: invokestatic omn.a (Loov;)Loov;
      // 119: athrow
      // 11a: iload 1
      // 11b: ifne 12a
      // 11e: ifne 13c
      // 121: goto 128
      // 124: invokestatic omn.a (Loov;)Loov;
      // 127: athrow
      // 128: iload 6
      // 12a: iload 1
      // 12b: ifne 139
      // 12e: ifeq 13c
      // 131: goto 138
      // 134: invokestatic omn.a (Loov;)Loov;
      // 137: athrow
      // 138: bipush 1
      // 139: goto 13d
      // 13c: bipush 0
      // 13d: istore 7
      // 13f: aload 0
      // 140: iload 1
      // 141: ifne 160
      // 144: getfield omn.nbr Z
      // 147: ifeq 15f
      // 14a: goto 151
      // 14d: invokestatic omn.a (Loov;)Loov;
      // 150: athrow
      // 151: aload 0
      // 152: getfield omn._qn I
      // 155: bipush 6
      // 157: iadd
      // 158: goto 163
      // 15b: invokestatic omn.a (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield omn._qn I
      // 163: istore 8
      // 165: aload 0
      // 166: iload 1
      // 167: ifne 18d
      // 16a: getfield omn.nbr Z
      // 16d: ifeq 18c
      // 170: goto 177
      // 173: invokestatic omn.a (Loov;)Loov;
      // 176: athrow
      // 177: aload 0
      // 178: getfield omn.arg I
      // 17b: aload 0
      // 17c: getfield omn.zwd I
      // 17f: bipush 8
      // 181: isub
      // 182: bipush 2
      // 183: idiv
      // 184: iadd
      // 185: goto 190
      // 188: invokestatic omn.a (Loov;)Loov;
      // 18b: athrow
      // 18c: aload 0
      // 18d: getfield omn.arg I
      // 190: istore 9
      // 192: iload 8
      // 194: istore 10
      // 196: iload 4
      // 198: iload 1
      // 199: ifne 1b7
      // 19c: aload 5
      // 19e: invokevirtual java/lang/String.length ()I
      // 1a1: if_icmple 1b2
      // 1a4: goto 1ab
      // 1a7: invokestatic omn.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: aload 5
      // 1ad: invokevirtual java/lang/String.length ()I
      // 1b0: istore 4
      // 1b2: aload 5
      // 1b4: invokevirtual java/lang/String.length ()I
      // 1b7: iload 1
      // 1b8: ifne 1f9
      // 1bb: ifle 1f5
      // 1be: goto 1c5
      // 1c1: invokestatic omn.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: iload 6
      // 1c7: ifeq 1df
      // 1ca: goto 1d1
      // 1cd: invokestatic omn.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: aload 5
      // 1d3: bipush 0
      // 1d4: iload 3
      // 1d5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1d8: goto 1e1
      // 1db: invokestatic omn.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 5
      // 1e1: astore 11
      // 1e3: aload 0
      // 1e4: getfield omn.t81 Lowt;
      // 1e7: aload 11
      // 1e9: iload 8
      // 1eb: i2f
      // 1ec: iload 9
      // 1ee: i2f
      // 1ef: iload 2
      // 1f0: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 1f3: istore 10
      // 1f5: aload 0
      // 1f6: getfield omn.nsd I
      // 1f9: iload 1
      // 1fa: ifne 236
      // 1fd: aload 0
      // 1fe: getfield omn.w2q Ljava/lang/String;
      // 201: invokevirtual java/lang/String.length ()I
      // 204: if_icmplt 22e
      // 207: goto 20e
      // 20a: invokestatic omn.a (Loov;)Loov;
      // 20d: athrow
      // 20e: aload 0
      // 20f: getfield omn.w2q Ljava/lang/String;
      // 212: invokevirtual java/lang/String.length ()I
      // 215: iload 1
      // 216: ifne 236
      // 219: goto 220
      // 21c: invokestatic omn.a (Loov;)Loov;
      // 21f: athrow
      // 220: aload 0
      // 221: invokevirtual omn._li ()I
      // 224: if_icmplt 239
      // 227: goto 22e
      // 22a: invokestatic omn.a (Loov;)Loov;
      // 22d: athrow
      // 22e: bipush 1
      // 22f: goto 236
      // 232: invokestatic omn.a (Loov;)Loov;
      // 235: athrow
      // 236: goto 23a
      // 239: bipush 0
      // 23a: istore 11
      // 23c: iload 10
      // 23e: istore 12
      // 240: iload 6
      // 242: iload 1
      // 243: ifne 288
      // 246: ifne 27f
      // 249: goto 250
      // 24c: invokestatic omn.a (Loov;)Loov;
      // 24f: athrow
      // 250: iload 3
      // 251: iload 1
      // 252: ifne 274
      // 255: goto 25c
      // 258: invokestatic omn.a (Loov;)Loov;
      // 25b: athrow
      // 25c: ifle 277
      // 25f: goto 266
      // 262: invokestatic omn.a (Loov;)Loov;
      // 265: athrow
      // 266: iload 8
      // 268: aload 0
      // 269: getfield omn.a9i I
      // 26c: iadd
      // 26d: goto 274
      // 270: invokestatic omn.a (Loov;)Loov;
      // 273: athrow
      // 274: goto 279
      // 277: iload 8
      // 279: istore 12
      // 27b: iload 1
      // 27c: ifeq 29f
      // 27f: iload 11
      // 281: goto 288
      // 284: invokestatic omn.a (Loov;)Loov;
      // 287: athrow
      // 288: iload 1
      // 289: ifne 2a4
      // 28c: ifeq 29f
      // 28f: goto 296
      // 292: invokestatic omn.a (Loov;)Loov;
      // 295: athrow
      // 296: iload 10
      // 298: bipush 1
      // 299: isub
      // 29a: istore 12
      // 29c: iinc 10 -1
      // 29f: aload 5
      // 2a1: invokevirtual java/lang/String.length ()I
      // 2a4: iload 1
      // 2a5: ifne 2fe
      // 2a8: ifle 2fc
      // 2ab: goto 2b2
      // 2ae: invokestatic omn.a (Loov;)Loov;
      // 2b1: athrow
      // 2b2: iload 6
      // 2b4: iload 1
      // 2b5: ifne 2fe
      // 2b8: goto 2bf
      // 2bb: invokestatic omn.a (Loov;)Loov;
      // 2be: athrow
      // 2bf: ifeq 2fc
      // 2c2: goto 2c9
      // 2c5: invokestatic omn.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: iload 3
      // 2ca: iload 1
      // 2cb: ifne 2fe
      // 2ce: goto 2d5
      // 2d1: invokestatic omn.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: aload 5
      // 2d7: invokevirtual java/lang/String.length ()I
      // 2da: if_icmpge 2fc
      // 2dd: goto 2e4
      // 2e0: invokestatic omn.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: aload 0
      // 2e5: getfield omn.t81 Lowt;
      // 2e8: aload 5
      // 2ea: iload 3
      // 2eb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2ee: iload 10
      // 2f0: i2f
      // 2f1: fconst_1
      // 2f2: fadd
      // 2f3: iload 9
      // 2f5: i2f
      // 2f6: iload 2
      // 2f7: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 2fa: istore 10
      // 2fc: iload 7
      // 2fe: iload 1
      // 2ff: ifne 375
      // 302: ifeq 373
      // 305: goto 30c
      // 308: invokestatic omn.a (Loov;)Loov;
      // 30b: athrow
      // 30c: iload 11
      // 30e: iload 1
      // 30f: ifne 357
      // 312: goto 319
      // 315: invokestatic omn.a (Loov;)Loov;
      // 318: athrow
      // 319: ifeq 34e
      // 31c: goto 323
      // 31f: invokestatic omn.a (Loov;)Loov;
      // 322: athrow
      // 323: iload 12
      // 325: i2f
      // 326: iload 9
      // 328: bipush 1
      // 329: isub
      // 32a: i2f
      // 32b: iload 12
      // 32d: bipush 1
      // 32e: iadd
      // 32f: i2f
      // 330: iload 9
      // 332: bipush 1
      // 333: iadd
      // 334: aload 0
      // 335: getfield omn.t81 Lowt;
      // 338: getfield owt.rr7 I
      // 33b: iadd
      // 33c: i2f
      // 33d: ldc -3092272
      // 33f: nop
      // 340: invokestatic b0t.df9 (FFFFI)V
      // 343: iload 1
      // 344: ifeq 373
      // 347: goto 34e
      // 34a: invokestatic omn.a (Loov;)Loov;
      // 34d: athrow
      // 34e: iload 12
      // 350: goto 357
      // 353: invokestatic omn.a (Loov;)Loov;
      // 356: athrow
      // 357: i2f
      // 358: iload 9
      // 35a: bipush 1
      // 35b: isub
      // 35c: i2f
      // 35d: iload 12
      // 35f: bipush 1
      // 360: iadd
      // 361: i2f
      // 362: iload 9
      // 364: aload 0
      // 365: getfield omn.t81 Lowt;
      // 368: getfield owt.rr7 I
      // 36b: iadd
      // 36c: i2f
      // 36d: ldc -3092272
      // 36f: nop
      // 370: invokestatic b0t.df9 (FFFFI)V
      // 373: iload 4
      // 375: iload 3
      // 376: iload 1
      // 377: ifne 39c
      // 37a: if_icmpeq 3b9
      // 37d: goto 384
      // 380: invokestatic omn.a (Loov;)Loov;
      // 383: athrow
      // 384: iload 8
      // 386: aload 0
      // 387: getfield omn.t81 Lowt;
      // 38a: aload 5
      // 38c: bipush 0
      // 38d: iload 4
      // 38f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 392: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 395: goto 39c
      // 398: invokestatic omn.a (Loov;)Loov;
      // 39b: athrow
      // 39c: iadd
      // 39d: istore 13
      // 39f: aload 0
      // 3a0: iload 12
      // 3a2: iload 9
      // 3a4: bipush 1
      // 3a5: isub
      // 3a6: iload 13
      // 3a8: bipush 1
      // 3a9: isub
      // 3aa: iload 9
      // 3ac: bipush 1
      // 3ad: iadd
      // 3ae: aload 0
      // 3af: getfield omn.t81 Lowt;
      // 3b2: getfield owt.rr7 I
      // 3b5: iadd
      // 3b6: invokespecial omn.ktc (IIII)V
      // 3b9: return
   }

   private void ktc(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: iload 1
      // 06: iload 3
      // 07: iload 5
      // 09: ifeq 21
      // 0c: if_icmpge 1e
      // 0f: goto 16
      // 12: invokestatic omn.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 1
      // 17: istore 6
      // 19: iload 3
      // 1a: istore 1
      // 1b: iload 6
      // 1d: istore 3
      // 1e: iload 2
      // 1f: iload 4
      // 21: iload 5
      // 23: ifeq 44
      // 26: if_icmpge 3a
      // 29: goto 30
      // 2c: invokestatic omn.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 2
      // 31: istore 6
      // 33: iload 4
      // 35: istore 2
      // 36: iload 6
      // 38: istore 4
      // 3a: iload 3
      // 3b: aload 0
      // 3c: getfield omn._qn I
      // 3f: aload 0
      // 40: getfield omn.a9i I
      // 43: iadd
      // 44: iload 5
      // 46: ifeq 67
      // 49: if_icmple 5d
      // 4c: goto 53
      // 4f: invokestatic omn.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield omn._qn I
      // 57: aload 0
      // 58: getfield omn.a9i I
      // 5b: iadd
      // 5c: istore 3
      // 5d: iload 1
      // 5e: aload 0
      // 5f: getfield omn._qn I
      // 62: aload 0
      // 63: getfield omn.a9i I
      // 66: iadd
      // 67: iload 5
      // 69: ifeq 85
      // 6c: if_icmple 87
      // 6f: goto 76
      // 72: invokestatic omn.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: getfield omn._qn I
      // 7a: aload 0
      // 7b: getfield omn.a9i I
      // 7e: goto 85
      // 81: invokestatic omn.a (Loov;)Loov;
      // 84: athrow
      // 85: iadd
      // 86: istore 1
      // 87: invokestatic jom.yut ()Ljom;
      // 8a: astore 6
      // 8c: aload 6
      // 8e: invokevirtual jom.zuq ()Lq3g;
      // 91: astore 7
      // 93: fconst_0
      // 94: fconst_0
      // 95: ldc 255.0
      // 97: nop
      // 98: ldc 255.0
      // 9a: nop
      // 9b: invokestatic hzu.wn0 (FFFF)V
      // 9e: invokestatic hzu.m_1 ()V
      // a1: invokestatic hzu.mib ()V
      // a4: sipush 5387
      // a7: invokestatic hzu.njz (I)V
      // aa: aload 7
      // ac: bipush 7
      // ae: getstatic gnl.gx3 Lbe7;
      // b1: invokevirtual q3g.ezr (ILbe7;)V
      // b4: aload 7
      // b6: iload 1
      // b7: i2d
      // b8: iload 4
      // ba: i2d
      // bb: dconst_0
      // bc: invokevirtual q3g.g5o (DDD)Lq3g;
      // bf: invokevirtual q3g.pzw ()V
      // c2: aload 7
      // c4: iload 3
      // c5: i2d
      // c6: iload 4
      // c8: i2d
      // c9: dconst_0
      // ca: invokevirtual q3g.g5o (DDD)Lq3g;
      // cd: invokevirtual q3g.pzw ()V
      // d0: aload 7
      // d2: iload 3
      // d3: i2d
      // d4: iload 2
      // d5: i2d
      // d6: dconst_0
      // d7: invokevirtual q3g.g5o (DDD)Lq3g;
      // da: invokevirtual q3g.pzw ()V
      // dd: aload 7
      // df: iload 1
      // e0: i2d
      // e1: iload 2
      // e2: i2d
      // e3: dconst_0
      // e4: invokevirtual q3g.g5o (DDD)Lq3g;
      // e7: invokevirtual q3g.pzw ()V
      // ea: aload 6
      // ec: invokevirtual jom.q7g ()V
      // ef: invokestatic hzu.gyq ()V
      // f2: invokestatic hzu.rqj ()V
      // f5: return
   }

   public void hh0(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: putfield omn.pst I
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 27
      // 0e: getfield omn.w2q Ljava/lang/String;
      // 11: invokevirtual java/lang/String.length ()I
      // 14: iload 1
      // 15: if_icmple 33
      // 18: goto 1f
      // 1b: invokestatic omn.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic omn.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield omn.w2q Ljava/lang/String;
      // 2b: bipush 0
      // 2c: iload 1
      // 2d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 30: putfield omn.w2q Ljava/lang/String;
      // 33: return
   }

   public int _li() {
      return this.pst;
   }

   public int r5o() {
      return this.nsd;
   }

   public boolean ex4() {
      return this.nbr;
   }

   public void _0t(boolean var1) {
      this.nbr = var1;
   }

   public void sbj(int var1) {
      this.br9 = var1;
   }

   public void ife(int var1) {
      this.bsk = var1;
   }

   public void kd0(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 29
      // 09: ifeq 38
      // 0c: goto 13
      // 0f: invokestatic omn.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifeq 39
      // 18: goto 1f
      // 1b: invokestatic omn.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getfield omn.yxy Z
      // 22: goto 29
      // 25: invokestatic omn.a (Loov;)Loov;
      // 28: athrow
      // 29: ifne 38
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: putfield omn.van I
      // 31: goto 38
      // 34: invokestatic omn.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: iload 1
      // 3a: putfield omn.yxy Z
      // 3d: return
   }

   public boolean y_5() {
      return this.yxy;
   }

   public void m30(boolean var1) {
      this.iby = var1;
   }

   public int k7l() {
      return this._43;
   }

   public int ppc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 25
      // 09: invokevirtual omn.ex4 ()Z
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic omn.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield omn.a9i I
      // 1a: bipush 8
      // 1c: isub
      // 1d: goto 28
      // 20: invokestatic omn.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield omn.a9i I
      // 28: ireturn
   }

   public void y6m(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield omn.w2q Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: istore 3
      // 00c: iload 1
      // 00d: iload 2
      // 00e: ifeq 01f
      // 011: iload 3
      // 012: if_icmple 01e
      // 015: goto 01c
      // 018: invokestatic omn.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 3
      // 01d: istore 1
      // 01e: iload 1
      // 01f: iload 2
      // 020: ifeq 02e
      // 023: ifge 02f
      // 026: goto 02d
      // 029: invokestatic omn.a (Loov;)Loov;
      // 02c: athrow
      // 02d: bipush 0
      // 02e: istore 1
      // 02f: aload 0
      // 030: iload 1
      // 031: putfield omn._43 I
      // 034: aload 0
      // 035: iload 2
      // 036: ifeq 04e
      // 039: getfield omn.t81 Lowt;
      // 03c: ifnull 123
      // 03f: goto 046
      // 042: invokestatic omn.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: goto 04e
      // 04a: invokestatic omn.a (Loov;)Loov;
      // 04d: athrow
      // 04e: getfield omn.uei I
      // 051: iload 2
      // 052: ifeq 070
      // 055: iload 3
      // 056: if_icmple 06c
      // 059: goto 060
      // 05c: invokestatic omn.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: iload 3
      // 062: putfield omn.uei I
      // 065: goto 06c
      // 068: invokestatic omn.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: invokevirtual omn.ppc ()I
      // 070: istore 4
      // 072: aload 0
      // 073: getfield omn.t81 Lowt;
      // 076: aload 0
      // 077: getfield omn.w2q Ljava/lang/String;
      // 07a: aload 0
      // 07b: getfield omn.uei I
      // 07e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 081: iload 4
      // 083: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 086: astore 5
      // 088: aload 5
      // 08a: invokevirtual java/lang/String.length ()I
      // 08d: aload 0
      // 08e: getfield omn.uei I
      // 091: iadd
      // 092: istore 6
      // 094: iload 1
      // 095: aload 0
      // 096: getfield omn.uei I
      // 099: iload 2
      // 09a: ifeq 0cb
      // 09d: if_icmpne 0c8
      // 0a0: goto 0a7
      // 0a3: invokestatic omn.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: dup
      // 0a9: getfield omn.uei I
      // 0ac: aload 0
      // 0ad: getfield omn.t81 Lowt;
      // 0b0: aload 0
      // 0b1: getfield omn.w2q Ljava/lang/String;
      // 0b4: iload 4
      // 0b6: bipush 1
      // 0b7: invokevirtual owt.m8q (Ljava/lang/String;IZ)Ljava/lang/String;
      // 0ba: invokevirtual java/lang/String.length ()I
      // 0bd: isub
      // 0be: putfield omn.uei I
      // 0c1: goto 0c8
      // 0c4: invokestatic omn.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 1
      // 0c9: iload 6
      // 0cb: iload 2
      // 0cc: ifeq 0fd
      // 0cf: if_icmple 0f1
      // 0d2: goto 0d9
      // 0d5: invokestatic omn.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield omn.uei I
      // 0de: iload 1
      // 0df: iload 6
      // 0e1: isub
      // 0e2: iadd
      // 0e3: putfield omn.uei I
      // 0e6: iload 2
      // 0e7: ifne 116
      // 0ea: goto 0f1
      // 0ed: invokestatic omn.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 1
      // 0f2: aload 0
      // 0f3: getfield omn.uei I
      // 0f6: goto 0fd
      // 0f9: invokestatic omn.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: if_icmpgt 116
      // 100: aload 0
      // 101: dup
      // 102: getfield omn.uei I
      // 105: aload 0
      // 106: getfield omn.uei I
      // 109: iload 1
      // 10a: isub
      // 10b: isub
      // 10c: putfield omn.uei I
      // 10f: goto 116
      // 112: invokestatic omn.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: aload 0
      // 118: getfield omn.uei I
      // 11b: bipush 0
      // 11c: iload 3
      // 11d: invokestatic fe6.faa (III)I
      // 120: putfield omn.uei I
      // 123: return
   }

   public void ypg(boolean var1) {
      this.ob_ = var1;
   }

   public boolean fwy() {
      return this.xh8;
   }

   public void je4(boolean var1) {
      this.xh8 = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
