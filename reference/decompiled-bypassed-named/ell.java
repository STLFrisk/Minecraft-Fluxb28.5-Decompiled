import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ell extends e0x {
   public static final qx_ qlr;
   public static final h76 _gw;
   public static final zb_ xoa;

   public ell(p3y var1) {
      super(var1);
      this.y8l(this._8_.c32().zvi(qlr, vt2.z9q).zvi(_gw, false).zvi(xoa, ell$bu8.m2p));
      float var2 = 0.5F;
      float var3 = 1.0F;
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.i3l(uja.yj_);
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
   public boolean iwf(m5n var1, mew var2) {
      int var3 = OpaquePredicate.b();

      try {
         boolean var10000 = (Boolean)var1.getBlockState(var2).dil(_gw);
         if (var3 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return false;
   }

   @Override
   public nh4 j54(OpaquePredicate var1, mew var2) {
      this.c7i(var1, var2);
      return super.j54(var1, var2);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      this.c7i(var1, var2);
      return super.m__(var1, var2, var3);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.kdc(var1.getBlockState(var2));
   }

   @Override
   public void bf6() {
      float var1 = 0.1875F;
      this.xl4(0.0F, 0.40625F, 0.0F, 1.0F, 0.59375F, 1.0F);
   }

   public void kdc(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 021
      // 009: invokeinterface zfz.r_y ()Le0x; 1
      // 00e: aload 0
      // 00f: if_acmpne 12f
      // 012: goto 019
      // 015: invokestatic ell.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 1
      // 01a: goto 021
      // 01d: invokestatic ell.a (Loov;)Loov;
      // 020: athrow
      // 021: getstatic ell.xoa Lzb_;
      // 024: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 029: getstatic ell$bu8.f9s Lell$bu8;
      // 02c: if_acmpne 037
      // 02f: bipush 1
      // 030: goto 038
      // 033: invokestatic ell.a (Loov;)Loov;
      // 036: athrow
      // 037: bipush 0
      // 038: istore 3
      // 039: aload 1
      // 03a: getstatic ell._gw Lh76;
      // 03d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 042: checkcast java/lang/Boolean
      // 045: astore 4
      // 047: aload 1
      // 048: getstatic ell.qlr Lqx_;
      // 04b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 050: checkcast vt2
      // 053: astore 5
      // 055: ldc 0.1875
      // 057: nop
      // 058: fstore 6
      // 05a: iload 2
      // 05b: ifne 07c
      // 05e: iload 3
      // 05f: ifeq 080
      // 062: goto 069
      // 065: invokestatic ell.a (Loov;)Loov;
      // 068: athrow
      // 069: aload 0
      // 06a: fconst_0
      // 06b: ldc 0.8125
      // 06d: nop
      // 06e: fconst_0
      // 06f: fconst_1
      // 070: fconst_1
      // 071: fconst_1
      // 072: invokevirtual ell.xl4 (FFFFFF)V
      // 075: goto 07c
      // 078: invokestatic ell.a (Loov;)Loov;
      // 07b: athrow
      // 07c: iload 2
      // 07d: ifeq 093
      // 080: aload 0
      // 081: fconst_0
      // 082: fconst_0
      // 083: fconst_0
      // 084: fconst_1
      // 085: ldc 0.1875
      // 087: nop
      // 088: fconst_1
      // 089: invokevirtual ell.xl4 (FFFFFF)V
      // 08c: goto 093
      // 08f: invokestatic ell.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 4
      // 095: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 098: ifeq 12f
      // 09b: aload 5
      // 09d: getstatic vt2.z9q Lvt2;
      // 0a0: iload 2
      // 0a1: ifne 0cd
      // 0a4: goto 0ab
      // 0a7: invokestatic ell.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: if_acmpne 0c8
      // 0ae: goto 0b5
      // 0b1: invokestatic ell.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: fconst_0
      // 0b7: fconst_0
      // 0b8: ldc 0.8125
      // 0ba: nop
      // 0bb: fconst_1
      // 0bc: fconst_1
      // 0bd: fconst_1
      // 0be: invokevirtual ell.xl4 (FFFFFF)V
      // 0c1: goto 0c8
      // 0c4: invokestatic ell.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 5
      // 0ca: getstatic vt2.mxp Lvt2;
      // 0cd: iload 2
      // 0ce: ifne 0f3
      // 0d1: if_acmpne 0ee
      // 0d4: goto 0db
      // 0d7: invokestatic ell.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: fconst_0
      // 0dd: fconst_0
      // 0de: fconst_0
      // 0df: fconst_1
      // 0e0: fconst_1
      // 0e1: ldc 0.1875
      // 0e3: nop
      // 0e4: invokevirtual ell.xl4 (FFFFFF)V
      // 0e7: goto 0ee
      // 0ea: invokestatic ell.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 5
      // 0f0: getstatic vt2.te4 Lvt2;
      // 0f3: iload 2
      // 0f4: ifne 119
      // 0f7: if_acmpne 114
      // 0fa: goto 101
      // 0fd: invokestatic ell.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: ldc 0.8125
      // 104: nop
      // 105: fconst_0
      // 106: fconst_0
      // 107: fconst_1
      // 108: fconst_1
      // 109: fconst_1
      // 10a: invokevirtual ell.xl4 (FFFFFF)V
      // 10d: goto 114
      // 110: invokestatic ell.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 5
      // 116: getstatic vt2.zk4 Lvt2;
      // 119: if_acmpne 12f
      // 11c: aload 0
      // 11d: fconst_0
      // 11e: fconst_0
      // 11f: fconst_0
      // 120: ldc 0.1875
      // 122: nop
      // 123: fconst_1
      // 124: fconst_1
      // 125: invokevirtual ell.xl4 (FFFFFF)V
      // 128: goto 12f
      // 12b: invokestatic ell.a (Loov;)Loov;
      // 12e: athrow
      // 12f: return
   }

   @Override
   public boolean cl2(OpaquePredicate var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      int var9 = OpaquePredicate.c();

      try {
         if (this.kgd == p3y.e21) {
            return true;
         }
      } catch (oov var11) {
         throw a(var11);
      }

      var3 = var3.dm4(_gw);

      OpaquePredicate var10000;
      ha9 var10001;
      short var10002;
      label27: {
         label26: {
            try {
               var1.vct(var2, var3, 2);
               var10000 = var1;
               var10001 = var4;
               var10002 = (Boolean)var3.dil(_gw);
               if (var9 != 0) {
                  break label27;
               }

               if (var10002 != 0) {
                  break label26;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var10002 = 1006;
            break label27;
         }

         var10002 = 1003;
      }

      var10000.pbs(var10001, var10002, var2, 0);
      return true;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: ifne fd
      // 0c: aload 2
      // 0d: aload 3
      // 0e: getstatic ell.qlr Lqx_;
      // 11: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 16: checkcast vt2
      // 19: invokevirtual vt2.b4b ()Lvt2;
      // 1c: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1f: astore 6
      // 21: aload 1
      // 22: aload 6
      // 24: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 27: invokeinterface zfz.r_y ()Le0x; 1
      // 2c: invokestatic ell.ov4 (Le0x;)Z
      // 2f: iload 5
      // 31: ifne 64
      // 34: ifne 58
      // 37: goto 3e
      // 3a: invokestatic ell.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 1
      // 3f: aload 2
      // 40: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 43: pop
      // 44: aload 0
      // 45: aload 1
      // 46: aload 2
      // 47: aload 3
      // 48: bipush 0
      // 49: invokevirtual ell.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 4c: iload 5
      // 4e: ifeq fd
      // 51: goto 58
      // 54: invokestatic ell.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 1
      // 59: aload 2
      // 5a: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 5d: goto 64
      // 60: invokestatic ell.a (Loov;)Loov;
      // 63: athrow
      // 64: istore 7
      // 66: iload 7
      // 68: iload 5
      // 6a: ifne a8
      // 6d: ifne 92
      // 70: goto 77
      // 73: invokestatic ell.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 4
      // 79: invokevirtual e0x.scl ()Z
      // 7c: iload 5
      // 7e: ifne a8
      // 81: goto 88
      // 84: invokestatic ell.a (Loov;)Loov;
      // 87: athrow
      // 88: ifeq fd
      // 8b: goto 92
      // 8e: invokestatic ell.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 3
      // 93: getstatic ell._gw Lh76;
      // 96: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 9b: checkcast java/lang/Boolean
      // 9e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // a1: goto a8
      // a4: invokestatic ell.a (Loov;)Loov;
      // a7: athrow
      // a8: istore 8
      // aa: iload 8
      // ac: iload 5
      // ae: ifne d8
      // b1: iload 7
      // b3: if_icmpeq fd
      // b6: goto bd
      // b9: invokestatic ell.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 1
      // be: aload 2
      // bf: aload 3
      // c0: getstatic ell._gw Lh76;
      // c3: iload 7
      // c5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c8: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // cd: bipush 2
      // ce: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // d1: goto d8
      // d4: invokestatic ell.a (Loov;)Loov;
      // d7: athrow
      // d8: pop
      // d9: aload 1
      // da: aconst_null
      // db: checkcast ha9
      // de: iload 7
      // e0: iload 5
      // e2: ifne f2
      // e5: ifeq f5
      // e8: goto ef
      // eb: invokestatic ell.a (Loov;)Loov;
      // ee: athrow
      // ef: sipush 1003
      // f2: goto f8
      // f5: sipush 1006
      // f8: aload 2
      // f9: bipush 0
      // fa: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // fd: return
   }

   @Override
   public akm mns(OpaquePredicate var1, mew var2, fqr var3, fqr var4) {
      this.c7i(var1, var2);
      return super.mns(var1, var2, var3, var4);
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      int var9 = OpaquePredicate.c();
      zfz var10 = this.l4i();

      label32: {
         try {
            if (var9 != 0) {
               break label32;
            }

            if (!var3.e30().pyt()) {
               return var10;
            }
         } catch (oov var12) {
            throw a(var12);
         }

         var10 = var10.zvi(qlr, var3).zvi(_gw, false);
      }

      zfz var10000;
      zb_ var10001;
      try {
         var10000 = var10;
         var10001 = xoa;
         if (var5 > 0.5F) {
            return var10.zvi(xoa, ell$bu8.f9s);
         }
      } catch (oov var11) {
         throw a(var11);
      }

      return var10000.zvi(var10001, ell$bu8.m2p);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 09: invokevirtual vt2$y0s.juw ()Z
      // 0c: iload 4
      // 0e: ifeq 36
      // 11: ifne 49
      // 14: goto 1b
      // 17: invokestatic ell.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: invokevirtual vt2.b4b ()Lvt2;
      // 21: invokevirtual mew.offset (Lvt2;)Lmew;
      // 24: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 27: invokeinterface zfz.r_y ()Le0x; 1
      // 2c: invokestatic ell.ov4 (Le0x;)Z
      // 2f: goto 36
      // 32: invokestatic ell.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 4
      // 38: ifeq 46
      // 3b: ifeq 49
      // 3e: goto 45
      // 41: invokestatic ell.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
   }

   public static vt2 heo(int var0) {
      try {
         switch (var0 & 3) {
            case 0:
               return vt2.z9q;
            case 1:
               return vt2.mxp;
            case 2:
               return vt2.te4;
            case 3:
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return vt2.zk4;
   }

   public static int k_8(vt2 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic ell$1.pda [I
      // 07: aload 0
      // 08: invokevirtual vt2.ordinal ()I
      // 0b: iaload
      // 0c: iload 1
      // 0d: ifne 3f
      // 10: tableswitch 46 1 4 36 42 44 46
      // 30: invokestatic ell.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic ell.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: ireturn
      // 3c: bipush 2
      // 3d: ireturn
      // 3e: bipush 3
      // 3f: ireturn
   }

   private static boolean ov4(e0x param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: getfield e0x.kgd Lp3y;
      // 0c: invokevirtual p3y.u4h ()Z
      // 0f: ifeq 32
      // 12: goto 19
      // 15: invokestatic ell.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual e0x.gck ()Z
      // 1d: iload 1
      // 1e: ifne 77
      // 21: goto 28
      // 24: invokestatic ell.a (Loov;)Loov;
      // 27: athrow
      // 28: ifne 76
      // 2b: goto 32
      // 2e: invokestatic ell.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: iload 1
      // 34: ifne 4c
      // 37: getstatic ox_.t7q Le0x;
      // 3a: if_acmpeq 76
      // 3d: goto 44
      // 40: invokestatic ell.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: goto 4c
      // 48: invokestatic ell.a (Loov;)Loov;
      // 4b: athrow
      // 4c: instanceof izd
      // 4f: iload 1
      // 50: ifne 77
      // 53: ifne 76
      // 56: goto 5d
      // 59: invokestatic ell.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: instanceof g7u
      // 61: iload 1
      // 62: ifne 77
      // 65: goto 6c
      // 68: invokestatic ell.a (Loov;)Loov;
      // 6b: athrow
      // 6c: ifeq 7a
      // 6f: goto 76
      // 72: invokestatic ell.a (Loov;)Loov;
      // 75: athrow
      // 76: bipush 1
      // 77: goto 7b
      // 7a: bipush 0
      // 7b: ireturn
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      int var10002;
      label34: {
         label33: {
            try {
               var10000 = this.l4i().zvi(qlr, heo(var1));
               var10001 = _gw;
               var10002 = var1 & 4;
               if (var2 != 0) {
                  break label34;
               }

               if (var10002 != 0) {
                  break label33;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10002 = 0;
            break label34;
         }

         var10002 = 1;
      }

      try {
         var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
         var6 = xoa;
         if ((var1 & 8) == 0) {
            return var10000.zvi(xoa, ell$bu8.m2p);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var6, ell$bu8.f9s);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.c();
      var3 |= k_8((vt2)var1.dil(qlr));
      int var2 = var10000;

      label25: {
         label24: {
            try {
               var6 = (Boolean)var1.dil(_gw);
               if (var2 != 0) {
                  break label25;
               }

               if (!var6) {
                  break label24;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var3 |= 4;
         }

         var6 = var1.dil(xoa);
      }

      if (var6 == ell$bu8.f9s) {
         var3 |= 8;
      }

      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{qlr, _gw, xoa});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2662145421722095219L, -2818753051332473705L, MethodHandles.lookup().lookupClass()).a(199302710589341L);
      // $VF: monitorexit
      long var10 = var10000 ^ 28496977663868L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "\u009auS\u0014½ÀÞ\u008a\bú\u001d\u0091\u0095]ÛØÂ\bô²\nÌâX\u001fP";
      int var7 = "\u009auS\u0014½ÀÞ\u008a\bú\u001d\u0091\u0095]ÛØÂ\bô²\nÌâX\u001fP".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            qlr = qx_.q0o(var8[2], vt2$unz.fzl);
            _gw = h76.d_1(var8[1]);
            xoa = zb_.pq4(var8[0], ell$bu8.class);
            return;
         }

         var4 = var5.charAt(var3);
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
