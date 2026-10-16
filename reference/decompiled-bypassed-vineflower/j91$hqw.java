public class j91$hqw extends cjm {
   private j91 vu0;
   private int gni;
   private int clr;

   public j91$hqw(j91 var1) {
      this.vu0 = var1;
      this.k23(3);
   }

   @Override
   public boolean vle() {
      int var1 = t9d.b();
      g_3 var2 = this.vu0.q4v();

      g_3 var10000;
      label33: {
         try {
            var10000 = var2;
            if (var1 == 0) {
               break label33;
            }

            if (var2 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var2;
      }

      try {
         boolean var5 = var10000.gzr();
         if (var1 == 0) {
            return var5;
         }

         if (var5) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public void mnp() {
      this.gni = 0;
   }

   @Override
   public void zly() {
      this.vu0.lrh(false);
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: getfield j91$hqw.clr I
      // 005: bipush 1
      // 006: isub
      // 007: putfield j91$hqw.clr I
      // 00a: invokestatic t9d.b ()I
      // 00d: aload 0
      // 00e: getfield j91$hqw.vu0 Lj91;
      // 011: invokevirtual j91.q4v ()Lg_3;
      // 014: astore 2
      // 015: istore 1
      // 016: aload 0
      // 017: getfield j91$hqw.vu0 Lj91;
      // 01a: aload 2
      // 01b: invokevirtual j91.wxg (Li2h;)D
      // 01e: dstore 3
      // 01f: dload 3
      // 020: ldc2_w 4.0
      // 023: dcmpg
      // 024: iload 1
      // 025: ifeq 093
      // 028: ifge 07c
      // 02b: goto 032
      // 02e: invokestatic j91$hqw.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: iload 1
      // 034: ifeq 062
      // 037: goto 03e
      // 03a: invokestatic j91$hqw.a (Loov;)Loov;
      // 03d: athrow
      // 03e: getfield j91$hqw.clr I
      // 041: ifgt 061
      // 044: goto 04b
      // 047: invokestatic j91$hqw.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: bipush 20
      // 04e: putfield j91$hqw.clr I
      // 051: aload 0
      // 052: getfield j91$hqw.vu0 Lj91;
      // 055: aload 2
      // 056: invokevirtual j91._nm (Li2h;)Z
      // 059: pop
      // 05a: goto 061
      // 05d: invokestatic j91$hqw.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield j91$hqw.vu0 Lj91;
      // 065: invokevirtual j91.gvh ()Lbww;
      // 068: aload 2
      // 069: getfield g_3.o2v D
      // 06c: aload 2
      // 06d: getfield g_3.kfp D
      // 070: aload 2
      // 071: getfield g_3.vbd D
      // 074: dconst_1
      // 075: invokevirtual bww.n5p (DDDD)V
      // 078: iload 1
      // 079: ifne 27a
      // 07c: dload 3
      // 07d: ldc2_w 256.0
      // 080: iload 1
      // 081: ifeq 0a8
      // 084: goto 08b
      // 087: invokestatic j91$hqw.a (Loov;)Loov;
      // 08a: athrow
      // 08b: dcmpg
      // 08c: goto 093
      // 08f: invokestatic j91$hqw.a (Loov;)Loov;
      // 092: athrow
      // 093: ifge 252
      // 096: aload 2
      // 097: getfield g_3.o2v D
      // 09a: aload 0
      // 09b: getfield j91$hqw.vu0 Lj91;
      // 09e: getfield j91.o2v D
      // 0a1: goto 0a8
      // 0a4: invokestatic j91$hqw.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: dsub
      // 0a9: dstore 5
      // 0ab: aload 2
      // 0ac: invokevirtual g_3.aaw ()Lnh4;
      // 0af: getfield nh4.bx_ D
      // 0b2: aload 2
      // 0b3: getfield g_3.ikl F
      // 0b6: fconst_2
      // 0b7: fdiv
      // 0b8: f2d
      // 0b9: dadd
      // 0ba: aload 0
      // 0bb: getfield j91$hqw.vu0 Lj91;
      // 0be: getfield j91.kfp D
      // 0c1: aload 0
      // 0c2: getfield j91$hqw.vu0 Lj91;
      // 0c5: getfield j91.ikl F
      // 0c8: fconst_2
      // 0c9: fdiv
      // 0ca: f2d
      // 0cb: dadd
      // 0cc: dsub
      // 0cd: dstore 7
      // 0cf: aload 2
      // 0d0: getfield g_3.vbd D
      // 0d3: aload 0
      // 0d4: getfield j91$hqw.vu0 Lj91;
      // 0d7: getfield j91.vbd D
      // 0da: dsub
      // 0db: dstore 9
      // 0dd: aload 0
      // 0de: iload 1
      // 0df: ifeq 23e
      // 0e2: getfield j91$hqw.clr I
      // 0e5: ifgt 23d
      // 0e8: goto 0ef
      // 0eb: invokestatic j91$hqw.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: dup
      // 0f1: getfield j91$hqw.gni I
      // 0f4: bipush 1
      // 0f5: iadd
      // 0f6: putfield j91$hqw.gni I
      // 0f9: aload 0
      // 0fa: getfield j91$hqw.gni I
      // 0fd: bipush 1
      // 0fe: iload 1
      // 0ff: ifeq 143
      // 102: goto 109
      // 105: invokestatic j91$hqw.a (Loov;)Loov;
      // 108: athrow
      // 109: if_icmpne 12c
      // 10c: goto 113
      // 10f: invokestatic j91$hqw.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 0
      // 114: bipush 60
      // 116: putfield j91$hqw.clr I
      // 119: aload 0
      // 11a: getfield j91$hqw.vu0 Lj91;
      // 11d: bipush 1
      // 11e: invokevirtual j91.lrh (Z)V
      // 121: iload 1
      // 122: ifne 171
      // 125: goto 12c
      // 128: invokestatic j91$hqw.a (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: iload 1
      // 12e: ifeq 16a
      // 131: goto 138
      // 134: invokestatic j91$hqw.a (Loov;)Loov;
      // 137: athrow
      // 138: getfield j91$hqw.gni I
      // 13b: bipush 4
      // 13c: goto 143
      // 13f: invokestatic j91$hqw.a (Loov;)Loov;
      // 142: athrow
      // 143: if_icmpgt 157
      // 146: aload 0
      // 147: bipush 6
      // 149: putfield j91$hqw.clr I
      // 14c: iload 1
      // 14d: ifne 171
      // 150: goto 157
      // 153: invokestatic j91$hqw.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 0
      // 158: bipush 100
      // 15a: putfield j91$hqw.clr I
      // 15d: aload 0
      // 15e: bipush 0
      // 15f: putfield j91$hqw.gni I
      // 162: aload 0
      // 163: goto 16a
      // 166: invokestatic j91$hqw.a (Loov;)Loov;
      // 169: athrow
      // 16a: getfield j91$hqw.vu0 Lj91;
      // 16d: bipush 0
      // 16e: invokevirtual j91.lrh (Z)V
      // 171: aload 0
      // 172: iload 1
      // 173: ifeq 23e
      // 176: getfield j91$hqw.gni I
      // 179: bipush 1
      // 17a: if_icmple 23d
      // 17d: goto 184
      // 180: invokestatic j91$hqw.a (Loov;)Loov;
      // 183: athrow
      // 184: dload 3
      // 185: invokestatic fe6.dii (D)F
      // 188: invokestatic fe6.bug (F)F
      // 18b: ldc 0.5
      // 18d: nop
      // 18e: fmul
      // 18f: fstore 11
      // 191: aload 0
      // 192: getfield j91$hqw.vu0 Lj91;
      // 195: getfield j91.oay Lt9d;
      // 198: aconst_null
      // 199: checkcast ha9
      // 19c: sipush 1009
      // 19f: new mew
      // 1a2: dup
      // 1a3: aload 0
      // 1a4: getfield j91$hqw.vu0 Lj91;
      // 1a7: getfield j91.o2v D
      // 1aa: d2i
      // 1ab: aload 0
      // 1ac: getfield j91$hqw.vu0 Lj91;
      // 1af: getfield j91.kfp D
      // 1b2: d2i
      // 1b3: aload 0
      // 1b4: getfield j91$hqw.vu0 Lj91;
      // 1b7: getfield j91.vbd D
      // 1ba: d2i
      // 1bb: invokespecial mew.<init> (III)V
      // 1be: bipush 0
      // 1bf: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // 1c2: bipush 0
      // 1c3: istore 12
      // 1c5: iload 12
      // 1c7: bipush 1
      // 1c8: if_icmpge 23d
      // 1cb: new ka8
      // 1ce: dup
      // 1cf: aload 0
      // 1d0: getfield j91$hqw.vu0 Lj91;
      // 1d3: getfield j91.oay Lt9d;
      // 1d6: aload 0
      // 1d7: getfield j91$hqw.vu0 Lj91;
      // 1da: dload 5
      // 1dc: aload 0
      // 1dd: getfield j91$hqw.vu0 Lj91;
      // 1e0: invokevirtual j91.mbr ()Ljava/util/Random;
      // 1e3: invokevirtual java/util/Random.nextGaussian ()D
      // 1e6: fload 11
      // 1e8: f2d
      // 1e9: dmul
      // 1ea: dadd
      // 1eb: dload 7
      // 1ed: dload 9
      // 1ef: aload 0
      // 1f0: getfield j91$hqw.vu0 Lj91;
      // 1f3: invokevirtual j91.mbr ()Ljava/util/Random;
      // 1f6: invokevirtual java/util/Random.nextGaussian ()D
      // 1f9: fload 11
      // 1fb: f2d
      // 1fc: dmul
      // 1fd: dadd
      // 1fe: invokespecial ka8.<init> (Lt9d;Lg_3;DDD)V
      // 201: astore 13
      // 203: aload 13
      // 205: aload 0
      // 206: getfield j91$hqw.vu0 Lj91;
      // 209: getfield j91.kfp D
      // 20c: aload 0
      // 20d: getfield j91$hqw.vu0 Lj91;
      // 210: getfield j91.ikl F
      // 213: fconst_2
      // 214: fdiv
      // 215: f2d
      // 216: dadd
      // 217: ldc2_w 0.5
      // 21a: dadd
      // 21b: putfield ka8.kfp D
      // 21e: aload 0
      // 21f: getfield j91$hqw.vu0 Lj91;
      // 222: getfield j91.oay Lt9d;
      // 225: aload 13
      // 227: invokevirtual t9d.xzq (Li2h;)Z
      // 22a: pop
      // 22b: iinc 12 1
      // 22e: iload 1
      // 22f: ifeq 24e
      // 232: iload 1
      // 233: ifne 1c5
      // 236: goto 23d
      // 239: invokestatic j91$hqw.a (Loov;)Loov;
      // 23c: athrow
      // 23d: aload 0
      // 23e: getfield j91$hqw.vu0 Lj91;
      // 241: invokevirtual j91.ph8 ()Lknw;
      // 244: aload 2
      // 245: ldc 10.0
      // 247: nop
      // 248: ldc 10.0
      // 24a: nop
      // 24b: invokevirtual knw.rz3 (Li2h;FF)V
      // 24e: iload 1
      // 24f: ifne 27a
      // 252: aload 0
      // 253: getfield j91$hqw.vu0 Lj91;
      // 256: invokevirtual j91.zq2 ()Lp8a;
      // 259: invokevirtual p8a.pj2 ()V
      // 25c: aload 0
      // 25d: getfield j91$hqw.vu0 Lj91;
      // 260: invokevirtual j91.gvh ()Lbww;
      // 263: aload 2
      // 264: getfield g_3.o2v D
      // 267: aload 2
      // 268: getfield g_3.kfp D
      // 26b: aload 2
      // 26c: getfield g_3.vbd D
      // 26f: dconst_1
      // 270: invokevirtual bww.n5p (DDDD)V
      // 273: goto 27a
      // 276: invokestatic j91$hqw.a (Loov;)Loov;
      // 279: athrow
      // 27a: aload 0
      // 27b: invokespecial cjm.iad ()V
      // 27e: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
