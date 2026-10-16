public class z14 extends g6r {
   public tf8 wtl;
   public tf8 lxi;
   public tf8 s87;
   public tf8 xwb;
   public tf8 hd2;
   public tf8 v3l;
   public tf8 zv5;
   public int onUpdateEvent;
   public int l9h;
   public boolean aj6;
   public boolean bxg;

   public z14() {
      this(0.0F);
   }

   public z14(float var1) {
      this(var1, 0.0F, 64, 32);
   }

   public z14(float var1, float var2, int var3, int var4) {
      this.dsx = var3;
      this.apc = var4;
      this.wtl = new tf8(this, 0, 0);
      this.wtl.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.wtl.i50(0.0F, 0.0F + var2, 0.0F);
      this.lxi = new tf8(this, 32, 0);
      this.lxi.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.lxi.i50(0.0F, 0.0F + var2, 0.0F);
      this.s87 = new tf8(this, 16, 16);
      this.s87.q3x(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.s87.i50(0.0F, 0.0F + var2, 0.0F);
      this.xwb = new tf8(this, 40, 16);
      this.xwb.q3x(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.xwb.i50(-5.0F, 2.0F + var2, 0.0F);
      this.hd2 = new tf8(this, 40, 16);
      this.hd2.hsi = true;
      this.hd2.q3x(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.hd2.i50(5.0F, 2.0F + var2, 0.0F);
      this.v3l = new tf8(this, 0, 16);
      this.v3l.q3x(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.v3l.i50(-1.9F, 12.0F + var2, 0.0F);
      this.zv5 = new tf8(this, 0, 16);
      this.zv5.hsi = true;
      this.zv5.q3x(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.zv5.i50(1.9F, 12.0F + var2, 0.0F);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = OpaquePredicate.b();

      label51: {
         boolean var10000;
         label55: {
            label52: {
               try {
                  this.ltd(var2, var3, var4, var5, var6, var7, var1);
                  hzu.dp2();
                  var10000 = this._a0;
                  if (var8 == 0) {
                     break label55;
                  }

                  if (!this._a0) {
                     break label52;
                  }
               } catch (oov var13) {
                  throw c(var13);
               }

               float var9 = 2.0F;

               try {
                  hzu.syc(1.5F / var9, 1.5F / var9, 1.5F / var9);
                  hzu.a4k(0.0F, 16.0F * var7, 0.0F);
                  this.wtl.vca(var7);
                  hzu.x3w();
                  hzu.dp2();
                  hzu.syc(1.0F / var9, 1.0F / var9, 1.0F / var9);
                  hzu.a4k(0.0F, 24.0F * var7, 0.0F);
                  this.s87.vca(var7);
                  this.xwb.vca(var7);
                  this.hd2.vca(var7);
                  this.v3l.vca(var7);
                  this.zv5.vca(var7);
                  this.lxi.vca(var7);
                  if (var8 != 0) {
                     break label51;
                  }
               } catch (oov var12) {
                  boolean var10001 = false;
                  throw c(var12);
               }
            }

            try {
               var10000 = var1.hzv();
            } catch (oov var11) {
               boolean var15 = false;
               throw c(var11);
            }
         }

         try {
            if (var10000) {
               hzu.a4k(0.0F, 0.2F, 0.0F);
            }
         } catch (oov var10) {
            throw c(var10);
         }

         this.wtl.vca(var7);
         this.s87.vca(var7);
         this.xwb.vca(var7);
         this.hd2.vca(var7);
         this.v3l.vca(var7);
         this.zv5.vca(var7);
         this.lxi.vca(var7);
      }

      hzu.x3w();
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
      // 000: aload 0
      // 001: getfield z14.wtl Ltf8;
      // 004: fload 4
      // 006: ldc 57.295776
      // 008: nop
      // 009: fdiv
      // 00a: putfield tf8.r80 F
      // 00d: aload 0
      // 00e: getfield z14.wtl Ltf8;
      // 011: fload 5
      // 013: ldc 57.295776
      // 015: nop
      // 016: fdiv
      // 017: putfield tf8.pod F
      // 01a: invokestatic OpaquePredicate.b ()I
      // 01d: aload 0
      // 01e: getfield z14.xwb Ltf8;
      // 021: fload 1
      // 022: ldc 0.6662
      // 024: nop
      // 025: fmul
      // 026: ldc 3.1415927
      // 028: nop
      // 029: fadd
      // 02a: invokestatic fe6.ssk (F)F
      // 02d: fconst_2
      // 02e: fmul
      // 02f: fload 2
      // 030: fmul
      // 031: ldc 0.5
      // 033: nop
      // 034: fmul
      // 035: putfield tf8.pod F
      // 038: istore 8
      // 03a: aload 0
      // 03b: getfield z14.hd2 Ltf8;
      // 03e: fload 1
      // 03f: ldc 0.6662
      // 041: nop
      // 042: fmul
      // 043: invokestatic fe6.ssk (F)F
      // 046: fconst_2
      // 047: fmul
      // 048: fload 2
      // 049: fmul
      // 04a: ldc 0.5
      // 04c: nop
      // 04d: fmul
      // 04e: putfield tf8.pod F
      // 051: aload 0
      // 052: getfield z14.xwb Ltf8;
      // 055: fconst_0
      // 056: putfield tf8.oo7 F
      // 059: aload 0
      // 05a: getfield z14.hd2 Ltf8;
      // 05d: fconst_0
      // 05e: putfield tf8.oo7 F
      // 061: aload 0
      // 062: getfield z14.v3l Ltf8;
      // 065: fload 1
      // 066: ldc 0.6662
      // 068: nop
      // 069: fmul
      // 06a: invokestatic fe6.ssk (F)F
      // 06d: ldc 1.4
      // 06f: nop
      // 070: fmul
      // 071: fload 2
      // 072: fmul
      // 073: putfield tf8.pod F
      // 076: aload 0
      // 077: getfield z14.zv5 Ltf8;
      // 07a: fload 1
      // 07b: ldc 0.6662
      // 07d: nop
      // 07e: fmul
      // 07f: ldc 3.1415927
      // 081: nop
      // 082: fadd
      // 083: invokestatic fe6.ssk (F)F
      // 086: ldc 1.4
      // 088: nop
      // 089: fmul
      // 08a: fload 2
      // 08b: fmul
      // 08c: putfield tf8.pod F
      // 08f: aload 0
      // 090: getfield z14.v3l Ltf8;
      // 093: fconst_0
      // 094: putfield tf8.r80 F
      // 097: aload 0
      // 098: getfield z14.zv5 Ltf8;
      // 09b: fconst_0
      // 09c: putfield tf8.r80 F
      // 09f: aload 0
      // 0a0: getfield z14.ete Z
      // 0a3: iload 8
      // 0a5: ifeq 10f
      // 0a8: ifeq 0ff
      // 0ab: goto 0b2
      // 0ae: invokestatic z14.c (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield z14.xwb Ltf8;
      // 0b6: dup
      // 0b7: getfield tf8.pod F
      // 0ba: ldc -0.62831855
      // 0bc: nop
      // 0bd: fadd
      // 0be: putfield tf8.pod F
      // 0c1: aload 0
      // 0c2: getfield z14.hd2 Ltf8;
      // 0c5: dup
      // 0c6: getfield tf8.pod F
      // 0c9: ldc -0.62831855
      // 0cb: nop
      // 0cc: fadd
      // 0cd: putfield tf8.pod F
      // 0d0: aload 0
      // 0d1: getfield z14.v3l Ltf8;
      // 0d4: ldc -1.2566371
      // 0d6: nop
      // 0d7: putfield tf8.pod F
      // 0da: aload 0
      // 0db: getfield z14.zv5 Ltf8;
      // 0de: ldc -1.2566371
      // 0e0: nop
      // 0e1: putfield tf8.pod F
      // 0e4: aload 0
      // 0e5: getfield z14.v3l Ltf8;
      // 0e8: ldc 0.31415927
      // 0ea: nop
      // 0eb: putfield tf8.r80 F
      // 0ee: aload 0
      // 0ef: getfield z14.zv5 Ltf8;
      // 0f2: ldc -0.31415927
      // 0f4: nop
      // 0f5: putfield tf8.r80 F
      // 0f8: goto 0ff
      // 0fb: invokestatic z14.c (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: iload 8
      // 102: ifeq 13e
      // 105: getfield z14.onUpdateEvent I
      // 108: goto 10f
      // 10b: invokestatic z14.c (Loov;)Loov;
      // 10e: athrow
      // 10f: ifeq 135
      // 112: aload 0
      // 113: getfield z14.hd2 Ltf8;
      // 116: aload 0
      // 117: getfield z14.hd2 Ltf8;
      // 11a: getfield tf8.pod F
      // 11d: ldc 0.5
      // 11f: nop
      // 120: fmul
      // 121: ldc 0.31415927
      // 123: nop
      // 124: aload 0
      // 125: getfield z14.onUpdateEvent I
      // 128: i2f
      // 129: fmul
      // 12a: fsub
      // 12b: putfield tf8.pod F
      // 12e: goto 135
      // 131: invokestatic z14.c (Loov;)Loov;
      // 134: athrow
      // 135: aload 0
      // 136: getfield z14.xwb Ltf8;
      // 139: fconst_0
      // 13a: putfield tf8.r80 F
      // 13d: aload 0
      // 13e: iload 8
      // 140: ifeq 1fd
      // 143: getfield z14.xwb Ltf8;
      // 146: fconst_0
      // 147: putfield tf8.oo7 F
      // 14a: aload 7
      // 14c: invokestatic Minecraft.vz1 ()Lc05;
      // 14f: getfield Minecraft.vg8 Ll86;
      // 152: if_acmpne 1fc
      // 155: goto 15c
      // 158: invokestatic z14.c (Loov;)Loov;
      // 15b: athrow
      // 15c: getstatic ClientState.rut Lcn7;
      // 15f: invokevirtual BooleanSetting.g7m ()Z
      // 162: iload 8
      // 164: ifeq 19d
      // 167: goto 16e
      // 16a: invokestatic z14.c (Loov;)Loov;
      // 16d: athrow
      // 16e: ifeq 19a
      // 171: goto 178
      // 174: invokestatic z14.c (Loov;)Loov;
      // 177: athrow
      // 178: invokestatic Minecraft.vz1 ()Lc05;
      // 17b: getfield Minecraft.oxn Lmoh;
      // 17e: getfield moh.oxt Lm7l;
      // 181: getfield m7l.m7n Z
      // 184: iload 8
      // 186: ifeq 19d
      // 189: goto 190
      // 18c: invokestatic z14.c (Loov;)Loov;
      // 18f: athrow
      // 190: ifne 1f0
      // 193: goto 19a
      // 196: invokestatic z14.c (Loov;)Loov;
      // 199: athrow
      // 19a: invokestatic KillAura.szx ()Z
      // 19d: iload 8
      // 19f: ifeq 20c
      // 1a2: ifeq 1fc
      // 1a5: goto 1ac
      // 1a8: invokestatic z14.c (Loov;)Loov;
      // 1ab: athrow
      // 1ac: invokestatic Minecraft.vz1 ()Lc05;
      // 1af: getfield Minecraft.vg8 Ll86;
      // 1b2: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 1b5: iload 8
      // 1b7: ifeq 1db
      // 1ba: goto 1c1
      // 1bd: invokestatic z14.c (Loov;)Loov;
      // 1c0: athrow
      // 1c1: ifnull 1fc
      // 1c4: goto 1cb
      // 1c7: invokestatic z14.c (Loov;)Loov;
      // 1ca: athrow
      // 1cb: invokestatic Minecraft.vz1 ()Lc05;
      // 1ce: getfield Minecraft.vg8 Ll86;
      // 1d1: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 1d4: goto 1db
      // 1d7: invokestatic z14.c (Loov;)Loov;
      // 1da: athrow
      // 1db: invokevirtual erg.gn1 ()Lu7m;
      // 1de: instanceof za6
      // 1e1: iload 8
      // 1e3: ifeq 20c
      // 1e6: ifeq 1fc
      // 1e9: goto 1f0
      // 1ec: invokestatic z14.c (Loov;)Loov;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: bipush 3
      // 1f2: putfield z14.l9h I
      // 1f5: goto 1fc
      // 1f8: invokestatic z14.c (Loov;)Loov;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: iload 8
      // 1ff: ifeq 284
      // 202: getfield z14.l9h I
      // 205: goto 20c
      // 208: invokestatic z14.c (Loov;)Loov;
      // 20b: athrow
      // 20c: tableswitch 32 0 3 32 44 32 84
      // 22c: iload 8
      // 22e: ifne 28d
      // 231: goto 238
      // 234: invokestatic z14.c (Loov;)Loov;
      // 237: athrow
      // 238: aload 0
      // 239: getfield z14.xwb Ltf8;
      // 23c: aload 0
      // 23d: getfield z14.xwb Ltf8;
      // 240: getfield tf8.pod F
      // 243: ldc 0.5
      // 245: nop
      // 246: fmul
      // 247: ldc 0.31415927
      // 249: nop
      // 24a: aload 0
      // 24b: getfield z14.l9h I
      // 24e: i2f
      // 24f: fmul
      // 250: fsub
      // 251: putfield tf8.pod F
      // 254: iload 8
      // 256: ifne 28d
      // 259: goto 260
      // 25c: invokestatic z14.c (Loov;)Loov;
      // 25f: athrow
      // 260: aload 0
      // 261: getfield z14.xwb Ltf8;
      // 264: aload 0
      // 265: getfield z14.xwb Ltf8;
      // 268: getfield tf8.pod F
      // 26b: ldc 0.5
      // 26d: nop
      // 26e: fmul
      // 26f: ldc 0.31415927
      // 271: nop
      // 272: aload 0
      // 273: getfield z14.l9h I
      // 276: i2f
      // 277: fmul
      // 278: fsub
      // 279: putfield tf8.pod F
      // 27c: aload 0
      // 27d: goto 284
      // 280: invokestatic z14.c (Loov;)Loov;
      // 283: athrow
      // 284: getfield z14.xwb Ltf8;
      // 287: ldc -0.5235988
      // 289: nop
      // 28a: putfield tf8.r80 F
      // 28d: aload 0
      // 28e: getfield z14.hd2 Ltf8;
      // 291: fconst_0
      // 292: putfield tf8.r80 F
      // 295: aload 0
      // 296: getfield z14._5e F
      // 299: ldc -9990.0
      // 29b: nop
      // 29c: fcmpl
      // 29d: iload 8
      // 29f: ifeq 3fb
      // 2a2: ifle 3eb
      // 2a5: goto 2ac
      // 2a8: invokestatic z14.c (Loov;)Loov;
      // 2ab: athrow
      // 2ac: aload 0
      // 2ad: getfield z14._5e F
      // 2b0: fstore 9
      // 2b2: aload 0
      // 2b3: getfield z14.s87 Ltf8;
      // 2b6: fload 9
      // 2b8: invokestatic fe6.bug (F)F
      // 2bb: ldc 3.1415927
      // 2bd: nop
      // 2be: fmul
      // 2bf: fconst_2
      // 2c0: fmul
      // 2c1: invokestatic fe6.rtn (F)F
      // 2c4: ldc 0.2
      // 2c6: nop
      // 2c7: fmul
      // 2c8: putfield tf8.r80 F
      // 2cb: aload 0
      // 2cc: getfield z14.xwb Ltf8;
      // 2cf: aload 0
      // 2d0: getfield z14.s87 Ltf8;
      // 2d3: getfield tf8.r80 F
      // 2d6: invokestatic fe6.rtn (F)F
      // 2d9: ldc 5.0
      // 2db: nop
      // 2dc: fmul
      // 2dd: putfield tf8.kit F
      // 2e0: aload 0
      // 2e1: getfield z14.xwb Ltf8;
      // 2e4: aload 0
      // 2e5: getfield z14.s87 Ltf8;
      // 2e8: getfield tf8.r80 F
      // 2eb: invokestatic fe6.ssk (F)F
      // 2ee: fneg
      // 2ef: ldc 5.0
      // 2f1: nop
      // 2f2: fmul
      // 2f3: putfield tf8._ki F
      // 2f6: aload 0
      // 2f7: getfield z14.hd2 Ltf8;
      // 2fa: aload 0
      // 2fb: getfield z14.s87 Ltf8;
      // 2fe: getfield tf8.r80 F
      // 301: invokestatic fe6.rtn (F)F
      // 304: fneg
      // 305: ldc 5.0
      // 307: nop
      // 308: fmul
      // 309: putfield tf8.kit F
      // 30c: aload 0
      // 30d: getfield z14.hd2 Ltf8;
      // 310: aload 0
      // 311: getfield z14.s87 Ltf8;
      // 314: getfield tf8.r80 F
      // 317: invokestatic fe6.ssk (F)F
      // 31a: ldc 5.0
      // 31c: nop
      // 31d: fmul
      // 31e: putfield tf8._ki F
      // 321: aload 0
      // 322: getfield z14.xwb Ltf8;
      // 325: dup
      // 326: getfield tf8.r80 F
      // 329: aload 0
      // 32a: getfield z14.s87 Ltf8;
      // 32d: getfield tf8.r80 F
      // 330: fadd
      // 331: putfield tf8.r80 F
      // 334: aload 0
      // 335: getfield z14.hd2 Ltf8;
      // 338: dup
      // 339: getfield tf8.r80 F
      // 33c: aload 0
      // 33d: getfield z14.s87 Ltf8;
      // 340: getfield tf8.r80 F
      // 343: fadd
      // 344: putfield tf8.r80 F
      // 347: aload 0
      // 348: getfield z14.hd2 Ltf8;
      // 34b: dup
      // 34c: getfield tf8.pod F
      // 34f: aload 0
      // 350: getfield z14.s87 Ltf8;
      // 353: getfield tf8.r80 F
      // 356: fadd
      // 357: putfield tf8.pod F
      // 35a: fconst_1
      // 35b: aload 0
      // 35c: getfield z14._5e F
      // 35f: fsub
      // 360: fstore 9
      // 362: fload 9
      // 364: fload 9
      // 366: fmul
      // 367: fstore 9
      // 369: fload 9
      // 36b: fload 9
      // 36d: fmul
      // 36e: fstore 9
      // 370: fconst_1
      // 371: fload 9
      // 373: fsub
      // 374: fstore 9
      // 376: fload 9
      // 378: ldc 3.1415927
      // 37a: nop
      // 37b: fmul
      // 37c: invokestatic fe6.rtn (F)F
      // 37f: fstore 10
      // 381: aload 0
      // 382: getfield z14._5e F
      // 385: ldc 3.1415927
      // 387: nop
      // 388: fmul
      // 389: invokestatic fe6.rtn (F)F
      // 38c: aload 0
      // 38d: getfield z14.wtl Ltf8;
      // 390: getfield tf8.pod F
      // 393: ldc 0.7
      // 395: nop
      // 396: fsub
      // 397: fneg
      // 398: fmul
      // 399: ldc 0.75
      // 39b: nop
      // 39c: fmul
      // 39d: fstore 11
      // 39f: aload 0
      // 3a0: getfield z14.xwb Ltf8;
      // 3a3: aload 0
      // 3a4: getfield z14.xwb Ltf8;
      // 3a7: getfield tf8.pod F
      // 3aa: f2d
      // 3ab: fload 10
      // 3ad: f2d
      // 3ae: ldc2_w 1.2
      // 3b1: dmul
      // 3b2: fload 11
      // 3b4: f2d
      // 3b5: dadd
      // 3b6: dsub
      // 3b7: d2f
      // 3b8: putfield tf8.pod F
      // 3bb: aload 0
      // 3bc: getfield z14.xwb Ltf8;
      // 3bf: dup
      // 3c0: getfield tf8.r80 F
      // 3c3: aload 0
      // 3c4: getfield z14.s87 Ltf8;
      // 3c7: getfield tf8.r80 F
      // 3ca: fconst_2
      // 3cb: fmul
      // 3cc: fadd
      // 3cd: putfield tf8.r80 F
      // 3d0: aload 0
      // 3d1: getfield z14.xwb Ltf8;
      // 3d4: dup
      // 3d5: getfield tf8.oo7 F
      // 3d8: aload 0
      // 3d9: getfield z14._5e F
      // 3dc: ldc 3.1415927
      // 3de: nop
      // 3df: fmul
      // 3e0: invokestatic fe6.rtn (F)F
      // 3e3: ldc -0.4
      // 3e5: nop
      // 3e6: fmul
      // 3e7: fadd
      // 3e8: putfield tf8.oo7 F
      // 3eb: aload 0
      // 3ec: iload 8
      // 3ee: ifeq 49a
      // 3f1: getfield z14.aj6 Z
      // 3f4: goto 3fb
      // 3f7: invokestatic z14.c (Loov;)Loov;
      // 3fa: athrow
      // 3fb: ifeq 462
      // 3fe: aload 0
      // 3ff: getfield z14.s87 Ltf8;
      // 402: ldc 0.5
      // 404: nop
      // 405: putfield tf8.pod F
      // 408: aload 0
      // 409: getfield z14.xwb Ltf8;
      // 40c: dup
      // 40d: getfield tf8.pod F
      // 410: ldc 0.4
      // 412: nop
      // 413: fadd
      // 414: putfield tf8.pod F
      // 417: aload 0
      // 418: getfield z14.hd2 Ltf8;
      // 41b: dup
      // 41c: getfield tf8.pod F
      // 41f: ldc 0.4
      // 421: nop
      // 422: fadd
      // 423: putfield tf8.pod F
      // 426: aload 0
      // 427: getfield z14.v3l Ltf8;
      // 42a: ldc 4.0
      // 42c: nop
      // 42d: putfield tf8.kit F
      // 430: aload 0
      // 431: getfield z14.zv5 Ltf8;
      // 434: ldc 4.0
      // 436: nop
      // 437: putfield tf8.kit F
      // 43a: aload 0
      // 43b: getfield z14.v3l Ltf8;
      // 43e: ldc 9.0
      // 440: nop
      // 441: putfield tf8.ca7 F
      // 444: aload 0
      // 445: getfield z14.zv5 Ltf8;
      // 448: ldc 9.0
      // 44a: nop
      // 44b: putfield tf8.ca7 F
      // 44e: aload 0
      // 44f: getfield z14.wtl Ltf8;
      // 452: fconst_1
      // 453: putfield tf8.ca7 F
      // 456: iload 8
      // 458: ifne 4a1
      // 45b: goto 462
      // 45e: invokestatic z14.c (Loov;)Loov;
      // 461: athrow
      // 462: aload 0
      // 463: getfield z14.s87 Ltf8;
      // 466: fconst_0
      // 467: putfield tf8.pod F
      // 46a: aload 0
      // 46b: getfield z14.v3l Ltf8;
      // 46e: ldc 0.1
      // 470: nop
      // 471: putfield tf8.kit F
      // 474: aload 0
      // 475: getfield z14.zv5 Ltf8;
      // 478: ldc 0.1
      // 47a: nop
      // 47b: putfield tf8.kit F
      // 47e: aload 0
      // 47f: getfield z14.v3l Ltf8;
      // 482: ldc 12.0
      // 484: nop
      // 485: putfield tf8.ca7 F
      // 488: aload 0
      // 489: getfield z14.zv5 Ltf8;
      // 48c: ldc 12.0
      // 48e: nop
      // 48f: putfield tf8.ca7 F
      // 492: aload 0
      // 493: goto 49a
      // 496: invokestatic z14.c (Loov;)Loov;
      // 499: athrow
      // 49a: getfield z14.wtl Ltf8;
      // 49d: fconst_0
      // 49e: putfield tf8.ca7 F
      // 4a1: aload 0
      // 4a2: getfield z14.xwb Ltf8;
      // 4a5: dup
      // 4a6: getfield tf8.oo7 F
      // 4a9: fload 3
      // 4aa: ldc 0.09
      // 4ac: nop
      // 4ad: fmul
      // 4ae: invokestatic fe6.ssk (F)F
      // 4b1: ldc 0.05
      // 4b3: nop
      // 4b4: fmul
      // 4b5: ldc 0.05
      // 4b7: nop
      // 4b8: fadd
      // 4b9: fadd
      // 4ba: putfield tf8.oo7 F
      // 4bd: aload 0
      // 4be: getfield z14.hd2 Ltf8;
      // 4c1: dup
      // 4c2: getfield tf8.oo7 F
      // 4c5: fload 3
      // 4c6: ldc 0.09
      // 4c8: nop
      // 4c9: fmul
      // 4ca: invokestatic fe6.ssk (F)F
      // 4cd: ldc 0.05
      // 4cf: nop
      // 4d0: fmul
      // 4d1: ldc 0.05
      // 4d3: nop
      // 4d4: fadd
      // 4d5: fsub
      // 4d6: putfield tf8.oo7 F
      // 4d9: aload 0
      // 4da: getfield z14.xwb Ltf8;
      // 4dd: dup
      // 4de: getfield tf8.pod F
      // 4e1: fload 3
      // 4e2: ldc 0.067
      // 4e4: nop
      // 4e5: fmul
      // 4e6: invokestatic fe6.rtn (F)F
      // 4e9: ldc 0.05
      // 4eb: nop
      // 4ec: fmul
      // 4ed: fadd
      // 4ee: putfield tf8.pod F
      // 4f1: aload 0
      // 4f2: getfield z14.hd2 Ltf8;
      // 4f5: dup
      // 4f6: getfield tf8.pod F
      // 4f9: fload 3
      // 4fa: ldc 0.067
      // 4fc: nop
      // 4fd: fmul
      // 4fe: invokestatic fe6.rtn (F)F
      // 501: ldc 0.05
      // 503: nop
      // 504: fmul
      // 505: fsub
      // 506: putfield tf8.pod F
      // 509: aload 0
      // 50a: iload 8
      // 50c: ifeq 628
      // 50f: getfield z14.bxg Z
      // 512: ifeq 627
      // 515: goto 51c
      // 518: invokestatic z14.c (Loov;)Loov;
      // 51b: athrow
      // 51c: fconst_0
      // 51d: fstore 9
      // 51f: fconst_0
      // 520: fstore 10
      // 522: aload 0
      // 523: getfield z14.xwb Ltf8;
      // 526: fconst_0
      // 527: putfield tf8.oo7 F
      // 52a: aload 0
      // 52b: getfield z14.hd2 Ltf8;
      // 52e: fconst_0
      // 52f: putfield tf8.oo7 F
      // 532: aload 0
      // 533: getfield z14.xwb Ltf8;
      // 536: ldc 0.1
      // 538: nop
      // 539: fload 9
      // 53b: ldc 0.6
      // 53d: nop
      // 53e: fmul
      // 53f: fsub
      // 540: fneg
      // 541: aload 0
      // 542: getfield z14.wtl Ltf8;
      // 545: getfield tf8.r80 F
      // 548: fadd
      // 549: putfield tf8.r80 F
      // 54c: aload 0
      // 54d: getfield z14.hd2 Ltf8;
      // 550: ldc 0.1
      // 552: nop
      // 553: fload 9
      // 555: ldc 0.6
      // 557: nop
      // 558: fmul
      // 559: fsub
      // 55a: aload 0
      // 55b: getfield z14.wtl Ltf8;
      // 55e: getfield tf8.r80 F
      // 561: fadd
      // 562: ldc 0.4
      // 564: nop
      // 565: fadd
      // 566: putfield tf8.r80 F
      // 569: aload 0
      // 56a: getfield z14.xwb Ltf8;
      // 56d: ldc -1.5707964
      // 56f: nop
      // 570: aload 0
      // 571: getfield z14.wtl Ltf8;
      // 574: getfield tf8.pod F
      // 577: fadd
      // 578: putfield tf8.pod F
      // 57b: aload 0
      // 57c: getfield z14.hd2 Ltf8;
      // 57f: ldc -1.5707964
      // 581: nop
      // 582: aload 0
      // 583: getfield z14.wtl Ltf8;
      // 586: getfield tf8.pod F
      // 589: fadd
      // 58a: putfield tf8.pod F
      // 58d: aload 0
      // 58e: getfield z14.xwb Ltf8;
      // 591: dup
      // 592: getfield tf8.pod F
      // 595: fload 9
      // 597: ldc 1.2
      // 599: nop
      // 59a: fmul
      // 59b: fload 10
      // 59d: ldc 0.4
      // 59f: nop
      // 5a0: fmul
      // 5a1: fsub
      // 5a2: fsub
      // 5a3: putfield tf8.pod F
      // 5a6: aload 0
      // 5a7: getfield z14.hd2 Ltf8;
      // 5aa: dup
      // 5ab: getfield tf8.pod F
      // 5ae: fload 9
      // 5b0: ldc 1.2
      // 5b2: nop
      // 5b3: fmul
      // 5b4: fload 10
      // 5b6: ldc 0.4
      // 5b8: nop
      // 5b9: fmul
      // 5ba: fsub
      // 5bb: fsub
      // 5bc: putfield tf8.pod F
      // 5bf: aload 0
      // 5c0: getfield z14.xwb Ltf8;
      // 5c3: dup
      // 5c4: getfield tf8.oo7 F
      // 5c7: fload 3
      // 5c8: ldc 0.09
      // 5ca: nop
      // 5cb: fmul
      // 5cc: invokestatic fe6.ssk (F)F
      // 5cf: ldc 0.05
      // 5d1: nop
      // 5d2: fmul
      // 5d3: ldc 0.05
      // 5d5: nop
      // 5d6: fadd
      // 5d7: fadd
      // 5d8: putfield tf8.oo7 F
      // 5db: aload 0
      // 5dc: getfield z14.hd2 Ltf8;
      // 5df: dup
      // 5e0: getfield tf8.oo7 F
      // 5e3: fload 3
      // 5e4: ldc 0.09
      // 5e6: nop
      // 5e7: fmul
      // 5e8: invokestatic fe6.ssk (F)F
      // 5eb: ldc 0.05
      // 5ed: nop
      // 5ee: fmul
      // 5ef: ldc 0.05
      // 5f1: nop
      // 5f2: fadd
      // 5f3: fsub
      // 5f4: putfield tf8.oo7 F
      // 5f7: aload 0
      // 5f8: getfield z14.xwb Ltf8;
      // 5fb: dup
      // 5fc: getfield tf8.pod F
      // 5ff: fload 3
      // 600: ldc 0.067
      // 602: nop
      // 603: fmul
      // 604: invokestatic fe6.rtn (F)F
      // 607: ldc 0.05
      // 609: nop
      // 60a: fmul
      // 60b: fadd
      // 60c: putfield tf8.pod F
      // 60f: aload 0
      // 610: getfield z14.hd2 Ltf8;
      // 613: dup
      // 614: getfield tf8.pod F
      // 617: fload 3
      // 618: ldc 0.067
      // 61a: nop
      // 61b: fmul
      // 61c: invokestatic fe6.rtn (F)F
      // 61f: ldc 0.05
      // 621: nop
      // 622: fmul
      // 623: fsub
      // 624: putfield tf8.pod F
      // 627: aload 0
      // 628: getfield z14.wtl Ltf8;
      // 62b: aload 0
      // 62c: getfield z14.lxi Ltf8;
      // 62f: invokestatic z14.ibo (Ltf8;Ltf8;)V
      // 632: return
   }

   @Override
   public void jxr(g6r param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial g6r.jxr (Lg6r;)V
      // 09: aload 1
      // 0a: iload 2
      // 0b: ifne 23
      // 0e: instanceof z14
      // 11: ifeq 47
      // 14: goto 1b
      // 17: invokestatic z14.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: goto 23
      // 1f: invokestatic z14.c (Loov;)Loov;
      // 22: athrow
      // 23: checkcast z14
      // 26: astore 3
      // 27: aload 0
      // 28: aload 3
      // 29: getfield z14.onUpdateEvent I
      // 2c: putfield z14.onUpdateEvent I
      // 2f: aload 0
      // 30: aload 3
      // 31: getfield z14.l9h I
      // 34: putfield z14.l9h I
      // 37: aload 0
      // 38: aload 3
      // 39: getfield z14.aj6 Z
      // 3c: putfield z14.aj6 Z
      // 3f: aload 0
      // 40: aload 3
      // 41: getfield z14.bxg Z
      // 44: putfield z14.bxg Z
      // 47: return
   }

   public void sy2(boolean var1) {
      this.wtl.b16 = var1;
      this.lxi.b16 = var1;
      this.s87.b16 = var1;
      this.xwb.b16 = var1;
      this.hd2.b16 = var1;
      this.v3l.b16 = var1;
      this.zv5.b16 = var1;
   }

   public void zn0(float var1) {
      this.xwb.f2u(var1);
   }

   private static oov c(oov var0) {
      return var0;
   }
}
