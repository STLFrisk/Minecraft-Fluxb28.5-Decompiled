import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import us.myles.ViaVersion.AbstractViaConfig;

public class i2n extends AbstractViaConfig {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public i2n(File var1) {
      super(var1);
      this.reloadConfig();
   }

   public URL getDefaultConfigURL() {
      long var1 = a ^ 128619593635488L;
      return this.getClass().getClassLoader().getResource(a<"k">(24980, 7256687294704267785L ^ var1));
   }

   public void handleConfig(Map var1) {
   }

   public List getUnsupportedOptions() {
      return rts;
   }

   public boolean isAntiXRay() {
      return false;
   }

   public boolean isItemCache() {
      return false;
   }

   public boolean isNMSPlayerTicking() {
      return false;
   }

   public boolean is1_12QuickMoveActionFix() {
      return false;
   }

   public String getBlockConnectionMethod() {
      long var1 = a ^ 66321338156321L;
      return a<"k">(2548, 3297536723759860198L ^ var1);
   }

   public boolean is1_9HitboxFix() {
      return false;
   }

   public boolean is1_14HitboxFix() {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2093347576177739886L, 2419783224840844426L, MethodHandles.lookup().lookupClass()).a(208444960382437L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 74710468399999L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[15];
      int var5 = 0;
      String var4 = "sáX\u0083Óë\u001a\u000eiBk\u0082Û\u0093ýWÈ\u008cU_Ó\rócF\\\u0098Y 0A\u0012À\u008a\u0001=üï·\u0093yZäÇÅ\u0099ûµ(ºf8É\u0087)ÓÃ7ë\u0099\u00195·äÑ\u0002\u0090§m|mÎ«Öü:J\u0091}µ\u0081×6â\b\rÁnp .I\u0006ÌÃ³X\u008c¨\u0002Ý¯0cª.\u0006¼\u008auÑmëÌ\u007f§_Ú{=Ì`0\\7U\u0014\u0006Àçk\u001eJ´K\u0019äô\u007f$\u009b\u0013\u0017ð\u0094\u007fÀ\u0001\u0085W\u0092íüá\u0012¿\r\u0019Yw]³°¨á\u0095(\u001fÀ\u009c%\u0010õi\u0006_<Õ\r\u0082\u007f×2å¿û(\u0083(ùI\u0007½a\u001eË\u000e\u0019ðt¦È\u0001\u0006·àTj\u0099+ ä¡\føløU¦V\u0005f\u000bü¼zcJ£0\u0095\u001dú@¡û,¾\u008f´¶øäY¬°Æ#ùó\u000fe÷\u0097'\u0092\u0011`¦\u0015Ñ´\u0090]?\u0095¦rn\u0094\u001fß\u0092¶!~\u0005Ù(\u0007Ö,\\¤ö\u007fKg£\u0094È±\u0086\u008dC\u0081]Ù¿d\u001e^Ðg#\bñ_\u0080M\u0087=\u0003Â±¸T!t(ml\u0002yâijÏkëÐ\u000b\u0094(`ä eJ\nW$L\u008bH\u008e$\u009b\u0017½!ÉÈ\u0001\u0091ê\u0014ì#Q \u008aÙÈ\u001e\u0011\u0015s\u0019\nô_\u0014º¢ót\u009c(^\nQ?~Í\u008aðZÒf\u009dE¬8\u0005Õ(£#¿K½ùÊoÃ¾u\u009cJ\b2\u0085\u0010æAå8'\rùÞí=kÎ8ï÷\u009b\u0092Ù\u001dLXF*7°QÖÜ\u0087Þ\u000b\u008f\u0097ðÒ> \u0095ccô.øìe°\nh 5c\u0001 \u0003\u008bD¾\u0080Þ\u001fp«¨`Ñ\u001c®\u0005¹(C¼\u0004\u00ad¼á\u008f<\u0097Ý?8\u00adU,ë\rW\u0015;Vªr/ß³\u0095ºÒÖÛBþ¨\u0018æøúi4";
      int var6 = "sáX\u0083Óë\u001a\u000eiBk\u0082Û\u0093ýWÈ\u008cU_Ó\rócF\\\u0098Y 0A\u0012À\u008a\u0001=üï·\u0093yZäÇÅ\u0099ûµ(ºf8É\u0087)ÓÃ7ë\u0099\u00195·äÑ\u0002\u0090§m|mÎ«Öü:J\u0091}µ\u0081×6â\b\rÁnp .I\u0006ÌÃ³X\u008c¨\u0002Ý¯0cª.\u0006¼\u008auÑmëÌ\u007f§_Ú{=Ì`0\\7U\u0014\u0006Àçk\u001eJ´K\u0019äô\u007f$\u009b\u0013\u0017ð\u0094\u007fÀ\u0001\u0085W\u0092íüá\u0012¿\r\u0019Yw]³°¨á\u0095(\u001fÀ\u009c%\u0010õi\u0006_<Õ\r\u0082\u007f×2å¿û(\u0083(ùI\u0007½a\u001eË\u000e\u0019ðt¦È\u0001\u0006·àTj\u0099+ ä¡\føløU¦V\u0005f\u000bü¼zcJ£0\u0095\u001dú@¡û,¾\u008f´¶øäY¬°Æ#ùó\u000fe÷\u0097'\u0092\u0011`¦\u0015Ñ´\u0090]?\u0095¦rn\u0094\u001fß\u0092¶!~\u0005Ù(\u0007Ö,\\¤ö\u007fKg£\u0094È±\u0086\u008dC\u0081]Ù¿d\u001e^Ðg#\bñ_\u0080M\u0087=\u0003Â±¸T!t(ml\u0002yâijÏkëÐ\u000b\u0094(`ä eJ\nW$L\u008bH\u008e$\u009b\u0017½!ÉÈ\u0001\u0091ê\u0014ì#Q \u008aÙÈ\u001e\u0011\u0015s\u0019\nô_\u0014º¢ót\u009c(^\nQ?~Í\u008aðZÒf\u009dE¬8\u0005Õ(£#¿K½ùÊoÃ¾u\u009cJ\b2\u0085\u0010æAå8'\rùÞí=kÎ8ï÷\u009b\u0092Ù\u001dLXF*7°QÖÜ\u0087Þ\u000b\u008f\u0097ðÒ> \u0095ccô.øìe°\nh 5c\u0001 \u0003\u008bD¾\u0080Þ\u001fp«¨`Ñ\u001c®\u0005¹(C¼\u0004\u00ad¼á\u008f<\u0097Ý?8\u00adU,ë\rW\u0015;Vªr/ß³\u0095ºÒÖÛBþ¨\u0018æøúi4"
         .length();
      char var3 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[15];
                     rts = Arrays.asList(
                        a<"k">(29122, 5217161584101500808L ^ var9),
                        a<"k">(22213, 5154112862387765384L ^ var9),
                        a<"k">(25150, 9053952092584096880L ^ var9),
                        a<"k">(21243, 860789095196427450L ^ var9),
                        a<"k">(28517, 8289957171621443882L ^ var9),
                        a<"k">(8551, 6149875090374293282L ^ var9),
                        a<"k">(30389, 5176128971062943990L ^ var9),
                        a<"k">(14021, 8333289020307234949L ^ var9),
                        a<"k">(21825, 6516069688525161225L ^ var9),
                        a<"k">(27548, 4634599734222863831L ^ var9),
                        a<"k">(22226, 8156194508861538454L ^ var9),
                        a<"k">(10708, 2802228084909571986L ^ var9),
                        a<"k">(24260, 4201906984127858829L ^ var9)
                     );
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0010 !ýãïÁMZ\u0006*åHáó\u0003}F,®¡Gãý¹\u0017C¯\u0001\u008exòÓ=dßM\u008eÅ\u0096(\u0017Þ®\u009f\u001fj\u009eÕÝÓ\nakcqí¦ñ@:¶Ã\u009eÕÚUÐÊÀ³\"T-\u0018I\u0000I\u0012¥\u0092";
                  var6 = "\u0010 !ýãïÁMZ\u0006*åHáó\u0003}F,®¡Gãý¹\u0017C¯\u0001\u008exòÓ=dßM\u008eÅ\u0096(\u0017Þ®\u009f\u001fj\u009eÕÝÓ\nakcqí¦ñ@:¶Ã\u009eÕÚUÐÊÀ³\"T-\u0018I\u0000I\u0012¥\u0092"
                     .length();
                  var3 = '(';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8800;
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
            throw new RuntimeException("i2n", var10);
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
         throw new RuntimeException("i2n" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
