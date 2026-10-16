import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bk4 {
   private static final long a;
   private static final String b;

   public static String zb0(e0x param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bk4.a J
      // 03: ldc2_w 13343454515576
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 25
      // 11: getstatic ox_.ibw Le0x;
      // 14: if_acmpne 24
      // 17: goto 1e
      // 1a: invokestatic bk4.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aconst_null
      // 1f: areturn
      // 20: invokestatic bk4.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 28: astore 4
      // 2a: aload 4
      // 2c: ifnull 46
      // 2f: new erg
      // 32: dup
      // 33: aload 0
      // 34: invokevirtual e0x.abc ()Ljava/lang/String;
      // 37: invokestatic u7m.rya (Ljava/lang/String;)Lu7m;
      // 3a: bipush 1
      // 3b: bipush 0
      // 3c: invokespecial erg.<init> (Lu7m;II)V
      // 3f: goto 47
      // 42: invokestatic bk4.a (Loov;)Loov;
      // 45: athrow
      // 46: aconst_null
      // 47: astore 5
      // 49: aload 5
      // 4b: ifnonnull 59
      // 4e: aload 0
      // 4f: invokevirtual e0x.ieu ()Ljava/lang/String;
      // 52: goto 60
      // 55: invokestatic bk4.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 4
      // 5b: aload 5
      // 5d: invokevirtual u7m.ily (Lerg;)Ljava/lang/String;
      // 60: astore 6
      // 62: aload 6
      // 64: invokevirtual java/lang/String.length ()I
      // 67: iload 3
      // 68: ifne 96
      // 6b: bipush 5
      // 6c: if_icmple a7
      // 6f: goto 76
      // 72: invokestatic bk4.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 6
      // 78: bipush 0
      // 79: bipush 5
      // 7a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 7d: iload 3
      // 7e: ifne a4
      // 81: goto 88
      // 84: invokestatic bk4.a (Loov;)Loov;
      // 87: athrow
      // 88: getstatic bk4.b Ljava/lang/String;
      // 8b: nop
      // 8c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8f: goto 96
      // 92: invokestatic bk4.a (Loov;)Loov;
      // 95: athrow
      // 96: ifeq a7
      // 99: aload 0
      // 9a: invokevirtual e0x.abc ()Ljava/lang/String;
      // 9d: goto a4
      // a0: invokestatic bk4.a (Loov;)Loov;
      // a3: athrow
      // a4: goto a9
      // a7: aload 6
      // a9: areturn
   }

   public static boolean m2x() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: bipush 0
      // 05: istore 1
      // 06: invokestatic c05.vz1 ()Lc05;
      // 09: getfield c05.vg8 Ll86;
      // 0c: ldc2_w 0.3100000023841858
      // 0f: dconst_0
      // 10: ldc2_w 0.3100000023841858
      // 13: invokestatic bk4.izc (Lha9;DDD)Le0x;
      // 16: instanceof g7u
      // 19: iload 0
      // 1a: ifeq c7
      // 1d: ifne c6
      // 20: goto 27
      // 23: invokestatic bk4.a (Loov;)Loov;
      // 26: athrow
      // 27: invokestatic c05.vz1 ()Lc05;
      // 2a: getfield c05.vg8 Ll86;
      // 2d: ldc2_w -0.3100000023841858
      // 30: dconst_0
      // 31: ldc2_w -0.3100000023841858
      // 34: invokestatic bk4.izc (Lha9;DDD)Le0x;
      // 37: instanceof g7u
      // 3a: iload 0
      // 3b: ifeq c7
      // 3e: goto 45
      // 41: invokestatic bk4.a (Loov;)Loov;
      // 44: athrow
      // 45: ifne c6
      // 48: goto 4f
      // 4b: invokestatic bk4.a (Loov;)Loov;
      // 4e: athrow
      // 4f: invokestatic c05.vz1 ()Lc05;
      // 52: getfield c05.vg8 Ll86;
      // 55: ldc2_w 0.3100000023841858
      // 58: dconst_0
      // 59: ldc2_w -0.3100000023841858
      // 5c: invokestatic bk4.izc (Lha9;DDD)Le0x;
      // 5f: instanceof g7u
      // 62: iload 0
      // 63: ifeq c7
      // 66: goto 6d
      // 69: invokestatic bk4.a (Loov;)Loov;
      // 6c: athrow
      // 6d: ifne c6
      // 70: goto 77
      // 73: invokestatic bk4.a (Loov;)Loov;
      // 76: athrow
      // 77: invokestatic c05.vz1 ()Lc05;
      // 7a: getfield c05.vg8 Ll86;
      // 7d: ldc2_w -0.3100000023841858
      // 80: dconst_0
      // 81: ldc2_w 0.3100000023841858
      // 84: invokestatic bk4.izc (Lha9;DDD)Le0x;
      // 87: instanceof g7u
      // 8a: iload 0
      // 8b: ifeq c7
      // 8e: goto 95
      // 91: invokestatic bk4.a (Loov;)Loov;
      // 94: athrow
      // 95: ifne c6
      // 98: goto 9f
      // 9b: invokestatic bk4.a (Loov;)Loov;
      // 9e: athrow
      // 9f: invokestatic c05.vz1 ()Lc05;
      // a2: getfield c05.vg8 Ll86;
      // a5: ldc 1.05
      // a7: nop
      // a8: ldc 1.05
      // aa: nop
      // ab: invokestatic bk4._r5 (Lha9;FF)Le0x;
      // ae: instanceof g7u
      // b1: iload 0
      // b2: ifeq c9
      // b5: goto bc
      // b8: invokestatic bk4.a (Loov;)Loov;
      // bb: athrow
      // bc: ifeq c8
      // bf: goto c6
      // c2: invokestatic bk4.a (Loov;)Loov;
      // c5: athrow
      // c6: bipush 1
      // c7: istore 1
      // c8: iload 1
      // c9: ireturn
   }

   public static e0x _r5(ha9 var0, float var1, float var2) {
      double var3 = var0.o2v + var0.icv * (double)var1;
      double var5 = var0.vbd + var0.bw4 * (double)var2;
      return rwa(new mew(var3, var0.kfp, var5));
   }

   public static e0x rwa(mew var0) {
      zfz var1 = c05.vz1().tij.getBlockState(var0);
      return var1.r_y();
   }

   public static void m6f(mew param0, vt2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: invokestatic c05.vz1 ()Lc05;
      // 07: getfield c05.vg8 Ll86;
      // 0a: getfield l86.up_ Ljnq;
      // 0d: invokevirtual jnq.dxs ()Lerg;
      // 10: astore 3
      // 11: iload 2
      // 12: ifeq 54
      // 15: aload 3
      // 16: ifnonnull 25
      // 19: goto 20
      // 1c: invokestatic bk4.a (Loov;)Loov;
      // 1f: athrow
      // 20: return
      // 21: invokestatic bk4.a (Loov;)Loov;
      // 24: athrow
      // 25: invokestatic c05.vz1 ()Lc05;
      // 28: getfield c05.l7q Lhh6;
      // 2b: invokestatic c05.vz1 ()Lc05;
      // 2e: getfield c05.vg8 Ll86;
      // 31: invokestatic c05.vz1 ()Lc05;
      // 34: getfield c05.tij Lkh3;
      // 37: aload 3
      // 38: aload 0
      // 39: aload 1
      // 3a: new fqr
      // 3d: dup
      // 3e: aload 0
      // 3f: invokevirtual mew.getX ()I
      // 42: i2d
      // 43: aload 0
      // 44: invokevirtual mew.getY ()I
      // 47: i2d
      // 48: aload 0
      // 49: invokevirtual mew.getZ ()I
      // 4c: i2d
      // 4d: invokespecial fqr.<init> (DDD)V
      // 50: invokevirtual hh6.onPlayerRightClick (Ll86;Lkh3;Lerg;Lmew;Lvt2;Lfqr;)Z
      // 53: pop
      // 54: return
   }

   public static double w8a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dconst_0
      // 01: dstore 1
      // 02: invokestatic t9d.c ()I
      // 05: invokestatic c05.vz1 ()Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: getfield l86.kfp D
      // 0e: dstore 3
      // 0f: istore 0
      // 10: dload 3
      // 11: dconst_0
      // 12: dcmpl
      // 13: ifle b3
      // 16: new mew
      // 19: dup
      // 1a: invokestatic c05.vz1 ()Lc05;
      // 1d: getfield c05.vg8 Ll86;
      // 20: getfield l86.o2v D
      // 23: dload 3
      // 24: invokestatic c05.vz1 ()Lc05;
      // 27: getfield c05.vg8 Ll86;
      // 2a: getfield l86.vbd D
      // 2d: invokespecial mew.<init> (DDD)V
      // 30: invokestatic bk4._82 (Lmew;)Le0x;
      // 33: astore 5
      // 35: iload 0
      // 36: ifne c1
      // 39: aload 5
      // 3b: iload 0
      // 3c: ifne 5f
      // 3f: goto 46
      // 42: invokestatic bk4.a (Loov;)Loov;
      // 45: athrow
      // 46: invokevirtual e0x.p1r ()Lp3y;
      // 49: getstatic p3y.cei Lp3y;
      // 4c: if_acmpeq 90
      // 4f: goto 56
      // 52: invokestatic bk4.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 5
      // 58: goto 5f
      // 5b: invokestatic bk4.a (Loov;)Loov;
      // 5e: athrow
      // 5f: invokevirtual e0x.lj1 ()Z
      // 62: iload 0
      // 63: ifne a5
      // 66: ifeq 90
      // 69: goto 70
      // 6c: invokestatic bk4.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 5
      // 72: invokevirtual e0x.siy ()Z
      // 75: iload 0
      // 76: ifne a5
      // 79: goto 80
      // 7c: invokestatic bk4.a (Loov;)Loov;
      // 7f: athrow
      // 80: ifeq 90
      // 83: goto 8a
      // 86: invokestatic bk4.a (Loov;)Loov;
      // 89: athrow
      // 8a: dload 3
      // 8b: dstore 1
      // 8c: iload 0
      // 8d: ifeq b3
      // 90: dload 3
      // 91: dconst_0
      // 92: iload 0
      // 93: ifne ad
      // 96: goto 9d
      // 99: invokestatic bk4.a (Loov;)Loov;
      // 9c: athrow
      // 9d: dcmpg
      // 9e: goto a5
      // a1: invokestatic bk4.a (Loov;)Loov;
      // a4: athrow
      // a5: ifge ab
      // a8: goto b3
      // ab: dload 3
      // ac: dconst_1
      // ad: dsub
      // ae: dstore 3
      // af: iload 0
      // b0: ifeq 10
      // b3: invokestatic c05.vz1 ()Lc05;
      // b6: getfield c05.vg8 Ll86;
      // b9: getfield l86.kfp D
      // bc: dload 1
      // bd: dsub
      // be: dconst_1
      // bf: dsub
      // c0: dstore 3
      // c1: dload 3
      // c2: dreturn
   }

   public static e0x dub(ha9 var0, double var1) {
      return _82(new mew(var0.o2v, var0.kfp - var1, var0.vbd));
   }

   public static e0x izc(ha9 var0, double var1, double var3, double var5) {
      return _82(new mew(var0.o2v - var1, var0.kfp - var3, var0.vbd - var5));
   }

   public static boolean oa9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 0
      // 004: bipush 0
      // 005: istore 1
      // 006: invokestatic c05.vz1 ()Lc05;
      // 009: getfield c05.vg8 Ll86;
      // 00c: ldc2_w 0.30000001192092896
      // 00f: ldc2_w 0.10000000149011612
      // 012: ldc2_w 0.30000001192092896
      // 015: invokestatic bk4.izc (Lha9;DDD)Le0x;
      // 018: invokevirtual e0x.p1r ()Lp3y;
      // 01b: invokevirtual p3y.l7j ()Z
      // 01e: iload 0
      // 01f: ifne 110
      // 022: ifeq 10f
      // 025: goto 02c
      // 028: invokestatic bk4.a (Loov;)Loov;
      // 02b: athrow
      // 02c: invokestatic c05.vz1 ()Lc05;
      // 02f: getfield c05.vg8 Ll86;
      // 032: ldc2_w -0.30000001192092896
      // 035: ldc2_w 0.10000000149011612
      // 038: ldc2_w -0.30000001192092896
      // 03b: invokestatic bk4.izc (Lha9;DDD)Le0x;
      // 03e: invokevirtual e0x.p1r ()Lp3y;
      // 041: invokevirtual p3y.l7j ()Z
      // 044: iload 0
      // 045: ifne 110
      // 048: goto 04f
      // 04b: invokestatic bk4.a (Loov;)Loov;
      // 04e: athrow
      // 04f: ifeq 10f
      // 052: goto 059
      // 055: invokestatic bk4.a (Loov;)Loov;
      // 058: athrow
      // 059: invokestatic c05.vz1 ()Lc05;
      // 05c: getfield c05.tij Lkh3;
      // 05f: new mew
      // 062: dup
      // 063: invokestatic c05.vz1 ()Lc05;
      // 066: getfield c05.vg8 Ll86;
      // 069: getfield l86.o2v D
      // 06c: ldc2_w 0.3
      // 06f: dsub
      // 070: invokestatic c05.vz1 ()Lc05;
      // 073: getfield c05.vg8 Ll86;
      // 076: getfield l86.kfp D
      // 079: ldc2_w 0.1
      // 07c: dsub
      // 07d: invokestatic c05.vz1 ()Lc05;
      // 080: getfield c05.vg8 Ll86;
      // 083: getfield l86.vbd D
      // 086: ldc2_w 0.3
      // 089: dsub
      // 08a: invokespecial mew.<init> (DDD)V
      // 08d: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 090: getstatic hmv.nfg L_ku;
      // 093: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 098: checkcast java/lang/Integer
      // 09b: invokevirtual java/lang/Integer.intValue ()I
      // 09e: iload 0
      // 09f: ifne 110
      // 0a2: goto 0a9
      // 0a5: invokestatic bk4.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ifne 10f
      // 0ac: goto 0b3
      // 0af: invokestatic bk4.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: invokestatic c05.vz1 ()Lc05;
      // 0b6: getfield c05.tij Lkh3;
      // 0b9: new mew
      // 0bc: dup
      // 0bd: invokestatic c05.vz1 ()Lc05;
      // 0c0: getfield c05.vg8 Ll86;
      // 0c3: getfield l86.o2v D
      // 0c6: ldc2_w 0.3
      // 0c9: dadd
      // 0ca: invokestatic c05.vz1 ()Lc05;
      // 0cd: getfield c05.vg8 Ll86;
      // 0d0: getfield l86.kfp D
      // 0d3: ldc2_w 0.1
      // 0d6: dsub
      // 0d7: invokestatic c05.vz1 ()Lc05;
      // 0da: getfield c05.vg8 Ll86;
      // 0dd: getfield l86.vbd D
      // 0e0: ldc2_w 0.3
      // 0e3: dadd
      // 0e4: invokespecial mew.<init> (DDD)V
      // 0e7: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 0ea: getstatic hmv.nfg L_ku;
      // 0ed: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0f2: checkcast java/lang/Integer
      // 0f5: invokevirtual java/lang/Integer.intValue ()I
      // 0f8: iload 0
      // 0f9: ifne 110
      // 0fc: goto 103
      // 0ff: invokestatic bk4.a (Loov;)Loov;
      // 102: athrow
      // 103: ifne 10f
      // 106: goto 10d
      // 109: invokestatic bk4.a (Loov;)Loov;
      // 10c: athrow
      // 10d: bipush 1
      // 10e: istore 1
      // 10f: iload 1
      // 110: ireturn
   }

   public static boolean _t6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic c05.vz1 ()Lc05;
      // 03: getfield c05.vg8 Ll86;
      // 06: astore 1
      // 07: invokestatic t9d.b ()I
      // 0a: aload 1
      // 0b: invokevirtual i2h.aaw ()Lnh4;
      // 0e: dconst_0
      // 0f: ldc2_w -0.01
      // 12: dconst_0
      // 13: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 16: getfield nh4.bx_ D
      // 19: dstore 2
      // 1a: istore 0
      // 1b: invokestatic c05.vz1 ()Lc05;
      // 1e: getfield c05.tij Lkh3;
      // 21: new mew
      // 24: dup
      // 25: aload 1
      // 26: getfield i2h.o2v D
      // 29: dload 2
      // 2a: aload 1
      // 2b: getfield i2h.vbd D
      // 2e: invokespecial mew.<init> (DDD)V
      // 31: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 34: invokeinterface zfz.r_y ()Le0x; 1
      // 39: astore 4
      // 3b: aload 4
      // 3d: iload 0
      // 3e: ifeq 4d
      // 41: ifnull 81
      // 44: goto 4b
      // 47: invokestatic bk4.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 4
      // 4d: instanceof n47
      // 50: iload 0
      // 51: ifeq 82
      // 54: ifne 81
      // 57: goto 5e
      // 5a: invokestatic bk4.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 4
      // 60: instanceof hmv
      // 63: iload 0
      // 64: ifeq 82
      // 67: goto 6e
      // 6a: invokestatic bk4.a (Loov;)Loov;
      // 6d: athrow
      // 6e: ifne 81
      // 71: goto 78
      // 74: invokestatic bk4.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 1
      // 79: getfield i2h.lfk Z
      // 7c: ireturn
      // 7d: invokestatic bk4.a (Loov;)Loov;
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
   }

   public static e0x _kz(double var0, double var2, double var4) {
      return c05.vz1().tij.getBlockState(new mew(var0, var2, var4)).r_y();
   }

   public static e0x _82(mew var0) {
      return c05.vz1().tij.getBlockState(var0).r_y();
   }

   public static e0x a32(i2h param0, double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic bk4.a (Loov;)Loov;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic bk4.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual i2h.aaw ()Lnh4;
      // 1d: dconst_0
      // 1e: dload 1
      // 1f: dconst_0
      // 20: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 23: getfield nh4.bx_ D
      // 26: d2i
      // 27: istore 4
      // 29: aload 0
      // 2a: invokevirtual i2h.aaw ()Lnh4;
      // 2d: getfield nh4.rlc D
      // 30: invokestatic fe6.jqf (D)I
      // 33: istore 5
      // 35: iload 5
      // 37: aload 0
      // 38: invokevirtual i2h.aaw ()Lnh4;
      // 3b: getfield nh4.t_2 D
      // 3e: invokestatic fe6.jqf (D)I
      // 41: bipush 1
      // 42: iadd
      // 43: if_icmpge 95
      // 46: aload 0
      // 47: invokevirtual i2h.aaw ()Lnh4;
      // 4a: getfield nh4.t8n D
      // 4d: invokestatic fe6.jqf (D)I
      // 50: istore 6
      // 52: iload 3
      // 53: ifne 91
      // 56: iload 6
      // 58: aload 0
      // 59: invokevirtual i2h.aaw ()Lnh4;
      // 5c: getfield nh4.oqj D
      // 5f: invokestatic fe6.jqf (D)I
      // 62: bipush 1
      // 63: iadd
      // 64: if_icmpge 8e
      // 67: goto 6e
      // 6a: invokestatic bk4.a (Loov;)Loov;
      // 6d: athrow
      // 6e: invokestatic c05.vz1 ()Lc05;
      // 71: getfield c05.tij Lkh3;
      // 74: new mew
      // 77: dup
      // 78: iload 5
      // 7a: iload 4
      // 7c: iload 6
      // 7e: invokespecial mew.<init> (III)V
      // 81: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 84: invokeinterface zfz.r_y ()Le0x; 1
      // 89: areturn
      // 8a: invokestatic bk4.a (Loov;)Loov;
      // 8d: athrow
      // 8e: iinc 5 1
      // 91: iload 3
      // 92: ifeq 35
      // 95: aconst_null
      // 96: areturn
   }

   public static boolean qq4() {
      nh4 var1 = c05.vz1().vg8.aaw().sy_(0.0, -0.1, 0.0).va6(0.001, 0.0, 0.001);
      int var10000 = t9d.c();
      int var2 = fe6.jqf(var1.rlc);
      int var3 = fe6.jqf(var1.t_2 + 1.0);
      int var0 = var10000;
      int var4 = fe6.jqf(var1.bx_);
      int var5 = fe6.jqf(var1.i2c + 1.0);
      int var6 = fe6.jqf(var1.t8n);
      int var7 = fe6.jqf(var1.oqj + 1.0);
      byte var8 = 0;
      int var9 = var4;

      label89:
      while (true) {
         var10000 = var9;

         label86:
         while (var10000 < var5) {
            if (var0 != 0) {
               return (boolean)var2;
            }

            int var10 = var2;

            label83:
            while (true) {
               var10000 = var10;

               label81:
               while (true) {
                  if (var10000 >= var3) {
                     break label83;
                  }

                  var10000 = var6;
                  if (var0 != 0) {
                     continue label86;
                  }

                  int var11 = var6;

                  while (var11 < var7) {
                     e0x var12 = c05.vz1().tij.getBlockState(new mew(var10, var9, var11)).r_y();
                     var10000 = var12 instanceof hmv;
                     if (var0 != 0) {
                        continue label81;
                     }

                     label75: {
                        label97: {
                           label73: {
                              label72: {
                                 try {
                                    if (var0 != 0) {
                                       break label73;
                                    }

                                    if (var10000 == 0) {
                                       break label72;
                                    }
                                 } catch (oov var15) {
                                    throw a(var15);
                                 }

                                 var8 = 1;
                              }

                              try {
                                 var19 = var12;
                                 if (var0 != 0) {
                                    break label97;
                                 }

                                 var10000 = var12 instanceof hmv;
                              } catch (oov var14) {
                                 throw a(var14);
                              }
                           }

                           if (var10000 != 0) {
                              break label75;
                           }

                           var19 = var12;
                        }

                        try {
                           if (var19.m__(c05.vz1().tij, new mew(var10, var9, var11), c05.vz1().tij.getBlockState(new mew(var10, var9, var11))) != null) {
                              return false;
                           }
                        } catch (oov var13) {
                           throw a(var13);
                        }
                     }

                     var11++;
                     if (var0 != 0) {
                        break;
                     }
                  }

                  var10++;
                  if (var0 != 0) {
                     break label83;
                  }
                  break;
               }
            }

            var9++;
            if (var0 == 0) {
               continue label89;
            }
            break;
         }

         return (boolean)var8;
      }
   }

   public static boolean a2a() {
      return c05.vz1().tij.jqj(c05.vz1().vg8.aaw().c2h(0.0, -0.4F, 0.0).va6(0.001, 0.001, 0.001), p3y.six, c05.vz1().vg8);
   }

   public static boolean icg() {
      nh4 var1 = c05.vz1().vg8.aaw().va6(0.001, 0.001, 0.001);
      int var2 = fe6.jqf(var1.rlc);
      int var3 = fe6.jqf(var1.t_2 + 1.0);
      int var4 = fe6.jqf(var1.bx_);
      int var5 = fe6.jqf(var1.i2c + 1.0);
      int var6 = fe6.jqf(var1.t8n);
      int var10000 = t9d.b();
      int var7 = fe6.jqf(var1.oqj + 1.0);
      int var8 = var2;
      int var0 = var10000;

      label80:
      while (true) {
         var10000 = var8;

         label76:
         while (var10000 < var3) {
            if (var0 == 0) {
               return (boolean)var4;
            }

            int var9 = var4;

            label74:
            while (true) {
               var10000 = var9;

               label71:
               while (var10000 < var5) {
                  var10000 = var6;
                  if (var0 == 0) {
                     continue label76;
                  }

                  int var10 = var6;

                  while (var10 < var7) {
                     mew var11 = new mew(var8, var9, var10);
                     e0x var12 = c05.vz1().tij.getBlockState(var11).r_y();

                     label87: {
                        try {
                           if (var0 == 0) {
                              break label87;
                           }

                           var10000 = var12 instanceof hmv;
                           if (var0 == 0) {
                              continue label71;
                           }
                        } catch (oov var13) {
                           throw a(var13);
                        }

                        try {
                           if (var10000 != 0) {
                              return true;
                           }
                        } catch (oov var14) {
                           throw a(var14);
                        }

                        var10++;
                     }

                     if (var0 == 0) {
                        break;
                     }
                  }

                  var9++;
                  if (var0 != 0) {
                     continue label74;
                  }
                  break;
               }

               var8++;
               if (var0 != 0) {
                  continue label80;
               }

               return (boolean)0;
            }
         }

         return (boolean)0;
      }
   }

   public static boolean no9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic c05.vz1 ()Lc05;
      // 03: getfield c05.vg8 Ll86;
      // 06: invokevirtual l86.aaw ()Lnh4;
      // 09: dconst_0
      // 0a: ldc2_w 0.001
      // 0d: dconst_0
      // 0e: invokevirtual nh4.va6 (DDD)Lnh4;
      // 11: astore 1
      // 12: aload 1
      // 13: getfield nh4.bx_ D
      // 16: invokestatic fe6.jqf (D)I
      // 19: istore 2
      // 1a: invokestatic t9d.b ()I
      // 1d: aload 1
      // 1e: getfield nh4.i2c D
      // 21: dconst_1
      // 22: dadd
      // 23: invokestatic fe6.jqf (D)I
      // 26: istore 3
      // 27: istore 0
      // 28: iload 2
      // 29: istore 4
      // 2b: iload 4
      // 2d: iload 3
      // 2e: if_icmpge 8c
      // 31: new mew
      // 34: dup
      // 35: invokestatic c05.vz1 ()Lc05;
      // 38: getfield c05.vg8 Ll86;
      // 3b: getfield l86.o2v D
      // 3e: iload 4
      // 40: i2d
      // 41: invokestatic c05.vz1 ()Lc05;
      // 44: getfield c05.vg8 Ll86;
      // 47: getfield l86.vbd D
      // 4a: invokespecial mew.<init> (DDD)V
      // 4d: astore 5
      // 4f: invokestatic c05.vz1 ()Lc05;
      // 52: getfield c05.tij Lkh3;
      // 55: aload 5
      // 57: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 5a: invokeinterface zfz.r_y ()Le0x; 1
      // 5f: astore 6
      // 61: iload 0
      // 62: ifeq 88
      // 65: aload 6
      // 67: invokevirtual e0x.z4c ()Z
      // 6a: iload 0
      // 6b: ifeq 8d
      // 6e: goto 75
      // 71: invokestatic bk4.a (Loov;)Loov;
      // 74: athrow
      // 75: ifeq 85
      // 78: goto 7f
      // 7b: invokestatic bk4.a (Loov;)Loov;
      // 7e: athrow
      // 7f: bipush 1
      // 80: ireturn
      // 81: invokestatic bk4.a (Loov;)Loov;
      // 84: athrow
      // 85: iinc 4 1
      // 88: iload 0
      // 89: ifne 2b
      // 8c: bipush 0
      // 8d: ireturn
   }

   public static boolean ncv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 1
      // 002: invokestatic t9d.c ()I
      // 005: invokestatic c05.vz1 ()Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: invokevirtual l86.aaw ()Lnh4;
      // 00e: dconst_0
      // 00f: dconst_1
      // 010: dconst_0
      // 011: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 014: getfield nh4.bx_ D
      // 017: d2i
      // 018: istore 2
      // 019: istore 0
      // 01a: invokestatic c05.vz1 ()Lc05;
      // 01d: getfield c05.vg8 Ll86;
      // 020: invokevirtual l86.aaw ()Lnh4;
      // 023: getfield nh4.rlc D
      // 026: invokestatic fe6.jqf (D)I
      // 029: istore 3
      // 02a: iload 3
      // 02b: invokestatic c05.vz1 ()Lc05;
      // 02e: getfield c05.vg8 Ll86;
      // 031: invokevirtual l86.aaw ()Lnh4;
      // 034: getfield nh4.t_2 D
      // 037: invokestatic fe6.jqf (D)I
      // 03a: bipush 1
      // 03b: iadd
      // 03c: if_icmpge 100
      // 03f: invokestatic c05.vz1 ()Lc05;
      // 042: getfield c05.vg8 Ll86;
      // 045: invokevirtual l86.aaw ()Lnh4;
      // 048: getfield nh4.t8n D
      // 04b: invokestatic fe6.jqf (D)I
      // 04e: iload 0
      // 04f: ifne 101
      // 052: istore 4
      // 054: iload 4
      // 056: invokestatic c05.vz1 ()Lc05;
      // 059: getfield c05.vg8 Ll86;
      // 05c: invokevirtual l86.aaw ()Lnh4;
      // 05f: getfield nh4.oqj D
      // 062: invokestatic fe6.jqf (D)I
      // 065: bipush 1
      // 066: iadd
      // 067: if_icmpge 0f9
      // 06a: invokestatic c05.vz1 ()Lc05;
      // 06d: getfield c05.tij Lkh3;
      // 070: new mew
      // 073: dup
      // 074: iload 3
      // 075: iload 2
      // 076: iload 4
      // 078: invokespecial mew.<init> (III)V
      // 07b: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 07e: invokeinterface zfz.r_y ()Le0x; 1
      // 083: astore 5
      // 085: iload 0
      // 086: ifne 0f5
      // 089: aload 5
      // 08b: invokestatic java/util/Objects.nonNull (Ljava/lang/Object;)Z
      // 08e: iload 0
      // 08f: ifne 02b
      // 092: goto 099
      // 095: invokestatic bk4.a (Loov;)Loov;
      // 098: athrow
      // 099: ifeq 0f2
      // 09c: aload 5
      // 09e: instanceof n47
      // 0a1: iload 0
      // 0a2: ifne 0c2
      // 0a5: goto 0ac
      // 0a8: invokestatic bk4.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: ifne 0f2
      // 0af: goto 0b6
      // 0b2: invokestatic bk4.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 5
      // 0b8: instanceof f_b
      // 0bb: goto 0c2
      // 0be: invokestatic bk4.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: iload 0
      // 0c3: ifne 0f1
      // 0c6: ifne 0f0
      // 0c9: goto 0d0
      // 0cc: invokestatic bk4.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 5
      // 0d2: instanceof pcl
      // 0d5: iload 0
      // 0d6: ifne 0f1
      // 0d9: goto 0e0
      // 0dc: invokestatic bk4.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: ifne 0f0
      // 0e3: goto 0ea
      // 0e6: invokestatic bk4.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: bipush 0
      // 0eb: ireturn
      // 0ec: invokestatic bk4.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: bipush 1
      // 0f1: istore 1
      // 0f2: iinc 4 1
      // 0f5: iload 0
      // 0f6: ifeq 054
      // 0f9: iinc 3 1
      // 0fc: iload 0
      // 0fd: ifeq 02a
      // 100: iload 1
      // 101: iload 0
      // 102: ifne 12e
      // 105: ifne 12d
      // 108: goto 10f
      // 10b: invokestatic bk4.a (Loov;)Loov;
      // 10e: athrow
      // 10f: invokestatic c05.vz1 ()Lc05;
      // 112: getfield c05.vg8 Ll86;
      // 115: invokevirtual l86.z2m ()Z
      // 118: iload 0
      // 119: ifne 12e
      // 11c: goto 123
      // 11f: invokestatic bk4.a (Loov;)Loov;
      // 122: athrow
      // 123: ifeq 131
      // 126: goto 12d
      // 129: invokestatic bk4.a (Loov;)Loov;
      // 12c: athrow
      // 12d: bipush 1
      // 12e: goto 132
      // 131: bipush 0
      // 132: ireturn
   }

   public static boolean da2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 0
      // 004: invokestatic c05.vz1 ()Lc05;
      // 007: getfield c05.vg8 Ll86;
      // 00a: invokevirtual l86.aaw ()Lnh4;
      // 00d: getfield nh4.rlc D
      // 010: invokestatic fe6.jqf (D)I
      // 013: istore 1
      // 014: iload 1
      // 015: invokestatic c05.vz1 ()Lc05;
      // 018: getfield c05.vg8 Ll86;
      // 01b: invokevirtual l86.aaw ()Lnh4;
      // 01e: getfield nh4.t_2 D
      // 021: invokestatic fe6.jqf (D)I
      // 024: bipush 1
      // 025: iadd
      // 026: if_icmpge 144
      // 029: invokestatic c05.vz1 ()Lc05;
      // 02c: getfield c05.vg8 Ll86;
      // 02f: invokevirtual l86.aaw ()Lnh4;
      // 032: getfield nh4.bx_ D
      // 035: invokestatic fe6.jqf (D)I
      // 038: iload 0
      // 039: ifne 145
      // 03c: istore 2
      // 03d: iload 2
      // 03e: invokestatic c05.vz1 ()Lc05;
      // 041: getfield c05.vg8 Ll86;
      // 044: invokevirtual l86.aaw ()Lnh4;
      // 047: getfield nh4.i2c D
      // 04a: invokestatic fe6.jqf (D)I
      // 04d: bipush 1
      // 04e: iadd
      // 04f: if_icmpge 13d
      // 052: invokestatic c05.vz1 ()Lc05;
      // 055: getfield c05.vg8 Ll86;
      // 058: invokevirtual l86.aaw ()Lnh4;
      // 05b: getfield nh4.t8n D
      // 05e: invokestatic fe6.jqf (D)I
      // 061: iload 0
      // 062: ifne 015
      // 065: istore 3
      // 066: iload 3
      // 067: invokestatic c05.vz1 ()Lc05;
      // 06a: getfield c05.vg8 Ll86;
      // 06d: invokevirtual l86.aaw ()Lnh4;
      // 070: getfield nh4.oqj D
      // 073: invokestatic fe6.jqf (D)I
      // 076: bipush 1
      // 077: iadd
      // 078: if_icmpge 136
      // 07b: invokestatic c05.vz1 ()Lc05;
      // 07e: getfield c05.tij Lkh3;
      // 081: new mew
      // 084: dup
      // 085: iload 1
      // 086: iload 2
      // 087: iload 3
      // 088: invokespecial mew.<init> (III)V
      // 08b: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 08e: invokeinterface zfz.r_y ()Le0x; 1
      // 093: astore 4
      // 095: iload 0
      // 096: ifne 139
      // 099: iload 0
      // 09a: ifne 132
      // 09d: goto 0a4
      // 0a0: invokestatic bk4.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 4
      // 0a6: ifnull 12f
      // 0a9: goto 0b0
      // 0ac: invokestatic bk4.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 4
      // 0b2: iload 0
      // 0b3: ifne 0d3
      // 0b6: goto 0bd
      // 0b9: invokestatic bk4.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: instanceof n47
      // 0c0: ifne 12f
      // 0c3: goto 0ca
      // 0c6: invokestatic bk4.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 4
      // 0cc: goto 0d3
      // 0cf: invokestatic bk4.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: invokestatic c05.vz1 ()Lc05;
      // 0d6: getfield c05.tij Lkh3;
      // 0d9: new mew
      // 0dc: dup
      // 0dd: iload 1
      // 0de: iload 2
      // 0df: iload 3
      // 0e0: invokespecial mew.<init> (III)V
      // 0e3: invokestatic c05.vz1 ()Lc05;
      // 0e6: getfield c05.tij Lkh3;
      // 0e9: new mew
      // 0ec: dup
      // 0ed: iload 1
      // 0ee: iload 2
      // 0ef: iload 3
      // 0f0: invokespecial mew.<init> (III)V
      // 0f3: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 0f6: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 0f9: dup
      // 0fa: astore 5
      // 0fc: iload 0
      // 0fd: ifne 11a
      // 100: ifnull 12f
      // 103: goto 10a
      // 106: invokestatic bk4.a (Loov;)Loov;
      // 109: athrow
      // 10a: invokestatic c05.vz1 ()Lc05;
      // 10d: getfield c05.vg8 Ll86;
      // 110: invokevirtual l86.aaw ()Lnh4;
      // 113: goto 11a
      // 116: invokestatic bk4.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 5
      // 11c: invokevirtual nh4.epq (Lnh4;)Z
      // 11f: iload 0
      // 120: ifne 12e
      // 123: ifeq 12f
      // 126: goto 12d
      // 129: invokestatic bk4.a (Loov;)Loov;
      // 12c: athrow
      // 12d: bipush 1
      // 12e: ireturn
      // 12f: iinc 3 1
      // 132: iload 0
      // 133: ifeq 066
      // 136: iinc 2 1
      // 139: iload 0
      // 13a: ifeq 03d
      // 13d: iinc 1 1
      // 140: iload 0
      // 141: ifeq 014
      // 144: bipush 0
      // 145: ireturn
   }

   public static float[] cmx(double var0, double var2, double var4) {
      double var6 = var0 - c05.vz1().vg8.o2v + 0.5;
      double var8 = var4 - c05.vz1().vg8.vbd + 0.5;
      double var10 = var2 - (c05.vz1().vg8.kfp + (double)c05.vz1().vg8.c5y() - 1.0);
      double var12 = (double)fe6.dii(var6 * var6 + var8 * var8);
      float var14 = (float)(Math.atan2(var8, var6) * 180.0 / Math.PI) - 90.0F;
      return new float[]{var14, (float)(-Math.atan2(var10, var12) * 180.0 / Math.PI)};
   }

   private static float[] jw8(i2h var0) {
      double var1 = var0.o2v - c05.vz1().vg8.o2v;
      double var3 = var0.kfp - (c05.vz1().vg8.kfp + (double)c05.vz1().vg8.c5y());
      double var5 = var0.vbd - c05.vz1().vg8.vbd;
      double var7 = (double)fe6.dii(var1 * var1 + var5 * var5);
      float var9 = (float)(Math.atan2(var5, var1) * 180.0 / Math.PI) - 90.0F;
      float var10 = (float)(-(Math.atan2(var3, var7) * 180.0 / Math.PI));
      return new float[]{var9, var10};
   }

   public static boolean a3k(mew var0) {
      return _82(var0).ujd(c05.vz1().tij, var0);
   }

   public static boolean ab3(mew var0) {
      return _82(var0).qc_(c05.vz1().tij.getBlockState(var0), false);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8135119113749449475L, 4444238549757092198L, MethodHandles.lookup().lookupClass()).a(62359727409645L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 25309890527569L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("diÙx´7A\u0015".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
