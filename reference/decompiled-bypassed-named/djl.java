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

public class djl {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static ekw k10(File param0, String param1, int param2, int param3, oru param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic djl.a J
      // 003: ldc2_w 10036218936892
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 7
      // 00e: new java/io/File
      // 011: dup
      // 012: invokestatic Minecraft.vz1 ()Lc05;
      // 015: getfield Minecraft.glh Ljava/io/File;
      // 018: sipush 18077
      // 01b: ldc2_w 4419636358148888851
      // 01e: lload 5
      // 020: lxor
      // 021: invokedynamic m (IJ)Ljava/lang/String; bsm=djl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: nop
      // 027: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 02a: astore 8
      // 02c: aload 8
      // 02e: invokevirtual java/io/File.exists ()Z
      // 031: iload 7
      // 033: ifne 050
      // 036: ifne 04d
      // 039: goto 040
      // 03c: invokestatic djl.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 8
      // 042: invokevirtual java/io/File.mkdir ()Z
      // 045: pop
      // 046: goto 04d
      // 049: invokestatic djl.a (Loov;)Loov;
      // 04c: athrow
      // 04d: invokestatic gis.gu5 ()Z
      // 050: iload 7
      // 052: ifne 06e
      // 055: ifeq 06b
      // 058: goto 05f
      // 05b: invokestatic djl.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 4
      // 061: getfield oru.ntc I
      // 064: istore 2
      // 065: aload 4
      // 067: getfield oru.f86 I
      // 06a: istore 3
      // 06b: iload 2
      // 06c: iload 3
      // 06d: imul
      // 06e: istore 9
      // 070: getstatic djl.g8u Ljava/nio/IntBuffer;
      // 073: iload 7
      // 075: ifne 0ac
      // 078: ifnull 0a0
      // 07b: goto 082
      // 07e: invokestatic djl.a (Loov;)Loov;
      // 081: athrow
      // 082: getstatic djl.g8u Ljava/nio/IntBuffer;
      // 085: invokevirtual java/nio/IntBuffer.capacity ()I
      // 088: iload 9
      // 08a: iload 7
      // 08c: ifne 0c1
      // 08f: goto 096
      // 092: invokestatic djl.a (Loov;)Loov;
      // 095: athrow
      // 096: if_icmpge 0b6
      // 099: goto 0a0
      // 09c: invokestatic djl.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: iload 9
      // 0a2: invokestatic org/lwjgl/BufferUtils.createIntBuffer (I)Ljava/nio/IntBuffer;
      // 0a5: goto 0ac
      // 0a8: invokestatic djl.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: putstatic djl.g8u Ljava/nio/IntBuffer;
      // 0af: iload 9
      // 0b1: newarray 10
      // 0b3: putstatic djl.wns [I
      // 0b6: sipush 3333
      // 0b9: bipush 1
      // 0ba: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 0bd: sipush 3317
      // 0c0: bipush 1
      // 0c1: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 0c4: getstatic djl.g8u Ljava/nio/IntBuffer;
      // 0c7: invokevirtual java/nio/IntBuffer.clear ()Ljava/nio/Buffer;
      // 0ca: pop
      // 0cb: invokestatic gis.gu5 ()Z
      // 0ce: iload 7
      // 0d0: ifne 109
      // 0d3: ifeq 101
      // 0d6: goto 0dd
      // 0d9: invokestatic djl.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 4
      // 0df: getfield oru.mqx I
      // 0e2: invokestatic hzu.t30 (I)V
      // 0e5: sipush 3553
      // 0e8: bipush 0
      // 0e9: ldc 32993
      // 0eb: nop
      // 0ec: ldc 33639
      // 0ee: nop
      // 0ef: getstatic djl.g8u Ljava/nio/IntBuffer;
      // 0f2: invokestatic org/lwjgl/opengl/GL11.glGetTexImage (IIIILjava/nio/IntBuffer;)V
      // 0f5: iload 7
      // 0f7: ifeq 118
      // 0fa: goto 101
      // 0fd: invokestatic djl.a (Loov;)Loov;
      // 100: athrow
      // 101: bipush 0
      // 102: goto 109
      // 105: invokestatic djl.a (Loov;)Loov;
      // 108: athrow
      // 109: bipush 0
      // 10a: iload 2
      // 10b: iload 3
      // 10c: ldc 32993
      // 10e: nop
      // 10f: ldc 33639
      // 111: nop
      // 112: getstatic djl.g8u Ljava/nio/IntBuffer;
      // 115: invokestatic org/lwjgl/opengl/GL11.glReadPixels (IIIIIILjava/nio/IntBuffer;)V
      // 118: getstatic djl.g8u Ljava/nio/IntBuffer;
      // 11b: getstatic djl.wns [I
      // 11e: invokevirtual java/nio/IntBuffer.get ([I)Ljava/nio/IntBuffer;
      // 121: pop
      // 122: new java/lang/Thread
      // 125: dup
      // 126: new TokenGuard
      // 129: dup
      // 12a: iload 2
      // 12b: iload 3
      // 12c: getstatic djl.wns [I
      // 12f: invokestatic Minecraft.vz1 ()Lc05;
      // 132: invokevirtual Minecraft._d2 ()Loru;
      // 135: aload 8
      // 137: invokespecial TokenGuard.<init> (II[ILoru;Ljava/io/File;)V
      // 13a: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 13d: invokevirtual java/lang/Thread.start ()V
      // 140: new tao
      // 143: dup
      // 144: new java/lang/StringBuilder
      // 147: dup
      // 148: invokespecial java/lang/StringBuilder.<init> ()V
      // 14b: getstatic syo.jkd Lsyo;
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 151: ldc "("
      // 153: nop
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: getstatic syo.qiz Lsyo;
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 15d: getstatic syo.yn5 Lsyo;
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 163: sipush 23346
      // 166: ldc2_w 410073685142865087
      // 169: lload 5
      // 16b: lxor
      // 16c: invokedynamic m (IJ)Ljava/lang/String; bsm=djl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: nop
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 175: getstatic syo.jkd Lsyo;
      // 178: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17b: sipush 15272
      // 17e: ldc2_w 2139767655795385383
      // 181: lload 5
      // 183: lxor
      // 184: invokedynamic m (IJ)Ljava/lang/String; bsm=djl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: nop
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: getstatic syo.qiz Lsyo;
      // 190: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 193: sipush 29831
      // 196: ldc2_w 9025656531603204875
      // 199: lload 5
      // 19b: lxor
      // 19c: invokedynamic m (IJ)Ljava/lang/String; bsm=djl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: nop
      // 1a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a8: invokespecial tao.<init> (Ljava/lang/String;)V
      // 1ab: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8074288075605515052L, 4898853094118994511L, MethodHandles.lookup().lookupClass()).a(52495735586885L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 31112561664771L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "Ïgå\u0016æl¬ûr\u007fðçnÓ¹\u009d\u000e\\\u001eêÄ¼\u0090t\u0000é¤\u0015ù:Î=\u0010¼\u00ad/+Þ\u0012Óû\u001cÞ0?û)\u00851";
      int var8 = "Ïgå\u0016æl¬ûr\u007fðçnÓ¹\u009d\u000e\\\u001eêÄ¼\u0090t\u0000é¤\u0015ù:Î=\u0010¼\u00ad/+Þ\u0012Óû\u001cÞ0?û)\u00851".length();
      char var5 = ' ';
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
                     c = new String[4];
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

                  var6 = "kÍ\u0014\u009a@\u0006¹\u0082!UY©\u0012³\u0080pÓÏÙÆörFâ\u000bÞî7úË´³ÏTJ¢Ñ\u0011ÿ\u001a\u0010/¸g\u0016Ë~\"w-¾\u000eè\rÉ¿\f";
                  var8 = "kÍ\u0014\u009a@\u0006¹\u0082!UY©\u0012³\u0080pÓÏÙÆörFâ\u000bÞî7úË´³ÏTJ¢Ñ\u0011ÿ\u001a\u0010/¸g\u0016Ë~\"w-¾\u000eè\rÉ¿\f".length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2565;
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
            throw new RuntimeException("djl", var10);
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
         throw new RuntimeException("djl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
