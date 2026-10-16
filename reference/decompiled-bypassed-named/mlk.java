import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import io.netty.util.concurrent.GenericFutureListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import net.minecraft.network.play.client.C11PacketEnchantItem;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.network.play.client.C15PacketClientSettings;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.client.C18PacketSpectate;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import net.minecraft.network.play.server.S3APacketTabComplete;
import net.minecraft.network.play.server.S40PacketDisconnect;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mlk implements no5, xcy {
   private static final Logger f_4;
   public final hv0 h1h;
   private final vr1 jcx;
   public z96 fle;
   private int nhp;
   private int glb;
   private int h4p;
   private boolean x37;
   private int h61;
   private long xwb;
   private long wxi;
   private int jiw;
   private int sz3;
   private pni axq = new pni();
   private double ci5;
   private double viz;
   private double dj7;
   private boolean zoq = true;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public mlk(vr1 var1, hv0 var2, z96 var3) {
      this.jcx = var1;
      this.h1h = var2;
      var2.kbj(this);
      this.fle = var3;
      var3.rhh = this;
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 74457344623048
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: bipush 0
      // 00a: putfield mlk.x37 Z
      // 00d: invokestatic OpaquePredicate.c ()I
      // 010: aload 0
      // 011: dup
      // 012: getfield mlk.nhp I
      // 015: bipush 1
      // 016: iadd
      // 017: putfield mlk.nhp I
      // 01a: istore 3
      // 01b: aload 0
      // 01c: getfield mlk.jcx Lvr1;
      // 01f: getfield vr1.gi7 Luan;
      // 022: sipush 24641
      // 025: ldc2_w 8651319401258247209
      // 028: lload 1
      // 029: lxor
      // 02a: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: nop
      // 030: invokevirtual uan.qek (Ljava/lang/String;)V
      // 033: aload 0
      // 034: getfield mlk.nhp I
      // 037: i2l
      // 038: aload 0
      // 039: getfield mlk.wxi J
      // 03c: lsub
      // 03d: ldc2_w 40
      // 040: lcmp
      // 041: iload 3
      // 042: ifne 08d
      // 045: ifle 07f
      // 048: goto 04f
      // 04b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 0
      // 050: aload 0
      // 051: getfield mlk.nhp I
      // 054: i2l
      // 055: putfield mlk.wxi J
      // 058: aload 0
      // 059: aload 0
      // 05a: invokespecial mlk.m5q ()J
      // 05d: putfield mlk.xwb J
      // 060: aload 0
      // 061: aload 0
      // 062: getfield mlk.xwb J
      // 065: l2i
      // 066: putfield mlk.h61 I
      // 069: aload 0
      // 06a: new net/minecraft/network/play/server/S00PacketKeepAlive
      // 06d: dup
      // 06e: aload 0
      // 06f: getfield mlk.h61 I
      // 072: invokespecial net/minecraft/network/play/server/S00PacketKeepAlive.<init> (I)V
      // 075: invokevirtual mlk.vnf (Lmz2;)V
      // 078: goto 07f
      // 07b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield mlk.jcx Lvr1;
      // 083: getfield vr1.gi7 Luan;
      // 086: invokevirtual uan.uio ()V
      // 089: aload 0
      // 08a: getfield mlk.jiw I
      // 08d: iload 3
      // 08e: ifne 0b0
      // 091: ifle 0ac
      // 094: goto 09b
      // 097: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 0
      // 09c: dup
      // 09d: getfield mlk.jiw I
      // 0a0: bipush 1
      // 0a1: isub
      // 0a2: putfield mlk.jiw I
      // 0a5: goto 0ac
      // 0a8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: getfield mlk.sz3 I
      // 0b0: iload 3
      // 0b1: ifne 0d8
      // 0b4: ifle 0cf
      // 0b7: goto 0be
      // 0ba: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: dup
      // 0c0: getfield mlk.sz3 I
      // 0c3: bipush 1
      // 0c4: isub
      // 0c5: putfield mlk.sz3 I
      // 0c8: goto 0cf
      // 0cb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield mlk.fle Lz96;
      // 0d3: invokevirtual z96.d27 ()J
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iload 3
      // 0d9: ifne 0f4
      // 0dc: ifle 140
      // 0df: goto 0e6
      // 0e2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: getfield mlk.jcx Lvr1;
      // 0ea: invokevirtual vr1.auw ()I
      // 0ed: goto 0f4
      // 0f0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: iload 3
      // 0f5: ifne 124
      // 0f8: ifle 140
      // 0fb: goto 102
      // 0fe: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: invokestatic vr1.spw ()J
      // 105: aload 0
      // 106: getfield mlk.fle Lz96;
      // 109: invokevirtual z96.d27 ()J
      // 10c: lsub
      // 10d: aload 0
      // 10e: getfield mlk.jcx Lvr1;
      // 111: invokevirtual vr1.auw ()I
      // 114: sipush 1000
      // 117: imul
      // 118: bipush 60
      // 11a: imul
      // 11b: i2l
      // 11c: lcmp
      // 11d: goto 124
      // 120: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: ifle 140
      // 127: aload 0
      // 128: sipush 15505
      // 12b: ldc2_w 1981817674064574679
      // 12e: lload 1
      // 12f: lxor
      // 130: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: nop
      // 136: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 139: goto 140
      // 13c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: return
   }

   public hv0 hss() {
      return this.h1h;
   }

   public void wr4(String var1) {
      tao var2 = new tao(var1);
      this.h1h.pl0(new S40PacketDisconnect(var2), new mlk$1(this, var2), new GenericFutureListener[0]);
      this.h1h.mzp();
      Futures.getUnchecked(this.jcx.acd(new mlk$2(this)));
   }

   @Override
   public void k2j(C0CPacketInput var1) {
      et9.hqd(var1, this, this.fle.b88());
      this.fle.u6_(var1.jrg(), var1.thh(), var1.gnt(), var1.jrv());
   }

   private boolean fdt(C03PacketPlayer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.yle ()D
      // 08: invokestatic com/google/common/primitives/Doubles.isFinite (D)Z
      // 0b: iload 2
      // 0c: ifeq 8a
      // 0f: ifeq 89
      // 12: goto 19
      // 15: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.pow ()D
      // 1d: invokestatic com/google/common/primitives/Doubles.isFinite (D)Z
      // 20: iload 2
      // 21: ifeq 8a
      // 24: goto 2b
      // 27: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: ifeq 89
      // 2e: goto 35
      // 31: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.i50 ()D
      // 39: invokestatic com/google/common/primitives/Doubles.isFinite (D)Z
      // 3c: iload 2
      // 3d: ifeq 8a
      // 40: goto 47
      // 43: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: ifeq 89
      // 4a: goto 51
      // 4d: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 1
      // 52: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.l94 ()F
      // 55: invokestatic com/google/common/primitives/Floats.isFinite (F)Z
      // 58: iload 2
      // 59: ifeq 8a
      // 5c: goto 63
      // 5f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: ifeq 89
      // 66: goto 6d
      // 69: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 1
      // 6e: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.ijl ()F
      // 71: invokestatic com/google/common/primitives/Floats.isFinite (F)Z
      // 74: iload 2
      // 75: ifeq 8a
      // 78: goto 7f
      // 7b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: ifne 8d
      // 82: goto 89
      // 85: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   @Override
   public void cs0(C03PacketPlayer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 36329703032421
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: aload 0
      // 00f: aload 0
      // 010: getfield mlk.fle Lz96;
      // 013: invokevirtual z96.b88 ()Ldug;
      // 016: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 019: aload 0
      // 01a: iload 4
      // 01c: ifeq 053
      // 01f: aload 1
      // 020: invokespecial mlk.fdt (Lnet/minecraft/network/play/client/C03PacketPlayer;)Z
      // 023: ifeq 04b
      // 026: goto 02d
      // 029: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: aload 0
      // 02e: sipush 26567
      // 031: ldc2_w 8448055512921072647
      // 034: lload 2
      // 035: lxor
      // 036: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: nop
      // 03c: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 03f: iload 4
      // 041: ifne 9b7
      // 044: goto 04b
      // 047: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: aload 0
      // 04c: goto 053
      // 04f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: getfield mlk.jcx Lvr1;
      // 056: aload 0
      // 057: getfield mlk.fle Lz96;
      // 05a: getfield z96.ohd I
      // 05d: invokevirtual vr1.hrw (I)Ldug;
      // 060: astore 5
      // 062: aload 0
      // 063: bipush 1
      // 064: putfield mlk.x37 Z
      // 067: aload 0
      // 068: getfield mlk.fle Lz96;
      // 06b: iload 4
      // 06d: ifeq 088
      // 070: getfield z96.m92 Z
      // 073: ifne 9b7
      // 076: goto 07d
      // 079: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield mlk.fle Lz96;
      // 081: goto 088
      // 084: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: getfield z96.o2v D
      // 08b: dstore 6
      // 08d: aload 0
      // 08e: getfield mlk.fle Lz96;
      // 091: getfield z96.kfp D
      // 094: dstore 8
      // 096: aload 0
      // 097: getfield mlk.fle Lz96;
      // 09a: getfield z96.vbd D
      // 09d: dstore 10
      // 09f: dconst_0
      // 0a0: dstore 12
      // 0a2: aload 1
      // 0a3: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.yle ()D
      // 0a6: aload 0
      // 0a7: getfield mlk.ci5 D
      // 0aa: dsub
      // 0ab: dstore 14
      // 0ad: aload 1
      // 0ae: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.pow ()D
      // 0b1: aload 0
      // 0b2: getfield mlk.viz D
      // 0b5: dsub
      // 0b6: dstore 16
      // 0b8: aload 1
      // 0b9: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.i50 ()D
      // 0bc: aload 0
      // 0bd: getfield mlk.dj7 D
      // 0c0: dsub
      // 0c1: dstore 18
      // 0c3: aload 1
      // 0c4: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.k8x ()Z
      // 0c7: iload 4
      // 0c9: ifeq 128
      // 0cc: ifeq 124
      // 0cf: goto 0d6
      // 0d2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: dload 14
      // 0d8: dload 14
      // 0da: dmul
      // 0db: dload 16
      // 0dd: dload 16
      // 0df: dmul
      // 0e0: dadd
      // 0e1: dload 18
      // 0e3: dload 18
      // 0e5: dmul
      // 0e6: dadd
      // 0e7: dstore 12
      // 0e9: aload 0
      // 0ea: getfield mlk.zoq Z
      // 0ed: iload 4
      // 0ef: ifeq 128
      // 0f2: ifne 124
      // 0f5: goto 0fc
      // 0f8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: dload 12
      // 0fe: ldc2_w 0.25
      // 101: dcmpg
      // 102: iload 4
      // 104: ifeq 128
      // 107: goto 10e
      // 10a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: ifge 124
      // 111: goto 118
      // 114: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 0
      // 119: bipush 1
      // 11a: putfield mlk.zoq Z
      // 11d: goto 124
      // 120: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: aload 0
      // 125: getfield mlk.zoq Z
      // 128: iload 4
      // 12a: ifeq 98d
      // 12d: ifeq 971
      // 130: goto 137
      // 133: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: aload 0
      // 138: aload 0
      // 139: getfield mlk.nhp I
      // 13c: putfield mlk.glb I
      // 13f: aload 0
      // 140: getfield mlk.fle Lz96;
      // 143: iload 4
      // 145: ifeq 2c7
      // 148: goto 14f
      // 14b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: getfield z96.hzp Li2h;
      // 152: ifnull 2c3
      // 155: goto 15c
      // 158: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: aload 0
      // 15d: getfield mlk.fle Lz96;
      // 160: getfield z96.x5k F
      // 163: fstore 20
      // 165: aload 0
      // 166: getfield mlk.fle Lz96;
      // 169: getfield z96.y2i F
      // 16c: fstore 21
      // 16e: aload 0
      // 16f: getfield mlk.fle Lz96;
      // 172: getfield z96.hzp Li2h;
      // 175: invokevirtual EntityLivingBase.dsu ()V
      // 178: aload 0
      // 179: getfield mlk.fle Lz96;
      // 17c: getfield z96.o2v D
      // 17f: dstore 22
      // 181: aload 0
      // 182: getfield mlk.fle Lz96;
      // 185: getfield z96.kfp D
      // 188: dstore 24
      // 18a: aload 0
      // 18b: getfield mlk.fle Lz96;
      // 18e: getfield z96.vbd D
      // 191: dstore 26
      // 193: iload 4
      // 195: ifeq 1d5
      // 198: aload 1
      // 199: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.vi8 ()Z
      // 19c: ifeq 1b2
      // 19f: goto 1a6
      // 1a2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: aload 1
      // 1a7: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.ijl ()F
      // 1aa: fstore 20
      // 1ac: aload 1
      // 1ad: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.l94 ()F
      // 1b0: fstore 21
      // 1b2: aload 0
      // 1b3: getfield mlk.fle Lz96;
      // 1b6: aload 1
      // 1b7: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.n43 ()Z
      // 1ba: putfield z96.lfk Z
      // 1bd: aload 0
      // 1be: getfield mlk.fle Lz96;
      // 1c1: invokevirtual z96.ja4 ()V
      // 1c4: aload 0
      // 1c5: getfield mlk.fle Lz96;
      // 1c8: dload 22
      // 1ca: dload 24
      // 1cc: dload 26
      // 1ce: fload 20
      // 1d0: fload 21
      // 1d2: invokevirtual z96.xe8 (DDDFF)V
      // 1d5: aload 0
      // 1d6: getfield mlk.fle Lz96;
      // 1d9: getfield z96.hzp Li2h;
      // 1dc: iload 4
      // 1de: ifeq 21d
      // 1e1: ifnull 1fc
      // 1e4: goto 1eb
      // 1e7: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: getfield mlk.fle Lz96;
      // 1ef: getfield z96.hzp Li2h;
      // 1f2: invokevirtual EntityLivingBase.dsu ()V
      // 1f5: goto 1fc
      // 1f8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: getfield mlk.jcx Lvr1;
      // 200: invokevirtual vr1.wh3 ()Lwlx;
      // 203: aload 0
      // 204: getfield mlk.fle Lz96;
      // 207: invokevirtual wlx.xgj (Lz96;)V
      // 20a: aload 0
      // 20b: iload 4
      // 20d: ifeq 27f
      // 210: getfield mlk.fle Lz96;
      // 213: getfield z96.hzp Li2h;
      // 216: goto 21d
      // 219: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21c: athrow
      // 21d: ifnull 27e
      // 220: dload 12
      // 222: ldc2_w 4.0
      // 225: dcmpl
      // 226: ifle 273
      // 229: goto 230
      // 22c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22f: athrow
      // 230: aload 0
      // 231: getfield mlk.fle Lz96;
      // 234: getfield z96.hzp Li2h;
      // 237: astore 28
      // 239: aload 0
      // 23a: getfield mlk.fle Lz96;
      // 23d: getfield z96.rhh Lmlk;
      // 240: new net/minecraft/network/play/server/S18PacketEntityTeleport
      // 243: dup
      // 244: aload 28
      // 246: invokespecial net/minecraft/network/play/server/S18PacketEntityTeleport.<init> (Li2h;)V
      // 249: invokevirtual mlk.vnf (Lmz2;)V
      // 24c: aload 0
      // 24d: aload 0
      // 24e: getfield mlk.fle Lz96;
      // 251: getfield z96.o2v D
      // 254: aload 0
      // 255: getfield mlk.fle Lz96;
      // 258: getfield z96.kfp D
      // 25b: aload 0
      // 25c: getfield mlk.fle Lz96;
      // 25f: getfield z96.vbd D
      // 262: aload 0
      // 263: getfield mlk.fle Lz96;
      // 266: getfield z96.x5k F
      // 269: aload 0
      // 26a: getfield mlk.fle Lz96;
      // 26d: getfield z96.y2i F
      // 270: invokevirtual mlk.ymx (DDDFF)V
      // 273: aload 0
      // 274: getfield mlk.fle Lz96;
      // 277: getfield z96.hzp Li2h;
      // 27a: bipush 1
      // 27b: putfield EntityLivingBase.u19 Z
      // 27e: aload 0
      // 27f: iload 4
      // 281: ifeq 2af
      // 284: getfield mlk.zoq Z
      // 287: ifeq 2b9
      // 28a: goto 291
      // 28d: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 290: athrow
      // 291: aload 0
      // 292: aload 0
      // 293: getfield mlk.fle Lz96;
      // 296: getfield z96.o2v D
      // 299: putfield mlk.ci5 D
      // 29c: aload 0
      // 29d: aload 0
      // 29e: getfield mlk.fle Lz96;
      // 2a1: getfield z96.kfp D
      // 2a4: putfield mlk.viz D
      // 2a7: aload 0
      // 2a8: goto 2af
      // 2ab: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: getfield mlk.fle Lz96;
      // 2b3: getfield z96.vbd D
      // 2b6: putfield mlk.dj7 D
      // 2b9: aload 5
      // 2bb: aload 0
      // 2bc: getfield mlk.fle Lz96;
      // 2bf: invokevirtual dug.it6 (Li2h;)V
      // 2c2: return
      // 2c3: aload 0
      // 2c4: getfield mlk.fle Lz96;
      // 2c7: iload 4
      // 2c9: ifeq 313
      // 2cc: invokevirtual z96.ofg ()Z
      // 2cf: ifeq 30f
      // 2d2: goto 2d9
      // 2d5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d8: athrow
      // 2d9: aload 0
      // 2da: getfield mlk.fle Lz96;
      // 2dd: invokevirtual z96.ja4 ()V
      // 2e0: aload 0
      // 2e1: getfield mlk.fle Lz96;
      // 2e4: aload 0
      // 2e5: getfield mlk.ci5 D
      // 2e8: aload 0
      // 2e9: getfield mlk.viz D
      // 2ec: aload 0
      // 2ed: getfield mlk.dj7 D
      // 2f0: aload 0
      // 2f1: getfield mlk.fle Lz96;
      // 2f4: getfield z96.x5k F
      // 2f7: aload 0
      // 2f8: getfield mlk.fle Lz96;
      // 2fb: getfield z96.y2i F
      // 2fe: invokevirtual z96.xe8 (DDDFF)V
      // 301: aload 5
      // 303: aload 0
      // 304: getfield mlk.fle Lz96;
      // 307: invokevirtual dug.it6 (Li2h;)V
      // 30a: return
      // 30b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30e: athrow
      // 30f: aload 0
      // 310: getfield mlk.fle Lz96;
      // 313: getfield z96.kfp D
      // 316: dstore 20
      // 318: aload 0
      // 319: aload 0
      // 31a: getfield mlk.fle Lz96;
      // 31d: getfield z96.o2v D
      // 320: putfield mlk.ci5 D
      // 323: aload 0
      // 324: aload 0
      // 325: getfield mlk.fle Lz96;
      // 328: getfield z96.kfp D
      // 32b: putfield mlk.viz D
      // 32e: aload 0
      // 32f: aload 0
      // 330: getfield mlk.fle Lz96;
      // 333: getfield z96.vbd D
      // 336: putfield mlk.dj7 D
      // 339: aload 0
      // 33a: getfield mlk.fle Lz96;
      // 33d: getfield z96.o2v D
      // 340: dstore 22
      // 342: aload 0
      // 343: getfield mlk.fle Lz96;
      // 346: getfield z96.kfp D
      // 349: dstore 24
      // 34b: aload 0
      // 34c: getfield mlk.fle Lz96;
      // 34f: getfield z96.vbd D
      // 352: dstore 26
      // 354: aload 0
      // 355: getfield mlk.fle Lz96;
      // 358: getfield z96.x5k F
      // 35b: fstore 28
      // 35d: aload 0
      // 35e: getfield mlk.fle Lz96;
      // 361: getfield z96.y2i F
      // 364: fstore 29
      // 366: aload 1
      // 367: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.k8x ()Z
      // 36a: iload 4
      // 36c: ifeq 3a7
      // 36f: ifeq 3a3
      // 372: goto 379
      // 375: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 378: athrow
      // 379: aload 1
      // 37a: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.pow ()D
      // 37d: ldc2_w -999.0
      // 380: dcmpl
      // 381: iload 4
      // 383: ifeq 3a7
      // 386: goto 38d
      // 389: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38c: athrow
      // 38d: ifne 3a3
      // 390: goto 397
      // 393: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 396: athrow
      // 397: aload 1
      // 398: bipush 0
      // 399: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.xju (Z)V
      // 39c: goto 3a3
      // 39f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a2: athrow
      // 3a3: aload 1
      // 3a4: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.k8x ()Z
      // 3a7: iload 4
      // 3a9: ifeq 421
      // 3ac: ifeq 41d
      // 3af: goto 3b6
      // 3b2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b5: athrow
      // 3b6: aload 1
      // 3b7: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.yle ()D
      // 3ba: dstore 22
      // 3bc: aload 1
      // 3bd: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.pow ()D
      // 3c0: dstore 24
      // 3c2: aload 1
      // 3c3: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.i50 ()D
      // 3c6: dstore 26
      // 3c8: iload 4
      // 3ca: ifeq 41c
      // 3cd: aload 1
      // 3ce: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.yle ()D
      // 3d1: invokestatic java/lang/Math.abs (D)D
      // 3d4: ldc2_w 3.0E7
      // 3d7: dcmpl
      // 3d8: ifgt 403
      // 3db: goto 3e2
      // 3de: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e1: athrow
      // 3e2: aload 1
      // 3e3: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.i50 ()D
      // 3e6: invokestatic java/lang/Math.abs (D)D
      // 3e9: ldc2_w 3.0E7
      // 3ec: dcmpl
      // 3ed: iload 4
      // 3ef: ifeq 421
      // 3f2: goto 3f9
      // 3f5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f8: athrow
      // 3f9: ifle 41d
      // 3fc: goto 403
      // 3ff: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 402: athrow
      // 403: aload 0
      // 404: sipush 25612
      // 407: ldc2_w 7234544773898397651
      // 40a: lload 2
      // 40b: lxor
      // 40c: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 411: nop
      // 412: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 415: goto 41c
      // 418: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41b: athrow
      // 41c: return
      // 41d: aload 1
      // 41e: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.vi8 ()Z
      // 421: iload 4
      // 423: ifeq 45e
      // 426: ifeq 43c
      // 429: goto 430
      // 42c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42f: athrow
      // 430: aload 1
      // 431: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.ijl ()F
      // 434: fstore 28
      // 436: aload 1
      // 437: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.l94 ()F
      // 43a: fstore 29
      // 43c: aload 0
      // 43d: getfield mlk.fle Lz96;
      // 440: invokevirtual z96.ja4 ()V
      // 443: aload 0
      // 444: getfield mlk.fle Lz96;
      // 447: aload 0
      // 448: getfield mlk.ci5 D
      // 44b: aload 0
      // 44c: getfield mlk.viz D
      // 44f: aload 0
      // 450: getfield mlk.dj7 D
      // 453: fload 28
      // 455: fload 29
      // 457: invokevirtual z96.xe8 (DDDFF)V
      // 45a: aload 0
      // 45b: getfield mlk.zoq Z
      // 45e: ifne 462
      // 461: return
      // 462: dload 22
      // 464: aload 0
      // 465: getfield mlk.fle Lz96;
      // 468: getfield z96.o2v D
      // 46b: dsub
      // 46c: dstore 30
      // 46e: dload 24
      // 470: aload 0
      // 471: getfield mlk.fle Lz96;
      // 474: getfield z96.kfp D
      // 477: dsub
      // 478: dstore 32
      // 47a: dload 26
      // 47c: aload 0
      // 47d: getfield mlk.fle Lz96;
      // 480: getfield z96.vbd D
      // 483: dsub
      // 484: dstore 34
      // 486: aload 0
      // 487: getfield mlk.fle Lz96;
      // 48a: getfield z96.icv D
      // 48d: aload 0
      // 48e: getfield mlk.fle Lz96;
      // 491: getfield z96.icv D
      // 494: dmul
      // 495: aload 0
      // 496: getfield mlk.fle Lz96;
      // 499: getfield z96.mop D
      // 49c: aload 0
      // 49d: getfield mlk.fle Lz96;
      // 4a0: getfield z96.mop D
      // 4a3: dmul
      // 4a4: dadd
      // 4a5: aload 0
      // 4a6: getfield mlk.fle Lz96;
      // 4a9: getfield z96.bw4 D
      // 4ac: aload 0
      // 4ad: getfield mlk.fle Lz96;
      // 4b0: getfield z96.bw4 D
      // 4b3: dmul
      // 4b4: dadd
      // 4b5: dstore 36
      // 4b7: dload 30
      // 4b9: dload 30
      // 4bb: dmul
      // 4bc: dload 32
      // 4be: dload 32
      // 4c0: dmul
      // 4c1: dadd
      // 4c2: dload 34
      // 4c4: dload 34
      // 4c6: dmul
      // 4c7: dadd
      // 4c8: dstore 38
      // 4ca: dload 38
      // 4cc: dload 36
      // 4ce: dsub
      // 4cf: ldc2_w 100.0
      // 4d2: dcmpl
      // 4d3: iload 4
      // 4d5: ifeq 4fc
      // 4d8: ifle 5dc
      // 4db: goto 4e2
      // 4de: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e1: athrow
      // 4e2: aload 0
      // 4e3: iload 4
      // 4e5: ifeq 5be
      // 4e8: goto 4ef
      // 4eb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ee: athrow
      // 4ef: getfield mlk.jcx Lvr1;
      // 4f2: invokevirtual vr1.a59 ()Z
      // 4f5: goto 4fc
      // 4f8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fb: athrow
      // 4fc: ifeq 526
      // 4ff: aload 0
      // 500: iload 4
      // 502: ifeq 5be
      // 505: goto 50c
      // 508: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50b: athrow
      // 50c: getfield mlk.jcx Lvr1;
      // 50f: invokevirtual vr1.p4h ()Ljava/lang/String;
      // 512: aload 0
      // 513: getfield mlk.fle Lz96;
      // 516: invokevirtual z96.noc ()Ljava/lang/String;
      // 519: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 51c: ifne 5dc
      // 51f: goto 526
      // 522: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 525: athrow
      // 526: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 529: new java/lang/StringBuilder
      // 52c: dup
      // 52d: invokespecial java/lang/StringBuilder.<init> ()V
      // 530: aload 0
      // 531: getfield mlk.fle Lz96;
      // 534: invokevirtual z96.noc ()Ljava/lang/String;
      // 537: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53a: sipush 32277
      // 53d: ldc2_w 1164636837087804882
      // 540: lload 2
      // 541: lxor
      // 542: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 547: nop
      // 548: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54b: dload 30
      // 54d: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 550: ldc ","
      // 552: nop
      // 553: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 556: dload 32
      // 558: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 55b: ldc ","
      // 55d: nop
      // 55e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 561: dload 34
      // 563: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 566: sipush 30379
      // 569: ldc2_w 4377190842463876461
      // 56c: lload 2
      // 56d: lxor
      // 56e: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 573: nop
      // 574: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 577: dload 30
      // 579: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 57c: sipush 1634
      // 57f: ldc2_w 5597451656526693761
      // 582: lload 2
      // 583: lxor
      // 584: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 589: nop
      // 58a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58d: dload 32
      // 58f: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 592: sipush 32741
      // 595: ldc2_w 5201375586689023005
      // 598: lload 2
      // 599: lxor
      // 59a: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59f: nop
      // 5a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a3: dload 34
      // 5a5: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 5a8: ldc ")"
      // 5aa: nop
      // 5ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5b1: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 5b6: aload 0
      // 5b7: goto 5be
      // 5ba: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5bd: athrow
      // 5be: aload 0
      // 5bf: getfield mlk.ci5 D
      // 5c2: aload 0
      // 5c3: getfield mlk.viz D
      // 5c6: aload 0
      // 5c7: getfield mlk.dj7 D
      // 5ca: aload 0
      // 5cb: getfield mlk.fle Lz96;
      // 5ce: getfield z96.x5k F
      // 5d1: aload 0
      // 5d2: getfield mlk.fle Lz96;
      // 5d5: getfield z96.y2i F
      // 5d8: invokevirtual mlk.ymx (DDDFF)V
      // 5db: return
      // 5dc: ldc 0.0625
      // 5de: nop
      // 5df: fstore 40
      // 5e1: aload 5
      // 5e3: aload 0
      // 5e4: getfield mlk.fle Lz96;
      // 5e7: aload 0
      // 5e8: getfield mlk.fle Lz96;
      // 5eb: invokevirtual z96.aaw ()Lnh4;
      // 5ee: fload 40
      // 5f0: f2d
      // 5f1: fload 40
      // 5f3: f2d
      // 5f4: fload 40
      // 5f6: f2d
      // 5f7: invokevirtual nh4.va6 (DDD)Lnh4;
      // 5fa: invokevirtual dug.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 5fd: invokeinterface java/util/List.isEmpty ()Z 1
      // 602: istore 41
      // 604: aload 0
      // 605: getfield mlk.fle Lz96;
      // 608: getfield z96.lfk Z
      // 60b: iload 4
      // 60d: ifeq 69e
      // 610: ifeq 65c
      // 613: goto 61a
      // 616: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 619: athrow
      // 61a: aload 1
      // 61b: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.n43 ()Z
      // 61e: iload 4
      // 620: ifeq 69e
      // 623: goto 62a
      // 626: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 629: athrow
      // 62a: ifne 65c
      // 62d: goto 634
      // 630: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 633: athrow
      // 634: dload 32
      // 636: dconst_0
      // 637: dcmpl
      // 638: iload 4
      // 63a: ifeq 69e
      // 63d: goto 644
      // 640: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 643: athrow
      // 644: ifle 65c
      // 647: goto 64e
      // 64a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64d: athrow
      // 64e: aload 0
      // 64f: getfield mlk.fle Lz96;
      // 652: invokevirtual z96.xv1 ()V
      // 655: goto 65c
      // 658: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65b: athrow
      // 65c: aload 0
      // 65d: getfield mlk.fle Lz96;
      // 660: dload 30
      // 662: dload 32
      // 664: dload 34
      // 666: invokevirtual z96.vjj (DDD)V
      // 669: aload 0
      // 66a: getfield mlk.fle Lz96;
      // 66d: aload 1
      // 66e: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.n43 ()Z
      // 671: putfield z96.lfk Z
      // 674: dload 22
      // 676: aload 0
      // 677: getfield mlk.fle Lz96;
      // 67a: getfield z96.o2v D
      // 67d: dsub
      // 67e: dstore 30
      // 680: dload 24
      // 682: aload 0
      // 683: getfield mlk.fle Lz96;
      // 686: getfield z96.kfp D
      // 689: dsub
      // 68a: dstore 32
      // 68c: dload 32
      // 68e: iload 4
      // 690: ifeq 6be
      // 693: ldc2_w -0.5
      // 696: dcmpl
      // 697: goto 69e
      // 69a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69d: athrow
      // 69e: ifgt 6bd
      // 6a1: dload 32
      // 6a3: ldc2_w 0.5
      // 6a6: dcmpg
      // 6a7: iload 4
      // 6a9: ifeq 6e0
      // 6ac: goto 6b3
      // 6af: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b2: athrow
      // 6b3: ifge 6c0
      // 6b6: goto 6bd
      // 6b9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6bc: athrow
      // 6bd: dconst_0
      // 6be: dstore 32
      // 6c0: dload 26
      // 6c2: aload 0
      // 6c3: getfield mlk.fle Lz96;
      // 6c6: getfield z96.vbd D
      // 6c9: dsub
      // 6ca: dstore 34
      // 6cc: dload 30
      // 6ce: dload 30
      // 6d0: dmul
      // 6d1: dload 32
      // 6d3: dload 32
      // 6d5: dmul
      // 6d6: dadd
      // 6d7: dload 34
      // 6d9: dload 34
      // 6db: dmul
      // 6dc: dadd
      // 6dd: dstore 38
      // 6df: bipush 0
      // 6e0: istore 42
      // 6e2: dload 38
      // 6e4: ldc2_w 0.0625
      // 6e7: dcmpl
      // 6e8: iload 4
      // 6ea: ifeq 7ad
      // 6ed: ifle 764
      // 6f0: goto 6f7
      // 6f3: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f6: athrow
      // 6f7: aload 0
      // 6f8: getfield mlk.fle Lz96;
      // 6fb: invokevirtual z96.ofg ()Z
      // 6fe: iload 4
      // 700: ifeq 7ad
      // 703: goto 70a
      // 706: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 709: athrow
      // 70a: ifne 764
      // 70d: goto 714
      // 710: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 713: athrow
      // 714: aload 0
      // 715: getfield mlk.fle Lz96;
      // 718: getfield z96._am Lrsh;
      // 71b: invokevirtual rsh.u7c ()Z
      // 71e: iload 4
      // 720: ifeq 7ad
      // 723: goto 72a
      // 726: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 729: athrow
      // 72a: ifne 764
      // 72d: goto 734
      // 730: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 733: athrow
      // 734: bipush 1
      // 735: istore 42
      // 737: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 73a: new java/lang/StringBuilder
      // 73d: dup
      // 73e: invokespecial java/lang/StringBuilder.<init> ()V
      // 741: aload 0
      // 742: getfield mlk.fle Lz96;
      // 745: invokevirtual z96.noc ()Ljava/lang/String;
      // 748: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74b: sipush 801
      // 74e: ldc2_w 2564594508085985532
      // 751: lload 2
      // 752: lxor
      // 753: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 758: nop
      // 759: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 75f: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 764: aload 0
      // 765: getfield mlk.fle Lz96;
      // 768: dload 22
      // 76a: dload 24
      // 76c: dload 26
      // 76e: fload 28
      // 770: fload 29
      // 772: invokevirtual z96.xe8 (DDDFF)V
      // 775: aload 0
      // 776: getfield mlk.fle Lz96;
      // 779: aload 0
      // 77a: getfield mlk.fle Lz96;
      // 77d: getfield z96.o2v D
      // 780: dload 6
      // 782: dsub
      // 783: aload 0
      // 784: getfield mlk.fle Lz96;
      // 787: getfield z96.kfp D
      // 78a: dload 8
      // 78c: dsub
      // 78d: aload 0
      // 78e: getfield mlk.fle Lz96;
      // 791: getfield z96.vbd D
      // 794: dload 10
      // 796: dsub
      // 797: invokevirtual z96.w7f (DDD)V
      // 79a: aload 0
      // 79b: getfield mlk.fle Lz96;
      // 79e: iload 4
      // 7a0: ifeq 847
      // 7a3: getfield z96.kvx Z
      // 7a6: goto 7ad
      // 7a9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ac: athrow
      // 7ad: ifne 843
      // 7b0: aload 5
      // 7b2: aload 0
      // 7b3: getfield mlk.fle Lz96;
      // 7b6: aload 0
      // 7b7: getfield mlk.fle Lz96;
      // 7ba: invokevirtual z96.aaw ()Lnh4;
      // 7bd: fload 40
      // 7bf: f2d
      // 7c0: fload 40
      // 7c2: f2d
      // 7c3: fload 40
      // 7c5: f2d
      // 7c6: invokevirtual nh4.va6 (DDD)Lnh4;
      // 7c9: invokevirtual dug.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 7cc: invokeinterface java/util/List.isEmpty ()Z 1
      // 7d1: istore 43
      // 7d3: iload 41
      // 7d5: iload 4
      // 7d7: ifeq 7e6
      // 7da: ifeq 843
      // 7dd: goto 7e4
      // 7e0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e3: athrow
      // 7e4: iload 42
      // 7e6: iload 4
      // 7e8: ifeq 827
      // 7eb: ifne 80d
      // 7ee: goto 7f5
      // 7f1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f4: athrow
      // 7f5: iload 43
      // 7f7: iload 4
      // 7f9: ifeq 827
      // 7fc: goto 803
      // 7ff: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 802: athrow
      // 803: ifne 843
      // 806: goto 80d
      // 809: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80c: athrow
      // 80d: aload 0
      // 80e: getfield mlk.fle Lz96;
      // 811: iload 4
      // 813: ifeq 847
      // 816: goto 81d
      // 819: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81c: athrow
      // 81d: invokevirtual z96.ofg ()Z
      // 820: goto 827
      // 823: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 826: athrow
      // 827: ifne 843
      // 82a: aload 0
      // 82b: aload 0
      // 82c: getfield mlk.ci5 D
      // 82f: aload 0
      // 830: getfield mlk.viz D
      // 833: aload 0
      // 834: getfield mlk.dj7 D
      // 837: fload 28
      // 839: fload 29
      // 83b: invokevirtual mlk.ymx (DDDFF)V
      // 83e: return
      // 83f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 842: athrow
      // 843: aload 0
      // 844: getfield mlk.fle Lz96;
      // 847: invokevirtual z96.aaw ()Lnh4;
      // 84a: fload 40
      // 84c: f2d
      // 84d: fload 40
      // 84f: f2d
      // 850: fload 40
      // 852: f2d
      // 853: invokevirtual nh4.c2h (DDD)Lnh4;
      // 856: dconst_0
      // 857: ldc2_w -0.55
      // 85a: dconst_0
      // 85b: invokevirtual nh4.z9h (DDD)Lnh4;
      // 85e: astore 43
      // 860: aload 0
      // 861: iload 4
      // 863: ifeq 93a
      // 866: getfield mlk.jcx Lvr1;
      // 869: invokevirtual vr1.t3j ()Z
      // 86c: ifne 939
      // 86f: goto 876
      // 872: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 875: athrow
      // 876: aload 0
      // 877: iload 4
      // 879: ifeq 93a
      // 87c: goto 883
      // 87f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 882: athrow
      // 883: getfield mlk.fle Lz96;
      // 886: getfield z96.lls Lpj2;
      // 889: getfield pj2.wvp Z
      // 88c: ifne 939
      // 88f: goto 896
      // 892: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 895: athrow
      // 896: aload 5
      // 898: aload 43
      // 89a: invokevirtual dug.o2j (Lnh4;)Z
      // 89d: iload 4
      // 89f: ifeq 8c0
      // 8a2: goto 8a9
      // 8a5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a8: athrow
      // 8a9: ifne 939
      // 8ac: goto 8b3
      // 8af: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b2: athrow
      // 8b3: dload 32
      // 8b5: ldc2_w -0.03125
      // 8b8: dcmpl
      // 8b9: goto 8c0
      // 8bc: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8bf: athrow
      // 8c0: iload 4
      // 8c2: ifeq 8f0
      // 8c5: iflt 93e
      // 8c8: goto 8cf
      // 8cb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8ce: athrow
      // 8cf: aload 0
      // 8d0: dup
      // 8d1: getfield mlk.h4p I
      // 8d4: bipush 1
      // 8d5: iadd
      // 8d6: putfield mlk.h4p I
      // 8d9: aload 0
      // 8da: iload 4
      // 8dc: ifeq 958
      // 8df: goto 8e6
      // 8e2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e5: athrow
      // 8e6: getfield mlk.h4p I
      // 8e9: goto 8f0
      // 8ec: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8ef: athrow
      // 8f0: bipush 80
      // 8f2: if_icmple 93e
      // 8f5: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 8f8: new java/lang/StringBuilder
      // 8fb: dup
      // 8fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 8ff: aload 0
      // 900: getfield mlk.fle Lz96;
      // 903: invokevirtual z96.noc ()Ljava/lang/String;
      // 906: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 909: sipush 10430
      // 90c: ldc2_w 2975826935407979355
      // 90f: lload 2
      // 910: lxor
      // 911: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 916: nop
      // 917: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 91d: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 922: aload 0
      // 923: sipush 15379
      // 926: ldc2_w 6501721459656802272
      // 929: lload 2
      // 92a: lxor
      // 92b: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 930: nop
      // 931: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 934: return
      // 935: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 938: athrow
      // 939: aload 0
      // 93a: bipush 0
      // 93b: putfield mlk.h4p I
      // 93e: aload 0
      // 93f: getfield mlk.fle Lz96;
      // 942: aload 1
      // 943: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.n43 ()Z
      // 946: putfield z96.lfk Z
      // 949: aload 0
      // 94a: getfield mlk.jcx Lvr1;
      // 94d: invokevirtual vr1.wh3 ()Lwlx;
      // 950: aload 0
      // 951: getfield mlk.fle Lz96;
      // 954: invokevirtual wlx.xgj (Lz96;)V
      // 957: aload 0
      // 958: getfield mlk.fle Lz96;
      // 95b: aload 0
      // 95c: getfield mlk.fle Lz96;
      // 95f: getfield z96.kfp D
      // 962: dload 20
      // 964: dsub
      // 965: aload 1
      // 966: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.n43 ()Z
      // 969: invokevirtual z96.qcl (DZ)V
      // 96c: iload 4
      // 96e: ifne 9b7
      // 971: aload 0
      // 972: iload 4
      // 974: ifeq 99a
      // 977: goto 97e
      // 97a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97d: athrow
      // 97e: getfield mlk.nhp I
      // 981: aload 0
      // 982: getfield mlk.glb I
      // 985: isub
      // 986: goto 98d
      // 989: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 98c: athrow
      // 98d: bipush 20
      // 98f: if_icmple 9b7
      // 992: aload 0
      // 993: goto 99a
      // 996: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 999: athrow
      // 99a: aload 0
      // 99b: getfield mlk.ci5 D
      // 99e: aload 0
      // 99f: getfield mlk.viz D
      // 9a2: aload 0
      // 9a3: getfield mlk.dj7 D
      // 9a6: aload 0
      // 9a7: getfield mlk.fle Lz96;
      // 9aa: getfield z96.x5k F
      // 9ad: aload 0
      // 9ae: getfield mlk.fle Lz96;
      // 9b1: getfield z96.y2i F
      // 9b4: invokevirtual mlk.ymx (DDDFF)V
      // 9b7: return
   }

   public void ymx(double var1, double var3, double var5, float var7, float var8) {
      this.imd(var1, var3, var5, var7, var8, Collections.emptySet());
   }

   public void imd(double param1, double param3, double param5, float param7, float param8, Set param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield mlk.zoq Z
      // 005: aload 0
      // 006: dload 1
      // 007: putfield mlk.ci5 D
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: aload 0
      // 00e: dload 3
      // 00f: putfield mlk.viz D
      // 012: istore 10
      // 014: aload 0
      // 015: dload 5
      // 017: putfield mlk.dj7 D
      // 01a: aload 9
      // 01c: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.uws Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 01f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 024: iload 10
      // 026: ifeq 054
      // 029: ifeq 04a
      // 02c: goto 033
      // 02f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: aload 0
      // 034: dup
      // 035: getfield mlk.ci5 D
      // 038: aload 0
      // 039: getfield mlk.fle Lz96;
      // 03c: getfield z96.o2v D
      // 03f: dadd
      // 040: putfield mlk.ci5 D
      // 043: goto 04a
      // 046: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: aload 9
      // 04c: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.yu5 Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 04f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 054: iload 10
      // 056: ifeq 084
      // 059: ifeq 07a
      // 05c: goto 063
      // 05f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 0
      // 064: dup
      // 065: getfield mlk.viz D
      // 068: aload 0
      // 069: getfield mlk.fle Lz96;
      // 06c: getfield z96.kfp D
      // 06f: dadd
      // 070: putfield mlk.viz D
      // 073: goto 07a
      // 076: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 9
      // 07c: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.qh1 Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 07f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 084: ifeq 09e
      // 087: aload 0
      // 088: dup
      // 089: getfield mlk.dj7 D
      // 08c: aload 0
      // 08d: getfield mlk.fle Lz96;
      // 090: getfield z96.vbd D
      // 093: dadd
      // 094: putfield mlk.dj7 D
      // 097: goto 09e
      // 09a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: fload 7
      // 0a0: fstore 11
      // 0a2: fload 8
      // 0a4: fstore 12
      // 0a6: aload 9
      // 0a8: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.a76 Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 0ab: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0b0: iload 10
      // 0b2: ifeq 0d5
      // 0b5: ifeq 0cb
      // 0b8: goto 0bf
      // 0bb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: fload 7
      // 0c1: aload 0
      // 0c2: getfield mlk.fle Lz96;
      // 0c5: getfield z96.x5k F
      // 0c8: fadd
      // 0c9: fstore 11
      // 0cb: aload 9
      // 0cd: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.ybj Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 0d0: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0d5: ifeq 0e4
      // 0d8: fload 8
      // 0da: aload 0
      // 0db: getfield mlk.fle Lz96;
      // 0de: getfield z96.y2i F
      // 0e1: fadd
      // 0e2: fstore 12
      // 0e4: aload 0
      // 0e5: getfield mlk.fle Lz96;
      // 0e8: aload 0
      // 0e9: getfield mlk.ci5 D
      // 0ec: aload 0
      // 0ed: getfield mlk.viz D
      // 0f0: aload 0
      // 0f1: getfield mlk.dj7 D
      // 0f4: fload 11
      // 0f6: fload 12
      // 0f8: invokevirtual z96.xe8 (DDDFF)V
      // 0fb: aload 0
      // 0fc: getfield mlk.fle Lz96;
      // 0ff: getfield z96.rhh Lmlk;
      // 102: new net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 105: dup
      // 106: dload 1
      // 107: dload 3
      // 108: dload 5
      // 10a: fload 7
      // 10c: fload 8
      // 10e: aload 9
      // 110: invokespecial net/minecraft/network/play/server/S08PacketPlayerPosLook.<init> (DDDFFLjava/util/Set;)V
      // 113: invokevirtual mlk.vnf (Lmz2;)V
      // 116: return
   }

   @Override
   public void c9j(C07PacketPlayerDigging param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 119962812346561
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield mlk.fle Lz96;
      // 00e: invokevirtual z96.b88 ()Ldug;
      // 011: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 014: invokestatic OpaquePredicate.b ()I
      // 017: aload 0
      // 018: getfield mlk.jcx Lvr1;
      // 01b: aload 0
      // 01c: getfield mlk.fle Lz96;
      // 01f: getfield z96.ohd I
      // 022: invokevirtual vr1.hrw (I)Ldug;
      // 025: astore 5
      // 027: aload 1
      // 028: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.h6h ()Lmew;
      // 02b: astore 6
      // 02d: istore 4
      // 02f: aload 0
      // 030: getfield mlk.fle Lz96;
      // 033: invokevirtual z96.wli ()V
      // 036: getstatic mlk$4.zr4 [I
      // 039: aload 1
      // 03a: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.sju ()Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 03d: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.ordinal ()I
      // 040: iaload
      // 041: iload 4
      // 043: ifeq 08a
      // 046: tableswitch 537 1 6 42 88 127 135 135 135
      // 06c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 0
      // 071: getfield mlk.fle Lz96;
      // 074: iload 4
      // 076: ifeq 098
      // 079: goto 080
      // 07c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: invokevirtual z96.myu ()Z
      // 083: goto 08a
      // 086: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: ifne 09d
      // 08d: aload 0
      // 08e: getfield mlk.fle Lz96;
      // 091: goto 098
      // 094: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: bipush 0
      // 099: invokevirtual z96.e07 (Z)Lnvf;
      // 09c: pop
      // 09d: return
      // 09e: aload 0
      // 09f: getfield mlk.fle Lz96;
      // 0a2: iload 4
      // 0a4: ifeq 0bf
      // 0a7: invokevirtual z96.myu ()Z
      // 0aa: ifne 0c4
      // 0ad: goto 0b4
      // 0b0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: getfield mlk.fle Lz96;
      // 0b8: goto 0bf
      // 0bb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: bipush 1
      // 0c0: invokevirtual z96.e07 (Z)Lnvf;
      // 0c3: pop
      // 0c4: return
      // 0c5: aload 0
      // 0c6: getfield mlk.fle Lz96;
      // 0c9: invokevirtual z96.puk ()V
      // 0cc: return
      // 0cd: aload 0
      // 0ce: getfield mlk.fle Lz96;
      // 0d1: getfield z96.o2v D
      // 0d4: aload 6
      // 0d6: invokevirtual mew.getX ()I
      // 0d9: i2d
      // 0da: ldc2_w 0.5
      // 0dd: dadd
      // 0de: dsub
      // 0df: dstore 7
      // 0e1: aload 0
      // 0e2: getfield mlk.fle Lz96;
      // 0e5: getfield z96.kfp D
      // 0e8: aload 6
      // 0ea: invokevirtual mew.getY ()I
      // 0ed: i2d
      // 0ee: ldc2_w 0.5
      // 0f1: dadd
      // 0f2: dsub
      // 0f3: ldc2_w 1.5
      // 0f6: dadd
      // 0f7: dstore 9
      // 0f9: aload 0
      // 0fa: getfield mlk.fle Lz96;
      // 0fd: getfield z96.vbd D
      // 100: aload 6
      // 102: invokevirtual mew.getZ ()I
      // 105: i2d
      // 106: ldc2_w 0.5
      // 109: dadd
      // 10a: dsub
      // 10b: dstore 11
      // 10d: dload 7
      // 10f: dload 7
      // 111: dmul
      // 112: dload 9
      // 114: dload 9
      // 116: dmul
      // 117: dadd
      // 118: dload 11
      // 11a: dload 11
      // 11c: dmul
      // 11d: dadd
      // 11e: dstore 13
      // 120: dload 13
      // 122: ldc2_w 36.0
      // 125: dcmpl
      // 126: iload 4
      // 128: ifeq 13b
      // 12b: ifle 136
      // 12e: goto 135
      // 131: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: return
      // 136: aload 6
      // 138: invokevirtual mew.getY ()I
      // 13b: aload 0
      // 13c: getfield mlk.jcx Lvr1;
      // 13f: invokevirtual vr1.aki ()I
      // 142: if_icmplt 14a
      // 145: return
      // 146: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 1
      // 14b: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.sju ()Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 14e: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.gi_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 151: iload 4
      // 153: ifeq 1e4
      // 156: if_acmpne 1d6
      // 159: goto 160
      // 15c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: aload 0
      // 161: iload 4
      // 163: ifeq 1c3
      // 166: goto 16d
      // 169: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: getfield mlk.jcx Lvr1;
      // 170: aload 5
      // 172: aload 6
      // 174: aload 0
      // 175: getfield mlk.fle Lz96;
      // 178: invokevirtual vr1.pbe (Lt9d;Lmew;Lha9;)Z
      // 17b: ifne 1b5
      // 17e: goto 185
      // 181: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 184: athrow
      // 185: aload 5
      // 187: invokevirtual dug.fve ()Lw5i;
      // 18a: aload 6
      // 18c: invokevirtual w5i.hka (Lmew;)Z
      // 18f: ifeq 1b5
      // 192: goto 199
      // 195: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 198: athrow
      // 199: aload 0
      // 19a: getfield mlk.fle Lz96;
      // 19d: getfield z96._am Lrsh;
      // 1a0: aload 6
      // 1a2: aload 1
      // 1a3: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.up9 ()Lvt2;
      // 1a6: invokevirtual rsh.o29 (Lmew;Lvt2;)V
      // 1a9: iload 4
      // 1ab: ifne 25e
      // 1ae: goto 1b5
      // 1b1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: getfield mlk.fle Lz96;
      // 1b9: getfield z96.rhh Lmlk;
      // 1bc: goto 1c3
      // 1bf: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: new net/minecraft/network/play/server/S23PacketBlockChange
      // 1c6: dup
      // 1c7: aload 5
      // 1c9: aload 6
      // 1cb: invokespecial net/minecraft/network/play/server/S23PacketBlockChange.<init> (Lt9d;Lmew;)V
      // 1ce: invokevirtual mlk.vnf (Lmz2;)V
      // 1d1: iload 4
      // 1d3: ifne 25e
      // 1d6: aload 1
      // 1d7: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.sju ()Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 1da: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.x56 Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 1dd: goto 1e4
      // 1e0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: iload 4
      // 1e6: ifeq 219
      // 1e9: if_acmpne 20b
      // 1ec: goto 1f3
      // 1ef: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f2: athrow
      // 1f3: aload 0
      // 1f4: getfield mlk.fle Lz96;
      // 1f7: getfield z96._am Lrsh;
      // 1fa: aload 6
      // 1fc: invokevirtual rsh.z8m (Lmew;)V
      // 1ff: iload 4
      // 201: ifne 22d
      // 204: goto 20b
      // 207: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20a: athrow
      // 20b: aload 1
      // 20c: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.sju ()Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 20f: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.t2e Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 212: goto 219
      // 215: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 218: athrow
      // 219: if_acmpne 22d
      // 21c: aload 0
      // 21d: getfield mlk.fle Lz96;
      // 220: getfield z96._am Lrsh;
      // 223: invokevirtual rsh.d53 ()V
      // 226: goto 22d
      // 229: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: aload 5
      // 22f: aload 6
      // 231: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 234: invokeinterface zfz.r_y ()Le0x; 1
      // 239: invokevirtual e0x.p1r ()Lp3y;
      // 23c: getstatic p3y.cei Lp3y;
      // 23f: if_acmpeq 25e
      // 242: aload 0
      // 243: getfield mlk.fle Lz96;
      // 246: getfield z96.rhh Lmlk;
      // 249: new net/minecraft/network/play/server/S23PacketBlockChange
      // 24c: dup
      // 24d: aload 5
      // 24f: aload 6
      // 251: invokespecial net/minecraft/network/play/server/S23PacketBlockChange.<init> (Lt9d;Lmew;)V
      // 254: invokevirtual mlk.vnf (Lmz2;)V
      // 257: goto 25e
      // 25a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25d: athrow
      // 25e: return
      // 25f: new java/lang/IllegalArgumentException
      // 262: dup
      // 263: sipush 24203
      // 266: ldc2_w 3968996983310019546
      // 269: lload 2
      // 26a: lxor
      // 26b: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: nop
      // 271: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 274: athrow
   }

   @Override
   public void k4i(C08PacketPlayerBlockPlacement param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 91523809910106
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield mlk.fle Lz96;
      // 00e: invokevirtual z96.b88 ()Ldug;
      // 011: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 014: aload 0
      // 015: getfield mlk.jcx Lvr1;
      // 018: aload 0
      // 019: getfield mlk.fle Lz96;
      // 01c: getfield z96.ohd I
      // 01f: invokevirtual vr1.hrw (I)Ldug;
      // 022: astore 5
      // 024: aload 0
      // 025: getfield mlk.fle Lz96;
      // 028: getfield z96.up_ Ljnq;
      // 02b: invokevirtual jnq.dxs ()Lerg;
      // 02e: astore 6
      // 030: invokestatic OpaquePredicate.b ()I
      // 033: bipush 0
      // 034: istore 7
      // 036: aload 1
      // 037: invokevirtual net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.uky ()Lmew;
      // 03a: astore 8
      // 03c: istore 4
      // 03e: aload 1
      // 03f: invokevirtual net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.mnb ()I
      // 042: invokestatic vt2.jw6 (I)Lvt2;
      // 045: astore 9
      // 047: aload 0
      // 048: getfield mlk.fle Lz96;
      // 04b: invokevirtual z96.wli ()V
      // 04e: aload 1
      // 04f: invokevirtual net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.mnb ()I
      // 052: sipush 255
      // 055: iload 4
      // 057: ifeq 0ae
      // 05a: if_icmpne 08d
      // 05d: goto 064
      // 060: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: aload 6
      // 066: ifnonnull 075
      // 069: goto 070
      // 06c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: return
      // 071: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: aload 0
      // 076: getfield mlk.fle Lz96;
      // 079: getfield z96._am Lrsh;
      // 07c: aload 0
      // 07d: getfield mlk.fle Lz96;
      // 080: aload 5
      // 082: aload 6
      // 084: invokevirtual rsh.mn_ (Lha9;Lt9d;Lerg;)Z
      // 087: pop
      // 088: iload 4
      // 08a: ifne 1fc
      // 08d: aload 8
      // 08f: invokevirtual mew.getY ()I
      // 092: iload 4
      // 094: ifeq 0ed
      // 097: goto 09e
      // 09a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield mlk.jcx Lvr1;
      // 0a2: invokevirtual vr1.aki ()I
      // 0a5: bipush 1
      // 0a6: isub
      // 0a7: goto 0ae
      // 0aa: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: if_icmplt 0e2
      // 0b1: aload 9
      // 0b3: getstatic vt2.rf3 Lvt2;
      // 0b6: if_acmpeq 1b2
      // 0b9: goto 0c0
      // 0bc: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aload 8
      // 0c2: invokevirtual mew.getY ()I
      // 0c5: iload 4
      // 0c7: ifeq 0ed
      // 0ca: goto 0d1
      // 0cd: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield mlk.jcx Lvr1;
      // 0d5: invokevirtual vr1.aki ()I
      // 0d8: if_icmpge 1b2
      // 0db: goto 0e2
      // 0de: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: getfield mlk.zoq Z
      // 0e6: goto 0ed
      // 0e9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: iload 4
      // 0ef: ifeq 1ab
      // 0f2: ifeq 1aa
      // 0f5: goto 0fc
      // 0f8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: getfield mlk.fle Lz96;
      // 100: aload 8
      // 102: invokevirtual mew.getX ()I
      // 105: i2d
      // 106: ldc2_w 0.5
      // 109: dadd
      // 10a: aload 8
      // 10c: invokevirtual mew.getY ()I
      // 10f: i2d
      // 110: ldc2_w 0.5
      // 113: dadd
      // 114: aload 8
      // 116: invokevirtual mew.getZ ()I
      // 119: i2d
      // 11a: ldc2_w 0.5
      // 11d: dadd
      // 11e: invokevirtual z96.p53 (DDD)D
      // 121: ldc2_w 64.0
      // 124: dcmpg
      // 125: iload 4
      // 127: ifeq 1ab
      // 12a: goto 131
      // 12d: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: ifge 1aa
      // 134: goto 13b
      // 137: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 0
      // 13c: getfield mlk.jcx Lvr1;
      // 13f: aload 5
      // 141: aload 8
      // 143: aload 0
      // 144: getfield mlk.fle Lz96;
      // 147: invokevirtual vr1.pbe (Lt9d;Lmew;Lha9;)Z
      // 14a: iload 4
      // 14c: ifeq 1ab
      // 14f: goto 156
      // 152: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: ifne 1aa
      // 159: goto 160
      // 15c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: aload 5
      // 162: invokevirtual dug.fve ()Lw5i;
      // 165: aload 8
      // 167: invokevirtual w5i.hka (Lmew;)Z
      // 16a: iload 4
      // 16c: ifeq 1ab
      // 16f: goto 176
      // 172: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: ifeq 1aa
      // 179: goto 180
      // 17c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: aload 0
      // 181: getfield mlk.fle Lz96;
      // 184: getfield z96._am Lrsh;
      // 187: aload 0
      // 188: getfield mlk.fle Lz96;
      // 18b: aload 5
      // 18d: aload 6
      // 18f: aload 8
      // 191: aload 9
      // 193: aload 1
      // 194: invokevirtual net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.jpw ()F
      // 197: aload 1
      // 198: invokevirtual net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.zxm ()F
      // 19b: aload 1
      // 19c: invokevirtual net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.vx2 ()F
      // 19f: invokevirtual rsh.nh0 (Lha9;Lt9d;Lerg;Lmew;Lvt2;FFF)Z
      // 1a2: pop
      // 1a3: goto 1aa
      // 1a6: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: bipush 1
      // 1ab: istore 7
      // 1ad: iload 4
      // 1af: ifne 1fc
      // 1b2: new hsu
      // 1b5: dup
      // 1b6: sipush 5160
      // 1b9: ldc2_w 6103039335479397627
      // 1bc: lload 2
      // 1bd: lxor
      // 1be: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: nop
      // 1c4: bipush 1
      // 1c5: anewarray 22
      // 1c8: dup
      // 1c9: bipush 0
      // 1ca: aload 0
      // 1cb: getfield mlk.jcx Lvr1;
      // 1ce: invokevirtual vr1.aki ()I
      // 1d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d4: aastore
      // 1d5: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1d8: astore 10
      // 1da: aload 10
      // 1dc: invokevirtual hsu.f4q ()Lpoy;
      // 1df: getstatic syo.aez Lsyo;
      // 1e2: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 1e5: pop
      // 1e6: aload 0
      // 1e7: getfield mlk.fle Lz96;
      // 1ea: getfield z96.rhh Lmlk;
      // 1ed: new net/minecraft/network/play/server/S02PacketChat
      // 1f0: dup
      // 1f1: aload 10
      // 1f3: invokespecial net/minecraft/network/play/server/S02PacketChat.<init> (Lekw;)V
      // 1f6: invokevirtual mlk.vnf (Lmz2;)V
      // 1f9: bipush 1
      // 1fa: istore 7
      // 1fc: iload 7
      // 1fe: ifeq 237
      // 201: aload 0
      // 202: getfield mlk.fle Lz96;
      // 205: getfield z96.rhh Lmlk;
      // 208: new net/minecraft/network/play/server/S23PacketBlockChange
      // 20b: dup
      // 20c: aload 5
      // 20e: aload 8
      // 210: invokespecial net/minecraft/network/play/server/S23PacketBlockChange.<init> (Lt9d;Lmew;)V
      // 213: invokevirtual mlk.vnf (Lmz2;)V
      // 216: aload 0
      // 217: getfield mlk.fle Lz96;
      // 21a: getfield z96.rhh Lmlk;
      // 21d: new net/minecraft/network/play/server/S23PacketBlockChange
      // 220: dup
      // 221: aload 5
      // 223: aload 8
      // 225: aload 9
      // 227: invokevirtual mew.offset (Lvt2;)Lmew;
      // 22a: invokespecial net/minecraft/network/play/server/S23PacketBlockChange.<init> (Lt9d;Lmew;)V
      // 22d: invokevirtual mlk.vnf (Lmz2;)V
      // 230: goto 237
      // 233: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 236: athrow
      // 237: aload 0
      // 238: getfield mlk.fle Lz96;
      // 23b: getfield z96.up_ Ljnq;
      // 23e: invokevirtual jnq.dxs ()Lerg;
      // 241: astore 6
      // 243: aload 6
      // 245: iload 4
      // 247: ifeq 28a
      // 24a: ifnull 288
      // 24d: goto 254
      // 250: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 253: athrow
      // 254: aload 6
      // 256: iload 4
      // 258: ifeq 28a
      // 25b: goto 262
      // 25e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 261: athrow
      // 262: getfield erg.qd2 I
      // 265: ifne 288
      // 268: goto 26f
      // 26b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26e: athrow
      // 26f: aload 0
      // 270: getfield mlk.fle Lz96;
      // 273: getfield z96.up_ Ljnq;
      // 276: getfield jnq.c41 [Lerg;
      // 279: aload 0
      // 27a: getfield mlk.fle Lz96;
      // 27d: getfield z96.up_ Ljnq;
      // 280: getfield jnq.nb5 I
      // 283: aconst_null
      // 284: aastore
      // 285: aconst_null
      // 286: astore 6
      // 288: aload 6
      // 28a: iload 4
      // 28c: ifeq 29b
      // 28f: ifnull 2a1
      // 292: goto 299
      // 295: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 298: athrow
      // 299: aload 6
      // 29b: invokevirtual erg.ifg ()I
      // 29e: ifne 350
      // 2a1: aload 0
      // 2a2: getfield mlk.fle Lz96;
      // 2a5: bipush 1
      // 2a6: putfield z96._d1 Z
      // 2a9: aload 0
      // 2aa: getfield mlk.fle Lz96;
      // 2ad: getfield z96.up_ Ljnq;
      // 2b0: getfield jnq.c41 [Lerg;
      // 2b3: aload 0
      // 2b4: getfield mlk.fle Lz96;
      // 2b7: getfield z96.up_ Ljnq;
      // 2ba: getfield jnq.nb5 I
      // 2bd: aload 0
      // 2be: getfield mlk.fle Lz96;
      // 2c1: getfield z96.up_ Ljnq;
      // 2c4: getfield jnq.c41 [Lerg;
      // 2c7: aload 0
      // 2c8: getfield mlk.fle Lz96;
      // 2cb: getfield z96.up_ Ljnq;
      // 2ce: getfield jnq.nb5 I
      // 2d1: aaload
      // 2d2: invokestatic erg.tvo (Lerg;)Lerg;
      // 2d5: aastore
      // 2d6: aload 0
      // 2d7: getfield mlk.fle Lz96;
      // 2da: getfield z96.daw L_jc;
      // 2dd: aload 0
      // 2de: getfield mlk.fle Lz96;
      // 2e1: getfield z96.up_ Ljnq;
      // 2e4: aload 0
      // 2e5: getfield mlk.fle Lz96;
      // 2e8: getfield z96.up_ Ljnq;
      // 2eb: getfield jnq.nb5 I
      // 2ee: invokevirtual _jc.s4t (Lrsi;I)Lvrx;
      // 2f1: astore 10
      // 2f3: aload 0
      // 2f4: getfield mlk.fle Lz96;
      // 2f7: getfield z96.daw L_jc;
      // 2fa: invokevirtual _jc.n4z ()V
      // 2fd: aload 0
      // 2fe: getfield mlk.fle Lz96;
      // 301: bipush 0
      // 302: putfield z96._d1 Z
      // 305: aload 0
      // 306: iload 4
      // 308: ifeq 32d
      // 30b: getfield mlk.fle Lz96;
      // 30e: getfield z96.up_ Ljnq;
      // 311: invokevirtual jnq.dxs ()Lerg;
      // 314: aload 1
      // 315: invokevirtual net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.c7n ()Lerg;
      // 318: invokestatic erg.c6l (Lerg;Lerg;)Z
      // 31b: ifne 350
      // 31e: goto 325
      // 321: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 324: athrow
      // 325: aload 0
      // 326: goto 32d
      // 329: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32c: athrow
      // 32d: new net/minecraft/network/play/server/S2FPacketSetSlot
      // 330: dup
      // 331: aload 0
      // 332: getfield mlk.fle Lz96;
      // 335: getfield z96.daw L_jc;
      // 338: getfield _jc.h7l I
      // 33b: aload 10
      // 33d: getfield vrx.zfh I
      // 340: aload 0
      // 341: getfield mlk.fle Lz96;
      // 344: getfield z96.up_ Ljnq;
      // 347: invokevirtual jnq.dxs ()Lerg;
      // 34a: invokespecial net/minecraft/network/play/server/S2FPacketSetSlot.<init> (IILerg;)V
      // 34d: invokevirtual mlk.vnf (Lmz2;)V
      // 350: return
   }

   @Override
   public void pnp(C18PacketSpectate param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: aload 0
      // 006: aload 0
      // 007: getfield mlk.fle Lz96;
      // 00a: invokevirtual z96.b88 ()Ldug;
      // 00d: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 010: aload 0
      // 011: getfield mlk.fle Lz96;
      // 014: invokevirtual z96.myu ()Z
      // 017: ifeq 1d7
      // 01a: aconst_null
      // 01b: astore 3
      // 01c: aload 0
      // 01d: getfield mlk.jcx Lvr1;
      // 020: getfield vr1.p_y [Ldug;
      // 023: astore 4
      // 025: aload 4
      // 027: arraylength
      // 028: istore 5
      // 02a: bipush 0
      // 02b: istore 6
      // 02d: iload 6
      // 02f: iload 5
      // 031: if_icmpge 07a
      // 034: aload 4
      // 036: iload 6
      // 038: aaload
      // 039: astore 7
      // 03b: iload 2
      // 03c: ifeq 076
      // 03f: aload 7
      // 041: iload 2
      // 042: ifeq 0b5
      // 045: goto 04c
      // 048: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: ifnull 073
      // 04f: goto 056
      // 052: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: aload 1
      // 057: aload 7
      // 059: invokevirtual net/minecraft/network/play/client/C18PacketSpectate._28 (Ldug;)Li2h;
      // 05c: astore 3
      // 05d: iload 2
      // 05e: ifeq 076
      // 061: aload 3
      // 062: ifnull 073
      // 065: goto 06c
      // 068: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: goto 07a
      // 06f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: iinc 6 1
      // 076: iload 2
      // 077: ifne 02d
      // 07a: aload 3
      // 07b: iload 2
      // 07c: ifeq 0b2
      // 07f: ifnull 1d7
      // 082: goto 089
      // 085: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: aload 0
      // 08a: getfield mlk.fle Lz96;
      // 08d: aload 0
      // 08e: getfield mlk.fle Lz96;
      // 091: invokevirtual z96.cm6 (Li2h;)V
      // 094: aload 0
      // 095: getfield mlk.fle Lz96;
      // 098: aconst_null
      // 099: checkcast EntityLivingBase
      // 09c: iload 2
      // 09d: ifeq 1c9
      // 0a0: goto 0a7
      // 0a3: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: invokevirtual z96.nw9 (Li2h;)V
      // 0aa: aload 3
      // 0ab: goto 0b2
      // 0ae: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: getfield EntityLivingBase.oay Lt9d;
      // 0b5: aload 0
      // 0b6: getfield mlk.fle Lz96;
      // 0b9: getfield z96.oay Lt9d;
      // 0bc: if_acmpeq 1c4
      // 0bf: aload 0
      // 0c0: getfield mlk.fle Lz96;
      // 0c3: invokevirtual z96.b88 ()Ldug;
      // 0c6: astore 4
      // 0c8: aload 3
      // 0c9: getfield EntityLivingBase.oay Lt9d;
      // 0cc: checkcast dug
      // 0cf: astore 5
      // 0d1: aload 0
      // 0d2: getfield mlk.fle Lz96;
      // 0d5: aload 3
      // 0d6: getfield EntityLivingBase.ohd I
      // 0d9: putfield z96.ohd I
      // 0dc: aload 0
      // 0dd: new net/minecraft/network/play/server/S07PacketRespawn
      // 0e0: dup
      // 0e1: aload 0
      // 0e2: getfield mlk.fle Lz96;
      // 0e5: getfield z96.ohd I
      // 0e8: aload 4
      // 0ea: invokevirtual dug.rbk ()Lv66;
      // 0ed: aload 4
      // 0ef: invokevirtual dug.r7d ()Lcog;
      // 0f2: invokevirtual cog.z28 ()Lgxq;
      // 0f5: aload 0
      // 0f6: getfield mlk.fle Lz96;
      // 0f9: getfield z96._am Lrsh;
      // 0fc: invokevirtual rsh.tmw ()Lh50$f05;
      // 0ff: invokespecial net/minecraft/network/play/server/S07PacketRespawn.<init> (ILv66;Lgxq;Lh50$f05;)V
      // 102: invokevirtual mlk.vnf (Lmz2;)V
      // 105: aload 4
      // 107: aload 0
      // 108: getfield mlk.fle Lz96;
      // 10b: invokevirtual dug.k1e (Li2h;)V
      // 10e: aload 0
      // 10f: getfield mlk.fle Lz96;
      // 112: bipush 0
      // 113: putfield z96.ma9 Z
      // 116: aload 0
      // 117: getfield mlk.fle Lz96;
      // 11a: aload 3
      // 11b: getfield EntityLivingBase.o2v D
      // 11e: aload 3
      // 11f: getfield EntityLivingBase.kfp D
      // 122: aload 3
      // 123: getfield EntityLivingBase.vbd D
      // 126: aload 3
      // 127: getfield EntityLivingBase.x5k F
      // 12a: aload 3
      // 12b: getfield EntityLivingBase.y2i F
      // 12e: invokevirtual z96.x24 (DDDFF)V
      // 131: aload 0
      // 132: getfield mlk.fle Lz96;
      // 135: iload 2
      // 136: ifeq 19b
      // 139: invokevirtual z96.gzr ()Z
      // 13c: ifeq 16b
      // 13f: goto 146
      // 142: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: aload 4
      // 148: aload 0
      // 149: getfield mlk.fle Lz96;
      // 14c: bipush 0
      // 14d: invokevirtual dug.wu1 (Li2h;Z)V
      // 150: aload 5
      // 152: aload 0
      // 153: getfield mlk.fle Lz96;
      // 156: invokevirtual dug.xzq (Li2h;)Z
      // 159: pop
      // 15a: aload 5
      // 15c: aload 0
      // 15d: getfield mlk.fle Lz96;
      // 160: bipush 0
      // 161: invokevirtual dug.wu1 (Li2h;Z)V
      // 164: goto 16b
      // 167: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield mlk.fle Lz96;
      // 16f: aload 5
      // 171: invokevirtual z96.gj3 (Lt9d;)V
      // 174: aload 0
      // 175: getfield mlk.jcx Lvr1;
      // 178: invokevirtual vr1.wh3 ()Lwlx;
      // 17b: aload 0
      // 17c: getfield mlk.fle Lz96;
      // 17f: aload 4
      // 181: invokevirtual wlx.l_8 (Lz96;Ldug;)V
      // 184: aload 0
      // 185: getfield mlk.fle Lz96;
      // 188: aload 3
      // 189: getfield EntityLivingBase.o2v D
      // 18c: aload 3
      // 18d: getfield EntityLivingBase.kfp D
      // 190: aload 3
      // 191: getfield EntityLivingBase.vbd D
      // 194: invokevirtual z96.clj (DDD)V
      // 197: aload 0
      // 198: getfield mlk.fle Lz96;
      // 19b: getfield z96._am Lrsh;
      // 19e: aload 5
      // 1a0: invokevirtual rsh.nzt (Ldug;)V
      // 1a3: aload 0
      // 1a4: getfield mlk.jcx Lvr1;
      // 1a7: invokevirtual vr1.wh3 ()Lwlx;
      // 1aa: aload 0
      // 1ab: getfield mlk.fle Lz96;
      // 1ae: aload 5
      // 1b0: invokevirtual wlx.o9x (Lz96;Ldug;)V
      // 1b3: aload 0
      // 1b4: getfield mlk.jcx Lvr1;
      // 1b7: invokevirtual vr1.wh3 ()Lwlx;
      // 1ba: aload 0
      // 1bb: getfield mlk.fle Lz96;
      // 1be: invokevirtual wlx.izd (Lz96;)V
      // 1c1: goto 1d7
      // 1c4: aload 0
      // 1c5: getfield mlk.fle Lz96;
      // 1c8: aload 3
      // 1c9: getfield EntityLivingBase.o2v D
      // 1cc: aload 3
      // 1cd: getfield EntityLivingBase.kfp D
      // 1d0: aload 3
      // 1d1: getfield EntityLivingBase.vbd D
      // 1d4: invokevirtual z96.clj (DDD)V
      // 1d7: return
   }

   @Override
   public void cy5(C19PacketResourcePackStatus var1) {
   }

   @Override
   public void az3(ekw param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic mlk.a J
      // 03: ldc2_w 69551878359045
      // 06: lxor
      // 07: lstore 2
      // 08: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 0b: new java/lang/StringBuilder
      // 0e: dup
      // 0f: invokespecial java/lang/StringBuilder.<init> ()V
      // 12: aload 0
      // 13: getfield mlk.fle Lz96;
      // 16: invokevirtual z96.noc ()Ljava/lang/String;
      // 19: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c: sipush 2417
      // 1f: ldc2_w 7467694578293966061
      // 22: lload 2
      // 23: lxor
      // 24: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: nop
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: aload 1
      // 2e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 31: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 34: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 39: invokestatic OpaquePredicate.c ()I
      // 3c: aload 0
      // 3d: getfield mlk.jcx Lvr1;
      // 40: invokevirtual vr1.bag ()V
      // 43: istore 4
      // 45: new hsu
      // 48: dup
      // 49: sipush 24935
      // 4c: ldc2_w 6857336511223655655
      // 4f: lload 2
      // 50: lxor
      // 51: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: nop
      // 57: bipush 1
      // 58: anewarray 22
      // 5b: dup
      // 5c: bipush 0
      // 5d: aload 0
      // 5e: getfield mlk.fle Lz96;
      // 61: invokevirtual z96.xyw ()Lekw;
      // 64: aastore
      // 65: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 68: astore 5
      // 6a: aload 5
      // 6c: invokevirtual hsu.f4q ()Lpoy;
      // 6f: getstatic syo.iyk Lsyo;
      // 72: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 75: pop
      // 76: aload 0
      // 77: getfield mlk.jcx Lvr1;
      // 7a: invokevirtual vr1.wh3 ()Lwlx;
      // 7d: aload 5
      // 7f: invokevirtual wlx.d3z (Lekw;)V
      // 82: aload 0
      // 83: getfield mlk.fle Lz96;
      // 86: invokevirtual z96.yb2 ()V
      // 89: aload 0
      // 8a: getfield mlk.jcx Lvr1;
      // 8d: invokevirtual vr1.wh3 ()Lwlx;
      // 90: aload 0
      // 91: getfield mlk.fle Lz96;
      // 94: invokevirtual wlx.rs8 (Lz96;)V
      // 97: aload 0
      // 98: getfield mlk.jcx Lvr1;
      // 9b: invokevirtual vr1.a59 ()Z
      // 9e: iload 4
      // a0: ifne d1
      // a3: ifeq f8
      // a6: goto ad
      // a9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: aload 0
      // ae: iload 4
      // b0: ifne f2
      // b3: goto ba
      // b6: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b9: athrow
      // ba: getfield mlk.fle Lz96;
      // bd: invokevirtual z96.noc ()Ljava/lang/String;
      // c0: aload 0
      // c1: getfield mlk.jcx Lvr1;
      // c4: invokevirtual vr1.p4h ()Ljava/lang/String;
      // c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // ca: goto d1
      // cd: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0: athrow
      // d1: ifeq f8
      // d4: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // d7: sipush 21923
      // da: ldc2_w 8082030277071984652
      // dd: lload 2
      // de: lxor
      // df: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e4: nop
      // e5: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // ea: aload 0
      // eb: goto f2
      // ee: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f1: athrow
      // f2: getfield mlk.jcx Lvr1;
      // f5: invokevirtual vr1.eqw ()V
      // f8: return
   }

   public void vnf(mz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic mlk.a J
      // 03: ldc2_w 87000797988083
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq 28
      // 13: instanceof net/minecraft/network/play/server/S02PacketChat
      // 16: ifeq 67
      // 19: goto 20
      // 1c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: checkcast net/minecraft/network/play/server/S02PacketChat
      // 2b: astore 5
      // 2d: aload 0
      // 2e: getfield mlk.fle Lz96;
      // 31: invokevirtual z96.apj ()Lha9$c4q;
      // 34: astore 6
      // 36: aload 6
      // 38: getstatic ha9$c4q.ulg Lha9$c4q;
      // 3b: iload 4
      // 3d: ifeq 50
      // 40: if_acmpne 4b
      // 43: goto 4a
      // 46: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: return
      // 4b: aload 6
      // 4d: getstatic ha9$c4q.rw4 Lha9$c4q;
      // 50: if_acmpne 67
      // 53: aload 5
      // 55: invokevirtual net/minecraft/network/play/server/S02PacketChat.h7z ()Z
      // 58: ifne 67
      // 5b: goto 62
      // 5e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: return
      // 63: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 0
      // 68: getfield mlk.h1h Lhv0;
      // 6b: aload 1
      // 6c: invokevirtual hv0.k7f (Lmz2;)V
      // 6f: goto c4
      // 72: astore 5
      // 74: aload 5
      // 76: sipush 28450
      // 79: ldc2_w 4467198871587450447
      // 7c: lload 2
      // 7d: lxor
      // 7e: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: nop
      // 84: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 87: astore 6
      // 89: aload 6
      // 8b: sipush 6188
      // 8e: ldc2_w 3158429267995400532
      // 91: lload 2
      // 92: lxor
      // 93: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: nop
      // 99: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 9c: astore 7
      // 9e: aload 7
      // a0: sipush 10910
      // a3: ldc2_w 190395173743864770
      // a6: lload 2
      // a7: lxor
      // a8: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: nop
      // ae: new mlk$3
      // b1: dup
      // b2: aload 0
      // b3: aload 1
      // b4: invokespecial mlk$3.<init> (Lmlk;Lmz2;)V
      // b7: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // ba: new oov
      // bd: dup
      // be: aload 6
      // c0: invokespecial oov.<init> (Le1i;)V
      // c3: athrow
      // c4: return
   }

   @Override
   public void gd3(C09PacketHeldItemChange param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic mlk.a J
      // 03: ldc2_w 109920045694966
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: aload 0
      // 0f: aload 0
      // 10: getfield mlk.fle Lz96;
      // 13: invokevirtual z96.b88 ()Ldug;
      // 16: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/network/play/client/C09PacketHeldItemChange._7g ()I
      // 1d: iload 4
      // 1f: ifne 37
      // 22: iflt 5e
      // 25: goto 2c
      // 28: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 1
      // 2d: invokevirtual net/minecraft/network/play/client/C09PacketHeldItemChange._7g ()I
      // 30: goto 37
      // 33: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: invokestatic jnq.jxk ()I
      // 3a: if_icmpge 5e
      // 3d: aload 0
      // 3e: getfield mlk.fle Lz96;
      // 41: getfield z96.up_ Ljnq;
      // 44: aload 1
      // 45: invokevirtual net/minecraft/network/play/client/C09PacketHeldItemChange._7g ()I
      // 48: putfield jnq.nb5 I
      // 4b: aload 0
      // 4c: getfield mlk.fle Lz96;
      // 4f: invokevirtual z96.wli ()V
      // 52: iload 4
      // 54: ifeq 92
      // 57: goto 5e
      // 5a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 61: new java/lang/StringBuilder
      // 64: dup
      // 65: invokespecial java/lang/StringBuilder.<init> ()V
      // 68: aload 0
      // 69: getfield mlk.fle Lz96;
      // 6c: invokevirtual z96.noc ()Ljava/lang/String;
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72: sipush 12727
      // 75: ldc2_w 4675927665874668480
      // 78: lload 2
      // 79: lxor
      // 7a: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 86: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 8b: goto 92
      // 8e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: return
   }

   @Override
   public void lad(C01PacketChatMessage param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 4726093539370
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: aload 0
      // 00f: aload 0
      // 010: getfield mlk.fle Lz96;
      // 013: invokevirtual z96.b88 ()Ldug;
      // 016: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 019: aload 0
      // 01a: getfield mlk.fle Lz96;
      // 01d: iload 4
      // 01f: ifne 076
      // 022: invokevirtual z96.apj ()Lha9$c4q;
      // 025: getstatic ha9$c4q.ulg Lha9$c4q;
      // 028: if_acmpne 06b
      // 02b: goto 032
      // 02e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: new hsu
      // 035: dup
      // 036: sipush 7952
      // 039: ldc2_w 8821910358558225086
      // 03c: lload 2
      // 03d: lxor
      // 03e: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: nop
      // 044: bipush 0
      // 045: anewarray 22
      // 048: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 04b: astore 5
      // 04d: aload 5
      // 04f: invokevirtual hsu.f4q ()Lpoy;
      // 052: getstatic syo.aez Lsyo;
      // 055: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 058: pop
      // 059: aload 0
      // 05a: new net/minecraft/network/play/server/S02PacketChat
      // 05d: dup
      // 05e: aload 5
      // 060: invokespecial net/minecraft/network/play/server/S02PacketChat.<init> (Lekw;)V
      // 063: invokevirtual mlk.vnf (Lmz2;)V
      // 066: iload 4
      // 068: ifeq 179
      // 06b: aload 0
      // 06c: getfield mlk.fle Lz96;
      // 06f: goto 076
      // 072: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: invokevirtual z96.wli ()V
      // 079: aload 1
      // 07a: invokevirtual net/minecraft/network/play/client/C01PacketChatMessage.pw6 ()Ljava/lang/String;
      // 07d: astore 5
      // 07f: aload 5
      // 081: invokestatic org/apache/commons/lang3/StringUtils.normalizeSpace (Ljava/lang/String;)Ljava/lang/String;
      // 084: astore 5
      // 086: bipush 0
      // 087: istore 6
      // 089: iload 6
      // 08b: aload 5
      // 08d: invokevirtual java/lang/String.length ()I
      // 090: if_icmpge 0cb
      // 093: aload 5
      // 095: iload 6
      // 097: invokevirtual java/lang/String.charAt (I)C
      // 09a: invokestatic _xi._m2 (C)Z
      // 09d: iload 4
      // 09f: ifne 0d3
      // 0a2: ifne 0c3
      // 0a5: goto 0ac
      // 0a8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: sipush 1662
      // 0b0: ldc2_w 5451464241129139199
      // 0b3: lload 2
      // 0b4: lxor
      // 0b5: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: nop
      // 0bb: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 0be: return
      // 0bf: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: iinc 6 1
      // 0c6: iload 4
      // 0c8: ifeq 089
      // 0cb: aload 5
      // 0cd: ldc "/"
      // 0cf: nop
      // 0d0: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0d3: ifeq 0e8
      // 0d6: aload 0
      // 0d7: aload 5
      // 0d9: invokespecial mlk.f8w (Ljava/lang/String;)V
      // 0dc: iload 4
      // 0de: ifeq 11f
      // 0e1: goto 0e8
      // 0e4: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: new hsu
      // 0eb: dup
      // 0ec: sipush 11799
      // 0ef: ldc2_w 1372910250286384002
      // 0f2: lload 2
      // 0f3: lxor
      // 0f4: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: nop
      // 0fa: bipush 2
      // 0fb: anewarray 22
      // 0fe: dup
      // 0ff: bipush 0
      // 100: aload 0
      // 101: getfield mlk.fle Lz96;
      // 104: invokevirtual z96.xyw ()Lekw;
      // 107: aastore
      // 108: dup
      // 109: bipush 1
      // 10a: aload 5
      // 10c: aastore
      // 10d: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 110: astore 6
      // 112: aload 0
      // 113: getfield mlk.jcx Lvr1;
      // 116: invokevirtual vr1.wh3 ()Lwlx;
      // 119: aload 6
      // 11b: bipush 0
      // 11c: invokevirtual wlx.fkx (Lekw;Z)V
      // 11f: aload 0
      // 120: dup
      // 121: getfield mlk.jiw I
      // 124: bipush 20
      // 126: iadd
      // 127: putfield mlk.jiw I
      // 12a: aload 0
      // 12b: getfield mlk.jiw I
      // 12e: iload 4
      // 130: ifne 164
      // 133: sipush 200
      // 136: if_icmple 179
      // 139: goto 140
      // 13c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: aload 0
      // 141: iload 4
      // 143: ifne 168
      // 146: goto 14d
      // 149: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: getfield mlk.jcx Lvr1;
      // 150: invokevirtual vr1.wh3 ()Lwlx;
      // 153: aload 0
      // 154: getfield mlk.fle Lz96;
      // 157: invokevirtual z96.x6l ()Lcom/mojang/authlib/GameProfile;
      // 15a: invokevirtual wlx.sbc (Lcom/mojang/authlib/GameProfile;)Z
      // 15d: goto 164
      // 160: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: ifne 179
      // 167: aload 0
      // 168: sipush 19167
      // 16b: ldc2_w 8998671663265212242
      // 16e: lload 2
      // 16f: lxor
      // 170: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: nop
      // 176: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 179: return
   }

   private void f8w(String var1) {
      this.jcx.rns().q2n(this.fle, var1);
   }

   @Override
   public void vk9(C0APacketAnimation var1) {
      et9.hqd(var1, this, this.fle.b88());
      this.fle.wli();
      this.fle.hgb();
   }

   @Override
   public void z1g(C0BPacketEntityAction param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 61322647501022
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: aload 0
      // 00f: aload 0
      // 010: getfield mlk.fle Lz96;
      // 013: invokevirtual z96.b88 ()Ldug;
      // 016: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 019: aload 0
      // 01a: getfield mlk.fle Lz96;
      // 01d: invokevirtual z96.wli ()V
      // 020: iload 4
      // 022: ifne 06f
      // 025: getstatic mlk$4.mz1 [I
      // 028: aload 1
      // 029: invokevirtual net/minecraft/network/play/client/C0BPacketEntityAction.zwv ()Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;
      // 02c: invokevirtual net/minecraft/network/play/client/C0BPacketEntityAction$ck7.ordinal ()I
      // 02f: iaload
      // 030: tableswitch 277 1 7 48 68 88 108 128 155 216
      // 05c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield mlk.fle Lz96;
      // 064: bipush 1
      // 065: invokevirtual z96.rh_ (Z)V
      // 068: goto 06f
      // 06b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: iload 4
      // 071: ifeq 15f
      // 074: aload 0
      // 075: getfield mlk.fle Lz96;
      // 078: bipush 0
      // 079: invokevirtual z96.rh_ (Z)V
      // 07c: iload 4
      // 07e: ifeq 15f
      // 081: goto 088
      // 084: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: aload 0
      // 089: getfield mlk.fle Lz96;
      // 08c: bipush 1
      // 08d: invokevirtual z96.fqc (Z)V
      // 090: iload 4
      // 092: ifeq 15f
      // 095: goto 09c
      // 098: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield mlk.fle Lz96;
      // 0a0: bipush 0
      // 0a1: invokevirtual z96.fqc (Z)V
      // 0a4: iload 4
      // 0a6: ifeq 15f
      // 0a9: goto 0b0
      // 0ac: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield mlk.fle Lz96;
      // 0b4: bipush 0
      // 0b5: bipush 1
      // 0b6: bipush 1
      // 0b7: invokevirtual z96.thu (ZZZ)V
      // 0ba: aload 0
      // 0bb: bipush 0
      // 0bc: putfield mlk.zoq Z
      // 0bf: iload 4
      // 0c1: ifeq 15f
      // 0c4: goto 0cb
      // 0c7: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield mlk.fle Lz96;
      // 0cf: getfield z96.hzp Li2h;
      // 0d2: iload 4
      // 0d4: ifne 0f9
      // 0d7: goto 0de
      // 0da: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: instanceof zfo
      // 0e1: ifeq 15f
      // 0e4: goto 0eb
      // 0e7: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield mlk.fle Lz96;
      // 0ef: getfield z96.hzp Li2h;
      // 0f2: goto 0f9
      // 0f5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: checkcast zfo
      // 0fc: aload 1
      // 0fd: invokevirtual net/minecraft/network/play/client/C0BPacketEntityAction.tdn ()I
      // 100: invokevirtual zfo.kei (I)V
      // 103: iload 4
      // 105: ifeq 15f
      // 108: aload 0
      // 109: getfield mlk.fle Lz96;
      // 10c: getfield z96.hzp Li2h;
      // 10f: iload 4
      // 111: ifne 136
      // 114: goto 11b
      // 117: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: instanceof zfo
      // 11e: ifeq 15f
      // 121: goto 128
      // 124: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 0
      // 129: getfield mlk.fle Lz96;
      // 12c: getfield z96.hzp Li2h;
      // 12f: goto 136
      // 132: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 135: athrow
      // 136: checkcast zfo
      // 139: aload 0
      // 13a: getfield mlk.fle Lz96;
      // 13d: invokevirtual zfo.aag (Lha9;)V
      // 140: iload 4
      // 142: ifeq 15f
      // 145: new java/lang/IllegalArgumentException
      // 148: dup
      // 149: sipush 4811
      // 14c: ldc2_w 4944561857074769798
      // 14f: lload 2
      // 150: lxor
      // 151: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: nop
      // 157: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 15a: athrow
      // 15b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: return
   }

   @Override
   public void x66(C02PacketUseEntity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 26831523734478
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield mlk.fle Lz96;
      // 00e: invokevirtual z96.b88 ()Ldug;
      // 011: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 014: invokestatic OpaquePredicate.b ()I
      // 017: aload 0
      // 018: getfield mlk.jcx Lvr1;
      // 01b: aload 0
      // 01c: getfield mlk.fle Lz96;
      // 01f: getfield z96.ohd I
      // 022: invokevirtual vr1.hrw (I)Ldug;
      // 025: astore 5
      // 027: istore 4
      // 029: aload 1
      // 02a: aload 5
      // 02c: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity._nk (Lt9d;)Li2h;
      // 02f: astore 6
      // 031: aload 0
      // 032: getfield mlk.fle Lz96;
      // 035: iload 4
      // 037: ifeq 054
      // 03a: invokevirtual z96.wli ()V
      // 03d: aload 6
      // 03f: ifnull 1b7
      // 042: goto 049
      // 045: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield mlk.fle Lz96;
      // 04d: goto 054
      // 050: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 6
      // 056: invokevirtual z96.gq6 (Li2h;)Z
      // 059: istore 7
      // 05b: ldc2_w 36.0
      // 05e: dstore 8
      // 060: iload 7
      // 062: iload 4
      // 064: ifeq 082
      // 067: ifne 076
      // 06a: goto 071
      // 06d: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: ldc2_w 9.0
      // 074: dstore 8
      // 076: aload 0
      // 077: getfield mlk.fle Lz96;
      // 07a: aload 6
      // 07c: invokevirtual z96.wxg (Li2h;)D
      // 07f: dload 8
      // 081: dcmpg
      // 082: ifge 1b7
      // 085: aload 1
      // 086: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity.nf7 ()Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 089: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.wc3 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 08c: iload 4
      // 08e: ifeq 0c6
      // 091: goto 098
      // 094: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: if_acmpne 0b8
      // 09b: goto 0a2
      // 09e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield mlk.fle Lz96;
      // 0a6: aload 6
      // 0a8: invokevirtual z96.gve (Li2h;)Z
      // 0ab: pop
      // 0ac: iload 4
      // 0ae: ifne 1b7
      // 0b1: goto 0b8
      // 0b4: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity.nf7 ()Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 0bc: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.s3w Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 0bf: goto 0c6
      // 0c2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: iload 4
      // 0c8: ifeq 0fd
      // 0cb: if_acmpne 0ef
      // 0ce: goto 0d5
      // 0d1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: aload 6
      // 0d7: aload 0
      // 0d8: getfield mlk.fle Lz96;
      // 0db: aload 1
      // 0dc: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity.kvu ()Lfqr;
      // 0df: invokevirtual EntityLivingBase.rc1 (Lha9;Lfqr;)Z
      // 0e2: pop
      // 0e3: iload 4
      // 0e5: ifne 1b7
      // 0e8: goto 0ef
      // 0eb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 1
      // 0f0: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity.nf7 ()Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 0f3: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 0f6: goto 0fd
      // 0f9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: if_acmpne 1b7
      // 100: aload 6
      // 102: instanceof nvf
      // 105: iload 4
      // 107: ifeq 127
      // 10a: goto 111
      // 10d: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: ifne 15a
      // 114: goto 11b
      // 117: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: aload 6
      // 11d: instanceof uno
      // 120: goto 127
      // 123: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: iload 4
      // 129: ifeq 14e
      // 12c: ifne 15a
      // 12f: goto 136
      // 132: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 135: athrow
      // 136: aload 6
      // 138: iload 4
      // 13a: ifeq 153
      // 13d: goto 144
      // 140: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: instanceof hy9
      // 147: goto 14e
      // 14a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: ifne 15a
      // 151: aload 6
      // 153: aload 0
      // 154: getfield mlk.fle Lz96;
      // 157: if_acmpne 1ae
      // 15a: aload 0
      // 15b: sipush 10212
      // 15e: ldc2_w 7831920387846898050
      // 161: lload 2
      // 162: lxor
      // 163: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: nop
      // 169: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 16c: aload 0
      // 16d: getfield mlk.jcx Lvr1;
      // 170: new java/lang/StringBuilder
      // 173: dup
      // 174: invokespecial java/lang/StringBuilder.<init> ()V
      // 177: sipush 31227
      // 17a: ldc2_w 8510112081320042429
      // 17d: lload 2
      // 17e: lxor
      // 17f: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: nop
      // 185: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 188: aload 0
      // 189: getfield mlk.fle Lz96;
      // 18c: invokevirtual z96.noc ()Ljava/lang/String;
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: sipush 30801
      // 195: ldc2_w 8308525223817698851
      // 198: lload 2
      // 199: lxor
      // 19a: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: nop
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a6: invokevirtual vr1.y6f (Ljava/lang/String;)V
      // 1a9: return
      // 1aa: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: getfield mlk.fle Lz96;
      // 1b2: aload 6
      // 1b4: invokevirtual z96.v2x (Li2h;)V
      // 1b7: return
   }

   @Override
   public void zgf(C16PacketClientStatus param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 65988374106201
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield mlk.fle Lz96;
      // 00e: invokevirtual z96.b88 ()Ldug;
      // 011: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 014: invokestatic OpaquePredicate.b ()I
      // 017: aload 0
      // 018: getfield mlk.fle Lz96;
      // 01b: invokevirtual z96.wli ()V
      // 01e: istore 4
      // 020: aload 1
      // 021: invokevirtual net/minecraft/network/play/client/C16PacketClientStatus.wc7 ()Lnet/minecraft/network/play/client/C16PacketClientStatus$v78;
      // 024: astore 5
      // 026: getstatic mlk$4.ewa [I
      // 029: aload 5
      // 02b: invokevirtual net/minecraft/network/play/client/C16PacketClientStatus$v78.ordinal ()I
      // 02e: iaload
      // 02f: iload 4
      // 031: ifeq 062
      // 034: tableswitch 435 1 3 32 392 418
      // 050: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 0
      // 055: getfield mlk.fle Lz96;
      // 058: getfield z96.m92 Z
      // 05b: goto 062
      // 05e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: iload 4
      // 064: ifeq 0a5
      // 067: ifeq 091
      // 06a: goto 071
      // 06d: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 0
      // 072: aload 0
      // 073: getfield mlk.jcx Lvr1;
      // 076: invokevirtual vr1.wh3 ()Lwlx;
      // 079: aload 0
      // 07a: getfield mlk.fle Lz96;
      // 07d: bipush 0
      // 07e: bipush 1
      // 07f: invokevirtual wlx.tzq (Lz96;IZ)Lz96;
      // 082: putfield mlk.fle Lz96;
      // 085: iload 4
      // 087: ifne 1e7
      // 08a: goto 091
      // 08d: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: aload 0
      // 092: getfield mlk.fle Lz96;
      // 095: invokevirtual z96.b88 ()Ldug;
      // 098: invokevirtual dug.r7d ()Lcog;
      // 09b: invokevirtual cog.lce ()Z
      // 09e: goto 0a5
      // 0a1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: iload 4
      // 0a7: ifeq 19f
      // 0aa: ifeq 183
      // 0ad: goto 0b4
      // 0b0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: getfield mlk.jcx Lvr1;
      // 0b8: invokevirtual vr1.a59 ()Z
      // 0bb: iload 4
      // 0bd: ifeq 0f5
      // 0c0: goto 0c7
      // 0c3: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: ifeq 123
      // 0ca: goto 0d1
      // 0cd: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield mlk.fle Lz96;
      // 0d5: iload 4
      // 0d7: ifeq 103
      // 0da: goto 0e1
      // 0dd: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: invokevirtual z96.noc ()Ljava/lang/String;
      // 0e4: aload 0
      // 0e5: getfield mlk.jcx Lvr1;
      // 0e8: invokevirtual vr1.p4h ()Ljava/lang/String;
      // 0eb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ee: goto 0f5
      // 0f1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: ifeq 123
      // 0f8: aload 0
      // 0f9: getfield mlk.fle Lz96;
      // 0fc: goto 103
      // 0ff: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: getfield z96.rhh Lmlk;
      // 106: sipush 17272
      // 109: ldc2_w 2095981079540045498
      // 10c: lload 2
      // 10d: lxor
      // 10e: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: nop
      // 114: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 117: aload 0
      // 118: getfield mlk.jcx Lvr1;
      // 11b: invokevirtual vr1.fdo ()V
      // 11e: iload 4
      // 120: ifne 1e7
      // 123: new b06
      // 126: dup
      // 127: aload 0
      // 128: getfield mlk.fle Lz96;
      // 12b: invokevirtual z96.x6l ()Lcom/mojang/authlib/GameProfile;
      // 12e: aconst_null
      // 12f: checkcast java/util/Date
      // 132: sipush 32579
      // 135: ldc2_w 1987298727680748166
      // 138: lload 2
      // 139: lxor
      // 13a: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: nop
      // 140: aconst_null
      // 141: checkcast java/util/Date
      // 144: sipush 12405
      // 147: ldc2_w 4993815801688155558
      // 14a: lload 2
      // 14b: lxor
      // 14c: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: nop
      // 152: invokespecial b06.<init> (Lcom/mojang/authlib/GameProfile;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V
      // 155: astore 6
      // 157: aload 0
      // 158: getfield mlk.jcx Lvr1;
      // 15b: invokevirtual vr1.wh3 ()Lwlx;
      // 15e: invokevirtual wlx.w68 ()Lwxb;
      // 161: aload 6
      // 163: invokevirtual wxb.g7w (Lsyv;)V
      // 166: aload 0
      // 167: getfield mlk.fle Lz96;
      // 16a: getfield z96.rhh Lmlk;
      // 16d: sipush 13328
      // 170: ldc2_w 5854572475459068366
      // 173: lload 2
      // 174: lxor
      // 175: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: nop
      // 17b: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 17e: iload 4
      // 180: ifne 1e7
      // 183: aload 0
      // 184: iload 4
      // 186: ifeq 1a4
      // 189: goto 190
      // 18c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: getfield mlk.fle Lz96;
      // 193: invokevirtual z96.i55 ()F
      // 196: fconst_0
      // 197: fcmpl
      // 198: goto 19f
      // 19b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: ifle 1a3
      // 1a2: return
      // 1a3: aload 0
      // 1a4: aload 0
      // 1a5: getfield mlk.jcx Lvr1;
      // 1a8: invokevirtual vr1.wh3 ()Lwlx;
      // 1ab: aload 0
      // 1ac: getfield mlk.fle Lz96;
      // 1af: bipush 0
      // 1b0: bipush 0
      // 1b1: invokevirtual wlx.tzq (Lz96;IZ)Lz96;
      // 1b4: putfield mlk.fle Lz96;
      // 1b7: iload 4
      // 1b9: ifne 1e7
      // 1bc: aload 0
      // 1bd: getfield mlk.fle Lz96;
      // 1c0: invokevirtual z96._m3 ()Ldc5;
      // 1c3: aload 0
      // 1c4: getfield mlk.fle Lz96;
      // 1c7: invokevirtual dc5.gts (Lz96;)V
      // 1ca: iload 4
      // 1cc: ifne 1e7
      // 1cf: goto 1d6
      // 1d2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: getfield mlk.fle Lz96;
      // 1da: getstatic y8d.j5f Ll7l;
      // 1dd: invokevirtual z96.aex (L_ss;)V
      // 1e0: goto 1e7
      // 1e3: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e6: athrow
      // 1e7: return
   }

   @Override
   public void ebs(C0DPacketCloseWindow var1) {
      et9.hqd(var1, this, this.fle.b88());
      this.fle.wib();
   }

   @Override
   public void u0n(C0EPacketClickWindow param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield mlk.fle Lz96;
      // 006: invokevirtual z96.b88 ()Ldug;
      // 009: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: aload 0
      // 010: getfield mlk.fle Lz96;
      // 013: invokevirtual z96.wli ()V
      // 016: istore 2
      // 017: aload 0
      // 018: getfield mlk.fle Lz96;
      // 01b: getfield z96.daw L_jc;
      // 01e: getfield _jc.h7l I
      // 021: iload 2
      // 022: ifne 048
      // 025: aload 1
      // 026: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.okj ()I
      // 029: if_icmpne 1f3
      // 02c: goto 033
      // 02f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: aload 0
      // 034: getfield mlk.fle Lz96;
      // 037: getfield z96.daw L_jc;
      // 03a: aload 0
      // 03b: getfield mlk.fle Lz96;
      // 03e: invokevirtual _jc.yyp (Lha9;)Z
      // 041: goto 048
      // 044: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: iload 2
      // 049: ifne 06f
      // 04c: ifeq 1f3
      // 04f: goto 056
      // 052: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: aload 0
      // 057: getfield mlk.fle Lz96;
      // 05a: iload 2
      // 05b: ifne 0db
      // 05e: goto 065
      // 061: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: invokevirtual z96.myu ()Z
      // 068: goto 06f
      // 06b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: ifeq 0d0
      // 072: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 075: astore 3
      // 076: bipush 0
      // 077: istore 4
      // 079: iload 4
      // 07b: aload 0
      // 07c: getfield mlk.fle Lz96;
      // 07f: getfield z96.daw L_jc;
      // 082: getfield _jc.wjd Ljava/util/List;
      // 085: invokeinterface java/util/List.size ()I 1
      // 08a: if_icmpge 0bd
      // 08d: aload 3
      // 08e: aload 0
      // 08f: getfield mlk.fle Lz96;
      // 092: getfield z96.daw L_jc;
      // 095: getfield _jc.wjd Ljava/util/List;
      // 098: iload 4
      // 09a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 09f: checkcast vrx
      // 0a2: invokevirtual vrx.x4s ()Lerg;
      // 0a5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0aa: pop
      // 0ab: iinc 4 1
      // 0ae: iload 2
      // 0af: ifne 0cc
      // 0b2: iload 2
      // 0b3: ifeq 079
      // 0b6: goto 0bd
      // 0b9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield mlk.fle Lz96;
      // 0c1: aload 0
      // 0c2: getfield mlk.fle Lz96;
      // 0c5: getfield z96.daw L_jc;
      // 0c8: aload 3
      // 0c9: invokevirtual z96.ynq (L_jc;Ljava/util/List;)V
      // 0cc: iload 2
      // 0cd: ifeq 1f3
      // 0d0: aload 0
      // 0d1: getfield mlk.fle Lz96;
      // 0d4: goto 0db
      // 0d7: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: getfield z96.daw L_jc;
      // 0de: aload 1
      // 0df: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.ig4 ()I
      // 0e2: aload 1
      // 0e3: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.sq6 ()I
      // 0e6: aload 1
      // 0e7: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.bzn ()I
      // 0ea: aload 0
      // 0eb: getfield mlk.fle Lz96;
      // 0ee: invokevirtual _jc.b7m (IIILha9;)Lerg;
      // 0f1: astore 3
      // 0f2: iload 2
      // 0f3: ifne 196
      // 0f6: aload 1
      // 0f7: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.zo5 ()Lerg;
      // 0fa: aload 3
      // 0fb: invokestatic erg.c6l (Lerg;Lerg;)Z
      // 0fe: ifeq 14e
      // 101: goto 108
      // 104: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 0
      // 109: getfield mlk.fle Lz96;
      // 10c: getfield z96.rhh Lmlk;
      // 10f: new net/minecraft/network/play/server/S32PacketConfirmTransaction
      // 112: dup
      // 113: aload 1
      // 114: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.okj ()I
      // 117: aload 1
      // 118: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.lhq ()S
      // 11b: bipush 1
      // 11c: invokespecial net/minecraft/network/play/server/S32PacketConfirmTransaction.<init> (ISZ)V
      // 11f: invokevirtual mlk.vnf (Lmz2;)V
      // 122: aload 0
      // 123: getfield mlk.fle Lz96;
      // 126: bipush 1
      // 127: putfield z96._d1 Z
      // 12a: aload 0
      // 12b: getfield mlk.fle Lz96;
      // 12e: getfield z96.daw L_jc;
      // 131: invokevirtual _jc.n4z ()V
      // 134: aload 0
      // 135: getfield mlk.fle Lz96;
      // 138: invokevirtual z96.kbu ()V
      // 13b: aload 0
      // 13c: getfield mlk.fle Lz96;
      // 13f: bipush 0
      // 140: putfield z96._d1 Z
      // 143: iload 2
      // 144: ifeq 1f3
      // 147: goto 14e
      // 14a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: aload 0
      // 14f: getfield mlk.axq Lpni;
      // 152: aload 0
      // 153: getfield mlk.fle Lz96;
      // 156: getfield z96.daw L_jc;
      // 159: getfield _jc.h7l I
      // 15c: aload 1
      // 15d: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.lhq ()S
      // 160: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 163: invokevirtual pni.yfe (ILjava/lang/Object;)V
      // 166: aload 0
      // 167: getfield mlk.fle Lz96;
      // 16a: getfield z96.rhh Lmlk;
      // 16d: new net/minecraft/network/play/server/S32PacketConfirmTransaction
      // 170: dup
      // 171: aload 1
      // 172: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.okj ()I
      // 175: aload 1
      // 176: invokevirtual net/minecraft/network/play/client/C0EPacketClickWindow.lhq ()S
      // 179: bipush 0
      // 17a: invokespecial net/minecraft/network/play/server/S32PacketConfirmTransaction.<init> (ISZ)V
      // 17d: invokevirtual mlk.vnf (Lmz2;)V
      // 180: aload 0
      // 181: getfield mlk.fle Lz96;
      // 184: getfield z96.daw L_jc;
      // 187: aload 0
      // 188: getfield mlk.fle Lz96;
      // 18b: bipush 0
      // 18c: invokevirtual _jc._fi (Lha9;Z)V
      // 18f: goto 196
      // 192: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 195: athrow
      // 196: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 199: astore 4
      // 19b: bipush 0
      // 19c: istore 5
      // 19e: iload 5
      // 1a0: aload 0
      // 1a1: getfield mlk.fle Lz96;
      // 1a4: getfield z96.daw L_jc;
      // 1a7: getfield _jc.wjd Ljava/util/List;
      // 1aa: invokeinterface java/util/List.size ()I 1
      // 1af: if_icmpge 1e3
      // 1b2: aload 4
      // 1b4: aload 0
      // 1b5: getfield mlk.fle Lz96;
      // 1b8: getfield z96.daw L_jc;
      // 1bb: getfield _jc.wjd Ljava/util/List;
      // 1be: iload 5
      // 1c0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1c5: checkcast vrx
      // 1c8: invokevirtual vrx.x4s ()Lerg;
      // 1cb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d0: pop
      // 1d1: iinc 5 1
      // 1d4: iload 2
      // 1d5: ifne 1f3
      // 1d8: iload 2
      // 1d9: ifeq 19e
      // 1dc: goto 1e3
      // 1df: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e2: athrow
      // 1e3: aload 0
      // 1e4: getfield mlk.fle Lz96;
      // 1e7: aload 0
      // 1e8: getfield mlk.fle Lz96;
      // 1eb: getfield z96.daw L_jc;
      // 1ee: aload 4
      // 1f0: invokevirtual z96.ynq (L_jc;Ljava/util/List;)V
      // 1f3: return
   }

   @Override
   public void gtn(C11PacketEnchantItem param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield mlk.fle Lz96;
      // 06: invokevirtual z96.b88 ()Ldug;
      // 09: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aload 0
      // 10: getfield mlk.fle Lz96;
      // 13: invokevirtual z96.wli ()V
      // 16: istore 2
      // 17: aload 0
      // 18: getfield mlk.fle Lz96;
      // 1b: getfield z96.daw L_jc;
      // 1e: getfield _jc.h7l I
      // 21: iload 2
      // 22: ifeq 48
      // 25: aload 1
      // 26: invokevirtual net/minecraft/network/play/client/C11PacketEnchantItem.sp9 ()I
      // 29: if_icmpne 96
      // 2c: goto 33
      // 2f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: getfield mlk.fle Lz96;
      // 37: getfield z96.daw L_jc;
      // 3a: aload 0
      // 3b: getfield mlk.fle Lz96;
      // 3e: invokevirtual _jc.yyp (Lha9;)Z
      // 41: goto 48
      // 44: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: iload 2
      // 49: ifeq 64
      // 4c: ifeq 96
      // 4f: goto 56
      // 52: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 0
      // 57: getfield mlk.fle Lz96;
      // 5a: invokevirtual z96.myu ()Z
      // 5d: goto 64
      // 60: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: iload 2
      // 65: ifeq 8b
      // 68: ifne 96
      // 6b: goto 72
      // 6e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: getfield mlk.fle Lz96;
      // 76: getfield z96.daw L_jc;
      // 79: aload 0
      // 7a: getfield mlk.fle Lz96;
      // 7d: aload 1
      // 7e: invokevirtual net/minecraft/network/play/client/C11PacketEnchantItem.ij7 ()I
      // 81: invokevirtual _jc.lza (Lha9;I)Z
      // 84: goto 8b
      // 87: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: pop
      // 8c: aload 0
      // 8d: getfield mlk.fle Lz96;
      // 90: getfield z96.daw L_jc;
      // 93: invokevirtual _jc.n4z ()V
      // 96: return
   }

   @Override
   public void ppm(C10PacketCreativeInventoryAction param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 98451568030073
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: aload 0
      // 00f: aload 0
      // 010: getfield mlk.fle Lz96;
      // 013: invokevirtual z96.b88 ()Ldug;
      // 016: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 019: aload 0
      // 01a: getfield mlk.fle Lz96;
      // 01d: getfield z96._am Lrsh;
      // 020: invokevirtual rsh.u7c ()Z
      // 023: iload 4
      // 025: ifne 03d
      // 028: ifeq 36c
      // 02b: goto 032
      // 02e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 1
      // 033: invokevirtual net/minecraft/network/play/client/C10PacketCreativeInventoryAction.xas ()I
      // 036: goto 03d
      // 039: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: iload 4
      // 03f: ifne 04d
      // 042: ifge 050
      // 045: goto 04c
      // 048: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: bipush 1
      // 04d: goto 051
      // 050: bipush 0
      // 051: istore 5
      // 053: aload 1
      // 054: invokevirtual net/minecraft/network/play/client/C10PacketCreativeInventoryAction.dbs ()Lerg;
      // 057: astore 6
      // 059: aload 6
      // 05b: iload 4
      // 05d: ifne 06c
      // 060: ifnull 188
      // 063: goto 06a
      // 066: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: aload 6
      // 06c: invokevirtual erg.w8b ()Z
      // 06f: iload 4
      // 071: ifne 18c
      // 074: ifeq 188
      // 077: goto 07e
      // 07a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 6
      // 080: invokevirtual erg.zso ()Lbdo;
      // 083: sipush 20327
      // 086: ldc2_w 3375682285132217255
      // 089: lload 2
      // 08a: lxor
      // 08b: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: nop
      // 091: bipush 10
      // 093: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 096: iload 4
      // 098: ifne 18c
      // 09b: goto 0a2
      // 09e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: ifeq 188
      // 0a5: goto 0ac
      // 0a8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 6
      // 0ae: invokevirtual erg.zso ()Lbdo;
      // 0b1: sipush 132
      // 0b4: ldc2_w 2041312732655498329
      // 0b7: lload 2
      // 0b8: lxor
      // 0b9: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: nop
      // 0bf: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 0c2: astore 7
      // 0c4: aload 7
      // 0c6: ldc "x"
      // 0c8: nop
      // 0c9: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 0cc: iload 4
      // 0ce: ifne 18c
      // 0d1: ifeq 188
      // 0d4: goto 0db
      // 0d7: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 7
      // 0dd: ldc "y"
      // 0df: nop
      // 0e0: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 0e3: iload 4
      // 0e5: ifne 18c
      // 0e8: goto 0ef
      // 0eb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: ifeq 188
      // 0f2: goto 0f9
      // 0f5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 7
      // 0fb: ldc "z"
      // 0fd: nop
      // 0fe: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 101: iload 4
      // 103: ifne 18c
      // 106: goto 10d
      // 109: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: ifeq 188
      // 110: goto 117
      // 113: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: new mew
      // 11a: dup
      // 11b: aload 7
      // 11d: ldc "x"
      // 11f: nop
      // 120: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 123: aload 7
      // 125: ldc "y"
      // 127: nop
      // 128: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 12b: aload 7
      // 12d: ldc "z"
      // 12f: nop
      // 130: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 133: invokespecial mew.<init> (III)V
      // 136: astore 8
      // 138: aload 0
      // 139: getfield mlk.fle Lz96;
      // 13c: getfield z96.oay Lt9d;
      // 13f: aload 8
      // 141: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 144: astore 9
      // 146: aload 9
      // 148: ifnull 188
      // 14b: new bdo
      // 14e: dup
      // 14f: invokespecial bdo.<init> ()V
      // 152: astore 10
      // 154: aload 9
      // 156: aload 10
      // 158: invokevirtual pyk.m2a (Lbdo;)V
      // 15b: aload 10
      // 15d: ldc "x"
      // 15f: nop
      // 160: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 163: aload 10
      // 165: ldc "y"
      // 167: nop
      // 168: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 16b: aload 10
      // 16d: ldc "z"
      // 16f: nop
      // 170: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 173: aload 6
      // 175: sipush 132
      // 178: ldc2_w 2041312732655498329
      // 17b: lload 2
      // 17c: lxor
      // 17d: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: nop
      // 183: aload 10
      // 185: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 188: aload 1
      // 189: invokevirtual net/minecraft/network/play/client/C10PacketCreativeInventoryAction.xas ()I
      // 18c: bipush 1
      // 18d: iload 4
      // 18f: ifne 1b9
      // 192: if_icmplt 1c0
      // 195: goto 19c
      // 198: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 1
      // 19d: invokevirtual net/minecraft/network/play/client/C10PacketCreativeInventoryAction.xas ()I
      // 1a0: iload 4
      // 1a2: ifne 1bd
      // 1a5: goto 1ac
      // 1a8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: bipush 36
      // 1ae: invokestatic jnq.jxk ()I
      // 1b1: iadd
      // 1b2: goto 1b9
      // 1b5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: if_icmpge 1c0
      // 1bc: bipush 1
      // 1bd: goto 1c1
      // 1c0: bipush 0
      // 1c1: istore 7
      // 1c3: aload 6
      // 1c5: iload 4
      // 1c7: ifne 1d6
      // 1ca: ifnull 1dc
      // 1cd: goto 1d4
      // 1d0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: aload 6
      // 1d6: invokevirtual erg.gn1 ()Lu7m;
      // 1d9: ifnull 1e4
      // 1dc: bipush 1
      // 1dd: goto 1e5
      // 1e0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: bipush 0
      // 1e5: istore 8
      // 1e7: aload 6
      // 1e9: iload 4
      // 1eb: ifne 1fa
      // 1ee: ifnull 244
      // 1f1: goto 1f8
      // 1f4: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f7: athrow
      // 1f8: aload 6
      // 1fa: invokevirtual erg.j6_ ()I
      // 1fd: iload 4
      // 1ff: ifne 218
      // 202: iflt 248
      // 205: goto 20c
      // 208: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20b: athrow
      // 20c: aload 6
      // 20e: getfield erg.qd2 I
      // 211: goto 218
      // 214: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: iload 4
      // 21a: ifne 235
      // 21d: bipush 64
      // 21f: if_icmpgt 248
      // 222: goto 229
      // 225: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 228: athrow
      // 229: aload 6
      // 22b: getfield erg.qd2 I
      // 22e: goto 235
      // 231: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: iload 4
      // 237: ifne 245
      // 23a: ifle 248
      // 23d: goto 244
      // 240: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 243: athrow
      // 244: bipush 1
      // 245: goto 249
      // 248: bipush 0
      // 249: istore 9
      // 24b: iload 7
      // 24d: iload 4
      // 24f: ifne 2ea
      // 252: ifeq 2e1
      // 255: goto 25c
      // 258: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25b: athrow
      // 25c: iload 8
      // 25e: iload 4
      // 260: ifne 2ea
      // 263: goto 26a
      // 266: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 269: athrow
      // 26a: ifeq 2e1
      // 26d: goto 274
      // 270: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 273: athrow
      // 274: iload 9
      // 276: iload 4
      // 278: ifne 2ea
      // 27b: goto 282
      // 27e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 281: athrow
      // 282: ifeq 2e1
      // 285: goto 28c
      // 288: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28b: athrow
      // 28c: aload 6
      // 28e: ifnonnull 2b6
      // 291: goto 298
      // 294: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 297: athrow
      // 298: aload 0
      // 299: getfield mlk.fle Lz96;
      // 29c: getfield z96.fv9 L_jc;
      // 29f: aload 1
      // 2a0: invokevirtual net/minecraft/network/play/client/C10PacketCreativeInventoryAction.xas ()I
      // 2a3: aconst_null
      // 2a4: checkcast erg
      // 2a7: invokevirtual _jc.tm6 (ILerg;)V
      // 2aa: iload 4
      // 2ac: ifeq 2cd
      // 2af: goto 2b6
      // 2b2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: aload 0
      // 2b7: getfield mlk.fle Lz96;
      // 2ba: getfield z96.fv9 L_jc;
      // 2bd: aload 1
      // 2be: invokevirtual net/minecraft/network/play/client/C10PacketCreativeInventoryAction.xas ()I
      // 2c1: aload 6
      // 2c3: invokevirtual _jc.tm6 (ILerg;)V
      // 2c6: goto 2cd
      // 2c9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cc: athrow
      // 2cd: aload 0
      // 2ce: getfield mlk.fle Lz96;
      // 2d1: getfield z96.fv9 L_jc;
      // 2d4: aload 0
      // 2d5: getfield mlk.fle Lz96;
      // 2d8: bipush 1
      // 2d9: invokevirtual _jc._fi (Lha9;Z)V
      // 2dc: iload 4
      // 2de: ifeq 36c
      // 2e1: iload 5
      // 2e3: goto 2ea
      // 2e6: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e9: athrow
      // 2ea: iload 4
      // 2ec: ifne 2fb
      // 2ef: ifeq 36c
      // 2f2: goto 2f9
      // 2f5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f8: athrow
      // 2f9: iload 8
      // 2fb: iload 4
      // 2fd: ifne 30c
      // 300: ifeq 36c
      // 303: goto 30a
      // 306: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 309: athrow
      // 30a: iload 9
      // 30c: iload 4
      // 30e: ifne 332
      // 311: ifeq 36c
      // 314: goto 31b
      // 317: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31a: athrow
      // 31b: aload 0
      // 31c: iload 4
      // 31e: ifne 34b
      // 321: goto 328
      // 324: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 327: athrow
      // 328: getfield mlk.sz3 I
      // 32b: goto 332
      // 32e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 331: athrow
      // 332: sipush 200
      // 335: if_icmpge 36c
      // 338: aload 0
      // 339: dup
      // 33a: getfield mlk.sz3 I
      // 33d: bipush 20
      // 33f: iadd
      // 340: putfield mlk.sz3 I
      // 343: aload 0
      // 344: goto 34b
      // 347: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34a: athrow
      // 34b: getfield mlk.fle Lz96;
      // 34e: aload 6
      // 350: bipush 1
      // 351: invokevirtual z96.ejq (Lerg;Z)Lnvf;
      // 354: astore 10
      // 356: aload 10
      // 358: iload 4
      // 35a: ifne 369
      // 35d: ifnull 36c
      // 360: goto 367
      // 363: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 366: athrow
      // 367: aload 10
      // 369: invokevirtual nvf.mk5 ()V
      // 36c: return
   }

   @Override
   public void wp_(C0FPacketConfirmTransaction param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield mlk.fle Lz96;
      // 06: invokevirtual z96.b88 ()Ldug;
      // 09: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aload 0
      // 10: getfield mlk.axq Lpni;
      // 13: aload 0
      // 14: getfield mlk.fle Lz96;
      // 17: getfield z96.daw L_jc;
      // 1a: getfield _jc.h7l I
      // 1d: invokevirtual pni.ij8 (I)Ljava/lang/Object;
      // 20: checkcast java/lang/Short
      // 23: astore 3
      // 24: istore 2
      // 25: aload 3
      // 26: ifnull be
      // 29: aload 1
      // 2a: invokevirtual net/minecraft/network/play/client/C0FPacketConfirmTransaction.x7y ()S
      // 2d: aload 3
      // 2e: invokevirtual java/lang/Short.shortValue ()S
      // 31: iload 2
      // 32: ifeq 66
      // 35: goto 3c
      // 38: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: if_icmpne be
      // 3f: goto 46
      // 42: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: getfield mlk.fle Lz96;
      // 4a: getfield z96.daw L_jc;
      // 4d: getfield _jc.h7l I
      // 50: iload 2
      // 51: ifeq 7e
      // 54: goto 5b
      // 57: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 1
      // 5c: invokevirtual net/minecraft/network/play/client/C0FPacketConfirmTransaction.qec ()I
      // 5f: goto 66
      // 62: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: if_icmpne be
      // 69: aload 0
      // 6a: getfield mlk.fle Lz96;
      // 6d: getfield z96.daw L_jc;
      // 70: aload 0
      // 71: getfield mlk.fle Lz96;
      // 74: invokevirtual _jc.yyp (Lha9;)Z
      // 77: goto 7e
      // 7a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: iload 2
      // 7f: ifeq a5
      // 82: ifne be
      // 85: goto 8c
      // 88: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 0
      // 8d: getfield mlk.fle Lz96;
      // 90: iload 2
      // 91: ifeq b3
      // 94: goto 9b
      // 97: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9a: athrow
      // 9b: invokevirtual z96.myu ()Z
      // 9e: goto a5
      // a1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4: athrow
      // a5: ifne be
      // a8: aload 0
      // a9: getfield mlk.fle Lz96;
      // ac: goto b3
      // af: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b2: athrow
      // b3: getfield z96.daw L_jc;
      // b6: aload 0
      // b7: getfield mlk.fle Lz96;
      // ba: bipush 1
      // bb: invokevirtual _jc._fi (Lha9;Z)V
      // be: return
   }

   @Override
   public void qmt(C12PacketUpdateSign param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 47208335173931
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield mlk.fle Lz96;
      // 00e: invokevirtual z96.b88 ()Ldug;
      // 011: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 014: invokestatic OpaquePredicate.c ()I
      // 017: aload 0
      // 018: getfield mlk.fle Lz96;
      // 01b: invokevirtual z96.wli ()V
      // 01e: istore 4
      // 020: aload 0
      // 021: getfield mlk.jcx Lvr1;
      // 024: aload 0
      // 025: getfield mlk.fle Lz96;
      // 028: getfield z96.ohd I
      // 02b: invokevirtual vr1.hrw (I)Ldug;
      // 02e: astore 5
      // 030: aload 1
      // 031: invokevirtual net/minecraft/network/play/client/C12PacketUpdateSign.ybo ()Lmew;
      // 034: astore 6
      // 036: aload 5
      // 038: aload 6
      // 03a: iload 4
      // 03c: ifne 057
      // 03f: invokevirtual dug.xjm (Lmew;)Z
      // 042: ifeq 135
      // 045: goto 04c
      // 048: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 5
      // 04e: aload 6
      // 050: goto 057
      // 053: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: invokevirtual dug.getTileEntity (Lmew;)Lpyk;
      // 05a: astore 7
      // 05c: aload 7
      // 05e: iload 4
      // 060: ifne 077
      // 063: instanceof net/minecraft/tileentity/TileEntitySign
      // 066: ifne 075
      // 069: goto 070
      // 06c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: return
      // 071: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: aload 7
      // 077: checkcast net/minecraft/tileentity/TileEntitySign
      // 07a: astore 8
      // 07c: iload 4
      // 07e: ifne 0e7
      // 081: aload 8
      // 083: invokevirtual net/minecraft/tileentity/TileEntitySign.z41 ()Z
      // 086: ifeq 0a3
      // 089: goto 090
      // 08c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 8
      // 092: invokevirtual net/minecraft/tileentity/TileEntitySign.y37 ()Lha9;
      // 095: aload 0
      // 096: getfield mlk.fle Lz96;
      // 099: if_acmpeq 0e8
      // 09c: goto 0a3
      // 09f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield mlk.jcx Lvr1;
      // 0a7: new java/lang/StringBuilder
      // 0aa: dup
      // 0ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ae: sipush 4547
      // 0b1: ldc2_w 7621337809521360228
      // 0b4: lload 2
      // 0b5: lxor
      // 0b6: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: aload 0
      // 0c0: getfield mlk.fle Lz96;
      // 0c3: invokevirtual z96.noc ()Ljava/lang/String;
      // 0c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c9: sipush 5947
      // 0cc: ldc2_w 4769870635906644869
      // 0cf: lload 2
      // 0d0: lxor
      // 0d1: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: nop
      // 0d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0dd: invokevirtual vr1.y6f (Ljava/lang/String;)V
      // 0e0: goto 0e7
      // 0e3: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: return
      // 0e8: aload 1
      // 0e9: invokevirtual net/minecraft/network/play/client/C12PacketUpdateSign.sc7 ()[Lekw;
      // 0ec: astore 9
      // 0ee: bipush 0
      // 0ef: istore 10
      // 0f1: iload 10
      // 0f3: aload 9
      // 0f5: arraylength
      // 0f6: if_icmpge 129
      // 0f9: aload 8
      // 0fb: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 0fe: iload 10
      // 100: new tao
      // 103: dup
      // 104: aload 9
      // 106: iload 10
      // 108: aaload
      // 109: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 10e: invokestatic syo.fan (Ljava/lang/String;)Ljava/lang/String;
      // 111: invokespecial tao.<init> (Ljava/lang/String;)V
      // 114: aastore
      // 115: iinc 10 1
      // 118: iload 4
      // 11a: ifne 12e
      // 11d: iload 4
      // 11f: ifeq 0f1
      // 122: goto 129
      // 125: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: aload 8
      // 12b: invokevirtual net/minecraft/tileentity/TileEntitySign.r5t ()V
      // 12e: aload 5
      // 130: aload 6
      // 132: invokevirtual dug.nfo (Lmew;)V
      // 135: return
   }

   @Override
   public void qoc(C00PacketKeepAlive param1) {
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
      // 05: invokevirtual net/minecraft/network/play/client/C00PacketKeepAlive.u5c ()I
      // 08: iload 2
      // 09: ifne 2b
      // 0c: aload 0
      // 0d: getfield mlk.h61 I
      // 10: if_icmpne 40
      // 13: goto 1a
      // 16: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 0
      // 1b: invokespecial mlk.m5q ()J
      // 1e: aload 0
      // 1f: getfield mlk.xwb J
      // 22: lsub
      // 23: l2i
      // 24: goto 2b
      // 27: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: istore 3
      // 2c: aload 0
      // 2d: getfield mlk.fle Lz96;
      // 30: aload 0
      // 31: getfield mlk.fle Lz96;
      // 34: getfield z96.f3h I
      // 37: bipush 3
      // 38: imul
      // 39: iload 3
      // 3a: iadd
      // 3b: bipush 4
      // 3c: idiv
      // 3d: putfield z96.f3h I
      // 40: return
   }

   private long m5q() {
      return System.nanoTime() / 1000000L;
   }

   @Override
   public void kh5(C13PacketPlayerAbilities param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: aload 0
      // 07: getfield mlk.fle Lz96;
      // 0a: invokevirtual z96.b88 ()Ldug;
      // 0d: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 10: aload 0
      // 11: getfield mlk.fle Lz96;
      // 14: getfield z96.lls Lpj2;
      // 17: aload 1
      // 18: invokevirtual net/minecraft/network/play/client/C13PacketPlayerAbilities.xgg ()Z
      // 1b: iload 2
      // 1c: ifeq 3a
      // 1f: ifeq 4c
      // 22: goto 29
      // 25: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield mlk.fle Lz96;
      // 2d: getfield z96.lls Lpj2;
      // 30: getfield pj2.wvp Z
      // 33: goto 3a
      // 36: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: iload 2
      // 3b: ifeq 49
      // 3e: ifeq 4c
      // 41: goto 48
      // 44: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 4d
      // 4c: bipush 0
      // 4d: putfield pj2.wzx Z
      // 50: return
   }

   @Override
   public void w_f(C14PacketTabComplete var1) {
      et9.hqd(var1, this, this.fle.b88());
      int var10000 = OpaquePredicate.c();
      ArrayList var3 = Lists.newArrayList();
      int var2 = var10000;
      Iterator var4 = this.jcx.juc(this.fle, var1.t2y(), var1._fg()).iterator();

      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();

            try {
               var3.add(var5);
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (IllegalArgumentException var6) {
               throw a(var6);
            }
         }

         this.fle.rhh.vnf(new S3APacketTabComplete(var3.toArray(new String[var3.size()])));
         break;
      }
   }

   @Override
   public void myd(C15PacketClientSettings var1) {
      et9.hqd(var1, this, this.fle.b88());
      this.fle.jgh(var1);
   }

   @Override
   public void e0i(C17PacketCustomPayload param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlk.a J
      // 003: ldc2_w 15272823676778
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: aload 0
      // 00f: aload 0
      // 010: getfield mlk.fle Lz96;
      // 013: invokevirtual z96.b88 ()Ldug;
      // 016: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 019: sipush 5384
      // 01c: ldc2_w 7851122583942696924
      // 01f: lload 2
      // 020: lxor
      // 021: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: nop
      // 027: aload 1
      // 028: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.r_b ()Ljava/lang/String;
      // 02b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02e: iload 4
      // 030: ifne 175
      // 033: ifeq 160
      // 036: goto 03d
      // 039: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: new nfj
      // 040: dup
      // 041: aload 1
      // 042: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 045: invokestatic io/netty/buffer/Unpooled.wrappedBuffer (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
      // 048: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 04b: astore 5
      // 04d: aload 5
      // 04f: invokevirtual nfj.x4d ()Lerg;
      // 052: astore 6
      // 054: iload 4
      // 056: ifne 130
      // 059: aload 6
      // 05b: ifnull 12a
      // 05e: goto 065
      // 061: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 6
      // 067: iload 4
      // 069: ifne 0a7
      // 06c: goto 073
      // 06f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: invokevirtual erg.zso ()Lbdo;
      // 076: invokestatic i9t.uhi (Lbdo;)Z
      // 079: ifne 09d
      // 07c: goto 083
      // 07f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: new java/io/IOException
      // 086: dup
      // 087: sipush 12452
      // 08a: ldc2_w 4585404638392920665
      // 08d: lload 2
      // 08e: lxor
      // 08f: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: nop
      // 095: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 098: athrow
      // 099: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield mlk.fle Lz96;
      // 0a1: getfield z96.up_ Ljnq;
      // 0a4: invokevirtual jnq.dxs ()Lerg;
      // 0a7: astore 7
      // 0a9: aload 7
      // 0ab: iload 4
      // 0ad: ifne 0c3
      // 0b0: ifnonnull 0c1
      // 0b3: goto 0ba
      // 0b6: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 5
      // 0bc: invokevirtual nfj.release ()Z
      // 0bf: pop
      // 0c0: return
      // 0c1: aload 6
      // 0c3: invokevirtual erg.gn1 ()Lu7m;
      // 0c6: getstatic xbr.u0_ Lu7m;
      // 0c9: iload 4
      // 0cb: ifne 0f5
      // 0ce: if_acmpne 123
      // 0d1: goto 0d8
      // 0d4: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 6
      // 0da: iload 4
      // 0dc: ifne 0fa
      // 0df: goto 0e6
      // 0e2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: invokevirtual erg.gn1 ()Lu7m;
      // 0e9: aload 7
      // 0eb: invokevirtual erg.gn1 ()Lu7m;
      // 0ee: goto 0f5
      // 0f1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: if_acmpne 123
      // 0f8: aload 7
      // 0fa: sipush 28912
      // 0fd: ldc2_w 254401534044203528
      // 100: lload 2
      // 101: lxor
      // 102: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: nop
      // 108: aload 6
      // 10a: invokevirtual erg.zso ()Lbdo;
      // 10d: sipush 30016
      // 110: ldc2_w 3945730708651798423
      // 113: lload 2
      // 114: lxor
      // 115: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: bipush 8
      // 11d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 120: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 123: aload 5
      // 125: invokevirtual nfj.release ()Z
      // 128: pop
      // 129: return
      // 12a: aload 5
      // 12c: invokevirtual nfj.release ()Z
      // 12f: pop
      // 130: goto 15f
      // 133: astore 6
      // 135: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 138: sipush 31085
      // 13b: ldc2_w 1425779930694640522
      // 13e: lload 2
      // 13f: lxor
      // 140: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: nop
      // 146: aload 6
      // 148: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 14d: aload 5
      // 14f: invokevirtual nfj.release ()Z
      // 152: pop
      // 153: return
      // 154: astore 8
      // 156: aload 5
      // 158: invokevirtual nfj.release ()Z
      // 15b: pop
      // 15c: aload 8
      // 15e: athrow
      // 15f: return
      // 160: sipush 16001
      // 163: ldc2_w 8607252276061971569
      // 166: lload 2
      // 167: lxor
      // 168: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: aload 1
      // 16f: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.r_b ()Ljava/lang/String;
      // 172: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 175: iload 4
      // 177: ifne 31a
      // 17a: ifeq 305
      // 17d: goto 184
      // 180: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: new nfj
      // 187: dup
      // 188: aload 1
      // 189: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 18c: invokestatic io/netty/buffer/Unpooled.wrappedBuffer (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
      // 18f: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 192: astore 5
      // 194: aload 5
      // 196: invokevirtual nfj.x4d ()Lerg;
      // 199: astore 6
      // 19b: iload 4
      // 19d: ifne 2d5
      // 1a0: aload 6
      // 1a2: ifnull 2cf
      // 1a5: goto 1ac
      // 1a8: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: aload 6
      // 1ae: iload 4
      // 1b0: ifne 1ee
      // 1b3: goto 1ba
      // 1b6: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b9: athrow
      // 1ba: invokevirtual erg.zso ()Lbdo;
      // 1bd: invokestatic gy5.ruq (Lbdo;)Z
      // 1c0: ifne 1e4
      // 1c3: goto 1ca
      // 1c6: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: new java/io/IOException
      // 1cd: dup
      // 1ce: sipush 10858
      // 1d1: ldc2_w 883295569549013153
      // 1d4: lload 2
      // 1d5: lxor
      // 1d6: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: nop
      // 1dc: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 1df: athrow
      // 1e0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: getfield mlk.fle Lz96;
      // 1e8: getfield z96.up_ Ljnq;
      // 1eb: invokevirtual jnq.dxs ()Lerg;
      // 1ee: astore 7
      // 1f0: aload 7
      // 1f2: iload 4
      // 1f4: ifne 20a
      // 1f7: ifnonnull 208
      // 1fa: goto 201
      // 1fd: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 200: athrow
      // 201: aload 5
      // 203: invokevirtual nfj.release ()Z
      // 206: pop
      // 207: return
      // 208: aload 6
      // 20a: invokevirtual erg.gn1 ()Lu7m;
      // 20d: getstatic xbr._h5 Lu7m;
      // 210: iload 4
      // 212: ifne 23a
      // 215: if_acmpne 2c8
      // 218: goto 21f
      // 21b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: aload 7
      // 221: iload 4
      // 223: ifne 2c2
      // 226: goto 22d
      // 229: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: invokevirtual erg.gn1 ()Lu7m;
      // 230: getstatic xbr.u0_ Lu7m;
      // 233: goto 23a
      // 236: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 239: athrow
      // 23a: if_acmpne 2c8
      // 23d: aload 7
      // 23f: sipush 23366
      // 242: ldc2_w 6100855141024776576
      // 245: lload 2
      // 246: lxor
      // 247: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: nop
      // 24d: new bgg
      // 250: dup
      // 251: aload 0
      // 252: getfield mlk.fle Lz96;
      // 255: invokevirtual z96.noc ()Ljava/lang/String;
      // 258: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 25b: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 25e: aload 7
      // 260: sipush 32736
      // 263: ldc2_w 2054854590204011806
      // 266: lload 2
      // 267: lxor
      // 268: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: nop
      // 26e: new bgg
      // 271: dup
      // 272: aload 6
      // 274: invokevirtual erg.zso ()Lbdo;
      // 277: sipush 7553
      // 27a: ldc2_w 4578432632705025908
      // 27d: lload 2
      // 27e: lxor
      // 27f: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: nop
      // 285: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 288: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 28b: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 28e: aload 7
      // 290: sipush 30016
      // 293: ldc2_w 3945730708651798423
      // 296: lload 2
      // 297: lxor
      // 298: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: nop
      // 29e: aload 6
      // 2a0: invokevirtual erg.zso ()Lbdo;
      // 2a3: sipush 30016
      // 2a6: ldc2_w 3945730708651798423
      // 2a9: lload 2
      // 2aa: lxor
      // 2ab: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: nop
      // 2b1: bipush 8
      // 2b3: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 2b6: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 2b9: aload 7
      // 2bb: goto 2c2
      // 2be: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c1: athrow
      // 2c2: getstatic xbr._h5 Lu7m;
      // 2c5: invokevirtual erg.j8j (Lu7m;)V
      // 2c8: aload 5
      // 2ca: invokevirtual nfj.release ()Z
      // 2cd: pop
      // 2ce: return
      // 2cf: aload 5
      // 2d1: invokevirtual nfj.release ()Z
      // 2d4: pop
      // 2d5: goto 304
      // 2d8: astore 6
      // 2da: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 2dd: sipush 22656
      // 2e0: ldc2_w 7803462906222297714
      // 2e3: lload 2
      // 2e4: lxor
      // 2e5: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: nop
      // 2eb: aload 6
      // 2ed: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 2f2: aload 5
      // 2f4: invokevirtual nfj.release ()Z
      // 2f7: pop
      // 2f8: return
      // 2f9: astore 9
      // 2fb: aload 5
      // 2fd: invokevirtual nfj.release ()Z
      // 300: pop
      // 301: aload 9
      // 303: athrow
      // 304: return
      // 305: sipush 29352
      // 308: ldc2_w 3129190528731605104
      // 30b: lload 2
      // 30c: lxor
      // 30d: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 312: nop
      // 313: aload 1
      // 314: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.r_b ()Ljava/lang/String;
      // 317: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 31a: iload 4
      // 31c: ifne 39e
      // 31f: ifeq 382
      // 322: goto 329
      // 325: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 328: athrow
      // 329: aload 1
      // 32a: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 32d: invokevirtual nfj.readInt ()I
      // 330: istore 5
      // 332: aload 0
      // 333: getfield mlk.fle Lz96;
      // 336: getfield z96.daw L_jc;
      // 339: astore 6
      // 33b: aload 6
      // 33d: iload 4
      // 33f: ifne 358
      // 342: instanceof y43
      // 345: ifeq 360
      // 348: goto 34f
      // 34b: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34e: athrow
      // 34f: aload 6
      // 351: goto 358
      // 354: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 357: athrow
      // 358: checkcast y43
      // 35b: iload 5
      // 35d: invokevirtual y43._aw (I)V
      // 360: goto 767
      // 363: astore 5
      // 365: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 368: sipush 13520
      // 36b: ldc2_w 4791236648550575644
      // 36e: lload 2
      // 36f: lxor
      // 370: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 375: nop
      // 376: aload 5
      // 378: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 37d: iload 4
      // 37f: ifeq 767
      // 382: sipush 8870
      // 385: ldc2_w 4780787711376537719
      // 388: lload 2
      // 389: lxor
      // 38a: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: nop
      // 390: aload 1
      // 391: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.r_b ()Ljava/lang/String;
      // 394: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 397: goto 39e
      // 39a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39d: athrow
      // 39e: iload 4
      // 3a0: ifne 5e6
      // 3a3: ifeq 5ca
      // 3a6: goto 3ad
      // 3a9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ac: athrow
      // 3ad: aload 0
      // 3ae: getfield mlk.jcx Lvr1;
      // 3b1: invokevirtual vr1.gd2 ()Z
      // 3b4: iload 4
      // 3b6: ifne 414
      // 3b9: goto 3c0
      // 3bc: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bf: athrow
      // 3c0: ifne 3f6
      // 3c3: goto 3ca
      // 3c6: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c9: athrow
      // 3ca: aload 0
      // 3cb: getfield mlk.fle Lz96;
      // 3ce: new hsu
      // 3d1: dup
      // 3d2: sipush 30467
      // 3d5: ldc2_w 3500463098621423078
      // 3d8: lload 2
      // 3d9: lxor
      // 3da: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: nop
      // 3e0: bipush 0
      // 3e1: anewarray 22
      // 3e4: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 3e7: invokevirtual z96.a0d (Lekw;)V
      // 3ea: iload 4
      // 3ec: ifeq 767
      // 3ef: goto 3f6
      // 3f2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f5: athrow
      // 3f6: aload 0
      // 3f7: getfield mlk.fle Lz96;
      // 3fa: iload 4
      // 3fc: ifne 5a9
      // 3ff: goto 406
      // 402: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 405: athrow
      // 406: bipush 2
      // 407: ldc ""
      // 409: nop
      // 40a: invokevirtual z96.ge4 (ILjava/lang/String;)Z
      // 40d: goto 414
      // 410: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 413: athrow
      // 414: ifeq 59e
      // 417: aload 0
      // 418: getfield mlk.fle Lz96;
      // 41b: iload 4
      // 41d: ifne 5a9
      // 420: goto 427
      // 423: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 426: athrow
      // 427: getfield z96.lls Lpj2;
      // 42a: getfield pj2.g40 Z
      // 42d: ifeq 59e
      // 430: goto 437
      // 433: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 436: athrow
      // 437: aload 1
      // 438: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 43b: astore 5
      // 43d: aload 5
      // 43f: invokevirtual nfj.readByte ()B
      // 442: istore 6
      // 444: aconst_null
      // 445: astore 7
      // 447: iload 6
      // 449: iload 4
      // 44b: ifne 4a4
      // 44e: ifne 4a2
      // 451: goto 458
      // 454: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 457: athrow
      // 458: aload 0
      // 459: getfield mlk.fle Lz96;
      // 45c: getfield z96.oay Lt9d;
      // 45f: new mew
      // 462: dup
      // 463: aload 5
      // 465: invokevirtual nfj.readInt ()I
      // 468: aload 5
      // 46a: invokevirtual nfj.readInt ()I
      // 46d: aload 5
      // 46f: invokevirtual nfj.readInt ()I
      // 472: invokespecial mew.<init> (III)V
      // 475: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 478: astore 8
      // 47a: aload 8
      // 47c: iload 4
      // 47e: ifne 497
      // 481: instanceof net/minecraft/tileentity/TileEntityCommandBlock
      // 484: ifeq 49f
      // 487: goto 48e
      // 48a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48d: athrow
      // 48e: aload 8
      // 490: goto 497
      // 493: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 496: athrow
      // 497: checkcast net/minecraft/tileentity/TileEntityCommandBlock
      // 49a: invokevirtual net/minecraft/tileentity/TileEntityCommandBlock.n_g ()Lk6s;
      // 49d: astore 7
      // 49f: goto 4de
      // 4a2: iload 6
      // 4a4: bipush 1
      // 4a5: if_icmpne 4de
      // 4a8: aload 0
      // 4a9: getfield mlk.fle Lz96;
      // 4ac: getfield z96.oay Lt9d;
      // 4af: aload 5
      // 4b1: invokevirtual nfj.readInt ()I
      // 4b4: invokevirtual OpaquePredicate.oks (I)Li2h;
      // 4b7: astore 8
      // 4b9: aload 8
      // 4bb: iload 4
      // 4bd: ifne 4d6
      // 4c0: instanceof q2b
      // 4c3: ifeq 4de
      // 4c6: goto 4cd
      // 4c9: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cc: athrow
      // 4cd: aload 8
      // 4cf: goto 4d6
      // 4d2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d5: athrow
      // 4d6: checkcast q2b
      // 4d9: invokevirtual q2b.rxe ()Lk6s;
      // 4dc: astore 7
      // 4de: aload 5
      // 4e0: aload 5
      // 4e2: invokevirtual nfj.readableBytes ()I
      // 4e5: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 4e8: astore 8
      // 4ea: aload 5
      // 4ec: invokevirtual nfj.readBoolean ()Z
      // 4ef: istore 9
      // 4f1: iload 4
      // 4f3: ifne 568
      // 4f6: aload 7
      // 4f8: ifnull 562
      // 4fb: goto 502
      // 4fe: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 501: athrow
      // 502: aload 7
      // 504: aload 8
      // 506: invokevirtual k6s.collectTargets (Ljava/lang/String;)V
      // 509: aload 7
      // 50b: iload 9
      // 50d: invokevirtual k6s.mhc (Z)V
      // 510: iload 4
      // 512: ifne 53d
      // 515: goto 51c
      // 518: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51b: athrow
      // 51c: iload 9
      // 51e: ifne 538
      // 521: goto 528
      // 524: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 527: athrow
      // 528: aload 7
      // 52a: aconst_null
      // 52b: checkcast ekw
      // 52e: invokevirtual k6s.wyo (Lekw;)V
      // 531: goto 538
      // 534: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 537: athrow
      // 538: aload 7
      // 53a: invokevirtual k6s.r73 ()V
      // 53d: aload 0
      // 53e: getfield mlk.fle Lz96;
      // 541: new hsu
      // 544: dup
      // 545: sipush 18251
      // 548: ldc2_w 6443674389287984520
      // 54b: lload 2
      // 54c: lxor
      // 54d: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 552: nop
      // 553: bipush 1
      // 554: anewarray 22
      // 557: dup
      // 558: bipush 0
      // 559: aload 8
      // 55b: aastore
      // 55c: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 55f: invokevirtual z96.a0d (Lekw;)V
      // 562: aload 5
      // 564: invokevirtual nfj.release ()Z
      // 567: pop
      // 568: goto 599
      // 56b: astore 6
      // 56d: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 570: sipush 21033
      // 573: ldc2_w 2359656748399446209
      // 576: lload 2
      // 577: lxor
      // 578: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57d: nop
      // 57e: aload 6
      // 580: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 585: aload 5
      // 587: invokevirtual nfj.release ()Z
      // 58a: pop
      // 58b: goto 599
      // 58e: astore 10
      // 590: aload 5
      // 592: invokevirtual nfj.release ()Z
      // 595: pop
      // 596: aload 10
      // 598: athrow
      // 599: iload 4
      // 59b: ifeq 767
      // 59e: aload 0
      // 59f: getfield mlk.fle Lz96;
      // 5a2: goto 5a9
      // 5a5: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a8: athrow
      // 5a9: new hsu
      // 5ac: dup
      // 5ad: sipush 4189
      // 5b0: ldc2_w 7102366252649908889
      // 5b3: lload 2
      // 5b4: lxor
      // 5b5: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ba: nop
      // 5bb: bipush 0
      // 5bc: anewarray 22
      // 5bf: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 5c2: invokevirtual z96.a0d (Lekw;)V
      // 5c5: iload 4
      // 5c7: ifeq 767
      // 5ca: sipush 3990
      // 5cd: ldc2_w 1609484743825855853
      // 5d0: lload 2
      // 5d1: lxor
      // 5d2: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d7: nop
      // 5d8: aload 1
      // 5d9: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.r_b ()Ljava/lang/String;
      // 5dc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5df: goto 5e6
      // 5e2: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e5: athrow
      // 5e6: iload 4
      // 5e8: ifne 6b2
      // 5eb: ifeq 696
      // 5ee: goto 5f5
      // 5f1: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f4: athrow
      // 5f5: aload 0
      // 5f6: getfield mlk.fle Lz96;
      // 5f9: getfield z96.daw L_jc;
      // 5fc: instanceof je4
      // 5ff: ifeq 767
      // 602: goto 609
      // 605: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 608: athrow
      // 609: aload 1
      // 60a: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 60d: astore 5
      // 60f: aload 5
      // 611: invokevirtual nfj.readInt ()I
      // 614: istore 6
      // 616: aload 5
      // 618: invokevirtual nfj.readInt ()I
      // 61b: istore 7
      // 61d: aload 0
      // 61e: getfield mlk.fle Lz96;
      // 621: getfield z96.daw L_jc;
      // 624: checkcast je4
      // 627: astore 8
      // 629: aload 8
      // 62b: bipush 0
      // 62c: invokevirtual je4.ajr (I)Lvrx;
      // 62f: astore 9
      // 631: aload 9
      // 633: iload 4
      // 635: ifne 64e
      // 638: invokevirtual vrx.hf8 ()Z
      // 63b: ifeq 675
      // 63e: goto 645
      // 641: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 644: athrow
      // 645: aload 9
      // 647: goto 64e
      // 64a: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64d: athrow
      // 64e: bipush 1
      // 64f: invokevirtual vrx.xtx (I)Lerg;
      // 652: pop
      // 653: aload 8
      // 655: invokevirtual je4.gip ()Lrsi;
      // 658: astore 10
      // 65a: aload 10
      // 65c: bipush 1
      // 65d: iload 6
      // 65f: invokeinterface rsi.r8i (II)V 3
      // 664: aload 10
      // 666: bipush 2
      // 667: iload 7
      // 669: invokeinterface rsi.r8i (II)V 3
      // 66e: aload 10
      // 670: invokeinterface rsi.r5t ()V 1
      // 675: goto 767
      // 678: astore 5
      // 67a: getstatic mlk.f_4 Lorg/apache/logging/log4j/Logger;
      // 67d: bipush 126
      // 67f: ldc2_w 5589966149704915641
      // 682: lload 2
      // 683: lxor
      // 684: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 689: nop
      // 68a: aload 5
      // 68c: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 691: iload 4
      // 693: ifeq 767
      // 696: sipush 6731
      // 699: ldc2_w 5044298020714152098
      // 69c: lload 2
      // 69d: lxor
      // 69e: invokedynamic r (IJ)Ljava/lang/String; bsm=mlk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a3: nop
      // 6a4: aload 1
      // 6a5: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.r_b ()Ljava/lang/String;
      // 6a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6ab: goto 6b2
      // 6ae: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b1: athrow
      // 6b2: iload 4
      // 6b4: ifne 6de
      // 6b7: ifeq 767
      // 6ba: goto 6c1
      // 6bd: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c0: athrow
      // 6c1: aload 0
      // 6c2: getfield mlk.fle Lz96;
      // 6c5: getfield z96.daw L_jc;
      // 6c8: iload 4
      // 6ca: ifne 6ef
      // 6cd: goto 6d4
      // 6d0: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d3: athrow
      // 6d4: instanceof y1i
      // 6d7: goto 6de
      // 6da: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6dd: athrow
      // 6de: ifeq 767
      // 6e1: aload 0
      // 6e2: getfield mlk.fle Lz96;
      // 6e5: getfield z96.daw L_jc;
      // 6e8: goto 6ef
      // 6eb: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6ee: athrow
      // 6ef: checkcast y1i
      // 6f2: astore 5
      // 6f4: aload 1
      // 6f5: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 6f8: iload 4
      // 6fa: ifne 712
      // 6fd: ifnull 758
      // 700: goto 707
      // 703: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 706: athrow
      // 707: aload 1
      // 708: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 70b: goto 712
      // 70e: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 711: athrow
      // 712: iload 4
      // 714: ifne 730
      // 717: invokevirtual nfj.readableBytes ()I
      // 71a: bipush 1
      // 71b: if_icmplt 758
      // 71e: goto 725
      // 721: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 724: athrow
      // 725: aload 1
      // 726: invokevirtual net/minecraft/network/play/client/C17PacketCustomPayload.del ()Lnfj;
      // 729: goto 730
      // 72c: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72f: athrow
      // 730: sipush 32767
      // 733: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 736: invokestatic _xi._dn (Ljava/lang/String;)Ljava/lang/String;
      // 739: astore 6
      // 73b: aload 6
      // 73d: invokevirtual java/lang/String.length ()I
      // 740: bipush 30
      // 742: if_icmpgt 753
      // 745: aload 5
      // 747: aload 6
      // 749: invokevirtual y1i.gj2 (Ljava/lang/String;)V
      // 74c: goto 753
      // 74f: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 752: athrow
      // 753: iload 4
      // 755: ifeq 767
      // 758: aload 5
      // 75a: ldc ""
      // 75c: nop
      // 75d: invokevirtual y1i.gj2 (Ljava/lang/String;)V
      // 760: goto 767
      // 763: invokestatic mlk.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 766: athrow
      // 767: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1074327678061947430L, 145406199510627698L, MethodHandles.lookup().lookupClass()).a(240731204093829L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 38589662423445L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[57];
      int var7 = 0;
      String var6 = "Àm´4çm\u0000=)Þµ¢Ô\u0096]É`8ìË}\u009c\u009döO\u0001e&K0\u0007RÃT\u0012 O·ä÷(ª\u0010¬Áß¬©\u00adÚÚ\u0019×ÐS¬§¦·Zi`Ç±á2_è`y\u0014ÀÃÈöÐ\u0005¿\u0019\u0093\u0093\u0018¬\u0003ç\rö1/À\n·U¸ß¡\u007fi\u0016\u0010d\u0099\u0005\u0086[\u0091\u0018\u008aGÆÓ@4©0ðhºPÒÉh^!\u0086\u001b®å\u0080â\u0011@£\u0086}m¾¹wÆÌ%¬^\u0013qD\u0084é·ÆMÈ\u0097\u0013Ü\u0083Ï|WC\u0016.\u0000\"*«\u0012ï\u0019\u008e\u000eµ-\u000b\u009f\"Â8vî\u0083bjC0\u0016`#lÃÇ\u0005HÎ`(8VT\u00958Æz\u001a\u009fë\u009cÌ;\u0099f\u008bÅ\u0088¯]oòxíHáq·ý\u0088`¶cñ\u0013\u00ad\u001ev\nÁ\u0010°ý\u0084;ÚÍó6ºR\u0004\u009d\u001fÑ&®0]À9ø\u0097.<Æ\u0084Î}\u0082²ý(\u0094Þr\u001bÚÄwëÐs¾\u0010ç3*\u0014\u0086<ß]Öà¹JHs\\\u0098\\\u0019_hë0µµ×\u008f@ù¤U8ª\t\u001cRü\u00877\"\u0096\u001f\u0005F,ï40ö&É\u0011â²Ô\u009fô¶\"¸G^·\u009b\u0095\r\u0096\u007fýÙ\u0082 \"EÿâöÖ\u0002Â-¾_¯zû\\\u0016Wì-.¡õÎ¢\u0000©8ÂN\u0003\f+@7í\u009cß\u0085bA\u009c\u001d.üÞ<©\u0001GM\u0096\u0096\u0004l\r2\u0015ÐZéD:å×\u008b\u0086c\u001f.ô´³þµ¹Ü2$1¨~©\u0010M\u008aa@[gá\u0084ÀQd\u0014ÜÜ@å¤=æ\u008bÒ\u000ba\u0004W\rèAyFö\u0019\u0086[ú\u009eÝ\r\u000ej\u0000\u009fF²\u0018wÃT\u0093¿½WQÒ¼ºÔHãÿ\u0019¤¸f\u008a¶\u0010l*T¡ùÍ\u0010\u009cD\u0002/º\u0010£\u009c7\u0017á\u0010±c)×«l5:VKHþ±4\u0087ò\u00103ÂI\u0092kÄ#áµr>ë}À\u000f\t\u0004f#Y4ëüÊû\u008f\túÙB\u001fù6z÷ó\u00ad£8\u0099Ï\u000b\u0098ß\u001b$³<ôd\tv^|íÞ|JÇ\u0085ñrs<I\u008c Ë\u001cñÈ.¼j¾M\tØÄ\u000fK«s.L!»Èm\u0019~\u0092\u008fãÃÄ\u0000Ûµ(£èÏH^\r?\u000e¦\u0012\u0018³Ó¨M\u0001Í\u0003\u008c¶\u0081Õ\u001f!\nV~\u0015\u009c³zØ\"|êi··Û` \u0018¨¯\u0019%±kÌ\u0099Ê4ªXrÐ~ë\u0081Â-íY\u009b\u001f\u009c]Ù`¶_.ÿHÿ»û+×\u0001UÈF\u001a\u0006cÊ«\u001b÷[þ\u0004õf:\u008bÊ¡ü\u008c×ú×I¸\u0087¶»\u001dY\u0091\u001fô1ì·£\u009eª\f©ùl\t}\u009a+u@Y0\u0099e+&oÐ¥ê¥VY7fÊ ù\u0093|ø\u001d\u000b\u001a3E\u0000\u0081\u008d@Vq\u0015¡¼û%ïäè\u007fUg¬>\u0094tÉ°(p¾gÐµ\u0004[â\u0002\u000eçzC¡1dÝo-\u0017Þÿ\u009d úWäI^\u0002ìä\u0083M>0\u0085\u008a\u0011Z\u0018\u0094}c|ù*¯êwðï÷Öi\\ìè\u0096ßXÜSh'\u0010ãÁ6\u009a\u0012ºù:°\u0004\"ÜÀOËt0U3É\u0087*\u0089|øærtÁ\u0094;¹uÌ\u0098ÒàÚµ3¿°¶Z3Ñíõí;\u0095?3À\u000ewç¶!UÄ¯Ý1$\u0010É9=p\t \u0097\u001a.P\u0018Pè©\\î\u0010\u0089\u008cDúq³;$}IoõÀú\u008b\u0093(4cÈÚ,h\u0005\u008dDü:TUæ\u0099z\u0010ÙãN\u008a]\u000fÊ\u0014¤\u0006]DbúçZCZü¦¾\u0013û(õÇQv3\u009bì{ËL\u001d\u0085ÿ°{:\u001cZÞb\u0003'}ëý\u0015£ø=ß\u0002RFÚÖÏHÍÈ\u008e\u0018¢[\u0098Ñ2Pß0q~\u0002\u000e\u000f7\u008cþ¬Qh\u0000<6¢P@zë<»¯x2NÝ\r¶¼\u0097\u0017\u0095¯]Ë\u0081©\u009dÜÙC\u0082©b\u0001âP¾ä\u0013o\u0014¨Ðòq½÷ÎÖjÀ\u0002Ö¥`]lÎ\u0010 OPW\u0001ïÆE\u0007B( H{AÉ\u008fhI\u0012\u0001\u0001À\u0012fv×ÄIØGç@ÄõÏé§~\u0098û\u0086ï{\u0010P½:\u001a\u000b\u001a\u0090\u0016B(¾\\¼\u0083û§@y\u009b\u0002&a¯\u008f> EëæÊfxÞL§2ÐDuóR\u001cðj^µl6²¯çÖ;ÕJ\u001cd<ÒËAØ\u0088Ù¿Øv<bs\u0015\u0091¤\u0080\u0010Jã¤\u0003\u008d¸P\u001e§Ó\u000f\u00adÞà\u0005ê×+(0%´ßÃ{Ðg\u0003\u0001h-S\u001f¯]¢B úÑÙ»ô<\u0088\u0000\u001d\u0085¼0k1c\u0014\u00adàÂ\tXú·G\n\u0017«Ó\fº\u008ei\u0006Ö&\u00030\u008b Íc\u0007\u008aÐÿ íE\u001c8Ð\u0096±fØ\u008b¸«Ã\u001aÑîÓá\t\nü\u009bH6T\u001a´£àãv÷Ò4\u008aÂ\u0083.\u0091Ä_÷\u0082#áð`v\u009eÎ\u0013<\u0094ºªRê\u0013\u0019Ý@ ÜFý\u0095O<RD\u0097ÞSCÿ\u0015ø]]\u001cP\u0095p6njí\u008b\u0003téùµ\u008d\u0004\u008a\u008a\u001dq\u008aÚÎ\u009ek\u009aâ\u000btÒºM\u001d]AÀ\u0097µ\u0011p\u0080N\u001d\u0005àë0MNù\u0019É=\u009d K\u009emÝz\nÇG\u0011b¤\u001e\u0004Ä´zGÖ\u0081FFo\u0089\t8N\u00adþ\u0006\u0003\u000055Àà\u0088îr\"0(WÒß³Ýtàé\u0019q9\\\u008eYìp¨·\u007fÞâï¨³\u0004áêÉë\u009fh\u008d\tÜT«\u0001\u008fR² ·\u0006òïêe]s\u001dKX(µ¤(wù\u009bF\u000eÉ^9(8..H¶4\u009dû\u0010\u0093ÃTÿÅÛ\u0002\u0019àÌ¢4°\u009cþ\r(Sà½\u0017hÆîTîrE!VG×\u0001JºÞ¹_ÅâÁ\n÷.i\u001aÙ]\u0084\u0092\u0093\"[ðr¢Ð(¸¬\u0007°®Ûý£®£ÃEÿ\tä\fhTÀ8\u0017»\u0085wG\u0087ÓZ\u008cÊÓV3\u0017-\u0092\u000fÞÚë\u0010\u0019×åüÅj\u0084==%\u001fºJ\u008e\u0017;\u0018DYÄx¸,\u0004Më\u0091Z²u\u0002©<ãï/\u0086w-&É(Ëâ\u0093rÔ\u001c!\u0019æô¿\u0080\bÝ\u0003Xg¥È\u0014¶À\u0016îTK;\u001bo\u0007\u001a\u0010\u008a\u0081¸¦\u0092\u0096§\u0006(R\u0093Ü\\\u0000¸g¢\u0012/«Ü:øuÌ|»Å2qþÕMKðYösÿ\u0093æ!\u008f]JD³\u008b@ ë)2\u0097á}°+9)`;ëóàÑ\u008f»Ã_fÆ'<\u0012ë~JR\"ò\u008c Ó\u009dÛïó}+z\b´\u00158çq\u0081Ü\u009c«®ÏÝa/\u0080ä{\u001f\u0097ð¸C-@\u0013\u0004oóIqü'\bð\u008da\u000e\u0016B\"\u0080\u0094i\u0080?^òþÍc¬h+Xz\u008e,\u008cs|êb7\u008c\u0006~¨S\u000e¡\u0006^\u0095Ü`Qïa0\u009e\u0096ÒµhØm\u0099\u0003(ÀF/\u000fÂè`\u0010\fÐ¶]¡ÊN¸_\u0089ïÅ&ÌUâ§â\u0088\u0097¡\u001cÖó\u0085±Ôji\u0097@\u00ad VS¡·µ{\u00adJâ\u0080\u001do\u0085\u0011©W¾\u0099\u0011Ï©ó\u000ezs$,Lw\u0010èÆ G\u0015ã\ràV\u009fÙC\u0013²ýÞq@D¦/Î+÷¸Þ\u0082\u0098\r¯\u008f\u001eÎéÊ -½OF\u0087hÜ\u00ad\u008b@ÿ\u0082\u00ad\u0083\u0007*£×ÆÆ`\u0005òèûÓl\u0013õ÷\u0019\u0011\u0018\u0094÷!ñ¨¯®ÐY\u0095\u0005\u0088\u0018·Ö÷æ\u001c?IR>\u0099\u009e\u0018\u0005Æÿ\u000bqbú¨Ï\u000b[uíù¸¶\u0085\u009fÇì¯¦\u0089·@D?ï\u008a\u0085= ª§8\u0016\u0015¾aîp¹>.ÒBRä{\u009f\u0082\u0090åF0Þ\u0082ÌÃ,¿th\u009f\u001c\u0093O{¹õ·\u001fÅ\u008e\u007f\tó\u0093Ý\u008b\u0003æµ\u0013NÓÆO«";
      int var8 = "Àm´4çm\u0000=)Þµ¢Ô\u0096]É`8ìË}\u009c\u009döO\u0001e&K0\u0007RÃT\u0012 O·ä÷(ª\u0010¬Áß¬©\u00adÚÚ\u0019×ÐS¬§¦·Zi`Ç±á2_è`y\u0014ÀÃÈöÐ\u0005¿\u0019\u0093\u0093\u0018¬\u0003ç\rö1/À\n·U¸ß¡\u007fi\u0016\u0010d\u0099\u0005\u0086[\u0091\u0018\u008aGÆÓ@4©0ðhºPÒÉh^!\u0086\u001b®å\u0080â\u0011@£\u0086}m¾¹wÆÌ%¬^\u0013qD\u0084é·ÆMÈ\u0097\u0013Ü\u0083Ï|WC\u0016.\u0000\"*«\u0012ï\u0019\u008e\u000eµ-\u000b\u009f\"Â8vî\u0083bjC0\u0016`#lÃÇ\u0005HÎ`(8VT\u00958Æz\u001a\u009fë\u009cÌ;\u0099f\u008bÅ\u0088¯]oòxíHáq·ý\u0088`¶cñ\u0013\u00ad\u001ev\nÁ\u0010°ý\u0084;ÚÍó6ºR\u0004\u009d\u001fÑ&®0]À9ø\u0097.<Æ\u0084Î}\u0082²ý(\u0094Þr\u001bÚÄwëÐs¾\u0010ç3*\u0014\u0086<ß]Öà¹JHs\\\u0098\\\u0019_hë0µµ×\u008f@ù¤U8ª\t\u001cRü\u00877\"\u0096\u001f\u0005F,ï40ö&É\u0011â²Ô\u009fô¶\"¸G^·\u009b\u0095\r\u0096\u007fýÙ\u0082 \"EÿâöÖ\u0002Â-¾_¯zû\\\u0016Wì-.¡õÎ¢\u0000©8ÂN\u0003\f+@7í\u009cß\u0085bA\u009c\u001d.üÞ<©\u0001GM\u0096\u0096\u0004l\r2\u0015ÐZéD:å×\u008b\u0086c\u001f.ô´³þµ¹Ü2$1¨~©\u0010M\u008aa@[gá\u0084ÀQd\u0014ÜÜ@å¤=æ\u008bÒ\u000ba\u0004W\rèAyFö\u0019\u0086[ú\u009eÝ\r\u000ej\u0000\u009fF²\u0018wÃT\u0093¿½WQÒ¼ºÔHãÿ\u0019¤¸f\u008a¶\u0010l*T¡ùÍ\u0010\u009cD\u0002/º\u0010£\u009c7\u0017á\u0010±c)×«l5:VKHþ±4\u0087ò\u00103ÂI\u0092kÄ#áµr>ë}À\u000f\t\u0004f#Y4ëüÊû\u008f\túÙB\u001fù6z÷ó\u00ad£8\u0099Ï\u000b\u0098ß\u001b$³<ôd\tv^|íÞ|JÇ\u0085ñrs<I\u008c Ë\u001cñÈ.¼j¾M\tØÄ\u000fK«s.L!»Èm\u0019~\u0092\u008fãÃÄ\u0000Ûµ(£èÏH^\r?\u000e¦\u0012\u0018³Ó¨M\u0001Í\u0003\u008c¶\u0081Õ\u001f!\nV~\u0015\u009c³zØ\"|êi··Û` \u0018¨¯\u0019%±kÌ\u0099Ê4ªXrÐ~ë\u0081Â-íY\u009b\u001f\u009c]Ù`¶_.ÿHÿ»û+×\u0001UÈF\u001a\u0006cÊ«\u001b÷[þ\u0004õf:\u008bÊ¡ü\u008c×ú×I¸\u0087¶»\u001dY\u0091\u001fô1ì·£\u009eª\f©ùl\t}\u009a+u@Y0\u0099e+&oÐ¥ê¥VY7fÊ ù\u0093|ø\u001d\u000b\u001a3E\u0000\u0081\u008d@Vq\u0015¡¼û%ïäè\u007fUg¬>\u0094tÉ°(p¾gÐµ\u0004[â\u0002\u000eçzC¡1dÝo-\u0017Þÿ\u009d úWäI^\u0002ìä\u0083M>0\u0085\u008a\u0011Z\u0018\u0094}c|ù*¯êwðï÷Öi\\ìè\u0096ßXÜSh'\u0010ãÁ6\u009a\u0012ºù:°\u0004\"ÜÀOËt0U3É\u0087*\u0089|øærtÁ\u0094;¹uÌ\u0098ÒàÚµ3¿°¶Z3Ñíõí;\u0095?3À\u000ewç¶!UÄ¯Ý1$\u0010É9=p\t \u0097\u001a.P\u0018Pè©\\î\u0010\u0089\u008cDúq³;$}IoõÀú\u008b\u0093(4cÈÚ,h\u0005\u008dDü:TUæ\u0099z\u0010ÙãN\u008a]\u000fÊ\u0014¤\u0006]DbúçZCZü¦¾\u0013û(õÇQv3\u009bì{ËL\u001d\u0085ÿ°{:\u001cZÞb\u0003'}ëý\u0015£ø=ß\u0002RFÚÖÏHÍÈ\u008e\u0018¢[\u0098Ñ2Pß0q~\u0002\u000e\u000f7\u008cþ¬Qh\u0000<6¢P@zë<»¯x2NÝ\r¶¼\u0097\u0017\u0095¯]Ë\u0081©\u009dÜÙC\u0082©b\u0001âP¾ä\u0013o\u0014¨Ðòq½÷ÎÖjÀ\u0002Ö¥`]lÎ\u0010 OPW\u0001ïÆE\u0007B( H{AÉ\u008fhI\u0012\u0001\u0001À\u0012fv×ÄIØGç@ÄõÏé§~\u0098û\u0086ï{\u0010P½:\u001a\u000b\u001a\u0090\u0016B(¾\\¼\u0083û§@y\u009b\u0002&a¯\u008f> EëæÊfxÞL§2ÐDuóR\u001cðj^µl6²¯çÖ;ÕJ\u001cd<ÒËAØ\u0088Ù¿Øv<bs\u0015\u0091¤\u0080\u0010Jã¤\u0003\u008d¸P\u001e§Ó\u000f\u00adÞà\u0005ê×+(0%´ßÃ{Ðg\u0003\u0001h-S\u001f¯]¢B úÑÙ»ô<\u0088\u0000\u001d\u0085¼0k1c\u0014\u00adàÂ\tXú·G\n\u0017«Ó\fº\u008ei\u0006Ö&\u00030\u008b Íc\u0007\u008aÐÿ íE\u001c8Ð\u0096±fØ\u008b¸«Ã\u001aÑîÓá\t\nü\u009bH6T\u001a´£àãv÷Ò4\u008aÂ\u0083.\u0091Ä_÷\u0082#áð`v\u009eÎ\u0013<\u0094ºªRê\u0013\u0019Ý@ ÜFý\u0095O<RD\u0097ÞSCÿ\u0015ø]]\u001cP\u0095p6njí\u008b\u0003téùµ\u008d\u0004\u008a\u008a\u001dq\u008aÚÎ\u009ek\u009aâ\u000btÒºM\u001d]AÀ\u0097µ\u0011p\u0080N\u001d\u0005àë0MNù\u0019É=\u009d K\u009emÝz\nÇG\u0011b¤\u001e\u0004Ä´zGÖ\u0081FFo\u0089\t8N\u00adþ\u0006\u0003\u000055Àà\u0088îr\"0(WÒß³Ýtàé\u0019q9\\\u008eYìp¨·\u007fÞâï¨³\u0004áêÉë\u009fh\u008d\tÜT«\u0001\u008fR² ·\u0006òïêe]s\u001dKX(µ¤(wù\u009bF\u000eÉ^9(8..H¶4\u009dû\u0010\u0093ÃTÿÅÛ\u0002\u0019àÌ¢4°\u009cþ\r(Sà½\u0017hÆîTîrE!VG×\u0001JºÞ¹_ÅâÁ\n÷.i\u001aÙ]\u0084\u0092\u0093\"[ðr¢Ð(¸¬\u0007°®Ûý£®£ÃEÿ\tä\fhTÀ8\u0017»\u0085wG\u0087ÓZ\u008cÊÓV3\u0017-\u0092\u000fÞÚë\u0010\u0019×åüÅj\u0084==%\u001fºJ\u008e\u0017;\u0018DYÄx¸,\u0004Më\u0091Z²u\u0002©<ãï/\u0086w-&É(Ëâ\u0093rÔ\u001c!\u0019æô¿\u0080\bÝ\u0003Xg¥È\u0014¶À\u0016îTK;\u001bo\u0007\u001a\u0010\u008a\u0081¸¦\u0092\u0096§\u0006(R\u0093Ü\\\u0000¸g¢\u0012/«Ü:øuÌ|»Å2qþÕMKðYösÿ\u0093æ!\u008f]JD³\u008b@ ë)2\u0097á}°+9)`;ëóàÑ\u008f»Ã_fÆ'<\u0012ë~JR\"ò\u008c Ó\u009dÛïó}+z\b´\u00158çq\u0081Ü\u009c«®ÏÝa/\u0080ä{\u001f\u0097ð¸C-@\u0013\u0004oóIqü'\bð\u008da\u000e\u0016B\"\u0080\u0094i\u0080?^òþÍc¬h+Xz\u008e,\u008cs|êb7\u008c\u0006~¨S\u000e¡\u0006^\u0095Ü`Qïa0\u009e\u0096ÒµhØm\u0099\u0003(ÀF/\u000fÂè`\u0010\fÐ¶]¡ÊN¸_\u0089ïÅ&ÌUâ§â\u0088\u0097¡\u001cÖó\u0085±Ôji\u0097@\u00ad VS¡·µ{\u00adJâ\u0080\u001do\u0085\u0011©W¾\u0099\u0011Ï©ó\u000ezs$,Lw\u0010èÆ G\u0015ã\ràV\u009fÙC\u0013²ýÞq@D¦/Î+÷¸Þ\u0082\u0098\r¯\u008f\u001eÎéÊ -½OF\u0087hÜ\u00ad\u008b@ÿ\u0082\u00ad\u0083\u0007*£×ÆÆ`\u0005òèûÓl\u0013õ÷\u0019\u0011\u0018\u0094÷!ñ¨¯®ÐY\u0095\u0005\u0088\u0018·Ö÷æ\u001c?IR>\u0099\u009e\u0018\u0005Æÿ\u000bqbú¨Ï\u000b[uíù¸¶\u0085\u009fÇì¯¦\u0089·@D?ï\u008a\u0085= ª§8\u0016\u0015¾aîp¹>.ÒBRä{\u009f\u0082\u0090åF0Þ\u0082ÌÃ,¿th\u009f\u001c\u0093O{¹õ·\u001fÅ\u008e\u007f\tó\u0093Ý\u008b\u0003æµ\u0013NÓÆO«"
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
                     c = new String[57];
                     f_4 = LogManager.getLogger();
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

                  var6 = "\u0012H^<ï\tã0¤±__kÕ\u0095` \\\u009a6«o¿\u000f÷\u0019AíJ\u0083/Ã®ûì\u0005³\\Vº\u001a\u0007à×ð\t+\u001c0";
                  var8 = "\u0012H^<ï\tã0¤±__kÕ\u0095` \\\u009a6«o¿\u000f÷\u0019AíJ\u0083/Ã®ûì\u0005³\\Vº\u001a\u0007à×ð\t+\u001c0".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1528;
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
            throw new RuntimeException("mlk", var10);
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
         throw new RuntimeException("mlk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
