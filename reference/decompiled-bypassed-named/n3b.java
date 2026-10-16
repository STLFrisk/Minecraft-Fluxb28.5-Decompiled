import java.util.Random;

public class n3b extends rrw implements jrp {
   public n3b() {
      float var1 = 0.2F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var1 * 2.0F, 0.5F + var1);
      this._p_(true);
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: aload 4
      // 007: bipush 25
      // 009: invokevirtual java/util/Random.nextInt (I)I
      // 00c: iload 5
      // 00e: ifne 01c
      // 011: ifne 16a
      // 014: goto 01b
      // 017: invokestatic n3b.a (Loov;)Loov;
      // 01a: athrow
      // 01b: bipush 5
      // 01c: istore 6
      // 01e: bipush 4
      // 01f: istore 7
      // 021: aload 2
      // 022: bipush -4
      // 024: bipush -1
      // 025: bipush -4
      // 027: invokevirtual mew.ec4 (III)Lmew;
      // 02a: aload 2
      // 02b: bipush 4
      // 02c: bipush 1
      // 02d: bipush 4
      // 02e: invokevirtual mew.ec4 (III)Lmew;
      // 031: invokestatic mew.getAllInBoxMutable (Lmew;Lmew;)Ljava/lang/Iterable;
      // 034: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 039: astore 8
      // 03b: aload 8
      // 03d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 042: ifeq 091
      // 045: aload 8
      // 047: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04c: checkcast mew
      // 04f: astore 9
      // 051: iload 5
      // 053: ifne 16a
      // 056: iload 5
      // 058: ifne 082
      // 05b: goto 062
      // 05e: invokestatic n3b.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 1
      // 063: aload 9
      // 065: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 068: invokeinterface zfz.r_y ()Le0x; 1
      // 06d: aload 0
      // 06e: if_acmpne 08c
      // 071: goto 078
      // 074: invokestatic n3b.a (Loov;)Loov;
      // 077: athrow
      // 078: iinc 6 -1
      // 07b: goto 082
      // 07e: invokestatic n3b.a (Loov;)Loov;
      // 081: athrow
      // 082: iload 6
      // 084: ifgt 08c
      // 087: return
      // 088: invokestatic n3b.a (Loov;)Loov;
      // 08b: athrow
      // 08c: iload 5
      // 08e: ifeq 03b
      // 091: aload 2
      // 092: aload 4
      // 094: bipush 3
      // 095: invokevirtual java/util/Random.nextInt (I)I
      // 098: bipush 1
      // 099: isub
      // 09a: aload 4
      // 09c: bipush 2
      // 09d: invokevirtual java/util/Random.nextInt (I)I
      // 0a0: aload 4
      // 0a2: bipush 2
      // 0a3: invokevirtual java/util/Random.nextInt (I)I
      // 0a6: isub
      // 0a7: aload 4
      // 0a9: bipush 3
      // 0aa: invokevirtual java/util/Random.nextInt (I)I
      // 0ad: bipush 1
      // 0ae: isub
      // 0af: invokevirtual mew.ec4 (III)Lmew;
      // 0b2: astore 8
      // 0b4: bipush 0
      // 0b5: istore 9
      // 0b7: iload 9
      // 0b9: bipush 4
      // 0ba: if_icmpge 121
      // 0bd: aload 1
      // 0be: aload 8
      // 0c0: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 0c3: iload 5
      // 0c5: ifne 127
      // 0c8: iload 5
      // 0ca: ifne 0f0
      // 0cd: goto 0d4
      // 0d0: invokestatic n3b.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: ifeq 0f6
      // 0d7: goto 0de
      // 0da: invokestatic n3b.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: aload 1
      // 0e0: aload 8
      // 0e2: aload 0
      // 0e3: invokevirtual n3b.l4i ()Lzfz;
      // 0e6: invokevirtual n3b._h0 (Lt9d;Lmew;Lzfz;)Z
      // 0e9: goto 0f0
      // 0ec: invokestatic n3b.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: ifeq 0f6
      // 0f3: aload 8
      // 0f5: astore 2
      // 0f6: aload 2
      // 0f7: aload 4
      // 0f9: bipush 3
      // 0fa: invokevirtual java/util/Random.nextInt (I)I
      // 0fd: bipush 1
      // 0fe: isub
      // 0ff: aload 4
      // 101: bipush 2
      // 102: invokevirtual java/util/Random.nextInt (I)I
      // 105: aload 4
      // 107: bipush 2
      // 108: invokevirtual java/util/Random.nextInt (I)I
      // 10b: isub
      // 10c: aload 4
      // 10e: bipush 3
      // 10f: invokevirtual java/util/Random.nextInt (I)I
      // 112: bipush 1
      // 113: isub
      // 114: invokevirtual mew.ec4 (III)Lmew;
      // 117: astore 8
      // 119: iinc 9 1
      // 11c: iload 5
      // 11e: ifeq 0b7
      // 121: aload 1
      // 122: aload 8
      // 124: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 127: iload 5
      // 129: ifne 148
      // 12c: ifeq 16a
      // 12f: goto 136
      // 132: invokestatic n3b.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 0
      // 137: aload 1
      // 138: aload 8
      // 13a: aload 0
      // 13b: invokevirtual n3b.l4i ()Lzfz;
      // 13e: invokevirtual n3b._h0 (Lt9d;Lmew;Lzfz;)Z
      // 141: goto 148
      // 144: invokestatic n3b.a (Loov;)Loov;
      // 147: athrow
      // 148: iload 5
      // 14a: ifne 169
      // 14d: ifeq 16a
      // 150: goto 157
      // 153: invokestatic n3b.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 1
      // 158: aload 8
      // 15a: aload 0
      // 15b: invokevirtual n3b.l4i ()Lzfz;
      // 15e: bipush 2
      // 15f: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 162: goto 169
      // 165: invokestatic n3b.a (Loov;)Loov;
      // 168: athrow
      // 169: pop
      // 16a: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial rrw.ctq (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 29
      // 0e: ifeq 3b
      // 11: goto 18
      // 14: invokestatic n3b.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: aload 0
      // 1c: invokevirtual n3b.l4i ()Lzfz;
      // 1f: invokevirtual n3b._h0 (Lt9d;Lmew;Lzfz;)Z
      // 22: goto 29
      // 25: invokestatic n3b.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 3
      // 2a: ifeq 38
      // 2d: ifeq 3b
      // 30: goto 37
      // 33: invokestatic n3b.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: ireturn
   }

   @Override
   public boolean ib4(e0x var1) {
      return var1.z4c();
   }

   @Override
   public boolean _h0(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: invokevirtual mew.getY ()I
      // 09: iload 4
      // 0b: ifne cf
      // 0e: iflt ce
      // 11: goto 18
      // 14: invokestatic n3b.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual mew.getY ()I
      // 1c: iload 4
      // 1e: ifne cf
      // 21: goto 28
      // 24: invokestatic n3b.a (Loov;)Loov;
      // 27: athrow
      // 28: sipush 256
      // 2b: if_icmpge ce
      // 2e: goto 35
      // 31: invokestatic n3b.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 1
      // 36: aload 2
      // 37: invokevirtual mew.eve ()Lmew;
      // 3a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3d: astore 5
      // 3f: aload 5
      // 41: invokeinterface zfz.r_y ()Le0x; 1
      // 46: getstatic ox_.pl8 Lp48;
      // 49: iload 4
      // 4b: ifne 76
      // 4e: if_acmpne 60
      // 51: goto 58
      // 54: invokestatic n3b.a (Loov;)Loov;
      // 57: athrow
      // 58: bipush 1
      // 59: goto cd
      // 5c: invokestatic n3b.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 5
      // 62: iload 4
      // 64: ifne 7b
      // 67: invokeinterface zfz.r_y ()Le0x; 1
      // 6c: getstatic ox_.kqk Le0x;
      // 6f: goto 76
      // 72: invokestatic n3b.a (Loov;)Loov;
      // 75: athrow
      // 76: if_acmpne 91
      // 79: aload 5
      // 7b: getstatic bx0.nln Lzb_;
      // 7e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 83: getstatic bx0$b_z.sos Lbx0$b_z;
      // 86: if_acmpne 91
      // 89: bipush 1
      // 8a: goto cd
      // 8d: invokestatic n3b.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 1
      // 92: aload 2
      // 93: invokevirtual OpaquePredicate.a2f (Lmew;)I
      // 96: iload 4
      // 98: ifne b9
      // 9b: bipush 13
      // 9d: if_icmpge cc
      // a0: goto a7
      // a3: invokestatic n3b.a (Loov;)Loov;
      // a6: athrow
      // a7: aload 0
      // a8: aload 5
      // aa: invokeinterface zfz.r_y ()Le0x; 1
      // af: invokevirtual n3b.ib4 (Le0x;)Z
      // b2: goto b9
      // b5: invokestatic n3b.a (Loov;)Loov;
      // b8: athrow
      // b9: iload 4
      // bb: ifne c9
      // be: ifeq cc
      // c1: goto c8
      // c4: invokestatic n3b.a (Loov;)Loov;
      // c7: athrow
      // c8: bipush 1
      // c9: goto cd
      // cc: bipush 0
      // cd: ireturn
      // ce: bipush 0
      // cf: ireturn
   }

   public boolean qvw(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 05: pop
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: aconst_null
      // 0a: astore 6
      // 0c: istore 5
      // 0e: aload 0
      // 0f: getstatic ox_.zml Lrrw;
      // 12: iload 5
      // 14: ifne 34
      // 17: if_acmpne 30
      // 1a: goto 21
      // 1d: invokestatic n3b.a (Loov;)Loov;
      // 20: athrow
      // 21: new ts2
      // 24: dup
      // 25: getstatic ox_.s82 Le0x;
      // 28: invokespecial ts2.<init> (Le0x;)V
      // 2b: astore 6
      // 2d: goto 43
      // 30: aload 0
      // 31: getstatic ox_.ae9 Lrrw;
      // 34: if_acmpne 43
      // 37: new ts2
      // 3a: dup
      // 3b: getstatic ox_.cph Le0x;
      // 3e: invokespecial ts2.<init> (Le0x;)V
      // 41: astore 6
      // 43: aload 6
      // 45: iload 5
      // 47: ifne 56
      // 4a: ifnull 72
      // 4d: goto 54
      // 50: invokestatic n3b.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 6
      // 56: aload 1
      // 57: aload 4
      // 59: aload 2
      // 5a: invokevirtual cdu.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 5d: iload 5
      // 5f: ifne 7b
      // 62: ifeq 72
      // 65: goto 6c
      // 68: invokestatic n3b.a (Loov;)Loov;
      // 6b: athrow
      // 6c: bipush 1
      // 6d: ireturn
      // 6e: invokestatic n3b.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 1
      // 73: aload 2
      // 74: aload 3
      // 75: bipush 3
      // 76: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 79: pop
      // 7a: bipush 0
      // 7b: ireturn
   }

   @Override
   public boolean z3t(OpaquePredicate var1, mew var2, zfz var3, boolean var4) {
      return true;
   }

   @Override
   public boolean y4n(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      int var5 = OpaquePredicate.b();

      try {
         double var7;
         int var10000 = (var7 = (double)var2.nextFloat() - 0.4) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
         if (var5 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return (boolean)0;
   }

   @Override
   public void tu1(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      this.qvw(var1, var3, var4, var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
