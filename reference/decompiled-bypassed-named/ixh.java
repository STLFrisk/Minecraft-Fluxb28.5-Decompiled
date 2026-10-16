import java.util.Random;

public class ixh {
   private static final Minecraft nft = Minecraft.vz1();
   public static Random fbp = new Random();
   public static double td5 = fbp.nextDouble();
   public static double kjv = fbp.nextDouble();
   public static double g67 = fbp.nextDouble();
   public static float[] ujo = new float[2];

   public static boolean tux(EntityLivingBase var0, double var1) {
      try {
         if (nyj.vsf(var1, ixh::aec) != null) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public static i6q bst(nh4 param0, boolean param1, boolean param2, boolean param3, boolean param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 6
      // 005: iload 1
      // 006: ifeq 06a
      // 009: new fqr
      // 00c: dup
      // 00d: aload 0
      // 00e: getfield nh4.rlc D
      // 011: aload 0
      // 012: getfield nh4.t_2 D
      // 015: aload 0
      // 016: getfield nh4.rlc D
      // 019: dsub
      // 01a: getstatic ixh.td5 D
      // 01d: ldc2_w 0.3
      // 020: dmul
      // 021: dconst_1
      // 022: dadd
      // 023: dmul
      // 024: dadd
      // 025: aload 0
      // 026: getfield nh4.bx_ D
      // 029: aload 0
      // 02a: getfield nh4.i2c D
      // 02d: aload 0
      // 02e: getfield nh4.bx_ D
      // 031: dsub
      // 032: getstatic ixh.kjv D
      // 035: ldc2_w 0.3
      // 038: dmul
      // 039: dconst_1
      // 03a: dadd
      // 03b: dmul
      // 03c: dadd
      // 03d: aload 0
      // 03e: getfield nh4.t8n D
      // 041: aload 0
      // 042: getfield nh4.oqj D
      // 045: aload 0
      // 046: getfield nh4.t8n D
      // 049: dsub
      // 04a: getstatic ixh.g67 D
      // 04d: ldc2_w 0.3
      // 050: dmul
      // 051: dconst_1
      // 052: dadd
      // 053: dmul
      // 054: dadd
      // 055: invokespecial fqr.<init> (DDD)V
      // 058: astore 7
      // 05a: new i6q
      // 05d: dup
      // 05e: aload 7
      // 060: aload 7
      // 062: iload 3
      // 063: invokestatic ixh.j5q (Lfqr;Z)Leij;
      // 066: invokespecial i6q.<init> (Lfqr;Leij;)V
      // 069: areturn
      // 06a: new fqr
      // 06d: dup
      // 06e: aload 0
      // 06f: getfield nh4.rlc D
      // 072: aload 0
      // 073: getfield nh4.t_2 D
      // 076: aload 0
      // 077: getfield nh4.rlc D
      // 07a: dsub
      // 07b: getstatic ixh.td5 D
      // 07e: dmul
      // 07f: ldc2_w 0.8
      // 082: dmul
      // 083: dadd
      // 084: aload 0
      // 085: getfield nh4.bx_ D
      // 088: aload 0
      // 089: getfield nh4.i2c D
      // 08c: aload 0
      // 08d: getfield nh4.bx_ D
      // 090: dsub
      // 091: getstatic ixh.kjv D
      // 094: dmul
      // 095: ldc2_w 0.8
      // 098: dmul
      // 099: dadd
      // 09a: aload 0
      // 09b: getfield nh4.t8n D
      // 09e: aload 0
      // 09f: getfield nh4.oqj D
      // 0a2: aload 0
      // 0a3: getfield nh4.t8n D
      // 0a6: dsub
      // 0a7: getstatic ixh.g67 D
      // 0aa: dmul
      // 0ab: ldc2_w 0.8
      // 0ae: dmul
      // 0af: dadd
      // 0b0: invokespecial fqr.<init> (DDD)V
      // 0b3: astore 7
      // 0b5: aload 7
      // 0b7: iload 3
      // 0b8: invokestatic ixh.j5q (Lfqr;Z)Leij;
      // 0bb: astore 8
      // 0bd: getstatic ixh.nft Lc05;
      // 0c0: getfield Minecraft.vg8 Ll86;
      // 0c3: fconst_1
      // 0c4: invokevirtual EntityPlayerSP.tib (F)Lfqr;
      // 0c7: astore 9
      // 0c9: aconst_null
      // 0ca: astore 10
      // 0cc: ldc2_w 0.15
      // 0cf: dstore 11
      // 0d1: dload 11
      // 0d3: ldc2_w 0.85
      // 0d6: dcmpg
      // 0d7: ifge 235
      // 0da: ldc2_w 0.15
      // 0dd: dstore 13
      // 0df: dload 13
      // 0e1: dconst_1
      // 0e2: dcmpg
      // 0e3: ifge 228
      // 0e6: ldc2_w 0.15
      // 0e9: iload 6
      // 0eb: ifeq 22e
      // 0ee: dstore 15
      // 0f0: dload 15
      // 0f2: ldc2_w 0.85
      // 0f5: dcmpg
      // 0f6: ifge 21b
      // 0f9: new fqr
      // 0fc: dup
      // 0fd: aload 0
      // 0fe: getfield nh4.rlc D
      // 101: aload 0
      // 102: getfield nh4.t_2 D
      // 105: aload 0
      // 106: getfield nh4.rlc D
      // 109: dsub
      // 10a: dload 11
      // 10c: dmul
      // 10d: dadd
      // 10e: aload 0
      // 10f: getfield nh4.bx_ D
      // 112: aload 0
      // 113: getfield nh4.i2c D
      // 116: aload 0
      // 117: getfield nh4.bx_ D
      // 11a: dsub
      // 11b: dload 13
      // 11d: dmul
      // 11e: dadd
      // 11f: aload 0
      // 120: getfield nh4.t8n D
      // 123: aload 0
      // 124: getfield nh4.oqj D
      // 127: aload 0
      // 128: getfield nh4.t8n D
      // 12b: dsub
      // 12c: dload 15
      // 12e: dmul
      // 12f: dadd
      // 130: invokespecial fqr.<init> (DDD)V
      // 133: astore 17
      // 135: aload 17
      // 137: iload 3
      // 138: invokestatic ixh.j5q (Lfqr;Z)Leij;
      // 13b: astore 18
      // 13d: aload 9
      // 13f: aload 17
      // 141: invokevirtual fqr.b4d (Lfqr;)D
      // 144: dstore 19
      // 146: dload 19
      // 148: fload 5
      // 14a: f2d
      // 14b: dcmpl
      // 14c: iload 6
      // 14e: ifeq 0e3
      // 151: iload 6
      // 153: ifeq 165
      // 156: ifle 163
      // 159: goto 160
      // 15c: invokestatic ixh.a (Loov;)Loov;
      // 15f: athrow
      // 160: goto 20e
      // 163: iload 4
      // 165: iload 6
      // 167: ifeq 180
      // 16a: ifne 183
      // 16d: goto 174
      // 170: invokestatic ixh.a (Loov;)Loov;
      // 173: athrow
      // 174: aload 17
      // 176: invokestatic ixh.ceq (Lfqr;)Z
      // 179: goto 180
      // 17c: invokestatic ixh.a (Loov;)Loov;
      // 17f: athrow
      // 180: ifeq 20e
      // 183: new i6q
      // 186: dup
      // 187: aload 17
      // 189: aload 18
      // 18b: invokespecial i6q.<init> (Lfqr;Leij;)V
      // 18e: astore 21
      // 190: aload 10
      // 192: iload 6
      // 194: ifeq 20c
      // 197: ifnull 20a
      // 19a: goto 1a1
      // 19d: invokestatic ixh.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: iload 2
      // 1a2: iload 6
      // 1a4: ifeq 207
      // 1a7: goto 1ae
      // 1aa: invokestatic ixh.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: ifeq 1ea
      // 1b1: goto 1b8
      // 1b4: invokestatic ixh.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: aload 21
      // 1ba: invokevirtual i6q.q37 ()Leij;
      // 1bd: aload 8
      // 1bf: invokestatic ixh.jje (Leij;Leij;)D
      // 1c2: aload 10
      // 1c4: invokevirtual i6q.q37 ()Leij;
      // 1c7: aload 8
      // 1c9: invokestatic ixh.jje (Leij;Leij;)D
      // 1cc: iload 6
      // 1ce: ifeq 213
      // 1d1: goto 1d8
      // 1d4: invokestatic ixh.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: dcmpg
      // 1d9: ifge 20e
      // 1dc: goto 1e3
      // 1df: invokestatic ixh.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: goto 20a
      // 1e6: invokestatic ixh.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 21
      // 1ec: invokevirtual i6q.q37 ()Leij;
      // 1ef: invokestatic ixh.t68 (Leij;)D
      // 1f2: aload 10
      // 1f4: invokevirtual i6q.q37 ()Leij;
      // 1f7: invokestatic ixh.t68 (Leij;)D
      // 1fa: iload 6
      // 1fc: ifeq 213
      // 1ff: dcmpg
      // 200: goto 207
      // 203: invokestatic ixh.a (Loov;)Loov;
      // 206: athrow
      // 207: ifge 20e
      // 20a: aload 21
      // 20c: astore 10
      // 20e: dload 15
      // 210: ldc2_w 0.1
      // 213: dadd
      // 214: dstore 15
      // 216: iload 6
      // 218: ifne 0f0
      // 21b: dload 13
      // 21d: ldc2_w 0.1
      // 220: dadd
      // 221: dstore 13
      // 223: iload 6
      // 225: ifne 0df
      // 228: dload 11
      // 22a: ldc2_w 0.1
      // 22d: dadd
      // 22e: dstore 11
      // 230: iload 6
      // 232: ifne 0d1
      // 235: aload 10
      // 237: areturn
   }

   public static i6q u8u(mew param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: ifnonnull 00e
      // 008: aconst_null
      // 009: areturn
      // 00a: invokestatic ixh.a (Loov;)Loov;
      // 00d: athrow
      // 00e: aconst_null
      // 00f: astore 2
      // 010: ldc2_w 0.1
      // 013: dstore 3
      // 014: dload 3
      // 015: ldc2_w 0.9
      // 018: dcmpg
      // 019: ifge 1b1
      // 01c: ldc2_w 0.1
      // 01f: dstore 5
      // 021: dload 5
      // 023: ldc2_w 0.9
      // 026: dcmpg
      // 027: ifge 1a7
      // 02a: ldc2_w 0.1
      // 02d: iload 1
      // 02e: ifne 1ac
      // 031: dstore 7
      // 033: dload 7
      // 035: ldc2_w 0.9
      // 038: dcmpg
      // 039: ifge 19b
      // 03c: new fqr
      // 03f: dup
      // 040: getstatic ixh.nft Lc05;
      // 043: getfield Minecraft.vg8 Ll86;
      // 046: getfield EntityPlayerSP.o2v D
      // 049: getstatic ixh.nft Lc05;
      // 04c: getfield Minecraft.vg8 Ll86;
      // 04f: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 052: getfield nh4.bx_ D
      // 055: getstatic ixh.nft Lc05;
      // 058: getfield Minecraft.vg8 Ll86;
      // 05b: invokevirtual EntityPlayerSP.c5y ()F
      // 05e: f2d
      // 05f: dadd
      // 060: getstatic ixh.nft Lc05;
      // 063: getfield Minecraft.vg8 Ll86;
      // 066: getfield EntityPlayerSP.vbd D
      // 069: invokespecial fqr.<init> (DDD)V
      // 06c: astore 9
      // 06e: new fqr
      // 071: dup
      // 072: aload 0
      // 073: invokespecial fqr.<init> (Lwgo;)V
      // 076: dload 3
      // 077: dload 5
      // 079: dload 7
      // 07b: invokevirtual fqr.r2x (DDD)Lfqr;
      // 07e: astore 10
      // 080: aload 9
      // 082: aload 10
      // 084: invokevirtual fqr.b4d (Lfqr;)D
      // 087: dstore 11
      // 089: aload 10
      // 08b: getfield fqr.lvi D
      // 08e: aload 9
      // 090: getfield fqr.lvi D
      // 093: dsub
      // 094: dstore 13
      // 096: aload 10
      // 098: getfield fqr.gn5 D
      // 09b: aload 9
      // 09d: getfield fqr.gn5 D
      // 0a0: dsub
      // 0a1: dstore 15
      // 0a3: aload 10
      // 0a5: getfield fqr.bn2 D
      // 0a8: aload 9
      // 0aa: getfield fqr.bn2 D
      // 0ad: dsub
      // 0ae: dstore 17
      // 0b0: dload 13
      // 0b2: dload 13
      // 0b4: dmul
      // 0b5: dload 17
      // 0b7: dload 17
      // 0b9: dmul
      // 0ba: dadd
      // 0bb: invokestatic fe6.dii (D)F
      // 0be: f2d
      // 0bf: dstore 19
      // 0c1: new eij
      // 0c4: dup
      // 0c5: dload 17
      // 0c7: dload 13
      // 0c9: invokestatic java/lang/Math.atan2 (DD)D
      // 0cc: invokestatic java/lang/Math.toDegrees (D)D
      // 0cf: d2f
      // 0d0: ldc 90.0
      // 0d2: nop
      // 0d3: fsub
      // 0d4: invokestatic fe6.qsy (F)F
      // 0d7: dload 15
      // 0d9: dload 19
      // 0db: invokestatic java/lang/Math.atan2 (DD)D
      // 0de: invokestatic java/lang/Math.toDegrees (D)D
      // 0e1: dneg
      // 0e2: d2f
      // 0e3: invokestatic fe6.qsy (F)F
      // 0e6: invokespecial eij.<init> (FF)V
      // 0e9: astore 21
      // 0eb: aload 21
      // 0ed: invokestatic ixh.bjo (Leij;)Lfqr;
      // 0f0: astore 22
      // 0f2: aload 9
      // 0f4: aload 22
      // 0f6: getfield fqr.lvi D
      // 0f9: dload 11
      // 0fb: dmul
      // 0fc: aload 22
      // 0fe: getfield fqr.gn5 D
      // 101: dload 11
      // 103: dmul
      // 104: aload 22
      // 106: getfield fqr.bn2 D
      // 109: dload 11
      // 10b: dmul
      // 10c: invokevirtual fqr.r2x (DDD)Lfqr;
      // 10f: astore 23
      // 111: getstatic ixh.nft Lc05;
      // 114: getfield Minecraft.tij Lkh3;
      // 117: aload 9
      // 119: aload 23
      // 11b: bipush 0
      // 11c: bipush 0
      // 11d: bipush 1
      // 11e: invokevirtual WorldClient.xjc (Lfqr;Lfqr;ZZZ)Lakm;
      // 121: astore 24
      // 123: iload 1
      // 124: ifne 1a3
      // 127: iload 1
      // 128: ifne 197
      // 12b: goto 132
      // 12e: invokestatic ixh.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 24
      // 134: getfield akm.oyz Lakm$qs6;
      // 137: getstatic akm$qs6.i4l Lakm$qs6;
      // 13a: if_acmpne 18f
      // 13d: goto 144
      // 140: invokestatic ixh.a (Loov;)Loov;
      // 143: athrow
      // 144: new i6q
      // 147: dup
      // 148: aload 10
      // 14a: aload 21
      // 14c: invokespecial i6q.<init> (Lfqr;Leij;)V
      // 14f: astore 25
      // 151: aload 2
      // 152: iload 1
      // 153: ifne 18e
      // 156: ifnull 185
      // 159: goto 160
      // 15c: invokestatic ixh.a (Loov;)Loov;
      // 15f: athrow
      // 160: aload 25
      // 162: invokevirtual i6q.q37 ()Leij;
      // 165: invokestatic ixh.t68 (Leij;)D
      // 168: aload 2
      // 169: invokevirtual i6q.q37 ()Leij;
      // 16c: invokestatic ixh.t68 (Leij;)D
      // 16f: iload 1
      // 170: ifne 194
      // 173: goto 17a
      // 176: invokestatic ixh.a (Loov;)Loov;
      // 179: athrow
      // 17a: dcmpg
      // 17b: ifge 18f
      // 17e: goto 185
      // 181: invokestatic ixh.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 25
      // 187: goto 18e
      // 18a: invokestatic ixh.a (Loov;)Loov;
      // 18d: athrow
      // 18e: astore 2
      // 18f: dload 7
      // 191: ldc2_w 0.1
      // 194: dadd
      // 195: dstore 7
      // 197: iload 1
      // 198: ifeq 033
      // 19b: dload 5
      // 19d: ldc2_w 0.1
      // 1a0: dadd
      // 1a1: dstore 5
      // 1a3: iload 1
      // 1a4: ifeq 021
      // 1a7: dload 3
      // 1a8: ldc2_w 0.1
      // 1ab: dadd
      // 1ac: dstore 3
      // 1ad: iload 1
      // 1ae: ifeq 014
      // 1b1: aload 2
      // 1b2: areturn
   }

   public static fqr bjo(eij var0) {
      float var1 = fe6.ssk(-var0.r8p() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var2 = fe6.rtn(-var0.r8p() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = -fe6.ssk(-var0.jqw() * (float) (Math.PI / 180.0));
      float var4 = fe6.rtn(-var0.jqw() * (float) (Math.PI / 180.0));
      return new fqr((double)(var2 * var3), (double)var4, (double)(var1 * var3));
   }

   public static double jje(eij var0, eij var1) {
      return Math.hypot((double)cvo(var0.r8p(), var1.r8p()), (double)(var0.jqw() - var1.jqw()));
   }

   private static float cvo(float var0, float var1) {
      return ((var0 - var1) % 360.0F + 540.0F) % 360.0F - 180.0F;
   }

   public static double t68(eij var0) {
      try {
         if (ujo == null) {
            return 0.0;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return jje(var0, new eij(ujo[0], ujo[1]));
   }

   public static boolean ceq(fqr var0) {
      fqr var1 = new fqr(nft.vg8.o2v, nft.vg8.aaw().bx_ + (double)nft.vg8.c5y(), nft.vg8.vbd);

      try {
         if (nft.tij.caq(var1, var0) == null) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public static fqr q2d(nh4 var0) {
      return new fqr(var0.rlc + (var0.t_2 - var0.rlc) * 0.5, var0.bx_ + (var0.i2c - var0.bx_) * 0.5, var0.t8n + (var0.oqj - var0.t8n) * 0.5);
   }

   public static double lyc(EntityLivingBase var0) {
      eij var1 = j5q(q2d(var0.aaw()), true);
      return jje(var1, new eij(nft.vg8.x5k, nft.vg8.y2i));
   }

   public static eij snq(eij var0, eij var1, float var2) {
      float var3 = cvo(var1.r8p(), var0.r8p());
      float var4 = cvo(var1.jqw(), var0.jqw());

      eij var10000;
      eij var10001;
      float var10002;
      float var10003;
      label22: {
         try {
            var10000 = new eij;
            var10001 = var10000;
            var10002 = var0.r8p();
            if (var3 > var2) {
               var10003 = var2;
               break label22;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10003 = Math.max(var3, -var2);
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var10002 + var10003, var0.jqw() + (var4 > var2 ? var2 : Math.max(var4, -var2)));
      return var10000;
   }

   public static eij j5q(fqr var0, boolean var1) {
      fqr var2 = new fqr(nft.vg8.o2v, nft.vg8.aaw().bx_ + (double)nft.vg8.c5y(), nft.vg8.vbd);

      try {
         if (var1) {
            var2.r2x(nft.vg8.icv, nft.vg8.mop, nft.vg8.bw4);
         }
      } catch (oov var9) {
         throw a(var9);
      }

      double var3 = var0.lvi - var2.lvi;
      double var5 = var0.gn5 - var2.gn5;
      double var7 = var0.bn2 - var2.bn2;
      return new eij(
         fe6.qsy((float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F),
         fe6.qsy((float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7)))))
      );
   }

   public static boolean te4(Entity param0, float[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokestatic ixh.yup (Lg_3;)[F
      // 004: bipush 0
      // 005: faload
      // 006: fstore 3
      // 007: invokestatic OpaquePredicate.c ()I
      // 00a: aload 0
      // 00b: invokestatic ixh.yup (Lg_3;)[F
      // 00e: bipush 1
      // 00f: faload
      // 010: fstore 4
      // 012: aload 1
      // 013: bipush 0
      // 014: faload
      // 015: fstore 5
      // 017: istore 2
      // 018: aload 1
      // 019: bipush 1
      // 01a: faload
      // 01b: fstore 6
      // 01d: ldc 20.0
      // 01f: nop
      // 020: aload 0
      // 021: invokevirtual Entity.npl ()F
      // 024: fadd
      // 025: fstore 7
      // 027: fload 5
      // 029: fconst_0
      // 02a: fcmpg
      // 02b: ifge 045
      // 02e: fload 5
      // 030: ldc 360.0
      // 032: nop
      // 033: fadd
      // 034: fstore 5
      // 036: iload 2
      // 037: ifne 060
      // 03a: iload 2
      // 03b: ifeq 027
      // 03e: goto 045
      // 041: invokestatic ixh.a (Loov;)Loov;
      // 044: athrow
      // 045: fload 3
      // 046: fconst_0
      // 047: fcmpg
      // 048: ifge 060
      // 04b: fload 3
      // 04c: ldc 360.0
      // 04e: nop
      // 04f: fadd
      // 050: fstore 3
      // 051: iload 2
      // 052: ifne 080
      // 055: iload 2
      // 056: ifeq 045
      // 059: goto 060
      // 05c: invokestatic ixh.a (Loov;)Loov;
      // 05f: athrow
      // 060: fload 5
      // 062: ldc 360.0
      // 064: nop
      // 065: fcmpl
      // 066: ifle 080
      // 069: fload 5
      // 06b: ldc 360.0
      // 06d: nop
      // 06e: fsub
      // 06f: fstore 5
      // 071: iload 2
      // 072: ifne 09d
      // 075: iload 2
      // 076: ifeq 060
      // 079: goto 080
      // 07c: invokestatic ixh.a (Loov;)Loov;
      // 07f: athrow
      // 080: fload 3
      // 081: ldc 360.0
      // 083: nop
      // 084: fcmpl
      // 085: ifle 09d
      // 088: fload 3
      // 089: ldc 360.0
      // 08b: nop
      // 08c: fsub
      // 08d: fstore 3
      // 08e: iload 2
      // 08f: ifne 10e
      // 092: iload 2
      // 093: ifeq 080
      // 096: goto 09d
      // 099: invokestatic ixh.a (Loov;)Loov;
      // 09c: athrow
      // 09d: fload 5
      // 09f: fload 3
      // 0a0: fload 7
      // 0a2: fsub
      // 0a3: fcmpl
      // 0a4: iload 2
      // 0a5: ifne 10f
      // 0a8: iflt 10e
      // 0ab: goto 0b2
      // 0ae: invokestatic ixh.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: fload 5
      // 0b4: fload 3
      // 0b5: fload 7
      // 0b7: fadd
      // 0b8: fcmpg
      // 0b9: iload 2
      // 0ba: ifne 10f
      // 0bd: goto 0c4
      // 0c0: invokestatic ixh.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: ifgt 10e
      // 0c7: goto 0ce
      // 0ca: invokestatic ixh.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: fload 6
      // 0d0: fload 4
      // 0d2: fload 7
      // 0d4: fsub
      // 0d5: fcmpl
      // 0d6: iload 2
      // 0d7: ifne 0fa
      // 0da: goto 0e1
      // 0dd: invokestatic ixh.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iflt 10c
      // 0e4: goto 0eb
      // 0e7: invokestatic ixh.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: fload 6
      // 0ed: fload 4
      // 0ef: fload 7
      // 0f1: fadd
      // 0f2: fcmpg
      // 0f3: goto 0fa
      // 0f6: invokestatic ixh.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 2
      // 0fb: ifne 109
      // 0fe: ifgt 10c
      // 101: goto 108
      // 104: invokestatic ixh.a (Loov;)Loov;
      // 107: athrow
      // 108: bipush 1
      // 109: goto 10d
      // 10c: bipush 0
      // 10d: ireturn
      // 10e: bipush 0
      // 10f: ireturn
   }

   public static float uml(Entity var0) {
      float var2 = yup(var0)[0];
      int var10000 = OpaquePredicate.b();
      float var3 = yup(var0)[1];
      int var1 = var10000;
      float var4 = nft.vg8.x5k;
      float var5 = nft.vg8.y2i;

      label67: {
         label66: {
            try {
               float var14;
               var10000 = (var14 = var4 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
               if (var1 == 0) {
                  break label67;
               }

               if (var10000 >= 0) {
                  break label66;
               }
            } catch (oov var11) {
               throw a(var11);
            }

            var4 += 360.0F;
         }

         float var15;
         var10000 = (var15 = var5 - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      }

      label58: {
         label57: {
            try {
               if (var1 == 0) {
                  break label58;
               }

               if (var10000 >= 0) {
                  break label57;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var5 += 360.0F;
         }

         float var16;
         var10000 = (var16 = var2 - 0.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      }

      float var10001;
      label71: {
         label48: {
            label47: {
               try {
                  if (var1 == 0) {
                     break label48;
                  }

                  if (var10000 >= 0) {
                     break label47;
                  }
               } catch (oov var9) {
                  throw a(var9);
               }

               var2 += 360.0F;
            }

            try {
               var13 = var3;
               var10001 = 0.0F;
               if (var1 == 0) {
                  break label71;
               }

               float var17;
               var10000 = (var17 = var3 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            } catch (oov var8) {
               throw a(var8);
            }
         }

         if (var10000 < 0) {
            var3 += 360.0F;
         }

         var13 = Math.max(var4, var2);
         var10001 = Math.min(var4, var2);
      }

      float var6 = var13 - var10001;
      float var7 = Math.max(var5, var3) - Math.min(var5, var3);
      return var6 + var7;
   }

   public static float[] yup(Entity var0) {
      double var1 = var0.o2v - nft.vg8.o2v;
      double var3 = var0.vbd - nft.vg8.vbd;
      double var5 = var0.kfp + (double)var0.c5y() * 0.925 - (nft.vg8.aaw().bx_ + (double)nft.vg8.c5y());
      double var7 = (double)fe6.dii(var1 * var1 + var3 * var3);
      float var9 = (float)(fe6.yr8(var3, var1) * 180.0 / Math.PI) - 90.0F;
      float var10 = (float)(-(fe6.yr8(var5, var7) * 180.0 / Math.PI));
      return new float[]{var9, var10};
   }

   public static float[] y_c(mew var0, float var1) {
      double var2 = (double)var0.getX() + 0.5 - nft.vg8.o2v;
      double var4 = (double)var0.getZ() + 0.5 - nft.vg8.vbd;
      double var6 = (double)var0.getY() + 0.5 - (nft.vg8.aaw().bx_ + (double)nft.vg8.c5y());
      double var8 = (double)fe6.dii(var2 * var2 + var4 * var4);
      float var10 = (float)(fe6.yr8(var4, var2) * 180.0 / Math.PI) - var1;
      float var11 = (float)(-(fe6.yr8(var6, var8) * 180.0 / Math.PI));
      return new float[]{var10, var11};
   }

   public static float[] xcf(Entity var0, float var1, float[] var2) {
      float var10000;
      float var10001;
      float var10002;
      label30: {
         try {
            var10000 = var2[0];
            var10001 = yup(var0)[0];
            if (q0r.f2f()) {
               var10002 = h00(5.0F, -5.0F);
               break label30;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var10002 = 0.0F;
      }

      float var3 = app(var10000, var10001 + var10002, var1);

      label22: {
         try {
            var10000 = var2[1];
            var10001 = yup(var0)[1];
            if (q0r.f2f()) {
               var10002 = h00(5.0F, -5.0F);
               break label22;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10002 = 0.0F;
      }

      float var4 = app(var10000, var10001 + var10002, var1);
      return new float[]{var3, var4};
   }

   public static float[] xoe(mew var0, float var1, float[] var2, float var3) {
      float var4 = app(var2[0], y_c(var0, var3)[0], var1);
      float var5 = app(var2[1], y_c(var0, var3)[1], var1);
      return new float[]{var4, var5};
   }

   public static float h00(float var0, float var1) {
      return (float)Math.random() * (var0 - var1) + var1;
   }

   public static float[] gt1(double var0, double var2, double var4) {
      double var6 = var0 - Minecraft.vz1().vg8.o2v;
      double var8 = var2 - Minecraft.vz1().vg8.vbd;
      double var10 = var4 - Minecraft.vz1().vg8.kfp;
      double var12 = (double)fe6.dii(var6 * var6 + var8 * var8);
      float var14 = (float)(Math.atan2(var8, var6) * 180.0 / Math.PI) - 90.0F;
      float var15 = (float)(-(Math.atan2(var10, var12) * 180.0 / Math.PI));
      return new float[]{var14, var15};
   }

   private static float app(float var0, float var1, float var2) {
      int var3 = OpaquePredicate.c();
      float var4 = fe6.qsy(var1 - var0);

      int var10000;
      label34: {
         label33: {
            try {
               float var8;
               var10000 = (var8 = var4 - var2) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
               if (var3 != 0) {
                  break label34;
               }

               if (var10000 <= 0) {
                  break label33;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var4 = var2;
         }

         try {
            float var10001 = -var2;
            if (var3 != 0) {
               return var4 + var10001;
            }

            float var9;
            var10000 = (var9 = var4 - var10001) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
         } catch (oov var5) {
            throw a(var5);
         }
      }

      if (var10000 < 0) {
         var4 = -var2;
      }

      return var0 + var4;
   }

   private static boolean aec(EntityLivingBase var0, EntityLivingBase var1) {
      try {
         if (var1 == var0) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
