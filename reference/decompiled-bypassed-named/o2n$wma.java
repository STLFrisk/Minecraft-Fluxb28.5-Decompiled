import java.util.Random;

public class o2n$wma {
   public double qs5;
   public double smh;

   public o2n$wma() {
   }

   public o2n$wma(double var1, double var3) {
      this.qs5 = var1;
      this.smh = var3;
   }

   public double kfm(o2n$wma var1) {
      double var2 = this.qs5 - var1.qs5;
      double var4 = this.smh - var1.smh;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public void r48() {
      double var1 = (double)this.bqi();
      this.qs5 /= var1;
      this.smh /= var1;
   }

   public float bqi() {
      return fe6.dii(this.qs5 * this.qs5 + this.smh * this.smh);
   }

   public void ec4(o2n$wma var1) {
      this.qs5 = this.qs5 - var1.qs5;
      this.smh = this.smh - var1.smh;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean e09(double var1, double var3, double var5, double var7) {
      int var9 = OpaquePredicate.c();
      byte var10 = 0;

      int var10000;
      label113: {
         label99: {
            label92: {
               label100: {
                  try {
                     double var24;
                     var10000 = (var24 = this.qs5 - var1) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
                     if (var9 != 0) {
                        break label92;
                     }

                     if (var10000 >= 0) {
                        break label100;
                     }
                  } catch (oov var18) {
                     throw a(var18);
                  }

                  this.qs5 = var1;
                  var10 = 1;

                  try {
                     if (var9 == 0) {
                        break label99;
                     }
                  } catch (oov var17) {
                     boolean var10001 = false;
                     throw a(var17);
                  }
               }

               try {
                  double var25;
                  var10000 = (var25 = this.qs5 - var5) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
               } catch (oov var16) {
                  boolean var21 = false;
                  throw a(var16);
               }
            }

            try {
               if (var9 != 0) {
                  break label113;
               }

               if (var10000 <= 0) {
                  break label99;
               }
            } catch (oov var15) {
               throw a(var15);
            }

            this.qs5 = var5;
            var10 = 1;
         }

         double var26;
         var10000 = (var26 = this.smh - var3) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
      }

      label67: {
         label102: {
            try {
               if (var9 != 0) {
                  break label67;
               }

               if (var10000 >= 0) {
                  break label102;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            this.smh = var3;
            var10 = 1;

            try {
               if (var9 == 0) {
                  return (boolean)var10;
               }
            } catch (oov var13) {
               boolean var22 = false;
               throw a(var13);
            }
         }

         try {
            double var27;
            var10000 = (var27 = this.smh - var7) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
         } catch (oov var12) {
            boolean var23 = false;
            throw a(var12);
         }
      }

      try {
         if (var9 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)var10;
         }
      } catch (oov var11) {
         throw a(var11);
      }

      this.smh = var7;
      return (boolean)1;
   }

   public int cmm(OpaquePredicate var1) {
      int var2 = OpaquePredicate.c();
      mew var3 = new mew(this.qs5, 256.0, this.smh);

      label19:
      while (var3.getY() > 0) {
         mew var10000 = var3.eve();

         do {
            var3 = var10000;
            if (var1.getBlockState(var3).r_y().p1r() == p3y.cei) {
               continue label19;
            }

            var10000 = var3;
         } while (var2 != 0);

         return var3.getY() + 1;
      }

      return 257;
   }

   public boolean v6k(OpaquePredicate param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: new mew
      // 07: dup
      // 08: aload 0
      // 09: getfield o2n$wma.qs5 D
      // 0c: ldc2_w 256.0
      // 0f: aload 0
      // 10: getfield o2n$wma.smh D
      // 13: invokespecial mew.<init> (DDD)V
      // 16: astore 3
      // 17: aload 3
      // 18: invokevirtual mew.getY ()I
      // 1b: ifle 7c
      // 1e: aload 3
      // 1f: invokevirtual mew.eve ()Lmew;
      // 22: astore 3
      // 23: aload 1
      // 24: aload 3
      // 25: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 28: invokeinterface zfz.r_y ()Le0x; 1
      // 2d: invokevirtual e0x.p1r ()Lp3y;
      // 30: astore 4
      // 32: aload 4
      // 34: iload 2
      // 35: ifeq 4e
      // 38: getstatic p3y.cei Lp3y;
      // 3b: if_acmpeq 78
      // 3e: goto 45
      // 41: invokestatic o2n$wma.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 4
      // 47: goto 4e
      // 4a: invokestatic o2n$wma.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifeq 68
      // 52: invokevirtual p3y.l7j ()Z
      // 55: ifne 76
      // 58: goto 5f
      // 5b: invokestatic o2n$wma.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 4
      // 61: goto 68
      // 64: invokestatic o2n$wma.a (Loov;)Loov;
      // 67: athrow
      // 68: getstatic p3y._tu Lp3y;
      // 6b: if_acmpeq 76
      // 6e: bipush 1
      // 6f: goto 77
      // 72: invokestatic o2n$wma.a (Loov;)Loov;
      // 75: athrow
      // 76: bipush 0
      // 77: ireturn
      // 78: iload 2
      // 79: ifne 17
      // 7c: bipush 0
      // 7d: ireturn
   }

   public void el3(Random var1, double var2, double var4, double var6, double var8) {
      this.qs5 = fe6.x16(var1, var2, var6);
      this.smh = fe6.x16(var1, var4, var8);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
