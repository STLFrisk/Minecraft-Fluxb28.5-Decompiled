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
import net.minecraft.tileentity.TileEntityBanner$swh;

public class z90$m8l implements ui9 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private z90$m8l() {
   }

   @Override
   public boolean mve(z0_ param1, t9d param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 4
      // 03: invokestatic t9d.b ()I
      // 06: bipush 0
      // 07: istore 5
      // 09: istore 3
      // 0a: iload 5
      // 0c: aload 1
      // 0d: invokevirtual z0_.opt ()I
      // 10: if_icmpge 8a
      // 13: aload 1
      // 14: iload 5
      // 16: invokevirtual z0_.ibn (I)Lerg;
      // 19: astore 6
      // 1b: iload 3
      // 1c: ifeq 9c
      // 1f: iload 3
      // 20: ifeq 86
      // 23: goto 2a
      // 26: invokestatic z90$m8l.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 6
      // 2c: ifnull 83
      // 2f: goto 36
      // 32: invokestatic z90$m8l.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 6
      // 38: invokevirtual erg.gn1 ()Lu7m;
      // 3b: getstatic xbr.ogp Lu7m;
      // 3e: if_acmpne 83
      // 41: goto 48
      // 44: invokestatic z90$m8l.a (Loov;)Loov;
      // 47: athrow
      // 48: iload 4
      // 4a: iload 3
      // 4b: ifeq 6a
      // 4e: goto 55
      // 51: invokestatic z90$m8l.a (Loov;)Loov;
      // 54: athrow
      // 55: ifeq 65
      // 58: goto 5f
      // 5b: invokestatic z90$m8l.a (Loov;)Loov;
      // 5e: athrow
      // 5f: bipush 0
      // 60: ireturn
      // 61: invokestatic z90$m8l.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 6
      // 67: invokestatic net/minecraft/tileentity/TileEntityBanner.v93 (Lerg;)I
      // 6a: iload 3
      // 6b: ifeq 81
      // 6e: bipush 6
      // 70: if_icmplt 80
      // 73: goto 7a
      // 76: invokestatic z90$m8l.a (Loov;)Loov;
      // 79: athrow
      // 7a: bipush 0
      // 7b: ireturn
      // 7c: invokestatic z90$m8l.a (Loov;)Loov;
      // 7f: athrow
      // 80: bipush 1
      // 81: istore 4
      // 83: iinc 5 1
      // 86: iload 3
      // 87: ifne 0a
      // 8a: iload 4
      // 8c: iload 3
      // 8d: ifeq 9b
      // 90: ifne 9c
      // 93: goto 9a
      // 96: invokestatic z90$m8l.a (Loov;)Loov;
      // 99: athrow
      // 9a: bipush 0
      // 9b: ireturn
      // 9c: aload 0
      // 9d: aload 1
      // 9e: invokespecial z90$m8l.wt1 (Lz0_;)Lnet/minecraft/tileentity/TileEntityBanner$swh;
      // a1: ifnull ac
      // a4: bipush 1
      // a5: goto ad
      // a8: invokestatic z90$m8l.a (Loov;)Loov;
      // ab: athrow
      // ac: bipush 0
      // ad: ireturn
   }

   @Override
   public erg hd0(z0_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z90$m8l.a J
      // 003: ldc2_w 115717573198898
      // 006: lxor
      // 007: lstore 2
      // 008: aconst_null
      // 009: astore 5
      // 00b: invokestatic t9d.b ()I
      // 00e: bipush 0
      // 00f: istore 6
      // 011: istore 4
      // 013: iload 6
      // 015: aload 1
      // 016: invokevirtual z0_.opt ()I
      // 019: if_icmpge 070
      // 01c: aload 1
      // 01d: iload 6
      // 01f: invokevirtual z0_.ibn (I)Lerg;
      // 022: astore 7
      // 024: iload 4
      // 026: ifeq 06d
      // 029: aload 7
      // 02b: ifnull 06a
      // 02e: goto 035
      // 031: invokestatic z90$m8l.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 7
      // 037: iload 4
      // 039: ifeq 05f
      // 03c: goto 043
      // 03f: invokestatic z90$m8l.a (Loov;)Loov;
      // 042: athrow
      // 043: invokevirtual erg.gn1 ()Lu7m;
      // 046: getstatic xbr.ogp Lu7m;
      // 049: if_acmpne 06a
      // 04c: goto 053
      // 04f: invokestatic z90$m8l.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 7
      // 055: invokevirtual erg.yaq ()Lerg;
      // 058: goto 05f
      // 05b: invokestatic z90$m8l.a (Loov;)Loov;
      // 05e: athrow
      // 05f: astore 5
      // 061: aload 5
      // 063: bipush 1
      // 064: putfield erg.qd2 I
      // 067: goto 070
      // 06a: iinc 6 1
      // 06d: goto 013
      // 070: aload 0
      // 071: aload 1
      // 072: invokespecial z90$m8l.wt1 (Lz0_;)Lnet/minecraft/tileentity/TileEntityBanner$swh;
      // 075: astore 6
      // 077: aload 6
      // 079: ifnull 1a9
      // 07c: bipush 0
      // 07d: istore 7
      // 07f: bipush 0
      // 080: istore 8
      // 082: iload 8
      // 084: aload 1
      // 085: invokevirtual z0_.opt ()I
      // 088: if_icmpge 0f0
      // 08b: aload 1
      // 08c: iload 8
      // 08e: invokevirtual z0_.ibn (I)Lerg;
      // 091: astore 9
      // 093: iload 4
      // 095: ifeq 0eb
      // 098: aload 9
      // 09a: iload 4
      // 09c: ifeq 0f2
      // 09f: goto 0a6
      // 0a2: invokestatic z90$m8l.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: ifnull 0e1
      // 0a9: goto 0b0
      // 0ac: invokestatic z90$m8l.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 9
      // 0b2: iload 4
      // 0b4: ifeq 0d7
      // 0b7: goto 0be
      // 0ba: invokestatic z90$m8l.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: invokevirtual erg.gn1 ()Lu7m;
      // 0c1: getstatic xbr.nnn Lu7m;
      // 0c4: if_acmpne 0e1
      // 0c7: goto 0ce
      // 0ca: invokestatic z90$m8l.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 9
      // 0d0: goto 0d7
      // 0d3: invokestatic z90$m8l.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: invokevirtual erg.j6_ ()I
      // 0da: istore 7
      // 0dc: iload 4
      // 0de: ifne 0f0
      // 0e1: iinc 8 1
      // 0e4: goto 0eb
      // 0e7: invokestatic z90$m8l.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: iload 4
      // 0ed: ifne 082
      // 0f0: aload 5
      // 0f2: sipush 9099
      // 0f5: ldc2_w 6958165422297686374
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic y (IJ)Ljava/lang/String; bsm=z90$m8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: bipush 1
      // 101: invokevirtual erg.o4p (Ljava/lang/String;Z)Lbdo;
      // 104: astore 8
      // 106: aconst_null
      // 107: astore 9
      // 109: aload 8
      // 10b: sipush 8533
      // 10e: ldc2_w 5312970140245369787
      // 111: lload 2
      // 112: lxor
      // 113: invokedynamic y (IJ)Ljava/lang/String; bsm=z90$m8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: nop
      // 119: bipush 9
      // 11b: iload 4
      // 11d: ifeq 146
      // 120: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 123: ifeq 14e
      // 126: goto 12d
      // 129: invokestatic z90$m8l.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 8
      // 12f: sipush 9823
      // 132: ldc2_w 4401273200176604339
      // 135: lload 2
      // 136: lxor
      // 137: invokedynamic y (IJ)Ljava/lang/String; bsm=z90$m8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: nop
      // 13d: bipush 10
      // 13f: goto 146
      // 142: invokestatic z90$m8l.a (Loov;)Loov;
      // 145: athrow
      // 146: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 149: astore 9
      // 14b: goto 16c
      // 14e: new qhg
      // 151: dup
      // 152: invokespecial qhg.<init> ()V
      // 155: astore 9
      // 157: aload 8
      // 159: sipush 9823
      // 15c: ldc2_w 4401273200176604339
      // 15f: lload 2
      // 160: lxor
      // 161: invokedynamic y (IJ)Ljava/lang/String; bsm=z90$m8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: nop
      // 167: aload 9
      // 169: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 16c: new bdo
      // 16f: dup
      // 170: invokespecial bdo.<init> ()V
      // 173: astore 10
      // 175: aload 10
      // 177: sipush 12540
      // 17a: ldc2_w 843245021686215187
      // 17d: lload 2
      // 17e: lxor
      // 17f: invokedynamic y (IJ)Ljava/lang/String; bsm=z90$m8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: nop
      // 185: aload 6
      // 187: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.rjb ()Ljava/lang/String;
      // 18a: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 18d: aload 10
      // 18f: sipush 20178
      // 192: ldc2_w 7347267449242012730
      // 195: lload 2
      // 196: lxor
      // 197: invokedynamic y (IJ)Ljava/lang/String; bsm=z90$m8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: nop
      // 19d: iload 7
      // 19f: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 1a2: aload 9
      // 1a4: aload 10
      // 1a6: invokevirtual qhg.w2j (Lgdw;)V
      // 1a9: aload 5
      // 1ab: areturn
   }

   @Override
   public int hmy() {
      return 10;
   }

   @Override
   public erg oot() {
      return null;
   }

   @Override
   public erg[] qq2(z0_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual z0_.opt ()I
      // 04: anewarray 39
      // 07: astore 3
      // 08: invokestatic t9d.b ()I
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: istore 2
      // 0f: iload 4
      // 11: aload 3
      // 12: arraylength
      // 13: if_icmpge 61
      // 16: aload 1
      // 17: iload 4
      // 19: invokevirtual z0_.ibn (I)Lerg;
      // 1c: astore 5
      // 1e: iload 2
      // 1f: ifeq 5d
      // 22: aload 5
      // 24: ifnull 5a
      // 27: goto 2e
      // 2a: invokestatic z90$m8l.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 5
      // 30: invokevirtual erg.gn1 ()Lu7m;
      // 33: invokevirtual u7m.jof ()Z
      // 36: ifeq 5a
      // 39: goto 40
      // 3c: invokestatic z90$m8l.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 3
      // 41: iload 4
      // 43: new erg
      // 46: dup
      // 47: aload 5
      // 49: invokevirtual erg.gn1 ()Lu7m;
      // 4c: invokevirtual u7m.cqe ()Lu7m;
      // 4f: invokespecial erg.<init> (Lu7m;)V
      // 52: aastore
      // 53: goto 5a
      // 56: invokestatic z90$m8l.a (Loov;)Loov;
      // 59: athrow
      // 5a: iinc 4 1
      // 5d: iload 2
      // 5e: ifne 0f
      // 61: aload 3
      // 62: areturn
   }

   private TileEntityBanner$swh wt1(z0_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBanner$swh.values ()[Lnet/minecraft/tileentity/TileEntityBanner$swh;
      // 003: astore 3
      // 004: aload 3
      // 005: arraylength
      // 006: istore 4
      // 008: invokestatic t9d.b ()I
      // 00b: bipush 0
      // 00c: istore 5
      // 00e: istore 2
      // 00f: iload 5
      // 011: iload 4
      // 013: if_icmpge 2d1
      // 016: aload 3
      // 017: iload 5
      // 019: aaload
      // 01a: astore 6
      // 01c: iload 2
      // 01d: ifeq 2cd
      // 020: aload 6
      // 022: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.bm_ ()Z
      // 025: ifeq 2ca
      // 028: goto 02f
      // 02b: invokestatic z90$m8l.a (Loov;)Loov;
      // 02e: athrow
      // 02f: bipush 1
      // 030: istore 7
      // 032: aload 6
      // 034: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.wam ()Z
      // 037: iload 2
      // 038: ifeq 155
      // 03b: ifeq 14a
      // 03e: goto 045
      // 041: invokestatic z90$m8l.a (Loov;)Loov;
      // 044: athrow
      // 045: bipush 0
      // 046: istore 8
      // 048: bipush 0
      // 049: istore 9
      // 04b: bipush 0
      // 04c: istore 10
      // 04e: iload 10
      // 050: aload 1
      // 051: invokevirtual z0_.opt ()I
      // 054: if_icmpge 133
      // 057: iload 7
      // 059: iload 2
      // 05a: ifeq 135
      // 05d: iload 2
      // 05e: ifeq 135
      // 061: goto 068
      // 064: invokestatic z90$m8l.a (Loov;)Loov;
      // 067: athrow
      // 068: ifeq 133
      // 06b: goto 072
      // 06e: invokestatic z90$m8l.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 1
      // 073: iload 10
      // 075: invokevirtual z0_.ibn (I)Lerg;
      // 078: astore 11
      // 07a: iload 2
      // 07b: ifeq 12f
      // 07e: aload 11
      // 080: ifnull 12c
      // 083: goto 08a
      // 086: invokestatic z90$m8l.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 11
      // 08c: invokevirtual erg.gn1 ()Lu7m;
      // 08f: getstatic xbr.ogp Lu7m;
      // 092: iload 2
      // 093: ifeq 0b6
      // 096: goto 09d
      // 099: invokestatic z90$m8l.a (Loov;)Loov;
      // 09c: athrow
      // 09d: if_acmpeq 12c
      // 0a0: goto 0a7
      // 0a3: invokestatic z90$m8l.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 11
      // 0a9: invokevirtual erg.gn1 ()Lu7m;
      // 0ac: getstatic xbr.nnn Lu7m;
      // 0af: goto 0b6
      // 0b2: invokestatic z90$m8l.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: if_acmpne 0e5
      // 0b9: iload 9
      // 0bb: iload 2
      // 0bc: ifeq 0df
      // 0bf: goto 0c6
      // 0c2: invokestatic z90$m8l.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: ifeq 0d7
      // 0c9: goto 0d0
      // 0cc: invokestatic z90$m8l.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: bipush 0
      // 0d1: istore 7
      // 0d3: iload 2
      // 0d4: ifne 133
      // 0d7: bipush 1
      // 0d8: goto 0df
      // 0db: invokestatic z90$m8l.a (Loov;)Loov;
      // 0de: athrow
      // 0df: istore 9
      // 0e1: iload 2
      // 0e2: ifne 12c
      // 0e5: iload 8
      // 0e7: iload 2
      // 0e8: ifeq 11c
      // 0eb: goto 0f2
      // 0ee: invokestatic z90$m8l.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: ifne 11b
      // 0f5: goto 0fc
      // 0f8: invokestatic z90$m8l.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 11
      // 0fe: aload 6
      // 100: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.ty5 ()Lerg;
      // 103: invokevirtual erg.efv (Lerg;)Z
      // 106: iload 2
      // 107: ifeq 12a
      // 10a: goto 111
      // 10d: invokestatic z90$m8l.a (Loov;)Loov;
      // 110: athrow
      // 111: ifne 122
      // 114: goto 11b
      // 117: invokestatic z90$m8l.a (Loov;)Loov;
      // 11a: athrow
      // 11b: bipush 0
      // 11c: istore 7
      // 11e: iload 2
      // 11f: ifne 133
      // 122: bipush 1
      // 123: goto 12a
      // 126: invokestatic z90$m8l.a (Loov;)Loov;
      // 129: athrow
      // 12a: istore 8
      // 12c: iinc 10 1
      // 12f: iload 2
      // 130: ifne 04e
      // 133: iload 8
      // 135: iload 2
      // 136: ifeq 144
      // 139: ifne 146
      // 13c: goto 143
      // 13f: invokestatic z90$m8l.a (Loov;)Loov;
      // 142: athrow
      // 143: bipush 0
      // 144: istore 7
      // 146: iload 2
      // 147: ifne 2be
      // 14a: aload 1
      // 14b: invokevirtual z0_.opt ()I
      // 14e: goto 155
      // 151: invokestatic z90$m8l.a (Loov;)Loov;
      // 154: athrow
      // 155: iload 2
      // 156: ifeq 2bc
      // 159: aload 6
      // 15b: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.u72 ()[Ljava/lang/String;
      // 15e: arraylength
      // 15f: aload 6
      // 161: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.u72 ()[Ljava/lang/String;
      // 164: bipush 0
      // 165: aaload
      // 166: invokevirtual java/lang/String.length ()I
      // 169: imul
      // 16a: if_icmpne 2b4
      // 16d: goto 174
      // 170: invokestatic z90$m8l.a (Loov;)Loov;
      // 173: athrow
      // 174: bipush -1
      // 175: istore 8
      // 177: bipush 0
      // 178: istore 9
      // 17a: iload 9
      // 17c: aload 1
      // 17d: invokevirtual z0_.opt ()I
      // 180: if_icmpge 2b0
      // 183: iload 7
      // 185: iload 2
      // 186: ifeq 2c0
      // 189: iload 2
      // 18a: ifeq 1a9
      // 18d: goto 194
      // 190: invokestatic z90$m8l.a (Loov;)Loov;
      // 193: athrow
      // 194: ifeq 2b0
      // 197: goto 19e
      // 19a: invokestatic z90$m8l.a (Loov;)Loov;
      // 19d: athrow
      // 19e: iload 9
      // 1a0: bipush 3
      // 1a1: idiv
      // 1a2: goto 1a9
      // 1a5: invokestatic z90$m8l.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: istore 10
      // 1ab: iload 9
      // 1ad: bipush 3
      // 1ae: irem
      // 1af: istore 11
      // 1b1: aload 1
      // 1b2: iload 9
      // 1b4: invokevirtual z0_.ibn (I)Lerg;
      // 1b7: astore 12
      // 1b9: aload 12
      // 1bb: iload 2
      // 1bc: ifeq 1cb
      // 1bf: ifnull 270
      // 1c2: goto 1c9
      // 1c5: invokestatic z90$m8l.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: aload 12
      // 1cb: invokevirtual erg.gn1 ()Lu7m;
      // 1ce: getstatic xbr.ogp Lu7m;
      // 1d1: iload 2
      // 1d2: ifeq 1ee
      // 1d5: if_acmpeq 270
      // 1d8: goto 1df
      // 1db: invokestatic z90$m8l.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 12
      // 1e1: invokevirtual erg.gn1 ()Lu7m;
      // 1e4: getstatic xbr.nnn Lu7m;
      // 1e7: goto 1ee
      // 1ea: invokestatic z90$m8l.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: if_acmpeq 1f8
      // 1f1: bipush 0
      // 1f2: istore 7
      // 1f4: iload 2
      // 1f5: ifne 2b0
      // 1f8: iload 8
      // 1fa: bipush -1
      // 1fb: iload 2
      // 1fc: ifeq 254
      // 1ff: goto 206
      // 202: invokestatic z90$m8l.a (Loov;)Loov;
      // 205: athrow
      // 206: if_icmpeq 233
      // 209: goto 210
      // 20c: invokestatic z90$m8l.a (Loov;)Loov;
      // 20f: athrow
      // 210: iload 8
      // 212: aload 12
      // 214: invokevirtual erg.j6_ ()I
      // 217: iload 2
      // 218: ifeq 254
      // 21b: goto 222
      // 21e: invokestatic z90$m8l.a (Loov;)Loov;
      // 221: athrow
      // 222: if_icmpeq 233
      // 225: goto 22c
      // 228: invokestatic z90$m8l.a (Loov;)Loov;
      // 22b: athrow
      // 22c: bipush 0
      // 22d: istore 7
      // 22f: iload 2
      // 230: ifne 2b0
      // 233: aload 6
      // 235: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.u72 ()[Ljava/lang/String;
      // 238: iload 10
      // 23a: aaload
      // 23b: iload 11
      // 23d: invokevirtual java/lang/String.charAt (I)C
      // 240: iload 2
      // 241: ifeq 26a
      // 244: goto 24b
      // 247: invokestatic z90$m8l.a (Loov;)Loov;
      // 24a: athrow
      // 24b: bipush 32
      // 24d: goto 254
      // 250: invokestatic z90$m8l.a (Loov;)Loov;
      // 253: athrow
      // 254: if_icmpne 25e
      // 257: bipush 0
      // 258: istore 7
      // 25a: iload 2
      // 25b: ifne 2b0
      // 25e: aload 12
      // 260: invokevirtual erg.j6_ ()I
      // 263: goto 26a
      // 266: invokestatic z90$m8l.a (Loov;)Loov;
      // 269: athrow
      // 26a: istore 8
      // 26c: iload 2
      // 26d: ifne 2a2
      // 270: aload 6
      // 272: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.u72 ()[Ljava/lang/String;
      // 275: iload 10
      // 277: aaload
      // 278: iload 11
      // 27a: invokevirtual java/lang/String.charAt (I)C
      // 27d: iload 2
      // 27e: ifeq 29c
      // 281: goto 288
      // 284: invokestatic z90$m8l.a (Loov;)Loov;
      // 287: athrow
      // 288: bipush 32
      // 28a: if_icmpeq 2a2
      // 28d: goto 294
      // 290: invokestatic z90$m8l.a (Loov;)Loov;
      // 293: athrow
      // 294: bipush 0
      // 295: goto 29c
      // 298: invokestatic z90$m8l.a (Loov;)Loov;
      // 29b: athrow
      // 29c: istore 7
      // 29e: iload 2
      // 29f: ifne 2b0
      // 2a2: iinc 9 1
      // 2a5: iload 2
      // 2a6: ifne 17a
      // 2a9: goto 2b0
      // 2ac: invokestatic z90$m8l.a (Loov;)Loov;
      // 2af: athrow
      // 2b0: iload 2
      // 2b1: ifne 2be
      // 2b4: bipush 0
      // 2b5: goto 2bc
      // 2b8: invokestatic z90$m8l.a (Loov;)Loov;
      // 2bb: athrow
      // 2bc: istore 7
      // 2be: iload 7
      // 2c0: ifeq 2ca
      // 2c3: aload 6
      // 2c5: areturn
      // 2c6: invokestatic z90$m8l.a (Loov;)Loov;
      // 2c9: athrow
      // 2ca: iinc 5 1
      // 2cd: iload 2
      // 2ce: ifne 00f
      // 2d1: aconst_null
      // 2d2: areturn
   }

   public z90$m8l(z90$1 var1) {
      this();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4499972820943067667L, -2840527693335318434L, MethodHandles.lookup().lookupClass()).a(33235994096965L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11108121903187L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "cÖ\n\u000f\u0091ÖÎx·~\\ØqÎ\u001e\u009f\u0090\u00970\u008eñù\u009eËm\u000fØ\u0087éøxÔ \u008c\u00969Ïl\u0097ï\u001a£eq\u009e÷(\u009e:\t\u008f\u0096\r[\u008d\b\u0087Ê9\u0094\u0016\u0011\u008bbB\u0018þÏJ\u00883_g,Z¸h\u009b\u001cÓ¹\u0092\u0095\u0006wCáÔ^\u009d";
      int var8 = "cÖ\n\u000f\u0091ÖÎx·~\\ØqÎ\u001e\u009f\u0090\u00970\u008eñù\u009eËm\u000fØ\u0087éøxÔ \u008c\u00969Ïl\u0097ï\u001a£eq\u009e÷(\u009e:\t\u008f\u0096\r[\u008d\b\u0087Ê9\u0094\u0016\u0011\u008bbB\u0018þÏJ\u00883_g,Z¸h\u009b\u001cÓ¹\u0092\u0095\u0006wCáÔ^\u009d"
         .length();
      char var5 = ' ';
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
                     c = new String[5];
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

                  var6 = "o\u001dï\u000fðÓ¦³65\u008e\nä\u0088¾!\u0010\u008dý*-^\u00ad°\f\u009f\u0006×+Éî\u0090R";
                  var8 = "o\u001dï\u000fðÓ¦³65\u008e\nä\u0088¾!\u0010\u008dý*-^\u00ad°\f\u009f\u0006×+Éî\u0090R".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4898;
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
            throw new RuntimeException("z90$m8l", var10);
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
         throw new RuntimeException("z90$m8l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
