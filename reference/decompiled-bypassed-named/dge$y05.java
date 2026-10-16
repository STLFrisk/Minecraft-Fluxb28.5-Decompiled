public class dge$y05 extends cjm {
   private EntityVillager i72;
   private float hr2;
   private int e5m;

   public dge$y05(EntityVillager var1) {
      this.i72 = var1;
      this.k23(2);
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield dge$y05.i72 Ldge;
      // 08: iload 1
      // 09: ifeq 24
      // 0c: invokevirtual EntityVillager.q4v ()Lg_3;
      // 0f: ifnonnull 71
      // 12: goto 19
      // 15: invokestatic dge$y05.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield dge$y05.i72 Ldge;
      // 1d: goto 24
      // 20: invokestatic dge$y05.a (Loov;)Loov;
      // 23: athrow
      // 24: getfield EntityVillager.lfk Z
      // 27: iload 1
      // 28: ifeq 6e
      // 2b: ifne 6d
      // 2e: goto 35
      // 31: invokestatic dge$y05.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield dge$y05.i72 Ldge;
      // 39: invokevirtual EntityVillager.mwv ()Z
      // 3c: iload 1
      // 3d: ifeq 6e
      // 40: goto 47
      // 43: invokestatic dge$y05.a (Loov;)Loov;
      // 46: athrow
      // 47: ifne 6d
      // 4a: goto 51
      // 4d: invokestatic dge$y05.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield dge$y05.i72 Ldge;
      // 55: invokevirtual EntityVillager.b2u ()Z
      // 58: iload 1
      // 59: ifeq 6e
      // 5c: goto 63
      // 5f: invokestatic dge$y05.a (Loov;)Loov;
      // 62: athrow
      // 63: ifeq 71
      // 66: goto 6d
      // 69: invokestatic dge$y05.a (Loov;)Loov;
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 72
      // 71: bipush 0
      // 72: ireturn
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 4a
      // 09: dup
      // 0a: getfield dge$y05.e5m I
      // 0d: bipush 1
      // 0e: isub
      // 0f: dup_x1
      // 10: putfield dge$y05.e5m I
      // 13: ifgt 49
      // 16: goto 1d
      // 19: invokestatic dge$y05.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: bipush 40
      // 20: aload 0
      // 21: getfield dge$y05.i72 Ldge;
      // 24: invokevirtual EntityVillager.mbr ()Ljava/util/Random;
      // 27: bipush 60
      // 29: invokevirtual java/util/Random.nextInt (I)I
      // 2c: iadd
      // 2d: putfield dge$y05.e5m I
      // 30: aload 0
      // 31: aload 0
      // 32: getfield dge$y05.i72 Ldge;
      // 35: invokevirtual EntityVillager.mbr ()Ljava/util/Random;
      // 38: sipush 360
      // 3b: invokevirtual java/util/Random.nextInt (I)I
      // 3e: i2f
      // 3f: putfield dge$y05.hr2 F
      // 42: goto 49
      // 45: invokestatic dge$y05.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield dge$y05.i72 Ldge;
      // 4d: invokevirtual EntityVillager.gvh ()Lbww;
      // 50: checkcast dge$ilj
      // 53: aload 0
      // 54: getfield dge$y05.hr2 F
      // 57: bipush 0
      // 58: invokevirtual dge$ilj.c1a (FZ)V
      // 5b: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
