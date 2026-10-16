import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hgu extends e0x {
   public static final zb_ gtb;
   public static final int fy6;
   public static final int mc0;
   public static final int rpc;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public hgu() {
      super(p3y.zs8);
      this.y8l(this._8_.c32().zvi(gtb, hgu$nf1.ddg));
      this.i3l(uja.mqu);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 137996072998404L;
      return orr.zgh(this.abc() + "." + hgu$nf1.ddg.dr7() + b<"s">(31828, 2423995274600373707L ^ var1));
   }

   @Override
   public _mi uoz(zfz var1) {
      try {
         if (var1.dil(gtb) == hgu$nf1.ddg) {
            return _mi.p8k;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return _mi.zfs;
   }

   @Override
   public int crg(zfz var1) {
      return ((hgu$nf1)var1.dil(gtb)).bat();
   }

   @Override
   public int hvp(zfz var1) {
      return ((hgu$nf1)var1.dil(gtb)).bat();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{gtb});
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(gtb, hgu$nf1.gv4(var1));
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, fy6));
      var3.add(new erg(var1, 1, mc0));
      var3.add(new erg(var1, 1, rpc));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8544878980904663473L, -6964652168578523568L, MethodHandles.lookup().lookupClass()).a(12040083579376L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 26573154267382L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "\u0086?×Ð\u007f9\u0093ó÷\u0090C}ºæ,ç\u0010þ¾\u0093\u009f[P»å[tÌ ¢¸<t";
      int var6 = "\u0086?×Ð\u007f9\u0093ó÷\u0090C}ºæ,ç\u0010þ¾\u0093\u009f[P»å[tÌ ¢¸<t".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[2];
            gtb = zb_.pq4(b<"s">(21012, 2203872737963742584L ^ var9), hgu$nf1.class);
            fy6 = hgu$nf1.ddg.bat();
            mc0 = hgu$nf1.umw.bat();
            rpc = hgu$nf1.wdj.bat();
            return;
         }

         var3 = var4.charAt(var2);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6904;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("hgu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("hgu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
