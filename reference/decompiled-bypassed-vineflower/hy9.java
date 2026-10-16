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

public class hy9 extends i2h implements wdc {
   public int mku;
   public int db2;
   public i2h k_d;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public hy9(t9d var1) {
      super(var1);
      this.y33 = 10.0;
      this.yxc(0.5F, 0.5F);
   }

   public hy9(t9d var1, double var2, double var4, double var6) {
      super(var1);
      this.y33 = 10.0;
      this.yxc(0.5F, 0.5F);
      this.m6_(var2, var4, var6);
   }

   public hy9(t9d param1, g_3 param2, g_3 param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokespecial i2h.<init> (Lt9d;)V
      // 005: aload 0
      // 006: bipush -1
      // 007: putfield hy9.rzq I
      // 00a: aload 0
      // 00b: bipush -1
      // 00c: putfield hy9.g_l I
      // 00f: aload 0
      // 010: bipush -1
      // 011: putfield hy9.upe I
      // 014: aload 0
      // 015: ldc2_w 2.0
      // 018: putfield hy9.ka7 D
      // 01b: invokestatic t9d.b ()I
      // 01e: aload 0
      // 01f: ldc2_w 10.0
      // 022: putfield hy9.y33 D
      // 025: istore 6
      // 027: aload 0
      // 028: aload 2
      // 029: putfield hy9.k_d Li2h;
      // 02c: aload 2
      // 02d: iload 6
      // 02f: ifeq 05e
      // 032: instanceof ha9
      // 035: ifeq 04b
      // 038: goto 03f
      // 03b: invokestatic hy9.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: bipush 1
      // 041: putfield hy9.mku I
      // 044: goto 04b
      // 047: invokestatic hy9.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: aload 2
      // 04d: getfield g_3.kfp D
      // 050: aload 2
      // 051: invokevirtual g_3.c5y ()F
      // 054: f2d
      // 055: dadd
      // 056: ldc2_w 0.10000000149011612
      // 059: dsub
      // 05a: putfield hy9.kfp D
      // 05d: aload 3
      // 05e: getfield g_3.o2v D
      // 061: aload 2
      // 062: getfield g_3.o2v D
      // 065: dsub
      // 066: dstore 7
      // 068: aload 3
      // 069: invokevirtual g_3.aaw ()Lnh4;
      // 06c: getfield nh4.bx_ D
      // 06f: aload 3
      // 070: getfield g_3.ikl F
      // 073: ldc 3.0
      // 075: nop
      // 076: fdiv
      // 077: f2d
      // 078: dadd
      // 079: aload 0
      // 07a: getfield hy9.kfp D
      // 07d: dsub
      // 07e: dstore 9
      // 080: aload 3
      // 081: getfield g_3.vbd D
      // 084: aload 2
      // 085: getfield g_3.vbd D
      // 088: dsub
      // 089: dstore 11
      // 08b: dload 7
      // 08d: dload 7
      // 08f: dmul
      // 090: dload 11
      // 092: dload 11
      // 094: dmul
      // 095: dadd
      // 096: invokestatic fe6.dii (D)F
      // 099: f2d
      // 09a: dstore 13
      // 09c: dload 13
      // 09e: ldc2_w 1.0E-7
      // 0a1: iload 6
      // 0a3: ifeq 0c6
      // 0a6: dcmpl
      // 0a7: iflt 124
      // 0aa: goto 0b1
      // 0ad: invokestatic hy9.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: dload 11
      // 0b3: dload 7
      // 0b5: invokestatic fe6.yr8 (DD)D
      // 0b8: ldc2_w 180.0
      // 0bb: dmul
      // 0bc: ldc2_w 3.141592653589793
      // 0bf: goto 0c6
      // 0c2: invokestatic hy9.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: ddiv
      // 0c7: d2f
      // 0c8: ldc 90.0
      // 0ca: nop
      // 0cb: fsub
      // 0cc: fstore 15
      // 0ce: dload 9
      // 0d0: dload 13
      // 0d2: invokestatic fe6.yr8 (DD)D
      // 0d5: ldc2_w 180.0
      // 0d8: dmul
      // 0d9: ldc2_w 3.141592653589793
      // 0dc: ddiv
      // 0dd: dneg
      // 0de: d2f
      // 0df: fstore 16
      // 0e1: dload 7
      // 0e3: dload 13
      // 0e5: ddiv
      // 0e6: dstore 17
      // 0e8: dload 11
      // 0ea: dload 13
      // 0ec: ddiv
      // 0ed: dstore 19
      // 0ef: aload 0
      // 0f0: aload 2
      // 0f1: getfield g_3.o2v D
      // 0f4: dload 17
      // 0f6: dadd
      // 0f7: aload 0
      // 0f8: getfield hy9.kfp D
      // 0fb: aload 2
      // 0fc: getfield g_3.vbd D
      // 0ff: dload 19
      // 101: dadd
      // 102: fload 15
      // 104: fload 16
      // 106: invokevirtual hy9.x24 (DDDFF)V
      // 109: dload 13
      // 10b: ldc2_w 0.20000000298023224
      // 10e: dmul
      // 10f: d2f
      // 110: fstore 21
      // 112: aload 0
      // 113: dload 7
      // 115: dload 9
      // 117: fload 21
      // 119: f2d
      // 11a: dadd
      // 11b: dload 11
      // 11d: fload 4
      // 11f: fload 5
      // 121: invokevirtual hy9.bob (DDDFF)V
      // 124: return
   }

   public hy9(t9d param1, g_3 param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokespecial i2h.<init> (Lt9d;)V
      // 005: aload 0
      // 006: bipush -1
      // 007: putfield hy9.rzq I
      // 00a: invokestatic t9d.c ()I
      // 00d: aload 0
      // 00e: bipush -1
      // 00f: putfield hy9.g_l I
      // 012: aload 0
      // 013: bipush -1
      // 014: putfield hy9.upe I
      // 017: aload 0
      // 018: ldc2_w 2.0
      // 01b: putfield hy9.ka7 D
      // 01e: aload 0
      // 01f: ldc2_w 10.0
      // 022: putfield hy9.y33 D
      // 025: istore 4
      // 027: aload 0
      // 028: aload 2
      // 029: putfield hy9.k_d Li2h;
      // 02c: iload 4
      // 02e: ifne 13d
      // 031: aload 2
      // 032: instanceof ha9
      // 035: ifeq 04b
      // 038: goto 03f
      // 03b: invokestatic hy9.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: bipush 1
      // 041: putfield hy9.mku I
      // 044: goto 04b
      // 047: invokestatic hy9.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: ldc 0.5
      // 04e: nop
      // 04f: ldc 0.5
      // 051: nop
      // 052: invokevirtual hy9.yxc (FF)V
      // 055: aload 0
      // 056: aload 2
      // 057: getfield g_3.o2v D
      // 05a: aload 2
      // 05b: getfield g_3.kfp D
      // 05e: aload 2
      // 05f: invokevirtual g_3.c5y ()F
      // 062: f2d
      // 063: dadd
      // 064: aload 2
      // 065: getfield g_3.vbd D
      // 068: aload 2
      // 069: getfield g_3.x5k F
      // 06c: aload 2
      // 06d: getfield g_3.y2i F
      // 070: invokevirtual hy9.x24 (DDDFF)V
      // 073: aload 0
      // 074: dup
      // 075: getfield hy9.o2v D
      // 078: aload 0
      // 079: getfield hy9.x5k F
      // 07c: ldc 180.0
      // 07e: nop
      // 07f: fdiv
      // 080: ldc 3.1415927
      // 082: nop
      // 083: fmul
      // 084: invokestatic fe6.ssk (F)F
      // 087: ldc 0.16
      // 089: nop
      // 08a: fmul
      // 08b: f2d
      // 08c: dsub
      // 08d: putfield hy9.o2v D
      // 090: aload 0
      // 091: dup
      // 092: getfield hy9.kfp D
      // 095: ldc2_w 0.10000000149011612
      // 098: dsub
      // 099: putfield hy9.kfp D
      // 09c: aload 0
      // 09d: dup
      // 09e: getfield hy9.vbd D
      // 0a1: aload 0
      // 0a2: getfield hy9.x5k F
      // 0a5: ldc 180.0
      // 0a7: nop
      // 0a8: fdiv
      // 0a9: ldc 3.1415927
      // 0ab: nop
      // 0ac: fmul
      // 0ad: invokestatic fe6.rtn (F)F
      // 0b0: ldc 0.16
      // 0b2: nop
      // 0b3: fmul
      // 0b4: f2d
      // 0b5: dsub
      // 0b6: putfield hy9.vbd D
      // 0b9: aload 0
      // 0ba: aload 0
      // 0bb: getfield hy9.o2v D
      // 0be: aload 0
      // 0bf: getfield hy9.kfp D
      // 0c2: aload 0
      // 0c3: getfield hy9.vbd D
      // 0c6: invokevirtual hy9.m6_ (DDD)V
      // 0c9: aload 0
      // 0ca: aload 0
      // 0cb: getfield hy9.x5k F
      // 0ce: ldc 180.0
      // 0d0: nop
      // 0d1: fdiv
      // 0d2: ldc 3.1415927
      // 0d4: nop
      // 0d5: fmul
      // 0d6: invokestatic fe6.rtn (F)F
      // 0d9: fneg
      // 0da: aload 0
      // 0db: getfield hy9.y2i F
      // 0de: ldc 180.0
      // 0e0: nop
      // 0e1: fdiv
      // 0e2: ldc 3.1415927
      // 0e4: nop
      // 0e5: fmul
      // 0e6: invokestatic fe6.ssk (F)F
      // 0e9: fmul
      // 0ea: f2d
      // 0eb: putfield hy9.icv D
      // 0ee: aload 0
      // 0ef: aload 0
      // 0f0: getfield hy9.x5k F
      // 0f3: ldc 180.0
      // 0f5: nop
      // 0f6: fdiv
      // 0f7: ldc 3.1415927
      // 0f9: nop
      // 0fa: fmul
      // 0fb: invokestatic fe6.ssk (F)F
      // 0fe: aload 0
      // 0ff: getfield hy9.y2i F
      // 102: ldc 180.0
      // 104: nop
      // 105: fdiv
      // 106: ldc 3.1415927
      // 108: nop
      // 109: fmul
      // 10a: invokestatic fe6.ssk (F)F
      // 10d: fmul
      // 10e: f2d
      // 10f: putfield hy9.bw4 D
      // 112: aload 0
      // 113: aload 0
      // 114: getfield hy9.y2i F
      // 117: ldc 180.0
      // 119: nop
      // 11a: fdiv
      // 11b: ldc 3.1415927
      // 11d: nop
      // 11e: fmul
      // 11f: invokestatic fe6.rtn (F)F
      // 122: fneg
      // 123: f2d
      // 124: putfield hy9.mop D
      // 127: aload 0
      // 128: aload 0
      // 129: getfield hy9.icv D
      // 12c: aload 0
      // 12d: getfield hy9.mop D
      // 130: aload 0
      // 131: getfield hy9.bw4 D
      // 134: fload 3
      // 135: ldc 1.5
      // 137: nop
      // 138: fmul
      // 139: fconst_1
      // 13a: invokevirtual hy9.bob (DDDFF)V
      // 13d: return
   }

   @Override
   public void tbj() {
      this.oit.kp2(16, (byte)0);
   }

   @Override
   public void bob(double var1, double var3, double var5, float var7, float var8) {
      float var10 = fe6.dii(var1 * var1 + var3 * var3 + var5 * var5);
      int var10000 = t9d.c();
      var1 /= (double)var10;
      var3 /= (double)var10;
      var5 /= (double)var10;
      int var9 = var10000;

      double var10001;
      byte var10002;
      label60: {
         label59: {
            try {
               var24 = var1;
               var10001 = this.z2d.nextGaussian();
               var10002 = this.z2d.nextBoolean();
               if (var9 != 0) {
                  break label60;
               }

               if (var10002 != 0) {
                  break label59;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var10002 = 1;
            break label60;
         }

         var10002 = -1;
      }

      var1 = var24 + var10001 * (double)var10002 * 0.0075F * (double)var8;

      label50: {
         label49: {
            try {
               var25 = var3;
               var10001 = this.z2d.nextGaussian();
               var10002 = this.z2d.nextBoolean();
               if (var9 != 0) {
                  break label50;
               }

               if (var10002 != 0) {
                  break label49;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            var10002 = 1;
            break label50;
         }

         var10002 = -1;
      }

      var3 = var25 + var10001 * (double)var10002 * 0.0075F * (double)var8;

      label40: {
         label39: {
            try {
               var26 = var5;
               var10001 = this.z2d.nextGaussian();
               var10002 = this.z2d.nextBoolean();
               if (var9 != 0) {
                  break label40;
               }

               if (var10002 != 0) {
                  break label39;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            var10002 = 1;
            break label40;
         }

         var10002 = -1;
      }

      var5 = var26 + var10001 * (double)var10002 * 0.0075F * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.icv = var1;
      this.mop = var3;
      this.bw4 = var5;
      float var11 = fe6.dii(var1 * var1 + var5 * var5);
      this.p3h = this.x5k = (float)(fe6.yr8(var1, var5) * 180.0 / Math.PI);
      this.j25 = this.y2i = (float)(fe6.yr8(var3, (double)var11) * 180.0 / Math.PI);
      this.nku = 0;
   }

   @Override
   public void ltu(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.m6_(var1, var3, var5);
      this.iym(var7, var8);
   }

   @Override
   public void lmm(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dload 1
      // 02: putfield hy9.icv D
      // 05: invokestatic t9d.b ()I
      // 08: aload 0
      // 09: dload 3
      // 0a: putfield hy9.mop D
      // 0d: aload 0
      // 0e: dload 5
      // 10: putfield hy9.bw4 D
      // 13: istore 7
      // 15: aload 0
      // 16: getfield hy9.j25 F
      // 19: fconst_0
      // 1a: fcmpl
      // 1b: iload 7
      // 1d: ifeq 43
      // 20: ifne b9
      // 23: goto 2a
      // 26: invokestatic hy9.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield hy9.p3h F
      // 2e: iload 7
      // 30: ifeq 59
      // 33: goto 3a
      // 36: invokestatic hy9.a (Loov;)Loov;
      // 39: athrow
      // 3a: fconst_0
      // 3b: fcmpl
      // 3c: goto 43
      // 3f: invokestatic hy9.a (Loov;)Loov;
      // 42: athrow
      // 43: ifne b9
      // 46: dload 1
      // 47: dload 1
      // 48: dmul
      // 49: dload 5
      // 4b: dload 5
      // 4d: dmul
      // 4e: dadd
      // 4f: invokestatic fe6.dii (D)F
      // 52: goto 59
      // 55: invokestatic hy9.a (Loov;)Loov;
      // 58: athrow
      // 59: fstore 8
      // 5b: aload 0
      // 5c: aload 0
      // 5d: dload 1
      // 5e: dload 5
      // 60: invokestatic fe6.yr8 (DD)D
      // 63: ldc2_w 180.0
      // 66: dmul
      // 67: ldc2_w 3.141592653589793
      // 6a: ddiv
      // 6b: d2f
      // 6c: dup_x1
      // 6d: putfield hy9.x5k F
      // 70: putfield hy9.p3h F
      // 73: aload 0
      // 74: aload 0
      // 75: dload 3
      // 76: fload 8
      // 78: f2d
      // 79: invokestatic fe6.yr8 (DD)D
      // 7c: ldc2_w 180.0
      // 7f: dmul
      // 80: ldc2_w 3.141592653589793
      // 83: ddiv
      // 84: d2f
      // 85: dup_x1
      // 86: putfield hy9.y2i F
      // 89: putfield hy9.j25 F
      // 8c: aload 0
      // 8d: aload 0
      // 8e: getfield hy9.y2i F
      // 91: putfield hy9.j25 F
      // 94: aload 0
      // 95: aload 0
      // 96: getfield hy9.x5k F
      // 99: putfield hy9.p3h F
      // 9c: aload 0
      // 9d: aload 0
      // 9e: getfield hy9.o2v D
      // a1: aload 0
      // a2: getfield hy9.kfp D
      // a5: aload 0
      // a6: getfield hy9.vbd D
      // a9: aload 0
      // aa: getfield hy9.x5k F
      // ad: aload 0
      // ae: getfield hy9.y2i F
      // b1: invokevirtual hy9.x24 (DDDFF)V
      // b4: aload 0
      // b5: bipush 0
      // b6: putfield hy9.nku I
      // b9: return
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hy9.b J
      // 003: ldc2_w 131819291508267
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial i2h.xx_ ()V
      // 010: aload 0
      // 011: getfield hy9.j25 F
      // 014: fconst_0
      // 015: fcmpl
      // 016: iload 3
      // 017: ifeq 03c
      // 01a: ifne 097
      // 01d: goto 024
      // 020: invokestatic hy9.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: getfield hy9.p3h F
      // 028: iload 3
      // 029: ifeq 05c
      // 02c: goto 033
      // 02f: invokestatic hy9.a (Loov;)Loov;
      // 032: athrow
      // 033: fconst_0
      // 034: fcmpl
      // 035: goto 03c
      // 038: invokestatic hy9.a (Loov;)Loov;
      // 03b: athrow
      // 03c: ifne 097
      // 03f: aload 0
      // 040: getfield hy9.icv D
      // 043: aload 0
      // 044: getfield hy9.icv D
      // 047: dmul
      // 048: aload 0
      // 049: getfield hy9.bw4 D
      // 04c: aload 0
      // 04d: getfield hy9.bw4 D
      // 050: dmul
      // 051: dadd
      // 052: invokestatic fe6.dii (D)F
      // 055: goto 05c
      // 058: invokestatic hy9.a (Loov;)Loov;
      // 05b: athrow
      // 05c: fstore 4
      // 05e: aload 0
      // 05f: aload 0
      // 060: aload 0
      // 061: getfield hy9.icv D
      // 064: aload 0
      // 065: getfield hy9.bw4 D
      // 068: invokestatic fe6.yr8 (DD)D
      // 06b: ldc2_w 180.0
      // 06e: dmul
      // 06f: ldc2_w 3.141592653589793
      // 072: ddiv
      // 073: d2f
      // 074: dup_x1
      // 075: putfield hy9.x5k F
      // 078: putfield hy9.p3h F
      // 07b: aload 0
      // 07c: aload 0
      // 07d: aload 0
      // 07e: getfield hy9.mop D
      // 081: fload 4
      // 083: f2d
      // 084: invokestatic fe6.yr8 (DD)D
      // 087: ldc2_w 180.0
      // 08a: dmul
      // 08b: ldc2_w 3.141592653589793
      // 08e: ddiv
      // 08f: d2f
      // 090: dup_x1
      // 091: putfield hy9.y2i F
      // 094: putfield hy9.j25 F
      // 097: new mew
      // 09a: dup
      // 09b: aload 0
      // 09c: getfield hy9.rzq I
      // 09f: aload 0
      // 0a0: getfield hy9.g_l I
      // 0a3: aload 0
      // 0a4: getfield hy9.upe I
      // 0a7: invokespecial mew.<init> (III)V
      // 0aa: astore 4
      // 0ac: aload 0
      // 0ad: getfield hy9.oay Lt9d;
      // 0b0: aload 4
      // 0b2: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b5: astore 5
      // 0b7: aload 5
      // 0b9: invokeinterface zfz.r_y ()Le0x; 1
      // 0be: astore 6
      // 0c0: aload 6
      // 0c2: iload 3
      // 0c3: ifeq 0ea
      // 0c6: invokevirtual e0x.p1r ()Lp3y;
      // 0c9: getstatic p3y.cei Lp3y;
      // 0cc: if_acmpeq 139
      // 0cf: goto 0d6
      // 0d2: invokestatic hy9.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 6
      // 0d8: aload 0
      // 0d9: getfield hy9.oay Lt9d;
      // 0dc: aload 4
      // 0de: invokevirtual e0x.c7i (Lm5n;Lmew;)V
      // 0e1: aload 6
      // 0e3: goto 0ea
      // 0e6: invokestatic hy9.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: getfield hy9.oay Lt9d;
      // 0ee: aload 4
      // 0f0: aload 5
      // 0f2: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 0f5: astore 7
      // 0f7: aload 7
      // 0f9: iload 3
      // 0fa: ifeq 109
      // 0fd: ifnull 139
      // 100: goto 107
      // 103: invokestatic hy9.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 7
      // 109: new fqr
      // 10c: dup
      // 10d: aload 0
      // 10e: getfield hy9.o2v D
      // 111: aload 0
      // 112: getfield hy9.kfp D
      // 115: aload 0
      // 116: getfield hy9.vbd D
      // 119: invokespecial fqr.<init> (DDD)V
      // 11c: invokevirtual nh4.fd8 (Lfqr;)Z
      // 11f: iload 3
      // 120: ifeq 13d
      // 123: ifeq 139
      // 126: goto 12d
      // 129: invokestatic hy9.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 0
      // 12e: bipush 1
      // 12f: putfield hy9.k0f Z
      // 132: goto 139
      // 135: invokestatic hy9.a (Loov;)Loov;
      // 138: athrow
      // 139: aload 0
      // 13a: getfield hy9.db2 I
      // 13d: iload 3
      // 13e: ifeq 16b
      // 141: ifle 15c
      // 144: goto 14b
      // 147: invokestatic hy9.a (Loov;)Loov;
      // 14a: athrow
      // 14b: aload 0
      // 14c: dup
      // 14d: getfield hy9.db2 I
      // 150: bipush 1
      // 151: isub
      // 152: putfield hy9.db2 I
      // 155: goto 15c
      // 158: invokestatic hy9.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 0
      // 15d: iload 3
      // 15e: ifeq 235
      // 161: getfield hy9.k0f Z
      // 164: goto 16b
      // 167: invokestatic hy9.a (Loov;)Loov;
      // 16a: athrow
      // 16b: ifeq 22d
      // 16e: aload 6
      // 170: aload 5
      // 172: invokevirtual e0x.hvp (Lzfz;)I
      // 175: istore 7
      // 177: iload 3
      // 178: ifeq 224
      // 17b: aload 6
      // 17d: aload 0
      // 17e: getfield hy9.bt6 Le0x;
      // 181: if_acmpne 1d4
      // 184: goto 18b
      // 187: invokestatic hy9.a (Loov;)Loov;
      // 18a: athrow
      // 18b: iload 7
      // 18d: aload 0
      // 18e: getfield hy9.sip I
      // 191: iload 3
      // 192: ifeq 1c9
      // 195: goto 19c
      // 198: invokestatic hy9.a (Loov;)Loov;
      // 19b: athrow
      // 19c: if_icmpne 1d4
      // 19f: goto 1a6
      // 1a2: invokestatic hy9.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: dup
      // 1a8: getfield hy9.nku I
      // 1ab: bipush 1
      // 1ac: iadd
      // 1ad: putfield hy9.nku I
      // 1b0: aload 0
      // 1b1: iload 3
      // 1b2: ifeq 1cd
      // 1b5: goto 1bc
      // 1b8: invokestatic hy9.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: getfield hy9.nku I
      // 1bf: sipush 1200
      // 1c2: goto 1c9
      // 1c5: invokestatic hy9.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: if_icmplt 229
      // 1cc: aload 0
      // 1cd: invokevirtual hy9._kl ()V
      // 1d0: iload 3
      // 1d1: ifne 229
      // 1d4: aload 0
      // 1d5: bipush 0
      // 1d6: putfield hy9.k0f Z
      // 1d9: aload 0
      // 1da: dup
      // 1db: getfield hy9.icv D
      // 1de: aload 0
      // 1df: getfield hy9.z2d Ljava/util/Random;
      // 1e2: invokevirtual java/util/Random.nextFloat ()F
      // 1e5: ldc 0.2
      // 1e7: nop
      // 1e8: fmul
      // 1e9: f2d
      // 1ea: dmul
      // 1eb: putfield hy9.icv D
      // 1ee: aload 0
      // 1ef: dup
      // 1f0: getfield hy9.mop D
      // 1f3: aload 0
      // 1f4: getfield hy9.z2d Ljava/util/Random;
      // 1f7: invokevirtual java/util/Random.nextFloat ()F
      // 1fa: ldc 0.2
      // 1fc: nop
      // 1fd: fmul
      // 1fe: f2d
      // 1ff: dmul
      // 200: putfield hy9.mop D
      // 203: aload 0
      // 204: dup
      // 205: getfield hy9.bw4 D
      // 208: aload 0
      // 209: getfield hy9.z2d Ljava/util/Random;
      // 20c: invokevirtual java/util/Random.nextFloat ()F
      // 20f: ldc 0.2
      // 211: nop
      // 212: fmul
      // 213: f2d
      // 214: dmul
      // 215: putfield hy9.bw4 D
      // 218: aload 0
      // 219: bipush 0
      // 21a: putfield hy9.nku I
      // 21d: goto 224
      // 220: invokestatic hy9.a (Loov;)Loov;
      // 223: athrow
      // 224: aload 0
      // 225: bipush 0
      // 226: putfield hy9.f9_ I
      // 229: iload 3
      // 22a: ifne ba9
      // 22d: aload 0
      // 22e: goto 235
      // 231: invokestatic hy9.a (Loov;)Loov;
      // 234: athrow
      // 235: dup
      // 236: getfield hy9.f9_ I
      // 239: bipush 1
      // 23a: iadd
      // 23b: putfield hy9.f9_ I
      // 23e: new fqr
      // 241: dup
      // 242: aload 0
      // 243: getfield hy9.o2v D
      // 246: aload 0
      // 247: getfield hy9.kfp D
      // 24a: aload 0
      // 24b: getfield hy9.vbd D
      // 24e: invokespecial fqr.<init> (DDD)V
      // 251: astore 7
      // 253: new fqr
      // 256: dup
      // 257: aload 0
      // 258: getfield hy9.o2v D
      // 25b: aload 0
      // 25c: getfield hy9.icv D
      // 25f: dadd
      // 260: aload 0
      // 261: getfield hy9.kfp D
      // 264: aload 0
      // 265: getfield hy9.mop D
      // 268: dadd
      // 269: aload 0
      // 26a: getfield hy9.vbd D
      // 26d: aload 0
      // 26e: getfield hy9.bw4 D
      // 271: dadd
      // 272: invokespecial fqr.<init> (DDD)V
      // 275: astore 8
      // 277: aload 0
      // 278: getfield hy9.oay Lt9d;
      // 27b: aload 7
      // 27d: aload 8
      // 27f: bipush 0
      // 280: bipush 1
      // 281: bipush 0
      // 282: invokevirtual t9d.xjc (Lfqr;Lfqr;ZZZ)Lakm;
      // 285: astore 9
      // 287: new fqr
      // 28a: dup
      // 28b: aload 0
      // 28c: getfield hy9.o2v D
      // 28f: aload 0
      // 290: getfield hy9.kfp D
      // 293: aload 0
      // 294: getfield hy9.vbd D
      // 297: invokespecial fqr.<init> (DDD)V
      // 29a: astore 7
      // 29c: new fqr
      // 29f: dup
      // 2a0: aload 0
      // 2a1: getfield hy9.o2v D
      // 2a4: aload 0
      // 2a5: getfield hy9.icv D
      // 2a8: dadd
      // 2a9: aload 0
      // 2aa: getfield hy9.kfp D
      // 2ad: aload 0
      // 2ae: getfield hy9.mop D
      // 2b1: dadd
      // 2b2: aload 0
      // 2b3: getfield hy9.vbd D
      // 2b6: aload 0
      // 2b7: getfield hy9.bw4 D
      // 2ba: dadd
      // 2bb: invokespecial fqr.<init> (DDD)V
      // 2be: iload 3
      // 2bf: ifeq 2ef
      // 2c2: astore 8
      // 2c4: aload 9
      // 2c6: ifnull 2f1
      // 2c9: new fqr
      // 2cc: dup
      // 2cd: aload 9
      // 2cf: getfield akm.jhn Lfqr;
      // 2d2: getfield fqr.lvi D
      // 2d5: aload 9
      // 2d7: getfield akm.jhn Lfqr;
      // 2da: getfield fqr.gn5 D
      // 2dd: aload 9
      // 2df: getfield akm.jhn Lfqr;
      // 2e2: getfield fqr.bn2 D
      // 2e5: invokespecial fqr.<init> (DDD)V
      // 2e8: goto 2ef
      // 2eb: invokestatic hy9.a (Loov;)Loov;
      // 2ee: athrow
      // 2ef: astore 8
      // 2f1: aconst_null
      // 2f2: astore 10
      // 2f4: aload 0
      // 2f5: getfield hy9.oay Lt9d;
      // 2f8: aload 0
      // 2f9: aload 0
      // 2fa: invokevirtual hy9.aaw ()Lnh4;
      // 2fd: aload 0
      // 2fe: getfield hy9.icv D
      // 301: aload 0
      // 302: getfield hy9.mop D
      // 305: aload 0
      // 306: getfield hy9.bw4 D
      // 309: invokevirtual nh4.z9h (DDD)Lnh4;
      // 30c: dconst_1
      // 30d: dconst_1
      // 30e: dconst_1
      // 30f: invokevirtual nh4.c2h (DDD)Lnh4;
      // 312: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 315: astore 11
      // 317: dconst_0
      // 318: dstore 12
      // 31a: bipush 0
      // 31b: istore 14
      // 31d: iload 14
      // 31f: aload 11
      // 321: invokeinterface java/util/List.size ()I 1
      // 326: if_icmpge 3ee
      // 329: aload 11
      // 32b: iload 14
      // 32d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 332: checkcast i2h
      // 335: astore 15
      // 337: iload 3
      // 338: ifeq 3ea
      // 33b: aload 15
      // 33d: invokevirtual i2h.mzu ()Z
      // 340: iload 3
      // 341: ifeq 902
      // 344: goto 34b
      // 347: invokestatic hy9.a (Loov;)Loov;
      // 34a: athrow
      // 34b: ifeq 3e7
      // 34e: goto 355
      // 351: invokestatic hy9.a (Loov;)Loov;
      // 354: athrow
      // 355: aload 15
      // 357: aload 0
      // 358: getfield hy9.k_d Li2h;
      // 35b: if_acmpne 374
      // 35e: goto 365
      // 361: invokestatic hy9.a (Loov;)Loov;
      // 364: athrow
      // 365: aload 0
      // 366: getfield hy9.f9_ I
      // 369: bipush 5
      // 36a: if_icmplt 3e7
      // 36d: goto 374
      // 370: invokestatic hy9.a (Loov;)Loov;
      // 373: athrow
      // 374: ldc 0.3
      // 376: nop
      // 377: fstore 16
      // 379: aload 15
      // 37b: invokevirtual i2h.aaw ()Lnh4;
      // 37e: fload 16
      // 380: f2d
      // 381: fload 16
      // 383: f2d
      // 384: fload 16
      // 386: f2d
      // 387: invokevirtual nh4.c2h (DDD)Lnh4;
      // 38a: astore 17
      // 38c: aload 17
      // 38e: aload 7
      // 390: aload 8
      // 392: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 395: astore 18
      // 397: iload 3
      // 398: ifeq 3ea
      // 39b: aload 18
      // 39d: ifnull 3e7
      // 3a0: goto 3a7
      // 3a3: invokestatic hy9.a (Loov;)Loov;
      // 3a6: athrow
      // 3a7: aload 7
      // 3a9: aload 18
      // 3ab: getfield akm.jhn Lfqr;
      // 3ae: invokevirtual fqr.y8x (Lfqr;)D
      // 3b1: dstore 19
      // 3b3: dload 19
      // 3b5: iload 3
      // 3b6: ifeq 3e5
      // 3b9: dload 12
      // 3bb: dcmpg
      // 3bc: iflt 3df
      // 3bf: goto 3c6
      // 3c2: invokestatic hy9.a (Loov;)Loov;
      // 3c5: athrow
      // 3c6: dload 12
      // 3c8: iload 3
      // 3c9: ifeq 3e5
      // 3cc: goto 3d3
      // 3cf: invokestatic hy9.a (Loov;)Loov;
      // 3d2: athrow
      // 3d3: dconst_0
      // 3d4: dcmpl
      // 3d5: ifne 3e7
      // 3d8: goto 3df
      // 3db: invokestatic hy9.a (Loov;)Loov;
      // 3de: athrow
      // 3df: aload 15
      // 3e1: astore 10
      // 3e3: dload 19
      // 3e5: dstore 12
      // 3e7: iinc 14 1
      // 3ea: iload 3
      // 3eb: ifne 31d
      // 3ee: aload 10
      // 3f0: ifnull 3fe
      // 3f3: new akm
      // 3f6: dup
      // 3f7: aload 10
      // 3f9: invokespecial akm.<init> (Li2h;)V
      // 3fc: astore 9
      // 3fe: aload 9
      // 400: iload 3
      // 401: ifeq 49c
      // 404: ifnull 49a
      // 407: goto 40e
      // 40a: invokestatic hy9.a (Loov;)Loov;
      // 40d: athrow
      // 40e: aload 9
      // 410: iload 3
      // 411: ifeq 49c
      // 414: goto 41b
      // 417: invokestatic hy9.a (Loov;)Loov;
      // 41a: athrow
      // 41b: getfield akm.sc8 Li2h;
      // 41e: ifnull 49a
      // 421: goto 428
      // 424: invokestatic hy9.a (Loov;)Loov;
      // 427: athrow
      // 428: aload 9
      // 42a: iload 3
      // 42b: ifeq 49c
      // 42e: goto 435
      // 431: invokestatic hy9.a (Loov;)Loov;
      // 434: athrow
      // 435: getfield akm.sc8 Li2h;
      // 438: instanceof ha9
      // 43b: ifeq 49a
      // 43e: goto 445
      // 441: invokestatic hy9.a (Loov;)Loov;
      // 444: athrow
      // 445: aload 9
      // 447: getfield akm.sc8 Li2h;
      // 44a: checkcast ha9
      // 44d: astore 14
      // 44f: aload 14
      // 451: getfield ha9.lls Lpj2;
      // 454: getfield pj2.lez Z
      // 457: iload 3
      // 458: ifeq 473
      // 45b: ifne 497
      // 45e: goto 465
      // 461: invokestatic hy9.a (Loov;)Loov;
      // 464: athrow
      // 465: aload 0
      // 466: getfield hy9.k_d Li2h;
      // 469: instanceof ha9
      // 46c: goto 473
      // 46f: invokestatic hy9.a (Loov;)Loov;
      // 472: athrow
      // 473: iload 3
      // 474: ifeq 494
      // 477: ifeq 49a
      // 47a: goto 481
      // 47d: invokestatic hy9.a (Loov;)Loov;
      // 480: athrow
      // 481: aload 0
      // 482: getfield hy9.k_d Li2h;
      // 485: checkcast ha9
      // 488: aload 14
      // 48a: invokevirtual ha9._ck (Lha9;)Z
      // 48d: goto 494
      // 490: invokestatic hy9.a (Loov;)Loov;
      // 493: athrow
      // 494: ifne 49a
      // 497: aconst_null
      // 498: astore 9
      // 49a: aload 9
      // 49c: iload 3
      // 49d: ifeq 4ac
      // 4a0: ifnull 8f3
      // 4a3: goto 4aa
      // 4a6: invokestatic hy9.a (Loov;)Loov;
      // 4a9: athrow
      // 4aa: aload 9
      // 4ac: iload 3
      // 4ad: ifeq 7b1
      // 4b0: getfield akm.sc8 Li2h;
      // 4b3: ifnull 7a8
      // 4b6: goto 4bd
      // 4b9: invokestatic hy9.a (Loov;)Loov;
      // 4bc: athrow
      // 4bd: aload 0
      // 4be: getfield hy9.icv D
      // 4c1: aload 0
      // 4c2: getfield hy9.icv D
      // 4c5: dmul
      // 4c6: aload 0
      // 4c7: getfield hy9.mop D
      // 4ca: aload 0
      // 4cb: getfield hy9.mop D
      // 4ce: dmul
      // 4cf: dadd
      // 4d0: aload 0
      // 4d1: getfield hy9.bw4 D
      // 4d4: aload 0
      // 4d5: getfield hy9.bw4 D
      // 4d8: dmul
      // 4d9: dadd
      // 4da: invokestatic fe6.dii (D)F
      // 4dd: fstore 14
      // 4df: fload 14
      // 4e1: f2d
      // 4e2: aload 0
      // 4e3: getfield hy9.ka7 D
      // 4e6: dmul
      // 4e7: invokestatic fe6.hxe (D)I
      // 4ea: istore 15
      // 4ec: aload 0
      // 4ed: iload 3
      // 4ee: ifeq 51f
      // 4f1: invokevirtual hy9.s88 ()Z
      // 4f4: ifeq 510
      // 4f7: goto 4fe
      // 4fa: invokestatic hy9.a (Loov;)Loov;
      // 4fd: athrow
      // 4fe: iload 15
      // 500: aload 0
      // 501: getfield hy9.z2d Ljava/util/Random;
      // 504: iload 15
      // 506: bipush 2
      // 507: idiv
      // 508: bipush 2
      // 509: iadd
      // 50a: invokevirtual java/util/Random.nextInt (I)I
      // 50d: iadd
      // 50e: istore 15
      // 510: aload 0
      // 511: iload 3
      // 512: ifeq 535
      // 515: getfield hy9.k_d Li2h;
      // 518: goto 51f
      // 51b: invokestatic hy9.a (Loov;)Loov;
      // 51e: athrow
      // 51f: ifnonnull 52d
      // 522: aload 0
      // 523: aload 0
      // 524: invokestatic ofh.hvq (Lhy9;Li2h;)Lofh;
      // 527: astore 16
      // 529: iload 3
      // 52a: ifne 53e
      // 52d: aload 0
      // 52e: goto 535
      // 531: invokestatic hy9.a (Loov;)Loov;
      // 534: athrow
      // 535: aload 0
      // 536: getfield hy9.k_d Li2h;
      // 539: invokestatic ofh.hvq (Lhy9;Li2h;)Lofh;
      // 53c: astore 16
      // 53e: aload 0
      // 53f: invokevirtual hy9.agj ()Z
      // 542: iload 3
      // 543: ifeq 58a
      // 546: ifeq 57d
      // 549: goto 550
      // 54c: invokestatic hy9.a (Loov;)Loov;
      // 54f: athrow
      // 550: aload 9
      // 552: getfield akm.sc8 Li2h;
      // 555: instanceof a_t
      // 558: iload 3
      // 559: ifeq 58a
      // 55c: goto 563
      // 55f: invokestatic hy9.a (Loov;)Loov;
      // 562: athrow
      // 563: ifne 57d
      // 566: goto 56d
      // 569: invokestatic hy9.a (Loov;)Loov;
      // 56c: athrow
      // 56d: aload 9
      // 56f: getfield akm.sc8 Li2h;
      // 572: bipush 5
      // 573: invokevirtual i2h.k03 (I)V
      // 576: goto 57d
      // 579: invokestatic hy9.a (Loov;)Loov;
      // 57c: athrow
      // 57d: aload 9
      // 57f: getfield akm.sc8 Li2h;
      // 582: aload 16
      // 584: iload 15
      // 586: i2f
      // 587: invokevirtual i2h.m1t (Lofh;F)Z
      // 58a: iload 3
      // 58b: ifeq 5a7
      // 58e: ifeq 75c
      // 591: goto 598
      // 594: invokestatic hy9.a (Loov;)Loov;
      // 597: athrow
      // 598: aload 9
      // 59a: getfield akm.sc8 Li2h;
      // 59d: instanceof g_3
      // 5a0: goto 5a7
      // 5a3: invokestatic hy9.a (Loov;)Loov;
      // 5a6: athrow
      // 5a7: iload 3
      // 5a8: ifeq 74a
      // 5ab: ifeq 711
      // 5ae: goto 5b5
      // 5b1: invokestatic hy9.a (Loov;)Loov;
      // 5b4: athrow
      // 5b5: aload 9
      // 5b7: getfield akm.sc8 Li2h;
      // 5ba: checkcast g_3
      // 5bd: astore 17
      // 5bf: aload 0
      // 5c0: getfield hy9.oay Lt9d;
      // 5c3: getfield t9d.v0f Z
      // 5c6: iload 3
      // 5c7: ifeq 5eb
      // 5ca: ifne 5e7
      // 5cd: goto 5d4
      // 5d0: invokestatic hy9.a (Loov;)Loov;
      // 5d3: athrow
      // 5d4: aload 17
      // 5d6: aload 17
      // 5d8: invokevirtual g_3.jj5 ()I
      // 5db: bipush 1
      // 5dc: iadd
      // 5dd: invokevirtual g_3.dk9 (I)V
      // 5e0: goto 5e7
      // 5e3: invokestatic hy9.a (Loov;)Loov;
      // 5e6: athrow
      // 5e7: aload 0
      // 5e8: getfield hy9.h_3 I
      // 5eb: iload 3
      // 5ec: ifeq 66b
      // 5ef: ifle 659
      // 5f2: goto 5f9
      // 5f5: invokestatic hy9.a (Loov;)Loov;
      // 5f8: athrow
      // 5f9: aload 0
      // 5fa: getfield hy9.icv D
      // 5fd: aload 0
      // 5fe: getfield hy9.icv D
      // 601: dmul
      // 602: aload 0
      // 603: getfield hy9.bw4 D
      // 606: aload 0
      // 607: getfield hy9.bw4 D
      // 60a: dmul
      // 60b: dadd
      // 60c: invokestatic fe6.dii (D)F
      // 60f: fstore 18
      // 611: fload 18
      // 613: fconst_0
      // 614: fcmpl
      // 615: iload 3
      // 616: ifeq 66b
      // 619: ifle 659
      // 61c: goto 623
      // 61f: invokestatic hy9.a (Loov;)Loov;
      // 622: athrow
      // 623: aload 9
      // 625: getfield akm.sc8 Li2h;
      // 628: aload 0
      // 629: getfield hy9.icv D
      // 62c: aload 0
      // 62d: getfield hy9.h_3 I
      // 630: i2d
      // 631: dmul
      // 632: ldc2_w 0.6000000238418579
      // 635: dmul
      // 636: fload 18
      // 638: f2d
      // 639: ddiv
      // 63a: ldc2_w 0.1
      // 63d: aload 0
      // 63e: getfield hy9.bw4 D
      // 641: aload 0
      // 642: getfield hy9.h_3 I
      // 645: i2d
      // 646: dmul
      // 647: ldc2_w 0.6000000238418579
      // 64a: dmul
      // 64b: fload 18
      // 64d: f2d
      // 64e: ddiv
      // 64f: invokevirtual i2h.w7w (DDD)V
      // 652: goto 659
      // 655: invokestatic hy9.a (Loov;)Loov;
      // 658: athrow
      // 659: aload 0
      // 65a: getfield hy9.k_d Li2h;
      // 65d: iload 3
      // 65e: ifeq 68e
      // 661: instanceof g_3
      // 664: goto 66b
      // 667: invokestatic hy9.a (Loov;)Loov;
      // 66a: athrow
      // 66b: ifeq 68a
      // 66e: aload 17
      // 670: aload 0
      // 671: getfield hy9.k_d Li2h;
      // 674: invokestatic hc0.eay (Lg_3;Li2h;)V
      // 677: aload 0
      // 678: getfield hy9.k_d Li2h;
      // 67b: checkcast g_3
      // 67e: aload 17
      // 680: invokestatic hc0.rzk (Lg_3;Li2h;)V
      // 683: goto 68a
      // 686: invokestatic hy9.a (Loov;)Loov;
      // 689: athrow
      // 68a: aload 0
      // 68b: getfield hy9.k_d Li2h;
      // 68e: iload 3
      // 68f: ifeq 747
      // 692: ifnull 711
      // 695: goto 69c
      // 698: invokestatic hy9.a (Loov;)Loov;
      // 69b: athrow
      // 69c: aload 9
      // 69e: getfield akm.sc8 Li2h;
      // 6a1: iload 3
      // 6a2: ifeq 747
      // 6a5: goto 6ac
      // 6a8: invokestatic hy9.a (Loov;)Loov;
      // 6ab: athrow
      // 6ac: aload 0
      // 6ad: getfield hy9.k_d Li2h;
      // 6b0: if_acmpeq 711
      // 6b3: goto 6ba
      // 6b6: invokestatic hy9.a (Loov;)Loov;
      // 6b9: athrow
      // 6ba: aload 9
      // 6bc: getfield akm.sc8 Li2h;
      // 6bf: instanceof ha9
      // 6c2: iload 3
      // 6c3: ifeq 74a
      // 6c6: goto 6cd
      // 6c9: invokestatic hy9.a (Loov;)Loov;
      // 6cc: athrow
      // 6cd: ifeq 711
      // 6d0: goto 6d7
      // 6d3: invokestatic hy9.a (Loov;)Loov;
      // 6d6: athrow
      // 6d7: aload 0
      // 6d8: getfield hy9.k_d Li2h;
      // 6db: instanceof z96
      // 6de: iload 3
      // 6df: ifeq 74a
      // 6e2: goto 6e9
      // 6e5: invokestatic hy9.a (Loov;)Loov;
      // 6e8: athrow
      // 6e9: ifeq 711
      // 6ec: goto 6f3
      // 6ef: invokestatic hy9.a (Loov;)Loov;
      // 6f2: athrow
      // 6f3: aload 0
      // 6f4: getfield hy9.k_d Li2h;
      // 6f7: checkcast z96
      // 6fa: getfield z96.rhh Lmlk;
      // 6fd: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 700: dup
      // 701: bipush 6
      // 703: fconst_0
      // 704: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 707: invokevirtual mlk.vnf (Lmz2;)V
      // 70a: goto 711
      // 70d: invokestatic hy9.a (Loov;)Loov;
      // 710: athrow
      // 711: aload 0
      // 712: sipush 10739
      // 715: ldc2_w 4357293844367781875
      // 718: lload 1
      // 719: lxor
      // 71a: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71f: nop
      // 720: fconst_1
      // 721: ldc 1.2
      // 723: nop
      // 724: aload 0
      // 725: getfield hy9.z2d Ljava/util/Random;
      // 728: invokevirtual java/util/Random.nextFloat ()F
      // 72b: ldc 0.2
      // 72d: nop
      // 72e: fmul
      // 72f: ldc 0.9
      // 731: nop
      // 732: fadd
      // 733: fdiv
      // 734: invokevirtual hy9.lhu (Ljava/lang/String;FF)V
      // 737: iload 3
      // 738: ifeq 758
      // 73b: aload 9
      // 73d: getfield akm.sc8 Li2h;
      // 740: goto 747
      // 743: invokestatic hy9.a (Loov;)Loov;
      // 746: athrow
      // 747: instanceof a_t
      // 74a: ifne 7a4
      // 74d: aload 0
      // 74e: invokevirtual hy9._kl ()V
      // 751: goto 758
      // 754: invokestatic hy9.a (Loov;)Loov;
      // 757: athrow
      // 758: iload 3
      // 759: ifne 7a4
      // 75c: aload 0
      // 75d: dup
      // 75e: getfield hy9.icv D
      // 761: ldc2_w -0.10000000149011612
      // 764: dmul
      // 765: putfield hy9.icv D
      // 768: aload 0
      // 769: dup
      // 76a: getfield hy9.mop D
      // 76d: ldc2_w -0.10000000149011612
      // 770: dmul
      // 771: putfield hy9.mop D
      // 774: aload 0
      // 775: dup
      // 776: getfield hy9.bw4 D
      // 779: ldc2_w -0.10000000149011612
      // 77c: dmul
      // 77d: putfield hy9.bw4 D
      // 780: aload 0
      // 781: dup
      // 782: getfield hy9.x5k F
      // 785: ldc 180.0
      // 787: nop
      // 788: fadd
      // 789: putfield hy9.x5k F
      // 78c: aload 0
      // 78d: dup
      // 78e: getfield hy9.p3h F
      // 791: ldc 180.0
      // 793: nop
      // 794: fadd
      // 795: putfield hy9.p3h F
      // 798: aload 0
      // 799: bipush 0
      // 79a: putfield hy9.f9_ I
      // 79d: goto 7a4
      // 7a0: invokestatic hy9.a (Loov;)Loov;
      // 7a3: athrow
      // 7a4: iload 3
      // 7a5: ifne 8f3
      // 7a8: aload 9
      // 7aa: goto 7b1
      // 7ad: invokestatic hy9.a (Loov;)Loov;
      // 7b0: athrow
      // 7b1: invokevirtual akm._uf ()Lmew;
      // 7b4: astore 14
      // 7b6: aload 0
      // 7b7: aload 14
      // 7b9: invokevirtual mew.getX ()I
      // 7bc: putfield hy9.rzq I
      // 7bf: aload 0
      // 7c0: aload 14
      // 7c2: invokevirtual mew.getY ()I
      // 7c5: putfield hy9.g_l I
      // 7c8: aload 0
      // 7c9: aload 14
      // 7cb: invokevirtual mew.getZ ()I
      // 7ce: putfield hy9.upe I
      // 7d1: aload 0
      // 7d2: getfield hy9.oay Lt9d;
      // 7d5: aload 14
      // 7d7: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7da: astore 15
      // 7dc: aload 0
      // 7dd: aload 15
      // 7df: invokeinterface zfz.r_y ()Le0x; 1
      // 7e4: putfield hy9.bt6 Le0x;
      // 7e7: aload 0
      // 7e8: aload 0
      // 7e9: getfield hy9.bt6 Le0x;
      // 7ec: aload 15
      // 7ee: invokevirtual e0x.hvp (Lzfz;)I
      // 7f1: putfield hy9.sip I
      // 7f4: aload 0
      // 7f5: aload 9
      // 7f7: getfield akm.jhn Lfqr;
      // 7fa: getfield fqr.lvi D
      // 7fd: aload 0
      // 7fe: getfield hy9.o2v D
      // 801: dsub
      // 802: d2f
      // 803: f2d
      // 804: putfield hy9.icv D
      // 807: aload 0
      // 808: aload 9
      // 80a: getfield akm.jhn Lfqr;
      // 80d: getfield fqr.gn5 D
      // 810: aload 0
      // 811: getfield hy9.kfp D
      // 814: dsub
      // 815: d2f
      // 816: f2d
      // 817: putfield hy9.mop D
      // 81a: aload 0
      // 81b: aload 9
      // 81d: getfield akm.jhn Lfqr;
      // 820: getfield fqr.bn2 D
      // 823: aload 0
      // 824: getfield hy9.vbd D
      // 827: dsub
      // 828: d2f
      // 829: f2d
      // 82a: putfield hy9.bw4 D
      // 82d: aload 0
      // 82e: getfield hy9.icv D
      // 831: aload 0
      // 832: getfield hy9.icv D
      // 835: dmul
      // 836: aload 0
      // 837: getfield hy9.mop D
      // 83a: aload 0
      // 83b: getfield hy9.mop D
      // 83e: dmul
      // 83f: dadd
      // 840: aload 0
      // 841: getfield hy9.bw4 D
      // 844: aload 0
      // 845: getfield hy9.bw4 D
      // 848: dmul
      // 849: dadd
      // 84a: invokestatic fe6.dii (D)F
      // 84d: fstore 16
      // 84f: aload 0
      // 850: dup
      // 851: getfield hy9.o2v D
      // 854: aload 0
      // 855: getfield hy9.icv D
      // 858: fload 16
      // 85a: f2d
      // 85b: ddiv
      // 85c: ldc2_w 0.05000000074505806
      // 85f: dmul
      // 860: dsub
      // 861: putfield hy9.o2v D
      // 864: aload 0
      // 865: dup
      // 866: getfield hy9.kfp D
      // 869: aload 0
      // 86a: getfield hy9.mop D
      // 86d: fload 16
      // 86f: f2d
      // 870: ddiv
      // 871: ldc2_w 0.05000000074505806
      // 874: dmul
      // 875: dsub
      // 876: putfield hy9.kfp D
      // 879: aload 0
      // 87a: dup
      // 87b: getfield hy9.vbd D
      // 87e: aload 0
      // 87f: getfield hy9.bw4 D
      // 882: fload 16
      // 884: f2d
      // 885: ddiv
      // 886: ldc2_w 0.05000000074505806
      // 889: dmul
      // 88a: dsub
      // 88b: putfield hy9.vbd D
      // 88e: aload 0
      // 88f: sipush 29901
      // 892: ldc2_w 8576180817971311303
      // 895: lload 1
      // 896: lxor
      // 897: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89c: nop
      // 89d: fconst_1
      // 89e: ldc 1.2
      // 8a0: nop
      // 8a1: aload 0
      // 8a2: getfield hy9.z2d Ljava/util/Random;
      // 8a5: invokevirtual java/util/Random.nextFloat ()F
      // 8a8: ldc 0.2
      // 8aa: nop
      // 8ab: fmul
      // 8ac: ldc 0.9
      // 8ae: nop
      // 8af: fadd
      // 8b0: fdiv
      // 8b1: invokevirtual hy9.lhu (Ljava/lang/String;FF)V
      // 8b4: aload 0
      // 8b5: bipush 1
      // 8b6: putfield hy9.k0f Z
      // 8b9: aload 0
      // 8ba: bipush 7
      // 8bc: putfield hy9.db2 I
      // 8bf: aload 0
      // 8c0: bipush 0
      // 8c1: invokevirtual hy9.mmj (Z)V
      // 8c4: aload 0
      // 8c5: iload 3
      // 8c6: ifeq 8f4
      // 8c9: getfield hy9.bt6 Le0x;
      // 8cc: invokevirtual e0x.p1r ()Lp3y;
      // 8cf: getstatic p3y.cei Lp3y;
      // 8d2: if_acmpeq 8f3
      // 8d5: goto 8dc
      // 8d8: invokestatic hy9.a (Loov;)Loov;
      // 8db: athrow
      // 8dc: aload 0
      // 8dd: getfield hy9.bt6 Le0x;
      // 8e0: aload 0
      // 8e1: getfield hy9.oay Lt9d;
      // 8e4: aload 14
      // 8e6: aload 15
      // 8e8: aload 0
      // 8e9: invokevirtual e0x.n9e (Lt9d;Lmew;Lzfz;Li2h;)V
      // 8ec: goto 8f3
      // 8ef: invokestatic hy9.a (Loov;)Loov;
      // 8f2: athrow
      // 8f3: aload 0
      // 8f4: iload 3
      // 8f5: ifeq 99b
      // 8f8: invokevirtual hy9.s88 ()Z
      // 8fb: goto 902
      // 8fe: invokestatic hy9.a (Loov;)Loov;
      // 901: athrow
      // 902: ifeq 973
      // 905: bipush 0
      // 906: istore 14
      // 908: iload 14
      // 90a: bipush 4
      // 90b: if_icmpge 973
      // 90e: aload 0
      // 90f: getfield hy9.oay Lt9d;
      // 912: getstatic w_0.fzw Lw_0;
      // 915: aload 0
      // 916: getfield hy9.o2v D
      // 919: aload 0
      // 91a: getfield hy9.icv D
      // 91d: iload 14
      // 91f: i2d
      // 920: dmul
      // 921: ldc2_w 4.0
      // 924: ddiv
      // 925: dadd
      // 926: aload 0
      // 927: getfield hy9.kfp D
      // 92a: aload 0
      // 92b: getfield hy9.mop D
      // 92e: iload 14
      // 930: i2d
      // 931: dmul
      // 932: ldc2_w 4.0
      // 935: ddiv
      // 936: dadd
      // 937: aload 0
      // 938: getfield hy9.vbd D
      // 93b: aload 0
      // 93c: getfield hy9.bw4 D
      // 93f: iload 14
      // 941: i2d
      // 942: dmul
      // 943: ldc2_w 4.0
      // 946: ddiv
      // 947: dadd
      // 948: aload 0
      // 949: getfield hy9.icv D
      // 94c: dneg
      // 94d: aload 0
      // 94e: getfield hy9.mop D
      // 951: dneg
      // 952: ldc2_w 0.2
      // 955: dadd
      // 956: aload 0
      // 957: getfield hy9.bw4 D
      // 95a: dneg
      // 95b: bipush 0
      // 95c: newarray 10
      // 95e: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 961: iinc 14 1
      // 964: iload 3
      // 965: ifeq 99a
      // 968: iload 3
      // 969: ifne 908
      // 96c: goto 973
      // 96f: invokestatic hy9.a (Loov;)Loov;
      // 972: athrow
      // 973: aload 0
      // 974: dup
      // 975: getfield hy9.o2v D
      // 978: aload 0
      // 979: getfield hy9.icv D
      // 97c: dadd
      // 97d: putfield hy9.o2v D
      // 980: aload 0
      // 981: dup
      // 982: getfield hy9.kfp D
      // 985: aload 0
      // 986: getfield hy9.mop D
      // 989: dadd
      // 98a: putfield hy9.kfp D
      // 98d: aload 0
      // 98e: dup
      // 98f: getfield hy9.vbd D
      // 992: aload 0
      // 993: getfield hy9.bw4 D
      // 996: dadd
      // 997: putfield hy9.vbd D
      // 99a: aload 0
      // 99b: getfield hy9.icv D
      // 99e: aload 0
      // 99f: getfield hy9.icv D
      // 9a2: dmul
      // 9a3: aload 0
      // 9a4: getfield hy9.bw4 D
      // 9a7: aload 0
      // 9a8: getfield hy9.bw4 D
      // 9ab: dmul
      // 9ac: dadd
      // 9ad: invokestatic fe6.dii (D)F
      // 9b0: fstore 14
      // 9b2: aload 0
      // 9b3: aload 0
      // 9b4: getfield hy9.icv D
      // 9b7: aload 0
      // 9b8: getfield hy9.bw4 D
      // 9bb: invokestatic fe6.yr8 (DD)D
      // 9be: ldc2_w 180.0
      // 9c1: dmul
      // 9c2: ldc2_w 3.141592653589793
      // 9c5: ddiv
      // 9c6: d2f
      // 9c7: putfield hy9.x5k F
      // 9ca: aload 0
      // 9cb: aload 0
      // 9cc: getfield hy9.mop D
      // 9cf: fload 14
      // 9d1: f2d
      // 9d2: invokestatic fe6.yr8 (DD)D
      // 9d5: ldc2_w 180.0
      // 9d8: dmul
      // 9d9: ldc2_w 3.141592653589793
      // 9dc: ddiv
      // 9dd: d2f
      // 9de: putfield hy9.y2i F
      // 9e1: aload 0
      // 9e2: getfield hy9.y2i F
      // 9e5: aload 0
      // 9e6: getfield hy9.j25 F
      // 9e9: fsub
      // 9ea: ldc -180.0
      // 9ec: nop
      // 9ed: fcmpg
      // 9ee: ifge a0c
      // 9f1: aload 0
      // 9f2: dup
      // 9f3: getfield hy9.j25 F
      // 9f6: ldc 360.0
      // 9f8: nop
      // 9f9: fsub
      // 9fa: putfield hy9.j25 F
      // 9fd: iload 3
      // 9fe: ifeq a37
      // a01: iload 3
      // a02: ifne 9e1
      // a05: goto a0c
      // a08: invokestatic hy9.a (Loov;)Loov;
      // a0b: athrow
      // a0c: aload 0
      // a0d: getfield hy9.y2i F
      // a10: aload 0
      // a11: getfield hy9.j25 F
      // a14: fsub
      // a15: ldc 180.0
      // a17: nop
      // a18: fcmpl
      // a19: iflt a37
      // a1c: aload 0
      // a1d: dup
      // a1e: getfield hy9.j25 F
      // a21: ldc 360.0
      // a23: nop
      // a24: fadd
      // a25: putfield hy9.j25 F
      // a28: iload 3
      // a29: ifeq a69
      // a2c: iload 3
      // a2d: ifne a0c
      // a30: goto a37
      // a33: invokestatic hy9.a (Loov;)Loov;
      // a36: athrow
      // a37: aload 0
      // a38: getfield hy9.x5k F
      // a3b: aload 0
      // a3c: getfield hy9.p3h F
      // a3f: fsub
      // a40: ldc -180.0
      // a42: nop
      // a43: fcmpg
      // a44: ifge a69
      // a47: aload 0
      // a48: dup
      // a49: getfield hy9.p3h F
      // a4c: ldc 360.0
      // a4e: nop
      // a4f: fsub
      // a50: putfield hy9.p3h F
      // a53: iload 3
      // a54: ifeq ac7
      // a57: goto a5e
      // a5a: invokestatic hy9.a (Loov;)Loov;
      // a5d: athrow
      // a5e: iload 3
      // a5f: ifne a37
      // a62: goto a69
      // a65: invokestatic hy9.a (Loov;)Loov;
      // a68: athrow
      // a69: aload 0
      // a6a: getfield hy9.x5k F
      // a6d: aload 0
      // a6e: getfield hy9.p3h F
      // a71: fsub
      // a72: ldc 180.0
      // a74: nop
      // a75: fcmpl
      // a76: iflt a9b
      // a79: aload 0
      // a7a: dup
      // a7b: getfield hy9.p3h F
      // a7e: ldc 360.0
      // a80: nop
      // a81: fadd
      // a82: putfield hy9.p3h F
      // a85: iload 3
      // a86: ifeq ac7
      // a89: goto a90
      // a8c: invokestatic hy9.a (Loov;)Loov;
      // a8f: athrow
      // a90: iload 3
      // a91: ifne a69
      // a94: goto a9b
      // a97: invokestatic hy9.a (Loov;)Loov;
      // a9a: athrow
      // a9b: aload 0
      // a9c: aload 0
      // a9d: getfield hy9.j25 F
      // aa0: aload 0
      // aa1: getfield hy9.y2i F
      // aa4: aload 0
      // aa5: getfield hy9.j25 F
      // aa8: fsub
      // aa9: ldc 0.2
      // aab: nop
      // aac: fmul
      // aad: fadd
      // aae: putfield hy9.y2i F
      // ab1: aload 0
      // ab2: aload 0
      // ab3: getfield hy9.p3h F
      // ab6: aload 0
      // ab7: getfield hy9.x5k F
      // aba: aload 0
      // abb: getfield hy9.p3h F
      // abe: fsub
      // abf: ldc 0.2
      // ac1: nop
      // ac2: fmul
      // ac3: fadd
      // ac4: putfield hy9.x5k F
      // ac7: ldc 0.99
      // ac9: nop
      // aca: fstore 15
      // acc: ldc 0.05
      // ace: nop
      // acf: fstore 16
      // ad1: aload 0
      // ad2: invokevirtual hy9.mwv ()Z
      // ad5: iload 3
      // ad6: ifeq b57
      // ad9: ifeq b48
      // adc: goto ae3
      // adf: invokestatic hy9.a (Loov;)Loov;
      // ae2: athrow
      // ae3: bipush 0
      // ae4: istore 17
      // ae6: iload 17
      // ae8: bipush 4
      // ae9: if_icmpge b43
      // aec: ldc 0.25
      // aee: nop
      // aef: fstore 18
      // af1: aload 0
      // af2: getfield hy9.oay Lt9d;
      // af5: getstatic w_0.w_h Lw_0;
      // af8: aload 0
      // af9: getfield hy9.o2v D
      // afc: aload 0
      // afd: getfield hy9.icv D
      // b00: fload 18
      // b02: f2d
      // b03: dmul
      // b04: dsub
      // b05: aload 0
      // b06: getfield hy9.kfp D
      // b09: aload 0
      // b0a: getfield hy9.mop D
      // b0d: fload 18
      // b0f: f2d
      // b10: dmul
      // b11: dsub
      // b12: aload 0
      // b13: getfield hy9.vbd D
      // b16: aload 0
      // b17: getfield hy9.bw4 D
      // b1a: fload 18
      // b1c: f2d
      // b1d: dmul
      // b1e: dsub
      // b1f: aload 0
      // b20: getfield hy9.icv D
      // b23: aload 0
      // b24: getfield hy9.mop D
      // b27: aload 0
      // b28: getfield hy9.bw4 D
      // b2b: bipush 0
      // b2c: newarray 10
      // b2e: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // b31: iinc 17 1
      // b34: iload 3
      // b35: ifeq b48
      // b38: iload 3
      // b39: ifne ae6
      // b3c: goto b43
      // b3f: invokestatic hy9.a (Loov;)Loov;
      // b42: athrow
      // b43: ldc 0.6
      // b45: nop
      // b46: fstore 15
      // b48: aload 0
      // b49: iload 3
      // b4a: ifeq ba6
      // b4d: invokevirtual hy9.n08 ()Z
      // b50: goto b57
      // b53: invokestatic hy9.a (Loov;)Loov;
      // b56: athrow
      // b57: ifeq b65
      // b5a: aload 0
      // b5b: invokevirtual hy9.utb ()V
      // b5e: goto b65
      // b61: invokestatic hy9.a (Loov;)Loov;
      // b64: athrow
      // b65: aload 0
      // b66: dup
      // b67: getfield hy9.icv D
      // b6a: fload 15
      // b6c: f2d
      // b6d: dmul
      // b6e: putfield hy9.icv D
      // b71: aload 0
      // b72: dup
      // b73: getfield hy9.mop D
      // b76: fload 15
      // b78: f2d
      // b79: dmul
      // b7a: putfield hy9.mop D
      // b7d: aload 0
      // b7e: dup
      // b7f: getfield hy9.bw4 D
      // b82: fload 15
      // b84: f2d
      // b85: dmul
      // b86: putfield hy9.bw4 D
      // b89: aload 0
      // b8a: dup
      // b8b: getfield hy9.mop D
      // b8e: fload 16
      // b90: f2d
      // b91: dsub
      // b92: putfield hy9.mop D
      // b95: aload 0
      // b96: aload 0
      // b97: getfield hy9.o2v D
      // b9a: aload 0
      // b9b: getfield hy9.kfp D
      // b9e: aload 0
      // b9f: getfield hy9.vbd D
      // ba2: invokevirtual hy9.m6_ (DDD)V
      // ba5: aload 0
      // ba6: invokevirtual hy9.urw ()V
      // ba9: return
   }

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hy9.b J
      // 003: ldc2_w 120139726413573
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: sipush 31512
      // 00c: ldc2_w 2609725998568889399
      // 00f: lload 2
      // 010: lxor
      // 011: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: aload 0
      // 018: getfield hy9.rzq I
      // 01b: i2s
      // 01c: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 01f: invokestatic t9d.b ()I
      // 022: aload 1
      // 023: sipush 18823
      // 026: ldc2_w 3602429969851215534
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: aload 0
      // 032: getfield hy9.g_l I
      // 035: i2s
      // 036: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 039: aload 1
      // 03a: sipush 17017
      // 03d: ldc2_w 1318043050248365391
      // 040: lload 2
      // 041: lxor
      // 042: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: nop
      // 048: aload 0
      // 049: getfield hy9.upe I
      // 04c: i2s
      // 04d: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 050: istore 4
      // 052: aload 1
      // 053: sipush 19897
      // 056: ldc2_w 8951431153101171355
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: aload 0
      // 062: getfield hy9.nku I
      // 065: i2s
      // 066: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 069: getstatic e0x.db8 Ljnv;
      // 06c: aload 0
      // 06d: getfield hy9.bt6 Le0x;
      // 070: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 073: checkcast gdz
      // 076: astore 5
      // 078: aload 1
      // 079: sipush 6581
      // 07c: ldc2_w 7975661394165022360
      // 07f: lload 2
      // 080: lxor
      // 081: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: nop
      // 087: aload 5
      // 089: iload 4
      // 08b: ifeq 0a4
      // 08e: ifnonnull 0a2
      // 091: goto 098
      // 094: invokestatic hy9.a (Loov;)Loov;
      // 097: athrow
      // 098: ldc ""
      // 09a: nop
      // 09b: goto 0a7
      // 09e: invokestatic hy9.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 5
      // 0a4: invokevirtual gdz.toString ()Ljava/lang/String;
      // 0a7: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 0aa: aload 1
      // 0ab: sipush 3312
      // 0ae: ldc2_w 1191962432821472192
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: aload 0
      // 0ba: getfield hy9.sip I
      // 0bd: i2b
      // 0be: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 0c1: aload 1
      // 0c2: sipush 12827
      // 0c5: ldc2_w 5927615520996594990
      // 0c8: lload 2
      // 0c9: lxor
      // 0ca: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: aload 0
      // 0d1: getfield hy9.db2 I
      // 0d4: i2b
      // 0d5: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 0d8: aload 1
      // 0d9: sipush 20966
      // 0dc: ldc2_w 7523038041029506772
      // 0df: lload 2
      // 0e0: lxor
      // 0e1: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: nop
      // 0e7: aload 0
      // 0e8: getfield hy9.k0f Z
      // 0eb: iload 4
      // 0ed: ifeq 0fb
      // 0f0: ifeq 0fe
      // 0f3: goto 0fa
      // 0f6: invokestatic hy9.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: bipush 1
      // 0fb: goto 0ff
      // 0fe: bipush 0
      // 0ff: i2b
      // 100: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 103: aload 1
      // 104: sipush 14123
      // 107: ldc2_w 6863364381424226305
      // 10a: lload 2
      // 10b: lxor
      // 10c: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: nop
      // 112: aload 0
      // 113: getfield hy9.mku I
      // 116: i2b
      // 117: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 11a: aload 1
      // 11b: sipush 28225
      // 11e: ldc2_w 2618779335801260386
      // 121: lload 2
      // 122: lxor
      // 123: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: nop
      // 129: aload 0
      // 12a: getfield hy9.ka7 D
      // 12d: invokevirtual bdo.von (Ljava/lang/String;D)V
      // 130: return
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hy9.b J
      // 003: ldc2_w 30693730562990
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 11642
      // 00d: ldc2_w 142621568808085239
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 01b: putfield hy9.rzq I
      // 01e: invokestatic t9d.c ()I
      // 021: aload 0
      // 022: aload 1
      // 023: sipush 18304
      // 026: ldc2_w 8237336568650206220
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 034: putfield hy9.g_l I
      // 037: istore 4
      // 039: aload 0
      // 03a: aload 1
      // 03b: sipush 4088
      // 03e: ldc2_w 2678537987746022515
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 04c: putfield hy9.upe I
      // 04f: aload 0
      // 050: aload 1
      // 051: sipush 25115
      // 054: ldc2_w 1715194641826752924
      // 057: lload 2
      // 058: lxor
      // 059: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: nop
      // 05f: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 062: iload 4
      // 064: ifne 0cb
      // 067: putfield hy9.nku I
      // 06a: aload 1
      // 06b: sipush 20341
      // 06e: ldc2_w 7217613937491838189
      // 071: lload 2
      // 072: lxor
      // 073: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: bipush 8
      // 07b: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 07e: ifeq 0ad
      // 081: goto 088
      // 084: invokestatic hy9.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: aload 1
      // 08a: sipush 20341
      // 08d: ldc2_w 7217613937491838189
      // 090: lload 2
      // 091: lxor
      // 092: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 09b: invokestatic e0x.mdd (Ljava/lang/String;)Le0x;
      // 09e: putfield hy9.bt6 Le0x;
      // 0a1: iload 4
      // 0a3: ifeq 0d1
      // 0a6: goto 0ad
      // 0a9: invokestatic hy9.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: sipush 20341
      // 0b2: ldc2_w 7217613937491838189
      // 0b5: lload 2
      // 0b6: lxor
      // 0b7: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: nop
      // 0bd: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0c0: sipush 255
      // 0c3: iand
      // 0c4: goto 0cb
      // 0c7: invokestatic hy9.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: invokestatic e0x.csc (I)Le0x;
      // 0ce: putfield hy9.bt6 Le0x;
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: sipush 22627
      // 0d6: ldc2_w 7527781605177758697
      // 0d9: lload 2
      // 0da: lxor
      // 0db: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: nop
      // 0e1: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0e4: sipush 255
      // 0e7: iand
      // 0e8: putfield hy9.sip I
      // 0eb: aload 0
      // 0ec: aload 1
      // 0ed: sipush 20706
      // 0f0: ldc2_w 216668179308583806
      // 0f3: lload 2
      // 0f4: lxor
      // 0f5: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: nop
      // 0fb: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0fe: sipush 255
      // 101: iand
      // 102: putfield hy9.db2 I
      // 105: aload 0
      // 106: aload 1
      // 107: sipush 24159
      // 10a: ldc2_w 8192947176489981393
      // 10d: lload 2
      // 10e: lxor
      // 10f: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: nop
      // 115: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 118: iload 4
      // 11a: ifne 130
      // 11d: bipush 1
      // 11e: if_icmpne 133
      // 121: goto 128
      // 124: invokestatic hy9.a (Loov;)Loov;
      // 127: athrow
      // 128: bipush 1
      // 129: goto 130
      // 12c: invokestatic hy9.a (Loov;)Loov;
      // 12f: athrow
      // 130: goto 134
      // 133: bipush 0
      // 134: putfield hy9.k0f Z
      // 137: aload 1
      // 138: sipush 22211
      // 13b: ldc2_w 6641124395140062553
      // 13e: lload 2
      // 13f: lxor
      // 140: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: nop
      // 146: bipush 99
      // 148: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 14b: iload 4
      // 14d: ifne 18b
      // 150: ifeq 177
      // 153: goto 15a
      // 156: invokestatic hy9.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 0
      // 15b: aload 1
      // 15c: sipush 22211
      // 15f: ldc2_w 6641124395140062553
      // 162: lload 2
      // 163: lxor
      // 164: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: nop
      // 16a: invokevirtual bdo.m9p (Ljava/lang/String;)D
      // 16d: putfield hy9.ka7 D
      // 170: goto 177
      // 173: invokestatic hy9.a (Loov;)Loov;
      // 176: athrow
      // 177: aload 1
      // 178: sipush 13149
      // 17b: ldc2_w 4147505966786738398
      // 17e: lload 2
      // 17f: lxor
      // 180: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: nop
      // 186: bipush 99
      // 188: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 18b: iload 4
      // 18d: ifne 1d7
      // 190: ifeq 1bc
      // 193: goto 19a
      // 196: invokestatic hy9.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 0
      // 19b: aload 1
      // 19c: sipush 13149
      // 19f: ldc2_w 4147505966786738398
      // 1a2: lload 2
      // 1a3: lxor
      // 1a4: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: nop
      // 1aa: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 1ad: putfield hy9.mku I
      // 1b0: iload 4
      // 1b2: ifeq 20b
      // 1b5: goto 1bc
      // 1b8: invokestatic hy9.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: aload 1
      // 1bd: sipush 16913
      // 1c0: ldc2_w 3104453714370857346
      // 1c3: lload 2
      // 1c4: lxor
      // 1c5: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: nop
      // 1cb: bipush 99
      // 1cd: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1d0: goto 1d7
      // 1d3: invokestatic hy9.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: ifeq 20b
      // 1da: aload 0
      // 1db: aload 1
      // 1dc: sipush 10553
      // 1df: ldc2_w 163645097000690342
      // 1e2: lload 2
      // 1e3: lxor
      // 1e4: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: nop
      // 1ea: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 1ed: iload 4
      // 1ef: ifne 204
      // 1f2: goto 1f9
      // 1f5: invokestatic hy9.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: ifeq 207
      // 1fc: goto 203
      // 1ff: invokestatic hy9.a (Loov;)Loov;
      // 202: athrow
      // 203: bipush 1
      // 204: goto 208
      // 207: bipush 0
      // 208: putfield hy9.mku I
      // 20b: return
   }

   @Override
   public void bzm(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hy9.b J
      // 003: ldc2_w 35996442347823
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield hy9.oay Lt9d;
      // 011: getfield t9d.v0f Z
      // 014: iload 4
      // 016: ifeq 02e
      // 019: ifne 132
      // 01c: goto 023
      // 01f: invokestatic hy9.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: getfield hy9.k0f Z
      // 027: goto 02e
      // 02a: invokestatic hy9.a (Loov;)Loov;
      // 02d: athrow
      // 02e: iload 4
      // 030: ifeq 048
      // 033: ifeq 132
      // 036: goto 03d
      // 039: invokestatic hy9.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield hy9.db2 I
      // 041: goto 048
      // 044: invokestatic hy9.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 4
      // 04a: ifeq 062
      // 04d: ifgt 132
      // 050: goto 057
      // 053: invokestatic hy9.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: getfield hy9.mku I
      // 05b: goto 062
      // 05e: invokestatic hy9.a (Loov;)Loov;
      // 061: athrow
      // 062: iload 4
      // 064: ifeq 0ab
      // 067: bipush 1
      // 068: if_icmpeq 0aa
      // 06b: goto 072
      // 06e: invokestatic hy9.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: getfield hy9.mku I
      // 076: iload 4
      // 078: ifeq 09b
      // 07b: goto 082
      // 07e: invokestatic hy9.a (Loov;)Loov;
      // 081: athrow
      // 082: bipush 2
      // 083: if_icmpne 0ae
      // 086: goto 08d
      // 089: invokestatic hy9.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 1
      // 08e: getfield ha9.lls Lpj2;
      // 091: getfield pj2.g40 Z
      // 094: goto 09b
      // 097: invokestatic hy9.a (Loov;)Loov;
      // 09a: athrow
      // 09b: iload 4
      // 09d: ifeq 0ab
      // 0a0: ifeq 0ae
      // 0a3: goto 0aa
      // 0a6: invokestatic hy9.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: goto 0af
      // 0ae: bipush 0
      // 0af: istore 5
      // 0b1: aload 0
      // 0b2: getfield hy9.mku I
      // 0b5: iload 4
      // 0b7: ifeq 0f2
      // 0ba: bipush 1
      // 0bb: if_icmpne 0f0
      // 0be: goto 0c5
      // 0c1: invokestatic hy9.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 1
      // 0c6: getfield ha9.up_ Ljnq;
      // 0c9: new erg
      // 0cc: dup
      // 0cd: getstatic xbr.tzx Lu7m;
      // 0d0: bipush 1
      // 0d1: invokespecial erg.<init> (Lu7m;I)V
      // 0d4: invokevirtual jnq.phd (Lerg;)Z
      // 0d7: iload 4
      // 0d9: ifeq 0f2
      // 0dc: goto 0e3
      // 0df: invokestatic hy9.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: ifne 0f0
      // 0e6: goto 0ed
      // 0e9: invokestatic hy9.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: bipush 0
      // 0ee: istore 5
      // 0f0: iload 5
      // 0f2: ifeq 132
      // 0f5: aload 0
      // 0f6: sipush 17168
      // 0f9: ldc2_w 5237486398361039377
      // 0fc: lload 2
      // 0fd: lxor
      // 0fe: invokedynamic m (IJ)Ljava/lang/String; bsm=hy9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: nop
      // 104: ldc 0.2
      // 106: nop
      // 107: aload 0
      // 108: getfield hy9.z2d Ljava/util/Random;
      // 10b: invokevirtual java/util/Random.nextFloat ()F
      // 10e: aload 0
      // 10f: getfield hy9.z2d Ljava/util/Random;
      // 112: invokevirtual java/util/Random.nextFloat ()F
      // 115: fsub
      // 116: ldc 0.7
      // 118: nop
      // 119: fmul
      // 11a: fconst_1
      // 11b: fadd
      // 11c: fconst_2
      // 11d: fmul
      // 11e: invokevirtual hy9.lhu (Ljava/lang/String;FF)V
      // 121: aload 1
      // 122: aload 0
      // 123: bipush 1
      // 124: invokevirtual ha9.p3n (Li2h;I)V
      // 127: aload 0
      // 128: invokevirtual hy9._kl ()V
      // 12b: goto 132
      // 12e: invokestatic hy9.a (Loov;)Loov;
      // 131: athrow
      // 132: return
   }

   @Override
   public boolean _p9() {
      return false;
   }

   public void l4o(double var1) {
      this.ka7 = var1;
   }

   public double h1p() {
      return this.ka7;
   }

   public void ilm(int var1) {
      this.h_3 = var1;
   }

   @Override
   public boolean qvl() {
      return false;
   }

   @Override
   public float c5y() {
      return 0.0F;
   }

   public void mmj(boolean param1) {
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
      // 05: getfield hy9.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: istore 3
      // 0e: iload 2
      // 0f: ifne 34
      // 12: iload 1
      // 13: ifeq 38
      // 16: goto 1d
      // 19: invokestatic hy9.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield hy9.oit Lwl1;
      // 21: bipush 16
      // 23: iload 3
      // 24: bipush 1
      // 25: ior
      // 26: i2b
      // 27: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2a: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2d: goto 34
      // 30: invokestatic hy9.a (Loov;)Loov;
      // 33: athrow
      // 34: iload 2
      // 35: ifeq 50
      // 38: aload 0
      // 39: getfield hy9.oit Lwl1;
      // 3c: bipush 16
      // 3e: iload 3
      // 3f: bipush -2
      // 41: iand
      // 42: i2b
      // 43: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 46: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 49: goto 50
      // 4c: invokestatic hy9.a (Loov;)Loov;
      // 4f: athrow
      // 50: return
   }

   public boolean s88() {
      int var1 = t9d.c();
      byte var2 = this.oit.miz(16);

      try {
         int var10000 = var2 & 1;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5955593556086728866L, 7800386468209172820L, MethodHandles.lookup().lookupClass()).a(215109974879063L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 71455338937316L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[25];
      int var7 = 0;
      String var6 = "¡7ãì¿\u0092Ë/Vû{\u0087Ï\u008fõ:\u0010°X\u009cWä¬Xs\u0095\u0000\u0013¥¾\u0095å\u000e\u0010Bê\u0089\u0001¶\u0019Ê,¯\rÐç\u0088ö\u0081Y\u0010]§1¿ÛsNt\u001b´\u008aàßÀþµ °\u0007\u0088\b=1ä`\u0004Ó\u0091\u0000\u0016\b®n\u001eé\tÉT~_½¹>\n\u0094\u00ad¨Ú\u00ad\u0018yÔ\u0081óI\u0092©â\u008b9ÌMS2\u0018\u0086\u0017`BÆiîBò\u0010 é'q\\±k\u008dù=|Ehè\u008aÄ\u0010ó¢HUÄ2¼\u008c\u0018%bÊ·\u0096¿\\\u0010ñT® ÕïoêqU\u0099j«q4þ\u0010²¤\u009d:\u001e?\nlO¬,úÒñ\u008bN\u0010£\u008d\fqêç\u0018\u009dI\u009f ¨u\u0091\"º BU\u0003\u0093ka24¶\u009d«6\u0080AíþÊ\\\u008bÛe8;¨G\u0010d\tä¯\u0005!\u0010«.³ÄÝ\u0013j\u001a`ÞÊP\u0018é×¶\u0010Ù\u00adÄ¶®ÖwJ.õ\u009b7Îå\u0001N \u0095{+c¸øãm3ªÎ\u0090S\u00987\u0007@¢í`mqÈVø°-é\u001e¦\u000e¤\u0010hhB@+¯Tâöõ&÷^\u0096lû\u0010\rÏM¸+nÌÿNpï%N\u0097\u0091¬\u0010\u008e\u0004U\u0006ïæ\u008c:\u0089KfÉ+ ø* ³(\"z\u0005ÔÆEcËFJ\u0010©\u0016_\u009e\u0081\u009d'\u0006>:®Ò\u008dêØI\"Ú\u0015\u0010\u0011UQ\u0006\u0013ä\u0002\u0017\u0085x$¤}]Ë½\u0010\u0014C\u009fI;c\u0017>Af¢4sî\u00808\u0010\u008b:[½,<X§0Ô\u0091wN¨~r\u0010>Ù*´\u009d+g\u0002U^+\u0086d¬¹x";
      int var8 = "¡7ãì¿\u0092Ë/Vû{\u0087Ï\u008fõ:\u0010°X\u009cWä¬Xs\u0095\u0000\u0013¥¾\u0095å\u000e\u0010Bê\u0089\u0001¶\u0019Ê,¯\rÐç\u0088ö\u0081Y\u0010]§1¿ÛsNt\u001b´\u008aàßÀþµ °\u0007\u0088\b=1ä`\u0004Ó\u0091\u0000\u0016\b®n\u001eé\tÉT~_½¹>\n\u0094\u00ad¨Ú\u00ad\u0018yÔ\u0081óI\u0092©â\u008b9ÌMS2\u0018\u0086\u0017`BÆiîBò\u0010 é'q\\±k\u008dù=|Ehè\u008aÄ\u0010ó¢HUÄ2¼\u008c\u0018%bÊ·\u0096¿\\\u0010ñT® ÕïoêqU\u0099j«q4þ\u0010²¤\u009d:\u001e?\nlO¬,úÒñ\u008bN\u0010£\u008d\fqêç\u0018\u009dI\u009f ¨u\u0091\"º BU\u0003\u0093ka24¶\u009d«6\u0080AíþÊ\\\u008bÛe8;¨G\u0010d\tä¯\u0005!\u0010«.³ÄÝ\u0013j\u001a`ÞÊP\u0018é×¶\u0010Ù\u00adÄ¶®ÖwJ.õ\u009b7Îå\u0001N \u0095{+c¸øãm3ªÎ\u0090S\u00987\u0007@¢í`mqÈVø°-é\u001e¦\u000e¤\u0010hhB@+¯Tâöõ&÷^\u0096lû\u0010\rÏM¸+nÌÿNpï%N\u0097\u0091¬\u0010\u008e\u0004U\u0006ïæ\u008c:\u0089KfÉ+ ø* ³(\"z\u0005ÔÆEcËFJ\u0010©\u0016_\u009e\u0081\u009d'\u0006>:®Ò\u008dêØI\"Ú\u0015\u0010\u0011UQ\u0006\u0013ä\u0002\u0017\u0085x$¤}]Ë½\u0010\u0014C\u009fI;c\u0017>Af¢4sî\u00808\u0010\u008b:[½,<X§0Ô\u0091wN¨~r\u0010>Ù*´\u009d+g\u0002U^+\u0086d¬¹x"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[25];
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

                  var6 = "X½\u0006qät3>oùpä\u0007©Ü'\u0010\u0019º\u001cë?L æà¸îY\u000b\u001aN%";
                  var8 = "X½\u0006qät3>oùpä\u0007©Ü'\u0010\u0019º\u001cë?L æà¸îY\u000b\u001aN%".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6988;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("hy9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("hy9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
