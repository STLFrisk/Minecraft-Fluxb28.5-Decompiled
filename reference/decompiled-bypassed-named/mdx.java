import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class mdx implements Serializable, Cloneable {
   public static final long serialVersionUID = 9011180388985266884L;
   public float n7d;
   public float wfr;
   private static final long a;
   private static final String b;

   public mdx(float var1, float var2) {
      this.n7d = var1;
      this.wfr = var2;
   }

   public mdx(float[] var1) {
      this.n7d = var1[0];
      this.wfr = var1[1];
   }

   public mdx(mdx var1) {
      this.n7d = var1.n7d;
      this.wfr = var1.wfr;
   }

   public mdx(jwg var1) {
      this.n7d = (float)var1.q8a;
      this.wfr = (float)var1.pfp;
   }

   public mdx() {
      this.n7d = 0.0F;
      this.wfr = 0.0F;
   }

   public final void _kj(float var1, float var2) {
      this.n7d = var1;
      this.wfr = var2;
   }

   public final void tot(float[] var1) {
      this.n7d = var1[0];
      this.wfr = var1[1];
   }

   public final void ew4(mdx var1) {
      this.n7d = var1.n7d;
      this.wfr = var1.wfr;
   }

   public final void y3w(jwg var1) {
      this.n7d = (float)var1.q8a;
      this.wfr = (float)var1.pfp;
   }

   public final void g80(float[] var1) {
      var1[0] = this.n7d;
      var1[1] = this.wfr;
   }

   public final void nqk(mdx var1, mdx var2) {
      this.n7d = var1.n7d + var2.n7d;
      this.wfr = var1.wfr + var2.wfr;
   }

   public final void h18(mdx var1) {
      this.n7d = this.n7d + var1.n7d;
      this.wfr = this.wfr + var1.wfr;
   }

   public final void qdd(mdx var1, mdx var2) {
      this.n7d = var1.n7d - var2.n7d;
      this.wfr = var1.wfr - var2.wfr;
   }

   public final void k8w(mdx var1) {
      this.n7d = this.n7d - var1.n7d;
      this.wfr = this.wfr - var1.wfr;
   }

   public final void qk_(mdx var1) {
      this.n7d = -var1.n7d;
      this.wfr = -var1.wfr;
   }

   public final void hlz() {
      this.n7d = -this.n7d;
      this.wfr = -this.wfr;
   }

   public final void qcb(float var1, mdx var2) {
      this.n7d = var1 * var2.n7d;
      this.wfr = var1 * var2.wfr;
   }

   public final void rzn(float var1) {
      this.n7d *= var1;
      this.wfr *= var1;
   }

   public final void i2j(float var1, mdx var2, mdx var3) {
      this.n7d = var1 * var2.n7d + var3.n7d;
      this.wfr = var1 * var2.wfr + var3.wfr;
   }

   public final void qlr(float var1, mdx var2) {
      this.n7d = var1 * this.n7d + var2.n7d;
      this.wfr = var1 * this.wfr + var2.wfr;
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.g_p(var1, this.n7d);
      var1 = get.g_p(var1, this.wfr);
      return get.p05(var1);
   }

   public boolean p95(mdx param1) {
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
      // 05: getfield mdx.n7d F
      // 08: aload 1
      // 09: getfield mdx.n7d F
      // 0c: fcmpl
      // 0d: iload 2
      // 0e: ifeq 2b
      // 11: ifne 3d
      // 14: goto 1b
      // 17: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield mdx.wfr F
      // 1f: aload 1
      // 20: getfield mdx.wfr F
      // 23: fcmpl
      // 24: goto 2b
      // 27: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifeq 3a
      // 2f: ifne 3d
      // 32: goto 39
      // 35: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: astore 3
      // 40: bipush 0
      // 41: ireturn
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
      // 05: checkcast mdx
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield mdx.n7d F
      // 0d: aload 3
      // 0e: getfield mdx.n7d F
      // 11: fcmpl
      // 12: iload 2
      // 13: ifne 30
      // 16: ifne 42
      // 19: goto 20
      // 1c: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield mdx.wfr F
      // 24: aload 3
      // 25: getfield mdx.wfr F
      // 28: fcmpl
      // 29: goto 30
      // 2c: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 3f
      // 34: ifne 42
      // 37: goto 3e
      // 3a: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
      // 44: astore 3
      // 45: bipush 0
      // 46: ireturn
      // 47: astore 3
      // 48: bipush 0
      // 49: ireturn
   }

   public boolean bni(mdx param1, float param2) {
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
      // 05: getfield mdx.n7d F
      // 08: aload 1
      // 09: getfield mdx.n7d F
      // 0c: fsub
      // 0d: fstore 4
      // 0f: fload 4
      // 11: invokestatic java/lang/Float.isNaN (F)Z
      // 14: iload 3
      // 15: ifne 37
      // 18: ifeq 28
      // 1b: goto 22
      // 1e: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 21: athrow
      // 22: bipush 0
      // 23: ireturn
      // 24: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: fload 4
      // 2a: iload 3
      // 2b: ifne 44
      // 2e: fconst_0
      // 2f: fcmpg
      // 30: goto 37
      // 33: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 36: athrow
      // 37: ifge 47
      // 3a: fload 4
      // 3c: fneg
      // 3d: goto 44
      // 40: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: goto 49
      // 47: fload 4
      // 49: fload 2
      // 4a: fcmpl
      // 4b: iload 3
      // 4c: ifne 6f
      // 4f: ifle 5f
      // 52: goto 59
      // 55: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 58: athrow
      // 59: bipush 0
      // 5a: ireturn
      // 5b: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield mdx.wfr F
      // 63: aload 1
      // 64: getfield mdx.wfr F
      // 67: fsub
      // 68: fstore 4
      // 6a: fload 4
      // 6c: invokestatic java/lang/Float.isNaN (F)Z
      // 6f: iload 3
      // 70: ifne 92
      // 73: ifeq 83
      // 76: goto 7d
      // 79: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7c: athrow
      // 7d: bipush 0
      // 7e: ireturn
      // 7f: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 82: athrow
      // 83: fload 4
      // 85: iload 3
      // 86: ifne 9f
      // 89: fconst_0
      // 8a: fcmpg
      // 8b: goto 92
      // 8e: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 91: athrow
      // 92: ifge a2
      // 95: fload 4
      // 97: fneg
      // 98: goto 9f
      // 9b: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 9e: athrow
      // 9f: goto a4
      // a2: fload 4
      // a4: fload 2
      // a5: fcmpl
      // a6: iload 3
      // a7: ifne bb
      // aa: ifle ba
      // ad: goto b4
      // b0: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b3: athrow
      // b4: bipush 0
      // b5: ireturn
      // b6: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b9: athrow
      // ba: bipush 1
      // bb: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 7540561034944L;
      return "(" + this.n7d + b + this.wfr + ")";
   }

   public final void dem(float param1, float param2, mdx param3) {
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
      // 06: getfield mdx.n7d F
      // 09: fload 2
      // 0a: fcmpl
      // 0b: iload 4
      // 0d: ifeq 44
      // 10: ifle 2b
      // 13: goto 1a
      // 16: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: fload 2
      // 1c: putfield mdx.n7d F
      // 1f: iload 4
      // 21: ifne 67
      // 24: goto 2b
      // 27: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: aload 3
      // 2c: iload 4
      // 2e: ifeq 60
      // 31: goto 38
      // 34: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: getfield mdx.n7d F
      // 3b: fload 1
      // 3c: fcmpg
      // 3d: goto 44
      // 40: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: ifge 58
      // 47: aload 0
      // 48: fload 1
      // 49: putfield mdx.n7d F
      // 4c: iload 4
      // 4e: ifne 67
      // 51: goto 58
      // 54: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 57: athrow
      // 58: aload 0
      // 59: goto 60
      // 5c: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: aload 3
      // 61: getfield mdx.n7d F
      // 64: putfield mdx.n7d F
      // 67: aload 3
      // 68: getfield mdx.wfr F
      // 6b: fload 2
      // 6c: fcmpl
      // 6d: iload 4
      // 6f: ifeq a6
      // 72: ifle 8d
      // 75: goto 7c
      // 78: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: fload 2
      // 7e: putfield mdx.wfr F
      // 81: iload 4
      // 83: ifne c9
      // 86: goto 8d
      // 89: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8c: athrow
      // 8d: aload 3
      // 8e: iload 4
      // 90: ifeq c2
      // 93: goto 9a
      // 96: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 99: athrow
      // 9a: getfield mdx.wfr F
      // 9d: fload 1
      // 9e: fcmpg
      // 9f: goto a6
      // a2: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a5: athrow
      // a6: ifge ba
      // a9: aload 0
      // aa: fload 1
      // ab: putfield mdx.wfr F
      // ae: iload 4
      // b0: ifne c9
      // b3: goto ba
      // b6: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b9: athrow
      // ba: aload 0
      // bb: goto c2
      // be: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c1: athrow
      // c2: aload 3
      // c3: getfield mdx.wfr F
      // c6: putfield mdx.wfr F
      // c9: return
   }

   public final void xr7(float param1, mdx param2) {
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
      // 09: getfield mdx.n7d F
      // 0c: fload 1
      // 0d: fcmpg
      // 0e: ifge 28
      // 11: goto 18
      // 14: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield mdx.n7d F
      // 1d: iload 3
      // 1e: ifne 37
      // 21: goto 28
      // 24: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: aload 2
      // 31: getfield mdx.n7d F
      // 34: putfield mdx.n7d F
      // 37: aload 2
      // 38: iload 3
      // 39: ifeq 63
      // 3c: getfield mdx.wfr F
      // 3f: fload 1
      // 40: fcmpg
      // 41: ifge 5b
      // 44: goto 4b
      // 47: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: fload 1
      // 4d: putfield mdx.wfr F
      // 50: iload 3
      // 51: ifne 6a
      // 54: goto 5b
      // 57: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 2
      // 64: getfield mdx.wfr F
      // 67: putfield mdx.wfr F
      // 6a: return
   }

   public final void e_z(float param1, mdx param2) {
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
      // 09: getfield mdx.n7d F
      // 0c: fload 1
      // 0d: fcmpl
      // 0e: ifle 28
      // 11: goto 18
      // 14: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield mdx.n7d F
      // 1d: iload 3
      // 1e: ifeq 37
      // 21: goto 28
      // 24: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: aload 2
      // 31: getfield mdx.n7d F
      // 34: putfield mdx.n7d F
      // 37: aload 2
      // 38: iload 3
      // 39: ifne 63
      // 3c: getfield mdx.wfr F
      // 3f: fload 1
      // 40: fcmpl
      // 41: ifle 5b
      // 44: goto 4b
      // 47: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: fload 1
      // 4d: putfield mdx.wfr F
      // 50: iload 3
      // 51: ifeq 6a
      // 54: goto 5b
      // 57: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 2
      // 64: getfield mdx.wfr F
      // 67: putfield mdx.wfr F
      // 6a: return
   }

   public final void kwx(mdx var1) {
      this.n7d = Math.abs(var1.n7d);
      this.wfr = Math.abs(var1.wfr);
   }

   public final void lxk(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield mdx.n7d F
      // 08: fload 2
      // 09: fcmpl
      // 0a: iload 3
      // 0b: ifeq 35
      // 0e: ifle 28
      // 11: goto 18
      // 14: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 2
      // 1a: putfield mdx.n7d F
      // 1d: iload 3
      // 1e: ifne 4f
      // 21: goto 28
      // 24: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield mdx.n7d F
      // 2c: fload 1
      // 2d: fcmpg
      // 2e: goto 35
      // 31: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 34: athrow
      // 35: iload 3
      // 36: ifeq 55
      // 39: ifge 4f
      // 3c: goto 43
      // 3f: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 42: athrow
      // 43: aload 0
      // 44: fload 1
      // 45: putfield mdx.n7d F
      // 48: goto 4f
      // 4b: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield mdx.wfr F
      // 53: fload 2
      // 54: fcmpl
      // 55: iload 3
      // 56: ifeq 8b
      // 59: ifle 73
      // 5c: goto 63
      // 5f: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 0
      // 64: fload 2
      // 65: putfield mdx.wfr F
      // 68: iload 3
      // 69: ifne 93
      // 6c: goto 73
      // 6f: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 72: athrow
      // 73: aload 0
      // 74: iload 3
      // 75: ifeq 8f
      // 78: goto 7f
      // 7b: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7e: athrow
      // 7f: getfield mdx.wfr F
      // 82: fload 1
      // 83: fcmpg
      // 84: goto 8b
      // 87: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8a: athrow
      // 8b: ifge 93
      // 8e: aload 0
      // 8f: fload 1
      // 90: putfield mdx.wfr F
      // 93: return
   }

   public final void w29(float param1) {
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
      // 05: getfield mdx.n7d F
      // 08: fload 1
      // 09: fcmpg
      // 0a: iload 2
      // 0b: ifeq 35
      // 0e: ifge 24
      // 11: goto 18
      // 14: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield mdx.n7d F
      // 1d: goto 24
      // 20: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: iload 2
      // 26: ifeq 39
      // 29: getfield mdx.wfr F
      // 2c: fload 1
      // 2d: fcmpg
      // 2e: goto 35
      // 31: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 34: athrow
      // 35: ifge 3d
      // 38: aload 0
      // 39: fload 1
      // 3a: putfield mdx.wfr F
      // 3d: return
   }

   public final void bfl(float param1) {
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
      // 05: getfield mdx.n7d F
      // 08: fload 1
      // 09: fcmpl
      // 0a: iload 2
      // 0b: ifne 35
      // 0e: ifle 24
      // 11: goto 18
      // 14: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield mdx.n7d F
      // 1d: goto 24
      // 20: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: iload 2
      // 26: ifne 39
      // 29: getfield mdx.wfr F
      // 2c: fload 1
      // 2d: fcmpl
      // 2e: goto 35
      // 31: invokestatic mdx.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 34: athrow
      // 35: ifle 3d
      // 38: aload 0
      // 39: fload 1
      // 3a: putfield mdx.wfr F
      // 3d: return
   }

   public final void cvq() {
      this.n7d = Math.abs(this.n7d);
      this.wfr = Math.abs(this.wfr);
   }

   public final void j2w(mdx var1, mdx var2, float var3) {
      this.n7d = (1.0F - var3) * var1.n7d + var3 * var2.n7d;
      this.wfr = (1.0F - var3) * var1.wfr + var3 * var2.wfr;
   }

   public final void kns(mdx var1, float var2) {
      this.n7d = (1.0F - var2) * this.n7d + var2 * var1.n7d;
      this.wfr = (1.0F - var2) * this.wfr + var2 * var1.wfr;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final float t20() {
      return this.n7d;
   }

   public final void wus(float var1) {
      this.n7d = var1;
   }

   public final float gvv() {
      return this.wfr;
   }

   public final void bi0(float var1) {
      this.wfr = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2131486065356621163L, -8538638875329704212L, MethodHandles.lookup().lookupClass()).a(191864444852854L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 24942127154946L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("QÊX#>Û\u0088ê".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
