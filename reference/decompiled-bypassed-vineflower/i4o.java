import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i4o extends ar7 {
   public static cn7 y70;
   public static crk ewf;
   public static cn7 xe7;
   public q6h yxm;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @jev
   public void mel(fz2 var1) {
      try {
         if (xe7.g7m()) {
            ek1.vg8.tfv = 0.1F;
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   @jev(
      jn1 = 3
   )
   public void ttt(fha var1) {
      long var2 = a ^ 132220518181886L;
      if (y70.g7m()) {
         eka var4 = new eka(ek1);
         double var5 = (ek1.vg8.o2v - ek1.vg8.ivp) * 2.0;
         double var7 = (ek1.vg8.vbd - ek1.vg8.e2b) * 2.0;
         BigDecimal var9 = new BigDecimal((double)fe6.dii(var5 * var5 + var7 * var7) * 10.0);
         int var10 = (int)((float)var9.intValue() * ek1.gze.qeu);
         String var11 = var10 + b<"f">(22259, 1513169242718342501L ^ var2);
         jsr.yk7.fzf(var11, ((float)var4.x05() - jsr.yk7.ax2(var11)) / 2.0F, (float)(var4.lrx() / 2 - 20), z7e.a2_.k0y);
      }
   }

   @jev
   public void sfu(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic i4o.a J
      // 03: ldc2_w 115061698496304
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual wbh.nlg ()Lmz2;
      // 11: instanceof net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 14: iload 4
      // 16: ifeq 52
      // 19: ifeq 59
      // 1c: goto 23
      // 1f: invokestatic i4o.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield i4o.yxm Lq6h;
      // 27: invokevirtual q6h.u1k ()V
      // 2a: aload 0
      // 2b: iload 4
      // 2d: ifeq 56
      // 30: goto 37
      // 33: invokestatic i4o.a (Loov;)Loov;
      // 36: athrow
      // 37: invokevirtual i4o.smu ()Lc_3;
      // 3a: sipush 12634
      // 3d: ldc2_w 2738908092962457092
      // 40: lload 2
      // 41: lxor
      // 42: invokedynamic f (IJ)Ljava/lang/String; bsm=i4o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 4b: goto 52
      // 4e: invokestatic i4o.a (Loov;)Loov;
      // 51: athrow
      // 52: ifne 59
      // 55: aload 0
      // 56: invokevirtual i4o.tp_ ()V
      // 59: return
   }

   public i4o() {
      long var1 = a ^ 9539647179425L;
      super(b<"f">(26674, 7290839381017039609L ^ var1), _aj._lm, true, new j1s[]{new dio(), new zlr(), new b1t(), new r2j(), new yz4()});
      this.yxm = new q6h();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7763144037876872199L, -6477890861332663869L, MethodHandles.lookup().lookupClass()).a(37999021459710L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 101716329419933L;
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
      String var4 = "\u0011På¥bm \u0083Ý\n\u008f£ª;\r¾\u0010\u009frÙH@Àë\u0007W\f\u0006R5@ÜÕ \u0080Ã\nD¨öÇñ\u0004X\u0003ö\u00ad\u0004\u0017±µ@´5¬\u0019Kë\u0084ØnqmÔýd\u0018³eó» ¯\u0080T©ä(6Ë\rI¤Ä9\u009fÌ\u008f¶±C\u0018\u009f\u00987ðÔbå}xíÿf\u0004hU+Ha§c¼X 3";
      int var6 = "\u0011På¥bm \u0083Ý\n\u008f£ª;\r¾\u0010\u009frÙH@Àë\u0007W\f\u0006R5@ÜÕ \u0080Ã\nD¨öÇñ\u0004X\u0003ö\u00ad\u0004\u0017±µ@´5¬\u0019Kë\u0084ØnqmÔýd\u0018³eó» ¯\u0080T©ä(6Ë\rI¤Ä9\u009fÌ\u008f¶±C\u0018\u009f\u00987ðÔbå}xíÿf\u0004hU+Ha§c¼X 3"
         .length();
      char var3 = 16;
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
                     y70 = new cn7(b<"f">(11696, 8011316540515649862L ^ var9), b<"f">(13932, 8317926071912764061L ^ var9), true);
                     ewf = new crk(b<"f">(11696, 8011316540515649862L ^ var9), b<"f">(4804, 3608830342775027248L ^ var9), 1.0F, 1.0F, 10.0F, 1.0F);
                     xe7 = new cn7(b<"f">(11696, 8011316540515649862L ^ var9), b<"f">(21928, 4679181746561413466L ^ var9), false);
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

                  var4 = "uBÂ?\u0002·znÂuæt\u0016ØÍuÕ6Â\r\u0094Gòé\u0018-\u009c\rNÉ°èw¿úLD\u0099\bãl\u008fµÚÂeG»á";
                  var6 = "uBÂ?\u0002·znÂuæt\u0016ØÍuÕ6Â\r\u0094Gòé\u0018-\u009c\rNÉ°èw¿úLD\u0099\bãl\u008fµÚÂeG»á".length();
                  var3 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23722;
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
            throw new RuntimeException("i4o", var10);
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
         throw new RuntimeException("i4o" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
