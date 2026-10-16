import java.awt.Canvas;
import java.awt.Color;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

public class enq {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void skv(ity var0, Logger var1) {
      long var2 = a ^ 26544813855682L;

      try {
         if (!haf()) {
            return;
         }
      } catch (Exception var15) {
         throw a(var15);
      }

      l87 = new JFrame(a<"x">(10584, 5160420288466624526L ^ var2));
      Canvas var4 = new Canvas();
      var4.setBackground(new Color(16, 16, 16));
      Display.setParent(var4);
      Minecraft var5 = Minecraft.vz1();
      var4.setSize(var5.pfr, var5.ry7);
      l87.add(var4);
      l87.setDefaultCloseOperation(3);
      l87.pack();
      l87.setLocationRelativeTo(null);
      InputStream var6 = null;
      InputStream var7 = null;

      try {
         var6 = var0.bxo(new gdz(a<"x">(16576, 3136419547545356691L ^ var2)));
         var7 = var0.bxo(new gdz(a<"x">(23719, 5794256436105926133L ^ var2)));
         ArrayList var8 = new ArrayList();
         var8.add(ImageIO.read(var6));
         var8.add(ImageIO.read(var7));
         l87.setIconImages(var8);
      } catch (Exception var13) {
         var1.error(a<"x">(13778, 5528644063130598533L ^ var2), var13);
      } finally {
         IOUtils.closeQuietly(var6);
         IOUtils.closeQuietly(var7);
      }

      l87.setVisible(true);
   }

   private static boolean haf() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic enq.a J
      // 03: ldc2_w 4946514816023
      // 06: lxor
      // 07: lstore 0
      // 08: new java/io/File
      // 0b: dup
      // 0c: new java/lang/StringBuilder
      // 0f: dup
      // 10: invokespecial java/lang/StringBuilder.<init> ()V
      // 13: invokestatic Minecraft.vz1 ()Lc05;
      // 16: getfield Minecraft.glh Ljava/io/File;
      // 19: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c: sipush 6344
      // 1f: ldc2_w 2979093548484816460
      // 22: lload 0
      // 23: lxor
      // 24: invokedynamic x (IJ)Ljava/lang/String; bsm=enq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: nop
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 33: astore 3
      // 34: invokestatic OpaquePredicate.c ()I
      // 37: bipush 0
      // 38: istore 4
      // 3a: istore 2
      // 3b: aload 3
      // 3c: iload 2
      // 3d: ifne 55
      // 40: invokevirtual java/io/File.exists ()Z
      // 43: ifne 58
      // 46: goto 4d
      // 49: invokestatic enq.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 3
      // 4e: goto 55
      // 51: invokestatic enq.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: invokestatic enq.wm7 (Ljava/io/File;)V
      // 58: new java/io/BufferedReader
      // 5b: dup
      // 5c: new java/io/FileReader
      // 5f: dup
      // 60: aload 3
      // 61: invokespecial java/io/FileReader.<init> (Ljava/io/File;)V
      // 64: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 67: astore 5
      // 69: aload 5
      // 6b: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 6e: astore 6
      // 70: aload 5
      // 72: invokevirtual java/io/BufferedReader.close ()V
      // 75: invokestatic Minecraft.vz1 ()Lc05;
      // 78: pop
      // 79: aload 6
      // 7b: sipush 19189
      // 7e: ldc2_w 7518242605715733616
      // 81: lload 0
      // 82: lxor
      // 83: invokedynamic x (IJ)Ljava/lang/String; bsm=enq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: nop
      // 89: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8c: iload 2
      // 8d: ifne 9d
      // 90: ifeq af
      // 93: goto 9a
      // 96: invokestatic enq.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: getstatic Minecraft.go6 Z
      // 9d: iload 2
      // 9e: ifne ac
      // a1: ifne af
      // a4: goto ab
      // a7: invokestatic enq.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa: athrow
      // ab: bipush 1
      // ac: goto b0
      // af: bipush 0
      // b0: istore 4
      // b2: goto bc
      // b5: astore 5
      // b7: aload 5
      // b9: invokevirtual java/io/IOException.printStackTrace ()V
      // bc: iload 4
      // be: ireturn
   }

   private static void wm7(File param0) {
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
      // 05: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 08: invokevirtual java/io/File.exists ()Z
      // 0b: iload 1
      // 0c: ifne 27
      // 0f: ifne 28
      // 12: goto 19
      // 15: invokestatic enq.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 1d: invokevirtual java/io/File.mkdirs ()Z
      // 20: goto 27
      // 23: invokestatic enq.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: pop
      // 28: new java/io/PrintWriter
      // 2b: dup
      // 2c: new java/io/FileWriter
      // 2f: dup
      // 30: aload 0
      // 31: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 34: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 37: astore 2
      // 38: aload 2
      // 39: getstatic Minecraft.go6 Z
      // 3c: iload 1
      // 3d: ifne 4b
      // 40: ifne 4e
      // 43: goto 4a
      // 46: invokestatic enq.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: invokestatic java/lang/Boolean.toString (Z)Ljava/lang/String;
      // 52: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 55: aload 2
      // 56: invokevirtual java/io/PrintWriter.close ()V
      // 59: goto 61
      // 5c: astore 2
      // 5d: aload 2
      // 5e: invokevirtual java/io/IOException.printStackTrace ()V
      // 61: return
   }

   public static void h43() {
      int var0 = OpaquePredicate.b();

      JFrame var10000;
      label20: {
         try {
            var10000 = l87;
            if (var0 == 0) {
               break label20;
            }

            if (l87 == null) {
               return;
            }
         } catch (oov var1) {
            throw a(var1);
         }

         var10000 = l87;
      }

      var10000.setExtendedState(6);
   }

   public static JFrame _et() {
      return l87;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2288731809165656679L, -985852248436487066L, MethodHandles.lookup().lookupClass()).a(57418515993770L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 53499105653318L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "sÑüUß4cêÈØÈv¢\nf¥¢}\u0095c}àÍ\u009bÕäÒÀ½ù¶ìsçÙü\u001bq\u008c\u0094(YDÑ5îwÆ\u0089\u000e/*¡\u001dA±\u0088ja\u0094<.61z½ÃÓ>\u009cæs\u0086c³þ{\u0019Mêe8coOM)\u0087þ\u0002W\u0000³³¨\u001aBÿ\u00139\u001d¹Ý\f\u008dÉ'\u0006*©¤åW\u001fãâÝw²l±Üñ\u0099I,ÆZßÈÛ«\u0089û\u0003Ú6Ø\u0010g\u0084\u0086W×ÅX\u0099\u0087¸\u000f¸ß\u008ff\n";
      int var8 = "sÑüUß4cêÈØÈv¢\nf¥¢}\u0095c}àÍ\u009bÕäÒÀ½ù¶ìsçÙü\u001bq\u008c\u0094(YDÑ5îwÆ\u0089\u000e/*¡\u001dA±\u0088ja\u0094<.61z½ÃÓ>\u009cæs\u0086c³þ{\u0019Mêe8coOM)\u0087þ\u0002W\u0000³³¨\u001aBÿ\u00139\u001d¹Ý\f\u008dÉ'\u0006*©¤åW\u001fãâÝw²l±Üñ\u0099I,ÆZßÈÛ«\u0089û\u0003Ú6Ø\u0010g\u0084\u0086W×ÅX\u0099\u0087¸\u000f¸ß\u008ff\n"
         .length();
      char var5 = '(';
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
                     c = new String[6];
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

                  var6 = "ß-·Iâ§3Î )ÿLÔ\u0096ªö\u008f \u0016\u009a{º\u0085nx\u00adÁåö|Z\u001aÞ·E»Ís\\Ä Sp²j¤â<±Ã\f\u0097.Z\u007f\u001c\u001b³íÔrE,¼\u009dzm\u008c¾<\u0099:á";
                  var8 = "ß-·Iâ§3Î )ÿLÔ\u0096ªö\u008f \u0016\u009a{º\u0085nx\u00adÁåö|Z\u001aÞ·E»Ís\\Ä Sp²j¤â<±Ã\f\u0097.Z\u007f\u001c\u001b³íÔrE,¼\u009dzm\u008c¾<\u0099:á"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8628;
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
            throw new RuntimeException("enq", var10);
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
         throw new RuntimeException("enq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
