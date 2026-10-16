import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class aua extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 125641558556956L;
      return b<"n">(14691, 796341552772110871L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 137144611954074L;
      return b<"n">(22830, 4068957453607921368L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic aua.a J
      // 003: ldc2_w 130045330748505
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: iload 5
      // 011: ifne 02b
      // 014: ifle 0f9
      // 017: goto 01e
      // 01a: invokestatic aua.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 2
      // 01f: bipush 0
      // 020: aaload
      // 021: invokevirtual java/lang/String.length ()I
      // 024: goto 02b
      // 027: invokestatic aua.a (Loov;)Loov;
      // 02a: athrow
      // 02b: bipush 1
      // 02c: if_icmple 0f9
      // 02f: invokestatic vr1._0v ()Lvr1;
      // 032: invokevirtual vr1.wh3 ()Lwlx;
      // 035: aload 2
      // 036: bipush 0
      // 037: aaload
      // 038: invokevirtual wlx.f_q (Ljava/lang/String;)Lz96;
      // 03b: astore 6
      // 03d: sipush 22943
      // 040: ldc2_w 4456887276844961709
      // 043: lload 3
      // 044: lxor
      // 045: invokedynamic n (IJ)Ljava/lang/String; bsm=aua.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: nop
      // 04b: astore 7
      // 04d: bipush 0
      // 04e: istore 8
      // 050: aload 6
      // 052: ifnonnull 061
      // 055: new iez
      // 058: dup
      // 059: invokespecial iez.<init> ()V
      // 05c: athrow
      // 05d: invokestatic aua.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 2
      // 062: arraylength
      // 063: iload 5
      // 065: ifne 09b
      // 068: bipush 2
      // 069: if_icmplt 083
      // 06c: goto 073
      // 06f: invokestatic aua.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 1
      // 074: aload 2
      // 075: bipush 1
      // 076: invokestatic aua.as_ (Le7r;[Ljava/lang/String;I)Lekw;
      // 079: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 07e: astore 7
      // 080: bipush 1
      // 081: istore 8
      // 083: aload 6
      // 085: iload 5
      // 087: ifne 0d6
      // 08a: getfield z96.rhh Lmlk;
      // 08d: aload 7
      // 08f: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 092: iload 8
      // 094: goto 09b
      // 097: invokestatic aua.a (Loov;)Loov;
      // 09a: athrow
      // 09b: ifeq 0ce
      // 09e: aload 1
      // 09f: aload 0
      // 0a0: sipush 31646
      // 0a3: ldc2_w 1913287464405757354
      // 0a6: lload 3
      // 0a7: lxor
      // 0a8: invokedynamic n (IJ)Ljava/lang/String; bsm=aua.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: nop
      // 0ae: bipush 2
      // 0af: anewarray 72
      // 0b2: dup
      // 0b3: bipush 0
      // 0b4: aload 6
      // 0b6: invokevirtual z96.noc ()Ljava/lang/String;
      // 0b9: aastore
      // 0ba: dup
      // 0bb: bipush 1
      // 0bc: aload 7
      // 0be: aastore
      // 0bf: invokestatic aua.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 0c2: iload 5
      // 0c4: ifeq 0f4
      // 0c7: goto 0ce
      // 0ca: invokestatic aua.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: goto 0d6
      // 0d2: invokestatic aua.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: sipush 12144
      // 0da: ldc2_w 1604182423342823747
      // 0dd: lload 3
      // 0de: lxor
      // 0df: invokedynamic n (IJ)Ljava/lang/String; bsm=aua.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: bipush 1
      // 0e6: anewarray 72
      // 0e9: dup
      // 0ea: bipush 0
      // 0eb: aload 6
      // 0ed: invokevirtual z96.noc ()Ljava/lang/String;
      // 0f0: aastore
      // 0f1: invokestatic aua.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 0f4: iload 5
      // 0f6: ifeq 117
      // 0f9: new w57
      // 0fc: dup
      // 0fd: sipush 13551
      // 100: ldc2_w 5433093910176244447
      // 103: lload 3
      // 104: lxor
      // 105: invokedynamic n (IJ)Ljava/lang/String; bsm=aua.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: bipush 0
      // 10c: anewarray 72
      // 10f: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 112: athrow
      // 113: invokestatic aua.a (Loov;)Loov;
      // 116: athrow
      // 117: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifeq 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmplt 2b
      // 10: goto 17
      // 13: invokestatic aua.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic aua.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 25: invokestatic aua.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1713001354764534848L, 3215959004356230578L, MethodHandles.lookup().lookupClass()).a(111687957484141L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 52823477621876L;
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
      String var6 = "\u009aûìVÔ\u0080-®¬o7\u0015¢ZÎ<æb\u0080º\u0005ÎqÜS\u0013ÁKÂ¬7öÝ\rÒ-V\u000b\u001a¸\u0010Ê\t\u000e\u009e£\u009fõ#,\u0086\u000f(\u0081¬çò(Sm<}{PLÄ¥E·¨¢_Ø'ç*[ÕH7\u001b|+ÜBî5k\u0097{üGDÄvf¾\u001c0\u001fÛ1ð/}C\u008a\u008b\u009aê#\u0099\u0096\u001a6%.§\u0093Ú\u001b\b.LÐ\b?Ø48\u0013\u0082ß\u0016\u0094¼´\u0000\u008b\r¢Ãf\u0091ñ\u0080¸";
      int var8 = "\u009aûìVÔ\u0080-®¬o7\u0015¢ZÎ<æb\u0080º\u0005ÎqÜS\u0013ÁKÂ¬7öÝ\rÒ-V\u000b\u001a¸\u0010Ê\t\u000e\u009e£\u009fõ#,\u0086\u000f(\u0081¬çò(Sm<}{PLÄ¥E·¨¢_Ø'ç*[ÕH7\u001b|+ÜBî5k\u0097{üGDÄvf¾\u001c0\u001fÛ1ð/}C\u008a\u008b\u009aê#\u0099\u0096\u001a6%.§\u0093Ú\u001b\b.LÐ\b?Ø48\u0013\u0082ß\u0016\u0094¼´\u0000\u008b\r¢Ãf\u0091ñ\u0080¸"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[6];
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

                  var6 = "A\u008c%\u009b\u0095g\u0097å\u007fA\u0099\u009d\u009d\u001eC2Äfð\u000b\\ê\u001cð\u008aÌ¾½µ!*¥|\u0000\u0091Gwvë=¼\u0019ü\u0014:bõÆÇG-*i+³Ï(h^\u0095à\t¥fy2 ·\u0005J\u0015rëiµC1GPZCäð+\u009c¯ÂJXé.\u001bÍ-·\u0004j";
                  var8 = "A\u008c%\u009b\u0095g\u0097å\u007fA\u0099\u009d\u009d\u001eC2Äfð\u000b\\ê\u001cð\u008aÌ¾½µ!*¥|\u0000\u0091Gwvë=¼\u0019ü\u0014:bõÆÇG-*i+³Ï(h^\u0095à\t¥fy2 ·\u0005J\u0015rëiµC1GPZCäð+\u009c¯ÂJXé.\u001bÍ-·\u0004j"
                     .length();
                  var5 = '8';
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

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14958;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("aua", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("aua" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
