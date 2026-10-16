import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class jwg implements Serializable, Cloneable {
   public static final long serialVersionUID = 6205762482756093838L;
   public double q8a;
   public double pfp;
   private static final long a;
   private static final String b;

   public jwg(double var1, double var3) {
      this.q8a = var1;
      this.pfp = var3;
   }

   public jwg(double[] var1) {
      this.q8a = var1[0];
      this.pfp = var1[1];
   }

   public jwg(jwg var1) {
      this.q8a = var1.q8a;
      this.pfp = var1.pfp;
   }

   public jwg(mdx var1) {
      this.q8a = (double)var1.n7d;
      this.pfp = (double)var1.wfr;
   }

   public jwg() {
      this.q8a = 0.0;
      this.pfp = 0.0;
   }

   public final void z35(double var1, double var3) {
      this.q8a = var1;
      this.pfp = var3;
   }

   public final void leg(double[] var1) {
      this.q8a = var1[0];
      this.pfp = var1[1];
   }

   public final void yn0(jwg var1) {
      this.q8a = var1.q8a;
      this.pfp = var1.pfp;
   }

   public final void tj5(mdx var1) {
      this.q8a = (double)var1.n7d;
      this.pfp = (double)var1.wfr;
   }

   public final void p34(double[] var1) {
      var1[0] = this.q8a;
      var1[1] = this.pfp;
   }

   public final void s1v(jwg var1, jwg var2) {
      this.q8a = var1.q8a + var2.q8a;
      this.pfp = var1.pfp + var2.pfp;
   }

   public final void jzo(jwg var1) {
      this.q8a = this.q8a + var1.q8a;
      this.pfp = this.pfp + var1.pfp;
   }

   public final void vzt(jwg var1, jwg var2) {
      this.q8a = var1.q8a - var2.q8a;
      this.pfp = var1.pfp - var2.pfp;
   }

   public final void skb(jwg var1) {
      this.q8a = this.q8a - var1.q8a;
      this.pfp = this.pfp - var1.pfp;
   }

   public final void wb3(jwg var1) {
      this.q8a = -var1.q8a;
      this.pfp = -var1.pfp;
   }

   public final void lcf() {
      this.q8a = -this.q8a;
      this.pfp = -this.pfp;
   }

   public final void tfc(double var1, jwg var3) {
      this.q8a = var1 * var3.q8a;
      this.pfp = var1 * var3.pfp;
   }

   public final void hkq(double var1) {
      this.q8a *= var1;
      this.pfp *= var1;
   }

   public final void zrj(double var1, jwg var3, jwg var4) {
      this.q8a = var1 * var3.q8a + var4.q8a;
      this.pfp = var1 * var3.pfp + var4.pfp;
   }

   public final void vi2(double var1, jwg var3) {
      this.q8a = var1 * this.q8a + var3.q8a;
      this.pfp = var1 * this.pfp + var3.pfp;
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.mql(var1, this.q8a);
      var1 = get.mql(var1, this.pfp);
      return get.p05(var1);
   }

   public boolean fjf(jwg param1) {
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
      // 05: getfield jwg.q8a D
      // 08: aload 1
      // 09: getfield jwg.q8a D
      // 0c: dcmpl
      // 0d: iload 2
      // 0e: ifeq 2b
      // 11: ifne 3d
      // 14: goto 1b
      // 17: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield jwg.pfp D
      // 1f: aload 1
      // 20: getfield jwg.pfp D
      // 23: dcmpl
      // 24: goto 2b
      // 27: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifeq 3a
      // 2f: ifne 3d
      // 32: goto 39
      // 35: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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
      // 05: checkcast jwg
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield jwg.q8a D
      // 0d: aload 3
      // 0e: getfield jwg.q8a D
      // 11: dcmpl
      // 12: iload 2
      // 13: ifne 30
      // 16: ifne 42
      // 19: goto 20
      // 1c: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield jwg.pfp D
      // 24: aload 3
      // 25: getfield jwg.pfp D
      // 28: dcmpl
      // 29: goto 30
      // 2c: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 3f
      // 34: ifne 42
      // 37: goto 3e
      // 3a: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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

   public boolean jj4(jwg param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield jwg.q8a D
      // 09: aload 1
      // 0a: getfield jwg.q8a D
      // 0d: dsub
      // 0e: dstore 5
      // 10: dload 5
      // 12: invokestatic java/lang/Double.isNaN (D)Z
      // 15: iload 4
      // 17: ifne 3a
      // 1a: ifeq 2a
      // 1d: goto 24
      // 20: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: bipush 0
      // 25: ireturn
      // 26: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 29: athrow
      // 2a: dload 5
      // 2c: iload 4
      // 2e: ifne 47
      // 31: dconst_0
      // 32: dcmpg
      // 33: goto 3a
      // 36: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 39: athrow
      // 3a: ifge 4a
      // 3d: dload 5
      // 3f: dneg
      // 40: goto 47
      // 43: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 46: athrow
      // 47: goto 4c
      // 4a: dload 5
      // 4c: dload 2
      // 4d: dcmpl
      // 4e: iload 4
      // 50: ifne 73
      // 53: ifle 63
      // 56: goto 5d
      // 59: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 0
      // 64: getfield jwg.pfp D
      // 67: aload 1
      // 68: getfield jwg.pfp D
      // 6b: dsub
      // 6c: dstore 5
      // 6e: dload 5
      // 70: invokestatic java/lang/Double.isNaN (D)Z
      // 73: iload 4
      // 75: ifne 98
      // 78: ifeq 88
      // 7b: goto 82
      // 7e: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
      // 84: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 87: athrow
      // 88: dload 5
      // 8a: iload 4
      // 8c: ifne a5
      // 8f: dconst_0
      // 90: dcmpg
      // 91: goto 98
      // 94: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 97: athrow
      // 98: ifge a8
      // 9b: dload 5
      // 9d: dneg
      // 9e: goto a5
      // a1: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a4: athrow
      // a5: goto aa
      // a8: dload 5
      // aa: dload 2
      // ab: dcmpl
      // ac: iload 4
      // ae: ifne c2
      // b1: ifle c1
      // b4: goto bb
      // b7: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // ba: athrow
      // bb: bipush 0
      // bc: ireturn
      // bd: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c0: athrow
      // c1: bipush 1
      // c2: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 33099781948458L;
      return "(" + this.q8a + b + this.pfp + ")";
   }

   public final void trv(double param1, double param3, jwg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 5
      // 07: getfield jwg.q8a D
      // 0a: dload 3
      // 0b: dcmpl
      // 0c: iload 6
      // 0e: ifne 46
      // 11: ifle 2c
      // 14: goto 1b
      // 17: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: dload 3
      // 1d: putfield jwg.q8a D
      // 20: iload 6
      // 22: ifeq 6a
      // 25: goto 2c
      // 28: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2b: athrow
      // 2c: aload 5
      // 2e: iload 6
      // 30: ifne 62
      // 33: goto 3a
      // 36: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 39: athrow
      // 3a: getfield jwg.q8a D
      // 3d: dload 1
      // 3e: dcmpg
      // 3f: goto 46
      // 42: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 45: athrow
      // 46: ifge 5a
      // 49: aload 0
      // 4a: dload 1
      // 4b: putfield jwg.q8a D
      // 4e: iload 6
      // 50: ifeq 6a
      // 53: goto 5a
      // 56: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 59: athrow
      // 5a: aload 0
      // 5b: goto 62
      // 5e: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 61: athrow
      // 62: aload 5
      // 64: getfield jwg.q8a D
      // 67: putfield jwg.q8a D
      // 6a: aload 5
      // 6c: getfield jwg.pfp D
      // 6f: dload 3
      // 70: dcmpl
      // 71: iload 6
      // 73: ifne ab
      // 76: ifle 91
      // 79: goto 80
      // 7c: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7f: athrow
      // 80: aload 0
      // 81: dload 3
      // 82: putfield jwg.pfp D
      // 85: iload 6
      // 87: ifeq cf
      // 8a: goto 91
      // 8d: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 90: athrow
      // 91: aload 5
      // 93: iload 6
      // 95: ifne c7
      // 98: goto 9f
      // 9b: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 9e: athrow
      // 9f: getfield jwg.pfp D
      // a2: dload 1
      // a3: dcmpg
      // a4: goto ab
      // a7: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // aa: athrow
      // ab: ifge bf
      // ae: aload 0
      // af: dload 1
      // b0: putfield jwg.pfp D
      // b3: iload 6
      // b5: ifeq cf
      // b8: goto bf
      // bb: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // be: athrow
      // bf: aload 0
      // c0: goto c7
      // c3: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c6: athrow
      // c7: aload 5
      // c9: getfield jwg.pfp D
      // cc: putfield jwg.pfp D
      // cf: return
   }

   public final void tie(double param1, jwg param3) {
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
      // 0b: getfield jwg.q8a D
      // 0e: dload 1
      // 0f: dcmpg
      // 10: ifge 2b
      // 13: goto 1a
      // 16: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 1
      // 1c: putfield jwg.q8a D
      // 1f: iload 4
      // 21: ifne 3a
      // 24: goto 2b
      // 27: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: aload 3
      // 34: getfield jwg.q8a D
      // 37: putfield jwg.q8a D
      // 3a: aload 3
      // 3b: iload 4
      // 3d: ifeq 68
      // 40: getfield jwg.pfp D
      // 43: dload 1
      // 44: dcmpg
      // 45: ifge 60
      // 48: goto 4f
      // 4b: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 1
      // 51: putfield jwg.pfp D
      // 54: iload 4
      // 56: ifne 6f
      // 59: goto 60
      // 5c: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: aload 3
      // 69: getfield jwg.pfp D
      // 6c: putfield jwg.pfp D
      // 6f: return
   }

   public final void n2w(double param1, jwg param3) {
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
      // 0b: getfield jwg.q8a D
      // 0e: dload 1
      // 0f: dcmpl
      // 10: ifle 2b
      // 13: goto 1a
      // 16: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 1
      // 1c: putfield jwg.q8a D
      // 1f: iload 4
      // 21: ifne 3a
      // 24: goto 2b
      // 27: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: aload 3
      // 34: getfield jwg.q8a D
      // 37: putfield jwg.q8a D
      // 3a: aload 3
      // 3b: iload 4
      // 3d: ifeq 68
      // 40: getfield jwg.pfp D
      // 43: dload 1
      // 44: dcmpl
      // 45: ifle 60
      // 48: goto 4f
      // 4b: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 1
      // 51: putfield jwg.pfp D
      // 54: iload 4
      // 56: ifne 6f
      // 59: goto 60
      // 5c: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: aload 3
      // 69: getfield jwg.pfp D
      // 6c: putfield jwg.pfp D
      // 6f: return
   }

   public final void qws(jwg var1) {
      this.q8a = Math.abs(var1.q8a);
      this.pfp = Math.abs(var1.pfp);
   }

   public final void uvc(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: getfield jwg.q8a D
      // 09: dload 3
      // 0a: dcmpl
      // 0b: iload 5
      // 0d: ifeq 38
      // 10: ifle 2b
      // 13: goto 1a
      // 16: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: dload 3
      // 1c: putfield jwg.q8a D
      // 1f: iload 5
      // 21: ifne 53
      // 24: goto 2b
      // 27: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield jwg.q8a D
      // 2f: dload 1
      // 30: dcmpg
      // 31: goto 38
      // 34: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: iload 5
      // 3a: ifeq 59
      // 3d: ifge 53
      // 40: goto 47
      // 43: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 46: athrow
      // 47: aload 0
      // 48: dload 1
      // 49: putfield jwg.q8a D
      // 4c: goto 53
      // 4f: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 52: athrow
      // 53: aload 0
      // 54: getfield jwg.pfp D
      // 57: dload 3
      // 58: dcmpl
      // 59: iload 5
      // 5b: ifeq 92
      // 5e: ifle 79
      // 61: goto 68
      // 64: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: aload 0
      // 69: dload 3
      // 6a: putfield jwg.pfp D
      // 6d: iload 5
      // 6f: ifne 9a
      // 72: goto 79
      // 75: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 78: athrow
      // 79: aload 0
      // 7a: iload 5
      // 7c: ifeq 96
      // 7f: goto 86
      // 82: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 85: athrow
      // 86: getfield jwg.pfp D
      // 89: dload 1
      // 8a: dcmpg
      // 8b: goto 92
      // 8e: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 91: athrow
      // 92: ifge 9a
      // 95: aload 0
      // 96: dload 1
      // 97: putfield jwg.pfp D
      // 9a: return
   }

   public final void ky3(double param1) {
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
      // 05: getfield jwg.q8a D
      // 08: dload 1
      // 09: dcmpg
      // 0a: iload 3
      // 0b: ifeq 35
      // 0e: ifge 24
      // 11: goto 18
      // 14: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: dload 1
      // 1a: putfield jwg.q8a D
      // 1d: goto 24
      // 20: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: iload 3
      // 26: ifeq 39
      // 29: getfield jwg.pfp D
      // 2c: dload 1
      // 2d: dcmpg
      // 2e: goto 35
      // 31: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 34: athrow
      // 35: ifge 3d
      // 38: aload 0
      // 39: dload 1
      // 3a: putfield jwg.pfp D
      // 3d: return
   }

   public final void gor(double param1) {
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
      // 05: getfield jwg.q8a D
      // 08: dload 1
      // 09: dcmpl
      // 0a: iload 3
      // 0b: ifne 35
      // 0e: ifle 24
      // 11: goto 18
      // 14: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: dload 1
      // 1a: putfield jwg.q8a D
      // 1d: goto 24
      // 20: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: iload 3
      // 26: ifne 39
      // 29: getfield jwg.pfp D
      // 2c: dload 1
      // 2d: dcmpl
      // 2e: goto 35
      // 31: invokestatic jwg.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 34: athrow
      // 35: ifle 3d
      // 38: aload 0
      // 39: dload 1
      // 3a: putfield jwg.pfp D
      // 3d: return
   }

   public final void o_n() {
      this.q8a = Math.abs(this.q8a);
      this.pfp = Math.abs(this.pfp);
   }

   public final void di6(jwg var1, jwg var2, double var3) {
      this.q8a = (1.0 - var3) * var1.q8a + var3 * var2.q8a;
      this.pfp = (1.0 - var3) * var1.pfp + var3 * var2.pfp;
   }

   public final void ur6(jwg var1, double var2) {
      this.q8a = (1.0 - var2) * this.q8a + var2 * var1.q8a;
      this.pfp = (1.0 - var2) * this.pfp + var2 * var1.pfp;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final double tkg() {
      return this.q8a;
   }

   public final void _qi(double var1) {
      this.q8a = var1;
   }

   public final double nxi() {
      return this.pfp;
   }

   public final void nzu(double var1) {
      this.pfp = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4231839066864497981L, 7122584858309454315L, MethodHandles.lookup().lookupClass()).a(37715149114223L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 18774734246816L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("»B´ëÈ\u007f\u0017Õ".getBytes("ISO-8859-1"));
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
