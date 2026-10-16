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

public class l2c extends e0x {
   public static final qx_ _ic;
   public static final h76 kae;
   public static final h76 k82;
   public static final h76 udk;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public l2c() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(_ic, vt2.z9q).zvi(kae, false).zvi(k82, false).zvi(udk, false));
      this.i3l(uja.yj_);
      this._p_(true);
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      int var4 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = var1;
         var10001 = udk;
         boolean var10002 = OpaquePredicate.r3_(var2, var3.eve());
         if (var4 != 0) {
            return var1.zvi(var10001, var10002);
         }

         if (!var10002) {
            return var1.zvi(var10001, true);
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean d9o(OpaquePredicate param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 09: invokevirtual vt2$y0s.pyt ()Z
      // 0c: iload 4
      // 0e: ifne 36
      // 11: ifeq 49
      // 14: goto 1b
      // 17: invokestatic l2c.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: invokevirtual vt2.b4b ()Lvt2;
      // 21: invokevirtual mew.offset (Lvt2;)Lmew;
      // 24: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 27: invokeinterface zfz.r_y ()Le0x; 1
      // 2c: invokevirtual e0x.y0n ()Z
      // 2f: goto 36
      // 32: invokestatic l2c.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 4
      // 38: ifne 46
      // 3b: ifeq 49
      // 3e: goto 45
      // 41: invokestatic l2c.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
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
      // 04: getstatic vt2$unz.fzl Lvt2$unz;
      // 07: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 0a: astore 4
      // 0c: aload 4
      // 0e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13: ifeq 53
      // 16: aload 4
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast vt2
      // 20: astore 5
      // 22: aload 1
      // 23: aload 2
      // 24: aload 5
      // 26: invokevirtual mew.offset (Lvt2;)Lmew;
      // 29: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2c: invokeinterface zfz.r_y ()Le0x; 1
      // 31: invokevirtual e0x.y0n ()Z
      // 34: iload 3
      // 35: ifne 54
      // 38: iload 3
      // 39: ifne 4e
      // 3c: goto 43
      // 3f: invokestatic l2c.a (Loov;)Loov;
      // 42: athrow
      // 43: ifeq 4f
      // 46: goto 4d
      // 49: invokestatic l2c.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 1
      // 4e: ireturn
      // 4f: iload 3
      // 50: ifeq 0c
      // 53: bipush 0
      // 54: ireturn
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      zfz var9 = this.l4i().zvi(kae, false).zvi(k82, false).zvi(udk, false);
      if (var3.e30().pyt()) {
         var9 = var9.zvi(_ic, var3);
      }

      return var9;
   }

   @Override
   public void qh0(OpaquePredicate var1, mew var2, zfz var3, Entity var4, erg var5) {
      this.khf(var1, var2, var3, false, false, -1, (zfz)null);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 4
      // 07: aload 0
      // 08: if_acmpeq 63
      // 0b: aload 0
      // 0c: aload 1
      // 0d: aload 2
      // 0e: aload 3
      // 0f: invokespecial l2c.hle (Lt9d;Lmew;Lzfz;)Z
      // 12: ifeq 63
      // 15: goto 1c
      // 18: invokestatic l2c.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 3
      // 1d: getstatic l2c._ic Lqx_;
      // 20: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 25: checkcast vt2
      // 28: astore 6
      // 2a: aload 1
      // 2b: aload 2
      // 2c: aload 6
      // 2e: invokevirtual vt2.b4b ()Lvt2;
      // 31: invokevirtual mew.offset (Lvt2;)Lmew;
      // 34: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 37: invokeinterface zfz.r_y ()Le0x; 1
      // 3c: invokevirtual e0x.y0n ()Z
      // 3f: iload 5
      // 41: ifeq 62
      // 44: ifne 63
      // 47: goto 4e
      // 4a: invokestatic l2c.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 1
      // 50: aload 2
      // 51: aload 3
      // 52: bipush 0
      // 53: invokevirtual l2c.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 56: aload 1
      // 57: aload 2
      // 58: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 5b: goto 62
      // 5e: invokestatic l2c.a (Loov;)Loov;
      // 61: athrow
      // 62: pop
      // 63: return
   }

   public void khf(OpaquePredicate param1, mew param2, zfz param3, boolean param4, boolean param5, int param6, zfz param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: getstatic l2c._ic Lqx_;
      // 004: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 009: checkcast vt2
      // 00c: astore 9
      // 00e: invokestatic OpaquePredicate.c ()I
      // 011: aload 3
      // 012: getstatic l2c.k82 Lh76;
      // 015: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 01a: checkcast java/lang/Boolean
      // 01d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 020: istore 10
      // 022: istore 8
      // 024: aload 3
      // 025: getstatic l2c.kae Lh76;
      // 028: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 02d: checkcast java/lang/Boolean
      // 030: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 033: istore 11
      // 035: aload 1
      // 036: aload 2
      // 037: invokevirtual mew.eve ()Lmew;
      // 03a: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 03d: iload 8
      // 03f: ifne 04d
      // 042: ifne 050
      // 045: goto 04c
      // 048: invokestatic l2c.a (Loov;)Loov;
      // 04b: athrow
      // 04c: bipush 1
      // 04d: goto 051
      // 050: bipush 0
      // 051: istore 12
      // 053: iload 4
      // 055: iload 8
      // 057: ifne 065
      // 05a: ifne 068
      // 05d: goto 064
      // 060: invokestatic l2c.a (Loov;)Loov;
      // 063: athrow
      // 064: bipush 1
      // 065: goto 069
      // 068: bipush 0
      // 069: istore 13
      // 06b: bipush 0
      // 06c: istore 14
      // 06e: bipush 0
      // 06f: istore 15
      // 071: bipush 42
      // 073: anewarray 67
      // 076: astore 16
      // 078: bipush 1
      // 079: istore 17
      // 07b: iload 17
      // 07d: bipush 42
      // 07f: if_icmpge 20b
      // 082: aload 2
      // 083: aload 9
      // 085: iload 17
      // 087: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 08a: astore 18
      // 08c: aload 1
      // 08d: aload 18
      // 08f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 092: astore 19
      // 094: aload 19
      // 096: iload 8
      // 098: ifne 253
      // 09b: invokeinterface zfz.r_y ()Le0x; 1
      // 0a0: getstatic ox_.r11 Ll2c;
      // 0a3: iload 8
      // 0a5: ifne 0ec
      // 0a8: goto 0af
      // 0ab: invokestatic l2c.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: if_acmpne 0db
      // 0b2: goto 0b9
      // 0b5: invokestatic l2c.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 19
      // 0bb: getstatic l2c._ic Lqx_;
      // 0be: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0c3: aload 9
      // 0c5: invokevirtual vt2.b4b ()Lvt2;
      // 0c8: if_acmpne 20b
      // 0cb: goto 0d2
      // 0ce: invokestatic l2c.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: iload 17
      // 0d4: istore 15
      // 0d6: iload 8
      // 0d8: ifeq 20b
      // 0db: aload 19
      // 0dd: invokeinterface zfz.r_y ()Le0x; 1
      // 0e2: getstatic ox_.s7a Le0x;
      // 0e5: goto 0ec
      // 0e8: invokestatic l2c.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: if_acmpeq 117
      // 0ef: iload 17
      // 0f1: iload 6
      // 0f3: iload 8
      // 0f5: ifne 12e
      // 0f8: goto 0ff
      // 0fb: invokestatic l2c.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: if_icmpeq 117
      // 102: goto 109
      // 105: invokestatic l2c.a (Loov;)Loov;
      // 108: athrow
      // 109: aload 16
      // 10b: iload 17
      // 10d: aconst_null
      // 10e: aastore
      // 10f: bipush 0
      // 110: istore 13
      // 112: iload 8
      // 114: ifeq 203
      // 117: iload 17
      // 119: iload 8
      // 11b: ifne 14d
      // 11e: goto 125
      // 121: invokestatic l2c.a (Loov;)Loov;
      // 124: athrow
      // 125: iload 6
      // 127: goto 12e
      // 12a: invokestatic l2c.a (Loov;)Loov;
      // 12d: athrow
      // 12e: if_icmpne 13d
      // 131: aload 7
      // 133: aload 19
      // 135: invokestatic com/google/common/base/Objects.firstNonNull (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 138: checkcast zfz
      // 13b: astore 19
      // 13d: aload 19
      // 13f: getstatic evg.w3p Lh76;
      // 142: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 147: checkcast java/lang/Boolean
      // 14a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14d: iload 8
      // 14f: ifne 15d
      // 152: ifne 160
      // 155: goto 15c
      // 158: invokestatic l2c.a (Loov;)Loov;
      // 15b: athrow
      // 15c: bipush 1
      // 15d: goto 161
      // 160: bipush 0
      // 161: istore 20
      // 163: aload 19
      // 165: getstatic evg.m0p Lh76;
      // 168: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 16d: checkcast java/lang/Boolean
      // 170: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 173: istore 21
      // 175: aload 19
      // 177: getstatic evg.z0g Lh76;
      // 17a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 17f: checkcast java/lang/Boolean
      // 182: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 185: istore 22
      // 187: iload 13
      // 189: iload 22
      // 18b: iload 8
      // 18d: ifne 1a4
      // 190: iload 12
      // 192: if_icmpne 1a7
      // 195: goto 19c
      // 198: invokestatic l2c.a (Loov;)Loov;
      // 19b: athrow
      // 19c: bipush 1
      // 19d: goto 1a4
      // 1a0: invokestatic l2c.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: goto 1a8
      // 1a7: bipush 0
      // 1a8: iand
      // 1a9: istore 13
      // 1ab: iload 14
      // 1ad: iload 20
      // 1af: iload 8
      // 1b1: ifne 1c0
      // 1b4: ifeq 1d3
      // 1b7: goto 1be
      // 1ba: invokestatic l2c.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: iload 21
      // 1c0: iload 8
      // 1c2: ifne 1d0
      // 1c5: ifeq 1d3
      // 1c8: goto 1cf
      // 1cb: invokestatic l2c.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: bipush 1
      // 1d0: goto 1d4
      // 1d3: bipush 0
      // 1d4: ior
      // 1d5: istore 14
      // 1d7: aload 16
      // 1d9: iload 17
      // 1db: aload 19
      // 1dd: aastore
      // 1de: iload 8
      // 1e0: ifne 206
      // 1e3: iload 17
      // 1e5: iload 6
      // 1e7: if_icmpne 203
      // 1ea: goto 1f1
      // 1ed: invokestatic l2c.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: aload 1
      // 1f2: aload 2
      // 1f3: aload 0
      // 1f4: aload 0
      // 1f5: aload 1
      // 1f6: invokevirtual l2c.odp (Lt9d;)I
      // 1f9: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 1fc: iload 13
      // 1fe: iload 20
      // 200: iand
      // 201: istore 13
      // 203: iinc 17 1
      // 206: iload 8
      // 208: ifeq 07b
      // 20b: iload 13
      // 20d: iload 15
      // 20f: iload 8
      // 211: ifne 227
      // 214: bipush 1
      // 215: if_icmple 22a
      // 218: goto 21f
      // 21b: invokestatic l2c.a (Loov;)Loov;
      // 21e: athrow
      // 21f: bipush 1
      // 220: goto 227
      // 223: invokestatic l2c.a (Loov;)Loov;
      // 226: athrow
      // 227: goto 22b
      // 22a: bipush 0
      // 22b: iand
      // 22c: istore 13
      // 22e: iload 14
      // 230: iload 13
      // 232: iand
      // 233: istore 14
      // 235: aload 0
      // 236: invokevirtual l2c.l4i ()Lzfz;
      // 239: getstatic l2c.k82 Lh76;
      // 23c: iload 13
      // 23e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 241: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 246: getstatic l2c.kae Lh76;
      // 249: iload 14
      // 24b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 24e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 253: astore 17
      // 255: iload 15
      // 257: iload 8
      // 259: ifne 2b3
      // 25c: ifle 2a3
      // 25f: goto 266
      // 262: invokestatic l2c.a (Loov;)Loov;
      // 265: athrow
      // 266: aload 2
      // 267: aload 9
      // 269: iload 15
      // 26b: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 26e: astore 18
      // 270: aload 9
      // 272: invokevirtual vt2.b4b ()Lvt2;
      // 275: astore 19
      // 277: aload 1
      // 278: aload 18
      // 27a: aload 17
      // 27c: getstatic l2c._ic Lqx_;
      // 27f: aload 19
      // 281: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 286: bipush 3
      // 287: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 28a: pop
      // 28b: aload 0
      // 28c: aload 1
      // 28d: aload 18
      // 28f: aload 19
      // 291: invokespecial l2c.y8q (Lt9d;Lmew;Lvt2;)V
      // 294: aload 0
      // 295: aload 1
      // 296: aload 18
      // 298: iload 13
      // 29a: iload 14
      // 29c: iload 10
      // 29e: iload 11
      // 2a0: invokespecial l2c.r_0 (Lt9d;Lmew;ZZZZ)V
      // 2a3: aload 0
      // 2a4: aload 1
      // 2a5: aload 2
      // 2a6: iload 13
      // 2a8: iload 14
      // 2aa: iload 10
      // 2ac: iload 11
      // 2ae: invokespecial l2c.r_0 (Lt9d;Lmew;ZZZZ)V
      // 2b1: iload 4
      // 2b3: iload 8
      // 2b5: ifne 2fe
      // 2b8: ifne 2fc
      // 2bb: goto 2c2
      // 2be: invokestatic l2c.a (Loov;)Loov;
      // 2c1: athrow
      // 2c2: aload 1
      // 2c3: aload 2
      // 2c4: aload 17
      // 2c6: getstatic l2c._ic Lqx_;
      // 2c9: aload 9
      // 2cb: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2d0: bipush 3
      // 2d1: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 2d4: pop
      // 2d5: iload 5
      // 2d7: iload 8
      // 2d9: ifne 2fe
      // 2dc: goto 2e3
      // 2df: invokestatic l2c.a (Loov;)Loov;
      // 2e2: athrow
      // 2e3: ifeq 2fc
      // 2e6: goto 2ed
      // 2e9: invokestatic l2c.a (Loov;)Loov;
      // 2ec: athrow
      // 2ed: aload 0
      // 2ee: aload 1
      // 2ef: aload 2
      // 2f0: aload 9
      // 2f2: invokespecial l2c.y8q (Lt9d;Lmew;Lvt2;)V
      // 2f5: goto 2fc
      // 2f8: invokestatic l2c.a (Loov;)Loov;
      // 2fb: athrow
      // 2fc: iload 10
      // 2fe: iload 8
      // 300: ifne 317
      // 303: iload 13
      // 305: if_icmpeq 38c
      // 308: goto 30f
      // 30b: invokestatic l2c.a (Loov;)Loov;
      // 30e: athrow
      // 30f: bipush 1
      // 310: goto 317
      // 313: invokestatic l2c.a (Loov;)Loov;
      // 316: athrow
      // 317: istore 18
      // 319: iload 18
      // 31b: iload 15
      // 31d: if_icmpge 38c
      // 320: aload 2
      // 321: aload 9
      // 323: iload 18
      // 325: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 328: astore 19
      // 32a: aload 16
      // 32c: iload 18
      // 32e: aaload
      // 32f: astore 20
      // 331: iload 8
      // 333: ifne 387
      // 336: aload 20
      // 338: ifnull 384
      // 33b: goto 342
      // 33e: invokestatic l2c.a (Loov;)Loov;
      // 341: athrow
      // 342: aload 1
      // 343: aload 19
      // 345: iload 8
      // 347: ifne 370
      // 34a: goto 351
      // 34d: invokestatic l2c.a (Loov;)Loov;
      // 350: athrow
      // 351: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 354: invokeinterface zfz.r_y ()Le0x; 1
      // 359: getstatic ox_.ibw Le0x;
      // 35c: if_acmpeq 384
      // 35f: goto 366
      // 362: invokestatic l2c.a (Loov;)Loov;
      // 365: athrow
      // 366: aload 1
      // 367: aload 19
      // 369: goto 370
      // 36c: invokestatic l2c.a (Loov;)Loov;
      // 36f: athrow
      // 370: aload 20
      // 372: getstatic l2c.k82 Lh76;
      // 375: iload 13
      // 377: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 37a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 37f: bipush 3
      // 380: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 383: pop
      // 384: iinc 18 1
      // 387: iload 8
      // 389: ifeq 319
      // 38c: return
   }

   @Override
   public void ff3(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
   }

   @Override
   public void zvy(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
      this.khf(var1, var2, var3, false, true, -1, (zfz)null);
   }

   private void r_0(OpaquePredicate param1, mew param2, boolean param3, boolean param4, boolean param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic l2c.b J
      // 003: ldc2_w 8930552365
      // 006: lxor
      // 007: lstore 7
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 9
      // 00e: iload 4
      // 010: iload 9
      // 012: ifne 080
      // 015: ifeq 077
      // 018: goto 01f
      // 01b: invokestatic l2c.a (Loov;)Loov;
      // 01e: athrow
      // 01f: iload 6
      // 021: iload 9
      // 023: ifne 080
      // 026: goto 02d
      // 029: invokestatic l2c.a (Loov;)Loov;
      // 02c: athrow
      // 02d: ifne 077
      // 030: goto 037
      // 033: invokestatic l2c.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 1
      // 038: aload 2
      // 039: invokevirtual mew.getX ()I
      // 03c: i2d
      // 03d: ldc2_w 0.5
      // 040: dadd
      // 041: aload 2
      // 042: invokevirtual mew.getY ()I
      // 045: i2d
      // 046: ldc2_w 0.1
      // 049: dadd
      // 04a: aload 2
      // 04b: invokevirtual mew.getZ ()I
      // 04e: i2d
      // 04f: ldc2_w 0.5
      // 052: dadd
      // 053: sipush 14582
      // 056: ldc2_w 4563824597625763895
      // 059: lload 7
      // 05b: lxor
      // 05c: invokedynamic r (IJ)Ljava/lang/String; bsm=l2c.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: ldc 0.4
      // 064: nop
      // 065: ldc 0.6
      // 067: nop
      // 068: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 06b: iload 9
      // 06d: ifeq 1bd
      // 070: goto 077
      // 073: invokestatic l2c.a (Loov;)Loov;
      // 076: athrow
      // 077: iload 4
      // 079: goto 080
      // 07c: invokestatic l2c.a (Loov;)Loov;
      // 07f: athrow
      // 080: iload 9
      // 082: ifne 0ef
      // 085: ifne 0e7
      // 088: goto 08f
      // 08b: invokestatic l2c.a (Loov;)Loov;
      // 08e: athrow
      // 08f: iload 6
      // 091: iload 9
      // 093: ifne 0ef
      // 096: goto 09d
      // 099: invokestatic l2c.a (Loov;)Loov;
      // 09c: athrow
      // 09d: ifeq 0e7
      // 0a0: goto 0a7
      // 0a3: invokestatic l2c.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 1
      // 0a8: aload 2
      // 0a9: invokevirtual mew.getX ()I
      // 0ac: i2d
      // 0ad: ldc2_w 0.5
      // 0b0: dadd
      // 0b1: aload 2
      // 0b2: invokevirtual mew.getY ()I
      // 0b5: i2d
      // 0b6: ldc2_w 0.1
      // 0b9: dadd
      // 0ba: aload 2
      // 0bb: invokevirtual mew.getZ ()I
      // 0be: i2d
      // 0bf: ldc2_w 0.5
      // 0c2: dadd
      // 0c3: sipush 19163
      // 0c6: ldc2_w 9150476631505766937
      // 0c9: lload 7
      // 0cb: lxor
      // 0cc: invokedynamic r (IJ)Ljava/lang/String; bsm=l2c.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: nop
      // 0d2: ldc 0.4
      // 0d4: nop
      // 0d5: ldc 0.5
      // 0d7: nop
      // 0d8: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 0db: iload 9
      // 0dd: ifeq 1bd
      // 0e0: goto 0e7
      // 0e3: invokestatic l2c.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 3
      // 0e8: goto 0ef
      // 0eb: invokestatic l2c.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: iload 9
      // 0f1: ifne 15e
      // 0f4: ifeq 156
      // 0f7: goto 0fe
      // 0fa: invokestatic l2c.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: iload 5
      // 100: iload 9
      // 102: ifne 15e
      // 105: goto 10c
      // 108: invokestatic l2c.a (Loov;)Loov;
      // 10b: athrow
      // 10c: ifne 156
      // 10f: goto 116
      // 112: invokestatic l2c.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 1
      // 117: aload 2
      // 118: invokevirtual mew.getX ()I
      // 11b: i2d
      // 11c: ldc2_w 0.5
      // 11f: dadd
      // 120: aload 2
      // 121: invokevirtual mew.getY ()I
      // 124: i2d
      // 125: ldc2_w 0.1
      // 128: dadd
      // 129: aload 2
      // 12a: invokevirtual mew.getZ ()I
      // 12d: i2d
      // 12e: ldc2_w 0.5
      // 131: dadd
      // 132: sipush 19163
      // 135: ldc2_w 9150476631505766937
      // 138: lload 7
      // 13a: lxor
      // 13b: invokedynamic r (IJ)Ljava/lang/String; bsm=l2c.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: nop
      // 141: ldc 0.4
      // 143: nop
      // 144: ldc 0.7
      // 146: nop
      // 147: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 14a: iload 9
      // 14c: ifeq 1bd
      // 14f: goto 156
      // 152: invokestatic l2c.a (Loov;)Loov;
      // 155: athrow
      // 156: iload 3
      // 157: goto 15e
      // 15a: invokestatic l2c.a (Loov;)Loov;
      // 15d: athrow
      // 15e: iload 9
      // 160: ifne 16f
      // 163: ifne 1bd
      // 166: goto 16d
      // 169: invokestatic l2c.a (Loov;)Loov;
      // 16c: athrow
      // 16d: iload 5
      // 16f: ifeq 1bd
      // 172: aload 1
      // 173: aload 2
      // 174: invokevirtual mew.getX ()I
      // 177: i2d
      // 178: ldc2_w 0.5
      // 17b: dadd
      // 17c: aload 2
      // 17d: invokevirtual mew.getY ()I
      // 180: i2d
      // 181: ldc2_w 0.1
      // 184: dadd
      // 185: aload 2
      // 186: invokevirtual mew.getZ ()I
      // 189: i2d
      // 18a: ldc2_w 0.5
      // 18d: dadd
      // 18e: sipush 19487
      // 191: ldc2_w 3869168645994122456
      // 194: lload 7
      // 196: lxor
      // 197: invokedynamic r (IJ)Ljava/lang/String; bsm=l2c.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: nop
      // 19d: ldc 0.4
      // 19f: nop
      // 1a0: ldc 1.2
      // 1a2: nop
      // 1a3: aload 1
      // 1a4: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 1a7: invokevirtual java/util/Random.nextFloat ()F
      // 1aa: ldc 0.2
      // 1ac: nop
      // 1ad: fmul
      // 1ae: ldc 0.9
      // 1b0: nop
      // 1b1: fadd
      // 1b2: fdiv
      // 1b3: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 1b6: goto 1bd
      // 1b9: invokestatic l2c.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: return
   }

   private void y8q(OpaquePredicate var1, mew var2, vt2 var3) {
      var1._0o(var2, this);
      var1._0o(var2.offset(var3.b4b()), this);
   }

   private boolean hle(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual l2c.ctq (Lt9d;Lmew;)Z
      // 0b: iload 4
      // 0d: ifne 2f
      // 10: ifne 2e
      // 13: goto 1a
      // 16: invokestatic l2c.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: bipush 0
      // 1f: invokevirtual l2c.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 22: aload 1
      // 23: aload 2
      // 24: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 27: pop
      // 28: bipush 0
      // 29: ireturn
      // 2a: invokestatic l2c.a (Loov;)Loov;
      // 2d: athrow
      // 2e: bipush 1
      // 2f: ireturn
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: ldc 0.1875
      // 06: nop
      // 07: fstore 4
      // 09: iload 3
      // 0a: ifeq 6a
      // 0d: getstatic l2c$1._sx [I
      // 10: aload 1
      // 11: aload 2
      // 12: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 17: getstatic l2c._ic Lqx_;
      // 1a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1f: checkcast vt2
      // 22: invokevirtual vt2.ordinal ()I
      // 25: iaload
      // 26: tableswitch 186 1 4 34 72 112 150
      // 44: invokestatic l2c.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: fconst_0
      // 4a: ldc 0.2
      // 4c: nop
      // 4d: ldc 0.5
      // 4f: nop
      // 50: fload 4
      // 52: fsub
      // 53: fload 4
      // 55: fconst_2
      // 56: fmul
      // 57: ldc 0.8
      // 59: nop
      // 5a: ldc 0.5
      // 5c: nop
      // 5d: fload 4
      // 5f: fadd
      // 60: invokevirtual l2c.xl4 (FFFFFF)V
      // 63: goto 6a
      // 66: invokestatic l2c.a (Loov;)Loov;
      // 69: athrow
      // 6a: iload 3
      // 6b: ifne e0
      // 6e: aload 0
      // 6f: fconst_1
      // 70: fload 4
      // 72: fconst_2
      // 73: fmul
      // 74: fsub
      // 75: ldc 0.2
      // 77: nop
      // 78: ldc 0.5
      // 7a: nop
      // 7b: fload 4
      // 7d: fsub
      // 7e: fconst_1
      // 7f: ldc 0.8
      // 81: nop
      // 82: ldc 0.5
      // 84: nop
      // 85: fload 4
      // 87: fadd
      // 88: invokevirtual l2c.xl4 (FFFFFF)V
      // 8b: iload 3
      // 8c: ifne e0
      // 8f: goto 96
      // 92: invokestatic l2c.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: ldc 0.5
      // 99: nop
      // 9a: fload 4
      // 9c: fsub
      // 9d: ldc 0.2
      // 9f: nop
      // a0: fconst_0
      // a1: ldc 0.5
      // a3: nop
      // a4: fload 4
      // a6: fadd
      // a7: ldc 0.8
      // a9: nop
      // aa: fload 4
      // ac: fconst_2
      // ad: fmul
      // ae: invokevirtual l2c.xl4 (FFFFFF)V
      // b1: iload 3
      // b2: ifne e0
      // b5: goto bc
      // b8: invokestatic l2c.a (Loov;)Loov;
      // bb: athrow
      // bc: aload 0
      // bd: ldc 0.5
      // bf: nop
      // c0: fload 4
      // c2: fsub
      // c3: ldc 0.2
      // c5: nop
      // c6: fconst_1
      // c7: fload 4
      // c9: fconst_2
      // ca: fmul
      // cb: fsub
      // cc: ldc 0.5
      // ce: nop
      // cf: fload 4
      // d1: fadd
      // d2: ldc 0.8
      // d4: nop
      // d5: fconst_1
      // d6: invokevirtual l2c.xl4 (FFFFFF)V
      // d9: goto e0
      // dc: invokestatic l2c.a (Loov;)Loov;
      // df: athrow
      // e0: return
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
      // 00: aload 3
      // 01: getstatic l2c.k82 Lh76;
      // 04: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 09: checkcast java/lang/Boolean
      // 0c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f: istore 5
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: aload 3
      // 15: getstatic l2c.kae Lh76;
      // 18: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1d: checkcast java/lang/Boolean
      // 20: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 23: istore 6
      // 25: istore 4
      // 27: iload 5
      // 29: iload 4
      // 2b: ifeq 3a
      // 2e: ifne 49
      // 31: goto 38
      // 34: invokestatic l2c.a (Loov;)Loov;
      // 37: athrow
      // 38: iload 6
      // 3a: iload 4
      // 3c: ifeq 60
      // 3f: ifeq 5e
      // 42: goto 49
      // 45: invokestatic l2c.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 1
      // 4b: aload 2
      // 4c: aload 3
      // 4d: bipush 1
      // 4e: bipush 0
      // 4f: bipush -1
      // 50: aconst_null
      // 51: checkcast zfz
      // 54: invokevirtual l2c.khf (Lt9d;Lmew;Lzfz;ZZILzfz;)V
      // 57: goto 5e
      // 5a: invokestatic l2c.a (Loov;)Loov;
      // 5d: athrow
      // 5e: iload 6
      // 60: ifeq 88
      // 63: aload 1
      // 64: aload 2
      // 65: aload 0
      // 66: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 69: aload 1
      // 6a: aload 2
      // 6b: aload 3
      // 6c: getstatic l2c._ic Lqx_;
      // 6f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 74: checkcast vt2
      // 77: invokevirtual vt2.b4b ()Lvt2;
      // 7a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 7d: aload 0
      // 7e: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 81: goto 88
      // 84: invokestatic l2c.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: aload 1
      // 8a: aload 2
      // 8b: aload 3
      // 8c: invokespecial e0x.b8f (Lt9d;Lmew;Lzfz;)V
      // 8f: return
   }

   @Override
   public int gpi(m5n var1, mew var2, zfz var3, vt2 var4) {
      int var5 = OpaquePredicate.c();

      try {
         byte var10000 = (Boolean)var3.dil(kae);
         if (var5 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 15;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return 0;
   }

   @Override
   public int sqt(m5n param1, mew param2, zfz param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic l2c.kae Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: iload 5
      // 13: ifne 34
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifne 2b
      // 1c: goto 23
      // 1f: invokestatic l2c.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 0
      // 24: goto 43
      // 27: invokestatic l2c.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 3
      // 2c: getstatic l2c._ic Lqx_;
      // 2f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 34: aload 4
      // 36: if_acmpne 42
      // 39: bipush 15
      // 3b: goto 43
      // 3e: invokestatic l2c.a (Loov;)Loov;
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
   }

   @Override
   public boolean scl() {
      return true;
   }

   @Override
   public w51 w3x() {
      return w51.oja;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      int var10002;
      label39: {
         label38: {
            try {
               var10000 = this.l4i().zvi(_ic, vt2.bm6(var1 & 3));
               var10001 = kae;
               var10002 = var1 & 8;
               if (var2 != 0) {
                  break label39;
               }

               if (var10002 > 0) {
                  break label38;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10002 = 0;
            break label39;
         }

         var10002 = 1;
      }

      try {
         var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
         var10001 = k82;
         var10002 = var1 & 4;
         if (var2 != 0) {
            return var10000.zvi(k82, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(k82, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.c();
      var3 |= ((vt2)var1.dil(_ic)).tmy();
      int var2 = var10000;

      label37: {
         label36: {
            try {
               var7 = (Boolean)var1.dil(kae);
               if (var2 != 0) {
                  break label37;
               }

               if (var7 == 0) {
                  break label36;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var3 |= 8;
         }

         var7 = (Boolean)var1.dil(k82);
      }

      try {
         if (var2 != 0) {
            return var7;
         }

         if (var7 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 4;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{_ic, kae, k82, udk});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8561163041367616134L, -5363660262005621455L, MethodHandles.lookup().lookupClass()).a(260761152374442L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 85530824625532L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "\u0088YJÀ®2\u0018Ób ;Îy¡¼bT.$`4d¦\rÿ\u001b\u000b(ot\u0006®\u0018\u0002ä\u009fÁç\u0089'%\u0010\u0007_\tÍð2\u0096±j\u0012ÓZ\u009eÍà\u0018\u0085u\u000fgâõùéA, ÞXÇ=I?\u008bÓí¡û«D\u0010£ãH \u0017\u0081\u009bÎÇC\u0094\u0002«õiÌ \u0003Óû%\u0090z$àä\u0013\u0094·RS\u009foo\u0090A«\u0006é¯á1È\u008b\u0006³Õ«\u008f";
      int var6 = "\u0088YJÀ®2\u0018Ób ;Îy¡¼bT.$`4d¦\rÿ\u001b\u000b(ot\u0006®\u0018\u0002ä\u009fÁç\u0089'%\u0010\u0007_\tÍð2\u0096±j\u0012ÓZ\u009eÍà\u0018\u0085u\u000fgâõùéA, ÞXÇ=I?\u008bÓí¡û«D\u0010£ãH \u0017\u0081\u009bÎÇC\u0094\u0002«õiÌ \u0003Óû%\u0090z$àä\u0013\u0094·RS\u009foo\u0090A«\u0006é¯á1È\u008b\u0006³Õ«\u008f"
         .length();
      char var3 = ' ';
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
                     h = new String[7];
                     _ic = qx_.q0o(b<"r">(14474, 3246520211576020763L ^ var9), vt2$unz.fzl);
                     kae = h76.d_1(b<"r">(7003, 3803347424709573836L ^ var9));
                     k82 = h76.d_1(b<"r">(18507, 6061793214682509279L ^ var9));
                     udk = h76.d_1(b<"r">(1892, 5225678594763219190L ^ var9));
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

                  var4 = "8êõÂWR)8ÌªÉF\u0015Fp\u0019\u0018Ûæ3¥Äh\u0086Ûw\u008cWé\u009e®\u009d\u0019\u0001\u0081ÅËxÝ¨â";
                  var6 = "8êõÂWR)8ÌªÉF\u0015Fp\u0019\u0018Ûæ3¥Äh\u0086Ûw\u008cWé\u009e®\u009d\u0019\u0001\u0081ÅËxÝ¨â".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5210;
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
            throw new RuntimeException("l2c", var10);
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
         throw new RuntimeException("l2c" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
