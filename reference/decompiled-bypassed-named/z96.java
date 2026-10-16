import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
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
import net.minecraft.network.play.client.C15PacketClientSettings;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S0APacketUseBed;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.network.play.server.S1EPacketRemoveEntityEffect;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.network.play.server.S2EPacketCloseWindow;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.network.play.server.S31PacketWindowProperty;
import net.minecraft.network.play.server.S36PacketSignEditorOpen;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.play.server.S42PacketCombatEvent;
import net.minecraft.network.play.server.S42PacketCombatEvent$cwk;
import net.minecraft.network.play.server.S48PacketResourcePackSend;
import net.minecraft.tileentity.TileEntitySign;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class z96 extends ha9 implements flv {
   private static final Logger f5f;
   private String jfs;
   public mlk rhh;
   public final vr1 paw;
   public final rsh _am;
   public double yj0;
   public double pgx;
   public final List u8j;
   private final List wkc;
   private final dc5 pif;
   private float tp9;
   private float e3r;
   private int xat;
   private boolean hxf;
   private int c3w;
   private int cjg;
   private ha9$c4q e2d;
   private boolean to2;
   private long waw;
   private EntityLivingBase k_6;
   private int jst;
   public boolean _d1;
   public int f3h;
   public boolean m92;
   private static final long d;
   private static final String[] g;
   private static final String[] q;
   private static final Map r = new HashMap(13);

   public z96(vr1 param1, dug param2, GameProfile param3, rsh param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z96.d J
      // 003: ldc2_w 107384040806854
      // 006: lxor
      // 007: lstore 5
      // 009: aload 0
      // 00a: aload 2
      // 00b: aload 3
      // 00c: invokespecial ha9.<init> (Lt9d;Lcom/mojang/authlib/GameProfile;)V
      // 00f: aload 0
      // 010: sipush 22111
      // 013: ldc2_w 1506892602030806778
      // 016: lload 5
      // 018: lxor
      // 019: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: nop
      // 01f: putfield z96.jfs Ljava/lang/String;
      // 022: aload 0
      // 023: invokestatic com/google/common/collect/Lists.newLinkedList ()Ljava/util/LinkedList;
      // 026: putfield z96.u8j Ljava/util/List;
      // 029: aload 0
      // 02a: invokestatic com/google/common/collect/Lists.newLinkedList ()Ljava/util/LinkedList;
      // 02d: putfield z96.wkc Ljava/util/List;
      // 030: invokestatic OpaquePredicate.b ()I
      // 033: aload 0
      // 034: ldc 1.4E-45
      // 036: nop
      // 037: putfield z96.tp9 F
      // 03a: istore 7
      // 03c: aload 0
      // 03d: ldc -1.0E8
      // 03f: nop
      // 040: putfield z96.e3r F
      // 043: aload 0
      // 044: ldc -99999999
      // 046: nop
      // 047: putfield z96.xat I
      // 04a: aload 0
      // 04b: bipush 1
      // 04c: putfield z96.hxf Z
      // 04f: aload 0
      // 050: ldc -99999999
      // 052: nop
      // 053: putfield z96.c3w I
      // 056: aload 0
      // 057: bipush 60
      // 059: putfield z96.cjg I
      // 05c: aload 0
      // 05d: bipush 1
      // 05e: putfield z96.to2 Z
      // 061: aload 0
      // 062: invokestatic java/lang/System.currentTimeMillis ()J
      // 065: putfield z96.waw J
      // 068: aload 0
      // 069: aconst_null
      // 06a: putfield z96.k_6 Li2h;
      // 06d: aload 4
      // 06f: aload 0
      // 070: putfield rsh.rpl Lz96;
      // 073: aload 0
      // 074: aload 4
      // 076: putfield z96._am Lrsh;
      // 079: aload 2
      // 07a: invokevirtual dug.suq ()Lmew;
      // 07d: astore 8
      // 07f: iload 7
      // 081: ifeq 138
      // 084: aload 2
      // 085: getfield dug.vzz Lupn;
      // 088: invokevirtual upn.qyc ()Z
      // 08b: ifne 122
      // 08e: goto 095
      // 091: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: aload 2
      // 096: invokevirtual dug.r7d ()Lcog;
      // 099: invokevirtual cog.pcx ()Lh50$f05;
      // 09c: getstatic h50$f05.uq7 Lh50$f05;
      // 09f: if_acmpeq 122
      // 0a2: goto 0a9
      // 0a5: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: bipush 5
      // 0aa: aload 1
      // 0ab: invokevirtual vr1.efz ()I
      // 0ae: bipush 6
      // 0b0: isub
      // 0b1: invokestatic java/lang/Math.max (II)I
      // 0b4: istore 9
      // 0b6: aload 2
      // 0b7: invokevirtual dug.fve ()Lw5i;
      // 0ba: aload 8
      // 0bc: invokevirtual mew.getX ()I
      // 0bf: i2d
      // 0c0: aload 8
      // 0c2: invokevirtual mew.getZ ()I
      // 0c5: i2d
      // 0c6: invokevirtual w5i._6r (DD)D
      // 0c9: invokestatic fe6.jqf (D)I
      // 0cc: istore 10
      // 0ce: iload 10
      // 0d0: iload 9
      // 0d2: iload 7
      // 0d4: ifeq 0f4
      // 0d7: if_icmpge 0e5
      // 0da: goto 0e1
      // 0dd: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: iload 10
      // 0e3: istore 9
      // 0e5: iload 10
      // 0e7: iload 7
      // 0e9: ifeq 0f8
      // 0ec: bipush 1
      // 0ed: goto 0f4
      // 0f0: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: if_icmpgt 0fa
      // 0f7: bipush 1
      // 0f8: istore 9
      // 0fa: aload 2
      // 0fb: aload 8
      // 0fd: aload 0
      // 0fe: getfield z96.z2d Ljava/util/Random;
      // 101: iload 9
      // 103: bipush 2
      // 104: imul
      // 105: invokevirtual java/util/Random.nextInt (I)I
      // 108: iload 9
      // 10a: isub
      // 10b: bipush 0
      // 10c: aload 0
      // 10d: getfield z96.z2d Ljava/util/Random;
      // 110: iload 9
      // 112: bipush 2
      // 113: imul
      // 114: invokevirtual java/util/Random.nextInt (I)I
      // 117: iload 9
      // 119: isub
      // 11a: invokevirtual mew.ec4 (III)Lmew;
      // 11d: invokevirtual dug.pnv (Lmew;)Lmew;
      // 120: astore 8
      // 122: aload 0
      // 123: aload 1
      // 124: putfield z96.paw Lvr1;
      // 127: aload 0
      // 128: aload 1
      // 129: invokevirtual vr1.wh3 ()Lwlx;
      // 12c: aload 0
      // 12d: invokevirtual wlx.g0p (Lha9;)Ldc5;
      // 130: putfield z96.pif Ldc5;
      // 133: aload 0
      // 134: fconst_0
      // 135: putfield z96.nr7 F
      // 138: aload 0
      // 139: aload 8
      // 13b: fconst_0
      // 13c: fconst_0
      // 13d: invokevirtual z96.kva (Lmew;FF)V
      // 140: aload 2
      // 141: aload 0
      // 142: aload 0
      // 143: invokevirtual z96.aaw ()Lnh4;
      // 146: invokevirtual dug.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 149: invokeinterface java/util/List.isEmpty ()Z 1
      // 14e: ifne 186
      // 151: aload 0
      // 152: iload 7
      // 154: ifeq 170
      // 157: getfield z96.kfp D
      // 15a: ldc2_w 255.0
      // 15d: dcmpg
      // 15e: ifge 186
      // 161: goto 168
      // 164: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: aload 0
      // 169: goto 170
      // 16c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: aload 0
      // 171: getfield z96.o2v D
      // 174: aload 0
      // 175: getfield z96.kfp D
      // 178: dconst_1
      // 179: dadd
      // 17a: aload 0
      // 17b: getfield z96.vbd D
      // 17e: invokevirtual z96.m6_ (DDD)V
      // 181: iload 7
      // 183: ifne 140
      // 186: return
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
      // 00: getstatic z96.d J
      // 03: ldc2_w 127155886758546
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial ha9.cjb (Lbdo;)V
      // 12: aload 1
      // 13: sipush 19067
      // 16: ldc2_w 6167580724480739728
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: bipush 99
      // 23: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 26: iload 4
      // 28: ifne 42
      // 2b: ifeq 81
      // 2e: goto 35
      // 31: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: invokestatic vr1._0v ()Lvr1;
      // 38: invokevirtual vr1.tn9 ()Z
      // 3b: goto 42
      // 3e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: ifeq 5e
      // 45: aload 0
      // 46: getfield z96._am Lrsh;
      // 49: invokestatic vr1._0v ()Lvr1;
      // 4c: invokevirtual vr1._r_ ()Lh50$f05;
      // 4f: invokevirtual rsh.ppu (Lh50$f05;)V
      // 52: iload 4
      // 54: ifeq 81
      // 57: goto 5e
      // 5a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield z96._am Lrsh;
      // 62: aload 1
      // 63: sipush 19067
      // 66: ldc2_w 6167580724480739728
      // 69: lload 2
      // 6a: lxor
      // 6b: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 74: invokestatic h50$f05.e9x (I)Lh50$f05;
      // 77: invokevirtual rsh.ppu (Lh50$f05;)V
      // 7a: goto 81
      // 7d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = d ^ 5547154306617L;
      super.srs(var1);
      var1.iin(d<"r">(27540, 996198508031100107L ^ var2), this._am.tmw().xzh());
   }

   @Override
   public void odj(int var1) {
      super.odj(var1);
      this.c3w = -1;
   }

   @Override
   public void twf(int var1) {
      super.twf(var1);
      this.c3w = -1;
   }

   public void mw4() {
      this.daw.c_j(this);
   }

   @Override
   public void hub() {
      super.hub();
      this.rhh.vnf(new S42PacketCombatEvent(this.ii6(), S42PacketCombatEvent$cwk.dsq));
   }

   @Override
   public void ypu() {
      super.ypu();
      this.rhh.vnf(new S42PacketCombatEvent(this.ii6(), S42PacketCombatEvent$cwk.ks3));
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
      // 000: aload 0
      // 001: getfield z96._am Lrsh;
      // 004: invokevirtual rsh.gwt ()V
      // 007: invokestatic OpaquePredicate.c ()I
      // 00a: aload 0
      // 00b: dup
      // 00c: getfield z96.cjg I
      // 00f: bipush 1
      // 010: isub
      // 011: putfield z96.cjg I
      // 014: istore 1
      // 015: aload 0
      // 016: getfield z96.qqi I
      // 019: iload 1
      // 01a: ifne 046
      // 01d: ifle 038
      // 020: goto 027
      // 023: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: aload 0
      // 028: dup
      // 029: getfield z96.qqi I
      // 02c: bipush 1
      // 02d: isub
      // 02e: putfield z96.qqi I
      // 031: goto 038
      // 034: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: aload 0
      // 039: getfield z96.daw L_jc;
      // 03c: invokevirtual _jc.n4z ()V
      // 03f: aload 0
      // 040: getfield z96.oay Lt9d;
      // 043: getfield OpaquePredicate.v0f Z
      // 046: iload 1
      // 047: ifne 08d
      // 04a: ifne 084
      // 04d: goto 054
      // 050: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 0
      // 055: getfield z96.daw L_jc;
      // 058: aload 0
      // 059: invokevirtual _jc.spj (Lha9;)Z
      // 05c: iload 1
      // 05d: ifne 08d
      // 060: goto 067
      // 063: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: ifne 084
      // 06a: goto 071
      // 06d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 0
      // 072: invokevirtual z96.gph ()V
      // 075: aload 0
      // 076: aload 0
      // 077: getfield z96.fv9 L_jc;
      // 07a: putfield z96.daw L_jc;
      // 07d: goto 084
      // 080: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: aload 0
      // 085: getfield z96.wkc Ljava/util/List;
      // 088: invokeinterface java/util/List.isEmpty ()Z 1
      // 08d: ifne 10a
      // 090: aload 0
      // 091: getfield z96.wkc Ljava/util/List;
      // 094: invokeinterface java/util/List.size ()I 1
      // 099: ldc 2147483647
      // 09b: nop
      // 09c: goto 0a3
      // 09f: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: invokestatic java/lang/Math.min (II)I
      // 0a6: istore 2
      // 0a7: iload 2
      // 0a8: newarray 10
      // 0aa: astore 3
      // 0ab: aload 0
      // 0ac: getfield z96.wkc Ljava/util/List;
      // 0af: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b4: astore 4
      // 0b6: bipush 0
      // 0b7: iload 1
      // 0b8: ifne 11e
      // 0bb: istore 5
      // 0bd: aload 4
      // 0bf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c4: ifeq 0f7
      // 0c7: iload 5
      // 0c9: iload 2
      // 0ca: iload 1
      // 0cb: ifne 0a3
      // 0ce: if_icmpge 0f7
      // 0d1: aload 3
      // 0d2: iload 5
      // 0d4: iinc 5 1
      // 0d7: aload 4
      // 0d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0de: checkcast java/lang/Integer
      // 0e1: invokevirtual java/lang/Integer.intValue ()I
      // 0e4: iastore
      // 0e5: aload 4
      // 0e7: invokeinterface java/util/Iterator.remove ()V 1
      // 0ec: iload 1
      // 0ed: ifeq 0bd
      // 0f0: goto 0f7
      // 0f3: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield z96.rhh Lmlk;
      // 0fb: new net/minecraft/network/play/server/S13PacketDestroyEntities
      // 0fe: dup
      // 0ff: aload 3
      // 100: invokespecial net/minecraft/network/play/server/S13PacketDestroyEntities.<init> ([I)V
      // 103: invokevirtual mlk.vnf (Lmz2;)V
      // 106: iload 1
      // 107: ifeq 084
      // 10a: aload 0
      // 10b: iload 1
      // 10c: ifne 301
      // 10f: getfield z96.u8j Ljava/util/List;
      // 112: invokeinterface java/util/List.isEmpty ()Z 1
      // 117: goto 11e
      // 11a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: ifne 2fd
      // 121: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 124: astore 2
      // 125: aload 0
      // 126: getfield z96.u8j Ljava/util/List;
      // 129: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 12e: astore 3
      // 12f: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 132: astore 4
      // 134: aload 3
      // 135: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13a: ifeq 22d
      // 13d: aload 2
      // 13e: invokeinterface java/util/List.size ()I 1
      // 143: iload 1
      // 144: ifne 233
      // 147: bipush 10
      // 149: iload 1
      // 14a: ifne 24f
      // 14d: goto 154
      // 150: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: if_icmpge 22d
      // 157: goto 15e
      // 15a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aload 3
      // 15f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 164: checkcast h2f
      // 167: astore 5
      // 169: aload 5
      // 16b: ifnull 21c
      // 16e: aload 0
      // 16f: getfield z96.oay Lt9d;
      // 172: iload 1
      // 173: ifne 1a4
      // 176: goto 17d
      // 179: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: new mew
      // 180: dup
      // 181: aload 5
      // 183: getfield h2f.jnd I
      // 186: bipush 4
      // 187: ishl
      // 188: bipush 0
      // 189: aload 5
      // 18b: getfield h2f.km5 I
      // 18e: bipush 4
      // 18f: ishl
      // 190: invokespecial mew.<init> (III)V
      // 193: invokevirtual OpaquePredicate.xjm (Lmew;)Z
      // 196: ifeq 229
      // 199: goto 1a0
      // 19c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield z96.oay Lt9d;
      // 1a4: aload 5
      // 1a6: getfield h2f.jnd I
      // 1a9: aload 5
      // 1ab: getfield h2f.km5 I
      // 1ae: invokevirtual OpaquePredicate.o5h (II)Ltts;
      // 1b1: astore 6
      // 1b3: aload 6
      // 1b5: invokevirtual tts.sac ()Z
      // 1b8: iload 1
      // 1b9: ifne 211
      // 1bc: ifeq 218
      // 1bf: goto 1c6
      // 1c2: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: aload 2
      // 1c7: aload 6
      // 1c9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ce: pop
      // 1cf: aload 4
      // 1d1: aload 0
      // 1d2: getfield z96.oay Lt9d;
      // 1d5: checkcast dug
      // 1d8: aload 5
      // 1da: getfield h2f.jnd I
      // 1dd: bipush 16
      // 1df: imul
      // 1e0: bipush 0
      // 1e1: aload 5
      // 1e3: getfield h2f.km5 I
      // 1e6: bipush 16
      // 1e8: imul
      // 1e9: aload 5
      // 1eb: getfield h2f.jnd I
      // 1ee: bipush 16
      // 1f0: imul
      // 1f1: bipush 16
      // 1f3: iadd
      // 1f4: sipush 256
      // 1f7: aload 5
      // 1f9: getfield h2f.km5 I
      // 1fc: bipush 16
      // 1fe: imul
      // 1ff: bipush 16
      // 201: iadd
      // 202: invokevirtual dug._12 (IIIIII)Ljava/util/List;
      // 205: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 20a: goto 211
      // 20d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: pop
      // 212: aload 3
      // 213: invokeinterface java/util/Iterator.remove ()V 1
      // 218: iload 1
      // 219: ifeq 229
      // 21c: aload 3
      // 21d: invokeinterface java/util/Iterator.remove ()V 1
      // 222: goto 229
      // 225: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 228: athrow
      // 229: iload 1
      // 22a: ifeq 134
      // 22d: aload 2
      // 22e: invokeinterface java/util/List.isEmpty ()Z 1
      // 233: iload 1
      // 234: ifne 24e
      // 237: ifne 2fd
      // 23a: goto 241
      // 23d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: aload 2
      // 242: invokeinterface java/util/List.size ()I 1
      // 247: goto 24e
      // 24a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24d: athrow
      // 24e: bipush 1
      // 24f: if_icmpne 279
      // 252: aload 0
      // 253: getfield z96.rhh Lmlk;
      // 256: new net/minecraft/network/play/server/S21PacketChunkData
      // 259: dup
      // 25a: aload 2
      // 25b: bipush 0
      // 25c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 261: checkcast tts
      // 264: bipush 1
      // 265: ldc 65535
      // 267: nop
      // 268: invokespecial net/minecraft/network/play/server/S21PacketChunkData.<init> (Ltts;ZI)V
      // 26b: invokevirtual mlk.vnf (Lmz2;)V
      // 26e: iload 1
      // 26f: ifeq 28f
      // 272: goto 279
      // 275: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 278: athrow
      // 279: aload 0
      // 27a: getfield z96.rhh Lmlk;
      // 27d: new net/minecraft/network/play/server/S26PacketMapChunkBulk
      // 280: dup
      // 281: aload 2
      // 282: invokespecial net/minecraft/network/play/server/S26PacketMapChunkBulk.<init> (Ljava/util/List;)V
      // 285: invokevirtual mlk.vnf (Lmz2;)V
      // 288: goto 28f
      // 28b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28e: athrow
      // 28f: aload 4
      // 291: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 296: astore 5
      // 298: aload 5
      // 29a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29f: ifeq 2c3
      // 2a2: aload 5
      // 2a4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a9: checkcast pyk
      // 2ac: astore 6
      // 2ae: aload 0
      // 2af: aload 6
      // 2b1: invokespecial z96.kuk (Lpyk;)V
      // 2b4: iload 1
      // 2b5: ifne 2cb
      // 2b8: iload 1
      // 2b9: ifeq 298
      // 2bc: goto 2c3
      // 2bf: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c2: athrow
      // 2c3: aload 2
      // 2c4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2c9: astore 5
      // 2cb: aload 5
      // 2cd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d2: ifeq 2fd
      // 2d5: aload 5
      // 2d7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2dc: checkcast tts
      // 2df: astore 6
      // 2e1: aload 0
      // 2e2: iload 1
      // 2e3: ifne 301
      // 2e6: invokevirtual z96.b88 ()Ldug;
      // 2e9: invokevirtual dug.fp4 ()Lqpc;
      // 2ec: aload 0
      // 2ed: aload 6
      // 2ef: invokevirtual qpc._46 (Lz96;Ltts;)V
      // 2f2: iload 1
      // 2f3: ifeq 2cb
      // 2f6: goto 2fd
      // 2f9: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fc: athrow
      // 2fd: aload 0
      // 2fe: invokevirtual z96.qqz ()Li2h;
      // 301: astore 2
      // 302: aload 2
      // 303: iload 1
      // 304: ifne 31a
      // 307: aload 0
      // 308: if_acmpeq 37c
      // 30b: goto 312
      // 30e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 311: athrow
      // 312: aload 2
      // 313: goto 31a
      // 316: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 319: athrow
      // 31a: invokevirtual EntityLivingBase.gzr ()Z
      // 31d: iload 1
      // 31e: ifne 374
      // 321: ifne 33b
      // 324: goto 32b
      // 327: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: aload 0
      // 32c: aload 0
      // 32d: invokevirtual z96.cm6 (Li2h;)V
      // 330: iload 1
      // 331: ifeq 37c
      // 334: goto 33b
      // 337: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33a: athrow
      // 33b: aload 0
      // 33c: aload 2
      // 33d: getfield EntityLivingBase.o2v D
      // 340: aload 2
      // 341: getfield EntityLivingBase.kfp D
      // 344: aload 2
      // 345: getfield EntityLivingBase.vbd D
      // 348: aload 2
      // 349: getfield EntityLivingBase.x5k F
      // 34c: aload 2
      // 34d: getfield EntityLivingBase.y2i F
      // 350: invokevirtual z96.xe8 (DDDFF)V
      // 353: aload 0
      // 354: getfield z96.paw Lvr1;
      // 357: invokevirtual vr1.wh3 ()Lwlx;
      // 35a: aload 0
      // 35b: invokevirtual wlx.xgj (Lz96;)V
      // 35e: aload 0
      // 35f: iload 1
      // 360: ifne 378
      // 363: goto 36a
      // 366: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 369: athrow
      // 36a: invokevirtual z96.hzv ()Z
      // 36d: goto 374
      // 370: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 373: athrow
      // 374: ifeq 37c
      // 377: aload 0
      // 378: aload 0
      // 379: invokevirtual z96.cm6 (Li2h;)V
      // 37c: return
   }

   public void ja4() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z96.d J
      // 003: ldc2_w 58307538793448
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial ha9.xx_ ()V
      // 010: bipush 0
      // 011: istore 4
      // 013: iload 4
      // 015: aload 0
      // 016: getfield z96.up_ Ljnq;
      // 019: invokevirtual jnq.opt ()I
      // 01c: if_icmpge 0a4
      // 01f: aload 0
      // 020: getfield z96.up_ Ljnq;
      // 023: iload 4
      // 025: invokevirtual jnq.ibn (I)Lerg;
      // 028: astore 5
      // 02a: iload 3
      // 02b: ifne 13f
      // 02e: iload 3
      // 02f: ifne 0a0
      // 032: goto 039
      // 035: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: aload 5
      // 03b: ifnull 09d
      // 03e: goto 045
      // 041: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: aload 5
      // 047: invokevirtual erg.gn1 ()Lu7m;
      // 04a: iload 3
      // 04b: ifne 06e
      // 04e: goto 055
      // 051: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: invokevirtual u7m.r5i ()Z
      // 058: ifeq 09d
      // 05b: goto 062
      // 05e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: aload 5
      // 064: invokevirtual erg.gn1 ()Lu7m;
      // 067: goto 06e
      // 06a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: checkcast wdh
      // 071: aload 5
      // 073: aload 0
      // 074: getfield z96.oay Lt9d;
      // 077: aload 0
      // 078: invokevirtual wdh.bdn (Lerg;Lt9d;Lha9;)Lmz2;
      // 07b: astore 6
      // 07d: iload 3
      // 07e: ifne 0a0
      // 081: aload 6
      // 083: ifnull 09d
      // 086: goto 08d
      // 089: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield z96.rhh Lmlk;
      // 091: aload 6
      // 093: invokevirtual mlk.vnf (Lmz2;)V
      // 096: goto 09d
      // 099: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: iinc 4 1
      // 0a0: iload 3
      // 0a1: ifeq 013
      // 0a4: aload 0
      // 0a5: iload 3
      // 0a6: ifne 140
      // 0a9: invokevirtual z96.i55 ()F
      // 0ac: aload 0
      // 0ad: getfield z96.e3r F
      // 0b0: fcmpl
      // 0b1: ifne 105
      // 0b4: goto 0bb
      // 0b7: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: iload 3
      // 0bd: ifne 140
      // 0c0: goto 0c7
      // 0c3: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: getfield z96.xat I
      // 0ca: aload 0
      // 0cb: getfield z96.kbo Lwkk;
      // 0ce: invokevirtual wkk.f1i ()I
      // 0d1: if_icmpne 105
      // 0d4: goto 0db
      // 0d7: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield z96.kbo Lwkk;
      // 0df: invokevirtual wkk.n88 ()F
      // 0e2: fconst_0
      // 0e3: fcmpl
      // 0e4: iload 3
      // 0e5: ifne 0fa
      // 0e8: goto 0ef
      // 0eb: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: ifne 0fd
      // 0f2: goto 0f9
      // 0f5: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: bipush 1
      // 0fa: goto 0fe
      // 0fd: bipush 0
      // 0fe: aload 0
      // 0ff: getfield z96.hxf Z
      // 102: if_icmpeq 15f
      // 105: aload 0
      // 106: getfield z96.rhh Lmlk;
      // 109: new net/minecraft/network/play/server/S06PacketUpdateHealth
      // 10c: dup
      // 10d: aload 0
      // 10e: invokevirtual z96.i55 ()F
      // 111: aload 0
      // 112: getfield z96.kbo Lwkk;
      // 115: invokevirtual wkk.f1i ()I
      // 118: aload 0
      // 119: getfield z96.kbo Lwkk;
      // 11c: invokevirtual wkk.n88 ()F
      // 11f: invokespecial net/minecraft/network/play/server/S06PacketUpdateHealth.<init> (FIF)V
      // 122: invokevirtual mlk.vnf (Lmz2;)V
      // 125: aload 0
      // 126: aload 0
      // 127: invokevirtual z96.i55 ()F
      // 12a: putfield z96.e3r F
      // 12d: aload 0
      // 12e: aload 0
      // 12f: getfield z96.kbo Lwkk;
      // 132: invokevirtual wkk.f1i ()I
      // 135: putfield z96.xat I
      // 138: goto 13f
      // 13b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: aload 0
      // 140: aload 0
      // 141: getfield z96.kbo Lwkk;
      // 144: invokevirtual wkk.n88 ()F
      // 147: fconst_0
      // 148: fcmpl
      // 149: iload 3
      // 14a: ifne 158
      // 14d: ifne 15b
      // 150: goto 157
      // 153: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: bipush 1
      // 158: goto 15c
      // 15b: bipush 0
      // 15c: putfield z96.hxf Z
      // 15f: aload 0
      // 160: invokevirtual z96.i55 ()F
      // 163: aload 0
      // 164: invokevirtual z96._xk ()F
      // 167: fadd
      // 168: aload 0
      // 169: getfield z96.tp9 F
      // 16c: fcmpl
      // 16d: iload 3
      // 16e: ifne 1dd
      // 171: ifeq 1d9
      // 174: goto 17b
      // 177: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: aload 0
      // 17c: aload 0
      // 17d: invokevirtual z96.i55 ()F
      // 180: aload 0
      // 181: invokevirtual z96._xk ()F
      // 184: fadd
      // 185: putfield z96.tp9 F
      // 188: aload 0
      // 189: invokevirtual z96.cjt ()Luci;
      // 18c: getstatic z0w.hno Lz0w;
      // 18f: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // 192: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 197: astore 4
      // 199: aload 4
      // 19b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a0: ifeq 1d9
      // 1a3: aload 4
      // 1a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1aa: checkcast sa6
      // 1ad: astore 5
      // 1af: aload 0
      // 1b0: invokevirtual z96.cjt ()Luci;
      // 1b3: aload 0
      // 1b4: invokevirtual z96.noc ()Ljava/lang/String;
      // 1b7: aload 5
      // 1b9: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 1bc: bipush 1
      // 1bd: anewarray 22
      // 1c0: dup
      // 1c1: bipush 0
      // 1c2: aload 0
      // 1c3: aastore
      // 1c4: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 1c7: invokevirtual r11.ler (Ljava/util/List;)V
      // 1ca: iload 3
      // 1cb: ifne 218
      // 1ce: iload 3
      // 1cf: ifeq 199
      // 1d2: goto 1d9
      // 1d5: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: getfield z96.nk0 I
      // 1dd: aload 0
      // 1de: getfield z96.c3w I
      // 1e1: iload 3
      // 1e2: ifne 220
      // 1e5: if_icmpeq 218
      // 1e8: goto 1ef
      // 1eb: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: aload 0
      // 1f0: aload 0
      // 1f1: getfield z96.nk0 I
      // 1f4: putfield z96.c3w I
      // 1f7: aload 0
      // 1f8: getfield z96.rhh Lmlk;
      // 1fb: new net/minecraft/network/play/server/S1FPacketSetExperience
      // 1fe: dup
      // 1ff: aload 0
      // 200: getfield z96.ey9 F
      // 203: aload 0
      // 204: getfield z96.nk0 I
      // 207: aload 0
      // 208: getfield z96.op5 I
      // 20b: invokespecial net/minecraft/network/play/server/S1FPacketSetExperience.<init> (FII)V
      // 20e: invokevirtual mlk.vnf (Lmz2;)V
      // 211: goto 218
      // 214: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: aload 0
      // 219: getfield z96.g25 I
      // 21c: bipush 20
      // 21e: irem
      // 21f: bipush 5
      // 220: imul
      // 221: iload 3
      // 222: ifne 24b
      // 225: ifne 252
      // 228: goto 22f
      // 22b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: aload 0
      // 230: iload 3
      // 231: ifne 24f
      // 234: goto 23b
      // 237: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: invokevirtual z96._m3 ()Ldc5;
      // 23e: getstatic y8d._50 Ll7l;
      // 241: invokevirtual dc5.ktg (Ll7l;)Z
      // 244: goto 24b
      // 247: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24a: athrow
      // 24b: ifne 252
      // 24e: aload 0
      // 24f: invokevirtual z96.xe0 ()V
      // 252: goto 291
      // 255: astore 4
      // 257: aload 4
      // 259: sipush 17963
      // 25c: ldc2_w 3063191369584749730
      // 25f: lload 1
      // 260: lxor
      // 261: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: nop
      // 267: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 26a: astore 5
      // 26c: aload 5
      // 26e: sipush 20495
      // 271: ldc2_w 4444165784140200605
      // 274: lload 1
      // 275: lxor
      // 276: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: nop
      // 27c: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 27f: astore 6
      // 281: aload 0
      // 282: aload 6
      // 284: invokevirtual z96.gfa (Lwsc;)V
      // 287: new oov
      // 28a: dup
      // 28b: aload 5
      // 28d: invokespecial oov.<init> (Le1i;)V
      // 290: athrow
      // 291: return
   }

   public void xe0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield z96.oay Lt9d;
      // 004: new mew
      // 007: dup
      // 008: aload 0
      // 009: getfield z96.o2v D
      // 00c: invokestatic fe6.jqf (D)I
      // 00f: bipush 0
      // 010: aload 0
      // 011: getfield z96.vbd D
      // 014: invokestatic fe6.jqf (D)I
      // 017: invokespecial mew.<init> (III)V
      // 01a: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 01d: astore 2
      // 01e: aload 2
      // 01f: getfield gyu.jcq Ljava/lang/String;
      // 022: astore 3
      // 023: invokestatic OpaquePredicate.c ()I
      // 026: aload 0
      // 027: invokevirtual z96._m3 ()Ldc5;
      // 02a: getstatic y8d._50 Ll7l;
      // 02d: invokevirtual dc5.xna (L_ss;)Llhm;
      // 030: checkcast tm0
      // 033: astore 4
      // 035: istore 1
      // 036: aload 4
      // 038: iload 1
      // 039: ifne 05e
      // 03c: ifnonnull 05c
      // 03f: goto 046
      // 042: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 0
      // 047: invokevirtual z96._m3 ()Ldc5;
      // 04a: getstatic y8d._50 Ll7l;
      // 04d: new tm0
      // 050: dup
      // 051: invokespecial tm0.<init> ()V
      // 054: invokevirtual dc5.guw (L_ss;Llhm;)Llhm;
      // 057: checkcast tm0
      // 05a: astore 4
      // 05c: aload 4
      // 05e: aload 3
      // 05f: invokevirtual tm0.add (Ljava/lang/Object;)Z
      // 062: pop
      // 063: aload 0
      // 064: invokevirtual z96._m3 ()Ldc5;
      // 067: getstatic y8d._50 Ll7l;
      // 06a: invokevirtual dc5.ha1 (Ll7l;)Z
      // 06d: iload 1
      // 06e: ifne 092
      // 071: ifeq 13f
      // 074: goto 07b
      // 077: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: aload 4
      // 07d: iload 1
      // 07e: ifne 0a7
      // 081: goto 088
      // 084: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: invokevirtual tm0.size ()I
      // 08b: goto 092
      // 08e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: getstatic gyu.pll Ljava/util/Set;
      // 095: invokeinterface java/util/Set.size ()I 1
      // 09a: if_icmplt 13f
      // 09d: getstatic gyu.pll Ljava/util/Set;
      // 0a0: goto 0a7
      // 0a3: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: invokestatic com/google/common/collect/Sets.newHashSet (Ljava/lang/Iterable;)Ljava/util/HashSet;
      // 0aa: astore 5
      // 0ac: aload 4
      // 0ae: invokevirtual tm0.iterator ()Ljava/util/Iterator;
      // 0b1: astore 6
      // 0b3: aload 6
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 127
      // 0bd: aload 6
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: checkcast java/lang/String
      // 0c7: astore 7
      // 0c9: aload 5
      // 0cb: iload 1
      // 0cc: ifne 129
      // 0cf: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d4: astore 8
      // 0d6: aload 8
      // 0d8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0dd: ifeq 116
      // 0e0: aload 8
      // 0e2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e7: checkcast gyu
      // 0ea: astore 9
      // 0ec: aload 9
      // 0ee: getfield gyu.jcq Ljava/lang/String;
      // 0f1: aload 7
      // 0f3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f6: iload 1
      // 0f7: ifne 11d
      // 0fa: ifeq 112
      // 0fd: goto 104
      // 100: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 8
      // 106: invokeinterface java/util/Iterator.remove ()V 1
      // 10b: goto 112
      // 10e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: iload 1
      // 113: ifeq 0d6
      // 116: aload 5
      // 118: invokeinterface java/util/Set.isEmpty ()Z 1
      // 11d: ifeq 123
      // 120: goto 127
      // 123: iload 1
      // 124: ifeq 0b3
      // 127: aload 5
      // 129: invokeinterface java/util/Set.isEmpty ()Z 1
      // 12e: ifeq 13f
      // 131: aload 0
      // 132: getstatic y8d._50 Ll7l;
      // 135: invokevirtual z96.aex (L_ss;)V
      // 138: goto 13f
      // 13b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: return
   }

   @Override
   public void owu(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z96.d J
      // 003: ldc2_w 98958842849966
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield z96.oay Lt9d;
      // 011: invokevirtual OpaquePredicate.eir ()Lef9;
      // 014: sipush 545
      // 017: ldc2_w 4456364764147528165
      // 01a: lload 2
      // 01b: lxor
      // 01c: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: nop
      // 022: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 025: iload 4
      // 027: ifeq 10a
      // 02a: ifeq 0e6
      // 02d: goto 034
      // 030: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: invokevirtual z96.ued ()Ln_0;
      // 038: astore 5
      // 03a: aload 5
      // 03c: iload 4
      // 03e: ifeq 04d
      // 041: ifnull 0ce
      // 044: goto 04b
      // 047: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: aload 5
      // 04d: invokevirtual n_0.aej ()Ln_0$ajs;
      // 050: getstatic n_0$ajs.yyy Ln_0$ajs;
      // 053: iload 4
      // 055: ifeq 071
      // 058: if_acmpeq 0ce
      // 05b: goto 062
      // 05e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: aload 5
      // 064: invokevirtual n_0.aej ()Ln_0$ajs;
      // 067: getstatic n_0$ajs.koh Ln_0$ajs;
      // 06a: goto 071
      // 06d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: iload 4
      // 073: ifeq 0ad
      // 076: if_acmpne 09e
      // 079: goto 080
      // 07c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: aload 0
      // 081: getfield z96.paw Lvr1;
      // 084: invokevirtual vr1.wh3 ()Lwlx;
      // 087: aload 0
      // 088: aload 0
      // 089: invokevirtual z96.ii6 ()Lw0s;
      // 08c: invokevirtual w0s.bus ()Lekw;
      // 08f: invokevirtual wlx.eiw (Lha9;Lekw;)V
      // 092: iload 4
      // 094: ifne 0e6
      // 097: goto 09e
      // 09a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 5
      // 0a0: invokevirtual n_0.aej ()Ln_0$ajs;
      // 0a3: getstatic n_0$ajs.jpm Ln_0$ajs;
      // 0a6: goto 0ad
      // 0a9: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: if_acmpne 0e6
      // 0b0: aload 0
      // 0b1: getfield z96.paw Lvr1;
      // 0b4: invokevirtual vr1.wh3 ()Lwlx;
      // 0b7: aload 0
      // 0b8: aload 0
      // 0b9: invokevirtual z96.ii6 ()Lw0s;
      // 0bc: invokevirtual w0s.bus ()Lekw;
      // 0bf: invokevirtual wlx.nwk (Lha9;Lekw;)V
      // 0c2: iload 4
      // 0c4: ifne 0e6
      // 0c7: goto 0ce
      // 0ca: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield z96.paw Lvr1;
      // 0d2: invokevirtual vr1.wh3 ()Lwlx;
      // 0d5: aload 0
      // 0d6: invokevirtual z96.ii6 ()Lw0s;
      // 0d9: invokevirtual w0s.bus ()Lekw;
      // 0dc: invokevirtual wlx.d3z (Lekw;)V
      // 0df: goto 0e6
      // 0e2: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: getfield z96.oay Lt9d;
      // 0ea: iload 4
      // 0ec: ifeq 11f
      // 0ef: invokevirtual OpaquePredicate.eir ()Lef9;
      // 0f2: sipush 20252
      // 0f5: ldc2_w 4563685445376376025
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 103: goto 10a
      // 106: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: ifne 11b
      // 10d: aload 0
      // 10e: getfield z96.up_ Ljnq;
      // 111: invokevirtual jnq._v_ ()V
      // 114: goto 11b
      // 117: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: aload 0
      // 11c: getfield z96.oay Lt9d;
      // 11f: invokevirtual OpaquePredicate.fgp ()Luci;
      // 122: getstatic z0w.a4z Lz0w;
      // 125: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // 128: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 12d: astore 5
      // 12f: aload 5
      // 131: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 136: ifeq 163
      // 139: aload 5
      // 13b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 140: checkcast sa6
      // 143: astore 6
      // 145: aload 0
      // 146: iload 4
      // 148: ifeq 167
      // 14b: invokevirtual z96.cjt ()Luci;
      // 14e: aload 0
      // 14f: invokevirtual z96.noc ()Ljava/lang/String;
      // 152: aload 6
      // 154: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 157: astore 7
      // 159: aload 7
      // 15b: invokevirtual r11.nvd ()V
      // 15e: iload 4
      // 160: ifne 12f
      // 163: aload 0
      // 164: invokevirtual z96.gy0 ()Lg_3;
      // 167: astore 5
      // 169: iload 4
      // 16b: ifeq 1c3
      // 16e: aload 5
      // 170: ifnull 1ae
      // 173: goto 17a
      // 176: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: getstatic y65._n6 Ljava/util/Map;
      // 17d: aload 5
      // 17f: invokestatic y65.duj (Li2h;)I
      // 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 185: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 18a: checkcast y65$p2a
      // 18d: astore 6
      // 18f: aload 6
      // 191: ifnull 1a4
      // 194: aload 0
      // 195: aload 6
      // 197: getfield y65$p2a.qsl L_ss;
      // 19a: invokevirtual z96.aex (L_ss;)V
      // 19d: goto 1a4
      // 1a0: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: aload 5
      // 1a6: aload 0
      // 1a7: aload 0
      // 1a8: getfield z96.yv8 I
      // 1ab: invokevirtual Entity.lfi (Li2h;I)V
      // 1ae: aload 0
      // 1af: getstatic l9p.ir0 L_ss;
      // 1b2: invokevirtual z96.aex (L_ss;)V
      // 1b5: aload 0
      // 1b6: getstatic l9p.ygo L_ss;
      // 1b9: invokevirtual z96._rr (L_ss;)V
      // 1bc: aload 0
      // 1bd: invokevirtual z96.ii6 ()Lw0s;
      // 1c0: invokevirtual w0s.llu ()V
      // 1c3: return
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z96.d J
      // 003: ldc2_w 94698890727721
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: aload 1
      // 00f: invokevirtual z96.nss (Lofh;)Z
      // 012: iload 5
      // 014: ifne 02e
      // 017: ifeq 027
      // 01a: goto 021
      // 01d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: bipush 0
      // 022: ireturn
      // 023: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: aload 0
      // 028: getfield z96.paw Lvr1;
      // 02b: invokevirtual vr1.s5d ()Z
      // 02e: iload 5
      // 030: ifne 048
      // 033: ifeq 086
      // 036: goto 03d
      // 039: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 0
      // 03e: invokespecial z96.aab ()Z
      // 041: goto 048
      // 044: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: iload 5
      // 04a: ifne 073
      // 04d: ifeq 086
      // 050: goto 057
      // 053: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: sipush 27743
      // 05a: ldc2_w 425829822115324942
      // 05d: lload 3
      // 05e: lxor
      // 05f: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: nop
      // 065: aload 1
      // 066: getfield ofh.rfm Ljava/lang/String;
      // 069: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06c: goto 073
      // 06f: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: iload 5
      // 075: ifne 083
      // 078: ifeq 086
      // 07b: goto 082
      // 07e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: bipush 1
      // 083: goto 087
      // 086: bipush 0
      // 087: istore 6
      // 089: iload 6
      // 08b: iload 5
      // 08d: ifne 0d8
      // 090: ifne 0d4
      // 093: goto 09a
      // 096: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield z96.cjg I
      // 09e: iload 5
      // 0a0: ifne 0d8
      // 0a3: goto 0aa
      // 0a6: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: ifle 0d4
      // 0ad: goto 0b4
      // 0b0: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: aload 1
      // 0b5: iload 5
      // 0b7: ifne 0d5
      // 0ba: goto 0c1
      // 0bd: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: getstatic ofh.r2b Lofh;
      // 0c4: if_acmpeq 0d4
      // 0c7: goto 0ce
      // 0ca: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: bipush 0
      // 0cf: ireturn
      // 0d0: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 1
      // 0d5: instanceof c7o
      // 0d8: iload 5
      // 0da: ifne 186
      // 0dd: ifeq 180
      // 0e0: goto 0e7
      // 0e3: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 1
      // 0e8: invokevirtual ofh.nra ()Li2h;
      // 0eb: astore 7
      // 0ed: aload 7
      // 0ef: instanceof ha9
      // 0f2: iload 5
      // 0f4: ifne 12b
      // 0f7: ifeq 126
      // 0fa: goto 101
      // 0fd: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: aload 0
      // 102: aload 7
      // 104: checkcast ha9
      // 107: invokevirtual z96._ck (Lha9;)Z
      // 10a: iload 5
      // 10c: ifne 12b
      // 10f: goto 116
      // 112: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: ifne 126
      // 119: goto 120
      // 11c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: bipush 0
      // 121: ireturn
      // 122: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 7
      // 128: instanceof hy9
      // 12b: iload 5
      // 12d: ifne 186
      // 130: ifeq 180
      // 133: goto 13a
      // 136: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: aload 7
      // 13c: checkcast hy9
      // 13f: astore 8
      // 141: aload 8
      // 143: getfield hy9.k_d Li2h;
      // 146: instanceof ha9
      // 149: iload 5
      // 14b: ifne 186
      // 14e: ifeq 180
      // 151: goto 158
      // 154: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 0
      // 159: aload 8
      // 15b: getfield hy9.k_d Li2h;
      // 15e: checkcast ha9
      // 161: invokevirtual z96._ck (Lha9;)Z
      // 164: iload 5
      // 166: ifne 186
      // 169: goto 170
      // 16c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: ifne 180
      // 173: goto 17a
      // 176: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: bipush 0
      // 17b: ireturn
      // 17c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: aload 0
      // 181: aload 1
      // 182: fload 2
      // 183: invokespecial ha9.m1t (Lofh;F)Z
      // 186: ireturn
   }

   @Override
   public boolean _ck(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1f
      // 09: invokespecial z96.aab ()Z
      // 0c: ifne 1e
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 0
      // 17: goto 23
      // 1a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial ha9._ck (Lha9;)Z
      // 23: ireturn
   }

   private boolean aab() {
      return this.paw.wl5();
   }

   @Override
   public void zye(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield z96.ohd I
      // 08: iload 2
      // 09: ifne 73
      // 0c: bipush 1
      // 0d: if_icmpne 5d
      // 10: goto 17
      // 13: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 73
      // 1c: goto 23
      // 1f: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: bipush 1
      // 24: if_icmpne 5d
      // 27: goto 2e
      // 2a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getstatic y8d.qqo Ll7l;
      // 32: invokevirtual z96.aex (L_ss;)V
      // 35: aload 0
      // 36: getfield z96.oay Lt9d;
      // 39: aload 0
      // 3a: invokevirtual OpaquePredicate.rqa (Li2h;)V
      // 3d: aload 0
      // 3e: bipush 1
      // 3f: putfield z96.m92 Z
      // 42: aload 0
      // 43: getfield z96.rhh Lmlk;
      // 46: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 49: dup
      // 4a: bipush 4
      // 4b: fconst_0
      // 4c: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 4f: invokevirtual mlk.vnf (Lmz2;)V
      // 52: iload 2
      // 53: ifeq f4
      // 56: goto 5d
      // 59: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: iload 2
      // 5f: ifne d1
      // 62: goto 69
      // 65: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: getfield z96.ohd I
      // 6c: goto 73
      // 6f: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: ifne c9
      // 76: iload 1
      // 77: bipush 1
      // 78: if_icmpne c9
      // 7b: goto 82
      // 7e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 0
      // 83: getstatic y8d.teu Ll7l;
      // 86: invokevirtual z96.aex (L_ss;)V
      // 89: aload 0
      // 8a: getfield z96.paw Lvr1;
      // 8d: iload 1
      // 8e: invokevirtual vr1.hrw (I)Ldug;
      // 91: invokevirtual dug.tk1 ()Lmew;
      // 94: astore 3
      // 95: iload 2
      // 96: ifne c5
      // 99: aload 3
      // 9a: ifnull c3
      // 9d: goto a4
      // a0: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: aload 0
      // a5: getfield z96.rhh Lmlk;
      // a8: aload 3
      // a9: invokevirtual mew.getX ()I
      // ac: i2d
      // ad: aload 3
      // ae: invokevirtual mew.getY ()I
      // b1: i2d
      // b2: aload 3
      // b3: invokevirtual mew.getZ ()I
      // b6: i2d
      // b7: fconst_0
      // b8: fconst_0
      // b9: invokevirtual mlk.ymx (DDDFF)V
      // bc: goto c3
      // bf: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c2: athrow
      // c3: bipush 1
      // c4: istore 1
      // c5: iload 2
      // c6: ifeq d7
      // c9: aload 0
      // ca: goto d1
      // cd: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0: athrow
      // d1: getstatic y8d.ga_ Ll7l;
      // d4: invokevirtual z96.aex (L_ss;)V
      // d7: aload 0
      // d8: getfield z96.paw Lvr1;
      // db: invokevirtual vr1.wh3 ()Lwlx;
      // de: aload 0
      // df: iload 1
      // e0: invokevirtual wlx.fis (Lz96;I)V
      // e3: aload 0
      // e4: bipush -1
      // e5: putfield z96.c3w I
      // e8: aload 0
      // e9: ldc -1.0
      // eb: nop
      // ec: putfield z96.e3r F
      // ef: aload 0
      // f0: bipush -1
      // f1: putfield z96.xat I
      // f4: return
   }

   @Override
   public boolean xak(z96 param1) {
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
      // 05: invokevirtual z96.myu ()Z
      // 08: iload 2
      // 09: ifne 40
      // 0c: ifeq 31
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual z96.qqz ()Li2h;
      // 1a: aload 0
      // 1b: if_acmpne 2d
      // 1e: goto 25
      // 21: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 50
      // 29: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 50
      // 31: aload 0
      // 32: iload 2
      // 33: ifne 4c
      // 36: invokevirtual z96.myu ()Z
      // 39: goto 40
      // 3c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: ifeq 4b
      // 43: bipush 0
      // 44: goto 50
      // 47: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 1
      // 4d: invokespecial ha9.xak (Lz96;)Z
      // 50: ireturn
   }

   private void kuk(pyk var1) {
      int var2 = OpaquePredicate.c();

      pyk var10000;
      label28: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label28;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var5) {
            throw b(var5);
         }

         var10000 = var1;
      }

      mz2 var3 = var10000.ptb();

      try {
         if (var3 != null) {
            this.rhh.vnf(var3);
         }
      } catch (oov var4) {
         throw b(var4);
      }
   }

   @Override
   public void p3n(EntityLivingBase var1, int var2) {
      super.p3n(var1, var2);
      this.daw.n4z();
   }

   @Override
   public ha9$o7a zv1(mew var1) {
      int var2 = OpaquePredicate.b();
      ha9$o7a var3 = super.zv1(var1);

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 != ha9$o7a.xdw) {
            return var3;
         }
      } catch (oov var5) {
         throw b(var5);
      }

      S0APacketUseBed var4 = new S0APacketUseBed(this, var1);
      this.b88().fp4().si9(this, var4);
      this.rhh.ymx(this.o2v, this.kfp, this.vbd, this.x5k, this.y2i);
      this.rhh.vnf(var4);
      return var3;
   }

   @Override
   public void thu(boolean param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifeq 3b
      // 0b: invokevirtual z96.ofg ()Z
      // 0e: ifeq 33
      // 11: goto 18
      // 14: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual z96.b88 ()Ldug;
      // 1c: invokevirtual dug.fp4 ()Lqpc;
      // 1f: aload 0
      // 20: new net/minecraft/network/play/server/S0BPacketAnimation
      // 23: dup
      // 24: aload 0
      // 25: bipush 2
      // 26: invokespecial net/minecraft/network/play/server/S0BPacketAnimation.<init> (Li2h;I)V
      // 29: invokevirtual qpc.wru (Li2h;Lmz2;)V
      // 2c: goto 33
      // 2f: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: iload 1
      // 35: iload 2
      // 36: iload 3
      // 37: invokespecial ha9.thu (ZZZ)V
      // 3a: aload 0
      // 3b: getfield z96.rhh Lmlk;
      // 3e: iload 4
      // 40: ifeq 58
      // 43: ifnull 6f
      // 46: goto 4d
      // 49: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield z96.rhh Lmlk;
      // 51: goto 58
      // 54: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: aload 0
      // 59: getfield z96.o2v D
      // 5c: aload 0
      // 5d: getfield z96.kfp D
      // 60: aload 0
      // 61: getfield z96.vbd D
      // 64: aload 0
      // 65: getfield z96.x5k F
      // 68: aload 0
      // 69: getfield z96.y2i F
      // 6c: invokevirtual mlk.ymx (DDDFF)V
      // 6f: return
   }

   @Override
   public void nw9(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield z96.hzp Li2h;
      // 08: astore 3
      // 09: aload 0
      // 0a: aload 1
      // 0b: invokespecial ha9.nw9 (Li2h;)V
      // 0e: iload 2
      // 0f: ifne 39
      // 12: aload 1
      // 13: aload 3
      // 14: if_acmpeq 54
      // 17: goto 1e
      // 1a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield z96.rhh Lmlk;
      // 22: new net/minecraft/network/play/server/S1BPacketEntityAttach
      // 25: dup
      // 26: bipush 0
      // 27: aload 0
      // 28: aload 0
      // 29: getfield z96.hzp Li2h;
      // 2c: invokespecial net/minecraft/network/play/server/S1BPacketEntityAttach.<init> (ILi2h;Li2h;)V
      // 2f: invokevirtual mlk.vnf (Lmz2;)V
      // 32: goto 39
      // 35: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield z96.rhh Lmlk;
      // 3d: aload 0
      // 3e: getfield z96.o2v D
      // 41: aload 0
      // 42: getfield z96.kfp D
      // 45: aload 0
      // 46: getfield z96.vbd D
      // 49: aload 0
      // 4a: getfield z96.x5k F
      // 4d: aload 0
      // 4e: getfield z96.y2i F
      // 51: invokevirtual mlk.ymx (DDDFF)V
      // 54: return
   }

   @Override
   public void ihp(double var1, boolean var3, e0x var4, mew var5) {
   }

   public void qcl(double param1, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield z96.o2v D
      // 04: invokestatic fe6.jqf (D)I
      // 07: istore 5
      // 09: aload 0
      // 0a: getfield z96.kfp D
      // 0d: ldc2_w 0.20000000298023224
      // 10: dsub
      // 11: invokestatic fe6.jqf (D)I
      // 14: istore 6
      // 16: invokestatic OpaquePredicate.b ()I
      // 19: aload 0
      // 1a: getfield z96.vbd D
      // 1d: invokestatic fe6.jqf (D)I
      // 20: istore 7
      // 22: istore 4
      // 24: new mew
      // 27: dup
      // 28: iload 5
      // 2a: iload 6
      // 2c: iload 7
      // 2e: invokespecial mew.<init> (III)V
      // 31: astore 8
      // 33: aload 0
      // 34: getfield z96.oay Lt9d;
      // 37: aload 8
      // 39: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3c: invokeinterface zfz.r_y ()Le0x; 1
      // 41: astore 9
      // 43: iload 4
      // 45: ifeq d8
      // 48: aload 9
      // 4a: invokevirtual e0x.p1r ()Lp3y;
      // 4d: getstatic p3y.cei Lp3y;
      // 50: if_acmpne ce
      // 53: goto 5a
      // 56: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield z96.oay Lt9d;
      // 5e: aload 8
      // 60: invokevirtual mew.eve ()Lmew;
      // 63: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 66: invokeinterface zfz.r_y ()Le0x; 1
      // 6b: astore 10
      // 6d: aload 10
      // 6f: iload 4
      // 71: ifeq cc
      // 74: instanceof dqt
      // 77: ifne b7
      // 7a: goto 81
      // 7d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: aload 10
      // 83: iload 4
      // 85: ifeq cc
      // 88: goto 8f
      // 8b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: instanceof f86
      // 92: ifne b7
      // 95: goto 9c
      // 98: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: aload 10
      // 9e: iload 4
      // a0: ifeq cc
      // a3: goto aa
      // a6: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9: athrow
      // aa: instanceof u98
      // ad: ifeq ce
      // b0: goto b7
      // b3: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: aload 8
      // b9: invokevirtual mew.eve ()Lmew;
      // bc: astore 8
      // be: aload 0
      // bf: getfield z96.oay Lt9d;
      // c2: aload 8
      // c4: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // c7: invokeinterface zfz.r_y ()Le0x; 1
      // cc: astore 9
      // ce: aload 0
      // cf: dload 1
      // d0: iload 3
      // d1: aload 9
      // d3: aload 8
      // d5: invokespecial ha9.ihp (DZLe0x;Lmew;)V
      // d8: return
   }

   @Override
   public void v6x(TileEntitySign var1) {
      var1.hzf(this);
      this.rhh.vnf(new S36PacketSignEditorOpen(var1.y8_()));
   }

   private void qt3() {
      this.jst = this.jst % 100 + 1;
   }

   @Override
   public void xz_(_83 var1) {
      this.qt3();
      this.rhh.vnf(new S2DPacketOpenWindow(this.jst, var1.q4l(), var1.xyw()));
      this.daw = var1.b_f(this.up_, this);
      this.daw.h7l = this.jst;
      this.daw.c_j(this);
   }

   @Override
   public void a_o(rsi param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z96.d J
      // 003: ldc2_w 124512489146957
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 02c
      // 013: getfield z96.daw L_jc;
      // 016: aload 0
      // 017: getfield z96.fv9 L_jc;
      // 01a: if_acmpeq 02f
      // 01d: goto 024
      // 020: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: aload 0
      // 025: goto 02c
      // 028: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: invokevirtual z96.gph ()V
      // 02f: aload 1
      // 030: instanceof fl3
      // 033: iload 4
      // 035: ifne 10d
      // 038: ifeq 0f9
      // 03b: goto 042
      // 03e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 1
      // 043: checkcast fl3
      // 046: astore 5
      // 048: aload 5
      // 04a: invokeinterface fl3.plq ()Z 1
      // 04f: iload 4
      // 051: ifne 10d
      // 054: ifeq 0f9
      // 057: goto 05e
      // 05a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 5
      // 061: invokeinterface fl3.q2q ()Laxk; 1
      // 066: invokevirtual z96.cwv (Laxk;)Z
      // 069: iload 4
      // 06b: ifne 10d
      // 06e: goto 075
      // 071: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: ifne 0f9
      // 078: goto 07f
      // 07b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: aload 0
      // 080: invokevirtual z96.myu ()Z
      // 083: iload 4
      // 085: ifne 10d
      // 088: goto 08f
      // 08b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: ifne 0f9
      // 092: goto 099
      // 095: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield z96.rhh Lmlk;
      // 09d: new net/minecraft/network/play/server/S02PacketChat
      // 0a0: dup
      // 0a1: new hsu
      // 0a4: dup
      // 0a5: sipush 25159
      // 0a8: ldc2_w 405297287215264102
      // 0ab: lload 2
      // 0ac: lxor
      // 0ad: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: bipush 1
      // 0b4: anewarray 1081
      // 0b7: dup
      // 0b8: bipush 0
      // 0b9: aload 1
      // 0ba: invokeinterface rsi.xyw ()Lekw; 1
      // 0bf: aastore
      // 0c0: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0c3: bipush 2
      // 0c4: invokespecial net/minecraft/network/play/server/S02PacketChat.<init> (Lekw;B)V
      // 0c7: invokevirtual mlk.vnf (Lmz2;)V
      // 0ca: aload 0
      // 0cb: getfield z96.rhh Lmlk;
      // 0ce: new net/minecraft/network/play/server/S29PacketSoundEffect
      // 0d1: dup
      // 0d2: sipush 15107
      // 0d5: ldc2_w 6859221629034260524
      // 0d8: lload 2
      // 0d9: lxor
      // 0da: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: aload 0
      // 0e1: getfield z96.o2v D
      // 0e4: aload 0
      // 0e5: getfield z96.kfp D
      // 0e8: aload 0
      // 0e9: getfield z96.vbd D
      // 0ec: fconst_1
      // 0ed: fconst_1
      // 0ee: invokespecial net/minecraft/network/play/server/S29PacketSoundEffect.<init> (Ljava/lang/String;DDDFF)V
      // 0f1: invokevirtual mlk.vnf (Lmz2;)V
      // 0f4: return
      // 0f5: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: invokespecial z96.qt3 ()V
      // 0fd: iload 4
      // 0ff: ifne 188
      // 102: aload 1
      // 103: instanceof _83
      // 106: goto 10d
      // 109: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: ifeq 155
      // 110: aload 0
      // 111: getfield z96.rhh Lmlk;
      // 114: new net/minecraft/network/play/server/S2DPacketOpenWindow
      // 117: dup
      // 118: aload 0
      // 119: getfield z96.jst I
      // 11c: aload 1
      // 11d: checkcast _83
      // 120: invokeinterface _83.q4l ()Ljava/lang/String; 1
      // 125: aload 1
      // 126: invokeinterface rsi.xyw ()Lekw; 1
      // 12b: aload 1
      // 12c: invokeinterface rsi.opt ()I 1
      // 131: invokespecial net/minecraft/network/play/server/S2DPacketOpenWindow.<init> (ILjava/lang/String;Lekw;I)V
      // 134: invokevirtual mlk.vnf (Lmz2;)V
      // 137: aload 0
      // 138: aload 1
      // 139: checkcast _83
      // 13c: aload 0
      // 13d: getfield z96.up_ Ljnq;
      // 140: aload 0
      // 141: invokeinterface _83.b_f (Ljnq;Lha9;)L_jc; 3
      // 146: putfield z96.daw L_jc;
      // 149: iload 4
      // 14b: ifeq 199
      // 14e: goto 155
      // 151: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 154: athrow
      // 155: aload 0
      // 156: getfield z96.rhh Lmlk;
      // 159: new net/minecraft/network/play/server/S2DPacketOpenWindow
      // 15c: dup
      // 15d: aload 0
      // 15e: getfield z96.jst I
      // 161: sipush 26345
      // 164: ldc2_w 113180190773130698
      // 167: lload 2
      // 168: lxor
      // 169: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: nop
      // 16f: aload 1
      // 170: invokeinterface rsi.xyw ()Lekw; 1
      // 175: aload 1
      // 176: invokeinterface rsi.opt ()I 1
      // 17b: invokespecial net/minecraft/network/play/server/S2DPacketOpenWindow.<init> (ILjava/lang/String;Lekw;I)V
      // 17e: invokevirtual mlk.vnf (Lmz2;)V
      // 181: goto 188
      // 184: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 187: athrow
      // 188: aload 0
      // 189: new j_9
      // 18c: dup
      // 18d: aload 0
      // 18e: getfield z96.up_ Ljnq;
      // 191: aload 1
      // 192: aload 0
      // 193: invokespecial j_9.<init> (Lrsi;Lrsi;Lha9;)V
      // 196: putfield z96.daw L_jc;
      // 199: aload 0
      // 19a: getfield z96.daw L_jc;
      // 19d: aload 0
      // 19e: getfield z96.jst I
      // 1a1: putfield _jc.h7l I
      // 1a4: aload 0
      // 1a5: getfield z96.daw L_jc;
      // 1a8: aload 0
      // 1a9: invokevirtual _jc.c_j (Lflv;)V
      // 1ac: return
   }

   @Override
   public void vhi(a7q var1) {
      long var2 = d ^ 993465039362L;
      this.qt3();
      this.daw = new y43(this.up_, var1, this.oay);
      this.daw.h7l = this.jst;
      this.daw.c_j(this);
      u42 var4 = ((y43)this.daw).x0a();
      ekw var5 = var1.xyw();
      this.rhh.vnf(new S2DPacketOpenWindow(this.jst, d<"r">(22903, 6195022877513447960L ^ var2), var5, var4.opt()));
      skn var6 = var1.zyi(this);
      if (var6 != null) {
         nfj var7 = new nfj(Unpooled.buffer());
         var7.writeInt(this.jst);
         var6.njj(var7);
         this.rhh.vnf(new S3FPacketCustomPayload(d<"r">(6743, 981301992297511217L ^ var2), var7));
      }
   }

   @Override
   public void b_m(zfo param1, rsi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic z96.d J
      // 03: ldc2_w 96696723100016
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: getfield z96.daw L_jc;
      // 11: aload 0
      // 12: iload 5
      // 14: ifne 85
      // 17: getfield z96.fv9 L_jc;
      // 1a: if_acmpeq 2f
      // 1d: goto 24
      // 20: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: invokevirtual z96.gph ()V
      // 28: goto 2f
      // 2b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: invokespecial z96.qt3 ()V
      // 33: aload 0
      // 34: getfield z96.rhh Lmlk;
      // 37: new net/minecraft/network/play/server/S2DPacketOpenWindow
      // 3a: dup
      // 3b: aload 0
      // 3c: getfield z96.jst I
      // 3f: sipush 27962
      // 42: ldc2_w 5146261598897333549
      // 45: lload 3
      // 46: lxor
      // 47: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: nop
      // 4d: aload 2
      // 4e: invokeinterface rsi.xyw ()Lekw; 1
      // 53: aload 2
      // 54: invokeinterface rsi.opt ()I 1
      // 59: aload 1
      // 5a: invokevirtual zfo.jwu ()I
      // 5d: invokespecial net/minecraft/network/play/server/S2DPacketOpenWindow.<init> (ILjava/lang/String;Lekw;II)V
      // 60: invokevirtual mlk.vnf (Lmz2;)V
      // 63: aload 0
      // 64: new qyi
      // 67: dup
      // 68: aload 0
      // 69: getfield z96.up_ Ljnq;
      // 6c: aload 2
      // 6d: aload 1
      // 6e: aload 0
      // 6f: invokespecial qyi.<init> (Lrsi;Lrsi;Lzfo;Lha9;)V
      // 72: putfield z96.daw L_jc;
      // 75: aload 0
      // 76: getfield z96.daw L_jc;
      // 79: aload 0
      // 7a: getfield z96.jst I
      // 7d: putfield _jc.h7l I
      // 80: aload 0
      // 81: getfield z96.daw L_jc;
      // 84: aload 0
      // 85: invokevirtual _jc.c_j (Lflv;)V
      // 88: return
   }

   @Override
   public void rlk(erg var1) {
      long var2 = d ^ 9921913212024L;
      u7m var4 = var1.gn1();

      try {
         if (var4 == xbr._h5) {
            this.rhh.vnf(new S3FPacketCustomPayload(d<"r">(21799, 859532563112575039L ^ var2), new nfj(Unpooled.buffer())));
         }
      } catch (oov var5) {
         throw b(var5);
      }
   }

   @Override
   public void r83(_jc param1, int param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 2
      // 07: invokevirtual _jc.ajr (I)Lvrx;
      // 0a: instanceof l_w
      // 0d: iload 4
      // 0f: ifeq 33
      // 12: ifne 4a
      // 15: goto 1c
      // 18: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 4
      // 1f: ifeq 37
      // 22: goto 29
      // 25: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: getfield z96._d1 Z
      // 2c: goto 33
      // 2f: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: ifne 4a
      // 36: aload 0
      // 37: getfield z96.rhh Lmlk;
      // 3a: new net/minecraft/network/play/server/S2FPacketSetSlot
      // 3d: dup
      // 3e: aload 1
      // 3f: getfield _jc.h7l I
      // 42: iload 2
      // 43: aload 3
      // 44: invokespecial net/minecraft/network/play/server/S2FPacketSetSlot.<init> (IILerg;)V
      // 47: invokevirtual mlk.vnf (Lmz2;)V
      // 4a: return
   }

   public void u1s(_jc var1) {
      this.ynq(var1, var1.kpj());
   }

   @Override
   public void ynq(_jc var1, List var2) {
      this.rhh.vnf(new S30PacketWindowItems(var1.h7l, var2));
      this.rhh.vnf(new S2FPacketSetSlot(-1, -1, this.up_.zet()));
   }

   @Override
   public void vhx(_jc var1, int var2, int var3) {
      this.rhh.vnf(new S31PacketWindowProperty(var1.h7l, var2, var3));
   }

   @Override
   public void pr4(_jc var1, rsi var2) {
      int var3 = OpaquePredicate.b();
      int var4 = 0;

      while (var4 < var2.xa3()) {
         this.rhh.vnf(new S31PacketWindowProperty(var1.h7l, var4, var2.czu(var4)));
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void gph() {
      this.rhh.vnf(new S2EPacketCloseWindow(this.daw.h7l));
      this.wib();
   }

   public void kbu() {
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
      // 05: iload 1
      // 06: ifne 1e
      // 09: getfield z96._d1 Z
      // 0c: ifne 34
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: getfield z96.rhh Lmlk;
      // 21: new net/minecraft/network/play/server/S2FPacketSetSlot
      // 24: dup
      // 25: bipush -1
      // 26: bipush -1
      // 27: aload 0
      // 28: getfield z96.up_ Ljnq;
      // 2b: invokevirtual jnq.zet ()Lerg;
      // 2e: invokespecial net/minecraft/network/play/server/S2FPacketSetSlot.<init> (IILerg;)V
      // 31: invokevirtual mlk.vnf (Lmz2;)V
      // 34: return
   }

   public void wib() {
      this.daw.qi6(this);
      this.daw = this.fv9;
   }

   public void u6_(float param1, float param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: getfield z96.hzp Li2h;
      // 09: ifnull 84
      // 0c: fload 1
      // 0d: ldc -1.0
      // 0f: nop
      // 10: fcmpl
      // 11: iload 5
      // 13: ifeq 51
      // 16: goto 1d
      // 19: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: iflt 4c
      // 20: goto 27
      // 23: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: fload 1
      // 28: fconst_1
      // 29: fcmpg
      // 2a: iload 5
      // 2c: ifeq 51
      // 2f: goto 36
      // 32: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: ifgt 4c
      // 39: goto 40
      // 3c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: aload 0
      // 41: fload 1
      // 42: putfield z96.z66 F
      // 45: goto 4c
      // 48: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: fload 2
      // 4d: ldc -1.0
      // 4f: nop
      // 50: fcmpl
      // 51: iload 5
      // 53: ifeq 6a
      // 56: iflt 79
      // 59: goto 60
      // 5c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: fload 2
      // 61: fconst_1
      // 62: fcmpg
      // 63: goto 6a
      // 66: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: ifgt 79
      // 6d: aload 0
      // 6e: fload 2
      // 6f: putfield z96.ooc F
      // 72: goto 79
      // 75: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: aload 0
      // 7a: iload 3
      // 7b: putfield z96.e1f Z
      // 7e: aload 0
      // 7f: iload 4
      // 81: invokevirtual z96.rh_ (Z)V
      // 84: return
   }

   @Override
   public void qcw(_ss param1, int param2) {
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
      // 05: ifnull 7e
      // 08: aload 0
      // 09: getfield z96.pif Ldc5;
      // 0c: aload 0
      // 0d: aload 1
      // 0e: iload 2
      // 0f: invokevirtual dc5._gw (Lha9;L_ss;I)V
      // 12: aload 0
      // 13: invokevirtual z96.cjt ()Luci;
      // 16: aload 1
      // 17: invokevirtual _ss.ihd ()Lz0w;
      // 1a: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // 1d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 22: astore 4
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 5a
      // 2e: aload 4
      // 30: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35: checkcast sa6
      // 38: astore 5
      // 3a: aload 0
      // 3b: invokevirtual z96.cjt ()Luci;
      // 3e: aload 0
      // 3f: invokevirtual z96.noc ()Ljava/lang/String;
      // 42: aload 5
      // 44: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 47: iload 2
      // 48: invokevirtual r11._b8 (I)V
      // 4b: iload 3
      // 4c: ifeq 7e
      // 4f: iload 3
      // 50: ifne 24
      // 53: goto 5a
      // 56: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield z96.pif Ldc5;
      // 5e: iload 3
      // 5f: ifeq 7a
      // 62: invokevirtual dc5.bzz ()Z
      // 65: ifeq 7e
      // 68: goto 6f
      // 6b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield z96.pif Ldc5;
      // 73: goto 7a
      // 76: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 0
      // 7b: invokevirtual dc5.gts (Lz96;)V
      // 7e: return
   }

   @Override
   public void _rr(_ss param1) {
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
      // 05: ifnull 7b
      // 08: aload 0
      // 09: getfield z96.pif Ldc5;
      // 0c: aload 0
      // 0d: aload 1
      // 0e: bipush 0
      // 0f: invokevirtual dc5.xzh (Lha9;L_ss;I)V
      // 12: aload 0
      // 13: invokevirtual z96.cjt ()Luci;
      // 16: aload 1
      // 17: invokevirtual _ss.ihd ()Lz0w;
      // 1a: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // 1d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 22: astore 3
      // 23: aload 3
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 57
      // 2c: aload 3
      // 2d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32: checkcast sa6
      // 35: astore 4
      // 37: aload 0
      // 38: invokevirtual z96.cjt ()Luci;
      // 3b: aload 0
      // 3c: invokevirtual z96.noc ()Ljava/lang/String;
      // 3f: aload 4
      // 41: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 44: bipush 0
      // 45: invokevirtual r11.ndm (I)V
      // 48: iload 2
      // 49: ifeq 7b
      // 4c: iload 2
      // 4d: ifne 23
      // 50: goto 57
      // 53: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: aload 0
      // 58: getfield z96.pif Ldc5;
      // 5b: iload 2
      // 5c: ifeq 77
      // 5f: invokevirtual dc5.bzz ()Z
      // 62: ifeq 7b
      // 65: goto 6c
      // 68: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield z96.pif Ldc5;
      // 70: goto 77
      // 73: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 0
      // 78: invokevirtual dc5.gts (Lz96;)V
      // 7b: return
   }

   public void yb2() {
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
      // 05: iload 1
      // 06: ifne 26
      // 09: getfield z96.wgv Li2h;
      // 0c: ifnull 25
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield z96.wgv Li2h;
      // 1a: aload 0
      // 1b: invokevirtual EntityLivingBase.nw9 (Li2h;)V
      // 1e: goto 25
      // 21: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: ifne 3f
      // 2a: getfield z96.asp Z
      // 2d: ifeq 45
      // 30: goto 37
      // 33: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: goto 3f
      // 3b: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: bipush 1
      // 40: bipush 0
      // 41: bipush 0
      // 42: invokevirtual z96.thu (ZZZ)V
      // 45: return
   }

   public void e_g() {
      this.e3r = -1.0E8F;
   }

   @Override
   public void tog(ekw var1) {
      this.rhh.vnf(new S02PacketChat(var1));
   }

   @Override
   public void lbj() {
      this.rhh.vnf(new S19PacketEntityStatus(this, (byte)9));
      super.lbj();
   }

   @Override
   public void qez(erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: iload 2
      // 07: invokespecial ha9.qez (Lerg;I)V
      // 0a: aload 1
      // 0b: iload 3
      // 0c: ifeq 1a
      // 0f: ifnull 5b
      // 12: goto 19
      // 15: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual erg.gn1 ()Lu7m;
      // 1d: iload 3
      // 1e: ifeq 36
      // 21: ifnull 5b
      // 24: goto 2b
      // 27: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 1
      // 2c: invokevirtual erg.gn1 ()Lu7m;
      // 2f: goto 36
      // 32: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 1
      // 37: invokevirtual u7m.uf6 (Lerg;)Lce2;
      // 3a: getstatic ce2.b46 Lce2;
      // 3d: if_acmpne 5b
      // 40: aload 0
      // 41: invokevirtual z96.b88 ()Ldug;
      // 44: invokevirtual dug.fp4 ()Lqpc;
      // 47: aload 0
      // 48: new net/minecraft/network/play/server/S0BPacketAnimation
      // 4b: dup
      // 4c: aload 0
      // 4d: bipush 3
      // 4e: invokespecial net/minecraft/network/play/server/S0BPacketAnimation.<init> (Li2h;I)V
      // 51: invokevirtual qpc.wru (Li2h;Lmz2;)V
      // 54: goto 5b
      // 57: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: return
   }

   @Override
   public void moc(ha9 var1, boolean var2) {
      super.moc(var1, var2);
      this.c3w = -1;
      this.e3r = -1.0F;
      this.xat = -1;
      this.wkc.addAll(((z96)var1).wkc);
   }

   @Override
   public void dft(sdj var1) {
      super.dft(var1);
      this.rhh.vnf(new S1DPacketEntityEffect(this.jwu(), var1));
   }

   @Override
   public void lyx(sdj var1, boolean var2) {
      super.lyx(var1, var2);
      this.rhh.vnf(new S1DPacketEntityEffect(this.jwu(), var1));
   }

   @Override
   public void rua(sdj var1) {
      super.rua(var1);
      this.rhh.vnf(new S1EPacketRemoveEntityEffect(this.jwu(), var1));
   }

   @Override
   public void clj(double var1, double var3, double var5) {
      this.rhh.ymx(var1, var3, var5, this.x5k, this.y2i);
   }

   @Override
   public void glv(EntityLivingBase var1) {
      this.b88().fp4().wru(this, new S0BPacketAnimation(var1, 4));
   }

   @Override
   public void eej(EntityLivingBase var1) {
      this.b88().fp4().wru(this, new S0BPacketAnimation(var1, 5));
   }

   @Override
   public void gow() {
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
      // 05: getfield z96.rhh Lmlk;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 33
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield z96.rhh Lmlk;
      // 1a: goto 21
      // 1d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: new net/minecraft/network/play/server/S39PacketPlayerAbilities
      // 24: dup
      // 25: aload 0
      // 26: getfield z96.lls Lpj2;
      // 29: invokespecial net/minecraft/network/play/server/S39PacketPlayerAbilities.<init> (Lpj2;)V
      // 2c: invokevirtual mlk.vnf (Lmz2;)V
      // 2f: aload 0
      // 30: invokevirtual z96.k0f ()V
      // 33: return
   }

   public dug b88() {
      return (dug)this.oay;
   }

   @Override
   public void bci(h50$f05 param1) {
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
      // 05: getfield z96._am Lrsh;
      // 08: aload 1
      // 09: invokevirtual rsh.ppu (Lh50$f05;)V
      // 0c: aload 0
      // 0d: iload 2
      // 0e: ifeq 4d
      // 11: getfield z96.rhh Lmlk;
      // 14: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 17: dup
      // 18: bipush 3
      // 19: aload 1
      // 1a: invokevirtual h50$f05.xzh ()I
      // 1d: i2f
      // 1e: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 21: invokevirtual mlk.vnf (Lmz2;)V
      // 24: aload 1
      // 25: getstatic h50$f05.l18 Lh50$f05;
      // 28: if_acmpne 45
      // 2b: goto 32
      // 2e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: aconst_null
      // 34: checkcast EntityLivingBase
      // 37: invokevirtual z96.nw9 (Li2h;)V
      // 3a: iload 2
      // 3b: ifne 51
      // 3e: goto 45
      // 41: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: goto 4d
      // 49: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: invokevirtual z96.cm6 (Li2h;)V
      // 51: aload 0
      // 52: invokevirtual z96.gow ()V
      // 55: aload 0
      // 56: invokevirtual z96.k04 ()V
      // 59: return
   }

   @Override
   public boolean myu() {
      try {
         if (this._am.tmw() == h50$f05.l18) {
            return true;
         }
      } catch (oov var1) {
         throw b(var1);
      }

      return false;
   }

   @Override
   public void a0d(ekw var1) {
      this.rhh.vnf(new S02PacketChat(var1));
   }

   @Override
   public boolean ge4(int param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z96.d J
      // 003: ldc2_w 121916513837971
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: sipush 16330
      // 010: ldc2_w 2980200057147622705
      // 013: lload 3
      // 014: lxor
      // 015: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: nop
      // 01b: aload 2
      // 01c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01f: iload 5
      // 021: ifne 063
      // 024: ifeq 051
      // 027: goto 02e
      // 02a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 0
      // 02f: getfield z96.paw Lvr1;
      // 032: invokevirtual vr1.s5d ()Z
      // 035: iload 5
      // 037: ifne 063
      // 03a: goto 041
      // 03d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: ifne 051
      // 044: goto 04b
      // 047: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: bipush 1
      // 04c: ireturn
      // 04d: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: sipush 13533
      // 054: ldc2_w 7561307005014773281
      // 057: lload 3
      // 058: lxor
      // 059: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: nop
      // 05f: aload 2
      // 060: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 063: iload 5
      // 065: ifne 17d
      // 068: ifne 17c
      // 06b: goto 072
      // 06e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: sipush 9736
      // 075: ldc2_w 3689122728161352928
      // 078: lload 3
      // 079: lxor
      // 07a: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: nop
      // 080: aload 2
      // 081: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 084: iload 5
      // 086: ifne 17d
      // 089: goto 090
      // 08c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: ifne 17c
      // 093: goto 09a
      // 096: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: sipush 12044
      // 09d: ldc2_w 2470520114381362678
      // 0a0: lload 3
      // 0a1: lxor
      // 0a2: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: nop
      // 0a8: aload 2
      // 0a9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ac: iload 5
      // 0ae: ifne 17d
      // 0b1: goto 0b8
      // 0b4: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: ifne 17c
      // 0bb: goto 0c2
      // 0be: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: sipush 11124
      // 0c5: ldc2_w 7663111949692408194
      // 0c8: lload 3
      // 0c9: lxor
      // 0ca: invokedynamic r (IJ)Ljava/lang/String; bsm=z96.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: aload 2
      // 0d1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d4: iload 5
      // 0d6: ifne 17d
      // 0d9: goto 0e0
      // 0dc: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: ifne 17c
      // 0e3: goto 0ea
      // 0e6: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: getfield z96.paw Lvr1;
      // 0ee: invokevirtual vr1.wh3 ()Lwlx;
      // 0f1: aload 0
      // 0f2: invokevirtual z96.x6l ()Lcom/mojang/authlib/GameProfile;
      // 0f5: invokevirtual wlx.sbc (Lcom/mojang/authlib/GameProfile;)Z
      // 0f8: iload 5
      // 0fa: ifne 17b
      // 0fd: goto 104
      // 100: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: ifeq 17a
      // 107: goto 10e
      // 10a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: aload 0
      // 10f: getfield z96.paw Lvr1;
      // 112: invokevirtual vr1.wh3 ()Lwlx;
      // 115: invokevirtual wlx.mz1 ()Lody;
      // 118: aload 0
      // 119: invokevirtual z96.x6l ()Lcom/mojang/authlib/GameProfile;
      // 11c: invokevirtual ody.fsa (Ljava/lang/Object;)Lsyv;
      // 11f: checkcast wmb
      // 122: astore 6
      // 124: aload 6
      // 126: iload 5
      // 128: ifne 137
      // 12b: ifnull 156
      // 12e: goto 135
      // 131: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: aload 6
      // 137: invokevirtual wmb.zru ()I
      // 13a: iload 5
      // 13c: ifne 153
      // 13f: iload 1
      // 140: if_icmplt 152
      // 143: goto 14a
      // 146: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: bipush 1
      // 14b: goto 179
      // 14e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 151: athrow
      // 152: bipush 0
      // 153: goto 179
      // 156: aload 0
      // 157: getfield z96.paw Lvr1;
      // 15a: invokevirtual vr1.v9t ()I
      // 15d: iload 5
      // 15f: ifne 175
      // 162: iload 1
      // 163: if_icmplt 178
      // 166: goto 16d
      // 169: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: bipush 1
      // 16e: goto 175
      // 171: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: goto 179
      // 178: bipush 0
      // 179: ireturn
      // 17a: bipush 0
      // 17b: ireturn
      // 17c: bipush 1
      // 17d: ireturn
   }

   public String zgv() {
      String var1 = this.rhh.h1h.pz4().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      return var1.substring(0, var1.indexOf(":"));
   }

   public void jgh(C15PacketClientSettings var1) {
      this.jfs = var1.yot();
      this.e2d = var1.qbd();
      this.to2 = var1.q72();
      this.a0c().c66(10, (byte)var1.v5_());
   }

   public ha9$c4q apj() {
      return this.e2d;
   }

   public void vfs(String var1, String var2) {
      this.rhh.vnf(new S48PacketResourcePackSend(var1, var2));
   }

   @Override
   public mew d3d() {
      return new mew(this.o2v, this.kfp + 0.5, this.vbd);
   }

   public void wli() {
      this.waw = vr1.spw();
   }

   public dc5 _m3() {
      return this.pif;
   }

   public void if2(EntityLivingBase param1) {
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
      // 05: instanceof ha9
      // 08: iload 2
      // 09: ifne 50
      // 0c: ifeq 39
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield z96.rhh Lmlk;
      // 1a: new net/minecraft/network/play/server/S13PacketDestroyEntities
      // 1d: dup
      // 1e: bipush 1
      // 1f: newarray 10
      // 21: dup
      // 22: bipush 0
      // 23: aload 1
      // 24: invokevirtual EntityLivingBase.jwu ()I
      // 27: iastore
      // 28: invokespecial net/minecraft/network/play/server/S13PacketDestroyEntities.<init> ([I)V
      // 2b: invokevirtual mlk.vnf (Lmz2;)V
      // 2e: iload 2
      // 2f: ifeq 51
      // 32: goto 39
      // 35: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield z96.wkc Ljava/util/List;
      // 3d: aload 1
      // 3e: invokevirtual EntityLivingBase.jwu ()I
      // 41: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 44: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 49: goto 50
      // 4c: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: pop
      // 51: return
   }

   @Override
   public void k0f() {
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
      // 05: iload 1
      // 06: ifne 32
      // 09: invokevirtual z96.myu ()Z
      // 0c: ifeq 2a
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual z96.__q ()V
      // 1a: aload 0
      // 1b: bipush 1
      // 1c: invokevirtual z96.icv (Z)V
      // 1f: iload 1
      // 20: ifeq 35
      // 23: goto 2a
      // 26: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 32
      // 2e: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: invokespecial ha9.k0f ()V
      // 35: aload 0
      // 36: invokevirtual z96.b88 ()Ldug;
      // 39: invokevirtual dug.fp4 ()Lqpc;
      // 3c: aload 0
      // 3d: invokevirtual qpc.khp (Lz96;)V
      // 40: return
   }

   public EntityLivingBase qqz() {
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
      // 05: iload 1
      // 06: ifeq 1f
      // 09: getfield z96.k_6 Li2h;
      // 0c: ifnonnull 1e
      // 0f: goto 16
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 22
      // 1a: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield z96.k_6 Li2h;
      // 22: areturn
   }

   public void cm6(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual z96.qqz ()Li2h;
      // 08: astore 3
      // 09: aload 0
      // 0a: aload 1
      // 0b: ifnonnull 16
      // 0e: aload 0
      // 0f: goto 17
      // 12: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: putfield z96.k_6 Li2h;
      // 1a: iload 2
      // 1b: ifne 46
      // 1e: aload 3
      // 1f: aload 0
      // 20: getfield z96.k_6 Li2h;
      // 23: if_acmpeq 5f
      // 26: goto 2d
      // 29: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield z96.rhh Lmlk;
      // 31: new net/minecraft/network/play/server/S43PacketCamera
      // 34: dup
      // 35: aload 0
      // 36: getfield z96.k_6 Li2h;
      // 39: invokespecial net/minecraft/network/play/server/S43PacketCamera.<init> (Li2h;)V
      // 3c: invokevirtual mlk.vnf (Lmz2;)V
      // 3f: goto 46
      // 42: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: aload 0
      // 48: getfield z96.k_6 Li2h;
      // 4b: getfield EntityLivingBase.o2v D
      // 4e: aload 0
      // 4f: getfield z96.k_6 Li2h;
      // 52: getfield EntityLivingBase.kfp D
      // 55: aload 0
      // 56: getfield z96.k_6 Li2h;
      // 59: getfield EntityLivingBase.vbd D
      // 5c: invokevirtual z96.clj (DDD)V
      // 5f: return
   }

   @Override
   public void v2x(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 34
      // 09: getfield z96._am Lrsh;
      // 0c: invokevirtual rsh.tmw ()Lh50$f05;
      // 0f: getstatic h50$f05.l18 Lh50$f05;
      // 12: if_acmpne 2c
      // 15: goto 1c
      // 18: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokevirtual z96.cm6 (Li2h;)V
      // 21: iload 2
      // 22: ifeq 38
      // 25: goto 2c
      // 28: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: goto 34
      // 30: invokestatic z96.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 1
      // 35: invokespecial ha9.v2x (Li2h;)V
      // 38: return
   }

   public long d27() {
      return this.waw;
   }

   public ekw von() {
      return null;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5112169043820084724L, 510464848397639493L, MethodHandles.lookup().lookupClass()).a(94624117792144L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 80522714756215L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[20];
      int var7 = 0;
      String var6 = "¼ÇÎ\u0086y!G[ØÿÚb]pÅò\u0010÷^¹<?R\u0019ïÎK\u000ep\u009dWÈ\u008b\u00181ï·\u0016ºÔä¢d¦\u000b\u008d)\u0089¯<ù\u0010'µ«\u0013Tï(GË\u001cËâh\u0098\fvÊÛæ\u0004±:á\u000fFadõ\u001d\u0013\u0006\u0086úS.\u0090R]\u001c\u009c\u0015áh\"ø\u0090k(®[Ú¨MÙX¡ ¯\u0087X¥§áBÚ\u0082\u001eD²Ñi#\u0014FnB\u0093*\u009a\\:'&0Ê\u0018»©(r%º\u009fÜÝª7p !mÈ.º\u008bé¾ê\u0018\u0097õÁ\u000b½¯\u0087`:\u0083\u0002f÷\u0003ô¥+z2u\u0010¤)qO\u0011B\n\u0011òFhÅ\u009d;\u000e-(\\¬V`J\u009d\u0083\u008e\u008f\u0083?¾= ¦\u000fÖÇtÇL\u0004y\u0001Ú0º\u0087\u0004»h²°\u008c!b\u008a\u0015ëò\u0018²i\u009f\u001c¼ý¤pqÇÃ+p\u0088kD5Ð¥e\u0002î\u009dØ a\u0014»ç\u0093K\u0090ºl`ÖÒ\u009fx¤§AÓä\u008cÿ\u000fç\u0080©&Z\u0080C\u0001º±\u0010\u0099\n3}\u009cRb>Ð[\u008f}¿®Üm(\u008b\u009f/Á°¶¹\u0095äÜS\u0017\u0083Ë\u009ebzÃ©¦yûé_C\u00adÿ\u0099vBé\u001fªkAï{Å.Y\u00102â\u0007Ó &T!2\u0097ïfªÔ*3 \u008f\u0006\u009cu\u000f!u\u0005á\u0004]u\u001e>ívþµ\u0087N\u008b\u0087üM\bC\u0089=ÕJÉ\u008d\u0018\u0011¬/»\u0092\u001d3±8\u0099l>\u008fõÄWn\u008aF¸<ß!\u0092 \u009d\u0011\u008dJ=í_\n'çl(F\u0090\u009cI\tÄ»\u0017\u00adÇ!\u0003óÆ{\u0002\"\u001b\u0012À fæ£ÉÊ\u0013\u0085yn·×Uº\u0016(\u00adíçð?Ç8Ýiç½Ëqà\u0013Þ¶\u0010Ì\u0091Ê#7ù\u001cð}\f\u008dBóM\u0003À";
      int var8 = "¼ÇÎ\u0086y!G[ØÿÚb]pÅò\u0010÷^¹<?R\u0019ïÎK\u000ep\u009dWÈ\u008b\u00181ï·\u0016ºÔä¢d¦\u000b\u008d)\u0089¯<ù\u0010'µ«\u0013Tï(GË\u001cËâh\u0098\fvÊÛæ\u0004±:á\u000fFadõ\u001d\u0013\u0006\u0086úS.\u0090R]\u001c\u009c\u0015áh\"ø\u0090k(®[Ú¨MÙX¡ ¯\u0087X¥§áBÚ\u0082\u001eD²Ñi#\u0014FnB\u0093*\u009a\\:'&0Ê\u0018»©(r%º\u009fÜÝª7p !mÈ.º\u008bé¾ê\u0018\u0097õÁ\u000b½¯\u0087`:\u0083\u0002f÷\u0003ô¥+z2u\u0010¤)qO\u0011B\n\u0011òFhÅ\u009d;\u000e-(\\¬V`J\u009d\u0083\u008e\u008f\u0083?¾= ¦\u000fÖÇtÇL\u0004y\u0001Ú0º\u0087\u0004»h²°\u008c!b\u008a\u0015ëò\u0018²i\u009f\u001c¼ý¤pqÇÃ+p\u0088kD5Ð¥e\u0002î\u009dØ a\u0014»ç\u0093K\u0090ºl`ÖÒ\u009fx¤§AÓä\u008cÿ\u000fç\u0080©&Z\u0080C\u0001º±\u0010\u0099\n3}\u009cRb>Ð[\u008f}¿®Üm(\u008b\u009f/Á°¶¹\u0095äÜS\u0017\u0083Ë\u009ebzÃ©¦yûé_C\u00adÿ\u0099vBé\u001fªkAï{Å.Y\u00102â\u0007Ó &T!2\u0097ïfªÔ*3 \u008f\u0006\u009cu\u000f!u\u0005á\u0004]u\u001e>ívþµ\u0087N\u008b\u0087üM\bC\u0089=ÕJÉ\u008d\u0018\u0011¬/»\u0092\u001d3±8\u0099l>\u008fõÄWn\u008aF¸<ß!\u0092 \u009d\u0011\u008dJ=í_\n'çl(F\u0090\u009cI\tÄ»\u0017\u00adÇ!\u0003óÆ{\u0002\"\u001b\u0012À fæ£ÉÊ\u0013\u0085yn·×Uº\u0016(\u00adíçð?Ç8Ýiç½Ëqà\u0013Þ¶\u0010Ì\u0091Ê#7ù\u001cð}\f\u008dBóM\u0003À"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     q = new String[20];
                     f5f = LogManager.getLogger();
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

                  var6 = "Ì\u0013ù\u00125«k\u008aó£åØoi~\u000e(QQÆÿÇ×\u0019UÏ\u0006ªÎæbkø\u0002¨wà\u00033áÒ0ÞS\u0017\u0081\u008fté\u0088AÒ\u0089\f\\\u0099ò";
                  var8 = "Ì\u0013ù\u00125«k\u008aó£åØoi~\u000e(QQÆÿÇ×\u0019UÏ\u0006ªÎæbkø\u0002¨wà\u00033áÒ0ÞS\u0017\u0081\u008fté\u0088AÒ\u0089\f\\\u0099ò"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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

   private static String d(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4924;
      if (q[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])r.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("z96", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         q[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return q[var5];
   }

   private static Object d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("z96" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
