import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.FloatBuffer;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.override.ChunkCacheOF;
import net.optifine.render.AabbFrame;

public class kqk {
   private final t9d y0y;
   private final crp lk_;
   public static int vql;
   private mew fxe;
   public cbc ltn;
   private final ReentrantLock tb_;
   private final ReentrantLock frp;
   private uga qq0;
   private final Set c3k;
   private final int w3o;
   private final FloatBuffer nlq;
   private final fab[] oqj;
   public nh4 bwb;
   private int m0e;
   private boolean itn;
   private EnumMap zcs;
   private mew[] d9u;
   public static final w51[] pxj;
   private final w51[] y_5;
   private final boolean j2n;
   private final boolean rf6;
   private boolean nfi;
   public int bxz;
   public int m9o;
   private final kqk[] db1;
   private boolean p4q;
   private tts a24;
   private kqk[] t1t;
   private kqk[] v41;
   private boolean n46;
   private crp$j3h wwd;
   public AabbFrame n5_;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public kqk(t9d param1, crp param2, mew param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: aload 0
      // 005: getstatic cbc.ays Lcbc;
      // 008: putfield kqk.ltn Lcbc;
      // 00b: aload 0
      // 00c: new java/util/concurrent/locks/ReentrantLock
      // 00f: dup
      // 010: invokespecial java/util/concurrent/locks/ReentrantLock.<init> ()V
      // 013: putfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 016: aload 0
      // 017: new java/util/concurrent/locks/ReentrantLock
      // 01a: dup
      // 01b: invokespecial java/util/concurrent/locks/ReentrantLock.<init> ()V
      // 01e: putfield kqk.frp Ljava/util/concurrent/locks/ReentrantLock;
      // 021: aload 0
      // 022: aconst_null
      // 023: putfield kqk.qq0 Luga;
      // 026: aload 0
      // 027: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 02a: putfield kqk.c3k Ljava/util/Set;
      // 02d: aload 0
      // 02e: bipush 16
      // 030: invokestatic nkx.dyc (I)Ljava/nio/FloatBuffer;
      // 033: putfield kqk.nlq Ljava/nio/FloatBuffer;
      // 036: aload 0
      // 037: invokestatic w51.values ()[Lw51;
      // 03a: arraylength
      // 03b: anewarray 125
      // 03e: putfield kqk.oqj [Lfab;
      // 041: aload 0
      // 042: bipush -1
      // 043: putfield kqk.m0e I
      // 046: invokestatic t9d.c ()I
      // 049: aload 0
      // 04a: bipush 1
      // 04b: putfield kqk.itn Z
      // 04e: istore 5
      // 050: aload 0
      // 051: aconst_null
      // 052: putfield kqk.zcs Ljava/util/EnumMap;
      // 055: aload 0
      // 056: getstatic vt2.vbu [Lvt2;
      // 059: arraylength
      // 05a: anewarray 141
      // 05d: putfield kqk.d9u [Lmew;
      // 060: aload 0
      // 061: bipush 1
      // 062: anewarray 119
      // 065: putfield kqk.y_5 [Lw51;
      // 068: aload 0
      // 069: invokestatic hxt.knk ()Z
      // 06c: putfield kqk.j2n Z
      // 06f: aload 0
      // 070: getstatic net/optifine/reflect/Reflector.BetterFoliageClient Lnet/optifine/reflect/ReflectorClass;
      // 073: invokevirtual net/optifine/reflect/ReflectorClass.exists ()Z
      // 076: iload 5
      // 078: ifne 086
      // 07b: ifne 089
      // 07e: goto 085
      // 081: invokestatic kqk.b (Loov;)Loov;
      // 084: athrow
      // 085: bipush 1
      // 086: goto 08a
      // 089: bipush 0
      // 08a: putfield kqk.rf6 Z
      // 08d: aload 0
      // 08e: bipush 0
      // 08f: putfield kqk.nfi Z
      // 092: aload 0
      // 093: bipush 6
      // 095: anewarray 14
      // 098: putfield kqk.db1 [Lkqk;
      // 09b: aload 0
      // 09c: bipush 0
      // 09d: putfield kqk.p4q Z
      // 0a0: aload 0
      // 0a1: getstatic vt2.vbu [Lvt2;
      // 0a4: arraylength
      // 0a5: anewarray 14
      // 0a8: putfield kqk.t1t [Lkqk;
      // 0ab: aload 0
      // 0ac: getstatic vt2.vbu [Lvt2;
      // 0af: arraylength
      // 0b0: anewarray 14
      // 0b3: putfield kqk.v41 [Lkqk;
      // 0b6: aload 0
      // 0b7: bipush 0
      // 0b8: putfield kqk.n46 Z
      // 0bb: aload 0
      // 0bc: new crp$j3h
      // 0bf: dup
      // 0c0: aload 0
      // 0c1: aconst_null
      // 0c2: checkcast vt2
      // 0c5: bipush 0
      // 0c6: invokespecial crp$j3h.<init> (Lkqk;Lvt2;I)V
      // 0c9: putfield kqk.wwd Lcrp$j3h;
      // 0cc: aload 0
      // 0cd: aload 1
      // 0ce: putfield kqk.y0y Lt9d;
      // 0d1: aload 0
      // 0d2: aload 2
      // 0d3: putfield kqk.lk_ Lcrp;
      // 0d6: aload 0
      // 0d7: iload 4
      // 0d9: putfield kqk.w3o I
      // 0dc: aload 3
      // 0dd: aload 0
      // 0de: invokevirtual kqk.a7g ()Lmew;
      // 0e1: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 0e4: iload 5
      // 0e6: ifne 102
      // 0e9: ifne 0ff
      // 0ec: goto 0f3
      // 0ef: invokestatic kqk.b (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 3
      // 0f5: invokevirtual kqk.pap (Lmew;)V
      // 0f8: goto 0ff
      // 0fb: invokestatic kqk.b (Loov;)Loov;
      // 0fe: athrow
      // 0ff: invokestatic gis.eyg ()Z
      // 102: iload 5
      // 104: ifne 112
      // 107: ifeq 136
      // 10a: goto 111
      // 10d: invokestatic kqk.b (Loov;)Loov;
      // 110: athrow
      // 111: bipush 0
      // 112: istore 6
      // 114: iload 6
      // 116: invokestatic w51.values ()[Lw51;
      // 119: arraylength
      // 11a: if_icmpge 136
      // 11d: aload 0
      // 11e: getfield kqk.oqj [Lfab;
      // 121: iload 6
      // 123: new fab
      // 126: dup
      // 127: getstatic gnl.n6w Lbe7;
      // 12a: invokespecial fab.<init> (Lbe7;)V
      // 12d: aastore
      // 12e: iinc 6 1
      // 131: iload 5
      // 133: ifeq 114
      // 136: return
   }

   public boolean yhg(int param1) {
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
      // 05: getfield kqk.m0e I
      // 08: iload 2
      // 09: ifeq 23
      // 0c: iload 1
      // 0d: if_icmpne 1d
      // 10: goto 17
      // 13: invokestatic kqk.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic kqk.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: iload 1
      // 1f: putfield kqk.m0e I
      // 22: bipush 1
      // 23: ireturn
   }

   public fab lry(int var1) {
      return this.oqj[var1];
   }

   public void pap(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual kqk.l3r ()V
      // 04: aload 0
      // 05: aload 1
      // 06: putfield kqk.fxe Lmew;
      // 09: invokestatic t9d.c ()I
      // 0c: bipush 8
      // 0e: istore 3
      // 0f: aload 0
      // 10: aload 1
      // 11: invokevirtual mew.getX ()I
      // 14: iload 3
      // 15: ishr
      // 16: iload 3
      // 17: ishl
      // 18: putfield kqk.bxz I
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual mew.getZ ()I
      // 20: iload 3
      // 21: ishr
      // 22: iload 3
      // 23: ishl
      // 24: putfield kqk.m9o I
      // 27: aload 0
      // 28: new nh4
      // 2b: dup
      // 2c: aload 1
      // 2d: aload 1
      // 2e: bipush 16
      // 30: bipush 16
      // 32: bipush 16
      // 34: invokevirtual mew.ec4 (III)Lmew;
      // 37: invokespecial nh4.<init> (Lmew;Lmew;)V
      // 3a: putfield kqk.bwb Lnh4;
      // 3d: istore 2
      // 3e: aload 0
      // 3f: invokespecial kqk.uoi ()V
      // 42: bipush 0
      // 43: istore 4
      // 45: iload 4
      // 47: aload 0
      // 48: getfield kqk.d9u [Lmew;
      // 4b: arraylength
      // 4c: if_icmpge 69
      // 4f: aload 0
      // 50: getfield kqk.d9u [Lmew;
      // 53: iload 4
      // 55: aconst_null
      // 56: aastore
      // 57: iinc 4 1
      // 5a: iload 2
      // 5b: ifne 73
      // 5e: iload 2
      // 5f: ifeq 45
      // 62: goto 69
      // 65: invokestatic kqk.b (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: bipush 0
      // 6b: putfield kqk.p4q Z
      // 6e: aload 0
      // 6f: bipush 0
      // 70: putfield kqk.n46 Z
      // 73: bipush 0
      // 74: istore 4
      // 76: iload 4
      // 78: aload 0
      // 79: getfield kqk.t1t [Lkqk;
      // 7c: arraylength
      // 7d: if_icmpge b8
      // 80: aload 0
      // 81: getfield kqk.t1t [Lkqk;
      // 84: iload 4
      // 86: aaload
      // 87: astore 5
      // 89: iload 2
      // 8a: ifne b4
      // 8d: aload 5
      // 8f: iload 2
      // 90: ifne be
      // 93: goto 9a
      // 96: invokestatic kqk.b (Loov;)Loov;
      // 99: athrow
      // 9a: ifnull b1
      // 9d: goto a4
      // a0: invokestatic kqk.b (Loov;)Loov;
      // a3: athrow
      // a4: aload 5
      // a6: bipush 0
      // a7: putfield kqk.n46 Z
      // aa: goto b1
      // ad: invokestatic kqk.b (Loov;)Loov;
      // b0: athrow
      // b1: iinc 4 1
      // b4: iload 2
      // b5: ifeq 76
      // b8: aload 0
      // b9: aconst_null
      // ba: putfield kqk.a24 Ltts;
      // bd: aload 0
      // be: aconst_null
      // bf: putfield kqk.n5_ Lnet/optifine/render/AabbFrame;
      // c2: return
   }

   public void toi(float param1, float param2, float param3, uga param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 4
      // 07: invokevirtual uga.hqk ()Lcbc;
      // 0a: astore 6
      // 0c: aload 6
      // 0e: iload 5
      // 10: ifne 29
      // 13: invokevirtual cbc.zjr ()Lq3g$szd;
      // 16: ifnull 61
      // 19: goto 20
      // 1c: invokestatic kqk.b (Loov;)Loov;
      // 1f: athrow
      // 20: aload 6
      // 22: goto 29
      // 25: invokestatic kqk.b (Loov;)Loov;
      // 28: athrow
      // 29: getstatic w51.mem Lw51;
      // 2c: invokevirtual cbc.jo2 (Lw51;)Z
      // 2f: ifne 61
      // 32: aload 4
      // 34: invokevirtual uga.s23 ()Lwi5;
      // 37: getstatic w51.mem Lw51;
      // 3a: invokevirtual wi5._0d (Lw51;)Lq3g;
      // 3d: astore 7
      // 3f: aload 0
      // 40: aload 7
      // 42: aload 0
      // 43: getfield kqk.fxe Lmew;
      // 46: invokespecial kqk.pri (Lq3g;Lmew;)V
      // 49: aload 7
      // 4b: aload 6
      // 4d: invokevirtual cbc.zjr ()Lq3g$szd;
      // 50: invokevirtual q3g.v1_ (Lq3g$szd;)V
      // 53: aload 0
      // 54: getstatic w51.mem Lw51;
      // 57: fload 1
      // 58: fload 2
      // 59: fload 3
      // 5a: aload 7
      // 5c: aload 6
      // 5e: invokespecial kqk.fiz (Lw51;FFFLq3g;Lcbc;)V
      // 61: return
   }

   public void nhu(float param1, float param2, float param3, uga param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new cbc
      // 003: dup
      // 004: invokespecial cbc.<init> ()V
      // 007: astore 6
      // 009: invokestatic t9d.b ()I
      // 00c: bipush 1
      // 00d: istore 7
      // 00f: istore 5
      // 011: new mew
      // 014: dup
      // 015: aload 0
      // 016: getfield kqk.fxe Lmew;
      // 019: invokespecial mew.<init> (Lwgo;)V
      // 01c: astore 8
      // 01e: aload 8
      // 020: bipush 15
      // 022: bipush 15
      // 024: bipush 15
      // 026: invokevirtual mew.ec4 (III)Lmew;
      // 029: astore 9
      // 02b: aload 4
      // 02d: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // 030: invokevirtual java/util/concurrent/locks/ReentrantLock.lock ()V
      // 033: aload 4
      // 035: iload 5
      // 037: ifeq 055
      // 03a: invokevirtual uga.va9 ()Luga$aen;
      // 03d: getstatic uga$aen.dht Luga$aen;
      // 040: if_acmpeq 04c
      // 043: aload 4
      // 045: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // 048: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 04b: return
      // 04c: aload 4
      // 04e: aload 6
      // 050: invokevirtual uga.a6f (Lcbc;)V
      // 053: aload 4
      // 055: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // 058: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 05b: goto 06b
      // 05e: astore 10
      // 060: aload 4
      // 062: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // 065: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 068: aload 10
      // 06a: athrow
      // 06b: new zy2
      // 06e: dup
      // 06f: invokespecial zy2.<init> ()V
      // 072: astore 10
      // 074: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 077: astore 11
      // 079: aload 0
      // 07a: iload 5
      // 07c: ifeq 41a
      // 07f: aload 8
      // 081: invokespecial kqk.noy (Lmew;)Z
      // 084: ifne 40f
      // 087: goto 08e
      // 08a: invokestatic kqk.b (Loov;)Loov;
      // 08d: athrow
      // 08e: getstatic kqk.vql I
      // 091: bipush 1
      // 092: iadd
      // 093: putstatic kqk.vql I
      // 096: aload 0
      // 097: aload 8
      // 099: invokespecial kqk._e8 (Lmew;)Lnet/optifine/override/ChunkCacheOF;
      // 09c: astore 12
      // 09e: aload 12
      // 0a0: invokevirtual net/optifine/override/ChunkCacheOF.renderStart ()V
      // 0a3: getstatic kqk.pxj [Lw51;
      // 0a6: arraylength
      // 0a7: newarray 4
      // 0a9: astore 13
      // 0ab: invokestatic c05.vz1 ()Lc05;
      // 0ae: invokevirtual c05.dwz ()Lqfn;
      // 0b1: astore 14
      // 0b3: getstatic net/optifine/reflect/Reflector.ForgeBlock_canRenderInLayer Lnet/optifine/reflect/ReflectorMethod;
      // 0b6: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0b9: istore 15
      // 0bb: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderLayer Lnet/optifine/reflect/ReflectorMethod;
      // 0be: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0c1: istore 16
      // 0c3: aload 8
      // 0c5: aload 9
      // 0c7: invokestatic net/optifine/BlockPosM.getAllInBoxMutable (Lmew;Lmew;)Ljava/lang/Iterable;
      // 0ca: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0cf: astore 17
      // 0d1: aload 17
      // 0d3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d8: ifeq 32e
      // 0db: aload 17
      // 0dd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e2: astore 18
      // 0e4: aload 12
      // 0e6: aload 18
      // 0e8: checkcast net/optifine/BlockPosM
      // 0eb: invokevirtual net/optifine/override/ChunkCacheOF.getBlockState (Lmew;)Lzfz;
      // 0ee: astore 19
      // 0f0: aload 19
      // 0f2: invokeinterface zfz.r_y ()Le0x; 1
      // 0f7: astore 20
      // 0f9: iload 5
      // 0fb: ifeq 420
      // 0fe: aload 20
      // 100: invokevirtual e0x.ko5 ()Z
      // 103: iload 5
      // 105: ifeq 12f
      // 108: goto 10f
      // 10b: invokestatic kqk.b (Loov;)Loov;
      // 10e: athrow
      // 10f: ifeq 12a
      // 112: goto 119
      // 115: invokestatic kqk.b (Loov;)Loov;
      // 118: athrow
      // 119: aload 10
      // 11b: aload 18
      // 11d: checkcast net/optifine/BlockPosM
      // 120: invokevirtual zy2.fzu (Lmew;)V
      // 123: goto 12a
      // 126: invokestatic kqk.b (Loov;)Loov;
      // 129: athrow
      // 12a: aload 19
      // 12c: invokestatic net/optifine/reflect/ReflectorForge.blockHasTileEntity (Lzfz;)Z
      // 12f: iload 5
      // 131: ifeq 1ab
      // 134: ifeq 1a9
      // 137: goto 13e
      // 13a: invokestatic kqk.b (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 12
      // 140: new mew
      // 143: dup
      // 144: aload 18
      // 146: checkcast net/optifine/BlockPosM
      // 149: invokespecial mew.<init> (Lwgo;)V
      // 14c: invokevirtual net/optifine/override/ChunkCacheOF.getTileEntity (Lmew;)Lpyk;
      // 14f: astore 21
      // 151: getstatic xv4.b2r Lxv4;
      // 154: aload 21
      // 156: invokevirtual xv4.yhq (Lpyk;)Lq9h;
      // 159: astore 22
      // 15b: aload 21
      // 15d: ifnull 1a9
      // 160: aload 22
      // 162: iload 5
      // 164: ifeq 188
      // 167: goto 16e
      // 16a: invokestatic kqk.b (Loov;)Loov;
      // 16d: athrow
      // 16e: ifnull 1a9
      // 171: goto 178
      // 174: invokestatic kqk.b (Loov;)Loov;
      // 177: athrow
      // 178: aload 6
      // 17a: aload 21
      // 17c: invokevirtual cbc.cmv (Lpyk;)V
      // 17f: aload 22
      // 181: goto 188
      // 184: invokestatic kqk.b (Loov;)Loov;
      // 187: athrow
      // 188: invokevirtual q9h.ts0 ()Z
      // 18b: iload 5
      // 18d: ifeq 1ab
      // 190: ifeq 1a9
      // 193: goto 19a
      // 196: invokestatic kqk.b (Loov;)Loov;
      // 199: athrow
      // 19a: aload 11
      // 19c: aload 21
      // 19e: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 1a1: pop
      // 1a2: goto 1a9
      // 1a5: invokestatic kqk.b (Loov;)Loov;
      // 1a8: athrow
      // 1a9: iload 15
      // 1ab: ifeq 1b8
      // 1ae: getstatic kqk.pxj [Lw51;
      // 1b1: astore 21
      // 1b3: iload 5
      // 1b5: ifne 1c7
      // 1b8: aload 0
      // 1b9: getfield kqk.y_5 [Lw51;
      // 1bc: astore 21
      // 1be: aload 21
      // 1c0: bipush 0
      // 1c1: aload 20
      // 1c3: invokevirtual e0x.w3x ()Lw51;
      // 1c6: aastore
      // 1c7: bipush 0
      // 1c8: istore 22
      // 1ca: iload 22
      // 1cc: aload 21
      // 1ce: arraylength
      // 1cf: if_icmpge 30f
      // 1d2: aload 21
      // 1d4: iload 22
      // 1d6: aaload
      // 1d7: astore 23
      // 1d9: iload 15
      // 1db: iload 5
      // 1dd: ifeq 311
      // 1e0: iload 5
      // 1e2: ifeq 21f
      // 1e5: goto 1ec
      // 1e8: invokestatic kqk.b (Loov;)Loov;
      // 1eb: athrow
      // 1ec: ifeq 21d
      // 1ef: goto 1f6
      // 1f2: invokestatic kqk.b (Loov;)Loov;
      // 1f5: athrow
      // 1f6: aload 20
      // 1f8: getstatic net/optifine/reflect/Reflector.ForgeBlock_canRenderInLayer Lnet/optifine/reflect/ReflectorMethod;
      // 1fb: bipush 1
      // 1fc: anewarray 16
      // 1ff: dup
      // 200: bipush 0
      // 201: aload 23
      // 203: aastore
      // 204: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 207: istore 24
      // 209: iload 24
      // 20b: iload 5
      // 20d: ifeq 21f
      // 210: ifne 21d
      // 213: goto 21a
      // 216: invokestatic kqk.b (Loov;)Loov;
      // 219: athrow
      // 21a: goto 307
      // 21d: iload 16
      // 21f: iload 5
      // 221: ifeq 253
      // 224: ifeq 244
      // 227: goto 22e
      // 22a: invokestatic kqk.b (Loov;)Loov;
      // 22d: athrow
      // 22e: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderLayer Lnet/optifine/reflect/ReflectorMethod;
      // 231: bipush 1
      // 232: anewarray 16
      // 235: dup
      // 236: bipush 0
      // 237: aload 23
      // 239: aastore
      // 23a: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 23d: goto 244
      // 240: invokestatic kqk.b (Loov;)Loov;
      // 243: athrow
      // 244: aload 0
      // 245: aload 19
      // 247: aload 23
      // 249: invokespecial kqk.vpp (Lzfz;Lw51;)Lw51;
      // 24c: astore 23
      // 24e: aload 23
      // 250: invokevirtual w51.ordinal ()I
      // 253: istore 24
      // 255: iload 5
      // 257: ifeq 30a
      // 25a: aload 20
      // 25c: invokevirtual e0x.kfj ()I
      // 25f: bipush -1
      // 260: if_icmpeq 307
      // 263: goto 26a
      // 266: invokestatic kqk.b (Loov;)Loov;
      // 269: athrow
      // 26a: aload 4
      // 26c: invokevirtual uga.s23 ()Lwi5;
      // 26f: iload 24
      // 271: invokevirtual wi5.hbr (I)Lq3g;
      // 274: astore 25
      // 276: aload 25
      // 278: aload 23
      // 27a: invokevirtual q3g._8s (Lw51;)V
      // 27d: aload 25
      // 27f: aload 19
      // 281: aload 18
      // 283: checkcast net/optifine/BlockPosM
      // 286: invokevirtual q3g.xgm (Lzfz;Lmew;)Lnet/optifine/render/RenderEnv;
      // 289: astore 26
      // 28b: aload 26
      // 28d: aload 4
      // 28f: invokevirtual uga.s23 ()Lwi5;
      // 292: invokevirtual net/optifine/render/RenderEnv.setRegionRenderCacheBuilder (Lwi5;)V
      // 295: aload 6
      // 297: aload 23
      // 299: invokevirtual cbc.g4s (Lw51;)Z
      // 29c: iload 5
      // 29e: ifeq 2ea
      // 2a1: ifne 2c1
      // 2a4: goto 2ab
      // 2a7: invokestatic kqk.b (Loov;)Loov;
      // 2aa: athrow
      // 2ab: aload 6
      // 2ad: aload 23
      // 2af: invokevirtual cbc.okj (Lw51;)V
      // 2b2: aload 0
      // 2b3: aload 25
      // 2b5: aload 8
      // 2b7: invokespecial kqk.pri (Lq3g;Lmew;)V
      // 2ba: goto 2c1
      // 2bd: invokestatic kqk.b (Loov;)Loov;
      // 2c0: athrow
      // 2c1: aload 13
      // 2c3: iload 24
      // 2c5: dup2
      // 2c6: baload
      // 2c7: aload 14
      // 2c9: aload 19
      // 2cb: aload 18
      // 2cd: checkcast net/optifine/BlockPosM
      // 2d0: aload 12
      // 2d2: aload 25
      // 2d4: invokevirtual qfn.nxw (Lzfz;Lmew;Lm5n;Lq3g;)Z
      // 2d7: ior
      // 2d8: bastore
      // 2d9: iload 5
      // 2db: ifeq 30a
      // 2de: aload 26
      // 2e0: invokevirtual net/optifine/render/RenderEnv.isOverlaysRendered ()Z
      // 2e3: goto 2ea
      // 2e6: invokestatic kqk.b (Loov;)Loov;
      // 2e9: athrow
      // 2ea: ifeq 307
      // 2ed: aload 0
      // 2ee: aload 4
      // 2f0: invokevirtual uga.s23 ()Lwi5;
      // 2f3: aload 6
      // 2f5: aload 13
      // 2f7: invokespecial kqk.d0s (Lwi5;Lcbc;[Z)V
      // 2fa: aload 26
      // 2fc: bipush 0
      // 2fd: invokevirtual net/optifine/render/RenderEnv.setOverlaysRendered (Z)V
      // 300: goto 307
      // 303: invokestatic kqk.b (Loov;)Loov;
      // 306: athrow
      // 307: iinc 22 1
      // 30a: iload 5
      // 30c: ifne 1ca
      // 30f: iload 16
      // 311: ifeq 329
      // 314: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderLayer Lnet/optifine/reflect/ReflectorMethod;
      // 317: bipush 1
      // 318: anewarray 16
      // 31b: dup
      // 31c: bipush 0
      // 31d: aconst_null
      // 31e: aastore
      // 31f: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 322: goto 329
      // 325: invokestatic kqk.b (Loov;)Loov;
      // 328: athrow
      // 329: iload 5
      // 32b: ifne 0d1
      // 32e: getstatic kqk.pxj [Lw51;
      // 331: astore 17
      // 333: aload 17
      // 335: arraylength
      // 336: istore 18
      // 338: bipush 0
      // 339: istore 19
      // 33b: iload 19
      // 33d: iload 18
      // 33f: if_icmpge 40a
      // 342: aload 17
      // 344: iload 19
      // 346: aaload
      // 347: astore 20
      // 349: iload 5
      // 34b: ifeq 420
      // 34e: aload 13
      // 350: aload 20
      // 352: invokevirtual w51.ordinal ()I
      // 355: baload
      // 356: iload 5
      // 358: ifeq 38d
      // 35b: goto 362
      // 35e: invokestatic kqk.b (Loov;)Loov;
      // 361: athrow
      // 362: ifeq 37a
      // 365: goto 36c
      // 368: invokestatic kqk.b (Loov;)Loov;
      // 36b: athrow
      // 36c: aload 6
      // 36e: aload 20
      // 370: invokevirtual cbc.uey (Lw51;)V
      // 373: goto 37a
      // 376: invokestatic kqk.b (Loov;)Loov;
      // 379: athrow
      // 37a: aload 6
      // 37c: aload 20
      // 37e: iload 5
      // 380: ifeq 3fb
      // 383: invokevirtual cbc.g4s (Lw51;)Z
      // 386: goto 38d
      // 389: invokestatic kqk.b (Loov;)Loov;
      // 38c: athrow
      // 38d: ifeq 3f0
      // 390: invokestatic hxt.ly3 ()Z
      // 393: ifeq 3b1
      // 396: goto 39d
      // 399: invokestatic kqk.b (Loov;)Loov;
      // 39c: athrow
      // 39d: aload 4
      // 39f: invokevirtual uga.s23 ()Lwi5;
      // 3a2: aload 20
      // 3a4: invokevirtual wi5._0d (Lw51;)Lq3g;
      // 3a7: invokestatic net/optifine/shaders/SVertexBuilder.calcNormalChunkLayer (Lq3g;)V
      // 3aa: goto 3b1
      // 3ad: invokestatic kqk.b (Loov;)Loov;
      // 3b0: athrow
      // 3b1: aload 4
      // 3b3: invokevirtual uga.s23 ()Lwi5;
      // 3b6: aload 20
      // 3b8: invokevirtual wi5._0d (Lw51;)Lq3g;
      // 3bb: astore 21
      // 3bd: aload 0
      // 3be: aload 20
      // 3c0: fload 1
      // 3c1: fload 2
      // 3c2: fload 3
      // 3c3: aload 21
      // 3c5: aload 6
      // 3c7: invokespecial kqk.fiz (Lw51;FFFLq3g;Lcbc;)V
      // 3ca: aload 21
      // 3cc: getfield q3g.fho Ljava/util/BitSet;
      // 3cf: ifnull 3eb
      // 3d2: aload 6
      // 3d4: aload 20
      // 3d6: aload 21
      // 3d8: getfield q3g.fho Ljava/util/BitSet;
      // 3db: invokevirtual java/util/BitSet.clone ()Ljava/lang/Object;
      // 3de: checkcast java/util/BitSet
      // 3e1: invokevirtual cbc.je9 (Lw51;Ljava/util/BitSet;)V
      // 3e4: goto 3eb
      // 3e7: invokestatic kqk.b (Loov;)Loov;
      // 3ea: athrow
      // 3eb: iload 5
      // 3ed: ifne 402
      // 3f0: aload 6
      // 3f2: aload 20
      // 3f4: goto 3fb
      // 3f7: invokestatic kqk.b (Loov;)Loov;
      // 3fa: athrow
      // 3fb: aconst_null
      // 3fc: checkcast java/util/BitSet
      // 3ff: invokevirtual cbc.je9 (Lw51;Ljava/util/BitSet;)V
      // 402: iinc 19 1
      // 405: iload 5
      // 407: ifne 33b
      // 40a: aload 12
      // 40c: invokevirtual net/optifine/override/ChunkCacheOF.renderFinish ()V
      // 40f: aload 6
      // 411: aload 10
      // 413: invokevirtual zy2.bsi ()Ljcs;
      // 416: invokevirtual cbc.htm (Ljcs;)V
      // 419: aload 0
      // 41a: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 41d: invokevirtual java/util/concurrent/locks/ReentrantLock.lock ()V
      // 420: aload 11
      // 422: invokestatic com/google/common/collect/Sets.newHashSet (Ljava/lang/Iterable;)Ljava/util/HashSet;
      // 425: astore 12
      // 427: aload 0
      // 428: getfield kqk.c3k Ljava/util/Set;
      // 42b: invokestatic com/google/common/collect/Sets.newHashSet (Ljava/lang/Iterable;)Ljava/util/HashSet;
      // 42e: astore 13
      // 430: aload 12
      // 432: aload 0
      // 433: getfield kqk.c3k Ljava/util/Set;
      // 436: invokeinterface java/util/Set.removeAll (Ljava/util/Collection;)Z 2
      // 43b: pop
      // 43c: aload 13
      // 43e: aload 11
      // 440: invokeinterface java/util/Set.removeAll (Ljava/util/Collection;)Z 2
      // 445: pop
      // 446: aload 0
      // 447: getfield kqk.c3k Ljava/util/Set;
      // 44a: invokeinterface java/util/Set.clear ()V 1
      // 44f: aload 0
      // 450: getfield kqk.c3k Ljava/util/Set;
      // 453: aload 11
      // 455: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 45a: pop
      // 45b: aload 0
      // 45c: getfield kqk.lk_ Lcrp;
      // 45f: aload 13
      // 461: aload 12
      // 463: invokevirtual crp.ri6 (Ljava/util/Collection;Ljava/util/Collection;)V
      // 466: aload 0
      // 467: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 46a: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 46d: goto 47c
      // 470: astore 27
      // 472: aload 0
      // 473: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 476: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 479: aload 27
      // 47b: athrow
      // 47c: return
   }

   public void uaf() {
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
      // 05: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 08: invokevirtual java/util/concurrent/locks/ReentrantLock.lock ()V
      // 0b: aload 0
      // 0c: iload 1
      // 0d: ifne 49
      // 10: getfield kqk.qq0 Luga;
      // 13: ifnull 48
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 49
      // 1b: goto 22
      // 1e: invokestatic kqk.b (Loov;)Loov;
      // 21: athrow
      // 22: getfield kqk.qq0 Luga;
      // 25: invokevirtual uga.va9 ()Luga$aen;
      // 28: getstatic uga$aen.mle Luga$aen;
      // 2b: if_acmpeq 48
      // 2e: goto 35
      // 31: invokestatic kqk.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield kqk.qq0 Luga;
      // 39: invokevirtual uga._01 ()V
      // 3c: aload 0
      // 3d: aconst_null
      // 3e: putfield kqk.qq0 Luga;
      // 41: goto 48
      // 44: invokestatic kqk.b (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 4c: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 4f: goto 5c
      // 52: astore 2
      // 53: aload 0
      // 54: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 57: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 5a: aload 2
      // 5b: athrow
      // 5c: return
   }

   public ReentrantLock adi() {
      return this.tb_;
   }

   public uga vun() {
      this.tb_.lock();

      uga var1;
      try {
         this.uaf();
         this.qq0 = new uga(this, uga$l1i.r7h);
         var1 = this.qq0;
      } finally {
         this.tb_.unlock();
      }

      return var1;
   }

   public uga f_d() {
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
      // 05: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 08: invokevirtual java/util/concurrent/locks/ReentrantLock.lock ()V
      // 0b: aload 0
      // 0c: getfield kqk.qq0 Luga;
      // 0f: iload 1
      // 10: ifne 48
      // 13: ifnull 44
      // 16: aload 0
      // 17: getfield kqk.qq0 Luga;
      // 1a: iload 1
      // 1b: ifne 48
      // 1e: goto 25
      // 21: invokestatic kqk.b (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual uga.va9 ()Luga$aen;
      // 28: getstatic uga$aen.sib Luga$aen;
      // 2b: if_acmpne 44
      // 2e: goto 35
      // 31: invokestatic kqk.b (Loov;)Loov;
      // 34: athrow
      // 35: aconst_null
      // 36: astore 3
      // 37: aload 3
      // 38: astore 4
      // 3a: aload 0
      // 3b: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // 3e: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 41: aload 4
      // 43: areturn
      // 44: aload 0
      // 45: getfield kqk.qq0 Luga;
      // 48: iload 1
      // 49: ifne a6
      // 4c: ifnull 88
      // 4f: goto 56
      // 52: invokestatic kqk.b (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: getfield kqk.qq0 Luga;
      // 5a: iload 1
      // 5b: ifne a6
      // 5e: goto 65
      // 61: invokestatic kqk.b (Loov;)Loov;
      // 64: athrow
      // 65: invokevirtual uga.va9 ()Luga$aen;
      // 68: getstatic uga$aen.mle Luga$aen;
      // 6b: if_acmpeq 88
      // 6e: goto 75
      // 71: invokestatic kqk.b (Loov;)Loov;
      // 74: athrow
      // 75: aload 0
      // 76: getfield kqk.qq0 Luga;
      // 79: invokevirtual uga._01 ()V
      // 7c: aload 0
      // 7d: aconst_null
      // 7e: putfield kqk.qq0 Luga;
      // 81: goto 88
      // 84: invokestatic kqk.b (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: new uga
      // 8c: dup
      // 8d: aload 0
      // 8e: getstatic uga$l1i.o8c Luga$l1i;
      // 91: invokespecial uga.<init> (Lkqk;Luga$l1i;)V
      // 94: putfield kqk.qq0 Luga;
      // 97: aload 0
      // 98: getfield kqk.qq0 Luga;
      // 9b: aload 0
      // 9c: getfield kqk.ltn Lcbc;
      // 9f: invokevirtual uga.a6f (Lcbc;)V
      // a2: aload 0
      // a3: getfield kqk.qq0 Luga;
      // a6: astore 3
      // a7: aload 3
      // a8: astore 2
      // a9: aload 0
      // aa: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // ad: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // b0: goto bf
      // b3: astore 5
      // b5: aload 0
      // b6: getfield kqk.tb_ Ljava/util/concurrent/locks/ReentrantLock;
      // b9: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // bc: aload 5
      // be: athrow
      // bf: aload 2
      // c0: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void pri(q3g var1, mew var2) {
      int var3 = t9d.c();

      q3g var10000;
      int var10001;
      label46: {
         label41: {
            try {
               var10000 = var1;
               var10001 = 7;
               if (var3 != 0) {
                  break label46;
               }

               var1.ezr(7, gnl.n6w);
               if (!hxt._al()) {
                  break label41;
               }
            } catch (oov var10) {
               throw b(var10);
            }

            byte var4 = 8;
            int var5 = var2.getX() >> var4 << var4;
            int var6 = var2.getY() >> var4 << var4;
            int var7 = var2.getZ() >> var4 << var4;
            var5 = this.bxz;
            var7 = this.m9o;

            try {
               var1.nbz((double)(-var5), (double)(-var6), (double)(-var7));
               if (var3 == 0) {
                  return;
               }
            } catch (oov var9) {
               boolean var14 = false;
               throw b(var9);
            }
         }

         try {
            var10000 = var1;
            var10001 = -var2.getX();
         } catch (oov var8) {
            boolean var15 = false;
            throw b(var8);
         }
      }

      var10000.nbz((double)var10001, (double)(-var2.getY()), (double)(-var2.getZ()));
   }

   private void fiz(w51 param1, float param2, float param3, float param4, q3g param5, cbc param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 7
      // 05: aload 1
      // 06: getstatic w51.mem Lw51;
      // 09: if_acmpne 42
      // 0c: aload 6
      // 0e: iload 7
      // 10: ifne 3a
      // 13: goto 1a
      // 16: invokestatic kqk.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: invokevirtual cbc.jo2 (Lw51;)Z
      // 1e: ifne 42
      // 21: goto 28
      // 24: invokestatic kqk.b (Loov;)Loov;
      // 27: athrow
      // 28: aload 5
      // 2a: fload 2
      // 2b: fload 3
      // 2c: fload 4
      // 2e: invokevirtual q3g.c7x (FFF)V
      // 31: aload 6
      // 33: goto 3a
      // 36: invokestatic kqk.b (Loov;)Loov;
      // 39: athrow
      // 3a: aload 5
      // 3c: invokevirtual q3g.rh0 ()Lq3g$szd;
      // 3f: invokevirtual cbc.agp (Lq3g$szd;)V
      // 42: aload 5
      // 44: invokevirtual q3g.xku ()V
      // 47: return
   }

   private void uoi() {
      hzu.dp2();
      hzu.zwy();
      float var1 = 1.000001F;
      hzu.a4k(-8.0F, -8.0F, -8.0F);
      hzu.syc(var1, var1, var1);
      hzu.a4k(8.0F, 8.0F, 8.0F);
      hzu.i56(2982, this.nlq);
      hzu.x3w();
   }

   public void ft_() {
      hzu.rwd(this.nlq);
   }

   public cbc fw8() {
      return this.ltn;
   }

   public void rdp(cbc var1) {
      this.frp.lock();

      try {
         this.ltn = var1;
      } finally {
         this.frp.unlock();
      }
   }

   public void l3r() {
      this.uaf();
      this.ltn = cbc.ays;
   }

   public void qv0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual kqk.l3r ()V
      // 04: invokestatic t9d.b ()I
      // 07: bipush 0
      // 08: istore 2
      // 09: istore 1
      // 0a: iload 2
      // 0b: invokestatic w51.values ()[Lw51;
      // 0e: arraylength
      // 0f: if_icmpge 3d
      // 12: aload 0
      // 13: getfield kqk.oqj [Lfab;
      // 16: iload 2
      // 17: aaload
      // 18: iload 1
      // 19: ifeq 33
      // 1c: ifnull 36
      // 1f: goto 26
      // 22: invokestatic kqk.b (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield kqk.oqj [Lfab;
      // 2a: iload 2
      // 2b: aaload
      // 2c: goto 33
      // 2f: invokestatic kqk.b (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual fab.v24 ()V
      // 36: iinc 2 1
      // 39: iload 1
      // 3a: ifne 0a
      // 3d: return
   }

   public mew a7g() {
      return this.fxe;
   }

   public void sf6(boolean param1) {
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
      // 05: iload 1
      // 06: iload 2
      // 07: ifne 4a
      // 0a: putfield kqk.itn Z
      // 0d: iload 1
      // 0e: ifeq 41
      // 11: goto 18
      // 14: invokestatic kqk.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 2
      // 1a: ifne 39
      // 1d: goto 24
      // 20: invokestatic kqk.b (Loov;)Loov;
      // 23: athrow
      // 24: invokespecial kqk.q44 ()Z
      // 27: ifeq 4d
      // 2a: goto 31
      // 2d: invokestatic kqk.b (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: goto 39
      // 35: invokestatic kqk.b (Loov;)Loov;
      // 38: athrow
      // 39: bipush 1
      // 3a: putfield kqk.nfi Z
      // 3d: iload 2
      // 3e: ifeq 4d
      // 41: aload 0
      // 42: bipush 0
      // 43: goto 4a
      // 46: invokestatic kqk.b (Loov;)Loov;
      // 49: athrow
      // 4a: putfield kqk.nfi Z
      // 4d: return
   }

   public boolean tbo() {
      return this.itn;
   }

   public mew a8d(vt2 var1) {
      return this.ivg(var1);
   }

   public mew ivg(vt2 var1) {
      int var3 = var1.c3s();
      int var10000 = t9d.b();
      mew var4 = this.d9u[var3];
      int var2 = var10000;

      try {
         if (var2 == 0) {
            return var4;
         }

         if (var4 != null) {
            return var4;
         }
      } catch (oov var5) {
         throw b(var5);
      }

      var4 = this.a7g().offset(var1, 16);
      this.d9u[var3] = var4;
      return var4;
   }

   private boolean q44() {
      int var1 = t9d.b();

      label27: {
         try {
            boolean var10000 = this.y0y instanceof kh3;
            if (var1 == 0) {
               return var10000;
            }

            if (var10000) {
               break label27;
            }
         } catch (oov var3) {
            throw b(var3);
         }

         return false;
      }

      kh3 var2 = (kh3)this.y0y;
      return var2.mu6();
   }

   public boolean f76() {
      return this.nfi;
   }

   public nem tin(t9d var1, mew var2, mew var3, int var4) {
      return new nem(var1, var2, var3, var4);
   }

   private w51 vpp(zfz param1, w51 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: invokestatic net/optifine/CustomBlockLayers.isActive ()Z
      // 07: iload 3
      // 08: ifeq 32
      // 0b: ifeq 2e
      // 0e: goto 15
      // 11: invokestatic kqk.b (Loov;)Loov;
      // 14: athrow
      // 15: aload 1
      // 16: invokestatic net/optifine/CustomBlockLayers.getRenderLayer (Lzfz;)Lw51;
      // 19: astore 4
      // 1b: aload 4
      // 1d: iload 3
      // 1e: ifeq 2d
      // 21: ifnull 2e
      // 24: goto 2b
      // 27: invokestatic kqk.b (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 4
      // 2d: areturn
      // 2e: aload 0
      // 2f: getfield kqk.rf6 Z
      // 32: iload 3
      // 33: ifeq 4a
      // 36: ifne 46
      // 39: goto 40
      // 3c: invokestatic kqk.b (Loov;)Loov;
      // 3f: athrow
      // 40: aload 2
      // 41: areturn
      // 42: invokestatic kqk.b (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getfield kqk.j2n Z
      // 4a: ifeq 99
      // 4d: aload 2
      // 4e: iload 3
      // 4f: ifeq b4
      // 52: goto 59
      // 55: invokestatic kqk.b (Loov;)Loov;
      // 58: athrow
      // 59: getstatic w51.gx9 Lw51;
      // 5c: if_acmpne b3
      // 5f: goto 66
      // 62: invokestatic kqk.b (Loov;)Loov;
      // 65: athrow
      // 66: aload 1
      // 67: invokeinterface zfz.r_y ()Le0x; 1
      // 6c: astore 4
      // 6e: aload 4
      // 70: instanceof fcu
      // 73: iload 3
      // 74: ifeq 8c
      // 77: ifeq 87
      // 7a: goto 81
      // 7d: invokestatic kqk.b (Loov;)Loov;
      // 80: athrow
      // 81: aload 2
      // 82: areturn
      // 83: invokestatic kqk.b (Loov;)Loov;
      // 86: athrow
      // 87: aload 4
      // 89: instanceof kuv
      // 8c: ifeq 95
      // 8f: aload 2
      // 90: areturn
      // 91: invokestatic kqk.b (Loov;)Loov;
      // 94: athrow
      // 95: getstatic w51.oja Lw51;
      // 98: areturn
      // 99: aload 2
      // 9a: iload 3
      // 9b: ifeq b4
      // 9e: getstatic w51.oja Lw51;
      // a1: if_acmpne b3
      // a4: goto ab
      // a7: invokestatic kqk.b (Loov;)Loov;
      // aa: athrow
      // ab: getstatic w51.gx9 Lw51;
      // ae: areturn
      // af: invokestatic kqk.b (Loov;)Loov;
      // b2: athrow
      // b3: aload 2
      // b4: areturn
   }

   private void d0s(wi5 var1, cbc var2, boolean[] var3) {
      this.l_s(w51.gx9, var1, var2, var3);
      this.l_s(w51.oja, var1, var2, var3);
      this.l_s(w51.mem, var1, var2, var3);
   }

   private void l_s(w51 param1, wi5 param2, cbc param3, boolean[] param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 2
      // 06: aload 1
      // 07: invokevirtual wi5._0d (Lw51;)Lq3g;
      // 0a: astore 6
      // 0c: iload 5
      // 0e: ifne 2c
      // 11: aload 6
      // 13: invokevirtual q3g.rbv ()Z
      // 16: ifeq 34
      // 19: goto 20
      // 1c: invokestatic kqk.b (Loov;)Loov;
      // 1f: athrow
      // 20: aload 3
      // 21: aload 1
      // 22: invokevirtual cbc.okj (Lw51;)V
      // 25: goto 2c
      // 28: invokestatic kqk.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 4
      // 2e: aload 1
      // 2f: invokevirtual w51.ordinal ()I
      // 32: bipush 1
      // 33: bastore
      // 34: return
   }

   private ChunkCacheOF _e8(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: bipush -1
      // 02: bipush -1
      // 03: bipush -1
      // 04: invokevirtual mew.ec4 (III)Lmew;
      // 07: astore 3
      // 08: invokestatic t9d.b ()I
      // 0b: aload 1
      // 0c: bipush 16
      // 0e: bipush 16
      // 10: bipush 16
      // 12: invokevirtual mew.ec4 (III)Lmew;
      // 15: astore 4
      // 17: istore 2
      // 18: aload 0
      // 19: aload 0
      // 1a: getfield kqk.y0y Lt9d;
      // 1d: aload 3
      // 1e: aload 4
      // 20: bipush 1
      // 21: invokevirtual kqk.tin (Lt9d;Lmew;Lmew;I)Lnem;
      // 24: astore 5
      // 26: getstatic net/optifine/reflect/Reflector.MinecraftForgeClient_onRebuildChunk Lnet/optifine/reflect/ReflectorMethod;
      // 29: iload 2
      // 2a: ifeq 5b
      // 2d: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 30: ifeq 5c
      // 33: goto 3a
      // 36: invokestatic kqk.b (Loov;)Loov;
      // 39: athrow
      // 3a: getstatic net/optifine/reflect/Reflector.MinecraftForgeClient_onRebuildChunk Lnet/optifine/reflect/ReflectorMethod;
      // 3d: bipush 3
      // 3e: anewarray 16
      // 41: dup
      // 42: bipush 0
      // 43: aload 0
      // 44: getfield kqk.y0y Lt9d;
      // 47: aastore
      // 48: dup
      // 49: bipush 1
      // 4a: aload 1
      // 4b: aastore
      // 4c: dup
      // 4d: bipush 2
      // 4e: aload 5
      // 50: aastore
      // 51: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 54: goto 5b
      // 57: invokestatic kqk.b (Loov;)Loov;
      // 5a: athrow
      // 5b: pop
      // 5c: new net/optifine/override/ChunkCacheOF
      // 5f: dup
      // 60: aload 5
      // 62: aload 3
      // 63: aload 4
      // 65: bipush 1
      // 66: invokespecial net/optifine/override/ChunkCacheOF.<init> (Ltp4;Lmew;Lmew;I)V
      // 69: astore 6
      // 6b: aload 6
      // 6d: areturn
   }

   public kqk sy1(c1s var1, vt2 var2) {
      int var3 = t9d.c();

      try {
         if (var3 != 0) {
            return this;
         }

         if (this.p4q) {
            return this.db1[var2.ordinal()];
         }
      } catch (oov var8) {
         throw b(var8);
      }

      int var4 = 0;

      while (var4 < vt2.vbu.length) {
         vt2 var5 = vt2.vbu[var4];
         mew var6 = this.a8d(var5);

         try {
            this.db1[var4] = var1.bes(var6);
            var4++;
            if (var3 != 0) {
               return this.db1[var2.ordinal()];
            }

            if (var3 != 0) {
               break;
            }
         } catch (oov var7) {
            throw b(var7);
         }
      }

      this.p4q = true;
      return this.db1[var2.ordinal()];
   }

   public tts v5v() {
      return this.eil(this.fxe);
   }

   private tts eil(mew param1) {
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
      // 05: getfield kqk.a24 Ltts;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 46
      // 0e: ifnull 37
      // 11: goto 18
      // 14: invokestatic kqk.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 3
      // 19: iload 2
      // 1a: ifne 46
      // 1d: goto 24
      // 20: invokestatic kqk.b (Loov;)Loov;
      // 23: athrow
      // 24: invokevirtual tts.yx3 ()Z
      // 27: ifeq 37
      // 2a: goto 31
      // 2d: invokestatic kqk.b (Loov;)Loov;
      // 30: athrow
      // 31: aload 3
      // 32: areturn
      // 33: invokestatic kqk.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield kqk.y0y Lt9d;
      // 3b: aload 1
      // 3c: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 3f: astore 3
      // 40: aload 0
      // 41: aload 3
      // 42: putfield kqk.a24 Ltts;
      // 45: aload 3
      // 46: areturn
   }

   public boolean _sw() {
      return this.noy(this.fxe);
   }

   private boolean noy(mew var1) {
      int var2 = var1.getY();
      int var3 = var2 + 15;
      return this.eil(var1).sal(var2, var3);
   }

   public void cfx(vt2 var1, kqk var2) {
      this.t1t[var1.ordinal()] = var2;
      this.v41[var1.ordinal()] = var2;
   }

   public kqk ckf(vt2 param1) {
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
      // 06: ifne 2a
      // 09: getfield kqk.n46 Z
      // 0c: ifne 21
      // 0f: goto 16
      // 12: invokestatic kqk.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial kqk.cxn ()V
      // 1a: goto 21
      // 1d: invokestatic kqk.b (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield kqk.v41 [Lkqk;
      // 25: aload 1
      // 26: invokevirtual vt2.ordinal ()I
      // 29: aaload
      // 2a: areturn
   }

   public crp$j3h fcl() {
      return this.wwd;
   }

   private void cxn() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual kqk.a7g ()Lmew;
      // 004: invokevirtual mew.getX ()I
      // 007: istore 2
      // 008: aload 0
      // 009: invokevirtual kqk.a7g ()Lmew;
      // 00c: invokevirtual mew.getZ ()I
      // 00f: istore 3
      // 010: getstatic vt2.z9q Lvt2;
      // 013: invokevirtual vt2.ordinal ()I
      // 016: istore 4
      // 018: invokestatic t9d.b ()I
      // 01b: getstatic vt2.mxp Lvt2;
      // 01e: invokevirtual vt2.ordinal ()I
      // 021: istore 5
      // 023: getstatic vt2.te4 Lvt2;
      // 026: invokevirtual vt2.ordinal ()I
      // 029: istore 6
      // 02b: getstatic vt2.zk4 Lvt2;
      // 02e: invokevirtual vt2.ordinal ()I
      // 031: istore 7
      // 033: istore 1
      // 034: aload 0
      // 035: getfield kqk.v41 [Lkqk;
      // 038: iload 4
      // 03a: aload 0
      // 03b: getfield kqk.t1t [Lkqk;
      // 03e: iload 4
      // 040: aaload
      // 041: iload 1
      // 042: ifeq 067
      // 045: invokevirtual kqk.a7g ()Lmew;
      // 048: invokevirtual mew.getZ ()I
      // 04b: iload 3
      // 04c: bipush 16
      // 04e: isub
      // 04f: if_icmpne 06a
      // 052: goto 059
      // 055: invokestatic kqk.b (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield kqk.t1t [Lkqk;
      // 05d: iload 4
      // 05f: aaload
      // 060: goto 067
      // 063: invokestatic kqk.b (Loov;)Loov;
      // 066: athrow
      // 067: goto 06b
      // 06a: aconst_null
      // 06b: aastore
      // 06c: aload 0
      // 06d: getfield kqk.v41 [Lkqk;
      // 070: iload 5
      // 072: aload 0
      // 073: getfield kqk.t1t [Lkqk;
      // 076: iload 5
      // 078: aaload
      // 079: iload 1
      // 07a: ifeq 09f
      // 07d: invokevirtual kqk.a7g ()Lmew;
      // 080: invokevirtual mew.getZ ()I
      // 083: iload 3
      // 084: bipush 16
      // 086: iadd
      // 087: if_icmpne 0a2
      // 08a: goto 091
      // 08d: invokestatic kqk.b (Loov;)Loov;
      // 090: athrow
      // 091: aload 0
      // 092: getfield kqk.t1t [Lkqk;
      // 095: iload 5
      // 097: aaload
      // 098: goto 09f
      // 09b: invokestatic kqk.b (Loov;)Loov;
      // 09e: athrow
      // 09f: goto 0a3
      // 0a2: aconst_null
      // 0a3: aastore
      // 0a4: aload 0
      // 0a5: getfield kqk.v41 [Lkqk;
      // 0a8: iload 6
      // 0aa: aload 0
      // 0ab: getfield kqk.t1t [Lkqk;
      // 0ae: iload 6
      // 0b0: aaload
      // 0b1: iload 1
      // 0b2: ifeq 0d7
      // 0b5: invokevirtual kqk.a7g ()Lmew;
      // 0b8: invokevirtual mew.getX ()I
      // 0bb: iload 2
      // 0bc: bipush 16
      // 0be: isub
      // 0bf: if_icmpne 0da
      // 0c2: goto 0c9
      // 0c5: invokestatic kqk.b (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: getfield kqk.t1t [Lkqk;
      // 0cd: iload 6
      // 0cf: aaload
      // 0d0: goto 0d7
      // 0d3: invokestatic kqk.b (Loov;)Loov;
      // 0d6: athrow
      // 0d7: goto 0db
      // 0da: aconst_null
      // 0db: aastore
      // 0dc: aload 0
      // 0dd: getfield kqk.v41 [Lkqk;
      // 0e0: iload 7
      // 0e2: aload 0
      // 0e3: getfield kqk.t1t [Lkqk;
      // 0e6: iload 7
      // 0e8: aaload
      // 0e9: iload 1
      // 0ea: ifeq 10f
      // 0ed: invokevirtual kqk.a7g ()Lmew;
      // 0f0: invokevirtual mew.getX ()I
      // 0f3: iload 2
      // 0f4: bipush 16
      // 0f6: iadd
      // 0f7: if_icmpne 112
      // 0fa: goto 101
      // 0fd: invokestatic kqk.b (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: getfield kqk.t1t [Lkqk;
      // 105: iload 7
      // 107: aaload
      // 108: goto 10f
      // 10b: invokestatic kqk.b (Loov;)Loov;
      // 10e: athrow
      // 10f: goto 113
      // 112: aconst_null
      // 113: aastore
      // 114: aload 0
      // 115: bipush 1
      // 116: putfield kqk.n46 Z
      // 119: return
   }

   public boolean k4g(_aq var1, int var2) {
      int var3 = t9d.c();

      try {
         boolean var10000 = this.g06().isBoundingBoxInFrustumFully(var1, var2);
         if (var3 != 0) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      } catch (oov var4) {
         throw b(var4);
      }

      return var1.n2v(this.bwb);
   }

   public AabbFrame g06() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield kqk.n5_ Lnet/optifine/render/AabbFrame;
      // 008: iload 1
      // 009: ifne 156
      // 00c: ifnonnull 152
      // 00f: goto 016
      // 012: invokestatic kqk.b (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual kqk.a7g ()Lmew;
      // 01a: astore 2
      // 01b: aload 2
      // 01c: invokevirtual mew.getX ()I
      // 01f: istore 3
      // 020: aload 2
      // 021: invokevirtual mew.getY ()I
      // 024: istore 4
      // 026: aload 2
      // 027: invokevirtual mew.getZ ()I
      // 02a: istore 5
      // 02c: bipush 5
      // 02d: istore 6
      // 02f: iload 3
      // 030: iload 6
      // 032: ishr
      // 033: iload 6
      // 035: ishl
      // 036: istore 7
      // 038: iload 4
      // 03a: iload 6
      // 03c: ishr
      // 03d: iload 6
      // 03f: ishl
      // 040: istore 8
      // 042: iload 5
      // 044: iload 6
      // 046: ishr
      // 047: iload 6
      // 049: ishl
      // 04a: istore 9
      // 04c: iload 7
      // 04e: iload 3
      // 04f: iload 1
      // 050: ifne 068
      // 053: if_icmpne 084
      // 056: goto 05d
      // 059: invokestatic kqk.b (Loov;)Loov;
      // 05c: athrow
      // 05d: iload 8
      // 05f: iload 4
      // 061: goto 068
      // 064: invokestatic kqk.b (Loov;)Loov;
      // 067: athrow
      // 068: iload 1
      // 069: ifne 081
      // 06c: if_icmpne 084
      // 06f: goto 076
      // 072: invokestatic kqk.b (Loov;)Loov;
      // 075: athrow
      // 076: iload 9
      // 078: iload 5
      // 07a: goto 081
      // 07d: invokestatic kqk.b (Loov;)Loov;
      // 080: athrow
      // 081: if_icmpeq 114
      // 084: aload 0
      // 085: getfield kqk.lk_ Lcrp;
      // 088: new mew
      // 08b: dup
      // 08c: iload 7
      // 08e: iload 8
      // 090: iload 9
      // 092: invokespecial mew.<init> (III)V
      // 095: invokevirtual crp.x93 (Lmew;)Lkqk;
      // 098: invokevirtual kqk.g06 ()Lnet/optifine/render/AabbFrame;
      // 09b: astore 10
      // 09d: aload 10
      // 09f: iload 1
      // 0a0: ifne 118
      // 0a3: ifnull 114
      // 0a6: goto 0ad
      // 0a9: invokestatic kqk.b (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 10
      // 0af: iload 1
      // 0b0: ifne 118
      // 0b3: goto 0ba
      // 0b6: invokestatic kqk.b (Loov;)Loov;
      // 0b9: athrow
      // 0ba: getfield net/optifine/render/AabbFrame.rlc D
      // 0bd: iload 7
      // 0bf: i2d
      // 0c0: dcmpl
      // 0c1: ifne 114
      // 0c4: goto 0cb
      // 0c7: invokestatic kqk.b (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 10
      // 0cd: iload 1
      // 0ce: ifne 118
      // 0d1: goto 0d8
      // 0d4: invokestatic kqk.b (Loov;)Loov;
      // 0d7: athrow
      // 0d8: getfield net/optifine/render/AabbFrame.bx_ D
      // 0db: iload 8
      // 0dd: i2d
      // 0de: dcmpl
      // 0df: ifne 114
      // 0e2: goto 0e9
      // 0e5: invokestatic kqk.b (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 10
      // 0eb: iload 1
      // 0ec: ifne 118
      // 0ef: goto 0f6
      // 0f2: invokestatic kqk.b (Loov;)Loov;
      // 0f5: athrow
      // 0f6: getfield net/optifine/render/AabbFrame.t8n D
      // 0f9: iload 9
      // 0fb: i2d
      // 0fc: dcmpl
      // 0fd: ifne 114
      // 100: goto 107
      // 103: invokestatic kqk.b (Loov;)Loov;
      // 106: athrow
      // 107: aload 0
      // 108: aload 10
      // 10a: putfield kqk.n5_ Lnet/optifine/render/AabbFrame;
      // 10d: goto 114
      // 110: invokestatic kqk.b (Loov;)Loov;
      // 113: athrow
      // 114: aload 0
      // 115: getfield kqk.n5_ Lnet/optifine/render/AabbFrame;
      // 118: iload 1
      // 119: ifne 156
      // 11c: ifnonnull 152
      // 11f: goto 126
      // 122: invokestatic kqk.b (Loov;)Loov;
      // 125: athrow
      // 126: bipush 1
      // 127: iload 6
      // 129: ishl
      // 12a: istore 10
      // 12c: aload 0
      // 12d: new net/optifine/render/AabbFrame
      // 130: dup
      // 131: iload 7
      // 133: i2d
      // 134: iload 8
      // 136: i2d
      // 137: iload 9
      // 139: i2d
      // 13a: iload 7
      // 13c: iload 10
      // 13e: iadd
      // 13f: i2d
      // 140: iload 8
      // 142: iload 10
      // 144: iadd
      // 145: i2d
      // 146: iload 9
      // 148: iload 10
      // 14a: iadd
      // 14b: i2d
      // 14c: invokespecial net/optifine/render/AabbFrame.<init> (DDDDDD)V
      // 14f: putfield kqk.n5_ Lnet/optifine/render/AabbFrame;
      // 152: aload 0
      // 153: getfield kqk.n5_ Lnet/optifine/render/AabbFrame;
      // 156: areturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 110298092245117L;
      return a<"p">(27868, 3456418611418556670L ^ var1) + this.a7g() + a<"p">(2228, 2345135035045055639L ^ var1) + this.m0e;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1218853552679131703L, -8787525310513821721L, MethodHandles.lookup().lookupClass()).a(5052895546352L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 49940764401534L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u001aT8~û×BzBf\u0012Õ¢ó¼<Ó\u0096±+þ¶<\u0010\u009cSav\u007fÂ Q\u0010_\u008e3ûPR?ô\u0017\u001c\u001eü\u0016·\u008fÃ";
      int var8 = "\u001aT8~û×BzBf\u0012Õ¢ó¼<Ó\u0096±+þ¶<\u0010\u009cSav\u007fÂ Q\u0010_\u008e3ûPR?ô\u0017\u001c\u001eü\u0016·\u008fÃ".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            pxj = w51.values();
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7958;
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
            throw new RuntimeException("kqk", var10);
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
         throw new RuntimeException("kqk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
