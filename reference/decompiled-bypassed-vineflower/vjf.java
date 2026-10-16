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

public class vjf extends i2h {
   public int kjt;
   public boolean eld = true;
   public bdo akx;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public vjf(t9d var1) {
      super(var1);
   }

   public vjf(t9d var1, double var2, double var4, double var6, zfz var8) {
      super(var1);
      this.b75 = var8;
      this.gz8 = true;
      this.yxc(0.98F, 0.98F);
      this.m6_(var2, var4, var6);
      this.icv = 0.0;
      this.mop = 0.0;
      this.bw4 = 0.0;
      this.bc1 = var2;
      this.o_z = var4;
      this.a4d = var6;
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public void tbj() {
   }

   @Override
   public boolean mzu() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return this.ma9;
         }

         if (!this.ma9) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
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
      // 000: getstatic vjf.b J
      // 003: ldc2_w 25243022059879
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield vjf.b75 Lzfz;
      // 010: invokeinterface zfz.r_y ()Le0x; 1
      // 015: astore 4
      // 017: iload 3
      // 018: ifne 05b
      // 01b: aload 4
      // 01d: invokevirtual e0x.p1r ()Lp3y;
      // 020: getstatic p3y.cei Lp3y;
      // 023: if_acmpne 03c
      // 026: goto 02d
      // 029: invokestatic vjf.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 0
      // 02e: invokevirtual vjf._kl ()V
      // 031: iload 3
      // 032: ifeq 476
      // 035: goto 03c
      // 038: invokestatic vjf.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 0
      // 03d: aload 0
      // 03e: getfield vjf.o2v D
      // 041: putfield vjf.bc1 D
      // 044: aload 0
      // 045: aload 0
      // 046: getfield vjf.kfp D
      // 049: putfield vjf.o_z D
      // 04c: aload 0
      // 04d: aload 0
      // 04e: getfield vjf.vbd D
      // 051: putfield vjf.a4d D
      // 054: goto 05b
      // 057: invokestatic vjf.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 0
      // 05c: dup
      // 05d: getfield vjf.kjt I
      // 060: dup_x1
      // 061: bipush 1
      // 062: iadd
      // 063: putfield vjf.kjt I
      // 066: iload 3
      // 067: ifne 11d
      // 06a: ifne 0d6
      // 06d: goto 074
      // 070: invokestatic vjf.a (Loov;)Loov;
      // 073: athrow
      // 074: new mew
      // 077: dup
      // 078: aload 0
      // 079: invokespecial mew.<init> (Li2h;)V
      // 07c: astore 5
      // 07e: aload 0
      // 07f: getfield vjf.oay Lt9d;
      // 082: iload 3
      // 083: ifne 0bc
      // 086: aload 5
      // 088: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 08b: invokeinterface zfz.r_y ()Le0x; 1
      // 090: aload 4
      // 092: if_acmpne 0b1
      // 095: goto 09c
      // 098: invokestatic vjf.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield vjf.oay Lt9d;
      // 0a0: aload 5
      // 0a2: invokevirtual t9d.i6x (Lmew;)Z
      // 0a5: pop
      // 0a6: iload 3
      // 0a7: ifeq 0d6
      // 0aa: goto 0b1
      // 0ad: invokestatic vjf.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield vjf.oay Lt9d;
      // 0b5: goto 0bc
      // 0b8: invokestatic vjf.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: getfield t9d.v0f Z
      // 0bf: iload 3
      // 0c0: ifne 11d
      // 0c3: ifne 0d6
      // 0c6: goto 0cd
      // 0c9: invokestatic vjf.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: invokevirtual vjf._kl ()V
      // 0d1: return
      // 0d2: invokestatic vjf.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: dup
      // 0d8: getfield vjf.mop D
      // 0db: ldc2_w 0.03999999910593033
      // 0de: dsub
      // 0df: putfield vjf.mop D
      // 0e2: aload 0
      // 0e3: aload 0
      // 0e4: getfield vjf.icv D
      // 0e7: aload 0
      // 0e8: getfield vjf.mop D
      // 0eb: aload 0
      // 0ec: getfield vjf.bw4 D
      // 0ef: invokevirtual vjf.vjj (DDD)V
      // 0f2: aload 0
      // 0f3: dup
      // 0f4: getfield vjf.icv D
      // 0f7: ldc2_w 0.9800000190734863
      // 0fa: dmul
      // 0fb: putfield vjf.icv D
      // 0fe: aload 0
      // 0ff: dup
      // 100: getfield vjf.mop D
      // 103: ldc2_w 0.9800000190734863
      // 106: dmul
      // 107: putfield vjf.mop D
      // 10a: aload 0
      // 10b: dup
      // 10c: getfield vjf.bw4 D
      // 10f: ldc2_w 0.9800000190734863
      // 112: dmul
      // 113: putfield vjf.bw4 D
      // 116: aload 0
      // 117: getfield vjf.oay Lt9d;
      // 11a: getfield t9d.v0f Z
      // 11d: ifne 476
      // 120: new mew
      // 123: dup
      // 124: aload 0
      // 125: invokespecial mew.<init> (Li2h;)V
      // 128: astore 5
      // 12a: aload 0
      // 12b: getfield vjf.lfk Z
      // 12e: iload 3
      // 12f: ifne 38c
      // 132: ifeq 381
      // 135: goto 13c
      // 138: invokestatic vjf.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 0
      // 13d: dup
      // 13e: getfield vjf.icv D
      // 141: ldc2_w 0.699999988079071
      // 144: dmul
      // 145: putfield vjf.icv D
      // 148: aload 0
      // 149: dup
      // 14a: getfield vjf.bw4 D
      // 14d: ldc2_w 0.699999988079071
      // 150: dmul
      // 151: putfield vjf.bw4 D
      // 154: aload 0
      // 155: dup
      // 156: getfield vjf.mop D
      // 159: ldc2_w -0.5
      // 15c: dmul
      // 15d: putfield vjf.mop D
      // 160: aload 0
      // 161: iload 3
      // 162: ifne 192
      // 165: goto 16c
      // 168: invokestatic vjf.a (Loov;)Loov;
      // 16b: athrow
      // 16c: getfield vjf.oay Lt9d;
      // 16f: aload 5
      // 171: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 174: invokeinterface zfz.r_y ()Le0x; 1
      // 179: getstatic ox_.bn4 Lmyw;
      // 17c: if_acmpeq 476
      // 17f: goto 186
      // 182: invokestatic vjf.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 0
      // 187: invokevirtual vjf._kl ()V
      // 18a: aload 0
      // 18b: goto 192
      // 18e: invokestatic vjf.a (Loov;)Loov;
      // 191: athrow
      // 192: getfield vjf.h_8 Z
      // 195: iload 3
      // 196: ifne 1c1
      // 199: ifne 476
      // 19c: goto 1a3
      // 19f: invokestatic vjf.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: aload 0
      // 1a4: getfield vjf.oay Lt9d;
      // 1a7: aload 4
      // 1a9: aload 5
      // 1ab: bipush 1
      // 1ac: getstatic vt2.rf3 Lvt2;
      // 1af: aconst_null
      // 1b0: checkcast i2h
      // 1b3: aconst_null
      // 1b4: checkcast erg
      // 1b7: invokevirtual t9d.ask (Le0x;Lmew;ZLvt2;Li2h;Lerg;)Z
      // 1ba: goto 1c1
      // 1bd: invokestatic vjf.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: iload 3
      // 1c2: ifne 329
      // 1c5: ifeq 31e
      // 1c8: goto 1cf
      // 1cb: invokestatic vjf.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: getfield vjf.oay Lt9d;
      // 1d3: aload 5
      // 1d5: invokevirtual mew.eve ()Lmew;
      // 1d8: invokestatic d26._j1 (Lt9d;Lmew;)Z
      // 1db: iload 3
      // 1dc: ifne 329
      // 1df: goto 1e6
      // 1e2: invokestatic vjf.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: ifne 31e
      // 1e9: goto 1f0
      // 1ec: invokestatic vjf.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: getfield vjf.oay Lt9d;
      // 1f4: aload 5
      // 1f6: aload 0
      // 1f7: getfield vjf.b75 Lzfz;
      // 1fa: bipush 3
      // 1fb: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1fe: iload 3
      // 1ff: ifne 329
      // 202: goto 209
      // 205: invokestatic vjf.a (Loov;)Loov;
      // 208: athrow
      // 209: ifeq 31e
      // 20c: goto 213
      // 20f: invokestatic vjf.a (Loov;)Loov;
      // 212: athrow
      // 213: aload 4
      // 215: iload 3
      // 216: ifne 236
      // 219: goto 220
      // 21c: invokestatic vjf.a (Loov;)Loov;
      // 21f: athrow
      // 220: instanceof d26
      // 223: ifeq 242
      // 226: goto 22d
      // 229: invokestatic vjf.a (Loov;)Loov;
      // 22c: athrow
      // 22d: aload 4
      // 22f: goto 236
      // 232: invokestatic vjf.a (Loov;)Loov;
      // 235: athrow
      // 236: checkcast d26
      // 239: aload 0
      // 23a: getfield vjf.oay Lt9d;
      // 23d: aload 5
      // 23f: invokevirtual d26.s5p (Lt9d;Lmew;)V
      // 242: aload 0
      // 243: getfield vjf.akx Lbdo;
      // 246: ifnull 476
      // 249: aload 4
      // 24b: instanceof adf
      // 24e: ifeq 476
      // 251: goto 258
      // 254: invokestatic vjf.a (Loov;)Loov;
      // 257: athrow
      // 258: aload 0
      // 259: getfield vjf.oay Lt9d;
      // 25c: aload 5
      // 25e: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 261: astore 6
      // 263: aload 6
      // 265: ifnull 31a
      // 268: new bdo
      // 26b: dup
      // 26c: invokespecial bdo.<init> ()V
      // 26f: astore 7
      // 271: aload 6
      // 273: aload 7
      // 275: invokevirtual pyk.m2a (Lbdo;)V
      // 278: aload 0
      // 279: getfield vjf.akx Lbdo;
      // 27c: invokevirtual bdo.bo9 ()Ljava/util/Set;
      // 27f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 284: astore 8
      // 286: aload 8
      // 288: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 28d: ifeq 30e
      // 290: aload 8
      // 292: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 297: checkcast java/lang/String
      // 29a: astore 9
      // 29c: aload 0
      // 29d: getfield vjf.akx Lbdo;
      // 2a0: aload 9
      // 2a2: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 2a5: astore 10
      // 2a7: iload 3
      // 2a8: ifne 315
      // 2ab: aload 9
      // 2ad: ldc "x"
      // 2af: nop
      // 2b0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b3: iload 3
      // 2b4: ifne 2d7
      // 2b7: goto 2be
      // 2ba: invokestatic vjf.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: ifne 30a
      // 2c1: goto 2c8
      // 2c4: invokestatic vjf.a (Loov;)Loov;
      // 2c7: athrow
      // 2c8: aload 9
      // 2ca: ldc "y"
      // 2cc: nop
      // 2cd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2d0: goto 2d7
      // 2d3: invokestatic vjf.a (Loov;)Loov;
      // 2d6: athrow
      // 2d7: iload 3
      // 2d8: ifne 2f4
      // 2db: ifne 30a
      // 2de: goto 2e5
      // 2e1: invokestatic vjf.a (Loov;)Loov;
      // 2e4: athrow
      // 2e5: aload 9
      // 2e7: ldc "z"
      // 2e9: nop
      // 2ea: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2ed: goto 2f4
      // 2f0: invokestatic vjf.a (Loov;)Loov;
      // 2f3: athrow
      // 2f4: ifne 30a
      // 2f7: aload 7
      // 2f9: aload 9
      // 2fb: aload 10
      // 2fd: invokevirtual gdw.h33 ()Lgdw;
      // 300: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 303: goto 30a
      // 306: invokestatic vjf.a (Loov;)Loov;
      // 309: athrow
      // 30a: iload 3
      // 30b: ifeq 286
      // 30e: aload 6
      // 310: aload 7
      // 312: invokevirtual pyk.agl (Lbdo;)V
      // 315: aload 6
      // 317: invokevirtual pyk.r5t ()V
      // 31a: iload 3
      // 31b: ifeq 476
      // 31e: aload 0
      // 31f: getfield vjf.eld Z
      // 322: goto 329
      // 325: invokestatic vjf.a (Loov;)Loov;
      // 328: athrow
      // 329: iload 3
      // 32a: ifne 361
      // 32d: ifeq 476
      // 330: goto 337
      // 333: invokestatic vjf.a (Loov;)Loov;
      // 336: athrow
      // 337: aload 0
      // 338: iload 3
      // 339: ifne 365
      // 33c: goto 343
      // 33f: invokestatic vjf.a (Loov;)Loov;
      // 342: athrow
      // 343: getfield vjf.oay Lt9d;
      // 346: invokevirtual t9d.eir ()Lef9;
      // 349: sipush 8566
      // 34c: ldc2_w 5185999231425481694
      // 34f: lload 1
      // 350: lxor
      // 351: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 356: nop
      // 357: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 35a: goto 361
      // 35d: invokestatic vjf.a (Loov;)Loov;
      // 360: athrow
      // 361: ifeq 476
      // 364: aload 0
      // 365: new erg
      // 368: dup
      // 369: aload 4
      // 36b: bipush 1
      // 36c: aload 4
      // 36e: aload 0
      // 36f: getfield vjf.b75 Lzfz;
      // 372: invokevirtual e0x.crg (Lzfz;)I
      // 375: invokespecial erg.<init> (Le0x;II)V
      // 378: fconst_0
      // 379: invokevirtual vjf.qji (Lerg;F)Lnvf;
      // 37c: pop
      // 37d: iload 3
      // 37e: ifeq 476
      // 381: aload 0
      // 382: getfield vjf.kjt I
      // 385: goto 38c
      // 388: invokestatic vjf.a (Loov;)Loov;
      // 38b: athrow
      // 38c: bipush 100
      // 38e: iload 3
      // 38f: ifne 409
      // 392: if_icmple 3f0
      // 395: goto 39c
      // 398: invokestatic vjf.a (Loov;)Loov;
      // 39b: athrow
      // 39c: aload 0
      // 39d: getfield vjf.oay Lt9d;
      // 3a0: getfield t9d.v0f Z
      // 3a3: iload 3
      // 3a4: ifne 3fb
      // 3a7: goto 3ae
      // 3aa: invokestatic vjf.a (Loov;)Loov;
      // 3ad: athrow
      // 3ae: ifne 3f0
      // 3b1: goto 3b8
      // 3b4: invokestatic vjf.a (Loov;)Loov;
      // 3b7: athrow
      // 3b8: aload 5
      // 3ba: invokevirtual mew.getY ()I
      // 3bd: iload 3
      // 3be: ifne 422
      // 3c1: goto 3c8
      // 3c4: invokestatic vjf.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: bipush 1
      // 3c9: if_icmplt 40c
      // 3cc: goto 3d3
      // 3cf: invokestatic vjf.a (Loov;)Loov;
      // 3d2: athrow
      // 3d3: aload 5
      // 3d5: invokevirtual mew.getY ()I
      // 3d8: iload 3
      // 3d9: ifne 422
      // 3dc: goto 3e3
      // 3df: invokestatic vjf.a (Loov;)Loov;
      // 3e2: athrow
      // 3e3: sipush 256
      // 3e6: if_icmpgt 40c
      // 3e9: goto 3f0
      // 3ec: invokestatic vjf.a (Loov;)Loov;
      // 3ef: athrow
      // 3f0: aload 0
      // 3f1: getfield vjf.kjt I
      // 3f4: goto 3fb
      // 3f7: invokestatic vjf.a (Loov;)Loov;
      // 3fa: athrow
      // 3fb: iload 3
      // 3fc: ifne 422
      // 3ff: sipush 600
      // 402: goto 409
      // 405: invokestatic vjf.a (Loov;)Loov;
      // 408: athrow
      // 409: if_icmple 476
      // 40c: aload 0
      // 40d: iload 3
      // 40e: ifne 473
      // 411: goto 418
      // 414: invokestatic vjf.a (Loov;)Loov;
      // 417: athrow
      // 418: getfield vjf.eld Z
      // 41b: goto 422
      // 41e: invokestatic vjf.a (Loov;)Loov;
      // 421: athrow
      // 422: ifeq 472
      // 425: aload 0
      // 426: iload 3
      // 427: ifne 473
      // 42a: goto 431
      // 42d: invokestatic vjf.a (Loov;)Loov;
      // 430: athrow
      // 431: getfield vjf.oay Lt9d;
      // 434: invokevirtual t9d.eir ()Lef9;
      // 437: sipush 18832
      // 43a: ldc2_w 6163007260754600765
      // 43d: lload 1
      // 43e: lxor
      // 43f: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 444: nop
      // 445: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 448: ifeq 472
      // 44b: goto 452
      // 44e: invokestatic vjf.a (Loov;)Loov;
      // 451: athrow
      // 452: aload 0
      // 453: new erg
      // 456: dup
      // 457: aload 4
      // 459: bipush 1
      // 45a: aload 4
      // 45c: aload 0
      // 45d: getfield vjf.b75 Lzfz;
      // 460: invokevirtual e0x.crg (Lzfz;)I
      // 463: invokespecial erg.<init> (Le0x;II)V
      // 466: fconst_0
      // 467: invokevirtual vjf.qji (Lerg;F)Lnvf;
      // 46a: pop
      // 46b: goto 472
      // 46e: invokestatic vjf.a (Loov;)Loov;
      // 471: athrow
      // 472: aload 0
      // 473: invokevirtual vjf._kl ()V
      // 476: return
   }

   @Override
   public void ibc(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield vjf.b75 Lzfz;
      // 008: invokeinterface zfz.r_y ()Le0x; 1
      // 00d: astore 4
      // 00f: aload 0
      // 010: getfield vjf.tip Z
      // 013: iload 3
      // 014: ifne 02e
      // 017: ifeq 14a
      // 01a: goto 021
      // 01d: invokestatic vjf.a (Loov;)Loov;
      // 020: athrow
      // 021: fload 1
      // 022: fconst_1
      // 023: fsub
      // 024: invokestatic fe6.v1i (F)I
      // 027: goto 02e
      // 02a: invokestatic vjf.a (Loov;)Loov;
      // 02d: athrow
      // 02e: istore 5
      // 030: iload 5
      // 032: ifle 14a
      // 035: aload 0
      // 036: getfield vjf.oay Lt9d;
      // 039: aload 0
      // 03a: aload 0
      // 03b: invokevirtual vjf.aaw ()Lnh4;
      // 03e: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 041: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 044: astore 6
      // 046: aload 4
      // 048: getstatic ox_.g04 Le0x;
      // 04b: if_acmpne 056
      // 04e: bipush 1
      // 04f: goto 057
      // 052: invokestatic vjf.a (Loov;)Loov;
      // 055: athrow
      // 056: bipush 0
      // 057: istore 7
      // 059: iload 7
      // 05b: ifeq 068
      // 05e: getstatic ofh.cw1 Lofh;
      // 061: goto 06b
      // 064: invokestatic vjf.a (Loov;)Loov;
      // 067: athrow
      // 068: getstatic ofh.__h Lofh;
      // 06b: astore 8
      // 06d: aload 6
      // 06f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 074: astore 9
      // 076: aload 9
      // 078: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07d: ifeq 0b6
      // 080: aload 9
      // 082: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 087: checkcast i2h
      // 08a: astore 10
      // 08c: aload 10
      // 08e: aload 8
      // 090: iload 5
      // 092: i2f
      // 093: aload 0
      // 094: getfield vjf.ul4 F
      // 097: fmul
      // 098: invokestatic fe6.tpk (F)I
      // 09b: aload 0
      // 09c: getfield vjf.te7 I
      // 09f: invokestatic java/lang/Math.min (II)I
      // 0a2: i2f
      // 0a3: invokevirtual i2h.m1t (Lofh;F)Z
      // 0a6: pop
      // 0a7: iload 3
      // 0a8: ifne 14a
      // 0ab: iload 3
      // 0ac: ifeq 076
      // 0af: goto 0b6
      // 0b2: invokestatic vjf.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: iload 7
      // 0b8: iload 3
      // 0b9: ifne 0e1
      // 0bc: ifeq 14a
      // 0bf: goto 0c6
      // 0c2: invokestatic vjf.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield vjf.z2d Ljava/util/Random;
      // 0ca: invokevirtual java/util/Random.nextFloat ()F
      // 0cd: f2d
      // 0ce: ldc2_w 0.05000000074505806
      // 0d1: iload 5
      // 0d3: i2d
      // 0d4: ldc2_w 0.05
      // 0d7: dmul
      // 0d8: dadd
      // 0d9: dcmpg
      // 0da: goto 0e1
      // 0dd: invokestatic vjf.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iload 3
      // 0e2: ifne 108
      // 0e5: ifge 14a
      // 0e8: goto 0ef
      // 0eb: invokestatic vjf.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield vjf.b75 Lzfz;
      // 0f3: getstatic zsh.he4 L_ku;
      // 0f6: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0fb: checkcast java/lang/Integer
      // 0fe: invokevirtual java/lang/Integer.intValue ()I
      // 101: goto 108
      // 104: invokestatic vjf.a (Loov;)Loov;
      // 107: athrow
      // 108: istore 9
      // 10a: iinc 9 1
      // 10d: iload 3
      // 10e: ifne 12a
      // 111: iload 9
      // 113: bipush 2
      // 114: if_icmple 12e
      // 117: goto 11e
      // 11a: invokestatic vjf.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 0
      // 11f: bipush 1
      // 120: putfield vjf.h_8 Z
      // 123: goto 12a
      // 126: invokestatic vjf.a (Loov;)Loov;
      // 129: athrow
      // 12a: iload 3
      // 12b: ifeq 14a
      // 12e: aload 0
      // 12f: aload 0
      // 130: getfield vjf.b75 Lzfz;
      // 133: getstatic zsh.he4 L_ku;
      // 136: iload 9
      // 138: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 140: putfield vjf.b75 Lzfz;
      // 143: goto 14a
      // 146: invokestatic vjf.a (Loov;)Loov;
      // 149: athrow
      // 14a: return
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
      // 000: getstatic vjf.b J
      // 003: ldc2_w 13550602995785
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield vjf.b75 Lzfz;
      // 011: iload 4
      // 013: ifne 02b
      // 016: ifnull 033
      // 019: goto 020
      // 01c: invokestatic vjf.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield vjf.b75 Lzfz;
      // 024: goto 02b
      // 027: invokestatic vjf.a (Loov;)Loov;
      // 02a: athrow
      // 02b: invokeinterface zfz.r_y ()Le0x; 1
      // 030: goto 036
      // 033: getstatic ox_.ibw Le0x;
      // 036: astore 5
      // 038: getstatic e0x.db8 Ljnv;
      // 03b: aload 5
      // 03d: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 040: checkcast gdz
      // 043: astore 6
      // 045: aload 1
      // 046: sipush 15828
      // 049: ldc2_w 3235716758711121491
      // 04c: lload 2
      // 04d: lxor
      // 04e: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: nop
      // 054: aload 6
      // 056: iload 4
      // 058: ifne 071
      // 05b: ifnonnull 06f
      // 05e: goto 065
      // 061: invokestatic vjf.a (Loov;)Loov;
      // 064: athrow
      // 065: ldc ""
      // 067: nop
      // 068: goto 074
      // 06b: invokestatic vjf.a (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 6
      // 071: invokevirtual gdz.toString ()Ljava/lang/String;
      // 074: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 077: aload 1
      // 078: sipush 16105
      // 07b: ldc2_w 3765443627214321022
      // 07e: lload 2
      // 07f: lxor
      // 080: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: nop
      // 086: aload 5
      // 088: aload 0
      // 089: getfield vjf.b75 Lzfz;
      // 08c: invokevirtual e0x.hvp (Lzfz;)I
      // 08f: i2b
      // 090: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 093: aload 1
      // 094: sipush 1988
      // 097: ldc2_w 5368314747910032448
      // 09a: lload 2
      // 09b: lxor
      // 09c: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: aload 0
      // 0a3: getfield vjf.kjt I
      // 0a6: i2b
      // 0a7: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 0aa: aload 1
      // 0ab: sipush 2729
      // 0ae: ldc2_w 7090597002482975009
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: aload 0
      // 0ba: getfield vjf.eld Z
      // 0bd: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 0c0: aload 1
      // 0c1: sipush 26323
      // 0c4: ldc2_w 8884081457836125511
      // 0c7: lload 2
      // 0c8: lxor
      // 0c9: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: nop
      // 0cf: aload 0
      // 0d0: getfield vjf.tip Z
      // 0d3: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 0d6: aload 1
      // 0d7: sipush 23622
      // 0da: ldc2_w 2380528497105033171
      // 0dd: lload 2
      // 0de: lxor
      // 0df: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: aload 0
      // 0e6: getfield vjf.ul4 F
      // 0e9: invokevirtual bdo._i9 (Ljava/lang/String;F)V
      // 0ec: aload 1
      // 0ed: sipush 7201
      // 0f0: ldc2_w 7774044607653255073
      // 0f3: lload 2
      // 0f4: lxor
      // 0f5: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: nop
      // 0fb: aload 0
      // 0fc: getfield vjf.te7 I
      // 0ff: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 102: aload 0
      // 103: getfield vjf.akx Lbdo;
      // 106: iload 4
      // 108: ifne 116
      // 10b: ifnull 12b
      // 10e: goto 115
      // 111: invokestatic vjf.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 1
      // 116: sipush 3379
      // 119: ldc2_w 1333035063605036726
      // 11c: lload 2
      // 11d: lxor
      // 11e: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: nop
      // 124: aload 0
      // 125: getfield vjf.akx Lbdo;
      // 128: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 12b: return
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
      // 000: getstatic vjf.b J
      // 003: ldc2_w 135225900246242
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: sipush 510
      // 011: ldc2_w 7744809008222136026
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 01f: sipush 255
      // 022: iand
      // 023: istore 5
      // 025: aload 1
      // 026: sipush 1529
      // 029: ldc2_w 8115101934864622288
      // 02c: lload 2
      // 02d: lxor
      // 02e: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: nop
      // 034: bipush 8
      // 036: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 039: iload 4
      // 03b: ifeq 08d
      // 03e: ifeq 072
      // 041: goto 048
      // 044: invokestatic vjf.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: aload 1
      // 04a: sipush 1529
      // 04d: ldc2_w 8115101934864622288
      // 050: lload 2
      // 051: lxor
      // 052: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: nop
      // 058: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 05b: invokestatic e0x.mdd (Ljava/lang/String;)Le0x;
      // 05e: iload 5
      // 060: invokevirtual e0x.kig (I)Lzfz;
      // 063: putfield vjf.b75 Lzfz;
      // 066: iload 4
      // 068: ifne 0e3
      // 06b: goto 072
      // 06e: invokestatic vjf.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 1
      // 073: sipush 2845
      // 076: ldc2_w 9214803593406999613
      // 079: lload 2
      // 07a: lxor
      // 07b: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: nop
      // 081: bipush 99
      // 083: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 086: goto 08d
      // 089: invokestatic vjf.a (Loov;)Loov;
      // 08c: athrow
      // 08d: ifeq 0ba
      // 090: aload 0
      // 091: aload 1
      // 092: sipush 2529
      // 095: ldc2_w 4101223465810095815
      // 098: lload 2
      // 099: lxor
      // 09a: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: nop
      // 0a0: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0a3: invokestatic e0x.csc (I)Le0x;
      // 0a6: iload 5
      // 0a8: invokevirtual e0x.kig (I)Lzfz;
      // 0ab: putfield vjf.b75 Lzfz;
      // 0ae: iload 4
      // 0b0: ifne 0e3
      // 0b3: goto 0ba
      // 0b6: invokestatic vjf.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: aload 1
      // 0bc: sipush 14437
      // 0bf: ldc2_w 6503981439787458383
      // 0c2: lload 2
      // 0c3: lxor
      // 0c4: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: nop
      // 0ca: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0cd: sipush 255
      // 0d0: iand
      // 0d1: invokestatic e0x.csc (I)Le0x;
      // 0d4: iload 5
      // 0d6: invokevirtual e0x.kig (I)Lzfz;
      // 0d9: putfield vjf.b75 Lzfz;
      // 0dc: goto 0e3
      // 0df: invokestatic vjf.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: sipush 18164
      // 0e8: ldc2_w 8641940702987755981
      // 0eb: lload 2
      // 0ec: lxor
      // 0ed: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: nop
      // 0f3: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0f6: sipush 255
      // 0f9: iand
      // 0fa: putfield vjf.kjt I
      // 0fd: aload 0
      // 0fe: getfield vjf.b75 Lzfz;
      // 101: invokeinterface zfz.r_y ()Le0x; 1
      // 106: astore 6
      // 108: iload 4
      // 10a: ifeq 174
      // 10d: aload 1
      // 10e: sipush 22041
      // 111: ldc2_w 4695135871202603326
      // 114: lload 2
      // 115: lxor
      // 116: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: nop
      // 11c: bipush 99
      // 11e: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 121: ifeq 179
      // 124: goto 12b
      // 127: invokestatic vjf.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 0
      // 12c: aload 1
      // 12d: sipush 22041
      // 130: ldc2_w 4695135871202603326
      // 133: lload 2
      // 134: lxor
      // 135: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: nop
      // 13b: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 13e: putfield vjf.tip Z
      // 141: aload 0
      // 142: aload 1
      // 143: sipush 22571
      // 146: ldc2_w 6092165039792176905
      // 149: lload 2
      // 14a: lxor
      // 14b: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: nop
      // 151: invokevirtual bdo.blg (Ljava/lang/String;)F
      // 154: putfield vjf.ul4 F
      // 157: aload 0
      // 158: aload 1
      // 159: sipush 12389
      // 15c: ldc2_w 8317068122905401182
      // 15f: lload 2
      // 160: lxor
      // 161: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: nop
      // 167: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 16a: putfield vjf.te7 I
      // 16d: goto 174
      // 170: invokestatic vjf.a (Loov;)Loov;
      // 173: athrow
      // 174: iload 4
      // 176: ifne 194
      // 179: aload 6
      // 17b: getstatic ox_.g04 Le0x;
      // 17e: if_acmpne 194
      // 181: goto 188
      // 184: invokestatic vjf.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 0
      // 189: bipush 1
      // 18a: putfield vjf.tip Z
      // 18d: goto 194
      // 190: invokestatic vjf.a (Loov;)Loov;
      // 193: athrow
      // 194: aload 1
      // 195: sipush 6866
      // 198: ldc2_w 1828269122290712042
      // 19b: lload 2
      // 19c: lxor
      // 19d: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: nop
      // 1a3: bipush 99
      // 1a5: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1a8: iload 4
      // 1aa: ifeq 1e8
      // 1ad: ifeq 1d4
      // 1b0: goto 1b7
      // 1b3: invokestatic vjf.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: aload 1
      // 1b9: sipush 6866
      // 1bc: ldc2_w 1828269122290712042
      // 1bf: lload 2
      // 1c0: lxor
      // 1c1: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: nop
      // 1c7: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 1ca: putfield vjf.eld Z
      // 1cd: goto 1d4
      // 1d0: invokestatic vjf.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: aload 1
      // 1d5: sipush 4072
      // 1d8: ldc2_w 1905785682508703945
      // 1db: lload 2
      // 1dc: lxor
      // 1dd: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: nop
      // 1e3: bipush 10
      // 1e5: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1e8: ifeq 208
      // 1eb: aload 0
      // 1ec: aload 1
      // 1ed: sipush 4072
      // 1f0: ldc2_w 1905785682508703945
      // 1f3: lload 2
      // 1f4: lxor
      // 1f5: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: nop
      // 1fb: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 1fe: putfield vjf.akx Lbdo;
      // 201: goto 208
      // 204: invokestatic vjf.a (Loov;)Loov;
      // 207: athrow
      // 208: aload 6
      // 20a: iload 4
      // 20c: ifeq 21b
      // 20f: ifnull 224
      // 212: goto 219
      // 215: invokestatic vjf.a (Loov;)Loov;
      // 218: athrow
      // 219: aload 6
      // 21b: invokevirtual e0x.p1r ()Lp3y;
      // 21e: getstatic p3y.cei Lp3y;
      // 221: if_acmpne 235
      // 224: aload 0
      // 225: getstatic ox_.vd0 Lpmc;
      // 228: invokevirtual pmc.l4i ()Lzfz;
      // 22b: putfield vjf.b75 Lzfz;
      // 22e: goto 235
      // 231: invokestatic vjf.a (Loov;)Loov;
      // 234: athrow
      // 235: return
   }

   public t9d ky7() {
      return this.oay;
   }

   public void iva(boolean var1) {
      this.tip = var1;
   }

   @Override
   public boolean zex() {
      return false;
   }

   @Override
   public void gfa(wsc param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic vjf.b J
      // 03: ldc2_w 19889766014737
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial i2h.gfa (Lwsc;)V
      // 12: aload 0
      // 13: getfield vjf.b75 Lzfz;
      // 16: iload 4
      // 18: ifeq 30
      // 1b: ifnull 6f
      // 1e: goto 25
      // 21: invokestatic vjf.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield vjf.b75 Lzfz;
      // 29: goto 30
      // 2c: invokestatic vjf.a (Loov;)Loov;
      // 2f: athrow
      // 30: invokeinterface zfz.r_y ()Le0x; 1
      // 35: astore 5
      // 37: aload 1
      // 38: sipush 23019
      // 3b: ldc2_w 3592007353382143293
      // 3e: lload 2
      // 3f: lxor
      // 40: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: aload 5
      // 48: invokestatic e0x.mxb (Le0x;)I
      // 4b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4e: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 51: aload 1
      // 52: sipush 1664
      // 55: ldc2_w 364990038439778889
      // 58: lload 2
      // 59: lxor
      // 5a: invokedynamic j (IJ)Ljava/lang/String; bsm=vjf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: nop
      // 60: aload 5
      // 62: aload 0
      // 63: getfield vjf.b75 Lzfz;
      // 66: invokevirtual e0x.hvp (Lzfz;)I
      // 69: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 6f: return
   }

   public zfz j0m() {
      return this.b75;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7785217945943142221L, -3140036079981916886L, MethodHandles.lookup().lookupClass()).a(259166560074598L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 12636335475265L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[23];
      int var7 = 0;
      String var6 = "Å©-J\u001dÑ\u000eZÚ\u001aßè\u000e%:  \u008cQ*Î\u0001a\u0095þ<øëÈz(_\\R\u000e&÷<ÛcGÓ)ù\u0082\\4î\u0019 ÓÄ£vG©_\u008c-ÿ\u001eøÇ\u007f\r\u009bÿ\u0014ôÃ!eÁåA\u0090\u001fN\u000bá\u0091w\u0010Ä\u0017\u0088¿q5UÚ\u007f©ë\u00ad6e\u009e\u0010 Ä\u008dûm\u0082\u008d\b÷\u0007Ò¼ÐÉÜu\u0084¡©ÃË\u00ad2a\u0006l>èÙú>\u001e¦\u0010qÑ\u009f\u0095\u008eÈø÷Îd\u0094ß\u0091}Ü\u0089\u0010â ÔY\u0088èµ\u001eN1íýþÖ6@\u0018Y8æ6÷V³q\u001e\u001a]K\u0012ór\u008díp\u001a»Ç:\u007f\u0089 \u0007JBÇ2\u0086Y.Øea\u0083 `%ñ¸e+f ¡®6«Ðl«\u009d\u009aÌ@ +\u0083G´ùuÌªúòÞB\nú÷5QêÂùð\u0017cXb\u0095\t4ÇL\u0099=\u0010\u0090K¾v\u000bV8\u0010\u001bp¶ËÜ;@¬ m½Hæ\u0082è\u00ad%O\u008e\u0001GÍH\"}ºþ\u0083w\u000ec[ \u009a \u0085M\u0001ZaÕ\u0010&by3ì|¦³\u0004Õ\u0081\u009e\u0015à±\u0010\u0018\\¨ioÀÜ\fL\u008b\u009b¼g)\u0017VÅlo-\u00017\u0098è½\u0010\u009d\u0001¸ÇÚºÔÇ\u009b}\u0081\u0004Ê¶¸X(\u0093ñäòý\u0091\u008cÝ^ì¥ø!OÂ¬i\u007fÐ\u0019ÈíIá.8ö\u0012\u009ae*\u0080HÓ¿]µ\u0088×õ(°OSÄÎ»\u009eyóBø\u00860 k\u008eæ©êbûm\u001cÃ\u0000..v_8½4\u0092p;)ó$\u0082\u0081 \u009cÁÔ\u0010ßá:j\u001cï)¥qUî@¹¼ÎN«\u009d¥Qi)s=y\u008a\u0013\u008c\u0018ûÀäo<f%\u0099LA\u001c»|µ\u0080}mÿá\"'\u001aän\u0010¼_\u009eB?ð7\u0003ÿh¹cØRÌÚ ÇAÊGímOÿX\u009c\u001c\u0018¿¨sdz\u009d¡dÁV\u0014ðb\bJx¢88\b";
      int var8 = "Å©-J\u001dÑ\u000eZÚ\u001aßè\u000e%:  \u008cQ*Î\u0001a\u0095þ<øëÈz(_\\R\u000e&÷<ÛcGÓ)ù\u0082\\4î\u0019 ÓÄ£vG©_\u008c-ÿ\u001eøÇ\u007f\r\u009bÿ\u0014ôÃ!eÁåA\u0090\u001fN\u000bá\u0091w\u0010Ä\u0017\u0088¿q5UÚ\u007f©ë\u00ad6e\u009e\u0010 Ä\u008dûm\u0082\u008d\b÷\u0007Ò¼ÐÉÜu\u0084¡©ÃË\u00ad2a\u0006l>èÙú>\u001e¦\u0010qÑ\u009f\u0095\u008eÈø÷Îd\u0094ß\u0091}Ü\u0089\u0010â ÔY\u0088èµ\u001eN1íýþÖ6@\u0018Y8æ6÷V³q\u001e\u001a]K\u0012ór\u008díp\u001a»Ç:\u007f\u0089 \u0007JBÇ2\u0086Y.Øea\u0083 `%ñ¸e+f ¡®6«Ðl«\u009d\u009aÌ@ +\u0083G´ùuÌªúòÞB\nú÷5QêÂùð\u0017cXb\u0095\t4ÇL\u0099=\u0010\u0090K¾v\u000bV8\u0010\u001bp¶ËÜ;@¬ m½Hæ\u0082è\u00ad%O\u008e\u0001GÍH\"}ºþ\u0083w\u000ec[ \u009a \u0085M\u0001ZaÕ\u0010&by3ì|¦³\u0004Õ\u0081\u009e\u0015à±\u0010\u0018\\¨ioÀÜ\fL\u008b\u009b¼g)\u0017VÅlo-\u00017\u0098è½\u0010\u009d\u0001¸ÇÚºÔÇ\u009b}\u0081\u0004Ê¶¸X(\u0093ñäòý\u0091\u008cÝ^ì¥ø!OÂ¬i\u007fÐ\u0019ÈíIá.8ö\u0012\u009ae*\u0080HÓ¿]µ\u0088×õ(°OSÄÎ»\u009eyóBø\u00860 k\u008eæ©êbûm\u001cÃ\u0000..v_8½4\u0092p;)ó$\u0082\u0081 \u009cÁÔ\u0010ßá:j\u001cï)¥qUî@¹¼ÎN«\u009d¥Qi)s=y\u008a\u0013\u008c\u0018ûÀäo<f%\u0099LA\u001c»|µ\u0080}mÿá\"'\u001aän\u0010¼_\u009eB?ð7\u0003ÿh¹cØRÌÚ ÇAÊGímOÿX\u009c\u001c\u0018¿¨sdz\u009d¡dÁV\u0014ðb\bJx¢88\b"
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
                     d = new String[23];
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

                  var6 = "Èâ¶\u0099ÎÜ\u0007ú¿Î4\u0019)á\u001a\u009d<#\u0004x\u00066\u008dPµ\\ÇT\bô°½\u0010ðø½N\u0091\u008e-ü³$\u0084ÖM\u0092ÏX";
                  var8 = "Èâ¶\u0099ÎÜ\u0007ú¿Î4\u0019)á\u001a\u009d<#\u0004x\u00066\u008dPµ\\ÇT\bô°½\u0010ðø½N\u0091\u008e-ü³$\u0084ÖM\u0092ÏX".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14317;
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
            throw new RuntimeException("vjf", var10);
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
         throw new RuntimeException("vjf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
