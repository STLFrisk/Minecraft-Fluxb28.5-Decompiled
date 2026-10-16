import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s51 extends b0t {
   private final int ctr;
   private final owt ugi;
   public int oo5;
   public int qwr;
   private final int wj2;
   private final int xh3;
   private String e5j = "";
   private int die = 32;
   private int vmb;
   private boolean pyi = true;
   private boolean x7b = true;
   private boolean _8c;
   private boolean wsv = true;
   private int rdj;
   private int az4;
   private int m16;
   private int pjv = 14737632;
   private int j55 = 7368816;
   private boolean vf4 = true;
   private gkx$lpc k9a;
   private Predicate eda = Predicates.alwaysTrue();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public s51(int var1, owt var2, int var3, int var4, int var5, int var6) {
      this.ctr = var1;
      this.ugi = var2;
      this.oo5 = var3;
      this.qwr = var4;
      this.wj2 = var5;
      this.xh3 = var6;
   }

   public void ujx(gkx$lpc var1) {
      this.k9a = var1;
   }

   public void t6g() {
      this.vmb++;
   }

   public void r1u(String param1) {
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
      // 05: getfield s51.eda Lcom/google/common/base/Predicate;
      // 08: aload 1
      // 09: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 0e: iload 2
      // 0f: ifeq 27
      // 12: ifeq 56
      // 15: goto 1c
      // 18: invokestatic s51.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/lang/String.length ()I
      // 20: goto 27
      // 23: invokestatic s51.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield s51.die I
      // 2b: if_icmple 46
      // 2e: aload 0
      // 2f: aload 1
      // 30: bipush 0
      // 31: aload 0
      // 32: getfield s51.die I
      // 35: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 38: putfield s51.e5j Ljava/lang/String;
      // 3b: iload 2
      // 3c: ifne 52
      // 3f: goto 46
      // 42: invokestatic s51.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: aload 1
      // 48: putfield s51.e5j Ljava/lang/String;
      // 4b: goto 52
      // 4e: invokestatic s51.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: invokevirtual s51.o0v ()V
      // 56: return
   }

   public String k9b() {
      return this.e5j;
   }

   public String pal() {
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
      // 09: getfield s51.az4 I
      // 0c: aload 0
      // 0d: getfield s51.m16 I
      // 10: if_icmpge 25
      // 13: goto 1a
      // 16: invokestatic s51.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield s51.az4 I
      // 1e: goto 29
      // 21: invokestatic s51.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield s51.m16 I
      // 29: istore 2
      // 2a: aload 0
      // 2b: iload 1
      // 2c: ifeq 4c
      // 2f: getfield s51.az4 I
      // 32: aload 0
      // 33: getfield s51.m16 I
      // 36: if_icmpge 4b
      // 39: goto 40
      // 3c: invokestatic s51.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield s51.m16 I
      // 44: goto 4f
      // 47: invokestatic s51.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield s51.az4 I
      // 4f: istore 3
      // 50: aload 0
      // 51: getfield s51.e5j Ljava/lang/String;
      // 54: iload 2
      // 55: iload 3
      // 56: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 59: areturn
   }

   public void xx2(Predicate var1) {
      this.eda = var1;
   }

   public void _ct(String param1) {
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
      // 013: getfield s51.az4 I
      // 016: aload 0
      // 017: getfield s51.m16 I
      // 01a: if_icmpge 02f
      // 01d: goto 024
      // 020: invokestatic s51.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: getfield s51.az4 I
      // 028: goto 033
      // 02b: invokestatic s51.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield s51.m16 I
      // 033: istore 5
      // 035: aload 0
      // 036: iload 2
      // 037: ifeq 057
      // 03a: getfield s51.az4 I
      // 03d: aload 0
      // 03e: getfield s51.m16 I
      // 041: if_icmpge 056
      // 044: goto 04b
      // 047: invokestatic s51.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield s51.m16 I
      // 04f: goto 05a
      // 052: invokestatic s51.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: getfield s51.az4 I
      // 05a: istore 6
      // 05c: aload 0
      // 05d: getfield s51.die I
      // 060: aload 0
      // 061: getfield s51.e5j Ljava/lang/String;
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
      // 074: getfield s51.e5j Ljava/lang/String;
      // 077: invokevirtual java/lang/String.length ()I
      // 07a: iload 2
      // 07b: ifeq 0a6
      // 07e: ifle 0a4
      // 081: goto 088
      // 084: invokestatic s51.a (Loov;)Loov;
      // 087: athrow
      // 088: new java/lang/StringBuilder
      // 08b: dup
      // 08c: invokespecial java/lang/StringBuilder.<init> ()V
      // 08f: aload 3
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: aload 0
      // 094: getfield s51.e5j Ljava/lang/String;
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
      // 0b5: invokestatic s51.a (Loov;)Loov;
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
      // 0f7: getfield s51.e5j Ljava/lang/String;
      // 0fa: invokevirtual java/lang/String.length ()I
      // 0fd: iload 2
      // 0fe: ifeq 159
      // 101: ifle 144
      // 104: goto 10b
      // 107: invokestatic s51.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 6
      // 10d: iload 2
      // 10e: ifeq 159
      // 111: goto 118
      // 114: invokestatic s51.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: getfield s51.e5j Ljava/lang/String;
      // 11c: invokevirtual java/lang/String.length ()I
      // 11f: if_icmpge 144
      // 122: goto 129
      // 125: invokestatic s51.a (Loov;)Loov;
      // 128: athrow
      // 129: new java/lang/StringBuilder
      // 12c: dup
      // 12d: invokespecial java/lang/StringBuilder.<init> ()V
      // 130: aload 3
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: aload 0
      // 135: getfield s51.e5j Ljava/lang/String;
      // 138: iload 6
      // 13a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 143: astore 3
      // 144: aload 0
      // 145: iload 2
      // 146: ifeq 177
      // 149: getfield s51.eda Lcom/google/common/base/Predicate;
      // 14c: aload 3
      // 14d: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 152: goto 159
      // 155: invokestatic s51.a (Loov;)Loov;
      // 158: athrow
      // 159: ifeq 1a0
      // 15c: aload 0
      // 15d: aload 3
      // 15e: putfield s51.e5j Ljava/lang/String;
      // 161: aload 0
      // 162: iload 5
      // 164: aload 0
      // 165: getfield s51.m16 I
      // 168: isub
      // 169: iload 8
      // 16b: iadd
      // 16c: invokevirtual s51.u2z (I)V
      // 16f: aload 0
      // 170: goto 177
      // 173: invokestatic s51.a (Loov;)Loov;
      // 176: athrow
      // 177: getfield s51.k9a Lgkx$lpc;
      // 17a: iload 2
      // 17b: ifeq 193
      // 17e: ifnull 1a0
      // 181: goto 188
      // 184: invokestatic s51.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 0
      // 189: getfield s51.k9a Lgkx$lpc;
      // 18c: goto 193
      // 18f: invokestatic s51.a (Loov;)Loov;
      // 192: athrow
      // 193: aload 0
      // 194: getfield s51.ctr I
      // 197: aload 0
      // 198: getfield s51.e5j Ljava/lang/String;
      // 19b: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 1a0: return
   }

   public void d3b(int param1) {
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
      // 05: getfield s51.e5j Ljava/lang/String;
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: iload 2
      // 0c: ifeq 2f
      // 0f: ifeq 5d
      // 12: goto 19
      // 15: invokestatic s51.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifeq 50
      // 1e: goto 25
      // 21: invokestatic s51.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield s51.m16 I
      // 28: goto 2f
      // 2b: invokestatic s51.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield s51.az4 I
      // 33: if_icmpeq 48
      // 36: aload 0
      // 37: ldc ""
      // 39: nop
      // 3a: invokevirtual s51._ct (Ljava/lang/String;)V
      // 3d: iload 2
      // 3e: ifne 5d
      // 41: goto 48
      // 44: invokestatic s51.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic s51.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: iload 1
      // 52: invokevirtual s51.y4c (I)I
      // 55: aload 0
      // 56: getfield s51.az4 I
      // 59: isub
      // 5a: invokevirtual s51.wm6 (I)V
      // 5d: return
   }

   public void wm6(int param1) {
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
      // 005: getfield s51.e5j Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: iload 2
      // 00c: ifeq 024
      // 00f: ifeq 16b
      // 012: goto 019
      // 015: invokestatic s51.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield s51.m16 I
      // 01d: goto 024
      // 020: invokestatic s51.a (Loov;)Loov;
      // 023: athrow
      // 024: iload 2
      // 025: ifeq 050
      // 028: aload 0
      // 029: getfield s51.az4 I
      // 02c: if_icmpeq 048
      // 02f: goto 036
      // 032: invokestatic s51.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: ldc ""
      // 039: nop
      // 03a: invokevirtual s51._ct (Ljava/lang/String;)V
      // 03d: iload 2
      // 03e: ifne 16b
      // 041: goto 048
      // 044: invokestatic s51.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 1
      // 049: goto 050
      // 04c: invokestatic s51.a (Loov;)Loov;
      // 04f: athrow
      // 050: iload 2
      // 051: ifeq 05f
      // 054: ifge 062
      // 057: goto 05e
      // 05a: invokestatic s51.a (Loov;)Loov;
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
      // 06f: invokestatic s51.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield s51.az4 I
      // 077: iload 1
      // 078: iadd
      // 079: goto 080
      // 07c: invokestatic s51.a (Loov;)Loov;
      // 07f: athrow
      // 080: goto 087
      // 083: aload 0
      // 084: getfield s51.az4 I
      // 087: istore 4
      // 089: iload 3
      // 08a: iload 2
      // 08b: ifeq 0a7
      // 08e: ifeq 0a3
      // 091: goto 098
      // 094: invokestatic s51.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: getfield s51.az4 I
      // 09c: goto 0a9
      // 09f: invokestatic s51.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield s51.az4 I
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
      // 0bc: invokestatic s51.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield s51.e5j Ljava/lang/String;
      // 0c4: bipush 0
      // 0c5: iload 4
      // 0c7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ca: astore 6
      // 0cc: iload 5
      // 0ce: iload 2
      // 0cf: ifeq 10b
      // 0d2: aload 0
      // 0d3: getfield s51.e5j Ljava/lang/String;
      // 0d6: invokevirtual java/lang/String.length ()I
      // 0d9: if_icmpge 100
      // 0dc: goto 0e3
      // 0df: invokestatic s51.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: new java/lang/StringBuilder
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ea: aload 6
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: aload 0
      // 0f0: getfield s51.e5j Ljava/lang/String;
      // 0f3: iload 5
      // 0f5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: astore 6
      // 100: aload 0
      // 101: getfield s51.eda Lcom/google/common/base/Predicate;
      // 104: aload 6
      // 106: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 10b: iload 2
      // 10c: ifeq 132
      // 10f: ifeq 16b
      // 112: goto 119
      // 115: invokestatic s51.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 2
      // 11b: ifeq 142
      // 11e: goto 125
      // 121: invokestatic s51.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 6
      // 127: putfield s51.e5j Ljava/lang/String;
      // 12a: iload 3
      // 12b: goto 132
      // 12e: invokestatic s51.a (Loov;)Loov;
      // 131: athrow
      // 132: ifeq 141
      // 135: aload 0
      // 136: iload 1
      // 137: invokevirtual s51.u2z (I)V
      // 13a: goto 141
      // 13d: invokestatic s51.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: getfield s51.k9a Lgkx$lpc;
      // 145: iload 2
      // 146: ifeq 15e
      // 149: ifnull 16b
      // 14c: goto 153
      // 14f: invokestatic s51.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 0
      // 154: getfield s51.k9a Lgkx$lpc;
      // 157: goto 15e
      // 15a: invokestatic s51.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 0
      // 15f: getfield s51.ctr I
      // 162: aload 0
      // 163: getfield s51.e5j Ljava/lang/String;
      // 166: invokeinterface gkx$lpc.n7z (ILjava/lang/String;)V 3
      // 16b: return
   }

   public int sq4() {
      return this.ctr;
   }

   public int y4c(int var1) {
      return this.l1a(var1, this.hnu());
   }

   public int l1a(int var1, int var2) {
      return this.h5u(var1, var2, true);
   }

   public int h5u(int param1, int param2, boolean param3) {
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
      // 014: invokestatic s51.a (Loov;)Loov;
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
      // 03e: invokestatic s51.a (Loov;)Loov;
      // 041: athrow
      // 042: ifne 0d0
      // 045: goto 04c
      // 048: invokestatic s51.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield s51.e5j Ljava/lang/String;
      // 050: invokevirtual java/lang/String.length ()I
      // 053: istore 9
      // 055: aload 0
      // 056: getfield s51.e5j Ljava/lang/String;
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
      // 070: invokestatic s51.a (Loov;)Loov;
      // 073: athrow
      // 074: iload 9
      // 076: istore 5
      // 078: iload 4
      // 07a: ifne 0cb
      // 07d: iload 3
      // 07e: goto 085
      // 081: invokestatic s51.a (Loov;)Loov;
      // 084: athrow
      // 085: ifeq 0cb
      // 088: iload 5
      // 08a: iload 9
      // 08c: iload 4
      // 08e: ifeq 02c
      // 091: goto 098
      // 094: invokestatic s51.a (Loov;)Loov;
      // 097: athrow
      // 098: iload 4
      // 09a: ifeq 0b9
      // 09d: if_icmpge 0cb
      // 0a0: goto 0a7
      // 0a3: invokestatic s51.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield s51.e5j Ljava/lang/String;
      // 0ab: iload 5
      // 0ad: invokevirtual java/lang/String.charAt (I)C
      // 0b0: bipush 32
      // 0b2: goto 0b9
      // 0b5: invokestatic s51.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: if_icmpne 0cb
      // 0bc: iinc 5 1
      // 0bf: iload 4
      // 0c1: ifne 07d
      // 0c4: goto 0cb
      // 0c7: invokestatic s51.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: iload 4
      // 0cd: ifne 161
      // 0d0: iload 3
      // 0d1: goto 0d8
      // 0d4: invokestatic s51.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: ifeq 131
      // 0db: iload 5
      // 0dd: iload 4
      // 0df: ifeq 133
      // 0e2: goto 0e9
      // 0e5: invokestatic s51.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 4
      // 0eb: ifeq 133
      // 0ee: goto 0f5
      // 0f1: invokestatic s51.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifle 131
      // 0f8: goto 0ff
      // 0fb: invokestatic s51.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield s51.e5j Ljava/lang/String;
      // 103: iload 5
      // 105: bipush 1
      // 106: isub
      // 107: invokevirtual java/lang/String.charAt (I)C
      // 10a: iload 4
      // 10c: ifeq 133
      // 10f: goto 116
      // 112: invokestatic s51.a (Loov;)Loov;
      // 115: athrow
      // 116: bipush 32
      // 118: if_icmpne 131
      // 11b: goto 122
      // 11e: invokestatic s51.a (Loov;)Loov;
      // 121: athrow
      // 122: iinc 5 -1
      // 125: iload 4
      // 127: ifne 0d0
      // 12a: goto 131
      // 12d: invokestatic s51.a (Loov;)Loov;
      // 130: athrow
      // 131: iload 5
      // 133: ifle 161
      // 136: aload 0
      // 137: getfield s51.e5j Ljava/lang/String;
      // 13a: iload 5
      // 13c: bipush 1
      // 13d: isub
      // 13e: invokevirtual java/lang/String.charAt (I)C
      // 141: bipush 32
      // 143: iload 4
      // 145: ifeq 02c
      // 148: goto 14f
      // 14b: invokestatic s51.a (Loov;)Loov;
      // 14e: athrow
      // 14f: if_icmpeq 161
      // 152: iinc 5 -1
      // 155: iload 4
      // 157: ifne 131
      // 15a: goto 161
      // 15d: invokestatic s51.a (Loov;)Loov;
      // 160: athrow
      // 161: iinc 8 1
      // 164: iload 4
      // 166: ifne 028
      // 169: iload 5
      // 16b: ireturn
   }

   public void u2z(int var1) {
      this.b1m(this.m16 + var1);
   }

   public void b1m(int var1) {
      this.az4 = var1;
      int var2 = this.e5j.length();
      this.az4 = fe6.faa(this.az4, 0, var2);
      this.v5m(this.az4);
   }

   public void f5v() {
      this.b1m(0);
   }

   public void o0v() {
      this.b1m(this.e5j.length());
   }

   public boolean iu9(char param1, int param2) {
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
      // 005: getfield s51._8c Z
      // 008: iload 3
      // 009: ifeq 020
      // 00c: ifne 01c
      // 00f: goto 016
      // 012: invokestatic s51.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic s51.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 2
      // 01d: invokestatic ShaderHelper.ul2 (I)Z
      // 020: iload 3
      // 021: ifeq 041
      // 024: ifeq 03d
      // 027: goto 02e
      // 02a: invokestatic s51.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual s51.o0v ()V
      // 032: aload 0
      // 033: bipush 0
      // 034: invokevirtual s51.v5m (I)V
      // 037: bipush 1
      // 038: ireturn
      // 039: invokestatic s51.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iload 2
      // 03e: invokestatic ShaderHelper.y4j (I)Z
      // 041: iload 3
      // 042: ifeq 060
      // 045: ifeq 05c
      // 048: goto 04f
      // 04b: invokestatic s51.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: invokevirtual s51.pal ()Ljava/lang/String;
      // 053: invokestatic ShaderHelper.vjv (Ljava/lang/String;)V
      // 056: bipush 1
      // 057: ireturn
      // 058: invokestatic s51.a (Loov;)Loov;
      // 05b: athrow
      // 05c: iload 2
      // 05d: invokestatic ShaderHelper.foo (I)Z
      // 060: iload 3
      // 061: ifeq 09b
      // 064: ifeq 097
      // 067: goto 06e
      // 06a: invokestatic s51.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield s51.wsv Z
      // 072: iload 3
      // 073: ifeq 096
      // 076: goto 07d
      // 079: invokestatic s51.a (Loov;)Loov;
      // 07c: athrow
      // 07d: ifeq 095
      // 080: goto 087
      // 083: invokestatic s51.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: invokestatic ShaderHelper.b0r ()Ljava/lang/String;
      // 08b: invokevirtual s51._ct (Ljava/lang/String;)V
      // 08e: goto 095
      // 091: invokestatic s51.a (Loov;)Loov;
      // 094: athrow
      // 095: bipush 1
      // 096: ireturn
      // 097: iload 2
      // 098: invokestatic ShaderHelper.uqk (I)Z
      // 09b: iload 3
      // 09c: ifeq 0da
      // 09f: ifeq 0d9
      // 0a2: goto 0a9
      // 0a5: invokestatic s51.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: invokevirtual s51.pal ()Ljava/lang/String;
      // 0ad: invokestatic ShaderHelper.vjv (Ljava/lang/String;)V
      // 0b0: aload 0
      // 0b1: getfield s51.wsv Z
      // 0b4: iload 3
      // 0b5: ifeq 0d8
      // 0b8: goto 0bf
      // 0bb: invokestatic s51.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifeq 0d7
      // 0c2: goto 0c9
      // 0c5: invokestatic s51.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: ldc ""
      // 0cc: nop
      // 0cd: invokevirtual s51._ct (Ljava/lang/String;)V
      // 0d0: goto 0d7
      // 0d3: invokestatic s51.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: bipush 1
      // 0d8: ireturn
      // 0d9: iload 2
      // 0da: iload 3
      // 0db: ifeq 329
      // 0de: lookupswitch 583 6 14 62 199 166 203 201 205 323 207 445 211 486
      // 118: invokestatic s51.a (Loov;)Loov;
      // 11b: athrow
      // 11c: invokestatic ShaderHelper.t_s ()Z
      // 11f: iload 3
      // 120: ifeq 168
      // 123: goto 12a
      // 126: invokestatic s51.a (Loov;)Loov;
      // 129: athrow
      // 12a: ifeq 15d
      // 12d: goto 134
      // 130: invokestatic s51.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 0
      // 135: getfield s51.wsv Z
      // 138: iload 3
      // 139: ifeq 183
      // 13c: goto 143
      // 13f: invokestatic s51.a (Loov;)Loov;
      // 142: athrow
      // 143: ifeq 182
      // 146: goto 14d
      // 149: invokestatic s51.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: bipush -1
      // 14f: invokevirtual s51.d3b (I)V
      // 152: iload 3
      // 153: ifne 182
      // 156: goto 15d
      // 159: invokestatic s51.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield s51.wsv Z
      // 161: goto 168
      // 164: invokestatic s51.a (Loov;)Loov;
      // 167: athrow
      // 168: iload 3
      // 169: ifeq 183
      // 16c: ifeq 182
      // 16f: goto 176
      // 172: invokestatic s51.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: bipush -1
      // 178: invokevirtual s51.wm6 (I)V
      // 17b: goto 182
      // 17e: invokestatic s51.a (Loov;)Loov;
      // 181: athrow
      // 182: bipush 1
      // 183: ireturn
      // 184: invokestatic ShaderHelper.dmk ()Z
      // 187: ifeq 19a
      // 18a: aload 0
      // 18b: bipush 0
      // 18c: invokevirtual s51.v5m (I)V
      // 18f: iload 3
      // 190: ifne 1a5
      // 193: goto 19a
      // 196: invokestatic s51.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 0
      // 19b: invokevirtual s51.f5v ()V
      // 19e: goto 1a5
      // 1a1: invokestatic s51.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: bipush 1
      // 1a6: ireturn
      // 1a7: invokestatic ShaderHelper.dmk ()Z
      // 1aa: iload 3
      // 1ab: ifeq 1fc
      // 1ae: ifeq 1f2
      // 1b1: goto 1b8
      // 1b4: invokestatic s51.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: invokestatic ShaderHelper.t_s ()Z
      // 1bb: ifeq 1dd
      // 1be: goto 1c5
      // 1c1: invokestatic s51.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: aload 0
      // 1c7: bipush -1
      // 1c8: aload 0
      // 1c9: invokevirtual s51.m8g ()I
      // 1cc: invokevirtual s51.l1a (II)I
      // 1cf: invokevirtual s51.v5m (I)V
      // 1d2: iload 3
      // 1d3: ifne 21f
      // 1d6: goto 1dd
      // 1d9: invokestatic s51.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: aload 0
      // 1df: invokevirtual s51.m8g ()I
      // 1e2: bipush 1
      // 1e3: isub
      // 1e4: invokevirtual s51.v5m (I)V
      // 1e7: iload 3
      // 1e8: ifne 21f
      // 1eb: goto 1f2
      // 1ee: invokestatic s51.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: invokestatic ShaderHelper.t_s ()Z
      // 1f5: goto 1fc
      // 1f8: invokestatic s51.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: ifeq 213
      // 1ff: aload 0
      // 200: aload 0
      // 201: bipush -1
      // 202: invokevirtual s51.y4c (I)I
      // 205: invokevirtual s51.b1m (I)V
      // 208: iload 3
      // 209: ifne 21f
      // 20c: goto 213
      // 20f: invokestatic s51.a (Loov;)Loov;
      // 212: athrow
      // 213: aload 0
      // 214: bipush -1
      // 215: invokevirtual s51.u2z (I)V
      // 218: goto 21f
      // 21b: invokestatic s51.a (Loov;)Loov;
      // 21e: athrow
      // 21f: bipush 1
      // 220: ireturn
      // 221: invokestatic ShaderHelper.dmk ()Z
      // 224: iload 3
      // 225: ifeq 276
      // 228: ifeq 26c
      // 22b: goto 232
      // 22e: invokestatic s51.a (Loov;)Loov;
      // 231: athrow
      // 232: invokestatic ShaderHelper.t_s ()Z
      // 235: ifeq 257
      // 238: goto 23f
      // 23b: invokestatic s51.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 0
      // 240: aload 0
      // 241: bipush 1
      // 242: aload 0
      // 243: invokevirtual s51.m8g ()I
      // 246: invokevirtual s51.l1a (II)I
      // 249: invokevirtual s51.v5m (I)V
      // 24c: iload 3
      // 24d: ifne 299
      // 250: goto 257
      // 253: invokestatic s51.a (Loov;)Loov;
      // 256: athrow
      // 257: aload 0
      // 258: aload 0
      // 259: invokevirtual s51.m8g ()I
      // 25c: bipush 1
      // 25d: iadd
      // 25e: invokevirtual s51.v5m (I)V
      // 261: iload 3
      // 262: ifne 299
      // 265: goto 26c
      // 268: invokestatic s51.a (Loov;)Loov;
      // 26b: athrow
      // 26c: invokestatic ShaderHelper.t_s ()Z
      // 26f: goto 276
      // 272: invokestatic s51.a (Loov;)Loov;
      // 275: athrow
      // 276: ifeq 28d
      // 279: aload 0
      // 27a: aload 0
      // 27b: bipush 1
      // 27c: invokevirtual s51.y4c (I)I
      // 27f: invokevirtual s51.b1m (I)V
      // 282: iload 3
      // 283: ifne 299
      // 286: goto 28d
      // 289: invokestatic s51.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 0
      // 28e: bipush 1
      // 28f: invokevirtual s51.u2z (I)V
      // 292: goto 299
      // 295: invokestatic s51.a (Loov;)Loov;
      // 298: athrow
      // 299: bipush 1
      // 29a: ireturn
      // 29b: invokestatic ShaderHelper.dmk ()Z
      // 29e: ifeq 2b7
      // 2a1: aload 0
      // 2a2: aload 0
      // 2a3: getfield s51.e5j Ljava/lang/String;
      // 2a6: invokevirtual java/lang/String.length ()I
      // 2a9: invokevirtual s51.v5m (I)V
      // 2ac: iload 3
      // 2ad: ifne 2c2
      // 2b0: goto 2b7
      // 2b3: invokestatic s51.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: invokevirtual s51.o0v ()V
      // 2bb: goto 2c2
      // 2be: invokestatic s51.a (Loov;)Loov;
      // 2c1: athrow
      // 2c2: bipush 1
      // 2c3: ireturn
      // 2c4: invokestatic ShaderHelper.t_s ()Z
      // 2c7: iload 3
      // 2c8: ifeq 309
      // 2cb: ifeq 2fe
      // 2ce: goto 2d5
      // 2d1: invokestatic s51.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: getfield s51.wsv Z
      // 2d9: iload 3
      // 2da: ifeq 324
      // 2dd: goto 2e4
      // 2e0: invokestatic s51.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: ifeq 323
      // 2e7: goto 2ee
      // 2ea: invokestatic s51.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: aload 0
      // 2ef: bipush 1
      // 2f0: invokevirtual s51.d3b (I)V
      // 2f3: iload 3
      // 2f4: ifne 323
      // 2f7: goto 2fe
      // 2fa: invokestatic s51.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: aload 0
      // 2ff: getfield s51.wsv Z
      // 302: goto 309
      // 305: invokestatic s51.a (Loov;)Loov;
      // 308: athrow
      // 309: iload 3
      // 30a: ifeq 324
      // 30d: ifeq 323
      // 310: goto 317
      // 313: invokestatic s51.a (Loov;)Loov;
      // 316: athrow
      // 317: aload 0
      // 318: bipush 1
      // 319: invokevirtual s51.wm6 (I)V
      // 31c: goto 323
      // 31f: invokestatic s51.a (Loov;)Loov;
      // 322: athrow
      // 323: bipush 1
      // 324: ireturn
      // 325: iload 1
      // 326: invokestatic _xi._m2 (C)Z
      // 329: iload 3
      // 32a: ifeq 362
      // 32d: ifeq 361
      // 330: goto 337
      // 333: invokestatic s51.a (Loov;)Loov;
      // 336: athrow
      // 337: aload 0
      // 338: getfield s51.wsv Z
      // 33b: iload 3
      // 33c: ifeq 360
      // 33f: goto 346
      // 342: invokestatic s51.a (Loov;)Loov;
      // 345: athrow
      // 346: ifeq 35f
      // 349: goto 350
      // 34c: invokestatic s51.a (Loov;)Loov;
      // 34f: athrow
      // 350: aload 0
      // 351: iload 1
      // 352: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 355: invokevirtual s51._ct (Ljava/lang/String;)V
      // 358: goto 35f
      // 35b: invokestatic s51.a (Loov;)Loov;
      // 35e: athrow
      // 35f: bipush 1
      // 360: ireturn
      // 361: bipush 0
      // 362: ireturn
   }

   public void u6o(int param1, int param2, int param3) {
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
      // 007: getfield s51.oo5 I
      // 00a: iload 4
      // 00c: ifne 02a
      // 00f: if_icmplt 078
      // 012: goto 019
      // 015: invokestatic s51.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 1
      // 01a: aload 0
      // 01b: getfield s51.oo5 I
      // 01e: aload 0
      // 01f: getfield s51.wj2 I
      // 022: iadd
      // 023: goto 02a
      // 026: invokestatic s51.a (Loov;)Loov;
      // 029: athrow
      // 02a: iload 4
      // 02c: ifne 045
      // 02f: if_icmpge 078
      // 032: goto 039
      // 035: invokestatic s51.a (Loov;)Loov;
      // 038: athrow
      // 039: iload 2
      // 03a: aload 0
      // 03b: getfield s51.qwr I
      // 03e: goto 045
      // 041: invokestatic s51.a (Loov;)Loov;
      // 044: athrow
      // 045: iload 4
      // 047: ifne 071
      // 04a: if_icmplt 078
      // 04d: goto 054
      // 050: invokestatic s51.a (Loov;)Loov;
      // 053: athrow
      // 054: iload 2
      // 055: iload 4
      // 057: ifne 075
      // 05a: goto 061
      // 05d: invokestatic s51.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield s51.qwr I
      // 065: aload 0
      // 066: getfield s51.xh3 I
      // 069: iadd
      // 06a: goto 071
      // 06d: invokestatic s51.a (Loov;)Loov;
      // 070: athrow
      // 071: if_icmpge 078
      // 074: bipush 1
      // 075: goto 079
      // 078: bipush 0
      // 079: istore 5
      // 07b: aload 0
      // 07c: getfield s51.x7b Z
      // 07f: iload 4
      // 081: ifne 09f
      // 084: ifeq 09b
      // 087: goto 08e
      // 08a: invokestatic s51.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: iload 5
      // 091: invokevirtual s51._di (Z)V
      // 094: goto 09b
      // 097: invokestatic s51.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield s51._8c Z
      // 09f: iload 4
      // 0a1: ifne 0b0
      // 0a4: ifeq 12a
      // 0a7: goto 0ae
      // 0aa: invokestatic s51.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: iload 5
      // 0b0: iload 4
      // 0b2: ifne 0c0
      // 0b5: ifeq 12a
      // 0b8: goto 0bf
      // 0bb: invokestatic s51.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: iload 3
      // 0c0: iload 4
      // 0c2: ifne 0dc
      // 0c5: ifne 12a
      // 0c8: goto 0cf
      // 0cb: invokestatic s51.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 1
      // 0d0: aload 0
      // 0d1: getfield s51.oo5 I
      // 0d4: isub
      // 0d5: goto 0dc
      // 0d8: invokestatic s51.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: istore 6
      // 0de: aload 0
      // 0df: iload 4
      // 0e1: ifne 0fc
      // 0e4: getfield s51.pyi Z
      // 0e7: ifeq 0fb
      // 0ea: goto 0f1
      // 0ed: invokestatic s51.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iinc 6 -4
      // 0f4: goto 0fb
      // 0f7: invokestatic s51.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield s51.ugi Lowt;
      // 0ff: aload 0
      // 100: getfield s51.e5j Ljava/lang/String;
      // 103: aload 0
      // 104: getfield s51.rdj I
      // 107: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 10a: aload 0
      // 10b: invokevirtual s51.fh0 ()I
      // 10e: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 111: astore 7
      // 113: aload 0
      // 114: aload 0
      // 115: getfield s51.ugi Lowt;
      // 118: aload 7
      // 11a: iload 6
      // 11c: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 11f: invokevirtual java/lang/String.length ()I
      // 122: aload 0
      // 123: getfield s51.rdj I
      // 126: iadd
      // 127: invokevirtual s51.b1m (I)V
      // 12a: return
   }

   public void irg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic s51.a J
      // 003: ldc2_w 117736989710362
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokevirtual s51.x11 ()Z
      // 010: iload 3
      // 011: ifne 029
      // 014: ifeq 3f4
      // 017: goto 01e
      // 01a: invokestatic s51.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: invokevirtual s51.q7y ()Z
      // 022: goto 029
      // 025: invokestatic s51.a (Loov;)Loov;
      // 028: athrow
      // 029: iload 3
      // 02a: ifne 0a1
      // 02d: ifeq 09e
      // 030: goto 037
      // 033: invokestatic s51.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: getfield s51.oo5 I
      // 03b: bipush 1
      // 03c: isub
      // 03d: i2f
      // 03e: aload 0
      // 03f: getfield s51.qwr I
      // 042: bipush 1
      // 043: isub
      // 044: i2f
      // 045: aload 0
      // 046: getfield s51.wj2 I
      // 049: i2f
      // 04a: aload 0
      // 04b: getfield s51.xh3 I
      // 04e: i2f
      // 04f: ldc 3.0
      // 051: nop
      // 052: bipush -1
      // 053: ldc 1.5
      // 055: nop
      // 056: aload 0
      // 057: getfield s51._8c Z
      // 05a: iload 3
      // 05b: ifne 080
      // 05e: goto 065
      // 061: invokestatic s51.a (Loov;)Loov;
      // 064: athrow
      // 065: ifeq 079
      // 068: goto 06f
      // 06b: invokestatic s51.a (Loov;)Loov;
      // 06e: athrow
      // 06f: ldc -8553091
      // 071: nop
      // 072: goto 09b
      // 075: invokestatic s51.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: invokevirtual s51.k9b ()Ljava/lang/String;
      // 07d: invokevirtual java/lang/String.isEmpty ()Z
      // 080: iload 3
      // 081: ifne 09a
      // 084: ifeq 098
      // 087: goto 08e
      // 08a: invokestatic s51.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ldc -2368549
      // 090: nop
      // 091: goto 09b
      // 094: invokestatic s51.a (Loov;)Loov;
      // 097: athrow
      // 098: ldc -8553091
      // 09a: nop
      // 09b: invokestatic mkt.o8m (FFFFFIFI)V
      // 09e: ldc -16777216
      // 0a0: nop
      // 0a1: istore 4
      // 0a3: aload 0
      // 0a4: getfield s51.az4 I
      // 0a7: aload 0
      // 0a8: getfield s51.rdj I
      // 0ab: isub
      // 0ac: istore 5
      // 0ae: aload 0
      // 0af: getfield s51.m16 I
      // 0b2: aload 0
      // 0b3: getfield s51.rdj I
      // 0b6: isub
      // 0b7: istore 6
      // 0b9: aload 0
      // 0ba: getfield s51.ugi Lowt;
      // 0bd: aload 0
      // 0be: getfield s51.e5j Ljava/lang/String;
      // 0c1: aload 0
      // 0c2: getfield s51.rdj I
      // 0c5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0c8: aload 0
      // 0c9: invokevirtual s51.fh0 ()I
      // 0cc: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 0cf: astore 7
      // 0d1: iload 5
      // 0d3: iload 3
      // 0d4: ifne 0e3
      // 0d7: iflt 101
      // 0da: goto 0e1
      // 0dd: invokestatic s51.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iload 5
      // 0e3: iload 3
      // 0e4: ifne 0fe
      // 0e7: aload 7
      // 0e9: invokevirtual java/lang/String.length ()I
      // 0ec: if_icmpgt 101
      // 0ef: goto 0f6
      // 0f2: invokestatic s51.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: bipush 1
      // 0f7: goto 0fe
      // 0fa: invokestatic s51.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: goto 102
      // 101: bipush 0
      // 102: istore 8
      // 104: aload 0
      // 105: getfield s51._8c Z
      // 108: iload 3
      // 109: ifne 126
      // 10c: ifeq 148
      // 10f: goto 116
      // 112: invokestatic s51.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: getfield s51.vmb I
      // 11a: bipush 6
      // 11c: idiv
      // 11d: bipush 2
      // 11e: irem
      // 11f: goto 126
      // 122: invokestatic s51.a (Loov;)Loov;
      // 125: athrow
      // 126: iload 3
      // 127: ifne 136
      // 12a: ifne 148
      // 12d: goto 134
      // 130: invokestatic s51.a (Loov;)Loov;
      // 133: athrow
      // 134: iload 8
      // 136: iload 3
      // 137: ifne 145
      // 13a: ifeq 148
      // 13d: goto 144
      // 140: invokestatic s51.a (Loov;)Loov;
      // 143: athrow
      // 144: bipush 1
      // 145: goto 149
      // 148: bipush 0
      // 149: istore 9
      // 14b: aload 0
      // 14c: iload 3
      // 14d: ifne 16c
      // 150: getfield s51.pyi Z
      // 153: ifeq 16b
      // 156: goto 15d
      // 159: invokestatic s51.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield s51.oo5 I
      // 161: bipush 6
      // 163: iadd
      // 164: goto 16f
      // 167: invokestatic s51.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield s51.oo5 I
      // 16f: istore 10
      // 171: aload 0
      // 172: iload 3
      // 173: ifne 199
      // 176: getfield s51.pyi Z
      // 179: ifeq 198
      // 17c: goto 183
      // 17f: invokestatic s51.a (Loov;)Loov;
      // 182: athrow
      // 183: aload 0
      // 184: getfield s51.qwr I
      // 187: aload 0
      // 188: getfield s51.xh3 I
      // 18b: bipush 8
      // 18d: isub
      // 18e: bipush 2
      // 18f: idiv
      // 190: iadd
      // 191: goto 19c
      // 194: invokestatic s51.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: getfield s51.qwr I
      // 19c: istore 11
      // 19e: iload 10
      // 1a0: istore 12
      // 1a2: iload 6
      // 1a4: iload 3
      // 1a5: ifne 1c3
      // 1a8: aload 7
      // 1aa: invokevirtual java/lang/String.length ()I
      // 1ad: if_icmple 1be
      // 1b0: goto 1b7
      // 1b3: invokestatic s51.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 7
      // 1b9: invokevirtual java/lang/String.length ()I
      // 1bc: istore 6
      // 1be: aload 7
      // 1c0: invokevirtual java/lang/String.length ()I
      // 1c3: iload 3
      // 1c4: ifne 21b
      // 1c7: ifle 217
      // 1ca: goto 1d1
      // 1cd: invokestatic s51.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: iload 8
      // 1d3: ifeq 1ec
      // 1d6: goto 1dd
      // 1d9: invokestatic s51.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 7
      // 1df: bipush 0
      // 1e0: iload 5
      // 1e2: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1e5: goto 1ee
      // 1e8: invokestatic s51.a (Loov;)Loov;
      // 1eb: athrow
      // 1ec: aload 7
      // 1ee: astore 13
      // 1f0: aload 0
      // 1f1: getfield s51.ugi Lowt;
      // 1f4: aload 13
      // 1f6: sipush 9497
      // 1f9: ldc2_w 6150944096707657483
      // 1fc: lload 1
      // 1fd: lxor
      // 1fe: invokedynamic i (IJ)Ljava/lang/String; bsm=s51.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: nop
      // 204: ldc "*"
      // 206: nop
      // 207: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 20a: iload 10
      // 20c: i2f
      // 20d: iload 11
      // 20f: i2f
      // 210: iload 4
      // 212: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 215: istore 12
      // 217: aload 0
      // 218: getfield s51.az4 I
      // 21b: iload 3
      // 21c: ifne 258
      // 21f: aload 0
      // 220: getfield s51.e5j Ljava/lang/String;
      // 223: invokevirtual java/lang/String.length ()I
      // 226: if_icmplt 250
      // 229: goto 230
      // 22c: invokestatic s51.a (Loov;)Loov;
      // 22f: athrow
      // 230: aload 0
      // 231: getfield s51.e5j Ljava/lang/String;
      // 234: invokevirtual java/lang/String.length ()I
      // 237: iload 3
      // 238: ifne 258
      // 23b: goto 242
      // 23e: invokestatic s51.a (Loov;)Loov;
      // 241: athrow
      // 242: aload 0
      // 243: invokevirtual s51.i0q ()I
      // 246: if_icmplt 25b
      // 249: goto 250
      // 24c: invokestatic s51.a (Loov;)Loov;
      // 24f: athrow
      // 250: bipush 1
      // 251: goto 258
      // 254: invokestatic s51.a (Loov;)Loov;
      // 257: athrow
      // 258: goto 25c
      // 25b: bipush 0
      // 25c: istore 13
      // 25e: iload 12
      // 260: istore 14
      // 262: iload 8
      // 264: iload 3
      // 265: ifne 2ab
      // 268: ifne 2a2
      // 26b: goto 272
      // 26e: invokestatic s51.a (Loov;)Loov;
      // 271: athrow
      // 272: iload 5
      // 274: iload 3
      // 275: ifne 297
      // 278: goto 27f
      // 27b: invokestatic s51.a (Loov;)Loov;
      // 27e: athrow
      // 27f: ifle 29a
      // 282: goto 289
      // 285: invokestatic s51.a (Loov;)Loov;
      // 288: athrow
      // 289: iload 10
      // 28b: aload 0
      // 28c: getfield s51.wj2 I
      // 28f: iadd
      // 290: goto 297
      // 293: invokestatic s51.a (Loov;)Loov;
      // 296: athrow
      // 297: goto 29c
      // 29a: iload 10
      // 29c: istore 14
      // 29e: iload 3
      // 29f: ifeq 2c2
      // 2a2: iload 13
      // 2a4: goto 2ab
      // 2a7: invokestatic s51.a (Loov;)Loov;
      // 2aa: athrow
      // 2ab: iload 3
      // 2ac: ifne 2c7
      // 2af: ifeq 2c2
      // 2b2: goto 2b9
      // 2b5: invokestatic s51.a (Loov;)Loov;
      // 2b8: athrow
      // 2b9: iload 12
      // 2bb: bipush 1
      // 2bc: isub
      // 2bd: istore 14
      // 2bf: iinc 12 -1
      // 2c2: aload 7
      // 2c4: invokevirtual java/lang/String.length ()I
      // 2c7: iload 3
      // 2c8: ifne 338
      // 2cb: ifle 336
      // 2ce: goto 2d5
      // 2d1: invokestatic s51.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: iload 8
      // 2d7: iload 3
      // 2d8: ifne 338
      // 2db: goto 2e2
      // 2de: invokestatic s51.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: ifeq 336
      // 2e5: goto 2ec
      // 2e8: invokestatic s51.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: iload 5
      // 2ee: iload 3
      // 2ef: ifne 338
      // 2f2: goto 2f9
      // 2f5: invokestatic s51.a (Loov;)Loov;
      // 2f8: athrow
      // 2f9: aload 7
      // 2fb: invokevirtual java/lang/String.length ()I
      // 2fe: if_icmpge 336
      // 301: goto 308
      // 304: invokestatic s51.a (Loov;)Loov;
      // 307: athrow
      // 308: aload 0
      // 309: getfield s51.ugi Lowt;
      // 30c: aload 7
      // 30e: iload 5
      // 310: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 313: sipush 5169
      // 316: ldc2_w 4286324528399879714
      // 319: lload 1
      // 31a: lxor
      // 31b: invokedynamic i (IJ)Ljava/lang/String; bsm=s51.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: nop
      // 321: ldc "*"
      // 323: nop
      // 324: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 327: iload 12
      // 329: i2f
      // 32a: fconst_1
      // 32b: fadd
      // 32c: iload 11
      // 32e: i2f
      // 32f: iload 4
      // 331: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 334: istore 12
      // 336: iload 9
      // 338: iload 3
      // 339: ifne 3af
      // 33c: ifeq 3ad
      // 33f: goto 346
      // 342: invokestatic s51.a (Loov;)Loov;
      // 345: athrow
      // 346: iload 13
      // 348: iload 3
      // 349: ifne 391
      // 34c: goto 353
      // 34f: invokestatic s51.a (Loov;)Loov;
      // 352: athrow
      // 353: ifeq 388
      // 356: goto 35d
      // 359: invokestatic s51.a (Loov;)Loov;
      // 35c: athrow
      // 35d: iload 14
      // 35f: i2f
      // 360: iload 11
      // 362: bipush 1
      // 363: isub
      // 364: i2f
      // 365: iload 14
      // 367: bipush 1
      // 368: iadd
      // 369: i2f
      // 36a: iload 11
      // 36c: bipush 1
      // 36d: iadd
      // 36e: aload 0
      // 36f: getfield s51.ugi Lowt;
      // 372: getfield owt.rr7 I
      // 375: iadd
      // 376: i2f
      // 377: ldc -3092272
      // 379: nop
      // 37a: invokestatic b0t.df9 (FFFFI)V
      // 37d: iload 3
      // 37e: ifeq 3ad
      // 381: goto 388
      // 384: invokestatic s51.a (Loov;)Loov;
      // 387: athrow
      // 388: iload 14
      // 38a: goto 391
      // 38d: invokestatic s51.a (Loov;)Loov;
      // 390: athrow
      // 391: i2f
      // 392: iload 11
      // 394: bipush 1
      // 395: isub
      // 396: i2f
      // 397: iload 14
      // 399: bipush 1
      // 39a: iadd
      // 39b: i2f
      // 39c: iload 11
      // 39e: aload 0
      // 39f: getfield s51.ugi Lowt;
      // 3a2: getfield owt.rr7 I
      // 3a5: iadd
      // 3a6: i2f
      // 3a7: ldc -3092272
      // 3a9: nop
      // 3aa: invokestatic b0t.df9 (FFFFI)V
      // 3ad: iload 6
      // 3af: iload 5
      // 3b1: iload 3
      // 3b2: ifne 3d7
      // 3b5: if_icmpeq 3f4
      // 3b8: goto 3bf
      // 3bb: invokestatic s51.a (Loov;)Loov;
      // 3be: athrow
      // 3bf: iload 10
      // 3c1: aload 0
      // 3c2: getfield s51.ugi Lowt;
      // 3c5: aload 7
      // 3c7: bipush 0
      // 3c8: iload 6
      // 3ca: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3cd: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 3d0: goto 3d7
      // 3d3: invokestatic s51.a (Loov;)Loov;
      // 3d6: athrow
      // 3d7: iadd
      // 3d8: istore 15
      // 3da: aload 0
      // 3db: iload 14
      // 3dd: iload 11
      // 3df: bipush 1
      // 3e0: isub
      // 3e1: iload 15
      // 3e3: bipush 1
      // 3e4: isub
      // 3e5: iload 11
      // 3e7: bipush 1
      // 3e8: iadd
      // 3e9: aload 0
      // 3ea: getfield s51.ugi Lowt;
      // 3ed: getfield owt.rr7 I
      // 3f0: iadd
      // 3f1: invokespecial s51.l1x (IIII)V
      // 3f4: return
   }

   private void l1x(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: iload 1
      // 06: iload 3
      // 07: iload 5
      // 09: ifeq 21
      // 0c: if_icmpge 1e
      // 0f: goto 16
      // 12: invokestatic s51.a (Loov;)Loov;
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
      // 2c: invokestatic s51.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 2
      // 31: istore 6
      // 33: iload 4
      // 35: istore 2
      // 36: iload 6
      // 38: istore 4
      // 3a: iload 3
      // 3b: aload 0
      // 3c: getfield s51.oo5 I
      // 3f: aload 0
      // 40: getfield s51.wj2 I
      // 43: iadd
      // 44: iload 5
      // 46: ifeq 67
      // 49: if_icmple 5d
      // 4c: goto 53
      // 4f: invokestatic s51.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield s51.oo5 I
      // 57: aload 0
      // 58: getfield s51.wj2 I
      // 5b: iadd
      // 5c: istore 3
      // 5d: iload 1
      // 5e: aload 0
      // 5f: getfield s51.oo5 I
      // 62: aload 0
      // 63: getfield s51.wj2 I
      // 66: iadd
      // 67: iload 5
      // 69: ifeq 85
      // 6c: if_icmple 87
      // 6f: goto 76
      // 72: invokestatic s51.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: getfield s51.oo5 I
      // 7a: aload 0
      // 7b: getfield s51.wj2 I
      // 7e: goto 85
      // 81: invokestatic s51.a (Loov;)Loov;
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

   public void sst(int param1) {
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
      // 06: putfield s51.die I
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 27
      // 0e: getfield s51.e5j Ljava/lang/String;
      // 11: invokevirtual java/lang/String.length ()I
      // 14: iload 1
      // 15: if_icmple 33
      // 18: goto 1f
      // 1b: invokestatic s51.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic s51.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield s51.e5j Ljava/lang/String;
      // 2b: bipush 0
      // 2c: iload 1
      // 2d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 30: putfield s51.e5j Ljava/lang/String;
      // 33: return
   }

   public int i0q() {
      return this.die;
   }

   public int hnu() {
      return this.az4;
   }

   public boolean q7y() {
      return this.pyi;
   }

   public void arw(boolean var1) {
      this.pyi = var1;
   }

   public void psm(int var1) {
      this.pjv = var1;
   }

   public void tt6(int var1) {
      this.j55 = var1;
   }

   public void _di(boolean param1) {
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
      // 0f: invokestatic s51.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 39
      // 18: goto 1f
      // 1b: invokestatic s51.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getfield s51._8c Z
      // 22: goto 29
      // 25: invokestatic s51.a (Loov;)Loov;
      // 28: athrow
      // 29: ifne 38
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: putfield s51.vmb I
      // 31: goto 38
      // 34: invokestatic s51.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: iload 1
      // 3a: putfield s51._8c Z
      // 3d: return
   }

   public boolean a9i() {
      return this._8c;
   }

   public void u9a(boolean var1) {
      this.wsv = var1;
   }

   public int m8g() {
      return this.m16;
   }

   public int fh0() {
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
      // 09: invokevirtual s51.q7y ()Z
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic s51.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield s51.wj2 I
      // 1a: bipush 8
      // 1c: isub
      // 1d: goto 28
      // 20: invokestatic s51.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield s51.wj2 I
      // 28: ireturn
   }

   public void v5m(int param1) {
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
      // 005: getfield s51.e5j Ljava/lang/String;
      // 008: invokevirtual java/lang/String.length ()I
      // 00b: istore 3
      // 00c: iload 1
      // 00d: iload 2
      // 00e: ifeq 01f
      // 011: iload 3
      // 012: if_icmple 01e
      // 015: goto 01c
      // 018: invokestatic s51.a (Loov;)Loov;
      // 01b: athrow
      // 01c: iload 3
      // 01d: istore 1
      // 01e: iload 1
      // 01f: iload 2
      // 020: ifeq 02e
      // 023: ifge 02f
      // 026: goto 02d
      // 029: invokestatic s51.a (Loov;)Loov;
      // 02c: athrow
      // 02d: bipush 0
      // 02e: istore 1
      // 02f: aload 0
      // 030: iload 1
      // 031: putfield s51.m16 I
      // 034: aload 0
      // 035: iload 2
      // 036: ifeq 04e
      // 039: getfield s51.ugi Lowt;
      // 03c: ifnull 123
      // 03f: goto 046
      // 042: invokestatic s51.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: goto 04e
      // 04a: invokestatic s51.a (Loov;)Loov;
      // 04d: athrow
      // 04e: getfield s51.rdj I
      // 051: iload 2
      // 052: ifeq 070
      // 055: iload 3
      // 056: if_icmple 06c
      // 059: goto 060
      // 05c: invokestatic s51.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: iload 3
      // 062: putfield s51.rdj I
      // 065: goto 06c
      // 068: invokestatic s51.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: invokevirtual s51.fh0 ()I
      // 070: istore 4
      // 072: aload 0
      // 073: getfield s51.ugi Lowt;
      // 076: aload 0
      // 077: getfield s51.e5j Ljava/lang/String;
      // 07a: aload 0
      // 07b: getfield s51.rdj I
      // 07e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 081: iload 4
      // 083: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 086: astore 5
      // 088: aload 5
      // 08a: invokevirtual java/lang/String.length ()I
      // 08d: aload 0
      // 08e: getfield s51.rdj I
      // 091: iadd
      // 092: istore 6
      // 094: iload 1
      // 095: aload 0
      // 096: getfield s51.rdj I
      // 099: iload 2
      // 09a: ifeq 0cb
      // 09d: if_icmpne 0c8
      // 0a0: goto 0a7
      // 0a3: invokestatic s51.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: dup
      // 0a9: getfield s51.rdj I
      // 0ac: aload 0
      // 0ad: getfield s51.ugi Lowt;
      // 0b0: aload 0
      // 0b1: getfield s51.e5j Ljava/lang/String;
      // 0b4: iload 4
      // 0b6: bipush 1
      // 0b7: invokevirtual owt.m8q (Ljava/lang/String;IZ)Ljava/lang/String;
      // 0ba: invokevirtual java/lang/String.length ()I
      // 0bd: isub
      // 0be: putfield s51.rdj I
      // 0c1: goto 0c8
      // 0c4: invokestatic s51.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 1
      // 0c9: iload 6
      // 0cb: iload 2
      // 0cc: ifeq 0fd
      // 0cf: if_icmple 0f1
      // 0d2: goto 0d9
      // 0d5: invokestatic s51.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield s51.rdj I
      // 0de: iload 1
      // 0df: iload 6
      // 0e1: isub
      // 0e2: iadd
      // 0e3: putfield s51.rdj I
      // 0e6: iload 2
      // 0e7: ifne 116
      // 0ea: goto 0f1
      // 0ed: invokestatic s51.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 1
      // 0f2: aload 0
      // 0f3: getfield s51.rdj I
      // 0f6: goto 0fd
      // 0f9: invokestatic s51.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: if_icmpgt 116
      // 100: aload 0
      // 101: dup
      // 102: getfield s51.rdj I
      // 105: aload 0
      // 106: getfield s51.rdj I
      // 109: iload 1
      // 10a: isub
      // 10b: isub
      // 10c: putfield s51.rdj I
      // 10f: goto 116
      // 112: invokestatic s51.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: aload 0
      // 118: getfield s51.rdj I
      // 11b: bipush 0
      // 11c: iload 3
      // 11d: invokestatic fe6.faa (III)I
      // 120: putfield s51.rdj I
      // 123: return
   }

   public void _ar(boolean var1) {
      this.x7b = var1;
   }

   public boolean x11() {
      return this.vf4;
   }

   public void j8x(boolean var1) {
      this.vf4 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8941178572101552358L, -5816296046223378463L, MethodHandles.lookup().lookupClass()).a(138193840308783L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 132577935515439L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u0000\u009fø!Â\u0017Nz·\n\u0096÷>%\u0094O\u0010sÕIøÓ\u0085µcÇêFÐêÔ×®";
      int var8 = "\u0000\u009fø!Â\u0017Nz·\n\u0096÷>%\u0094O\u0010sÕIøÓ\u0085µcÇêFÐêÔ×®".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23788;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("s51", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("s51" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
