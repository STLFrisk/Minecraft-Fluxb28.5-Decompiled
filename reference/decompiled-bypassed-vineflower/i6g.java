public class i6g extends u7m {
   public i6g() {
      this.qfy(uja.yj_);
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
      // 10: aload 3
      // 11: aload 4
      // 13: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 16: istore 10
      // 18: iload 10
      // 1a: ifeq 26
      // 1d: aload 4
      // 1f: goto 2d
      // 22: invokestatic i6g.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 4
      // 28: aload 5
      // 2a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2d: astore 11
      // 2f: aload 2
      // 30: aload 11
      // 32: aload 5
      // 34: aload 1
      // 35: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 38: iload 9
      // 3a: ifeq 48
      // 3d: ifne 49
      // 40: goto 47
      // 43: invokestatic i6g.a (Loov;)Loov;
      // 46: athrow
      // 47: bipush 0
      // 48: ireturn
      // 49: aload 3
      // 4a: aload 11
      // 4c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4f: invokeinterface zfz.r_y ()Le0x; 1
      // 54: astore 12
      // 56: aload 3
      // 57: aload 12
      // 59: aload 11
      // 5b: bipush 0
      // 5c: aload 5
      // 5e: aconst_null
      // 5f: checkcast i2h
      // 62: aload 1
      // 63: invokevirtual t9d.ask (Le0x;Lmew;ZLvt2;Li2h;Lerg;)Z
      // 66: iload 9
      // 68: ifeq 84
      // 6b: ifne 7b
      // 6e: goto 75
      // 71: invokestatic i6g.a (Loov;)Loov;
      // 74: athrow
      // 75: bipush 0
      // 76: ireturn
      // 77: invokestatic i6g.a (Loov;)Loov;
      // 7a: athrow
      // 7b: getstatic ox_.s0f Lfcu;
      // 7e: aload 3
      // 7f: aload 11
      // 81: invokevirtual fcu.ctq (Lt9d;Lmew;)Z
      // 84: iload 9
      // 86: ifeq b1
      // 89: ifeq b0
      // 8c: goto 93
      // 8f: invokestatic i6g.a (Loov;)Loov;
      // 92: athrow
      // 93: aload 1
      // 94: dup
      // 95: getfield erg.qd2 I
      // 98: bipush 1
      // 99: isub
      // 9a: putfield erg.qd2 I
      // 9d: aload 3
      // 9e: aload 11
      // a0: getstatic ox_.s0f Lfcu;
      // a3: invokevirtual fcu.l4i ()Lzfz;
      // a6: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // a9: pop
      // aa: bipush 1
      // ab: ireturn
      // ac: invokestatic i6g.a (Loov;)Loov;
      // af: athrow
      // b0: bipush 0
      // b1: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
