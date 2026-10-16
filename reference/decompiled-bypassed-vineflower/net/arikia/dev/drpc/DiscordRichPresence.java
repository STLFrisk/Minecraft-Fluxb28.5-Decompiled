package net.arikia.dev.drpc;

import com.sun.jna.Structure;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DiscordRichPresence extends Structure {
   public String state;
   public String details;
   public long startTimestamp;
   public long endTimestamp;
   public String largeImageKey;
   public String largeImageText;
   public String smallImageKey;
   public String smallImageText;
   public String partyId;
   public int partySize;
   public int partyMax;
   @Deprecated
   public String matchSecret;
   public String spectateSecret;
   public String joinSecret;
   @Deprecated
   public int instance;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public List getFieldOrder() {
      long var1 = a ^ 139298844064850L;
      String[] var3 = DiscordRPC.b();

      try {
         List var10000 = Arrays.asList(
            a<"a">(17747, 8874649214487063633L ^ var1),
            a<"a">(2221, 7112354291452551595L ^ var1),
            a<"a">(3173, 4802271289026880870L ^ var1),
            a<"a">(1783, 7836518786868359159L ^ var1),
            a<"a">(5916, 703514328728452627L ^ var1),
            a<"a">(29764, 3031357746315615561L ^ var1),
            a<"a">(28948, 508304231058135069L ^ var1),
            a<"a">(28788, 4261354574225627505L ^ var1),
            a<"a">(16981, 1894483455760198493L ^ var1),
            a<"a">(30178, 3877314510739070182L ^ var1),
            a<"a">(31713, 2155369010969760486L ^ var1),
            a<"a">(4073, 2155610578709358311L ^ var1),
            a<"a">(26659, 8587872086902194472L ^ var1),
            a<"a">(13647, 3714102091523562563L ^ var1),
            a<"a">(26409, 1154581891722268195L ^ var1)
         );
         if (var3 == null) {
            i2h.b(new i2h[4]);
         }

         return var10000;
      } catch (oov var4) {
         throw a(var4);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(815414146519001156L, -2526344236871109318L, MethodHandles.lookup().lookupClass()).a(126388427693801L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 30565765741796L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = ";cðjØ` Z\u0094p\u0092\u008aÓÀ<x¨Øûo0²CZ1¡H&P\u0014Á\u007f ºó\u0094ô÷\u001fÕÖkà\u0084E\u000epî¤à\u0086¾Àbþ\u009a*þcÄînsÐÖ \u009bû\u009fÀ\u0014jÊ)¶{K-º¹`kbUH%À\u001c\u0019}Sê\u001c\u008dníÇî\u0018$Ó³Âu!ÍlQA»\u008fþu¤%$b[Ä\b\u001dkU gv+³Óh2³ÅXÚ\u0086\n\u0001ó\u007fUc<*LS@\u0085®RÉ\u009cÂiTL \u0095\bÇgà\u0085a÷`Í×uý3\u008fËs\u001eøåc\u0090¥{,v\\Eª\u009fvÙ\u0010\u0007<\fAø\u00840\u008fÝ\u0085\u0096Æ\u0080¸\u0006 \u0018\u0015©iü5®ÌÒY\u0003IäÅ~YãS©PØæle¶\u0010;q\f\u008a\u0003àû\u008a(ÿ'\u0096ì´S$ Oví@¸f9äúÅÃ¿Uá²ààGºM(ÞÿcM\t¶>\u0091¤i\u0091\u0018\u009b\u007f¦ùÒ2&Ê(qýÍ\u0003mÊ$\u008b«dÇµí\u009bä ²\u0000¨òìû¥u!¤XUÑ\u0000ß\u0084ÆÐøzFÞ[¬N¨Ô2\u008fÔEw\u0010Óº\u0004åXÓ-µ¥¸\fÀà\u0090+R";
      int var8 = ";cðjØ` Z\u0094p\u0092\u008aÓÀ<x¨Øûo0²CZ1¡H&P\u0014Á\u007f ºó\u0094ô÷\u001fÕÖkà\u0084E\u000epî¤à\u0086¾Àbþ\u009a*þcÄînsÐÖ \u009bû\u009fÀ\u0014jÊ)¶{K-º¹`kbUH%À\u001c\u0019}Sê\u001c\u008dníÇî\u0018$Ó³Âu!ÍlQA»\u008fþu¤%$b[Ä\b\u001dkU gv+³Óh2³ÅXÚ\u0086\n\u0001ó\u007fUc<*LS@\u0085®RÉ\u009cÂiTL \u0095\bÇgà\u0085a÷`Í×uý3\u008fËs\u001eøåc\u0090¥{,v\\Eª\u009fvÙ\u0010\u0007<\fAø\u00840\u008fÝ\u0085\u0096Æ\u0080¸\u0006 \u0018\u0015©iü5®ÌÒY\u0003IäÅ~YãS©PØæle¶\u0010;q\f\u008a\u0003àû\u008a(ÿ'\u0096ì´S$ Oví@¸f9äúÅÃ¿Uá²ààGºM(ÞÿcM\t¶>\u0091¤i\u0091\u0018\u009b\u007f¦ùÒ2&Ê(qýÍ\u0003mÊ$\u008b«dÇµí\u009bä ²\u0000¨òìû¥u!¤XUÑ\u0000ß\u0084ÆÐøzFÞ[¬N¨Ô2\u008fÔEw\u0010Óº\u0004åXÓ-µ¥¸\fÀà\u0090+R"
         .length();
      char var5 = ' ';
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
                     c = new String[15];
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

                  var6 = "qQ|Z;åkÏËÌC\u0080®\u000fÚ(Ö¹¢]²À\u008e]\u0018±ïö\u0088®\u0000f\u0005sE-ÛSA\u0087\u008bÜ\u0091*D\nTÈm";
                  var8 = "qQ|Z;åkÏËÌC\u0080®\u000fÚ(Ö¹¢]²À\u008e]\u0018±ïö\u0088®\u0000f\u0005sE-ÛSA\u0087\u008bÜ\u0091*D\nTÈm".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26955;
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
            throw new RuntimeException("net/arikia/dev/drpc/DiscordRichPresence", var10);
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
         throw new RuntimeException("net/arikia/dev/drpc/DiscordRichPresence" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
