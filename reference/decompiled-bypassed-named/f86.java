import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f86 extends e0x {
   public static final h76 kqk;
   public static final h76 ncy;
   public static final h76 aov;
   public static final h76 z42;
   public static final h76 j5c;
   public static final zb_ fd3;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public f86(e0x var1) {
      super(var1.kgd);
      this.y8l(this._8_.c32().zvi(kqk, false).zvi(ncy, false).zvi(aov, false).zvi(z42, false).zvi(j5c, false).zvi(fd3, f86$ou6.am7));
      this.q6h(var1.knk);
      this.dj8(var1.iep / 3.0F);
      this.t4k(var1.zu6);
      this.i3l(uja.mqu);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 66335946528063L;
      return orr.zgh(this.abc() + "." + f86$ou6.am7.tvf() + b<"p">(8947, 2454357436860028106L ^ var1));
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean iwf(m5n var1, mew var2) {
      return false;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 2
      // 003: invokevirtual mew.idu ()Lmew;
      // 006: invokevirtual f86.b5x (Lm5n;Lmew;)Z
      // 009: istore 4
      // 00b: invokestatic OpaquePredicate.c ()I
      // 00e: aload 0
      // 00f: aload 1
      // 010: aload 2
      // 011: invokevirtual mew.z6x ()Lmew;
      // 014: invokevirtual f86.b5x (Lm5n;Lmew;)Z
      // 017: istore 5
      // 019: istore 3
      // 01a: aload 0
      // 01b: aload 1
      // 01c: aload 2
      // 01d: invokevirtual mew.y8e ()Lmew;
      // 020: invokevirtual f86.b5x (Lm5n;Lmew;)Z
      // 023: istore 6
      // 025: aload 0
      // 026: aload 1
      // 027: aload 2
      // 028: invokevirtual mew.o_8 ()Lmew;
      // 02b: invokevirtual f86.b5x (Lm5n;Lmew;)Z
      // 02e: istore 7
      // 030: ldc 0.25
      // 032: nop
      // 033: fstore 8
      // 035: ldc 0.75
      // 037: nop
      // 038: fstore 9
      // 03a: ldc 0.25
      // 03c: nop
      // 03d: fstore 10
      // 03f: ldc 0.75
      // 041: nop
      // 042: fstore 11
      // 044: fconst_1
      // 045: fstore 12
      // 047: iload 4
      // 049: iload 3
      // 04a: ifne 05c
      // 04d: ifeq 05a
      // 050: goto 057
      // 053: invokestatic f86.a (Loov;)Loov;
      // 056: athrow
      // 057: fconst_0
      // 058: fstore 10
      // 05a: iload 5
      // 05c: iload 3
      // 05d: ifne 06f
      // 060: ifeq 06d
      // 063: goto 06a
      // 066: invokestatic f86.a (Loov;)Loov;
      // 069: athrow
      // 06a: fconst_1
      // 06b: fstore 11
      // 06d: iload 6
      // 06f: iload 3
      // 070: ifne 082
      // 073: ifeq 080
      // 076: goto 07d
      // 079: invokestatic f86.a (Loov;)Loov;
      // 07c: athrow
      // 07d: fconst_0
      // 07e: fstore 8
      // 080: iload 7
      // 082: iload 3
      // 083: ifne 095
      // 086: ifeq 093
      // 089: goto 090
      // 08c: invokestatic f86.a (Loov;)Loov;
      // 08f: athrow
      // 090: fconst_1
      // 091: fstore 9
      // 093: iload 4
      // 095: iload 3
      // 096: ifne 104
      // 099: ifeq 0fb
      // 09c: goto 0a3
      // 09f: invokestatic f86.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: iload 5
      // 0a5: iload 3
      // 0a6: ifne 104
      // 0a9: goto 0b0
      // 0ac: invokestatic f86.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: ifeq 0fb
      // 0b3: goto 0ba
      // 0b6: invokestatic f86.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: iload 6
      // 0bc: iload 3
      // 0bd: ifne 104
      // 0c0: goto 0c7
      // 0c3: invokestatic f86.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: ifne 0fb
      // 0ca: goto 0d1
      // 0cd: invokestatic f86.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 7
      // 0d3: iload 3
      // 0d4: ifne 104
      // 0d7: goto 0de
      // 0da: invokestatic f86.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: ifne 0fb
      // 0e1: goto 0e8
      // 0e4: invokestatic f86.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: ldc 0.8125
      // 0ea: nop
      // 0eb: fstore 12
      // 0ed: ldc 0.3125
      // 0ef: nop
      // 0f0: fstore 8
      // 0f2: ldc 0.6875
      // 0f4: nop
      // 0f5: fstore 9
      // 0f7: iload 3
      // 0f8: ifeq 146
      // 0fb: iload 4
      // 0fd: goto 104
      // 100: invokestatic f86.a (Loov;)Loov;
      // 103: athrow
      // 104: iload 3
      // 105: ifne 114
      // 108: ifne 146
      // 10b: goto 112
      // 10e: invokestatic f86.a (Loov;)Loov;
      // 111: athrow
      // 112: iload 5
      // 114: iload 3
      // 115: ifne 124
      // 118: ifne 146
      // 11b: goto 122
      // 11e: invokestatic f86.a (Loov;)Loov;
      // 121: athrow
      // 122: iload 6
      // 124: iload 3
      // 125: ifne 134
      // 128: ifeq 146
      // 12b: goto 132
      // 12e: invokestatic f86.a (Loov;)Loov;
      // 131: athrow
      // 132: iload 7
      // 134: ifeq 146
      // 137: ldc 0.8125
      // 139: nop
      // 13a: fstore 12
      // 13c: ldc 0.3125
      // 13e: nop
      // 13f: fstore 10
      // 141: ldc 0.6875
      // 143: nop
      // 144: fstore 11
      // 146: aload 0
      // 147: fload 8
      // 149: fconst_0
      // 14a: fload 10
      // 14c: fload 9
      // 14e: fload 12
      // 150: fload 11
      // 152: invokevirtual f86.xl4 (FFFFFF)V
      // 155: return
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      this.c7i(var1, var2);
      this.lpg = 1.5;
      return super.m__(var1, var2, var3);
   }

   public boolean b5x(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: invokeinterface zfz.r_y ()Le0x; 1
      // 10: astore 4
      // 12: aload 4
      // 14: iload 3
      // 15: ifeq 2f
      // 18: getstatic ox_.c28 Le0x;
      // 1b: if_acmpne 2d
      // 1e: goto 25
      // 21: invokestatic f86.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 0
      // 26: goto b2
      // 29: invokestatic f86.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 4
      // 2f: iload 3
      // 30: ifeq 47
      // 33: aload 0
      // 34: if_acmpeq b1
      // 37: goto 3e
      // 3a: invokestatic f86.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 4
      // 40: goto 47
      // 43: invokestatic f86.a (Loov;)Loov;
      // 46: athrow
      // 47: instanceof u98
      // 4a: iload 3
      // 4b: ifeq 67
      // 4e: ifne b1
      // 51: goto 58
      // 54: invokestatic f86.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 4
      // 5a: getfield e0x.kgd Lp3y;
      // 5d: invokevirtual p3y.u4h ()Z
      // 60: goto 67
      // 63: invokestatic f86.a (Loov;)Loov;
      // 66: athrow
      // 67: iload 3
      // 68: ifeq ae
      // 6b: ifeq ad
      // 6e: goto 75
      // 71: invokestatic f86.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 4
      // 77: invokevirtual e0x.gck ()Z
      // 7a: iload 3
      // 7b: ifeq ae
      // 7e: goto 85
      // 81: invokestatic f86.a (Loov;)Loov;
      // 84: athrow
      // 85: ifeq ad
      // 88: goto 8f
      // 8b: invokestatic f86.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 4
      // 91: getfield e0x.kgd Lp3y;
      // 94: getstatic p3y.clf Lp3y;
      // 97: if_acmpeq a9
      // 9a: goto a1
      // 9d: invokestatic f86.a (Loov;)Loov;
      // a0: athrow
      // a1: bipush 1
      // a2: goto b2
      // a5: invokestatic f86.a (Loov;)Loov;
      // a8: athrow
      // a9: bipush 0
      // aa: goto b2
      // ad: bipush 0
      // ae: goto b2
      // b1: bipush 1
      // b2: ireturn
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      f86$ou6[] var5 = f86$ou6.values();
      int var6 = var5.length;
      int var10000 = OpaquePredicate.b();
      int var7 = 0;
      int var4 = var10000;

      while (var7 < var6) {
         f86$ou6 var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.irm()));
         var7++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public int crg(zfz var1) {
      return ((f86$ou6)var1.dil(fd3)).irm();
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      try {
         if (var3 == vt2.m3r) {
            return super.ron(var1, var2, var3);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return true;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(fd3, f86$ou6.yp3(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((f86$ou6)var1.dil(fd3)).irm();
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      int var4 = OpaquePredicate.b();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = var1;
         var10001 = kqk;
         boolean var10002 = var2.isAirBlock(var3.nuv());
         if (var4 == 0) {
            return var1.zvi(var10001, var10002)
               .zvi(ncy, this.b5x(var2, var3.idu()))
               .zvi(aov, this.b5x(var2, var3.o_8()))
               .zvi(z42, this.b5x(var2, var3.z6x()))
               .zvi(j5c, this.b5x(var2, var3.y8e()));
         }

         if (!var10002) {
            return var1.zvi(var10001, true)
               .zvi(ncy, this.b5x(var2, var3.idu()))
               .zvi(aov, this.b5x(var2, var3.o_8()))
               .zvi(z42, this.b5x(var2, var3.z6x()))
               .zvi(j5c, this.b5x(var2, var3.y8e()));
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return var10000.zvi(var10001, false)
         .zvi(ncy, this.b5x(var2, var3.idu()))
         .zvi(aov, this.b5x(var2, var3.o_8()))
         .zvi(z42, this.b5x(var2, var3.z6x()))
         .zvi(j5c, this.b5x(var2, var3.y8e()));
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{kqk, ncy, aov, j5c, z42, fd3});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9214206305656489484L, 8477042849662938051L, MethodHandles.lookup().lookupClass()).a(10242846425683L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 26991064580172L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "¯<²Û\b|H\u001e¦mD\u008d,\u0086V«\u0010\u0093²\u0004\u0094\u001eüqa\u0092¸Â_odXì\u0010Ø j\bXØ\u0003\u0015'ô¯\u0082véÿ\u009f\u0010\u000f\u009baÈø«ã¸¤á\u0086¶\\+*i\u0010Æ\u0096\u008eÜ,\u0084(r(Äv\u001ba\u0017¢ý";
      int var6 = "¯<²Û\b|H\u001e¦mD\u008d,\u0086V«\u0010\u0093²\u0004\u0094\u001eüqa\u0092¸Â_odXì\u0010Ø j\bXØ\u0003\u0015'ô¯\u0082véÿ\u009f\u0010\u000f\u009baÈø«ã¸¤á\u0086¶\\+*i\u0010Æ\u0096\u008eÜ,\u0084(r(Äv\u001ba\u0017¢ý"
         .length();
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
                     d = var7;
                     h = new String[7];
                     kqk = h76.d_1(b<"p">(13738, 1848909022782297825L ^ var9));
                     ncy = h76.d_1(b<"p">(7361, 903600805895094159L ^ var9));
                     aov = h76.d_1(b<"p">(17367, 1613644962605818011L ^ var9));
                     z42 = h76.d_1(b<"p">(14527, 3762117023141927926L ^ var9));
                     j5c = h76.d_1(b<"p">(30366, 1830182163870995923L ^ var9));
                     fd3 = zb_.pq4(b<"p">(29279, 1968543438094323984L ^ var9), f86$ou6.class);
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

                  var4 = "÷ÎKÅþpRªü\u001d\u00ad\u009a\u009aÀh@\u0010MrÍ#TÕ\u0092\u0002\u001eroK²\u0019´\u0017";
                  var6 = "÷ÎKÅþpRªü\u001d\u00ad\u009a\u009aÀh@\u0010MrÍ#TÕ\u0092\u0002\u001eroK²\u0019´\u0017".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19803;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("f86", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("f86" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
