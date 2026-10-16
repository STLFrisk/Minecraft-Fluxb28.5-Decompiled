import java.io.Serializable;

public class nbf extends xv0 implements Serializable {
   public static final long serialVersionUID = 7577479888820201099L;
   public static final double l0b = 1.0E-12;
   public static final double ogt = 1.0E-30;
   public static final double hnk = 1.57079632679;

   public nbf(double var1, double var3, double var5, double var7) {
      double var9 = 1.0 / Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5 + var7 * var7);
      this.yme = var1 * var9;
      this.pf8 = var3 * var9;
      this.jfe = var5 * var9;
      this.ggc = var7 * var9;
   }

   public nbf(double[] var1) {
      double var2 = 1.0 / Math.sqrt(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3]);
      this.yme = var1[0] * var2;
      this.pf8 = var1[1] * var2;
      this.jfe = var1[2] * var2;
      this.ggc = var1[3] * var2;
   }

   public nbf(nbf var1) {
      super(var1);
   }

   public nbf(lwt var1) {
      super(var1);
   }

   public nbf(rkj var1) {
      double var2 = 1.0 / Math.sqrt((double)(var1.hp2 * var1.hp2 + var1.nc_ * var1.nc_ + var1.ax5 * var1.ax5 + var1.ck3 * var1.ck3));
      this.yme = (double)var1.hp2 * var2;
      this.pf8 = (double)var1.nc_ * var2;
      this.jfe = (double)var1.ax5 * var2;
      this.ggc = (double)var1.ck3 * var2;
   }

   public nbf(xv0 var1) {
      double var2 = 1.0 / Math.sqrt(var1.yme * var1.yme + var1.pf8 * var1.pf8 + var1.jfe * var1.jfe + var1.ggc * var1.ggc);
      this.yme = var1.yme * var2;
      this.pf8 = var1.pf8 * var2;
      this.jfe = var1.jfe * var2;
      this.ggc = var1.ggc * var2;
   }

   public nbf() {
   }

   public final void y6x(nbf var1) {
      this.yme = -var1.yme;
      this.pf8 = -var1.pf8;
      this.jfe = -var1.jfe;
      this.ggc = var1.ggc;
   }

   public final void mif() {
      this.yme = -this.yme;
      this.pf8 = -this.pf8;
      this.jfe = -this.jfe;
   }

   public final void lbe(nbf param1, nbf param2) {
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
      // 005: iload 3
      // 006: ifeq 0ea
      // 009: aload 1
      // 00a: if_acmpeq 0e2
      // 00d: goto 014
      // 010: invokestatic nbf.a (Loov;)Loov;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 0ea
      // 019: goto 020
      // 01c: invokestatic nbf.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 0e2
      // 024: goto 02b
      // 027: invokestatic nbf.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield nbf.ggc D
      // 030: aload 2
      // 031: getfield nbf.ggc D
      // 034: dmul
      // 035: aload 1
      // 036: getfield nbf.yme D
      // 039: aload 2
      // 03a: getfield nbf.yme D
      // 03d: dmul
      // 03e: dsub
      // 03f: aload 1
      // 040: getfield nbf.pf8 D
      // 043: aload 2
      // 044: getfield nbf.pf8 D
      // 047: dmul
      // 048: dsub
      // 049: aload 1
      // 04a: getfield nbf.jfe D
      // 04d: aload 2
      // 04e: getfield nbf.jfe D
      // 051: dmul
      // 052: dsub
      // 053: putfield nbf.ggc D
      // 056: aload 0
      // 057: aload 1
      // 058: getfield nbf.ggc D
      // 05b: aload 2
      // 05c: getfield nbf.yme D
      // 05f: dmul
      // 060: aload 2
      // 061: getfield nbf.ggc D
      // 064: aload 1
      // 065: getfield nbf.yme D
      // 068: dmul
      // 069: dadd
      // 06a: aload 1
      // 06b: getfield nbf.pf8 D
      // 06e: aload 2
      // 06f: getfield nbf.jfe D
      // 072: dmul
      // 073: dadd
      // 074: aload 1
      // 075: getfield nbf.jfe D
      // 078: aload 2
      // 079: getfield nbf.pf8 D
      // 07c: dmul
      // 07d: dsub
      // 07e: putfield nbf.yme D
      // 081: aload 0
      // 082: aload 1
      // 083: getfield nbf.ggc D
      // 086: aload 2
      // 087: getfield nbf.pf8 D
      // 08a: dmul
      // 08b: aload 2
      // 08c: getfield nbf.ggc D
      // 08f: aload 1
      // 090: getfield nbf.pf8 D
      // 093: dmul
      // 094: dadd
      // 095: aload 1
      // 096: getfield nbf.yme D
      // 099: aload 2
      // 09a: getfield nbf.jfe D
      // 09d: dmul
      // 09e: dsub
      // 09f: aload 1
      // 0a0: getfield nbf.jfe D
      // 0a3: aload 2
      // 0a4: getfield nbf.yme D
      // 0a7: dmul
      // 0a8: dadd
      // 0a9: putfield nbf.pf8 D
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield nbf.ggc D
      // 0b1: aload 2
      // 0b2: getfield nbf.jfe D
      // 0b5: dmul
      // 0b6: aload 2
      // 0b7: getfield nbf.ggc D
      // 0ba: aload 1
      // 0bb: getfield nbf.jfe D
      // 0be: dmul
      // 0bf: dadd
      // 0c0: aload 1
      // 0c1: getfield nbf.yme D
      // 0c4: aload 2
      // 0c5: getfield nbf.pf8 D
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: aload 1
      // 0cb: getfield nbf.pf8 D
      // 0ce: aload 2
      // 0cf: getfield nbf.yme D
      // 0d2: dmul
      // 0d3: dsub
      // 0d4: putfield nbf.jfe D
      // 0d7: iload 3
      // 0d8: ifne 1a1
      // 0db: goto 0e2
      // 0de: invokestatic nbf.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: goto 0ea
      // 0e6: invokestatic nbf.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: getfield nbf.ggc D
      // 0ed: aload 2
      // 0ee: getfield nbf.ggc D
      // 0f1: dmul
      // 0f2: aload 1
      // 0f3: getfield nbf.yme D
      // 0f6: aload 2
      // 0f7: getfield nbf.yme D
      // 0fa: dmul
      // 0fb: dsub
      // 0fc: aload 1
      // 0fd: getfield nbf.pf8 D
      // 100: aload 2
      // 101: getfield nbf.pf8 D
      // 104: dmul
      // 105: dsub
      // 106: aload 1
      // 107: getfield nbf.jfe D
      // 10a: aload 2
      // 10b: getfield nbf.jfe D
      // 10e: dmul
      // 10f: dsub
      // 110: dstore 8
      // 112: aload 1
      // 113: getfield nbf.ggc D
      // 116: aload 2
      // 117: getfield nbf.yme D
      // 11a: dmul
      // 11b: aload 2
      // 11c: getfield nbf.ggc D
      // 11f: aload 1
      // 120: getfield nbf.yme D
      // 123: dmul
      // 124: dadd
      // 125: aload 1
      // 126: getfield nbf.pf8 D
      // 129: aload 2
      // 12a: getfield nbf.jfe D
      // 12d: dmul
      // 12e: dadd
      // 12f: aload 1
      // 130: getfield nbf.jfe D
      // 133: aload 2
      // 134: getfield nbf.pf8 D
      // 137: dmul
      // 138: dsub
      // 139: dstore 4
      // 13b: aload 1
      // 13c: getfield nbf.ggc D
      // 13f: aload 2
      // 140: getfield nbf.pf8 D
      // 143: dmul
      // 144: aload 2
      // 145: getfield nbf.ggc D
      // 148: aload 1
      // 149: getfield nbf.pf8 D
      // 14c: dmul
      // 14d: dadd
      // 14e: aload 1
      // 14f: getfield nbf.yme D
      // 152: aload 2
      // 153: getfield nbf.jfe D
      // 156: dmul
      // 157: dsub
      // 158: aload 1
      // 159: getfield nbf.jfe D
      // 15c: aload 2
      // 15d: getfield nbf.yme D
      // 160: dmul
      // 161: dadd
      // 162: dstore 6
      // 164: aload 0
      // 165: aload 1
      // 166: getfield nbf.ggc D
      // 169: aload 2
      // 16a: getfield nbf.jfe D
      // 16d: dmul
      // 16e: aload 2
      // 16f: getfield nbf.ggc D
      // 172: aload 1
      // 173: getfield nbf.jfe D
      // 176: dmul
      // 177: dadd
      // 178: aload 1
      // 179: getfield nbf.yme D
      // 17c: aload 2
      // 17d: getfield nbf.pf8 D
      // 180: dmul
      // 181: dadd
      // 182: aload 1
      // 183: getfield nbf.pf8 D
      // 186: aload 2
      // 187: getfield nbf.yme D
      // 18a: dmul
      // 18b: dsub
      // 18c: putfield nbf.jfe D
      // 18f: aload 0
      // 190: dload 8
      // 192: putfield nbf.ggc D
      // 195: aload 0
      // 196: dload 4
      // 198: putfield nbf.yme D
      // 19b: aload 0
      // 19c: dload 6
      // 19e: putfield nbf.pf8 D
      // 1a1: return
   }

   public final void n14(nbf var1) {
      double var6 = this.ggc * var1.ggc - this.yme * var1.yme - this.pf8 * var1.pf8 - this.jfe * var1.jfe;
      double var2 = this.ggc * var1.yme + var1.ggc * this.yme + this.pf8 * var1.jfe - this.jfe * var1.pf8;
      double var4 = this.ggc * var1.pf8 + var1.ggc * this.pf8 - this.yme * var1.jfe + this.jfe * var1.yme;
      this.jfe = this.ggc * var1.jfe + var1.ggc * this.jfe + this.yme * var1.pf8 - this.pf8 * var1.yme;
      this.ggc = var6;
      this.yme = var2;
      this.pf8 = var4;
   }

   public final void hq4(nbf var1, nbf var2) {
      nbf var3 = new nbf(var2);
      var3.zj8();
      this.lbe(var1, var3);
   }

   public final void ep9(nbf var1) {
      nbf var2 = new nbf(var1);
      var2.zj8();
      this.n14(var2);
   }

   public final void l9w(nbf var1) {
      double var2 = 1.0 / (var1.ggc * var1.ggc + var1.yme * var1.yme + var1.pf8 * var1.pf8 + var1.jfe * var1.jfe);
      this.ggc = var2 * var1.ggc;
      this.yme = -var2 * var1.yme;
      this.pf8 = -var2 * var1.pf8;
      this.jfe = -var2 * var1.jfe;
   }

   public final void zj8() {
      double var1 = 1.0 / (this.ggc * this.ggc + this.yme * this.yme + this.pf8 * this.pf8 + this.jfe * this.jfe);
      this.ggc *= var1;
      this.yme *= -var1;
      this.pf8 *= -var1;
      this.jfe *= -var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void moi(nbf var1) {
      int var2 = t9d.b();
      double var3 = var1.yme * var1.yme + var1.pf8 * var1.pf8 + var1.jfe * var1.jfe + var1.ggc * var1.ggc;

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var3 > 0.0)) {
                  break label41;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var3 = 1.0 / Math.sqrt(var3);

            try {
               this.yme = var3 * var1.yme;
               this.pf8 = var3 * var1.pf8;
               this.jfe = var3 * var1.jfe;
               this.ggc = var3 * var1.ggc;
               if (var2 != 0) {
                  return;
               }
            } catch (oov var6) {
               boolean var10001 = false;
               throw a(var6);
            }
         }

         try {
            this.yme = 0.0;
            this.pf8 = 0.0;
            this.jfe = 0.0;
         } catch (oov var5) {
            boolean var9 = false;
            throw a(var5);
         }
      }

      this.ggc = 0.0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void orm() {
      int var1 = t9d.b();
      double var2 = this.yme * this.yme + this.pf8 * this.pf8 + this.jfe * this.jfe + this.ggc * this.ggc;

      label46: {
         label41: {
            try {
               if (var1 == 0) {
                  break label46;
               }

               if (!(var2 > 0.0)) {
                  break label41;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var2 = 1.0 / Math.sqrt(var2);

            try {
               this.yme *= var2;
               this.pf8 *= var2;
               this.jfe *= var2;
               this.ggc *= var2;
               if (var1 != 0) {
                  return;
               }
            } catch (oov var5) {
               boolean var10001 = false;
               throw a(var5);
            }
         }

         try {
            this.yme = 0.0;
            this.pf8 = 0.0;
            this.jfe = 0.0;
         } catch (oov var4) {
            boolean var8 = false;
            throw a(var4);
         }
      }

      this.ggc = 0.0;
   }

   public final void qv0(krg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: ldc2_w 0.25
      // 007: aload 1
      // 008: getfield krg.j8s F
      // 00b: aload 1
      // 00c: getfield krg.rqb F
      // 00f: fadd
      // 010: aload 1
      // 011: getfield krg.fmx F
      // 014: fadd
      // 015: aload 1
      // 016: getfield krg._40 F
      // 019: fadd
      // 01a: f2d
      // 01b: dmul
      // 01c: dstore 3
      // 01d: iload 2
      // 01e: ifne 09e
      // 021: dload 3
      // 022: dconst_0
      // 023: dcmpl
      // 024: iflt 08a
      // 027: goto 02e
      // 02a: invokestatic nbf.a (Loov;)Loov;
      // 02d: athrow
      // 02e: dload 3
      // 02f: ldc2_w 1.0E-30
      // 032: dcmpl
      // 033: iload 2
      // 034: ifne 0c1
      // 037: goto 03e
      // 03a: invokestatic nbf.a (Loov;)Loov;
      // 03d: athrow
      // 03e: iflt 09f
      // 041: goto 048
      // 044: invokestatic nbf.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: dload 3
      // 04a: invokestatic java/lang/Math.sqrt (D)D
      // 04d: putfield nbf.ggc D
      // 050: ldc2_w 0.25
      // 053: aload 0
      // 054: getfield nbf.ggc D
      // 057: ddiv
      // 058: dstore 3
      // 059: aload 0
      // 05a: aload 1
      // 05b: getfield krg.w4_ F
      // 05e: aload 1
      // 05f: getfield krg.sjv F
      // 062: fsub
      // 063: f2d
      // 064: dload 3
      // 065: dmul
      // 066: putfield nbf.yme D
      // 069: aload 0
      // 06a: aload 1
      // 06b: getfield krg.vwt F
      // 06e: aload 1
      // 06f: getfield krg.zcz F
      // 072: fsub
      // 073: f2d
      // 074: dload 3
      // 075: dmul
      // 076: putfield nbf.pf8 D
      // 079: aload 0
      // 07a: aload 1
      // 07b: getfield krg.fno F
      // 07e: aload 1
      // 07f: getfield krg.f28 F
      // 082: fsub
      // 083: f2d
      // 084: dload 3
      // 085: dmul
      // 086: putfield nbf.jfe D
      // 089: return
      // 08a: aload 0
      // 08b: dconst_0
      // 08c: putfield nbf.ggc D
      // 08f: aload 0
      // 090: dconst_0
      // 091: putfield nbf.yme D
      // 094: aload 0
      // 095: dconst_0
      // 096: putfield nbf.pf8 D
      // 099: aload 0
      // 09a: dconst_1
      // 09b: putfield nbf.jfe D
      // 09e: return
      // 09f: aload 0
      // 0a0: dconst_0
      // 0a1: putfield nbf.ggc D
      // 0a4: ldc2_w -0.5
      // 0a7: aload 1
      // 0a8: getfield krg.rqb F
      // 0ab: aload 1
      // 0ac: getfield krg.fmx F
      // 0af: fadd
      // 0b0: f2d
      // 0b1: dmul
      // 0b2: dstore 3
      // 0b3: iload 2
      // 0b4: ifne 117
      // 0b7: dload 3
      // 0b8: dconst_0
      // 0b9: dcmpl
      // 0ba: goto 0c1
      // 0bd: invokestatic nbf.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iflt 108
      // 0c4: dload 3
      // 0c5: ldc2_w 1.0E-30
      // 0c8: dcmpl
      // 0c9: iload 2
      // 0ca: ifne 139
      // 0cd: goto 0d4
      // 0d0: invokestatic nbf.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: iflt 118
      // 0d7: goto 0de
      // 0da: invokestatic nbf.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: dload 3
      // 0e0: invokestatic java/lang/Math.sqrt (D)D
      // 0e3: putfield nbf.yme D
      // 0e6: dconst_1
      // 0e7: ldc2_w 2.0
      // 0ea: aload 0
      // 0eb: getfield nbf.yme D
      // 0ee: dmul
      // 0ef: ddiv
      // 0f0: dstore 3
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield krg.fno F
      // 0f6: f2d
      // 0f7: dload 3
      // 0f8: dmul
      // 0f9: putfield nbf.pf8 D
      // 0fc: aload 0
      // 0fd: aload 1
      // 0fe: getfield krg.zcz F
      // 101: f2d
      // 102: dload 3
      // 103: dmul
      // 104: putfield nbf.jfe D
      // 107: return
      // 108: aload 0
      // 109: dconst_0
      // 10a: putfield nbf.yme D
      // 10d: aload 0
      // 10e: dconst_0
      // 10f: putfield nbf.pf8 D
      // 112: aload 0
      // 113: dconst_1
      // 114: putfield nbf.jfe D
      // 117: return
      // 118: aload 0
      // 119: dconst_0
      // 11a: putfield nbf.yme D
      // 11d: ldc2_w 0.5
      // 120: dconst_1
      // 121: aload 1
      // 122: getfield krg.fmx F
      // 125: f2d
      // 126: dsub
      // 127: dmul
      // 128: dstore 3
      // 129: iload 2
      // 12a: ifne 165
      // 12d: dload 3
      // 12e: ldc2_w 1.0E-30
      // 131: dcmpl
      // 132: goto 139
      // 135: invokestatic nbf.a (Loov;)Loov;
      // 138: athrow
      // 139: iflt 15b
      // 13c: aload 0
      // 13d: dload 3
      // 13e: invokestatic java/lang/Math.sqrt (D)D
      // 141: putfield nbf.pf8 D
      // 144: aload 0
      // 145: aload 1
      // 146: getfield krg.w4_ F
      // 149: f2d
      // 14a: ldc2_w 2.0
      // 14d: aload 0
      // 14e: getfield nbf.pf8 D
      // 151: dmul
      // 152: ddiv
      // 153: putfield nbf.jfe D
      // 156: return
      // 157: invokestatic nbf.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 0
      // 15c: dconst_0
      // 15d: putfield nbf.pf8 D
      // 160: aload 0
      // 161: dconst_1
      // 162: putfield nbf.jfe D
      // 165: return
   }

   public final void npa(nf1 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: ldc2_w 0.25
      // 007: aload 1
      // 008: getfield nf1.jf3 D
      // 00b: aload 1
      // 00c: getfield nf1._6_ D
      // 00f: dadd
      // 010: aload 1
      // 011: getfield nf1.o_8 D
      // 014: dadd
      // 015: aload 1
      // 016: getfield nf1.f36 D
      // 019: dadd
      // 01a: dmul
      // 01b: dstore 3
      // 01c: iload 2
      // 01d: ifne 09a
      // 020: dload 3
      // 021: dconst_0
      // 022: dcmpl
      // 023: iflt 086
      // 026: goto 02d
      // 029: invokestatic nbf.a (Loov;)Loov;
      // 02c: athrow
      // 02d: dload 3
      // 02e: ldc2_w 1.0E-30
      // 031: dcmpl
      // 032: iload 2
      // 033: ifne 0bc
      // 036: goto 03d
      // 039: invokestatic nbf.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iflt 09b
      // 040: goto 047
      // 043: invokestatic nbf.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: dload 3
      // 049: invokestatic java/lang/Math.sqrt (D)D
      // 04c: putfield nbf.ggc D
      // 04f: ldc2_w 0.25
      // 052: aload 0
      // 053: getfield nbf.ggc D
      // 056: ddiv
      // 057: dstore 3
      // 058: aload 0
      // 059: aload 1
      // 05a: getfield nf1.nqj D
      // 05d: aload 1
      // 05e: getfield nf1.m10 D
      // 061: dsub
      // 062: dload 3
      // 063: dmul
      // 064: putfield nbf.yme D
      // 067: aload 0
      // 068: aload 1
      // 069: getfield nf1.j_n D
      // 06c: aload 1
      // 06d: getfield nf1.ji8 D
      // 070: dsub
      // 071: dload 3
      // 072: dmul
      // 073: putfield nbf.pf8 D
      // 076: aload 0
      // 077: aload 1
      // 078: getfield nf1.sgz D
      // 07b: aload 1
      // 07c: getfield nf1.o1a D
      // 07f: dsub
      // 080: dload 3
      // 081: dmul
      // 082: putfield nbf.jfe D
      // 085: return
      // 086: aload 0
      // 087: dconst_0
      // 088: putfield nbf.ggc D
      // 08b: aload 0
      // 08c: dconst_0
      // 08d: putfield nbf.yme D
      // 090: aload 0
      // 091: dconst_0
      // 092: putfield nbf.pf8 D
      // 095: aload 0
      // 096: dconst_1
      // 097: putfield nbf.jfe D
      // 09a: return
      // 09b: aload 0
      // 09c: dconst_0
      // 09d: putfield nbf.ggc D
      // 0a0: ldc2_w -0.5
      // 0a3: aload 1
      // 0a4: getfield nf1._6_ D
      // 0a7: aload 1
      // 0a8: getfield nf1.o_8 D
      // 0ab: dadd
      // 0ac: dmul
      // 0ad: dstore 3
      // 0ae: iload 2
      // 0af: ifne 10e
      // 0b2: dload 3
      // 0b3: dconst_0
      // 0b4: dcmpl
      // 0b5: goto 0bc
      // 0b8: invokestatic nbf.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: iflt 0ff
      // 0bf: dload 3
      // 0c0: ldc2_w 1.0E-30
      // 0c3: dcmpl
      // 0c4: iload 2
      // 0c5: ifne 12f
      // 0c8: goto 0cf
      // 0cb: invokestatic nbf.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iflt 10f
      // 0d2: goto 0d9
      // 0d5: invokestatic nbf.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: dload 3
      // 0db: invokestatic java/lang/Math.sqrt (D)D
      // 0de: putfield nbf.yme D
      // 0e1: ldc2_w 0.5
      // 0e4: aload 0
      // 0e5: getfield nbf.yme D
      // 0e8: ddiv
      // 0e9: dstore 3
      // 0ea: aload 0
      // 0eb: aload 1
      // 0ec: getfield nf1.sgz D
      // 0ef: dload 3
      // 0f0: dmul
      // 0f1: putfield nbf.pf8 D
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: getfield nf1.ji8 D
      // 0f9: dload 3
      // 0fa: dmul
      // 0fb: putfield nbf.jfe D
      // 0fe: return
      // 0ff: aload 0
      // 100: dconst_0
      // 101: putfield nbf.yme D
      // 104: aload 0
      // 105: dconst_0
      // 106: putfield nbf.pf8 D
      // 109: aload 0
      // 10a: dconst_1
      // 10b: putfield nbf.jfe D
      // 10e: return
      // 10f: aload 0
      // 110: dconst_0
      // 111: putfield nbf.yme D
      // 114: ldc2_w 0.5
      // 117: dconst_1
      // 118: aload 1
      // 119: getfield nf1.o_8 D
      // 11c: dsub
      // 11d: dmul
      // 11e: dstore 3
      // 11f: iload 2
      // 120: ifne 15a
      // 123: dload 3
      // 124: ldc2_w 1.0E-30
      // 127: dcmpl
      // 128: goto 12f
      // 12b: invokestatic nbf.a (Loov;)Loov;
      // 12e: athrow
      // 12f: iflt 150
      // 132: aload 0
      // 133: dload 3
      // 134: invokestatic java/lang/Math.sqrt (D)D
      // 137: putfield nbf.pf8 D
      // 13a: aload 0
      // 13b: aload 1
      // 13c: getfield nf1.nqj D
      // 13f: ldc2_w 2.0
      // 142: aload 0
      // 143: getfield nbf.pf8 D
      // 146: dmul
      // 147: ddiv
      // 148: putfield nbf.jfe D
      // 14b: return
      // 14c: invokestatic nbf.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 0
      // 151: dconst_0
      // 152: putfield nbf.pf8 D
      // 155: aload 0
      // 156: dconst_1
      // 157: putfield nbf.jfe D
      // 15a: return
   }

   public final void _cr(nvj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: ldc2_w 0.25
      // 007: aload 1
      // 008: getfield nvj.i2i F
      // 00b: aload 1
      // 00c: getfield nvj.aoj F
      // 00f: fadd
      // 010: aload 1
      // 011: getfield nvj.jr8 F
      // 014: fadd
      // 015: f2d
      // 016: dconst_1
      // 017: dadd
      // 018: dmul
      // 019: dstore 3
      // 01a: iload 2
      // 01b: ifne 09b
      // 01e: dload 3
      // 01f: dconst_0
      // 020: dcmpl
      // 021: iflt 087
      // 024: goto 02b
      // 027: invokestatic nbf.a (Loov;)Loov;
      // 02a: athrow
      // 02b: dload 3
      // 02c: ldc2_w 1.0E-30
      // 02f: dcmpl
      // 030: iload 2
      // 031: ifne 0be
      // 034: goto 03b
      // 037: invokestatic nbf.a (Loov;)Loov;
      // 03a: athrow
      // 03b: iflt 09c
      // 03e: goto 045
      // 041: invokestatic nbf.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: dload 3
      // 047: invokestatic java/lang/Math.sqrt (D)D
      // 04a: putfield nbf.ggc D
      // 04d: ldc2_w 0.25
      // 050: aload 0
      // 051: getfield nbf.ggc D
      // 054: ddiv
      // 055: dstore 3
      // 056: aload 0
      // 057: aload 1
      // 058: getfield nvj.wdt F
      // 05b: aload 1
      // 05c: getfield nvj.zk_ F
      // 05f: fsub
      // 060: f2d
      // 061: dload 3
      // 062: dmul
      // 063: putfield nbf.yme D
      // 066: aload 0
      // 067: aload 1
      // 068: getfield nvj.xu6 F
      // 06b: aload 1
      // 06c: getfield nvj.aqg F
      // 06f: fsub
      // 070: f2d
      // 071: dload 3
      // 072: dmul
      // 073: putfield nbf.pf8 D
      // 076: aload 0
      // 077: aload 1
      // 078: getfield nvj._id F
      // 07b: aload 1
      // 07c: getfield nvj.k12 F
      // 07f: fsub
      // 080: f2d
      // 081: dload 3
      // 082: dmul
      // 083: putfield nbf.jfe D
      // 086: return
      // 087: aload 0
      // 088: dconst_0
      // 089: putfield nbf.ggc D
      // 08c: aload 0
      // 08d: dconst_0
      // 08e: putfield nbf.yme D
      // 091: aload 0
      // 092: dconst_0
      // 093: putfield nbf.pf8 D
      // 096: aload 0
      // 097: dconst_1
      // 098: putfield nbf.jfe D
      // 09b: return
      // 09c: aload 0
      // 09d: dconst_0
      // 09e: putfield nbf.ggc D
      // 0a1: ldc2_w -0.5
      // 0a4: aload 1
      // 0a5: getfield nvj.aoj F
      // 0a8: aload 1
      // 0a9: getfield nvj.jr8 F
      // 0ac: fadd
      // 0ad: f2d
      // 0ae: dmul
      // 0af: dstore 3
      // 0b0: iload 2
      // 0b1: ifne 112
      // 0b4: dload 3
      // 0b5: dconst_0
      // 0b6: dcmpl
      // 0b7: goto 0be
      // 0ba: invokestatic nbf.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: iflt 103
      // 0c1: dload 3
      // 0c2: ldc2_w 1.0E-30
      // 0c5: dcmpl
      // 0c6: iload 2
      // 0c7: ifne 134
      // 0ca: goto 0d1
      // 0cd: invokestatic nbf.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iflt 113
      // 0d4: goto 0db
      // 0d7: invokestatic nbf.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: dload 3
      // 0dd: invokestatic java/lang/Math.sqrt (D)D
      // 0e0: putfield nbf.yme D
      // 0e3: ldc2_w 0.5
      // 0e6: aload 0
      // 0e7: getfield nbf.yme D
      // 0ea: ddiv
      // 0eb: dstore 3
      // 0ec: aload 0
      // 0ed: aload 1
      // 0ee: getfield nvj._id F
      // 0f1: f2d
      // 0f2: dload 3
      // 0f3: dmul
      // 0f4: putfield nbf.pf8 D
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: getfield nvj.aqg F
      // 0fc: f2d
      // 0fd: dload 3
      // 0fe: dmul
      // 0ff: putfield nbf.jfe D
      // 102: return
      // 103: aload 0
      // 104: dconst_0
      // 105: putfield nbf.yme D
      // 108: aload 0
      // 109: dconst_0
      // 10a: putfield nbf.pf8 D
      // 10d: aload 0
      // 10e: dconst_1
      // 10f: putfield nbf.jfe D
      // 112: return
      // 113: aload 0
      // 114: dconst_0
      // 115: putfield nbf.yme D
      // 118: ldc2_w 0.5
      // 11b: dconst_1
      // 11c: aload 1
      // 11d: getfield nvj.jr8 F
      // 120: f2d
      // 121: dsub
      // 122: dmul
      // 123: dstore 3
      // 124: iload 2
      // 125: ifne 162
      // 128: dload 3
      // 129: ldc2_w 1.0E-30
      // 12c: dcmpl
      // 12d: goto 134
      // 130: invokestatic nbf.a (Loov;)Loov;
      // 133: athrow
      // 134: iflt 158
      // 137: aload 0
      // 138: dload 3
      // 139: invokestatic java/lang/Math.sqrt (D)D
      // 13c: putfield nbf.pf8 D
      // 13f: aload 0
      // 140: aload 1
      // 141: getfield nvj.wdt F
      // 144: f2d
      // 145: ldc2_w 2.0
      // 148: aload 0
      // 149: getfield nbf.pf8 D
      // 14c: dmul
      // 14d: ddiv
      // 14e: putfield nbf.jfe D
      // 151: goto 158
      // 154: invokestatic nbf.a (Loov;)Loov;
      // 157: athrow
      // 158: aload 0
      // 159: dconst_0
      // 15a: putfield nbf.pf8 D
      // 15d: aload 0
      // 15e: dconst_1
      // 15f: putfield nbf.jfe D
      // 162: return
   }

   public final void leb(iww param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: ldc2_w 0.25
      // 007: aload 1
      // 008: getfield iww.lxb D
      // 00b: aload 1
      // 00c: getfield iww.pwn D
      // 00f: dadd
      // 010: aload 1
      // 011: getfield iww.ffq D
      // 014: dadd
      // 015: dconst_1
      // 016: dadd
      // 017: dmul
      // 018: dstore 3
      // 019: iload 2
      // 01a: ifne 097
      // 01d: dload 3
      // 01e: dconst_0
      // 01f: dcmpl
      // 020: iflt 083
      // 023: goto 02a
      // 026: invokestatic nbf.a (Loov;)Loov;
      // 029: athrow
      // 02a: dload 3
      // 02b: ldc2_w 1.0E-30
      // 02e: dcmpl
      // 02f: iload 2
      // 030: ifne 0b9
      // 033: goto 03a
      // 036: invokestatic nbf.a (Loov;)Loov;
      // 039: athrow
      // 03a: iflt 098
      // 03d: goto 044
      // 040: invokestatic nbf.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: dload 3
      // 046: invokestatic java/lang/Math.sqrt (D)D
      // 049: putfield nbf.ggc D
      // 04c: ldc2_w 0.25
      // 04f: aload 0
      // 050: getfield nbf.ggc D
      // 053: ddiv
      // 054: dstore 3
      // 055: aload 0
      // 056: aload 1
      // 057: getfield iww._o7 D
      // 05a: aload 1
      // 05b: getfield iww.c84 D
      // 05e: dsub
      // 05f: dload 3
      // 060: dmul
      // 061: putfield nbf.yme D
      // 064: aload 0
      // 065: aload 1
      // 066: getfield iww.bhd D
      // 069: aload 1
      // 06a: getfield iww.y7q D
      // 06d: dsub
      // 06e: dload 3
      // 06f: dmul
      // 070: putfield nbf.pf8 D
      // 073: aload 0
      // 074: aload 1
      // 075: getfield iww.get D
      // 078: aload 1
      // 079: getfield iww.y3c D
      // 07c: dsub
      // 07d: dload 3
      // 07e: dmul
      // 07f: putfield nbf.jfe D
      // 082: return
      // 083: aload 0
      // 084: dconst_0
      // 085: putfield nbf.ggc D
      // 088: aload 0
      // 089: dconst_0
      // 08a: putfield nbf.yme D
      // 08d: aload 0
      // 08e: dconst_0
      // 08f: putfield nbf.pf8 D
      // 092: aload 0
      // 093: dconst_1
      // 094: putfield nbf.jfe D
      // 097: return
      // 098: aload 0
      // 099: dconst_0
      // 09a: putfield nbf.ggc D
      // 09d: ldc2_w -0.5
      // 0a0: aload 1
      // 0a1: getfield iww.pwn D
      // 0a4: aload 1
      // 0a5: getfield iww.ffq D
      // 0a8: dadd
      // 0a9: dmul
      // 0aa: dstore 3
      // 0ab: iload 2
      // 0ac: ifne 10b
      // 0af: dload 3
      // 0b0: dconst_0
      // 0b1: dcmpl
      // 0b2: goto 0b9
      // 0b5: invokestatic nbf.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: iflt 0fc
      // 0bc: dload 3
      // 0bd: ldc2_w 1.0E-30
      // 0c0: dcmpl
      // 0c1: iload 2
      // 0c2: ifne 12c
      // 0c5: goto 0cc
      // 0c8: invokestatic nbf.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: iflt 10c
      // 0cf: goto 0d6
      // 0d2: invokestatic nbf.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: dload 3
      // 0d8: invokestatic java/lang/Math.sqrt (D)D
      // 0db: putfield nbf.yme D
      // 0de: ldc2_w 0.5
      // 0e1: aload 0
      // 0e2: getfield nbf.yme D
      // 0e5: ddiv
      // 0e6: dstore 3
      // 0e7: aload 0
      // 0e8: aload 1
      // 0e9: getfield iww.get D
      // 0ec: dload 3
      // 0ed: dmul
      // 0ee: putfield nbf.pf8 D
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield iww.y7q D
      // 0f6: dload 3
      // 0f7: dmul
      // 0f8: putfield nbf.jfe D
      // 0fb: return
      // 0fc: aload 0
      // 0fd: dconst_0
      // 0fe: putfield nbf.yme D
      // 101: aload 0
      // 102: dconst_0
      // 103: putfield nbf.pf8 D
      // 106: aload 0
      // 107: dconst_1
      // 108: putfield nbf.jfe D
      // 10b: return
      // 10c: aload 0
      // 10d: dconst_0
      // 10e: putfield nbf.yme D
      // 111: ldc2_w 0.5
      // 114: dconst_1
      // 115: aload 1
      // 116: getfield iww.ffq D
      // 119: dsub
      // 11a: dmul
      // 11b: dstore 3
      // 11c: iload 2
      // 11d: ifne 157
      // 120: dload 3
      // 121: ldc2_w 1.0E-30
      // 124: dcmpl
      // 125: goto 12c
      // 128: invokestatic nbf.a (Loov;)Loov;
      // 12b: athrow
      // 12c: iflt 14d
      // 12f: aload 0
      // 130: dload 3
      // 131: invokestatic java/lang/Math.sqrt (D)D
      // 134: putfield nbf.pf8 D
      // 137: aload 0
      // 138: aload 1
      // 139: getfield iww._o7 D
      // 13c: ldc2_w 2.0
      // 13f: aload 0
      // 140: getfield nbf.pf8 D
      // 143: dmul
      // 144: ddiv
      // 145: putfield nbf.jfe D
      // 148: return
      // 149: invokestatic nbf.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: dconst_0
      // 14f: putfield nbf.pf8 D
      // 152: aload 0
      // 153: dconst_1
      // 154: putfield nbf.jfe D
      // 157: return
   }

   public final void qhh(ll8 param1) {
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
      // 05: getfield ll8._5i F
      // 08: aload 1
      // 09: getfield ll8._5i F
      // 0c: fmul
      // 0d: aload 1
      // 0e: getfield ll8.w5z F
      // 11: aload 1
      // 12: getfield ll8.w5z F
      // 15: fmul
      // 16: fadd
      // 17: aload 1
      // 18: getfield ll8.yz_ F
      // 1b: aload 1
      // 1c: getfield ll8.yz_ F
      // 1f: fmul
      // 20: fadd
      // 21: f2d
      // 22: invokestatic java/lang/Math.sqrt (D)D
      // 25: dstore 5
      // 27: dload 5
      // 29: ldc2_w 1.0E-12
      // 2c: iload 2
      // 2d: ifeq 69
      // 30: dcmpg
      // 31: ifge 5a
      // 34: goto 3b
      // 37: invokestatic nbf.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: dconst_0
      // 3d: putfield nbf.ggc D
      // 40: aload 0
      // 41: dconst_0
      // 42: putfield nbf.yme D
      // 45: aload 0
      // 46: dconst_0
      // 47: putfield nbf.pf8 D
      // 4a: aload 0
      // 4b: dconst_0
      // 4c: putfield nbf.jfe D
      // 4f: iload 2
      // 50: ifne ae
      // 53: goto 5a
      // 56: invokestatic nbf.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 1
      // 5b: getfield ll8.b77 F
      // 5e: f2d
      // 5f: ldc2_w 2.0
      // 62: goto 69
      // 65: invokestatic nbf.a (Loov;)Loov;
      // 68: athrow
      // 69: ddiv
      // 6a: invokestatic java/lang/Math.sin (D)D
      // 6d: dstore 3
      // 6e: dconst_1
      // 6f: dload 5
      // 71: ddiv
      // 72: dstore 5
      // 74: aload 0
      // 75: aload 1
      // 76: getfield ll8.b77 F
      // 79: f2d
      // 7a: ldc2_w 2.0
      // 7d: ddiv
      // 7e: invokestatic java/lang/Math.cos (D)D
      // 81: putfield nbf.ggc D
      // 84: aload 0
      // 85: aload 1
      // 86: getfield ll8._5i F
      // 89: f2d
      // 8a: dload 5
      // 8c: dmul
      // 8d: dload 3
      // 8e: dmul
      // 8f: putfield nbf.yme D
      // 92: aload 0
      // 93: aload 1
      // 94: getfield ll8.w5z F
      // 97: f2d
      // 98: dload 5
      // 9a: dmul
      // 9b: dload 3
      // 9c: dmul
      // 9d: putfield nbf.pf8 D
      // a0: aload 0
      // a1: aload 1
      // a2: getfield ll8.yz_ F
      // a5: f2d
      // a6: dload 5
      // a8: dmul
      // a9: dload 3
      // aa: dmul
      // ab: putfield nbf.jfe D
      // ae: return
   }

   public final void fcy(lg5 param1) {
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
      // 05: getfield lg5.fs3 D
      // 08: aload 1
      // 09: getfield lg5.fs3 D
      // 0c: dmul
      // 0d: aload 1
      // 0e: getfield lg5.j4q D
      // 11: aload 1
      // 12: getfield lg5.j4q D
      // 15: dmul
      // 16: dadd
      // 17: aload 1
      // 18: getfield lg5.fki D
      // 1b: aload 1
      // 1c: getfield lg5.fki D
      // 1f: dmul
      // 20: dadd
      // 21: invokestatic java/lang/Math.sqrt (D)D
      // 24: dstore 5
      // 26: dload 5
      // 28: ldc2_w 1.0E-12
      // 2b: iload 2
      // 2c: ifeq 66
      // 2f: dcmpg
      // 30: ifge 59
      // 33: goto 3a
      // 36: invokestatic nbf.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: dconst_0
      // 3c: putfield nbf.ggc D
      // 3f: aload 0
      // 40: dconst_0
      // 41: putfield nbf.yme D
      // 44: aload 0
      // 45: dconst_0
      // 46: putfield nbf.pf8 D
      // 49: aload 0
      // 4a: dconst_0
      // 4b: putfield nbf.jfe D
      // 4e: iload 2
      // 4f: ifne a1
      // 52: goto 59
      // 55: invokestatic nbf.a (Loov;)Loov;
      // 58: athrow
      // 59: dconst_1
      // 5a: dload 5
      // 5c: ddiv
      // 5d: dstore 5
      // 5f: aload 1
      // 60: getfield lg5.ezi D
      // 63: ldc2_w 2.0
      // 66: ddiv
      // 67: invokestatic java/lang/Math.sin (D)D
      // 6a: dstore 3
      // 6b: aload 0
      // 6c: aload 1
      // 6d: getfield lg5.ezi D
      // 70: ldc2_w 2.0
      // 73: ddiv
      // 74: invokestatic java/lang/Math.cos (D)D
      // 77: putfield nbf.ggc D
      // 7a: aload 0
      // 7b: aload 1
      // 7c: getfield lg5.fs3 D
      // 7f: dload 5
      // 81: dmul
      // 82: dload 3
      // 83: dmul
      // 84: putfield nbf.yme D
      // 87: aload 0
      // 88: aload 1
      // 89: getfield lg5.j4q D
      // 8c: dload 5
      // 8e: dmul
      // 8f: dload 3
      // 90: dmul
      // 91: putfield nbf.pf8 D
      // 94: aload 0
      // 95: aload 1
      // 96: getfield lg5.fki D
      // 99: dload 5
      // 9b: dmul
      // 9c: dload 3
      // 9d: dmul
      // 9e: putfield nbf.jfe D
      // a1: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void upe(nbf var1, double var2) {
      int var4 = t9d.b();
      double var5 = this.yme * var1.yme + this.pf8 * var1.pf8 + this.jfe * var1.jfe + this.ggc * var1.ggc;

      double var7;
      double var9;
      label52: {
         double var19;
         double var10001;
         label59: {
            label50: {
               label49: {
                  try {
                     double var23;
                     var10000 = (var23 = var5 - 0.0) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
                     if (var4 == 0) {
                        break label50;
                     }

                     if (var10000 >= 0) {
                        break label49;
                     }
                  } catch (oov var18) {
                     throw a(var18);
                  }

                  var1.yme = -var1.yme;
                  var1.pf8 = -var1.pf8;
                  var1.jfe = -var1.jfe;
                  var1.ggc = -var1.ggc;
                  var5 = -var5;
               }

               try {
                  var19 = 1.0 - var5;
                  var10001 = 1.0E-12;
                  if (var4 == 0) {
                     break label59;
                  }

                  double var24;
                  var10000 = (var24 = var19 - 1.0E-12) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
               } catch (oov var15) {
                  throw a(var15);
               }
            }

            if (var10000 > 0) {
               double var11 = Math.acos(var5);
               double var13 = Math.sin(var11);
               var7 = Math.sin((1.0 - var2) * var11) / var13;
               var9 = Math.sin(var2 * var11) / var13;

               try {
                  if (var4 != 0) {
                     break label52;
                  }
               } catch (oov var17) {
                  boolean var21 = false;
                  throw a(var17);
               }
            }

            try {
               var19 = 1.0;
               var10001 = var2;
            } catch (oov var16) {
               boolean var22 = false;
               throw a(var16);
            }
         }

         var7 = var19 - var10001;
         var9 = var2;
      }

      this.ggc = var7 * this.ggc + var9 * var1.ggc;
      this.yme = var7 * this.yme + var9 * var1.yme;
      this.pf8 = var7 * this.pf8 + var9 * var1.pf8;
      this.jfe = var7 * this.jfe + var9 * var1.jfe;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void zc0(nbf var1, nbf var2, double var3) {
      int var5 = t9d.b();
      double var6 = var2.yme * var1.yme + var2.pf8 * var1.pf8 + var2.jfe * var1.jfe + var2.ggc * var1.ggc;

      double var8;
      double var10;
      label52: {
         double var20;
         double var10001;
         label59: {
            label50: {
               label49: {
                  try {
                     double var24;
                     var10000 = (var24 = var6 - 0.0) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
                     if (var5 == 0) {
                        break label50;
                     }

                     if (var10000 >= 0) {
                        break label49;
                     }
                  } catch (oov var19) {
                     throw a(var19);
                  }

                  var1.yme = -var1.yme;
                  var1.pf8 = -var1.pf8;
                  var1.jfe = -var1.jfe;
                  var1.ggc = -var1.ggc;
                  var6 = -var6;
               }

               try {
                  var20 = 1.0 - var6;
                  var10001 = 1.0E-12;
                  if (var5 == 0) {
                     break label59;
                  }

                  double var25;
                  var10000 = (var25 = var20 - 1.0E-12) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
               } catch (oov var16) {
                  throw a(var16);
               }
            }

            if (var10000 > 0) {
               double var12 = Math.acos(var6);
               double var14 = Math.sin(var12);
               var8 = Math.sin((1.0 - var3) * var12) / var14;
               var10 = Math.sin(var3 * var12) / var14;

               try {
                  if (var5 != 0) {
                     break label52;
                  }
               } catch (oov var18) {
                  boolean var22 = false;
                  throw a(var18);
               }
            }

            try {
               var20 = 1.0;
               var10001 = var3;
            } catch (oov var17) {
               boolean var23 = false;
               throw a(var17);
            }
         }

         var8 = var20 - var10001;
         var10 = var3;
      }

      this.ggc = var8 * var1.ggc + var10 * var2.ggc;
      this.yme = var8 * var1.yme + var10 * var2.yme;
      this.pf8 = var8 * var1.pf8 + var10 * var2.pf8;
      this.jfe = var8 * var1.jfe + var10 * var2.jfe;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
