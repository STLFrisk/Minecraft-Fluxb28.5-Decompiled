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

public class j91 extends s0i {
   private float hn1 = 0.5F;
   private int fru;
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public j91(OpaquePredicate var1) {
      super(var1);
      this.cuj = true;
      this.dlk = 10;
      this.r1d.tn8(4, new j91$hqw(this));
      this.r1d.tn8(5, new rap(this, 1.0));
      this.r1d.tn8(7, new _tb(this, 1.0));
      this.r1d.tn8(8, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(8, new ov6(this));
      this.g9o.tn8(1, new z7z(this, true, new Class[0]));
      this.g9o.tn8(2, new s24(this, ha9.class, true));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.y3f).zf7(6.0);
      this.dgt(m6d.w7i).zf7(0.23F);
      this.dgt(m6d.wg4).zf7(48.0);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, new Byte((byte)0));
   }

   @Override
   public String _n1() {
      long var1 = c ^ 55563937921554L;
      return e<"v">(78, 6125501358298369430L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 44159620691306L;
      return e<"v">(857, 7047656656444260858L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 25698700919588L;
      return e<"v">(7649, 5395160015616223501L ^ var1);
   }

   @Override
   public int azk(float var1) {
      return 15728880;
   }

   @Override
   public float xeu(float var1) {
      return 1.0F;
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j91.c J
      // 003: ldc2_w 101790829550845
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield j91.lfk Z
      // 010: iload 3
      // 011: ifne 05e
      // 014: ifne 04c
      // 017: goto 01e
      // 01a: invokestatic j91.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield j91.mop D
      // 022: dconst_0
      // 023: dcmpg
      // 024: iload 3
      // 025: ifne 05e
      // 028: goto 02f
      // 02b: invokestatic j91.a (Loov;)Loov;
      // 02e: athrow
      // 02f: ifge 04c
      // 032: goto 039
      // 035: invokestatic j91.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: dup
      // 03b: getfield j91.mop D
      // 03e: ldc2_w 0.6
      // 041: dmul
      // 042: putfield j91.mop D
      // 045: goto 04c
      // 048: invokestatic j91.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: iload 3
      // 04e: ifne 14f
      // 051: getfield j91.oay Lt9d;
      // 054: getfield OpaquePredicate.v0f Z
      // 057: goto 05e
      // 05a: invokestatic j91.a (Loov;)Loov;
      // 05d: athrow
      // 05e: ifeq 14e
      // 061: aload 0
      // 062: getfield j91.z2d Ljava/util/Random;
      // 065: bipush 24
      // 067: invokevirtual java/util/Random.nextInt (I)I
      // 06a: iload 3
      // 06b: ifne 0e6
      // 06e: goto 075
      // 071: invokestatic j91.a (Loov;)Loov;
      // 074: athrow
      // 075: ifne 0e5
      // 078: goto 07f
      // 07b: invokestatic j91.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: invokevirtual j91.o3x ()Z
      // 083: iload 3
      // 084: ifne 0e6
      // 087: goto 08e
      // 08a: invokestatic j91.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ifne 0e5
      // 091: goto 098
      // 094: invokestatic j91.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: getfield j91.oay Lt9d;
      // 09c: aload 0
      // 09d: getfield j91.o2v D
      // 0a0: ldc2_w 0.5
      // 0a3: dadd
      // 0a4: aload 0
      // 0a5: getfield j91.kfp D
      // 0a8: ldc2_w 0.5
      // 0ab: dadd
      // 0ac: aload 0
      // 0ad: getfield j91.vbd D
      // 0b0: ldc2_w 0.5
      // 0b3: dadd
      // 0b4: sipush 15694
      // 0b7: ldc2_w 8312582829984814712
      // 0ba: lload 1
      // 0bb: lxor
      // 0bc: invokedynamic v (IJ)Ljava/lang/String; bsm=j91.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: nop
      // 0c2: fconst_1
      // 0c3: aload 0
      // 0c4: getfield j91.z2d Ljava/util/Random;
      // 0c7: invokevirtual java/util/Random.nextFloat ()F
      // 0ca: fadd
      // 0cb: aload 0
      // 0cc: getfield j91.z2d Ljava/util/Random;
      // 0cf: invokevirtual java/util/Random.nextFloat ()F
      // 0d2: ldc 0.7
      // 0d4: nop
      // 0d5: fmul
      // 0d6: ldc 0.3
      // 0d8: nop
      // 0d9: fadd
      // 0da: bipush 0
      // 0db: invokevirtual OpaquePredicate.wd_ (DDDLjava/lang/String;FFZ)V
      // 0de: goto 0e5
      // 0e1: invokestatic j91.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: bipush 0
      // 0e6: istore 4
      // 0e8: iload 4
      // 0ea: bipush 2
      // 0eb: if_icmpge 14e
      // 0ee: aload 0
      // 0ef: getfield j91.oay Lt9d;
      // 0f2: getstatic w_0.vby Lw_0;
      // 0f5: aload 0
      // 0f6: getfield j91.o2v D
      // 0f9: aload 0
      // 0fa: getfield j91.z2d Ljava/util/Random;
      // 0fd: invokevirtual java/util/Random.nextDouble ()D
      // 100: ldc2_w 0.5
      // 103: dsub
      // 104: aload 0
      // 105: getfield j91.uo6 F
      // 108: f2d
      // 109: dmul
      // 10a: dadd
      // 10b: aload 0
      // 10c: getfield j91.kfp D
      // 10f: aload 0
      // 110: getfield j91.z2d Ljava/util/Random;
      // 113: invokevirtual java/util/Random.nextDouble ()D
      // 116: aload 0
      // 117: getfield j91.ikl F
      // 11a: f2d
      // 11b: dmul
      // 11c: dadd
      // 11d: aload 0
      // 11e: getfield j91.vbd D
      // 121: aload 0
      // 122: getfield j91.z2d Ljava/util/Random;
      // 125: invokevirtual java/util/Random.nextDouble ()D
      // 128: ldc2_w 0.5
      // 12b: dsub
      // 12c: aload 0
      // 12d: getfield j91.uo6 F
      // 130: f2d
      // 131: dmul
      // 132: dadd
      // 133: dconst_0
      // 134: dconst_0
      // 135: dconst_0
      // 136: bipush 0
      // 137: newarray 10
      // 139: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 13c: iinc 4 1
      // 13f: iload 3
      // 140: ifne 152
      // 143: iload 3
      // 144: ifeq 0e8
      // 147: goto 14e
      // 14a: invokestatic j91.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: invokespecial s0i.e_a ()V
      // 152: return
   }

   @Override
   public void qar() {
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
      // 05: invokevirtual j91.n08 ()Z
      // 08: iload 1
      // 09: ifeq 3f
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic j91.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic ofh.e7v Lofh;
      // 1a: fconst_1
      // 1b: invokevirtual j91.m1t (Lofh;F)Z
      // 1e: pop
      // 1f: goto 26
      // 22: invokestatic j91.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: dup
      // 28: getfield j91.fru I
      // 2b: bipush 1
      // 2c: isub
      // 2d: putfield j91.fru I
      // 30: aload 0
      // 31: iload 1
      // 32: ifeq 67
      // 35: getfield j91.fru I
      // 38: goto 3f
      // 3b: invokestatic j91.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifgt 63
      // 42: aload 0
      // 43: bipush 100
      // 45: putfield j91.fru I
      // 48: aload 0
      // 49: ldc 0.5
      // 4b: nop
      // 4c: aload 0
      // 4d: getfield j91.z2d Ljava/util/Random;
      // 50: invokevirtual java/util/Random.nextGaussian ()D
      // 53: d2f
      // 54: ldc 3.0
      // 56: nop
      // 57: fmul
      // 58: fadd
      // 59: putfield j91.hn1 F
      // 5c: goto 63
      // 5f: invokestatic j91.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual j91.q4v ()Lg_3;
      // 67: astore 2
      // 68: iload 1
      // 69: ifeq c1
      // 6c: aload 2
      // 6d: ifnull bd
      // 70: goto 77
      // 73: invokestatic j91.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 2
      // 78: getfield Entity.kfp D
      // 7b: aload 2
      // 7c: invokevirtual Entity.c5y ()F
      // 7f: f2d
      // 80: dadd
      // 81: aload 0
      // 82: getfield j91.kfp D
      // 85: aload 0
      // 86: invokevirtual j91.c5y ()F
      // 89: f2d
      // 8a: dadd
      // 8b: aload 0
      // 8c: getfield j91.hn1 F
      // 8f: f2d
      // 90: dadd
      // 91: dcmpl
      // 92: ifle bd
      // 95: goto 9c
      // 98: invokestatic j91.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: dup
      // 9e: getfield j91.mop D
      // a1: ldc2_w 0.30000001192092896
      // a4: aload 0
      // a5: getfield j91.mop D
      // a8: dsub
      // a9: ldc2_w 0.30000001192092896
      // ac: dmul
      // ad: dadd
      // ae: putfield j91.mop D
      // b1: aload 0
      // b2: bipush 1
      // b3: putfield j91.u19 Z
      // b6: goto bd
      // b9: invokestatic j91.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 0
      // be: invokespecial s0i.qar ()V
      // c1: return
   }

   @Override
   public void ibc(float var1, float var2) {
   }

   @Override
   public u7m q4n() {
      return xbr.nh7;
   }

   @Override
   public boolean agj() {
      return this.fj1();
   }

   @Override
   public void ir3(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifne 24
      // 09: ifeq 40
      // 0c: goto 13
      // 0f: invokestatic j91.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield j91.z2d Ljava/util/Random;
      // 17: bipush 2
      // 18: iload 2
      // 19: iadd
      // 1a: invokevirtual java/util/Random.nextInt (I)I
      // 1d: goto 24
      // 20: invokestatic j91.a (Loov;)Loov;
      // 23: athrow
      // 24: istore 4
      // 26: bipush 0
      // 27: istore 5
      // 29: iload 5
      // 2b: iload 4
      // 2d: if_icmpge 40
      // 30: aload 0
      // 31: getstatic xbr.nh7 Lu7m;
      // 34: bipush 1
      // 35: invokevirtual j91.e70 (Lu7m;I)Lnvf;
      // 38: pop
      // 39: iinc 5 1
      // 3c: iload 3
      // 3d: ifeq 29
      // 40: return
   }

   public boolean fj1() {
      int var1 = OpaquePredicate.c();

      try {
         int var10000 = this.oit.miz(16) & 1;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void lrh(boolean var1) {
      int var2 = OpaquePredicate.c();
      byte var3 = this.oit.miz(16);

      label37: {
         byte var10000;
         label44: {
            label41: {
               try {
                  var10000 = var1;
                  if (var2 != 0) {
                     break label44;
                  }

                  if (var1 == 0) {
                     break label41;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               var3 = (byte)(var3 | 1);

               try {
                  if (var2 == 0) {
                     break label37;
                  }
               } catch (oov var5) {
                  boolean var10001 = false;
                  throw a(var5);
               }
            }

            try {
               var10000 = (byte)(var3 & -2);
            } catch (oov var4) {
               boolean var8 = false;
               throw a(var4);
            }
         }

         var3 = var10000;
      }

      this.oit.c66(16, var3);
   }

   @Override
   public boolean vef() {
      return true;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4869537664904929021L, -7252859186870623627L, MethodHandles.lookup().lookupClass()).a(114755838722121L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 36636318460937L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "û09õ<\u001e\thÞ\u001ea1\u0099î\u008fT°\u0085ih,cU>c3\u0089jÔ$». LBÓ*;-Ô\u001eet1ÿR\u001ebeGW-\u0086\tA\u000e\u0088\u0083fË[þñÔÐ";
      int var8 = "û09õ<\u001e\thÞ\u001ea1\u0099î\u008fT°\u0085ih,cU>c3\u0089jÔ$». LBÓ*;-Ô\u001eet1ÿR\u001ebeGW-\u0086\tA\u000e\u0088\u0083fË[þñÔÐ".length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = f(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     u = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "ëÌï|áÆ]ÐÛTvfÖ¹?L/l©\u0085\u001cÞH\u001aßÚÑ<ªóyâ«\u0095Ãõ\u0013sr\u000e Þn2ä¹W!fS¹ðsN½Øêóøf>=\u00ad\u000eDÖ²Å[(\u0085ÆÀ";
                  var8 = "ëÌï|áÆ]ÐÛTvfÖ¹?L/l©\u0085\u001cÞH\u001aßÚÑ<ªóyâ«\u0095Ãõ\u0013sr\u000e Þn2ä¹W!fS¹ðsN½Øêóøf>=\u00ad\u000eDÖ²Å[(\u0085ÆÀ".length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String f(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3008;
      if (u[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("j91", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         u[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return u[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("j91" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
