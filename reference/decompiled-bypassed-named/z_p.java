import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

@dr9$x0j(
   t2u = "t",
   io4 = {"<Module>"},
   hjc = "Toggle specified module."
)
public class z_p extends HwidProvider {
   private static final long a;
   private static final String d;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void xjl(String[] var1) {
      long var2 = a ^ 47582424246387L;
      int var4 = OpaquePredicate.b();

      try {
         if (var1.length < 1) {
            this.dhs();
            if (var4 != 0) {
               return;
            }
         }
      } catch (oov var9) {
         throw a(var9);
      }

      Module var5 = ClientState.qkk.getModuleRegistry().wv4(var1[0]);

      label41: {
         Module var10000;
         label40: {
            try {
               var10000 = var5;
               if (var4 == 0) {
                  break label40;
               }

               if (var5 == null) {
                  break label41;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var10000 = var5;
         }

         try {
            var10000.toggle();
            if (var4 != 0) {
               return;
            }
         } catch (oov var7) {
            boolean var10001 = false;
            throw a(var7);
         }
      }

      try {
         ncl.dob(d + var1[0] + ")");
      } catch (oov var6) {
         boolean var11 = false;
         throw a(var6);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6388340965369069053L, -823946946720341627L, MethodHandles.lookup().lookupClass()).a(122476470383619L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 44564568232591L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(":Î\u0086î\u0082ùï\u001fO!Ij×é#¹ûXÕ\u0088\u0003åi\u0006".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      d = var6;
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
}
