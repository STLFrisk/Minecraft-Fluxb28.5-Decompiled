public class znt extends e0x {
   public znt(p3y var1, boolean var2) {
      this(var1, var2, var1.up9());
   }

   public znt(p3y var1, boolean var2, _mi var3) {
      super(var1, var3);
      this.zz_ = var2;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean ron(m5n param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 07: astore 5
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 5
      // 0e: invokeinterface zfz.r_y ()Le0x; 1
      // 13: astore 6
      // 15: istore 4
      // 17: aload 0
      // 18: iload 4
      // 1a: ifeq 32
      // 1d: getstatic ox_.fzi Le0x;
      // 20: if_acmpeq 44
      // 23: goto 2a
      // 26: invokestatic znt.b (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 32
      // 2e: invokestatic znt.b (Loov;)Loov;
      // 31: athrow
      // 32: iload 4
      // 34: ifeq 71
      // 37: getstatic ox_.dh_ Lowm;
      // 3a: if_acmpne 70
      // 3d: goto 44
      // 40: invokestatic znt.b (Loov;)Loov;
      // 43: athrow
      // 44: aload 1
      // 45: aload 2
      // 46: aload 3
      // 47: invokevirtual vt2.b4b ()Lvt2;
      // 4a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 4d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 52: aload 5
      // 54: if_acmpeq 64
      // 57: goto 5e
      // 5a: invokestatic znt.b (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 1
      // 5f: ireturn
      // 60: invokestatic znt.b (Loov;)Loov;
      // 63: athrow
      // 64: aload 6
      // 66: aload 0
      // 67: if_acmpne 70
      // 6a: bipush 0
      // 6b: ireturn
      // 6c: invokestatic znt.b (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: iload 4
      // 73: ifeq 99
      // 76: getfield znt.zz_ Z
      // 79: ifne 98
      // 7c: goto 83
      // 7f: invokestatic znt.b (Loov;)Loov;
      // 82: athrow
      // 83: aload 6
      // 85: aload 0
      // 86: if_acmpne 98
      // 89: goto 90
      // 8c: invokestatic znt.b (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 0
      // 91: goto 9f
      // 94: invokestatic znt.b (Loov;)Loov;
      // 97: athrow
      // 98: aload 0
      // 99: aload 1
      // 9a: aload 2
      // 9b: aload 3
      // 9c: invokespecial e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 9f: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
