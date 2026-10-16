import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.status.client.C00PacketServerQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t7e {
   private static final Splitter _rv;
   private static final Logger rk0;
   private final List aao = Collections.synchronizedList(Lists.newArrayList());
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void o7l(r1l var1) {
      long var2 = a ^ 32382701793893L;
      wat var4 = wat.vqi(var1.s4c);
      hv0 var5 = hv0.wkr(InetAddress.getByName(var4.hul()), var4.biq(), false);
      this.aao.add(var5);
      var1.o_g = a<"h">(27928, 7607343678609395514L ^ var2);
      var1.zab = -1L;
      var1.pmw = null;
      var5.kbj(new t7e$1(this, var5, var1));

      try {
         var5.k7f(new C00Handshake(47, var4.hul(), var4.biq(), a0t.nil));
         var5.k7f(new C00PacketServerQuery());
      } catch (Throwable var7) {
         rk0.error(var7);
      }
   }

   private void wjb(r1l var1) {
      wat var2 = wat.vqi(var1.s4c);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)hv0.tnd.qyc())).handler(new t7e$2(this, var2, var1)))
            .channel(NioSocketChannel.class))
         .connect(var2.hul(), var2.biq());
   }

   public void zky() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield t7e.aao Ljava/util/List;
      // 08: dup
      // 09: astore 2
      // 0a: monitorenter
      // 0b: aload 0
      // 0c: getfield t7e.aao Ljava/util/List;
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 3
      // 15: aload 3
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 6d
      // 1e: aload 3
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: checkcast hv0
      // 27: astore 4
      // 29: iload 1
      // 2a: ifeq 6f
      // 2d: aload 4
      // 2f: iload 1
      // 30: ifeq 66
      // 33: goto 3a
      // 36: invokestatic t7e.a (Loov;)Loov;
      // 39: athrow
      // 3a: invokevirtual hv0.jy3 ()Z
      // 3d: ifeq 57
      // 40: goto 47
      // 43: invokestatic t7e.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 4
      // 49: invokevirtual hv0.v2s ()V
      // 4c: iload 1
      // 4d: ifne 69
      // 50: goto 57
      // 53: invokestatic t7e.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 3
      // 58: invokeinterface java/util/Iterator.remove ()V 1
      // 5d: aload 4
      // 5f: goto 66
      // 62: invokestatic t7e.a (Loov;)Loov;
      // 65: athrow
      // 66: invokevirtual hv0.kh8 ()V
      // 69: iload 1
      // 6a: ifne 15
      // 6d: aload 2
      // 6e: monitorexit
      // 6f: goto 79
      // 72: astore 5
      // 74: aload 2
      // 75: monitorexit
      // 76: aload 5
      // 78: athrow
      // 79: return
   }

   public void iib() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic t7e.a J
      // 03: ldc2_w 27507873052380
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield t7e.aao Ljava/util/List;
      // 10: dup
      // 11: astore 4
      // 13: monitorenter
      // 14: aload 0
      // 15: getfield t7e.aao Ljava/util/List;
      // 18: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1d: astore 5
      // 1f: aload 5
      // 21: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 26: ifeq 7f
      // 29: aload 5
      // 2b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30: checkcast hv0
      // 33: astore 6
      // 35: iload 3
      // 36: ifeq 82
      // 39: aload 6
      // 3b: iload 3
      // 3c: ifeq 63
      // 3f: goto 46
      // 42: invokestatic t7e.a (Loov;)Loov;
      // 45: athrow
      // 46: invokevirtual hv0.jy3 ()Z
      // 49: ifeq 7b
      // 4c: goto 53
      // 4f: invokestatic t7e.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 5
      // 55: invokeinterface java/util/Iterator.remove ()V 1
      // 5a: aload 6
      // 5c: goto 63
      // 5f: invokestatic t7e.a (Loov;)Loov;
      // 62: athrow
      // 63: new tao
      // 66: dup
      // 67: sipush 26706
      // 6a: ldc2_w 3900157786023136968
      // 6d: lload 1
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=t7e.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: nop
      // 75: invokespecial tao.<init> (Ljava/lang/String;)V
      // 78: invokevirtual hv0.g8c (Lekw;)V
      // 7b: iload 3
      // 7c: ifne 1f
      // 7f: aload 4
      // 81: monitorexit
      // 82: goto 8d
      // 85: astore 7
      // 87: aload 4
      // 89: monitorexit
      // 8a: aload 7
      // 8c: athrow
      // 8d: return
   }

   public static Logger g75() {
      return rk0;
   }

   public static void t0p(t7e var0, r1l var1) {
      var0.wjb(var1);
   }

   public static Splitter tgx() {
      return _rv;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7296078290046629709L, 5528617346226578122L, MethodHandles.lookup().lookupClass()).a(264440960644275L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 29849239365188L;
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
      String var6 = "ÖÁ\u0017ÿ¦ÒÊA9\u0093\u00ad\u008dÂËHe@¨u\u0090y\u0012ÿSö\u000f\u0011÷>øwB }\u001d(Û\u0088óøm\u0003¡\u0001:\u0092k¹î°Cíô²»Ë\u008aiÛ5\u0001\n²FÞ";
      int var8 = "ÖÁ\u0017ÿ¦ÒÊA9\u0093\u00ad\u008dÂËHe@¨u\u0090y\u0012ÿSö\u000f\u0011÷>øwB }\u001d(Û\u0088óøm\u0003¡\u0001:\u0092k¹î°Cíô²»Ë\u008aiÛ5\u0001\n²FÞ"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            _rv = Splitter.on('\u0000').limit(6);
            rk0 = LogManager.getLogger();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14872;
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
            throw new RuntimeException("t7e", var10);
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
         throw new RuntimeException("t7e" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
