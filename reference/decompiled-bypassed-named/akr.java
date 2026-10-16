import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class akr extends b0t implements eqe {
   public static final gdz _rg;

   public akr(Minecraft var1) {
      this.er6 = var1;
   }

   public void gm7(int param1) {
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
      // 05: invokestatic Minecraft.qgs ()J
      // 08: putfield akr.nmo J
      // 0b: aload 0
      // 0c: iload 2
      // 0d: ifne 38
      // 10: getfield akr.f8j Lal9;
      // 13: ifnull 30
      // 16: goto 1d
      // 19: invokestatic akr.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield akr.f8j Lal9;
      // 21: iload 1
      // 22: invokevirtual al9.o4o (I)V
      // 25: iload 2
      // 26: ifeq 43
      // 29: goto 30
      // 2c: invokestatic akr.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic akr.a (Loov;)Loov;
      // 37: athrow
      // 38: new al9
      // 3b: dup
      // 3c: aload 0
      // 3d: invokespecial al9.<init> (Leqe;)V
      // 40: putfield akr.f8j Lal9;
      // 43: return
   }

   private float ij7() {
      long var1 = this.nmo - Minecraft.qgs() + 5000L;
      return fe6._f3((float)var1 / 2000.0F, 0.0F, 1.0F);
   }

   public void f0m(eka param1, float param2) {
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
      // 05: iload 3
      // 06: ifne 1e
      // 09: getfield akr.f8j Lal9;
      // 0c: ifnull 8d
      // 0f: goto 16
      // 12: invokestatic akr.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic akr.a (Loov;)Loov;
      // 1d: athrow
      // 1e: invokespecial akr.ij7 ()F
      // 21: fstore 4
      // 23: fload 4
      // 25: fconst_0
      // 26: fcmpg
      // 27: iload 3
      // 28: ifne 54
      // 2b: ifgt 47
      // 2e: goto 35
      // 31: invokestatic akr.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield akr.f8j Lal9;
      // 39: invokevirtual al9.kh4 ()V
      // 3c: iload 3
      // 3d: ifeq 8d
      // 40: goto 47
      // 43: invokestatic akr.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 1
      // 48: invokevirtual eka.x05 ()I
      // 4b: bipush 2
      // 4c: idiv
      // 4d: goto 54
      // 50: invokestatic akr.a (Loov;)Loov;
      // 53: athrow
      // 54: istore 5
      // 56: aload 0
      // 57: getfield akr.o3s F
      // 5a: fstore 6
      // 5c: aload 0
      // 5d: ldc -90.0
      // 5f: nop
      // 60: putfield akr.o3s F
      // 63: aload 1
      // 64: invokevirtual eka.lrx ()I
      // 67: i2f
      // 68: ldc 22.0
      // 6a: nop
      // 6b: fload 4
      // 6d: fmul
      // 6e: fsub
      // 6f: fstore 7
      // 71: aload 0
      // 72: getfield akr.f8j Lal9;
      // 75: invokevirtual al9.zrh ()Lh61;
      // 78: astore 8
      // 7a: aload 0
      // 7b: aload 1
      // 7c: fload 4
      // 7e: iload 5
      // 80: fload 7
      // 82: aload 8
      // 84: invokevirtual akr._dw (Leka;FIFLh61;)V
      // 87: aload 0
      // 88: fload 6
      // 8a: putfield akr.o3s F
      // 8d: return
   }

   public void _dw(eka param1, float param2, int param3, float param4, h61 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic hzu.ixc ()V
      // 03: invokestatic hzu.spd ()V
      // 06: sipush 770
      // 09: sipush 771
      // 0c: bipush 1
      // 0d: bipush 0
      // 0e: invokestatic hzu.u39 (IIII)V
      // 11: fconst_1
      // 12: fconst_1
      // 13: fconst_1
      // 14: fload 2
      // 15: invokestatic hzu.wn0 (FFFF)V
      // 18: invokestatic OpaquePredicate.c ()I
      // 1b: aload 0
      // 1c: getfield akr.er6 Lc05;
      // 1f: invokevirtual Minecraft.l22 ()Llc5;
      // 22: getstatic akr.wdc Lgdz;
      // 25: invokevirtual lc5.anl (Lgdz;)V
      // 28: istore 6
      // 2a: aload 0
      // 2b: iload 3
      // 2c: bipush 91
      // 2e: isub
      // 2f: i2f
      // 30: fload 4
      // 32: bipush 0
      // 33: bipush 0
      // 34: sipush 182
      // 37: bipush 22
      // 39: invokevirtual akr.j7o (FFIIII)V
      // 3c: aload 5
      // 3e: invokevirtual h61.hys ()I
      // 41: iload 6
      // 43: ifne 7a
      // 46: iflt 76
      // 49: goto 50
      // 4c: invokestatic akr.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: iload 3
      // 52: bipush 91
      // 54: isub
      // 55: bipush 1
      // 56: isub
      // 57: aload 5
      // 59: invokevirtual h61.hys ()I
      // 5c: bipush 20
      // 5e: imul
      // 5f: iadd
      // 60: i2f
      // 61: fload 4
      // 63: fconst_1
      // 64: fsub
      // 65: bipush 0
      // 66: bipush 22
      // 68: bipush 24
      // 6a: bipush 22
      // 6c: invokevirtual akr.j7o (FFIIII)V
      // 6f: goto 76
      // 72: invokestatic akr.a (Loov;)Loov;
      // 75: athrow
      // 76: invokestatic qpm.gdb ()V
      // 79: bipush 0
      // 7a: istore 7
      // 7c: iload 7
      // 7e: bipush 9
      // 80: if_icmpge bc
      // 83: aload 0
      // 84: iload 7
      // 86: aload 1
      // 87: invokevirtual eka.x05 ()I
      // 8a: bipush 2
      // 8b: idiv
      // 8c: bipush 90
      // 8e: isub
      // 8f: iload 7
      // 91: bipush 20
      // 93: imul
      // 94: iadd
      // 95: bipush 2
      // 96: iadd
      // 97: fload 4
      // 99: ldc 3.0
      // 9b: nop
      // 9c: fadd
      // 9d: fload 2
      // 9e: aload 5
      // a0: iload 7
      // a2: invokevirtual h61.m3g (I)Lsjk;
      // a5: invokespecial akr.r8e (IIFFLsjk;)V
      // a8: iinc 7 1
      // ab: iload 6
      // ad: ifne c5
      // b0: iload 6
      // b2: ifeq 7c
      // b5: goto bc
      // b8: invokestatic akr.a (Loov;)Loov;
      // bb: athrow
      // bc: invokestatic qpm.cng ()V
      // bf: invokestatic hzu.eiq ()V
      // c2: invokestatic hzu.ux6 ()V
      // c5: return
   }

   private void r8e(int param1, int param2, float param3, float param4, sjk param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: getfield akr.er6 Lc05;
      // 09: invokevirtual Minecraft.l22 ()Llc5;
      // 0c: getstatic akr._rg Lgdz;
      // 0f: invokevirtual lc5.anl (Lgdz;)V
      // 12: aload 5
      // 14: getstatic al9._du Lsjk;
      // 17: if_acmpeq e9
      // 1a: fload 4
      // 1c: ldc 255.0
      // 1e: nop
      // 1f: fmul
      // 20: f2i
      // 21: istore 7
      // 23: invokestatic hzu.dp2 ()V
      // 26: iload 2
      // 27: i2f
      // 28: iload 6
      // 2a: ifne 4d
      // 2d: fload 3
      // 2e: fconst_0
      // 2f: invokestatic hzu.a4k (FFF)V
      // 32: aload 5
      // 34: invokeinterface sjk.v4p ()Z 1
      // 39: ifeq 4b
      // 3c: goto 43
      // 3f: invokestatic akr.a (Loov;)Loov;
      // 42: athrow
      // 43: fconst_1
      // 44: goto 4e
      // 47: invokestatic akr.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ldc 0.25
      // 4d: nop
      // 4e: fstore 8
      // 50: fload 8
      // 52: fload 8
      // 54: fload 8
      // 56: fload 4
      // 58: invokestatic hzu.wn0 (FFFF)V
      // 5b: aload 5
      // 5d: fload 8
      // 5f: iload 7
      // 61: invokeinterface sjk.b6x (FI)V 3
      // 66: invokestatic hzu.x3w ()V
      // 69: aload 0
      // 6a: getfield akr.er6 Lc05;
      // 6d: getfield Minecraft.oxn Lmoh;
      // 70: getfield moh.m85 [Lm7l;
      // 73: iload 1
      // 74: aaload
      // 75: invokevirtual m7l.xbs ()I
      // 78: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 7b: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 7e: astore 9
      // 80: iload 7
      // 82: iload 6
      // 84: ifne a0
      // 87: bipush 3
      // 88: if_icmple e9
      // 8b: goto 92
      // 8e: invokestatic akr.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 5
      // 94: invokeinterface sjk.v4p ()Z 1
      // 99: goto a0
      // 9c: invokestatic akr.a (Loov;)Loov;
      // 9f: athrow
      // a0: iload 6
      // a2: ifne e8
      // a5: ifeq e9
      // a8: goto af
      // ab: invokestatic akr.a (Loov;)Loov;
      // ae: athrow
      // af: aload 0
      // b0: getfield akr.er6 Lc05;
      // b3: getfield Minecraft.tx1 Lowt;
      // b6: aload 9
      // b8: iload 2
      // b9: bipush 19
      // bb: iadd
      // bc: bipush 2
      // bd: isub
      // be: aload 0
      // bf: getfield akr.er6 Lc05;
      // c2: getfield Minecraft.tx1 Lowt;
      // c5: aload 9
      // c7: invokevirtual owt.ezt (Ljava/lang/String;)I
      // ca: isub
      // cb: i2f
      // cc: fload 3
      // cd: ldc 6.0
      // cf: nop
      // d0: fadd
      // d1: ldc 3.0
      // d3: nop
      // d4: fadd
      // d5: ldc 16777215
      // d7: nop
      // d8: iload 7
      // da: bipush 24
      // dc: ishl
      // dd: iadd
      // de: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // e1: goto e8
      // e4: invokestatic akr.a (Loov;)Loov;
      // e7: athrow
      // e8: pop
      // e9: return
   }

   public void gdx(eka param1) {
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
      // 05: invokespecial akr.ij7 ()F
      // 08: ldc 255.0
      // 0a: nop
      // 0b: fmul
      // 0c: f2i
      // 0d: istore 3
      // 0e: iload 3
      // 0f: bipush 3
      // 10: if_icmple cd
      // 13: aload 0
      // 14: getfield akr.f8j Lal9;
      // 17: iload 2
      // 18: ifeq 37
      // 1b: goto 22
      // 1e: invokestatic akr.a (Loov;)Loov;
      // 21: athrow
      // 22: ifnull cd
      // 25: goto 2c
      // 28: invokestatic akr.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield akr.f8j Lal9;
      // 30: goto 37
      // 33: invokestatic akr.a (Loov;)Loov;
      // 36: athrow
      // 37: invokevirtual al9.by8 ()Lsjk;
      // 3a: astore 4
      // 3c: aload 4
      // 3e: iload 2
      // 3f: ifeq 58
      // 42: getstatic al9._du Lsjk;
      // 45: if_acmpeq 65
      // 48: goto 4f
      // 4b: invokestatic akr.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 4
      // 51: goto 58
      // 54: invokestatic akr.a (Loov;)Loov;
      // 57: athrow
      // 58: invokeinterface sjk.s34 ()Lekw; 1
      // 5d: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 62: goto 76
      // 65: aload 0
      // 66: getfield akr.f8j Lal9;
      // 69: invokevirtual al9.sr4 ()Lwra;
      // 6c: invokeinterface wra.iuh ()Lekw; 1
      // 71: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 76: astore 5
      // 78: aload 5
      // 7a: ifnull cd
      // 7d: aload 1
      // 7e: invokevirtual eka.x05 ()I
      // 81: aload 0
      // 82: getfield akr.er6 Lc05;
      // 85: getfield Minecraft.tx1 Lowt;
      // 88: aload 5
      // 8a: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 8d: isub
      // 8e: bipush 2
      // 8f: idiv
      // 90: istore 6
      // 92: aload 1
      // 93: invokevirtual eka.lrx ()I
      // 96: bipush 35
      // 98: isub
      // 99: istore 7
      // 9b: invokestatic hzu.dp2 ()V
      // 9e: invokestatic hzu.spd ()V
      // a1: sipush 770
      // a4: sipush 771
      // a7: bipush 1
      // a8: bipush 0
      // a9: invokestatic hzu.u39 (IIII)V
      // ac: aload 0
      // ad: getfield akr.er6 Lc05;
      // b0: getfield Minecraft.tx1 Lowt;
      // b3: aload 5
      // b5: iload 6
      // b7: i2f
      // b8: iload 7
      // ba: i2f
      // bb: ldc 16777215
      // bd: nop
      // be: iload 3
      // bf: bipush 24
      // c1: ishl
      // c2: iadd
      // c3: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // c6: pop
      // c7: invokestatic hzu.ux6 ()V
      // ca: invokestatic hzu.x3w ()V
      // cd: return
   }

   @Override
   public void b67(al9 var1) {
      this.f8j = null;
      this.nmo = 0L;
   }

   public boolean e1e() {
      try {
         if (this.f8j != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public void ou8(int param1) {
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
      // 05: getfield akr.f8j Lal9;
      // 08: invokevirtual al9.q_4 ()I
      // 0b: iload 1
      // 0c: iadd
      // 0d: istore 3
      // 0e: iload 3
      // 0f: iflt 78
      // 12: iload 3
      // 13: iload 2
      // 14: ifeq 79
      // 17: bipush 8
      // 19: iload 2
      // 1a: ifeq 8a
      // 1d: goto 24
      // 20: invokestatic akr.a (Loov;)Loov;
      // 23: athrow
      // 24: if_icmpgt 78
      // 27: goto 2e
      // 2a: invokestatic akr.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield akr.f8j Lal9;
      // 32: iload 3
      // 33: invokevirtual al9.i37 (I)Lsjk;
      // 36: iload 2
      // 37: ifeq 5d
      // 3a: goto 41
      // 3d: invokestatic akr.a (Loov;)Loov;
      // 40: athrow
      // 41: getstatic al9._du Lsjk;
      // 44: if_acmpeq 70
      // 47: goto 4e
      // 4a: invokestatic akr.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield akr.f8j Lal9;
      // 52: iload 3
      // 53: invokevirtual al9.i37 (I)Lsjk;
      // 56: goto 5d
      // 59: invokestatic akr.a (Loov;)Loov;
      // 5c: athrow
      // 5d: invokeinterface sjk.v4p ()Z 1
      // 62: iload 2
      // 63: ifeq 79
      // 66: ifne 78
      // 69: goto 70
      // 6c: invokestatic akr.a (Loov;)Loov;
      // 6f: athrow
      // 70: iload 3
      // 71: iload 1
      // 72: iadd
      // 73: istore 3
      // 74: iload 2
      // 75: ifne 0e
      // 78: iload 3
      // 79: iload 2
      // 7a: ifeq 88
      // 7d: iflt a3
      // 80: goto 87
      // 83: invokestatic akr.a (Loov;)Loov;
      // 86: athrow
      // 87: iload 3
      // 88: bipush 8
      // 8a: if_icmpgt a3
      // 8d: aload 0
      // 8e: getfield akr.f8j Lal9;
      // 91: iload 3
      // 92: invokevirtual al9.o4o (I)V
      // 95: aload 0
      // 96: invokestatic Minecraft.qgs ()J
      // 99: putfield akr.nmo J
      // 9c: goto a3
      // 9f: invokestatic akr.a (Loov;)Loov;
      // a2: athrow
      // a3: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void wrb() {
      int var1 = OpaquePredicate.c();

      akr var10000;
      label54: {
         label49: {
            try {
               this.nmo = Minecraft.qgs();
               var10000 = this;
               if (var1 != 0) {
                  break label54;
               }

               if (!this.e1e()) {
                  break label49;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            int var2 = this.f8j.q_4();

            try {
               if (var2 != -1) {
                  this.f8j.o4o(var2);
               }
            } catch (oov var3) {
               throw a(var3);
            }

            try {
               if (var1 == 0) {
                  return;
               }
            } catch (oov var5) {
               boolean var10001 = false;
               throw a(var5);
            }
         }

         try {
            var10000 = this;
         } catch (oov var4) {
            boolean var8 = false;
            throw a(var4);
         }
      }

      var10000.f8j = new al9(this);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4244161520472991969L, 6754370860738977570L, MethodHandles.lookup().lookupClass()).a(140159059394865L);
      // $VF: monitorexit
      long var10 = var10000 ^ 55490770957821L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "DÞÌ\u0084\u0096\u0087\u0094÷Â\u0003\fà¿ýYL4+¿×\u0018\\\\Ðc¾eO^\r\u0088\u0096\u00908÷(Þ\n0Å DÞÌ\u0084\u0096\u0087\u0094÷E\u008dn\u0090úÐËa\u0015ÂL¶õÅ\u009cï\u008dËã\u0001r×©\u0005";
      int var7 = "DÞÌ\u0084\u0096\u0087\u0094÷Â\u0003\fà¿ýYL4+¿×\u0018\\\\Ðc¾eO^\r\u0088\u0096\u00908÷(Þ\n0Å DÞÌ\u0084\u0096\u0087\u0094÷E\u008dn\u0090úÐËa\u0015ÂL¶õÅ\u009cï\u008dËã\u0001r×©\u0005"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = a(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            wdc = new gdz(var8[1]);
            _rg = new gdz(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
