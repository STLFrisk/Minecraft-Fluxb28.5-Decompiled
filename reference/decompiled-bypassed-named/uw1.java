import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class uw1 extends znt {
   public static final zb_ p3a;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public uw1() {
      super(p3y.p6q, false);
      this.y8l(this._8_.c32().zvi(p3a, vt2$y0s.wvd));
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
      // 000: getstatic uw1.b J
      // 003: ldc2_w 31709516992755
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 7
      // 00e: aload 0
      // 00f: aload 1
      // 010: aload 2
      // 011: aload 3
      // 012: aload 4
      // 014: invokespecial znt.zvy (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 017: aload 1
      // 018: getfield OpaquePredicate.vzz Lupn;
      // 01b: invokevirtual upn.cws ()Z
      // 01e: iload 7
      // 020: ifeq 04a
      // 023: ifeq 13c
      // 026: goto 02d
      // 029: invokestatic uw1.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 1
      // 02e: invokevirtual OpaquePredicate.eir ()Lef9;
      // 031: sipush 2102
      // 034: ldc2_w 7690858384216247190
      // 037: lload 5
      // 039: lxor
      // 03a: invokedynamic w (IJ)Ljava/lang/String; bsm=uw1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: nop
      // 040: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 043: goto 04a
      // 046: invokestatic uw1.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 7
      // 04c: ifeq 068
      // 04f: ifeq 13c
      // 052: goto 059
      // 055: invokestatic uw1.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 4
      // 05b: sipush 2000
      // 05e: invokevirtual java/util/Random.nextInt (I)I
      // 061: goto 068
      // 064: invokestatic uw1.a (Loov;)Loov;
      // 067: athrow
      // 068: iload 7
      // 06a: ifeq 089
      // 06d: aload 1
      // 06e: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 071: invokevirtual v66.dzc ()I
      // 074: if_icmpge 13c
      // 077: goto 07e
      // 07a: invokestatic uw1.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 2
      // 07f: invokevirtual mew.getY ()I
      // 082: goto 089
      // 085: invokestatic uw1.a (Loov;)Loov;
      // 088: athrow
      // 089: istore 8
      // 08b: aload 2
      // 08c: astore 9
      // 08e: aload 1
      // 08f: aload 9
      // 091: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 094: ifne 0c3
      // 097: aload 9
      // 099: invokevirtual mew.getY ()I
      // 09c: iload 7
      // 09e: ifeq 0c5
      // 0a1: iload 7
      // 0a3: ifeq 0c5
      // 0a6: goto 0ad
      // 0a9: invokestatic uw1.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: ifle 0c3
      // 0b0: goto 0b7
      // 0b3: invokestatic uw1.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 9
      // 0b9: invokevirtual mew.eve ()Lmew;
      // 0bc: astore 9
      // 0be: iload 7
      // 0c0: ifne 08e
      // 0c3: iload 8
      // 0c5: iload 7
      // 0c7: ifeq 0f8
      // 0ca: ifle 13c
      // 0cd: goto 0d4
      // 0d0: invokestatic uw1.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 1
      // 0d5: iload 7
      // 0d7: ifeq 0fc
      // 0da: goto 0e1
      // 0dd: invokestatic uw1.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 9
      // 0e3: invokevirtual mew.nuv ()Lmew;
      // 0e6: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0e9: invokeinterface zfz.r_y ()Le0x; 1
      // 0ee: invokevirtual e0x.y0n ()Z
      // 0f1: goto 0f8
      // 0f4: invokestatic uw1.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: ifne 13c
      // 0fb: aload 1
      // 0fc: bipush 57
      // 0fe: aload 9
      // 100: invokevirtual mew.getX ()I
      // 103: i2d
      // 104: ldc2_w 0.5
      // 107: dadd
      // 108: aload 9
      // 10a: invokevirtual mew.getY ()I
      // 10d: i2d
      // 10e: ldc2_w 1.1
      // 111: dadd
      // 112: aload 9
      // 114: invokevirtual mew.getZ ()I
      // 117: i2d
      // 118: ldc2_w 0.5
      // 11b: dadd
      // 11c: invokestatic bmp.ga6 (Lt9d;IDDD)Li2h;
      // 11f: astore 10
      // 121: aload 10
      // 123: iload 7
      // 125: ifeq 134
      // 128: ifnull 13c
      // 12b: goto 132
      // 12e: invokestatic uw1.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 10
      // 134: aload 10
      // 136: invokevirtual EntityLivingBase.k0g ()I
      // 139: putfield EntityLivingBase.rr6 I
      // 13c: return
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      vt2$y0s var4 = (vt2$y0s)var1.getBlockState(var2).dil(p3a);
      int var10000 = OpaquePredicate.b();
      float var5 = 0.125F;
      float var6 = 0.125F;
      int var3 = var10000;

      vt2$y0s var10001;
      label25: {
         label24: {
            try {
               var8 = var4;
               var10001 = vt2$y0s.wvd;
               if (var3 == 0) {
                  break label25;
               }

               if (var4 != vt2$y0s.wvd) {
                  break label24;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var5 = 0.5F;
         }

         var8 = var4;
         var10001 = vt2$y0s.zty;
      }

      if (var8 == var10001) {
         var6 = 0.5F;
      }

      this.xl4(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
   }

   public static int qkg(vt2$y0s param0) {
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
      // 05: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 08: iload 1
      // 09: ifne 22
      // 0c: if_acmpne 1e
      // 0f: goto 16
      // 12: invokestatic uw1.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 2e
      // 1a: invokestatic uw1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getstatic vt2$y0s.zty Lvt2$y0s;
      // 22: if_acmpne 2d
      // 25: bipush 2
      // 26: goto 2e
      // 29: invokestatic uw1.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
   }

   @Override
   public boolean gck() {
      return false;
   }

   public boolean pfb(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: new uw1$e46
      // 07: dup
      // 08: aload 1
      // 09: aload 2
      // 0a: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 0d: invokespecial uw1$e46.<init> (Lt9d;Lmew;Lvt2$y0s;)V
      // 10: astore 4
      // 12: aload 4
      // 14: iload 3
      // 15: ifeq 56
      // 18: invokevirtual uw1$e46.pmy ()Z
      // 1b: ifeq 4a
      // 1e: goto 25
      // 21: invokestatic uw1.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 4
      // 27: iload 3
      // 28: ifeq 56
      // 2b: goto 32
      // 2e: invokestatic uw1.a (Loov;)Loov;
      // 31: athrow
      // 32: invokestatic uw1$e46.r72 (Luw1$e46;)I
      // 35: ifne 4a
      // 38: goto 3f
      // 3b: invokestatic uw1.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 4
      // 41: invokevirtual uw1$e46.zub ()V
      // 44: bipush 1
      // 45: ireturn
      // 46: invokestatic uw1.a (Loov;)Loov;
      // 49: athrow
      // 4a: new uw1$e46
      // 4d: dup
      // 4e: aload 1
      // 4f: aload 2
      // 50: getstatic vt2$y0s.zty Lvt2$y0s;
      // 53: invokespecial uw1$e46.<init> (Lt9d;Lmew;Lvt2$y0s;)V
      // 56: astore 5
      // 58: aload 5
      // 5a: invokevirtual uw1$e46.pmy ()Z
      // 5d: iload 3
      // 5e: ifeq 91
      // 61: ifeq 90
      // 64: goto 6b
      // 67: invokestatic uw1.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 5
      // 6d: invokestatic uw1$e46.r72 (Luw1$e46;)I
      // 70: iload 3
      // 71: ifeq 91
      // 74: goto 7b
      // 77: invokestatic uw1.a (Loov;)Loov;
      // 7a: athrow
      // 7b: ifne 90
      // 7e: goto 85
      // 81: invokestatic uw1.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 5
      // 87: invokevirtual uw1$e46.zub ()V
      // 8a: bipush 1
      // 8b: ireturn
      // 8c: invokestatic uw1.a (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 0
      // 91: ireturn
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic uw1.p3a Lzb_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast vt2$y0s
      // 11: astore 6
      // 13: aload 6
      // 15: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 18: iload 5
      // 1a: ifeq 93
      // 1d: if_acmpne 87
      // 20: goto 27
      // 23: invokestatic uw1.a (Loov;)Loov;
      // 26: athrow
      // 27: new uw1$e46
      // 2a: dup
      // 2b: aload 1
      // 2c: aload 2
      // 2d: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 30: invokespecial uw1$e46.<init> (Lt9d;Lmew;Lvt2$y0s;)V
      // 33: astore 7
      // 35: aload 7
      // 37: invokevirtual uw1$e46.pmy ()Z
      // 3a: iload 5
      // 3c: ifeq 81
      // 3f: ifeq 6f
      // 42: goto 49
      // 45: invokestatic uw1.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 7
      // 4b: invokestatic uw1$e46.r72 (Luw1$e46;)I
      // 4e: iload 5
      // 50: ifeq 81
      // 53: goto 5a
      // 56: invokestatic uw1.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 7
      // 5c: invokestatic uw1$e46.m3z (Luw1$e46;)I
      // 5f: aload 7
      // 61: invokestatic uw1$e46.m2u (Luw1$e46;)I
      // 64: imul
      // 65: if_icmpge 82
      // 68: goto 6f
      // 6b: invokestatic uw1.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 1
      // 70: aload 2
      // 71: getstatic ox_.ibw Le0x;
      // 74: invokevirtual e0x.l4i ()Lzfz;
      // 77: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 7a: goto 81
      // 7d: invokestatic uw1.a (Loov;)Loov;
      // 80: athrow
      // 81: pop
      // 82: iload 5
      // 84: ifne f1
      // 87: aload 6
      // 89: getstatic vt2$y0s.zty Lvt2$y0s;
      // 8c: goto 93
      // 8f: invokestatic uw1.a (Loov;)Loov;
      // 92: athrow
      // 93: if_acmpne f1
      // 96: new uw1$e46
      // 99: dup
      // 9a: aload 1
      // 9b: aload 2
      // 9c: getstatic vt2$y0s.zty Lvt2$y0s;
      // 9f: invokespecial uw1$e46.<init> (Lt9d;Lmew;Lvt2$y0s;)V
      // a2: astore 7
      // a4: aload 7
      // a6: invokevirtual uw1$e46.pmy ()Z
      // a9: iload 5
      // ab: ifeq f0
      // ae: ifeq de
      // b1: goto b8
      // b4: invokestatic uw1.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 7
      // ba: invokestatic uw1$e46.r72 (Luw1$e46;)I
      // bd: iload 5
      // bf: ifeq f0
      // c2: goto c9
      // c5: invokestatic uw1.a (Loov;)Loov;
      // c8: athrow
      // c9: aload 7
      // cb: invokestatic uw1$e46.m3z (Luw1$e46;)I
      // ce: aload 7
      // d0: invokestatic uw1$e46.m2u (Luw1$e46;)I
      // d3: imul
      // d4: if_icmpge f1
      // d7: goto de
      // da: invokestatic uw1.a (Loov;)Loov;
      // dd: athrow
      // de: aload 1
      // df: aload 2
      // e0: getstatic ox_.ibw Le0x;
      // e3: invokevirtual e0x.l4i ()Lzfz;
      // e6: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // e9: goto f0
      // ec: invokestatic uw1.a (Loov;)Loov;
      // ef: athrow
      // f0: pop
      // f1: return
   }

   @Override
   public boolean ron(m5n param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 5
      // 003: invokestatic OpaquePredicate.b ()I
      // 006: aload 1
      // 007: aload 2
      // 008: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 00d: astore 6
      // 00f: istore 4
      // 011: aload 1
      // 012: aload 2
      // 013: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 018: iload 4
      // 01a: ifeq 036
      // 01d: invokeinterface zfz.r_y ()Le0x; 1
      // 022: aload 0
      // 023: if_acmpne 0d2
      // 026: goto 02d
      // 029: invokestatic uw1.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 6
      // 02f: goto 036
      // 032: invokestatic uw1.a (Loov;)Loov;
      // 035: athrow
      // 036: getstatic uw1.p3a Lzb_;
      // 039: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 03e: checkcast vt2$y0s
      // 041: astore 5
      // 043: aload 5
      // 045: iload 4
      // 047: ifeq 05c
      // 04a: ifnonnull 05a
      // 04d: goto 054
      // 050: invokestatic uw1.a (Loov;)Loov;
      // 053: athrow
      // 054: bipush 0
      // 055: ireturn
      // 056: invokestatic uw1.a (Loov;)Loov;
      // 059: athrow
      // 05a: aload 5
      // 05c: getstatic vt2$y0s.zty Lvt2$y0s;
      // 05f: iload 4
      // 061: ifeq 0a1
      // 064: if_acmpne 09c
      // 067: goto 06e
      // 06a: invokestatic uw1.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 3
      // 06f: getstatic vt2.zk4 Lvt2;
      // 072: iload 4
      // 074: ifeq 093
      // 077: goto 07e
      // 07a: invokestatic uw1.a (Loov;)Loov;
      // 07d: athrow
      // 07e: if_acmpeq 09c
      // 081: goto 088
      // 084: invokestatic uw1.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 3
      // 089: getstatic vt2.te4 Lvt2;
      // 08c: goto 093
      // 08f: invokestatic uw1.a (Loov;)Loov;
      // 092: athrow
      // 093: if_acmpeq 09c
      // 096: bipush 0
      // 097: ireturn
      // 098: invokestatic uw1.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 5
      // 09e: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 0a1: if_acmpne 0d2
      // 0a4: aload 3
      // 0a5: getstatic vt2.mxp Lvt2;
      // 0a8: iload 4
      // 0aa: ifeq 0c9
      // 0ad: goto 0b4
      // 0b0: invokestatic uw1.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: if_acmpeq 0d2
      // 0b7: goto 0be
      // 0ba: invokestatic uw1.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 3
      // 0bf: getstatic vt2.z9q Lvt2;
      // 0c2: goto 0c9
      // 0c5: invokestatic uw1.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: if_acmpeq 0d2
      // 0cc: bipush 0
      // 0cd: ireturn
      // 0ce: invokestatic uw1.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 1
      // 0d3: aload 2
      // 0d4: invokevirtual mew.y8e ()Lmew;
      // 0d7: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0dc: invokeinterface zfz.r_y ()Le0x; 1
      // 0e1: aload 0
      // 0e2: iload 4
      // 0e4: ifeq 109
      // 0e7: if_acmpne 114
      // 0ea: goto 0f1
      // 0ed: invokestatic uw1.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: aload 2
      // 0f3: bipush 2
      // 0f4: invokevirtual mew.g52 (I)Lmew;
      // 0f7: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0fc: invokeinterface zfz.r_y ()Le0x; 1
      // 101: aload 0
      // 102: goto 109
      // 105: invokestatic uw1.a (Loov;)Loov;
      // 108: athrow
      // 109: if_acmpeq 114
      // 10c: bipush 1
      // 10d: goto 115
      // 110: invokestatic uw1.a (Loov;)Loov;
      // 113: athrow
      // 114: bipush 0
      // 115: istore 7
      // 117: aload 1
      // 118: aload 2
      // 119: invokevirtual mew.o_8 ()Lmew;
      // 11c: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 121: invokeinterface zfz.r_y ()Le0x; 1
      // 126: aload 0
      // 127: iload 4
      // 129: ifeq 14e
      // 12c: if_acmpne 159
      // 12f: goto 136
      // 132: invokestatic uw1.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 1
      // 137: aload 2
      // 138: bipush 2
      // 139: invokevirtual mew.b20 (I)Lmew;
      // 13c: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 141: invokeinterface zfz.r_y ()Le0x; 1
      // 146: aload 0
      // 147: goto 14e
      // 14a: invokestatic uw1.a (Loov;)Loov;
      // 14d: athrow
      // 14e: if_acmpeq 159
      // 151: bipush 1
      // 152: goto 15a
      // 155: invokestatic uw1.a (Loov;)Loov;
      // 158: athrow
      // 159: bipush 0
      // 15a: istore 8
      // 15c: aload 1
      // 15d: aload 2
      // 15e: invokevirtual mew.idu ()Lmew;
      // 161: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 166: invokeinterface zfz.r_y ()Le0x; 1
      // 16b: aload 0
      // 16c: iload 4
      // 16e: ifeq 193
      // 171: if_acmpne 19e
      // 174: goto 17b
      // 177: invokestatic uw1.a (Loov;)Loov;
      // 17a: athrow
      // 17b: aload 1
      // 17c: aload 2
      // 17d: bipush 2
      // 17e: invokevirtual mew.pzc (I)Lmew;
      // 181: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 186: invokeinterface zfz.r_y ()Le0x; 1
      // 18b: aload 0
      // 18c: goto 193
      // 18f: invokestatic uw1.a (Loov;)Loov;
      // 192: athrow
      // 193: if_acmpeq 19e
      // 196: bipush 1
      // 197: goto 19f
      // 19a: invokestatic uw1.a (Loov;)Loov;
      // 19d: athrow
      // 19e: bipush 0
      // 19f: istore 9
      // 1a1: aload 1
      // 1a2: aload 2
      // 1a3: invokevirtual mew.z6x ()Lmew;
      // 1a6: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 1ab: invokeinterface zfz.r_y ()Le0x; 1
      // 1b0: aload 0
      // 1b1: iload 4
      // 1b3: ifeq 1d8
      // 1b6: if_acmpne 1e3
      // 1b9: goto 1c0
      // 1bc: invokestatic uw1.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: aload 1
      // 1c1: aload 2
      // 1c2: bipush 2
      // 1c3: invokevirtual mew.wfo (I)Lmew;
      // 1c6: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 1cb: invokeinterface zfz.r_y ()Le0x; 1
      // 1d0: aload 0
      // 1d1: goto 1d8
      // 1d4: invokestatic uw1.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: if_acmpeq 1e3
      // 1db: bipush 1
      // 1dc: goto 1e4
      // 1df: invokestatic uw1.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: bipush 0
      // 1e4: istore 10
      // 1e6: iload 7
      // 1e8: iload 4
      // 1ea: ifeq 226
      // 1ed: ifne 21e
      // 1f0: goto 1f7
      // 1f3: invokestatic uw1.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: iload 8
      // 1f9: iload 4
      // 1fb: ifeq 226
      // 1fe: goto 205
      // 201: invokestatic uw1.a (Loov;)Loov;
      // 204: athrow
      // 205: ifne 21e
      // 208: goto 20f
      // 20b: invokestatic uw1.a (Loov;)Loov;
      // 20e: athrow
      // 20f: aload 5
      // 211: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 214: if_acmpne 229
      // 217: goto 21e
      // 21a: invokestatic uw1.a (Loov;)Loov;
      // 21d: athrow
      // 21e: bipush 1
      // 21f: goto 226
      // 222: invokestatic uw1.a (Loov;)Loov;
      // 225: athrow
      // 226: goto 22a
      // 229: bipush 0
      // 22a: istore 11
      // 22c: iload 9
      // 22e: iload 4
      // 230: ifeq 26c
      // 233: ifne 264
      // 236: goto 23d
      // 239: invokestatic uw1.a (Loov;)Loov;
      // 23c: athrow
      // 23d: iload 10
      // 23f: iload 4
      // 241: ifeq 26c
      // 244: goto 24b
      // 247: invokestatic uw1.a (Loov;)Loov;
      // 24a: athrow
      // 24b: ifne 264
      // 24e: goto 255
      // 251: invokestatic uw1.a (Loov;)Loov;
      // 254: athrow
      // 255: aload 5
      // 257: getstatic vt2$y0s.zty Lvt2$y0s;
      // 25a: if_acmpne 26f
      // 25d: goto 264
      // 260: invokestatic uw1.a (Loov;)Loov;
      // 263: athrow
      // 264: bipush 1
      // 265: goto 26c
      // 268: invokestatic uw1.a (Loov;)Loov;
      // 26b: athrow
      // 26c: goto 270
      // 26f: bipush 0
      // 270: istore 12
      // 272: iload 11
      // 274: iload 4
      // 276: ifeq 29b
      // 279: ifeq 299
      // 27c: goto 283
      // 27f: invokestatic uw1.a (Loov;)Loov;
      // 282: athrow
      // 283: aload 3
      // 284: getstatic vt2.te4 Lvt2;
      // 287: if_acmpne 299
      // 28a: goto 291
      // 28d: invokestatic uw1.a (Loov;)Loov;
      // 290: athrow
      // 291: bipush 1
      // 292: goto 303
      // 295: invokestatic uw1.a (Loov;)Loov;
      // 298: athrow
      // 299: iload 11
      // 29b: iload 4
      // 29d: ifeq 2c2
      // 2a0: ifeq 2c0
      // 2a3: goto 2aa
      // 2a6: invokestatic uw1.a (Loov;)Loov;
      // 2a9: athrow
      // 2aa: aload 3
      // 2ab: getstatic vt2.zk4 Lvt2;
      // 2ae: if_acmpne 2c0
      // 2b1: goto 2b8
      // 2b4: invokestatic uw1.a (Loov;)Loov;
      // 2b7: athrow
      // 2b8: bipush 1
      // 2b9: goto 303
      // 2bc: invokestatic uw1.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: iload 12
      // 2c2: iload 4
      // 2c4: ifeq 2e9
      // 2c7: ifeq 2e7
      // 2ca: goto 2d1
      // 2cd: invokestatic uw1.a (Loov;)Loov;
      // 2d0: athrow
      // 2d1: aload 3
      // 2d2: getstatic vt2.z9q Lvt2;
      // 2d5: if_acmpne 2e7
      // 2d8: goto 2df
      // 2db: invokestatic uw1.a (Loov;)Loov;
      // 2de: athrow
      // 2df: bipush 1
      // 2e0: goto 303
      // 2e3: invokestatic uw1.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: iload 12
      // 2e9: ifeq 302
      // 2ec: aload 3
      // 2ed: getstatic vt2.mxp Lvt2;
      // 2f0: if_acmpne 302
      // 2f3: goto 2fa
      // 2f6: invokestatic uw1.a (Loov;)Loov;
      // 2f9: athrow
      // 2fa: bipush 1
      // 2fb: goto 303
      // 2fe: invokestatic uw1.a (Loov;)Loov;
      // 301: athrow
      // 302: bipush 0
      // 303: ireturn
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public w51 w3x() {
      return w51.mem;
   }

   @Override
   public void n9e(OpaquePredicate param1, mew param2, zfz param3, EntityLivingBase param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 4
      // 07: getfield EntityLivingBase.hzp Li2h;
      // 0a: iload 5
      // 0c: ifeq 25
      // 0f: ifnonnull 3a
      // 12: goto 19
      // 15: invokestatic uw1.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 4
      // 1b: getfield EntityLivingBase.wgv Li2h;
      // 1e: goto 25
      // 21: invokestatic uw1.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 5
      // 27: ifeq 36
      // 2a: ifnonnull 3a
      // 2d: goto 34
      // 30: invokestatic uw1.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 4
      // 36: aload 2
      // 37: invokevirtual EntityLivingBase.oie (Lmew;)V
      // 3a: return
   }

   @Override
   public void kyo(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic uw1.b J
      // 003: ldc2_w 139705224088754
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 7
      // 00e: aload 4
      // 010: bipush 100
      // 012: invokevirtual java/util/Random.nextInt (I)I
      // 015: iload 7
      // 017: ifeq 06b
      // 01a: ifne 06a
      // 01d: goto 024
      // 020: invokestatic uw1.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 1
      // 025: aload 2
      // 026: invokevirtual mew.getX ()I
      // 029: i2d
      // 02a: ldc2_w 0.5
      // 02d: dadd
      // 02e: aload 2
      // 02f: invokevirtual mew.getY ()I
      // 032: i2d
      // 033: ldc2_w 0.5
      // 036: dadd
      // 037: aload 2
      // 038: invokevirtual mew.getZ ()I
      // 03b: i2d
      // 03c: ldc2_w 0.5
      // 03f: dadd
      // 040: sipush 9490
      // 043: ldc2_w 5007769389199735536
      // 046: lload 5
      // 048: lxor
      // 049: invokedynamic w (IJ)Ljava/lang/String; bsm=uw1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: nop
      // 04f: ldc 0.5
      // 051: nop
      // 052: aload 4
      // 054: invokevirtual java/util/Random.nextFloat ()F
      // 057: ldc 0.4
      // 059: nop
      // 05a: fmul
      // 05b: ldc 0.8
      // 05d: nop
      // 05e: fadd
      // 05f: bipush 0
      // 060: invokevirtual OpaquePredicate.wd_ (DDDLjava/lang/String;FFZ)V
      // 063: goto 06a
      // 066: invokestatic uw1.a (Loov;)Loov;
      // 069: athrow
      // 06a: bipush 0
      // 06b: istore 8
      // 06d: iload 8
      // 06f: bipush 4
      // 070: if_icmpge 173
      // 073: aload 2
      // 074: invokevirtual mew.getX ()I
      // 077: i2f
      // 078: aload 4
      // 07a: invokevirtual java/util/Random.nextFloat ()F
      // 07d: fadd
      // 07e: f2d
      // 07f: dstore 9
      // 081: aload 2
      // 082: invokevirtual mew.getY ()I
      // 085: i2f
      // 086: aload 4
      // 088: invokevirtual java/util/Random.nextFloat ()F
      // 08b: fadd
      // 08c: f2d
      // 08d: dstore 11
      // 08f: aload 2
      // 090: invokevirtual mew.getZ ()I
      // 093: i2f
      // 094: aload 4
      // 096: invokevirtual java/util/Random.nextFloat ()F
      // 099: fadd
      // 09a: f2d
      // 09b: dstore 13
      // 09d: aload 4
      // 09f: invokevirtual java/util/Random.nextFloat ()F
      // 0a2: f2d
      // 0a3: ldc2_w 0.5
      // 0a6: dsub
      // 0a7: ldc2_w 0.5
      // 0aa: dmul
      // 0ab: dstore 15
      // 0ad: aload 4
      // 0af: invokevirtual java/util/Random.nextFloat ()F
      // 0b2: f2d
      // 0b3: ldc2_w 0.5
      // 0b6: dsub
      // 0b7: ldc2_w 0.5
      // 0ba: dmul
      // 0bb: dstore 17
      // 0bd: aload 4
      // 0bf: invokevirtual java/util/Random.nextFloat ()F
      // 0c2: f2d
      // 0c3: ldc2_w 0.5
      // 0c6: dsub
      // 0c7: ldc2_w 0.5
      // 0ca: dmul
      // 0cb: dstore 19
      // 0cd: aload 4
      // 0cf: bipush 2
      // 0d0: invokevirtual java/util/Random.nextInt (I)I
      // 0d3: bipush 2
      // 0d4: imul
      // 0d5: bipush 1
      // 0d6: isub
      // 0d7: istore 21
      // 0d9: iload 7
      // 0db: ifeq 147
      // 0de: aload 1
      // 0df: aload 2
      // 0e0: invokevirtual mew.y8e ()Lmew;
      // 0e3: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0e6: invokeinterface zfz.r_y ()Le0x; 1
      // 0eb: aload 0
      // 0ec: if_acmpeq 134
      // 0ef: goto 0f6
      // 0f2: invokestatic uw1.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 1
      // 0f7: aload 2
      // 0f8: invokevirtual mew.o_8 ()Lmew;
      // 0fb: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0fe: invokeinterface zfz.r_y ()Le0x; 1
      // 103: aload 0
      // 104: if_acmpeq 134
      // 107: goto 10e
      // 10a: invokestatic uw1.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 2
      // 10f: invokevirtual mew.getX ()I
      // 112: i2d
      // 113: ldc2_w 0.5
      // 116: dadd
      // 117: ldc2_w 0.25
      // 11a: iload 21
      // 11c: i2d
      // 11d: dmul
      // 11e: dadd
      // 11f: dstore 9
      // 121: aload 4
      // 123: invokevirtual java/util/Random.nextFloat ()F
      // 126: fconst_2
      // 127: fmul
      // 128: iload 21
      // 12a: i2f
      // 12b: fmul
      // 12c: f2d
      // 12d: dstore 15
      // 12f: iload 7
      // 131: ifne 155
      // 134: aload 2
      // 135: invokevirtual mew.getZ ()I
      // 138: i2d
      // 139: ldc2_w 0.5
      // 13c: dadd
      // 13d: ldc2_w 0.25
      // 140: iload 21
      // 142: i2d
      // 143: dmul
      // 144: dadd
      // 145: dstore 13
      // 147: aload 4
      // 149: invokevirtual java/util/Random.nextFloat ()F
      // 14c: fconst_2
      // 14d: fmul
      // 14e: iload 21
      // 150: i2f
      // 151: fmul
      // 152: f2d
      // 153: dstore 19
      // 155: aload 1
      // 156: getstatic w_0.t9k Lw_0;
      // 159: dload 9
      // 15b: dload 11
      // 15d: dload 13
      // 15f: dload 15
      // 161: dload 17
      // 163: dload 19
      // 165: bipush 0
      // 166: newarray 10
      // 168: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 16b: iinc 8 1
      // 16e: iload 7
      // 170: ifne 06d
      // 173: return
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return null;
   }

   @Override
   public zfz kig(int var1) {
      zfz var10000;
      zb_ var10001;
      try {
         var10000 = this.l4i();
         var10001 = p3a;
         if ((var1 & 3) == 2) {
            return var10000.zvi(p3a, vt2$y0s.zty);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return var10000.zvi(var10001, vt2$y0s.wvd);
   }

   @Override
   public int hvp(zfz var1) {
      return qkg((vt2$y0s)var1.dil(p3a));
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{p3a});
   }

   public r72$kqk wwx(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic vt2$y0s.zty Lvt2$y0s;
      // 003: astore 4
      // 005: new uw1$e46
      // 008: dup
      // 009: aload 1
      // 00a: aload 2
      // 00b: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 00e: invokespecial uw1$e46.<init> (Lt9d;Lmew;Lvt2$y0s;)V
      // 011: astore 5
      // 013: invokestatic OpaquePredicate.b ()I
      // 016: aload 1
      // 017: bipush 1
      // 018: invokestatic r72.z4i (Lt9d;Z)Lcom/google/common/cache/LoadingCache;
      // 01b: astore 6
      // 01d: istore 3
      // 01e: aload 5
      // 020: invokevirtual uw1$e46.pmy ()Z
      // 023: iload 3
      // 024: ifeq 049
      // 027: ifne 044
      // 02a: goto 031
      // 02d: invokestatic uw1.a (Loov;)Loov;
      // 030: athrow
      // 031: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 034: astore 4
      // 036: new uw1$e46
      // 039: dup
      // 03a: aload 1
      // 03b: aload 2
      // 03c: getstatic vt2$y0s.zty Lvt2$y0s;
      // 03f: invokespecial uw1$e46.<init> (Lt9d;Lmew;Lvt2$y0s;)V
      // 042: astore 5
      // 044: aload 5
      // 046: invokevirtual uw1$e46.pmy ()Z
      // 049: iload 3
      // 04a: ifeq 073
      // 04d: ifne 06f
      // 050: goto 057
      // 053: invokestatic uw1.a (Loov;)Loov;
      // 056: athrow
      // 057: new r72$kqk
      // 05a: dup
      // 05b: aload 2
      // 05c: getstatic vt2.z9q Lvt2;
      // 05f: getstatic vt2.rf3 Lvt2;
      // 062: aload 6
      // 064: bipush 1
      // 065: bipush 1
      // 066: bipush 1
      // 067: invokespecial r72$kqk.<init> (Lmew;Lvt2;Lvt2;Lcom/google/common/cache/LoadingCache;III)V
      // 06a: areturn
      // 06b: invokestatic uw1.a (Loov;)Loov;
      // 06e: athrow
      // 06f: invokestatic vt2$_l8.values ()[Lvt2$_l8;
      // 072: arraylength
      // 073: newarray 10
      // 075: astore 7
      // 077: aload 5
      // 079: invokestatic uw1$e46.wx0 (Luw1$e46;)Lvt2;
      // 07c: invokevirtual vt2.tgw ()Lvt2;
      // 07f: astore 8
      // 081: aload 5
      // 083: invokestatic uw1$e46.cua (Luw1$e46;)Lmew;
      // 086: aload 5
      // 088: invokevirtual uw1$e46.fmk ()I
      // 08b: bipush 1
      // 08c: isub
      // 08d: invokevirtual mew.z89 (I)Lmew;
      // 090: astore 9
      // 092: invokestatic vt2$_l8.values ()[Lvt2$_l8;
      // 095: astore 10
      // 097: aload 10
      // 099: arraylength
      // 09a: istore 11
      // 09c: bipush 0
      // 09d: istore 12
      // 09f: iload 12
      // 0a1: iload 11
      // 0a3: if_icmpge 17f
      // 0a6: aload 10
      // 0a8: iload 12
      // 0aa: aaload
      // 0ab: iload 3
      // 0ac: ifeq 182
      // 0af: astore 13
      // 0b1: new r72$kqk
      // 0b4: dup
      // 0b5: aload 8
      // 0b7: invokevirtual vt2.uqa ()Lvt2$_l8;
      // 0ba: aload 13
      // 0bc: if_acmpne 0c8
      // 0bf: aload 9
      // 0c1: goto 0d9
      // 0c4: invokestatic uw1.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 9
      // 0ca: aload 5
      // 0cc: invokestatic uw1$e46.wx0 (Luw1$e46;)Lvt2;
      // 0cf: aload 5
      // 0d1: invokevirtual uw1$e46.dee ()I
      // 0d4: bipush 1
      // 0d5: isub
      // 0d6: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 0d9: aload 13
      // 0db: aload 4
      // 0dd: invokestatic vt2.sre (Lvt2$_l8;Lvt2$y0s;)Lvt2;
      // 0e0: getstatic vt2.rf3 Lvt2;
      // 0e3: aload 6
      // 0e5: aload 5
      // 0e7: invokevirtual uw1$e46.dee ()I
      // 0ea: aload 5
      // 0ec: invokevirtual uw1$e46.fmk ()I
      // 0ef: bipush 1
      // 0f0: invokespecial r72$kqk.<init> (Lmew;Lvt2;Lvt2;Lcom/google/common/cache/LoadingCache;III)V
      // 0f3: astore 14
      // 0f5: bipush 0
      // 0f6: istore 15
      // 0f8: iload 15
      // 0fa: aload 5
      // 0fc: invokevirtual uw1$e46.dee ()I
      // 0ff: if_icmpge 178
      // 102: bipush 0
      // 103: iload 3
      // 104: ifeq 0a1
      // 107: istore 16
      // 109: iload 16
      // 10b: aload 5
      // 10d: invokevirtual uw1$e46.fmk ()I
      // 110: if_icmpge 171
      // 113: aload 14
      // 115: iload 15
      // 117: iload 16
      // 119: bipush 1
      // 11a: invokevirtual r72$kqk.pfb (III)Ld2q;
      // 11d: astore 17
      // 11f: iload 3
      // 120: ifeq 174
      // 123: iload 3
      // 124: ifeq 16d
      // 127: goto 12e
      // 12a: invokestatic uw1.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 17
      // 130: invokevirtual d2q.uc6 ()Lzfz;
      // 133: ifnull 16a
      // 136: goto 13d
      // 139: invokestatic uw1.a (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 17
      // 13f: invokevirtual d2q.uc6 ()Lzfz;
      // 142: invokeinterface zfz.r_y ()Le0x; 1
      // 147: invokevirtual e0x.p1r ()Lp3y;
      // 14a: getstatic p3y.cei Lp3y;
      // 14d: if_acmpeq 16a
      // 150: goto 157
      // 153: invokestatic uw1.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 7
      // 159: aload 13
      // 15b: invokevirtual vt2$_l8.ordinal ()I
      // 15e: dup2
      // 15f: iaload
      // 160: bipush 1
      // 161: iadd
      // 162: iastore
      // 163: goto 16a
      // 166: invokestatic uw1.a (Loov;)Loov;
      // 169: athrow
      // 16a: iinc 16 1
      // 16d: iload 3
      // 16e: ifne 109
      // 171: iinc 15 1
      // 174: iload 3
      // 175: ifne 0f8
      // 178: iinc 12 1
      // 17b: iload 3
      // 17c: ifne 09f
      // 17f: getstatic vt2$_l8.gdj Lvt2$_l8;
      // 182: astore 10
      // 184: invokestatic vt2$_l8.values ()[Lvt2$_l8;
      // 187: astore 11
      // 189: aload 11
      // 18b: arraylength
      // 18c: istore 12
      // 18e: bipush 0
      // 18f: istore 13
      // 191: iload 13
      // 193: iload 12
      // 195: if_icmpge 1c8
      // 198: aload 11
      // 19a: iload 13
      // 19c: aaload
      // 19d: astore 14
      // 19f: iload 3
      // 1a0: ifeq 1c4
      // 1a3: aload 7
      // 1a5: aload 14
      // 1a7: invokevirtual vt2$_l8.ordinal ()I
      // 1aa: iaload
      // 1ab: aload 7
      // 1ad: aload 10
      // 1af: invokevirtual vt2$_l8.ordinal ()I
      // 1b2: iaload
      // 1b3: if_icmpge 1c1
      // 1b6: goto 1bd
      // 1b9: invokestatic uw1.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: aload 14
      // 1bf: astore 10
      // 1c1: iinc 13 1
      // 1c4: iload 3
      // 1c5: ifne 191
      // 1c8: new r72$kqk
      // 1cb: dup
      // 1cc: aload 8
      // 1ce: invokevirtual vt2.uqa ()Lvt2$_l8;
      // 1d1: aload 10
      // 1d3: if_acmpne 1df
      // 1d6: aload 9
      // 1d8: goto 1f0
      // 1db: invokestatic uw1.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 9
      // 1e1: aload 5
      // 1e3: invokestatic uw1$e46.wx0 (Luw1$e46;)Lvt2;
      // 1e6: aload 5
      // 1e8: invokevirtual uw1$e46.dee ()I
      // 1eb: bipush 1
      // 1ec: isub
      // 1ed: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 1f0: aload 10
      // 1f2: aload 4
      // 1f4: invokestatic vt2.sre (Lvt2$_l8;Lvt2$y0s;)Lvt2;
      // 1f7: getstatic vt2.rf3 Lvt2;
      // 1fa: aload 6
      // 1fc: aload 5
      // 1fe: invokevirtual uw1$e46.dee ()I
      // 201: aload 5
      // 203: invokevirtual uw1$e46.fmk ()I
      // 206: bipush 1
      // 207: invokespecial r72$kqk.<init> (Lmew;Lvt2;Lvt2;Lcom/google/common/cache/LoadingCache;III)V
      // 20a: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6751616350187689448L, -8922592758935598318L, MethodHandles.lookup().lookupClass()).a(272602995304615L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 88468761976410L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u009eõQ·*¡\b¿\u0085C\u0011\u001cng\u0002n å\u000eüjå3ôÙÊéÌÁC¿½\u000fx¼@Ì£\u008b(hî\u008cïå\u0094>ðÏ \u000bÎM§$V¸d\u0080·.{În\u0085\u0001nî\u0090Zd©\u009d¬ß\u0003a\u001a\u009e#¯ò";
      int var6 = "\u009eõQ·*¡\b¿\u0085C\u0011\u001cng\u0002n å\u000eüjå3ôÙÊéÌÁC¿½\u000fx¼@Ì£\u008b(hî\u008cïå\u0094>ðÏ \u000bÎM§$V¸d\u0080·.{În\u0085\u0001nî\u0090Zd©\u009d¬ß\u0003a\u001a\u009e#¯ò"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            p3a = zb_.hye(b<"w">(5753, 1855305118926166898L ^ var9), vt2$y0s.class, new vt2$y0s[]{vt2$y0s.wvd, vt2$y0s.zty});
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5591;
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
            throw new RuntimeException("uw1", var10);
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
         throw new RuntimeException("uw1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
