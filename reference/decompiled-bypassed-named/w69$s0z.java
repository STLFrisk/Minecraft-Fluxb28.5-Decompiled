import java.awt.image.BufferedImage;
import java.io.File;
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

public class w69$s0z {
   private final File acl;
   private g68 ekc;
   private xan c31;
   private BufferedImage v3r;
   private gdz k18;
   public final w69 yxm;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private w69$s0z(w69 var1, File var2) {
      this.yxm = var1;
      this.acl = var2;
   }

   public void b64() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic w69$s0z.a J
      // 03: ldc2_w 128030408883884
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: aload 0
      // 0e: getfield w69$s0z.acl Ljava/io/File;
      // 11: invokevirtual java/io/File.isDirectory ()Z
      // 14: ifeq 29
      // 17: new vwy
      // 1a: dup
      // 1b: aload 0
      // 1c: getfield w69$s0z.acl Ljava/io/File;
      // 1f: invokespecial vwy.<init> (Ljava/io/File;)V
      // 22: goto 34
      // 25: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: new imx
      // 2c: dup
      // 2d: aload 0
      // 2e: getfield w69$s0z.acl Ljava/io/File;
      // 31: invokespecial imx.<init> (Ljava/io/File;)V
      // 34: putfield w69$s0z.ekc Lg68;
      // 37: aload 0
      // 38: aload 0
      // 39: getfield w69$s0z.ekc Lg68;
      // 3c: aload 0
      // 3d: getfield w69$s0z.yxm Lw69;
      // 40: getfield w69.vj6 Lif1;
      // 43: sipush 14286
      // 46: ldc2_w 6696135696167246189
      // 49: lload 1
      // 4a: lxor
      // 4b: invokedynamic j (IJ)Ljava/lang/String; bsm=w69$s0z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: nop
      // 51: invokeinterface g68.ui7 (Lif1;Ljava/lang/String;)Lz08; 3
      // 56: checkcast xan
      // 59: putfield w69$s0z.c31 Lxan;
      // 5c: aload 0
      // 5d: aload 0
      // 5e: getfield w69$s0z.ekc Lg68;
      // 61: invokeinterface g68.rry ()Ljava/awt/image/BufferedImage; 1
      // 66: putfield w69$s0z.v3r Ljava/awt/image/BufferedImage;
      // 69: goto 6e
      // 6c: astore 4
      // 6e: aload 0
      // 6f: iload 3
      // 70: ifeq 98
      // 73: getfield w69$s0z.v3r Ljava/awt/image/BufferedImage;
      // 76: ifnonnull 97
      // 79: goto 80
      // 7c: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aload 0
      // 81: aload 0
      // 82: getfield w69$s0z.yxm Lw69;
      // 85: getfield w69.zkg Lg68;
      // 88: invokeinterface g68.rry ()Ljava/awt/image/BufferedImage; 1
      // 8d: putfield w69$s0z.v3r Ljava/awt/image/BufferedImage;
      // 90: goto 97
      // 93: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96: athrow
      // 97: aload 0
      // 98: invokevirtual w69$s0z.qeh ()V
      // 9b: return
   }

   public void h00(lc5 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic w69$s0z.a J
      // 03: ldc2_w 15784927148784
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 28
      // 13: getfield w69$s0z.k18 Lgdz;
      // 16: ifnonnull 48
      // 19: goto 20
      // 1c: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: goto 28
      // 24: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 1
      // 29: sipush 12611
      // 2c: ldc2_w 3150973349552298943
      // 2f: lload 2
      // 30: lxor
      // 31: invokedynamic j (IJ)Ljava/lang/String; bsm=w69$s0z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: nop
      // 37: new p9u
      // 3a: dup
      // 3b: aload 0
      // 3c: getfield w69$s0z.v3r Ljava/awt/image/BufferedImage;
      // 3f: invokespecial p9u.<init> (Ljava/awt/image/BufferedImage;)V
      // 42: invokevirtual lc5.v5m (Ljava/lang/String;Lp9u;)Lgdz;
      // 45: putfield w69$s0z.k18 Lgdz;
      // 48: aload 1
      // 49: aload 0
      // 4a: getfield w69$s0z.k18 Lgdz;
      // 4d: invokevirtual lc5.anl (Lgdz;)V
      // 50: return
   }

   public void qeh() {
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
      // 05: getfield w69$s0z.ekc Lg68;
      // 08: iload 1
      // 09: ifne 24
      // 0c: instanceof java/io/Closeable
      // 0f: ifeq 2a
      // 12: goto 19
      // 15: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield w69$s0z.ekc Lg68;
      // 1d: goto 24
      // 20: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: checkcast java/io/Closeable
      // 27: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Closeable;)V
      // 2a: return
   }

   public g68 sdn() {
      return this.ekc;
   }

   public String _au() {
      return this.ekc.qw5();
   }

   public String g6v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic w69$s0z.a J
      // 03: ldc2_w 116480621653965
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield w69$s0z.c31 Lxan;
      // 10: iload 3
      // 11: ifeq 4a
      // 14: ifnonnull 46
      // 17: goto 1e
      // 1a: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: new java/lang/StringBuilder
      // 21: dup
      // 22: invokespecial java/lang/StringBuilder.<init> ()V
      // 25: getstatic syo.aez Lsyo;
      // 28: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2b: sipush 11708
      // 2e: ldc2_w 8937889080740909691
      // 31: lload 1
      // 32: lxor
      // 33: invokedynamic j (IJ)Ljava/lang/String; bsm=w69$s0z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: nop
      // 39: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f: goto 52
      // 42: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 0
      // 47: getfield w69$s0z.c31 Lxan;
      // 4a: invokevirtual xan.z0t ()Lekw;
      // 4d: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 52: areturn
   }

   public int oq4() {
      return this.c31._27();
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
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1d
      // 09: aload 1
      // 0a: if_acmpne 1c
      // 0d: goto 14
      // 10: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 44
      // 18: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 1
      // 1d: instanceof w69$s0z
      // 20: iload 2
      // 21: ifne 40
      // 24: ifeq 43
      // 27: goto 2e
      // 2a: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokevirtual w69$s0z.toString ()Ljava/lang/String;
      // 32: aload 1
      // 33: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 36: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 39: goto 40
      // 3c: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic w69$s0z.a J
      // 03: ldc2_w 81755551100062
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: sipush 21907
      // 0f: ldc2_w 7638197133647685888
      // 12: lload 1
      // 13: lxor
      // 14: invokedynamic j (IJ)Ljava/lang/String; bsm=w69$s0z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: nop
      // 1a: bipush 3
      // 1b: anewarray 14
      // 1e: dup
      // 1f: bipush 0
      // 20: aload 0
      // 21: getfield w69$s0z.acl Ljava/io/File;
      // 24: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 27: iload 3
      // 28: ifeq 61
      // 2b: aastore
      // 2c: dup
      // 2d: bipush 1
      // 2e: aload 0
      // 2f: getfield w69$s0z.acl Ljava/io/File;
      // 32: invokevirtual java/io/File.isDirectory ()Z
      // 35: ifeq 54
      // 38: goto 3f
      // 3b: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: sipush 24229
      // 42: ldc2_w 8729559453237027376
      // 45: lload 1
      // 46: lxor
      // 47: invokedynamic j (IJ)Ljava/lang/String; bsm=w69$s0z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: nop
      // 4d: goto 62
      // 50: invokestatic w69$s0z.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: sipush 2941
      // 57: ldc2_w 8761802515749271533
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic j (IJ)Ljava/lang/String; bsm=w69$s0z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: aastore
      // 63: dup
      // 64: bipush 2
      // 65: aload 0
      // 66: getfield w69$s0z.acl Ljava/io/File;
      // 69: invokevirtual java/io/File.lastModified ()J
      // 6c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f: aastore
      // 70: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 73: areturn
   }

   public w69$s0z(w69 var1, File var2, w69$1 var3) {
      this(var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5029890993071520767L, 5292977776272883586L, MethodHandles.lookup().lookupClass()).a(205602658461209L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 62109124831030L;
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
      String var6 = "\u008f\u0010ÚÅîé\bDÑ#ñ\u009d`\u0010x\u0088\u0010þ²2Ö8r\u008b\u008a\u0093q\u0091ù¾og\u0095\u0018\u0096:Â\fÒ\u0016i¹ò¸±V\t\u0000\u0093\u000eºå\u009dIü\u008b{K\u0018zUó\u0097z´\tÅZ\u008c\u001cV)!Tï+î\u0083Ô\"K©¦";
      int var8 = "\u008f\u0010ÚÅîé\bDÑ#ñ\u009d`\u0010x\u0088\u0010þ²2Ö8r\u008b\u008a\u0093q\u0091ù¾og\u0095\u0018\u0096:Â\fÒ\u0016i¹ò¸±V\t\u0000\u0093\u000eºå\u009dIü\u008b{K\u0018zUó\u0097z´\tÅZ\u008c\u001cV)!Tï+î\u0083Ô\"K©¦"
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

                  var6 = "À\u001fÝ\u0080\u0093DùQtìSS¶°%åP¹¥¨\u00adô\u001f[1ogë5øëÎs\u009cIê\u008aÑn4aýÔ\u0098UÌân\u00ad\u0001û\u0000Ý'¶\u0099n©ígdà\u0090É\u0015øS\u0010Þ1éüÀ\u0097\u0088\u0002ñLþ6ËÝ\u001e@44\u0010Õµ.U$\u00999ûºÎ";
                  var8 = "À\u001fÝ\u0080\u0093DùQtìSS¶°%åP¹¥¨\u00adô\u001f[1ogë5øëÎs\u009cIê\u008aÑn4aýÔ\u0098UÌân\u00ad\u0001û\u0000Ý'¶\u0099n©ígdà\u0090É\u0015øS\u0010Þ1éüÀ\u0097\u0088\u0002ñLþ6ËÝ\u001e@44\u0010Õµ.U$\u00999ûºÎ"
                     .length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24803;
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
            throw new RuntimeException("w69$s0z", var10);
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
         throw new RuntimeException("w69$s0z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
