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

public class bs_ extends SubEngine {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public bs_() {
      long var1 = a ^ 20149469734251L;
      super(a<"r">(4373, 8365237403767930562L ^ var1), a<"r">(4460, 690468598987259578L ^ var1));
   }

   @EventHandler
   public void su0(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: invokestatic bk4.da2 ()Z
      // 07: iload 2
      // 08: ifeq 31
      // 0b: ifeq 73
      // 0e: goto 15
      // 11: invokestatic bs_.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: getfield bs_.wyl Lc05;
      // 19: getfield Minecraft.vg8 Ll86;
      // 1c: iload 2
      // 1d: ifeq 42
      // 20: goto 27
      // 23: invokestatic bs_.a (Loov;)Loov;
      // 26: athrow
      // 27: invokevirtual EntityPlayerSP.hzv ()Z
      // 2a: goto 31
      // 2d: invokestatic bs_.a (Loov;)Loov;
      // 30: athrow
      // 31: ifeq 73
      // 34: aload 0
      // 35: getfield bs_.wyl Lc05;
      // 38: getfield Minecraft.vg8 Ll86;
      // 3b: goto 42
      // 3e: invokestatic bs_.a (Loov;)Loov;
      // 41: athrow
      // 42: getfield EntityPlayerSP.x5k F
      // 45: fstore 3
      // 46: fconst_1
      // 47: fstore 4
      // 49: aload 0
      // 4a: getfield bs_.wyl Lc05;
      // 4d: getfield Minecraft.vg8 Ll86;
      // 50: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 53: dconst_1
      // 54: fload 3
      // 55: ldc 90.0
      // 57: nop
      // 58: fadd
      // 59: f2d
      // 5a: invokestatic java/lang/Math.toRadians (D)D
      // 5d: invokestatic java/lang/Math.cos (D)D
      // 60: dmul
      // 61: dconst_0
      // 62: dconst_1
      // 63: fload 3
      // 64: ldc 90.0
      // 66: nop
      // 67: fadd
      // 68: f2d
      // 69: invokestatic java/lang/Math.toRadians (D)D
      // 6c: invokestatic java/lang/Math.sin (D)D
      // 6f: dmul
      // 70: invokevirtual nh4.z6k (DDD)V
      // 73: return
   }

   @EventHandler
   public void trv(w1x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual w1x.jqi ()Lnh4;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifnull 60
      // 0f: goto 16
      // 12: invokestatic bs_.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual w1x.jqi ()Lnh4;
      // 1a: goto 21
      // 1d: invokestatic bs_.a (Loov;)Loov;
      // 20: athrow
      // 21: getfield nh4.i2c D
      // 24: aload 0
      // 25: getfield bs_.wyl Lc05;
      // 28: getfield Minecraft.vg8 Ll86;
      // 2b: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 2e: getfield nh4.bx_ D
      // 31: dcmpl
      // 32: iload 2
      // 33: ifeq 51
      // 36: ifle 60
      // 39: goto 40
      // 3c: invokestatic bs_.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield bs_.wyl Lc05;
      // 44: getfield Minecraft.vg8 Ll86;
      // 47: invokevirtual EntityPlayerSP.hzv ()Z
      // 4a: goto 51
      // 4d: invokestatic bs_.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq 60
      // 54: aload 1
      // 55: aconst_null
      // 56: invokevirtual w1x.wfu (Lnh4;)V
      // 59: goto 60
      // 5c: invokestatic bs_.a (Loov;)Loov;
      // 5f: athrow
      // 60: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3719610109647979107L, -5193341156466820161L, MethodHandles.lookup().lookupClass()).a(249906850135206L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 21671952825154L;
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
      String var6 = "Ä6Öê\u0099\u0003?\u0010Î\u0080\u008d¸ó\u0091¤U\u0010\u007f´Ôbn}Õ×»\u0014¨\u0005úêcW";
      int var8 = "Ä6Öê\u0099\u0003?\u0010Î\u0080\u008d¸ó\u0091¤U\u0010\u007f´Ôbn}Õ×»\u0014¨\u0005úêcW".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 133;
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
            throw new RuntimeException("bs_", var10);
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
         throw new RuntimeException("bs_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
