import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l8w implements g6k {
   private Random sen;
   private b_x bry;
   private b_x qsf;
   private b_x p5n;
   public b_x i0y;
   public b_x v7x;
   private t9d ji4;
   private double[] xbt;
   private gyu[] dcj;
   public double[] c6y;
   public double[] ymf;
   public double[] tfl;
   public double[] _ge;
   public double[] rvj;
   private static final long a;
   private static final String b;

   public l8w(t9d var1, long var2) {
      this.ji4 = var1;
      this.sen = new Random(var2);
      this.bry = new b_x(this.sen, 16);
      this.qsf = new b_x(this.sen, 16);
      this.p5n = new b_x(this.sen, 8);
      this.i0y = new b_x(this.sen, 10);
      this.v7x = new b_x(this.sen, 16);
   }

   public void e1v(int var1, int var2, lno var3) {
      byte var5 = 2;
      int var6 = var5 + 1;
      int var10000 = t9d.c();
      byte var7 = 33;
      int var8 = var5 + 1;
      int var4 = var10000;
      this.xbt = this.la0(this.xbt, var1 * var5, 0, var2 * var5, var6, var7, var8);
      int var9 = 0;

      label101:
      while (true) {
         var10000 = var9;

         label99:
         while (var10000 < var5) {
            int var10 = 0;

            label96:
            while (true) {
               var10000 = var10;

               label94:
               while (true) {
                  if (var10000 >= var5) {
                     break label96;
                  }

                  var10000 = 0;
                  if (var4 != 0) {
                     continue label99;
                  }

                  int var11 = 0;

                  label91:
                  while (true) {
                     var10000 = var11;

                     label89:
                     while (true) {
                        if (var10000 >= 32) {
                           break label91;
                        }

                        double var12 = 0.25;
                        double var14 = this.xbt[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
                        double var16 = this.xbt[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
                        double var18 = this.xbt[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
                        double var20 = this.xbt[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
                        double var22 = (this.xbt[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
                        double var24 = (this.xbt[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
                        double var26 = (this.xbt[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
                        double var28 = (this.xbt[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;
                        var10000 = 0;
                        if (var4 != 0) {
                           continue label94;
                        }

                        int var30 = 0;

                        label86:
                        while (true) {
                           var10000 = var30;

                           label84:
                           while (true) {
                              if (var10000 >= 4) {
                                 break label86;
                              }

                              double var31 = 0.125;
                              double var33 = var14;
                              double var35 = var16;
                              double var37 = (var18 - var14) * var31;
                              double var39 = (var20 - var16) * var31;
                              var10000 = 0;
                              if (var4 != 0) {
                                 continue label89;
                              }

                              int var41 = 0;

                              label81:
                              while (true) {
                                 var10000 = var41;

                                 label79:
                                 while (true) {
                                    if (var10000 >= 8) {
                                       break label81;
                                    }

                                    double var42 = 0.125;
                                    double var44 = var33;
                                    double var46 = (var35 - var33) * var42;
                                    var10000 = 0;
                                    if (var4 != 0) {
                                       continue label84;
                                    }

                                    int var48 = 0;

                                    while (var48 < 8) {
                                       zfz var49 = null;
                                       double var58;
                                       var10000 = (var58 = var44 - 0.0) == 0.0 ? 0 : (var58 < 0.0 ? -1 : 1);
                                       if (var4 != 0) {
                                          continue label79;
                                       }

                                       if (var10000 > 0) {
                                          var49 = ox_.p5a.l4i();
                                       }

                                       int var50 = var41 + var9 * 8;
                                       int var51 = var30 + var11 * 4;
                                       int var52 = var48 + var10 * 8;
                                       var3.x6f(var50, var51, var52, var49);
                                       var44 += var46;
                                       var48++;
                                       if (var4 != 0) {
                                          break;
                                       }
                                    }

                                    var33 += var37;
                                    var35 += var39;
                                    var41++;
                                    if (var4 != 0) {
                                       break label81;
                                    }
                                    break;
                                 }
                              }

                              var14 += var22;
                              var16 += var24;
                              var18 += var26;
                              var20 += var28;
                              var30++;
                              if (var4 != 0) {
                                 break label86;
                              }
                              break;
                           }
                        }

                        var11++;
                        if (var4 != 0) {
                           break label91;
                        }
                        break;
                     }
                  }

                  var10++;
                  if (var4 != 0) {
                     break label96;
                  }
                  break;
               }
            }

            var9++;
            if (var4 != 0) {
               return;
            }
            continue label101;
         }

         return;
      }
   }

   public void t28(lno param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: bipush 0
      // 005: istore 3
      // 006: iload 3
      // 007: bipush 16
      // 009: if_icmpge 133
      // 00c: bipush 0
      // 00d: istore 4
      // 00f: iload 4
      // 011: bipush 16
      // 013: if_icmpge 12c
      // 016: bipush 1
      // 017: istore 5
      // 019: bipush -1
      // 01a: istore 6
      // 01c: getstatic ox_.p5a Le0x;
      // 01f: invokevirtual e0x.l4i ()Lzfz;
      // 022: astore 7
      // 024: getstatic ox_.p5a Le0x;
      // 027: invokevirtual e0x.l4i ()Lzfz;
      // 02a: astore 8
      // 02c: bipush 127
      // 02e: iload 2
      // 02f: ifne 007
      // 032: istore 9
      // 034: iload 9
      // 036: iflt 125
      // 039: aload 1
      // 03a: iload 3
      // 03b: iload 9
      // 03d: iload 4
      // 03f: invokevirtual lno.ql9 (III)Lzfz;
      // 042: astore 10
      // 044: aload 10
      // 046: invokeinterface zfz.r_y ()Le0x; 1
      // 04b: iload 2
      // 04c: ifne 027
      // 04f: iload 2
      // 050: ifne 078
      // 053: invokevirtual e0x.p1r ()Lp3y;
      // 056: getstatic p3y.cei Lp3y;
      // 059: if_acmpne 06a
      // 05c: goto 063
      // 05f: invokestatic l8w.a (Loov;)Loov;
      // 062: athrow
      // 063: bipush -1
      // 064: istore 6
      // 066: iload 2
      // 067: ifeq 11e
      // 06a: aload 10
      // 06c: invokeinterface zfz.r_y ()Le0x; 1
      // 071: goto 078
      // 074: invokestatic l8w.a (Loov;)Loov;
      // 077: athrow
      // 078: getstatic ox_.pu8 Le0x;
      // 07b: if_acmpne 11e
      // 07e: iload 6
      // 080: iload 2
      // 081: ifne 106
      // 084: goto 08b
      // 087: invokestatic l8w.a (Loov;)Loov;
      // 08a: athrow
      // 08b: bipush -1
      // 08c: if_icmpne 0fd
      // 08f: goto 096
      // 092: invokestatic l8w.a (Loov;)Loov;
      // 095: athrow
      // 096: iload 5
      // 098: iload 2
      // 099: ifne 0ce
      // 09c: goto 0a3
      // 09f: invokestatic l8w.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: ifgt 0bd
      // 0a6: goto 0ad
      // 0a9: invokestatic l8w.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: getstatic ox_.ibw Le0x;
      // 0b0: invokevirtual e0x.l4i ()Lzfz;
      // 0b3: astore 7
      // 0b5: getstatic ox_.p5a Le0x;
      // 0b8: invokevirtual e0x.l4i ()Lzfz;
      // 0bb: astore 8
      // 0bd: iload 5
      // 0bf: istore 6
      // 0c1: iload 2
      // 0c2: ifne 0f9
      // 0c5: iload 9
      // 0c7: goto 0ce
      // 0ca: invokestatic l8w.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: iflt 0e7
      // 0d1: aload 1
      // 0d2: iload 3
      // 0d3: iload 9
      // 0d5: iload 4
      // 0d7: aload 7
      // 0d9: invokevirtual lno.x6f (IIILzfz;)V
      // 0dc: iload 2
      // 0dd: ifeq 11e
      // 0e0: goto 0e7
      // 0e3: invokestatic l8w.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 1
      // 0e8: iload 3
      // 0e9: iload 9
      // 0eb: iload 4
      // 0ed: aload 8
      // 0ef: invokevirtual lno.x6f (IIILzfz;)V
      // 0f2: goto 0f9
      // 0f5: invokestatic l8w.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: iload 2
      // 0fa: ifeq 11e
      // 0fd: iload 6
      // 0ff: goto 106
      // 102: invokestatic l8w.a (Loov;)Loov;
      // 105: athrow
      // 106: ifle 11e
      // 109: iinc 6 -1
      // 10c: aload 1
      // 10d: iload 3
      // 10e: iload 9
      // 110: iload 4
      // 112: aload 8
      // 114: invokevirtual lno.x6f (IIILzfz;)V
      // 117: goto 11e
      // 11a: invokestatic l8w.a (Loov;)Loov;
      // 11d: athrow
      // 11e: iinc 9 -1
      // 121: iload 2
      // 122: ifeq 034
      // 125: iinc 4 1
      // 128: iload 2
      // 129: ifeq 00f
      // 12c: iinc 3 1
      // 12f: iload 2
      // 130: ifeq 006
      // 133: return
   }

   @Override
   public tts et2(int var1, int var2) {
      this.sen.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      int var10000 = t9d.c();
      lno var4 = new lno();
      int var3 = var10000;
      this.dcj = this.ji4.ql0().twf(this.dcj, var1 * 16, var2 * 16, 16, 16);
      this.e1v(var1, var2, var4);
      this.t28(var4);
      tts var5 = new tts(this.ji4, var4, var1, var2);
      byte[] var6 = var5.xtk();
      int var7 = 0;

      while (true) {
         if (var7 < var6.length) {
            try {
               var6[var7] = (byte)this.dcj[var7].mu9;
               var7++;
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         var5.vm4();
         break;
      }

      return var5;
   }

   private double[] la0(double[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
      // 011: invokestatic l8w.a (Loov;)Loov;
      // 014: athrow
      // 015: iload 5
      // 017: iload 6
      // 019: imul
      // 01a: iload 7
      // 01c: imul
      // 01d: newarray 7
      // 01f: goto 026
      // 022: invokestatic l8w.a (Loov;)Loov;
      // 025: athrow
      // 026: astore 1
      // 027: ldc2_w 684.412
      // 02a: dstore 9
      // 02c: ldc2_w 684.412
      // 02f: dstore 11
      // 031: aload 0
      // 032: aload 0
      // 033: getfield l8w.i0y Lb_x;
      // 036: aload 0
      // 037: getfield l8w._ge [D
      // 03a: iload 2
      // 03b: iload 4
      // 03d: iload 5
      // 03f: iload 7
      // 041: ldc2_w 1.121
      // 044: ldc2_w 1.121
      // 047: ldc2_w 0.5
      // 04a: invokevirtual b_x.svg ([DIIIIDDD)[D
      // 04d: putfield l8w._ge [D
      // 050: aload 0
      // 051: aload 0
      // 052: getfield l8w.v7x Lb_x;
      // 055: aload 0
      // 056: getfield l8w.rvj [D
      // 059: iload 2
      // 05a: iload 4
      // 05c: iload 5
      // 05e: iload 7
      // 060: ldc2_w 200.0
      // 063: ldc2_w 200.0
      // 066: ldc2_w 0.5
      // 069: invokevirtual b_x.svg ([DIIIIDDD)[D
      // 06c: putfield l8w.rvj [D
      // 06f: dload 9
      // 071: ldc2_w 2.0
      // 074: dmul
      // 075: dstore 9
      // 077: aload 0
      // 078: aload 0
      // 079: getfield l8w.p5n Lb_x;
      // 07c: aload 0
      // 07d: getfield l8w.c6y [D
      // 080: iload 2
      // 081: iload 3
      // 082: iload 4
      // 084: iload 5
      // 086: iload 6
      // 088: iload 7
      // 08a: dload 9
      // 08c: ldc2_w 80.0
      // 08f: ddiv
      // 090: dload 11
      // 092: ldc2_w 160.0
      // 095: ddiv
      // 096: dload 9
      // 098: ldc2_w 80.0
      // 09b: ddiv
      // 09c: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 09f: putfield l8w.c6y [D
      // 0a2: aload 0
      // 0a3: aload 0
      // 0a4: getfield l8w.bry Lb_x;
      // 0a7: aload 0
      // 0a8: getfield l8w.ymf [D
      // 0ab: iload 2
      // 0ac: iload 3
      // 0ad: iload 4
      // 0af: iload 5
      // 0b1: iload 6
      // 0b3: iload 7
      // 0b5: dload 9
      // 0b7: dload 11
      // 0b9: dload 9
      // 0bb: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 0be: putfield l8w.ymf [D
      // 0c1: aload 0
      // 0c2: aload 0
      // 0c3: getfield l8w.qsf Lb_x;
      // 0c6: aload 0
      // 0c7: getfield l8w.tfl [D
      // 0ca: iload 2
      // 0cb: iload 3
      // 0cc: iload 4
      // 0ce: iload 5
      // 0d0: iload 6
      // 0d2: iload 7
      // 0d4: dload 9
      // 0d6: dload 11
      // 0d8: dload 9
      // 0da: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 0dd: putfield l8w.tfl [D
      // 0e0: bipush 0
      // 0e1: istore 13
      // 0e3: bipush 0
      // 0e4: istore 14
      // 0e6: iload 14
      // 0e8: iload 5
      // 0ea: if_icmpge 29a
      // 0ed: bipush 0
      // 0ee: istore 15
      // 0f0: iload 15
      // 0f2: iload 7
      // 0f4: if_icmpge 292
      // 0f7: iload 14
      // 0f9: iload 2
      // 0fa: iadd
      // 0fb: i2f
      // 0fc: fconst_1
      // 0fd: fdiv
      // 0fe: fstore 16
      // 100: iload 15
      // 102: iload 4
      // 104: iadd
      // 105: i2f
      // 106: fconst_1
      // 107: fdiv
      // 108: fstore 17
      // 10a: ldc 100.0
      // 10c: nop
      // 10d: fload 16
      // 10f: fload 16
      // 111: fmul
      // 112: fload 17
      // 114: fload 17
      // 116: fmul
      // 117: fadd
      // 118: invokestatic fe6.bug (F)F
      // 11b: ldc 8.0
      // 11d: nop
      // 11e: fmul
      // 11f: fsub
      // 120: fstore 18
      // 122: fload 18
      // 124: ldc 80.0
      // 126: nop
      // 127: fcmpl
      // 128: iload 8
      // 12a: ifeq 0e8
      // 12d: iload 8
      // 12f: ifeq 147
      // 132: ifle 141
      // 135: goto 13c
      // 138: invokestatic l8w.a (Loov;)Loov;
      // 13b: athrow
      // 13c: ldc 80.0
      // 13e: nop
      // 13f: fstore 18
      // 141: fload 18
      // 143: ldc -100.0
      // 145: nop
      // 146: fcmpg
      // 147: iload 8
      // 149: ifeq 15c
      // 14c: ifge 15b
      // 14f: goto 156
      // 152: invokestatic l8w.a (Loov;)Loov;
      // 155: athrow
      // 156: ldc -100.0
      // 158: nop
      // 159: fstore 18
      // 15b: bipush 0
      // 15c: istore 19
      // 15e: iload 19
      // 160: iload 6
      // 162: if_icmpge 28a
      // 165: dconst_0
      // 166: dstore 20
      // 168: aload 0
      // 169: getfield l8w.ymf [D
      // 16c: iload 13
      // 16e: daload
      // 16f: ldc2_w 512.0
      // 172: ddiv
      // 173: dstore 22
      // 175: aload 0
      // 176: getfield l8w.tfl [D
      // 179: iload 13
      // 17b: daload
      // 17c: ldc2_w 512.0
      // 17f: ddiv
      // 180: dstore 24
      // 182: aload 0
      // 183: getfield l8w.c6y [D
      // 186: iload 13
      // 188: daload
      // 189: ldc2_w 10.0
      // 18c: ddiv
      // 18d: dconst_1
      // 18e: dadd
      // 18f: ldc2_w 2.0
      // 192: ddiv
      // 193: dstore 26
      // 195: dload 26
      // 197: dconst_0
      // 198: dcmpg
      // 199: iload 8
      // 19b: ifeq 0f2
      // 19e: iload 8
      // 1a0: ifeq 1cd
      // 1a3: ifge 1b6
      // 1a6: goto 1ad
      // 1a9: invokestatic l8w.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: dload 22
      // 1af: dstore 20
      // 1b1: iload 8
      // 1b3: ifne 1ed
      // 1b6: dload 26
      // 1b8: dconst_1
      // 1b9: iload 8
      // 1bb: ifeq 1ea
      // 1be: goto 1c5
      // 1c1: invokestatic l8w.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: dcmpl
      // 1c6: goto 1cd
      // 1c9: invokestatic l8w.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: ifle 1d9
      // 1d0: dload 24
      // 1d2: dstore 20
      // 1d4: iload 8
      // 1d6: ifne 1ed
      // 1d9: dload 22
      // 1db: dload 24
      // 1dd: dload 22
      // 1df: dsub
      // 1e0: dload 26
      // 1e2: dmul
      // 1e3: goto 1ea
      // 1e6: invokestatic l8w.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: dadd
      // 1eb: dstore 20
      // 1ed: dload 20
      // 1ef: ldc2_w 8.0
      // 1f2: dsub
      // 1f3: dstore 20
      // 1f5: dload 20
      // 1f7: fload 18
      // 1f9: f2d
      // 1fa: dadd
      // 1fb: dstore 20
      // 1fd: bipush 2
      // 1fe: istore 28
      // 200: iload 19
      // 202: iload 6
      // 204: bipush 2
      // 205: idiv
      // 206: iload 28
      // 208: isub
      // 209: iload 8
      // 20b: ifeq 257
      // 20e: if_icmple 243
      // 211: goto 218
      // 214: invokestatic l8w.a (Loov;)Loov;
      // 217: athrow
      // 218: iload 19
      // 21a: iload 6
      // 21c: bipush 2
      // 21d: idiv
      // 21e: iload 28
      // 220: isub
      // 221: isub
      // 222: i2f
      // 223: ldc 64.0
      // 225: nop
      // 226: fdiv
      // 227: f2d
      // 228: dstore 29
      // 22a: dload 29
      // 22c: dconst_0
      // 22d: dconst_1
      // 22e: invokestatic fe6.lft (DDD)D
      // 231: dstore 29
      // 233: dload 20
      // 235: dconst_1
      // 236: dload 29
      // 238: dsub
      // 239: dmul
      // 23a: ldc2_w -3000.0
      // 23d: dload 29
      // 23f: dmul
      // 240: dadd
      // 241: dstore 20
      // 243: bipush 8
      // 245: istore 28
      // 247: iload 8
      // 249: ifeq 285
      // 24c: iload 19
      // 24e: iload 28
      // 250: goto 257
      // 253: invokestatic l8w.a (Loov;)Loov;
      // 256: athrow
      // 257: if_icmpge 279
      // 25a: iload 28
      // 25c: iload 19
      // 25e: isub
      // 25f: i2f
      // 260: iload 28
      // 262: i2f
      // 263: fconst_1
      // 264: fsub
      // 265: fdiv
      // 266: f2d
      // 267: dstore 29
      // 269: dload 20
      // 26b: dconst_1
      // 26c: dload 29
      // 26e: dsub
      // 26f: dmul
      // 270: ldc2_w -30.0
      // 273: dload 29
      // 275: dmul
      // 276: dadd
      // 277: dstore 20
      // 279: aload 1
      // 27a: iload 13
      // 27c: dload 20
      // 27e: dastore
      // 27f: iinc 13 1
      // 282: iinc 19 1
      // 285: iload 8
      // 287: ifne 15e
      // 28a: iinc 15 1
      // 28d: iload 8
      // 28f: ifne 0f0
      // 292: iinc 14 1
      // 295: iload 8
      // 297: ifne 0e6
      // 29a: aload 1
      // 29b: areturn
   }

   @Override
   public boolean pnt(int var1, int var2) {
      return true;
   }

   @Override
   public void fbq(g6k var1, int var2, int var3) {
      d26.trk = true;
      mew var4 = new mew(var2 * 16, 0, var3 * 16);
      this.ji4.getBiomeGenForCoords(var4.ec4(16, 0, 16)).u0r(this.ji4, this.ji4.fsy, var4);
      d26.trk = false;
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
      long var1 = a ^ 96090706508298L;
      return b;
   }

   @Override
   public List sbk(ek6 var1, mew var2) {
      return this.ji4.getBiomeGenForCoords(var2).gzj(var1);
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
   }

   @Override
   public tts iqa(mew var1) {
      return this.et2(var1.getX() >> 4, var1.getZ() >> 4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6095367034540477300L, 8301791733151426502L, MethodHandles.lookup().lookupClass()).a(53559619386355L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 137935157932356L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0007ú·À`±\u0001-\u0085j?<R¼\u0089¦Z6Ù\u0007/e©2".getBytes("ISO-8859-1"));
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
