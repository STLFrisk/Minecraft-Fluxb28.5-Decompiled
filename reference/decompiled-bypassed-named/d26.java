import java.util.Random;

public class d26 extends e0x {
   public static boolean trk;

   public d26() {
      super(p3y.y_4);
      this.i3l(uja.mqu);
   }

   public d26(p3y var1) {
      super(var1);
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      var1.cjk(var2, this, this.odp(var1));
   }

   @Override
   public void z3l(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
      var1.cjk(var2, this, this.odp(var1));
   }

   @Override
   public void zvy(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
      try {
         if (!var1.v0f) {
            this.zs1(var1, var2);
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   private void zs1(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: aload 2
      // 006: invokevirtual mew.eve ()Lmew;
      // 009: invokestatic d26._j1 (Lt9d;Lmew;)Z
      // 00c: iload 3
      // 00d: ifeq 025
      // 010: ifeq 12a
      // 013: goto 01a
      // 016: invokestatic d26.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 2
      // 01b: invokevirtual mew.getY ()I
      // 01e: goto 025
      // 021: invokestatic d26.a (Loov;)Loov;
      // 024: athrow
      // 025: iload 3
      // 026: ifeq 035
      // 029: iflt 12a
      // 02c: goto 033
      // 02f: invokestatic d26.a (Loov;)Loov;
      // 032: athrow
      // 033: bipush 32
      // 035: istore 4
      // 037: getstatic d26.trk Z
      // 03a: iload 3
      // 03b: ifeq 0c9
      // 03e: ifne 0bd
      // 041: goto 048
      // 044: invokestatic d26.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 1
      // 049: aload 2
      // 04a: iload 4
      // 04c: ineg
      // 04d: iload 4
      // 04f: ineg
      // 050: iload 4
      // 052: ineg
      // 053: invokevirtual mew.ec4 (III)Lmew;
      // 056: aload 2
      // 057: iload 4
      // 059: iload 4
      // 05b: iload 4
      // 05d: invokevirtual mew.ec4 (III)Lmew;
      // 060: invokevirtual OpaquePredicate.o2i (Lmew;Lmew;)Z
      // 063: iload 3
      // 064: ifeq 0c9
      // 067: goto 06e
      // 06a: invokestatic d26.a (Loov;)Loov;
      // 06d: athrow
      // 06e: ifeq 0bd
      // 071: goto 078
      // 074: invokestatic d26.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 1
      // 079: getfield OpaquePredicate.v0f Z
      // 07c: ifne 12a
      // 07f: goto 086
      // 082: invokestatic d26.a (Loov;)Loov;
      // 085: athrow
      // 086: new vjf
      // 089: dup
      // 08a: aload 1
      // 08b: aload 2
      // 08c: invokevirtual mew.getX ()I
      // 08f: i2d
      // 090: ldc2_w 0.5
      // 093: dadd
      // 094: aload 2
      // 095: invokevirtual mew.getY ()I
      // 098: i2d
      // 099: aload 2
      // 09a: invokevirtual mew.getZ ()I
      // 09d: i2d
      // 09e: ldc2_w 0.5
      // 0a1: dadd
      // 0a2: aload 1
      // 0a3: aload 2
      // 0a4: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a7: invokespecial vjf.<init> (Lt9d;DDDLzfz;)V
      // 0aa: astore 5
      // 0ac: aload 0
      // 0ad: aload 5
      // 0af: invokevirtual d26.cl9 (Lvjf;)V
      // 0b2: aload 1
      // 0b3: aload 5
      // 0b5: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 0b8: pop
      // 0b9: iload 3
      // 0ba: ifne 12a
      // 0bd: aload 1
      // 0be: aload 2
      // 0bf: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 0c2: goto 0c9
      // 0c5: invokestatic d26.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: pop
      // 0ca: aload 2
      // 0cb: invokevirtual mew.eve ()Lmew;
      // 0ce: astore 5
      // 0d0: aload 1
      // 0d1: aload 5
      // 0d3: invokestatic d26._j1 (Lt9d;Lmew;)Z
      // 0d6: ifeq 102
      // 0d9: aload 5
      // 0db: invokevirtual mew.getY ()I
      // 0de: iload 3
      // 0df: ifeq 107
      // 0e2: iload 3
      // 0e3: ifeq 107
      // 0e6: goto 0ed
      // 0e9: invokestatic d26.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: ifle 102
      // 0f0: goto 0f7
      // 0f3: invokestatic d26.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 5
      // 0f9: invokevirtual mew.eve ()Lmew;
      // 0fc: astore 5
      // 0fe: iload 3
      // 0ff: ifne 0d0
      // 102: aload 5
      // 104: invokevirtual mew.getY ()I
      // 107: iload 3
      // 108: ifeq 129
      // 10b: ifle 12a
      // 10e: goto 115
      // 111: invokestatic d26.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 1
      // 116: aload 5
      // 118: invokevirtual mew.nuv ()Lmew;
      // 11b: aload 0
      // 11c: invokevirtual d26.l4i ()Lzfz;
      // 11f: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 122: goto 129
      // 125: invokestatic d26.a (Loov;)Loov;
      // 128: athrow
      // 129: pop
      // 12a: return
   }

   public void cl9(vjf var1) {
   }

   @Override
   public int odp(OpaquePredicate var1) {
      return 2;
   }

   public static boolean _j1(OpaquePredicate param0, mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 05: invokeinterface zfz.r_y ()Le0x; 1
      // 0a: astore 3
      // 0b: invokestatic OpaquePredicate.b ()I
      // 0e: aload 3
      // 0f: getfield e0x.kgd Lp3y;
      // 12: astore 4
      // 14: istore 2
      // 15: aload 3
      // 16: getstatic ox_._0u Lwuo;
      // 19: if_acmpeq 5f
      // 1c: aload 4
      // 1e: getstatic p3y.cei Lp3y;
      // 21: iload 2
      // 22: ifeq 42
      // 25: goto 2c
      // 28: invokestatic d26.a (Loov;)Loov;
      // 2b: athrow
      // 2c: if_acmpeq 5f
      // 2f: goto 36
      // 32: invokestatic d26.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 4
      // 38: getstatic p3y.six Lp3y;
      // 3b: goto 42
      // 3e: invokestatic d26.a (Loov;)Loov;
      // 41: athrow
      // 42: iload 2
      // 43: ifeq 5c
      // 46: if_acmpeq 5f
      // 49: goto 50
      // 4c: invokestatic d26.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 4
      // 52: getstatic p3y.e1s Lp3y;
      // 55: goto 5c
      // 58: invokestatic d26.a (Loov;)Loov;
      // 5b: athrow
      // 5c: if_acmpne 67
      // 5f: bipush 1
      // 60: goto 68
      // 63: invokestatic d26.a (Loov;)Loov;
      // 66: athrow
      // 67: bipush 0
      // 68: ireturn
   }

   public void s5p(OpaquePredicate var1, mew var2) {
   }

   private static oov a(oov var0) {
      return var0;
   }
}
