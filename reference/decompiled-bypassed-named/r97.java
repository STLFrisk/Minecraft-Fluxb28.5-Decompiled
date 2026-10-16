import java.io.PrintStream;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r97 {
   private static final PrintStream g6e;
   private static boolean xt5;
   private static final Logger _j0;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static boolean nva() {
      return xt5;
   }

   public static void x11() {
      okn.r4s.emn(xbr.tzx, new r97$1());
      okn.r4s.emn(xbr.ipl, new r97$2());
      okn.r4s.emn(xbr.db4, new r97$3());
      okn.r4s.emn(xbr.ttz, new r97$4());
      okn.r4s.emn(xbr.ik6, new r97$5());
      okn.r4s.emn(xbr.pb_, new r97$6());
      okn.r4s.emn(xbr.x9x, new r97$7());
      okn.r4s.emn(xbr.td3, new r97$8());
      okn.r4s.emn(xbr.suy, new r97$9());
      r97$10 var0 = new r97$10();
      okn.r4s.emn(xbr.miu, var0);
      okn.r4s.emn(xbr.lqp, var0);
      okn.r4s.emn(xbr.xxz, new r97$11());
      okn.r4s.emn(xbr.za8, new r97$12());
      okn.r4s.emn(xbr.nnn, new r97$13());
      okn.r4s.emn(u7m.gfm(ox_.od1), new r97$14());
      okn.r4s.emn(xbr.r9n, new r97$15());
      okn.r4s.emn(u7m.gfm(ox_.jzx), new r97$16());
   }

   public static void j69() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic r97.xt5 Z
      // 07: iload 0
      // 08: ifeq 33
      // 0b: ifne 48
      // 0e: goto 15
      // 11: invokestatic r97.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 1
      // 16: putstatic r97.xt5 Z
      // 19: iload 0
      // 1a: ifeq 45
      // 1d: goto 24
      // 20: invokestatic r97.a (Loov;)Loov;
      // 23: athrow
      // 24: getstatic r97._j0 Lorg/apache/logging/log4j/Logger;
      // 27: invokeinterface org/apache/logging/log4j/Logger.isDebugEnabled ()Z 1
      // 2c: goto 33
      // 2f: invokestatic r97.a (Loov;)Loov;
      // 32: athrow
      // 33: ifeq 39
      // 36: invokestatic r97.tof ()V
      // 39: invokestatic e0x.m1n ()V
      // 3c: invokestatic wuo.sjd ()V
      // 3f: invokestatic u7m.u3u ()V
      // 42: invokestatic l9p.s2u ()V
      // 45: invokestatic r97.x11 ()V
      // 48: return
   }

   private static void tof() {
      long var0 = a ^ 125290976030280L;
      System.setErr(new su7(a<"g">(17427, 1951080495354178011L ^ var0), System.err));
      System.setOut(new su7(a<"g">(19505, 2973413663021851128L ^ var0), g6e));
   }

   public static void xe3(String var0) {
      g6e.println(var0);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4801224294977793771L, 3227375583917938952L, MethodHandles.lookup().lookupClass()).a(218177585123113L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 3921539097196L;
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
      String var6 = "@ï\tÎ>¤\u0004ç\u0097ö\u001a\u001aÕ2M7\u0010ó§\u0091\u008e\u009aÕhO\u0080£ºÀaÔqô";
      int var8 = "@ï\tÎ>¤\u0004ç\u0097ö\u001a\u001aÕ2M7\u0010ó§\u0091\u008e\u009aÕhO\u0080£ºÀaÔqô".length();
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
            g6e = System.out;
            xt5 = false;
            _j0 = LogManager.getLogger();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19351;
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
            throw new RuntimeException("r97", var10);
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
         throw new RuntimeException("r97" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
