import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b1f$mtk extends Thread {
   private final b1f$woh xtr;
   private final InetAddress cj1;
   private final MulticastSocket ay7;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public b1f$mtk(b1f$woh var1) {
      long var2 = a ^ 58809218908292L;
      super(a<"n">(20164, 3648330158745935005L ^ var2) + b1f.ymx().incrementAndGet());
      this.xtr = var1;
      this.setDaemon(true);
      this.ay7 = new MulticastSocket(4445);
      this.cj1 = InetAddress.getByName(a<"n">(28265, 3259389602101361714L ^ var2));
      this.ay7.setSoTimeout(5000);
      this.ay7.joinGroup(this.cj1);
   }

   @Override
   public void run() {
      long var1 = a ^ 79153418547440L;
      int var3 = t9d.b();
      byte[] var4 = new byte[1024];

      while (true) {
         label38:
         if (!this.isInterrupted()) {
            DatagramPacket var5 = new DatagramPacket(var4, var4.length);

            label35: {
               IOException var6;
               try {
                  label33: {
                     try {
                        this.ay7.receive(var5);
                     } catch (SocketTimeoutException var8) {
                        continue;
                     } catch (IOException var9) {
                        var6 = var9;
                        break label33;
                     }

                     if (var3 == 0) {
                        break;
                     }
                     break label35;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }

               b1f.udl().error(a<"n">(25458, 440214895229403484L ^ var1), var6);
               if (var3 != 0) {
                  break label38;
               }
            }

            String var11 = new String(var5.getData(), var5.getOffset(), var5.getLength());
            b1f.udl().debug(var5.getAddress() + a<"n">(8638, 5273020245534786450L ^ var1) + var11);
            this.xtr.kig(var11, var5.getAddress());
            if (var3 != 0) {
               continue;
            }
         }

         try {
            this.ay7.leaveGroup(this.cj1);
         } catch (IOException var7) {
         }
         break;
      }

      this.ay7.close();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-728125193306476878L, -4086719606743492136L, MethodHandles.lookup().lookupClass()).a(171518241557296L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 77401804564588L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "3É\u0007]»6\u0085â\\»\u0001¥\u008eJÝW_â{\u0001ä\u009fÿÛX\rjµØyÞûx\u00820\u0006þI£ß\u0010\u0016d&Ð\u0083X\u000f?\u007f\fÔ|yØ\u008c\u0005";
      int var8 = "3É\u0007]»6\u0085â\\»\u0001¥\u008eJÝW_â{\u0001ä\u009fÿÛX\rjµØyÞûx\u00820\u0006þI£ß\u0010\u0016d&Ð\u0083X\u000f?\u007f\fÔ|yØ\u008c\u0005"
         .length();
      char var5 = '(';
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
                     c = new String[4];
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

                  var6 = "æc\u0097Ý¢\u0012ssäÏÚ¡%[w\u001fyn\u009aÖþ}->\u007fºÎI+¥\u0090â(Ö\u009aË\u008fÅô¼áRä¥æùR¾µå§\u0091;\u008eö]\u000b'\u008fÔÏÏl¹ÇÆ»\bä\u008bÄíÙ";
                  var8 = "æc\u0097Ý¢\u0012ssäÏÚ¡%[w\u001fyn\u009aÖþ}->\u007fºÎI+¥\u0090â(Ö\u009aË\u008fÅô¼áRä¥æùR¾µå§\u0091;\u008eö]\u000b'\u008fÔÏÏl¹ÇÆ»\bä\u008bÄíÙ"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1878;
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
            throw new RuntimeException("b1f$mtk", var10);
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
         throw new RuntimeException("b1f$mtk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
