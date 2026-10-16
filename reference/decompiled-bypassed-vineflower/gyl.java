import net.minecraft.tileentity.TileEntityPiston;

public class gyl extends q9h {
   private final qfn x_5 = c05.vz1().dwz();

   public void gux(TileEntityPiston param1, double param2, double param4, double param6, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraft/tileentity/TileEntityPiston.y8_ ()Lmew;
      // 004: astore 11
      // 006: invokestatic t9d.b ()I
      // 009: aload 1
      // 00a: invokevirtual net/minecraft/tileentity/TileEntityPiston.x1g ()Lzfz;
      // 00d: astore 12
      // 00f: istore 10
      // 011: aload 12
      // 013: invokeinterface zfz.r_y ()Le0x; 1
      // 018: astore 13
      // 01a: aload 13
      // 01c: invokevirtual e0x.p1r ()Lp3y;
      // 01f: getstatic p3y.cei Lp3y;
      // 022: if_acmpeq 28b
      // 025: aload 1
      // 026: fload 8
      // 028: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 02b: fconst_1
      // 02c: fcmpg
      // 02d: ifge 28b
      // 030: goto 037
      // 033: invokestatic gyl.a (Loov;)Loov;
      // 036: athrow
      // 037: invokestatic jom.yut ()Ljom;
      // 03a: astore 14
      // 03c: aload 14
      // 03e: invokevirtual jom.zuq ()Lq3g;
      // 041: astore 15
      // 043: aload 0
      // 044: getstatic yu2.nu_ Lgdz;
      // 047: invokevirtual gyl.g3j (Lgdz;)V
      // 04a: invokestatic qpm.cng ()V
      // 04d: sipush 770
      // 050: sipush 771
      // 053: invokestatic hzu.ru7 (II)V
      // 056: invokestatic hzu.spd ()V
      // 059: invokestatic hzu.o1b ()V
      // 05c: invokestatic c05.mtz ()Z
      // 05f: iload 10
      // 061: ifeq 08a
      // 064: ifeq 080
      // 067: goto 06e
      // 06a: invokestatic gyl.a (Loov;)Loov;
      // 06d: athrow
      // 06e: sipush 7425
      // 071: invokestatic hzu.nn9 (I)V
      // 074: iload 10
      // 076: ifne 08d
      // 079: goto 080
      // 07c: invokestatic gyl.a (Loov;)Loov;
      // 07f: athrow
      // 080: sipush 7424
      // 083: goto 08a
      // 086: invokestatic gyl.a (Loov;)Loov;
      // 089: athrow
      // 08a: invokestatic hzu.nn9 (I)V
      // 08d: aload 15
      // 08f: bipush 7
      // 091: getstatic gnl.n6w Lbe7;
      // 094: invokevirtual q3g.ezr (ILbe7;)V
      // 097: aload 15
      // 099: dload 2
      // 09a: d2f
      // 09b: aload 11
      // 09d: invokevirtual mew.getX ()I
      // 0a0: i2f
      // 0a1: fsub
      // 0a2: aload 1
      // 0a3: fload 8
      // 0a5: invokevirtual net/minecraft/tileentity/TileEntityPiston.oam (F)F
      // 0a8: fadd
      // 0a9: f2d
      // 0aa: dload 4
      // 0ac: d2f
      // 0ad: aload 11
      // 0af: invokevirtual mew.getY ()I
      // 0b2: i2f
      // 0b3: fsub
      // 0b4: aload 1
      // 0b5: fload 8
      // 0b7: invokevirtual net/minecraft/tileentity/TileEntityPiston.v12 (F)F
      // 0ba: fadd
      // 0bb: f2d
      // 0bc: dload 6
      // 0be: d2f
      // 0bf: aload 11
      // 0c1: invokevirtual mew.getZ ()I
      // 0c4: i2f
      // 0c5: fsub
      // 0c6: aload 1
      // 0c7: fload 8
      // 0c9: invokevirtual net/minecraft/tileentity/TileEntityPiston.owx (F)F
      // 0cc: fadd
      // 0cd: f2d
      // 0ce: invokevirtual q3g.nbz (DDD)V
      // 0d1: aload 0
      // 0d2: invokevirtual gyl.hzs ()Lt9d;
      // 0d5: astore 16
      // 0d7: aload 13
      // 0d9: getstatic ox_.e1u Lu4_;
      // 0dc: if_acmpne 135
      // 0df: aload 1
      // 0e0: fload 8
      // 0e2: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 0e5: ldc 0.5
      // 0e7: nop
      // 0e8: fcmpg
      // 0e9: iload 10
      // 0eb: ifeq 140
      // 0ee: goto 0f5
      // 0f1: invokestatic gyl.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifge 135
      // 0f8: goto 0ff
      // 0fb: invokestatic gyl.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 12
      // 101: getstatic u4_.t3h Lh76;
      // 104: bipush 1
      // 105: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 108: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 10d: astore 12
      // 10f: aload 0
      // 110: getfield gyl.x_5 Lqfn;
      // 113: invokevirtual qfn.mpi ()Lg_x;
      // 116: aload 16
      // 118: aload 0
      // 119: getfield gyl.x_5 Lqfn;
      // 11c: aload 12
      // 11e: aload 16
      // 120: aload 11
      // 122: invokevirtual qfn.b5n (Lzfz;Lm5n;Lmew;)Ldbw;
      // 125: aload 12
      // 127: aload 11
      // 129: aload 15
      // 12b: bipush 1
      // 12c: invokevirtual g_x.mh1 (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 12f: pop
      // 130: iload 10
      // 132: ifne 27b
      // 135: aload 1
      // 136: invokevirtual net/minecraft/tileentity/TileEntityPiston.s1i ()Z
      // 139: goto 140
      // 13c: invokestatic gyl.a (Loov;)Loov;
      // 13f: athrow
      // 140: iload 10
      // 142: ifeq 27a
      // 145: ifeq 253
      // 148: goto 14f
      // 14b: invokestatic gyl.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 1
      // 150: invokevirtual net/minecraft/tileentity/TileEntityPiston._2v ()Z
      // 153: iload 10
      // 155: ifeq 27a
      // 158: goto 15f
      // 15b: invokestatic gyl.a (Loov;)Loov;
      // 15e: athrow
      // 15f: ifne 253
      // 162: goto 169
      // 165: invokestatic gyl.a (Loov;)Loov;
      // 168: athrow
      // 169: aload 13
      // 16b: getstatic ox_.wdk Laog;
      // 16e: if_acmpne 182
      // 171: goto 178
      // 174: invokestatic gyl.a (Loov;)Loov;
      // 177: athrow
      // 178: getstatic u4_$vxa.voo Lu4_$vxa;
      // 17b: goto 185
      // 17e: invokestatic gyl.a (Loov;)Loov;
      // 181: athrow
      // 182: getstatic u4_$vxa.ek6 Lu4_$vxa;
      // 185: astore 17
      // 187: getstatic ox_.e1u Lu4_;
      // 18a: invokevirtual u4_.l4i ()Lzfz;
      // 18d: getstatic u4_.x38 Lzb_;
      // 190: aload 17
      // 192: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 197: getstatic u4_.dju Lqx_;
      // 19a: aload 12
      // 19c: getstatic aog.kx4 Lqx_;
      // 19f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1a4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1a9: astore 18
      // 1ab: aload 18
      // 1ad: getstatic u4_.t3h Lh76;
      // 1b0: aload 1
      // 1b1: fload 8
      // 1b3: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 1b6: ldc 0.5
      // 1b8: nop
      // 1b9: fcmpl
      // 1ba: iload 10
      // 1bc: ifeq 1ca
      // 1bf: iflt 1cd
      // 1c2: goto 1c9
      // 1c5: invokestatic gyl.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: bipush 1
      // 1ca: goto 1ce
      // 1cd: bipush 0
      // 1ce: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1d1: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1d6: astore 18
      // 1d8: aload 0
      // 1d9: getfield gyl.x_5 Lqfn;
      // 1dc: invokevirtual qfn.mpi ()Lg_x;
      // 1df: aload 16
      // 1e1: aload 0
      // 1e2: getfield gyl.x_5 Lqfn;
      // 1e5: aload 18
      // 1e7: aload 16
      // 1e9: aload 11
      // 1eb: invokevirtual qfn.b5n (Lzfz;Lm5n;Lmew;)Ldbw;
      // 1ee: aload 18
      // 1f0: aload 11
      // 1f2: aload 15
      // 1f4: bipush 1
      // 1f5: invokevirtual g_x.mh1 (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 1f8: pop
      // 1f9: aload 15
      // 1fb: dload 2
      // 1fc: d2f
      // 1fd: aload 11
      // 1ff: invokevirtual mew.getX ()I
      // 202: i2f
      // 203: fsub
      // 204: f2d
      // 205: dload 4
      // 207: d2f
      // 208: aload 11
      // 20a: invokevirtual mew.getY ()I
      // 20d: i2f
      // 20e: fsub
      // 20f: f2d
      // 210: dload 6
      // 212: d2f
      // 213: aload 11
      // 215: invokevirtual mew.getZ ()I
      // 218: i2f
      // 219: fsub
      // 21a: f2d
      // 21b: invokevirtual q3g.nbz (DDD)V
      // 21e: aload 12
      // 220: getstatic aog.cv2 Lh76;
      // 223: bipush 1
      // 224: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 227: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 22c: pop
      // 22d: aload 0
      // 22e: getfield gyl.x_5 Lqfn;
      // 231: invokevirtual qfn.mpi ()Lg_x;
      // 234: aload 16
      // 236: aload 0
      // 237: getfield gyl.x_5 Lqfn;
      // 23a: aload 12
      // 23c: aload 16
      // 23e: aload 11
      // 240: invokevirtual qfn.b5n (Lzfz;Lm5n;Lmew;)Ldbw;
      // 243: aload 12
      // 245: aload 11
      // 247: aload 15
      // 249: bipush 1
      // 24a: invokevirtual g_x.mh1 (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 24d: pop
      // 24e: iload 10
      // 250: ifne 27b
      // 253: aload 0
      // 254: getfield gyl.x_5 Lqfn;
      // 257: invokevirtual qfn.mpi ()Lg_x;
      // 25a: aload 16
      // 25c: aload 0
      // 25d: getfield gyl.x_5 Lqfn;
      // 260: aload 12
      // 262: aload 16
      // 264: aload 11
      // 266: invokevirtual qfn.b5n (Lzfz;Lm5n;Lmew;)Ldbw;
      // 269: aload 12
      // 26b: aload 11
      // 26d: aload 15
      // 26f: bipush 0
      // 270: invokevirtual g_x.mh1 (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 273: goto 27a
      // 276: invokestatic gyl.a (Loov;)Loov;
      // 279: athrow
      // 27a: pop
      // 27b: aload 15
      // 27d: dconst_0
      // 27e: dconst_0
      // 27f: dconst_0
      // 280: invokevirtual q3g.nbz (DDD)V
      // 283: aload 14
      // 285: invokevirtual jom.q7g ()V
      // 288: invokestatic qpm.ne_ ()V
      // 28b: return
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.gux((TileEntityPiston)var1, var2, var4, var6, var8, var9);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
