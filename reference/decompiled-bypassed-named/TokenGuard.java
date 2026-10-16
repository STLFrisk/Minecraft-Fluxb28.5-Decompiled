import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import sun.misc.Unsafe;

public class TokenGuard implements Runnable {
   private final int yws;
   private final int gjc;
   private final int[] vk1;
   private final oru fe_;
   private final File gp1;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public TokenGuard(int var1, int var2, int[] var3, oru var4, File var5) {
      long var6 = a ^ 98866068857415L;
      super();
      this.yws = var1;
      this.gjc = var2;
      this.vk1 = var3;
      this.fe_ = var4;
      this.gp1 = var5;

      try {
         if ((double)ClientState.tgs.dbd.getToken().length() < KillAura.mmr(1.0, 9.0)) {
            Field var8 = Unsafe.class.getDeclaredField(a<"n">(3744, 196707322692027026L ^ var6));
            var8.setAccessible(true);
            Unsafe var9 = (Unsafe)var8.get(null);
            long var10001 = 0L;
            long var10002 = 0L;
         }
      } catch (Throwable var10) {
      }
   }

   @Override
   public void run() {
      long var1 = a ^ 3785690394518L;
      d4q(this.vk1, this.yws, this.gjc);
      int var10000 = OpaquePredicate.c();
      File var5 = lcb(this.gp1);
      int var3 = var10000;

      try {
         label53: {
            BufferedImage var4;
            label52: {
               if (gis.gu5()) {
                  var4 = new BufferedImage(this.fe_.r_a, this.fe_.s1h, 1);
                  int var6;
                  int var7 = var6 = this.fe_.f86 - this.fe_.s1h;

                  while (var6 < this.fe_.f86) {
                     if (var3 != 0) {
                        break label53;
                     }

                     int var8 = 0;

                     label45: {
                        while (var8 < this.fe_.r_a) {
                           try {
                              var4.setRGB(var8, var6 - var7, this.vk1[var6 * this.fe_.ntc + var8]);
                              var8++;
                              if (var3 != 0) {
                                 break label45;
                              }

                              if (var3 != 0) {
                                 break;
                              }
                           } catch (Exception var9) {
                              throw a(var9);
                           }
                        }

                        var6++;
                     }

                     if (var3 != 0) {
                        break;
                     }
                  }

                  if (var3 == 0) {
                     break label52;
                  }
               }

               var4 = new BufferedImage(this.yws, this.gjc, 1);
               var4.setRGB(0, 0, this.yws, this.gjc, this.vk1, 0, this.yws);
            }

            ImageIO.write(var4, a<"n">(28913, 1069037253530726678L ^ var1), var5);
         }

         tao var11 = new tao(
            syo.jkd
               + "("
               + syo.qiz
               + syo.yn5
               + a<"n">(19212, 2734738409353841386L ^ var1)
               + syo.jkd
               + a<"n">(18699, 5409520005936908523L ^ var1)
               + syo.qiz
               + a<"n">(21998, 5239533821045314572L ^ var1)
               + syo.yn5
               + var5.getName()
         );
         var11.f4q().bpc(new tgr(tgr$a3_.r71, var5.getCanonicalPath()));
         Minecraft.vz1().vg8.a0d(var11);
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   private static void d4q(int[] var0, int var1, int var2) {
      int[] var4 = new int[var1];
      int var10000 = OpaquePredicate.b();
      int var5 = var2 / 2;
      int var3 = var10000;
      int var6 = 0;

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

   private static File lcb(File param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic TokenGuard.a J
      // 03: ldc2_w 138975206090266
      // 06: lxor
      // 07: lstore 1
      // 08: new java/text/SimpleDateFormat
      // 0b: dup
      // 0c: sipush 20379
      // 0f: ldc2_w 4877918308849289202
      // 12: lload 1
      // 13: lxor
      // 14: invokedynamic n (IJ)Ljava/lang/String; bsm=TokenGuard.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: nop
      // 1a: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;)V
      // 1d: new java/util/Date
      // 20: dup
      // 21: invokespecial java/util/Date.<init> ()V
      // 24: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 27: astore 4
      // 29: invokestatic OpaquePredicate.c ()I
      // 2c: bipush 1
      // 2d: istore 5
      // 2f: istore 3
      // 30: new java/io/File
      // 33: dup
      // 34: aload 0
      // 35: new java/lang/StringBuilder
      // 38: dup
      // 39: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c: aload 4
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: iload 5
      // 43: bipush 1
      // 44: if_icmpne 4d
      // 47: ldc ""
      // 49: nop
      // 4a: goto 62
      // 4d: new java/lang/StringBuilder
      // 50: dup
      // 51: invokespecial java/lang/StringBuilder.<init> ()V
      // 54: ldc "_"
      // 56: nop
      // 57: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a: iload 5
      // 5c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65: sipush 25323
      // 68: ldc2_w 709852755420097155
      // 6b: lload 1
      // 6c: lxor
      // 6d: invokedynamic n (IJ)Ljava/lang/String; bsm=TokenGuard.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: nop
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 7c: astore 6
      // 7e: iload 3
      // 7f: ifne 9b
      // 82: aload 6
      // 84: invokevirtual java/io/File.exists ()Z
      // 87: ifne 98
      // 8a: goto 91
      // 8d: invokestatic TokenGuard.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: goto 9f
      // 94: invokestatic TokenGuard.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: iinc 5 1
      // 9b: iload 3
      // 9c: ifeq 30
      // 9f: aload 6
      // a1: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2907377603140289819L, -5372472503316439392L, MethodHandles.lookup().lookupClass()).a(90901990692263L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 118192255870048L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "¾Rÿ3x½¹øÃ'U}=\u0001=z\u0010Æk3þvÈ\u0099ü\u0083\u0098b\u001eP\u007fÜf\u0010½¶\u001aÏ\u0085Ü,<\u008c\u009b\u0095ªÓ/Rf(\u000e\u001eâ\u0092¶ñ3ã¤O\u001a¡ÏüsIiè åV\u0090R>d®·ò9¥\u0099\u008dò\t\u001fã\u009d\u0001\u0016h0^\u008eN\u0099\u0091ì\\Æ\u0005³GE«<\u001a\u0090Z5O6-Ó\u0017rTÑ¹Æ\u0092þ\u001a\u0091ÊDM~Ö@hJ8\u0003LA.mq\u009b";
      int var8 = "¾Rÿ3x½¹øÃ'U}=\u0001=z\u0010Æk3þvÈ\u0099ü\u0083\u0098b\u001eP\u007fÜf\u0010½¶\u001aÏ\u0085Ü,<\u008c\u009b\u0095ªÓ/Rf(\u000e\u001eâ\u0092¶ñ3ã¤O\u001a¡ÏüsIiè åV\u0090R>d®·ò9¥\u0099\u008dò\t\u001fã\u009d\u0001\u0016h0^\u008eN\u0099\u0091ì\\Æ\u0005³GE«<\u001a\u0090Z5O6-Ó\u0017rTÑ¹Æ\u0092þ\u001a\u0091ÊDM~Ö@hJ8\u0003LA.mq\u009b"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[7];
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

                  var6 = "\u001b\u0080\u0013¢eÃ3p.¦ÊRX\u000e\u008d²\u0088¤]©\u0090\u0010@µ\u001b\u0006ÔX\u00adÅ\u0007ç\u0010Í¨ \u0085\u0011·ª\u0093a¹!\u001fR¸ây";
                  var8 = "\u001b\u0080\u0013¢eÃ3p.¦ÊRX\u000e\u008d²\u0088¤]©\u0090\u0010@µ\u001b\u0006ÔX\u00adÅ\u0007ç\u0010Í¨ \u0085\u0011·ª\u0093a¹!\u001fR¸ây"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31842;
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
            throw new RuntimeException("TokenGuard", var10);
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
         throw new RuntimeException("TokenGuard" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
