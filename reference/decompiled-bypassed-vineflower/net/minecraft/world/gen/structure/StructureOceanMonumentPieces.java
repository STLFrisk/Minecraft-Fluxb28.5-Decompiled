package net.minecraft.world.gen.structure;

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

public class StructureOceanMonumentPieces {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void hi_() {
      long var0 = a ^ 52712586514770L;
      v8a.kem(StructureOceanMonumentPieces$MonumentBuilding.class, a<"u">(9479, 4200586350391177438L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$MonumentCoreRoom.class, a<"u">(25039, 5961966665481548821L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$DoubleXRoom.class, a<"u">(20446, 5224733964902062592L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$DoubleXYRoom.class, a<"u">(4710, 2911136317024307134L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$DoubleYRoom.class, a<"u">(10897, 4625599362999467854L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$DoubleYZRoom.class, a<"u">(21950, 1804380453673386090L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$DoubleZRoom.class, a<"u">(7233, 1847856932743973276L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$EntryRoom.class, a<"u">(2841, 429055762506424002L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$Penthouse.class, a<"u">(6231, 1998632313592384898L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$SimpleRoom.class, a<"u">(17183, 3910494899210180297L ^ var0));
      v8a.kem(StructureOceanMonumentPieces$SimpleTopRoom.class, a<"u">(11308, 4573651126309534192L ^ var0));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1435765709198584885L, 1595757907842658658L, MethodHandles.lookup().lookupClass()).a(171948237677323L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 55857675188319L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "\u007f¶Ù\u001bú°2\u0019\u001e\\\u0093¼O?ýÂýY¡Ï\u0099©\u0002\u0095\u0010º\u0081º»\u000f?¤K_òª¦ôbE@\u0010\u0014~\u001e\u009aË6v©(\u0013-wY Q\r\u0010\u009a¿E²»¼ë\u00949\u0011\bîNÍüà\u0010wssÜ=\u0012:¬\u0018µ\u001fM\u0004W\u0011ã\u0010Ú¼g~õ·\u0094ñ6¿½è\u0093E^\u0005\u0010,9@©\u0081Hò±`¬\"¤áOÓ+\u0010ç¯\u0014üºå\u0007ÄCÕ×1#Ü\n\r\u0010Z&ü\u0001)\u0091·è_;º\u000e\",v\u009b";
      int var8 = "\u007f¶Ù\u001bú°2\u0019\u001e\\\u0093¼O?ýÂýY¡Ï\u0099©\u0002\u0095\u0010º\u0081º»\u000f?¤K_òª¦ôbE@\u0010\u0014~\u001e\u009aË6v©(\u0013-wY Q\r\u0010\u009a¿E²»¼ë\u00949\u0011\bîNÍüà\u0010wssÜ=\u0012:¬\u0018µ\u001fM\u0004W\u0011ã\u0010Ú¼g~õ·\u0094ñ6¿½è\u0093E^\u0005\u0010,9@©\u0081Hò±`¬\"¤áOÓ+\u0010ç¯\u0014üºå\u0007ÄCÕ×1#Ü\n\r\u0010Z&ü\u0001)\u0091·è_;º\u000e\",v\u009b"
         .length();
      char var5 = 24;
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
                     c = new String[11];
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

                  var6 = ":(É\u0091\u0002À·y\u0093\u008cÞ\u0087D\u0007\u000e\u0088 h\u0083\u0095M\u0082)ñ`\u0085áCµ\u008büù\u0018\u009bÕÁ\u0083xFVÙÖÉÂ¶\u008fC¿Èzé\u008aÞ\u0005\u008e?Á";
                  var8 = ":(É\u0091\u0002À·y\u0093\u008cÞ\u0087D\u0007\u000e\u0088 h\u0083\u0095M\u0082)ñ`\u0085áCµ\u008büù\u0018\u009bÕÁ\u0083xFVÙÖÉÂ¶\u008fC¿Èzé\u008aÞ\u0005\u008e?Á"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26368;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureOceanMonumentPieces", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureOceanMonumentPieces" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
