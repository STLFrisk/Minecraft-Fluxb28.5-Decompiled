public class qkb extends flo {
   private int _cd;
   private int ybm = 8;

   public qkb(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: bipush 6
      // 09: if_icmpge 8b
      // 0c: aload 0
      // 0d: getfield qkb.o2v D
      // 10: aload 0
      // 11: getfield qkb.z2d Ljava/util/Random;
      // 14: invokevirtual java/util/Random.nextDouble ()D
      // 17: aload 0
      // 18: getfield qkb.z2d Ljava/util/Random;
      // 1b: invokevirtual java/util/Random.nextDouble ()D
      // 1e: dsub
      // 1f: ldc2_w 4.0
      // 22: dmul
      // 23: dadd
      // 24: dstore 3
      // 25: aload 0
      // 26: getfield qkb.kfp D
      // 29: aload 0
      // 2a: getfield qkb.z2d Ljava/util/Random;
      // 2d: invokevirtual java/util/Random.nextDouble ()D
      // 30: aload 0
      // 31: getfield qkb.z2d Ljava/util/Random;
      // 34: invokevirtual java/util/Random.nextDouble ()D
      // 37: dsub
      // 38: ldc2_w 4.0
      // 3b: dmul
      // 3c: dadd
      // 3d: dstore 5
      // 3f: aload 0
      // 40: getfield qkb.vbd D
      // 43: aload 0
      // 44: getfield qkb.z2d Ljava/util/Random;
      // 47: invokevirtual java/util/Random.nextDouble ()D
      // 4a: aload 0
      // 4b: getfield qkb.z2d Ljava/util/Random;
      // 4e: invokevirtual java/util/Random.nextDouble ()D
      // 51: dsub
      // 52: ldc2_w 4.0
      // 55: dmul
      // 56: dadd
      // 57: dstore 7
      // 59: aload 0
      // 5a: getfield qkb.oay Lt9d;
      // 5d: getstatic w_0.tmu Lw_0;
      // 60: dload 3
      // 61: dload 5
      // 63: dload 7
      // 65: aload 0
      // 66: getfield qkb._cd I
      // 69: i2f
      // 6a: aload 0
      // 6b: getfield qkb.ybm I
      // 6e: i2f
      // 6f: fdiv
      // 70: f2d
      // 71: dconst_0
      // 72: dconst_0
      // 73: bipush 0
      // 74: newarray 10
      // 76: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 79: iinc 2 1
      // 7c: iload 1
      // 7d: ifne 95
      // 80: iload 1
      // 81: ifeq 06
      // 84: goto 8b
      // 87: invokestatic qkb.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: dup
      // 8d: getfield qkb._cd I
      // 90: bipush 1
      // 91: iadd
      // 92: putfield qkb._cd I
      // 95: aload 0
      // 96: iload 1
      // 97: ifne b3
      // 9a: getfield qkb._cd I
      // 9d: aload 0
      // 9e: getfield qkb.ybm I
      // a1: if_icmpne b6
      // a4: goto ab
      // a7: invokestatic qkb.a (Loov;)Loov;
      // aa: athrow
      // ab: aload 0
      // ac: goto b3
      // af: invokestatic qkb.a (Loov;)Loov;
      // b2: athrow
      // b3: invokevirtual qkb._kl ()V
      // b6: return
   }

   @Override
   public int ikr() {
      return 1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
