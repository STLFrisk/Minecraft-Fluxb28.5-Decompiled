import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class svi extends vef {
   private static final long a;
   private static final String f;

   public svi(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.am1);
      this.wr5("thorns");
   }

   @Override
   public int qwk(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   @Override
   public int fnu(int var1) {
      return super.qwk(var1) + 50;
   }

   @Override
   public int ehp() {
      return 3;
   }

   @Override
   public boolean ovd(erg var1) {
      int var2 = OpaquePredicate.c();

      try {
         boolean var10000 = var1.gn1() instanceof jpt;
         if (var2 != 0) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return super.ovd(var1);
   }

   @Override
   public void k9o(Entity param1, EntityLivingBase param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic svi.a J
      // 03: ldc2_w 103632796472173
      // 06: lxor
      // 07: lstore 4
      // 09: aload 1
      // 0a: invokevirtual Entity.mbr ()Ljava/util/Random;
      // 0d: astore 7
      // 0f: invokestatic OpaquePredicate.b ()I
      // 12: getstatic vef.pm0 Lvef;
      // 15: aload 1
      // 16: invokestatic hc0.d4f (Lvef;Lg_3;)Lerg;
      // 19: astore 8
      // 1b: istore 6
      // 1d: iload 3
      // 1e: aload 7
      // 20: invokestatic svi.d94 (ILjava/util/Random;)Z
      // 23: ifeq 7d
      // 26: aload 2
      // 27: iload 6
      // 29: ifeq 55
      // 2c: goto 33
      // 2f: invokestatic svi.a (Loov;)Loov;
      // 32: athrow
      // 33: ifnull 60
      // 36: goto 3d
      // 39: invokestatic svi.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 2
      // 3e: aload 1
      // 3f: invokestatic ofh.i_z (Li2h;)Lofh;
      // 42: iload 3
      // 43: aload 7
      // 45: invokestatic svi.do7 (ILjava/util/Random;)I
      // 48: i2f
      // 49: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 4c: pop
      // 4d: aload 2
      // 4e: goto 55
      // 51: invokestatic svi.a (Loov;)Loov;
      // 54: athrow
      // 55: getstatic svi.f Ljava/lang/String;
      // 58: nop
      // 59: ldc 0.5
      // 5b: nop
      // 5c: fconst_1
      // 5d: invokevirtual EntityLivingBase.lhu (Ljava/lang/String;FF)V
      // 60: aload 8
      // 62: iload 6
      // 64: ifeq 73
      // 67: ifnull 9c
      // 6a: goto 71
      // 6d: invokestatic svi.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 8
      // 73: bipush 3
      // 74: aload 1
      // 75: invokevirtual erg.ybw (ILg_3;)V
      // 78: iload 6
      // 7a: ifne 9c
      // 7d: aload 8
      // 7f: iload 6
      // 81: ifeq 97
      // 84: goto 8b
      // 87: invokestatic svi.a (Loov;)Loov;
      // 8a: athrow
      // 8b: ifnull 9c
      // 8e: goto 95
      // 91: invokestatic svi.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 8
      // 97: bipush 1
      // 98: aload 1
      // 99: invokevirtual erg.ybw (ILg_3;)V
      // 9c: return
   }

   public static boolean d94(int param0, Random param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 0
      // 05: iload 2
      // 06: ifne 26
      // 09: ifgt 1b
      // 0c: goto 13
      // 0f: invokestatic svi.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 39
      // 17: invokestatic svi.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual java/util/Random.nextFloat ()F
      // 1f: ldc 0.15
      // 21: nop
      // 22: iload 0
      // 23: i2f
      // 24: fmul
      // 25: fcmpg
      // 26: iload 2
      // 27: ifne 35
      // 2a: ifge 38
      // 2d: goto 34
      // 30: invokestatic svi.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   public static int do7(int param0, Random param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 0
      // 05: bipush 10
      // 07: iload 2
      // 08: ifne 26
      // 0b: if_icmple 20
      // 0e: goto 15
      // 11: invokestatic svi.a (Loov;)Loov;
      // 14: athrow
      // 15: iload 0
      // 16: bipush 10
      // 18: isub
      // 19: goto 27
      // 1c: invokestatic svi.a (Loov;)Loov;
      // 1f: athrow
      // 20: bipush 1
      // 21: aload 1
      // 22: bipush 4
      // 23: invokevirtual java/util/Random.nextInt (I)I
      // 26: iadd
      // 27: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6602042656270076883L, -8744564533955211819L, MethodHandles.lookup().lookupClass()).a(2221508283027L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 13593240118774L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0015\u0014°éù«RµÐ\u001a\u009f\u0015så\u0084Â".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
}
