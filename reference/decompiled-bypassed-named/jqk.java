import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class jqk extends b0t {
   private final int kol;
   private final owt ndh;
   public int kzw;
   public int mr4;
   private final int uou;
   private final int mn8;
   private String yr9 = "";
   private int lvr = 32;
   private int snm;
   private boolean fm5 = true;
   private boolean b58 = true;
   private boolean ves;
   private boolean q6h = true;
   private int p3a;
   private int _76;
   private int mte;
   private int vhj = 16777215;
   private int t30 = 7368816;
   private boolean kud = true;
   private gkx$lpc gw1;
   private Predicate c7t = Predicates.alwaysTrue();

   public jqk(int var1, owt var2, int var3, int var4, int var5, int var6) {
      this.kol = var1;
      this.ndh = var2;
      this.kzw = var3;
      this.mr4 = var4;
      this.uou = var5;
      this.mn8 = var6;
   }

   public void zku(gkx$lpc var1) {
      this.gw1 = var1;
   }

   public void zf9() {
      this.snm++;
   }

   public void nrl(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield jqk.c7t Lcom/google/common/base/Predicate;
      // 08: aload 1
      // 09: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 0e: iload 2
      // 0f: ifeq 27
      // 12: ifeq 56
      // 15: goto 1c
      // 18: invokestatic jqk.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/lang/String.length ()I
      // 20: goto 27
      // 23: invokestatic jqk.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield jqk.lvr I
      // 2b: if_icmple 46
      // 2e: aload 0
      // 2f: aload 1
      // 30: bipush 0
      // 31: aload 0
      // 32: getfield jqk.lvr I
      // 35: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 38: putfield jqk.yr9 Ljava/lang/String;
      // 3b: iload 2
      // 3c: ifne 52
      // 3f: goto 46
      // 42: invokestatic jqk.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: aload 1
      // 48: putfield jqk.yr9 Ljava/lang/String;
      // 4b: goto 52
      // 4e: invokestatic jqk.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: invokevirtual jqk.f7g ()V
      // 56: return
   }

   public String xct() {
      return this.yr9;
   }

   public String ih1() {
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
      // 06: ifeq 26
      // 09: getfield jqk._76 I
      // 0c: aload 0
      // 0d: getfield jqk.mte I
      // 10: if_icmpge 25
      // 13: goto 1a
      // 16: invokestatic jqk.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield jqk._76 I
      // 1e: goto 29
      // 21: invokestatic jqk.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield jqk.mte I
      // 29: istore 2
      // 2a: aload 0
      // 2b: iload 1
      // 2c: ifeq 4c
      // 2f: getfield jqk._76 I
      // 32: aload 0
      // 33: getfield jqk.mte I
      // 36: if_icmpge 4b
      // 39: goto 40
      // 3c: invokestatic jqk.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield jqk.mte I
      // 44: goto 4f
      // 47: invokestatic jqk.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield jqk._76 I
      // 4f: istore 3
      // 50: aload 0
      // 51: getfield jqk.yr9 Ljava/lang/String;
      // 54: iload 2
      // 55: iload 3
      // 56: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 59: areturn
   }

   public void m00(Predicate var1) {
      this.c7t = var1;
   }

   public void efs(String param1) {
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
      // 004: invokestatic OpaquePredicate.b ()I
      // 007: aload 1
      // 008: invokestatic _xi._dn (Ljava/lang/String;)Ljava/lang/String;
      // 00b: astore 4
      // 00d: istore 2
      // 00e: aload 0
      // 00f: iload 2
      // 010: ifeq 030
      // 013: getfield jqk._76 I
      // 016: aload 0
      // 017: getfield jqk.mte I
      // 01a: if_icmpge 02f
      // 01d: goto 024
      // 020: invokestatic jqk.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: getfield jqk._76 I
      // 028: goto 033
      // 02b: invokestatic jqk.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield jqk.mte I
      // 033: istore 5
      // 035: aload 0
      // 036: iload 2
      // 037: ifeq 057
      // 03a: getfield jqk._76 I
      // 03d: aload 0
      // 03e: getfield jqk.mte I
      // 041: if_icmpge 056
      // 044: goto 04b
      // 047: invokestatic jqk.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield jqk.mte I
      // 04f: goto 05a
      // 052: invokestatic jqk.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: getfield jqk._76 I
      // 05a: istore 6
      // 05c: aload 0
      // 05d: getfield jqk.lvr I
      // 060: aload 0
      // 061: getfield jqk.yr9 Ljava/lang/String;
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
      // 074: getfield jqk.yr9 Ljava/lang/String;
      // 077: invokevirtual java/lang/String.length ()I
      // 07a: iload 2
      // 07b: ifeq 0a6
      // 07e: ifle 0a4
      // 081: goto 088
      // 084: invokestatic jqk.a (Loov;)Loov;
      // 087: athrow
      // 088: new java/lang/StringBuilder
      // 08b: dup
      // 08c: invokespecial java/lang/StringBuilder.<init> ()V
      // 08f: aload 3
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: aload 0
      // 094: getfield jqk.yr9 Ljava/lang/String;
      // 097: bipush 0
      // 098: iload 5
      // 09a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a3: astore 3
      // 0a4: iload 7
      // 0a6: iload 2
      // 0a7: ifeq 0f4
      // 0aa: aload 4
      // 0ac: invokevirtual java/lang/String.length ()I
      // 0af: if_icmpge 0db
      // 0b2: goto 0b9
      // 0b5: invokestatic jqk.a (Loov;)Loov;
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
      // 0d8: ifne 0f6
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
      // 0f7: getfield jqk.yr9 Ljava/lang/String;
      // 0fa: invokevirtual java/lang/String.length ()I
      // 0fd: iload 2
      // 0fe: ifeq 159
      // 101: ifle 144
      // 104: goto 10b
      // 107: invokestatic jqk.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 6
      // 10d: iload 2
      // 10e: ifeq 159
      // 111: goto 118
      // 114: invokestatic jqk.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: getfield jqk.yr9 Ljava/lang/String;
      // 11c: invokevirtual java/lang/String.length ()I
      // 11f: if_icmpge 144
      // 122: goto 129
      // 125: invokestatic jqk.a (Loov;)Loov;
      // 128: athrow
      // 129: new java/lang/StringBuilder
      // 12c: dup
      // 12d: invokespecial java/lang/StringBuilder.<init> ()V
      // 130: aload 3
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: aload 0
      // 135: getfield jqk.yr9 Ljava/lang/String;
      // 138: iload 6
      // 13a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 143: astore 3
      // 144: aload 0
      // 145: iload 2
      // 146: ifeq 177
      // 149: getfield jqk.c7t Lcom/google/common/base/Predicate;
      // 14c: aload 3
      // 14d: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 152: goto 159
      // 155: invokestatic jqk.a (Loov;)Loov;
      // 158: athrow
      // 159: ifeq 1a0
      // 15c: aload 0
      // 15d: aload 3
      // 15e: putfield jqk.yr9 Ljava/lang/String;
      // 161: aload 0
      // 162: iload 5
      // 164: aload 0
      // 165: getfield jqk.mte I
      // 168: isub
      // 169: iload 8
      // 16b: iadd
      // 16c: invokevirtual jqk.yli (I)V
      // 16f: aload 0
      // 170: goto 177
      // 173: invokestatic jqk.a (Loov;)Loov;
      // 176: athrow
      // 177: getfield jqk.gw1 Lgkx$lpc;
      // 17a: iload 2
      // 17b: ifeq 193
      // 17e: ifnull 1a0
      // 181: goto 188
      // 184: invokestatic jqk.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 0
      // 189: getfield jqk.gw1 Lgkx$lpc;
      // 18c: goto 193
      // 18f: invokestatic jqk.a (Loov;)Loov;
      // 192: athrow
      // 193: aload 0
      // 194: getfield jqk.kol I
      // 197: aload 0
      // 198: getfield jqk.yr9 Ljava/lang/String;
      // 19b: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 1a0: return
   }

   public void j_w(int param1) {
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
      // 05: getfield jqk.yr9 Ljava/lang/String;
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: iload 2
      // 0c: ifne 2f
      // 0f: ifeq 5d
      // 12: goto 19
      // 15: invokestatic jqk.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifne 50
      // 1e: goto 25
      // 21: invokestatic jqk.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield jqk.mte I
      // 28: goto 2f
      // 2b: invokestatic jqk.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield jqk._76 I
      // 33: if_icmpeq 48
      // 36: aload 0
      // 37: ldc ""
      // 39: nop
      // 3a: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 3d: iload 2
      // 3e: ifeq 5d
      // 41: goto 48
      // 44: invokestatic jqk.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic jqk.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: iload 1
      // 52: invokevirtual jqk.gs2 (I)I
      // 55: aload 0
      // 56: getfield jqk._76 I
      // 59: isub
      // 5a: invokevirtual jqk.kzc (I)V
      // 5d: return
   }

   public void kzc(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield jqk.yr9 Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: iload 2
      // 00c: ifne 024
      // 00f: ifeq 16b
      // 012: goto 019
      // 015: invokestatic jqk.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield jqk.mte I
      // 01d: goto 024
      // 020: invokestatic jqk.a (Loov;)Loov;
      // 023: athrow
      // 024: iload 2
      // 025: ifne 050
      // 028: aload 0
      // 029: getfield jqk._76 I
      // 02c: if_icmpeq 048
      // 02f: goto 036
      // 032: invokestatic jqk.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: ldc ""
      // 039: nop
      // 03a: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 03d: iload 2
      // 03e: ifeq 16b
      // 041: goto 048
      // 044: invokestatic jqk.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 1
      // 049: goto 050
      // 04c: invokestatic jqk.a (Loov;)Loov;
      // 04f: athrow
      // 050: iload 2
      // 051: ifne 05f
      // 054: ifge 062
      // 057: goto 05e
      // 05a: invokestatic jqk.a (Loov;)Loov;
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
      // 06f: invokestatic jqk.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield jqk._76 I
      // 077: iload 1
      // 078: iadd
      // 079: goto 080
      // 07c: invokestatic jqk.a (Loov;)Loov;
      // 07f: athrow
      // 080: goto 087
      // 083: aload 0
      // 084: getfield jqk._76 I
      // 087: istore 4
      // 089: iload 3
      // 08a: iload 2
      // 08b: ifne 0a7
      // 08e: ifeq 0a3
      // 091: goto 098
      // 094: invokestatic jqk.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: getfield jqk._76 I
      // 09c: goto 0a9
      // 09f: invokestatic jqk.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield jqk._76 I
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
      // 0bc: invokestatic jqk.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield jqk.yr9 Ljava/lang/String;
      // 0c4: bipush 0
      // 0c5: iload 4
      // 0c7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ca: astore 6
      // 0cc: iload 5
      // 0ce: iload 2
      // 0cf: ifne 10b
      // 0d2: aload 0
      // 0d3: getfield jqk.yr9 Ljava/lang/String;
      // 0d6: invokevirtual java/lang/String.length ()I
      // 0d9: if_icmpge 100
      // 0dc: goto 0e3
      // 0df: invokestatic jqk.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: new java/lang/StringBuilder
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ea: aload 6
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: aload 0
      // 0f0: getfield jqk.yr9 Ljava/lang/String;
      // 0f3: iload 5
      // 0f5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: astore 6
      // 100: aload 0
      // 101: getfield jqk.c7t Lcom/google/common/base/Predicate;
      // 104: aload 6
      // 106: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 10b: iload 2
      // 10c: ifne 132
      // 10f: ifeq 16b
      // 112: goto 119
      // 115: invokestatic jqk.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 2
      // 11b: ifne 142
      // 11e: goto 125
      // 121: invokestatic jqk.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 6
      // 127: putfield jqk.yr9 Ljava/lang/String;
      // 12a: iload 3
      // 12b: goto 132
      // 12e: invokestatic jqk.a (Loov;)Loov;
      // 131: athrow
      // 132: ifeq 141
      // 135: aload 0
      // 136: iload 1
      // 137: invokevirtual jqk.yli (I)V
      // 13a: goto 141
      // 13d: invokestatic jqk.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: getfield jqk.gw1 Lgkx$lpc;
      // 145: iload 2
      // 146: ifne 15e
      // 149: ifnull 16b
      // 14c: goto 153
      // 14f: invokestatic jqk.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 0
      // 154: getfield jqk.gw1 Lgkx$lpc;
      // 157: goto 15e
      // 15a: invokestatic jqk.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 0
      // 15f: getfield jqk.kol I
      // 162: aload 0
      // 163: getfield jqk.yr9 Ljava/lang/String;
      // 166: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 16b: return
   }

   public int currentEvent() {
      return this.kol;
   }

   public int gs2(int var1) {
      return this.zyk(var1, this.jyp());
   }

   public int zyk(int var1, int var2) {
      return this.q6z(var1, var2, true);
   }

   public int q6z(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: iload 2
      // 006: istore 5
      // 008: iload 1
      // 009: iload 4
      // 00b: ifeq 019
      // 00e: ifge 01c
      // 011: goto 018
      // 014: invokestatic jqk.a (Loov;)Loov;
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
      // 03e: invokestatic jqk.a (Loov;)Loov;
      // 041: athrow
      // 042: ifne 0d0
      // 045: goto 04c
      // 048: invokestatic jqk.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield jqk.yr9 Ljava/lang/String;
      // 050: invokevirtual java/lang/String.length ()I
      // 053: istore 9
      // 055: aload 0
      // 056: getfield jqk.yr9 Ljava/lang/String;
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
      // 070: invokestatic jqk.a (Loov;)Loov;
      // 073: athrow
      // 074: iload 9
      // 076: istore 5
      // 078: iload 4
      // 07a: ifne 0cb
      // 07d: iload 3
      // 07e: goto 085
      // 081: invokestatic jqk.a (Loov;)Loov;
      // 084: athrow
      // 085: ifeq 0cb
      // 088: iload 5
      // 08a: iload 9
      // 08c: iload 4
      // 08e: ifeq 02c
      // 091: goto 098
      // 094: invokestatic jqk.a (Loov;)Loov;
      // 097: athrow
      // 098: iload 4
      // 09a: ifeq 0b9
      // 09d: if_icmpge 0cb
      // 0a0: goto 0a7
      // 0a3: invokestatic jqk.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield jqk.yr9 Ljava/lang/String;
      // 0ab: iload 5
      // 0ad: invokevirtual java/lang/String.charAt (I)C
      // 0b0: bipush 32
      // 0b2: goto 0b9
      // 0b5: invokestatic jqk.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: if_icmpne 0cb
      // 0bc: iinc 5 1
      // 0bf: iload 4
      // 0c1: ifne 07d
      // 0c4: goto 0cb
      // 0c7: invokestatic jqk.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: iload 4
      // 0cd: ifne 161
      // 0d0: iload 3
      // 0d1: goto 0d8
      // 0d4: invokestatic jqk.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: ifeq 131
      // 0db: iload 5
      // 0dd: iload 4
      // 0df: ifeq 133
      // 0e2: goto 0e9
      // 0e5: invokestatic jqk.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 4
      // 0eb: ifeq 133
      // 0ee: goto 0f5
      // 0f1: invokestatic jqk.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifle 131
      // 0f8: goto 0ff
      // 0fb: invokestatic jqk.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield jqk.yr9 Ljava/lang/String;
      // 103: iload 5
      // 105: bipush 1
      // 106: isub
      // 107: invokevirtual java/lang/String.charAt (I)C
      // 10a: iload 4
      // 10c: ifeq 133
      // 10f: goto 116
      // 112: invokestatic jqk.a (Loov;)Loov;
      // 115: athrow
      // 116: bipush 32
      // 118: if_icmpne 131
      // 11b: goto 122
      // 11e: invokestatic jqk.a (Loov;)Loov;
      // 121: athrow
      // 122: iinc 5 -1
      // 125: iload 4
      // 127: ifne 0d0
      // 12a: goto 131
      // 12d: invokestatic jqk.a (Loov;)Loov;
      // 130: athrow
      // 131: iload 5
      // 133: ifle 161
      // 136: aload 0
      // 137: getfield jqk.yr9 Ljava/lang/String;
      // 13a: iload 5
      // 13c: bipush 1
      // 13d: isub
      // 13e: invokevirtual java/lang/String.charAt (I)C
      // 141: bipush 32
      // 143: iload 4
      // 145: ifeq 02c
      // 148: goto 14f
      // 14b: invokestatic jqk.a (Loov;)Loov;
      // 14e: athrow
      // 14f: if_icmpeq 161
      // 152: iinc 5 -1
      // 155: iload 4
      // 157: ifne 131
      // 15a: goto 161
      // 15d: invokestatic jqk.a (Loov;)Loov;
      // 160: athrow
      // 161: iinc 8 1
      // 164: iload 4
      // 166: ifne 028
      // 169: iload 5
      // 16b: ireturn
   }

   public void yli(int var1) {
      this.s2b(this.mte + var1);
   }

   public void s2b(int var1) {
      this._76 = var1;
      int var2 = this.yr9.length();
      this._76 = fe6.faa(this._76, 0, var2);
      this.omw(this._76);
   }

   public void fvi() {
      this.s2b(0);
   }

   public void f7g() {
      this.s2b(this.yr9.length());
   }

   public boolean pst(char param1, int param2) {
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
      // 005: getfield jqk.ves Z
      // 008: iload 3
      // 009: ifeq 020
      // 00c: ifne 01c
      // 00f: goto 016
      // 012: invokestatic jqk.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic jqk.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 2
      // 01d: invokestatic ShaderHelper.ul2 (I)Z
      // 020: iload 3
      // 021: ifeq 041
      // 024: ifeq 03d
      // 027: goto 02e
      // 02a: invokestatic jqk.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual jqk.f7g ()V
      // 032: aload 0
      // 033: bipush 0
      // 034: invokevirtual jqk.omw (I)V
      // 037: bipush 1
      // 038: ireturn
      // 039: invokestatic jqk.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iload 2
      // 03e: invokestatic ShaderHelper.y4j (I)Z
      // 041: iload 3
      // 042: ifeq 060
      // 045: ifeq 05c
      // 048: goto 04f
      // 04b: invokestatic jqk.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: invokevirtual jqk.ih1 ()Ljava/lang/String;
      // 053: invokestatic ShaderHelper.vjv (Ljava/lang/String;)V
      // 056: bipush 1
      // 057: ireturn
      // 058: invokestatic jqk.a (Loov;)Loov;
      // 05b: athrow
      // 05c: iload 2
      // 05d: invokestatic ShaderHelper.foo (I)Z
      // 060: iload 3
      // 061: ifeq 09b
      // 064: ifeq 097
      // 067: goto 06e
      // 06a: invokestatic jqk.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield jqk.q6h Z
      // 072: iload 3
      // 073: ifeq 096
      // 076: goto 07d
      // 079: invokestatic jqk.a (Loov;)Loov;
      // 07c: athrow
      // 07d: ifeq 095
      // 080: goto 087
      // 083: invokestatic jqk.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: invokestatic ShaderHelper.b0r ()Ljava/lang/String;
      // 08b: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 08e: goto 095
      // 091: invokestatic jqk.a (Loov;)Loov;
      // 094: athrow
      // 095: bipush 1
      // 096: ireturn
      // 097: iload 2
      // 098: invokestatic ShaderHelper.uqk (I)Z
      // 09b: iload 3
      // 09c: ifeq 0da
      // 09f: ifeq 0d9
      // 0a2: goto 0a9
      // 0a5: invokestatic jqk.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: invokevirtual jqk.ih1 ()Ljava/lang/String;
      // 0ad: invokestatic ShaderHelper.vjv (Ljava/lang/String;)V
      // 0b0: aload 0
      // 0b1: getfield jqk.q6h Z
      // 0b4: iload 3
      // 0b5: ifeq 0d8
      // 0b8: goto 0bf
      // 0bb: invokestatic jqk.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifeq 0d7
      // 0c2: goto 0c9
      // 0c5: invokestatic jqk.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: ldc ""
      // 0cc: nop
      // 0cd: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 0d0: goto 0d7
      // 0d3: invokestatic jqk.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: bipush 1
      // 0d8: ireturn
      // 0d9: iload 2
      // 0da: iload 3
      // 0db: ifeq 329
      // 0de: lookupswitch 583 6 14 62 199 166 203 201 205 323 207 445 211 486
      // 118: invokestatic jqk.a (Loov;)Loov;
      // 11b: athrow
      // 11c: invokestatic ShaderHelper.t_s ()Z
      // 11f: iload 3
      // 120: ifeq 168
      // 123: goto 12a
      // 126: invokestatic jqk.a (Loov;)Loov;
      // 129: athrow
      // 12a: ifeq 15d
      // 12d: goto 134
      // 130: invokestatic jqk.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 0
      // 135: getfield jqk.q6h Z
      // 138: iload 3
      // 139: ifeq 183
      // 13c: goto 143
      // 13f: invokestatic jqk.a (Loov;)Loov;
      // 142: athrow
      // 143: ifeq 182
      // 146: goto 14d
      // 149: invokestatic jqk.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: bipush -1
      // 14f: invokevirtual jqk.j_w (I)V
      // 152: iload 3
      // 153: ifne 182
      // 156: goto 15d
      // 159: invokestatic jqk.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield jqk.q6h Z
      // 161: goto 168
      // 164: invokestatic jqk.a (Loov;)Loov;
      // 167: athrow
      // 168: iload 3
      // 169: ifeq 183
      // 16c: ifeq 182
      // 16f: goto 176
      // 172: invokestatic jqk.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: bipush -1
      // 178: invokevirtual jqk.kzc (I)V
      // 17b: goto 182
      // 17e: invokestatic jqk.a (Loov;)Loov;
      // 181: athrow
      // 182: bipush 1
      // 183: ireturn
      // 184: invokestatic ShaderHelper.dmk ()Z
      // 187: ifeq 19a
      // 18a: aload 0
      // 18b: bipush 0
      // 18c: invokevirtual jqk.omw (I)V
      // 18f: iload 3
      // 190: ifne 1a5
      // 193: goto 19a
      // 196: invokestatic jqk.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 0
      // 19b: invokevirtual jqk.fvi ()V
      // 19e: goto 1a5
      // 1a1: invokestatic jqk.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: bipush 1
      // 1a6: ireturn
      // 1a7: invokestatic ShaderHelper.dmk ()Z
      // 1aa: iload 3
      // 1ab: ifeq 1fc
      // 1ae: ifeq 1f2
      // 1b1: goto 1b8
      // 1b4: invokestatic jqk.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: invokestatic ShaderHelper.t_s ()Z
      // 1bb: ifeq 1dd
      // 1be: goto 1c5
      // 1c1: invokestatic jqk.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: aload 0
      // 1c7: bipush -1
      // 1c8: aload 0
      // 1c9: invokevirtual jqk.x9m ()I
      // 1cc: invokevirtual jqk.zyk (II)I
      // 1cf: invokevirtual jqk.omw (I)V
      // 1d2: iload 3
      // 1d3: ifne 21f
      // 1d6: goto 1dd
      // 1d9: invokestatic jqk.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: aload 0
      // 1df: invokevirtual jqk.x9m ()I
      // 1e2: bipush 1
      // 1e3: isub
      // 1e4: invokevirtual jqk.omw (I)V
      // 1e7: iload 3
      // 1e8: ifne 21f
      // 1eb: goto 1f2
      // 1ee: invokestatic jqk.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: invokestatic ShaderHelper.t_s ()Z
      // 1f5: goto 1fc
      // 1f8: invokestatic jqk.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: ifeq 213
      // 1ff: aload 0
      // 200: aload 0
      // 201: bipush -1
      // 202: invokevirtual jqk.gs2 (I)I
      // 205: invokevirtual jqk.s2b (I)V
      // 208: iload 3
      // 209: ifne 21f
      // 20c: goto 213
      // 20f: invokestatic jqk.a (Loov;)Loov;
      // 212: athrow
      // 213: aload 0
      // 214: bipush -1
      // 215: invokevirtual jqk.yli (I)V
      // 218: goto 21f
      // 21b: invokestatic jqk.a (Loov;)Loov;
      // 21e: athrow
      // 21f: bipush 1
      // 220: ireturn
      // 221: invokestatic ShaderHelper.dmk ()Z
      // 224: iload 3
      // 225: ifeq 276
      // 228: ifeq 26c
      // 22b: goto 232
      // 22e: invokestatic jqk.a (Loov;)Loov;
      // 231: athrow
      // 232: invokestatic ShaderHelper.t_s ()Z
      // 235: ifeq 257
      // 238: goto 23f
      // 23b: invokestatic jqk.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 0
      // 240: aload 0
      // 241: bipush 1
      // 242: aload 0
      // 243: invokevirtual jqk.x9m ()I
      // 246: invokevirtual jqk.zyk (II)I
      // 249: invokevirtual jqk.omw (I)V
      // 24c: iload 3
      // 24d: ifne 299
      // 250: goto 257
      // 253: invokestatic jqk.a (Loov;)Loov;
      // 256: athrow
      // 257: aload 0
      // 258: aload 0
      // 259: invokevirtual jqk.x9m ()I
      // 25c: bipush 1
      // 25d: iadd
      // 25e: invokevirtual jqk.omw (I)V
      // 261: iload 3
      // 262: ifne 299
      // 265: goto 26c
      // 268: invokestatic jqk.a (Loov;)Loov;
      // 26b: athrow
      // 26c: invokestatic ShaderHelper.t_s ()Z
      // 26f: goto 276
      // 272: invokestatic jqk.a (Loov;)Loov;
      // 275: athrow
      // 276: ifeq 28d
      // 279: aload 0
      // 27a: aload 0
      // 27b: bipush 1
      // 27c: invokevirtual jqk.gs2 (I)I
      // 27f: invokevirtual jqk.s2b (I)V
      // 282: iload 3
      // 283: ifne 299
      // 286: goto 28d
      // 289: invokestatic jqk.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 0
      // 28e: bipush 1
      // 28f: invokevirtual jqk.yli (I)V
      // 292: goto 299
      // 295: invokestatic jqk.a (Loov;)Loov;
      // 298: athrow
      // 299: bipush 1
      // 29a: ireturn
      // 29b: invokestatic ShaderHelper.dmk ()Z
      // 29e: ifeq 2b7
      // 2a1: aload 0
      // 2a2: aload 0
      // 2a3: getfield jqk.yr9 Ljava/lang/String;
      // 2a6: invokevirtual java/lang/String.length ()I
      // 2a9: invokevirtual jqk.omw (I)V
      // 2ac: iload 3
      // 2ad: ifne 2c2
      // 2b0: goto 2b7
      // 2b3: invokestatic jqk.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: invokevirtual jqk.f7g ()V
      // 2bb: goto 2c2
      // 2be: invokestatic jqk.a (Loov;)Loov;
      // 2c1: athrow
      // 2c2: bipush 1
      // 2c3: ireturn
      // 2c4: invokestatic ShaderHelper.t_s ()Z
      // 2c7: iload 3
      // 2c8: ifeq 309
      // 2cb: ifeq 2fe
      // 2ce: goto 2d5
      // 2d1: invokestatic jqk.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: getfield jqk.q6h Z
      // 2d9: iload 3
      // 2da: ifeq 324
      // 2dd: goto 2e4
      // 2e0: invokestatic jqk.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: ifeq 323
      // 2e7: goto 2ee
      // 2ea: invokestatic jqk.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: aload 0
      // 2ef: bipush 1
      // 2f0: invokevirtual jqk.j_w (I)V
      // 2f3: iload 3
      // 2f4: ifne 323
      // 2f7: goto 2fe
      // 2fa: invokestatic jqk.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: aload 0
      // 2ff: getfield jqk.q6h Z
      // 302: goto 309
      // 305: invokestatic jqk.a (Loov;)Loov;
      // 308: athrow
      // 309: iload 3
      // 30a: ifeq 324
      // 30d: ifeq 323
      // 310: goto 317
      // 313: invokestatic jqk.a (Loov;)Loov;
      // 316: athrow
      // 317: aload 0
      // 318: bipush 1
      // 319: invokevirtual jqk.kzc (I)V
      // 31c: goto 323
      // 31f: invokestatic jqk.a (Loov;)Loov;
      // 322: athrow
      // 323: bipush 1
      // 324: ireturn
      // 325: iload 1
      // 326: invokestatic _xi._m2 (C)Z
      // 329: iload 3
      // 32a: ifeq 362
      // 32d: ifeq 361
      // 330: goto 337
      // 333: invokestatic jqk.a (Loov;)Loov;
      // 336: athrow
      // 337: aload 0
      // 338: getfield jqk.q6h Z
      // 33b: iload 3
      // 33c: ifeq 360
      // 33f: goto 346
      // 342: invokestatic jqk.a (Loov;)Loov;
      // 345: athrow
      // 346: ifeq 35f
      // 349: goto 350
      // 34c: invokestatic jqk.a (Loov;)Loov;
      // 34f: athrow
      // 350: aload 0
      // 351: iload 1
      // 352: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 355: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 358: goto 35f
      // 35b: invokestatic jqk.a (Loov;)Loov;
      // 35e: athrow
      // 35f: bipush 1
      // 360: ireturn
      // 361: bipush 0
      // 362: ireturn
   }

   public void elk(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: iload 1
      // 006: aload 0
      // 007: getfield jqk.kzw I
      // 00a: iload 4
      // 00c: ifne 02a
      // 00f: if_icmplt 078
      // 012: goto 019
      // 015: invokestatic jqk.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 1
      // 01a: aload 0
      // 01b: getfield jqk.kzw I
      // 01e: aload 0
      // 01f: getfield jqk.uou I
      // 022: iadd
      // 023: goto 02a
      // 026: invokestatic jqk.a (Loov;)Loov;
      // 029: athrow
      // 02a: iload 4
      // 02c: ifne 045
      // 02f: if_icmpge 078
      // 032: goto 039
      // 035: invokestatic jqk.a (Loov;)Loov;
      // 038: athrow
      // 039: iload 2
      // 03a: aload 0
      // 03b: getfield jqk.mr4 I
      // 03e: goto 045
      // 041: invokestatic jqk.a (Loov;)Loov;
      // 044: athrow
      // 045: iload 4
      // 047: ifne 071
      // 04a: if_icmplt 078
      // 04d: goto 054
      // 050: invokestatic jqk.a (Loov;)Loov;
      // 053: athrow
      // 054: iload 2
      // 055: iload 4
      // 057: ifne 075
      // 05a: goto 061
      // 05d: invokestatic jqk.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield jqk.mr4 I
      // 065: aload 0
      // 066: getfield jqk.mn8 I
      // 069: iadd
      // 06a: goto 071
      // 06d: invokestatic jqk.a (Loov;)Loov;
      // 070: athrow
      // 071: if_icmpge 078
      // 074: bipush 1
      // 075: goto 079
      // 078: bipush 0
      // 079: istore 5
      // 07b: aload 0
      // 07c: getfield jqk.b58 Z
      // 07f: iload 4
      // 081: ifne 09f
      // 084: ifeq 09b
      // 087: goto 08e
      // 08a: invokestatic jqk.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: iload 5
      // 091: invokevirtual jqk._c6 (Z)V
      // 094: goto 09b
      // 097: invokestatic jqk.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield jqk.ves Z
      // 09f: iload 4
      // 0a1: ifne 0b0
      // 0a4: ifeq 12a
      // 0a7: goto 0ae
      // 0aa: invokestatic jqk.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: iload 5
      // 0b0: iload 4
      // 0b2: ifne 0c0
      // 0b5: ifeq 12a
      // 0b8: goto 0bf
      // 0bb: invokestatic jqk.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: iload 3
      // 0c0: iload 4
      // 0c2: ifne 0dc
      // 0c5: ifne 12a
      // 0c8: goto 0cf
      // 0cb: invokestatic jqk.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 1
      // 0d0: aload 0
      // 0d1: getfield jqk.kzw I
      // 0d4: isub
      // 0d5: goto 0dc
      // 0d8: invokestatic jqk.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: istore 6
      // 0de: aload 0
      // 0df: iload 4
      // 0e1: ifne 0fc
      // 0e4: getfield jqk.fm5 Z
      // 0e7: ifeq 0fb
      // 0ea: goto 0f1
      // 0ed: invokestatic jqk.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iinc 6 -4
      // 0f4: goto 0fb
      // 0f7: invokestatic jqk.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield jqk.ndh Lowt;
      // 0ff: aload 0
      // 100: getfield jqk.yr9 Ljava/lang/String;
      // 103: aload 0
      // 104: getfield jqk.p3a I
      // 107: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 10a: aload 0
      // 10b: invokevirtual jqk.nor ()I
      // 10e: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 111: astore 7
      // 113: aload 0
      // 114: aload 0
      // 115: getfield jqk.ndh Lowt;
      // 118: aload 7
      // 11a: iload 6
      // 11c: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 11f: invokevirtual java/lang/String.length ()I
      // 122: aload 0
      // 123: getfield jqk.p3a I
      // 126: iadd
      // 127: invokevirtual jqk.s2b (I)V
      // 12a: return
   }

   public void dy2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokevirtual jqk.d_u ()Z
      // 008: iload 1
      // 009: ifeq 021
      // 00c: ifeq 399
      // 00f: goto 016
      // 012: invokestatic jqk.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual jqk.q1z ()Z
      // 01a: goto 021
      // 01d: invokestatic jqk.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 1
      // 022: ifeq 076
      // 025: ifeq 067
      // 028: goto 02f
      // 02b: invokestatic jqk.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield jqk.kzw I
      // 033: bipush 1
      // 034: isub
      // 035: i2f
      // 036: aload 0
      // 037: getfield jqk.mr4 I
      // 03a: bipush 1
      // 03b: isub
      // 03c: i2f
      // 03d: aload 0
      // 03e: getfield jqk.uou I
      // 041: bipush 1
      // 042: iadd
      // 043: i2f
      // 044: aload 0
      // 045: getfield jqk.mn8 I
      // 048: bipush 1
      // 049: iadd
      // 04a: i2f
      // 04b: fconst_1
      // 04c: new java/awt/Color
      // 04f: dup
      // 050: bipush 0
      // 051: bipush 0
      // 052: bipush 0
      // 053: bipush 1
      // 054: invokespecial java/awt/Color.<init> (IIII)V
      // 057: invokevirtual java/awt/Color.getRGB ()I
      // 05a: ldc -6250336
      // 05c: nop
      // 05d: invokestatic mkt.cju (FFFFFII)V
      // 060: goto 067
      // 063: invokestatic jqk.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: iload 1
      // 069: ifeq 085
      // 06c: getfield jqk.q6h Z
      // 06f: goto 076
      // 072: invokestatic jqk.a (Loov;)Loov;
      // 075: athrow
      // 076: ifeq 084
      // 079: aload 0
      // 07a: getfield jqk.vhj I
      // 07d: goto 088
      // 080: invokestatic jqk.a (Loov;)Loov;
      // 083: athrow
      // 084: aload 0
      // 085: getfield jqk.t30 I
      // 088: istore 2
      // 089: aload 0
      // 08a: getfield jqk._76 I
      // 08d: aload 0
      // 08e: getfield jqk.p3a I
      // 091: isub
      // 092: istore 3
      // 093: aload 0
      // 094: getfield jqk.mte I
      // 097: aload 0
      // 098: getfield jqk.p3a I
      // 09b: isub
      // 09c: istore 4
      // 09e: aload 0
      // 09f: getfield jqk.ndh Lowt;
      // 0a2: aload 0
      // 0a3: getfield jqk.yr9 Ljava/lang/String;
      // 0a6: aload 0
      // 0a7: getfield jqk.p3a I
      // 0aa: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ad: aload 0
      // 0ae: invokevirtual jqk.nor ()I
      // 0b1: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 0b4: astore 5
      // 0b6: iload 3
      // 0b7: iload 1
      // 0b8: ifeq 0c6
      // 0bb: iflt 0e4
      // 0be: goto 0c5
      // 0c1: invokestatic jqk.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: iload 3
      // 0c6: iload 1
      // 0c7: ifeq 0e1
      // 0ca: aload 5
      // 0cc: invokevirtual java/lang/String.length ()I
      // 0cf: if_icmpgt 0e4
      // 0d2: goto 0d9
      // 0d5: invokestatic jqk.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: bipush 1
      // 0da: goto 0e1
      // 0dd: invokestatic jqk.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: goto 0e5
      // 0e4: bipush 0
      // 0e5: istore 6
      // 0e7: aload 0
      // 0e8: getfield jqk.ves Z
      // 0eb: iload 1
      // 0ec: ifeq 109
      // 0ef: ifeq 12b
      // 0f2: goto 0f9
      // 0f5: invokestatic jqk.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: getfield jqk.snm I
      // 0fd: bipush 6
      // 0ff: idiv
      // 100: bipush 2
      // 101: irem
      // 102: goto 109
      // 105: invokestatic jqk.a (Loov;)Loov;
      // 108: athrow
      // 109: iload 1
      // 10a: ifeq 119
      // 10d: ifne 12b
      // 110: goto 117
      // 113: invokestatic jqk.a (Loov;)Loov;
      // 116: athrow
      // 117: iload 6
      // 119: iload 1
      // 11a: ifeq 128
      // 11d: ifeq 12b
      // 120: goto 127
      // 123: invokestatic jqk.a (Loov;)Loov;
      // 126: athrow
      // 127: bipush 1
      // 128: goto 12c
      // 12b: bipush 0
      // 12c: istore 7
      // 12e: aload 0
      // 12f: iload 1
      // 130: ifeq 14e
      // 133: getfield jqk.fm5 Z
      // 136: ifeq 14d
      // 139: goto 140
      // 13c: invokestatic jqk.a (Loov;)Loov;
      // 13f: athrow
      // 140: aload 0
      // 141: getfield jqk.kzw I
      // 144: bipush 4
      // 145: iadd
      // 146: goto 151
      // 149: invokestatic jqk.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield jqk.kzw I
      // 151: istore 8
      // 153: aload 0
      // 154: iload 1
      // 155: ifeq 17b
      // 158: getfield jqk.fm5 Z
      // 15b: ifeq 17a
      // 15e: goto 165
      // 161: invokestatic jqk.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 0
      // 166: getfield jqk.mr4 I
      // 169: aload 0
      // 16a: getfield jqk.mn8 I
      // 16d: bipush 8
      // 16f: isub
      // 170: bipush 2
      // 171: idiv
      // 172: iadd
      // 173: goto 17e
      // 176: invokestatic jqk.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield jqk.mr4 I
      // 17e: istore 9
      // 180: iload 8
      // 182: istore 10
      // 184: iload 4
      // 186: iload 1
      // 187: ifeq 1a5
      // 18a: aload 5
      // 18c: invokevirtual java/lang/String.length ()I
      // 18f: if_icmple 1a0
      // 192: goto 199
      // 195: invokestatic jqk.a (Loov;)Loov;
      // 198: athrow
      // 199: aload 5
      // 19b: invokevirtual java/lang/String.length ()I
      // 19e: istore 4
      // 1a0: aload 5
      // 1a2: invokevirtual java/lang/String.length ()I
      // 1a5: iload 1
      // 1a6: ifeq 1e7
      // 1a9: ifle 1e3
      // 1ac: goto 1b3
      // 1af: invokestatic jqk.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: iload 6
      // 1b5: ifeq 1cd
      // 1b8: goto 1bf
      // 1bb: invokestatic jqk.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 5
      // 1c1: bipush 0
      // 1c2: iload 3
      // 1c3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1c6: goto 1cf
      // 1c9: invokestatic jqk.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: aload 5
      // 1cf: astore 11
      // 1d1: aload 0
      // 1d2: getfield jqk.ndh Lowt;
      // 1d5: aload 11
      // 1d7: iload 8
      // 1d9: i2f
      // 1da: iload 9
      // 1dc: i2f
      // 1dd: iload 2
      // 1de: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 1e1: istore 10
      // 1e3: aload 0
      // 1e4: getfield jqk._76 I
      // 1e7: iload 1
      // 1e8: ifeq 224
      // 1eb: aload 0
      // 1ec: getfield jqk.yr9 Ljava/lang/String;
      // 1ef: invokevirtual java/lang/String.length ()I
      // 1f2: if_icmplt 21c
      // 1f5: goto 1fc
      // 1f8: invokestatic jqk.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: getfield jqk.yr9 Ljava/lang/String;
      // 200: invokevirtual java/lang/String.length ()I
      // 203: iload 1
      // 204: ifeq 224
      // 207: goto 20e
      // 20a: invokestatic jqk.a (Loov;)Loov;
      // 20d: athrow
      // 20e: aload 0
      // 20f: invokevirtual jqk.g9c ()I
      // 212: if_icmplt 227
      // 215: goto 21c
      // 218: invokestatic jqk.a (Loov;)Loov;
      // 21b: athrow
      // 21c: bipush 1
      // 21d: goto 224
      // 220: invokestatic jqk.a (Loov;)Loov;
      // 223: athrow
      // 224: goto 228
      // 227: bipush 0
      // 228: istore 11
      // 22a: iload 10
      // 22c: istore 12
      // 22e: iload 6
      // 230: iload 1
      // 231: ifeq 276
      // 234: ifne 26d
      // 237: goto 23e
      // 23a: invokestatic jqk.a (Loov;)Loov;
      // 23d: athrow
      // 23e: iload 3
      // 23f: iload 1
      // 240: ifeq 262
      // 243: goto 24a
      // 246: invokestatic jqk.a (Loov;)Loov;
      // 249: athrow
      // 24a: ifle 265
      // 24d: goto 254
      // 250: invokestatic jqk.a (Loov;)Loov;
      // 253: athrow
      // 254: iload 8
      // 256: aload 0
      // 257: getfield jqk.uou I
      // 25a: iadd
      // 25b: goto 262
      // 25e: invokestatic jqk.a (Loov;)Loov;
      // 261: athrow
      // 262: goto 267
      // 265: iload 8
      // 267: istore 12
      // 269: iload 1
      // 26a: ifne 28d
      // 26d: iload 11
      // 26f: goto 276
      // 272: invokestatic jqk.a (Loov;)Loov;
      // 275: athrow
      // 276: iload 1
      // 277: ifeq 292
      // 27a: ifeq 28d
      // 27d: goto 284
      // 280: invokestatic jqk.a (Loov;)Loov;
      // 283: athrow
      // 284: iload 10
      // 286: bipush 1
      // 287: isub
      // 288: istore 12
      // 28a: iinc 10 -1
      // 28d: aload 5
      // 28f: invokevirtual java/lang/String.length ()I
      // 292: iload 1
      // 293: ifeq 2ea
      // 296: ifle 2e8
      // 299: goto 2a0
      // 29c: invokestatic jqk.a (Loov;)Loov;
      // 29f: athrow
      // 2a0: iload 6
      // 2a2: iload 1
      // 2a3: ifeq 2ea
      // 2a6: goto 2ad
      // 2a9: invokestatic jqk.a (Loov;)Loov;
      // 2ac: athrow
      // 2ad: ifeq 2e8
      // 2b0: goto 2b7
      // 2b3: invokestatic jqk.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: iload 3
      // 2b8: iload 1
      // 2b9: ifeq 2ea
      // 2bc: goto 2c3
      // 2bf: invokestatic jqk.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: aload 5
      // 2c5: invokevirtual java/lang/String.length ()I
      // 2c8: if_icmpge 2e8
      // 2cb: goto 2d2
      // 2ce: invokestatic jqk.a (Loov;)Loov;
      // 2d1: athrow
      // 2d2: aload 0
      // 2d3: getfield jqk.ndh Lowt;
      // 2d6: aload 5
      // 2d8: iload 3
      // 2d9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2dc: iload 10
      // 2de: i2f
      // 2df: iload 9
      // 2e1: i2f
      // 2e2: iload 2
      // 2e3: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 2e6: istore 10
      // 2e8: iload 7
      // 2ea: iload 1
      // 2eb: ifeq 355
      // 2ee: ifeq 353
      // 2f1: goto 2f8
      // 2f4: invokestatic jqk.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: iload 11
      // 2fa: iload 1
      // 2fb: ifeq 352
      // 2fe: goto 305
      // 301: invokestatic jqk.a (Loov;)Loov;
      // 304: athrow
      // 305: ifeq 33a
      // 308: goto 30f
      // 30b: invokestatic jqk.a (Loov;)Loov;
      // 30e: athrow
      // 30f: iload 12
      // 311: i2f
      // 312: iload 9
      // 314: bipush 1
      // 315: isub
      // 316: i2f
      // 317: iload 12
      // 319: bipush 1
      // 31a: iadd
      // 31b: i2f
      // 31c: iload 9
      // 31e: bipush 1
      // 31f: iadd
      // 320: aload 0
      // 321: getfield jqk.ndh Lowt;
      // 324: getfield owt.rr7 I
      // 327: iadd
      // 328: i2f
      // 329: ldc -3092272
      // 32b: nop
      // 32c: invokestatic b0t.df9 (FFFFI)V
      // 32f: iload 1
      // 330: ifne 353
      // 333: goto 33a
      // 336: invokestatic jqk.a (Loov;)Loov;
      // 339: athrow
      // 33a: aload 0
      // 33b: getfield jqk.ndh Lowt;
      // 33e: ldc "_"
      // 340: nop
      // 341: iload 12
      // 343: i2f
      // 344: iload 9
      // 346: i2f
      // 347: iload 2
      // 348: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 34b: goto 352
      // 34e: invokestatic jqk.a (Loov;)Loov;
      // 351: athrow
      // 352: pop
      // 353: iload 4
      // 355: iload 3
      // 356: iload 1
      // 357: ifeq 37c
      // 35a: if_icmpeq 399
      // 35d: goto 364
      // 360: invokestatic jqk.a (Loov;)Loov;
      // 363: athrow
      // 364: iload 8
      // 366: aload 0
      // 367: getfield jqk.ndh Lowt;
      // 36a: aload 5
      // 36c: bipush 0
      // 36d: iload 4
      // 36f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 372: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 375: goto 37c
      // 378: invokestatic jqk.a (Loov;)Loov;
      // 37b: athrow
      // 37c: iadd
      // 37d: istore 13
      // 37f: aload 0
      // 380: iload 12
      // 382: iload 9
      // 384: bipush 1
      // 385: isub
      // 386: iload 13
      // 388: bipush 1
      // 389: isub
      // 38a: iload 9
      // 38c: bipush 1
      // 38d: iadd
      // 38e: aload 0
      // 38f: getfield jqk.ndh Lowt;
      // 392: getfield owt.rr7 I
      // 395: iadd
      // 396: invokespecial jqk.sd5 (IIII)V
      // 399: return
   }

   private void sd5(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: iload 1
      // 06: iload 3
      // 07: iload 5
      // 09: ifne 21
      // 0c: if_icmpge 1e
      // 0f: goto 16
      // 12: invokestatic jqk.a (Loov;)Loov;
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
      // 23: ifne 44
      // 26: if_icmpge 3a
      // 29: goto 30
      // 2c: invokestatic jqk.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 2
      // 31: istore 6
      // 33: iload 4
      // 35: istore 2
      // 36: iload 6
      // 38: istore 4
      // 3a: iload 3
      // 3b: aload 0
      // 3c: getfield jqk.kzw I
      // 3f: aload 0
      // 40: getfield jqk.uou I
      // 43: iadd
      // 44: iload 5
      // 46: ifne 67
      // 49: if_icmple 5d
      // 4c: goto 53
      // 4f: invokestatic jqk.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield jqk.kzw I
      // 57: aload 0
      // 58: getfield jqk.uou I
      // 5b: iadd
      // 5c: istore 3
      // 5d: iload 1
      // 5e: aload 0
      // 5f: getfield jqk.kzw I
      // 62: aload 0
      // 63: getfield jqk.uou I
      // 66: iadd
      // 67: iload 5
      // 69: ifne 85
      // 6c: if_icmple 87
      // 6f: goto 76
      // 72: invokestatic jqk.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: getfield jqk.kzw I
      // 7a: aload 0
      // 7b: getfield jqk.uou I
      // 7e: goto 85
      // 81: invokestatic jqk.a (Loov;)Loov;
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

   public void z5t(int param1) {
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
      // 05: iload 1
      // 06: putfield jqk.lvr I
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifne 27
      // 0e: getfield jqk.yr9 Ljava/lang/String;
      // 11: invokevirtual java/lang/String.length ()I
      // 14: iload 1
      // 15: if_icmple 33
      // 18: goto 1f
      // 1b: invokestatic jqk.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic jqk.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield jqk.yr9 Ljava/lang/String;
      // 2b: bipush 0
      // 2c: iload 1
      // 2d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 30: putfield jqk.yr9 Ljava/lang/String;
      // 33: return
   }

   public int g9c() {
      return this.lvr;
   }

   public int jyp() {
      return this._76;
   }

   public boolean q1z() {
      return this.fm5;
   }

   public void tge(boolean var1) {
      this.fm5 = var1;
   }

   public void w9i(int var1) {
      this.vhj = var1;
   }

   public void cq_(int var1) {
      this.t30 = var1;
   }

   public void _c6(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 29
      // 09: ifeq 38
      // 0c: goto 13
      // 0f: invokestatic jqk.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 39
      // 18: goto 1f
      // 1b: invokestatic jqk.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getfield jqk.ves Z
      // 22: goto 29
      // 25: invokestatic jqk.a (Loov;)Loov;
      // 28: athrow
      // 29: ifne 38
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: putfield jqk.snm I
      // 31: goto 38
      // 34: invokestatic jqk.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: iload 1
      // 3a: putfield jqk.ves Z
      // 3d: return
   }

   public boolean ufo() {
      return this.ves;
   }

   public void gpc(boolean var1) {
      this.q6h = var1;
   }

   public int x9m() {
      return this.mte;
   }

   public int nor() {
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
      // 06: ifeq 25
      // 09: invokevirtual jqk.q1z ()Z
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic jqk.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield jqk.uou I
      // 1a: bipush 8
      // 1c: isub
      // 1d: goto 28
      // 20: invokestatic jqk.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield jqk.uou I
      // 28: ireturn
   }

   public void omw(int param1) {
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
      // 005: getfield jqk.yr9 Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: istore 3
      // 00c: iload 1
      // 00d: iload 2
      // 00e: ifeq 01f
      // 011: iload 3
      // 012: if_icmple 01e
      // 015: goto 01c
      // 018: invokestatic jqk.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 3
      // 01d: istore 1
      // 01e: iload 1
      // 01f: iload 2
      // 020: ifeq 02e
      // 023: ifge 02f
      // 026: goto 02d
      // 029: invokestatic jqk.a (Loov;)Loov;
      // 02c: athrow
      // 02d: bipush 0
      // 02e: istore 1
      // 02f: aload 0
      // 030: iload 1
      // 031: putfield jqk.mte I
      // 034: aload 0
      // 035: iload 2
      // 036: ifeq 04e
      // 039: getfield jqk.ndh Lowt;
      // 03c: ifnull 123
      // 03f: goto 046
      // 042: invokestatic jqk.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: goto 04e
      // 04a: invokestatic jqk.a (Loov;)Loov;
      // 04d: athrow
      // 04e: getfield jqk.p3a I
      // 051: iload 2
      // 052: ifeq 070
      // 055: iload 3
      // 056: if_icmple 06c
      // 059: goto 060
      // 05c: invokestatic jqk.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: iload 3
      // 062: putfield jqk.p3a I
      // 065: goto 06c
      // 068: invokestatic jqk.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: invokevirtual jqk.nor ()I
      // 070: istore 4
      // 072: aload 0
      // 073: getfield jqk.ndh Lowt;
      // 076: aload 0
      // 077: getfield jqk.yr9 Ljava/lang/String;
      // 07a: aload 0
      // 07b: getfield jqk.p3a I
      // 07e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 081: iload 4
      // 083: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 086: astore 5
      // 088: aload 5
      // 08a: invokevirtual java/lang/String.length ()I
      // 08d: aload 0
      // 08e: getfield jqk.p3a I
      // 091: iadd
      // 092: istore 6
      // 094: iload 1
      // 095: aload 0
      // 096: getfield jqk.p3a I
      // 099: iload 2
      // 09a: ifeq 0cb
      // 09d: if_icmpne 0c8
      // 0a0: goto 0a7
      // 0a3: invokestatic jqk.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: dup
      // 0a9: getfield jqk.p3a I
      // 0ac: aload 0
      // 0ad: getfield jqk.ndh Lowt;
      // 0b0: aload 0
      // 0b1: getfield jqk.yr9 Ljava/lang/String;
      // 0b4: iload 4
      // 0b6: bipush 1
      // 0b7: invokevirtual owt.m8q (Ljava/lang/String;IZ)Ljava/lang/String;
      // 0ba: invokevirtual java/lang/String.length ()I
      // 0bd: isub
      // 0be: putfield jqk.p3a I
      // 0c1: goto 0c8
      // 0c4: invokestatic jqk.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 1
      // 0c9: iload 6
      // 0cb: iload 2
      // 0cc: ifeq 0fd
      // 0cf: if_icmple 0f1
      // 0d2: goto 0d9
      // 0d5: invokestatic jqk.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield jqk.p3a I
      // 0de: iload 1
      // 0df: iload 6
      // 0e1: isub
      // 0e2: iadd
      // 0e3: putfield jqk.p3a I
      // 0e6: iload 2
      // 0e7: ifne 116
      // 0ea: goto 0f1
      // 0ed: invokestatic jqk.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 1
      // 0f2: aload 0
      // 0f3: getfield jqk.p3a I
      // 0f6: goto 0fd
      // 0f9: invokestatic jqk.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: if_icmpgt 116
      // 100: aload 0
      // 101: dup
      // 102: getfield jqk.p3a I
      // 105: aload 0
      // 106: getfield jqk.p3a I
      // 109: iload 1
      // 10a: isub
      // 10b: isub
      // 10c: putfield jqk.p3a I
      // 10f: goto 116
      // 112: invokestatic jqk.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: aload 0
      // 118: getfield jqk.p3a I
      // 11b: bipush 0
      // 11c: iload 3
      // 11d: invokestatic fe6.faa (III)I
      // 120: putfield jqk.p3a I
      // 123: return
   }

   public void rca(boolean var1) {
      this.b58 = var1;
   }

   public boolean d_u() {
      return this.kud;
   }

   public void qo7(boolean var1) {
      this.kud = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
