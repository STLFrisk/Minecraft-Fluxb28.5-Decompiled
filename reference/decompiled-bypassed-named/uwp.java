public class uwp extends liu {
   public uwp(hr_ var1) {
      super(var1);
      this.o2u = 0.5F;
   }

   public void qbf(vjf param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 10
      // 005: aload 1
      // 006: invokevirtual vjf.j0m ()Lzfz;
      // 009: iload 10
      // 00b: ifeq 02a
      // 00e: ifnull 120
      // 011: goto 018
      // 014: invokestatic uwp.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: getstatic yu2.nu_ Lgdz;
      // 01c: invokevirtual uwp.gu4 (Lgdz;)V
      // 01f: aload 1
      // 020: invokevirtual vjf.j0m ()Lzfz;
      // 023: goto 02a
      // 026: invokestatic uwp.a (Loov;)Loov;
      // 029: athrow
      // 02a: astore 11
      // 02c: aload 11
      // 02e: invokeinterface zfz.r_y ()Le0x; 1
      // 033: astore 12
      // 035: new mew
      // 038: dup
      // 039: aload 1
      // 03a: invokespecial mew.<init> (Li2h;)V
      // 03d: astore 13
      // 03f: aload 1
      // 040: invokevirtual vjf.ky7 ()Lt9d;
      // 043: astore 14
      // 045: aload 11
      // 047: aload 14
      // 049: aload 13
      // 04b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 04e: if_acmpeq 120
      // 051: aload 12
      // 053: invokevirtual e0x.kfj ()I
      // 056: bipush -1
      // 057: iload 10
      // 059: ifeq 07a
      // 05c: goto 063
      // 05f: invokestatic uwp.a (Loov;)Loov;
      // 062: athrow
      // 063: if_icmpeq 120
      // 066: goto 06d
      // 069: invokestatic uwp.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 12
      // 06f: invokevirtual e0x.kfj ()I
      // 072: bipush 3
      // 073: goto 07a
      // 076: invokestatic uwp.a (Loov;)Loov;
      // 079: athrow
      // 07a: if_icmpne 120
      // 07d: invokestatic hzu.dp2 ()V
      // 080: dload 2
      // 081: d2f
      // 082: dload 4
      // 084: d2f
      // 085: dload 6
      // 087: d2f
      // 088: invokestatic hzu.a4k (FFF)V
      // 08b: invokestatic hzu.fpt ()V
      // 08e: invokestatic jom.yut ()Ljom;
      // 091: astore 15
      // 093: aload 15
      // 095: invokevirtual jom.zuq ()Lq3g;
      // 098: astore 16
      // 09a: aload 16
      // 09c: bipush 7
      // 09e: getstatic gnl.n6w Lbe7;
      // 0a1: invokevirtual q3g.ezr (ILbe7;)V
      // 0a4: aload 13
      // 0a6: invokevirtual mew.getX ()I
      // 0a9: istore 17
      // 0ab: aload 13
      // 0ad: invokevirtual mew.getY ()I
      // 0b0: istore 18
      // 0b2: aload 13
      // 0b4: invokevirtual mew.getZ ()I
      // 0b7: istore 19
      // 0b9: aload 16
      // 0bb: iload 17
      // 0bd: ineg
      // 0be: i2f
      // 0bf: ldc 0.5
      // 0c1: nop
      // 0c2: fsub
      // 0c3: f2d
      // 0c4: iload 18
      // 0c6: ineg
      // 0c7: i2d
      // 0c8: iload 19
      // 0ca: ineg
      // 0cb: i2f
      // 0cc: ldc 0.5
      // 0ce: nop
      // 0cf: fsub
      // 0d0: f2d
      // 0d1: invokevirtual q3g.nbz (DDD)V
      // 0d4: invokestatic Minecraft.vz1 ()Lc05;
      // 0d7: invokevirtual Minecraft.dwz ()Lqfn;
      // 0da: astore 20
      // 0dc: aload 20
      // 0de: aload 11
      // 0e0: aload 14
      // 0e2: aconst_null
      // 0e3: checkcast mew
      // 0e6: invokevirtual qfn.b5n (Lzfz;Lm5n;Lmew;)Ldbw;
      // 0e9: astore 21
      // 0eb: aload 20
      // 0ed: invokevirtual qfn.mpi ()Lg_x;
      // 0f0: aload 14
      // 0f2: aload 21
      // 0f4: aload 11
      // 0f6: aload 13
      // 0f8: aload 16
      // 0fa: bipush 0
      // 0fb: invokevirtual g_x.mh1 (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 0fe: pop
      // 0ff: aload 16
      // 101: dconst_0
      // 102: dconst_0
      // 103: dconst_0
      // 104: invokevirtual q3g.nbz (DDD)V
      // 107: aload 15
      // 109: invokevirtual jom.q7g ()V
      // 10c: invokestatic hzu.s7q ()V
      // 10f: invokestatic hzu.x3w ()V
      // 112: aload 0
      // 113: aload 1
      // 114: dload 2
      // 115: dload 4
      // 117: dload 6
      // 119: fload 8
      // 11b: fload 9
      // 11d: invokespecial liu.apl (Li2h;DDDFF)V
      // 120: return
   }

   public gdz ntf(vjf var1) {
      return yu2.nu_;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.ntf((vjf)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.qbf((vjf)var1, var2, var4, var6, var8, var9);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
