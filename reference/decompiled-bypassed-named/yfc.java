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

public class yfc {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void _o2(ha9 var1) {
      int var2 = OpaquePredicate.c();
      float var3 = this.fhk;

      boolean var10000;
      label44: {
         try {
            var10000 = Float.isNaN(var3);
            if (var2 != 0) {
               break label44;
            }

            if (var10000) {
               return;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var3 = this.rod;

         try {
            if (var2 != 0) {
               return;
            }

            var10000 = Float.isNaN(var3);
         } catch (oov var5) {
            throw a(var5);
         }
      }

      try {
         if (!var10000) {
            this.vda(Minecraft.vz1().oxn.igw);
            var1.x5k = this.fhk;
            var1.y2i = this.rod;
            return;
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public void vda(float var1) {
      float var2 = var1 * 0.6F + 0.2F;
      float var3 = var2 * var2 * var2 * 1.2F;
      this.fhk = this.fhk - this.fhk % var3;
      this.rod = this.rod - this.rod % var3;
   }

   public float swo() {
      return this.fhk;
   }

   public void nms(float var1) {
      this.fhk = var1;
   }

   public float xvn() {
      return this.rod;
   }

   public void qg6(float var1) {
      this.rod = var1;
   }

   public yfc(float var1, float var2) {
      this.fhk = var1;
      this.rod = var2;
   }

   public float raa() {
      return this.fhk;
   }

   public float hzp() {
      return this.rod;
   }

   public yfc r3y(float var1, float var2) {
      return new yfc(var1, var2);
   }

   public static yfc zbf(yfc var0, float var1, float var2, int var3, Object var4) {
      int var5 = OpaquePredicate.b();

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var3 & 1;
               if (var5 == 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var1 = var0.fhk;
         }

         var10000 = var3 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.rod;
      }

      return var0.r3y(var1, var2);
   }

   @Override
   public String toString() {
      long var1 = a ^ 16067832349799L;
      return a<"a">(31002, 2038777217371627361L ^ var1) + this.fhk + a<"a">(29024, 6879379434480391962L ^ var1) + this.rod + ")";
   }

   @Override
   public int hashCode() {
      return Float.hashCode(this.fhk) * 31 + Float.hashCode(this.rod);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1c
      // 09: aload 1
      // 0a: if_acmpeq 73
      // 0d: goto 14
      // 10: invokestatic yfc.a (Loov;)Loov;
      // 13: athrow
      // 14: aload 1
      // 15: goto 1c
      // 18: invokestatic yfc.a (Loov;)Loov;
      // 1b: athrow
      // 1c: instanceof yfc
      // 1f: iload 2
      // 20: ifne 72
      // 23: ifeq 71
      // 26: goto 2d
      // 29: invokestatic yfc.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: checkcast yfc
      // 31: astore 3
      // 32: aload 0
      // 33: getfield yfc.fhk F
      // 36: aload 3
      // 37: getfield yfc.fhk F
      // 3a: invokestatic java/lang/Float.compare (FF)I
      // 3d: iload 2
      // 3e: ifne 72
      // 41: ifne 71
      // 44: goto 4b
      // 47: invokestatic yfc.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield yfc.rod F
      // 4f: aload 3
      // 50: getfield yfc.rod F
      // 53: invokestatic java/lang/Float.compare (FF)I
      // 56: iload 2
      // 57: ifne 72
      // 5a: goto 61
      // 5d: invokestatic yfc.a (Loov;)Loov;
      // 60: athrow
      // 61: ifne 71
      // 64: goto 6b
      // 67: invokestatic yfc.a (Loov;)Loov;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: ireturn
      // 6d: invokestatic yfc.a (Loov;)Loov;
      // 70: athrow
      // 71: bipush 0
      // 72: ireturn
      // 73: bipush 1
      // 74: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6713197158685507277L, 637558174957702582L, MethodHandles.lookup().lookupClass()).a(266937878442579L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 64612761734322L;
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
      String var6 = "\u0090Õw¢+îd±Ç @'Fó\u0006[ÜSf\u0000\u0089B(³\u0000|xfL÷\u001d\u0099 ÷/\u0017\u0085O\u0090q¨ç&KB\u0000(ÞL®´÷¯\u00ad\u00005\n+ÔÂ\u0080©5¹¿";
      int var8 = "\u0090Õw¢+îd±Ç @'Fó\u0006[ÜSf\u0000\u0089B(³\u0000|xfL÷\u001d\u0099 ÷/\u0017\u0085O\u0090q¨ç&KB\u0000(ÞL®´÷¯\u00ad\u00005\n+ÔÂ\u0080©5¹¿"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20341;
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
            throw new RuntimeException("yfc", var10);
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
         throw new RuntimeException("yfc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
