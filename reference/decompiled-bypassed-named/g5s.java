import java.io.Serializable;
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

public abstract class g5s implements Serializable, Cloneable {
   public static final long serialVersionUID = 5542096614926168415L;
   public double v54;
   public double g0w;
   public double mu9;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public g5s(double var1, double var3, double var5) {
      this.v54 = var1;
      this.g0w = var3;
      this.mu9 = var5;
   }

   public g5s(double[] var1) {
      this.v54 = var1[0];
      this.g0w = var1[1];
      this.mu9 = var1[2];
   }

   public g5s(g5s var1) {
      this.v54 = var1.v54;
      this.g0w = var1.g0w;
      this.mu9 = var1.mu9;
   }

   public g5s(ry6 var1) {
      this.v54 = (double)var1.yiu;
      this.g0w = (double)var1.q6o;
      this.mu9 = (double)var1.n_d;
   }

   public g5s() {
      this.v54 = 0.0;
      this.g0w = 0.0;
      this.mu9 = 0.0;
   }

   public final void ww3(double var1, double var3, double var5) {
      this.v54 = var1;
      this.g0w = var3;
      this.mu9 = var5;
   }

   public final void yo6(double[] var1) {
      this.v54 = var1[0];
      this.g0w = var1[1];
      this.mu9 = var1[2];
   }

   public final void ajh(g5s var1) {
      this.v54 = var1.v54;
      this.g0w = var1.g0w;
      this.mu9 = var1.mu9;
   }

   public final void bsj(ry6 var1) {
      this.v54 = (double)var1.yiu;
      this.g0w = (double)var1.q6o;
      this.mu9 = (double)var1.n_d;
   }

   public final void wdc(double[] var1) {
      var1[0] = this.v54;
      var1[1] = this.g0w;
      var1[2] = this.mu9;
   }

   public final void t4x(g5s var1) {
      var1.v54 = this.v54;
      var1.g0w = this.g0w;
      var1.mu9 = this.mu9;
   }

   public final void j6j(g5s var1, g5s var2) {
      this.v54 = var1.v54 + var2.v54;
      this.g0w = var1.g0w + var2.g0w;
      this.mu9 = var1.mu9 + var2.mu9;
   }

   public final void nmh(g5s var1) {
      this.v54 = this.v54 + var1.v54;
      this.g0w = this.g0w + var1.g0w;
      this.mu9 = this.mu9 + var1.mu9;
   }

   public final void tka(g5s var1, g5s var2) {
      this.v54 = var1.v54 - var2.v54;
      this.g0w = var1.g0w - var2.g0w;
      this.mu9 = var1.mu9 - var2.mu9;
   }

   public final void t77(g5s var1) {
      this.v54 = this.v54 - var1.v54;
      this.g0w = this.g0w - var1.g0w;
      this.mu9 = this.mu9 - var1.mu9;
   }

   public final void aba(g5s var1) {
      this.v54 = -var1.v54;
      this.g0w = -var1.g0w;
      this.mu9 = -var1.mu9;
   }

   public final void c90() {
      this.v54 = -this.v54;
      this.g0w = -this.g0w;
      this.mu9 = -this.mu9;
   }

   public final void wve(double var1, g5s var3) {
      this.v54 = var1 * var3.v54;
      this.g0w = var1 * var3.g0w;
      this.mu9 = var1 * var3.mu9;
   }

   public final void t_x(double var1) {
      this.v54 *= var1;
      this.g0w *= var1;
      this.mu9 *= var1;
   }

   public final void f72(double var1, g5s var3, g5s var4) {
      this.v54 = var1 * var3.v54 + var4.v54;
      this.g0w = var1 * var3.g0w + var4.g0w;
      this.mu9 = var1 * var3.mu9 + var4.mu9;
   }

   public final void e8v(double var1, ry6 var3) {
      this.u6o(var1, new fna(var3));
   }

   public final void u6o(double var1, g5s var3) {
      this.v54 = var1 * this.v54 + var3.v54;
      this.g0w = var1 * this.g0w + var3.g0w;
      this.mu9 = var1 * this.mu9 + var3.mu9;
   }

   @Override
   public String toString() {
      long var1 = a ^ 35622442054905L;
      return "(" + this.v54 + a<"j">(13429, 65985237170693785L ^ var1) + this.g0w + a<"j">(29873, 2566120837040924252L ^ var1) + this.mu9 + ")";
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.mql(var1, this.v54);
      var1 = get.mql(var1, this.g0w);
      var1 = get.mql(var1, this.mu9);
      return get.p05(var1);
   }

   public boolean bm4(g5s param1) {
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
      // 05: getfield g5s.v54 D
      // 08: aload 1
      // 09: getfield g5s.v54 D
      // 0c: dcmpl
      // 0d: iload 2
      // 0e: ifeq 2b
      // 11: ifne 5b
      // 14: goto 1b
      // 17: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield g5s.g0w D
      // 1f: aload 1
      // 20: getfield g5s.g0w D
      // 23: dcmpl
      // 24: goto 2b
      // 27: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifeq 49
      // 2f: ifne 5b
      // 32: goto 39
      // 35: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield g5s.mu9 D
      // 3d: aload 1
      // 3e: getfield g5s.mu9 D
      // 41: dcmpl
      // 42: goto 49
      // 45: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: iload 2
      // 4a: ifeq 58
      // 4d: ifne 5b
      // 50: goto 57
      // 53: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 56: athrow
      // 57: bipush 1
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
      // 5d: astore 3
      // 5e: bipush 0
      // 5f: ireturn
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: checkcast g5s
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield g5s.v54 D
      // 0d: aload 3
      // 0e: getfield g5s.v54 D
      // 11: dcmpl
      // 12: iload 2
      // 13: ifne 30
      // 16: ifne 60
      // 19: goto 20
      // 1c: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield g5s.g0w D
      // 24: aload 3
      // 25: getfield g5s.g0w D
      // 28: dcmpl
      // 29: goto 30
      // 2c: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 4e
      // 34: ifne 60
      // 37: goto 3e
      // 3a: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield g5s.mu9 D
      // 42: aload 3
      // 43: getfield g5s.mu9 D
      // 46: dcmpl
      // 47: goto 4e
      // 4a: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifne 5d
      // 52: ifne 60
      // 55: goto 5c
      // 58: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: goto 61
      // 60: bipush 0
      // 61: ireturn
      // 62: astore 3
      // 63: bipush 0
      // 64: ireturn
      // 65: astore 3
      // 66: bipush 0
      // 67: ireturn
   }

   public boolean _l5(g5s param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield g5s.v54 D
      // 009: aload 1
      // 00a: getfield g5s.v54 D
      // 00d: dsub
      // 00e: dstore 5
      // 010: dload 5
      // 012: invokestatic java/lang/Double.isNaN (D)Z
      // 015: iload 4
      // 017: ifne 03a
      // 01a: ifeq 02a
      // 01d: goto 024
      // 020: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 029: athrow
      // 02a: dload 5
      // 02c: iload 4
      // 02e: ifne 047
      // 031: dconst_0
      // 032: dcmpg
      // 033: goto 03a
      // 036: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 039: athrow
      // 03a: ifge 04a
      // 03d: dload 5
      // 03f: dneg
      // 040: goto 047
      // 043: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 046: athrow
      // 047: goto 04c
      // 04a: dload 5
      // 04c: dload 2
      // 04d: dcmpl
      // 04e: iload 4
      // 050: ifne 073
      // 053: ifle 063
      // 056: goto 05d
      // 059: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: bipush 0
      // 05e: ireturn
      // 05f: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 062: athrow
      // 063: aload 0
      // 064: getfield g5s.g0w D
      // 067: aload 1
      // 068: getfield g5s.g0w D
      // 06b: dsub
      // 06c: dstore 5
      // 06e: dload 5
      // 070: invokestatic java/lang/Double.isNaN (D)Z
      // 073: iload 4
      // 075: ifne 098
      // 078: ifeq 088
      // 07b: goto 082
      // 07e: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 081: athrow
      // 082: bipush 0
      // 083: ireturn
      // 084: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 087: athrow
      // 088: dload 5
      // 08a: iload 4
      // 08c: ifne 0a5
      // 08f: dconst_0
      // 090: dcmpg
      // 091: goto 098
      // 094: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: ifge 0a8
      // 09b: dload 5
      // 09d: dneg
      // 09e: goto 0a5
      // 0a1: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: goto 0aa
      // 0a8: dload 5
      // 0aa: dload 2
      // 0ab: dcmpl
      // 0ac: iload 4
      // 0ae: ifne 0d1
      // 0b1: ifle 0c1
      // 0b4: goto 0bb
      // 0b7: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ba: athrow
      // 0bb: bipush 0
      // 0bc: ireturn
      // 0bd: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield g5s.mu9 D
      // 0c5: aload 1
      // 0c6: getfield g5s.mu9 D
      // 0c9: dsub
      // 0ca: dstore 5
      // 0cc: dload 5
      // 0ce: invokestatic java/lang/Double.isNaN (D)Z
      // 0d1: iload 4
      // 0d3: ifne 0f6
      // 0d6: ifeq 0e6
      // 0d9: goto 0e0
      // 0dc: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0df: athrow
      // 0e0: bipush 0
      // 0e1: ireturn
      // 0e2: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e5: athrow
      // 0e6: dload 5
      // 0e8: iload 4
      // 0ea: ifne 103
      // 0ed: dconst_0
      // 0ee: dcmpg
      // 0ef: goto 0f6
      // 0f2: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f5: athrow
      // 0f6: ifge 106
      // 0f9: dload 5
      // 0fb: dneg
      // 0fc: goto 103
      // 0ff: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 102: athrow
      // 103: goto 108
      // 106: dload 5
      // 108: dload 2
      // 109: dcmpl
      // 10a: iload 4
      // 10c: ifne 120
      // 10f: ifle 11f
      // 112: goto 119
      // 115: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 118: athrow
      // 119: bipush 0
      // 11a: ireturn
      // 11b: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11e: athrow
      // 11f: bipush 1
      // 120: ireturn
   }

   public final void an7(float var1, float var2, g5s var3) {
      this.mbo((double)var1, (double)var2, var3);
   }

   public final void mbo(double param1, double param3, g5s param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 6
      // 005: aload 5
      // 007: getfield g5s.v54 D
      // 00a: dload 3
      // 00b: dcmpl
      // 00c: iload 6
      // 00e: ifne 046
      // 011: ifle 02c
      // 014: goto 01b
      // 017: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: dload 3
      // 01d: putfield g5s.v54 D
      // 020: iload 6
      // 022: ifeq 06a
      // 025: goto 02c
      // 028: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02b: athrow
      // 02c: aload 5
      // 02e: iload 6
      // 030: ifne 062
      // 033: goto 03a
      // 036: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 039: athrow
      // 03a: getfield g5s.v54 D
      // 03d: dload 1
      // 03e: dcmpg
      // 03f: goto 046
      // 042: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 045: athrow
      // 046: ifge 05a
      // 049: aload 0
      // 04a: dload 1
      // 04b: putfield g5s.v54 D
      // 04e: iload 6
      // 050: ifeq 06a
      // 053: goto 05a
      // 056: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 059: athrow
      // 05a: aload 0
      // 05b: goto 062
      // 05e: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 061: athrow
      // 062: aload 5
      // 064: getfield g5s.v54 D
      // 067: putfield g5s.v54 D
      // 06a: aload 5
      // 06c: getfield g5s.g0w D
      // 06f: dload 3
      // 070: dcmpl
      // 071: iload 6
      // 073: ifne 0ab
      // 076: ifle 091
      // 079: goto 080
      // 07c: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07f: athrow
      // 080: aload 0
      // 081: dload 3
      // 082: putfield g5s.g0w D
      // 085: iload 6
      // 087: ifeq 0cf
      // 08a: goto 091
      // 08d: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 090: athrow
      // 091: aload 5
      // 093: iload 6
      // 095: ifne 0c7
      // 098: goto 09f
      // 09b: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09e: athrow
      // 09f: getfield g5s.g0w D
      // 0a2: dload 1
      // 0a3: dcmpg
      // 0a4: goto 0ab
      // 0a7: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0aa: athrow
      // 0ab: ifge 0bf
      // 0ae: aload 0
      // 0af: dload 1
      // 0b0: putfield g5s.g0w D
      // 0b3: iload 6
      // 0b5: ifeq 0cf
      // 0b8: goto 0bf
      // 0bb: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: goto 0c7
      // 0c3: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c6: athrow
      // 0c7: aload 5
      // 0c9: getfield g5s.g0w D
      // 0cc: putfield g5s.g0w D
      // 0cf: aload 5
      // 0d1: getfield g5s.mu9 D
      // 0d4: dload 3
      // 0d5: dcmpl
      // 0d6: iload 6
      // 0d8: ifne 110
      // 0db: ifle 0f6
      // 0de: goto 0e5
      // 0e1: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: dload 3
      // 0e7: putfield g5s.mu9 D
      // 0ea: iload 6
      // 0ec: ifeq 134
      // 0ef: goto 0f6
      // 0f2: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f5: athrow
      // 0f6: aload 5
      // 0f8: iload 6
      // 0fa: ifne 12c
      // 0fd: goto 104
      // 100: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 103: athrow
      // 104: getfield g5s.mu9 D
      // 107: dload 1
      // 108: dcmpg
      // 109: goto 110
      // 10c: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10f: athrow
      // 110: ifge 124
      // 113: aload 0
      // 114: dload 1
      // 115: putfield g5s.mu9 D
      // 118: iload 6
      // 11a: ifeq 134
      // 11d: goto 124
      // 120: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 123: athrow
      // 124: aload 0
      // 125: goto 12c
      // 128: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12b: athrow
      // 12c: aload 5
      // 12e: getfield g5s.mu9 D
      // 131: putfield g5s.mu9 D
      // 134: return
   }

   public final void tf8(float var1, g5s var2) {
      this.n_u((double)var1, var2);
   }

   public final void n_u(double param1, g5s param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifeq 33
      // 0b: getfield g5s.v54 D
      // 0e: dload 1
      // 0f: dcmpg
      // 10: ifge 2b
      // 13: goto 1a
      // 16: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 1
      // 1c: putfield g5s.v54 D
      // 1f: iload 4
      // 21: ifne 3a
      // 24: goto 2b
      // 27: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 3
      // 34: getfield g5s.v54 D
      // 37: putfield g5s.v54 D
      // 3a: aload 3
      // 3b: iload 4
      // 3d: ifeq 68
      // 40: getfield g5s.g0w D
      // 43: dload 1
      // 44: dcmpg
      // 45: ifge 60
      // 48: goto 4f
      // 4b: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 1
      // 51: putfield g5s.g0w D
      // 54: iload 4
      // 56: ifne 6f
      // 59: goto 60
      // 5c: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: aload 3
      // 69: getfield g5s.g0w D
      // 6c: putfield g5s.g0w D
      // 6f: aload 3
      // 70: iload 4
      // 72: ifeq 9d
      // 75: getfield g5s.mu9 D
      // 78: dload 1
      // 79: dcmpg
      // 7a: ifge 95
      // 7d: goto 84
      // 80: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: dload 1
      // 86: putfield g5s.mu9 D
      // 89: iload 4
      // 8b: ifne a4
      // 8e: goto 95
      // 91: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: aload 0
      // 96: goto 9d
      // 99: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9c: athrow
      // 9d: aload 3
      // 9e: getfield g5s.mu9 D
      // a1: putfield g5s.mu9 D
      // a4: return
   }

   public final void u3g(float var1, g5s var2) {
      this.pf6((double)var1, var2);
   }

   public final void pf6(double param1, g5s param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifne 33
      // 0b: getfield g5s.v54 D
      // 0e: dload 1
      // 0f: dcmpl
      // 10: ifle 2b
      // 13: goto 1a
      // 16: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 1
      // 1c: putfield g5s.v54 D
      // 1f: iload 4
      // 21: ifeq 3a
      // 24: goto 2b
      // 27: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 3
      // 34: getfield g5s.v54 D
      // 37: putfield g5s.v54 D
      // 3a: aload 3
      // 3b: iload 4
      // 3d: ifne 68
      // 40: getfield g5s.g0w D
      // 43: dload 1
      // 44: dcmpl
      // 45: ifle 60
      // 48: goto 4f
      // 4b: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 1
      // 51: putfield g5s.g0w D
      // 54: iload 4
      // 56: ifeq 6f
      // 59: goto 60
      // 5c: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: aload 3
      // 69: getfield g5s.g0w D
      // 6c: putfield g5s.g0w D
      // 6f: aload 3
      // 70: iload 4
      // 72: ifne 9d
      // 75: getfield g5s.mu9 D
      // 78: dload 1
      // 79: dcmpl
      // 7a: ifle 95
      // 7d: goto 84
      // 80: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: dload 1
      // 86: putfield g5s.mu9 D
      // 89: iload 4
      // 8b: ifeq a4
      // 8e: goto 95
      // 91: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: aload 0
      // 96: goto 9d
      // 99: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9c: athrow
      // 9d: aload 3
      // 9e: getfield g5s.mu9 D
      // a1: putfield g5s.mu9 D
      // a4: return
   }

   public final void wtt(g5s var1) {
      this.v54 = Math.abs(var1.v54);
      this.g0w = Math.abs(var1.g0w);
      this.mu9 = Math.abs(var1.mu9);
   }

   public final void h4l(float var1, float var2) {
      this.tqt((double)var1, (double)var2);
   }

   public final void tqt(double param1, double param3) {
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
      // 06: getfield g5s.v54 D
      // 09: dload 3
      // 0a: dcmpl
      // 0b: iload 5
      // 0d: ifne 38
      // 10: ifle 2b
      // 13: goto 1a
      // 16: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 3
      // 1c: putfield g5s.v54 D
      // 1f: iload 5
      // 21: ifeq 53
      // 24: goto 2b
      // 27: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield g5s.v54 D
      // 2f: dload 1
      // 30: dcmpg
      // 31: goto 38
      // 34: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: iload 5
      // 3a: ifne 59
      // 3d: ifge 53
      // 40: goto 47
      // 43: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 46: athrow
      // 47: aload 0
      // 48: dload 1
      // 49: putfield g5s.v54 D
      // 4c: goto 53
      // 4f: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 52: athrow
      // 53: aload 0
      // 54: getfield g5s.g0w D
      // 57: dload 3
      // 58: dcmpl
      // 59: iload 5
      // 5b: ifne 86
      // 5e: ifle 79
      // 61: goto 68
      // 64: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: aload 0
      // 69: dload 3
      // 6a: putfield g5s.g0w D
      // 6d: iload 5
      // 6f: ifeq a1
      // 72: goto 79
      // 75: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield g5s.g0w D
      // 7d: dload 1
      // 7e: dcmpg
      // 7f: goto 86
      // 82: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 85: athrow
      // 86: iload 5
      // 88: ifne a7
      // 8b: ifge a1
      // 8e: goto 95
      // 91: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: aload 0
      // 96: dload 1
      // 97: putfield g5s.g0w D
      // 9a: goto a1
      // 9d: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a0: athrow
      // a1: aload 0
      // a2: getfield g5s.mu9 D
      // a5: dload 3
      // a6: dcmpl
      // a7: iload 5
      // a9: ifne e0
      // ac: ifle c7
      // af: goto b6
      // b2: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b5: athrow
      // b6: aload 0
      // b7: dload 3
      // b8: putfield g5s.mu9 D
      // bb: iload 5
      // bd: ifeq e8
      // c0: goto c7
      // c3: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c6: athrow
      // c7: aload 0
      // c8: iload 5
      // ca: ifne e4
      // cd: goto d4
      // d0: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d3: athrow
      // d4: getfield g5s.mu9 D
      // d7: dload 1
      // d8: dcmpg
      // d9: goto e0
      // dc: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // df: athrow
      // e0: ifge e8
      // e3: aload 0
      // e4: dload 1
      // e5: putfield g5s.mu9 D
      // e8: return
   }

   public final void kos(float var1) {
      this.s4g((double)var1);
   }

   public final void s4g(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield g5s.v54 D
      // 08: dload 1
      // 09: dcmpg
      // 0a: iload 3
      // 0b: ifne 2a
      // 0e: ifge 24
      // 11: goto 18
      // 14: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: dload 1
      // 1a: putfield g5s.v54 D
      // 1d: goto 24
      // 20: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield g5s.g0w D
      // 28: dload 1
      // 29: dcmpg
      // 2a: iload 3
      // 2b: ifne 55
      // 2e: ifge 44
      // 31: goto 38
      // 34: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: aload 0
      // 39: dload 1
      // 3a: putfield g5s.g0w D
      // 3d: goto 44
      // 40: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: aload 0
      // 45: iload 3
      // 46: ifne 59
      // 49: getfield g5s.mu9 D
      // 4c: dload 1
      // 4d: dcmpg
      // 4e: goto 55
      // 51: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: ifge 5d
      // 58: aload 0
      // 59: dload 1
      // 5a: putfield g5s.mu9 D
      // 5d: return
   }

   public final void k9x(float var1) {
      this.e7k((double)var1);
   }

   public final void e7k(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield g5s.v54 D
      // 08: dload 1
      // 09: dcmpl
      // 0a: iload 3
      // 0b: ifne 2a
      // 0e: ifle 24
      // 11: goto 18
      // 14: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: dload 1
      // 1a: putfield g5s.v54 D
      // 1d: goto 24
      // 20: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield g5s.g0w D
      // 28: dload 1
      // 29: dcmpl
      // 2a: iload 3
      // 2b: ifne 55
      // 2e: ifle 44
      // 31: goto 38
      // 34: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: aload 0
      // 39: dload 1
      // 3a: putfield g5s.g0w D
      // 3d: goto 44
      // 40: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: aload 0
      // 45: iload 3
      // 46: ifne 59
      // 49: getfield g5s.mu9 D
      // 4c: dload 1
      // 4d: dcmpl
      // 4e: goto 55
      // 51: invokestatic g5s.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: ifle 5d
      // 58: aload 0
      // 59: dload 1
      // 5a: putfield g5s.mu9 D
      // 5d: return
   }

   public final void pln() {
      this.v54 = Math.abs(this.v54);
      this.g0w = Math.abs(this.g0w);
      this.mu9 = Math.abs(this.mu9);
   }

   public final void jh2(g5s var1, g5s var2, float var3) {
      this.sem(var1, var2, (double)var3);
   }

   public final void sem(g5s var1, g5s var2, double var3) {
      this.v54 = (1.0 - var3) * var1.v54 + var3 * var2.v54;
      this.g0w = (1.0 - var3) * var1.g0w + var3 * var2.g0w;
      this.mu9 = (1.0 - var3) * var1.mu9 + var3 * var2.mu9;
   }

   public final void fy3(g5s var1, float var2) {
      this.te2(var1, (double)var2);
   }

   public final void te2(g5s var1, double var2) {
      this.v54 = (1.0 - var2) * this.v54 + var2 * var1.v54;
      this.g0w = (1.0 - var2) * this.g0w + var2 * var1.g0w;
      this.mu9 = (1.0 - var2) * this.mu9 + var2 * var1.mu9;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final double _zh() {
      return this.v54;
   }

   public final void l1q(double var1) {
      this.v54 = var1;
   }

   public final double nie() {
      return this.g0w;
   }

   public final void geb(double var1) {
      this.g0w = var1;
   }

   public final double bml() {
      return this.mu9;
   }

   public final void suo(double var1) {
      this.mu9 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1169294132394298060L, -2781584151748074983L, MethodHandles.lookup().lookupClass()).a(82605033419218L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 20351285901874L;
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
      String var6 = "Âlh;óZÆ\u0086\u0012¢·\u009f\u009cÆÖó\u0010\u0085\u0091E¢õ×\u0098Ç\u0080\u0089\u007f´\u000bx\u0012Â";
      int var8 = "Âlh;óZÆ\u0086\u0012¢·\u009f\u009cÆÖó\u0010\u0085\u0091E¢õ×\u0098Ç\u0080\u0089\u007f´\u000bx\u0012Â".length();
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

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27674;
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
            throw new RuntimeException("g5s", var10);
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
         throw new RuntimeException("g5s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
