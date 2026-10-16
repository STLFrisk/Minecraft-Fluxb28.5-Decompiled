import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import us.myles.ViaVersion.api.platform.ViaInjector;
import us.myles.ViaVersion.util.GsonUtil;
import us.myles.viaversion.libs.gson.JsonObject;

public class ff2 implements ViaInjector {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void inject() {
   }

   public void uninject() {
   }

   public int getServerProtocolVersion() {
      return this.byv();
   }

   private int byv() {
      return 47;
   }

   public String getEncoderName() {
      long var1 = a ^ 43106434821808L;
      return a<"x">(2506, 699982270770785213L ^ var1);
   }

   public String getDecoderName() {
      long var1 = a ^ 81912251148988L;
      return a<"x">(16389, 3472397391550457465L ^ var1);
   }

   public JsonObject getDump() {
      long var1 = a ^ 110239873566733L;
      JsonObject var3 = new JsonObject();

      try {
         var3.add(
            a<"x">(13953, 2041714475192005193L ^ var1),
            GsonUtil.getGson()
               .toJsonTree(
                  Arrays.stream(Class.forName(a<"x">(24362, 9213277180224134113L ^ var1)).getDeclaredMethods()).map(Method::toString).toArray(ff2::g_4)
               )
         );
      } catch (ClassNotFoundException var6) {
      }

      try {
         var3.add(
            a<"x">(562, 2198309954599585531L ^ var1),
            GsonUtil.getGson()
               .toJsonTree(
                  Arrays.stream(Class.forName(a<"x">(23353, 7312024378355802101L ^ var1)).getDeclaredMethods()).map(Method::toString).toArray(ff2::lvm)
               )
         );
      } catch (ClassNotFoundException var5) {
      }

      return var3;
   }

   private static String[] lvm(int var0) {
      return new String[var0];
   }

   private static String[] g_4(int var0) {
      return new String[var0];
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9045826448900142202L, 4494667366509577288L, MethodHandles.lookup().lookupClass()).a(176542510341109L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 81855773250221L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "©í\u0004ç)2\u001a\u0005äù\u0081Ñ,åTÀ>^?¨\bÈÛ8Ë:Â¬wsçíàQ\u0092>O©uÚ(Æ>[Ñ\u0097ó\\ÈëÀ¦Ë4\u0005`\u001a\u0011T£\u0093\u0099a\u000f\u001d£ýX\u0015j¡t\u0086\u001c?ÐÝÄEG¿\u0018\u008e\u009e\u0094îÔ\u001bo,d7é4i\b+óm\u0013³:k¦þH0Úì¦bÄ\u0001\u0002ÀZaÊ\u0000¶\u0005\u0002©\u0090ÖE\u0083Ùý\u0013/P\u0096\u0096M£\u0004\u001f³rÀ\u0004tk\bB«ªZÑ}\u0086OÈ°";
      int var8 = "©í\u0004ç)2\u001a\u0005äù\u0081Ñ,åTÀ>^?¨\bÈÛ8Ë:Â¬wsçíàQ\u0092>O©uÚ(Æ>[Ñ\u0097ó\\ÈëÀ¦Ë4\u0005`\u001a\u0011T£\u0093\u0099a\u000f\u001d£ýX\u0015j¡t\u0086\u001c?ÐÝÄEG¿\u0018\u008e\u009e\u0094îÔ\u001bo,d7é4i\b+óm\u0013³:k¦þH0Úì¦bÄ\u0001\u0002ÀZaÊ\u0000¶\u0005\u0002©\u0090ÖE\u0083Ùý\u0013/P\u0096\u0096M£\u0004\u001f³rÀ\u0004tk\bB«ªZÑ}\u0086OÈ°"
         .length();
      char var5 = '(';
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
                     c = new String[6];
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

                  var6 = "ì6ºã'fø\u0016_\rÊb|QB`\u0099\u001e\u0005·»Q\u0013ØRÅlíÌú¼Ñ5\u0097îÀÃ\u009b©\\\u001f\u0086e©Å\b\u0098a b`e$ÍNtç\u0017«á\u0080\b\u0007\u0091\u008c\u000f\u000eV<^9×\u009dû;Ç.TVÇi";
                  var8 = "ì6ºã'fø\u0016_\rÊb|QB`\u0099\u001e\u0005·»Q\u0013ØRÅlíÌú¼Ñ5\u0097îÀÃ\u009b©\\\u001f\u0086e©Å\b\u0098a b`e$ÍNtç\u0017«á\u0080\b\u0007\u0091\u008c\u000f\u000eV<^9×\u009dû;Ç.TVÇi"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20200;
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
            throw new RuntimeException("ff2", var10);
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
         throw new RuntimeException("ff2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
