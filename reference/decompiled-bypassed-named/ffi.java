import java.util.Random;

public class ffi extends cdu {
   private final zfz mqm;

   public ffi(rh2$j7i var1) {
      this.mqm = ox_._w6.l4i().zvi(rh2.twm, var1);
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 3
      // 07: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a: invokeinterface zfz.r_y ()Le0x; 1
      // 0f: dup
      // 10: astore 5
      // 12: invokevirtual e0x.p1r ()Lp3y;
      // 15: getstatic p3y.cei Lp3y;
      // 18: if_acmpeq 26
      // 1b: aload 5
      // 1d: invokevirtual e0x.p1r ()Lp3y;
      // 20: getstatic p3y.hh1 Lp3y;
      // 23: if_acmpne 4a
      // 26: aload 3
      // 27: invokevirtual mew.getY ()I
      // 2a: iload 4
      // 2c: ifne 4b
      // 2f: goto 36
      // 32: invokestatic ffi.a (Loov;)Loov;
      // 35: athrow
      // 36: ifle 4a
      // 39: goto 40
      // 3c: invokestatic ffi.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 3
      // 41: invokevirtual mew.eve ()Lmew;
      // 44: astore 3
      // 45: iload 4
      // 47: ifeq 05
      // 4a: bipush 0
      // 4b: istore 6
      // 4d: iload 6
      // 4f: sipush 128
      // 52: if_icmpge df
      // 55: aload 3
      // 56: aload 2
      // 57: bipush 8
      // 59: invokevirtual java/util/Random.nextInt (I)I
      // 5c: aload 2
      // 5d: bipush 8
      // 5f: invokevirtual java/util/Random.nextInt (I)I
      // 62: isub
      // 63: aload 2
      // 64: bipush 4
      // 65: invokevirtual java/util/Random.nextInt (I)I
      // 68: aload 2
      // 69: bipush 4
      // 6a: invokevirtual java/util/Random.nextInt (I)I
      // 6d: isub
      // 6e: aload 2
      // 6f: bipush 8
      // 71: invokevirtual java/util/Random.nextInt (I)I
      // 74: aload 2
      // 75: bipush 8
      // 77: invokevirtual java/util/Random.nextInt (I)I
      // 7a: isub
      // 7b: invokevirtual mew.ec4 (III)Lmew;
      // 7e: astore 7
      // 80: iload 4
      // 82: ifne da
      // 85: aload 1
      // 86: aload 7
      // 88: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 8b: iload 4
      // 8d: ifne e0
      // 90: goto 97
      // 93: invokestatic ffi.a (Loov;)Loov;
      // 96: athrow
      // 97: ifeq d7
      // 9a: goto a1
      // 9d: invokestatic ffi.a (Loov;)Loov;
      // a0: athrow
      // a1: getstatic ox_._w6 Lrh2;
      // a4: aload 1
      // a5: aload 7
      // a7: aload 0
      // a8: getfield ffi.mqm Lzfz;
      // ab: invokevirtual rh2._h0 (Lt9d;Lmew;Lzfz;)Z
      // ae: iload 4
      // b0: ifne d6
      // b3: goto ba
      // b6: invokestatic ffi.a (Loov;)Loov;
      // b9: athrow
      // ba: ifeq d7
      // bd: goto c4
      // c0: invokestatic ffi.a (Loov;)Loov;
      // c3: athrow
      // c4: aload 1
      // c5: aload 7
      // c7: aload 0
      // c8: getfield ffi.mqm Lzfz;
      // cb: bipush 2
      // cc: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // cf: goto d6
      // d2: invokestatic ffi.a (Loov;)Loov;
      // d5: athrow
      // d6: pop
      // d7: iinc 6 1
      // da: iload 4
      // dc: ifeq 4d
      // df: bipush 1
      // e0: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
