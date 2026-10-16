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

public abstract class ry6 implements Serializable, Cloneable {
   public static final long serialVersionUID = 5019834619484343712L;
   public float yiu;
   public float q6o;
   public float n_d;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ry6(float var1, float var2, float var3) {
      this.yiu = var1;
      this.q6o = var2;
      this.n_d = var3;
   }

   public ry6(float[] var1) {
      this.yiu = var1[0];
      this.q6o = var1[1];
      this.n_d = var1[2];
   }

   public ry6(ry6 var1) {
      this.yiu = var1.yiu;
      this.q6o = var1.q6o;
      this.n_d = var1.n_d;
   }

   public ry6(g5s var1) {
      this.yiu = (float)var1.v54;
      this.q6o = (float)var1.g0w;
      this.n_d = (float)var1.mu9;
   }

   public ry6() {
      this.yiu = 0.0F;
      this.q6o = 0.0F;
      this.n_d = 0.0F;
   }

   @Override
   public String toString() {
      long var1 = a ^ 67462364387639L;
      return "(" + this.yiu + a<"r">(510, 265758549633106961L ^ var1) + this.q6o + a<"r">(23331, 8771574493087948493L ^ var1) + this.n_d + ")";
   }

   public final void plt(float var1, float var2, float var3) {
      this.yiu = var1;
      this.q6o = var2;
      this.n_d = var3;
   }

   public final void zz2(float[] var1) {
      this.yiu = var1[0];
      this.q6o = var1[1];
      this.n_d = var1[2];
   }

   public final void a9l(ry6 var1) {
      this.yiu = var1.yiu;
      this.q6o = var1.q6o;
      this.n_d = var1.n_d;
   }

   public final void uko(g5s var1) {
      this.yiu = (float)var1.v54;
      this.q6o = (float)var1.g0w;
      this.n_d = (float)var1.mu9;
   }

   public final void _3h(float[] var1) {
      var1[0] = this.yiu;
      var1[1] = this.q6o;
      var1[2] = this.n_d;
   }

   public final void pno(ry6 var1) {
      var1.yiu = this.yiu;
      var1.q6o = this.q6o;
      var1.n_d = this.n_d;
   }

   public final void exi(ry6 var1, ry6 var2) {
      this.yiu = var1.yiu + var2.yiu;
      this.q6o = var1.q6o + var2.q6o;
      this.n_d = var1.n_d + var2.n_d;
   }

   public final void et6(ry6 var1) {
      this.yiu = this.yiu + var1.yiu;
      this.q6o = this.q6o + var1.q6o;
      this.n_d = this.n_d + var1.n_d;
   }

   public final void iqs(ry6 var1, ry6 var2) {
      this.yiu = var1.yiu - var2.yiu;
      this.q6o = var1.q6o - var2.q6o;
      this.n_d = var1.n_d - var2.n_d;
   }

   public final void c3v(ry6 var1) {
      this.yiu = this.yiu - var1.yiu;
      this.q6o = this.q6o - var1.q6o;
      this.n_d = this.n_d - var1.n_d;
   }

   public final void yc8(ry6 var1) {
      this.yiu = -var1.yiu;
      this.q6o = -var1.q6o;
      this.n_d = -var1.n_d;
   }

   public final void v04() {
      this.yiu = -this.yiu;
      this.q6o = -this.q6o;
      this.n_d = -this.n_d;
   }

   public final void vt0(float var1, ry6 var2) {
      this.yiu = var1 * var2.yiu;
      this.q6o = var1 * var2.q6o;
      this.n_d = var1 * var2.n_d;
   }

   public final void o7b(float var1) {
      this.yiu *= var1;
      this.q6o *= var1;
      this.n_d *= var1;
   }

   public final void v2d(float var1, ry6 var2, ry6 var3) {
      this.yiu = var1 * var2.yiu + var3.yiu;
      this.q6o = var1 * var2.q6o + var3.q6o;
      this.n_d = var1 * var2.n_d + var3.n_d;
   }

   public final void n84(float var1, ry6 var2) {
      this.yiu = var1 * this.yiu + var2.yiu;
      this.q6o = var1 * this.q6o + var2.q6o;
      this.n_d = var1 * this.n_d + var2.n_d;
   }

   public boolean gof(ry6 param1) {
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
      // 05: getfield ry6.yiu F
      // 08: aload 1
      // 09: getfield ry6.yiu F
      // 0c: fcmpl
      // 0d: iload 2
      // 0e: ifne 2b
      // 11: ifne 5b
      // 14: goto 1b
      // 17: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield ry6.q6o F
      // 1f: aload 1
      // 20: getfield ry6.q6o F
      // 23: fcmpl
      // 24: goto 2b
      // 27: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifne 49
      // 2f: ifne 5b
      // 32: goto 39
      // 35: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield ry6.n_d F
      // 3d: aload 1
      // 3e: getfield ry6.n_d F
      // 41: fcmpl
      // 42: goto 49
      // 45: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: iload 2
      // 4a: ifne 58
      // 4d: ifne 5b
      // 50: goto 57
      // 53: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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
      // 05: checkcast ry6
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield ry6.yiu F
      // 0d: aload 3
      // 0e: getfield ry6.yiu F
      // 11: fcmpl
      // 12: iload 2
      // 13: ifne 30
      // 16: ifne 60
      // 19: goto 20
      // 1c: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield ry6.q6o F
      // 24: aload 3
      // 25: getfield ry6.q6o F
      // 28: fcmpl
      // 29: goto 30
      // 2c: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 4e
      // 34: ifne 60
      // 37: goto 3e
      // 3a: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield ry6.n_d F
      // 42: aload 3
      // 43: getfield ry6.n_d F
      // 46: fcmpl
      // 47: goto 4e
      // 4a: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifne 5d
      // 52: ifne 60
      // 55: goto 5c
      // 58: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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

   public boolean w13(ry6 param1, float param2) {
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
      // 005: getfield ry6.yiu F
      // 008: aload 1
      // 009: getfield ry6.yiu F
      // 00c: fsub
      // 00d: fstore 4
      // 00f: fload 4
      // 011: invokestatic java/lang/Float.isNaN (F)Z
      // 014: iload 3
      // 015: ifeq 037
      // 018: ifeq 028
      // 01b: goto 022
      // 01e: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 021: athrow
      // 022: bipush 0
      // 023: ireturn
      // 024: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 027: athrow
      // 028: fload 4
      // 02a: iload 3
      // 02b: ifeq 044
      // 02e: fconst_0
      // 02f: fcmpg
      // 030: goto 037
      // 033: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 036: athrow
      // 037: ifge 047
      // 03a: fload 4
      // 03c: fneg
      // 03d: goto 044
      // 040: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 043: athrow
      // 044: goto 049
      // 047: fload 4
      // 049: fload 2
      // 04a: fcmpl
      // 04b: iload 3
      // 04c: ifeq 06f
      // 04f: ifle 05f
      // 052: goto 059
      // 055: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 058: athrow
      // 059: bipush 0
      // 05a: ireturn
      // 05b: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield ry6.q6o F
      // 063: aload 1
      // 064: getfield ry6.q6o F
      // 067: fsub
      // 068: fstore 4
      // 06a: fload 4
      // 06c: invokestatic java/lang/Float.isNaN (F)Z
      // 06f: iload 3
      // 070: ifeq 092
      // 073: ifeq 083
      // 076: goto 07d
      // 079: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 07c: athrow
      // 07d: bipush 0
      // 07e: ireturn
      // 07f: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 082: athrow
      // 083: fload 4
      // 085: iload 3
      // 086: ifeq 09f
      // 089: fconst_0
      // 08a: fcmpg
      // 08b: goto 092
      // 08e: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 091: athrow
      // 092: ifge 0a2
      // 095: fload 4
      // 097: fneg
      // 098: goto 09f
      // 09b: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 09e: athrow
      // 09f: goto 0a4
      // 0a2: fload 4
      // 0a4: fload 2
      // 0a5: fcmpl
      // 0a6: iload 3
      // 0a7: ifeq 0ca
      // 0aa: ifle 0ba
      // 0ad: goto 0b4
      // 0b0: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b3: athrow
      // 0b4: bipush 0
      // 0b5: ireturn
      // 0b6: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield ry6.n_d F
      // 0be: aload 1
      // 0bf: getfield ry6.n_d F
      // 0c2: fsub
      // 0c3: fstore 4
      // 0c5: fload 4
      // 0c7: invokestatic java/lang/Float.isNaN (F)Z
      // 0ca: iload 3
      // 0cb: ifeq 0ed
      // 0ce: ifeq 0de
      // 0d1: goto 0d8
      // 0d4: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0d7: athrow
      // 0d8: bipush 0
      // 0d9: ireturn
      // 0da: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0dd: athrow
      // 0de: fload 4
      // 0e0: iload 3
      // 0e1: ifeq 0fa
      // 0e4: fconst_0
      // 0e5: fcmpg
      // 0e6: goto 0ed
      // 0e9: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ec: athrow
      // 0ed: ifge 0fd
      // 0f0: fload 4
      // 0f2: fneg
      // 0f3: goto 0fa
      // 0f6: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f9: athrow
      // 0fa: goto 0ff
      // 0fd: fload 4
      // 0ff: fload 2
      // 100: fcmpl
      // 101: iload 3
      // 102: ifeq 116
      // 105: ifle 115
      // 108: goto 10f
      // 10b: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 10e: athrow
      // 10f: bipush 0
      // 110: ireturn
      // 111: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 114: athrow
      // 115: bipush 1
      // 116: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.g_p(var1, this.yiu);
      var1 = get.g_p(var1, this.q6o);
      var1 = get.g_p(var1, this.n_d);
      return get.p05(var1);
   }

   public final void mzl(float param1, float param2, ry6 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 3
      // 006: getfield ry6.yiu F
      // 009: fload 2
      // 00a: fcmpl
      // 00b: iload 4
      // 00d: ifne 044
      // 010: ifle 02b
      // 013: goto 01a
      // 016: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 019: athrow
      // 01a: aload 0
      // 01b: fload 2
      // 01c: putfield ry6.yiu F
      // 01f: iload 4
      // 021: ifeq 067
      // 024: goto 02b
      // 027: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 02a: athrow
      // 02b: aload 3
      // 02c: iload 4
      // 02e: ifne 060
      // 031: goto 038
      // 034: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 037: athrow
      // 038: getfield ry6.yiu F
      // 03b: fload 1
      // 03c: fcmpg
      // 03d: goto 044
      // 040: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 043: athrow
      // 044: ifge 058
      // 047: aload 0
      // 048: fload 1
      // 049: putfield ry6.yiu F
      // 04c: iload 4
      // 04e: ifeq 067
      // 051: goto 058
      // 054: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 057: athrow
      // 058: aload 0
      // 059: goto 060
      // 05c: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 05f: athrow
      // 060: aload 3
      // 061: getfield ry6.yiu F
      // 064: putfield ry6.yiu F
      // 067: aload 3
      // 068: getfield ry6.q6o F
      // 06b: fload 2
      // 06c: fcmpl
      // 06d: iload 4
      // 06f: ifne 0a6
      // 072: ifle 08d
      // 075: goto 07c
      // 078: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 07b: athrow
      // 07c: aload 0
      // 07d: fload 2
      // 07e: putfield ry6.q6o F
      // 081: iload 4
      // 083: ifeq 0c9
      // 086: goto 08d
      // 089: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 08c: athrow
      // 08d: aload 3
      // 08e: iload 4
      // 090: ifne 0c2
      // 093: goto 09a
      // 096: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 099: athrow
      // 09a: getfield ry6.q6o F
      // 09d: fload 1
      // 09e: fcmpg
      // 09f: goto 0a6
      // 0a2: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a5: athrow
      // 0a6: ifge 0ba
      // 0a9: aload 0
      // 0aa: fload 1
      // 0ab: putfield ry6.q6o F
      // 0ae: iload 4
      // 0b0: ifeq 0c9
      // 0b3: goto 0ba
      // 0b6: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: goto 0c2
      // 0be: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c1: athrow
      // 0c2: aload 3
      // 0c3: getfield ry6.q6o F
      // 0c6: putfield ry6.q6o F
      // 0c9: aload 3
      // 0ca: getfield ry6.n_d F
      // 0cd: fload 2
      // 0ce: fcmpl
      // 0cf: iload 4
      // 0d1: ifne 108
      // 0d4: ifle 0ef
      // 0d7: goto 0de
      // 0da: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: fload 2
      // 0e0: putfield ry6.n_d F
      // 0e3: iload 4
      // 0e5: ifeq 12b
      // 0e8: goto 0ef
      // 0eb: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ee: athrow
      // 0ef: aload 3
      // 0f0: iload 4
      // 0f2: ifne 124
      // 0f5: goto 0fc
      // 0f8: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0fb: athrow
      // 0fc: getfield ry6.n_d F
      // 0ff: fload 1
      // 100: fcmpg
      // 101: goto 108
      // 104: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 107: athrow
      // 108: ifge 11c
      // 10b: aload 0
      // 10c: fload 1
      // 10d: putfield ry6.n_d F
      // 110: iload 4
      // 112: ifeq 12b
      // 115: goto 11c
      // 118: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 11b: athrow
      // 11c: aload 0
      // 11d: goto 124
      // 120: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 123: athrow
      // 124: aload 3
      // 125: getfield ry6.n_d F
      // 128: putfield ry6.n_d F
      // 12b: return
   }

   public final void x7s(float param1, ry6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 30
      // 09: getfield ry6.yiu F
      // 0c: fload 1
      // 0d: fcmpg
      // 0e: ifge 28
      // 11: goto 18
      // 14: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield ry6.yiu F
      // 1d: iload 3
      // 1e: ifeq 37
      // 21: goto 28
      // 24: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: aload 2
      // 31: getfield ry6.yiu F
      // 34: putfield ry6.yiu F
      // 37: aload 2
      // 38: iload 3
      // 39: ifne 63
      // 3c: getfield ry6.q6o F
      // 3f: fload 1
      // 40: fcmpg
      // 41: ifge 5b
      // 44: goto 4b
      // 47: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: fload 1
      // 4d: putfield ry6.q6o F
      // 50: iload 3
      // 51: ifeq 6a
      // 54: goto 5b
      // 57: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 2
      // 64: getfield ry6.q6o F
      // 67: putfield ry6.q6o F
      // 6a: aload 2
      // 6b: iload 3
      // 6c: ifne 96
      // 6f: getfield ry6.n_d F
      // 72: fload 1
      // 73: fcmpg
      // 74: ifge 8e
      // 77: goto 7e
      // 7a: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: fload 1
      // 80: putfield ry6.n_d F
      // 83: iload 3
      // 84: ifeq 9d
      // 87: goto 8e
      // 8a: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: goto 96
      // 92: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 95: athrow
      // 96: aload 2
      // 97: getfield ry6.n_d F
      // 9a: putfield ry6.n_d F
      // 9d: return
   }

   public final void ab9(float param1, ry6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 30
      // 09: getfield ry6.yiu F
      // 0c: fload 1
      // 0d: fcmpl
      // 0e: ifle 28
      // 11: goto 18
      // 14: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield ry6.yiu F
      // 1d: iload 3
      // 1e: ifne 37
      // 21: goto 28
      // 24: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: aload 2
      // 31: getfield ry6.yiu F
      // 34: putfield ry6.yiu F
      // 37: aload 2
      // 38: iload 3
      // 39: ifeq 63
      // 3c: getfield ry6.q6o F
      // 3f: fload 1
      // 40: fcmpl
      // 41: ifle 5b
      // 44: goto 4b
      // 47: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: fload 1
      // 4d: putfield ry6.q6o F
      // 50: iload 3
      // 51: ifne 6a
      // 54: goto 5b
      // 57: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 2
      // 64: getfield ry6.q6o F
      // 67: putfield ry6.q6o F
      // 6a: aload 2
      // 6b: iload 3
      // 6c: ifeq 96
      // 6f: getfield ry6.n_d F
      // 72: fload 1
      // 73: fcmpl
      // 74: ifle 8e
      // 77: goto 7e
      // 7a: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: fload 1
      // 80: putfield ry6.n_d F
      // 83: iload 3
      // 84: ifne 9d
      // 87: goto 8e
      // 8a: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: goto 96
      // 92: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 95: athrow
      // 96: aload 2
      // 97: getfield ry6.n_d F
      // 9a: putfield ry6.n_d F
      // 9d: return
   }

   public final void lr1(ry6 var1) {
      this.yiu = Math.abs(var1.yiu);
      this.q6o = Math.abs(var1.q6o);
      this.n_d = Math.abs(var1.n_d);
   }

   public final void v89(float param1, float param2) {
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
      // 05: getfield ry6.yiu F
      // 08: fload 2
      // 09: fcmpl
      // 0a: iload 3
      // 0b: ifne 35
      // 0e: ifle 28
      // 11: goto 18
      // 14: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 2
      // 1a: putfield ry6.yiu F
      // 1d: iload 3
      // 1e: ifeq 4f
      // 21: goto 28
      // 24: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield ry6.yiu F
      // 2c: fload 1
      // 2d: fcmpg
      // 2e: goto 35
      // 31: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 34: athrow
      // 35: iload 3
      // 36: ifne 55
      // 39: ifge 4f
      // 3c: goto 43
      // 3f: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 42: athrow
      // 43: aload 0
      // 44: fload 1
      // 45: putfield ry6.yiu F
      // 48: goto 4f
      // 4b: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield ry6.q6o F
      // 53: fload 2
      // 54: fcmpl
      // 55: iload 3
      // 56: ifne 80
      // 59: ifle 73
      // 5c: goto 63
      // 5f: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 0
      // 64: fload 2
      // 65: putfield ry6.q6o F
      // 68: iload 3
      // 69: ifeq 9a
      // 6c: goto 73
      // 6f: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 72: athrow
      // 73: aload 0
      // 74: getfield ry6.q6o F
      // 77: fload 1
      // 78: fcmpg
      // 79: goto 80
      // 7c: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7f: athrow
      // 80: iload 3
      // 81: ifne a0
      // 84: ifge 9a
      // 87: goto 8e
      // 8a: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: fload 1
      // 90: putfield ry6.q6o F
      // 93: goto 9a
      // 96: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield ry6.n_d F
      // 9e: fload 2
      // 9f: fcmpl
      // a0: iload 3
      // a1: ifne d6
      // a4: ifle be
      // a7: goto ae
      // aa: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // ad: athrow
      // ae: aload 0
      // af: fload 2
      // b0: putfield ry6.n_d F
      // b3: iload 3
      // b4: ifeq de
      // b7: goto be
      // ba: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // bd: athrow
      // be: aload 0
      // bf: iload 3
      // c0: ifne da
      // c3: goto ca
      // c6: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c9: athrow
      // ca: getfield ry6.n_d F
      // cd: fload 1
      // ce: fcmpg
      // cf: goto d6
      // d2: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // d5: athrow
      // d6: ifge de
      // d9: aload 0
      // da: fload 1
      // db: putfield ry6.n_d F
      // de: return
   }

   public final void t51(float param1) {
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
      // 05: getfield ry6.yiu F
      // 08: fload 1
      // 09: fcmpg
      // 0a: iload 2
      // 0b: ifeq 2a
      // 0e: ifge 24
      // 11: goto 18
      // 14: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield ry6.yiu F
      // 1d: goto 24
      // 20: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield ry6.q6o F
      // 28: fload 1
      // 29: fcmpg
      // 2a: iload 2
      // 2b: ifeq 55
      // 2e: ifge 44
      // 31: goto 38
      // 34: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: aload 0
      // 39: fload 1
      // 3a: putfield ry6.q6o F
      // 3d: goto 44
      // 40: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: aload 0
      // 45: iload 2
      // 46: ifeq 59
      // 49: getfield ry6.n_d F
      // 4c: fload 1
      // 4d: fcmpg
      // 4e: goto 55
      // 51: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 54: athrow
      // 55: ifge 5d
      // 58: aload 0
      // 59: fload 1
      // 5a: putfield ry6.n_d F
      // 5d: return
   }

   public final void zbl(float param1) {
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
      // 05: getfield ry6.yiu F
      // 08: fload 1
      // 09: fcmpl
      // 0a: iload 2
      // 0b: ifne 2a
      // 0e: ifle 24
      // 11: goto 18
      // 14: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield ry6.yiu F
      // 1d: goto 24
      // 20: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield ry6.q6o F
      // 28: fload 1
      // 29: fcmpl
      // 2a: iload 2
      // 2b: ifne 55
      // 2e: ifle 44
      // 31: goto 38
      // 34: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: aload 0
      // 39: fload 1
      // 3a: putfield ry6.q6o F
      // 3d: goto 44
      // 40: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: aload 0
      // 45: iload 2
      // 46: ifne 59
      // 49: getfield ry6.n_d F
      // 4c: fload 1
      // 4d: fcmpl
      // 4e: goto 55
      // 51: invokestatic ry6.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 54: athrow
      // 55: ifle 5d
      // 58: aload 0
      // 59: fload 1
      // 5a: putfield ry6.n_d F
      // 5d: return
   }

   public final void tya() {
      this.yiu = Math.abs(this.yiu);
      this.q6o = Math.abs(this.q6o);
      this.n_d = Math.abs(this.n_d);
   }

   public final void eqw(ry6 var1, ry6 var2, float var3) {
      this.yiu = (1.0F - var3) * var1.yiu + var3 * var2.yiu;
      this.q6o = (1.0F - var3) * var1.q6o + var3 * var2.q6o;
      this.n_d = (1.0F - var3) * var1.n_d + var3 * var2.n_d;
   }

   public final void mew(ry6 var1, float var2) {
      this.yiu = (1.0F - var2) * this.yiu + var2 * var1.yiu;
      this.q6o = (1.0F - var2) * this.q6o + var2 * var1.q6o;
      this.n_d = (1.0F - var2) * this.n_d + var2 * var1.n_d;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final float _95() {
      return this.yiu;
   }

   public final void rqj(float var1) {
      this.yiu = var1;
   }

   public final float g0g() {
      return this.q6o;
   }

   public final void ygo(float var1) {
      this.q6o = var1;
   }

   public final float w8n() {
      return this.n_d;
   }

   public final void zpg(float var1) {
      this.n_d = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4903717750415151155L, 4556947019066955250L, MethodHandles.lookup().lookupClass()).a(82965441350968L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 30965736830094L;
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
      String var6 = "½\u009f¸_\u008b\u0087\u001f\u008bÄø)K\u0015\u009aé:\u0010fê\u0087Ï\u0081pËr\u0012\u001eA\fm¸Òâ";
      int var8 = "½\u009f¸_\u008b\u0087\u001f\u008bÄø)K\u0015\u009aé:\u0010fê\u0087Ï\u0081pËr\u0012\u001eA\fm¸Òâ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25435;
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
            throw new RuntimeException("ry6", var10);
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
         throw new RuntimeException("ry6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
