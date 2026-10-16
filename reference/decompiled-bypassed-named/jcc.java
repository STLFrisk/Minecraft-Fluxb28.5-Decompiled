import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jcc extends e0x {
   public static final zb_ m9s;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public jcc() {
      super(p3y.zs8);
      this.y8l(this._8_.c32().zvi(m9s, jcc$whg.aow));
      this.i3l(uja.mqu);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 129874146530389L;
      return orr.zgh(this.abc() + "." + jcc$whg.aow.axs() + b<"n">(15907, 4178940501282822284L ^ var1));
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((jcc$whg)var1.dil(m9s)).llp();
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      try {
         if (var1.dil(m9s) == jcc$whg.aow) {
            return u7m.gfm(ox_.a3_);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return u7m.gfm(ox_.pu8);
   }

   @Override
   public int crg(zfz var1) {
      return ((jcc$whg)var1.dil(m9s)).rim();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      jcc$whg[] var5 = jcc$whg.values();
      int var10000 = OpaquePredicate.b();
      int var6 = var5.length;
      int var4 = var10000;
      int var7 = 0;

      while (var7 < var6) {
         jcc$whg var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.rim()));
         var7++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(m9s, jcc$whg.fgu(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((jcc$whg)var1.dil(m9s)).rim();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{m9s});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9102437074920671923L, 6337960559068139163L, MethodHandles.lookup().lookupClass()).a(221436737492738L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 22224968724512L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "Þ\r\u0094?Bÿùo\u008bÂVÂ=\u0081Ð§\u0010\u001b¯\u000eòw~éÏ§î0ç\u009eÀ\u0007\u0005";
      int var6 = "Þ\r\u0094?Bÿùo\u008bÂVÂ=\u0081Ð§\u0010\u001b¯\u000eòw~éÏ§î0ç\u009eÀ\u0007\u0005".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[2];
            m9s = zb_.pq4(b<"n">(15000, 9176249435624421443L ^ var9), jcc$whg.class);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7625;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("jcc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("jcc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
