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

public class akm {
   private mew afl;
   public akm$qs6 oyz;
   public vt2 m_f;
   public fqr jhn;
   public EntityLivingBase sc8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public akm(fqr var1, vt2 var2, mew var3) {
      this(akm$qs6.i4l, var1, var2, var3);
   }

   public akm(fqr var1, vt2 var2) {
      this(akm$qs6.i4l, var1, var2, mew._9b);
   }

   public akm(EntityLivingBase var1) {
      this(var1, new fqr(var1.o2v, var1.kfp, var1.vbd));
   }

   public akm(akm$qs6 var1, fqr var2, vt2 var3, mew var4) {
      this.oyz = var1;
      this.afl = var4;
      this.m_f = var3;
      this.jhn = new fqr(var2.lvi, var2.gn5, var2.bn2);
   }

   public akm(EntityLivingBase var1, fqr var2) {
      this.oyz = akm$qs6.xvy;
      this.sc8 = var1;
      this.jhn = var2;
   }

   public mew _uf() {
      return this.afl;
   }

   @Override
   public String toString() {
      long var1 = a ^ 64327075720065L;
      return a<"j">(5312, 2574167925109384224L ^ var1)
         + this.oyz
         + a<"j">(4003, 6447243594072129344L ^ var1)
         + this.afl
         + a<"j">(29813, 8841965330335859860L ^ var1)
         + this.m_f
         + a<"j">(26168, 8066899950999672538L ^ var1)
         + this.jhn
         + a<"j">(18503, 8702078873103055009L ^ var1)
         + this.sc8
         + '}';
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7522374332906894815L, -4069765233481506225L, MethodHandles.lookup().lookupClass()).a(99210281461396L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 75291739306543L;
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
      String var6 = "ºü|»ã6$g\råþ\\\u0007©Ph ¨öÒ0²TT¢×\u000e+ìòA«Ý\u0091\u0010¼û&ûÉ¤/\u0088¾¨aY\"\u0003\u0018ýw\u0098LBÝGÒâ×\u008b/\u009ct+¥Ü¦\u009c\u0095\u0002¶óò";
      int var8 = "ºü|»ã6$g\råþ\\\u0007©Ph ¨öÒ0²TT¢×\u000e+ìòA«Ý\u0091\u0010¼û&ûÉ¤/\u0088¾¨aY\"\u0003\u0018ýw\u0098LBÝGÒâ×\u008b/\u009ct+¥Ü¦\u009c\u0095\u0002¶óò"
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

                  var6 = "²\u000652\u0086\u0003XN*Kçð\u0096¦\u001eF f\u009bõ\u0096\u0012³ñÖ\u00ad\u00152_à°\u0086ºê\u001d\b\\üÐ]Ø\u008d\u0015t1z)õ\u0092";
                  var8 = "²\u000652\u0086\u0003XN*Kçð\u0096¦\u001eF f\u009bõ\u0096\u0012³ñÖ\u00ad\u00152_à°\u0086ºê\u001d\b\\üÐ]Ø\u008d\u0015t1z)õ\u0092"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26714;
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
            throw new RuntimeException("akm", var10);
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
         throw new RuntimeException("akm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
