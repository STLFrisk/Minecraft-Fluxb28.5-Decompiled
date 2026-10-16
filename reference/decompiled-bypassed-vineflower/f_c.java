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

public class f_c {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void f9u(opt var1) {
      long var2 = a ^ 13397547824599L;
      int var4 = 0;

      try {
         while (var4 < 16) {
            var1.liy(new erg(ox_.lpo, 1, var4), new Object[]{new erg(xbr.nnn, 1, 15 - var4), new erg(u7m.gfm(ox_.lpo), 1, 0)});
            var1.q01(
               new erg(ox_.f6z, 8, 15 - var4),
               new Object[]{
                  a<"q">(1200, 9072715317374515532L ^ var2),
                  a<"q">(5931, 3838284534480235216L ^ var2),
                  a<"q">(30314, 1180338377052818320L ^ var2),
                  '#',
                  new erg(ox_.o45),
                  'X',
                  new erg(xbr.nnn, 1, var4)
               }
            );
            var1.q01(
               new erg(ox_.dh_, 8, 15 - var4),
               new Object[]{
                  a<"q">(30314, 1180338377052818320L ^ var2),
                  a<"q">(6972, 5138056406217582277L ^ var2),
                  a<"q">(30314, 1180338377052818320L ^ var2),
                  '#',
                  new erg(ox_.fzi),
                  'X',
                  new erg(xbr.nnn, 1, var4)
               }
            );
            var1.q01(
               new erg(ox_.pse, 16, var4),
               new Object[]{a<"q">(30314, 1180338377052818320L ^ var2), a<"q">(30314, 1180338377052818320L ^ var2), '#', new erg(ox_.dh_, 1, var4)}
            );
            var4++;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      var1.liy(new erg(xbr.nnn, 1, qvg.byr.b9d()), new Object[]{new erg(ox_.qmk, 1, u5m$cco.r1p.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.y7l.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.gye.uzp())});
      var1.liy(new erg(xbr.nnn, 3, qvg.ft3.b9d()), new Object[]{xbr.pl_});
      var1.liy(new erg(xbr.nnn, 2, qvg.uqr.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
      var1.liy(new erg(xbr.nnn, 2, qvg.y0w.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.byr.b9d())});
      var1.liy(new erg(xbr.nnn, 2, qvg.w98.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.u1l.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
      var1.liy(new erg(xbr.nnn, 2, qvg._p6.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.qn4.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
      var1.liy(new erg(xbr.nnn, 2, qvg.i_s.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg._p6.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
      var1.liy(
         new erg(xbr.nnn, 3, qvg.i_s.b9d()),
         new Object[]{new erg(xbr.nnn, 1, qvg.qn4.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())}
      );
      var1.liy(new erg(xbr.nnn, 2, qvg.pyj.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
      var1.liy(new erg(xbr.nnn, 2, qvg.wms.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.u1l.b9d())});
      var1.liy(new erg(xbr.nnn, 2, qvg.a32.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d())});
      var1.liy(new erg(xbr.nnn, 2, qvg.is_.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.a32.b9d()), new erg(xbr.nnn, 1, qvg.uqr.b9d())});
      var1.liy(
         new erg(xbr.nnn, 3, qvg.is_.b9d()),
         new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.uqr.b9d())}
      );
      var1.liy(
         new erg(xbr.nnn, 4, qvg.is_.b9d()),
         new Object[]{
            new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())
         }
      );
      var1.liy(new erg(xbr.nnn, 1, qvg.pyj.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.i9o.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.is_.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.poz.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.i_s.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.g5b.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.y7l.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.k5h.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.y0w.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.lam.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.i_s.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.q_1.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.uqr.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.ph9.uzp())});
      var1.liy(new erg(xbr.nnn, 1, qvg.i_s.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.eet.uzp())});
      var1.liy(new erg(xbr.nnn, 2, qvg.byr.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.abu.gp7())});
      var1.liy(new erg(xbr.nnn, 2, qvg.is_.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.pnm.gp7())});
      var1.liy(new erg(xbr.nnn, 2, qvg.y7l.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.sp9.gp7())});
      var1.liy(new erg(xbr.nnn, 2, qvg.uqr.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.mal.gp7())});
      var4 = 0;

      try {
         while (var4 < 16) {
            var1.q01(new erg(ox_.cj9, 3, var4), new Object[]{a<"q">(31096, 4370129128365786240L ^ var2), '#', new erg(ox_.lpo, 1, var4)});
            var4++;
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4346318500063247363L, -6535494303580084956L, MethodHandles.lookup().lookupClass()).a(171832858009896L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 32076171685419L;
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
      String var6 = "\u0012\u0094Å=\u008a?¨³=Á®å¸É-\u0014\u0010ÊªK©\u001a]ÏQÙÝ»|?\u0080âß\u0010\u000f\u000bø\u0019%ºÐÞd\u0096Y×¦D\u009c\u0010";
      int var8 = "\u0012\u0094Å=\u008a?¨³=Á®å¸É-\u0014\u0010ÊªK©\u001a]ÏQÙÝ»|?\u0080âß\u0010\u000f\u000bø\u0019%ºÐÞd\u0096Y×¦D\u009c\u0010".length();
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
                     c = new String[5];
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

                  var6 = "ÂÄ`Þí\u0095ïd£~oW ©-\u008a\u0010óó0N\u001cT\u001duP\u001a_m*\b\u0094\u0089";
                  var8 = "ÂÄ`Þí\u0095ïd£~oW ©-\u008a\u0010óó0N\u001cT\u001duP\u001a_m*\b\u0094\u0089".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2564;
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
            throw new RuntimeException("f_c", var10);
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
         throw new RuntimeException("f_c" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
