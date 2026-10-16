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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nrk extends zg9 {
   private static final Logger m8a;
   private static final gdz zjq;
   private rsi h3c;
   private nrk$umh kot;
   private boolean vq2;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public nrk(jnq var1, rsi var2) {
      super(new je4(var1, var2));
      this.h3c = var2;
      this.poy = 230;
      this.g6l = 219;
   }

   @Override
   public void initGui() {
      super.initGui();
      this.khf.add(this.kot = new nrk$umh(this, -1, this.tjm + 164, this.___ + 107));
      this.khf.add(new nrk$sgu(this, -2, this.tjm + 190, this.___ + 107));
      this.vq2 = true;
      this.kot.c9a = false;
   }

   @Override
   public void updateScreen() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial zg9.updateScreen ()V
      // 004: aload 0
      // 005: getfield nrk.h3c Lrsi;
      // 008: bipush 0
      // 009: invokeinterface rsi.czu (I)I 2
      // 00e: istore 2
      // 00f: invokestatic t9d.b ()I
      // 012: aload 0
      // 013: getfield nrk.h3c Lrsi;
      // 016: bipush 1
      // 017: invokeinterface rsi.czu (I)I 2
      // 01c: istore 3
      // 01d: aload 0
      // 01e: getfield nrk.h3c Lrsi;
      // 021: bipush 2
      // 022: invokeinterface rsi.czu (I)I 2
      // 027: istore 4
      // 029: istore 1
      // 02a: aload 0
      // 02b: iload 1
      // 02c: ifeq 267
      // 02f: getfield nrk.vq2 Z
      // 032: ifeq 266
      // 035: goto 03c
      // 038: invokestatic nrk.a (Loov;)Loov;
      // 03b: athrow
      // 03c: iload 2
      // 03d: iload 1
      // 03e: ifeq 05f
      // 041: goto 048
      // 044: invokestatic nrk.a (Loov;)Loov;
      // 047: athrow
      // 048: iflt 266
      // 04b: goto 052
      // 04e: invokestatic nrk.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: bipush 0
      // 054: putfield nrk.vq2 Z
      // 057: bipush 0
      // 058: goto 05f
      // 05b: invokestatic nrk.a (Loov;)Loov;
      // 05e: athrow
      // 05f: istore 5
      // 061: iload 5
      // 063: bipush 2
      // 064: if_icmpgt 129
      // 067: getstatic net/minecraft/tileentity/TileEntityBeacon.llb [[Lmcs;
      // 06a: iload 5
      // 06c: aaload
      // 06d: arraylength
      // 06e: istore 6
      // 070: iload 6
      // 072: bipush 22
      // 074: imul
      // 075: iload 6
      // 077: bipush 1
      // 078: isub
      // 079: bipush 2
      // 07a: imul
      // 07b: iadd
      // 07c: istore 7
      // 07e: bipush 0
      // 07f: iload 1
      // 080: ifeq 146
      // 083: istore 8
      // 085: iload 8
      // 087: iload 6
      // 089: if_icmpge 122
      // 08c: getstatic net/minecraft/tileentity/TileEntityBeacon.llb [[Lmcs;
      // 08f: iload 5
      // 091: aaload
      // 092: iload 8
      // 094: aaload
      // 095: getfield mcs.zr9 I
      // 098: istore 9
      // 09a: new nrk$n3g
      // 09d: dup
      // 09e: aload 0
      // 09f: iload 5
      // 0a1: bipush 8
      // 0a3: ishl
      // 0a4: iload 9
      // 0a6: ior
      // 0a7: aload 0
      // 0a8: getfield nrk.tjm I
      // 0ab: bipush 76
      // 0ad: iadd
      // 0ae: iload 8
      // 0b0: bipush 24
      // 0b2: imul
      // 0b3: iadd
      // 0b4: iload 7
      // 0b6: bipush 2
      // 0b7: idiv
      // 0b8: isub
      // 0b9: aload 0
      // 0ba: getfield nrk.___ I
      // 0bd: bipush 22
      // 0bf: iadd
      // 0c0: iload 5
      // 0c2: bipush 25
      // 0c4: imul
      // 0c5: iadd
      // 0c6: iload 9
      // 0c8: iload 5
      // 0ca: invokespecial nrk$n3g.<init> (Lnrk;IIIII)V
      // 0cd: astore 10
      // 0cf: aload 0
      // 0d0: getfield nrk.khf Ljava/util/List;
      // 0d3: aload 10
      // 0d5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0da: pop
      // 0db: iload 5
      // 0dd: iload 2
      // 0de: iload 1
      // 0df: ifeq 064
      // 0e2: iload 1
      // 0e3: ifeq 10b
      // 0e6: if_icmplt 101
      // 0e9: goto 0f0
      // 0ec: invokestatic nrk.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 10
      // 0f2: bipush 0
      // 0f3: putfield nrk$n3g.c9a Z
      // 0f6: iload 1
      // 0f7: ifne 11b
      // 0fa: goto 101
      // 0fd: invokestatic nrk.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 9
      // 103: iload 3
      // 104: goto 10b
      // 107: invokestatic nrk.a (Loov;)Loov;
      // 10a: athrow
      // 10b: if_icmpne 11b
      // 10e: aload 10
      // 110: bipush 1
      // 111: invokevirtual nrk$n3g.n_c (Z)V
      // 114: goto 11b
      // 117: invokestatic nrk.a (Loov;)Loov;
      // 11a: athrow
      // 11b: iinc 8 1
      // 11e: iload 1
      // 11f: ifne 085
      // 122: iinc 5 1
      // 125: iload 1
      // 126: ifne 061
      // 129: bipush 3
      // 12a: istore 5
      // 12c: getstatic net/minecraft/tileentity/TileEntityBeacon.llb [[Lmcs;
      // 12f: iload 5
      // 131: aaload
      // 132: arraylength
      // 133: bipush 1
      // 134: iadd
      // 135: istore 6
      // 137: iload 6
      // 139: bipush 22
      // 13b: imul
      // 13c: iload 6
      // 13e: bipush 1
      // 13f: isub
      // 140: bipush 2
      // 141: imul
      // 142: iadd
      // 143: istore 7
      // 145: bipush 0
      // 146: istore 8
      // 148: iload 8
      // 14a: iload 6
      // 14c: bipush 1
      // 14d: isub
      // 14e: if_icmpge 1ea
      // 151: getstatic net/minecraft/tileentity/TileEntityBeacon.llb [[Lmcs;
      // 154: iload 5
      // 156: aaload
      // 157: iload 8
      // 159: aaload
      // 15a: getfield mcs.zr9 I
      // 15d: istore 9
      // 15f: new nrk$n3g
      // 162: dup
      // 163: aload 0
      // 164: iload 5
      // 166: bipush 8
      // 168: ishl
      // 169: iload 9
      // 16b: ior
      // 16c: aload 0
      // 16d: getfield nrk.tjm I
      // 170: sipush 167
      // 173: iadd
      // 174: iload 8
      // 176: bipush 24
      // 178: imul
      // 179: iadd
      // 17a: iload 7
      // 17c: bipush 2
      // 17d: idiv
      // 17e: isub
      // 17f: aload 0
      // 180: getfield nrk.___ I
      // 183: bipush 47
      // 185: iadd
      // 186: iload 9
      // 188: iload 5
      // 18a: invokespecial nrk$n3g.<init> (Lnrk;IIIII)V
      // 18d: astore 10
      // 18f: aload 0
      // 190: getfield nrk.khf Ljava/util/List;
      // 193: aload 10
      // 195: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 19a: pop
      // 19b: iload 5
      // 19d: iload 1
      // 19e: ifeq 1eb
      // 1a1: iload 2
      // 1a2: iload 1
      // 1a3: ifeq 1d3
      // 1a6: goto 1ad
      // 1a9: invokestatic nrk.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: if_icmplt 1c8
      // 1b0: goto 1b7
      // 1b3: invokestatic nrk.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 10
      // 1b9: bipush 0
      // 1ba: putfield nrk$n3g.c9a Z
      // 1bd: iload 1
      // 1be: ifne 1e3
      // 1c1: goto 1c8
      // 1c4: invokestatic nrk.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: iload 9
      // 1ca: iload 4
      // 1cc: goto 1d3
      // 1cf: invokestatic nrk.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: if_icmpne 1e3
      // 1d6: aload 10
      // 1d8: bipush 1
      // 1d9: invokevirtual nrk$n3g.n_c (Z)V
      // 1dc: goto 1e3
      // 1df: invokestatic nrk.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: iinc 8 1
      // 1e6: iload 1
      // 1e7: ifne 148
      // 1ea: iload 3
      // 1eb: ifle 266
      // 1ee: new nrk$n3g
      // 1f1: dup
      // 1f2: aload 0
      // 1f3: iload 5
      // 1f5: bipush 8
      // 1f7: ishl
      // 1f8: iload 3
      // 1f9: ior
      // 1fa: aload 0
      // 1fb: getfield nrk.tjm I
      // 1fe: sipush 167
      // 201: iadd
      // 202: iload 6
      // 204: bipush 1
      // 205: isub
      // 206: bipush 24
      // 208: imul
      // 209: iadd
      // 20a: iload 7
      // 20c: bipush 2
      // 20d: idiv
      // 20e: isub
      // 20f: aload 0
      // 210: getfield nrk.___ I
      // 213: bipush 47
      // 215: iadd
      // 216: iload 3
      // 217: iload 5
      // 219: invokespecial nrk$n3g.<init> (Lnrk;IIIII)V
      // 21c: astore 8
      // 21e: aload 0
      // 21f: getfield nrk.khf Ljava/util/List;
      // 222: aload 8
      // 224: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 229: pop
      // 22a: iload 5
      // 22c: iload 2
      // 22d: iload 1
      // 22e: ifeq 256
      // 231: if_icmplt 24c
      // 234: goto 23b
      // 237: invokestatic nrk.a (Loov;)Loov;
      // 23a: athrow
      // 23b: aload 8
      // 23d: bipush 0
      // 23e: putfield nrk$n3g.c9a Z
      // 241: iload 1
      // 242: ifne 266
      // 245: goto 24c
      // 248: invokestatic nrk.a (Loov;)Loov;
      // 24b: athrow
      // 24c: iload 3
      // 24d: iload 4
      // 24f: goto 256
      // 252: invokestatic nrk.a (Loov;)Loov;
      // 255: athrow
      // 256: if_icmpne 266
      // 259: aload 8
      // 25b: bipush 1
      // 25c: invokevirtual nrk$n3g.n_c (Z)V
      // 25f: goto 266
      // 262: invokestatic nrk.a (Loov;)Loov;
      // 265: athrow
      // 266: aload 0
      // 267: getfield nrk.kot Lnrk$umh;
      // 26a: aload 0
      // 26b: getfield nrk.h3c Lrsi;
      // 26e: bipush 0
      // 26f: invokeinterface rsi.ibn (I)Lerg; 2
      // 274: ifnull 291
      // 277: iload 3
      // 278: iload 1
      // 279: ifeq 28e
      // 27c: goto 283
      // 27f: invokestatic nrk.a (Loov;)Loov;
      // 282: athrow
      // 283: ifle 291
      // 286: goto 28d
      // 289: invokestatic nrk.a (Loov;)Loov;
      // 28c: athrow
      // 28d: bipush 1
      // 28e: goto 292
      // 291: bipush 0
      // 292: putfield nrk$umh.c9a Z
      // 295: return
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nrk.a J
      // 003: ldc2_w 65338313879087
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield gt4._me I
      // 011: bipush -2
      // 013: iload 4
      // 015: ifeq 051
      // 018: if_icmpne 039
      // 01b: goto 022
      // 01e: invokestatic nrk.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: getfield nrk.f41 Lc05;
      // 026: aconst_null
      // 027: checkcast gbe
      // 02a: invokevirtual c05.z2i (Lgbe;)V
      // 02d: iload 4
      // 02f: ifne 150
      // 032: goto 039
      // 035: invokestatic nrk.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 1
      // 03a: getfield gt4._me I
      // 03d: iload 4
      // 03f: ifeq 0c0
      // 042: goto 049
      // 045: invokestatic nrk.a (Loov;)Loov;
      // 048: athrow
      // 049: bipush -1
      // 04a: goto 051
      // 04d: invokestatic nrk.a (Loov;)Loov;
      // 050: athrow
      // 051: if_icmpne 0b5
      // 054: sipush 12900
      // 057: ldc2_w 184034601328332591
      // 05a: lload 2
      // 05b: lxor
      // 05c: invokedynamic j (IJ)Ljava/lang/String; bsm=nrk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: astore 5
      // 064: new nfj
      // 067: dup
      // 068: invokestatic io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
      // 06b: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 06e: astore 6
      // 070: aload 6
      // 072: aload 0
      // 073: getfield nrk.h3c Lrsi;
      // 076: bipush 1
      // 077: invokeinterface rsi.czu (I)I 2
      // 07c: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 07f: pop
      // 080: aload 6
      // 082: aload 0
      // 083: getfield nrk.h3c Lrsi;
      // 086: bipush 2
      // 087: invokeinterface rsi.czu (I)I 2
      // 08c: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 08f: pop
      // 090: aload 0
      // 091: getfield nrk.f41 Lc05;
      // 094: invokevirtual c05.c02 ()Lp_k;
      // 097: new net/minecraft/network/play/client/C17PacketCustomPayload
      // 09a: dup
      // 09b: aload 5
      // 09d: aload 6
      // 09f: invokespecial net/minecraft/network/play/client/C17PacketCustomPayload.<init> (Ljava/lang/String;Lnfj;)V
      // 0a2: invokevirtual p_k.sxi (Lmz2;)V
      // 0a5: aload 0
      // 0a6: getfield nrk.f41 Lc05;
      // 0a9: aconst_null
      // 0aa: checkcast gbe
      // 0ad: invokevirtual c05.z2i (Lgbe;)V
      // 0b0: iload 4
      // 0b2: ifne 150
      // 0b5: aload 1
      // 0b6: instanceof nrk$n3g
      // 0b9: goto 0c0
      // 0bc: invokestatic nrk.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 4
      // 0c2: ifeq 0dd
      // 0c5: ifeq 150
      // 0c8: goto 0cf
      // 0cb: invokestatic nrk.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 1
      // 0d0: checkcast nrk$n3g
      // 0d3: invokevirtual nrk$n3g.m4g ()Z
      // 0d6: goto 0dd
      // 0d9: invokestatic nrk.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: iload 4
      // 0df: ifeq 0f1
      // 0e2: ifeq 0ed
      // 0e5: goto 0ec
      // 0e8: invokestatic nrk.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: return
      // 0ed: aload 1
      // 0ee: getfield gt4._me I
      // 0f1: istore 5
      // 0f3: iload 5
      // 0f5: sipush 255
      // 0f8: iand
      // 0f9: istore 6
      // 0fb: iload 5
      // 0fd: bipush 8
      // 0ff: ishr
      // 100: istore 7
      // 102: iload 4
      // 104: ifeq 127
      // 107: iload 7
      // 109: bipush 3
      // 10a: if_icmpge 12c
      // 10d: goto 114
      // 110: invokestatic nrk.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 0
      // 115: getfield nrk.h3c Lrsi;
      // 118: bipush 1
      // 119: iload 6
      // 11b: invokeinterface rsi.r8i (II)V 3
      // 120: goto 127
      // 123: invokestatic nrk.a (Loov;)Loov;
      // 126: athrow
      // 127: iload 4
      // 129: ifne 13f
      // 12c: aload 0
      // 12d: getfield nrk.h3c Lrsi;
      // 130: bipush 2
      // 131: iload 6
      // 133: invokeinterface rsi.r8i (II)V 3
      // 138: goto 13f
      // 13b: invokestatic nrk.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: getfield nrk.khf Ljava/util/List;
      // 143: invokeinterface java/util/List.clear ()V 1
      // 148: aload 0
      // 149: invokevirtual nrk.initGui ()V
      // 14c: aload 0
      // 14d: invokevirtual nrk.updateScreen ()V
      // 150: return
   }

   @Override
   public void qw3(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nrk.a J
      // 03: ldc2_w 123507577669833
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic qpm.cng ()V
      // 0b: invokestatic t9d.c ()I
      // 0e: aload 0
      // 0f: aload 0
      // 10: getfield nrk.fex Lowt;
      // 13: sipush 21451
      // 16: ldc2_w 838980084085377127
      // 19: lload 3
      // 1a: lxor
      // 1b: invokedynamic j (IJ)Ljava/lang/String; bsm=nrk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: bipush 0
      // 22: anewarray 189
      // 25: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 28: bipush 62
      // 2a: bipush 10
      // 2c: ldc 14737632
      // 2e: nop
      // 2f: invokevirtual nrk.poi (Lowt;Ljava/lang/String;III)V
      // 32: istore 5
      // 34: aload 0
      // 35: aload 0
      // 36: getfield nrk.fex Lowt;
      // 39: sipush 22522
      // 3c: ldc2_w 6320919771999292501
      // 3f: lload 3
      // 40: lxor
      // 41: invokedynamic j (IJ)Ljava/lang/String; bsm=nrk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: bipush 0
      // 48: anewarray 189
      // 4b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4e: sipush 169
      // 51: bipush 10
      // 53: ldc 14737632
      // 55: nop
      // 56: invokevirtual nrk.poi (Lowt;Ljava/lang/String;III)V
      // 59: aload 0
      // 5a: getfield nrk.khf Ljava/util/List;
      // 5d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 62: astore 6
      // 64: aload 6
      // 66: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6b: ifeq c3
      // 6e: aload 6
      // 70: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 75: checkcast gt4
      // 78: astore 7
      // 7a: iload 5
      // 7c: ifne c6
      // 7f: aload 7
      // 81: iload 5
      // 83: ifne a3
      // 86: goto 8d
      // 89: invokestatic nrk.a (Loov;)Loov;
      // 8c: athrow
      // 8d: invokevirtual gt4.n5l ()Z
      // 90: ifeq b7
      // 93: goto 9a
      // 96: invokestatic nrk.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 7
      // 9c: goto a3
      // 9f: invokestatic nrk.a (Loov;)Loov;
      // a2: athrow
      // a3: iload 1
      // a4: aload 0
      // a5: getfield nrk.tjm I
      // a8: isub
      // a9: iload 2
      // aa: aload 0
      // ab: getfield nrk.___ I
      // ae: isub
      // af: invokevirtual gt4.ssq (II)V
      // b2: iload 5
      // b4: ifeq c3
      // b7: iload 5
      // b9: ifeq 64
      // bc: goto c3
      // bf: invokestatic nrk.a (Loov;)Loov;
      // c2: athrow
      // c3: invokestatic qpm.gdb ()V
      // c6: return
   }

   @Override
   public void cft(float var1, int var2, int var3) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(zjq);
      int var4 = (this.dt7 - this.poy) / 2;
      int var5 = (this.o1e - this.g6l) / 2;
      this.mt4(var4, var5, 0, 0, this.poy, this.g6l);
      this.vs5.b3l = 100.0F;
      this.vs5.px5(new erg(xbr.cu7), var4 + 42, var5 + 109);
      this.vs5.px5(new erg(xbr.exg), var4 + 42 + 22, var5 + 109);
      this.vs5.px5(new erg(xbr.jtr), var4 + 42 + 44, var5 + 109);
      this.vs5.px5(new erg(xbr.icz), var4 + 42 + 66, var5 + 109);
      this.vs5.b3l = 0.0F;
   }

   public static gdz _7t() {
      return zjq;
   }

   public static void n4h(nrk var0, String var1, int var2, int var3) {
      var0.xhs(var1, var2, var3);
   }

   public static void kuk(nrk var0, String var1, int var2, int var3) {
      var0.xhs(var1, var2, var3);
   }

   public static void azs(nrk var0, String var1, int var2, int var3) {
      var0.xhs(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(360132595250332021L, -5414424418338067780L, MethodHandles.lookup().lookupClass()).a(86213382177640L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 119765275501730L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "´j¹óÏ%Uï!\u0004Ù\u0099\\ïÕdS%\u00ad#\n,LG\u001fKcñ]O\u0093Ù<:B\u009b²\u00120bHÛäH§\u0081\t=\u0012Bpk@H2Ë85Êt\u0007Õñ\u0081ö\u0086oYß\u0082Kð\u0081ÀÍ\u0007ÖýD0èQ5\\ì8Ç]k©Qý(\u0005Ìn\"\u0082\u0084v\u001ap\u0093o3\u0007\u008búAÎ/\u0018û";
      int var6 = "´j¹óÏ%Uï!\u0004Ù\u0099\\ïÕdS%\u00ad#\n,LG\u001fKcñ]O\u0093Ù<:B\u009b²\u00120bHÛäH§\u0081\t=\u0012Bpk@H2Ë85Êt\u0007Õñ\u0081ö\u0086oYß\u0082Kð\u0081ÀÍ\u0007ÖýD0èQ5\\ì8Ç]k©Qý(\u0005Ìn\"\u0082\u0084v\u001ap\u0093o3\u0007\u008búAÎ/\u0018û"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[4];
                     m8a = LogManager.getLogger();
                     zjq = new gdz(b<"j">(19189, 5773627803095203120L ^ var9));
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

                  var4 = "ó\u009dTùç·M¸ûRÂ5Ñ´VðNQå\u008dv=9Ó>\u0002\u0096w\nI¶°(ø\u0011\u0081Æ\u0085\u0010n_W«àò>?G·K¥\u001f|qÓ\u0001\u00adî\u0003°ËR\u0010ëF²U¿(\u008b\u0019®\u0010";
                  var6 = "ó\u009dTùç·M¸ûRÂ5Ñ´VðNQå\u008dv=9Ó>\u0002\u0096w\nI¶°(ø\u0011\u0081Æ\u0085\u0010n_W«àò>?G·K¥\u001f|qÓ\u0001\u00adî\u0003°ËR\u0010ëF²U¿(\u008b\u0019®\u0010"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8159;
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
            throw new RuntimeException("nrk", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("nrk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
