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

public abstract class e3q implements Serializable, Cloneable {
   public static final long serialVersionUID = -732740491767276200L;
   public int uwr;
   public int pgo;
   public int g9w;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public e3q(int var1, int var2, int var3) {
      this.uwr = var1;
      this.pgo = var2;
      this.g9w = var3;
   }

   public e3q(int[] var1) {
      this.uwr = var1[0];
      this.pgo = var1[1];
      this.g9w = var1[2];
   }

   public e3q(e3q var1) {
      this.uwr = var1.uwr;
      this.pgo = var1.pgo;
      this.g9w = var1.g9w;
   }

   public e3q() {
      this.uwr = 0;
      this.pgo = 0;
      this.g9w = 0;
   }

   public final void wty(int var1, int var2, int var3) {
      this.uwr = var1;
      this.pgo = var2;
      this.g9w = var3;
   }

   public final void n3y(int[] var1) {
      this.uwr = var1[0];
      this.pgo = var1[1];
      this.g9w = var1[2];
   }

   public final void yfa(e3q var1) {
      this.uwr = var1.uwr;
      this.pgo = var1.pgo;
      this.g9w = var1.g9w;
   }

   public final void xu3(int[] var1) {
      var1[0] = this.uwr;
      var1[1] = this.pgo;
      var1[2] = this.g9w;
   }

   public final void h8y(e3q var1) {
      var1.uwr = this.uwr;
      var1.pgo = this.pgo;
      var1.g9w = this.g9w;
   }

   public final void p89(e3q var1, e3q var2) {
      this.uwr = var1.uwr + var2.uwr;
      this.pgo = var1.pgo + var2.pgo;
      this.g9w = var1.g9w + var2.g9w;
   }

   public final void em2(e3q var1) {
      this.uwr = this.uwr + var1.uwr;
      this.pgo = this.pgo + var1.pgo;
      this.g9w = this.g9w + var1.g9w;
   }

   public final void z04(e3q var1, e3q var2) {
      this.uwr = var1.uwr - var2.uwr;
      this.pgo = var1.pgo - var2.pgo;
      this.g9w = var1.g9w - var2.g9w;
   }

   public final void jfx(e3q var1) {
      this.uwr = this.uwr - var1.uwr;
      this.pgo = this.pgo - var1.pgo;
      this.g9w = this.g9w - var1.g9w;
   }

   public final void p8q(e3q var1) {
      this.uwr = -var1.uwr;
      this.pgo = -var1.pgo;
      this.g9w = -var1.g9w;
   }

   public final void kfy() {
      this.uwr = -this.uwr;
      this.pgo = -this.pgo;
      this.g9w = -this.g9w;
   }

   public final void gmk(int var1, e3q var2) {
      this.uwr = var1 * var2.uwr;
      this.pgo = var1 * var2.pgo;
      this.g9w = var1 * var2.g9w;
   }

   public final void nma(int var1) {
      this.uwr *= var1;
      this.pgo *= var1;
      this.g9w *= var1;
   }

   public final void jck(int var1, e3q var2, e3q var3) {
      this.uwr = var1 * var2.uwr + var3.uwr;
      this.pgo = var1 * var2.pgo + var3.pgo;
      this.g9w = var1 * var2.g9w + var3.g9w;
   }

   public final void hd3(int var1, e3q var2) {
      this.uwr = var1 * this.uwr + var2.uwr;
      this.pgo = var1 * this.pgo + var2.pgo;
      this.g9w = var1 * this.g9w + var2.g9w;
   }

   @Override
   public String toString() {
      long var1 = a ^ 108189423183835L;
      return "(" + this.uwr + a<"u">(21653, 3421942579135086276L ^ var1) + this.pgo + a<"u">(19922, 1686122504899258242L ^ var1) + this.g9w + ")";
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
      // 05: checkcast e3q
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield e3q.uwr I
      // 0d: aload 3
      // 0e: getfield e3q.uwr I
      // 11: iload 2
      // 12: ifne 2e
      // 15: if_icmpne 5d
      // 18: goto 1f
      // 1b: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield e3q.pgo I
      // 23: aload 3
      // 24: getfield e3q.pgo I
      // 27: goto 2e
      // 2a: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifne 56
      // 32: if_icmpne 5d
      // 35: goto 3c
      // 38: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield e3q.g9w I
      // 40: iload 2
      // 41: ifne 5a
      // 44: goto 4b
      // 47: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 3
      // 4c: getfield e3q.g9w I
      // 4f: goto 56
      // 52: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 55: athrow
      // 56: if_icmpne 5d
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: astore 3
      // 60: bipush 0
      // 61: ireturn
      // 62: astore 3
      // 63: bipush 0
      // 64: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = 31L * var1 + (long)this.uwr;
      var1 = 31L * var1 + (long)this.pgo;
      var1 = 31L * var1 + (long)this.g9w;
      return (int)(var1 ^ var1 >> 32);
   }

   public final void uj7(int param1, int param2, e3q param3) {
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
      // 006: getfield e3q.uwr I
      // 009: iload 2
      // 00a: iload 4
      // 00c: ifeq 042
      // 00f: if_icmple 02a
      // 012: goto 019
      // 015: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 2
      // 01b: putfield e3q.uwr I
      // 01e: iload 4
      // 020: ifne 065
      // 023: goto 02a
      // 026: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 029: athrow
      // 02a: aload 3
      // 02b: iload 4
      // 02d: ifeq 05e
      // 030: goto 037
      // 033: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 036: athrow
      // 037: getfield e3q.uwr I
      // 03a: iload 1
      // 03b: goto 042
      // 03e: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 041: athrow
      // 042: if_icmpge 056
      // 045: aload 0
      // 046: iload 1
      // 047: putfield e3q.uwr I
      // 04a: iload 4
      // 04c: ifne 065
      // 04f: goto 056
      // 052: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 055: athrow
      // 056: aload 0
      // 057: goto 05e
      // 05a: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 05d: athrow
      // 05e: aload 3
      // 05f: getfield e3q.uwr I
      // 062: putfield e3q.uwr I
      // 065: aload 3
      // 066: getfield e3q.pgo I
      // 069: iload 2
      // 06a: iload 4
      // 06c: ifeq 0a2
      // 06f: if_icmple 08a
      // 072: goto 079
      // 075: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 078: athrow
      // 079: aload 0
      // 07a: iload 2
      // 07b: putfield e3q.pgo I
      // 07e: iload 4
      // 080: ifne 0c5
      // 083: goto 08a
      // 086: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 089: athrow
      // 08a: aload 3
      // 08b: iload 4
      // 08d: ifeq 0be
      // 090: goto 097
      // 093: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 096: athrow
      // 097: getfield e3q.pgo I
      // 09a: iload 1
      // 09b: goto 0a2
      // 09e: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a1: athrow
      // 0a2: if_icmpge 0b6
      // 0a5: aload 0
      // 0a6: iload 1
      // 0a7: putfield e3q.pgo I
      // 0aa: iload 4
      // 0ac: ifne 0c5
      // 0af: goto 0b6
      // 0b2: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: goto 0be
      // 0ba: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0bd: athrow
      // 0be: aload 3
      // 0bf: getfield e3q.pgo I
      // 0c2: putfield e3q.pgo I
      // 0c5: aload 3
      // 0c6: getfield e3q.g9w I
      // 0c9: iload 2
      // 0ca: iload 4
      // 0cc: ifeq 102
      // 0cf: if_icmple 0ea
      // 0d2: goto 0d9
      // 0d5: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: iload 2
      // 0db: putfield e3q.g9w I
      // 0de: iload 4
      // 0e0: ifne 125
      // 0e3: goto 0ea
      // 0e6: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0e9: athrow
      // 0ea: aload 3
      // 0eb: iload 4
      // 0ed: ifeq 11e
      // 0f0: goto 0f7
      // 0f3: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f6: athrow
      // 0f7: getfield e3q.g9w I
      // 0fa: iload 1
      // 0fb: goto 102
      // 0fe: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 101: athrow
      // 102: if_icmpge 116
      // 105: aload 0
      // 106: iload 1
      // 107: putfield e3q.g9w I
      // 10a: iload 4
      // 10c: ifne 125
      // 10f: goto 116
      // 112: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 115: athrow
      // 116: aload 0
      // 117: goto 11e
      // 11a: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 11d: athrow
      // 11e: aload 3
      // 11f: getfield e3q.g9w I
      // 122: putfield e3q.g9w I
      // 125: return
   }

   public final void ie6(int param1, e3q param2) {
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
      // 09: getfield e3q.uwr I
      // 0c: iload 1
      // 0d: if_icmpge 27
      // 10: goto 17
      // 13: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield e3q.uwr I
      // 1c: iload 3
      // 1d: ifeq 36
      // 20: goto 27
      // 23: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 26: athrow
      // 27: aload 0
      // 28: goto 2f
      // 2b: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2e: athrow
      // 2f: aload 2
      // 30: getfield e3q.uwr I
      // 33: putfield e3q.uwr I
      // 36: aload 2
      // 37: iload 3
      // 38: ifne 61
      // 3b: getfield e3q.pgo I
      // 3e: iload 1
      // 3f: if_icmpge 59
      // 42: goto 49
      // 45: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: aload 0
      // 4a: iload 1
      // 4b: putfield e3q.pgo I
      // 4e: iload 3
      // 4f: ifeq 68
      // 52: goto 59
      // 55: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 58: athrow
      // 59: aload 0
      // 5a: goto 61
      // 5d: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 60: athrow
      // 61: aload 2
      // 62: getfield e3q.pgo I
      // 65: putfield e3q.pgo I
      // 68: aload 2
      // 69: iload 3
      // 6a: ifne 93
      // 6d: getfield e3q.g9w I
      // 70: iload 1
      // 71: if_icmpge 8b
      // 74: goto 7b
      // 77: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7a: athrow
      // 7b: aload 0
      // 7c: iload 1
      // 7d: putfield e3q.g9w I
      // 80: iload 3
      // 81: ifeq 9a
      // 84: goto 8b
      // 87: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8a: athrow
      // 8b: aload 0
      // 8c: goto 93
      // 8f: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 92: athrow
      // 93: aload 2
      // 94: getfield e3q.g9w I
      // 97: putfield e3q.g9w I
      // 9a: return
   }

   public final void hic(int param1, e3q param2) {
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
      // 09: getfield e3q.uwr I
      // 0c: iload 1
      // 0d: if_icmple 27
      // 10: goto 17
      // 13: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield e3q.uwr I
      // 1c: iload 3
      // 1d: ifeq 36
      // 20: goto 27
      // 23: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 26: athrow
      // 27: aload 0
      // 28: goto 2f
      // 2b: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2e: athrow
      // 2f: aload 2
      // 30: getfield e3q.uwr I
      // 33: putfield e3q.uwr I
      // 36: aload 2
      // 37: iload 3
      // 38: ifne 61
      // 3b: getfield e3q.pgo I
      // 3e: iload 1
      // 3f: if_icmple 59
      // 42: goto 49
      // 45: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: aload 0
      // 4a: iload 1
      // 4b: putfield e3q.pgo I
      // 4e: iload 3
      // 4f: ifeq 68
      // 52: goto 59
      // 55: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 58: athrow
      // 59: aload 0
      // 5a: goto 61
      // 5d: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 60: athrow
      // 61: aload 2
      // 62: getfield e3q.pgo I
      // 65: putfield e3q.pgo I
      // 68: aload 2
      // 69: iload 3
      // 6a: ifne 93
      // 6d: getfield e3q.g9w I
      // 70: iload 1
      // 71: if_icmple 8b
      // 74: goto 7b
      // 77: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7a: athrow
      // 7b: aload 0
      // 7c: iload 1
      // 7d: putfield e3q.g9w I
      // 80: iload 3
      // 81: ifeq 9a
      // 84: goto 8b
      // 87: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8a: athrow
      // 8b: aload 0
      // 8c: goto 93
      // 8f: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 92: athrow
      // 93: aload 2
      // 94: getfield e3q.g9w I
      // 97: putfield e3q.g9w I
      // 9a: return
   }

   public final void ldt(e3q var1) {
      this.uwr = Math.abs(var1.uwr);
      this.pgo = Math.abs(var1.pgo);
      this.g9w = Math.abs(var1.g9w);
   }

   public final void mjw(int param1, int param2) {
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
      // 05: getfield e3q.uwr I
      // 08: iload 2
      // 09: iload 3
      // 0a: ifeq 33
      // 0d: if_icmple 27
      // 10: goto 17
      // 13: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 2
      // 19: putfield e3q.uwr I
      // 1c: iload 3
      // 1d: ifne 4d
      // 20: goto 27
      // 23: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 26: athrow
      // 27: aload 0
      // 28: getfield e3q.uwr I
      // 2b: iload 1
      // 2c: goto 33
      // 2f: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: iload 3
      // 34: ifeq 52
      // 37: if_icmpge 4d
      // 3a: goto 41
      // 3d: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 40: athrow
      // 41: aload 0
      // 42: iload 1
      // 43: putfield e3q.uwr I
      // 46: goto 4d
      // 49: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield e3q.pgo I
      // 51: iload 2
      // 52: iload 3
      // 53: ifeq 7c
      // 56: if_icmple 70
      // 59: goto 60
      // 5c: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: aload 0
      // 61: iload 2
      // 62: putfield e3q.pgo I
      // 65: iload 3
      // 66: ifne 96
      // 69: goto 70
      // 6c: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield e3q.pgo I
      // 74: iload 1
      // 75: goto 7c
      // 78: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7b: athrow
      // 7c: iload 3
      // 7d: ifeq 9b
      // 80: if_icmpge 96
      // 83: goto 8a
      // 86: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 89: athrow
      // 8a: aload 0
      // 8b: iload 1
      // 8c: putfield e3q.pgo I
      // 8f: goto 96
      // 92: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 95: athrow
      // 96: aload 0
      // 97: getfield e3q.g9w I
      // 9a: iload 2
      // 9b: iload 3
      // 9c: ifeq d0
      // 9f: if_icmple b9
      // a2: goto a9
      // a5: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a8: athrow
      // a9: aload 0
      // aa: iload 2
      // ab: putfield e3q.g9w I
      // ae: iload 3
      // af: ifne d8
      // b2: goto b9
      // b5: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b8: athrow
      // b9: aload 0
      // ba: iload 3
      // bb: ifeq d4
      // be: goto c5
      // c1: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c4: athrow
      // c5: getfield e3q.g9w I
      // c8: iload 1
      // c9: goto d0
      // cc: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // cf: athrow
      // d0: if_icmpge d8
      // d3: aload 0
      // d4: iload 1
      // d5: putfield e3q.g9w I
      // d8: return
   }

   public final void _xp(int param1) {
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
      // 05: getfield e3q.uwr I
      // 08: iload 1
      // 09: iload 2
      // 0a: ifne 28
      // 0d: if_icmpge 23
      // 10: goto 17
      // 13: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield e3q.uwr I
      // 1c: goto 23
      // 1f: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield e3q.pgo I
      // 27: iload 1
      // 28: iload 2
      // 29: ifne 52
      // 2c: if_icmpge 42
      // 2f: goto 36
      // 32: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 35: athrow
      // 36: aload 0
      // 37: iload 1
      // 38: putfield e3q.pgo I
      // 3b: goto 42
      // 3e: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 41: athrow
      // 42: aload 0
      // 43: iload 2
      // 44: ifne 56
      // 47: getfield e3q.g9w I
      // 4a: iload 1
      // 4b: goto 52
      // 4e: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 51: athrow
      // 52: if_icmpge 5a
      // 55: aload 0
      // 56: iload 1
      // 57: putfield e3q.g9w I
      // 5a: return
   }

   public final void s6f(int param1) {
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
      // 05: getfield e3q.uwr I
      // 08: iload 1
      // 09: iload 2
      // 0a: ifne 28
      // 0d: if_icmple 23
      // 10: goto 17
      // 13: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield e3q.uwr I
      // 1c: goto 23
      // 1f: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield e3q.pgo I
      // 27: iload 1
      // 28: iload 2
      // 29: ifne 52
      // 2c: if_icmple 42
      // 2f: goto 36
      // 32: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 35: athrow
      // 36: aload 0
      // 37: iload 1
      // 38: putfield e3q.pgo I
      // 3b: goto 42
      // 3e: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 41: athrow
      // 42: aload 0
      // 43: iload 2
      // 44: ifne 56
      // 47: getfield e3q.g9w I
      // 4a: iload 1
      // 4b: goto 52
      // 4e: invokestatic e3q.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 51: athrow
      // 52: if_icmple 5a
      // 55: aload 0
      // 56: iload 1
      // 57: putfield e3q.g9w I
      // 5a: return
   }

   public final void m82() {
      this.uwr = Math.abs(this.uwr);
      this.pgo = Math.abs(this.pgo);
      this.g9w = Math.abs(this.g9w);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final int ati() {
      return this.uwr;
   }

   public final void w3w(int var1) {
      this.uwr = var1;
   }

   public final int hg_() {
      return this.pgo;
   }

   public final void n_0(int var1) {
      this.pgo = var1;
   }

   public final int pu4() {
      return this.g9w;
   }

   public final void bjx(int var1) {
      this.g9w = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8036932830520563410L, 7575343973273993139L, MethodHandles.lookup().lookupClass()).a(237581528155485L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 137579952242892L;
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
      String var6 = "-0(#\u000b¥ô&þà\u0006Ø\u008d@\u0014â\u0010\"\u001aòù\u000f\u0012\u0002\u008fÒ9Øá\u0016»\u008f:";
      int var8 = "-0(#\u000b¥ô&þà\u0006Ø\u008d@\u0014â\u0010\"\u001aòù\u000f\u0012\u0002\u008fÒ9Øá\u0016»\u008f:".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12706;
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
            throw new RuntimeException("e3q", var10);
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
         throw new RuntimeException("e3q" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
