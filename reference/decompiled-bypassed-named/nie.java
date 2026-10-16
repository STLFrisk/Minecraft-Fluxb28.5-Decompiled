public class nie extends g6r {
   public nie() {
      this.dsx = 64;
      this.apc = 64;
      this.am5 = new tf8[12];
      this.axs = new tf8(this);
      int var10000 = OpaquePredicate.c();
      this.axs.fc6(0, 0).ge4(-6.0F, 10.0F, -8.0F, 12, 12, 16);
      int var1 = var10000;
      this.axs.fc6(0, 28).ge4(-8.0F, 10.0F, -6.0F, 2, 12, 12);
      this.axs.fc6(0, 28).kxm(6.0F, 10.0F, -6.0F, 2, 12, 12, true);
      this.axs.fc6(16, 40).ge4(-6.0F, 8.0F, -6.0F, 12, 2, 12);
      this.axs.fc6(16, 40).ge4(-6.0F, 22.0F, -6.0F, 12, 2, 12);
      int var2 = 0;

      while (true) {
         if (var2 < this.am5.length) {
            try {
               this.am5[var2] = new tf8(this, 0, 0);
               this.am5[var2].ge4(-1.0F, -4.5F, -1.0F, 2, 9, 2);
               this.axs.i_6(this.am5[var2]);
               var2++;
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (oov var3) {
               throw a(var3);
            }
         }

         this.sfg = new tf8(this, 8, 0);
         this.sfg.ge4(-1.0F, 15.0F, 0.0F, 2, 2, 1);
         this.axs.i_6(this.sfg);
         this.vlm = new tf8[3];
         this.vlm[0] = new tf8(this, 40, 0);
         this.vlm[0].ge4(-2.0F, 14.0F, 7.0F, 4, 4, 8);
         this.vlm[1] = new tf8(this, 0, 54);
         this.vlm[1].ge4(0.0F, 14.0F, 0.0F, 3, 3, 7);
         this.vlm[2] = new tf8(this);
         this.vlm[2].fc6(41, 32).ge4(0.0F, 14.0F, 0.0F, 2, 2, 6);
         this.vlm[2].fc6(25, 19).ge4(1.0F, 10.5F, 3.0F, 1, 9, 9);
         this.axs.i_6(this.vlm[0]);
         this.vlm[0].i_6(this.vlm[1]);
         this.vlm[1].i_6(this.vlm[2]);
         break;
      }
   }

   public int w9t() {
      return 54;
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.axs.vca(var7);
   }

   @Override
   public void ltd(float param1, float param2, float param3, float param4, float param5, float param6, EntityLivingBase param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 7
      // 002: checkcast c9p
      // 005: astore 9
      // 007: invokestatic OpaquePredicate.c ()I
      // 00a: fload 3
      // 00b: aload 9
      // 00d: getfield c9p.g25 I
      // 010: i2f
      // 011: fsub
      // 012: fstore 10
      // 014: aload 0
      // 015: getfield nie.axs Ltf8;
      // 018: fload 4
      // 01a: ldc 57.295776
      // 01c: nop
      // 01d: fdiv
      // 01e: putfield tf8.r80 F
      // 021: aload 0
      // 022: getfield nie.axs Ltf8;
      // 025: fload 5
      // 027: ldc 57.295776
      // 029: nop
      // 02a: fdiv
      // 02b: putfield tf8.pod F
      // 02e: bipush 12
      // 030: newarray 6
      // 032: dup
      // 033: bipush 0
      // 034: ldc 1.75
      // 036: nop
      // 037: fastore
      // 038: dup
      // 039: bipush 1
      // 03a: ldc 0.25
      // 03c: nop
      // 03d: fastore
      // 03e: dup
      // 03f: bipush 2
      // 040: fconst_0
      // 041: fastore
      // 042: dup
      // 043: bipush 3
      // 044: fconst_0
      // 045: fastore
      // 046: dup
      // 047: bipush 4
      // 048: ldc 0.5
      // 04a: nop
      // 04b: fastore
      // 04c: dup
      // 04d: bipush 5
      // 04e: ldc 0.5
      // 050: nop
      // 051: fastore
      // 052: dup
      // 053: bipush 6
      // 055: ldc 0.5
      // 057: nop
      // 058: fastore
      // 059: dup
      // 05a: bipush 7
      // 05c: ldc 0.5
      // 05e: nop
      // 05f: fastore
      // 060: dup
      // 061: bipush 8
      // 063: ldc 1.25
      // 065: nop
      // 066: fastore
      // 067: dup
      // 068: bipush 9
      // 06a: ldc 0.75
      // 06c: nop
      // 06d: fastore
      // 06e: dup
      // 06f: bipush 10
      // 071: fconst_0
      // 072: fastore
      // 073: dup
      // 074: bipush 11
      // 076: fconst_0
      // 077: fastore
      // 078: astore 11
      // 07a: bipush 12
      // 07c: newarray 6
      // 07e: dup
      // 07f: bipush 0
      // 080: fconst_0
      // 081: fastore
      // 082: dup
      // 083: bipush 1
      // 084: fconst_0
      // 085: fastore
      // 086: dup
      // 087: bipush 2
      // 088: fconst_0
      // 089: fastore
      // 08a: dup
      // 08b: bipush 3
      // 08c: fconst_0
      // 08d: fastore
      // 08e: dup
      // 08f: bipush 4
      // 090: ldc 0.25
      // 092: nop
      // 093: fastore
      // 094: dup
      // 095: bipush 5
      // 096: ldc 1.75
      // 098: nop
      // 099: fastore
      // 09a: dup
      // 09b: bipush 6
      // 09d: ldc 1.25
      // 09f: nop
      // 0a0: fastore
      // 0a1: dup
      // 0a2: bipush 7
      // 0a4: ldc 0.75
      // 0a6: nop
      // 0a7: fastore
      // 0a8: dup
      // 0a9: bipush 8
      // 0ab: fconst_0
      // 0ac: fastore
      // 0ad: dup
      // 0ae: bipush 9
      // 0b0: fconst_0
      // 0b1: fastore
      // 0b2: dup
      // 0b3: bipush 10
      // 0b5: fconst_0
      // 0b6: fastore
      // 0b7: dup
      // 0b8: bipush 11
      // 0ba: fconst_0
      // 0bb: fastore
      // 0bc: astore 12
      // 0be: bipush 12
      // 0c0: newarray 6
      // 0c2: dup
      // 0c3: bipush 0
      // 0c4: fconst_0
      // 0c5: fastore
      // 0c6: dup
      // 0c7: bipush 1
      // 0c8: fconst_0
      // 0c9: fastore
      // 0ca: dup
      // 0cb: bipush 2
      // 0cc: ldc 0.25
      // 0ce: nop
      // 0cf: fastore
      // 0d0: dup
      // 0d1: bipush 3
      // 0d2: ldc 1.75
      // 0d4: nop
      // 0d5: fastore
      // 0d6: dup
      // 0d7: bipush 4
      // 0d8: fconst_0
      // 0d9: fastore
      // 0da: dup
      // 0db: bipush 5
      // 0dc: fconst_0
      // 0dd: fastore
      // 0de: dup
      // 0df: bipush 6
      // 0e1: fconst_0
      // 0e2: fastore
      // 0e3: dup
      // 0e4: bipush 7
      // 0e6: fconst_0
      // 0e7: fastore
      // 0e8: dup
      // 0e9: bipush 8
      // 0eb: fconst_0
      // 0ec: fastore
      // 0ed: dup
      // 0ee: bipush 9
      // 0f0: fconst_0
      // 0f1: fastore
      // 0f2: dup
      // 0f3: bipush 10
      // 0f5: ldc 0.75
      // 0f7: nop
      // 0f8: fastore
      // 0f9: dup
      // 0fa: bipush 11
      // 0fc: ldc 1.25
      // 0fe: nop
      // 0ff: fastore
      // 100: astore 13
      // 102: istore 8
      // 104: bipush 12
      // 106: newarray 6
      // 108: dup
      // 109: bipush 0
      // 10a: fconst_0
      // 10b: fastore
      // 10c: dup
      // 10d: bipush 1
      // 10e: fconst_0
      // 10f: fastore
      // 110: dup
      // 111: bipush 2
      // 112: ldc 8.0
      // 114: nop
      // 115: fastore
      // 116: dup
      // 117: bipush 3
      // 118: ldc -8.0
      // 11a: nop
      // 11b: fastore
      // 11c: dup
      // 11d: bipush 4
      // 11e: ldc -8.0
      // 120: nop
      // 121: fastore
      // 122: dup
      // 123: bipush 5
      // 124: ldc 8.0
      // 126: nop
      // 127: fastore
      // 128: dup
      // 129: bipush 6
      // 12b: ldc 8.0
      // 12d: nop
      // 12e: fastore
      // 12f: dup
      // 130: bipush 7
      // 132: ldc -8.0
      // 134: nop
      // 135: fastore
      // 136: dup
      // 137: bipush 8
      // 139: fconst_0
      // 13a: fastore
      // 13b: dup
      // 13c: bipush 9
      // 13e: fconst_0
      // 13f: fastore
      // 140: dup
      // 141: bipush 10
      // 143: ldc 8.0
      // 145: nop
      // 146: fastore
      // 147: dup
      // 148: bipush 11
      // 14a: ldc -8.0
      // 14c: nop
      // 14d: fastore
      // 14e: astore 14
      // 150: bipush 12
      // 152: newarray 6
      // 154: dup
      // 155: bipush 0
      // 156: ldc -8.0
      // 158: nop
      // 159: fastore
      // 15a: dup
      // 15b: bipush 1
      // 15c: ldc -8.0
      // 15e: nop
      // 15f: fastore
      // 160: dup
      // 161: bipush 2
      // 162: ldc -8.0
      // 164: nop
      // 165: fastore
      // 166: dup
      // 167: bipush 3
      // 168: ldc -8.0
      // 16a: nop
      // 16b: fastore
      // 16c: dup
      // 16d: bipush 4
      // 16e: fconst_0
      // 16f: fastore
      // 170: dup
      // 171: bipush 5
      // 172: fconst_0
      // 173: fastore
      // 174: dup
      // 175: bipush 6
      // 177: fconst_0
      // 178: fastore
      // 179: dup
      // 17a: bipush 7
      // 17c: fconst_0
      // 17d: fastore
      // 17e: dup
      // 17f: bipush 8
      // 181: ldc 8.0
      // 183: nop
      // 184: fastore
      // 185: dup
      // 186: bipush 9
      // 188: ldc 8.0
      // 18a: nop
      // 18b: fastore
      // 18c: dup
      // 18d: bipush 10
      // 18f: ldc 8.0
      // 191: nop
      // 192: fastore
      // 193: dup
      // 194: bipush 11
      // 196: ldc 8.0
      // 198: nop
      // 199: fastore
      // 19a: astore 15
      // 19c: bipush 12
      // 19e: newarray 6
      // 1a0: dup
      // 1a1: bipush 0
      // 1a2: ldc 8.0
      // 1a4: nop
      // 1a5: fastore
      // 1a6: dup
      // 1a7: bipush 1
      // 1a8: ldc -8.0
      // 1aa: nop
      // 1ab: fastore
      // 1ac: dup
      // 1ad: bipush 2
      // 1ae: fconst_0
      // 1af: fastore
      // 1b0: dup
      // 1b1: bipush 3
      // 1b2: fconst_0
      // 1b3: fastore
      // 1b4: dup
      // 1b5: bipush 4
      // 1b6: ldc -8.0
      // 1b8: nop
      // 1b9: fastore
      // 1ba: dup
      // 1bb: bipush 5
      // 1bc: ldc -8.0
      // 1be: nop
      // 1bf: fastore
      // 1c0: dup
      // 1c1: bipush 6
      // 1c3: ldc 8.0
      // 1c5: nop
      // 1c6: fastore
      // 1c7: dup
      // 1c8: bipush 7
      // 1ca: ldc 8.0
      // 1cc: nop
      // 1cd: fastore
      // 1ce: dup
      // 1cf: bipush 8
      // 1d1: ldc 8.0
      // 1d3: nop
      // 1d4: fastore
      // 1d5: dup
      // 1d6: bipush 9
      // 1d8: ldc -8.0
      // 1da: nop
      // 1db: fastore
      // 1dc: dup
      // 1dd: bipush 10
      // 1df: fconst_0
      // 1e0: fastore
      // 1e1: dup
      // 1e2: bipush 11
      // 1e4: fconst_0
      // 1e5: fastore
      // 1e6: astore 16
      // 1e8: fconst_1
      // 1e9: aload 9
      // 1eb: fload 10
      // 1ed: invokevirtual c9p.sah (F)F
      // 1f0: fsub
      // 1f1: ldc 0.55
      // 1f3: nop
      // 1f4: fmul
      // 1f5: fstore 17
      // 1f7: bipush 0
      // 1f8: istore 18
      // 1fa: iload 18
      // 1fc: bipush 12
      // 1fe: if_icmpge 2c1
      // 201: aload 0
      // 202: getfield nie.am5 [Ltf8;
      // 205: iload 18
      // 207: aaload
      // 208: ldc 3.1415927
      // 20a: nop
      // 20b: aload 11
      // 20d: iload 18
      // 20f: faload
      // 210: fmul
      // 211: putfield tf8.pod F
      // 214: aload 0
      // 215: getfield nie.am5 [Ltf8;
      // 218: iload 18
      // 21a: aaload
      // 21b: ldc 3.1415927
      // 21d: nop
      // 21e: aload 12
      // 220: iload 18
      // 222: faload
      // 223: fmul
      // 224: putfield tf8.r80 F
      // 227: aload 0
      // 228: getfield nie.am5 [Ltf8;
      // 22b: iload 18
      // 22d: aaload
      // 22e: ldc 3.1415927
      // 230: nop
      // 231: aload 13
      // 233: iload 18
      // 235: faload
      // 236: fmul
      // 237: putfield tf8.oo7 F
      // 23a: aload 0
      // 23b: getfield nie.am5 [Ltf8;
      // 23e: iload 18
      // 240: aaload
      // 241: aload 14
      // 243: iload 18
      // 245: faload
      // 246: fconst_1
      // 247: fload 3
      // 248: ldc 1.5
      // 24a: nop
      // 24b: fmul
      // 24c: iload 18
      // 24e: i2f
      // 24f: fadd
      // 250: invokestatic fe6.ssk (F)F
      // 253: ldc 0.01
      // 255: nop
      // 256: fmul
      // 257: fadd
      // 258: fload 17
      // 25a: fsub
      // 25b: fmul
      // 25c: putfield tf8._ki F
      // 25f: aload 0
      // 260: getfield nie.am5 [Ltf8;
      // 263: iload 18
      // 265: aaload
      // 266: ldc 16.0
      // 268: nop
      // 269: aload 15
      // 26b: iload 18
      // 26d: faload
      // 26e: fconst_1
      // 26f: fload 3
      // 270: ldc 1.5
      // 272: nop
      // 273: fmul
      // 274: iload 18
      // 276: i2f
      // 277: fadd
      // 278: invokestatic fe6.ssk (F)F
      // 27b: ldc 0.01
      // 27d: nop
      // 27e: fmul
      // 27f: fadd
      // 280: fload 17
      // 282: fsub
      // 283: fmul
      // 284: fadd
      // 285: putfield tf8.ca7 F
      // 288: aload 0
      // 289: getfield nie.am5 [Ltf8;
      // 28c: iload 18
      // 28e: aaload
      // 28f: aload 16
      // 291: iload 18
      // 293: faload
      // 294: fconst_1
      // 295: fload 3
      // 296: ldc 1.5
      // 298: nop
      // 299: fmul
      // 29a: iload 18
      // 29c: i2f
      // 29d: fadd
      // 29e: invokestatic fe6.ssk (F)F
      // 2a1: ldc 0.01
      // 2a3: nop
      // 2a4: fmul
      // 2a5: fadd
      // 2a6: fload 17
      // 2a8: fsub
      // 2a9: fmul
      // 2aa: putfield tf8.kit F
      // 2ad: iinc 18 1
      // 2b0: iload 8
      // 2b2: ifne 2cb
      // 2b5: iload 8
      // 2b7: ifeq 1fa
      // 2ba: goto 2c1
      // 2bd: invokestatic nie.a (Loov;)Loov;
      // 2c0: athrow
      // 2c1: aload 0
      // 2c2: getfield nie.sfg Ltf8;
      // 2c5: ldc -8.25
      // 2c7: nop
      // 2c8: putfield tf8.kit F
      // 2cb: invokestatic Minecraft.vz1 ()Lc05;
      // 2ce: invokevirtual Minecraft.nsd ()Li2h;
      // 2d1: astore 18
      // 2d3: aload 9
      // 2d5: iload 8
      // 2d7: ifne 2f0
      // 2da: invokevirtual c9p._sb ()Z
      // 2dd: ifeq 2ee
      // 2e0: goto 2e7
      // 2e3: invokestatic nie.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: aload 9
      // 2e9: invokevirtual c9p.e6m ()Lg_3;
      // 2ec: astore 18
      // 2ee: aload 18
      // 2f0: iload 8
      // 2f2: ifne 301
      // 2f5: ifnull 3b9
      // 2f8: goto 2ff
      // 2fb: invokestatic nie.a (Loov;)Loov;
      // 2fe: athrow
      // 2ff: aload 18
      // 301: fconst_0
      // 302: invokevirtual EntityLivingBase.tib (F)Lfqr;
      // 305: astore 19
      // 307: aload 7
      // 309: fconst_0
      // 30a: invokevirtual EntityLivingBase.tib (F)Lfqr;
      // 30d: astore 20
      // 30f: aload 19
      // 311: getfield fqr.gn5 D
      // 314: aload 20
      // 316: getfield fqr.gn5 D
      // 319: dsub
      // 31a: dstore 21
      // 31c: iload 8
      // 31e: ifne 33e
      // 321: dload 21
      // 323: dconst_0
      // 324: dcmpl
      // 325: ifle 343
      // 328: goto 32f
      // 32b: invokestatic nie.a (Loov;)Loov;
      // 32e: athrow
      // 32f: aload 0
      // 330: getfield nie.sfg Ltf8;
      // 333: fconst_0
      // 334: putfield tf8.ca7 F
      // 337: goto 33e
      // 33a: invokestatic nie.a (Loov;)Loov;
      // 33d: athrow
      // 33e: iload 8
      // 340: ifeq 352
      // 343: aload 0
      // 344: getfield nie.sfg Ltf8;
      // 347: fconst_1
      // 348: putfield tf8.ca7 F
      // 34b: goto 352
      // 34e: invokestatic nie.a (Loov;)Loov;
      // 351: athrow
      // 352: aload 7
      // 354: fconst_0
      // 355: invokevirtual EntityLivingBase.wej (F)Lfqr;
      // 358: astore 23
      // 35a: new fqr
      // 35d: dup
      // 35e: aload 23
      // 360: getfield fqr.lvi D
      // 363: dconst_0
      // 364: aload 23
      // 366: getfield fqr.bn2 D
      // 369: invokespecial fqr.<init> (DDD)V
      // 36c: astore 23
      // 36e: new fqr
      // 371: dup
      // 372: aload 20
      // 374: getfield fqr.lvi D
      // 377: aload 19
      // 379: getfield fqr.lvi D
      // 37c: dsub
      // 37d: dconst_0
      // 37e: aload 20
      // 380: getfield fqr.bn2 D
      // 383: aload 19
      // 385: getfield fqr.bn2 D
      // 388: dsub
      // 389: invokespecial fqr.<init> (DDD)V
      // 38c: invokevirtual fqr.kec ()Lfqr;
      // 38f: ldc 1.5707964
      // 391: nop
      // 392: invokevirtual fqr.av2 (F)Lfqr;
      // 395: astore 24
      // 397: aload 23
      // 399: aload 24
      // 39b: invokevirtual fqr.xvl (Lfqr;)D
      // 39e: dstore 25
      // 3a0: aload 0
      // 3a1: getfield nie.sfg Ltf8;
      // 3a4: dload 25
      // 3a6: invokestatic java/lang/Math.abs (D)D
      // 3a9: d2f
      // 3aa: invokestatic fe6.bug (F)F
      // 3ad: fconst_2
      // 3ae: fmul
      // 3af: dload 25
      // 3b1: invokestatic java/lang/Math.signum (D)D
      // 3b4: d2f
      // 3b5: fmul
      // 3b6: putfield tf8._ki F
      // 3b9: aload 0
      // 3ba: getfield nie.sfg Ltf8;
      // 3bd: bipush 1
      // 3be: putfield tf8.b16 Z
      // 3c1: aload 9
      // 3c3: fload 10
      // 3c5: invokevirtual c9p.si5 (F)F
      // 3c8: fstore 19
      // 3ca: aload 0
      // 3cb: getfield nie.vlm [Ltf8;
      // 3ce: bipush 0
      // 3cf: aaload
      // 3d0: fload 19
      // 3d2: invokestatic fe6.rtn (F)F
      // 3d5: ldc 3.1415927
      // 3d7: nop
      // 3d8: fmul
      // 3d9: ldc 0.05
      // 3db: nop
      // 3dc: fmul
      // 3dd: putfield tf8.r80 F
      // 3e0: aload 0
      // 3e1: getfield nie.vlm [Ltf8;
      // 3e4: bipush 1
      // 3e5: aaload
      // 3e6: fload 19
      // 3e8: invokestatic fe6.rtn (F)F
      // 3eb: ldc 3.1415927
      // 3ed: nop
      // 3ee: fmul
      // 3ef: ldc 0.1
      // 3f1: nop
      // 3f2: fmul
      // 3f3: putfield tf8.r80 F
      // 3f6: aload 0
      // 3f7: getfield nie.vlm [Ltf8;
      // 3fa: bipush 1
      // 3fb: aaload
      // 3fc: ldc -1.5
      // 3fe: nop
      // 3ff: putfield tf8._ki F
      // 402: aload 0
      // 403: getfield nie.vlm [Ltf8;
      // 406: bipush 1
      // 407: aaload
      // 408: ldc 0.5
      // 40a: nop
      // 40b: putfield tf8.ca7 F
      // 40e: aload 0
      // 40f: getfield nie.vlm [Ltf8;
      // 412: bipush 1
      // 413: aaload
      // 414: ldc 14.0
      // 416: nop
      // 417: putfield tf8.kit F
      // 41a: aload 0
      // 41b: getfield nie.vlm [Ltf8;
      // 41e: bipush 2
      // 41f: aaload
      // 420: fload 19
      // 422: invokestatic fe6.rtn (F)F
      // 425: ldc 3.1415927
      // 427: nop
      // 428: fmul
      // 429: ldc 0.15
      // 42b: nop
      // 42c: fmul
      // 42d: putfield tf8.r80 F
      // 430: aload 0
      // 431: getfield nie.vlm [Ltf8;
      // 434: bipush 2
      // 435: aaload
      // 436: ldc 0.5
      // 438: nop
      // 439: putfield tf8._ki F
      // 43c: aload 0
      // 43d: getfield nie.vlm [Ltf8;
      // 440: bipush 2
      // 441: aaload
      // 442: ldc 0.5
      // 444: nop
      // 445: putfield tf8.ca7 F
      // 448: aload 0
      // 449: getfield nie.vlm [Ltf8;
      // 44c: bipush 2
      // 44d: aaload
      // 44e: ldc 6.0
      // 450: nop
      // 451: putfield tf8.kit F
      // 454: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
