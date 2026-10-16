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

public class d3e {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public d3e() {
      long var1 = a ^ 28644193128455L;
      super();
      this.wrx = new String[][]{
         {a<"b">(24392, 241325356652450062L ^ var1), a<"b">(20436, 8387108127697158547L ^ var1)},
         {a<"b">(13725, 8571117484253625304L ^ var1), a<"b">(3680, 9086970780063137828L ^ var1), a<"b">(3680, 9086970780063137828L ^ var1)},
         {a<"b">(3680, 9086970780063137828L ^ var1), a<"b">(13725, 8571117484253625304L ^ var1), a<"b">(13725, 8571117484253625304L ^ var1)},
         {a<"b">(13725, 8571117484253625304L ^ var1), a<"b">(13725, 8571117484253625304L ^ var1)}
      };
      this.ouc = new u7m[][]{
         {xbr.i8v, xbr.icz, xbr.exg, xbr.jtr},
         {xbr.pgw, xbr.c2v, xbr.z44, xbr.hrw},
         {xbr.s9f, xbr.w41, xbr.r6g, xbr.mmx},
         {xbr.esc, xbr.hfp, xbr.rrf, xbr.c8v},
         {xbr._qk, xbr.tfe, xbr.zrn, xbr.lsz}
      };
   }

   public void es_(opt var1) {
      for (int var2 = 0; var2 < this.ouc[0].length; var2++) {
         u7m var3 = this.ouc[0][var2];

         for (int var4 = 0; var4 < this.ouc.length - 1; var4++) {
            u7m var5 = this.ouc[var4 + 1][var2];
            var1.q01(new erg(var5), new Object[]{this.wrx[var4], 'X', var3});
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9150737176418856897L, -5642536717084733328L, MethodHandles.lookup().lookupClass()).a(87561559080009L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 72464217857906L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "ê\u0091>\u0094\u0014·\r§¼\u0086°ð^Í\u0018\u0006\u0010S\u0019rÛ4Í\u0088H¥d«L\u0091ã\u0015[";
      int var8 = "ê\u0091>\u0094\u0014·\r§¼\u0086°ð^Í\u0018\u0006\u0010S\u0019rÛ4Í\u0088H¥d«L\u0091ã\u0015[".length();
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
                     c = new String[4];
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

                  var6 = "\u0084üðãrçó¹Ú¦KØ\u0086\"\u0092b\u0010\u0099\u0013¤u\u009d\u0087\u0086o\u008bîç\u0000>A\u0097¥";
                  var8 = "\u0084üðãrçó¹Ú¦KØ\u0086\"\u0092b\u0010\u0099\u0013¤u\u009d\u0087\u0086o\u008bîç\u0000>A\u0097¥".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25591;
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
            throw new RuntimeException("d3e", var10);
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
         throw new RuntimeException("d3e" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
