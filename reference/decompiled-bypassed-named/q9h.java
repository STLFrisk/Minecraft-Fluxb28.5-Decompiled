import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.entity.model.IEntityRenderer;

public abstract class q9h implements IEntityRenderer {
   public static final gdz[] _oj;
   public xv4 qrn;

   public abstract void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9);

   public void g3j(gdz var1) {
      int var2 = OpaquePredicate.c();
      lc5 var3 = this.qrn.gby;

      lc5 var10000;
      label20: {
         try {
            var10000 = var3;
            if (var2 != 0) {
               break label20;
            }

            if (var3 == null) {
               return;
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var10000 = var3;
      }

      var10000.anl(var1);
   }

   public OpaquePredicate hzs() {
      return this.qrn.z_g;
   }

   public void q02(xv4 var1) {
      this.qrn = var1;
   }

   public owt srv() {
      return this.qrn.dmy();
   }

   public boolean ts0() {
      return false;
   }

   public void oh0(pyk var1, double var2, double var4, double var6, float var8, int var9, q3g var10) {
   }

   @Override
   public Class getEntityClass() {
      return this._t0;
   }

   @Override
   public void setEntityClass(Class var1) {
      this._t0 = var1;
   }

   @Override
   public gdz getLocationTextureCustom() {
      return this.uzm;
   }

   @Override
   public void setLocationTextureCustom(gdz var1) {
      this.uzm = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3999331234038166942L, 7909639963451758077L, MethodHandles.lookup().lookupClass()).a(89978402554508L);
      // $VF: monitorexit
      long var10 = var10000 ^ 122285064594897L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[10];
      int var6 = 0;
      String var5 = "»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíáÏb\u001c\u001b#·Ô\u0094\u000bíUc\u0012\u001eo(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âím¢þäÅ-¬\\C\u0002Ó\u0081×é:\u0006(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí|më¢\u009c<]-ö%m\u008e\u0088H0\u0080(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíI\\FNÜzòâx´\u00101ÈeOz(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíUÉ2ÝÚV\u0080w6ß³\u008eåþ\u0013ð(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí·nÅL\u009aTÉ>\nid¬ßê\u008d®(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíÁ\u000e>Êv<çH0\u0084©`@SêÐ(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí¨¸¿\u009e\u0004«\u001c\u0093sé\"r¢\u0011¶\u0090";
      int var7 = "»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíáÏb\u001c\u001b#·Ô\u0094\u000bíUc\u0012\u001eo(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âím¢þäÅ-¬\\C\u0002Ó\u0081×é:\u0006(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí|më¢\u009c<]-ö%m\u008e\u0088H0\u0080(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíI\\FNÜzòâx´\u00101ÈeOz(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíUÉ2ÝÚV\u0080w6ß³\u008eåþ\u0013ð(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí·nÅL\u009aTÉ>\nid¬ßê\u008d®(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯ÂíÁ\u000e>Êv<çH0\u0084©`@SêÐ(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí¨¸¿\u009e\u0004«\u001c\u0093sé\"r¢\u0011¶\u0090"
         .length();
      char var4 = '(';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     _oj = new gdz[]{
                        new gdz(var8[0]),
                        new gdz(var8[2]),
                        new gdz(var8[7]),
                        new gdz(var8[1]),
                        new gdz(var8[4]),
                        new gdz(var8[8]),
                        new gdz(var8[6]),
                        new gdz(var8[5]),
                        new gdz(var8[9]),
                        new gdz(var8[3])
                     };
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí¨ è\u0017¢ãB\u0003ëZ\u0014#WÐù)(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí¬õp\u0095#\u0010\u008d\t\"T\u0091\u000bI2Ub";
                  var7 = "»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí¨ è\u0017¢ãB\u0003ëZ\u0014#WÐù)(»\u0010üüð\\o\n\u0006<m\nCZ¶ývÑßí\u0007¯Âí¬õp\u0095#\u0010\u008d\t\"T\u0091\u000bI2Ub"
                     .length();
                  var4 = '(';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
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
}
