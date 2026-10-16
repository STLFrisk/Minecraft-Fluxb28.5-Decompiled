import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
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

public class t7e$2$1 extends SimpleChannelInboundHandler {
   public final t7e$2 lcp;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public t7e$2$1(t7e$2 var1) {
      this.lcp = var1;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void channelActive(ChannelHandlerContext var1) {
      long var2 = a ^ 67366017007919L;
      super.channelActive(var1);
      int var10000 = t9d.b();
      ByteBuf var5 = Unpooled.buffer();
      int var4 = var10000;
      boolean var15 = false /* VF: Semaphore variable */;

      try {
         var15 = true;
         var5.writeByte(254);
         var5.writeByte(1);
         var5.writeByte(250);
         char[] var6 = a<"u">(1345, 7573739914623081765L ^ var2).toCharArray();
         var5.writeShort(var6.length);
         char[] var7 = var6;
         int var8 = var6.length;
         int var9 = 0;

         while (true) {
            if (var9 < var8) {
               char var10 = var7[var9];

               try {
                  var5.writeChar(var10);
                  var9++;
                  if (var4 == 0) {
                     break;
                  }

                  if (var4 != 0) {
                     continue;
                  }
               } catch (oov var16) {
                  throw a(var16);
               }
            }

            var5.writeShort(7 + 2 * this.lcp.x0k.hul().length());
            var5.writeByte(127);
            var6 = this.lcp.x0k.hul().toCharArray();
            var5.writeShort(var6.length);
            var7 = var6;
            var8 = var6.length;
            break;
         }

         var9 = 0;

         while (var9 < var8) {
            char var21 = var7[var9];

            try {
               var5.writeChar(var21);
               var9++;
               if (var4 == 0) {
                  var15 = false;
                  return;
               }

               if (var4 == 0) {
                  break;
               }
            } catch (oov var17) {
               throw a(var17);
            }
         }

         var5.writeInt(this.lcp.x0k.biq());
         var1.channel().writeAndFlush(var5).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
         var15 = false;
      } finally {
         if (var15) {
            var5.release();
         }
      }

      var5.release();
   }

   public void mjg(ChannelHandlerContext var1, ByteBuf var2) {
      long var3 = a ^ 47976198032193L;
      int var5 = t9d.b();
      short var6 = var2.readUnsignedByte();

      label38: {
         try {
            if (var5 == 0) {
               return;
            }

            if (var6 != 255) {
               break label38;
            }
         } catch (oov var15) {
            throw a(var15);
         }

         String var7 = new String(var2.readBytes(var2.readShort() * 2).array(), Charsets.UTF_16BE);
         String[] var8 = (String[])Iterables.toArray(t7e.tgx().split(var7), String.class);

         try {
            if (var5 == 0) {
               return;
            }

            if (!a<"u">(9019, 7529997897327653168L ^ var3).equals(var8[0])) {
               break label38;
            }
         } catch (oov var14) {
            throw a(var14);
         }

         int var9 = fe6.e9x(var8[1], 0);
         String var10 = var8[2];
         String var11 = var8[3];
         int var12 = fe6.e9x(var8[4], -1);
         int var13 = fe6.e9x(var8[5], -1);
         this.lcp.azd.e39 = -1;
         this.lcp.azd.o5_ = var10;
         this.lcp.azd.o_g = var11;
         this.lcp.azd.y17 = syo.qiz + "" + var12 + "" + syo.pgp + "/" + syo.qiz + var13;
      }

      var1.close();
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var1.close();
   }

   public void channelRead0(ChannelHandlerContext var1, Object var2) {
      this.mjg(var1, (ByteBuf)var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6773833827671886894L, -1786621853574647051L, MethodHandles.lookup().lookupClass()).a(145167559081591L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 56312199935397L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "º\u008dM\u0083\u0010!Hv\u008b\u00865Z\u0016Äh\u009a üê¬\u000bS_ðÖó\n\u0004\u0085ò'=ãE`¶U<É\u008fÙmyY+`¿Uø";
      int var8 = "º\u008dM\u0083\u0010!Hv\u008b\u00865Z\u0016Äh\u009a üê¬\u000bS_ðÖó\n\u0004\u0085ò'=ãE`¶U<É\u008fÙmyY+`¿Uø".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11504;
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
            throw new RuntimeException("t7e$2$1", var10);
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
         throw new RuntimeException("t7e$2$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
