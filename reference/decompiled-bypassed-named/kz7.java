public class kz7 extends u14 {
   public tf8 dny;
   public tf8 hq8;
   public tf8 dp0;
   public tf8 rkn;

   public kz7() {
      this(0.0F);
   }

   public kz7(float var1) {
      super(var1, 64, 64);
      this.wtl = new tf8(this, 0, 0);
      this.wtl.q3x(-1.0F, -7.0F, -1.0F, 2, 7, 2, var1);
      this.wtl.i50(0.0F, 0.0F, 0.0F);
      this.s87 = new tf8(this, 0, 26);
      this.s87.q3x(-6.0F, 0.0F, -1.5F, 12, 3, 3, var1);
      this.s87.i50(0.0F, 0.0F, 0.0F);
      this.xwb = new tf8(this, 24, 0);
      this.xwb.q3x(-2.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.xwb.i50(-5.0F, 2.0F, 0.0F);
      this.hd2 = new tf8(this, 32, 16);
      this.hd2.hsi = true;
      this.hd2.q3x(0.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.hd2.i50(5.0F, 2.0F, 0.0F);
      this.v3l = new tf8(this, 8, 0);
      this.v3l.q3x(-1.0F, 0.0F, -1.0F, 2, 11, 2, var1);
      this.v3l.i50(-1.9F, 12.0F, 0.0F);
      this.zv5 = new tf8(this, 40, 16);
      this.zv5.hsi = true;
      this.zv5.q3x(-1.0F, 0.0F, -1.0F, 2, 11, 2, var1);
      this.zv5.i50(1.9F, 12.0F, 0.0F);
      this.dny = new tf8(this, 16, 0);
      this.dny.q3x(-3.0F, 3.0F, -1.0F, 2, 7, 2, var1);
      this.dny.i50(0.0F, 0.0F, 0.0F);
      this.dny.b16 = true;
      this.hq8 = new tf8(this, 48, 16);
      this.hq8.q3x(1.0F, 3.0F, -1.0F, 2, 7, 2, var1);
      this.hq8.i50(0.0F, 0.0F, 0.0F);
      this.dp0 = new tf8(this, 0, 48);
      this.dp0.q3x(-4.0F, 10.0F, -1.0F, 8, 2, 2, var1);
      this.dp0.i50(0.0F, 0.0F, 0.0F);
      this.rkn = new tf8(this, 0, 32);
      this.rkn.q3x(-6.0F, 11.0F, -6.0F, 12, 1, 12, var1);
      this.rkn.i50(0.0F, 12.0F, 0.0F);
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 8
      // 005: aload 0
      // 006: fload 1
      // 007: fload 2
      // 008: fload 3
      // 009: fload 4
      // 00b: fload 5
      // 00d: fload 6
      // 00f: aload 7
      // 011: invokespecial u14.ltd (FFFFFFLi2h;)V
      // 014: aload 7
      // 016: iload 8
      // 018: ifeq 031
      // 01b: instanceof h67
      // 01e: ifeq 195
      // 021: goto 028
      // 024: invokestatic kz7.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 7
      // 02a: goto 031
      // 02d: invokestatic kz7.a (Loov;)Loov;
      // 030: athrow
      // 031: checkcast h67
      // 034: astore 9
      // 036: aload 0
      // 037: getfield kz7.hd2 Ltf8;
      // 03a: aload 9
      // 03c: invokevirtual h67.sd0 ()Z
      // 03f: putfield tf8.b16 Z
      // 042: aload 0
      // 043: getfield kz7.xwb Ltf8;
      // 046: aload 9
      // 048: invokevirtual h67.sd0 ()Z
      // 04b: putfield tf8.b16 Z
      // 04e: aload 0
      // 04f: getfield kz7.rkn Ltf8;
      // 052: aload 9
      // 054: invokevirtual h67.wvw ()Z
      // 057: iload 8
      // 059: ifeq 067
      // 05c: ifne 06a
      // 05f: goto 066
      // 062: invokestatic kz7.a (Loov;)Loov;
      // 065: athrow
      // 066: bipush 1
      // 067: goto 06b
      // 06a: bipush 0
      // 06b: putfield tf8.b16 Z
      // 06e: aload 0
      // 06f: getfield kz7.zv5 Ltf8;
      // 072: ldc 1.9
      // 074: nop
      // 075: ldc 12.0
      // 077: nop
      // 078: fconst_0
      // 079: invokevirtual tf8.i50 (FFF)V
      // 07c: aload 0
      // 07d: getfield kz7.v3l Ltf8;
      // 080: ldc -1.9
      // 082: nop
      // 083: ldc 12.0
      // 085: nop
      // 086: fconst_0
      // 087: invokevirtual tf8.i50 (FFF)V
      // 08a: aload 0
      // 08b: getfield kz7.dny Ltf8;
      // 08e: ldc 0.017453292
      // 090: nop
      // 091: aload 9
      // 093: invokevirtual h67.pfz ()Lwis;
      // 096: invokevirtual wis.ins ()F
      // 099: fmul
      // 09a: putfield tf8.pod F
      // 09d: aload 0
      // 09e: getfield kz7.dny Ltf8;
      // 0a1: ldc 0.017453292
      // 0a3: nop
      // 0a4: aload 9
      // 0a6: invokevirtual h67.pfz ()Lwis;
      // 0a9: invokevirtual wis.t9l ()F
      // 0ac: fmul
      // 0ad: putfield tf8.r80 F
      // 0b0: aload 0
      // 0b1: getfield kz7.dny Ltf8;
      // 0b4: ldc 0.017453292
      // 0b6: nop
      // 0b7: aload 9
      // 0b9: invokevirtual h67.pfz ()Lwis;
      // 0bc: invokevirtual wis.pic ()F
      // 0bf: fmul
      // 0c0: putfield tf8.oo7 F
      // 0c3: aload 0
      // 0c4: getfield kz7.hq8 Ltf8;
      // 0c7: ldc 0.017453292
      // 0c9: nop
      // 0ca: aload 9
      // 0cc: invokevirtual h67.pfz ()Lwis;
      // 0cf: invokevirtual wis.ins ()F
      // 0d2: fmul
      // 0d3: putfield tf8.pod F
      // 0d6: aload 0
      // 0d7: getfield kz7.hq8 Ltf8;
      // 0da: ldc 0.017453292
      // 0dc: nop
      // 0dd: aload 9
      // 0df: invokevirtual h67.pfz ()Lwis;
      // 0e2: invokevirtual wis.t9l ()F
      // 0e5: fmul
      // 0e6: putfield tf8.r80 F
      // 0e9: aload 0
      // 0ea: getfield kz7.hq8 Ltf8;
      // 0ed: ldc 0.017453292
      // 0ef: nop
      // 0f0: aload 9
      // 0f2: invokevirtual h67.pfz ()Lwis;
      // 0f5: invokevirtual wis.pic ()F
      // 0f8: fmul
      // 0f9: putfield tf8.oo7 F
      // 0fc: aload 0
      // 0fd: getfield kz7.dp0 Ltf8;
      // 100: ldc 0.017453292
      // 102: nop
      // 103: aload 9
      // 105: invokevirtual h67.pfz ()Lwis;
      // 108: invokevirtual wis.ins ()F
      // 10b: fmul
      // 10c: putfield tf8.pod F
      // 10f: aload 0
      // 110: getfield kz7.dp0 Ltf8;
      // 113: ldc 0.017453292
      // 115: nop
      // 116: aload 9
      // 118: invokevirtual h67.pfz ()Lwis;
      // 11b: invokevirtual wis.t9l ()F
      // 11e: fmul
      // 11f: putfield tf8.r80 F
      // 122: aload 0
      // 123: getfield kz7.dp0 Ltf8;
      // 126: ldc 0.017453292
      // 128: nop
      // 129: aload 9
      // 12b: invokevirtual h67.pfz ()Lwis;
      // 12e: invokevirtual wis.pic ()F
      // 131: fmul
      // 132: putfield tf8.oo7 F
      // 135: aload 9
      // 137: invokevirtual h67.fby ()Lwis;
      // 13a: invokevirtual wis.ins ()F
      // 13d: aload 9
      // 13f: invokevirtual h67.wym ()Lwis;
      // 142: invokevirtual wis.ins ()F
      // 145: fadd
      // 146: fconst_2
      // 147: fdiv
      // 148: fstore 10
      // 14a: aload 9
      // 14c: invokevirtual h67.fby ()Lwis;
      // 14f: invokevirtual wis.t9l ()F
      // 152: aload 9
      // 154: invokevirtual h67.wym ()Lwis;
      // 157: invokevirtual wis.t9l ()F
      // 15a: fadd
      // 15b: fconst_2
      // 15c: fdiv
      // 15d: fstore 11
      // 15f: aload 9
      // 161: invokevirtual h67.fby ()Lwis;
      // 164: invokevirtual wis.pic ()F
      // 167: aload 9
      // 169: invokevirtual h67.wym ()Lwis;
      // 16c: invokevirtual wis.pic ()F
      // 16f: fadd
      // 170: fconst_2
      // 171: fdiv
      // 172: fstore 12
      // 174: aload 0
      // 175: getfield kz7.rkn Ltf8;
      // 178: fconst_0
      // 179: putfield tf8.pod F
      // 17c: aload 0
      // 17d: getfield kz7.rkn Ltf8;
      // 180: ldc 0.017453292
      // 182: nop
      // 183: aload 7
      // 185: getfield EntityLivingBase.x5k F
      // 188: fneg
      // 189: fmul
      // 18a: putfield tf8.r80 F
      // 18d: aload 0
      // 18e: getfield kz7.rkn Ltf8;
      // 191: fconst_0
      // 192: putfield tf8.oo7 F
      // 195: return
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
                  super.s_q(var1, var2, var3, var4, var5, var6, var7);
                  hzu.dp2();
                  var10000 = this._a0;
                  if (var8 == 0) {
                     break label55;
                  }

                  if (!this._a0) {
                     break label52;
                  }
               } catch (oov var13) {
                  throw a(var13);
               }

               float var9 = 2.0F;

               try {
                  hzu.syc(1.0F / var9, 1.0F / var9, 1.0F / var9);
                  hzu.a4k(0.0F, 24.0F * var7, 0.0F);
                  this.dny.vca(var7);
                  this.hq8.vca(var7);
                  this.dp0.vca(var7);
                  this.rkn.vca(var7);
                  if (var8 != 0) {
                     break label51;
                  }
               } catch (oov var12) {
                  boolean var10001 = false;
                  throw a(var12);
               }
            }

            try {
               var10000 = var1.hzv();
            } catch (oov var11) {
               boolean var15 = false;
               throw a(var11);
            }
         }

         try {
            if (var10000) {
               hzu.a4k(0.0F, 0.2F, 0.0F);
            }
         } catch (oov var10) {
            throw a(var10);
         }

         this.dny.vca(var7);
         this.hq8.vca(var7);
         this.dp0.vca(var7);
         this.rkn.vca(var7);
      }

      hzu.x3w();
   }

   @Override
   public void zn0(float var1) {
      boolean var2 = this.xwb.b16;
      this.xwb.b16 = true;
      super.zn0(var1);
      this.xwb.b16 = var2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
