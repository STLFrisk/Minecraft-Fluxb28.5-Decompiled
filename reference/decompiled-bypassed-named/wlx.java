import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S09PacketHeldItemChange;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.network.play.server.S38PacketPlayerListItem;
import net.minecraft.network.play.server.S38PacketPlayerListItem$a1f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class wlx {
   public static final File efo;
   public static final File n1e;
   public static final File whg;
   public static final File d0c;
   private static final Logger tn9;
   private static final SimpleDateFormat x6g;
   private final vr1 az1;
   private final List wbi = Lists.newArrayList();
   private final Map sf2 = Maps.newHashMap();
   private final wxb lmv;
   private final o85 bho;
   private final ody em_;
   private final kgd gzg;
   private final Map r4g;
   private bwg z3c;
   private boolean ver;
   public int blf;
   private int w_t;
   private h50$f05 dd6;
   private boolean vd5;
   private int tub;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public wlx(vr1 var1) {
      this.lmv = new wxb(efo);
      this.bho = new o85(n1e);
      this.em_ = new ody(whg);
      this.gzg = new kgd(d0c);
      this.r4g = Maps.newHashMap();
      this.az1 = var1;
      this.lmv.gb3(false);
      this.bho.gb3(false);
      this.blf = 8;
   }

   public void zp9(hv0 param1, z96 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wlx.b J
      // 003: ldc2_w 86697049337856
      // 006: lxor
      // 007: lstore 3
      // 008: aload 2
      // 009: invokevirtual z96.x6l ()Lcom/mojang/authlib/GameProfile;
      // 00c: astore 6
      // 00e: invokestatic OpaquePredicate.b ()I
      // 011: aload 0
      // 012: getfield wlx.az1 Lvr1;
      // 015: invokevirtual vr1.y71 ()Lkr3;
      // 018: astore 7
      // 01a: istore 5
      // 01c: aload 7
      // 01e: aload 6
      // 020: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 023: invokevirtual kr3.n9g (Ljava/util/UUID;)Lcom/mojang/authlib/GameProfile;
      // 026: astore 8
      // 028: aload 8
      // 02a: iload 5
      // 02c: ifeq 047
      // 02f: ifnonnull 045
      // 032: goto 039
      // 035: invokestatic wlx.b (Loov;)Loov;
      // 038: athrow
      // 039: aload 6
      // 03b: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 03e: goto 04a
      // 041: invokestatic wlx.b (Loov;)Loov;
      // 044: athrow
      // 045: aload 8
      // 047: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 04a: astore 9
      // 04c: sipush 12241
      // 04f: aload 7
      // 051: aload 6
      // 053: invokevirtual kr3.h5y (Lcom/mojang/authlib/GameProfile;)V
      // 056: ldc2_w 4505665749980691498
      // 059: lload 3
      // 05a: lxor
      // 05b: aload 0
      // 05c: aload 2
      // 05d: invokevirtual wlx.ng8 (Lz96;)Lbdo;
      // 060: astore 10
      // 062: aload 2
      // 063: aload 0
      // 064: getfield wlx.az1 Lvr1;
      // 067: aload 2
      // 068: getfield z96.ohd I
      // 06b: invokevirtual vr1.hrw (I)Ldug;
      // 06e: invokevirtual z96.gj3 (Lt9d;)V
      // 071: aload 2
      // 072: getfield z96._am Lrsh;
      // 075: aload 2
      // 076: getfield z96.oay Lt9d;
      // 079: checkcast dug
      // 07c: invokevirtual rsh.nzt (Ldug;)V
      // 07f: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: nop
      // 085: astore 11
      // 087: iload 5
      // 089: ifeq 12d
      // 08c: aload 1
      // 08d: invokevirtual hv0.pz4 ()Ljava/net/SocketAddress;
      // 090: ifnull 0a3
      // 093: goto 09a
      // 096: invokestatic wlx.b (Loov;)Loov;
      // 099: athrow
      // 09a: aload 1
      // 09b: invokevirtual hv0.pz4 ()Ljava/net/SocketAddress;
      // 09e: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0a1: astore 11
      // 0a3: getstatic wlx.tn9 Lorg/apache/logging/log4j/Logger;
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: aload 2
      // 0ae: invokevirtual z96.noc ()Ljava/lang/String;
      // 0b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b4: ldc "["
      // 0b6: nop
      // 0b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ba: aload 11
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: sipush 700
      // 0c2: ldc2_w 4888170379881648479
      // 0c5: lload 3
      // 0c6: lxor
      // 0c7: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: nop
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: aload 2
      // 0d1: invokevirtual z96.jwu ()I
      // 0d4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d7: sipush 26527
      // 0da: ldc2_w 7539173293225178215
      // 0dd: lload 3
      // 0de: lxor
      // 0df: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: aload 2
      // 0e9: getfield z96.o2v D
      // 0ec: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 0ef: sipush 16630
      // 0f2: ldc2_w 552238296551281418
      // 0f5: lload 3
      // 0f6: lxor
      // 0f7: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: nop
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100: aload 2
      // 101: getfield z96.kfp D
      // 104: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 107: sipush 15383
      // 10a: ldc2_w 3140988673928900585
      // 10d: lload 3
      // 10e: lxor
      // 10f: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: nop
      // 115: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 118: aload 2
      // 119: getfield z96.vbd D
      // 11c: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 11f: ldc ")"
      // 121: nop
      // 122: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 125: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 128: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 12d: aload 0
      // 12e: getfield wlx.az1 Lvr1;
      // 131: aload 2
      // 132: getfield z96.ohd I
      // 135: invokevirtual vr1.hrw (I)Ldug;
      // 138: astore 12
      // 13a: aload 12
      // 13c: invokevirtual dug.r7d ()Lcog;
      // 13f: astore 13
      // 141: aload 12
      // 143: invokevirtual dug.suq ()Lmew;
      // 146: astore 14
      // 148: aload 0
      // 149: aload 2
      // 14a: aconst_null
      // 14b: checkcast z96
      // 14e: aload 12
      // 150: invokespecial wlx.ycf (Lz96;Lz96;Lt9d;)V
      // 153: new mlk
      // 156: dup
      // 157: aload 0
      // 158: getfield wlx.az1 Lvr1;
      // 15b: aload 1
      // 15c: aload 2
      // 15d: invokespecial mlk.<init> (Lvr1;Lhv0;Lz96;)V
      // 160: astore 15
      // 162: aload 15
      // 164: new net/minecraft/network/play/server/S01PacketJoinGame
      // 167: dup
      // 168: aload 2
      // 169: invokevirtual z96.jwu ()I
      // 16c: aload 2
      // 16d: getfield z96._am Lrsh;
      // 170: invokevirtual rsh.tmw ()Lh50$f05;
      // 173: aload 13
      // 175: invokevirtual cog.lce ()Z
      // 178: aload 12
      // 17a: getfield dug.vzz Lupn;
      // 17d: invokevirtual upn.gs_ ()I
      // 180: aload 12
      // 182: invokevirtual dug.rbk ()Lv66;
      // 185: aload 0
      // 186: invokevirtual wlx.yci ()I
      // 189: aload 13
      // 18b: invokevirtual cog.z28 ()Lgxq;
      // 18e: aload 12
      // 190: invokevirtual dug.eir ()Lef9;
      // 193: sipush 16400
      // 196: ldc2_w 3866567204675048447
      // 199: lload 3
      // 19a: lxor
      // 19b: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: nop
      // 1a1: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 1a4: invokespecial net/minecraft/network/play/server/S01PacketJoinGame.<init> (ILh50$f05;ZILv66;ILgxq;Z)V
      // 1a7: invokevirtual mlk.vnf (Lmz2;)V
      // 1aa: aload 15
      // 1ac: new net/minecraft/network/play/server/S3FPacketCustomPayload
      // 1af: dup
      // 1b0: sipush 23104
      // 1b3: ldc2_w 9095004757688535463
      // 1b6: lload 3
      // 1b7: lxor
      // 1b8: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: nop
      // 1be: new nfj
      // 1c1: dup
      // 1c2: invokestatic io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
      // 1c5: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 1c8: aload 0
      // 1c9: invokevirtual wlx.sdn ()Lvr1;
      // 1cc: invokevirtual vr1.ltz ()Ljava/lang/String;
      // 1cf: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 1d2: invokespecial net/minecraft/network/play/server/S3FPacketCustomPayload.<init> (Ljava/lang/String;Lnfj;)V
      // 1d5: invokevirtual mlk.vnf (Lmz2;)V
      // 1d8: aload 15
      // 1da: new net/minecraft/network/play/server/S41PacketServerDifficulty
      // 1dd: dup
      // 1de: aload 13
      // 1e0: invokevirtual cog.uah ()Lv66;
      // 1e3: aload 13
      // 1e5: invokevirtual cog.iqv ()Z
      // 1e8: invokespecial net/minecraft/network/play/server/S41PacketServerDifficulty.<init> (Lv66;Z)V
      // 1eb: invokevirtual mlk.vnf (Lmz2;)V
      // 1ee: aload 15
      // 1f0: new net/minecraft/network/play/server/S05PacketSpawnPosition
      // 1f3: dup
      // 1f4: aload 14
      // 1f6: invokespecial net/minecraft/network/play/server/S05PacketSpawnPosition.<init> (Lmew;)V
      // 1f9: invokevirtual mlk.vnf (Lmz2;)V
      // 1fc: aload 15
      // 1fe: new net/minecraft/network/play/server/S39PacketPlayerAbilities
      // 201: dup
      // 202: aload 2
      // 203: getfield z96.lls Lpj2;
      // 206: invokespecial net/minecraft/network/play/server/S39PacketPlayerAbilities.<init> (Lpj2;)V
      // 209: invokevirtual mlk.vnf (Lmz2;)V
      // 20c: aload 15
      // 20e: new net/minecraft/network/play/server/S09PacketHeldItemChange
      // 211: dup
      // 212: aload 2
      // 213: getfield z96.up_ Ljnq;
      // 216: getfield jnq.nb5 I
      // 219: invokespecial net/minecraft/network/play/server/S09PacketHeldItemChange.<init> (I)V
      // 21c: invokevirtual mlk.vnf (Lmz2;)V
      // 21f: aload 2
      // 220: invokevirtual z96._m3 ()Ldc5;
      // 223: invokevirtual dc5.w92 ()V
      // 226: aload 2
      // 227: invokevirtual z96._m3 ()Ldc5;
      // 22a: aload 2
      // 22b: invokevirtual dc5.vd_ (Lz96;)V
      // 22e: aload 0
      // 22f: aload 12
      // 231: invokevirtual dug.fgp ()Luci;
      // 234: checkcast z3y
      // 237: aload 2
      // 238: invokevirtual wlx.lqa (Lz3y;Lz96;)V
      // 23b: aload 0
      // 23c: getfield wlx.az1 Lvr1;
      // 23f: invokevirtual vr1.bag ()V
      // 242: aload 2
      // 243: invokevirtual z96.noc ()Ljava/lang/String;
      // 246: aload 9
      // 248: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 24b: ifne 27a
      // 24e: new hsu
      // 251: dup
      // 252: sipush 27958
      // 255: ldc2_w 2253081930174234332
      // 258: lload 3
      // 259: lxor
      // 25a: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: nop
      // 260: bipush 2
      // 261: anewarray 22
      // 264: dup
      // 265: bipush 0
      // 266: aload 2
      // 267: invokevirtual z96.xyw ()Lekw;
      // 26a: aastore
      // 26b: dup
      // 26c: bipush 1
      // 26d: aload 9
      // 26f: aastore
      // 270: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 273: astore 16
      // 275: iload 5
      // 277: ifne 29c
      // 27a: new hsu
      // 27d: dup
      // 27e: sipush 9975
      // 281: ldc2_w 3869035841253029125
      // 284: lload 3
      // 285: lxor
      // 286: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: nop
      // 28c: bipush 1
      // 28d: anewarray 22
      // 290: dup
      // 291: bipush 0
      // 292: aload 2
      // 293: invokevirtual z96.xyw ()Lekw;
      // 296: aastore
      // 297: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 29a: astore 16
      // 29c: aload 16
      // 29e: invokevirtual hsu.f4q ()Lpoy;
      // 2a1: getstatic syo.iyk Lsyo;
      // 2a4: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 2a7: pop
      // 2a8: aload 0
      // 2a9: aload 16
      // 2ab: invokevirtual wlx.d3z (Lekw;)V
      // 2ae: aload 0
      // 2af: aload 2
      // 2b0: invokevirtual wlx.y_m (Lz96;)V
      // 2b3: aload 15
      // 2b5: aload 2
      // 2b6: getfield z96.o2v D
      // 2b9: aload 2
      // 2ba: getfield z96.kfp D
      // 2bd: aload 2
      // 2be: getfield z96.vbd D
      // 2c1: aload 2
      // 2c2: getfield z96.x5k F
      // 2c5: aload 2
      // 2c6: getfield z96.y2i F
      // 2c9: invokevirtual mlk.ymx (DDDFF)V
      // 2cc: aload 0
      // 2cd: aload 2
      // 2ce: aload 12
      // 2d0: invokevirtual wlx.o9x (Lz96;Ldug;)V
      // 2d3: aload 0
      // 2d4: getfield wlx.az1 Lvr1;
      // 2d7: invokevirtual vr1.znk ()Ljava/lang/String;
      // 2da: invokevirtual java/lang/String.length ()I
      // 2dd: ifle 2f9
      // 2e0: aload 2
      // 2e1: aload 0
      // 2e2: getfield wlx.az1 Lvr1;
      // 2e5: invokevirtual vr1.znk ()Ljava/lang/String;
      // 2e8: aload 0
      // 2e9: getfield wlx.az1 Lvr1;
      // 2ec: invokevirtual vr1.ner ()Ljava/lang/String;
      // 2ef: invokevirtual z96.vfs (Ljava/lang/String;Ljava/lang/String;)V
      // 2f2: goto 2f9
      // 2f5: invokestatic wlx.b (Loov;)Loov;
      // 2f8: athrow
      // 2f9: aload 2
      // 2fa: invokevirtual z96.g5i ()Ljava/util/Collection;
      // 2fd: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 302: astore 17
      // 304: aload 17
      // 306: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 30b: ifeq 33d
      // 30e: aload 17
      // 310: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 315: checkcast sdj
      // 318: astore 18
      // 31a: aload 15
      // 31c: new net/minecraft/network/play/server/S1DPacketEntityEffect
      // 31f: dup
      // 320: aload 2
      // 321: invokevirtual z96.jwu ()I
      // 324: aload 18
      // 326: invokespecial net/minecraft/network/play/server/S1DPacketEntityEffect.<init> (ILsdj;)V
      // 329: invokevirtual mlk.vnf (Lmz2;)V
      // 32c: iload 5
      // 32e: ifeq 341
      // 331: iload 5
      // 333: ifne 304
      // 336: goto 33d
      // 339: invokestatic wlx.b (Loov;)Loov;
      // 33c: athrow
      // 33d: aload 2
      // 33e: invokevirtual z96.mw4 ()V
      // 341: aload 10
      // 343: iload 5
      // 345: ifeq 354
      // 348: ifnull 3c9
      // 34b: goto 352
      // 34e: invokestatic wlx.b (Loov;)Loov;
      // 351: athrow
      // 352: aload 10
      // 354: sipush 26270
      // 357: ldc2_w 3188170798261728634
      // 35a: lload 3
      // 35b: lxor
      // 35c: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: nop
      // 362: iload 5
      // 364: ifeq 38d
      // 367: bipush 10
      // 369: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 36c: ifeq 3c9
      // 36f: goto 376
      // 372: invokestatic wlx.b (Loov;)Loov;
      // 375: athrow
      // 376: aload 10
      // 378: sipush 11702
      // 37b: ldc2_w 2310425238579134036
      // 37e: lload 3
      // 37f: lxor
      // 380: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: nop
      // 386: goto 38d
      // 389: invokestatic wlx.b (Loov;)Loov;
      // 38c: athrow
      // 38d: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 390: aload 12
      // 392: invokestatic y65._lj (Lbdo;Lt9d;)Li2h;
      // 395: astore 17
      // 397: aload 17
      // 399: iload 5
      // 39b: ifeq 3c5
      // 39e: ifnull 3c9
      // 3a1: goto 3a8
      // 3a4: invokestatic wlx.b (Loov;)Loov;
      // 3a7: athrow
      // 3a8: aload 17
      // 3aa: bipush 1
      // 3ab: putfield EntityLivingBase.dg4 Z
      // 3ae: aload 12
      // 3b0: aload 17
      // 3b2: invokevirtual dug.xzq (Li2h;)Z
      // 3b5: pop
      // 3b6: aload 2
      // 3b7: aload 17
      // 3b9: invokevirtual z96.nw9 (Li2h;)V
      // 3bc: aload 17
      // 3be: goto 3c5
      // 3c1: invokestatic wlx.b (Loov;)Loov;
      // 3c4: athrow
      // 3c5: bipush 0
      // 3c6: putfield EntityLivingBase.dg4 Z
      // 3c9: return
   }

   public void lqa(z3y param1, z96 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 03: astore 4
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 1
      // 09: invokevirtual z3y.yhf ()Ljava/util/Collection;
      // 0c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 11: astore 5
      // 13: istore 3
      // 14: aload 5
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 3f
      // 1e: aload 5
      // 20: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25: checkcast q2m
      // 28: astore 6
      // 2a: aload 2
      // 2b: getfield z96.rhh Lmlk;
      // 2e: new net/minecraft/network/play/server/S3EPacketTeams
      // 31: dup
      // 32: aload 6
      // 34: bipush 0
      // 35: invokespecial net/minecraft/network/play/server/S3EPacketTeams.<init> (Lq2m;I)V
      // 38: invokevirtual mlk.vnf (Lmz2;)V
      // 3b: iload 3
      // 3c: ifeq 14
      // 3f: bipush 0
      // 40: istore 5
      // 42: iload 5
      // 44: bipush 19
      // 46: if_icmpge c0
      // 49: aload 1
      // 4a: iload 5
      // 4c: invokevirtual z3y.d_n (I)Lsa6;
      // 4f: astore 6
      // 51: iload 3
      // 52: ifne bc
      // 55: aload 6
      // 57: ifnull b9
      // 5a: goto 61
      // 5d: invokestatic wlx.b (Loov;)Loov;
      // 60: athrow
      // 61: aload 4
      // 63: aload 6
      // 65: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 6a: ifne b9
      // 6d: goto 74
      // 70: invokestatic wlx.b (Loov;)Loov;
      // 73: athrow
      // 74: aload 1
      // 75: aload 6
      // 77: invokevirtual z3y.nsa (Lsa6;)Ljava/util/List;
      // 7a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 7f: astore 7
      // 81: aload 7
      // 83: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 88: ifeq af
      // 8b: aload 7
      // 8d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 92: checkcast mz2
      // 95: astore 8
      // 97: aload 2
      // 98: getfield z96.rhh Lmlk;
      // 9b: aload 8
      // 9d: invokevirtual mlk.vnf (Lmz2;)V
      // a0: iload 3
      // a1: ifne bc
      // a4: iload 3
      // a5: ifeq 81
      // a8: goto af
      // ab: invokestatic wlx.b (Loov;)Loov;
      // ae: athrow
      // af: aload 4
      // b1: aload 6
      // b3: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // b8: pop
      // b9: iinc 5 1
      // bc: iload 3
      // bd: ifeq 42
      // c0: return
   }

   public void yf0(dug[] var1) {
      this.z3c = var1[0].b4z().l64();
      var1[0].fve().air(new wlx$1(this));
   }

   public void l_8(z96 param1, dug param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual z96.b88 ()Ldug;
      // 08: astore 4
      // 0a: aload 2
      // 0b: iload 3
      // 0c: ifne 33
      // 0f: ifnull 28
      // 12: goto 19
      // 15: invokestatic wlx.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 2
      // 1a: invokevirtual dug.gez ()Ley1;
      // 1d: aload 1
      // 1e: invokevirtual ey1.pt7 (Lz96;)V
      // 21: goto 28
      // 24: invokestatic wlx.b (Loov;)Loov;
      // 27: athrow
      // 28: aload 4
      // 2a: invokevirtual dug.gez ()Ley1;
      // 2d: aload 1
      // 2e: invokevirtual ey1.x0z (Lz96;)V
      // 31: aload 4
      // 33: getfield dug.kil Lgvi;
      // 36: aload 1
      // 37: getfield z96.o2v D
      // 3a: d2i
      // 3b: bipush 4
      // 3c: ishr
      // 3d: aload 1
      // 3e: getfield z96.vbd D
      // 41: d2i
      // 42: bipush 4
      // 43: ishr
      // 44: invokevirtual gvi.xw9 (II)Ltts;
      // 47: pop
      // 48: return
   }

   public int z69() {
      return ey1._97(this.pci());
   }

   public bdo ng8(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wlx.b J
      // 03: ldc2_w 53085629107690
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield wlx.az1 Lvr1;
      // 11: getfield vr1.p_y [Ldug;
      // 14: bipush 0
      // 15: aaload
      // 16: invokevirtual dug.r7d ()Lcog;
      // 19: invokevirtual cog._1l ()Lbdo;
      // 1c: astore 5
      // 1e: aload 1
      // 1f: invokevirtual z96.noc ()Ljava/lang/String;
      // 22: aload 0
      // 23: getfield wlx.az1 Lvr1;
      // 26: invokevirtual vr1.p4h ()Ljava/lang/String;
      // 29: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c: ifeq 6c
      // 2f: aload 5
      // 31: iload 4
      // 33: ifne 7d
      // 36: goto 3d
      // 39: invokestatic wlx.b (Loov;)Loov;
      // 3c: athrow
      // 3d: ifnull 6c
      // 40: goto 47
      // 43: invokestatic wlx.b (Loov;)Loov;
      // 46: athrow
      // 47: aload 1
      // 48: aload 5
      // 4a: invokevirtual z96.a1f (Lbdo;)V
      // 4d: aload 5
      // 4f: astore 6
      // 51: getstatic wlx.tn9 Lorg/apache/logging/log4j/Logger;
      // 54: sipush 17191
      // 57: ldc2_w 1995782486987484453
      // 5a: lload 2
      // 5b: lxor
      // 5c: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;)V 2
      // 67: iload 4
      // 69: ifeq 7f
      // 6c: aload 0
      // 6d: getfield wlx.z3c Lbwg;
      // 70: aload 1
      // 71: invokeinterface bwg.j0m (Lha9;)Lbdo; 2
      // 76: goto 7d
      // 79: invokestatic wlx.b (Loov;)Loov;
      // 7c: athrow
      // 7d: astore 6
      // 7f: aload 6
      // 81: areturn
   }

   public void vsg(z96 var1) {
      this.z3c.byf(var1);
      int var10000 = OpaquePredicate.c();
      dc5 var3 = (dc5)this.r4g.get(var1.b_q());
      int var2 = var10000;

      label20: {
         try {
            var5 = var3;
            if (var2 != 0) {
               break label20;
            }

            if (var3 == null) {
               return;
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var5 = var3;
      }

      var5.oce();
   }

   public void y_m(z96 var1) {
      this.wbi.add(var1);
      int var10000 = OpaquePredicate.c();
      this.sf2.put(var1.b_q(), var1);
      int var2 = var10000;
      this.v3l(new S38PacketPlayerListItem(S38PacketPlayerListItem$a1f.om8, new z96[]{var1}));
      dug var3 = this.az1.hrw(var1.ohd);
      var3.xzq(var1);
      this.l_8(var1, (dug)null);
      int var4 = 0;

      while (var4 < this.wbi.size()) {
         z96 var5 = (z96)this.wbi.get(var4);
         var1.rhh.vnf(new S38PacketPlayerListItem(S38PacketPlayerListItem$a1f.om8, new z96[]{var5}));
         var4++;
         if (var2 != 0) {
            break;
         }
      }
   }

   public void xgj(z96 var1) {
      var1.b88().gez().tc5(var1);
   }

   public void rs8(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wlx.b J
      // 03: ldc2_w 11043915515784
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: getstatic l9p.rds L_ss;
      // 0c: invokevirtual z96.aex (L_ss;)V
      // 0f: invokestatic OpaquePredicate.b ()I
      // 12: aload 0
      // 13: aload 1
      // 14: invokevirtual wlx.vsg (Lz96;)V
      // 17: aload 1
      // 18: invokevirtual z96.b88 ()Ldug;
      // 1b: astore 5
      // 1d: istore 4
      // 1f: aload 1
      // 20: iload 4
      // 22: ifeq 73
      // 25: getfield z96.hzp Li2h;
      // 28: ifnull 58
      // 2b: goto 32
      // 2e: invokestatic wlx.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 5
      // 34: aload 1
      // 35: getfield z96.hzp Li2h;
      // 38: invokevirtual dug.k1e (Li2h;)V
      // 3b: getstatic wlx.tn9 Lorg/apache/logging/log4j/Logger;
      // 3e: sipush 16526
      // 41: ldc2_w 5943394722341332217
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;)V 2
      // 51: goto 58
      // 54: invokestatic wlx.b (Loov;)Loov;
      // 57: athrow
      // 58: aload 5
      // 5a: aload 1
      // 5b: invokevirtual dug.rqa (Li2h;)V
      // 5e: aload 5
      // 60: invokevirtual dug.gez ()Ley1;
      // 63: aload 1
      // 64: invokevirtual ey1.pt7 (Lz96;)V
      // 67: aload 0
      // 68: getfield wlx.wbi Ljava/util/List;
      // 6b: aload 1
      // 6c: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 71: pop
      // 72: aload 1
      // 73: invokevirtual z96.b_q ()Ljava/util/UUID;
      // 76: astore 6
      // 78: aload 0
      // 79: getfield wlx.sf2 Ljava/util/Map;
      // 7c: aload 6
      // 7e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 83: checkcast z96
      // 86: astore 7
      // 88: iload 4
      // 8a: ifeq cf
      // 8d: aload 7
      // 8f: aload 1
      // 90: if_acmpne b9
      // 93: goto 9a
      // 96: invokestatic wlx.b (Loov;)Loov;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield wlx.sf2 Ljava/util/Map;
      // 9e: aload 6
      // a0: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // a5: pop
      // a6: aload 0
      // a7: getfield wlx.r4g Ljava/util/Map;
      // aa: aload 6
      // ac: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // b1: pop
      // b2: goto b9
      // b5: invokestatic wlx.b (Loov;)Loov;
      // b8: athrow
      // b9: aload 0
      // ba: new net/minecraft/network/play/server/S38PacketPlayerListItem
      // bd: dup
      // be: getstatic net/minecraft/network/play/server/S38PacketPlayerListItem$a1f.vl6 Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // c1: bipush 1
      // c2: anewarray 135
      // c5: dup
      // c6: bipush 0
      // c7: aload 1
      // c8: aastore
      // c9: invokespecial net/minecraft/network/play/server/S38PacketPlayerListItem.<init> (Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;[Lz96;)V
      // cc: invokevirtual wlx.v3l (Lmz2;)V
      // cf: return
   }

   public String pjq(SocketAddress param1, GameProfile param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wlx.b J
      // 003: ldc2_w 116798608843672
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield wlx.lmv Lwxb;
      // 011: aload 2
      // 012: invokevirtual wxb.m3r (Lcom/mojang/authlib/GameProfile;)Z
      // 015: iload 5
      // 017: ifne 096
      // 01a: ifeq 091
      // 01d: goto 024
      // 020: invokestatic wlx.b (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: getfield wlx.lmv Lwxb;
      // 028: aload 2
      // 029: invokevirtual wxb.fsa (Ljava/lang/Object;)Lsyv;
      // 02c: checkcast b06
      // 02f: astore 6
      // 031: new java/lang/StringBuilder
      // 034: dup
      // 035: invokespecial java/lang/StringBuilder.<init> ()V
      // 038: sipush 26995
      // 03b: ldc2_w 2958449207827622181
      // 03e: lload 3
      // 03f: lxor
      // 040: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: nop
      // 046: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 049: aload 6
      // 04b: invokevirtual b06.x2c ()Ljava/lang/String;
      // 04e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 051: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 054: astore 7
      // 056: aload 6
      // 058: invokevirtual b06.d6d ()Ljava/util/Date;
      // 05b: ifnull 08e
      // 05e: new java/lang/StringBuilder
      // 061: dup
      // 062: invokespecial java/lang/StringBuilder.<init> ()V
      // 065: aload 7
      // 067: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06a: sipush 25919
      // 06d: ldc2_w 4199196281804318033
      // 070: lload 3
      // 071: lxor
      // 072: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: getstatic wlx.x6g Ljava/text/SimpleDateFormat;
      // 07e: aload 6
      // 080: invokevirtual b06.d6d ()Ljava/util/Date;
      // 083: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08c: astore 7
      // 08e: aload 7
      // 090: areturn
      // 091: aload 0
      // 092: aload 2
      // 093: invokevirtual wlx.dsh (Lcom/mojang/authlib/GameProfile;)Z
      // 096: iload 5
      // 098: ifne 0c0
      // 09b: ifne 0b8
      // 09e: goto 0a5
      // 0a1: invokestatic wlx.b (Loov;)Loov;
      // 0a4: athrow
      // 0a5: sipush 32613
      // 0a8: ldc2_w 7671692899915759376
      // 0ab: lload 3
      // 0ac: lxor
      // 0ad: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: areturn
      // 0b4: invokestatic wlx.b (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: getfield wlx.bho Lo85;
      // 0bc: aload 1
      // 0bd: invokevirtual o85.nxv (Ljava/net/SocketAddress;)Z
      // 0c0: iload 5
      // 0c2: ifne 142
      // 0c5: ifeq 139
      // 0c8: goto 0cf
      // 0cb: invokestatic wlx.b (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield wlx.bho Lo85;
      // 0d3: aload 1
      // 0d4: invokevirtual o85.lyx (Ljava/net/SocketAddress;)Lx6m;
      // 0d7: astore 6
      // 0d9: new java/lang/StringBuilder
      // 0dc: dup
      // 0dd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e0: sipush 8284
      // 0e3: ldc2_w 6577812090748313640
      // 0e6: lload 3
      // 0e7: lxor
      // 0e8: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: nop
      // 0ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f1: aload 6
      // 0f3: invokevirtual x6m.x2c ()Ljava/lang/String;
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fc: astore 7
      // 0fe: aload 6
      // 100: invokevirtual x6m.d6d ()Ljava/util/Date;
      // 103: ifnull 136
      // 106: new java/lang/StringBuilder
      // 109: dup
      // 10a: invokespecial java/lang/StringBuilder.<init> ()V
      // 10d: aload 7
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: sipush 7264
      // 115: ldc2_w 6419349749950946306
      // 118: lload 3
      // 119: lxor
      // 11a: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: nop
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: getstatic wlx.x6g Ljava/text/SimpleDateFormat;
      // 126: aload 6
      // 128: invokevirtual x6m.d6d ()Ljava/util/Date;
      // 12b: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 134: astore 7
      // 136: aload 7
      // 138: areturn
      // 139: aload 0
      // 13a: getfield wlx.wbi Ljava/util/List;
      // 13d: invokeinterface java/util/List.size ()I 1
      // 142: iload 5
      // 144: ifne 161
      // 147: aload 0
      // 148: getfield wlx.blf I
      // 14b: if_icmplt 179
      // 14e: goto 155
      // 151: invokestatic wlx.b (Loov;)Loov;
      // 154: athrow
      // 155: aload 0
      // 156: aload 2
      // 157: invokevirtual wlx.l86 (Lcom/mojang/authlib/GameProfile;)Z
      // 15a: goto 161
      // 15d: invokestatic wlx.b (Loov;)Loov;
      // 160: athrow
      // 161: ifne 179
      // 164: sipush 22593
      // 167: ldc2_w 6330486649013426236
      // 16a: lload 3
      // 16b: lxor
      // 16c: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: nop
      // 172: goto 17a
      // 175: invokestatic wlx.b (Loov;)Loov;
      // 178: athrow
      // 179: aconst_null
      // 17a: areturn
   }

   public z96 ajx(GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wlx.b J
      // 003: ldc2_w 84659716620262
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: invokestatic ha9.z05 (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 00c: astore 5
      // 00e: invokestatic OpaquePredicate.b ()I
      // 011: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 014: astore 6
      // 016: istore 4
      // 018: bipush 0
      // 019: istore 7
      // 01b: iload 7
      // 01d: aload 0
      // 01e: getfield wlx.wbi Ljava/util/List;
      // 021: invokeinterface java/util/List.size ()I 1
      // 026: if_icmpge 077
      // 029: aload 0
      // 02a: getfield wlx.wbi Ljava/util/List;
      // 02d: iload 7
      // 02f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 034: checkcast z96
      // 037: astore 8
      // 039: iload 4
      // 03b: ifeq 072
      // 03e: aload 8
      // 040: invokevirtual z96.b_q ()Ljava/util/UUID;
      // 043: iload 4
      // 045: ifeq 084
      // 048: goto 04f
      // 04b: invokestatic wlx.b (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 5
      // 051: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 054: ifeq 06f
      // 057: goto 05e
      // 05a: invokestatic wlx.b (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 6
      // 060: aload 8
      // 062: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 067: pop
      // 068: goto 06f
      // 06b: invokestatic wlx.b (Loov;)Loov;
      // 06e: athrow
      // 06f: iinc 7 1
      // 072: iload 4
      // 074: ifne 01b
      // 077: aload 0
      // 078: getfield wlx.sf2 Ljava/util/Map;
      // 07b: aload 1
      // 07c: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 07f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 084: checkcast z96
      // 087: astore 7
      // 089: aload 7
      // 08b: ifnull 0be
      // 08e: aload 6
      // 090: iload 4
      // 092: ifeq 0c0
      // 095: goto 09c
      // 098: invokestatic wlx.b (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 7
      // 09e: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0a3: ifne 0be
      // 0a6: goto 0ad
      // 0a9: invokestatic wlx.b (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 6
      // 0af: aload 7
      // 0b1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b6: pop
      // 0b7: goto 0be
      // 0ba: invokestatic wlx.b (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 6
      // 0c0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c5: astore 8
      // 0c7: aload 8
      // 0c9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ce: ifeq 104
      // 0d1: aload 8
      // 0d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d8: checkcast z96
      // 0db: astore 9
      // 0dd: aload 9
      // 0df: getfield z96.rhh Lmlk;
      // 0e2: sipush 16906
      // 0e5: ldc2_w 8961915768590474769
      // 0e8: lload 2
      // 0e9: lxor
      // 0ea: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: nop
      // 0f0: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 0f3: iload 4
      // 0f5: ifeq 122
      // 0f8: iload 4
      // 0fa: ifne 0c7
      // 0fd: goto 104
      // 100: invokestatic wlx.b (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: getfield wlx.az1 Lvr1;
      // 108: invokevirtual vr1.bie ()Z
      // 10b: ifeq 122
      // 10e: new ego
      // 111: dup
      // 112: aload 0
      // 113: getfield wlx.az1 Lvr1;
      // 116: bipush 0
      // 117: invokevirtual vr1.hrw (I)Ldug;
      // 11a: invokespecial ego.<init> (Lt9d;)V
      // 11d: astore 8
      // 11f: goto 133
      // 122: new rsh
      // 125: dup
      // 126: aload 0
      // 127: getfield wlx.az1 Lvr1;
      // 12a: bipush 0
      // 12b: invokevirtual vr1.hrw (I)Ldug;
      // 12e: invokespecial rsh.<init> (Lt9d;)V
      // 131: astore 8
      // 133: new z96
      // 136: dup
      // 137: aload 0
      // 138: getfield wlx.az1 Lvr1;
      // 13b: aload 0
      // 13c: getfield wlx.az1 Lvr1;
      // 13f: bipush 0
      // 140: invokevirtual vr1.hrw (I)Ldug;
      // 143: aload 1
      // 144: aload 8
      // 146: invokespecial z96.<init> (Lvr1;Ldug;Lcom/mojang/authlib/GameProfile;Lrsh;)V
      // 149: areturn
   }

   public z96 tzq(z96 param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual z96.b88 ()Ldug;
      // 004: invokevirtual dug.fp4 ()Lqpc;
      // 007: aload 1
      // 008: invokevirtual qpc.bby (Lz96;)V
      // 00b: invokestatic OpaquePredicate.c ()I
      // 00e: aload 1
      // 00f: invokevirtual z96.b88 ()Ldug;
      // 012: invokevirtual dug.fp4 ()Lqpc;
      // 015: aload 1
      // 016: invokevirtual qpc.oow (Li2h;)V
      // 019: aload 1
      // 01a: invokevirtual z96.b88 ()Ldug;
      // 01d: invokevirtual dug.gez ()Ley1;
      // 020: aload 1
      // 021: invokevirtual ey1.pt7 (Lz96;)V
      // 024: istore 4
      // 026: aload 0
      // 027: getfield wlx.wbi Ljava/util/List;
      // 02a: aload 1
      // 02b: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 030: pop
      // 031: aload 0
      // 032: getfield wlx.az1 Lvr1;
      // 035: aload 1
      // 036: getfield z96.ohd I
      // 039: invokevirtual vr1.hrw (I)Ldug;
      // 03c: aload 1
      // 03d: invokevirtual dug.k1e (Li2h;)V
      // 040: aload 1
      // 041: invokevirtual z96._py ()Lmew;
      // 044: astore 5
      // 046: aload 1
      // 047: invokevirtual z96.k2h ()Z
      // 04a: istore 6
      // 04c: aload 1
      // 04d: iload 2
      // 04e: putfield z96.ohd I
      // 051: aload 0
      // 052: getfield wlx.az1 Lvr1;
      // 055: invokevirtual vr1.bie ()Z
      // 058: ifeq 074
      // 05b: new ego
      // 05e: dup
      // 05f: aload 0
      // 060: getfield wlx.az1 Lvr1;
      // 063: aload 1
      // 064: getfield z96.ohd I
      // 067: invokevirtual vr1.hrw (I)Ldug;
      // 06a: invokespecial ego.<init> (Lt9d;)V
      // 06d: astore 7
      // 06f: iload 4
      // 071: ifeq 088
      // 074: new rsh
      // 077: dup
      // 078: aload 0
      // 079: getfield wlx.az1 Lvr1;
      // 07c: aload 1
      // 07d: getfield z96.ohd I
      // 080: invokevirtual vr1.hrw (I)Ldug;
      // 083: invokespecial rsh.<init> (Lt9d;)V
      // 086: astore 7
      // 088: new z96
      // 08b: dup
      // 08c: aload 0
      // 08d: getfield wlx.az1 Lvr1;
      // 090: aload 0
      // 091: getfield wlx.az1 Lvr1;
      // 094: aload 1
      // 095: getfield z96.ohd I
      // 098: invokevirtual vr1.hrw (I)Ldug;
      // 09b: aload 1
      // 09c: invokevirtual z96.x6l ()Lcom/mojang/authlib/GameProfile;
      // 09f: aload 7
      // 0a1: invokespecial z96.<init> (Lvr1;Ldug;Lcom/mojang/authlib/GameProfile;Lrsh;)V
      // 0a4: astore 8
      // 0a6: aload 8
      // 0a8: aload 1
      // 0a9: getfield z96.rhh Lmlk;
      // 0ac: putfield z96.rhh Lmlk;
      // 0af: aload 8
      // 0b1: aload 1
      // 0b2: iload 3
      // 0b3: invokevirtual z96.moc (Lha9;Z)V
      // 0b6: aload 8
      // 0b8: aload 1
      // 0b9: invokevirtual z96.jwu ()I
      // 0bc: invokevirtual z96.i6d (I)V
      // 0bf: aload 8
      // 0c1: aload 1
      // 0c2: invokevirtual z96.kj_ (Li2h;)V
      // 0c5: aload 0
      // 0c6: getfield wlx.az1 Lvr1;
      // 0c9: aload 1
      // 0ca: getfield z96.ohd I
      // 0cd: invokevirtual vr1.hrw (I)Ldug;
      // 0d0: astore 9
      // 0d2: aload 0
      // 0d3: aload 8
      // 0d5: aload 1
      // 0d6: aload 9
      // 0d8: invokespecial wlx.ycf (Lz96;Lz96;Lt9d;)V
      // 0db: aload 5
      // 0dd: iload 4
      // 0df: ifne 105
      // 0e2: ifnull 16d
      // 0e5: goto 0ec
      // 0e8: invokestatic wlx.b (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield wlx.az1 Lvr1;
      // 0f0: aload 1
      // 0f1: getfield z96.ohd I
      // 0f4: invokevirtual vr1.hrw (I)Ldug;
      // 0f7: aload 5
      // 0f9: iload 6
      // 0fb: invokestatic ha9.mpo (Lt9d;Lmew;Z)Lmew;
      // 0fe: goto 105
      // 101: invokestatic wlx.b (Loov;)Loov;
      // 104: athrow
      // 105: astore 10
      // 107: iload 4
      // 109: ifne 150
      // 10c: aload 10
      // 10e: ifnull 155
      // 111: goto 118
      // 114: invokestatic wlx.b (Loov;)Loov;
      // 117: athrow
      // 118: aload 8
      // 11a: aload 10
      // 11c: invokevirtual mew.getX ()I
      // 11f: i2f
      // 120: ldc 0.5
      // 122: nop
      // 123: fadd
      // 124: f2d
      // 125: aload 10
      // 127: invokevirtual mew.getY ()I
      // 12a: i2f
      // 12b: ldc 0.1
      // 12d: nop
      // 12e: fadd
      // 12f: f2d
      // 130: aload 10
      // 132: invokevirtual mew.getZ ()I
      // 135: i2f
      // 136: ldc 0.5
      // 138: nop
      // 139: fadd
      // 13a: f2d
      // 13b: fconst_0
      // 13c: fconst_0
      // 13d: invokevirtual z96.x24 (DDDFF)V
      // 140: aload 8
      // 142: aload 5
      // 144: iload 6
      // 146: invokevirtual z96.i9g (Lmew;Z)V
      // 149: goto 150
      // 14c: invokestatic wlx.b (Loov;)Loov;
      // 14f: athrow
      // 150: iload 4
      // 152: ifeq 16d
      // 155: aload 8
      // 157: getfield z96.rhh Lmlk;
      // 15a: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 15d: dup
      // 15e: bipush 0
      // 15f: fconst_0
      // 160: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 163: invokevirtual mlk.vnf (Lmz2;)V
      // 166: goto 16d
      // 169: invokestatic wlx.b (Loov;)Loov;
      // 16c: athrow
      // 16d: aload 9
      // 16f: getfield dug.kil Lgvi;
      // 172: aload 8
      // 174: getfield z96.o2v D
      // 177: d2i
      // 178: bipush 4
      // 179: ishr
      // 17a: aload 8
      // 17c: getfield z96.vbd D
      // 17f: d2i
      // 180: bipush 4
      // 181: ishr
      // 182: invokevirtual gvi.xw9 (II)Ltts;
      // 185: pop
      // 186: aload 9
      // 188: aload 8
      // 18a: aload 8
      // 18c: invokevirtual z96.aaw ()Lnh4;
      // 18f: invokevirtual dug.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 192: invokeinterface java/util/List.isEmpty ()Z 1
      // 197: ifne 1e0
      // 19a: aload 8
      // 19c: iload 4
      // 19e: ifne 1e2
      // 1a1: iload 4
      // 1a3: ifne 1e2
      // 1a6: goto 1ad
      // 1a9: invokestatic wlx.b (Loov;)Loov;
      // 1ac: athrow
      // 1ad: getfield z96.kfp D
      // 1b0: ldc2_w 256.0
      // 1b3: dcmpg
      // 1b4: ifge 1e0
      // 1b7: goto 1be
      // 1ba: invokestatic wlx.b (Loov;)Loov;
      // 1bd: athrow
      // 1be: aload 8
      // 1c0: aload 8
      // 1c2: getfield z96.o2v D
      // 1c5: aload 8
      // 1c7: getfield z96.kfp D
      // 1ca: dconst_1
      // 1cb: dadd
      // 1cc: aload 8
      // 1ce: getfield z96.vbd D
      // 1d1: invokevirtual z96.m6_ (DDD)V
      // 1d4: iload 4
      // 1d6: ifeq 186
      // 1d9: goto 1e0
      // 1dc: invokestatic wlx.b (Loov;)Loov;
      // 1df: athrow
      // 1e0: aload 8
      // 1e2: getfield z96.rhh Lmlk;
      // 1e5: new net/minecraft/network/play/server/S07PacketRespawn
      // 1e8: dup
      // 1e9: aload 8
      // 1eb: getfield z96.ohd I
      // 1ee: aload 8
      // 1f0: getfield z96.oay Lt9d;
      // 1f3: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 1f6: aload 8
      // 1f8: getfield z96.oay Lt9d;
      // 1fb: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 1fe: invokevirtual cog.z28 ()Lgxq;
      // 201: aload 8
      // 203: getfield z96._am Lrsh;
      // 206: invokevirtual rsh.tmw ()Lh50$f05;
      // 209: invokespecial net/minecraft/network/play/server/S07PacketRespawn.<init> (ILv66;Lgxq;Lh50$f05;)V
      // 20c: invokevirtual mlk.vnf (Lmz2;)V
      // 20f: aload 9
      // 211: invokevirtual dug.suq ()Lmew;
      // 214: astore 10
      // 216: aload 8
      // 218: getfield z96.rhh Lmlk;
      // 21b: aload 8
      // 21d: getfield z96.o2v D
      // 220: aload 8
      // 222: getfield z96.kfp D
      // 225: aload 8
      // 227: getfield z96.vbd D
      // 22a: aload 8
      // 22c: getfield z96.x5k F
      // 22f: aload 8
      // 231: getfield z96.y2i F
      // 234: invokevirtual mlk.ymx (DDDFF)V
      // 237: aload 8
      // 239: getfield z96.rhh Lmlk;
      // 23c: new net/minecraft/network/play/server/S05PacketSpawnPosition
      // 23f: dup
      // 240: aload 10
      // 242: invokespecial net/minecraft/network/play/server/S05PacketSpawnPosition.<init> (Lmew;)V
      // 245: invokevirtual mlk.vnf (Lmz2;)V
      // 248: aload 8
      // 24a: getfield z96.rhh Lmlk;
      // 24d: new net/minecraft/network/play/server/S1FPacketSetExperience
      // 250: dup
      // 251: aload 8
      // 253: getfield z96.ey9 F
      // 256: aload 8
      // 258: getfield z96.nk0 I
      // 25b: aload 8
      // 25d: getfield z96.op5 I
      // 260: invokespecial net/minecraft/network/play/server/S1FPacketSetExperience.<init> (FII)V
      // 263: invokevirtual mlk.vnf (Lmz2;)V
      // 266: aload 0
      // 267: aload 8
      // 269: aload 9
      // 26b: invokevirtual wlx.o9x (Lz96;Ldug;)V
      // 26e: aload 9
      // 270: invokevirtual dug.gez ()Ley1;
      // 273: aload 8
      // 275: invokevirtual ey1.x0z (Lz96;)V
      // 278: aload 9
      // 27a: aload 8
      // 27c: invokevirtual dug.xzq (Li2h;)Z
      // 27f: pop
      // 280: aload 0
      // 281: getfield wlx.wbi Ljava/util/List;
      // 284: aload 8
      // 286: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 28b: pop
      // 28c: aload 0
      // 28d: getfield wlx.sf2 Ljava/util/Map;
      // 290: aload 8
      // 292: invokevirtual z96.b_q ()Ljava/util/UUID;
      // 295: aload 8
      // 297: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 29c: pop
      // 29d: aload 8
      // 29f: invokevirtual z96.mw4 ()V
      // 2a2: aload 8
      // 2a4: aload 8
      // 2a6: invokevirtual z96.i55 ()F
      // 2a9: invokevirtual z96.uh3 (F)V
      // 2ac: aload 8
      // 2ae: areturn
   }

   public void fis(z96 var1, int var2) {
      int var4 = var1.ohd;
      dug var5 = this.az1.hrw(var1.ohd);
      var1.ohd = var2;
      int var10000 = OpaquePredicate.b();
      dug var6 = this.az1.hrw(var1.ohd);
      var1.rhh.vnf(new S07PacketRespawn(var1.ohd, var1.oay.rbk(), var1.oay.r7d().z28(), var1._am.tmw()));
      var5.k1e(var1);
      var1.ma9 = false;
      int var3 = var10000;
      this._dn(var1, var4, var5, var6);
      this.l_8(var1, var5);
      var1.rhh.ymx(var1.o2v, var1.kfp, var1.vbd, var1.x5k, var1.y2i);
      var1._am.nzt(var6);
      this.o9x(var1, var6);
      this.izd(var1);

      for (sdj var8 : var1.g5i()) {
         var1.rhh.vnf(new S1DPacketEntityEffect(var1.jwu(), var8));
         if (var3 == 0) {
            break;
         }
      }
   }

   public void _dn(EntityLivingBase param1, int param2, dug param3, dug param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wlx.b J
      // 003: ldc2_w 85934696854537
      // 006: lxor
      // 007: lstore 5
      // 009: aload 1
      // 00a: getfield EntityLivingBase.o2v D
      // 00d: dstore 8
      // 00f: invokestatic OpaquePredicate.b ()I
      // 012: aload 1
      // 013: getfield EntityLivingBase.vbd D
      // 016: dstore 10
      // 018: ldc2_w 8.0
      // 01b: dstore 12
      // 01d: istore 7
      // 01f: aload 1
      // 020: getfield EntityLivingBase.x5k F
      // 023: fstore 14
      // 025: aload 3
      // 026: getfield dug.e8t Luan;
      // 029: sipush 21538
      // 02c: ldc2_w 4553278144558400475
      // 02f: lload 5
      // 031: lxor
      // 032: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: nop
      // 038: invokevirtual uan.qek (Ljava/lang/String;)V
      // 03b: aload 1
      // 03c: getfield EntityLivingBase.ohd I
      // 03f: iload 7
      // 041: ifeq 0d7
      // 044: bipush -1
      // 045: if_icmpne 0cc
      // 048: goto 04f
      // 04b: invokestatic wlx.b (Loov;)Loov;
      // 04e: athrow
      // 04f: dload 8
      // 051: dload 12
      // 053: ddiv
      // 054: aload 4
      // 056: invokevirtual dug.fve ()Lw5i;
      // 059: invokevirtual w5i.rt1 ()D
      // 05c: ldc2_w 16.0
      // 05f: dadd
      // 060: aload 4
      // 062: invokevirtual dug.fve ()Lw5i;
      // 065: invokevirtual w5i.mb9 ()D
      // 068: ldc2_w 16.0
      // 06b: dsub
      // 06c: invokestatic fe6.lft (DDD)D
      // 06f: dstore 8
      // 071: dload 10
      // 073: dload 12
      // 075: ddiv
      // 076: aload 4
      // 078: invokevirtual dug.fve ()Lw5i;
      // 07b: invokevirtual w5i.jbu ()D
      // 07e: ldc2_w 16.0
      // 081: dadd
      // 082: aload 4
      // 084: invokevirtual dug.fve ()Lw5i;
      // 087: invokevirtual w5i.ah4 ()D
      // 08a: ldc2_w 16.0
      // 08d: dsub
      // 08e: invokestatic fe6.lft (DDD)D
      // 091: dstore 10
      // 093: aload 1
      // 094: dload 8
      // 096: aload 1
      // 097: getfield EntityLivingBase.kfp D
      // 09a: dload 10
      // 09c: aload 1
      // 09d: getfield EntityLivingBase.x5k F
      // 0a0: aload 1
      // 0a1: getfield EntityLivingBase.y2i F
      // 0a4: invokevirtual EntityLivingBase.x24 (DDDFF)V
      // 0a7: aload 1
      // 0a8: invokevirtual EntityLivingBase.gzr ()Z
      // 0ab: iload 7
      // 0ad: ifeq 1e0
      // 0b0: ifeq 1cc
      // 0b3: goto 0ba
      // 0b6: invokestatic wlx.b (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 3
      // 0bb: aload 1
      // 0bc: bipush 0
      // 0bd: invokevirtual dug.wu1 (Li2h;Z)V
      // 0c0: iload 7
      // 0c2: ifne 1cc
      // 0c5: goto 0cc
      // 0c8: invokestatic wlx.b (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 1
      // 0cd: getfield EntityLivingBase.ohd I
      // 0d0: goto 0d7
      // 0d3: invokestatic wlx.b (Loov;)Loov;
      // 0d6: athrow
      // 0d7: iload 7
      // 0d9: ifeq 16b
      // 0dc: ifne 163
      // 0df: goto 0e6
      // 0e2: invokestatic wlx.b (Loov;)Loov;
      // 0e5: athrow
      // 0e6: dload 8
      // 0e8: dload 12
      // 0ea: dmul
      // 0eb: aload 4
      // 0ed: invokevirtual dug.fve ()Lw5i;
      // 0f0: invokevirtual w5i.rt1 ()D
      // 0f3: ldc2_w 16.0
      // 0f6: dadd
      // 0f7: aload 4
      // 0f9: invokevirtual dug.fve ()Lw5i;
      // 0fc: invokevirtual w5i.mb9 ()D
      // 0ff: ldc2_w 16.0
      // 102: dsub
      // 103: invokestatic fe6.lft (DDD)D
      // 106: dstore 8
      // 108: dload 10
      // 10a: dload 12
      // 10c: dmul
      // 10d: aload 4
      // 10f: invokevirtual dug.fve ()Lw5i;
      // 112: invokevirtual w5i.jbu ()D
      // 115: ldc2_w 16.0
      // 118: dadd
      // 119: aload 4
      // 11b: invokevirtual dug.fve ()Lw5i;
      // 11e: invokevirtual w5i.ah4 ()D
      // 121: ldc2_w 16.0
      // 124: dsub
      // 125: invokestatic fe6.lft (DDD)D
      // 128: dstore 10
      // 12a: aload 1
      // 12b: dload 8
      // 12d: aload 1
      // 12e: getfield EntityLivingBase.kfp D
      // 131: dload 10
      // 133: aload 1
      // 134: getfield EntityLivingBase.x5k F
      // 137: aload 1
      // 138: getfield EntityLivingBase.y2i F
      // 13b: invokevirtual EntityLivingBase.x24 (DDDFF)V
      // 13e: aload 1
      // 13f: invokevirtual EntityLivingBase.gzr ()Z
      // 142: iload 7
      // 144: ifeq 1e0
      // 147: ifeq 1cc
      // 14a: goto 151
      // 14d: invokestatic wlx.b (Loov;)Loov;
      // 150: athrow
      // 151: aload 3
      // 152: aload 1
      // 153: bipush 0
      // 154: invokevirtual dug.wu1 (Li2h;Z)V
      // 157: iload 7
      // 159: ifne 1cc
      // 15c: goto 163
      // 15f: invokestatic wlx.b (Loov;)Loov;
      // 162: athrow
      // 163: iload 2
      // 164: goto 16b
      // 167: invokestatic wlx.b (Loov;)Loov;
      // 16a: athrow
      // 16b: bipush 1
      // 16c: if_icmpne 17b
      // 16f: aload 4
      // 171: invokevirtual dug.suq ()Lmew;
      // 174: astore 15
      // 176: iload 7
      // 178: ifne 182
      // 17b: aload 4
      // 17d: invokevirtual dug.tk1 ()Lmew;
      // 180: astore 15
      // 182: aload 15
      // 184: invokevirtual mew.getX ()I
      // 187: i2d
      // 188: dstore 8
      // 18a: aload 1
      // 18b: aload 15
      // 18d: invokevirtual mew.getY ()I
      // 190: i2d
      // 191: putfield EntityLivingBase.kfp D
      // 194: aload 15
      // 196: invokevirtual mew.getZ ()I
      // 199: i2d
      // 19a: dstore 10
      // 19c: aload 1
      // 19d: dload 8
      // 19f: aload 1
      // 1a0: getfield EntityLivingBase.kfp D
      // 1a3: dload 10
      // 1a5: ldc 90.0
      // 1a7: nop
      // 1a8: fconst_0
      // 1a9: invokevirtual EntityLivingBase.x24 (DDDFF)V
      // 1ac: aload 1
      // 1ad: invokevirtual EntityLivingBase.gzr ()Z
      // 1b0: iload 7
      // 1b2: ifeq 1e0
      // 1b5: ifeq 1cc
      // 1b8: goto 1bf
      // 1bb: invokestatic wlx.b (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 3
      // 1c0: aload 1
      // 1c1: bipush 0
      // 1c2: invokevirtual dug.wu1 (Li2h;Z)V
      // 1c5: goto 1cc
      // 1c8: invokestatic wlx.b (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 3
      // 1cd: getfield dug.e8t Luan;
      // 1d0: invokevirtual uan.uio ()V
      // 1d3: iload 7
      // 1d5: ifeq 26c
      // 1d8: iload 2
      // 1d9: goto 1e0
      // 1dc: invokestatic wlx.b (Loov;)Loov;
      // 1df: athrow
      // 1e0: bipush 1
      // 1e1: if_icmpeq 266
      // 1e4: aload 3
      // 1e5: getfield dug.e8t Luan;
      // 1e8: iload 7
      // 1ea: ifeq 263
      // 1ed: goto 1f4
      // 1f0: invokestatic wlx.b (Loov;)Loov;
      // 1f3: athrow
      // 1f4: sipush 16055
      // 1f7: ldc2_w 3988302608910543178
      // 1fa: lload 5
      // 1fc: lxor
      // 1fd: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: nop
      // 203: invokevirtual uan.qek (Ljava/lang/String;)V
      // 206: dload 8
      // 208: d2i
      // 209: ldc -29999872
      // 20b: nop
      // 20c: ldc 29999872
      // 20e: nop
      // 20f: invokestatic fe6.faa (III)I
      // 212: i2d
      // 213: dstore 8
      // 215: dload 10
      // 217: d2i
      // 218: ldc -29999872
      // 21a: nop
      // 21b: ldc 29999872
      // 21d: nop
      // 21e: invokestatic fe6.faa (III)I
      // 221: i2d
      // 222: dstore 10
      // 224: aload 1
      // 225: invokevirtual EntityLivingBase.gzr ()Z
      // 228: ifeq 25f
      // 22b: aload 1
      // 22c: dload 8
      // 22e: aload 1
      // 22f: getfield EntityLivingBase.kfp D
      // 232: dload 10
      // 234: aload 1
      // 235: getfield EntityLivingBase.x5k F
      // 238: aload 1
      // 239: getfield EntityLivingBase.y2i F
      // 23c: invokevirtual EntityLivingBase.x24 (DDDFF)V
      // 23f: aload 4
      // 241: invokevirtual dug.i4a ()Looh;
      // 244: aload 1
      // 245: fload 14
      // 247: invokevirtual ooh.kfs (Li2h;F)V
      // 24a: aload 4
      // 24c: aload 1
      // 24d: invokevirtual dug.xzq (Li2h;)Z
      // 250: pop
      // 251: aload 4
      // 253: aload 1
      // 254: bipush 0
      // 255: invokevirtual dug.wu1 (Li2h;Z)V
      // 258: goto 25f
      // 25b: invokestatic wlx.b (Loov;)Loov;
      // 25e: athrow
      // 25f: aload 3
      // 260: getfield dug.e8t Luan;
      // 263: invokevirtual uan.uio ()V
      // 266: aload 1
      // 267: aload 4
      // 269: invokevirtual EntityLivingBase.gj3 (Lt9d;)V
      // 26c: return
   }

   public void x0x() {
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
      // 05: dup
      // 06: getfield wlx.tub I
      // 09: bipush 1
      // 0a: iadd
      // 0b: iload 1
      // 0c: ifne 3b
      // 0f: dup_x1
      // 10: putfield wlx.tub I
      // 13: sipush 600
      // 16: if_icmple 3e
      // 19: goto 20
      // 1c: invokestatic wlx.b (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: new net/minecraft/network/play/server/S38PacketPlayerListItem
      // 24: dup
      // 25: getstatic net/minecraft/network/play/server/S38PacketPlayerListItem$a1f.qwp Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 28: aload 0
      // 29: getfield wlx.wbi Ljava/util/List;
      // 2c: invokespecial net/minecraft/network/play/server/S38PacketPlayerListItem.<init> (Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;Ljava/lang/Iterable;)V
      // 2f: invokevirtual wlx.v3l (Lmz2;)V
      // 32: aload 0
      // 33: bipush 0
      // 34: goto 3b
      // 37: invokestatic wlx.b (Loov;)Loov;
      // 3a: athrow
      // 3b: putfield wlx.tub I
      // 3e: return
   }

   public void v3l(mz2 var1) {
      int var2 = OpaquePredicate.b();
      int var3 = 0;

      while (var3 < this.wbi.size()) {
         ((z96)this.wbi.get(var3)).rhh.vnf(var1);
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public void qvv(mz2 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: aload 0
      // 0a: getfield wlx.wbi Ljava/util/List;
      // 0d: invokeinterface java/util/List.size ()I 1
      // 12: if_icmpge 50
      // 15: aload 0
      // 16: getfield wlx.wbi Ljava/util/List;
      // 19: iload 4
      // 1b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 20: checkcast z96
      // 23: astore 5
      // 25: iload 3
      // 26: ifne 4c
      // 29: aload 5
      // 2b: getfield z96.ohd I
      // 2e: iload 2
      // 2f: if_icmpne 49
      // 32: goto 39
      // 35: invokestatic wlx.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 5
      // 3b: getfield z96.rhh Lmlk;
      // 3e: aload 1
      // 3f: invokevirtual mlk.vnf (Lmz2;)V
      // 42: goto 49
      // 45: invokestatic wlx.b (Loov;)Loov;
      // 48: athrow
      // 49: iinc 4 1
      // 4c: iload 3
      // 4d: ifeq 07
      // 50: return
   }

   public void eiw(ha9 param1, ekw param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual ha9.ued ()Ln_0;
      // 08: astore 4
      // 0a: aload 4
      // 0c: iload 3
      // 0d: ifne 1c
      // 10: ifnull 76
      // 13: goto 1a
      // 16: invokestatic wlx.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 4
      // 1c: invokevirtual n_0.vsw ()Ljava/util/Collection;
      // 1f: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 24: astore 5
      // 26: aload 5
      // 28: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d: ifeq 76
      // 30: aload 5
      // 32: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37: checkcast java/lang/String
      // 3a: astore 6
      // 3c: aload 0
      // 3d: aload 6
      // 3f: invokevirtual wlx.f_q (Ljava/lang/String;)Lz96;
      // 42: astore 7
      // 44: aload 7
      // 46: iload 3
      // 47: ifne 56
      // 4a: ifnull 72
      // 4d: goto 54
      // 50: invokestatic wlx.b (Loov;)Loov;
      // 53: athrow
      // 54: aload 7
      // 56: iload 3
      // 57: ifne 6e
      // 5a: aload 1
      // 5b: if_acmpeq 72
      // 5e: goto 65
      // 61: invokestatic wlx.b (Loov;)Loov;
      // 64: athrow
      // 65: aload 7
      // 67: goto 6e
      // 6a: invokestatic wlx.b (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 2
      // 6f: invokevirtual z96.a0d (Lekw;)V
      // 72: iload 3
      // 73: ifeq 26
      // 76: return
   }

   public void nwk(ha9 param1, ekw param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual ha9.ued ()Ln_0;
      // 08: astore 4
      // 0a: iload 3
      // 0b: ifeq 26
      // 0e: aload 4
      // 10: ifnonnull 2a
      // 13: goto 1a
      // 16: invokestatic wlx.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 2
      // 1c: invokevirtual wlx.d3z (Lekw;)V
      // 1f: goto 26
      // 22: invokestatic wlx.b (Loov;)Loov;
      // 25: athrow
      // 26: iload 3
      // 27: ifne 74
      // 2a: bipush 0
      // 2b: istore 5
      // 2d: iload 5
      // 2f: aload 0
      // 30: getfield wlx.wbi Ljava/util/List;
      // 33: invokeinterface java/util/List.size ()I 1
      // 38: if_icmpge 74
      // 3b: aload 0
      // 3c: getfield wlx.wbi Ljava/util/List;
      // 3f: iload 5
      // 41: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 46: checkcast z96
      // 49: astore 6
      // 4b: iload 3
      // 4c: ifeq 70
      // 4f: aload 6
      // 51: invokevirtual z96.ued ()Ln_0;
      // 54: aload 4
      // 56: if_acmpeq 6d
      // 59: goto 60
      // 5c: invokestatic wlx.b (Loov;)Loov;
      // 5f: athrow
      // 60: aload 6
      // 62: aload 2
      // 63: invokevirtual z96.a0d (Lekw;)V
      // 66: goto 6d
      // 69: invokestatic wlx.b (Loov;)Loov;
      // 6c: athrow
      // 6d: iinc 5 1
      // 70: iload 3
      // 71: ifne 2d
      // 74: return
   }

   public String uuy(boolean var1) {
      long var2 = b ^ 104721315389834L;
      String var5 = "";
      ArrayList var6 = Lists.newArrayList(this.wbi);
      int var10000 = OpaquePredicate.b();
      int var7 = 0;
      int var4 = var10000;

      while (var7 < var6.size()) {
         label50: {
            label51: {
               label40: {
                  try {
                     var10000 = var7;
                     if (var4 == 0) {
                        break label51;
                     }

                     if (var7 <= 0) {
                        break label40;
                     }
                  } catch (oov var9) {
                     throw b(var9);
                  }

                  var5 = var5 + a<"r">(15383, 3141007205069192803L ^ var2);
               }

               var5 = var5 + ((z96)var6.get(var7)).noc();

               try {
                  if (var4 == 0) {
                     break label50;
                  }

                  var10000 = var1;
               } catch (oov var8) {
                  throw b(var8);
               }
            }

            if (var10000 != 0) {
               var5 = var5 + a<"r">(9663, 34092619926497228L ^ var2) + ((z96)var6.get(var7)).b_q().toString() + ")";
            }

            var7++;
         }

         if (var4 == 0) {
            break;
         }
      }

      return var5;
   }

   public String[] dlz() {
      String[] var2 = new String[this.wbi.size()];
      int var10000 = OpaquePredicate.b();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < this.wbi.size()) {
            try {
               var5 = var2;
               if (var1 == 0) {
                  break;
               }

               var2[var3] = ((z96)this.wbi.get(var3)).noc();
               var3++;
               if (var1 != 0) {
                  continue;
               }
            } catch (oov var4) {
               throw b(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public GameProfile[] kv7() {
      GameProfile[] var2 = new GameProfile[this.wbi.size()];
      int var10000 = OpaquePredicate.c();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < this.wbi.size()) {
            try {
               var5 = var2;
               if (var1 != 0) {
                  break;
               }

               var2[var3] = ((z96)this.wbi.get(var3)).x6l();
               var3++;
               if (var1 == 0) {
                  continue;
               }
            } catch (oov var4) {
               throw b(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public wxb w68() {
      return this.lmv;
   }

   public o85 _rf() {
      return this.bho;
   }

   public void y11(GameProfile var1) {
      this.em_.g7w(new wmb(var1, this.az1.v9t(), this.em_.gno(var1)));
   }

   public void azz(GameProfile var1) {
      this.em_.qwz(var1);
   }

   public boolean dsh(GameProfile param1) {
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
      // 05: getfield wlx.ver Z
      // 08: iload 2
      // 09: ifeq 51
      // 0c: ifeq 50
      // 0f: goto 16
      // 12: invokestatic wlx.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield wlx.em_ Lody;
      // 1a: aload 1
      // 1b: invokevirtual ody.vb_ (Ljava/lang/Object;)Z
      // 1e: iload 2
      // 1f: ifeq 51
      // 22: goto 29
      // 25: invokestatic wlx.b (Loov;)Loov;
      // 28: athrow
      // 29: ifne 50
      // 2c: goto 33
      // 2f: invokestatic wlx.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield wlx.gzg Lkgd;
      // 37: aload 1
      // 38: invokevirtual kgd.vb_ (Ljava/lang/Object;)Z
      // 3b: iload 2
      // 3c: ifeq 51
      // 3f: goto 46
      // 42: invokestatic wlx.b (Loov;)Loov;
      // 45: athrow
      // 46: ifeq 54
      // 49: goto 50
      // 4c: invokestatic wlx.b (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
   }

   public boolean sbc(GameProfile param1) {
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
      // 05: getfield wlx.em_ Lody;
      // 08: aload 1
      // 09: invokevirtual ody.vb_ (Ljava/lang/Object;)Z
      // 0c: iload 2
      // 0d: ifeq 97
      // 10: ifne 96
      // 13: goto 1a
      // 16: invokestatic wlx.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield wlx.az1 Lvr1;
      // 1e: invokevirtual vr1.a59 ()Z
      // 21: iload 2
      // 22: ifeq 88
      // 25: goto 2c
      // 28: invokestatic wlx.b (Loov;)Loov;
      // 2b: athrow
      // 2c: ifeq 7d
      // 2f: goto 36
      // 32: invokestatic wlx.b (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: getfield wlx.az1 Lvr1;
      // 3a: getfield vr1.p_y [Ldug;
      // 3d: bipush 0
      // 3e: aaload
      // 3f: invokevirtual dug.r7d ()Lcog;
      // 42: invokevirtual cog.aqu ()Z
      // 45: iload 2
      // 46: ifeq 88
      // 49: goto 50
      // 4c: invokestatic wlx.b (Loov;)Loov;
      // 4f: athrow
      // 50: ifeq 7d
      // 53: goto 5a
      // 56: invokestatic wlx.b (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield wlx.az1 Lvr1;
      // 5e: invokevirtual vr1.p4h ()Ljava/lang/String;
      // 61: aload 1
      // 62: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 65: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 68: iload 2
      // 69: ifeq 97
      // 6c: goto 73
      // 6f: invokestatic wlx.b (Loov;)Loov;
      // 72: athrow
      // 73: ifne 96
      // 76: goto 7d
      // 79: invokestatic wlx.b (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield wlx.vd5 Z
      // 81: goto 88
      // 84: invokestatic wlx.b (Loov;)Loov;
      // 87: athrow
      // 88: iload 2
      // 89: ifeq 97
      // 8c: ifeq 9a
      // 8f: goto 96
      // 92: invokestatic wlx.b (Loov;)Loov;
      // 95: athrow
      // 96: bipush 1
      // 97: goto 9b
      // 9a: bipush 0
      // 9b: ireturn
   }

   public z96 f_q(String param1) {
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
      // 05: getfield wlx.wbi Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 47
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast z96
      // 20: astore 4
      // 22: aload 4
      // 24: iload 2
      // 25: ifeq 42
      // 28: invokevirtual z96.noc ()Ljava/lang/String;
      // 2b: aload 1
      // 2c: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 2f: ifeq 43
      // 32: goto 39
      // 35: invokestatic wlx.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: goto 42
      // 3e: invokestatic wlx.b (Loov;)Loov;
      // 41: athrow
      // 42: areturn
      // 43: iload 2
      // 44: ifne 0e
      // 47: aconst_null
      // 48: areturn
   }

   public void dyz(double var1, double var3, double var5, double var7, int var9, mz2 var10) {
      this.zih((ha9)null, var1, var3, var5, var7, var9, var10);
   }

   public void zih(ha9 param1, double param2, double param4, double param6, double param8, int param10, mz2 param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 12
      // 05: bipush 0
      // 06: istore 13
      // 08: iload 13
      // 0a: aload 0
      // 0b: getfield wlx.wbi Ljava/util/List;
      // 0e: invokeinterface java/util/List.size ()I 1
      // 13: if_icmpge a5
      // 16: aload 0
      // 17: getfield wlx.wbi Ljava/util/List;
      // 1a: iload 13
      // 1c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21: checkcast z96
      // 24: astore 14
      // 26: iload 12
      // 28: ifne a0
      // 2b: aload 14
      // 2d: aload 1
      // 2e: if_acmpeq 9d
      // 31: goto 38
      // 34: invokestatic wlx.b (Loov;)Loov;
      // 37: athrow
      // 38: aload 14
      // 3a: getfield z96.ohd I
      // 3d: iload 10
      // 3f: if_icmpne 9d
      // 42: goto 49
      // 45: invokestatic wlx.b (Loov;)Loov;
      // 48: athrow
      // 49: dload 2
      // 4a: aload 14
      // 4c: getfield z96.o2v D
      // 4f: dsub
      // 50: dstore 15
      // 52: dload 4
      // 54: aload 14
      // 56: getfield z96.kfp D
      // 59: dsub
      // 5a: dstore 17
      // 5c: dload 6
      // 5e: aload 14
      // 60: getfield z96.vbd D
      // 63: dsub
      // 64: dstore 19
      // 66: iload 12
      // 68: ifne a0
      // 6b: dload 15
      // 6d: dload 15
      // 6f: dmul
      // 70: dload 17
      // 72: dload 17
      // 74: dmul
      // 75: dadd
      // 76: dload 19
      // 78: dload 19
      // 7a: dmul
      // 7b: dadd
      // 7c: dload 8
      // 7e: dload 8
      // 80: dmul
      // 81: dcmpg
      // 82: ifge 9d
      // 85: goto 8c
      // 88: invokestatic wlx.b (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 14
      // 8e: getfield z96.rhh Lmlk;
      // 91: aload 11
      // 93: invokevirtual mlk.vnf (Lmz2;)V
      // 96: goto 9d
      // 99: invokestatic wlx.b (Loov;)Loov;
      // 9c: athrow
      // 9d: iinc 13 1
      // a0: iload 12
      // a2: ifeq 08
      // a5: return
   }

   public void b8x() {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      while (var2 < this.wbi.size()) {
         this.vsg((z96)this.wbi.get(var2));
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   public void q3s(GameProfile var1) {
      this.gzg.g7w(new r1u(var1));
   }

   public void ubt(GameProfile var1) {
      this.gzg.qwz(var1);
   }

   public kgd l7f() {
      return this.gzg;
   }

   public String[] e3h() {
      return this.gzg.zim();
   }

   public ody mz1() {
      return this.em_;
   }

   public String[] f5p() {
      return this.em_.zim();
   }

   public void q2b() {
   }

   public void o9x(z96 param1, dug param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wlx.b J
      // 03: ldc2_w 50456938070187
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: getfield wlx.az1 Lvr1;
      // 0c: getfield vr1.p_y [Ldug;
      // 0f: bipush 0
      // 10: aaload
      // 11: invokevirtual dug.fve ()Lw5i;
      // 14: astore 6
      // 16: invokestatic OpaquePredicate.c ()I
      // 19: aload 1
      // 1a: getfield z96.rhh Lmlk;
      // 1d: new net/minecraft/network/play/server/S44PacketWorldBorder
      // 20: dup
      // 21: aload 6
      // 23: getstatic net/minecraft/network/play/server/S44PacketWorldBorder$yf2.pkv Lnet/minecraft/network/play/server/S44PacketWorldBorder$yf2;
      // 26: invokespecial net/minecraft/network/play/server/S44PacketWorldBorder.<init> (Lw5i;Lnet/minecraft/network/play/server/S44PacketWorldBorder$yf2;)V
      // 29: invokevirtual mlk.vnf (Lmz2;)V
      // 2c: istore 5
      // 2e: aload 1
      // 2f: getfield z96.rhh Lmlk;
      // 32: new net/minecraft/network/play/server/S03PacketTimeUpdate
      // 35: dup
      // 36: aload 2
      // 37: invokevirtual dug.p2b ()J
      // 3a: aload 2
      // 3b: invokevirtual dug.bq8 ()J
      // 3e: aload 2
      // 3f: invokevirtual dug.eir ()Lef9;
      // 42: sipush 9569
      // 45: ldc2_w 7176862393298339371
      // 48: lload 3
      // 49: lxor
      // 4a: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 53: invokespecial net/minecraft/network/play/server/S03PacketTimeUpdate.<init> (JJZ)V
      // 56: invokevirtual mlk.vnf (Lmz2;)V
      // 59: iload 5
      // 5b: ifne 98
      // 5e: aload 2
      // 5f: invokevirtual dug.xqu ()Z
      // 62: ifeq ad
      // 65: goto 6c
      // 68: invokestatic wlx.b (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 1
      // 6d: getfield z96.rhh Lmlk;
      // 70: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 73: dup
      // 74: bipush 1
      // 75: fconst_0
      // 76: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 79: invokevirtual mlk.vnf (Lmz2;)V
      // 7c: aload 1
      // 7d: getfield z96.rhh Lmlk;
      // 80: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 83: dup
      // 84: bipush 7
      // 86: aload 2
      // 87: fconst_1
      // 88: invokevirtual dug.bne (F)F
      // 8b: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 8e: invokevirtual mlk.vnf (Lmz2;)V
      // 91: goto 98
      // 94: invokestatic wlx.b (Loov;)Loov;
      // 97: athrow
      // 98: aload 1
      // 99: getfield z96.rhh Lmlk;
      // 9c: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 9f: dup
      // a0: bipush 8
      // a2: aload 2
      // a3: fconst_1
      // a4: invokevirtual dug.fnm (F)F
      // a7: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // aa: invokevirtual mlk.vnf (Lmz2;)V
      // ad: return
   }

   public void izd(z96 var1) {
      var1.u1s(var1.fv9);
      var1.e_g();
      var1.rhh.vnf(new S09PacketHeldItemChange(var1.up_.nb5));
   }

   public int bo7() {
      return this.wbi.size();
   }

   public int yci() {
      return this.blf;
   }

   public String[] fgs() {
      return this.az1.p_y[0].b4z().l64().zww();
   }

   public void i75(boolean var1) {
      this.ver = var1;
   }

   public List ge5(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 3
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 0
      // 08: getfield wlx.wbi Ljava/util/List;
      // 0b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 10: astore 4
      // 12: istore 2
      // 13: aload 4
      // 15: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a: ifeq 54
      // 1d: aload 4
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: checkcast z96
      // 27: astore 5
      // 29: aload 5
      // 2b: invokevirtual z96.zgv ()Ljava/lang/String;
      // 2e: aload 1
      // 2f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 32: iload 2
      // 33: ifeq 4f
      // 36: ifeq 50
      // 39: goto 40
      // 3c: invokestatic wlx.b (Loov;)Loov;
      // 3f: athrow
      // 40: aload 3
      // 41: aload 5
      // 43: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 48: goto 4f
      // 4b: invokestatic wlx.b (Loov;)Loov;
      // 4e: athrow
      // 4f: pop
      // 50: iload 2
      // 51: ifne 13
      // 54: aload 3
      // 55: areturn
   }

   public int pci() {
      return this.w_t;
   }

   public vr1 sdn() {
      return this.az1;
   }

   public bdo u2u() {
      return null;
   }

   public void zg6(h50$f05 var1) {
      this.dd6 = var1;
   }

   private void ycf(z96 param1, z96 param2, OpaquePredicate param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifeq 16
      // 0b: ifnull 28
      // 0e: goto 15
      // 11: invokestatic wlx.b (Loov;)Loov;
      // 14: athrow
      // 15: aload 1
      // 16: getfield z96._am Lrsh;
      // 19: aload 2
      // 1a: getfield z96._am Lrsh;
      // 1d: invokevirtual rsh.tmw ()Lh50$f05;
      // 20: invokevirtual rsh.ppu (Lh50$f05;)V
      // 23: iload 4
      // 25: ifne 48
      // 28: aload 0
      // 29: getfield wlx.dd6 Lh50$f05;
      // 2c: ifnull 48
      // 2f: goto 36
      // 32: invokestatic wlx.b (Loov;)Loov;
      // 35: athrow
      // 36: aload 1
      // 37: getfield z96._am Lrsh;
      // 3a: aload 0
      // 3b: getfield wlx.dd6 Lh50$f05;
      // 3e: invokevirtual rsh.ppu (Lh50$f05;)V
      // 41: goto 48
      // 44: invokestatic wlx.b (Loov;)Loov;
      // 47: athrow
      // 48: aload 1
      // 49: getfield z96._am Lrsh;
      // 4c: aload 3
      // 4d: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 50: invokevirtual cog.pcx ()Lh50$f05;
      // 53: invokevirtual rsh.asu (Lh50$f05;)V
      // 56: return
   }

   public void ruw(boolean var1) {
      this.vd5 = var1;
   }

   public void hva() {
      long var1 = b ^ 24375098123692L;
      int var3 = OpaquePredicate.c();
      int var4 = 0;

      while (var4 < this.wbi.size()) {
         ((z96)this.wbi.get(var4)).rhh.wr4(a<"r">(23670, 1649294775146175017L ^ var1));
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public void fkx(ekw var1, boolean var2) {
      int var3 = OpaquePredicate.c();

      byte var10000;
      label22: {
         label21: {
            try {
               this.az1.a0d(var1);
               var10000 = var2;
               if (var3 != 0) {
                  break label22;
               }

               if (var2 != 0) {
                  break label21;
               }
            } catch (oov var5) {
               throw b(var5);
            }

            var10000 = 0;
            break label22;
         }

         var10000 = 1;
      }

      byte var4 = (byte)var10000;
      this.v3l(new S02PacketChat(var1, var4));
   }

   public void d3z(ekw var1) {
      this.fkx(var1, true);
   }

   public dc5 g0p(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wlx.b J
      // 003: ldc2_w 57078272442895
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual ha9.b_q ()Ljava/util/UUID;
      // 011: astore 5
      // 013: aload 5
      // 015: iload 4
      // 017: ifeq 037
      // 01a: ifnonnull 02c
      // 01d: goto 024
      // 020: invokestatic wlx.b (Loov;)Loov;
      // 023: athrow
      // 024: aconst_null
      // 025: goto 03a
      // 028: invokestatic wlx.b (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield wlx.r4g Ljava/util/Map;
      // 030: aload 5
      // 032: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 037: checkcast dc5
      // 03a: astore 6
      // 03c: aload 6
      // 03e: iload 4
      // 040: ifeq 145
      // 043: ifnonnull 143
      // 046: goto 04d
      // 049: invokestatic wlx.b (Loov;)Loov;
      // 04c: athrow
      // 04d: new java/io/File
      // 050: dup
      // 051: aload 0
      // 052: getfield wlx.az1 Lvr1;
      // 055: bipush 0
      // 056: invokevirtual vr1.hrw (I)Ldug;
      // 059: invokevirtual dug.b4z ()Lhe6;
      // 05c: invokeinterface he6.w62 ()Ljava/io/File; 1
      // 061: sipush 23586
      // 064: ldc2_w 730702609203609030
      // 067: lload 2
      // 068: lxor
      // 069: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: nop
      // 06f: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 072: astore 7
      // 074: new java/io/File
      // 077: dup
      // 078: aload 7
      // 07a: new java/lang/StringBuilder
      // 07d: dup
      // 07e: invokespecial java/lang/StringBuilder.<init> ()V
      // 081: aload 5
      // 083: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: sipush 11425
      // 08c: ldc2_w 5972412865151585614
      // 08f: lload 2
      // 090: lxor
      // 091: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: nop
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0a0: astore 8
      // 0a2: aload 8
      // 0a4: iload 4
      // 0a6: ifeq 142
      // 0a9: invokevirtual java/io/File.exists ()Z
      // 0ac: ifne 121
      // 0af: goto 0b6
      // 0b2: invokestatic wlx.b (Loov;)Loov;
      // 0b5: athrow
      // 0b6: new java/io/File
      // 0b9: dup
      // 0ba: aload 7
      // 0bc: new java/lang/StringBuilder
      // 0bf: dup
      // 0c0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c3: aload 1
      // 0c4: invokevirtual ha9.noc ()Ljava/lang/String;
      // 0c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ca: sipush 7955
      // 0cd: ldc2_w 2156140546467888877
      // 0d0: lload 2
      // 0d1: lxor
      // 0d2: invokedynamic r (IJ)Ljava/lang/String; bsm=wlx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: nop
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0de: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0e1: astore 9
      // 0e3: aload 9
      // 0e5: iload 4
      // 0e7: ifeq 142
      // 0ea: invokevirtual java/io/File.exists ()Z
      // 0ed: ifeq 121
      // 0f0: goto 0f7
      // 0f3: invokestatic wlx.b (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 9
      // 0f9: iload 4
      // 0fb: ifeq 142
      // 0fe: goto 105
      // 101: invokestatic wlx.b (Loov;)Loov;
      // 104: athrow
      // 105: invokevirtual java/io/File.isFile ()Z
      // 108: ifeq 121
      // 10b: goto 112
      // 10e: invokestatic wlx.b (Loov;)Loov;
      // 111: athrow
      // 112: aload 9
      // 114: aload 8
      // 116: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 119: pop
      // 11a: goto 121
      // 11d: invokestatic wlx.b (Loov;)Loov;
      // 120: athrow
      // 121: new dc5
      // 124: dup
      // 125: aload 0
      // 126: getfield wlx.az1 Lvr1;
      // 129: aload 8
      // 12b: invokespecial dc5.<init> (Lvr1;Ljava/io/File;)V
      // 12e: astore 6
      // 130: aload 6
      // 132: invokevirtual dc5.r_t ()V
      // 135: aload 0
      // 136: getfield wlx.r4g Ljava/util/Map;
      // 139: aload 5
      // 13b: aload 6
      // 13d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 142: pop
      // 143: aload 6
      // 145: areturn
   }

   public void b09(int param1) {
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
      // 05: iload 1
      // 06: putfield wlx.w_t I
      // 09: aload 0
      // 0a: getfield wlx.az1 Lvr1;
      // 0d: getfield vr1.p_y [Ldug;
      // 10: iload 2
      // 11: ifeq 2c
      // 14: ifnull 68
      // 17: goto 1e
      // 1a: invokestatic wlx.b (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield wlx.az1 Lvr1;
      // 22: getfield vr1.p_y [Ldug;
      // 25: goto 2c
      // 28: invokestatic wlx.b (Loov;)Loov;
      // 2b: athrow
      // 2c: astore 3
      // 2d: aload 3
      // 2e: arraylength
      // 2f: istore 4
      // 31: bipush 0
      // 32: istore 5
      // 34: iload 5
      // 36: iload 4
      // 38: if_icmpge 68
      // 3b: aload 3
      // 3c: iload 5
      // 3e: aaload
      // 3f: astore 6
      // 41: iload 2
      // 42: ifeq 64
      // 45: aload 6
      // 47: ifnull 61
      // 4a: goto 51
      // 4d: invokestatic wlx.b (Loov;)Loov;
      // 50: athrow
      // 51: aload 6
      // 53: invokevirtual dug.gez ()Ley1;
      // 56: iload 1
      // 57: invokevirtual ey1.ke1 (I)V
      // 5a: goto 61
      // 5d: invokestatic wlx.b (Loov;)Loov;
      // 60: athrow
      // 61: iinc 5 1
      // 64: iload 2
      // 65: ifne 34
      // 68: return
   }

   public List tjx() {
      return this.wbi;
   }

   public z96 fm4(UUID var1) {
      return (z96)this.sf2.get(var1);
   }

   public boolean EntityPlayerSP(GameProfile var1) {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-643517361560363097L, 5179655346051944048L, MethodHandles.lookup().lookupClass()).a(7179783728947L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 118374462400936L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[33];
      int var5 = 0;
      String var4 = "Î´û]ÅM\u0086ôë!X\u0097v¿\u0086\u0091à_Dui16Á®\u0001a\u0093Rt,\u0001\u0088³\u008aËY!\u009eC4t\u0089ô\u009eæÂ¼(q\u0087§ï\u0002Ñûþ6\u0081\u0083\u0081t\u0001ç\u001e yÌú:\u000fËÂ\u0084\u000f\u0092½j×ø\u0007[Û\b'qo\u009b\u0080XæPb{\\Gìi¿ßÇ9zµ\u0080;\u0014Ú\u0017\u008b\u0088É¸UlVÓóG½Xùù'\nW©àÞMð\r\u001d;Íe\u0018\u008b\u000eÅX\b¾\u001e5õw»C96ÚQ\u0085M\u0089¤\u009c3¨EÓx¼wb²\t2Ý(\u0001{Wà!î\tHãNÏRï\u007f\u009cºZs¦ôÔ\"ÓOÑX@á\u0096:òLñ?>þ>3\u0018\u0016©\u000eF\rPz±\u008eÊ\u0019áùv\u0095\u0018l\u008eãá)\u0013\u0086|\u008cè\u0099ÓâÓI\u0099?¼\u0081\u007fvO\u001cÉ*@DjV²ùqçÙçoð%¢Ö´h\"tÂ\u000e80=\u007f\u0080Ö<FnRú|ön@qw]\u0082}\u0099?WEóç\u000e(ø.´í\u0014Ñ\u0003<\rf\u0081\u0090ai¾\u007f\u0010À[+§C\"[Â½ø\u0003×\u000e¯3¡(\u0099¬@5üs3\b°\u0007\n \\O¨iö-\\JV\u0089\u0004t\u008a5D\\¬þ±\u0005,\u008cËõJh%\r(\u0012Z\u001aqzZ·ò5P\u0095øU¬'\u0096MAÐ·¹öÄIc\u0091xOï\u0004\u0080\u0000Â[\u0019D\u009fÉ\u000ba\u0018Ã¶\u0006G©Qy]\n¼Èq@+~G\u0084\\>\u0085îÁÝâ ëË\u0084\t\u0093¹\u0015´2ÍÔÍáÀâôôíÐSÞãî\u0007~yßÙ\\\u008dÖÓ\u0010þ\u0080âßcýG ;9òo\u0018\u0094lÓ(Ù]\u0087N´j½\u0096øVÁ·xä[\u001d¬á\u0019\u001aÒ\u009cÐÖ,%z¢ª¿ÛÄ\u009d/x\u000fÞ«\rµ\u0010Ï2\u001b¦\nð6&&úà\u0006±Ìêê0r°ÃÔvý\u001e\u008dGH\r\u000f[ÅÔsÔ\u0090\u0087æ\u00adÏH\t¯ô1oA\u0096¯ßc\t\u0017\u0001ñýó3\u0002{B\u008eªp\u0081]\u0010\u0095J2ðüñS\u0087\u007fò!\t,q+\u009d\u0018Óþ\u0080·ëæ³rª7\u0005°ù5òreâ\u001f»M2º\u009b\u00103²®Ä\u001c³8\u0019\u0094\u001f\u008c\f\n\fÌ:(8\u0005°S\r\u0001Ô\u008c\u0093\u0088<\u0090\u0090\u0089Jê°L}Ô\u009aJÂu}\u00898\u0006#e.ës=\u009d¹§·\u0081â\u0010\rº\u0007Ú\u0086î%±¦ú\u0003D\u00adãö¼@XM³ý\fêÌò`2\u0098^¿\u0016äõ\u0001\u0015;áí1,\u0012X>\u0084F\u001bµ\u000f\u0005®+<p\"¦\u001bø\u00807Ñ\u0010\u008e\u00ad\u0089ÞU\u0016º{°Uw\u0001±Ô\u0098´ûÛNc8³|\u0096L±kö¸mÂþ\u00adí~_õÿÙ1\u001e,Ç{Ï\u009c¯P\u008aÿDm6¨\u000e$¿|\u00938Mtßðv7ÃÆ\u008dÃ\u00165Åz·!æ\u0010Wg\" \u001e\u0080\u0085E\nÃ\u000e©eÛZ\u009b\u0010Ôk\u0097qBéqJO\u0017¬ä\u0019sUÛ\u0010F$Á5Æ®þß\u009a\u0080¨gÜ\"\u0091Â8ÛO\u0087þ?Ùy\u0088\u008b\u008f\u0010Ub\u001bøª\u0093¢¢\u001fJ_U&\u0083Õ`/\u009eî\n\u009a=Ñò\u009eS\u0098ä\r8\n2 F)ÕÇàX\u0014\u0001³¦\u0093% \u0090Pç\u0014äâ\b*8í7§Î}Ý<G¥\u000e®;Lâ«ëtÁº\u0086\u0014I\u001a\u0010\u008fí\u0013\u008cÁ\u0098uÂ,kµDÈH\u0090Ý \u00050õ\u009c>[\u001cãgþ«\u0085ÛgÙe\u0004\u009bÂ\u008eVFË\u0091Üe\u0007 \bÍ%\u009c8_Ö\u0001\u009b\u008f?ÄmÊîe\u001bµíÐÛæ\u0083©ÒñúXÝBÔ\u008f(Ø\u008e¤r¨ü\u00906\u0081¡û¹\u0004Uj\u0080Ï8Øú><ÝÜÆE1× î9Ë\u0000ô>\u008e÷\u009f\u001e\u000b\u000f\u0001º¾\u0082\u001aVãÓ¥^\u001eÚg\u00adÎt¢\nÝ,\u0010]\u000b\u0089R!\u0091g\u008a|sââR\u0089\u0015<";
      int var6 = "Î´û]ÅM\u0086ôë!X\u0097v¿\u0086\u0091à_Dui16Á®\u0001a\u0093Rt,\u0001\u0088³\u008aËY!\u009eC4t\u0089ô\u009eæÂ¼(q\u0087§ï\u0002Ñûþ6\u0081\u0083\u0081t\u0001ç\u001e yÌú:\u000fËÂ\u0084\u000f\u0092½j×ø\u0007[Û\b'qo\u009b\u0080XæPb{\\Gìi¿ßÇ9zµ\u0080;\u0014Ú\u0017\u008b\u0088É¸UlVÓóG½Xùù'\nW©àÞMð\r\u001d;Íe\u0018\u008b\u000eÅX\b¾\u001e5õw»C96ÚQ\u0085M\u0089¤\u009c3¨EÓx¼wb²\t2Ý(\u0001{Wà!î\tHãNÏRï\u007f\u009cºZs¦ôÔ\"ÓOÑX@á\u0096:òLñ?>þ>3\u0018\u0016©\u000eF\rPz±\u008eÊ\u0019áùv\u0095\u0018l\u008eãá)\u0013\u0086|\u008cè\u0099ÓâÓI\u0099?¼\u0081\u007fvO\u001cÉ*@DjV²ùqçÙçoð%¢Ö´h\"tÂ\u000e80=\u007f\u0080Ö<FnRú|ön@qw]\u0082}\u0099?WEóç\u000e(ø.´í\u0014Ñ\u0003<\rf\u0081\u0090ai¾\u007f\u0010À[+§C\"[Â½ø\u0003×\u000e¯3¡(\u0099¬@5üs3\b°\u0007\n \\O¨iö-\\JV\u0089\u0004t\u008a5D\\¬þ±\u0005,\u008cËõJh%\r(\u0012Z\u001aqzZ·ò5P\u0095øU¬'\u0096MAÐ·¹öÄIc\u0091xOï\u0004\u0080\u0000Â[\u0019D\u009fÉ\u000ba\u0018Ã¶\u0006G©Qy]\n¼Èq@+~G\u0084\\>\u0085îÁÝâ ëË\u0084\t\u0093¹\u0015´2ÍÔÍáÀâôôíÐSÞãî\u0007~yßÙ\\\u008dÖÓ\u0010þ\u0080âßcýG ;9òo\u0018\u0094lÓ(Ù]\u0087N´j½\u0096øVÁ·xä[\u001d¬á\u0019\u001aÒ\u009cÐÖ,%z¢ª¿ÛÄ\u009d/x\u000fÞ«\rµ\u0010Ï2\u001b¦\nð6&&úà\u0006±Ìêê0r°ÃÔvý\u001e\u008dGH\r\u000f[ÅÔsÔ\u0090\u0087æ\u00adÏH\t¯ô1oA\u0096¯ßc\t\u0017\u0001ñýó3\u0002{B\u008eªp\u0081]\u0010\u0095J2ðüñS\u0087\u007fò!\t,q+\u009d\u0018Óþ\u0080·ëæ³rª7\u0005°ù5òreâ\u001f»M2º\u009b\u00103²®Ä\u001c³8\u0019\u0094\u001f\u008c\f\n\fÌ:(8\u0005°S\r\u0001Ô\u008c\u0093\u0088<\u0090\u0090\u0089Jê°L}Ô\u009aJÂu}\u00898\u0006#e.ës=\u009d¹§·\u0081â\u0010\rº\u0007Ú\u0086î%±¦ú\u0003D\u00adãö¼@XM³ý\fêÌò`2\u0098^¿\u0016äõ\u0001\u0015;áí1,\u0012X>\u0084F\u001bµ\u000f\u0005®+<p\"¦\u001bø\u00807Ñ\u0010\u008e\u00ad\u0089ÞU\u0016º{°Uw\u0001±Ô\u0098´ûÛNc8³|\u0096L±kö¸mÂþ\u00adí~_õÿÙ1\u001e,Ç{Ï\u009c¯P\u008aÿDm6¨\u000e$¿|\u00938Mtßðv7ÃÆ\u008dÃ\u00165Åz·!æ\u0010Wg\" \u001e\u0080\u0085E\nÃ\u000e©eÛZ\u009b\u0010Ôk\u0097qBéqJO\u0017¬ä\u0019sUÛ\u0010F$Á5Æ®þß\u009a\u0080¨gÜ\"\u0091Â8ÛO\u0087þ?Ùy\u0088\u008b\u008f\u0010Ub\u001bøª\u0093¢¢\u001fJ_U&\u0083Õ`/\u009eî\n\u009a=Ñò\u009eS\u0098ä\r8\n2 F)ÕÇàX\u0014\u0001³¦\u0093% \u0090Pç\u0014äâ\b*8í7§Î}Ý<G¥\u000e®;Lâ«ëtÁº\u0086\u0014I\u001a\u0010\u008fí\u0013\u008cÁ\u0098uÂ,kµDÈH\u0090Ý \u00050õ\u009c>[\u001cãgþ«\u0085ÛgÙe\u0004\u009bÂ\u008eVFË\u0091Üe\u0007 \bÍ%\u009c8_Ö\u0001\u009b\u008f?ÄmÊîe\u001bµíÐÛæ\u0083©ÒñúXÝBÔ\u008f(Ø\u008e¤r¨ü\u00906\u0081¡û¹\u0004Uj\u0080Ï8Øú><ÝÜÆE1× î9Ë\u0000ô>\u008e÷\u009f\u001e\u000b\u000f\u0001º¾\u0082\u001aVãÓ¥^\u001eÚg\u00adÎt¢\nÝ,\u0010]\u000b\u0089R!\u0091g\u008a|sââR\u0089\u0015<"
         .length();
      char var3 = '0';
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
                     c = var7;
                     d = new String[33];
                     efo = new File(a<"r">(31818, 3741455332682528267L ^ var9));
                     n1e = new File(a<"r">(17593, 5628838807402335991L ^ var9));
                     whg = new File(a<"r">(1770, 8214921501032418487L ^ var9));
                     d0c = new File(a<"r">(24813, 3150544253056117426L ^ var9));
                     tn9 = LogManager.getLogger();
                     x6g = new SimpleDateFormat(a<"r">(2917, 1369589272385159459L ^ var9));
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

                  var4 = "T\u0005ívÝ\u0093\u0013Çµ\u0004¸\u009eMÜ'5H\u0099Ï\t|SÑáñ U\u008e®\u0017$Õ»kd³¹+Hïö^¾ôH¿O\u009eÝòMµU\u0005w±\u008a\u000f\u009bÈ \u001cäéÝU\u008cÔ\u0094ªp,3\u008e\u00885pË\r]ÝÉ\u0081\\½ \u0003¶ý";
                  var6 = "T\u0005ívÝ\u0093\u0013Çµ\u0004¸\u009eMÜ'5H\u0099Ï\t|SÑáñ U\u008e®\u0017$Õ»kd³¹+Hïö^¾ôH¿O\u009eÝòMµU\u0005w±\u008a\u000f\u009bÈ \u001cäéÝU\u008cÔ\u0094ªp,3\u008e\u00885pË\r]ÝÉ\u0081\\½ \u0003¶ý"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25569;
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
            throw new RuntimeException("wlx", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("wlx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
