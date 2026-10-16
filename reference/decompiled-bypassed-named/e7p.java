import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e7p extends e0x {
   public static final _ku sxl;

   public e7p() {
      super(p3y.zmv);
      this.y8l(this._8_.c32().zvi(sxl, 1));
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this._p_(true);
      this.i3l(uja.qqf);
      this.bf6();
   }

   @Override
   public boolean iwf(m5n param1, mew param2) {
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
      // 0b: getstatic e7p.sxl L_ku;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: checkcast java/lang/Integer
      // 16: invokevirtual java/lang/Integer.intValue ()I
      // 19: iload 3
      // 1a: ifeq 30
      // 1d: bipush 5
      // 1e: if_icmpge 33
      // 21: goto 28
      // 24: invokestatic e7p.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 1
      // 29: goto 30
      // 2c: invokestatic e7p.a (Loov;)Loov;
      // 2f: athrow
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      int var4 = (Integer)var3.dil(sxl) - 1;
      float var5 = 0.125F;
      return new nh4(
         (double)var2.getX() + this.d80,
         (double)var2.getY() + this.tcq,
         (double)var2.getZ() + this.iac,
         (double)var2.getX() + this.smy,
         (double)((float)var2.getY() + (float)var4 * var5),
         (double)var2.getZ() + this.nlu
      );
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public void bf6() {
      this.crh(0);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      zfz var3 = var1.getBlockState(var2);
      this.crh((Integer)var3.dil(sxl));
   }

   public void crh(int var1) {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, (float)var1 / 8.0F, 1.0F);
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: invokevirtual mew.eve ()Lmew;
      // 05: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 08: astore 4
      // 0a: invokestatic OpaquePredicate.b ()I
      // 0d: aload 4
      // 0f: invokeinterface zfz.r_y ()Le0x; 1
      // 14: astore 5
      // 16: istore 3
      // 17: aload 5
      // 19: getstatic ox_.f02 Le0x;
      // 1c: iload 3
      // 1d: ifeq 41
      // 20: if_acmpeq de
      // 23: goto 2a
      // 26: invokestatic e7p.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 5
      // 2c: iload 3
      // 2d: ifeq 46
      // 30: goto 37
      // 33: invokestatic e7p.a (Loov;)Loov;
      // 36: athrow
      // 37: getstatic ox_.tli Le0x;
      // 3a: goto 41
      // 3d: invokestatic e7p.a (Loov;)Loov;
      // 40: athrow
      // 41: if_acmpeq de
      // 44: aload 5
      // 46: iload 3
      // 47: ifeq 64
      // 4a: invokevirtual e0x.p1r ()Lp3y;
      // 4d: getstatic p3y.hh1 Lp3y;
      // 50: if_acmpne 62
      // 53: goto 5a
      // 56: invokestatic e7p.a (Loov;)Loov;
      // 59: athrow
      // 5a: bipush 1
      // 5b: goto df
      // 5e: invokestatic e7p.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 5
      // 64: iload 3
      // 65: ifeq a4
      // 68: aload 0
      // 69: if_acmpne a2
      // 6c: goto 73
      // 6f: invokestatic e7p.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 4
      // 75: getstatic e7p.sxl L_ku;
      // 78: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 7d: checkcast java/lang/Integer
      // 80: invokevirtual java/lang/Integer.intValue ()I
      // 83: iload 3
      // 84: ifeq a7
      // 87: goto 8e
      // 8a: invokestatic e7p.a (Loov;)Loov;
      // 8d: athrow
      // 8e: bipush 7
      // 90: if_icmplt a2
      // 93: goto 9a
      // 96: invokestatic e7p.a (Loov;)Loov;
      // 99: athrow
      // 9a: bipush 1
      // 9b: goto df
      // 9e: invokestatic e7p.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 5
      // a4: invokevirtual e0x.ko5 ()Z
      // a7: iload 3
      // a8: ifeq db
      // ab: ifeq da
      // ae: goto b5
      // b1: invokestatic e7p.a (Loov;)Loov;
      // b4: athrow
      // b5: aload 5
      // b7: getfield e0x.kgd Lp3y;
      // ba: invokevirtual p3y.c3t ()Z
      // bd: iload 3
      // be: ifeq db
      // c1: goto c8
      // c4: invokestatic e7p.a (Loov;)Loov;
      // c7: athrow
      // c8: ifeq da
      // cb: goto d2
      // ce: invokestatic e7p.a (Loov;)Loov;
      // d1: athrow
      // d2: bipush 1
      // d3: goto df
      // d6: invokestatic e7p.a (Loov;)Loov;
      // d9: athrow
      // da: bipush 0
      // db: goto df
      // de: bipush 0
      // df: ireturn
   }

   @Override
   public void z3l(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
      this.qhl(var1, var2, var3);
   }

   private boolean qhl(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual e7p.ctq (Lt9d;Lmew;)Z
      // 0b: iload 4
      // 0d: ifeq 2f
      // 10: ifne 2e
      // 13: goto 1a
      // 16: invokestatic e7p.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: bipush 0
      // 1f: invokevirtual e7p.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 22: aload 1
      // 23: aload 2
      // 24: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 27: pop
      // 28: bipush 0
      // 29: ireturn
      // 2a: invokestatic e7p.a (Loov;)Loov;
      // 2d: athrow
      // 2e: bipush 1
      // 2f: ireturn
   }

   @Override
   public void i4u(OpaquePredicate var1, ha9 var2, mew var3, zfz var4, pyk var5) {
      ymu(var1, var3, new erg(xbr.db4, (Integer)var4.dil(sxl) + 1, 0));
      var1.i6x(var3);
      var2.aex(l9p.hf_[e0x.mxb(this)]);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.db4;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getstatic qe5.lm8 Lqe5;
      // 09: aload 2
      // 0a: invokevirtual OpaquePredicate.qkq (Lqe5;Lmew;)I
      // 0d: iload 5
      // 0f: ifne 36
      // 12: bipush 11
      // 14: if_icmple 37
      // 17: goto 1e
      // 1a: invokestatic e7p.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: aload 2
      // 21: aload 1
      // 22: aload 2
      // 23: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 26: bipush 0
      // 27: invokevirtual e7p.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 2a: aload 1
      // 2b: aload 2
      // 2c: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 2f: goto 36
      // 32: invokestatic e7p.a (Loov;)Loov;
      // 35: athrow
      // 36: pop
      // 37: return
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      try {
         if (var3 == vt2.rf3) {
            return true;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return super.ron(var1, var2, var3);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(sxl, (var1 & 7) + 1);
   }

   @Override
   public boolean ujd(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 09: getstatic e7p.sxl L_ku;
      // 0c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 11: checkcast java/lang/Integer
      // 14: invokevirtual java/lang/Integer.intValue ()I
      // 17: iload 3
      // 18: ifne 2e
      // 1b: bipush 1
      // 1c: if_icmpne 31
      // 1f: goto 26
      // 22: invokestatic e7p.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2e
      // 2a: invokestatic e7p.a (Loov;)Loov;
      // 2d: athrow
      // 2e: goto 32
      // 31: bipush 0
      // 32: ireturn
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(sxl) - 1;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{sxl});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7750117865923555660L, 2089680485220226582L, MethodHandles.lookup().lookupClass()).a(241763574544443L);
      // $VF: monitorexit
      long var4 = var10000 ^ 42120477119040L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("»?iXmËË\u0011".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      sxl = _ku.wgl(var0, 1, 8);
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
