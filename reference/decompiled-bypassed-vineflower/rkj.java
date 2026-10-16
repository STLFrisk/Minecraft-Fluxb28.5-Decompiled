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

public abstract class rkj implements Serializable, Cloneable {
   public static final long serialVersionUID = 7068460319248845763L;
   public float hp2;
   public float nc_;
   public float ax5;
   public float ck3;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public rkj(float var1, float var2, float var3, float var4) {
      this.hp2 = var1;
      this.nc_ = var2;
      this.ax5 = var3;
      this.ck3 = var4;
   }

   public rkj(float[] var1) {
      this.hp2 = var1[0];
      this.nc_ = var1[1];
      this.ax5 = var1[2];
      this.ck3 = var1[3];
   }

   public rkj(rkj var1) {
      this.hp2 = var1.hp2;
      this.nc_ = var1.nc_;
      this.ax5 = var1.ax5;
      this.ck3 = var1.ck3;
   }

   public rkj(xv0 var1) {
      this.hp2 = (float)var1.yme;
      this.nc_ = (float)var1.pf8;
      this.ax5 = (float)var1.jfe;
      this.ck3 = (float)var1.ggc;
   }

   public rkj() {
      this.hp2 = 0.0F;
      this.nc_ = 0.0F;
      this.ax5 = 0.0F;
      this.ck3 = 0.0F;
   }

   public final void dj4(float var1, float var2, float var3, float var4) {
      this.hp2 = var1;
      this.nc_ = var2;
      this.ax5 = var3;
      this.ck3 = var4;
   }

   public final void nmo(float[] var1) {
      this.hp2 = var1[0];
      this.nc_ = var1[1];
      this.ax5 = var1[2];
      this.ck3 = var1[3];
   }

   public final void fum(rkj var1) {
      this.hp2 = var1.hp2;
      this.nc_ = var1.nc_;
      this.ax5 = var1.ax5;
      this.ck3 = var1.ck3;
   }

   public final void wh_(xv0 var1) {
      this.hp2 = (float)var1.yme;
      this.nc_ = (float)var1.pf8;
      this.ax5 = (float)var1.jfe;
      this.ck3 = (float)var1.ggc;
   }

   public final void _pn(float[] var1) {
      var1[0] = this.hp2;
      var1[1] = this.nc_;
      var1[2] = this.ax5;
      var1[3] = this.ck3;
   }

   public final void qep(rkj var1) {
      var1.hp2 = this.hp2;
      var1.nc_ = this.nc_;
      var1.ax5 = this.ax5;
      var1.ck3 = this.ck3;
   }

   public final void f5g(rkj var1, rkj var2) {
      this.hp2 = var1.hp2 + var2.hp2;
      this.nc_ = var1.nc_ + var2.nc_;
      this.ax5 = var1.ax5 + var2.ax5;
      this.ck3 = var1.ck3 + var2.ck3;
   }

   public final void dqs(rkj var1) {
      this.hp2 = this.hp2 + var1.hp2;
      this.nc_ = this.nc_ + var1.nc_;
      this.ax5 = this.ax5 + var1.ax5;
      this.ck3 = this.ck3 + var1.ck3;
   }

   public final void dl9(rkj var1, rkj var2) {
      this.hp2 = var1.hp2 - var2.hp2;
      this.nc_ = var1.nc_ - var2.nc_;
      this.ax5 = var1.ax5 - var2.ax5;
      this.ck3 = var1.ck3 - var2.ck3;
   }

   public final void use(rkj var1) {
      this.hp2 = this.hp2 - var1.hp2;
      this.nc_ = this.nc_ - var1.nc_;
      this.ax5 = this.ax5 - var1.ax5;
      this.ck3 = this.ck3 - var1.ck3;
   }

   public final void m0x(rkj var1) {
      this.hp2 = -var1.hp2;
      this.nc_ = -var1.nc_;
      this.ax5 = -var1.ax5;
      this.ck3 = -var1.ck3;
   }

   public final void t9x() {
      this.hp2 = -this.hp2;
      this.nc_ = -this.nc_;
      this.ax5 = -this.ax5;
      this.ck3 = -this.ck3;
   }

   public final void uyw(float var1, rkj var2) {
      this.hp2 = var1 * var2.hp2;
      this.nc_ = var1 * var2.nc_;
      this.ax5 = var1 * var2.ax5;
      this.ck3 = var1 * var2.ck3;
   }

   public final void gj8(float var1) {
      this.hp2 *= var1;
      this.nc_ *= var1;
      this.ax5 *= var1;
      this.ck3 *= var1;
   }

   public final void wm4(float var1, rkj var2, rkj var3) {
      this.hp2 = var1 * var2.hp2 + var3.hp2;
      this.nc_ = var1 * var2.nc_ + var3.nc_;
      this.ax5 = var1 * var2.ax5 + var3.ax5;
      this.ck3 = var1 * var2.ck3 + var3.ck3;
   }

   public final void ylp(float var1, rkj var2) {
      this.hp2 = var1 * this.hp2 + var2.hp2;
      this.nc_ = var1 * this.nc_ + var2.nc_;
      this.ax5 = var1 * this.ax5 + var2.ax5;
      this.ck3 = var1 * this.ck3 + var2.ck3;
   }

   @Override
   public String toString() {
      long var1 = a ^ 30696392156992L;
      return "("
         + this.hp2
         + a<"d">(4128, 2637523637691691176L ^ var1)
         + this.nc_
         + a<"d">(29777, 6468667122135160024L ^ var1)
         + this.ax5
         + a<"d">(29777, 6468667122135160024L ^ var1)
         + this.ck3
         + ")";
   }

   public boolean y63(rkj param1) {
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
      // 05: getfield rkj.hp2 F
      // 08: aload 1
      // 09: getfield rkj.hp2 F
      // 0c: fcmpl
      // 0d: iload 2
      // 0e: ifeq 2b
      // 11: ifne 79
      // 14: goto 1b
      // 17: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield rkj.nc_ F
      // 1f: aload 1
      // 20: getfield rkj.nc_ F
      // 23: fcmpl
      // 24: goto 2b
      // 27: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifeq 49
      // 2f: ifne 79
      // 32: goto 39
      // 35: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield rkj.ax5 F
      // 3d: aload 1
      // 3e: getfield rkj.ax5 F
      // 41: fcmpl
      // 42: goto 49
      // 45: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: iload 2
      // 4a: ifeq 67
      // 4d: ifne 79
      // 50: goto 57
      // 53: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 56: athrow
      // 57: aload 0
      // 58: getfield rkj.ck3 F
      // 5b: aload 1
      // 5c: getfield rkj.ck3 F
      // 5f: fcmpl
      // 60: goto 67
      // 63: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 66: athrow
      // 67: iload 2
      // 68: ifeq 76
      // 6b: ifne 79
      // 6e: goto 75
      // 71: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: checkcast rkj
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield rkj.hp2 F
      // 0d: aload 3
      // 0e: getfield rkj.hp2 F
      // 11: fcmpl
      // 12: iload 2
      // 13: ifeq 30
      // 16: ifne 7e
      // 19: goto 20
      // 1c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield rkj.nc_ F
      // 24: aload 3
      // 25: getfield rkj.nc_ F
      // 28: fcmpl
      // 29: goto 30
      // 2c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifeq 4e
      // 34: ifne 7e
      // 37: goto 3e
      // 3a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield rkj.ax5 F
      // 42: aload 3
      // 43: getfield rkj.ax5 F
      // 46: fcmpl
      // 47: goto 4e
      // 4a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifeq 6c
      // 52: ifne 7e
      // 55: goto 5c
      // 58: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield rkj.ck3 F
      // 60: aload 3
      // 61: getfield rkj.ck3 F
      // 64: fcmpl
      // 65: goto 6c
      // 68: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6b: athrow
      // 6c: iload 2
      // 6d: ifeq 7b
      // 70: ifne 7e
      // 73: goto 7a
      // 76: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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

   public boolean sb1(rkj param1, float param2) {
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
      // 005: getfield rkj.hp2 F
      // 008: aload 1
      // 009: getfield rkj.hp2 F
      // 00c: fsub
      // 00d: fstore 4
      // 00f: fload 4
      // 011: invokestatic java/lang/Float.isNaN (F)Z
      // 014: iload 3
      // 015: ifeq 037
      // 018: ifeq 028
      // 01b: goto 022
      // 01e: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 021: athrow
      // 022: bipush 0
      // 023: ireturn
      // 024: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 027: athrow
      // 028: fload 4
      // 02a: iload 3
      // 02b: ifeq 044
      // 02e: fconst_0
      // 02f: fcmpg
      // 030: goto 037
      // 033: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 036: athrow
      // 037: ifge 047
      // 03a: fload 4
      // 03c: fneg
      // 03d: goto 044
      // 040: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 043: athrow
      // 044: goto 049
      // 047: fload 4
      // 049: fload 2
      // 04a: fcmpl
      // 04b: iload 3
      // 04c: ifeq 06f
      // 04f: ifle 05f
      // 052: goto 059
      // 055: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 058: athrow
      // 059: bipush 0
      // 05a: ireturn
      // 05b: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield rkj.nc_ F
      // 063: aload 1
      // 064: getfield rkj.nc_ F
      // 067: fsub
      // 068: fstore 4
      // 06a: fload 4
      // 06c: invokestatic java/lang/Float.isNaN (F)Z
      // 06f: iload 3
      // 070: ifeq 092
      // 073: ifeq 083
      // 076: goto 07d
      // 079: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 07c: athrow
      // 07d: bipush 0
      // 07e: ireturn
      // 07f: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 082: athrow
      // 083: fload 4
      // 085: iload 3
      // 086: ifeq 09f
      // 089: fconst_0
      // 08a: fcmpg
      // 08b: goto 092
      // 08e: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 091: athrow
      // 092: ifge 0a2
      // 095: fload 4
      // 097: fneg
      // 098: goto 09f
      // 09b: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 09e: athrow
      // 09f: goto 0a4
      // 0a2: fload 4
      // 0a4: fload 2
      // 0a5: fcmpl
      // 0a6: iload 3
      // 0a7: ifeq 0ca
      // 0aa: ifle 0ba
      // 0ad: goto 0b4
      // 0b0: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b3: athrow
      // 0b4: bipush 0
      // 0b5: ireturn
      // 0b6: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield rkj.ax5 F
      // 0be: aload 1
      // 0bf: getfield rkj.ax5 F
      // 0c2: fsub
      // 0c3: fstore 4
      // 0c5: fload 4
      // 0c7: invokestatic java/lang/Float.isNaN (F)Z
      // 0ca: iload 3
      // 0cb: ifeq 0ed
      // 0ce: ifeq 0de
      // 0d1: goto 0d8
      // 0d4: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0d7: athrow
      // 0d8: bipush 0
      // 0d9: ireturn
      // 0da: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0dd: athrow
      // 0de: fload 4
      // 0e0: iload 3
      // 0e1: ifeq 0fa
      // 0e4: fconst_0
      // 0e5: fcmpg
      // 0e6: goto 0ed
      // 0e9: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ec: athrow
      // 0ed: ifge 0fd
      // 0f0: fload 4
      // 0f2: fneg
      // 0f3: goto 0fa
      // 0f6: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f9: athrow
      // 0fa: goto 0ff
      // 0fd: fload 4
      // 0ff: fload 2
      // 100: fcmpl
      // 101: iload 3
      // 102: ifeq 125
      // 105: ifle 115
      // 108: goto 10f
      // 10b: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 10e: athrow
      // 10f: bipush 0
      // 110: ireturn
      // 111: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 114: athrow
      // 115: aload 0
      // 116: getfield rkj.ck3 F
      // 119: aload 1
      // 11a: getfield rkj.ck3 F
      // 11d: fsub
      // 11e: fstore 4
      // 120: fload 4
      // 122: invokestatic java/lang/Float.isNaN (F)Z
      // 125: iload 3
      // 126: ifeq 148
      // 129: ifeq 139
      // 12c: goto 133
      // 12f: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 132: athrow
      // 133: bipush 0
      // 134: ireturn
      // 135: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 138: athrow
      // 139: fload 4
      // 13b: iload 3
      // 13c: ifeq 155
      // 13f: fconst_0
      // 140: fcmpg
      // 141: goto 148
      // 144: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 147: athrow
      // 148: ifge 158
      // 14b: fload 4
      // 14d: fneg
      // 14e: goto 155
      // 151: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 154: athrow
      // 155: goto 15a
      // 158: fload 4
      // 15a: fload 2
      // 15b: fcmpl
      // 15c: iload 3
      // 15d: ifeq 171
      // 160: ifle 170
      // 163: goto 16a
      // 166: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 169: athrow
      // 16a: bipush 0
      // 16b: ireturn
      // 16c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16f: athrow
      // 170: bipush 1
      // 171: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.g_p(var1, this.hp2);
      var1 = get.g_p(var1, this.nc_);
      var1 = get.g_p(var1, this.ax5);
      var1 = get.g_p(var1, this.ck3);
      return get.p05(var1);
   }

   public final void _mx(float param1, float param2, rkj param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 3
      // 006: getfield rkj.hp2 F
      // 009: fload 2
      // 00a: fcmpl
      // 00b: iload 4
      // 00d: ifeq 044
      // 010: ifle 02b
      // 013: goto 01a
      // 016: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 019: athrow
      // 01a: aload 0
      // 01b: fload 2
      // 01c: putfield rkj.hp2 F
      // 01f: iload 4
      // 021: ifne 067
      // 024: goto 02b
      // 027: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 02a: athrow
      // 02b: aload 3
      // 02c: iload 4
      // 02e: ifeq 060
      // 031: goto 038
      // 034: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 037: athrow
      // 038: getfield rkj.hp2 F
      // 03b: fload 1
      // 03c: fcmpg
      // 03d: goto 044
      // 040: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 043: athrow
      // 044: ifge 058
      // 047: aload 0
      // 048: fload 1
      // 049: putfield rkj.hp2 F
      // 04c: iload 4
      // 04e: ifne 067
      // 051: goto 058
      // 054: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 057: athrow
      // 058: aload 0
      // 059: goto 060
      // 05c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 05f: athrow
      // 060: aload 3
      // 061: getfield rkj.hp2 F
      // 064: putfield rkj.hp2 F
      // 067: aload 3
      // 068: getfield rkj.nc_ F
      // 06b: fload 2
      // 06c: fcmpl
      // 06d: iload 4
      // 06f: ifeq 0a6
      // 072: ifle 08d
      // 075: goto 07c
      // 078: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 07b: athrow
      // 07c: aload 0
      // 07d: fload 2
      // 07e: putfield rkj.nc_ F
      // 081: iload 4
      // 083: ifne 0c9
      // 086: goto 08d
      // 089: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 08c: athrow
      // 08d: aload 3
      // 08e: iload 4
      // 090: ifeq 0c2
      // 093: goto 09a
      // 096: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 099: athrow
      // 09a: getfield rkj.nc_ F
      // 09d: fload 1
      // 09e: fcmpg
      // 09f: goto 0a6
      // 0a2: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a5: athrow
      // 0a6: ifge 0ba
      // 0a9: aload 0
      // 0aa: fload 1
      // 0ab: putfield rkj.nc_ F
      // 0ae: iload 4
      // 0b0: ifne 0c9
      // 0b3: goto 0ba
      // 0b6: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: goto 0c2
      // 0be: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c1: athrow
      // 0c2: aload 3
      // 0c3: getfield rkj.nc_ F
      // 0c6: putfield rkj.nc_ F
      // 0c9: aload 3
      // 0ca: getfield rkj.ax5 F
      // 0cd: fload 2
      // 0ce: fcmpl
      // 0cf: iload 4
      // 0d1: ifeq 108
      // 0d4: ifle 0ef
      // 0d7: goto 0de
      // 0da: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: fload 2
      // 0e0: putfield rkj.ax5 F
      // 0e3: iload 4
      // 0e5: ifne 12b
      // 0e8: goto 0ef
      // 0eb: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ee: athrow
      // 0ef: aload 3
      // 0f0: iload 4
      // 0f2: ifeq 124
      // 0f5: goto 0fc
      // 0f8: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0fb: athrow
      // 0fc: getfield rkj.ax5 F
      // 0ff: fload 1
      // 100: fcmpg
      // 101: goto 108
      // 104: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 107: athrow
      // 108: ifge 11c
      // 10b: aload 0
      // 10c: fload 1
      // 10d: putfield rkj.ax5 F
      // 110: iload 4
      // 112: ifne 12b
      // 115: goto 11c
      // 118: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 11b: athrow
      // 11c: aload 0
      // 11d: goto 124
      // 120: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 123: athrow
      // 124: aload 3
      // 125: getfield rkj.ax5 F
      // 128: putfield rkj.ax5 F
      // 12b: aload 3
      // 12c: getfield rkj.ck3 F
      // 12f: fload 2
      // 130: fcmpl
      // 131: iload 4
      // 133: ifeq 16a
      // 136: ifle 151
      // 139: goto 140
      // 13c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 13f: athrow
      // 140: aload 0
      // 141: fload 2
      // 142: putfield rkj.ck3 F
      // 145: iload 4
      // 147: ifne 18d
      // 14a: goto 151
      // 14d: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 150: athrow
      // 151: aload 3
      // 152: iload 4
      // 154: ifeq 186
      // 157: goto 15e
      // 15a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 15d: athrow
      // 15e: getfield rkj.ck3 F
      // 161: fload 1
      // 162: fcmpg
      // 163: goto 16a
      // 166: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 169: athrow
      // 16a: ifge 17e
      // 16d: aload 0
      // 16e: fload 1
      // 16f: putfield rkj.ck3 F
      // 172: iload 4
      // 174: ifne 18d
      // 177: goto 17e
      // 17a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17d: athrow
      // 17e: aload 0
      // 17f: goto 186
      // 182: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 185: athrow
      // 186: aload 3
      // 187: getfield rkj.ck3 F
      // 18a: putfield rkj.ck3 F
      // 18d: return
   }

   public final void gw6(float param1, rkj param2) {
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
      // 06: ifne 30
      // 09: getfield rkj.hp2 F
      // 0c: fload 1
      // 0d: fcmpg
      // 0e: ifge 28
      // 11: goto 18
      // 14: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield rkj.hp2 F
      // 1d: iload 3
      // 1e: ifeq 37
      // 21: goto 28
      // 24: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: aload 2
      // 31: getfield rkj.hp2 F
      // 34: putfield rkj.hp2 F
      // 37: aload 2
      // 38: iload 3
      // 39: ifne 63
      // 3c: getfield rkj.nc_ F
      // 3f: fload 1
      // 40: fcmpg
      // 41: ifge 5b
      // 44: goto 4b
      // 47: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: fload 1
      // 4d: putfield rkj.nc_ F
      // 50: iload 3
      // 51: ifeq 6a
      // 54: goto 5b
      // 57: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 2
      // 64: getfield rkj.nc_ F
      // 67: putfield rkj.nc_ F
      // 6a: aload 2
      // 6b: iload 3
      // 6c: ifne 96
      // 6f: getfield rkj.ax5 F
      // 72: fload 1
      // 73: fcmpg
      // 74: ifge 8e
      // 77: goto 7e
      // 7a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: fload 1
      // 80: putfield rkj.ax5 F
      // 83: iload 3
      // 84: ifeq 9d
      // 87: goto 8e
      // 8a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: goto 96
      // 92: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 95: athrow
      // 96: aload 2
      // 97: getfield rkj.ax5 F
      // 9a: putfield rkj.ax5 F
      // 9d: aload 2
      // 9e: iload 3
      // 9f: ifne c9
      // a2: getfield rkj.ck3 F
      // a5: fload 1
      // a6: fcmpg
      // a7: ifge c1
      // aa: goto b1
      // ad: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b0: athrow
      // b1: aload 0
      // b2: fload 1
      // b3: putfield rkj.ck3 F
      // b6: iload 3
      // b7: ifeq d0
      // ba: goto c1
      // bd: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c0: athrow
      // c1: aload 0
      // c2: goto c9
      // c5: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c8: athrow
      // c9: aload 2
      // ca: getfield rkj.ck3 F
      // cd: putfield rkj.ck3 F
      // d0: return
   }

   public final void lld(float param1, rkj param2) {
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
      // 06: ifne 30
      // 09: getfield rkj.hp2 F
      // 0c: fload 1
      // 0d: fcmpl
      // 0e: ifle 28
      // 11: goto 18
      // 14: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield rkj.hp2 F
      // 1d: iload 3
      // 1e: ifeq 37
      // 21: goto 28
      // 24: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 27: athrow
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: aload 2
      // 31: getfield rkj.hp2 F
      // 34: putfield rkj.hp2 F
      // 37: aload 2
      // 38: iload 3
      // 39: ifne 63
      // 3c: getfield rkj.nc_ F
      // 3f: fload 1
      // 40: fcmpl
      // 41: ifle 5b
      // 44: goto 4b
      // 47: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: fload 1
      // 4d: putfield rkj.nc_ F
      // 50: iload 3
      // 51: ifeq 6a
      // 54: goto 5b
      // 57: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 2
      // 64: getfield rkj.nc_ F
      // 67: putfield rkj.nc_ F
      // 6a: aload 2
      // 6b: iload 3
      // 6c: ifne 96
      // 6f: getfield rkj.ax5 F
      // 72: fload 1
      // 73: fcmpl
      // 74: ifle 8e
      // 77: goto 7e
      // 7a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: fload 1
      // 80: putfield rkj.ax5 F
      // 83: iload 3
      // 84: ifeq 9d
      // 87: goto 8e
      // 8a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: goto 96
      // 92: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 95: athrow
      // 96: aload 2
      // 97: getfield rkj.ax5 F
      // 9a: putfield rkj.ax5 F
      // 9d: aload 2
      // 9e: iload 3
      // 9f: ifne c9
      // a2: getfield rkj.ck3 F
      // a5: fload 1
      // a6: fcmpl
      // a7: ifle c1
      // aa: goto b1
      // ad: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b0: athrow
      // b1: aload 0
      // b2: fload 1
      // b3: putfield rkj.ck3 F
      // b6: iload 3
      // b7: ifeq d0
      // ba: goto c1
      // bd: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c0: athrow
      // c1: aload 0
      // c2: goto c9
      // c5: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c8: athrow
      // c9: aload 2
      // ca: getfield rkj.ax5 F
      // cd: putfield rkj.ck3 F
      // d0: return
   }

   public final void ive(rkj var1) {
      this.hp2 = Math.abs(var1.hp2);
      this.nc_ = Math.abs(var1.nc_);
      this.ax5 = Math.abs(var1.ax5);
      this.ck3 = Math.abs(var1.ck3);
   }

   public final void jv_(float param1, float param2) {
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
      // 005: getfield rkj.hp2 F
      // 008: fload 2
      // 009: fcmpl
      // 00a: iload 3
      // 00b: ifeq 035
      // 00e: ifle 028
      // 011: goto 018
      // 014: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 017: athrow
      // 018: aload 0
      // 019: fload 2
      // 01a: putfield rkj.hp2 F
      // 01d: iload 3
      // 01e: ifne 04f
      // 021: goto 028
      // 024: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 027: athrow
      // 028: aload 0
      // 029: getfield rkj.hp2 F
      // 02c: fload 1
      // 02d: fcmpg
      // 02e: goto 035
      // 031: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 034: athrow
      // 035: iload 3
      // 036: ifeq 055
      // 039: ifge 04f
      // 03c: goto 043
      // 03f: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 042: athrow
      // 043: aload 0
      // 044: fload 1
      // 045: putfield rkj.hp2 F
      // 048: goto 04f
      // 04b: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 04e: athrow
      // 04f: aload 0
      // 050: getfield rkj.nc_ F
      // 053: fload 2
      // 054: fcmpl
      // 055: iload 3
      // 056: ifeq 080
      // 059: ifle 073
      // 05c: goto 063
      // 05f: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 062: athrow
      // 063: aload 0
      // 064: fload 2
      // 065: putfield rkj.nc_ F
      // 068: iload 3
      // 069: ifne 09a
      // 06c: goto 073
      // 06f: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 072: athrow
      // 073: aload 0
      // 074: getfield rkj.nc_ F
      // 077: fload 1
      // 078: fcmpg
      // 079: goto 080
      // 07c: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 07f: athrow
      // 080: iload 3
      // 081: ifeq 0a0
      // 084: ifge 09a
      // 087: goto 08e
      // 08a: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 08d: athrow
      // 08e: aload 0
      // 08f: fload 1
      // 090: putfield rkj.nc_ F
      // 093: goto 09a
      // 096: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield rkj.ax5 F
      // 09e: fload 2
      // 09f: fcmpl
      // 0a0: iload 3
      // 0a1: ifeq 0cb
      // 0a4: ifle 0be
      // 0a7: goto 0ae
      // 0aa: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: fload 2
      // 0b0: putfield rkj.ax5 F
      // 0b3: iload 3
      // 0b4: ifne 0e5
      // 0b7: goto 0be
      // 0ba: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield rkj.ax5 F
      // 0c2: fload 1
      // 0c3: fcmpg
      // 0c4: goto 0cb
      // 0c7: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ca: athrow
      // 0cb: iload 3
      // 0cc: ifeq 0eb
      // 0cf: ifge 0e5
      // 0d2: goto 0d9
      // 0d5: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: fload 1
      // 0db: putfield rkj.ax5 F
      // 0de: goto 0e5
      // 0e1: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield rkj.ck3 F
      // 0e9: fload 2
      // 0ea: fcmpl
      // 0eb: iload 3
      // 0ec: ifeq 121
      // 0ef: ifle 109
      // 0f2: goto 0f9
      // 0f5: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: fload 2
      // 0fb: putfield rkj.ck3 F
      // 0fe: iload 3
      // 0ff: ifne 129
      // 102: goto 109
      // 105: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 108: athrow
      // 109: aload 0
      // 10a: iload 3
      // 10b: ifeq 125
      // 10e: goto 115
      // 111: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 114: athrow
      // 115: getfield rkj.ck3 F
      // 118: fload 1
      // 119: fcmpg
      // 11a: goto 121
      // 11d: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 120: athrow
      // 121: ifge 129
      // 124: aload 0
      // 125: fload 1
      // 126: putfield rkj.ck3 F
      // 129: return
   }

   public final void zq6(float param1) {
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
      // 05: getfield rkj.hp2 F
      // 08: fload 1
      // 09: fcmpg
      // 0a: iload 2
      // 0b: ifne 2a
      // 0e: ifge 24
      // 11: goto 18
      // 14: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield rkj.hp2 F
      // 1d: goto 24
      // 20: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield rkj.nc_ F
      // 28: fload 1
      // 29: fcmpg
      // 2a: iload 2
      // 2b: ifne 4a
      // 2e: ifge 44
      // 31: goto 38
      // 34: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: aload 0
      // 39: fload 1
      // 3a: putfield rkj.nc_ F
      // 3d: goto 44
      // 40: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield rkj.ax5 F
      // 48: fload 1
      // 49: fcmpg
      // 4a: iload 2
      // 4b: ifne 75
      // 4e: ifge 64
      // 51: goto 58
      // 54: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 57: athrow
      // 58: aload 0
      // 59: fload 1
      // 5a: putfield rkj.ax5 F
      // 5d: goto 64
      // 60: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 63: athrow
      // 64: aload 0
      // 65: iload 2
      // 66: ifne 79
      // 69: getfield rkj.ck3 F
      // 6c: fload 1
      // 6d: fcmpg
      // 6e: goto 75
      // 71: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 74: athrow
      // 75: ifge 7d
      // 78: aload 0
      // 79: fload 1
      // 7a: putfield rkj.ck3 F
      // 7d: return
   }

   public final void ugm(float param1) {
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
      // 05: getfield rkj.hp2 F
      // 08: fload 1
      // 09: fcmpl
      // 0a: iload 2
      // 0b: ifeq 2a
      // 0e: ifle 24
      // 11: goto 18
      // 14: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 0
      // 19: fload 1
      // 1a: putfield rkj.hp2 F
      // 1d: goto 24
      // 20: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield rkj.nc_ F
      // 28: fload 1
      // 29: fcmpl
      // 2a: iload 2
      // 2b: ifeq 4a
      // 2e: ifle 44
      // 31: goto 38
      // 34: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: aload 0
      // 39: fload 1
      // 3a: putfield rkj.nc_ F
      // 3d: goto 44
      // 40: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield rkj.ax5 F
      // 48: fload 1
      // 49: fcmpl
      // 4a: iload 2
      // 4b: ifeq 75
      // 4e: ifle 64
      // 51: goto 58
      // 54: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 57: athrow
      // 58: aload 0
      // 59: fload 1
      // 5a: putfield rkj.ax5 F
      // 5d: goto 64
      // 60: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 63: athrow
      // 64: aload 0
      // 65: iload 2
      // 66: ifeq 79
      // 69: getfield rkj.ck3 F
      // 6c: fload 1
      // 6d: fcmpl
      // 6e: goto 75
      // 71: invokestatic rkj.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 74: athrow
      // 75: ifle 7d
      // 78: aload 0
      // 79: fload 1
      // 7a: putfield rkj.ck3 F
      // 7d: return
   }

   public final void of4() {
      this.hp2 = Math.abs(this.hp2);
      this.nc_ = Math.abs(this.nc_);
      this.ax5 = Math.abs(this.ax5);
      this.ck3 = Math.abs(this.ck3);
   }

   public void r4z(rkj var1, rkj var2, float var3) {
      this.hp2 = (1.0F - var3) * var1.hp2 + var3 * var2.hp2;
      this.nc_ = (1.0F - var3) * var1.nc_ + var3 * var2.nc_;
      this.ax5 = (1.0F - var3) * var1.ax5 + var3 * var2.ax5;
      this.ck3 = (1.0F - var3) * var1.ck3 + var3 * var2.ck3;
   }

   public void t5i(rkj var1, float var2) {
      this.hp2 = (1.0F - var2) * this.hp2 + var2 * var1.hp2;
      this.nc_ = (1.0F - var2) * this.nc_ + var2 * var1.nc_;
      this.ax5 = (1.0F - var2) * this.ax5 + var2 * var1.ax5;
      this.ck3 = (1.0F - var2) * this.ck3 + var2 * var1.ck3;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final float nk1() {
      return this.hp2;
   }

   public final void mt7(float var1) {
      this.hp2 = var1;
   }

   public final float m28() {
      return this.nc_;
   }

   public final void dh_(float var1) {
      this.nc_ = var1;
   }

   public final float e7u() {
      return this.ax5;
   }

   public final void dk3(float var1) {
      this.ax5 = var1;
   }

   public final float fqw() {
      return this.ck3;
   }

   public final void ig_(float var1) {
      this.ck3 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(925725324670782699L, 3609808297100027225L, MethodHandles.lookup().lookupClass()).a(29106045338910L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 98168204590043L;
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
      String var6 = "Ú½ð.\u0094äºCãPd¿Ý\u0085\u0090õ\u0010\u000e\u0094(\u0007?\u0099\\n¾\u000fp¬Wþý\u001f";
      int var8 = "Ú½ð.\u0094äºCãPd¿Ý\u0085\u0090õ\u0010\u000e\u0094(\u0007?\u0099\\n¾\u000fp¬Wþý\u001f".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13472;
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
            throw new RuntimeException("rkj", var10);
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
         throw new RuntimeException("rkj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
