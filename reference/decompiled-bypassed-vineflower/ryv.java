import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ryv extends _6f implements JsonSerializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xan deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      long var4 = a ^ 80119474250108L;
      JsonObject var6 = var1.getAsJsonObject();
      ekw var7 = (ekw)var3.deserialize(var6.get(a<"a">(21297, 5423267241584243836L ^ var4)), ekw.class);

      try {
         if (var7 == null) {
            throw new JsonParseException(a<"a">(3503, 1671610232848706275L ^ var4));
         }
      } catch (JsonParseException var9) {
         throw a(var9);
      }

      int var8 = f83.z2p(var6, a<"a">(4371, 9053873593514030681L ^ var4));
      return new xan(var7, var8);
   }

   public JsonElement dme(xan var1, Type var2, JsonSerializationContext var3) {
      long var4 = a ^ 100797915384603L;
      JsonObject var6 = new JsonObject();
      var6.addProperty(a<"a">(5642, 1754337958354443046L ^ var4), var1._27());
      var6.add(a<"a">(24824, 4793906379435716054L ^ var4), var3.serialize(var1.z0t()));
      return var6;
   }

   @Override
   public String xtu() {
      long var1 = a ^ 4681092204107L;
      return a<"a">(8528, 1025428365180707119L ^ var1);
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.dme((xan)var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6697792906418161798L, -6188620002362508711L, MethodHandles.lookup().lookupClass()).a(125830705609474L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 35506308353779L;
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
      String var6 = "öÆ»zPÞëÖ$\u0092 (Ûf¯\u008f\u00186d\u0084Í»\u0092¨\u0005\u0010Ø¿æ¶\u00ad×ß7\u008b\u0096\u0013ç?ZÍ RôWÎT÷g¯Mø\u0087\u009aÃoQ%\u007fnsaK1\u000b\b@<\u0011nH&p³\u0018aI1\u008a\u009eXº\u008bïT\u0088\u007f\u0087õùN\u001fÊ!ùF>§\u0081";
      int var8 = "öÆ»zPÞëÖ$\u0092 (Ûf¯\u008f\u00186d\u0084Í»\u0092¨\u0005\u0010Ø¿æ¶\u00ad×ß7\u008b\u0096\u0013ç?ZÍ RôWÎT÷g¯Mø\u0087\u009aÃoQ%\u007fnsaK1\u000b\b@<\u0011nH&p³\u0018aI1\u008a\u009eXº\u008bïT\u0088\u007f\u0087õùN\u001fÊ!ùF>§\u0081"
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

                  var6 = "ÂS\u0081üè¼«Èb\u008c\u008a?biO\u0000WW-\u0085Ê³\u001e\u000b3«\u0004ÉºsA\u0080\u0017¯ \u0006hz\u001a\u0017½Ð\u001e^\u0000A\u001ai \f$\u0089\u009fÀ=HÛ\u008f\fÂrBz\u0090çwú\u0085¾/\u009bðÎD[\u008e\u0096ù\u0096¶G";
                  var8 = "ÂS\u0081üè¼«Èb\u008c\u008a?biO\u0000WW-\u0085Ê³\u001e\u000b3«\u0004ÉºsA\u0080\u0017¯ \u0006hz\u001a\u0017½Ð\u001e^\u0000A\u001ai \f$\u0089\u009fÀ=HÛ\u008f\fÂrBz\u0090çwú\u0085¾/\u009bðÎD[\u008e\u0096ù\u0096¶G"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static JsonParseException a(JsonParseException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 87;
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
            throw new RuntimeException("ryv", var10);
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
         throw new RuntimeException("ryv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
