import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
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

public class ob1$4 extends ChannelInitializer {
   public final ob1 gok;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ob1$4(ob1 var1) {
      this.gok = var1;
   }

   public void initChannel(Channel var1) {
      long var2 = a ^ 27994188903106L;

      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      var1.pipeline()
         .addLast(a<"s">(18424, 5781120358234311231L ^ var2), new ReadTimeoutHandler(30))
         .addLast(a<"s">(24094, 875076100758262744L ^ var2), new wty(this.gok))
         .addLast(a<"s">(27108, 5601403845063533606L ^ var2), new _bo())
         .addLast(a<"s">(29629, 208958069411118717L ^ var2), new lte(qat.qv9))
         .addLast(a<"s">(21009, 6949657324615950292L ^ var2), new ki6())
         .addLast(a<"s">(8691, 2763448704961358896L ^ var2), new n5b(qat.yu7));
      hv0 var4 = new hv0(qat.qv9);
      ob1.jyp(this.gok).add(var4);
      var1.pipeline().addLast(a<"s">(19351, 3037038864790275670L ^ var2), var4);
      var4.kbj(new jou(ob1.rpd(this.gok), var4));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6241194774486313882L, 4231188186125962913L, MethodHandles.lookup().lookupClass()).a(19189491262090L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 132983349386179L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = " _Æ!ð\tßæ\u000e\bC\u0018Þ=\u008e\u0017 (àñ`\\l@\u0007â¨\u0015Ó\u009aÒ\u0082Aï0~¸ÃÚM\u0093æüù@Æ¼hò ñÜõÁ&\u001eid2µÌSe4±ñ\u0014ÉE$þ¢ÿ\u00811\u008eQ\u008a\u0019øB\u001f\u0010âÕÉâ\u0010¸F¼âÊàºÓê j\u0010pA£\u0012Ãw%6\foè.\u00871;\u001a";
      int var8 = " _Æ!ð\tßæ\u000e\bC\u0018Þ=\u008e\u0017 (àñ`\\l@\u0007â¨\u0015Ó\u009aÒ\u0082Aï0~¸ÃÚM\u0093æüù@Æ¼hò ñÜõÁ&\u001eid2µÌSe4±ñ\u0014ÉE$þ¢ÿ\u00811\u008eQ\u008a\u0019øB\u001f\u0010âÕÉâ\u0010¸F¼âÊàºÓê j\u0010pA£\u0012Ãw%6\foè.\u00871;\u001a"
         .length();
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
                     c = new String[7];
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

                  var6 = "3N\r\u001d+Ý\u0091\n=g\u0080.\u0013Ñ\u0012ýC%Cz\u0012\u008e÷O\u001eT\u008bSØBæ§ 6\u0082~9\u00902\u0081\u001cÕ.\u00858©\u009f\u0085·\t\u0090q° i7Þ\u0016wP±Y\u0004\u0013©";
                  var8 = "3N\r\u001d+Ý\u0091\n=g\u0080.\u0013Ñ\u0012ýC%Cz\u0012\u008e÷O\u001eT\u008bSØBæ§ 6\u0082~9\u00902\u0081\u001cÕ.\u00858©\u009f\u0085·\t\u0090q° i7Þ\u0016wP±Y\u0004\u0013©"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7544;
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
            throw new RuntimeException("ob1$4", var10);
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
         throw new RuntimeException("ob1$4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
