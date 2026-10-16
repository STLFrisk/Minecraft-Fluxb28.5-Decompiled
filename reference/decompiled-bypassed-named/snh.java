import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;

public abstract class snh implements g68 {
   public final File bdn;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public snh(File var1) {
      this.bdn = var1;
   }

   private static String _d7(gdz var0) {
      long var1 = b ^ 65655408132945L;
      return String.format(a<"q">(23220, 5307129187919115960L ^ var1), a<"q">(603, 193790057815961174L ^ var1), var0._a7(), var0.xyp());
   }

   public static String cla(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   @Override
   public InputStream e77(gdz var1) {
      return this.m0v(_d7(var1));
   }

   @Override
   public boolean g1w(gdz var1) {
      return this.yen(_d7(var1));
   }

   public abstract InputStream m0v(String var1);

   public abstract boolean yen(String var1);

   public void mcb(String var1) {
      long var2 = b ^ 124237258085435L;
      js1.warn(a<"q">(31084, 5711945449230254607L ^ var2), new Object[]{var1, this.bdn});
   }

   @Override
   public z08 ui7(if1 var1, String var2) {
      long var3 = b ^ 4593252072458L;
      return xey(var1, this.m0v(a<"q">(17926, 4070038883692270930L ^ var3)), var2);
   }

   public static z08 xey(if1 var0, InputStream var1, String var2) {
      Object var3 = null;
      BufferedReader var4 = null;

      try {
         var4 = new BufferedReader(new InputStreamReader(var1, Charsets.UTF_8));
         var3 = new JsonParser().parse(var4).getAsJsonObject();
      } catch (RuntimeException var9) {
         throw new JsonParseException(var9);
      } finally {
         IOUtils.closeQuietly(var4);
      }

      return var0.oom(var2, (JsonObject)var3);
   }

   @Override
   public BufferedImage rry() {
      long var1 = b ^ 110709193640876L;
      return p9t.h3z(this.m0v(a<"q">(1334, 3068369596412158405L ^ var1)));
   }

   @Override
   public String qw5() {
      return this.bdn.getName();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5622947818081016424L, 2095444595509851483L, MethodHandles.lookup().lookupClass()).a(88871538379247L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 123217457851203L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "B<\r\u009a\u0092aæ¨D9N¹Í\u0083à.\u0018¯NÖ\u009fè©AEì}\u0088µdñRÊâ¶Pýûåå\u001e Wuã2h\u0015î0e½åO½!'Â\u007f\u009e\u0095\u009f*\u00ad0\u0005,°Ù\u009e<8hÆ";
      int var8 = "B<\r\u009a\u0092aæ¨D9N¹Í\u0083à.\u0018¯NÖ\u009fè©AEì}\u0088µdñRÊâ¶Pýûåå\u001e Wuã2h\u0015î0e½åO½!'Â\u007f\u009e\u0095\u009f*\u00ad0\u0005,°Ù\u009e<8hÆ"
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
                     c = var9;
                     d = new String[5];
                     js1 = LogManager.getLogger();
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

                  var6 = "Á*\u0083\u0001_\nÏ\u007f\u001f?Â]R+m©\n\u0000\u001bdøO!\u007fç²(Å3lC°X¼ê\u001fâüCm\r /F\u0089.Â\u0002²\u001dà\u001d7W^'Kö\tî6Á_H\u0086~Zê{8\u009fÍÎn\u0090ñY\u008cR4&á\n\u0086E¡3Í¨0\"¤\u00166¤M\u0018!æÄ%æ|»\n\u0094\u001c5\u008b\u009ay[\u009d·û:\u0095%\u0013\u0093Ñ";
                  var8 = "Á*\u0083\u0001_\nÏ\u007f\u001f?Â]R+m©\n\u0000\u001bdøO!\u007fç²(Å3lC°X¼ê\u001fâüCm\r /F\u0089.Â\u0002²\u001dà\u001d7W^'Kö\tî6Á_H\u0086~Zê{8\u009fÍÎn\u0090ñY\u008cR4&á\n\u0086E¡3Í¨0\"¤\u00166¤M\u0018!æÄ%æ|»\n\u0094\u001c5\u008b\u009ay[\u009d·û:\u0095%\u0013\u0093Ñ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11828;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("snh", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("snh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
