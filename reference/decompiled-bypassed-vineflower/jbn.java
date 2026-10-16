import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jbn extends ar7 {
   public static crk q25;
   public static crk hoc;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public jbn() {
      long var1 = a ^ 80970702427283L;
      super(b<"h">(14945, 8717819106574489076L ^ var1), _aj.twm, false, new j1s[0]);
      this.pdy = new nhs();
   }

   @Override
   public void ron() {
      super.ron();
      this.glw();
   }

   @jev
   public void mor(ccn param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield jbn.pdy Lnhs;
      // 08: aload 0
      // 09: getfield jbn.j2l I
      // 0c: i2d
      // 0d: invokevirtual nhs.yrv (D)Z
      // 10: iload 2
      // 11: ifeq 3e
      // 14: ifeq 82
      // 17: goto 1e
      // 1a: invokestatic jbn.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: pop
      // 20: getstatic jbn.ek1 Lc05;
      // 23: getfield c05.oxn Lmoh;
      // 26: getfield moh.d25 Lm7l;
      // 29: iload 2
      // 2a: ifeq 73
      // 2d: goto 34
      // 30: invokestatic jbn.a (Loov;)Loov;
      // 33: athrow
      // 34: getfield m7l.m7n Z
      // 37: goto 3e
      // 3a: invokestatic jbn.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ifeq 82
      // 41: aload 0
      // 42: pop
      // 43: getstatic jbn.ek1 Lc05;
      // 46: getfield c05.oxn Lmoh;
      // 49: getfield moh.d25 Lm7l;
      // 4c: bipush 0
      // 4d: putfield m7l.m7n Z
      // 50: aload 0
      // 51: pop
      // 52: getstatic jbn.ek1 Lc05;
      // 55: bipush 0
      // 56: invokevirtual c05.v78 (I)V
      // 59: aload 0
      // 5a: pop
      // 5b: getstatic jbn.ek1 Lc05;
      // 5e: invokevirtual c05.mza ()V
      // 61: aload 0
      // 62: pop
      // 63: getstatic jbn.ek1 Lc05;
      // 66: getfield c05.oxn Lmoh;
      // 69: getfield moh.d25 Lm7l;
      // 6c: goto 73
      // 6f: invokestatic jbn.a (Loov;)Loov;
      // 72: athrow
      // 73: bipush 1
      // 74: putfield m7l.m7n Z
      // 77: aload 0
      // 78: invokespecial jbn.glw ()V
      // 7b: aload 0
      // 7c: getfield jbn.pdy Lnhs;
      // 7f: invokevirtual nhs.zay ()V
      // 82: return
   }

   private void glw() {
      this.j2l = (int)(1000.0F / q25.d7c() - 1000.0F / hoc.d7c() + (float)new Random().nextInt((int)(1000.0F / hoc.d7c() * 2.0F)));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3606893845575141411L, -4945855598243355572L, MethodHandles.lookup().lookupClass()).a(279404777443044L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 46059760868918L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "³*/Vtms\u0013\u001f\u0095Ì\u008fþ\u001c\u00839\u0018jw#:x\u001e\u000e\u009d(\u0015^PDg¯þ\u0099\u0091Ï_Àøuó";
      int var6 = "³*/Vtms\u0013\u001f\u0095Ì\u008fþ\u001c\u00839\u0018jw#:x\u001e\u000e\u009d(\u0015^PDg¯þ\u0099\u0091Ï_Àøuó".length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[4];
                     q25 = new crk(b<"h">(10162, 5504157467378549376L ^ var9), b<"h">(5130, 7316683487535083833L ^ var9), 10.0F, 5.0F, 20.0F, 1.0F);
                     hoc = new crk(b<"h">(10162, 5504157467378549376L ^ var9), b<"h">(17050, 7205514358463391659L ^ var9), 3.0F, 0.0F, 10.0F, 1.0F);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u009dìê«ò\u0090èeä\u0012ðl\u0087Pè ¦î~á6{La\u0018\u007f\u001f=\u009ey\u0013Ö]åu\n¡lo\u00193\u0011RrÔ\bd\u0095\u000b";
                  var6 = "\u009dìê«ò\u0090èeä\u0012ðl\u0087Pè ¦î~á6{La\u0018\u007f\u001f=\u009ey\u0013Ö]åu\n¡lo\u00193\u0011RrÔ\bd\u0095\u000b".length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14550;
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
            throw new RuntimeException("jbn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("jbn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
