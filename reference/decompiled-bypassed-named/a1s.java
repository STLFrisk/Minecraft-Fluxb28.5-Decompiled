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

public class a1s extends vef {
   public final int t_s;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public a1s(int var1, gdz var2, int var3, int var4) {
      super(var1, var2, var3, bn1.jfw);
      this.t_s = var4;
      if (var4 == 2) {
         this.n1z = bn1.t6y;
      }
   }

   @Override
   public int qwk(int var1) {
      return jou[this.t_s] + (var1 - 1) * xrt[this.t_s];
   }

   @Override
   public int fnu(int var1) {
      return this.qwk(var1) + c4m[this.t_s];
   }

   @Override
   public int ehp() {
      return 4;
   }

   @Override
   public int f_3(int param1, ofh param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 2
      // 005: invokevirtual ofh.u5u ()Z
      // 008: iload 3
      // 009: ifeq 022
      // 00c: ifeq 01c
      // 00f: goto 016
      // 012: invokestatic a1s.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic a1s.a (Loov;)Loov;
      // 01b: athrow
      // 01c: bipush 6
      // 01e: iload 1
      // 01f: iload 1
      // 020: imul
      // 021: iadd
      // 022: i2f
      // 023: ldc 3.0
      // 025: nop
      // 026: fdiv
      // 027: fstore 4
      // 029: aload 0
      // 02a: getfield a1s.t_s I
      // 02d: iload 3
      // 02e: ifeq 04f
      // 031: ifne 04b
      // 034: goto 03b
      // 037: invokestatic a1s.a (Loov;)Loov;
      // 03a: athrow
      // 03b: fload 4
      // 03d: ldc 0.75
      // 03f: nop
      // 040: fmul
      // 041: invokestatic fe6.tpk (F)I
      // 044: goto 134
      // 047: invokestatic a1s.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield a1s.t_s I
      // 04f: bipush 1
      // 050: iload 3
      // 051: ifeq 08c
      // 054: if_icmpne 087
      // 057: goto 05e
      // 05a: invokestatic a1s.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 2
      // 05f: invokevirtual ofh.i0l ()Z
      // 062: iload 3
      // 063: ifeq 08b
      // 066: goto 06d
      // 069: invokestatic a1s.a (Loov;)Loov;
      // 06c: athrow
      // 06d: ifeq 087
      // 070: goto 077
      // 073: invokestatic a1s.a (Loov;)Loov;
      // 076: athrow
      // 077: fload 4
      // 079: ldc 1.25
      // 07b: nop
      // 07c: fmul
      // 07d: invokestatic fe6.tpk (F)I
      // 080: goto 134
      // 083: invokestatic a1s.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: getfield a1s.t_s I
      // 08b: bipush 2
      // 08c: iload 3
      // 08d: ifeq 0bd
      // 090: if_icmpne 0b8
      // 093: goto 09a
      // 096: invokestatic a1s.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 2
      // 09b: getstatic ofh.m8d Lofh;
      // 09e: if_acmpne 0b8
      // 0a1: goto 0a8
      // 0a4: invokestatic a1s.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: fload 4
      // 0aa: ldc 2.5
      // 0ac: nop
      // 0ad: fmul
      // 0ae: invokestatic fe6.tpk (F)I
      // 0b1: goto 134
      // 0b4: invokestatic a1s.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: getfield a1s.t_s I
      // 0bc: bipush 3
      // 0bd: iload 3
      // 0be: ifeq 104
      // 0c1: if_icmpne 0f4
      // 0c4: goto 0cb
      // 0c7: invokestatic a1s.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 2
      // 0cc: invokevirtual ofh.yto ()Z
      // 0cf: iload 3
      // 0d0: ifeq 0f8
      // 0d3: goto 0da
      // 0d6: invokestatic a1s.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: ifeq 0f4
      // 0dd: goto 0e4
      // 0e0: invokestatic a1s.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: fload 4
      // 0e6: ldc 1.5
      // 0e8: nop
      // 0e9: fmul
      // 0ea: invokestatic fe6.tpk (F)I
      // 0ed: goto 134
      // 0f0: invokestatic a1s.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: getfield a1s.t_s I
      // 0f8: iload 3
      // 0f9: ifeq 112
      // 0fc: bipush 4
      // 0fd: goto 104
      // 100: invokestatic a1s.a (Loov;)Loov;
      // 103: athrow
      // 104: if_icmpne 133
      // 107: aload 2
      // 108: invokevirtual ofh.u0p ()Z
      // 10b: goto 112
      // 10e: invokestatic a1s.a (Loov;)Loov;
      // 111: athrow
      // 112: iload 3
      // 113: ifeq 130
      // 116: ifeq 133
      // 119: goto 120
      // 11c: invokestatic a1s.a (Loov;)Loov;
      // 11f: athrow
      // 120: fload 4
      // 122: ldc 1.5
      // 124: nop
      // 125: fmul
      // 126: invokestatic fe6.tpk (F)I
      // 129: goto 130
      // 12c: invokestatic a1s.a (Loov;)Loov;
      // 12f: athrow
      // 130: goto 134
      // 133: bipush 0
      // 134: ireturn
   }

   @Override
   public String d8j() {
      long var1 = a ^ 86404047679656L;
      return b<"m">(23438, 8610884206170403236L ^ var1) + ufh[this.t_s];
   }

   @Override
   public boolean yhx(vef param1) {
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
      // 05: instanceof a1s
      // 08: iload 2
      // 09: ifeq 78
      // 0c: ifeq 73
      // 0f: goto 16
      // 12: invokestatic a1s.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast a1s
      // 1a: astore 3
      // 1b: aload 3
      // 1c: getfield a1s.t_s I
      // 1f: aload 0
      // 20: getfield a1s.t_s I
      // 23: iload 2
      // 24: ifeq 49
      // 27: if_icmpne 39
      // 2a: goto 31
      // 2d: invokestatic a1s.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 0
      // 32: goto 72
      // 35: invokestatic a1s.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield a1s.t_s I
      // 3d: iload 2
      // 3e: ifeq 6e
      // 41: bipush 2
      // 42: goto 49
      // 45: invokestatic a1s.a (Loov;)Loov;
      // 48: athrow
      // 49: if_icmpeq 66
      // 4c: aload 3
      // 4d: getfield a1s.t_s I
      // 50: iload 2
      // 51: ifeq 6e
      // 54: goto 5b
      // 57: invokestatic a1s.a (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 2
      // 5c: if_icmpne 71
      // 5f: goto 66
      // 62: invokestatic a1s.a (Loov;)Loov;
      // 65: athrow
      // 66: bipush 1
      // 67: goto 6e
      // 6a: invokestatic a1s.a (Loov;)Loov;
      // 6d: athrow
      // 6e: goto 72
      // 71: bipush 0
      // 72: ireturn
      // 73: aload 0
      // 74: aload 1
      // 75: invokespecial vef.yhx (Lvef;)Z
      // 78: ireturn
   }

   public static int vrg(EntityLivingBase var0, int var1) {
      int var2 = OpaquePredicate.c();
      int var3 = hc0.gld(vef.qt1.bbf, var0.n7a());

      try {
         if (var2 != 0) {
            return var3;
         }

         if (var3 <= 0) {
            return var1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var1 -= fe6.tpk((float)var1 * (float)var3 * 0.15F);
      return var1;
   }

   public static double dpu(EntityLivingBase var0, double var1) {
      int var3 = hc0.gld(vef.dru.bbf, var0.n7a());
      if (var3 > 0) {
         var1 -= (double)fe6.jqf(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4958205672242201047L, -1061251985779731444L, MethodHandles.lookup().lookupClass()).a(165760353836366L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 37173382239403L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "\u001b\t5GÖT\u009d\u0097/ÍÄ-\u008d\u0097Þß\u0097è\u0016\u009dì\u0092mµZ¼jÀÝÍy\u001b\u0018/\u008anÿ<\u0004=W\u009c\"ä*Ú\u009a}ºÁ\u001b\u008flt!\u008c#\u0010\u0087ô®<u\u0099d±\u00193©\u0090¬\u0015ê'\u0010:\bÎé\u001fQA8è¦KU\u00814\u00902";
      int var6 = "\u001b\t5GÖT\u009d\u0097/ÍÄ-\u008d\u0097Þß\u0097è\u0016\u009dì\u0092mµZ¼jÀÝÍy\u001b\u0018/\u008anÿ<\u0004=W\u009c\"ä*Ú\u009a}ºÁ\u001b\u008flt!\u008c#\u0010\u0087ô®<u\u0099d±\u00193©\u0090¬\u0015ê'\u0010:\bÎé\u001fQA8è¦KU\u00814\u00902"
         .length();
      char var3 = ' ';
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
                     g = new String[6];
                     ufh = new String[]{
                        b<"m">(18937, 5635454654837393361L ^ var9),
                        b<"m">(16335, 2229048587169821153L ^ var9),
                        b<"m">(5516, 1325772299794832291L ^ var9),
                        b<"m">(21184, 1171592404609047788L ^ var9),
                        b<"m">(14754, 8659061327290693519L ^ var9)
                     };
                     jou = new int[]{1, 10, 5, 5, 3};
                     xrt = new int[]{11, 8, 6, 8, 6};
                     c4m = new int[]{20, 12, 10, 12, 15};
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

                  var4 = "\u001eï\u0095¹\u0007Þ,Õ\u0000C.\u0004\u0001°½YüÈ¦Ñ¹\u0094\u0085ã#\u0017àòòí\u009dËÔ\u009aÔêaÃ¼\u00ad\u0010ó¢.¢ýì\u009f¹<%\u0019s\u009b\\JY";
                  var6 = "\u001eï\u0095¹\u0007Þ,Õ\u0000C.\u0004\u0001°½YüÈ¦Ñ¹\u0094\u0085ã#\u0017àòòí\u009dËÔ\u009aÔêaÃ¼\u00ad\u0010ó¢.¢ýì\u009f¹<%\u0019s\u009b\\JY"
                     .length();
                  var3 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2778;
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
            throw new RuntimeException("a1s", var10);
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
         throw new RuntimeException("a1s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
