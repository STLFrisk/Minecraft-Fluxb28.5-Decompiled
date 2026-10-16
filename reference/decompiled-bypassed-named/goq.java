public class goq implements rsi {
   public goq(String var1, boolean var2, int var3) {
      this.ls3 = var1;
      this.hy_ = var2;
      this.i8i = var3;
      this.iot = new erg[var3];
   }

   public goq(ekw var1, int var2) {
      this(var1.rnh(), true, var2);
   }

   public void y55(wrt param1) {
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
      // 05: getfield goq.w6a Ljava/util/List;
      // 08: iload 2
      // 09: ifne 28
      // 0c: ifnonnull 24
      // 0f: goto 16
      // 12: invokestatic goq.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 1a: putfield goq.w6a Ljava/util/List;
      // 1d: goto 24
      // 20: invokestatic goq.b (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield goq.w6a Ljava/util/List;
      // 28: aload 1
      // 29: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2e: pop
      // 2f: return
   }

   public void oax(wrt var1) {
      this.w6a.remove(var1);
   }

   @Override
   public erg ibn(int var1) {
      int var2 = OpaquePredicate.c();

      int var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 < 0) {
               return null;
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000 < this.iot.length) {
            return this.iot[var1];
         }
      } catch (oov var3) {
         throw b(var3);
      }

      return null;
   }

   @Override
   public erg afc(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield goq.iot [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: iload 3
      // 0b: ifne 25
      // 0e: ifnull 85
      // 11: goto 18
      // 14: invokestatic goq.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield goq.iot [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic goq.b (Loov;)Loov;
      // 24: athrow
      // 25: iload 3
      // 26: ifne 57
      // 29: getfield erg.qd2 I
      // 2c: iload 2
      // 2d: if_icmpgt 4d
      // 30: goto 37
      // 33: invokestatic goq.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield goq.iot [Lerg;
      // 3b: iload 1
      // 3c: aaload
      // 3d: astore 4
      // 3f: aload 0
      // 40: getfield goq.iot [Lerg;
      // 43: iload 1
      // 44: aconst_null
      // 45: aastore
      // 46: aload 0
      // 47: invokevirtual goq.r5t ()V
      // 4a: aload 4
      // 4c: areturn
      // 4d: aload 0
      // 4e: getfield goq.iot [Lerg;
      // 51: iload 1
      // 52: aaload
      // 53: iload 2
      // 54: invokevirtual erg.amj (I)Lerg;
      // 57: astore 4
      // 59: aload 0
      // 5a: getfield goq.iot [Lerg;
      // 5d: iload 1
      // 5e: aaload
      // 5f: iload 3
      // 60: ifne 84
      // 63: getfield erg.qd2 I
      // 66: ifne 7e
      // 69: goto 70
      // 6c: invokestatic goq.b (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield goq.iot [Lerg;
      // 74: iload 1
      // 75: aconst_null
      // 76: aastore
      // 77: goto 7e
      // 7a: invokestatic goq.b (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: invokevirtual goq.r5t ()V
      // 82: aload 4
      // 84: areturn
      // 85: aconst_null
      // 86: areturn
   }

   public erg vd1(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual erg.yaq ()Lerg;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: bipush 0
      // 09: istore 4
      // 0b: istore 2
      // 0c: iload 4
      // 0e: aload 0
      // 0f: getfield goq.i8i I
      // 12: if_icmpge d4
      // 15: aload 0
      // 16: iload 4
      // 18: invokevirtual goq.ibn (I)Lerg;
      // 1b: astore 5
      // 1d: aload 5
      // 1f: iload 2
      // 20: ifne d5
      // 23: iload 2
      // 24: ifne 4b
      // 27: goto 2e
      // 2a: invokestatic goq.b (Loov;)Loov;
      // 2d: athrow
      // 2e: ifnonnull 49
      // 31: goto 38
      // 34: invokestatic goq.b (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: iload 4
      // 3b: aload 3
      // 3c: invokevirtual goq.cxl (ILerg;)V
      // 3f: aload 0
      // 40: invokevirtual goq.r5t ()V
      // 43: aconst_null
      // 44: areturn
      // 45: invokestatic goq.b (Loov;)Loov;
      // 48: athrow
      // 49: aload 5
      // 4b: aload 3
      // 4c: invokestatic erg.fl9 (Lerg;Lerg;)Z
      // 4f: iload 2
      // 50: ifne 70
      // 53: ifeq cd
      // 56: goto 5d
      // 59: invokestatic goq.b (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokevirtual goq.v6l ()I
      // 61: aload 5
      // 63: invokevirtual erg.h4s ()I
      // 66: invokestatic java/lang/Math.min (II)I
      // 69: goto 70
      // 6c: invokestatic goq.b (Loov;)Loov;
      // 6f: athrow
      // 70: istore 6
      // 72: aload 3
      // 73: getfield erg.qd2 I
      // 76: iload 6
      // 78: aload 5
      // 7a: getfield erg.qd2 I
      // 7d: isub
      // 7e: invokestatic java/lang/Math.min (II)I
      // 81: istore 7
      // 83: iload 2
      // 84: ifne d0
      // 87: iload 7
      // 89: ifle cd
      // 8c: goto 93
      // 8f: invokestatic goq.b (Loov;)Loov;
      // 92: athrow
      // 93: aload 5
      // 95: dup
      // 96: getfield erg.qd2 I
      // 99: iload 7
      // 9b: iadd
      // 9c: putfield erg.qd2 I
      // 9f: aload 3
      // a0: dup
      // a1: getfield erg.qd2 I
      // a4: iload 7
      // a6: isub
      // a7: putfield erg.qd2 I
      // aa: iload 2
      // ab: ifne d0
      // ae: goto b5
      // b1: invokestatic goq.b (Loov;)Loov;
      // b4: athrow
      // b5: aload 3
      // b6: getfield erg.qd2 I
      // b9: ifgt cd
      // bc: goto c3
      // bf: invokestatic goq.b (Loov;)Loov;
      // c2: athrow
      // c3: aload 0
      // c4: invokevirtual goq.r5t ()V
      // c7: aconst_null
      // c8: areturn
      // c9: invokestatic goq.b (Loov;)Loov;
      // cc: athrow
      // cd: iinc 4 1
      // d0: iload 2
      // d1: ifeq 0c
      // d4: aload 3
      // d5: iload 2
      // d6: ifne f6
      // d9: getfield erg.qd2 I
      // dc: aload 1
      // dd: getfield erg.qd2 I
      // e0: if_icmpeq f5
      // e3: goto ea
      // e6: invokestatic goq.b (Loov;)Loov;
      // e9: athrow
      // ea: aload 0
      // eb: invokevirtual goq.r5t ()V
      // ee: goto f5
      // f1: invokestatic goq.b (Loov;)Loov;
      // f4: athrow
      // f5: aload 3
      // f6: areturn
   }

   @Override
   public erg yvk(int param1) {
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
      // 05: getfield goq.iot [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: iload 2
      // 0b: ifeq 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic goq.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield goq.iot [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic goq.b (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield goq.iot [Lerg;
      // 2a: iload 1
      // 2b: aconst_null
      // 2c: aastore
      // 2d: aload 3
      // 2e: areturn
      // 2f: aconst_null
      // 30: areturn
   }

   @Override
   public void cxl(int param1, erg param2) {
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
      // 05: getfield goq.iot [Lerg;
      // 08: iload 1
      // 09: aload 2
      // 0a: aastore
      // 0b: iload 3
      // 0c: ifeq 4a
      // 0f: aload 2
      // 10: ifnull 46
      // 13: goto 1a
      // 16: invokestatic goq.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: iload 3
      // 1c: ifeq 3f
      // 1f: goto 26
      // 22: invokestatic goq.b (Loov;)Loov;
      // 25: athrow
      // 26: getfield erg.qd2 I
      // 29: aload 0
      // 2a: invokevirtual goq.v6l ()I
      // 2d: if_icmple 46
      // 30: goto 37
      // 33: invokestatic goq.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 2
      // 38: goto 3f
      // 3b: invokestatic goq.b (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual goq.v6l ()I
      // 43: putfield erg.qd2 I
      // 46: aload 0
      // 47: invokevirtual goq.r5t ()V
      // 4a: return
   }

   @Override
   public int opt() {
      return this.i8i;
   }

   @Override
   public String noc() {
      return this.ls3;
   }

   @Override
   public boolean qrh() {
      return this.hy_;
   }

   public void ck1(String var1) {
      this.hy_ = true;
      this.ls3 = var1;
   }

   @Override
   public ekw xyw() {
      try {
         if (this.qrh()) {
            return new tao(this.noc());
         }
      } catch (oov var1) {
         throw b(var1);
      }

      return new hsu(this.noc(), new Object[0]);
   }

   @Override
   public int v6l() {
      return 64;
   }

   @Override
   public void r5t() {
      int var1 = OpaquePredicate.b();
      if (this.w6a != null) {
         int var2 = 0;

         while (var2 < this.w6a.size()) {
            ((wrt)this.w6a.get(var2)).zsl(this);
            var2++;
            if (var1 == 0) {
               break;
            }
         }
      }
   }

   @Override
   public boolean dnv(ha9 var1) {
      return true;
   }

   @Override
   public void dk0(ha9 var1) {
   }

   @Override
   public void vhz(ha9 var1) {
   }

   @Override
   public boolean er2(int var1, erg var2) {
      return true;
   }

   @Override
   public int czu(int var1) {
      return 0;
   }

   @Override
   public void r8i(int var1, int var2) {
   }

   @Override
   public int xa3() {
      return 0;
   }

   @Override
   public void nec() {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      while (var2 < this.iot.length) {
         this.iot[var2] = null;
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   private static oov b(oov var0) {
      return var0;
   }
}
