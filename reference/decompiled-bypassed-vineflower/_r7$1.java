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
import tv.twitch.ErrorCode;
import tv.twitch.chat.IChatAPIListener;

public class _r7$1 implements IChatAPIListener {
   public final _r7 al7;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public _r7$1(_r7 var1) {
      this.al7 = var1;
   }

   public void chatInitializationCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 40
      // 09: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 0c: ifeq 56
      // 0f: goto 16
      // 12: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield _r7$1.al7 L_r7;
      // 1a: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 1d: aload 0
      // 1e: getfield _r7$1.al7 L_r7;
      // 21: getfield _r7.m1i I
      // 24: invokevirtual tv/twitch/chat/Chat.setMessageFlushInterval (I)Ltv/twitch/ErrorCode;
      // 27: pop
      // 28: aload 0
      // 29: getfield _r7$1.al7 L_r7;
      // 2c: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 2f: aload 0
      // 30: getfield _r7$1.al7 L_r7;
      // 33: getfield _r7._na I
      // 36: invokevirtual tv/twitch/chat/Chat.setUserChangeEventInterval (I)Ltv/twitch/ErrorCode;
      // 39: goto 40
      // 3c: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: pop
      // 41: aload 0
      // 42: getfield _r7$1.al7 L_r7;
      // 45: invokevirtual _r7._ct ()V
      // 48: aload 0
      // 49: getfield _r7$1.al7 L_r7;
      // 4c: getstatic _r7$lw7.g2t L_r7$lw7;
      // 4f: invokevirtual _r7.feh (L_r7$lw7;)V
      // 52: iload 2
      // 53: ifeq 67
      // 56: aload 0
      // 57: getfield _r7$1.al7 L_r7;
      // 5a: getstatic _r7$lw7.hec L_r7$lw7;
      // 5d: invokevirtual _r7.feh (L_r7$lw7;)V
      // 60: goto 67
      // 63: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: aload 0
      // 68: getfield _r7$1.al7 L_r7;
      // 6b: getfield _r7.n0t L_r7$ja4;
      // 6e: iload 2
      // 6f: ifne 8a
      // 72: ifnull 90
      // 75: goto 7c
      // 78: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield _r7$1.al7 L_r7;
      // 80: getfield _r7.n0t L_r7$ja4;
      // 83: goto 8a
      // 86: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: aload 1
      // 8b: invokeinterface _r7$ja4.y87 (Ltv/twitch/ErrorCode;)V 2
      // 90: goto 9f
      // 93: astore 3
      // 94: aload 0
      // 95: getfield _r7$1.al7 L_r7;
      // 98: aload 3
      // 99: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 9c: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 9f: return
   }

   public void chatShutdownCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7$1.a J
      // 03: ldc2_w 131120473021820
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq 31
      // 13: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 7e
      // 19: goto 20
      // 1c: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield _r7$1.al7 L_r7;
      // 24: getfield _r7.rco Ltv/twitch/Core;
      // 27: invokevirtual tv/twitch/Core.shutdown ()Ltv/twitch/ErrorCode;
      // 2a: goto 31
      // 2d: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: astore 5
      // 33: iload 4
      // 35: ifeq 79
      // 38: aload 5
      // 3a: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 3d: ifeq 6f
      // 40: goto 47
      // 43: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 5
      // 49: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 4c: astore 6
      // 4e: aload 0
      // 4f: getfield _r7$1.al7 L_r7;
      // 52: sipush 1022
      // 55: ldc2_w 3665344403139013186
      // 58: lload 2
      // 59: lxor
      // 5a: invokedynamic o (IJ)Ljava/lang/String; bsm=_r7$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: nop
      // 60: bipush 1
      // 61: anewarray 13
      // 64: dup
      // 65: bipush 0
      // 66: aload 6
      // 68: aastore
      // 69: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 6c: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 6f: aload 0
      // 70: getfield _r7$1.al7 L_r7;
      // 73: getstatic _r7$lw7.hec L_r7$lw7;
      // 76: invokevirtual _r7.feh (L_r7$lw7;)V
      // 79: iload 4
      // 7b: ifne af
      // 7e: aload 0
      // 7f: getfield _r7$1.al7 L_r7;
      // 82: getstatic _r7$lw7.g2t L_r7$lw7;
      // 85: invokevirtual _r7.feh (L_r7$lw7;)V
      // 88: aload 0
      // 89: getfield _r7$1.al7 L_r7;
      // 8c: sipush 21133
      // 8f: ldc2_w 7813566959331310384
      // 92: lload 2
      // 93: lxor
      // 94: invokedynamic o (IJ)Ljava/lang/String; bsm=_r7$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: nop
      // 9a: bipush 1
      // 9b: anewarray 13
      // 9e: dup
      // 9f: bipush 0
      // a0: aload 1
      // a1: aastore
      // a2: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // a5: invokevirtual _r7.djt (Ljava/lang/String;)V
      // a8: goto af
      // ab: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: aload 0
      // b0: getfield _r7$1.al7 L_r7;
      // b3: getfield _r7.n0t L_r7$ja4;
      // b6: iload 4
      // b8: ifeq d3
      // bb: ifnull d9
      // be: goto c5
      // c1: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c4: athrow
      // c5: aload 0
      // c6: getfield _r7$1.al7 L_r7;
      // c9: getfield _r7.n0t L_r7$ja4;
      // cc: goto d3
      // cf: invokestatic _r7$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: aload 1
      // d4: invokeinterface _r7$ja4._g0 (Ltv/twitch/ErrorCode;)V 2
      // d9: goto ea
      // dc: astore 5
      // de: aload 0
      // df: getfield _r7$1.al7 L_r7;
      // e2: aload 5
      // e4: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // e7: invokevirtual _r7.djt (Ljava/lang/String;)V
      // ea: return
   }

   public void chatEmoticonDataDownloadCallback(ErrorCode var1) {
      try {
         if (ErrorCode.succeeded(var1)) {
            this.al7.kng();
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(396713655902656245L, -6706832084065502209L, MethodHandles.lookup().lookupClass()).a(43728358758956L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 123061609257019L;
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
      String var6 = "EG\u008dèPá¼#$T\u0005õ|¾º\u0005sÁ\u0011ë\n\u0001+<&\u0099\u001d2\u0083/4\u009eîtV#É«î=ý\u007f«½¿sµ*ãÛÎ\u008f¸'èò\u0002Ñ\u009a¼=óãû@w\u0012m\u00ad\u000f\"jn)Js×\u0000L×]uÅr4kÔ\u0085©í1_Ç_î¢\u0014\u0088zT\u0095êe) ÒádÛ:*£µD¦¶W¨=¢Jºh(¬dAø\"";
      int var8 = "EG\u008dèPá¼#$T\u0005õ|¾º\u0005sÁ\u0011ë\n\u0001+<&\u0099\u001d2\u0083/4\u009eîtV#É«î=ý\u007f«½¿sµ*ãÛÎ\u008f¸'èò\u0002Ñ\u009a¼=óãû@w\u0012m\u00ad\u000f\"jn)Js×\u0000L×]uÅr4kÔ\u0085©í1_Ç_î¢\u0014\u0088zT\u0095êe) ÒádÛ:*£µD¦¶W¨=¢Jºh(¬dAø\""
         .length();
      char var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13061;
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
            throw new RuntimeException("_r7$1", var10);
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
         throw new RuntimeException("_r7$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
