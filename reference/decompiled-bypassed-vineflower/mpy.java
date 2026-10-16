public class mpy extends g6r {
   public tf8 b_c;
   public tf8 fnv;
   public tf8 b4t;
   public tf8 w0x;
   public tf8 pni;
   public tf8 gij;
   public tf8 ccu;
   public tf8 d3a;

   public mpy() {
      float var1 = 0.0F;
      float var2 = 13.5F;
      this.b_c = new tf8(this, 0, 0);
      this.b_c.q3x(-3.0F, -3.0F, -2.0F, 6, 6, 4, var1);
      this.b_c.i50(-1.0F, var2, -7.0F);
      this.fnv = new tf8(this, 18, 14);
      this.fnv.q3x(-4.0F, -2.0F, -3.0F, 6, 9, 6, var1);
      this.fnv.i50(0.0F, 14.0F, 2.0F);
      this.d3a = new tf8(this, 21, 0);
      this.d3a.q3x(-4.0F, -3.0F, -3.0F, 8, 6, 7, var1);
      this.d3a.i50(-1.0F, 14.0F, 2.0F);
      this.b4t = new tf8(this, 0, 18);
      this.b4t.q3x(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.b4t.i50(-2.5F, 16.0F, 7.0F);
      this.w0x = new tf8(this, 0, 18);
      this.w0x.q3x(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.w0x.i50(0.5F, 16.0F, 7.0F);
      this.pni = new tf8(this, 0, 18);
      this.pni.q3x(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.pni.i50(-2.5F, 16.0F, -4.0F);
      this.gij = new tf8(this, 0, 18);
      this.gij.q3x(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.gij.i50(0.5F, 16.0F, -4.0F);
      this.ccu = new tf8(this, 9, 18);
      this.ccu.q3x(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.ccu.i50(-1.0F, 12.0F, 8.0F);
      this.b_c.fc6(16, 14).q3x(-3.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.b_c.fc6(16, 14).q3x(1.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.b_c.fc6(0, 10).q3x(-1.5F, 0.0F, -5.0F, 3, 3, 4, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.s_q(var1, var2, var3, var4, var5, var6, var7);
      int var10000 = t9d.b();
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      int var8 = var10000;

      label46: {
         label41: {
            try {
               var13 = this;
               if (var8 == 0) {
                  break label46;
               }

               if (!this._a0) {
                  break label41;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            float var9 = 2.0F;

            try {
               hzu.dp2();
               hzu.a4k(0.0F, 5.0F * var7, 2.0F * var7);
               this.b_c.pt6(var7);
               hzu.x3w();
               hzu.dp2();
               hzu.syc(1.0F / var9, 1.0F / var9, 1.0F / var9);
               hzu.a4k(0.0F, 24.0F * var7, 0.0F);
               this.fnv.vca(var7);
               this.b4t.vca(var7);
               this.w0x.vca(var7);
               this.pni.vca(var7);
               this.gij.vca(var7);
               this.ccu.pt6(var7);
               this.d3a.vca(var7);
               hzu.x3w();
               if (var8 != 0) {
                  return;
               }
            } catch (oov var11) {
               boolean var10001 = false;
               throw a(var11);
            }
         }

         try {
            this.b_c.pt6(var7);
            this.fnv.vca(var7);
            this.b4t.vca(var7);
            this.w0x.vca(var7);
            this.pni.vca(var7);
            this.gij.vca(var7);
            this.ccu.pt6(var7);
            var13 = this;
         } catch (oov var10) {
            boolean var15 = false;
            throw a(var10);
         }
      }

      var13.d3a.vca(var7);
   }

   @Override
   public void v3g(g_3 param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 5
      // 005: aload 1
      // 006: checkcast gse
      // 009: astore 6
      // 00b: iload 5
      // 00d: ifeq 02e
      // 010: aload 6
      // 012: invokevirtual gse.iki ()Z
      // 015: ifeq 033
      // 018: goto 01f
      // 01b: invokestatic mpy.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield mpy.ccu Ltf8;
      // 023: fconst_0
      // 024: putfield tf8.r80 F
      // 027: goto 02e
      // 02a: invokestatic mpy.a (Loov;)Loov;
      // 02d: athrow
      // 02e: iload 5
      // 030: ifne 04f
      // 033: aload 0
      // 034: getfield mpy.ccu Ltf8;
      // 037: fload 2
      // 038: ldc 0.6662
      // 03a: nop
      // 03b: fmul
      // 03c: invokestatic fe6.ssk (F)F
      // 03f: ldc 1.4
      // 041: nop
      // 042: fmul
      // 043: fload 3
      // 044: fmul
      // 045: putfield tf8.r80 F
      // 048: goto 04f
      // 04b: invokestatic mpy.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 6
      // 051: invokevirtual gse.ird ()Z
      // 054: ifeq 10f
      // 057: aload 0
      // 058: getfield mpy.d3a Ltf8;
      // 05b: ldc -1.0
      // 05d: nop
      // 05e: ldc 16.0
      // 060: nop
      // 061: ldc -3.0
      // 063: nop
      // 064: invokevirtual tf8.i50 (FFF)V
      // 067: aload 0
      // 068: getfield mpy.d3a Ltf8;
      // 06b: ldc 1.2566371
      // 06d: nop
      // 06e: putfield tf8.pod F
      // 071: aload 0
      // 072: getfield mpy.d3a Ltf8;
      // 075: fconst_0
      // 076: putfield tf8.r80 F
      // 079: aload 0
      // 07a: getfield mpy.fnv Ltf8;
      // 07d: fconst_0
      // 07e: ldc 18.0
      // 080: nop
      // 081: fconst_0
      // 082: invokevirtual tf8.i50 (FFF)V
      // 085: aload 0
      // 086: getfield mpy.fnv Ltf8;
      // 089: ldc 0.7853982
      // 08b: nop
      // 08c: putfield tf8.pod F
      // 08f: aload 0
      // 090: getfield mpy.ccu Ltf8;
      // 093: ldc -1.0
      // 095: nop
      // 096: ldc 21.0
      // 098: nop
      // 099: ldc 6.0
      // 09b: nop
      // 09c: invokevirtual tf8.i50 (FFF)V
      // 09f: aload 0
      // 0a0: getfield mpy.b4t Ltf8;
      // 0a3: ldc -2.5
      // 0a5: nop
      // 0a6: ldc 22.0
      // 0a8: nop
      // 0a9: fconst_2
      // 0aa: invokevirtual tf8.i50 (FFF)V
      // 0ad: aload 0
      // 0ae: getfield mpy.b4t Ltf8;
      // 0b1: ldc 4.712389
      // 0b3: nop
      // 0b4: putfield tf8.pod F
      // 0b7: aload 0
      // 0b8: getfield mpy.w0x Ltf8;
      // 0bb: ldc 0.5
      // 0bd: nop
      // 0be: ldc 22.0
      // 0c0: nop
      // 0c1: fconst_2
      // 0c2: invokevirtual tf8.i50 (FFF)V
      // 0c5: aload 0
      // 0c6: getfield mpy.w0x Ltf8;
      // 0c9: ldc 4.712389
      // 0cb: nop
      // 0cc: putfield tf8.pod F
      // 0cf: aload 0
      // 0d0: getfield mpy.pni Ltf8;
      // 0d3: ldc 5.811947
      // 0d5: nop
      // 0d6: putfield tf8.pod F
      // 0d9: aload 0
      // 0da: getfield mpy.pni Ltf8;
      // 0dd: ldc -2.49
      // 0df: nop
      // 0e0: ldc 17.0
      // 0e2: nop
      // 0e3: ldc -4.0
      // 0e5: nop
      // 0e6: invokevirtual tf8.i50 (FFF)V
      // 0e9: aload 0
      // 0ea: getfield mpy.gij Ltf8;
      // 0ed: ldc 5.811947
      // 0ef: nop
      // 0f0: putfield tf8.pod F
      // 0f3: aload 0
      // 0f4: getfield mpy.gij Ltf8;
      // 0f7: ldc 0.51
      // 0f9: nop
      // 0fa: ldc 17.0
      // 0fc: nop
      // 0fd: ldc -4.0
      // 0ff: nop
      // 100: invokevirtual tf8.i50 (FFF)V
      // 103: iload 5
      // 105: ifne 1f6
      // 108: goto 10f
      // 10b: invokestatic mpy.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield mpy.fnv Ltf8;
      // 113: fconst_0
      // 114: ldc 14.0
      // 116: nop
      // 117: fconst_2
      // 118: invokevirtual tf8.i50 (FFF)V
      // 11b: aload 0
      // 11c: getfield mpy.fnv Ltf8;
      // 11f: ldc 1.5707964
      // 121: nop
      // 122: putfield tf8.pod F
      // 125: aload 0
      // 126: getfield mpy.d3a Ltf8;
      // 129: ldc -1.0
      // 12b: nop
      // 12c: ldc 14.0
      // 12e: nop
      // 12f: ldc -3.0
      // 131: nop
      // 132: invokevirtual tf8.i50 (FFF)V
      // 135: aload 0
      // 136: getfield mpy.d3a Ltf8;
      // 139: aload 0
      // 13a: getfield mpy.fnv Ltf8;
      // 13d: getfield tf8.pod F
      // 140: putfield tf8.pod F
      // 143: aload 0
      // 144: getfield mpy.ccu Ltf8;
      // 147: ldc -1.0
      // 149: nop
      // 14a: ldc 12.0
      // 14c: nop
      // 14d: ldc 8.0
      // 14f: nop
      // 150: invokevirtual tf8.i50 (FFF)V
      // 153: aload 0
      // 154: getfield mpy.b4t Ltf8;
      // 157: ldc -2.5
      // 159: nop
      // 15a: ldc 16.0
      // 15c: nop
      // 15d: ldc 7.0
      // 15f: nop
      // 160: invokevirtual tf8.i50 (FFF)V
      // 163: aload 0
      // 164: getfield mpy.w0x Ltf8;
      // 167: ldc 0.5
      // 169: nop
      // 16a: ldc 16.0
      // 16c: nop
      // 16d: ldc 7.0
      // 16f: nop
      // 170: invokevirtual tf8.i50 (FFF)V
      // 173: aload 0
      // 174: getfield mpy.pni Ltf8;
      // 177: ldc -2.5
      // 179: nop
      // 17a: ldc 16.0
      // 17c: nop
      // 17d: ldc -4.0
      // 17f: nop
      // 180: invokevirtual tf8.i50 (FFF)V
      // 183: aload 0
      // 184: getfield mpy.gij Ltf8;
      // 187: ldc 0.5
      // 189: nop
      // 18a: ldc 16.0
      // 18c: nop
      // 18d: ldc -4.0
      // 18f: nop
      // 190: invokevirtual tf8.i50 (FFF)V
      // 193: aload 0
      // 194: getfield mpy.b4t Ltf8;
      // 197: fload 2
      // 198: ldc 0.6662
      // 19a: nop
      // 19b: fmul
      // 19c: invokestatic fe6.ssk (F)F
      // 19f: ldc 1.4
      // 1a1: nop
      // 1a2: fmul
      // 1a3: fload 3
      // 1a4: fmul
      // 1a5: putfield tf8.pod F
      // 1a8: aload 0
      // 1a9: getfield mpy.w0x Ltf8;
      // 1ac: fload 2
      // 1ad: ldc 0.6662
      // 1af: nop
      // 1b0: fmul
      // 1b1: ldc 3.1415927
      // 1b3: nop
      // 1b4: fadd
      // 1b5: invokestatic fe6.ssk (F)F
      // 1b8: ldc 1.4
      // 1ba: nop
      // 1bb: fmul
      // 1bc: fload 3
      // 1bd: fmul
      // 1be: putfield tf8.pod F
      // 1c1: aload 0
      // 1c2: getfield mpy.pni Ltf8;
      // 1c5: fload 2
      // 1c6: ldc 0.6662
      // 1c8: nop
      // 1c9: fmul
      // 1ca: ldc 3.1415927
      // 1cc: nop
      // 1cd: fadd
      // 1ce: invokestatic fe6.ssk (F)F
      // 1d1: ldc 1.4
      // 1d3: nop
      // 1d4: fmul
      // 1d5: fload 3
      // 1d6: fmul
      // 1d7: putfield tf8.pod F
      // 1da: aload 0
      // 1db: getfield mpy.gij Ltf8;
      // 1de: fload 2
      // 1df: ldc 0.6662
      // 1e1: nop
      // 1e2: fmul
      // 1e3: invokestatic fe6.ssk (F)F
      // 1e6: ldc 1.4
      // 1e8: nop
      // 1e9: fmul
      // 1ea: fload 3
      // 1eb: fmul
      // 1ec: putfield tf8.pod F
      // 1ef: goto 1f6
      // 1f2: invokestatic mpy.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: getfield mpy.b_c Ltf8;
      // 1fa: aload 6
      // 1fc: fload 4
      // 1fe: invokevirtual gse.p97 (F)F
      // 201: aload 6
      // 203: fload 4
      // 205: fconst_0
      // 206: invokevirtual gse._i3 (FF)F
      // 209: fadd
      // 20a: putfield tf8.oo7 F
      // 20d: aload 0
      // 20e: getfield mpy.d3a Ltf8;
      // 211: aload 6
      // 213: fload 4
      // 215: ldc -0.08
      // 217: nop
      // 218: invokevirtual gse._i3 (FF)F
      // 21b: putfield tf8.oo7 F
      // 21e: aload 0
      // 21f: getfield mpy.fnv Ltf8;
      // 222: aload 6
      // 224: fload 4
      // 226: ldc -0.16
      // 228: nop
      // 229: invokevirtual gse._i3 (FF)F
      // 22c: putfield tf8.oo7 F
      // 22f: aload 0
      // 230: getfield mpy.ccu Ltf8;
      // 233: aload 6
      // 235: fload 4
      // 237: ldc -0.2
      // 239: nop
      // 23a: invokevirtual gse._i3 (FF)F
      // 23d: putfield tf8.oo7 F
      // 240: return
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      this.b_c.pod = var5 / (180.0F / (float)Math.PI);
      this.b_c.r80 = var4 / (180.0F / (float)Math.PI);
      this.ccu.pod = var3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
