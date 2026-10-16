import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbv implements dxd$v9l {
   private static final Logger _3c;
   private static final ThreadPoolExecutor vgs;
   private static final gdz g9w;
   private static final gdz co8;
   private final s9r f8i;
   private final Minecraft yf_;
   private final r1l zb7;
   private final gdz huf;
   private String k0g;
   private p9u uw6;
   private long llq;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public bbv(s9r var1, r1l var2) {
      long var3 = a ^ 56373721748034L;
      super();
      this.f8i = var1;
      this.zb7 = var2;
      this.yf_ = Minecraft.vz1();
      this.huf = new gdz(a<"p">(22597, 4239762908998698315L ^ var3) + var2.s4c + a<"p">(2187, 6493231452538623367L ^ var3));
      this.uw6 = (p9u)this.yf_.l22().dry(this.huf);
   }

   @Override
   public void is9(int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bbv.a J
      // 003: ldc2_w 81434781518596
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 11
      // 00e: aload 0
      // 00f: getfield bbv.zb7 Lr1l;
      // 012: getfield r1l.mu_ Z
      // 015: iload 11
      // 017: ifne 067
      // 01a: ifne 060
      // 01d: goto 024
      // 020: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: aload 0
      // 025: getfield bbv.zb7 Lr1l;
      // 028: bipush 1
      // 029: putfield r1l.mu_ Z
      // 02c: aload 0
      // 02d: getfield bbv.zb7 Lr1l;
      // 030: ldc2_w -2
      // 033: putfield r1l.zab J
      // 036: aload 0
      // 037: getfield bbv.zb7 Lr1l;
      // 03a: ldc ""
      // 03c: nop
      // 03d: putfield r1l.o_g Ljava/lang/String;
      // 040: aload 0
      // 041: getfield bbv.zb7 Lr1l;
      // 044: ldc ""
      // 046: nop
      // 047: putfield r1l.y17 Ljava/lang/String;
      // 04a: getstatic bbv.vgs Ljava/util/concurrent/ThreadPoolExecutor;
      // 04d: new bbv$1
      // 050: dup
      // 051: aload 0
      // 052: invokespecial bbv$1.<init> (Lbbv;)V
      // 055: invokevirtual java/util/concurrent/ThreadPoolExecutor.submit (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
      // 058: pop
      // 059: goto 060
      // 05c: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield bbv.zb7 Lr1l;
      // 064: getfield r1l.e39 I
      // 067: iload 11
      // 069: ifne 080
      // 06c: bipush 47
      // 06e: if_icmple 083
      // 071: goto 078
      // 074: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: bipush 1
      // 079: goto 080
      // 07c: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: goto 084
      // 083: bipush 0
      // 084: istore 12
      // 086: aload 0
      // 087: getfield bbv.zb7 Lr1l;
      // 08a: getfield r1l.e39 I
      // 08d: iload 11
      // 08f: ifne 0a6
      // 092: bipush 47
      // 094: if_icmpge 0a9
      // 097: goto 09e
      // 09a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: bipush 1
      // 09f: goto 0a6
      // 0a2: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: goto 0aa
      // 0a9: bipush 0
      // 0aa: istore 13
      // 0ac: iload 12
      // 0ae: iload 11
      // 0b0: ifne 0d6
      // 0b3: ifne 0d5
      // 0b6: goto 0bd
      // 0b9: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: iload 13
      // 0bf: iload 11
      // 0c1: ifne 0d6
      // 0c4: goto 0cb
      // 0c7: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: ifeq 0d9
      // 0ce: goto 0d5
      // 0d1: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: bipush 1
      // 0d6: goto 0da
      // 0d9: bipush 0
      // 0da: istore 14
      // 0dc: aload 0
      // 0dd: getfield bbv.yf_ Lc05;
      // 0e0: getfield Minecraft.tx1 Lowt;
      // 0e3: aload 0
      // 0e4: getfield bbv.zb7 Lr1l;
      // 0e7: getfield r1l.bx0 Ljava/lang/String;
      // 0ea: iload 2
      // 0eb: bipush 32
      // 0ed: iadd
      // 0ee: bipush 3
      // 0ef: iadd
      // 0f0: i2f
      // 0f1: iload 3
      // 0f2: bipush 1
      // 0f3: iadd
      // 0f4: i2f
      // 0f5: ldc 16777215
      // 0f7: nop
      // 0f8: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 0fb: pop
      // 0fc: aload 0
      // 0fd: getfield bbv.yf_ Lc05;
      // 100: getfield Minecraft.tx1 Lowt;
      // 103: aload 0
      // 104: getfield bbv.zb7 Lr1l;
      // 107: getfield r1l.o_g Ljava/lang/String;
      // 10a: iload 4
      // 10c: bipush 32
      // 10e: isub
      // 10f: bipush 2
      // 110: isub
      // 111: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 114: astore 15
      // 116: bipush 0
      // 117: istore 16
      // 119: iload 16
      // 11b: aload 15
      // 11d: invokeinterface java/util/List.size ()I 1
      // 122: bipush 2
      // 123: invokestatic java/lang/Math.min (II)I
      // 126: if_icmpge 171
      // 129: aload 0
      // 12a: getfield bbv.yf_ Lc05;
      // 12d: getfield Minecraft.tx1 Lowt;
      // 130: aload 15
      // 132: iload 16
      // 134: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 139: checkcast java/lang/String
      // 13c: iload 2
      // 13d: bipush 32
      // 13f: iadd
      // 140: bipush 3
      // 141: iadd
      // 142: i2f
      // 143: iload 3
      // 144: bipush 12
      // 146: iadd
      // 147: aload 0
      // 148: getfield bbv.yf_ Lc05;
      // 14b: getfield Minecraft.tx1 Lowt;
      // 14e: getfield owt.rr7 I
      // 151: iload 16
      // 153: imul
      // 154: iadd
      // 155: i2f
      // 156: ldc 8421504
      // 158: nop
      // 159: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 15c: pop
      // 15d: iinc 16 1
      // 160: iload 11
      // 162: ifne 197
      // 165: iload 11
      // 167: ifeq 119
      // 16a: goto 171
      // 16d: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: iload 14
      // 173: ifeq 197
      // 176: new java/lang/StringBuilder
      // 179: dup
      // 17a: invokespecial java/lang/StringBuilder.<init> ()V
      // 17d: getstatic syo.id3 Lsyo;
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 183: aload 0
      // 184: getfield bbv.zb7 Lr1l;
      // 187: getfield r1l.o5_ Ljava/lang/String;
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 190: goto 19e
      // 193: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 196: athrow
      // 197: aload 0
      // 198: getfield bbv.zb7 Lr1l;
      // 19b: getfield r1l.y17 Ljava/lang/String;
      // 19e: astore 16
      // 1a0: aload 0
      // 1a1: getfield bbv.yf_ Lc05;
      // 1a4: getfield Minecraft.tx1 Lowt;
      // 1a7: aload 16
      // 1a9: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 1ac: istore 17
      // 1ae: aload 0
      // 1af: getfield bbv.yf_ Lc05;
      // 1b2: getfield Minecraft.tx1 Lowt;
      // 1b5: aload 16
      // 1b7: iload 2
      // 1b8: iload 4
      // 1ba: iadd
      // 1bb: iload 17
      // 1bd: isub
      // 1be: bipush 15
      // 1c0: isub
      // 1c1: bipush 2
      // 1c2: isub
      // 1c3: i2f
      // 1c4: iload 3
      // 1c5: bipush 1
      // 1c6: iadd
      // 1c7: i2f
      // 1c8: ldc 8421504
      // 1ca: nop
      // 1cb: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 1ce: pop
      // 1cf: bipush 0
      // 1d0: istore 18
      // 1d2: aconst_null
      // 1d3: astore 19
      // 1d5: iload 14
      // 1d7: iload 11
      // 1d9: ifne 228
      // 1dc: ifeq 221
      // 1df: goto 1e6
      // 1e2: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: bipush 5
      // 1e7: istore 20
      // 1e9: iload 12
      // 1eb: ifeq 204
      // 1ee: sipush 21286
      // 1f1: ldc2_w 2658335982246123369
      // 1f4: lload 9
      // 1f6: lxor
      // 1f7: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: nop
      // 1fd: goto 213
      // 200: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 203: athrow
      // 204: sipush 24545
      // 207: ldc2_w 7264470152318376874
      // 20a: lload 9
      // 20c: lxor
      // 20d: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: nop
      // 213: astore 21
      // 215: aload 0
      // 216: getfield bbv.zb7 Lr1l;
      // 219: getfield r1l.pmw Ljava/lang/String;
      // 21c: astore 19
      // 21e: goto 3ca
      // 221: aload 0
      // 222: getfield bbv.zb7 Lr1l;
      // 225: getfield r1l.mu_ Z
      // 228: iload 11
      // 22a: ifne 397
      // 22d: ifeq 383
      // 230: goto 237
      // 233: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 236: athrow
      // 237: aload 0
      // 238: getfield bbv.zb7 Lr1l;
      // 23b: getfield r1l.zab J
      // 23e: ldc2_w -2
      // 241: lcmp
      // 242: iload 11
      // 244: ifne 397
      // 247: goto 24e
      // 24a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24d: athrow
      // 24e: ifeq 383
      // 251: goto 258
      // 254: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 257: athrow
      // 258: aload 0
      // 259: getfield bbv.zb7 Lr1l;
      // 25c: getfield r1l.zab J
      // 25f: lconst_0
      // 260: lcmp
      // 261: iload 11
      // 263: ifne 291
      // 266: goto 26d
      // 269: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26c: athrow
      // 26d: ifge 27f
      // 270: goto 277
      // 273: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 276: athrow
      // 277: bipush 5
      // 278: istore 20
      // 27a: iload 11
      // 27c: ifeq 32d
      // 27f: aload 0
      // 280: getfield bbv.zb7 Lr1l;
      // 283: getfield r1l.zab J
      // 286: ldc2_w 150
      // 289: lcmp
      // 28a: goto 291
      // 28d: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 290: athrow
      // 291: iload 11
      // 293: ifne 2ba
      // 296: ifge 2a8
      // 299: goto 2a0
      // 29c: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29f: athrow
      // 2a0: bipush 0
      // 2a1: istore 20
      // 2a3: iload 11
      // 2a5: ifeq 32d
      // 2a8: aload 0
      // 2a9: getfield bbv.zb7 Lr1l;
      // 2ac: getfield r1l.zab J
      // 2af: ldc2_w 300
      // 2b2: lcmp
      // 2b3: goto 2ba
      // 2b6: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b9: athrow
      // 2ba: iload 11
      // 2bc: ifne 2e3
      // 2bf: ifge 2d1
      // 2c2: goto 2c9
      // 2c5: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c8: athrow
      // 2c9: bipush 1
      // 2ca: istore 20
      // 2cc: iload 11
      // 2ce: ifeq 32d
      // 2d1: aload 0
      // 2d2: getfield bbv.zb7 Lr1l;
      // 2d5: getfield r1l.zab J
      // 2d8: ldc2_w 600
      // 2db: lcmp
      // 2dc: goto 2e3
      // 2df: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e2: athrow
      // 2e3: iload 11
      // 2e5: ifne 30c
      // 2e8: ifge 2fa
      // 2eb: goto 2f2
      // 2ee: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f1: athrow
      // 2f2: bipush 2
      // 2f3: istore 20
      // 2f5: iload 11
      // 2f7: ifeq 32d
      // 2fa: aload 0
      // 2fb: getfield bbv.zb7 Lr1l;
      // 2fe: getfield r1l.zab J
      // 301: ldc2_w 1000
      // 304: lcmp
      // 305: goto 30c
      // 308: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30b: athrow
      // 30c: iload 11
      // 30e: ifne 32b
      // 311: ifge 323
      // 314: goto 31b
      // 317: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31a: athrow
      // 31b: bipush 3
      // 31c: istore 20
      // 31e: iload 11
      // 320: ifeq 32d
      // 323: bipush 4
      // 324: goto 32b
      // 327: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: istore 20
      // 32d: aload 0
      // 32e: getfield bbv.zb7 Lr1l;
      // 331: getfield r1l.zab J
      // 334: lconst_0
      // 335: lcmp
      // 336: ifge 34f
      // 339: sipush 32240
      // 33c: ldc2_w 2252025287454947767
      // 33f: lload 9
      // 341: lxor
      // 342: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: nop
      // 348: astore 21
      // 34a: iload 11
      // 34c: ifeq 3ca
      // 34f: new java/lang/StringBuilder
      // 352: dup
      // 353: invokespecial java/lang/StringBuilder.<init> ()V
      // 356: aload 0
      // 357: getfield bbv.zb7 Lr1l;
      // 35a: getfield r1l.zab J
      // 35d: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 360: sipush 7303
      // 363: ldc2_w 8103519599286163658
      // 366: lload 9
      // 368: lxor
      // 369: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36e: nop
      // 36f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 372: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 375: astore 21
      // 377: aload 0
      // 378: getfield bbv.zb7 Lr1l;
      // 37b: getfield r1l.pmw Ljava/lang/String;
      // 37e: astore 19
      // 380: goto 3ca
      // 383: bipush 1
      // 384: istore 18
      // 386: invokestatic Minecraft.qgs ()J
      // 389: ldc2_w 100
      // 38c: ldiv
      // 38d: iload 1
      // 38e: bipush 2
      // 38f: imul
      // 390: i2l
      // 391: ladd
      // 392: ldc2_w 7
      // 395: land
      // 396: l2i
      // 397: istore 20
      // 399: iload 20
      // 39b: bipush 4
      // 39c: iload 11
      // 39e: ifne 3b6
      // 3a1: if_icmple 3b9
      // 3a4: goto 3ab
      // 3a7: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3aa: athrow
      // 3ab: bipush 8
      // 3ad: iload 20
      // 3af: goto 3b6
      // 3b2: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b5: athrow
      // 3b6: isub
      // 3b7: istore 20
      // 3b9: sipush 31537
      // 3bc: ldc2_w 4554704201016147825
      // 3bf: lload 9
      // 3c1: lxor
      // 3c2: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: nop
      // 3c8: astore 21
      // 3ca: fconst_1
      // 3cb: fconst_1
      // 3cc: fconst_1
      // 3cd: fconst_1
      // 3ce: invokestatic hzu.wn0 (FFFF)V
      // 3d1: aload 0
      // 3d2: getfield bbv.yf_ Lc05;
      // 3d5: invokevirtual Minecraft.l22 ()Llc5;
      // 3d8: getstatic b0t.rt2 Lgdz;
      // 3db: invokevirtual lc5.anl (Lgdz;)V
      // 3de: iload 2
      // 3df: iload 4
      // 3e1: iadd
      // 3e2: bipush 15
      // 3e4: isub
      // 3e5: iload 3
      // 3e6: iload 18
      // 3e8: bipush 10
      // 3ea: imul
      // 3eb: i2f
      // 3ec: sipush 176
      // 3ef: iload 20
      // 3f1: bipush 8
      // 3f3: imul
      // 3f4: iadd
      // 3f5: i2f
      // 3f6: bipush 10
      // 3f8: bipush 8
      // 3fa: ldc 256.0
      // 3fc: nop
      // 3fd: ldc 256.0
      // 3ff: nop
      // 400: invokestatic b0t.vfo (IIFFIIFF)V
      // 403: aload 0
      // 404: iload 11
      // 406: ifne 45e
      // 409: getfield bbv.zb7 Lr1l;
      // 40c: invokevirtual r1l.lry ()Ljava/lang/String;
      // 40f: ifnull 45d
      // 412: goto 419
      // 415: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 418: athrow
      // 419: aload 0
      // 41a: iload 11
      // 41c: ifne 45e
      // 41f: goto 426
      // 422: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 425: athrow
      // 426: getfield bbv.zb7 Lr1l;
      // 429: invokevirtual r1l.lry ()Ljava/lang/String;
      // 42c: aload 0
      // 42d: getfield bbv.k0g Ljava/lang/String;
      // 430: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 433: ifne 45d
      // 436: goto 43d
      // 439: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43c: athrow
      // 43d: aload 0
      // 43e: aload 0
      // 43f: getfield bbv.zb7 Lr1l;
      // 442: invokevirtual r1l.lry ()Ljava/lang/String;
      // 445: putfield bbv.k0g Ljava/lang/String;
      // 448: aload 0
      // 449: invokespecial bbv.ufo ()V
      // 44c: aload 0
      // 44d: getfield bbv.f8i Ls9r;
      // 450: invokevirtual s9r.ww1 ()Lfh6;
      // 453: invokevirtual fh6._ju ()V
      // 456: goto 45d
      // 459: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45c: athrow
      // 45d: aload 0
      // 45e: iload 11
      // 460: ifne 48e
      // 463: getfield bbv.uw6 Lp9u;
      // 466: ifnull 486
      // 469: goto 470
      // 46c: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46f: athrow
      // 470: aload 0
      // 471: iload 2
      // 472: iload 3
      // 473: aload 0
      // 474: getfield bbv.huf Lgdz;
      // 477: invokevirtual bbv.vo9 (IILgdz;)V
      // 47a: iload 11
      // 47c: ifeq 496
      // 47f: goto 486
      // 482: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 485: athrow
      // 486: aload 0
      // 487: goto 48e
      // 48a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48d: athrow
      // 48e: iload 2
      // 48f: iload 3
      // 490: getstatic bbv.g9w Lgdz;
      // 493: invokevirtual bbv.vo9 (IILgdz;)V
      // 496: iload 6
      // 498: iload 2
      // 499: isub
      // 49a: istore 22
      // 49c: iload 7
      // 49e: iload 3
      // 49f: isub
      // 4a0: istore 23
      // 4a2: iload 22
      // 4a4: iload 4
      // 4a6: bipush 15
      // 4a8: isub
      // 4a9: iload 11
      // 4ab: ifne 53a
      // 4ae: if_icmplt 51b
      // 4b1: goto 4b8
      // 4b4: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b7: athrow
      // 4b8: iload 22
      // 4ba: iload 4
      // 4bc: bipush 5
      // 4bd: isub
      // 4be: iload 11
      // 4c0: ifne 53a
      // 4c3: goto 4ca
      // 4c6: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c9: athrow
      // 4ca: if_icmpgt 51b
      // 4cd: goto 4d4
      // 4d0: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d3: athrow
      // 4d4: iload 23
      // 4d6: iload 11
      // 4d8: ifne 524
      // 4db: goto 4e2
      // 4de: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e1: athrow
      // 4e2: iflt 51b
      // 4e5: goto 4ec
      // 4e8: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4eb: athrow
      // 4ec: iload 23
      // 4ee: bipush 8
      // 4f0: iload 11
      // 4f2: ifne 53a
      // 4f5: goto 4fc
      // 4f8: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fb: athrow
      // 4fc: if_icmpgt 51b
      // 4ff: goto 506
      // 502: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 505: athrow
      // 506: aload 0
      // 507: getfield bbv.f8i Ls9r;
      // 50a: aload 21
      // 50c: invokevirtual s9r.nz8 (Ljava/lang/String;)V
      // 50f: iload 11
      // 511: ifeq 59e
      // 514: goto 51b
      // 517: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51a: athrow
      // 51b: iload 22
      // 51d: goto 524
      // 520: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 523: athrow
      // 524: iload 11
      // 526: ifne 5a8
      // 529: iload 4
      // 52b: iload 17
      // 52d: isub
      // 52e: bipush 15
      // 530: isub
      // 531: bipush 2
      // 532: isub
      // 533: goto 53a
      // 536: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 539: athrow
      // 53a: if_icmplt 59e
      // 53d: iload 22
      // 53f: iload 11
      // 541: ifne 5a8
      // 544: goto 54b
      // 547: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54a: athrow
      // 54b: iload 4
      // 54d: bipush 15
      // 54f: isub
      // 550: bipush 2
      // 551: isub
      // 552: if_icmpgt 59e
      // 555: goto 55c
      // 558: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55b: athrow
      // 55c: iload 23
      // 55e: iload 11
      // 560: ifne 5a8
      // 563: goto 56a
      // 566: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 569: athrow
      // 56a: iflt 59e
      // 56d: goto 574
      // 570: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 573: athrow
      // 574: iload 23
      // 576: iload 11
      // 578: ifne 5a8
      // 57b: goto 582
      // 57e: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 581: athrow
      // 582: bipush 8
      // 584: if_icmpgt 59e
      // 587: goto 58e
      // 58a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58d: athrow
      // 58e: aload 0
      // 58f: getfield bbv.f8i Ls9r;
      // 592: aload 19
      // 594: invokevirtual s9r.nz8 (Ljava/lang/String;)V
      // 597: goto 59e
      // 59a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59d: athrow
      // 59e: aload 0
      // 59f: getfield bbv.yf_ Lc05;
      // 5a2: getfield Minecraft.oxn Lmoh;
      // 5a5: getfield moh.mg8 Z
      // 5a8: iload 11
      // 5aa: ifne 602
      // 5ad: ifne 5cf
      // 5b0: goto 5b7
      // 5b3: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b6: athrow
      // 5b7: iload 8
      // 5b9: iload 11
      // 5bb: ifne 602
      // 5be: goto 5c5
      // 5c1: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c4: athrow
      // 5c5: ifeq 78f
      // 5c8: goto 5cf
      // 5cb: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ce: athrow
      // 5cf: aload 0
      // 5d0: getfield bbv.yf_ Lc05;
      // 5d3: invokevirtual Minecraft.l22 ()Llc5;
      // 5d6: getstatic bbv.co8 Lgdz;
      // 5d9: invokevirtual lc5.anl (Lgdz;)V
      // 5dc: iload 2
      // 5dd: i2f
      // 5de: iload 3
      // 5df: i2f
      // 5e0: iload 2
      // 5e1: bipush 32
      // 5e3: iadd
      // 5e4: i2f
      // 5e5: iload 3
      // 5e6: bipush 32
      // 5e8: iadd
      // 5e9: i2f
      // 5ea: ldc -1601138544
      // 5ec: nop
      // 5ed: invokestatic b0t.df9 (FFFFI)V
      // 5f0: fconst_1
      // 5f1: fconst_1
      // 5f2: fconst_1
      // 5f3: fconst_1
      // 5f4: invokestatic hzu.wn0 (FFFF)V
      // 5f7: iload 6
      // 5f9: iload 2
      // 5fa: isub
      // 5fb: goto 602
      // 5fe: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 601: athrow
      // 602: istore 24
      // 604: iload 7
      // 606: iload 3
      // 607: isub
      // 608: istore 25
      // 60a: aload 0
      // 60b: invokespecial bbv.xmu ()Z
      // 60e: iload 11
      // 610: ifne 691
      // 613: ifeq 688
      // 616: goto 61d
      // 619: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61c: athrow
      // 61d: iload 24
      // 61f: bipush 32
      // 621: iload 11
      // 623: ifne 679
      // 626: goto 62d
      // 629: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62c: athrow
      // 62d: if_icmpge 670
      // 630: goto 637
      // 633: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 636: athrow
      // 637: iload 24
      // 639: bipush 16
      // 63b: iload 11
      // 63d: ifne 679
      // 640: goto 647
      // 643: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 646: athrow
      // 647: if_icmple 670
      // 64a: goto 651
      // 64d: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 650: athrow
      // 651: iload 2
      // 652: iload 3
      // 653: fconst_0
      // 654: ldc 32.0
      // 656: nop
      // 657: bipush 32
      // 659: bipush 32
      // 65b: ldc 256.0
      // 65d: nop
      // 65e: ldc 256.0
      // 660: nop
      // 661: invokestatic b0t.vfo (IIFFIIFF)V
      // 664: iload 11
      // 666: ifeq 688
      // 669: goto 670
      // 66c: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66f: athrow
      // 670: iload 2
      // 671: iload 3
      // 672: goto 679
      // 675: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 678: athrow
      // 679: fconst_0
      // 67a: fconst_0
      // 67b: bipush 32
      // 67d: bipush 32
      // 67f: ldc 256.0
      // 681: nop
      // 682: ldc 256.0
      // 684: nop
      // 685: invokestatic b0t.vfo (IIFFIIFF)V
      // 688: aload 0
      // 689: getfield bbv.f8i Ls9r;
      // 68c: aload 0
      // 68d: iload 1
      // 68e: invokevirtual s9r.rlg (Lbbv;I)Z
      // 691: iload 11
      // 693: ifne 718
      // 696: ifeq 70f
      // 699: goto 6a0
      // 69c: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69f: athrow
      // 6a0: iload 24
      // 6a2: bipush 16
      // 6a4: iload 11
      // 6a6: ifne 6fe
      // 6a9: goto 6b0
      // 6ac: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6af: athrow
      // 6b0: if_icmpge 6f5
      // 6b3: goto 6ba
      // 6b6: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b9: athrow
      // 6ba: iload 25
      // 6bc: bipush 16
      // 6be: iload 11
      // 6c0: ifne 6fe
      // 6c3: goto 6ca
      // 6c6: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c9: athrow
      // 6ca: if_icmpge 6f5
      // 6cd: goto 6d4
      // 6d0: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d3: athrow
      // 6d4: iload 2
      // 6d5: iload 3
      // 6d6: ldc 96.0
      // 6d8: nop
      // 6d9: ldc 32.0
      // 6db: nop
      // 6dc: bipush 32
      // 6de: bipush 32
      // 6e0: ldc 256.0
      // 6e2: nop
      // 6e3: ldc 256.0
      // 6e5: nop
      // 6e6: invokestatic b0t.vfo (IIFFIIFF)V
      // 6e9: iload 11
      // 6eb: ifeq 70f
      // 6ee: goto 6f5
      // 6f1: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f4: athrow
      // 6f5: iload 2
      // 6f6: iload 3
      // 6f7: goto 6fe
      // 6fa: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6fd: athrow
      // 6fe: ldc 96.0
      // 700: nop
      // 701: fconst_0
      // 702: bipush 32
      // 704: bipush 32
      // 706: ldc 256.0
      // 708: nop
      // 709: ldc 256.0
      // 70b: nop
      // 70c: invokestatic b0t.vfo (IIFFIIFF)V
      // 70f: aload 0
      // 710: getfield bbv.f8i Ls9r;
      // 713: aload 0
      // 714: iload 1
      // 715: invokevirtual s9r.fb6 (Lbbv;I)Z
      // 718: iload 11
      // 71a: ifne 729
      // 71d: ifeq 78f
      // 720: goto 727
      // 723: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 726: athrow
      // 727: iload 24
      // 729: bipush 16
      // 72b: iload 11
      // 72d: ifne 77e
      // 730: if_icmpge 775
      // 733: goto 73a
      // 736: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 739: athrow
      // 73a: iload 25
      // 73c: bipush 16
      // 73e: iload 11
      // 740: ifne 77e
      // 743: goto 74a
      // 746: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 749: athrow
      // 74a: if_icmple 775
      // 74d: goto 754
      // 750: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 753: athrow
      // 754: iload 2
      // 755: iload 3
      // 756: ldc 64.0
      // 758: nop
      // 759: ldc 32.0
      // 75b: nop
      // 75c: bipush 32
      // 75e: bipush 32
      // 760: ldc 256.0
      // 762: nop
      // 763: ldc 256.0
      // 765: nop
      // 766: invokestatic b0t.vfo (IIFFIIFF)V
      // 769: iload 11
      // 76b: ifeq 78f
      // 76e: goto 775
      // 771: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 774: athrow
      // 775: iload 2
      // 776: iload 3
      // 777: goto 77e
      // 77a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77d: athrow
      // 77e: ldc 64.0
      // 780: nop
      // 781: fconst_0
      // 782: bipush 32
      // 784: bipush 32
      // 786: ldc 256.0
      // 788: nop
      // 789: ldc 256.0
      // 78b: nop
      // 78c: invokestatic b0t.vfo (IIFFIIFF)V
      // 78f: return
   }

   public void vo9(int var1, int var2, gdz var3) {
      this.yf_.l22().anl(var3);
      hzu.spd();
      b0t.vfo(var1, var2, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
      hzu.ux6();
   }

   private boolean xmu() {
      return true;
   }

   private void ufo() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bbv.a J
      // 003: ldc2_w 70676999273062
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield bbv.zb7 Lr1l;
      // 010: invokevirtual r1l.lry ()Ljava/lang/String;
      // 013: iload 3
      // 014: ifeq 04d
      // 017: ifnonnull 03f
      // 01a: goto 021
      // 01d: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 0
      // 022: getfield bbv.yf_ Lc05;
      // 025: invokevirtual Minecraft.l22 ()Llc5;
      // 028: aload 0
      // 029: getfield bbv.huf Lgdz;
      // 02c: invokevirtual lc5.cez (Lgdz;)V
      // 02f: aload 0
      // 030: aconst_null
      // 031: putfield bbv.uw6 Lp9u;
      // 034: iload 3
      // 035: ifne 1ca
      // 038: goto 03f
      // 03b: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield bbv.zb7 Lr1l;
      // 043: invokevirtual r1l.lry ()Ljava/lang/String;
      // 046: goto 04d
      // 049: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: getstatic com/google/common/base/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 050: invokestatic io/netty/buffer/Unpooled.copiedBuffer (Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)Lio/netty/buffer/ByteBuf;
      // 053: astore 4
      // 055: aload 4
      // 057: invokestatic io/netty/handler/codec/base64/Base64.decode (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
      // 05a: astore 5
      // 05c: new io/netty/buffer/ByteBufInputStream
      // 05f: dup
      // 060: aload 5
      // 062: invokespecial io/netty/buffer/ByteBufInputStream.<init> (Lio/netty/buffer/ByteBuf;)V
      // 065: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 068: astore 6
      // 06a: aload 6
      // 06c: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 06f: iload 3
      // 070: ifeq 087
      // 073: bipush 64
      // 075: if_icmpne 08a
      // 078: goto 07f
      // 07b: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: bipush 1
      // 080: goto 087
      // 083: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: goto 08b
      // 08a: bipush 0
      // 08b: sipush 24115
      // 08e: ldc2_w 6475102162819328789
      // 091: lload 1
      // 092: lxor
      // 093: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: nop
      // 099: bipush 0
      // 09a: anewarray 23
      // 09d: invokestatic org/apache/commons/lang3/Validate.validState (ZLjava/lang/String;[Ljava/lang/Object;)V
      // 0a0: aload 6
      // 0a2: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 0a5: iload 3
      // 0a6: ifeq 0bd
      // 0a9: bipush 64
      // 0ab: if_icmpne 0c0
      // 0ae: goto 0b5
      // 0b1: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: bipush 1
      // 0b6: goto 0bd
      // 0b9: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: goto 0c1
      // 0c0: bipush 0
      // 0c1: sipush 19742
      // 0c4: ldc2_w 1871586657624176688
      // 0c7: lload 1
      // 0c8: lxor
      // 0c9: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: nop
      // 0cf: bipush 0
      // 0d0: anewarray 23
      // 0d3: invokestatic org/apache/commons/lang3/Validate.validState (ZLjava/lang/String;[Ljava/lang/Object;)V
      // 0d6: aload 4
      // 0d8: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 0db: pop
      // 0dc: aload 5
      // 0de: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 0e1: pop
      // 0e2: goto 163
      // 0e5: astore 7
      // 0e7: getstatic bbv._3c Lorg/apache/logging/log4j/Logger;
      // 0ea: new java/lang/StringBuilder
      // 0ed: dup
      // 0ee: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f1: sipush 22848
      // 0f4: ldc2_w 7950912705056648300
      // 0f7: lload 1
      // 0f8: lxor
      // 0f9: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: nop
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: aload 0
      // 103: getfield bbv.zb7 Lr1l;
      // 106: getfield r1l.bx0 Ljava/lang/String;
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10c: sipush 26511
      // 10f: ldc2_w 2659651965364212396
      // 112: lload 1
      // 113: lxor
      // 114: invokedynamic p (IJ)Ljava/lang/String; bsm=bbv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: nop
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: aload 0
      // 11e: getfield bbv.zb7 Lr1l;
      // 121: getfield r1l.s4c Ljava/lang/String;
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: ldc ")"
      // 129: nop
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 130: aload 7
      // 132: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 137: aload 0
      // 138: getfield bbv.zb7 Lr1l;
      // 13b: aconst_null
      // 13c: checkcast java/lang/String
      // 13f: invokevirtual r1l.nla (Ljava/lang/String;)V
      // 142: aload 4
      // 144: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 147: pop
      // 148: aload 5
      // 14a: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 14d: pop
      // 14e: goto 162
      // 151: astore 8
      // 153: aload 4
      // 155: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 158: pop
      // 159: aload 5
      // 15b: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 15e: pop
      // 15f: aload 8
      // 161: athrow
      // 162: return
      // 163: aload 0
      // 164: getfield bbv.uw6 Lp9u;
      // 167: iload 3
      // 168: ifeq 1c7
      // 16b: ifnonnull 1a4
      // 16e: goto 175
      // 171: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: aload 0
      // 176: new p9u
      // 179: dup
      // 17a: aload 6
      // 17c: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 17f: aload 6
      // 181: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 184: invokespecial p9u.<init> (II)V
      // 187: putfield bbv.uw6 Lp9u;
      // 18a: aload 0
      // 18b: getfield bbv.yf_ Lc05;
      // 18e: invokevirtual Minecraft.l22 ()Llc5;
      // 191: aload 0
      // 192: getfield bbv.huf Lgdz;
      // 195: aload 0
      // 196: getfield bbv.uw6 Lp9u;
      // 199: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 19c: pop
      // 19d: goto 1a4
      // 1a0: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: aload 6
      // 1a6: bipush 0
      // 1a7: bipush 0
      // 1a8: aload 6
      // 1aa: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 1ad: aload 6
      // 1af: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 1b2: aload 0
      // 1b3: getfield bbv.uw6 Lp9u;
      // 1b6: invokevirtual p9u.k8b ()[I
      // 1b9: bipush 0
      // 1ba: aload 6
      // 1bc: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 1bf: invokevirtual java/awt/image/BufferedImage.getRGB (IIII[III)[I
      // 1c2: pop
      // 1c3: aload 0
      // 1c4: getfield bbv.uw6 Lp9u;
      // 1c7: invokevirtual p9u.oj6 ()V
      // 1ca: return
   }

   @Override
   public boolean r6b(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 7
      // 005: iload 5
      // 007: iload 7
      // 009: ifne 14b
      // 00c: bipush 32
      // 00e: if_icmpgt 137
      // 011: goto 018
      // 014: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: iload 5
      // 01a: bipush 32
      // 01c: iload 7
      // 01e: ifne 07f
      // 021: goto 028
      // 024: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: if_icmpge 07b
      // 02b: goto 032
      // 02e: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: iload 5
      // 034: bipush 16
      // 036: iload 7
      // 038: ifne 07f
      // 03b: goto 042
      // 03e: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: if_icmple 07b
      // 045: goto 04c
      // 048: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: invokespecial bbv.xmu ()Z
      // 050: iload 7
      // 052: ifne 07d
      // 055: goto 05c
      // 058: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: ifeq 07b
      // 05f: goto 066
      // 062: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: aload 0
      // 067: getfield bbv.f8i Ls9r;
      // 06a: iload 1
      // 06b: invokevirtual s9r.gzd (I)V
      // 06e: aload 0
      // 06f: getfield bbv.f8i Ls9r;
      // 072: invokevirtual s9r.s5e ()V
      // 075: bipush 1
      // 076: ireturn
      // 077: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: iload 5
      // 07d: bipush 16
      // 07f: iload 7
      // 081: ifne 0e9
      // 084: if_icmpge 0d9
      // 087: goto 08e
      // 08a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: iload 6
      // 090: bipush 16
      // 092: iload 7
      // 094: ifne 0e9
      // 097: goto 09e
      // 09a: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: if_icmpge 0d9
      // 0a1: goto 0a8
      // 0a4: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: getfield bbv.f8i Ls9r;
      // 0ac: aload 0
      // 0ad: iload 1
      // 0ae: invokevirtual s9r.rlg (Lbbv;I)Z
      // 0b1: iload 7
      // 0b3: ifne 0db
      // 0b6: goto 0bd
      // 0b9: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: ifeq 0d9
      // 0c0: goto 0c7
      // 0c3: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield bbv.f8i Ls9r;
      // 0cb: aload 0
      // 0cc: iload 1
      // 0cd: invokestatic ShaderHelper.dmk ()Z
      // 0d0: invokevirtual s9r.etp (Lbbv;IZ)V
      // 0d3: bipush 1
      // 0d4: ireturn
      // 0d5: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: iload 5
      // 0db: iload 7
      // 0dd: ifne 14b
      // 0e0: bipush 16
      // 0e2: goto 0e9
      // 0e5: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: if_icmpge 137
      // 0ec: iload 6
      // 0ee: iload 7
      // 0f0: ifne 14b
      // 0f3: goto 0fa
      // 0f6: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: bipush 16
      // 0fc: if_icmple 137
      // 0ff: goto 106
      // 102: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: aload 0
      // 107: getfield bbv.f8i Ls9r;
      // 10a: aload 0
      // 10b: iload 1
      // 10c: invokevirtual s9r.fb6 (Lbbv;I)Z
      // 10f: iload 7
      // 111: ifne 14b
      // 114: goto 11b
      // 117: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: ifeq 137
      // 11e: goto 125
      // 121: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 0
      // 126: getfield bbv.f8i Ls9r;
      // 129: aload 0
      // 12a: iload 1
      // 12b: invokestatic ShaderHelper.dmk ()Z
      // 12e: invokevirtual s9r.pfh (Lbbv;IZ)V
      // 131: bipush 1
      // 132: ireturn
      // 133: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: aload 0
      // 138: getfield bbv.f8i Ls9r;
      // 13b: iload 1
      // 13c: invokevirtual s9r.gzd (I)V
      // 13f: invokestatic Minecraft.qgs ()J
      // 142: aload 0
      // 143: getfield bbv.llq J
      // 146: lsub
      // 147: ldc2_w 250
      // 14a: lcmp
      // 14b: iload 7
      // 14d: ifne 170
      // 150: ifge 168
      // 153: goto 15a
      // 156: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: aload 0
      // 15b: getfield bbv.f8i Ls9r;
      // 15e: invokevirtual s9r.s5e ()V
      // 161: goto 168
      // 164: invokestatic bbv.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: aload 0
      // 169: invokestatic Minecraft.qgs ()J
      // 16c: putfield bbv.llq J
      // 16f: bipush 0
      // 170: ireturn
   }

   @Override
   public void _at(int var1, int var2, int var3) {
   }

   @Override
   public void l_a(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public r1l tc3() {
      return this.zb7;
   }

   public static r1l tcw(bbv var0) {
      return var0.zb7;
   }

   public static s9r la_(bbv var0) {
      return var0.f8i;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7364713588973621506L, -3479939966717751609L, MethodHandles.lookup().lookupClass()).a(97264934233026L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 50840581987178L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[14];
      int var5 = 0;
      String var4 = "\u0087àâÏeÇmdQ!TÅáã\u009f\f0ª\u008d¹ë\u001d\u0013\u0093é\u00adöìf\u0084½ÆÑü÷\u0019·ã;\u008f\u0010`oe\u001a\u0010`Ü7\u008d%Æ\u0086+¬:µ8\u0000ì]\\\"\u001dü\u000f!ì×ònÞ\u007f\u0014\u0089½\u0003Èâr\u0005uLøó-<Ba\u0098tó\u009du\\Ç\u008b½\u008eü,hí\u001f\u0086¤ïG\u0098ô¤îñ\u0014(\u0005\u0095=ËH6J\u000eâ\u0092¶?\u0016Ñz\f;\u0098-é5*\u0005y+\u0098\\ìß\u009fþÈpM/\u0000º\u0087ÉÙ \u0097²\u0018 õ\tEA\u0015² \t¯Ú+;\u0006zNê'âÁ\bZ!ò\u00973\u0001CK(\u000eXPâÏl\u001a\u001a\u001bhâ\u0016ÚjÊ-/(\u008d\u0085\u001a´\u009eôZHÌo\u0096hf¤Ð\u001aj\u001eª0\u0090Á\u0010ÁÖjê`,d\u0087Ô\u0018K \u0010y\u00118(#9uÖxl¯\u0081Ê\u0086\u0087>A^,k¤wã¨øß\u0003\u0095¹\u000f\u009bÇLÝjúÜ\u0005'1\u0093\u0088ËÖ ¢Sø\u0084\u0000Éqß1\u0011E\u001d\t\u0000 \u0086(ëÜ)¾ÅòM²\u001cÅ\u0098\u0089j±G@®^\u000b`\u0013\u0011L\u009f\u0098p½Å^]î`\u008c¯¡É¼·'4ZÇ0á6µ\u0016\u0096^=d\u0093£Sª7RW\u00134;\u0093¦à\u008b']s\u0003fF©ß\u0081\u009e\u008c\bf\u0080HHçÌ\u0010\u0004ÃG!\u008dq=åìÉsxÊãÄ\u0013\u0018\t$RBä\t)Ô±\u0084ML\u000bC\u009b~îê_é>\u008c\u0095\u0001\u0015`lj´¨Ew]Ìs\u001d^\"ôû\bÄl\"\u009fT÷\u007f\u0007Ô\f) ¡\u0000\",<ÄhEyQD\u00052oO>ÐP±³Ó\u0097\u0010ûjÓ\rY@[ÖJ";
      int var6 = "\u0087àâÏeÇmdQ!TÅáã\u009f\f0ª\u008d¹ë\u001d\u0013\u0093é\u00adöìf\u0084½ÆÑü÷\u0019·ã;\u008f\u0010`oe\u001a\u0010`Ü7\u008d%Æ\u0086+¬:µ8\u0000ì]\\\"\u001dü\u000f!ì×ònÞ\u007f\u0014\u0089½\u0003Èâr\u0005uLøó-<Ba\u0098tó\u009du\\Ç\u008b½\u008eü,hí\u001f\u0086¤ïG\u0098ô¤îñ\u0014(\u0005\u0095=ËH6J\u000eâ\u0092¶?\u0016Ñz\f;\u0098-é5*\u0005y+\u0098\\ìß\u009fþÈpM/\u0000º\u0087ÉÙ \u0097²\u0018 õ\tEA\u0015² \t¯Ú+;\u0006zNê'âÁ\bZ!ò\u00973\u0001CK(\u000eXPâÏl\u001a\u001a\u001bhâ\u0016ÚjÊ-/(\u008d\u0085\u001a´\u009eôZHÌo\u0096hf¤Ð\u001aj\u001eª0\u0090Á\u0010ÁÖjê`,d\u0087Ô\u0018K \u0010y\u00118(#9uÖxl¯\u0081Ê\u0086\u0087>A^,k¤wã¨øß\u0003\u0095¹\u000f\u009bÇLÝjúÜ\u0005'1\u0093\u0088ËÖ ¢Sø\u0084\u0000Éqß1\u0011E\u001d\t\u0000 \u0086(ëÜ)¾ÅòM²\u001cÅ\u0098\u0089j±G@®^\u000b`\u0013\u0011L\u009f\u0098p½Å^]î`\u008c¯¡É¼·'4ZÇ0á6µ\u0016\u0096^=d\u0093£Sª7RW\u00134;\u0093¦à\u008b']s\u0003fF©ß\u0081\u009e\u008c\bf\u0080HHçÌ\u0010\u0004ÃG!\u008dq=åìÉsxÊãÄ\u0013\u0018\t$RBä\t)Ô±\u0084ML\u000bC\u009b~îê_é>\u008c\u0095\u0001\u0015`lj´¨Ew]Ìs\u001d^\"ôû\bÄl\"\u009fT÷\u007f\u0007Ô\f) ¡\u0000\",<ÄhEyQD\u00052oO>ÐP±³Ó\u0097\u0010ûjÓ\rY@[ÖJ"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[14];
                     _3c = LogManager.getLogger();
                     vgs = new ScheduledThreadPoolExecutor(
                        5, new ThreadFactoryBuilder().setNameFormat(a<"p">(29214, 7845665378518017593L ^ var9)).setDaemon(true).build()
                     );
                     g9w = new gdz(a<"p">(30268, 6731012426231915031L ^ var9));
                     co8 = new gdz(a<"p">(3387, 2525165520307706131L ^ var9));
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

                  var4 = "\u008dtÜ\u0003úÙ@\t\u001f\u0002Óõ¤\u0006,õ\u000b\u008fZ\"¼âó\u0094£MDS\u0019-(0\u0010\u00863¤ëxÀóC\u0088«\u0001YýÓ\u0081´";
                  var6 = "\u008dtÜ\u0003úÙ@\t\u001f\u0002Óõ¤\u0006,õ\u000b\u008fZ\"¼âó\u0094£MDS\u0019-(0\u0010\u00863¤ëxÀóC\u0088«\u0001YýÓ\u0081´".length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22026;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("bbv", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("bbv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
