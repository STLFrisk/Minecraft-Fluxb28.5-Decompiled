import java.util.Random;

public class pz8 extends e0x {
   public pz8(boolean var1) {
      int var2 = t9d.c();
      super(p3y.zs8);
      if (var2 == 0) {
         try {
            if (var1) {
               this._p_(true);
            }
         } catch (oov var3) {
            throw a(var3);
         }

         this.a0i = var1;
      }
   }

   @Override
   public int odp(t9d var1) {
      return 30;
   }

   @Override
   public void uqb(t9d var1, mew var2, ha9 var3) {
      this.q1v(var1, var2);
      super.uqb(var1, var2, var3);
   }

   @Override
   public void xqy(t9d var1, mew var2, i2h var3) {
      this.q1v(var1, var2);
      super.xqy(var1, var2, var3);
   }

   @Override
   public boolean cl2(t9d var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      this.q1v(var1, var2);
      return super.cl2(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private void q1v(t9d var1, mew var2) {
      try {
         this.obd(var1, var2);
         if (this == ox_.axm) {
            var1.gfy(var2, ox_.ru1.l4i());
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void zvy(t9d var1, mew var2, zfz var3, Random var4) {
      try {
         if (this == ox_.ru1) {
            var1.gfy(var2, ox_.axm.l4i());
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.deg;
   }

   @Override
   public int osi(int var1, Random var2) {
      return this.bzr(var2) + var2.nextInt(var1 + 1);
   }

   @Override
   public int bzr(Random var1) {
      return 4 + var1.nextInt(2);
   }

   @Override
   public void ix7(t9d var1, mew var2, zfz var3, float var4, int var5) {
      super.ix7(var1, var2, var3, var4, var5);
      if (this.j39(var3, var1.fsy, var5) != u7m.gfm(this)) {
         int var6 = 1 + var1.fsy.nextInt(5);
         this.u9y(var1, var2, var6);
      }
   }

   @Override
   public void kyo(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifeq 20
      // 0b: getfield pz8.a0i Z
      // 0e: ifeq 25
      // 11: goto 18
      // 14: invokestatic pz8.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic pz8.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: invokespecial pz8.obd (Lt9d;Lmew;)V
      // 25: return
   }

   private void obd(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield t9d.fsy Ljava/util/Random;
      // 004: astore 4
      // 006: invokestatic t9d.b ()I
      // 009: ldc2_w 0.0625
      // 00c: dstore 5
      // 00e: istore 3
      // 00f: bipush 0
      // 010: istore 7
      // 012: iload 7
      // 014: bipush 6
      // 016: if_icmpge 287
      // 019: aload 2
      // 01a: invokevirtual mew.getX ()I
      // 01d: i2f
      // 01e: aload 4
      // 020: invokevirtual java/util/Random.nextFloat ()F
      // 023: fadd
      // 024: f2d
      // 025: dstore 8
      // 027: aload 2
      // 028: invokevirtual mew.getY ()I
      // 02b: i2f
      // 02c: aload 4
      // 02e: invokevirtual java/util/Random.nextFloat ()F
      // 031: fadd
      // 032: f2d
      // 033: dstore 10
      // 035: aload 2
      // 036: invokevirtual mew.getZ ()I
      // 039: i2f
      // 03a: aload 4
      // 03c: invokevirtual java/util/Random.nextFloat ()F
      // 03f: fadd
      // 040: f2d
      // 041: dstore 12
      // 043: iload 7
      // 045: iload 3
      // 046: ifeq 086
      // 049: ifne 084
      // 04c: goto 053
      // 04f: invokestatic pz8.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 1
      // 054: aload 2
      // 055: invokevirtual mew.nuv ()Lmew;
      // 058: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 05b: invokeinterface zfz.r_y ()Le0x; 1
      // 060: invokevirtual e0x.ko5 ()Z
      // 063: iload 3
      // 064: ifeq 086
      // 067: goto 06e
      // 06a: invokestatic pz8.a (Loov;)Loov;
      // 06d: athrow
      // 06e: ifne 084
      // 071: goto 078
      // 074: invokestatic pz8.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 2
      // 079: invokevirtual mew.getY ()I
      // 07c: i2d
      // 07d: dload 5
      // 07f: dadd
      // 080: dconst_1
      // 081: dadd
      // 082: dstore 10
      // 084: iload 7
      // 086: bipush 1
      // 087: iload 3
      // 088: ifeq 0c7
      // 08b: if_icmpne 0c4
      // 08e: goto 095
      // 091: invokestatic pz8.a (Loov;)Loov;
      // 094: athrow
      // 095: aload 1
      // 096: aload 2
      // 097: invokevirtual mew.eve ()Lmew;
      // 09a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09d: invokeinterface zfz.r_y ()Le0x; 1
      // 0a2: invokevirtual e0x.ko5 ()Z
      // 0a5: iload 3
      // 0a6: ifeq 0c6
      // 0a9: goto 0b0
      // 0ac: invokestatic pz8.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: ifne 0c4
      // 0b3: goto 0ba
      // 0b6: invokestatic pz8.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 2
      // 0bb: invokevirtual mew.getY ()I
      // 0be: i2d
      // 0bf: dload 5
      // 0c1: dsub
      // 0c2: dstore 10
      // 0c4: iload 7
      // 0c6: bipush 2
      // 0c7: iload 3
      // 0c8: ifeq 109
      // 0cb: if_icmpne 106
      // 0ce: goto 0d5
      // 0d1: invokestatic pz8.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aload 1
      // 0d6: aload 2
      // 0d7: invokevirtual mew.z6x ()Lmew;
      // 0da: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0dd: invokeinterface zfz.r_y ()Le0x; 1
      // 0e2: invokevirtual e0x.ko5 ()Z
      // 0e5: iload 3
      // 0e6: ifeq 108
      // 0e9: goto 0f0
      // 0ec: invokestatic pz8.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: ifne 106
      // 0f3: goto 0fa
      // 0f6: invokestatic pz8.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 2
      // 0fb: invokevirtual mew.getZ ()I
      // 0fe: i2d
      // 0ff: dload 5
      // 101: dadd
      // 102: dconst_1
      // 103: dadd
      // 104: dstore 12
      // 106: iload 7
      // 108: bipush 3
      // 109: iload 3
      // 10a: ifeq 149
      // 10d: if_icmpne 146
      // 110: goto 117
      // 113: invokestatic pz8.a (Loov;)Loov;
      // 116: athrow
      // 117: aload 1
      // 118: aload 2
      // 119: invokevirtual mew.idu ()Lmew;
      // 11c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 11f: invokeinterface zfz.r_y ()Le0x; 1
      // 124: invokevirtual e0x.ko5 ()Z
      // 127: iload 3
      // 128: ifeq 148
      // 12b: goto 132
      // 12e: invokestatic pz8.a (Loov;)Loov;
      // 131: athrow
      // 132: ifne 146
      // 135: goto 13c
      // 138: invokestatic pz8.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 2
      // 13d: invokevirtual mew.getZ ()I
      // 140: i2d
      // 141: dload 5
      // 143: dsub
      // 144: dstore 12
      // 146: iload 7
      // 148: bipush 4
      // 149: iload 3
      // 14a: ifeq 196
      // 14d: if_icmpne 188
      // 150: goto 157
      // 153: invokestatic pz8.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 1
      // 158: aload 2
      // 159: invokevirtual mew.o_8 ()Lmew;
      // 15c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 15f: invokeinterface zfz.r_y ()Le0x; 1
      // 164: invokevirtual e0x.ko5 ()Z
      // 167: iload 3
      // 168: ifeq 18a
      // 16b: goto 172
      // 16e: invokestatic pz8.a (Loov;)Loov;
      // 171: athrow
      // 172: ifne 188
      // 175: goto 17c
      // 178: invokestatic pz8.a (Loov;)Loov;
      // 17b: athrow
      // 17c: aload 2
      // 17d: invokevirtual mew.getX ()I
      // 180: i2d
      // 181: dload 5
      // 183: dadd
      // 184: dconst_1
      // 185: dadd
      // 186: dstore 8
      // 188: iload 7
      // 18a: iload 3
      // 18b: ifeq 1d0
      // 18e: bipush 5
      // 18f: goto 196
      // 192: invokestatic pz8.a (Loov;)Loov;
      // 195: athrow
      // 196: if_icmpne 1c8
      // 199: aload 1
      // 19a: aload 2
      // 19b: invokevirtual mew.y8e ()Lmew;
      // 19e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1a1: invokeinterface zfz.r_y ()Le0x; 1
      // 1a6: invokevirtual e0x.ko5 ()Z
      // 1a9: iload 3
      // 1aa: ifeq 1d0
      // 1ad: goto 1b4
      // 1b0: invokestatic pz8.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: ifne 1c8
      // 1b7: goto 1be
      // 1ba: invokestatic pz8.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: aload 2
      // 1bf: invokevirtual mew.getX ()I
      // 1c2: i2d
      // 1c3: dload 5
      // 1c5: dsub
      // 1c6: dstore 8
      // 1c8: dload 8
      // 1ca: aload 2
      // 1cb: invokevirtual mew.getX ()I
      // 1ce: i2d
      // 1cf: dcmpg
      // 1d0: iload 3
      // 1d1: ifeq 1ef
      // 1d4: iflt 266
      // 1d7: goto 1de
      // 1da: invokestatic pz8.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: dload 8
      // 1e0: aload 2
      // 1e1: invokevirtual mew.getX ()I
      // 1e4: bipush 1
      // 1e5: iadd
      // 1e6: i2d
      // 1e7: dcmpl
      // 1e8: goto 1ef
      // 1eb: invokestatic pz8.a (Loov;)Loov;
      // 1ee: athrow
      // 1ef: iload 3
      // 1f0: ifeq 208
      // 1f3: ifgt 266
      // 1f6: goto 1fd
      // 1f9: invokestatic pz8.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: dload 10
      // 1ff: dconst_0
      // 200: dcmpg
      // 201: goto 208
      // 204: invokestatic pz8.a (Loov;)Loov;
      // 207: athrow
      // 208: iload 3
      // 209: ifeq 227
      // 20c: iflt 266
      // 20f: goto 216
      // 212: invokestatic pz8.a (Loov;)Loov;
      // 215: athrow
      // 216: dload 10
      // 218: aload 2
      // 219: invokevirtual mew.getY ()I
      // 21c: bipush 1
      // 21d: iadd
      // 21e: i2d
      // 21f: dcmpl
      // 220: goto 227
      // 223: invokestatic pz8.a (Loov;)Loov;
      // 226: athrow
      // 227: iload 3
      // 228: ifeq 244
      // 22b: ifgt 266
      // 22e: goto 235
      // 231: invokestatic pz8.a (Loov;)Loov;
      // 234: athrow
      // 235: dload 12
      // 237: aload 2
      // 238: invokevirtual mew.getZ ()I
      // 23b: i2d
      // 23c: dcmpg
      // 23d: goto 244
      // 240: invokestatic pz8.a (Loov;)Loov;
      // 243: athrow
      // 244: iload 3
      // 245: ifeq 263
      // 248: iflt 266
      // 24b: goto 252
      // 24e: invokestatic pz8.a (Loov;)Loov;
      // 251: athrow
      // 252: dload 12
      // 254: aload 2
      // 255: invokevirtual mew.getZ ()I
      // 258: bipush 1
      // 259: iadd
      // 25a: i2d
      // 25b: dcmpl
      // 25c: goto 263
      // 25f: invokestatic pz8.a (Loov;)Loov;
      // 262: athrow
      // 263: ifle 280
      // 266: aload 1
      // 267: getstatic w_0.dyc Lw_0;
      // 26a: dload 8
      // 26c: dload 10
      // 26e: dload 12
      // 270: dconst_0
      // 271: dconst_0
      // 272: dconst_0
      // 273: bipush 0
      // 274: newarray 10
      // 276: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 279: goto 280
      // 27c: invokestatic pz8.a (Loov;)Loov;
      // 27f: athrow
      // 280: iinc 7 1
      // 283: iload 3
      // 284: ifne 012
      // 287: return
   }

   @Override
   public erg b4a(zfz var1) {
      return new erg(ox_.axm);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
