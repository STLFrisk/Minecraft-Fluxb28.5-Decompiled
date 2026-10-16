import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;

public class opd {
   public static Minecraft ot0 = Minecraft.vz1();

   public static boolean hfn(Entity param0) {
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
      // 05: invokevirtual Entity.g5i ()Ljava/util/Collection;
      // 08: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 2
      // 0e: aload 2
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 78
      // 17: aload 2
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast sdj
      // 20: astore 3
      // 21: aload 3
      // 22: invokevirtual sdj._na ()I
      // 25: iload 1
      // 26: ifeq 79
      // 29: iload 1
      // 2a: ifeq 45
      // 2d: goto 34
      // 30: invokestatic opd.a (Loov;)Loov;
      // 33: athrow
      // 34: ifgt 41
      // 37: goto 3e
      // 3a: invokestatic opd.a (Loov;)Loov;
      // 3d: athrow
      // 3e: goto 0e
      // 41: aload 3
      // 42: invokevirtual sdj._na ()I
      // 45: iload 1
      // 46: ifeq 64
      // 49: getstatic mcs.zgt Lmcs;
      // 4c: invokevirtual mcs.wj9 ()I
      // 4f: if_icmpne 74
      // 52: goto 59
      // 55: invokestatic opd.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 3
      // 5a: invokevirtual sdj.ixu ()Z
      // 5d: goto 64
      // 60: invokestatic opd.a (Loov;)Loov;
      // 63: athrow
      // 64: iload 1
      // 65: ifeq 73
      // 68: ifne 74
      // 6b: goto 72
      // 6e: invokestatic opd.a (Loov;)Loov;
      // 71: athrow
      // 72: bipush 1
      // 73: ireturn
      // 74: iload 1
      // 75: ifne 0e
      // 78: bipush 0
      // 79: ireturn
   }

   public static void de2(int var0) {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      while (true) {
         if (var2 < var0) {
            try {
               ot0.vg8.lq7.sxi(new C03PacketPlayer$C04PacketPlayerPosition(ot0.vg8.o2v, ot0.vg8.kfp + 0.06, ot0.vg8.vbd, false));
               ot0.vg8.lq7.sxi(new C03PacketPlayer$C04PacketPlayerPosition(ot0.vg8.o2v, ot0.vg8.kfp, ot0.vg8.vbd, false));
               var2++;
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (oov var3) {
               throw a(var3);
            }
         }

         ot0.vg8.lq7.sxi(new C03PacketPlayer$C04PacketPlayerPosition(ot0.vg8.o2v, ot0.vg8.kfp + 0.1, ot0.vg8.vbd, false));
         break;
      }
   }

   public static double[] tek(EntityLivingBase var0) {
      double var1 = (double)Minecraft.vz1().gze.au3;
      return new double[]{var0.ivp + (var0.o2v - var0.ivp) * var1, var0.c54 + (var0.kfp - var0.c54) * var1, var0.e2b + (var0.vbd - var0.e2b) * var1};
   }

   public static void ekd(double[] param0, mew param1, double param2, double[] param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: daload
      // 003: dstore 6
      // 005: aload 0
      // 006: bipush 1
      // 007: daload
      // 008: dstore 8
      // 00a: aload 0
      // 00b: bipush 2
      // 00c: daload
      // 00d: dstore 10
      // 00f: aload 1
      // 010: invokevirtual mew.getX ()I
      // 013: i2d
      // 014: dstore 12
      // 016: invokestatic OpaquePredicate.c ()I
      // 019: aload 1
      // 01a: invokevirtual mew.getY ()I
      // 01d: i2d
      // 01e: dstore 14
      // 020: aload 1
      // 021: invokevirtual mew.getZ ()I
      // 024: i2d
      // 025: dstore 16
      // 027: istore 5
      // 029: dload 6
      // 02b: dload 12
      // 02d: dsub
      // 02e: invokestatic java/lang/Math.abs (D)D
      // 031: dload 8
      // 033: dload 14
      // 035: dsub
      // 036: invokestatic java/lang/Math.abs (D)D
      // 039: dadd
      // 03a: dload 10
      // 03c: dload 16
      // 03e: dsub
      // 03f: invokestatic java/lang/Math.abs (D)D
      // 042: dadd
      // 043: dstore 18
      // 045: bipush 0
      // 046: istore 20
      // 048: dload 18
      // 04a: dload 2
      // 04b: dcmpl
      // 04c: ifle 2af
      // 04f: dload 6
      // 051: dload 12
      // 053: dsub
      // 054: invokestatic java/lang/Math.abs (D)D
      // 057: dload 8
      // 059: dload 14
      // 05b: dsub
      // 05c: invokestatic java/lang/Math.abs (D)D
      // 05f: dadd
      // 060: dload 10
      // 062: dload 16
      // 064: dsub
      // 065: invokestatic java/lang/Math.abs (D)D
      // 068: dadd
      // 069: dstore 18
      // 06b: iload 20
      // 06d: iload 5
      // 06f: ifne 086
      // 072: bipush 120
      // 074: if_icmple 085
      // 077: goto 07e
      // 07a: invokestatic opd.a (Loov;)Loov;
      // 07d: athrow
      // 07e: goto 2af
      // 081: invokestatic opd.a (Loov;)Loov;
      // 084: athrow
      // 085: bipush 0
      // 086: istore 21
      // 088: dload 6
      // 08a: dload 12
      // 08c: dsub
      // 08d: dstore 22
      // 08f: dload 8
      // 091: dload 14
      // 093: dsub
      // 094: dstore 24
      // 096: dload 10
      // 098: dload 16
      // 09a: dsub
      // 09b: dstore 26
      // 09d: iload 20
      // 09f: bipush 1
      // 0a0: iand
      // 0a1: ifne 0af
      // 0a4: aload 4
      // 0a6: bipush 0
      // 0a7: daload
      // 0a8: goto 0b3
      // 0ab: invokestatic opd.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 4
      // 0b1: bipush 1
      // 0b2: daload
      // 0b3: dstore 28
      // 0b5: dload 22
      // 0b7: dconst_0
      // 0b8: dcmpg
      // 0b9: iload 5
      // 0bb: ifne 107
      // 0be: ifge 103
      // 0c1: goto 0c8
      // 0c4: invokestatic opd.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: dload 22
      // 0ca: invokestatic java/lang/Math.abs (D)D
      // 0cd: dload 28
      // 0cf: iload 5
      // 0d1: ifne 100
      // 0d4: goto 0db
      // 0d7: invokestatic opd.a (Loov;)Loov;
      // 0da: athrow
      // 0db: dcmpl
      // 0dc: ifle 0f2
      // 0df: goto 0e6
      // 0e2: invokestatic opd.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: dload 6
      // 0e8: dload 28
      // 0ea: dadd
      // 0eb: dstore 6
      // 0ed: iload 5
      // 0ef: ifeq 103
      // 0f2: dload 6
      // 0f4: dload 22
      // 0f6: invokestatic java/lang/Math.abs (D)D
      // 0f9: goto 100
      // 0fc: invokestatic opd.a (Loov;)Loov;
      // 0ff: athrow
      // 100: dadd
      // 101: dstore 6
      // 103: dload 22
      // 105: dconst_0
      // 106: dcmpl
      // 107: iload 5
      // 109: ifne 155
      // 10c: ifle 151
      // 10f: goto 116
      // 112: invokestatic opd.a (Loov;)Loov;
      // 115: athrow
      // 116: dload 22
      // 118: invokestatic java/lang/Math.abs (D)D
      // 11b: dload 28
      // 11d: iload 5
      // 11f: ifne 14e
      // 122: goto 129
      // 125: invokestatic opd.a (Loov;)Loov;
      // 128: athrow
      // 129: dcmpl
      // 12a: ifle 140
      // 12d: goto 134
      // 130: invokestatic opd.a (Loov;)Loov;
      // 133: athrow
      // 134: dload 6
      // 136: dload 28
      // 138: dsub
      // 139: dstore 6
      // 13b: iload 5
      // 13d: ifeq 151
      // 140: dload 6
      // 142: dload 22
      // 144: invokestatic java/lang/Math.abs (D)D
      // 147: goto 14e
      // 14a: invokestatic opd.a (Loov;)Loov;
      // 14d: athrow
      // 14e: dsub
      // 14f: dstore 6
      // 151: dload 24
      // 153: dconst_0
      // 154: dcmpg
      // 155: iload 5
      // 157: ifne 1a5
      // 15a: ifge 1a1
      // 15d: goto 164
      // 160: invokestatic opd.a (Loov;)Loov;
      // 163: athrow
      // 164: dload 24
      // 166: invokestatic java/lang/Math.abs (D)D
      // 169: ldc2_w 0.25
      // 16c: iload 5
      // 16e: ifne 19e
      // 171: goto 178
      // 174: invokestatic opd.a (Loov;)Loov;
      // 177: athrow
      // 178: dcmpl
      // 179: ifle 190
      // 17c: goto 183
      // 17f: invokestatic opd.a (Loov;)Loov;
      // 182: athrow
      // 183: dload 8
      // 185: ldc2_w 0.25
      // 188: dadd
      // 189: dstore 8
      // 18b: iload 5
      // 18d: ifeq 1a1
      // 190: dload 8
      // 192: dload 24
      // 194: invokestatic java/lang/Math.abs (D)D
      // 197: goto 19e
      // 19a: invokestatic opd.a (Loov;)Loov;
      // 19d: athrow
      // 19e: dadd
      // 19f: dstore 8
      // 1a1: dload 24
      // 1a3: dconst_0
      // 1a4: dcmpl
      // 1a5: iload 5
      // 1a7: ifne 1f5
      // 1aa: ifle 1f1
      // 1ad: goto 1b4
      // 1b0: invokestatic opd.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: dload 24
      // 1b6: invokestatic java/lang/Math.abs (D)D
      // 1b9: ldc2_w 0.25
      // 1bc: iload 5
      // 1be: ifne 1ee
      // 1c1: goto 1c8
      // 1c4: invokestatic opd.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: dcmpl
      // 1c9: ifle 1e0
      // 1cc: goto 1d3
      // 1cf: invokestatic opd.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: dload 8
      // 1d5: ldc2_w 0.25
      // 1d8: dsub
      // 1d9: dstore 8
      // 1db: iload 5
      // 1dd: ifeq 1f1
      // 1e0: dload 8
      // 1e2: dload 24
      // 1e4: invokestatic java/lang/Math.abs (D)D
      // 1e7: goto 1ee
      // 1ea: invokestatic opd.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: dsub
      // 1ef: dstore 8
      // 1f1: dload 26
      // 1f3: dconst_0
      // 1f4: dcmpg
      // 1f5: iload 5
      // 1f7: ifne 243
      // 1fa: ifge 23f
      // 1fd: goto 204
      // 200: invokestatic opd.a (Loov;)Loov;
      // 203: athrow
      // 204: dload 26
      // 206: invokestatic java/lang/Math.abs (D)D
      // 209: dload 28
      // 20b: iload 5
      // 20d: ifne 23c
      // 210: goto 217
      // 213: invokestatic opd.a (Loov;)Loov;
      // 216: athrow
      // 217: dcmpl
      // 218: ifle 22e
      // 21b: goto 222
      // 21e: invokestatic opd.a (Loov;)Loov;
      // 221: athrow
      // 222: dload 10
      // 224: dload 28
      // 226: dadd
      // 227: dstore 10
      // 229: iload 5
      // 22b: ifeq 23f
      // 22e: dload 10
      // 230: dload 26
      // 232: invokestatic java/lang/Math.abs (D)D
      // 235: goto 23c
      // 238: invokestatic opd.a (Loov;)Loov;
      // 23b: athrow
      // 23c: dadd
      // 23d: dstore 10
      // 23f: dload 26
      // 241: dconst_0
      // 242: dcmpl
      // 243: iload 5
      // 245: ifne 26d
      // 248: ifle 28d
      // 24b: goto 252
      // 24e: invokestatic opd.a (Loov;)Loov;
      // 251: athrow
      // 252: dload 26
      // 254: invokestatic java/lang/Math.abs (D)D
      // 257: dload 28
      // 259: iload 5
      // 25b: ifne 28a
      // 25e: goto 265
      // 261: invokestatic opd.a (Loov;)Loov;
      // 264: athrow
      // 265: dcmpl
      // 266: goto 26d
      // 269: invokestatic opd.a (Loov;)Loov;
      // 26c: athrow
      // 26d: ifle 27c
      // 270: dload 10
      // 272: dload 28
      // 274: dsub
      // 275: dstore 10
      // 277: iload 5
      // 279: ifeq 28d
      // 27c: dload 10
      // 27e: dload 26
      // 280: invokestatic java/lang/Math.abs (D)D
      // 283: goto 28a
      // 286: invokestatic opd.a (Loov;)Loov;
      // 289: athrow
      // 28a: dsub
      // 28b: dstore 10
      // 28d: invokestatic Minecraft.vz1 ()Lc05;
      // 290: getfield Minecraft.vg8 Ll86;
      // 293: getfield EntityPlayerSP.lq7 Lp_k;
      // 296: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 299: dup
      // 29a: dload 6
      // 29c: dload 8
      // 29e: dload 10
      // 2a0: bipush 1
      // 2a1: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 2a4: invokevirtual p_k.sxi (Lmz2;)V
      // 2a7: iinc 20 1
      // 2aa: iload 5
      // 2ac: ifeq 048
      // 2af: return
   }

   public static float[] hq6(EntityLivingBase var0) {
      double var1 = var0.o2v - Minecraft.vz1().vg8.o2v;
      double var3 = var0.vbd - Minecraft.vz1().vg8.vbd;
      double var5 = var0.kfp + (double)var0.c5y() / 1.3 - (Minecraft.vz1().vg8.kfp + (double)Minecraft.vz1().vg8.c5y());
      double var7 = (double)fe6.dii(var1 * var1 + var3 * var3);
      float var9 = (float)(Math.atan2(var3, var1) * 180.0 / Math.PI) - 90.0F;
      float var10 = (float)(-(Math.atan2(var5, var7) * 180.0 / Math.PI));
      return new float[]{var9, var10};
   }

   public static Entity jvt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 1.7976931348623157E308
      // 03: dstore 1
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aconst_null
      // 08: astore 3
      // 09: istore 0
      // 0a: getstatic opd.ot0 Lc05;
      // 0d: getfield Minecraft.tij Lkh3;
      // 10: getfield WorldClient.guf Ljava/util/List;
      // 13: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 18: astore 4
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq 94
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: astore 5
      // 2d: aload 5
      // 2f: iload 0
      // 30: ifeq 49
      // 33: instanceof Entity
      // 36: ifeq 90
      // 39: goto 40
      // 3c: invokestatic opd.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 5
      // 42: goto 49
      // 45: invokestatic opd.a (Loov;)Loov;
      // 48: athrow
      // 49: checkcast Entity
      // 4c: astore 6
      // 4e: aload 6
      // 50: getstatic opd.ot0 Lc05;
      // 53: getfield Minecraft.vg8 Ll86;
      // 56: invokevirtual Entity.tm6 (Li2h;)F
      // 59: f2d
      // 5a: dload 1
      // 5b: dcmpl
      // 5c: iload 0
      // 5d: ifeq 7a
      // 60: ifge 1a
      // 63: goto 6a
      // 66: invokestatic opd.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 6
      // 6c: iload 0
      // 6d: ifeq 85
      // 70: invokestatic opd.ptt (Lg_3;)Z
      // 73: goto 7a
      // 76: invokestatic opd.a (Loov;)Loov;
      // 79: athrow
      // 7a: ifne 80
      // 7d: goto 1a
      // 80: aload 6
      // 82: astore 3
      // 83: aload 6
      // 85: getstatic opd.ot0 Lc05;
      // 88: getfield Minecraft.vg8 Ll86;
      // 8b: invokevirtual Entity.tm6 (Li2h;)F
      // 8e: f2d
      // 8f: dstore 1
      // 90: iload 0
      // 91: ifne 1a
      // 94: aload 3
      // 95: areturn
   }

   public static final float fwe(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: fload 1
      // 05: fload 0
      // 06: fsub
      // 07: fstore 4
      // 09: fload 4
      // 0b: fload 2
      // 0c: fcmpl
      // 0d: iload 3
      // 0e: ifne 39
      // 11: ifle 22
      // 14: goto 1b
      // 17: invokestatic opd.a (Loov;)Loov;
      // 1a: athrow
      // 1b: fload 2
      // 1c: fstore 4
      // 1e: iload 3
      // 1f: ifeq 40
      // 22: fload 4
      // 24: fload 2
      // 25: fneg
      // 26: iload 3
      // 27: ifne 43
      // 2a: goto 31
      // 2d: invokestatic opd.a (Loov;)Loov;
      // 30: athrow
      // 31: fcmpg
      // 32: goto 39
      // 35: invokestatic opd.a (Loov;)Loov;
      // 38: athrow
      // 39: ifge 40
      // 3c: fload 2
      // 3d: fneg
      // 3e: fstore 4
      // 40: fload 0
      // 41: fload 4
      // 43: fadd
      // 44: freturn
   }

   public static boolean ptt(Entity param0) {
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
      // 05: iload 1
      // 06: ifeq 14
      // 09: ifnull bc
      // 0c: goto 13
      // 0f: invokestatic opd.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getstatic opd.ot0 Lc05;
      // 17: getfield Minecraft.vg8 Ll86;
      // 1a: iload 1
      // 1b: ifeq 36
      // 1e: if_acmpeq bc
      // 21: goto 28
      // 24: invokestatic opd.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getstatic opd.ot0 Lc05;
      // 2c: getfield Minecraft.vg8 Ll86;
      // 2f: goto 36
      // 32: invokestatic opd.a (Loov;)Loov;
      // 35: athrow
      // 36: invokevirtual Entity.tm6 (Li2h;)F
      // 39: ldc 10000.0
      // 3b: nop
      // 3c: fcmpg
      // 3d: iload 1
      // 3e: ifeq 56
      // 41: ifgt bc
      // 44: goto 4b
      // 47: invokestatic opd.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual Entity.gzr ()Z
      // 4f: goto 56
      // 52: invokestatic opd.a (Loov;)Loov;
      // 55: athrow
      // 56: iload 1
      // 57: ifeq 6f
      // 5a: ifeq bc
      // 5d: goto 64
      // 60: invokestatic opd.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: invokevirtual Entity.h5u ()Z
      // 68: goto 6f
      // 6b: invokestatic opd.a (Loov;)Loov;
      // 6e: athrow
      // 6f: iload 1
      // 70: ifeq aa
      // 73: ifeq 96
      // 76: goto 7d
      // 79: invokestatic opd.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: invokevirtual Entity.y5z ()I
      // 81: iload 1
      // 82: ifeq aa
      // 85: goto 8c
      // 88: invokestatic opd.a (Loov;)Loov;
      // 8b: athrow
      // 8c: ifeq bc
      // 8f: goto 96
      // 92: invokestatic opd.a (Loov;)Loov;
      // 95: athrow
      // 96: getstatic ClientState.qkk Lzwr;
      // 99: invokevirtual ClientState.w34 ()Lf62;
      // 9c: aload 0
      // 9d: invokevirtual Entity.noc ()Ljava/lang/String;
      // a0: invokevirtual f62.jzk (Ljava/lang/String;)Z
      // a3: goto aa
      // a6: invokestatic opd.a (Loov;)Loov;
      // a9: athrow
      // aa: iload 1
      // ab: ifeq b9
      // ae: ifne bc
      // b1: goto b8
      // b4: invokestatic opd.a (Loov;)Loov;
      // b7: athrow
      // b8: bipush 1
      // b9: goto bd
      // bc: bipush 0
      // bd: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
