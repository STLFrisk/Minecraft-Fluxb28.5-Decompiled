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

public class sq8 extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public sq8() {
      long var1 = a ^ 24257504437762L;
      super(a<"c">(30229, 5228544732056492657L ^ var1), a<"c">(27194, 4334706226758911583L ^ var1));
   }

   @jev
   public void zis(_qa param1) {
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
      // 05: getfield sq8.wyl Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: iload 2
      // 0c: ifeq c8
      // 0f: getfield l86.lfk Z
      // 12: ifeq c1
      // 15: goto 1c
      // 18: invokestatic sq8.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield sq8.u7b I
      // 21: bipush 1
      // 22: iadd
      // 23: putfield sq8.u7b I
      // 26: aload 0
      // 27: dup
      // 28: getfield sq8.u7b I
      // 2b: bipush 2
      // 2c: irem
      // 2d: putfield sq8.u7b I
      // 30: aload 0
      // 31: iload 2
      // 32: ifeq 93
      // 35: goto 3c
      // 38: invokestatic sq8.a (Loov;)Loov;
      // 3b: athrow
      // 3c: getfield sq8.u7b I
      // 3f: bipush 1
      // 40: if_icmpne 79
      // 43: goto 4a
      // 46: invokestatic sq8.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield sq8.wyl Lc05;
      // 4e: getfield c05.vg8 Ll86;
      // 51: dup
      // 52: getfield l86.icv D
      // 55: ldc2_w 2.58
      // 58: dmul
      // 59: putfield l86.icv D
      // 5c: aload 0
      // 5d: getfield sq8.wyl Lc05;
      // 60: getfield c05.vg8 Ll86;
      // 63: dup
      // 64: getfield l86.bw4 D
      // 67: ldc2_w 2.58
      // 6a: dmul
      // 6b: putfield l86.bw4 D
      // 6e: iload 2
      // 6f: ifne a4
      // 72: goto 79
      // 75: invokestatic sq8.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield sq8.wyl Lc05;
      // 7d: getfield c05.vg8 Ll86;
      // 80: dup
      // 81: getfield l86.icv D
      // 84: ldc2_w 1.5
      // 87: ddiv
      // 88: putfield l86.icv D
      // 8b: aload 0
      // 8c: goto 93
      // 8f: invokestatic sq8.a (Loov;)Loov;
      // 92: athrow
      // 93: getfield sq8.wyl Lc05;
      // 96: getfield c05.vg8 Ll86;
      // 99: dup
      // 9a: getfield l86.bw4 D
      // 9d: ldc2_w 1.5
      // a0: ddiv
      // a1: putfield l86.bw4 D
      // a4: aload 0
      // a5: getfield sq8.wyl Lc05;
      // a8: getfield c05.vg8 Ll86;
      // ab: dup
      // ac: getfield l86.z66 F
      // af: fconst_0
      // b0: fmul
      // b1: putfield l86.z66 F
      // b4: aload 0
      // b5: getfield sq8.wyl Lc05;
      // b8: getfield c05.vg8 Ll86;
      // bb: ldc2_w 0.001
      // be: putfield l86.mop D
      // c1: aload 0
      // c2: getfield sq8.wyl Lc05;
      // c5: getfield c05.vg8 Ll86;
      // c8: bipush 0
      // c9: putfield l86.u19 Z
      // cc: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4643849622320965303L, 1197086781138129533L, MethodHandles.lookup().lookupClass()).a(84616032605561L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 77726607943206L;
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
      String var6 = "¸\\0E£ÐQB\n\u0086±¦P\u001f\tX\u0010îÔ/Y´ÔÓ\u001cð^\u0017sNxX\u001a";
      int var8 = "¸\\0E£ÐQB\n\u0086±¦P\u001f\tX\u0010îÔ/Y´ÔÓ\u001cð^\u0017sNxX\u001a".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5993;
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
            throw new RuntimeException("sq8", var10);
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
         throw new RuntimeException("sq8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
