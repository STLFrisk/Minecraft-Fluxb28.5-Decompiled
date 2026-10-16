import java.io.Serializable;

public class lwt extends rkj implements Serializable {
   public static final long serialVersionUID = 2675933778405442383L;
   public static final double s6p = 1.0E-6;
   public static final double dle = 1.0E-30;
   public static final double tl0 = 1.57079632679;

   public lwt(float var1, float var2, float var3, float var4) {
      float var5 = (float)(1.0 / Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3 + var4 * var4)));
      this.hp2 = var1 * var5;
      this.nc_ = var2 * var5;
      this.ax5 = var3 * var5;
      this.ck3 = var4 * var5;
   }

   public lwt(float[] var1) {
      float var2 = (float)(1.0 / Math.sqrt((double)(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3])));
      this.hp2 = var1[0] * var2;
      this.nc_ = var1[1] * var2;
      this.ax5 = var1[2] * var2;
      this.ck3 = var1[3] * var2;
   }

   public lwt(lwt var1) {
      super(var1);
   }

   public lwt(nbf var1) {
      super(var1);
   }

   public lwt(rkj var1) {
      float var2 = (float)(1.0 / Math.sqrt((double)(var1.hp2 * var1.hp2 + var1.nc_ * var1.nc_ + var1.ax5 * var1.ax5 + var1.ck3 * var1.ck3)));
      this.hp2 = var1.hp2 * var2;
      this.nc_ = var1.nc_ * var2;
      this.ax5 = var1.ax5 * var2;
      this.ck3 = var1.ck3 * var2;
   }

   public lwt(xv0 var1) {
      double var2 = 1.0 / Math.sqrt(var1.yme * var1.yme + var1.pf8 * var1.pf8 + var1.jfe * var1.jfe + var1.ggc * var1.ggc);
      this.hp2 = (float)(var1.yme * var2);
      this.nc_ = (float)(var1.pf8 * var2);
      this.ax5 = (float)(var1.jfe * var2);
      this.ck3 = (float)(var1.ggc * var2);
   }

   public lwt() {
   }

   public final void dyt(lwt var1) {
      this.hp2 = -var1.hp2;
      this.nc_ = -var1.nc_;
      this.ax5 = -var1.ax5;
      this.ck3 = var1.ck3;
   }

   public final void __1() {
      this.hp2 = -this.hp2;
      this.nc_ = -this.nc_;
      this.ax5 = -this.ax5;
   }

   public final void x1x(lwt param1, lwt param2) {
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
      // 010: invokestatic lwt.a (Loov;)Loov;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 0ea
      // 019: goto 020
      // 01c: invokestatic lwt.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 0e2
      // 024: goto 02b
      // 027: invokestatic lwt.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield lwt.ck3 F
      // 030: aload 2
      // 031: getfield lwt.ck3 F
      // 034: fmul
      // 035: aload 1
      // 036: getfield lwt.hp2 F
      // 039: aload 2
      // 03a: getfield lwt.hp2 F
      // 03d: fmul
      // 03e: fsub
      // 03f: aload 1
      // 040: getfield lwt.nc_ F
      // 043: aload 2
      // 044: getfield lwt.nc_ F
      // 047: fmul
      // 048: fsub
      // 049: aload 1
      // 04a: getfield lwt.ax5 F
      // 04d: aload 2
      // 04e: getfield lwt.ax5 F
      // 051: fmul
      // 052: fsub
      // 053: putfield lwt.ck3 F
      // 056: aload 0
      // 057: aload 1
      // 058: getfield lwt.ck3 F
      // 05b: aload 2
      // 05c: getfield lwt.hp2 F
      // 05f: fmul
      // 060: aload 2
      // 061: getfield lwt.ck3 F
      // 064: aload 1
      // 065: getfield lwt.hp2 F
      // 068: fmul
      // 069: fadd
      // 06a: aload 1
      // 06b: getfield lwt.nc_ F
      // 06e: aload 2
      // 06f: getfield lwt.ax5 F
      // 072: fmul
      // 073: fadd
      // 074: aload 1
      // 075: getfield lwt.ax5 F
      // 078: aload 2
      // 079: getfield lwt.nc_ F
      // 07c: fmul
      // 07d: fsub
      // 07e: putfield lwt.hp2 F
      // 081: aload 0
      // 082: aload 1
      // 083: getfield lwt.ck3 F
      // 086: aload 2
      // 087: getfield lwt.nc_ F
      // 08a: fmul
      // 08b: aload 2
      // 08c: getfield lwt.ck3 F
      // 08f: aload 1
      // 090: getfield lwt.nc_ F
      // 093: fmul
      // 094: fadd
      // 095: aload 1
      // 096: getfield lwt.hp2 F
      // 099: aload 2
      // 09a: getfield lwt.ax5 F
      // 09d: fmul
      // 09e: fsub
      // 09f: aload 1
      // 0a0: getfield lwt.ax5 F
      // 0a3: aload 2
      // 0a4: getfield lwt.hp2 F
      // 0a7: fmul
      // 0a8: fadd
      // 0a9: putfield lwt.nc_ F
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield lwt.ck3 F
      // 0b1: aload 2
      // 0b2: getfield lwt.ax5 F
      // 0b5: fmul
      // 0b6: aload 2
      // 0b7: getfield lwt.ck3 F
      // 0ba: aload 1
      // 0bb: getfield lwt.ax5 F
      // 0be: fmul
      // 0bf: fadd
      // 0c0: aload 1
      // 0c1: getfield lwt.hp2 F
      // 0c4: aload 2
      // 0c5: getfield lwt.nc_ F
      // 0c8: fmul
      // 0c9: fadd
      // 0ca: aload 1
      // 0cb: getfield lwt.nc_ F
      // 0ce: aload 2
      // 0cf: getfield lwt.hp2 F
      // 0d2: fmul
      // 0d3: fsub
      // 0d4: putfield lwt.ax5 F
      // 0d7: iload 3
      // 0d8: ifne 1a1
      // 0db: goto 0e2
      // 0de: invokestatic lwt.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: goto 0ea
      // 0e6: invokestatic lwt.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: getfield lwt.ck3 F
      // 0ed: aload 2
      // 0ee: getfield lwt.ck3 F
      // 0f1: fmul
      // 0f2: aload 1
      // 0f3: getfield lwt.hp2 F
      // 0f6: aload 2
      // 0f7: getfield lwt.hp2 F
      // 0fa: fmul
      // 0fb: fsub
      // 0fc: aload 1
      // 0fd: getfield lwt.nc_ F
      // 100: aload 2
      // 101: getfield lwt.nc_ F
      // 104: fmul
      // 105: fsub
      // 106: aload 1
      // 107: getfield lwt.ax5 F
      // 10a: aload 2
      // 10b: getfield lwt.ax5 F
      // 10e: fmul
      // 10f: fsub
      // 110: fstore 6
      // 112: aload 1
      // 113: getfield lwt.ck3 F
      // 116: aload 2
      // 117: getfield lwt.hp2 F
      // 11a: fmul
      // 11b: aload 2
      // 11c: getfield lwt.ck3 F
      // 11f: aload 1
      // 120: getfield lwt.hp2 F
      // 123: fmul
      // 124: fadd
      // 125: aload 1
      // 126: getfield lwt.nc_ F
      // 129: aload 2
      // 12a: getfield lwt.ax5 F
      // 12d: fmul
      // 12e: fadd
      // 12f: aload 1
      // 130: getfield lwt.ax5 F
      // 133: aload 2
      // 134: getfield lwt.nc_ F
      // 137: fmul
      // 138: fsub
      // 139: fstore 4
      // 13b: aload 1
      // 13c: getfield lwt.ck3 F
      // 13f: aload 2
      // 140: getfield lwt.nc_ F
      // 143: fmul
      // 144: aload 2
      // 145: getfield lwt.ck3 F
      // 148: aload 1
      // 149: getfield lwt.nc_ F
      // 14c: fmul
      // 14d: fadd
      // 14e: aload 1
      // 14f: getfield lwt.hp2 F
      // 152: aload 2
      // 153: getfield lwt.ax5 F
      // 156: fmul
      // 157: fsub
      // 158: aload 1
      // 159: getfield lwt.ax5 F
      // 15c: aload 2
      // 15d: getfield lwt.hp2 F
      // 160: fmul
      // 161: fadd
      // 162: fstore 5
      // 164: aload 0
      // 165: aload 1
      // 166: getfield lwt.ck3 F
      // 169: aload 2
      // 16a: getfield lwt.ax5 F
      // 16d: fmul
      // 16e: aload 2
      // 16f: getfield lwt.ck3 F
      // 172: aload 1
      // 173: getfield lwt.ax5 F
      // 176: fmul
      // 177: fadd
      // 178: aload 1
      // 179: getfield lwt.hp2 F
      // 17c: aload 2
      // 17d: getfield lwt.nc_ F
      // 180: fmul
      // 181: fadd
      // 182: aload 1
      // 183: getfield lwt.nc_ F
      // 186: aload 2
      // 187: getfield lwt.hp2 F
      // 18a: fmul
      // 18b: fsub
      // 18c: putfield lwt.ax5 F
      // 18f: aload 0
      // 190: fload 6
      // 192: putfield lwt.ck3 F
      // 195: aload 0
      // 196: fload 4
      // 198: putfield lwt.hp2 F
      // 19b: aload 0
      // 19c: fload 5
      // 19e: putfield lwt.nc_ F
      // 1a1: return
   }

   public final void fel(lwt var1) {
      float var4 = this.ck3 * var1.ck3 - this.hp2 * var1.hp2 - this.nc_ * var1.nc_ - this.ax5 * var1.ax5;
      float var2 = this.ck3 * var1.hp2 + var1.ck3 * this.hp2 + this.nc_ * var1.ax5 - this.ax5 * var1.nc_;
      float var3 = this.ck3 * var1.nc_ + var1.ck3 * this.nc_ - this.hp2 * var1.ax5 + this.ax5 * var1.hp2;
      this.ax5 = this.ck3 * var1.ax5 + var1.ck3 * this.ax5 + this.hp2 * var1.nc_ - this.nc_ * var1.hp2;
      this.ck3 = var4;
      this.hp2 = var2;
      this.nc_ = var3;
   }

   public final void ep8(lwt var1, lwt var2) {
      lwt var3 = new lwt(var2);
      var3.t30();
      this.x1x(var1, var3);
   }

   public final void qqm(lwt var1) {
      lwt var2 = new lwt(var1);
      var2.t30();
      this.fel(var2);
   }

   public final void igd(lwt var1) {
      float var2 = 1.0F / (var1.ck3 * var1.ck3 + var1.hp2 * var1.hp2 + var1.nc_ * var1.nc_ + var1.ax5 * var1.ax5);
      this.ck3 = var2 * var1.ck3;
      this.hp2 = -var2 * var1.hp2;
      this.nc_ = -var2 * var1.nc_;
      this.ax5 = -var2 * var1.ax5;
   }

   public final void t30() {
      float var1 = 1.0F / (this.ck3 * this.ck3 + this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5);
      this.ck3 *= var1;
      this.hp2 *= -var1;
      this.nc_ *= -var1;
      this.ax5 *= -var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void vbc(lwt var1) {
      int var2 = t9d.b();
      float var3 = var1.hp2 * var1.hp2 + var1.nc_ * var1.nc_ + var1.ax5 * var1.ax5 + var1.ck3 * var1.ck3;

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var3 > 0.0F)) {
                  break label41;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var3 = 1.0F / (float)Math.sqrt((double)var3);

            try {
               this.hp2 = var3 * var1.hp2;
               this.nc_ = var3 * var1.nc_;
               this.ax5 = var3 * var1.ax5;
               this.ck3 = var3 * var1.ck3;
               if (var2 != 0) {
                  return;
               }
            } catch (oov var5) {
               boolean var10001 = false;
               throw a(var5);
            }
         }

         try {
            this.hp2 = 0.0F;
            this.nc_ = 0.0F;
            this.ax5 = 0.0F;
         } catch (oov var4) {
            boolean var8 = false;
            throw a(var4);
         }
      }

      this.ck3 = 0.0F;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void eya() {
      int var1 = t9d.b();
      float var2 = this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5 + this.ck3 * this.ck3;

      label46: {
         label41: {
            try {
               if (var1 == 0) {
                  break label46;
               }

               if (!(var2 > 0.0F)) {
                  break label41;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var2 = 1.0F / (float)Math.sqrt((double)var2);

            try {
               this.hp2 *= var2;
               this.nc_ *= var2;
               this.ax5 *= var2;
               this.ck3 *= var2;
               if (var1 != 0) {
                  return;
               }
            } catch (oov var4) {
               boolean var10001 = false;
               throw a(var4);
            }
         }

         try {
            this.hp2 = 0.0F;
            this.nc_ = 0.0F;
            this.ax5 = 0.0F;
         } catch (oov var3) {
            boolean var7 = false;
            throw a(var3);
         }
      }

      this.ck3 = 0.0F;
   }

   public final void dcw(krg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: ldc 0.25
      // 006: nop
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
      // 01a: fmul
      // 01b: fstore 3
      // 01c: iload 2
      // 01d: ifeq 09d
      // 020: fload 3
      // 021: fconst_0
      // 022: fcmpl
      // 023: iflt 089
      // 026: goto 02d
      // 029: invokestatic lwt.a (Loov;)Loov;
      // 02c: athrow
      // 02d: fload 3
      // 02e: f2d
      // 02f: ldc2_w 1.0E-30
      // 032: dcmpl
      // 033: iload 2
      // 034: ifeq 0bf
      // 037: goto 03e
      // 03a: invokestatic lwt.a (Loov;)Loov;
      // 03d: athrow
      // 03e: iflt 09e
      // 041: goto 048
      // 044: invokestatic lwt.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: fload 3
      // 04a: f2d
      // 04b: invokestatic java/lang/Math.sqrt (D)D
      // 04e: d2f
      // 04f: putfield lwt.ck3 F
      // 052: ldc 0.25
      // 054: nop
      // 055: aload 0
      // 056: getfield lwt.ck3 F
      // 059: fdiv
      // 05a: fstore 3
      // 05b: aload 0
      // 05c: aload 1
      // 05d: getfield krg.w4_ F
      // 060: aload 1
      // 061: getfield krg.sjv F
      // 064: fsub
      // 065: fload 3
      // 066: fmul
      // 067: putfield lwt.hp2 F
      // 06a: aload 0
      // 06b: aload 1
      // 06c: getfield krg.vwt F
      // 06f: aload 1
      // 070: getfield krg.zcz F
      // 073: fsub
      // 074: fload 3
      // 075: fmul
      // 076: putfield lwt.nc_ F
      // 079: aload 0
      // 07a: aload 1
      // 07b: getfield krg.fno F
      // 07e: aload 1
      // 07f: getfield krg.f28 F
      // 082: fsub
      // 083: fload 3
      // 084: fmul
      // 085: putfield lwt.ax5 F
      // 088: return
      // 089: aload 0
      // 08a: fconst_0
      // 08b: putfield lwt.ck3 F
      // 08e: aload 0
      // 08f: fconst_0
      // 090: putfield lwt.hp2 F
      // 093: aload 0
      // 094: fconst_0
      // 095: putfield lwt.nc_ F
      // 098: aload 0
      // 099: fconst_1
      // 09a: putfield lwt.ax5 F
      // 09d: return
      // 09e: aload 0
      // 09f: fconst_0
      // 0a0: putfield lwt.ck3 F
      // 0a3: ldc -0.5
      // 0a5: nop
      // 0a6: aload 1
      // 0a7: getfield krg.rqb F
      // 0aa: aload 1
      // 0ab: getfield krg.fmx F
      // 0ae: fadd
      // 0af: fmul
      // 0b0: fstore 3
      // 0b1: iload 2
      // 0b2: ifeq 114
      // 0b5: fload 3
      // 0b6: fconst_0
      // 0b7: fcmpl
      // 0b8: goto 0bf
      // 0bb: invokestatic lwt.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: iflt 105
      // 0c2: fload 3
      // 0c3: f2d
      // 0c4: ldc2_w 1.0E-30
      // 0c7: dcmpl
      // 0c8: iload 2
      // 0c9: ifeq 136
      // 0cc: goto 0d3
      // 0cf: invokestatic lwt.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iflt 115
      // 0d6: goto 0dd
      // 0d9: invokestatic lwt.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: fload 3
      // 0df: f2d
      // 0e0: invokestatic java/lang/Math.sqrt (D)D
      // 0e3: d2f
      // 0e4: putfield lwt.hp2 F
      // 0e7: fconst_1
      // 0e8: fconst_2
      // 0e9: aload 0
      // 0ea: getfield lwt.hp2 F
      // 0ed: fmul
      // 0ee: fdiv
      // 0ef: fstore 3
      // 0f0: aload 0
      // 0f1: aload 1
      // 0f2: getfield krg.fno F
      // 0f5: fload 3
      // 0f6: fmul
      // 0f7: putfield lwt.nc_ F
      // 0fa: aload 0
      // 0fb: aload 1
      // 0fc: getfield krg.zcz F
      // 0ff: fload 3
      // 100: fmul
      // 101: putfield lwt.ax5 F
      // 104: return
      // 105: aload 0
      // 106: fconst_0
      // 107: putfield lwt.hp2 F
      // 10a: aload 0
      // 10b: fconst_0
      // 10c: putfield lwt.nc_ F
      // 10f: aload 0
      // 110: fconst_1
      // 111: putfield lwt.ax5 F
      // 114: return
      // 115: aload 0
      // 116: fconst_0
      // 117: putfield lwt.hp2 F
      // 11a: ldc 0.5
      // 11c: nop
      // 11d: fconst_1
      // 11e: aload 1
      // 11f: getfield krg.fmx F
      // 122: fsub
      // 123: fmul
      // 124: fstore 3
      // 125: iload 2
      // 126: ifeq 161
      // 129: fload 3
      // 12a: f2d
      // 12b: ldc2_w 1.0E-30
      // 12e: dcmpl
      // 12f: goto 136
      // 132: invokestatic lwt.a (Loov;)Loov;
      // 135: athrow
      // 136: iflt 157
      // 139: aload 0
      // 13a: fload 3
      // 13b: f2d
      // 13c: invokestatic java/lang/Math.sqrt (D)D
      // 13f: d2f
      // 140: putfield lwt.nc_ F
      // 143: aload 0
      // 144: aload 1
      // 145: getfield krg.w4_ F
      // 148: fconst_2
      // 149: aload 0
      // 14a: getfield lwt.nc_ F
      // 14d: fmul
      // 14e: fdiv
      // 14f: putfield lwt.ax5 F
      // 152: return
      // 153: invokestatic lwt.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 0
      // 158: fconst_0
      // 159: putfield lwt.nc_ F
      // 15c: aload 0
      // 15d: fconst_1
      // 15e: putfield lwt.ax5 F
      // 161: return
   }

   public final void _i2(nf1 param1) {
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
      // 01d: ifne 09f
      // 020: dload 3
      // 021: dconst_0
      // 022: dcmpl
      // 023: iflt 08b
      // 026: goto 02d
      // 029: invokestatic lwt.a (Loov;)Loov;
      // 02c: athrow
      // 02d: dload 3
      // 02e: ldc2_w 1.0E-30
      // 031: dcmpl
      // 032: iload 2
      // 033: ifne 0c1
      // 036: goto 03d
      // 039: invokestatic lwt.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iflt 0a0
      // 040: goto 047
      // 043: invokestatic lwt.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: dload 3
      // 049: invokestatic java/lang/Math.sqrt (D)D
      // 04c: d2f
      // 04d: putfield lwt.ck3 F
      // 050: ldc2_w 0.25
      // 053: aload 0
      // 054: getfield lwt.ck3 F
      // 057: f2d
      // 058: ddiv
      // 059: dstore 3
      // 05a: aload 0
      // 05b: aload 1
      // 05c: getfield nf1.nqj D
      // 05f: aload 1
      // 060: getfield nf1.m10 D
      // 063: dsub
      // 064: dload 3
      // 065: dmul
      // 066: d2f
      // 067: putfield lwt.hp2 F
      // 06a: aload 0
      // 06b: aload 1
      // 06c: getfield nf1.j_n D
      // 06f: aload 1
      // 070: getfield nf1.ji8 D
      // 073: dsub
      // 074: dload 3
      // 075: dmul
      // 076: d2f
      // 077: putfield lwt.nc_ F
      // 07a: aload 0
      // 07b: aload 1
      // 07c: getfield nf1.sgz D
      // 07f: aload 1
      // 080: getfield nf1.o1a D
      // 083: dsub
      // 084: dload 3
      // 085: dmul
      // 086: d2f
      // 087: putfield lwt.ax5 F
      // 08a: return
      // 08b: aload 0
      // 08c: fconst_0
      // 08d: putfield lwt.ck3 F
      // 090: aload 0
      // 091: fconst_0
      // 092: putfield lwt.hp2 F
      // 095: aload 0
      // 096: fconst_0
      // 097: putfield lwt.nc_ F
      // 09a: aload 0
      // 09b: fconst_1
      // 09c: putfield lwt.ax5 F
      // 09f: return
      // 0a0: aload 0
      // 0a1: fconst_0
      // 0a2: putfield lwt.ck3 F
      // 0a5: ldc2_w -0.5
      // 0a8: aload 1
      // 0a9: getfield nf1._6_ D
      // 0ac: aload 1
      // 0ad: getfield nf1.o_8 D
      // 0b0: dadd
      // 0b1: dmul
      // 0b2: dstore 3
      // 0b3: iload 2
      // 0b4: ifne 117
      // 0b7: dload 3
      // 0b8: dconst_0
      // 0b9: dcmpl
      // 0ba: goto 0c1
      // 0bd: invokestatic lwt.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iflt 108
      // 0c4: dload 3
      // 0c5: ldc2_w 1.0E-30
      // 0c8: dcmpl
      // 0c9: iload 2
      // 0ca: ifne 138
      // 0cd: goto 0d4
      // 0d0: invokestatic lwt.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: iflt 118
      // 0d7: goto 0de
      // 0da: invokestatic lwt.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: dload 3
      // 0e0: invokestatic java/lang/Math.sqrt (D)D
      // 0e3: d2f
      // 0e4: putfield lwt.hp2 F
      // 0e7: ldc2_w 0.5
      // 0ea: aload 0
      // 0eb: getfield lwt.hp2 F
      // 0ee: f2d
      // 0ef: ddiv
      // 0f0: dstore 3
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: getfield nf1.sgz D
      // 0f6: dload 3
      // 0f7: dmul
      // 0f8: d2f
      // 0f9: putfield lwt.nc_ F
      // 0fc: aload 0
      // 0fd: aload 1
      // 0fe: getfield nf1.ji8 D
      // 101: dload 3
      // 102: dmul
      // 103: d2f
      // 104: putfield lwt.ax5 F
      // 107: return
      // 108: aload 0
      // 109: fconst_0
      // 10a: putfield lwt.hp2 F
      // 10d: aload 0
      // 10e: fconst_0
      // 10f: putfield lwt.nc_ F
      // 112: aload 0
      // 113: fconst_1
      // 114: putfield lwt.ax5 F
      // 117: return
      // 118: aload 0
      // 119: fconst_0
      // 11a: putfield lwt.hp2 F
      // 11d: ldc2_w 0.5
      // 120: dconst_1
      // 121: aload 1
      // 122: getfield nf1.o_8 D
      // 125: dsub
      // 126: dmul
      // 127: dstore 3
      // 128: iload 2
      // 129: ifne 166
      // 12c: dload 3
      // 12d: ldc2_w 1.0E-30
      // 130: dcmpl
      // 131: goto 138
      // 134: invokestatic lwt.a (Loov;)Loov;
      // 137: athrow
      // 138: iflt 15c
      // 13b: aload 0
      // 13c: dload 3
      // 13d: invokestatic java/lang/Math.sqrt (D)D
      // 140: d2f
      // 141: putfield lwt.nc_ F
      // 144: aload 0
      // 145: aload 1
      // 146: getfield nf1.nqj D
      // 149: ldc2_w 2.0
      // 14c: aload 0
      // 14d: getfield lwt.nc_ F
      // 150: f2d
      // 151: dmul
      // 152: ddiv
      // 153: d2f
      // 154: putfield lwt.ax5 F
      // 157: return
      // 158: invokestatic lwt.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 0
      // 15d: fconst_0
      // 15e: putfield lwt.nc_ F
      // 161: aload 0
      // 162: fconst_1
      // 163: putfield lwt.ax5 F
      // 166: return
   }

   public final void jzf(nvj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: ldc 0.25
      // 006: nop
      // 007: aload 1
      // 008: getfield nvj.i2i F
      // 00b: aload 1
      // 00c: getfield nvj.aoj F
      // 00f: fadd
      // 010: aload 1
      // 011: getfield nvj.jr8 F
      // 014: fadd
      // 015: fconst_1
      // 016: fadd
      // 017: fmul
      // 018: fstore 3
      // 019: iload 2
      // 01a: ifeq 09a
      // 01d: fload 3
      // 01e: fconst_0
      // 01f: fcmpl
      // 020: iflt 086
      // 023: goto 02a
      // 026: invokestatic lwt.a (Loov;)Loov;
      // 029: athrow
      // 02a: fload 3
      // 02b: f2d
      // 02c: ldc2_w 1.0E-30
      // 02f: dcmpl
      // 030: iload 2
      // 031: ifeq 0bc
      // 034: goto 03b
      // 037: invokestatic lwt.a (Loov;)Loov;
      // 03a: athrow
      // 03b: iflt 09b
      // 03e: goto 045
      // 041: invokestatic lwt.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: fload 3
      // 047: f2d
      // 048: invokestatic java/lang/Math.sqrt (D)D
      // 04b: d2f
      // 04c: putfield lwt.ck3 F
      // 04f: ldc 0.25
      // 051: nop
      // 052: aload 0
      // 053: getfield lwt.ck3 F
      // 056: fdiv
      // 057: fstore 3
      // 058: aload 0
      // 059: aload 1
      // 05a: getfield nvj.wdt F
      // 05d: aload 1
      // 05e: getfield nvj.zk_ F
      // 061: fsub
      // 062: fload 3
      // 063: fmul
      // 064: putfield lwt.hp2 F
      // 067: aload 0
      // 068: aload 1
      // 069: getfield nvj.xu6 F
      // 06c: aload 1
      // 06d: getfield nvj.aqg F
      // 070: fsub
      // 071: fload 3
      // 072: fmul
      // 073: putfield lwt.nc_ F
      // 076: aload 0
      // 077: aload 1
      // 078: getfield nvj._id F
      // 07b: aload 1
      // 07c: getfield nvj.k12 F
      // 07f: fsub
      // 080: fload 3
      // 081: fmul
      // 082: putfield lwt.ax5 F
      // 085: return
      // 086: aload 0
      // 087: fconst_0
      // 088: putfield lwt.ck3 F
      // 08b: aload 0
      // 08c: fconst_0
      // 08d: putfield lwt.hp2 F
      // 090: aload 0
      // 091: fconst_0
      // 092: putfield lwt.nc_ F
      // 095: aload 0
      // 096: fconst_1
      // 097: putfield lwt.ax5 F
      // 09a: return
      // 09b: aload 0
      // 09c: fconst_0
      // 09d: putfield lwt.ck3 F
      // 0a0: ldc -0.5
      // 0a2: nop
      // 0a3: aload 1
      // 0a4: getfield nvj.aoj F
      // 0a7: aload 1
      // 0a8: getfield nvj.jr8 F
      // 0ab: fadd
      // 0ac: fmul
      // 0ad: fstore 3
      // 0ae: iload 2
      // 0af: ifeq 111
      // 0b2: fload 3
      // 0b3: fconst_0
      // 0b4: fcmpl
      // 0b5: goto 0bc
      // 0b8: invokestatic lwt.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: iflt 102
      // 0bf: fload 3
      // 0c0: f2d
      // 0c1: ldc2_w 1.0E-30
      // 0c4: dcmpl
      // 0c5: iload 2
      // 0c6: ifeq 133
      // 0c9: goto 0d0
      // 0cc: invokestatic lwt.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: iflt 112
      // 0d3: goto 0da
      // 0d6: invokestatic lwt.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: fload 3
      // 0dc: f2d
      // 0dd: invokestatic java/lang/Math.sqrt (D)D
      // 0e0: d2f
      // 0e1: putfield lwt.hp2 F
      // 0e4: ldc 0.5
      // 0e6: nop
      // 0e7: aload 0
      // 0e8: getfield lwt.hp2 F
      // 0eb: fdiv
      // 0ec: fstore 3
      // 0ed: aload 0
      // 0ee: aload 1
      // 0ef: getfield nvj._id F
      // 0f2: fload 3
      // 0f3: fmul
      // 0f4: putfield lwt.nc_ F
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: getfield nvj.aqg F
      // 0fc: fload 3
      // 0fd: fmul
      // 0fe: putfield lwt.ax5 F
      // 101: return
      // 102: aload 0
      // 103: fconst_0
      // 104: putfield lwt.hp2 F
      // 107: aload 0
      // 108: fconst_0
      // 109: putfield lwt.nc_ F
      // 10c: aload 0
      // 10d: fconst_1
      // 10e: putfield lwt.ax5 F
      // 111: return
      // 112: aload 0
      // 113: fconst_0
      // 114: putfield lwt.hp2 F
      // 117: ldc 0.5
      // 119: nop
      // 11a: fconst_1
      // 11b: aload 1
      // 11c: getfield nvj.jr8 F
      // 11f: fsub
      // 120: fmul
      // 121: fstore 3
      // 122: iload 2
      // 123: ifeq 15e
      // 126: fload 3
      // 127: f2d
      // 128: ldc2_w 1.0E-30
      // 12b: dcmpl
      // 12c: goto 133
      // 12f: invokestatic lwt.a (Loov;)Loov;
      // 132: athrow
      // 133: iflt 154
      // 136: aload 0
      // 137: fload 3
      // 138: f2d
      // 139: invokestatic java/lang/Math.sqrt (D)D
      // 13c: d2f
      // 13d: putfield lwt.nc_ F
      // 140: aload 0
      // 141: aload 1
      // 142: getfield nvj.wdt F
      // 145: fconst_2
      // 146: aload 0
      // 147: getfield lwt.nc_ F
      // 14a: fmul
      // 14b: fdiv
      // 14c: putfield lwt.ax5 F
      // 14f: return
      // 150: invokestatic lwt.a (Loov;)Loov;
      // 153: athrow
      // 154: aload 0
      // 155: fconst_0
      // 156: putfield lwt.nc_ F
      // 159: aload 0
      // 15a: fconst_1
      // 15b: putfield lwt.ax5 F
      // 15e: return
   }

   public final void i1x(iww param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
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
      // 01a: ifeq 09c
      // 01d: dload 3
      // 01e: dconst_0
      // 01f: dcmpl
      // 020: iflt 088
      // 023: goto 02a
      // 026: invokestatic lwt.a (Loov;)Loov;
      // 029: athrow
      // 02a: dload 3
      // 02b: ldc2_w 1.0E-30
      // 02e: dcmpl
      // 02f: iload 2
      // 030: ifeq 0be
      // 033: goto 03a
      // 036: invokestatic lwt.a (Loov;)Loov;
      // 039: athrow
      // 03a: iflt 09d
      // 03d: goto 044
      // 040: invokestatic lwt.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: dload 3
      // 046: invokestatic java/lang/Math.sqrt (D)D
      // 049: d2f
      // 04a: putfield lwt.ck3 F
      // 04d: ldc2_w 0.25
      // 050: aload 0
      // 051: getfield lwt.ck3 F
      // 054: f2d
      // 055: ddiv
      // 056: dstore 3
      // 057: aload 0
      // 058: aload 1
      // 059: getfield iww._o7 D
      // 05c: aload 1
      // 05d: getfield iww.c84 D
      // 060: dsub
      // 061: dload 3
      // 062: dmul
      // 063: d2f
      // 064: putfield lwt.hp2 F
      // 067: aload 0
      // 068: aload 1
      // 069: getfield iww.bhd D
      // 06c: aload 1
      // 06d: getfield iww.y7q D
      // 070: dsub
      // 071: dload 3
      // 072: dmul
      // 073: d2f
      // 074: putfield lwt.nc_ F
      // 077: aload 0
      // 078: aload 1
      // 079: getfield iww.get D
      // 07c: aload 1
      // 07d: getfield iww.y3c D
      // 080: dsub
      // 081: dload 3
      // 082: dmul
      // 083: d2f
      // 084: putfield lwt.ax5 F
      // 087: return
      // 088: aload 0
      // 089: fconst_0
      // 08a: putfield lwt.ck3 F
      // 08d: aload 0
      // 08e: fconst_0
      // 08f: putfield lwt.hp2 F
      // 092: aload 0
      // 093: fconst_0
      // 094: putfield lwt.nc_ F
      // 097: aload 0
      // 098: fconst_1
      // 099: putfield lwt.ax5 F
      // 09c: return
      // 09d: aload 0
      // 09e: fconst_0
      // 09f: putfield lwt.ck3 F
      // 0a2: ldc2_w -0.5
      // 0a5: aload 1
      // 0a6: getfield iww.pwn D
      // 0a9: aload 1
      // 0aa: getfield iww.ffq D
      // 0ad: dadd
      // 0ae: dmul
      // 0af: dstore 3
      // 0b0: iload 2
      // 0b1: ifeq 114
      // 0b4: dload 3
      // 0b5: dconst_0
      // 0b6: dcmpl
      // 0b7: goto 0be
      // 0ba: invokestatic lwt.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: iflt 105
      // 0c1: dload 3
      // 0c2: ldc2_w 1.0E-30
      // 0c5: dcmpl
      // 0c6: iload 2
      // 0c7: ifeq 135
      // 0ca: goto 0d1
      // 0cd: invokestatic lwt.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iflt 115
      // 0d4: goto 0db
      // 0d7: invokestatic lwt.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: dload 3
      // 0dd: invokestatic java/lang/Math.sqrt (D)D
      // 0e0: d2f
      // 0e1: putfield lwt.hp2 F
      // 0e4: ldc2_w 0.5
      // 0e7: aload 0
      // 0e8: getfield lwt.hp2 F
      // 0eb: f2d
      // 0ec: ddiv
      // 0ed: dstore 3
      // 0ee: aload 0
      // 0ef: aload 1
      // 0f0: getfield iww.get D
      // 0f3: dload 3
      // 0f4: dmul
      // 0f5: d2f
      // 0f6: putfield lwt.nc_ F
      // 0f9: aload 0
      // 0fa: aload 1
      // 0fb: getfield iww.y7q D
      // 0fe: dload 3
      // 0ff: dmul
      // 100: d2f
      // 101: putfield lwt.ax5 F
      // 104: return
      // 105: aload 0
      // 106: fconst_0
      // 107: putfield lwt.hp2 F
      // 10a: aload 0
      // 10b: fconst_0
      // 10c: putfield lwt.nc_ F
      // 10f: aload 0
      // 110: fconst_1
      // 111: putfield lwt.ax5 F
      // 114: return
      // 115: aload 0
      // 116: fconst_0
      // 117: putfield lwt.hp2 F
      // 11a: ldc2_w 0.5
      // 11d: dconst_1
      // 11e: aload 1
      // 11f: getfield iww.ffq D
      // 122: dsub
      // 123: dmul
      // 124: dstore 3
      // 125: iload 2
      // 126: ifeq 163
      // 129: dload 3
      // 12a: ldc2_w 1.0E-30
      // 12d: dcmpl
      // 12e: goto 135
      // 131: invokestatic lwt.a (Loov;)Loov;
      // 134: athrow
      // 135: iflt 159
      // 138: aload 0
      // 139: dload 3
      // 13a: invokestatic java/lang/Math.sqrt (D)D
      // 13d: d2f
      // 13e: putfield lwt.nc_ F
      // 141: aload 0
      // 142: aload 1
      // 143: getfield iww._o7 D
      // 146: ldc2_w 2.0
      // 149: aload 0
      // 14a: getfield lwt.nc_ F
      // 14d: f2d
      // 14e: dmul
      // 14f: ddiv
      // 150: d2f
      // 151: putfield lwt.ax5 F
      // 154: return
      // 155: invokestatic lwt.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 0
      // 15a: fconst_0
      // 15b: putfield lwt.nc_ F
      // 15e: aload 0
      // 15f: fconst_1
      // 160: putfield lwt.ax5 F
      // 163: return
   }

   public final void hif(ll8 param1) {
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
      // 25: d2f
      // 26: fstore 4
      // 28: fload 4
      // 2a: f2d
      // 2b: ldc2_w 1.0E-6
      // 2e: iload 2
      // 2f: ifne 6a
      // 32: dcmpg
      // 33: ifge 5c
      // 36: goto 3d
      // 39: invokestatic lwt.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: fconst_0
      // 3f: putfield lwt.ck3 F
      // 42: aload 0
      // 43: fconst_0
      // 44: putfield lwt.hp2 F
      // 47: aload 0
      // 48: fconst_0
      // 49: putfield lwt.nc_ F
      // 4c: aload 0
      // 4d: fconst_0
      // 4e: putfield lwt.ax5 F
      // 51: iload 2
      // 52: ifeq a8
      // 55: goto 5c
      // 58: invokestatic lwt.a (Loov;)Loov;
      // 5b: athrow
      // 5c: fconst_1
      // 5d: fload 4
      // 5f: fdiv
      // 60: fstore 4
      // 62: aload 1
      // 63: getfield ll8.b77 F
      // 66: f2d
      // 67: ldc2_w 2.0
      // 6a: ddiv
      // 6b: invokestatic java/lang/Math.sin (D)D
      // 6e: d2f
      // 6f: fstore 3
      // 70: aload 0
      // 71: aload 1
      // 72: getfield ll8.b77 F
      // 75: f2d
      // 76: ldc2_w 2.0
      // 79: ddiv
      // 7a: invokestatic java/lang/Math.cos (D)D
      // 7d: d2f
      // 7e: putfield lwt.ck3 F
      // 81: aload 0
      // 82: aload 1
      // 83: getfield ll8._5i F
      // 86: fload 4
      // 88: fmul
      // 89: fload 3
      // 8a: fmul
      // 8b: putfield lwt.hp2 F
      // 8e: aload 0
      // 8f: aload 1
      // 90: getfield ll8.w5z F
      // 93: fload 4
      // 95: fmul
      // 96: fload 3
      // 97: fmul
      // 98: putfield lwt.nc_ F
      // 9b: aload 0
      // 9c: aload 1
      // 9d: getfield ll8.yz_ F
      // a0: fload 4
      // a2: fmul
      // a3: fload 3
      // a4: fmul
      // a5: putfield lwt.ax5 F
      // a8: return
   }

   public final void ixj(lg5 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: dconst_1
      // 05: aload 1
      // 06: getfield lg5.fs3 D
      // 09: aload 1
      // 0a: getfield lg5.fs3 D
      // 0d: dmul
      // 0e: aload 1
      // 0f: getfield lg5.j4q D
      // 12: aload 1
      // 13: getfield lg5.j4q D
      // 16: dmul
      // 17: dadd
      // 18: aload 1
      // 19: getfield lg5.fki D
      // 1c: aload 1
      // 1d: getfield lg5.fki D
      // 20: dmul
      // 21: dadd
      // 22: invokestatic java/lang/Math.sqrt (D)D
      // 25: ddiv
      // 26: d2f
      // 27: fstore 4
      // 29: fload 4
      // 2b: f2d
      // 2c: ldc2_w 1.0E-6
      // 2f: iload 2
      // 30: ifne 6a
      // 33: dcmpg
      // 34: ifge 5d
      // 37: goto 3e
      // 3a: invokestatic lwt.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: fconst_0
      // 40: putfield lwt.ck3 F
      // 43: aload 0
      // 44: fconst_0
      // 45: putfield lwt.hp2 F
      // 48: aload 0
      // 49: fconst_0
      // 4a: putfield lwt.nc_ F
      // 4d: aload 0
      // 4e: fconst_0
      // 4f: putfield lwt.ax5 F
      // 52: iload 2
      // 53: ifeq aa
      // 56: goto 5d
      // 59: invokestatic lwt.a (Loov;)Loov;
      // 5c: athrow
      // 5d: fconst_1
      // 5e: fload 4
      // 60: fdiv
      // 61: fstore 4
      // 63: aload 1
      // 64: getfield lg5.ezi D
      // 67: ldc2_w 2.0
      // 6a: ddiv
      // 6b: invokestatic java/lang/Math.sin (D)D
      // 6e: d2f
      // 6f: fstore 3
      // 70: aload 0
      // 71: aload 1
      // 72: getfield lg5.ezi D
      // 75: ldc2_w 2.0
      // 78: ddiv
      // 79: invokestatic java/lang/Math.cos (D)D
      // 7c: d2f
      // 7d: putfield lwt.ck3 F
      // 80: aload 0
      // 81: aload 1
      // 82: getfield lg5.fs3 D
      // 85: d2f
      // 86: fload 4
      // 88: fmul
      // 89: fload 3
      // 8a: fmul
      // 8b: putfield lwt.hp2 F
      // 8e: aload 0
      // 8f: aload 1
      // 90: getfield lg5.j4q D
      // 93: d2f
      // 94: fload 4
      // 96: fmul
      // 97: fload 3
      // 98: fmul
      // 99: putfield lwt.nc_ F
      // 9c: aload 0
      // 9d: aload 1
      // 9e: getfield lg5.fki D
      // a1: d2f
      // a2: fload 4
      // a4: fmul
      // a5: fload 3
      // a6: fmul
      // a7: putfield lwt.ax5 F
      // aa: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void shq(lwt var1, float var2) {
      int var3 = t9d.b();
      double var4 = (double)(this.hp2 * var1.hp2 + this.nc_ * var1.nc_ + this.ax5 * var1.ax5 + this.ck3 * var1.ck3);

      double var6;
      double var8;
      label52: {
         double var18;
         double var10001;
         label59: {
            label50: {
               label49: {
                  try {
                     double var22;
                     var10000 = (var22 = var4 - 0.0) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
                     if (var3 == 0) {
                        break label50;
                     }

                     if (var10000 >= 0) {
                        break label49;
                     }
                  } catch (oov var17) {
                     throw a(var17);
                  }

                  var1.hp2 = -var1.hp2;
                  var1.nc_ = -var1.nc_;
                  var1.ax5 = -var1.ax5;
                  var1.ck3 = -var1.ck3;
                  var4 = -var4;
               }

               try {
                  var18 = 1.0 - var4;
                  var10001 = 1.0E-6;
                  if (var3 == 0) {
                     break label59;
                  }

                  double var23;
                  var10000 = (var23 = var18 - 1.0E-6) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
               } catch (oov var14) {
                  throw a(var14);
               }
            }

            if (var10000 > 0) {
               double var10 = Math.acos(var4);
               double var12 = Math.sin(var10);
               var6 = Math.sin((1.0 - (double)var2) * var10) / var12;
               var8 = Math.sin((double)var2 * var10) / var12;

               try {
                  if (var3 != 0) {
                     break label52;
                  }
               } catch (oov var16) {
                  boolean var20 = false;
                  throw a(var16);
               }
            }

            try {
               var18 = 1.0;
               var10001 = (double)var2;
            } catch (oov var15) {
               boolean var21 = false;
               throw a(var15);
            }
         }

         var6 = var18 - var10001;
         var8 = (double)var2;
      }

      this.ck3 = (float)(var6 * (double)this.ck3 + var8 * (double)var1.ck3);
      this.hp2 = (float)(var6 * (double)this.hp2 + var8 * (double)var1.hp2);
      this.nc_ = (float)(var6 * (double)this.nc_ + var8 * (double)var1.nc_);
      this.ax5 = (float)(var6 * (double)this.ax5 + var8 * (double)var1.ax5);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void lbd(lwt var1, lwt var2, float var3) {
      int var4 = t9d.c();
      double var5 = (double)(var2.hp2 * var1.hp2 + var2.nc_ * var1.nc_ + var2.ax5 * var1.ax5 + var2.ck3 * var1.ck3);

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
                     if (var4 != 0) {
                        break label50;
                     }

                     if (var10000 >= 0) {
                        break label49;
                     }
                  } catch (oov var18) {
                     throw a(var18);
                  }

                  var1.hp2 = -var1.hp2;
                  var1.nc_ = -var1.nc_;
                  var1.ax5 = -var1.ax5;
                  var1.ck3 = -var1.ck3;
                  var5 = -var5;
               }

               try {
                  var19 = 1.0 - var5;
                  var10001 = 1.0E-6;
                  if (var4 != 0) {
                     break label59;
                  }

                  double var24;
                  var10000 = (var24 = var19 - 1.0E-6) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
               } catch (oov var15) {
                  throw a(var15);
               }
            }

            if (var10000 > 0) {
               double var11 = Math.acos(var5);
               double var13 = Math.sin(var11);
               var7 = Math.sin((1.0 - (double)var3) * var11) / var13;
               var9 = Math.sin((double)var3 * var11) / var13;

               try {
                  if (var4 == 0) {
                     break label52;
                  }
               } catch (oov var17) {
                  boolean var21 = false;
                  throw a(var17);
               }
            }

            try {
               var19 = 1.0;
               var10001 = (double)var3;
            } catch (oov var16) {
               boolean var22 = false;
               throw a(var16);
            }
         }

         var7 = var19 - var10001;
         var9 = (double)var3;
      }

      this.ck3 = (float)(var7 * (double)var1.ck3 + var9 * (double)var2.ck3);
      this.hp2 = (float)(var7 * (double)var1.hp2 + var9 * (double)var2.hp2);
      this.nc_ = (float)(var7 * (double)var1.nc_ + var9 * (double)var2.nc_);
      this.ax5 = (float)(var7 * (double)var1.ax5 + var9 * (double)var2.ax5);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
