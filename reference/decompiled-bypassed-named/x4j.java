import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x4j extends e0x {
   public static final zb_ lke;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public x4j() {
      super(p3y.s8e);
      this.y8l(this._8_.c32().zvi(lke, x4j$y3_.i43));
      this.q6h(0.0F);
      this.i3l(uja.qqf);
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   public static boolean xvf(zfz param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokeinterface zfz.r_y ()Le0x; 1
      // 0a: astore 2
      // 0b: aload 0
      // 0c: getstatic ox_.pu8 Le0x;
      // 0f: invokevirtual e0x.l4i ()Lzfz;
      // 12: getstatic jcc.m9s Lzb_;
      // 15: getstatic jcc$whg.aow Ljcc$whg;
      // 18: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1d: if_acmpeq 47
      // 20: aload 2
      // 21: getstatic ox_.a3_ Le0x;
      // 24: iload 1
      // 25: ifeq 44
      // 28: goto 2f
      // 2b: invokestatic x4j.a (Loov;)Loov;
      // 2e: athrow
      // 2f: if_acmpeq 47
      // 32: goto 39
      // 35: invokestatic x4j.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 2
      // 3a: getstatic ox_.ow_ Le0x;
      // 3d: goto 44
      // 40: invokestatic x4j.a (Loov;)Loov;
      // 43: athrow
      // 44: if_acmpne 4f
      // 47: bipush 1
      // 48: goto 50
      // 4b: invokestatic x4j.a (Loov;)Loov;
      // 4e: athrow
      // 4f: bipush 0
      // 50: ireturn
   }

   @Override
   public erg b4a(zfz var1) {
      try {
         switch (x4j$1.ou1[((x4j$y3_)var1.dil(lke)).ordinal()]) {
            case 1:
               return new erg(ox_.a3_);
            case 2:
               return new erg(ox_.ow_);
            case 3:
               return new erg(ox_.ow_, 1, kuo$yh_.ljm.yi5());
            case 4:
               return new erg(ox_.ow_, 1, kuo$yh_.hk4.yi5());
            case 5:
               return new erg(ox_.ow_, 1, kuo$yh_.ud9.yi5());
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return new erg(ox_.pu8);
   }

   @Override
   public void ix7(OpaquePredicate param1, mew param2, zfz param3, float param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic x4j.b J
      // 03: ldc2_w 48989299143979
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 8
      // 0e: aload 1
      // 0f: getfield OpaquePredicate.v0f Z
      // 12: iload 8
      // 14: ifne 3e
      // 17: ifne 75
      // 1a: goto 21
      // 1d: invokestatic x4j.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: invokevirtual OpaquePredicate.eir ()Lef9;
      // 25: sipush 12970
      // 28: ldc2_w 6897099854610420580
      // 2b: lload 6
      // 2d: lxor
      // 2e: invokedynamic q (IJ)Ljava/lang/String; bsm=x4j.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: nop
      // 34: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 37: goto 3e
      // 3a: invokestatic x4j.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ifeq 75
      // 41: new q1h
      // 44: dup
      // 45: aload 1
      // 46: invokespecial q1h.<init> (Lt9d;)V
      // 49: astore 9
      // 4b: aload 9
      // 4d: aload 2
      // 4e: invokevirtual mew.getX ()I
      // 51: i2d
      // 52: ldc2_w 0.5
      // 55: dadd
      // 56: aload 2
      // 57: invokevirtual mew.getY ()I
      // 5a: i2d
      // 5b: aload 2
      // 5c: invokevirtual mew.getZ ()I
      // 5f: i2d
      // 60: ldc2_w 0.5
      // 63: dadd
      // 64: fconst_0
      // 65: fconst_0
      // 66: invokevirtual q1h.x24 (DDDFF)V
      // 69: aload 1
      // 6a: aload 9
      // 6c: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 6f: pop
      // 70: aload 9
      // 72: invokevirtual q1h.guo ()V
      // 75: return
   }

   @Override
   public int qu2(OpaquePredicate var1, mew var2) {
      zfz var3 = var1.getBlockState(var2);
      return var3.r_y().hvp(var3);
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      x4j$y3_[] var5 = x4j$y3_.values();
      int var10000 = OpaquePredicate.b();
      int var6 = var5.length;
      int var7 = 0;
      int var4 = var10000;

      while (var7 < var6) {
         x4j$y3_ var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.x_e()));
         var7++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(lke, x4j$y3_.yw_(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((x4j$y3_)var1.dil(lke)).x_e();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{lke});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-878416615264688457L, -7132239393957025037L, MethodHandles.lookup().lookupClass()).a(96737393702582L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 96357311095980L;
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
      String var4 = "\"»Ê¥Äß\u0088·\u009bg\u0080;[ûm\u000b×Z)7·\u0014°ðø\u008e\u000fá*fN3\u0010\u0004\u0086\u0018CÉI:\u0018.©¶ò\u009a5Ó¢";
      int var6 = "\"»Ê¥Äß\u0088·\u009bg\u0080;[ûm\u000b×Z)7·\u0014°ðø\u008e\u000fá*fN3\u0010\u0004\u0086\u0018CÉI:\u0018.©¶ò\u009a5Ó¢".length();
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
            lke = zb_.pq4(b<"q">(20335, 2889701457214930727L ^ var9), x4j$y3_.class);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27142;
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
            throw new RuntimeException("x4j", var10);
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
         throw new RuntimeException("x4j" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
