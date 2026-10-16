import com.google.common.collect.Lists;
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

public abstract class aih {
   private int op9;
   private String jpk;
   private final List c9g;
   private aih$vir ww2;
   private double xsg;
   private double qxf;
   private int zwe;
   private int hqe;
   private int c4_;
   private i2h s8q;
   private int ffx;
   private int uw3;
   private int a2q;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public aih() {
      long var1 = a ^ 47875390065373L;
      super();
      this.op9 = 20;
      this.jpk = a<"j">(587, 6457285240539426343L ^ var1);
      this.c9g = Lists.newArrayList();
      this.zwe = 200;
      this.hqe = 800;
      this.c4_ = 4;
      this.ffx = 6;
      this.uw3 = 16;
      this.a2q = 4;
   }

   private String m9e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic aih.a J
      // 03: ldc2_w 53712757733454
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokespecial aih.s8m ()Laih$vir;
      // 10: iload 3
      // 11: ifeq 83
      // 14: ifnonnull 7f
      // 17: goto 1e
      // 1a: invokestatic aih.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield aih.jpk Ljava/lang/String;
      // 22: iload 3
      // 23: ifeq 7e
      // 26: goto 2d
      // 29: invokestatic aih.a (Loov;)Loov;
      // 2c: athrow
      // 2d: ifnull 7a
      // 30: goto 37
      // 33: invokestatic aih.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield aih.jpk Ljava/lang/String;
      // 3b: iload 3
      // 3c: ifeq 7e
      // 3f: goto 46
      // 42: invokestatic aih.a (Loov;)Loov;
      // 45: athrow
      // 46: sipush 29853
      // 49: ldc2_w 8908757476853066356
      // 4c: lload 1
      // 4d: lxor
      // 4e: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 57: ifeq 7a
      // 5a: goto 61
      // 5d: invokestatic aih.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: sipush 20031
      // 65: ldc2_w 6930624220248051933
      // 68: lload 1
      // 69: lxor
      // 6a: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: nop
      // 70: putfield aih.jpk Ljava/lang/String;
      // 73: goto 7a
      // 76: invokestatic aih.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield aih.jpk Ljava/lang/String;
      // 7e: areturn
      // 7f: aload 0
      // 80: invokespecial aih.s8m ()Laih$vir;
      // 83: invokestatic aih$vir.pa8 (Laih$vir;)Ljava/lang/String;
      // 86: areturn
   }

   public void ugq(String var1) {
      this.jpk = var1;
   }

   private boolean zlf() {
      mew var1 = this.fwc();
      return this.c4e().dig((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5, (double)this.uw3);
   }

   public void laq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01e
      // 009: invokespecial aih.zlf ()Z
      // 00c: ifeq 2f4
      // 00f: goto 016
      // 012: invokestatic aih.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic aih.a (Loov;)Loov;
      // 01d: athrow
      // 01e: invokevirtual aih.fwc ()Lmew;
      // 021: astore 2
      // 022: aload 0
      // 023: invokevirtual aih.c4e ()Lt9d;
      // 026: getfield t9d.v0f Z
      // 029: iload 1
      // 02a: ifeq 0ee
      // 02d: ifeq 0e3
      // 030: goto 037
      // 033: invokestatic aih.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 2
      // 038: invokevirtual mew.getX ()I
      // 03b: i2f
      // 03c: aload 0
      // 03d: invokevirtual aih.c4e ()Lt9d;
      // 040: getfield t9d.fsy Ljava/util/Random;
      // 043: invokevirtual java/util/Random.nextFloat ()F
      // 046: fadd
      // 047: f2d
      // 048: dstore 3
      // 049: aload 2
      // 04a: invokevirtual mew.getY ()I
      // 04d: i2f
      // 04e: aload 0
      // 04f: invokevirtual aih.c4e ()Lt9d;
      // 052: getfield t9d.fsy Ljava/util/Random;
      // 055: invokevirtual java/util/Random.nextFloat ()F
      // 058: fadd
      // 059: f2d
      // 05a: dstore 5
      // 05c: aload 2
      // 05d: invokevirtual mew.getZ ()I
      // 060: i2f
      // 061: aload 0
      // 062: invokevirtual aih.c4e ()Lt9d;
      // 065: getfield t9d.fsy Ljava/util/Random;
      // 068: invokevirtual java/util/Random.nextFloat ()F
      // 06b: fadd
      // 06c: f2d
      // 06d: dstore 7
      // 06f: aload 0
      // 070: invokevirtual aih.c4e ()Lt9d;
      // 073: getstatic w_0.bac Lw_0;
      // 076: dload 3
      // 077: dload 5
      // 079: dload 7
      // 07b: dconst_0
      // 07c: dconst_0
      // 07d: dconst_0
      // 07e: bipush 0
      // 07f: newarray 10
      // 081: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 084: aload 0
      // 085: invokevirtual aih.c4e ()Lt9d;
      // 088: getstatic w_0.jnp Lw_0;
      // 08b: dload 3
      // 08c: dload 5
      // 08e: dload 7
      // 090: dconst_0
      // 091: dconst_0
      // 092: dconst_0
      // 093: bipush 0
      // 094: newarray 10
      // 096: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 099: aload 0
      // 09a: iload 1
      // 09b: ifeq 0c5
      // 09e: getfield aih.op9 I
      // 0a1: ifle 0bc
      // 0a4: goto 0ab
      // 0a7: invokestatic aih.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: dup
      // 0ad: getfield aih.op9 I
      // 0b0: bipush 1
      // 0b1: isub
      // 0b2: putfield aih.op9 I
      // 0b5: goto 0bc
      // 0b8: invokestatic aih.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: aload 0
      // 0be: getfield aih.xsg D
      // 0c1: putfield aih.qxf D
      // 0c4: aload 0
      // 0c5: aload 0
      // 0c6: getfield aih.xsg D
      // 0c9: ldc 1000.0
      // 0cb: nop
      // 0cc: aload 0
      // 0cd: getfield aih.op9 I
      // 0d0: i2f
      // 0d1: ldc 200.0
      // 0d3: nop
      // 0d4: fadd
      // 0d5: fdiv
      // 0d6: f2d
      // 0d7: dadd
      // 0d8: ldc2_w 360.0
      // 0db: drem
      // 0dc: putfield aih.xsg D
      // 0df: iload 1
      // 0e0: ifne 2f4
      // 0e3: aload 0
      // 0e4: getfield aih.op9 I
      // 0e7: goto 0ee
      // 0ea: invokestatic aih.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: iload 1
      // 0ef: ifeq 10c
      // 0f2: bipush -1
      // 0f3: if_icmpne 108
      // 0f6: goto 0fd
      // 0f9: invokestatic aih.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: invokespecial aih.jhc ()V
      // 101: goto 108
      // 104: invokestatic aih.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: getfield aih.op9 I
      // 10c: iload 1
      // 10d: ifeq 12a
      // 110: ifle 129
      // 113: goto 11a
      // 116: invokestatic aih.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 0
      // 11b: dup
      // 11c: getfield aih.op9 I
      // 11f: bipush 1
      // 120: isub
      // 121: putfield aih.op9 I
      // 124: return
      // 125: invokestatic aih.a (Loov;)Loov;
      // 128: athrow
      // 129: bipush 0
      // 12a: istore 3
      // 12b: bipush 0
      // 12c: istore 4
      // 12e: iload 4
      // 130: aload 0
      // 131: getfield aih.c4_ I
      // 134: if_icmpge 2e5
      // 137: aload 0
      // 138: invokespecial aih.m9e ()Ljava/lang/String;
      // 13b: aload 0
      // 13c: invokevirtual aih.c4e ()Lt9d;
      // 13f: invokestatic y65.k71 (Ljava/lang/String;Lt9d;)Li2h;
      // 142: astore 5
      // 144: iload 1
      // 145: ifeq 2f4
      // 148: aload 5
      // 14a: ifnonnull 159
      // 14d: goto 154
      // 150: invokestatic aih.a (Loov;)Loov;
      // 153: athrow
      // 154: return
      // 155: invokestatic aih.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 0
      // 15a: invokevirtual aih.c4e ()Lt9d;
      // 15d: aload 5
      // 15f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 162: new nh4
      // 165: dup
      // 166: aload 2
      // 167: invokevirtual mew.getX ()I
      // 16a: i2d
      // 16b: aload 2
      // 16c: invokevirtual mew.getY ()I
      // 16f: i2d
      // 170: aload 2
      // 171: invokevirtual mew.getZ ()I
      // 174: i2d
      // 175: aload 2
      // 176: invokevirtual mew.getX ()I
      // 179: bipush 1
      // 17a: iadd
      // 17b: i2d
      // 17c: aload 2
      // 17d: invokevirtual mew.getY ()I
      // 180: bipush 1
      // 181: iadd
      // 182: i2d
      // 183: aload 2
      // 184: invokevirtual mew.getZ ()I
      // 187: bipush 1
      // 188: iadd
      // 189: i2d
      // 18a: invokespecial nh4.<init> (DDDDDD)V
      // 18d: aload 0
      // 18e: getfield aih.a2q I
      // 191: i2d
      // 192: aload 0
      // 193: getfield aih.a2q I
      // 196: i2d
      // 197: aload 0
      // 198: getfield aih.a2q I
      // 19b: i2d
      // 19c: invokevirtual nh4.c2h (DDD)Lnh4;
      // 19f: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 1a2: invokeinterface java/util/List.size ()I 1
      // 1a7: istore 6
      // 1a9: iload 6
      // 1ab: iload 1
      // 1ac: ifeq 1ca
      // 1af: aload 0
      // 1b0: getfield aih.ffx I
      // 1b3: if_icmplt 1c6
      // 1b6: goto 1bd
      // 1b9: invokestatic aih.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: aload 0
      // 1be: invokespecial aih.jhc ()V
      // 1c1: return
      // 1c2: invokestatic aih.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 2
      // 1c7: invokevirtual mew.getX ()I
      // 1ca: i2d
      // 1cb: aload 0
      // 1cc: invokevirtual aih.c4e ()Lt9d;
      // 1cf: getfield t9d.fsy Ljava/util/Random;
      // 1d2: invokevirtual java/util/Random.nextDouble ()D
      // 1d5: aload 0
      // 1d6: invokevirtual aih.c4e ()Lt9d;
      // 1d9: getfield t9d.fsy Ljava/util/Random;
      // 1dc: invokevirtual java/util/Random.nextDouble ()D
      // 1df: dsub
      // 1e0: aload 0
      // 1e1: getfield aih.a2q I
      // 1e4: i2d
      // 1e5: dmul
      // 1e6: dadd
      // 1e7: ldc2_w 0.5
      // 1ea: dadd
      // 1eb: dstore 7
      // 1ed: aload 2
      // 1ee: invokevirtual mew.getY ()I
      // 1f1: aload 0
      // 1f2: invokevirtual aih.c4e ()Lt9d;
      // 1f5: getfield t9d.fsy Ljava/util/Random;
      // 1f8: bipush 3
      // 1f9: invokevirtual java/util/Random.nextInt (I)I
      // 1fc: iadd
      // 1fd: bipush 1
      // 1fe: isub
      // 1ff: i2d
      // 200: dstore 9
      // 202: aload 2
      // 203: invokevirtual mew.getZ ()I
      // 206: i2d
      // 207: aload 0
      // 208: invokevirtual aih.c4e ()Lt9d;
      // 20b: getfield t9d.fsy Ljava/util/Random;
      // 20e: invokevirtual java/util/Random.nextDouble ()D
      // 211: aload 0
      // 212: invokevirtual aih.c4e ()Lt9d;
      // 215: getfield t9d.fsy Ljava/util/Random;
      // 218: invokevirtual java/util/Random.nextDouble ()D
      // 21b: dsub
      // 21c: aload 0
      // 21d: getfield aih.a2q I
      // 220: i2d
      // 221: dmul
      // 222: dadd
      // 223: ldc2_w 0.5
      // 226: dadd
      // 227: dstore 11
      // 229: aload 5
      // 22b: iload 1
      // 22c: ifeq 245
      // 22f: instanceof yqv
      // 232: ifeq 24b
      // 235: goto 23c
      // 238: invokestatic aih.a (Loov;)Loov;
      // 23b: athrow
      // 23c: aload 5
      // 23e: goto 245
      // 241: invokestatic aih.a (Loov;)Loov;
      // 244: athrow
      // 245: checkcast yqv
      // 248: goto 24c
      // 24b: aconst_null
      // 24c: astore 13
      // 24e: aload 5
      // 250: dload 7
      // 252: dload 9
      // 254: dload 11
      // 256: aload 0
      // 257: invokevirtual aih.c4e ()Lt9d;
      // 25a: getfield t9d.fsy Ljava/util/Random;
      // 25d: invokevirtual java/util/Random.nextFloat ()F
      // 260: ldc 360.0
      // 262: nop
      // 263: fmul
      // 264: fconst_0
      // 265: invokevirtual i2h.x24 (DDDFF)V
      // 268: aload 13
      // 26a: iload 1
      // 26b: ifeq 2c9
      // 26e: ifnull 2ac
      // 271: goto 278
      // 274: invokestatic aih.a (Loov;)Loov;
      // 277: athrow
      // 278: aload 13
      // 27a: invokevirtual yqv.iaw ()Z
      // 27d: iload 1
      // 27e: ifeq 2a9
      // 281: goto 288
      // 284: invokestatic aih.a (Loov;)Loov;
      // 287: athrow
      // 288: ifeq 2de
      // 28b: goto 292
      // 28e: invokestatic aih.a (Loov;)Loov;
      // 291: athrow
      // 292: aload 13
      // 294: iload 1
      // 295: ifeq 2c9
      // 298: goto 29f
      // 29b: invokestatic aih.a (Loov;)Loov;
      // 29e: athrow
      // 29f: invokevirtual yqv.m63 ()Z
      // 2a2: goto 2a9
      // 2a5: invokestatic aih.a (Loov;)Loov;
      // 2a8: athrow
      // 2a9: ifeq 2de
      // 2ac: aload 0
      // 2ad: aload 5
      // 2af: bipush 1
      // 2b0: invokespecial aih.yh9 (Li2h;Z)Li2h;
      // 2b3: pop
      // 2b4: aload 0
      // 2b5: invokevirtual aih.c4e ()Lt9d;
      // 2b8: sipush 2004
      // 2bb: aload 2
      // 2bc: bipush 0
      // 2bd: invokevirtual t9d.qca (ILmew;I)V
      // 2c0: aload 13
      // 2c2: goto 2c9
      // 2c5: invokestatic aih.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: iload 1
      // 2ca: ifeq 2d9
      // 2cd: ifnull 2dc
      // 2d0: goto 2d7
      // 2d3: invokestatic aih.a (Loov;)Loov;
      // 2d6: athrow
      // 2d7: aload 13
      // 2d9: invokevirtual yqv.guo ()V
      // 2dc: bipush 1
      // 2dd: istore 3
      // 2de: iinc 4 1
      // 2e1: iload 1
      // 2e2: ifne 12e
      // 2e5: iload 3
      // 2e6: ifeq 2f4
      // 2e9: aload 0
      // 2ea: invokespecial aih.jhc ()V
      // 2ed: goto 2f4
      // 2f0: invokestatic aih.a (Loov;)Loov;
      // 2f3: athrow
      // 2f4: return
   }

   private i2h yh9(i2h param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic aih.a J
      // 003: ldc2_w 14293770204693
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: invokespecial aih.s8m ()Laih$vir;
      // 011: ifnull 1f1
      // 014: new bdo
      // 017: dup
      // 018: invokespecial bdo.<init> ()V
      // 01b: astore 6
      // 01d: aload 1
      // 01e: aload 6
      // 020: invokevirtual i2h.qqt (Lbdo;)Z
      // 023: pop
      // 024: aload 0
      // 025: invokespecial aih.s8m ()Laih$vir;
      // 028: invokestatic aih$vir.pmp (Laih$vir;)Lbdo;
      // 02b: invokevirtual bdo.bo9 ()Ljava/util/Set;
      // 02e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 033: astore 7
      // 035: aload 7
      // 037: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03c: ifeq 076
      // 03f: aload 7
      // 041: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 046: checkcast java/lang/String
      // 049: astore 8
      // 04b: aload 0
      // 04c: invokespecial aih.s8m ()Laih$vir;
      // 04f: invokestatic aih$vir.pmp (Laih$vir;)Lbdo;
      // 052: aload 8
      // 054: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 057: astore 9
      // 059: aload 6
      // 05b: aload 8
      // 05d: aload 9
      // 05f: invokevirtual gdw.h33 ()Lgdw;
      // 062: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 065: iload 5
      // 067: ifne 07c
      // 06a: iload 5
      // 06c: ifeq 035
      // 06f: goto 076
      // 072: invokestatic aih.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 1
      // 077: aload 6
      // 079: invokevirtual i2h.a1f (Lbdo;)V
      // 07c: aload 1
      // 07d: iload 5
      // 07f: ifne 0b7
      // 082: getfield i2h.oay Lt9d;
      // 085: ifnull 0b6
      // 088: goto 08f
      // 08b: invokestatic aih.a (Loov;)Loov;
      // 08e: athrow
      // 08f: iload 2
      // 090: iload 5
      // 092: ifne 0b5
      // 095: goto 09c
      // 098: invokestatic aih.a (Loov;)Loov;
      // 09b: athrow
      // 09c: ifeq 0b6
      // 09f: goto 0a6
      // 0a2: invokestatic aih.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: getfield i2h.oay Lt9d;
      // 0aa: aload 1
      // 0ab: invokevirtual t9d.xzq (Li2h;)Z
      // 0ae: goto 0b5
      // 0b1: invokestatic aih.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: pop
      // 0b6: aload 1
      // 0b7: astore 8
      // 0b9: aload 6
      // 0bb: sipush 31341
      // 0be: ldc2_w 1361176763245619926
      // 0c1: lload 3
      // 0c2: lxor
      // 0c3: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: nop
      // 0c9: bipush 10
      // 0cb: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0ce: ifeq 1ec
      // 0d1: aload 6
      // 0d3: sipush 6048
      // 0d6: ldc2_w 2320174661454333699
      // 0d9: lload 3
      // 0da: lxor
      // 0db: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: nop
      // 0e1: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 0e4: astore 7
      // 0e6: aload 7
      // 0e8: sipush 12025
      // 0eb: ldc2_w 2300126575877242439
      // 0ee: lload 3
      // 0ef: lxor
      // 0f0: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: nop
      // 0f6: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0f9: aload 1
      // 0fa: getfield i2h.oay Lt9d;
      // 0fd: invokestatic y65.k71 (Ljava/lang/String;Lt9d;)Li2h;
      // 100: astore 9
      // 102: aload 9
      // 104: iload 5
      // 106: ifne 282
      // 109: iload 5
      // 10b: ifne 1e1
      // 10e: goto 115
      // 111: invokestatic aih.a (Loov;)Loov;
      // 114: athrow
      // 115: ifnull 1df
      // 118: goto 11f
      // 11b: invokestatic aih.a (Loov;)Loov;
      // 11e: athrow
      // 11f: new bdo
      // 122: dup
      // 123: invokespecial bdo.<init> ()V
      // 126: astore 10
      // 128: aload 9
      // 12a: aload 10
      // 12c: invokevirtual i2h.qqt (Lbdo;)Z
      // 12f: pop
      // 130: aload 7
      // 132: invokevirtual bdo.bo9 ()Ljava/util/Set;
      // 135: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 13a: astore 11
      // 13c: aload 11
      // 13e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 143: ifeq 178
      // 146: aload 11
      // 148: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14d: checkcast java/lang/String
      // 150: astore 12
      // 152: aload 7
      // 154: aload 12
      // 156: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 159: astore 13
      // 15b: aload 10
      // 15d: aload 12
      // 15f: aload 13
      // 161: invokevirtual gdw.h33 ()Lgdw;
      // 164: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 167: iload 5
      // 169: ifne 19d
      // 16c: iload 5
      // 16e: ifeq 13c
      // 171: goto 178
      // 174: invokestatic aih.a (Loov;)Loov;
      // 177: athrow
      // 178: aload 9
      // 17a: aload 10
      // 17c: invokevirtual i2h.a1f (Lbdo;)V
      // 17f: aload 9
      // 181: aload 8
      // 183: getfield i2h.o2v D
      // 186: aload 8
      // 188: getfield i2h.kfp D
      // 18b: aload 8
      // 18d: getfield i2h.vbd D
      // 190: aload 8
      // 192: getfield i2h.x5k F
      // 195: aload 8
      // 197: getfield i2h.y2i F
      // 19a: invokevirtual i2h.x24 (DDDFF)V
      // 19d: aload 1
      // 19e: iload 5
      // 1a0: ifne 1da
      // 1a3: getfield i2h.oay Lt9d;
      // 1a6: ifnull 1d8
      // 1a9: goto 1b0
      // 1ac: invokestatic aih.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: iload 2
      // 1b1: iload 5
      // 1b3: ifne 1d7
      // 1b6: goto 1bd
      // 1b9: invokestatic aih.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: ifeq 1d8
      // 1c0: goto 1c7
      // 1c3: invokestatic aih.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 1
      // 1c8: getfield i2h.oay Lt9d;
      // 1cb: aload 9
      // 1cd: invokevirtual t9d.xzq (Li2h;)Z
      // 1d0: goto 1d7
      // 1d3: invokestatic aih.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: pop
      // 1d8: aload 8
      // 1da: aload 9
      // 1dc: invokevirtual i2h.nw9 (Li2h;)V
      // 1df: aload 9
      // 1e1: astore 8
      // 1e3: aload 7
      // 1e5: astore 6
      // 1e7: iload 5
      // 1e9: ifeq 0b9
      // 1ec: iload 5
      // 1ee: ifeq 281
      // 1f1: aload 1
      // 1f2: iload 5
      // 1f4: ifne 282
      // 1f7: goto 1fe
      // 1fa: invokestatic aih.a (Loov;)Loov;
      // 1fd: athrow
      // 1fe: instanceof g_3
      // 201: ifeq 281
      // 204: goto 20b
      // 207: invokestatic aih.a (Loov;)Loov;
      // 20a: athrow
      // 20b: aload 1
      // 20c: iload 5
      // 20e: ifne 282
      // 211: goto 218
      // 214: invokestatic aih.a (Loov;)Loov;
      // 217: athrow
      // 218: getfield i2h.oay Lt9d;
      // 21b: ifnull 281
      // 21e: goto 225
      // 221: invokestatic aih.a (Loov;)Loov;
      // 224: athrow
      // 225: iload 2
      // 226: iload 5
      // 228: ifne 247
      // 22b: goto 232
      // 22e: invokestatic aih.a (Loov;)Loov;
      // 231: athrow
      // 232: ifeq 281
      // 235: goto 23c
      // 238: invokestatic aih.a (Loov;)Loov;
      // 23b: athrow
      // 23c: aload 1
      // 23d: instanceof yqv
      // 240: goto 247
      // 243: invokestatic aih.a (Loov;)Loov;
      // 246: athrow
      // 247: iload 5
      // 249: ifne 280
      // 24c: ifeq 278
      // 24f: goto 256
      // 252: invokestatic aih.a (Loov;)Loov;
      // 255: athrow
      // 256: aload 1
      // 257: checkcast yqv
      // 25a: aload 1
      // 25b: getfield i2h.oay Lt9d;
      // 25e: new mew
      // 261: dup
      // 262: aload 1
      // 263: invokespecial mew.<init> (Li2h;)V
      // 266: invokevirtual t9d.sms (Lmew;)Lcss;
      // 269: aconst_null
      // 26a: checkcast ps6
      // 26d: invokevirtual yqv.hx8 (Lcss;Lps6;)Lps6;
      // 270: pop
      // 271: goto 278
      // 274: invokestatic aih.a (Loov;)Loov;
      // 277: athrow
      // 278: aload 1
      // 279: getfield i2h.oay Lt9d;
      // 27c: aload 1
      // 27d: invokevirtual t9d.xzq (Li2h;)Z
      // 280: pop
      // 281: aload 1
      // 282: areturn
   }

   private void jhc() {
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
      // 05: getfield aih.hqe I
      // 08: aload 0
      // 09: getfield aih.zwe I
      // 0c: iload 1
      // 0d: ifne 3c
      // 10: if_icmpgt 2d
      // 13: goto 1a
      // 16: invokestatic aih.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 0
      // 1c: getfield aih.zwe I
      // 1f: putfield aih.op9 I
      // 22: iload 1
      // 23: ifeq 52
      // 26: goto 2d
      // 29: invokestatic aih.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield aih.hqe I
      // 31: aload 0
      // 32: getfield aih.zwe I
      // 35: goto 3c
      // 38: invokestatic aih.a (Loov;)Loov;
      // 3b: athrow
      // 3c: isub
      // 3d: istore 2
      // 3e: aload 0
      // 3f: aload 0
      // 40: getfield aih.zwe I
      // 43: aload 0
      // 44: invokevirtual aih.c4e ()Lt9d;
      // 47: getfield t9d.fsy Ljava/util/Random;
      // 4a: iload 2
      // 4b: invokevirtual java/util/Random.nextInt (I)I
      // 4e: iadd
      // 4f: putfield aih.op9 I
      // 52: aload 0
      // 53: iload 1
      // 54: ifne 86
      // 57: getfield aih.c9g Ljava/util/List;
      // 5a: invokeinterface java/util/List.size ()I 1
      // 5f: ifle 85
      // 62: goto 69
      // 65: invokestatic aih.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: aload 0
      // 6b: invokevirtual aih.c4e ()Lt9d;
      // 6e: getfield t9d.fsy Ljava/util/Random;
      // 71: aload 0
      // 72: getfield aih.c9g Ljava/util/List;
      // 75: invokestatic zfj.h82 (Ljava/util/Random;Ljava/util/Collection;)Lzfj$yuc;
      // 78: checkcast aih$vir
      // 7b: invokevirtual aih.yv6 (Laih$vir;)V
      // 7e: goto 85
      // 81: invokestatic aih.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: bipush 1
      // 87: invokevirtual aih.jn0 (I)V
      // 8a: return
   }

   public void n8j(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic aih.a J
      // 003: ldc2_w 16096040319787
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 8167
      // 00d: ldc2_w 3724201621238743654
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 01b: putfield aih.jpk Ljava/lang/String;
      // 01e: invokestatic t9d.b ()I
      // 021: aload 0
      // 022: aload 1
      // 023: sipush 20261
      // 026: ldc2_w 3008635586482557601
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 034: putfield aih.op9 I
      // 037: istore 4
      // 039: aload 0
      // 03a: getfield aih.c9g Ljava/util/List;
      // 03d: invokeinterface java/util/List.clear ()V 1
      // 042: aload 1
      // 043: sipush 8817
      // 046: ldc2_w 8910170720983072738
      // 049: lload 2
      // 04a: lxor
      // 04b: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: nop
      // 051: bipush 9
      // 053: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 056: iload 4
      // 058: ifeq 0c9
      // 05b: ifeq 0b5
      // 05e: goto 065
      // 061: invokestatic aih.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 1
      // 066: sipush 8817
      // 069: ldc2_w 8910170720983072738
      // 06c: lload 2
      // 06d: lxor
      // 06e: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: bipush 10
      // 076: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 079: astore 5
      // 07b: bipush 0
      // 07c: istore 6
      // 07e: iload 6
      // 080: aload 5
      // 082: invokevirtual qhg.vek ()I
      // 085: if_icmpge 0b5
      // 088: aload 0
      // 089: getfield aih.c9g Ljava/util/List;
      // 08c: new aih$vir
      // 08f: dup
      // 090: aload 0
      // 091: aload 5
      // 093: iload 6
      // 095: invokevirtual qhg.kd6 (I)Lbdo;
      // 098: invokespecial aih$vir.<init> (Laih;Lbdo;)V
      // 09b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a0: pop
      // 0a1: iinc 6 1
      // 0a4: iload 4
      // 0a6: ifeq 0fa
      // 0a9: iload 4
      // 0ab: ifne 07e
      // 0ae: goto 0b5
      // 0b1: invokestatic aih.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 1
      // 0b6: sipush 29005
      // 0b9: ldc2_w 960697952957197525
      // 0bc: lload 2
      // 0bd: lxor
      // 0be: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: nop
      // 0c4: bipush 10
      // 0c6: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0c9: ifeq 0fa
      // 0cc: aload 0
      // 0cd: new aih$vir
      // 0d0: dup
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: sipush 29005
      // 0d6: ldc2_w 960697952957197525
      // 0d9: lload 2
      // 0da: lxor
      // 0db: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: nop
      // 0e1: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 0e4: aload 0
      // 0e5: getfield aih.jpk Ljava/lang/String;
      // 0e8: invokespecial aih$vir.<init> (Laih;Lbdo;Ljava/lang/String;)V
      // 0eb: invokevirtual aih.yv6 (Laih$vir;)V
      // 0ee: iload 4
      // 0f0: ifne 102
      // 0f3: goto 0fa
      // 0f6: invokestatic aih.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: aconst_null
      // 0fc: checkcast aih$vir
      // 0ff: invokevirtual aih.yv6 (Laih$vir;)V
      // 102: aload 1
      // 103: sipush 21183
      // 106: ldc2_w 7845266370448445224
      // 109: lload 2
      // 10a: lxor
      // 10b: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: nop
      // 111: bipush 99
      // 113: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 116: iload 4
      // 118: ifeq 182
      // 11b: ifeq 16e
      // 11e: goto 125
      // 121: invokestatic aih.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: aload 1
      // 127: sipush 21183
      // 12a: ldc2_w 7845266370448445224
      // 12d: lload 2
      // 12e: lxor
      // 12f: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: nop
      // 135: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 138: putfield aih.zwe I
      // 13b: aload 0
      // 13c: aload 1
      // 13d: sipush 2340
      // 140: ldc2_w 8048246560690148519
      // 143: lload 2
      // 144: lxor
      // 145: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: nop
      // 14b: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 14e: putfield aih.hqe I
      // 151: aload 0
      // 152: aload 1
      // 153: sipush 18611
      // 156: ldc2_w 948772483924743473
      // 159: lload 2
      // 15a: lxor
      // 15b: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: nop
      // 161: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 164: putfield aih.c4_ I
      // 167: goto 16e
      // 16a: invokestatic aih.a (Loov;)Loov;
      // 16d: athrow
      // 16e: aload 1
      // 16f: sipush 12130
      // 172: ldc2_w 3225075681148023542
      // 175: lload 2
      // 176: lxor
      // 177: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: nop
      // 17d: bipush 99
      // 17f: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 182: iload 4
      // 184: ifeq 1d8
      // 187: ifeq 1c4
      // 18a: goto 191
      // 18d: invokestatic aih.a (Loov;)Loov;
      // 190: athrow
      // 191: aload 0
      // 192: aload 1
      // 193: sipush 12130
      // 196: ldc2_w 3225075681148023542
      // 199: lload 2
      // 19a: lxor
      // 19b: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: nop
      // 1a1: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 1a4: putfield aih.ffx I
      // 1a7: aload 0
      // 1a8: aload 1
      // 1a9: sipush 4297
      // 1ac: ldc2_w 2994124605280324955
      // 1af: lload 2
      // 1b0: lxor
      // 1b1: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: nop
      // 1b7: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 1ba: putfield aih.uw3 I
      // 1bd: goto 1c4
      // 1c0: invokestatic aih.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 1
      // 1c5: sipush 27389
      // 1c8: ldc2_w 1173187014583023469
      // 1cb: lload 2
      // 1cc: lxor
      // 1cd: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: nop
      // 1d3: bipush 99
      // 1d5: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1d8: ifeq 1f8
      // 1db: aload 0
      // 1dc: aload 1
      // 1dd: sipush 27389
      // 1e0: ldc2_w 1173187014583023469
      // 1e3: lload 2
      // 1e4: lxor
      // 1e5: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: nop
      // 1eb: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 1ee: putfield aih.a2q I
      // 1f1: goto 1f8
      // 1f4: invokestatic aih.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: iload 4
      // 1fb: ifeq 213
      // 1fe: invokevirtual aih.c4e ()Lt9d;
      // 201: ifnull 217
      // 204: goto 20b
      // 207: invokestatic aih.a (Loov;)Loov;
      // 20a: athrow
      // 20b: aload 0
      // 20c: goto 213
      // 20f: invokestatic aih.a (Loov;)Loov;
      // 212: athrow
      // 213: aconst_null
      // 214: putfield aih.s8q Li2h;
      // 217: return
   }

   public void ymq(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic aih.a J
      // 003: ldc2_w 102256513809302
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: invokespecial aih.m9e ()Ljava/lang/String;
      // 011: astore 5
      // 013: iload 4
      // 015: ifne 0e3
      // 018: aload 5
      // 01a: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 01d: ifne 1c8
      // 020: goto 027
      // 023: invokestatic aih.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 1
      // 028: sipush 31474
      // 02b: ldc2_w 6674321944096630722
      // 02e: lload 2
      // 02f: lxor
      // 030: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: aload 5
      // 038: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 03b: aload 1
      // 03c: sipush 1816
      // 03f: ldc2_w 2692938339158465086
      // 042: lload 2
      // 043: lxor
      // 044: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: nop
      // 04a: aload 0
      // 04b: getfield aih.op9 I
      // 04e: i2s
      // 04f: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 052: aload 1
      // 053: sipush 20292
      // 056: ldc2_w 3192198622195634792
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: aload 0
      // 062: getfield aih.zwe I
      // 065: i2s
      // 066: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 069: aload 1
      // 06a: sipush 21039
      // 06d: ldc2_w 4072533779962875662
      // 070: lload 2
      // 071: lxor
      // 072: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: aload 0
      // 079: getfield aih.hqe I
      // 07c: i2s
      // 07d: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 080: aload 1
      // 081: sipush 30301
      // 084: ldc2_w 2918897312144026489
      // 087: lload 2
      // 088: lxor
      // 089: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: nop
      // 08f: aload 0
      // 090: getfield aih.c4_ I
      // 093: i2s
      // 094: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 097: aload 1
      // 098: sipush 5999
      // 09b: ldc2_w 6863223105447561805
      // 09e: lload 2
      // 09f: lxor
      // 0a0: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: nop
      // 0a6: aload 0
      // 0a7: getfield aih.ffx I
      // 0aa: i2s
      // 0ab: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 0ae: aload 1
      // 0af: sipush 18696
      // 0b2: ldc2_w 8425654820312503328
      // 0b5: lload 2
      // 0b6: lxor
      // 0b7: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: nop
      // 0bd: aload 0
      // 0be: getfield aih.uw3 I
      // 0c1: i2s
      // 0c2: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 0c5: aload 1
      // 0c6: sipush 26875
      // 0c9: ldc2_w 8132317050105755072
      // 0cc: lload 2
      // 0cd: lxor
      // 0ce: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: nop
      // 0d4: aload 0
      // 0d5: getfield aih.a2q I
      // 0d8: i2s
      // 0d9: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 0dc: goto 0e3
      // 0df: invokestatic aih.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: invokespecial aih.s8m ()Laih$vir;
      // 0e7: iload 4
      // 0e9: ifne 129
      // 0ec: ifnull 119
      // 0ef: goto 0f6
      // 0f2: invokestatic aih.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 1
      // 0f7: sipush 12108
      // 0fa: ldc2_w 7396868429071921767
      // 0fd: lload 2
      // 0fe: lxor
      // 0ff: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: nop
      // 105: aload 0
      // 106: invokespecial aih.s8m ()Laih$vir;
      // 109: invokestatic aih$vir.pmp (Laih$vir;)Lbdo;
      // 10c: invokevirtual bdo.h33 ()Lgdw;
      // 10f: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 112: goto 119
      // 115: invokestatic aih.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 4
      // 11c: ifne 12d
      // 11f: invokespecial aih.s8m ()Laih$vir;
      // 122: goto 129
      // 125: invokestatic aih.a (Loov;)Loov;
      // 128: athrow
      // 129: ifnonnull 138
      // 12c: aload 0
      // 12d: getfield aih.c9g Ljava/util/List;
      // 130: invokeinterface java/util/List.size ()I 1
      // 135: ifle 1c8
      // 138: new qhg
      // 13b: dup
      // 13c: invokespecial qhg.<init> ()V
      // 13f: astore 6
      // 141: aload 0
      // 142: getfield aih.c9g Ljava/util/List;
      // 145: iload 4
      // 147: ifne 164
      // 14a: invokeinterface java/util/List.size ()I 1
      // 14f: ifle 1a1
      // 152: goto 159
      // 155: invokestatic aih.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 0
      // 15a: getfield aih.c9g Ljava/util/List;
      // 15d: goto 164
      // 160: invokestatic aih.a (Loov;)Loov;
      // 163: athrow
      // 164: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 169: astore 7
      // 16b: aload 7
      // 16d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 172: ifeq 19c
      // 175: aload 7
      // 177: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 17c: checkcast aih$vir
      // 17f: astore 8
      // 181: aload 6
      // 183: aload 8
      // 185: invokevirtual aih$vir.dv9 ()Lbdo;
      // 188: invokevirtual qhg.w2j (Lgdw;)V
      // 18b: iload 4
      // 18d: ifne 1b4
      // 190: iload 4
      // 192: ifeq 16b
      // 195: goto 19c
      // 198: invokestatic aih.a (Loov;)Loov;
      // 19b: athrow
      // 19c: iload 4
      // 19e: ifeq 1b4
      // 1a1: aload 6
      // 1a3: aload 0
      // 1a4: invokespecial aih.s8m ()Laih$vir;
      // 1a7: invokevirtual aih$vir.dv9 ()Lbdo;
      // 1aa: invokevirtual qhg.w2j (Lgdw;)V
      // 1ad: goto 1b4
      // 1b0: invokestatic aih.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: aload 1
      // 1b5: sipush 26685
      // 1b8: ldc2_w 4694943950964847902
      // 1bb: lload 2
      // 1bc: lxor
      // 1bd: invokedynamic j (IJ)Ljava/lang/String; bsm=aih.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: nop
      // 1c3: aload 6
      // 1c5: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 1c8: return
   }

   public i2h dou(t9d var1) {
      int var2 = t9d.c();

      try {
         if (var2 != 0) {
            return this.s8q;
         }

         if (this.s8q != null) {
            return this.s8q;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      i2h var3 = y65.k71(this.m9e(), var1);

      try {
         if (var2 != 0) {
            return var3;
         }

         if (var3 == null) {
            return this.s8q;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 = this.yh9(var3, false);
      this.s8q = var3;
      return this.s8q;
   }

   public boolean h99(int param1) {
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
      // 06: ifne 3f
      // 09: bipush 1
      // 0a: if_icmpne 3e
      // 0d: goto 14
      // 10: invokestatic aih.a (Loov;)Loov;
      // 13: athrow
      // 14: aload 0
      // 15: invokevirtual aih.c4e ()Lt9d;
      // 18: getfield t9d.v0f Z
      // 1b: iload 2
      // 1c: ifne 3f
      // 1f: goto 26
      // 22: invokestatic aih.a (Loov;)Loov;
      // 25: athrow
      // 26: ifeq 3e
      // 29: goto 30
      // 2c: invokestatic aih.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: aload 0
      // 32: getfield aih.zwe I
      // 35: putfield aih.op9 I
      // 38: bipush 1
      // 39: ireturn
      // 3a: invokestatic aih.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   private aih$vir s8m() {
      return this.ww2;
   }

   public void yv6(aih$vir var1) {
      this.ww2 = var1;
   }

   public abstract void jn0(int var1);

   public abstract t9d c4e();

   public abstract mew fwc();

   public double maa() {
      return this.xsg;
   }

   public double l75() {
      return this.qxf;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5598136847231659381L, -2666797064403999810L, MethodHandles.lookup().lookupClass()).a(81109302142434L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 59981422255584L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[26];
      int var7 = 0;
      String var6 = "Ô QÚ;\"]OÕ\u0095oz\nÞ±¹GÿE(Þ:cüÄ\u0013«é¬¾è®\u009c\u001a\u0081¡9É{T(§\u0010\u001eKi\u0093å»z\u0082,,F°Ç¥b+í\u0005¯I\u0011Iyva¼\u0082ÊÜ\u001fyøWsÐUn=\u0018e$µâûg\t<¨ô\u000flA?uðyôÕS«9\u0091ö ¡!åXÜ\u0001Hàg¾ís{\u008e\u0019\u0089ömþ.ñÙ¾l-e[2§¸\u0080\u008b\u0018\u009aªK´Ø½Ôtú9lxÿpßö\u0089a[Y°&ë\u009b á\u008fh\u0094~\u0014[\u0083êú\u0007~\u001bft!±ý³PXçÝ`eö]|ë\u0004\u0097\u009b(>!Îú\u009aoQ\fñ]\u0087\"þyÐ5B\u0084ü\u009a¬ë>Ü¨¸ßJE\u009e9ô\u0016ÃñW\u0083ºvÏ Ò\u0014ðòV\u0087ÍÚÊÖJ,÷\rÄ\u00169âA\u009aÑz(¤ô/ÖlD¯U\u001a\u0018È¤\u0018¦D\u0016;va\u0094³ó\u0095¼YB77îß\u0095\u0097[I\u0010ó$\u0080\u0097\u001b\u008bD\u001e*\u0017¢Ñ$\u0013\u001eà\u0018Bt\u009c\u0015Ðe¨N¦\u000b~k»:f÷çõ´fÎ7\u0097\u000e(ÙÑäg.\u000e,^á\u009b$¨âþ`«Ô¿\u0080ÙÚ\u000f\u0098Í/\u0094²1}Ë\u009cazé\u0099\u008b\u0010\u0089<(\u0018ø)\u0084\u008d\u00ad\u0083\u001fC\u0082Ë\ríï\nÔ99F»\u0014¸¡ßÇ YÊÇr\u0088È~°\u0010ÿþevêñM\u009coÍÏ0_\u0094\u0082uôi¸z\u0083Qt\u0010qÅE'\u009bÆq@e¥\u00076\u0094ZÇ»\u0010çá$\u0098Üvµù_A\u008a\\à\u0086Î>\u0010YIâ\u000b\u0006LL1æ\u0014¨9ã\u008e\u0010(\u0010¶(\u0007¤Ðw\u0004\u008c>eKº\u008fOýV\u0018<P\u001c\u0011²ÛmÄ\u0090\u0001ÍÁs\u0017º\u0083ÁôT)\u0019Æº\u008c(t\u0089\u008a\n«\u0083\u0013;\u0000\u0096òsØõ\u0097ÕÛne]\rº\u0016Û;©òÅÐ\u000e¨ÚÝwSãUøQÉ\u0010qDjÏt\u009d x\u001dÕÙz·úüÎ Æ¹$\u0010mç²áö\u008e\u001e\u0006ÁA|Ûª\u0003~àâão7oz'Çãe\"-\u0018ö\u0089æïÔÏ´\u0093²,Ý2\u0017\u008c5\u0014²A;\u0002\u0016«b\u00ad\u0018O©]\u0018\u0012à¤\u001ah\u0081¤+\u0005\u0085\f\u0015C\u0092\u009e²\u0019\b¢y";
      int var8 = "Ô QÚ;\"]OÕ\u0095oz\nÞ±¹GÿE(Þ:cüÄ\u0013«é¬¾è®\u009c\u001a\u0081¡9É{T(§\u0010\u001eKi\u0093å»z\u0082,,F°Ç¥b+í\u0005¯I\u0011Iyva¼\u0082ÊÜ\u001fyøWsÐUn=\u0018e$µâûg\t<¨ô\u000flA?uðyôÕS«9\u0091ö ¡!åXÜ\u0001Hàg¾ís{\u008e\u0019\u0089ömþ.ñÙ¾l-e[2§¸\u0080\u008b\u0018\u009aªK´Ø½Ôtú9lxÿpßö\u0089a[Y°&ë\u009b á\u008fh\u0094~\u0014[\u0083êú\u0007~\u001bft!±ý³PXçÝ`eö]|ë\u0004\u0097\u009b(>!Îú\u009aoQ\fñ]\u0087\"þyÐ5B\u0084ü\u009a¬ë>Ü¨¸ßJE\u009e9ô\u0016ÃñW\u0083ºvÏ Ò\u0014ðòV\u0087ÍÚÊÖJ,÷\rÄ\u00169âA\u009aÑz(¤ô/ÖlD¯U\u001a\u0018È¤\u0018¦D\u0016;va\u0094³ó\u0095¼YB77îß\u0095\u0097[I\u0010ó$\u0080\u0097\u001b\u008bD\u001e*\u0017¢Ñ$\u0013\u001eà\u0018Bt\u009c\u0015Ðe¨N¦\u000b~k»:f÷çõ´fÎ7\u0097\u000e(ÙÑäg.\u000e,^á\u009b$¨âþ`«Ô¿\u0080ÙÚ\u000f\u0098Í/\u0094²1}Ë\u009cazé\u0099\u008b\u0010\u0089<(\u0018ø)\u0084\u008d\u00ad\u0083\u001fC\u0082Ë\ríï\nÔ99F»\u0014¸¡ßÇ YÊÇr\u0088È~°\u0010ÿþevêñM\u009coÍÏ0_\u0094\u0082uôi¸z\u0083Qt\u0010qÅE'\u009bÆq@e¥\u00076\u0094ZÇ»\u0010çá$\u0098Üvµù_A\u008a\\à\u0086Î>\u0010YIâ\u000b\u0006LL1æ\u0014¨9ã\u008e\u0010(\u0010¶(\u0007¤Ðw\u0004\u008c>eKº\u008fOýV\u0018<P\u001c\u0011²ÛmÄ\u0090\u0001ÍÁs\u0017º\u0083ÁôT)\u0019Æº\u008c(t\u0089\u008a\n«\u0083\u0013;\u0000\u0096òsØõ\u0097ÕÛne]\rº\u0016Û;©òÅÐ\u000e¨ÚÝwSãUøQÉ\u0010qDjÏt\u009d x\u001dÕÙz·úüÎ Æ¹$\u0010mç²áö\u008e\u001e\u0006ÁA|Ûª\u0003~àâão7oz'Çãe\"-\u0018ö\u0089æïÔÏ´\u0093²,Ý2\u0017\u008c5\u0014²A;\u0002\u0016«b\u00ad\u0018O©]\u0018\u0012à¤\u001ah\u0081¤+\u0005\u0085\f\u0015C\u0092\u009e²\u0019\b¢y"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[26];
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

                  var6 = "\u00821lÒ\u0018\u0014dä\u009e¦\u0016Á¹ \u0004\u0013>\u0095\u0004[\u0002ç¦\u0084\u0085ëóò\u0097\u0088VÐ\u0018ÅúÁÂºåóË\u0001ë\u0010)=þüër\u0083Ñª\u00993\u0095¾";
                  var8 = "\u00821lÒ\u0018\u0014dä\u009e¦\u0016Á¹ \u0004\u0013>\u0095\u0004[\u0002ç¦\u0084\u0085ëóò\u0097\u0088VÐ\u0018ÅúÁÂºåóË\u0001ë\u0010)=þüër\u0083Ñª\u00993\u0095¾"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30983;
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
            throw new RuntimeException("aih", var10);
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
         throw new RuntimeException("aih" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
