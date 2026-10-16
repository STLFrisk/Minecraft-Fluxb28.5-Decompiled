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

public class th8 extends zg9 {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public th8(jnq var1, OpaquePredicate var2) {
      this(var1, var2, mew._9b);
   }

   public th8(jnq var1, OpaquePredicate var2, mew var3) {
      super(new l3j(var1, var2, var3));
   }

   @Override
   public void qw3(int var1, int var2) {
      long var3 = a ^ 10898324872329L;
      this.fex.eh6(fc1.gx1(b<"l">(29938, 4256100393579322921L ^ var3), new Object[0]), 28.0F, 6.0F, 4210752);
      this.fex.eh6(fc1.gx1(b<"l">(5711, 5543295450231078038L ^ var3), new Object[0]), 8.0F, (float)(this.g6l - 96 + 2), 4210752);
   }

   @Override
   public void cft(float var1, int var2, int var3) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(mfc);
      int var4 = (this.dt7 - this.poy) / 2;
      int var5 = (this.o1e - this.g6l) / 2;
      this.mt4(var4, var5, 0, 0, this.poy, this.g6l);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8997717644715397986L, 851313538847440539L, MethodHandles.lookup().lookupClass()).a(44415090264278L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 45734329462701L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "mö\u008f£\u0006Va~\u0081a\u0019\u0006içxàµÎ\u0084Ë\u009b\u000f$þÎÁ\u001b=l\u0080ò¸Ãbn¡|Ìë\u0087PeöG\u0092)I\u0096Å:½æ.õÅ¾t\u0017Äå\u009b\u009b9ñf\u0082K+í¬Å\u0092\u0081o^\u0087ª<¤ðP\u0010\u0083´\u00857\u008d~YhÇUÅÏ\u0017-\u0085uÞ\u0011*[<P5öÆ\u0098¯æyXoûcÍ¯7]\u0099\u0085(\u0084'Âpü\r\u0089J\u007f«è8HðWjô\u008eÚÉ~v|î\u0089A\u001c\u00838\u000e\u008doWë$Sü+`Y";
      int var6 = "mö\u008f£\u0006Va~\u0081a\u0019\u0006içxàµÎ\u0084Ë\u009b\u000f$þÎÁ\u001b=l\u0080ò¸Ãbn¡|Ìë\u0087PeöG\u0092)I\u0096Å:½æ.õÅ¾t\u0017Äå\u009b\u009b9ñf\u0082K+í¬Å\u0092\u0081o^\u0087ª<¤ðP\u0010\u0083´\u00857\u008d~YhÇUÅÏ\u0017-\u0085uÞ\u0011*[<P5öÆ\u0098¯æyXoûcÍ¯7]\u0099\u0085(\u0084'Âpü\r\u0089J\u007f«è8HðWjô\u008eÚÉ~v|î\u0089A\u001c\u00838\u000e\u008doWë$Sü+`Y"
         .length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = d(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            g = new String[3];
            mfc = new gdz(b<"l">(8247, 8638442512731519435L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28329;
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
            throw new RuntimeException("th8", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("th8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
