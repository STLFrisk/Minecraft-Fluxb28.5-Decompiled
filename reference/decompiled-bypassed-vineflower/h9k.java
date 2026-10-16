import java.util.Random;

public class h9k extends wgw {
   public h9k(boolean var1, int var2, int var3, zfz var4, zfz var5) {
      super(var1, var2, var3, var4, var5);
   }

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
      // 005: aload 0
      // 006: aload 2
      // 007: invokevirtual h9k.wl1 (Ljava/util/Random;)I
      // 00a: istore 5
      // 00c: aload 0
      // 00d: aload 1
      // 00e: aload 2
      // 00f: aload 3
      // 010: iload 5
      // 012: invokevirtual h9k.ku6 (Lt9d;Ljava/util/Random;Lmew;I)Z
      // 015: iload 4
      // 017: ifne 045
      // 01a: ifne 02a
      // 01d: goto 024
      // 020: invokestatic h9k.a (Loov;)Loov;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic h9k.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: aload 1
      // 02c: aload 3
      // 02d: iload 5
      // 02f: invokevirtual mew.z89 (I)Lmew;
      // 032: bipush 2
      // 033: invokespecial h9k.tf1 (Lt9d;Lmew;I)V
      // 036: aload 3
      // 037: invokevirtual mew.getY ()I
      // 03a: iload 5
      // 03c: iadd
      // 03d: bipush 2
      // 03e: isub
      // 03f: aload 2
      // 040: bipush 4
      // 041: invokevirtual java/util/Random.nextInt (I)I
      // 044: isub
      // 045: istore 6
      // 047: iload 6
      // 049: aload 3
      // 04a: invokevirtual mew.getY ()I
      // 04d: iload 5
      // 04f: bipush 2
      // 050: idiv
      // 051: iadd
      // 052: if_icmple 151
      // 055: aload 2
      // 056: invokevirtual java/util/Random.nextFloat ()F
      // 059: ldc 3.1415927
      // 05b: nop
      // 05c: fmul
      // 05d: fconst_2
      // 05e: fmul
      // 05f: fstore 7
      // 061: aload 3
      // 062: invokevirtual mew.getX ()I
      // 065: ldc 0.5
      // 067: nop
      // 068: fload 7
      // 06a: invokestatic fe6.ssk (F)F
      // 06d: ldc 4.0
      // 06f: nop
      // 070: fmul
      // 071: fadd
      // 072: f2i
      // 073: iadd
      // 074: istore 8
      // 076: aload 3
      // 077: invokevirtual mew.getZ ()I
      // 07a: ldc 0.5
      // 07c: nop
      // 07d: fload 7
      // 07f: invokestatic fe6.rtn (F)F
      // 082: ldc 4.0
      // 084: nop
      // 085: fmul
      // 086: fadd
      // 087: f2i
      // 088: iadd
      // 089: istore 9
      // 08b: bipush 0
      // 08c: iload 4
      // 08e: ifne 152
      // 091: istore 10
      // 093: iload 10
      // 095: bipush 5
      // 096: if_icmpge 0f4
      // 099: aload 3
      // 09a: invokevirtual mew.getX ()I
      // 09d: ldc 1.5
      // 09f: nop
      // 0a0: fload 7
      // 0a2: invokestatic fe6.ssk (F)F
      // 0a5: iload 10
      // 0a7: i2f
      // 0a8: fmul
      // 0a9: fadd
      // 0aa: f2i
      // 0ab: iadd
      // 0ac: istore 8
      // 0ae: aload 3
      // 0af: invokevirtual mew.getZ ()I
      // 0b2: ldc 1.5
      // 0b4: nop
      // 0b5: fload 7
      // 0b7: invokestatic fe6.rtn (F)F
      // 0ba: iload 10
      // 0bc: i2f
      // 0bd: fmul
      // 0be: fadd
      // 0bf: f2i
      // 0c0: iadd
      // 0c1: istore 9
      // 0c3: aload 0
      // 0c4: aload 1
      // 0c5: new mew
      // 0c8: dup
      // 0c9: iload 8
      // 0cb: iload 6
      // 0cd: bipush 3
      // 0ce: isub
      // 0cf: iload 10
      // 0d1: bipush 2
      // 0d2: idiv
      // 0d3: iadd
      // 0d4: iload 9
      // 0d6: invokespecial mew.<init> (III)V
      // 0d9: aload 0
      // 0da: getfield h9k._f6 Lzfz;
      // 0dd: invokevirtual h9k.u0f (Lt9d;Lmew;Lzfz;)V
      // 0e0: iinc 10 1
      // 0e3: iload 4
      // 0e5: ifne 0fd
      // 0e8: iload 4
      // 0ea: ifeq 093
      // 0ed: goto 0f4
      // 0f0: invokestatic h9k.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: bipush 1
      // 0f5: aload 2
      // 0f6: bipush 2
      // 0f7: invokevirtual java/util/Random.nextInt (I)I
      // 0fa: iadd
      // 0fb: istore 10
      // 0fd: iload 6
      // 0ff: istore 11
      // 101: iload 6
      // 103: iload 10
      // 105: isub
      // 106: istore 12
      // 108: iload 12
      // 10a: iload 11
      // 10c: if_icmpgt 140
      // 10f: iload 12
      // 111: iload 11
      // 113: isub
      // 114: istore 13
      // 116: aload 0
      // 117: aload 1
      // 118: new mew
      // 11b: dup
      // 11c: iload 8
      // 11e: iload 12
      // 120: iload 9
      // 122: invokespecial mew.<init> (III)V
      // 125: bipush 1
      // 126: iload 13
      // 128: isub
      // 129: invokevirtual h9k.l80 (Lt9d;Lmew;I)V
      // 12c: iinc 12 1
      // 12f: iload 4
      // 131: ifne 14c
      // 134: iload 4
      // 136: ifeq 108
      // 139: goto 140
      // 13c: invokestatic h9k.a (Loov;)Loov;
      // 13f: athrow
      // 140: iload 6
      // 142: bipush 2
      // 143: aload 2
      // 144: bipush 4
      // 145: invokevirtual java/util/Random.nextInt (I)I
      // 148: iadd
      // 149: isub
      // 14a: istore 6
      // 14c: iload 4
      // 14e: ifeq 047
      // 151: bipush 0
      // 152: istore 6
      // 154: iload 6
      // 156: iload 5
      // 158: if_icmpge 328
      // 15b: aload 3
      // 15c: iload 6
      // 15e: invokevirtual mew.z89 (I)Lmew;
      // 161: astore 7
      // 163: aload 0
      // 164: aload 1
      // 165: aload 7
      // 167: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 16a: invokeinterface zfz.r_y ()Le0x; 1
      // 16f: invokevirtual h9k.mgy (Le0x;)Z
      // 172: iload 4
      // 174: ifne 329
      // 177: iload 4
      // 179: ifne 1d5
      // 17c: goto 183
      // 17f: invokestatic h9k.a (Loov;)Loov;
      // 182: athrow
      // 183: ifeq 1d3
      // 186: goto 18d
      // 189: invokestatic h9k.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: aload 1
      // 18f: aload 7
      // 191: aload 0
      // 192: getfield h9k._f6 Lzfz;
      // 195: invokevirtual h9k.u0f (Lt9d;Lmew;Lzfz;)V
      // 198: iload 6
      // 19a: iload 4
      // 19c: ifne 1d5
      // 19f: goto 1a6
      // 1a2: invokestatic h9k.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: ifle 1d3
      // 1a9: goto 1b0
      // 1ac: invokestatic h9k.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: aload 1
      // 1b2: aload 2
      // 1b3: aload 7
      // 1b5: invokevirtual mew.y8e ()Lmew;
      // 1b8: getstatic pcl.t6u Lh76;
      // 1bb: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 1be: aload 0
      // 1bf: aload 1
      // 1c0: aload 2
      // 1c1: aload 7
      // 1c3: invokevirtual mew.idu ()Lmew;
      // 1c6: getstatic pcl.leq Lh76;
      // 1c9: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 1cc: goto 1d3
      // 1cf: invokestatic h9k.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: iload 6
      // 1d5: iload 5
      // 1d7: bipush 1
      // 1d8: isub
      // 1d9: if_icmpge 320
      // 1dc: aload 7
      // 1de: invokevirtual mew.o_8 ()Lmew;
      // 1e1: astore 8
      // 1e3: aload 0
      // 1e4: aload 1
      // 1e5: aload 8
      // 1e7: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1ea: invokeinterface zfz.r_y ()Le0x; 1
      // 1ef: invokevirtual h9k.mgy (Le0x;)Z
      // 1f2: iload 4
      // 1f4: ifne 221
      // 1f7: ifeq 247
      // 1fa: goto 201
      // 1fd: invokestatic h9k.a (Loov;)Loov;
      // 200: athrow
      // 201: aload 0
      // 202: aload 1
      // 203: aload 8
      // 205: aload 0
      // 206: getfield h9k._f6 Lzfz;
      // 209: invokevirtual h9k.u0f (Lt9d;Lmew;Lzfz;)V
      // 20c: iload 4
      // 20e: ifne 239
      // 211: goto 218
      // 214: invokestatic h9k.a (Loov;)Loov;
      // 217: athrow
      // 218: iload 6
      // 21a: goto 221
      // 21d: invokestatic h9k.a (Loov;)Loov;
      // 220: athrow
      // 221: ifle 247
      // 224: aload 0
      // 225: aload 1
      // 226: aload 2
      // 227: aload 8
      // 229: invokevirtual mew.o_8 ()Lmew;
      // 22c: getstatic pcl.m4e Lh76;
      // 22f: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 232: goto 239
      // 235: invokestatic h9k.a (Loov;)Loov;
      // 238: athrow
      // 239: aload 0
      // 23a: aload 1
      // 23b: aload 2
      // 23c: aload 8
      // 23e: invokevirtual mew.idu ()Lmew;
      // 241: getstatic pcl.leq Lh76;
      // 244: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 247: aload 7
      // 249: invokevirtual mew.z6x ()Lmew;
      // 24c: invokevirtual mew.o_8 ()Lmew;
      // 24f: astore 9
      // 251: aload 0
      // 252: aload 1
      // 253: aload 9
      // 255: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 258: invokeinterface zfz.r_y ()Le0x; 1
      // 25d: invokevirtual h9k.mgy (Le0x;)Z
      // 260: iload 4
      // 262: ifne 28f
      // 265: ifeq 2b5
      // 268: goto 26f
      // 26b: invokestatic h9k.a (Loov;)Loov;
      // 26e: athrow
      // 26f: aload 0
      // 270: aload 1
      // 271: aload 9
      // 273: aload 0
      // 274: getfield h9k._f6 Lzfz;
      // 277: invokevirtual h9k.u0f (Lt9d;Lmew;Lzfz;)V
      // 27a: iload 4
      // 27c: ifne 2a7
      // 27f: goto 286
      // 282: invokestatic h9k.a (Loov;)Loov;
      // 285: athrow
      // 286: iload 6
      // 288: goto 28f
      // 28b: invokestatic h9k.a (Loov;)Loov;
      // 28e: athrow
      // 28f: ifle 2b5
      // 292: aload 0
      // 293: aload 1
      // 294: aload 2
      // 295: aload 9
      // 297: invokevirtual mew.o_8 ()Lmew;
      // 29a: getstatic pcl.m4e Lh76;
      // 29d: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 2a0: goto 2a7
      // 2a3: invokestatic h9k.a (Loov;)Loov;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: aload 1
      // 2a9: aload 2
      // 2aa: aload 9
      // 2ac: invokevirtual mew.z6x ()Lmew;
      // 2af: getstatic pcl.qme Lh76;
      // 2b2: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 2b5: aload 7
      // 2b7: invokevirtual mew.z6x ()Lmew;
      // 2ba: astore 10
      // 2bc: iload 4
      // 2be: ifne 323
      // 2c1: aload 0
      // 2c2: aload 1
      // 2c3: aload 10
      // 2c5: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2c8: invokeinterface zfz.r_y ()Le0x; 1
      // 2cd: invokevirtual h9k.mgy (Le0x;)Z
      // 2d0: ifeq 320
      // 2d3: goto 2da
      // 2d6: invokestatic h9k.a (Loov;)Loov;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: aload 1
      // 2dc: aload 10
      // 2de: aload 0
      // 2df: getfield h9k._f6 Lzfz;
      // 2e2: invokevirtual h9k.u0f (Lt9d;Lmew;Lzfz;)V
      // 2e5: iload 4
      // 2e7: ifne 323
      // 2ea: goto 2f1
      // 2ed: invokestatic h9k.a (Loov;)Loov;
      // 2f0: athrow
      // 2f1: iload 6
      // 2f3: ifle 320
      // 2f6: goto 2fd
      // 2f9: invokestatic h9k.a (Loov;)Loov;
      // 2fc: athrow
      // 2fd: aload 0
      // 2fe: aload 1
      // 2ff: aload 2
      // 300: aload 10
      // 302: invokevirtual mew.y8e ()Lmew;
      // 305: getstatic pcl.t6u Lh76;
      // 308: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 30b: aload 0
      // 30c: aload 1
      // 30d: aload 2
      // 30e: aload 10
      // 310: invokevirtual mew.z6x ()Lmew;
      // 313: getstatic pcl.qme Lh76;
      // 316: invokespecial h9k.c2m (Lt9d;Ljava/util/Random;Lmew;Lh76;)V
      // 319: goto 320
      // 31c: invokestatic h9k.a (Loov;)Loov;
      // 31f: athrow
      // 320: iinc 6 1
      // 323: iload 4
      // 325: ifeq 154
      // 328: bipush 1
      // 329: ireturn
   }

   private void c2m(t9d param1, Random param2, mew param3, h76 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 2
      // 06: bipush 3
      // 07: invokevirtual java/util/Random.nextInt (I)I
      // 0a: iload 5
      // 0c: ifne 25
      // 0f: ifle 46
      // 12: goto 19
      // 15: invokestatic h9k.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: aload 3
      // 1b: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 1e: goto 25
      // 21: invokestatic h9k.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 46
      // 28: aload 0
      // 29: aload 1
      // 2a: aload 3
      // 2b: getstatic ox_.s25 Le0x;
      // 2e: invokevirtual e0x.l4i ()Lzfz;
      // 31: aload 4
      // 33: bipush 1
      // 34: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 37: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3c: invokevirtual h9k.u0f (Lt9d;Lmew;Lzfz;)V
      // 3f: goto 46
      // 42: invokestatic h9k.a (Loov;)Loov;
      // 45: athrow
      // 46: return
   }

   private void tf1(t9d var1, mew var2, int var3) {
      byte var5 = 2;
      int var10000 = t9d.c();
      int var6 = -var5;
      int var4 = var10000;

      while (var6 <= 0) {
         this.c9n(var1, var2.z89(var6), var3 + 1 - var6);
         var6++;
         if (var4 != 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
