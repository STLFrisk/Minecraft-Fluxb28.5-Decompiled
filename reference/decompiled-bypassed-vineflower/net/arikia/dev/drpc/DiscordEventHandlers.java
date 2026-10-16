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
import net.arikia.dev.drpc.callbacks.DisconnectedCallback;
import net.arikia.dev.drpc.callbacks.ErroredCallback;
import net.arikia.dev.drpc.callbacks.JoinGameCallback;
import net.arikia.dev.drpc.callbacks.JoinRequestCallback;
import net.arikia.dev.drpc.callbacks.ReadyCallback;
import net.arikia.dev.drpc.callbacks.SpectateGameCallback;

public class DiscordEventHandlers extends Structure {
   public ReadyCallback ready;
   public DisconnectedCallback disconnected;
   public ErroredCallback errored;
   public JoinGameCallback joinGame;
   public SpectateGameCallback spectateGame;
   public JoinRequestCallback joinRequest;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public List getFieldOrder() {
      long var1 = a ^ 95771811641665L;
      String[] var3 = DiscordRPC.b();

      try {
         List var10000 = Arrays.asList(
            a<"w">(7640, 5548718315998260434L ^ var1),
            a<"w">(11294, 7838056482999082259L ^ var1),
            a<"w">(27964, 716090386793421877L ^ var1),
            a<"w">(13841, 3875061449960720154L ^ var1),
            a<"w">(17349, 2936138074388034253L ^ var1),
            a<"w">(9805, 6078534076318848833L ^ var1)
         );
         if (i2h.b() != null) {
            DiscordRPC.b(new String[2]);
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
      long var10000 = c.a(4417264497519973594L, -8866169277702921215L, MethodHandles.lookup().lookupClass()).a(102570348029277L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 41258495129548L;
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
      String var6 = "\u0086\u0099¥O=\u0010\t\u0089Ñg$\u0005»·ë\u0092\u001dÚ`ú`\u0084(/\u0010Úì³Ð´)Þ\n©¡\u00898t\u008d)\u001a\u0010Î¸«]pþ27µf3GÈÅ«¢ \u009d\"47ÄIòå¸_\u008dm¡-?ÄT×¥tL\u0001=HÝ~¿\u0085Ì\u0019»s";
      int var8 = "\u0086\u0099¥O=\u0010\t\u0089Ñg$\u0005»·ë\u0092\u001dÚ`ú`\u0084(/\u0010Úì³Ð´)Þ\n©¡\u00898t\u008d)\u001a\u0010Î¸«]pþ27µf3GÈÅ«¢ \u009d\"47ÄIòå¸_\u008dm¡-?ÄT×¥tL\u0001=HÝ~¿\u0085Ì\u0019»s"
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

                  var6 = "ð]I¢\b\u008bÊ\u000eë¤x\u0085pMpqd®1¨@±\u008eg/¶\u0093«õ\u008e¼{ æ0J>R!\u0088Ñ\u000eì\u0011¦Ç\u009eÅP°m\u009fö½\u0099\u0091\u007f\r\u008e^ì\u0004M4\u0084";
                  var8 = "ð]I¢\b\u008bÊ\u000eë¤x\u0085pMpqd®1¨@±\u008eg/¶\u0093«õ\u008e¼{ æ0J>R!\u0088Ñ\u000eì\u0011¦Ç\u009eÅP°m\u009fö½\u0099\u0091\u007f\r\u008e^ì\u0004M4\u0084"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31256;
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
            throw new RuntimeException("net/arikia/dev/drpc/DiscordEventHandlers", var10);
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
         throw new RuntimeException("net/arikia/dev/drpc/DiscordEventHandlers" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
