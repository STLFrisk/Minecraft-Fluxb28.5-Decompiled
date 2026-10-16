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

public class cdv extends ShaderHelper {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public cdv(Module var1, ShaderHelper var2) {
      this.jwv = var1;
      this.tqz = var2;
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial ShaderHelper.dig (CI)V
      // 0a: iload 2
      // 0b: bipush 1
      // 0c: iload 3
      // 0d: ifne 2e
      // 10: if_icmpne 2c
      // 13: goto 1a
      // 16: invokestatic cdv.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield cdv.f41 Lc05;
      // 1e: aload 0
      // 1f: getfield cdv.tqz Lgbe;
      // 22: invokevirtual Minecraft.z2i (Lgbe;)V
      // 25: goto 2c
      // 28: invokestatic cdv.a (Loov;)Loov;
      // 2b: athrow
      // 2c: iload 2
      // 2d: bipush 1
      // 2e: iload 3
      // 2f: ifne 7c
      // 32: if_icmpeq 78
      // 35: goto 3c
      // 38: invokestatic cdv.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 2
      // 3d: sipush 211
      // 40: iload 3
      // 41: ifne 7c
      // 44: goto 4b
      // 47: invokestatic cdv.a (Loov;)Loov;
      // 4a: athrow
      // 4b: if_icmpeq 78
      // 4e: goto 55
      // 51: invokestatic cdv.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: getfield cdv.jwv Lar7;
      // 59: iload 2
      // 5a: invokevirtual Module.nm8 (I)V
      // 5d: getstatic ClientState.qkk Lzwr;
      // 60: invokevirtual ClientState.getConfigManager ()Lszk;
      // 63: invokevirtual ConfigManager.saveBinds ()V
      // 66: aload 0
      // 67: getfield cdv.f41 Lc05;
      // 6a: aload 0
      // 6b: getfield cdv.tqz Lgbe;
      // 6e: invokevirtual Minecraft.z2i (Lgbe;)V
      // 71: goto 78
      // 74: invokestatic cdv.a (Loov;)Loov;
      // 77: athrow
      // 78: iload 2
      // 79: sipush 211
      // 7c: if_icmpne a2
      // 7f: aload 0
      // 80: getfield cdv.jwv Lar7;
      // 83: bipush 0
      // 84: invokevirtual Module.nm8 (I)V
      // 87: getstatic ClientState.qkk Lzwr;
      // 8a: invokevirtual ClientState.getConfigManager ()Lszk;
      // 8d: invokevirtual ConfigManager.saveBinds ()V
      // 90: aload 0
      // 91: getfield cdv.f41 Lc05;
      // 94: aload 0
      // 95: getfield cdv.tqz Lgbe;
      // 98: invokevirtual Minecraft.z2i (Lgbe;)V
      // 9b: goto a2
      // 9e: invokestatic cdv.a (Loov;)Loov;
      // a1: athrow
      // a2: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 140435800225207L;
      this.xmz();
      this.poi(this.fex, b<"h">(8573, 5634031842579776006L ^ var4) + syo.iyk + this.jwv.m2d(), this.dt7 / 2, 150, 16777215);
      this.poi(this.fex, b<"h">(30058, 5099101746785867280L ^ var4), this.dt7 / 2, 170, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1690071979324536586L, 3327204476383308832L, MethodHandles.lookup().lookupClass()).a(243405233819433L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 85303855821923L;
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
      String var6 = "\u0016±³Å\u008eÃE\u009aÅ¢ \u00857ÿZq£\u0091\b\u009eÏ!Ó½ù7°@Øø½\u008du\u001b\u0089$xD$\u0006@\u0003N\u009a¬Á©=_ï6ª\u0083\u008b\u0085¼\u0090æ\u0095\u0081õ0¿Â°c\u000f-Ö\u0080\u000fÿvX&¦Òd\u0003;Õó\t\u0088Z¡\u0010KË\u009fô\u0081ÊÂÆÎl¯Ñ\u0080k¹\u0097V¼";
      int var8 = "\u0016±³Å\u008eÃE\u009aÅ¢ \u00857ÿZq£\u0091\b\u009eÏ!Ó½ù7°@Øø½\u008du\u001b\u0089$xD$\u0006@\u0003N\u009a¬Á©=_ï6ª\u0083\u008b\u0085¼\u0090æ\u0095\u0081õ0¿Â°c\u000f-Ö\u0080\u000fÿvX&¦Òd\u0003;Õó\t\u0088Z¡\u0010KË\u009fô\u0081ÊÂÆÎl¯Ñ\u0080k¹\u0097V¼"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[2];
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 841;
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
            throw new RuntimeException("cdv", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("cdv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
