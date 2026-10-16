import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

@dr9$x0j(
   t2u = "help",
   io4 = {""},
   hjc = "Display help for all commands."
)
public class ymr extends dr9 {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @Override
   public void xjl(String[] var1) {
      long var2 = a ^ 1319089754502L;
      int var4 = t9d.c();
      Iterator var5 = zwr.qkk.gt2().siv().iterator();

      label29:
      while (true) {
         if (var5.hasNext()) {
            dr9 var6 = (dr9)var5.next();
            String var7 = "." + var6.k1_() + "";
            String[] var8;
            int var9 = (var8 = var7.split("\n")).length;
            if (var4 != 0) {
               break;
            }

            int var10 = 0;

            while (var10 < var9) {
               Object var11 = var8[var10];
               ncl.dob(var11 + syo.u4m + " " + var6.clg());
               var10++;
               if (var4 != 0) {
                  continue label29;
               }

               if (var4 != 0) {
                  break;
               }
            }

            if (var4 == 0) {
               continue;
            }
         }

         ncl.dob(
            a<"t">(3218, 2873745327493651317L ^ var2)
               + syo.u4m
               + a<"t">(23216, 7945990448014708054L ^ var2)
               + syo.u4m
               + a<"t">(17454, 8380646049371542475L ^ var2)
         );
         break;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5598896129712244292L, -1423090974581126958L, MethodHandles.lookup().lookupClass()).a(163367106778443L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11719755037194L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u008d³ú\u009aüS®\u0007\u0083³µ5Êº»|Ë\u0089\rRÚcÐúV\u001f^[S\"ë¿^c_n\u000b(\u0019G5Ú:Ú%\u008f¾¨8ùX\t]/IÁf\u0012\u0091Åb\u0001Â[¼þW\u0006Å\u0004fLKÍ5kñÌ|Â\u0090î,\b\u001d\u001eîËòzÅ(`ë\u0083»f#\u000f,\u0016s]%\u0087\u0010Ð\u009dÐÂ×ñ\"\u0017 !õ\u009cû\u0087ã@";
      int var8 = "\u008d³ú\u009aüS®\u0007\u0083³µ5Êº»|Ë\u0089\rRÚcÐúV\u001f^[S\"ë¿^c_n\u000b(\u0019G5Ú:Ú%\u008f¾¨8ùX\t]/IÁf\u0012\u0091Åb\u0001Â[¼þW\u0006Å\u0004fLKÍ5kñÌ|Â\u0090î,\b\u001d\u001eîËòzÅ(`ë\u0083»f#\u000f,\u0016s]%\u0087\u0010Ð\u009dÐÂ×ñ\"\u0017 !õ\u009cû\u0087ã@"
         .length();
      char var5 = '0';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8421;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ymr", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("ymr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
