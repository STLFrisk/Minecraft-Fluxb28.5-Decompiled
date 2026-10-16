import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zb_ extends ev3 {
   private static final long a;
   private static final String f;

   public zb_(String var1, Class var2, Collection var3) {
      long var4 = a ^ 138535262766581L;
      super(var1, var2);
      this.dxp = Maps.newHashMap();
      this.reh = ImmutableSet.copyOf(var3);

      for (Enum var7 : var3) {
         String var8 = ((v4k)var7).mo3();

         try {
            if (this.dxp.containsKey(var8)) {
               throw new IllegalArgumentException(f + var8 + "'");
            }
         } catch (IllegalArgumentException var9) {
            throw a(var9);
         }

         this.dxp.put(var8, var7);
      }
   }

   @Override
   public Collection isr() {
      return this.reh;
   }

   public String a1v(Enum var1) {
      return ((v4k)var1).mo3();
   }

   public static zb_ pq4(String var0, Class var1) {
      return _m6(var0, var1, Predicates.alwaysTrue());
   }

   public static zb_ _m6(String var0, Class var1, Predicate var2) {
      return afo(var0, var1, Collections2.filter(Lists.newArrayList(var1.getEnumConstants()), var2));
   }

   public static zb_ hye(String var0, Class var1, Enum[] var2) {
      return afo(var0, var1, Lists.newArrayList(var2));
   }

   public static zb_ afo(String var0, Class var1, Collection var2) {
      return new zb_(var0, var1, var2);
   }

   @Override
   public String _lf(Comparable var1) {
      return this.a1v((Enum)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2948604627524284516L, -2497109752929195842L, MethodHandles.lookup().lookupClass()).a(246787065832273L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 71283527245923L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0082/Ï( \u0010\u0084Õ\u0081\u001brO\u0003IÄ¹/\u001b$)ÓÆtòÔxÒ ¦ÞÎÍ?¹!)\u0005MV.".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
}
