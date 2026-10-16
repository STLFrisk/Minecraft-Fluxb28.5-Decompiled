import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fcu extends e0x {
   public static final zb_ l4z;
   public static final zb_ b5k;
   public static final zb_ dnl;
   public static final zb_ _a7;
   public static final _ku crs;
   private boolean dv3 = true;
   private final Set zgi = Sets.newHashSet();

   public fcu() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(l4z, fcu$k9f.o8j).zvi(b5k, fcu$k9f.o8j).zvi(dnl, fcu$k9f.o8j).zvi(_a7, fcu$k9f.o8j).zvi(crs, 0));
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      var1 = var1.zvi(_a7, this.ool(var2, var3, vt2.te4));
      var1 = var1.zvi(b5k, this.ool(var2, var3, vt2.zk4));
      var1 = var1.zvi(l4z, this.ool(var2, var3, vt2.z9q));
      return var1.zvi(dnl, this.ool(var2, var3, vt2.mxp));
   }

   private fcu$k9f ool(m5n param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: aload 3
      // 02: invokevirtual mew.offset (Lvt2;)Lmew;
      // 05: astore 5
      // 07: invokestatic OpaquePredicate.b ()I
      // 0a: aload 1
      // 0b: aload 2
      // 0c: aload 3
      // 0d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 10: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 15: invokeinterface zfz.r_y ()Le0x; 1
      // 1a: astore 6
      // 1c: istore 4
      // 1e: aload 1
      // 1f: aload 5
      // 21: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 26: aload 3
      // 27: invokestatic fcu.oan (Lzfz;Lvt2;)Z
      // 2a: iload 4
      // 2c: ifeq 51
      // 2f: ifne e5
      // 32: goto 39
      // 35: invokestatic fcu.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 6
      // 3b: iload 4
      // 3d: ifeq 8e
      // 40: goto 47
      // 43: invokestatic fcu.a (Loov;)Loov;
      // 46: athrow
      // 47: invokevirtual e0x.lj1 ()Z
      // 4a: goto 51
      // 4d: invokestatic fcu.a (Loov;)Loov;
      // 50: athrow
      // 51: ifne 78
      // 54: aload 1
      // 55: aload 5
      // 57: invokevirtual mew.eve ()Lmew;
      // 5a: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 5f: iload 4
      // 61: ifeq 89
      // 64: goto 6b
      // 67: invokestatic fcu.a (Loov;)Loov;
      // 6a: athrow
      // 6b: invokestatic fcu.uze (Lzfz;)Z
      // 6e: ifne e5
      // 71: goto 78
      // 74: invokestatic fcu.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 1
      // 79: aload 2
      // 7a: invokevirtual mew.nuv ()Lmew;
      // 7d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 82: goto 89
      // 85: invokestatic fcu.a (Loov;)Loov;
      // 88: athrow
      // 89: invokeinterface zfz.r_y ()Le0x; 1
      // 8e: astore 7
      // 90: aload 7
      // 92: invokevirtual e0x.lj1 ()Z
      // 95: iload 4
      // 97: ifeq b0
      // 9a: ifne e1
      // 9d: goto a4
      // a0: invokestatic fcu.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 6
      // a6: invokevirtual e0x.lj1 ()Z
      // a9: goto b0
      // ac: invokestatic fcu.a (Loov;)Loov;
      // af: athrow
      // b0: iload 4
      // b2: ifeq d4
      // b5: ifeq e1
      // b8: goto bf
      // bb: invokestatic fcu.a (Loov;)Loov;
      // be: athrow
      // bf: aload 1
      // c0: aload 5
      // c2: invokevirtual mew.nuv ()Lmew;
      // c5: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // ca: invokestatic fcu.uze (Lzfz;)Z
      // cd: goto d4
      // d0: invokestatic fcu.a (Loov;)Loov;
      // d3: athrow
      // d4: ifeq e1
      // d7: getstatic fcu$k9f.ycz Lfcu$k9f;
      // da: goto e4
      // dd: invokestatic fcu.a (Loov;)Loov;
      // e0: athrow
      // e1: getstatic fcu$k9f.o8j Lfcu$k9f;
      // e4: areturn
      // e5: getstatic fcu$k9f.u8j Lfcu$k9f;
      // e8: areturn
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
   public int j24(m5n var1, mew var2, int var3) {
      zfz var4 = var1.getBlockState(var2);

      try {
         if (var4.r_y() != this) {
            return super.j24(var1, var2, var3);
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return this.c0c((Integer)var4.dil(crs));
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
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual mew.eve ()Lmew;
      // 09: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 0c: iload 3
      // 0d: ifeq 3c
      // 10: ifne 34
      // 13: goto 1a
      // 16: invokestatic fcu.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 2
      // 1c: invokevirtual mew.eve ()Lmew;
      // 1f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 22: invokeinterface zfz.r_y ()Le0x; 1
      // 27: getstatic ox_.t7q Le0x;
      // 2a: if_acmpne 3f
      // 2d: goto 34
      // 30: invokestatic fcu.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 3c
      // 38: invokestatic fcu.a (Loov;)Loov;
      // 3b: athrow
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   private zfz wl1(OpaquePredicate var1, mew var2, zfz var3) {
      var3 = this.mfp(var1, var2, var2, var3);
      int var10000 = OpaquePredicate.b();
      ArrayList var5 = Lists.newArrayList(this.zgi);
      int var4 = var10000;
      this.zgi.clear();

      for (mew var7 : var5) {
         var1._0o(var7, this);
         if (var4 == 0) {
            break;
         }
      }

      return var3;
   }

   private zfz mfp(OpaquePredicate param1, mew param2, mew param3, zfz param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 4
      // 002: astore 6
      // 004: aload 4
      // 006: getstatic fcu.crs L_ku;
      // 009: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 7
      // 016: invokestatic OpaquePredicate.b ()I
      // 019: bipush 0
      // 01a: istore 8
      // 01c: aload 0
      // 01d: aload 1
      // 01e: aload 3
      // 01f: iload 8
      // 021: invokespecial fcu.wd_ (Lt9d;Lmew;I)I
      // 024: istore 8
      // 026: aload 0
      // 027: bipush 0
      // 028: putfield fcu.dv3 Z
      // 02b: aload 1
      // 02c: aload 2
      // 02d: invokevirtual OpaquePredicate.yi4 (Lmew;)I
      // 030: istore 9
      // 032: aload 0
      // 033: bipush 1
      // 034: putfield fcu.dv3 Z
      // 037: istore 5
      // 039: iload 9
      // 03b: iload 5
      // 03d: ifeq 06b
      // 040: ifle 06a
      // 043: goto 04a
      // 046: invokestatic fcu.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 9
      // 04c: iload 5
      // 04e: ifeq 06b
      // 051: goto 058
      // 054: invokestatic fcu.a (Loov;)Loov;
      // 057: athrow
      // 058: iload 8
      // 05a: bipush 1
      // 05b: isub
      // 05c: if_icmple 06a
      // 05f: goto 066
      // 062: invokestatic fcu.a (Loov;)Loov;
      // 065: athrow
      // 066: iload 9
      // 068: istore 8
      // 06a: bipush 0
      // 06b: istore 10
      // 06d: getstatic vt2$unz.fzl Lvt2$unz;
      // 070: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 073: astore 11
      // 075: aload 11
      // 077: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07c: ifeq 200
      // 07f: aload 11
      // 081: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 086: checkcast vt2
      // 089: astore 12
      // 08b: aload 2
      // 08c: aload 12
      // 08e: invokevirtual mew.offset (Lvt2;)Lmew;
      // 091: astore 13
      // 093: aload 13
      // 095: invokevirtual mew.getX ()I
      // 098: iload 5
      // 09a: ifeq 0de
      // 09d: aload 3
      // 09e: invokevirtual mew.getX ()I
      // 0a1: iload 5
      // 0a3: ifeq 210
      // 0a6: goto 0ad
      // 0a9: invokestatic fcu.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: if_icmpne 0d6
      // 0b0: goto 0b7
      // 0b3: invokestatic fcu.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 13
      // 0b9: invokevirtual mew.getZ ()I
      // 0bc: iload 5
      // 0be: ifeq 0de
      // 0c1: goto 0c8
      // 0c4: invokestatic fcu.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 3
      // 0c9: invokevirtual mew.getZ ()I
      // 0cc: if_icmpeq 0e1
      // 0cf: goto 0d6
      // 0d2: invokestatic fcu.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: bipush 1
      // 0d7: goto 0de
      // 0da: invokestatic fcu.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: goto 0e2
      // 0e1: bipush 0
      // 0e2: istore 14
      // 0e4: iload 14
      // 0e6: iload 5
      // 0e8: ifeq 10e
      // 0eb: ifeq 100
      // 0ee: goto 0f5
      // 0f1: invokestatic fcu.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: aload 1
      // 0f7: aload 13
      // 0f9: iload 10
      // 0fb: invokespecial fcu.wd_ (Lt9d;Lmew;I)I
      // 0fe: istore 10
      // 100: aload 1
      // 101: aload 13
      // 103: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 106: invokeinterface zfz.r_y ()Le0x; 1
      // 10b: invokevirtual e0x.y0n ()Z
      // 10e: iload 5
      // 110: ifeq 1a8
      // 113: ifeq 193
      // 116: goto 11d
      // 119: invokestatic fcu.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 1
      // 11e: aload 2
      // 11f: invokevirtual mew.nuv ()Lmew;
      // 122: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 125: invokeinterface zfz.r_y ()Le0x; 1
      // 12a: invokevirtual e0x.y0n ()Z
      // 12d: iload 5
      // 12f: ifeq 1a8
      // 132: goto 139
      // 135: invokestatic fcu.a (Loov;)Loov;
      // 138: athrow
      // 139: ifne 193
      // 13c: goto 143
      // 13f: invokestatic fcu.a (Loov;)Loov;
      // 142: athrow
      // 143: iload 14
      // 145: iload 5
      // 147: ifeq 166
      // 14a: goto 151
      // 14d: invokestatic fcu.a (Loov;)Loov;
      // 150: athrow
      // 151: ifeq 1fb
      // 154: goto 15b
      // 157: invokestatic fcu.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 2
      // 15c: invokevirtual mew.getY ()I
      // 15f: goto 166
      // 162: invokestatic fcu.a (Loov;)Loov;
      // 165: athrow
      // 166: iload 5
      // 168: ifeq 18c
      // 16b: aload 3
      // 16c: invokevirtual mew.getY ()I
      // 16f: if_icmplt 1fb
      // 172: goto 179
      // 175: invokestatic fcu.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 0
      // 17a: aload 1
      // 17b: aload 13
      // 17d: invokevirtual mew.nuv ()Lmew;
      // 180: iload 10
      // 182: invokespecial fcu.wd_ (Lt9d;Lmew;I)I
      // 185: goto 18c
      // 188: invokestatic fcu.a (Loov;)Loov;
      // 18b: athrow
      // 18c: istore 10
      // 18e: iload 5
      // 190: ifne 1fb
      // 193: aload 1
      // 194: aload 13
      // 196: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 199: invokeinterface zfz.r_y ()Le0x; 1
      // 19e: invokevirtual e0x.y0n ()Z
      // 1a1: goto 1a8
      // 1a4: invokestatic fcu.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 5
      // 1aa: ifeq 1b9
      // 1ad: ifne 1fb
      // 1b0: goto 1b7
      // 1b3: invokestatic fcu.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: iload 14
      // 1b9: iload 5
      // 1bb: ifeq 1d3
      // 1be: ifeq 1fb
      // 1c1: goto 1c8
      // 1c4: invokestatic fcu.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: aload 2
      // 1c9: invokevirtual mew.getY ()I
      // 1cc: goto 1d3
      // 1cf: invokestatic fcu.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: iload 5
      // 1d5: ifeq 1f9
      // 1d8: aload 3
      // 1d9: invokevirtual mew.getY ()I
      // 1dc: if_icmpgt 1fb
      // 1df: goto 1e6
      // 1e2: invokestatic fcu.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: aload 0
      // 1e7: aload 1
      // 1e8: aload 13
      // 1ea: invokevirtual mew.eve ()Lmew;
      // 1ed: iload 10
      // 1ef: invokespecial fcu.wd_ (Lt9d;Lmew;I)I
      // 1f2: goto 1f9
      // 1f5: invokestatic fcu.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: istore 10
      // 1fb: iload 5
      // 1fd: ifne 075
      // 200: iload 10
      // 202: iload 5
      // 204: ifeq 227
      // 207: iload 8
      // 209: goto 210
      // 20c: invokestatic fcu.a (Loov;)Loov;
      // 20f: athrow
      // 210: if_icmple 21e
      // 213: iload 10
      // 215: bipush 1
      // 216: isub
      // 217: istore 8
      // 219: iload 5
      // 21b: ifne 24f
      // 21e: iload 8
      // 220: goto 227
      // 223: invokestatic fcu.a (Loov;)Loov;
      // 226: athrow
      // 227: iload 5
      // 229: ifeq 24d
      // 22c: ifle 245
      // 22f: goto 236
      // 232: invokestatic fcu.a (Loov;)Loov;
      // 235: athrow
      // 236: iinc 8 -1
      // 239: iload 5
      // 23b: ifne 24f
      // 23e: goto 245
      // 241: invokestatic fcu.a (Loov;)Loov;
      // 244: athrow
      // 245: bipush 0
      // 246: goto 24d
      // 249: invokestatic fcu.a (Loov;)Loov;
      // 24c: athrow
      // 24d: istore 8
      // 24f: iload 9
      // 251: iload 8
      // 253: bipush 1
      // 254: isub
      // 255: iload 5
      // 257: ifeq 26c
      // 25a: if_icmple 268
      // 25d: goto 264
      // 260: invokestatic fcu.a (Loov;)Loov;
      // 263: athrow
      // 264: iload 9
      // 266: istore 8
      // 268: iload 7
      // 26a: iload 8
      // 26c: if_icmpeq 2e4
      // 26f: aload 4
      // 271: getstatic fcu.crs L_ku;
      // 274: iload 8
      // 276: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 279: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 27e: astore 4
      // 280: iload 5
      // 282: ifeq 2b1
      // 285: aload 1
      // 286: aload 2
      // 287: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 28a: aload 6
      // 28c: if_acmpne 2a6
      // 28f: goto 296
      // 292: invokestatic fcu.a (Loov;)Loov;
      // 295: athrow
      // 296: aload 1
      // 297: aload 2
      // 298: aload 4
      // 29a: bipush 2
      // 29b: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 29e: pop
      // 29f: goto 2a6
      // 2a2: invokestatic fcu.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: getfield fcu.zgi Ljava/util/Set;
      // 2aa: aload 2
      // 2ab: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2b0: pop
      // 2b1: invokestatic vt2.values ()[Lvt2;
      // 2b4: astore 11
      // 2b6: aload 11
      // 2b8: arraylength
      // 2b9: istore 12
      // 2bb: bipush 0
      // 2bc: istore 13
      // 2be: iload 13
      // 2c0: iload 12
      // 2c2: if_icmpge 2e4
      // 2c5: aload 11
      // 2c7: iload 13
      // 2c9: aaload
      // 2ca: astore 14
      // 2cc: aload 0
      // 2cd: getfield fcu.zgi Ljava/util/Set;
      // 2d0: aload 2
      // 2d1: aload 14
      // 2d3: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2d6: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2db: pop
      // 2dc: iinc 13 1
      // 2df: iload 5
      // 2e1: ifne 2be
      // 2e4: aload 4
      // 2e6: areturn
   }

   private void bth(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: iload 3
      // 07: ifeq 26
      // 0a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0d: invokeinterface zfz.r_y ()Le0x; 1
      // 12: aload 0
      // 13: if_acmpne 57
      // 16: goto 1d
      // 19: invokestatic fcu.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 2
      // 1f: goto 26
      // 22: invokestatic fcu.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 2a: invokestatic vt2.values ()[Lvt2;
      // 2d: astore 4
      // 2f: aload 4
      // 31: arraylength
      // 32: istore 5
      // 34: bipush 0
      // 35: istore 6
      // 37: iload 6
      // 39: iload 5
      // 3b: if_icmpge 57
      // 3e: aload 4
      // 40: iload 6
      // 42: aaload
      // 43: astore 7
      // 45: aload 1
      // 46: aload 2
      // 47: aload 7
      // 49: invokevirtual mew.offset (Lvt2;)Lmew;
      // 4c: aload 0
      // 4d: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 50: iinc 6 1
      // 53: iload 3
      // 54: ifne 37
      // 57: return
   }

   @Override
   public void tfc(OpaquePredicate param1, mew param2, zfz param3) {
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
      // 06: getfield OpaquePredicate.v0f Z
      // 09: ifne f7
      // 0c: aload 0
      // 0d: aload 1
      // 0e: aload 2
      // 0f: aload 3
      // 10: invokespecial fcu.wl1 (Lt9d;Lmew;Lzfz;)Lzfz;
      // 13: pop
      // 14: getstatic vt2$unz.vrc Lvt2$unz;
      // 17: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 1a: astore 5
      // 1c: aload 5
      // 1e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 23: ifeq 4e
      // 26: aload 5
      // 28: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d: checkcast vt2
      // 30: astore 6
      // 32: aload 1
      // 33: aload 2
      // 34: aload 6
      // 36: invokevirtual mew.offset (Lvt2;)Lmew;
      // 39: aload 0
      // 3a: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 3d: iload 4
      // 3f: ifne 56
      // 42: iload 4
      // 44: ifeq 1c
      // 47: goto 4e
      // 4a: invokestatic fcu.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic vt2$unz.fzl Lvt2$unz;
      // 51: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 54: astore 5
      // 56: aload 5
      // 58: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5d: ifeq 88
      // 60: aload 5
      // 62: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 67: checkcast vt2
      // 6a: astore 6
      // 6c: aload 0
      // 6d: aload 1
      // 6e: aload 2
      // 6f: aload 6
      // 71: invokevirtual mew.offset (Lvt2;)Lmew;
      // 74: invokespecial fcu.bth (Lt9d;Lmew;)V
      // 77: iload 4
      // 79: ifne 90
      // 7c: iload 4
      // 7e: ifeq 56
      // 81: goto 88
      // 84: invokestatic fcu.a (Loov;)Loov;
      // 87: athrow
      // 88: getstatic vt2$unz.fzl Lvt2$unz;
      // 8b: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 8e: astore 5
      // 90: aload 5
      // 92: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 97: ifeq f7
      // 9a: aload 5
      // 9c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a1: checkcast vt2
      // a4: astore 6
      // a6: aload 2
      // a7: aload 6
      // a9: invokevirtual mew.offset (Lvt2;)Lmew;
      // ac: astore 7
      // ae: iload 4
      // b0: ifne dc
      // b3: aload 1
      // b4: aload 7
      // b6: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // b9: invokeinterface zfz.r_y ()Le0x; 1
      // be: invokevirtual e0x.y0n ()Z
      // c1: ifeq e1
      // c4: goto cb
      // c7: invokestatic fcu.a (Loov;)Loov;
      // ca: athrow
      // cb: aload 0
      // cc: aload 1
      // cd: aload 7
      // cf: invokevirtual mew.nuv ()Lmew;
      // d2: invokespecial fcu.bth (Lt9d;Lmew;)V
      // d5: goto dc
      // d8: invokestatic fcu.a (Loov;)Loov;
      // db: athrow
      // dc: iload 4
      // de: ifeq f2
      // e1: aload 0
      // e2: aload 1
      // e3: aload 7
      // e5: invokevirtual mew.eve ()Lmew;
      // e8: invokespecial fcu.bth (Lt9d;Lmew;)V
      // eb: goto f2
      // ee: invokestatic fcu.a (Loov;)Loov;
      // f1: athrow
      // f2: iload 4
      // f4: ifeq 90
      // f7: return
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
      // 08: aload 3
      // 09: invokespecial e0x.b8f (Lt9d;Lmew;Lzfz;)V
      // 0c: aload 1
      // 0d: getfield OpaquePredicate.v0f Z
      // 10: ifne fe
      // 13: invokestatic vt2.values ()[Lvt2;
      // 16: astore 5
      // 18: aload 5
      // 1a: arraylength
      // 1b: istore 6
      // 1d: bipush 0
      // 1e: istore 7
      // 20: iload 7
      // 22: iload 6
      // 24: if_icmpge 4d
      // 27: aload 5
      // 29: iload 7
      // 2b: aaload
      // 2c: astore 8
      // 2e: aload 1
      // 2f: aload 2
      // 30: aload 8
      // 32: invokevirtual mew.offset (Lvt2;)Lmew;
      // 35: aload 0
      // 36: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 39: iinc 7 1
      // 3c: iload 4
      // 3e: ifeq 55
      // 41: iload 4
      // 43: ifne 20
      // 46: goto 4d
      // 49: invokestatic fcu.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 1
      // 4f: aload 2
      // 50: aload 3
      // 51: invokespecial fcu.wl1 (Lt9d;Lmew;Lzfz;)Lzfz;
      // 54: pop
      // 55: getstatic vt2$unz.fzl Lvt2$unz;
      // 58: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 5b: astore 5
      // 5d: aload 5
      // 5f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 64: ifeq 8f
      // 67: aload 5
      // 69: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6e: checkcast vt2
      // 71: astore 6
      // 73: aload 0
      // 74: aload 1
      // 75: aload 2
      // 76: aload 6
      // 78: invokevirtual mew.offset (Lvt2;)Lmew;
      // 7b: invokespecial fcu.bth (Lt9d;Lmew;)V
      // 7e: iload 4
      // 80: ifeq 97
      // 83: iload 4
      // 85: ifne 5d
      // 88: goto 8f
      // 8b: invokestatic fcu.a (Loov;)Loov;
      // 8e: athrow
      // 8f: getstatic vt2$unz.fzl Lvt2$unz;
      // 92: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 95: astore 5
      // 97: aload 5
      // 99: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9e: ifeq fe
      // a1: aload 5
      // a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a8: checkcast vt2
      // ab: astore 6
      // ad: aload 2
      // ae: aload 6
      // b0: invokevirtual mew.offset (Lvt2;)Lmew;
      // b3: astore 7
      // b5: iload 4
      // b7: ifeq e3
      // ba: aload 1
      // bb: aload 7
      // bd: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // c0: invokeinterface zfz.r_y ()Le0x; 1
      // c5: invokevirtual e0x.y0n ()Z
      // c8: ifeq e8
      // cb: goto d2
      // ce: invokestatic fcu.a (Loov;)Loov;
      // d1: athrow
      // d2: aload 0
      // d3: aload 1
      // d4: aload 7
      // d6: invokevirtual mew.nuv ()Lmew;
      // d9: invokespecial fcu.bth (Lt9d;Lmew;)V
      // dc: goto e3
      // df: invokestatic fcu.a (Loov;)Loov;
      // e2: athrow
      // e3: iload 4
      // e5: ifne f9
      // e8: aload 0
      // e9: aload 1
      // ea: aload 7
      // ec: invokevirtual mew.eve ()Lmew;
      // ef: invokespecial fcu.bth (Lt9d;Lmew;)V
      // f2: goto f9
      // f5: invokestatic fcu.a (Loov;)Loov;
      // f8: athrow
      // f9: iload 4
      // fb: ifne 97
      // fe: return
   }

   private int wd_(OpaquePredicate param1, mew param2, int param3) {
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
      // 07: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a: iload 4
      // 0c: ifne 2a
      // 0f: invokeinterface zfz.r_y ()Le0x; 1
      // 14: aload 0
      // 15: if_acmpeq 25
      // 18: goto 1f
      // 1b: invokestatic fcu.a (Loov;)Loov;
      // 1e: athrow
      // 1f: iload 3
      // 20: ireturn
      // 21: invokestatic fcu.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2a: getstatic fcu.crs L_ku;
      // 2d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 32: checkcast java/lang/Integer
      // 35: invokevirtual java/lang/Integer.intValue ()I
      // 38: istore 5
      // 3a: iload 5
      // 3c: iload 4
      // 3e: ifne 55
      // 41: iload 3
      // 42: if_icmple 58
      // 45: goto 4c
      // 48: invokestatic fcu.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 5
      // 4e: goto 55
      // 51: invokestatic fcu.a (Loov;)Loov;
      // 54: athrow
      // 55: goto 59
      // 58: iload 3
      // 59: ireturn
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
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifeq 25
      // 0e: ifne 5d
      // 11: goto 18
      // 14: invokestatic fcu.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokevirtual fcu.ctq (Lt9d;Lmew;)Z
      // 1e: goto 25
      // 21: invokestatic fcu.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 5
      // 27: ifeq 5c
      // 2a: ifeq 48
      // 2d: goto 34
      // 30: invokestatic fcu.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: aload 3
      // 38: invokespecial fcu.wl1 (Lt9d;Lmew;Lzfz;)Lzfz;
      // 3b: pop
      // 3c: iload 5
      // 3e: ifne 5d
      // 41: goto 48
      // 44: invokestatic fcu.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: aload 1
      // 4a: aload 2
      // 4b: aload 3
      // 4c: bipush 0
      // 4d: invokevirtual fcu.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 50: aload 1
      // 51: aload 2
      // 52: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 55: goto 5c
      // 58: invokestatic fcu.a (Loov;)Loov;
      // 5b: athrow
      // 5c: pop
      // 5d: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.deg;
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifeq 21
      // 0b: getfield fcu.dv3 Z
      // 0e: ifne 20
      // 11: goto 18
      // 14: invokestatic fcu.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 0
      // 19: goto 29
      // 1c: invokestatic fcu.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: aload 4
      // 26: invokevirtual fcu.gpi (Lm5n;Lmew;Lzfz;Lvt2;)I
      // 29: ireturn
   }

   @Override
   public int gpi(m5n param1, mew param2, zfz param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 5
      // 005: aload 0
      // 006: getfield fcu.dv3 Z
      // 009: iload 5
      // 00b: ifeq 02d
      // 00e: ifne 01e
      // 011: goto 018
      // 014: invokestatic fcu.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 0
      // 019: ireturn
      // 01a: invokestatic fcu.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 3
      // 01f: getstatic fcu.crs L_ku;
      // 022: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 027: checkcast java/lang/Integer
      // 02a: invokevirtual java/lang/Integer.intValue ()I
      // 02d: istore 6
      // 02f: iload 6
      // 031: iload 5
      // 033: ifeq 041
      // 036: ifne 042
      // 039: goto 040
      // 03c: invokestatic fcu.a (Loov;)Loov;
      // 03f: athrow
      // 040: bipush 0
      // 041: ireturn
      // 042: aload 4
      // 044: getstatic vt2.rf3 Lvt2;
      // 047: if_acmpne 051
      // 04a: iload 6
      // 04c: ireturn
      // 04d: invokestatic fcu.a (Loov;)Loov;
      // 050: athrow
      // 051: ldc vt2
      // 053: nop
      // 054: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 057: astore 7
      // 059: getstatic vt2$unz.fzl Lvt2$unz;
      // 05c: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 05f: astore 8
      // 061: aload 8
      // 063: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 068: ifeq 0ae
      // 06b: aload 8
      // 06d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 072: checkcast vt2
      // 075: astore 9
      // 077: aload 0
      // 078: aload 1
      // 079: aload 2
      // 07a: aload 9
      // 07c: invokespecial fcu.ef3 (Lm5n;Lmew;Lvt2;)Z
      // 07f: iload 5
      // 081: ifeq 0b6
      // 084: iload 5
      // 086: ifeq 0a8
      // 089: goto 090
      // 08c: invokestatic fcu.a (Loov;)Loov;
      // 08f: athrow
      // 090: ifeq 0a9
      // 093: goto 09a
      // 096: invokestatic fcu.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 7
      // 09c: aload 9
      // 09e: invokevirtual java/util/EnumSet.add (Ljava/lang/Object;)Z
      // 0a1: goto 0a8
      // 0a4: invokestatic fcu.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: pop
      // 0a9: iload 5
      // 0ab: ifne 061
      // 0ae: aload 4
      // 0b0: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 0b3: invokevirtual vt2$y0s.pyt ()Z
      // 0b6: iload 5
      // 0b8: ifeq 0ee
      // 0bb: ifeq 0e7
      // 0be: goto 0c5
      // 0c1: invokestatic fcu.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 7
      // 0c7: invokevirtual java/util/EnumSet.isEmpty ()Z
      // 0ca: iload 5
      // 0cc: ifeq 0ee
      // 0cf: goto 0d6
      // 0d2: invokestatic fcu.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: ifeq 0e7
      // 0d9: goto 0e0
      // 0dc: invokestatic fcu.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: iload 6
      // 0e2: ireturn
      // 0e3: invokestatic fcu.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: aload 4
      // 0eb: invokevirtual java/util/EnumSet.contains (Ljava/lang/Object;)Z
      // 0ee: iload 5
      // 0f0: ifeq 145
      // 0f3: ifeq 144
      // 0f6: goto 0fd
      // 0f9: invokestatic fcu.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 7
      // 0ff: aload 4
      // 101: invokevirtual vt2.tgw ()Lvt2;
      // 104: invokevirtual java/util/EnumSet.contains (Ljava/lang/Object;)Z
      // 107: iload 5
      // 109: ifeq 145
      // 10c: goto 113
      // 10f: invokestatic fcu.a (Loov;)Loov;
      // 112: athrow
      // 113: ifne 144
      // 116: goto 11d
      // 119: invokestatic fcu.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 7
      // 11f: aload 4
      // 121: invokevirtual vt2.drv ()Lvt2;
      // 124: invokevirtual java/util/EnumSet.contains (Ljava/lang/Object;)Z
      // 127: iload 5
      // 129: ifeq 145
      // 12c: goto 133
      // 12f: invokestatic fcu.a (Loov;)Loov;
      // 132: athrow
      // 133: ifne 144
      // 136: goto 13d
      // 139: invokestatic fcu.a (Loov;)Loov;
      // 13c: athrow
      // 13d: iload 6
      // 13f: ireturn
      // 140: invokestatic fcu.a (Loov;)Loov;
      // 143: athrow
      // 144: bipush 0
      // 145: ireturn
   }

   private boolean ef3(m5n param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: aload 3
      // 02: invokevirtual mew.offset (Lvt2;)Lmew;
      // 05: astore 5
      // 07: invokestatic OpaquePredicate.c ()I
      // 0a: aload 1
      // 0b: aload 5
      // 0d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 12: astore 6
      // 14: istore 4
      // 16: aload 6
      // 18: invokeinterface zfz.r_y ()Le0x; 1
      // 1d: astore 7
      // 1f: aload 7
      // 21: invokevirtual e0x.y0n ()Z
      // 24: istore 8
      // 26: aload 1
      // 27: aload 2
      // 28: invokevirtual mew.nuv ()Lmew;
      // 2b: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 30: invokeinterface zfz.r_y ()Le0x; 1
      // 35: invokevirtual e0x.y0n ()Z
      // 38: istore 9
      // 3a: iload 9
      // 3c: iload 4
      // 3e: ifne 90
      // 41: ifne 8a
      // 44: goto 4b
      // 47: invokestatic fcu.a (Loov;)Loov;
      // 4a: athrow
      // 4b: iload 8
      // 4d: iload 4
      // 4f: ifne 90
      // 52: goto 59
      // 55: invokestatic fcu.a (Loov;)Loov;
      // 58: athrow
      // 59: ifeq 8a
      // 5c: goto 63
      // 5f: invokestatic fcu.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: aload 5
      // 66: invokevirtual mew.nuv ()Lmew;
      // 69: invokestatic fcu.ssp (Lm5n;Lmew;)Z
      // 6c: iload 4
      // 6e: ifne 90
      // 71: goto 78
      // 74: invokestatic fcu.a (Loov;)Loov;
      // 77: athrow
      // 78: ifeq 8a
      // 7b: goto 82
      // 7e: invokestatic fcu.a (Loov;)Loov;
      // 81: athrow
      // 82: bipush 1
      // 83: goto fd
      // 86: invokestatic fcu.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 6
      // 8c: aload 3
      // 8d: invokestatic fcu.oan (Lzfz;Lvt2;)Z
      // 90: iload 4
      // 92: ifne a0
      // 95: ifeq a3
      // 98: goto 9f
      // 9b: invokestatic fcu.a (Loov;)Loov;
      // 9e: athrow
      // 9f: bipush 1
      // a0: goto fd
      // a3: aload 7
      // a5: getstatic ox_.duh Lamu;
      // a8: if_acmpne c8
      // ab: aload 6
      // ad: getstatic f8k.em9 Lqx_;
      // b0: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // b5: aload 3
      // b6: if_acmpne c8
      // b9: goto c0
      // bc: invokestatic fcu.a (Loov;)Loov;
      // bf: athrow
      // c0: bipush 1
      // c1: goto fd
      // c4: invokestatic fcu.a (Loov;)Loov;
      // c7: athrow
      // c8: iload 8
      // ca: iload 4
      // cc: ifne e9
      // cf: ifne fc
      // d2: goto d9
      // d5: invokestatic fcu.a (Loov;)Loov;
      // d8: athrow
      // d9: aload 1
      // da: aload 5
      // dc: invokevirtual mew.eve ()Lmew;
      // df: invokestatic fcu.ssp (Lm5n;Lmew;)Z
      // e2: goto e9
      // e5: invokestatic fcu.a (Loov;)Loov;
      // e8: athrow
      // e9: iload 4
      // eb: ifne f9
      // ee: ifeq fc
      // f1: goto f8
      // f4: invokestatic fcu.a (Loov;)Loov;
      // f7: athrow
      // f8: bipush 1
      // f9: goto fd
      // fc: bipush 0
      // fd: ireturn
   }

   public static boolean ssp(m5n var0, mew var1) {
      return uze(var0.getBlockState(var1));
   }

   public static boolean uze(zfz var0) {
      return oan(var0, (vt2)null);
   }

   public static boolean oan(zfz param0, vt2 param1) {
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
      // 05: invokeinterface zfz.r_y ()Le0x; 1
      // 0a: astore 3
      // 0b: aload 3
      // 0c: getstatic ox_.s0f Lfcu;
      // 0f: if_acmpne 18
      // 12: bipush 1
      // 13: ireturn
      // 14: invokestatic fcu.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic ox_.r0f Lamu;
      // 1b: aload 3
      // 1c: invokevirtual amu.zl0 (Le0x;)Z
      // 1f: iload 2
      // 20: ifne 6a
      // 23: ifeq 66
      // 26: goto 2d
      // 29: invokestatic fcu.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getstatic amu.em9 Lqx_;
      // 31: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 36: checkcast vt2
      // 39: astore 4
      // 3b: aload 4
      // 3d: aload 1
      // 3e: iload 2
      // 3f: ifne 59
      // 42: if_acmpeq 5c
      // 45: goto 4c
      // 48: invokestatic fcu.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 4
      // 4e: invokevirtual vt2.b4b ()Lvt2;
      // 51: aload 1
      // 52: goto 59
      // 55: invokestatic fcu.a (Loov;)Loov;
      // 58: athrow
      // 59: if_acmpne 64
      // 5c: bipush 1
      // 5d: goto 65
      // 60: invokestatic fcu.a (Loov;)Loov;
      // 63: athrow
      // 64: bipush 0
      // 65: ireturn
      // 66: aload 3
      // 67: invokevirtual e0x.scl ()Z
      // 6a: ifeq 80
      // 6d: aload 1
      // 6e: ifnull 80
      // 71: goto 78
      // 74: invokestatic fcu.a (Loov;)Loov;
      // 77: athrow
      // 78: bipush 1
      // 79: goto 81
      // 7c: invokestatic fcu.a (Loov;)Loov;
      // 7f: athrow
      // 80: bipush 0
      // 81: ireturn
   }

   @Override
   public boolean scl() {
      return this.dv3;
   }

   private int c0c(int var1) {
      float var3 = (float)var1 / 15.0F;
      int var10000 = OpaquePredicate.b();
      float var4 = var3 * 0.6F + 0.4F;
      int var2 = var10000;
      if (var1 == 0) {
         var4 = 0.3F;
      }

      float var5 = var3 * var3 * 0.7F - 0.5F;
      float var6 = var3 * var3 * 0.6F - 0.7F;

      label39: {
         label38: {
            try {
               float var13;
               var10000 = (var13 = var5 - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
               if (var2 == 0) {
                  break label39;
               }

               if (var10000 >= 0) {
                  break label38;
               }
            } catch (oov var11) {
               throw a(var11);
            }

            var5 = 0.0F;
         }

         float var14;
         var10000 = (var14 = var6 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      }

      label30: {
         label29: {
            try {
               if (var2 == 0) {
                  break label30;
               }

               if (var10000 >= 0) {
                  break label29;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var6 = 0.0F;
         }

         var10000 = fe6.faa((int)(var4 * 255.0F), 0, 255);
      }

      int var7 = var10000;
      int var8 = fe6.faa((int)(var5 * 255.0F), 0, 255);
      int var9 = fe6.faa((int)(var6 * 255.0F), 0, 255);
      return 0xFF000000 | var7 << 16 | var8 << 8 | var9;
   }

   @Override
   public void kyo(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic fcu.crs L_ku;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 6
      // 16: iload 6
      // 18: iload 5
      // 1a: ifeq 32
      // 1d: ifeq c2
      // 20: goto 27
      // 23: invokestatic fcu.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual mew.getX ()I
      // 2b: goto 32
      // 2e: invokestatic fcu.a (Loov;)Loov;
      // 31: athrow
      // 32: i2d
      // 33: ldc2_w 0.5
      // 36: dadd
      // 37: aload 4
      // 39: invokevirtual java/util/Random.nextFloat ()F
      // 3c: f2d
      // 3d: ldc2_w 0.5
      // 40: dsub
      // 41: ldc2_w 0.2
      // 44: dmul
      // 45: dadd
      // 46: dstore 7
      // 48: aload 2
      // 49: invokevirtual mew.getY ()I
      // 4c: i2f
      // 4d: ldc 0.0625
      // 4f: nop
      // 50: fadd
      // 51: f2d
      // 52: dstore 9
      // 54: aload 2
      // 55: invokevirtual mew.getZ ()I
      // 58: i2d
      // 59: ldc2_w 0.5
      // 5c: dadd
      // 5d: aload 4
      // 5f: invokevirtual java/util/Random.nextFloat ()F
      // 62: f2d
      // 63: ldc2_w 0.5
      // 66: dsub
      // 67: ldc2_w 0.2
      // 6a: dmul
      // 6b: dadd
      // 6c: dstore 11
      // 6e: iload 6
      // 70: i2f
      // 71: ldc 15.0
      // 73: nop
      // 74: fdiv
      // 75: fstore 13
      // 77: fload 13
      // 79: ldc 0.6
      // 7b: nop
      // 7c: fmul
      // 7d: ldc 0.4
      // 7f: nop
      // 80: fadd
      // 81: fstore 14
      // 83: fconst_0
      // 84: fload 13
      // 86: fload 13
      // 88: fmul
      // 89: ldc 0.7
      // 8b: nop
      // 8c: fmul
      // 8d: ldc 0.5
      // 8f: nop
      // 90: fsub
      // 91: invokestatic java/lang/Math.max (FF)F
      // 94: fstore 15
      // 96: fconst_0
      // 97: fload 13
      // 99: fload 13
      // 9b: fmul
      // 9c: ldc 0.6
      // 9e: nop
      // 9f: fmul
      // a0: ldc 0.7
      // a2: nop
      // a3: fsub
      // a4: invokestatic java/lang/Math.max (FF)F
      // a7: fstore 16
      // a9: aload 1
      // aa: getstatic w_0.dyc Lw_0;
      // ad: dload 7
      // af: dload 9
      // b1: dload 11
      // b3: fload 14
      // b5: f2d
      // b6: fload 15
      // b8: f2d
      // b9: fload 16
      // bb: f2d
      // bc: bipush 0
      // bd: newarray 10
      // bf: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // c2: return
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.deg;
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(crs, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(crs);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{l4z, b5k, dnl, _a7, crs});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8618977942189158277L, 1529237389771308571L, MethodHandles.lookup().lookupClass()).a(99529818216333L);
      // $VF: monitorexit
      long var10 = var10000 ^ 11126023720174L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[5];
      int var6 = 0;
      String var5 = "!Aö\"\u0092ßí¨\b\u0002êZrÄæÙ\u008d\bv\u0005\u0092~5\u0095ã\u0081";
      int var7 = "!Aö\"\u0092ßí¨\b\u0002êZrÄæÙ\u008d\bv\u0005\u0092~5\u0095ã\u0081".length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = b(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     l4z = zb_.pq4(var8[0], fcu$k9f.class);
                     b5k = zb_.pq4(var8[4], fcu$k9f.class);
                     dnl = zb_.pq4(var8[3], fcu$k9f.class);
                     _a7 = zb_.pq4(var8[1], fcu$k9f.class);
                     crs = _ku.wgl(var8[2], 0, 15);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "\u0017\u001b)W;\u0087Q\u0018\b#æRªÎ3;`";
                  var7 = "\u0017\u001b)W;\u0087Q\u0018\b#æRªÎ3;`".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
}
