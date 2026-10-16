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

public class rr2 extends Module {
   public BooleanSetting guv;
   public BooleanSetting iah;
   public BooleanSetting wyq;
   public BooleanSetting _6b;
   public NumberSetting ggr;
   public NumberSetting dzt;
   public boolean gq6;
   public boolean khx;
   public q6h f9m;
   public String in8;
   public String kke;
   public int ca4;
   public String p2y;
   public float xrx;
   public boolean zc7;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public rr2() {
      long var1 = a ^ 103875961906832L;
      super(b<"u">(13421, 4704172924950442678L ^ var1), _aj.y49, false, new SubEngine[0]);
      this.guv = new BooleanSetting(b<"u">(26595, 4396904356504936762L ^ var1), b<"u">(793, 3123074201265096148L ^ var1), true);
      this.iah = new BooleanSetting(b<"u">(26595, 4396904356504936762L ^ var1), b<"u">(22517, 7763520065509396777L ^ var1), true);
      this.wyq = new BooleanSetting(b<"u">(26595, 4396904356504936762L ^ var1), b<"u">(1744, 83358917301551122L ^ var1), false);
      this._6b = new BooleanSetting(b<"u">(26595, 4396904356504936762L ^ var1), b<"u">(27841, 3442470863597644311L ^ var1), true);
      this.ggr = new NumberSetting(b<"u">(26595, 4396904356504936762L ^ var1), b<"u">(11154, 1882202977450257776L ^ var1), 3000.0F, 500.0F, 10000.0F, 100.0F);
      this.dzt = new NumberSetting(b<"u">(26595, 4396904356504936762L ^ var1), b<"u">(4284, 525469592945677889L ^ var1), 100.0F, 100.0F, 3000.0F, 100.0F);
      this.gq6 = false;
      this.khx = false;
      this.f9m = new q6h();
      this.in8 = "";
      this.kke = "";
      this.ca4 = 0;
      this.p2y = "";
      this.xrx = 0.0F;
      this.zc7 = false;
   }

   @Override
   public void onEnable() {
      long var1 = a ^ 131686686358741L;
      this.in8 = "";
      this.n5o(this.m2d() + b<"u">(12592, 399597959615409549L ^ var1));
   }

   @Override
   public void onDisable() {
   }

   @EventHandler
   public void vwr(RenderEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rr2.a J
      // 003: ldc2_w 74773056256207
      // 006: lxor
      // 007: lstore 2
      // 008: new eka
      // 00b: dup
      // 00c: getstatic rr2.ek1 Lc05;
      // 00f: invokespecial eka.<init> (Lc05;)V
      // 012: astore 5
      // 014: invokestatic OpaquePredicate.c ()I
      // 017: getstatic ClientState.qkk Lzwr;
      // 01a: pop
      // 01b: istore 4
      // 01d: getstatic ClientState.gki Lc_3;
      // 020: sipush 9095
      // 023: ldc2_w 7443335297599175448
      // 026: lload 2
      // 027: lxor
      // 028: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: nop
      // 02e: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 031: istore 6
      // 033: aload 5
      // 035: invokevirtual eka.x05 ()I
      // 038: i2f
      // 039: fstore 7
      // 03b: aload 5
      // 03d: invokevirtual eka.lrx ()I
      // 040: i2f
      // 041: fstore 8
      // 043: aload 0
      // 044: iload 4
      // 046: ifne 061
      // 049: getfield rr2.in8 Ljava/lang/String;
      // 04c: ldc ""
      // 04e: nop
      // 04f: if_acmpeq 421
      // 052: goto 059
      // 055: invokestatic rr2.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: goto 061
      // 05d: invokestatic rr2.a (Loov;)Loov;
      // 060: athrow
      // 061: invokevirtual rr2.isEnabled ()Z
      // 064: iload 4
      // 066: ifne 081
      // 069: ifeq 421
      // 06c: goto 073
      // 06f: invokestatic rr2.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield rr2._6b Lcn7;
      // 077: invokevirtual BooleanSetting.g7m ()Z
      // 07a: goto 081
      // 07d: invokestatic rr2.a (Loov;)Loov;
      // 080: athrow
      // 081: iload 4
      // 083: ifne 09b
      // 086: ifeq 421
      // 089: goto 090
      // 08c: invokestatic rr2.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield rr2.zc7 Z
      // 094: goto 09b
      // 097: invokestatic rr2.a (Loov;)Loov;
      // 09a: athrow
      // 09b: iload 4
      // 09d: ifne 28e
      // 0a0: ifeq 273
      // 0a3: goto 0aa
      // 0a6: invokestatic rr2.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: aload 0
      // 0ac: getfield rr2.xrx F
      // 0af: fconst_0
      // 0b0: ldc 10.0
      // 0b2: nop
      // 0b3: aload 0
      // 0b4: getfield rr2.xrx F
      // 0b7: fconst_0
      // 0b8: fsub
      // 0b9: invokestatic java/lang/Math.abs (F)F
      // 0bc: ldc 35.0
      // 0be: nop
      // 0bf: fmul
      // 0c0: invokestatic java/lang/Math.max (FF)F
      // 0c3: f2d
      // 0c4: ldc2_w 0.3
      // 0c7: dmul
      // 0c8: d2f
      // 0c9: invokestatic InputState.lvf (FFF)F
      // 0cc: putfield rr2.xrx F
      // 0cf: aload 0
      // 0d0: new java/lang/StringBuilder
      // 0d3: dup
      // 0d4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d7: sipush 17011
      // 0da: ldc2_w 60667405729995477
      // 0dd: lload 2
      // 0de: lxor
      // 0df: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: aload 0
      // 0e9: getfield rr2.ggr Lcrk;
      // 0ec: invokevirtual NumberSetting.u7t ()D
      // 0ef: aload 0
      // 0f0: getfield rr2.dzt Lcrk;
      // 0f3: invokevirtual NumberSetting.u7t ()D
      // 0f6: dadd
      // 0f7: aload 0
      // 0f8: getfield rr2.f9m Lq6h;
      // 0fb: invokevirtual q6h.r2f ()J
      // 0fe: l2d
      // 0ff: dadd
      // 100: invokestatic java/lang/System.currentTimeMillis ()J
      // 103: l2d
      // 104: dsub
      // 105: ldc2_w 1000.0
      // 108: ddiv
      // 109: d2i
      // 10a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 10d: ldc "s"
      // 10f: nop
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 116: putfield rr2.p2y Ljava/lang/String;
      // 119: fload 7
      // 11b: ldc 142.0
      // 11d: nop
      // 11e: fsub
      // 11f: ldc 5.0
      // 121: nop
      // 122: aload 0
      // 123: getfield rr2.xrx F
      // 126: fadd
      // 127: ldc 138.0
      // 129: nop
      // 12a: ldc 35.0
      // 12c: nop
      // 12d: fconst_2
      // 12e: iload 6
      // 130: iload 4
      // 132: ifne 153
      // 135: goto 13c
      // 138: invokestatic rr2.a (Loov;)Loov;
      // 13b: athrow
      // 13c: ifeq 156
      // 13f: goto 146
      // 142: invokestatic rr2.a (Loov;)Loov;
      // 145: athrow
      // 146: getstatic z7e.ret Lz7e;
      // 149: getfield z7e.k0y I
      // 14c: goto 153
      // 14f: invokestatic rr2.a (Loov;)Loov;
      // 152: athrow
      // 153: goto 15c
      // 156: getstatic z7e.a2_ Lz7e;
      // 159: getfield z7e.k0y I
      // 15c: ldc 0.65
      // 15e: nop
      // 15f: invokestatic hhf.kjo (IF)I
      // 162: fconst_1
      // 163: iload 6
      // 165: iload 4
      // 167: ifne 181
      // 16a: ifeq 184
      // 16d: goto 174
      // 170: invokestatic rr2.a (Loov;)Loov;
      // 173: athrow
      // 174: getstatic z7e.ret Lz7e;
      // 177: getfield z7e.k0y I
      // 17a: goto 181
      // 17d: invokestatic rr2.a (Loov;)Loov;
      // 180: athrow
      // 181: goto 18a
      // 184: getstatic z7e.a2_ Lz7e;
      // 187: getfield z7e.k0y I
      // 18a: ldc 0.65
      // 18c: nop
      // 18d: invokestatic hhf.kjo (IF)I
      // 190: invokestatic mkt.o8m (FFFFFIFI)V
      // 193: getstatic jsr._t0 Lcyb;
      // 196: ldc "t"
      // 198: nop
      // 199: fload 7
      // 19b: ldc 140.0
      // 19d: nop
      // 19e: fsub
      // 19f: ldc 9.0
      // 1a1: nop
      // 1a2: aload 0
      // 1a3: getfield rr2.xrx F
      // 1a6: fadd
      // 1a7: iload 6
      // 1a9: iload 4
      // 1ab: ifne 1cb
      // 1ae: ifeq 1ce
      // 1b1: goto 1b8
      // 1b4: invokestatic rr2.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: getstatic z7e.a2_ Lz7e;
      // 1bb: getfield z7e.k0y I
      // 1be: ldc 0.9
      // 1c0: nop
      // 1c1: invokestatic hhf.kjo (IF)I
      // 1c4: goto 1cb
      // 1c7: invokestatic rr2.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: goto 1d4
      // 1ce: getstatic z7e.kks Lz7e;
      // 1d1: getfield z7e.k0y I
      // 1d4: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1d7: pop
      // 1d8: getstatic jsr.r8s Lcyb;
      // 1db: sipush 7437
      // 1de: ldc2_w 9122367489130612097
      // 1e1: lload 2
      // 1e2: lxor
      // 1e3: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: nop
      // 1e9: fload 7
      // 1eb: ldc 124.0
      // 1ed: nop
      // 1ee: fsub
      // 1ef: ldc 8.0
      // 1f1: nop
      // 1f2: aload 0
      // 1f3: getfield rr2.xrx F
      // 1f6: fadd
      // 1f7: iload 6
      // 1f9: iload 4
      // 1fb: ifne 21b
      // 1fe: ifeq 21e
      // 201: goto 208
      // 204: invokestatic rr2.a (Loov;)Loov;
      // 207: athrow
      // 208: getstatic z7e.a2_ Lz7e;
      // 20b: getfield z7e.k0y I
      // 20e: ldc 0.9
      // 210: nop
      // 211: invokestatic hhf.kjo (IF)I
      // 214: goto 21b
      // 217: invokestatic rr2.a (Loov;)Loov;
      // 21a: athrow
      // 21b: goto 224
      // 21e: getstatic z7e.kks Lz7e;
      // 221: getfield z7e.k0y I
      // 224: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 227: pop
      // 228: getstatic jsr.rfr Lcyb;
      // 22b: aload 0
      // 22c: getfield rr2.p2y Ljava/lang/String;
      // 22f: fload 7
      // 231: ldc 138.0
      // 233: nop
      // 234: fsub
      // 235: ldc 25.0
      // 237: nop
      // 238: aload 0
      // 239: getfield rr2.xrx F
      // 23c: fadd
      // 23d: iload 6
      // 23f: iload 4
      // 241: ifne 261
      // 244: ifeq 264
      // 247: goto 24e
      // 24a: invokestatic rr2.a (Loov;)Loov;
      // 24d: athrow
      // 24e: getstatic z7e.a2_ Lz7e;
      // 251: getfield z7e.k0y I
      // 254: ldc 0.9
      // 256: nop
      // 257: invokestatic hhf.kjo (IF)I
      // 25a: goto 261
      // 25d: invokestatic rr2.a (Loov;)Loov;
      // 260: athrow
      // 261: goto 26a
      // 264: getstatic z7e.kks Lz7e;
      // 267: getfield z7e.k0y I
      // 26a: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 26d: pop
      // 26e: iload 4
      // 270: ifeq 421
      // 273: aload 0
      // 274: getfield rr2.xrx F
      // 277: ldc -40.0
      // 279: nop
      // 27a: iload 4
      // 27c: ifne 2e1
      // 27f: goto 286
      // 282: invokestatic rr2.a (Loov;)Loov;
      // 285: athrow
      // 286: fcmpl
      // 287: goto 28e
      // 28a: invokestatic rr2.a (Loov;)Loov;
      // 28d: athrow
      // 28e: ifle 421
      // 291: aload 0
      // 292: aload 0
      // 293: getfield rr2.xrx F
      // 296: ldc -40.0
      // 298: nop
      // 299: ldc 10.0
      // 29b: nop
      // 29c: aload 0
      // 29d: getfield rr2.xrx F
      // 2a0: ldc -40.0
      // 2a2: nop
      // 2a3: fsub
      // 2a4: invokestatic java/lang/Math.abs (F)F
      // 2a7: ldc 35.0
      // 2a9: nop
      // 2aa: fmul
      // 2ab: invokestatic java/lang/Math.max (FF)F
      // 2ae: f2d
      // 2af: ldc2_w 0.3
      // 2b2: dmul
      // 2b3: d2f
      // 2b4: invokestatic InputState.lvf (FFF)F
      // 2b7: putfield rr2.xrx F
      // 2ba: aload 0
      // 2bb: sipush 20168
      // 2be: ldc2_w 2134709453835277924
      // 2c1: lload 2
      // 2c2: lxor
      // 2c3: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: nop
      // 2c9: putfield rr2.p2y Ljava/lang/String;
      // 2cc: fload 7
      // 2ce: ldc 142.0
      // 2d0: nop
      // 2d1: fsub
      // 2d2: ldc 5.0
      // 2d4: nop
      // 2d5: aload 0
      // 2d6: getfield rr2.xrx F
      // 2d9: fadd
      // 2da: goto 2e1
      // 2dd: invokestatic rr2.a (Loov;)Loov;
      // 2e0: athrow
      // 2e1: ldc 138.0
      // 2e3: nop
      // 2e4: ldc 35.0
      // 2e6: nop
      // 2e7: fconst_2
      // 2e8: iload 6
      // 2ea: iload 4
      // 2ec: ifne 306
      // 2ef: ifeq 309
      // 2f2: goto 2f9
      // 2f5: invokestatic rr2.a (Loov;)Loov;
      // 2f8: athrow
      // 2f9: getstatic z7e.ret Lz7e;
      // 2fc: getfield z7e.k0y I
      // 2ff: goto 306
      // 302: invokestatic rr2.a (Loov;)Loov;
      // 305: athrow
      // 306: goto 30f
      // 309: getstatic z7e.a2_ Lz7e;
      // 30c: getfield z7e.k0y I
      // 30f: ldc 0.65
      // 311: nop
      // 312: invokestatic hhf.kjo (IF)I
      // 315: fconst_1
      // 316: iload 6
      // 318: iload 4
      // 31a: ifne 334
      // 31d: ifeq 337
      // 320: goto 327
      // 323: invokestatic rr2.a (Loov;)Loov;
      // 326: athrow
      // 327: getstatic z7e.ret Lz7e;
      // 32a: getfield z7e.k0y I
      // 32d: goto 334
      // 330: invokestatic rr2.a (Loov;)Loov;
      // 333: athrow
      // 334: goto 33d
      // 337: getstatic z7e.a2_ Lz7e;
      // 33a: getfield z7e.k0y I
      // 33d: ldc 0.65
      // 33f: nop
      // 340: invokestatic hhf.kjo (IF)I
      // 343: invokestatic mkt.o8m (FFFFFIFI)V
      // 346: getstatic jsr._t0 Lcyb;
      // 349: ldc "t"
      // 34b: nop
      // 34c: fload 7
      // 34e: ldc 140.0
      // 350: nop
      // 351: fsub
      // 352: ldc 9.0
      // 354: nop
      // 355: aload 0
      // 356: getfield rr2.xrx F
      // 359: fadd
      // 35a: iload 6
      // 35c: iload 4
      // 35e: ifne 37e
      // 361: ifeq 381
      // 364: goto 36b
      // 367: invokestatic rr2.a (Loov;)Loov;
      // 36a: athrow
      // 36b: getstatic z7e.a2_ Lz7e;
      // 36e: getfield z7e.k0y I
      // 371: ldc 0.9
      // 373: nop
      // 374: invokestatic hhf.kjo (IF)I
      // 377: goto 37e
      // 37a: invokestatic rr2.a (Loov;)Loov;
      // 37d: athrow
      // 37e: goto 387
      // 381: getstatic z7e.kks Lz7e;
      // 384: getfield z7e.k0y I
      // 387: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 38a: pop
      // 38b: getstatic jsr.r8s Lcyb;
      // 38e: sipush 16956
      // 391: ldc2_w 5794545329669380760
      // 394: lload 2
      // 395: lxor
      // 396: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: nop
      // 39c: fload 7
      // 39e: ldc 124.0
      // 3a0: nop
      // 3a1: fsub
      // 3a2: ldc 8.0
      // 3a4: nop
      // 3a5: aload 0
      // 3a6: getfield rr2.xrx F
      // 3a9: fadd
      // 3aa: iload 6
      // 3ac: iload 4
      // 3ae: ifne 3ce
      // 3b1: ifeq 3d1
      // 3b4: goto 3bb
      // 3b7: invokestatic rr2.a (Loov;)Loov;
      // 3ba: athrow
      // 3bb: getstatic z7e.a2_ Lz7e;
      // 3be: getfield z7e.k0y I
      // 3c1: ldc 0.9
      // 3c3: nop
      // 3c4: invokestatic hhf.kjo (IF)I
      // 3c7: goto 3ce
      // 3ca: invokestatic rr2.a (Loov;)Loov;
      // 3cd: athrow
      // 3ce: goto 3d7
      // 3d1: getstatic z7e.kks Lz7e;
      // 3d4: getfield z7e.k0y I
      // 3d7: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 3da: pop
      // 3db: getstatic jsr.rfr Lcyb;
      // 3de: aload 0
      // 3df: getfield rr2.p2y Ljava/lang/String;
      // 3e2: fload 7
      // 3e4: ldc 138.0
      // 3e6: nop
      // 3e7: fsub
      // 3e8: ldc 25.0
      // 3ea: nop
      // 3eb: aload 0
      // 3ec: getfield rr2.xrx F
      // 3ef: fadd
      // 3f0: iload 6
      // 3f2: iload 4
      // 3f4: ifne 414
      // 3f7: ifeq 417
      // 3fa: goto 401
      // 3fd: invokestatic rr2.a (Loov;)Loov;
      // 400: athrow
      // 401: getstatic z7e.a2_ Lz7e;
      // 404: getfield z7e.k0y I
      // 407: ldc 0.9
      // 409: nop
      // 40a: invokestatic hhf.kjo (IF)I
      // 40d: goto 414
      // 410: invokestatic rr2.a (Loov;)Loov;
      // 413: athrow
      // 414: goto 41d
      // 417: getstatic z7e.kks Lz7e;
      // 41a: getfield z7e.k0y I
      // 41d: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 420: pop
      // 421: return
   }

   @EventHandler
   public void oad(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rr2.a J
      // 003: ldc2_w 80324595613992
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: getstatic rr2.ek1 Lc05;
      // 010: getfield Minecraft.vg8 Ll86;
      // 013: ifnull 1f8
      // 016: aload 0
      // 017: getfield rr2.gq6 Z
      // 01a: iload 4
      // 01c: ifne 03b
      // 01f: goto 026
      // 022: invokestatic rr2.a (Loov;)Loov;
      // 025: athrow
      // 026: ifeq 1f8
      // 029: goto 030
      // 02c: invokestatic rr2.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield rr2.khx Z
      // 034: goto 03b
      // 037: invokestatic rr2.a (Loov;)Loov;
      // 03a: athrow
      // 03b: iload 4
      // 03d: ifne 158
      // 040: ifne 154
      // 043: goto 04a
      // 046: invokestatic rr2.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: getfield rr2.f9m Lq6h;
      // 04e: aload 0
      // 04f: getfield rr2.dzt Lcrk;
      // 052: invokevirtual NumberSetting.u7t ()D
      // 055: invokevirtual q6h.hqu (D)Z
      // 058: iload 4
      // 05a: ifne 158
      // 05d: goto 064
      // 060: invokestatic rr2.a (Loov;)Loov;
      // 063: athrow
      // 064: ifeq 154
      // 067: goto 06e
      // 06a: invokestatic rr2.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: bipush 1
      // 070: putfield rr2.khx Z
      // 073: aload 0
      // 074: dup
      // 075: getfield rr2.ca4 I
      // 078: bipush 1
      // 079: iadd
      // 07a: putfield rr2.ca4 I
      // 07d: aload 0
      // 07e: invokevirtual rr2.isEnabled ()Z
      // 081: iload 4
      // 083: ifne 158
      // 086: goto 08d
      // 089: invokestatic rr2.a (Loov;)Loov;
      // 08c: athrow
      // 08d: ifeq 154
      // 090: goto 097
      // 093: invokestatic rr2.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: getfield rr2.guv Lcn7;
      // 09b: invokevirtual BooleanSetting.g7m ()Z
      // 09e: iload 4
      // 0a0: ifne 117
      // 0a3: goto 0aa
      // 0a6: invokestatic rr2.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: ifeq 110
      // 0ad: goto 0b4
      // 0b0: invokestatic rr2.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: getstatic rr2.ek1 Lc05;
      // 0b7: getfield Minecraft.vg8 Ll86;
      // 0ba: new java/lang/StringBuilder
      // 0bd: dup
      // 0be: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c1: sipush 25789
      // 0c4: ldc2_w 5610503084106073569
      // 0c7: lload 2
      // 0c8: lxor
      // 0c9: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: nop
      // 0cf: iload 4
      // 0d1: ifne 106
      // 0d4: goto 0db
      // 0d7: invokestatic rr2.a (Loov;)Loov;
      // 0da: athrow
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: aload 0
      // 0df: getfield rr2.iah Lcn7;
      // 0e2: invokevirtual BooleanSetting.g7m ()Z
      // 0e5: ifeq 104
      // 0e8: goto 0ef
      // 0eb: invokestatic rr2.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: sipush 5109
      // 0f2: ldc2_w 2683483374010741400
      // 0f5: lload 2
      // 0f6: lxor
      // 0f7: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: nop
      // 0fd: goto 107
      // 100: invokestatic rr2.a (Loov;)Loov;
      // 103: athrow
      // 104: ldc ""
      // 106: nop
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10d: invokevirtual EntityPlayerSP.vf0 (Ljava/lang/String;)V
      // 110: aload 0
      // 111: getfield rr2.wyq Lcn7;
      // 114: invokevirtual BooleanSetting.g7m ()Z
      // 117: iload 4
      // 119: ifne 158
      // 11c: ifeq 154
      // 11f: goto 126
      // 122: invokestatic rr2.a (Loov;)Loov;
      // 125: athrow
      // 126: getstatic rr2.ek1 Lc05;
      // 129: getfield Minecraft.t43 Ld1f;
      // 12c: invokevirtual d1f.lcg ()Lsxg;
      // 12f: getstatic rr2.ek1 Lc05;
      // 132: getfield Minecraft.glh Ljava/io/File;
      // 135: getstatic rr2.ek1 Lc05;
      // 138: getfield Minecraft.pfr I
      // 13b: getstatic rr2.ek1 Lc05;
      // 13e: getfield Minecraft.ry7 I
      // 141: getstatic rr2.ek1 Lc05;
      // 144: invokevirtual Minecraft._d2 ()Loru;
      // 147: invokestatic qm3.o6i (Ljava/io/File;IILoru;)Lekw;
      // 14a: invokevirtual sxg.obg (Lekw;)V
      // 14d: goto 154
      // 150: invokestatic rr2.a (Loov;)Loov;
      // 153: athrow
      // 154: aload 0
      // 155: getfield rr2.khx Z
      // 158: iload 4
      // 15a: ifne 190
      // 15d: ifeq 1f8
      // 160: goto 167
      // 163: invokestatic rr2.a (Loov;)Loov;
      // 166: athrow
      // 167: aload 0
      // 168: iload 4
      // 16a: ifne 1ee
      // 16d: goto 174
      // 170: invokestatic rr2.a (Loov;)Loov;
      // 173: athrow
      // 174: getfield rr2.f9m Lq6h;
      // 177: aload 0
      // 178: getfield rr2.ggr Lcrk;
      // 17b: invokevirtual NumberSetting.u7t ()D
      // 17e: aload 0
      // 17f: getfield rr2.dzt Lcrk;
      // 182: invokevirtual NumberSetting.u7t ()D
      // 185: dadd
      // 186: invokevirtual q6h.hqu (D)Z
      // 189: goto 190
      // 18c: invokestatic rr2.a (Loov;)Loov;
      // 18f: athrow
      // 190: ifeq 1e6
      // 193: aload 0
      // 194: bipush 0
      // 195: putfield rr2.khx Z
      // 198: aload 0
      // 199: bipush 0
      // 19a: putfield rr2.gq6 Z
      // 19d: aload 0
      // 19e: bipush 0
      // 19f: putfield rr2.zc7 Z
      // 1a2: aload 0
      // 1a3: getfield rr2._6b Lcn7;
      // 1a6: invokevirtual BooleanSetting.g7m ()Z
      // 1a9: iload 4
      // 1ab: ifne 1ca
      // 1ae: goto 1b5
      // 1b1: invokestatic rr2.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: ifeq 1f8
      // 1b8: goto 1bf
      // 1bb: invokestatic rr2.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: invokevirtual rr2.isEnabled ()Z
      // 1c3: goto 1ca
      // 1c6: invokestatic rr2.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: ifeq 1f8
      // 1cd: getstatic rr2.ek1 Lc05;
      // 1d0: getfield Minecraft.vg8 Ll86;
      // 1d3: aload 0
      // 1d4: getfield rr2.in8 Ljava/lang/String;
      // 1d7: invokevirtual EntityPlayerSP.vf0 (Ljava/lang/String;)V
      // 1da: iload 4
      // 1dc: ifeq 1f8
      // 1df: goto 1e6
      // 1e2: invokestatic rr2.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: aload 0
      // 1e7: goto 1ee
      // 1ea: invokestatic rr2.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 0
      // 1ef: getfield rr2._6b Lcn7;
      // 1f2: invokevirtual BooleanSetting.g7m ()Z
      // 1f5: putfield rr2.zc7 Z
      // 1f8: return
   }

   @EventHandler
   public void dcs(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic rr2.a J
      // 03: ldc2_w 113250529817355
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual wbh.nlg ()Lmz2;
      // 11: iload 4
      // 13: ifeq 2e
      // 16: instanceof net/minecraft/network/play/server/S45PacketTitle
      // 19: ifeq 97
      // 1c: goto 23
      // 1f: invokestatic rr2.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual wbh.nlg ()Lmz2;
      // 27: goto 2e
      // 2a: invokestatic rr2.a (Loov;)Loov;
      // 2d: athrow
      // 2e: checkcast net/minecraft/network/play/server/S45PacketTitle
      // 31: astore 5
      // 33: aload 5
      // 35: invokevirtual net/minecraft/network/play/server/S45PacketTitle.uwr ()Lekw;
      // 38: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 3d: astore 6
      // 3f: aload 6
      // 41: sipush 31990
      // 44: ldc2_w 2582913405310529425
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 52: iload 4
      // 54: ifeq 7b
      // 57: ifeq 91
      // 5a: goto 61
      // 5d: invokestatic rr2.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 6
      // 63: sipush 14488
      // 66: ldc2_w 7219663855168138188
      // 69: lload 2
      // 6a: lxor
      // 6b: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 74: goto 7b
      // 77: invokestatic rr2.a (Loov;)Loov;
      // 7a: athrow
      // 7b: ifeq 91
      // 7e: aload 0
      // 7f: getfield rr2.f9m Lq6h;
      // 82: invokevirtual q6h.u1k ()V
      // 85: aload 0
      // 86: bipush 1
      // 87: putfield rr2.gq6 Z
      // 8a: goto 91
      // 8d: invokestatic rr2.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: aload 6
      // 94: putfield rr2.kke Ljava/lang/String;
      // 97: return
   }

   @EventHandler
   public void y2a(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rr2.a J
      // 003: ldc2_w 789508620363
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 146
      // 013: getfield rr2.in8 Ljava/lang/String;
      // 016: sipush 23689
      // 019: ldc2_w 1262227406852258966
      // 01c: lload 2
      // 01d: lxor
      // 01e: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: nop
      // 024: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 027: ifeq 13e
      // 02a: goto 031
      // 02d: invokestatic rr2.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 0
      // 032: getfield rr2.in8 Ljava/lang/String;
      // 035: sipush 28506
      // 038: ldc2_w 1043830061232082790
      // 03b: lload 2
      // 03c: lxor
      // 03d: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: nop
      // 043: ldc ""
      // 045: nop
      // 046: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 049: ldc "_"
      // 04b: nop
      // 04c: ldc " "
      // 04e: nop
      // 04f: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 052: astore 5
      // 054: bipush 1
      // 055: istore 6
      // 057: ldc ""
      // 059: nop
      // 05a: astore 7
      // 05c: aload 5
      // 05e: invokevirtual java/lang/String.toCharArray ()[C
      // 061: astore 8
      // 063: aload 8
      // 065: arraylength
      // 066: istore 9
      // 068: bipush 0
      // 069: istore 10
      // 06b: iload 10
      // 06d: iload 9
      // 06f: if_icmpge 10e
      // 072: aload 8
      // 074: iload 10
      // 076: caload
      // 077: istore 11
      // 079: iload 11
      // 07b: iload 4
      // 07d: ifne 172
      // 080: iload 4
      // 082: ifne 0c0
      // 085: goto 08c
      // 088: invokestatic rr2.a (Loov;)Loov;
      // 08b: athrow
      // 08c: bipush 32
      // 08e: if_icmpne 0b7
      // 091: goto 098
      // 094: invokestatic rr2.a (Loov;)Loov;
      // 097: athrow
      // 098: bipush 1
      // 099: istore 6
      // 09b: new java/lang/StringBuilder
      // 09e: dup
      // 09f: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a2: aload 7
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: ldc " "
      // 0a9: nop
      // 0aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b0: astore 7
      // 0b2: iload 4
      // 0b4: ifeq 106
      // 0b7: iload 6
      // 0b9: goto 0c0
      // 0bc: invokestatic rr2.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 4
      // 0c2: ifne 0d0
      // 0c5: ifeq 0f0
      // 0c8: goto 0cf
      // 0cb: invokestatic rr2.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: bipush 0
      // 0d0: istore 6
      // 0d2: new java/lang/StringBuilder
      // 0d5: dup
      // 0d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d9: aload 7
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: iload 11
      // 0e0: invokestatic java/lang/Character.toUpperCase (C)C
      // 0e3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0e6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e9: astore 7
      // 0eb: iload 4
      // 0ed: ifeq 106
      // 0f0: new java/lang/StringBuilder
      // 0f3: dup
      // 0f4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f7: aload 7
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: iload 11
      // 0fe: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 101: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 104: astore 7
      // 106: iinc 10 1
      // 109: iload 4
      // 10b: ifeq 06b
      // 10e: aload 0
      // 10f: new java/lang/StringBuilder
      // 112: dup
      // 113: invokespecial java/lang/StringBuilder.<init> ()V
      // 116: aload 0
      // 117: invokevirtual rr2.m2d ()Ljava/lang/String;
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: sipush 23948
      // 120: ldc2_w 7383373594600275366
      // 123: lload 2
      // 124: lxor
      // 125: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: nop
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: aload 7
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 133: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 136: invokevirtual rr2.n5o (Ljava/lang/String;)V
      // 139: iload 4
      // 13b: ifeq 16b
      // 13e: aload 0
      // 13f: goto 146
      // 142: invokestatic rr2.a (Loov;)Loov;
      // 145: athrow
      // 146: new java/lang/StringBuilder
      // 149: dup
      // 14a: invokespecial java/lang/StringBuilder.<init> ()V
      // 14d: aload 0
      // 14e: invokevirtual rr2.m2d ()Ljava/lang/String;
      // 151: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 154: sipush 26352
      // 157: ldc2_w 1353288863129356013
      // 15a: lload 2
      // 15b: lxor
      // 15c: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: nop
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 168: invokevirtual rr2.n5o (Ljava/lang/String;)V
      // 16b: aload 1
      // 16c: invokevirtual ihr.bbi ()Lmz2;
      // 16f: instanceof net/minecraft/network/play/client/C0EPacketClickWindow
      // 172: iload 4
      // 174: ifne 686
      // 177: ifeq 66c
      // 17a: goto 181
      // 17d: invokestatic rr2.a (Loov;)Loov;
      // 180: athrow
      // 181: aload 1
      // 182: invokevirtual ihr.bbi ()Lmz2;
      // 185: checkcast net/minecraft/network/play/client/C0EPacketClickWindow
      // 188: astore 5
      // 18a: aload 5
      // 18c: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.zo5 ()Lerg;
      // 18f: invokevirtual erg.zow ()Ljava/lang/String;
      // 192: astore 6
      // 194: aload 5
      // 196: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.zo5 ()Lerg;
      // 199: invokevirtual erg.zow ()Ljava/lang/String;
      // 19c: sipush 4705
      // 19f: ldc2_w 8164363197614699100
      // 1a2: lload 2
      // 1a3: lxor
      // 1a4: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: nop
      // 1aa: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1ad: iload 4
      // 1af: ifne 1ce
      // 1b2: ifeq 667
      // 1b5: goto 1bc
      // 1b8: invokestatic rr2.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: aload 5
      // 1be: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.zo5 ()Lerg;
      // 1c1: invokevirtual erg.gn1 ()Lu7m;
      // 1c4: invokestatic u7m._lo (Lu7m;)I
      // 1c7: goto 1ce
      // 1ca: invokestatic rr2.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: istore 7
      // 1d0: iload 7
      // 1d2: iload 4
      // 1d4: ifne 219
      // 1d7: sipush 381
      // 1da: if_icmpeq 1ff
      // 1dd: goto 1e4
      // 1e0: invokestatic rr2.a (Loov;)Loov;
      // 1e3: athrow
      // 1e4: iload 7
      // 1e6: sipush 368
      // 1e9: iload 4
      // 1eb: ifne 4b5
      // 1ee: goto 1f5
      // 1f1: invokestatic rr2.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: if_icmpne 49d
      // 1f8: goto 1ff
      // 1fb: invokestatic rr2.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: aload 6
      // 201: sipush 12989
      // 204: ldc2_w 8626427540967592611
      // 207: lload 2
      // 208: lxor
      // 209: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: nop
      // 20f: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 212: goto 219
      // 215: invokestatic rr2.a (Loov;)Loov;
      // 218: athrow
      // 219: iload 4
      // 21b: ifne 26b
      // 21e: ifne 251
      // 221: goto 228
      // 224: invokestatic rr2.a (Loov;)Loov;
      // 227: athrow
      // 228: aload 6
      // 22a: sipush 2862
      // 22d: ldc2_w 907334345665227582
      // 230: lload 2
      // 231: lxor
      // 232: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: nop
      // 238: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 23b: iload 4
      // 23d: ifne 26b
      // 240: goto 247
      // 243: invokestatic rr2.a (Loov;)Loov;
      // 246: athrow
      // 247: ifeq 667
      // 24a: goto 251
      // 24d: invokestatic rr2.a (Loov;)Loov;
      // 250: athrow
      // 251: aload 6
      // 253: sipush 15791
      // 256: ldc2_w 2742703584920968587
      // 259: lload 2
      // 25a: lxor
      // 25b: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: nop
      // 261: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 264: goto 26b
      // 267: invokestatic rr2.a (Loov;)Loov;
      // 26a: athrow
      // 26b: iload 4
      // 26d: ifne 2bd
      // 270: ifne 2a3
      // 273: goto 27a
      // 276: invokestatic rr2.a (Loov;)Loov;
      // 279: athrow
      // 27a: aload 6
      // 27c: sipush 26081
      // 27f: ldc2_w 568869004785796554
      // 282: lload 2
      // 283: lxor
      // 284: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: nop
      // 28a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 28d: iload 4
      // 28f: ifne 391
      // 292: goto 299
      // 295: invokestatic rr2.a (Loov;)Loov;
      // 298: athrow
      // 299: ifeq 377
      // 29c: goto 2a3
      // 29f: invokestatic rr2.a (Loov;)Loov;
      // 2a2: athrow
      // 2a3: aload 6
      // 2a5: sipush 16628
      // 2a8: ldc2_w 72024246445793482
      // 2ab: lload 2
      // 2ac: lxor
      // 2ad: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: nop
      // 2b3: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2b6: goto 2bd
      // 2b9: invokestatic rr2.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: iload 4
      // 2bf: ifne 2e6
      // 2c2: ifne 2f5
      // 2c5: goto 2cc
      // 2c8: invokestatic rr2.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: aload 6
      // 2ce: sipush 26604
      // 2d1: ldc2_w 2463117911253567456
      // 2d4: lload 2
      // 2d5: lxor
      // 2d6: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: nop
      // 2dc: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2df: goto 2e6
      // 2e2: invokestatic rr2.a (Loov;)Loov;
      // 2e5: athrow
      // 2e6: iload 4
      // 2e8: ifne 32d
      // 2eb: ifeq 313
      // 2ee: goto 2f5
      // 2f1: invokestatic rr2.a (Loov;)Loov;
      // 2f4: athrow
      // 2f5: aload 0
      // 2f6: sipush 18146
      // 2f9: ldc2_w 7060579722252773104
      // 2fc: lload 2
      // 2fd: lxor
      // 2fe: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: nop
      // 304: putfield rr2.in8 Ljava/lang/String;
      // 307: iload 4
      // 309: ifeq 667
      // 30c: goto 313
      // 30f: invokestatic rr2.a (Loov;)Loov;
      // 312: athrow
      // 313: aload 6
      // 315: sipush 3462
      // 318: ldc2_w 9128458810757590413
      // 31b: lload 2
      // 31c: lxor
      // 31d: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: nop
      // 323: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 326: goto 32d
      // 329: invokestatic rr2.a (Loov;)Loov;
      // 32c: athrow
      // 32d: iload 4
      // 32f: ifne 356
      // 332: ifne 359
      // 335: goto 33c
      // 338: invokestatic rr2.a (Loov;)Loov;
      // 33b: athrow
      // 33c: aload 6
      // 33e: sipush 26801
      // 341: ldc2_w 558687748865345716
      // 344: lload 2
      // 345: lxor
      // 346: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: nop
      // 34c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 34f: goto 356
      // 352: invokestatic rr2.a (Loov;)Loov;
      // 355: athrow
      // 356: ifeq 667
      // 359: aload 0
      // 35a: sipush 29277
      // 35d: ldc2_w 8118670532027077198
      // 360: lload 2
      // 361: lxor
      // 362: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: nop
      // 368: putfield rr2.in8 Ljava/lang/String;
      // 36b: iload 4
      // 36d: ifeq 667
      // 370: goto 377
      // 373: invokestatic rr2.a (Loov;)Loov;
      // 376: athrow
      // 377: aload 6
      // 379: sipush 22419
      // 37c: ldc2_w 7628932220259465099
      // 37f: lload 2
      // 380: lxor
      // 381: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 386: nop
      // 387: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 38a: goto 391
      // 38d: invokestatic rr2.a (Loov;)Loov;
      // 390: athrow
      // 391: iload 4
      // 393: ifne 3e3
      // 396: ifne 3c9
      // 399: goto 3a0
      // 39c: invokestatic rr2.a (Loov;)Loov;
      // 39f: athrow
      // 3a0: aload 6
      // 3a2: sipush 24408
      // 3a5: ldc2_w 7145658169612468084
      // 3a8: lload 2
      // 3a9: lxor
      // 3aa: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3af: nop
      // 3b0: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 3b3: iload 4
      // 3b5: ifne 3e3
      // 3b8: goto 3bf
      // 3bb: invokestatic rr2.a (Loov;)Loov;
      // 3be: athrow
      // 3bf: ifeq 667
      // 3c2: goto 3c9
      // 3c5: invokestatic rr2.a (Loov;)Loov;
      // 3c8: athrow
      // 3c9: aload 6
      // 3cb: sipush 28849
      // 3ce: ldc2_w 8625100329139261623
      // 3d1: lload 2
      // 3d2: lxor
      // 3d3: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d8: nop
      // 3d9: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 3dc: goto 3e3
      // 3df: invokestatic rr2.a (Loov;)Loov;
      // 3e2: athrow
      // 3e3: iload 4
      // 3e5: ifne 40c
      // 3e8: ifne 41b
      // 3eb: goto 3f2
      // 3ee: invokestatic rr2.a (Loov;)Loov;
      // 3f1: athrow
      // 3f2: aload 6
      // 3f4: sipush 212
      // 3f7: ldc2_w 2882758128913653966
      // 3fa: lload 2
      // 3fb: lxor
      // 3fc: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: nop
      // 402: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 405: goto 40c
      // 408: invokestatic rr2.a (Loov;)Loov;
      // 40b: athrow
      // 40c: iload 4
      // 40e: ifne 453
      // 411: ifeq 439
      // 414: goto 41b
      // 417: invokestatic rr2.a (Loov;)Loov;
      // 41a: athrow
      // 41b: aload 0
      // 41c: sipush 10411
      // 41f: ldc2_w 2364645782112995492
      // 422: lload 2
      // 423: lxor
      // 424: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: nop
      // 42a: putfield rr2.in8 Ljava/lang/String;
      // 42d: iload 4
      // 42f: ifeq 667
      // 432: goto 439
      // 435: invokestatic rr2.a (Loov;)Loov;
      // 438: athrow
      // 439: aload 6
      // 43b: sipush 30950
      // 43e: ldc2_w 2519006879825713395
      // 441: lload 2
      // 442: lxor
      // 443: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: nop
      // 449: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 44c: goto 453
      // 44f: invokestatic rr2.a (Loov;)Loov;
      // 452: athrow
      // 453: iload 4
      // 455: ifne 47c
      // 458: ifne 47f
      // 45b: goto 462
      // 45e: invokestatic rr2.a (Loov;)Loov;
      // 461: athrow
      // 462: aload 6
      // 464: sipush 16253
      // 467: ldc2_w 4757363118040096595
      // 46a: lload 2
      // 46b: lxor
      // 46c: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 471: nop
      // 472: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 475: goto 47c
      // 478: invokestatic rr2.a (Loov;)Loov;
      // 47b: athrow
      // 47c: ifeq 667
      // 47f: aload 0
      // 480: sipush 18076
      // 483: ldc2_w 2875795977184241304
      // 486: lload 2
      // 487: lxor
      // 488: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48d: nop
      // 48e: putfield rr2.in8 Ljava/lang/String;
      // 491: iload 4
      // 493: ifeq 667
      // 496: goto 49d
      // 499: invokestatic rr2.a (Loov;)Loov;
      // 49c: athrow
      // 49d: iload 7
      // 49f: iload 4
      // 4a1: ifne 4d2
      // 4a4: goto 4ab
      // 4a7: invokestatic rr2.a (Loov;)Loov;
      // 4aa: athrow
      // 4ab: sipush 355
      // 4ae: goto 4b5
      // 4b1: invokestatic rr2.a (Loov;)Loov;
      // 4b4: athrow
      // 4b5: if_icmpne 667
      // 4b8: aload 6
      // 4ba: sipush 26373
      // 4bd: ldc2_w 2192615165929080591
      // 4c0: lload 2
      // 4c1: lxor
      // 4c2: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c7: nop
      // 4c8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 4cb: goto 4d2
      // 4ce: invokestatic rr2.a (Loov;)Loov;
      // 4d1: athrow
      // 4d2: iload 4
      // 4d4: ifne 524
      // 4d7: ifne 50a
      // 4da: goto 4e1
      // 4dd: invokestatic rr2.a (Loov;)Loov;
      // 4e0: athrow
      // 4e1: aload 6
      // 4e3: sipush 2100
      // 4e6: ldc2_w 6512294008404060213
      // 4e9: lload 2
      // 4ea: lxor
      // 4eb: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f0: nop
      // 4f1: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 4f4: iload 4
      // 4f6: ifne 524
      // 4f9: goto 500
      // 4fc: invokestatic rr2.a (Loov;)Loov;
      // 4ff: athrow
      // 500: ifeq 667
      // 503: goto 50a
      // 506: invokestatic rr2.a (Loov;)Loov;
      // 509: athrow
      // 50a: aload 6
      // 50c: sipush 20222
      // 50f: ldc2_w 8083121837453373139
      // 512: lload 2
      // 513: lxor
      // 514: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 519: nop
      // 51a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 51d: goto 524
      // 520: invokestatic rr2.a (Loov;)Loov;
      // 523: athrow
      // 524: iload 4
      // 526: ifne 56b
      // 529: ifeq 551
      // 52c: goto 533
      // 52f: invokestatic rr2.a (Loov;)Loov;
      // 532: athrow
      // 533: aload 0
      // 534: sipush 3099
      // 537: ldc2_w 8387839390810549255
      // 53a: lload 2
      // 53b: lxor
      // 53c: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 541: nop
      // 542: putfield rr2.in8 Ljava/lang/String;
      // 545: iload 4
      // 547: ifeq 667
      // 54a: goto 551
      // 54d: invokestatic rr2.a (Loov;)Loov;
      // 550: athrow
      // 551: aload 6
      // 553: sipush 8274
      // 556: ldc2_w 3988403825201741930
      // 559: lload 2
      // 55a: lxor
      // 55b: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 560: nop
      // 561: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 564: goto 56b
      // 567: invokestatic rr2.a (Loov;)Loov;
      // 56a: athrow
      // 56b: iload 4
      // 56d: ifne 5b2
      // 570: ifeq 598
      // 573: goto 57a
      // 576: invokestatic rr2.a (Loov;)Loov;
      // 579: athrow
      // 57a: aload 0
      // 57b: sipush 18724
      // 57e: ldc2_w 5090542568394025227
      // 581: lload 2
      // 582: lxor
      // 583: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 588: nop
      // 589: putfield rr2.in8 Ljava/lang/String;
      // 58c: iload 4
      // 58e: ifeq 667
      // 591: goto 598
      // 594: invokestatic rr2.a (Loov;)Loov;
      // 597: athrow
      // 598: aload 6
      // 59a: sipush 18328
      // 59d: ldc2_w 13563922690926521
      // 5a0: lload 2
      // 5a1: lxor
      // 5a2: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a7: nop
      // 5a8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 5ab: goto 5b2
      // 5ae: invokestatic rr2.a (Loov;)Loov;
      // 5b1: athrow
      // 5b2: iload 4
      // 5b4: ifne 5db
      // 5b7: ifne 5ea
      // 5ba: goto 5c1
      // 5bd: invokestatic rr2.a (Loov;)Loov;
      // 5c0: athrow
      // 5c1: aload 6
      // 5c3: sipush 25253
      // 5c6: ldc2_w 6926019785015411380
      // 5c9: lload 2
      // 5ca: lxor
      // 5cb: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d0: nop
      // 5d1: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 5d4: goto 5db
      // 5d7: invokestatic rr2.a (Loov;)Loov;
      // 5da: athrow
      // 5db: iload 4
      // 5dd: ifne 622
      // 5e0: ifeq 608
      // 5e3: goto 5ea
      // 5e6: invokestatic rr2.a (Loov;)Loov;
      // 5e9: athrow
      // 5ea: aload 0
      // 5eb: sipush 16794
      // 5ee: ldc2_w 97257922082398643
      // 5f1: lload 2
      // 5f2: lxor
      // 5f3: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f8: nop
      // 5f9: putfield rr2.in8 Ljava/lang/String;
      // 5fc: iload 4
      // 5fe: ifeq 667
      // 601: goto 608
      // 604: invokestatic rr2.a (Loov;)Loov;
      // 607: athrow
      // 608: aload 6
      // 60a: sipush 14988
      // 60d: ldc2_w 7451062793816349317
      // 610: lload 2
      // 611: lxor
      // 612: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 617: nop
      // 618: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 61b: goto 622
      // 61e: invokestatic rr2.a (Loov;)Loov;
      // 621: athrow
      // 622: iload 4
      // 624: ifne 64b
      // 627: ifne 64e
      // 62a: goto 631
      // 62d: invokestatic rr2.a (Loov;)Loov;
      // 630: athrow
      // 631: aload 6
      // 633: sipush 2517
      // 636: ldc2_w 7692884902831270384
      // 639: lload 2
      // 63a: lxor
      // 63b: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 640: nop
      // 641: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 644: goto 64b
      // 647: invokestatic rr2.a (Loov;)Loov;
      // 64a: athrow
      // 64b: ifeq 667
      // 64e: aload 0
      // 64f: sipush 9285
      // 652: ldc2_w 6528605869680329810
      // 655: lload 2
      // 656: lxor
      // 657: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65c: nop
      // 65d: putfield rr2.in8 Ljava/lang/String;
      // 660: goto 667
      // 663: invokestatic rr2.a (Loov;)Loov;
      // 666: athrow
      // 667: iload 4
      // 669: ifeq 6c2
      // 66c: aload 1
      // 66d: invokevirtual ihr.bbi ()Lmz2;
      // 670: iload 4
      // 672: ifne 694
      // 675: goto 67c
      // 678: invokestatic rr2.a (Loov;)Loov;
      // 67b: athrow
      // 67c: instanceof net/minecraft/network/play/client/C01PacketChatMessage
      // 67f: goto 686
      // 682: invokestatic rr2.a (Loov;)Loov;
      // 685: athrow
      // 686: ifeq 6c2
      // 689: aload 1
      // 68a: invokevirtual ihr.bbi ()Lmz2;
      // 68d: goto 694
      // 690: invokestatic rr2.a (Loov;)Loov;
      // 693: athrow
      // 694: checkcast net/minecraft/network/play/client/C01PacketChatMessage
      // 697: astore 5
      // 699: aload 5
      // 69b: invokevirtual net/minecraft/network/play/client/C01PacketChatMessage.pw6 ()Ljava/lang/String;
      // 69e: sipush 9280
      // 6a1: ldc2_w 54304986932905027
      // 6a4: lload 2
      // 6a5: lxor
      // 6a6: invokedynamic u (IJ)Ljava/lang/String; bsm=rr2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ab: nop
      // 6ac: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 6af: ifeq 6c2
      // 6b2: aload 0
      // 6b3: aload 5
      // 6b5: invokevirtual net/minecraft/network/play/client/C01PacketChatMessage.pw6 ()Ljava/lang/String;
      // 6b8: putfield rr2.in8 Ljava/lang/String;
      // 6bb: goto 6c2
      // 6be: invokestatic rr2.a (Loov;)Loov;
      // 6c1: athrow
      // 6c2: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(861638068674928954L, 7905444458320361129L, MethodHandles.lookup().lookupClass()).a(94739408346590L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 117589755676902L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[54];
      int var7 = 0;
      String var6 = "õ¤ã\u008b\u0092Nÿ5S\u008e\t\u0098ûI÷ÿ\u0001½ÞD!\u008cå\u0086|R0\bÛµ,â\u0010>qT±8âÒVQåA6£®®\u009f(\u0080³\u0089±©¿®±\u000f\u000eàÕ}D³\u0090\u0091ô\nþ»\u0011±-ëð/¹Q+Ý&Ò°ô\u0081;Ðe\u009a8PE¥Í\u000foè¾RÔ\f¹ñ\u0088ëÒ\u001cB\u00ad\u0091M¼4»\u0090\r8[5S÷{\u0015\u0084Ã¡\u0002\u009bR\u0002¥àÙük`\u001dFÂ*9UïÃV1\u0010úù\u0094\u0005ö\u0094)0\u0080?+\u0094+Ô¨W\u0010õ\u0099»\u008e\u0016²NO£×8Ï\u008fº-d\u0010È÷ÓùÊ\u0007£ÊDbkÊ\u001dI\u008d\u0091\u0018\u009c×\u0082&ÜL;^N\u0018~1\u0004\u008c¿\u001e¤QØ23t\nè\u0010m\u0085\u0016½x\u0096\u008aZVç\u0091ÑR×\u008c©(\u0011;\u0012ãÀøÎ\u009cEkt\u0098Y=g2B{\u0093íð\u000eBLPôÁ\u009c1&ÌDúHSåP§\u0006ò\u0010·ì\u0012A\u008f\u009c\u0085F»Úó(³±qS\u0010\u0004¤ÔÀK\u0093^®ð%\u000f\u0089cå\u0019Ç F\r_@2\u008eZ«$¿%5òYC¬è\fa4iª¾\u0099VIl\u0092vþÆë ¾b\u0010|ê|é\u0003é®\u0098[\\kQE_\u0088pr%]>\u0082\u0081\u0017\u0014lëgRf\u0010Òg«¬\u001c@í-´\u000f\t8\u0090\u0002\u009b+ g>PË;V4¢\u0099ô7\u0011sý¬º4ß\u0087_|â\u000b\u001b¦Ã\u008b´~ëøI ¹f\fóòhe2ù\u009eëîoQír\u0013Iµq\u0084AUl\u008c\u001a\u0019°\u008b\u0097<ä0<\u008b\u001b\u001eâ.\u000e\u0086ÔäÔÿ]÷ÉI9\u008bÖOÌá\u000b.Å\r½ì;\u008cS\t\u0085©XÂõ\nã\u007fO¢\u0014þì ¾Ù\u0010[w\u0017ø>\u0081}\n_ö\u009aý],\u0015¡ Î\u0007\u0092tÝ\b\u0010Ê/\u001d\u0092¯|\u001b\u001bÄÖX@'!·üÄ`-\u0096û®\u0012md\u0018l|ï³\u0082½A,\u0007\u008c\u001c,\u0006ÄÌÕkí\u0002Ò\u0081®rö\u0010Å\u0006\\ÒÅ ;½>@\u0099¯T9È\u0091\u00101Ââ\u000e:·|Â9¸\u0015;é¶\u008eî\u0010ksj\u009a\u0095\u00ad\u0081´f9\u0085ó\u007f \f¼\u0010µâ\u0080,,\u009ct\u0003\u0013\u000eÛ\u0013\u008b\u001a\u009aC\u0010\u001bL\"GÆ\"\u008c¬@N5\u000fYi¡-(\u0018\u009eZÇÓü£\u0083çE²èùÅeéªø\u0092°Ëÿ\u0086\u009cQ\u001a\nÅA[m~5Øoä¿8ù\u001b\u0010þl\u0099>\u0010\u0005z®Ø>%ºv»ón\u0010\u009c\u0081Ä(ÿ}\u001bÛM\u0099ã2Uþ\u0084\u0080\u0010\u0093ß¿É|Äq\u0089¨'ÜÆ~3¯Í(JNM^\u009a \u001d\u0003Dú\u008d\u009efÀ&u\u0004êµtH&B¦¹ÑîFÒÐÌámZO3W\u0005Îp(q±d&à±\u0093qÄQÒx\u0081¨F\u0090\u0095ê\u0002H(£!íòöh\u0012CÎ\u0018N ^Ñù\u008d2Ô½\u0010,\u0094X\u0093iÔ\u0016v\f:O\u008að\u008aS\u0092\u00105»CVÒ\u0011åx\f,\u0096¹(\u0088$\u00978f|[ì¼×^U¿<UðQ\u0002Ñ\u009bý¦\u00adÄÀË,[Èv6VÔM\u008al¯å\u001e®\bD5TÚ\u001c1hDóþç¸\u008e\u009c(XM\u0082\u0002\u0010ü\u009dÀ\u0095ö\u00870C\u0012\u000e¹À\u0017\u008b©^03H¥û÷\u009c©9X\b\u0085®¢w&};ï\u0083æK\u0094Wo¬\u001f.Ò\"\u008bæ\u009e»à?NÄús6Yªý\u001d,1¢\u001a0Ú#\u0007â)éG8#\u0093,~é\u0084#hãW-îxC>¦\u0097mr\u009fp/Ý{TÀHÝ\u0092µÑÞ(R\u008aæãª\n\u0016\u0010®´¬\u0090Rv#ÚÁ\u0093¦04\u008còú\u0010\u0095\u001aï\u0098¢R*-U\u001cÚã¸ðß\u007f\u0010\u0096+×\u0007%\u0016U\u008a\rM\u008fA%æNg\u0010\u000eí\u0080%\u0089ArèÒ;UE\tÙóò\u0018èÍ\u0006ã\u008fMò\u0092\u0018à)I\u0003Ç°#\u0003ºØ¼Yº^ö è¹æÖü~î\bs\u000fpû¼/_\n\u001ev¤\\\rîL±ÿ\u0000µ\u0096\u0092vIÙ 3\"\u0096i!xD\u0088ÛYqÔ¥Mz $0%¯ pù§YÜ\u008cÃ\u0019\u0002\u009b\u0003\u0010Ijê\u0013áQqú9\u0019\u0093zc¬J6 ôóUÇ4ãhÍ5m\u0006H¨¾ì\u0014ßy\u0010Aaqö\u0015xÅ·7Rr\u0097\u00820TúÂ5Ó×*Ö\u0095\u0002\u000eêá$¸üÁz\\aÄÅåc\u0000!·_\u0090lé¬Ð\u001ee\u0000\u0007\u0096\u0095ÉwªÀÿ³ÿêÁ\u0010\u0092 U\u0082\u001e´b];\u009b5ß·è}8\u0010\u009aú¬\\zÎ,\\Åó\u0088®\u000e;\u0086$\u0010\u009eps\u0085o0ì\u0012\u0087µ!ÙÏ iô\u0010òGê*\t¼vSw³{Ò0\u0015\u0005\u0004";
      int var8 = "õ¤ã\u008b\u0092Nÿ5S\u008e\t\u0098ûI÷ÿ\u0001½ÞD!\u008cå\u0086|R0\bÛµ,â\u0010>qT±8âÒVQåA6£®®\u009f(\u0080³\u0089±©¿®±\u000f\u000eàÕ}D³\u0090\u0091ô\nþ»\u0011±-ëð/¹Q+Ý&Ò°ô\u0081;Ðe\u009a8PE¥Í\u000foè¾RÔ\f¹ñ\u0088ëÒ\u001cB\u00ad\u0091M¼4»\u0090\r8[5S÷{\u0015\u0084Ã¡\u0002\u009bR\u0002¥àÙük`\u001dFÂ*9UïÃV1\u0010úù\u0094\u0005ö\u0094)0\u0080?+\u0094+Ô¨W\u0010õ\u0099»\u008e\u0016²NO£×8Ï\u008fº-d\u0010È÷ÓùÊ\u0007£ÊDbkÊ\u001dI\u008d\u0091\u0018\u009c×\u0082&ÜL;^N\u0018~1\u0004\u008c¿\u001e¤QØ23t\nè\u0010m\u0085\u0016½x\u0096\u008aZVç\u0091ÑR×\u008c©(\u0011;\u0012ãÀøÎ\u009cEkt\u0098Y=g2B{\u0093íð\u000eBLPôÁ\u009c1&ÌDúHSåP§\u0006ò\u0010·ì\u0012A\u008f\u009c\u0085F»Úó(³±qS\u0010\u0004¤ÔÀK\u0093^®ð%\u000f\u0089cå\u0019Ç F\r_@2\u008eZ«$¿%5òYC¬è\fa4iª¾\u0099VIl\u0092vþÆë ¾b\u0010|ê|é\u0003é®\u0098[\\kQE_\u0088pr%]>\u0082\u0081\u0017\u0014lëgRf\u0010Òg«¬\u001c@í-´\u000f\t8\u0090\u0002\u009b+ g>PË;V4¢\u0099ô7\u0011sý¬º4ß\u0087_|â\u000b\u001b¦Ã\u008b´~ëøI ¹f\fóòhe2ù\u009eëîoQír\u0013Iµq\u0084AUl\u008c\u001a\u0019°\u008b\u0097<ä0<\u008b\u001b\u001eâ.\u000e\u0086ÔäÔÿ]÷ÉI9\u008bÖOÌá\u000b.Å\r½ì;\u008cS\t\u0085©XÂõ\nã\u007fO¢\u0014þì ¾Ù\u0010[w\u0017ø>\u0081}\n_ö\u009aý],\u0015¡ Î\u0007\u0092tÝ\b\u0010Ê/\u001d\u0092¯|\u001b\u001bÄÖX@'!·üÄ`-\u0096û®\u0012md\u0018l|ï³\u0082½A,\u0007\u008c\u001c,\u0006ÄÌÕkí\u0002Ò\u0081®rö\u0010Å\u0006\\ÒÅ ;½>@\u0099¯T9È\u0091\u00101Ââ\u000e:·|Â9¸\u0015;é¶\u008eî\u0010ksj\u009a\u0095\u00ad\u0081´f9\u0085ó\u007f \f¼\u0010µâ\u0080,,\u009ct\u0003\u0013\u000eÛ\u0013\u008b\u001a\u009aC\u0010\u001bL\"GÆ\"\u008c¬@N5\u000fYi¡-(\u0018\u009eZÇÓü£\u0083çE²èùÅeéªø\u0092°Ëÿ\u0086\u009cQ\u001a\nÅA[m~5Øoä¿8ù\u001b\u0010þl\u0099>\u0010\u0005z®Ø>%ºv»ón\u0010\u009c\u0081Ä(ÿ}\u001bÛM\u0099ã2Uþ\u0084\u0080\u0010\u0093ß¿É|Äq\u0089¨'ÜÆ~3¯Í(JNM^\u009a \u001d\u0003Dú\u008d\u009efÀ&u\u0004êµtH&B¦¹ÑîFÒÐÌámZO3W\u0005Îp(q±d&à±\u0093qÄQÒx\u0081¨F\u0090\u0095ê\u0002H(£!íòöh\u0012CÎ\u0018N ^Ñù\u008d2Ô½\u0010,\u0094X\u0093iÔ\u0016v\f:O\u008að\u008aS\u0092\u00105»CVÒ\u0011åx\f,\u0096¹(\u0088$\u00978f|[ì¼×^U¿<UðQ\u0002Ñ\u009bý¦\u00adÄÀË,[Èv6VÔM\u008al¯å\u001e®\bD5TÚ\u001c1hDóþç¸\u008e\u009c(XM\u0082\u0002\u0010ü\u009dÀ\u0095ö\u00870C\u0012\u000e¹À\u0017\u008b©^03H¥û÷\u009c©9X\b\u0085®¢w&};ï\u0083æK\u0094Wo¬\u001f.Ò\"\u008bæ\u009e»à?NÄús6Yªý\u001d,1¢\u001a0Ú#\u0007â)éG8#\u0093,~é\u0084#hãW-îxC>¦\u0097mr\u009fp/Ý{TÀHÝ\u0092µÑÞ(R\u008aæãª\n\u0016\u0010®´¬\u0090Rv#ÚÁ\u0093¦04\u008còú\u0010\u0095\u001aï\u0098¢R*-U\u001cÚã¸ðß\u007f\u0010\u0096+×\u0007%\u0016U\u008a\rM\u008fA%æNg\u0010\u000eí\u0080%\u0089ArèÒ;UE\tÙóò\u0018èÍ\u0006ã\u008fMò\u0092\u0018à)I\u0003Ç°#\u0003ºØ¼Yº^ö è¹æÖü~î\bs\u000fpû¼/_\n\u001ev¤\\\rîL±ÿ\u0000µ\u0096\u0092vIÙ 3\"\u0096i!xD\u0088ÛYqÔ¥Mz $0%¯ pù§YÜ\u008cÃ\u0019\u0002\u009b\u0003\u0010Ijê\u0013áQqú9\u0019\u0093zc¬J6 ôóUÇ4ãhÍ5m\u0006H¨¾ì\u0014ßy\u0010Aaqö\u0015xÅ·7Rr\u0097\u00820TúÂ5Ó×*Ö\u0095\u0002\u000eêá$¸üÁz\\aÄÅåc\u0000!·_\u0090lé¬Ð\u001ee\u0000\u0007\u0096\u0095ÉwªÀÿ³ÿêÁ\u0010\u0092 U\u0082\u001e´b];\u009b5ß·è}8\u0010\u009aú¬\\zÎ,\\Åó\u0088®\u000e;\u0086$\u0010\u009eps\u0085o0ì\u0012\u0087µ!ÙÏ iô\u0010òGê*\t¼vSw³{Ò0\u0015\u0005\u0004"
         .length();
      char var5 = ' ';
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
                     f = var9;
                     g = new String[54];
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

                  var6 = "Ê\u001c\u008dÁÕ_@\u0098.ò®æ>=Â)eH\u0080âU{ø·6ê»\u001cyç*z\u0010\u000b\u009d\u0094=Ðl\u0015'²ì_\u0086\u0081\u0016ìi";
                  var8 = "Ê\u001c\u008dÁÕ_@\u0098.ò®æ>=Â)eH\u0080âU{ø·6ê»\u001cyç*z\u0010\u000b\u009d\u0094=Ðl\u0015'²ì_\u0086\u0081\u0016ìi".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10006;
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
            throw new RuntimeException("rr2", var10);
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
         throw new RuntimeException("rr2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
