public class knw {
   public knw(yqv var1) {
      this.gm9 = var1;
   }

   public void rz3(EntityLivingBase param1, float param2, float param3) {
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
      // 07: getfield EntityLivingBase.o2v D
      // 0a: iload 4
      // 0c: ifne 55
      // 0f: putfield knw.bi4 D
      // 12: aload 1
      // 13: instanceof Entity
      // 16: ifeq 3a
      // 19: goto 20
      // 1c: invokestatic knw.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: getfield EntityLivingBase.kfp D
      // 25: aload 1
      // 26: invokevirtual EntityLivingBase.c5y ()F
      // 29: f2d
      // 2a: dadd
      // 2b: putfield knw.jef D
      // 2e: iload 4
      // 30: ifeq 58
      // 33: goto 3a
      // 36: invokestatic knw.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 3f: getfield nh4.bx_ D
      // 42: aload 1
      // 43: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 46: getfield nh4.i2c D
      // 49: dadd
      // 4a: ldc2_w 2.0
      // 4d: ddiv
      // 4e: goto 55
      // 51: invokestatic knw.a (Loov;)Loov;
      // 54: athrow
      // 55: putfield knw.jef D
      // 58: aload 0
      // 59: aload 1
      // 5a: getfield EntityLivingBase.vbd D
      // 5d: putfield knw.gp8 D
      // 60: aload 0
      // 61: fload 2
      // 62: putfield knw.v21 F
      // 65: aload 0
      // 66: fload 3
      // 67: putfield knw.bj4 F
      // 6a: aload 0
      // 6b: bipush 1
      // 6c: putfield knw.g8i Z
      // 6f: return
   }

   public void c2i(double var1, double var3, double var5, float var7, float var8) {
      this.bi4 = var1;
      this.jef = var3;
      this.gp8 = var5;
      this.v21 = var7;
      this.bj4 = var8;
      this.g8i = true;
   }

   public void _9j() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield knw.gm9 Lyqv;
      // 008: fconst_0
      // 009: putfield yqv.y2i F
      // 00c: aload 0
      // 00d: iload 1
      // 00e: ifeq 0c8
      // 011: getfield knw.g8i Z
      // 014: ifeq 0c0
      // 017: goto 01e
      // 01a: invokestatic knw.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: bipush 0
      // 020: putfield knw.g8i Z
      // 023: aload 0
      // 024: getfield knw.bi4 D
      // 027: aload 0
      // 028: getfield knw.gm9 Lyqv;
      // 02b: getfield yqv.o2v D
      // 02e: dsub
      // 02f: dstore 2
      // 030: aload 0
      // 031: getfield knw.jef D
      // 034: aload 0
      // 035: getfield knw.gm9 Lyqv;
      // 038: getfield yqv.kfp D
      // 03b: aload 0
      // 03c: getfield knw.gm9 Lyqv;
      // 03f: invokevirtual yqv.c5y ()F
      // 042: f2d
      // 043: dadd
      // 044: dsub
      // 045: dstore 4
      // 047: aload 0
      // 048: getfield knw.gp8 D
      // 04b: aload 0
      // 04c: getfield knw.gm9 Lyqv;
      // 04f: getfield yqv.vbd D
      // 052: dsub
      // 053: dstore 6
      // 055: dload 2
      // 056: dload 2
      // 057: dmul
      // 058: dload 6
      // 05a: dload 6
      // 05c: dmul
      // 05d: dadd
      // 05e: invokestatic fe6.dii (D)F
      // 061: f2d
      // 062: dstore 8
      // 064: dload 6
      // 066: dload 2
      // 067: invokestatic fe6.yr8 (DD)D
      // 06a: ldc2_w 180.0
      // 06d: dmul
      // 06e: ldc2_w 3.141592653589793
      // 071: ddiv
      // 072: d2f
      // 073: ldc 90.0
      // 075: nop
      // 076: fsub
      // 077: fstore 10
      // 079: dload 4
      // 07b: dload 8
      // 07d: invokestatic fe6.yr8 (DD)D
      // 080: ldc2_w 180.0
      // 083: dmul
      // 084: ldc2_w 3.141592653589793
      // 087: ddiv
      // 088: dneg
      // 089: d2f
      // 08a: fstore 11
      // 08c: aload 0
      // 08d: getfield knw.gm9 Lyqv;
      // 090: aload 0
      // 091: aload 0
      // 092: getfield knw.gm9 Lyqv;
      // 095: getfield yqv.y2i F
      // 098: fload 11
      // 09a: aload 0
      // 09b: getfield knw.bj4 F
      // 09e: invokespecial knw.sr0 (FFF)F
      // 0a1: putfield yqv.y2i F
      // 0a4: aload 0
      // 0a5: getfield knw.gm9 Lyqv;
      // 0a8: aload 0
      // 0a9: aload 0
      // 0aa: getfield knw.gm9 Lyqv;
      // 0ad: getfield yqv.q6c F
      // 0b0: fload 10
      // 0b2: aload 0
      // 0b3: getfield knw.v21 F
      // 0b6: invokespecial knw.sr0 (FFF)F
      // 0b9: putfield yqv.q6c F
      // 0bc: iload 1
      // 0bd: ifne 0e3
      // 0c0: aload 0
      // 0c1: goto 0c8
      // 0c4: invokestatic knw.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: getfield knw.gm9 Lyqv;
      // 0cb: aload 0
      // 0cc: aload 0
      // 0cd: getfield knw.gm9 Lyqv;
      // 0d0: getfield yqv.q6c F
      // 0d3: aload 0
      // 0d4: getfield knw.gm9 Lyqv;
      // 0d7: getfield yqv.ksw F
      // 0da: ldc 10.0
      // 0dc: nop
      // 0dd: invokespecial knw.sr0 (FFF)F
      // 0e0: putfield yqv.q6c F
      // 0e3: aload 0
      // 0e4: getfield knw.gm9 Lyqv;
      // 0e7: getfield yqv.q6c F
      // 0ea: aload 0
      // 0eb: getfield knw.gm9 Lyqv;
      // 0ee: getfield yqv.ksw F
      // 0f1: fsub
      // 0f2: invokestatic fe6.qsy (F)F
      // 0f5: fstore 2
      // 0f6: aload 0
      // 0f7: getfield knw.gm9 Lyqv;
      // 0fa: invokevirtual yqv.zq2 ()Lp8a;
      // 0fd: invokevirtual p8a.j07 ()Z
      // 100: iload 1
      // 101: ifeq 11a
      // 104: ifne 162
      // 107: goto 10e
      // 10a: invokestatic knw.a (Loov;)Loov;
      // 10d: athrow
      // 10e: fload 2
      // 10f: ldc -75.0
      // 111: nop
      // 112: fcmpg
      // 113: goto 11a
      // 116: invokestatic knw.a (Loov;)Loov;
      // 119: athrow
      // 11a: iload 1
      // 11b: ifeq 146
      // 11e: ifge 141
      // 121: goto 128
      // 124: invokestatic knw.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 0
      // 129: getfield knw.gm9 Lyqv;
      // 12c: aload 0
      // 12d: getfield knw.gm9 Lyqv;
      // 130: getfield yqv.ksw F
      // 133: ldc 75.0
      // 135: nop
      // 136: fsub
      // 137: putfield yqv.q6c F
      // 13a: goto 141
      // 13d: invokestatic knw.a (Loov;)Loov;
      // 140: athrow
      // 141: fload 2
      // 142: ldc 75.0
      // 144: nop
      // 145: fcmpl
      // 146: ifle 162
      // 149: aload 0
      // 14a: getfield knw.gm9 Lyqv;
      // 14d: aload 0
      // 14e: getfield knw.gm9 Lyqv;
      // 151: getfield yqv.ksw F
      // 154: ldc 75.0
      // 156: nop
      // 157: fadd
      // 158: putfield yqv.q6c F
      // 15b: goto 162
      // 15e: invokestatic knw.a (Loov;)Loov;
      // 161: athrow
      // 162: return
   }

   private float sr0(float var1, float var2, float var3) {
      int var4 = OpaquePredicate.b();
      float var5 = fe6.qsy(var2 - var1);

      int var10000;
      label34: {
         label33: {
            try {
               float var9;
               var10000 = (var9 = var5 - var3) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
               if (var4 == 0) {
                  break label34;
               }

               if (var10000 <= 0) {
                  break label33;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var5 = var3;
         }

         try {
            float var10001 = -var3;
            if (var4 == 0) {
               return var5 + var10001;
            }

            float var10;
            var10000 = (var10 = var5 - var10001) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         } catch (oov var6) {
            throw a(var6);
         }
      }

      if (var10000 < 0) {
         var5 = -var3;
      }

      return var1 + var5;
   }

   public boolean hsq() {
      return this.g8i;
   }

   public double msd() {
      return this.bi4;
   }

   public double kyo() {
      return this.jef;
   }

   public double bgx() {
      return this.gp8;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
