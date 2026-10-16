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
import net.minecraft.tileentity.TileEntityDaylightDetector;

public class xq5 extends rw8 {
   public static final _ku qz6;
   private final boolean qjg;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public xq5(boolean var1) {
      long var2 = b ^ 57454633676633L;
      super(p3y.fdu);
      this.qjg = var1;
      this.y8l(this._8_.c32().zvi(qz6, 0));
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
      this.i3l(uja.yj_);
      this.q6h(0.2F);
      this.t4k(l18);
      this.h2y(b<"s">(2393, 732859305190846685L ^ var2));
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
   }

   @Override
   public int gpi(m5n var1, mew var2, zfz var3, vt2 var4) {
      return (Integer)var3.dil(qz6);
   }

   public void tde(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifeq 21
      // 09: getfield t9d.vzz Lupn;
      // 0c: invokevirtual upn.qyc ()Z
      // 0f: ifne da
      // 12: goto 19
      // 15: invokestatic xq5.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: goto 21
      // 1d: invokestatic xq5.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 2
      // 22: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 25: astore 4
      // 27: aload 1
      // 28: getstatic qe5.sf9 Lqe5;
      // 2b: aload 2
      // 2c: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 2f: aload 1
      // 30: invokevirtual t9d.e76 ()I
      // 33: isub
      // 34: istore 5
      // 36: aload 1
      // 37: fconst_1
      // 38: invokevirtual t9d.v6p (F)F
      // 3b: fstore 6
      // 3d: fload 6
      // 3f: iload 3
      // 40: ifeq 5b
      // 43: ldc 3.1415927
      // 45: nop
      // 46: fcmpg
      // 47: ifge 59
      // 4a: goto 51
      // 4d: invokestatic xq5.a (Loov;)Loov;
      // 50: athrow
      // 51: fconst_0
      // 52: goto 5c
      // 55: invokestatic xq5.a (Loov;)Loov;
      // 58: athrow
      // 59: ldc 6.2831855
      // 5b: nop
      // 5c: fstore 7
      // 5e: fload 6
      // 60: fload 7
      // 62: fload 6
      // 64: fsub
      // 65: ldc 0.2
      // 67: nop
      // 68: fmul
      // 69: fadd
      // 6a: fstore 6
      // 6c: iload 5
      // 6e: i2f
      // 6f: fload 6
      // 71: invokestatic fe6.ssk (F)F
      // 74: fmul
      // 75: invokestatic java/lang/Math.round (F)I
      // 78: istore 5
      // 7a: iload 5
      // 7c: bipush 0
      // 7d: bipush 15
      // 7f: invokestatic fe6.faa (III)I
      // 82: istore 5
      // 84: aload 0
      // 85: getfield xq5.qjg Z
      // 88: iload 3
      // 89: ifeq ad
      // 8c: ifeq 9d
      // 8f: goto 96
      // 92: invokestatic xq5.a (Loov;)Loov;
      // 95: athrow
      // 96: bipush 15
      // 98: iload 5
      // 9a: isub
      // 9b: istore 5
      // 9d: aload 4
      // 9f: getstatic xq5.qz6 L_ku;
      // a2: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // a7: checkcast java/lang/Integer
      // aa: invokevirtual java/lang/Integer.intValue ()I
      // ad: iload 3
      // ae: ifeq d9
      // b1: iload 5
      // b3: if_icmpeq da
      // b6: goto bd
      // b9: invokestatic xq5.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 1
      // be: aload 2
      // bf: aload 4
      // c1: getstatic xq5.qz6 L_ku;
      // c4: iload 5
      // c6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // ce: bipush 3
      // cf: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // d2: goto d9
      // d5: invokestatic xq5.a (Loov;)Loov;
      // d8: athrow
      // d9: pop
      // da: return
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 4
      // 07: invokevirtual ha9.gt3 ()Z
      // 0a: iload 9
      // 0c: ifne be
      // 0f: ifeq ad
      // 12: goto 19
      // 15: invokestatic xq5.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: getfield t9d.v0f Z
      // 1d: iload 9
      // 1f: ifne 3d
      // 22: goto 29
      // 25: invokestatic xq5.a (Loov;)Loov;
      // 28: athrow
      // 29: ifeq 39
      // 2c: goto 33
      // 2f: invokestatic xq5.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: ireturn
      // 35: invokestatic xq5.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield xq5.qjg Z
      // 3d: iload 9
      // 3f: ifne a2
      // 42: ifeq 7e
      // 45: goto 4c
      // 48: invokestatic xq5.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 1
      // 4d: aload 2
      // 4e: getstatic ox_.n_u Lxq5;
      // 51: invokevirtual xq5.l4i ()Lzfz;
      // 54: getstatic xq5.qz6 L_ku;
      // 57: aload 3
      // 58: getstatic xq5.qz6 L_ku;
      // 5b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 60: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 65: bipush 4
      // 66: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 69: pop
      // 6a: getstatic ox_.n_u Lxq5;
      // 6d: aload 1
      // 6e: aload 2
      // 6f: invokevirtual xq5.tde (Lt9d;Lmew;)V
      // 72: iload 9
      // 74: ifeq ab
      // 77: goto 7e
      // 7a: invokestatic xq5.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 1
      // 7f: aload 2
      // 80: getstatic ox_.hgb Lxq5;
      // 83: invokevirtual xq5.l4i ()Lzfz;
      // 86: getstatic xq5.qz6 L_ku;
      // 89: aload 3
      // 8a: getstatic xq5.qz6 L_ku;
      // 8d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 92: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 97: bipush 4
      // 98: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 9b: goto a2
      // 9e: invokestatic xq5.a (Loov;)Loov;
      // a1: athrow
      // a2: pop
      // a3: getstatic ox_.hgb Lxq5;
      // a6: aload 1
      // a7: aload 2
      // a8: invokevirtual xq5.tde (Lt9d;Lmew;)V
      // ab: bipush 1
      // ac: ireturn
      // ad: aload 0
      // ae: aload 1
      // af: aload 2
      // b0: aload 3
      // b1: aload 4
      // b3: aload 5
      // b5: fload 6
      // b7: fload 7
      // b9: fload 8
      // bb: invokespecial rw8.cl2 (Lt9d;Lmew;Lzfz;Lha9;Lvt2;FFF)Z
      // be: ireturn
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.n_u);
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return u7m.gfm(ox_.n_u);
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public boolean scl() {
      return true;
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityDaylightDetector();
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(qz6, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(qz6);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{qz6});
   }

   @Override
   public void m1q(u7m param1, uja param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifeq 20
      // 0b: getfield xq5.qjg Z
      // 0e: ifne 26
      // 11: goto 18
      // 14: invokestatic xq5.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic xq5.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: aload 3
      // 23: invokespecial rw8.m1q (Lu7m;Luja;Ljava/util/List;)V
      // 26: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2486577697131033537L, -6357799957558806144L, MethodHandles.lookup().lookupClass()).a(215068948491668L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 82914981677125L;
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
      String var4 = "²D;!xÚ\u0001\bß+~7\u0019Õ\u007f¸(,¼çû®C-\u0087 ÿórÑf Í\u009fvMl\\\u00adüg\u000f\u0092hàÃtdxÓÇÕïª{\fÊ";
      int var6 = "²D;!xÚ\u0001\bß+~7\u0019Õ\u007f¸(,¼çû®C-\u0087 ÿórÑf Í\u009fvMl\\\u00adüg\u000f\u0092hàÃtdxÓÇÕïª{\fÊ".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[2];
            qz6 = _ku.wgl(b<"s">(29727, 9191471336756636294L ^ var9), 0, 15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8201;
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
            throw new RuntimeException("xq5", var10);
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
         throw new RuntimeException("xq5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
