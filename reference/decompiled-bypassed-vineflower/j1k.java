import java.util.Random;

public class j1k {
   public static final double o7j = Math.sqrt(3.0);
   public double jcr;
   public double z2n;
   public double tj5;

   public j1k() {
      this(new Random());
   }

   public j1k(Random var1) {
      this.jcr = var1.nextDouble() * 256.0;
      this.z2n = var1.nextDouble() * 256.0;
      this.tj5 = var1.nextDouble() * 256.0;
      int var2 = 0;

      try {
         while (var2 < 256) {
            this.u6d[var2] = var2++;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      for (int var6 = 0; var6 < 256; var6++) {
         int var3 = var1.nextInt(256 - var6) + var6;
         int var4 = this.u6d[var6];
         this.u6d[var6] = this.u6d[var3];
         this.u6d[var3] = var4;
         this.u6d[var6 + 256] = this.u6d[var6];
      }
   }

   private static int n5n(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: dload 0
      // 05: dconst_0
      // 06: dcmpl
      // 07: iload 2
      // 08: ifeq 20
      // 0b: ifle 1e
      // 0e: goto 15
      // 11: invokestatic j1k.a (Loov;)Loov;
      // 14: athrow
      // 15: dload 0
      // 16: d2i
      // 17: goto 22
      // 1a: invokestatic j1k.a (Loov;)Loov;
      // 1d: athrow
      // 1e: dload 0
      // 1f: d2i
      // 20: bipush 1
      // 21: isub
      // 22: ireturn
   }

   private static double ka9(int[] var0, double var1, double var3) {
      return (double)var0[0] * var1 + (double)var0[1] * var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public double aea(double var1, double var3) {
      double var6 = 0.5 * (o7j - 1.0);
      double var8 = (var1 + var3) * var6;
      int var10 = n5n(var1 + var8);
      int var11 = n5n(var3 + var8);
      double var12 = (3.0 - o7j) / 6.0;
      int var10000 = t9d.c();
      double var14 = (double)(var10 + var11) * var12;
      int var5 = var10000;
      double var16 = (double)var10 - var14;
      double var18 = (double)var11 - var14;
      double var20 = var1 - var16;
      double var22 = var3 - var18;

      int var24;
      byte var25;
      label103: {
         label112: {
            label107: {
               try {
                  double var69;
                  var10000 = (var69 = var20 - var22) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
                  if (var5 != 0) {
                     break label112;
                  }

                  if (var10000 <= 0) {
                     break label107;
                  }
               } catch (oov var56) {
                  throw a(var56);
               }

               var24 = 1;
               var25 = 0;

               try {
                  if (var5 == 0) {
                     break label103;
                  }
               } catch (oov var55) {
                  boolean var10001 = false;
                  throw a(var55);
               }
            }

            try {
               var10000 = 0;
            } catch (oov var54) {
               boolean var65 = false;
               throw a(var54);
            }
         }

         var24 = var10000;
         var25 = 1;
      }

      double var26 = var20 - (double)var24 + var12;
      double var28 = var22 - (double)var25 + var12;
      double var30 = var20 - 1.0 + 2.0 * var12;
      double var32 = var22 - 1.0 + 2.0 * var12;
      int var34 = var10 & 0xFF;
      int var35 = var11 & 0xFF;
      int var36 = this.u6d[var34 + this.u6d[var35]] % 12;
      int var37 = this.u6d[var34 + var24 + this.u6d[var35 + var25]] % 12;
      int var38 = this.u6d[var34 + 1 + this.u6d[var35 + 1]] % 12;
      double var39 = 0.5 - var20 * var20 - var22 * var22;

      double var41;
      label84: {
         double var66;
         label83: {
            label82: {
               try {
                  var62 = var39;
                  var66 = 0.0;
                  if (var5 != 0) {
                     break label83;
                  }

                  if (!(var39 < 0.0)) {
                     break label82;
                  }
               } catch (oov var53) {
                  throw a(var53);
               }

               var41 = 0.0;
               if (var5 == 0) {
                  break label84;
               }
            }

            var39 *= var39;
            var62 = var39 * var39;
            var66 = ka9(xz_[var36], var20, var22);
         }

         var41 = var62 * var66;
      }

      double var43 = 0.5 - var26 * var26 - var28 * var28;

      double var45;
      label71: {
         double var67;
         label70: {
            label69: {
               try {
                  var63 = var43;
                  var67 = 0.0;
                  if (var5 != 0) {
                     break label70;
                  }

                  if (!(var43 < 0.0)) {
                     break label69;
                  }
               } catch (oov var52) {
                  throw a(var52);
               }

               var45 = 0.0;
               if (var5 == 0) {
                  break label71;
               }
            }

            var43 *= var43;
            var63 = var43 * var43;
            var67 = ka9(xz_[var37], var26, var28);
         }

         var45 = var63 * var67;
      }

      double var47 = 0.5 - var30 * var30 - var32 * var32;

      double var68;
      label57: {
         label56: {
            try {
               var64 = var47;
               var68 = 0.0;
               if (var5 != 0) {
                  break label57;
               }

               if (!(var47 < 0.0)) {
                  break label56;
               }
            } catch (oov var51) {
               throw a(var51);
            }

            double var49 = 0.0;
            if (var5 == 0) {
               return 70.0 * (var41 + var45 + var49);
            }
         }

         var47 *= var47;
         var64 = var47 * var47;
         var68 = ka9(xz_[var38], var30, var32);
      }

      double var70 = var64 * var68;
      return 70.0 * (var41 + var45 + var70);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void quj(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12) {
      int var15 = 0;
      int var10000 = t9d.c();
      int var16 = 0;
      int var14 = var10000;

      label128:
      while (true) {
         var10000 = var16;

         label126:
         while (var10000 < var7) {
            double var17 = (var4 + (double)var16) * var10 + this.z2n;
            int var19 = 0;

            while (var19 < var6) {
               double var20 = (var2 + (double)var19) * var8 + this.jcr;
               double var22 = (var20 + var17) * bjs;
               int var24 = n5n(var20 + var22);
               int var25 = n5n(var17 + var22);
               double var26 = (double)(var24 + var25) * mv4;
               double var28 = (double)var24 - var26;
               double var30 = (double)var25 - var26;
               double var32 = var20 - var28;
               double var34 = var17 - var30;
               double var83;
               var10000 = (var83 = var32 - var34) == 0.0 ? 0 : (var83 < 0.0 ? -1 : 1);
               if (var14 != 0) {
                  continue label126;
               }

               int var36;
               byte var37;
               label120: {
                  label139: {
                     label134: {
                        try {
                           if (var14 != 0) {
                              break label139;
                           }

                           if (var10000 <= 0) {
                              break label134;
                           }
                        } catch (oov var69) {
                           throw a(var69);
                        }

                        var36 = 1;
                        var37 = 0;

                        try {
                           if (var14 == 0) {
                              break label120;
                           }
                        } catch (oov var68) {
                           boolean var10001 = false;
                           throw a(var68);
                        }
                     }

                     try {
                        var10000 = 0;
                     } catch (oov var67) {
                        boolean var79 = false;
                        throw a(var67);
                     }
                  }

                  var36 = var10000;
                  var37 = 1;
               }

               double var38 = var32 - (double)var36 + mv4;
               double var40 = var34 - (double)var37 + mv4;
               double var42 = var32 - 1.0 + 2.0 * mv4;
               double var44 = var34 - 1.0 + 2.0 * mv4;
               int var46 = var24 & 0xFF;
               int var47 = var25 & 0xFF;
               int var48 = this.u6d[var46 + this.u6d[var47]] % 12;
               int var49 = this.u6d[var46 + var36 + this.u6d[var47 + var37]] % 12;
               int var50 = this.u6d[var46 + 1 + this.u6d[var47 + 1]] % 12;
               double var51 = 0.5 - var32 * var32 - var34 * var34;

               double var53;
               label101: {
                  double var80;
                  label100: {
                     label99: {
                        try {
                           var75 = var51;
                           var80 = 0.0;
                           if (var14 != 0) {
                              break label100;
                           }

                           if (!(var51 < 0.0)) {
                              break label99;
                           }
                        } catch (oov var66) {
                           throw a(var66);
                        }

                        var53 = 0.0;
                        if (var14 == 0) {
                           break label101;
                        }
                     }

                     var51 *= var51;
                     var75 = var51 * var51;
                     var80 = ka9(xz_[var48], var32, var34);
                  }

                  var53 = var75 * var80;
               }

               double var55 = 0.5 - var38 * var38 - var40 * var40;

               double var57;
               label88: {
                  double var81;
                  label87: {
                     label86: {
                        try {
                           var76 = var55;
                           var81 = 0.0;
                           if (var14 != 0) {
                              break label87;
                           }

                           if (!(var55 < 0.0)) {
                              break label86;
                           }
                        } catch (oov var65) {
                           throw a(var65);
                        }

                        var57 = 0.0;
                        if (var14 == 0) {
                           break label88;
                        }
                     }

                     var55 *= var55;
                     var76 = var55 * var55;
                     var81 = ka9(xz_[var49], var38, var40);
                  }

                  var57 = var76 * var81;
               }

               double var59 = 0.5 - var42 * var42 - var44 * var44;

               double var61;
               label75: {
                  double var82;
                  label74: {
                     label73: {
                        try {
                           var77 = var59;
                           var82 = 0.0;
                           if (var14 != 0) {
                              break label74;
                           }

                           if (!(var59 < 0.0)) {
                              break label73;
                           }
                        } catch (oov var64) {
                           throw a(var64);
                        }

                        var61 = 0.0;
                        if (var14 == 0) {
                           break label75;
                        }
                     }

                     var59 *= var59;
                     var77 = var59 * var59;
                     var82 = ka9(xz_[var50], var42, var44);
                  }

                  var61 = var77 * var82;
               }

               int var63 = var15++;
               var1[var63] += 70.0 * (var53 + var57 + var61) * var12;
               var19++;
               if (var14 != 0) {
                  break;
               }
            }

            var16++;
            if (var14 != 0) {
               return;
            }
            continue label128;
         }

         return;
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
