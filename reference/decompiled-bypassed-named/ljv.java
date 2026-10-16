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

public class ljv extends u7m {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ljv() {
      this.qfy(uja.qqf);
      this.rlr(0);
      this.oml(true);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ljv.a J
      // 003: ldc2_w 110810717791454
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 11
      // 00e: aload 5
      // 010: getstatic vt2.m3r Lvt2;
      // 013: if_acmpne 01c
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic ljv.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 3
      // 01d: aload 4
      // 01f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 022: astore 12
      // 024: aload 12
      // 026: invokeinterface zfz.r_y ()Le0x; 1
      // 02b: astore 13
      // 02d: aload 13
      // 02f: aload 3
      // 030: aload 4
      // 032: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 035: istore 14
      // 037: iload 14
      // 039: iload 11
      // 03b: ifne 083
      // 03e: ifne 07a
      // 041: goto 048
      // 044: invokestatic ljv.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 3
      // 049: aload 4
      // 04b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 04e: invokeinterface zfz.r_y ()Le0x; 1
      // 053: invokevirtual e0x.p1r ()Lp3y;
      // 056: invokevirtual p3y.gk6 ()Z
      // 059: iload 11
      // 05b: ifne 070
      // 05e: goto 065
      // 061: invokestatic ljv.a (Loov;)Loov;
      // 064: athrow
      // 065: ifne 071
      // 068: goto 06f
      // 06b: invokestatic ljv.a (Loov;)Loov;
      // 06e: athrow
      // 06f: bipush 0
      // 070: ireturn
      // 071: aload 4
      // 073: aload 5
      // 075: invokevirtual mew.offset (Lvt2;)Lmew;
      // 078: astore 4
      // 07a: aload 2
      // 07b: aload 4
      // 07d: aload 5
      // 07f: aload 1
      // 080: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 083: iload 11
      // 085: ifne 0a1
      // 088: ifne 098
      // 08b: goto 092
      // 08e: invokestatic ljv.a (Loov;)Loov;
      // 091: athrow
      // 092: bipush 0
      // 093: ireturn
      // 094: invokestatic ljv.a (Loov;)Loov;
      // 097: athrow
      // 098: getstatic ox_.hvd Lpld;
      // 09b: aload 3
      // 09c: aload 4
      // 09e: invokevirtual pld.ctq (Lt9d;Lmew;)Z
      // 0a1: iload 11
      // 0a3: ifne 0ba
      // 0a6: ifne 0b6
      // 0a9: goto 0b0
      // 0ac: invokestatic ljv.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: bipush 0
      // 0b1: ireturn
      // 0b2: invokestatic ljv.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 3
      // 0b7: getfield OpaquePredicate.v0f Z
      // 0ba: iload 11
      // 0bc: ifne 23b
      // 0bf: ifne 23a
      // 0c2: goto 0c9
      // 0c5: invokestatic ljv.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 3
      // 0ca: aload 4
      // 0cc: getstatic ox_.hvd Lpld;
      // 0cf: invokevirtual pld.l4i ()Lzfz;
      // 0d2: getstatic pld.skr Lqx_;
      // 0d5: aload 5
      // 0d7: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0dc: bipush 3
      // 0dd: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0e0: pop
      // 0e1: bipush 0
      // 0e2: istore 15
      // 0e4: aload 5
      // 0e6: getstatic vt2.rf3 Lvt2;
      // 0e9: if_acmpne 105
      // 0ec: aload 2
      // 0ed: getfield ha9.x5k F
      // 0f0: ldc 16.0
      // 0f2: nop
      // 0f3: fmul
      // 0f4: ldc 360.0
      // 0f6: nop
      // 0f7: fdiv
      // 0f8: f2d
      // 0f9: ldc2_w 0.5
      // 0fc: dadd
      // 0fd: invokestatic fe6.jqf (D)I
      // 100: bipush 15
      // 102: iand
      // 103: istore 15
      // 105: aload 3
      // 106: aload 4
      // 108: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 10b: astore 16
      // 10d: aload 16
      // 10f: iload 11
      // 111: ifne 12a
      // 114: instanceof net/minecraft/tileentity/TileEntitySkull
      // 117: ifeq 230
      // 11a: goto 121
      // 11d: invokestatic ljv.a (Loov;)Loov;
      // 120: athrow
      // 121: aload 16
      // 123: goto 12a
      // 126: invokestatic ljv.a (Loov;)Loov;
      // 129: athrow
      // 12a: checkcast net/minecraft/tileentity/TileEntitySkull
      // 12d: astore 17
      // 12f: aload 1
      // 130: invokevirtual erg.j6_ ()I
      // 133: bipush 3
      // 134: if_icmpne 20e
      // 137: aconst_null
      // 138: astore 18
      // 13a: aload 1
      // 13b: iload 11
      // 13d: ifne 155
      // 140: invokevirtual erg.w8b ()Z
      // 143: ifeq 202
      // 146: goto 14d
      // 149: invokestatic ljv.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 1
      // 14e: goto 155
      // 151: invokestatic ljv.a (Loov;)Loov;
      // 154: athrow
      // 155: invokevirtual erg.zso ()Lbdo;
      // 158: astore 19
      // 15a: aload 19
      // 15c: sipush 10718
      // 15f: ldc2_w 7421835965746022131
      // 162: lload 9
      // 164: lxor
      // 165: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: nop
      // 16b: bipush 10
      // 16d: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 170: iload 11
      // 172: ifne 1b1
      // 175: ifeq 19b
      // 178: goto 17f
      // 17b: invokestatic ljv.a (Loov;)Loov;
      // 17e: athrow
      // 17f: aload 19
      // 181: sipush 10718
      // 184: ldc2_w 7421835965746022131
      // 187: lload 9
      // 189: lxor
      // 18a: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: nop
      // 190: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 193: invokestatic j44.j31 (Lbdo;)Lcom/mojang/authlib/GameProfile;
      // 196: astore 18
      // 198: goto 202
      // 19b: aload 19
      // 19d: sipush 10718
      // 1a0: ldc2_w 7421835965746022131
      // 1a3: lload 9
      // 1a5: lxor
      // 1a6: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: nop
      // 1ac: bipush 8
      // 1ae: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1b1: iload 11
      // 1b3: ifne 1de
      // 1b6: ifeq 202
      // 1b9: goto 1c0
      // 1bc: invokestatic ljv.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: aload 19
      // 1c2: sipush 10718
      // 1c5: ldc2_w 7421835965746022131
      // 1c8: lload 9
      // 1ca: lxor
      // 1cb: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: nop
      // 1d1: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 1d4: invokevirtual java/lang/String.length ()I
      // 1d7: goto 1de
      // 1da: invokestatic ljv.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: ifle 202
      // 1e1: new com/mojang/authlib/GameProfile
      // 1e4: dup
      // 1e5: aconst_null
      // 1e6: checkcast java/util/UUID
      // 1e9: aload 19
      // 1eb: sipush 10718
      // 1ee: ldc2_w 7421835965746022131
      // 1f1: lload 9
      // 1f3: lxor
      // 1f4: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: nop
      // 1fa: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 1fd: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 200: astore 18
      // 202: aload 17
      // 204: aload 18
      // 206: invokevirtual net/minecraft/tileentity/TileEntitySkull.e5x (Lcom/mojang/authlib/GameProfile;)V
      // 209: iload 11
      // 20b: ifeq 21e
      // 20e: aload 17
      // 210: aload 1
      // 211: invokevirtual erg.j6_ ()I
      // 214: invokevirtual net/minecraft/tileentity/TileEntitySkull.sjx (I)V
      // 217: goto 21e
      // 21a: invokestatic ljv.a (Loov;)Loov;
      // 21d: athrow
      // 21e: aload 17
      // 220: iload 15
      // 222: invokevirtual net/minecraft/tileentity/TileEntitySkull.koc (I)V
      // 225: getstatic ox_.hvd Lpld;
      // 228: aload 3
      // 229: aload 4
      // 22b: aload 17
      // 22d: invokevirtual pld.i4n (Lt9d;Lmew;Lnet/minecraft/tileentity/TileEntitySkull;)V
      // 230: aload 1
      // 231: dup
      // 232: getfield erg.qd2 I
      // 235: bipush 1
      // 236: isub
      // 237: putfield erg.qd2 I
      // 23a: bipush 1
      // 23b: ireturn
   }

   @Override
   public void jlj(u7m var1, uja var2, List var3) {
      int var4 = OpaquePredicate.b();
      int var5 = 0;

      while (var5 < x67.length) {
         var3.add(new erg(var1, 1, var5));
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public int v05(int var1) {
      return var1;
   }

   @Override
   public String g56(erg param1) {
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
      // 05: invokevirtual erg.j6_ ()I
      // 08: istore 3
      // 09: iload 3
      // 0a: iload 2
      // 0b: ifne 3a
      // 0e: iflt 32
      // 11: goto 18
      // 14: invokestatic ljv.a (Loov;)Loov;
      // 17: athrow
      // 18: iload 3
      // 19: iload 2
      // 1a: ifne 3a
      // 1d: goto 24
      // 20: invokestatic ljv.a (Loov;)Loov;
      // 23: athrow
      // 24: getstatic ljv.x67 [Ljava/lang/String;
      // 27: arraylength
      // 28: if_icmplt 3b
      // 2b: goto 32
      // 2e: invokestatic ljv.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 0
      // 33: goto 3a
      // 36: invokestatic ljv.a (Loov;)Loov;
      // 39: athrow
      // 3a: istore 3
      // 3b: new java/lang/StringBuilder
      // 3e: dup
      // 3f: invokespecial java/lang/StringBuilder.<init> ()V
      // 42: aload 0
      // 43: invokespecial u7m.ayn ()Ljava/lang/String;
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: ldc "."
      // 4b: nop
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: getstatic ljv.x67 [Ljava/lang/String;
      // 52: iload 3
      // 53: aaload
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5a: areturn
   }

   @Override
   public String ily(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ljv.a J
      // 003: ldc2_w 12371617063668
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual erg.j6_ ()I
      // 011: iload 4
      // 013: ifeq 02c
      // 016: bipush 3
      // 017: if_icmpne 126
      // 01a: goto 021
      // 01d: invokestatic ljv.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 1
      // 022: invokevirtual erg.w8b ()Z
      // 025: goto 02c
      // 028: invokestatic ljv.a (Loov;)Loov;
      // 02b: athrow
      // 02c: iload 4
      // 02e: ifeq 059
      // 031: ifeq 126
      // 034: goto 03b
      // 037: invokestatic ljv.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 1
      // 03c: invokevirtual erg.zso ()Lbdo;
      // 03f: sipush 18177
      // 042: ldc2_w 6193812850665582083
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: nop
      // 04d: bipush 8
      // 04f: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 052: goto 059
      // 055: invokestatic ljv.a (Loov;)Loov;
      // 058: athrow
      // 059: iload 4
      // 05b: ifeq 0bd
      // 05e: ifeq 09a
      // 061: goto 068
      // 064: invokestatic ljv.a (Loov;)Loov;
      // 067: athrow
      // 068: sipush 3095
      // 06b: ldc2_w 8706075951112594708
      // 06e: lload 2
      // 06f: lxor
      // 070: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: nop
      // 076: bipush 1
      // 077: anewarray 242
      // 07a: dup
      // 07b: bipush 0
      // 07c: aload 1
      // 07d: invokevirtual erg.zso ()Lbdo;
      // 080: sipush 10718
      // 083: ldc2_w 7421870564453449945
      // 086: lload 2
      // 087: lxor
      // 088: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: nop
      // 08e: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 091: aastore
      // 092: invokestatic orr.x19 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 095: areturn
      // 096: invokestatic ljv.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 1
      // 09b: invokevirtual erg.zso ()Lbdo;
      // 09e: sipush 10718
      // 0a1: ldc2_w 7421870564453449945
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: nop
      // 0ac: iload 4
      // 0ae: ifeq 0d9
      // 0b1: bipush 10
      // 0b3: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0b6: goto 0bd
      // 0b9: invokestatic ljv.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: ifeq 126
      // 0c0: aload 1
      // 0c1: invokevirtual erg.zso ()Lbdo;
      // 0c4: sipush 10718
      // 0c7: ldc2_w 7421870564453449945
      // 0ca: lload 2
      // 0cb: lxor
      // 0cc: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: nop
      // 0d2: goto 0d9
      // 0d5: invokestatic ljv.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 0dc: astore 5
      // 0de: aload 5
      // 0e0: sipush 10770
      // 0e3: ldc2_w 1338878128170926866
      // 0e6: lload 2
      // 0e7: lxor
      // 0e8: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: nop
      // 0ee: bipush 8
      // 0f0: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f3: ifeq 126
      // 0f6: sipush 27498
      // 0f9: ldc2_w 6193460874428564067
      // 0fc: lload 2
      // 0fd: lxor
      // 0fe: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: nop
      // 104: bipush 1
      // 105: anewarray 242
      // 108: dup
      // 109: bipush 0
      // 10a: aload 5
      // 10c: sipush 15870
      // 10f: ldc2_w 971064853624460532
      // 112: lload 2
      // 113: lxor
      // 114: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: nop
      // 11a: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 11d: aastore
      // 11e: invokestatic orr.x19 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 121: areturn
      // 122: invokestatic ljv.a (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: aload 1
      // 128: invokespecial u7m.ily (Lerg;)Ljava/lang/String;
      // 12b: areturn
   }

   @Override
   public boolean d2c(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ljv.a J
      // 03: ldc2_w 6468179931398
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial u7m.d2c (Lbdo;)Z
      // 12: pop
      // 13: aload 1
      // 14: sipush 10718
      // 17: ldc2_w 7421872078433489707
      // 1a: lload 2
      // 1b: lxor
      // 1c: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: nop
      // 22: bipush 8
      // 24: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 27: iload 4
      // 29: ifeq a8
      // 2c: ifeq a7
      // 2f: goto 36
      // 32: invokestatic ljv.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 1
      // 37: sipush 10718
      // 3a: ldc2_w 7421872078433489707
      // 3d: lload 2
      // 3e: lxor
      // 3f: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 48: invokevirtual java/lang/String.length ()I
      // 4b: iload 4
      // 4d: ifeq a8
      // 50: goto 57
      // 53: invokestatic ljv.a (Loov;)Loov;
      // 56: athrow
      // 57: ifle a7
      // 5a: goto 61
      // 5d: invokestatic ljv.a (Loov;)Loov;
      // 60: athrow
      // 61: new com/mojang/authlib/GameProfile
      // 64: dup
      // 65: aconst_null
      // 66: checkcast java/util/UUID
      // 69: aload 1
      // 6a: sipush 10718
      // 6d: ldc2_w 7421872078433489707
      // 70: lload 2
      // 71: lxor
      // 72: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: nop
      // 78: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 7b: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 7e: astore 5
      // 80: aload 5
      // 82: invokestatic net/minecraft/tileentity/TileEntitySkull.cms (Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 85: astore 5
      // 87: aload 1
      // 88: sipush 10718
      // 8b: ldc2_w 7421872078433489707
      // 8e: lload 2
      // 8f: lxor
      // 90: invokedynamic v (IJ)Ljava/lang/String; bsm=ljv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: nop
      // 96: new bdo
      // 99: dup
      // 9a: invokespecial bdo.<init> ()V
      // 9d: aload 5
      // 9f: invokestatic j44.f9e (Lbdo;Lcom/mojang/authlib/GameProfile;)Lbdo;
      // a2: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // a5: bipush 1
      // a6: ireturn
      // a7: bipush 0
      // a8: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7149841746553512642L, -8879797545528131854L, MethodHandles.lookup().lookupClass()).a(167720460242226L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 30615088797780L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[11];
      int var5 = 0;
      String var4 = "ÂÛ}\u00166Ä\u0086Zèi¼¸\u0017\t\u0098ØIA5»/>2ÉÔ\u0006\u0012ç2¬,+°\u0003Hnªõ\u0090]\u0018Ó?&¯MÌN\u008c\u0086\u000b-\u008d\u0099na\u001f'¤$Ú)e¶N\u0010Y?g\rî_8\u000f\u0014ñC±þãAt\u0010\u008f\u0003î\u0082TaÎD6\u0099\u000b\u009dL°\u007f \u0018\u00028ez]AH¥³¹&X²eë³t¬WÑ¼Ô7×\u0010ßÞ,\u0090\u0081Îj?2E\u0007=\bû*J\u0010¯\u0094ß]ß\u0092H\r±\u001aQ<\f5\u0088] |AkNâe>\u008a$\u0003Ã£b\u008a\u008eY/}û\n%ÚÕ\u0007p\u0003©ºã\u000f¾È\u0010\u0098\u001d¿`ÃÛ\u0006`ÖQÀ\u009dCµ'q";
      int var6 = "ÂÛ}\u00166Ä\u0086Zèi¼¸\u0017\t\u0098ØIA5»/>2ÉÔ\u0006\u0012ç2¬,+°\u0003Hnªõ\u0090]\u0018Ó?&¯MÌN\u008c\u0086\u000b-\u008d\u0099na\u001f'¤$Ú)e¶N\u0010Y?g\rî_8\u000f\u0014ñC±þãAt\u0010\u008f\u0003î\u0082TaÎD6\u0099\u000b\u009dL°\u007f \u0018\u00028ez]AH¥³¹&X²eë³t¬WÑ¼Ô7×\u0010ßÞ,\u0090\u0081Îj?2E\u0007=\bû*J\u0010¯\u0094ß]ß\u0092H\r±\u001aQ<\f5\u0088] |AkNâe>\u008a$\u0003Ã£b\u008a\u008eY/}û\n%ÚÕ\u0007p\u0003©ºã\u000f¾È\u0010\u0098\u001d¿`ÃÛ\u0006`ÖQÀ\u009dCµ'q"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[11];
                     x67 = new String[]{
                        b<"v">(19431, 3742313127642912835L ^ var9),
                        b<"v">(19078, 1523362323276519725L ^ var9),
                        b<"v">(1714, 1667145442007979283L ^ var9),
                        b<"v">(30782, 9054665075109587867L ^ var9),
                        b<"v">(6604, 8278295543964109418L ^ var9)
                     };
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

                  var4 = "-Row×\u0089dW\u00936)ÐÇâÀÌ($\u0010bÛ1Å#:\u0087À6\u0010\b\u0083[¢o\u0015cÛ°s£\u0089\u0005¤?ºÏÕ|õ\u0080\u0085¤¹T\fVË";
                  var6 = "-Row×\u0089dW\u00936)ÐÇâÀÌ($\u0010bÛ1Å#:\u0087À6\u0010\b\u0083[¢o\u0015cÛ°s£\u0089\u0005¤?ºÏÕ|õ\u0080\u0085¤¹T\fVË".length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13442;
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
            throw new RuntimeException("ljv", var10);
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
         throw new RuntimeException("ljv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
