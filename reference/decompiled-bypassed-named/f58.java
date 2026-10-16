import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f58 extends wdh {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public f58() {
      this.oml(true);
   }

   public static ucr mam(int var0, OpaquePredicate var1) {
      long var2 = a ^ 77282141938989L;
      String var5 = b<"j">(2082, 4688910767667293142L ^ var2) + var0;
      int var10000 = OpaquePredicate.c();
      ucr var6 = (ucr)var1.hyf(ucr.class, var5);
      int var4 = var10000;

      try {
         if (var4 != 0) {
            return var6;
         }

         if (var6 != null) {
            return var6;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      var6 = new ucr(var5);
      var1.m5k(var5, var6);
      return var6;
   }

   public ucr h9y(erg param1, OpaquePredicate param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic f58.a J
      // 03: ldc2_w 1193345429497
      // 06: lxor
      // 07: lstore 3
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: sipush 15841
      // 12: ldc2_w 4481481563617432772
      // 15: lload 3
      // 16: lxor
      // 17: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: nop
      // 1d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20: aload 1
      // 21: invokevirtual erg.j6_ ()I
      // 24: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 27: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a: astore 6
      // 2c: invokestatic OpaquePredicate.c ()I
      // 2f: aload 2
      // 30: ldc ucr
      // 32: nop
      // 33: aload 6
      // 35: invokevirtual OpaquePredicate.hyf (Ljava/lang/Class;Ljava/lang/String;)Lwob;
      // 38: checkcast ucr
      // 3b: astore 7
      // 3d: istore 5
      // 3f: aload 7
      // 41: iload 5
      // 43: ifne eb
      // 46: ifnonnull e9
      // 49: goto 50
      // 4c: invokestatic f58.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 2
      // 51: iload 5
      // 53: ifne e2
      // 56: goto 5d
      // 59: invokestatic f58.a (Loov;)Loov;
      // 5c: athrow
      // 5d: getfield OpaquePredicate.v0f Z
      // 60: ifne e9
      // 63: goto 6a
      // 66: invokestatic f58.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 1
      // 6b: aload 2
      // 6c: sipush 12868
      // 6f: ldc2_w 4990871660798679904
      // 72: lload 3
      // 73: lxor
      // 74: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: nop
      // 7a: invokevirtual OpaquePredicate.xbc (Ljava/lang/String;)I
      // 7d: invokevirtual erg.awe (I)V
      // 80: new java/lang/StringBuilder
      // 83: dup
      // 84: invokespecial java/lang/StringBuilder.<init> ()V
      // 87: sipush 15841
      // 8a: ldc2_w 4481481563617432772
      // 8d: lload 3
      // 8e: lxor
      // 8f: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: nop
      // 95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 98: aload 1
      // 99: invokevirtual erg.j6_ ()I
      // 9c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a2: astore 6
      // a4: new ucr
      // a7: dup
      // a8: aload 6
      // aa: invokespecial ucr.<init> (Ljava/lang/String;)V
      // ad: astore 7
      // af: aload 7
      // b1: bipush 3
      // b2: putfield ucr.rqi B
      // b5: aload 7
      // b7: aload 2
      // b8: invokevirtual OpaquePredicate.r7d ()Lcog;
      // bb: invokevirtual cog.c21 ()I
      // be: i2d
      // bf: aload 2
      // c0: invokevirtual OpaquePredicate.r7d ()Lcog;
      // c3: invokevirtual cog.ans ()I
      // c6: i2d
      // c7: aload 7
      // c9: getfield ucr.rqi B
      // cc: invokevirtual ucr.snl (DDI)V
      // cf: aload 7
      // d1: aload 2
      // d2: getfield OpaquePredicate.vzz Lupn;
      // d5: invokevirtual upn.gs_ ()I
      // d8: i2b
      // d9: putfield ucr.d_r B
      // dc: aload 7
      // de: invokevirtual ucr.hcs ()V
      // e1: aload 2
      // e2: aload 6
      // e4: aload 7
      // e6: invokevirtual OpaquePredicate.m5k (Ljava/lang/String;Lwob;)V
      // e9: aload 7
      // eb: areturn
   }

   public void pzt(OpaquePredicate param1, EntityLivingBase param2, ucr param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: getfield OpaquePredicate.vzz Lupn;
      // 009: invokevirtual upn.gs_ ()I
      // 00c: iload 4
      // 00e: ifne 02a
      // 011: aload 3
      // 012: getfield ucr.d_r B
      // 015: if_icmpne 59f
      // 018: goto 01f
      // 01b: invokestatic f58.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 2
      // 020: instanceof ha9
      // 023: goto 02a
      // 026: invokestatic f58.a (Loov;)Loov;
      // 029: athrow
      // 02a: iload 4
      // 02c: ifne 046
      // 02f: ifeq 59f
      // 032: goto 039
      // 035: invokestatic f58.a (Loov;)Loov;
      // 038: athrow
      // 039: bipush 1
      // 03a: aload 3
      // 03b: getfield ucr.rqi B
      // 03e: ishl
      // 03f: goto 046
      // 042: invokestatic f58.a (Loov;)Loov;
      // 045: athrow
      // 046: istore 5
      // 048: aload 3
      // 049: getfield ucr.ukq I
      // 04c: istore 6
      // 04e: aload 3
      // 04f: getfield ucr.od8 I
      // 052: istore 7
      // 054: aload 2
      // 055: getfield EntityLivingBase.o2v D
      // 058: iload 6
      // 05a: i2d
      // 05b: dsub
      // 05c: invokestatic fe6.jqf (D)I
      // 05f: iload 5
      // 061: idiv
      // 062: bipush 64
      // 064: iadd
      // 065: istore 8
      // 067: aload 2
      // 068: getfield EntityLivingBase.vbd D
      // 06b: iload 7
      // 06d: i2d
      // 06e: dsub
      // 06f: invokestatic fe6.jqf (D)I
      // 072: iload 5
      // 074: idiv
      // 075: bipush 64
      // 077: iadd
      // 078: istore 9
      // 07a: sipush 128
      // 07d: iload 5
      // 07f: idiv
      // 080: istore 10
      // 082: aload 1
      // 083: getfield OpaquePredicate.vzz Lupn;
      // 086: invokevirtual upn.qyc ()Z
      // 089: iload 4
      // 08b: ifne 0a3
      // 08e: ifeq 0a5
      // 091: goto 098
      // 094: invokestatic f58.a (Loov;)Loov;
      // 097: athrow
      // 098: iload 10
      // 09a: bipush 2
      // 09b: idiv
      // 09c: goto 0a3
      // 09f: invokestatic f58.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: istore 10
      // 0a5: aload 3
      // 0a6: aload 2
      // 0a7: checkcast ha9
      // 0aa: invokevirtual ucr._5y (Lha9;)Lucr$qah;
      // 0ad: astore 11
      // 0af: aload 11
      // 0b1: dup
      // 0b2: getfield ucr$qah.x5y I
      // 0b5: bipush 1
      // 0b6: iadd
      // 0b7: putfield ucr$qah.x5y I
      // 0ba: bipush 0
      // 0bb: istore 12
      // 0bd: iload 8
      // 0bf: iload 10
      // 0c1: isub
      // 0c2: bipush 1
      // 0c3: iadd
      // 0c4: istore 13
      // 0c6: iload 13
      // 0c8: iload 8
      // 0ca: iload 10
      // 0cc: iadd
      // 0cd: if_icmpge 59f
      // 0d0: iload 13
      // 0d2: bipush 15
      // 0d4: iand
      // 0d5: iload 4
      // 0d7: ifne 105
      // 0da: aload 11
      // 0dc: getfield ucr$qah.x5y I
      // 0df: bipush 15
      // 0e1: iand
      // 0e2: if_icmpeq 104
      // 0e5: goto 0ec
      // 0e8: invokestatic f58.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: iload 12
      // 0ee: iload 4
      // 0f0: ifne 105
      // 0f3: goto 0fa
      // 0f6: invokestatic f58.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: ifeq 597
      // 0fd: goto 104
      // 100: invokestatic f58.a (Loov;)Loov;
      // 103: athrow
      // 104: bipush 0
      // 105: istore 12
      // 107: dconst_0
      // 108: dstore 14
      // 10a: iload 9
      // 10c: iload 10
      // 10e: isub
      // 10f: bipush 1
      // 110: isub
      // 111: istore 16
      // 113: iload 16
      // 115: iload 9
      // 117: iload 10
      // 119: iadd
      // 11a: if_icmpge 597
      // 11d: iload 13
      // 11f: iload 4
      // 121: ifne 0c8
      // 124: iload 4
      // 126: ifne 135
      // 129: iflt 58f
      // 12c: goto 133
      // 12f: invokestatic f58.a (Loov;)Loov;
      // 132: athrow
      // 133: iload 16
      // 135: bipush -1
      // 136: iload 4
      // 138: ifne 151
      // 13b: if_icmplt 58f
      // 13e: goto 145
      // 141: invokestatic f58.a (Loov;)Loov;
      // 144: athrow
      // 145: iload 13
      // 147: sipush 128
      // 14a: goto 151
      // 14d: invokestatic f58.a (Loov;)Loov;
      // 150: athrow
      // 151: iload 4
      // 153: ifne 16c
      // 156: if_icmpge 58f
      // 159: goto 160
      // 15c: invokestatic f58.a (Loov;)Loov;
      // 15f: athrow
      // 160: iload 16
      // 162: sipush 128
      // 165: goto 16c
      // 168: invokestatic f58.a (Loov;)Loov;
      // 16b: athrow
      // 16c: iload 4
      // 16e: ifne 186
      // 171: if_icmpge 58f
      // 174: goto 17b
      // 177: invokestatic f58.a (Loov;)Loov;
      // 17a: athrow
      // 17b: iload 13
      // 17d: iload 8
      // 17f: goto 186
      // 182: invokestatic f58.a (Loov;)Loov;
      // 185: athrow
      // 186: isub
      // 187: istore 17
      // 189: iload 16
      // 18b: iload 9
      // 18d: isub
      // 18e: istore 18
      // 190: iload 17
      // 192: iload 17
      // 194: imul
      // 195: iload 18
      // 197: iload 18
      // 199: imul
      // 19a: iadd
      // 19b: iload 4
      // 19d: ifne 1bb
      // 1a0: iload 10
      // 1a2: bipush 2
      // 1a3: isub
      // 1a4: iload 10
      // 1a6: bipush 2
      // 1a7: isub
      // 1a8: imul
      // 1a9: if_icmple 1be
      // 1ac: goto 1b3
      // 1af: invokestatic f58.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: bipush 1
      // 1b4: goto 1bb
      // 1b7: invokestatic f58.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: goto 1bf
      // 1be: bipush 0
      // 1bf: istore 19
      // 1c1: iload 6
      // 1c3: iload 5
      // 1c5: idiv
      // 1c6: iload 13
      // 1c8: iadd
      // 1c9: bipush 64
      // 1cb: isub
      // 1cc: iload 5
      // 1ce: imul
      // 1cf: istore 20
      // 1d1: iload 7
      // 1d3: iload 5
      // 1d5: idiv
      // 1d6: iload 16
      // 1d8: iadd
      // 1d9: bipush 64
      // 1db: isub
      // 1dc: iload 5
      // 1de: imul
      // 1df: istore 21
      // 1e1: invokestatic com/google/common/collect/HashMultiset.create ()Lcom/google/common/collect/HashMultiset;
      // 1e4: astore 22
      // 1e6: aload 1
      // 1e7: new mew
      // 1ea: dup
      // 1eb: iload 20
      // 1ed: bipush 0
      // 1ee: iload 21
      // 1f0: invokespecial mew.<init> (III)V
      // 1f3: invokevirtual OpaquePredicate.pxs (Lmew;)Ltts;
      // 1f6: astore 23
      // 1f8: iload 4
      // 1fa: ifne 592
      // 1fd: aload 23
      // 1ff: invokevirtual tts.col ()Z
      // 202: ifne 58f
      // 205: goto 20c
      // 208: invokestatic f58.a (Loov;)Loov;
      // 20b: athrow
      // 20c: iload 20
      // 20e: bipush 15
      // 210: iand
      // 211: istore 24
      // 213: iload 21
      // 215: bipush 15
      // 217: iand
      // 218: istore 25
      // 21a: bipush 0
      // 21b: istore 26
      // 21d: dconst_0
      // 21e: dstore 27
      // 220: aload 1
      // 221: getfield OpaquePredicate.vzz Lupn;
      // 224: invokevirtual upn.qyc ()Z
      // 227: iload 4
      // 229: ifne 246
      // 22c: ifeq 2ce
      // 22f: goto 236
      // 232: invokestatic f58.a (Loov;)Loov;
      // 235: athrow
      // 236: iload 20
      // 238: iload 21
      // 23a: ldc 231871
      // 23c: nop
      // 23d: imul
      // 23e: iadd
      // 23f: goto 246
      // 242: invokestatic f58.a (Loov;)Loov;
      // 245: athrow
      // 246: istore 29
      // 248: iload 29
      // 24a: iload 29
      // 24c: imul
      // 24d: ldc 31287121
      // 24f: nop
      // 250: imul
      // 251: iload 29
      // 253: bipush 11
      // 255: imul
      // 256: iadd
      // 257: istore 29
      // 259: iload 29
      // 25b: bipush 20
      // 25d: ishr
      // 25e: bipush 1
      // 25f: iand
      // 260: iload 4
      // 262: ifne 2c3
      // 265: ifne 29c
      // 268: goto 26f
      // 26b: invokestatic f58.a (Loov;)Loov;
      // 26e: athrow
      // 26f: aload 22
      // 271: getstatic ox_.kqk Le0x;
      // 274: getstatic ox_.kqk Le0x;
      // 277: invokevirtual e0x.l4i ()Lzfz;
      // 27a: getstatic bx0.nln Lzb_;
      // 27d: getstatic bx0$b_z.rg3 Lbx0$b_z;
      // 280: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 285: invokevirtual e0x.uoz (Lzfz;)L_mi;
      // 288: bipush 10
      // 28a: invokeinterface com/google/common/collect/Multiset.add (Ljava/lang/Object;I)I 3
      // 28f: pop
      // 290: iload 4
      // 292: ifeq 2c4
      // 295: goto 29c
      // 298: invokestatic f58.a (Loov;)Loov;
      // 29b: athrow
      // 29c: aload 22
      // 29e: getstatic ox_.pu8 Le0x;
      // 2a1: getstatic ox_.pu8 Le0x;
      // 2a4: invokevirtual e0x.l4i ()Lzfz;
      // 2a7: getstatic jcc.m9s Lzb_;
      // 2aa: getstatic jcc$whg.aow Ljcc$whg;
      // 2ad: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2b2: invokevirtual e0x.uoz (Lzfz;)L_mi;
      // 2b5: bipush 100
      // 2b7: invokeinterface com/google/common/collect/Multiset.add (Ljava/lang/Object;I)I 3
      // 2bc: goto 2c3
      // 2bf: invokestatic f58.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: pop
      // 2c4: ldc2_w 100.0
      // 2c7: dstore 27
      // 2c9: iload 4
      // 2cb: ifeq 401
      // 2ce: new mew$mix
      // 2d1: dup
      // 2d2: invokespecial mew$mix.<init> ()V
      // 2d5: astore 29
      // 2d7: bipush 0
      // 2d8: istore 30
      // 2da: iload 30
      // 2dc: iload 5
      // 2de: if_icmpge 401
      // 2e1: bipush 0
      // 2e2: iload 4
      // 2e4: ifne 409
      // 2e7: istore 31
      // 2e9: iload 31
      // 2eb: iload 5
      // 2ed: if_icmpge 3f9
      // 2f0: aload 23
      // 2f2: iload 30
      // 2f4: iload 24
      // 2f6: iadd
      // 2f7: iload 31
      // 2f9: iload 25
      // 2fb: iadd
      // 2fc: invokevirtual tts.d0r (II)I
      // 2ff: bipush 1
      // 300: iadd
      // 301: istore 32
      // 303: getstatic ox_.ibw Le0x;
      // 306: invokevirtual e0x.l4i ()Lzfz;
      // 309: astore 33
      // 30b: iload 32
      // 30d: iload 4
      // 30f: ifne 3f0
      // 312: bipush 1
      // 313: iload 4
      // 315: ifne 2de
      // 318: goto 31f
      // 31b: invokestatic f58.a (Loov;)Loov;
      // 31e: athrow
      // 31f: if_icmple 3ce
      // 322: iinc 32 -1
      // 325: aload 23
      // 327: aload 29
      // 329: iload 30
      // 32b: iload 24
      // 32d: iadd
      // 32e: iload 32
      // 330: iload 31
      // 332: iload 25
      // 334: iadd
      // 335: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 338: invokevirtual tts.dk4 (Lmew;)Lzfz;
      // 33b: astore 33
      // 33d: aload 33
      // 33f: invokeinterface zfz.r_y ()Le0x; 1
      // 344: aload 33
      // 346: invokevirtual e0x.uoz (Lzfz;)L_mi;
      // 349: getstatic _mi._b5 L_mi;
      // 34c: if_acmpne 357
      // 34f: iload 32
      // 351: ifgt 322
      // 354: goto 357
      // 357: iload 32
      // 359: iload 4
      // 35b: ifne 3f0
      // 35e: ifle 3ce
      // 361: goto 368
      // 364: invokestatic f58.a (Loov;)Loov;
      // 367: athrow
      // 368: aload 33
      // 36a: invokeinterface zfz.r_y ()Le0x; 1
      // 36f: invokevirtual e0x.p1r ()Lp3y;
      // 372: invokevirtual p3y.l7j ()Z
      // 375: iload 4
      // 377: ifne 3f0
      // 37a: goto 381
      // 37d: invokestatic f58.a (Loov;)Loov;
      // 380: athrow
      // 381: ifeq 3ce
      // 384: goto 38b
      // 387: invokestatic f58.a (Loov;)Loov;
      // 38a: athrow
      // 38b: iload 32
      // 38d: bipush 1
      // 38e: isub
      // 38f: istore 34
      // 391: aload 23
      // 393: iload 30
      // 395: iload 24
      // 397: iadd
      // 398: iload 34
      // 39a: iinc 34 -1
      // 39d: iload 31
      // 39f: iload 25
      // 3a1: iadd
      // 3a2: invokevirtual tts.ygo (III)Le0x;
      // 3a5: astore 35
      // 3a7: iinc 26 1
      // 3aa: iload 34
      // 3ac: ifle 3ce
      // 3af: aload 35
      // 3b1: invokevirtual e0x.p1r ()Lp3y;
      // 3b4: invokevirtual p3y.l7j ()Z
      // 3b7: iload 4
      // 3b9: ifne 3f0
      // 3bc: ifne 3c9
      // 3bf: goto 3c6
      // 3c2: invokestatic f58.a (Loov;)Loov;
      // 3c5: athrow
      // 3c6: goto 3ce
      // 3c9: iload 4
      // 3cb: ifeq 391
      // 3ce: dload 27
      // 3d0: iload 32
      // 3d2: i2d
      // 3d3: iload 5
      // 3d5: iload 5
      // 3d7: imul
      // 3d8: i2d
      // 3d9: ddiv
      // 3da: dadd
      // 3db: dstore 27
      // 3dd: aload 22
      // 3df: aload 33
      // 3e1: invokeinterface zfz.r_y ()Le0x; 1
      // 3e6: aload 33
      // 3e8: invokevirtual e0x.uoz (Lzfz;)L_mi;
      // 3eb: invokeinterface com/google/common/collect/Multiset.add (Ljava/lang/Object;)Z 2
      // 3f0: pop
      // 3f1: iinc 31 1
      // 3f4: iload 4
      // 3f6: ifeq 2e9
      // 3f9: iinc 30 1
      // 3fc: iload 4
      // 3fe: ifeq 2da
      // 401: iload 26
      // 403: iload 5
      // 405: iload 5
      // 407: imul
      // 408: idiv
      // 409: istore 26
      // 40b: dload 27
      // 40d: dload 14
      // 40f: dsub
      // 410: ldc2_w 4.0
      // 413: dmul
      // 414: iload 5
      // 416: bipush 4
      // 417: iadd
      // 418: i2d
      // 419: ddiv
      // 41a: iload 13
      // 41c: iload 16
      // 41e: iadd
      // 41f: bipush 1
      // 420: iand
      // 421: i2d
      // 422: ldc2_w 0.5
      // 425: dsub
      // 426: ldc2_w 0.4
      // 429: dmul
      // 42a: dadd
      // 42b: dstore 29
      // 42d: bipush 1
      // 42e: istore 31
      // 430: dload 29
      // 432: ldc2_w 0.6
      // 435: dcmpl
      // 436: iload 4
      // 438: ifne 44e
      // 43b: ifle 448
      // 43e: goto 445
      // 441: invokestatic f58.a (Loov;)Loov;
      // 444: athrow
      // 445: bipush 2
      // 446: istore 31
      // 448: dload 29
      // 44a: ldc2_w -0.6
      // 44d: dcmpg
      // 44e: iload 4
      // 450: ifne 45e
      // 453: ifge 460
      // 456: goto 45d
      // 459: invokestatic f58.a (Loov;)Loov;
      // 45c: athrow
      // 45d: bipush 0
      // 45e: istore 31
      // 460: aload 22
      // 462: invokestatic com/google/common/collect/Multisets.copyHighestCountFirst (Lcom/google/common/collect/Multiset;)Lcom/google/common/collect/ImmutableMultiset;
      // 465: getstatic _mi._b5 L_mi;
      // 468: invokestatic com/google/common/collect/Iterables.getFirst (Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;
      // 46b: checkcast _mi
      // 46e: astore 32
      // 470: iload 4
      // 472: ifne 4d1
      // 475: aload 32
      // 477: getstatic _mi.hvl L_mi;
      // 47a: if_acmpne 4cd
      // 47d: goto 484
      // 480: invokestatic f58.a (Loov;)Loov;
      // 483: athrow
      // 484: iload 26
      // 486: i2d
      // 487: ldc2_w 0.1
      // 48a: dmul
      // 48b: iload 13
      // 48d: iload 16
      // 48f: iadd
      // 490: bipush 1
      // 491: iand
      // 492: i2d
      // 493: ldc2_w 0.2
      // 496: dmul
      // 497: dadd
      // 498: dstore 29
      // 49a: bipush 1
      // 49b: istore 31
      // 49d: dload 29
      // 49f: ldc2_w 0.5
      // 4a2: dcmpg
      // 4a3: iload 4
      // 4a5: ifne 4bb
      // 4a8: ifge 4b5
      // 4ab: goto 4b2
      // 4ae: invokestatic f58.a (Loov;)Loov;
      // 4b1: athrow
      // 4b2: bipush 2
      // 4b3: istore 31
      // 4b5: dload 29
      // 4b7: ldc2_w 0.9
      // 4ba: dcmpl
      // 4bb: iload 4
      // 4bd: ifne 4df
      // 4c0: ifle 4cd
      // 4c3: goto 4ca
      // 4c6: invokestatic f58.a (Loov;)Loov;
      // 4c9: athrow
      // 4ca: bipush 0
      // 4cb: istore 31
      // 4cd: dload 27
      // 4cf: dstore 14
      // 4d1: iload 4
      // 4d3: ifne 592
      // 4d6: iload 16
      // 4d8: goto 4df
      // 4db: invokestatic f58.a (Loov;)Loov;
      // 4de: athrow
      // 4df: iflt 58f
      // 4e2: iload 17
      // 4e4: iload 17
      // 4e6: imul
      // 4e7: iload 18
      // 4e9: iload 18
      // 4eb: imul
      // 4ec: iadd
      // 4ed: iload 4
      // 4ef: ifne 511
      // 4f2: goto 4f9
      // 4f5: invokestatic f58.a (Loov;)Loov;
      // 4f8: athrow
      // 4f9: iload 10
      // 4fb: iload 10
      // 4fd: imul
      // 4fe: if_icmpge 58f
      // 501: goto 508
      // 504: invokestatic f58.a (Loov;)Loov;
      // 507: athrow
      // 508: iload 19
      // 50a: goto 511
      // 50d: invokestatic f58.a (Loov;)Loov;
      // 510: athrow
      // 511: iload 4
      // 513: ifne 552
      // 516: ifeq 53d
      // 519: goto 520
      // 51c: invokestatic f58.a (Loov;)Loov;
      // 51f: athrow
      // 520: iload 13
      // 522: iload 16
      // 524: iadd
      // 525: bipush 1
      // 526: iand
      // 527: iload 4
      // 529: ifne 552
      // 52c: goto 533
      // 52f: invokestatic f58.a (Loov;)Loov;
      // 532: athrow
      // 533: ifeq 58f
      // 536: goto 53d
      // 539: invokestatic f58.a (Loov;)Loov;
      // 53c: athrow
      // 53d: aload 3
      // 53e: getfield ucr.quz [B
      // 541: iload 13
      // 543: iload 16
      // 545: sipush 128
      // 548: imul
      // 549: iadd
      // 54a: baload
      // 54b: goto 552
      // 54e: invokestatic f58.a (Loov;)Loov;
      // 551: athrow
      // 552: istore 33
      // 554: aload 32
      // 556: getfield _mi.bav I
      // 559: bipush 4
      // 55a: imul
      // 55b: iload 31
      // 55d: iadd
      // 55e: i2b
      // 55f: istore 34
      // 561: iload 4
      // 563: ifne 592
      // 566: iload 33
      // 568: iload 34
      // 56a: if_icmpeq 58f
      // 56d: goto 574
      // 570: invokestatic f58.a (Loov;)Loov;
      // 573: athrow
      // 574: aload 3
      // 575: getfield ucr.quz [B
      // 578: iload 13
      // 57a: iload 16
      // 57c: sipush 128
      // 57f: imul
      // 580: iadd
      // 581: iload 34
      // 583: bastore
      // 584: aload 3
      // 585: iload 13
      // 587: iload 16
      // 589: invokevirtual ucr.zeq (II)V
      // 58c: bipush 1
      // 58d: istore 12
      // 58f: iinc 16 1
      // 592: iload 4
      // 594: ifeq 113
      // 597: iinc 13 1
      // 59a: iload 4
      // 59c: ifeq 0c6
      // 59f: return
   }

   @Override
   public void u9o(erg var1, OpaquePredicate var2, EntityLivingBase var3, int var4, boolean var5) {
      int var6 = OpaquePredicate.c();
      if (!var2.v0f) {
         ucr var7 = this.h9y(var1, var2);

         boolean var10000;
         label29: {
            label28: {
               try {
                  var10000 = var3 instanceof ha9;
                  if (var6 != 0) {
                     break label29;
                  }

                  if (!var10000) {
                     break label28;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }

               ha9 var8 = (ha9)var3;
               var7.obe(var8, var1);
            }

            var10000 = var5;
         }

         try {
            if (var10000) {
               this.pzt(var2, var3, var7);
            }
         } catch (oov var9) {
            throw a(var9);
         }
      }
   }

   @Override
   public mz2 bdn(erg var1, OpaquePredicate var2, ha9 var3) {
      return this.h9y(var1, var2).j0m(var1, var2, var3);
   }

   @Override
   public void zs1(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic f58.a J
      // 003: ldc2_w 57847892181118
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 6
      // 00e: aload 1
      // 00f: invokevirtual erg.w8b ()Z
      // 012: iload 6
      // 014: ifeq 03e
      // 017: ifeq 10b
      // 01a: goto 021
      // 01d: invokestatic f58.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 1
      // 022: invokevirtual erg.zso ()Lbdo;
      // 025: sipush 27059
      // 028: ldc2_w 4002332583363440406
      // 02b: lload 4
      // 02d: lxor
      // 02e: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: nop
      // 034: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 037: goto 03e
      // 03a: invokestatic f58.a (Loov;)Loov;
      // 03d: athrow
      // 03e: ifeq 10b
      // 041: getstatic xbr.kdv Lf58;
      // 044: aload 1
      // 045: aload 2
      // 046: invokevirtual f58.h9y (Lerg;Lt9d;)Lucr;
      // 049: astore 7
      // 04b: aload 1
      // 04c: aload 2
      // 04d: sipush 6078
      // 050: ldc2_w 1343343515621953823
      // 053: lload 4
      // 055: lxor
      // 056: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: nop
      // 05c: invokevirtual OpaquePredicate.xbc (Ljava/lang/String;)I
      // 05f: invokevirtual erg.awe (I)V
      // 062: new ucr
      // 065: dup
      // 066: new java/lang/StringBuilder
      // 069: dup
      // 06a: invokespecial java/lang/StringBuilder.<init> ()V
      // 06d: sipush 15841
      // 070: ldc2_w 4481466689713584963
      // 073: lload 4
      // 075: lxor
      // 076: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: nop
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: aload 1
      // 080: invokevirtual erg.j6_ ()I
      // 083: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 086: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 089: invokespecial ucr.<init> (Ljava/lang/String;)V
      // 08c: astore 8
      // 08e: aload 8
      // 090: aload 7
      // 092: getfield ucr.rqi B
      // 095: bipush 1
      // 096: iadd
      // 097: i2b
      // 098: putfield ucr.rqi B
      // 09b: aload 8
      // 09d: iload 6
      // 09f: ifeq 0df
      // 0a2: getfield ucr.rqi B
      // 0a5: bipush 4
      // 0a6: if_icmple 0bd
      // 0a9: goto 0b0
      // 0ac: invokestatic f58.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 8
      // 0b2: bipush 4
      // 0b3: putfield ucr.rqi B
      // 0b6: goto 0bd
      // 0b9: invokestatic f58.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 8
      // 0bf: aload 7
      // 0c1: getfield ucr.ukq I
      // 0c4: i2d
      // 0c5: aload 7
      // 0c7: getfield ucr.od8 I
      // 0ca: i2d
      // 0cb: aload 8
      // 0cd: getfield ucr.rqi B
      // 0d0: invokevirtual ucr.snl (DDI)V
      // 0d3: aload 8
      // 0d5: aload 7
      // 0d7: getfield ucr.d_r B
      // 0da: putfield ucr.d_r B
      // 0dd: aload 8
      // 0df: invokevirtual ucr.hcs ()V
      // 0e2: aload 2
      // 0e3: new java/lang/StringBuilder
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ea: sipush 15841
      // 0ed: ldc2_w 4481466689713584963
      // 0f0: lload 4
      // 0f2: lxor
      // 0f3: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: nop
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: aload 1
      // 0fd: invokevirtual erg.j6_ ()I
      // 100: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 103: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 106: aload 8
      // 108: invokevirtual OpaquePredicate.m5k (Ljava/lang/String;Lwob;)V
      // 10b: return
   }

   @Override
   public void wra(erg param1, ha9 param2, List param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic f58.a J
      // 03: ldc2_w 111234583872836
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 7
      // 0e: aload 0
      // 0f: aload 1
      // 10: aload 2
      // 11: getfield ha9.oay Lt9d;
      // 14: invokevirtual f58.h9y (Lerg;Lt9d;)Lucr;
      // 17: astore 8
      // 19: iload 4
      // 1b: ifeq bb
      // 1e: aload 8
      // 20: ifnonnull 4c
      // 23: goto 2a
      // 26: invokestatic f58.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 3
      // 2b: sipush 20086
      // 2e: ldc2_w 1915190231513697770
      // 31: lload 5
      // 33: lxor
      // 34: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3f: pop
      // 40: iload 7
      // 42: ifeq bb
      // 45: goto 4c
      // 48: invokestatic f58.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 3
      // 4d: new java/lang/StringBuilder
      // 50: dup
      // 51: invokespecial java/lang/StringBuilder.<init> ()V
      // 54: sipush 15216
      // 57: ldc2_w 2876275826490407146
      // 5a: lload 5
      // 5c: lxor
      // 5d: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: nop
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: bipush 1
      // 67: aload 8
      // 69: getfield ucr.rqi B
      // 6c: ishl
      // 6d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 70: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 73: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 78: pop
      // 79: aload 3
      // 7a: new java/lang/StringBuilder
      // 7d: dup
      // 7e: invokespecial java/lang/StringBuilder.<init> ()V
      // 81: sipush 28683
      // 84: ldc2_w 5858927060675670933
      // 87: lload 5
      // 89: lxor
      // 8a: invokedynamic j (IJ)Ljava/lang/String; bsm=f58.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: nop
      // 90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93: aload 8
      // 95: getfield ucr.rqi B
      // 98: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9b: ldc "/"
      // 9d: nop
      // 9e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a1: bipush 4
      // a2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a5: ldc ")"
      // a7: nop
      // a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ae: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // b3: pop
      // b4: goto bb
      // b7: invokestatic f58.a (Loov;)Loov;
      // ba: athrow
      // bb: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3709808944047003674L, 5455254055924426903L, MethodHandles.lookup().lookupClass()).a(98590451228926L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 89943673835049L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "d¼¡\u0000½ád\u000e\u0014N\u001e÷\u008cÌ\u001812\u0094ô;\u007f>Mú\u0010\u0086\u0006\u001a\u001fC\u009fÓ¸þÌ\u001c\u009as>âZ\u0010èVä\u001dîÀ\u000b¡n\u0002.Ê¯\u009a\u001c\u008c\u0010úK\u0015Á¼\u000b|p\u000fGÍ½_\t\u008c8\u0010\fà\u0018dòvZ×\u0005£Û@GþwB\u0018\n\u001a\u000e\u0082çéÓú\u00917LA\u0017\u0017\u0083vj¨é\u001c$Jéµ";
      int var8 = "d¼¡\u0000½ád\u000e\u0014N\u001e÷\u008cÌ\u001812\u0094ô;\u007f>Mú\u0010\u0086\u0006\u001a\u001fC\u009fÓ¸þÌ\u001c\u009as>âZ\u0010èVä\u001dîÀ\u000b¡n\u0002.Ê¯\u009a\u001c\u008c\u0010úK\u0015Á¼\u000b|p\u000fGÍ½_\t\u008c8\u0010\fà\u0018dòvZ×\u0005£Û@GþwB\u0018\n\u001a\u000e\u0082çéÓú\u00917LA\u0017\u0017\u0083vj¨é\u001c$Jéµ"
         .length();
      char var5 = 24;
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
                     b = var9;
                     g = new String[8];
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

                  var6 = "\u008bl+u\u009b§@e%\u001aÓxÓ\u0080&\u008b+\u0086\u0089îzÕT\u0094\u0010ÎÑì¤ÎgY±\u008e\u0002\u009b±hs\u0007©";
                  var8 = "\u008bl+u\u009b§@e%\u001aÓxÓ\u0080&\u008b+\u0086\u0089îzÕT\u0094\u0010ÎÑì¤ÎgY±\u008e\u0002\u009b±hs\u0007©".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10072;
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
            throw new RuntimeException("f58", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("f58" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
