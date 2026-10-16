public class vba extends u7m {
   public vba() {
      this.qfy(uja.zip);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 3
      // 06: aload 4
      // 08: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b: invokeinterface zfz.r_y ()Le0x; 1
      // 10: astore 10
      // 12: aload 10
      // 14: instanceof dqt
      // 17: iload 9
      // 19: ifeq 51
      // 1c: ifeq 50
      // 1f: goto 26
      // 22: invokestatic vba.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 3
      // 27: getfield t9d.v0f Z
      // 2a: iload 9
      // 2c: ifeq 4f
      // 2f: goto 36
      // 32: invokestatic vba.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 46
      // 39: goto 40
      // 3c: invokestatic vba.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 1
      // 41: ireturn
      // 42: invokestatic vba.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 2
      // 47: aload 3
      // 48: aload 4
      // 4a: invokestatic vba.f_s (Lha9;Lt9d;Lmew;)Z
      // 4d: pop
      // 4e: bipush 1
      // 4f: ireturn
      // 50: bipush 0
      // 51: ireturn
   }

   public static boolean f_s(ha9 param0, t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: invokestatic ugc.es0 (Lt9d;Lmew;)Lugc;
      // 05: astore 4
      // 07: invokestatic t9d.c ()I
      // 0a: bipush 0
      // 0b: istore 5
      // 0d: istore 3
      // 0e: ldc2_w 7.0
      // 11: dstore 6
      // 13: aload 2
      // 14: invokevirtual mew.getX ()I
      // 17: istore 8
      // 19: aload 2
      // 1a: invokevirtual mew.getY ()I
      // 1d: istore 9
      // 1f: aload 2
      // 20: invokevirtual mew.getZ ()I
      // 23: istore 10
      // 25: aload 1
      // 26: ldc yqv
      // 28: nop
      // 29: new nh4
      // 2c: dup
      // 2d: iload 8
      // 2f: i2d
      // 30: dload 6
      // 32: dsub
      // 33: iload 9
      // 35: i2d
      // 36: dload 6
      // 38: dsub
      // 39: iload 10
      // 3b: i2d
      // 3c: dload 6
      // 3e: dsub
      // 3f: iload 8
      // 41: i2d
      // 42: dload 6
      // 44: dadd
      // 45: iload 9
      // 47: i2d
      // 48: dload 6
      // 4a: dadd
      // 4b: iload 10
      // 4d: i2d
      // 4e: dload 6
      // 50: dadd
      // 51: invokespecial nh4.<init> (DDDDDD)V
      // 54: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 57: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 5c: astore 11
      // 5e: aload 11
      // 60: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 65: ifeq d6
      // 68: aload 11
      // 6a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6f: checkcast yqv
      // 72: astore 12
      // 74: aload 12
      // 76: iload 3
      // 77: ifne 9e
      // 7a: invokevirtual yqv.hk3 ()Z
      // 7d: iload 3
      // 7e: ifne d8
      // 81: goto 88
      // 84: invokestatic vba.a (Loov;)Loov;
      // 87: athrow
      // 88: ifeq d2
      // 8b: goto 92
      // 8e: invokestatic vba.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 12
      // 94: invokevirtual yqv.ohg ()Li2h;
      // 97: goto 9e
      // 9a: invokestatic vba.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 0
      // 9f: if_acmpne d2
      // a2: aload 4
      // a4: iload 3
      // a5: ifne c5
      // a8: goto af
      // ab: invokestatic vba.a (Loov;)Loov;
      // ae: athrow
      // af: ifnonnull c7
      // b2: goto b9
      // b5: invokestatic vba.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 1
      // ba: aload 2
      // bb: invokestatic ugc.dk5 (Lt9d;Lmew;)Lugc;
      // be: goto c5
      // c1: invokestatic vba.a (Loov;)Loov;
      // c4: athrow
      // c5: astore 4
      // c7: aload 12
      // c9: aload 4
      // cb: bipush 1
      // cc: invokevirtual yqv.dt4 (Li2h;Z)V
      // cf: bipush 1
      // d0: istore 5
      // d2: iload 3
      // d3: ifeq 5e
      // d6: iload 5
      // d8: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
