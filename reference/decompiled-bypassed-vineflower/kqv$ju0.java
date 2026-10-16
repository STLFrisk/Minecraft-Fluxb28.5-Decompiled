import com.google.common.collect.ComparisonChain;
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

public class kqv$ju0 extends zfj$yuc implements Comparable {
   public final dbw qwd;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public kqv$ju0(dbw var1, int var2) {
      super(var2);
      this.qwd = var1;
   }

   public int rgn(kqv$ju0 var1) {
      return ComparisonChain.start().compare(var1.ndz, this.ndz).compare(this.evz(), var1.evz()).result();
   }

   public int evz() {
      int var2 = this.qwd.in9().size();
      vt2[] var3 = vt2.values();
      int var10000 = t9d.b();
      int var4 = var3.length;
      int var1 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            vt2 var6 = var3[var5];
            var10000 = var2 + this.qwd.ebu(var6).size();
            if (var1 == 0) {
               break;
            }

            var2 = var10000;
            var5++;
            if (var1 != 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   @Override
   public String toString() {
      long var1 = a ^ 84905929595490L;
      return a<"h">(17356, 45049432836433184L ^ var1) + this.ndz + a<"h">(23738, 945607986228197975L ^ var1) + this.qwd + '}';
   }

   @Override
   public int compareTo(Object var1) {
      return this.rgn((kqv$ju0)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8928112831146529029L, -418749820683581890L, MethodHandles.lookup().lookupClass()).a(238997943979475L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 49310788945952L;
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
      String var6 = "ÿGÑsnïQXF¬\u0004®pòéû5PÆ¤Åm#2äèlD\u0015J\u0084ª0P¤*çÃ¯,@$Y\u008a\u0082=ÛÙ\u0007´Ê\u0081tÀ\u0006¹ê\u0010óµk85\u008c\u008f=ïÙè\u0018.sÈoï\\\u0080ãÙ)Ù";
      int var8 = "ÿGÑsnïQXF¬\u0004®pòéû5PÆ¤Åm#2äèlD\u0015J\u0084ª0P¤*çÃ¯,@$Y\u008a\u0082=ÛÙ\u0007´Ê\u0081tÀ\u0006¹ê\u0010óµk85\u008c\u008f=ïÙè\u0018.sÈoï\\\u0080ãÙ)Ù"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4332;
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
            throw new RuntimeException("kqv$ju0", var10);
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
         throw new RuntimeException("kqv$ju0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
