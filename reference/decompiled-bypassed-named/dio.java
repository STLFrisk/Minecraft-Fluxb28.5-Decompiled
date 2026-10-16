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

public class dio extends SubEngine {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public dio() {
      long var1 = a ^ 111231272544401L;
      super(a<"l">(2175, 7569866520916580185L ^ var1), a<"l">(14334, 2492489121696868569L ^ var1));
   }

   @Override
   public void onUpdate() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1f
      // 09: getfield dio.wyl Lc05;
      // 0c: getfield Minecraft.tij Lkh3;
      // 0f: ifnonnull 1e
      // 12: goto 19
      // 15: invokestatic dio.a (Loov;)Loov;
      // 18: athrow
      // 19: return
      // 1a: invokestatic dio.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokespecial SubEngine.onUpdate ()V
      // 22: return
   }

   @Override
   public void onRender() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial SubEngine.onRender ()V
      // 08: aload 0
      // 09: getfield dio.wyl Lc05;
      // 0c: iload 1
      // 0d: ifne 26
      // 10: getfield Minecraft.tij Lkh3;
      // 13: ifnonnull 22
      // 16: goto 1d
      // 19: invokestatic dio.a (Loov;)Loov;
      // 1c: athrow
      // 1d: return
      // 1e: invokestatic dio.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield dio.wyl Lc05;
      // 26: getfield Minecraft.l7q Lhh6;
      // 29: invokevirtual hh6.fdl ()Lh50$f05;
      // 2c: getstatic h50$f05._nr Lh50$f05;
      // 2f: iload 1
      // 30: ifne 5c
      // 33: if_acmpeq 82
      // 36: goto 3d
      // 39: invokestatic dio.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield dio.wyl Lc05;
      // 41: iload 1
      // 42: ifne 78
      // 45: goto 4c
      // 48: invokestatic dio.a (Loov;)Loov;
      // 4b: athrow
      // 4c: getfield Minecraft.l7q Lhh6;
      // 4f: invokevirtual hh6.fdl ()Lh50$f05;
      // 52: getstatic h50$f05.l18 Lh50$f05;
      // 55: goto 5c
      // 58: invokestatic dio.a (Loov;)Loov;
      // 5b: athrow
      // 5c: if_acmpeq 82
      // 5f: aload 0
      // 60: getfield dio.wyl Lc05;
      // 63: getfield Minecraft.vg8 Ll86;
      // 66: getfield EntityPlayerSP.lls Lpj2;
      // 69: bipush 0
      // 6a: putfield pj2.wvp Z
      // 6d: aload 0
      // 6e: getfield dio.wyl Lc05;
      // 71: goto 78
      // 74: invokestatic dio.a (Loov;)Loov;
      // 77: athrow
      // 78: getfield Minecraft.vg8 Ll86;
      // 7b: getfield EntityPlayerSP.lls Lpj2;
      // 7e: bipush 0
      // 7f: putfield pj2.wzx Z
      // 82: return
   }

   @EventHandler
   private void z2p(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield dio.wyl Lc05;
      // 08: getfield Minecraft.l7q Lhh6;
      // 0b: invokevirtual hh6.fdl ()Lh50$f05;
      // 0e: getstatic h50$f05._nr Lh50$f05;
      // 11: iload 2
      // 12: ifeq 3e
      // 15: if_acmpeq 7e
      // 18: goto 1f
      // 1b: invokestatic dio.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield dio.wyl Lc05;
      // 23: iload 2
      // 24: ifeq 68
      // 27: goto 2e
      // 2a: invokestatic dio.a (Loov;)Loov;
      // 2d: athrow
      // 2e: getfield Minecraft.l7q Lhh6;
      // 31: invokevirtual hh6.fdl ()Lh50$f05;
      // 34: getstatic h50$f05.l18 Lh50$f05;
      // 37: goto 3e
      // 3a: invokestatic dio.a (Loov;)Loov;
      // 3d: athrow
      // 3e: if_acmpeq 7e
      // 41: aload 0
      // 42: getfield dio.wyl Lc05;
      // 45: getfield Minecraft.vg8 Ll86;
      // 48: getfield EntityPlayerSP.lls Lpj2;
      // 4b: bipush 1
      // 4c: putfield pj2.wvp Z
      // 4f: aload 0
      // 50: getfield dio.wyl Lc05;
      // 53: getfield Minecraft.vg8 Ll86;
      // 56: getfield EntityPlayerSP.lls Lpj2;
      // 59: bipush 1
      // 5a: putfield pj2.wzx Z
      // 5d: aload 0
      // 5e: getfield dio.wyl Lc05;
      // 61: goto 68
      // 64: invokestatic dio.a (Loov;)Loov;
      // 67: athrow
      // 68: getfield Minecraft.vg8 Ll86;
      // 6b: getfield EntityPlayerSP.lls Lpj2;
      // 6e: getstatic Fly.ewf Lcrk;
      // 71: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 74: invokevirtual java/lang/Float.floatValue ()F
      // 77: ldc 0.05
      // 79: nop
      // 7a: fmul
      // 7b: invokevirtual pj2.e7s (F)V
      // 7e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7426199114673678244L, 3703104432218373010L, MethodHandles.lookup().lookupClass()).a(119665620372199L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 7205171429244L;
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
      String var6 = "V\u00ad·È\u0002\"èw\u0011P?û\u009dË\u0083é\u0010\u0081\u0081§U\u008f¼_+©¬éëéd\u0004G";
      int var8 = "V\u00ad·È\u0002\"èw\u0011P?û\u009dË\u0083é\u0010\u0081\u0081§U\u008f¼_+©¬éëéd\u0004G".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("dio", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("dio" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
