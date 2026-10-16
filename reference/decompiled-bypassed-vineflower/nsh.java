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

public class nsh extends e0x {
   public static final h76 efs;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public nsh() {
      super(p3y.jam);
      this.y8l(this._8_.c32().zvi(efs, false));
      this.i3l(uja.yj_);
   }

   @Override
   public void tfc(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokespecial e0x.tfc (Lt9d;Lmew;Lzfz;)V
      // 0c: aload 1
      // 0d: aload 2
      // 0e: invokevirtual t9d.gxo (Lmew;)Z
      // 11: iload 4
      // 13: ifne 3f
      // 16: ifeq 40
      // 19: goto 20
      // 1c: invokestatic nsh.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: getstatic nsh.efs Lh76;
      // 27: bipush 1
      // 28: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 30: invokevirtual nsh.bf0 (Lt9d;Lmew;Lzfz;)V
      // 33: aload 1
      // 34: aload 2
      // 35: invokevirtual t9d.i6x (Lmew;)Z
      // 38: goto 3f
      // 3b: invokestatic nsh.a (Loov;)Loov;
      // 3e: athrow
      // 3f: pop
      // 40: return
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual t9d.gxo (Lmew;)Z
      // 0a: iload 5
      // 0c: ifne 38
      // 0f: ifeq 39
      // 12: goto 19
      // 15: invokestatic nsh.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: aload 2
      // 1c: aload 3
      // 1d: getstatic nsh.efs Lh76;
      // 20: bipush 1
      // 21: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 24: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 29: invokevirtual nsh.bf0 (Lt9d;Lmew;Lzfz;)V
      // 2c: aload 1
      // 2d: aload 2
      // 2e: invokevirtual t9d.i6x (Lmew;)Z
      // 31: goto 38
      // 34: invokestatic nsh.a (Loov;)Loov;
      // 37: athrow
      // 38: pop
      // 39: return
   }

   @Override
   public void a4c(t9d var1, mew var2, vu6 var3) {
      if (!var1.v0f) {
         pix var4 = new pix(var1, (double)((float)var2.getX() + 0.5F), (double)var2.getY(), (double)((float)var2.getZ() + 0.5F), var3.wbg());
         var4.j_a = var1.fsy.nextInt(var4.j_a / 4) + var4.j_a / 8;
         var1.xzq(var4);
      }
   }

   @Override
   public void bf0(t9d var1, mew var2, zfz var3) {
      this.tbo(var1, var2, var3, (g_3)null);
   }

   public void tbo(t9d param1, mew param2, zfz param3, g_3 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nsh.b J
      // 03: ldc2_w 77099236520559
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic t9d.b ()I
      // 0c: istore 7
      // 0e: aload 1
      // 0f: getfield t9d.v0f Z
      // 12: iload 7
      // 14: ifeq 37
      // 17: ifne 7d
      // 1a: goto 21
      // 1d: invokestatic nsh.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: getstatic nsh.efs Lh76;
      // 25: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2a: checkcast java/lang/Boolean
      // 2d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 30: goto 37
      // 33: invokestatic nsh.a (Loov;)Loov;
      // 36: athrow
      // 37: ifeq 7d
      // 3a: new pix
      // 3d: dup
      // 3e: aload 1
      // 3f: aload 2
      // 40: invokevirtual mew.getX ()I
      // 43: i2f
      // 44: ldc 0.5
      // 46: nop
      // 47: fadd
      // 48: f2d
      // 49: aload 2
      // 4a: invokevirtual mew.getY ()I
      // 4d: i2d
      // 4e: aload 2
      // 4f: invokevirtual mew.getZ ()I
      // 52: i2f
      // 53: ldc 0.5
      // 55: nop
      // 56: fadd
      // 57: f2d
      // 58: aload 4
      // 5a: invokespecial pix.<init> (Lt9d;DDDLg_3;)V
      // 5d: astore 8
      // 5f: aload 1
      // 60: aload 8
      // 62: invokevirtual t9d.xzq (Li2h;)Z
      // 65: pop
      // 66: aload 1
      // 67: aload 8
      // 69: sipush 4266
      // 6c: ldc2_w 6364257454419506834
      // 6f: lload 5
      // 71: lxor
      // 72: invokedynamic t (IJ)Ljava/lang/String; bsm=nsh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: nop
      // 78: fconst_1
      // 79: fconst_1
      // 7a: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 7d: return
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 4
      // 07: invokevirtual ha9.b5z ()Lerg;
      // 0a: iload 9
      // 0c: ifeq 25
      // 0f: ifnull db
      // 12: goto 19
      // 15: invokestatic nsh.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 4
      // 1b: invokevirtual ha9.b5z ()Lerg;
      // 1e: goto 25
      // 21: invokestatic nsh.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual erg.gn1 ()Lu7m;
      // 28: astore 10
      // 2a: aload 10
      // 2c: getstatic xbr.za8 Lu7m;
      // 2f: iload 9
      // 31: ifeq 8c
      // 34: if_acmpeq 59
      // 37: goto 3e
      // 3a: invokestatic nsh.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 10
      // 40: getstatic xbr.td3 Lu7m;
      // 43: iload 9
      // 45: ifeq 8c
      // 48: goto 4f
      // 4b: invokestatic nsh.a (Loov;)Loov;
      // 4e: athrow
      // 4f: if_acmpne db
      // 52: goto 59
      // 55: invokestatic nsh.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: aload 1
      // 5b: aload 2
      // 5c: aload 3
      // 5d: getstatic nsh.efs Lh76;
      // 60: bipush 1
      // 61: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 64: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 69: aload 4
      // 6b: invokevirtual nsh.tbo (Lt9d;Lmew;Lzfz;Lg_3;)V
      // 6e: aload 1
      // 6f: aload 2
      // 70: invokevirtual t9d.i6x (Lmew;)Z
      // 73: iload 9
      // 75: ifeq b5
      // 78: goto 7f
      // 7b: invokestatic nsh.a (Loov;)Loov;
      // 7e: athrow
      // 7f: pop
      // 80: aload 10
      // 82: getstatic xbr.za8 Lu7m;
      // 85: goto 8c
      // 88: invokestatic nsh.a (Loov;)Loov;
      // 8b: athrow
      // 8c: if_acmpne a6
      // 8f: aload 4
      // 91: invokevirtual ha9.b5z ()Lerg;
      // 94: bipush 1
      // 95: aload 4
      // 97: invokevirtual erg.ybw (ILg_3;)V
      // 9a: iload 9
      // 9c: ifne d9
      // 9f: goto a6
      // a2: invokestatic nsh.a (Loov;)Loov;
      // a5: athrow
      // a6: aload 4
      // a8: getfield ha9.lls Lpj2;
      // ab: getfield pj2.g40 Z
      // ae: goto b5
      // b1: invokestatic nsh.a (Loov;)Loov;
      // b4: athrow
      // b5: iload 9
      // b7: ifeq da
      // ba: ifne d9
      // bd: goto c4
      // c0: invokestatic nsh.a (Loov;)Loov;
      // c3: athrow
      // c4: aload 4
      // c6: invokevirtual ha9.b5z ()Lerg;
      // c9: dup
      // ca: getfield erg.qd2 I
      // cd: bipush 1
      // ce: isub
      // cf: putfield erg.qd2 I
      // d2: goto d9
      // d5: invokestatic nsh.a (Loov;)Loov;
      // d8: athrow
      // d9: bipush 1
      // da: ireturn
      // db: aload 0
      // dc: aload 1
      // dd: aload 2
      // de: aload 3
      // df: aload 4
      // e1: aload 5
      // e3: fload 6
      // e5: fload 7
      // e7: fload 8
      // e9: invokespecial e0x.cl2 (Lt9d;Lmew;Lzfz;Lha9;Lvt2;FFF)Z
      // ec: ireturn
   }

   @Override
   public void n9e(t9d param1, mew param2, zfz param3, i2h param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 5
      // 0b: ifeq 30
      // 0e: ifne 90
      // 11: goto 18
      // 14: invokestatic nsh.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 4
      // 1a: iload 5
      // 1c: ifeq 35
      // 1f: goto 26
      // 22: invokestatic nsh.a (Loov;)Loov;
      // 25: athrow
      // 26: instanceof hy9
      // 29: goto 30
      // 2c: invokestatic nsh.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifeq 90
      // 33: aload 4
      // 35: checkcast hy9
      // 38: astore 6
      // 3a: aload 6
      // 3c: invokevirtual hy9.agj ()Z
      // 3f: ifeq 90
      // 42: aload 0
      // 43: aload 1
      // 44: aload 2
      // 45: aload 1
      // 46: aload 2
      // 47: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4a: getstatic nsh.efs Lh76;
      // 4d: bipush 1
      // 4e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 51: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 56: aload 6
      // 58: getfield hy9.k_d Li2h;
      // 5b: iload 5
      // 5d: ifeq 80
      // 60: goto 67
      // 63: invokestatic nsh.a (Loov;)Loov;
      // 66: athrow
      // 67: instanceof g_3
      // 6a: ifeq 86
      // 6d: goto 74
      // 70: invokestatic nsh.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 6
      // 76: getfield hy9.k_d Li2h;
      // 79: goto 80
      // 7c: invokestatic nsh.a (Loov;)Loov;
      // 7f: athrow
      // 80: checkcast g_3
      // 83: goto 87
      // 86: aconst_null
      // 87: invokevirtual nsh.tbo (Lt9d;Lmew;Lzfz;Lg_3;)V
      // 8a: aload 1
      // 8b: aload 2
      // 8c: invokevirtual t9d.i6x (Lmew;)Z
      // 8f: pop
      // 90: return
   }

   @Override
   public boolean xse(vu6 var1) {
      return false;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i();
         var10001 = efs;
         int var10002 = var1 & 1;
         if (var2 == 0) {
            return var10000.zvi(efs, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(efs, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = t9d.c();

      try {
         byte var10000 = (Boolean)var1.dil(efs);
         if (var2 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{efs});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1440931055191783146L, 3847209476112612456L, MethodHandles.lookup().lookupClass()).a(136965453636248L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 17973237671552L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "s)Îw²I|gIÈ\u0017Úby\u0087\u000fÅ¦é×ê\u0003:Ïùb6W\u0016aõÏ\u0010À\u0097\u0002\u007f\u008d\u000e\r»\u001cÞ*w¿Áµ1";
      int var6 = "s)Îw²I|gIÈ\u0017Úby\u0087\u000fÅ¦é×ê\u0003:Ïùb6W\u0016aõÏ\u0010À\u0097\u0002\u007f\u008d\u000e\r»\u001cÞ*w¿Áµ1".length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[2];
            efs = h76.d_1(b<"t">(12946, 4477406116816273476L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1152;
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
            throw new RuntimeException("nsh", var10);
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
         throw new RuntimeException("nsh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
