public class pni {
   private transient pni$dqe[] _6m = new pni$dqe[16];
   private transient int x75;
   private int kyf = 12;
   private final float tzv = 0.75F;

   private static int ft5(int var0) {
      var0 = var0 ^ var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int s18(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object ij8(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: invokestatic pni.ft5 (I)I
      // 04: istore 3
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 0
      // 09: getfield pni._6m [Lpni$dqe;
      // 0c: iload 3
      // 0d: aload 0
      // 0e: getfield pni._6m [Lpni$dqe;
      // 11: arraylength
      // 12: invokestatic pni.s18 (II)I
      // 15: aaload
      // 16: astore 4
      // 18: istore 2
      // 19: aload 4
      // 1b: ifnull 47
      // 1e: aload 4
      // 20: iload 2
      // 21: ifne 41
      // 24: getfield pni$dqe.dgm I
      // 27: iload 1
      // 28: if_icmpne 3c
      // 2b: goto 32
      // 2e: invokestatic pni.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 4
      // 34: getfield pni$dqe.zse Ljava/lang/Object;
      // 37: areturn
      // 38: invokestatic pni.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 4
      // 3e: getfield pni$dqe.g7y Lpni$dqe;
      // 41: astore 4
      // 43: iload 2
      // 44: ifeq 19
      // 47: aconst_null
      // 48: areturn
   }

   public boolean rni(int var1) {
      try {
         if (this.qr7(var1) != null) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public final pni$dqe qr7(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: invokestatic pni.ft5 (I)I
      // 04: istore 3
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: getfield pni._6m [Lpni$dqe;
      // 0c: iload 3
      // 0d: aload 0
      // 0e: getfield pni._6m [Lpni$dqe;
      // 11: arraylength
      // 12: invokestatic pni.s18 (II)I
      // 15: aaload
      // 16: astore 4
      // 18: istore 2
      // 19: aload 4
      // 1b: ifnull 44
      // 1e: aload 4
      // 20: iload 2
      // 21: ifeq 3e
      // 24: getfield pni$dqe.dgm I
      // 27: iload 1
      // 28: if_icmpne 39
      // 2b: goto 32
      // 2e: invokestatic pni.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 4
      // 34: areturn
      // 35: invokestatic pni.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: getfield pni$dqe.g7y Lpni$dqe;
      // 3e: astore 4
      // 40: iload 2
      // 41: ifne 19
      // 44: aconst_null
      // 45: areturn
   }

   public void yfe(int param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: invokestatic pni.ft5 (I)I
      // 04: istore 4
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: iload 4
      // 0b: aload 0
      // 0c: getfield pni._6m [Lpni$dqe;
      // 0f: arraylength
      // 10: invokestatic pni.s18 (II)I
      // 13: istore 5
      // 15: istore 3
      // 16: aload 0
      // 17: getfield pni._6m [Lpni$dqe;
      // 1a: iload 5
      // 1c: aaload
      // 1d: astore 6
      // 1f: aload 6
      // 21: ifnull 4e
      // 24: aload 6
      // 26: iload 3
      // 27: ifne 48
      // 2a: getfield pni$dqe.dgm I
      // 2d: iload 1
      // 2e: if_icmpne 43
      // 31: goto 38
      // 34: invokestatic pni.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 6
      // 3a: aload 2
      // 3b: putfield pni$dqe.zse Ljava/lang/Object;
      // 3e: return
      // 3f: invokestatic pni.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 6
      // 45: getfield pni$dqe.g7y Lpni$dqe;
      // 48: astore 6
      // 4a: iload 3
      // 4b: ifeq 1f
      // 4e: aload 0
      // 4f: iload 4
      // 51: iload 1
      // 52: aload 2
      // 53: iload 5
      // 55: invokespecial pni.v8t (IILjava/lang/Object;I)V
      // 58: return
   }

   private void eqw(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield pni._6m [Lpni$dqe;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 3
      // 09: arraylength
      // 0a: istore 4
      // 0c: istore 2
      // 0d: iload 4
      // 0f: iload 2
      // 10: ifeq 3a
      // 13: ldc 1073741824
      // 15: nop
      // 16: if_icmpne 32
      // 19: goto 20
      // 1c: invokestatic pni.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: ldc 2147483647
      // 23: nop
      // 24: putfield pni.kyf I
      // 27: iload 2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic pni.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 1
      // 33: goto 3a
      // 36: invokestatic pni.a (Loov;)Loov;
      // 39: athrow
      // 3a: anewarray 10
      // 3d: astore 5
      // 3f: aload 0
      // 40: aload 5
      // 42: invokespecial pni.r9x ([Lpni$dqe;)V
      // 45: aload 0
      // 46: aload 5
      // 48: putfield pni._6m [Lpni$dqe;
      // 4b: aload 0
      // 4c: iload 1
      // 4d: i2f
      // 4e: aload 0
      // 4f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 52: pop
      // 53: ldc 0.75
      // 55: nop
      // 56: fmul
      // 57: f2i
      // 58: putfield pni.kyf I
      // 5b: return
   }

   private void r9x(pni$dqe[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield pni._6m [Lpni$dqe;
      // 04: astore 3
      // 05: aload 1
      // 06: arraylength
      // 07: istore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: bipush 0
      // 0d: istore 5
      // 0f: istore 2
      // 10: iload 5
      // 12: aload 3
      // 13: arraylength
      // 14: if_icmpge 72
      // 17: aload 3
      // 18: iload 5
      // 1a: aaload
      // 1b: astore 6
      // 1d: iload 2
      // 1e: ifne 6e
      // 21: aload 6
      // 23: ifnull 6b
      // 26: goto 2d
      // 29: invokestatic pni.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 3
      // 2e: iload 5
      // 30: aconst_null
      // 31: aastore
      // 32: goto 39
      // 35: invokestatic pni.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 6
      // 3b: getfield pni$dqe.g7y Lpni$dqe;
      // 3e: astore 7
      // 40: aload 6
      // 42: getfield pni$dqe.f78 I
      // 45: iload 4
      // 47: invokestatic pni.s18 (II)I
      // 4a: istore 8
      // 4c: aload 6
      // 4e: aload 1
      // 4f: iload 8
      // 51: aaload
      // 52: putfield pni$dqe.g7y Lpni$dqe;
      // 55: aload 1
      // 56: iload 8
      // 58: aload 6
      // 5a: aastore
      // 5b: aload 7
      // 5d: astore 6
      // 5f: aload 7
      // 61: ifnonnull 67
      // 64: goto 6b
      // 67: iload 2
      // 68: ifeq 39
      // 6b: iinc 5 1
      // 6e: iload 2
      // 6f: ifeq 10
      // 72: return
   }

   public Object un9(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: invokevirtual pni.lca (I)Lpni$dqe;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 22
      // 0f: ifnonnull 21
      // 12: goto 19
      // 15: invokestatic pni.a (Loov;)Loov;
      // 18: athrow
      // 19: aconst_null
      // 1a: goto 25
      // 1d: invokestatic pni.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: getfield pni$dqe.zse Ljava/lang/Object;
      // 25: areturn
   }

   public final pni$dqe lca(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: invokestatic pni.ft5 (I)I
      // 04: istore 3
      // 05: iload 3
      // 06: aload 0
      // 07: getfield pni._6m [Lpni$dqe;
      // 0a: arraylength
      // 0b: invokestatic pni.s18 (II)I
      // 0e: istore 4
      // 10: aload 0
      // 11: getfield pni._6m [Lpni$dqe;
      // 14: iload 4
      // 16: aaload
      // 17: astore 5
      // 19: invokestatic OpaquePredicate.b ()I
      // 1c: aload 5
      // 1e: astore 6
      // 20: istore 2
      // 21: aload 6
      // 23: ifnull a0
      // 26: aload 6
      // 28: getfield pni$dqe.g7y Lpni$dqe;
      // 2b: astore 7
      // 2d: aload 6
      // 2f: iload 2
      // 30: ifeq a2
      // 33: iload 2
      // 34: ifeq 9a
      // 37: goto 3e
      // 3a: invokestatic pni.a (Loov;)Loov;
      // 3d: athrow
      // 3e: getfield pni$dqe.dgm I
      // 41: iload 1
      // 42: if_icmpne 94
      // 45: goto 4c
      // 48: invokestatic pni.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: dup
      // 4e: getfield pni.x75 I
      // 51: bipush 1
      // 52: isub
      // 53: putfield pni.x75 I
      // 56: aload 5
      // 58: aload 6
      // 5a: iload 2
      // 5b: ifeq 8e
      // 5e: goto 65
      // 61: invokestatic pni.a (Loov;)Loov;
      // 64: athrow
      // 65: if_acmpne 83
      // 68: goto 6f
      // 6b: invokestatic pni.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield pni._6m [Lpni$dqe;
      // 73: iload 4
      // 75: aload 7
      // 77: aastore
      // 78: iload 2
      // 79: ifne 91
      // 7c: goto 83
      // 7f: invokestatic pni.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 5
      // 85: aload 7
      // 87: goto 8e
      // 8a: invokestatic pni.a (Loov;)Loov;
      // 8d: athrow
      // 8e: putfield pni$dqe.g7y Lpni$dqe;
      // 91: aload 6
      // 93: areturn
      // 94: aload 6
      // 96: astore 5
      // 98: aload 7
      // 9a: astore 6
      // 9c: iload 2
      // 9d: ifne 21
      // a0: aload 6
      // a2: areturn
   }

   public void op7() {
      pni$dqe[] var2 = this._6m;
      int var10000 = OpaquePredicate.b();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < var2.length) {
            try {
               var2[var3] = null;
               var3++;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         this.x75 = 0;
         break;
      }
   }

   private void v8t(int param1, int param2, Object param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield pni._6m [Lpni$dqe;
      // 04: iload 4
      // 06: aaload
      // 07: astore 6
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: getfield pni._6m [Lpni$dqe;
      // 10: iload 4
      // 12: new pni$dqe
      // 15: dup
      // 16: iload 1
      // 17: iload 2
      // 18: aload 3
      // 19: aload 6
      // 1b: invokespecial pni$dqe.<init> (IILjava/lang/Object;Lpni$dqe;)V
      // 1e: aastore
      // 1f: istore 5
      // 21: aload 0
      // 22: dup
      // 23: getfield pni.x75 I
      // 26: iload 5
      // 28: ifeq 4e
      // 2b: dup_x1
      // 2c: bipush 1
      // 2d: iadd
      // 2e: putfield pni.x75 I
      // 31: aload 0
      // 32: getfield pni.kyf I
      // 35: if_icmplt 51
      // 38: goto 3f
      // 3b: invokestatic pni.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: bipush 2
      // 41: aload 0
      // 42: getfield pni._6m [Lpni$dqe;
      // 45: arraylength
      // 46: imul
      // 47: goto 4e
      // 4a: invokestatic pni.a (Loov;)Loov;
      // 4d: athrow
      // 4e: invokespecial pni.eqw (I)V
      // 51: return
   }

   public static int brw(int var0) {
      return ft5(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
