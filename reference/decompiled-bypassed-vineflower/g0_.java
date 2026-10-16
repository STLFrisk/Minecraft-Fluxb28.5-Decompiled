import com.google.common.collect.Maps;
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

public abstract class g0_ implements gnj {
   public static final gdz wky;
   public g6r f8y;
   public g6r rna;
   private final gmu esu;
   private float jfh = 1.0F;
   private float xvp = 1.0F;
   private float ydz = 1.0F;
   private float rvl = 1.0F;
   private boolean h4_;
   private static final Map ts7;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public g0_(gmu var1) {
      this.esu = var1;
      this.x8r();
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.b6n(var1, var2, var3, var4, var5, var6, var7, var8, 4);
      this.b6n(var1, var2, var3, var4, var5, var6, var7, var8, 3);
      this.b6n(var1, var2, var3, var4, var5, var6, var7, var8, 2);
      this.b6n(var1, var2, var3, var4, var5, var6, var7, var8, 1);
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   private void b6n(g_3 param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g0_.a J
      // 003: ldc2_w 130777369136055
      // 006: lxor
      // 007: lstore 10
      // 009: invokestatic t9d.b ()I
      // 00c: istore 12
      // 00e: aload 0
      // 00f: aload 1
      // 010: iload 9
      // 012: invokevirtual g0_.s3c (Lg_3;I)Lerg;
      // 015: astore 13
      // 017: aload 13
      // 019: iload 12
      // 01b: ifeq 02a
      // 01e: ifnull 494
      // 021: goto 028
      // 024: invokestatic g0_.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 13
      // 02a: invokevirtual erg.gn1 ()Lu7m;
      // 02d: iload 12
      // 02f: ifeq 04b
      // 032: instanceof jpt
      // 035: ifeq 494
      // 038: goto 03f
      // 03b: invokestatic g0_.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 13
      // 041: invokevirtual erg.gn1 ()Lu7m;
      // 044: goto 04b
      // 047: invokestatic g0_.a (Loov;)Loov;
      // 04a: athrow
      // 04b: checkcast jpt
      // 04e: astore 14
      // 050: aload 0
      // 051: iload 9
      // 053: invokevirtual g0_.yu8 (I)Lg6r;
      // 056: astore 15
      // 058: aload 15
      // 05a: aload 0
      // 05b: getfield g0_.esu Lgmu;
      // 05e: invokevirtual gmu.fy4 ()Lg6r;
      // 061: invokevirtual g6r.jxr (Lg6r;)V
      // 064: aload 15
      // 066: aload 1
      // 067: fload 2
      // 068: fload 3
      // 069: fload 4
      // 06b: invokevirtual g6r.v3g (Lg_3;FFF)V
      // 06e: getstatic net/optifine/reflect/Reflector.ForgeHooksClient Lnet/optifine/reflect/ReflectorClass;
      // 071: invokevirtual net/optifine/reflect/ReflectorClass.exists ()Z
      // 074: iload 12
      // 076: ifeq 09e
      // 079: ifeq 090
      // 07c: goto 083
      // 07f: invokestatic g0_.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 0
      // 084: aload 1
      // 085: aload 13
      // 087: iload 9
      // 089: aload 15
      // 08b: invokevirtual g0_.xh5 (Lg_3;Lerg;ILg6r;)Lg6r;
      // 08e: astore 15
      // 090: aload 0
      // 091: aload 15
      // 093: iload 9
      // 095: invokevirtual g0_.rqn (Lg6r;I)V
      // 098: aload 0
      // 099: iload 9
      // 09b: invokespecial g0_.nyo (I)Z
      // 09e: istore 16
      // 0a0: invokestatic hxt.bdl ()Z
      // 0a3: iload 12
      // 0a5: ifeq 0f4
      // 0a8: ifeq 0e7
      // 0ab: goto 0b2
      // 0ae: invokestatic g0_.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 13
      // 0b4: iload 16
      // 0b6: iload 12
      // 0b8: ifeq 0cd
      // 0bb: goto 0c2
      // 0be: invokestatic g0_.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: ifeq 0d0
      // 0c5: goto 0cc
      // 0c8: invokestatic g0_.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: bipush 2
      // 0cd: goto 0d1
      // 0d0: bipush 1
      // 0d1: aconst_null
      // 0d2: checkcast java/lang/String
      // 0d5: invokestatic net/optifine/CustomItems.bindCustomArmorTexture (Lerg;ILjava/lang/String;)Z
      // 0d8: iload 12
      // 0da: ifeq 147
      // 0dd: ifne 141
      // 0e0: goto 0e7
      // 0e3: invokestatic g0_.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getArmorTexture Lnet/optifine/reflect/ReflectorMethod;
      // 0ea: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0ed: goto 0f4
      // 0f0: invokestatic g0_.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: ifeq 12b
      // 0f7: aload 0
      // 0f8: getfield g0_.esu Lgmu;
      // 0fb: aload 0
      // 0fc: aload 1
      // 0fd: aload 13
      // 0ff: iload 16
      // 101: iload 12
      // 103: ifeq 118
      // 106: goto 10d
      // 109: invokestatic g0_.a (Loov;)Loov;
      // 10c: athrow
      // 10d: ifeq 11b
      // 110: goto 117
      // 113: invokestatic g0_.a (Loov;)Loov;
      // 116: athrow
      // 117: bipush 2
      // 118: goto 11c
      // 11b: bipush 1
      // 11c: aconst_null
      // 11d: checkcast java/lang/String
      // 120: invokevirtual g0_.ap6 (Li2h;Lerg;ILjava/lang/String;)Lgdz;
      // 123: invokevirtual gmu.gu4 (Lgdz;)V
      // 126: iload 12
      // 128: ifne 141
      // 12b: aload 0
      // 12c: getfield g0_.esu Lgmu;
      // 12f: aload 0
      // 130: aload 14
      // 132: iload 16
      // 134: invokespecial g0_.fy0 (Ljpt;Z)Lgdz;
      // 137: invokevirtual gmu.gu4 (Lgdz;)V
      // 13a: goto 141
      // 13d: invokestatic g0_.a (Loov;)Loov;
      // 140: athrow
      // 141: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getArmorTexture Lnet/optifine/reflect/ReflectorMethod;
      // 144: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 147: iload 12
      // 149: ifeq 302
      // 14c: ifeq 2f6
      // 14f: goto 156
      // 152: invokestatic g0_.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 14
      // 158: aload 13
      // 15a: invokestatic net/optifine/reflect/ReflectorForge.armorHasOverlay (Ljpt;Lerg;)Z
      // 15d: iload 12
      // 15f: ifeq 281
      // 162: goto 169
      // 165: invokestatic g0_.a (Loov;)Loov;
      // 168: athrow
      // 169: ifeq 25a
      // 16c: goto 173
      // 16f: invokestatic g0_.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 14
      // 175: aload 13
      // 177: invokevirtual jpt.slc (Lerg;)I
      // 17a: istore 17
      // 17c: iload 17
      // 17e: bipush 16
      // 180: ishr
      // 181: sipush 255
      // 184: iand
      // 185: i2f
      // 186: ldc 255.0
      // 188: nop
      // 189: fdiv
      // 18a: fstore 18
      // 18c: iload 17
      // 18e: bipush 8
      // 190: ishr
      // 191: sipush 255
      // 194: iand
      // 195: i2f
      // 196: ldc 255.0
      // 198: nop
      // 199: fdiv
      // 19a: fstore 19
      // 19c: iload 17
      // 19e: sipush 255
      // 1a1: iand
      // 1a2: i2f
      // 1a3: ldc 255.0
      // 1a5: nop
      // 1a6: fdiv
      // 1a7: fstore 20
      // 1a9: aload 0
      // 1aa: iload 12
      // 1ac: ifeq 228
      // 1af: getfield g0_.xvp F
      // 1b2: fload 18
      // 1b4: fmul
      // 1b5: aload 0
      // 1b6: getfield g0_.ydz F
      // 1b9: fload 19
      // 1bb: fmul
      // 1bc: aload 0
      // 1bd: getfield g0_.rvl F
      // 1c0: fload 20
      // 1c2: fmul
      // 1c3: aload 0
      // 1c4: getfield g0_.jfh F
      // 1c7: invokestatic hzu.wn0 (FFFF)V
      // 1ca: aload 15
      // 1cc: aload 1
      // 1cd: fload 2
      // 1ce: fload 3
      // 1cf: fload 5
      // 1d1: fload 6
      // 1d3: fload 7
      // 1d5: fload 8
      // 1d7: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 1da: invokestatic hxt.bdl ()Z
      // 1dd: ifeq 227
      // 1e0: goto 1e7
      // 1e3: invokestatic g0_.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: aload 13
      // 1e9: iload 16
      // 1eb: iload 12
      // 1ed: ifeq 202
      // 1f0: goto 1f7
      // 1f3: invokestatic g0_.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: ifeq 205
      // 1fa: goto 201
      // 1fd: invokestatic g0_.a (Loov;)Loov;
      // 200: athrow
      // 201: bipush 2
      // 202: goto 206
      // 205: bipush 1
      // 206: sipush 15411
      // 209: ldc2_w 7231250784701227445
      // 20c: lload 10
      // 20e: lxor
      // 20f: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: nop
      // 215: invokestatic net/optifine/CustomItems.bindCustomArmorTexture (Lerg;ILjava/lang/String;)Z
      // 218: iload 12
      // 21a: ifeq 281
      // 21d: ifne 25a
      // 220: goto 227
      // 223: invokestatic g0_.a (Loov;)Loov;
      // 226: athrow
      // 227: aload 0
      // 228: getfield g0_.esu Lgmu;
      // 22b: aload 0
      // 22c: aload 1
      // 22d: aload 13
      // 22f: iload 16
      // 231: iload 12
      // 233: ifeq 241
      // 236: ifeq 244
      // 239: goto 240
      // 23c: invokestatic g0_.a (Loov;)Loov;
      // 23f: athrow
      // 240: bipush 2
      // 241: goto 245
      // 244: bipush 1
      // 245: sipush 13060
      // 248: ldc2_w 1214694334723108487
      // 24b: lload 10
      // 24d: lxor
      // 24e: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: nop
      // 254: invokevirtual g0_.ap6 (Li2h;Lerg;ILjava/lang/String;)Lgdz;
      // 257: invokevirtual gmu.gu4 (Lgdz;)V
      // 25a: aload 0
      // 25b: getfield g0_.xvp F
      // 25e: aload 0
      // 25f: getfield g0_.ydz F
      // 262: aload 0
      // 263: getfield g0_.rvl F
      // 266: aload 0
      // 267: getfield g0_.jfh F
      // 26a: invokestatic hzu.wn0 (FFFF)V
      // 26d: aload 15
      // 26f: aload 1
      // 270: fload 2
      // 271: fload 3
      // 272: fload 5
      // 274: fload 6
      // 276: fload 7
      // 278: fload 8
      // 27a: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 27d: aload 0
      // 27e: getfield g0_.h4_ Z
      // 281: iload 12
      // 283: ifeq 29c
      // 286: ifne 2f5
      // 289: goto 290
      // 28c: invokestatic g0_.a (Loov;)Loov;
      // 28f: athrow
      // 290: aload 13
      // 292: invokevirtual erg._xr ()Z
      // 295: goto 29c
      // 298: invokestatic g0_.a (Loov;)Loov;
      // 29b: athrow
      // 29c: iload 12
      // 29e: ifeq 2ae
      // 2a1: ifeq 2f5
      // 2a4: goto 2ab
      // 2a7: invokestatic g0_.a (Loov;)Loov;
      // 2aa: athrow
      // 2ab: invokestatic hxt.bdl ()Z
      // 2ae: iload 12
      // 2b0: ifeq 2d8
      // 2b3: ifeq 2db
      // 2b6: goto 2bd
      // 2b9: invokestatic g0_.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: aload 1
      // 2be: aload 13
      // 2c0: aload 15
      // 2c2: fload 2
      // 2c3: fload 3
      // 2c4: fload 4
      // 2c6: fload 5
      // 2c8: fload 6
      // 2ca: fload 7
      // 2cc: fload 8
      // 2ce: invokestatic net/optifine/CustomItems.renderCustomArmorEffect (Lg_3;Lerg;Lg6r;FFFFFFF)Z
      // 2d1: goto 2d8
      // 2d4: invokestatic g0_.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: ifne 2f5
      // 2db: aload 0
      // 2dc: aload 1
      // 2dd: aload 15
      // 2df: fload 2
      // 2e0: fload 3
      // 2e1: fload 4
      // 2e3: fload 5
      // 2e5: fload 6
      // 2e7: fload 7
      // 2e9: fload 8
      // 2eb: invokespecial g0_.wuq (Lg_3;Lg6r;FFFFFFF)V
      // 2ee: goto 2f5
      // 2f1: invokestatic g0_.a (Loov;)Loov;
      // 2f4: athrow
      // 2f5: return
      // 2f6: getstatic g0_$1.i6e [I
      // 2f9: aload 14
      // 2fb: invokevirtual jpt.jo8 ()Ljpt$j4h;
      // 2fe: invokevirtual jpt$j4h.ordinal ()I
      // 301: iaload
      // 302: iload 12
      // 304: ifeq 420
      // 307: tableswitch 277 1 5 37 242 242 242 242
      // 328: invokestatic g0_.a (Loov;)Loov;
      // 32b: athrow
      // 32c: aload 14
      // 32e: aload 13
      // 330: invokevirtual jpt.slc (Lerg;)I
      // 333: istore 17
      // 335: iload 17
      // 337: bipush 16
      // 339: ishr
      // 33a: sipush 255
      // 33d: iand
      // 33e: i2f
      // 33f: ldc 255.0
      // 341: nop
      // 342: fdiv
      // 343: fstore 18
      // 345: iload 17
      // 347: bipush 8
      // 349: ishr
      // 34a: sipush 255
      // 34d: iand
      // 34e: i2f
      // 34f: ldc 255.0
      // 351: nop
      // 352: fdiv
      // 353: fstore 19
      // 355: iload 17
      // 357: sipush 255
      // 35a: iand
      // 35b: i2f
      // 35c: ldc 255.0
      // 35e: nop
      // 35f: fdiv
      // 360: fstore 20
      // 362: aload 0
      // 363: iload 12
      // 365: ifeq 3dc
      // 368: getfield g0_.xvp F
      // 36b: fload 18
      // 36d: fmul
      // 36e: aload 0
      // 36f: getfield g0_.ydz F
      // 372: fload 19
      // 374: fmul
      // 375: aload 0
      // 376: getfield g0_.rvl F
      // 379: fload 20
      // 37b: fmul
      // 37c: aload 0
      // 37d: getfield g0_.jfh F
      // 380: invokestatic hzu.wn0 (FFFF)V
      // 383: aload 15
      // 385: aload 1
      // 386: fload 2
      // 387: fload 3
      // 388: fload 5
      // 38a: fload 6
      // 38c: fload 7
      // 38e: fload 8
      // 390: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 393: invokestatic hxt.bdl ()Z
      // 396: ifeq 3d4
      // 399: goto 3a0
      // 39c: invokestatic g0_.a (Loov;)Loov;
      // 39f: athrow
      // 3a0: aload 13
      // 3a2: iload 16
      // 3a4: iload 12
      // 3a6: ifeq 3bb
      // 3a9: goto 3b0
      // 3ac: invokestatic g0_.a (Loov;)Loov;
      // 3af: athrow
      // 3b0: ifeq 3be
      // 3b3: goto 3ba
      // 3b6: invokestatic g0_.a (Loov;)Loov;
      // 3b9: athrow
      // 3ba: bipush 2
      // 3bb: goto 3bf
      // 3be: bipush 1
      // 3bf: sipush 13060
      // 3c2: ldc2_w 1214694334723108487
      // 3c5: lload 10
      // 3c7: lxor
      // 3c8: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cd: nop
      // 3ce: invokestatic net/optifine/CustomItems.bindCustomArmorTexture (Lerg;ILjava/lang/String;)Z
      // 3d1: ifne 3f9
      // 3d4: aload 0
      // 3d5: goto 3dc
      // 3d8: invokestatic g0_.a (Loov;)Loov;
      // 3db: athrow
      // 3dc: getfield g0_.esu Lgmu;
      // 3df: aload 0
      // 3e0: aload 14
      // 3e2: iload 16
      // 3e4: sipush 13060
      // 3e7: ldc2_w 1214694334723108487
      // 3ea: lload 10
      // 3ec: lxor
      // 3ed: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f2: nop
      // 3f3: invokespecial g0_.b_5 (Ljpt;ZLjava/lang/String;)Lgdz;
      // 3f6: invokevirtual gmu.gu4 (Lgdz;)V
      // 3f9: aload 0
      // 3fa: getfield g0_.xvp F
      // 3fd: aload 0
      // 3fe: getfield g0_.ydz F
      // 401: aload 0
      // 402: getfield g0_.rvl F
      // 405: aload 0
      // 406: getfield g0_.jfh F
      // 409: invokestatic hzu.wn0 (FFFF)V
      // 40c: aload 15
      // 40e: aload 1
      // 40f: fload 2
      // 410: fload 3
      // 411: fload 5
      // 413: fload 6
      // 415: fload 7
      // 417: fload 8
      // 419: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 41c: aload 0
      // 41d: getfield g0_.h4_ Z
      // 420: iload 12
      // 422: ifeq 43b
      // 425: ifne 494
      // 428: goto 42f
      // 42b: invokestatic g0_.a (Loov;)Loov;
      // 42e: athrow
      // 42f: aload 13
      // 431: invokevirtual erg.px0 ()Z
      // 434: goto 43b
      // 437: invokestatic g0_.a (Loov;)Loov;
      // 43a: athrow
      // 43b: iload 12
      // 43d: ifeq 44d
      // 440: ifeq 494
      // 443: goto 44a
      // 446: invokestatic g0_.a (Loov;)Loov;
      // 449: athrow
      // 44a: invokestatic hxt.bdl ()Z
      // 44d: iload 12
      // 44f: ifeq 477
      // 452: ifeq 47a
      // 455: goto 45c
      // 458: invokestatic g0_.a (Loov;)Loov;
      // 45b: athrow
      // 45c: aload 1
      // 45d: aload 13
      // 45f: aload 15
      // 461: fload 2
      // 462: fload 3
      // 463: fload 4
      // 465: fload 5
      // 467: fload 6
      // 469: fload 7
      // 46b: fload 8
      // 46d: invokestatic net/optifine/CustomItems.renderCustomArmorEffect (Lg_3;Lerg;Lg6r;FFFFFFF)Z
      // 470: goto 477
      // 473: invokestatic g0_.a (Loov;)Loov;
      // 476: athrow
      // 477: ifne 494
      // 47a: aload 0
      // 47b: aload 1
      // 47c: aload 15
      // 47e: fload 2
      // 47f: fload 3
      // 480: fload 4
      // 482: fload 5
      // 484: fload 6
      // 486: fload 7
      // 488: fload 8
      // 48a: invokespecial g0_.wuq (Lg_3;Lg6r;FFFFFFF)V
      // 48d: goto 494
      // 490: invokestatic g0_.a (Loov;)Loov;
      // 493: athrow
      // 494: return
   }

   public erg s3c(g_3 var1, int var2) {
      return var1.wfg(var2 - 1);
   }

   public g6r yu8(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 23
      // 09: iload 1
      // 0a: invokespecial g0_.nyo (I)Z
      // 0d: ifeq 22
      // 10: goto 17
      // 13: invokestatic g0_.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield g0_.f8y Lg6r;
      // 1b: goto 26
      // 1e: invokestatic g0_.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield g0_.rna Lg6r;
      // 26: areturn
   }

   private boolean nyo(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 1c
      // 09: bipush 2
      // 0a: if_icmpne 1f
      // 0d: goto 14
      // 10: invokestatic g0_.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 1c
      // 18: invokestatic g0_.a (Loov;)Loov;
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 0
      // 20: ireturn
   }

   private void wuq(g_3 param1, g6r param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 10
      // 005: invokestatic hxt.ly3 ()Z
      // 008: iload 10
      // 00a: ifeq 03b
      // 00d: ifeq 030
      // 010: goto 017
      // 013: invokestatic g0_.a (Loov;)Loov;
      // 016: athrow
      // 017: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 01a: iload 10
      // 01c: ifeq 03b
      // 01f: goto 026
      // 022: invokestatic g0_.a (Loov;)Loov;
      // 025: athrow
      // 026: ifne 142
      // 029: goto 030
      // 02c: invokestatic g0_.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 1
      // 031: getfield g_3.g25 I
      // 034: goto 03b
      // 037: invokestatic g0_.a (Loov;)Loov;
      // 03a: athrow
      // 03b: i2f
      // 03c: fload 5
      // 03e: fadd
      // 03f: fstore 11
      // 041: aload 0
      // 042: getfield g0_.esu Lgmu;
      // 045: getstatic g0_.wky Lgdz;
      // 048: invokevirtual gmu.gu4 (Lgdz;)V
      // 04b: invokestatic hxt.ly3 ()Z
      // 04e: iload 10
      // 050: ifeq 06a
      // 053: ifeq 060
      // 056: goto 05d
      // 059: invokestatic g0_.a (Loov;)Loov;
      // 05c: athrow
      // 05d: invokestatic net/optifine/shaders/ShadersRender.renderEnchantedGlintBegin ()V
      // 060: invokestatic hzu.spd ()V
      // 063: sipush 514
      // 066: invokestatic hzu.d14 (I)V
      // 069: bipush 0
      // 06a: invokestatic hzu.jun (Z)V
      // 06d: ldc 0.5
      // 06f: nop
      // 070: fstore 12
      // 072: fload 12
      // 074: fload 12
      // 076: fload 12
      // 078: fconst_1
      // 079: invokestatic hzu.wn0 (FFFF)V
      // 07c: bipush 0
      // 07d: istore 13
      // 07f: iload 13
      // 081: bipush 2
      // 082: if_icmpge 113
      // 085: invokestatic hzu.fpt ()V
      // 088: sipush 768
      // 08b: bipush 1
      // 08c: invokestatic hzu.ru7 (II)V
      // 08f: ldc 0.76
      // 091: nop
      // 092: fstore 14
      // 094: ldc 0.5
      // 096: nop
      // 097: fload 14
      // 099: fmul
      // 09a: ldc 0.25
      // 09c: nop
      // 09d: fload 14
      // 09f: fmul
      // 0a0: ldc 0.8
      // 0a2: nop
      // 0a3: fload 14
      // 0a5: fmul
      // 0a6: fconst_1
      // 0a7: invokestatic hzu.wn0 (FFFF)V
      // 0aa: sipush 5890
      // 0ad: invokestatic hzu.ah8 (I)V
      // 0b0: invokestatic hzu.zwy ()V
      // 0b3: ldc 0.33333334
      // 0b5: nop
      // 0b6: fstore 15
      // 0b8: fload 15
      // 0ba: fload 15
      // 0bc: fload 15
      // 0be: invokestatic hzu.syc (FFF)V
      // 0c1: ldc 30.0
      // 0c3: nop
      // 0c4: iload 13
      // 0c6: i2f
      // 0c7: ldc 60.0
      // 0c9: nop
      // 0ca: fmul
      // 0cb: fsub
      // 0cc: fconst_0
      // 0cd: fconst_0
      // 0ce: fconst_1
      // 0cf: invokestatic hzu.a2h (FFFF)V
      // 0d2: fconst_0
      // 0d3: fload 11
      // 0d5: ldc 0.001
      // 0d7: nop
      // 0d8: iload 13
      // 0da: i2f
      // 0db: ldc 0.003
      // 0dd: nop
      // 0de: fmul
      // 0df: fadd
      // 0e0: fmul
      // 0e1: ldc 20.0
      // 0e3: nop
      // 0e4: fmul
      // 0e5: fconst_0
      // 0e6: invokestatic hzu.a4k (FFF)V
      // 0e9: sipush 5888
      // 0ec: invokestatic hzu.ah8 (I)V
      // 0ef: aload 2
      // 0f0: aload 1
      // 0f1: fload 3
      // 0f2: fload 4
      // 0f4: fload 6
      // 0f6: fload 7
      // 0f8: fload 8
      // 0fa: fload 9
      // 0fc: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 0ff: iinc 13 1
      // 102: iload 10
      // 104: ifeq 132
      // 107: iload 10
      // 109: ifne 07f
      // 10c: goto 113
      // 10f: invokestatic g0_.a (Loov;)Loov;
      // 112: athrow
      // 113: sipush 5890
      // 116: invokestatic hzu.ah8 (I)V
      // 119: invokestatic hzu.zwy ()V
      // 11c: sipush 5888
      // 11f: invokestatic hzu.ah8 (I)V
      // 122: invokestatic hzu.s7q ()V
      // 125: bipush 1
      // 126: invokestatic hzu.jun (Z)V
      // 129: sipush 515
      // 12c: invokestatic hzu.d14 (I)V
      // 12f: invokestatic hzu.ux6 ()V
      // 132: invokestatic hxt.ly3 ()Z
      // 135: ifeq 142
      // 138: invokestatic net/optifine/shaders/ShadersRender.renderEnchantedGlintEnd ()V
      // 13b: goto 142
      // 13e: invokestatic g0_.a (Loov;)Loov;
      // 141: athrow
      // 142: return
   }

   private gdz fy0(jpt var1, boolean var2) {
      return this.b_5(var1, var2, (String)null);
   }

   private gdz b_5(jpt param1, boolean param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g0_.a J
      // 03: ldc2_w 12755128850864
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: sipush 5830
      // 11: ldc2_w 6516305370596170049
      // 14: lload 4
      // 16: lxor
      // 17: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: nop
      // 1d: bipush 3
      // 1e: anewarray 27
      // 21: dup
      // 22: bipush 0
      // 23: aload 1
      // 24: invokevirtual jpt.jo8 ()Ljpt$j4h;
      // 27: invokevirtual jpt$j4h.oi6 ()Ljava/lang/String;
      // 2a: aastore
      // 2b: dup
      // 2c: bipush 1
      // 2d: iload 2
      // 2e: iload 6
      // 30: ifeq 3e
      // 33: ifeq 41
      // 36: goto 3d
      // 39: invokestatic g0_.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 2
      // 3e: goto 42
      // 41: bipush 1
      // 42: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 45: aastore
      // 46: dup
      // 47: bipush 2
      // 48: aload 3
      // 49: iload 6
      // 4b: ifeq 71
      // 4e: ifnonnull 62
      // 51: goto 58
      // 54: invokestatic g0_.a (Loov;)Loov;
      // 57: athrow
      // 58: ldc ""
      // 5a: nop
      // 5b: goto 7c
      // 5e: invokestatic g0_.a (Loov;)Loov;
      // 61: athrow
      // 62: sipush 14599
      // 65: ldc2_w 1993726972945921668
      // 68: lload 4
      // 6a: lxor
      // 6b: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: bipush 1
      // 72: anewarray 27
      // 75: dup
      // 76: bipush 0
      // 77: aload 3
      // 78: aastore
      // 79: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 7c: aastore
      // 7d: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 80: astore 7
      // 82: getstatic g0_.ts7 Ljava/util/Map;
      // 85: aload 7
      // 87: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 8c: checkcast gdz
      // 8f: astore 8
      // 91: aload 8
      // 93: iload 6
      // 95: ifeq bc
      // 98: ifnonnull ba
      // 9b: goto a2
      // 9e: invokestatic g0_.a (Loov;)Loov;
      // a1: athrow
      // a2: new gdz
      // a5: dup
      // a6: aload 7
      // a8: invokespecial gdz.<init> (Ljava/lang/String;)V
      // ab: astore 8
      // ad: getstatic g0_.ts7 Ljava/util/Map;
      // b0: aload 7
      // b2: aload 8
      // b4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b9: pop
      // ba: aload 8
      // bc: areturn
   }

   public abstract void x8r();

   public abstract void rqn(g6r var1, int var2);

   public g6r xh5(g_3 var1, erg var2, int var3, g6r var4) {
      return var4;
   }

   public gdz ap6(i2h param1, erg param2, int param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g0_.a J
      // 003: ldc2_w 99290989185056
      // 006: lxor
      // 007: lstore 5
      // 009: aload 2
      // 00a: invokevirtual erg.gn1 ()Lu7m;
      // 00d: checkcast jpt
      // 010: astore 8
      // 012: invokestatic t9d.c ()I
      // 015: aload 8
      // 017: invokevirtual jpt.jo8 ()Ljpt$j4h;
      // 01a: invokevirtual jpt$j4h.oi6 ()Ljava/lang/String;
      // 01d: astore 9
      // 01f: sipush 6450
      // 022: ldc2_w 7324354070216509218
      // 025: lload 5
      // 027: lxor
      // 028: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: nop
      // 02e: astore 10
      // 030: istore 7
      // 032: aload 9
      // 034: bipush 58
      // 036: invokevirtual java/lang/String.indexOf (I)I
      // 039: istore 11
      // 03b: iload 7
      // 03d: ifne 057
      // 040: iload 11
      // 042: bipush -1
      // 043: if_icmpeq 062
      // 046: goto 04d
      // 049: invokestatic g0_.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 9
      // 04f: bipush 0
      // 050: iload 11
      // 052: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 055: astore 10
      // 057: aload 9
      // 059: iload 11
      // 05b: bipush 1
      // 05c: iadd
      // 05d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 060: astore 9
      // 062: sipush 3114
      // 065: ldc2_w 2554502072997810751
      // 068: lload 5
      // 06a: lxor
      // 06b: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: nop
      // 071: bipush 4
      // 072: anewarray 27
      // 075: dup
      // 076: bipush 0
      // 077: aload 10
      // 079: aastore
      // 07a: dup
      // 07b: bipush 1
      // 07c: aload 9
      // 07e: aastore
      // 07f: dup
      // 080: bipush 2
      // 081: aload 0
      // 082: iload 3
      // 083: invokespecial g0_.nyo (I)Z
      // 086: iload 7
      // 088: ifne 096
      // 08b: ifeq 099
      // 08e: goto 095
      // 091: invokestatic g0_.a (Loov;)Loov;
      // 094: athrow
      // 095: bipush 2
      // 096: goto 09a
      // 099: bipush 1
      // 09a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09d: aastore
      // 09e: dup
      // 09f: bipush 3
      // 0a0: aload 4
      // 0a2: iload 7
      // 0a4: ifne 0ca
      // 0a7: ifnonnull 0bb
      // 0aa: goto 0b1
      // 0ad: invokestatic g0_.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: ldc ""
      // 0b3: nop
      // 0b4: goto 0d6
      // 0b7: invokestatic g0_.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: sipush 28305
      // 0be: ldc2_w 2003535203622547587
      // 0c1: lload 5
      // 0c3: lxor
      // 0c4: invokedynamic g (IJ)Ljava/lang/String; bsm=g0_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: nop
      // 0ca: bipush 1
      // 0cb: anewarray 27
      // 0ce: dup
      // 0cf: bipush 0
      // 0d0: aload 4
      // 0d2: aastore
      // 0d3: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0d6: aastore
      // 0d7: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0da: astore 12
      // 0dc: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getArmorTexture Lnet/optifine/reflect/ReflectorMethod;
      // 0df: bipush 5
      // 0e0: anewarray 27
      // 0e3: dup
      // 0e4: bipush 0
      // 0e5: aload 1
      // 0e6: aastore
      // 0e7: dup
      // 0e8: bipush 1
      // 0e9: aload 2
      // 0ea: aastore
      // 0eb: dup
      // 0ec: bipush 2
      // 0ed: aload 12
      // 0ef: aastore
      // 0f0: dup
      // 0f1: bipush 3
      // 0f2: iload 3
      // 0f3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f6: aastore
      // 0f7: dup
      // 0f8: bipush 4
      // 0f9: aload 4
      // 0fb: aastore
      // 0fc: invokestatic net/optifine/reflect/Reflector.callString (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/String;
      // 0ff: astore 12
      // 101: getstatic g0_.ts7 Ljava/util/Map;
      // 104: aload 12
      // 106: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 10b: checkcast gdz
      // 10e: astore 13
      // 110: aload 13
      // 112: iload 7
      // 114: ifne 13b
      // 117: ifnonnull 139
      // 11a: goto 121
      // 11d: invokestatic g0_.a (Loov;)Loov;
      // 120: athrow
      // 121: new gdz
      // 124: dup
      // 125: aload 12
      // 127: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 12a: astore 13
      // 12c: getstatic g0_.ts7 Ljava/util/Map;
      // 12f: aload 12
      // 131: aload 13
      // 133: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 138: pop
      // 139: aload 13
      // 13b: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1432726500680372515L, -2813251859245181709L, MethodHandles.lookup().lookupClass()).a(117405019915291L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 97675418033174L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "\u009dÃþö\u007f(\u0019\u0091\u0013ø\u0006âü\u001b\u0000G¹Tq´\"t'¤Ü\u009a\u001e\u001fØq!\u001a\u0010\u0084y \u0013õ\u009f+\u009aÆFg©{ê\u0094o\u0010r©Íö×à@îÖ/+\u0006Åò\u009bÈ\u0010Ó$ÙJ 7\u001fêX\u008eË_Osà\u0007\u0010\u001eU\u0006y½\u009cïJv³ýãGlLÅPÈãN>ì~§\u0085|^\u001d¢éé\u008aây\u001dïg\u0006/*<¬{H¹£²ü\u0080ù\u0080@2\n\u0095«#.vYÑ·Í\f\u008b\"óÓ»÷tëÓRDË\u0014Ü\u00166Lô\u001b±\u0016\u001a\u0098ì*ªPóOMGý×";
      int var6 = "\u009dÃþö\u007f(\u0019\u0091\u0013ø\u0006âü\u001b\u0000G¹Tq´\"t'¤Ü\u009a\u001e\u001fØq!\u001a\u0010\u0084y \u0013õ\u009f+\u009aÆFg©{ê\u0094o\u0010r©Íö×à@îÖ/+\u0006Åò\u009bÈ\u0010Ó$ÙJ 7\u001fêX\u008eË_Osà\u0007\u0010\u001eU\u0006y½\u009cïJv³ýãGlLÅPÈãN>ì~§\u0085|^\u001d¢éé\u008aây\u001dïg\u0006/*<¬{H¹£²ü\u0080ù\u0080@2\n\u0095«#.vYÑ·Í\f\u008b\"óÓ»÷tëÓRDË\u0014Ü\u00166Lô\u001b±\u0016\u001a\u0098ì*ªPóOMGý×"
         .length();
      char var3 = ' ';
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
                     c = new String[8];
                     wky = new gdz(a<"g">(23596, 5648373774310823436L ^ var9));
                     ts7 = Maps.newHashMap();
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

                  var4 = "\u0084ÚU ºaf\u0001^ÊPLi\u0014n\u007fdÇ´ ¶ÚðRÛ?|\\Ò%ÔþÐ~\u00007v°/£\u0010ä1F=I_YÓ\u0015Nà×í\u0004wcRÂ\u0002ß|'Öm\u0097°\u0000T\u0086\u007f @\u001eÔã\u000eÍ÷:\u0014\f\u0012\u0096\u0018\u0015Ý\t»\u0006QÍ\u00043Å\"Gz\u0006Ó\u0019\u009fu7FoÞX<Ø\fj\u009aaìÿà9\u0082Æ\t+úüî\u008c\u000eÌ\u008cQ\u0005b\u007f\u001b£\u001d2";
                  var6 = "\u0084ÚU ºaf\u0001^ÊPLi\u0014n\u007fdÇ´ ¶ÚðRÛ?|\\Ò%ÔþÐ~\u00007v°/£\u0010ä1F=I_YÓ\u0015Nà×í\u0004wcRÂ\u0002ß|'Öm\u0097°\u0000T\u0086\u007f @\u001eÔã\u000eÍ÷:\u0014\f\u0012\u0096\u0018\u0015Ý\t»\u0006QÍ\u00043Å\"Gz\u0006Ó\u0019\u009fu7FoÞX<Ø\fj\u009aaìÿà9\u0082Æ\t+úüî\u008c\u000eÌ\u008cQ\u0005b\u007f\u001b£\u001d2"
                     .length();
                  var3 = 'H';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7017;
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
            throw new RuntimeException("g0_", var10);
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
         throw new RuntimeException("g0_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
