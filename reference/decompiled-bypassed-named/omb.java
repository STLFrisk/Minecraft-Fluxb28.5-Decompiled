public class omb {
   public static yfc to7 = new yfc(0.0F, 0.0F);

   public static double[] otp(EntityLivingBase var0) {
      double var1 = (double)Minecraft.vz1().gze.au3;
      return new double[]{var0.ivp + (var0.o2v - var0.ivp) * var1, var0.c54 + (var0.kfp - var0.c54) * var1, var0.e2b + (var0.vbd - var0.e2b) * var1};
   }

   public static float pnh(float var0, float var1, float var2) {
      float var3 = 0.006F;
      float var4 = var2 * var2 * var2 * var2 - var3 * (var3 * var0 * var0 + 2.0F * var1 * var2 * var2);
      return (float)Math.toDegrees(Math.atan(((double)(var2 * var2) - Math.sqrt((double)var4)) / (double)(var3 * var0)));
   }

   public static float[] xx4(zxu var0, zxu var1) {
      double var2 = var1.kvw - var0.kvw;
      double var4 = var1.cdu - var0.cdu;
      double var6 = var1.lji - var0.lji;
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      float var10 = (float)Math.toDegrees(Math.atan2(var6, var2)) - 90.0F;
      float var11 = (float)(-Math.toDegrees(Math.atan2(var4, var8)));
      return new float[]{fe6.qsy(var10), fe6.qsy(var11)};
   }

   public static zxu tep() {
      return new zxu(Minecraft.vz1().vg8.o2v, Minecraft.vz1().vg8.kfp + (double)Minecraft.vz1().vg8.c5y(), Minecraft.vz1().vg8.vbd);
   }

   public static float[] o_k(zxu var0) {
      zxu var1 = tep();
      double var2 = var0.kvw - var1.kvw;
      double var4 = var0.cdu - var1.cdu;
      double var6 = var0.lji - var1.lji;
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      float var10 = (float)Math.toDegrees(Math.atan2(var6, var2)) - 90.0F;
      float var11 = (float)(-Math.toDegrees(Math.atan2(var4, var8)));
      return new float[]{fe6.qsy(var10), fe6.qsy(var11)};
   }

   public static float[] ge3(double var0, double var2, double var4) {
      EntityPlayerSP var6 = Minecraft.vz1().vg8;
      double var7 = var0 - var6.o2v;
      double var9 = var2 - (var6.kfp + (double)var6.c5y());
      double var11 = var4 - var6.vbd;
      double var13 = (double)fe6.dii(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{var15, var16};
   }

   public static float[] rgm(Entity var0) {
      try {
         if (q0r.f2f()) {
            return ge3(var0.o2v + KillAura.mmr(0.03, -0.03), var0.kfp + (double)var0.c5y() - 0.4 + KillAura.mmr(0.07, -0.07), var0.vbd + KillAura.mmr(0.03, -0.03));
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return ge3(var0.o2v, var0.kfp + (double)var0.c5y() - 0.4, var0.vbd);
   }

   public static boolean jok(EntityLivingBase param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokestatic omb.ndg (Li2h;)[F
      // 08: bipush 0
      // 09: faload
      // 0a: invokestatic Minecraft.vz1 ()Lc05;
      // 0d: getfield Minecraft.vg8 Ll86;
      // 10: getfield EntityPlayerSP.x5k F
      // 13: fsub
      // 14: invokestatic java/lang/Math.abs (F)F
      // 17: ldc 360.0
      // 19: nop
      // 1a: frem
      // 1b: ldc 180.0
      // 1d: nop
      // 1e: iload 2
      // 1f: ifeq 65
      // 22: fcmpl
      // 23: ifle 4f
      // 26: goto 2d
      // 29: invokestatic omb.a (Loov;)Loov;
      // 2c: athrow
      // 2d: ldc 360.0
      // 2f: nop
      // 30: aload 0
      // 31: invokestatic omb.ndg (Li2h;)[F
      // 34: bipush 0
      // 35: faload
      // 36: invokestatic Minecraft.vz1 ()Lc05;
      // 39: getfield Minecraft.vg8 Ll86;
      // 3c: getfield EntityPlayerSP.x5k F
      // 3f: fsub
      // 40: invokestatic java/lang/Math.abs (F)F
      // 43: ldc 360.0
      // 45: nop
      // 46: frem
      // 47: fsub
      // 48: goto 66
      // 4b: invokestatic omb.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: invokestatic omb.ndg (Li2h;)[F
      // 53: bipush 0
      // 54: faload
      // 55: invokestatic Minecraft.vz1 ()Lc05;
      // 58: getfield Minecraft.vg8 Ll86;
      // 5b: getfield EntityPlayerSP.x5k F
      // 5e: fsub
      // 5f: invokestatic java/lang/Math.abs (F)F
      // 62: ldc 360.0
      // 64: nop
      // 65: frem
      // 66: fload 1
      // 67: fcmpg
      // 68: iload 2
      // 69: ifeq 77
      // 6c: ifgt 7a
      // 6f: goto 76
      // 72: invokestatic omb.a (Loov;)Loov;
      // 75: athrow
      // 76: bipush 1
      // 77: goto 7b
      // 7a: bipush 0
      // 7b: ireturn
   }

   public static float[] dq_(EntityLivingBase var0) {
      double var1 = var0.o2v - Minecraft.vz1().vg8.o2v;
      double var3 = var0.kfp + (double)var0.c5y() * 0.9 - (Minecraft.vz1().vg8.kfp + (double)Minecraft.vz1().vg8.c5y());
      double var5 = var0.vbd - Minecraft.vz1().vg8.vbd;
      double var7 = (double)fe6.v1i((float)(var1 * var1 + var5 * var5));
      float var9 = (float)(Math.atan2(var5, var1) * 180.0 / Math.PI) - 90.0F;
      float var10 = (float)(-(Math.atan2(var3, var7) * 180.0 / Math.PI));
      return new float[]{Minecraft.vz1().vg8.x5k + fe6.qsy(var9 - Minecraft.vz1().vg8.x5k), Minecraft.vz1().vg8.y2i + fe6.qsy(var10 - Minecraft.vz1().vg8.y2i)};
   }

   public static float[] uot(Entity var0) {
      double var1 = var0.o2v - Minecraft.vz1().vg8.o2v;
      double var3 = var0.vbd - Minecraft.vz1().vg8.vbd;
      double var5 = var0.kfp + (double)var0.c5y() * 0.9 - (Minecraft.vz1().vg8.kfp + (double)Minecraft.vz1().vg8.c5y());
      double var7 = (double)fe6.dii(var1 * var1 + var3 * var3);
      float var9 = (float)(Math.atan2(var3, var1) * 180.0 / Math.PI) - 90.0F;
      float var10 = (float)(-(Math.atan2(var5, var7) * 180.0 / Math.PI));
      return new float[]{var9, var10};
   }

   public static float[] b5h(fqr var0) {
      double var1 = var0.lvi - Minecraft.vz1().vg8.o2v;
      double var3 = var0.gn5 - (Minecraft.vz1().vg8.kfp + (double)Minecraft.vz1().vg8.c5y());
      double var5 = var0.bn2 - Minecraft.vz1().vg8.vbd;
      double var7 = (double)fe6.dii(var1 * var1 + var5 * var5);
      float var9 = (float)(Math.atan2(var5, var1) * 180.0 / Math.PI) - 90.0F;
      float var10 = (float)(-(Math.atan2(var3, var7) * 180.0 / Math.PI));
      return new float[]{var9, var10};
   }

   public static float[] u_w(float[] var0) {
      float var1 = fe6.qsy(Minecraft.vz1().vg8.x5k - var0[0]);
      float var2 = fe6.qsy(Minecraft.vz1().vg8.y2i - var0[1]);
      return new float[]{var1 + var0[0], var2 + var0[1]};
   }

   public static boolean mzr(EntityLivingBase param0, double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: ifnull 018
      // 008: invokestatic Minecraft.vz1 ()Lc05;
      // 00b: getfield Minecraft.vg8 Ll86;
      // 00e: ifnonnull 01e
      // 011: goto 018
      // 014: invokestatic omb.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 0
      // 019: ireturn
      // 01a: invokestatic omb.a (Loov;)Loov;
      // 01d: athrow
      // 01e: new m2j
      // 021: dup
      // 022: aload 0
      // 023: getfield EntityLivingBase.o2v D
      // 026: aload 0
      // 027: getfield EntityLivingBase.kfp D
      // 02a: aload 0
      // 02b: getfield EntityLivingBase.vbd D
      // 02e: invokespecial m2j.<init> (DDD)V
      // 031: astore 4
      // 033: new m2j
      // 036: dup
      // 037: invokestatic Minecraft.vz1 ()Lc05;
      // 03a: getfield Minecraft.vg8 Ll86;
      // 03d: getfield EntityPlayerSP.o2v D
      // 040: invokestatic Minecraft.vz1 ()Lc05;
      // 043: getfield Minecraft.vg8 Ll86;
      // 046: getfield EntityPlayerSP.kfp D
      // 049: invokestatic Minecraft.vz1 ()Lc05;
      // 04c: getfield Minecraft.vg8 Ll86;
      // 04f: getfield EntityPlayerSP.vbd D
      // 052: invokespecial m2j.<init> (DDD)V
      // 055: astore 5
      // 057: aload 0
      // 058: iload 3
      // 059: ifne 071
      // 05c: instanceof Entity
      // 05f: ifeq 078
      // 062: goto 069
      // 065: invokestatic omb.a (Loov;)Loov;
      // 068: athrow
      // 069: aload 0
      // 06a: goto 071
      // 06d: invokestatic omb.a (Loov;)Loov;
      // 070: athrow
      // 071: invokevirtual EntityLivingBase.c5y ()F
      // 074: f2d
      // 075: goto 07b
      // 078: ldc2_w 1.75
      // 07b: dstore 6
      // 07d: aload 5
      // 07f: invokevirtual m2j.o41 ()D
      // 082: invokestatic Minecraft.vz1 ()Lc05;
      // 085: getfield Minecraft.vg8 Ll86;
      // 088: invokevirtual EntityPlayerSP.c5y ()F
      // 08b: f2d
      // 08c: dadd
      // 08d: dstore 8
      // 08f: aload 4
      // 091: invokevirtual m2j.o41 ()D
      // 094: dstore 10
      // 096: dload 8
      // 098: dload 10
      // 09a: dcmpg
      // 09b: iload 3
      // 09c: ifne 0b4
      // 09f: ifgt 0ac
      // 0a2: goto 0a9
      // 0a5: invokestatic omb.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: goto 0dc
      // 0ac: dload 8
      // 0ae: dload 10
      // 0b0: dload 6
      // 0b2: dadd
      // 0b3: dcmpl
      // 0b4: iflt 0cd
      // 0b7: aload 4
      // 0b9: dload 10
      // 0bb: dload 6
      // 0bd: dadd
      // 0be: invokevirtual m2j.k5c (D)Lm2j;
      // 0c1: pop
      // 0c2: iload 3
      // 0c3: ifeq 0dc
      // 0c6: goto 0cd
      // 0c9: invokestatic omb.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 4
      // 0cf: dload 8
      // 0d1: invokevirtual m2j.k5c (D)Lm2j;
      // 0d4: pop
      // 0d5: goto 0dc
      // 0d8: invokestatic omb.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: new fqr
      // 0df: dup
      // 0e0: aload 5
      // 0e2: invokevirtual m2j.yeo ()D
      // 0e5: dload 8
      // 0e7: aload 5
      // 0e9: invokevirtual m2j.bnl ()D
      // 0ec: invokespecial fqr.<init> (DDD)V
      // 0ef: astore 12
      // 0f1: aload 4
      // 0f3: invokevirtual m2j.du3 ()Lfqr;
      // 0f6: aload 12
      // 0f8: invokevirtual fqr._kk (Lfqr;)Lfqr;
      // 0fb: astore 13
      // 0fd: aload 13
      // 0ff: invokevirtual fqr.vtb ()D
      // 102: dstore 14
      // 104: dload 14
      // 106: dload 1
      // 107: dsub
      // 108: dstore 16
      // 10a: dload 16
      // 10c: dconst_0
      // 10d: dcmpl
      // 10e: iload 3
      // 10f: ifne 123
      // 112: ifle 122
      // 115: goto 11c
      // 118: invokestatic omb.a (Loov;)Loov;
      // 11b: athrow
      // 11c: bipush 0
      // 11d: ireturn
      // 11e: invokestatic omb.a (Loov;)Loov;
      // 121: athrow
      // 122: bipush 1
      // 123: ireturn
   }

   public static float[] ln0(mew var0, vt2 var1) {
      return pdo((double)var0.getX(), (double)var0.getY(), (double)var0.getZ(), var1);
   }

   public static float[] pdo(double var0, double var2, double var4, vt2 var6) {
      _gj var7 = new _gj(Minecraft.vz1().tij);
      var7.o2v = var0 + 0.5;
      var7.kfp = var2 + 0.5;
      var7.vbd = var4 + 0.5;
      var7.o2v = var7.o2v + (double)var6.et1().getX() * 0.5;
      var7.kfp = var7.kfp + (double)var6.et1().getY() * 0.5;
      var7.vbd = var7.vbd + (double)var6.et1().getZ() * 0.5;
      return ndg(var7);
   }

   public static float[] ndg(EntityLivingBase param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic omb.a (Loov;)Loov;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic omb.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield EntityLivingBase.o2v D
      // 1d: invokestatic Minecraft.vz1 ()Lc05;
      // 20: getfield Minecraft.vg8 Ll86;
      // 23: getfield EntityPlayerSP.o2v D
      // 26: dsub
      // 27: dstore 2
      // 28: aload 0
      // 29: getfield EntityLivingBase.vbd D
      // 2c: invokestatic Minecraft.vz1 ()Lc05;
      // 2f: getfield Minecraft.vg8 Ll86;
      // 32: getfield EntityPlayerSP.vbd D
      // 35: dsub
      // 36: dstore 4
      // 38: aload 0
      // 39: iload 1
      // 3a: ifne 7f
      // 3d: instanceof Entity
      // 40: ifeq 77
      // 43: goto 4a
      // 46: invokestatic omb.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: checkcast Entity
      // 4e: astore 8
      // 50: aload 8
      // 52: getfield Entity.kfp D
      // 55: aload 8
      // 57: invokevirtual Entity.c5y ()F
      // 5a: f2d
      // 5b: dadd
      // 5c: invokestatic Minecraft.vz1 ()Lc05;
      // 5f: getfield Minecraft.vg8 Ll86;
      // 62: getfield EntityPlayerSP.kfp D
      // 65: invokestatic Minecraft.vz1 ()Lc05;
      // 68: getfield Minecraft.vg8 Ll86;
      // 6b: invokevirtual EntityPlayerSP.c5y ()F
      // 6e: f2d
      // 6f: dadd
      // 70: dsub
      // 71: dstore 6
      // 73: iload 1
      // 74: ifeq a8
      // 77: aload 0
      // 78: goto 7f
      // 7b: invokestatic omb.a (Loov;)Loov;
      // 7e: athrow
      // 7f: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 82: getfield nh4.bx_ D
      // 85: aload 0
      // 86: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 89: getfield nh4.i2c D
      // 8c: dadd
      // 8d: ldc2_w 2.0
      // 90: ddiv
      // 91: invokestatic Minecraft.vz1 ()Lc05;
      // 94: getfield Minecraft.vg8 Ll86;
      // 97: getfield EntityPlayerSP.kfp D
      // 9a: invokestatic Minecraft.vz1 ()Lc05;
      // 9d: getfield Minecraft.vg8 Ll86;
      // a0: invokevirtual EntityPlayerSP.c5y ()F
      // a3: f2d
      // a4: dadd
      // a5: dsub
      // a6: dstore 6
      // a8: dload 2
      // a9: dload 2
      // aa: dmul
      // ab: dload 4
      // ad: dload 4
      // af: dmul
      // b0: dadd
      // b1: invokestatic fe6.dii (D)F
      // b4: f2d
      // b5: dstore 8
      // b7: dload 4
      // b9: dload 2
      // ba: invokestatic java/lang/Math.atan2 (DD)D
      // bd: ldc2_w 180.0
      // c0: dmul
      // c1: ldc2_w 3.141592653589793
      // c4: ddiv
      // c5: d2f
      // c6: ldc 90.0
      // c8: nop
      // c9: fsub
      // ca: fstore 10
      // cc: dload 6
      // ce: dload 8
      // d0: invokestatic java/lang/Math.atan2 (DD)D
      // d3: ldc2_w 180.0
      // d6: dmul
      // d7: ldc2_w 3.141592653589793
      // da: ddiv
      // db: dneg
      // dc: d2f
      // dd: fstore 11
      // df: bipush 2
      // e0: newarray 6
      // e2: dup
      // e3: bipush 0
      // e4: fload 10
      // e6: fastore
      // e7: dup
      // e8: bipush 1
      // e9: fload 11
      // eb: fastore
      // ec: areturn
   }

   public static float[] mz5(double var0, double var2, double var4) {
      double var6 = var0 - Minecraft.vz1().vg8.o2v;
      double var8 = var4 - Minecraft.vz1().vg8.vbd;
      double var10 = var2 - (Minecraft.vz1().vg8.kfp + (double)Minecraft.vz1().vg8.c5y());
      double var12 = (double)fe6.dii(var6 * var6 + var8 * var8);
      float var14 = (float)(Math.atan2(var8, var6) * 180.0 / Math.PI) - 90.0F;
      float var15 = (float)(-(Math.atan2(var10, var12) * 180.0 / Math.PI));
      return new float[]{var14, var15};
   }

   public static float[] v_v(Entity var0, double var1, double var3, double var5) {
      double var7 = var0.o2v;
      double var9 = var0.vbd;
      double var11 = var0.kfp + (double)(var0.c5y() / 2.0F);
      double var13 = var7 - var1;
      double var15 = var9 - var5;
      double var17 = var11 - var3 - 0.6;
      double var19 = (double)fe6.dii(var13 * var13 + var15 * var15);
      float var21 = (float)(Math.atan2(var15, var13) * 180.0 / Math.PI) - 90.0F;
      float var22 = (float)(-(Math.atan2(var17, var19) * 180.0 / Math.PI));
      return new float[]{var21, var22};
   }

   public static float nq2(EntityLivingBase param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield EntityLivingBase.o2v D
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getfield EntityPlayerSP.o2v D
      // 0d: dsub
      // 0e: dstore 2
      // 0f: aload 0
      // 10: getfield EntityLivingBase.vbd D
      // 13: invokestatic Minecraft.vz1 ()Lc05;
      // 16: getfield Minecraft.vg8 Ll86;
      // 19: getfield EntityPlayerSP.vbd D
      // 1c: dsub
      // 1d: dstore 4
      // 1f: invokestatic OpaquePredicate.c ()I
      // 22: dconst_0
      // 23: dstore 6
      // 25: istore 1
      // 26: dload 4
      // 28: dconst_0
      // 29: dcmpg
      // 2a: iload 1
      // 2b: ifne 7a
      // 2e: ifge 64
      // 31: goto 38
      // 34: invokestatic omb.a (Loov;)Loov;
      // 37: athrow
      // 38: dload 2
      // 39: dconst_0
      // 3a: dcmpg
      // 3b: iload 1
      // 3c: ifne 7a
      // 3f: goto 46
      // 42: invokestatic omb.a (Loov;)Loov;
      // 45: athrow
      // 46: ifge 64
      // 49: goto 50
      // 4c: invokestatic omb.a (Loov;)Loov;
      // 4f: athrow
      // 50: ldc2_w 90.0
      // 53: dload 4
      // 55: dload 2
      // 56: ddiv
      // 57: invokestatic java/lang/Math.atan (D)D
      // 5a: invokestatic java/lang/Math.toDegrees (D)D
      // 5d: dadd
      // 5e: dstore 6
      // 60: iload 1
      // 61: ifeq bc
      // 64: dload 4
      // 66: dconst_0
      // 67: iload 1
      // 68: ifne b3
      // 6b: goto 72
      // 6e: invokestatic omb.a (Loov;)Loov;
      // 71: athrow
      // 72: dcmpg
      // 73: goto 7a
      // 76: invokestatic omb.a (Loov;)Loov;
      // 79: athrow
      // 7a: ifge a9
      // 7d: dload 2
      // 7e: dconst_0
      // 7f: iload 1
      // 80: ifne b3
      // 83: goto 8a
      // 86: invokestatic omb.a (Loov;)Loov;
      // 89: athrow
      // 8a: dcmpl
      // 8b: ifle a9
      // 8e: goto 95
      // 91: invokestatic omb.a (Loov;)Loov;
      // 94: athrow
      // 95: ldc2_w -90.0
      // 98: dload 4
      // 9a: dload 2
      // 9b: ddiv
      // 9c: invokestatic java/lang/Math.atan (D)D
      // 9f: invokestatic java/lang/Math.toDegrees (D)D
      // a2: dadd
      // a3: dstore 8
      // a5: iload 1
      // a6: ifeq bc
      // a9: dload 2
      // aa: dload 4
      // ac: goto b3
      // af: invokestatic omb.a (Loov;)Loov;
      // b2: athrow
      // b3: ddiv
      // b4: invokestatic java/lang/Math.atan (D)D
      // b7: dneg
      // b8: invokestatic java/lang/Math.toDegrees (D)D
      // bb: pop2
      // bc: invokestatic Minecraft.vz1 ()Lc05;
      // bf: getfield Minecraft.vg8 Ll86;
      // c2: getfield EntityPlayerSP.x5k F
      // c5: dload 6
      // c7: d2f
      // c8: fsub
      // c9: fneg
      // ca: invokestatic fe6.qsy (F)F
      // cd: freturn
   }

   public static float qqb(EntityLivingBase var0) {
      double var1 = var0.o2v - Minecraft.vz1().vg8.o2v;
      double var3 = var0.vbd - Minecraft.vz1().vg8.vbd;
      double var5 = var0.kfp - 1.6 + (double)var0.c5y() - Minecraft.vz1().vg8.kfp;
      double var7 = (double)fe6.dii(var1 * var1 + var3 * var3);
      double var9 = -Math.toDegrees(Math.atan(var5 / var7));
      return -fe6.qsy(Minecraft.vz1().vg8.y2i - (float)var9);
   }

   private static double _to(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22
   ) {
      int var24 = OpaquePredicate.b();
      double var25 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);

      double var10000;
      double var10001;
      label39: {
         label38: {
            try {
               var10000 = var25;
               var10001 = 0.0;
               if (var24 == 0) {
                  break label39;
               }

               if (var25 != 0.0) {
                  break label38;
               }
            } catch (oov var44) {
               throw a(var44);
            }

            var25 = 1.0;
         }

         var10000 = var12;
         var10001 = var0;
      }

      double var27 = var10000 - var10001;
      double var29 = var14 - var2;
      double var31 = var16 - var4;
      double var33 = Math.sqrt(var27 * var27 + var29 * var29 + var31 * var31);
      double var35 = var33 * var6 / var25;
      double var37 = var33 * var8 / var25;
      double var39 = var33 * var10 / var25;
      double var41 = 0.0;
      var41 += Math.max(Math.abs(var27 - var35) - (var18 / 2.0 + var22), 0.0);
      var41 += Math.max(Math.abs(var31 - var39) - (var18 / 2.0 + var22), 0.0);
      var41 += Math.max(Math.abs(var29 - var37) - (var20 / 2.0 + var22), 0.0);

      try {
         if (var24 == 0) {
            return var41;
         }

         if (!(var41 > 1.0)) {
            return var41;
         }
      } catch (oov var43) {
         throw a(var43);
      }

      return Math.sqrt(var41);
   }

   public static double t3_(double var0, double var2) {
      return ((var0 - var2) % 360.0 + 540.0) % 360.0 - 180.0;
   }

   public static float[] gyx(EntityLivingBase param0, float param1, float param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield EntityLivingBase.o2v D
      // 004: invokestatic Minecraft.vz1 ()Lc05;
      // 007: getfield Minecraft.vg8 Ll86;
      // 00a: getfield EntityPlayerSP.o2v D
      // 00d: dsub
      // 00e: dstore 5
      // 010: invokestatic OpaquePredicate.b ()I
      // 013: aload 0
      // 014: getfield EntityLivingBase.vbd D
      // 017: invokestatic Minecraft.vz1 ()Lc05;
      // 01a: getfield Minecraft.vg8 Ll86;
      // 01d: getfield EntityPlayerSP.vbd D
      // 020: dsub
      // 021: dstore 7
      // 023: istore 4
      // 025: aload 0
      // 026: iload 4
      // 028: ifeq 06e
      // 02b: instanceof Entity
      // 02e: ifeq 066
      // 031: goto 038
      // 034: invokestatic omb.a (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: checkcast Entity
      // 03c: astore 9
      // 03e: aload 9
      // 040: getfield Entity.kfp D
      // 043: aload 9
      // 045: invokevirtual Entity.c5y ()F
      // 048: f2d
      // 049: dadd
      // 04a: invokestatic Minecraft.vz1 ()Lc05;
      // 04d: getfield Minecraft.vg8 Ll86;
      // 050: getfield EntityPlayerSP.kfp D
      // 053: invokestatic Minecraft.vz1 ()Lc05;
      // 056: getfield Minecraft.vg8 Ll86;
      // 059: invokevirtual EntityPlayerSP.c5y ()F
      // 05c: f2d
      // 05d: dadd
      // 05e: dsub
      // 05f: dstore 5
      // 061: iload 4
      // 063: ifne 097
      // 066: aload 0
      // 067: goto 06e
      // 06a: invokestatic omb.a (Loov;)Loov;
      // 06d: athrow
      // 06e: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 071: getfield nh4.bx_ D
      // 074: aload 0
      // 075: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 078: getfield nh4.i2c D
      // 07b: dadd
      // 07c: ldc2_w 2.0
      // 07f: ddiv
      // 080: invokestatic Minecraft.vz1 ()Lc05;
      // 083: getfield Minecraft.vg8 Ll86;
      // 086: getfield EntityPlayerSP.kfp D
      // 089: invokestatic Minecraft.vz1 ()Lc05;
      // 08c: getfield Minecraft.vg8 Ll86;
      // 08f: invokevirtual EntityPlayerSP.c5y ()F
      // 092: f2d
      // 093: dadd
      // 094: dsub
      // 095: dstore 5
      // 097: new java/util/Random
      // 09a: dup
      // 09b: invokespecial java/util/Random.<init> ()V
      // 09e: astore 9
      // 0a0: iload 3
      // 0a1: iload 4
      // 0a3: ifeq 0be
      // 0a6: ifeq 0ca
      // 0a9: goto 0b0
      // 0ac: invokestatic omb.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 9
      // 0b2: bipush 15
      // 0b4: invokevirtual java/util/Random.nextInt (I)I
      // 0b7: goto 0be
      // 0ba: invokestatic omb.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: i2f
      // 0bf: ldc 0.25
      // 0c1: nop
      // 0c2: fmul
      // 0c3: ldc 5.0
      // 0c5: nop
      // 0c6: fadd
      // 0c7: goto 0cb
      // 0ca: fconst_0
      // 0cb: fstore 10
      // 0cd: dload 5
      // 0cf: dload 5
      // 0d1: dmul
      // 0d2: dload 7
      // 0d4: dload 7
      // 0d6: dmul
      // 0d7: dadd
      // 0d8: invokestatic fe6.dii (D)F
      // 0db: f2d
      // 0dc: dstore 11
      // 0de: dload 7
      // 0e0: fload 10
      // 0e2: f2d
      // 0e3: dadd
      // 0e4: dload 5
      // 0e6: invokestatic java/lang/Math.atan2 (DD)D
      // 0e9: ldc2_w 180.0
      // 0ec: dmul
      // 0ed: ldc2_w 3.141592653589793
      // 0f0: ddiv
      // 0f1: d2f
      // 0f2: ldc 90.0
      // 0f4: nop
      // 0f5: fsub
      // 0f6: fstore 13
      // 0f8: dload 5
      // 0fa: aload 0
      // 0fb: instanceof ha9
      // 0fe: ifeq 10b
      // 101: ldc 0.5
      // 103: nop
      // 104: goto 10c
      // 107: invokestatic omb.a (Loov;)Loov;
      // 10a: athrow
      // 10b: fconst_0
      // 10c: f2d
      // 10d: dsub
      // 10e: fload 10
      // 110: f2d
      // 111: dadd
      // 112: dload 11
      // 114: invokestatic java/lang/Math.atan2 (DD)D
      // 117: ldc2_w 180.0
      // 11a: dmul
      // 11b: ldc2_w 3.141592653589793
      // 11e: ddiv
      // 11f: dneg
      // 120: d2f
      // 121: fstore 14
      // 123: invokestatic Minecraft.vz1 ()Lc05;
      // 126: getfield Minecraft.vg8 Ll86;
      // 129: getfield EntityPlayerSP.y2i F
      // 12c: fload 14
      // 12e: fload 2
      // 12f: invokestatic omb.bfv (FFF)F
      // 132: fstore 15
      // 134: invokestatic Minecraft.vz1 ()Lc05;
      // 137: getfield Minecraft.vg8 Ll86;
      // 13a: getfield EntityPlayerSP.x5k F
      // 13d: fload 13
      // 13f: fload 1
      // 140: invokestatic omb.bfv (FFF)F
      // 143: fstore 16
      // 145: bipush 2
      // 146: newarray 6
      // 148: dup
      // 149: bipush 0
      // 14a: fload 16
      // 14c: fastore
      // 14d: dup
      // 14e: bipush 1
      // 14f: fload 15
      // 151: fastore
      // 152: areturn
   }

   public static fqr s_q(float var0, float var1) {
      float var2 = fe6.ssk(-var0 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = fe6.rtn(-var0 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var4 = -fe6.ssk(-var1 * (float) (Math.PI / 180.0));
      float var5 = fe6.rtn(-var1 * (float) (Math.PI / 180.0));
      return new fqr((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   public static float bfv(float var0, float var1, float var2) {
      int var3 = OpaquePredicate.c();
      float var4 = fe6.qsy(var1 - var0);

      int var10000;
      label34: {
         label33: {
            try {
               float var8;
               var10000 = (var8 = var4 - var2) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
               if (var3 != 0) {
                  break label34;
               }

               if (var10000 <= 0) {
                  break label33;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var4 = var2;
         }

         try {
            float var10001 = -var2;
            if (var3 != 0) {
               return var4 + var10001;
            }

            float var9;
            var10000 = (var9 = var4 - var10001) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
         } catch (oov var5) {
            throw a(var5);
         }
      }

      if (var10000 < 0) {
         var4 = -var2;
      }

      return var0 + var4;
   }

   public static float an3(double param0, double param2, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 0
      // 01: invokestatic Minecraft.vz1 ()Lc05;
      // 04: getfield Minecraft.vg8 Ll86;
      // 07: getfield EntityPlayerSP.o2v D
      // 0a: dsub
      // 0b: dstore 6
      // 0d: invokestatic OpaquePredicate.c ()I
      // 10: dload 2
      // 11: invokestatic Minecraft.vz1 ()Lc05;
      // 14: getfield Minecraft.vg8 Ll86;
      // 17: getfield EntityPlayerSP.vbd D
      // 1a: dsub
      // 1b: dstore 8
      // 1d: istore 5
      // 1f: dload 8
      // 21: dconst_0
      // 22: dcmpg
      // 23: iload 5
      // 25: ifne 72
      // 28: ifge 62
      // 2b: goto 32
      // 2e: invokestatic omb.a (Loov;)Loov;
      // 31: athrow
      // 32: dload 6
      // 34: dconst_0
      // 35: dcmpg
      // 36: iload 5
      // 38: ifne 72
      // 3b: goto 42
      // 3e: invokestatic omb.a (Loov;)Loov;
      // 41: athrow
      // 42: ifge 62
      // 45: goto 4c
      // 48: invokestatic omb.a (Loov;)Loov;
      // 4b: athrow
      // 4c: ldc2_w 90.0
      // 4f: dload 8
      // 51: dload 6
      // 53: ddiv
      // 54: invokestatic java/lang/Math.atan (D)D
      // 57: invokestatic java/lang/Math.toDegrees (D)D
      // 5a: dadd
      // 5b: goto b1
      // 5e: invokestatic omb.a (Loov;)Loov;
      // 61: athrow
      // 62: dload 8
      // 64: dconst_0
      // 65: iload 5
      // 67: ifne a9
      // 6a: dcmpg
      // 6b: goto 72
      // 6e: invokestatic omb.a (Loov;)Loov;
      // 71: athrow
      // 72: ifge a5
      // 75: dload 6
      // 77: dconst_0
      // 78: iload 5
      // 7a: ifne a9
      // 7d: goto 84
      // 80: invokestatic omb.a (Loov;)Loov;
      // 83: athrow
      // 84: dcmpl
      // 85: ifle a5
      // 88: goto 8f
      // 8b: invokestatic omb.a (Loov;)Loov;
      // 8e: athrow
      // 8f: ldc2_w -90.0
      // 92: dload 8
      // 94: dload 6
      // 96: ddiv
      // 97: invokestatic java/lang/Math.atan (D)D
      // 9a: invokestatic java/lang/Math.toDegrees (D)D
      // 9d: dadd
      // 9e: goto b1
      // a1: invokestatic omb.a (Loov;)Loov;
      // a4: athrow
      // a5: dload 6
      // a7: dload 8
      // a9: ddiv
      // aa: invokestatic java/lang/Math.atan (D)D
      // ad: dneg
      // ae: invokestatic java/lang/Math.toDegrees (D)D
      // b1: dstore 10
      // b3: fload 4
      // b5: dload 10
      // b7: d2f
      // b8: fsub
      // b9: fneg
      // ba: invokestatic fe6.qsy (F)F
      // bd: freturn
   }

   private static float uz0(float var0, float var1) {
      return ((var0 - var1) % 360.0F + 540.0F) % 360.0F - 180.0F;
   }

   public static double u8w(yfc var0, yfc var1) {
      return Math.hypot((double)uz0(var0.swo(), var1.swo()), (double)(var0.xvn() - var1.xvn()));
   }

   public static double ggm(yfc var0) {
      return u8w(var0, to7);
   }

   public static fqr k0r(yfc var0) {
      float var1 = (float)Math.cos((double)(-var0.swo() * (float) (Math.PI / 180.0) - (float) Math.PI));
      float var2 = (float)Math.sin((double)(-var0.swo() * (float) (Math.PI / 180.0) - (float) Math.PI));
      float var3 = (float)(-Math.cos((double)(-var0.xvn() * (float) (Math.PI / 180.0))));
      float var4 = (float)Math.sin((double)(-var0.xvn() * (float) (Math.PI / 180.0)));
      return new fqr((double)(var2 * var3), (double)var4, (double)(var1 * var3));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
