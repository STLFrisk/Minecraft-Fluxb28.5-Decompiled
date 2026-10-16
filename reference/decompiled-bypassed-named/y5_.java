import java.util.Random;

public class y5_ extends cdu {
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
      // 0c: if_icmpge 9f
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
      // 3c: ifeq 9a
      // 3f: aload 1
      // 40: aload 6
      // 42: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 45: iload 4
      // 47: ifeq a0
      // 4a: goto 51
      // 4d: invokestatic y5_.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq 97
      // 54: goto 5b
      // 57: invokestatic y5_.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 1
      // 5c: aload 6
      // 5e: invokevirtual mew.eve ()Lmew;
      // 61: iload 4
      // 63: ifeq 8c
      // 66: goto 6d
      // 69: invokestatic y5_.a (Loov;)Loov;
      // 6c: athrow
      // 6d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 70: invokeinterface zfz.r_y ()Le0x; 1
      // 75: getstatic ox_.pzt Le0x;
      // 78: if_acmpne 97
      // 7b: goto 82
      // 7e: invokestatic y5_.a (Loov;)Loov;
      // 81: athrow
      // 82: aload 1
      // 83: aload 6
      // 85: goto 8c
      // 88: invokestatic y5_.a (Loov;)Loov;
      // 8b: athrow
      // 8c: getstatic ox_._0u Lwuo;
      // 8f: invokevirtual wuo.l4i ()Lzfz;
      // 92: bipush 2
      // 93: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 96: pop
      // 97: iinc 5 1
      // 9a: iload 4
      // 9c: ifne 08
      // 9f: bipush 1
      // a0: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
