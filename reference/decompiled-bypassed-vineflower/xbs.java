import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xbs extends j1s {
   public boolean d94;
   private int jjh;
   private nhs lns;
   private nhs px1;
   public static List lo6;
   public static List mrm;
   private int xa0;
   private fz2 rl9;
   private boolean spr;
   private float[] gv1;
   public boolean um_;
   public bgc fcl;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public xbs(boolean var1) {
      long var2 = a ^ 91117193923673L;
      super(var1 ? a<"m">(25153, 214370587939655541L ^ var2) : a<"m">(23368, 7942472914465486455L ^ var2), a<"m">(16356, 2176701341014397650L ^ var2));
      this.lns = new nhs();
      this.px1 = new nhs();
      this.fcl = new bgc(110.0F, 120.0F, 30.0F, 40.0F);
      this.d94 = var1;
      mtl.__x(this);
   }

   @Override
   public void w4v() {
      this.xa0 = 0;
      this.gv1 = null;
      super.w4v();
   }

   @Override
   public void i__() {
      super.i__();
      fyk.kmt();
      fyk.f8f = false;
   }

   @jev
   public void rxj(axn var1) {
      try {
         if (fyk.sy_.d7c()) {
            this.d2z(false);
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   public void x9y() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: getstatic xbs.lo6 Ljava/util/List;
      // 07: iload 1
      // 08: ifeq 74
      // 0b: invokeinterface java/util/List.isEmpty ()Z 1
      // 10: ifne 68
      // 13: goto 1a
      // 16: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: getstatic xbs.lo6 Ljava/util/List;
      // 1d: iload 1
      // 1e: ifeq 74
      // 21: goto 28
      // 24: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 2d: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, xbs.q1i (Lg_3;)Z, (Lg_3;)Z ]
      // 32: invokeinterface java/util/stream/Stream.anyMatch (Ljava/util/function/Predicate;)Z 2
      // 37: ifne 68
      // 3a: goto 41
      // 3d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: getstatic xbs.lo6 Ljava/util/List;
      // 44: iload 1
      // 45: ifeq 74
      // 48: goto 4f
      // 4b: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: invokeinterface java/util/List.size ()I 1
      // 54: aload 0
      // 55: bipush 1
      // 56: invokespecial xbs.y6j (Z)Ljava/util/List;
      // 59: invokeinterface java/util/List.size ()I 1
      // 5e: if_icmpeq 77
      // 61: goto 68
      // 64: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 0
      // 69: bipush 1
      // 6a: invokespecial xbs.y6j (Z)Ljava/util/List;
      // 6d: goto 74
      // 70: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: putstatic xbs.lo6 Ljava/util/List;
      // 77: return
   }

   public void u57() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: getstatic xbs.mrm Ljava/util/List;
      // 07: iload 1
      // 08: ifne 74
      // 0b: invokeinterface java/util/List.isEmpty ()Z 1
      // 10: ifne 68
      // 13: goto 1a
      // 16: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: getstatic xbs.mrm Ljava/util/List;
      // 1d: iload 1
      // 1e: ifne 74
      // 21: goto 28
      // 24: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 2d: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, xbs.o1r (Lg_3;)Z, (Lg_3;)Z ]
      // 32: invokeinterface java/util/stream/Stream.anyMatch (Ljava/util/function/Predicate;)Z 2
      // 37: ifne 68
      // 3a: goto 41
      // 3d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: getstatic xbs.mrm Ljava/util/List;
      // 44: iload 1
      // 45: ifne 74
      // 48: goto 4f
      // 4b: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: invokeinterface java/util/List.size ()I 1
      // 54: aload 0
      // 55: bipush 0
      // 56: invokespecial xbs.y6j (Z)Ljava/util/List;
      // 59: invokeinterface java/util/List.size ()I 1
      // 5e: if_icmpeq 77
      // 61: goto 68
      // 64: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 0
      // 69: bipush 0
      // 6a: invokespecial xbs.y6j (Z)Ljava/util/List;
      // 6d: goto 74
      // 70: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: putstatic xbs.mrm Ljava/util/List;
      // 77: return
   }

   public native float[] a3o(i2h var1);

   @jev
   public void nf1(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic xbs.a J
      // 003: ldc2_w 136507348636725
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: getstatic kgt.nd5 Lfyk;
      // 010: getfield fyk.kl3 Lnhs;
      // 013: ldc2_w 50.0
      // 016: invokevirtual nhs.us_ (D)Z
      // 019: iload 4
      // 01b: ifne 039
      // 01e: ifne 029
      // 021: goto 028
      // 024: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: return
      // 029: aload 0
      // 02a: aconst_null
      // 02b: putfield xbs.rl9 Lfz2;
      // 02e: aload 0
      // 02f: bipush 0
      // 030: putfield xbs.spr Z
      // 033: getstatic kgt.irb Lf5k;
      // 036: invokevirtual f5k.klu ()Z
      // 039: iload 4
      // 03b: ifne 067
      // 03e: ifeq 064
      // 041: goto 048
      // 044: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: getstatic f5k.dwu Lcn7;
      // 04b: invokevirtual cn7.g7m ()Z
      // 04e: iload 4
      // 050: ifne 067
      // 053: goto 05a
      // 056: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: ifne 07a
      // 05d: goto 064
      // 060: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: getstatic fyk.qcf Z
      // 067: iload 4
      // 069: ifne 077
      // 06c: ifeq 07a
      // 06f: goto 076
      // 072: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: bipush 1
      // 077: goto 07b
      // 07a: bipush 0
      // 07b: putstatic fyk.f8f Z
      // 07e: iload 4
      // 080: ifne 0cf
      // 083: getstatic fyk.qcf Z
      // 086: ifeq 0c2
      // 089: goto 090
      // 08c: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: bipush 0
      // 091: putstatic fyk.qcf Z
      // 094: aload 0
      // 095: getfield xbs.wyl Lc05;
      // 098: getfield c05.vg8 Ll86;
      // 09b: getfield l86.lq7 Lp_k;
      // 09e: invokevirtual p_k._m3 ()Lhv0;
      // 0a1: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 0a4: dup
      // 0a5: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.md_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 0a8: new mew
      // 0ab: dup
      // 0ac: bipush -1
      // 0ad: bipush -1
      // 0ae: bipush -1
      // 0af: invokespecial mew.<init> (III)V
      // 0b2: getstatic vt2.m3r Lvt2;
      // 0b5: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 0b8: invokevirtual hv0.k7f (Lmz2;)V
      // 0bb: goto 0c2
      // 0be: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: ldc java/lang/String
      // 0c4: nop
      // 0c5: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 0c8: bipush 76
      // 0ca: aaload
      // 0cb: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 0ce: pop
      // 0cf: goto 0dc
      // 0d2: astore 5
      // 0d4: aload 0
      // 0d5: invokevirtual xbs.x9y ()V
      // 0d8: aload 0
      // 0d9: invokevirtual xbs.u57 ()V
      // 0dc: getstatic xbs.lo6 Ljava/util/List;
      // 0df: invokeinterface java/util/List.isEmpty ()Z 1
      // 0e4: iload 4
      // 0e6: ifne 105
      // 0e9: ifeq 101
      // 0ec: goto 0f3
      // 0ef: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: aconst_null
      // 0f4: putstatic fyk.kfa Lg_3;
      // 0f7: aload 0
      // 0f8: aconst_null
      // 0f9: putfield xbs.gv1 [F
      // 0fc: return
      // 0fd: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: aload 0
      // 102: getfield xbs.xa0 I
      // 105: getstatic xbs.lo6 Ljava/util/List;
      // 108: invokeinterface java/util/List.size ()I 1
      // 10d: bipush 1
      // 10e: isub
      // 10f: iload 4
      // 111: ifne 133
      // 114: if_icmple 12a
      // 117: goto 11e
      // 11a: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: aload 0
      // 11f: bipush 0
      // 120: putfield xbs.xa0 I
      // 123: goto 12a
      // 126: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: getstatic xbs.lo6 Ljava/util/List;
      // 12d: invokeinterface java/util/List.size ()I 1
      // 132: bipush 1
      // 133: iload 4
      // 135: ifne 19b
      // 138: if_icmple 181
      // 13b: goto 142
      // 13e: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: aload 0
      // 143: getfield xbs.lns Lnhs;
      // 146: getstatic fyk.q84 Lcrk;
      // 149: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 14c: invokevirtual java/lang/Float.floatValue ()F
      // 14f: f2d
      // 150: invokevirtual nhs.yrv (D)Z
      // 153: iload 4
      // 155: ifne 191
      // 158: goto 15f
      // 15b: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: ifeq 181
      // 162: goto 169
      // 165: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 0
      // 16a: dup
      // 16b: getfield xbs.xa0 I
      // 16e: bipush 1
      // 16f: iadd
      // 170: putfield xbs.xa0 I
      // 173: aload 0
      // 174: getfield xbs.lns Lnhs;
      // 177: invokevirtual nhs.zay ()V
      // 17a: goto 181
      // 17d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 180: athrow
      // 181: aload 0
      // 182: iload 4
      // 184: ifne 1c0
      // 187: getfield xbs.xa0 I
      // 18a: goto 191
      // 18d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: getstatic xbs.lo6 Ljava/util/List;
      // 194: invokeinterface java/util/List.size ()I 1
      // 199: bipush 1
      // 19a: isub
      // 19b: if_icmpgt 1b8
      // 19e: aload 0
      // 19f: iload 4
      // 1a1: ifne 1d7
      // 1a4: goto 1ab
      // 1a7: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1aa: athrow
      // 1ab: getfield xbs.d94 Z
      // 1ae: ifne 1c4
      // 1b1: goto 1b8
      // 1b4: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: goto 1c0
      // 1bc: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: bipush 0
      // 1c1: putfield xbs.xa0 I
      // 1c4: getstatic xbs.lo6 Ljava/util/List;
      // 1c7: aload 0
      // 1c8: getfield xbs.xa0 I
      // 1cb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d0: checkcast g_3
      // 1d3: putstatic fyk.kfa Lg_3;
      // 1d6: aload 0
      // 1d7: getfield xbs.gv1 [F
      // 1da: iload 4
      // 1dc: ifne 224
      // 1df: ifnonnull 211
      // 1e2: goto 1e9
      // 1e5: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: bipush 2
      // 1eb: newarray 6
      // 1ed: dup
      // 1ee: bipush 0
      // 1ef: aload 0
      // 1f0: getfield xbs.wyl Lc05;
      // 1f3: getfield c05.vg8 Ll86;
      // 1f6: getfield l86.x5k F
      // 1f9: fastore
      // 1fa: dup
      // 1fb: bipush 1
      // 1fc: aload 0
      // 1fd: getfield xbs.wyl Lc05;
      // 200: getfield c05.vg8 Ll86;
      // 203: getfield l86.y2i F
      // 206: fastore
      // 207: putfield xbs.gv1 [F
      // 20a: goto 211
      // 20d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: aload 0
      // 212: getstatic xbs.lo6 Ljava/util/List;
      // 215: aload 0
      // 216: getfield xbs.xa0 I
      // 219: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21e: checkcast i2h
      // 221: invokevirtual xbs.a3o (Li2h;)[F
      // 224: astore 5
      // 226: iload 4
      // 228: ifne 267
      // 22b: getstatic fyk.ogx Lcn7;
      // 22e: invokevirtual cn7.g7m ()Z
      // 231: ifeq 26c
      // 234: goto 23b
      // 237: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: aload 1
      // 23c: aload 0
      // 23d: bipush 2
      // 23e: newarray 6
      // 240: dup
      // 241: bipush 0
      // 242: aload 5
      // 244: bipush 0
      // 245: faload
      // 246: f2d
      // 247: ldc2_w -5.0
      // 24a: ldc2_w 5.0
      // 24d: invokestatic fyk.mmr (DD)D
      // 250: dadd
      // 251: d2f
      // 252: fastore
      // 253: dup
      // 254: bipush 1
      // 255: aload 5
      // 257: bipush 1
      // 258: faload
      // 259: fastore
      // 25a: invokevirtual xbs.n9y ([F)[F
      // 25d: invokevirtual fz2.cqr ([F)V
      // 260: goto 267
      // 263: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 266: athrow
      // 267: iload 4
      // 269: ifeq 445
      // 26c: ldc 180.0
      // 26e: nop
      // 26f: getstatic fyk.bxq Lcrk;
      // 272: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 275: invokevirtual java/lang/Float.floatValue ()F
      // 278: fconst_2
      // 279: fdiv
      // 27a: fsub
      // 27b: fstore 6
      // 27d: getstatic fyk.kfa Lg_3;
      // 280: astore 7
      // 282: aload 7
      // 284: getfield i2h.kfp D
      // 287: aload 0
      // 288: getfield xbs.wyl Lc05;
      // 28b: getfield c05.vg8 Ll86;
      // 28e: getfield l86.kfp D
      // 291: dsub
      // 292: invokestatic java/lang/Math.abs (D)D
      // 295: ldc2_w 1.8
      // 298: iload 4
      // 29a: ifne 2e9
      // 29d: dcmpl
      // 29e: ifle 2da
      // 2a1: goto 2a8
      // 2a4: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a7: athrow
      // 2a8: aload 7
      // 2aa: getfield i2h.kfp D
      // 2ad: aload 0
      // 2ae: getfield xbs.wyl Lc05;
      // 2b1: getfield c05.vg8 Ll86;
      // 2b4: getfield l86.kfp D
      // 2b7: dsub
      // 2b8: invokestatic java/lang/Math.abs (D)D
      // 2bb: aload 7
      // 2bd: getfield i2h.kfp D
      // 2c0: aload 0
      // 2c1: getfield xbs.wyl Lc05;
      // 2c4: getfield c05.vg8 Ll86;
      // 2c7: getfield l86.kfp D
      // 2ca: dsub
      // 2cb: invokestatic java/lang/Math.abs (D)D
      // 2ce: ddiv
      // 2cf: ldc2_w 2.0
      // 2d2: ddiv
      // 2d3: goto 2ed
      // 2d6: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d9: athrow
      // 2da: aload 7
      // 2dc: getfield i2h.kfp D
      // 2df: aload 0
      // 2e0: getfield xbs.wyl Lc05;
      // 2e3: getfield c05.vg8 Ll86;
      // 2e6: getfield l86.kfp D
      // 2e9: dsub
      // 2ea: invokestatic java/lang/Math.abs (D)D
      // 2ed: dstore 8
      // 2ef: new tt9
      // 2f2: dup
      // 2f3: aload 7
      // 2f5: invokevirtual i2h.aaw ()Lnh4;
      // 2f8: getfield nh4.rlc D
      // 2fb: aload 7
      // 2fd: invokevirtual i2h.aaw ()Lnh4;
      // 300: getfield nh4.t_2 D
      // 303: aload 7
      // 305: invokevirtual i2h.aaw ()Lnh4;
      // 308: getfield nh4.rlc D
      // 30b: dsub
      // 30c: ldc2_w 2.0
      // 30f: ddiv
      // 310: dadd
      // 311: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 314: aload 7
      // 316: instanceof _gj
      // 319: ifne 32b
      // 31c: aload 7
      // 31e: instanceof u10
      // 321: ifeq 341
      // 324: goto 32b
      // 327: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: aload 7
      // 32d: invokevirtual i2h.aaw ()Lnh4;
      // 330: getfield nh4.bx_ D
      // 333: aload 7
      // 335: invokevirtual i2h.c5y ()F
      // 338: f2d
      // 339: ldc2_w 1.2
      // 33c: dmul
      // 33d: dsub
      // 33e: goto 346
      // 341: aload 7
      // 343: getfield i2h.kfp D
      // 346: dload 8
      // 348: dsub
      // 349: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 34c: aload 7
      // 34e: invokevirtual i2h.aaw ()Lnh4;
      // 351: getfield nh4.t8n D
      // 354: aload 7
      // 356: invokevirtual i2h.aaw ()Lnh4;
      // 359: getfield nh4.oqj D
      // 35c: aload 7
      // 35e: invokevirtual i2h.aaw ()Lnh4;
      // 361: getfield nh4.t8n D
      // 364: dsub
      // 365: ldc2_w 2.0
      // 368: ddiv
      // 369: dadd
      // 36a: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 36d: invokespecial tt9.<init> (Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
      // 370: astore 10
      // 372: new tt9
      // 375: dup
      // 376: aload 0
      // 377: getfield xbs.wyl Lc05;
      // 37a: getfield c05.vg8 Ll86;
      // 37d: invokevirtual l86.aaw ()Lnh4;
      // 380: getfield nh4.rlc D
      // 383: aload 0
      // 384: getfield xbs.wyl Lc05;
      // 387: getfield c05.vg8 Ll86;
      // 38a: invokevirtual l86.aaw ()Lnh4;
      // 38d: getfield nh4.t_2 D
      // 390: aload 0
      // 391: getfield xbs.wyl Lc05;
      // 394: getfield c05.vg8 Ll86;
      // 397: invokevirtual l86.aaw ()Lnh4;
      // 39a: getfield nh4.rlc D
      // 39d: dsub
      // 39e: ldc2_w 2.0
      // 3a1: ddiv
      // 3a2: dadd
      // 3a3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3a6: aload 0
      // 3a7: getfield xbs.wyl Lc05;
      // 3aa: getfield c05.vg8 Ll86;
      // 3ad: getfield l86.kfp D
      // 3b0: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3b3: aload 0
      // 3b4: getfield xbs.wyl Lc05;
      // 3b7: getfield c05.vg8 Ll86;
      // 3ba: invokevirtual l86.aaw ()Lnh4;
      // 3bd: getfield nh4.t8n D
      // 3c0: aload 0
      // 3c1: getfield xbs.wyl Lc05;
      // 3c4: getfield c05.vg8 Ll86;
      // 3c7: invokevirtual l86.aaw ()Lnh4;
      // 3ca: getfield nh4.oqj D
      // 3cd: aload 0
      // 3ce: getfield xbs.wyl Lc05;
      // 3d1: getfield c05.vg8 Ll86;
      // 3d4: invokevirtual l86.aaw ()Lnh4;
      // 3d7: getfield nh4.t8n D
      // 3da: dsub
      // 3db: ldc2_w 2.0
      // 3de: ddiv
      // 3df: dadd
      // 3e0: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3e3: invokespecial tt9.<init> (Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
      // 3e6: astore 11
      // 3e8: new bb_
      // 3eb: dup
      // 3ec: aload 0
      // 3ed: getfield xbs.gv1 [F
      // 3f0: bipush 0
      // 3f1: faload
      // 3f2: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3f5: aload 0
      // 3f6: getfield xbs.gv1 [F
      // 3f9: bipush 1
      // 3fa: faload
      // 3fb: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3fe: invokespecial bb_.<init> (Ljava/lang/Float;Ljava/lang/Float;)V
      // 401: astore 12
      // 403: aload 0
      // 404: getfield xbs.fcl Lbgc;
      // 407: aload 10
      // 409: aload 11
      // 40b: invokevirtual bgc.tzp (Ltt9;Ltt9;)Lbb_;
      // 40e: astore 13
      // 410: aload 0
      // 411: getfield xbs.fcl Lbgc;
      // 414: aload 13
      // 416: aload 12
      // 418: fload 6
      // 41a: fload 6
      // 41c: invokevirtual bgc.sj0 (Lbb_;Lbb_;FF)Lbb_;
      // 41f: astore 14
      // 421: aload 1
      // 422: aload 14
      // 424: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 427: invokevirtual java/lang/Float.floatValue ()F
      // 42a: f2d
      // 42b: ldc2_w -4.0
      // 42e: ldc2_w 4.0
      // 431: invokestatic fyk.mmr (DD)D
      // 434: dadd
      // 435: d2f
      // 436: invokevirtual fz2.h8j (F)V
      // 439: aload 1
      // 43a: aload 14
      // 43c: invokevirtual bb_.jub ()Ljava/lang/Float;
      // 43f: invokevirtual java/lang/Float.floatValue ()F
      // 442: invokevirtual fz2.ni7 (F)V
      // 445: aload 0
      // 446: bipush 2
      // 447: newarray 6
      // 449: dup
      // 44a: bipush 0
      // 44b: aload 1
      // 44c: getfield fz2.hoc F
      // 44f: fastore
      // 450: dup
      // 451: bipush 1
      // 452: aload 1
      // 453: getfield fz2.iq9 F
      // 456: fastore
      // 457: putfield xbs.gv1 [F
      // 45a: aload 0
      // 45b: iload 4
      // 45d: ifne 5c7
      // 460: getfield xbs.spr Z
      // 463: ifne 5c1
      // 466: goto 46d
      // 469: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46c: athrow
      // 46d: getstatic kgt.p9k Lv3p;
      // 470: invokevirtual v3p.klu ()Z
      // 473: iload 4
      // 475: ifne 4a7
      // 478: goto 47f
      // 47b: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47e: athrow
      // 47f: ifeq 5c1
      // 482: goto 489
      // 485: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 488: athrow
      // 489: getstatic v3p.tsd Lc_3;
      // 48c: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 48f: sipush 31264
      // 492: ldc2_w 7228901686795702141
      // 495: lload 2
      // 496: lxor
      // 497: invokedynamic m (IJ)Ljava/lang/String; bsm=xbs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49c: nop
      // 49d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a0: goto 4a7
      // 4a3: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a6: athrow
      // 4a7: iload 4
      // 4a9: ifne 4b9
      // 4ac: ifeq 5c1
      // 4af: goto 4b6
      // 4b2: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b5: athrow
      // 4b6: invokestatic bk4._t6 ()Z
      // 4b9: iload 4
      // 4bb: ifne 4e7
      // 4be: ifeq 5c1
      // 4c1: goto 4c8
      // 4c4: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c7: athrow
      // 4c8: aload 0
      // 4c9: iload 4
      // 4cb: ifne 5c7
      // 4ce: goto 4d5
      // 4d1: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d4: athrow
      // 4d5: getfield xbs.px1 Lnhs;
      // 4d8: aload 0
      // 4d9: getfield xbs.jjh I
      // 4dc: i2d
      // 4dd: invokevirtual nhs.yrv (D)Z
      // 4e0: goto 4e7
      // 4e3: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e6: athrow
      // 4e7: ifeq 5c1
      // 4ea: getstatic kgt.kd6 Lohv;
      // 4ed: invokevirtual ohv.klu ()Z
      // 4f0: iload 4
      // 4f2: ifne 513
      // 4f5: goto 4fc
      // 4f8: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fb: athrow
      // 4fc: ifne 5c1
      // 4ff: goto 506
      // 502: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 505: athrow
      // 506: getstatic kgt.obu Li4o;
      // 509: invokevirtual i4o.klu ()Z
      // 50c: goto 513
      // 50f: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 512: athrow
      // 513: iload 4
      // 515: ifne 52f
      // 518: ifne 5c1
      // 51b: goto 522
      // 51e: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 521: athrow
      // 522: getstatic kgt.thz L_lk;
      // 525: invokevirtual _lk.klu ()Z
      // 528: goto 52f
      // 52b: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52e: athrow
      // 52f: iload 4
      // 531: ifne 562
      // 534: ifne 5c1
      // 537: goto 53e
      // 53a: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53d: athrow
      // 53e: getstatic xbs.lo6 Ljava/util/List;
      // 541: aload 0
      // 542: getfield xbs.xa0 I
      // 545: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 54a: checkcast g_3
      // 54d: getfield g_3.qqi I
      // 550: i2f
      // 551: getstatic v3p.h9b Lcrk;
      // 554: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 557: invokevirtual java/lang/Float.floatValue ()F
      // 55a: fcmpg
      // 55b: goto 562
      // 55e: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 561: athrow
      // 562: iload 4
      // 564: ifne 581
      // 567: ifgt 5c1
      // 56a: goto 571
      // 56d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 570: athrow
      // 571: getstatic v3p.ubl Lq6h;
      // 574: ldc2_w 200.0
      // 577: invokevirtual q6h.hqu (D)Z
      // 57a: goto 581
      // 57d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 580: athrow
      // 581: iload 4
      // 583: ifne 593
      // 586: ifeq 5c1
      // 589: goto 590
      // 58c: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58f: athrow
      // 590: invokestatic q0r.fsj ()Z
      // 593: iload 4
      // 595: ifne 5b2
      // 598: ifne 5b5
      // 59b: goto 5a2
      // 59e: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a1: athrow
      // 5a2: getstatic v3p.ubl Lq6h;
      // 5a5: ldc2_w 800.0
      // 5a8: invokevirtual q6h.hqu (D)Z
      // 5ab: goto 5b2
      // 5ae: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b1: athrow
      // 5b2: ifeq 5c1
      // 5b5: aload 0
      // 5b6: bipush 1
      // 5b7: putfield xbs.spr Z
      // 5ba: goto 5c1
      // 5bd: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c0: athrow
      // 5c1: aload 0
      // 5c2: aload 1
      // 5c3: putfield xbs.rl9 Lfz2;
      // 5c6: aload 0
      // 5c7: aload 0
      // 5c8: getfield xbs.px1 Lnhs;
      // 5cb: aload 0
      // 5cc: getfield xbs.jjh I
      // 5cf: i2d
      // 5d0: invokevirtual nhs.yrv (D)Z
      // 5d3: iload 4
      // 5d5: ifne 628
      // 5d8: ifne 627
      // 5db: goto 5e2
      // 5de: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e1: athrow
      // 5e2: getstatic fyk.u2o Lcrk;
      // 5e5: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 5e8: invokevirtual java/lang/Float.floatValue ()F
      // 5eb: ldc 15.0
      // 5ed: nop
      // 5ee: fcmpl
      // 5ef: iload 4
      // 5f1: ifne 618
      // 5f4: goto 5fb
      // 5f7: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5fa: athrow
      // 5fb: ifne 62b
      // 5fe: goto 605
      // 601: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 604: athrow
      // 605: aload 0
      // 606: getfield xbs.wyl Lc05;
      // 609: getfield c05.vg8 Ll86;
      // 60c: getfield l86.g25 I
      // 60f: bipush 3
      // 610: irem
      // 611: goto 618
      // 614: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 617: athrow
      // 618: iload 4
      // 61a: ifne 628
      // 61d: ifne 62b
      // 620: goto 627
      // 623: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 626: athrow
      // 627: bipush 1
      // 628: goto 62c
      // 62b: bipush 0
      // 62c: putfield xbs.um_ Z
      // 62f: return
   }

   @jev
   public void rzy(gnk var1) {
      this.spr = false;
   }

   @jev
   public void o_a(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: getstatic kgt.nd5 Lfyk;
      // 007: getfield fyk.kl3 Lnhs;
      // 00a: ldc2_w 50.0
      // 00d: invokevirtual nhs.us_ (D)Z
      // 010: ifne 018
      // 013: return
      // 014: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: getfield xbs.rl9 Lfz2;
      // 01c: ifnull 137
      // 01f: invokestatic v3p.eit ()Z
      // 022: iload 2
      // 023: ifne 140
      // 026: goto 02d
      // 029: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: ifne 137
      // 030: goto 037
      // 033: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 0
      // 038: getfield xbs.um_ Z
      // 03b: iload 2
      // 03c: ifne 140
      // 03f: goto 046
      // 042: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: ifeq 137
      // 049: goto 050
      // 04c: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 0
      // 051: ldc2_w 1000.0
      // 054: getstatic fyk.u2o Lcrk;
      // 057: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 05a: invokevirtual java/lang/Float.floatValue ()F
      // 05d: f2d
      // 05e: ldc2_w -1.0
      // 061: dconst_1
      // 062: invokestatic fyk.mmr (DD)D
      // 065: dadd
      // 066: ddiv
      // 067: d2i
      // 068: putfield xbs.jjh I
      // 06b: aload 0
      // 06c: getfield xbs.px1 Lnhs;
      // 06f: invokevirtual nhs.zay ()V
      // 072: getstatic xbs.lo6 Ljava/util/List;
      // 075: aload 0
      // 076: getfield xbs.xa0 I
      // 079: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 07e: checkcast g_3
      // 081: astore 3
      // 082: aload 0
      // 083: getfield xbs.spr Z
      // 086: iload 2
      // 087: ifne 0fa
      // 08a: ifeq 0d7
      // 08d: goto 094
      // 090: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: getstatic kgt.y2a Lixd;
      // 097: invokevirtual ixd.klu ()Z
      // 09a: iload 2
      // 09b: ifne 0fa
      // 09e: goto 0a5
      // 0a1: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: ifeq 0d7
      // 0a8: goto 0af
      // 0ab: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: getstatic kgt.y2a Lixd;
      // 0b2: pop
      // 0b3: getstatic ixd.rje Z
      // 0b6: iload 2
      // 0b7: ifne 0fa
      // 0ba: goto 0c1
      // 0bd: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: ifeq 0d7
      // 0c4: goto 0cb
      // 0c7: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: bipush 0
      // 0cd: putfield xbs.spr Z
      // 0d0: goto 0d7
      // 0d3: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: getfield xbs.wyl Lc05;
      // 0db: getfield c05.vg8 Ll86;
      // 0de: getstatic xbs.lo6 Ljava/util/List;
      // 0e1: aload 0
      // 0e2: getfield xbs.xa0 I
      // 0e5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ea: checkcast i2h
      // 0ed: invokevirtual l86.tm6 (Li2h;)F
      // 0f0: getstatic fyk.w1a Lcrk;
      // 0f3: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 0f6: invokevirtual java/lang/Float.floatValue ()F
      // 0f9: fcmpg
      // 0fa: iload 2
      // 0fb: ifne 140
      // 0fe: ifgt 137
      // 101: goto 108
      // 104: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 0
      // 109: iload 2
      // 10a: ifne 129
      // 10d: goto 114
      // 110: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: getfield xbs.spr Z
      // 117: ifeq 133
      // 11a: goto 121
      // 11d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: aload 0
      // 122: goto 129
      // 125: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: bipush 0
      // 12a: putfield xbs.spr Z
      // 12d: getstatic kgt.p9k Lv3p;
      // 130: invokevirtual v3p.hgk ()V
      // 133: aload 3
      // 134: invokestatic fyk.hpe (Lg_3;)V
      // 137: getstatic fyk.s4u Lcn7;
      // 13a: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 13d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 140: iload 2
      // 141: ifne 15d
      // 144: ifeq 24d
      // 147: goto 14e
      // 14a: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: getstatic xbs.mrm Ljava/util/List;
      // 151: invokeinterface java/util/List.size ()I 1
      // 156: goto 15d
      // 159: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15c: athrow
      // 15d: iload 2
      // 15e: ifne 16e
      // 161: ifle 24d
      // 164: goto 16b
      // 167: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: invokestatic amb.gcw ()Z
      // 16e: iload 2
      // 16f: ifne 17f
      // 172: ifeq 24d
      // 175: goto 17c
      // 178: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: getstatic fyk.qcf Z
      // 17f: iload 2
      // 180: ifne 19c
      // 183: ifne 24d
      // 186: goto 18d
      // 189: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: getstatic xbs.lo6 Ljava/util/List;
      // 190: invokeinterface java/util/List.size ()I 1
      // 195: goto 19c
      // 198: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: iload 2
      // 19d: ifne 24a
      // 1a0: ifeq 211
      // 1a3: goto 1aa
      // 1a6: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: getstatic xbs.lo6 Ljava/util/List;
      // 1ad: aload 0
      // 1ae: getfield xbs.xa0 I
      // 1b1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1b6: checkcast g_3
      // 1b9: aload 0
      // 1ba: getfield xbs.wyl Lc05;
      // 1bd: getfield c05.vg8 Ll86;
      // 1c0: invokevirtual g_3.gq6 (Li2h;)Z
      // 1c3: iload 2
      // 1c4: ifne 203
      // 1c7: goto 1ce
      // 1ca: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cd: athrow
      // 1ce: ifeq 1f6
      // 1d1: goto 1d8
      // 1d4: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: getstatic xbs.lo6 Ljava/util/List;
      // 1db: invokeinterface java/util/List.size ()I 1
      // 1e0: iload 2
      // 1e1: ifne 24a
      // 1e4: goto 1eb
      // 1e7: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: bipush 1
      // 1ec: if_icmple 211
      // 1ef: goto 1f6
      // 1f2: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f5: athrow
      // 1f6: getstatic fyk.qa6 Lcn7;
      // 1f9: invokevirtual cn7.g7m ()Z
      // 1fc: goto 203
      // 1ff: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 202: athrow
      // 203: iload 2
      // 204: ifne 24a
      // 207: ifeq 24d
      // 20a: goto 211
      // 20d: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: aload 0
      // 212: getfield xbs.wyl Lc05;
      // 215: getfield c05.vg8 Ll86;
      // 218: getfield l86.lq7 Lp_k;
      // 21b: invokevirtual p_k._m3 ()Lhv0;
      // 21e: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
      // 221: dup
      // 222: new mew
      // 225: dup
      // 226: bipush -1
      // 227: bipush -1
      // 228: bipush -1
      // 229: invokespecial mew.<init> (III)V
      // 22c: sipush 255
      // 22f: aload 0
      // 230: getfield xbs.wyl Lc05;
      // 233: getfield c05.vg8 Ll86;
      // 236: invokevirtual l86.tsc ()Lerg;
      // 239: fconst_0
      // 23a: fconst_0
      // 23b: fconst_0
      // 23c: invokespecial net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.<init> (Lmew;ILerg;FFF)V
      // 23f: invokevirtual hv0.k7f (Lmz2;)V
      // 242: bipush 1
      // 243: goto 24a
      // 246: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 249: athrow
      // 24a: putstatic fyk.qcf Z
      // 24d: return
   }

   public float[] n9y(float[] var1) {
      float var2 = this.wyl.oxn.igw * 0.6F + 0.2F;
      float var3 = var2 * var2 * var2 * 1.2F;
      return new float[]{var1[0] - var1[0] % var3, var1[1] - var1[1] % var3};
   }

   public static float ovr(float var0, float var1) {
      int var2 = t9d.b();
      float var3 = Math.abs(var0 - var1) % 360.0F;

      try {
         if (var2 == 0) {
            return var3;
         }

         if (!(var3 > 180.0F)) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return 0.0F;
   }

   private List y6j(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic xbs.a J
      // 003: ldc2_w 62032319242736
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield xbs.wyl Lc05;
      // 011: getfield c05.tij Lkh3;
      // 014: getfield kh3.guf Ljava/util/List;
      // 017: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 01c: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, xbs.lgc (Li2h;)Z, (Li2h;)Z ]
      // 021: iload 4
      // 023: ifeq 04c
      // 026: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 02b: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, xbs.h1s (Li2h;)Lg_3;, (Li2h;)Lg_3; ]
      // 030: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 035: iload 1
      // 036: ifeq 04f
      // 039: goto 040
      // 03c: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, fyk.x64 (Lg_3;)Z, (Lg_3;)Z ]
      // 045: goto 04c
      // 048: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: goto 054
      // 04f: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, fyk.g20 (Lg_3;)Z, (Lg_3;)Z ]
      // 054: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 059: astore 5
      // 05b: getstatic fyk.qiz Lc_3;
      // 05e: sipush 368
      // 061: ldc2_w 5572325547030069739
      // 064: lload 2
      // 065: lxor
      // 066: invokedynamic m (IJ)Ljava/lang/String; bsm=xbs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: nop
      // 06c: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 06f: iload 4
      // 071: ifeq 0af
      // 074: ifeq 094
      // 077: goto 07e
      // 07a: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 5
      // 080: invokedynamic applyAsInt ()Ljava/util/function/ToIntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)I, xbs._7p (Lg_3;)I, (Lg_3;)I ]
      // 085: invokestatic java/util/Comparator.comparingInt (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
      // 088: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 08d: astore 5
      // 08f: iload 4
      // 091: ifne 189
      // 094: getstatic fyk.qiz Lc_3;
      // 097: sipush 22418
      // 09a: ldc2_w 3725159387563038475
      // 09d: lload 2
      // 09e: lxor
      // 09f: invokedynamic m (IJ)Ljava/lang/String; bsm=xbs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: nop
      // 0a5: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 0a8: goto 0af
      // 0ab: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: iload 4
      // 0b1: ifeq 0ed
      // 0b4: ifeq 0d2
      // 0b7: goto 0be
      // 0ba: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: aload 5
      // 0c0: aload 0
      // 0c1: invokedynamic compare (Lxbs;)Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, xbs.s7v (Lg_3;Lg_3;)I, (Lg_3;Lg_3;)I ]
      // 0c6: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 0cb: astore 5
      // 0cd: iload 4
      // 0cf: ifne 189
      // 0d2: getstatic fyk.qiz Lc_3;
      // 0d5: sipush 21446
      // 0d8: ldc2_w 8178358499672200028
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic m (IJ)Ljava/lang/String; bsm=xbs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 0e6: goto 0ed
      // 0e9: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: iload 4
      // 0ef: ifeq 12e
      // 0f2: ifeq 113
      // 0f5: goto 0fc
      // 0f8: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 5
      // 0fe: aload 0
      // 0ff: invokedynamic applyAsDouble (Lxbs;)Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, xbs.jy2 (Lg_3;)D, (Lg_3;)D ]
      // 104: invokestatic java/util/Comparator.comparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
      // 107: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 10c: astore 5
      // 10e: iload 4
      // 110: ifne 189
      // 113: getstatic fyk.qiz Lc_3;
      // 116: sipush 24920
      // 119: ldc2_w 9167131456105292230
      // 11c: lload 2
      // 11d: lxor
      // 11e: invokedynamic m (IJ)Ljava/lang/String; bsm=xbs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: nop
      // 124: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 127: goto 12e
      // 12a: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: iload 4
      // 130: ifeq 178
      // 133: ifeq 151
      // 136: goto 13d
      // 139: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: aload 5
      // 13f: aload 0
      // 140: invokedynamic compare (Lxbs;)Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, xbs.tyn (Lg_3;Lg_3;)I, (Lg_3;Lg_3;)I ]
      // 145: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 14a: astore 5
      // 14c: iload 4
      // 14e: ifne 189
      // 151: getstatic fyk.qiz Lc_3;
      // 154: iload 4
      // 156: ifeq 193
      // 159: goto 160
      // 15c: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: sipush 23886
      // 163: ldc2_w 8789491523106184658
      // 166: lload 2
      // 167: lxor
      // 168: invokedynamic m (IJ)Ljava/lang/String; bsm=xbs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 171: goto 178
      // 174: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: ifeq 189
      // 17b: aload 5
      // 17d: invokedynamic compare ()Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, xbs.dr3 (Lg_3;Lg_3;)I, (Lg_3;Lg_3;)I ]
      // 182: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 187: astore 5
      // 189: aload 5
      // 18b: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // 18e: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 193: checkcast java/util/List
      // 196: astore 6
      // 198: aload 6
      // 19a: bipush 0
      // 19b: aload 6
      // 19d: invokeinterface java/util/List.size ()I 1
      // 1a2: getstatic fyk.kog Lcrk;
      // 1a5: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 1a8: invokevirtual java/lang/Float.intValue ()I
      // 1ab: invokestatic java/lang/Math.min (II)I
      // 1ae: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 1b3: areturn
   }

   private static int dr3(g_3 var0, g_3 var1) {
      return (int)(var0.i55() - var1.i55());
   }

   private int tyn(g_3 var1, g_3 var2) {
      float[] var3 = this.a3o(var1);
      float[] var4 = this.a3o(var2);
      return (int)(this.wyl.vg8.x5k - var3[0] - (this.wyl.vg8.x5k - var4[0]));
   }

   private double jy2(g_3 var1) {
      return (double)ovr(this.wyl.vg8.y2i, this.a3o(var1)[0]);
   }

   private int s7v(g_3 var1, g_3 var2) {
      return (int)(var1.tm6(this.wyl.vg8) - var2.tm6(this.wyl.vg8));
   }

   private static int _7p(g_3 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 28
      // 09: instanceof ha9
      // 0c: ifeq 27
      // 0f: goto 16
      // 12: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast ha9
      // 1a: getfield ha9.up_ Ljnq;
      // 1d: invokevirtual jnq.tth ()I
      // 20: goto 2c
      // 23: invokestatic xbs.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 0
      // 28: invokevirtual g_3.i55 ()F
      // 2b: f2i
      // 2c: ireturn
   }

   private static g_3 h1s(i2h var0) {
      return (g_3)var0;
   }

   private static boolean lgc(i2h var0) {
      return var0 instanceof g_3;
   }

   private static boolean o1r(g_3 var0) {
      int var1 = t9d.c();

      try {
         boolean var10000 = fyk.b6k(var0, (double)fyk.vto.d7c().floatValue());
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   private static boolean q1i(g_3 var0) {
      int var1 = t9d.b();

      try {
         boolean var10000 = fyk.b6k(var0, (double)fyk.w1a.d7c().floatValue());
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1406723422060489602L, -363114966906198426L, MethodHandles.lookup().lookupClass()).a(112275625703456L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 109356566443939L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0082\u0081XÒy«·\t}\\4Ý¸:uD\u0018ù²w-Õ\u0013\u0090\u00ad!\\ÿ\u0095¾½\u009bFUÃ\u000e\u0003e\"\u0000ô\u0010MÄ\u0085\u00818HÿÓiÓu\u008bé³Jf\u0010\nLòîk \f¨î\n\u000f¥z÷Ïa\u0010É\u008e|±ìñ\u0001éâ\u0086÷\u009cet°\t\u0010eÊB\u0005@>sÔÿ¾8Ùþ\u0095¡\u0016\u0010`¡\u0005R\u008e½d\u0015J\u009fÓ±n\u001dî=";
      int var8 = "\u0082\u0081XÒy«·\t}\\4Ý¸:uD\u0018ù²w-Õ\u0013\u0090\u00ad!\\ÿ\u0095¾½\u009bFUÃ\u000e\u0003e\"\u0000ô\u0010MÄ\u0085\u00818HÿÓiÓu\u008bé³Jf\u0010\nLòîk \f¨î\n\u000f¥z÷Ïa\u0010É\u008e|±ìñ\u0001éâ\u0086÷\u009cet°\t\u0010eÊB\u0005@>sÔÿ¾8Ùþ\u0095¡\u0016\u0010`¡\u0005R\u008e½d\u0015J\u009fÓ±n\u001dî="
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[9];
                     v6ma.Ex(5);
                     lo6 = new ArrayList();
                     mrm = new ArrayList();
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

                  var6 = "ô;BEW*üèW¬¿9óÒ\u0085\u009f\u0010¹Å\u0083ãG\u0012ÜT÷¯\u0093T\u0015òGÜ";
                  var8 = "ô;BEW*üèW¬¿9óÒ\u0085\u009f\u0010¹Å\u0083ãG\u0012ÜT÷¯\u0093T\u0015òGÜ".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8413;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("xbs", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("xbs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
