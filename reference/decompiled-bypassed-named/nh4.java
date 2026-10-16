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

public class nh4 {
   public double rlc;
   public double bx_;
   public double t8n;
   public double t_2;
   public double i2c;
   public double oqj;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public nh4(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.rlc = Math.min(var1, var7);
      this.bx_ = Math.min(var3, var9);
      this.t8n = Math.min(var5, var11);
      this.t_2 = Math.max(var1, var7);
      this.i2c = Math.max(var3, var9);
      this.oqj = Math.max(var5, var11);
   }

   public nh4(mew var1, mew var2) {
      this.rlc = (double)var1.getX();
      this.bx_ = (double)var1.getY();
      this.t8n = (double)var1.getZ();
      this.t_2 = (double)var2.getX();
      this.i2c = (double)var2.getY();
      this.oqj = (double)var2.getZ();
   }

   public nh4 z9h(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield nh4.rlc D
      // 04: dstore 8
      // 06: aload 0
      // 07: getfield nh4.bx_ D
      // 0a: dstore 10
      // 0c: aload 0
      // 0d: getfield nh4.t8n D
      // 10: dstore 12
      // 12: invokestatic OpaquePredicate.b ()I
      // 15: aload 0
      // 16: getfield nh4.t_2 D
      // 19: dstore 14
      // 1b: istore 7
      // 1d: aload 0
      // 1e: getfield nh4.i2c D
      // 21: dstore 16
      // 23: aload 0
      // 24: getfield nh4.oqj D
      // 27: dstore 18
      // 29: dload 1
      // 2a: dconst_0
      // 2b: dcmpg
      // 2c: iload 7
      // 2e: ifeq 50
      // 31: ifge 46
      // 34: goto 3b
      // 37: invokestatic nh4.b (Loov;)Loov;
      // 3a: athrow
      // 3b: dload 8
      // 3d: dload 1
      // 3e: dadd
      // 3f: dstore 8
      // 41: iload 7
      // 43: ifne 65
      // 46: dload 1
      // 47: dconst_0
      // 48: dcmpl
      // 49: goto 50
      // 4c: invokestatic nh4.b (Loov;)Loov;
      // 4f: athrow
      // 50: iload 7
      // 52: ifeq 68
      // 55: ifle 65
      // 58: goto 5f
      // 5b: invokestatic nh4.b (Loov;)Loov;
      // 5e: athrow
      // 5f: dload 14
      // 61: dload 1
      // 62: dadd
      // 63: dstore 14
      // 65: dload 3
      // 66: dconst_0
      // 67: dcmpg
      // 68: iload 7
      // 6a: ifeq 8c
      // 6d: ifge 82
      // 70: goto 77
      // 73: invokestatic nh4.b (Loov;)Loov;
      // 76: athrow
      // 77: dload 10
      // 79: dload 3
      // 7a: dadd
      // 7b: dstore 10
      // 7d: iload 7
      // 7f: ifne a1
      // 82: dload 3
      // 83: dconst_0
      // 84: dcmpl
      // 85: goto 8c
      // 88: invokestatic nh4.b (Loov;)Loov;
      // 8b: athrow
      // 8c: iload 7
      // 8e: ifeq a5
      // 91: ifle a1
      // 94: goto 9b
      // 97: invokestatic nh4.b (Loov;)Loov;
      // 9a: athrow
      // 9b: dload 16
      // 9d: dload 3
      // 9e: dadd
      // 9f: dstore 16
      // a1: dload 5
      // a3: dconst_0
      // a4: dcmpg
      // a5: iload 7
      // a7: ifeq d7
      // aa: ifge c0
      // ad: goto b4
      // b0: invokestatic nh4.b (Loov;)Loov;
      // b3: athrow
      // b4: dload 12
      // b6: dload 5
      // b8: dadd
      // b9: dstore 12
      // bb: iload 7
      // bd: ifne e8
      // c0: dload 5
      // c2: dconst_0
      // c3: iload 7
      // c5: ifeq e5
      // c8: goto cf
      // cb: invokestatic nh4.b (Loov;)Loov;
      // ce: athrow
      // cf: dcmpl
      // d0: goto d7
      // d3: invokestatic nh4.b (Loov;)Loov;
      // d6: athrow
      // d7: ifle e8
      // da: dload 18
      // dc: dload 5
      // de: goto e5
      // e1: invokestatic nh4.b (Loov;)Loov;
      // e4: athrow
      // e5: dadd
      // e6: dstore 18
      // e8: new nh4
      // eb: dup
      // ec: dload 8
      // ee: dload 10
      // f0: dload 12
      // f2: dload 14
      // f4: dload 16
      // f6: dload 18
      // f8: invokespecial nh4.<init> (DDDDDD)V
      // fb: areturn
   }

   public nh4 c2h(double var1, double var3, double var5) {
      double var7 = this.rlc - var1;
      double var9 = this.bx_ - var3;
      double var11 = this.t8n - var5;
      double var13 = this.t_2 + var1;
      double var15 = this.i2c + var3;
      double var17 = this.oqj + var5;
      return new nh4(var7, var9, var11, var13, var15, var17);
   }

   public nh4 srm(nh4 var1) {
      double var2 = Math.min(this.rlc, var1.rlc);
      double var4 = Math.min(this.bx_, var1.bx_);
      double var6 = Math.min(this.t8n, var1.t8n);
      double var8 = Math.max(this.t_2, var1.t_2);
      double var10 = Math.max(this.i2c, var1.i2c);
      double var12 = Math.max(this.oqj, var1.oqj);
      return new nh4(var2, var4, var6, var8, var10, var12);
   }

   public static nh4 kje(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = Math.min(var0, var6);
      double var14 = Math.min(var2, var8);
      double var16 = Math.min(var4, var10);
      double var18 = Math.max(var0, var6);
      double var20 = Math.max(var2, var8);
      double var22 = Math.max(var4, var10);
      return new nh4(var12, var14, var16, var18, var20, var22);
   }

   public nh4 sy_(double var1, double var3, double var5) {
      return new nh4(this.rlc + var1, this.bx_ + var3, this.t8n + var5, this.t_2 + var1, this.i2c + var3, this.oqj + var5);
   }

   public double fni(nh4 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: getfield nh4.i2c D
      // 009: iload 4
      // 00b: ifne 13b
      // 00e: aload 0
      // 00f: getfield nh4.bx_ D
      // 012: dcmpl
      // 013: ifle 13a
      // 016: goto 01d
      // 019: invokestatic nh4.b (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 1
      // 01e: getfield nh4.bx_ D
      // 021: iload 4
      // 023: ifne 13b
      // 026: goto 02d
      // 029: invokestatic nh4.b (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 0
      // 02e: getfield nh4.i2c D
      // 031: dcmpg
      // 032: ifge 13a
      // 035: goto 03c
      // 038: invokestatic nh4.b (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 1
      // 03d: getfield nh4.oqj D
      // 040: iload 4
      // 042: ifne 13b
      // 045: goto 04c
      // 048: invokestatic nh4.b (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield nh4.t8n D
      // 050: dcmpl
      // 051: ifle 13a
      // 054: goto 05b
      // 057: invokestatic nh4.b (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 1
      // 05c: getfield nh4.t8n D
      // 05f: iload 4
      // 061: ifne 13b
      // 064: goto 06b
      // 067: invokestatic nh4.b (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield nh4.oqj D
      // 06f: dcmpg
      // 070: ifge 13a
      // 073: goto 07a
      // 076: invokestatic nh4.b (Loov;)Loov;
      // 079: athrow
      // 07a: dload 2
      // 07b: dconst_0
      // 07c: dcmpl
      // 07d: iload 4
      // 07f: ifne 0f5
      // 082: goto 089
      // 085: invokestatic nh4.b (Loov;)Loov;
      // 088: athrow
      // 089: ifle 0df
      // 08c: goto 093
      // 08f: invokestatic nh4.b (Loov;)Loov;
      // 092: athrow
      // 093: aload 1
      // 094: getfield nh4.t_2 D
      // 097: aload 0
      // 098: getfield nh4.rlc D
      // 09b: dcmpg
      // 09c: iload 4
      // 09e: ifne 0f5
      // 0a1: goto 0a8
      // 0a4: invokestatic nh4.b (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifgt 0df
      // 0ab: goto 0b2
      // 0ae: invokestatic nh4.b (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield nh4.rlc D
      // 0b6: aload 1
      // 0b7: getfield nh4.t_2 D
      // 0ba: dsub
      // 0bb: dstore 5
      // 0bd: dload 5
      // 0bf: iload 4
      // 0c1: ifne 0d9
      // 0c4: dload 2
      // 0c5: dcmpg
      // 0c6: ifge 0da
      // 0c9: goto 0d0
      // 0cc: invokestatic nh4.b (Loov;)Loov;
      // 0cf: athrow
      // 0d0: dload 5
      // 0d2: goto 0d9
      // 0d5: invokestatic nh4.b (Loov;)Loov;
      // 0d8: athrow
      // 0d9: dstore 2
      // 0da: iload 4
      // 0dc: ifeq 138
      // 0df: dload 2
      // 0e0: iload 4
      // 0e2: ifne 139
      // 0e5: goto 0ec
      // 0e8: invokestatic nh4.b (Loov;)Loov;
      // 0eb: athrow
      // 0ec: dconst_0
      // 0ed: dcmpg
      // 0ee: goto 0f5
      // 0f1: invokestatic nh4.b (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifge 138
      // 0f8: aload 1
      // 0f9: getfield nh4.rlc D
      // 0fc: iload 4
      // 0fe: ifne 139
      // 101: goto 108
      // 104: invokestatic nh4.b (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: getfield nh4.t_2 D
      // 10c: dcmpl
      // 10d: iflt 138
      // 110: goto 117
      // 113: invokestatic nh4.b (Loov;)Loov;
      // 116: athrow
      // 117: aload 0
      // 118: getfield nh4.t_2 D
      // 11b: aload 1
      // 11c: getfield nh4.rlc D
      // 11f: dsub
      // 120: dstore 5
      // 122: dload 5
      // 124: iload 4
      // 126: ifne 139
      // 129: dload 2
      // 12a: dcmpl
      // 12b: ifle 138
      // 12e: goto 135
      // 131: invokestatic nh4.b (Loov;)Loov;
      // 134: athrow
      // 135: dload 5
      // 137: dstore 2
      // 138: dload 2
      // 139: dreturn
      // 13a: dload 2
      // 13b: dreturn
   }

   public double tf9(nh4 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: getfield nh4.t_2 D
      // 009: iload 4
      // 00b: ifeq 13b
      // 00e: aload 0
      // 00f: getfield nh4.rlc D
      // 012: dcmpl
      // 013: ifle 13a
      // 016: goto 01d
      // 019: invokestatic nh4.b (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 1
      // 01e: getfield nh4.rlc D
      // 021: iload 4
      // 023: ifeq 13b
      // 026: goto 02d
      // 029: invokestatic nh4.b (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 0
      // 02e: getfield nh4.t_2 D
      // 031: dcmpg
      // 032: ifge 13a
      // 035: goto 03c
      // 038: invokestatic nh4.b (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 1
      // 03d: getfield nh4.oqj D
      // 040: iload 4
      // 042: ifeq 13b
      // 045: goto 04c
      // 048: invokestatic nh4.b (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield nh4.t8n D
      // 050: dcmpl
      // 051: ifle 13a
      // 054: goto 05b
      // 057: invokestatic nh4.b (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 1
      // 05c: getfield nh4.t8n D
      // 05f: iload 4
      // 061: ifeq 13b
      // 064: goto 06b
      // 067: invokestatic nh4.b (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield nh4.oqj D
      // 06f: dcmpg
      // 070: ifge 13a
      // 073: goto 07a
      // 076: invokestatic nh4.b (Loov;)Loov;
      // 079: athrow
      // 07a: dload 2
      // 07b: dconst_0
      // 07c: dcmpl
      // 07d: iload 4
      // 07f: ifeq 0f5
      // 082: goto 089
      // 085: invokestatic nh4.b (Loov;)Loov;
      // 088: athrow
      // 089: ifle 0df
      // 08c: goto 093
      // 08f: invokestatic nh4.b (Loov;)Loov;
      // 092: athrow
      // 093: aload 1
      // 094: getfield nh4.i2c D
      // 097: aload 0
      // 098: getfield nh4.bx_ D
      // 09b: dcmpg
      // 09c: iload 4
      // 09e: ifeq 0f5
      // 0a1: goto 0a8
      // 0a4: invokestatic nh4.b (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifgt 0df
      // 0ab: goto 0b2
      // 0ae: invokestatic nh4.b (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield nh4.bx_ D
      // 0b6: aload 1
      // 0b7: getfield nh4.i2c D
      // 0ba: dsub
      // 0bb: dstore 5
      // 0bd: dload 5
      // 0bf: iload 4
      // 0c1: ifeq 0d9
      // 0c4: dload 2
      // 0c5: dcmpg
      // 0c6: ifge 0da
      // 0c9: goto 0d0
      // 0cc: invokestatic nh4.b (Loov;)Loov;
      // 0cf: athrow
      // 0d0: dload 5
      // 0d2: goto 0d9
      // 0d5: invokestatic nh4.b (Loov;)Loov;
      // 0d8: athrow
      // 0d9: dstore 2
      // 0da: iload 4
      // 0dc: ifne 138
      // 0df: dload 2
      // 0e0: iload 4
      // 0e2: ifeq 139
      // 0e5: goto 0ec
      // 0e8: invokestatic nh4.b (Loov;)Loov;
      // 0eb: athrow
      // 0ec: dconst_0
      // 0ed: dcmpg
      // 0ee: goto 0f5
      // 0f1: invokestatic nh4.b (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifge 138
      // 0f8: aload 1
      // 0f9: getfield nh4.bx_ D
      // 0fc: iload 4
      // 0fe: ifeq 139
      // 101: goto 108
      // 104: invokestatic nh4.b (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: getfield nh4.i2c D
      // 10c: dcmpl
      // 10d: iflt 138
      // 110: goto 117
      // 113: invokestatic nh4.b (Loov;)Loov;
      // 116: athrow
      // 117: aload 0
      // 118: getfield nh4.i2c D
      // 11b: aload 1
      // 11c: getfield nh4.bx_ D
      // 11f: dsub
      // 120: dstore 5
      // 122: dload 5
      // 124: iload 4
      // 126: ifeq 139
      // 129: dload 2
      // 12a: dcmpl
      // 12b: ifle 138
      // 12e: goto 135
      // 131: invokestatic nh4.b (Loov;)Loov;
      // 134: athrow
      // 135: dload 5
      // 137: dstore 2
      // 138: dload 2
      // 139: dreturn
      // 13a: dload 2
      // 13b: dreturn
   }

   public double wld(nh4 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: getfield nh4.t_2 D
      // 009: iload 4
      // 00b: ifeq 13b
      // 00e: aload 0
      // 00f: getfield nh4.rlc D
      // 012: dcmpl
      // 013: ifle 13a
      // 016: goto 01d
      // 019: invokestatic nh4.b (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 1
      // 01e: getfield nh4.rlc D
      // 021: iload 4
      // 023: ifeq 13b
      // 026: goto 02d
      // 029: invokestatic nh4.b (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 0
      // 02e: getfield nh4.t_2 D
      // 031: dcmpg
      // 032: ifge 13a
      // 035: goto 03c
      // 038: invokestatic nh4.b (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 1
      // 03d: getfield nh4.i2c D
      // 040: iload 4
      // 042: ifeq 13b
      // 045: goto 04c
      // 048: invokestatic nh4.b (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield nh4.bx_ D
      // 050: dcmpl
      // 051: ifle 13a
      // 054: goto 05b
      // 057: invokestatic nh4.b (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 1
      // 05c: getfield nh4.bx_ D
      // 05f: iload 4
      // 061: ifeq 13b
      // 064: goto 06b
      // 067: invokestatic nh4.b (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield nh4.i2c D
      // 06f: dcmpg
      // 070: ifge 13a
      // 073: goto 07a
      // 076: invokestatic nh4.b (Loov;)Loov;
      // 079: athrow
      // 07a: dload 2
      // 07b: dconst_0
      // 07c: dcmpl
      // 07d: iload 4
      // 07f: ifeq 0f5
      // 082: goto 089
      // 085: invokestatic nh4.b (Loov;)Loov;
      // 088: athrow
      // 089: ifle 0df
      // 08c: goto 093
      // 08f: invokestatic nh4.b (Loov;)Loov;
      // 092: athrow
      // 093: aload 1
      // 094: getfield nh4.oqj D
      // 097: aload 0
      // 098: getfield nh4.t8n D
      // 09b: dcmpg
      // 09c: iload 4
      // 09e: ifeq 0f5
      // 0a1: goto 0a8
      // 0a4: invokestatic nh4.b (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifgt 0df
      // 0ab: goto 0b2
      // 0ae: invokestatic nh4.b (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield nh4.t8n D
      // 0b6: aload 1
      // 0b7: getfield nh4.oqj D
      // 0ba: dsub
      // 0bb: dstore 5
      // 0bd: dload 5
      // 0bf: iload 4
      // 0c1: ifeq 0d9
      // 0c4: dload 2
      // 0c5: dcmpg
      // 0c6: ifge 0da
      // 0c9: goto 0d0
      // 0cc: invokestatic nh4.b (Loov;)Loov;
      // 0cf: athrow
      // 0d0: dload 5
      // 0d2: goto 0d9
      // 0d5: invokestatic nh4.b (Loov;)Loov;
      // 0d8: athrow
      // 0d9: dstore 2
      // 0da: iload 4
      // 0dc: ifne 138
      // 0df: dload 2
      // 0e0: iload 4
      // 0e2: ifeq 139
      // 0e5: goto 0ec
      // 0e8: invokestatic nh4.b (Loov;)Loov;
      // 0eb: athrow
      // 0ec: dconst_0
      // 0ed: dcmpg
      // 0ee: goto 0f5
      // 0f1: invokestatic nh4.b (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifge 138
      // 0f8: aload 1
      // 0f9: getfield nh4.t8n D
      // 0fc: iload 4
      // 0fe: ifeq 139
      // 101: goto 108
      // 104: invokestatic nh4.b (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: getfield nh4.oqj D
      // 10c: dcmpl
      // 10d: iflt 138
      // 110: goto 117
      // 113: invokestatic nh4.b (Loov;)Loov;
      // 116: athrow
      // 117: aload 0
      // 118: getfield nh4.oqj D
      // 11b: aload 1
      // 11c: getfield nh4.t8n D
      // 11f: dsub
      // 120: dstore 5
      // 122: dload 5
      // 124: iload 4
      // 126: ifeq 139
      // 129: dload 2
      // 12a: dcmpl
      // 12b: ifle 138
      // 12e: goto 135
      // 131: invokestatic nh4.b (Loov;)Loov;
      // 134: athrow
      // 135: dload 5
      // 137: dstore 2
      // 138: dload 2
      // 139: dreturn
      // 13a: dload 2
      // 13b: dreturn
   }

   public boolean epq(nh4 param1) {
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
      // 05: getfield nh4.t_2 D
      // 08: aload 0
      // 09: getfield nh4.rlc D
      // 0c: dcmpl
      // 0d: iload 2
      // 0e: ifne 2b
      // 11: ifle c1
      // 14: goto 1b
      // 17: invokestatic nh4.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield nh4.rlc D
      // 1f: aload 0
      // 20: getfield nh4.t_2 D
      // 23: dcmpg
      // 24: goto 2b
      // 27: invokestatic nh4.b (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifne 49
      // 2f: ifge c1
      // 32: goto 39
      // 35: invokestatic nh4.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: getfield nh4.i2c D
      // 3d: aload 0
      // 3e: getfield nh4.bx_ D
      // 41: dcmpl
      // 42: goto 49
      // 45: invokestatic nh4.b (Loov;)Loov;
      // 48: athrow
      // 49: iload 2
      // 4a: ifne be
      // 4d: ifle bd
      // 50: goto 57
      // 53: invokestatic nh4.b (Loov;)Loov;
      // 56: athrow
      // 57: aload 1
      // 58: getfield nh4.bx_ D
      // 5b: aload 0
      // 5c: getfield nh4.i2c D
      // 5f: dcmpg
      // 60: iload 2
      // 61: ifne be
      // 64: goto 6b
      // 67: invokestatic nh4.b (Loov;)Loov;
      // 6a: athrow
      // 6b: ifge bd
      // 6e: goto 75
      // 71: invokestatic nh4.b (Loov;)Loov;
      // 74: athrow
      // 75: aload 1
      // 76: getfield nh4.oqj D
      // 79: aload 0
      // 7a: getfield nh4.t8n D
      // 7d: dcmpl
      // 7e: iload 2
      // 7f: ifne ba
      // 82: goto 89
      // 85: invokestatic nh4.b (Loov;)Loov;
      // 88: athrow
      // 89: ifle b9
      // 8c: goto 93
      // 8f: invokestatic nh4.b (Loov;)Loov;
      // 92: athrow
      // 93: aload 1
      // 94: getfield nh4.t8n D
      // 97: aload 0
      // 98: getfield nh4.oqj D
      // 9b: dcmpg
      // 9c: iload 2
      // 9d: ifne ba
      // a0: goto a7
      // a3: invokestatic nh4.b (Loov;)Loov;
      // a6: athrow
      // a7: ifge b9
      // aa: goto b1
      // ad: invokestatic nh4.b (Loov;)Loov;
      // b0: athrow
      // b1: bipush 1
      // b2: goto c2
      // b5: invokestatic nh4.b (Loov;)Loov;
      // b8: athrow
      // b9: bipush 0
      // ba: goto c2
      // bd: bipush 0
      // be: goto c2
      // c1: bipush 0
      // c2: ireturn
   }

   public boolean fd8(fqr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield fqr.lvi D
      // 08: aload 0
      // 09: getfield nh4.rlc D
      // 0c: dcmpl
      // 0d: iload 2
      // 0e: ifeq 2b
      // 11: ifle c1
      // 14: goto 1b
      // 17: invokestatic nh4.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield fqr.lvi D
      // 1f: aload 0
      // 20: getfield nh4.t_2 D
      // 23: dcmpg
      // 24: goto 2b
      // 27: invokestatic nh4.b (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifeq 49
      // 2f: ifge c1
      // 32: goto 39
      // 35: invokestatic nh4.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: getfield fqr.gn5 D
      // 3d: aload 0
      // 3e: getfield nh4.bx_ D
      // 41: dcmpl
      // 42: goto 49
      // 45: invokestatic nh4.b (Loov;)Loov;
      // 48: athrow
      // 49: iload 2
      // 4a: ifeq be
      // 4d: ifle bd
      // 50: goto 57
      // 53: invokestatic nh4.b (Loov;)Loov;
      // 56: athrow
      // 57: aload 1
      // 58: getfield fqr.gn5 D
      // 5b: aload 0
      // 5c: getfield nh4.i2c D
      // 5f: dcmpg
      // 60: iload 2
      // 61: ifeq be
      // 64: goto 6b
      // 67: invokestatic nh4.b (Loov;)Loov;
      // 6a: athrow
      // 6b: ifge bd
      // 6e: goto 75
      // 71: invokestatic nh4.b (Loov;)Loov;
      // 74: athrow
      // 75: aload 1
      // 76: getfield fqr.bn2 D
      // 79: aload 0
      // 7a: getfield nh4.t8n D
      // 7d: dcmpl
      // 7e: iload 2
      // 7f: ifeq ba
      // 82: goto 89
      // 85: invokestatic nh4.b (Loov;)Loov;
      // 88: athrow
      // 89: ifle b9
      // 8c: goto 93
      // 8f: invokestatic nh4.b (Loov;)Loov;
      // 92: athrow
      // 93: aload 1
      // 94: getfield fqr.bn2 D
      // 97: aload 0
      // 98: getfield nh4.oqj D
      // 9b: dcmpg
      // 9c: iload 2
      // 9d: ifeq ba
      // a0: goto a7
      // a3: invokestatic nh4.b (Loov;)Loov;
      // a6: athrow
      // a7: ifge b9
      // aa: goto b1
      // ad: invokestatic nh4.b (Loov;)Loov;
      // b0: athrow
      // b1: bipush 1
      // b2: goto c2
      // b5: invokestatic nh4.b (Loov;)Loov;
      // b8: athrow
      // b9: bipush 0
      // ba: goto c2
      // bd: bipush 0
      // be: goto c2
      // c1: bipush 0
      // c2: ireturn
   }

   public double liq() {
      double var1 = this.t_2 - this.rlc;
      double var3 = this.i2c - this.bx_;
      double var5 = this.oqj - this.t8n;
      return (var1 + var3 + var5) / 3.0;
   }

   public nh4 va6(double var1, double var3, double var5) {
      double var7 = this.rlc + var1;
      double var9 = this.bx_ + var3;
      double var11 = this.t8n + var5;
      double var13 = this.t_2 - var1;
      double var15 = this.i2c - var3;
      double var17 = this.oqj - var5;
      return new nh4(var7, var9, var11, var13, var15, var17);
   }

   public akm v35(fqr param1, fqr param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: aload 0
      // 003: getfield nh4.rlc D
      // 006: invokevirtual fqr.t0u (Lfqr;D)Lfqr;
      // 009: astore 4
      // 00b: aload 1
      // 00c: aload 2
      // 00d: aload 0
      // 00e: getfield nh4.t_2 D
      // 011: invokevirtual fqr.t0u (Lfqr;D)Lfqr;
      // 014: astore 5
      // 016: aload 1
      // 017: aload 2
      // 018: aload 0
      // 019: getfield nh4.bx_ D
      // 01c: invokevirtual fqr._5q (Lfqr;D)Lfqr;
      // 01f: astore 6
      // 021: invokestatic OpaquePredicate.c ()I
      // 024: aload 1
      // 025: aload 2
      // 026: aload 0
      // 027: getfield nh4.i2c D
      // 02a: invokevirtual fqr._5q (Lfqr;D)Lfqr;
      // 02d: astore 7
      // 02f: aload 1
      // 030: aload 2
      // 031: aload 0
      // 032: getfield nh4.t8n D
      // 035: invokevirtual fqr.p9z (Lfqr;D)Lfqr;
      // 038: astore 8
      // 03a: aload 1
      // 03b: aload 2
      // 03c: aload 0
      // 03d: getfield nh4.oqj D
      // 040: invokevirtual fqr.p9z (Lfqr;D)Lfqr;
      // 043: astore 9
      // 045: istore 3
      // 046: aload 0
      // 047: aload 4
      // 049: invokespecial nh4.nz5 (Lfqr;)Z
      // 04c: iload 3
      // 04d: ifne 063
      // 050: ifne 05d
      // 053: goto 05a
      // 056: invokestatic nh4.b (Loov;)Loov;
      // 059: athrow
      // 05a: aconst_null
      // 05b: astore 4
      // 05d: aload 0
      // 05e: aload 5
      // 060: invokespecial nh4.nz5 (Lfqr;)Z
      // 063: iload 3
      // 064: ifne 07a
      // 067: ifne 074
      // 06a: goto 071
      // 06d: invokestatic nh4.b (Loov;)Loov;
      // 070: athrow
      // 071: aconst_null
      // 072: astore 5
      // 074: aload 0
      // 075: aload 6
      // 077: invokespecial nh4.bmn (Lfqr;)Z
      // 07a: iload 3
      // 07b: ifne 091
      // 07e: ifne 08b
      // 081: goto 088
      // 084: invokestatic nh4.b (Loov;)Loov;
      // 087: athrow
      // 088: aconst_null
      // 089: astore 6
      // 08b: aload 0
      // 08c: aload 7
      // 08e: invokespecial nh4.bmn (Lfqr;)Z
      // 091: iload 3
      // 092: ifne 0a8
      // 095: ifne 0a2
      // 098: goto 09f
      // 09b: invokestatic nh4.b (Loov;)Loov;
      // 09e: athrow
      // 09f: aconst_null
      // 0a0: astore 7
      // 0a2: aload 0
      // 0a3: aload 8
      // 0a5: invokespecial nh4.ntx (Lfqr;)Z
      // 0a8: iload 3
      // 0a9: ifne 0bf
      // 0ac: ifne 0b9
      // 0af: goto 0b6
      // 0b2: invokestatic nh4.b (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aconst_null
      // 0b7: astore 8
      // 0b9: aload 0
      // 0ba: aload 9
      // 0bc: invokespecial nh4.ntx (Lfqr;)Z
      // 0bf: ifne 0c5
      // 0c2: aconst_null
      // 0c3: astore 9
      // 0c5: aconst_null
      // 0c6: astore 10
      // 0c8: aload 4
      // 0ca: iload 3
      // 0cb: ifne 0da
      // 0ce: ifnull 0dc
      // 0d1: goto 0d8
      // 0d4: invokestatic nh4.b (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 4
      // 0da: astore 10
      // 0dc: aload 5
      // 0de: iload 3
      // 0df: ifne 132
      // 0e2: ifnull 130
      // 0e5: goto 0ec
      // 0e8: invokestatic nh4.b (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 10
      // 0ee: iload 3
      // 0ef: ifne 12e
      // 0f2: goto 0f9
      // 0f5: invokestatic nh4.b (Loov;)Loov;
      // 0f8: athrow
      // 0f9: ifnull 125
      // 0fc: goto 103
      // 0ff: invokestatic nh4.b (Loov;)Loov;
      // 102: athrow
      // 103: aload 1
      // 104: iload 3
      // 105: ifne 132
      // 108: goto 10f
      // 10b: invokestatic nh4.b (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 5
      // 111: invokevirtual fqr.y8x (Lfqr;)D
      // 114: aload 1
      // 115: aload 10
      // 117: invokevirtual fqr.y8x (Lfqr;)D
      // 11a: dcmpg
      // 11b: ifge 130
      // 11e: goto 125
      // 121: invokestatic nh4.b (Loov;)Loov;
      // 124: athrow
      // 125: aload 5
      // 127: goto 12e
      // 12a: invokestatic nh4.b (Loov;)Loov;
      // 12d: athrow
      // 12e: astore 10
      // 130: aload 6
      // 132: iload 3
      // 133: ifne 186
      // 136: ifnull 184
      // 139: goto 140
      // 13c: invokestatic nh4.b (Loov;)Loov;
      // 13f: athrow
      // 140: aload 10
      // 142: iload 3
      // 143: ifne 182
      // 146: goto 14d
      // 149: invokestatic nh4.b (Loov;)Loov;
      // 14c: athrow
      // 14d: ifnull 179
      // 150: goto 157
      // 153: invokestatic nh4.b (Loov;)Loov;
      // 156: athrow
      // 157: aload 1
      // 158: iload 3
      // 159: ifne 186
      // 15c: goto 163
      // 15f: invokestatic nh4.b (Loov;)Loov;
      // 162: athrow
      // 163: aload 6
      // 165: invokevirtual fqr.y8x (Lfqr;)D
      // 168: aload 1
      // 169: aload 10
      // 16b: invokevirtual fqr.y8x (Lfqr;)D
      // 16e: dcmpg
      // 16f: ifge 184
      // 172: goto 179
      // 175: invokestatic nh4.b (Loov;)Loov;
      // 178: athrow
      // 179: aload 6
      // 17b: goto 182
      // 17e: invokestatic nh4.b (Loov;)Loov;
      // 181: athrow
      // 182: astore 10
      // 184: aload 7
      // 186: iload 3
      // 187: ifne 1da
      // 18a: ifnull 1d8
      // 18d: goto 194
      // 190: invokestatic nh4.b (Loov;)Loov;
      // 193: athrow
      // 194: aload 10
      // 196: iload 3
      // 197: ifne 1d6
      // 19a: goto 1a1
      // 19d: invokestatic nh4.b (Loov;)Loov;
      // 1a0: athrow
      // 1a1: ifnull 1cd
      // 1a4: goto 1ab
      // 1a7: invokestatic nh4.b (Loov;)Loov;
      // 1aa: athrow
      // 1ab: aload 1
      // 1ac: iload 3
      // 1ad: ifne 1da
      // 1b0: goto 1b7
      // 1b3: invokestatic nh4.b (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 7
      // 1b9: invokevirtual fqr.y8x (Lfqr;)D
      // 1bc: aload 1
      // 1bd: aload 10
      // 1bf: invokevirtual fqr.y8x (Lfqr;)D
      // 1c2: dcmpg
      // 1c3: ifge 1d8
      // 1c6: goto 1cd
      // 1c9: invokestatic nh4.b (Loov;)Loov;
      // 1cc: athrow
      // 1cd: aload 7
      // 1cf: goto 1d6
      // 1d2: invokestatic nh4.b (Loov;)Loov;
      // 1d5: athrow
      // 1d6: astore 10
      // 1d8: aload 8
      // 1da: iload 3
      // 1db: ifne 22e
      // 1de: ifnull 22c
      // 1e1: goto 1e8
      // 1e4: invokestatic nh4.b (Loov;)Loov;
      // 1e7: athrow
      // 1e8: aload 10
      // 1ea: iload 3
      // 1eb: ifne 22a
      // 1ee: goto 1f5
      // 1f1: invokestatic nh4.b (Loov;)Loov;
      // 1f4: athrow
      // 1f5: ifnull 221
      // 1f8: goto 1ff
      // 1fb: invokestatic nh4.b (Loov;)Loov;
      // 1fe: athrow
      // 1ff: aload 1
      // 200: iload 3
      // 201: ifne 22e
      // 204: goto 20b
      // 207: invokestatic nh4.b (Loov;)Loov;
      // 20a: athrow
      // 20b: aload 8
      // 20d: invokevirtual fqr.y8x (Lfqr;)D
      // 210: aload 1
      // 211: aload 10
      // 213: invokevirtual fqr.y8x (Lfqr;)D
      // 216: dcmpg
      // 217: ifge 22c
      // 21a: goto 221
      // 21d: invokestatic nh4.b (Loov;)Loov;
      // 220: athrow
      // 221: aload 8
      // 223: goto 22a
      // 226: invokestatic nh4.b (Loov;)Loov;
      // 229: athrow
      // 22a: astore 10
      // 22c: aload 9
      // 22e: iload 3
      // 22f: ifne 282
      // 232: ifnull 280
      // 235: goto 23c
      // 238: invokestatic nh4.b (Loov;)Loov;
      // 23b: athrow
      // 23c: aload 10
      // 23e: iload 3
      // 23f: ifne 27e
      // 242: goto 249
      // 245: invokestatic nh4.b (Loov;)Loov;
      // 248: athrow
      // 249: ifnull 275
      // 24c: goto 253
      // 24f: invokestatic nh4.b (Loov;)Loov;
      // 252: athrow
      // 253: aload 1
      // 254: iload 3
      // 255: ifne 282
      // 258: goto 25f
      // 25b: invokestatic nh4.b (Loov;)Loov;
      // 25e: athrow
      // 25f: aload 9
      // 261: invokevirtual fqr.y8x (Lfqr;)D
      // 264: aload 1
      // 265: aload 10
      // 267: invokevirtual fqr.y8x (Lfqr;)D
      // 26a: dcmpg
      // 26b: ifge 280
      // 26e: goto 275
      // 271: invokestatic nh4.b (Loov;)Loov;
      // 274: athrow
      // 275: aload 9
      // 277: goto 27e
      // 27a: invokestatic nh4.b (Loov;)Loov;
      // 27d: athrow
      // 27e: astore 10
      // 280: aload 10
      // 282: ifnonnull 28b
      // 285: aconst_null
      // 286: areturn
      // 287: invokestatic nh4.b (Loov;)Loov;
      // 28a: athrow
      // 28b: aconst_null
      // 28c: astore 11
      // 28e: aload 10
      // 290: aload 4
      // 292: iload 3
      // 293: ifne 2ac
      // 296: if_acmpne 2a8
      // 299: goto 2a0
      // 29c: invokestatic nh4.b (Loov;)Loov;
      // 29f: athrow
      // 2a0: getstatic vt2.te4 Lvt2;
      // 2a3: astore 11
      // 2a5: goto 30a
      // 2a8: aload 10
      // 2aa: aload 5
      // 2ac: iload 3
      // 2ad: ifne 2c6
      // 2b0: if_acmpne 2c2
      // 2b3: goto 2ba
      // 2b6: invokestatic nh4.b (Loov;)Loov;
      // 2b9: athrow
      // 2ba: getstatic vt2.zk4 Lvt2;
      // 2bd: astore 11
      // 2bf: goto 30a
      // 2c2: aload 10
      // 2c4: aload 6
      // 2c6: iload 3
      // 2c7: ifne 2e0
      // 2ca: if_acmpne 2dc
      // 2cd: goto 2d4
      // 2d0: invokestatic nh4.b (Loov;)Loov;
      // 2d3: athrow
      // 2d4: getstatic vt2.m3r Lvt2;
      // 2d7: astore 11
      // 2d9: goto 30a
      // 2dc: aload 10
      // 2de: aload 7
      // 2e0: iload 3
      // 2e1: ifne 2fa
      // 2e4: if_acmpne 2f6
      // 2e7: goto 2ee
      // 2ea: invokestatic nh4.b (Loov;)Loov;
      // 2ed: athrow
      // 2ee: getstatic vt2.rf3 Lvt2;
      // 2f1: astore 11
      // 2f3: goto 30a
      // 2f6: aload 10
      // 2f8: aload 8
      // 2fa: if_acmpne 305
      // 2fd: getstatic vt2.z9q Lvt2;
      // 300: astore 11
      // 302: goto 30a
      // 305: getstatic vt2.mxp Lvt2;
      // 308: astore 11
      // 30a: new akm
      // 30d: dup
      // 30e: aload 10
      // 310: aload 11
      // 312: invokespecial akm.<init> (Lfqr;Lvt2;)V
      // 315: areturn
   }

   private boolean nz5(fqr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic nh4.b (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 91
      // 17: invokestatic nh4.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield fqr.gn5 D
      // 1f: aload 0
      // 20: getfield nh4.bx_ D
      // 23: dcmpl
      // 24: iload 2
      // 25: ifeq 42
      // 28: iflt 90
      // 2b: goto 32
      // 2e: invokestatic nh4.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: getfield fqr.gn5 D
      // 36: aload 0
      // 37: getfield nh4.i2c D
      // 3a: dcmpg
      // 3b: goto 42
      // 3e: invokestatic nh4.b (Loov;)Loov;
      // 41: athrow
      // 42: iload 2
      // 43: ifeq 60
      // 46: ifgt 90
      // 49: goto 50
      // 4c: invokestatic nh4.b (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: getfield fqr.bn2 D
      // 54: aload 0
      // 55: getfield nh4.t8n D
      // 58: dcmpl
      // 59: goto 60
      // 5c: invokestatic nh4.b (Loov;)Loov;
      // 5f: athrow
      // 60: iload 2
      // 61: ifeq 7e
      // 64: iflt 90
      // 67: goto 6e
      // 6a: invokestatic nh4.b (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 1
      // 6f: getfield fqr.bn2 D
      // 72: aload 0
      // 73: getfield nh4.oqj D
      // 76: dcmpg
      // 77: goto 7e
      // 7a: invokestatic nh4.b (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 2
      // 7f: ifeq 8d
      // 82: ifgt 90
      // 85: goto 8c
      // 88: invokestatic nh4.b (Loov;)Loov;
      // 8b: athrow
      // 8c: bipush 1
      // 8d: goto 91
      // 90: bipush 0
      // 91: ireturn
   }

   private boolean bmn(fqr param1) {
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
      // 05: iload 2
      // 06: ifne 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic nh4.b (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 91
      // 17: invokestatic nh4.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield fqr.lvi D
      // 1f: aload 0
      // 20: getfield nh4.rlc D
      // 23: dcmpl
      // 24: iload 2
      // 25: ifne 42
      // 28: iflt 90
      // 2b: goto 32
      // 2e: invokestatic nh4.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: getfield fqr.lvi D
      // 36: aload 0
      // 37: getfield nh4.t_2 D
      // 3a: dcmpg
      // 3b: goto 42
      // 3e: invokestatic nh4.b (Loov;)Loov;
      // 41: athrow
      // 42: iload 2
      // 43: ifne 60
      // 46: ifgt 90
      // 49: goto 50
      // 4c: invokestatic nh4.b (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: getfield fqr.bn2 D
      // 54: aload 0
      // 55: getfield nh4.t8n D
      // 58: dcmpl
      // 59: goto 60
      // 5c: invokestatic nh4.b (Loov;)Loov;
      // 5f: athrow
      // 60: iload 2
      // 61: ifne 7e
      // 64: iflt 90
      // 67: goto 6e
      // 6a: invokestatic nh4.b (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 1
      // 6f: getfield fqr.bn2 D
      // 72: aload 0
      // 73: getfield nh4.oqj D
      // 76: dcmpg
      // 77: goto 7e
      // 7a: invokestatic nh4.b (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 2
      // 7f: ifne 8d
      // 82: ifgt 90
      // 85: goto 8c
      // 88: invokestatic nh4.b (Loov;)Loov;
      // 8b: athrow
      // 8c: bipush 1
      // 8d: goto 91
      // 90: bipush 0
      // 91: ireturn
   }

   private boolean ntx(fqr param1) {
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
      // 05: iload 2
      // 06: ifne 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic nh4.b (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 91
      // 17: invokestatic nh4.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield fqr.lvi D
      // 1f: aload 0
      // 20: getfield nh4.rlc D
      // 23: dcmpl
      // 24: iload 2
      // 25: ifne 42
      // 28: iflt 90
      // 2b: goto 32
      // 2e: invokestatic nh4.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: getfield fqr.lvi D
      // 36: aload 0
      // 37: getfield nh4.t_2 D
      // 3a: dcmpg
      // 3b: goto 42
      // 3e: invokestatic nh4.b (Loov;)Loov;
      // 41: athrow
      // 42: iload 2
      // 43: ifne 60
      // 46: ifgt 90
      // 49: goto 50
      // 4c: invokestatic nh4.b (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: getfield fqr.gn5 D
      // 54: aload 0
      // 55: getfield nh4.bx_ D
      // 58: dcmpl
      // 59: goto 60
      // 5c: invokestatic nh4.b (Loov;)Loov;
      // 5f: athrow
      // 60: iload 2
      // 61: ifne 7e
      // 64: iflt 90
      // 67: goto 6e
      // 6a: invokestatic nh4.b (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 1
      // 6f: getfield fqr.gn5 D
      // 72: aload 0
      // 73: getfield nh4.i2c D
      // 76: dcmpg
      // 77: goto 7e
      // 7a: invokestatic nh4.b (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 2
      // 7f: ifne 8d
      // 82: ifgt 90
      // 85: goto 8c
      // 88: invokestatic nh4.b (Loov;)Loov;
      // 8b: athrow
      // 8c: bipush 1
      // 8d: goto 91
      // 90: bipush 0
      // 91: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 44097945246512L;
      return a<"u">(3061, 6782987001319996164L ^ var1)
         + this.rlc
         + a<"u">(15328, 8779889280322374418L ^ var1)
         + this.bx_
         + a<"u">(30993, 2512876531288263137L ^ var1)
         + this.t8n
         + a<"u">(22169, 1876710261888869994L ^ var1)
         + this.t_2
         + a<"u">(30993, 2512876531288263137L ^ var1)
         + this.i2c
         + a<"u">(30993, 2512876531288263137L ^ var1)
         + this.oqj
         + "]";
   }

   public boolean _03() {
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
      // 05: getfield nh4.rlc D
      // 08: invokestatic java/lang/Double.isNaN (D)Z
      // 0b: iload 1
      // 0c: ifeq a6
      // 0f: ifne a5
      // 12: goto 19
      // 15: invokestatic nh4.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield nh4.bx_ D
      // 1d: invokestatic java/lang/Double.isNaN (D)Z
      // 20: iload 1
      // 21: ifeq a6
      // 24: goto 2b
      // 27: invokestatic nh4.b (Loov;)Loov;
      // 2a: athrow
      // 2b: ifne a5
      // 2e: goto 35
      // 31: invokestatic nh4.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield nh4.t8n D
      // 39: invokestatic java/lang/Double.isNaN (D)Z
      // 3c: iload 1
      // 3d: ifeq a6
      // 40: goto 47
      // 43: invokestatic nh4.b (Loov;)Loov;
      // 46: athrow
      // 47: ifne a5
      // 4a: goto 51
      // 4d: invokestatic nh4.b (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield nh4.t_2 D
      // 55: invokestatic java/lang/Double.isNaN (D)Z
      // 58: iload 1
      // 59: ifeq a6
      // 5c: goto 63
      // 5f: invokestatic nh4.b (Loov;)Loov;
      // 62: athrow
      // 63: ifne a5
      // 66: goto 6d
      // 69: invokestatic nh4.b (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield nh4.i2c D
      // 71: invokestatic java/lang/Double.isNaN (D)Z
      // 74: iload 1
      // 75: ifeq a6
      // 78: goto 7f
      // 7b: invokestatic nh4.b (Loov;)Loov;
      // 7e: athrow
      // 7f: ifne a5
      // 82: goto 89
      // 85: invokestatic nh4.b (Loov;)Loov;
      // 88: athrow
      // 89: aload 0
      // 8a: getfield nh4.oqj D
      // 8d: invokestatic java/lang/Double.isNaN (D)Z
      // 90: iload 1
      // 91: ifeq a6
      // 94: goto 9b
      // 97: invokestatic nh4.b (Loov;)Loov;
      // 9a: athrow
      // 9b: ifeq a9
      // 9e: goto a5
      // a1: invokestatic nh4.b (Loov;)Loov;
      // a4: athrow
      // a5: bipush 1
      // a6: goto aa
      // a9: bipush 0
      // aa: ireturn
   }

   public void z6k(double var1, double var3, double var5) {
      this.rlc += var1;
      this.bx_ += var3;
      this.t8n += var5;
      this.t_2 += var1;
      this.i2c += var3;
      this.oqj += var5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1388134023000955164L, -5184322445464944044L, MethodHandles.lookup().lookupClass()).a(22219361261639L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 56914886676876L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "=Ýç\u001cáE\u001b³F\u0090+-^§!¿\u0010þ~{æ\u009ciD\u009eÊ\u007f%\u0001<gaz";
      int var8 = "=Ýç\u001cáE\u001b³F\u0090+-^§!¿\u0010þ~{æ\u009ciD\u009eÊ\u007f%\u0001<gaz".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "?¾âKgI\u0001=±*?!Ãýh¬\u0010m\u000f½Ê\u001b*l{\u0012p¹ÉS\u0013¸ã";
                  var8 = "?¾âKgI\u0001=±*?!Ãýh¬\u0010m\u000f½Ê\u001b*l{\u0012p¹ÉS\u0013¸ã".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8873;
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
            throw new RuntimeException("nh4", var10);
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
         throw new RuntimeException("nh4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
