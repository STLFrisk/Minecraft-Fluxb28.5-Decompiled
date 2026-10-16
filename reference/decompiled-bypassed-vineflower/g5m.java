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

public class g5m extends ni3 {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public g5m() {
      long var1 = a ^ 4296770882241L;
      super(b<"a">(13815, 5322425933862068875L ^ var1));
   }

   @Override
   public void la_() {
      long var1 = a ^ 105653902522414L;
      this.j_r(b<"a">(27441, 1324729655511879329L ^ var1));
      this.j_r(b<"a">(1756, 3269230314687161165L ^ var1));
   }

   @Override
   public void jhy() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5m.a J
      // 03: ldc2_w 129092495244397
      // 06: lxor
      // 07: lstore 1
      // 08: new eka
      // 0b: dup
      // 0c: getstatic g5m.wc2 Lc05;
      // 0f: invokespecial eka.<init> (Lc05;)V
      // 12: astore 4
      // 14: invokestatic t9d.c ()I
      // 17: aload 0
      // 18: sipush 8965
      // 1b: ldc2_w 4748754282819551953
      // 1e: lload 1
      // 1f: lxor
      // 20: invokedynamic a (IJ)Ljava/lang/String; bsm=g5m.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: nop
      // 26: invokevirtual g5m.jda (Ljava/lang/String;)I
      // 29: istore 5
      // 2b: istore 3
      // 2c: iload 5
      // 2e: iload 3
      // 2f: ifne 6b
      // 32: bipush -1
      // 33: if_icmple 59
      // 36: goto 3d
      // 39: invokestatic g5m.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 5
      // 3f: aload 4
      // 41: invokevirtual eka.x05 ()I
      // 44: i2f
      // 45: fconst_2
      // 46: fmul
      // 47: aload 4
      // 49: invokevirtual eka.lrx ()I
      // 4c: i2f
      // 4d: fconst_2
      // 4e: fmul
      // 4f: invokestatic org/lwjgl/opengl/GL20.glUniform2f (IFF)V
      // 52: goto 59
      // 55: invokestatic g5m.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: sipush 6328
      // 5d: ldc2_w 5615505408710457705
      // 60: lload 1
      // 61: lxor
      // 62: invokedynamic a (IJ)Ljava/lang/String; bsm=g5m.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: nop
      // 68: invokevirtual g5m.jda (Ljava/lang/String;)I
      // 6b: istore 6
      // 6d: iload 3
      // 6e: ifne 9e
      // 71: iload 6
      // 73: bipush -1
      // 74: if_icmple 8e
      // 77: goto 7e
      // 7a: invokestatic g5m.a (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 6
      // 80: aload 0
      // 81: getfield g5m.zxi F
      // 84: invokestatic org/lwjgl/opengl/GL20.glUniform1f (IF)V
      // 87: goto 8e
      // 8a: invokestatic g5m.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: dup
      // 90: getfield g5m.zxi F
      // 93: ldc 0.001
      // 95: nop
      // 96: getstatic ybv.brc F
      // 99: fmul
      // 9a: fadd
      // 9b: putfield g5m.zxi F
      // 9e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5317986270709744780L, 6534779419074038148L, MethodHandles.lookup().lookupClass()).a(229659743143877L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 837918595316L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "v\u0000\u009b0ö\u0018Ïe\u008b{øT\u0011H+\u008a¬Òv\u0091³¸\u009a´\u001fÆP¬&\u009a\u0086~\u0010°7r8\u000bÄ\u0006É\u0005S'X\u00945@\u0091\u0010\u008c\u0081g\u0002t&\fÚÿNZ\u0097·: \u0005";
      int var8 = "v\u0000\u009b0ö\u0018Ïe\u008b{øT\u0011H+\u008a¬Òv\u0091³¸\u009a´\u001fÆP¬&\u009a\u0086~\u0010°7r8\u000bÄ\u0006É\u0005S'X\u00945@\u0091\u0010\u008c\u0081g\u0002t&\fÚÿNZ\u0097·: \u0005"
         .length();
      char var5 = ' ';
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
                     f = var9;
                     g = new String[5];
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

                  var6 = "\u001a\u0011\u0081Ë\u0018gÜ\u001a-n\u0099\u0012\b.\u0081üq\u0085ôîÒ\u0019eÜ¨´µ .\u0089+f\u0018¡\u0097Í|ghw\u00180rKÚ¼\u0002T¹\u000edCdM§Ó)";
                  var8 = "\u001a\u0011\u0081Ë\u0018gÜ\u001a-n\u0099\u0012\b.\u0081üq\u0085ôîÒ\u0019eÜ¨´µ .\u0089+f\u0018¡\u0097Í|ghw\u00180rKÚ¼\u0002T¹\u000edCdM§Ó)"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6945;
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
            throw new RuntimeException("g5m", var10);
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
         throw new RuntimeException("g5m" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
