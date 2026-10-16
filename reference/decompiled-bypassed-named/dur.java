public class dur extends xg0 {
   public dur(OpaquePredicate var1) {
      super(var1);
   }

   public dur(OpaquePredicate var1, Entity var2) {
      super(var1, var2);
   }

   public dur(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public void _7u(akm param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield akm.sc8 Li2h;
      // 008: iload 2
      // 009: ifeq 021
      // 00c: ifnull 02e
      // 00f: goto 016
      // 012: invokestatic dur.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 1
      // 017: getfield akm.sc8 Li2h;
      // 01a: goto 021
      // 01d: invokestatic dur.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: aload 0
      // 023: invokevirtual dur.lmd ()Lg_3;
      // 026: invokestatic ofh.lr9 (Li2h;Li2h;)Lofh;
      // 029: fconst_0
      // 02a: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 02d: pop
      // 02e: aload 0
      // 02f: getfield dur.oay Lt9d;
      // 032: getfield OpaquePredicate.v0f Z
      // 035: iload 2
      // 036: ifeq 053
      // 039: ifne 0c1
      // 03c: goto 043
      // 03f: invokestatic dur.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: getfield dur.z2d Ljava/util/Random;
      // 047: bipush 8
      // 049: invokevirtual java/util/Random.nextInt (I)I
      // 04c: goto 053
      // 04f: invokestatic dur.a (Loov;)Loov;
      // 052: athrow
      // 053: iload 2
      // 054: ifeq 062
      // 057: ifne 0c1
      // 05a: goto 061
      // 05d: invokestatic dur.a (Loov;)Loov;
      // 060: athrow
      // 061: bipush 1
      // 062: istore 3
      // 063: aload 0
      // 064: getfield dur.z2d Ljava/util/Random;
      // 067: bipush 32
      // 069: invokevirtual java/util/Random.nextInt (I)I
      // 06c: iload 2
      // 06d: ifeq 07d
      // 070: ifne 07c
      // 073: goto 07a
      // 076: invokestatic dur.a (Loov;)Loov;
      // 079: athrow
      // 07a: bipush 4
      // 07b: istore 3
      // 07c: bipush 0
      // 07d: istore 4
      // 07f: iload 4
      // 081: iload 3
      // 082: if_icmpge 0c1
      // 085: new n78
      // 088: dup
      // 089: aload 0
      // 08a: getfield dur.oay Lt9d;
      // 08d: invokespecial n78.<init> (Lt9d;)V
      // 090: astore 5
      // 092: aload 5
      // 094: sipush -24000
      // 097: invokevirtual n78.mr2 (I)V
      // 09a: aload 5
      // 09c: aload 0
      // 09d: getfield dur.o2v D
      // 0a0: aload 0
      // 0a1: getfield dur.kfp D
      // 0a4: aload 0
      // 0a5: getfield dur.vbd D
      // 0a8: aload 0
      // 0a9: getfield dur.x5k F
      // 0ac: fconst_0
      // 0ad: invokevirtual n78.x24 (DDDFF)V
      // 0b0: aload 0
      // 0b1: getfield dur.oay Lt9d;
      // 0b4: aload 5
      // 0b6: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 0b9: pop
      // 0ba: iinc 4 1
      // 0bd: iload 2
      // 0be: ifne 07f
      // 0c1: ldc2_w 0.08
      // 0c4: dstore 3
      // 0c5: bipush 0
      // 0c6: istore 5
      // 0c8: iload 5
      // 0ca: bipush 8
      // 0cc: if_icmpge 133
      // 0cf: aload 0
      // 0d0: getfield dur.oay Lt9d;
      // 0d3: getstatic w_0.ips Lw_0;
      // 0d6: aload 0
      // 0d7: getfield dur.o2v D
      // 0da: aload 0
      // 0db: getfield dur.kfp D
      // 0de: aload 0
      // 0df: getfield dur.vbd D
      // 0e2: aload 0
      // 0e3: getfield dur.z2d Ljava/util/Random;
      // 0e6: invokevirtual java/util/Random.nextFloat ()F
      // 0e9: f2d
      // 0ea: ldc2_w 0.5
      // 0ed: dsub
      // 0ee: ldc2_w 0.08
      // 0f1: dmul
      // 0f2: aload 0
      // 0f3: getfield dur.z2d Ljava/util/Random;
      // 0f6: invokevirtual java/util/Random.nextFloat ()F
      // 0f9: f2d
      // 0fa: ldc2_w 0.5
      // 0fd: dsub
      // 0fe: ldc2_w 0.08
      // 101: dmul
      // 102: aload 0
      // 103: getfield dur.z2d Ljava/util/Random;
      // 106: invokevirtual java/util/Random.nextFloat ()F
      // 109: f2d
      // 10a: ldc2_w 0.5
      // 10d: dsub
      // 10e: ldc2_w 0.08
      // 111: dmul
      // 112: bipush 1
      // 113: newarray 10
      // 115: dup
      // 116: bipush 0
      // 117: getstatic xbr.ipl Lu7m;
      // 11a: invokestatic u7m._lo (Lu7m;)I
      // 11d: iastore
      // 11e: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 121: iinc 5 1
      // 124: iload 2
      // 125: ifeq 153
      // 128: iload 2
      // 129: ifne 0c8
      // 12c: goto 133
      // 12f: invokestatic dur.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 0
      // 134: iload 2
      // 135: ifeq 150
      // 138: getfield dur.oay Lt9d;
      // 13b: getfield OpaquePredicate.v0f Z
      // 13e: ifne 153
      // 141: goto 148
      // 144: invokestatic dur.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 0
      // 149: goto 150
      // 14c: invokestatic dur.a (Loov;)Loov;
      // 14f: athrow
      // 150: invokevirtual dur._kl ()V
      // 153: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
