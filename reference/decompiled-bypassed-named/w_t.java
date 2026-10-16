import java.util.Random;

public class w_t extends e0x {
   public w_t(boolean var1) {
      int var2 = OpaquePredicate.b();
      super(p3y.ur5);
      w_t var10000 = this;
      if (var2 != 0) {
         try {
            var10000.sii = var1;
            if (var1) {
               this.lnc(1.0F);
            }
         } catch (oov var3) {
            throw a(var3);
         }
      }
   }

   @Override
   public void tfc(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 4
      // 0b: ifeq 23
      // 0e: ifne af
      // 11: goto 18
      // 14: invokestatic w_t.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield w_t.sii Z
      // 1c: goto 23
      // 1f: invokestatic w_t.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 4
      // 25: ifeq 71
      // 28: ifeq 66
      // 2b: goto 32
      // 2e: invokestatic w_t.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: aload 2
      // 34: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 37: iload 4
      // 39: ifeq 71
      // 3c: goto 43
      // 3f: invokestatic w_t.a (Loov;)Loov;
      // 42: athrow
      // 43: ifne 66
      // 46: goto 4d
      // 49: invokestatic w_t.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 1
      // 4e: aload 2
      // 4f: getstatic ox_.il5 Le0x;
      // 52: invokevirtual e0x.l4i ()Lzfz;
      // 55: bipush 2
      // 56: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 59: pop
      // 5a: iload 4
      // 5c: ifne af
      // 5f: goto 66
      // 62: invokestatic w_t.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: getfield w_t.sii Z
      // 6a: goto 71
      // 6d: invokestatic w_t.a (Loov;)Loov;
      // 70: athrow
      // 71: iload 4
      // 73: ifeq 8c
      // 76: ifne af
      // 79: goto 80
      // 7c: invokestatic w_t.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 1
      // 81: aload 2
      // 82: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 85: goto 8c
      // 88: invokestatic w_t.a (Loov;)Loov;
      // 8b: athrow
      // 8c: iload 4
      // 8e: ifeq ae
      // 91: ifeq af
      // 94: goto 9b
      // 97: invokestatic w_t.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 1
      // 9c: aload 2
      // 9d: getstatic ox_.hjq Le0x;
      // a0: invokevirtual e0x.l4i ()Lzfz;
      // a3: bipush 2
      // a4: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // a7: goto ae
      // aa: invokestatic w_t.a (Loov;)Loov;
      // ad: athrow
      // ae: pop
      // af: return
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifeq 23
      // 0e: ifne a9
      // 11: goto 18
      // 14: invokestatic w_t.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield w_t.sii Z
      // 1c: goto 23
      // 1f: invokestatic w_t.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 5
      // 25: ifeq 6b
      // 28: ifeq 60
      // 2b: goto 32
      // 2e: invokestatic w_t.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: aload 2
      // 34: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 37: iload 5
      // 39: ifeq 6b
      // 3c: goto 43
      // 3f: invokestatic w_t.a (Loov;)Loov;
      // 42: athrow
      // 43: ifne 60
      // 46: goto 4d
      // 49: invokestatic w_t.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 1
      // 4e: aload 2
      // 4f: aload 0
      // 50: bipush 4
      // 51: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 54: iload 5
      // 56: ifne a9
      // 59: goto 60
      // 5c: invokestatic w_t.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield w_t.sii Z
      // 64: goto 6b
      // 67: invokestatic w_t.a (Loov;)Loov;
      // 6a: athrow
      // 6b: iload 5
      // 6d: ifeq 86
      // 70: ifne a9
      // 73: goto 7a
      // 76: invokestatic w_t.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 1
      // 7b: aload 2
      // 7c: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 7f: goto 86
      // 82: invokestatic w_t.a (Loov;)Loov;
      // 85: athrow
      // 86: iload 5
      // 88: ifeq a8
      // 8b: ifeq a9
      // 8e: goto 95
      // 91: invokestatic w_t.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 1
      // 96: aload 2
      // 97: getstatic ox_.hjq Le0x;
      // 9a: invokevirtual e0x.l4i ()Lzfz;
      // 9d: bipush 2
      // 9e: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // a1: goto a8
      // a4: invokestatic w_t.a (Loov;)Loov;
      // a7: athrow
      // a8: pop
      // a9: return
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifne 23
      // 0e: ifne 61
      // 11: goto 18
      // 14: invokestatic w_t.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield w_t.sii Z
      // 1c: goto 23
      // 1f: invokestatic w_t.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 5
      // 25: ifne 3e
      // 28: ifeq 61
      // 2b: goto 32
      // 2e: invokestatic w_t.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: aload 2
      // 34: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 37: goto 3e
      // 3a: invokestatic w_t.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 5
      // 40: ifne 60
      // 43: ifne 61
      // 46: goto 4d
      // 49: invokestatic w_t.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 1
      // 4e: aload 2
      // 4f: getstatic ox_.il5 Le0x;
      // 52: invokevirtual e0x.l4i ()Lzfz;
      // 55: bipush 2
      // 56: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 59: goto 60
      // 5c: invokestatic w_t.a (Loov;)Loov;
      // 5f: athrow
      // 60: pop
      // 61: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.il5);
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return u7m.gfm(ox_.il5);
   }

   @Override
   public erg b4a(zfz var1) {
      return new erg(ox_.il5);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
