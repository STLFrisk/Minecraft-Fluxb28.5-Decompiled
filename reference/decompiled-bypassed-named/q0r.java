import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.util.vector.Vector3f;

public class q0r {
   public static Minecraft hhm;
   private static final long a;
   private static final String b;

   public static boolean w7b() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: getstatic q0r.hhm Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getfield EntityPlayerSP.ooc F
      // 0d: fconst_0
      // 0e: fcmpl
      // 0f: iload 0
      // 10: ifne 2f
      // 13: ifne 41
      // 16: goto 1d
      // 19: invokestatic q0r.a (Loov;)Loov;
      // 1c: athrow
      // 1d: getstatic q0r.hhm Lc05;
      // 20: getfield Minecraft.vg8 Ll86;
      // 23: getfield EntityPlayerSP.z66 F
      // 26: fconst_0
      // 27: fcmpl
      // 28: goto 2f
      // 2b: invokestatic q0r.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 0
      // 30: ifne 3e
      // 33: ifne 41
      // 36: goto 3d
      // 39: invokestatic q0r.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   public static boolean oa2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: bipush 9
      // 06: istore 1
      // 07: iload 1
      // 08: bipush 44
      // 0a: if_icmpgt 3a
      // 0d: getstatic q0r.hhm Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.fv9 L_jc;
      // 16: iload 1
      // 17: invokevirtual _jc.ajr (I)Lvrx;
      // 1a: invokevirtual vrx.x4s ()Lerg;
      // 1d: astore 2
      // 1e: iload 0
      // 1f: ifne 36
      // 22: aload 2
      // 23: ifnonnull 33
      // 26: goto 2d
      // 29: invokestatic q0r.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
      // 2f: invokestatic q0r.a (Loov;)Loov;
      // 32: athrow
      // 33: iinc 1 1
      // 36: iload 0
      // 37: ifeq 07
      // 3a: bipush 1
      // 3b: ireturn
   }

   public static double gax() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dconst_0
      // 01: dstore 1
      // 02: invokestatic OpaquePredicate.b ()I
      // 05: getstatic q0r.hhm Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: getfield EntityPlayerSP.kfp D
      // 0e: dstore 3
      // 0f: istore 0
      // 10: dload 3
      // 11: dconst_0
      // 12: dcmpl
      // 13: ifle b3
      // 16: new mew
      // 19: dup
      // 1a: getstatic q0r.hhm Lc05;
      // 1d: getfield Minecraft.vg8 Ll86;
      // 20: getfield EntityPlayerSP.o2v D
      // 23: dload 3
      // 24: getstatic q0r.hhm Lc05;
      // 27: getfield Minecraft.vg8 Ll86;
      // 2a: getfield EntityPlayerSP.vbd D
      // 2d: invokespecial mew.<init> (DDD)V
      // 30: invokestatic bk4._82 (Lmew;)Le0x;
      // 33: astore 5
      // 35: iload 0
      // 36: ifeq c1
      // 39: aload 5
      // 3b: iload 0
      // 3c: ifeq 5f
      // 3f: goto 46
      // 42: invokestatic q0r.a (Loov;)Loov;
      // 45: athrow
      // 46: invokevirtual e0x.p1r ()Lp3y;
      // 49: getstatic p3y.cei Lp3y;
      // 4c: if_acmpeq 90
      // 4f: goto 56
      // 52: invokestatic q0r.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 5
      // 58: goto 5f
      // 5b: invokestatic q0r.a (Loov;)Loov;
      // 5e: athrow
      // 5f: invokevirtual e0x.lj1 ()Z
      // 62: iload 0
      // 63: ifeq a5
      // 66: ifeq 90
      // 69: goto 70
      // 6c: invokestatic q0r.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 5
      // 72: invokevirtual e0x.siy ()Z
      // 75: iload 0
      // 76: ifeq a5
      // 79: goto 80
      // 7c: invokestatic q0r.a (Loov;)Loov;
      // 7f: athrow
      // 80: ifeq 90
      // 83: goto 8a
      // 86: invokestatic q0r.a (Loov;)Loov;
      // 89: athrow
      // 8a: dload 3
      // 8b: dstore 1
      // 8c: iload 0
      // 8d: ifne b3
      // 90: dload 3
      // 91: dconst_0
      // 92: iload 0
      // 93: ifeq ad
      // 96: goto 9d
      // 99: invokestatic q0r.a (Loov;)Loov;
      // 9c: athrow
      // 9d: dcmpg
      // 9e: goto a5
      // a1: invokestatic q0r.a (Loov;)Loov;
      // a4: athrow
      // a5: ifge ab
      // a8: goto b3
      // ab: dload 3
      // ac: dconst_1
      // ad: dsub
      // ae: dstore 3
      // af: iload 0
      // b0: ifne 10
      // b3: getstatic q0r.hhm Lc05;
      // b6: getfield Minecraft.vg8 Ll86;
      // b9: getfield EntityPlayerSP.kfp D
      // bc: dload 1
      // bd: dsub
      // be: dconst_1
      // bf: dsub
      // c0: dstore 3
      // c1: dload 3
      // c2: dreturn
   }

   public static float[] zn8(double var0, double var2, double var4, vt2 var6) {
      txr var7 = new txr(hhm.tij);
      var7.o2v = var0 + 0.5;
      var7.kfp = var2 + 0.5;
      var7.vbd = var4 + 0.5;
      var7.o2v = var7.o2v + (double)var6.et1().getX() * 0.25;
      var7.kfp = var7.kfp + (double)var6.et1().getY() * 0.25;
      var7.vbd = var7.vbd + (double)var6.et1().getZ() * 0.25;
      return owk(var7.o2v, var7.kfp, var7.vbd);
   }

   public static float[] owk(double var0, double var2, double var4) {
      double var6 = var0 - hhm.vg8.o2v;
      double var8 = var2 - hhm.vg8.kfp;
      double var10 = var4 - hhm.vg8.vbd;
      double var12 = (double)fe6.dii(var6 * var6 + var10 * var10);
      return new float[]{(float)(Math.atan2(var10, var6) * 180.0 / Math.PI) - 90.0F, (float)(-(Math.atan2(var8, var12) * 180.0 / Math.PI))};
   }

   public static void tq3(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic q0r.a J
      // 03: ldc2_w 21802291522116
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: ifnull 57
      // 10: getstatic q0r.hhm Lc05;
      // 13: getfield Minecraft.vg8 Ll86;
      // 16: iload 3
      // 17: ifeq 38
      // 1a: goto 21
      // 1d: invokestatic q0r.a (Loov;)Loov;
      // 20: athrow
      // 21: ifnull 57
      // 24: goto 2b
      // 27: invokestatic q0r.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getstatic q0r.hhm Lc05;
      // 2e: getfield Minecraft.vg8 Ll86;
      // 31: goto 38
      // 34: invokestatic q0r.a (Loov;)Loov;
      // 37: athrow
      // 38: new tao
      // 3b: dup
      // 3c: new java/lang/StringBuilder
      // 3f: dup
      // 40: invokespecial java/lang/StringBuilder.<init> ()V
      // 43: getstatic q0r.b Ljava/lang/String;
      // 46: nop
      // 47: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a: aload 0
      // 4b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 51: invokespecial tao.<init> (Ljava/lang/String;)V
      // 54: invokevirtual EntityPlayerSP.a0d (Lekw;)V
      // 57: return
   }

   public void sq1(float var1, float var2, float var3) {
      double var4 = -Math.sin(Math.toRadians((double)var1)) * (double)var2;
      double var6 = Math.cos(Math.toRadians((double)var1)) * (double)var2;
      double var8 = (double)var3;
      hhm.vg8.m6_(var4 + hhm.vg8.o2v, var8 + hhm.vg8.kfp, var6 + hhm.vg8.vbd);
   }

   public static double ibc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: ldc2_w 0.2873
      // 07: dstore 1
      // 08: getstatic q0r.hhm Lc05;
      // 0b: getfield Minecraft.vg8 Ll86;
      // 0e: getstatic mcs.uwx Lmcs;
      // 11: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 14: iload 0
      // 15: ifeq 38
      // 18: ifeq 46
      // 1b: goto 22
      // 1e: invokestatic q0r.a (Loov;)Loov;
      // 21: athrow
      // 22: getstatic q0r.hhm Lc05;
      // 25: getfield Minecraft.vg8 Ll86;
      // 28: getstatic mcs.uwx Lmcs;
      // 2b: invokevirtual EntityPlayerSP.dhd (Lmcs;)Lsdj;
      // 2e: invokevirtual sdj.tus ()I
      // 31: goto 38
      // 34: invokestatic q0r.a (Loov;)Loov;
      // 37: athrow
      // 38: istore 3
      // 39: dload 1
      // 3a: dconst_1
      // 3b: ldc2_w 0.2
      // 3e: iload 3
      // 3f: bipush 1
      // 40: iadd
      // 41: i2d
      // 42: dmul
      // 43: dadd
      // 44: dmul
      // 45: dstore 1
      // 46: dload 1
      // 47: dreturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static float xph() {
      int var0 = OpaquePredicate.b();
      float var1 = hhm.vg8.x5k;

      float var10000;
      label98: {
         label97: {
            try {
               var10000 = hhm.vg8.ooc;
               if (var0 == 0) {
                  break label98;
               }

               if (!(hhm.vg8.ooc < 0.0F)) {
                  break label97;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var1 += 180.0F;
         }

         var10000 = 1.0F;
      }

      float var2 = var10000;

      label111: {
         label102: {
            label85: {
               label103: {
                  try {
                     float var15;
                     var10 = (var15 = hhm.vg8.ooc - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
                     if (var0 == 0) {
                        break label85;
                     }

                     if (var10 >= 0) {
                        break label103;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }

                  var2 = -0.5F;

                  try {
                     if (var0 != 0) {
                        break label102;
                     }
                  } catch (oov var7) {
                     boolean var10001 = false;
                     throw a(var7);
                  }
               }

               try {
                  float var16;
                  var10 = (var16 = hhm.vg8.ooc - 0.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
               } catch (oov var6) {
                  boolean var13 = false;
                  throw a(var6);
               }
            }

            try {
               if (var0 == 0) {
                  break label111;
               }

               if (var10 <= 0) {
                  break label102;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var2 = 0.5F;
         }

         float var17;
         var10 = (var17 = hhm.vg8.z66 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      label62: {
         label61: {
            try {
               if (var0 == 0) {
                  break label62;
               }

               if (var10 <= 0) {
                  break label61;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var1 -= 90.0F * var2;
         }

         try {
            if (var0 == 0) {
               return hhm.vg8.z66 * 0.0F;
            }

            float var18;
            var10 = (var18 = hhm.vg8.z66 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
         } catch (oov var3) {
            throw a(var3);
         }
      }

      if (var10 < 0) {
         var1 += 90.0F * var2;
      }

      return var1 * (float) (Math.PI / 180.0);
   }

   public static boolean nxr() {
      try {
         if (hhm.tij.getBlockState(new mew(hhm.vg8.o2v, hhm.vg8.kfp, hhm.vg8.vbd)).r_y().p1r() == p3y.six) {
            return true;
         }
      } catch (oov var0) {
         throw a(var0);
      }

      return false;
   }

   public static void uag(double var0) {
      float var2 = hhm.vg8.x5k * (float) (Math.PI / 180.0);
      EntityPlayerSP var3 = hhm.vg8;
      var3.icv = var3.icv - (double)fe6.rtn(var2) * var0;
      EntityPlayerSP var4 = hhm.vg8;
      var4.bw4 = var4.bw4 + (double)fe6.ssk(var2) * var0;
   }

   public static void setOwner(double var0) {
      hhm.vg8.icv = -(Math.sin((double)xph()) * var0);
      hhm.vg8.bw4 = Math.cos((double)xph()) * var0;
   }

   public static double x28() {
      return Math.sqrt(hhm.vg8.icv * hhm.vg8.icv + hhm.vg8.bw4 * hhm.vg8.bw4);
   }

   public static e0x o0e(ha9 var0) {
      return q0x(new mew(var0.o2v, var0.kfp - 1.0, var0.vbd));
   }

   public static e0x q0x(mew var0) {
      return hhm.tij.getBlockState(var0).r_y();
   }

   public static e0x hfn(ha9 var0, double var1, double var3, double var5) {
      return q0x(new mew(var0.o2v - var1, var0.kfp - var3, var0.vbd - var5));
   }

   public static ArrayList xlb(double var0, double var2, double var4, double var6) {
      ArrayList var9 = new ArrayList();
      Minecraft var10 = Minecraft.vz1();
      double var11 = var0 - var10.vg8.o2v;
      double var13 = var2 - (var10.vg8.kfp + (double)var10.vg8.c5y() + 1.1);
      double var15 = var4 - var10.vg8.vbd;
      float var17 = (float)(Math.atan2(var15, var11) * 180.0 / Math.PI - 90.0);
      int var10000 = OpaquePredicate.c();
      float var18 = (float)(-Math.atan2(var13, Math.sqrt(var11 * var11 + var15 * var15)) * 180.0 / Math.PI);
      double var19 = var10.vg8.o2v;
      double var21 = var10.vg8.kfp;
      double var23 = var10.vg8.vbd;
      double var25 = 1.0;
      int var8 = var10000;
      double var27 = var6;

      while (true) {
         if (var27 < f9u(var10.vg8.o2v, var10.vg8.kfp, var10.vg8.vbd, var0, var2, var4)) {
            var25++;
            var27 += var6;

            try {
               if (var8 != 0) {
                  break;
               }

               if (var8 == 0) {
                  continue;
               }
            } catch (oov var30) {
               throw a(var30);
            }
         }

         var27 = var6;
         break;
      }

      while (true) {
         if (var27 < f9u(var10.vg8.o2v, var10.vg8.kfp, var10.vg8.vbd, var0, var2, var4)) {
            var19 = var10.vg8.o2v - Math.sin((double)i8w(var17)) * var27;
            var23 = var10.vg8.vbd + Math.cos((double)i8w(var17)) * var27;
            var21 -= (var10.vg8.kfp - var2) / var25;
            var9.add(new Vector3f((float)var19, (float)var21, (float)var23));
            var27 += var6;

            try {
               if (var8 != 0) {
                  break;
               }

               if (var8 == 0) {
                  continue;
               }
            } catch (oov var29) {
               throw a(var29);
            }
         }

         var9.add(new Vector3f((float)var0, (float)var2, (float)var4));
         break;
      }

      return var9;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static float i8w(float var0) {
      int var1 = OpaquePredicate.b();

      float var10000;
      label98: {
         label97: {
            try {
               var10000 = hhm.vg8.ooc;
               if (var1 == 0) {
                  break label98;
               }

               if (!(hhm.vg8.ooc < 0.0F)) {
                  break label97;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var0 += 180.0F;
         }

         var10000 = 1.0F;
      }

      float var2 = var10000;

      label111: {
         label102: {
            label85: {
               label103: {
                  try {
                     float var15;
                     var10 = (var15 = hhm.vg8.ooc - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
                     if (var1 == 0) {
                        break label85;
                     }

                     if (var10 >= 0) {
                        break label103;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }

                  var2 = -0.5F;

                  try {
                     if (var1 != 0) {
                        break label102;
                     }
                  } catch (oov var7) {
                     boolean var10001 = false;
                     throw a(var7);
                  }
               }

               try {
                  float var16;
                  var10 = (var16 = hhm.vg8.ooc - 0.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
               } catch (oov var6) {
                  boolean var13 = false;
                  throw a(var6);
               }
            }

            try {
               if (var1 == 0) {
                  break label111;
               }

               if (var10 <= 0) {
                  break label102;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var2 = 0.5F;
         }

         float var17;
         var10 = (var17 = hhm.vg8.z66 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      label62: {
         label61: {
            try {
               if (var1 == 0) {
                  break label62;
               }

               if (var10 <= 0) {
                  break label61;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var0 -= 90.0F * var2;
         }

         try {
            if (var1 == 0) {
               return hhm.vg8.z66 * 0.0F;
            }

            float var18;
            var10 = (var18 = hhm.vg8.z66 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
         } catch (oov var3) {
            throw a(var3);
         }
      }

      if (var10 < 0) {
         var0 += 90.0F * var2;
      }

      return var0 * (float) (Math.PI / 180.0);
   }

   public static double f9u(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var0 - var6;
      double var14 = var2 - var8;
      double var16 = var4 - var10;
      return (double)fe6.dii(var12 * var12 + var14 * var14 + var16 * var16);
   }

   public static boolean d3i() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: getstatic q0r.hhm Lc05;
      // 07: getfield Minecraft.oxn Lmoh;
      // 0a: getfield moh.mn1 Lm7l;
      // 0d: getfield m7l.m7n Z
      // 10: iload 0
      // 11: ifne 82
      // 14: ifne 81
      // 17: goto 1e
      // 1a: invokestatic q0r.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic q0r.hhm Lc05;
      // 21: getfield Minecraft.oxn Lmoh;
      // 24: getfield moh._70 Lm7l;
      // 27: getfield m7l.m7n Z
      // 2a: iload 0
      // 2b: ifne 82
      // 2e: goto 35
      // 31: invokestatic q0r.a (Loov;)Loov;
      // 34: athrow
      // 35: ifne 81
      // 38: goto 3f
      // 3b: invokestatic q0r.a (Loov;)Loov;
      // 3e: athrow
      // 3f: getstatic q0r.hhm Lc05;
      // 42: getfield Minecraft.oxn Lmoh;
      // 45: getfield moh.asx Lm7l;
      // 48: getfield m7l.m7n Z
      // 4b: iload 0
      // 4c: ifne 82
      // 4f: goto 56
      // 52: invokestatic q0r.a (Loov;)Loov;
      // 55: athrow
      // 56: ifne 81
      // 59: goto 60
      // 5c: invokestatic q0r.a (Loov;)Loov;
      // 5f: athrow
      // 60: getstatic q0r.hhm Lc05;
      // 63: getfield Minecraft.oxn Lmoh;
      // 66: getfield moh.tup Lm7l;
      // 69: getfield m7l.m7n Z
      // 6c: iload 0
      // 6d: ifne 82
      // 70: goto 77
      // 73: invokestatic q0r.a (Loov;)Loov;
      // 76: athrow
      // 77: ifeq 85
      // 7a: goto 81
      // 7d: invokestatic q0r.a (Loov;)Loov;
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   public static void l28(EntityLivingBase param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Minecraft.vz1 ()Lc05;
      // 03: astore 3
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 3
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 0e: astore 4
      // 10: istore 2
      // 11: aload 3
      // 12: getfield Minecraft.vg8 Ll86;
      // 15: iload 2
      // 16: ifne 2e
      // 19: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 1c: ifnull 9f
      // 1f: goto 26
      // 22: invokestatic q0r.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: goto 2e
      // 2a: invokestatic q0r.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifnull 9f
      // 31: iload 1
      // 32: iload 2
      // 33: ifne 56
      // 36: goto 3d
      // 39: invokestatic q0r.a (Loov;)Loov;
      // 3c: athrow
      // 3d: ifeq 9f
      // 40: goto 47
      // 43: invokestatic q0r.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 4
      // 49: invokevirtual erg.gn1 ()Lu7m;
      // 4c: instanceof za6
      // 4f: goto 56
      // 52: invokestatic q0r.a (Loov;)Loov;
      // 55: athrow
      // 56: iload 2
      // 57: ifne 82
      // 5a: ifeq 9f
      // 5d: goto 64
      // 60: invokestatic q0r.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 3
      // 65: getfield Minecraft.vg8 Ll86;
      // 68: iload 2
      // 69: ifne 90
      // 6c: goto 73
      // 6f: invokestatic q0r.a (Loov;)Loov;
      // 72: athrow
      // 73: getfield EntityPlayerSP.sti F
      // 76: f2d
      // 77: ldc2_w 0.2
      // 7a: dcmpl
      // 7b: goto 82
      // 7e: invokestatic q0r.a (Loov;)Loov;
      // 81: athrow
      // 82: ifle 9f
      // 85: aload 3
      // 86: getfield Minecraft.vg8 Ll86;
      // 89: goto 90
      // 8c: invokestatic q0r.a (Loov;)Loov;
      // 8f: athrow
      // 90: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 93: aload 3
      // 94: getfield Minecraft.tij Lkh3;
      // 97: aload 3
      // 98: getfield Minecraft.vg8 Ll86;
      // 9b: invokevirtual erg.vwi (Lt9d;Lha9;)Lerg;
      // 9e: pop
      // 9f: return
   }

   public static float nzx(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual erg.s15 ()Lcom/google/common/collect/Multimap;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 25
      // 0e: invokeinterface com/google/common/collect/Multimap.isEmpty ()Z 1
      // 13: ifne be
      // 16: goto 1d
      // 19: invokestatic q0r.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 2
      // 1e: goto 25
      // 21: invokestatic q0r.a (Loov;)Loov;
      // 24: athrow
      // 25: invokeinterface com/google/common/collect/Multimap.entries ()Ljava/util/Collection; 1
      // 2a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 3
      // 30: aload 3
      // 31: iload 1
      // 32: ifne 51
      // 35: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a: ifeq be
      // 3d: goto 44
      // 40: invokestatic q0r.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 3
      // 45: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4a: goto 51
      // 4d: invokestatic q0r.a (Loov;)Loov;
      // 50: athrow
      // 51: checkcast java/util/Map$Entry
      // 54: astore 4
      // 56: aload 4
      // 58: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 5d: checkcast xk5
      // 60: astore 5
      // 62: aload 5
      // 64: iload 1
      // 65: ifne 9f
      // 68: invokevirtual xk5.zdp ()I
      // 6b: bipush 1
      // 6c: if_icmpeq 9d
      // 6f: goto 76
      // 72: invokestatic q0r.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 5
      // 78: iload 1
      // 79: ifne 9f
      // 7c: goto 83
      // 7f: invokestatic q0r.a (Loov;)Loov;
      // 82: athrow
      // 83: invokevirtual xk5.zdp ()I
      // 86: bipush 2
      // 87: if_icmpeq 9d
      // 8a: goto 91
      // 8d: invokestatic q0r.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 5
      // 93: invokevirtual xk5._2u ()D
      // 96: goto a6
      // 99: invokestatic q0r.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 5
      // 9f: invokevirtual xk5._2u ()D
      // a2: ldc2_w 100.0
      // a5: dmul
      // a6: dstore 6
      // a8: aload 5
      // aa: invokevirtual xk5._2u ()D
      // ad: dconst_1
      // ae: dcmpl
      // af: ifle bc
      // b2: fconst_1
      // b3: dload 6
      // b5: d2f
      // b6: fadd
      // b7: freturn
      // b8: invokestatic q0r.a (Loov;)Loov;
      // bb: athrow
      // bc: fconst_1
      // bd: freturn
      // be: fconst_1
      // bf: freturn
   }

   public static int yyf(EntityLivingBase param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Minecraft.vz1 ()Lc05;
      // 03: astore 2
      // 04: aload 2
      // 05: getfield Minecraft.vg8 Ll86;
      // 08: getfield EntityPlayerSP.up_ Ljnq;
      // 0b: bipush 0
      // 0c: dup_x1
      // 0d: putfield jnq.nb5 I
      // 10: istore 3
      // 11: invokestatic OpaquePredicate.c ()I
      // 14: bipush -1
      // 15: istore 4
      // 17: bipush 1
      // 18: istore 5
      // 1a: bipush 0
      // 1b: istore 6
      // 1d: istore 1
      // 1e: iload 6
      // 20: bipush 9
      // 22: if_icmpge 91
      // 25: aload 2
      // 26: getfield Minecraft.vg8 Ll86;
      // 29: getfield EntityPlayerSP.up_ Ljnq;
      // 2c: iload 6
      // 2e: putfield jnq.nb5 I
      // 31: aload 2
      // 32: getfield Minecraft.vg8 Ll86;
      // 35: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 38: astore 7
      // 3a: iload 1
      // 3b: ifne a9
      // 3e: iload 1
      // 3f: ifne 8d
      // 42: goto 49
      // 45: invokestatic q0r.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 7
      // 4b: ifnull 86
      // 4e: goto 55
      // 51: invokestatic q0r.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 7
      // 57: invokestatic q0r.nzx (Lerg;)F
      // 5a: f2i
      // 5b: istore 8
      // 5d: iload 8
      // 5f: i2f
      // 60: aload 7
      // 62: getstatic n1e.y3x Ln1e;
      // 65: invokestatic hc0.xpe (Lerg;Ln1e;)F
      // 68: fadd
      // 69: f2i
      // 6a: istore 8
      // 6c: iload 8
      // 6e: iload 5
      // 70: iload 1
      // 71: ifne 89
      // 74: if_icmple 86
      // 77: goto 7e
      // 7a: invokestatic q0r.a (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 8
      // 80: istore 5
      // 82: iload 6
      // 84: istore 4
      // 86: iload 6
      // 88: bipush 1
      // 89: iadd
      // 8a: i2b
      // 8b: istore 6
      // 8d: iload 1
      // 8e: ifeq 1e
      // 91: iload 4
      // 93: iload 1
      // 94: ifne aa
      // 97: bipush -1
      // 98: if_icmpeq a9
      // 9b: goto a2
      // 9e: invokestatic q0r.a (Loov;)Loov;
      // a1: athrow
      // a2: iload 4
      // a4: ireturn
      // a5: invokestatic q0r.a (Loov;)Loov;
      // a8: athrow
      // a9: iload 3
      // aa: ireturn
   }

   public static void crn(u7m param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: bipush 9
      // 06: istore 2
      // 07: iload 2
      // 08: bipush 37
      // 0a: if_icmpge 74
      // 0d: getstatic q0r.hhm Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.fv9 L_jc;
      // 16: iload 2
      // 17: invokevirtual _jc.ajr (I)Lvrx;
      // 1a: invokevirtual vrx.x4s ()Lerg;
      // 1d: astore 3
      // 1e: iload 1
      // 1f: ifeq 70
      // 22: aload 3
      // 23: ifnull 66
      // 26: goto 2d
      // 29: invokestatic q0r.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 3
      // 2e: iload 1
      // 2f: ifeq 61
      // 32: goto 39
      // 35: invokestatic q0r.a (Loov;)Loov;
      // 38: athrow
      // 39: invokevirtual erg.gn1 ()Lu7m;
      // 3c: aload 0
      // 3d: if_acmpne 66
      // 40: goto 47
      // 43: invokestatic q0r.a (Loov;)Loov;
      // 46: athrow
      // 47: getstatic q0r.hhm Lc05;
      // 4a: getfield Minecraft.l7q Lhh6;
      // 4d: bipush 0
      // 4e: iload 2
      // 4f: bipush 0
      // 50: bipush 1
      // 51: getstatic q0r.hhm Lc05;
      // 54: getfield Minecraft.vg8 Ll86;
      // 57: invokevirtual hh6.efg (IIIILha9;)Lerg;
      // 5a: goto 61
      // 5d: invokestatic q0r.a (Loov;)Loov;
      // 60: athrow
      // 61: pop
      // 62: iload 1
      // 63: ifne 74
      // 66: iinc 2 1
      // 69: goto 70
      // 6c: invokestatic q0r.a (Loov;)Loov;
      // 6f: athrow
      // 70: iload 1
      // 71: ifne 07
      // 74: return
   }

   public static boolean ez_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: bipush 0
      // 05: istore 1
      // 06: iload 1
      // 07: bipush 36
      // 09: if_icmpgt 36
      // 0c: getstatic q0r.hhm Lc05;
      // 0f: getfield Minecraft.vg8 Ll86;
      // 12: getfield EntityPlayerSP.up_ Ljnq;
      // 15: iload 1
      // 16: invokevirtual jnq.ibn (I)Lerg;
      // 19: astore 2
      // 1a: iload 0
      // 1b: ifne 32
      // 1e: aload 2
      // 1f: ifnonnull 2f
      // 22: goto 29
      // 25: invokestatic q0r.a (Loov;)Loov;
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: invokestatic q0r.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iinc 1 1
      // 32: iload 0
      // 33: ifeq 06
      // 36: bipush 1
      // 37: ireturn
   }

   public static boolean f2f() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: getstatic q0r.hhm Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getfield EntityPlayerSP.cbi Z
      // 0d: iload 0
      // 0e: ifne 86
      // 11: ifne 85
      // 14: goto 1b
      // 17: invokestatic q0r.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic q0r.hhm Lc05;
      // 1e: getfield Minecraft.vg8 Ll86;
      // 21: invokevirtual EntityPlayerSP.hzv ()Z
      // 24: iload 0
      // 25: ifne 86
      // 28: goto 2f
      // 2b: invokestatic q0r.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifne 85
      // 32: goto 39
      // 35: invokestatic q0r.a (Loov;)Loov;
      // 38: athrow
      // 39: getstatic q0r.hhm Lc05;
      // 3c: getfield Minecraft.vg8 Ll86;
      // 3f: getfield EntityPlayerSP.g9g Lboa;
      // 42: getfield boa._mw F
      // 45: fconst_0
      // 46: fcmpl
      // 47: iload 0
      // 48: ifne 80
      // 4b: goto 52
      // 4e: invokestatic q0r.a (Loov;)Loov;
      // 51: athrow
      // 52: ifne 7f
      // 55: goto 5c
      // 58: invokestatic q0r.a (Loov;)Loov;
      // 5b: athrow
      // 5c: getstatic q0r.hhm Lc05;
      // 5f: getfield Minecraft.vg8 Ll86;
      // 62: getfield EntityPlayerSP.g9g Lboa;
      // 65: getfield boa.lrp F
      // 68: fconst_0
      // 69: fcmpl
      // 6a: iload 0
      // 6b: ifne 80
      // 6e: goto 75
      // 71: invokestatic q0r.a (Loov;)Loov;
      // 74: athrow
      // 75: ifeq 83
      // 78: goto 7f
      // 7b: invokestatic q0r.a (Loov;)Loov;
      // 7e: athrow
      // 7f: bipush 1
      // 80: goto 84
      // 83: bipush 0
      // 84: ireturn
      // 85: bipush 0
      // 86: ireturn
   }

   public static boolean fsj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic q0r.hhm Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getfield EntityPlayerSP.ooc F
      // 0d: fconst_0
      // 0e: fcmpl
      // 0f: iload 0
      // 10: ifeq 3e
      // 13: ifne 3d
      // 16: goto 1d
      // 19: invokestatic q0r.a (Loov;)Loov;
      // 1c: athrow
      // 1d: getstatic q0r.hhm Lc05;
      // 20: getfield Minecraft.vg8 Ll86;
      // 23: getfield EntityPlayerSP.z66 F
      // 26: fconst_0
      // 27: fcmpl
      // 28: iload 0
      // 29: ifeq 3e
      // 2c: goto 33
      // 2f: invokestatic q0r.a (Loov;)Loov;
      // 32: athrow
      // 33: ifeq 41
      // 36: goto 3d
      // 39: invokestatic q0r.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   public static void f8m(double[] param0, mew param1, double param2, double[] param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: daload
      // 003: dstore 6
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: aload 0
      // 009: bipush 1
      // 00a: daload
      // 00b: dstore 8
      // 00d: aload 0
      // 00e: bipush 2
      // 00f: daload
      // 010: dstore 10
      // 012: istore 5
      // 014: aload 1
      // 015: invokevirtual mew.getX ()I
      // 018: i2d
      // 019: ldc2_w 0.5
      // 01c: dadd
      // 01d: dstore 12
      // 01f: aload 1
      // 020: invokevirtual mew.getY ()I
      // 023: i2d
      // 024: dconst_1
      // 025: dadd
      // 026: dstore 14
      // 028: aload 1
      // 029: invokevirtual mew.getZ ()I
      // 02c: i2d
      // 02d: ldc2_w 0.5
      // 030: dadd
      // 031: dstore 16
      // 033: dload 6
      // 035: dload 12
      // 037: dsub
      // 038: invokestatic java/lang/Math.abs (D)D
      // 03b: dload 8
      // 03d: dload 14
      // 03f: dsub
      // 040: invokestatic java/lang/Math.abs (D)D
      // 043: dadd
      // 044: dload 10
      // 046: dload 16
      // 048: dsub
      // 049: invokestatic java/lang/Math.abs (D)D
      // 04c: dadd
      // 04d: dstore 18
      // 04f: bipush 0
      // 050: istore 20
      // 052: dload 18
      // 054: dload 2
      // 055: dcmpl
      // 056: ifle 2b6
      // 059: dload 6
      // 05b: dload 12
      // 05d: dsub
      // 05e: invokestatic java/lang/Math.abs (D)D
      // 061: dload 8
      // 063: dload 14
      // 065: dsub
      // 066: invokestatic java/lang/Math.abs (D)D
      // 069: dadd
      // 06a: dload 10
      // 06c: dload 16
      // 06e: dsub
      // 06f: invokestatic java/lang/Math.abs (D)D
      // 072: dadd
      // 073: dstore 18
      // 075: iload 20
      // 077: iload 5
      // 079: ifne 090
      // 07c: bipush 120
      // 07e: if_icmple 08f
      // 081: goto 088
      // 084: invokestatic q0r.a (Loov;)Loov;
      // 087: athrow
      // 088: goto 2b6
      // 08b: invokestatic q0r.a (Loov;)Loov;
      // 08e: athrow
      // 08f: bipush 0
      // 090: istore 21
      // 092: dload 6
      // 094: dload 12
      // 096: dsub
      // 097: dstore 22
      // 099: dload 8
      // 09b: dload 14
      // 09d: dsub
      // 09e: dstore 24
      // 0a0: dload 10
      // 0a2: dload 16
      // 0a4: dsub
      // 0a5: dstore 26
      // 0a7: iload 20
      // 0a9: bipush 1
      // 0aa: iand
      // 0ab: ifne 0b9
      // 0ae: aload 4
      // 0b0: bipush 0
      // 0b1: daload
      // 0b2: goto 0bd
      // 0b5: invokestatic q0r.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: bipush 1
      // 0bc: daload
      // 0bd: dstore 28
      // 0bf: dload 22
      // 0c1: dconst_0
      // 0c2: dcmpg
      // 0c3: iload 5
      // 0c5: ifne 111
      // 0c8: ifge 10d
      // 0cb: goto 0d2
      // 0ce: invokestatic q0r.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: dload 22
      // 0d4: invokestatic java/lang/Math.abs (D)D
      // 0d7: dload 28
      // 0d9: iload 5
      // 0db: ifne 10a
      // 0de: goto 0e5
      // 0e1: invokestatic q0r.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: dcmpl
      // 0e6: ifle 0fc
      // 0e9: goto 0f0
      // 0ec: invokestatic q0r.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: dload 6
      // 0f2: dload 28
      // 0f4: dadd
      // 0f5: dstore 6
      // 0f7: iload 5
      // 0f9: ifeq 10d
      // 0fc: dload 6
      // 0fe: dload 22
      // 100: invokestatic java/lang/Math.abs (D)D
      // 103: goto 10a
      // 106: invokestatic q0r.a (Loov;)Loov;
      // 109: athrow
      // 10a: dadd
      // 10b: dstore 6
      // 10d: dload 22
      // 10f: dconst_0
      // 110: dcmpl
      // 111: iload 5
      // 113: ifne 15f
      // 116: ifle 15b
      // 119: goto 120
      // 11c: invokestatic q0r.a (Loov;)Loov;
      // 11f: athrow
      // 120: dload 22
      // 122: invokestatic java/lang/Math.abs (D)D
      // 125: dload 28
      // 127: iload 5
      // 129: ifne 158
      // 12c: goto 133
      // 12f: invokestatic q0r.a (Loov;)Loov;
      // 132: athrow
      // 133: dcmpl
      // 134: ifle 14a
      // 137: goto 13e
      // 13a: invokestatic q0r.a (Loov;)Loov;
      // 13d: athrow
      // 13e: dload 6
      // 140: dload 28
      // 142: dsub
      // 143: dstore 6
      // 145: iload 5
      // 147: ifeq 15b
      // 14a: dload 6
      // 14c: dload 22
      // 14e: invokestatic java/lang/Math.abs (D)D
      // 151: goto 158
      // 154: invokestatic q0r.a (Loov;)Loov;
      // 157: athrow
      // 158: dsub
      // 159: dstore 6
      // 15b: dload 24
      // 15d: dconst_0
      // 15e: dcmpg
      // 15f: iload 5
      // 161: ifne 1af
      // 164: ifge 1ab
      // 167: goto 16e
      // 16a: invokestatic q0r.a (Loov;)Loov;
      // 16d: athrow
      // 16e: dload 24
      // 170: invokestatic java/lang/Math.abs (D)D
      // 173: ldc2_w 0.25
      // 176: iload 5
      // 178: ifne 1a8
      // 17b: goto 182
      // 17e: invokestatic q0r.a (Loov;)Loov;
      // 181: athrow
      // 182: dcmpl
      // 183: ifle 19a
      // 186: goto 18d
      // 189: invokestatic q0r.a (Loov;)Loov;
      // 18c: athrow
      // 18d: dload 8
      // 18f: ldc2_w 0.25
      // 192: dadd
      // 193: dstore 8
      // 195: iload 5
      // 197: ifeq 1ab
      // 19a: dload 8
      // 19c: dload 24
      // 19e: invokestatic java/lang/Math.abs (D)D
      // 1a1: goto 1a8
      // 1a4: invokestatic q0r.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: dadd
      // 1a9: dstore 8
      // 1ab: dload 24
      // 1ad: dconst_0
      // 1ae: dcmpl
      // 1af: iload 5
      // 1b1: ifne 1ff
      // 1b4: ifle 1fb
      // 1b7: goto 1be
      // 1ba: invokestatic q0r.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: dload 24
      // 1c0: invokestatic java/lang/Math.abs (D)D
      // 1c3: ldc2_w 0.25
      // 1c6: iload 5
      // 1c8: ifne 1f8
      // 1cb: goto 1d2
      // 1ce: invokestatic q0r.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: dcmpl
      // 1d3: ifle 1ea
      // 1d6: goto 1dd
      // 1d9: invokestatic q0r.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: dload 8
      // 1df: ldc2_w 0.25
      // 1e2: dsub
      // 1e3: dstore 8
      // 1e5: iload 5
      // 1e7: ifeq 1fb
      // 1ea: dload 8
      // 1ec: dload 24
      // 1ee: invokestatic java/lang/Math.abs (D)D
      // 1f1: goto 1f8
      // 1f4: invokestatic q0r.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: dsub
      // 1f9: dstore 8
      // 1fb: dload 26
      // 1fd: dconst_0
      // 1fe: dcmpg
      // 1ff: iload 5
      // 201: ifne 24d
      // 204: ifge 249
      // 207: goto 20e
      // 20a: invokestatic q0r.a (Loov;)Loov;
      // 20d: athrow
      // 20e: dload 26
      // 210: invokestatic java/lang/Math.abs (D)D
      // 213: dload 28
      // 215: iload 5
      // 217: ifne 246
      // 21a: goto 221
      // 21d: invokestatic q0r.a (Loov;)Loov;
      // 220: athrow
      // 221: dcmpl
      // 222: ifle 238
      // 225: goto 22c
      // 228: invokestatic q0r.a (Loov;)Loov;
      // 22b: athrow
      // 22c: dload 10
      // 22e: dload 28
      // 230: dadd
      // 231: dstore 10
      // 233: iload 5
      // 235: ifeq 249
      // 238: dload 10
      // 23a: dload 26
      // 23c: invokestatic java/lang/Math.abs (D)D
      // 23f: goto 246
      // 242: invokestatic q0r.a (Loov;)Loov;
      // 245: athrow
      // 246: dadd
      // 247: dstore 10
      // 249: dload 26
      // 24b: dconst_0
      // 24c: dcmpl
      // 24d: iload 5
      // 24f: ifne 277
      // 252: ifle 297
      // 255: goto 25c
      // 258: invokestatic q0r.a (Loov;)Loov;
      // 25b: athrow
      // 25c: dload 26
      // 25e: invokestatic java/lang/Math.abs (D)D
      // 261: dload 28
      // 263: iload 5
      // 265: ifne 294
      // 268: goto 26f
      // 26b: invokestatic q0r.a (Loov;)Loov;
      // 26e: athrow
      // 26f: dcmpl
      // 270: goto 277
      // 273: invokestatic q0r.a (Loov;)Loov;
      // 276: athrow
      // 277: ifle 286
      // 27a: dload 10
      // 27c: dload 28
      // 27e: dsub
      // 27f: dstore 10
      // 281: iload 5
      // 283: ifeq 297
      // 286: dload 10
      // 288: dload 26
      // 28a: invokestatic java/lang/Math.abs (D)D
      // 28d: goto 294
      // 290: invokestatic q0r.a (Loov;)Loov;
      // 293: athrow
      // 294: dsub
      // 295: dstore 10
      // 297: getstatic q0r.hhm Lc05;
      // 29a: invokevirtual Minecraft.c02 ()Lp_k;
      // 29d: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 2a0: dup
      // 2a1: dload 6
      // 2a3: dload 8
      // 2a5: dload 10
      // 2a7: bipush 1
      // 2a8: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 2ab: invokevirtual p_k.sxi (Lmz2;)V
      // 2ae: iinc 20 1
      // 2b1: iload 5
      // 2b3: ifeq 052
      // 2b6: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2649027272243181389L, -1060259112860633083L, MethodHandles.lookup().lookupClass()).a(193209307874378L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 99950905872004L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("å,ùç»\u0018\"@Ä%É´Ú¤ß_".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      hhm = Minecraft.vz1();
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
