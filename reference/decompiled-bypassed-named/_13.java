import java.util.Random;
import java.util.Set;

public class _13 extends hmv {
   public int ym2;

   public _13(p3y var1) {
      super(var1);
   }

   private void a8e(OpaquePredicate var1, mew var2, zfz var3) {
      var1.vct(var2, km1(this.kgd).l4i().zvi(nfg, var3.dil(nfg)), 2);
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: getstatic _13.nfg L_ku;
      // 004: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 009: checkcast java/lang/Integer
      // 00c: invokevirtual java/lang/Integer.intValue ()I
      // 00f: istore 6
      // 011: invokestatic OpaquePredicate.c ()I
      // 014: bipush 1
      // 015: istore 7
      // 017: istore 5
      // 019: aload 0
      // 01a: iload 5
      // 01c: ifne 050
      // 01f: getfield _13.kgd Lp3y;
      // 022: getstatic p3y.e1s Lp3y;
      // 025: if_acmpne 04f
      // 028: goto 02f
      // 02b: invokestatic _13.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 1
      // 030: getfield OpaquePredicate.vzz Lupn;
      // 033: invokevirtual upn.yz2 ()Z
      // 036: iload 5
      // 038: ifne 054
      // 03b: goto 042
      // 03e: invokestatic _13.a (Loov;)Loov;
      // 041: athrow
      // 042: ifne 04f
      // 045: goto 04c
      // 048: invokestatic _13.a (Loov;)Loov;
      // 04b: athrow
      // 04c: bipush 2
      // 04d: istore 7
      // 04f: aload 0
      // 050: aload 1
      // 051: invokevirtual _13.odp (Lt9d;)I
      // 054: istore 8
      // 056: iload 6
      // 058: iload 5
      // 05a: ifne 069
      // 05d: ifle 2cd
      // 060: goto 067
      // 063: invokestatic _13.a (Loov;)Loov;
      // 066: athrow
      // 067: bipush -100
      // 069: istore 9
      // 06b: aload 0
      // 06c: bipush 0
      // 06d: putfield _13.ym2 I
      // 070: getstatic vt2$unz.fzl Lvt2$unz;
      // 073: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 076: astore 10
      // 078: aload 10
      // 07a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07f: ifeq 0ae
      // 082: aload 10
      // 084: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 089: checkcast vt2
      // 08c: astore 11
      // 08e: aload 0
      // 08f: aload 1
      // 090: aload 2
      // 091: aload 11
      // 093: invokevirtual mew.offset (Lvt2;)Lmew;
      // 096: iload 9
      // 098: invokevirtual _13.o22 (Lt9d;Lmew;I)I
      // 09b: istore 9
      // 09d: iload 5
      // 09f: ifne 2db
      // 0a2: iload 5
      // 0a4: ifeq 078
      // 0a7: goto 0ae
      // 0aa: invokestatic _13.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: iload 9
      // 0b0: iload 7
      // 0b2: iadd
      // 0b3: istore 10
      // 0b5: iload 10
      // 0b7: iload 5
      // 0b9: ifne 0e1
      // 0bc: bipush 8
      // 0be: if_icmpge 0e0
      // 0c1: goto 0c8
      // 0c4: invokestatic _13.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 9
      // 0ca: iload 5
      // 0cc: ifne 0ec
      // 0cf: goto 0d6
      // 0d2: invokestatic _13.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: ifge 0e3
      // 0d9: goto 0e0
      // 0dc: invokestatic _13.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: bipush -1
      // 0e1: istore 10
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: aload 2
      // 0e6: invokevirtual mew.nuv ()Lmew;
      // 0e9: invokevirtual _13.cah (Lm5n;Lmew;)I
      // 0ec: iload 5
      // 0ee: ifne 140
      // 0f1: iflt 130
      // 0f4: goto 0fb
      // 0f7: invokestatic _13.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: aload 1
      // 0fd: aload 2
      // 0fe: invokevirtual mew.nuv ()Lmew;
      // 101: invokevirtual _13.cah (Lm5n;Lmew;)I
      // 104: istore 11
      // 106: iload 11
      // 108: bipush 8
      // 10a: iload 5
      // 10c: ifne 12d
      // 10f: if_icmplt 122
      // 112: goto 119
      // 115: invokestatic _13.a (Loov;)Loov;
      // 118: athrow
      // 119: iload 11
      // 11b: istore 10
      // 11d: iload 5
      // 11f: ifeq 130
      // 122: iload 11
      // 124: bipush 8
      // 126: goto 12d
      // 129: invokestatic _13.a (Loov;)Loov;
      // 12c: athrow
      // 12d: iadd
      // 12e: istore 10
      // 130: aload 0
      // 131: iload 5
      // 133: ifne 1dd
      // 136: getfield _13.ym2 I
      // 139: goto 140
      // 13c: invokestatic _13.a (Loov;)Loov;
      // 13f: athrow
      // 140: bipush 2
      // 141: if_icmplt 1dc
      // 144: aload 0
      // 145: getfield _13.kgd Lp3y;
      // 148: getstatic p3y.six Lp3y;
      // 14b: iload 5
      // 14d: ifne 1e3
      // 150: goto 157
      // 153: invokestatic _13.a (Loov;)Loov;
      // 156: athrow
      // 157: if_acmpne 1dc
      // 15a: goto 161
      // 15d: invokestatic _13.a (Loov;)Loov;
      // 160: athrow
      // 161: aload 1
      // 162: aload 2
      // 163: invokevirtual mew.eve ()Lmew;
      // 166: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 169: astore 11
      // 16b: aload 11
      // 16d: invokeinterface zfz.r_y ()Le0x; 1
      // 172: invokevirtual e0x.p1r ()Lp3y;
      // 175: iload 5
      // 177: ifne 1a0
      // 17a: invokevirtual p3y.gk6 ()Z
      // 17d: ifeq 18f
      // 180: goto 187
      // 183: invokestatic _13.a (Loov;)Loov;
      // 186: athrow
      // 187: bipush 0
      // 188: istore 10
      // 18a: iload 5
      // 18c: ifeq 1dc
      // 18f: aload 11
      // 191: invokeinterface zfz.r_y ()Le0x; 1
      // 196: invokevirtual e0x.p1r ()Lp3y;
      // 199: goto 1a0
      // 19c: invokestatic _13.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield _13.kgd Lp3y;
      // 1a4: iload 5
      // 1a6: ifne 1e3
      // 1a9: if_acmpne 1dc
      // 1ac: goto 1b3
      // 1af: invokestatic _13.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 11
      // 1b5: getstatic _13.nfg L_ku;
      // 1b8: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1bd: checkcast java/lang/Integer
      // 1c0: invokevirtual java/lang/Integer.intValue ()I
      // 1c3: iload 5
      // 1c5: ifne 1da
      // 1c8: goto 1cf
      // 1cb: invokestatic _13.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: ifne 1dc
      // 1d2: goto 1d9
      // 1d5: invokestatic _13.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: bipush 0
      // 1da: istore 10
      // 1dc: aload 0
      // 1dd: getfield _13.kgd Lp3y;
      // 1e0: getstatic p3y.e1s Lp3y;
      // 1e3: if_acmpne 256
      // 1e6: iload 6
      // 1e8: bipush 8
      // 1ea: iload 5
      // 1ec: ifne 266
      // 1ef: goto 1f6
      // 1f2: invokestatic _13.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: if_icmpge 256
      // 1f9: goto 200
      // 1fc: invokestatic _13.a (Loov;)Loov;
      // 1ff: athrow
      // 200: iload 10
      // 202: bipush 8
      // 204: iload 5
      // 206: ifne 266
      // 209: goto 210
      // 20c: invokestatic _13.a (Loov;)Loov;
      // 20f: athrow
      // 210: if_icmpge 256
      // 213: goto 21a
      // 216: invokestatic _13.a (Loov;)Loov;
      // 219: athrow
      // 21a: iload 10
      // 21c: iload 6
      // 21e: iload 5
      // 220: ifne 266
      // 223: goto 22a
      // 226: invokestatic _13.a (Loov;)Loov;
      // 229: athrow
      // 22a: if_icmple 256
      // 22d: goto 234
      // 230: invokestatic _13.a (Loov;)Loov;
      // 233: athrow
      // 234: aload 4
      // 236: bipush 4
      // 237: invokevirtual java/util/Random.nextInt (I)I
      // 23a: iload 5
      // 23c: ifne 258
      // 23f: goto 246
      // 242: invokestatic _13.a (Loov;)Loov;
      // 245: athrow
      // 246: ifeq 256
      // 249: goto 250
      // 24c: invokestatic _13.a (Loov;)Loov;
      // 24f: athrow
      // 250: iload 8
      // 252: bipush 4
      // 253: imul
      // 254: istore 8
      // 256: iload 10
      // 258: iload 5
      // 25a: ifne 282
      // 25d: iload 6
      // 25f: goto 266
      // 262: invokestatic _13.a (Loov;)Loov;
      // 265: athrow
      // 266: if_icmpne 27c
      // 269: aload 0
      // 26a: aload 1
      // 26b: aload 2
      // 26c: aload 3
      // 26d: invokespecial _13.a8e (Lt9d;Lmew;Lzfz;)V
      // 270: iload 5
      // 272: ifeq 2c8
      // 275: goto 27c
      // 278: invokestatic _13.a (Loov;)Loov;
      // 27b: athrow
      // 27c: iload 10
      // 27e: istore 6
      // 280: iload 10
      // 282: iload 5
      // 284: ifne 2b9
      // 287: ifge 2a3
      // 28a: goto 291
      // 28d: invokestatic _13.a (Loov;)Loov;
      // 290: athrow
      // 291: aload 1
      // 292: aload 2
      // 293: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 296: pop
      // 297: iload 5
      // 299: ifeq 2c8
      // 29c: goto 2a3
      // 29f: invokestatic _13.a (Loov;)Loov;
      // 2a2: athrow
      // 2a3: aload 3
      // 2a4: getstatic _13.nfg L_ku;
      // 2a7: iload 10
      // 2a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2ac: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2b1: astore 3
      // 2b2: aload 1
      // 2b3: aload 2
      // 2b4: aload 3
      // 2b5: bipush 2
      // 2b6: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 2b9: pop
      // 2ba: aload 1
      // 2bb: aload 2
      // 2bc: aload 0
      // 2bd: iload 8
      // 2bf: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 2c2: aload 1
      // 2c3: aload 2
      // 2c4: aload 0
      // 2c5: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 2c8: iload 5
      // 2ca: ifeq 2db
      // 2cd: aload 0
      // 2ce: aload 1
      // 2cf: aload 2
      // 2d0: aload 3
      // 2d1: invokespecial _13.a8e (Lt9d;Lmew;Lzfz;)V
      // 2d4: goto 2db
      // 2d7: invokestatic _13.a (Loov;)Loov;
      // 2da: athrow
      // 2db: aload 1
      // 2dc: aload 2
      // 2dd: invokevirtual mew.eve ()Lmew;
      // 2e0: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2e3: astore 9
      // 2e5: aload 0
      // 2e6: aload 1
      // 2e7: aload 2
      // 2e8: invokevirtual mew.eve ()Lmew;
      // 2eb: aload 9
      // 2ed: invokespecial _13.g4k (Lt9d;Lmew;Lzfz;)Z
      // 2f0: iload 5
      // 2f2: ifne 3aa
      // 2f5: ifeq 3a1
      // 2f8: goto 2ff
      // 2fb: invokestatic _13.a (Loov;)Loov;
      // 2fe: athrow
      // 2ff: aload 0
      // 300: getfield _13.kgd Lp3y;
      // 303: getstatic p3y.e1s Lp3y;
      // 306: iload 5
      // 308: ifne 342
      // 30b: goto 312
      // 30e: invokestatic _13.a (Loov;)Loov;
      // 311: athrow
      // 312: if_acmpne 365
      // 315: goto 31c
      // 318: invokestatic _13.a (Loov;)Loov;
      // 31b: athrow
      // 31c: aload 1
      // 31d: aload 2
      // 31e: invokevirtual mew.eve ()Lmew;
      // 321: iload 5
      // 323: ifne 351
      // 326: goto 32d
      // 329: invokestatic _13.a (Loov;)Loov;
      // 32c: athrow
      // 32d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 330: invokeinterface zfz.r_y ()Le0x; 1
      // 335: invokevirtual e0x.p1r ()Lp3y;
      // 338: getstatic p3y.six Lp3y;
      // 33b: goto 342
      // 33e: invokestatic _13.a (Loov;)Loov;
      // 341: athrow
      // 342: if_acmpne 365
      // 345: aload 1
      // 346: aload 2
      // 347: invokevirtual mew.eve ()Lmew;
      // 34a: goto 351
      // 34d: invokestatic _13.a (Loov;)Loov;
      // 350: athrow
      // 351: getstatic ox_.pu8 Le0x;
      // 354: invokevirtual e0x.l4i ()Lzfz;
      // 357: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 35a: pop
      // 35b: aload 0
      // 35c: aload 1
      // 35d: aload 2
      // 35e: invokevirtual mew.eve ()Lmew;
      // 361: invokevirtual _13.hjz (Lt9d;Lmew;)V
      // 364: return
      // 365: iload 6
      // 367: bipush 8
      // 369: if_icmplt 385
      // 36c: aload 0
      // 36d: aload 1
      // 36e: aload 2
      // 36f: invokevirtual mew.eve ()Lmew;
      // 372: aload 9
      // 374: iload 6
      // 376: invokespecial _13.gnt (Lt9d;Lmew;Lzfz;I)V
      // 379: iload 5
      // 37b: ifeq 45a
      // 37e: goto 385
      // 381: invokestatic _13.a (Loov;)Loov;
      // 384: athrow
      // 385: aload 0
      // 386: aload 1
      // 387: aload 2
      // 388: invokevirtual mew.eve ()Lmew;
      // 38b: aload 9
      // 38d: iload 6
      // 38f: bipush 8
      // 391: iadd
      // 392: invokespecial _13.gnt (Lt9d;Lmew;Lzfz;I)V
      // 395: iload 5
      // 397: ifeq 45a
      // 39a: goto 3a1
      // 39d: invokestatic _13.a (Loov;)Loov;
      // 3a0: athrow
      // 3a1: iload 6
      // 3a3: goto 3aa
      // 3a6: invokestatic _13.a (Loov;)Loov;
      // 3a9: athrow
      // 3aa: iload 5
      // 3ac: ifne 3bb
      // 3af: iflt 45a
      // 3b2: goto 3b9
      // 3b5: invokestatic _13.a (Loov;)Loov;
      // 3b8: athrow
      // 3b9: iload 6
      // 3bb: iload 5
      // 3bd: ifne 3e8
      // 3c0: ifeq 3eb
      // 3c3: goto 3ca
      // 3c6: invokestatic _13.a (Loov;)Loov;
      // 3c9: athrow
      // 3ca: aload 0
      // 3cb: aload 1
      // 3cc: aload 2
      // 3cd: invokevirtual mew.eve ()Lmew;
      // 3d0: iload 5
      // 3d2: ifne 3f5
      // 3d5: goto 3dc
      // 3d8: invokestatic _13.a (Loov;)Loov;
      // 3db: athrow
      // 3dc: aload 9
      // 3de: invokespecial _13._9j (Lt9d;Lmew;Lzfz;)Z
      // 3e1: goto 3e8
      // 3e4: invokestatic _13.a (Loov;)Loov;
      // 3e7: athrow
      // 3e8: ifeq 45a
      // 3eb: aload 0
      // 3ec: aload 1
      // 3ed: aload 2
      // 3ee: goto 3f5
      // 3f1: invokestatic _13.a (Loov;)Loov;
      // 3f4: athrow
      // 3f5: invokespecial _13.lo3 (Lt9d;Lmew;)Ljava/util/Set;
      // 3f8: astore 10
      // 3fa: iload 6
      // 3fc: iload 7
      // 3fe: iadd
      // 3ff: istore 11
      // 401: iload 6
      // 403: bipush 8
      // 405: iload 5
      // 407: ifne 41b
      // 40a: if_icmplt 417
      // 40d: goto 414
      // 410: invokestatic _13.a (Loov;)Loov;
      // 413: athrow
      // 414: bipush 1
      // 415: istore 11
      // 417: iload 11
      // 419: bipush 8
      // 41b: if_icmplt 41f
      // 41e: return
      // 41f: aload 10
      // 421: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 426: astore 12
      // 428: aload 12
      // 42a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 42f: ifeq 45a
      // 432: aload 12
      // 434: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 439: checkcast vt2
      // 43c: astore 13
      // 43e: aload 0
      // 43f: aload 1
      // 440: aload 2
      // 441: aload 13
      // 443: invokevirtual mew.offset (Lvt2;)Lmew;
      // 446: aload 1
      // 447: aload 2
      // 448: aload 13
      // 44a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 44d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 450: iload 11
      // 452: invokespecial _13.gnt (Lt9d;Lmew;Lzfz;I)V
      // 455: iload 5
      // 457: ifeq 428
      // 45a: return
   }

   private void gnt(OpaquePredicate param1, mew param2, zfz param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifne 28
      // 0b: aload 1
      // 0c: aload 2
      // 0d: aload 3
      // 0e: invokespecial _13.g4k (Lt9d;Lmew;Lzfz;)Z
      // 11: ifeq 89
      // 14: goto 1b
      // 17: invokestatic _13.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: invokeinterface zfz.r_y ()Le0x; 1
      // 21: goto 28
      // 24: invokestatic _13.a (Loov;)Loov;
      // 27: athrow
      // 28: getstatic ox_.ibw Le0x;
      // 2b: if_acmpeq 71
      // 2e: aload 0
      // 2f: iload 5
      // 31: ifne 6a
      // 34: goto 3b
      // 37: invokestatic _13.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getfield _13.kgd Lp3y;
      // 3e: getstatic p3y.e1s Lp3y;
      // 41: if_acmpne 5d
      // 44: goto 4b
      // 47: invokestatic _13.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 1
      // 4d: aload 2
      // 4e: invokevirtual _13.hjz (Lt9d;Lmew;)V
      // 51: iload 5
      // 53: ifeq 71
      // 56: goto 5d
      // 59: invokestatic _13.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 3
      // 5e: invokeinterface zfz.r_y ()Le0x; 1
      // 63: goto 6a
      // 66: invokestatic _13.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 1
      // 6b: aload 2
      // 6c: aload 3
      // 6d: bipush 0
      // 6e: invokevirtual e0x.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 71: aload 1
      // 72: aload 2
      // 73: aload 0
      // 74: invokevirtual _13.l4i ()Lzfz;
      // 77: getstatic _13.nfg L_ku;
      // 7a: iload 4
      // 7c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 84: bipush 3
      // 85: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 88: pop
      // 89: return
   }

   private int exu(OpaquePredicate param1, mew param2, int param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush 1000
      // 003: istore 6
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: getstatic vt2$unz.fzl Lvt2$unz;
      // 00b: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 00e: astore 7
      // 010: istore 5
      // 012: aload 7
      // 014: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 019: ifeq 115
      // 01c: aload 7
      // 01e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 023: checkcast vt2
      // 026: astore 8
      // 028: aload 8
      // 02a: aload 4
      // 02c: if_acmpeq 110
      // 02f: aload 2
      // 030: aload 8
      // 032: invokevirtual mew.offset (Lvt2;)Lmew;
      // 035: astore 9
      // 037: aload 1
      // 038: aload 9
      // 03a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 03d: astore 10
      // 03f: aload 0
      // 040: iload 5
      // 042: ifne 071
      // 045: aload 1
      // 046: aload 9
      // 048: aload 10
      // 04a: invokespecial _13._9j (Lt9d;Lmew;Lzfz;)Z
      // 04d: ifne 110
      // 050: goto 057
      // 053: invokestatic _13.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 10
      // 059: iload 5
      // 05b: ifne 084
      // 05e: goto 065
      // 061: invokestatic _13.a (Loov;)Loov;
      // 064: athrow
      // 065: invokeinterface zfz.r_y ()Le0x; 1
      // 06a: goto 071
      // 06d: invokestatic _13.a (Loov;)Loov;
      // 070: athrow
      // 071: invokevirtual e0x.p1r ()Lp3y;
      // 074: aload 0
      // 075: getfield _13.kgd Lp3y;
      // 078: if_acmpne 0a1
      // 07b: aload 10
      // 07d: goto 084
      // 080: invokestatic _13.a (Loov;)Loov;
      // 083: athrow
      // 084: getstatic _13.nfg L_ku;
      // 087: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 08c: checkcast java/lang/Integer
      // 08f: invokevirtual java/lang/Integer.intValue ()I
      // 092: iload 5
      // 094: ifne 0b4
      // 097: ifle 110
      // 09a: goto 0a1
      // 09d: invokestatic _13.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: aload 1
      // 0a3: aload 9
      // 0a5: invokevirtual mew.eve ()Lmew;
      // 0a8: aload 10
      // 0aa: invokespecial _13._9j (Lt9d;Lmew;Lzfz;)Z
      // 0ad: goto 0b4
      // 0b0: invokestatic _13.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: iload 5
      // 0b6: ifne 0ca
      // 0b9: ifne 0c9
      // 0bc: goto 0c3
      // 0bf: invokestatic _13.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: iload 3
      // 0c4: ireturn
      // 0c5: invokestatic _13.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: iload 3
      // 0ca: iload 5
      // 0cc: ifne 0f0
      // 0cf: bipush 4
      // 0d0: if_icmpge 110
      // 0d3: goto 0da
      // 0d6: invokestatic _13.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: aload 1
      // 0dc: aload 9
      // 0de: iload 3
      // 0df: bipush 1
      // 0e0: iadd
      // 0e1: aload 8
      // 0e3: invokevirtual vt2.b4b ()Lvt2;
      // 0e6: invokespecial _13.exu (Lt9d;Lmew;ILvt2;)I
      // 0e9: goto 0f0
      // 0ec: invokestatic _13.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: istore 11
      // 0f2: iload 11
      // 0f4: iload 5
      // 0f6: ifne 10e
      // 0f9: iload 6
      // 0fb: if_icmpge 110
      // 0fe: goto 105
      // 101: invokestatic _13.a (Loov;)Loov;
      // 104: athrow
      // 105: iload 11
      // 107: goto 10e
      // 10a: invokestatic _13.a (Loov;)Loov;
      // 10d: athrow
      // 10e: istore 6
      // 110: iload 5
      // 112: ifeq 012
      // 115: iload 6
      // 117: ireturn
   }

   private Set lo3(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush 1000
      // 003: istore 4
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: ldc vt2
      // 00a: nop
      // 00b: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 00e: astore 5
      // 010: istore 3
      // 011: getstatic vt2$unz.fzl Lvt2$unz;
      // 014: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 017: astore 6
      // 019: aload 6
      // 01b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 020: ifeq 12e
      // 023: aload 6
      // 025: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02a: checkcast vt2
      // 02d: astore 7
      // 02f: aload 2
      // 030: aload 7
      // 032: invokevirtual mew.offset (Lvt2;)Lmew;
      // 035: astore 8
      // 037: aload 1
      // 038: aload 8
      // 03a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 03d: astore 9
      // 03f: aload 0
      // 040: iload 3
      // 041: ifne 06f
      // 044: aload 1
      // 045: aload 8
      // 047: aload 9
      // 049: invokespecial _13._9j (Lt9d;Lmew;Lzfz;)Z
      // 04c: ifne 12a
      // 04f: goto 056
      // 052: invokestatic _13.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 9
      // 058: iload 3
      // 059: ifne 082
      // 05c: goto 063
      // 05f: invokestatic _13.a (Loov;)Loov;
      // 062: athrow
      // 063: invokeinterface zfz.r_y ()Le0x; 1
      // 068: goto 06f
      // 06b: invokestatic _13.a (Loov;)Loov;
      // 06e: athrow
      // 06f: invokevirtual e0x.p1r ()Lp3y;
      // 072: aload 0
      // 073: getfield _13.kgd Lp3y;
      // 076: if_acmpne 09e
      // 079: aload 9
      // 07b: goto 082
      // 07e: invokestatic _13.a (Loov;)Loov;
      // 081: athrow
      // 082: getstatic _13.nfg L_ku;
      // 085: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 08a: checkcast java/lang/Integer
      // 08d: invokevirtual java/lang/Integer.intValue ()I
      // 090: iload 3
      // 091: ifne 0b8
      // 094: ifle 12a
      // 097: goto 09e
      // 09a: invokestatic _13.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 0
      // 09f: aload 1
      // 0a0: aload 8
      // 0a2: invokevirtual mew.eve ()Lmew;
      // 0a5: aload 1
      // 0a6: aload 8
      // 0a8: invokevirtual mew.eve ()Lmew;
      // 0ab: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0ae: invokespecial _13._9j (Lt9d;Lmew;Lzfz;)Z
      // 0b1: goto 0b8
      // 0b4: invokestatic _13.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: iload 3
      // 0b9: ifne 0e1
      // 0bc: ifeq 0d9
      // 0bf: goto 0c6
      // 0c2: invokestatic _13.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: aload 8
      // 0ca: bipush 1
      // 0cb: aload 7
      // 0cd: invokevirtual vt2.b4b ()Lvt2;
      // 0d0: invokespecial _13.exu (Lt9d;Lmew;ILvt2;)I
      // 0d3: istore 10
      // 0d5: iload 3
      // 0d6: ifeq 0e3
      // 0d9: bipush 0
      // 0da: goto 0e1
      // 0dd: invokestatic _13.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: istore 10
      // 0e3: iload 10
      // 0e5: iload 4
      // 0e7: iload 3
      // 0e8: ifne 112
      // 0eb: if_icmpge 103
      // 0ee: goto 0f5
      // 0f1: invokestatic _13.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 5
      // 0f7: invokeinterface java/util/Set.clear ()V 1
      // 0fc: goto 103
      // 0ff: invokestatic _13.a (Loov;)Loov;
      // 102: athrow
      // 103: iload 10
      // 105: iload 3
      // 106: ifne 128
      // 109: iload 4
      // 10b: goto 112
      // 10e: invokestatic _13.a (Loov;)Loov;
      // 111: athrow
      // 112: if_icmpgt 12a
      // 115: aload 5
      // 117: aload 7
      // 119: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 11e: pop
      // 11f: iload 10
      // 121: goto 128
      // 124: invokestatic _13.a (Loov;)Loov;
      // 127: athrow
      // 128: istore 4
      // 12a: iload 3
      // 12b: ifeq 019
      // 12e: aload 5
      // 130: areturn
   }

   private boolean _9j(OpaquePredicate param1, mew param2, zfz param3) {
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
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a: invokeinterface zfz.r_y ()Le0x; 1
      // 0f: astore 5
      // 11: aload 5
      // 13: iload 4
      // 15: ifeq 2e
      // 18: instanceof w4e
      // 1b: ifne a0
      // 1e: goto 25
      // 21: invokestatic _13.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 5
      // 27: goto 2e
      // 2a: invokestatic _13.a (Loov;)Loov;
      // 2d: athrow
      // 2e: getstatic ox_.w0z Le0x;
      // 31: iload 4
      // 33: ifeq 58
      // 36: if_acmpeq a0
      // 39: goto 40
      // 3c: invokestatic _13.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 5
      // 42: iload 4
      // 44: ifeq 5d
      // 47: goto 4e
      // 4a: invokestatic _13.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic ox_.h49 Le0x;
      // 51: goto 58
      // 54: invokestatic _13.a (Loov;)Loov;
      // 57: athrow
      // 58: if_acmpeq a0
      // 5b: aload 5
      // 5d: iload 4
      // 5f: ifeq 78
      // 62: getstatic ox_.x65 Lvme;
      // 65: if_acmpeq a0
      // 68: goto 6f
      // 6b: invokestatic _13.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 5
      // 71: goto 78
      // 74: invokestatic _13.a (Loov;)Loov;
      // 77: athrow
      // 78: getfield e0x.kgd Lp3y;
      // 7b: iload 4
      // 7d: ifeq 9a
      // 80: getstatic p3y.p6q Lp3y;
      // 83: if_acmpne 95
      // 86: goto 8d
      // 89: invokestatic _13.a (Loov;)Loov;
      // 8c: athrow
      // 8d: bipush 1
      // 8e: goto a1
      // 91: invokestatic _13.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 5
      // 97: getfield e0x.kgd Lp3y;
      // 9a: invokevirtual p3y.c3t ()Z
      // 9d: goto a1
      // a0: bipush 1
      // a1: ireturn
   }

   public int o22(OpaquePredicate param1, mew param2, int param3) {
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
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual _13.cah (Lm5n;Lmew;)I
      // 0b: istore 5
      // 0d: iload 5
      // 0f: iload 4
      // 11: ifeq 26
      // 14: ifge 24
      // 17: goto 1e
      // 1a: invokestatic _13.a (Loov;)Loov;
      // 1d: athrow
      // 1e: iload 3
      // 1f: ireturn
      // 20: invokestatic _13.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 5
      // 26: iload 4
      // 28: ifeq 48
      // 2b: ifne 46
      // 2e: goto 35
      // 31: invokestatic _13.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: dup
      // 37: getfield _13.ym2 I
      // 3a: bipush 1
      // 3b: iadd
      // 3c: putfield _13.ym2 I
      // 3f: goto 46
      // 42: invokestatic _13.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 5
      // 48: iload 4
      // 4a: ifeq 5d
      // 4d: bipush 8
      // 4f: if_icmplt 5c
      // 52: goto 59
      // 55: invokestatic _13.a (Loov;)Loov;
      // 58: athrow
      // 59: bipush 0
      // 5a: istore 5
      // 5c: iload 3
      // 5d: iload 4
      // 5f: ifeq 6e
      // 62: iflt 89
      // 65: goto 6c
      // 68: invokestatic _13.a (Loov;)Loov;
      // 6b: athrow
      // 6c: iload 5
      // 6e: iload 4
      // 70: ifeq 86
      // 73: iload 3
      // 74: if_icmplt 89
      // 77: goto 7e
      // 7a: invokestatic _13.a (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 3
      // 7f: goto 86
      // 82: invokestatic _13.a (Loov;)Loov;
      // 85: athrow
      // 86: goto 8b
      // 89: iload 5
      // 8b: ireturn
   }

   private boolean g4k(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: invokeinterface zfz.r_y ()Le0x; 1
      // 0b: invokevirtual e0x.p1r ()Lp3y;
      // 0e: astore 5
      // 10: aload 5
      // 12: aload 0
      // 13: getfield _13.kgd Lp3y;
      // 16: iload 4
      // 18: ifne 31
      // 1b: if_acmpeq 55
      // 1e: goto 25
      // 21: invokestatic _13.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 5
      // 27: getstatic p3y.e1s Lp3y;
      // 2a: goto 31
      // 2d: invokestatic _13.a (Loov;)Loov;
      // 30: athrow
      // 31: if_acmpeq 55
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: aload 3
      // 38: invokespecial _13._9j (Lt9d;Lmew;Lzfz;)Z
      // 3b: iload 4
      // 3d: ifne 52
      // 40: goto 47
      // 43: invokestatic _13.a (Loov;)Loov;
      // 46: athrow
      // 47: ifne 55
      // 4a: goto 51
      // 4d: invokestatic _13.a (Loov;)Loov;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      try {
         if (!this.umq(var1, var2, var3)) {
            var1.cjk(var2, this, this.odp(var1));
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
