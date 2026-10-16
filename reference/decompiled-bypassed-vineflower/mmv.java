import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class mmv implements Serializable, Cloneable {
   public static final long serialVersionUID = -3555701650170169638L;
   public int xxy;
   public int dzo;
   private static final long a;
   private static final String b;

   public mmv(int var1, int var2) {
      this.xxy = var1;
      this.dzo = var2;
   }

   public mmv(int[] var1) {
      this.xxy = var1[0];
      this.dzo = var1[1];
   }

   public mmv(mmv var1) {
      this.xxy = var1.xxy;
      this.dzo = var1.dzo;
   }

   public mmv() {
      this.xxy = 0;
      this.dzo = 0;
   }

   public final void qan(int var1, int var2) {
      this.xxy = var1;
      this.dzo = var2;
   }

   public final void gdi(int[] var1) {
      this.xxy = var1[0];
      this.dzo = var1[1];
   }

   public final void z2u(mmv var1) {
      this.xxy = var1.xxy;
      this.dzo = var1.dzo;
   }

   public final void uvh(int[] var1) {
      var1[0] = this.xxy;
      var1[1] = this.dzo;
   }

   public final void soa(mmv var1) {
      var1.xxy = this.xxy;
      var1.dzo = this.dzo;
   }

   public final void dm7(mmv var1, mmv var2) {
      this.xxy = var1.xxy + var2.xxy;
      this.dzo = var1.dzo + var2.dzo;
   }

   public final void pue(mmv var1) {
      this.xxy = this.xxy + var1.xxy;
      this.dzo = this.dzo + var1.dzo;
   }

   public final void bv7(mmv var1, mmv var2) {
      this.xxy = var1.xxy - var2.xxy;
      this.dzo = var1.dzo - var2.dzo;
   }

   public final void o0d(mmv var1) {
      this.xxy = this.xxy - var1.xxy;
      this.dzo = this.dzo - var1.dzo;
   }

   public final void r4a(mmv var1) {
      this.xxy = -var1.xxy;
      this.dzo = -var1.dzo;
   }

   public final void ykt() {
      this.xxy = -this.xxy;
      this.dzo = -this.dzo;
   }

   public final void h__(int var1, mmv var2) {
      this.xxy = var1 * var2.xxy;
      this.dzo = var1 * var2.dzo;
   }

   public final void bpt(int var1) {
      this.xxy *= var1;
      this.dzo *= var1;
   }

   public final void i2x(int var1, mmv var2, mmv var3) {
      this.xxy = var1 * var2.xxy + var3.xxy;
      this.dzo = var1 * var2.dzo + var3.dzo;
   }

   public final void w05(int var1, mmv var2) {
      this.xxy = var1 * this.xxy + var2.xxy;
      this.dzo = var1 * this.dzo + var2.dzo;
   }

   @Override
   public String toString() {
      long var1 = a ^ 15720511945584L;
      return "(" + this.xxy + b + this.dzo + ")";
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: checkcast mmv
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield mmv.xxy I
      // 0d: aload 3
      // 0e: getfield mmv.xxy I
      // 11: iload 2
      // 12: ifeq 39
      // 15: if_icmpne 40
      // 18: goto 1f
      // 1b: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield mmv.dzo I
      // 23: iload 2
      // 24: ifeq 3d
      // 27: goto 2e
      // 2a: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2d: athrow
      // 2e: aload 3
      // 2f: getfield mmv.dzo I
      // 32: goto 39
      // 35: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 38: athrow
      // 39: if_icmpne 40
      // 3c: bipush 1
      // 3d: goto 41
      // 40: bipush 0
      // 41: ireturn
      // 42: astore 3
      // 43: bipush 0
      // 44: ireturn
      // 45: astore 3
      // 46: bipush 0
      // 47: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = 31L * var1 + (long)this.xxy;
      var1 = 31L * var1 + (long)this.dzo;
      return (int)(var1 ^ var1 >> 32);
   }

   public final void q8_(int param1, int param2, mmv param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: getfield mmv.xxy I
      // 09: iload 2
      // 0a: iload 4
      // 0c: ifne 42
      // 0f: if_icmple 2a
      // 12: goto 19
      // 15: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: putfield mmv.xxy I
      // 1e: iload 4
      // 20: ifeq 65
      // 23: goto 2a
      // 26: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 29: athrow
      // 2a: aload 3
      // 2b: iload 4
      // 2d: ifne 5e
      // 30: goto 37
      // 33: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 36: athrow
      // 37: getfield mmv.xxy I
      // 3a: iload 1
      // 3b: goto 42
      // 3e: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 41: athrow
      // 42: if_icmpge 56
      // 45: aload 0
      // 46: iload 1
      // 47: putfield mmv.xxy I
      // 4a: iload 4
      // 4c: ifeq 65
      // 4f: goto 56
      // 52: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 55: athrow
      // 56: aload 0
      // 57: goto 5e
      // 5a: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5d: athrow
      // 5e: aload 3
      // 5f: getfield mmv.xxy I
      // 62: putfield mmv.xxy I
      // 65: aload 3
      // 66: getfield mmv.dzo I
      // 69: iload 2
      // 6a: iload 4
      // 6c: ifne a2
      // 6f: if_icmple 8a
      // 72: goto 79
      // 75: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 78: athrow
      // 79: aload 0
      // 7a: iload 2
      // 7b: putfield mmv.dzo I
      // 7e: iload 4
      // 80: ifeq c5
      // 83: goto 8a
      // 86: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 89: athrow
      // 8a: aload 3
      // 8b: iload 4
      // 8d: ifne be
      // 90: goto 97
      // 93: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 96: athrow
      // 97: getfield mmv.dzo I
      // 9a: iload 1
      // 9b: goto a2
      // 9e: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a1: athrow
      // a2: if_icmpge b6
      // a5: aload 0
      // a6: iload 1
      // a7: putfield mmv.dzo I
      // aa: iload 4
      // ac: ifeq c5
      // af: goto b6
      // b2: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b5: athrow
      // b6: aload 0
      // b7: goto be
      // ba: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // bd: athrow
      // be: aload 3
      // bf: getfield mmv.dzo I
      // c2: putfield mmv.dzo I
      // c5: return
   }

   public final void r9z(int param1, mmv param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 2f
      // 09: getfield mmv.xxy I
      // 0c: iload 1
      // 0d: if_icmpge 27
      // 10: goto 17
      // 13: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield mmv.xxy I
      // 1c: iload 3
      // 1d: ifne 36
      // 20: goto 27
      // 23: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 26: athrow
      // 27: aload 0
      // 28: goto 2f
      // 2b: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2e: athrow
      // 2f: aload 2
      // 30: getfield mmv.xxy I
      // 33: putfield mmv.xxy I
      // 36: aload 2
      // 37: iload 3
      // 38: ifeq 61
      // 3b: getfield mmv.dzo I
      // 3e: iload 1
      // 3f: if_icmpge 59
      // 42: goto 49
      // 45: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: aload 0
      // 4a: iload 1
      // 4b: putfield mmv.dzo I
      // 4e: iload 3
      // 4f: ifne 68
      // 52: goto 59
      // 55: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 58: athrow
      // 59: aload 0
      // 5a: goto 61
      // 5d: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 60: athrow
      // 61: aload 2
      // 62: getfield mmv.dzo I
      // 65: putfield mmv.dzo I
      // 68: return
   }

   public final void px0(int param1, mmv param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 2f
      // 09: getfield mmv.xxy I
      // 0c: iload 1
      // 0d: if_icmple 27
      // 10: goto 17
      // 13: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield mmv.xxy I
      // 1c: iload 3
      // 1d: ifeq 36
      // 20: goto 27
      // 23: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 26: athrow
      // 27: aload 0
      // 28: goto 2f
      // 2b: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2e: athrow
      // 2f: aload 2
      // 30: getfield mmv.xxy I
      // 33: putfield mmv.xxy I
      // 36: aload 2
      // 37: iload 3
      // 38: ifne 61
      // 3b: getfield mmv.dzo I
      // 3e: iload 1
      // 3f: if_icmple 59
      // 42: goto 49
      // 45: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: aload 0
      // 4a: iload 1
      // 4b: putfield mmv.dzo I
      // 4e: iload 3
      // 4f: ifeq 68
      // 52: goto 59
      // 55: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 58: athrow
      // 59: aload 0
      // 5a: goto 61
      // 5d: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 60: athrow
      // 61: aload 2
      // 62: getfield mmv.dzo I
      // 65: putfield mmv.dzo I
      // 68: return
   }

   public final void _ti(mmv var1) {
      this.xxy = Math.abs(var1.xxy);
      this.dzo = Math.abs(var1.dzo);
   }

   public final void hrc(int param1, int param2) {
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
      // 05: getfield mmv.xxy I
      // 08: iload 2
      // 09: iload 3
      // 0a: ifne 33
      // 0d: if_icmple 27
      // 10: goto 17
      // 13: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 2
      // 19: putfield mmv.xxy I
      // 1c: iload 3
      // 1d: ifeq 4d
      // 20: goto 27
      // 23: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 26: athrow
      // 27: aload 0
      // 28: getfield mmv.xxy I
      // 2b: iload 1
      // 2c: goto 33
      // 2f: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: iload 3
      // 34: ifne 52
      // 37: if_icmpge 4d
      // 3a: goto 41
      // 3d: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 40: athrow
      // 41: aload 0
      // 42: iload 1
      // 43: putfield mmv.xxy I
      // 46: goto 4d
      // 49: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield mmv.dzo I
      // 51: iload 2
      // 52: iload 3
      // 53: ifne 87
      // 56: if_icmple 70
      // 59: goto 60
      // 5c: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: aload 0
      // 61: iload 2
      // 62: putfield mmv.dzo I
      // 65: iload 3
      // 66: ifeq 8f
      // 69: goto 70
      // 6c: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6f: athrow
      // 70: aload 0
      // 71: iload 3
      // 72: ifne 8b
      // 75: goto 7c
      // 78: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7b: athrow
      // 7c: getfield mmv.dzo I
      // 7f: iload 1
      // 80: goto 87
      // 83: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 86: athrow
      // 87: if_icmpge 8f
      // 8a: aload 0
      // 8b: iload 1
      // 8c: putfield mmv.dzo I
      // 8f: return
   }

   public final void i65(int param1) {
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
      // 05: getfield mmv.xxy I
      // 08: iload 1
      // 09: iload 2
      // 0a: ifne 33
      // 0d: if_icmpge 23
      // 10: goto 17
      // 13: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield mmv.xxy I
      // 1c: goto 23
      // 1f: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 22: athrow
      // 23: aload 0
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield mmv.dzo I
      // 2b: iload 1
      // 2c: goto 33
      // 2f: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: if_icmpge 3b
      // 36: aload 0
      // 37: iload 1
      // 38: putfield mmv.dzo I
      // 3b: return
   }

   public final void prd(int param1) {
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
      // 05: getfield mmv.xxy I
      // 08: iload 1
      // 09: iload 2
      // 0a: ifeq 33
      // 0d: if_icmple 23
      // 10: goto 17
      // 13: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield mmv.xxy I
      // 1c: goto 23
      // 1f: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 22: athrow
      // 23: aload 0
      // 24: iload 2
      // 25: ifeq 37
      // 28: getfield mmv.dzo I
      // 2b: iload 1
      // 2c: goto 33
      // 2f: invokestatic mmv.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: if_icmple 3b
      // 36: aload 0
      // 37: iload 1
      // 38: putfield mmv.dzo I
      // 3b: return
   }

   public final void rr_() {
      this.xxy = Math.abs(this.xxy);
      this.dzo = Math.abs(this.dzo);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final int r4l() {
      return this.xxy;
   }

   public final void sqt(int var1) {
      this.xxy = var1;
   }

   public final int ieu() {
      return this.dzo;
   }

   public final void syt(int var1) {
      this.dzo = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-772280014533373690L, 2594405530817956996L, MethodHandles.lookup().lookupClass()).a(142712561692565L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51066511670263L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Û\u0085î.ðPk'".getBytes("ISO-8859-1"));
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
