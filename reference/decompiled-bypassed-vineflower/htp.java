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

public class htp extends vef {
   public final int scr;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public htp(int var1, gdz var2, int var3, int var4) {
      super(var1, var2, var3, bn1.phf);
      this.scr = var4;
   }

   @Override
   public int qwk(int var1) {
      return qhp[this.scr] + (var1 - 1) * l5a[this.scr];
   }

   @Override
   public int fnu(int var1) {
      return this.qwk(var1) + tfq[this.scr];
   }

   @Override
   public int ehp() {
      return 5;
   }

   @Override
   public float bxa(int param1, n1e param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield htp.scr I
      // 08: iload 3
      // 09: ifeq 27
      // 0c: ifne 23
      // 0f: goto 16
      // 12: invokestatic htp.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 1
      // 17: i2f
      // 18: ldc 1.25
      // 1a: nop
      // 1b: fmul
      // 1c: goto 75
      // 1f: invokestatic htp.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield htp.scr I
      // 27: bipush 1
      // 28: iload 3
      // 29: ifeq 56
      // 2c: if_icmpne 51
      // 2f: goto 36
      // 32: invokestatic htp.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 2
      // 37: getstatic n1e.via Ln1e;
      // 3a: if_acmpne 51
      // 3d: goto 44
      // 40: invokestatic htp.a (Loov;)Loov;
      // 43: athrow
      // 44: iload 1
      // 45: i2f
      // 46: ldc 2.5
      // 48: nop
      // 49: fmul
      // 4a: goto 75
      // 4d: invokestatic htp.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield htp.scr I
      // 55: bipush 2
      // 56: if_icmpne 74
      // 59: aload 2
      // 5a: getstatic n1e.mw4 Ln1e;
      // 5d: if_acmpne 74
      // 60: goto 67
      // 63: invokestatic htp.a (Loov;)Loov;
      // 66: athrow
      // 67: iload 1
      // 68: i2f
      // 69: ldc 2.5
      // 6b: nop
      // 6c: fmul
      // 6d: goto 75
      // 70: invokestatic htp.a (Loov;)Loov;
      // 73: athrow
      // 74: fconst_0
      // 75: freturn
   }

   @Override
   public String d8j() {
      long var1 = a ^ 12773443401950L;
      return b<"t">(14605, 3146032101093764247L ^ var1) + xgs[this.scr];
   }

   @Override
   public boolean yhx(vef var1) {
      int var2 = t9d.b();

      try {
         boolean var10000 = var1 instanceof htp;
         if (var2 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public boolean ovd(erg var1) {
      int var2 = t9d.b();

      try {
         boolean var10000 = var1.gn1() instanceof dlj;
         if (var2 == 0) {
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
   public void cdh(g_3 param1, i2h param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 20
      // 0b: instanceof g_3
      // 0e: ifeq 64
      // 11: goto 18
      // 14: invokestatic htp.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 2
      // 19: goto 20
      // 1c: invokestatic htp.a (Loov;)Loov;
      // 1f: athrow
      // 20: checkcast g_3
      // 23: astore 5
      // 25: aload 0
      // 26: getfield htp.scr I
      // 29: bipush 2
      // 2a: if_icmpne 64
      // 2d: aload 5
      // 2f: invokevirtual g_3.fhc ()Ln1e;
      // 32: getstatic n1e.mw4 Ln1e;
      // 35: if_acmpne 64
      // 38: goto 3f
      // 3b: invokestatic htp.a (Loov;)Loov;
      // 3e: athrow
      // 3f: bipush 20
      // 41: aload 1
      // 42: invokevirtual g_3.mbr ()Ljava/util/Random;
      // 45: bipush 10
      // 47: iload 3
      // 48: imul
      // 49: invokevirtual java/util/Random.nextInt (I)I
      // 4c: iadd
      // 4d: istore 6
      // 4f: aload 5
      // 51: new sdj
      // 54: dup
      // 55: getstatic mcs.j2p Lmcs;
      // 58: getfield mcs.zr9 I
      // 5b: iload 6
      // 5d: bipush 3
      // 5e: invokespecial sdj.<init> (III)V
      // 61: invokevirtual g_3.gmn (Lsdj;)V
      // 64: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5317014379702848747L, -8087176626319974864L, MethodHandles.lookup().lookupClass()).a(249426011045778L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 86328875241019L;
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
      String var4 = "\u0005MÿÓ%ëÍ¿µ0I$Y ÏðHÂ\u001dÌ\u0002\u0099àÙ\u0094æjûÓÎN><l\u0099Ë=\u007f³n\u0010QD\u001f³Îô'\u0087v£\u0090`\u001fïÉã";
      int var6 = "\u0005MÿÓ%ëÍ¿µ0I$Y ÏðHÂ\u001dÌ\u0002\u0099àÙ\u0094æjûÓÎN><l\u0099Ë=\u007f³n\u0010QD\u001f³Îô'\u0087v£\u0090`\u001fïÉã".length();
      char var3 = '(';
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
                     xgs = new String[]{
                        b<"t">(27579, 5109915488464636102L ^ var9), b<"t">(9916, 6735177624549443010L ^ var9), b<"t">(12616, 4353973468498121268L ^ var9)
                     };
                     qhp = new int[]{1, 5, 5};
                     l5a = new int[]{11, 8, 8};
                     tfq = new int[]{20, 20, 20};
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

                  var4 = "\u007fÿ\u0082$o\u009eG?ë²\u0014\u001b\u0090·Îj -tðÙf;ýU\u008a¹Î\u0093\u0005¹«\u0005Wÿæw_Y¿k\f\u0001¯Õ\u001d<\u009an";
                  var6 = "\u007fÿ\u0082$o\u009eG?ë²\u0014\u001b\u0090·Îj -tðÙf;ýU\u008a¹Î\u0093\u0005¹«\u0005Wÿæw_Y¿k\f\u0001¯Õ\u001d<\u009an".length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30062;
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
            throw new RuntimeException("htp", var10);
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
         throw new RuntimeException("htp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
