public final class r97$16 extends kea {
   private boolean ydh = true;

   @Override
   public erg lno(sdf param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokeinterface sdf.acz ()Lt9d; 1
      // 06: astore 4
      // 08: invokestatic t9d.c ()I
      // 0b: aload 1
      // 0c: invokeinterface sdf.taq ()Lmew; 1
      // 11: aload 1
      // 12: invokeinterface sdf.lcq ()I 1
      // 17: invokestatic okn.dwc (I)Lvt2;
      // 1a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1d: astore 5
      // 1f: getstatic ox_.jzx Le0x;
      // 22: checkcast pfc
      // 25: astore 6
      // 27: istore 3
      // 28: aload 4
      // 2a: aload 5
      // 2c: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 2f: iload 3
      // 30: ifne 4d
      // 33: ifeq 98
      // 36: goto 3d
      // 39: invokestatic r97$16.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 6
      // 3f: aload 4
      // 41: aload 5
      // 43: invokevirtual pfc.e1t (Lt9d;Lmew;)Z
      // 46: goto 4d
      // 49: invokestatic r97$16.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 3
      // 4e: ifne 67
      // 51: ifeq 98
      // 54: goto 5b
      // 57: invokestatic r97$16.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 4
      // 5d: getfield t9d.v0f Z
      // 60: goto 67
      // 63: invokestatic r97$16.a (Loov;)Loov;
      // 66: athrow
      // 67: iload 3
      // 68: ifne 89
      // 6b: ifne 8a
      // 6e: goto 75
      // 71: invokestatic r97$16.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 4
      // 77: aload 5
      // 79: aload 6
      // 7b: invokevirtual pfc.l4i ()Lzfz;
      // 7e: bipush 3
      // 7f: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 82: goto 89
      // 85: invokestatic r97$16.a (Loov;)Loov;
      // 88: athrow
      // 89: pop
      // 8a: aload 2
      // 8b: dup
      // 8c: getfield erg.qd2 I
      // 8f: bipush 1
      // 90: isub
      // 91: putfield erg.qd2 I
      // 94: iload 3
      // 95: ifeq a4
      // 98: aload 0
      // 99: bipush 0
      // 9a: putfield r97$16.ydh Z
      // 9d: goto a4
      // a0: invokestatic r97$16.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 2
      // a5: areturn
   }

   @Override
   public void d_l(sdf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield r97$16.ydh Z
      // 08: ifeq 29
      // 0b: aload 1
      // 0c: invokeinterface sdf.acz ()Lt9d; 1
      // 11: sipush 1000
      // 14: aload 1
      // 15: invokeinterface sdf.taq ()Lmew; 1
      // 1a: bipush 0
      // 1b: invokevirtual t9d.qca (ILmew;I)V
      // 1e: iload 2
      // 1f: ifeq 43
      // 22: goto 29
      // 25: invokestatic r97$16.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 1
      // 2a: invokeinterface sdf.acz ()Lt9d; 1
      // 2f: sipush 1001
      // 32: aload 1
      // 33: invokeinterface sdf.taq ()Lmew; 1
      // 38: bipush 0
      // 39: invokevirtual t9d.qca (ILmew;I)V
      // 3c: goto 43
      // 3f: invokestatic r97$16.a (Loov;)Loov;
      // 42: athrow
      // 43: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
