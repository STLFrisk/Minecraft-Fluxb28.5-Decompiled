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
import org.apache.logging.log4j.LogManager;

public class nvf extends EntityLivingBase {
   public float _19 = (float)(Math.random() * Math.PI * 2.0);
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public nvf(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1);
      this.yxc(0.25F, 0.25F);
      this.m6_(var2, var4, var6);
      this.x5k = (float)(Math.random() * 360.0);
      this.icv = (double)((float)(Math.random() * 0.2F - 0.1F));
      this.mop = 0.2F;
      this.bw4 = (double)((float)(Math.random() * 0.2F - 0.1F));
   }

   public nvf(OpaquePredicate var1, double var2, double var4, double var6, erg var8) {
      this(var1, var2, var4, var6);
      this.p5c(var8);
   }

   @Override
   public boolean _p9() {
      return false;
   }

   public nvf(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.25F, 0.25F);
      this.p5c(new erg(ox_.ibw, 0));
   }

   @Override
   public void tbj() {
      this.a0c()._i_(10, 5);
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nvf.b J
      // 003: ldc2_w 94356175846201
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: iload 3
      // 00e: ifne 039
      // 011: invokevirtual nvf.s7f ()Lerg;
      // 014: ifnonnull 02d
      // 017: goto 01e
      // 01a: invokestatic nvf.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: invokevirtual nvf._kl ()V
      // 022: iload 3
      // 023: ifeq 2fc
      // 026: goto 02d
      // 029: invokestatic nvf.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 0
      // 02e: invokespecial EntityLivingBase.xx_ ()V
      // 031: aload 0
      // 032: goto 039
      // 035: invokestatic nvf.a (Loov;)Loov;
      // 038: athrow
      // 039: getfield nvf.vrm I
      // 03c: iload 3
      // 03d: ifne 0d3
      // 040: ifle 077
      // 043: goto 04a
      // 046: invokestatic nvf.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: getfield nvf.vrm I
      // 04e: sipush 32767
      // 051: iload 3
      // 052: ifne 0e3
      // 055: goto 05c
      // 058: invokestatic nvf.a (Loov;)Loov;
      // 05b: athrow
      // 05c: if_icmpeq 077
      // 05f: goto 066
      // 062: invokestatic nvf.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: dup
      // 068: getfield nvf.vrm I
      // 06b: bipush 1
      // 06c: isub
      // 06d: putfield nvf.vrm I
      // 070: goto 077
      // 073: invokestatic nvf.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: aload 0
      // 079: getfield nvf.o2v D
      // 07c: putfield nvf.bc1 D
      // 07f: aload 0
      // 080: aload 0
      // 081: getfield nvf.kfp D
      // 084: putfield nvf.o_z D
      // 087: aload 0
      // 088: aload 0
      // 089: getfield nvf.vbd D
      // 08c: putfield nvf.a4d D
      // 08f: aload 0
      // 090: dup
      // 091: getfield nvf.mop D
      // 094: ldc2_w 0.03999999910593033
      // 097: dsub
      // 098: putfield nvf.mop D
      // 09b: aload 0
      // 09c: aload 0
      // 09d: aload 0
      // 09e: getfield nvf.o2v D
      // 0a1: aload 0
      // 0a2: invokevirtual nvf.aaw ()Lnh4;
      // 0a5: getfield nh4.bx_ D
      // 0a8: aload 0
      // 0a9: invokevirtual nvf.aaw ()Lnh4;
      // 0ac: getfield nh4.i2c D
      // 0af: dadd
      // 0b0: ldc2_w 2.0
      // 0b3: ddiv
      // 0b4: aload 0
      // 0b5: getfield nvf.vbd D
      // 0b8: invokevirtual nvf.vwl (DDD)Z
      // 0bb: putfield nvf.kvx Z
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield nvf.icv D
      // 0c3: aload 0
      // 0c4: getfield nvf.mop D
      // 0c7: aload 0
      // 0c8: getfield nvf.bw4 D
      // 0cb: invokevirtual nvf.vjj (DDD)V
      // 0ce: aload 0
      // 0cf: getfield nvf.bc1 D
      // 0d2: d2i
      // 0d3: iload 3
      // 0d4: ifne 12c
      // 0d7: aload 0
      // 0d8: getfield nvf.o2v D
      // 0db: d2i
      // 0dc: goto 0e3
      // 0df: invokestatic nvf.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: if_icmpne 124
      // 0e6: aload 0
      // 0e7: getfield nvf.o_z D
      // 0ea: d2i
      // 0eb: iload 3
      // 0ec: ifne 12c
      // 0ef: goto 0f6
      // 0f2: invokestatic nvf.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: getfield nvf.kfp D
      // 0fa: d2i
      // 0fb: if_icmpne 124
      // 0fe: goto 105
      // 101: invokestatic nvf.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: getfield nvf.a4d D
      // 109: d2i
      // 10a: iload 3
      // 10b: ifne 12c
      // 10e: goto 115
      // 111: invokestatic nvf.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 0
      // 116: getfield nvf.vbd D
      // 119: d2i
      // 11a: if_icmpeq 12f
      // 11d: goto 124
      // 120: invokestatic nvf.a (Loov;)Loov;
      // 123: athrow
      // 124: bipush 1
      // 125: goto 12c
      // 128: invokestatic nvf.a (Loov;)Loov;
      // 12b: athrow
      // 12c: goto 130
      // 12f: bipush 0
      // 130: istore 4
      // 132: iload 4
      // 134: iload 3
      // 135: ifne 15b
      // 138: ifne 15e
      // 13b: goto 142
      // 13e: invokestatic nvf.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: iload 3
      // 144: ifne 15f
      // 147: goto 14e
      // 14a: invokestatic nvf.a (Loov;)Loov;
      // 14d: athrow
      // 14e: getfield nvf.g25 I
      // 151: bipush 25
      // 153: irem
      // 154: goto 15b
      // 157: invokestatic nvf.a (Loov;)Loov;
      // 15a: athrow
      // 15b: ifne 1ff
      // 15e: aload 0
      // 15f: getfield nvf.oay Lt9d;
      // 162: iload 3
      // 163: ifne 1ee
      // 166: new mew
      // 169: dup
      // 16a: aload 0
      // 16b: invokespecial mew.<init> (Li2h;)V
      // 16e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 171: invokeinterface zfz.r_y ()Le0x; 1
      // 176: invokevirtual e0x.p1r ()Lp3y;
      // 179: getstatic p3y.e1s Lp3y;
      // 17c: if_acmpne 1df
      // 17f: goto 186
      // 182: invokestatic nvf.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 0
      // 187: ldc2_w 0.20000000298023224
      // 18a: putfield nvf.mop D
      // 18d: aload 0
      // 18e: aload 0
      // 18f: getfield nvf.z2d Ljava/util/Random;
      // 192: invokevirtual java/util/Random.nextFloat ()F
      // 195: aload 0
      // 196: getfield nvf.z2d Ljava/util/Random;
      // 199: invokevirtual java/util/Random.nextFloat ()F
      // 19c: fsub
      // 19d: ldc 0.2
      // 19f: nop
      // 1a0: fmul
      // 1a1: f2d
      // 1a2: putfield nvf.icv D
      // 1a5: aload 0
      // 1a6: aload 0
      // 1a7: getfield nvf.z2d Ljava/util/Random;
      // 1aa: invokevirtual java/util/Random.nextFloat ()F
      // 1ad: aload 0
      // 1ae: getfield nvf.z2d Ljava/util/Random;
      // 1b1: invokevirtual java/util/Random.nextFloat ()F
      // 1b4: fsub
      // 1b5: ldc 0.2
      // 1b7: nop
      // 1b8: fmul
      // 1b9: f2d
      // 1ba: putfield nvf.bw4 D
      // 1bd: aload 0
      // 1be: sipush 22253
      // 1c1: ldc2_w 8962656093470843104
      // 1c4: lload 1
      // 1c5: lxor
      // 1c6: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: nop
      // 1cc: ldc 0.4
      // 1ce: nop
      // 1cf: fconst_2
      // 1d0: aload 0
      // 1d1: getfield nvf.z2d Ljava/util/Random;
      // 1d4: invokevirtual java/util/Random.nextFloat ()F
      // 1d7: ldc 0.4
      // 1d9: nop
      // 1da: fmul
      // 1db: fadd
      // 1dc: invokevirtual nvf.lhu (Ljava/lang/String;FF)V
      // 1df: aload 0
      // 1e0: iload 3
      // 1e1: ifne 1fc
      // 1e4: getfield nvf.oay Lt9d;
      // 1e7: goto 1ee
      // 1ea: invokestatic nvf.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: getfield OpaquePredicate.v0f Z
      // 1f1: ifne 1ff
      // 1f4: aload 0
      // 1f5: goto 1fc
      // 1f8: invokestatic nvf.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: invokespecial nvf.f1c ()V
      // 1ff: ldc 0.98
      // 201: nop
      // 202: fstore 5
      // 204: aload 0
      // 205: getfield nvf.lfk Z
      // 208: iload 3
      // 209: ifne 274
      // 20c: ifeq 24c
      // 20f: goto 216
      // 212: invokestatic nvf.a (Loov;)Loov;
      // 215: athrow
      // 216: aload 0
      // 217: getfield nvf.oay Lt9d;
      // 21a: new mew
      // 21d: dup
      // 21e: aload 0
      // 21f: getfield nvf.o2v D
      // 222: invokestatic fe6.jqf (D)I
      // 225: aload 0
      // 226: invokevirtual nvf.aaw ()Lnh4;
      // 229: getfield nh4.bx_ D
      // 22c: invokestatic fe6.jqf (D)I
      // 22f: bipush 1
      // 230: isub
      // 231: aload 0
      // 232: getfield nvf.vbd D
      // 235: invokestatic fe6.jqf (D)I
      // 238: invokespecial mew.<init> (III)V
      // 23b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 23e: invokeinterface zfz.r_y ()Le0x; 1
      // 243: getfield e0x.t50 F
      // 246: ldc 0.98
      // 248: nop
      // 249: fmul
      // 24a: fstore 5
      // 24c: aload 0
      // 24d: dup
      // 24e: getfield nvf.icv D
      // 251: fload 5
      // 253: f2d
      // 254: dmul
      // 255: putfield nvf.icv D
      // 258: aload 0
      // 259: dup
      // 25a: getfield nvf.mop D
      // 25d: ldc2_w 0.9800000190734863
      // 260: dmul
      // 261: putfield nvf.mop D
      // 264: aload 0
      // 265: dup
      // 266: getfield nvf.bw4 D
      // 269: fload 5
      // 26b: f2d
      // 26c: dmul
      // 26d: putfield nvf.bw4 D
      // 270: aload 0
      // 271: getfield nvf.lfk Z
      // 274: iload 3
      // 275: ifne 299
      // 278: ifeq 295
      // 27b: goto 282
      // 27e: invokestatic nvf.a (Loov;)Loov;
      // 281: athrow
      // 282: aload 0
      // 283: dup
      // 284: getfield nvf.mop D
      // 287: ldc2_w -0.5
      // 28a: dmul
      // 28b: putfield nvf.mop D
      // 28e: goto 295
      // 291: invokestatic nvf.a (Loov;)Loov;
      // 294: athrow
      // 295: aload 0
      // 296: getfield nvf.t3w I
      // 299: iload 3
      // 29a: ifne 2c7
      // 29d: sipush -32768
      // 2a0: if_icmpeq 2bb
      // 2a3: goto 2aa
      // 2a6: invokestatic nvf.a (Loov;)Loov;
      // 2a9: athrow
      // 2aa: aload 0
      // 2ab: dup
      // 2ac: getfield nvf.t3w I
      // 2af: bipush 1
      // 2b0: iadd
      // 2b1: putfield nvf.t3w I
      // 2b4: goto 2bb
      // 2b7: invokestatic nvf.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: aload 0
      // 2bc: invokevirtual nvf.r24 ()Z
      // 2bf: pop
      // 2c0: aload 0
      // 2c1: getfield nvf.oay Lt9d;
      // 2c4: getfield OpaquePredicate.v0f Z
      // 2c7: iload 3
      // 2c8: ifne 2eb
      // 2cb: ifne 2fc
      // 2ce: goto 2d5
      // 2d1: invokestatic nvf.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: iload 3
      // 2d7: ifne 2f9
      // 2da: goto 2e1
      // 2dd: invokestatic nvf.a (Loov;)Loov;
      // 2e0: athrow
      // 2e1: getfield nvf.t3w I
      // 2e4: goto 2eb
      // 2e7: invokestatic nvf.a (Loov;)Loov;
      // 2ea: athrow
      // 2eb: sipush 6000
      // 2ee: if_icmplt 2fc
      // 2f1: aload 0
      // 2f2: goto 2f9
      // 2f5: invokestatic nvf.a (Loov;)Loov;
      // 2f8: athrow
      // 2f9: invokevirtual nvf._kl ()V
      // 2fc: return
   }

   private void f1c() {
      int var1 = OpaquePredicate.b();

      for (nvf var3 : this.oay.m_z(nvf.class, this.aaw().c2h(0.5, 0.0, 0.5))) {
         this.dos(var3);
         if (var1 == 0) {
            break;
         }
      }
   }

   private boolean dos(nvf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 01b
      // 009: aload 0
      // 00a: if_acmpne 01a
      // 00d: goto 014
      // 010: invokestatic nvf.a (Loov;)Loov;
      // 013: athrow
      // 014: bipush 0
      // 015: ireturn
      // 016: invokestatic nvf.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 1
      // 01b: invokevirtual nvf.gzr ()Z
      // 01e: iload 2
      // 01f: ifne 209
      // 022: ifeq 208
      // 025: goto 02c
      // 028: invokestatic nvf.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: invokevirtual nvf.gzr ()Z
      // 030: iload 2
      // 031: ifne 209
      // 034: goto 03b
      // 037: invokestatic nvf.a (Loov;)Loov;
      // 03a: athrow
      // 03b: ifeq 208
      // 03e: goto 045
      // 041: invokestatic nvf.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: invokevirtual nvf.s7f ()Lerg;
      // 049: astore 3
      // 04a: aload 1
      // 04b: invokevirtual nvf.s7f ()Lerg;
      // 04e: astore 4
      // 050: aload 0
      // 051: getfield nvf.vrm I
      // 054: iload 2
      // 055: ifne 207
      // 058: sipush 32767
      // 05b: if_icmpeq 206
      // 05e: goto 065
      // 061: invokestatic nvf.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 1
      // 066: getfield nvf.vrm I
      // 069: iload 2
      // 06a: ifne 207
      // 06d: goto 074
      // 070: invokestatic nvf.a (Loov;)Loov;
      // 073: athrow
      // 074: sipush 32767
      // 077: if_icmpeq 206
      // 07a: goto 081
      // 07d: invokestatic nvf.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 0
      // 082: getfield nvf.t3w I
      // 085: iload 2
      // 086: ifne 205
      // 089: goto 090
      // 08c: invokestatic nvf.a (Loov;)Loov;
      // 08f: athrow
      // 090: sipush -32768
      // 093: if_icmpeq 204
      // 096: goto 09d
      // 099: invokestatic nvf.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 1
      // 09e: getfield nvf.t3w I
      // 0a1: iload 2
      // 0a2: ifne 205
      // 0a5: goto 0ac
      // 0a8: invokestatic nvf.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: sipush -32768
      // 0af: if_icmpeq 204
      // 0b2: goto 0b9
      // 0b5: invokestatic nvf.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: iload 2
      // 0bc: ifne 0df
      // 0bf: goto 0c6
      // 0c2: invokestatic nvf.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: invokevirtual erg.gn1 ()Lu7m;
      // 0c9: aload 3
      // 0ca: invokevirtual erg.gn1 ()Lu7m;
      // 0cd: if_acmpeq 0dd
      // 0d0: goto 0d7
      // 0d3: invokestatic nvf.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: bipush 0
      // 0d8: ireturn
      // 0d9: invokestatic nvf.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 4
      // 0df: invokevirtual erg.w8b ()Z
      // 0e2: aload 3
      // 0e3: invokevirtual erg.w8b ()Z
      // 0e6: ixor
      // 0e7: iload 2
      // 0e8: ifne 10b
      // 0eb: ifeq 0fb
      // 0ee: goto 0f5
      // 0f1: invokestatic nvf.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: bipush 0
      // 0f6: ireturn
      // 0f7: invokestatic nvf.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 4
      // 0fd: iload 2
      // 0fe: ifne 137
      // 101: invokevirtual erg.w8b ()Z
      // 104: goto 10b
      // 107: invokestatic nvf.a (Loov;)Loov;
      // 10a: athrow
      // 10b: ifeq 135
      // 10e: aload 4
      // 110: iload 2
      // 111: ifne 137
      // 114: goto 11b
      // 117: invokestatic nvf.a (Loov;)Loov;
      // 11a: athrow
      // 11b: invokevirtual erg.zso ()Lbdo;
      // 11e: aload 3
      // 11f: invokevirtual erg.zso ()Lbdo;
      // 122: invokevirtual bdo.equals (Ljava/lang/Object;)Z
      // 125: ifne 135
      // 128: goto 12f
      // 12b: invokestatic nvf.a (Loov;)Loov;
      // 12e: athrow
      // 12f: bipush 0
      // 130: ireturn
      // 131: invokestatic nvf.a (Loov;)Loov;
      // 134: athrow
      // 135: aload 4
      // 137: invokevirtual erg.gn1 ()Lu7m;
      // 13a: iload 2
      // 13b: ifne 153
      // 13e: ifnonnull 14e
      // 141: goto 148
      // 144: invokestatic nvf.a (Loov;)Loov;
      // 147: athrow
      // 148: bipush 0
      // 149: ireturn
      // 14a: invokestatic nvf.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 4
      // 150: invokevirtual erg.gn1 ()Lu7m;
      // 153: invokevirtual u7m.ekn ()Z
      // 156: iload 2
      // 157: ifne 18d
      // 15a: ifeq 188
      // 15d: goto 164
      // 160: invokestatic nvf.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 4
      // 166: invokevirtual erg.j6_ ()I
      // 169: aload 3
      // 16a: invokevirtual erg.j6_ ()I
      // 16d: iload 2
      // 16e: ifne 191
      // 171: goto 178
      // 174: invokestatic nvf.a (Loov;)Loov;
      // 177: athrow
      // 178: if_icmpeq 188
      // 17b: goto 182
      // 17e: invokestatic nvf.a (Loov;)Loov;
      // 181: athrow
      // 182: bipush 0
      // 183: ireturn
      // 184: invokestatic nvf.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 4
      // 18a: getfield erg.qd2 I
      // 18d: aload 3
      // 18e: getfield erg.qd2 I
      // 191: iload 2
      // 192: ifne 1c3
      // 195: if_icmpge 1a9
      // 198: goto 19f
      // 19b: invokestatic nvf.a (Loov;)Loov;
      // 19e: athrow
      // 19f: aload 1
      // 1a0: aload 0
      // 1a1: invokespecial nvf.dos (Lnvf;)Z
      // 1a4: ireturn
      // 1a5: invokestatic nvf.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: aload 4
      // 1ab: getfield erg.qd2 I
      // 1ae: aload 3
      // 1af: getfield erg.qd2 I
      // 1b2: iadd
      // 1b3: iload 2
      // 1b4: ifne 203
      // 1b7: aload 4
      // 1b9: invokevirtual erg.h4s ()I
      // 1bc: goto 1c3
      // 1bf: invokestatic nvf.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: if_icmple 1cc
      // 1c6: bipush 0
      // 1c7: ireturn
      // 1c8: invokestatic nvf.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 4
      // 1ce: dup
      // 1cf: getfield erg.qd2 I
      // 1d2: aload 3
      // 1d3: getfield erg.qd2 I
      // 1d6: iadd
      // 1d7: putfield erg.qd2 I
      // 1da: aload 1
      // 1db: aload 1
      // 1dc: getfield nvf.vrm I
      // 1df: aload 0
      // 1e0: getfield nvf.vrm I
      // 1e3: invokestatic java/lang/Math.max (II)I
      // 1e6: putfield nvf.vrm I
      // 1e9: aload 1
      // 1ea: aload 1
      // 1eb: getfield nvf.t3w I
      // 1ee: aload 0
      // 1ef: getfield nvf.t3w I
      // 1f2: invokestatic java/lang/Math.min (II)I
      // 1f5: putfield nvf.t3w I
      // 1f8: aload 1
      // 1f9: aload 4
      // 1fb: invokevirtual nvf.p5c (Lerg;)V
      // 1fe: aload 0
      // 1ff: invokevirtual nvf._kl ()V
      // 202: bipush 1
      // 203: ireturn
      // 204: bipush 0
      // 205: ireturn
      // 206: bipush 0
      // 207: ireturn
      // 208: bipush 0
      // 209: ireturn
   }

   public void mk5() {
      this.t3w = 4800;
   }

   @Override
   public boolean r24() {
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
      // 06: ifeq 6f
      // 09: getfield nvf.oay Lt9d;
      // 0c: aload 0
      // 0d: invokevirtual nvf.aaw ()Lnh4;
      // 10: getstatic p3y.six Lp3y;
      // 13: aload 0
      // 14: invokevirtual OpaquePredicate.jqj (Lnh4;Lp3y;Li2h;)Z
      // 17: ifeq 67
      // 1a: goto 21
      // 1d: invokestatic nvf.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: iload 1
      // 23: ifeq 5f
      // 26: goto 2d
      // 29: invokestatic nvf.a (Loov;)Loov;
      // 2c: athrow
      // 2d: getfield nvf.x7a Z
      // 30: ifne 5e
      // 33: goto 3a
      // 36: invokestatic nvf.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: ifeq 5f
      // 3f: goto 46
      // 42: invokestatic nvf.a (Loov;)Loov;
      // 45: athrow
      // 46: getfield nvf.jwh Z
      // 49: ifne 5e
      // 4c: goto 53
      // 4f: invokestatic nvf.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: invokevirtual nvf.qw8 ()V
      // 57: goto 5e
      // 5a: invokestatic nvf.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: bipush 1
      // 60: putfield nvf.x7a Z
      // 63: iload 1
      // 64: ifne 73
      // 67: aload 0
      // 68: goto 6f
      // 6b: invokestatic nvf.a (Loov;)Loov;
      // 6e: athrow
      // 6f: bipush 0
      // 70: putfield nvf.x7a Z
      // 73: aload 0
      // 74: getfield nvf.x7a Z
      // 77: ireturn
   }

   @Override
   public void esk(int var1) {
      this.m1t(ofh.pho, (float)var1);
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 1e
      // 09: aload 1
      // 0a: invokevirtual nvf.nss (Lofh;)Z
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic nvf.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic nvf.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: iload 3
      // 1f: ifeq 7e
      // 22: invokevirtual nvf.s7f ()Lerg;
      // 25: ifnull 6d
      // 28: goto 2f
      // 2b: invokestatic nvf.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 3
      // 31: ifeq 7e
      // 34: goto 3b
      // 37: invokestatic nvf.a (Loov;)Loov;
      // 3a: athrow
      // 3b: invokevirtual nvf.s7f ()Lerg;
      // 3e: invokevirtual erg.gn1 ()Lu7m;
      // 41: getstatic xbr.ctl Lu7m;
      // 44: if_acmpne 6d
      // 47: goto 4e
      // 4a: invokestatic nvf.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 1
      // 4f: invokevirtual ofh.yto ()Z
      // 52: iload 3
      // 53: ifeq 81
      // 56: goto 5d
      // 59: invokestatic nvf.a (Loov;)Loov;
      // 5c: athrow
      // 5d: ifeq 6d
      // 60: goto 67
      // 63: invokestatic nvf.a (Loov;)Loov;
      // 66: athrow
      // 67: bipush 0
      // 68: ireturn
      // 69: invokestatic nvf.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: invokevirtual nvf.dxm ()V
      // 71: aload 0
      // 72: aload 0
      // 73: getfield nvf.kfk I
      // 76: i2f
      // 77: fload 2
      // 78: fsub
      // 79: f2i
      // 7a: putfield nvf.kfk I
      // 7d: aload 0
      // 7e: getfield nvf.kfk I
      // 81: iload 3
      // 82: ifeq 9b
      // 85: ifgt 9a
      // 88: goto 8f
      // 8b: invokestatic nvf.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 0
      // 90: invokevirtual nvf._kl ()V
      // 93: goto 9a
      // 96: invokestatic nvf.a (Loov;)Loov;
      // 99: athrow
      // 9a: bipush 0
      // 9b: ireturn
   }

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvf.b J
      // 03: ldc2_w 87371008432663
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: sipush 11171
      // 0c: ldc2_w 7320427215580445825
      // 0f: lload 2
      // 10: lxor
      // 11: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: nop
      // 17: aload 0
      // 18: getfield nvf.kfk I
      // 1b: i2b
      // 1c: i2s
      // 1d: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 20: invokestatic OpaquePredicate.b ()I
      // 23: aload 1
      // 24: sipush 19834
      // 27: ldc2_w 3166715708033030738
      // 2a: lload 2
      // 2b: lxor
      // 2c: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: aload 0
      // 33: getfield nvf.t3w I
      // 36: i2s
      // 37: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 3a: aload 1
      // 3b: sipush 1974
      // 3e: ldc2_w 1401847598572179609
      // 41: lload 2
      // 42: lxor
      // 43: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: nop
      // 49: aload 0
      // 4a: getfield nvf.vrm I
      // 4d: i2s
      // 4e: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 51: istore 4
      // 53: aload 0
      // 54: invokevirtual nvf.c_3 ()Ljava/lang/String;
      // 57: iload 4
      // 59: ifeq 93
      // 5c: ifnull 83
      // 5f: goto 66
      // 62: invokestatic nvf.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 1
      // 67: sipush 18907
      // 6a: ldc2_w 4529596139249819381
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: nop
      // 75: aload 0
      // 76: getfield nvf.apq Ljava/lang/String;
      // 79: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 7c: goto 83
      // 7f: invokestatic nvf.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 0
      // 84: iload 4
      // 86: ifeq b4
      // 89: invokevirtual nvf.fad ()Ljava/lang/String;
      // 8c: goto 93
      // 8f: invokestatic nvf.a (Loov;)Loov;
      // 92: athrow
      // 93: ifnull b3
      // 96: aload 1
      // 97: sipush 24242
      // 9a: ldc2_w 2528910962363550103
      // 9d: lload 2
      // 9e: lxor
      // 9f: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: nop
      // a5: aload 0
      // a6: getfield nvf.psi Ljava/lang/String;
      // a9: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // ac: goto b3
      // af: invokestatic nvf.a (Loov;)Loov;
      // b2: athrow
      // b3: aload 0
      // b4: invokevirtual nvf.s7f ()Lerg;
      // b7: ifnull e1
      // ba: aload 1
      // bb: sipush 8832
      // be: ldc2_w 1830145182938641831
      // c1: lload 2
      // c2: lxor
      // c3: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: nop
      // c9: aload 0
      // ca: invokevirtual nvf.s7f ()Lerg;
      // cd: new bdo
      // d0: dup
      // d1: invokespecial bdo.<init> ()V
      // d4: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // d7: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // da: goto e1
      // dd: invokestatic nvf.a (Loov;)Loov;
      // e0: athrow
      // e1: return
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nvf.b J
      // 003: ldc2_w 63603645658812
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 25207
      // 00d: ldc2_w 5534648864069753340
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 01b: sipush 255
      // 01e: iand
      // 01f: putfield nvf.kfk I
      // 022: invokestatic OpaquePredicate.b ()I
      // 025: aload 0
      // 026: aload 1
      // 027: sipush 3297
      // 02a: ldc2_w 6652448653176272747
      // 02d: lload 2
      // 02e: lxor
      // 02f: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: nop
      // 035: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 038: putfield nvf.t3w I
      // 03b: istore 4
      // 03d: aload 1
      // 03e: sipush 23065
      // 041: ldc2_w 8325161709494641048
      // 044: lload 2
      // 045: lxor
      // 046: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: nop
      // 04c: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 04f: iload 4
      // 051: ifeq 08d
      // 054: ifeq 07b
      // 057: goto 05e
      // 05a: invokestatic nvf.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 1
      // 060: sipush 23065
      // 063: ldc2_w 8325161709494641048
      // 066: lload 2
      // 067: lxor
      // 068: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: nop
      // 06e: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 071: putfield nvf.vrm I
      // 074: goto 07b
      // 077: invokestatic nvf.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 1
      // 07c: sipush 332
      // 07f: ldc2_w 3360677795530898126
      // 082: lload 2
      // 083: lxor
      // 084: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: nop
      // 08a: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 08d: iload 4
      // 08f: ifeq 0d7
      // 092: ifeq 0b9
      // 095: goto 09c
      // 098: invokestatic nvf.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 0
      // 09d: aload 1
      // 09e: sipush 332
      // 0a1: ldc2_w 3360677795530898126
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: nop
      // 0ac: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0af: putfield nvf.psi Ljava/lang/String;
      // 0b2: goto 0b9
      // 0b5: invokestatic nvf.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: sipush 20121
      // 0bd: ldc2_w 5925789796767610114
      // 0c0: lload 2
      // 0c1: lxor
      // 0c2: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: iload 4
      // 0ca: ifeq 106
      // 0cd: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 0d0: goto 0d7
      // 0d3: invokestatic nvf.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: ifeq 0f7
      // 0da: aload 0
      // 0db: aload 1
      // 0dc: sipush 20121
      // 0df: ldc2_w 5925789796767610114
      // 0e2: lload 2
      // 0e3: lxor
      // 0e4: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: nop
      // 0ea: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0ed: putfield nvf.apq Ljava/lang/String;
      // 0f0: goto 0f7
      // 0f3: invokestatic nvf.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 1
      // 0f8: sipush 15123
      // 0fb: ldc2_w 8196217027868835988
      // 0fe: lload 2
      // 0ff: lxor
      // 100: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: nop
      // 106: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 109: astore 5
      // 10b: aload 0
      // 10c: aload 5
      // 10e: invokestatic erg.qog (Lbdo;)Lerg;
      // 111: invokevirtual nvf.p5c (Lerg;)V
      // 114: aload 0
      // 115: iload 4
      // 117: ifeq 12f
      // 11a: invokevirtual nvf.s7f ()Lerg;
      // 11d: ifnonnull 132
      // 120: goto 127
      // 123: invokestatic nvf.a (Loov;)Loov;
      // 126: athrow
      // 127: aload 0
      // 128: goto 12f
      // 12b: invokestatic nvf.a (Loov;)Loov;
      // 12e: athrow
      // 12f: invokevirtual nvf._kl ()V
      // 132: return
   }

   @Override
   public void bzm(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nvf.b J
      // 003: ldc2_w 2815409015869
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 02b
      // 013: getfield nvf.oay Lt9d;
      // 016: getfield OpaquePredicate.v0f Z
      // 019: ifne 242
      // 01c: goto 023
      // 01f: invokestatic nvf.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: goto 02b
      // 027: invokestatic nvf.a (Loov;)Loov;
      // 02a: athrow
      // 02b: invokevirtual nvf.s7f ()Lerg;
      // 02e: astore 5
      // 030: aload 5
      // 032: getfield erg.qd2 I
      // 035: istore 6
      // 037: aload 0
      // 038: iload 4
      // 03a: ifne 052
      // 03d: getfield nvf.vrm I
      // 040: ifne 242
      // 043: goto 04a
      // 046: invokestatic nvf.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: goto 052
      // 04e: invokestatic nvf.a (Loov;)Loov;
      // 051: athrow
      // 052: getfield nvf.psi Ljava/lang/String;
      // 055: ifnull 09a
      // 058: sipush 6000
      // 05b: aload 0
      // 05c: getfield nvf.t3w I
      // 05f: isub
      // 060: iload 4
      // 062: ifne 0aa
      // 065: goto 06c
      // 068: invokestatic nvf.a (Loov;)Loov;
      // 06b: athrow
      // 06c: sipush 200
      // 06f: if_icmple 09a
      // 072: goto 079
      // 075: invokestatic nvf.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield nvf.psi Ljava/lang/String;
      // 07d: aload 1
      // 07e: invokevirtual ha9.noc ()Ljava/lang/String;
      // 081: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 084: iload 4
      // 086: ifne 0aa
      // 089: goto 090
      // 08c: invokestatic nvf.a (Loov;)Loov;
      // 08f: athrow
      // 090: ifeq 242
      // 093: goto 09a
      // 096: invokestatic nvf.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 1
      // 09b: getfield ha9.up_ Ljnq;
      // 09e: aload 5
      // 0a0: invokevirtual jnq.phd (Lerg;)Z
      // 0a3: goto 0aa
      // 0a6: invokestatic nvf.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: ifeq 242
      // 0ad: aload 5
      // 0af: invokevirtual erg.gn1 ()Lu7m;
      // 0b2: getstatic ox_.uom Le0x;
      // 0b5: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 0b8: iload 4
      // 0ba: ifne 0e7
      // 0bd: goto 0c4
      // 0c0: invokestatic nvf.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: if_acmpne 0dc
      // 0c7: goto 0ce
      // 0ca: invokestatic nvf.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: getstatic y8d.h2a Ll7l;
      // 0d2: invokevirtual ha9.aex (L_ss;)V
      // 0d5: goto 0dc
      // 0d8: invokestatic nvf.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 5
      // 0de: invokevirtual erg.gn1 ()Lu7m;
      // 0e1: getstatic ox_.a4y Le0x;
      // 0e4: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 0e7: iload 4
      // 0e9: ifne 10c
      // 0ec: if_acmpne 104
      // 0ef: goto 0f6
      // 0f2: invokestatic nvf.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 1
      // 0f7: getstatic y8d.h2a Ll7l;
      // 0fa: invokevirtual ha9.aex (L_ss;)V
      // 0fd: goto 104
      // 100: invokestatic nvf.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 5
      // 106: invokevirtual erg.gn1 ()Lu7m;
      // 109: getstatic xbr.i8v Lu7m;
      // 10c: iload 4
      // 10e: ifne 131
      // 111: if_acmpne 129
      // 114: goto 11b
      // 117: invokestatic nvf.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 1
      // 11c: getstatic y8d.g1f Ll7l;
      // 11f: invokevirtual ha9.aex (L_ss;)V
      // 122: goto 129
      // 125: invokestatic nvf.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 5
      // 12b: invokevirtual erg.gn1 ()Lu7m;
      // 12e: getstatic xbr.exg Lu7m;
      // 131: iload 4
      // 133: ifne 156
      // 136: if_acmpne 14e
      // 139: goto 140
      // 13c: invokestatic nvf.a (Loov;)Loov;
      // 13f: athrow
      // 140: aload 1
      // 141: getstatic y8d.zv4 Ll7l;
      // 144: invokevirtual ha9.aex (L_ss;)V
      // 147: goto 14e
      // 14a: invokestatic nvf.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 5
      // 150: invokevirtual erg.gn1 ()Lu7m;
      // 153: getstatic xbr.nh7 Lu7m;
      // 156: iload 4
      // 158: ifne 17b
      // 15b: if_acmpne 173
      // 15e: goto 165
      // 161: invokestatic nvf.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 1
      // 166: getstatic y8d.m9g Ll7l;
      // 169: invokevirtual ha9.aex (L_ss;)V
      // 16c: goto 173
      // 16f: invokestatic nvf.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 5
      // 175: invokevirtual erg.gn1 ()Lu7m;
      // 178: getstatic xbr.exg Lu7m;
      // 17b: if_acmpne 1de
      // 17e: aload 0
      // 17f: iload 4
      // 181: ifne 1df
      // 184: goto 18b
      // 187: invokestatic nvf.a (Loov;)Loov;
      // 18a: athrow
      // 18b: invokevirtual nvf.c_3 ()Ljava/lang/String;
      // 18e: ifnull 1de
      // 191: goto 198
      // 194: invokestatic nvf.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: iload 4
      // 19b: ifne 1df
      // 19e: goto 1a5
      // 1a1: invokestatic nvf.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: getfield nvf.oay Lt9d;
      // 1a8: aload 0
      // 1a9: invokevirtual nvf.c_3 ()Ljava/lang/String;
      // 1ac: invokevirtual OpaquePredicate.aev (Ljava/lang/String;)Lha9;
      // 1af: astore 7
      // 1b1: aload 7
      // 1b3: ifnull 1de
      // 1b6: aload 7
      // 1b8: iload 4
      // 1ba: ifne 1d8
      // 1bd: goto 1c4
      // 1c0: invokestatic nvf.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 1
      // 1c5: if_acmpeq 1de
      // 1c8: goto 1cf
      // 1cb: invokestatic nvf.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: aload 7
      // 1d1: goto 1d8
      // 1d4: invokestatic nvf.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: getstatic y8d.y02 Ll7l;
      // 1db: invokevirtual ha9.aex (L_ss;)V
      // 1de: aload 0
      // 1df: invokevirtual nvf.o3x ()Z
      // 1e2: iload 4
      // 1e4: ifne 234
      // 1e7: ifne 228
      // 1ea: goto 1f1
      // 1ed: invokestatic nvf.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: getfield nvf.oay Lt9d;
      // 1f5: aload 1
      // 1f6: sipush 14123
      // 1f9: ldc2_w 6764774179060659756
      // 1fc: lload 2
      // 1fd: lxor
      // 1fe: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: nop
      // 204: ldc 0.2
      // 206: nop
      // 207: aload 0
      // 208: getfield nvf.z2d Ljava/util/Random;
      // 20b: invokevirtual java/util/Random.nextFloat ()F
      // 20e: aload 0
      // 20f: getfield nvf.z2d Ljava/util/Random;
      // 212: invokevirtual java/util/Random.nextFloat ()F
      // 215: fsub
      // 216: ldc 0.7
      // 218: nop
      // 219: fmul
      // 21a: fconst_1
      // 21b: fadd
      // 21c: fconst_2
      // 21d: fmul
      // 21e: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // 221: goto 228
      // 224: invokestatic nvf.a (Loov;)Loov;
      // 227: athrow
      // 228: aload 1
      // 229: aload 0
      // 22a: iload 6
      // 22c: invokevirtual ha9.p3n (Li2h;I)V
      // 22f: aload 5
      // 231: getfield erg.qd2 I
      // 234: ifgt 242
      // 237: aload 0
      // 238: invokevirtual nvf._kl ()V
      // 23b: goto 242
      // 23e: invokestatic nvf.a (Loov;)Loov;
      // 241: athrow
      // 242: return
   }

   @Override
   public String noc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvf.b J
      // 03: ldc2_w 102963740756232
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 26
      // 11: invokevirtual nvf.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic nvf.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic nvf.a (Loov;)Loov;
      // 25: athrow
      // 26: invokevirtual nvf.hei ()Ljava/lang/String;
      // 29: goto 54
      // 2c: new java/lang/StringBuilder
      // 2f: dup
      // 30: invokespecial java/lang/StringBuilder.<init> ()V
      // 33: sipush 28725
      // 36: ldc2_w 1583149255682585614
      // 39: lload 1
      // 3a: lxor
      // 3b: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44: aload 0
      // 45: invokevirtual nvf.s7f ()Lerg;
      // 48: invokevirtual erg.ozi ()Ljava/lang/String;
      // 4b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 51: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 54: areturn
   }

   @Override
   public boolean qvl() {
      return false;
   }

   @Override
   public void zye(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial EntityLivingBase.zye (I)V
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifne 26
      // 0e: getfield nvf.oay Lt9d;
      // 11: getfield OpaquePredicate.v0f Z
      // 14: ifne 29
      // 17: goto 1e
      // 1a: invokestatic nvf.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic nvf.a (Loov;)Loov;
      // 25: athrow
      // 26: invokespecial nvf.f1c ()V
      // 29: return
   }

   public erg s7f() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nvf.b J
      // 03: ldc2_w 41503354603775
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual nvf.a0c ()Lwl1;
      // 10: bipush 10
      // 12: invokevirtual wl1.qh4 (I)Lerg;
      // 15: astore 4
      // 17: aload 4
      // 19: iload 3
      // 1a: ifeq 84
      // 1d: ifnonnull 82
      // 20: goto 27
      // 23: invokestatic nvf.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield nvf.oay Lt9d;
      // 2b: ifnull 77
      // 2e: goto 35
      // 31: invokestatic nvf.a (Loov;)Loov;
      // 34: athrow
      // 35: getstatic nvf.e5h Lorg/apache/logging/log4j/Logger;
      // 38: new java/lang/StringBuilder
      // 3b: dup
      // 3c: invokespecial java/lang/StringBuilder.<init> ()V
      // 3f: sipush 4344
      // 42: ldc2_w 9171537622064600374
      // 45: lload 1
      // 46: lxor
      // 47: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: nop
      // 4d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50: aload 0
      // 51: invokevirtual nvf.jwu ()I
      // 54: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 57: sipush 15914
      // 5a: ldc2_w 3162485211560786921
      // 5d: lload 1
      // 5e: lxor
      // 5f: invokedynamic h (IJ)Ljava/lang/String; bsm=nvf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: nop
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6b: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 70: goto 77
      // 73: invokestatic nvf.a (Loov;)Loov;
      // 76: athrow
      // 77: new erg
      // 7a: dup
      // 7b: getstatic ox_.pu8 Le0x;
      // 7e: invokespecial erg.<init> (Le0x;)V
      // 81: areturn
      // 82: aload 4
      // 84: areturn
   }

   public void p5c(erg var1) {
      this.a0c().c66(10, var1);
      this.a0c().pqa(10);
   }

   public String fad() {
      return this.psi;
   }

   public void bl4(String var1) {
      this.psi = var1;
   }

   public String ModeSetting() {
      return this.apq;
   }

   public void lse(String var1) {
      this.apq = var1;
   }

   public int q83() {
      return this.t3w;
   }

   public void zc4() {
      this.vrm = 10;
   }

   public void do6() {
      this.vrm = 0;
   }

   public void su8() {
      this.vrm = 32767;
   }

   public void op4(int var1) {
      this.vrm = var1;
   }

   public boolean yz5() {
      int var1 = OpaquePredicate.c();

      try {
         if (var1 != 0) {
            return (boolean)this.vrm;
         }

         if (this.vrm > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void moh() {
      this.t3w = -6000;
   }

   public void jgs() {
      this.su8();
      this.t3w = 5999;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1548887330428034165L, -649387606625729887L, MethodHandles.lookup().lookupClass()).a(178241183424366L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 57414720645120L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[17];
      int var7 = 0;
      String var6 = "\u009f\u0098Ìÿ\u008fàÅý´§éôT\u009a\"¿\u0010+ð\u0018NÒaB\u009bÚ£\u008bg³kèa\u0010®u÷xK6ë¨ß2¹JaÞÀJ ì\n$\u0017\u001c>ß\u0014à\u0019\u0015\u0097AÞ[ù\u0083Ä\u0097\u001e\nÊ\u009e2+\u008fõÞ\u0084¡}±\u0010D\u0089\u0002P\u0006ö×pòOÍ\u0095\u0018~J\u009c\u0010\u0001¤7\u008a\u0094Ò3\u000f¡\u008a¾¸\u0088}va )ew,æºà\t:BJP±\"a\u0083\u009b\u008c\u0015^\u000eyíðáÿÊ*r^I\u0018\u0010f!È\u0098¬O5p\u001c\u00ad=í\u009eûò¯\u0010©àV Üç^N§0XDÉv£\b\u0010<ÑEå\u001e1A\u0016\u008e\u0010v9ü¨ÐÄ ¼\u0080¥[D]åä\u008a1\u000b¨°\u008a\u001dákÃ\u0099\u0098ÚÒ#Iè5Ñã,ÇHÌ ®öâPë?½ú\u0003\u0002\u0081/´$ÊAÔNëµÂ4\u0089\u0017X)\u0015\u0017ñ\"Ld\u0010çö0ú´\u001dð}mÎ`Í\u0018\\ù\u0004\u0018\u0015B\u0081àoÅ\u008a¸8yñ)Ó\u0012#à~\u001e±xx¼:g\u0010\u0092oy®áJS\u0080VºÝÆ²n\u0012\u0084";
      int var8 = "\u009f\u0098Ìÿ\u008fàÅý´§éôT\u009a\"¿\u0010+ð\u0018NÒaB\u009bÚ£\u008bg³kèa\u0010®u÷xK6ë¨ß2¹JaÞÀJ ì\n$\u0017\u001c>ß\u0014à\u0019\u0015\u0097AÞ[ù\u0083Ä\u0097\u001e\nÊ\u009e2+\u008fõÞ\u0084¡}±\u0010D\u0089\u0002P\u0006ö×pòOÍ\u0095\u0018~J\u009c\u0010\u0001¤7\u008a\u0094Ò3\u000f¡\u008a¾¸\u0088}va )ew,æºà\t:BJP±\"a\u0083\u009b\u008c\u0015^\u000eyíðáÿÊ*r^I\u0018\u0010f!È\u0098¬O5p\u001c\u00ad=í\u009eûò¯\u0010©àV Üç^N§0XDÉv£\b\u0010<ÑEå\u001e1A\u0016\u008e\u0010v9ü¨ÐÄ ¼\u0080¥[D]åä\u008a1\u000b¨°\u008a\u001dákÃ\u0099\u0098ÚÒ#Iè5Ñã,ÇHÌ ®öâPë?½ú\u0003\u0002\u0081/´$ÊAÔNëµÂ4\u0089\u0017X)\u0015\u0017ñ\"Ld\u0010çö0ú´\u001dð}mÎ`Í\u0018\\ù\u0004\u0018\u0015B\u0081àoÅ\u008a¸8yñ)Ó\u0012#à~\u001e±xx¼:g\u0010\u0092oy®áJS\u0080VºÝÆ²n\u0012\u0084"
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
                     c = var9;
                     d = new String[17];
                     e5h = LogManager.getLogger();
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

                  var6 = "¶¾\u0089\u0088«,±e\u000f¬ÿ©uÊ´\u0002sÚ·HI/GfÆ)\u0088V\u001b2h§\u0010×\u008dÖµZ\u0097\u001c\u001d¸¨7ã+\u0005<1";
                  var8 = "¶¾\u0089\u0088«,±e\u000f¬ÿ©uÊ´\u0002sÚ·HI/GfÆ)\u0088V\u001b2h§\u0010×\u008dÖµZ\u0097\u001c\u001d¸¨7ã+\u0005<1".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11084;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("nvf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("nvf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
