import java.util.Random;

public class xq_ extends cdu {
   private u5m bpb;
   private zfz km1;

   public xq_(u5m var1, u5m$cco var2) {
      this.r_d(var1, var2);
   }

   public void r_d(u5m var1, u5m$cco var2) {
      this.bpb = var1;
      this.km1 = var1.l4i().zvi(var1.h9e(), var2);
   }

   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: bipush 0
      // 06: istore 5
      // 08: iload 5
      // 0a: bipush 64
      // 0c: if_icmpge d5
      // 0f: aload 3
      // 10: aload 2
      // 11: bipush 8
      // 13: invokevirtual java/util/Random.nextInt (I)I
      // 16: aload 2
      // 17: bipush 8
      // 19: invokevirtual java/util/Random.nextInt (I)I
      // 1c: isub
      // 1d: aload 2
      // 1e: bipush 4
      // 1f: invokevirtual java/util/Random.nextInt (I)I
      // 22: aload 2
      // 23: bipush 4
      // 24: invokevirtual java/util/Random.nextInt (I)I
      // 27: isub
      // 28: aload 2
      // 29: bipush 8
      // 2b: invokevirtual java/util/Random.nextInt (I)I
      // 2e: aload 2
      // 2f: bipush 8
      // 31: invokevirtual java/util/Random.nextInt (I)I
      // 34: isub
      // 35: invokevirtual mew.ec4 (III)Lmew;
      // 38: astore 6
      // 3a: iload 4
      // 3c: ifeq d0
      // 3f: aload 1
      // 40: aload 6
      // 42: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 45: iload 4
      // 47: ifeq d6
      // 4a: goto 51
      // 4d: invokestatic xq_.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq cd
      // 54: goto 5b
      // 57: invokestatic xq_.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 1
      // 5c: getfield OpaquePredicate.vzz Lupn;
      // 5f: invokevirtual upn.qyc ()Z
      // 62: iload 4
      // 64: ifeq ab
      // 67: goto 6e
      // 6a: invokestatic xq_.a (Loov;)Loov;
      // 6d: athrow
      // 6e: ifeq 96
      // 71: goto 78
      // 74: invokestatic xq_.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 6
      // 7a: invokevirtual mew.getY ()I
      // 7d: iload 4
      // 7f: ifeq ab
      // 82: goto 89
      // 85: invokestatic xq_.a (Loov;)Loov;
      // 88: athrow
      // 89: sipush 255
      // 8c: if_icmpge cd
      // 8f: goto 96
      // 92: invokestatic xq_.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: getfield xq_.bpb Lu5m;
      // 9a: aload 1
      // 9b: aload 6
      // 9d: aload 0
      // 9e: getfield xq_.km1 Lzfz;
      // a1: invokevirtual u5m._h0 (Lt9d;Lmew;Lzfz;)Z
      // a4: goto ab
      // a7: invokestatic xq_.a (Loov;)Loov;
      // aa: athrow
      // ab: iload 4
      // ad: ifeq cc
      // b0: ifeq cd
      // b3: goto ba
      // b6: invokestatic xq_.a (Loov;)Loov;
      // b9: athrow
      // ba: aload 1
      // bb: aload 6
      // bd: aload 0
      // be: getfield xq_.km1 Lzfz;
      // c1: bipush 2
      // c2: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // c5: goto cc
      // c8: invokestatic xq_.a (Loov;)Loov;
      // cb: athrow
      // cc: pop
      // cd: iinc 5 1
      // d0: iload 4
      // d2: ifne 08
      // d5: bipush 1
      // d6: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
