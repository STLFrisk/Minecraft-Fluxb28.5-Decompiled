import java.util.Random;

public class va3 extends cdu {
   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: bipush 0
      // 06: istore 5
      // 08: iload 5
      // 0a: bipush 64
      // 0c: if_icmpge cd
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
      // 3c: ifne c8
      // 3f: aload 1
      // 40: aload 6
      // 42: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 45: iload 4
      // 47: ifne ce
      // 4a: goto 51
      // 4d: invokestatic va3.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq c5
      // 54: goto 5b
      // 57: invokestatic va3.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 1
      // 5c: aload 6
      // 5e: invokevirtual mew.eve ()Lmew;
      // 61: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 64: invokeinterface zfz.r_y ()Le0x; 1
      // 69: iload 4
      // 6b: ifne 8c
      // 6e: goto 75
      // 71: invokestatic va3.a (Loov;)Loov;
      // 74: athrow
      // 75: getstatic ox_.l11 Lx82;
      // 78: if_acmpne c5
      // 7b: goto 82
      // 7e: invokestatic va3.a (Loov;)Loov;
      // 81: athrow
      // 82: getstatic ox_.jzx Le0x;
      // 85: goto 8c
      // 88: invokestatic va3.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 1
      // 8d: aload 6
      // 8f: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 92: iload 4
      // 94: ifne c4
      // 97: ifeq c5
      // 9a: goto a1
      // 9d: invokestatic va3.a (Loov;)Loov;
      // a0: athrow
      // a1: aload 1
      // a2: aload 6
      // a4: getstatic ox_.jzx Le0x;
      // a7: invokevirtual e0x.l4i ()Lzfz;
      // aa: getstatic pfc.em9 Lqx_;
      // ad: getstatic vt2$unz.fzl Lvt2$unz;
      // b0: aload 2
      // b1: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // b4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // b9: bipush 2
      // ba: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // bd: goto c4
      // c0: invokestatic va3.a (Loov;)Loov;
      // c3: athrow
      // c4: pop
      // c5: iinc 5 1
      // c8: iload 4
      // ca: ifeq 08
      // cd: bipush 1
      // ce: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
