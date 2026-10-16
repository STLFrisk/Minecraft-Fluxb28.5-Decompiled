import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rh2 extends rrw implements jrp {
   public static final zb_ twm;

   public rh2() {
      super(p3y.wui);
      this.y8l(this._8_.c32().zvi(twm, rh2$j7i.w_6));
      float var1 = 0.4F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   @Override
   public int ldy() {
      return vfg.vkm(0.5, 1.0);
   }

   @Override
   public boolean _h0(OpaquePredicate var1, mew var2, zfz var3) {
      return this.ib4(var1.getBlockState(var2.eve()).r_y());
   }

   @Override
   public boolean ujd(OpaquePredicate var1, mew var2) {
      return true;
   }

   @Override
   public int ieb(zfz param1) {
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
      // 05: iload 2
      // 06: ifeq 24
      // 09: invokeinterface zfz.r_y ()Le0x; 1
      // 0e: aload 0
      // 0f: if_acmpeq 23
      // 12: goto 19
      // 15: invokestatic rh2.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokespecial rrw.ieb (Lzfz;)I
      // 1e: ireturn
      // 1f: invokestatic rh2.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: getstatic rh2.twm Lzb_;
      // 27: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2c: checkcast rh2$j7i
      // 2f: astore 3
      // 30: aload 3
      // 31: getstatic rh2$j7i.w_6 Lrh2$j7i;
      // 34: if_acmpne 41
      // 37: ldc 16777215
      // 39: nop
      // 3a: goto 48
      // 3d: invokestatic rh2.a (Loov;)Loov;
      // 40: athrow
      // 41: ldc2_w 0.5
      // 44: dconst_1
      // 45: invokestatic vfg.vkm (DD)I
      // 48: ireturn
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      return var1.getBiomeGenForCoords(var2).bib(var2);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      try {
         if (var2.nextInt(8) == 0) {
            return xbr.gj8;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return null;
   }

   @Override
   public int osi(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   @Override
   public void i4u(OpaquePredicate param1, ha9 param2, mew param3, zfz param4, pyk param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 6
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: ifne 7e
      // 0c: aload 2
      // 0d: invokevirtual ha9.b5z ()Lerg;
      // 10: iload 6
      // 12: ifeq 3d
      // 15: goto 1c
      // 18: invokestatic rh2.a (Loov;)Loov;
      // 1b: athrow
      // 1c: ifnull 7e
      // 1f: goto 26
      // 22: invokestatic rh2.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: iload 6
      // 29: ifeq 4e
      // 2c: goto 33
      // 2f: invokestatic rh2.a (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual ha9.b5z ()Lerg;
      // 36: goto 3d
      // 39: invokestatic rh2.a (Loov;)Loov;
      // 3c: athrow
      // 3d: invokevirtual erg.gn1 ()Lu7m;
      // 40: getstatic xbr.qsl Lguw;
      // 43: if_acmpne 7e
      // 46: aload 2
      // 47: goto 4e
      // 4a: invokestatic rh2.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic l9p.hf_ [L_ss;
      // 51: aload 0
      // 52: invokestatic e0x.mxb (Le0x;)I
      // 55: aaload
      // 56: invokevirtual ha9.aex (L_ss;)V
      // 59: aload 1
      // 5a: aload 3
      // 5b: new erg
      // 5e: dup
      // 5f: getstatic ox_._w6 Lrh2;
      // 62: bipush 1
      // 63: aload 4
      // 65: getstatic rh2.twm Lzb_;
      // 68: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 6d: checkcast rh2$j7i
      // 70: invokevirtual rh2$j7i.sqd ()I
      // 73: invokespecial erg.<init> (Le0x;II)V
      // 76: invokestatic rh2.ymu (Lt9d;Lmew;Lerg;)V
      // 79: iload 6
      // 7b: ifne 90
      // 7e: aload 0
      // 7f: aload 1
      // 80: aload 2
      // 81: aload 3
      // 82: aload 4
      // 84: aload 5
      // 86: invokespecial rrw.i4u (Lt9d;Lha9;Lmew;Lzfz;Lpyk;)V
      // 89: goto 90
      // 8c: invokestatic rh2.a (Loov;)Loov;
      // 8f: athrow
      // 90: return
   }

   @Override
   public int qu2(OpaquePredicate var1, mew var2) {
      zfz var3 = var1.getBlockState(var2);
      return var3.r_y().hvp(var3);
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      int var4 = OpaquePredicate.b();
      int var5 = 1;

      while (var5 < 3) {
         var3.add(new erg(var1, 1, var5));
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public boolean z3t(OpaquePredicate var1, mew var2, zfz var3, boolean var4) {
      try {
         if (var3.dil(twm) != rh2$j7i.w_6) {
            return true;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return false;
   }

   @Override
   public boolean y4n(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      return true;
   }

   @Override
   public void tu1(OpaquePredicate param1, Random param2, mew param3, zfz param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: getstatic ldj$vn8.h4k Lldj$vn8;
      // 08: astore 6
      // 0a: aload 4
      // 0c: getstatic rh2.twm Lzb_;
      // 0f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 14: getstatic rh2$j7i.hqk Lrh2$j7i;
      // 17: if_acmpne 1f
      // 1a: getstatic ldj$vn8.t7o Lldj$vn8;
      // 1d: astore 6
      // 1f: getstatic ox_.s4_ Lldj;
      // 22: aload 1
      // 23: aload 3
      // 24: iload 5
      // 26: ifne 42
      // 29: invokevirtual ldj.ctq (Lt9d;Lmew;)Z
      // 2c: ifeq 48
      // 2f: goto 36
      // 32: invokestatic rh2.a (Loov;)Loov;
      // 35: athrow
      // 36: getstatic ox_.s4_ Lldj;
      // 39: aload 1
      // 3a: aload 3
      // 3b: goto 42
      // 3e: invokestatic rh2.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 6
      // 44: bipush 2
      // 45: invokevirtual ldj.opz (Lt9d;Lmew;Lldj$vn8;I)V
      // 48: return
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(twm, rh2$j7i.xdi(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((rh2$j7i)var1.dil(twm)).sqd();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{twm});
   }

   @Override
   public e0x$hep jkr() {
      return e0x$hep.w9u;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1942878648529952520L, 2732632766617515876L, MethodHandles.lookup().lookupClass()).a(10609582819164L);
      // $VF: monitorexit
      long var4 = var10000 ^ 10313217727488L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("¹Ä³·\u0090úh\u0080".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      twm = zb_.pq4(var0, rh2$j7i.class);
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
