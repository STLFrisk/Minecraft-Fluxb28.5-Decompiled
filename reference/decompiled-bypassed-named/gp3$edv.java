import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gp3$edv implements JsonDeserializer {
   private static final long a;
   private static final String b;

   public gp3 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      List var5 = this.u63(var3, var4);
      return new gp3((Collection)var5);
   }

   public List u63(JsonDeserializationContext var1, JsonObject var2) {
      long var3 = a ^ 36608851246457L;
      JsonObject var6 = f83.lhy(var2, b);
      int var10000 = OpaquePredicate.c();
      ArrayList var7 = Lists.newArrayList();
      Iterator var8 = var6.entrySet().iterator();
      int var5 = var10000;

      while (true) {
         if (var8.hasNext()) {
            Entry var9 = (Entry)var8.next();

            try {
               var11 = var7;
               if (var5 != 0) {
                  break;
               }

               var7.add(this.ppf(var1, var9));
               if (var5 == 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         var11 = var7;
         break;
      }

      return var11;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public gp3$nnc ppf(JsonDeserializationContext var1, Entry var2) {
      String var4 = (String)var2.getKey();
      int var10000 = OpaquePredicate.c();
      ArrayList var5 = Lists.newArrayList();
      int var3 = var10000;
      JsonElement var6 = (JsonElement)var2.getValue();

      label57: {
         try {
            boolean var13 = var6.isJsonArray();
            if (var3 != 0) {
               return new gp3$nnc(var4, var5);
            }

            if (!var13) {
               break label57;
            }
         } catch (oov var11) {
            throw a(var11);
         }

         Iterator var7 = var6.getAsJsonArray().iterator();

         while (true) {
            if (var7.hasNext()) {
               JsonElement var8 = (JsonElement)var7.next();

               try {
                  var5.add((gp3$by5)var1.deserialize(var8, gp3$by5.class));
                  if (var3 != 0) {
                     return new gp3$nnc(var4, var5);
                  }

                  if (var3 == 0) {
                     continue;
                  }
               } catch (oov var12) {
                  throw a(var12);
               }
            }

            try {
               if (var3 == 0) {
                  return new gp3$nnc(var4, var5);
               }
               break;
            } catch (oov var10) {
               boolean var10001 = false;
               throw a(var10);
            }
         }
      }

      try {
         var5.add((gp3$by5)var1.deserialize(var6, gp3$by5.class));
         return new gp3$nnc(var4, var5);
      } catch (oov var9) {
         boolean var15 = false;
         throw a(var9);
      }
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3554994940439111168L, 8955456952282959470L, MethodHandles.lookup().lookupClass()).a(253445379573147L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 108504676498967L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¡\u001d\u0004cU½î\u009e@Øç[\u0094ÿ\u0082¢".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
