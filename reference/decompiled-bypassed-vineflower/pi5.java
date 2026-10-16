import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;

public class pi5 implements yaa {
   private static final long a;
   private static final String b;

   @Override
   public gdz yad() {
      return null;
   }

   @Override
   public InputStream f_4() {
      long var1 = a ^ 69920043205245L;
      double var3 = 0.7124999999999999;
      return IOUtils.toInputStream(String.format(b, var3, var3, var3));
   }

   @Override
   public boolean z75() {
      return false;
   }

   @Override
   public z08 yrs(String var1) {
      return null;
   }

   @Override
   public String rlm() {
      return null;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2570973748629901657L, -1255112200320155631L, MethodHandles.lookup().lookupClass()).a(127247177825777L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 136837325212059L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "=\u0099J_Ï«¿Ñ\u0091&0ºsßÿr\u001a\u008f&Ð1\u0010ö^\"y\u00adRÌ\u0011\u009e\u0004½ÿ¥.'Â]¸\u0095 úf|°\n\u0017à\u001b×;\u0093£¹ª\u007fèh¼w\u001c®y\u00ad\u0012\u0094¶ùë\u0014Ïn·\u0089Ü\\\u001307È=±[é2\u0015!loQÎw\u0082ÃI4ÓKTe¨\u0002\u0004\u0017\u0014\u0082[ä ¸<b\u00adÜ\u0098\u0010\u0004LX>\u00adô\t¥*³Æ¡\u0010MÈfZmÃwM\u008d{DÚ\u0096STõF\u008b\u0003%óF+à¸´'\u0005\u008dB\u008aEùV\u0006Ü=\u0099 \u001f_æ¬\u0018\n2\u0007ÈO\u008fÝq|óüì\u0004×\u0007\u0081u%(~=\u009aLk¬à\u0099Rn\u008aï|¡\u0084\u0086^5Ã\u00819µ\u0095g\u00ad\u0095 Pôä$\u008c\u0011íÏO\u0005iã2V\u0013á\u008b\u0003¡g\u0085\u0086¿À&½ÑSg\\ñ\t\u0085×rà\u000bî:ña]@\u0085nÆÈÜï¡Ö\u0014A\u008a?Æ¾·F,Zå\u009fô#~F717\u0013íàââó\u009f9,&\u0001\u001bìg\u0000\u0084\u00838G\u009eÚ{ùY\t\u0081b\t\u0018ç²±\u0014\u008cJûjx\b\u0002|)Î\u0014²3LÛn\u0096õlw\u0092îá\u009ce\u0010\u009eÇ0"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
