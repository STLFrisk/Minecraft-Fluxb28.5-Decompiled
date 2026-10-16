public class db9 extends i2h {
   public db9(t9d var1) {
      super(var1);
      this.yxc(0.25F, 0.25F);
   }

   @Override
   public void tbj() {
   }

   @Override
   public boolean xvv(double var1) {
      int var3 = t9d.b();
      double var4 = this.aaw().liq() * 4.0;

      int var10000;
      label38: {
         label37: {
            try {
               var10000 = Double.isNaN(var4);
               if (var3 == 0) {
                  break label38;
               }

               if (var10000 == 0) {
                  break label37;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var4 = 4.0;
         }

         var4 *= 64.0;
         double var9;
         var10000 = (var9 = var1 - var4 * var4) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      try {
         if (var3 == 0) {
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

   public db9(t9d var1, double var2, double var4, double var6) {
      super(var1);
      this._9v = 0;
      this.yxc(0.25F, 0.25F);
      this.m6_(var2, var4, var6);
   }

   public void s00(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual mew.getX ()I
      // 04: i2d
      // 05: dstore 3
      // 06: invokestatic t9d.c ()I
      // 09: aload 1
      // 0a: invokevirtual mew.getY ()I
      // 0d: istore 5
      // 0f: istore 2
      // 10: aload 1
      // 11: invokevirtual mew.getZ ()I
      // 14: i2d
      // 15: dstore 6
      // 17: dload 3
      // 18: aload 0
      // 19: getfield db9.o2v D
      // 1c: dsub
      // 1d: dstore 8
      // 1f: dload 6
      // 21: aload 0
      // 22: getfield db9.vbd D
      // 25: dsub
      // 26: dstore 10
      // 28: dload 8
      // 2a: dload 8
      // 2c: dmul
      // 2d: dload 10
      // 2f: dload 10
      // 31: dmul
      // 32: dadd
      // 33: invokestatic fe6.dii (D)F
      // 36: fstore 12
      // 38: iload 2
      // 39: ifne 9c
      // 3c: fload 12
      // 3e: ldc 12.0
      // 40: nop
      // 41: fcmpl
      // 42: ifle 89
      // 45: goto 4c
      // 48: invokestatic db9.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 0
      // 4e: getfield db9.o2v D
      // 51: dload 8
      // 53: fload 12
      // 55: f2d
      // 56: ddiv
      // 57: ldc2_w 12.0
      // 5a: dmul
      // 5b: dadd
      // 5c: putfield db9.ik7 D
      // 5f: aload 0
      // 60: aload 0
      // 61: getfield db9.vbd D
      // 64: dload 10
      // 66: fload 12
      // 68: f2d
      // 69: ddiv
      // 6a: ldc2_w 12.0
      // 6d: dmul
      // 6e: dadd
      // 6f: putfield db9.dy6 D
      // 72: aload 0
      // 73: aload 0
      // 74: getfield db9.kfp D
      // 77: ldc2_w 8.0
      // 7a: dadd
      // 7b: putfield db9.e67 D
      // 7e: iload 2
      // 7f: ifeq a2
      // 82: goto 89
      // 85: invokestatic db9.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 0
      // 8a: dload 3
      // 8b: putfield db9.ik7 D
      // 8e: aload 0
      // 8f: iload 5
      // 91: i2d
      // 92: putfield db9.e67 D
      // 95: goto 9c
      // 98: invokestatic db9.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: dload 6
      // 9f: putfield db9.dy6 D
      // a2: aload 0
      // a3: bipush 0
      // a4: putfield db9._9v I
      // a7: aload 0
      // a8: aload 0
      // a9: getfield db9.z2d Ljava/util/Random;
      // ac: bipush 5
      // ad: invokevirtual java/util/Random.nextInt (I)I
      // b0: iload 2
      // b1: ifne bf
      // b4: ifle c2
      // b7: goto be
      // ba: invokestatic db9.a (Loov;)Loov;
      // bd: athrow
      // be: bipush 1
      // bf: goto c3
      // c2: bipush 0
      // c3: putfield db9._mn Z
      // c6: return
   }

   @Override
   public void lmm(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dload 1
      // 02: putfield db9.icv D
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: dload 3
      // 0a: putfield db9.mop D
      // 0d: istore 7
      // 0f: aload 0
      // 10: dload 5
      // 12: putfield db9.bw4 D
      // 15: aload 0
      // 16: getfield db9.j25 F
      // 19: fconst_0
      // 1a: fcmpl
      // 1b: iload 7
      // 1d: ifne 43
      // 20: ifne 8c
      // 23: goto 2a
      // 26: invokestatic db9.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield db9.p3h F
      // 2e: iload 7
      // 30: ifne 59
      // 33: goto 3a
      // 36: invokestatic db9.a (Loov;)Loov;
      // 39: athrow
      // 3a: fconst_0
      // 3b: fcmpl
      // 3c: goto 43
      // 3f: invokestatic db9.a (Loov;)Loov;
      // 42: athrow
      // 43: ifne 8c
      // 46: dload 1
      // 47: dload 1
      // 48: dmul
      // 49: dload 5
      // 4b: dload 5
      // 4d: dmul
      // 4e: dadd
      // 4f: invokestatic fe6.dii (D)F
      // 52: goto 59
      // 55: invokestatic db9.a (Loov;)Loov;
      // 58: athrow
      // 59: fstore 8
      // 5b: aload 0
      // 5c: aload 0
      // 5d: dload 1
      // 5e: dload 5
      // 60: invokestatic fe6.yr8 (DD)D
      // 63: ldc2_w 180.0
      // 66: dmul
      // 67: ldc2_w 3.141592653589793
      // 6a: ddiv
      // 6b: d2f
      // 6c: dup_x1
      // 6d: putfield db9.x5k F
      // 70: putfield db9.p3h F
      // 73: aload 0
      // 74: aload 0
      // 75: dload 3
      // 76: fload 8
      // 78: f2d
      // 79: invokestatic fe6.yr8 (DD)D
      // 7c: ldc2_w 180.0
      // 7f: dmul
      // 80: ldc2_w 3.141592653589793
      // 83: ddiv
      // 84: d2f
      // 85: dup_x1
      // 86: putfield db9.y2i F
      // 89: putfield db9.j25 F
      // 8c: return
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: getfield db9.o2v D
      // 005: putfield db9.ivp D
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield db9.kfp D
      // 00d: putfield db9.c54 D
      // 010: aload 0
      // 011: aload 0
      // 012: getfield db9.vbd D
      // 015: putfield db9.e2b D
      // 018: aload 0
      // 019: invokespecial i2h.xx_ ()V
      // 01c: aload 0
      // 01d: dup
      // 01e: getfield db9.o2v D
      // 021: aload 0
      // 022: getfield db9.icv D
      // 025: dadd
      // 026: putfield db9.o2v D
      // 029: aload 0
      // 02a: dup
      // 02b: getfield db9.kfp D
      // 02e: aload 0
      // 02f: getfield db9.mop D
      // 032: dadd
      // 033: putfield db9.kfp D
      // 036: invokestatic t9d.c ()I
      // 039: aload 0
      // 03a: dup
      // 03b: getfield db9.vbd D
      // 03e: aload 0
      // 03f: getfield db9.bw4 D
      // 042: dadd
      // 043: putfield db9.vbd D
      // 046: istore 1
      // 047: aload 0
      // 048: getfield db9.icv D
      // 04b: aload 0
      // 04c: getfield db9.icv D
      // 04f: dmul
      // 050: aload 0
      // 051: getfield db9.bw4 D
      // 054: aload 0
      // 055: getfield db9.bw4 D
      // 058: dmul
      // 059: dadd
      // 05a: invokestatic fe6.dii (D)F
      // 05d: fstore 2
      // 05e: aload 0
      // 05f: aload 0
      // 060: getfield db9.icv D
      // 063: aload 0
      // 064: getfield db9.bw4 D
      // 067: invokestatic fe6.yr8 (DD)D
      // 06a: ldc2_w 180.0
      // 06d: dmul
      // 06e: ldc2_w 3.141592653589793
      // 071: ddiv
      // 072: d2f
      // 073: putfield db9.x5k F
      // 076: aload 0
      // 077: aload 0
      // 078: getfield db9.mop D
      // 07b: fload 2
      // 07c: f2d
      // 07d: invokestatic fe6.yr8 (DD)D
      // 080: ldc2_w 180.0
      // 083: dmul
      // 084: ldc2_w 3.141592653589793
      // 087: ddiv
      // 088: d2f
      // 089: putfield db9.y2i F
      // 08c: aload 0
      // 08d: getfield db9.y2i F
      // 090: aload 0
      // 091: getfield db9.j25 F
      // 094: fsub
      // 095: ldc -180.0
      // 097: nop
      // 098: fcmpg
      // 099: ifge 0b7
      // 09c: aload 0
      // 09d: dup
      // 09e: getfield db9.j25 F
      // 0a1: ldc 360.0
      // 0a3: nop
      // 0a4: fsub
      // 0a5: putfield db9.j25 F
      // 0a8: iload 1
      // 0a9: ifne 0e2
      // 0ac: iload 1
      // 0ad: ifeq 08c
      // 0b0: goto 0b7
      // 0b3: invokestatic db9.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: getfield db9.y2i F
      // 0bb: aload 0
      // 0bc: getfield db9.j25 F
      // 0bf: fsub
      // 0c0: ldc 180.0
      // 0c2: nop
      // 0c3: fcmpl
      // 0c4: iflt 0e2
      // 0c7: aload 0
      // 0c8: dup
      // 0c9: getfield db9.j25 F
      // 0cc: ldc 360.0
      // 0ce: nop
      // 0cf: fadd
      // 0d0: putfield db9.j25 F
      // 0d3: iload 1
      // 0d4: ifne 114
      // 0d7: iload 1
      // 0d8: ifeq 0b7
      // 0db: goto 0e2
      // 0de: invokestatic db9.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: getfield db9.x5k F
      // 0e6: aload 0
      // 0e7: getfield db9.p3h F
      // 0ea: fsub
      // 0eb: ldc -180.0
      // 0ed: nop
      // 0ee: fcmpg
      // 0ef: ifge 114
      // 0f2: aload 0
      // 0f3: dup
      // 0f4: getfield db9.p3h F
      // 0f7: ldc 360.0
      // 0f9: nop
      // 0fa: fsub
      // 0fb: putfield db9.p3h F
      // 0fe: iload 1
      // 0ff: ifne 172
      // 102: goto 109
      // 105: invokestatic db9.a (Loov;)Loov;
      // 108: athrow
      // 109: iload 1
      // 10a: ifeq 0e2
      // 10d: goto 114
      // 110: invokestatic db9.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 0
      // 115: getfield db9.x5k F
      // 118: aload 0
      // 119: getfield db9.p3h F
      // 11c: fsub
      // 11d: ldc 180.0
      // 11f: nop
      // 120: fcmpl
      // 121: iflt 146
      // 124: aload 0
      // 125: dup
      // 126: getfield db9.p3h F
      // 129: ldc 360.0
      // 12b: nop
      // 12c: fadd
      // 12d: putfield db9.p3h F
      // 130: iload 1
      // 131: ifne 172
      // 134: goto 13b
      // 137: invokestatic db9.a (Loov;)Loov;
      // 13a: athrow
      // 13b: iload 1
      // 13c: ifeq 114
      // 13f: goto 146
      // 142: invokestatic db9.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 0
      // 147: aload 0
      // 148: getfield db9.j25 F
      // 14b: aload 0
      // 14c: getfield db9.y2i F
      // 14f: aload 0
      // 150: getfield db9.j25 F
      // 153: fsub
      // 154: ldc 0.2
      // 156: nop
      // 157: fmul
      // 158: fadd
      // 159: putfield db9.y2i F
      // 15c: aload 0
      // 15d: aload 0
      // 15e: getfield db9.p3h F
      // 161: aload 0
      // 162: getfield db9.x5k F
      // 165: aload 0
      // 166: getfield db9.p3h F
      // 169: fsub
      // 16a: ldc 0.2
      // 16c: nop
      // 16d: fmul
      // 16e: fadd
      // 16f: putfield db9.x5k F
      // 172: aload 0
      // 173: iload 1
      // 174: ifne 18f
      // 177: getfield db9.oay Lt9d;
      // 17a: getfield t9d.v0f Z
      // 17d: ifne 25a
      // 180: goto 187
      // 183: invokestatic db9.a (Loov;)Loov;
      // 186: athrow
      // 187: aload 0
      // 188: goto 18f
      // 18b: invokestatic db9.a (Loov;)Loov;
      // 18e: athrow
      // 18f: getfield db9.ik7 D
      // 192: aload 0
      // 193: getfield db9.o2v D
      // 196: dsub
      // 197: dstore 3
      // 198: aload 0
      // 199: getfield db9.dy6 D
      // 19c: aload 0
      // 19d: getfield db9.vbd D
      // 1a0: dsub
      // 1a1: dstore 5
      // 1a3: dload 3
      // 1a4: dload 3
      // 1a5: dmul
      // 1a6: dload 5
      // 1a8: dload 5
      // 1aa: dmul
      // 1ab: dadd
      // 1ac: invokestatic java/lang/Math.sqrt (D)D
      // 1af: d2f
      // 1b0: fstore 7
      // 1b2: dload 5
      // 1b4: dload 3
      // 1b5: invokestatic fe6.yr8 (DD)D
      // 1b8: d2f
      // 1b9: fstore 8
      // 1bb: fload 2
      // 1bc: f2d
      // 1bd: fload 7
      // 1bf: fload 2
      // 1c0: fsub
      // 1c1: f2d
      // 1c2: ldc2_w 0.0025
      // 1c5: dmul
      // 1c6: dadd
      // 1c7: dstore 9
      // 1c9: fload 7
      // 1cb: fconst_1
      // 1cc: fcmpg
      // 1cd: iload 1
      // 1ce: ifne 21d
      // 1d1: ifge 1ef
      // 1d4: goto 1db
      // 1d7: invokestatic db9.a (Loov;)Loov;
      // 1da: athrow
      // 1db: dload 9
      // 1dd: ldc2_w 0.8
      // 1e0: dmul
      // 1e1: dstore 9
      // 1e3: aload 0
      // 1e4: dup
      // 1e5: getfield db9.mop D
      // 1e8: ldc2_w 0.8
      // 1eb: dmul
      // 1ec: putfield db9.mop D
      // 1ef: aload 0
      // 1f0: fload 8
      // 1f2: f2d
      // 1f3: invokestatic java/lang/Math.cos (D)D
      // 1f6: dload 9
      // 1f8: dmul
      // 1f9: putfield db9.icv D
      // 1fc: aload 0
      // 1fd: fload 8
      // 1ff: f2d
      // 200: invokestatic java/lang/Math.sin (D)D
      // 203: dload 9
      // 205: dmul
      // 206: putfield db9.bw4 D
      // 209: aload 0
      // 20a: iload 1
      // 20b: ifne 246
      // 20e: getfield db9.kfp D
      // 211: aload 0
      // 212: getfield db9.e67 D
      // 215: dcmpg
      // 216: goto 21d
      // 219: invokestatic db9.a (Loov;)Loov;
      // 21c: athrow
      // 21d: ifge 23e
      // 220: aload 0
      // 221: dup
      // 222: getfield db9.mop D
      // 225: dconst_1
      // 226: aload 0
      // 227: getfield db9.mop D
      // 22a: dsub
      // 22b: ldc2_w 0.014999999664723873
      // 22e: dmul
      // 22f: dadd
      // 230: putfield db9.mop D
      // 233: iload 1
      // 234: ifeq 25a
      // 237: goto 23e
      // 23a: invokestatic db9.a (Loov;)Loov;
      // 23d: athrow
      // 23e: aload 0
      // 23f: goto 246
      // 242: invokestatic db9.a (Loov;)Loov;
      // 245: athrow
      // 246: dup
      // 247: getfield db9.mop D
      // 24a: ldc2_w -1.0
      // 24d: aload 0
      // 24e: getfield db9.mop D
      // 251: dsub
      // 252: ldc2_w 0.014999999664723873
      // 255: dmul
      // 256: dadd
      // 257: putfield db9.mop D
      // 25a: ldc 0.25
      // 25c: nop
      // 25d: fstore 3
      // 25e: aload 0
      // 25f: iload 1
      // 260: ifne 2d4
      // 263: invokevirtual db9.mwv ()Z
      // 266: ifeq 2cc
      // 269: goto 270
      // 26c: invokestatic db9.a (Loov;)Loov;
      // 26f: athrow
      // 270: bipush 0
      // 271: istore 4
      // 273: iload 4
      // 275: bipush 4
      // 276: if_icmpge 2c8
      // 279: aload 0
      // 27a: getfield db9.oay Lt9d;
      // 27d: getstatic w_0.w_h Lw_0;
      // 280: aload 0
      // 281: getfield db9.o2v D
      // 284: aload 0
      // 285: getfield db9.icv D
      // 288: fload 3
      // 289: f2d
      // 28a: dmul
      // 28b: dsub
      // 28c: aload 0
      // 28d: getfield db9.kfp D
      // 290: aload 0
      // 291: getfield db9.mop D
      // 294: fload 3
      // 295: f2d
      // 296: dmul
      // 297: dsub
      // 298: aload 0
      // 299: getfield db9.vbd D
      // 29c: aload 0
      // 29d: getfield db9.bw4 D
      // 2a0: fload 3
      // 2a1: f2d
      // 2a2: dmul
      // 2a3: dsub
      // 2a4: aload 0
      // 2a5: getfield db9.icv D
      // 2a8: aload 0
      // 2a9: getfield db9.mop D
      // 2ac: aload 0
      // 2ad: getfield db9.bw4 D
      // 2b0: bipush 0
      // 2b1: newarray 10
      // 2b3: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 2b6: iinc 4 1
      // 2b9: iload 1
      // 2ba: ifne 334
      // 2bd: iload 1
      // 2be: ifeq 273
      // 2c1: goto 2c8
      // 2c4: invokestatic db9.a (Loov;)Loov;
      // 2c7: athrow
      // 2c8: iload 1
      // 2c9: ifeq 334
      // 2cc: aload 0
      // 2cd: goto 2d4
      // 2d0: invokestatic db9.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: getfield db9.oay Lt9d;
      // 2d7: getstatic w_0.t9k Lw_0;
      // 2da: aload 0
      // 2db: getfield db9.o2v D
      // 2de: aload 0
      // 2df: getfield db9.icv D
      // 2e2: fload 3
      // 2e3: f2d
      // 2e4: dmul
      // 2e5: dsub
      // 2e6: aload 0
      // 2e7: getfield db9.z2d Ljava/util/Random;
      // 2ea: invokevirtual java/util/Random.nextDouble ()D
      // 2ed: ldc2_w 0.6
      // 2f0: dmul
      // 2f1: dadd
      // 2f2: ldc2_w 0.3
      // 2f5: dsub
      // 2f6: aload 0
      // 2f7: getfield db9.kfp D
      // 2fa: aload 0
      // 2fb: getfield db9.mop D
      // 2fe: fload 3
      // 2ff: f2d
      // 300: dmul
      // 301: dsub
      // 302: ldc2_w 0.5
      // 305: dsub
      // 306: aload 0
      // 307: getfield db9.vbd D
      // 30a: aload 0
      // 30b: getfield db9.bw4 D
      // 30e: fload 3
      // 30f: f2d
      // 310: dmul
      // 311: dsub
      // 312: aload 0
      // 313: getfield db9.z2d Ljava/util/Random;
      // 316: invokevirtual java/util/Random.nextDouble ()D
      // 319: ldc2_w 0.6
      // 31c: dmul
      // 31d: dadd
      // 31e: ldc2_w 0.3
      // 321: dsub
      // 322: aload 0
      // 323: getfield db9.icv D
      // 326: aload 0
      // 327: getfield db9.mop D
      // 32a: aload 0
      // 32b: getfield db9.bw4 D
      // 32e: bipush 0
      // 32f: newarray 10
      // 331: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 334: aload 0
      // 335: getfield db9.oay Lt9d;
      // 338: getfield t9d.v0f Z
      // 33b: iload 1
      // 33c: ifne 36e
      // 33f: ifne 405
      // 342: goto 349
      // 345: invokestatic db9.a (Loov;)Loov;
      // 348: athrow
      // 349: aload 0
      // 34a: aload 0
      // 34b: getfield db9.o2v D
      // 34e: aload 0
      // 34f: getfield db9.kfp D
      // 352: aload 0
      // 353: getfield db9.vbd D
      // 356: invokevirtual db9.m6_ (DDD)V
      // 359: aload 0
      // 35a: dup
      // 35b: getfield db9._9v I
      // 35e: bipush 1
      // 35f: iadd
      // 360: putfield db9._9v I
      // 363: aload 0
      // 364: getfield db9._9v I
      // 367: goto 36e
      // 36a: invokestatic db9.a (Loov;)Loov;
      // 36d: athrow
      // 36e: iload 1
      // 36f: ifne 38c
      // 372: bipush 80
      // 374: if_icmple 405
      // 377: goto 37e
      // 37a: invokestatic db9.a (Loov;)Loov;
      // 37d: athrow
      // 37e: aload 0
      // 37f: getfield db9.oay Lt9d;
      // 382: getfield t9d.v0f Z
      // 385: goto 38c
      // 388: invokestatic db9.a (Loov;)Loov;
      // 38b: athrow
      // 38c: iload 1
      // 38d: ifne 3b4
      // 390: ifne 405
      // 393: goto 39a
      // 396: invokestatic db9.a (Loov;)Loov;
      // 399: athrow
      // 39a: aload 0
      // 39b: invokevirtual db9._kl ()V
      // 39e: aload 0
      // 39f: iload 1
      // 3a0: ifne 3f3
      // 3a3: goto 3aa
      // 3a6: invokestatic db9.a (Loov;)Loov;
      // 3a9: athrow
      // 3aa: getfield db9._mn Z
      // 3ad: goto 3b4
      // 3b0: invokestatic db9.a (Loov;)Loov;
      // 3b3: athrow
      // 3b4: ifeq 3eb
      // 3b7: aload 0
      // 3b8: getfield db9.oay Lt9d;
      // 3bb: new nvf
      // 3be: dup
      // 3bf: aload 0
      // 3c0: getfield db9.oay Lt9d;
      // 3c3: aload 0
      // 3c4: getfield db9.o2v D
      // 3c7: aload 0
      // 3c8: getfield db9.kfp D
      // 3cb: aload 0
      // 3cc: getfield db9.vbd D
      // 3cf: new erg
      // 3d2: dup
      // 3d3: getstatic xbr.rr5 Lu7m;
      // 3d6: invokespecial erg.<init> (Lu7m;)V
      // 3d9: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 3dc: invokevirtual t9d.xzq (Li2h;)Z
      // 3df: pop
      // 3e0: iload 1
      // 3e1: ifeq 405
      // 3e4: goto 3eb
      // 3e7: invokestatic db9.a (Loov;)Loov;
      // 3ea: athrow
      // 3eb: aload 0
      // 3ec: goto 3f3
      // 3ef: invokestatic db9.a (Loov;)Loov;
      // 3f2: athrow
      // 3f3: getfield db9.oay Lt9d;
      // 3f6: sipush 2003
      // 3f9: new mew
      // 3fc: dup
      // 3fd: aload 0
      // 3fe: invokespecial mew.<init> (Li2h;)V
      // 401: bipush 0
      // 402: invokevirtual t9d.qca (ILmew;I)V
      // 405: return
   }

   @Override
   public void srs(bdo var1) {
   }

   @Override
   public void cjb(bdo var1) {
   }

   @Override
   public float xeu(float var1) {
      return 1.0F;
   }

   @Override
   public int azk(float var1) {
      return 15728880;
   }

   @Override
   public boolean qvl() {
      return false;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
