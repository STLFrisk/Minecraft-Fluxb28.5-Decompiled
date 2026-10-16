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

public class bkb extends ar7 {
   public static c_3 dw0;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public bkb() {
      long var1 = a ^ 34798315218681L;
      super(b<"e">(4132, 9165090000958066001L ^ var1), _aj._lm, dw0);
   }

   @jev
   public void _qf(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bkb.a J
      // 03: ldc2_w 109000803682465
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: pop
      // 0f: getstatic bkb.ek1 Lc05;
      // 12: getfield c05.vg8 Ll86;
      // 15: getfield l86.cbi Z
      // 18: iload 4
      // 1a: ifne 80
      // 1d: ifeq 69
      // 20: goto 27
      // 23: invokestatic bkb.a (Loov;)Loov;
      // 26: athrow
      // 27: getstatic bkb.dw0 Lc_3;
      // 2a: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 2d: sipush 10136
      // 30: ldc2_w 4308419538572711088
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic e (IJ)Ljava/lang/String; bsm=bkb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3e: iload 4
      // 40: ifne 80
      // 43: goto 4a
      // 46: invokestatic bkb.a (Loov;)Loov;
      // 49: athrow
      // 4a: ifeq 69
      // 4d: goto 54
      // 50: invokestatic bkb.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: pop
      // 56: getstatic bkb.ek1 Lc05;
      // 59: getfield c05.vg8 Ll86;
      // 5c: ldc2_w 0.30000001192092896
      // 5f: putfield l86.mop D
      // 62: goto 69
      // 65: invokestatic bkb.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: iload 4
      // 6c: ifne 8d
      // 6f: pop
      // 70: getstatic bkb.ek1 Lc05;
      // 73: getfield c05.vg8 Ll86;
      // 76: getfield l86.lfk Z
      // 79: goto 80
      // 7c: invokestatic bkb.a (Loov;)Loov;
      // 7f: athrow
      // 80: ifeq 99
      // 83: aload 0
      // 84: aload 0
      // 85: pop
      // 86: goto 8d
      // 89: invokestatic bkb.a (Loov;)Loov;
      // 8c: athrow
      // 8d: getstatic bkb.ek1 Lc05;
      // 90: getfield c05.vg8 Ll86;
      // 93: getfield l86.kfp D
      // 96: putfield bkb.qz1 D
      // 99: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1323169956534523174L, -6129213247290787584L, MethodHandles.lookup().lookupClass()).a(140208017635803L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 75255891707312L;
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
      String var4 = "3÷s¯\u0095X\u0096Ç¿R\u007f¼\u0010²\t£\u001071¬f¦n\u001dIûð&`M8Be\u0010|òÄQ¯#ÿ9fH6\u009d\u00ade\u009f\u0017";
      int var6 = "3÷s¯\u0095X\u0096Ç¿R\u007f¼\u0010²\t£\u001071¬f¦n\u001dIûð&`M8Be\u0010|òÄQ¯#ÿ9fH6\u009d\u00ade\u009f\u0017".length();
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
                     g = new String[5];
                     dw0 = new c_3(
                        b<"e">(30893, 3699862161132324496L ^ var9),
                        b<"e">(5204, 3606209440794176106L ^ var9),
                        b<"e">(19184, 348565752778634447L ^ var9),
                        new String[0]
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

                  var4 = "fEÄS\u0007rvàñ\u008de\u001b<\u0090àe\u0010\u0011ú«\u0015ÅÆ\u008a\u008aÅQ\u009d\u000f\u0089Ñ»Þ";
                  var6 = "fEÄS\u0007rvàñ\u008de\u001b<\u0090àe\u0010\u0011ú«\u0015ÅÆ\u008a\u008aÅQ\u009d\u000f\u0089Ñ»Þ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18595;
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
            throw new RuntimeException("bkb", var10);
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
         throw new RuntimeException("bkb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
