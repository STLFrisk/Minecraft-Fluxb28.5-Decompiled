import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.lang3.Validate;

public class cfu {
   public static HttpURLConnection htx(URL var0) {
      Validate.notNull(var0);
      HttpURLConnection var1 = (HttpURLConnection)var0.openConnection();
      var1.setConnectTimeout(15000);
      var1.setReadTimeout(15000);
      var1.setUseCaches(false);
      return var1;
   }

   public static String q4z(URL var0) {
      return new cfu().p6w(var0);
   }

   public native String p6w(URL var1);

   public static String bhl(String var0, String var1) {
      URL var4 = new URL(var0);
      URLConnection var5 = var4.openConnection();
      var5.setDoOutput(true);
      OutputStream var6 = var5.getOutputStream();
      PrintStream var7 = new PrintStream(var6);
      var7.print(var1);
      int var10000 = t9d.c();
      var7.close();
      InputStream var8 = var5.getInputStream();
      BufferedReader var9 = new BufferedReader(new InputStreamReader(var8));
      int var2 = var10000;
      String var11 = "";

      while (true) {
         String var10;
         if ((var10 = var9.readLine()) != null) {
            var11 = var11 + var10;

            try {
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (oov var12) {
               throw a(var12);
            }
         }

         var9.close();
         break;
      }

      return var11;
   }

   static {
      v6ma.Ex(0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
