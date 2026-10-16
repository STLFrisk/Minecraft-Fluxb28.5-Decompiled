import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class iq7 extends vr1 {
   private static final Logger esg;
   private final Minecraft j4b;
   private final h50 n4_;
   private boolean uv0;
   private boolean ofv;
   private o80 x2u;
   private long ue7 = 0L;
   public OpaquePredicate kf3 = null;
   public mew g06 = null;
   public css d2_ = null;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public iq7(Minecraft var1) {
      super(var1.snb(), new File(var1.glh, os4.getName()));
      this.j4b = var1;
      this.n4_ = null;
   }

   public iq7(Minecraft param1, String param2, String param3, h50 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic iq7.a J
      // 003: ldc2_w 116201412787140
      // 006: lxor
      // 007: lstore 5
      // 009: aload 0
      // 00a: new java/io/File
      // 00d: dup
      // 00e: aload 1
      // 00f: getfield Minecraft.glh Ljava/io/File;
      // 012: sipush 25178
      // 015: ldc2_w 8998091558178486575
      // 018: lload 5
      // 01a: lxor
      // 01b: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 024: aload 1
      // 025: invokevirtual Minecraft.snb ()Ljava/net/Proxy;
      // 028: new java/io/File
      // 02b: dup
      // 02c: aload 1
      // 02d: getfield Minecraft.glh Ljava/io/File;
      // 030: getstatic iq7.os4 Ljava/io/File;
      // 033: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 036: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 039: invokespecial vr1.<init> (Ljava/io/File;Ljava/net/Proxy;Ljava/io/File;)V
      // 03c: invokestatic OpaquePredicate.b ()I
      // 03f: aload 0
      // 040: lconst_0
      // 041: putfield iq7.ue7 J
      // 044: aload 0
      // 045: aconst_null
      // 046: putfield iq7.kf3 Lt9d;
      // 049: aload 0
      // 04a: aconst_null
      // 04b: putfield iq7.g06 Lmew;
      // 04e: aload 0
      // 04f: aconst_null
      // 050: putfield iq7.d2_ Lcss;
      // 053: istore 7
      // 055: aload 0
      // 056: aload 1
      // 057: invokevirtual Minecraft.ee0 ()Lrh0;
      // 05a: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 05d: invokevirtual iq7.xaa (Ljava/lang/String;)V
      // 060: aload 0
      // 061: aload 2
      // 062: invokevirtual iq7.xwt (Ljava/lang/String;)V
      // 065: aload 0
      // 066: aload 3
      // 067: invokevirtual iq7.oak (Ljava/lang/String;)V
      // 06a: aload 0
      // 06b: aload 1
      // 06c: invokevirtual Minecraft.y06 ()Z
      // 06f: invokevirtual iq7.v5f (Z)V
      // 072: aload 0
      // 073: aload 4
      // 075: iload 7
      // 077: ifeq 0b1
      // 07a: invokevirtual h50.r12 ()Z
      // 07d: invokevirtual iq7.xt5 (Z)V
      // 080: aload 0
      // 081: sipush 256
      // 084: invokevirtual iq7.jrb (I)V
      // 087: aload 0
      // 088: new _o9
      // 08b: dup
      // 08c: aload 0
      // 08d: invokespecial _o9.<init> (Liq7;)V
      // 090: invokevirtual iq7.eyb (Lwlx;)V
      // 093: aload 0
      // 094: aload 1
      // 095: putfield iq7.j4b Lc05;
      // 098: aload 0
      // 099: aload 0
      // 09a: invokevirtual iq7.bie ()Z
      // 09d: ifeq 0b4
      // 0a0: goto 0a7
      // 0a3: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: getstatic b7x.x9p Lh50;
      // 0aa: goto 0b1
      // 0ad: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: goto 0b6
      // 0b4: aload 4
      // 0b6: putfield iq7.n4_ Lh50;
      // 0b9: aload 0
      // 0ba: invokevirtual iq7.k9p ()Ll6n;
      // 0bd: aload 2
      // 0be: bipush 0
      // 0bf: invokeinterface l6n.zjk (Ljava/lang/String;Z)Lhe6; 3
      // 0c4: astore 8
      // 0c6: aload 8
      // 0c8: invokeinterface he6.jhs ()Lcog; 1
      // 0cd: astore 9
      // 0cf: aload 9
      // 0d1: iload 7
      // 0d3: ifeq 0e2
      // 0d6: ifnull 148
      // 0d9: goto 0e0
      // 0dc: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: aload 9
      // 0e2: invokevirtual cog._1l ()Lbdo;
      // 0e5: astore 10
      // 0e7: aload 10
      // 0e9: iload 7
      // 0eb: ifeq 0fa
      // 0ee: ifnull 148
      // 0f1: goto 0f8
      // 0f4: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 10
      // 0fa: sipush 13742
      // 0fd: ldc2_w 1577393146013429460
      // 100: lload 5
      // 102: lxor
      // 103: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: nop
      // 109: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 10c: iload 7
      // 10e: ifeq 136
      // 111: ifeq 148
      // 114: goto 11b
      // 117: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: aload 10
      // 11d: sipush 29645
      // 120: ldc2_w 6932640544679979198
      // 123: lload 5
      // 125: lxor
      // 126: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: nop
      // 12c: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 12f: goto 136
      // 132: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: istore 11
      // 138: iload 11
      // 13a: putstatic et9.fpm I
      // 13d: aload 0
      // 13e: getfield iq7.j4b Lc05;
      // 141: getfield Minecraft.h8m Lc2o;
      // 144: bipush -1
      // 145: invokevirtual c2o.e2w (I)V
      // 148: return
   }

   @Override
   public o2s zrs() {
      return new mzo();
   }

   @Override
   public void bh3(String param1, String param2, long param3, gxq param5, String param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 7
      // 005: aload 0
      // 006: aload 1
      // 007: invokevirtual iq7.jyn (Ljava/lang/String;)V
      // 00a: getstatic net/optifine/reflect/Reflector.DimensionManager Lnet/optifine/reflect/ReflectorClass;
      // 00d: invokevirtual net/optifine/reflect/ReflectorClass.exists ()Z
      // 010: istore 8
      // 012: iload 7
      // 014: ifne 032
      // 017: iload 8
      // 019: ifne 041
      // 01c: goto 023
      // 01f: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 0
      // 024: bipush 3
      // 025: anewarray 215
      // 028: putfield iq7.p_y [Ldug;
      // 02b: goto 032
      // 02e: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 0
      // 033: aload 0
      // 034: getfield iq7.p_y [Ldug;
      // 037: arraylength
      // 038: bipush 100
      // 03a: multianewarray 221 2
      // 03e: putfield iq7.r_n [[J
      // 041: aload 0
      // 042: invokevirtual iq7.k9p ()Ll6n;
      // 045: aload 1
      // 046: bipush 1
      // 047: invokeinterface l6n.zjk (Ljava/lang/String;Z)Lhe6; 3
      // 04c: astore 9
      // 04e: aload 0
      // 04f: aload 0
      // 050: invokevirtual iq7.agg ()Ljava/lang/String;
      // 053: aload 9
      // 055: invokevirtual iq7.wn1 (Ljava/lang/String;Lhe6;)V
      // 058: aload 9
      // 05a: invokeinterface he6.jhs ()Lcog; 1
      // 05f: astore 10
      // 061: aload 10
      // 063: iload 7
      // 065: ifne 08e
      // 068: ifnonnull 085
      // 06b: goto 072
      // 06e: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: new cog
      // 075: dup
      // 076: aload 0
      // 077: getfield iq7.n4_ Lh50;
      // 07a: aload 2
      // 07b: invokespecial cog.<init> (Lh50;Ljava/lang/String;)V
      // 07e: astore 10
      // 080: iload 7
      // 082: ifeq 092
      // 085: aload 10
      // 087: goto 08e
      // 08a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 2
      // 08f: invokevirtual cog._ek (Ljava/lang/String;)V
      // 092: iload 8
      // 094: iload 7
      // 096: ifne 209
      // 099: ifeq 201
      // 09c: goto 0a3
      // 09f: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: invokevirtual iq7.bie ()Z
      // 0a7: ifeq 0cf
      // 0aa: goto 0b1
      // 0ad: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: new b7x
      // 0b4: dup
      // 0b5: aload 0
      // 0b6: aload 9
      // 0b8: aload 10
      // 0ba: bipush 0
      // 0bb: aload 0
      // 0bc: getfield iq7.gi7 Luan;
      // 0bf: invokespecial b7x.<init> (Lvr1;Lhe6;Lcog;ILuan;)V
      // 0c2: invokevirtual b7x.ufh ()Lt9d;
      // 0c5: checkcast dug
      // 0c8: goto 0e6
      // 0cb: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: new dug
      // 0d2: dup
      // 0d3: aload 0
      // 0d4: aload 9
      // 0d6: aload 10
      // 0d8: bipush 0
      // 0d9: aload 0
      // 0da: getfield iq7.gi7 Luan;
      // 0dd: invokespecial dug.<init> (Lvr1;Lhe6;Lcog;ILuan;)V
      // 0e0: invokevirtual dug.ufh ()Lt9d;
      // 0e3: checkcast dug
      // 0e6: astore 11
      // 0e8: aload 11
      // 0ea: aload 0
      // 0eb: getfield iq7.n4_ Lh50;
      // 0ee: invokevirtual dug._kk (Lh50;)V
      // 0f1: getstatic net/optifine/reflect/Reflector.DimensionManager_getStaticDimensionIDs Lnet/optifine/reflect/ReflectorMethod;
      // 0f4: bipush 0
      // 0f5: anewarray 260
      // 0f8: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0fb: checkcast [Ljava/lang/Integer;
      // 0fe: checkcast [Ljava/lang/Integer;
      // 101: checkcast [Ljava/lang/Integer;
      // 104: astore 12
      // 106: aload 12
      // 108: astore 13
      // 10a: aload 12
      // 10c: arraylength
      // 10d: istore 14
      // 10f: bipush 0
      // 110: istore 15
      // 112: iload 15
      // 114: iload 14
      // 116: if_icmpge 1c0
      // 119: aload 13
      // 11b: iload 15
      // 11d: aaload
      // 11e: invokevirtual java/lang/Integer.intValue ()I
      // 121: istore 16
      // 123: iload 7
      // 125: ifne 1dc
      // 128: iload 16
      // 12a: ifne 13d
      // 12d: goto 134
      // 130: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: aload 11
      // 136: goto 155
      // 139: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: new zvc
      // 140: dup
      // 141: aload 0
      // 142: aload 9
      // 144: iload 16
      // 146: aload 11
      // 148: aload 0
      // 149: getfield iq7.gi7 Luan;
      // 14c: invokespecial zvc.<init> (Lvr1;Lhe6;ILdug;Luan;)V
      // 14f: invokevirtual zvc.ufh ()Lt9d;
      // 152: checkcast dug
      // 155: astore 17
      // 157: aload 17
      // 159: new xa6
      // 15c: dup
      // 15d: aload 0
      // 15e: aload 17
      // 160: invokespecial xa6.<init> (Lvr1;Ldug;)V
      // 163: invokevirtual dug.wox (Lu60;)V
      // 166: aload 0
      // 167: invokevirtual iq7.a59 ()Z
      // 16a: iload 7
      // 16c: ifne 192
      // 16f: ifne 18c
      // 172: goto 179
      // 175: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: aload 17
      // 17b: invokevirtual dug.r7d ()Lcog;
      // 17e: aload 0
      // 17f: invokevirtual iq7._r_ ()Lh50$f05;
      // 182: invokevirtual cog.vg1 (Lh50$f05;)V
      // 185: goto 18c
      // 188: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: getstatic net/optifine/reflect/Reflector.EventBus Lnet/optifine/reflect/ReflectorClass;
      // 18f: invokevirtual net/optifine/reflect/ReflectorClass.exists ()Z
      // 192: iload 7
      // 194: ifne 1b7
      // 197: ifeq 1b8
      // 19a: goto 1a1
      // 19d: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: getstatic net/optifine/reflect/Reflector.WorldEvent_Load_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 1a4: bipush 1
      // 1a5: anewarray 260
      // 1a8: dup
      // 1a9: bipush 0
      // 1aa: aload 17
      // 1ac: aastore
      // 1ad: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Z
      // 1b0: goto 1b7
      // 1b3: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: pop
      // 1b8: iinc 15 1
      // 1bb: iload 7
      // 1bd: ifeq 112
      // 1c0: aload 0
      // 1c1: iload 7
      // 1c3: ifne 1ef
      // 1c6: invokevirtual iq7.wh3 ()Lwlx;
      // 1c9: bipush 1
      // 1ca: anewarray 215
      // 1cd: dup
      // 1ce: bipush 0
      // 1cf: aload 11
      // 1d1: aastore
      // 1d2: invokevirtual wlx.yf0 ([Ldug;)V
      // 1d5: goto 1dc
      // 1d8: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1db: athrow
      // 1dc: aload 11
      // 1de: invokevirtual dug.r7d ()Lcog;
      // 1e1: invokevirtual cog.uah ()Lv66;
      // 1e4: ifnonnull 1fc
      // 1e7: aload 0
      // 1e8: goto 1ef
      // 1eb: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: aload 0
      // 1f0: getfield iq7.j4b Lc05;
      // 1f3: getfield Minecraft.oxn Lmoh;
      // 1f6: getfield moh.t6c Lv66;
      // 1f9: invokevirtual iq7.ki2 (Lv66;)V
      // 1fc: iload 7
      // 1fe: ifeq 363
      // 201: bipush 0
      // 202: goto 209
      // 205: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 208: athrow
      // 209: istore 11
      // 20b: iload 11
      // 20d: aload 0
      // 20e: getfield iq7.p_y [Ldug;
      // 211: arraylength
      // 212: if_icmpge 328
      // 215: bipush 0
      // 216: istore 12
      // 218: iload 7
      // 21a: ifne 333
      // 21d: iload 11
      // 21f: bipush 1
      // 220: iload 7
      // 222: ifne 248
      // 225: goto 22c
      // 228: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: if_icmpne 239
      // 22f: goto 236
      // 232: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 235: athrow
      // 236: bipush -1
      // 237: istore 12
      // 239: iload 11
      // 23b: iload 7
      // 23d: ifne 250
      // 240: bipush 2
      // 241: goto 248
      // 244: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: if_icmpne 24e
      // 24b: bipush 1
      // 24c: istore 12
      // 24e: iload 11
      // 250: iload 7
      // 252: ifne 276
      // 255: ifne 2dd
      // 258: goto 25f
      // 25b: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25e: athrow
      // 25f: aload 0
      // 260: iload 7
      // 262: ifne 2ac
      // 265: goto 26c
      // 268: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26b: athrow
      // 26c: invokevirtual iq7.bie ()Z
      // 26f: goto 276
      // 272: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 275: athrow
      // 276: ifeq 2a4
      // 279: aload 0
      // 27a: getfield iq7.p_y [Ldug;
      // 27d: iload 11
      // 27f: new b7x
      // 282: dup
      // 283: aload 0
      // 284: aload 9
      // 286: aload 10
      // 288: iload 12
      // 28a: aload 0
      // 28b: getfield iq7.gi7 Luan;
      // 28e: invokespecial b7x.<init> (Lvr1;Lhe6;Lcog;ILuan;)V
      // 291: invokevirtual b7x.ufh ()Lt9d;
      // 294: checkcast dug
      // 297: aastore
      // 298: iload 7
      // 29a: ifeq 2ca
      // 29d: goto 2a4
      // 2a0: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: goto 2ac
      // 2a8: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ab: athrow
      // 2ac: getfield iq7.p_y [Ldug;
      // 2af: iload 11
      // 2b1: new dug
      // 2b4: dup
      // 2b5: aload 0
      // 2b6: aload 9
      // 2b8: aload 10
      // 2ba: iload 12
      // 2bc: aload 0
      // 2bd: getfield iq7.gi7 Luan;
      // 2c0: invokespecial dug.<init> (Lvr1;Lhe6;Lcog;ILuan;)V
      // 2c3: invokevirtual dug.ufh ()Lt9d;
      // 2c6: checkcast dug
      // 2c9: aastore
      // 2ca: aload 0
      // 2cb: getfield iq7.p_y [Ldug;
      // 2ce: iload 11
      // 2d0: aaload
      // 2d1: aload 0
      // 2d2: getfield iq7.n4_ Lh50;
      // 2d5: invokevirtual dug._kk (Lh50;)V
      // 2d8: iload 7
      // 2da: ifeq 307
      // 2dd: aload 0
      // 2de: getfield iq7.p_y [Ldug;
      // 2e1: iload 11
      // 2e3: new zvc
      // 2e6: dup
      // 2e7: aload 0
      // 2e8: aload 9
      // 2ea: iload 12
      // 2ec: aload 0
      // 2ed: getfield iq7.p_y [Ldug;
      // 2f0: bipush 0
      // 2f1: aaload
      // 2f2: aload 0
      // 2f3: getfield iq7.gi7 Luan;
      // 2f6: invokespecial zvc.<init> (Lvr1;Lhe6;ILdug;Luan;)V
      // 2f9: invokevirtual zvc.ufh ()Lt9d;
      // 2fc: checkcast dug
      // 2ff: aastore
      // 300: goto 307
      // 303: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 306: athrow
      // 307: aload 0
      // 308: getfield iq7.p_y [Ldug;
      // 30b: iload 11
      // 30d: aaload
      // 30e: new xa6
      // 311: dup
      // 312: aload 0
      // 313: aload 0
      // 314: getfield iq7.p_y [Ldug;
      // 317: iload 11
      // 319: aaload
      // 31a: invokespecial xa6.<init> (Lvr1;Ldug;)V
      // 31d: invokevirtual dug.wox (Lu60;)V
      // 320: iinc 11 1
      // 323: iload 7
      // 325: ifeq 20b
      // 328: aload 0
      // 329: invokevirtual iq7.wh3 ()Lwlx;
      // 32c: aload 0
      // 32d: getfield iq7.p_y [Ldug;
      // 330: invokevirtual wlx.yf0 ([Ldug;)V
      // 333: aload 0
      // 334: iload 7
      // 336: ifne 364
      // 339: getfield iq7.p_y [Ldug;
      // 33c: bipush 0
      // 33d: aaload
      // 33e: invokevirtual dug.r7d ()Lcog;
      // 341: invokevirtual cog.uah ()Lv66;
      // 344: ifnonnull 363
      // 347: goto 34e
      // 34a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34d: athrow
      // 34e: aload 0
      // 34f: aload 0
      // 350: getfield iq7.j4b Lc05;
      // 353: getfield Minecraft.oxn Lmoh;
      // 356: getfield moh.t6c Lv66;
      // 359: invokevirtual iq7.ki2 (Lv66;)V
      // 35c: goto 363
      // 35f: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 362: athrow
      // 363: aload 0
      // 364: invokevirtual iq7.y_c ()V
      // 367: return
   }

   @Override
   public boolean pcq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic iq7.a J
      // 003: ldc2_w 126470630264271
      // 006: lxor
      // 007: lstore 1
      // 008: getstatic iq7.esg Lorg/apache/logging/log4j/Logger;
      // 00b: sipush 10837
      // 00e: ldc2_w 8250346598971737898
      // 011: lload 1
      // 012: lxor
      // 013: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018: nop
      // 019: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 01e: invokestatic OpaquePredicate.c ()I
      // 021: aload 0
      // 022: bipush 1
      // 023: invokevirtual iq7.j2j (Z)V
      // 026: istore 3
      // 027: aload 0
      // 028: bipush 1
      // 029: invokevirtual iq7.kcs (Z)V
      // 02c: aload 0
      // 02d: bipush 1
      // 02e: invokevirtual iq7.da0 (Z)V
      // 031: aload 0
      // 032: bipush 1
      // 033: invokevirtual iq7.h_f (Z)V
      // 036: aload 0
      // 037: bipush 1
      // 038: invokevirtual iq7.vt_ (Z)V
      // 03b: getstatic iq7.esg Lorg/apache/logging/log4j/Logger;
      // 03e: sipush 32390
      // 041: ldc2_w 2632458593576244210
      // 044: lload 1
      // 045: lxor
      // 046: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: nop
      // 04c: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 051: aload 0
      // 052: invokestatic vk8.o3h ()Ljava/security/KeyPair;
      // 055: invokevirtual iq7.bwg (Ljava/security/KeyPair;)V
      // 058: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_handleServerAboutToStart Lnet/optifine/reflect/ReflectorMethod;
      // 05b: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 05e: iload 3
      // 05f: ifne 0f8
      // 062: ifeq 09c
      // 065: goto 06c
      // 068: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b: athrow
      // 06c: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_instance Lnet/optifine/reflect/ReflectorMethod;
      // 06f: bipush 0
      // 070: anewarray 260
      // 073: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 076: astore 4
      // 078: aload 4
      // 07a: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_handleServerAboutToStart Lnet/optifine/reflect/ReflectorMethod;
      // 07d: bipush 1
      // 07e: anewarray 260
      // 081: dup
      // 082: bipush 0
      // 083: aload 0
      // 084: aastore
      // 085: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 088: iload 3
      // 089: ifne 0f8
      // 08c: ifne 09c
      // 08f: goto 096
      // 092: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: bipush 0
      // 097: ireturn
      // 098: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 0
      // 09d: aload 0
      // 09e: invokevirtual iq7.agg ()Ljava/lang/String;
      // 0a1: aload 0
      // 0a2: invokevirtual iq7.v85 ()Ljava/lang/String;
      // 0a5: aload 0
      // 0a6: getfield iq7.n4_ Lh50;
      // 0a9: invokevirtual h50.cjv ()J
      // 0ac: aload 0
      // 0ad: getfield iq7.n4_ Lh50;
      // 0b0: invokevirtual h50.g2_ ()Lgxq;
      // 0b3: aload 0
      // 0b4: getfield iq7.n4_ Lh50;
      // 0b7: invokevirtual h50.i4v ()Ljava/lang/String;
      // 0ba: invokevirtual iq7.bh3 (Ljava/lang/String;Ljava/lang/String;JLgxq;Ljava/lang/String;)V
      // 0bd: aload 0
      // 0be: new java/lang/StringBuilder
      // 0c1: dup
      // 0c2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c5: aload 0
      // 0c6: invokevirtual iq7.p4h ()Ljava/lang/String;
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: sipush 14817
      // 0cf: ldc2_w 4085391044565013652
      // 0d2: lload 1
      // 0d3: lxor
      // 0d4: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: aload 0
      // 0de: getfield iq7.p_y [Ldug;
      // 0e1: bipush 0
      // 0e2: aaload
      // 0e3: invokevirtual dug.r7d ()Lcog;
      // 0e6: invokevirtual cog.fln ()Ljava/lang/String;
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ef: invokevirtual iq7.by3 (Ljava/lang/String;)V
      // 0f2: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_handleServerStarting Lnet/optifine/reflect/ReflectorMethod;
      // 0f5: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0f8: iload 3
      // 0f9: ifne 14f
      // 0fc: ifeq 14e
      // 0ff: goto 106
      // 102: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_instance Lnet/optifine/reflect/ReflectorMethod;
      // 109: bipush 0
      // 10a: anewarray 260
      // 10d: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 110: astore 4
      // 112: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_handleServerStarting Lnet/optifine/reflect/ReflectorMethod;
      // 115: invokevirtual net/optifine/reflect/ReflectorMethod.getReturnType ()Ljava/lang/Class;
      // 118: iload 3
      // 119: ifne 140
      // 11c: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 11f: if_acmpne 13e
      // 122: goto 129
      // 125: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aload 4
      // 12b: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_handleServerStarting Lnet/optifine/reflect/ReflectorMethod;
      // 12e: bipush 1
      // 12f: anewarray 260
      // 132: dup
      // 133: bipush 0
      // 134: aload 0
      // 135: aastore
      // 136: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 139: ireturn
      // 13a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 4
      // 140: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_handleServerStarting Lnet/optifine/reflect/ReflectorMethod;
      // 143: bipush 1
      // 144: anewarray 260
      // 147: dup
      // 148: bipush 0
      // 149: aload 0
      // 14a: aastore
      // 14b: invokestatic net/optifine/reflect/Reflector.callVoid (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 14e: bipush 1
      // 14f: ireturn
   }

   @Override
   public void t2i() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic iq7.a J
      // 003: ldc2_w 110787787387844
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: invokespecial iq7.p9c ()V
      // 00c: invokestatic OpaquePredicate.b ()I
      // 00f: aload 0
      // 010: getfield iq7.uv0 Z
      // 013: istore 4
      // 015: istore 3
      // 016: aload 0
      // 017: invokestatic Minecraft.vz1 ()Lc05;
      // 01a: iload 3
      // 01b: ifeq 035
      // 01e: invokevirtual Minecraft.c02 ()Lp_k;
      // 021: ifnull 04a
      // 024: goto 02b
      // 027: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: invokestatic Minecraft.vz1 ()Lc05;
      // 02e: goto 035
      // 031: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: invokevirtual Minecraft.f03 ()Z
      // 038: iload 3
      // 039: ifeq 047
      // 03c: ifeq 04a
      // 03f: goto 046
      // 042: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: bipush 1
      // 047: goto 04b
      // 04a: bipush 0
      // 04b: putfield iq7.uv0 Z
      // 04e: iload 4
      // 050: iload 3
      // 051: ifeq 0a4
      // 054: ifne 0a0
      // 057: goto 05e
      // 05a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield iq7.uv0 Z
      // 062: iload 3
      // 063: ifeq 0a4
      // 066: goto 06d
      // 069: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: ifeq 0a0
      // 070: goto 077
      // 073: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: getstatic iq7.esg Lorg/apache/logging/log4j/Logger;
      // 07a: sipush 29549
      // 07d: ldc2_w 119908158986641430
      // 080: lload 1
      // 081: lxor
      // 082: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: nop
      // 088: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 08d: aload 0
      // 08e: invokevirtual iq7.wh3 ()Lwlx;
      // 091: invokevirtual wlx.b8x ()V
      // 094: aload 0
      // 095: bipush 0
      // 096: invokevirtual iq7.to7 (Z)V
      // 099: goto 0a0
      // 09c: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield iq7.uv0 Z
      // 0a4: iload 3
      // 0a5: ifeq 11a
      // 0a8: ifeq 0fa
      // 0ab: goto 0b2
      // 0ae: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield iq7.ob0 Ljava/util/Queue;
      // 0b6: dup
      // 0b7: astore 5
      // 0b9: monitorenter
      // 0ba: aload 0
      // 0bb: getfield iq7.ob0 Ljava/util/Queue;
      // 0be: invokeinterface java/util/Queue.isEmpty ()Z 1
      // 0c3: ifne 0e8
      // 0c6: aload 0
      // 0c7: getfield iq7.ob0 Ljava/util/Queue;
      // 0ca: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 0cf: checkcast java/util/concurrent/FutureTask
      // 0d2: getstatic iq7.esg Lorg/apache/logging/log4j/Logger;
      // 0d5: invokestatic gqf.sko (Ljava/util/concurrent/FutureTask;Lorg/apache/logging/log4j/Logger;)Ljava/lang/Object;
      // 0d8: pop
      // 0d9: iload 3
      // 0da: ifeq 0eb
      // 0dd: iload 3
      // 0de: ifne 0ba
      // 0e1: goto 0e8
      // 0e4: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 5
      // 0ea: monitorexit
      // 0eb: goto 0f6
      // 0ee: astore 6
      // 0f0: aload 5
      // 0f2: monitorexit
      // 0f3: aload 6
      // 0f5: athrow
      // 0f6: iload 3
      // 0f7: ifne 2a4
      // 0fa: aload 0
      // 0fb: invokespecial vr1.t2i ()V
      // 0fe: aload 0
      // 0ff: getfield iq7.j4b Lc05;
      // 102: iload 3
      // 103: ifeq 182
      // 106: goto 10d
      // 109: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: getfield Minecraft.oxn Lmoh;
      // 110: getfield moh.gcj I
      // 113: goto 11a
      // 116: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 0
      // 11b: invokevirtual iq7.wh3 ()Lwlx;
      // 11e: invokevirtual wlx.pci ()I
      // 121: if_icmpeq 173
      // 124: getstatic iq7.esg Lorg/apache/logging/log4j/Logger;
      // 127: sipush 14034
      // 12a: ldc2_w 2132301916123899296
      // 12d: lload 1
      // 12e: lxor
      // 12f: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: nop
      // 135: bipush 2
      // 136: anewarray 260
      // 139: dup
      // 13a: bipush 0
      // 13b: aload 0
      // 13c: getfield iq7.j4b Lc05;
      // 13f: getfield Minecraft.oxn Lmoh;
      // 142: getfield moh.gcj I
      // 145: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 148: aastore
      // 149: dup
      // 14a: bipush 1
      // 14b: aload 0
      // 14c: invokevirtual iq7.wh3 ()Lwlx;
      // 14f: invokevirtual wlx.pci ()I
      // 152: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 155: aastore
      // 156: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 15b: aload 0
      // 15c: invokevirtual iq7.wh3 ()Lwlx;
      // 15f: aload 0
      // 160: getfield iq7.j4b Lc05;
      // 163: getfield Minecraft.oxn Lmoh;
      // 166: getfield moh.gcj I
      // 169: invokevirtual wlx.b09 (I)V
      // 16c: goto 173
      // 16f: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: aload 0
      // 174: iload 3
      // 175: ifeq 190
      // 178: getfield iq7.j4b Lc05;
      // 17b: goto 182
      // 17e: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: getfield Minecraft.tij Lkh3;
      // 185: ifnull 2a4
      // 188: aload 0
      // 189: goto 190
      // 18c: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18f: athrow
      // 190: getfield iq7.p_y [Ldug;
      // 193: bipush 0
      // 194: aaload
      // 195: invokevirtual dug.r7d ()Lcog;
      // 198: astore 5
      // 19a: aload 0
      // 19b: getfield iq7.j4b Lc05;
      // 19e: getfield Minecraft.tij Lkh3;
      // 1a1: invokevirtual WorldClient.r7d ()Lcog;
      // 1a4: astore 6
      // 1a6: aload 5
      // 1a8: invokevirtual cog.iqv ()Z
      // 1ab: iload 3
      // 1ac: ifeq 222
      // 1af: ifne 216
      // 1b2: goto 1b9
      // 1b5: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: aload 6
      // 1bb: iload 3
      // 1bc: ifeq 21f
      // 1bf: goto 1c6
      // 1c2: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c5: athrow
      // 1c6: invokevirtual cog.uah ()Lv66;
      // 1c9: aload 5
      // 1cb: invokevirtual cog.uah ()Lv66;
      // 1ce: if_acmpeq 216
      // 1d1: goto 1d8
      // 1d4: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: getstatic iq7.esg Lorg/apache/logging/log4j/Logger;
      // 1db: sipush 5722
      // 1de: ldc2_w 8573881798740542765
      // 1e1: lload 1
      // 1e2: lxor
      // 1e3: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: nop
      // 1e9: bipush 2
      // 1ea: anewarray 260
      // 1ed: dup
      // 1ee: bipush 0
      // 1ef: aload 6
      // 1f1: invokevirtual cog.uah ()Lv66;
      // 1f4: aastore
      // 1f5: dup
      // 1f6: bipush 1
      // 1f7: aload 5
      // 1f9: invokevirtual cog.uah ()Lv66;
      // 1fc: aastore
      // 1fd: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 202: aload 0
      // 203: aload 6
      // 205: invokevirtual cog.uah ()Lv66;
      // 208: invokevirtual iq7.ki2 (Lv66;)V
      // 20b: iload 3
      // 20c: ifne 2a4
      // 20f: goto 216
      // 212: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 215: athrow
      // 216: aload 6
      // 218: goto 21f
      // 21b: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21e: athrow
      // 21f: invokevirtual cog.iqv ()Z
      // 222: iload 3
      // 223: ifeq 23c
      // 226: ifeq 2a4
      // 229: goto 230
      // 22c: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22f: athrow
      // 230: aload 5
      // 232: invokevirtual cog.iqv ()Z
      // 235: goto 23c
      // 238: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: ifne 2a4
      // 23f: getstatic iq7.esg Lorg/apache/logging/log4j/Logger;
      // 242: sipush 20610
      // 245: ldc2_w 3328029064944206836
      // 248: lload 1
      // 249: lxor
      // 24a: invokedynamic n (IJ)Ljava/lang/String; bsm=iq7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: nop
      // 250: bipush 1
      // 251: anewarray 260
      // 254: dup
      // 255: bipush 0
      // 256: aload 6
      // 258: invokevirtual cog.uah ()Lv66;
      // 25b: aastore
      // 25c: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 261: aload 0
      // 262: getfield iq7.p_y [Ldug;
      // 265: astore 7
      // 267: aload 7
      // 269: arraylength
      // 26a: istore 8
      // 26c: bipush 0
      // 26d: istore 9
      // 26f: iload 9
      // 271: iload 8
      // 273: if_icmpge 2a4
      // 276: aload 7
      // 278: iload 9
      // 27a: aaload
      // 27b: astore 10
      // 27d: iload 3
      // 27e: ifeq 2a0
      // 281: aload 10
      // 283: ifnull 29d
      // 286: goto 28d
      // 289: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28c: athrow
      // 28d: aload 10
      // 28f: invokevirtual dug.r7d ()Lcog;
      // 292: bipush 1
      // 293: invokevirtual cog.mik (Z)V
      // 296: goto 29d
      // 299: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29c: athrow
      // 29d: iinc 9 1
      // 2a0: iload 3
      // 2a1: ifne 26f
      // 2a4: return
   }

   @Override
   public boolean liw() {
      return false;
   }

   @Override
   public h50$f05 _r_() {
      return this.n4_.ec8();
   }

   @Override
   public v66 vf9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield iq7.j4b Lc05;
      // 08: getfield Minecraft.tij Lkh3;
      // 0b: iload 1
      // 0c: ifne 31
      // 0f: ifnonnull 2a
      // 12: goto 19
      // 15: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield iq7.j4b Lc05;
      // 1d: getfield Minecraft.oxn Lmoh;
      // 20: getfield moh.t6c Lv66;
      // 23: goto 37
      // 26: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield iq7.j4b Lc05;
      // 2e: getfield Minecraft.tij Lkh3;
      // 31: invokevirtual WorldClient.r7d ()Lcog;
      // 34: invokevirtual cog.uah ()Lv66;
      // 37: areturn
   }

   @Override
   public boolean u44() {
      return this.n4_.y9k();
   }

   @Override
   public boolean tvv() {
      return true;
   }

   @Override
   public boolean col() {
      return true;
   }

   @Override
   public void to7(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 1e
      // 09: ifeq 44
      // 0c: goto 13
      // 0f: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual iq7.g5u ()I
      // 17: goto 1e
      // 1a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: istore 3
      // 1f: aload 0
      // 20: getfield iq7.j4b Lc05;
      // 23: getfield Minecraft.oxn Lmoh;
      // 26: getfield moh.wsi I
      // 29: istore 4
      // 2b: iload 3
      // 2c: i2l
      // 2d: aload 0
      // 2e: getfield iq7.ue7 J
      // 31: iload 4
      // 33: i2l
      // 34: ladd
      // 35: lcmp
      // 36: ifge 3e
      // 39: return
      // 3a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: iload 3
      // 40: i2l
      // 41: putfield iq7.ue7 J
      // 44: aload 0
      // 45: iload 1
      // 46: invokespecial vr1.to7 (Z)V
      // 49: return
   }

   @Override
   public File x6_() {
      return this.j4b.glh;
   }

   @Override
   public boolean s5d() {
      return false;
   }

   @Override
   public boolean qbx() {
      return false;
   }

   @Override
   public void d6z(e1i var1) {
      this.j4b.vut(var1);
   }

   @Override
   public e1i ckd(e1i var1) {
      long var2 = a ^ 87033105992300L;
      var1 = super.ckd(var1);
      var1.y0t().h1o(b<"n">(17227, 2718418713780316571L ^ var2), new iq7$1(this));
      var1.y0t().h1o(b<"n">(24425, 4636632507847701937L ^ var2), new iq7$2(this));
      return var1;
   }

   @Override
   public void ki2(v66 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial vr1.ki2 (Lv66;)V
      // 09: aload 0
      // 0a: getfield iq7.j4b Lc05;
      // 0d: getfield Minecraft.tij Lkh3;
      // 10: iload 2
      // 11: ifeq 2c
      // 14: ifnull 33
      // 17: goto 1e
      // 1a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield iq7.j4b Lc05;
      // 22: getfield Minecraft.tij Lkh3;
      // 25: goto 2c
      // 28: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: invokevirtual WorldClient.r7d ()Lcog;
      // 2f: aload 1
      // 30: invokevirtual cog.jbe (Lv66;)V
      // 33: return
   }

   @Override
   public void o2l(ekz var1) {
      long var2 = a ^ 134595576437540L;
      super.o2l(var1);
      var1.vgd(b<"n">(2076, 3867027530283512717L ^ var2), this.j4b.e2z().imb());
   }

   @Override
   public boolean i6i() {
      return Minecraft.vz1().i6i();
   }

   @Override
   public String mb5(h50$f05 var1, boolean var2) {
      long var3 = a ^ 48295839115444L;
      int var5 = OpaquePredicate.b();

      try {
         int var6 = -1;

         try {
            var6 = crb.rtp();
         } catch (IOException var8) {
         }

         label31: {
            int var10000;
            label30: {
               try {
                  var10000 = var6;
                  if (var5 == 0) {
                     break label30;
                  }

                  if (var6 > 0) {
                     break label31;
                  }
               } catch (IOException var9) {
                  throw a(var9);
               }

               var10000 = 25564;
            }

            var6 = var10000;
         }

         this._ky().vzp((InetAddress)null, var6);
         esg.info(b<"n">(21264, 1883822647493630745L ^ var3) + var6);
         this.ofv = true;
         this.x2u = new o80(this._gp(), var6 + "");
         this.x2u.start();
         this.wh3().zg6(var1);
         this.wh3().ruw(var2);
         return var6 + "";
      } catch (IOException var10) {
         return null;
      }
   }

   @Override
   public void b84() {
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
      // 05: invokespecial vr1.b84 ()V
      // 08: aload 0
      // 09: getfield iq7.x2u Lo80;
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: ifnull 2d
      // 13: goto 1a
      // 16: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield iq7.x2u Lo80;
      // 1e: goto 25
      // 21: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: invokevirtual o80.interrupt ()V
      // 28: aload 0
      // 29: aconst_null
      // 2a: putfield iq7.x2u Lo80;
      // 2d: return
   }

   @Override
   public void eqw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic net/optifine/reflect/Reflector.MinecraftForge Lnet/optifine/reflect/ReflectorClass;
      // 07: iload 1
      // 08: ifeq 47
      // 0b: invokevirtual net/optifine/reflect/ReflectorClass.exists ()Z
      // 0e: ifeq 31
      // 11: goto 18
      // 14: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: iload 1
      // 1a: ifeq 4d
      // 1d: goto 24
      // 20: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: invokevirtual iq7.vfx ()Z
      // 27: ifeq 48
      // 2a: goto 31
      // 2d: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: new iq7$3
      // 35: dup
      // 36: aload 0
      // 37: invokespecial iq7$3.<init> (Liq7;)V
      // 3a: invokevirtual iq7.acd (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 3d: invokestatic com/google/common/util/concurrent/Futures.getUnchecked (Ljava/util/concurrent/Future;)Ljava/lang/Object;
      // 40: goto 47
      // 43: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: pop
      // 48: aload 0
      // 49: invokespecial vr1.eqw ()V
      // 4c: aload 0
      // 4d: getfield iq7.x2u Lo80;
      // 50: iload 1
      // 51: ifeq 69
      // 54: ifnull 71
      // 57: goto 5e
      // 5a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield iq7.x2u Lo80;
      // 62: goto 69
      // 65: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: invokevirtual o80.interrupt ()V
      // 6c: aload 0
      // 6d: aconst_null
      // 6e: putfield iq7.x2u Lo80;
      // 71: return
   }

   public void _r9() {
      this.i96();
   }

   public boolean d3e() {
      return this.ofv;
   }

   @Override
   public void nd0(h50$f05 var1) {
      this.wh3().zg6(var1);
   }

   @Override
   public boolean gd2() {
      return true;
   }

   @Override
   public int v9t() {
      return 4;
   }

   private void p9c() {
      int var1 = OpaquePredicate.c();

      for (dug var3 : Arrays.asList(this.p_y)) {
         this.ped(var3);
         if (var1 != 0) {
            break;
         }
      }
   }

   public css wm9(OpaquePredicate var1, mew var2) {
      this.kf3 = var1;
      this.g06 = var2;
      return this.d2_;
   }

   private void ped(dug param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: invokestatic hxt.w4e ()Z
      // 07: iload 2
      // 08: ifeq 24
      // 0b: ifne 21
      // 0e: goto 15
      // 11: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: invokespecial iq7.ryc (Ldug;)V
      // 1a: goto 21
      // 1d: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokestatic hxt.pay ()Z
      // 24: iload 2
      // 25: ifeq 41
      // 28: ifne 3e
      // 2b: goto 32
      // 2e: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: aload 1
      // 34: invokespecial iq7.mgf (Ldug;)V
      // 37: goto 3e
      // 3a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: getstatic hxt.as6 Z
      // 41: iload 2
      // 42: ifeq 50
      // 45: ifeq 5a
      // 48: goto 4f
      // 4b: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 0
      // 50: putstatic hxt.as6 Z
      // 53: invokestatic hxt.d9p ()Lmoh;
      // 56: aload 1
      // 57: invokestatic net/optifine/ClearWater.updateWaterOpacity (Lmoh;Lt9d;)V
      // 5a: aload 0
      // 5b: iload 2
      // 5c: ifeq 75
      // 5f: getfield iq7.kf3 Lt9d;
      // 62: aload 1
      // 63: if_acmpne a3
      // 66: goto 6d
      // 69: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 0
      // 6e: goto 75
      // 71: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: iload 2
      // 76: ifeq 9f
      // 79: getfield iq7.g06 Lmew;
      // 7c: ifnull a3
      // 7f: goto 86
      // 82: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 0
      // 87: aload 1
      // 88: aload 0
      // 89: getfield iq7.g06 Lmew;
      // 8c: invokevirtual dug.sms (Lmew;)Lcss;
      // 8f: putfield iq7.d2_ Lcss;
      // 92: aload 0
      // 93: aconst_null
      // 94: putfield iq7.kf3 Lt9d;
      // 97: aload 0
      // 98: goto 9f
      // 9b: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: aconst_null
      // a0: putfield iq7.g06 Lmew;
      // a3: return
   }

   private void mgf(dug param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual dug.r7d ()Lcog;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 50
      // 0e: invokevirtual cog.nys ()Z
      // 11: ifne 34
      // 14: goto 1b
      // 17: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifne 50
      // 20: goto 27
      // 23: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: invokevirtual cog.h9q ()Z
      // 2a: ifeq 8b
      // 2d: goto 34
      // 30: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 3
      // 35: bipush 0
      // 36: invokevirtual cog.o_f (I)V
      // 39: aload 3
      // 3a: bipush 0
      // 3b: invokevirtual cog.do3 (Z)V
      // 3e: aload 1
      // 3f: fconst_0
      // 40: invokevirtual dug.cbc (F)V
      // 43: aload 3
      // 44: bipush 0
      // 45: invokevirtual cog.zsa (I)V
      // 48: aload 3
      // 49: goto 50
      // 4c: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: bipush 0
      // 51: invokevirtual cog.kcj (Z)V
      // 54: aload 1
      // 55: fconst_0
      // 56: invokevirtual dug.wmg (F)V
      // 59: aload 0
      // 5a: invokevirtual iq7.wh3 ()Lwlx;
      // 5d: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 60: dup
      // 61: bipush 2
      // 62: fconst_0
      // 63: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 66: invokevirtual wlx.v3l (Lmz2;)V
      // 69: aload 0
      // 6a: invokevirtual iq7.wh3 ()Lwlx;
      // 6d: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 70: dup
      // 71: bipush 7
      // 73: fconst_0
      // 74: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 77: invokevirtual wlx.v3l (Lmz2;)V
      // 7a: aload 0
      // 7b: invokevirtual iq7.wh3 ()Lwlx;
      // 7e: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 81: dup
      // 82: bipush 8
      // 84: fconst_0
      // 85: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 88: invokevirtual wlx.v3l (Lmz2;)V
      // 8b: return
   }

   private void ryc(dug param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual dug.r7d ()Lcog;
      // 08: astore 3
      // 09: aload 3
      // 0a: invokevirtual cog.pcx ()Lh50$f05;
      // 0d: invokevirtual h50$f05.xzh ()I
      // 10: bipush 1
      // 11: if_icmpne eb
      // 14: aload 1
      // 15: invokevirtual dug.bq8 ()J
      // 18: lstore 4
      // 1a: lload 4
      // 1c: ldc2_w 24000
      // 1f: lrem
      // 20: lstore 6
      // 22: invokestatic hxt.c_7 ()Z
      // 25: iload 2
      // 26: ifne 8d
      // 29: ifeq 8a
      // 2c: goto 33
      // 2f: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: lload 6
      // 35: ldc2_w 1000
      // 38: lcmp
      // 39: iload 2
      // 3a: ifne 68
      // 3d: goto 44
      // 40: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: ifgt 62
      // 47: goto 4e
      // 4a: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 1
      // 4f: lload 4
      // 51: lload 6
      // 53: lsub
      // 54: ldc2_w 1001
      // 57: ladd
      // 58: invokevirtual dug.p7c (J)V
      // 5b: goto 62
      // 5e: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: lload 6
      // 64: ldc2_w 11000
      // 67: lcmp
      // 68: iload 2
      // 69: ifne 8d
      // 6c: iflt 8a
      // 6f: goto 76
      // 72: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: aload 1
      // 77: lload 4
      // 79: lload 6
      // 7b: lsub
      // 7c: ldc2_w 24001
      // 7f: ladd
      // 80: invokevirtual dug.p7c (J)V
      // 83: goto 8a
      // 86: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: invokestatic hxt.m4q ()Z
      // 8d: iload 2
      // 8e: ifne a8
      // 91: ifeq eb
      // 94: goto 9b
      // 97: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a: athrow
      // 9b: lload 6
      // 9d: ldc2_w 14000
      // a0: lcmp
      // a1: goto a8
      // a4: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7: athrow
      // a8: iload 2
      // a9: ifne d0
      // ac: ifgt ca
      // af: goto b6
      // b2: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: athrow
      // b6: aload 1
      // b7: lload 4
      // b9: lload 6
      // bb: lsub
      // bc: ldc2_w 14001
      // bf: ladd
      // c0: invokevirtual dug.p7c (J)V
      // c3: goto ca
      // c6: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: lload 6
      // cc: ldc2_w 22000
      // cf: lcmp
      // d0: iflt eb
      // d3: aload 1
      // d4: lload 4
      // d6: lload 6
      // d8: lsub
      // d9: ldc2_w 24000
      // dc: ladd
      // dd: ldc2_w 14001
      // e0: ladd
      // e1: invokevirtual dug.p7c (J)V
      // e4: goto eb
      // e7: invokestatic iq7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ea: athrow
      // eb: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3790515423273072727L, -6229111549553790726L, MethodHandles.lookup().lookupClass()).a(155340370790008L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4117145620796L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "W8ÅçæÇ+øUp7\u0016\u00031t~3G°\\Æ\b\u0082\u000e\u0089?æg\u0015\u0089®º¶ÍÖj\u0007«í³7\u001c\u0088çì}8 /Äa\u001f½\u0087!s\r\u00193Ö\u0014É\u000e \f¢\u0097ääO7\\\u0018d\u0095E\u001d&J²ßªûpb&|\fâ¤éúº\u009c«\u0094M\u0018\u001eWÀÅ\u001b8\u00adyÍ\u0080\\Ñ#ÇñÎï+\u0006\u009f5QYµ 3\u009b9\u0081\"Ï%J\bÊ÷\u0095IRgÊF\u0089Èåa¡\u001a\f\u001c¬ýÏ\u0017\u0080Ø×0\u0014\u0087²+\u00adÂ.mø\u0082£¸\u0000\u0084³¯n_¥þQ\u0000}\u0097h\u000b£id³¯ø¥\u000fVÀMó\u0099\u0097a/Y\u008b¨d\u0001Æ@\u0092bÑÈ[ý»x\u0086âÑ\u001bì\u001b¾ª&ÉczmL\u0019\u001e±Þ\u0089f\u001bòUâ@\u0082\u001dàÞbWR\u0012Ö}4ÀÉ\u001ba¹'\u0095ªësNp0&\u0096ýÂ¼Åk`\u00128ííA\u0084Û¹*\u0011%9Ê¹\u0092SâÃ:ó\u009f\u001cò\t\u0083\u000e°¸ê]ý\u0003 \f\u009d\t\u0011\u001e@«¯^¬8B\r´\u0004\"Î\u007fÅG¸6ú\u008d\u0001\bb¿Ê£ñmD\u0014Ç\u0016\u000e,\u0084\u0013\u0088U$\u0006Áh\u0094*\u0085ç)©\u0018EbÛj\u0095(òªô1\u0010f¼Ä\u0005ðo\u009fuðëã¤FÚ¨. ÜÐw-%iÉ\u0004A6¬h¤S\u0015 º\u0011å\u0099\u000e¤\u0006\u0006\u0084L\u0007¾ZWÒ+8ó\u0012\u009de¼o¥Lx<\u00adF8a®/\u009a\u008as\u001c\u000eU_Éö@4¶\u0010¨ø\n\u009eÿúÁ\u009b¦\u0087xi>\u0096\u0012\u0094Ðøo)Ñ\u0088\u0086\u0087ºk¦\u0010V\u000fú®\u0003\\\u0087%¾Æ@\u001cw\tqç \u0002ý\u0088Ìd\u0003Çµ\u0085°oâÕ¸3`°KZjÇ$w|³Ä·¨R®\u008di";
      int var8 = "W8ÅçæÇ+øUp7\u0016\u00031t~3G°\\Æ\b\u0082\u000e\u0089?æg\u0015\u0089®º¶ÍÖj\u0007«í³7\u001c\u0088çì}8 /Äa\u001f½\u0087!s\r\u00193Ö\u0014É\u000e \f¢\u0097ääO7\\\u0018d\u0095E\u001d&J²ßªûpb&|\fâ¤éúº\u009c«\u0094M\u0018\u001eWÀÅ\u001b8\u00adyÍ\u0080\\Ñ#ÇñÎï+\u0006\u009f5QYµ 3\u009b9\u0081\"Ï%J\bÊ÷\u0095IRgÊF\u0089Èåa¡\u001a\f\u001c¬ýÏ\u0017\u0080Ø×0\u0014\u0087²+\u00adÂ.mø\u0082£¸\u0000\u0084³¯n_¥þQ\u0000}\u0097h\u000b£id³¯ø¥\u000fVÀMó\u0099\u0097a/Y\u008b¨d\u0001Æ@\u0092bÑÈ[ý»x\u0086âÑ\u001bì\u001b¾ª&ÉczmL\u0019\u001e±Þ\u0089f\u001bòUâ@\u0082\u001dàÞbWR\u0012Ö}4ÀÉ\u001ba¹'\u0095ªësNp0&\u0096ýÂ¼Åk`\u00128ííA\u0084Û¹*\u0011%9Ê¹\u0092SâÃ:ó\u009f\u001cò\t\u0083\u000e°¸ê]ý\u0003 \f\u009d\t\u0011\u001e@«¯^¬8B\r´\u0004\"Î\u007fÅG¸6ú\u008d\u0001\bb¿Ê£ñmD\u0014Ç\u0016\u000e,\u0084\u0013\u0088U$\u0006Áh\u0094*\u0085ç)©\u0018EbÛj\u0095(òªô1\u0010f¼Ä\u0005ðo\u009fuðëã¤FÚ¨. ÜÐw-%iÉ\u0004A6¬h¤S\u0015 º\u0011å\u0099\u000e¤\u0006\u0006\u0084L\u0007¾ZWÒ+8ó\u0012\u009de¼o¥Lx<\u00adF8a®/\u009a\u008as\u001c\u000eU_Éö@4¶\u0010¨ø\n\u009eÿúÁ\u009b¦\u0087xi>\u0096\u0012\u0094Ðøo)Ñ\u0088\u0086\u0087ºk¦\u0010V\u000fú®\u0003\\\u0087%¾Æ@\u001cw\tqç \u0002ý\u0088Ìd\u0003Çµ\u0085°oâÕ¸3`°KZjÇ$w|³Ä·¨R®\u008di"
         .length();
      char var5 = 'H';
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
                     g = new String[14];
                     esg = LogManager.getLogger();
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

                  var6 = "·ì×Ò÷\u0013:^rÎön`&Lv(¹\u00904\u001c\n¬mmÌÔ\u0014\u0087-\u0011jl\u008bJØPo\u0085qµÛ7\u009f\u0019mk\t÷{\t$UR_ÐÉ";
                  var8 = "·ì×Ò÷\u0013:^rÎön`&Lv(¹\u00904\u001c\n¬mmÌÔ\u0014\u0087-\u0011jl\u008bJØPo\u0085qµÛ7\u009f\u0019mk\t÷{\t$UR_ÐÉ".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31110;
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
            throw new RuntimeException("iq7", var10);
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
         throw new RuntimeException("iq7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
