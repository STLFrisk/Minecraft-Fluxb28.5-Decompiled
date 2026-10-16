import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import tv.twitch.AuthToken;

public class gwo$1 extends Thread {
   public final Property _jy;
   public final gwo hrj;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public gwo$1(gwo var1, String var2, Property var3) {
      super(var2);
      this.hrj = var1;
      this._jy = var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void run() {
      long var1 = a ^ 30544092226272L;
      int var3 = OpaquePredicate.c();

      try {
         URL var4 = new URL(a<"e">(14562, 3001381118754017281L ^ var1) + URLEncoder.encode(this._jy.getValue(), a<"e">(27078, 9102309270785720616L ^ var1)));
         String var5 = crb.qq0(var4);
         JsonObject var6 = f83._yv(new JsonParser().parse(var5), a<"e">(15490, 5709015336372982895L ^ var1));
         JsonObject var7 = f83.lhy(var6, a<"e">(10576, 3296099046777405882L ^ var1));

         label52: {
            label48: {
               try {
                  if (var3 != 0) {
                     break label52;
                  }

                  if (!f83.f68(var7, a<"e">(21212, 4810196803945740855L ^ var1))) {
                     break label48;
                  }
               } catch (IOException var12) {
                  throw a(var12);
               }

               String var8 = f83.sjp(var7, a<"e">(16067, 1058379163424413228L ^ var1));
               gwo.zyr().debug(gwo.fd3, a<"e">(6779, 920318323286864530L ^ var1), new Object[]{var8});
               AuthToken var9 = new AuthToken();

               try {
                  var9.data = this._jy.getValue();
                  gwo.mm7(this.hrj).mny(var8, var9);
                  gwo.tzz(this.hrj).aqm(var8);
                  gwo.tzz(this.hrj).eld(var9);
                  Runtime.getRuntime().addShutdownHook(new gwo$1$1(this, a<"e">(31689, 4784525984652858149L ^ var1)));
                  gwo.mm7(this.hrj).i0i();
                  gwo.tzz(this.hrj).w33();
                  if (var3 == 0) {
                     return;
                  }
               } catch (IOException var11) {
                  boolean var10001 = false;
                  throw a(var11);
               }
            }

            try {
               gwo.g3e(this.hrj, tyh$s04.dq2);
            } catch (IOException var10) {
               boolean var14 = false;
               throw a(var10);
            }
         }

         gwo.zyr().error(gwo.fd3, a<"e">(10923, 7773169499752809033L ^ var1));
      } catch (IOException var13) {
         gwo.g3e(this.hrj, tyh$s04._j7);
         gwo.zyr().error(gwo.fd3, a<"e">(27868, 2869359662300988468L ^ var1), var13);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8572928896299453518L, -8611536834098446274L, MethodHandles.lookup().lookupClass()).a(49616746749383L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 32679182219128L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = ")´Â\u0099¾[×\u009bùº\u0013È´ ø3\u0010sÓµ\u009dJA$æÑè\u008f\u0091ÉÌ%o@\u001f¡-\bw&wÁ¬¸¯Ñö&ð O³Bøé\u00037à¢Ë3§mÛ!®@1\u00946Ï\u0000æ\u0086&ÔØ\u0096\u0092Ö¸\\Gõ\u009c?éè\u0086\u009d~Ã\u0086\u0005o³}nP²%*ö¢k>ä\u0083ÇÏZ\u0094¬A¦ë4q\u008b~ô8ù¥\u0003Á©»â\u008bP\tk\u0096\u001a¶Ô\u0093ä0¿Ä1ÆT\u007f®õ¬Þx\u0095ü/C\u007f\u0081æ\u001cè\u0086»@:H'}ZV·SYBÑw;\u0002\u0089\u0017\u001048ñtï\u0084%j{Ö\u001eÇ\u0085/\u009c\t\u0018íØ\u001aí\u0086Âäç\n\u0000¡\nd\u000fÛ_\fåe_wiêx(LðÎ\u009bdçw\u001c\u0087N\u0094è\u0090@Îè&\u008bB\u0098rp3\u00153t0Ïá\t)É\u0091àôÞEËp\u009b\u0018â\u000e,\\Þz\u008f«`\u0005Ç±\\î\u009f\u0089#gÜµ\u0005\u009f ë";
      int var8 = ")´Â\u0099¾[×\u009bùº\u0013È´ ø3\u0010sÓµ\u009dJA$æÑè\u008f\u0091ÉÌ%o@\u001f¡-\bw&wÁ¬¸¯Ñö&ð O³Bøé\u00037à¢Ë3§mÛ!®@1\u00946Ï\u0000æ\u0086&ÔØ\u0096\u0092Ö¸\\Gõ\u009c?éè\u0086\u009d~Ã\u0086\u0005o³}nP²%*ö¢k>ä\u0083ÇÏZ\u0094¬A¦ë4q\u008b~ô8ù¥\u0003Á©»â\u008bP\tk\u0096\u001a¶Ô\u0093ä0¿Ä1ÆT\u007f®õ¬Þx\u0095ü/C\u007f\u0081æ\u001cè\u0086»@:H'}ZV·SYBÑw;\u0002\u0089\u0017\u001048ñtï\u0084%j{Ö\u001eÇ\u0085/\u009c\t\u0018íØ\u001aí\u0086Âäç\n\u0000¡\nd\u000fÛ_\fåe_wiêx(LðÎ\u009bdçw\u001c\u0087N\u0094è\u0090@Îè&\u008bB\u0098rp3\u00153t0Ïá\t)É\u0091àôÞEËp\u009b\u0018â\u000e,\\Þz\u008f«`\u0005Ç±\\î\u009f\u0089#gÜµ\u0005\u009f ë"
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
                     c = new String[10];
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

                  var6 = "\u0006y¬\u0088P2!®ï?Â\u0087»sÞsj\u0090CA\u001c+%\u009eÁèC:w\u0014íèõï/nU{\u001d\u0001na~ùXÚï\u0089\u001eZ\u001d:Â@\u0093¹:óÍßð¾vAP\u0005ÁP'd\u009a\u0085JG\u0012uPv!µ\u008b¢\u0086\u0019Íj,þÆ\u0085Ë¹\u0001RíNÛ\u009b\fck)\u0010g,R=\u000e%F\u009fZ¼]ä\u008d_ÑísN\nÐ\u0018\n¢\u001f\u001b\u0091ô?B5x{ÿu\u008aÐ}à»´\r\u007f";
                  var8 = "\u0006y¬\u0088P2!®ï?Â\u0087»sÞsj\u0090CA\u001c+%\u009eÁèC:w\u0014íèõï/nU{\u001d\u0001na~ùXÚï\u0089\u001eZ\u001d:Â@\u0093¹:óÍßð¾vAP\u0005ÁP'd\u009a\u0085JG\u0012uPv!µ\u008b¢\u0086\u0019Íj,þÆ\u0085Ë¹\u0001RíNÛ\u009b\fck)\u0010g,R=\u000e%F\u009fZ¼]ä\u008d_ÑísN\nÐ\u0018\n¢\u001f\u001b\u0091ô?B5x{ÿu\u008aÐ}à»´\r\u007f"
                     .length();
                  var5 = '@';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IOException a(IOException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24626;
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
            throw new RuntimeException("gwo$1", var10);
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
         throw new RuntimeException("gwo$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
