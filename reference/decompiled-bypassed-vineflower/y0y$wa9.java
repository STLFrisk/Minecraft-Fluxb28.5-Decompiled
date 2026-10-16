import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class y0y$wa9 {
   private final t9d rsd;
   private final mew ugy;
   private final y0y mif;
   private zfz yx7;
   private final boolean pup;
   private final List kpc;
   public final y0y p42;

   public y0y$wa9(y0y var1, t9d var2, mew var3, zfz var4) {
      this.p42 = var1;
      this.kpc = Lists.newArrayList();
      this.rsd = var2;
      this.ugy = var3;
      this.yx7 = var4;
      this.mif = (y0y)var4.r_y();
      y0y$_zr var5 = (y0y$_zr)var4.dil(var1.fvr());
      this.pup = this.mif.dqe;
      this.c5o(var5);
   }

   private void c5o(y0y$_zr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield y0y$wa9.kpc Ljava/util/List;
      // 008: invokeinterface java/util/List.clear ()V 1
      // 00d: getstatic y0y$1.kwp [I
      // 010: aload 1
      // 011: invokevirtual y0y$_zr.ordinal ()I
      // 014: iaload
      // 015: iload 2
      // 016: ifeq 07c
      // 019: tableswitch 517 1 10 59 104 149 197 245 293 341 386 431 476
      // 050: invokestatic y0y$wa9.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: getfield y0y$wa9.kpc Ljava/util/List;
      // 058: aload 0
      // 059: getfield y0y$wa9.ugy Lmew;
      // 05c: invokevirtual mew.idu ()Lmew;
      // 05f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 064: pop
      // 065: aload 0
      // 066: getfield y0y$wa9.kpc Ljava/util/List;
      // 069: aload 0
      // 06a: getfield y0y$wa9.ugy Lmew;
      // 06d: invokevirtual mew.z6x ()Lmew;
      // 070: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 075: goto 07c
      // 078: invokestatic y0y$wa9.a (Loov;)Loov;
      // 07b: athrow
      // 07c: pop
      // 07d: iload 2
      // 07e: ifne 21e
      // 081: aload 0
      // 082: getfield y0y$wa9.kpc Ljava/util/List;
      // 085: aload 0
      // 086: getfield y0y$wa9.ugy Lmew;
      // 089: invokevirtual mew.y8e ()Lmew;
      // 08c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 091: pop
      // 092: aload 0
      // 093: getfield y0y$wa9.kpc Ljava/util/List;
      // 096: aload 0
      // 097: getfield y0y$wa9.ugy Lmew;
      // 09a: invokevirtual mew.o_8 ()Lmew;
      // 09d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a2: pop
      // 0a3: iload 2
      // 0a4: ifne 21e
      // 0a7: goto 0ae
      // 0aa: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield y0y$wa9.kpc Ljava/util/List;
      // 0b2: aload 0
      // 0b3: getfield y0y$wa9.ugy Lmew;
      // 0b6: invokevirtual mew.y8e ()Lmew;
      // 0b9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0be: pop
      // 0bf: aload 0
      // 0c0: getfield y0y$wa9.kpc Ljava/util/List;
      // 0c3: aload 0
      // 0c4: getfield y0y$wa9.ugy Lmew;
      // 0c7: invokevirtual mew.o_8 ()Lmew;
      // 0ca: invokevirtual mew.nuv ()Lmew;
      // 0cd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0d2: pop
      // 0d3: iload 2
      // 0d4: ifne 21e
      // 0d7: goto 0de
      // 0da: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield y0y$wa9.kpc Ljava/util/List;
      // 0e2: aload 0
      // 0e3: getfield y0y$wa9.ugy Lmew;
      // 0e6: invokevirtual mew.y8e ()Lmew;
      // 0e9: invokevirtual mew.nuv ()Lmew;
      // 0ec: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f1: pop
      // 0f2: aload 0
      // 0f3: getfield y0y$wa9.kpc Ljava/util/List;
      // 0f6: aload 0
      // 0f7: getfield y0y$wa9.ugy Lmew;
      // 0fa: invokevirtual mew.o_8 ()Lmew;
      // 0fd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 102: pop
      // 103: iload 2
      // 104: ifne 21e
      // 107: goto 10e
      // 10a: invokestatic y0y$wa9.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 0
      // 10f: getfield y0y$wa9.kpc Ljava/util/List;
      // 112: aload 0
      // 113: getfield y0y$wa9.ugy Lmew;
      // 116: invokevirtual mew.idu ()Lmew;
      // 119: invokevirtual mew.nuv ()Lmew;
      // 11c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 121: pop
      // 122: aload 0
      // 123: getfield y0y$wa9.kpc Ljava/util/List;
      // 126: aload 0
      // 127: getfield y0y$wa9.ugy Lmew;
      // 12a: invokevirtual mew.z6x ()Lmew;
      // 12d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 132: pop
      // 133: iload 2
      // 134: ifne 21e
      // 137: goto 13e
      // 13a: invokestatic y0y$wa9.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: getfield y0y$wa9.kpc Ljava/util/List;
      // 142: aload 0
      // 143: getfield y0y$wa9.ugy Lmew;
      // 146: invokevirtual mew.idu ()Lmew;
      // 149: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14e: pop
      // 14f: aload 0
      // 150: getfield y0y$wa9.kpc Ljava/util/List;
      // 153: aload 0
      // 154: getfield y0y$wa9.ugy Lmew;
      // 157: invokevirtual mew.z6x ()Lmew;
      // 15a: invokevirtual mew.nuv ()Lmew;
      // 15d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 162: pop
      // 163: iload 2
      // 164: ifne 21e
      // 167: goto 16e
      // 16a: invokestatic y0y$wa9.a (Loov;)Loov;
      // 16d: athrow
      // 16e: aload 0
      // 16f: getfield y0y$wa9.kpc Ljava/util/List;
      // 172: aload 0
      // 173: getfield y0y$wa9.ugy Lmew;
      // 176: invokevirtual mew.o_8 ()Lmew;
      // 179: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 17e: pop
      // 17f: aload 0
      // 180: getfield y0y$wa9.kpc Ljava/util/List;
      // 183: aload 0
      // 184: getfield y0y$wa9.ugy Lmew;
      // 187: invokevirtual mew.z6x ()Lmew;
      // 18a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 18f: pop
      // 190: iload 2
      // 191: ifne 21e
      // 194: goto 19b
      // 197: invokestatic y0y$wa9.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 0
      // 19c: getfield y0y$wa9.kpc Ljava/util/List;
      // 19f: aload 0
      // 1a0: getfield y0y$wa9.ugy Lmew;
      // 1a3: invokevirtual mew.y8e ()Lmew;
      // 1a6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ab: pop
      // 1ac: aload 0
      // 1ad: getfield y0y$wa9.kpc Ljava/util/List;
      // 1b0: aload 0
      // 1b1: getfield y0y$wa9.ugy Lmew;
      // 1b4: invokevirtual mew.z6x ()Lmew;
      // 1b7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1bc: pop
      // 1bd: iload 2
      // 1be: ifne 21e
      // 1c1: goto 1c8
      // 1c4: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: aload 0
      // 1c9: getfield y0y$wa9.kpc Ljava/util/List;
      // 1cc: aload 0
      // 1cd: getfield y0y$wa9.ugy Lmew;
      // 1d0: invokevirtual mew.y8e ()Lmew;
      // 1d3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d8: pop
      // 1d9: aload 0
      // 1da: getfield y0y$wa9.kpc Ljava/util/List;
      // 1dd: aload 0
      // 1de: getfield y0y$wa9.ugy Lmew;
      // 1e1: invokevirtual mew.idu ()Lmew;
      // 1e4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1e9: pop
      // 1ea: iload 2
      // 1eb: ifne 21e
      // 1ee: goto 1f5
      // 1f1: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: aload 0
      // 1f6: getfield y0y$wa9.kpc Ljava/util/List;
      // 1f9: aload 0
      // 1fa: getfield y0y$wa9.ugy Lmew;
      // 1fd: invokevirtual mew.o_8 ()Lmew;
      // 200: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 205: pop
      // 206: aload 0
      // 207: getfield y0y$wa9.kpc Ljava/util/List;
      // 20a: aload 0
      // 20b: getfield y0y$wa9.ugy Lmew;
      // 20e: invokevirtual mew.idu ()Lmew;
      // 211: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 216: pop
      // 217: goto 21e
      // 21a: invokestatic y0y$wa9.a (Loov;)Loov;
      // 21d: athrow
      // 21e: return
   }

   private void ryc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield y0y$wa9.kpc Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 84
      // 13: aload 0
      // 14: aload 0
      // 15: getfield y0y$wa9.kpc Ljava/util/List;
      // 18: iload 2
      // 19: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1e: checkcast mew
      // 21: invokespecial y0y$wa9.w_l (Lmew;)Ly0y$wa9;
      // 24: astore 3
      // 25: aload 3
      // 26: iload 1
      // 27: ifeq 7c
      // 2a: ifnull 68
      // 2d: goto 34
      // 30: invokestatic y0y$wa9.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 3
      // 35: iload 1
      // 36: ifeq 7c
      // 39: goto 40
      // 3c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: invokespecial y0y$wa9.m5a (Ly0y$wa9;)Z
      // 44: ifeq 68
      // 47: goto 4e
      // 4a: invokestatic y0y$wa9.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield y0y$wa9.kpc Ljava/util/List;
      // 52: iload 2
      // 53: aload 3
      // 54: getfield y0y$wa9.ugy Lmew;
      // 57: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 5c: pop
      // 5d: iload 1
      // 5e: ifne 7d
      // 61: goto 68
      // 64: invokestatic y0y$wa9.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: getfield y0y$wa9.kpc Ljava/util/List;
      // 6c: iload 2
      // 6d: iinc 2 -1
      // 70: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 75: goto 7c
      // 78: invokestatic y0y$wa9.a (Loov;)Loov;
      // 7b: athrow
      // 7c: pop
      // 7d: iinc 2 1
      // 80: iload 1
      // 81: ifne 06
      // 84: return
   }

   private boolean uz0(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield y0y$wa9.rsd Lt9d;
      // 08: aload 1
      // 09: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 0c: iload 2
      // 0d: ifne 5b
      // 10: ifne 5a
      // 13: goto 1a
      // 16: invokestatic y0y$wa9.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield y0y$wa9.rsd Lt9d;
      // 1e: aload 1
      // 1f: invokevirtual mew.nuv ()Lmew;
      // 22: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 25: iload 2
      // 26: ifne 5b
      // 29: goto 30
      // 2c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifne 5a
      // 33: goto 3a
      // 36: invokestatic y0y$wa9.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield y0y$wa9.rsd Lt9d;
      // 3e: aload 1
      // 3f: invokevirtual mew.eve ()Lmew;
      // 42: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 45: iload 2
      // 46: ifne 5b
      // 49: goto 50
      // 4c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 4f: athrow
      // 50: ifeq 5e
      // 53: goto 5a
      // 56: invokestatic y0y$wa9.a (Loov;)Loov;
      // 59: athrow
      // 5a: bipush 1
      // 5b: goto 5f
      // 5e: bipush 0
      // 5f: ireturn
   }

   private y0y$wa9 w_l(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield y0y$wa9.rsd Lt9d;
      // 08: aload 1
      // 09: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c: astore 3
      // 0d: aload 3
      // 0e: invokestatic y0y.al_ (Lzfz;)Z
      // 11: ifeq 2f
      // 14: new y0y$wa9
      // 17: dup
      // 18: aload 0
      // 19: getfield y0y$wa9.p42 Ly0y;
      // 1c: dup
      // 1d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 20: pop
      // 21: aload 0
      // 22: getfield y0y$wa9.rsd Lt9d;
      // 25: aload 1
      // 26: aload 3
      // 27: invokespecial y0y$wa9.<init> (Ly0y;Lt9d;Lmew;Lzfz;)V
      // 2a: areturn
      // 2b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual mew.nuv ()Lmew;
      // 33: astore 4
      // 35: aload 0
      // 36: getfield y0y$wa9.rsd Lt9d;
      // 39: aload 4
      // 3b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3e: astore 3
      // 3f: aload 3
      // 40: invokestatic y0y.al_ (Lzfz;)Z
      // 43: iload 2
      // 44: ifeq 85
      // 47: ifeq 6d
      // 4a: goto 51
      // 4d: invokestatic y0y$wa9.a (Loov;)Loov;
      // 50: athrow
      // 51: new y0y$wa9
      // 54: dup
      // 55: aload 0
      // 56: getfield y0y$wa9.p42 Ly0y;
      // 59: dup
      // 5a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 5d: pop
      // 5e: aload 0
      // 5f: getfield y0y$wa9.rsd Lt9d;
      // 62: aload 4
      // 64: aload 3
      // 65: invokespecial y0y$wa9.<init> (Ly0y;Lt9d;Lmew;Lzfz;)V
      // 68: areturn
      // 69: invokestatic y0y$wa9.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 1
      // 6e: invokevirtual mew.eve ()Lmew;
      // 71: astore 4
      // 73: aload 0
      // 74: iload 2
      // 75: ifeq a6
      // 78: getfield y0y$wa9.rsd Lt9d;
      // 7b: aload 4
      // 7d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 80: astore 3
      // 81: aload 3
      // 82: invokestatic y0y.al_ (Lzfz;)Z
      // 85: ifeq a9
      // 88: new y0y$wa9
      // 8b: dup
      // 8c: aload 0
      // 8d: getfield y0y$wa9.p42 Ly0y;
      // 90: dup
      // 91: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 94: pop
      // 95: aload 0
      // 96: getfield y0y$wa9.rsd Lt9d;
      // 99: aload 4
      // 9b: aload 3
      // 9c: invokespecial y0y$wa9.<init> (Ly0y;Lt9d;Lmew;Lzfz;)V
      // 9f: goto a6
      // a2: invokestatic y0y$wa9.a (Loov;)Loov;
      // a5: athrow
      // a6: goto aa
      // a9: aconst_null
      // aa: areturn
   }

   private boolean m5a(y0y$wa9 var1) {
      return this.mb1(var1.ugy);
   }

   private boolean mb1(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 0
      // 08: getfield y0y$wa9.kpc Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 72
      // 13: aload 0
      // 14: getfield y0y$wa9.kpc Ljava/util/List;
      // 17: iload 3
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast mew
      // 20: astore 4
      // 22: iload 2
      // 23: ifne 6e
      // 26: aload 4
      // 28: invokevirtual mew.getX ()I
      // 2b: iload 2
      // 2c: ifne 73
      // 2f: goto 36
      // 32: invokestatic y0y$wa9.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 1
      // 37: invokevirtual mew.getX ()I
      // 3a: if_icmpne 6b
      // 3d: goto 44
      // 40: invokestatic y0y$wa9.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 4
      // 46: invokevirtual mew.getZ ()I
      // 49: iload 2
      // 4a: ifne 6a
      // 4d: goto 54
      // 50: invokestatic y0y$wa9.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 1
      // 55: invokevirtual mew.getZ ()I
      // 58: if_icmpne 6b
      // 5b: goto 62
      // 5e: invokestatic y0y$wa9.a (Loov;)Loov;
      // 61: athrow
      // 62: bipush 1
      // 63: goto 6a
      // 66: invokestatic y0y$wa9.a (Loov;)Loov;
      // 69: athrow
      // 6a: ireturn
      // 6b: iinc 3 1
      // 6e: iload 2
      // 6f: ifeq 06
      // 72: bipush 0
      // 73: ireturn
   }

   public int bnc() {
      int var2 = 0;
      int var10000 = t9d.c();
      Iterator var3 = vt2$unz.fzl.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            vt2 var4 = (vt2)var3.next();

            label24: {
               try {
                  var10000 = this.uz0(this.ugy.offset(var4));
                  if (var1 != 0) {
                     break;
                  }

                  if (var10000 == 0) {
                     break label24;
                  }
               } catch (oov var5) {
                  throw a(var5);
               }

               var2++;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   private boolean mer(y0y$wa9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial y0y$wa9.m5a (Ly0y$wa9;)Z
      // 09: iload 2
      // 0a: ifne 3e
      // 0d: ifne 36
      // 10: goto 17
      // 13: invokestatic y0y$wa9.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield y0y$wa9.kpc Ljava/util/List;
      // 1b: invokeinterface java/util/List.size ()I 1
      // 20: iload 2
      // 21: ifne 3e
      // 24: goto 2b
      // 27: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 2
      // 2c: if_icmpeq 41
      // 2f: goto 36
      // 32: invokestatic y0y$wa9.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3e
      // 3a: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3d: athrow
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   private void lva(y0y$wa9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield y0y$wa9.kpc Ljava/util/List;
      // 004: aload 1
      // 005: getfield y0y$wa9.ugy Lmew;
      // 008: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 00d: pop
      // 00e: invokestatic t9d.b ()I
      // 011: aload 0
      // 012: getfield y0y$wa9.ugy Lmew;
      // 015: invokevirtual mew.idu ()Lmew;
      // 018: astore 3
      // 019: istore 2
      // 01a: aload 0
      // 01b: getfield y0y$wa9.ugy Lmew;
      // 01e: invokevirtual mew.z6x ()Lmew;
      // 021: astore 4
      // 023: aload 0
      // 024: getfield y0y$wa9.ugy Lmew;
      // 027: invokevirtual mew.y8e ()Lmew;
      // 02a: astore 5
      // 02c: aload 0
      // 02d: getfield y0y$wa9.ugy Lmew;
      // 030: invokevirtual mew.o_8 ()Lmew;
      // 033: astore 6
      // 035: aload 0
      // 036: aload 3
      // 037: invokespecial y0y$wa9.mb1 (Lmew;)Z
      // 03a: istore 7
      // 03c: aload 0
      // 03d: aload 4
      // 03f: invokespecial y0y$wa9.mb1 (Lmew;)Z
      // 042: istore 8
      // 044: aload 0
      // 045: aload 5
      // 047: invokespecial y0y$wa9.mb1 (Lmew;)Z
      // 04a: istore 9
      // 04c: aload 0
      // 04d: aload 6
      // 04f: invokespecial y0y$wa9.mb1 (Lmew;)Z
      // 052: istore 10
      // 054: aconst_null
      // 055: astore 11
      // 057: iload 7
      // 059: iload 2
      // 05a: ifeq 069
      // 05d: ifne 06c
      // 060: goto 067
      // 063: invokestatic y0y$wa9.a (Loov;)Loov;
      // 066: athrow
      // 067: iload 8
      // 069: ifeq 071
      // 06c: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 06f: astore 11
      // 071: iload 9
      // 073: iload 2
      // 074: ifeq 083
      // 077: ifne 091
      // 07a: goto 081
      // 07d: invokestatic y0y$wa9.a (Loov;)Loov;
      // 080: athrow
      // 081: iload 10
      // 083: iload 2
      // 084: ifeq 09a
      // 087: ifeq 096
      // 08a: goto 091
      // 08d: invokestatic y0y$wa9.a (Loov;)Loov;
      // 090: athrow
      // 091: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 094: astore 11
      // 096: aload 0
      // 097: getfield y0y$wa9.pup Z
      // 09a: iload 2
      // 09b: ifeq 0aa
      // 09e: ifne 1f0
      // 0a1: goto 0a8
      // 0a4: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: iload 8
      // 0aa: iload 2
      // 0ab: ifeq 104
      // 0ae: ifeq 102
      // 0b1: goto 0b8
      // 0b4: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: iload 10
      // 0ba: iload 2
      // 0bb: ifeq 104
      // 0be: goto 0c5
      // 0c1: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: ifeq 102
      // 0c8: goto 0cf
      // 0cb: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 7
      // 0d1: iload 2
      // 0d2: ifeq 104
      // 0d5: goto 0dc
      // 0d8: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: ifne 102
      // 0df: goto 0e6
      // 0e2: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: iload 9
      // 0e8: iload 2
      // 0e9: ifeq 104
      // 0ec: goto 0f3
      // 0ef: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: ifne 102
      // 0f6: goto 0fd
      // 0f9: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: getstatic y0y$_zr.cgq Ly0y$_zr;
      // 100: astore 11
      // 102: iload 8
      // 104: iload 2
      // 105: ifeq 15e
      // 108: ifeq 15c
      // 10b: goto 112
      // 10e: invokestatic y0y$wa9.a (Loov;)Loov;
      // 111: athrow
      // 112: iload 9
      // 114: iload 2
      // 115: ifeq 15e
      // 118: goto 11f
      // 11b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 11e: athrow
      // 11f: ifeq 15c
      // 122: goto 129
      // 125: invokestatic y0y$wa9.a (Loov;)Loov;
      // 128: athrow
      // 129: iload 7
      // 12b: iload 2
      // 12c: ifeq 15e
      // 12f: goto 136
      // 132: invokestatic y0y$wa9.a (Loov;)Loov;
      // 135: athrow
      // 136: ifne 15c
      // 139: goto 140
      // 13c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 13f: athrow
      // 140: iload 10
      // 142: iload 2
      // 143: ifeq 15e
      // 146: goto 14d
      // 149: invokestatic y0y$wa9.a (Loov;)Loov;
      // 14c: athrow
      // 14d: ifne 15c
      // 150: goto 157
      // 153: invokestatic y0y$wa9.a (Loov;)Loov;
      // 156: athrow
      // 157: getstatic y0y$_zr.fm2 Ly0y$_zr;
      // 15a: astore 11
      // 15c: iload 7
      // 15e: iload 2
      // 15f: ifeq 1b8
      // 162: ifeq 1b6
      // 165: goto 16c
      // 168: invokestatic y0y$wa9.a (Loov;)Loov;
      // 16b: athrow
      // 16c: iload 9
      // 16e: iload 2
      // 16f: ifeq 1b8
      // 172: goto 179
      // 175: invokestatic y0y$wa9.a (Loov;)Loov;
      // 178: athrow
      // 179: ifeq 1b6
      // 17c: goto 183
      // 17f: invokestatic y0y$wa9.a (Loov;)Loov;
      // 182: athrow
      // 183: iload 8
      // 185: iload 2
      // 186: ifeq 1b8
      // 189: goto 190
      // 18c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 18f: athrow
      // 190: ifne 1b6
      // 193: goto 19a
      // 196: invokestatic y0y$wa9.a (Loov;)Loov;
      // 199: athrow
      // 19a: iload 10
      // 19c: iload 2
      // 19d: ifeq 1b8
      // 1a0: goto 1a7
      // 1a3: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: ifne 1b6
      // 1aa: goto 1b1
      // 1ad: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: getstatic y0y$_zr.iy8 Ly0y$_zr;
      // 1b4: astore 11
      // 1b6: iload 7
      // 1b8: iload 2
      // 1b9: ifeq 1c8
      // 1bc: ifeq 1f0
      // 1bf: goto 1c6
      // 1c2: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: iload 10
      // 1c8: iload 2
      // 1c9: ifeq 1d8
      // 1cc: ifeq 1f0
      // 1cf: goto 1d6
      // 1d2: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1d5: athrow
      // 1d6: iload 8
      // 1d8: iload 2
      // 1d9: ifeq 1e8
      // 1dc: ifne 1f0
      // 1df: goto 1e6
      // 1e2: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: iload 9
      // 1e8: ifne 1f0
      // 1eb: getstatic y0y$_zr.miv Ly0y$_zr;
      // 1ee: astore 11
      // 1f0: aload 11
      // 1f2: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 1f5: iload 2
      // 1f6: ifeq 24c
      // 1f9: if_acmpne 23c
      // 1fc: goto 203
      // 1ff: invokestatic y0y$wa9.a (Loov;)Loov;
      // 202: athrow
      // 203: aload 0
      // 204: getfield y0y$wa9.rsd Lt9d;
      // 207: aload 3
      // 208: invokevirtual mew.nuv ()Lmew;
      // 20b: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 20e: iload 2
      // 20f: ifeq 234
      // 212: goto 219
      // 215: invokestatic y0y$wa9.a (Loov;)Loov;
      // 218: athrow
      // 219: ifeq 228
      // 21c: goto 223
      // 21f: invokestatic y0y$wa9.a (Loov;)Loov;
      // 222: athrow
      // 223: getstatic y0y$_zr.f3v Ly0y$_zr;
      // 226: astore 11
      // 228: aload 0
      // 229: getfield y0y$wa9.rsd Lt9d;
      // 22c: aload 4
      // 22e: invokevirtual mew.nuv ()Lmew;
      // 231: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 234: ifeq 23c
      // 237: getstatic y0y$_zr.gh0 Ly0y$_zr;
      // 23a: astore 11
      // 23c: aload 11
      // 23e: iload 2
      // 23f: ifeq 28b
      // 242: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 245: goto 24c
      // 248: invokestatic y0y$wa9.a (Loov;)Loov;
      // 24b: athrow
      // 24c: if_acmpne 289
      // 24f: aload 0
      // 250: getfield y0y$wa9.rsd Lt9d;
      // 253: aload 6
      // 255: invokevirtual mew.nuv ()Lmew;
      // 258: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 25b: iload 2
      // 25c: ifeq 281
      // 25f: goto 266
      // 262: invokestatic y0y$wa9.a (Loov;)Loov;
      // 265: athrow
      // 266: ifeq 275
      // 269: goto 270
      // 26c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 26f: athrow
      // 270: getstatic y0y$_zr.gt1 Ly0y$_zr;
      // 273: astore 11
      // 275: aload 0
      // 276: getfield y0y$wa9.rsd Lt9d;
      // 279: aload 5
      // 27b: invokevirtual mew.nuv ()Lmew;
      // 27e: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 281: ifeq 289
      // 284: getstatic y0y$_zr.xew Ly0y$_zr;
      // 287: astore 11
      // 289: aload 11
      // 28b: iload 2
      // 28c: ifeq 29c
      // 28f: ifnonnull 29e
      // 292: goto 299
      // 295: invokestatic y0y$wa9.a (Loov;)Loov;
      // 298: athrow
      // 299: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 29c: astore 11
      // 29e: aload 0
      // 29f: aload 0
      // 2a0: getfield y0y$wa9.yx7 Lzfz;
      // 2a3: aload 0
      // 2a4: getfield y0y$wa9.mif Ly0y;
      // 2a7: invokevirtual y0y.fvr ()Lxny;
      // 2aa: aload 11
      // 2ac: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2b1: putfield y0y$wa9.yx7 Lzfz;
      // 2b4: aload 0
      // 2b5: getfield y0y$wa9.rsd Lt9d;
      // 2b8: aload 0
      // 2b9: getfield y0y$wa9.ugy Lmew;
      // 2bc: aload 0
      // 2bd: getfield y0y$wa9.yx7 Lzfz;
      // 2c0: bipush 3
      // 2c1: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 2c4: pop
      // 2c5: return
   }

   private boolean b1_(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial y0y$wa9.w_l (Lmew;)Ly0y$wa9;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 24
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic y0y$wa9.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokespecial y0y$wa9.ryc ()V
      // 23: aload 3
      // 24: aload 0
      // 25: invokespecial y0y$wa9.mer (Ly0y$wa9;)Z
      // 28: ireturn
   }

   public y0y$wa9 dlk(boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield y0y$wa9.ugy Lmew;
      // 004: invokevirtual mew.idu ()Lmew;
      // 007: astore 4
      // 009: aload 0
      // 00a: getfield y0y$wa9.ugy Lmew;
      // 00d: invokevirtual mew.z6x ()Lmew;
      // 010: astore 5
      // 012: aload 0
      // 013: getfield y0y$wa9.ugy Lmew;
      // 016: invokevirtual mew.y8e ()Lmew;
      // 019: astore 6
      // 01b: aload 0
      // 01c: getfield y0y$wa9.ugy Lmew;
      // 01f: invokevirtual mew.o_8 ()Lmew;
      // 022: astore 7
      // 024: invokestatic t9d.c ()I
      // 027: aload 0
      // 028: aload 4
      // 02a: invokespecial y0y$wa9.b1_ (Lmew;)Z
      // 02d: istore 8
      // 02f: istore 3
      // 030: aload 0
      // 031: aload 5
      // 033: invokespecial y0y$wa9.b1_ (Lmew;)Z
      // 036: istore 9
      // 038: aload 0
      // 039: aload 6
      // 03b: invokespecial y0y$wa9.b1_ (Lmew;)Z
      // 03e: istore 10
      // 040: aload 0
      // 041: aload 7
      // 043: invokespecial y0y$wa9.b1_ (Lmew;)Z
      // 046: istore 11
      // 048: aconst_null
      // 049: astore 12
      // 04b: iload 8
      // 04d: iload 3
      // 04e: ifne 074
      // 051: ifne 072
      // 054: goto 05b
      // 057: invokestatic y0y$wa9.a (Loov;)Loov;
      // 05a: athrow
      // 05b: iload 9
      // 05d: iload 3
      // 05e: ifne 074
      // 061: goto 068
      // 064: invokestatic y0y$wa9.a (Loov;)Loov;
      // 067: athrow
      // 068: ifeq 08c
      // 06b: goto 072
      // 06e: invokestatic y0y$wa9.a (Loov;)Loov;
      // 071: athrow
      // 072: iload 10
      // 074: iload 3
      // 075: ifne 084
      // 078: ifne 08c
      // 07b: goto 082
      // 07e: invokestatic y0y$wa9.a (Loov;)Loov;
      // 081: athrow
      // 082: iload 11
      // 084: ifne 08c
      // 087: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 08a: astore 12
      // 08c: iload 10
      // 08e: iload 3
      // 08f: ifne 0b5
      // 092: ifne 0b3
      // 095: goto 09c
      // 098: invokestatic y0y$wa9.a (Loov;)Loov;
      // 09b: athrow
      // 09c: iload 11
      // 09e: iload 3
      // 09f: ifne 0e3
      // 0a2: goto 0a9
      // 0a5: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ifeq 0df
      // 0ac: goto 0b3
      // 0af: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: iload 8
      // 0b5: iload 3
      // 0b6: ifne 0e3
      // 0b9: ifne 0df
      // 0bc: goto 0c3
      // 0bf: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: iload 9
      // 0c5: iload 3
      // 0c6: ifne 0e3
      // 0c9: goto 0d0
      // 0cc: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: ifne 0df
      // 0d3: goto 0da
      // 0d6: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 0dd: astore 12
      // 0df: aload 0
      // 0e0: getfield y0y$wa9.pup Z
      // 0e3: iload 3
      // 0e4: ifne 0f3
      // 0e7: ifne 239
      // 0ea: goto 0f1
      // 0ed: invokestatic y0y$wa9.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 9
      // 0f3: iload 3
      // 0f4: ifne 14d
      // 0f7: ifeq 14b
      // 0fa: goto 101
      // 0fd: invokestatic y0y$wa9.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 11
      // 103: iload 3
      // 104: ifne 14d
      // 107: goto 10e
      // 10a: invokestatic y0y$wa9.a (Loov;)Loov;
      // 10d: athrow
      // 10e: ifeq 14b
      // 111: goto 118
      // 114: invokestatic y0y$wa9.a (Loov;)Loov;
      // 117: athrow
      // 118: iload 8
      // 11a: iload 3
      // 11b: ifne 14d
      // 11e: goto 125
      // 121: invokestatic y0y$wa9.a (Loov;)Loov;
      // 124: athrow
      // 125: ifne 14b
      // 128: goto 12f
      // 12b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 12e: athrow
      // 12f: iload 10
      // 131: iload 3
      // 132: ifne 14d
      // 135: goto 13c
      // 138: invokestatic y0y$wa9.a (Loov;)Loov;
      // 13b: athrow
      // 13c: ifne 14b
      // 13f: goto 146
      // 142: invokestatic y0y$wa9.a (Loov;)Loov;
      // 145: athrow
      // 146: getstatic y0y$_zr.cgq Ly0y$_zr;
      // 149: astore 12
      // 14b: iload 9
      // 14d: iload 3
      // 14e: ifne 1a7
      // 151: ifeq 1a5
      // 154: goto 15b
      // 157: invokestatic y0y$wa9.a (Loov;)Loov;
      // 15a: athrow
      // 15b: iload 10
      // 15d: iload 3
      // 15e: ifne 1a7
      // 161: goto 168
      // 164: invokestatic y0y$wa9.a (Loov;)Loov;
      // 167: athrow
      // 168: ifeq 1a5
      // 16b: goto 172
      // 16e: invokestatic y0y$wa9.a (Loov;)Loov;
      // 171: athrow
      // 172: iload 8
      // 174: iload 3
      // 175: ifne 1a7
      // 178: goto 17f
      // 17b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 17e: athrow
      // 17f: ifne 1a5
      // 182: goto 189
      // 185: invokestatic y0y$wa9.a (Loov;)Loov;
      // 188: athrow
      // 189: iload 11
      // 18b: iload 3
      // 18c: ifne 1a7
      // 18f: goto 196
      // 192: invokestatic y0y$wa9.a (Loov;)Loov;
      // 195: athrow
      // 196: ifne 1a5
      // 199: goto 1a0
      // 19c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: getstatic y0y$_zr.fm2 Ly0y$_zr;
      // 1a3: astore 12
      // 1a5: iload 8
      // 1a7: iload 3
      // 1a8: ifne 201
      // 1ab: ifeq 1ff
      // 1ae: goto 1b5
      // 1b1: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: iload 10
      // 1b7: iload 3
      // 1b8: ifne 201
      // 1bb: goto 1c2
      // 1be: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: ifeq 1ff
      // 1c5: goto 1cc
      // 1c8: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: iload 9
      // 1ce: iload 3
      // 1cf: ifne 201
      // 1d2: goto 1d9
      // 1d5: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: ifne 1ff
      // 1dc: goto 1e3
      // 1df: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: iload 11
      // 1e5: iload 3
      // 1e6: ifne 201
      // 1e9: goto 1f0
      // 1ec: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: ifne 1ff
      // 1f3: goto 1fa
      // 1f6: invokestatic y0y$wa9.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: getstatic y0y$_zr.iy8 Ly0y$_zr;
      // 1fd: astore 12
      // 1ff: iload 8
      // 201: iload 3
      // 202: ifne 211
      // 205: ifeq 239
      // 208: goto 20f
      // 20b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 20e: athrow
      // 20f: iload 11
      // 211: iload 3
      // 212: ifne 221
      // 215: ifeq 239
      // 218: goto 21f
      // 21b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 21e: athrow
      // 21f: iload 9
      // 221: iload 3
      // 222: ifne 231
      // 225: ifne 239
      // 228: goto 22f
      // 22b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 22e: athrow
      // 22f: iload 10
      // 231: ifne 239
      // 234: getstatic y0y$_zr.miv Ly0y$_zr;
      // 237: astore 12
      // 239: aload 12
      // 23b: iload 3
      // 23c: ifne 40b
      // 23f: ifnonnull 409
      // 242: goto 249
      // 245: invokestatic y0y$wa9.a (Loov;)Loov;
      // 248: athrow
      // 249: iload 8
      // 24b: iload 3
      // 24c: ifne 262
      // 24f: goto 256
      // 252: invokestatic y0y$wa9.a (Loov;)Loov;
      // 255: athrow
      // 256: ifne 270
      // 259: goto 260
      // 25c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 25f: athrow
      // 260: iload 9
      // 262: iload 3
      // 263: ifne 277
      // 266: ifeq 275
      // 269: goto 270
      // 26c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 26f: athrow
      // 270: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 273: astore 12
      // 275: iload 10
      // 277: iload 3
      // 278: ifne 287
      // 27b: ifne 295
      // 27e: goto 285
      // 281: invokestatic y0y$wa9.a (Loov;)Loov;
      // 284: athrow
      // 285: iload 11
      // 287: iload 3
      // 288: ifne 29e
      // 28b: ifeq 29a
      // 28e: goto 295
      // 291: invokestatic y0y$wa9.a (Loov;)Loov;
      // 294: athrow
      // 295: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 298: astore 12
      // 29a: aload 0
      // 29b: getfield y0y$wa9.pup Z
      // 29e: iload 3
      // 29f: ifne 2ad
      // 2a2: ifne 409
      // 2a5: goto 2ac
      // 2a8: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: iload 1
      // 2ad: iload 3
      // 2ae: ifne 36d
      // 2b1: ifeq 364
      // 2b4: goto 2bb
      // 2b7: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: iload 9
      // 2bd: iload 3
      // 2be: ifne 2f0
      // 2c1: goto 2c8
      // 2c4: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2c7: athrow
      // 2c8: ifeq 2ee
      // 2cb: goto 2d2
      // 2ce: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2d1: athrow
      // 2d2: iload 11
      // 2d4: iload 3
      // 2d5: ifne 2f0
      // 2d8: goto 2df
      // 2db: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2de: athrow
      // 2df: ifeq 2ee
      // 2e2: goto 2e9
      // 2e5: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: getstatic y0y$_zr.cgq Ly0y$_zr;
      // 2ec: astore 12
      // 2ee: iload 10
      // 2f0: iload 3
      // 2f1: ifne 31c
      // 2f4: ifeq 31a
      // 2f7: goto 2fe
      // 2fa: invokestatic y0y$wa9.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: iload 9
      // 300: iload 3
      // 301: ifne 31c
      // 304: goto 30b
      // 307: invokestatic y0y$wa9.a (Loov;)Loov;
      // 30a: athrow
      // 30b: ifeq 31a
      // 30e: goto 315
      // 311: invokestatic y0y$wa9.a (Loov;)Loov;
      // 314: athrow
      // 315: getstatic y0y$_zr.fm2 Ly0y$_zr;
      // 318: astore 12
      // 31a: iload 11
      // 31c: iload 3
      // 31d: ifne 348
      // 320: ifeq 346
      // 323: goto 32a
      // 326: invokestatic y0y$wa9.a (Loov;)Loov;
      // 329: athrow
      // 32a: iload 8
      // 32c: iload 3
      // 32d: ifne 348
      // 330: goto 337
      // 333: invokestatic y0y$wa9.a (Loov;)Loov;
      // 336: athrow
      // 337: ifeq 346
      // 33a: goto 341
      // 33d: invokestatic y0y$wa9.a (Loov;)Loov;
      // 340: athrow
      // 341: getstatic y0y$_zr.miv Ly0y$_zr;
      // 344: astore 12
      // 346: iload 8
      // 348: iload 3
      // 349: ifne 358
      // 34c: ifeq 409
      // 34f: goto 356
      // 352: invokestatic y0y$wa9.a (Loov;)Loov;
      // 355: athrow
      // 356: iload 10
      // 358: ifeq 409
      // 35b: getstatic y0y$_zr.iy8 Ly0y$_zr;
      // 35e: astore 12
      // 360: iload 3
      // 361: ifeq 409
      // 364: iload 8
      // 366: goto 36d
      // 369: invokestatic y0y$wa9.a (Loov;)Loov;
      // 36c: athrow
      // 36d: iload 3
      // 36e: ifne 399
      // 371: ifeq 397
      // 374: goto 37b
      // 377: invokestatic y0y$wa9.a (Loov;)Loov;
      // 37a: athrow
      // 37b: iload 10
      // 37d: iload 3
      // 37e: ifne 399
      // 381: goto 388
      // 384: invokestatic y0y$wa9.a (Loov;)Loov;
      // 387: athrow
      // 388: ifeq 397
      // 38b: goto 392
      // 38e: invokestatic y0y$wa9.a (Loov;)Loov;
      // 391: athrow
      // 392: getstatic y0y$_zr.iy8 Ly0y$_zr;
      // 395: astore 12
      // 397: iload 11
      // 399: iload 3
      // 39a: ifne 3c5
      // 39d: ifeq 3c3
      // 3a0: goto 3a7
      // 3a3: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3a6: athrow
      // 3a7: iload 8
      // 3a9: iload 3
      // 3aa: ifne 3c5
      // 3ad: goto 3b4
      // 3b0: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3b3: athrow
      // 3b4: ifeq 3c3
      // 3b7: goto 3be
      // 3ba: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: getstatic y0y$_zr.miv Ly0y$_zr;
      // 3c1: astore 12
      // 3c3: iload 10
      // 3c5: iload 3
      // 3c6: ifne 3f1
      // 3c9: ifeq 3ef
      // 3cc: goto 3d3
      // 3cf: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3d2: athrow
      // 3d3: iload 9
      // 3d5: iload 3
      // 3d6: ifne 3f1
      // 3d9: goto 3e0
      // 3dc: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3df: athrow
      // 3e0: ifeq 3ef
      // 3e3: goto 3ea
      // 3e6: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3e9: athrow
      // 3ea: getstatic y0y$_zr.fm2 Ly0y$_zr;
      // 3ed: astore 12
      // 3ef: iload 9
      // 3f1: iload 3
      // 3f2: ifne 401
      // 3f5: ifeq 409
      // 3f8: goto 3ff
      // 3fb: invokestatic y0y$wa9.a (Loov;)Loov;
      // 3fe: athrow
      // 3ff: iload 11
      // 401: ifeq 409
      // 404: getstatic y0y$_zr.cgq Ly0y$_zr;
      // 407: astore 12
      // 409: aload 12
      // 40b: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 40e: iload 3
      // 40f: ifne 466
      // 412: if_acmpne 456
      // 415: goto 41c
      // 418: invokestatic y0y$wa9.a (Loov;)Loov;
      // 41b: athrow
      // 41c: aload 0
      // 41d: getfield y0y$wa9.rsd Lt9d;
      // 420: aload 4
      // 422: invokevirtual mew.nuv ()Lmew;
      // 425: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 428: iload 3
      // 429: ifne 44e
      // 42c: goto 433
      // 42f: invokestatic y0y$wa9.a (Loov;)Loov;
      // 432: athrow
      // 433: ifeq 442
      // 436: goto 43d
      // 439: invokestatic y0y$wa9.a (Loov;)Loov;
      // 43c: athrow
      // 43d: getstatic y0y$_zr.f3v Ly0y$_zr;
      // 440: astore 12
      // 442: aload 0
      // 443: getfield y0y$wa9.rsd Lt9d;
      // 446: aload 5
      // 448: invokevirtual mew.nuv ()Lmew;
      // 44b: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 44e: ifeq 456
      // 451: getstatic y0y$_zr.gh0 Ly0y$_zr;
      // 454: astore 12
      // 456: aload 12
      // 458: iload 3
      // 459: ifne 4a5
      // 45c: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 45f: goto 466
      // 462: invokestatic y0y$wa9.a (Loov;)Loov;
      // 465: athrow
      // 466: if_acmpne 4a3
      // 469: aload 0
      // 46a: getfield y0y$wa9.rsd Lt9d;
      // 46d: aload 7
      // 46f: invokevirtual mew.nuv ()Lmew;
      // 472: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 475: iload 3
      // 476: ifne 49b
      // 479: goto 480
      // 47c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 47f: athrow
      // 480: ifeq 48f
      // 483: goto 48a
      // 486: invokestatic y0y$wa9.a (Loov;)Loov;
      // 489: athrow
      // 48a: getstatic y0y$_zr.gt1 Ly0y$_zr;
      // 48d: astore 12
      // 48f: aload 0
      // 490: getfield y0y$wa9.rsd Lt9d;
      // 493: aload 6
      // 495: invokevirtual mew.nuv ()Lmew;
      // 498: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 49b: ifeq 4a3
      // 49e: getstatic y0y$_zr.xew Ly0y$_zr;
      // 4a1: astore 12
      // 4a3: aload 12
      // 4a5: iload 3
      // 4a6: ifne 4b6
      // 4a9: ifnonnull 4b8
      // 4ac: goto 4b3
      // 4af: invokestatic y0y$wa9.a (Loov;)Loov;
      // 4b2: athrow
      // 4b3: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 4b6: astore 12
      // 4b8: aload 0
      // 4b9: aload 12
      // 4bb: invokespecial y0y$wa9.c5o (Ly0y$_zr;)V
      // 4be: aload 0
      // 4bf: aload 0
      // 4c0: getfield y0y$wa9.yx7 Lzfz;
      // 4c3: aload 0
      // 4c4: getfield y0y$wa9.mif Ly0y;
      // 4c7: invokevirtual y0y.fvr ()Lxny;
      // 4ca: aload 12
      // 4cc: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4d1: putfield y0y$wa9.yx7 Lzfz;
      // 4d4: iload 2
      // 4d5: iload 3
      // 4d6: ifne 520
      // 4d9: ifne 507
      // 4dc: goto 4e3
      // 4df: invokestatic y0y$wa9.a (Loov;)Loov;
      // 4e2: athrow
      // 4e3: aload 0
      // 4e4: iload 3
      // 4e5: ifne 594
      // 4e8: goto 4ef
      // 4eb: invokestatic y0y$wa9.a (Loov;)Loov;
      // 4ee: athrow
      // 4ef: getfield y0y$wa9.rsd Lt9d;
      // 4f2: aload 0
      // 4f3: getfield y0y$wa9.ugy Lmew;
      // 4f6: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4f9: aload 0
      // 4fa: getfield y0y$wa9.yx7 Lzfz;
      // 4fd: if_acmpeq 593
      // 500: goto 507
      // 503: invokestatic y0y$wa9.a (Loov;)Loov;
      // 506: athrow
      // 507: aload 0
      // 508: getfield y0y$wa9.rsd Lt9d;
      // 50b: aload 0
      // 50c: getfield y0y$wa9.ugy Lmew;
      // 50f: aload 0
      // 510: getfield y0y$wa9.yx7 Lzfz;
      // 513: bipush 3
      // 514: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 517: pop
      // 518: bipush 0
      // 519: goto 520
      // 51c: invokestatic y0y$wa9.a (Loov;)Loov;
      // 51f: athrow
      // 520: istore 13
      // 522: iload 13
      // 524: aload 0
      // 525: getfield y0y$wa9.kpc Ljava/util/List;
      // 528: invokeinterface java/util/List.size ()I 1
      // 52d: if_icmpge 593
      // 530: aload 0
      // 531: aload 0
      // 532: getfield y0y$wa9.kpc Ljava/util/List;
      // 535: iload 13
      // 537: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 53c: checkcast mew
      // 53f: invokespecial y0y$wa9.w_l (Lmew;)Ly0y$wa9;
      // 542: astore 14
      // 544: iload 3
      // 545: ifne 58f
      // 548: aload 14
      // 54a: iload 3
      // 54b: ifne 594
      // 54e: goto 555
      // 551: invokestatic y0y$wa9.a (Loov;)Loov;
      // 554: athrow
      // 555: ifnull 58c
      // 558: goto 55f
      // 55b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 55e: athrow
      // 55f: aload 14
      // 561: invokespecial y0y$wa9.ryc ()V
      // 564: iload 3
      // 565: ifne 58f
      // 568: goto 56f
      // 56b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 56e: athrow
      // 56f: aload 14
      // 571: aload 0
      // 572: invokespecial y0y$wa9.mer (Ly0y$wa9;)Z
      // 575: ifeq 58c
      // 578: goto 57f
      // 57b: invokestatic y0y$wa9.a (Loov;)Loov;
      // 57e: athrow
      // 57f: aload 14
      // 581: aload 0
      // 582: invokespecial y0y$wa9.lva (Ly0y$wa9;)V
      // 585: goto 58c
      // 588: invokestatic y0y$wa9.a (Loov;)Loov;
      // 58b: athrow
      // 58c: iinc 13 1
      // 58f: iload 3
      // 590: ifeq 522
      // 593: aload 0
      // 594: areturn
   }

   public zfz t9g() {
      return this.yx7;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
