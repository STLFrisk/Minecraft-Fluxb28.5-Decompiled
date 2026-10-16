import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xv4 {
   public Map iky = Maps.newHashMap();
   public static xv4 b2r;
   public owt z7t;
   public static double pia;
   public static double i9n;
   public static double ltj;
   public lc5 gby;
   public t9d z_g;
   public i2h hsk;
   public float ew8;
   public float cf8;
   public double td6;
   public double tq0;
   public double zcy;
   public pyk k1b;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public q9h nvz(Class param1) {
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
      // 05: getfield xv4.iky Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast q9h
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 50
      // 17: ifnonnull 4f
      // 1a: goto 21
      // 1d: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 1
      // 22: iload 2
      // 23: ifne 4e
      // 26: goto 2d
      // 29: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: ldc pyk
      // 2f: nop
      // 30: if_acmpeq 4f
      // 33: goto 3a
      // 36: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 3f: invokevirtual xv4.nvz (Ljava/lang/Class;)Lq9h;
      // 42: astore 3
      // 43: aload 0
      // 44: getfield xv4.iky Ljava/util/Map;
      // 47: aload 1
      // 48: aload 3
      // 49: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4e: pop
      // 4f: aload 3
      // 50: areturn
   }

   public q9h yhq(pyk var1) {
      int var2 = t9d.b();

      pyk var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label27;
            }

            if (var1 == null) {
               return null;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (!var10000.fyn()) {
            return this.nvz(var1.getClass());
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return null;
   }

   public void udj(t9d param1, lc5 param2, owt param3, i2h param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: iload 6
      // 08: ifne 98
      // 0b: getfield xv4.z_g Lt9d;
      // 0e: aload 1
      // 0f: if_acmpeq 25
      // 12: goto 19
      // 15: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokevirtual xv4.sm4 (Lt9d;)V
      // 1e: goto 25
      // 21: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: aload 2
      // 27: putfield xv4.gby Llc5;
      // 2a: aload 0
      // 2b: aload 4
      // 2d: putfield xv4.hsk Li2h;
      // 30: aload 0
      // 31: aload 3
      // 32: putfield xv4.z7t Lowt;
      // 35: aload 0
      // 36: aload 4
      // 38: getfield i2h.p3h F
      // 3b: aload 4
      // 3d: getfield i2h.x5k F
      // 40: aload 4
      // 42: getfield i2h.p3h F
      // 45: fsub
      // 46: fload 5
      // 48: fmul
      // 49: fadd
      // 4a: putfield xv4.ew8 F
      // 4d: aload 0
      // 4e: aload 4
      // 50: getfield i2h.j25 F
      // 53: aload 4
      // 55: getfield i2h.y2i F
      // 58: aload 4
      // 5a: getfield i2h.j25 F
      // 5d: fsub
      // 5e: fload 5
      // 60: fmul
      // 61: fadd
      // 62: putfield xv4.cf8 F
      // 65: aload 0
      // 66: aload 4
      // 68: getfield i2h.ivp D
      // 6b: aload 4
      // 6d: getfield i2h.o2v D
      // 70: aload 4
      // 72: getfield i2h.ivp D
      // 75: dsub
      // 76: fload 5
      // 78: f2d
      // 79: dmul
      // 7a: dadd
      // 7b: putfield xv4.td6 D
      // 7e: aload 0
      // 7f: aload 4
      // 81: getfield i2h.c54 D
      // 84: aload 4
      // 86: getfield i2h.kfp D
      // 89: aload 4
      // 8b: getfield i2h.c54 D
      // 8e: dsub
      // 8f: fload 5
      // 91: f2d
      // 92: dmul
      // 93: dadd
      // 94: putfield xv4.tq0 D
      // 97: aload 0
      // 98: aload 4
      // 9a: getfield i2h.e2b D
      // 9d: aload 4
      // 9f: getfield i2h.vbd D
      // a2: aload 4
      // a4: getfield i2h.e2b D
      // a7: dsub
      // a8: fload 5
      // aa: f2d
      // ab: dmul
      // ac: dadd
      // ad: putfield xv4.zcy D
      // b0: return
   }

   public void c4z(pyk param1, float param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 0
      // 007: getfield xv4.td6 D
      // 00a: aload 0
      // 00b: getfield xv4.tq0 D
      // 00e: aload 0
      // 00f: getfield xv4.zcy D
      // 012: invokevirtual pyk.vor (DDD)D
      // 015: aload 1
      // 016: invokevirtual pyk.g2f ()D
      // 019: dcmpg
      // 01a: iload 4
      // 01c: ifne 02a
      // 01f: ifge 17a
      // 022: goto 029
      // 025: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: bipush 1
      // 02a: istore 5
      // 02c: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_hasFastRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 02f: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 032: iload 4
      // 034: ifne 085
      // 037: ifeq 083
      // 03a: goto 041
      // 03d: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: aload 0
      // 042: getfield xv4.zao Z
      // 045: iload 4
      // 047: ifne 07d
      // 04a: goto 051
      // 04d: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: ifeq 07c
      // 054: goto 05b
      // 057: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 1
      // 05c: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_hasFastRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 05f: bipush 0
      // 060: anewarray 26
      // 063: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 066: iload 4
      // 068: ifne 07d
      // 06b: goto 072
      // 06e: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: ifne 080
      // 075: goto 07c
      // 078: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: bipush 1
      // 07d: goto 081
      // 080: bipush 0
      // 081: istore 5
      // 083: iload 5
      // 085: iload 4
      // 087: ifne 0aa
      // 08a: ifeq 0d3
      // 08d: goto 094
      // 090: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: invokestatic qpm.ne_ ()V
      // 097: aload 0
      // 098: getfield xv4.z_g Lt9d;
      // 09b: aload 1
      // 09c: invokevirtual pyk.y8_ ()Lmew;
      // 09f: bipush 0
      // 0a0: invokevirtual t9d.getCombinedLight (Lmew;I)I
      // 0a3: goto 0aa
      // 0a6: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: istore 6
      // 0ac: iload 6
      // 0ae: ldc 65536
      // 0b0: nop
      // 0b1: irem
      // 0b2: istore 7
      // 0b4: iload 6
      // 0b6: ldc 65536
      // 0b8: nop
      // 0b9: idiv
      // 0ba: istore 8
      // 0bc: getstatic gis.exn I
      // 0bf: iload 7
      // 0c1: i2f
      // 0c2: fconst_1
      // 0c3: fdiv
      // 0c4: iload 8
      // 0c6: i2f
      // 0c7: fconst_1
      // 0c8: fdiv
      // 0c9: invokestatic gis.w9e (IFF)V
      // 0cc: fconst_1
      // 0cd: fconst_1
      // 0ce: fconst_1
      // 0cf: fconst_1
      // 0d0: invokestatic hzu.wn0 (FFFF)V
      // 0d3: aload 1
      // 0d4: invokevirtual pyk.y8_ ()Lmew;
      // 0d7: astore 6
      // 0d9: aload 0
      // 0da: getfield xv4.z_g Lt9d;
      // 0dd: aload 6
      // 0df: bipush 0
      // 0e0: invokevirtual t9d.jy4 (Lmew;Z)Z
      // 0e3: iload 4
      // 0e5: ifne 0f6
      // 0e8: ifne 0f3
      // 0eb: goto 0f2
      // 0ee: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: return
      // 0f3: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 0f6: iload 4
      // 0f8: ifne 130
      // 0fb: ifeq 108
      // 0fe: goto 105
      // 101: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: invokestatic net/optifine/EmissiveTextures.beginRender ()V
      // 108: aload 0
      // 109: aload 1
      // 10a: aload 6
      // 10c: invokevirtual mew.getX ()I
      // 10f: i2d
      // 110: getstatic xv4.pia D
      // 113: dsub
      // 114: aload 6
      // 116: invokevirtual mew.getY ()I
      // 119: i2d
      // 11a: getstatic xv4.i9n D
      // 11d: dsub
      // 11e: aload 6
      // 120: invokevirtual mew.getZ ()I
      // 123: i2d
      // 124: getstatic xv4.ltj D
      // 127: dsub
      // 128: fload 2
      // 129: iload 3
      // 12a: invokevirtual xv4.y42 (Lpyk;DDDFI)V
      // 12d: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 130: iload 4
      // 132: ifne 142
      // 135: ifeq 17a
      // 138: goto 13f
      // 13b: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: invokestatic net/optifine/EmissiveTextures.hasEmissive ()Z
      // 142: ifeq 177
      // 145: invokestatic net/optifine/EmissiveTextures.beginRenderEmissive ()V
      // 148: aload 0
      // 149: aload 1
      // 14a: aload 6
      // 14c: invokevirtual mew.getX ()I
      // 14f: i2d
      // 150: getstatic xv4.pia D
      // 153: dsub
      // 154: aload 6
      // 156: invokevirtual mew.getY ()I
      // 159: i2d
      // 15a: getstatic xv4.i9n D
      // 15d: dsub
      // 15e: aload 6
      // 160: invokevirtual mew.getZ ()I
      // 163: i2d
      // 164: getstatic xv4.ltj D
      // 167: dsub
      // 168: fload 2
      // 169: iload 3
      // 16a: invokevirtual xv4.y42 (Lpyk;DDDFI)V
      // 16d: invokestatic net/optifine/EmissiveTextures.endRenderEmissive ()V
      // 170: goto 177
      // 173: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: invokestatic net/optifine/EmissiveTextures.endRender ()V
      // 17a: return
   }

   public void h74(pyk var1, double var2, double var4, double var6, float var8) {
      this.y42(var1, var2, var4, var6, var8, -1);
   }

   public void y42(pyk param1, double param2, double param4, double param6, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic xv4.a J
      // 03: ldc2_w 5040107276437
      // 06: lxor
      // 07: lstore 10
      // 09: invokestatic t9d.c ()I
      // 0c: istore 12
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokevirtual xv4.yhq (Lpyk;)Lq9h;
      // 13: astore 13
      // 15: iload 12
      // 17: ifne 2b
      // 1a: aload 13
      // 1c: ifnull d1
      // 1f: goto 26
      // 22: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: putfield xv4.k1b Lpyk;
      // 2b: aload 0
      // 2c: getfield xv4.zao Z
      // 2f: iload 12
      // 31: ifne 50
      // 34: ifeq 75
      // 37: goto 3e
      // 3a: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 1
      // 3f: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_hasFastRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 42: bipush 0
      // 43: anewarray 26
      // 46: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 49: goto 50
      // 4c: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: ifeq 75
      // 53: aload 13
      // 55: aload 1
      // 56: dload 2
      // 57: dload 4
      // 59: dload 6
      // 5b: fload 8
      // 5d: iload 9
      // 5f: aload 0
      // 60: getfield xv4.ldq Ljom;
      // 63: invokevirtual jom.zuq ()Lq3g;
      // 66: invokevirtual q9h.oh0 (Lpyk;DDDFILq3g;)V
      // 69: iload 12
      // 6b: ifeq 8b
      // 6e: goto 75
      // 71: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 13
      // 77: aload 1
      // 78: dload 2
      // 79: dload 4
      // 7b: dload 6
      // 7d: fload 8
      // 7f: iload 9
      // 81: invokevirtual q9h._ny (Lpyk;DDDFI)V
      // 84: goto 8b
      // 87: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: aload 0
      // 8c: aconst_null
      // 8d: putfield xv4.k1b Lpyk;
      // 90: goto d1
      // 93: astore 14
      // 95: aload 14
      // 97: sipush 6551
      // 9a: ldc2_w 1860683544508865384
      // 9d: lload 10
      // 9f: lxor
      // a0: invokedynamic s (IJ)Ljava/lang/String; bsm=xv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: nop
      // a6: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // a9: astore 15
      // ab: aload 15
      // ad: sipush 3594
      // b0: ldc2_w 6797259529880767732
      // b3: lload 10
      // b5: lxor
      // b6: invokedynamic s (IJ)Ljava/lang/String; bsm=xv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: nop
      // bc: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // bf: astore 16
      // c1: aload 1
      // c2: aload 16
      // c4: invokevirtual pyk.h3j (Lwsc;)V
      // c7: new oov
      // ca: dup
      // cb: aload 15
      // cd: invokespecial oov.<init> (Le1i;)V
      // d0: athrow
      // d1: return
   }

   public void sm4(t9d var1) {
      this.z_g = var1;
   }

   public owt dmy() {
      return this.z7t;
   }

   public void nfb() {
      this.ldq.zuq().ezr(7, gnl.n6w);
      this.zao = true;
   }

   public void _im(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield xv4.gby Llc5;
      // 04: getstatic yu2.nu_ Lgdz;
      // 07: invokevirtual lc5.anl (Lgdz;)V
      // 0a: invokestatic t9d.b ()I
      // 0d: invokestatic qpm.cng ()V
      // 10: sipush 770
      // 13: sipush 771
      // 16: invokestatic hzu.ru7 (II)V
      // 19: invokestatic hzu.spd ()V
      // 1c: invokestatic hzu.o1b ()V
      // 1f: istore 2
      // 20: invokestatic c05.mtz ()Z
      // 23: iload 2
      // 24: ifeq 4c
      // 27: ifeq 42
      // 2a: goto 31
      // 2d: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: sipush 7425
      // 34: invokestatic hzu.nn9 (I)V
      // 37: iload 2
      // 38: ifne 4f
      // 3b: goto 42
      // 3e: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: sipush 7424
      // 45: goto 4c
      // 48: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: invokestatic hzu.nn9 (I)V
      // 4f: iload 1
      // 50: ifle 70
      // 53: aload 0
      // 54: getfield xv4.ldq Ljom;
      // 57: invokevirtual jom.zuq ()Lq3g;
      // 5a: getstatic xv4.pia D
      // 5d: d2f
      // 5e: getstatic xv4.i9n D
      // 61: d2f
      // 62: getstatic xv4.ltj D
      // 65: d2f
      // 66: invokevirtual q3g.c7x (FFF)V
      // 69: goto 70
      // 6c: invokestatic xv4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield xv4.ldq Ljom;
      // 74: invokevirtual jom.q7g ()V
      // 77: invokestatic qpm.ne_ ()V
      // 7a: aload 0
      // 7b: bipush 0
      // 7c: putfield xv4.zao Z
      // 7f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5779146281110301198L, -8185228715652158859L, MethodHandles.lookup().lookupClass()).a(31075078385375L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 6092318833284L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u009b+-\u0088½j\u0003gÙ#\u0007ô\u000e7èÑê5·\u001dV\u0086\u0086NÖT\\>\\f\u0090\u0019Þ G\u0004\u0089IG=(èå\u007fCïÃ<ÈõJ;Ê·´Ðþ\u0081\u0084æLÑ¤çâø\u0007\u0085Iéô\u0005\u0097QXâª`ÂéÀ";
      int var8 = "\u009b+-\u0088½j\u0003gÙ#\u0007ô\u000e7èÑê5·\u001dV\u0086\u0086NÖT\\>\\f\u0090\u0019Þ G\u0004\u0089IG=(èå\u007fCïÃ<ÈõJ;Ê·´Ðþ\u0081\u0084æLÑ¤çâø\u0007\u0085Iéô\u0005\u0097QXâª`ÂéÀ"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            b2r = new xv4();
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15432;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("xv4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("xv4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
