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

public class w4e extends e0x {
   public static final qx_ kyp;
   public static final h76 tlp;
   public static final zb_ m_q;
   public static final h76 g92;
   public static final zb_ raj;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public w4e(p3y var1) {
      super(var1);
      this.y8l(this._8_.c32().zvi(kyp, vt2.z9q).zvi(tlp, false).zvi(m_q, w4e$d2r.cd4).zvi(g92, false).zvi(raj, w4e$w0e.lf4));
   }

   @Override
   public String ieu() {
      long var1 = b ^ 55303130741540L;
      return orr.zgh(
         (this.abc() + b<"i">(1762, 5065658248237417007L ^ var1))
            .replaceAll(b<"i">(26582, 7769740812014543640L ^ var1), b<"i">(18570, 5445010422531148869L ^ var1))
      );
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean iwf(m5n var1, mew var2) {
      return y4c(fb6(var1, var2));
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public nh4 j54(OpaquePredicate var1, mew var2) {
      this.c7i(var1, var2);
      return super.j54(var1, var2);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      this.c7i(var1, var2);
      return super.m__(var1, var2, var3);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.n0s(fb6(var1, var2));
   }

   private void n0s(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 0.1875
      // 002: nop
      // 003: fstore 3
      // 004: invokestatic OpaquePredicate.b ()I
      // 007: aload 0
      // 008: fconst_0
      // 009: fconst_0
      // 00a: fconst_0
      // 00b: fconst_1
      // 00c: fconst_2
      // 00d: fconst_1
      // 00e: invokevirtual w4e.xl4 (FFFFFF)V
      // 011: istore 2
      // 012: iload 1
      // 013: invokestatic w4e.zp6 (I)Lvt2;
      // 016: astore 4
      // 018: iload 1
      // 019: invokestatic w4e.y4c (I)Z
      // 01c: istore 5
      // 01e: iload 1
      // 01f: invokestatic w4e.f70 (I)Z
      // 022: istore 6
      // 024: iload 5
      // 026: ifeq 166
      // 029: aload 4
      // 02b: getstatic vt2.zk4 Lvt2;
      // 02e: iload 2
      // 02f: ifeq 087
      // 032: goto 039
      // 035: invokestatic w4e.a (Loov;)Loov;
      // 038: athrow
      // 039: if_acmpne 07b
      // 03c: goto 043
      // 03f: invokestatic w4e.a (Loov;)Loov;
      // 042: athrow
      // 043: iload 6
      // 045: ifne 064
      // 048: goto 04f
      // 04b: invokestatic w4e.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: fconst_0
      // 051: fconst_0
      // 052: fconst_0
      // 053: fconst_1
      // 054: fconst_1
      // 055: fload 3
      // 056: invokevirtual w4e.xl4 (FFFFFF)V
      // 059: iload 2
      // 05a: ifne 217
      // 05d: goto 064
      // 060: invokestatic w4e.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 0
      // 065: fconst_0
      // 066: fconst_0
      // 067: fconst_1
      // 068: fload 3
      // 069: fsub
      // 06a: fconst_1
      // 06b: fconst_1
      // 06c: fconst_1
      // 06d: invokevirtual w4e.xl4 (FFFFFF)V
      // 070: iload 2
      // 071: ifne 217
      // 074: goto 07b
      // 077: invokestatic w4e.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 4
      // 07d: getstatic vt2.mxp Lvt2;
      // 080: goto 087
      // 083: invokestatic w4e.a (Loov;)Loov;
      // 086: athrow
      // 087: iload 2
      // 088: ifeq 0d9
      // 08b: if_acmpne 0cd
      // 08e: goto 095
      // 091: invokestatic w4e.a (Loov;)Loov;
      // 094: athrow
      // 095: iload 6
      // 097: ifne 0b8
      // 09a: goto 0a1
      // 09d: invokestatic w4e.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: fconst_1
      // 0a3: fload 3
      // 0a4: fsub
      // 0a5: fconst_0
      // 0a6: fconst_0
      // 0a7: fconst_1
      // 0a8: fconst_1
      // 0a9: fconst_1
      // 0aa: invokevirtual w4e.xl4 (FFFFFF)V
      // 0ad: iload 2
      // 0ae: ifne 217
      // 0b1: goto 0b8
      // 0b4: invokestatic w4e.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: fconst_0
      // 0ba: fconst_0
      // 0bb: fconst_0
      // 0bc: fload 3
      // 0bd: fconst_1
      // 0be: fconst_1
      // 0bf: invokevirtual w4e.xl4 (FFFFFF)V
      // 0c2: iload 2
      // 0c3: ifne 217
      // 0c6: goto 0cd
      // 0c9: invokestatic w4e.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 4
      // 0cf: getstatic vt2.te4 Lvt2;
      // 0d2: goto 0d9
      // 0d5: invokestatic w4e.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iload 2
      // 0da: ifeq 12b
      // 0dd: if_acmpne 11f
      // 0e0: goto 0e7
      // 0e3: invokestatic w4e.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 6
      // 0e9: ifne 10a
      // 0ec: goto 0f3
      // 0ef: invokestatic w4e.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: fconst_0
      // 0f5: fconst_0
      // 0f6: fconst_1
      // 0f7: fload 3
      // 0f8: fsub
      // 0f9: fconst_1
      // 0fa: fconst_1
      // 0fb: fconst_1
      // 0fc: invokevirtual w4e.xl4 (FFFFFF)V
      // 0ff: iload 2
      // 100: ifne 217
      // 103: goto 10a
      // 106: invokestatic w4e.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: fconst_0
      // 10c: fconst_0
      // 10d: fconst_0
      // 10e: fconst_1
      // 10f: fconst_1
      // 110: fload 3
      // 111: invokevirtual w4e.xl4 (FFFFFF)V
      // 114: iload 2
      // 115: ifne 217
      // 118: goto 11f
      // 11b: invokestatic w4e.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 4
      // 121: getstatic vt2.z9q Lvt2;
      // 124: goto 12b
      // 127: invokestatic w4e.a (Loov;)Loov;
      // 12a: athrow
      // 12b: if_acmpne 217
      // 12e: iload 6
      // 130: ifne 14f
      // 133: goto 13a
      // 136: invokestatic w4e.a (Loov;)Loov;
      // 139: athrow
      // 13a: aload 0
      // 13b: fconst_0
      // 13c: fconst_0
      // 13d: fconst_0
      // 13e: fload 3
      // 13f: fconst_1
      // 140: fconst_1
      // 141: invokevirtual w4e.xl4 (FFFFFF)V
      // 144: iload 2
      // 145: ifne 217
      // 148: goto 14f
      // 14b: invokestatic w4e.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 0
      // 150: fconst_1
      // 151: fload 3
      // 152: fsub
      // 153: fconst_0
      // 154: fconst_0
      // 155: fconst_1
      // 156: fconst_1
      // 157: fconst_1
      // 158: invokevirtual w4e.xl4 (FFFFFF)V
      // 15b: iload 2
      // 15c: ifne 217
      // 15f: goto 166
      // 162: invokestatic w4e.a (Loov;)Loov;
      // 165: athrow
      // 166: aload 4
      // 168: getstatic vt2.zk4 Lvt2;
      // 16b: iload 2
      // 16c: ifeq 1a1
      // 16f: goto 176
      // 172: invokestatic w4e.a (Loov;)Loov;
      // 175: athrow
      // 176: if_acmpne 195
      // 179: goto 180
      // 17c: invokestatic w4e.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: fconst_0
      // 182: fconst_0
      // 183: fconst_0
      // 184: fload 3
      // 185: fconst_1
      // 186: fconst_1
      // 187: invokevirtual w4e.xl4 (FFFFFF)V
      // 18a: iload 2
      // 18b: ifne 217
      // 18e: goto 195
      // 191: invokestatic w4e.a (Loov;)Loov;
      // 194: athrow
      // 195: aload 4
      // 197: getstatic vt2.mxp Lvt2;
      // 19a: goto 1a1
      // 19d: invokestatic w4e.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: iload 2
      // 1a2: ifeq 1d0
      // 1a5: if_acmpne 1c4
      // 1a8: goto 1af
      // 1ab: invokestatic w4e.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 0
      // 1b0: fconst_0
      // 1b1: fconst_0
      // 1b2: fconst_0
      // 1b3: fconst_1
      // 1b4: fconst_1
      // 1b5: fload 3
      // 1b6: invokevirtual w4e.xl4 (FFFFFF)V
      // 1b9: iload 2
      // 1ba: ifne 217
      // 1bd: goto 1c4
      // 1c0: invokestatic w4e.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 4
      // 1c6: getstatic vt2.te4 Lvt2;
      // 1c9: goto 1d0
      // 1cc: invokestatic w4e.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: iload 2
      // 1d1: ifeq 201
      // 1d4: if_acmpne 1f5
      // 1d7: goto 1de
      // 1da: invokestatic w4e.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: fconst_1
      // 1e0: fload 3
      // 1e1: fsub
      // 1e2: fconst_0
      // 1e3: fconst_0
      // 1e4: fconst_1
      // 1e5: fconst_1
      // 1e6: fconst_1
      // 1e7: invokevirtual w4e.xl4 (FFFFFF)V
      // 1ea: iload 2
      // 1eb: ifne 217
      // 1ee: goto 1f5
      // 1f1: invokestatic w4e.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: aload 4
      // 1f7: getstatic vt2.z9q Lvt2;
      // 1fa: goto 201
      // 1fd: invokestatic w4e.a (Loov;)Loov;
      // 200: athrow
      // 201: if_acmpne 217
      // 204: aload 0
      // 205: fconst_0
      // 206: fconst_0
      // 207: fconst_1
      // 208: fload 3
      // 209: fsub
      // 20a: fconst_1
      // 20b: fconst_1
      // 20c: fconst_1
      // 20d: invokevirtual w4e.xl4 (FFFFFF)V
      // 210: goto 217
      // 213: invokestatic w4e.a (Loov;)Loov;
      // 216: athrow
      // 217: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 0
      // 06: getfield w4e.kgd Lp3y;
      // 09: getstatic p3y.e21 Lp3y;
      // 0c: if_acmpne 15
      // 0f: bipush 1
      // 10: ireturn
      // 11: invokestatic w4e.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 3
      // 16: getstatic w4e.raj Lzb_;
      // 19: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1e: getstatic w4e$w0e.lf4 Lw4e$w0e;
      // 21: if_acmpne 2c
      // 24: aload 2
      // 25: goto 30
      // 28: invokestatic w4e.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 2
      // 2d: invokevirtual mew.eve ()Lmew;
      // 30: astore 10
      // 32: aload 2
      // 33: aload 10
      // 35: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 38: ifeq 43
      // 3b: aload 3
      // 3c: goto 49
      // 3f: invokestatic w4e.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 1
      // 44: aload 10
      // 46: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 49: astore 11
      // 4b: aload 11
      // 4d: iload 9
      // 4f: ifne 72
      // 52: invokeinterface zfz.r_y ()Le0x; 1
      // 57: aload 0
      // 58: if_acmpeq 68
      // 5b: goto 62
      // 5e: invokestatic w4e.a (Loov;)Loov;
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
      // 64: invokestatic w4e.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 11
      // 6a: getstatic w4e.tlp Lh76;
      // 6d: invokeinterface zfz.dm4 (Lxny;)Lzfz; 2
      // 72: astore 3
      // 73: aload 1
      // 74: aload 10
      // 76: aload 3
      // 77: bipush 2
      // 78: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 7b: pop
      // 7c: aload 1
      // 7d: aload 10
      // 7f: aload 2
      // 80: invokevirtual OpaquePredicate.bi9 (Lmew;Lmew;)V
      // 83: aload 1
      // 84: aload 4
      // 86: aload 3
      // 87: getstatic w4e.tlp Lh76;
      // 8a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 8f: checkcast java/lang/Boolean
      // 92: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 95: iload 9
      // 97: ifne a7
      // 9a: ifeq aa
      // 9d: goto a4
      // a0: invokestatic w4e.a (Loov;)Loov;
      // a3: athrow
      // a4: sipush 1003
      // a7: goto ad
      // aa: sipush 1006
      // ad: aload 2
      // ae: bipush 0
      // af: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // b2: bipush 1
      // b3: ireturn
   }

   public void cl0(OpaquePredicate param1, mew param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a: astore 5
      // 0c: aload 5
      // 0e: iload 4
      // 10: ifeq 2c
      // 13: invokeinterface zfz.r_y ()Le0x; 1
      // 18: aload 0
      // 19: if_acmpne e4
      // 1c: goto 23
      // 1f: invokestatic w4e.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 5
      // 25: goto 2c
      // 28: invokestatic w4e.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic w4e.raj Lzb_;
      // 2f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 34: getstatic w4e$w0e.lf4 Lw4e$w0e;
      // 37: if_acmpne 42
      // 3a: aload 2
      // 3b: goto 46
      // 3e: invokestatic w4e.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 2
      // 43: invokevirtual mew.eve ()Lmew;
      // 46: astore 6
      // 48: aload 2
      // 49: aload 6
      // 4b: if_acmpne 57
      // 4e: aload 5
      // 50: goto 5d
      // 53: invokestatic w4e.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 1
      // 58: aload 6
      // 5a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 5d: astore 7
      // 5f: aload 7
      // 61: iload 4
      // 63: ifeq 7f
      // 66: invokeinterface zfz.r_y ()Le0x; 1
      // 6b: aload 0
      // 6c: if_acmpne e4
      // 6f: goto 76
      // 72: invokestatic w4e.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 7
      // 78: goto 7f
      // 7b: invokestatic w4e.a (Loov;)Loov;
      // 7e: athrow
      // 7f: getstatic w4e.tlp Lh76;
      // 82: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 87: checkcast java/lang/Boolean
      // 8a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8d: iload 4
      // 8f: ifeq b9
      // 92: iload 3
      // 93: if_icmpeq e4
      // 96: goto 9d
      // 99: invokestatic w4e.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 1
      // 9e: aload 6
      // a0: aload 7
      // a2: getstatic w4e.tlp Lh76;
      // a5: iload 3
      // a6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // ae: bipush 2
      // af: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // b2: goto b9
      // b5: invokestatic w4e.a (Loov;)Loov;
      // b8: athrow
      // b9: pop
      // ba: aload 1
      // bb: aload 6
      // bd: aload 2
      // be: invokevirtual OpaquePredicate.bi9 (Lmew;Lmew;)V
      // c1: aload 1
      // c2: aconst_null
      // c3: checkcast ha9
      // c6: iload 3
      // c7: iload 4
      // c9: ifeq d9
      // cc: ifeq dc
      // cf: goto d6
      // d2: invokestatic w4e.a (Loov;)Loov;
      // d5: athrow
      // d6: sipush 1003
      // d9: goto df
      // dc: sipush 1006
      // df: aload 2
      // e0: bipush 0
      // e1: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // e4: return
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 5
      // 005: aload 3
      // 006: getstatic w4e.raj Lzb_;
      // 009: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 00e: getstatic w4e$w0e._bw Lw4e$w0e;
      // 011: if_acmpne 06f
      // 014: aload 2
      // 015: invokevirtual mew.eve ()Lmew;
      // 018: astore 6
      // 01a: aload 1
      // 01b: aload 6
      // 01d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 020: astore 7
      // 022: aload 7
      // 024: invokeinterface zfz.r_y ()Le0x; 1
      // 029: aload 0
      // 02a: iload 5
      // 02c: ifeq 055
      // 02f: if_acmpeq 04b
      // 032: goto 039
      // 035: invokestatic w4e.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 1
      // 03a: aload 2
      // 03b: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 03e: pop
      // 03f: iload 5
      // 041: ifne 06a
      // 044: goto 04b
      // 047: invokestatic w4e.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 4
      // 04d: aload 0
      // 04e: goto 055
      // 051: invokestatic w4e.a (Loov;)Loov;
      // 054: athrow
      // 055: if_acmpeq 06a
      // 058: aload 0
      // 059: aload 1
      // 05a: aload 6
      // 05c: aload 7
      // 05e: aload 4
      // 060: invokevirtual w4e.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 063: goto 06a
      // 066: invokestatic w4e.a (Loov;)Loov;
      // 069: athrow
      // 06a: iload 5
      // 06c: ifne 23b
      // 06f: bipush 0
      // 070: istore 6
      // 072: aload 2
      // 073: invokevirtual mew.nuv ()Lmew;
      // 076: astore 7
      // 078: aload 1
      // 079: aload 7
      // 07b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 07e: astore 8
      // 080: iload 5
      // 082: ifeq 0a4
      // 085: aload 8
      // 087: invokeinterface zfz.r_y ()Le0x; 1
      // 08c: aload 0
      // 08d: if_acmpeq 0a7
      // 090: goto 097
      // 093: invokestatic w4e.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 1
      // 098: aload 2
      // 099: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 09c: pop
      // 09d: goto 0a4
      // 0a0: invokestatic w4e.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: bipush 1
      // 0a5: istore 6
      // 0a7: aload 1
      // 0a8: aload 2
      // 0a9: invokevirtual mew.eve ()Lmew;
      // 0ac: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 0af: iload 5
      // 0b1: ifeq 0ee
      // 0b4: ifne 0ec
      // 0b7: goto 0be
      // 0ba: invokestatic w4e.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 1
      // 0bf: aload 2
      // 0c0: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 0c3: pop
      // 0c4: bipush 1
      // 0c5: iload 5
      // 0c7: ifeq 0ee
      // 0ca: goto 0d1
      // 0cd: invokestatic w4e.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: istore 6
      // 0d3: aload 8
      // 0d5: invokeinterface zfz.r_y ()Le0x; 1
      // 0da: aload 0
      // 0db: if_acmpne 0ec
      // 0de: aload 1
      // 0df: aload 7
      // 0e1: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 0e4: pop
      // 0e5: goto 0ec
      // 0e8: invokestatic w4e.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: iload 6
      // 0ee: iload 5
      // 0f0: ifeq 12b
      // 0f3: ifeq 11f
      // 0f6: goto 0fd
      // 0f9: invokestatic w4e.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 1
      // 0fe: getfield OpaquePredicate.v0f Z
      // 101: ifne 23b
      // 104: goto 10b
      // 107: invokestatic w4e.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: aload 1
      // 10d: aload 2
      // 10e: aload 3
      // 10f: bipush 0
      // 110: invokevirtual w4e.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 113: iload 5
      // 115: ifne 23b
      // 118: goto 11f
      // 11b: invokestatic w4e.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 1
      // 120: aload 2
      // 121: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 124: goto 12b
      // 127: invokestatic w4e.a (Loov;)Loov;
      // 12a: athrow
      // 12b: iload 5
      // 12d: ifeq 157
      // 130: ifne 156
      // 133: goto 13a
      // 136: invokestatic w4e.a (Loov;)Loov;
      // 139: athrow
      // 13a: aload 1
      // 13b: aload 7
      // 13d: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 140: iload 5
      // 142: ifeq 157
      // 145: goto 14c
      // 148: invokestatic w4e.a (Loov;)Loov;
      // 14b: athrow
      // 14c: ifeq 15a
      // 14f: goto 156
      // 152: invokestatic w4e.a (Loov;)Loov;
      // 155: athrow
      // 156: bipush 1
      // 157: goto 15b
      // 15a: bipush 0
      // 15b: istore 9
      // 15d: iload 9
      // 15f: iload 5
      // 161: ifeq 186
      // 164: ifne 189
      // 167: goto 16e
      // 16a: invokestatic w4e.a (Loov;)Loov;
      // 16d: athrow
      // 16e: aload 4
      // 170: iload 5
      // 172: ifeq 18b
      // 175: goto 17c
      // 178: invokestatic w4e.a (Loov;)Loov;
      // 17b: athrow
      // 17c: invokevirtual e0x.scl ()Z
      // 17f: goto 186
      // 182: invokestatic w4e.a (Loov;)Loov;
      // 185: athrow
      // 186: ifeq 23b
      // 189: aload 4
      // 18b: aload 0
      // 18c: if_acmpeq 23b
      // 18f: iload 9
      // 191: aload 8
      // 193: getstatic w4e.g92 Lh76;
      // 196: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 19b: checkcast java/lang/Boolean
      // 19e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a1: iload 5
      // 1a3: ifeq 1f2
      // 1a6: goto 1ad
      // 1a9: invokestatic w4e.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: if_icmpeq 23b
      // 1b0: goto 1b7
      // 1b3: invokestatic w4e.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 1
      // 1b8: aload 7
      // 1ba: aload 8
      // 1bc: getstatic w4e.g92 Lh76;
      // 1bf: iload 9
      // 1c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1c4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1c9: bipush 2
      // 1ca: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1cd: pop
      // 1ce: iload 9
      // 1d0: iload 5
      // 1d2: ifeq 210
      // 1d5: goto 1dc
      // 1d8: invokestatic w4e.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 3
      // 1dd: getstatic w4e.tlp Lh76;
      // 1e0: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1e5: checkcast java/lang/Boolean
      // 1e8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1eb: goto 1f2
      // 1ee: invokestatic w4e.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: if_icmpeq 23b
      // 1f5: aload 1
      // 1f6: aload 2
      // 1f7: aload 3
      // 1f8: getstatic w4e.tlp Lh76;
      // 1fb: iload 9
      // 1fd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 200: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 205: bipush 2
      // 206: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 209: goto 210
      // 20c: invokestatic w4e.a (Loov;)Loov;
      // 20f: athrow
      // 210: pop
      // 211: aload 1
      // 212: aload 2
      // 213: aload 2
      // 214: invokevirtual OpaquePredicate.bi9 (Lmew;Lmew;)V
      // 217: aload 1
      // 218: aconst_null
      // 219: checkcast ha9
      // 21c: iload 9
      // 21e: iload 5
      // 220: ifeq 230
      // 223: ifeq 233
      // 226: goto 22d
      // 229: invokestatic w4e.a (Loov;)Loov;
      // 22c: athrow
      // 22d: sipush 1003
      // 230: goto 236
      // 233: sipush 1006
      // 236: aload 2
      // 237: bipush 0
      // 238: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // 23b: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      try {
         if (var1.dil(raj) == w4e$w0e._bw) {
            return null;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return this.gf0();
   }

   @Override
   public akm mns(OpaquePredicate var1, mew var2, fqr var3, fqr var4) {
      this.c7i(var1, var2);
      return super.mns(var1, var2, var3, var4);
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
      // 04: aload 2
      // 05: invokevirtual mew.getY ()I
      // 08: iload 3
      // 09: ifeq 29
      // 0c: sipush 255
      // 0f: if_icmplt 21
      // 12: goto 19
      // 15: invokestatic w4e.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: goto 75
      // 1d: invokestatic w4e.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: aload 2
      // 23: invokevirtual mew.eve ()Lmew;
      // 26: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 29: iload 3
      // 2a: ifeq 44
      // 2d: ifeq 74
      // 30: goto 37
      // 33: invokestatic w4e.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: aload 2
      // 3a: invokespecial e0x.ctq (Lt9d;Lmew;)Z
      // 3d: goto 44
      // 40: invokestatic w4e.a (Loov;)Loov;
      // 43: athrow
      // 44: iload 3
      // 45: ifeq 62
      // 48: ifeq 74
      // 4b: goto 52
      // 4e: invokestatic w4e.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: aload 1
      // 54: aload 2
      // 55: invokevirtual mew.nuv ()Lmew;
      // 58: invokespecial e0x.ctq (Lt9d;Lmew;)Z
      // 5b: goto 62
      // 5e: invokestatic w4e.a (Loov;)Loov;
      // 61: athrow
      // 62: iload 3
      // 63: ifeq 71
      // 66: ifeq 74
      // 69: goto 70
      // 6c: invokestatic w4e.a (Loov;)Loov;
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   @Override
   public int quv() {
      return 1;
   }

   public static int fb6(m5n var0, mew var1) {
      zfz var3 = var0.getBlockState(var1);
      int var4 = var3.r_y().hvp(var3);
      byte var5 = i5b(var4);
      int var10000 = OpaquePredicate.b();
      zfz var6 = var0.getBlockState(var1.eve());
      int var2 = var10000;
      int var7 = var6.r_y().hvp(var6);

      label132: {
         label131: {
            try {
               var10000 = var5;
               if (var2 == 0) {
                  break label132;
               }

               if (var5 != 0) {
                  break label131;
               }
            } catch (oov var20) {
               throw a(var20);
            }

            var10000 = var4;
            break label132;
         }

         var10000 = var7;
      }

      int var8 = var10000;
      zfz var9 = var0.getBlockState(var1.nuv());
      int var10 = var9.r_y().hvp(var9);

      label122: {
         label121: {
            try {
               var10000 = var5;
               if (var2 == 0) {
                  break label122;
               }

               if (var5 != 0) {
                  break label121;
               }
            } catch (oov var19) {
               throw a(var19);
            }

            var10000 = var10;
            break label122;
         }

         var10000 = var4;
      }

      int var11 = var10000;

      label112: {
         label111: {
            try {
               var10000 = var11 & 1;
               if (var2 == 0) {
                  break label112;
               }

               if (var10000 != 0) {
                  break label111;
               }
            } catch (oov var18) {
               throw a(var18);
            }

            var10000 = 0;
            break label112;
         }

         var10000 = 1;
      }

      int var12 = var10000;

      label102: {
         label101: {
            try {
               var10000 = var11 & 2;
               if (var2 == 0) {
                  break label102;
               }

               if (var10000 != 0) {
                  break label101;
               }
            } catch (oov var17) {
               throw a(var17);
            }

            var10000 = 0;
            break label102;
         }

         var10000 = 1;
      }

      int var13 = var10000;

      byte var10001;
      label92: {
         label91: {
            try {
               var10000 = w5z(var8);
               var10001 = var5;
               if (var2 == 0) {
                  break label92;
               }

               if (var5 != 0) {
                  break label91;
               }
            } catch (oov var16) {
               throw a(var16);
            }

            var10001 = 0;
            break label92;
         }

         var10001 = 8;
      }

      label83: {
         label82: {
            try {
               var10000 |= var10001;
               var10001 = var12;
               if (var2 == 0) {
                  break label83;
               }

               if (var12 != 0) {
                  break label82;
               }
            } catch (oov var15) {
               throw a(var15);
            }

            var10001 = 0;
            break label83;
         }

         var10001 = 16;
      }

      try {
         var10000 |= var10001;
         if (var2 == 0) {
            return var10000 | var13;
         }

         if (var13 != 0) {
            return var10000 | 32;
         }
      } catch (oov var14) {
         throw a(var14);
      }

      return var10000 | 0;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return this.gf0();
   }

   private u7m gf0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getstatic ox_.oof Le0x;
      // 08: iload 1
      // 09: ifeq 24
      // 0c: if_acmpne 20
      // 0f: goto 16
      // 12: invokestatic w4e.a (Loov;)Loov;
      // 15: athrow
      // 16: getstatic xbr.v7b Lu7m;
      // 19: goto a4
      // 1c: invokestatic w4e.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getstatic ox_.nc8 Le0x;
      // 24: iload 1
      // 25: ifeq 40
      // 28: if_acmpne 3c
      // 2b: goto 32
      // 2e: invokestatic w4e.a (Loov;)Loov;
      // 31: athrow
      // 32: getstatic xbr.en6 Lu7m;
      // 35: goto a4
      // 38: invokestatic w4e.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getstatic ox_.g8l Le0x;
      // 40: iload 1
      // 41: ifeq 5c
      // 44: if_acmpne 58
      // 47: goto 4e
      // 4a: invokestatic w4e.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic xbr.mn2 Lu7m;
      // 51: goto a4
      // 54: invokestatic w4e.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getstatic ox_.o_8 Le0x;
      // 5c: iload 1
      // 5d: ifeq 78
      // 60: if_acmpne 74
      // 63: goto 6a
      // 66: invokestatic w4e.a (Loov;)Loov;
      // 69: athrow
      // 6a: getstatic xbr.h_l Lu7m;
      // 6d: goto a4
      // 70: invokestatic w4e.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: getstatic ox_.t24 Le0x;
      // 78: iload 1
      // 79: ifeq 94
      // 7c: if_acmpne 90
      // 7f: goto 86
      // 82: invokestatic w4e.a (Loov;)Loov;
      // 85: athrow
      // 86: getstatic xbr.qli Lu7m;
      // 89: goto a4
      // 8c: invokestatic w4e.a (Loov;)Loov;
      // 8f: athrow
      // 90: aload 0
      // 91: getstatic ox_.u7q Le0x;
      // 94: if_acmpne a1
      // 97: getstatic xbr.tyz Lu7m;
      // 9a: goto a4
      // 9d: invokestatic w4e.a (Loov;)Loov;
      // a0: athrow
      // a1: getstatic xbr.q_x Lu7m;
      // a4: areturn
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 2
      // 06: invokevirtual mew.eve ()Lmew;
      // 09: astore 6
      // 0b: aload 4
      // 0d: getfield ha9.lls Lpj2;
      // 10: getfield pj2.g40 Z
      // 13: ifeq 68
      // 16: aload 3
      // 17: iload 5
      // 19: ifne 51
      // 1c: goto 23
      // 1f: invokestatic w4e.a (Loov;)Loov;
      // 22: athrow
      // 23: getstatic w4e.raj Lzb_;
      // 26: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2b: getstatic w4e$w0e._bw Lw4e$w0e;
      // 2e: if_acmpne 68
      // 31: goto 38
      // 34: invokestatic w4e.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: aload 6
      // 3b: iload 5
      // 3d: ifne 64
      // 40: goto 47
      // 43: invokestatic w4e.a (Loov;)Loov;
      // 46: athrow
      // 47: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 4a: goto 51
      // 4d: invokestatic w4e.a (Loov;)Loov;
      // 50: athrow
      // 51: invokeinterface zfz.r_y ()Le0x; 1
      // 56: aload 0
      // 57: if_acmpne 68
      // 5a: aload 1
      // 5b: aload 6
      // 5d: goto 64
      // 60: invokestatic w4e.a (Loov;)Loov;
      // 63: athrow
      // 64: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 67: pop
      // 68: return
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifeq 86
      // 0b: getstatic w4e.raj Lzb_;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: getstatic w4e$w0e.lf4 Lw4e$w0e;
      // 16: if_acmpne 75
      // 19: goto 20
      // 1c: invokestatic w4e.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: aload 3
      // 22: invokevirtual mew.nuv ()Lmew;
      // 25: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 2a: astore 5
      // 2c: aload 5
      // 2e: iload 4
      // 30: ifeq 6f
      // 33: invokeinterface zfz.r_y ()Le0x; 1
      // 38: aload 0
      // 39: if_acmpne 70
      // 3c: goto 43
      // 3f: invokestatic w4e.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 1
      // 44: getstatic w4e.m_q Lzb_;
      // 47: aload 5
      // 49: getstatic w4e.m_q Lzb_;
      // 4c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 51: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 56: getstatic w4e.g92 Lh76;
      // 59: aload 5
      // 5b: getstatic w4e.g92 Lh76;
      // 5e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 63: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 68: goto 6f
      // 6b: invokestatic w4e.a (Loov;)Loov;
      // 6e: athrow
      // 6f: astore 1
      // 70: iload 4
      // 72: ifne c5
      // 75: aload 2
      // 76: aload 3
      // 77: invokevirtual mew.eve ()Lmew;
      // 7a: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 7f: goto 86
      // 82: invokestatic w4e.a (Loov;)Loov;
      // 85: athrow
      // 86: astore 5
      // 88: aload 5
      // 8a: iload 4
      // 8c: ifeq c6
      // 8f: invokeinterface zfz.r_y ()Le0x; 1
      // 94: aload 0
      // 95: if_acmpne c5
      // 98: goto 9f
      // 9b: invokestatic w4e.a (Loov;)Loov;
      // 9e: athrow
      // 9f: aload 1
      // a0: getstatic w4e.kyp Lqx_;
      // a3: aload 5
      // a5: getstatic w4e.kyp Lqx_;
      // a8: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // ad: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // b2: getstatic w4e.tlp Lh76;
      // b5: aload 5
      // b7: getstatic w4e.tlp Lh76;
      // ba: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // bf: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // c4: astore 1
      // c5: aload 1
      // c6: areturn
   }

   @Override
   public zfz kig(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 8
      // 07: iand
      // 08: ifle 60
      // 0b: aload 0
      // 0c: invokevirtual w4e.l4i ()Lzfz;
      // 0f: getstatic w4e.raj Lzb_;
      // 12: getstatic w4e$w0e._bw Lw4e$w0e;
      // 15: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1a: getstatic w4e.m_q Lzb_;
      // 1d: iload 1
      // 1e: bipush 1
      // 1f: iand
      // 20: ifle 34
      // 23: goto 2a
      // 26: invokestatic w4e.a (Loov;)Loov;
      // 29: athrow
      // 2a: getstatic w4e$d2r.plj Lw4e$d2r;
      // 2d: goto 37
      // 30: invokestatic w4e.a (Loov;)Loov;
      // 33: athrow
      // 34: getstatic w4e$d2r.cd4 Lw4e$d2r;
      // 37: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3c: getstatic w4e.g92 Lh76;
      // 3f: iload 1
      // 40: bipush 2
      // 41: iand
      // 42: iload 2
      // 43: ifeq 51
      // 46: ifle 54
      // 49: goto 50
      // 4c: invokestatic w4e.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 58: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 5d: goto a1
      // 60: aload 0
      // 61: invokevirtual w4e.l4i ()Lzfz;
      // 64: getstatic w4e.raj Lzb_;
      // 67: getstatic w4e$w0e.lf4 Lw4e$w0e;
      // 6a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6f: getstatic w4e.kyp Lqx_;
      // 72: iload 1
      // 73: bipush 3
      // 74: iand
      // 75: invokestatic vt2.bm6 (I)Lvt2;
      // 78: invokevirtual vt2.tgw ()Lvt2;
      // 7b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 80: getstatic w4e.tlp Lh76;
      // 83: iload 1
      // 84: bipush 4
      // 85: iand
      // 86: iload 2
      // 87: ifeq 95
      // 8a: ifle 98
      // 8d: goto 94
      // 90: invokestatic w4e.a (Loov;)Loov;
      // 93: athrow
      // 94: bipush 1
      // 95: goto 99
      // 98: bipush 0
      // 99: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // a1: areturn
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = OpaquePredicate.c();
      int var3 = 0;

      Comparable var10000;
      label65: {
         label72: {
            try {
               var10000 = var1.dil(raj);
               if (var2 != 0) {
                  break label65;
               }

               if (var10000 != w4e$w0e._bw) {
                  break label72;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var3 |= 8;

            label57: {
               label56: {
                  try {
                     var10000 = var1.dil(m_q);
                     if (var2 != 0) {
                        break label57;
                     }

                     if (var10000 != w4e$d2r.plj) {
                        break label56;
                     }
                  } catch (oov var6) {
                     throw a(var6);
                  }

                  var3 |= 1;
               }

               var10000 = var1.dil(g92);
            }

            try {
               byte var9 = (Boolean)var10000;
               if (var2 != 0) {
                  return var9;
               }

               if (var9 == 0) {
                  return var3;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var3 |= 2;
            if (var2 == 0) {
               return var3;
            }
         }

         var3 |= ((vt2)var1.dil(kyp)).drv().tmy();
         var10000 = var1.dil(tlp);
      }

      try {
         byte var10 = (Boolean)var10000;
         if (var2 != 0) {
            return var10;
         }

         if (var10 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 4;
      return var3;
   }

   public static int w5z(int var0) {
      return var0 & 7;
   }

   public static boolean rg9(m5n var0, mew var1) {
      return y4c(fb6(var0, var1));
   }

   public static vt2 c5q(m5n var0, mew var1) {
      return zp6(fb6(var0, var1));
   }

   public static vt2 zp6(int var0) {
      return vt2.bm6(var0 & 3).tgw();
   }

   public static boolean y4c(int var0) {
      int var1 = OpaquePredicate.b();

      try {
         int var10000 = var0 & 4;
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public static boolean i5b(int var0) {
      int var1 = OpaquePredicate.c();

      try {
         int var10000 = var0 & 8;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public static boolean f70(int var0) {
      int var1 = OpaquePredicate.c();

      try {
         int var10000 = var0 & 16;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{raj, kyp, tlp, m_q, g92});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1569831832360560173L, -4829951574946988034L, MethodHandles.lookup().lookupClass()).a(208171113030863L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 79605959716020L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = " }A\u000f\tÂ®ãµ\n3{Þ\u0091Ð;\u0010\u0015iàãî\u008f¬Þ\u008e\u008cóU\u0000çwe\u0010JçÎ÷.@©XðL\u007f\u009f¼=0\u0003\u0010J]ÄçÅÏÌè,üm\u0006_ßLÒ\u0010\"\u008bQ\u009a[\u0080\rýBj\u008f\u0001\u00ad%Y\u0010\u0010\u0013\u0083§&Ý\u0004¯î\u0017\u009d\u0084àêx^I";
      int var6 = " }A\u000f\tÂ®ãµ\n3{Þ\u0091Ð;\u0010\u0015iàãî\u008f¬Þ\u008e\u008cóU\u0000çwe\u0010JçÎ÷.@©XðL\u007f\u009f¼=0\u0003\u0010J]ÄçÅÏÌè,üm\u0006_ßLÒ\u0010\"\u008bQ\u009a[\u0080\rýBj\u008f\u0001\u00ad%Y\u0010\u0010\u0013\u0083§&Ý\u0004¯î\u0017\u009d\u0084àêx^I"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[8];
                     kyp = qx_.q0o(b<"i">(24474, 3733767288561945792L ^ var9), vt2$unz.fzl);
                     tlp = h76.d_1(b<"i">(19059, 2479253142062258475L ^ var9));
                     m_q = zb_.pq4(b<"i">(25187, 1668006509190246714L ^ var9), w4e$d2r.class);
                     g92 = h76.d_1(b<"i">(3249, 1180773151555362794L ^ var9));
                     raj = zb_.pq4(b<"i">(14917, 6010726463296383257L ^ var9), w4e$w0e.class);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Dhçª£\u0018\u0002\fB=×?zm\u0016\f\u0010A\u0003\u0084qI~Ïñ\u0085 \u0092/-øëL";
                  var6 = "Dhçª£\u0018\u0002\fB=×?zm\u0016\f\u0010A\u0003\u0084qI~Ïñ\u0085 \u0092/-øëL".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16298;
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
            throw new RuntimeException("w4e", var10);
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
         throw new RuntimeException("w4e" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
