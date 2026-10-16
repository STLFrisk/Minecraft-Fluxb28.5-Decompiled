import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kre extends sq9 implements jrp {
   public static final _ku q7v;

   public kre() {
      super(p3y.nc7);
      this.y8l(this._8_.c32().zvi(em9, vt2.z9q).zvi(q7v, 0));
      this._p_(true);
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
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokevirtual kre.e0h (Lt9d;Lmew;Lzfz;)Z
      // 0c: iload 5
      // 0e: ifne 3d
      // 11: ifne 2e
      // 14: goto 1b
      // 17: invokestatic kre.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: aload 3
      // 1f: invokespecial kre.dt9 (Lt9d;Lmew;Lzfz;)V
      // 22: iload 5
      // 24: ifeq 94
      // 27: goto 2e
      // 2a: invokestatic kre.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 32: bipush 5
      // 33: invokevirtual java/util/Random.nextInt (I)I
      // 36: goto 3d
      // 39: invokestatic kre.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 5
      // 3f: ifne 62
      // 42: ifne 94
      // 45: goto 4c
      // 48: invokestatic kre.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 3
      // 4d: getstatic kre.q7v L_ku;
      // 50: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 55: checkcast java/lang/Integer
      // 58: invokevirtual java/lang/Integer.intValue ()I
      // 5b: goto 62
      // 5e: invokestatic kre.a (Loov;)Loov;
      // 61: athrow
      // 62: istore 6
      // 64: iload 6
      // 66: iload 5
      // 68: ifne 93
      // 6b: bipush 2
      // 6c: if_icmpge 94
      // 6f: goto 76
      // 72: invokestatic kre.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 1
      // 77: aload 2
      // 78: aload 3
      // 79: getstatic kre.q7v L_ku;
      // 7c: iload 6
      // 7e: bipush 1
      // 7f: iadd
      // 80: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 83: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 88: bipush 2
      // 89: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 8c: goto 93
      // 8f: invokestatic kre.a (Loov;)Loov;
      // 92: athrow
      // 93: pop
      // 94: return
   }

   public boolean e0h(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: aload 3
      // 02: getstatic kre.em9 Lqx_;
      // 05: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0a: checkcast vt2
      // 0d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 10: astore 2
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: aload 1
      // 15: aload 2
      // 16: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 19: astore 5
      // 1b: istore 4
      // 1d: aload 5
      // 1f: iload 4
      // 21: ifeq 3f
      // 24: invokeinterface zfz.r_y ()Le0x; 1
      // 29: getstatic ox_.uom Le0x;
      // 2c: if_acmpne 55
      // 2f: goto 36
      // 32: invokestatic kre.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 5
      // 38: goto 3f
      // 3b: invokestatic kre.a (Loov;)Loov;
      // 3e: athrow
      // 3f: getstatic x54.ub7 Lzb_;
      // 42: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 47: getstatic x54$lti.jnw Lx54$lti;
      // 4a: if_acmpne 55
      // 4d: bipush 1
      // 4e: goto 56
      // 51: invokestatic kre.a (Loov;)Loov;
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
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
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      this.c7i(var1, var2);
      return super.m__(var1, var2, var3);
   }

   @Override
   public nh4 j54(OpaquePredicate var1, mew var2) {
      this.c7i(var1, var2);
      return super.j54(var1, var2);
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
      // 000: aload 1
      // 001: aload 2
      // 002: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 007: astore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: aload 4
      // 00e: getstatic kre.em9 Lqx_;
      // 011: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 016: checkcast vt2
      // 019: astore 5
      // 01b: istore 3
      // 01c: aload 4
      // 01e: getstatic kre.q7v L_ku;
      // 021: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 026: checkcast java/lang/Integer
      // 029: invokevirtual java/lang/Integer.intValue ()I
      // 02c: istore 6
      // 02e: bipush 4
      // 02f: iload 6
      // 031: bipush 2
      // 032: imul
      // 033: iadd
      // 034: istore 7
      // 036: bipush 5
      // 037: iload 6
      // 039: bipush 2
      // 03a: imul
      // 03b: iadd
      // 03c: istore 8
      // 03e: iload 7
      // 040: i2f
      // 041: fconst_2
      // 042: fdiv
      // 043: fstore 9
      // 045: iload 3
      // 046: ifne 0af
      // 049: getstatic kre$1.esn [I
      // 04c: aload 5
      // 04e: invokevirtual vt2.ordinal ()I
      // 051: iaload
      // 052: tableswitch 278 1 4 34 97 158 219
      // 070: invokestatic kre.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: ldc 8.0
      // 077: nop
      // 078: fload 9
      // 07a: fsub
      // 07b: ldc 16.0
      // 07d: nop
      // 07e: fdiv
      // 07f: ldc 12.0
      // 081: nop
      // 082: iload 8
      // 084: i2f
      // 085: fsub
      // 086: ldc 16.0
      // 088: nop
      // 089: fdiv
      // 08a: ldc 15.0
      // 08c: nop
      // 08d: iload 7
      // 08f: i2f
      // 090: fsub
      // 091: ldc 16.0
      // 093: nop
      // 094: fdiv
      // 095: ldc 8.0
      // 097: nop
      // 098: fload 9
      // 09a: fadd
      // 09b: ldc 16.0
      // 09d: nop
      // 09e: fdiv
      // 09f: ldc 0.75
      // 0a1: nop
      // 0a2: ldc 0.9375
      // 0a4: nop
      // 0a5: invokevirtual kre.xl4 (FFFFFF)V
      // 0a8: goto 0af
      // 0ab: invokestatic kre.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: iload 3
      // 0b0: ifeq 168
      // 0b3: aload 0
      // 0b4: ldc 8.0
      // 0b6: nop
      // 0b7: fload 9
      // 0b9: fsub
      // 0ba: ldc 16.0
      // 0bc: nop
      // 0bd: fdiv
      // 0be: ldc 12.0
      // 0c0: nop
      // 0c1: iload 8
      // 0c3: i2f
      // 0c4: fsub
      // 0c5: ldc 16.0
      // 0c7: nop
      // 0c8: fdiv
      // 0c9: ldc 0.0625
      // 0cb: nop
      // 0cc: ldc 8.0
      // 0ce: nop
      // 0cf: fload 9
      // 0d1: fadd
      // 0d2: ldc 16.0
      // 0d4: nop
      // 0d5: fdiv
      // 0d6: ldc 0.75
      // 0d8: nop
      // 0d9: fconst_1
      // 0da: iload 7
      // 0dc: i2f
      // 0dd: fadd
      // 0de: ldc 16.0
      // 0e0: nop
      // 0e1: fdiv
      // 0e2: invokevirtual kre.xl4 (FFFFFF)V
      // 0e5: iload 3
      // 0e6: ifeq 168
      // 0e9: goto 0f0
      // 0ec: invokestatic kre.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: ldc 0.0625
      // 0f3: nop
      // 0f4: ldc 12.0
      // 0f6: nop
      // 0f7: iload 8
      // 0f9: i2f
      // 0fa: fsub
      // 0fb: ldc 16.0
      // 0fd: nop
      // 0fe: fdiv
      // 0ff: ldc 8.0
      // 101: nop
      // 102: fload 9
      // 104: fsub
      // 105: ldc 16.0
      // 107: nop
      // 108: fdiv
      // 109: fconst_1
      // 10a: iload 7
      // 10c: i2f
      // 10d: fadd
      // 10e: ldc 16.0
      // 110: nop
      // 111: fdiv
      // 112: ldc 0.75
      // 114: nop
      // 115: ldc 8.0
      // 117: nop
      // 118: fload 9
      // 11a: fadd
      // 11b: ldc 16.0
      // 11d: nop
      // 11e: fdiv
      // 11f: invokevirtual kre.xl4 (FFFFFF)V
      // 122: iload 3
      // 123: ifeq 168
      // 126: goto 12d
      // 129: invokestatic kre.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 0
      // 12e: ldc 15.0
      // 130: nop
      // 131: iload 7
      // 133: i2f
      // 134: fsub
      // 135: ldc 16.0
      // 137: nop
      // 138: fdiv
      // 139: ldc 12.0
      // 13b: nop
      // 13c: iload 8
      // 13e: i2f
      // 13f: fsub
      // 140: ldc 16.0
      // 142: nop
      // 143: fdiv
      // 144: ldc 8.0
      // 146: nop
      // 147: fload 9
      // 149: fsub
      // 14a: ldc 16.0
      // 14c: nop
      // 14d: fdiv
      // 14e: ldc 0.9375
      // 150: nop
      // 151: ldc 0.75
      // 153: nop
      // 154: ldc 8.0
      // 156: nop
      // 157: fload 9
      // 159: fadd
      // 15a: ldc 16.0
      // 15c: nop
      // 15d: fdiv
      // 15e: invokevirtual kre.xl4 (FFFFFF)V
      // 161: goto 168
      // 164: invokestatic kre.a (Loov;)Loov;
      // 167: athrow
      // 168: return
   }

   @Override
   public void qh0(OpaquePredicate var1, mew var2, zfz var3, Entity var4, erg var5) {
      vt2 var6 = vt2.ni1((double)var4.x5k);
      var1.vct(var2, var3.zvi(em9, var6), 2);
   }

   @Override
   public zfz qk_(OpaquePredicate param1, mew param2, vt2 param3, float param4, float param5, float param6, int param7, Entity param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 3
      // 06: iload 9
      // 08: ifne 25
      // 0b: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 0e: invokevirtual vt2$y0s.pyt ()Z
      // 11: ifne 26
      // 14: goto 1b
      // 17: invokestatic kre.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic vt2.z9q Lvt2;
      // 1e: goto 25
      // 21: invokestatic kre.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: invokevirtual kre.l4i ()Lzfz;
      // 2a: getstatic kre.em9 Lqx_;
      // 2d: aload 3
      // 2e: invokevirtual vt2.b4b ()Lvt2;
      // 31: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36: getstatic kre.q7v L_ku;
      // 39: bipush 0
      // 3a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 42: areturn
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: iload 5
      // 0b: ifne 26
      // 0e: invokevirtual kre.e0h (Lt9d;Lmew;Lzfz;)Z
      // 11: ifne 29
      // 14: goto 1b
      // 17: invokestatic kre.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: aload 3
      // 1f: goto 26
      // 22: invokestatic kre.a (Loov;)Loov;
      // 25: athrow
      // 26: invokespecial kre.dt9 (Lt9d;Lmew;Lzfz;)V
      // 29: return
   }

   private void dt9(OpaquePredicate var1, mew var2, zfz var3) {
      var1.vct(var2, ox_.ibw.l4i(), 3);
      this.lf0(var1, var2, var3, 0);
   }

   @Override
   public void ix7(OpaquePredicate var1, mew var2, zfz var3, float var4, int var5) {
      int var7 = (Integer)var3.dil(q7v);
      int var10000 = OpaquePredicate.b();
      byte var8 = 1;
      int var6 = var10000;

      label31: {
         label30: {
            try {
               var10000 = var7;
               if (var6 == 0) {
                  break label31;
               }

               if (var7 < 2) {
                  break label30;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var8 = 3;
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < var8) {
         ymu(var1, var2, new erg(xbr.nnn, 1, qvg._fk.b9d()));
         var9++;
         if (var6 == 0) {
            break;
         }
      }
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.nnn;
   }

   @Override
   public int qu2(OpaquePredicate var1, mew var2) {
      return qvg._fk.b9d();
   }

   @Override
   public boolean z3t(OpaquePredicate param1, mew param2, zfz param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic kre.q7v L_ku;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: iload 5
      // 16: ifeq 2c
      // 19: bipush 2
      // 1a: if_icmpge 2f
      // 1d: goto 24
      // 20: invokestatic kre.a (Loov;)Loov;
      // 23: athrow
      // 24: bipush 1
      // 25: goto 2c
      // 28: invokestatic kre.a (Loov;)Loov;
      // 2b: athrow
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }

   @Override
   public boolean y4n(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      return true;
   }

   @Override
   public void tu1(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      var1.vct(var3, var4.zvi(q7v, (Integer)var4.dil(q7v) + 1), 2);
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(em9, vt2.bm6(var1)).zvi(q7v, (var1 & 15) >> 2);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = 0;
      var2 |= ((vt2)var1.dil(em9)).tmy();
      return var2 | (Integer)var1.dil(q7v) << 2;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{em9, q7v});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1926577420189130114L, 7827734471965935381L, MethodHandles.lookup().lookupClass()).a(221799453169705L);
      // $VF: monitorexit
      long var4 = var10000 ^ 62444658572194L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0097\u008eZÏ\u0099\u0006Ê6".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      q7v = _ku.wgl(var0, 0, 2);
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
