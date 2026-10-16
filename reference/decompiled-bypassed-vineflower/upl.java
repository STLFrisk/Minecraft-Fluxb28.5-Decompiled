public class upl {
   public final float zwq;
   public final float oul;
   public final float ygu;
   public final float bo7;
   public final float k74;
   public final float ji9;
   public String zb9;

   public upl(tf8 var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var1.hsi);
   }

   public upl(tf8 param1, int[][] param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: invokestatic t9d.c ()I
      // 007: aload 0
      // 008: fload 3
      // 009: putfield upl.zwq F
      // 00c: istore 11
      // 00e: aload 0
      // 00f: fload 4
      // 011: putfield upl.oul F
      // 014: aload 0
      // 015: fload 5
      // 017: putfield upl.ygu F
      // 01a: aload 0
      // 01b: fload 3
      // 01c: fload 6
      // 01e: fadd
      // 01f: putfield upl.bo7 F
      // 022: aload 0
      // 023: fload 4
      // 025: fload 7
      // 027: fadd
      // 028: putfield upl.k74 F
      // 02b: aload 0
      // 02c: fload 5
      // 02e: fload 8
      // 030: fadd
      // 031: putfield upl.ji9 F
      // 034: aload 0
      // 035: bipush 8
      // 037: anewarray 47
      // 03a: putfield upl.p91 [Ljt3;
      // 03d: aload 0
      // 03e: bipush 6
      // 040: anewarray 51
      // 043: putfield upl.les [Lckj;
      // 046: fload 3
      // 047: fload 6
      // 049: fadd
      // 04a: fstore 12
      // 04c: fload 4
      // 04e: fload 7
      // 050: fadd
      // 051: fstore 13
      // 053: fload 5
      // 055: fload 8
      // 057: fadd
      // 058: fstore 14
      // 05a: fload 3
      // 05b: fload 9
      // 05d: fsub
      // 05e: fstore 3
      // 05f: fload 4
      // 061: fload 9
      // 063: fsub
      // 064: fstore 4
      // 066: fload 5
      // 068: fload 9
      // 06a: fsub
      // 06b: fstore 5
      // 06d: fload 12
      // 06f: fload 9
      // 071: fadd
      // 072: fstore 12
      // 074: fload 13
      // 076: fload 9
      // 078: fadd
      // 079: fstore 13
      // 07b: fload 14
      // 07d: fload 9
      // 07f: fadd
      // 080: iload 11
      // 082: ifne 095
      // 085: fstore 14
      // 087: iload 10
      // 089: ifeq 09d
      // 08c: fload 12
      // 08e: goto 095
      // 091: invokestatic upl.a (Loov;)Loov;
      // 094: athrow
      // 095: fstore 15
      // 097: fload 3
      // 098: fstore 12
      // 09a: fload 15
      // 09c: fstore 3
      // 09d: new jt3
      // 0a0: dup
      // 0a1: fload 3
      // 0a2: fload 4
      // 0a4: fload 5
      // 0a6: fconst_0
      // 0a7: fconst_0
      // 0a8: invokespecial jt3.<init> (FFFFF)V
      // 0ab: astore 15
      // 0ad: new jt3
      // 0b0: dup
      // 0b1: fload 12
      // 0b3: fload 4
      // 0b5: fload 5
      // 0b7: fconst_0
      // 0b8: ldc 8.0
      // 0ba: nop
      // 0bb: invokespecial jt3.<init> (FFFFF)V
      // 0be: astore 16
      // 0c0: new jt3
      // 0c3: dup
      // 0c4: fload 12
      // 0c6: fload 13
      // 0c8: fload 5
      // 0ca: ldc 8.0
      // 0cc: nop
      // 0cd: ldc 8.0
      // 0cf: nop
      // 0d0: invokespecial jt3.<init> (FFFFF)V
      // 0d3: astore 17
      // 0d5: new jt3
      // 0d8: dup
      // 0d9: fload 3
      // 0da: fload 13
      // 0dc: fload 5
      // 0de: ldc 8.0
      // 0e0: nop
      // 0e1: fconst_0
      // 0e2: invokespecial jt3.<init> (FFFFF)V
      // 0e5: astore 18
      // 0e7: new jt3
      // 0ea: dup
      // 0eb: fload 3
      // 0ec: fload 4
      // 0ee: fload 14
      // 0f0: fconst_0
      // 0f1: fconst_0
      // 0f2: invokespecial jt3.<init> (FFFFF)V
      // 0f5: astore 19
      // 0f7: new jt3
      // 0fa: dup
      // 0fb: fload 12
      // 0fd: fload 4
      // 0ff: fload 14
      // 101: fconst_0
      // 102: ldc 8.0
      // 104: nop
      // 105: invokespecial jt3.<init> (FFFFF)V
      // 108: astore 20
      // 10a: new jt3
      // 10d: dup
      // 10e: fload 12
      // 110: fload 13
      // 112: fload 14
      // 114: ldc 8.0
      // 116: nop
      // 117: ldc 8.0
      // 119: nop
      // 11a: invokespecial jt3.<init> (FFFFF)V
      // 11d: astore 21
      // 11f: new jt3
      // 122: dup
      // 123: fload 3
      // 124: fload 13
      // 126: fload 14
      // 128: ldc 8.0
      // 12a: nop
      // 12b: fconst_0
      // 12c: invokespecial jt3.<init> (FFFFF)V
      // 12f: astore 22
      // 131: aload 0
      // 132: getfield upl.p91 [Ljt3;
      // 135: bipush 0
      // 136: aload 15
      // 138: aastore
      // 139: aload 0
      // 13a: getfield upl.p91 [Ljt3;
      // 13d: bipush 1
      // 13e: aload 16
      // 140: aastore
      // 141: aload 0
      // 142: getfield upl.p91 [Ljt3;
      // 145: bipush 2
      // 146: aload 17
      // 148: aastore
      // 149: aload 0
      // 14a: getfield upl.p91 [Ljt3;
      // 14d: bipush 3
      // 14e: aload 18
      // 150: aastore
      // 151: aload 0
      // 152: getfield upl.p91 [Ljt3;
      // 155: bipush 4
      // 156: aload 19
      // 158: aastore
      // 159: aload 0
      // 15a: getfield upl.p91 [Ljt3;
      // 15d: bipush 5
      // 15e: aload 20
      // 160: aastore
      // 161: aload 0
      // 162: getfield upl.p91 [Ljt3;
      // 165: bipush 6
      // 167: aload 21
      // 169: aastore
      // 16a: aload 0
      // 16b: getfield upl.p91 [Ljt3;
      // 16e: bipush 7
      // 170: aload 22
      // 172: aastore
      // 173: aload 0
      // 174: getfield upl.les [Lckj;
      // 177: bipush 0
      // 178: aload 0
      // 179: bipush 4
      // 17a: anewarray 47
      // 17d: dup
      // 17e: bipush 0
      // 17f: aload 20
      // 181: aastore
      // 182: dup
      // 183: bipush 1
      // 184: aload 16
      // 186: aastore
      // 187: dup
      // 188: bipush 2
      // 189: aload 17
      // 18b: aastore
      // 18c: dup
      // 18d: bipush 3
      // 18e: aload 21
      // 190: aastore
      // 191: aload 2
      // 192: bipush 4
      // 193: aaload
      // 194: bipush 0
      // 195: aload 1
      // 196: getfield tf8.mb6 F
      // 199: aload 1
      // 19a: getfield tf8.o_f F
      // 19d: invokespecial upl.z54 ([Ljt3;[IZFF)Lckj;
      // 1a0: aastore
      // 1a1: aload 0
      // 1a2: getfield upl.les [Lckj;
      // 1a5: bipush 1
      // 1a6: aload 0
      // 1a7: bipush 4
      // 1a8: anewarray 47
      // 1ab: dup
      // 1ac: bipush 0
      // 1ad: aload 15
      // 1af: aastore
      // 1b0: dup
      // 1b1: bipush 1
      // 1b2: aload 19
      // 1b4: aastore
      // 1b5: dup
      // 1b6: bipush 2
      // 1b7: aload 22
      // 1b9: aastore
      // 1ba: dup
      // 1bb: bipush 3
      // 1bc: aload 18
      // 1be: aastore
      // 1bf: aload 2
      // 1c0: bipush 5
      // 1c1: aaload
      // 1c2: bipush 0
      // 1c3: aload 1
      // 1c4: getfield tf8.mb6 F
      // 1c7: aload 1
      // 1c8: getfield tf8.o_f F
      // 1cb: invokespecial upl.z54 ([Ljt3;[IZFF)Lckj;
      // 1ce: aastore
      // 1cf: aload 0
      // 1d0: getfield upl.les [Lckj;
      // 1d3: bipush 2
      // 1d4: aload 0
      // 1d5: bipush 4
      // 1d6: anewarray 47
      // 1d9: dup
      // 1da: bipush 0
      // 1db: aload 20
      // 1dd: aastore
      // 1de: dup
      // 1df: bipush 1
      // 1e0: aload 19
      // 1e2: aastore
      // 1e3: dup
      // 1e4: bipush 2
      // 1e5: aload 15
      // 1e7: aastore
      // 1e8: dup
      // 1e9: bipush 3
      // 1ea: aload 16
      // 1ec: aastore
      // 1ed: aload 2
      // 1ee: bipush 1
      // 1ef: aaload
      // 1f0: bipush 1
      // 1f1: aload 1
      // 1f2: getfield tf8.mb6 F
      // 1f5: aload 1
      // 1f6: getfield tf8.o_f F
      // 1f9: invokespecial upl.z54 ([Ljt3;[IZFF)Lckj;
      // 1fc: aastore
      // 1fd: aload 0
      // 1fe: getfield upl.les [Lckj;
      // 201: bipush 3
      // 202: aload 0
      // 203: bipush 4
      // 204: anewarray 47
      // 207: dup
      // 208: bipush 0
      // 209: aload 17
      // 20b: aastore
      // 20c: dup
      // 20d: bipush 1
      // 20e: aload 18
      // 210: aastore
      // 211: dup
      // 212: bipush 2
      // 213: aload 22
      // 215: aastore
      // 216: dup
      // 217: bipush 3
      // 218: aload 21
      // 21a: aastore
      // 21b: aload 2
      // 21c: bipush 0
      // 21d: aaload
      // 21e: bipush 1
      // 21f: aload 1
      // 220: getfield tf8.mb6 F
      // 223: aload 1
      // 224: getfield tf8.o_f F
      // 227: invokespecial upl.z54 ([Ljt3;[IZFF)Lckj;
      // 22a: aastore
      // 22b: aload 0
      // 22c: getfield upl.les [Lckj;
      // 22f: bipush 4
      // 230: aload 0
      // 231: bipush 4
      // 232: anewarray 47
      // 235: dup
      // 236: bipush 0
      // 237: aload 16
      // 239: aastore
      // 23a: dup
      // 23b: bipush 1
      // 23c: aload 15
      // 23e: aastore
      // 23f: dup
      // 240: bipush 2
      // 241: aload 18
      // 243: aastore
      // 244: dup
      // 245: bipush 3
      // 246: aload 17
      // 248: aastore
      // 249: aload 2
      // 24a: bipush 2
      // 24b: aaload
      // 24c: bipush 0
      // 24d: aload 1
      // 24e: getfield tf8.mb6 F
      // 251: aload 1
      // 252: getfield tf8.o_f F
      // 255: invokespecial upl.z54 ([Ljt3;[IZFF)Lckj;
      // 258: aastore
      // 259: aload 0
      // 25a: getfield upl.les [Lckj;
      // 25d: iload 11
      // 25f: ifne 2a3
      // 262: bipush 5
      // 263: aload 0
      // 264: bipush 4
      // 265: anewarray 47
      // 268: dup
      // 269: bipush 0
      // 26a: aload 19
      // 26c: aastore
      // 26d: dup
      // 26e: bipush 1
      // 26f: aload 20
      // 271: aastore
      // 272: dup
      // 273: bipush 2
      // 274: aload 21
      // 276: aastore
      // 277: dup
      // 278: bipush 3
      // 279: aload 22
      // 27b: aastore
      // 27c: aload 2
      // 27d: bipush 3
      // 27e: aaload
      // 27f: bipush 0
      // 280: aload 1
      // 281: getfield tf8.mb6 F
      // 284: aload 1
      // 285: getfield tf8.o_f F
      // 288: invokespecial upl.z54 ([Ljt3;[IZFF)Lckj;
      // 28b: aastore
      // 28c: iload 10
      // 28e: ifeq 2c8
      // 291: goto 298
      // 294: invokestatic upl.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 0
      // 299: getfield upl.les [Lckj;
      // 29c: goto 2a3
      // 29f: invokestatic upl.a (Loov;)Loov;
      // 2a2: athrow
      // 2a3: astore 23
      // 2a5: aload 23
      // 2a7: arraylength
      // 2a8: istore 24
      // 2aa: bipush 0
      // 2ab: istore 25
      // 2ad: iload 25
      // 2af: iload 24
      // 2b1: if_icmpge 2c8
      // 2b4: aload 23
      // 2b6: iload 25
      // 2b8: aaload
      // 2b9: astore 26
      // 2bb: aload 26
      // 2bd: invokevirtual ckj.uq0 ()V
      // 2c0: iinc 25 1
      // 2c3: iload 11
      // 2c5: ifeq 2ad
      // 2c8: return
   }

   private ckj z54(jt3[] var1, int[] var2, boolean var3, float var4, float var5) {
      try {
         if (var2 == null) {
            return null;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      try {
         if (var3) {
            return new ckj(var1, var2[2], var2[3], var2[0], var2[1], var4, var5);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return new ckj(var1, var2[0], var2[1], var2[2], var2[3], var4, var5);
   }

   public upl(tf8 var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10, boolean var11) {
      this.zwq = var4;
      this.oul = var5;
      this.ygu = var6;
      this.bo7 = var4 + (float)var7;
      this.k74 = var5 + (float)var8;
      this.ji9 = var6 + (float)var9;
      this.p91 = new jt3[8];
      this.les = new ckj[6];
      float var12 = var4 + (float)var7;
      float var13 = var5 + (float)var8;
      float var14 = var6 + (float)var9;
      var4 -= var10;
      var5 -= var10;
      var6 -= var10;
      var12 += var10;
      var13 += var10;
      var14 += var10;
      if (var11) {
         float var15 = var12;
         var12 = var4;
         var4 = var15;
      }

      jt3 var31 = new jt3(var4, var5, var6, 0.0F, 0.0F);
      jt3 var16 = new jt3(var12, var5, var6, 0.0F, 8.0F);
      jt3 var17 = new jt3(var12, var13, var6, 8.0F, 8.0F);
      jt3 var18 = new jt3(var4, var13, var6, 8.0F, 0.0F);
      jt3 var19 = new jt3(var4, var5, var14, 0.0F, 0.0F);
      jt3 var20 = new jt3(var12, var5, var14, 0.0F, 8.0F);
      jt3 var21 = new jt3(var12, var13, var14, 8.0F, 8.0F);
      jt3 var22 = new jt3(var4, var13, var14, 8.0F, 0.0F);
      this.p91[0] = var31;
      this.p91[1] = var16;
      this.p91[2] = var17;
      this.p91[3] = var18;
      this.p91[4] = var19;
      this.p91[5] = var20;
      this.p91[6] = var21;
      this.p91[7] = var22;
      this.les[0] = new ckj(
         new jt3[]{var20, var16, var17, var21}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var9, var3 + var9 + var8, var1.mb6, var1.o_f
      );
      this.les[1] = new ckj(new jt3[]{var31, var19, var22, var18}, var2, var3 + var9, var2 + var9, var3 + var9 + var8, var1.mb6, var1.o_f);
      this.les[2] = new ckj(new jt3[]{var20, var19, var31, var16}, var2 + var9, var3, var2 + var9 + var7, var3 + var9, var1.mb6, var1.o_f);
      this.les[3] = new ckj(new jt3[]{var17, var18, var22, var21}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var7, var3, var1.mb6, var1.o_f);
      this.les[4] = new ckj(new jt3[]{var16, var31, var18, var17}, var2 + var9, var3 + var9, var2 + var9 + var7, var3 + var9 + var8, var1.mb6, var1.o_f);
      this.les[5] = new ckj(
         new jt3[]{var19, var20, var21, var22},
         var2 + var9 + var7 + var9,
         var3 + var9,
         var2 + var9 + var7 + var9 + var7,
         var3 + var9 + var8,
         var1.mb6,
         var1.o_f
      );
      if (var11) {
         int var23 = 0;

         try {
            while (var23 < this.les.length) {
               this.les[var23].uq0();
               var23++;
            }
         } catch (oov var24) {
            throw a(var24);
         }
      }
   }

   public void vsk(q3g param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: aload 0
      // 0a: getfield upl.les [Lckj;
      // 0d: arraylength
      // 0e: if_icmpge 3f
      // 11: aload 0
      // 12: getfield upl.les [Lckj;
      // 15: iload 4
      // 17: aaload
      // 18: astore 5
      // 1a: iload 3
      // 1b: ifeq 3b
      // 1e: aload 5
      // 20: ifnull 38
      // 23: goto 2a
      // 26: invokestatic upl.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 5
      // 2c: aload 1
      // 2d: fload 2
      // 2e: invokevirtual ckj.kq3 (Lq3g;F)V
      // 31: goto 38
      // 34: invokestatic upl.a (Loov;)Loov;
      // 37: athrow
      // 38: iinc 4 1
      // 3b: iload 3
      // 3c: ifne 07
      // 3f: return
   }

   public upl xqa(String var1) {
      this.zb9 = var1;
      return this;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
