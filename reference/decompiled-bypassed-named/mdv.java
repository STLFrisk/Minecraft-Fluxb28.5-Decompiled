import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mdv extends e0x {
   public static final _ku dch;

   public mdv() {
      super(p3y.e21, _mi.eo9);
      this.y8l(this._8_.c32().zvi(dch, 0));
   }

   @Override
   public void c76(OpaquePredicate var1, mew var2, zfz var3, nh4 var4, List var5, EntityLivingBase var6) {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      float var7 = 0.125F;
      this.xl4(0.0F, 0.0F, 0.0F, var7, 1.0F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var7);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(1.0F - var7, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(0.0F, 0.0F, 1.0F - var7, 1.0F, 1.0F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.bf6();
   }

   @Override
   public void bf6() {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public void n9e(OpaquePredicate param1, mew param2, zfz param3, EntityLivingBase param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: getstatic mdv.dch L_ku;
      // 04: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 09: checkcast java/lang/Integer
      // 0c: invokevirtual java/lang/Integer.intValue ()I
      // 0f: istore 6
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: aload 2
      // 15: invokevirtual mew.getY ()I
      // 18: i2f
      // 19: ldc 6.0
      // 1b: nop
      // 1c: bipush 3
      // 1d: iload 6
      // 1f: imul
      // 20: i2f
      // 21: fadd
      // 22: ldc 16.0
      // 24: nop
      // 25: fdiv
      // 26: fadd
      // 27: fstore 7
      // 29: istore 5
      // 2b: aload 1
      // 2c: getfield OpaquePredicate.v0f Z
      // 2f: iload 5
      // 31: ifeq 4a
      // 34: ifne 9c
      // 37: goto 3e
      // 3a: invokestatic mdv.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 4
      // 40: invokevirtual EntityLivingBase.agj ()Z
      // 43: goto 4a
      // 46: invokestatic mdv.a (Loov;)Loov;
      // 49: athrow
      // 4a: iload 5
      // 4c: ifeq 5b
      // 4f: ifeq 9c
      // 52: goto 59
      // 55: invokestatic mdv.a (Loov;)Loov;
      // 58: athrow
      // 59: iload 6
      // 5b: iload 5
      // 5d: ifeq 89
      // 60: ifle 9c
      // 63: goto 6a
      // 66: invokestatic mdv.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 4
      // 6c: iload 5
      // 6e: ifeq 8e
      // 71: goto 78
      // 74: invokestatic mdv.a (Loov;)Loov;
      // 77: athrow
      // 78: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 7b: getfield nh4.bx_ D
      // 7e: fload 7
      // 80: f2d
      // 81: dcmpg
      // 82: goto 89
      // 85: invokestatic mdv.a (Loov;)Loov;
      // 88: athrow
      // 89: ifgt 9c
      // 8c: aload 4
      // 8e: invokevirtual EntityLivingBase.utb ()V
      // 91: aload 0
      // 92: aload 1
      // 93: aload 2
      // 94: aload 3
      // 95: iload 6
      // 97: bipush 1
      // 98: isub
      // 99: invokevirtual mdv.tim (Lt9d;Lmew;Lzfz;I)V
      // 9c: return
   }

   @Override
   public boolean cl2(OpaquePredicate param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 9
      // 005: aload 1
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 9
      // 00b: ifne 019
      // 00e: ifeq 01a
      // 011: goto 018
      // 014: invokestatic mdv.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 1
      // 019: ireturn
      // 01a: aload 4
      // 01c: getfield ha9.up_ Ljnq;
      // 01f: invokevirtual jnq.dxs ()Lerg;
      // 022: astore 10
      // 024: aload 10
      // 026: ifnonnull 02f
      // 029: bipush 1
      // 02a: ireturn
      // 02b: invokestatic mdv.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 3
      // 030: getstatic mdv.dch L_ku;
      // 033: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 038: checkcast java/lang/Integer
      // 03b: invokevirtual java/lang/Integer.intValue ()I
      // 03e: istore 11
      // 040: aload 10
      // 042: invokevirtual erg.gn1 ()Lu7m;
      // 045: astore 12
      // 047: aload 12
      // 049: getstatic xbr.lqp Lu7m;
      // 04c: iload 9
      // 04e: ifne 0ca
      // 051: if_acmpne 0c5
      // 054: goto 05b
      // 057: invokestatic mdv.a (Loov;)Loov;
      // 05a: athrow
      // 05b: iload 11
      // 05d: iload 9
      // 05f: ifne 0c4
      // 062: goto 069
      // 065: invokestatic mdv.a (Loov;)Loov;
      // 068: athrow
      // 069: bipush 3
      // 06a: if_icmpge 0c3
      // 06d: goto 074
      // 070: invokestatic mdv.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 4
      // 076: iload 9
      // 078: ifne 0b5
      // 07b: goto 082
      // 07e: invokestatic mdv.a (Loov;)Loov;
      // 081: athrow
      // 082: getfield ha9.lls Lpj2;
      // 085: getfield pj2.g40 Z
      // 088: ifne 0b3
      // 08b: goto 092
      // 08e: invokestatic mdv.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 4
      // 094: getfield ha9.up_ Ljnq;
      // 097: aload 4
      // 099: getfield ha9.up_ Ljnq;
      // 09c: getfield jnq.nb5 I
      // 09f: new erg
      // 0a2: dup
      // 0a3: getstatic xbr.xxz Lu7m;
      // 0a6: invokespecial erg.<init> (Lu7m;)V
      // 0a9: invokevirtual jnq.cxl (ILerg;)V
      // 0ac: goto 0b3
      // 0af: invokestatic mdv.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 4
      // 0b5: getstatic l9p.tb2 L_ss;
      // 0b8: invokevirtual ha9.aex (L_ss;)V
      // 0bb: aload 0
      // 0bc: aload 1
      // 0bd: aload 2
      // 0be: aload 3
      // 0bf: bipush 3
      // 0c0: invokevirtual mdv.tim (Lt9d;Lmew;Lzfz;I)V
      // 0c3: bipush 1
      // 0c4: ireturn
      // 0c5: aload 12
      // 0c7: getstatic xbr.fvb Lu7m;
      // 0ca: if_acmpne 1cb
      // 0cd: iload 11
      // 0cf: iload 9
      // 0d1: ifne 1ca
      // 0d4: goto 0db
      // 0d7: invokestatic mdv.a (Loov;)Loov;
      // 0da: athrow
      // 0db: ifle 1c9
      // 0de: goto 0e5
      // 0e1: invokestatic mdv.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 4
      // 0e7: getfield ha9.lls Lpj2;
      // 0ea: getfield pj2.g40 Z
      // 0ed: ifne 1be
      // 0f0: goto 0f7
      // 0f3: invokestatic mdv.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: new erg
      // 0fa: dup
      // 0fb: getstatic xbr.ik6 Ldgn;
      // 0fe: bipush 1
      // 0ff: bipush 0
      // 100: invokespecial erg.<init> (Lu7m;II)V
      // 103: astore 13
      // 105: aload 4
      // 107: getfield ha9.up_ Ljnq;
      // 10a: aload 13
      // 10c: invokevirtual jnq.phd (Lerg;)Z
      // 10f: iload 9
      // 111: ifne 160
      // 114: ifne 154
      // 117: goto 11e
      // 11a: invokestatic mdv.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 1
      // 11f: new nvf
      // 122: dup
      // 123: aload 1
      // 124: aload 2
      // 125: invokevirtual mew.getX ()I
      // 128: i2d
      // 129: ldc2_w 0.5
      // 12c: dadd
      // 12d: aload 2
      // 12e: invokevirtual mew.getY ()I
      // 131: i2d
      // 132: ldc2_w 1.5
      // 135: dadd
      // 136: aload 2
      // 137: invokevirtual mew.getZ ()I
      // 13a: i2d
      // 13b: ldc2_w 0.5
      // 13e: dadd
      // 13f: aload 13
      // 141: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 144: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 147: pop
      // 148: iload 9
      // 14a: ifeq 183
      // 14d: goto 154
      // 150: invokestatic mdv.a (Loov;)Loov;
      // 153: athrow
      // 154: aload 4
      // 156: instanceof z96
      // 159: goto 160
      // 15c: invokestatic mdv.a (Loov;)Loov;
      // 15f: athrow
      // 160: iload 9
      // 162: ifne 1a7
      // 165: ifeq 183
      // 168: goto 16f
      // 16b: invokestatic mdv.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 4
      // 171: checkcast z96
      // 174: aload 4
      // 176: getfield ha9.fv9 L_jc;
      // 179: invokevirtual z96.u1s (L_jc;)V
      // 17c: goto 183
      // 17f: invokestatic mdv.a (Loov;)Loov;
      // 182: athrow
      // 183: aload 4
      // 185: iload 9
      // 187: ifne 1ac
      // 18a: getstatic l9p.ef8 L_ss;
      // 18d: invokevirtual ha9.aex (L_ss;)V
      // 190: aload 10
      // 192: dup
      // 193: getfield erg.qd2 I
      // 196: bipush 1
      // 197: isub
      // 198: putfield erg.qd2 I
      // 19b: aload 10
      // 19d: getfield erg.qd2 I
      // 1a0: goto 1a7
      // 1a3: invokestatic mdv.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: ifgt 1be
      // 1aa: aload 4
      // 1ac: getfield ha9.up_ Ljnq;
      // 1af: aload 4
      // 1b1: getfield ha9.up_ Ljnq;
      // 1b4: getfield jnq.nb5 I
      // 1b7: aconst_null
      // 1b8: checkcast erg
      // 1bb: invokevirtual jnq.cxl (ILerg;)V
      // 1be: aload 0
      // 1bf: aload 1
      // 1c0: aload 2
      // 1c1: aload 3
      // 1c2: iload 11
      // 1c4: bipush 1
      // 1c5: isub
      // 1c6: invokevirtual mdv.tim (Lt9d;Lmew;Lzfz;I)V
      // 1c9: bipush 1
      // 1ca: ireturn
      // 1cb: iload 11
      // 1cd: iload 9
      // 1cf: ifne 254
      // 1d2: ifle 252
      // 1d5: goto 1dc
      // 1d8: invokestatic mdv.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 12
      // 1de: instanceof jpt
      // 1e1: iload 9
      // 1e3: ifne 254
      // 1e6: goto 1ed
      // 1e9: invokestatic mdv.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: ifeq 252
      // 1f0: goto 1f7
      // 1f3: invokestatic mdv.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: aload 12
      // 1f9: checkcast jpt
      // 1fc: astore 13
      // 1fe: aload 13
      // 200: iload 9
      // 202: ifne 21e
      // 205: invokevirtual jpt.jo8 ()Ljpt$j4h;
      // 208: getstatic jpt$j4h.pdl Ljpt$j4h;
      // 20b: if_acmpne 252
      // 20e: goto 215
      // 211: invokestatic mdv.a (Loov;)Loov;
      // 214: athrow
      // 215: aload 13
      // 217: goto 21e
      // 21a: invokestatic mdv.a (Loov;)Loov;
      // 21d: athrow
      // 21e: aload 10
      // 220: invokevirtual jpt.mi9 (Lerg;)Z
      // 223: iload 9
      // 225: ifne 254
      // 228: ifeq 252
      // 22b: goto 232
      // 22e: invokestatic mdv.a (Loov;)Loov;
      // 231: athrow
      // 232: aload 13
      // 234: aload 10
      // 236: invokevirtual jpt._8_ (Lerg;)V
      // 239: aload 0
      // 23a: aload 1
      // 23b: aload 2
      // 23c: aload 3
      // 23d: iload 11
      // 23f: bipush 1
      // 240: isub
      // 241: invokevirtual mdv.tim (Lt9d;Lmew;Lzfz;I)V
      // 244: aload 4
      // 246: getstatic l9p.edl L_ss;
      // 249: invokevirtual ha9.aex (L_ss;)V
      // 24c: bipush 1
      // 24d: ireturn
      // 24e: invokestatic mdv.a (Loov;)Loov;
      // 251: athrow
      // 252: iload 11
      // 254: iload 9
      // 256: ifne 3de
      // 259: ifle 3dd
      // 25c: goto 263
      // 25f: invokestatic mdv.a (Loov;)Loov;
      // 262: athrow
      // 263: aload 12
      // 265: instanceof jgn
      // 268: iload 9
      // 26a: ifne 3de
      // 26d: goto 274
      // 270: invokestatic mdv.a (Loov;)Loov;
      // 273: athrow
      // 274: ifeq 3dd
      // 277: goto 27e
      // 27a: invokestatic mdv.a (Loov;)Loov;
      // 27d: athrow
      // 27e: aload 10
      // 280: invokestatic net/minecraft/tileentity/TileEntityBanner.v93 (Lerg;)I
      // 283: iload 9
      // 285: ifne 3de
      // 288: goto 28f
      // 28b: invokestatic mdv.a (Loov;)Loov;
      // 28e: athrow
      // 28f: ifle 3dd
      // 292: goto 299
      // 295: invokestatic mdv.a (Loov;)Loov;
      // 298: athrow
      // 299: aload 10
      // 29b: invokevirtual erg.yaq ()Lerg;
      // 29e: astore 13
      // 2a0: aload 13
      // 2a2: bipush 1
      // 2a3: putfield erg.qd2 I
      // 2a6: aload 13
      // 2a8: invokestatic net/minecraft/tileentity/TileEntityBanner.x2u (Lerg;)V
      // 2ab: aload 10
      // 2ad: getfield erg.qd2 I
      // 2b0: iload 9
      // 2b2: ifne 30d
      // 2b5: bipush 1
      // 2b6: if_icmpgt 2fc
      // 2b9: goto 2c0
      // 2bc: invokestatic mdv.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: aload 4
      // 2c2: getfield ha9.lls Lpj2;
      // 2c5: getfield pj2.g40 Z
      // 2c8: iload 9
      // 2ca: ifne 30d
      // 2cd: goto 2d4
      // 2d0: invokestatic mdv.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: ifne 2fc
      // 2d7: goto 2de
      // 2da: invokestatic mdv.a (Loov;)Loov;
      // 2dd: athrow
      // 2de: aload 4
      // 2e0: getfield ha9.up_ Ljnq;
      // 2e3: aload 4
      // 2e5: getfield ha9.up_ Ljnq;
      // 2e8: getfield jnq.nb5 I
      // 2eb: aload 13
      // 2ed: invokevirtual jnq.cxl (ILerg;)V
      // 2f0: iload 9
      // 2f2: ifeq 3b2
      // 2f5: goto 2fc
      // 2f8: invokestatic mdv.a (Loov;)Loov;
      // 2fb: athrow
      // 2fc: aload 4
      // 2fe: getfield ha9.up_ Ljnq;
      // 301: aload 13
      // 303: invokevirtual jnq.phd (Lerg;)Z
      // 306: goto 30d
      // 309: invokestatic mdv.a (Loov;)Loov;
      // 30c: athrow
      // 30d: iload 9
      // 30f: ifne 35e
      // 312: ifne 352
      // 315: goto 31c
      // 318: invokestatic mdv.a (Loov;)Loov;
      // 31b: athrow
      // 31c: aload 1
      // 31d: new nvf
      // 320: dup
      // 321: aload 1
      // 322: aload 2
      // 323: invokevirtual mew.getX ()I
      // 326: i2d
      // 327: ldc2_w 0.5
      // 32a: dadd
      // 32b: aload 2
      // 32c: invokevirtual mew.getY ()I
      // 32f: i2d
      // 330: ldc2_w 1.5
      // 333: dadd
      // 334: aload 2
      // 335: invokevirtual mew.getZ ()I
      // 338: i2d
      // 339: ldc2_w 0.5
      // 33c: dadd
      // 33d: aload 13
      // 33f: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 342: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 345: pop
      // 346: iload 9
      // 348: ifeq 381
      // 34b: goto 352
      // 34e: invokestatic mdv.a (Loov;)Loov;
      // 351: athrow
      // 352: aload 4
      // 354: instanceof z96
      // 357: goto 35e
      // 35a: invokestatic mdv.a (Loov;)Loov;
      // 35d: athrow
      // 35e: iload 9
      // 360: ifne 391
      // 363: ifeq 381
      // 366: goto 36d
      // 369: invokestatic mdv.a (Loov;)Loov;
      // 36c: athrow
      // 36d: aload 4
      // 36f: checkcast z96
      // 372: aload 4
      // 374: getfield ha9.fv9 L_jc;
      // 377: invokevirtual z96.u1s (L_jc;)V
      // 37a: goto 381
      // 37d: invokestatic mdv.a (Loov;)Loov;
      // 380: athrow
      // 381: aload 4
      // 383: getstatic l9p.j1r L_ss;
      // 386: invokevirtual ha9.aex (L_ss;)V
      // 389: aload 4
      // 38b: getfield ha9.lls Lpj2;
      // 38e: getfield pj2.g40 Z
      // 391: iload 9
      // 393: ifne 3ba
      // 396: ifne 3b2
      // 399: goto 3a0
      // 39c: invokestatic mdv.a (Loov;)Loov;
      // 39f: athrow
      // 3a0: aload 10
      // 3a2: dup
      // 3a3: getfield erg.qd2 I
      // 3a6: bipush 1
      // 3a7: isub
      // 3a8: putfield erg.qd2 I
      // 3ab: goto 3b2
      // 3ae: invokestatic mdv.a (Loov;)Loov;
      // 3b1: athrow
      // 3b2: aload 4
      // 3b4: getfield ha9.lls Lpj2;
      // 3b7: getfield pj2.g40 Z
      // 3ba: iload 9
      // 3bc: ifne 3dc
      // 3bf: ifne 3db
      // 3c2: goto 3c9
      // 3c5: invokestatic mdv.a (Loov;)Loov;
      // 3c8: athrow
      // 3c9: aload 0
      // 3ca: aload 1
      // 3cb: aload 2
      // 3cc: aload 3
      // 3cd: iload 11
      // 3cf: bipush 1
      // 3d0: isub
      // 3d1: invokevirtual mdv.tim (Lt9d;Lmew;Lzfz;I)V
      // 3d4: goto 3db
      // 3d7: invokestatic mdv.a (Loov;)Loov;
      // 3da: athrow
      // 3db: bipush 1
      // 3dc: ireturn
      // 3dd: bipush 0
      // 3de: ireturn
   }

   public void tim(OpaquePredicate var1, mew var2, zfz var3, int var4) {
      var1.vct(var2, var3.zvi(dch, fe6.faa(var4, 0, 3)), 2);
      var1.lw8(var2, this);
   }

   @Override
   public void val(OpaquePredicate param1, mew param2) {
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
      // 05: iload 3
      // 06: ifne 24
      // 09: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 0c: bipush 20
      // 0e: invokevirtual java/util/Random.nextInt (I)I
      // 11: bipush 1
      // 12: if_icmpne 61
      // 15: goto 1c
      // 18: invokestatic mdv.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: goto 24
      // 20: invokestatic mdv.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 2
      // 25: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 28: astore 4
      // 2a: aload 4
      // 2c: getstatic mdv.dch L_ku;
      // 2f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 34: checkcast java/lang/Integer
      // 37: invokevirtual java/lang/Integer.intValue ()I
      // 3a: iload 3
      // 3b: ifne 60
      // 3e: bipush 3
      // 3f: if_icmpge 61
      // 42: goto 49
      // 45: invokestatic mdv.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: aload 2
      // 4b: aload 4
      // 4d: getstatic mdv.dch L_ku;
      // 50: invokeinterface zfz.dm4 (Lxny;)Lzfz; 2
      // 55: bipush 2
      // 56: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 59: goto 60
      // 5c: invokestatic mdv.a (Loov;)Loov;
      // 5f: athrow
      // 60: pop
      // 61: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.r7n;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.r7n;
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(OpaquePredicate var1, mew var2) {
      return (Integer)var1.getBlockState(var2).dil(dch);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(dch, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(dch);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{dch});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3780398297210220960L, 1905037174993019485L, MethodHandles.lookup().lookupClass()).a(76636369791109L);
      // $VF: monitorexit
      long var4 = var10000 ^ 35996308347246L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("d1fiÈ'(\u000e".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      dch = _ku.wgl(var0, 0, 3);
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
}
