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
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.server.S01PacketPong;

public class t7e$1 implements pmi {
   private boolean orj;
   private boolean ze5;
   private long ns6;
   public final hv0 bom;
   public final r1l ept;
   public final t7e xji;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public t7e$1(t7e var1, hv0 var2, r1l var3) {
      this.xji = var1;
      this.bom = var2;
      this.ept = var3;
      this.orj = false;
      this.ze5 = false;
      this.ns6 = 0L;
   }

   @Override
   public void e8v(S00PacketServerInfo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t7e$1.a J
      // 003: ldc2_w 62098801730225
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifeq 050
      // 013: getfield t7e$1.ze5 Z
      // 016: ifeq 048
      // 019: goto 020
      // 01c: invokestatic t7e$1.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield t7e$1.bom Lhv0;
      // 024: new tao
      // 027: dup
      // 028: sipush 13281
      // 02b: ldc2_w 8141852974882938691
      // 02e: lload 2
      // 02f: lxor
      // 030: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokespecial tao.<init> (Ljava/lang/String;)V
      // 039: invokevirtual hv0.g8c (Lekw;)V
      // 03c: iload 4
      // 03e: ifne 362
      // 041: goto 048
      // 044: invokestatic t7e$1.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: goto 050
      // 04c: invokestatic t7e$1.a (Loov;)Loov;
      // 04f: athrow
      // 050: bipush 1
      // 051: putfield t7e$1.ze5 Z
      // 054: aload 1
      // 055: invokevirtual net/minecraft/network/status/server/S00PacketServerInfo.vni ()Lzuz;
      // 058: astore 5
      // 05a: iload 4
      // 05c: ifeq 086
      // 05f: aload 5
      // 061: invokevirtual zuz.q40 ()Lekw;
      // 064: ifnull 08b
      // 067: goto 06e
      // 06a: invokestatic t7e$1.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield t7e$1.ept Lr1l;
      // 072: aload 5
      // 074: invokevirtual zuz.q40 ()Lekw;
      // 077: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 07c: putfield r1l.o_g Ljava/lang/String;
      // 07f: goto 086
      // 082: invokestatic t7e$1.a (Loov;)Loov;
      // 085: athrow
      // 086: iload 4
      // 088: ifne 09c
      // 08b: aload 0
      // 08c: getfield t7e$1.ept Lr1l;
      // 08f: ldc ""
      // 091: nop
      // 092: putfield r1l.o_g Ljava/lang/String;
      // 095: goto 09c
      // 098: invokestatic t7e$1.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 5
      // 09e: invokevirtual zuz.mbk ()Lzuz$hr7;
      // 0a1: ifnull 0ce
      // 0a4: aload 0
      // 0a5: getfield t7e$1.ept Lr1l;
      // 0a8: aload 5
      // 0aa: invokevirtual zuz.mbk ()Lzuz$hr7;
      // 0ad: invokevirtual zuz$hr7.q0o ()Ljava/lang/String;
      // 0b0: putfield r1l.o5_ Ljava/lang/String;
      // 0b3: aload 0
      // 0b4: getfield t7e$1.ept Lr1l;
      // 0b7: aload 5
      // 0b9: invokevirtual zuz.mbk ()Lzuz$hr7;
      // 0bc: invokevirtual zuz$hr7.z78 ()I
      // 0bf: putfield r1l.e39 I
      // 0c2: iload 4
      // 0c4: ifne 0f2
      // 0c7: goto 0ce
      // 0ca: invokestatic t7e$1.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield t7e$1.ept Lr1l;
      // 0d2: sipush 21356
      // 0d5: ldc2_w 3987783039425986500
      // 0d8: lload 2
      // 0d9: lxor
      // 0da: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: putfield r1l.o5_ Ljava/lang/String;
      // 0e3: aload 0
      // 0e4: getfield t7e$1.ept Lr1l;
      // 0e7: bipush 0
      // 0e8: putfield r1l.e39 I
      // 0eb: goto 0f2
      // 0ee: invokestatic t7e$1.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 5
      // 0f4: invokevirtual zuz.qor ()Lzuz$fkd;
      // 0f7: iload 4
      // 0f9: ifeq 169
      // 0fc: ifnull 274
      // 0ff: goto 106
      // 102: invokestatic t7e$1.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield t7e$1.ept Lr1l;
      // 10a: new java/lang/StringBuilder
      // 10d: dup
      // 10e: invokespecial java/lang/StringBuilder.<init> ()V
      // 111: getstatic syo.qiz Lsyo;
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 117: ldc ""
      // 119: nop
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: aload 5
      // 11f: invokevirtual zuz.qor ()Lzuz$fkd;
      // 122: invokevirtual zuz$fkd.ryi ()I
      // 125: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 128: ldc ""
      // 12a: nop
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: getstatic syo.pgp Lsyo;
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 134: ldc "/"
      // 136: nop
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: getstatic syo.qiz Lsyo;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 140: aload 5
      // 142: invokevirtual zuz.qor ()Lzuz$fkd;
      // 145: invokevirtual zuz$fkd.own ()I
      // 148: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 14b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14e: putfield r1l.y17 Ljava/lang/String;
      // 151: aload 5
      // 153: iload 4
      // 155: ifeq 2a5
      // 158: goto 15f
      // 15b: invokestatic t7e$1.a (Loov;)Loov;
      // 15e: athrow
      // 15f: invokevirtual zuz.qor ()Lzuz$fkd;
      // 162: goto 169
      // 165: invokestatic t7e$1.a (Loov;)Loov;
      // 168: athrow
      // 169: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 16c: invokestatic org/apache/commons/lang3/ArrayUtils.isNotEmpty ([Ljava/lang/Object;)Z
      // 16f: ifeq 2a3
      // 172: new java/lang/StringBuilder
      // 175: dup
      // 176: invokespecial java/lang/StringBuilder.<init> ()V
      // 179: astore 6
      // 17b: aload 5
      // 17d: invokevirtual zuz.qor ()Lzuz$fkd;
      // 180: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 183: astore 7
      // 185: aload 7
      // 187: arraylength
      // 188: istore 8
      // 18a: bipush 0
      // 18b: istore 9
      // 18d: iload 9
      // 18f: iload 8
      // 191: if_icmpge 1de
      // 194: aload 7
      // 196: iload 9
      // 198: aaload
      // 199: astore 10
      // 19b: aload 6
      // 19d: iload 4
      // 19f: ifeq 1d5
      // 1a2: invokevirtual java/lang/StringBuilder.length ()I
      // 1a5: iload 4
      // 1a7: ifeq 1e7
      // 1aa: goto 1b1
      // 1ad: invokestatic t7e$1.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: ifle 1cb
      // 1b4: goto 1bb
      // 1b7: invokestatic t7e$1.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: aload 6
      // 1bd: ldc "\n"
      // 1bf: nop
      // 1c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c3: pop
      // 1c4: goto 1cb
      // 1c7: invokestatic t7e$1.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: aload 6
      // 1cd: aload 10
      // 1cf: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 1d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d5: pop
      // 1d6: iinc 9 1
      // 1d9: iload 4
      // 1db: ifne 18d
      // 1de: aload 5
      // 1e0: invokevirtual zuz.qor ()Lzuz$fkd;
      // 1e3: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 1e6: arraylength
      // 1e7: iload 4
      // 1e9: ifeq 216
      // 1ec: aload 5
      // 1ee: invokevirtual zuz.qor ()Lzuz$fkd;
      // 1f1: invokevirtual zuz$fkd.ryi ()I
      // 1f4: if_icmpge 263
      // 1f7: goto 1fe
      // 1fa: invokestatic t7e$1.a (Loov;)Loov;
      // 1fd: athrow
      // 1fe: aload 6
      // 200: iload 4
      // 202: ifeq 262
      // 205: goto 20c
      // 208: invokestatic t7e$1.a (Loov;)Loov;
      // 20b: athrow
      // 20c: invokevirtual java/lang/StringBuilder.length ()I
      // 20f: goto 216
      // 212: invokestatic t7e$1.a (Loov;)Loov;
      // 215: athrow
      // 216: ifle 229
      // 219: aload 6
      // 21b: ldc "\n"
      // 21d: nop
      // 21e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 221: pop
      // 222: goto 229
      // 225: invokestatic t7e$1.a (Loov;)Loov;
      // 228: athrow
      // 229: aload 6
      // 22b: sipush 10439
      // 22e: ldc2_w 5691066439493567595
      // 231: lload 2
      // 232: lxor
      // 233: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: nop
      // 239: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23c: aload 5
      // 23e: invokevirtual zuz.qor ()Lzuz$fkd;
      // 241: invokevirtual zuz$fkd.ryi ()I
      // 244: aload 5
      // 246: invokevirtual zuz.qor ()Lzuz$fkd;
      // 249: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 24c: arraylength
      // 24d: isub
      // 24e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 251: sipush 8722
      // 254: ldc2_w 6975961974472003250
      // 257: lload 2
      // 258: lxor
      // 259: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: nop
      // 25f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 262: pop
      // 263: aload 0
      // 264: getfield t7e$1.ept Lr1l;
      // 267: aload 6
      // 269: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 26c: putfield r1l.pmw Ljava/lang/String;
      // 26f: iload 4
      // 271: ifne 2a3
      // 274: aload 0
      // 275: getfield t7e$1.ept Lr1l;
      // 278: new java/lang/StringBuilder
      // 27b: dup
      // 27c: invokespecial java/lang/StringBuilder.<init> ()V
      // 27f: getstatic syo.pgp Lsyo;
      // 282: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 285: sipush 25378
      // 288: ldc2_w 3424965274531565452
      // 28b: lload 2
      // 28c: lxor
      // 28d: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: nop
      // 293: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 296: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 299: putfield r1l.y17 Ljava/lang/String;
      // 29c: goto 2a3
      // 29f: invokestatic t7e$1.a (Loov;)Loov;
      // 2a2: athrow
      // 2a3: aload 5
      // 2a5: invokevirtual zuz.jbn ()Ljava/lang/String;
      // 2a8: iload 4
      // 2aa: ifeq 2c3
      // 2ad: ifnull 332
      // 2b0: goto 2b7
      // 2b3: invokestatic t7e$1.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: aload 5
      // 2b9: invokevirtual zuz.jbn ()Ljava/lang/String;
      // 2bc: goto 2c3
      // 2bf: invokestatic t7e$1.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: astore 6
      // 2c5: iload 4
      // 2c7: ifeq 30b
      // 2ca: aload 6
      // 2cc: sipush 16098
      // 2cf: ldc2_w 6164050560951734849
      // 2d2: lload 2
      // 2d3: lxor
      // 2d4: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: nop
      // 2da: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2dd: ifeq 310
      // 2e0: goto 2e7
      // 2e3: invokestatic t7e$1.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: aload 0
      // 2e8: getfield t7e$1.ept Lr1l;
      // 2eb: aload 6
      // 2ed: sipush 19984
      // 2f0: ldc2_w 6929288635502535359
      // 2f3: lload 2
      // 2f4: lxor
      // 2f5: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fa: nop
      // 2fb: invokevirtual java/lang/String.length ()I
      // 2fe: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 301: invokevirtual r1l.nla (Ljava/lang/String;)V
      // 304: goto 30b
      // 307: invokestatic t7e$1.a (Loov;)Loov;
      // 30a: athrow
      // 30b: iload 4
      // 30d: ifne 32d
      // 310: invokestatic t7e.g75 ()Lorg/apache/logging/log4j/Logger;
      // 313: sipush 709
      // 316: ldc2_w 5544677250081681004
      // 319: lload 2
      // 31a: lxor
      // 31b: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: nop
      // 321: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 326: goto 32d
      // 329: invokestatic t7e$1.a (Loov;)Loov;
      // 32c: athrow
      // 32d: iload 4
      // 32f: ifne 344
      // 332: aload 0
      // 333: getfield t7e$1.ept Lr1l;
      // 336: aconst_null
      // 337: checkcast java/lang/String
      // 33a: invokevirtual r1l.nla (Ljava/lang/String;)V
      // 33d: goto 344
      // 340: invokestatic t7e$1.a (Loov;)Loov;
      // 343: athrow
      // 344: aload 0
      // 345: invokestatic c05.qgs ()J
      // 348: putfield t7e$1.ns6 J
      // 34b: aload 0
      // 34c: getfield t7e$1.bom Lhv0;
      // 34f: new net/minecraft/network/status/client/C01PacketPing
      // 352: dup
      // 353: aload 0
      // 354: getfield t7e$1.ns6 J
      // 357: invokespecial net/minecraft/network/status/client/C01PacketPing.<init> (J)V
      // 35a: invokevirtual hv0.k7f (Lmz2;)V
      // 35d: aload 0
      // 35e: bipush 1
      // 35f: putfield t7e$1.orj Z
      // 362: return
   }

   @Override
   public void bj7(S01PacketPong var1) {
      long var2 = a ^ 7574593793674L;
      long var4 = this.ns6;
      long var6 = c05.qgs();
      this.ept.zab = var6 - var4;
      this.bom.g8c(new tao(a<"r">(6198, 7119262189307836588L ^ var2)));
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
      // 00: getstatic t7e$1.a J
      // 03: ldc2_w 20312596281322
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne a1
      // 13: getfield t7e$1.orj Z
      // 16: ifne ab
      // 19: goto 20
      // 1c: invokestatic t7e$1.a (Loov;)Loov;
      // 1f: athrow
      // 20: invokestatic t7e.g75 ()Lorg/apache/logging/log4j/Logger;
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: sipush 31729
      // 2d: ldc2_w 1699046317533577735
      // 30: lload 2
      // 31: lxor
      // 32: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: nop
      // 38: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b: aload 0
      // 3c: getfield t7e$1.ept Lr1l;
      // 3f: getfield r1l.s4c Ljava/lang/String;
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45: sipush 3043
      // 48: ldc2_w 1976006912508211730
      // 4b: lload 2
      // 4c: lxor
      // 4d: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: nop
      // 53: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56: aload 1
      // 57: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 62: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 67: aload 0
      // 68: getfield t7e$1.ept Lr1l;
      // 6b: new java/lang/StringBuilder
      // 6e: dup
      // 6f: invokespecial java/lang/StringBuilder.<init> ()V
      // 72: getstatic syo.id3 Lsyo;
      // 75: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 78: sipush 6082
      // 7b: ldc2_w 7995552297635524146
      // 7e: lload 2
      // 7f: lxor
      // 80: invokedynamic r (IJ)Ljava/lang/String; bsm=t7e$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: nop
      // 86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8c: putfield r1l.o_g Ljava/lang/String;
      // 8f: aload 0
      // 90: getfield t7e$1.ept Lr1l;
      // 93: ldc ""
      // 95: nop
      // 96: putfield r1l.y17 Ljava/lang/String;
      // 99: aload 0
      // 9a: goto a1
      // 9d: invokestatic t7e$1.a (Loov;)Loov;
      // a0: athrow
      // a1: getfield t7e$1.xji Lt7e;
      // a4: aload 0
      // a5: getfield t7e$1.ept Lr1l;
      // a8: invokestatic t7e.t0p (Lt7e;Lr1l;)V
      // ab: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2247634887149778409L, -8333518027273973835L, MethodHandles.lookup().lookupClass()).a(60037502655119L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 102172009331177L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "Cï\u000fÃX>Ú\u008dà¦þ#+\u0085\u00adY@I08ô\u009b\u0011Ø¥oÉÃäÔ\u0080sÜÖ\u0012gµN®õÔx\\w08úÙ&\u0013\rfÐ\u0082H\u0083Ñ@\u007fú\u0015.\u001b\u0005\u0005±ñ-\u0006 ¯`\u0019_\nd$sO'j\u0010þ\u001dª®;+E\u0019öf0\u0081\b\u0082æ¯8±\u0014Ë¢'öÿv`&ÉKÄ@ëj\u0088:_VDÅÛ0¥_ï\u000f\u009fú×·\u000b¥\t\u0092Ç-}·\u0085³÷^ã\u0096Ã©\u007fÁ«\u000bÖÝÁç U=ÿxÕ\u0014\u0016\u0001÷33CÈ\u0010i&\u0094$\u001ag\u0015M\u0095\u0091Ýo\u0087\u008e\u0000¾qÖ 3-/)5\u0005Ú\u009f3ôö\u0080yµu>7R§FÑ`,Þ;\u0017È\u0083iøN\u0000\u0010\u001da\u0082Iï\u009câ\u0092[Â6¨\u0098Ê}\u001b(\u001fô\u001f\fÕ\u009eõ\u0098¨±\u009cÖ¯wEÊp\b\u007fÇT\u008bgV\nÔ<^\u001aO\u0006Ù|\u008eU²·o\u009aÑ\u0018¯\u0012\u009a\u0087;ÈDqNd)]´e\u0097ÛÂ\\À&êv\u0002¢\u0018`OUAò\fÇ\u000e×=qhïÑ6ç\u008b\u0087O¤\u0016òýR";
      int var8 = "Cï\u000fÃX>Ú\u008dà¦þ#+\u0085\u00adY@I08ô\u009b\u0011Ø¥oÉÃäÔ\u0080sÜÖ\u0012gµN®õÔx\\w08úÙ&\u0013\rfÐ\u0082H\u0083Ñ@\u007fú\u0015.\u001b\u0005\u0005±ñ-\u0006 ¯`\u0019_\nd$sO'j\u0010þ\u001dª®;+E\u0019öf0\u0081\b\u0082æ¯8±\u0014Ë¢'öÿv`&ÉKÄ@ëj\u0088:_VDÅÛ0¥_ï\u000f\u009fú×·\u000b¥\t\u0092Ç-}·\u0085³÷^ã\u0096Ã©\u007fÁ«\u000bÖÝÁç U=ÿxÕ\u0014\u0016\u0001÷33CÈ\u0010i&\u0094$\u001ag\u0015M\u0095\u0091Ýo\u0087\u008e\u0000¾qÖ 3-/)5\u0005Ú\u009f3ôö\u0080yµu>7R§FÑ`,Þ;\u0017È\u0083iøN\u0000\u0010\u001da\u0082Iï\u009câ\u0092[Â6¨\u0098Ê}\u001b(\u001fô\u001f\fÕ\u009eõ\u0098¨±\u009cÖ¯wEÊp\b\u007fÇT\u008bgV\nÔ<^\u001aO\u0006Ù|\u008eU²·o\u009aÑ\u0018¯\u0012\u009a\u0087;ÈDqNd)]´e\u0097ÛÂ\\À&êv\u0002¢\u0018`OUAò\fÇ\u000e×=qhïÑ6ç\u008b\u0087O¤\u0016òýR"
         .length();
      char var5 = 16;
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
                     c = new String[12];
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

                  var6 = "OXK\u009b«Y¨\n©`\u009bàµu\u009a\u0093Õ¤\u001cµ7T^\u0093\u0083X=\u008eGù\u0019[ÅËc^Là\u0093\u0002õ`ÒfÏ\u000fG\u001d\u0089ã´yãcV×(´äìC\u00819\u0094\u001cÑO¸Ñ}9\u001b\u0099l§¹1`|\u0002~E\u009a\u001a|@ë°\u0093T¸×Q£2¯\u0010";
                  var8 = "OXK\u009b«Y¨\n©`\u009bàµu\u009a\u0093Õ¤\u001cµ7T^\u0093\u0083X=\u008eGù\u0019[ÅËc^Là\u0093\u0002õ`ÒfÏ\u000fG\u001d\u0089ã´yãcV×(´äìC\u00819\u0094\u001cÑO¸Ñ}9\u001b\u0099l§¹1`|\u0002~E\u009a\u001a|@ë°\u0093T¸×Q£2¯\u0010"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12676;
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
            throw new RuntimeException("t7e$1", var10);
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
         throw new RuntimeException("t7e$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
