public class k7x {
   public k7x(int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: iload 1
      // 06: putfield k7x.o_e I
      // 09: invokestatic t9d.b ()I
      // 0c: aload 0
      // 0d: sipush 4096
      // 10: newarray 5
      // 12: putfield k7x.nqx [C
      // 15: istore 3
      // 16: aload 0
      // 17: new s46
      // 1a: dup
      // 1b: invokespecial s46.<init> ()V
      // 1e: iload 3
      // 1f: ifeq 3f
      // 22: putfield k7x.x2d Ls46;
      // 25: iload 2
      // 26: ifeq 42
      // 29: goto 30
      // 2c: invokestatic k7x.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: new s46
      // 34: dup
      // 35: invokespecial s46.<init> ()V
      // 38: goto 3f
      // 3b: invokestatic k7x.a (Loov;)Loov;
      // 3e: athrow
      // 3f: putfield k7x.n3q Ls46;
      // 42: return
   }

   public zfz py5(int var1, int var2, int var3) {
      int var4 = t9d.b();
      zfz var5 = (zfz)e0x.qha.gcd(this.nqx[var2 << 8 | var3 << 4 | var1]);

      try {
         if (var4 == 0) {
            return var5;
         }

         if (var5 != null) {
            return var5;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return ox_.ibw.l4i();
   }

   public void yvt(int param1, int param2, int param3, zfz param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: getstatic net/optifine/reflect/Reflector.IExtendedBlockState Lnet/optifine/reflect/ReflectorClass;
      // 08: iload 5
      // 0a: ifne 2f
      // 0d: aload 4
      // 0f: invokevirtual net/optifine/reflect/ReflectorClass.isInstance (Ljava/lang/Object;)Z
      // 12: ifeq 34
      // 15: goto 1c
      // 18: invokestatic k7x.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 4
      // 1e: getstatic net/optifine/reflect/Reflector.IExtendedBlockState_getClean Lnet/optifine/reflect/ReflectorMethod;
      // 21: bipush 0
      // 22: anewarray 4
      // 25: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 28: goto 2f
      // 2b: invokestatic k7x.a (Loov;)Loov;
      // 2e: athrow
      // 2f: checkcast zfz
      // 32: astore 4
      // 34: aload 0
      // 35: iload 1
      // 36: iload 2
      // 37: iload 3
      // 38: invokevirtual k7x.py5 (III)Lzfz;
      // 3b: astore 6
      // 3d: aload 6
      // 3f: invokeinterface zfz.r_y ()Le0x; 1
      // 44: astore 7
      // 46: aload 4
      // 48: invokeinterface zfz.r_y ()Le0x; 1
      // 4d: astore 8
      // 4f: aload 7
      // 51: getstatic ox_.ibw Le0x;
      // 54: iload 5
      // 56: ifne aa
      // 59: if_acmpeq 99
      // 5c: goto 63
      // 5f: invokestatic k7x.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: dup
      // 65: getfield k7x._tz I
      // 68: bipush 1
      // 69: isub
      // 6a: putfield k7x._tz I
      // 6d: aload 7
      // 6f: iload 5
      // 71: ifne 9b
      // 74: goto 7b
      // 77: invokestatic k7x.a (Loov;)Loov;
      // 7a: athrow
      // 7b: invokevirtual e0x.qk0 ()Z
      // 7e: ifeq 99
      // 81: goto 88
      // 84: invokestatic k7x.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: dup
      // 8a: getfield k7x.rfv I
      // 8d: bipush 1
      // 8e: isub
      // 8f: putfield k7x.rfv I
      // 92: goto 99
      // 95: invokestatic k7x.a (Loov;)Loov;
      // 98: athrow
      // 99: aload 8
      // 9b: iload 5
      // 9d: ifne cc
      // a0: getstatic ox_.ibw Le0x;
      // a3: goto aa
      // a6: invokestatic k7x.a (Loov;)Loov;
      // a9: athrow
      // aa: if_acmpeq e3
      // ad: aload 0
      // ae: dup
      // af: getfield k7x._tz I
      // b2: bipush 1
      // b3: iadd
      // b4: putfield k7x._tz I
      // b7: iload 5
      // b9: ifne fb
      // bc: goto c3
      // bf: invokestatic k7x.a (Loov;)Loov;
      // c2: athrow
      // c3: aload 8
      // c5: goto cc
      // c8: invokestatic k7x.a (Loov;)Loov;
      // cb: athrow
      // cc: invokevirtual e0x.qk0 ()Z
      // cf: ifeq e3
      // d2: aload 0
      // d3: dup
      // d4: getfield k7x.rfv I
      // d7: bipush 1
      // d8: iadd
      // d9: putfield k7x.rfv I
      // dc: goto e3
      // df: invokestatic k7x.a (Loov;)Loov;
      // e2: athrow
      // e3: aload 0
      // e4: getfield k7x.nqx [C
      // e7: iload 2
      // e8: bipush 8
      // ea: ishl
      // eb: iload 3
      // ec: bipush 4
      // ed: ishl
      // ee: ior
      // ef: iload 1
      // f0: ior
      // f1: getstatic e0x.qha Lx_0;
      // f4: aload 4
      // f6: invokevirtual x_0.zt5 (Ljava/lang/Object;)I
      // f9: i2c
      // fa: castore
      // fb: return
   }

   public e0x cyk(int var1, int var2, int var3) {
      return this.py5(var1, var2, var3).r_y();
   }

   public int jkv(int var1, int var2, int var3) {
      zfz var4 = this.py5(var1, var2, var3);
      return var4.r_y().hvp(var4);
   }

   public boolean z71() {
      int var1 = t9d.c();

      try {
         if (var1 != 0) {
            return (boolean)this._tz;
         }

         if (this._tz == 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public boolean dls() {
      int var1 = t9d.c();

      try {
         if (var1 != 0) {
            return (boolean)this.rfv;
         }

         if (this.rfv > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public int l3s() {
      return this.o_e;
   }

   public void spb(int var1, int var2, int var3, int var4) {
      this.n3q.h4x(var1, var2, var3, var4);
   }

   public int po8(int var1, int var2, int var3) {
      return this.n3q.n3s(var1, var2, var3);
   }

   public void l13(int var1, int var2, int var3, int var4) {
      this.x2d.h4x(var1, var2, var3, var4);
   }

   public int uj6(int var1, int var2, int var3) {
      return this.x2d.n3s(var1, var2, var3);
   }

   public void cfs() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ox_.ibw Le0x;
      // 03: invokevirtual e0x.l4i ()Lzfz;
      // 06: astore 2
      // 07: invokestatic t9d.b ()I
      // 0a: bipush 0
      // 0b: istore 3
      // 0c: istore 1
      // 0d: bipush 0
      // 0e: istore 4
      // 10: bipush 0
      // 11: istore 5
      // 13: iload 5
      // 15: bipush 16
      // 17: if_icmpge 98
      // 1a: bipush 0
      // 1b: istore 6
      // 1d: iload 6
      // 1f: bipush 16
      // 21: if_icmpge 91
      // 24: bipush 0
      // 25: iload 1
      // 26: ifeq 15
      // 29: istore 7
      // 2b: iload 7
      // 2d: bipush 16
      // 2f: if_icmpge 8a
      // 32: aload 0
      // 33: iload 7
      // 35: iload 5
      // 37: iload 6
      // 39: invokevirtual k7x.cyk (III)Le0x;
      // 3c: astore 8
      // 3e: iload 1
      // 3f: ifeq 8d
      // 42: iload 1
      // 43: ifeq 86
      // 46: goto 4d
      // 49: invokestatic k7x.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 8
      // 4f: getstatic ox_.ibw Le0x;
      // 52: if_acmpeq 83
      // 55: goto 5c
      // 58: invokestatic k7x.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iinc 3 1
      // 5f: iload 1
      // 60: ifeq 86
      // 63: goto 6a
      // 66: invokestatic k7x.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 8
      // 6c: invokevirtual e0x.qk0 ()Z
      // 6f: ifeq 83
      // 72: goto 79
      // 75: invokestatic k7x.a (Loov;)Loov;
      // 78: athrow
      // 79: iinc 4 1
      // 7c: goto 83
      // 7f: invokestatic k7x.a (Loov;)Loov;
      // 82: athrow
      // 83: iinc 7 1
      // 86: iload 1
      // 87: ifne 2b
      // 8a: iinc 6 1
      // 8d: iload 1
      // 8e: ifne 1d
      // 91: iinc 5 1
      // 94: iload 1
      // 95: ifne 13
      // 98: aload 0
      // 99: iload 3
      // 9a: putfield k7x._tz I
      // 9d: aload 0
      // 9e: iload 4
      // a0: putfield k7x.rfv I
      // a3: return
   }

   public char[] v_d() {
      return this.nqx;
   }

   public void x5w(char[] var1) {
      this.nqx = var1;
   }

   public s46 plx() {
      return this.x2d;
   }

   public s46 vbf() {
      return this.n3q;
   }

   public void cbu(s46 var1) {
      this.x2d = var1;
   }

   public void qr6(s46 var1) {
      this.n3q = var1;
   }

   public int i2m() {
      return this._tz;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
