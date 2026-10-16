import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k7p extends c5x {
   private static final long c;
   private static final String h;

   public k7p(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.3125F, 0.3125F);
   }

   public k7p(OpaquePredicate var1, Entity var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.yxc(0.3125F, 0.3125F);
   }

   @Override
   public float ew9() {
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
      // 05: iload 1
      // 06: ifeq 21
      // 09: invokevirtual k7p.oy3 ()Z
      // 0c: ifeq 20
      // 0f: goto 16
      // 12: invokestatic k7p.b (Loov;)Loov;
      // 15: athrow
      // 16: ldc 0.73
      // 18: nop
      // 19: goto 24
      // 1c: invokestatic k7p.b (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: invokespecial c5x.ew9 ()F
      // 24: freturn
   }

   public k7p(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.yxc(0.3125F, 0.3125F);
   }

   @Override
   public boolean agj() {
      return false;
   }

   @Override
   public float sx1(vu6 param1, OpaquePredicate param2, mew param3, zfz param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: aload 4
      // 06: invokespecial c5x.sx1 (Lvu6;Lt9d;Lmew;Lzfz;)F
      // 09: fstore 6
      // 0b: invokestatic OpaquePredicate.b ()I
      // 0e: aload 4
      // 10: invokeinterface zfz.r_y ()Le0x; 1
      // 15: astore 7
      // 17: istore 5
      // 19: aload 0
      // 1a: invokevirtual k7p.oy3 ()Z
      // 1d: iload 5
      // 1f: ifeq 38
      // 22: ifeq 45
      // 25: goto 2c
      // 28: invokestatic k7p.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 7
      // 2e: invokestatic ju8.wo1 (Le0x;)Z
      // 31: goto 38
      // 34: invokestatic k7p.b (Loov;)Loov;
      // 37: athrow
      // 38: ifeq 45
      // 3b: ldc 0.8
      // 3d: nop
      // 3e: fload 6
      // 40: invokestatic java/lang/Math.min (FF)F
      // 43: fstore 6
      // 45: fload 6
      // 47: freturn
   }

   @Override
   public void f7x(akm param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic k7p.c J
      // 003: ldc2_w 61204347584329
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifeq 02e
      // 013: getfield k7p.oay Lt9d;
      // 016: getfield OpaquePredicate.v0f Z
      // 019: ifne 16b
      // 01c: goto 023
      // 01f: invokestatic k7p.b (Loov;)Loov;
      // 022: athrow
      // 023: aload 1
      // 024: getfield akm.sc8 Li2h;
      // 027: goto 02e
      // 02a: invokestatic k7p.b (Loov;)Loov;
      // 02d: athrow
      // 02e: ifnull 142
      // 031: aload 0
      // 032: getfield k7p.gen Lg_3;
      // 035: iload 4
      // 037: ifeq 0bc
      // 03a: goto 041
      // 03d: invokestatic k7p.b (Loov;)Loov;
      // 040: athrow
      // 041: ifnull 0b1
      // 044: goto 04b
      // 047: invokestatic k7p.b (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 1
      // 04c: getfield akm.sc8 Li2h;
      // 04f: aload 0
      // 050: getfield k7p.gen Lg_3;
      // 053: invokestatic ofh.kun (Lg_3;)Lofh;
      // 056: ldc 8.0
      // 058: nop
      // 059: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 05c: iload 4
      // 05e: ifeq 0cd
      // 061: goto 068
      // 064: invokestatic k7p.b (Loov;)Loov;
      // 067: athrow
      // 068: ifeq 0c6
      // 06b: goto 072
      // 06e: invokestatic k7p.b (Loov;)Loov;
      // 071: athrow
      // 072: aload 1
      // 073: getfield akm.sc8 Li2h;
      // 076: invokevirtual EntityLivingBase.gzr ()Z
      // 079: ifne 099
      // 07c: goto 083
      // 07f: invokestatic k7p.b (Loov;)Loov;
      // 082: athrow
      // 083: aload 0
      // 084: getfield k7p.gen Lg_3;
      // 087: ldc 5.0
      // 089: nop
      // 08a: invokevirtual Entity.rwd (F)V
      // 08d: iload 4
      // 08f: ifne 0c6
      // 092: goto 099
      // 095: invokestatic k7p.b (Loov;)Loov;
      // 098: athrow
      // 099: aload 0
      // 09a: aload 0
      // 09b: getfield k7p.gen Lg_3;
      // 09e: aload 1
      // 09f: getfield akm.sc8 Li2h;
      // 0a2: invokevirtual k7p.wm5 (Lg_3;Li2h;)V
      // 0a5: iload 4
      // 0a7: ifne 0c6
      // 0aa: goto 0b1
      // 0ad: invokestatic k7p.b (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: getfield akm.sc8 Li2h;
      // 0b5: goto 0bc
      // 0b8: invokestatic k7p.b (Loov;)Loov;
      // 0bb: athrow
      // 0bc: getstatic ofh.isz Lofh;
      // 0bf: ldc 5.0
      // 0c1: nop
      // 0c2: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 0c5: pop
      // 0c6: aload 1
      // 0c7: getfield akm.sc8 Li2h;
      // 0ca: instanceof Entity
      // 0cd: iload 4
      // 0cf: ifeq 0dd
      // 0d2: ifeq 142
      // 0d5: goto 0dc
      // 0d8: invokestatic k7p.b (Loov;)Loov;
      // 0db: athrow
      // 0dc: bipush 0
      // 0dd: istore 5
      // 0df: aload 0
      // 0e0: getfield k7p.oay Lt9d;
      // 0e3: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 0e6: getstatic v66.b_4 Lv66;
      // 0e9: iload 4
      // 0eb: ifeq 112
      // 0ee: if_acmpne 101
      // 0f1: goto 0f8
      // 0f4: invokestatic k7p.b (Loov;)Loov;
      // 0f7: athrow
      // 0f8: bipush 10
      // 0fa: istore 5
      // 0fc: iload 4
      // 0fe: ifne 119
      // 101: aload 0
      // 102: getfield k7p.oay Lt9d;
      // 105: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 108: getstatic v66.csg Lv66;
      // 10b: goto 112
      // 10e: invokestatic k7p.b (Loov;)Loov;
      // 111: athrow
      // 112: if_acmpne 119
      // 115: bipush 40
      // 117: istore 5
      // 119: iload 5
      // 11b: ifle 142
      // 11e: aload 1
      // 11f: getfield akm.sc8 Li2h;
      // 122: checkcast Entity
      // 125: new sdj
      // 128: dup
      // 129: getstatic mcs.znt Lmcs;
      // 12c: getfield mcs.zr9 I
      // 12f: bipush 20
      // 131: iload 5
      // 133: imul
      // 134: bipush 1
      // 135: invokespecial sdj.<init> (III)V
      // 138: invokevirtual Entity.gmn (Lsdj;)V
      // 13b: goto 142
      // 13e: invokestatic k7p.b (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: getfield k7p.oay Lt9d;
      // 146: aload 0
      // 147: aload 0
      // 148: getfield k7p.o2v D
      // 14b: aload 0
      // 14c: getfield k7p.kfp D
      // 14f: aload 0
      // 150: getfield k7p.vbd D
      // 153: fconst_1
      // 154: bipush 0
      // 155: aload 0
      // 156: getfield k7p.oay Lt9d;
      // 159: invokevirtual OpaquePredicate.eir ()Lef9;
      // 15c: getstatic k7p.h Ljava/lang/String;
      // 15f: nop
      // 160: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 163: invokevirtual OpaquePredicate.dta (Li2h;DDDFZZ)Lvu6;
      // 166: pop
      // 167: aload 0
      // 168: invokevirtual k7p._kl ()V
      // 16b: return
   }

   @Override
   public boolean mzu() {
      return false;
   }

   @Override
   public boolean m1t(ofh var1, float var2) {
      return false;
   }

   @Override
   public void tbj() {
      this.oit.kp2(10, (byte)0);
   }

   public boolean oy3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield k7p.oit Lwl1;
      // 08: bipush 10
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: iload 1
      // 0e: ifne 24
      // 11: bipush 1
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic k7p.b (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic k7p.b (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   public void fuq(boolean var1) {
      int var2 = OpaquePredicate.b();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.oit;
               var10001 = 10;
               var10002 = var1;
               if (var2 == 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw b(var3);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.c66(var10001, (byte)var10002);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5791345338591311359L, 7818552583787050449L, MethodHandles.lookup().lookupClass()).a(267397536868360L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 22752530193853L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("TAF±\u009cø/E\u0085\r[M\u0001pÔ®".getBytes("ISO-8859-1"));
      String var6 = c(var4).intern();
      byte var10001 = -1;
      h = var6;
   }

   private static oov b(oov var0) {
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
