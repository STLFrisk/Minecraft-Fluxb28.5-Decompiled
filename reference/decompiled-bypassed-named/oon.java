import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class oon extends b0t {
   private final int nlr;
   private final owt r2a;
   public int rvn;
   public int w1y;
   private final int agz;
   private final int m03;
   private String lkt = "";
   private int lvs = 32;
   private int x9p;
   private boolean mw4 = true;
   private boolean yra = true;
   private boolean hcg;
   private boolean dj3 = true;
   private int ee2;
   private int ohl;
   private int oh3;
   private int d1t = 14737632;
   private int cu5 = 7368816;
   private boolean wk9 = true;
   private gkx$lpc i45;
   private Predicate bi9 = Predicates.alwaysTrue();

   public oon(int var1, owt var2, int var3, int var4, int var5, int var6) {
      this.nlr = var1;
      this.r2a = var2;
      this.rvn = var3;
      this.w1y = var4;
      this.agz = var5;
      this.m03 = var6;
   }

   public void lrx(gkx$lpc var1) {
      this.i45 = var1;
   }

   public void p8v() {
      this.x9p++;
   }

   public void ihf(String param1) {
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
      // 05: getfield oon.bi9 Lcom/google/common/base/Predicate;
      // 08: aload 1
      // 09: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 0e: iload 2
      // 0f: ifne 27
      // 12: ifeq 56
      // 15: goto 1c
      // 18: invokestatic oon.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/lang/String.length ()I
      // 20: goto 27
      // 23: invokestatic oon.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield oon.lvs I
      // 2b: if_icmple 46
      // 2e: aload 0
      // 2f: aload 1
      // 30: bipush 0
      // 31: aload 0
      // 32: getfield oon.lvs I
      // 35: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 38: putfield oon.lkt Ljava/lang/String;
      // 3b: iload 2
      // 3c: ifeq 52
      // 3f: goto 46
      // 42: invokestatic oon.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: aload 1
      // 48: putfield oon.lkt Ljava/lang/String;
      // 4b: goto 52
      // 4e: invokestatic oon.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: invokevirtual oon.ewv ()V
      // 56: return
   }

   public String eec() {
      return this.lkt;
   }

   public String va3() {
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
      // 09: getfield oon.ohl I
      // 0c: aload 0
      // 0d: getfield oon.oh3 I
      // 10: if_icmpge 25
      // 13: goto 1a
      // 16: invokestatic oon.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield oon.ohl I
      // 1e: goto 29
      // 21: invokestatic oon.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield oon.oh3 I
      // 29: istore 2
      // 2a: aload 0
      // 2b: iload 1
      // 2c: ifeq 4c
      // 2f: getfield oon.ohl I
      // 32: aload 0
      // 33: getfield oon.oh3 I
      // 36: if_icmpge 4b
      // 39: goto 40
      // 3c: invokestatic oon.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield oon.oh3 I
      // 44: goto 4f
      // 47: invokestatic oon.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield oon.ohl I
      // 4f: istore 3
      // 50: aload 0
      // 51: getfield oon.lkt Ljava/lang/String;
      // 54: iload 2
      // 55: iload 3
      // 56: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 59: areturn
   }

   public void f6q(Predicate var1) {
      this.bi9 = var1;
   }

   public void b4l(String param1) {
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
      // 008: invokestatic tvi.zno (Ljava/lang/String;)Ljava/lang/String;
      // 00b: astore 4
      // 00d: istore 2
      // 00e: aload 0
      // 00f: iload 2
      // 010: ifeq 030
      // 013: getfield oon.ohl I
      // 016: aload 0
      // 017: getfield oon.oh3 I
      // 01a: if_icmpge 02f
      // 01d: goto 024
      // 020: invokestatic oon.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: getfield oon.ohl I
      // 028: goto 033
      // 02b: invokestatic oon.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield oon.oh3 I
      // 033: istore 5
      // 035: aload 0
      // 036: iload 2
      // 037: ifeq 057
      // 03a: getfield oon.ohl I
      // 03d: aload 0
      // 03e: getfield oon.oh3 I
      // 041: if_icmpge 056
      // 044: goto 04b
      // 047: invokestatic oon.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield oon.oh3 I
      // 04f: goto 05a
      // 052: invokestatic oon.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: getfield oon.ohl I
      // 05a: istore 6
      // 05c: aload 0
      // 05d: getfield oon.lvs I
      // 060: aload 0
      // 061: getfield oon.lkt Ljava/lang/String;
      // 064: invokevirtual java/lang/String.length ()I
      // 067: isub
      // 068: iload 5
      // 06a: iload 6
      // 06c: isub
      // 06d: isub
      // 06e: istore 7
      // 070: aload 0
      // 071: getfield oon.lkt Ljava/lang/String;
      // 074: invokevirtual java/lang/String.length ()I
      // 077: iload 2
      // 078: ifeq 0a3
      // 07b: ifle 0a1
      // 07e: goto 085
      // 081: invokestatic oon.a (Loov;)Loov;
      // 084: athrow
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: aload 3
      // 08d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 090: aload 0
      // 091: getfield oon.lkt Ljava/lang/String;
      // 094: bipush 0
      // 095: iload 5
      // 097: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a0: astore 3
      // 0a1: iload 7
      // 0a3: iload 2
      // 0a4: ifeq 0f1
      // 0a7: aload 4
      // 0a9: invokevirtual java/lang/String.length ()I
      // 0ac: if_icmpge 0d8
      // 0af: goto 0b6
      // 0b2: invokestatic oon.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: new java/lang/StringBuilder
      // 0b9: dup
      // 0ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bd: aload 3
      // 0be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c1: aload 4
      // 0c3: bipush 0
      // 0c4: iload 7
      // 0c6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cf: astore 3
      // 0d0: iload 7
      // 0d2: istore 8
      // 0d4: iload 2
      // 0d5: ifne 0f3
      // 0d8: new java/lang/StringBuilder
      // 0db: dup
      // 0dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0df: aload 3
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: aload 4
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0eb: astore 3
      // 0ec: aload 4
      // 0ee: invokevirtual java/lang/String.length ()I
      // 0f1: istore 8
      // 0f3: aload 0
      // 0f4: getfield oon.lkt Ljava/lang/String;
      // 0f7: invokevirtual java/lang/String.length ()I
      // 0fa: iload 2
      // 0fb: ifeq 156
      // 0fe: ifle 141
      // 101: goto 108
      // 104: invokestatic oon.a (Loov;)Loov;
      // 107: athrow
      // 108: iload 6
      // 10a: iload 2
      // 10b: ifeq 156
      // 10e: goto 115
      // 111: invokestatic oon.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 0
      // 116: getfield oon.lkt Ljava/lang/String;
      // 119: invokevirtual java/lang/String.length ()I
      // 11c: if_icmpge 141
      // 11f: goto 126
      // 122: invokestatic oon.a (Loov;)Loov;
      // 125: athrow
      // 126: new java/lang/StringBuilder
      // 129: dup
      // 12a: invokespecial java/lang/StringBuilder.<init> ()V
      // 12d: aload 3
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: aload 0
      // 132: getfield oon.lkt Ljava/lang/String;
      // 135: iload 6
      // 137: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 140: astore 3
      // 141: aload 0
      // 142: iload 2
      // 143: ifeq 174
      // 146: getfield oon.bi9 Lcom/google/common/base/Predicate;
      // 149: aload 3
      // 14a: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 14f: goto 156
      // 152: invokestatic oon.a (Loov;)Loov;
      // 155: athrow
      // 156: ifeq 19d
      // 159: aload 0
      // 15a: aload 3
      // 15b: putfield oon.lkt Ljava/lang/String;
      // 15e: aload 0
      // 15f: iload 5
      // 161: aload 0
      // 162: getfield oon.oh3 I
      // 165: isub
      // 166: iload 8
      // 168: iadd
      // 169: invokevirtual oon.zzj (I)V
      // 16c: aload 0
      // 16d: goto 174
      // 170: invokestatic oon.a (Loov;)Loov;
      // 173: athrow
      // 174: getfield oon.i45 Lgkx$lpc;
      // 177: iload 2
      // 178: ifeq 190
      // 17b: ifnull 19d
      // 17e: goto 185
      // 181: invokestatic oon.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 0
      // 186: getfield oon.i45 Lgkx$lpc;
      // 189: goto 190
      // 18c: invokestatic oon.a (Loov;)Loov;
      // 18f: athrow
      // 190: aload 0
      // 191: getfield oon.nlr I
      // 194: aload 0
      // 195: getfield oon.lkt Ljava/lang/String;
      // 198: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 19d: return
   }

   public void xyv(int param1) {
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
      // 05: getfield oon.lkt Ljava/lang/String;
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: iload 2
      // 0c: ifeq 2f
      // 0f: ifeq 5d
      // 12: goto 19
      // 15: invokestatic oon.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifeq 50
      // 1e: goto 25
      // 21: invokestatic oon.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield oon.oh3 I
      // 28: goto 2f
      // 2b: invokestatic oon.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield oon.ohl I
      // 33: if_icmpeq 48
      // 36: aload 0
      // 37: ldc ""
      // 39: nop
      // 3a: invokevirtual oon.b4l (Ljava/lang/String;)V
      // 3d: iload 2
      // 3e: ifne 5d
      // 41: goto 48
      // 44: invokestatic oon.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic oon.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: iload 1
      // 52: invokevirtual oon.tm9 (I)I
      // 55: aload 0
      // 56: getfield oon.ohl I
      // 59: isub
      // 5a: invokevirtual oon.byw (I)V
      // 5d: return
   }

   public void byw(int param1) {
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
      // 005: getfield oon.lkt Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: iload 2
      // 00c: ifeq 024
      // 00f: ifeq 14b
      // 012: goto 019
      // 015: invokestatic oon.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield oon.oh3 I
      // 01d: goto 024
      // 020: invokestatic oon.a (Loov;)Loov;
      // 023: athrow
      // 024: iload 2
      // 025: ifeq 050
      // 028: aload 0
      // 029: getfield oon.ohl I
      // 02c: if_icmpeq 048
      // 02f: goto 036
      // 032: invokestatic oon.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: ldc ""
      // 039: nop
      // 03a: invokevirtual oon.b4l (Ljava/lang/String;)V
      // 03d: iload 2
      // 03e: ifne 14b
      // 041: goto 048
      // 044: invokestatic oon.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 1
      // 049: goto 050
      // 04c: invokestatic oon.a (Loov;)Loov;
      // 04f: athrow
      // 050: iload 2
      // 051: ifeq 05f
      // 054: ifge 062
      // 057: goto 05e
      // 05a: invokestatic oon.a (Loov;)Loov;
      // 05d: athrow
      // 05e: bipush 1
      // 05f: goto 063
      // 062: bipush 0
      // 063: istore 3
      // 064: iload 3
      // 065: iload 2
      // 066: ifeq 080
      // 069: ifeq 083
      // 06c: goto 073
      // 06f: invokestatic oon.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield oon.ohl I
      // 077: iload 1
      // 078: iadd
      // 079: goto 080
      // 07c: invokestatic oon.a (Loov;)Loov;
      // 07f: athrow
      // 080: goto 087
      // 083: aload 0
      // 084: getfield oon.ohl I
      // 087: istore 4
      // 089: iload 3
      // 08a: iload 2
      // 08b: ifeq 0a7
      // 08e: ifeq 0a3
      // 091: goto 098
      // 094: invokestatic oon.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: getfield oon.ohl I
      // 09c: goto 0a9
      // 09f: invokestatic oon.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield oon.ohl I
      // 0a7: iload 1
      // 0a8: iadd
      // 0a9: istore 5
      // 0ab: ldc ""
      // 0ad: nop
      // 0ae: astore 6
      // 0b0: iload 4
      // 0b2: iload 2
      // 0b3: ifeq 0ce
      // 0b6: iflt 0cc
      // 0b9: goto 0c0
      // 0bc: invokestatic oon.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield oon.lkt Ljava/lang/String;
      // 0c4: bipush 0
      // 0c5: iload 4
      // 0c7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ca: astore 6
      // 0cc: iload 5
      // 0ce: iload 2
      // 0cf: ifeq 112
      // 0d2: aload 0
      // 0d3: getfield oon.lkt Ljava/lang/String;
      // 0d6: invokevirtual java/lang/String.length ()I
      // 0d9: if_icmpge 100
      // 0dc: goto 0e3
      // 0df: invokestatic oon.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: new java/lang/StringBuilder
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ea: aload 6
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: aload 0
      // 0f0: getfield oon.lkt Ljava/lang/String;
      // 0f3: iload 5
      // 0f5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: astore 6
      // 100: aload 0
      // 101: iload 2
      // 102: ifeq 122
      // 105: aload 6
      // 107: putfield oon.lkt Ljava/lang/String;
      // 10a: iload 3
      // 10b: goto 112
      // 10e: invokestatic oon.a (Loov;)Loov;
      // 111: athrow
      // 112: ifeq 121
      // 115: aload 0
      // 116: iload 1
      // 117: invokevirtual oon.zzj (I)V
      // 11a: goto 121
      // 11d: invokestatic oon.a (Loov;)Loov;
      // 120: athrow
      // 121: aload 0
      // 122: getfield oon.i45 Lgkx$lpc;
      // 125: iload 2
      // 126: ifeq 13e
      // 129: ifnull 14b
      // 12c: goto 133
      // 12f: invokestatic oon.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 0
      // 134: getfield oon.i45 Lgkx$lpc;
      // 137: goto 13e
      // 13a: invokestatic oon.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: getfield oon.nlr I
      // 142: aload 0
      // 143: getfield oon.lkt Ljava/lang/String;
      // 146: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 14b: return
   }

   public int q38() {
      return this.nlr;
   }

   public int tm9(int var1) {
      return this.hk4(var1, this.qvo());
   }

   public int hk4(int var1, int var2) {
      return this.mtz(var1, var2, true);
   }

   public int mtz(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: iload 2
      // 006: istore 5
      // 008: iload 1
      // 009: iload 4
      // 00b: ifne 019
      // 00e: ifge 01c
      // 011: goto 018
      // 014: invokestatic oon.a (Loov;)Loov;
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
      // 02c: if_icmpge 15d
      // 02f: iload 6
      // 031: iload 4
      // 033: ifne 15f
      // 036: iload 4
      // 038: ifne 0dd
      // 03b: goto 042
      // 03e: invokestatic oon.a (Loov;)Loov;
      // 041: athrow
      // 042: ifeq 0d6
      // 045: goto 04c
      // 048: invokestatic oon.a (Loov;)Loov;
      // 04b: athrow
      // 04c: iload 3
      // 04d: ifeq 0a6
      // 050: goto 057
      // 053: invokestatic oon.a (Loov;)Loov;
      // 056: athrow
      // 057: iload 5
      // 059: iload 4
      // 05b: ifne 0a8
      // 05e: iload 4
      // 060: ifne 0a8
      // 063: goto 06a
      // 066: invokestatic oon.a (Loov;)Loov;
      // 069: athrow
      // 06a: ifle 0a6
      // 06d: goto 074
      // 070: invokestatic oon.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: getfield oon.lkt Ljava/lang/String;
      // 078: iload 5
      // 07a: bipush 1
      // 07b: isub
      // 07c: invokevirtual java/lang/String.charAt (I)C
      // 07f: iload 4
      // 081: ifne 0a8
      // 084: goto 08b
      // 087: invokestatic oon.a (Loov;)Loov;
      // 08a: athrow
      // 08b: bipush 32
      // 08d: if_icmpne 0a6
      // 090: goto 097
      // 093: invokestatic oon.a (Loov;)Loov;
      // 096: athrow
      // 097: iinc 5 -1
      // 09a: iload 4
      // 09c: ifeq 04c
      // 09f: goto 0a6
      // 0a2: invokestatic oon.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: iload 5
      // 0a8: ifle 155
      // 0ab: aload 0
      // 0ac: getfield oon.lkt Ljava/lang/String;
      // 0af: iload 5
      // 0b1: bipush 1
      // 0b2: isub
      // 0b3: invokevirtual java/lang/String.charAt (I)C
      // 0b6: bipush 32
      // 0b8: iload 4
      // 0ba: ifne 02c
      // 0bd: goto 0c4
      // 0c0: invokestatic oon.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: if_icmpeq 155
      // 0c7: iinc 5 -1
      // 0ca: iload 4
      // 0cc: ifeq 0a6
      // 0cf: goto 0d6
      // 0d2: invokestatic oon.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield oon.lkt Ljava/lang/String;
      // 0da: invokevirtual java/lang/String.length ()I
      // 0dd: istore 9
      // 0df: aload 0
      // 0e0: getfield oon.lkt Ljava/lang/String;
      // 0e3: bipush 32
      // 0e5: iload 5
      // 0e7: invokevirtual java/lang/String.indexOf (II)I
      // 0ea: istore 5
      // 0ec: iload 5
      // 0ee: iload 4
      // 0f0: ifne 10f
      // 0f3: bipush -1
      // 0f4: if_icmpne 107
      // 0f7: goto 0fe
      // 0fa: invokestatic oon.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: iload 9
      // 100: istore 5
      // 102: iload 4
      // 104: ifeq 155
      // 107: iload 3
      // 108: goto 10f
      // 10b: invokestatic oon.a (Loov;)Loov;
      // 10e: athrow
      // 10f: ifeq 155
      // 112: iload 5
      // 114: iload 9
      // 116: iload 4
      // 118: ifne 02c
      // 11b: goto 122
      // 11e: invokestatic oon.a (Loov;)Loov;
      // 121: athrow
      // 122: iload 4
      // 124: ifne 143
      // 127: if_icmpge 155
      // 12a: goto 131
      // 12d: invokestatic oon.a (Loov;)Loov;
      // 130: athrow
      // 131: aload 0
      // 132: getfield oon.lkt Ljava/lang/String;
      // 135: iload 5
      // 137: invokevirtual java/lang/String.charAt (I)C
      // 13a: bipush 32
      // 13c: goto 143
      // 13f: invokestatic oon.a (Loov;)Loov;
      // 142: athrow
      // 143: if_icmpne 155
      // 146: iinc 5 1
      // 149: iload 4
      // 14b: ifeq 107
      // 14e: goto 155
      // 151: invokestatic oon.a (Loov;)Loov;
      // 154: athrow
      // 155: iinc 8 1
      // 158: iload 4
      // 15a: ifeq 028
      // 15d: iload 5
      // 15f: ireturn
   }

   public void zzj(int var1) {
      this.nxa(this.oh3 + var1);
   }

   public void nxa(int var1) {
      this.ohl = var1;
      int var2 = this.lkt.length();
      this.ohl = fe6.faa(this.ohl, 0, var2);
      this.ngy(this.ohl);
   }

   public void qui() {
      this.nxa(0);
   }

   public void ewv() {
      this.nxa(this.lkt.length());
   }

   public boolean ir1(char param1, int param2) {
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
      // 005: getfield oon.hcg Z
      // 008: iload 3
      // 009: ifeq 020
      // 00c: ifne 01c
      // 00f: goto 016
      // 012: invokestatic oon.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic oon.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 2
      // 01d: invokestatic ShaderHelper.ul2 (I)Z
      // 020: iload 3
      // 021: ifeq 041
      // 024: ifeq 03d
      // 027: goto 02e
      // 02a: invokestatic oon.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual oon.ewv ()V
      // 032: aload 0
      // 033: bipush 0
      // 034: invokevirtual oon.ngy (I)V
      // 037: bipush 1
      // 038: ireturn
      // 039: invokestatic oon.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iload 2
      // 03e: invokestatic ShaderHelper.y4j (I)Z
      // 041: iload 3
      // 042: ifeq 060
      // 045: ifeq 05c
      // 048: goto 04f
      // 04b: invokestatic oon.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: invokevirtual oon.va3 ()Ljava/lang/String;
      // 053: invokestatic ShaderHelper.vjv (Ljava/lang/String;)V
      // 056: bipush 1
      // 057: ireturn
      // 058: invokestatic oon.a (Loov;)Loov;
      // 05b: athrow
      // 05c: iload 2
      // 05d: invokestatic ShaderHelper.foo (I)Z
      // 060: iload 3
      // 061: ifeq 09b
      // 064: ifeq 097
      // 067: goto 06e
      // 06a: invokestatic oon.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield oon.dj3 Z
      // 072: iload 3
      // 073: ifeq 096
      // 076: goto 07d
      // 079: invokestatic oon.a (Loov;)Loov;
      // 07c: athrow
      // 07d: ifeq 095
      // 080: goto 087
      // 083: invokestatic oon.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: invokestatic ShaderHelper.b0r ()Ljava/lang/String;
      // 08b: invokevirtual oon.b4l (Ljava/lang/String;)V
      // 08e: goto 095
      // 091: invokestatic oon.a (Loov;)Loov;
      // 094: athrow
      // 095: bipush 1
      // 096: ireturn
      // 097: iload 2
      // 098: invokestatic ShaderHelper.uqk (I)Z
      // 09b: iload 3
      // 09c: ifeq 0da
      // 09f: ifeq 0d9
      // 0a2: goto 0a9
      // 0a5: invokestatic oon.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: invokevirtual oon.va3 ()Ljava/lang/String;
      // 0ad: invokestatic ShaderHelper.vjv (Ljava/lang/String;)V
      // 0b0: aload 0
      // 0b1: getfield oon.dj3 Z
      // 0b4: iload 3
      // 0b5: ifeq 0d8
      // 0b8: goto 0bf
      // 0bb: invokestatic oon.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifeq 0d7
      // 0c2: goto 0c9
      // 0c5: invokestatic oon.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: ldc ""
      // 0cc: nop
      // 0cd: invokevirtual oon.b4l (Ljava/lang/String;)V
      // 0d0: goto 0d7
      // 0d3: invokestatic oon.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: bipush 1
      // 0d8: ireturn
      // 0d9: iload 2
      // 0da: iload 3
      // 0db: ifeq 329
      // 0de: lookupswitch 583 6 14 62 199 166 203 201 205 323 207 445 211 486
      // 118: invokestatic oon.a (Loov;)Loov;
      // 11b: athrow
      // 11c: invokestatic ShaderHelper.t_s ()Z
      // 11f: iload 3
      // 120: ifeq 168
      // 123: goto 12a
      // 126: invokestatic oon.a (Loov;)Loov;
      // 129: athrow
      // 12a: ifeq 15d
      // 12d: goto 134
      // 130: invokestatic oon.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 0
      // 135: getfield oon.dj3 Z
      // 138: iload 3
      // 139: ifeq 183
      // 13c: goto 143
      // 13f: invokestatic oon.a (Loov;)Loov;
      // 142: athrow
      // 143: ifeq 182
      // 146: goto 14d
      // 149: invokestatic oon.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: bipush -1
      // 14f: invokevirtual oon.xyv (I)V
      // 152: iload 3
      // 153: ifne 182
      // 156: goto 15d
      // 159: invokestatic oon.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield oon.dj3 Z
      // 161: goto 168
      // 164: invokestatic oon.a (Loov;)Loov;
      // 167: athrow
      // 168: iload 3
      // 169: ifeq 183
      // 16c: ifeq 182
      // 16f: goto 176
      // 172: invokestatic oon.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: bipush -1
      // 178: invokevirtual oon.byw (I)V
      // 17b: goto 182
      // 17e: invokestatic oon.a (Loov;)Loov;
      // 181: athrow
      // 182: bipush 1
      // 183: ireturn
      // 184: invokestatic ShaderHelper.dmk ()Z
      // 187: ifeq 19a
      // 18a: aload 0
      // 18b: bipush 0
      // 18c: invokevirtual oon.ngy (I)V
      // 18f: iload 3
      // 190: ifne 1a5
      // 193: goto 19a
      // 196: invokestatic oon.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 0
      // 19b: invokevirtual oon.qui ()V
      // 19e: goto 1a5
      // 1a1: invokestatic oon.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: bipush 1
      // 1a6: ireturn
      // 1a7: invokestatic ShaderHelper.dmk ()Z
      // 1aa: iload 3
      // 1ab: ifeq 1fc
      // 1ae: ifeq 1f2
      // 1b1: goto 1b8
      // 1b4: invokestatic oon.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: invokestatic ShaderHelper.t_s ()Z
      // 1bb: ifeq 1dd
      // 1be: goto 1c5
      // 1c1: invokestatic oon.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: aload 0
      // 1c7: bipush -1
      // 1c8: aload 0
      // 1c9: invokevirtual oon.nhh ()I
      // 1cc: invokevirtual oon.hk4 (II)I
      // 1cf: invokevirtual oon.ngy (I)V
      // 1d2: iload 3
      // 1d3: ifne 21f
      // 1d6: goto 1dd
      // 1d9: invokestatic oon.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: aload 0
      // 1df: invokevirtual oon.nhh ()I
      // 1e2: bipush 1
      // 1e3: isub
      // 1e4: invokevirtual oon.ngy (I)V
      // 1e7: iload 3
      // 1e8: ifne 21f
      // 1eb: goto 1f2
      // 1ee: invokestatic oon.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: invokestatic ShaderHelper.t_s ()Z
      // 1f5: goto 1fc
      // 1f8: invokestatic oon.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: ifeq 213
      // 1ff: aload 0
      // 200: aload 0
      // 201: bipush -1
      // 202: invokevirtual oon.tm9 (I)I
      // 205: invokevirtual oon.nxa (I)V
      // 208: iload 3
      // 209: ifne 21f
      // 20c: goto 213
      // 20f: invokestatic oon.a (Loov;)Loov;
      // 212: athrow
      // 213: aload 0
      // 214: bipush -1
      // 215: invokevirtual oon.zzj (I)V
      // 218: goto 21f
      // 21b: invokestatic oon.a (Loov;)Loov;
      // 21e: athrow
      // 21f: bipush 1
      // 220: ireturn
      // 221: invokestatic ShaderHelper.dmk ()Z
      // 224: iload 3
      // 225: ifeq 276
      // 228: ifeq 26c
      // 22b: goto 232
      // 22e: invokestatic oon.a (Loov;)Loov;
      // 231: athrow
      // 232: invokestatic ShaderHelper.t_s ()Z
      // 235: ifeq 257
      // 238: goto 23f
      // 23b: invokestatic oon.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 0
      // 240: aload 0
      // 241: bipush 1
      // 242: aload 0
      // 243: invokevirtual oon.nhh ()I
      // 246: invokevirtual oon.hk4 (II)I
      // 249: invokevirtual oon.ngy (I)V
      // 24c: iload 3
      // 24d: ifne 299
      // 250: goto 257
      // 253: invokestatic oon.a (Loov;)Loov;
      // 256: athrow
      // 257: aload 0
      // 258: aload 0
      // 259: invokevirtual oon.nhh ()I
      // 25c: bipush 1
      // 25d: iadd
      // 25e: invokevirtual oon.ngy (I)V
      // 261: iload 3
      // 262: ifne 299
      // 265: goto 26c
      // 268: invokestatic oon.a (Loov;)Loov;
      // 26b: athrow
      // 26c: invokestatic ShaderHelper.t_s ()Z
      // 26f: goto 276
      // 272: invokestatic oon.a (Loov;)Loov;
      // 275: athrow
      // 276: ifeq 28d
      // 279: aload 0
      // 27a: aload 0
      // 27b: bipush 1
      // 27c: invokevirtual oon.tm9 (I)I
      // 27f: invokevirtual oon.nxa (I)V
      // 282: iload 3
      // 283: ifne 299
      // 286: goto 28d
      // 289: invokestatic oon.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 0
      // 28e: bipush 1
      // 28f: invokevirtual oon.zzj (I)V
      // 292: goto 299
      // 295: invokestatic oon.a (Loov;)Loov;
      // 298: athrow
      // 299: bipush 1
      // 29a: ireturn
      // 29b: invokestatic ShaderHelper.dmk ()Z
      // 29e: ifeq 2b7
      // 2a1: aload 0
      // 2a2: aload 0
      // 2a3: getfield oon.lkt Ljava/lang/String;
      // 2a6: invokevirtual java/lang/String.length ()I
      // 2a9: invokevirtual oon.ngy (I)V
      // 2ac: iload 3
      // 2ad: ifne 2c2
      // 2b0: goto 2b7
      // 2b3: invokestatic oon.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: invokevirtual oon.ewv ()V
      // 2bb: goto 2c2
      // 2be: invokestatic oon.a (Loov;)Loov;
      // 2c1: athrow
      // 2c2: bipush 1
      // 2c3: ireturn
      // 2c4: invokestatic ShaderHelper.t_s ()Z
      // 2c7: iload 3
      // 2c8: ifeq 309
      // 2cb: ifeq 2fe
      // 2ce: goto 2d5
      // 2d1: invokestatic oon.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: getfield oon.dj3 Z
      // 2d9: iload 3
      // 2da: ifeq 324
      // 2dd: goto 2e4
      // 2e0: invokestatic oon.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: ifeq 323
      // 2e7: goto 2ee
      // 2ea: invokestatic oon.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: aload 0
      // 2ef: bipush 1
      // 2f0: invokevirtual oon.xyv (I)V
      // 2f3: iload 3
      // 2f4: ifne 323
      // 2f7: goto 2fe
      // 2fa: invokestatic oon.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: aload 0
      // 2ff: getfield oon.dj3 Z
      // 302: goto 309
      // 305: invokestatic oon.a (Loov;)Loov;
      // 308: athrow
      // 309: iload 3
      // 30a: ifeq 324
      // 30d: ifeq 323
      // 310: goto 317
      // 313: invokestatic oon.a (Loov;)Loov;
      // 316: athrow
      // 317: aload 0
      // 318: bipush 1
      // 319: invokevirtual oon.byw (I)V
      // 31c: goto 323
      // 31f: invokestatic oon.a (Loov;)Loov;
      // 322: athrow
      // 323: bipush 1
      // 324: ireturn
      // 325: iload 1
      // 326: invokestatic tvi.pwq (C)Z
      // 329: iload 3
      // 32a: ifeq 362
      // 32d: ifeq 361
      // 330: goto 337
      // 333: invokestatic oon.a (Loov;)Loov;
      // 336: athrow
      // 337: aload 0
      // 338: getfield oon.dj3 Z
      // 33b: iload 3
      // 33c: ifeq 360
      // 33f: goto 346
      // 342: invokestatic oon.a (Loov;)Loov;
      // 345: athrow
      // 346: ifeq 35f
      // 349: goto 350
      // 34c: invokestatic oon.a (Loov;)Loov;
      // 34f: athrow
      // 350: aload 0
      // 351: iload 1
      // 352: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 355: invokevirtual oon.b4l (Ljava/lang/String;)V
      // 358: goto 35f
      // 35b: invokestatic oon.a (Loov;)Loov;
      // 35e: athrow
      // 35f: bipush 1
      // 360: ireturn
      // 361: bipush 0
      // 362: ireturn
   }

   public void pzs(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: iload 1
      // 006: aload 0
      // 007: getfield oon.rvn I
      // 00a: iload 4
      // 00c: ifeq 02a
      // 00f: if_icmplt 078
      // 012: goto 019
      // 015: invokestatic oon.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 1
      // 01a: aload 0
      // 01b: getfield oon.rvn I
      // 01e: aload 0
      // 01f: getfield oon.agz I
      // 022: iadd
      // 023: goto 02a
      // 026: invokestatic oon.a (Loov;)Loov;
      // 029: athrow
      // 02a: iload 4
      // 02c: ifeq 045
      // 02f: if_icmpge 078
      // 032: goto 039
      // 035: invokestatic oon.a (Loov;)Loov;
      // 038: athrow
      // 039: iload 2
      // 03a: aload 0
      // 03b: getfield oon.w1y I
      // 03e: goto 045
      // 041: invokestatic oon.a (Loov;)Loov;
      // 044: athrow
      // 045: iload 4
      // 047: ifeq 071
      // 04a: if_icmplt 078
      // 04d: goto 054
      // 050: invokestatic oon.a (Loov;)Loov;
      // 053: athrow
      // 054: iload 2
      // 055: iload 4
      // 057: ifeq 075
      // 05a: goto 061
      // 05d: invokestatic oon.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield oon.w1y I
      // 065: aload 0
      // 066: getfield oon.m03 I
      // 069: iadd
      // 06a: goto 071
      // 06d: invokestatic oon.a (Loov;)Loov;
      // 070: athrow
      // 071: if_icmpge 078
      // 074: bipush 1
      // 075: goto 079
      // 078: bipush 0
      // 079: istore 5
      // 07b: aload 0
      // 07c: getfield oon.yra Z
      // 07f: iload 4
      // 081: ifeq 09f
      // 084: ifeq 09b
      // 087: goto 08e
      // 08a: invokestatic oon.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: iload 5
      // 091: invokevirtual oon.m4g (Z)V
      // 094: goto 09b
      // 097: invokestatic oon.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield oon.hcg Z
      // 09f: iload 4
      // 0a1: ifeq 0b0
      // 0a4: ifeq 12a
      // 0a7: goto 0ae
      // 0aa: invokestatic oon.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: iload 5
      // 0b0: iload 4
      // 0b2: ifeq 0c0
      // 0b5: ifeq 12a
      // 0b8: goto 0bf
      // 0bb: invokestatic oon.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: iload 3
      // 0c0: iload 4
      // 0c2: ifeq 0dc
      // 0c5: ifne 12a
      // 0c8: goto 0cf
      // 0cb: invokestatic oon.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 1
      // 0d0: aload 0
      // 0d1: getfield oon.rvn I
      // 0d4: isub
      // 0d5: goto 0dc
      // 0d8: invokestatic oon.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: istore 6
      // 0de: aload 0
      // 0df: iload 4
      // 0e1: ifeq 0fc
      // 0e4: getfield oon.mw4 Z
      // 0e7: ifeq 0fb
      // 0ea: goto 0f1
      // 0ed: invokestatic oon.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iinc 6 -4
      // 0f4: goto 0fb
      // 0f7: invokestatic oon.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield oon.r2a Lowt;
      // 0ff: aload 0
      // 100: getfield oon.lkt Ljava/lang/String;
      // 103: aload 0
      // 104: getfield oon.ee2 I
      // 107: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 10a: aload 0
      // 10b: invokevirtual oon.sjf ()I
      // 10e: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 111: astore 7
      // 113: aload 0
      // 114: aload 0
      // 115: getfield oon.r2a Lowt;
      // 118: aload 7
      // 11a: iload 6
      // 11c: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 11f: invokevirtual java/lang/String.length ()I
      // 122: aload 0
      // 123: getfield oon.ee2 I
      // 126: iadd
      // 127: invokevirtual oon.nxa (I)V
      // 12a: return
   }

   public void j_6() {
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
      // 005: invokevirtual oon.n5g ()Z
      // 008: iload 1
      // 009: ifeq 021
      // 00c: ifeq 3b8
      // 00f: goto 016
      // 012: invokestatic oon.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual oon._26 ()Z
      // 01a: goto 021
      // 01d: invokestatic oon.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 1
      // 022: ifeq 095
      // 025: ifeq 086
      // 028: goto 02f
      // 02b: invokestatic oon.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield oon.rvn I
      // 033: bipush 1
      // 034: isub
      // 035: i2f
      // 036: aload 0
      // 037: getfield oon.w1y I
      // 03a: bipush 1
      // 03b: isub
      // 03c: i2f
      // 03d: aload 0
      // 03e: getfield oon.rvn I
      // 041: aload 0
      // 042: getfield oon.agz I
      // 045: iadd
      // 046: bipush 1
      // 047: iadd
      // 048: i2f
      // 049: aload 0
      // 04a: getfield oon.w1y I
      // 04d: aload 0
      // 04e: getfield oon.m03 I
      // 051: iadd
      // 052: bipush 1
      // 053: iadd
      // 054: i2f
      // 055: ldc -6250336
      // 057: nop
      // 058: invokestatic oon.df9 (FFFFI)V
      // 05b: aload 0
      // 05c: getfield oon.rvn I
      // 05f: i2f
      // 060: aload 0
      // 061: getfield oon.w1y I
      // 064: i2f
      // 065: aload 0
      // 066: getfield oon.rvn I
      // 069: aload 0
      // 06a: getfield oon.agz I
      // 06d: iadd
      // 06e: i2f
      // 06f: aload 0
      // 070: getfield oon.w1y I
      // 073: aload 0
      // 074: getfield oon.m03 I
      // 077: iadd
      // 078: i2f
      // 079: ldc -16777216
      // 07b: nop
      // 07c: invokestatic oon.df9 (FFFFI)V
      // 07f: goto 086
      // 082: invokestatic oon.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 0
      // 087: iload 1
      // 088: ifeq 0a4
      // 08b: getfield oon.dj3 Z
      // 08e: goto 095
      // 091: invokestatic oon.a (Loov;)Loov;
      // 094: athrow
      // 095: ifeq 0a3
      // 098: aload 0
      // 099: getfield oon.d1t I
      // 09c: goto 0a7
      // 09f: invokestatic oon.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield oon.cu5 I
      // 0a7: istore 2
      // 0a8: aload 0
      // 0a9: getfield oon.ohl I
      // 0ac: aload 0
      // 0ad: getfield oon.ee2 I
      // 0b0: isub
      // 0b1: istore 3
      // 0b2: aload 0
      // 0b3: getfield oon.oh3 I
      // 0b6: aload 0
      // 0b7: getfield oon.ee2 I
      // 0ba: isub
      // 0bb: istore 4
      // 0bd: aload 0
      // 0be: getfield oon.r2a Lowt;
      // 0c1: aload 0
      // 0c2: getfield oon.lkt Ljava/lang/String;
      // 0c5: aload 0
      // 0c6: getfield oon.ee2 I
      // 0c9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0cc: aload 0
      // 0cd: invokevirtual oon.sjf ()I
      // 0d0: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 0d3: astore 5
      // 0d5: iload 3
      // 0d6: iload 1
      // 0d7: ifeq 0e5
      // 0da: iflt 103
      // 0dd: goto 0e4
      // 0e0: invokestatic oon.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: iload 3
      // 0e5: iload 1
      // 0e6: ifeq 100
      // 0e9: aload 5
      // 0eb: invokevirtual java/lang/String.length ()I
      // 0ee: if_icmpgt 103
      // 0f1: goto 0f8
      // 0f4: invokestatic oon.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: bipush 1
      // 0f9: goto 100
      // 0fc: invokestatic oon.a (Loov;)Loov;
      // 0ff: athrow
      // 100: goto 104
      // 103: bipush 0
      // 104: istore 6
      // 106: aload 0
      // 107: getfield oon.hcg Z
      // 10a: iload 1
      // 10b: ifeq 128
      // 10e: ifeq 14a
      // 111: goto 118
      // 114: invokestatic oon.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: getfield oon.x9p I
      // 11c: bipush 6
      // 11e: idiv
      // 11f: bipush 2
      // 120: irem
      // 121: goto 128
      // 124: invokestatic oon.a (Loov;)Loov;
      // 127: athrow
      // 128: iload 1
      // 129: ifeq 138
      // 12c: ifne 14a
      // 12f: goto 136
      // 132: invokestatic oon.a (Loov;)Loov;
      // 135: athrow
      // 136: iload 6
      // 138: iload 1
      // 139: ifeq 147
      // 13c: ifeq 14a
      // 13f: goto 146
      // 142: invokestatic oon.a (Loov;)Loov;
      // 145: athrow
      // 146: bipush 1
      // 147: goto 14b
      // 14a: bipush 0
      // 14b: istore 7
      // 14d: aload 0
      // 14e: iload 1
      // 14f: ifeq 16d
      // 152: getfield oon.mw4 Z
      // 155: ifeq 16c
      // 158: goto 15f
      // 15b: invokestatic oon.a (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield oon.rvn I
      // 163: bipush 4
      // 164: iadd
      // 165: goto 170
      // 168: invokestatic oon.a (Loov;)Loov;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield oon.rvn I
      // 170: istore 8
      // 172: aload 0
      // 173: iload 1
      // 174: ifeq 19a
      // 177: getfield oon.mw4 Z
      // 17a: ifeq 199
      // 17d: goto 184
      // 180: invokestatic oon.a (Loov;)Loov;
      // 183: athrow
      // 184: aload 0
      // 185: getfield oon.w1y I
      // 188: aload 0
      // 189: getfield oon.m03 I
      // 18c: bipush 8
      // 18e: isub
      // 18f: bipush 2
      // 190: idiv
      // 191: iadd
      // 192: goto 19d
      // 195: invokestatic oon.a (Loov;)Loov;
      // 198: athrow
      // 199: aload 0
      // 19a: getfield oon.w1y I
      // 19d: istore 9
      // 19f: iload 8
      // 1a1: istore 10
      // 1a3: iload 4
      // 1a5: iload 1
      // 1a6: ifeq 1c4
      // 1a9: aload 5
      // 1ab: invokevirtual java/lang/String.length ()I
      // 1ae: if_icmple 1bf
      // 1b1: goto 1b8
      // 1b4: invokestatic oon.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: aload 5
      // 1ba: invokevirtual java/lang/String.length ()I
      // 1bd: istore 4
      // 1bf: aload 5
      // 1c1: invokevirtual java/lang/String.length ()I
      // 1c4: iload 1
      // 1c5: ifeq 206
      // 1c8: ifle 202
      // 1cb: goto 1d2
      // 1ce: invokestatic oon.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: iload 6
      // 1d4: ifeq 1ec
      // 1d7: goto 1de
      // 1da: invokestatic oon.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: aload 5
      // 1e0: bipush 0
      // 1e1: iload 3
      // 1e2: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1e5: goto 1ee
      // 1e8: invokestatic oon.a (Loov;)Loov;
      // 1eb: athrow
      // 1ec: aload 5
      // 1ee: astore 11
      // 1f0: aload 0
      // 1f1: getfield oon.r2a Lowt;
      // 1f4: aload 11
      // 1f6: iload 8
      // 1f8: i2f
      // 1f9: iload 9
      // 1fb: i2f
      // 1fc: iload 2
      // 1fd: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 200: istore 10
      // 202: aload 0
      // 203: getfield oon.ohl I
      // 206: iload 1
      // 207: ifeq 243
      // 20a: aload 0
      // 20b: getfield oon.lkt Ljava/lang/String;
      // 20e: invokevirtual java/lang/String.length ()I
      // 211: if_icmplt 23b
      // 214: goto 21b
      // 217: invokestatic oon.a (Loov;)Loov;
      // 21a: athrow
      // 21b: aload 0
      // 21c: getfield oon.lkt Ljava/lang/String;
      // 21f: invokevirtual java/lang/String.length ()I
      // 222: iload 1
      // 223: ifeq 243
      // 226: goto 22d
      // 229: invokestatic oon.a (Loov;)Loov;
      // 22c: athrow
      // 22d: aload 0
      // 22e: invokevirtual oon.edf ()I
      // 231: if_icmplt 246
      // 234: goto 23b
      // 237: invokestatic oon.a (Loov;)Loov;
      // 23a: athrow
      // 23b: bipush 1
      // 23c: goto 243
      // 23f: invokestatic oon.a (Loov;)Loov;
      // 242: athrow
      // 243: goto 247
      // 246: bipush 0
      // 247: istore 11
      // 249: iload 10
      // 24b: istore 12
      // 24d: iload 6
      // 24f: iload 1
      // 250: ifeq 295
      // 253: ifne 28c
      // 256: goto 25d
      // 259: invokestatic oon.a (Loov;)Loov;
      // 25c: athrow
      // 25d: iload 3
      // 25e: iload 1
      // 25f: ifeq 281
      // 262: goto 269
      // 265: invokestatic oon.a (Loov;)Loov;
      // 268: athrow
      // 269: ifle 284
      // 26c: goto 273
      // 26f: invokestatic oon.a (Loov;)Loov;
      // 272: athrow
      // 273: iload 8
      // 275: aload 0
      // 276: getfield oon.agz I
      // 279: iadd
      // 27a: goto 281
      // 27d: invokestatic oon.a (Loov;)Loov;
      // 280: athrow
      // 281: goto 286
      // 284: iload 8
      // 286: istore 12
      // 288: iload 1
      // 289: ifne 2ac
      // 28c: iload 11
      // 28e: goto 295
      // 291: invokestatic oon.a (Loov;)Loov;
      // 294: athrow
      // 295: iload 1
      // 296: ifeq 2b1
      // 299: ifeq 2ac
      // 29c: goto 2a3
      // 29f: invokestatic oon.a (Loov;)Loov;
      // 2a2: athrow
      // 2a3: iload 10
      // 2a5: bipush 1
      // 2a6: isub
      // 2a7: istore 12
      // 2a9: iinc 10 -1
      // 2ac: aload 5
      // 2ae: invokevirtual java/lang/String.length ()I
      // 2b1: iload 1
      // 2b2: ifeq 309
      // 2b5: ifle 307
      // 2b8: goto 2bf
      // 2bb: invokestatic oon.a (Loov;)Loov;
      // 2be: athrow
      // 2bf: iload 6
      // 2c1: iload 1
      // 2c2: ifeq 309
      // 2c5: goto 2cc
      // 2c8: invokestatic oon.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: ifeq 307
      // 2cf: goto 2d6
      // 2d2: invokestatic oon.a (Loov;)Loov;
      // 2d5: athrow
      // 2d6: iload 3
      // 2d7: iload 1
      // 2d8: ifeq 309
      // 2db: goto 2e2
      // 2de: invokestatic oon.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: aload 5
      // 2e4: invokevirtual java/lang/String.length ()I
      // 2e7: if_icmpge 307
      // 2ea: goto 2f1
      // 2ed: invokestatic oon.a (Loov;)Loov;
      // 2f0: athrow
      // 2f1: aload 0
      // 2f2: getfield oon.r2a Lowt;
      // 2f5: aload 5
      // 2f7: iload 3
      // 2f8: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2fb: iload 10
      // 2fd: i2f
      // 2fe: iload 9
      // 300: i2f
      // 301: iload 2
      // 302: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 305: istore 10
      // 307: iload 7
      // 309: iload 1
      // 30a: ifeq 374
      // 30d: ifeq 372
      // 310: goto 317
      // 313: invokestatic oon.a (Loov;)Loov;
      // 316: athrow
      // 317: iload 11
      // 319: iload 1
      // 31a: ifeq 371
      // 31d: goto 324
      // 320: invokestatic oon.a (Loov;)Loov;
      // 323: athrow
      // 324: ifeq 359
      // 327: goto 32e
      // 32a: invokestatic oon.a (Loov;)Loov;
      // 32d: athrow
      // 32e: iload 12
      // 330: i2f
      // 331: iload 9
      // 333: bipush 1
      // 334: isub
      // 335: i2f
      // 336: iload 12
      // 338: bipush 1
      // 339: iadd
      // 33a: i2f
      // 33b: iload 9
      // 33d: bipush 1
      // 33e: iadd
      // 33f: aload 0
      // 340: getfield oon.r2a Lowt;
      // 343: getfield owt.rr7 I
      // 346: iadd
      // 347: i2f
      // 348: ldc -3092272
      // 34a: nop
      // 34b: invokestatic b0t.df9 (FFFFI)V
      // 34e: iload 1
      // 34f: ifne 372
      // 352: goto 359
      // 355: invokestatic oon.a (Loov;)Loov;
      // 358: athrow
      // 359: aload 0
      // 35a: getfield oon.r2a Lowt;
      // 35d: ldc "_"
      // 35f: nop
      // 360: iload 12
      // 362: i2f
      // 363: iload 9
      // 365: i2f
      // 366: iload 2
      // 367: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 36a: goto 371
      // 36d: invokestatic oon.a (Loov;)Loov;
      // 370: athrow
      // 371: pop
      // 372: iload 4
      // 374: iload 3
      // 375: iload 1
      // 376: ifeq 39b
      // 379: if_icmpeq 3b8
      // 37c: goto 383
      // 37f: invokestatic oon.a (Loov;)Loov;
      // 382: athrow
      // 383: iload 8
      // 385: aload 0
      // 386: getfield oon.r2a Lowt;
      // 389: aload 5
      // 38b: bipush 0
      // 38c: iload 4
      // 38e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 391: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 394: goto 39b
      // 397: invokestatic oon.a (Loov;)Loov;
      // 39a: athrow
      // 39b: iadd
      // 39c: istore 13
      // 39e: aload 0
      // 39f: iload 12
      // 3a1: iload 9
      // 3a3: bipush 1
      // 3a4: isub
      // 3a5: iload 13
      // 3a7: bipush 1
      // 3a8: isub
      // 3a9: iload 9
      // 3ab: bipush 1
      // 3ac: iadd
      // 3ad: aload 0
      // 3ae: getfield oon.r2a Lowt;
      // 3b1: getfield owt.rr7 I
      // 3b4: iadd
      // 3b5: invokespecial oon.n5x (IIII)V
      // 3b8: return
   }

   private void n5x(int param1, int param2, int param3, int param4) {
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
      // 12: invokestatic oon.a (Loov;)Loov;
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
      // 2c: invokestatic oon.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 2
      // 31: istore 6
      // 33: iload 4
      // 35: istore 2
      // 36: iload 6
      // 38: istore 4
      // 3a: iload 3
      // 3b: aload 0
      // 3c: getfield oon.rvn I
      // 3f: aload 0
      // 40: getfield oon.agz I
      // 43: iadd
      // 44: iload 5
      // 46: ifne 67
      // 49: if_icmple 5d
      // 4c: goto 53
      // 4f: invokestatic oon.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield oon.rvn I
      // 57: aload 0
      // 58: getfield oon.agz I
      // 5b: iadd
      // 5c: istore 3
      // 5d: iload 1
      // 5e: aload 0
      // 5f: getfield oon.rvn I
      // 62: aload 0
      // 63: getfield oon.agz I
      // 66: iadd
      // 67: iload 5
      // 69: ifne 85
      // 6c: if_icmple 87
      // 6f: goto 76
      // 72: invokestatic oon.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: getfield oon.rvn I
      // 7a: aload 0
      // 7b: getfield oon.agz I
      // 7e: goto 85
      // 81: invokestatic oon.a (Loov;)Loov;
      // 84: athrow
      // 85: iadd
      // 86: istore 1
      // 87: invokestatic jom.yut ()Ljom;
      // 8a: astore 7
      // 8c: aload 7
      // 8e: invokevirtual jom.zuq ()Lq3g;
      // 91: astore 8
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
      // aa: aload 8
      // ac: bipush 7
      // ae: getstatic gnl.gx3 Lbe7;
      // b1: invokevirtual q3g.ezr (ILbe7;)V
      // b4: aload 8
      // b6: iload 1
      // b7: i2d
      // b8: iload 4
      // ba: i2d
      // bb: dconst_0
      // bc: invokevirtual q3g.g5o (DDD)Lq3g;
      // bf: pop
      // c0: aload 8
      // c2: iload 3
      // c3: i2d
      // c4: iload 4
      // c6: i2d
      // c7: dconst_0
      // c8: invokevirtual q3g.g5o (DDD)Lq3g;
      // cb: pop
      // cc: aload 8
      // ce: iload 3
      // cf: i2d
      // d0: iload 2
      // d1: i2d
      // d2: dconst_0
      // d3: invokevirtual q3g.g5o (DDD)Lq3g;
      // d6: pop
      // d7: aload 8
      // d9: iload 1
      // da: i2d
      // db: iload 2
      // dc: i2d
      // dd: dconst_0
      // de: invokevirtual q3g.g5o (DDD)Lq3g;
      // e1: pop
      // e2: aload 7
      // e4: invokevirtual jom.q7g ()V
      // e7: invokestatic hzu.gyq ()V
      // ea: invokestatic hzu.rqj ()V
      // ed: return
   }

   public void lg5(int param1) {
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
      // 05: iload 1
      // 06: putfield oon.lvs I
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 27
      // 0e: getfield oon.lkt Ljava/lang/String;
      // 11: invokevirtual java/lang/String.length ()I
      // 14: iload 1
      // 15: if_icmple 33
      // 18: goto 1f
      // 1b: invokestatic oon.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic oon.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield oon.lkt Ljava/lang/String;
      // 2b: bipush 0
      // 2c: iload 1
      // 2d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 30: putfield oon.lkt Ljava/lang/String;
      // 33: return
   }

   public int edf() {
      return this.lvs;
   }

   public int qvo() {
      return this.ohl;
   }

   public boolean _26() {
      return this.mw4;
   }

   public void nrt(boolean var1) {
      this.mw4 = var1;
   }

   public void eu2(int var1) {
      this.d1t = var1;
   }

   public void psd(int var1) {
      this.cu5 = var1;
   }

   public void m4g(boolean param1) {
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
      // 0f: invokestatic oon.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 39
      // 18: goto 1f
      // 1b: invokestatic oon.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getfield oon.hcg Z
      // 22: goto 29
      // 25: invokestatic oon.a (Loov;)Loov;
      // 28: athrow
      // 29: ifne 38
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: putfield oon.x9p I
      // 31: goto 38
      // 34: invokestatic oon.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: iload 1
      // 3a: putfield oon.hcg Z
      // 3d: return
   }

   public boolean s16() {
      return this.hcg;
   }

   public void m6q(boolean var1) {
      this.dj3 = var1;
   }

   public int nhh() {
      return this.oh3;
   }

   public int sjf() {
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
      // 09: invokevirtual oon._26 ()Z
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic oon.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield oon.agz I
      // 1a: bipush 8
      // 1c: isub
      // 1d: goto 28
      // 20: invokestatic oon.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield oon.agz I
      // 28: ireturn
   }

   public void ngy(int param1) {
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
      // 005: getfield oon.lkt Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: istore 3
      // 00c: iload 1
      // 00d: iload 2
      // 00e: ifeq 01f
      // 011: iload 3
      // 012: if_icmple 01e
      // 015: goto 01c
      // 018: invokestatic oon.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 3
      // 01d: istore 1
      // 01e: iload 1
      // 01f: iload 2
      // 020: ifeq 02e
      // 023: ifge 02f
      // 026: goto 02d
      // 029: invokestatic oon.a (Loov;)Loov;
      // 02c: athrow
      // 02d: bipush 0
      // 02e: istore 1
      // 02f: aload 0
      // 030: iload 1
      // 031: putfield oon.oh3 I
      // 034: aload 0
      // 035: iload 2
      // 036: ifeq 04e
      // 039: getfield oon.r2a Lowt;
      // 03c: ifnull 123
      // 03f: goto 046
      // 042: invokestatic oon.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: goto 04e
      // 04a: invokestatic oon.a (Loov;)Loov;
      // 04d: athrow
      // 04e: getfield oon.ee2 I
      // 051: iload 2
      // 052: ifeq 070
      // 055: iload 3
      // 056: if_icmple 06c
      // 059: goto 060
      // 05c: invokestatic oon.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: iload 3
      // 062: putfield oon.ee2 I
      // 065: goto 06c
      // 068: invokestatic oon.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: invokevirtual oon.sjf ()I
      // 070: istore 4
      // 072: aload 0
      // 073: getfield oon.r2a Lowt;
      // 076: aload 0
      // 077: getfield oon.lkt Ljava/lang/String;
      // 07a: aload 0
      // 07b: getfield oon.ee2 I
      // 07e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 081: iload 4
      // 083: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 086: astore 5
      // 088: aload 5
      // 08a: invokevirtual java/lang/String.length ()I
      // 08d: aload 0
      // 08e: getfield oon.ee2 I
      // 091: iadd
      // 092: istore 6
      // 094: iload 1
      // 095: aload 0
      // 096: getfield oon.ee2 I
      // 099: iload 2
      // 09a: ifeq 0cb
      // 09d: if_icmpne 0c8
      // 0a0: goto 0a7
      // 0a3: invokestatic oon.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: dup
      // 0a9: getfield oon.ee2 I
      // 0ac: aload 0
      // 0ad: getfield oon.r2a Lowt;
      // 0b0: aload 0
      // 0b1: getfield oon.lkt Ljava/lang/String;
      // 0b4: iload 4
      // 0b6: bipush 1
      // 0b7: invokevirtual owt.m8q (Ljava/lang/String;IZ)Ljava/lang/String;
      // 0ba: invokevirtual java/lang/String.length ()I
      // 0bd: isub
      // 0be: putfield oon.ee2 I
      // 0c1: goto 0c8
      // 0c4: invokestatic oon.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 1
      // 0c9: iload 6
      // 0cb: iload 2
      // 0cc: ifeq 0fd
      // 0cf: if_icmple 0f1
      // 0d2: goto 0d9
      // 0d5: invokestatic oon.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield oon.ee2 I
      // 0de: iload 1
      // 0df: iload 6
      // 0e1: isub
      // 0e2: iadd
      // 0e3: putfield oon.ee2 I
      // 0e6: iload 2
      // 0e7: ifne 116
      // 0ea: goto 0f1
      // 0ed: invokestatic oon.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 1
      // 0f2: aload 0
      // 0f3: getfield oon.ee2 I
      // 0f6: goto 0fd
      // 0f9: invokestatic oon.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: if_icmpgt 116
      // 100: aload 0
      // 101: dup
      // 102: getfield oon.ee2 I
      // 105: aload 0
      // 106: getfield oon.ee2 I
      // 109: iload 1
      // 10a: isub
      // 10b: isub
      // 10c: putfield oon.ee2 I
      // 10f: goto 116
      // 112: invokestatic oon.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: aload 0
      // 118: getfield oon.ee2 I
      // 11b: bipush 0
      // 11c: iload 3
      // 11d: invokestatic fe6.faa (III)I
      // 120: putfield oon.ee2 I
      // 123: return
   }

   public void eg4(boolean var1) {
      this.yra = var1;
   }

   public boolean n5g() {
      return this.wk9;
   }

   public void v0r(boolean var1) {
      this.wk9 = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
