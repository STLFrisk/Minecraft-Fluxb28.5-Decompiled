public abstract class rw8 extends e0x implements adf {
   public rw8(p3y var1) {
      this(var1, var1.up9());
   }

   public rw8(p3y var1, _mi var2) {
      super(var1, var2);
      this.d90 = true;
   }

   public boolean ybw(t9d var1, mew var2, vt2 var3) {
      try {
         if (var1.getBlockState(var2.offset(var3)).r_y().p1r() == p3y.kjn) {
            return true;
         }
      } catch (oov var4) {
         throw c(var4);
      }

      return false;
   }

   public boolean vpo(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: getstatic vt2.z9q Lvt2;
      // 0a: invokevirtual rw8.ybw (Lt9d;Lmew;Lvt2;)Z
      // 0d: iload 3
      // 0e: ifeq 76
      // 11: ifne 75
      // 14: goto 1b
      // 17: invokestatic rw8.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: getstatic vt2.mxp Lvt2;
      // 21: invokevirtual rw8.ybw (Lt9d;Lmew;Lvt2;)Z
      // 24: iload 3
      // 25: ifeq 76
      // 28: goto 2f
      // 2b: invokestatic rw8.c (Loov;)Loov;
      // 2e: athrow
      // 2f: ifne 75
      // 32: goto 39
      // 35: invokestatic rw8.c (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 1
      // 3b: aload 2
      // 3c: getstatic vt2.te4 Lvt2;
      // 3f: invokevirtual rw8.ybw (Lt9d;Lmew;Lvt2;)Z
      // 42: iload 3
      // 43: ifeq 76
      // 46: goto 4d
      // 49: invokestatic rw8.c (Loov;)Loov;
      // 4c: athrow
      // 4d: ifne 75
      // 50: goto 57
      // 53: invokestatic rw8.c (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: aload 1
      // 59: aload 2
      // 5a: getstatic vt2.zk4 Lvt2;
      // 5d: invokevirtual rw8.ybw (Lt9d;Lmew;Lvt2;)Z
      // 60: iload 3
      // 61: ifeq 76
      // 64: goto 6b
      // 67: invokestatic rw8.c (Loov;)Loov;
      // 6a: athrow
      // 6b: ifeq 79
      // 6e: goto 75
      // 71: invokestatic rw8.c (Loov;)Loov;
      // 74: athrow
      // 75: bipush 1
      // 76: goto 7a
      // 79: bipush 0
      // 7a: ireturn
   }

   @Override
   public int kfj() {
      return -1;
   }

   @Override
   public void b8f(t9d var1, mew var2, zfz var3) {
      super.b8f(var1, var2, var3);
      var1._jj(var2);
   }

   @Override
   public boolean ng5(t9d param1, mew param2, zfz param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: iload 4
      // 06: iload 5
      // 08: invokespecial e0x.ng5 (Lt9d;Lmew;Lzfz;II)Z
      // 0b: pop
      // 0c: invokestatic t9d.b ()I
      // 0f: aload 1
      // 10: aload 2
      // 11: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 14: astore 7
      // 16: istore 6
      // 18: aload 7
      // 1a: iload 6
      // 1c: ifeq 33
      // 1f: ifnonnull 31
      // 22: goto 29
      // 25: invokestatic rw8.c (Loov;)Loov;
      // 28: athrow
      // 29: bipush 0
      // 2a: goto 3a
      // 2d: invokestatic rw8.c (Loov;)Loov;
      // 30: athrow
      // 31: aload 7
      // 33: iload 4
      // 35: iload 5
      // 37: invokevirtual pyk.hjo (II)Z
      // 3a: ireturn
   }

   private static oov c(oov var0) {
      return var0;
   }
}
