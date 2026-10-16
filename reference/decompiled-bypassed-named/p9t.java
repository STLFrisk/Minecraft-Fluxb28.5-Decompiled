import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.IntBuffer;
import net.optifine.Mipmaps;
import net.optifine.reflect.Reflector;
import org.lwjgl.opengl.GL11;

public class p9t {
   public static final p9u ywc;
   public static final int[] dj3;

   public static int gi2() {
      return hzu.vat();
   }

   public static void d23(int var0) {
      hzu.r22(var0);
   }

   public static int xr5(int var0, BufferedImage var1) {
      return fyc(var0, var1, false, false);
   }

   public static void b0p(int var0, int[] var1, int var2, int var3) {
      ugy(var0);
      s5z(0, var1, var2, var3, 0, 0, false, false, false);
   }

   public static int[][] ydu(int param0, int param1, int[][] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: iload 0
      // 005: bipush 1
      // 006: iadd
      // 007: anewarray 59
      // 00a: astore 4
      // 00c: aload 4
      // 00e: iload 3
      // 00f: ifne 14e
      // 012: bipush 0
      // 013: aload 2
      // 014: bipush 0
      // 015: aaload
      // 016: aastore
      // 017: iload 0
      // 018: ifle 14c
      // 01b: goto 022
      // 01e: invokestatic p9t.a (Loov;)Loov;
      // 021: athrow
      // 022: bipush 0
      // 023: istore 5
      // 025: bipush 0
      // 026: istore 6
      // 028: iload 6
      // 02a: aload 2
      // 02b: bipush 0
      // 02c: aaload
      // 02d: arraylength
      // 02e: if_icmpge 068
      // 031: aload 2
      // 032: bipush 0
      // 033: aaload
      // 034: iload 6
      // 036: iaload
      // 037: bipush 24
      // 039: ishr
      // 03a: iload 3
      // 03b: ifne 069
      // 03e: iload 3
      // 03f: ifne 054
      // 042: goto 049
      // 045: invokestatic p9t.a (Loov;)Loov;
      // 048: athrow
      // 049: ifne 05a
      // 04c: goto 053
      // 04f: invokestatic p9t.a (Loov;)Loov;
      // 052: athrow
      // 053: bipush 1
      // 054: istore 5
      // 056: iload 3
      // 057: ifeq 068
      // 05a: iinc 6 1
      // 05d: iload 3
      // 05e: ifeq 028
      // 061: goto 068
      // 064: invokestatic p9t.a (Loov;)Loov;
      // 067: athrow
      // 068: bipush 1
      // 069: istore 6
      // 06b: iload 6
      // 06d: iload 0
      // 06e: if_icmpgt 14c
      // 071: aload 2
      // 072: iload 3
      // 073: ifne 14e
      // 076: iload 6
      // 078: aaload
      // 079: iload 3
      // 07a: ifne 0b0
      // 07d: goto 084
      // 080: invokestatic p9t.a (Loov;)Loov;
      // 083: athrow
      // 084: ifnull 0a2
      // 087: goto 08e
      // 08a: invokestatic p9t.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 4
      // 090: iload 6
      // 092: aload 2
      // 093: iload 6
      // 095: aaload
      // 096: aastore
      // 097: iload 3
      // 098: ifeq 145
      // 09b: goto 0a2
      // 09e: invokestatic p9t.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 4
      // 0a4: iload 6
      // 0a6: bipush 1
      // 0a7: isub
      // 0a8: aaload
      // 0a9: goto 0b0
      // 0ac: invokestatic p9t.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: astore 7
      // 0b2: aload 7
      // 0b4: arraylength
      // 0b5: bipush 2
      // 0b6: ishr
      // 0b7: newarray 10
      // 0b9: astore 8
      // 0bb: iload 1
      // 0bc: iload 6
      // 0be: ishr
      // 0bf: istore 9
      // 0c1: aload 8
      // 0c3: arraylength
      // 0c4: iload 9
      // 0c6: idiv
      // 0c7: istore 10
      // 0c9: iload 9
      // 0cb: bipush 1
      // 0cc: ishl
      // 0cd: istore 11
      // 0cf: bipush 0
      // 0d0: istore 12
      // 0d2: iload 12
      // 0d4: iload 9
      // 0d6: if_icmpge 13e
      // 0d9: bipush 0
      // 0da: iload 3
      // 0db: ifne 06d
      // 0de: istore 13
      // 0e0: iload 13
      // 0e2: iload 10
      // 0e4: if_icmpge 137
      // 0e7: bipush 2
      // 0e8: iload 12
      // 0ea: iload 13
      // 0ec: iload 11
      // 0ee: imul
      // 0ef: iadd
      // 0f0: imul
      // 0f1: istore 14
      // 0f3: aload 8
      // 0f5: iload 12
      // 0f7: iload 13
      // 0f9: iload 9
      // 0fb: imul
      // 0fc: iadd
      // 0fd: aload 7
      // 0ff: iload 14
      // 101: bipush 0
      // 102: iadd
      // 103: iaload
      // 104: aload 7
      // 106: iload 14
      // 108: bipush 1
      // 109: iadd
      // 10a: iaload
      // 10b: aload 7
      // 10d: iload 14
      // 10f: bipush 0
      // 110: iadd
      // 111: iload 11
      // 113: iadd
      // 114: iaload
      // 115: aload 7
      // 117: iload 14
      // 119: bipush 1
      // 11a: iadd
      // 11b: iload 11
      // 11d: iadd
      // 11e: iaload
      // 11f: iload 5
      // 121: invokestatic p9t.pyu (IIIIZ)I
      // 124: iastore
      // 125: iinc 13 1
      // 128: iload 3
      // 129: ifne 13a
      // 12c: iload 3
      // 12d: ifeq 0e0
      // 130: goto 137
      // 133: invokestatic p9t.a (Loov;)Loov;
      // 136: athrow
      // 137: iinc 12 1
      // 13a: iload 3
      // 13b: ifeq 0d2
      // 13e: aload 4
      // 140: iload 6
      // 142: aload 8
      // 144: aastore
      // 145: iinc 6 1
      // 148: iload 3
      // 149: ifeq 06b
      // 14c: aload 4
      // 14e: areturn
   }

   private static int pyu(int var0, int var1, int var2, int var3, boolean var4) {
      return Mipmaps.alphaBlend(var0, var1, var2, var3);
   }

   private static int ymg(int var0, int var1, int var2, int var3, int var4) {
      float var5 = (float)Math.pow((double)((float)(var0 >> var4 & 0xFF) / 255.0F), 2.2);
      float var6 = (float)Math.pow((double)((float)(var1 >> var4 & 0xFF) / 255.0F), 2.2);
      float var7 = (float)Math.pow((double)((float)(var2 >> var4 & 0xFF) / 255.0F), 2.2);
      float var8 = (float)Math.pow((double)((float)(var3 >> var4 & 0xFF) / 255.0F), 2.2);
      float var9 = (float)Math.pow((double)(var5 + var6 + var7 + var8) * 0.25, 0.45454545454545453);
      return (int)((double)var9 * 255.0);
   }

   public static void _vm(int[][] param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 7
      // 05: bipush 0
      // 06: istore 8
      // 08: iload 8
      // 0a: aload 0
      // 0b: arraylength
      // 0c: if_icmpge 57
      // 0f: aload 0
      // 10: iload 8
      // 12: aaload
      // 13: astore 9
      // 15: iload 8
      // 17: aload 9
      // 19: iload 1
      // 1a: iload 8
      // 1c: ishr
      // 1d: iload 2
      // 1e: iload 8
      // 20: ishr
      // 21: iload 3
      // 22: iload 8
      // 24: ishr
      // 25: iload 4
      // 27: iload 8
      // 29: ishr
      // 2a: iload 5
      // 2c: iload 6
      // 2e: aload 0
      // 2f: arraylength
      // 30: iload 7
      // 32: ifeq 48
      // 35: bipush 1
      // 36: if_icmple 4b
      // 39: goto 40
      // 3c: invokestatic p9t.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 48
      // 44: invokestatic p9t.a (Loov;)Loov;
      // 47: athrow
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: invokestatic p9t.s5z (I[IIIIIZZZ)V
      // 4f: iinc 8 1
      // 52: iload 7
      // 54: ifne 08
      // 57: return
   }

   private static void s5z(int var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8) {
      int var9 = 4194304 / var2;
      whl(var6, var8);
      p9o(var7);
      int var11 = 0;

      while (var11 < var2 * var3) {
         int var12 = var11 / var2;
         int var10 = Math.min(var9, var3 - var12);
         int var13 = var2 * var10;
         pof(var1, var11, var13);
         GL11.glTexSubImage2D(3553, var0, var4, var5 + var12, var2, var10, 32993, 33639, w2a);
         var11 += var2 * var10;
      }
   }

   public static int fyc(int var0, BufferedImage var1, boolean var2, boolean var3) {
      kq3(var0, var1.getWidth(), var1.getHeight());
      return awh(var0, var1, 0, 0, var2, var3);
   }

   public static void kq3(int var0, int var1, int var2) {
      xed(var0, 0, var1, var2);
   }

   public static void xed(int var0, int var1, int var2, int var3) {
      Class<p9t> var4 = p9t.class;
      if (Reflector.SplashScreen.exists()) {
         var4 = Reflector.SplashScreen.getTargetClass();
      }

      synchronized (var4) {
         d23(var0);
         ugy(var0);
      }

      try {
         if (var1 >= 0) {
            GL11.glTexParameteri(3553, 33085, var1);
            GL11.glTexParameterf(3553, 33082, 0.0F);
            GL11.glTexParameterf(3553, 33083, (float)var1);
            GL11.glTexParameterf(3553, 34049, 0.0F);
         }
      } catch (oov var9) {
         throw a(var9);
      }

      int var5 = 0;

      try {
         while (var5 <= var1) {
            GL11.glTexImage2D(3553, var5, 6408, var2 >> var5, var3 >> var5, 0, 32993, 33639, (IntBuffer)null);
            var5++;
         }
      } catch (oov var8) {
         throw a(var8);
      }
   }

   public static int awh(int var0, BufferedImage var1, int var2, int var3, boolean var4, boolean var5) {
      ugy(var0);
      xdg(var1, var2, var3, var4, var5);
      return var0;
   }

   private static void xdg(BufferedImage var0, int var1, int var2, boolean var3, boolean var4) {
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int var7 = 4194304 / var5;
      int[] var8 = _b6;
      u3_(var3);
      p9o(var4);

      for (int var9 = 0; var9 < var5 * var6; var9 += var5 * var7) {
         int var10 = var9 / var5;
         int var11 = Math.min(var7, var6 - var10);
         int var12 = var5 * var11;
         var0.getRGB(0, var10, var5, var11, var8, 0, var5);
         peo(var8, var12);
         GL11.glTexSubImage2D(3553, 0, var1, var2 + var10, var5, var11, 32993, 33639, w2a);
      }
   }

   public static void p9o(boolean var0) {
      try {
         if (var0) {
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            return;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
   }

   private static void u3_(boolean var0) {
      whl(var0, false);
   }

   public static void whl(boolean param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 0
      // 01: ifeq 34
      // 04: sipush 3553
      // 07: sipush 10241
      // 0a: iload 1
      // 0b: ifeq 1f
      // 0e: goto 15
      // 11: invokestatic p9t.a (Loov;)Loov;
      // 14: athrow
      // 15: sipush 9987
      // 18: goto 22
      // 1b: invokestatic p9t.a (Loov;)Loov;
      // 1e: athrow
      // 1f: sipush 9729
      // 22: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 25: sipush 3553
      // 28: sipush 10240
      // 2b: sipush 9729
      // 2e: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 31: goto 5c
      // 34: invokestatic hxt.lxd ()I
      // 37: istore 2
      // 38: sipush 3553
      // 3b: sipush 10241
      // 3e: iload 1
      // 3f: ifeq 4a
      // 42: iload 2
      // 43: goto 4d
      // 46: invokestatic p9t.a (Loov;)Loov;
      // 49: athrow
      // 4a: sipush 9728
      // 4d: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 50: sipush 3553
      // 53: sipush 10240
      // 56: sipush 9728
      // 59: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 5c: return
   }

   private static void peo(int[] var0, int var1) {
      pof(var0, 0, var1);
   }

   private static void pof(int[] var0, int var1, int var2) {
      int[] var3 = var0;
      if (Minecraft.vz1().oxn.rdb) {
         var3 = yxn(var0);
      }

      ((Buffer)w2a).clear();
      w2a.put(var3, var1, var2);
      ((Buffer)w2a).position(0).limit(var2);
   }

   public static void ugy(int var0) {
      hzu.t30(var0);
   }

   public static int[] ja8(y99 param0, gdz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 0b: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 10: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 13: astore 3
      // 14: aload 3
      // 15: iload 2
      // 16: ifeq 2a
      // 19: ifnonnull 29
      // 1c: goto 23
      // 1f: invokestatic p9t.a (Loov;)Loov;
      // 22: athrow
      // 23: aconst_null
      // 24: areturn
      // 25: invokestatic p9t.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 3
      // 2a: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 2d: istore 4
      // 2f: aload 3
      // 30: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 33: istore 5
      // 35: iload 4
      // 37: iload 5
      // 39: imul
      // 3a: newarray 10
      // 3c: astore 6
      // 3e: aload 3
      // 3f: bipush 0
      // 40: bipush 0
      // 41: iload 4
      // 43: iload 5
      // 45: aload 6
      // 47: bipush 0
      // 48: iload 4
      // 4a: invokevirtual java/awt/image/BufferedImage.getRGB (IIII[III)[I
      // 4d: pop
      // 4e: aload 6
      // 50: areturn
   }

   public static BufferedImage h3z(InputStream param0) {
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
      // 05: iload 1
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic p9t.a (Loov;)Loov;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic p9t.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: invokestatic javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 1d: astore 2
      // 1e: aload 0
      // 1f: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 22: goto 2c
      // 25: astore 3
      // 26: aload 0
      // 27: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 2a: aload 3
      // 2b: athrow
      // 2c: aload 2
      // 2d: areturn
   }

   public static int[] yxn(int[] var0) {
      int[] var1 = new int[var0.length];
      int var2 = 0;

      try {
         while (var2 < var0.length) {
            var1[var2] = t5j(var0[var2]);
            var2++;
         }

         return var1;
      } catch (oov var3) {
         throw a(var3);
      }
   }

   public static int t5j(int var0) {
      int var1 = var0 >> 24 & 0xFF;
      int var2 = var0 >> 16 & 0xFF;
      int var3 = var0 >> 8 & 0xFF;
      int var4 = var0 & 0xFF;
      int var5 = (var2 * 30 + var3 * 59 + var4 * 11) / 100;
      int var6 = (var2 * 30 + var3 * 70) / 100;
      int var7 = (var2 * 30 + var4 * 70) / 100;
      return var1 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   public static void ae5(int[] var0, int var1, int var2) {
      int[] var4 = new int[var1];
      int var5 = var2 / 2;
      int var10000 = OpaquePredicate.b();
      int var6 = 0;
      int var3 = var10000;

      while (var6 < var5) {
         System.arraycopy(var0, var6 * var1, var4, 0, var1);
         System.arraycopy(var0, (var2 - 1 - var6) * var1, var0, var6 * var1, var1);
         System.arraycopy(var4, 0, var0, (var2 - 1 - var6) * var1, var1);
         var6++;
         if (var3 == 0) {
            break;
         }
      }
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic org/apache/logging/log4j/LogManager.getLogger ()Lorg/apache/logging/log4j/Logger;
      // 003: putstatic p9t.v0e Lorg/apache/logging/log4j/Logger;
      // 006: ldc 4194304
      // 008: nop
      // 009: invokestatic nkx._5e (I)Ljava/nio/IntBuffer;
      // 00c: putstatic p9t.w2a Ljava/nio/IntBuffer;
      // 00f: new p9u
      // 012: dup
      // 013: bipush 16
      // 015: bipush 16
      // 017: invokespecial p9u.<init> (II)V
      // 01a: putstatic p9t.ywc Lp9u;
      // 01d: getstatic p9t.ywc Lp9u;
      // 020: invokevirtual p9u.k8b ()[I
      // 023: putstatic p9t.dj3 [I
      // 026: ldc 4194304
      // 028: nop
      // 029: newarray 10
      // 02b: putstatic p9t._b6 [I
      // 02e: ldc -16777216
      // 030: nop
      // 031: istore 0
      // 032: ldc -524040
      // 034: nop
      // 035: istore 1
      // 036: bipush 8
      // 038: newarray 10
      // 03a: dup
      // 03b: bipush 0
      // 03c: ldc -524040
      // 03e: nop
      // 03f: iastore
      // 040: dup
      // 041: bipush 1
      // 042: ldc -524040
      // 044: nop
      // 045: iastore
      // 046: dup
      // 047: bipush 2
      // 048: ldc -524040
      // 04a: nop
      // 04b: iastore
      // 04c: dup
      // 04d: bipush 3
      // 04e: ldc -524040
      // 050: nop
      // 051: iastore
      // 052: dup
      // 053: bipush 4
      // 054: ldc -524040
      // 056: nop
      // 057: iastore
      // 058: dup
      // 059: bipush 5
      // 05a: ldc -524040
      // 05c: nop
      // 05d: iastore
      // 05e: dup
      // 05f: bipush 6
      // 061: ldc -524040
      // 063: nop
      // 064: iastore
      // 065: dup
      // 066: bipush 7
      // 068: ldc -524040
      // 06a: nop
      // 06b: iastore
      // 06c: astore 2
      // 06d: bipush 8
      // 06f: newarray 10
      // 071: dup
      // 072: bipush 0
      // 073: ldc -16777216
      // 075: nop
      // 076: iastore
      // 077: dup
      // 078: bipush 1
      // 079: ldc -16777216
      // 07b: nop
      // 07c: iastore
      // 07d: dup
      // 07e: bipush 2
      // 07f: ldc -16777216
      // 081: nop
      // 082: iastore
      // 083: dup
      // 084: bipush 3
      // 085: ldc -16777216
      // 087: nop
      // 088: iastore
      // 089: dup
      // 08a: bipush 4
      // 08b: ldc -16777216
      // 08d: nop
      // 08e: iastore
      // 08f: dup
      // 090: bipush 5
      // 091: ldc -16777216
      // 093: nop
      // 094: iastore
      // 095: dup
      // 096: bipush 6
      // 098: ldc -16777216
      // 09a: nop
      // 09b: iastore
      // 09c: dup
      // 09d: bipush 7
      // 09f: ldc -16777216
      // 0a1: nop
      // 0a2: iastore
      // 0a3: astore 3
      // 0a4: aload 2
      // 0a5: arraylength
      // 0a6: istore 4
      // 0a8: bipush 0
      // 0a9: istore 5
      // 0ab: iload 5
      // 0ad: bipush 16
      // 0af: if_icmpge 0fe
      // 0b2: iload 5
      // 0b4: iload 4
      // 0b6: if_icmpge 0c8
      // 0b9: goto 0c0
      // 0bc: invokestatic p9t.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 2
      // 0c1: goto 0c9
      // 0c4: invokestatic p9t.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 3
      // 0c9: bipush 0
      // 0ca: getstatic p9t.dj3 [I
      // 0cd: bipush 16
      // 0cf: iload 5
      // 0d1: imul
      // 0d2: iload 4
      // 0d4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0d7: iload 5
      // 0d9: iload 4
      // 0db: if_icmpge 0e6
      // 0de: aload 3
      // 0df: goto 0e7
      // 0e2: invokestatic p9t.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: aload 2
      // 0e7: bipush 0
      // 0e8: getstatic p9t.dj3 [I
      // 0eb: bipush 16
      // 0ed: iload 5
      // 0ef: imul
      // 0f0: iload 4
      // 0f2: iadd
      // 0f3: iload 4
      // 0f5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f8: iinc 5 1
      // 0fb: goto 0ab
      // 0fe: getstatic p9t.ywc Lp9u;
      // 101: invokevirtual p9u.oj6 ()V
      // 104: bipush 4
      // 105: newarray 10
      // 107: putstatic p9t.rst [I
      // 10a: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
