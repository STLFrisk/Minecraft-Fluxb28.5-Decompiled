public class c9p$kdw extends cjm {
   private c9p rcl;
   private int oqy;

   public c9p$kdw(c9p var1) {
      this.rcl = var1;
      this.k23(3);
   }

   @Override
   public boolean vle() {
      int var1 = t9d.b();
      g_3 var2 = this.rcl.q4v();

      g_3 var10000;
      label33: {
         try {
            var10000 = var2;
            if (var1 == 0) {
               break label33;
            }

            if (var2 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var2;
      }

      try {
         boolean var5 = var10000.gzr();
         if (var1 == 0) {
            return var5;
         }

         if (var5) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial cjm.wh3 ()Z
      // 08: iload 1
      // 09: ifeq 24
      // 0c: ifeq 5d
      // 0f: goto 16
      // 12: invokestatic c9p$kdw.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield c9p$kdw.rcl Lc9p;
      // 1a: invokevirtual c9p.mzk ()Z
      // 1d: goto 24
      // 20: invokestatic c9p$kdw.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 1
      // 25: ifeq 5a
      // 28: ifne 59
      // 2b: goto 32
      // 2e: invokestatic c9p$kdw.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield c9p$kdw.rcl Lc9p;
      // 36: aload 0
      // 37: getfield c9p$kdw.rcl Lc9p;
      // 3a: invokevirtual c9p.q4v ()Lg_3;
      // 3d: invokevirtual c9p.wxg (Li2h;)D
      // 40: ldc2_w 9.0
      // 43: dcmpl
      // 44: iload 1
      // 45: ifeq 5a
      // 48: goto 4f
      // 4b: invokestatic c9p$kdw.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifle 5d
      // 52: goto 59
      // 55: invokestatic c9p$kdw.a (Loov;)Loov;
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   @Override
   public void mnp() {
      this.oqy = -10;
      this.rcl.zq2().pj2();
      this.rcl.ph8().rz3(this.rcl.q4v(), 90.0F, 90.0F);
      this.rcl.u19 = true;
   }

   @Override
   public void zly() {
      c9p.bf5(this.rcl, 0);
      this.rcl.ux8((g_3)null);
      c9p.ggu(this.rcl).x6d();
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield c9p$kdw.rcl Lc9p;
      // 004: invokevirtual c9p.q4v ()Lg_3;
      // 007: astore 2
      // 008: invokestatic t9d.b ()I
      // 00b: aload 0
      // 00c: getfield c9p$kdw.rcl Lc9p;
      // 00f: invokevirtual c9p.zq2 ()Lp8a;
      // 012: invokevirtual p8a.pj2 ()V
      // 015: istore 1
      // 016: aload 0
      // 017: getfield c9p$kdw.rcl Lc9p;
      // 01a: invokevirtual c9p.ph8 ()Lknw;
      // 01d: aload 2
      // 01e: ldc 90.0
      // 020: nop
      // 021: ldc 90.0
      // 023: nop
      // 024: invokevirtual knw.rz3 (Li2h;FF)V
      // 027: aload 0
      // 028: getfield c9p$kdw.rcl Lc9p;
      // 02b: aload 2
      // 02c: invokevirtual c9p.gq6 (Li2h;)Z
      // 02f: iload 1
      // 030: ifeq 068
      // 033: ifne 053
      // 036: goto 03d
      // 039: invokestatic c9p$kdw.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield c9p$kdw.rcl Lc9p;
      // 041: aconst_null
      // 042: checkcast g_3
      // 045: invokevirtual c9p.ux8 (Lg_3;)V
      // 048: iload 1
      // 049: ifne 168
      // 04c: goto 053
      // 04f: invokestatic c9p$kdw.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: dup
      // 055: getfield c9p$kdw.oqy I
      // 058: bipush 1
      // 059: iadd
      // 05a: putfield c9p$kdw.oqy I
      // 05d: aload 0
      // 05e: getfield c9p$kdw.oqy I
      // 061: goto 068
      // 064: invokestatic c9p$kdw.a (Loov;)Loov;
      // 067: athrow
      // 068: iload 1
      // 069: ifeq 0ad
      // 06c: ifne 0a2
      // 06f: goto 076
      // 072: invokestatic c9p$kdw.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 0
      // 077: getfield c9p$kdw.rcl Lc9p;
      // 07a: aload 0
      // 07b: getfield c9p$kdw.rcl Lc9p;
      // 07e: invokevirtual c9p.q4v ()Lg_3;
      // 081: invokevirtual g_3.jwu ()I
      // 084: invokestatic c9p.bf5 (Lc9p;I)V
      // 087: aload 0
      // 088: getfield c9p$kdw.rcl Lc9p;
      // 08b: getfield c9p.oay Lt9d;
      // 08e: aload 0
      // 08f: getfield c9p$kdw.rcl Lc9p;
      // 092: bipush 21
      // 094: invokevirtual t9d.qyn (Li2h;B)V
      // 097: iload 1
      // 098: ifne 164
      // 09b: goto 0a2
      // 09e: invokestatic c9p$kdw.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield c9p$kdw.oqy I
      // 0a6: goto 0ad
      // 0a9: invokestatic c9p$kdw.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield c9p$kdw.rcl Lc9p;
      // 0b1: invokevirtual c9p.y3s ()I
      // 0b4: iload 1
      // 0b5: ifeq 150
      // 0b8: if_icmplt 138
      // 0bb: goto 0c2
      // 0be: invokestatic c9p$kdw.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: fconst_1
      // 0c3: fstore 3
      // 0c4: aload 0
      // 0c5: getfield c9p$kdw.rcl Lc9p;
      // 0c8: iload 1
      // 0c9: ifeq 0e7
      // 0cc: getfield c9p.oay Lt9d;
      // 0cf: invokevirtual t9d.rbk ()Lv66;
      // 0d2: getstatic v66.csg Lv66;
      // 0d5: if_acmpne 0e3
      // 0d8: goto 0df
      // 0db: invokestatic c9p$kdw.a (Loov;)Loov;
      // 0de: athrow
      // 0df: fload 3
      // 0e0: fconst_2
      // 0e1: fadd
      // 0e2: fstore 3
      // 0e3: aload 0
      // 0e4: getfield c9p$kdw.rcl Lc9p;
      // 0e7: invokevirtual c9p.mzk ()Z
      // 0ea: iload 1
      // 0eb: ifeq 128
      // 0ee: ifeq 0fc
      // 0f1: goto 0f8
      // 0f4: invokestatic c9p$kdw.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: fload 3
      // 0f9: fconst_2
      // 0fa: fadd
      // 0fb: fstore 3
      // 0fc: aload 2
      // 0fd: aload 0
      // 0fe: getfield c9p$kdw.rcl Lc9p;
      // 101: aload 0
      // 102: getfield c9p$kdw.rcl Lc9p;
      // 105: invokestatic ofh.zj0 (Li2h;Li2h;)Lofh;
      // 108: fload 3
      // 109: invokevirtual g_3.m1t (Lofh;F)Z
      // 10c: pop
      // 10d: aload 2
      // 10e: aload 0
      // 10f: getfield c9p$kdw.rcl Lc9p;
      // 112: invokestatic ofh.kun (Lg_3;)Lofh;
      // 115: aload 0
      // 116: getfield c9p$kdw.rcl Lc9p;
      // 119: getstatic m6d.y3f Lw9p;
      // 11c: invokevirtual c9p.dgt (Lw9p;)L_4o;
      // 11f: invokeinterface _4o.nz5 ()D 1
      // 124: d2f
      // 125: invokevirtual g_3.m1t (Lofh;F)Z
      // 128: pop
      // 129: aload 0
      // 12a: getfield c9p$kdw.rcl Lc9p;
      // 12d: aconst_null
      // 12e: checkcast g_3
      // 131: invokevirtual c9p.ux8 (Lg_3;)V
      // 134: iload 1
      // 135: ifne 164
      // 138: aload 0
      // 139: iload 1
      // 13a: ifeq 165
      // 13d: goto 144
      // 140: invokestatic c9p$kdw.a (Loov;)Loov;
      // 143: athrow
      // 144: getfield c9p$kdw.oqy I
      // 147: bipush 60
      // 149: goto 150
      // 14c: invokestatic c9p$kdw.a (Loov;)Loov;
      // 14f: athrow
      // 150: if_icmplt 164
      // 153: aload 0
      // 154: getfield c9p$kdw.oqy I
      // 157: bipush 20
      // 159: irem
      // 15a: ifne 164
      // 15d: goto 164
      // 160: invokestatic c9p$kdw.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 0
      // 165: invokespecial cjm.iad ()V
      // 168: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
