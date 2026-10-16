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

public class zt5 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 36815313709044L;
      return b<"r">(18187, 9045549924613698987L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 52252440361842L;
      return b<"r">(9229, 5733950636559895082L ^ var2);
   }

   @Override
   public void l3z(e7r var1, String[] var2) {
      long var3 = a ^ 41197435081393L;
      this.s20();
      wxl(var1, this, b<"r">(24997, 3113304632735852098L ^ var3), new Object[0]);
   }

   public void s20() {
      int var1 = t9d.c();
      cog var2 = vr1._0v().p_y[0].r7d();

      cog var10000;
      boolean var10001;
      label22: {
         label21: {
            try {
               var10000 = var2;
               var10001 = var2.nys();
               if (var1 != 0) {
                  break label22;
               }

               if (!var10001) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = false;
            break label22;
         }

         var10001 = true;
      }

      var10000.do3(var10001);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8266392114856947442L, 753608779090691255L, MethodHandles.lookup().lookupClass()).a(73731163730059L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 101058699268679L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "¦CÔ\u0017æ%\u0092Å«t:¶ø{\u0007\u0007yÎaß\u0094½@gãï+Æ\u0092\u0091ß\u000b(|\u0015£øJûüÑÞí5}<÷5éí3¾eça1E\u000f\u0013\u0018Ö¯[Ø\u001ft «9þ>²j8\u0006\u007fõ\u0014\u0080òùog\u00010[\u00920Ýí /u6¨¼\u001aÝÕAmnNE\u0003\u000b\u0088Ý5\u000eT_¢¡\u0099B®\u0001\u0085Q(\u008c½È~®h\u0082îÇ";
      int var8 = "¦CÔ\u0017æ%\u0092Å«t:¶ø{\u0007\u0007yÎaß\u0094½@gãï+Æ\u0092\u0091ß\u000b(|\u0015£øJûüÑÞí5}<÷5éí3¾eça1E\u000f\u0013\u0018Ö¯[Ø\u001ft «9þ>²j8\u0006\u007fõ\u0014\u0080òùog\u00010[\u00920Ýí /u6¨¼\u001aÝÕAmnNE\u0003\u000b\u0088Ý5\u000eT_¢¡\u0099B®\u0001\u0085Q(\u008c½È~®h\u0082îÇ"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            g = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11195;
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
            throw new RuntimeException("zt5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("zt5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
