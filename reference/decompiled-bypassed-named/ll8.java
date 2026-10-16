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

public class ll8 implements Serializable, Cloneable {
   public static final long serialVersionUID = -163246355858070601L;
   public float _5i;
   public float w5z;
   public float yz_;
   public float b77;
   public static final double _g8 = 1.0E-6;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ll8(float var1, float var2, float var3, float var4) {
      this._5i = var1;
      this.w5z = var2;
      this.yz_ = var3;
      this.b77 = var4;
   }

   public ll8(float[] var1) {
      this._5i = var1[0];
      this.w5z = var1[1];
      this.yz_ = var1[2];
      this.b77 = var1[3];
   }

   public ll8(ll8 var1) {
      this._5i = var1._5i;
      this.w5z = var1.w5z;
      this.yz_ = var1.yz_;
      this.b77 = var1.b77;
   }

   public ll8(lg5 var1) {
      this._5i = (float)var1.fs3;
      this.w5z = (float)var1.j4q;
      this.yz_ = (float)var1.fki;
      this.b77 = (float)var1.ezi;
   }

   public ll8(l3p var1, float var2) {
      this._5i = var1.yiu;
      this.w5z = var1.q6o;
      this.yz_ = var1.n_d;
      this.b77 = var2;
   }

   public ll8() {
      this._5i = 0.0F;
      this.w5z = 0.0F;
      this.yz_ = 1.0F;
      this.b77 = 0.0F;
   }

   public final void _ry(float var1, float var2, float var3, float var4) {
      this._5i = var1;
      this.w5z = var2;
      this.yz_ = var3;
      this.b77 = var4;
   }

   public final void x47(float[] var1) {
      this._5i = var1[0];
      this.w5z = var1[1];
      this.yz_ = var1[2];
      this.b77 = var1[3];
   }

   public final void rrk(ll8 var1) {
      this._5i = var1._5i;
      this.w5z = var1.w5z;
      this.yz_ = var1.yz_;
      this.b77 = var1.b77;
   }

   public final void drc(lg5 var1) {
      this._5i = (float)var1.fs3;
      this.w5z = (float)var1.j4q;
      this.yz_ = (float)var1.fki;
      this.b77 = (float)var1.ezi;
   }

   public final void ps2(l3p var1, float var2) {
      this._5i = var1.yiu;
      this.w5z = var1.q6o;
      this.yz_ = var1.n_d;
      this.b77 = var2;
   }

   public final void tqp(float[] var1) {
      var1[0] = this._5i;
      var1[1] = this.w5z;
      var1[2] = this.yz_;
      var1[3] = this.b77;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void uc_(lwt var1) {
      int var2 = OpaquePredicate.c();
      double var3 = (double)(var1.hp2 * var1.hp2 + var1.nc_ * var1.nc_ + var1.ax5 * var1.ax5);

      label46: {
         label41: {
            try {
               if (var2 != 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-6)) {
                  break label41;
               }
            } catch (NullPointerException var9) {
               throw a(var9);
            }

            var3 = Math.sqrt(var3);
            double var5 = 1.0 / var3;

            try {
               this._5i = (float)((double)var1.hp2 * var5);
               this.w5z = (float)((double)var1.nc_ * var5);
               this.yz_ = (float)((double)var1.ax5 * var5);
               this.b77 = (float)(2.0 * Math.atan2(var3, (double)var1.ck3));
               if (var2 == 0) {
                  return;
               }
            } catch (NullPointerException var8) {
               boolean var10001 = false;
               throw a(var8);
            }
         }

         try {
            this._5i = 0.0F;
            this.w5z = 1.0F;
            this.yz_ = 0.0F;
         } catch (NullPointerException var7) {
            boolean var11 = false;
            throw a(var7);
         }
      }

      this.b77 = 0.0F;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void m0e(nbf var1) {
      int var2 = OpaquePredicate.c();
      double var3 = var1.yme * var1.yme + var1.pf8 * var1.pf8 + var1.jfe * var1.jfe;

      label46: {
         label41: {
            try {
               if (var2 != 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-6)) {
                  break label41;
               }
            } catch (NullPointerException var9) {
               throw a(var9);
            }

            var3 = Math.sqrt(var3);
            double var5 = 1.0 / var3;

            try {
               this._5i = (float)(var1.yme * var5);
               this.w5z = (float)(var1.pf8 * var5);
               this.yz_ = (float)(var1.jfe * var5);
               this.b77 = (float)(2.0 * Math.atan2(var3, var1.ggc));
               if (var2 == 0) {
                  return;
               }
            } catch (NullPointerException var8) {
               boolean var10001 = false;
               throw a(var8);
            }
         }

         try {
            this._5i = 0.0F;
            this.w5z = 1.0F;
            this.yz_ = 0.0F;
         } catch (NullPointerException var7) {
            boolean var11 = false;
            throw a(var7);
         }
      }

      this.b77 = 0.0F;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void e_r(krg var1) {
      nvj var3 = new nvj();
      var1.dn7(var3);
      this._5i = var3.wdt - var3.zk_;
      this.w5z = var3.xu6 - var3.aqg;
      int var10000 = OpaquePredicate.b();
      this.yz_ = var3._id - var3.k12;
      int var2 = var10000;
      double var4 = (double)(this._5i * this._5i + this.w5z * this.w5z + this.yz_ * this.yz_);

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var4 > 1.0E-6)) {
                  break label41;
               }
            } catch (NullPointerException var14) {
               throw a(var14);
            }

            var4 = Math.sqrt(var4);
            double var6 = 0.5 * var4;
            double var8 = 0.5 * ((double)(var3.i2i + var3.aoj + var3.jr8) - 1.0);
            this.b77 = (float)Math.atan2(var6, var8);
            double var10 = 1.0 / var4;

            try {
               this._5i = (float)((double)this._5i * var10);
               this.w5z = (float)((double)this.w5z * var10);
               this.yz_ = (float)((double)this.yz_ * var10);
               if (var2 != 0) {
                  return;
               }
            } catch (NullPointerException var13) {
               boolean var10001 = false;
               throw a(var13);
            }
         }

         try {
            this._5i = 0.0F;
            this.w5z = 1.0F;
            this.yz_ = 0.0F;
         } catch (NullPointerException var12) {
            boolean var17 = false;
            throw a(var12);
         }
      }

      this.b77 = 0.0F;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void a5z(onPlayerUpdate var1) {
      iww var3 = new iww();
      int var10000 = OpaquePredicate.c();
      var1.ay1(var3);
      this._5i = (float)(var3._o7 - var3.c84);
      this.w5z = (float)(var3.bhd - var3.y7q);
      int var2 = var10000;
      this.yz_ = (float)(var3.get - var3.y3c);
      double var4 = (double)(this._5i * this._5i + this.w5z * this.w5z + this.yz_ * this.yz_);

      label46: {
         label41: {
            try {
               if (var2 != 0) {
                  break label46;
               }

               if (!(var4 > 1.0E-6)) {
                  break label41;
               }
            } catch (NullPointerException var14) {
               throw a(var14);
            }

            var4 = Math.sqrt(var4);
            double var6 = 0.5 * var4;
            double var8 = 0.5 * (var3.lxb + var3.pwn + var3.ffq - 1.0);
            this.b77 = (float)Math.atan2(var6, var8);
            double var10 = 1.0 / var4;

            try {
               this._5i = (float)((double)this._5i * var10);
               this.w5z = (float)((double)this.w5z * var10);
               this.yz_ = (float)((double)this.yz_ * var10);
               if (var2 == 0) {
                  return;
               }
            } catch (NullPointerException var13) {
               boolean var10001 = false;
               throw a(var13);
            }
         }

         try {
            this._5i = 0.0F;
            this.w5z = 1.0F;
            this.yz_ = 0.0F;
         } catch (NullPointerException var12) {
            boolean var17 = false;
            throw a(var12);
         }
      }

      this.b77 = 0.0F;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void fau(nvj var1) {
      this._5i = var1.wdt - var1.zk_;
      int var10000 = OpaquePredicate.b();
      this.w5z = var1.xu6 - var1.aqg;
      int var2 = var10000;
      this.yz_ = var1._id - var1.k12;
      double var3 = (double)(this._5i * this._5i + this.w5z * this.w5z + this.yz_ * this.yz_);

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-6)) {
                  break label41;
               }
            } catch (NullPointerException var13) {
               throw a(var13);
            }

            var3 = Math.sqrt(var3);
            double var5 = 0.5 * var3;
            double var7 = 0.5 * ((double)(var1.i2i + var1.aoj + var1.jr8) - 1.0);
            this.b77 = (float)Math.atan2(var5, var7);
            double var9 = 1.0 / var3;

            try {
               this._5i = (float)((double)this._5i * var9);
               this.w5z = (float)((double)this.w5z * var9);
               this.yz_ = (float)((double)this.yz_ * var9);
               if (var2 != 0) {
                  return;
               }
            } catch (NullPointerException var12) {
               boolean var10001 = false;
               throw a(var12);
            }
         }

         try {
            this._5i = 0.0F;
            this.w5z = 1.0F;
            this.yz_ = 0.0F;
         } catch (NullPointerException var11) {
            boolean var16 = false;
            throw a(var11);
         }
      }

      this.b77 = 0.0F;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void rlg(iww var1) {
      this._5i = (float)(var1._o7 - var1.c84);
      int var10000 = OpaquePredicate.b();
      this.w5z = (float)(var1.bhd - var1.y7q);
      int var2 = var10000;
      this.yz_ = (float)(var1.get - var1.y3c);
      double var3 = (double)(this._5i * this._5i + this.w5z * this.w5z + this.yz_ * this.yz_);

      label46: {
         label41: {
            try {
               if (var2 == 0) {
                  break label46;
               }

               if (!(var3 > 1.0E-6)) {
                  break label41;
               }
            } catch (NullPointerException var13) {
               throw a(var13);
            }

            var3 = Math.sqrt(var3);
            double var5 = 0.5 * var3;
            double var7 = 0.5 * (var1.lxb + var1.pwn + var1.ffq - 1.0);
            this.b77 = (float)Math.atan2(var5, var7);
            double var9 = 1.0 / var3;

            try {
               this._5i = (float)((double)this._5i * var9);
               this.w5z = (float)((double)this.w5z * var9);
               this.yz_ = (float)((double)this.yz_ * var9);
               if (var2 != 0) {
                  return;
               }
            } catch (NullPointerException var12) {
               boolean var10001 = false;
               throw a(var12);
            }
         }

         try {
            this._5i = 0.0F;
            this.w5z = 1.0F;
            this.yz_ = 0.0F;
         } catch (NullPointerException var11) {
            boolean var16 = false;
            throw a(var11);
         }
      }

      this.b77 = 0.0F;
   }

   @Override
   public String toString() {
      long var1 = a ^ 91958918066917L;
      return "("
         + this._5i
         + a<"u">(23914, 1282686760971012908L ^ var1)
         + this.w5z
         + a<"u">(21119, 897953702804161592L ^ var1)
         + this.yz_
         + a<"u">(21119, 897953702804161592L ^ var1)
         + this.b77
         + ")";
   }

   public boolean mlc(ll8 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield ll8._5i F
      // 08: aload 1
      // 09: getfield ll8._5i F
      // 0c: fcmpl
      // 0d: iload 2
      // 0e: ifne 2b
      // 11: ifne 79
      // 14: goto 1b
      // 17: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield ll8.w5z F
      // 1f: aload 1
      // 20: getfield ll8.w5z F
      // 23: fcmpl
      // 24: goto 2b
      // 27: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifne 49
      // 2f: ifne 79
      // 32: goto 39
      // 35: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield ll8.yz_ F
      // 3d: aload 1
      // 3e: getfield ll8.yz_ F
      // 41: fcmpl
      // 42: goto 49
      // 45: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: iload 2
      // 4a: ifne 67
      // 4d: ifne 79
      // 50: goto 57
      // 53: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 56: athrow
      // 57: aload 0
      // 58: getfield ll8.b77 F
      // 5b: aload 1
      // 5c: getfield ll8.b77 F
      // 5f: fcmpl
      // 60: goto 67
      // 63: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 66: athrow
      // 67: iload 2
      // 68: ifne 76
      // 6b: ifne 79
      // 6e: goto 75
      // 71: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: checkcast ll8
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield ll8._5i F
      // 0d: aload 3
      // 0e: getfield ll8._5i F
      // 11: fcmpl
      // 12: iload 2
      // 13: ifne 30
      // 16: ifne 7e
      // 19: goto 20
      // 1c: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield ll8.w5z F
      // 24: aload 3
      // 25: getfield ll8.w5z F
      // 28: fcmpl
      // 29: goto 30
      // 2c: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 4e
      // 34: ifne 7e
      // 37: goto 3e
      // 3a: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield ll8.yz_ F
      // 42: aload 3
      // 43: getfield ll8.yz_ F
      // 46: fcmpl
      // 47: goto 4e
      // 4a: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifne 6c
      // 52: ifne 7e
      // 55: goto 5c
      // 58: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield ll8.b77 F
      // 60: aload 3
      // 61: getfield ll8.b77 F
      // 64: fcmpl
      // 65: goto 6c
      // 68: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6b: athrow
      // 6c: iload 2
      // 6d: ifne 7b
      // 70: ifne 7e
      // 73: goto 7a
      // 76: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
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

   public boolean gd3(ll8 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield ll8._5i F
      // 008: aload 1
      // 009: getfield ll8._5i F
      // 00c: fsub
      // 00d: fstore 4
      // 00f: fload 4
      // 011: iload 3
      // 012: ifne 02b
      // 015: fconst_0
      // 016: fcmpg
      // 017: ifge 02e
      // 01a: goto 021
      // 01d: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 020: athrow
      // 021: fload 4
      // 023: fneg
      // 024: goto 02b
      // 027: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 02a: athrow
      // 02b: goto 030
      // 02e: fload 4
      // 030: fload 2
      // 031: fcmpl
      // 032: iload 3
      // 033: ifne 060
      // 036: ifle 046
      // 039: goto 040
      // 03c: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 03f: athrow
      // 040: bipush 0
      // 041: ireturn
      // 042: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 045: athrow
      // 046: aload 0
      // 047: getfield ll8.w5z F
      // 04a: aload 1
      // 04b: getfield ll8.w5z F
      // 04e: fsub
      // 04f: fstore 4
      // 051: fload 4
      // 053: iload 3
      // 054: ifne 06d
      // 057: fconst_0
      // 058: fcmpg
      // 059: goto 060
      // 05c: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 05f: athrow
      // 060: ifge 070
      // 063: fload 4
      // 065: fneg
      // 066: goto 06d
      // 069: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 06c: athrow
      // 06d: goto 072
      // 070: fload 4
      // 072: fload 2
      // 073: fcmpl
      // 074: iload 3
      // 075: ifne 0a2
      // 078: ifle 088
      // 07b: goto 082
      // 07e: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 081: athrow
      // 082: bipush 0
      // 083: ireturn
      // 084: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 087: athrow
      // 088: aload 0
      // 089: getfield ll8.yz_ F
      // 08c: aload 1
      // 08d: getfield ll8.yz_ F
      // 090: fsub
      // 091: fstore 4
      // 093: fload 4
      // 095: iload 3
      // 096: ifne 0af
      // 099: fconst_0
      // 09a: fcmpg
      // 09b: goto 0a2
      // 09e: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0a1: athrow
      // 0a2: ifge 0b2
      // 0a5: fload 4
      // 0a7: fneg
      // 0a8: goto 0af
      // 0ab: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0ae: athrow
      // 0af: goto 0b4
      // 0b2: fload 4
      // 0b4: fload 2
      // 0b5: fcmpl
      // 0b6: iload 3
      // 0b7: ifne 0e4
      // 0ba: ifle 0ca
      // 0bd: goto 0c4
      // 0c0: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c3: athrow
      // 0c4: bipush 0
      // 0c5: ireturn
      // 0c6: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield ll8.b77 F
      // 0ce: aload 1
      // 0cf: getfield ll8.b77 F
      // 0d2: fsub
      // 0d3: fstore 4
      // 0d5: fload 4
      // 0d7: iload 3
      // 0d8: ifne 0f1
      // 0db: fconst_0
      // 0dc: fcmpg
      // 0dd: goto 0e4
      // 0e0: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0e3: athrow
      // 0e4: ifge 0f4
      // 0e7: fload 4
      // 0e9: fneg
      // 0ea: goto 0f1
      // 0ed: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0f0: athrow
      // 0f1: goto 0f6
      // 0f4: fload 4
      // 0f6: fload 2
      // 0f7: fcmpl
      // 0f8: iload 3
      // 0f9: ifne 10d
      // 0fc: ifle 10c
      // 0ff: goto 106
      // 102: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 105: athrow
      // 106: bipush 0
      // 107: ireturn
      // 108: invokestatic ll8.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 10b: athrow
      // 10c: bipush 1
      // 10d: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.g_p(var1, this._5i);
      var1 = get.g_p(var1, this.w5z);
      var1 = get.g_p(var1, this.yz_);
      var1 = get.g_p(var1, this.b77);
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

   public final float c2v() {
      return this.b77;
   }

   public final void r5t(float var1) {
      this.b77 = var1;
   }

   public final float jt1() {
      return this._5i;
   }

   public final void fgv(float var1) {
      this._5i = var1;
   }

   public final float roc() {
      return this.w5z;
   }

   public final void c6f(float var1) {
      this.w5z = var1;
   }

   public final float p8r() {
      return this.yz_;
   }

   public final void vk1(float var1) {
      this.yz_ = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(230063423904541357L, -1420673528696991070L, MethodHandles.lookup().lookupClass()).a(280120019924188L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92220156273045L;
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
      String var6 = "OÔ[4_«ë¦\u0013\"Ðï8\u009d\u0084k\u0010Y\u0005Ö\u0005%ôW\u001b\u008eæ\u0012Ë^¤{\u0010";
      int var8 = "OÔ[4_«ë¦\u0013\"Ðï8\u009d\u0084k\u0010Y\u0005Ö\u0005%ôW\u001b\u008eæ\u0012Ë^¤{\u0010".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12282;
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
            throw new RuntimeException("ll8", var10);
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
         throw new RuntimeException("ll8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
