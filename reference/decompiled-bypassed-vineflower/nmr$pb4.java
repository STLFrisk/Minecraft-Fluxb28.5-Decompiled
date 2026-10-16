import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class nmr$pb4 {
   private final List nlx = Lists.newArrayList();
   private final List ykb = Lists.newArrayListWithCapacity(6);
   private final boolean gs6;
   private sla a1z;
   private boolean hpm;
   private flk zfk;
   private static final long a;
   private static final String b;

   public nmr$pb4(rqp var1) {
      this(var1.yto(), var1.r4o(), var1.qw6());
   }

   public nmr$pb4(dbw var1, sla var2) {
      this(var1.abn(), var1.egt(), var1.jzp());
      int var10000 = t9d.c();
      this.a1z = var1.yea();
      int var3 = var10000;
      vt2[] var4 = vt2.values();
      int var5 = var4.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            vt2 var7 = var4[var6];

            try {
               this.py1(var1, var2, var7);
               var6++;
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (RuntimeException var8) {
               throw a(var8);
            }
         }

         this.qn6(var1, var2);
         break;
      }
   }

   private void py1(dbw var1, sla var2, vt2 var3) {
      int var4 = t9d.b();

      for (oa4 var6 : var1.ebu(var3)) {
         this.kfq(var3, new c8u(var6, var2));
         if (var4 == 0) {
            break;
         }
      }
   }

   private void qn6(dbw var1, sla var2) {
      int var3 = t9d.c();

      for (oa4 var5 : var1.in9()) {
         this.x92(new c8u(var5, var2));
         if (var3 != 0) {
            break;
         }
      }
   }

   private nmr$pb4(boolean var1, boolean var2, flk var3) {
      vt2[] var5 = vt2.values();
      int var10000 = t9d.b();
      int var6 = var5.length;
      int var4 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            vt2 var8 = var5[var7];

            try {
               this.ykb.add(Lists.newArrayList());
               var7++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (RuntimeException var9) {
               throw a(var9);
            }
         }

         this.gs6 = var1;
         this.hpm = var2;
         this.zfk = var3;
         break;
      }
   }

   public nmr$pb4 kfq(vt2 var1, oa4 var2) {
      ((List)this.ykb.get(var1.ordinal())).add(var2);
      return this;
   }

   public nmr$pb4 x92(oa4 var1) {
      this.nlx.add(var1);
      return this;
   }

   public nmr$pb4 r9y(sla var1) {
      this.a1z = var1;
      return this;
   }

   public dbw y8d() {
      long var1 = a ^ 123117900549769L;

      try {
         if (this.a1z == null) {
            throw new RuntimeException(b);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return new nmr(this.nlx, this.ykb, this.gs6, this.hpm, this.a1z, this.zfk);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2003940522048176360L, -8349641175936713642L, MethodHandles.lookup().lookupClass()).a(55826089988326L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 97587680162005L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ãNWÒ3ºÐ0®R}í\u0093×Ç!ÆôëolÕúô".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static RuntimeException a(RuntimeException var0) {
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
