public class stu extends gun {
   public stu(e0x var1, boolean var2) {
      int var3 = OpaquePredicate.b();
      super(var1);
      this.m_g = var1;
      if (var3 != 0) {
         try {
            if (!var2) {
               return;
            }

            this.rlr(0);
         } catch (oov var4) {
            throw c(var4);
         }
      }

      this.oml(true);
   }

   @Override
   public int bu9(erg var1, int var2) {
      return this.m_g.ieb(this.m_g.kig(var1.j6_()));
   }

   @Override
   public int v05(int var1) {
      return var1;
   }

   public stu nl0(String[] var1) {
      this.nlt = var1;
      return this;
   }

   @Override
   public String g56(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1e
      // 09: getfield stu.nlt [Ljava/lang/String;
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic stu.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic stu.c (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokespecial gun.g56 (Lerg;)Ljava/lang/String;
      // 22: areturn
      // 23: aload 1
      // 24: invokevirtual erg.j6_ ()I
      // 27: istore 3
      // 28: iload 3
      // 29: iload 2
      // 2a: ifeq 38
      // 2d: iflt 68
      // 30: goto 37
      // 33: invokestatic stu.c (Loov;)Loov;
      // 36: athrow
      // 37: iload 3
      // 38: aload 0
      // 39: getfield stu.nlt [Ljava/lang/String;
      // 3c: arraylength
      // 3d: if_icmpge 68
      // 40: new java/lang/StringBuilder
      // 43: dup
      // 44: invokespecial java/lang/StringBuilder.<init> ()V
      // 47: aload 0
      // 48: aload 1
      // 49: invokespecial gun.g56 (Lerg;)Ljava/lang/String;
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: ldc "."
      // 51: nop
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: aload 0
      // 56: getfield stu.nlt [Ljava/lang/String;
      // 59: iload 3
      // 5a: aaload
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 61: goto 6d
      // 64: invokestatic stu.c (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: aload 1
      // 6a: invokespecial gun.g56 (Lerg;)Ljava/lang/String;
      // 6d: areturn
   }

   private static oov c(oov var0) {
      return var0;
   }
}
