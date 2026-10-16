import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum vt2$unz implements Predicate, Iterable {
   public static final vt2$unz fzl;
   public static final vt2$unz vrc;
   private static final vt2$unz[] m67;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public vt2[] qn1() {
      long var1 = a ^ 59044233297579L;
      int var3 = t9d.c();

      int var10000;
      label26: {
         try {
            var10000 = vt2$1.fg4[this.ordinal()];
            if (var3 != 0) {
               break label26;
            }

            switch (var10000) {
               case 1:
                  break;
               case 2:
                  return new vt2[]{vt2.rf3, vt2.m3r};
               default:
                  throw new Error(a<"b">(22935, 4832154743695529698L ^ var1));
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = 4;
      }

      vt2[] var5 = new vt2[var10000];
      var5[0] = vt2.z9q;
      var5[1] = vt2.zk4;
      var5[2] = vt2.mxp;
      var5[3] = vt2.te4;
      return var5;
   }

   public vt2 cvs(Random var1) {
      vt2[] var2 = this.qn1();
      return var2[var1.nextInt(var2.length)];
   }

   public boolean r3j(vt2 var1) {
      int var2 = t9d.b();

      vt2 var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000.e30().yop() == this) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public Iterator iterator() {
      return Iterators.forArray(this.qn1());
   }

   public boolean apply(Object var1) {
      return this.r3j((vt2)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7895118745734338459L, 7955882357243632876L, MethodHandles.lookup().lookupClass()).a(2361972160259L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 119244544330197L;
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
      String var4 = " muB\u0085±³JI\u008e\u000f\u0091±\u0099ò\u0000\u009a2IÏ\u0089BÔÀ\u009b\u0098\u00945W\fÔ\u0081\u0018\u0017\u0084×\u0086\u009b\u0017\u0012\u0082]6\u001e\u009c»ñd5gI<~\u0000~\u0082aP\u001b\u000fÅÈìþï\u0004$ðGRÙâWuLµ¾:[|\u0018ß¡\u0087&¨\n·gq^\u001bâÃ+d\u009b@\u0093à§EJ\u009a\t®{ \u00ad\u0085\u001eÛb0¹\u0087\u0010$tyèpdKî)\u009aÊàaâæG\u0004Ð\u0005dÐ";
      int var6 = " muB\u0085±³JI\u008e\u000f\u0091±\u0099ò\u0000\u009a2IÏ\u0089BÔÀ\u009b\u0098\u00945W\fÔ\u0081\u0018\u0017\u0084×\u0086\u009b\u0017\u0012\u0082]6\u001e\u009c»ñd5gI<~\u0000~\u0082aP\u001b\u000fÅÈìþï\u0004$ðGRÙâWuLµ¾:[|\u0018ß¡\u0087&¨\n·gq^\u001bâÃ+d\u009b@\u0093à§EJ\u009a\t®{ \u00ad\u0085\u001eÛb0¹\u0087\u0010$tyèpdKî)\u009aÊàaâæG\u0004Ð\u0005dÐ"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            fzl = new vt2$unz();
            vrc = new vt2$unz();
            m67 = new vt2$unz[]{fzl, vrc};
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19848;
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
            throw new RuntimeException("vt2$unz", var10);
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
         throw new RuntimeException("vt2$unz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
