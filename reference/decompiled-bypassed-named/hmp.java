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

public class hmp {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void _6v() {
      try {
         mc1 = new qn4(_89.l22(), _89.mpf(), _89._d2(), kxe);
         mc1.s_6(_89.pfr, _89.ry7);
         ud5 = new oru(_89.pfr, _89.ry7, true);
         ud5.dty(1.0F, 1.0F, 1.0F, 1.0F);
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   private static void mhk(float var0, float var1, float var2) {
      long var3 = a ^ 64732121855094L;
      ((uix)mc1.w5k().get(0)).q5g().h1q(a<"y">(3618, 1026501707936809195L ^ var3)).scn(var0);
      ((uix)mc1.w5k().get(1)).q5g().h1q(a<"y">(7595, 2390168228441150307L ^ var3)).scn(var0);
      ((uix)mc1.w5k().get(0)).q5g().h1q(a<"y">(9990, 8094841414826650061L ^ var3)).utn(var1, var2);
      ((uix)mc1.w5k().get(1)).q5g().h1q(a<"y">(22390, 2819327687522982332L ^ var3)).utn(var2, var1);
   }

   public static void f43(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new eka
      // 03: dup
      // 04: getstatic hmp._89 Lc05;
      // 07: invokespecial eka.<init> (Lc05;)V
      // 0a: astore 2
      // 0b: aload 2
      // 0c: invokevirtual eka._0s ()I
      // 0f: istore 3
      // 10: invokestatic OpaquePredicate.c ()I
      // 13: aload 2
      // 14: invokevirtual eka.x05 ()I
      // 17: istore 4
      // 19: istore 1
      // 1a: aload 2
      // 1b: invokevirtual eka.lrx ()I
      // 1e: istore 5
      // 20: getstatic hmp.ra3 I
      // 23: iload 3
      // 24: iload 1
      // 25: ifne 3e
      // 28: if_icmpne 80
      // 2b: goto 32
      // 2e: invokestatic hmp.a (Loov;)Loov;
      // 31: athrow
      // 32: getstatic hmp.e_2 I
      // 35: iload 4
      // 37: goto 3e
      // 3a: invokestatic hmp.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 1
      // 3f: ifne 58
      // 42: if_icmpne 80
      // 45: goto 4c
      // 48: invokestatic hmp.a (Loov;)Loov;
      // 4b: athrow
      // 4c: getstatic hmp.gbk I
      // 4f: iload 5
      // 51: goto 58
      // 54: invokestatic hmp.a (Loov;)Loov;
      // 57: athrow
      // 58: if_icmpne 80
      // 5b: getstatic hmp.ud5 Loru;
      // 5e: ifnull 80
      // 61: goto 68
      // 64: invokestatic hmp.a (Loov;)Loov;
      // 67: athrow
      // 68: getstatic hmp.mc1 Lqn4;
      // 6b: iload 1
      // 6c: ifne a1
      // 6f: goto 76
      // 72: invokestatic hmp.a (Loov;)Loov;
      // 75: athrow
      // 76: ifnonnull 83
      // 79: goto 80
      // 7c: invokestatic hmp.a (Loov;)Loov;
      // 7f: athrow
      // 80: invokestatic hmp._6v ()V
      // 83: iload 3
      // 84: putstatic hmp.ra3 I
      // 87: iload 4
      // 89: putstatic hmp.e_2 I
      // 8c: iload 5
      // 8e: putstatic hmp.gbk I
      // 91: fload 0
      // 92: fconst_0
      // 93: fconst_1
      // 94: invokestatic hmp.mhk (FFF)V
      // 97: getstatic hmp.ud5 Loru;
      // 9a: bipush 1
      // 9b: invokevirtual oru.mou (Z)V
      // 9e: getstatic hmp.mc1 Lqn4;
      // a1: invokestatic Minecraft.vz1 ()Lc05;
      // a4: getfield Minecraft.gze Laba;
      // a7: getfield aba.au3 F
      // aa: invokevirtual qn4.hii (F)V
      // ad: getstatic hmp._89 Lc05;
      // b0: invokevirtual Minecraft._d2 ()Loru;
      // b3: bipush 1
      // b4: invokevirtual oru.mou (Z)V
      // b7: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8192470124930543593L, 2083246394647315474L, MethodHandles.lookup().lookupClass()).a(110983985709299L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 60211576294569L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "¿¯\u0018§\u001cC\u0084ëJ:\u000e\u0006¢(×ä\u0010Ñ\u009e\u0001\u0013w\u0002\u0019\u0082v\u0092¶14æ¸.\u0010ã·ÜÈ°wÜ¾)\u00ad ýèCQÙ";
      int var6 = "¿¯\u0018§\u001cC\u0084ëJ:\u000e\u0006¢(×ä\u0010Ñ\u009e\u0001\u0013w\u0002\u0019\u0082v\u0092¶14æ¸.\u0010ã·ÜÈ°wÜ¾)\u00ad ýèCQÙ".length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[5];
                     _89 = Minecraft.vz1();
                     kxe = new gdz(a<"y">(26241, 822648833784025235L ^ var9));
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

                  var4 = "R\u0093\u00189¸Ç^\u008b\u001c\u0010púîcU&(\u0085L·\u008eÚ\u0010\nó7y>\u001c\t%Ýp1Ò:6}t\u00adÚ\u0085[TÃÎ\u007fÏXêýÆ^ÖÃÁ±";
                  var6 = "R\u0093\u00189¸Ç^\u008b\u001c\u0010púîcU&(\u0085L·\u008eÚ\u0010\nó7y>\u001c\t%Ýp1Ò:6}t\u00adÚ\u0085[TÃÎ\u007fÏXêýÆ^ÖÃÁ±".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32229;
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
            throw new RuntimeException("hmp", var10);
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
         throw new RuntimeException("hmp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
