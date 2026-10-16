import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a01 extends gyu {
   private boolean zsz;
   private vg1 z_n = new vg1();
   private h_q upn = new h_q(4);
   private static final long a;
   private static final String f;

   public a01(int var1, boolean var2) {
      super(var1);
      this.zsz = var2;
      if (var2) {
         this.ke4 = ox_._mc.l4i();
      }

      this.c1d.clear();
   }

   @Override
   public void u0r(OpaquePredicate var1, Random var2, mew var3) {
      int var4 = OpaquePredicate.b();

      a01 var10000;
      label60: {
         label65: {
            try {
               var10000 = this;
               if (var4 == 0) {
                  break label60;
               }

               if (!this.zsz) {
                  break label65;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            int var5 = 0;

            label44: {
               while (var5 < 3) {
                  int var6 = var2.nextInt(16) + 8;
                  int var7 = var2.nextInt(16) + 8;

                  try {
                     this.z_n.v3g(var1, var2, var1.p9y(var3.ec4(var6, 0, var7)));
                     var5++;
                     if (var4 == 0) {
                        break label44;
                     }

                     if (var4 == 0) {
                        break;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }
               }

               var5 = 0;
            }

            while (var5 < 2) {
               int var11 = var2.nextInt(16) + 8;
               int var12 = var2.nextInt(16) + 8;

               try {
                  this.upn.v3g(var1, var2, var1.p9y(var3.ec4(var11, 0, var12)));
                  var5++;
                  if (var4 == 0) {
                     return;
                  }

                  if (var4 == 0) {
                     break;
                  }
               } catch (oov var9) {
                  throw a(var9);
               }
            }
         }

         var10000 = this;
      }

      var10000.u0r(var1, var2, var3);
   }

   @Override
   public e9q jk9(Random var1) {
      return new lkp(false);
   }

   @Override
   public gyu hiq(int var1) {
      long var2 = a ^ 25432248529768L;
      gyu var4 = new a01(var1, true).cq8(13828095, true).cb4(this.jcq + f).apv().j10(0.0F, 0.5F).wzy(new gyu$ekk(this.f6x + 0.1F, this.yeh + 0.1F));
      var4.f6x = this.f6x + 0.3F;
      var4.yeh = this.yeh + 0.4F;
      return var4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(579884544495492934L, -3170325442042291727L, MethodHandles.lookup().lookupClass()).a(57062110487778L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 121491805606196L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0086\u009a\u000eóm,Î\u000b".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
   }

   private static oov a(oov var0) {
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
}
