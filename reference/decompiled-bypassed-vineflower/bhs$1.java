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

public class bhs$1 extends Thread {
   public final bhs xs1;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public bhs$1(bhs var1, String var2) {
      super(var2);
      this.xs1 = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bhs$1.a J
      // 003: ldc2_w 92320787756803
      // 006: lxor
      // 007: lstore 1
      // 008: aconst_null
      // 009: astore 4
      // 00b: invokestatic t9d.b ()I
      // 00e: invokestatic bhs.beq ()Lorg/apache/logging/log4j/Logger;
      // 011: sipush 26137
      // 014: ldc2_w 8998257022736640985
      // 017: lload 1
      // 018: lxor
      // 019: invokedynamic s (IJ)Ljava/lang/String; bsm=bhs$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: nop
      // 01f: bipush 2
      // 020: anewarray 34
      // 023: dup
      // 024: bipush 0
      // 025: aload 0
      // 026: getfield bhs$1.xs1 Lbhs;
      // 029: invokestatic bhs.cfu (Lbhs;)Ljava/lang/String;
      // 02c: aastore
      // 02d: dup
      // 02e: bipush 1
      // 02f: aload 0
      // 030: getfield bhs$1.xs1 Lbhs;
      // 033: invokestatic bhs.bvz (Lbhs;)Ljava/io/File;
      // 036: aastore
      // 037: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 03c: istore 3
      // 03d: aload 0
      // 03e: getfield bhs$1.xs1 Lbhs;
      // 041: iload 3
      // 042: ifeq 05d
      // 045: invokestatic bhs.w3b (Lbhs;)Z
      // 048: ifeq 064
      // 04b: goto 052
      // 04e: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: aload 0
      // 053: getfield bhs$1.xs1 Lbhs;
      // 056: goto 05d
      // 059: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: invokestatic bhs.qi7 (Lbhs;)V
      // 060: iload 3
      // 061: ifne 20f
      // 064: new java/net/URL
      // 067: dup
      // 068: aload 0
      // 069: getfield bhs$1.xs1 Lbhs;
      // 06c: invokestatic bhs.cfu (Lbhs;)Ljava/lang/String;
      // 06f: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 072: invokestatic c05.vz1 ()Lc05;
      // 075: invokevirtual c05.snb ()Ljava/net/Proxy;
      // 078: invokevirtual java/net/URL.openConnection (Ljava/net/Proxy;)Ljava/net/URLConnection;
      // 07b: checkcast java/net/HttpURLConnection
      // 07e: astore 4
      // 080: aload 4
      // 082: bipush 1
      // 083: invokevirtual java/net/HttpURLConnection.setDoInput (Z)V
      // 086: aload 4
      // 088: bipush 0
      // 089: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 08c: aload 4
      // 08e: invokevirtual java/net/HttpURLConnection.connect ()V
      // 091: aload 4
      // 093: iload 3
      // 094: ifeq 0b1
      // 097: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 09a: bipush 100
      // 09c: idiv
      // 09d: bipush 2
      // 09e: if_icmpeq 0ef
      // 0a1: goto 0a8
      // 0a4: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: aload 4
      // 0aa: goto 0b1
      // 0ad: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: iload 3
      // 0b2: ifeq 0d4
      // 0b5: invokevirtual java/net/HttpURLConnection.getErrorStream ()Ljava/io/InputStream;
      // 0b8: ifnull 0d2
      // 0bb: goto 0c2
      // 0be: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 4
      // 0c4: invokevirtual java/net/HttpURLConnection.getErrorStream ()Ljava/io/InputStream;
      // 0c7: invokestatic hxt.d2_ (Ljava/io/InputStream;)[B
      // 0ca: pop
      // 0cb: goto 0d2
      // 0ce: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: aload 4
      // 0d4: iload 3
      // 0d5: ifeq 0e4
      // 0d8: ifnull 0e7
      // 0db: goto 0e2
      // 0de: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: aload 4
      // 0e4: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0e7: aload 0
      // 0e8: getfield bhs$1.xs1 Lbhs;
      // 0eb: invokestatic bhs.snf (Lbhs;)V
      // 0ee: return
      // 0ef: aload 0
      // 0f0: getfield bhs$1.xs1 Lbhs;
      // 0f3: invokestatic bhs.bvz (Lbhs;)Ljava/io/File;
      // 0f6: iload 3
      // 0f7: ifeq 121
      // 0fa: ifnull 12a
      // 0fd: goto 104
      // 100: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: aload 4
      // 106: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 109: aload 0
      // 10a: getfield bhs$1.xs1 Lbhs;
      // 10d: invokestatic bhs.bvz (Lbhs;)Ljava/io/File;
      // 110: invokestatic org/apache/commons/io/FileUtils.copyInputStreamToFile (Ljava/io/InputStream;Ljava/io/File;)V
      // 113: aload 0
      // 114: getfield bhs$1.xs1 Lbhs;
      // 117: invokestatic bhs.bvz (Lbhs;)Ljava/io/File;
      // 11a: goto 121
      // 11d: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: invokestatic javax/imageio/ImageIO.read (Ljava/io/File;)Ljava/awt/image/BufferedImage;
      // 124: astore 5
      // 126: iload 3
      // 127: ifne 134
      // 12a: aload 4
      // 12c: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 12f: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 132: astore 5
      // 134: aload 0
      // 135: getfield bhs$1.xs1 Lbhs;
      // 138: iload 3
      // 139: ifeq 15d
      // 13c: invokestatic bhs.ef_ (Lbhs;)Lji7;
      // 13f: ifnull 159
      // 142: goto 149
      // 145: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: aload 0
      // 14a: getfield bhs$1.xs1 Lbhs;
      // 14d: invokestatic bhs.ef_ (Lbhs;)Lji7;
      // 150: aload 5
      // 152: invokeinterface ji7.parseUserSkin (Ljava/awt/image/BufferedImage;)Ljava/awt/image/BufferedImage; 2
      // 157: astore 5
      // 159: aload 0
      // 15a: getfield bhs$1.xs1 Lbhs;
      // 15d: aload 5
      // 15f: invokevirtual bhs.asj (Ljava/awt/image/BufferedImage;)V
      // 162: iload 3
      // 163: ifeq 17e
      // 166: aload 4
      // 168: ifnull 177
      // 16b: aload 4
      // 16d: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 170: goto 177
      // 173: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: aload 0
      // 178: getfield bhs$1.xs1 Lbhs;
      // 17b: invokestatic bhs.snf (Lbhs;)V
      // 17e: goto 20f
      // 181: astore 5
      // 183: invokestatic bhs.beq ()Lorg/apache/logging/log4j/Logger;
      // 186: new java/lang/StringBuilder
      // 189: dup
      // 18a: invokespecial java/lang/StringBuilder.<init> ()V
      // 18d: sipush 8263
      // 190: ldc2_w 3896872004471451012
      // 193: lload 1
      // 194: lxor
      // 195: invokedynamic s (IJ)Ljava/lang/String; bsm=bhs$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: nop
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19e: aload 5
      // 1a0: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1a3: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a9: sipush 20636
      // 1ac: ldc2_w 6969500492914433374
      // 1af: lload 1
      // 1b0: lxor
      // 1b1: invokedynamic s (IJ)Ljava/lang/String; bsm=bhs$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: nop
      // 1b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ba: aload 5
      // 1bc: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 1bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c5: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 1ca: iload 3
      // 1cb: ifeq 1e6
      // 1ce: aload 4
      // 1d0: ifnull 1df
      // 1d3: aload 4
      // 1d5: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1d8: goto 1df
      // 1db: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: aload 0
      // 1e0: getfield bhs$1.xs1 Lbhs;
      // 1e3: invokestatic bhs.snf (Lbhs;)V
      // 1e6: return
      // 1e7: astore 6
      // 1e9: iload 3
      // 1ea: ifeq 20c
      // 1ed: aload 4
      // 1ef: ifnull 205
      // 1f2: goto 1f9
      // 1f5: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f8: athrow
      // 1f9: aload 4
      // 1fb: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1fe: goto 205
      // 201: invokestatic bhs$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: aload 0
      // 206: getfield bhs$1.xs1 Lbhs;
      // 209: invokestatic bhs.snf (Lbhs;)V
      // 20c: aload 6
      // 20e: athrow
      // 20f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4226482553779109216L, 1280565028230800954L, MethodHandles.lookup().lookupClass()).a(47896465982543L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 21900409270574L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "ÇbØ\u00804p¹´O\u008aXç\u0098\u0012\u0087\u0001@\u00871\u0000{|1à\u009f\u0005)7R,ø(¹\u0096\u0085r-\u0088PíòÔäÝ\u0003\nNV\u0012æf\u008e\u0017úWuµIíÈ\u0004j\u0095¤áîvëü.©B\u0083\\À¾î³\u0019wD@\u0083A¯ñë9\u009dÖ\u0081J,\u009dôÌ:Ë\u0083\u0085t(©¬èÖn\u0017\u0095Q?Èò\"<)läÍ]E\u0018¾wXF6'ï\u0002ì;\u0083a½G@§\u001fr\u009aú·\t\u0014\u0007";
      int var8 = "ÇbØ\u00804p¹´O\u008aXç\u0098\u0012\u0087\u0001@\u00871\u0000{|1à\u009f\u0005)7R,ø(¹\u0096\u0085r-\u0088PíòÔäÝ\u0003\nNV\u0012æf\u008e\u0017úWuµIíÈ\u0004j\u0095¤áîvëü.©B\u0083\\À¾î³\u0019wD@\u0083A¯ñë9\u009dÖ\u0081J,\u009dôÌ:Ë\u0083\u0085t(©¬èÖn\u0017\u0095Q?Èò\"<)läÍ]E\u0018¾wXF6'ï\u0002ì;\u0083a½G@§\u001fr\u009aú·\t\u0014\u0007"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12843;
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
            throw new RuntimeException("bhs$1", var10);
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
         throw new RuntimeException("bhs$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
