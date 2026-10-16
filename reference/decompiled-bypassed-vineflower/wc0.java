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

public class wc0 extends ar7 {
   public static c_3 vrr;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public wc0() {
      long var1 = a ^ 5159846832556L;
      super(b<"g">(10150, 6057742413761514871L ^ var1), _aj.sxc, vrr);
   }

   @jev
   public void mv4(b5k param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wc0.a J
      // 03: ldc2_w 106612366376229
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: getstatic wc0.vrr Lc_3;
      // 10: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 13: sipush 6987
      // 16: ldc2_w 8468433122106025233
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic g (IJ)Ljava/lang/String; bsm=wc0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24: iload 4
      // 26: ifne 6b
      // 29: ifeq 4d
      // 2c: goto 33
      // 2f: invokestatic wc0.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: pop
      // 35: getstatic wc0.ek1 Lc05;
      // 38: getfield c05.tij Lkh3;
      // 3b: ldc2_w -18000
      // 3e: invokevirtual kh3.p7c (J)V
      // 41: iload 4
      // 43: ifeq 83
      // 46: goto 4d
      // 49: invokestatic wc0.a (Loov;)Loov;
      // 4c: athrow
      // 4d: getstatic wc0.vrr Lc_3;
      // 50: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 53: sipush 5608
      // 56: ldc2_w 5562738988570061747
      // 59: lload 2
      // 5a: lxor
      // 5b: invokedynamic g (IJ)Ljava/lang/String; bsm=wc0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 64: goto 6b
      // 67: invokestatic wc0.a (Loov;)Loov;
      // 6a: athrow
      // 6b: ifeq 83
      // 6e: aload 0
      // 6f: pop
      // 70: getstatic wc0.ek1 Lc05;
      // 73: getfield c05.tij Lkh3;
      // 76: ldc2_w -12700
      // 79: invokevirtual kh3.p7c (J)V
      // 7c: goto 83
      // 7f: invokestatic wc0.a (Loov;)Loov;
      // 82: athrow
      // 83: return
   }

   @jev
   public void di4(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 21
      // 09: getfield wbh.vip Lmz2;
      // 0c: instanceof net/minecraft/network/play/server/S03PacketTimeUpdate
      // 0f: ifeq 25
      // 12: goto 19
      // 15: invokestatic wc0.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: goto 21
      // 1d: invokestatic wc0.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: invokevirtual wbh.wxi (Z)V
      // 25: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6619997076694244513L, -3662391494782682520L, MethodHandles.lookup().lookupClass()).a(252801638202023L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 99397990112365L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "\\Õ¾,\u001e\u0011¦\u0002Î\u0013\u008e\u0001¬Ø½\u0000¿\u0005Ï\u0013\u0092\u008fG\u009d\u0010´µÏ8þhû¢a\b*~Ô\fcX û±4c¨#-\u000b°¿ñ\u0091\u008f\u0090\u0085\u009b1b\u008azKå+N©÷sÛ\u008ac_ÿ\u0010\u001ckCªµá\u0094\u0099\u001a á[\u001b\u0087*ö Ð\u009d±S»·VëM/bÕæ%\u0005ð[raÿÓ1½÷\u007f;Í¦@óuG";
      int var6 = "\\Õ¾,\u001e\u0011¦\u0002Î\u0013\u008e\u0001¬Ø½\u0000¿\u0005Ï\u0013\u0092\u008fG\u009d\u0010´µÏ8þhû¢a\b*~Ô\fcX û±4c¨#-\u000b°¿ñ\u0091\u008f\u0090\u0085\u009b1b\u008azKå+N©÷sÛ\u008ac_ÿ\u0010\u001ckCªµá\u0094\u0099\u001a á[\u001b\u0087*ö Ð\u009d±S»·VëM/bÕæ%\u0005ð[raÿÓ1½÷\u007f;Í¦@óuG"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[7];
                     vrr = new c_3(
                        b<"g">(26144, 6531557383891745076L ^ var9),
                        b<"g">(9107, 1198613781954804870L ^ var9),
                        b<"g">(10295, 7250260601690896161L ^ var9),
                        new String[]{b<"g">(30129, 5118087972385221280L ^ var9)}
                     );
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0088Ò7¥´ß\u009e$\u0094\u001b(ã\u008c\u0001^m ûµ»8.ùc_!b\u001aj\u009e ÃÂ\u0006Jã©ÛJR\u007f\u0015æµ÷7Õ9 ";
                  var6 = "\u0088Ò7¥´ß\u009e$\u0094\u001b(ã\u008c\u0001^m ûµ»8.ùc_!b\u001aj\u009e ÃÂ\u0006Jã©ÛJR\u007f\u0015æµ÷7Õ9 ".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12307;
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
            throw new RuntimeException("wc0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("wc0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
