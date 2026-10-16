import com.google.common.collect.Lists;
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
import net.optifine.entity.model.anim.ModelUpdater;
import net.optifine.model.ModelSprite;

public class tf8 {
   public float mb6;
   public float o_f;
   public float _ki;
   public float ca7;
   public float kit;
   public float pod;
   public float r80;
   public float oo7;
   public boolean hsi;
   public boolean b16;
   public boolean azy;
   public List mv0;
   public List mbo;
   public final String d5j;
   public float sdb;
   public float nh8;
   public float c0n;
   public List wrh = new ArrayList();
   public boolean lf_ = false;
   public float r_0 = 1.0F;
   public float wgr = 1.0F;
   public float xkk = 1.0F;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public tf8(g6r var1, String var2) {
      this.mb6 = 64.0F;
      this.o_f = 32.0F;
      this.b16 = true;
      this.mv0 = Lists.newArrayList();
      this.glf = var1;
      var1.uik.add(this);
      this.d5j = var2;
      this.swi(var1.dsx, var1.apc);
   }

   public tf8(g6r var1) {
      this(var1, (String)null);
   }

   public tf8(g6r var1, int var2, int var3) {
      this(var1);
      this.fc6(var2, var3);
   }

   public void i_6(tf8 param1) {
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
      // 05: getfield tf8.mbo Ljava/util/List;
      // 08: iload 2
      // 09: ifne 28
      // 0c: ifnonnull 24
      // 0f: goto 16
      // 12: invokestatic tf8.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 1a: putfield tf8.mbo Ljava/util/List;
      // 1d: goto 24
      // 20: invokestatic tf8.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield tf8.mbo Ljava/util/List;
      // 28: aload 1
      // 29: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2e: pop
      // 2f: return
   }

   public tf8 fc6(int var1, int var2) {
      this.fwy = var1;
      this.h40 = var2;
      return this;
   }

   public tf8 de4(String var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      var1 = this.d5j + "." + var1;
      jts var8 = this.glf.bx0(var1);
      this.fc6(var8.qzg, var8.c01);
      this.mv0.add(new upl(this, this.fwy, this.h40, var2, var3, var4, var5, var6, var7, 0.0F).xqa(var1));
      return this;
   }

   public tf8 ge4(float var1, float var2, float var3, int var4, int var5, int var6) {
      this.mv0.add(new upl(this, this.fwy, this.h40, var1, var2, var3, var4, var5, var6, 0.0F));
      return this;
   }

   public tf8 kxm(float var1, float var2, float var3, int var4, int var5, int var6, boolean var7) {
      this.mv0.add(new upl(this, this.fwy, this.h40, var1, var2, var3, var4, var5, var6, 0.0F, var7));
      return this;
   }

   public void q3x(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.mv0.add(new upl(this, this.fwy, this.h40, var1, var2, var3, var4, var5, var6, var7));
   }

   public void i50(float var1, float var2, float var3) {
      this._ki = var1;
      this.ca7 = var2;
      this.kit = var3;
   }

   public void vca(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield tf8.azy Z
      // 008: iload 2
      // 009: ifne 021
      // 00c: ifne 483
      // 00f: goto 016
      // 012: invokestatic tf8.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield tf8.b16 Z
      // 01a: goto 021
      // 01d: invokestatic tf8.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 2
      // 022: ifne 03e
      // 025: ifeq 483
      // 028: goto 02f
      // 02b: invokestatic tf8.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokespecial tf8.in5 ()V
      // 033: aload 0
      // 034: getfield tf8.xh5 Z
      // 037: goto 03e
      // 03a: invokestatic tf8.a (Loov;)Loov;
      // 03d: athrow
      // 03e: iload 2
      // 03f: ifne 059
      // 042: ifne 058
      // 045: goto 04c
      // 048: invokestatic tf8.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: fload 1
      // 04e: invokespecial tf8.c2n (F)V
      // 051: goto 058
      // 054: invokestatic tf8.a (Loov;)Loov;
      // 057: athrow
      // 058: bipush 0
      // 059: istore 3
      // 05a: aload 0
      // 05b: iload 2
      // 05c: ifne 0b4
      // 05f: getfield tf8.hpp Lgdz;
      // 062: ifnull 0b3
      // 065: goto 06c
      // 068: invokestatic tf8.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: iload 2
      // 06e: ifne 0b4
      // 071: goto 078
      // 074: invokestatic tf8.a (Loov;)Loov;
      // 077: athrow
      // 078: getfield tf8.sq1 Lcrp;
      // 07b: getfield crp.sy_ Z
      // 07e: ifne 0b3
      // 081: goto 088
      // 084: invokestatic tf8.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: getfield tf8.sq1 Lcrp;
      // 08c: getfield crp.oun Z
      // 08f: iload 2
      // 090: ifne 0a8
      // 093: goto 09a
      // 096: invokestatic tf8.a (Loov;)Loov;
      // 099: athrow
      // 09a: ifeq 0a5
      // 09d: goto 0a4
      // 0a0: invokestatic tf8.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: return
      // 0a5: invokestatic hzu.dit ()I
      // 0a8: istore 3
      // 0a9: invokestatic hxt.ibs ()Llc5;
      // 0ac: aload 0
      // 0ad: getfield tf8.hpp Lgdz;
      // 0b0: invokevirtual lc5.anl (Lgdz;)V
      // 0b3: aload 0
      // 0b4: iload 2
      // 0b5: ifne 0d4
      // 0b8: getfield tf8.kow Lnet/optifine/entity/model/anim/ModelUpdater;
      // 0bb: ifnull 0d3
      // 0be: goto 0c5
      // 0c1: invokestatic tf8.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield tf8.kow Lnet/optifine/entity/model/anim/ModelUpdater;
      // 0c9: invokevirtual net/optifine/entity/model/anim/ModelUpdater.update ()V
      // 0cc: goto 0d3
      // 0cf: invokestatic tf8.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield tf8.r_0 F
      // 0d7: fconst_1
      // 0d8: fcmpl
      // 0d9: iload 2
      // 0da: ifne 11e
      // 0dd: ifne 11d
      // 0e0: goto 0e7
      // 0e3: invokestatic tf8.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield tf8.wgr F
      // 0eb: fconst_1
      // 0ec: fcmpl
      // 0ed: iload 2
      // 0ee: ifne 11e
      // 0f1: goto 0f8
      // 0f4: invokestatic tf8.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: ifne 11d
      // 0fb: goto 102
      // 0fe: invokestatic tf8.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: getfield tf8.xkk F
      // 106: fconst_1
      // 107: fcmpl
      // 108: iload 2
      // 109: ifne 11e
      // 10c: goto 113
      // 10f: invokestatic tf8.a (Loov;)Loov;
      // 112: athrow
      // 113: ifeq 121
      // 116: goto 11d
      // 119: invokestatic tf8.a (Loov;)Loov;
      // 11c: athrow
      // 11d: bipush 1
      // 11e: goto 122
      // 121: bipush 0
      // 122: istore 4
      // 124: aload 0
      // 125: getfield tf8.sdb F
      // 128: aload 0
      // 129: getfield tf8.nh8 F
      // 12c: aload 0
      // 12d: getfield tf8.c0n F
      // 130: invokestatic hzu.a4k (FFF)V
      // 133: aload 0
      // 134: getfield tf8.pod F
      // 137: fconst_0
      // 138: fcmpl
      // 139: iload 2
      // 13a: ifne 36b
      // 13d: ifne 346
      // 140: goto 147
      // 143: invokestatic tf8.a (Loov;)Loov;
      // 146: athrow
      // 147: aload 0
      // 148: getfield tf8.r80 F
      // 14b: fconst_0
      // 14c: fcmpl
      // 14d: iload 2
      // 14e: ifne 36b
      // 151: goto 158
      // 154: invokestatic tf8.a (Loov;)Loov;
      // 157: athrow
      // 158: ifne 346
      // 15b: goto 162
      // 15e: invokestatic tf8.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 0
      // 163: getfield tf8.oo7 F
      // 166: fconst_0
      // 167: fcmpl
      // 168: iload 2
      // 169: ifne 36b
      // 16c: goto 173
      // 16f: invokestatic tf8.a (Loov;)Loov;
      // 172: athrow
      // 173: ifne 346
      // 176: goto 17d
      // 179: invokestatic tf8.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 0
      // 17e: getfield tf8._ki F
      // 181: fconst_0
      // 182: fcmpl
      // 183: iload 2
      // 184: ifne 297
      // 187: goto 18e
      // 18a: invokestatic tf8.a (Loov;)Loov;
      // 18d: athrow
      // 18e: ifne 279
      // 191: goto 198
      // 194: invokestatic tf8.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: getfield tf8.ca7 F
      // 19c: fconst_0
      // 19d: fcmpl
      // 19e: iload 2
      // 19f: ifne 297
      // 1a2: goto 1a9
      // 1a5: invokestatic tf8.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: ifne 279
      // 1ac: goto 1b3
      // 1af: invokestatic tf8.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield tf8.kit F
      // 1b7: fconst_0
      // 1b8: fcmpl
      // 1b9: iload 2
      // 1ba: ifne 297
      // 1bd: goto 1c4
      // 1c0: invokestatic tf8.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: ifne 279
      // 1c7: goto 1ce
      // 1ca: invokestatic tf8.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: iload 4
      // 1d0: iload 2
      // 1d1: ifne 1ff
      // 1d4: goto 1db
      // 1d7: invokestatic tf8.a (Loov;)Loov;
      // 1da: athrow
      // 1db: ifeq 1fb
      // 1de: goto 1e5
      // 1e1: invokestatic tf8.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: getfield tf8.r_0 F
      // 1e9: aload 0
      // 1ea: getfield tf8.wgr F
      // 1ed: aload 0
      // 1ee: getfield tf8.xkk F
      // 1f1: invokestatic hzu.syc (FFF)V
      // 1f4: goto 1fb
      // 1f7: invokestatic tf8.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: getfield tf8.zs5 I
      // 1ff: iload 2
      // 200: ifne 24b
      // 203: invokestatic hzu.bcf (I)V
      // 206: aload 0
      // 207: getfield tf8.mbo Ljava/util/List;
      // 20a: ifnull 249
      // 20d: goto 214
      // 210: invokestatic tf8.a (Loov;)Loov;
      // 213: athrow
      // 214: bipush 0
      // 215: istore 5
      // 217: iload 5
      // 219: aload 0
      // 21a: getfield tf8.mbo Ljava/util/List;
      // 21d: invokeinterface java/util/List.size ()I 1
      // 222: if_icmpge 249
      // 225: aload 0
      // 226: getfield tf8.mbo Ljava/util/List;
      // 229: iload 5
      // 22b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 230: checkcast tf8
      // 233: fload 1
      // 234: invokevirtual tf8.vca (F)V
      // 237: iinc 5 1
      // 23a: iload 2
      // 23b: ifne 470
      // 23e: iload 2
      // 23f: ifeq 217
      // 242: goto 249
      // 245: invokestatic tf8.a (Loov;)Loov;
      // 248: athrow
      // 249: iload 4
      // 24b: iload 2
      // 24c: ifne 471
      // 24f: ifeq 45e
      // 252: goto 259
      // 255: invokestatic tf8.a (Loov;)Loov;
      // 258: athrow
      // 259: fconst_1
      // 25a: aload 0
      // 25b: getfield tf8.r_0 F
      // 25e: fdiv
      // 25f: fconst_1
      // 260: aload 0
      // 261: getfield tf8.wgr F
      // 264: fdiv
      // 265: fconst_1
      // 266: aload 0
      // 267: getfield tf8.xkk F
      // 26a: fdiv
      // 26b: invokestatic hzu.syc (FFF)V
      // 26e: iload 2
      // 26f: ifeq 45e
      // 272: goto 279
      // 275: invokestatic tf8.a (Loov;)Loov;
      // 278: athrow
      // 279: aload 0
      // 27a: getfield tf8._ki F
      // 27d: fload 1
      // 27e: fmul
      // 27f: aload 0
      // 280: getfield tf8.ca7 F
      // 283: fload 1
      // 284: fmul
      // 285: aload 0
      // 286: getfield tf8.kit F
      // 289: fload 1
      // 28a: fmul
      // 28b: invokestatic hzu.a4k (FFF)V
      // 28e: iload 4
      // 290: goto 297
      // 293: invokestatic tf8.a (Loov;)Loov;
      // 296: athrow
      // 297: iload 2
      // 298: ifne 2bf
      // 29b: ifeq 2bb
      // 29e: goto 2a5
      // 2a1: invokestatic tf8.a (Loov;)Loov;
      // 2a4: athrow
      // 2a5: aload 0
      // 2a6: getfield tf8.r_0 F
      // 2a9: aload 0
      // 2aa: getfield tf8.wgr F
      // 2ad: aload 0
      // 2ae: getfield tf8.xkk F
      // 2b1: invokestatic hzu.syc (FFF)V
      // 2b4: goto 2bb
      // 2b7: invokestatic tf8.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: aload 0
      // 2bc: getfield tf8.zs5 I
      // 2bf: iload 2
      // 2c0: ifne 30b
      // 2c3: invokestatic hzu.bcf (I)V
      // 2c6: aload 0
      // 2c7: getfield tf8.mbo Ljava/util/List;
      // 2ca: ifnull 309
      // 2cd: goto 2d4
      // 2d0: invokestatic tf8.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: bipush 0
      // 2d5: istore 5
      // 2d7: iload 5
      // 2d9: aload 0
      // 2da: getfield tf8.mbo Ljava/util/List;
      // 2dd: invokeinterface java/util/List.size ()I 1
      // 2e2: if_icmpge 309
      // 2e5: aload 0
      // 2e6: getfield tf8.mbo Ljava/util/List;
      // 2e9: iload 5
      // 2eb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2f0: checkcast tf8
      // 2f3: fload 1
      // 2f4: invokevirtual tf8.vca (F)V
      // 2f7: iinc 5 1
      // 2fa: iload 2
      // 2fb: ifne 342
      // 2fe: iload 2
      // 2ff: ifeq 2d7
      // 302: goto 309
      // 305: invokestatic tf8.a (Loov;)Loov;
      // 308: athrow
      // 309: iload 4
      // 30b: ifeq 32a
      // 30e: fconst_1
      // 30f: aload 0
      // 310: getfield tf8.r_0 F
      // 313: fdiv
      // 314: fconst_1
      // 315: aload 0
      // 316: getfield tf8.wgr F
      // 319: fdiv
      // 31a: fconst_1
      // 31b: aload 0
      // 31c: getfield tf8.xkk F
      // 31f: fdiv
      // 320: invokestatic hzu.syc (FFF)V
      // 323: goto 32a
      // 326: invokestatic tf8.a (Loov;)Loov;
      // 329: athrow
      // 32a: aload 0
      // 32b: getfield tf8._ki F
      // 32e: fneg
      // 32f: fload 1
      // 330: fmul
      // 331: aload 0
      // 332: getfield tf8.ca7 F
      // 335: fneg
      // 336: fload 1
      // 337: fmul
      // 338: aload 0
      // 339: getfield tf8.kit F
      // 33c: fneg
      // 33d: fload 1
      // 33e: fmul
      // 33f: invokestatic hzu.a4k (FFF)V
      // 342: iload 2
      // 343: ifeq 45e
      // 346: invokestatic hzu.dp2 ()V
      // 349: aload 0
      // 34a: getfield tf8._ki F
      // 34d: fload 1
      // 34e: fmul
      // 34f: aload 0
      // 350: getfield tf8.ca7 F
      // 353: fload 1
      // 354: fmul
      // 355: aload 0
      // 356: getfield tf8.kit F
      // 359: fload 1
      // 35a: fmul
      // 35b: invokestatic hzu.a4k (FFF)V
      // 35e: aload 0
      // 35f: getfield tf8.oo7 F
      // 362: fconst_0
      // 363: fcmpl
      // 364: goto 36b
      // 367: invokestatic tf8.a (Loov;)Loov;
      // 36a: athrow
      // 36b: iload 2
      // 36c: ifne 394
      // 36f: ifeq 38e
      // 372: goto 379
      // 375: invokestatic tf8.a (Loov;)Loov;
      // 378: athrow
      // 379: aload 0
      // 37a: getfield tf8.oo7 F
      // 37d: ldc 57.295776
      // 37f: nop
      // 380: fmul
      // 381: fconst_0
      // 382: fconst_0
      // 383: fconst_1
      // 384: invokestatic hzu.a2h (FFFF)V
      // 387: goto 38e
      // 38a: invokestatic tf8.a (Loov;)Loov;
      // 38d: athrow
      // 38e: aload 0
      // 38f: getfield tf8.r80 F
      // 392: fconst_0
      // 393: fcmpl
      // 394: iload 2
      // 395: ifne 3bd
      // 398: ifeq 3b7
      // 39b: goto 3a2
      // 39e: invokestatic tf8.a (Loov;)Loov;
      // 3a1: athrow
      // 3a2: aload 0
      // 3a3: getfield tf8.r80 F
      // 3a6: ldc 57.295776
      // 3a8: nop
      // 3a9: fmul
      // 3aa: fconst_0
      // 3ab: fconst_1
      // 3ac: fconst_0
      // 3ad: invokestatic hzu.a2h (FFFF)V
      // 3b0: goto 3b7
      // 3b3: invokestatic tf8.a (Loov;)Loov;
      // 3b6: athrow
      // 3b7: aload 0
      // 3b8: getfield tf8.pod F
      // 3bb: fconst_0
      // 3bc: fcmpl
      // 3bd: iload 2
      // 3be: ifne 3e2
      // 3c1: ifeq 3e0
      // 3c4: goto 3cb
      // 3c7: invokestatic tf8.a (Loov;)Loov;
      // 3ca: athrow
      // 3cb: aload 0
      // 3cc: getfield tf8.pod F
      // 3cf: ldc 57.295776
      // 3d1: nop
      // 3d2: fmul
      // 3d3: fconst_1
      // 3d4: fconst_0
      // 3d5: fconst_0
      // 3d6: invokestatic hzu.a2h (FFFF)V
      // 3d9: goto 3e0
      // 3dc: invokestatic tf8.a (Loov;)Loov;
      // 3df: athrow
      // 3e0: iload 4
      // 3e2: iload 2
      // 3e3: ifne 40a
      // 3e6: ifeq 406
      // 3e9: goto 3f0
      // 3ec: invokestatic tf8.a (Loov;)Loov;
      // 3ef: athrow
      // 3f0: aload 0
      // 3f1: getfield tf8.r_0 F
      // 3f4: aload 0
      // 3f5: getfield tf8.wgr F
      // 3f8: aload 0
      // 3f9: getfield tf8.xkk F
      // 3fc: invokestatic hzu.syc (FFF)V
      // 3ff: goto 406
      // 402: invokestatic tf8.a (Loov;)Loov;
      // 405: athrow
      // 406: aload 0
      // 407: getfield tf8.zs5 I
      // 40a: iload 2
      // 40b: ifne 427
      // 40e: invokestatic hzu.bcf (I)V
      // 411: aload 0
      // 412: getfield tf8.mbo Ljava/util/List;
      // 415: ifnull 45b
      // 418: goto 41f
      // 41b: invokestatic tf8.a (Loov;)Loov;
      // 41e: athrow
      // 41f: bipush 0
      // 420: goto 427
      // 423: invokestatic tf8.a (Loov;)Loov;
      // 426: athrow
      // 427: istore 5
      // 429: iload 5
      // 42b: aload 0
      // 42c: getfield tf8.mbo Ljava/util/List;
      // 42f: invokeinterface java/util/List.size ()I 1
      // 434: if_icmpge 45b
      // 437: aload 0
      // 438: getfield tf8.mbo Ljava/util/List;
      // 43b: iload 5
      // 43d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 442: checkcast tf8
      // 445: fload 1
      // 446: invokevirtual tf8.vca (F)V
      // 449: iinc 5 1
      // 44c: iload 2
      // 44d: ifne 470
      // 450: iload 2
      // 451: ifeq 429
      // 454: goto 45b
      // 457: invokestatic tf8.a (Loov;)Loov;
      // 45a: athrow
      // 45b: invokestatic hzu.x3w ()V
      // 45e: aload 0
      // 45f: getfield tf8.sdb F
      // 462: fneg
      // 463: aload 0
      // 464: getfield tf8.nh8 F
      // 467: fneg
      // 468: aload 0
      // 469: getfield tf8.c0n F
      // 46c: fneg
      // 46d: invokestatic hzu.a4k (FFF)V
      // 470: iload 3
      // 471: iload 2
      // 472: ifne 480
      // 475: ifeq 483
      // 478: goto 47f
      // 47b: invokestatic tf8.a (Loov;)Loov;
      // 47e: athrow
      // 47f: iload 3
      // 480: invokestatic hzu.t30 (I)V
      // 483: return
   }

   public void pt6(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield tf8.azy Z
      // 008: iload 2
      // 009: ifne 021
      // 00c: ifne 241
      // 00f: goto 016
      // 012: invokestatic tf8.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield tf8.b16 Z
      // 01a: goto 021
      // 01d: invokestatic tf8.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 2
      // 022: ifne 03e
      // 025: ifeq 241
      // 028: goto 02f
      // 02b: invokestatic tf8.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokespecial tf8.in5 ()V
      // 033: aload 0
      // 034: getfield tf8.xh5 Z
      // 037: goto 03e
      // 03a: invokestatic tf8.a (Loov;)Loov;
      // 03d: athrow
      // 03e: iload 2
      // 03f: ifne 059
      // 042: ifne 058
      // 045: goto 04c
      // 048: invokestatic tf8.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: fload 1
      // 04e: invokespecial tf8.c2n (F)V
      // 051: goto 058
      // 054: invokestatic tf8.a (Loov;)Loov;
      // 057: athrow
      // 058: bipush 0
      // 059: istore 3
      // 05a: aload 0
      // 05b: iload 2
      // 05c: ifne 0b4
      // 05f: getfield tf8.hpp Lgdz;
      // 062: ifnull 0b3
      // 065: goto 06c
      // 068: invokestatic tf8.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: iload 2
      // 06e: ifne 0b4
      // 071: goto 078
      // 074: invokestatic tf8.a (Loov;)Loov;
      // 077: athrow
      // 078: getfield tf8.sq1 Lcrp;
      // 07b: getfield crp.sy_ Z
      // 07e: ifne 0b3
      // 081: goto 088
      // 084: invokestatic tf8.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: getfield tf8.sq1 Lcrp;
      // 08c: getfield crp.oun Z
      // 08f: iload 2
      // 090: ifne 0a8
      // 093: goto 09a
      // 096: invokestatic tf8.a (Loov;)Loov;
      // 099: athrow
      // 09a: ifeq 0a5
      // 09d: goto 0a4
      // 0a0: invokestatic tf8.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: return
      // 0a5: invokestatic hzu.dit ()I
      // 0a8: istore 3
      // 0a9: invokestatic hxt.ibs ()Llc5;
      // 0ac: aload 0
      // 0ad: getfield tf8.hpp Lgdz;
      // 0b0: invokevirtual lc5.anl (Lgdz;)V
      // 0b3: aload 0
      // 0b4: iload 2
      // 0b5: ifne 0d4
      // 0b8: getfield tf8.kow Lnet/optifine/entity/model/anim/ModelUpdater;
      // 0bb: ifnull 0d3
      // 0be: goto 0c5
      // 0c1: invokestatic tf8.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield tf8.kow Lnet/optifine/entity/model/anim/ModelUpdater;
      // 0c9: invokevirtual net/optifine/entity/model/anim/ModelUpdater.update ()V
      // 0cc: goto 0d3
      // 0cf: invokestatic tf8.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield tf8.r_0 F
      // 0d7: fconst_1
      // 0d8: fcmpl
      // 0d9: iload 2
      // 0da: ifne 11e
      // 0dd: ifne 11d
      // 0e0: goto 0e7
      // 0e3: invokestatic tf8.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield tf8.wgr F
      // 0eb: fconst_1
      // 0ec: fcmpl
      // 0ed: iload 2
      // 0ee: ifne 11e
      // 0f1: goto 0f8
      // 0f4: invokestatic tf8.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: ifne 11d
      // 0fb: goto 102
      // 0fe: invokestatic tf8.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: getfield tf8.xkk F
      // 106: fconst_1
      // 107: fcmpl
      // 108: iload 2
      // 109: ifne 11e
      // 10c: goto 113
      // 10f: invokestatic tf8.a (Loov;)Loov;
      // 112: athrow
      // 113: ifeq 121
      // 116: goto 11d
      // 119: invokestatic tf8.a (Loov;)Loov;
      // 11c: athrow
      // 11d: bipush 1
      // 11e: goto 122
      // 121: bipush 0
      // 122: istore 4
      // 124: invokestatic hzu.dp2 ()V
      // 127: aload 0
      // 128: getfield tf8._ki F
      // 12b: fload 1
      // 12c: fmul
      // 12d: aload 0
      // 12e: getfield tf8.ca7 F
      // 131: fload 1
      // 132: fmul
      // 133: aload 0
      // 134: getfield tf8.kit F
      // 137: fload 1
      // 138: fmul
      // 139: invokestatic hzu.a4k (FFF)V
      // 13c: aload 0
      // 13d: getfield tf8.r80 F
      // 140: fconst_0
      // 141: fcmpl
      // 142: iload 2
      // 143: ifne 16b
      // 146: ifeq 165
      // 149: goto 150
      // 14c: invokestatic tf8.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 0
      // 151: getfield tf8.r80 F
      // 154: ldc 57.295776
      // 156: nop
      // 157: fmul
      // 158: fconst_0
      // 159: fconst_1
      // 15a: fconst_0
      // 15b: invokestatic hzu.a2h (FFFF)V
      // 15e: goto 165
      // 161: invokestatic tf8.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 0
      // 166: getfield tf8.pod F
      // 169: fconst_0
      // 16a: fcmpl
      // 16b: iload 2
      // 16c: ifne 194
      // 16f: ifeq 18e
      // 172: goto 179
      // 175: invokestatic tf8.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 0
      // 17a: getfield tf8.pod F
      // 17d: ldc 57.295776
      // 17f: nop
      // 180: fmul
      // 181: fconst_1
      // 182: fconst_0
      // 183: fconst_0
      // 184: invokestatic hzu.a2h (FFFF)V
      // 187: goto 18e
      // 18a: invokestatic tf8.a (Loov;)Loov;
      // 18d: athrow
      // 18e: aload 0
      // 18f: getfield tf8.oo7 F
      // 192: fconst_0
      // 193: fcmpl
      // 194: iload 2
      // 195: ifne 1b9
      // 198: ifeq 1b7
      // 19b: goto 1a2
      // 19e: invokestatic tf8.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: aload 0
      // 1a3: getfield tf8.oo7 F
      // 1a6: ldc 57.295776
      // 1a8: nop
      // 1a9: fmul
      // 1aa: fconst_0
      // 1ab: fconst_0
      // 1ac: fconst_1
      // 1ad: invokestatic hzu.a2h (FFFF)V
      // 1b0: goto 1b7
      // 1b3: invokestatic tf8.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: iload 4
      // 1b9: iload 2
      // 1ba: ifne 1e1
      // 1bd: ifeq 1dd
      // 1c0: goto 1c7
      // 1c3: invokestatic tf8.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: getfield tf8.r_0 F
      // 1cb: aload 0
      // 1cc: getfield tf8.wgr F
      // 1cf: aload 0
      // 1d0: getfield tf8.xkk F
      // 1d3: invokestatic hzu.syc (FFF)V
      // 1d6: goto 1dd
      // 1d9: invokestatic tf8.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: getfield tf8.zs5 I
      // 1e1: invokestatic hzu.bcf (I)V
      // 1e4: iload 2
      // 1e5: ifne 22e
      // 1e8: aload 0
      // 1e9: getfield tf8.mbo Ljava/util/List;
      // 1ec: ifnull 22b
      // 1ef: goto 1f6
      // 1f2: invokestatic tf8.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: bipush 0
      // 1f7: istore 5
      // 1f9: iload 5
      // 1fb: aload 0
      // 1fc: getfield tf8.mbo Ljava/util/List;
      // 1ff: invokeinterface java/util/List.size ()I 1
      // 204: if_icmpge 22b
      // 207: aload 0
      // 208: getfield tf8.mbo Ljava/util/List;
      // 20b: iload 5
      // 20d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 212: checkcast tf8
      // 215: fload 1
      // 216: invokevirtual tf8.vca (F)V
      // 219: iinc 5 1
      // 21c: iload 2
      // 21d: ifne 22e
      // 220: iload 2
      // 221: ifeq 1f9
      // 224: goto 22b
      // 227: invokestatic tf8.a (Loov;)Loov;
      // 22a: athrow
      // 22b: invokestatic hzu.x3w ()V
      // 22e: iload 3
      // 22f: iload 2
      // 230: ifne 23e
      // 233: ifeq 241
      // 236: goto 23d
      // 239: invokestatic tf8.a (Loov;)Loov;
      // 23c: athrow
      // 23d: iload 3
      // 23e: invokestatic hzu.t30 (I)V
      // 241: return
   }

   public void f2u(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield tf8.azy Z
      // 008: iload 2
      // 009: ifeq 021
      // 00c: ifne 1aa
      // 00f: goto 016
      // 012: invokestatic tf8.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield tf8.b16 Z
      // 01a: goto 021
      // 01d: invokestatic tf8.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 2
      // 022: ifeq 03e
      // 025: ifeq 1aa
      // 028: goto 02f
      // 02b: invokestatic tf8.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokespecial tf8.in5 ()V
      // 033: aload 0
      // 034: getfield tf8.xh5 Z
      // 037: goto 03e
      // 03a: invokestatic tf8.a (Loov;)Loov;
      // 03d: athrow
      // 03e: iload 2
      // 03f: ifeq 05e
      // 042: ifne 058
      // 045: goto 04c
      // 048: invokestatic tf8.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: fload 1
      // 04e: invokespecial tf8.c2n (F)V
      // 051: goto 058
      // 054: invokestatic tf8.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 0
      // 059: getfield tf8.pod F
      // 05c: fconst_0
      // 05d: fcmpl
      // 05e: iload 2
      // 05f: ifeq 135
      // 062: ifne 113
      // 065: goto 06c
      // 068: invokestatic tf8.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: getfield tf8.r80 F
      // 070: fconst_0
      // 071: fcmpl
      // 072: iload 2
      // 073: ifeq 135
      // 076: goto 07d
      // 079: invokestatic tf8.a (Loov;)Loov;
      // 07c: athrow
      // 07d: ifne 113
      // 080: goto 087
      // 083: invokestatic tf8.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: getfield tf8.oo7 F
      // 08b: fconst_0
      // 08c: fcmpl
      // 08d: iload 2
      // 08e: ifeq 135
      // 091: goto 098
      // 094: invokestatic tf8.a (Loov;)Loov;
      // 097: athrow
      // 098: ifne 113
      // 09b: goto 0a2
      // 09e: invokestatic tf8.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield tf8._ki F
      // 0a6: fconst_0
      // 0a7: iload 2
      // 0a8: ifeq 106
      // 0ab: goto 0b2
      // 0ae: invokestatic tf8.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: fcmpl
      // 0b3: ifne 0f3
      // 0b6: goto 0bd
      // 0b9: invokestatic tf8.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield tf8.ca7 F
      // 0c1: fconst_0
      // 0c2: iload 2
      // 0c3: ifeq 106
      // 0c6: goto 0cd
      // 0c9: invokestatic tf8.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: fcmpl
      // 0ce: ifne 0f3
      // 0d1: goto 0d8
      // 0d4: invokestatic tf8.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: getfield tf8.kit F
      // 0dc: fconst_0
      // 0dd: iload 2
      // 0de: ifeq 106
      // 0e1: goto 0e8
      // 0e4: invokestatic tf8.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: fcmpl
      // 0e9: ifeq 1aa
      // 0ec: goto 0f3
      // 0ef: invokestatic tf8.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: getfield tf8._ki F
      // 0f7: fload 1
      // 0f8: fmul
      // 0f9: aload 0
      // 0fa: getfield tf8.ca7 F
      // 0fd: fload 1
      // 0fe: fmul
      // 0ff: goto 106
      // 102: invokestatic tf8.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield tf8.kit F
      // 10a: fload 1
      // 10b: fmul
      // 10c: invokestatic hzu.a4k (FFF)V
      // 10f: iload 2
      // 110: ifne 1aa
      // 113: aload 0
      // 114: getfield tf8._ki F
      // 117: fload 1
      // 118: fmul
      // 119: aload 0
      // 11a: getfield tf8.ca7 F
      // 11d: fload 1
      // 11e: fmul
      // 11f: aload 0
      // 120: getfield tf8.kit F
      // 123: fload 1
      // 124: fmul
      // 125: invokestatic hzu.a4k (FFF)V
      // 128: aload 0
      // 129: getfield tf8.oo7 F
      // 12c: fconst_0
      // 12d: fcmpl
      // 12e: goto 135
      // 131: invokestatic tf8.a (Loov;)Loov;
      // 134: athrow
      // 135: iload 2
      // 136: ifeq 15e
      // 139: ifeq 158
      // 13c: goto 143
      // 13f: invokestatic tf8.a (Loov;)Loov;
      // 142: athrow
      // 143: aload 0
      // 144: getfield tf8.oo7 F
      // 147: ldc 57.295776
      // 149: nop
      // 14a: fmul
      // 14b: fconst_0
      // 14c: fconst_0
      // 14d: fconst_1
      // 14e: invokestatic hzu.a2h (FFFF)V
      // 151: goto 158
      // 154: invokestatic tf8.a (Loov;)Loov;
      // 157: athrow
      // 158: aload 0
      // 159: getfield tf8.r80 F
      // 15c: fconst_0
      // 15d: fcmpl
      // 15e: iload 2
      // 15f: ifeq 192
      // 162: ifeq 181
      // 165: goto 16c
      // 168: invokestatic tf8.a (Loov;)Loov;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield tf8.r80 F
      // 170: ldc 57.295776
      // 172: nop
      // 173: fmul
      // 174: fconst_0
      // 175: fconst_1
      // 176: fconst_0
      // 177: invokestatic hzu.a2h (FFFF)V
      // 17a: goto 181
      // 17d: invokestatic tf8.a (Loov;)Loov;
      // 180: athrow
      // 181: aload 0
      // 182: getfield tf8.pod F
      // 185: fconst_0
      // 186: iload 2
      // 187: ifeq 1a5
      // 18a: fcmpl
      // 18b: goto 192
      // 18e: invokestatic tf8.a (Loov;)Loov;
      // 191: athrow
      // 192: ifeq 1aa
      // 195: aload 0
      // 196: getfield tf8.pod F
      // 199: ldc 57.295776
      // 19b: nop
      // 19c: fmul
      // 19d: fconst_1
      // 19e: goto 1a5
      // 1a1: invokestatic tf8.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: fconst_0
      // 1a6: fconst_0
      // 1a7: invokestatic hzu.a2h (FFFF)V
      // 1aa: return
   }

   private void c2n(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield tf8.zs5 I
      // 08: iload 2
      // 09: ifeq 29
      // 0c: ifne 25
      // 0f: goto 16
      // 12: invokestatic tf8.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: bipush 1
      // 18: invokestatic nkx.ux1 (I)I
      // 1b: putfield tf8.zs5 I
      // 1e: goto 25
      // 21: invokestatic tf8.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield tf8.zs5 I
      // 29: sipush 4864
      // 2c: invokestatic org/lwjgl/opengl/GL11.glNewList (II)V
      // 2f: invokestatic jom.yut ()Ljom;
      // 32: invokevirtual jom.zuq ()Lq3g;
      // 35: astore 3
      // 36: bipush 0
      // 37: istore 4
      // 39: iload 4
      // 3b: aload 0
      // 3c: getfield tf8.mv0 Ljava/util/List;
      // 3f: invokeinterface java/util/List.size ()I 1
      // 44: if_icmpge 6c
      // 47: aload 0
      // 48: getfield tf8.mv0 Ljava/util/List;
      // 4b: iload 4
      // 4d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 52: checkcast upl
      // 55: aload 3
      // 56: fload 1
      // 57: invokevirtual upl.vsk (Lq3g;F)V
      // 5a: iinc 4 1
      // 5d: iload 2
      // 5e: ifeq 6f
      // 61: iload 2
      // 62: ifne 39
      // 65: goto 6c
      // 68: invokestatic tf8.a (Loov;)Loov;
      // 6b: athrow
      // 6c: bipush 0
      // 6d: istore 4
      // 6f: iload 4
      // 71: aload 0
      // 72: getfield tf8.wrh Ljava/util/List;
      // 75: invokeinterface java/util/List.size ()I 1
      // 7a: if_icmpge a8
      // 7d: aload 0
      // 7e: getfield tf8.wrh Ljava/util/List;
      // 81: iload 4
      // 83: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 88: checkcast net/optifine/model/ModelSprite
      // 8b: astore 5
      // 8d: aload 5
      // 8f: invokestatic jom.yut ()Ljom;
      // 92: fload 1
      // 93: invokevirtual net/optifine/model/ModelSprite.render (Ljom;F)V
      // 96: iinc 4 1
      // 99: iload 2
      // 9a: ifeq b0
      // 9d: iload 2
      // 9e: ifne 6f
      // a1: goto a8
      // a4: invokestatic tf8.a (Loov;)Loov;
      // a7: athrow
      // a8: invokestatic org/lwjgl/opengl/GL11.glEndList ()V
      // ab: aload 0
      // ac: bipush 1
      // ad: putfield tf8.xh5 Z
      // b0: return
   }

   public tf8 swi(int var1, int var2) {
      this.mb6 = (float)var1;
      this.o_f = (float)var2;
      return this;
   }

   public void ux4(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.wrh.add(new ModelSprite(this, this.fwy, this.h40, var1, var2, var3, var4, var5, var6, var7));
   }

   public boolean u4r() {
      return this.xh5;
   }

   public int zij() {
      return this.zs5;
   }

   private void in5() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 26
      // 09: getfield tf8.d31 I
      // 0c: getstatic net/optifine/shaders/Shaders.countResetDisplayLists I
      // 0f: if_icmpeq 2c
      // 12: goto 19
      // 15: invokestatic tf8.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: bipush 0
      // 1b: putfield tf8.xh5 Z
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic tf8.a (Loov;)Loov;
      // 25: athrow
      // 26: getstatic net/optifine/shaders/Shaders.countResetDisplayLists I
      // 29: putfield tf8.d31 I
      // 2c: return
   }

   public gdz wny() {
      return this.hpp;
   }

   public void jj1(gdz var1) {
      this.hpp = var1;
   }

   public String _a7() {
      return this.b4w;
   }

   public void y63(String var1) {
      this.b4w = var1;
   }

   public void rm2(int[][] var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.mv0.add(new upl(this, var1, var2, var3, var4, var5, var6, var7, var8, this.hsi));
   }

   public tf8 cn4(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic tf8.a (Loov;)Loov;
      // 0d: athrow
      // 0e: aload 0
      // 0f: getfield tf8.mbo Ljava/util/List;
      // 12: ifnull 58
      // 15: bipush 0
      // 16: istore 3
      // 17: iload 3
      // 18: aload 0
      // 19: getfield tf8.mbo Ljava/util/List;
      // 1c: invokeinterface java/util/List.size ()I 1
      // 21: if_icmpge 58
      // 24: aload 0
      // 25: getfield tf8.mbo Ljava/util/List;
      // 28: iload 3
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast tf8
      // 31: astore 4
      // 33: iload 2
      // 34: ifeq 54
      // 37: aload 1
      // 38: aload 4
      // 3a: invokevirtual tf8._a7 ()Ljava/lang/String;
      // 3d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 40: ifeq 51
      // 43: goto 4a
      // 46: invokestatic tf8.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 4
      // 4c: areturn
      // 4d: invokestatic tf8.a (Loov;)Loov;
      // 50: athrow
      // 51: iinc 3 1
      // 54: iload 2
      // 55: ifne 17
      // 58: aconst_null
      // 59: areturn
   }

   public tf8 _z9(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic tf8.a (Loov;)Loov;
      // 0d: athrow
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokevirtual tf8.cn4 (Ljava/lang/String;)Ltf8;
      // 13: astore 3
      // 14: aload 3
      // 15: iload 2
      // 16: ifeq 2a
      // 19: ifnull 29
      // 1c: goto 23
      // 1f: invokestatic tf8.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 3
      // 24: areturn
      // 25: invokestatic tf8.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield tf8.mbo Ljava/util/List;
      // 2d: ifnull 77
      // 30: bipush 0
      // 31: istore 4
      // 33: iload 4
      // 35: aload 0
      // 36: getfield tf8.mbo Ljava/util/List;
      // 39: invokeinterface java/util/List.size ()I 1
      // 3e: if_icmpge 77
      // 41: aload 0
      // 42: getfield tf8.mbo Ljava/util/List;
      // 45: iload 4
      // 47: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4c: checkcast tf8
      // 4f: astore 5
      // 51: aload 5
      // 53: aload 1
      // 54: invokevirtual tf8._z9 (Ljava/lang/String;)Ltf8;
      // 57: astore 6
      // 59: iload 2
      // 5a: ifeq 73
      // 5d: aload 6
      // 5f: ifnull 70
      // 62: goto 69
      // 65: invokestatic tf8.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 6
      // 6b: areturn
      // 6c: invokestatic tf8.a (Loov;)Loov;
      // 6f: athrow
      // 70: iinc 4 1
      // 73: iload 2
      // 74: ifne 33
      // 77: aconst_null
      // 78: areturn
   }

   public void m_1(ModelUpdater var1) {
      this.kow = var1;
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic tf8.a J
      // 03: ldc2_w 85495768053068
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: new java/lang/StringBuffer
      // 0f: dup
      // 10: invokespecial java/lang/StringBuffer.<init> ()V
      // 13: astore 4
      // 15: aload 4
      // 17: new java/lang/StringBuilder
      // 1a: dup
      // 1b: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e: sipush 7413
      // 21: ldc2_w 1784757274292967453
      // 24: lload 1
      // 25: lxor
      // 26: invokedynamic w (IJ)Ljava/lang/String; bsm=tf8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f: aload 0
      // 30: getfield tf8.b4w Ljava/lang/String;
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36: sipush 23711
      // 39: ldc2_w 211709202587555956
      // 3c: lload 1
      // 3d: lxor
      // 3e: invokedynamic w (IJ)Ljava/lang/String; bsm=tf8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: nop
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: aload 0
      // 48: getfield tf8.mv0 Ljava/util/List;
      // 4b: iload 3
      // 4c: ifeq 64
      // 4f: ifnull 6f
      // 52: goto 59
      // 55: invokestatic tf8.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield tf8.mv0 Ljava/util/List;
      // 5d: goto 64
      // 60: invokestatic tf8.a (Loov;)Loov;
      // 63: athrow
      // 64: invokeinterface java/util/List.size ()I 1
      // 69: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c: goto 70
      // 6f: aconst_null
      // 70: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 73: sipush 25256
      // 76: ldc2_w 8425481662311409217
      // 79: lload 1
      // 7a: lxor
      // 7b: invokedynamic w (IJ)Ljava/lang/String; bsm=tf8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: nop
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: aload 0
      // 85: getfield tf8.mbo Ljava/util/List;
      // 88: iload 3
      // 89: ifeq a1
      // 8c: ifnull ac
      // 8f: goto 96
      // 92: invokestatic tf8.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: getfield tf8.mbo Ljava/util/List;
      // 9a: goto a1
      // 9d: invokestatic tf8.a (Loov;)Loov;
      // a0: athrow
      // a1: invokeinterface java/util/List.size ()I 1
      // a6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a9: goto ad
      // ac: aconst_null
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b3: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // b6: pop
      // b7: aload 4
      // b9: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // bc: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3891345235252450471L, 5793943872327529925L, MethodHandles.lookup().lookupClass()).a(16400174351579L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 117251392481840L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "ÏÿcÆ\u000fIµ\u0091\u0017\u008eÖ§w\u0095Üù\u0092rbà\u0011d\u0093TFí5UÝR\u000e©\u0010O\u0095Ä+\u0016êy\u00ad\u0018\u0082Jfy\u0082ý> ×`\fé¿\u009aW¦sYYc\u00186¶µ\u000e\u001e´\u0018s½\u0014£¹\fi\u001bÙ\u0011ç)";
      int var8 = "ÏÿcÆ\u000fIµ\u0091\u0017\u008eÖ§w\u0095Üù\u0092rbà\u0011d\u0093TFí5UÝR\u000e©\u0010O\u0095Ä+\u0016êy\u00ad\u0018\u0082Jfy\u0082ý> ×`\fé¿\u009aW¦sYYc\u00186¶µ\u000e\u001e´\u0018s½\u0014£¹\fi\u001bÙ\u0011ç)"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26542;
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
            throw new RuntimeException("tf8", var10);
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
         throw new RuntimeException("tf8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
