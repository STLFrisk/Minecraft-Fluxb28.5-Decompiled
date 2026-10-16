import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f5a {
   private static final gdz ugp;
   private final lc5 tkr;
   private final Map quu = Maps.newHashMap();

   public f5a(lc5 var1) {
      this.tkr = var1;
   }

   public void qxz(ucr var1) {
      f5a$yqd.ogj(this.xi1(var1));
   }

   public void wzl(ucr var1, boolean var2) {
      f5a$yqd.toe(this.xi1(var1), var2);
   }

   private f5a$yqd xi1(ucr var1) {
      int var2 = OpaquePredicate.c();
      f5a$yqd var3 = (f5a$yqd)this.quu.get(var1.tg4);

      try {
         if (var2 != 0) {
            return var3;
         }

         if (var3 != null) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 = new f5a$yqd(this, var1, null);
      this.quu.put(var1.tg4, var3);
      return var3;
   }

   public void wge() {
      int var1 = OpaquePredicate.c();
      Iterator var2 = this.quu.values().iterator();

      while (true) {
         if (var2.hasNext()) {
            f5a$yqd var3 = (f5a$yqd)var2.next();

            try {
               this.tkr.cez(f5a$yqd.uxl(var3));
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         this.quu.clear();
         break;
      }
   }

   public static lc5 y66(f5a var0) {
      return var0.tkr;
   }

   public static gdz zix() {
      return ugp;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5480697529208635430L, -9090514184875788959L, MethodHandles.lookup().lookupClass()).a(53489274621779L);
      // $VF: monitorexit
      long var4 = var10000 ^ 43285005376659L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("UAó\u0094XO+VË*\u0011hR5xÖ\u00adù§»êUùno\u0001¨gÛþ\u0003¬".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      ugp = new gdz(var0);
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
}
