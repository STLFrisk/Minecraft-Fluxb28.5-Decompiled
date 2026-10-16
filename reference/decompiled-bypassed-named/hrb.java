public class hrb extends gmu {
   public hrb(hr_ var1) {
      this(var1, false);
   }

   public hrb(hr_ var1, boolean var2) {
      super(var1, new et8(0.0F, var2), 0.5F);
      this.yj4 = var2;
      this.d4f(new v5l(this));
      this.d4f(new rr8(this));
      this.d4f(new c_0(this));
      this.d4f(new i9k(this));
      this.d4f(new k3h(this));
      this.d4f(new mlv(this.fy4().wtl));
   }

   public et8 fy4() {
      return (et8)super.fy4();
   }

   public void dik(x0l param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 10
      // 05: aload 1
      // 06: iload 10
      // 08: ifeq 26
      // 0b: invokevirtual x0l.jvr ()Z
      // 0e: ifeq 2a
      // 11: goto 18
      // 14: invokestatic hrb.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield hrb.l0g Lhr_;
      // 1c: getfield hr_.mok Li2h;
      // 1f: goto 26
      // 22: invokestatic hrb.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 1
      // 27: if_acmpne d6
      // 2a: dload 4
      // 2c: dstore 11
      // 2e: aload 1
      // 2f: invokevirtual x0l.hzv ()Z
      // 32: iload 10
      // 34: ifeq 7a
      // 37: ifeq 63
      // 3a: goto 41
      // 3d: invokestatic hrb.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 1
      // 42: instanceof EntityPlayerSP
      // 45: iload 10
      // 47: ifeq 7a
      // 4a: goto 51
      // 4d: invokestatic hrb.a (Loov;)Loov;
      // 50: athrow
      // 51: ifne 63
      // 54: goto 5b
      // 57: invokestatic hrb.a (Loov;)Loov;
      // 5a: athrow
      // 5b: dload 4
      // 5d: ldc2_w 0.125
      // 60: dsub
      // 61: dstore 11
      // 63: aload 0
      // 64: aload 1
      // 65: iload 10
      // 67: ifeq ca
      // 6a: invokespecial hrb.gh_ (Lx0l;)V
      // 6d: getstatic ModuleRegistry.irb Lf5k;
      // 70: invokevirtual Rotation.klu ()Z
      // 73: goto 7a
      // 76: invokestatic hrb.a (Loov;)Loov;
      // 79: athrow
      // 7a: ifeq c1
      // 7d: getstatic ModuleRegistry.irb Lf5k;
      // 80: pop
      // 81: getstatic Rotation.pje Lcn7;
      // 84: invokevirtual BooleanSetting.g7m ()Z
      // 87: iload 10
      // 89: ifeq b4
      // 8c: goto 93
      // 8f: invokestatic hrb.a (Loov;)Loov;
      // 92: athrow
      // 93: ifeq c1
      // 96: goto 9d
      // 99: invokestatic hrb.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 1
      // 9e: iload 10
      // a0: ifeq b8
      // a3: goto aa
      // a6: invokestatic hrb.a (Loov;)Loov;
      // a9: athrow
      // aa: instanceof ha9
      // ad: goto b4
      // b0: invokestatic hrb.a (Loov;)Loov;
      // b3: athrow
      // b4: ifeq c1
      // b7: aload 1
      // b8: invokestatic Minecraft.vz1 ()Lc05;
      // bb: getfield Minecraft.vg8 Ll86;
      // be: if_acmpne d6
      // c1: aload 0
      // c2: aload 1
      // c3: goto ca
      // c6: invokestatic hrb.a (Loov;)Loov;
      // c9: athrow
      // ca: dload 2
      // cb: dload 11
      // cd: dload 6
      // cf: fload 8
      // d1: fload 9
      // d3: invokespecial gmu.l1o (Lg_3;DDDFF)V
      // d6: return
   }

   private void gh_(x0l param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: invokevirtual hrb.fy4 ()Let8;
      // 008: astore 3
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 043
      // 00e: invokevirtual x0l.myu ()Z
      // 011: ifeq 03b
      // 014: goto 01b
      // 017: invokestatic hrb.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 3
      // 01c: bipush 0
      // 01d: invokevirtual et8.sy2 (Z)V
      // 020: aload 3
      // 021: getfield et8.wtl Ltf8;
      // 024: bipush 1
      // 025: putfield tf8.b16 Z
      // 028: aload 3
      // 029: getfield et8.lxi Ltf8;
      // 02c: bipush 1
      // 02d: putfield tf8.b16 Z
      // 030: iload 2
      // 031: ifeq 12e
      // 034: goto 03b
      // 037: invokestatic hrb.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 1
      // 03c: goto 043
      // 03f: invokestatic hrb.a (Loov;)Loov;
      // 042: athrow
      // 043: getfield x0l.up_ Ljnq;
      // 046: invokevirtual jnq.dxs ()Lerg;
      // 049: astore 4
      // 04b: aload 3
      // 04c: bipush 1
      // 04d: invokevirtual et8.sy2 (Z)V
      // 050: aload 3
      // 051: getfield et8.lxi Ltf8;
      // 054: aload 1
      // 055: getstatic ulc.gn8 Lulc;
      // 058: invokevirtual x0l.cuw (Lulc;)Z
      // 05b: putfield tf8.b16 Z
      // 05e: aload 3
      // 05f: getfield et8.g37 Ltf8;
      // 062: aload 1
      // 063: getstatic ulc.z3x Lulc;
      // 066: invokevirtual x0l.cuw (Lulc;)Z
      // 069: putfield tf8.b16 Z
      // 06c: aload 3
      // 06d: getfield et8.qne Ltf8;
      // 070: aload 1
      // 071: getstatic ulc.jku Lulc;
      // 074: invokevirtual x0l.cuw (Lulc;)Z
      // 077: putfield tf8.b16 Z
      // 07a: aload 3
      // 07b: getfield et8.w8n Ltf8;
      // 07e: aload 1
      // 07f: getstatic ulc.m4i Lulc;
      // 082: invokevirtual x0l.cuw (Lulc;)Z
      // 085: putfield tf8.b16 Z
      // 088: aload 3
      // 089: getfield et8.gl1 Ltf8;
      // 08c: aload 1
      // 08d: getstatic ulc.ss0 Lulc;
      // 090: invokevirtual x0l.cuw (Lulc;)Z
      // 093: putfield tf8.b16 Z
      // 096: aload 3
      // 097: getfield et8.b6i Ltf8;
      // 09a: aload 1
      // 09b: getstatic ulc.f7q Lulc;
      // 09e: invokevirtual x0l.cuw (Lulc;)Z
      // 0a1: putfield tf8.b16 Z
      // 0a4: aload 3
      // 0a5: bipush 0
      // 0a6: putfield et8.onUpdateEvent I
      // 0a9: aload 3
      // 0aa: bipush 0
      // 0ab: putfield et8.bxg Z
      // 0ae: aload 3
      // 0af: aload 1
      // 0b0: invokevirtual x0l.hzv ()Z
      // 0b3: putfield et8.aj6 Z
      // 0b6: iload 2
      // 0b7: ifne 0e2
      // 0ba: aload 4
      // 0bc: ifnonnull 0d6
      // 0bf: goto 0c6
      // 0c2: invokestatic hrb.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 3
      // 0c7: bipush 0
      // 0c8: putfield et8.l9h I
      // 0cb: iload 2
      // 0cc: ifeq 12e
      // 0cf: goto 0d6
      // 0d2: invokestatic hrb.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 3
      // 0d7: bipush 1
      // 0d8: putfield et8.l9h I
      // 0db: goto 0e2
      // 0de: invokestatic hrb.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: invokevirtual x0l.m9h ()I
      // 0e6: ifle 12e
      // 0e9: aload 4
      // 0eb: invokevirtual erg.pdv ()Lce2;
      // 0ee: astore 5
      // 0f0: aload 5
      // 0f2: getstatic ce2.b7w Lce2;
      // 0f5: iload 2
      // 0f6: ifne 11f
      // 0f9: if_acmpne 113
      // 0fc: goto 103
      // 0ff: invokestatic hrb.a (Loov;)Loov;
      // 102: athrow
      // 103: aload 3
      // 104: bipush 3
      // 105: putfield et8.l9h I
      // 108: iload 2
      // 109: ifeq 12e
      // 10c: goto 113
      // 10f: invokestatic hrb.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 5
      // 115: getstatic ce2.rie Lce2;
      // 118: goto 11f
      // 11b: invokestatic hrb.a (Loov;)Loov;
      // 11e: athrow
      // 11f: if_acmpne 12e
      // 122: aload 3
      // 123: bipush 1
      // 124: putfield et8.bxg Z
      // 127: goto 12e
      // 12a: invokestatic hrb.a (Loov;)Loov;
      // 12d: athrow
      // 12e: return
   }

   public gdz p79(x0l var1) {
      return var1.q06();
   }

   @Override
   public void odh() {
      hzu.a4k(0.0F, 0.1875F, 0.0F);
   }

   public void zk6(x0l var1, float var2) {
      float var3 = 0.9375F;
      hzu.syc(var3, var3, var3);
   }

   public void z0l(x0l var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      int var12 = OpaquePredicate.c();
      label23:
      if (var10 < 100.0) {
         uci var13 = var1.cjt();
         sa6 var14 = var13.d_n(2);

         try {
            if (var12 != 0) {
               return;
            }

            if (var14 == null) {
               break label23;
            }
         } catch (oov var16) {
            throw a(var16);
         }

         r11 var15 = var13.jte(var1.noc(), var14);
         this.dlr(var1, var15.fge() + " " + var14.rqc(), var2, var4, var6, 64);
         var4 += (double)((float)this.r3f().rr7 * 1.15F * var9);
      }

      super.pdy(var1, var2, var4, var6, var8, var9, var10);
   }

   public void oku(x0l var1) {
      float var2 = 1.0F;
      hzu.oxa(var2, var2, var2);
      et8 var3 = this.fy4();
      this.gh_(var1);
      var3._5e = 0.0F;
      var3.ete = var3.aj6 = false;
      var3.ltd(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
      var3.zz8();
   }

   public void yus(x0l var1) {
      float var2 = 1.0F;
      hzu.oxa(var2, var2, var2);
      et8 var3 = this.fy4();
      this.gh_(var1);
      var3.aj6 = false;
      var3._5e = 0.0F;
      var3.ltd(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
      var3.ofd();
   }

   public void kk7(x0l param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 8
      // 05: aload 1
      // 06: invokevirtual x0l.gzr ()Z
      // 09: iload 8
      // 0b: ifne 23
      // 0e: ifeq 4e
      // 11: goto 18
      // 14: invokestatic hrb.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual x0l.ofg ()Z
      // 1c: goto 23
      // 1f: invokestatic hrb.a (Loov;)Loov;
      // 22: athrow
      // 23: ifeq 4e
      // 26: aload 0
      // 27: aload 1
      // 28: dload 2
      // 29: aload 1
      // 2a: getfield x0l.ckf F
      // 2d: f2d
      // 2e: dadd
      // 2f: dload 4
      // 31: aload 1
      // 32: getfield x0l.erh F
      // 35: f2d
      // 36: dadd
      // 37: dload 6
      // 39: aload 1
      // 3a: getfield x0l.pek F
      // 3d: f2d
      // 3e: dadd
      // 3f: invokespecial gmu.y5w (Lg_3;DDD)V
      // 42: iload 8
      // 44: ifeq 5f
      // 47: goto 4e
      // 4a: invokestatic hrb.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 1
      // 50: dload 2
      // 51: dload 4
      // 53: dload 6
      // 55: invokespecial gmu.y5w (Lg_3;DDD)V
      // 58: goto 5f
      // 5b: invokestatic hrb.a (Loov;)Loov;
      // 5e: athrow
      // 5f: return
   }

   public void w8n(x0l param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: invokevirtual x0l.gzr ()Z
      // 09: iload 5
      // 0b: ifeq 2f
      // 0e: ifeq 55
      // 11: goto 18
      // 14: invokestatic hrb.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: iload 5
      // 1b: ifeq 33
      // 1e: goto 25
      // 21: invokestatic hrb.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual x0l.ofg ()Z
      // 28: goto 2f
      // 2b: invokestatic hrb.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 55
      // 32: aload 1
      // 33: invokevirtual x0l.h1i ()F
      // 36: fconst_0
      // 37: fconst_1
      // 38: fconst_0
      // 39: invokestatic hzu.a2h (FFFF)V
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokevirtual hrb.hz_ (Lg_3;)F
      // 41: fconst_0
      // 42: fconst_0
      // 43: fconst_1
      // 44: invokestatic hzu.a2h (FFFF)V
      // 47: ldc 270.0
      // 49: nop
      // 4a: fconst_0
      // 4b: fconst_1
      // 4c: fconst_0
      // 4d: invokestatic hzu.a2h (FFFF)V
      // 50: iload 5
      // 52: ifne 65
      // 55: aload 0
      // 56: aload 1
      // 57: fload 2
      // 58: fload 3
      // 59: fload 4
      // 5b: invokespecial gmu.ur9 (Lg_3;FFF)V
      // 5e: goto 65
      // 61: invokestatic hrb.a (Loov;)Loov;
      // 64: athrow
      // 65: return
   }

   @Override
   public void e2w(Entity var1, float var2) {
      this.zk6((x0l)var1, var2);
   }

   @Override
   public void ur9(Entity var1, float var2, float var3, float var4) {
      this.w8n((x0l)var1, var2, var3, var4);
   }

   @Override
   public void y5w(Entity var1, double var2, double var4, double var6) {
      this.kk7((x0l)var1, var2, var4, var6);
   }

   @Override
   public void l1o(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.dik((x0l)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public g6r fy4() {
      return this.fy4();
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.p79((x0l)var1);
   }

   @Override
   public void pdy(EntityLivingBase var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      this.z0l((x0l)var1, var2, var4, var6, var8, var9, var10);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.dik((x0l)var1, var2, var4, var6, var8, var9);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
