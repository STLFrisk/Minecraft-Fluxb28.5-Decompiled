import com.google.gson.JsonParseException;
import java.io.IOException;
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
import org.apache.logging.log4j.LogManager;

public class tkf extends m2h {
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public tkf(t1s var1) {
      long var2 = b ^ 111557092414058L;
      super(var1);
      this.jsv = this.ibh.h3p().zkg;

      p9u var4;
      try {
         var4 = new p9u(this.jsv.rry());
      } catch (IOException var6) {
         var4 = p9t.ywc;
      }

      this.dt4 = this.ibh.l22().v5m(b<"b">(20304, 6742543385621527020L ^ var2), var4);
   }

   @Override
   public int gps() {
      return 1;
   }

   @Override
   public String x1y() {
      long var1 = b ^ 138243921155438L;
      int var3 = OpaquePredicate.b();

      try {
         xan var4 = (xan)this.jsv.ui7(this.ibh.h3p().vj6, b<"b">(15386, 1721755324701281700L ^ var1));

         try {
            if (var3 == 0) {
               return var4.z0t()._2o();
            }

            if (var4 == null) {
               return syo.aez + b<"b">(16295, 1662146134333394456L ^ var1);
            }
         } catch (JsonParseException var5) {
            throw a(var5);
         }

         return var4.z0t()._2o();
      } catch (JsonParseException var6) {
         e7s.error(b<"b">(22119, 2973374083491260382L ^ var1), var6);
      } catch (IOException var7) {
         e7s.error(b<"b">(24151, 167588969869144045L ^ var1), var7);
      }

      return syo.aez + b<"b">(16295, 1662146134333394456L ^ var1);
   }

   @Override
   public boolean wrb() {
      return false;
   }

   @Override
   public boolean _f9() {
      return false;
   }

   @Override
   public boolean xz6() {
      return false;
   }

   @Override
   public boolean _e7() {
      return false;
   }

   @Override
   public String wbk() {
      long var1 = b ^ 81196985999001L;
      return b<"b">(19072, 2087930599540699340L ^ var1);
   }

   @Override
   public void _6q() {
      this.ibh.l22().anl(this.dt4);
   }

   @Override
   public boolean by_() {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7746876967591806529L, -8201758734615877837L, MethodHandles.lookup().lookupClass()).a(75053438647870L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 130451420670341L;
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
      String var6 = "\u0006\u0013\u0098ã\u009cë\u0011Î\u0002\u0085Â6hö¨Îeq\u0092J@û\u000eß\u0016?YåØ\u001eæM¹Õ\u0099\u0019Úùr\u001d<Üäè=¼ßk\u0010DK¬\u0094\u0095þ\u009e+ª\u0084®ä¯t'\u0002 \u0099äaÐ5\tßd£\u0089®\u0080Â\u0098\u000f7GC>þ%Å=Á\u0099]Ø\"½ÙR£0\u001d\u0092(\u0098Æ¸³k\u008d\u0088}P¾P/qÍ2b\u0012\u0089\u0001ý5\u008fß\u001ebª9\u0091U\u009c¬Üð\"²Ô\u0088Ézb?\u0004ÀäÇ";
      int var8 = "\u0006\u0013\u0098ã\u009cë\u0011Î\u0002\u0085Â6hö¨Îeq\u0092J@û\u000eß\u0016?YåØ\u001eæM¹Õ\u0099\u0019Úùr\u001d<Üäè=¼ßk\u0010DK¬\u0094\u0095þ\u009e+ª\u0084®ä¯t'\u0002 \u0099äaÐ5\tßd£\u0089®\u0080Â\u0098\u000f7GC>þ%Å=Á\u0099]Ø\"½ÙR£0\u001d\u0092(\u0098Æ¸³k\u008d\u0088}P¾P/qÍ2b\u0012\u0089\u0001ý5\u008fß\u001ebª9\u0091U\u009c¬Üð\"²Ô\u0088Ézb?\u0004ÀäÇ"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[6];
                     e7s = LogManager.getLogger();
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

                  var6 = "\u0017¶\u008awÇNY{ÍÉB× xv\u0003(nöÄÅ0£<P\u0096áûGø\u007fFm£Ép;¸+¬d8§Ì\u009a\u0014Áj\u0081{bÝmÃ\b¥c";
                  var8 = "\u0017¶\u008awÇNY{ÍÉB× xv\u0003(nöÄÅ0£<P\u0096áûGø\u007fFm£Ép;¸+¬d8§Ì\u009a\u0014Áj\u0081{bÝmÃ\b¥c".length();
                  var5 = 16;
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

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15812;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("tkf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("tkf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
