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
import org.apache.logging.log4j.LogManager;

public class xfj extends xe9 {
   public final gdz h9l;
   public gdz cch;
   public boolean n4_;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public xfj(gdz var1) {
      this.h9l = var1;
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
      // 000: getstatic xfj.b J
      // 003: ldc2_w 11651287059822
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: invokevirtual xfj.wo5 ()V
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: aconst_null
      // 010: astore 5
      // 012: istore 4
      // 014: aload 1
      // 015: aload 0
      // 016: getfield xfj.h9l Lgdz;
      // 019: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 01e: astore 6
      // 020: aload 6
      // 022: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 027: astore 5
      // 029: aload 5
      // 02b: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 02e: astore 7
      // 030: bipush 0
      // 031: istore 8
      // 033: bipush 0
      // 034: istore 9
      // 036: aload 6
      // 038: invokeinterface yaa.z75 ()Z 1
      // 03d: iload 4
      // 03f: ifne 0b9
      // 042: ifeq 0b6
      // 045: goto 04c
      // 048: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04b: athrow
      // 04c: aload 6
      // 04e: sipush 4146
      // 051: ldc2_w 1184753387460697532
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic s (IJ)Ljava/lang/String; bsm=xfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: nop
      // 05c: invokeinterface yaa.yrs (Ljava/lang/String;)Lz08; 2
      // 061: checkcast yvh
      // 064: astore 10
      // 066: aload 10
      // 068: iload 4
      // 06a: ifne 080
      // 06d: ifnull 085
      // 070: goto 077
      // 073: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 076: athrow
      // 077: aload 10
      // 079: invokevirtual yvh.a3n ()Z
      // 07c: istore 8
      // 07e: aload 10
      // 080: invokevirtual yvh.nox ()Z
      // 083: istore 9
      // 085: goto 0b6
      // 088: astore 10
      // 08a: getstatic xfj.t5j Lorg/apache/logging/log4j/Logger;
      // 08d: new java/lang/StringBuilder
      // 090: dup
      // 091: invokespecial java/lang/StringBuilder.<init> ()V
      // 094: sipush 18668
      // 097: ldc2_w 6796229594899662179
      // 09a: lload 2
      // 09b: lxor
      // 09c: invokedynamic s (IJ)Ljava/lang/String; bsm=xfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: aload 0
      // 0a6: getfield xfj.h9l Lgdz;
      // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0af: aload 10
      // 0b1: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 0b6: invokestatic hxt.ly3 ()Z
      // 0b9: iload 4
      // 0bb: ifne 0ff
      // 0be: ifeq 0eb
      // 0c1: goto 0c8
      // 0c4: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: invokevirtual xfj.getGlTextureId ()I
      // 0cc: aload 7
      // 0ce: iload 8
      // 0d0: iload 9
      // 0d2: aload 1
      // 0d3: aload 0
      // 0d4: getfield xfj.h9l Lgdz;
      // 0d7: aload 0
      // 0d8: invokevirtual xfj.getMultiTexID ()Lnet/optifine/shaders/MultiTexID;
      // 0db: invokestatic net/optifine/shaders/ShadersTex.loadSimpleTexture (ILjava/awt/image/BufferedImage;ZZLy99;Lgdz;Lnet/optifine/shaders/MultiTexID;)I
      // 0de: pop
      // 0df: iload 4
      // 0e1: ifeq 100
      // 0e4: goto 0eb
      // 0e7: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: invokevirtual xfj.getGlTextureId ()I
      // 0ef: aload 7
      // 0f1: iload 8
      // 0f3: iload 9
      // 0f5: invokestatic p9t.fyc (ILjava/awt/image/BufferedImage;ZZ)I
      // 0f8: goto 0ff
      // 0fb: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fe: athrow
      // 0ff: pop
      // 100: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 103: ifeq 115
      // 106: aload 0
      // 107: getfield xfj.h9l Lgdz;
      // 10a: aload 0
      // 10b: invokestatic net/optifine/EmissiveTextures.loadTexture (Lgdz;Lxfj;)V
      // 10e: goto 115
      // 111: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 114: athrow
      // 115: aload 5
      // 117: iload 4
      // 119: ifne 128
      // 11c: ifnull 149
      // 11f: goto 126
      // 122: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 125: athrow
      // 126: aload 5
      // 128: invokevirtual java/io/InputStream.close ()V
      // 12b: goto 149
      // 12e: astore 11
      // 130: aload 5
      // 132: iload 4
      // 134: ifne 143
      // 137: ifnull 146
      // 13a: goto 141
      // 13d: invokestatic xfj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 140: athrow
      // 141: aload 5
      // 143: invokevirtual java/io/InputStream.close ()V
      // 146: aload 11
      // 148: athrow
      // 149: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3124176912366895103L, 7391692179193388996L, MethodHandles.lookup().lookupClass()).a(137974925177339L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 6272396395869L;
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
      String var6 = "¿PöÝ\fË \u0016O\u0014é§¸¯8\\ñj*ÎÚóYÀ\u009bþ\u0017\u0086áF\u0085æ\u0004zM\\\u001d\u0092i~ÔÀWh\u0087r~2 U\u0006\u0011z\u0015Ýã\u0010\u0006MHÒu\u0092\u0015\u0001/Z\u008cbp\u001cì\u0003";
      int var8 = "¿PöÝ\fË \u0016O\u0014é§¸¯8\\ñj*ÎÚóYÀ\u009bþ\u0017\u0086áF\u0085æ\u0004zM\\\u001d\u0092i~ÔÀWh\u0087r~2 U\u0006\u0011z\u0015Ýã\u0010\u0006MHÒu\u0092\u0015\u0001/Z\u008cbp\u001cì\u0003"
         .length();
      char var5 = '8';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            t5j = LogManager.getLogger();
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3999;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("xfj", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("xfj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
