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

public class nat implements dxd$v9l {
   private final Minecraft t0i = Minecraft.vz1();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public void is9(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      long var9 = a ^ 49917134796239L;
      int var12 = var3 + var5 / 2 - this.t0i.tx1.rr7 / 2;
      int var10000 = OpaquePredicate.b();
      this.t0i
         .tx1
         .eh6(
            fc1.gx1(a<"d">(5045, 6456080003338016195L ^ var9), new Object[0]),
            (float)(this.t0i.u0y.dt7 / 2 - this.t0i.tx1.ezt(fc1.gx1(a<"d">(9839, 9040633429502304282L ^ var9), new Object[0])) / 2),
            (float)var12,
            16777215
         );
      int var11 = var10000;
      String var13;
      switch ((int)(Minecraft.qgs() / 300L % 4L)) {
         case 0:
         default:
            var13 = a<"d">(27775, 1527338853897103883L ^ var9);
            if (var11 != 0) {
               break;
            }
         case 1:
         case 3:
            var13 = a<"d">(22801, 7838377773445472097L ^ var9);
            if (var11 != 0) {
               break;
            }
         case 2:
            var13 = a<"d">(13721, 9105672572661478382L ^ var9);
      }

      this.t0i.tx1.eh6(var13, (float)(this.t0i.u0y.dt7 / 2 - this.t0i.tx1.ezt(var13) / 2), (float)(var12 + this.t0i.tx1.rr7), 8421504);
   }

   @Override
   public void _at(int var1, int var2, int var3) {
   }

   @Override
   public boolean r6b(int var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   @Override
   public void l_a(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1244566613635022316L, 7606655158815467713L, MethodHandles.lookup().lookupClass()).a(216969498287380L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 64553552928059L;
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
      String var6 = "\u0011\u001e*q\u008aìÜa\u0083Ó[x§5\u008c\u0098(©Ð¬_þêåR\u009a\u007f¯\u009a\u009aº¶¸$X\u001e%\u0098í\u0005WWþ\r\u0089'¶\u0085Û,¶c+µk\u009b%(~f<Iç_ÉÒOð¤\"®ýúÕ\u0089¥ÛÆ-7Q!\u0080\u0012½çÿý\u009c\u001f\u001bÿ\u0080\u001f\u0014T\u0088@";
      int var8 = "\u0011\u001e*q\u008aìÜa\u0083Ó[x§5\u008c\u0098(©Ð¬_þêåR\u009a\u007f¯\u009a\u009aº¶¸$X\u001e%\u0098í\u0005WWþ\r\u0089'¶\u0085Û,¶c+µk\u009b%(~f<Iç_ÉÒOð¤\"®ýúÕ\u0089¥ÛÆ-7Q!\u0080\u0012½çÿý\u009c\u001f\u001bÿ\u0080\u001f\u0014T\u0088@"
         .length();
      char var5 = 16;
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
                     c = new String[5];
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

                  var6 = "½S+\u001f#¡4t©0dx\r\u000e\u009eó\u0010µ\u0010\u0095\u0080ô\u009c&\u0013ÕÐ\u009d³¬·=Ê";
                  var8 = "½S+\u001f#¡4t©0dx\r\u000e\u009eó\u0010µ\u0010\u0095\u0080ô\u009c&\u0013ÕÐ\u009d³¬·=Ê".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21554;
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
            throw new RuntimeException("nat", var10);
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
         throw new RuntimeException("nat" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
