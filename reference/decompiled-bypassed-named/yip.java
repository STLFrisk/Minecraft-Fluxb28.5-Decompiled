import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityFlowerPot;

public class yip extends rw8 {
   public static final _ku djo;
   public static final zb_ jt7;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public yip() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(jt7, yip$ob3.qbo).zvi(djo, 0));
      this.bf6();
   }

   @Override
   public String ieu() {
      long var1 = b ^ 107793937325938L;
      return orr.zgh(b<"w">(4186, 5236033055947523688L ^ var1));
   }

   @Override
   public void bf6() {
      float var1 = 0.375F;
      float var2 = var1 / 2.0F;
      this.xl4(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var1, 0.5F + var2);
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public int j24(m5n param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokeinterface m5n.getTileEntity (Lmew;)Lpyk; 2
      // 0c: astore 5
      // 0e: aload 5
      // 10: instanceof net/minecraft/tileentity/TileEntityFlowerPot
      // 13: iload 4
      // 15: ifne 53
      // 18: ifeq 50
      // 1b: goto 22
      // 1e: invokestatic yip.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 5
      // 24: checkcast net/minecraft/tileentity/TileEntityFlowerPot
      // 27: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 2a: astore 6
      // 2c: aload 6
      // 2e: instanceof gun
      // 31: iload 4
      // 33: ifne 53
      // 36: ifeq 50
      // 39: goto 40
      // 3c: invokestatic yip.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 6
      // 42: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 45: aload 1
      // 46: aload 2
      // 47: iload 3
      // 48: invokevirtual e0x.j24 (Lm5n;Lmew;I)I
      // 4b: ireturn
      // 4c: invokestatic yip.a (Loov;)Loov;
      // 4f: athrow
      // 50: ldc 16777215
      // 52: nop
      // 53: ireturn
   }

   @Override
   public boolean cl2(OpaquePredicate param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 9
      // 005: aload 4
      // 007: getfield ha9.up_ Ljnq;
      // 00a: invokevirtual jnq.dxs ()Lerg;
      // 00d: astore 10
      // 00f: aload 10
      // 011: iload 9
      // 013: ifeq 022
      // 016: ifnull 111
      // 019: goto 020
      // 01c: invokestatic yip.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 10
      // 022: invokevirtual erg.gn1 ()Lu7m;
      // 025: instanceof gun
      // 028: iload 9
      // 02a: ifeq 112
      // 02d: ifeq 111
      // 030: goto 037
      // 033: invokestatic yip.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: aload 1
      // 039: aload 2
      // 03a: invokespecial yip.kp6 (Lt9d;Lmew;)Lnet/minecraft/tileentity/TileEntityFlowerPot;
      // 03d: astore 11
      // 03f: aload 11
      // 041: iload 9
      // 043: ifeq 058
      // 046: ifnonnull 056
      // 049: goto 050
      // 04c: invokestatic yip.a (Loov;)Loov;
      // 04f: athrow
      // 050: bipush 0
      // 051: ireturn
      // 052: invokestatic yip.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 11
      // 058: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 05b: iload 9
      // 05d: ifeq 075
      // 060: ifnull 070
      // 063: goto 06a
      // 066: invokestatic yip.a (Loov;)Loov;
      // 069: athrow
      // 06a: bipush 0
      // 06b: ireturn
      // 06c: invokestatic yip.a (Loov;)Loov;
      // 06f: athrow
      // 070: aload 10
      // 072: invokevirtual erg.gn1 ()Lu7m;
      // 075: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 078: astore 12
      // 07a: aload 0
      // 07b: aload 12
      // 07d: aload 10
      // 07f: invokevirtual erg.j6_ ()I
      // 082: invokespecial yip.rhz (Le0x;I)Z
      // 085: iload 9
      // 087: ifeq 0c3
      // 08a: ifne 09a
      // 08d: goto 094
      // 090: invokestatic yip.a (Loov;)Loov;
      // 093: athrow
      // 094: bipush 0
      // 095: ireturn
      // 096: invokestatic yip.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 11
      // 09c: aload 10
      // 09e: invokevirtual erg.gn1 ()Lu7m;
      // 0a1: aload 10
      // 0a3: invokevirtual erg.j6_ ()I
      // 0a6: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.u29 (Lu7m;I)V
      // 0a9: aload 11
      // 0ab: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.r5t ()V
      // 0ae: aload 1
      // 0af: aload 2
      // 0b0: invokevirtual OpaquePredicate.nfo (Lmew;)V
      // 0b3: aload 4
      // 0b5: getstatic l9p.yd1 L_ss;
      // 0b8: invokevirtual ha9.aex (L_ss;)V
      // 0bb: aload 4
      // 0bd: getfield ha9.lls Lpj2;
      // 0c0: getfield pj2.g40 Z
      // 0c3: iload 9
      // 0c5: ifeq 110
      // 0c8: ifne 10f
      // 0cb: goto 0d2
      // 0ce: invokestatic yip.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 10
      // 0d4: dup
      // 0d5: getfield erg.qd2 I
      // 0d8: bipush 1
      // 0d9: isub
      // 0da: dup_x1
      // 0db: putfield erg.qd2 I
      // 0de: iload 9
      // 0e0: ifeq 110
      // 0e3: goto 0ea
      // 0e6: invokestatic yip.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: ifgt 10f
      // 0ed: goto 0f4
      // 0f0: invokestatic yip.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 4
      // 0f6: getfield ha9.up_ Ljnq;
      // 0f9: aload 4
      // 0fb: getfield ha9.up_ Ljnq;
      // 0fe: getfield jnq.nb5 I
      // 101: aconst_null
      // 102: checkcast erg
      // 105: invokevirtual jnq.cxl (ILerg;)V
      // 108: goto 10f
      // 10b: invokestatic yip.a (Loov;)Loov;
      // 10e: athrow
      // 10f: bipush 1
      // 110: ireturn
      // 111: bipush 0
      // 112: ireturn
   }

   private boolean rhz(e0x param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: getstatic ox_.qmk Lu5m;
      // 08: iload 3
      // 09: ifne 2c
      // 0c: if_acmpeq d4
      // 0f: goto 16
      // 12: invokestatic yip.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: iload 3
      // 18: ifne 30
      // 1b: goto 22
      // 1e: invokestatic yip.a (Loov;)Loov;
      // 21: athrow
      // 22: getstatic ox_.xq2 Lu5m;
      // 25: goto 2c
      // 28: invokestatic yip.a (Loov;)Loov;
      // 2b: athrow
      // 2c: if_acmpeq d4
      // 2f: aload 1
      // 30: iload 3
      // 31: ifne 49
      // 34: getstatic ox_.hio Lkuv;
      // 37: if_acmpeq d4
      // 3a: goto 41
      // 3d: invokestatic yip.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 1
      // 42: goto 49
      // 45: invokestatic yip.a (Loov;)Loov;
      // 48: athrow
      // 49: getstatic ox_.zml Lrrw;
      // 4c: iload 3
      // 4d: ifne 65
      // 50: if_acmpeq d4
      // 53: goto 5a
      // 56: invokestatic yip.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 1
      // 5b: getstatic ox_.ae9 Lrrw;
      // 5e: goto 65
      // 61: invokestatic yip.a (Loov;)Loov;
      // 64: athrow
      // 65: iload 3
      // 66: ifne 89
      // 69: if_acmpeq d4
      // 6c: goto 73
      // 6f: invokestatic yip.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 1
      // 74: iload 3
      // 75: ifne 8d
      // 78: goto 7f
      // 7b: invokestatic yip.a (Loov;)Loov;
      // 7e: athrow
      // 7f: getstatic ox_.t_k Le0x;
      // 82: goto 89
      // 85: invokestatic yip.a (Loov;)Loov;
      // 88: athrow
      // 89: if_acmpeq d4
      // 8c: aload 1
      // 8d: iload 3
      // 8e: ifne a6
      // 91: getstatic ox_.rx7 Lutc;
      // 94: if_acmpeq d4
      // 97: goto 9e
      // 9a: invokestatic yip.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 1
      // 9f: goto a6
      // a2: invokestatic yip.a (Loov;)Loov;
      // a5: athrow
      // a6: getstatic ox_._w6 Lrh2;
      // a9: if_acmpne d0
      // ac: iload 2
      // ad: iload 3
      // ae: ifne d1
      // b1: goto b8
      // b4: invokestatic yip.a (Loov;)Loov;
      // b7: athrow
      // b8: getstatic rh2$j7i.hqk Lrh2$j7i;
      // bb: invokevirtual rh2$j7i.sqd ()I
      // be: if_icmpne d0
      // c1: goto c8
      // c4: invokestatic yip.a (Loov;)Loov;
      // c7: athrow
      // c8: bipush 1
      // c9: goto d5
      // cc: invokestatic yip.a (Loov;)Loov;
      // cf: athrow
      // d0: bipush 0
      // d1: goto d5
      // d4: bipush 1
      // d5: ireturn
   }

   @Override
   public u7m su9(OpaquePredicate param1, mew param2) {
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
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial yip.kp6 (Lt9d;Lmew;)Lnet/minecraft/tileentity/TileEntityFlowerPot;
      // 0a: astore 4
      // 0c: aload 4
      // 0e: iload 3
      // 0f: ifne 1e
      // 12: ifnull 3e
      // 15: goto 1c
      // 18: invokestatic yip.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 4
      // 1e: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 21: iload 3
      // 22: ifne 3b
      // 25: ifnull 3e
      // 28: goto 2f
      // 2b: invokestatic yip.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 4
      // 31: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 34: goto 3b
      // 37: invokestatic yip.a (Loov;)Loov;
      // 3a: athrow
      // 3b: goto 41
      // 3e: getstatic xbr.zgb Lu7m;
      // 41: areturn
   }

   @Override
   public int qu2(OpaquePredicate param1, mew param2) {
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
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial yip.kp6 (Lt9d;Lmew;)Lnet/minecraft/tileentity/TileEntityFlowerPot;
      // 0a: astore 4
      // 0c: aload 4
      // 0e: iload 3
      // 0f: ifne 1e
      // 12: ifnull 3e
      // 15: goto 1c
      // 18: invokestatic yip.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 4
      // 1e: iload 3
      // 1f: ifne 38
      // 22: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 25: ifnull 3e
      // 28: goto 2f
      // 2b: invokestatic yip.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 4
      // 31: goto 38
      // 34: invokestatic yip.a (Loov;)Loov;
      // 37: athrow
      // 38: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.gz_ ()I
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   @Override
   public boolean o9x() {
      return true;
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
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
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial rw8.ctq (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifne 27
      // 0e: ifeq 39
      // 11: goto 18
      // 14: invokestatic yip.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: invokevirtual mew.eve ()Lmew;
      // 1d: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 20: goto 27
      // 23: invokestatic yip.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 3
      // 28: ifne 36
      // 2b: ifeq 39
      // 2e: goto 35
      // 31: invokestatic yip.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual mew.eve ()Lmew;
      // 0a: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 0d: iload 5
      // 0f: ifne 30
      // 12: ifne 31
      // 15: goto 1c
      // 18: invokestatic yip.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 2
      // 1f: aload 3
      // 20: bipush 0
      // 21: invokevirtual yip.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 24: aload 1
      // 25: aload 2
      // 26: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 29: goto 30
      // 2c: invokestatic yip.a (Loov;)Loov;
      // 2f: athrow
      // 30: pop
      // 31: return
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokespecial yip.kp6 (Lt9d;Lmew;)Lnet/minecraft/tileentity/TileEntityFlowerPot;
      // 0b: astore 5
      // 0d: iload 4
      // 0f: ifeq 52
      // 12: aload 5
      // 14: ifnull 4b
      // 17: goto 1e
      // 1a: invokestatic yip.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 5
      // 20: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 23: ifnull 4b
      // 26: goto 2d
      // 29: invokestatic yip.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: aload 2
      // 2f: new erg
      // 32: dup
      // 33: aload 5
      // 35: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 38: bipush 1
      // 39: aload 5
      // 3b: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.gz_ ()I
      // 3e: invokespecial erg.<init> (Lu7m;II)V
      // 41: invokestatic yip.ymu (Lt9d;Lmew;Lerg;)V
      // 44: goto 4b
      // 47: invokestatic yip.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 1
      // 4d: aload 2
      // 4e: aload 3
      // 4f: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // 52: return
   }

   @Override
   public void f51(OpaquePredicate param1, mew param2, zfz param3, ha9 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: iload 5
      // 0a: ifeq 2f
      // 0d: aload 3
      // 0e: aload 4
      // 10: invokespecial rw8.f51 (Lt9d;Lmew;Lzfz;Lha9;)V
      // 13: aload 4
      // 15: getfield ha9.lls Lpj2;
      // 18: getfield pj2.g40 Z
      // 1b: ifeq 4f
      // 1e: goto 25
      // 21: invokestatic yip.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: aload 2
      // 28: goto 2f
      // 2b: invokestatic yip.a (Loov;)Loov;
      // 2e: athrow
      // 2f: invokespecial yip.kp6 (Lt9d;Lmew;)Lnet/minecraft/tileentity/TileEntityFlowerPot;
      // 32: astore 6
      // 34: aload 6
      // 36: iload 5
      // 38: ifeq 47
      // 3b: ifnull 4f
      // 3e: goto 45
      // 41: invokestatic yip.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 6
      // 47: aconst_null
      // 48: checkcast u7m
      // 4b: bipush 0
      // 4c: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.u29 (Lu7m;I)V
      // 4f: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.zgb;
   }

   private TileEntityFlowerPot kp6(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 09: astore 4
      // 0b: aload 4
      // 0d: iload 3
      // 0e: ifne 27
      // 11: instanceof net/minecraft/tileentity/TileEntityFlowerPot
      // 14: ifeq 2d
      // 17: goto 1e
      // 1a: invokestatic yip.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 4
      // 20: goto 27
      // 23: invokestatic yip.a (Loov;)Loov;
      // 26: athrow
      // 27: checkcast net/minecraft/tileentity/TileEntityFlowerPot
      // 2a: goto 2e
      // 2d: aconst_null
      // 2e: areturn
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      Object var3 = null;
      int var4 = 0;
      switch (var2) {
         case 1:
            var3 = ox_.xq2;
            var4 = u5m$cco.gye.uzp();
            break;
         case 2:
            var3 = ox_.qmk;
            break;
         case 3:
            var3 = ox_.t_k;
            var4 = x54$lti.mdr.h8z();
            break;
         case 4:
            var3 = ox_.t_k;
            var4 = x54$lti.b4p.h8z();
            break;
         case 5:
            var3 = ox_.t_k;
            var4 = x54$lti.yk5.h8z();
            break;
         case 6:
            var3 = ox_.t_k;
            var4 = x54$lti.jnw.h8z();
            break;
         case 7:
            var3 = ox_.ae9;
            break;
         case 8:
            var3 = ox_.zml;
            break;
         case 9:
            var3 = ox_.hio;
            break;
         case 10:
            var3 = ox_.rx7;
            break;
         case 11:
            var3 = ox_._w6;
            var4 = rh2$j7i.hqk.sqd();
            break;
         case 12:
            var3 = ox_.t_k;
            var4 = x54$lti.y2x.h8z();
            break;
         case 13:
            var3 = ox_.t_k;
            var4 = x54$lti.jtj.h8z();
      }

      return new TileEntityFlowerPot(u7m.gfm((e0x)var3), var4);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{jt7, djo});
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(djo);
   }

   @Override
   public zfz w1b(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yip$ob3.qbo Lyip$ob3;
      // 003: astore 5
      // 005: invokestatic OpaquePredicate.b ()I
      // 008: aload 2
      // 009: aload 3
      // 00a: invokeinterface m5n.getTileEntity (Lmew;)Lpyk; 2
      // 00f: astore 6
      // 011: istore 4
      // 013: aload 6
      // 015: iload 4
      // 017: ifeq 030
      // 01a: instanceof net/minecraft/tileentity/TileEntityFlowerPot
      // 01d: ifeq 2bb
      // 020: goto 027
      // 023: invokestatic yip.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 6
      // 029: goto 030
      // 02c: invokestatic yip.a (Loov;)Loov;
      // 02f: athrow
      // 030: checkcast net/minecraft/tileentity/TileEntityFlowerPot
      // 033: astore 7
      // 035: aload 7
      // 037: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.j59 ()Lu7m;
      // 03a: astore 8
      // 03c: aload 8
      // 03e: instanceof gun
      // 041: iload 4
      // 043: ifeq 05c
      // 046: ifeq 2bb
      // 049: goto 050
      // 04c: invokestatic yip.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 7
      // 052: invokevirtual net/minecraft/tileentity/TileEntityFlowerPot.gz_ ()I
      // 055: goto 05c
      // 058: invokestatic yip.a (Loov;)Loov;
      // 05b: athrow
      // 05c: istore 9
      // 05e: aload 8
      // 060: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 063: astore 10
      // 065: aload 10
      // 067: iload 4
      // 069: ifeq 0ff
      // 06c: getstatic ox_.t_k Le0x;
      // 06f: if_acmpne 0f6
      // 072: goto 079
      // 075: invokestatic yip.a (Loov;)Loov;
      // 078: athrow
      // 079: getstatic yip$1.gmc [I
      // 07c: iload 9
      // 07e: invokestatic x54$lti.mhp (I)Lx54$lti;
      // 081: invokevirtual x54$lti.ordinal ()I
      // 084: iaload
      // 085: tableswitch 103 1 6 43 53 63 73 83 93
      // 0ac: invokestatic yip.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: getstatic yip$ob3._xk Lyip$ob3;
      // 0b3: astore 5
      // 0b5: iload 4
      // 0b7: ifne 2bb
      // 0ba: getstatic yip$ob3.fsm Lyip$ob3;
      // 0bd: astore 5
      // 0bf: iload 4
      // 0c1: ifne 2bb
      // 0c4: getstatic yip$ob3.del Lyip$ob3;
      // 0c7: astore 5
      // 0c9: iload 4
      // 0cb: ifne 2bb
      // 0ce: getstatic yip$ob3.d5a Lyip$ob3;
      // 0d1: astore 5
      // 0d3: iload 4
      // 0d5: ifne 2bb
      // 0d8: getstatic yip$ob3.ai9 Lyip$ob3;
      // 0db: astore 5
      // 0dd: iload 4
      // 0df: ifne 2bb
      // 0e2: getstatic yip$ob3.cyu Lyip$ob3;
      // 0e5: astore 5
      // 0e7: iload 4
      // 0e9: ifne 2bb
      // 0ec: getstatic yip$ob3.qbo Lyip$ob3;
      // 0ef: astore 5
      // 0f1: iload 4
      // 0f3: ifne 2bb
      // 0f6: aload 10
      // 0f8: goto 0ff
      // 0fb: invokestatic yip.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: iload 4
      // 101: ifeq 157
      // 104: getstatic ox_._w6 Lrh2;
      // 107: if_acmpne 14e
      // 10a: goto 111
      // 10d: invokestatic yip.a (Loov;)Loov;
      // 110: athrow
      // 111: iload 9
      // 113: lookupswitch 49 2 0 29 2 39
      // 12c: invokestatic yip.a (Loov;)Loov;
      // 12f: athrow
      // 130: getstatic yip$ob3.oul Lyip$ob3;
      // 133: astore 5
      // 135: iload 4
      // 137: ifne 2bb
      // 13a: getstatic yip$ob3.fmc Lyip$ob3;
      // 13d: astore 5
      // 13f: iload 4
      // 141: ifne 2bb
      // 144: getstatic yip$ob3.qbo Lyip$ob3;
      // 147: astore 5
      // 149: iload 4
      // 14b: ifne 2bb
      // 14e: aload 10
      // 150: goto 157
      // 153: invokestatic yip.a (Loov;)Loov;
      // 156: athrow
      // 157: getstatic ox_.qmk Lu5m;
      // 15a: iload 4
      // 15c: ifeq 17f
      // 15f: if_acmpne 173
      // 162: goto 169
      // 165: invokestatic yip.a (Loov;)Loov;
      // 168: athrow
      // 169: getstatic yip$ob3.w4k Lyip$ob3;
      // 16c: astore 5
      // 16e: iload 4
      // 170: ifne 2bb
      // 173: aload 10
      // 175: getstatic ox_.xq2 Lu5m;
      // 178: goto 17f
      // 17b: invokestatic yip.a (Loov;)Loov;
      // 17e: athrow
      // 17f: iload 4
      // 181: ifeq 244
      // 184: if_acmpne 238
      // 187: goto 18e
      // 18a: invokestatic yip.a (Loov;)Loov;
      // 18d: athrow
      // 18e: getstatic yip$1.vt5 [I
      // 191: getstatic u5m$bad.zvf Lu5m$bad;
      // 194: iload 9
      // 196: invokestatic u5m$cco.ndf (Lu5m$bad;I)Lu5m$cco;
      // 199: invokevirtual u5m$cco.ordinal ()I
      // 19c: iaload
      // 19d: tableswitch 145 1 9 55 65 75 85 95 105 115 125 135
      // 1d0: invokestatic yip.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: getstatic yip$ob3.m_1 Lyip$ob3;
      // 1d7: astore 5
      // 1d9: iload 4
      // 1db: ifne 2bb
      // 1de: getstatic yip$ob3.uq2 Lyip$ob3;
      // 1e1: astore 5
      // 1e3: iload 4
      // 1e5: ifne 2bb
      // 1e8: getstatic yip$ob3.ghq Lyip$ob3;
      // 1eb: astore 5
      // 1ed: iload 4
      // 1ef: ifne 2bb
      // 1f2: getstatic yip$ob3.rcj Lyip$ob3;
      // 1f5: astore 5
      // 1f7: iload 4
      // 1f9: ifne 2bb
      // 1fc: getstatic yip$ob3.nz5 Lyip$ob3;
      // 1ff: astore 5
      // 201: iload 4
      // 203: ifne 2bb
      // 206: getstatic yip$ob3.g3e Lyip$ob3;
      // 209: astore 5
      // 20b: iload 4
      // 20d: ifne 2bb
      // 210: getstatic yip$ob3.r5a Lyip$ob3;
      // 213: astore 5
      // 215: iload 4
      // 217: ifne 2bb
      // 21a: getstatic yip$ob3.nzp Lyip$ob3;
      // 21d: astore 5
      // 21f: iload 4
      // 221: ifne 2bb
      // 224: getstatic yip$ob3.hb3 Lyip$ob3;
      // 227: astore 5
      // 229: iload 4
      // 22b: ifne 2bb
      // 22e: getstatic yip$ob3.qbo Lyip$ob3;
      // 231: astore 5
      // 233: iload 4
      // 235: ifne 2bb
      // 238: aload 10
      // 23a: getstatic ox_.ae9 Lrrw;
      // 23d: goto 244
      // 240: invokestatic yip.a (Loov;)Loov;
      // 243: athrow
      // 244: iload 4
      // 246: ifeq 275
      // 249: if_acmpne 25d
      // 24c: goto 253
      // 24f: invokestatic yip.a (Loov;)Loov;
      // 252: athrow
      // 253: getstatic yip$ob3.rxd Lyip$ob3;
      // 256: astore 5
      // 258: iload 4
      // 25a: ifne 2bb
      // 25d: aload 10
      // 25f: iload 4
      // 261: ifeq 28b
      // 264: goto 26b
      // 267: invokestatic yip.a (Loov;)Loov;
      // 26a: athrow
      // 26b: getstatic ox_.zml Lrrw;
      // 26e: goto 275
      // 271: invokestatic yip.a (Loov;)Loov;
      // 274: athrow
      // 275: if_acmpne 282
      // 278: getstatic yip$ob3.k2r Lyip$ob3;
      // 27b: astore 5
      // 27d: iload 4
      // 27f: ifne 2bb
      // 282: aload 10
      // 284: goto 28b
      // 287: invokestatic yip.a (Loov;)Loov;
      // 28a: athrow
      // 28b: iload 4
      // 28d: ifeq 2b0
      // 290: getstatic ox_.rx7 Lutc;
      // 293: if_acmpne 2a7
      // 296: goto 29d
      // 299: invokestatic yip.a (Loov;)Loov;
      // 29c: athrow
      // 29d: getstatic yip$ob3.oul Lyip$ob3;
      // 2a0: astore 5
      // 2a2: iload 4
      // 2a4: ifne 2bb
      // 2a7: aload 10
      // 2a9: goto 2b0
      // 2ac: invokestatic yip.a (Loov;)Loov;
      // 2af: athrow
      // 2b0: getstatic ox_.hio Lkuv;
      // 2b3: if_acmpne 2bb
      // 2b6: getstatic yip$ob3.g31 Lyip$ob3;
      // 2b9: astore 5
      // 2bb: aload 1
      // 2bc: getstatic yip.jt7 Lzb_;
      // 2bf: aload 5
      // 2c1: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2c6: areturn
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1350533602359569435L, 8204901720228788852L, MethodHandles.lookup().lookupClass()).a(180432954151996L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 32092835719999L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u001cï\u009f4ôO\u0010\u00068\u00adðû\u0097Fssë}\u009b\u00advtö\u00156bÀ\u009arÒ\u0014\u000f Á§B§)á§\u0089'Ùo\u0015\u0007¶\u0007â_8=\u009aÐ®Ð\u008a\u0019²\u008bð!\u0003²\u001e0BûªbSº\u0001\u0091)¸Û¾^ö]\u009aDçÄ\u0002\u0095 #%£Ó\u001f\u007f\u0013¿\u008c³4F÷l2°\u001c³{Sù#\u007f\tZ²";
      int var6 = "\u001cï\u009f4ôO\u0010\u00068\u00adðû\u0097Fssë}\u009b\u00advtö\u00156bÀ\u009arÒ\u0014\u000f Á§B§)á§\u0089'Ùo\u0015\u0007¶\u0007â_8=\u009aÐ®Ð\u008a\u0019²\u008bð!\u0003²\u001e0BûªbSº\u0001\u0091)¸Û¾^ö]\u009aDçÄ\u0002\u0095 #%£Ó\u001f\u007f\u0013¿\u008c³4F÷l2°\u001c³{Sù#\u007f\tZ²"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            djo = _ku.wgl(b<"w">(10081, 3568309166453507357L ^ var9), 0, 15);
            jt7 = zb_.pq4(b<"w">(16953, 628774228907565124L ^ var9), yip$ob3.class);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11607;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("yip", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("yip" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
