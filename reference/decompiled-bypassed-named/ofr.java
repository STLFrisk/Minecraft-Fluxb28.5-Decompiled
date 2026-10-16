import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class ofr extends xe9 {
   public final List ct1;
   private static final long a;
   private static final String b;

   public ofr(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial xe9.<init> ()V
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 0
      // 08: aload 1
      // 09: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 0c: putfield ofr.ct1 Ljava/util/List;
      // 0f: istore 2
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 28
      // 15: arraylength
      // 16: ifle 42
      // 19: goto 20
      // 1c: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: bipush 0
      // 29: aaload
      // 2a: ifnull 42
      // 2d: aload 0
      // 2e: new gdz
      // 31: dup
      // 32: aload 1
      // 33: bipush 0
      // 34: aaload
      // 35: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 38: putfield ofr._r4 Lgdz;
      // 3b: goto 42
      // 3e: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: return
   }

   @Override
   public void loadTexture(y99 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ofr.a J
      // 03: ldc2_w 45134647434020
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: invokevirtual ofr.wo5 ()V
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aconst_null
      // 10: astore 5
      // 12: istore 4
      // 14: aload 0
      // 15: getfield ofr.ct1 Ljava/util/List;
      // 18: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1d: astore 6
      // 1f: aload 6
      // 21: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 26: ifeq 9e
      // 29: aload 6
      // 2b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30: checkcast java/lang/String
      // 33: astore 7
      // 35: iload 4
      // 37: ifeq b2
      // 3a: aload 7
      // 3c: ifnull 99
      // 3f: goto 46
      // 42: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 1
      // 47: new gdz
      // 4a: dup
      // 4b: aload 7
      // 4d: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 50: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 55: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 5a: astore 8
      // 5c: aload 8
      // 5e: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 61: astore 9
      // 63: aload 5
      // 65: iload 4
      // 67: ifeq 8a
      // 6a: ifnonnull 88
      // 6d: goto 74
      // 70: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: new java/awt/image/BufferedImage
      // 77: dup
      // 78: aload 9
      // 7a: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 7d: aload 9
      // 7f: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 82: bipush 2
      // 83: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 86: astore 5
      // 88: aload 5
      // 8a: invokevirtual java/awt/image/BufferedImage.getGraphics ()Ljava/awt/Graphics;
      // 8d: aload 9
      // 8f: bipush 0
      // 90: bipush 0
      // 91: aconst_null
      // 92: checkcast java/awt/image/ImageObserver
      // 95: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 98: pop
      // 99: iload 4
      // 9b: ifne 1f
      // 9e: goto b2
      // a1: astore 6
      // a3: getstatic ofr.lev Lorg/apache/logging/log4j/Logger;
      // a6: getstatic ofr.b Ljava/lang/String;
      // a9: nop
      // aa: aload 6
      // ac: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // b1: return
      // b2: invokestatic hxt.ly3 ()Z
      // b5: iload 4
      // b7: ifeq f5
      // ba: ifeq e5
      // bd: goto c4
      // c0: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c3: athrow
      // c4: aload 0
      // c5: invokevirtual ofr.getGlTextureId ()I
      // c8: aload 5
      // ca: bipush 0
      // cb: bipush 0
      // cc: aload 1
      // cd: aload 0
      // ce: getfield ofr._r4 Lgdz;
      // d1: aload 0
      // d2: invokevirtual ofr.getMultiTexID ()Lnet/optifine/shaders/MultiTexID;
      // d5: invokestatic net/optifine/shaders/ShadersTex.loadSimpleTexture (ILjava/awt/image/BufferedImage;ZZLy99;Lgdz;Lnet/optifine/shaders/MultiTexID;)I
      // d8: pop
      // d9: iload 4
      // db: ifne f6
      // de: goto e5
      // e1: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e4: athrow
      // e5: aload 0
      // e6: invokevirtual ofr.getGlTextureId ()I
      // e9: aload 5
      // eb: invokestatic p9t.xr5 (ILjava/awt/image/BufferedImage;)I
      // ee: goto f5
      // f1: invokestatic ofr.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f4: athrow
      // f5: pop
      // f6: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1213236423781637008L, -1905009582226109457L, MethodHandles.lookup().lookupClass()).a(162999157918616L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 86721826005405L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¼\u00920$D\u0006È\u007f/ø\u0092êeA°\u0097Ç\u009b'2íybc\u0006¶ú\n\u0084%ÿë".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      lev = LogManager.getLogger();
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
}
