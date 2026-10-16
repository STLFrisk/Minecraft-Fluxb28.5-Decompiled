package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class S3EPacketTeams implements mz2 {
   private String rdj = "";
   private String x30 = "";
   private String gjq = "";
   private String w5k = "";
   private String k61 = n_0$ajs.yyy.fq2;
   private int b68 = -1;
   private Collection cml = Lists.newArrayList();
   private int tet;
   private int d4j;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public S3EPacketTeams() {
   }

   public S3EPacketTeams(q2m param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 07: aload 0
      // 08: ldc ""
      // 0a: nop
      // 0b: putfield net/minecraft/network/play/server/S3EPacketTeams.rdj Ljava/lang/String;
      // 0e: aload 0
      // 0f: ldc ""
      // 11: nop
      // 12: putfield net/minecraft/network/play/server/S3EPacketTeams.x30 Ljava/lang/String;
      // 15: aload 0
      // 16: ldc ""
      // 18: nop
      // 19: putfield net/minecraft/network/play/server/S3EPacketTeams.gjq Ljava/lang/String;
      // 1c: aload 0
      // 1d: ldc ""
      // 1f: nop
      // 20: putfield net/minecraft/network/play/server/S3EPacketTeams.w5k Ljava/lang/String;
      // 23: aload 0
      // 24: getstatic n_0$ajs.yyy Ln_0$ajs;
      // 27: getfield n_0$ajs.fq2 Ljava/lang/String;
      // 2a: putfield net/minecraft/network/play/server/S3EPacketTeams.k61 Ljava/lang/String;
      // 2d: aload 0
      // 2e: bipush -1
      // 2f: putfield net/minecraft/network/play/server/S3EPacketTeams.b68 I
      // 32: aload 0
      // 33: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 36: putfield net/minecraft/network/play/server/S3EPacketTeams.cml Ljava/util/Collection;
      // 39: astore 3
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokevirtual q2m.fm9 ()Ljava/lang/String;
      // 3f: putfield net/minecraft/network/play/server/S3EPacketTeams.rdj Ljava/lang/String;
      // 42: aload 0
      // 43: iload 2
      // 44: putfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 47: aload 3
      // 48: ifnull 9f
      // 4b: iload 2
      // 4c: ifeq 6d
      // 4f: goto 56
      // 52: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 55: athrow
      // 56: iload 2
      // 57: aload 3
      // 58: ifnull ab
      // 5b: goto 62
      // 5e: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61: athrow
      // 62: bipush 2
      // 63: if_icmpne aa
      // 66: goto 6d
      // 69: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 1
      // 6f: invokevirtual q2m.m6i ()Ljava/lang/String;
      // 72: putfield net/minecraft/network/play/server/S3EPacketTeams.x30 Ljava/lang/String;
      // 75: aload 0
      // 76: aload 1
      // 77: invokevirtual q2m.wyj ()Ljava/lang/String;
      // 7a: putfield net/minecraft/network/play/server/S3EPacketTeams.gjq Ljava/lang/String;
      // 7d: aload 0
      // 7e: aload 1
      // 7f: invokevirtual q2m.zme ()Ljava/lang/String;
      // 82: putfield net/minecraft/network/play/server/S3EPacketTeams.w5k Ljava/lang/String;
      // 85: aload 0
      // 86: aload 1
      // 87: invokevirtual q2m.w14 ()I
      // 8a: putfield net/minecraft/network/play/server/S3EPacketTeams.d4j I
      // 8d: aload 0
      // 8e: aload 1
      // 8f: invokevirtual q2m.xge ()Ln_0$ajs;
      // 92: getfield n_0$ajs.fq2 Ljava/lang/String;
      // 95: putfield net/minecraft/network/play/server/S3EPacketTeams.k61 Ljava/lang/String;
      // 98: goto 9f
      // 9b: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9e: athrow
      // 9f: aload 0
      // a0: aload 1
      // a1: invokevirtual q2m.z84 ()Lsyo;
      // a4: invokevirtual syo.h6w ()I
      // a7: putfield net/minecraft/network/play/server/S3EPacketTeams.b68 I
      // aa: iload 2
      // ab: aload 3
      // ac: ifnull cd
      // af: ifne ce
      // b2: goto b9
      // b5: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b8: athrow
      // b9: aload 0
      // ba: getfield net/minecraft/network/play/server/S3EPacketTeams.cml Ljava/util/Collection;
      // bd: aload 1
      // be: invokevirtual q2m.vsw ()Ljava/util/Collection;
      // c1: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // c6: goto cd
      // c9: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cc: athrow
      // cd: pop
      // ce: return
   }

   public S3EPacketTeams(q2m param1, Collection param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/network/play/server/S3EPacketTeams.a J
      // 03: ldc2_w 2867190407576
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: invokespecial java/lang/Object.<init> ()V
      // 0d: aload 0
      // 0e: ldc ""
      // 10: nop
      // 11: putfield net/minecraft/network/play/server/S3EPacketTeams.rdj Ljava/lang/String;
      // 14: aload 0
      // 15: ldc ""
      // 17: nop
      // 18: putfield net/minecraft/network/play/server/S3EPacketTeams.x30 Ljava/lang/String;
      // 1b: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 1e: aload 0
      // 1f: ldc ""
      // 21: nop
      // 22: putfield net/minecraft/network/play/server/S3EPacketTeams.gjq Ljava/lang/String;
      // 25: astore 6
      // 27: aload 0
      // 28: ldc ""
      // 2a: nop
      // 2b: putfield net/minecraft/network/play/server/S3EPacketTeams.w5k Ljava/lang/String;
      // 2e: aload 0
      // 2f: getstatic n_0$ajs.yyy Ln_0$ajs;
      // 32: getfield n_0$ajs.fq2 Ljava/lang/String;
      // 35: putfield net/minecraft/network/play/server/S3EPacketTeams.k61 Ljava/lang/String;
      // 38: aload 0
      // 39: bipush -1
      // 3a: putfield net/minecraft/network/play/server/S3EPacketTeams.b68 I
      // 3d: aload 0
      // 3e: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 41: putfield net/minecraft/network/play/server/S3EPacketTeams.cml Ljava/util/Collection;
      // 44: iload 3
      // 45: bipush 3
      // 46: aload 6
      // 48: ifnull 5e
      // 4b: if_icmpeq 7c
      // 4e: goto 55
      // 51: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: iload 3
      // 56: bipush 4
      // 57: goto 5e
      // 5a: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: if_icmpeq 7c
      // 61: new java/lang/IllegalArgumentException
      // 64: dup
      // 65: sipush 4162
      // 68: ldc2_w 8330963892719757691
      // 6b: lload 4
      // 6d: lxor
      // 6e: invokedynamic f (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: nop
      // 74: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 77: athrow
      // 78: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: aload 2
      // 7d: aload 6
      // 7f: ifnull 8d
      // 82: ifnull c5
      // 85: goto 8c
      // 88: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8b: athrow
      // 8c: aload 2
      // 8d: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 92: aload 6
      // 94: ifnull bf
      // 97: ifne c5
      // 9a: goto a1
      // 9d: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a0: athrow
      // a1: aload 0
      // a2: iload 3
      // a3: putfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // a6: aload 0
      // a7: aload 1
      // a8: invokevirtual q2m.fm9 ()Ljava/lang/String;
      // ab: putfield net/minecraft/network/play/server/S3EPacketTeams.rdj Ljava/lang/String;
      // ae: aload 0
      // af: getfield net/minecraft/network/play/server/S3EPacketTeams.cml Ljava/util/Collection;
      // b2: aload 2
      // b3: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // b8: goto bf
      // bb: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // be: athrow
      // bf: pop
      // c0: aload 6
      // c2: ifnonnull e0
      // c5: new java/lang/IllegalArgumentException
      // c8: dup
      // c9: sipush 2005
      // cc: ldc2_w 6952069301925396205
      // cf: lload 4
      // d1: lxor
      // d2: invokedynamic f (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7: nop
      // d8: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // db: athrow
      // dc: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // df: athrow
      // e0: return
   }

   @Override
   public void ajj(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: bipush 16
      // 04: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 07: putfield net/minecraft/network/play/server/S3EPacketTeams.rdj Ljava/lang/String;
      // 0a: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokevirtual nfj.readByte ()B
      // 12: putfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 15: astore 2
      // 16: aload 0
      // 17: aload 2
      // 18: ifnull 7a
      // 1b: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 1e: ifeq 42
      // 21: goto 28
      // 24: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 2c: aload 2
      // 2d: ifnull 85
      // 30: goto 37
      // 33: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: bipush 2
      // 38: if_icmpne 81
      // 3b: goto 42
      // 3e: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aload 0
      // 43: aload 1
      // 44: bipush 32
      // 46: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 49: putfield net/minecraft/network/play/server/S3EPacketTeams.x30 Ljava/lang/String;
      // 4c: aload 0
      // 4d: aload 1
      // 4e: bipush 16
      // 50: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 53: putfield net/minecraft/network/play/server/S3EPacketTeams.gjq Ljava/lang/String;
      // 56: aload 0
      // 57: aload 1
      // 58: bipush 16
      // 5a: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 5d: putfield net/minecraft/network/play/server/S3EPacketTeams.w5k Ljava/lang/String;
      // 60: aload 0
      // 61: aload 1
      // 62: invokevirtual nfj.readByte ()B
      // 65: putfield net/minecraft/network/play/server/S3EPacketTeams.d4j I
      // 68: aload 0
      // 69: aload 1
      // 6a: bipush 32
      // 6c: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 6f: putfield net/minecraft/network/play/server/S3EPacketTeams.k61 Ljava/lang/String;
      // 72: aload 0
      // 73: goto 7a
      // 76: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 79: athrow
      // 7a: aload 1
      // 7b: invokevirtual nfj.readByte ()B
      // 7e: putfield net/minecraft/network/play/server/S3EPacketTeams.b68 I
      // 81: aload 0
      // 82: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 85: aload 2
      // 86: ifnull d2
      // 89: ifeq c7
      // 8c: goto 93
      // 8f: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 92: athrow
      // 93: aload 0
      // 94: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 97: aload 2
      // 98: ifnull d2
      // 9b: goto a2
      // 9e: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a1: athrow
      // a2: bipush 3
      // a3: if_icmpeq c7
      // a6: goto ad
      // a9: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ac: athrow
      // ad: aload 0
      // ae: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // b1: aload 2
      // b2: ifnull d2
      // b5: goto bc
      // b8: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bb: athrow
      // bc: bipush 4
      // bd: if_icmpne f3
      // c0: goto c7
      // c3: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c6: athrow
      // c7: aload 1
      // c8: invokevirtual nfj.gux ()I
      // cb: goto d2
      // ce: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d1: athrow
      // d2: istore 3
      // d3: bipush 0
      // d4: istore 4
      // d6: iload 4
      // d8: iload 3
      // d9: if_icmpge f3
      // dc: aload 0
      // dd: getfield net/minecraft/network/play/server/S3EPacketTeams.cml Ljava/util/Collection;
      // e0: aload 1
      // e1: bipush 40
      // e3: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // e6: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // eb: pop
      // ec: iinc 4 1
      // ef: aload 2
      // f0: ifnonnull d6
      // f3: return
   }

   @Override
   public void ddd(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 0
      // 006: getfield net/minecraft/network/play/server/S3EPacketTeams.rdj Ljava/lang/String;
      // 009: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 00c: pop
      // 00d: aload 1
      // 00e: aload 0
      // 00f: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 012: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 015: pop
      // 016: aload 2
      // 017: ifnull 076
      // 01a: aload 0
      // 01b: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 01e: ifeq 042
      // 021: goto 028
      // 024: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 027: athrow
      // 028: aload 0
      // 029: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 02c: aload 2
      // 02d: ifnull 08e
      // 030: goto 037
      // 033: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 036: athrow
      // 037: bipush 2
      // 038: if_icmpne 07f
      // 03b: goto 042
      // 03e: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 041: athrow
      // 042: aload 1
      // 043: aload 0
      // 044: getfield net/minecraft/network/play/server/S3EPacketTeams.x30 Ljava/lang/String;
      // 047: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 04a: pop
      // 04b: aload 1
      // 04c: aload 0
      // 04d: getfield net/minecraft/network/play/server/S3EPacketTeams.gjq Ljava/lang/String;
      // 050: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 053: pop
      // 054: aload 1
      // 055: aload 0
      // 056: getfield net/minecraft/network/play/server/S3EPacketTeams.w5k Ljava/lang/String;
      // 059: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 05c: pop
      // 05d: aload 1
      // 05e: aload 0
      // 05f: getfield net/minecraft/network/play/server/S3EPacketTeams.d4j I
      // 062: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 065: pop
      // 066: aload 1
      // 067: aload 0
      // 068: getfield net/minecraft/network/play/server/S3EPacketTeams.k61 Ljava/lang/String;
      // 06b: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 06e: pop
      // 06f: goto 076
      // 072: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 075: athrow
      // 076: aload 1
      // 077: aload 0
      // 078: getfield net/minecraft/network/play/server/S3EPacketTeams.b68 I
      // 07b: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 07e: pop
      // 07f: aload 0
      // 080: aload 2
      // 081: ifnull 0db
      // 084: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 087: goto 08e
      // 08a: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: ifeq 0c5
      // 091: aload 0
      // 092: aload 2
      // 093: ifnull 0db
      // 096: goto 09d
      // 099: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09c: athrow
      // 09d: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 0a0: bipush 3
      // 0a1: if_icmpeq 0c5
      // 0a4: goto 0ab
      // 0a7: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: aload 2
      // 0ad: ifnull 0db
      // 0b0: goto 0b7
      // 0b3: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b6: athrow
      // 0b7: getfield net/minecraft/network/play/server/S3EPacketTeams.tet I
      // 0ba: bipush 4
      // 0bb: if_icmpne 103
      // 0be: goto 0c5
      // 0c1: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c4: athrow
      // 0c5: aload 1
      // 0c6: aload 0
      // 0c7: getfield net/minecraft/network/play/server/S3EPacketTeams.cml Ljava/util/Collection;
      // 0ca: invokeinterface java/util/Collection.size ()I 1
      // 0cf: invokevirtual nfj.tao (I)Lnfj;
      // 0d2: pop
      // 0d3: aload 0
      // 0d4: goto 0db
      // 0d7: invokestatic net/minecraft/network/play/server/S3EPacketTeams.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0da: athrow
      // 0db: getfield net/minecraft/network/play/server/S3EPacketTeams.cml Ljava/util/Collection;
      // 0de: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0e3: astore 3
      // 0e4: aload 3
      // 0e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ea: ifeq 103
      // 0ed: aload 3
      // 0ee: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f3: checkcast java/lang/String
      // 0f6: astore 4
      // 0f8: aload 1
      // 0f9: aload 4
      // 0fb: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 0fe: pop
      // 0ff: aload 2
      // 100: ifnonnull 0e4
      // 103: return
   }

   public void wqx(jsv var1) {
      var1.n_s(this);
   }

   public String lpn() {
      return this.rdj;
   }

   public String u47() {
      return this.x30;
   }

   public String wto() {
      return this.gjq;
   }

   public String tlo() {
      return this.w5k;
   }

   public Collection pgm() {
      return this.cml;
   }

   public int zo9() {
      return this.tet;
   }

   public int hnz() {
      return this.d4j;
   }

   public int r8g() {
      return this.b68;
   }

   public String o1y() {
      return this.k61;
   }

   @Override
   public void ito(yw3 var1) {
      this.wqx((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6957596665565132564L, 4394683024517084349L, MethodHandles.lookup().lookupClass()).a(234842113954189L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 138009851102460L;
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
      String var6 = "\u0007Õ\u0098:JJoW4\u008e\u008b¡áb&p·C\u008beP÷Øá\u0019Ì\u001fÚ\u0016$\u008b¶:öG(\u0006\u0016m\u0098)ª¢*»ú2\u0087<\u0002\u0007\u0016\u001f?\u001e\u0002£¡DÜs+±'\u0096\u0085ú¸\u009c\u001d2{¬aÅzÐÇ«\u0003Z Å\u001b _s30×8ÈÖd\u0090\u0019=d\u0093\u0003Þ\u0085;º»\rt\u0015¬ta§4\u0096\u0010¯8\u009aâ5\u0093\u0097^ª\u0096]\u0095ÅLC~¬ò\u0097\u008b´\u0087";
      int var8 = "\u0007Õ\u0098:JJoW4\u008e\u008b¡áb&p·C\u008beP÷Øá\u0019Ì\u001fÚ\u0016$\u008b¶:öG(\u0006\u0016m\u0098)ª¢*»ú2\u0087<\u0002\u0007\u0016\u001f?\u001e\u0002£¡DÜs+±'\u0096\u0085ú¸\u009c\u001d2{¬aÅzÐÇ«\u0003Z Å\u001b _s30×8ÈÖd\u0090\u0019=d\u0093\u0003Þ\u0085;º»\rt\u0015¬ta§4\u0096\u0010¯8\u009aâ5\u0093\u0097^ª\u0096]\u0095ÅLC~¬ò\u0097\u008b´\u0087"
         .length();
      char var5 = 'X';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5942;
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
            throw new RuntimeException("net/minecraft/network/play/server/S3EPacketTeams", var10);
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
         throw new RuntimeException("net/minecraft/network/play/server/S3EPacketTeams" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
