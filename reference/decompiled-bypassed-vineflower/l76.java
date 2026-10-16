import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.world.gen.structure.MapGenNetherBridge;

public class l76 implements g6k {
   private final t9d w7h;
   private final boolean ls6;
   private final Random lu6;
   private double[] brs = new double[256];
   private double[] m8m = new double[256];
   private double[] d0y = new double[256];
   private double[] bpb;
   private final b_x cyx;
   private final b_x vuh;
   private final b_x p6d;
   private final b_x m0e;
   private final b_x zk5;
   public final b_x cyt;
   public final b_x _xn;
   private final y5_ msa = new y5_();
   private final hij t2x = new hij();
   private final fhq pvw = new fhq();
   private final cdu he9 = new m1q(ox_.gjf.l4i(), 14, ppl.gbe(ox_.pzt));
   private final va9 _lw = new va9(ox_.dr2, true);
   private final va9 swp = new va9(ox_.dr2, false);
   private final mkf x27 = new mkf(ox_.zml);
   private final mkf yzq = new mkf(ox_.ae9);
   private final MapGenNetherBridge vbl = new MapGenNetherBridge();
   private final uk2 wzz = new a30();
   public double[] gbx;
   public double[] h_j;
   public double[] tw6;
   public double[] lhe;
   public double[] f8k;
   private static final long a;
   private static final String b;

   public l76(t9d var1, boolean var2, long var3) {
      this.w7h = var1;
      this.ls6 = var2;
      this.lu6 = new Random(var3);
      this.cyx = new b_x(this.lu6, 16);
      this.vuh = new b_x(this.lu6, 16);
      this.p6d = new b_x(this.lu6, 8);
      this.m0e = new b_x(this.lu6, 4);
      this.zk5 = new b_x(this.lu6, 4);
      this.cyt = new b_x(this.lu6, 10);
      this._xn = new b_x(this.lu6, 16);
      var1.g5c(63);
   }

   public void ndo(int var1, int var2, lno var3) {
      byte var5 = 4;
      int var10000 = t9d.c();
      int var6 = this.w7h._s3() / 2 + 1;
      int var4 = var10000;
      int var7 = var5 + 1;
      byte var8 = 17;
      int var9 = var5 + 1;
      this.bpb = this.b2i(this.bpb, var1 * var5, 0, var2 * var5, var7, var8, var9);
      int var10 = 0;

      label118:
      while (true) {
         var10000 = var10;

         label116:
         while (var10000 < var5) {
            int var11 = 0;

            label113:
            while (true) {
               var10000 = var11;

               label111:
               while (true) {
                  if (var10000 >= var5) {
                     break label113;
                  }

                  var10000 = 0;
                  if (var4 != 0) {
                     continue label116;
                  }

                  int var12 = 0;

                  label108:
                  while (true) {
                     var10000 = var12;

                     label106:
                     while (true) {
                        if (var10000 >= 16) {
                           break label108;
                        }

                        double var13 = 0.125;
                        double var15 = this.bpb[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
                        double var17 = this.bpb[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
                        double var19 = this.bpb[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
                        double var21 = this.bpb[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
                        double var23 = (this.bpb[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
                        double var25 = (this.bpb[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
                        double var27 = (this.bpb[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
                        double var29 = (this.bpb[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;
                        var10000 = 0;
                        if (var4 != 0) {
                           continue label111;
                        }

                        int var31 = 0;

                        label103:
                        while (true) {
                           var10000 = var31;

                           label101:
                           while (true) {
                              if (var10000 >= 8) {
                                 break label103;
                              }

                              double var32 = 0.25;
                              double var34 = var15;
                              double var36 = var17;
                              double var38 = (var19 - var15) * var32;
                              double var40 = (var21 - var17) * var32;
                              var10000 = 0;
                              if (var4 != 0) {
                                 continue label106;
                              }

                              int var42 = 0;

                              label98:
                              while (true) {
                                 var10000 = var42;
                                 int var10001 = 4;

                                 label96:
                                 while (true) {
                                    if (var10000 >= var10001) {
                                       break label98;
                                    }

                                    double var43 = 0.25;
                                    double var45 = var34;
                                    double var47 = (var36 - var34) * var43;
                                    var10000 = 0;
                                    if (var4 != 0) {
                                       continue label101;
                                    }

                                    int var49 = 0;

                                    while (var49 < 4) {
                                       zfz var50 = null;
                                       var10000 = var12 * 8 + var31;
                                       var10001 = var6;
                                       if (var4 != 0) {
                                          continue label96;
                                       }

                                       if (var10000 < var6) {
                                          var50 = ox_.ska.l4i();
                                       }

                                       label90: {
                                          label89: {
                                             try {
                                                double var61;
                                                var10000 = (var61 = var45 - 0.0) == 0.0 ? 0 : (var61 < 0.0 ? -1 : 1);
                                                if (var4 != 0) {
                                                   break label90;
                                                }

                                                if (var10000 <= 0) {
                                                   break label89;
                                                }
                                             } catch (oov var54) {
                                                throw a(var54);
                                             }

                                             var50 = ox_.pzt.l4i();
                                          }

                                          var10000 = var42 + var10 * 4;
                                       }

                                       int var51 = var10000;
                                       int var52 = var31 + var12 * 8;
                                       int var53 = var49 + var11 * 4;
                                       var3.x6f(var51, var52, var53, var50);
                                       var45 += var47;
                                       var49++;
                                       if (var4 != 0) {
                                          break;
                                       }
                                    }

                                    var34 += var38;
                                    var36 += var40;
                                    var42++;
                                    if (var4 != 0) {
                                       break label98;
                                    }
                                    break;
                                 }
                              }

                              var15 += var23;
                              var17 += var25;
                              var19 += var27;
                              var21 += var29;
                              var31++;
                              if (var4 != 0) {
                                 break label103;
                              }
                              break;
                           }
                        }

                        var12++;
                        if (var4 != 0) {
                           break label108;
                        }
                        break;
                     }
                  }

                  var11++;
                  if (var4 != 0) {
                     break label113;
                  }
                  break;
               }
            }

            var10++;
            if (var4 != 0) {
               return;
            }
            continue label118;
         }

         return;
      }
   }

   public void vk_(int param1, int param2, lno param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield l76.w7h Lt9d;
      // 004: invokevirtual t9d._s3 ()I
      // 007: bipush 1
      // 008: iadd
      // 009: istore 5
      // 00b: ldc2_w 0.03125
      // 00e: dstore 6
      // 010: invokestatic t9d.b ()I
      // 013: aload 0
      // 014: aload 0
      // 015: getfield l76.m0e Lb_x;
      // 018: aload 0
      // 019: getfield l76.brs [D
      // 01c: iload 1
      // 01d: bipush 16
      // 01f: imul
      // 020: iload 2
      // 021: bipush 16
      // 023: imul
      // 024: bipush 0
      // 025: bipush 16
      // 027: bipush 16
      // 029: bipush 1
      // 02a: dload 6
      // 02c: dload 6
      // 02e: dconst_1
      // 02f: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 032: putfield l76.brs [D
      // 035: aload 0
      // 036: aload 0
      // 037: getfield l76.m0e Lb_x;
      // 03a: aload 0
      // 03b: getfield l76.m8m [D
      // 03e: iload 1
      // 03f: bipush 16
      // 041: imul
      // 042: bipush 109
      // 044: iload 2
      // 045: bipush 16
      // 047: imul
      // 048: bipush 16
      // 04a: bipush 1
      // 04b: bipush 16
      // 04d: dload 6
      // 04f: dconst_1
      // 050: dload 6
      // 052: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 055: putfield l76.m8m [D
      // 058: aload 0
      // 059: aload 0
      // 05a: getfield l76.zk5 Lb_x;
      // 05d: aload 0
      // 05e: getfield l76.d0y [D
      // 061: iload 1
      // 062: bipush 16
      // 064: imul
      // 065: iload 2
      // 066: bipush 16
      // 068: imul
      // 069: bipush 0
      // 06a: bipush 16
      // 06c: bipush 16
      // 06e: bipush 1
      // 06f: dload 6
      // 071: ldc2_w 2.0
      // 074: dmul
      // 075: dload 6
      // 077: ldc2_w 2.0
      // 07a: dmul
      // 07b: dload 6
      // 07d: ldc2_w 2.0
      // 080: dmul
      // 081: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 084: putfield l76.d0y [D
      // 087: istore 4
      // 089: bipush 0
      // 08a: istore 8
      // 08c: iload 8
      // 08e: bipush 16
      // 090: if_icmpge 398
      // 093: bipush 0
      // 094: istore 9
      // 096: iload 9
      // 098: bipush 16
      // 09a: if_icmpge 390
      // 09d: aload 0
      // 09e: getfield l76.brs [D
      // 0a1: iload 8
      // 0a3: iload 9
      // 0a5: bipush 16
      // 0a7: imul
      // 0a8: iadd
      // 0a9: daload
      // 0aa: aload 0
      // 0ab: getfield l76.lu6 Ljava/util/Random;
      // 0ae: invokevirtual java/util/Random.nextDouble ()D
      // 0b1: ldc2_w 0.2
      // 0b4: dmul
      // 0b5: dadd
      // 0b6: dconst_0
      // 0b7: dcmpl
      // 0b8: iload 4
      // 0ba: ifeq 08e
      // 0bd: iload 4
      // 0bf: ifeq 0cd
      // 0c2: ifle 0d0
      // 0c5: goto 0cc
      // 0c8: invokestatic l76.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: bipush 1
      // 0cd: goto 0d1
      // 0d0: bipush 0
      // 0d1: istore 10
      // 0d3: aload 0
      // 0d4: getfield l76.m8m [D
      // 0d7: iload 8
      // 0d9: iload 9
      // 0db: bipush 16
      // 0dd: imul
      // 0de: iadd
      // 0df: daload
      // 0e0: aload 0
      // 0e1: getfield l76.lu6 Ljava/util/Random;
      // 0e4: invokevirtual java/util/Random.nextDouble ()D
      // 0e7: ldc2_w 0.2
      // 0ea: dmul
      // 0eb: dadd
      // 0ec: dconst_0
      // 0ed: dcmpl
      // 0ee: iload 4
      // 0f0: ifeq 0fe
      // 0f3: ifle 101
      // 0f6: goto 0fd
      // 0f9: invokestatic l76.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: bipush 1
      // 0fe: goto 102
      // 101: bipush 0
      // 102: istore 11
      // 104: aload 0
      // 105: getfield l76.d0y [D
      // 108: iload 8
      // 10a: iload 9
      // 10c: bipush 16
      // 10e: imul
      // 10f: iadd
      // 110: daload
      // 111: ldc2_w 3.0
      // 114: ddiv
      // 115: ldc2_w 3.0
      // 118: dadd
      // 119: aload 0
      // 11a: getfield l76.lu6 Ljava/util/Random;
      // 11d: invokevirtual java/util/Random.nextDouble ()D
      // 120: ldc2_w 0.25
      // 123: dmul
      // 124: dadd
      // 125: d2i
      // 126: istore 12
      // 128: bipush -1
      // 129: istore 13
      // 12b: getstatic ox_.pzt Le0x;
      // 12e: invokevirtual e0x.l4i ()Lzfz;
      // 131: astore 14
      // 133: getstatic ox_.pzt Le0x;
      // 136: invokevirtual e0x.l4i ()Lzfz;
      // 139: astore 15
      // 13b: bipush 127
      // 13d: istore 16
      // 13f: iload 16
      // 141: iflt 388
      // 144: iload 16
      // 146: bipush 127
      // 148: aload 0
      // 149: getfield l76.lu6 Ljava/util/Random;
      // 14c: bipush 5
      // 14d: invokevirtual java/util/Random.nextInt (I)I
      // 150: isub
      // 151: iload 4
      // 153: ifeq 09a
      // 156: iload 4
      // 158: ifeq 176
      // 15b: if_icmpge 369
      // 15e: goto 165
      // 161: invokestatic l76.a (Loov;)Loov;
      // 164: athrow
      // 165: iload 16
      // 167: aload 0
      // 168: getfield l76.lu6 Ljava/util/Random;
      // 16b: bipush 5
      // 16c: invokevirtual java/util/Random.nextInt (I)I
      // 16f: goto 176
      // 172: invokestatic l76.a (Loov;)Loov;
      // 175: athrow
      // 176: if_icmple 369
      // 179: aload 3
      // 17a: iload 9
      // 17c: iload 16
      // 17e: iload 8
      // 180: invokevirtual lno.ql9 (III)Lzfz;
      // 183: astore 17
      // 185: aload 17
      // 187: invokeinterface zfz.r_y ()Le0x; 1
      // 18c: iload 4
      // 18e: ifeq 1a9
      // 191: ifnull 361
      // 194: goto 19b
      // 197: invokestatic l76.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 17
      // 19d: invokeinterface zfz.r_y ()Le0x; 1
      // 1a2: goto 1a9
      // 1a5: invokestatic l76.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: iload 4
      // 1ab: ifeq 1cc
      // 1ae: invokevirtual e0x.p1r ()Lp3y;
      // 1b1: getstatic p3y.cei Lp3y;
      // 1b4: if_acmpeq 361
      // 1b7: goto 1be
      // 1ba: invokestatic l76.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: aload 17
      // 1c0: invokeinterface zfz.r_y ()Le0x; 1
      // 1c5: goto 1cc
      // 1c8: invokestatic l76.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: getstatic ox_.pzt Le0x;
      // 1cf: if_acmpne 364
      // 1d2: iload 13
      // 1d4: iload 4
      // 1d6: ifeq 343
      // 1d9: goto 1e0
      // 1dc: invokestatic l76.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: bipush -1
      // 1e1: if_icmpne 33a
      // 1e4: goto 1eb
      // 1e7: invokestatic l76.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: iload 12
      // 1ed: iload 4
      // 1ef: ifeq 213
      // 1f2: goto 1f9
      // 1f5: invokestatic l76.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: ifgt 211
      // 1fc: goto 203
      // 1ff: invokestatic l76.a (Loov;)Loov;
      // 202: athrow
      // 203: aconst_null
      // 204: astore 14
      // 206: getstatic ox_.pzt Le0x;
      // 209: invokevirtual e0x.l4i ()Lzfz;
      // 20c: astore 15
      // 20e: goto 294
      // 211: iload 16
      // 213: iload 5
      // 215: bipush 4
      // 216: isub
      // 217: iload 4
      // 219: ifeq 298
      // 21c: if_icmplt 294
      // 21f: goto 226
      // 222: invokestatic l76.a (Loov;)Loov;
      // 225: athrow
      // 226: iload 16
      // 228: iload 5
      // 22a: bipush 1
      // 22b: iadd
      // 22c: iload 4
      // 22e: ifeq 298
      // 231: goto 238
      // 234: invokestatic l76.a (Loov;)Loov;
      // 237: athrow
      // 238: if_icmpgt 294
      // 23b: goto 242
      // 23e: invokestatic l76.a (Loov;)Loov;
      // 241: athrow
      // 242: getstatic ox_.pzt Le0x;
      // 245: invokevirtual e0x.l4i ()Lzfz;
      // 248: astore 14
      // 24a: getstatic ox_.pzt Le0x;
      // 24d: invokevirtual e0x.l4i ()Lzfz;
      // 250: astore 15
      // 252: iload 11
      // 254: iload 4
      // 256: ifeq 275
      // 259: ifeq 273
      // 25c: goto 263
      // 25f: invokestatic l76.a (Loov;)Loov;
      // 262: athrow
      // 263: getstatic ox_.bqn Le0x;
      // 266: invokevirtual e0x.l4i ()Lzfz;
      // 269: astore 14
      // 26b: getstatic ox_.pzt Le0x;
      // 26e: invokevirtual e0x.l4i ()Lzfz;
      // 271: astore 15
      // 273: iload 10
      // 275: iload 4
      // 277: ifeq 296
      // 27a: ifeq 294
      // 27d: goto 284
      // 280: invokestatic l76.a (Loov;)Loov;
      // 283: athrow
      // 284: getstatic ox_.p58 Le0x;
      // 287: invokevirtual e0x.l4i ()Lzfz;
      // 28a: astore 14
      // 28c: getstatic ox_.p58 Le0x;
      // 28f: invokevirtual e0x.l4i ()Lzfz;
      // 292: astore 15
      // 294: iload 16
      // 296: iload 5
      // 298: iload 4
      // 29a: ifeq 307
      // 29d: if_icmpge 2f1
      // 2a0: goto 2a7
      // 2a3: invokestatic l76.a (Loov;)Loov;
      // 2a6: athrow
      // 2a7: aload 14
      // 2a9: iload 4
      // 2ab: ifeq 2ef
      // 2ae: goto 2b5
      // 2b1: invokestatic l76.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: ifnull 2e2
      // 2b8: goto 2bf
      // 2bb: invokestatic l76.a (Loov;)Loov;
      // 2be: athrow
      // 2bf: aload 14
      // 2c1: iload 4
      // 2c3: ifeq 2ef
      // 2c6: goto 2cd
      // 2c9: invokestatic l76.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: invokeinterface zfz.r_y ()Le0x; 1
      // 2d2: invokevirtual e0x.p1r ()Lp3y;
      // 2d5: getstatic p3y.cei Lp3y;
      // 2d8: if_acmpne 2f1
      // 2db: goto 2e2
      // 2de: invokestatic l76.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: getstatic ox_.ska Les2;
      // 2e5: invokevirtual es2.l4i ()Lzfz;
      // 2e8: goto 2ef
      // 2eb: invokestatic l76.a (Loov;)Loov;
      // 2ee: athrow
      // 2ef: astore 14
      // 2f1: iload 12
      // 2f3: istore 13
      // 2f5: iload 4
      // 2f7: ifeq 335
      // 2fa: iload 16
      // 2fc: iload 5
      // 2fe: bipush 1
      // 2ff: isub
      // 300: goto 307
      // 303: invokestatic l76.a (Loov;)Loov;
      // 306: athrow
      // 307: if_icmplt 322
      // 30a: aload 3
      // 30b: iload 9
      // 30d: iload 16
      // 30f: iload 8
      // 311: aload 14
      // 313: invokevirtual lno.x6f (IIILzfz;)V
      // 316: iload 4
      // 318: ifne 364
      // 31b: goto 322
      // 31e: invokestatic l76.a (Loov;)Loov;
      // 321: athrow
      // 322: aload 3
      // 323: iload 9
      // 325: iload 16
      // 327: iload 8
      // 329: aload 15
      // 32b: invokevirtual lno.x6f (IIILzfz;)V
      // 32e: goto 335
      // 331: invokestatic l76.a (Loov;)Loov;
      // 334: athrow
      // 335: iload 4
      // 337: ifne 364
      // 33a: iload 13
      // 33c: goto 343
      // 33f: invokestatic l76.a (Loov;)Loov;
      // 342: athrow
      // 343: ifle 364
      // 346: iinc 13 -1
      // 349: aload 3
      // 34a: iload 9
      // 34c: iload 16
      // 34e: iload 8
      // 350: aload 15
      // 352: invokevirtual lno.x6f (IIILzfz;)V
      // 355: iload 4
      // 357: ifne 364
      // 35a: goto 361
      // 35d: invokestatic l76.a (Loov;)Loov;
      // 360: athrow
      // 361: bipush -1
      // 362: istore 13
      // 364: iload 4
      // 366: ifne 380
      // 369: aload 3
      // 36a: iload 9
      // 36c: iload 16
      // 36e: iload 8
      // 370: getstatic ox_.n6z Le0x;
      // 373: invokevirtual e0x.l4i ()Lzfz;
      // 376: invokevirtual lno.x6f (IIILzfz;)V
      // 379: goto 380
      // 37c: invokestatic l76.a (Loov;)Loov;
      // 37f: athrow
      // 380: iinc 16 -1
      // 383: iload 4
      // 385: ifne 13f
      // 388: iinc 9 1
      // 38b: iload 4
      // 38d: ifne 096
      // 390: iinc 8 1
      // 393: iload 4
      // 395: ifne 08c
      // 398: return
   }

   @Override
   public tts et2(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield l76.lu6 Ljava/util/Random;
      // 04: iload 1
      // 05: i2l
      // 06: ldc2_w 341873128712
      // 09: lmul
      // 0a: iload 2
      // 0b: i2l
      // 0c: ldc2_w 132897987541
      // 0f: lmul
      // 10: ladd
      // 11: invokevirtual java/util/Random.setSeed (J)V
      // 14: invokestatic t9d.c ()I
      // 17: new lno
      // 1a: dup
      // 1b: invokespecial lno.<init> ()V
      // 1e: astore 4
      // 20: aload 0
      // 21: iload 1
      // 22: iload 2
      // 23: aload 4
      // 25: invokevirtual l76.ndo (IILlno;)V
      // 28: aload 0
      // 29: iload 1
      // 2a: iload 2
      // 2b: aload 4
      // 2d: invokevirtual l76.vk_ (IILlno;)V
      // 30: istore 3
      // 31: aload 0
      // 32: getfield l76.wzz Luk2;
      // 35: aload 0
      // 36: aload 0
      // 37: getfield l76.w7h Lt9d;
      // 3a: iload 1
      // 3b: iload 2
      // 3c: aload 4
      // 3e: invokevirtual uk2.vyh (Lg6k;Lt9d;IILlno;)V
      // 41: aload 0
      // 42: iload 3
      // 43: ifne 5b
      // 46: getfield l76.ls6 Z
      // 49: ifeq 6a
      // 4c: goto 53
      // 4f: invokestatic l76.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: goto 5b
      // 57: invokestatic l76.a (Loov;)Loov;
      // 5a: athrow
      // 5b: getfield l76.vbl Lnet/minecraft/world/gen/structure/MapGenNetherBridge;
      // 5e: aload 0
      // 5f: aload 0
      // 60: getfield l76.w7h Lt9d;
      // 63: iload 1
      // 64: iload 2
      // 65: aload 4
      // 67: invokevirtual net/minecraft/world/gen/structure/MapGenNetherBridge.vyh (Lg6k;Lt9d;IILlno;)V
      // 6a: new tts
      // 6d: dup
      // 6e: aload 0
      // 6f: getfield l76.w7h Lt9d;
      // 72: aload 4
      // 74: iload 1
      // 75: iload 2
      // 76: invokespecial tts.<init> (Lt9d;Llno;II)V
      // 79: astore 5
      // 7b: aload 0
      // 7c: getfield l76.w7h Lt9d;
      // 7f: invokevirtual t9d.ql0 ()Lcdp;
      // 82: aconst_null
      // 83: checkcast [Lgyu;
      // 86: iload 1
      // 87: bipush 16
      // 89: imul
      // 8a: iload 2
      // 8b: bipush 16
      // 8d: imul
      // 8e: bipush 16
      // 90: bipush 16
      // 92: invokevirtual cdp.twf ([Lgyu;IIII)[Lgyu;
      // 95: astore 6
      // 97: aload 5
      // 99: invokevirtual tts.xtk ()[B
      // 9c: astore 7
      // 9e: bipush 0
      // 9f: istore 8
      // a1: iload 8
      // a3: aload 7
      // a5: arraylength
      // a6: if_icmpge c9
      // a9: aload 7
      // ab: iload 8
      // ad: aload 6
      // af: iload 8
      // b1: aaload
      // b2: getfield gyu.mu9 I
      // b5: i2b
      // b6: bastore
      // b7: iinc 8 1
      // ba: iload 3
      // bb: ifne ce
      // be: iload 3
      // bf: ifeq a1
      // c2: goto c9
      // c5: invokestatic l76.a (Loov;)Loov;
      // c8: athrow
      // c9: aload 5
      // cb: invokevirtual tts.e8r ()V
      // ce: aload 5
      // d0: areturn
   }

   private double[] b2i(double[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 8
      // 005: aload 1
      // 006: iload 8
      // 008: ifeq 026
      // 00b: ifnonnull 027
      // 00e: goto 015
      // 011: invokestatic l76.a (Loov;)Loov;
      // 014: athrow
      // 015: iload 5
      // 017: iload 6
      // 019: imul
      // 01a: iload 7
      // 01c: imul
      // 01d: newarray 7
      // 01f: goto 026
      // 022: invokestatic l76.a (Loov;)Loov;
      // 025: athrow
      // 026: astore 1
      // 027: ldc2_w 684.412
      // 02a: dstore 9
      // 02c: ldc2_w 2053.236
      // 02f: dstore 11
      // 031: aload 0
      // 032: aload 0
      // 033: getfield l76.cyt Lb_x;
      // 036: aload 0
      // 037: getfield l76.lhe [D
      // 03a: iload 2
      // 03b: iload 3
      // 03c: iload 4
      // 03e: iload 5
      // 040: bipush 1
      // 041: iload 7
      // 043: dconst_1
      // 044: dconst_0
      // 045: dconst_1
      // 046: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 049: putfield l76.lhe [D
      // 04c: aload 0
      // 04d: aload 0
      // 04e: getfield l76._xn Lb_x;
      // 051: aload 0
      // 052: getfield l76.f8k [D
      // 055: iload 2
      // 056: iload 3
      // 057: iload 4
      // 059: iload 5
      // 05b: bipush 1
      // 05c: iload 7
      // 05e: ldc2_w 100.0
      // 061: dconst_0
      // 062: ldc2_w 100.0
      // 065: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 068: putfield l76.f8k [D
      // 06b: aload 0
      // 06c: aload 0
      // 06d: getfield l76.p6d Lb_x;
      // 070: aload 0
      // 071: getfield l76.gbx [D
      // 074: iload 2
      // 075: iload 3
      // 076: iload 4
      // 078: iload 5
      // 07a: iload 6
      // 07c: iload 7
      // 07e: dload 9
      // 080: ldc2_w 80.0
      // 083: ddiv
      // 084: dload 11
      // 086: ldc2_w 60.0
      // 089: ddiv
      // 08a: dload 9
      // 08c: ldc2_w 80.0
      // 08f: ddiv
      // 090: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 093: putfield l76.gbx [D
      // 096: aload 0
      // 097: aload 0
      // 098: getfield l76.cyx Lb_x;
      // 09b: aload 0
      // 09c: getfield l76.h_j [D
      // 09f: iload 2
      // 0a0: iload 3
      // 0a1: iload 4
      // 0a3: iload 5
      // 0a5: iload 6
      // 0a7: iload 7
      // 0a9: dload 9
      // 0ab: dload 11
      // 0ad: dload 9
      // 0af: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 0b2: putfield l76.h_j [D
      // 0b5: aload 0
      // 0b6: aload 0
      // 0b7: getfield l76.vuh Lb_x;
      // 0ba: aload 0
      // 0bb: getfield l76.tw6 [D
      // 0be: iload 2
      // 0bf: iload 3
      // 0c0: iload 4
      // 0c2: iload 5
      // 0c4: iload 6
      // 0c6: iload 7
      // 0c8: dload 9
      // 0ca: dload 11
      // 0cc: dload 9
      // 0ce: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 0d1: putfield l76.tw6 [D
      // 0d4: bipush 0
      // 0d5: istore 13
      // 0d7: iload 6
      // 0d9: newarray 7
      // 0db: astore 14
      // 0dd: bipush 0
      // 0de: istore 15
      // 0e0: iload 15
      // 0e2: iload 6
      // 0e4: if_icmpge 172
      // 0e7: aload 14
      // 0e9: iload 15
      // 0eb: iload 15
      // 0ed: i2d
      // 0ee: ldc2_w 3.141592653589793
      // 0f1: dmul
      // 0f2: ldc2_w 6.0
      // 0f5: dmul
      // 0f6: iload 6
      // 0f8: i2d
      // 0f9: ddiv
      // 0fa: invokestatic java/lang/Math.cos (D)D
      // 0fd: ldc2_w 2.0
      // 100: dmul
      // 101: dastore
      // 102: iload 15
      // 104: i2d
      // 105: dstore 16
      // 107: iload 15
      // 109: iload 8
      // 10b: ifeq 144
      // 10e: iload 6
      // 110: bipush 2
      // 111: idiv
      // 112: iload 8
      // 114: ifeq 179
      // 117: goto 11e
      // 11a: invokestatic l76.a (Loov;)Loov;
      // 11d: athrow
      // 11e: if_icmple 132
      // 121: goto 128
      // 124: invokestatic l76.a (Loov;)Loov;
      // 127: athrow
      // 128: iload 6
      // 12a: bipush 1
      // 12b: isub
      // 12c: iload 15
      // 12e: isub
      // 12f: i2d
      // 130: dstore 16
      // 132: dload 16
      // 134: ldc2_w 4.0
      // 137: iload 8
      // 139: ifeq 153
      // 13c: dcmpg
      // 13d: goto 144
      // 140: invokestatic l76.a (Loov;)Loov;
      // 143: athrow
      // 144: ifge 16a
      // 147: ldc2_w 4.0
      // 14a: dload 16
      // 14c: goto 153
      // 14f: invokestatic l76.a (Loov;)Loov;
      // 152: athrow
      // 153: dsub
      // 154: dstore 16
      // 156: aload 14
      // 158: iload 15
      // 15a: dup2
      // 15b: daload
      // 15c: dload 16
      // 15e: dload 16
      // 160: dmul
      // 161: dload 16
      // 163: dmul
      // 164: ldc2_w 10.0
      // 167: dmul
      // 168: dsub
      // 169: dastore
      // 16a: iinc 15 1
      // 16d: iload 8
      // 16f: ifne 0e0
      // 172: bipush 0
      // 173: istore 15
      // 175: iload 15
      // 177: iload 5
      // 179: if_icmpge 2c4
      // 17c: bipush 0
      // 17d: istore 16
      // 17f: iload 16
      // 181: iload 7
      // 183: if_icmpge 2bc
      // 186: dconst_0
      // 187: dstore 17
      // 189: bipush 0
      // 18a: iload 8
      // 18c: ifeq 177
      // 18f: istore 19
      // 191: iload 19
      // 193: iload 6
      // 195: if_icmpge 2b4
      // 198: dconst_0
      // 199: dstore 20
      // 19b: aload 14
      // 19d: iload 19
      // 19f: daload
      // 1a0: dstore 22
      // 1a2: aload 0
      // 1a3: getfield l76.h_j [D
      // 1a6: iload 13
      // 1a8: daload
      // 1a9: ldc2_w 512.0
      // 1ac: ddiv
      // 1ad: dstore 24
      // 1af: aload 0
      // 1b0: getfield l76.tw6 [D
      // 1b3: iload 13
      // 1b5: daload
      // 1b6: ldc2_w 512.0
      // 1b9: ddiv
      // 1ba: dstore 26
      // 1bc: aload 0
      // 1bd: getfield l76.gbx [D
      // 1c0: iload 13
      // 1c2: daload
      // 1c3: ldc2_w 10.0
      // 1c6: ddiv
      // 1c7: dconst_1
      // 1c8: dadd
      // 1c9: ldc2_w 2.0
      // 1cc: ddiv
      // 1cd: dstore 28
      // 1cf: dload 28
      // 1d1: dconst_0
      // 1d2: dcmpg
      // 1d3: iload 8
      // 1d5: ifeq 181
      // 1d8: iload 8
      // 1da: ifeq 207
      // 1dd: ifge 1f0
      // 1e0: goto 1e7
      // 1e3: invokestatic l76.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: dload 24
      // 1e9: dstore 20
      // 1eb: iload 8
      // 1ed: ifne 227
      // 1f0: dload 28
      // 1f2: dconst_1
      // 1f3: iload 8
      // 1f5: ifeq 224
      // 1f8: goto 1ff
      // 1fb: invokestatic l76.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: dcmpl
      // 200: goto 207
      // 203: invokestatic l76.a (Loov;)Loov;
      // 206: athrow
      // 207: ifle 213
      // 20a: dload 26
      // 20c: dstore 20
      // 20e: iload 8
      // 210: ifne 227
      // 213: dload 24
      // 215: dload 26
      // 217: dload 24
      // 219: dsub
      // 21a: dload 28
      // 21c: dmul
      // 21d: goto 224
      // 220: invokestatic l76.a (Loov;)Loov;
      // 223: athrow
      // 224: dadd
      // 225: dstore 20
      // 227: dload 20
      // 229: dload 22
      // 22b: dsub
      // 22c: dstore 20
      // 22e: iload 19
      // 230: iload 8
      // 232: ifeq 274
      // 235: iload 6
      // 237: bipush 4
      // 238: isub
      // 239: if_icmple 262
      // 23c: goto 243
      // 23f: invokestatic l76.a (Loov;)Loov;
      // 242: athrow
      // 243: iload 19
      // 245: iload 6
      // 247: bipush 4
      // 248: isub
      // 249: isub
      // 24a: i2f
      // 24b: ldc 3.0
      // 24d: nop
      // 24e: fdiv
      // 24f: f2d
      // 250: dstore 30
      // 252: dload 20
      // 254: dconst_1
      // 255: dload 30
      // 257: dsub
      // 258: dmul
      // 259: ldc2_w -10.0
      // 25c: dload 30
      // 25e: dmul
      // 25f: dadd
      // 260: dstore 20
      // 262: iload 19
      // 264: i2d
      // 265: dload 17
      // 267: iload 8
      // 269: ifeq 287
      // 26c: dcmpg
      // 26d: goto 274
      // 270: invokestatic l76.a (Loov;)Loov;
      // 273: athrow
      // 274: ifge 2a3
      // 277: dload 17
      // 279: iload 19
      // 27b: i2d
      // 27c: dsub
      // 27d: ldc2_w 4.0
      // 280: goto 287
      // 283: invokestatic l76.a (Loov;)Loov;
      // 286: athrow
      // 287: ddiv
      // 288: dstore 30
      // 28a: dload 30
      // 28c: dconst_0
      // 28d: dconst_1
      // 28e: invokestatic fe6.lft (DDD)D
      // 291: dstore 30
      // 293: dload 20
      // 295: dconst_1
      // 296: dload 30
      // 298: dsub
      // 299: dmul
      // 29a: ldc2_w -10.0
      // 29d: dload 30
      // 29f: dmul
      // 2a0: dadd
      // 2a1: dstore 20
      // 2a3: aload 1
      // 2a4: iload 13
      // 2a6: dload 20
      // 2a8: dastore
      // 2a9: iinc 13 1
      // 2ac: iinc 19 1
      // 2af: iload 8
      // 2b1: ifne 191
      // 2b4: iinc 16 1
      // 2b7: iload 8
      // 2b9: ifne 17f
      // 2bc: iinc 15 1
      // 2bf: iload 8
      // 2c1: ifne 175
      // 2c4: aload 1
      // 2c5: areturn
   }

   @Override
   public boolean pnt(int var1, int var2) {
      return true;
   }

   @Override
   public void fbq(g6k param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: putstatic d26.trk Z
      // 004: invokestatic t9d.b ()I
      // 007: new mew
      // 00a: dup
      // 00b: iload 2
      // 00c: bipush 16
      // 00e: imul
      // 00f: bipush 0
      // 010: iload 3
      // 011: bipush 16
      // 013: imul
      // 014: invokespecial mew.<init> (III)V
      // 017: astore 5
      // 019: istore 4
      // 01b: new h2f
      // 01e: dup
      // 01f: iload 2
      // 020: iload 3
      // 021: invokespecial h2f.<init> (II)V
      // 024: astore 6
      // 026: aload 0
      // 027: getfield l76.vbl Lnet/minecraft/world/gen/structure/MapGenNetherBridge;
      // 02a: aload 0
      // 02b: getfield l76.w7h Lt9d;
      // 02e: aload 0
      // 02f: getfield l76.lu6 Ljava/util/Random;
      // 032: aload 6
      // 034: invokevirtual net/minecraft/world/gen/structure/MapGenNetherBridge.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 037: pop
      // 038: bipush 0
      // 039: istore 7
      // 03b: iload 7
      // 03d: bipush 8
      // 03f: if_icmpge 08e
      // 042: aload 0
      // 043: getfield l76.swp Lva9;
      // 046: aload 0
      // 047: getfield l76.w7h Lt9d;
      // 04a: aload 0
      // 04b: getfield l76.lu6 Ljava/util/Random;
      // 04e: aload 5
      // 050: aload 0
      // 051: getfield l76.lu6 Ljava/util/Random;
      // 054: bipush 16
      // 056: invokevirtual java/util/Random.nextInt (I)I
      // 059: bipush 8
      // 05b: iadd
      // 05c: aload 0
      // 05d: getfield l76.lu6 Ljava/util/Random;
      // 060: bipush 120
      // 062: invokevirtual java/util/Random.nextInt (I)I
      // 065: bipush 4
      // 066: iadd
      // 067: aload 0
      // 068: getfield l76.lu6 Ljava/util/Random;
      // 06b: bipush 16
      // 06d: invokevirtual java/util/Random.nextInt (I)I
      // 070: bipush 8
      // 072: iadd
      // 073: invokevirtual mew.ec4 (III)Lmew;
      // 076: invokevirtual va9.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 079: pop
      // 07a: iinc 7 1
      // 07d: iload 4
      // 07f: ifeq 091
      // 082: iload 4
      // 084: ifne 03b
      // 087: goto 08e
      // 08a: invokestatic l76.a (Loov;)Loov;
      // 08d: athrow
      // 08e: bipush 0
      // 08f: istore 7
      // 091: iload 7
      // 093: aload 0
      // 094: getfield l76.lu6 Ljava/util/Random;
      // 097: aload 0
      // 098: getfield l76.lu6 Ljava/util/Random;
      // 09b: bipush 10
      // 09d: invokevirtual java/util/Random.nextInt (I)I
      // 0a0: bipush 1
      // 0a1: iadd
      // 0a2: invokevirtual java/util/Random.nextInt (I)I
      // 0a5: bipush 1
      // 0a6: iadd
      // 0a7: if_icmpge 0fd
      // 0aa: aload 0
      // 0ab: getfield l76.msa Ly5_;
      // 0ae: aload 0
      // 0af: getfield l76.w7h Lt9d;
      // 0b2: aload 0
      // 0b3: getfield l76.lu6 Ljava/util/Random;
      // 0b6: aload 5
      // 0b8: aload 0
      // 0b9: getfield l76.lu6 Ljava/util/Random;
      // 0bc: bipush 16
      // 0be: invokevirtual java/util/Random.nextInt (I)I
      // 0c1: bipush 8
      // 0c3: iadd
      // 0c4: aload 0
      // 0c5: getfield l76.lu6 Ljava/util/Random;
      // 0c8: bipush 120
      // 0ca: invokevirtual java/util/Random.nextInt (I)I
      // 0cd: bipush 4
      // 0ce: iadd
      // 0cf: aload 0
      // 0d0: getfield l76.lu6 Ljava/util/Random;
      // 0d3: bipush 16
      // 0d5: invokevirtual java/util/Random.nextInt (I)I
      // 0d8: bipush 8
      // 0da: iadd
      // 0db: invokevirtual mew.ec4 (III)Lmew;
      // 0de: invokevirtual y5_.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 0e1: pop
      // 0e2: iinc 7 1
      // 0e5: iload 4
      // 0e7: ifeq 100
      // 0ea: goto 0f1
      // 0ed: invokestatic l76.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 4
      // 0f3: ifne 091
      // 0f6: goto 0fd
      // 0f9: invokestatic l76.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: bipush 0
      // 0fe: istore 7
      // 100: iload 7
      // 102: aload 0
      // 103: getfield l76.lu6 Ljava/util/Random;
      // 106: aload 0
      // 107: getfield l76.lu6 Ljava/util/Random;
      // 10a: bipush 10
      // 10c: invokevirtual java/util/Random.nextInt (I)I
      // 10f: bipush 1
      // 110: iadd
      // 111: invokevirtual java/util/Random.nextInt (I)I
      // 114: if_icmpge 16a
      // 117: aload 0
      // 118: getfield l76.t2x Lhij;
      // 11b: aload 0
      // 11c: getfield l76.w7h Lt9d;
      // 11f: aload 0
      // 120: getfield l76.lu6 Ljava/util/Random;
      // 123: aload 5
      // 125: aload 0
      // 126: getfield l76.lu6 Ljava/util/Random;
      // 129: bipush 16
      // 12b: invokevirtual java/util/Random.nextInt (I)I
      // 12e: bipush 8
      // 130: iadd
      // 131: aload 0
      // 132: getfield l76.lu6 Ljava/util/Random;
      // 135: bipush 120
      // 137: invokevirtual java/util/Random.nextInt (I)I
      // 13a: bipush 4
      // 13b: iadd
      // 13c: aload 0
      // 13d: getfield l76.lu6 Ljava/util/Random;
      // 140: bipush 16
      // 142: invokevirtual java/util/Random.nextInt (I)I
      // 145: bipush 8
      // 147: iadd
      // 148: invokevirtual mew.ec4 (III)Lmew;
      // 14b: invokevirtual hij.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 14e: pop
      // 14f: iinc 7 1
      // 152: iload 4
      // 154: ifeq 16d
      // 157: goto 15e
      // 15a: invokestatic l76.a (Loov;)Loov;
      // 15d: athrow
      // 15e: iload 4
      // 160: ifne 100
      // 163: goto 16a
      // 166: invokestatic l76.a (Loov;)Loov;
      // 169: athrow
      // 16a: bipush 0
      // 16b: istore 7
      // 16d: iload 7
      // 16f: bipush 10
      // 171: if_icmpge 1c6
      // 174: aload 0
      // 175: getfield l76.pvw Lfhq;
      // 178: aload 0
      // 179: getfield l76.w7h Lt9d;
      // 17c: aload 0
      // 17d: getfield l76.lu6 Ljava/util/Random;
      // 180: aload 5
      // 182: aload 0
      // 183: getfield l76.lu6 Ljava/util/Random;
      // 186: bipush 16
      // 188: invokevirtual java/util/Random.nextInt (I)I
      // 18b: bipush 8
      // 18d: iadd
      // 18e: aload 0
      // 18f: getfield l76.lu6 Ljava/util/Random;
      // 192: sipush 128
      // 195: invokevirtual java/util/Random.nextInt (I)I
      // 198: aload 0
      // 199: getfield l76.lu6 Ljava/util/Random;
      // 19c: bipush 16
      // 19e: invokevirtual java/util/Random.nextInt (I)I
      // 1a1: bipush 8
      // 1a3: iadd
      // 1a4: invokevirtual mew.ec4 (III)Lmew;
      // 1a7: invokevirtual fhq.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 1aa: pop
      // 1ab: iinc 7 1
      // 1ae: iload 4
      // 1b0: ifeq 21a
      // 1b3: goto 1ba
      // 1b6: invokestatic l76.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: iload 4
      // 1bc: ifne 16d
      // 1bf: goto 1c6
      // 1c2: invokestatic l76.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: getfield l76.lu6 Ljava/util/Random;
      // 1ca: invokevirtual java/util/Random.nextBoolean ()Z
      // 1cd: iload 4
      // 1cf: ifeq 221
      // 1d2: ifeq 21a
      // 1d5: goto 1dc
      // 1d8: invokestatic l76.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: getfield l76.x27 Lmkf;
      // 1e0: aload 0
      // 1e1: getfield l76.w7h Lt9d;
      // 1e4: aload 0
      // 1e5: getfield l76.lu6 Ljava/util/Random;
      // 1e8: aload 5
      // 1ea: aload 0
      // 1eb: getfield l76.lu6 Ljava/util/Random;
      // 1ee: bipush 16
      // 1f0: invokevirtual java/util/Random.nextInt (I)I
      // 1f3: bipush 8
      // 1f5: iadd
      // 1f6: aload 0
      // 1f7: getfield l76.lu6 Ljava/util/Random;
      // 1fa: sipush 128
      // 1fd: invokevirtual java/util/Random.nextInt (I)I
      // 200: aload 0
      // 201: getfield l76.lu6 Ljava/util/Random;
      // 204: bipush 16
      // 206: invokevirtual java/util/Random.nextInt (I)I
      // 209: bipush 8
      // 20b: iadd
      // 20c: invokevirtual mew.ec4 (III)Lmew;
      // 20f: invokevirtual mkf.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 212: pop
      // 213: goto 21a
      // 216: invokestatic l76.a (Loov;)Loov;
      // 219: athrow
      // 21a: aload 0
      // 21b: getfield l76.lu6 Ljava/util/Random;
      // 21e: invokevirtual java/util/Random.nextBoolean ()Z
      // 221: iload 4
      // 223: ifeq 26f
      // 226: ifeq 26e
      // 229: goto 230
      // 22c: invokestatic l76.a (Loov;)Loov;
      // 22f: athrow
      // 230: aload 0
      // 231: getfield l76.yzq Lmkf;
      // 234: aload 0
      // 235: getfield l76.w7h Lt9d;
      // 238: aload 0
      // 239: getfield l76.lu6 Ljava/util/Random;
      // 23c: aload 5
      // 23e: aload 0
      // 23f: getfield l76.lu6 Ljava/util/Random;
      // 242: bipush 16
      // 244: invokevirtual java/util/Random.nextInt (I)I
      // 247: bipush 8
      // 249: iadd
      // 24a: aload 0
      // 24b: getfield l76.lu6 Ljava/util/Random;
      // 24e: sipush 128
      // 251: invokevirtual java/util/Random.nextInt (I)I
      // 254: aload 0
      // 255: getfield l76.lu6 Ljava/util/Random;
      // 258: bipush 16
      // 25a: invokevirtual java/util/Random.nextInt (I)I
      // 25d: bipush 8
      // 25f: iadd
      // 260: invokevirtual mew.ec4 (III)Lmew;
      // 263: invokevirtual mkf.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 266: pop
      // 267: goto 26e
      // 26a: invokestatic l76.a (Loov;)Loov;
      // 26d: athrow
      // 26e: bipush 0
      // 26f: istore 7
      // 271: iload 7
      // 273: bipush 16
      // 275: if_icmpge 2bf
      // 278: aload 0
      // 279: getfield l76.he9 Lcdu;
      // 27c: aload 0
      // 27d: getfield l76.w7h Lt9d;
      // 280: aload 0
      // 281: getfield l76.lu6 Ljava/util/Random;
      // 284: aload 5
      // 286: aload 0
      // 287: getfield l76.lu6 Ljava/util/Random;
      // 28a: bipush 16
      // 28c: invokevirtual java/util/Random.nextInt (I)I
      // 28f: aload 0
      // 290: getfield l76.lu6 Ljava/util/Random;
      // 293: bipush 108
      // 295: invokevirtual java/util/Random.nextInt (I)I
      // 298: bipush 10
      // 29a: iadd
      // 29b: aload 0
      // 29c: getfield l76.lu6 Ljava/util/Random;
      // 29f: bipush 16
      // 2a1: invokevirtual java/util/Random.nextInt (I)I
      // 2a4: invokevirtual mew.ec4 (III)Lmew;
      // 2a7: invokevirtual cdu.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 2aa: pop
      // 2ab: iinc 7 1
      // 2ae: iload 4
      // 2b0: ifeq 2c2
      // 2b3: iload 4
      // 2b5: ifne 271
      // 2b8: goto 2bf
      // 2bb: invokestatic l76.a (Loov;)Loov;
      // 2be: athrow
      // 2bf: bipush 0
      // 2c0: istore 7
      // 2c2: iload 7
      // 2c4: bipush 16
      // 2c6: if_icmpge 317
      // 2c9: aload 0
      // 2ca: getfield l76._lw Lva9;
      // 2cd: aload 0
      // 2ce: getfield l76.w7h Lt9d;
      // 2d1: aload 0
      // 2d2: getfield l76.lu6 Ljava/util/Random;
      // 2d5: aload 5
      // 2d7: aload 0
      // 2d8: getfield l76.lu6 Ljava/util/Random;
      // 2db: bipush 16
      // 2dd: invokevirtual java/util/Random.nextInt (I)I
      // 2e0: aload 0
      // 2e1: getfield l76.lu6 Ljava/util/Random;
      // 2e4: bipush 108
      // 2e6: invokevirtual java/util/Random.nextInt (I)I
      // 2e9: bipush 10
      // 2eb: iadd
      // 2ec: aload 0
      // 2ed: getfield l76.lu6 Ljava/util/Random;
      // 2f0: bipush 16
      // 2f2: invokevirtual java/util/Random.nextInt (I)I
      // 2f5: invokevirtual mew.ec4 (III)Lmew;
      // 2f8: invokevirtual va9.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 2fb: pop
      // 2fc: iinc 7 1
      // 2ff: iload 4
      // 301: ifeq 31b
      // 304: goto 30b
      // 307: invokestatic l76.a (Loov;)Loov;
      // 30a: athrow
      // 30b: iload 4
      // 30d: ifne 2c2
      // 310: goto 317
      // 313: invokestatic l76.a (Loov;)Loov;
      // 316: athrow
      // 317: bipush 0
      // 318: putstatic d26.trk Z
      // 31b: return
   }

   @Override
   public boolean zzc(g6k var1, tts var2, int var3, int var4) {
      return false;
   }

   @Override
   public boolean va4(boolean var1, sw6 var2) {
      return true;
   }

   @Override
   public void hua() {
   }

   @Override
   public boolean p68() {
      return false;
   }

   @Override
   public boolean pj4() {
      return true;
   }

   @Override
   public String y2l() {
      long var1 = a ^ 127057504107201L;
      return b;
   }

   @Override
   public List sbk(ek6 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: getstatic ek6.ywn Lek6;
      // 08: if_acmpne 82
      // 0b: aload 0
      // 0c: getfield l76.vbl Lnet/minecraft/world/gen/structure/MapGenNetherBridge;
      // 0f: aload 2
      // 10: invokevirtual net/minecraft/world/gen/structure/MapGenNetherBridge.vy1 (Lmew;)Z
      // 13: iload 3
      // 14: ifne 4b
      // 17: goto 1e
      // 1a: invokestatic l76.a (Loov;)Loov;
      // 1d: athrow
      // 1e: ifeq 34
      // 21: goto 28
      // 24: invokestatic l76.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield l76.vbl Lnet/minecraft/world/gen/structure/MapGenNetherBridge;
      // 2c: invokevirtual net/minecraft/world/gen/structure/MapGenNetherBridge.u7j ()Ljava/util/List;
      // 2f: areturn
      // 30: invokestatic l76.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: iload 3
      // 36: ifne 83
      // 39: getfield l76.vbl Lnet/minecraft/world/gen/structure/MapGenNetherBridge;
      // 3c: aload 0
      // 3d: getfield l76.w7h Lt9d;
      // 40: aload 2
      // 41: invokevirtual net/minecraft/world/gen/structure/MapGenNetherBridge.g3m (Lt9d;Lmew;)Z
      // 44: goto 4b
      // 47: invokestatic l76.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ifeq 82
      // 4e: aload 0
      // 4f: getfield l76.w7h Lt9d;
      // 52: aload 2
      // 53: invokevirtual mew.eve ()Lmew;
      // 56: iload 3
      // 57: ifne 87
      // 5a: goto 61
      // 5d: invokestatic l76.a (Loov;)Loov;
      // 60: athrow
      // 61: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 64: invokeinterface zfz.r_y ()Le0x; 1
      // 69: getstatic ox_.cbk Le0x;
      // 6c: if_acmpne 82
      // 6f: goto 76
      // 72: invokestatic l76.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: getfield l76.vbl Lnet/minecraft/world/gen/structure/MapGenNetherBridge;
      // 7a: invokevirtual net/minecraft/world/gen/structure/MapGenNetherBridge.u7j ()Ljava/util/List;
      // 7d: areturn
      // 7e: invokestatic l76.a (Loov;)Loov;
      // 81: athrow
      // 82: aload 0
      // 83: getfield l76.w7h Lt9d;
      // 86: aload 2
      // 87: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 8a: astore 4
      // 8c: aload 4
      // 8e: aload 1
      // 8f: invokevirtual gyu.gzj (Lek6;)Ljava/util/List;
      // 92: areturn
   }

   @Override
   public mew epl(t9d var1, String var2, mew var3) {
      return null;
   }

   @Override
   public int gkt() {
      return 0;
   }

   @Override
   public void nw5(tts var1, int var2, int var3) {
      this.vbl.vyh(this, this.w7h, var2, var3, (lno)null);
   }

   @Override
   public tts iqa(mew var1) {
      return this.et2(var1.getX() >> 4, var1.getZ() >> 4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4989178877164057903L, 4607421914991646590L, MethodHandles.lookup().lookupClass()).a(90456181123096L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92762567842511L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("£,W\u00adM\u0001~»Ê¨öÛ{ªéÔ'AÖø¼B\u0005â".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static oov a(oov var0) {
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
