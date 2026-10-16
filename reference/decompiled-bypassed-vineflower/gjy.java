import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gjy implements wra, sjk {
   private static final Ordering y2b;
   private final List cbw;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public gjy() {
      this(y2b.sortedCopy(c05.vz1().c02().l0e()));
   }

   public gjy(Collection var1) {
      int var10000 = t9d.c();
      this.cbw = Lists.newArrayList();
      Iterator var3 = y2b.sortedCopy(var1).iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         hv2 var4 = (hv2)var3.next();

         try {
            if (var4.j3n() != h50$f05.l18) {
               this.cbw.add(new rze(var4.pbs()));
            }
         } catch (oov var5) {
            throw a(var5);
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   @Override
   public List _ec() {
      return this.cbw;
   }

   @Override
   public ekw iuh() {
      long var1 = a ^ 60064659522830L;
      return new tao(a<"z">(32226, 3468338778518801634L ^ var1));
   }

   @Override
   public void z9x(al9 var1) {
      var1.rg3(this);
   }

   @Override
   public ekw s34() {
      long var1 = a ^ 16362096031180L;
      return new tao(a<"z">(9374, 7044816786182219101L ^ var1));
   }

   @Override
   public void b6x(float var1, int var2) {
      c05.vz1().l22().anl(akr._rg);
      b0t.vfo(0, 0, 0.0F, 0.0F, 16, 16, 256.0F, 256.0F);
   }

   @Override
   public boolean v4p() {
      int var1 = t9d.c();

      try {
         boolean var10000 = this.cbw.isEmpty();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3182419313956451080L, 3445710058761250840L, MethodHandles.lookup().lookupClass()).a(147549527987941L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100379335056580L;
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
      String var6 = "Îh2.Ö\u0010G\u008a)\u008eH¯6\u0094\u0097\u008b5¢×\u0082C:L*&ÿ\u0087`^¥{¨bnBÖqv\u001210t\rÝºéeÔ\u0088Uá]3\r{¿Ôz\u0082ÔQRãI\u0007\u0018\u009c#F\u0097GÈqæÆ5ttóEþ\u0012BJ¦§\u0084 5";
      int var8 = "Îh2.Ö\u0010G\u008a)\u008eH¯6\u0094\u0097\u008b5¢×\u0082C:L*&ÿ\u0087`^¥{¨bnBÖqv\u001210t\rÝºéeÔ\u0088Uá]3\r{¿Ôz\u0082ÔQRãI\u0007\u0018\u009c#F\u0097GÈqæÆ5ttóEþ\u0012BJ¦§\u0084 5"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            y2b = Ordering.from(new gjy$1());
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5668;
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
            throw new RuntimeException("gjy", var10);
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
         throw new RuntimeException("gjy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
