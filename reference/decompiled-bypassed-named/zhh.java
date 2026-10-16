public class zhh extends wel {
   public EntityIronGolem u7z;
   public Entity rj3;

   public zhh(EntityIronGolem var1) {
      super(var1, false, true);
      this.u7z = var1;
      this.k23(1);
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield zhh.u7z Losf;
      // 08: invokevirtual EntityIronGolem.vda ()Lj7z;
      // 0b: astore 2
      // 0c: iload 1
      // 0d: ifne 2d
      // 10: aload 2
      // 11: ifnonnull 21
      // 14: goto 1b
      // 17: invokestatic zhh.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic zhh.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: aload 2
      // 23: aload 0
      // 24: getfield zhh.u7z Losf;
      // 27: invokevirtual j7z.gfg (Lg_3;)Lg_3;
      // 2a: putfield zhh.rj3 Lg_3;
      // 2d: aload 0
      // 2e: getfield zhh.rj3 Lg_3;
      // 31: instanceof EntitySkeleton
      // 34: iload 1
      // 35: ifne 51
      // 38: ifeq 48
      // 3b: goto 42
      // 3e: invokestatic zhh.a (Loov;)Loov;
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
      // 44: invokestatic zhh.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield zhh.rj3 Lg_3;
      // 4d: bipush 0
      // 4e: invokevirtual zhh.paa (Lg_3;Z)Z
      // 51: iload 1
      // 52: ifne 9d
      // 55: ifne 9c
      // 58: goto 5f
      // 5b: invokestatic zhh.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield zhh.pf7 Llaq;
      // 63: invokevirtual EntityPlayer.mbr ()Ljava/util/Random;
      // 66: bipush 20
      // 68: invokevirtual java/util/Random.nextInt (I)I
      // 6b: iload 1
      // 6c: ifne 9b
      // 6f: goto 76
      // 72: invokestatic zhh.a (Loov;)Loov;
      // 75: athrow
      // 76: ifne 9a
      // 79: goto 80
      // 7c: invokestatic zhh.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 0
      // 81: aload 2
      // 82: aload 0
      // 83: getfield zhh.u7z Losf;
      // 86: invokevirtual j7z.b5t (Lg_3;)Lha9;
      // 89: putfield zhh.rj3 Lg_3;
      // 8c: aload 0
      // 8d: aload 0
      // 8e: getfield zhh.rj3 Lg_3;
      // 91: bipush 0
      // 92: invokevirtual zhh.paa (Lg_3;Z)Z
      // 95: ireturn
      // 96: invokestatic zhh.a (Loov;)Loov;
      // 99: athrow
      // 9a: bipush 0
      // 9b: ireturn
      // 9c: bipush 1
      // 9d: ireturn
   }

   @Override
   public void mnp() {
      this.u7z.ux8(this.rj3);
      super.mnp();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
