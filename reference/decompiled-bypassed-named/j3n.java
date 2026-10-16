import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class j3n extends foz {
   public static final _ku cqa;

   public j3n(p3y var1, int var2) {
      this(var1, var2, var1.up9());
   }

   public j3n(p3y var1, int var2, _mi var3) {
      super(var1, var3);
      this.y8l(this._8_.c32().zvi(cqa, 0));
      this.d8f = var2;
   }

   @Override
   public int af7(OpaquePredicate var1, mew var2) {
      int var3 = OpaquePredicate.b();
      int var4 = Math.min(var1.m_z(EntityLivingBase.class, this.ae9(var2)).size(), this.d8f);

      label27: {
         try {
            if (var3 == 0) {
               return var4;
            }

            if (var4 > 0) {
               break label27;
            }
         } catch (oov var6) {
            throw b(var6);
         }

         return 0;
      }

      float var5 = (float)Math.min(this.d8f, var4) / (float)this.d8f;
      return fe6.v1i(var5 * 15.0F);
   }

   @Override
   public int eqv(zfz var1) {
      return (Integer)var1.dil(cqa);
   }

   @Override
   public zfz u0_(zfz var1, int var2) {
      return var1.zvi(cqa, var2);
   }

   @Override
   public int odp(OpaquePredicate var1) {
      return 10;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(cqa, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(cqa);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{cqa});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1987212254037212608L, -963437424211844714L, MethodHandles.lookup().lookupClass()).a(189954199139456L);
      // $VF: monitorexit
      long var4 = var10000 ^ 48575583209641L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("h3Oaà&°æ".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      cqa = _ku.wgl(var0, 0, 15);
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
