import com.google.common.base.Predicates;
import java.util.Random;

public class al4 extends cdu {
   private static final o9a v1a = o9a.utk(ox_.vd0).zpr(pmc.xum, Predicates.equalTo(pmc$s6y.r2y));
   private final zfz muc = ox_.bj8.l4i().zvi(hvn.spa, hvn$dyo.oy2).zvi(izd._9x, izd$jc0.ct4);
   private final zfz bxz = ox_.umb.l4i();
   private final zfz trl = ox_.whp.l4i();

   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 00a: ifeq 037
      // 00d: aload 3
      // 00e: invokevirtual mew.getY ()I
      // 011: iload 4
      // 013: ifne 042
      // 016: iload 4
      // 018: ifne 042
      // 01b: goto 022
      // 01e: invokestatic al4.a (Loov;)Loov;
      // 021: athrow
      // 022: bipush 2
      // 023: if_icmple 037
      // 026: goto 02d
      // 029: invokestatic al4.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 3
      // 02e: invokevirtual mew.eve ()Lmew;
      // 031: astore 3
      // 032: iload 4
      // 034: ifeq 005
      // 037: getstatic al4.v1a Lo9a;
      // 03a: aload 1
      // 03b: aload 3
      // 03c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 03f: invokevirtual o9a.no2 (Lzfz;)Z
      // 042: iload 4
      // 044: ifne 059
      // 047: ifne 057
      // 04a: goto 051
      // 04d: invokestatic al4.a (Loov;)Loov;
      // 050: athrow
      // 051: bipush 0
      // 052: ireturn
      // 053: invokestatic al4.a (Loov;)Loov;
      // 056: athrow
      // 057: bipush -2
      // 059: istore 5
      // 05b: iload 5
      // 05d: bipush 2
      // 05e: if_icmpgt 0c7
      // 061: bipush -2
      // 063: iload 4
      // 065: ifne 0c8
      // 068: istore 6
      // 06a: iload 6
      // 06c: bipush 2
      // 06d: if_icmpgt 0bf
      // 070: aload 1
      // 071: aload 3
      // 072: iload 5
      // 074: bipush -1
      // 075: iload 6
      // 077: invokevirtual mew.ec4 (III)Lmew;
      // 07a: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 07d: iload 4
      // 07f: ifne 05d
      // 082: iload 4
      // 084: ifne 0a6
      // 087: ifeq 0b7
      // 08a: goto 091
      // 08d: invokestatic al4.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 1
      // 092: aload 3
      // 093: iload 5
      // 095: bipush -2
      // 097: iload 6
      // 099: invokevirtual mew.ec4 (III)Lmew;
      // 09c: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 09f: goto 0a6
      // 0a2: invokestatic al4.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: iload 4
      // 0a8: ifne 0b6
      // 0ab: ifeq 0b7
      // 0ae: goto 0b5
      // 0b1: invokestatic al4.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: bipush 0
      // 0b6: ireturn
      // 0b7: iinc 6 1
      // 0ba: iload 4
      // 0bc: ifeq 06a
      // 0bf: iinc 5 1
      // 0c2: iload 4
      // 0c4: ifeq 05b
      // 0c7: bipush -1
      // 0c8: istore 5
      // 0ca: iload 5
      // 0cc: ifgt 125
      // 0cf: bipush -2
      // 0d1: iload 4
      // 0d3: ifne 12f
      // 0d6: istore 6
      // 0d8: iload 6
      // 0da: bipush 2
      // 0db: if_icmpgt 11d
      // 0de: bipush -2
      // 0e0: iload 4
      // 0e2: ifne 0cc
      // 0e5: istore 7
      // 0e7: iload 7
      // 0e9: bipush 2
      // 0ea: if_icmpgt 115
      // 0ed: aload 1
      // 0ee: aload 3
      // 0ef: iload 6
      // 0f1: iload 5
      // 0f3: iload 7
      // 0f5: invokevirtual mew.ec4 (III)Lmew;
      // 0f8: aload 0
      // 0f9: getfield al4.bxz Lzfz;
      // 0fc: bipush 2
      // 0fd: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 100: pop
      // 101: iinc 7 1
      // 104: iload 4
      // 106: ifne 118
      // 109: iload 4
      // 10b: ifeq 0e7
      // 10e: goto 115
      // 111: invokestatic al4.a (Loov;)Loov;
      // 114: athrow
      // 115: iinc 6 1
      // 118: iload 4
      // 11a: ifeq 0d8
      // 11d: iinc 5 1
      // 120: iload 4
      // 122: ifeq 0ca
      // 125: aload 1
      // 126: aload 3
      // 127: aload 0
      // 128: getfield al4.trl Lzfz;
      // 12b: bipush 2
      // 12c: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 12f: pop
      // 130: getstatic vt2$unz.fzl Lvt2$unz;
      // 133: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 136: astore 5
      // 138: aload 5
      // 13a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13f: ifeq 16f
      // 142: aload 5
      // 144: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 149: checkcast vt2
      // 14c: astore 6
      // 14e: aload 1
      // 14f: aload 3
      // 150: aload 6
      // 152: invokevirtual mew.offset (Lvt2;)Lmew;
      // 155: aload 0
      // 156: getfield al4.trl Lzfz;
      // 159: bipush 2
      // 15a: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 15d: iload 4
      // 15f: ifne 171
      // 162: pop
      // 163: iload 4
      // 165: ifeq 138
      // 168: goto 16f
      // 16b: invokestatic al4.a (Loov;)Loov;
      // 16e: athrow
      // 16f: bipush -2
      // 171: istore 5
      // 173: iload 5
      // 175: bipush 2
      // 176: if_icmpgt 216
      // 179: bipush -2
      // 17b: iload 4
      // 17d: ifne 25d
      // 180: istore 6
      // 182: iload 6
      // 184: bipush 2
      // 185: if_icmpgt 20e
      // 188: iload 5
      // 18a: iload 4
      // 18c: ifne 205
      // 18f: bipush -2
      // 191: iload 4
      // 193: ifne 176
      // 196: goto 19d
      // 199: invokestatic al4.a (Loov;)Loov;
      // 19c: athrow
      // 19d: if_icmpeq 1ec
      // 1a0: iload 5
      // 1a2: iload 4
      // 1a4: ifne 205
      // 1a7: goto 1ae
      // 1aa: invokestatic al4.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: bipush 2
      // 1af: if_icmpeq 1ec
      // 1b2: goto 1b9
      // 1b5: invokestatic al4.a (Loov;)Loov;
      // 1b8: athrow
      // 1b9: iload 6
      // 1bb: iload 4
      // 1bd: ifne 205
      // 1c0: goto 1c7
      // 1c3: invokestatic al4.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: bipush -2
      // 1c9: if_icmpeq 1ec
      // 1cc: goto 1d3
      // 1cf: invokestatic al4.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: iload 6
      // 1d5: iload 4
      // 1d7: ifne 205
      // 1da: goto 1e1
      // 1dd: invokestatic al4.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: bipush 2
      // 1e2: if_icmpne 206
      // 1e5: goto 1ec
      // 1e8: invokestatic al4.a (Loov;)Loov;
      // 1eb: athrow
      // 1ec: aload 1
      // 1ed: aload 3
      // 1ee: iload 5
      // 1f0: bipush 1
      // 1f1: iload 6
      // 1f3: invokevirtual mew.ec4 (III)Lmew;
      // 1f6: aload 0
      // 1f7: getfield al4.bxz Lzfz;
      // 1fa: bipush 2
      // 1fb: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1fe: goto 205
      // 201: invokestatic al4.a (Loov;)Loov;
      // 204: athrow
      // 205: pop
      // 206: iinc 6 1
      // 209: iload 4
      // 20b: ifeq 182
      // 20e: iinc 5 1
      // 211: iload 4
      // 213: ifeq 173
      // 216: aload 1
      // 217: aload 3
      // 218: bipush 2
      // 219: bipush 1
      // 21a: bipush 0
      // 21b: invokevirtual mew.ec4 (III)Lmew;
      // 21e: aload 0
      // 21f: getfield al4.muc Lzfz;
      // 222: bipush 2
      // 223: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 226: pop
      // 227: aload 1
      // 228: aload 3
      // 229: bipush -2
      // 22b: bipush 1
      // 22c: bipush 0
      // 22d: invokevirtual mew.ec4 (III)Lmew;
      // 230: aload 0
      // 231: getfield al4.muc Lzfz;
      // 234: bipush 2
      // 235: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 238: pop
      // 239: aload 1
      // 23a: aload 3
      // 23b: bipush 0
      // 23c: bipush 1
      // 23d: bipush 2
      // 23e: invokevirtual mew.ec4 (III)Lmew;
      // 241: aload 0
      // 242: getfield al4.muc Lzfz;
      // 245: bipush 2
      // 246: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 249: pop
      // 24a: aload 1
      // 24b: aload 3
      // 24c: bipush 0
      // 24d: bipush 1
      // 24e: bipush -2
      // 250: invokevirtual mew.ec4 (III)Lmew;
      // 253: aload 0
      // 254: getfield al4.muc Lzfz;
      // 257: bipush 2
      // 258: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 25b: pop
      // 25c: bipush -1
      // 25d: istore 5
      // 25f: iload 5
      // 261: bipush 1
      // 262: if_icmpgt 2ea
      // 265: bipush -1
      // 266: iload 4
      // 268: ifne 2eb
      // 26b: istore 6
      // 26d: iload 6
      // 26f: bipush 1
      // 270: if_icmpgt 2e2
      // 273: iload 5
      // 275: iload 4
      // 277: ifne 261
      // 27a: iload 4
      // 27c: ifne 2d9
      // 27f: ifne 2c0
      // 282: goto 289
      // 285: invokestatic al4.a (Loov;)Loov;
      // 288: athrow
      // 289: iload 6
      // 28b: iload 4
      // 28d: ifne 2d9
      // 290: goto 297
      // 293: invokestatic al4.a (Loov;)Loov;
      // 296: athrow
      // 297: ifne 2c0
      // 29a: goto 2a1
      // 29d: invokestatic al4.a (Loov;)Loov;
      // 2a0: athrow
      // 2a1: aload 1
      // 2a2: aload 3
      // 2a3: iload 5
      // 2a5: bipush 4
      // 2a6: iload 6
      // 2a8: invokevirtual mew.ec4 (III)Lmew;
      // 2ab: aload 0
      // 2ac: getfield al4.bxz Lzfz;
      // 2af: bipush 2
      // 2b0: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 2b3: pop
      // 2b4: iload 4
      // 2b6: ifeq 2da
      // 2b9: goto 2c0
      // 2bc: invokestatic al4.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: aload 1
      // 2c1: aload 3
      // 2c2: iload 5
      // 2c4: bipush 4
      // 2c5: iload 6
      // 2c7: invokevirtual mew.ec4 (III)Lmew;
      // 2ca: aload 0
      // 2cb: getfield al4.muc Lzfz;
      // 2ce: bipush 2
      // 2cf: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 2d2: goto 2d9
      // 2d5: invokestatic al4.a (Loov;)Loov;
      // 2d8: athrow
      // 2d9: pop
      // 2da: iinc 6 1
      // 2dd: iload 4
      // 2df: ifeq 26d
      // 2e2: iinc 5 1
      // 2e5: iload 4
      // 2e7: ifeq 25f
      // 2ea: bipush 1
      // 2eb: istore 5
      // 2ed: iload 5
      // 2ef: bipush 3
      // 2f0: if_icmpgt 34f
      // 2f3: aload 1
      // 2f4: aload 3
      // 2f5: bipush -1
      // 2f6: iload 5
      // 2f8: bipush -1
      // 2f9: invokevirtual mew.ec4 (III)Lmew;
      // 2fc: aload 0
      // 2fd: getfield al4.bxz Lzfz;
      // 300: bipush 2
      // 301: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 304: pop
      // 305: aload 1
      // 306: aload 3
      // 307: bipush -1
      // 308: iload 5
      // 30a: bipush 1
      // 30b: invokevirtual mew.ec4 (III)Lmew;
      // 30e: aload 0
      // 30f: getfield al4.bxz Lzfz;
      // 312: bipush 2
      // 313: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 316: pop
      // 317: aload 1
      // 318: aload 3
      // 319: bipush 1
      // 31a: iload 5
      // 31c: bipush -1
      // 31d: invokevirtual mew.ec4 (III)Lmew;
      // 320: aload 0
      // 321: getfield al4.bxz Lzfz;
      // 324: bipush 2
      // 325: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 328: pop
      // 329: aload 1
      // 32a: aload 3
      // 32b: bipush 1
      // 32c: iload 5
      // 32e: bipush 1
      // 32f: invokevirtual mew.ec4 (III)Lmew;
      // 332: aload 0
      // 333: getfield al4.bxz Lzfz;
      // 336: bipush 2
      // 337: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 33a: iload 4
      // 33c: ifne 350
      // 33f: pop
      // 340: iinc 5 1
      // 343: iload 4
      // 345: ifeq 2ed
      // 348: goto 34f
      // 34b: invokestatic al4.a (Loov;)Loov;
      // 34e: athrow
      // 34f: bipush 1
      // 350: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
