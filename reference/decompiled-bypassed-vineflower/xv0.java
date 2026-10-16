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

public abstract class xv0 implements Serializable, Cloneable {
   public static final long serialVersionUID = -4748953690425311052L;
   public double yme;
   public double pf8;
   public double jfe;
   public double ggc;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xv0(double var1, double var3, double var5, double var7) {
      this.yme = var1;
      this.pf8 = var3;
      this.jfe = var5;
      this.ggc = var7;
   }

   public xv0(double[] var1) {
      this.yme = var1[0];
      this.pf8 = var1[1];
      this.jfe = var1[2];
      this.ggc = var1[3];
   }

   public xv0(xv0 var1) {
      this.yme = var1.yme;
      this.pf8 = var1.pf8;
      this.jfe = var1.jfe;
      this.ggc = var1.ggc;
   }

   public xv0(rkj var1) {
      this.yme = (double)var1.hp2;
      this.pf8 = (double)var1.nc_;
      this.jfe = (double)var1.ax5;
      this.ggc = (double)var1.ck3;
   }

   public xv0() {
      this.yme = 0.0;
      this.pf8 = 0.0;
      this.jfe = 0.0;
      this.ggc = 0.0;
   }

   public final void tcm(double var1, double var3, double var5, double var7) {
      this.yme = var1;
      this.pf8 = var3;
      this.jfe = var5;
      this.ggc = var7;
   }

   public final void s8f(double[] var1) {
      this.yme = var1[0];
      this.pf8 = var1[1];
      this.jfe = var1[2];
      this.ggc = var1[3];
   }

   public final void hjs(xv0 var1) {
      this.yme = var1.yme;
      this.pf8 = var1.pf8;
      this.jfe = var1.jfe;
      this.ggc = var1.ggc;
   }

   public final void jnf(rkj var1) {
      this.yme = (double)var1.hp2;
      this.pf8 = (double)var1.nc_;
      this.jfe = (double)var1.ax5;
      this.ggc = (double)var1.ck3;
   }

   public final void yuw(double[] var1) {
      var1[0] = this.yme;
      var1[1] = this.pf8;
      var1[2] = this.jfe;
      var1[3] = this.ggc;
   }

   public final void ymp(xv0 var1) {
      var1.yme = this.yme;
      var1.pf8 = this.pf8;
      var1.jfe = this.jfe;
      var1.ggc = this.ggc;
   }

   public final void wtm(xv0 var1, xv0 var2) {
      this.yme = var1.yme + var2.yme;
      this.pf8 = var1.pf8 + var2.pf8;
      this.jfe = var1.jfe + var2.jfe;
      this.ggc = var1.ggc + var2.ggc;
   }

   public final void pdo(xv0 var1) {
      this.yme = this.yme + var1.yme;
      this.pf8 = this.pf8 + var1.pf8;
      this.jfe = this.jfe + var1.jfe;
      this.ggc = this.ggc + var1.ggc;
   }

   public final void a5x(xv0 var1, xv0 var2) {
      this.yme = var1.yme - var2.yme;
      this.pf8 = var1.pf8 - var2.pf8;
      this.jfe = var1.jfe - var2.jfe;
      this.ggc = var1.ggc - var2.ggc;
   }

   public final void mjb(xv0 var1) {
      this.yme = this.yme - var1.yme;
      this.pf8 = this.pf8 - var1.pf8;
      this.jfe = this.jfe - var1.jfe;
      this.ggc = this.ggc - var1.ggc;
   }

   public final void uzl(xv0 var1) {
      this.yme = -var1.yme;
      this.pf8 = -var1.pf8;
      this.jfe = -var1.jfe;
      this.ggc = -var1.ggc;
   }

   public final void cz4() {
      this.yme = -this.yme;
      this.pf8 = -this.pf8;
      this.jfe = -this.jfe;
      this.ggc = -this.ggc;
   }

   public final void byc(double var1, xv0 var3) {
      this.yme = var1 * var3.yme;
      this.pf8 = var1 * var3.pf8;
      this.jfe = var1 * var3.jfe;
      this.ggc = var1 * var3.ggc;
   }

   public final void frb(double var1) {
      this.yme *= var1;
      this.pf8 *= var1;
      this.jfe *= var1;
      this.ggc *= var1;
   }

   public final void ans(double var1, xv0 var3, xv0 var4) {
      this.yme = var1 * var3.yme + var4.yme;
      this.pf8 = var1 * var3.pf8 + var4.pf8;
      this.jfe = var1 * var3.jfe + var4.jfe;
      this.ggc = var1 * var3.ggc + var4.ggc;
   }

   public final void hzb(float var1, xv0 var2) {
      this.a1y((double)var1, var2);
   }

   public final void a1y(double var1, xv0 var3) {
      this.yme = var1 * this.yme + var3.yme;
      this.pf8 = var1 * this.pf8 + var3.pf8;
      this.jfe = var1 * this.jfe + var3.jfe;
      this.ggc = var1 * this.ggc + var3.ggc;
   }

   @Override
   public String toString() {
      long var1 = a ^ 119739373189077L;
      return "("
         + this.yme
         + a<"m">(3163, 5901056575615526693L ^ var1)
         + this.pf8
         + a<"m">(20915, 7229772682684447436L ^ var1)
         + this.jfe
         + a<"m">(20915, 7229772682684447436L ^ var1)
         + this.ggc
         + ")";
   }

   public boolean tv9(xv0 param1) {
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
      // 05: getfield xv0.yme D
      // 08: aload 1
      // 09: getfield xv0.yme D
      // 0c: dcmpl
      // 0d: iload 2
      // 0e: ifeq 2b
      // 11: ifne 79
      // 14: goto 1b
      // 17: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield xv0.pf8 D
      // 1f: aload 1
      // 20: getfield xv0.pf8 D
      // 23: dcmpl
      // 24: goto 2b
      // 27: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifeq 49
      // 2f: ifne 79
      // 32: goto 39
      // 35: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield xv0.jfe D
      // 3d: aload 1
      // 3e: getfield xv0.jfe D
      // 41: dcmpl
      // 42: goto 49
      // 45: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: iload 2
      // 4a: ifeq 67
      // 4d: ifne 79
      // 50: goto 57
      // 53: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 56: athrow
      // 57: aload 0
      // 58: getfield xv0.ggc D
      // 5b: aload 1
      // 5c: getfield xv0.ggc D
      // 5f: dcmpl
      // 60: goto 67
      // 63: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 66: athrow
      // 67: iload 2
      // 68: ifeq 76
      // 6b: ifne 79
      // 6e: goto 75
      // 71: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 74: athrow
      // 75: bipush 1
      // 76: goto 7a
      // 79: bipush 0
      // 7a: ireturn
      // 7b: astore 3
      // 7c: bipush 0
      // 7d: ireturn
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: checkcast xv0
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield xv0.yme D
      // 0d: aload 3
      // 0e: getfield xv0.yme D
      // 11: dcmpl
      // 12: iload 2
      // 13: ifne 30
      // 16: ifne 7e
      // 19: goto 20
      // 1c: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield xv0.pf8 D
      // 24: aload 3
      // 25: getfield xv0.pf8 D
      // 28: dcmpl
      // 29: goto 30
      // 2c: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 4e
      // 34: ifne 7e
      // 37: goto 3e
      // 3a: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield xv0.jfe D
      // 42: aload 3
      // 43: getfield xv0.jfe D
      // 46: dcmpl
      // 47: goto 4e
      // 4a: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifne 6c
      // 52: ifne 7e
      // 55: goto 5c
      // 58: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield xv0.ggc D
      // 60: aload 3
      // 61: getfield xv0.ggc D
      // 64: dcmpl
      // 65: goto 6c
      // 68: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6b: athrow
      // 6c: iload 2
      // 6d: ifne 7b
      // 70: ifne 7e
      // 73: goto 7a
      // 76: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 79: athrow
      // 7a: bipush 1
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: ireturn
      // 80: astore 3
      // 81: bipush 0
      // 82: ireturn
      // 83: astore 3
      // 84: bipush 0
      // 85: ireturn
   }

   public boolean p1x(xv0 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield xv0.yme D
      // 009: aload 1
      // 00a: getfield xv0.yme D
      // 00d: dsub
      // 00e: dstore 5
      // 010: dload 5
      // 012: invokestatic java/lang/Double.isNaN (D)Z
      // 015: iload 4
      // 017: ifeq 03a
      // 01a: ifeq 02a
      // 01d: goto 024
      // 020: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 029: athrow
      // 02a: dload 5
      // 02c: iload 4
      // 02e: ifeq 047
      // 031: dconst_0
      // 032: dcmpg
      // 033: goto 03a
      // 036: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 039: athrow
      // 03a: ifge 04a
      // 03d: dload 5
      // 03f: dneg
      // 040: goto 047
      // 043: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 046: athrow
      // 047: goto 04c
      // 04a: dload 5
      // 04c: dload 2
      // 04d: dcmpl
      // 04e: iload 4
      // 050: ifeq 073
      // 053: ifle 063
      // 056: goto 05d
      // 059: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 05c: athrow
      // 05d: bipush 0
      // 05e: ireturn
      // 05f: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 062: athrow
      // 063: aload 0
      // 064: getfield xv0.pf8 D
      // 067: aload 1
      // 068: getfield xv0.pf8 D
      // 06b: dsub
      // 06c: dstore 5
      // 06e: dload 5
      // 070: invokestatic java/lang/Double.isNaN (D)Z
      // 073: iload 4
      // 075: ifeq 098
      // 078: ifeq 088
      // 07b: goto 082
      // 07e: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 081: athrow
      // 082: bipush 0
      // 083: ireturn
      // 084: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 087: athrow
      // 088: dload 5
      // 08a: iload 4
      // 08c: ifeq 0a5
      // 08f: dconst_0
      // 090: dcmpg
      // 091: goto 098
      // 094: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 097: athrow
      // 098: ifge 0a8
      // 09b: dload 5
      // 09d: dneg
      // 09e: goto 0a5
      // 0a1: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a4: athrow
      // 0a5: goto 0aa
      // 0a8: dload 5
      // 0aa: dload 2
      // 0ab: dcmpl
      // 0ac: iload 4
      // 0ae: ifeq 0d1
      // 0b1: ifle 0c1
      // 0b4: goto 0bb
      // 0b7: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ba: athrow
      // 0bb: bipush 0
      // 0bc: ireturn
      // 0bd: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield xv0.jfe D
      // 0c5: aload 1
      // 0c6: getfield xv0.jfe D
      // 0c9: dsub
      // 0ca: dstore 5
      // 0cc: dload 5
      // 0ce: invokestatic java/lang/Double.isNaN (D)Z
      // 0d1: iload 4
      // 0d3: ifeq 0f6
      // 0d6: ifeq 0e6
      // 0d9: goto 0e0
      // 0dc: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0df: athrow
      // 0e0: bipush 0
      // 0e1: ireturn
      // 0e2: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0e5: athrow
      // 0e6: dload 5
      // 0e8: iload 4
      // 0ea: ifeq 103
      // 0ed: dconst_0
      // 0ee: dcmpg
      // 0ef: goto 0f6
      // 0f2: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f5: athrow
      // 0f6: ifge 106
      // 0f9: dload 5
      // 0fb: dneg
      // 0fc: goto 103
      // 0ff: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 102: athrow
      // 103: goto 108
      // 106: dload 5
      // 108: dload 2
      // 109: dcmpl
      // 10a: iload 4
      // 10c: ifeq 12f
      // 10f: ifle 11f
      // 112: goto 119
      // 115: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 118: athrow
      // 119: bipush 0
      // 11a: ireturn
      // 11b: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield xv0.ggc D
      // 123: aload 1
      // 124: getfield xv0.ggc D
      // 127: dsub
      // 128: dstore 5
      // 12a: dload 5
      // 12c: invokestatic java/lang/Double.isNaN (D)Z
      // 12f: iload 4
      // 131: ifeq 154
      // 134: ifeq 144
      // 137: goto 13e
      // 13a: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 13d: athrow
      // 13e: bipush 0
      // 13f: ireturn
      // 140: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 143: athrow
      // 144: dload 5
      // 146: iload 4
      // 148: ifeq 161
      // 14b: dconst_0
      // 14c: dcmpg
      // 14d: goto 154
      // 150: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 153: athrow
      // 154: ifge 164
      // 157: dload 5
      // 159: dneg
      // 15a: goto 161
      // 15d: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 160: athrow
      // 161: goto 166
      // 164: dload 5
      // 166: dload 2
      // 167: dcmpl
      // 168: iload 4
      // 16a: ifeq 17e
      // 16d: ifle 17d
      // 170: goto 177
      // 173: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 176: athrow
      // 177: bipush 0
      // 178: ireturn
      // 179: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17c: athrow
      // 17d: bipush 1
      // 17e: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.mql(var1, this.yme);
      var1 = get.mql(var1, this.pf8);
      var1 = get.mql(var1, this.jfe);
      var1 = get.mql(var1, this.ggc);
      return get.p05(var1);
   }

   public final void zfj(float var1, float var2, xv0 var3) {
      this.zkm((double)var1, (double)var2, var3);
   }

   public final void zkm(double param1, double param3, xv0 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 6
      // 005: aload 5
      // 007: getfield xv0.yme D
      // 00a: dload 3
      // 00b: dcmpl
      // 00c: iload 6
      // 00e: ifne 046
      // 011: ifle 02c
      // 014: goto 01b
      // 017: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: dload 3
      // 01d: putfield xv0.yme D
      // 020: iload 6
      // 022: ifeq 06a
      // 025: goto 02c
      // 028: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 02b: athrow
      // 02c: aload 5
      // 02e: iload 6
      // 030: ifne 062
      // 033: goto 03a
      // 036: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 039: athrow
      // 03a: getfield xv0.yme D
      // 03d: dload 1
      // 03e: dcmpg
      // 03f: goto 046
      // 042: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 045: athrow
      // 046: ifge 05a
      // 049: aload 0
      // 04a: dload 1
      // 04b: putfield xv0.yme D
      // 04e: iload 6
      // 050: ifeq 06a
      // 053: goto 05a
      // 056: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 059: athrow
      // 05a: aload 0
      // 05b: goto 062
      // 05e: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 061: athrow
      // 062: aload 5
      // 064: getfield xv0.yme D
      // 067: putfield xv0.yme D
      // 06a: aload 5
      // 06c: getfield xv0.pf8 D
      // 06f: dload 3
      // 070: dcmpl
      // 071: iload 6
      // 073: ifne 0ab
      // 076: ifle 091
      // 079: goto 080
      // 07c: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 07f: athrow
      // 080: aload 0
      // 081: dload 3
      // 082: putfield xv0.pf8 D
      // 085: iload 6
      // 087: ifeq 0cf
      // 08a: goto 091
      // 08d: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 090: athrow
      // 091: aload 5
      // 093: iload 6
      // 095: ifne 0c7
      // 098: goto 09f
      // 09b: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 09e: athrow
      // 09f: getfield xv0.pf8 D
      // 0a2: dload 1
      // 0a3: dcmpg
      // 0a4: goto 0ab
      // 0a7: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0aa: athrow
      // 0ab: ifge 0bf
      // 0ae: aload 0
      // 0af: dload 1
      // 0b0: putfield xv0.pf8 D
      // 0b3: iload 6
      // 0b5: ifeq 0cf
      // 0b8: goto 0bf
      // 0bb: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: goto 0c7
      // 0c3: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c6: athrow
      // 0c7: aload 5
      // 0c9: getfield xv0.pf8 D
      // 0cc: putfield xv0.pf8 D
      // 0cf: aload 5
      // 0d1: getfield xv0.jfe D
      // 0d4: dload 3
      // 0d5: dcmpl
      // 0d6: iload 6
      // 0d8: ifne 110
      // 0db: ifle 0f6
      // 0de: goto 0e5
      // 0e1: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: dload 3
      // 0e7: putfield xv0.jfe D
      // 0ea: iload 6
      // 0ec: ifeq 134
      // 0ef: goto 0f6
      // 0f2: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f5: athrow
      // 0f6: aload 5
      // 0f8: iload 6
      // 0fa: ifne 12c
      // 0fd: goto 104
      // 100: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 103: athrow
      // 104: getfield xv0.jfe D
      // 107: dload 1
      // 108: dcmpg
      // 109: goto 110
      // 10c: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 10f: athrow
      // 110: ifge 124
      // 113: aload 0
      // 114: dload 1
      // 115: putfield xv0.jfe D
      // 118: iload 6
      // 11a: ifeq 134
      // 11d: goto 124
      // 120: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 123: athrow
      // 124: aload 0
      // 125: goto 12c
      // 128: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 12b: athrow
      // 12c: aload 5
      // 12e: getfield xv0.jfe D
      // 131: putfield xv0.jfe D
      // 134: aload 5
      // 136: getfield xv0.ggc D
      // 139: dload 3
      // 13a: dcmpl
      // 13b: iload 6
      // 13d: ifne 175
      // 140: ifle 15b
      // 143: goto 14a
      // 146: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 149: athrow
      // 14a: aload 0
      // 14b: dload 3
      // 14c: putfield xv0.ggc D
      // 14f: iload 6
      // 151: ifeq 199
      // 154: goto 15b
      // 157: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 15a: athrow
      // 15b: aload 5
      // 15d: iload 6
      // 15f: ifne 191
      // 162: goto 169
      // 165: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 168: athrow
      // 169: getfield xv0.ggc D
      // 16c: dload 1
      // 16d: dcmpg
      // 16e: goto 175
      // 171: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 174: athrow
      // 175: ifge 189
      // 178: aload 0
      // 179: dload 1
      // 17a: putfield xv0.ggc D
      // 17d: iload 6
      // 17f: ifeq 199
      // 182: goto 189
      // 185: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 188: athrow
      // 189: aload 0
      // 18a: goto 191
      // 18d: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 190: athrow
      // 191: aload 5
      // 193: getfield xv0.ggc D
      // 196: putfield xv0.ggc D
      // 199: return
   }

   public final void qi9(float var1, xv0 var2) {
      this.itj((double)var1, var2);
   }

   public final void itj(double param1, xv0 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifeq 33
      // 0b: getfield xv0.yme D
      // 0e: dload 1
      // 0f: dcmpg
      // 10: ifge 2b
      // 13: goto 1a
      // 16: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 1
      // 1c: putfield xv0.yme D
      // 1f: iload 4
      // 21: ifne 3a
      // 24: goto 2b
      // 27: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: aload 3
      // 34: getfield xv0.yme D
      // 37: putfield xv0.yme D
      // 3a: aload 3
      // 3b: iload 4
      // 3d: ifeq 68
      // 40: getfield xv0.pf8 D
      // 43: dload 1
      // 44: dcmpg
      // 45: ifge 60
      // 48: goto 4f
      // 4b: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 1
      // 51: putfield xv0.pf8 D
      // 54: iload 4
      // 56: ifne 6f
      // 59: goto 60
      // 5c: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: aload 3
      // 69: getfield xv0.pf8 D
      // 6c: putfield xv0.pf8 D
      // 6f: aload 3
      // 70: iload 4
      // 72: ifeq 9d
      // 75: getfield xv0.jfe D
      // 78: dload 1
      // 79: dcmpg
      // 7a: ifge 95
      // 7d: goto 84
      // 80: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 83: athrow
      // 84: aload 0
      // 85: dload 1
      // 86: putfield xv0.jfe D
      // 89: iload 4
      // 8b: ifne a4
      // 8e: goto 95
      // 91: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 94: athrow
      // 95: aload 0
      // 96: goto 9d
      // 99: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 9c: athrow
      // 9d: aload 3
      // 9e: getfield xv0.jfe D
      // a1: putfield xv0.jfe D
      // a4: aload 3
      // a5: iload 4
      // a7: ifeq d2
      // aa: getfield xv0.ggc D
      // ad: dload 1
      // ae: dcmpg
      // af: ifge ca
      // b2: goto b9
      // b5: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b8: athrow
      // b9: aload 0
      // ba: dload 1
      // bb: putfield xv0.ggc D
      // be: iload 4
      // c0: ifne d9
      // c3: goto ca
      // c6: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c9: athrow
      // ca: aload 0
      // cb: goto d2
      // ce: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // d1: athrow
      // d2: aload 3
      // d3: getfield xv0.ggc D
      // d6: putfield xv0.ggc D
      // d9: return
   }

   public final void c8f(float var1, xv0 var2) {
      this.k1b((double)var1, var2);
   }

   public final void k1b(double param1, xv0 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifeq 33
      // 0b: getfield xv0.yme D
      // 0e: dload 1
      // 0f: dcmpl
      // 10: ifle 2b
      // 13: goto 1a
      // 16: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 1
      // 1c: putfield xv0.yme D
      // 1f: iload 4
      // 21: ifne 3a
      // 24: goto 2b
      // 27: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: aload 3
      // 34: getfield xv0.yme D
      // 37: putfield xv0.yme D
      // 3a: aload 3
      // 3b: iload 4
      // 3d: ifeq 68
      // 40: getfield xv0.pf8 D
      // 43: dload 1
      // 44: dcmpl
      // 45: ifle 60
      // 48: goto 4f
      // 4b: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 1
      // 51: putfield xv0.pf8 D
      // 54: iload 4
      // 56: ifne 6f
      // 59: goto 60
      // 5c: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: aload 3
      // 69: getfield xv0.pf8 D
      // 6c: putfield xv0.pf8 D
      // 6f: aload 3
      // 70: iload 4
      // 72: ifeq 9d
      // 75: getfield xv0.jfe D
      // 78: dload 1
      // 79: dcmpl
      // 7a: ifle 95
      // 7d: goto 84
      // 80: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 83: athrow
      // 84: aload 0
      // 85: dload 1
      // 86: putfield xv0.jfe D
      // 89: iload 4
      // 8b: ifne a4
      // 8e: goto 95
      // 91: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 94: athrow
      // 95: aload 0
      // 96: goto 9d
      // 99: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 9c: athrow
      // 9d: aload 3
      // 9e: getfield xv0.jfe D
      // a1: putfield xv0.jfe D
      // a4: aload 3
      // a5: iload 4
      // a7: ifeq d2
      // aa: getfield xv0.ggc D
      // ad: dload 1
      // ae: dcmpl
      // af: ifle ca
      // b2: goto b9
      // b5: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b8: athrow
      // b9: aload 0
      // ba: dload 1
      // bb: putfield xv0.ggc D
      // be: iload 4
      // c0: ifne d9
      // c3: goto ca
      // c6: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c9: athrow
      // ca: aload 0
      // cb: goto d2
      // ce: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // d1: athrow
      // d2: aload 3
      // d3: getfield xv0.jfe D
      // d6: putfield xv0.ggc D
      // d9: return
   }

   public final void chn(xv0 var1) {
      this.yme = Math.abs(var1.yme);
      this.pf8 = Math.abs(var1.pf8);
      this.jfe = Math.abs(var1.jfe);
      this.ggc = Math.abs(var1.ggc);
   }

   public final void jf1(float var1, float var2) {
      this.nnj((double)var1, (double)var2);
   }

   public final void nnj(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: aload 0
      // 006: getfield xv0.yme D
      // 009: dload 3
      // 00a: dcmpl
      // 00b: iload 5
      // 00d: ifne 038
      // 010: ifle 02b
      // 013: goto 01a
      // 016: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 019: athrow
      // 01a: aload 0
      // 01b: dload 3
      // 01c: putfield xv0.yme D
      // 01f: iload 5
      // 021: ifeq 053
      // 024: goto 02b
      // 027: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: getfield xv0.yme D
      // 02f: dload 1
      // 030: dcmpg
      // 031: goto 038
      // 034: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 037: athrow
      // 038: iload 5
      // 03a: ifne 059
      // 03d: ifge 053
      // 040: goto 047
      // 043: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 046: athrow
      // 047: aload 0
      // 048: dload 1
      // 049: putfield xv0.yme D
      // 04c: goto 053
      // 04f: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 052: athrow
      // 053: aload 0
      // 054: getfield xv0.pf8 D
      // 057: dload 3
      // 058: dcmpl
      // 059: iload 5
      // 05b: ifne 086
      // 05e: ifle 079
      // 061: goto 068
      // 064: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 067: athrow
      // 068: aload 0
      // 069: dload 3
      // 06a: putfield xv0.pf8 D
      // 06d: iload 5
      // 06f: ifeq 0a1
      // 072: goto 079
      // 075: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield xv0.pf8 D
      // 07d: dload 1
      // 07e: dcmpg
      // 07f: goto 086
      // 082: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 085: athrow
      // 086: iload 5
      // 088: ifne 0a7
      // 08b: ifge 0a1
      // 08e: goto 095
      // 091: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 094: athrow
      // 095: aload 0
      // 096: dload 1
      // 097: putfield xv0.pf8 D
      // 09a: goto 0a1
      // 09d: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield xv0.jfe D
      // 0a5: dload 3
      // 0a6: dcmpl
      // 0a7: iload 5
      // 0a9: ifne 0d4
      // 0ac: ifle 0c7
      // 0af: goto 0b6
      // 0b2: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: dload 3
      // 0b8: putfield xv0.jfe D
      // 0bb: iload 5
      // 0bd: ifeq 0ef
      // 0c0: goto 0c7
      // 0c3: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield xv0.jfe D
      // 0cb: dload 1
      // 0cc: dcmpg
      // 0cd: goto 0d4
      // 0d0: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0d3: athrow
      // 0d4: iload 5
      // 0d6: ifne 0f5
      // 0d9: ifge 0ef
      // 0dc: goto 0e3
      // 0df: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: dload 1
      // 0e5: putfield xv0.jfe D
      // 0e8: goto 0ef
      // 0eb: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield xv0.ggc D
      // 0f3: dload 3
      // 0f4: dcmpl
      // 0f5: iload 5
      // 0f7: ifne 12e
      // 0fa: ifle 115
      // 0fd: goto 104
      // 100: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 103: athrow
      // 104: aload 0
      // 105: dload 3
      // 106: putfield xv0.ggc D
      // 109: iload 5
      // 10b: ifeq 136
      // 10e: goto 115
      // 111: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 114: athrow
      // 115: aload 0
      // 116: iload 5
      // 118: ifne 132
      // 11b: goto 122
      // 11e: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 121: athrow
      // 122: getfield xv0.ggc D
      // 125: dload 1
      // 126: dcmpg
      // 127: goto 12e
      // 12a: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 12d: athrow
      // 12e: ifge 136
      // 131: aload 0
      // 132: dload 1
      // 133: putfield xv0.ggc D
      // 136: return
   }

   public final void i8s(float var1) {
      this.xt3((double)var1);
   }

   public final void xt3(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield xv0.yme D
      // 08: dload 1
      // 09: dcmpg
      // 0a: iload 3
      // 0b: ifne 2a
      // 0e: ifge 24
      // 11: goto 18
      // 14: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: dload 1
      // 1a: putfield xv0.yme D
      // 1d: goto 24
      // 20: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield xv0.pf8 D
      // 28: dload 1
      // 29: dcmpg
      // 2a: iload 3
      // 2b: ifne 4a
      // 2e: ifge 44
      // 31: goto 38
      // 34: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: aload 0
      // 39: dload 1
      // 3a: putfield xv0.pf8 D
      // 3d: goto 44
      // 40: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield xv0.jfe D
      // 48: dload 1
      // 49: dcmpg
      // 4a: iload 3
      // 4b: ifne 75
      // 4e: ifge 64
      // 51: goto 58
      // 54: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 57: athrow
      // 58: aload 0
      // 59: dload 1
      // 5a: putfield xv0.jfe D
      // 5d: goto 64
      // 60: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 63: athrow
      // 64: aload 0
      // 65: iload 3
      // 66: ifne 79
      // 69: getfield xv0.ggc D
      // 6c: dload 1
      // 6d: dcmpg
      // 6e: goto 75
      // 71: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 74: athrow
      // 75: ifge 7d
      // 78: aload 0
      // 79: dload 1
      // 7a: putfield xv0.ggc D
      // 7d: return
   }

   public final void n72(float var1) {
      this.bzh((double)var1);
   }

   public final void bzh(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield xv0.yme D
      // 08: dload 1
      // 09: dcmpl
      // 0a: iload 3
      // 0b: ifeq 2a
      // 0e: ifle 24
      // 11: goto 18
      // 14: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: dload 1
      // 1a: putfield xv0.yme D
      // 1d: goto 24
      // 20: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield xv0.pf8 D
      // 28: dload 1
      // 29: dcmpl
      // 2a: iload 3
      // 2b: ifeq 4a
      // 2e: ifle 44
      // 31: goto 38
      // 34: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: aload 0
      // 39: dload 1
      // 3a: putfield xv0.pf8 D
      // 3d: goto 44
      // 40: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield xv0.jfe D
      // 48: dload 1
      // 49: dcmpl
      // 4a: iload 3
      // 4b: ifeq 75
      // 4e: ifle 64
      // 51: goto 58
      // 54: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 57: athrow
      // 58: aload 0
      // 59: dload 1
      // 5a: putfield xv0.jfe D
      // 5d: goto 64
      // 60: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 63: athrow
      // 64: aload 0
      // 65: iload 3
      // 66: ifeq 79
      // 69: getfield xv0.ggc D
      // 6c: dload 1
      // 6d: dcmpl
      // 6e: goto 75
      // 71: invokestatic xv0.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 74: athrow
      // 75: ifle 7d
      // 78: aload 0
      // 79: dload 1
      // 7a: putfield xv0.ggc D
      // 7d: return
   }

   public final void ir8() {
      this.yme = Math.abs(this.yme);
      this.pf8 = Math.abs(this.pf8);
      this.jfe = Math.abs(this.jfe);
      this.ggc = Math.abs(this.ggc);
   }

   public void _ac(xv0 var1, xv0 var2, float var3) {
      this.p86(var1, var2, (double)var3);
   }

   public void p86(xv0 var1, xv0 var2, double var3) {
      this.yme = (1.0 - var3) * var1.yme + var3 * var2.yme;
      this.pf8 = (1.0 - var3) * var1.pf8 + var3 * var2.pf8;
      this.jfe = (1.0 - var3) * var1.jfe + var3 * var2.jfe;
      this.ggc = (1.0 - var3) * var1.ggc + var3 * var2.ggc;
   }

   public void beg(xv0 var1, float var2) {
      this.gz1(var1, (double)var2);
   }

   public void gz1(xv0 var1, double var2) {
      this.yme = (1.0 - var2) * this.yme + var2 * var1.yme;
      this.pf8 = (1.0 - var2) * this.pf8 + var2 * var1.pf8;
      this.jfe = (1.0 - var2) * this.jfe + var2 * var1.jfe;
      this.ggc = (1.0 - var2) * this.ggc + var2 * var1.ggc;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final double ktj() {
      return this.yme;
   }

   public final void wrn(double var1) {
      this.yme = var1;
   }

   public final double _2j() {
      return this.pf8;
   }

   public final void f_5(double var1) {
      this.pf8 = var1;
   }

   public final double uyx() {
      return this.jfe;
   }

   public final void v61(double var1) {
      this.jfe = var1;
   }

   public final double bfc() {
      return this.ggc;
   }

   public final void wl2(double var1) {
      this.ggc = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8736968708680182062L, -3417718873336748195L, MethodHandles.lookup().lookupClass()).a(214966614721653L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 50604114851020L;
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
      String var6 = "ó¸õ¦OVâ¼\u001aý\u007få\u0003¤2~\u0010\u0015¨NEì>lP<ã9§\u009c -ô";
      int var8 = "ó¸õ¦OVâ¼\u001aý\u007få\u0003¤2~\u0010\u0015¨NEì>lP<ã9§\u009c -ô".length();
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

   private static NullPointerException a(NullPointerException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7814;
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
            throw new RuntimeException("xv0", var10);
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
         throw new RuntimeException("xv0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
