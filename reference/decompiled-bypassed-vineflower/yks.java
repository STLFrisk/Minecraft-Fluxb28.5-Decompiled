public class yks extends itu {
   public yks(int var1, float var2, e0x var3, e0x var4) {
      super(var1, var2, false);
      this.amh = var3;
      this.np6 = var4;
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
      // 05: aload 5
      // 07: getstatic vt2.rf3 Lvt2;
      // 0a: if_acmpeq 13
      // 0d: bipush 0
      // 0e: ireturn
      // 0f: invokestatic yks.b (Loov;)Loov;
      // 12: athrow
      // 13: aload 2
      // 14: aload 4
      // 16: aload 5
      // 18: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1b: aload 5
      // 1d: aload 1
      // 1e: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 21: iload 9
      // 23: ifeq 31
      // 26: ifne 32
      // 29: goto 30
      // 2c: invokestatic yks.b (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 0
      // 31: ireturn
      // 32: aload 3
      // 33: aload 4
      // 35: iload 9
      // 37: ifeq 5d
      // 3a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3d: invokeinterface zfz.r_y ()Le0x; 1
      // 42: aload 0
      // 43: getfield yks.np6 Le0x;
      // 46: if_acmpne 90
      // 49: goto 50
      // 4c: invokestatic yks.b (Loov;)Loov;
      // 4f: athrow
      // 50: aload 3
      // 51: aload 4
      // 53: invokevirtual mew.nuv ()Lmew;
      // 56: goto 5d
      // 59: invokestatic yks.b (Loov;)Loov;
      // 5c: athrow
      // 5d: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 60: iload 9
      // 62: ifeq 91
      // 65: ifeq 90
      // 68: goto 6f
      // 6b: invokestatic yks.b (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 3
      // 70: aload 4
      // 72: invokevirtual mew.nuv ()Lmew;
      // 75: aload 0
      // 76: getfield yks.amh Le0x;
      // 79: invokevirtual e0x.l4i ()Lzfz;
      // 7c: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 7f: pop
      // 80: aload 1
      // 81: dup
      // 82: getfield erg.qd2 I
      // 85: bipush 1
      // 86: isub
      // 87: putfield erg.qd2 I
      // 8a: bipush 1
      // 8b: ireturn
      // 8c: invokestatic yks.b (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 0
      // 91: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
