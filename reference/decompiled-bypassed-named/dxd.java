public abstract class dxd extends ed7 {
   public dxd(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
   }

   @Override
   public boolean isSelected(int var1) {
      return false;
   }

   @Override
   public void drawBackground() {
   }

   @Override
   public void drawSlot(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 7
      // 05: aload 0
      // 06: iload 1
      // 07: invokevirtual dxd.jb4 (I)Ldxd$v9l;
      // 0a: iload 1
      // 0b: iload 2
      // 0c: iload 3
      // 0d: aload 0
      // 0e: invokevirtual dxd.getListWidth ()I
      // 11: iload 4
      // 13: iload 5
      // 15: iload 6
      // 17: aload 0
      // 18: iload 5
      // 1a: iload 6
      // 1c: invokevirtual dxd.dwe (II)I
      // 1f: iload 7
      // 21: ifne 37
      // 24: iload 1
      // 25: if_icmpne 3a
      // 28: goto 2f
      // 2b: invokestatic dxd.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 37
      // 33: invokestatic dxd.a (Loov;)Loov;
      // 36: athrow
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: invokeinterface dxd$v9l.is9 (IIIIIIIZ)V 9
      // 40: return
   }

   @Override
   public void dm2(int var1, int var2, int var3) {
      this.jb4(var1)._at(var1, var2, var3);
   }

   public boolean dsd(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 2
      // 07: invokevirtual dxd.gti (I)Z
      // 0a: iload 4
      // 0c: ifne 9d
      // 0f: ifeq 9c
      // 12: goto 19
      // 15: invokestatic dxd.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: iload 2
      // 1c: invokevirtual dxd.dwe (II)I
      // 1f: istore 5
      // 21: iload 5
      // 23: iload 4
      // 25: ifne 9d
      // 28: iflt 9c
      // 2b: goto 32
      // 2e: invokestatic dxd.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield dxd.ytt I
      // 36: aload 0
      // 37: getfield dxd.wde I
      // 3a: bipush 2
      // 3b: idiv
      // 3c: iadd
      // 3d: aload 0
      // 3e: invokevirtual dxd.getListWidth ()I
      // 41: bipush 2
      // 42: idiv
      // 43: isub
      // 44: bipush 2
      // 45: iadd
      // 46: istore 6
      // 48: aload 0
      // 49: getfield dxd.vem I
      // 4c: bipush 4
      // 4d: iadd
      // 4e: aload 0
      // 4f: invokevirtual dxd.hc1 ()I
      // 52: isub
      // 53: iload 5
      // 55: aload 0
      // 56: getfield dxd.qc1 I
      // 59: imul
      // 5a: iadd
      // 5b: aload 0
      // 5c: getfield dxd.vrd I
      // 5f: iadd
      // 60: istore 7
      // 62: iload 1
      // 63: iload 6
      // 65: isub
      // 66: istore 8
      // 68: iload 2
      // 69: iload 7
      // 6b: isub
      // 6c: istore 9
      // 6e: aload 0
      // 6f: iload 5
      // 71: invokevirtual dxd.jb4 (I)Ldxd$v9l;
      // 74: iload 5
      // 76: iload 1
      // 77: iload 2
      // 78: iload 3
      // 79: iload 8
      // 7b: iload 9
      // 7d: invokeinterface dxd$v9l.r6b (IIIIII)Z 7
      // 82: iload 4
      // 84: ifne 9d
      // 87: ifeq 9c
      // 8a: goto 91
      // 8d: invokestatic dxd.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: bipush 0
      // 93: invokevirtual dxd.m9t (Z)V
      // 96: bipush 1
      // 97: ireturn
      // 98: invokestatic dxd.a (Loov;)Loov;
      // 9b: athrow
      // 9c: bipush 0
      // 9d: ireturn
   }

   public boolean qsz(int var1, int var2, int var3) {
      int var4 = OpaquePredicate.b();
      int var5 = 0;

      while (true) {
         if (var5 < this.getSize()) {
            int var6 = this.ytt + this.wde / 2 - this.getListWidth() / 2 + 2;
            int var7 = this.vem + 4 - this.hc1() + var5 * this.qc1 + this.vrd;
            int var8 = var1 - var6;
            int var9 = var2 - var7;

            try {
               this.jb4(var5).l_a(var5, var1, var2, var3, var8, var9);
               var5++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         this.m9t(true);
         break;
      }

      return false;
   }

   public abstract dxd$v9l jb4(int var1);

   private static oov a(oov var0) {
      return var0;
   }
}
