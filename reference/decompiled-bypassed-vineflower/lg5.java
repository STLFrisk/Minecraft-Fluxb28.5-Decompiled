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

public class lg5 implements Serializable, Cloneable {
   public static final long serialVersionUID = 3644296204459140589L;
   public double fs3;
   public double j4q;
   public double fki;
   public double ezi;
   public static final double c__ = 1.0E-12;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public lg5(double var1, double var3, double var5, double var7) {
      this.fs3 = var1;
      this.j4q = var3;
      this.fki = var5;
      this.ezi = var7;
   }

   public lg5(double[] var1) {
      this.fs3 = var1[0];
      this.j4q = var1[1];
      this.fki = var1[2];
      this.ezi = var1[3];
   }

   public lg5(lg5 var1) {
      this.fs3 = var1.fs3;
      this.j4q = var1.j4q;
      this.fki = var1.fki;
      this.ezi = var1.ezi;
   }

   public lg5(ll8 var1) {
      this.fs3 = (double)var1._5i;
      this.j4q = (double)var1.w5z;
      this.fki = (double)var1.yz_;
      this.ezi = (double)var1.b77;
   }

   public lg5(qhn var1, double var2) {
      this.fs3 = var1.v54;
      this.j4q = var1.g0w;
      this.fki = var1.mu9;
      this.ezi = var2;
   }

   public lg5() {
      this.fs3 = 0.0;
      this.j4q = 0.0;
      this.fki = 1.0;
      this.ezi = 0.0;
   }

   public final void nml(double var1, double var3, double var5, double var7) {
      this.fs3 = var1;
      this.j4q = var3;
      this.fki = var5;
      this.ezi = var7;
   }

   public final void c_u(double[] var1) {
      this.fs3 = var1[0];
      this.j4q = var1[1];
      this.fki = var1[2];
      this.ezi = var1[3];
   }

   public final void az2(lg5 var1) {
      this.fs3 = var1.fs3;
      this.j4q = var1.j4q;
      this.fki = var1.fki;
      this.ezi = var1.ezi;
   }

   public final void e0h(ll8 var1) {
      this.fs3 = (double)var1._5i;
      this.j4q = (double)var1.w5z;
      this.fki = (double)var1.yz_;
      this.ezi = (double)var1.b77;
   }

   public final void tb1(qhn var1, double var2) {
      this.fs3 = var1.v54;
      this.j4q = var1.g0w;
      this.fki = var1.mu9;
      this.ezi = var2;
   }

   public final void nbh(double[] var1) {
      var1[0] = this.fs3;
      var1[1] = this.j4q;
      var1[2] = this.fki;
      var1[3] = this.ezi;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void ee5(krg var1) {
      iww var3 = new iww();
      int var10000 = t9d.c();
      var1.wcg(var3);
      this.fs3 = (double)((float)(var3._o7 - var3.c84));
      int var2 = var10000;
      this.j4q = (double)((float)(var3.bhd - var3.y7q));
      this.fki = (double)((float)(var3.get - var3.y3c));
      double var4 = this.fs3 * this.fs3 + this.j4q * this.j4q + this.fki * this.fki;

      label46: {
         label41: {
            try {
               if (var2 != 0) {
                  break label46;
               }

               if (!(var4 > 1.0E-12)) {
                  break label41;
               }
            } catch (NullPointerException var14) {
               throw a(var14);
            }

            var4 = Math.sqrt(var4);
            double var6 = 0.5 * var4;
            double var8 = 0.5 * (var3.lxb + var3.pwn + var3.ffq - 1.0);
            this.ezi = (double)((float)Math.atan2(var6, var8));
            double var10 = 1.0 / var4;

            try {
               this.fs3 *= var10;
               this.j4q *= var10;
               this.fki *= var10;
               if (var2 == 0) {
                  return;
               }
            } catch (NullPointerException var13) {
               boolean var10001 = false;
               throw a(var13);
            }
         }

         try {
            this.fs3 = 0.0;
            this.j4q = 1.0;
            this.fki = 0.0;
         } catch (NullPointerException var12) {
            boolean var17 = false;
            throw a(var12);
         }
      }

      this.ezi = 0.0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void d5x(nf1 var1) {
      iww var3 = new iww();
      int var10000 = t9d.b();
      var1.ay1(var3);
      int var2 = var10000;
      this.fs3 = (double)((float)(var3._o7 - var3.c84));
      this.j4q = (double)((float)(var3.bhd - var3.y7q));
      this.fki = (double)((float)(var3.get - var3.y3c));
      double var4 = this.fs3 * this.fs3 + this.j4q * this.j4q + this.fki * this.fki;

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var4 > 1.0E-12)) {
                  break label41;
               }
            } catch (NullPointerException var14) {
               throw a(var14);
            }

            var4 = Math.sqrt(var4);
            double var6 = 0.5 * var4;
            double var8 = 0.5 * (var3.lxb + var3.pwn + var3.ffq - 1.0);
            this.ezi = (double)((float)Math.atan2(var6, var8));
            double var10 = 1.0 / var4;

            try {
               this.fs3 *= var10;
               this.j4q *= var10;
               this.fki *= var10;
               if (var2 != 0) {
                  return;
               }
            } catch (NullPointerException var13) {
               boolean var10001 = false;
               throw a(var13);
            }
         }

         try {
            this.fs3 = 0.0;
            this.j4q = 1.0;
            this.fki = 0.0;
         } catch (NullPointerException var12) {
            boolean var17 = false;
            throw a(var12);
         }
      }

      this.ezi = 0.0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void ox2(nvj var1) {
      this.fs3 = (double)(var1.wdt - var1.zk_);
      this.j4q = (double)(var1.xu6 - var1.aqg);
      int var10000 = t9d.b();
      this.fki = (double)(var1._id - var1.k12);
      int var2 = var10000;
      double var3 = this.fs3 * this.fs3 + this.j4q * this.j4q + this.fki * this.fki;

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-12)) {
                  break label41;
               }
            } catch (NullPointerException var13) {
               throw a(var13);
            }

            var3 = Math.sqrt(var3);
            double var5 = 0.5 * var3;
            double var7 = 0.5 * ((double)(var1.i2i + var1.aoj + var1.jr8) - 1.0);
            this.ezi = (double)((float)Math.atan2(var5, var7));
            double var9 = 1.0 / var3;

            try {
               this.fs3 *= var9;
               this.j4q *= var9;
               this.fki *= var9;
               if (var2 != 0) {
                  return;
               }
            } catch (NullPointerException var12) {
               boolean var10001 = false;
               throw a(var12);
            }
         }

         try {
            this.fs3 = 0.0;
            this.j4q = 1.0;
            this.fki = 0.0;
         } catch (NullPointerException var11) {
            boolean var16 = false;
            throw a(var11);
         }
      }

      this.ezi = 0.0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void yvk(iww var1) {
      this.fs3 = (double)((float)(var1._o7 - var1.c84));
      int var10000 = t9d.b();
      this.j4q = (double)((float)(var1.bhd - var1.y7q));
      int var2 = var10000;
      this.fki = (double)((float)(var1.get - var1.y3c));
      double var3 = this.fs3 * this.fs3 + this.j4q * this.j4q + this.fki * this.fki;

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-12)) {
                  break label41;
               }
            } catch (NullPointerException var13) {
               throw a(var13);
            }

            var3 = Math.sqrt(var3);
            double var5 = 0.5 * var3;
            double var7 = 0.5 * (var1.lxb + var1.pwn + var1.ffq - 1.0);
            this.ezi = (double)((float)Math.atan2(var5, var7));
            double var9 = 1.0 / var3;

            try {
               this.fs3 *= var9;
               this.j4q *= var9;
               this.fki *= var9;
               if (var2 != 0) {
                  return;
               }
            } catch (NullPointerException var12) {
               boolean var10001 = false;
               throw a(var12);
            }
         }

         try {
            this.fs3 = 0.0;
            this.j4q = 1.0;
            this.fki = 0.0;
         } catch (NullPointerException var11) {
            boolean var16 = false;
            throw a(var11);
         }
      }

      this.ezi = 0.0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void gva(lwt var1) {
      int var2 = t9d.c();
      double var3 = (double)(var1.hp2 * var1.hp2 + var1.nc_ * var1.nc_ + var1.ax5 * var1.ax5);

      label46: {
         label41: {
            try {
               if (var2 != 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-12)) {
                  break label41;
               }
            } catch (NullPointerException var9) {
               throw a(var9);
            }

            var3 = Math.sqrt(var3);
            double var5 = 1.0 / var3;

            try {
               this.fs3 = (double)var1.hp2 * var5;
               this.j4q = (double)var1.nc_ * var5;
               this.fki = (double)var1.ax5 * var5;
               this.ezi = 2.0 * Math.atan2(var3, (double)var1.ck3);
               if (var2 == 0) {
                  return;
               }
            } catch (NullPointerException var8) {
               boolean var10001 = false;
               throw a(var8);
            }
         }

         try {
            this.fs3 = 0.0;
            this.j4q = 1.0;
            this.fki = 0.0;
         } catch (NullPointerException var7) {
            boolean var11 = false;
            throw a(var7);
         }
      }

      this.ezi = 0.0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void _ud(nbf var1) {
      int var2 = t9d.b();
      double var3 = var1.yme * var1.yme + var1.pf8 * var1.pf8 + var1.jfe * var1.jfe;

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-12)) {
                  break label41;
               }
            } catch (NullPointerException var9) {
               throw a(var9);
            }

            var3 = Math.sqrt(var3);
            double var5 = 1.0 / var3;

            try {
               this.fs3 = var1.yme * var5;
               this.j4q = var1.pf8 * var5;
               this.fki = var1.jfe * var5;
               this.ezi = 2.0 * Math.atan2(var3, var1.ggc);
               if (var2 != 0) {
                  return;
               }
            } catch (NullPointerException var8) {
               boolean var10001 = false;
               throw a(var8);
            }
         }

         try {
            this.fs3 = 0.0;
            this.j4q = 1.0;
            this.fki = 0.0;
         } catch (NullPointerException var7) {
            boolean var11 = false;
            throw a(var7);
         }
      }

      this.ezi = 0.0;
   }

   @Override
   public String toString() {
      long var1 = a ^ 108532956284548L;
      return "("
         + this.fs3
         + a<"g">(19485, 3202501430509042953L ^ var1)
         + this.j4q
         + a<"g">(283, 2352015552317403150L ^ var1)
         + this.fki
         + a<"g">(283, 2352015552317403150L ^ var1)
         + this.ezi
         + ")";
   }

   public boolean z5_(lg5 param1) {
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
      // 05: getfield lg5.fs3 D
      // 08: aload 1
      // 09: getfield lg5.fs3 D
      // 0c: dcmpl
      // 0d: iload 2
      // 0e: ifne 2b
      // 11: ifne 79
      // 14: goto 1b
      // 17: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield lg5.j4q D
      // 1f: aload 1
      // 20: getfield lg5.j4q D
      // 23: dcmpl
      // 24: goto 2b
      // 27: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifne 49
      // 2f: ifne 79
      // 32: goto 39
      // 35: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield lg5.fki D
      // 3d: aload 1
      // 3e: getfield lg5.fki D
      // 41: dcmpl
      // 42: goto 49
      // 45: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: iload 2
      // 4a: ifne 67
      // 4d: ifne 79
      // 50: goto 57
      // 53: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 56: athrow
      // 57: aload 0
      // 58: getfield lg5.ezi D
      // 5b: aload 1
      // 5c: getfield lg5.ezi D
      // 5f: dcmpl
      // 60: goto 67
      // 63: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 66: athrow
      // 67: iload 2
      // 68: ifne 76
      // 6b: ifne 79
      // 6e: goto 75
      // 71: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: checkcast lg5
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield lg5.fs3 D
      // 0d: aload 3
      // 0e: getfield lg5.fs3 D
      // 11: dcmpl
      // 12: iload 2
      // 13: ifne 30
      // 16: ifne 7e
      // 19: goto 20
      // 1c: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield lg5.j4q D
      // 24: aload 3
      // 25: getfield lg5.j4q D
      // 28: dcmpl
      // 29: goto 30
      // 2c: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 4e
      // 34: ifne 7e
      // 37: goto 3e
      // 3a: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield lg5.fki D
      // 42: aload 3
      // 43: getfield lg5.fki D
      // 46: dcmpl
      // 47: goto 4e
      // 4a: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifne 6c
      // 52: ifne 7e
      // 55: goto 5c
      // 58: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield lg5.ezi D
      // 60: aload 3
      // 61: getfield lg5.ezi D
      // 64: dcmpl
      // 65: goto 6c
      // 68: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6b: athrow
      // 6c: iload 2
      // 6d: ifne 7b
      // 70: ifne 7e
      // 73: goto 7a
      // 76: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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

   public boolean z8o(lg5 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield lg5.fs3 D
      // 009: aload 1
      // 00a: getfield lg5.fs3 D
      // 00d: dsub
      // 00e: dstore 5
      // 010: dload 5
      // 012: iload 4
      // 014: ifne 02d
      // 017: dconst_0
      // 018: dcmpg
      // 019: ifge 030
      // 01c: goto 023
      // 01f: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 022: athrow
      // 023: dload 5
      // 025: dneg
      // 026: goto 02d
      // 029: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 02c: athrow
      // 02d: goto 032
      // 030: dload 5
      // 032: dload 2
      // 033: dcmpl
      // 034: iload 4
      // 036: ifne 064
      // 039: ifle 049
      // 03c: goto 043
      // 03f: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 042: athrow
      // 043: bipush 0
      // 044: ireturn
      // 045: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield lg5.j4q D
      // 04d: aload 1
      // 04e: getfield lg5.j4q D
      // 051: dsub
      // 052: dstore 5
      // 054: dload 5
      // 056: iload 4
      // 058: ifne 071
      // 05b: dconst_0
      // 05c: dcmpg
      // 05d: goto 064
      // 060: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 063: athrow
      // 064: ifge 074
      // 067: dload 5
      // 069: dneg
      // 06a: goto 071
      // 06d: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 070: athrow
      // 071: goto 076
      // 074: dload 5
      // 076: dload 2
      // 077: dcmpl
      // 078: iload 4
      // 07a: ifne 0a8
      // 07d: ifle 08d
      // 080: goto 087
      // 083: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 086: athrow
      // 087: bipush 0
      // 088: ireturn
      // 089: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield lg5.fki D
      // 091: aload 1
      // 092: getfield lg5.fki D
      // 095: dsub
      // 096: dstore 5
      // 098: dload 5
      // 09a: iload 4
      // 09c: ifne 0b5
      // 09f: dconst_0
      // 0a0: dcmpg
      // 0a1: goto 0a8
      // 0a4: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a7: athrow
      // 0a8: ifge 0b8
      // 0ab: dload 5
      // 0ad: dneg
      // 0ae: goto 0b5
      // 0b1: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0b4: athrow
      // 0b5: goto 0ba
      // 0b8: dload 5
      // 0ba: dload 2
      // 0bb: dcmpl
      // 0bc: iload 4
      // 0be: ifne 0ec
      // 0c1: ifle 0d1
      // 0c4: goto 0cb
      // 0c7: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ca: athrow
      // 0cb: bipush 0
      // 0cc: ireturn
      // 0cd: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield lg5.ezi D
      // 0d5: aload 1
      // 0d6: getfield lg5.ezi D
      // 0d9: dsub
      // 0da: dstore 5
      // 0dc: dload 5
      // 0de: iload 4
      // 0e0: ifne 0f9
      // 0e3: dconst_0
      // 0e4: dcmpg
      // 0e5: goto 0ec
      // 0e8: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0eb: athrow
      // 0ec: ifge 0fc
      // 0ef: dload 5
      // 0f1: dneg
      // 0f2: goto 0f9
      // 0f5: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f8: athrow
      // 0f9: goto 0fe
      // 0fc: dload 5
      // 0fe: dload 2
      // 0ff: dcmpl
      // 100: iload 4
      // 102: ifne 116
      // 105: ifle 115
      // 108: goto 10f
      // 10b: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 10e: athrow
      // 10f: bipush 0
      // 110: ireturn
      // 111: invokestatic lg5.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 114: athrow
      // 115: bipush 1
      // 116: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.mql(var1, this.fs3);
      var1 = get.mql(var1, this.j4q);
      var1 = get.mql(var1, this.fki);
      var1 = get.mql(var1, this.ezi);
      return get.p05(var1);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final double pim() {
      return this.ezi;
   }

   public final void ozu(double var1) {
      this.ezi = var1;
   }

   public double i6v() {
      return this.fs3;
   }

   public final void tud(double var1) {
      this.fs3 = var1;
   }

   public final double pzo() {
      return this.j4q;
   }

   public final void sxe(double var1) {
      this.j4q = var1;
   }

   public double aww() {
      return this.fki;
   }

   public final void uk0(double var1) {
      this.fki = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3891527754505308237L, 3269797011145362788L, MethodHandles.lookup().lookupClass()).a(111378752927116L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 91518057739968L;
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
      String var6 = "?\u0000§,ù\bÎª÷,w¤\u00ad\u0007T³\u0010¤4\u001d\u0014\u009e\u00adúÎãm\u008b\u00163y\u0088Þ";
      int var8 = "?\u0000§,ù\bÎª÷,w¤\u00ad\u0007T³\u0010¤4\u001d\u0014\u009e\u00adúÎãm\u008b\u00163y\u0088Þ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28320;
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
            throw new RuntimeException("lg5", var10);
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
         throw new RuntimeException("lg5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
