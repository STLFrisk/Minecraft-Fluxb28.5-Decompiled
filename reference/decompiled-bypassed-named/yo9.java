public class yo9 {
   private transient yo9$vcp[] fds = new yo9$vcp[4096];
   private transient int kee;
   private int gz6;
   private int kw4 = 3072;
   private final float o9a = 0.75F;

   public yo9() {
      this.gz6 = this.fds.length - 1;
   }

   private static int ru6(long var0) {
      return (int)(var0 ^ var0 >>> 27);
   }

   private static int zzx(int var0) {
      var0 = var0 ^ var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int d2g(int var0, int var1) {
      return var0 & var1;
   }

   public int iz6() {
      return this.kee;
   }

   public Object hhm(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: invokestatic yo9.ru6 (J)I
      // 04: istore 4
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: aload 0
      // 0a: getfield yo9.fds [Lyo9$vcp;
      // 0d: iload 4
      // 0f: aload 0
      // 10: getfield yo9.gz6 I
      // 13: invokestatic yo9.d2g (II)I
      // 16: aaload
      // 17: astore 5
      // 19: istore 3
      // 1a: aload 5
      // 1c: ifnull 49
      // 1f: aload 5
      // 21: iload 3
      // 22: ifne 43
      // 25: getfield yo9$vcp.imq J
      // 28: lload 1
      // 29: lcmp
      // 2a: ifne 3e
      // 2d: goto 34
      // 30: invokestatic yo9.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 5
      // 36: getfield yo9$vcp.yid Ljava/lang/Object;
      // 39: areturn
      // 3a: invokestatic yo9.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 5
      // 40: getfield yo9$vcp.a7r Lyo9$vcp;
      // 43: astore 5
      // 45: iload 3
      // 46: ifeq 1a
      // 49: aconst_null
      // 4a: areturn
   }

   public boolean s3y(long var1) {
      try {
         if (this.q9x(var1) != null) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public final yo9$vcp q9x(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: invokestatic yo9.ru6 (J)I
      // 04: istore 4
      // 06: invokestatic OpaquePredicate.b ()I
      // 09: aload 0
      // 0a: getfield yo9.fds [Lyo9$vcp;
      // 0d: iload 4
      // 0f: aload 0
      // 10: getfield yo9.gz6 I
      // 13: invokestatic yo9.d2g (II)I
      // 16: aaload
      // 17: astore 5
      // 19: istore 3
      // 1a: aload 5
      // 1c: ifnull 46
      // 1f: aload 5
      // 21: iload 3
      // 22: ifeq 40
      // 25: getfield yo9$vcp.imq J
      // 28: lload 1
      // 29: lcmp
      // 2a: ifne 3b
      // 2d: goto 34
      // 30: invokestatic yo9.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 5
      // 36: areturn
      // 37: invokestatic yo9.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 5
      // 3d: getfield yo9$vcp.a7r Lyo9$vcp;
      // 40: astore 5
      // 42: iload 3
      // 43: ifne 1a
      // 46: aconst_null
      // 47: areturn
   }

   public void pab(long param1, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: invokestatic yo9.ru6 (J)I
      // 04: istore 5
      // 06: iload 5
      // 08: aload 0
      // 09: getfield yo9.gz6 I
      // 0c: invokestatic yo9.d2g (II)I
      // 0f: istore 6
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: aload 0
      // 15: getfield yo9.fds [Lyo9$vcp;
      // 18: iload 6
      // 1a: aaload
      // 1b: astore 7
      // 1d: istore 4
      // 1f: aload 7
      // 21: ifnull 51
      // 24: aload 7
      // 26: iload 4
      // 28: ifeq 4a
      // 2b: getfield yo9$vcp.imq J
      // 2e: lload 1
      // 2f: lcmp
      // 30: ifne 45
      // 33: goto 3a
      // 36: invokestatic yo9.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 7
      // 3c: aload 3
      // 3d: putfield yo9$vcp.yid Ljava/lang/Object;
      // 40: return
      // 41: invokestatic yo9.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 7
      // 47: getfield yo9$vcp.a7r Lyo9$vcp;
      // 4a: astore 7
      // 4c: iload 4
      // 4e: ifne 1f
      // 51: aload 0
      // 52: dup
      // 53: getfield yo9.kn2 I
      // 56: bipush 1
      // 57: iadd
      // 58: putfield yo9.kn2 I
      // 5b: aload 0
      // 5c: iload 5
      // 5e: lload 1
      // 5f: aload 3
      // 60: iload 6
      // 62: invokespecial yo9.ez8 (IJLjava/lang/Object;I)V
      // 65: return
   }

   private void p31(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield yo9.fds [Lyo9$vcp;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 3
      // 09: arraylength
      // 0a: istore 4
      // 0c: istore 2
      // 0d: iload 4
      // 0f: iload 2
      // 10: ifne 3a
      // 13: ldc 1073741824
      // 15: nop
      // 16: if_icmpne 32
      // 19: goto 20
      // 1c: invokestatic yo9.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: ldc 2147483647
      // 23: nop
      // 24: putfield yo9.kw4 I
      // 27: iload 2
      // 28: ifeq 6a
      // 2b: goto 32
      // 2e: invokestatic yo9.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 1
      // 33: goto 3a
      // 36: invokestatic yo9.a (Loov;)Loov;
      // 39: athrow
      // 3a: anewarray 10
      // 3d: astore 5
      // 3f: aload 0
      // 40: aload 5
      // 42: invokespecial yo9.hm5 ([Lyo9$vcp;)V
      // 45: aload 0
      // 46: aload 5
      // 48: putfield yo9.fds [Lyo9$vcp;
      // 4b: aload 0
      // 4c: aload 0
      // 4d: getfield yo9.fds [Lyo9$vcp;
      // 50: arraylength
      // 51: bipush 1
      // 52: isub
      // 53: putfield yo9.gz6 I
      // 56: iload 1
      // 57: i2f
      // 58: fstore 6
      // 5a: aload 0
      // 5b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 5e: pop
      // 5f: aload 0
      // 60: fload 6
      // 62: ldc 0.75
      // 64: nop
      // 65: fmul
      // 66: f2i
      // 67: putfield yo9.kw4 I
      // 6a: return
   }

   private void hm5(yo9$vcp[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield yo9.fds [Lyo9$vcp;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 1
      // 09: arraylength
      // 0a: istore 4
      // 0c: istore 2
      // 0d: bipush 0
      // 0e: istore 5
      // 10: iload 5
      // 12: aload 3
      // 13: arraylength
      // 14: if_icmpge 74
      // 17: aload 3
      // 18: iload 5
      // 1a: aaload
      // 1b: astore 6
      // 1d: iload 2
      // 1e: ifne 70
      // 21: aload 6
      // 23: ifnull 6d
      // 26: goto 2d
      // 29: invokestatic yo9.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 3
      // 2e: iload 5
      // 30: aconst_null
      // 31: aastore
      // 32: goto 39
      // 35: invokestatic yo9.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 6
      // 3b: getfield yo9$vcp.a7r Lyo9$vcp;
      // 3e: astore 7
      // 40: aload 6
      // 42: getfield yo9$vcp.azk I
      // 45: iload 4
      // 47: bipush 1
      // 48: isub
      // 49: invokestatic yo9.d2g (II)I
      // 4c: istore 8
      // 4e: aload 6
      // 50: aload 1
      // 51: iload 8
      // 53: aaload
      // 54: putfield yo9$vcp.a7r Lyo9$vcp;
      // 57: aload 1
      // 58: iload 8
      // 5a: aload 6
      // 5c: aastore
      // 5d: aload 7
      // 5f: astore 6
      // 61: aload 7
      // 63: ifnonnull 69
      // 66: goto 6d
      // 69: iload 2
      // 6a: ifeq 39
      // 6d: iinc 5 1
      // 70: iload 2
      // 71: ifeq 10
      // 74: return
   }

   public Object wsz(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: lload 1
      // 06: invokevirtual yo9.hl5 (J)Lyo9$vcp;
      // 09: astore 4
      // 0b: aload 4
      // 0d: iload 3
      // 0e: ifeq 25
      // 11: ifnonnull 23
      // 14: goto 1b
      // 17: invokestatic yo9.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aconst_null
      // 1c: goto 28
      // 1f: invokestatic yo9.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 4
      // 25: getfield yo9$vcp.yid Ljava/lang/Object;
      // 28: areturn
   }

   public final yo9$vcp hl5(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: invokestatic yo9.ru6 (J)I
      // 04: istore 4
      // 06: iload 4
      // 08: aload 0
      // 09: getfield yo9.gz6 I
      // 0c: invokestatic yo9.d2g (II)I
      // 0f: istore 5
      // 11: aload 0
      // 12: getfield yo9.fds [Lyo9$vcp;
      // 15: iload 5
      // 17: aaload
      // 18: astore 6
      // 1a: invokestatic OpaquePredicate.c ()I
      // 1d: aload 6
      // 1f: astore 7
      // 21: istore 3
      // 22: aload 7
      // 24: ifnull ac
      // 27: aload 7
      // 29: getfield yo9$vcp.a7r Lyo9$vcp;
      // 2c: astore 8
      // 2e: aload 7
      // 30: iload 3
      // 31: ifne ae
      // 34: iload 3
      // 35: ifne a6
      // 38: goto 3f
      // 3b: invokestatic yo9.a (Loov;)Loov;
      // 3e: athrow
      // 3f: getfield yo9$vcp.imq J
      // 42: lload 1
      // 43: lcmp
      // 44: ifne a0
      // 47: goto 4e
      // 4a: invokestatic yo9.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: dup
      // 50: getfield yo9.kn2 I
      // 53: bipush 1
      // 54: iadd
      // 55: putfield yo9.kn2 I
      // 58: aload 0
      // 59: dup
      // 5a: getfield yo9.kee I
      // 5d: bipush 1
      // 5e: isub
      // 5f: putfield yo9.kee I
      // 62: aload 6
      // 64: aload 7
      // 66: iload 3
      // 67: ifne 9a
      // 6a: goto 71
      // 6d: invokestatic yo9.a (Loov;)Loov;
      // 70: athrow
      // 71: if_acmpne 8f
      // 74: goto 7b
      // 77: invokestatic yo9.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield yo9.fds [Lyo9$vcp;
      // 7f: iload 5
      // 81: aload 8
      // 83: aastore
      // 84: iload 3
      // 85: ifeq 9d
      // 88: goto 8f
      // 8b: invokestatic yo9.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 6
      // 91: aload 8
      // 93: goto 9a
      // 96: invokestatic yo9.a (Loov;)Loov;
      // 99: athrow
      // 9a: putfield yo9$vcp.a7r Lyo9$vcp;
      // 9d: aload 7
      // 9f: areturn
      // a0: aload 7
      // a2: astore 6
      // a4: aload 8
      // a6: astore 7
      // a8: iload 3
      // a9: ifeq 22
      // ac: aload 7
      // ae: areturn
   }

   private void ez8(int param1, long param2, Object param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield yo9.fds [Lyo9$vcp;
      // 04: iload 5
      // 06: aaload
      // 07: astore 7
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: aload 0
      // 0d: getfield yo9.fds [Lyo9$vcp;
      // 10: iload 5
      // 12: new yo9$vcp
      // 15: dup
      // 16: iload 1
      // 17: lload 2
      // 18: aload 4
      // 1a: aload 7
      // 1c: invokespecial yo9$vcp.<init> (IJLjava/lang/Object;Lyo9$vcp;)V
      // 1f: aastore
      // 20: istore 6
      // 22: aload 0
      // 23: dup
      // 24: getfield yo9.kee I
      // 27: iload 6
      // 29: ifne 4f
      // 2c: dup_x1
      // 2d: bipush 1
      // 2e: iadd
      // 2f: putfield yo9.kee I
      // 32: aload 0
      // 33: getfield yo9.kw4 I
      // 36: if_icmplt 52
      // 39: goto 40
      // 3c: invokestatic yo9.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: bipush 2
      // 42: aload 0
      // 43: getfield yo9.fds [Lyo9$vcp;
      // 46: arraylength
      // 47: imul
      // 48: goto 4f
      // 4b: invokestatic yo9.a (Loov;)Loov;
      // 4e: athrow
      // 4f: invokespecial yo9.p31 (I)V
      // 52: return
   }

   public double bd2() {
      int var2 = 0;
      int var10000 = OpaquePredicate.b();
      int var3 = 0;
      int var1 = var10000;

      while (var3 < this.fds.length) {
         try {
            if (this.fds[var3] != null) {
               var2++;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var3++;
         if (var1 == 0) {
            break;
         }
      }

      return 1.0 * (double)var2 / (double)this.kee;
   }

   public static int ryz(long var0) {
      return ru6(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
