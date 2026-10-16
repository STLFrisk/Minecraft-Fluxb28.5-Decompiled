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

public class n9n extends ar7 {
   public static c_3 iy8;
   public static crk t_j;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public n9n() {
      long var1 = a ^ 99834539800274L;
      super(b<"o">(10569, 3379621603117498763L ^ var1), _aj.p3z, iy8);
   }

   @jev
   public void vf5(ccn var1) {
      this.n5o(this.m2d() + " " + syo.rl1 + iy8.d7c());
   }

   @jev
   public void srs(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic n9n.a J
      // 003: ldc2_w 98260702737510
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: getstatic n9n.iy8 Lc_3;
      // 010: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 013: sipush 23661
      // 016: ldc2_w 6310659815183070744
      // 019: lload 2
      // 01a: lxor
      // 01b: invokedynamic o (IJ)Ljava/lang/String; bsm=n9n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 024: iload 4
      // 026: ifeq 041
      // 029: ifeq 196
      // 02c: goto 033
      // 02f: invokestatic n9n.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 1
      // 034: invokevirtual wbh.nlg ()Lmz2;
      // 037: instanceof net/minecraft/network/play/server/S12PacketEntityVelocity
      // 03a: goto 041
      // 03d: invokestatic n9n.a (Loov;)Loov;
      // 040: athrow
      // 041: iload 4
      // 043: ifeq 109
      // 046: ifeq 0f6
      // 049: goto 050
      // 04c: invokestatic n9n.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 1
      // 051: invokevirtual wbh.nlg ()Lmz2;
      // 054: checkcast net/minecraft/network/play/server/S12PacketEntityVelocity
      // 057: astore 5
      // 059: aload 5
      // 05b: invokevirtual net/minecraft/network/play/server/S12PacketEntityVelocity.ybp ()I
      // 05e: aload 0
      // 05f: pop
      // 060: iload 4
      // 062: ifeq 109
      // 065: getstatic n9n.ek1 Lc05;
      // 068: getfield c05.vg8 Ll86;
      // 06b: invokevirtual l86.jwu ()I
      // 06e: if_icmpne 0f6
      // 071: goto 078
      // 074: invokestatic n9n.a (Loov;)Loov;
      // 077: athrow
      // 078: getstatic n9n.t_j Lcrk;
      // 07b: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 07e: invokevirtual java/lang/Float.floatValue ()F
      // 081: fconst_0
      // 082: fcmpl
      // 083: ifne 09e
      // 086: goto 08d
      // 089: invokestatic n9n.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 1
      // 08e: bipush 1
      // 08f: invokevirtual wbh.wxi (Z)V
      // 092: iload 4
      // 094: ifne 0f6
      // 097: goto 09e
      // 09a: invokestatic n9n.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 5
      // 0a0: aload 5
      // 0a2: invokevirtual net/minecraft/network/play/server/S12PacketEntityVelocity.ywv ()I
      // 0a5: i2f
      // 0a6: getstatic n9n.t_j Lcrk;
      // 0a9: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 0ac: invokevirtual java/lang/Float.floatValue ()F
      // 0af: fmul
      // 0b0: f2d
      // 0b1: ldc2_w 100.0
      // 0b4: ddiv
      // 0b5: d2i
      // 0b6: invokevirtual net/minecraft/network/play/server/S12PacketEntityVelocity.wzr (I)V
      // 0b9: aload 5
      // 0bb: aload 5
      // 0bd: invokevirtual net/minecraft/network/play/server/S12PacketEntityVelocity.hi3 ()I
      // 0c0: i2f
      // 0c1: getstatic n9n.t_j Lcrk;
      // 0c4: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 0c7: invokevirtual java/lang/Float.floatValue ()F
      // 0ca: fmul
      // 0cb: f2d
      // 0cc: ldc2_w 100.0
      // 0cf: ddiv
      // 0d0: d2i
      // 0d1: invokevirtual net/minecraft/network/play/server/S12PacketEntityVelocity.r6p (I)V
      // 0d4: aload 5
      // 0d6: aload 5
      // 0d8: invokevirtual net/minecraft/network/play/server/S12PacketEntityVelocity.al8 ()I
      // 0db: i2f
      // 0dc: getstatic n9n.t_j Lcrk;
      // 0df: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 0e2: invokevirtual java/lang/Float.floatValue ()F
      // 0e5: fmul
      // 0e6: f2d
      // 0e7: ldc2_w 100.0
      // 0ea: ddiv
      // 0eb: d2i
      // 0ec: invokevirtual net/minecraft/network/play/server/S12PacketEntityVelocity.f5v (I)V
      // 0ef: goto 0f6
      // 0f2: invokestatic n9n.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 1
      // 0f7: invokevirtual wbh.nlg ()Lmz2;
      // 0fa: iload 4
      // 0fc: ifeq 117
      // 0ff: instanceof net/minecraft/network/play/server/S27PacketExplosion
      // 102: goto 109
      // 105: invokestatic n9n.a (Loov;)Loov;
      // 108: athrow
      // 109: ifeq 196
      // 10c: aload 1
      // 10d: invokevirtual wbh.nlg ()Lmz2;
      // 110: goto 117
      // 113: invokestatic n9n.a (Loov;)Loov;
      // 116: athrow
      // 117: checkcast net/minecraft/network/play/server/S27PacketExplosion
      // 11a: astore 5
      // 11c: iload 4
      // 11e: ifeq 17e
      // 121: getstatic n9n.t_j Lcrk;
      // 124: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 127: invokevirtual java/lang/Float.floatValue ()F
      // 12a: fconst_0
      // 12b: fcmpl
      // 12c: ifne 147
      // 12f: goto 136
      // 132: invokestatic n9n.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 1
      // 137: bipush 1
      // 138: invokevirtual wbh.wxi (Z)V
      // 13b: iload 4
      // 13d: ifne 196
      // 140: goto 147
      // 143: invokestatic n9n.a (Loov;)Loov;
      // 146: athrow
      // 147: aload 5
      // 149: aload 5
      // 14b: invokevirtual net/minecraft/network/play/server/S27PacketExplosion.gri ()F
      // 14e: getstatic n9n.t_j Lcrk;
      // 151: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 154: invokevirtual java/lang/Float.floatValue ()F
      // 157: fmul
      // 158: ldc 100.0
      // 15a: nop
      // 15b: fdiv
      // 15c: invokevirtual net/minecraft/network/play/server/S27PacketExplosion.lub (F)V
      // 15f: aload 5
      // 161: aload 5
      // 163: invokevirtual net/minecraft/network/play/server/S27PacketExplosion.jpf ()F
      // 166: getstatic n9n.t_j Lcrk;
      // 169: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 16c: invokevirtual java/lang/Float.floatValue ()F
      // 16f: fmul
      // 170: ldc 100.0
      // 172: nop
      // 173: fdiv
      // 174: invokevirtual net/minecraft/network/play/server/S27PacketExplosion.b1n (F)V
      // 177: goto 17e
      // 17a: invokestatic n9n.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 5
      // 180: aload 5
      // 182: invokevirtual net/minecraft/network/play/server/S27PacketExplosion.dtb ()F
      // 185: getstatic n9n.t_j Lcrk;
      // 188: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 18b: invokevirtual java/lang/Float.floatValue ()F
      // 18e: fmul
      // 18f: ldc 100.0
      // 191: nop
      // 192: fdiv
      // 193: invokevirtual net/minecraft/network/play/server/S27PacketExplosion.cuv (F)V
      // 196: return
   }

   @jev
   public void g65(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic n9n.a J
      // 003: ldc2_w 44206693386537
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: getstatic n9n.iy8 Lc_3;
      // 010: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 013: sipush 9913
      // 016: ldc2_w 266594324060729741
      // 019: lload 2
      // 01a: lxor
      // 01b: invokedynamic o (IJ)Ljava/lang/String; bsm=n9n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 024: iload 4
      // 026: ifeq 043
      // 029: ifeq 13f
      // 02c: goto 033
      // 02f: invokestatic n9n.a (Loov;)Loov;
      // 032: athrow
      // 033: getstatic n9n.ek1 Lc05;
      // 036: getfield c05.vg8 Ll86;
      // 039: getfield l86.gx0 I
      // 03c: goto 043
      // 03f: invokestatic n9n.a (Loov;)Loov;
      // 042: athrow
      // 043: iload 4
      // 045: ifeq 066
      // 048: ifle 13f
      // 04b: goto 052
      // 04e: invokestatic n9n.a (Loov;)Loov;
      // 051: athrow
      // 052: getstatic n9n.ek1 Lc05;
      // 055: getfield c05.vg8 Ll86;
      // 058: getfield l86.o_8 F
      // 05b: ldc 3.0
      // 05d: nop
      // 05e: fcmpg
      // 05f: goto 066
      // 062: invokestatic n9n.a (Loov;)Loov;
      // 065: athrow
      // 066: iload 4
      // 068: ifeq 093
      // 06b: ifge 13f
      // 06e: goto 075
      // 071: invokestatic n9n.a (Loov;)Loov;
      // 074: athrow
      // 075: getstatic n9n.ek1 Lc05;
      // 078: getfield c05.vg8 Ll86;
      // 07b: iload 4
      // 07d: ifeq 123
      // 080: goto 087
      // 083: invokestatic n9n.a (Loov;)Loov;
      // 086: athrow
      // 087: getfield l86.ooc F
      // 08a: fconst_0
      // 08b: fcmpl
      // 08c: goto 093
      // 08f: invokestatic n9n.a (Loov;)Loov;
      // 092: athrow
      // 093: ifne 105
      // 096: getstatic n9n.ek1 Lc05;
      // 099: getfield c05.vg8 Ll86;
      // 09c: iload 4
      // 09e: ifeq 123
      // 0a1: goto 0a8
      // 0a4: invokestatic n9n.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: getfield l86.z66 F
      // 0ab: fconst_0
      // 0ac: fcmpl
      // 0ad: ifne 105
      // 0b0: goto 0b7
      // 0b3: invokestatic n9n.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: getstatic n9n.ek1 Lc05;
      // 0ba: getfield c05.vg8 Ll86;
      // 0bd: dup
      // 0be: getfield l86.mop D
      // 0c1: ldc2_w 1.001
      // 0c4: dsub
      // 0c5: putfield l86.mop D
      // 0c8: getstatic n9n.ek1 Lc05;
      // 0cb: getfield c05.vg8 Ll86;
      // 0ce: dup
      // 0cf: getfield l86.icv D
      // 0d2: ldc2_w 0.2
      // 0d5: dmul
      // 0d6: putfield l86.icv D
      // 0d9: getstatic n9n.ek1 Lc05;
      // 0dc: getfield c05.vg8 Ll86;
      // 0df: dup
      // 0e0: getfield l86.bw4 D
      // 0e3: ldc2_w 0.2
      // 0e6: dmul
      // 0e7: putfield l86.bw4 D
      // 0ea: getstatic n9n.ek1 Lc05;
      // 0ed: getfield c05.vg8 Ll86;
      // 0f0: dup
      // 0f1: getfield l86.mop D
      // 0f4: dconst_1
      // 0f5: dadd
      // 0f6: putfield l86.mop D
      // 0f9: iload 4
      // 0fb: ifne 12e
      // 0fe: goto 105
      // 101: invokestatic n9n.a (Loov;)Loov;
      // 104: athrow
      // 105: getstatic n9n.ek1 Lc05;
      // 108: getfield c05.vg8 Ll86;
      // 10b: dup
      // 10c: getfield l86.icv D
      // 10f: ldc2_w 0.5
      // 112: dmul
      // 113: putfield l86.icv D
      // 116: getstatic n9n.ek1 Lc05;
      // 119: getfield c05.vg8 Ll86;
      // 11c: goto 123
      // 11f: invokestatic n9n.a (Loov;)Loov;
      // 122: athrow
      // 123: dup
      // 124: getfield l86.bw4 D
      // 127: ldc2_w 0.5
      // 12a: dmul
      // 12b: putfield l86.bw4 D
      // 12e: sipush 7726
      // 131: ldc2_w 446310451988187413
      // 134: lload 2
      // 135: lxor
      // 136: invokedynamic o (IJ)Ljava/lang/String; bsm=n9n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: nop
      // 13c: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 13f: return
   }

   @jev
   public void poi(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic n9n.a J
      // 03: ldc2_w 120576185989798
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: getstatic n9n.iy8 Lc_3;
      // 10: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 13: sipush 16933
      // 16: ldc2_w 5600635119677204114
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic o (IJ)Ljava/lang/String; bsm=n9n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24: iload 4
      // 26: ifeq 3b
      // 29: ifne 34
      // 2c: goto 33
      // 2f: invokestatic n9n.a (Loov;)Loov;
      // 32: athrow
      // 33: return
      // 34: aload 1
      // 35: invokevirtual ihr.bbi ()Lmz2;
      // 38: instanceof net/minecraft/network/play/client/C02PacketUseEntity
      // 3b: iload 4
      // 3d: ifeq 61
      // 40: ifeq c7
      // 43: goto 4a
      // 46: invokestatic n9n.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: pop
      // 4c: getstatic n9n.ek1 Lc05;
      // 4f: getfield c05.vg8 Ll86;
      // 52: getfield l86.g9g Lboa;
      // 55: getfield boa._mw F
      // 58: fconst_1
      // 59: fcmpl
      // 5a: goto 61
      // 5d: invokestatic n9n.a (Loov;)Loov;
      // 60: athrow
      // 61: ifne c7
      // 64: aload 1
      // 65: invokevirtual ihr.bbi ()Lmz2;
      // 68: checkcast net/minecraft/network/play/client/C02PacketUseEntity
      // 6b: astore 5
      // 6d: iload 4
      // 6f: ifeq 8d
      // 72: aload 5
      // 74: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity.nf7 ()Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 77: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 7a: if_acmpne c7
      // 7d: goto 84
      // 80: invokestatic n9n.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: pop
      // 86: goto 8d
      // 89: invokestatic n9n.a (Loov;)Loov;
      // 8c: athrow
      // 8d: getstatic n9n.ek1 Lc05;
      // 90: getfield c05.vg8 Ll86;
      // 93: iload 4
      // 95: ifeq b2
      // 98: getfield l86.lfk Z
      // 9b: ifeq c7
      // 9e: goto a5
      // a1: invokestatic n9n.a (Loov;)Loov;
      // a4: athrow
      // a5: getstatic n9n.ek1 Lc05;
      // a8: getfield c05.vg8 Ll86;
      // ab: goto b2
      // ae: invokestatic n9n.a (Loov;)Loov;
      // b1: athrow
      // b2: bipush 1
      // b3: invokevirtual l86.fqc (Z)V
      // b6: sipush 5663
      // b9: ldc2_w 5168454686267028141
      // bc: lload 2
      // bd: lxor
      // be: invokedynamic o (IJ)Ljava/lang/String; bsm=n9n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: nop
      // c4: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // c7: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8860731959059201145L, 7495300821554900589L, MethodHandles.lookup().lookupClass()).a(34543221850325L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 48939435072886L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "Ë,3ÂmúÒÇI\u0010Sl.ì;Ï\u0010:Q\u0084Ë\u0005\u009aKNÄ×PÜ2\u0086|J \u001b\u000f\u008a,\u009bÿ½µ3\u0012/ÇÍæuÇ\u0017êt®\u0018mÂÅdÖªC\rWw©\u0010ñ\u0082uF\u008f1\u009aÚ\u0082*^B\u001e-Ò¦ dõ\räÝ\u0018!@ØÎ\u008be\\\u008cMÞ\u0087\u0002b\u0092ÏßÐB\u0001\u0098é\u0013ò¤\u0095>\u0010\u000e¯ÆãyÕÏ\u008b\u008b|ójÜ\b\u0001Ò\u0018\u00106|¶ãò®\u0013nÑnòÙ\u009b;\u001fËE*\u0011\u0012V\u008f\u0001\u0010\u001a\u0012^)KEn\u0090\u008f;}ü\u0097Ô\u001bH";
      int var6 = "Ë,3ÂmúÒÇI\u0010Sl.ì;Ï\u0010:Q\u0084Ë\u0005\u009aKNÄ×PÜ2\u0086|J \u001b\u000f\u008a,\u009bÿ½µ3\u0012/ÇÍæuÇ\u0017êt®\u0018mÂÅdÖªC\rWw©\u0010ñ\u0082uF\u008f1\u009aÚ\u0082*^B\u001e-Ò¦ dõ\räÝ\u0018!@ØÎ\u008be\\\u008cMÞ\u0087\u0002b\u0092ÏßÐB\u0001\u0098é\u0013ò¤\u0095>\u0010\u000e¯ÆãyÕÏ\u008b\u008b|ójÜ\b\u0001Ò\u0018\u00106|¶ãò®\u0013nÑnòÙ\u009b;\u001fËE*\u0011\u0012V\u008f\u0001\u0010\u001a\u0012^)KEn\u0090\u008f;}ü\u0097Ô\u001bH"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[10];
                     iy8 = new c_3(
                        b<"o">(6467, 4302183540589058595L ^ var9),
                        b<"o">(19844, 3611159230191472357L ^ var9),
                        b<"o">(15420, 653312443035713366L ^ var9),
                        new String[]{b<"o">(16933, 5600563534333247810L ^ var9)}
                     );
                     t_j = new crk(b<"o">(6467, 4302183540589058595L ^ var9), b<"o">(30220, 5662733298064766319L ^ var9), 0.0F, 0.0F, 150.0F, 10.0F, "%");
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "?\u00adÆ\u0015k¼s\u0081h\tx7;ò\u0019<\u0010Ï\u009c¬\u0082\u0003E\u0093\u0084h\u0017ú\u0004å¼ä\u001e";
                  var6 = "?\u00adÆ\u0015k¼s\u0081h\tx7;ò\u0019<\u0010Ï\u009c¬\u0082\u0003E\u0093\u0084h\u0017ú\u0004å¼ä\u001e".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16310;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("n9n", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("n9n" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
