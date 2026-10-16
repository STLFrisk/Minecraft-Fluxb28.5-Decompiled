import java.awt.Color;
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
import org.lwjgl.opengl.GL11;

public class j3h extends ar7 {
   public static crk t7_;
   public static cn7 hft;
   public static cn7 lll;
   public static cn7 rnf;
   public static cn7 gc3;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public j3h() {
      long var1 = a ^ 74685688690143L;
      super(b<"d">(6362, 6473994123115182069L ^ var1), _aj.sxc, false, new j1s[0]);
   }

   @jev
   private void m88(idf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual idf.i1a ()Li2h;
      // 08: instanceof ha9
      // 0b: iload 2
      // 0c: ifne 2b
      // 0f: ifeq 3a
      // 12: goto 19
      // 15: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokevirtual idf.i1a ()Li2h;
      // 1e: checkcast ha9
      // 21: invokevirtual j3h.cfl (Lg_3;)Z
      // 24: goto 2b
      // 27: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: ifeq 3a
      // 2e: aload 1
      // 2f: bipush 1
      // 30: invokevirtual idf.wxi (Z)V
      // 33: goto 3a
      // 36: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: return
   }

   @jev(
      jn1 = 4
   )
   private void i65(b5k param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: pop
      // 006: getstatic j3h.ek1 Lc05;
      // 009: getfield c05.tij Lkh3;
      // 00c: ifnonnull 014
      // 00f: return
      // 010: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 013: athrow
      // 014: invokestatic uj3.o1c ()Ljava/util/List;
      // 017: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01c: astore 3
      // 01d: aload 3
      // 01e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 023: ifeq 10f
      // 026: aload 3
      // 027: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02c: checkcast ha9
      // 02f: astore 4
      // 031: aload 0
      // 032: aload 4
      // 034: invokevirtual j3h.cfl (Lg_3;)Z
      // 037: iload 2
      // 038: ifne 051
      // 03b: ifeq 10b
      // 03e: goto 045
      // 041: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: aload 4
      // 047: invokevirtual ha9.hzv ()Z
      // 04a: goto 051
      // 04d: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: ifeq 05e
      // 054: ldc2_w -0.25
      // 057: goto 05f
      // 05a: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: dconst_0
      // 05f: dstore 5
      // 061: aload 4
      // 063: getfield ha9.ivp D
      // 066: aload 4
      // 068: getfield ha9.o2v D
      // 06b: aload 4
      // 06d: getfield ha9.ivp D
      // 070: dsub
      // 071: getstatic j3h.ek1 Lc05;
      // 074: getfield c05.gze Laba;
      // 077: getfield aba.au3 F
      // 07a: f2d
      // 07b: dmul
      // 07c: dadd
      // 07d: aload 0
      // 07e: pop
      // 07f: getstatic j3h.ek1 Lc05;
      // 082: invokevirtual c05.ibs ()Lhr_;
      // 085: invokevirtual hr_.yky ()D
      // 088: dsub
      // 089: dstore 7
      // 08b: aload 4
      // 08d: getfield ha9.c54 D
      // 090: dload 5
      // 092: dadd
      // 093: aload 4
      // 095: getfield ha9.kfp D
      // 098: dload 5
      // 09a: dadd
      // 09b: aload 4
      // 09d: getfield ha9.c54 D
      // 0a0: dload 5
      // 0a2: dadd
      // 0a3: dsub
      // 0a4: getstatic j3h.ek1 Lc05;
      // 0a7: getfield c05.gze Laba;
      // 0aa: getfield aba.au3 F
      // 0ad: f2d
      // 0ae: dmul
      // 0af: dadd
      // 0b0: aload 0
      // 0b1: pop
      // 0b2: getstatic j3h.ek1 Lc05;
      // 0b5: invokevirtual c05.ibs ()Lhr_;
      // 0b8: invokevirtual hr_.fxk ()D
      // 0bb: dsub
      // 0bc: dstore 9
      // 0be: aload 4
      // 0c0: getfield ha9.e2b D
      // 0c3: aload 4
      // 0c5: getfield ha9.vbd D
      // 0c8: aload 4
      // 0ca: getfield ha9.e2b D
      // 0cd: dsub
      // 0ce: getstatic j3h.ek1 Lc05;
      // 0d1: getfield c05.gze Laba;
      // 0d4: getfield aba.au3 F
      // 0d7: f2d
      // 0d8: dmul
      // 0d9: dadd
      // 0da: aload 0
      // 0db: pop
      // 0dc: getstatic j3h.ek1 Lc05;
      // 0df: invokevirtual c05.ibs ()Lhr_;
      // 0e2: invokevirtual hr_.kux ()D
      // 0e5: dsub
      // 0e6: dstore 11
      // 0e8: getstatic j3h.ek1 Lc05;
      // 0eb: getfield c05.x0p Lv3i;
      // 0ee: getstatic j3h.ek1 Lc05;
      // 0f1: getfield c05.gze Laba;
      // 0f4: getfield aba.au3 F
      // 0f7: bipush 0
      // 0f8: invokevirtual v3i.i_6 (FI)V
      // 0fb: aload 0
      // 0fc: aload 4
      // 0fe: dload 7
      // 100: dload 9
      // 102: dload 11
      // 104: aload 1
      // 105: invokevirtual b5k._x5 ()F
      // 108: invokespecial j3h.odw (Lha9;DDDF)V
      // 10b: iload 2
      // 10c: ifeq 01d
      // 10f: return
   }

   public boolean cfl(g_3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: getstatic kgt.irb Lf5k;
      // 07: invokevirtual f5k.klu ()Z
      // 0a: iload 2
      // 0b: ifne 5a
      // 0e: ifeq 56
      // 11: goto 18
      // 14: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: getstatic kgt.irb Lf5k;
      // 1b: pop
      // 1c: getstatic f5k.pje Lcn7;
      // 1f: invokevirtual cn7.g7m ()Z
      // 22: iload 2
      // 23: ifne 5a
      // 26: goto 2d
      // 29: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: ifeq 56
      // 30: goto 37
      // 33: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 1
      // 38: instanceof ha9
      // 3b: iload 2
      // 3c: ifne 5a
      // 3f: goto 46
      // 42: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: ifeq 56
      // 49: goto 50
      // 4c: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: bipush 0
      // 51: ireturn
      // 52: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 1
      // 57: invokevirtual g_3.h5u ()Z
      // 5a: iload 2
      // 5b: ifne 90
      // 5e: ifeq 8c
      // 61: goto 68
      // 64: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: getstatic j3h.hft Lcn7;
      // 6b: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 6e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 71: iload 2
      // 72: ifne 90
      // 75: goto 7c
      // 78: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: ifne 8c
      // 7f: goto 86
      // 82: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: bipush 0
      // 87: ireturn
      // 88: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: aload 1
      // 8d: invokestatic ar9.uxl (Lg_3;)Z
      // 90: iload 2
      // 91: ifne c3
      // 94: ifne c2
      // 97: goto 9e
      // 9a: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: getstatic j3h.hft Lcn7;
      // a1: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // a4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // a7: iload 2
      // a8: ifne c3
      // ab: goto b2
      // ae: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b1: athrow
      // b2: ifne c2
      // b5: goto bc
      // b8: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bb: athrow
      // bc: bipush 0
      // bd: ireturn
      // be: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c1: athrow
      // c2: bipush 1
      // c3: ireturn
   }

   private int o2n(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: new java/awt/Color
      // 07: dup
      // 08: ldc 16777215
      // 0a: nop
      // 0b: invokespecial java/awt/Color.<init> (I)V
      // 0e: invokevirtual java/awt/Color.getRGB ()I
      // 11: istore 3
      // 12: getstatic zwr.qkk Lzwr;
      // 15: invokevirtual zwr.w34 ()Lf62;
      // 18: aload 1
      // 19: invokevirtual ha9.noc ()Ljava/lang/String;
      // 1c: invokevirtual f62.jzk (Ljava/lang/String;)Z
      // 1f: iload 2
      // 20: ifeq 39
      // 23: ifeq 35
      // 26: goto 2d
      // 29: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: ldc -11157267
      // 2f: nop
      // 30: ireturn
      // 31: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 1
      // 36: invokevirtual ha9.h5u ()Z
      // 39: iload 2
      // 3a: ifeq 4c
      // 3d: ifeq 4b
      // 40: goto 47
      // 43: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: ldc -1113785
      // 49: nop
      // 4a: istore 3
      // 4b: iload 3
      // 4c: ireturn
   }

   private double b5t(double var1, double var3, float var5) {
      return var1 + (var3 - var1) * (double)var5;
   }

   private void odw(ha9 var1, double var2, double var4, double var6, float var8) {
      double var10 = var4 + 0.7;
      i2h var12 = ek1.nsd();
      double var13 = var12.o2v;
      double var15 = var12.kfp;
      double var17 = var12.vbd;
      int var10000 = t9d.b();
      var12.o2v = this.b5t(var12.bc1, var12.o2v, var8);
      var12.kfp = this.b5t(var12.o_z, var12.kfp, var8);
      var12.vbd = this.b5t(var12.a4d, var12.vbd, var8);
      double var19 = var12.qww(var2 + ek1.ibs()._3y, var4 + ek1.ibs().b7y, var6 + ek1.ibs().xdg);
      int var9 = var10000;
      float var21 = jsr.yk7.ax2(zwr.qkk.zr7().wu0(var1.noc()) + this.sgf(var1)) / 2.0F;
      double var22 = (double)(0.004F * t7_.d7c()) * var19;

      label75: {
         label70: {
            label69: {
               try {
                  double var33;
                  var10000 = (var33 = var22 - 0.01) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
                  if (var9 == 0) {
                     break label70;
                  }

                  if (var10000 >= 0) {
                     break label69;
                  }
               } catch (oov var29) {
                  throw b(var29);
               }

               var22 = 0.01;
            }

            try {
               hzu.dp2();
               hzu.ktr();
               hzu.fex(1.0F, -1500000.0F);
               hzu.fpt();
               hzu.a4k((float)var2, (float)var10 + 1.4F, (float)var6);
               var31 = -ek1.ibs().s7e;
               if (var9 == 0) {
                  break label75;
               }

               hzu.a2h(var31, 0.0F, 1.0F, 0.0F);
               var10000 = ek1.oxn.i_y;
            } catch (oov var28) {
               throw b(var28);
            }
         }

         try {
            if (var10000 == 2) {
               var31 = -1.0F;
               break label75;
            }
         } catch (oov var27) {
            throw b(var27);
         }

         var31 = 1.0F;
      }

      float var24 = var31;

      float var10001;
      float var10002;
      float var10003;
      float var10004;
      Color var10005;
      Color var10006;
      short var10007;
      label50: {
         try {
            hzu.a2h(ek1.ibs().fw9, var24, 0.0F, 0.0F);
            hzu.bvy(-var22, -var22, var22);
            var32 = -var21 - 2.0F;
            var10001 = -(jsr.yk7.jek + 3.0F);
            var10002 = var21 + 2.0F;
            var10003 = 2.0F;
            var10004 = (float)var22;
            var10005 = new Color;
            var10006 = var10005;
            if (frs.b0y(var1)) {
               var10007 = 255;
               break label50;
            }
         } catch (oov var26) {
            throw b(var26);
         }

         var10007 = 25;
      }

      var10006./* $VF: Unable to resugar constructor */<init>(var10007, 25, 25, 160);
      iyr.hsj(var32, var10001, var10002, var10003, var10004, var10005.getRGB(), new Color(0, 0, 0, 180).getRGB());
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDepthMask(false);
      jsr.yk7.ayi(this.sgf(var1), -var21, -jsr.yk7.jek, this.o2n(var1));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDepthMask(true);
      if (var9 != 0) {
         try {
            if (gc3.d7c()) {
               this.ym_(var1);
               hzu.ux6();
               hzu.if9();
            }
         } catch (oov var25) {
            throw b(var25);
         }

         hzu.fpt();
         var12.o2v = var13;
         var12.kfp = var15;
         var12.vbd = var17;
         hzu.fex(1.0F, 1500000.0F);
         hzu.q6d();
         hzu.x3w();
      }
   }

   private void ym_(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 3
      // 002: invokestatic t9d.b ()I
      // 005: bipush 3
      // 006: istore 4
      // 008: istore 2
      // 009: iload 4
      // 00b: iflt 03f
      // 00e: aload 1
      // 00f: getfield ha9.up_ Ljnq;
      // 012: getfield jnq._dn [Lerg;
      // 015: iload 4
      // 017: aaload
      // 018: astore 5
      // 01a: iload 2
      // 01b: ifeq 03b
      // 01e: aload 5
      // 020: iload 2
      // 021: ifeq 043
      // 024: goto 02b
      // 027: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: ifnull 038
      // 02e: goto 035
      // 031: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: iinc 3 -8
      // 038: iinc 4 -1
      // 03b: iload 2
      // 03c: ifne 009
      // 03f: aload 1
      // 040: invokevirtual ha9.b5z ()Lerg;
      // 043: iload 2
      // 044: ifeq 062
      // 047: ifnull 0ca
      // 04a: goto 051
      // 04d: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: iinc 3 -8
      // 054: aload 1
      // 055: invokevirtual ha9.b5z ()Lerg;
      // 058: invokevirtual erg.yaq ()Lerg;
      // 05b: goto 062
      // 05e: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: astore 6
      // 064: iload 2
      // 065: ifeq 0c7
      // 068: aload 6
      // 06a: invokevirtual erg._xr ()Z
      // 06d: ifeq 0be
      // 070: goto 077
      // 073: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: aload 6
      // 079: iload 2
      // 07a: ifeq 0ba
      // 07d: goto 084
      // 080: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: invokevirtual erg.gn1 ()Lu7m;
      // 087: instanceof arf
      // 08a: ifne 0b1
      // 08d: goto 094
      // 090: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: aload 6
      // 096: iload 2
      // 097: ifeq 0ba
      // 09a: goto 0a1
      // 09d: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: invokevirtual erg.gn1 ()Lu7m;
      // 0a4: instanceof jpt
      // 0a7: ifeq 0be
      // 0aa: goto 0b1
      // 0ad: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 6
      // 0b3: goto 0ba
      // 0b6: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: putfield erg.qd2 I
      // 0be: aload 0
      // 0bf: aload 6
      // 0c1: iload 3
      // 0c2: bipush -26
      // 0c4: invokespecial j3h.bun (Lerg;II)V
      // 0c7: iinc 3 16
      // 0ca: bipush 3
      // 0cb: istore 4
      // 0cd: iload 4
      // 0cf: iflt 162
      // 0d2: aload 1
      // 0d3: getfield ha9.up_ Ljnq;
      // 0d6: getfield jnq._dn [Lerg;
      // 0d9: iload 4
      // 0db: aaload
      // 0dc: astore 5
      // 0de: iload 2
      // 0df: ifeq 15e
      // 0e2: aload 5
      // 0e4: ifnull 15b
      // 0e7: goto 0ee
      // 0ea: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: aload 5
      // 0f0: invokevirtual erg.yaq ()Lerg;
      // 0f3: astore 6
      // 0f5: iload 2
      // 0f6: ifeq 158
      // 0f9: aload 6
      // 0fb: invokevirtual erg._xr ()Z
      // 0fe: ifeq 14f
      // 101: goto 108
      // 104: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 6
      // 10a: iload 2
      // 10b: ifeq 14b
      // 10e: goto 115
      // 111: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: invokevirtual erg.gn1 ()Lu7m;
      // 118: instanceof arf
      // 11b: ifne 142
      // 11e: goto 125
      // 121: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: aload 6
      // 127: iload 2
      // 128: ifeq 14b
      // 12b: goto 132
      // 12e: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: invokevirtual erg.gn1 ()Lu7m;
      // 135: instanceof jpt
      // 138: ifeq 14f
      // 13b: goto 142
      // 13e: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: aload 6
      // 144: goto 14b
      // 147: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: bipush 1
      // 14c: putfield erg.qd2 I
      // 14f: aload 0
      // 150: aload 6
      // 152: iload 3
      // 153: bipush -26
      // 155: invokespecial j3h.bun (Lerg;II)V
      // 158: iinc 3 16
      // 15b: iinc 4 -1
      // 15e: iload 2
      // 15f: ifne 0cd
      // 162: return
   }

   private void bun(erg var1, int var2, int var3) {
      hzu.dp2();
      hzu.vtj();
      ek1.jiu().b3l = -150.0F;
      hzu.o1b();
      ek1.jiu().px5(var1, var2, var3);
      ek1.jiu().jrm(ek1.tx1, var1, var2, var3);
      hzu.gp4();
      ek1.jiu().b3l = 0.0F;
      hzu.ux6();
      hzu.syc(0.5F, 0.5F, 0.5F);
      hzu._o4();
      hzu.fpt();
      this.bhp(var1, var2, var3);
      hzu.s7q();
      hzu.m45();
      hzu.syc(2.0F, 2.0F, 2.0F);
      hzu.if9();
      hzu.x3w();
   }

   private void bhp(erg param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j3h.a J
      // 003: ldc2_w 127964341527529
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.c ()I
      // 00c: istore 6
      // 00e: iload 3
      // 00f: bipush 24
      // 011: isub
      // 012: istore 7
      // 014: new java/awt/Color
      // 017: dup
      // 018: ldc 16777215
      // 01a: nop
      // 01b: invokespecial java/awt/Color.<init> (I)V
      // 01e: invokevirtual java/awt/Color.getRGB ()I
      // 021: istore 8
      // 023: aload 1
      // 024: invokevirtual erg.gn1 ()Lu7m;
      // 027: instanceof jpt
      // 02a: iload 6
      // 02c: ifne 2b3
      // 02f: ifeq 2ac
      // 032: goto 039
      // 035: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: getstatic vef.o55 Lvef;
      // 03c: getfield vef.bbf I
      // 03f: aload 1
      // 040: invokestatic hc0.qa_ (ILerg;)I
      // 043: istore 9
      // 045: getstatic vef.brx Lvef;
      // 048: getfield vef.bbf I
      // 04b: aload 1
      // 04c: invokestatic hc0.qa_ (ILerg;)I
      // 04f: istore 10
      // 051: getstatic vef.dru Lvef;
      // 054: getfield vef.bbf I
      // 057: aload 1
      // 058: invokestatic hc0.qa_ (ILerg;)I
      // 05b: istore 11
      // 05d: getstatic vef.qt1 Lvef;
      // 060: getfield vef.bbf I
      // 063: aload 1
      // 064: invokestatic hc0.qa_ (ILerg;)I
      // 067: istore 12
      // 069: getstatic vef.pm0 Lvef;
      // 06c: getfield vef.bbf I
      // 06f: aload 1
      // 070: invokestatic hc0.qa_ (ILerg;)I
      // 073: istore 13
      // 075: getstatic vef.tkb Lvef;
      // 078: getfield vef.bbf I
      // 07b: aload 1
      // 07c: invokestatic hc0.qa_ (ILerg;)I
      // 07f: istore 14
      // 081: getstatic vef._jm Lvef;
      // 084: getfield vef.bbf I
      // 087: aload 1
      // 088: invokestatic hc0.qa_ (ILerg;)I
      // 08b: istore 15
      // 08d: iload 9
      // 08f: iload 6
      // 091: ifne 0e0
      // 094: ifle 0de
      // 097: goto 09e
      // 09a: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 0
      // 09f: pop
      // 0a0: getstatic j3h.ek1 Lc05;
      // 0a3: getfield c05.tx1 Lowt;
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: sipush 1398
      // 0b0: ldc2_w 8171279457663810657
      // 0b3: lload 4
      // 0b5: lxor
      // 0b6: invokedynamic d (IJ)Ljava/lang/String; bsm=j3h.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: iload 9
      // 0c1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c7: iload 2
      // 0c8: bipush 2
      // 0c9: imul
      // 0ca: i2f
      // 0cb: iload 7
      // 0cd: i2f
      // 0ce: iload 8
      // 0d0: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 0d3: pop
      // 0d4: iinc 7 8
      // 0d7: goto 0de
      // 0da: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: iload 15
      // 0e0: iload 6
      // 0e2: ifne 12d
      // 0e5: ifle 12b
      // 0e8: goto 0ef
      // 0eb: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: pop
      // 0f1: getstatic j3h.ek1 Lc05;
      // 0f4: getfield c05.tx1 Lowt;
      // 0f7: new java/lang/StringBuilder
      // 0fa: dup
      // 0fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fe: getstatic vef._jm Lvef;
      // 101: invokevirtual vef.d8j ()Ljava/lang/String;
      // 104: bipush 0
      // 105: bipush 3
      // 106: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10c: iload 15
      // 10e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 111: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 114: iload 2
      // 115: bipush 2
      // 116: imul
      // 117: i2f
      // 118: iload 7
      // 11a: i2f
      // 11b: iload 8
      // 11d: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 120: pop
      // 121: iinc 7 8
      // 124: goto 12b
      // 127: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: iload 10
      // 12d: iload 6
      // 12f: ifne 17a
      // 132: ifle 178
      // 135: goto 13c
      // 138: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: aload 0
      // 13d: pop
      // 13e: getstatic j3h.ek1 Lc05;
      // 141: getfield c05.tx1 Lowt;
      // 144: new java/lang/StringBuilder
      // 147: dup
      // 148: invokespecial java/lang/StringBuilder.<init> ()V
      // 14b: getstatic vef.brx Lvef;
      // 14e: invokevirtual vef.d8j ()Ljava/lang/String;
      // 151: bipush 0
      // 152: bipush 3
      // 153: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: iload 10
      // 15b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 15e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 161: iload 2
      // 162: bipush 2
      // 163: imul
      // 164: i2f
      // 165: iload 7
      // 167: i2f
      // 168: iload 8
      // 16a: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 16d: pop
      // 16e: iinc 7 8
      // 171: goto 178
      // 174: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: iload 11
      // 17a: iload 6
      // 17c: ifne 1c7
      // 17f: ifle 1c5
      // 182: goto 189
      // 185: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: aload 0
      // 18a: pop
      // 18b: getstatic j3h.ek1 Lc05;
      // 18e: getfield c05.tx1 Lowt;
      // 191: new java/lang/StringBuilder
      // 194: dup
      // 195: invokespecial java/lang/StringBuilder.<init> ()V
      // 198: getstatic vef.dru Lvef;
      // 19b: invokevirtual vef.d8j ()Ljava/lang/String;
      // 19e: bipush 0
      // 19f: bipush 3
      // 1a0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a6: iload 11
      // 1a8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ae: iload 2
      // 1af: bipush 2
      // 1b0: imul
      // 1b1: i2f
      // 1b2: iload 7
      // 1b4: i2f
      // 1b5: iload 8
      // 1b7: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 1ba: pop
      // 1bb: iinc 7 8
      // 1be: goto 1c5
      // 1c1: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c4: athrow
      // 1c5: iload 12
      // 1c7: iload 6
      // 1c9: ifne 214
      // 1cc: ifle 212
      // 1cf: goto 1d6
      // 1d2: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: pop
      // 1d8: getstatic j3h.ek1 Lc05;
      // 1db: getfield c05.tx1 Lowt;
      // 1de: new java/lang/StringBuilder
      // 1e1: dup
      // 1e2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e5: getstatic vef.zbl Lvef;
      // 1e8: invokevirtual vef.d8j ()Ljava/lang/String;
      // 1eb: bipush 0
      // 1ec: bipush 3
      // 1ed: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f3: iload 12
      // 1f5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fb: iload 2
      // 1fc: bipush 2
      // 1fd: imul
      // 1fe: i2f
      // 1ff: iload 7
      // 201: i2f
      // 202: iload 8
      // 204: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 207: pop
      // 208: iinc 7 8
      // 20b: goto 212
      // 20e: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 211: athrow
      // 212: iload 13
      // 214: iload 6
      // 216: ifne 261
      // 219: ifle 25f
      // 21c: goto 223
      // 21f: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: aload 0
      // 224: pop
      // 225: getstatic j3h.ek1 Lc05;
      // 228: getfield c05.tx1 Lowt;
      // 22b: new java/lang/StringBuilder
      // 22e: dup
      // 22f: invokespecial java/lang/StringBuilder.<init> ()V
      // 232: getstatic vef.pm0 Lvef;
      // 235: invokevirtual vef.d8j ()Ljava/lang/String;
      // 238: bipush 0
      // 239: bipush 3
      // 23a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 23d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 240: iload 13
      // 242: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 245: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 248: iload 2
      // 249: bipush 2
      // 24a: imul
      // 24b: i2f
      // 24c: iload 7
      // 24e: i2f
      // 24f: iload 8
      // 251: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 254: pop
      // 255: iinc 7 8
      // 258: goto 25f
      // 25b: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25e: athrow
      // 25f: iload 14
      // 261: iload 6
      // 263: ifne 2b3
      // 266: ifle 2ac
      // 269: goto 270
      // 26c: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: aload 0
      // 271: pop
      // 272: getstatic j3h.ek1 Lc05;
      // 275: getfield c05.tx1 Lowt;
      // 278: new java/lang/StringBuilder
      // 27b: dup
      // 27c: invokespecial java/lang/StringBuilder.<init> ()V
      // 27f: getstatic vef.tkb Lvef;
      // 282: invokevirtual vef.d8j ()Ljava/lang/String;
      // 285: bipush 0
      // 286: bipush 3
      // 287: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 28a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28d: iload 14
      // 28f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 292: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 295: iload 2
      // 296: bipush 2
      // 297: imul
      // 298: i2f
      // 299: iload 7
      // 29b: i2f
      // 29c: iload 8
      // 29e: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 2a1: pop
      // 2a2: iinc 7 8
      // 2a5: goto 2ac
      // 2a8: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ab: athrow
      // 2ac: aload 1
      // 2ad: invokevirtual erg.gn1 ()Lu7m;
      // 2b0: instanceof r5m
      // 2b3: iload 6
      // 2b5: ifne 3d4
      // 2b8: ifeq 3cd
      // 2bb: goto 2c2
      // 2be: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: getstatic vef.s61 Lvef;
      // 2c5: getfield vef.bbf I
      // 2c8: aload 1
      // 2c9: invokestatic hc0.qa_ (ILerg;)I
      // 2cc: istore 9
      // 2ce: getstatic vef.t24 Lvef;
      // 2d1: getfield vef.bbf I
      // 2d4: aload 1
      // 2d5: invokestatic hc0.qa_ (ILerg;)I
      // 2d8: istore 10
      // 2da: getstatic vef.pxu Lvef;
      // 2dd: getfield vef.bbf I
      // 2e0: aload 1
      // 2e1: invokestatic hc0.qa_ (ILerg;)I
      // 2e4: istore 11
      // 2e6: iload 9
      // 2e8: iload 6
      // 2ea: ifne 335
      // 2ed: ifle 333
      // 2f0: goto 2f7
      // 2f3: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f6: athrow
      // 2f7: aload 0
      // 2f8: pop
      // 2f9: getstatic j3h.ek1 Lc05;
      // 2fc: getfield c05.tx1 Lowt;
      // 2ff: new java/lang/StringBuilder
      // 302: dup
      // 303: invokespecial java/lang/StringBuilder.<init> ()V
      // 306: getstatic vef.s61 Lvef;
      // 309: invokevirtual vef.d8j ()Ljava/lang/String;
      // 30c: bipush 0
      // 30d: bipush 3
      // 30e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 311: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 314: iload 9
      // 316: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 319: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 31c: iload 2
      // 31d: bipush 2
      // 31e: imul
      // 31f: i2f
      // 320: iload 7
      // 322: i2f
      // 323: iload 8
      // 325: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 328: pop
      // 329: iinc 7 8
      // 32c: goto 333
      // 32f: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 332: athrow
      // 333: iload 10
      // 335: iload 6
      // 337: ifne 382
      // 33a: ifle 380
      // 33d: goto 344
      // 340: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: aload 0
      // 345: pop
      // 346: getstatic j3h.ek1 Lc05;
      // 349: getfield c05.tx1 Lowt;
      // 34c: new java/lang/StringBuilder
      // 34f: dup
      // 350: invokespecial java/lang/StringBuilder.<init> ()V
      // 353: getstatic vef.t24 Lvef;
      // 356: invokevirtual vef.d8j ()Ljava/lang/String;
      // 359: bipush 0
      // 35a: bipush 3
      // 35b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 35e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 361: iload 10
      // 363: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 366: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 369: iload 2
      // 36a: bipush 2
      // 36b: imul
      // 36c: i2f
      // 36d: iload 7
      // 36f: i2f
      // 370: iload 8
      // 372: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 375: pop
      // 376: iinc 7 8
      // 379: goto 380
      // 37c: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37f: athrow
      // 380: iload 11
      // 382: iload 6
      // 384: ifne 3d4
      // 387: ifle 3cd
      // 38a: goto 391
      // 38d: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 390: athrow
      // 391: aload 0
      // 392: pop
      // 393: getstatic j3h.ek1 Lc05;
      // 396: getfield c05.tx1 Lowt;
      // 399: new java/lang/StringBuilder
      // 39c: dup
      // 39d: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a0: getstatic vef.pxu Lvef;
      // 3a3: invokevirtual vef.d8j ()Ljava/lang/String;
      // 3a6: bipush 0
      // 3a7: bipush 3
      // 3a8: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ae: iload 11
      // 3b0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b6: iload 2
      // 3b7: bipush 2
      // 3b8: imul
      // 3b9: i2f
      // 3ba: iload 7
      // 3bc: i2f
      // 3bd: iload 8
      // 3bf: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 3c2: pop
      // 3c3: iinc 7 8
      // 3c6: goto 3cd
      // 3c9: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cc: athrow
      // 3cd: aload 1
      // 3ce: invokevirtual erg.gn1 ()Lu7m;
      // 3d1: instanceof f5h
      // 3d4: iload 6
      // 3d6: ifne 49c
      // 3d9: ifeq 495
      // 3dc: goto 3e3
      // 3df: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e2: athrow
      // 3e3: getstatic vef.y_g Lvef;
      // 3e6: getfield vef.bbf I
      // 3e9: aload 1
      // 3ea: invokestatic hc0.qa_ (ILerg;)I
      // 3ed: istore 9
      // 3ef: getstatic vef.xl7 Lvef;
      // 3f2: getfield vef.bbf I
      // 3f5: aload 1
      // 3f6: invokestatic hc0.qa_ (ILerg;)I
      // 3f9: istore 10
      // 3fb: iload 9
      // 3fd: iload 6
      // 3ff: ifne 44a
      // 402: ifle 448
      // 405: goto 40c
      // 408: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40b: athrow
      // 40c: aload 0
      // 40d: pop
      // 40e: getstatic j3h.ek1 Lc05;
      // 411: getfield c05.tx1 Lowt;
      // 414: new java/lang/StringBuilder
      // 417: dup
      // 418: invokespecial java/lang/StringBuilder.<init> ()V
      // 41b: getstatic vef.y_g Lvef;
      // 41e: invokevirtual vef.d8j ()Ljava/lang/String;
      // 421: bipush 0
      // 422: bipush 3
      // 423: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 426: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 429: iload 9
      // 42b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 42e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 431: iload 2
      // 432: bipush 2
      // 433: imul
      // 434: i2f
      // 435: iload 7
      // 437: i2f
      // 438: iload 8
      // 43a: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 43d: pop
      // 43e: iinc 7 8
      // 441: goto 448
      // 444: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 447: athrow
      // 448: iload 10
      // 44a: iload 6
      // 44c: ifne 49c
      // 44f: ifle 495
      // 452: goto 459
      // 455: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 458: athrow
      // 459: aload 0
      // 45a: pop
      // 45b: getstatic j3h.ek1 Lc05;
      // 45e: getfield c05.tx1 Lowt;
      // 461: new java/lang/StringBuilder
      // 464: dup
      // 465: invokespecial java/lang/StringBuilder.<init> ()V
      // 468: getstatic vef.xl7 Lvef;
      // 46b: invokevirtual vef.d8j ()Ljava/lang/String;
      // 46e: bipush 0
      // 46f: bipush 3
      // 470: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 473: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 476: iload 10
      // 478: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 47b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 47e: iload 2
      // 47f: bipush 2
      // 480: imul
      // 481: i2f
      // 482: iload 7
      // 484: i2f
      // 485: iload 8
      // 487: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 48a: pop
      // 48b: iinc 7 8
      // 48e: goto 495
      // 491: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 494: athrow
      // 495: aload 1
      // 496: invokevirtual erg.gn1 ()Lu7m;
      // 499: instanceof dlj
      // 49c: iload 6
      // 49e: ifne 5bd
      // 4a1: ifeq 5b6
      // 4a4: goto 4ab
      // 4a7: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4aa: athrow
      // 4ab: getstatic vef.m3n Lvef;
      // 4ae: getfield vef.bbf I
      // 4b1: aload 1
      // 4b2: invokestatic hc0.qa_ (ILerg;)I
      // 4b5: istore 9
      // 4b7: getstatic vef.zbl Lvef;
      // 4ba: getfield vef.bbf I
      // 4bd: aload 1
      // 4be: invokestatic hc0.qa_ (ILerg;)I
      // 4c1: istore 10
      // 4c3: getstatic vef.y_g Lvef;
      // 4c6: getfield vef.bbf I
      // 4c9: aload 1
      // 4ca: invokestatic hc0.qa_ (ILerg;)I
      // 4cd: istore 11
      // 4cf: iload 9
      // 4d1: iload 6
      // 4d3: ifne 51e
      // 4d6: ifle 51c
      // 4d9: goto 4e0
      // 4dc: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4df: athrow
      // 4e0: aload 0
      // 4e1: pop
      // 4e2: getstatic j3h.ek1 Lc05;
      // 4e5: getfield c05.tx1 Lowt;
      // 4e8: new java/lang/StringBuilder
      // 4eb: dup
      // 4ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 4ef: getstatic vef.m3n Lvef;
      // 4f2: invokevirtual vef.d8j ()Ljava/lang/String;
      // 4f5: bipush 0
      // 4f6: bipush 3
      // 4f7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 4fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4fd: iload 9
      // 4ff: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 502: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 505: iload 2
      // 506: bipush 2
      // 507: imul
      // 508: i2f
      // 509: iload 7
      // 50b: i2f
      // 50c: iload 8
      // 50e: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 511: pop
      // 512: iinc 7 8
      // 515: goto 51c
      // 518: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51b: athrow
      // 51c: iload 10
      // 51e: iload 6
      // 520: ifne 56b
      // 523: ifle 569
      // 526: goto 52d
      // 529: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52c: athrow
      // 52d: aload 0
      // 52e: pop
      // 52f: getstatic j3h.ek1 Lc05;
      // 532: getfield c05.tx1 Lowt;
      // 535: new java/lang/StringBuilder
      // 538: dup
      // 539: invokespecial java/lang/StringBuilder.<init> ()V
      // 53c: getstatic vef.zbl Lvef;
      // 53f: invokevirtual vef.d8j ()Ljava/lang/String;
      // 542: bipush 0
      // 543: bipush 3
      // 544: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 547: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54a: iload 10
      // 54c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 54f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 552: iload 2
      // 553: bipush 2
      // 554: imul
      // 555: i2f
      // 556: iload 7
      // 558: i2f
      // 559: iload 8
      // 55b: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 55e: pop
      // 55f: iinc 7 8
      // 562: goto 569
      // 565: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 568: athrow
      // 569: iload 11
      // 56b: iload 6
      // 56d: ifne 5bd
      // 570: ifle 5b6
      // 573: goto 57a
      // 576: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 579: athrow
      // 57a: aload 0
      // 57b: pop
      // 57c: getstatic j3h.ek1 Lc05;
      // 57f: getfield c05.tx1 Lowt;
      // 582: new java/lang/StringBuilder
      // 585: dup
      // 586: invokespecial java/lang/StringBuilder.<init> ()V
      // 589: getstatic vef.y_g Lvef;
      // 58c: invokevirtual vef.d8j ()Ljava/lang/String;
      // 58f: bipush 0
      // 590: bipush 3
      // 591: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 594: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 597: iload 11
      // 599: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 59c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 59f: iload 2
      // 5a0: bipush 2
      // 5a1: imul
      // 5a2: i2f
      // 5a3: iload 7
      // 5a5: i2f
      // 5a6: iload 8
      // 5a8: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 5ab: pop
      // 5ac: iinc 7 8
      // 5af: goto 5b6
      // 5b2: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b5: athrow
      // 5b6: aload 1
      // 5b7: invokevirtual erg.gn1 ()Lu7m;
      // 5ba: instanceof za6
      // 5bd: iload 6
      // 5bf: ifne 5dd
      // 5c2: ifeq 6e2
      // 5c5: goto 5cc
      // 5c8: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cb: athrow
      // 5cc: getstatic vef.m3n Lvef;
      // 5cf: getfield vef.bbf I
      // 5d2: aload 1
      // 5d3: invokestatic hc0.qa_ (ILerg;)I
      // 5d6: goto 5dd
      // 5d9: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5dc: athrow
      // 5dd: istore 9
      // 5df: getstatic vef.uqc Lvef;
      // 5e2: getfield vef.bbf I
      // 5e5: aload 1
      // 5e6: invokestatic hc0.qa_ (ILerg;)I
      // 5e9: istore 10
      // 5eb: getstatic vef.zbl Lvef;
      // 5ee: getfield vef.bbf I
      // 5f1: aload 1
      // 5f2: invokestatic hc0.qa_ (ILerg;)I
      // 5f5: istore 11
      // 5f7: iload 9
      // 5f9: iload 6
      // 5fb: ifne 64a
      // 5fe: ifle 648
      // 601: goto 608
      // 604: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 607: athrow
      // 608: aload 0
      // 609: pop
      // 60a: getstatic j3h.ek1 Lc05;
      // 60d: getfield c05.tx1 Lowt;
      // 610: new java/lang/StringBuilder
      // 613: dup
      // 614: invokespecial java/lang/StringBuilder.<init> ()V
      // 617: sipush 20957
      // 61a: ldc2_w 7657096573040109773
      // 61d: lload 4
      // 61f: lxor
      // 620: invokedynamic d (IJ)Ljava/lang/String; bsm=j3h.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 625: nop
      // 626: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 629: iload 9
      // 62b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 62e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 631: iload 2
      // 632: bipush 2
      // 633: imul
      // 634: i2f
      // 635: iload 7
      // 637: i2f
      // 638: iload 8
      // 63a: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 63d: pop
      // 63e: iinc 7 8
      // 641: goto 648
      // 644: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 647: athrow
      // 648: iload 10
      // 64a: iload 6
      // 64c: ifne 697
      // 64f: ifle 695
      // 652: goto 659
      // 655: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 658: athrow
      // 659: aload 0
      // 65a: pop
      // 65b: getstatic j3h.ek1 Lc05;
      // 65e: getfield c05.tx1 Lowt;
      // 661: new java/lang/StringBuilder
      // 664: dup
      // 665: invokespecial java/lang/StringBuilder.<init> ()V
      // 668: getstatic vef.uqc Lvef;
      // 66b: invokevirtual vef.d8j ()Ljava/lang/String;
      // 66e: bipush 0
      // 66f: bipush 3
      // 670: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 673: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 676: iload 10
      // 678: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 67b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 67e: iload 2
      // 67f: bipush 2
      // 680: imul
      // 681: i2f
      // 682: iload 7
      // 684: i2f
      // 685: iload 8
      // 687: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 68a: pop
      // 68b: iinc 7 8
      // 68e: goto 695
      // 691: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 694: athrow
      // 695: iload 11
      // 697: iload 6
      // 699: ifne 6de
      // 69c: ifle 6e2
      // 69f: goto 6a6
      // 6a2: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a5: athrow
      // 6a6: aload 0
      // 6a7: pop
      // 6a8: getstatic j3h.ek1 Lc05;
      // 6ab: getfield c05.tx1 Lowt;
      // 6ae: new java/lang/StringBuilder
      // 6b1: dup
      // 6b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 6b5: getstatic vef.zbl Lvef;
      // 6b8: invokevirtual vef.d8j ()Ljava/lang/String;
      // 6bb: bipush 0
      // 6bc: bipush 3
      // 6bd: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 6c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c3: iload 11
      // 6c5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6cb: iload 2
      // 6cc: bipush 2
      // 6cd: imul
      // 6ce: i2f
      // 6cf: iload 7
      // 6d1: i2f
      // 6d2: iload 8
      // 6d4: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 6d7: goto 6de
      // 6da: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6dd: athrow
      // 6de: pop
      // 6df: iinc 7 8
      // 6e2: goto 6ec
      // 6e5: astore 7
      // 6e7: aload 7
      // 6e9: invokevirtual java/lang/Exception.printStackTrace ()V
      // 6ec: return
   }

   private String sgf(g_3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j3h.a J
      // 003: ldc2_w 31431193495417
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual g_3.xyw ()Lekw;
      // 011: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 016: astore 5
      // 018: getstatic zwr.qkk Lzwr;
      // 01b: invokevirtual zwr.w34 ()Lf62;
      // 01e: aload 1
      // 01f: invokevirtual g_3.noc ()Ljava/lang/String;
      // 022: invokevirtual f62.jzk (Ljava/lang/String;)Z
      // 025: ifeq 04f
      // 028: aload 5
      // 02a: aload 1
      // 02b: invokevirtual g_3.xyw ()Lekw;
      // 02e: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 033: new java/lang/StringBuilder
      // 036: dup
      // 037: invokespecial java/lang/StringBuilder.<init> ()V
      // 03a: getstatic syo.c8f Lsyo;
      // 03d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 040: aload 1
      // 041: invokevirtual g_3.noc ()Ljava/lang/String;
      // 044: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 047: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04a: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 04d: astore 5
      // 04f: aload 1
      // 050: invokevirtual g_3.i55 ()F
      // 053: f2d
      // 054: ldc2_w 2.0
      // 057: ddiv
      // 058: bipush 2
      // 059: invokestatic rak.meb (DI)D
      // 05c: dstore 7
      // 05e: dload 7
      // 060: ldc2_w 6.0
      // 063: dcmpl
      // 064: iload 4
      // 066: ifne 08a
      // 069: iflt 07d
      // 06c: goto 073
      // 06f: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: getstatic syo.qjc Lsyo;
      // 076: astore 6
      // 078: iload 4
      // 07a: ifeq 09c
      // 07d: dload 7
      // 07f: ldc2_w 2.0
      // 082: dcmpl
      // 083: goto 08a
      // 086: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: iflt 097
      // 08d: getstatic syo.iyk Lsyo;
      // 090: astore 6
      // 092: iload 4
      // 094: ifeq 09c
      // 097: getstatic syo.aez Lsyo;
      // 09a: astore 6
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: getstatic j3h.rnf Lcn7;
      // 0a6: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0a9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ac: ifeq 0ed
      // 0af: new java/lang/StringBuilder
      // 0b2: dup
      // 0b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b6: getstatic syo.qiz Lsyo;
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bc: ldc "["
      // 0be: nop
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: aload 1
      // 0c3: aload 0
      // 0c4: pop
      // 0c5: getstatic j3h.ek1 Lc05;
      // 0c8: getfield c05.vg8 Ll86;
      // 0cb: invokevirtual g_3.tm6 (Li2h;)F
      // 0ce: f2i
      // 0cf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d2: sipush 15208
      // 0d5: ldc2_w 4547893939068905195
      // 0d8: lload 2
      // 0d9: lxor
      // 0da: invokedynamic d (IJ)Ljava/lang/String; bsm=j3h.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e6: goto 0f0
      // 0e9: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: ldc ""
      // 0ef: nop
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: getstatic syo.w29 Lsyo;
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0f9: getstatic zwr.qkk Lzwr;
      // 0fc: invokevirtual zwr.zr7 ()Laz4;
      // 0ff: aload 1
      // 100: invokevirtual g_3.noc ()Ljava/lang/String;
      // 103: invokevirtual az4.wu0 (Ljava/lang/String;)Ljava/lang/String;
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: aload 5
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: ldc " "
      // 110: nop
      // 111: iload 4
      // 113: ifne 14f
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: getstatic j3h.lll Lcn7;
      // 11c: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 11f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 122: ifeq 14d
      // 125: goto 12c
      // 128: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: new java/lang/StringBuilder
      // 12f: dup
      // 130: invokespecial java/lang/StringBuilder.<init> ()V
      // 133: ldc ""
      // 135: nop
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: aload 6
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13e: dload 7
      // 140: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: goto 150
      // 149: invokestatic j3h.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: ldc ""
      // 14f: nop
      // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 153: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 156: astore 5
      // 158: new s60
      // 15b: dup
      // 15c: aload 5
      // 15e: invokespecial s60.<init> (Ljava/lang/String;)V
      // 161: astore 9
      // 163: aload 9
      // 165: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 168: pop
      // 169: aload 9
      // 16b: getfield s60.jcg Ljava/lang/String;
      // 16e: astore 5
      // 170: aload 5
      // 172: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2334227394569382810L, -5684139365243940604L, MethodHandles.lookup().lookupClass()).a(24712855041159L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 79376564875888L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[12];
      int var5 = 0;
      String var4 = "â3ËNDxfÕ}\u001bí\u0012iñ«\u008c\u0010\u0005ùöíI\u0095á¼1\u008eoOÀX@³\u0010tñ\u0088¢åòmüp¬¶\u0096yHÙv\u0010ß\bç>\u0017qP¨O ÖO%6\u00960\u0018\u0010õó»ÚzUBÞ\u008a¤&\u000bKk\u0017^\u00045j0ó0â\u0010\u0087yy\u0087ãÿ¨ì\u0018ÇwcO|\u008cC\u0018`è×è\u0001¶d\u009ddY½ë\u0016x´E#2ÈK\u0084\u000eX´\u0010l¶ªç\u0083}¡\u0004r½0N\u0005d½\u001c\u0010m@ëëù'\u009a\u0016OßCÏø\"\u0090î d5L¥Ò×5òÖ\u0014&Z\u00040þ>\u00073\u0098Êû=\u0081¿¡¡ØEÙ\töC";
      int var6 = "â3ËNDxfÕ}\u001bí\u0012iñ«\u008c\u0010\u0005ùöíI\u0095á¼1\u008eoOÀX@³\u0010tñ\u0088¢åòmüp¬¶\u0096yHÙv\u0010ß\bç>\u0017qP¨O ÖO%6\u00960\u0018\u0010õó»ÚzUBÞ\u008a¤&\u000bKk\u0017^\u00045j0ó0â\u0010\u0087yy\u0087ãÿ¨ì\u0018ÇwcO|\u008cC\u0018`è×è\u0001¶d\u009ddY½ë\u0016x´E#2ÈK\u0084\u000eX´\u0010l¶ªç\u0083}¡\u0004r½0N\u0005d½\u001c\u0010m@ëëù'\u009a\u0016OßCÏø\"\u0090î d5L¥Ò×5òÖ\u0014&Z\u00040þ>\u00073\u0098Êû=\u0081¿¡¡ØEÙ\töC"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[12];
                     pek = b<"d">(9509, 7321477510995168681L ^ var9);
                     arg = b<"d">(18968, 1632419798347948688L ^ var9);
                     t7_ = new crk(b<"d">(32260, 6533007797889734281L ^ var9), b<"d">(16296, 1927118181484910377L ^ var9), 1.0F, 0.1F, 1.0F, 0.1F);
                     hft = new cn7(b<"d">(6362, 6473982218304581722L ^ var9), b<"d">(10857, 1521263585348240106L ^ var9), false);
                     lll = new cn7(b<"d">(6362, 6473982218304581722L ^ var9), b<"d">(31900, 111170785585173527L ^ var9), true);
                     rnf = new cn7(b<"d">(6362, 6473982218304581722L ^ var9), b<"d">(15021, 1321225259515400738L ^ var9), true);
                     gc3 = new cn7(b<"d">(6362, 6473982218304581722L ^ var9), b<"d">(30379, 3684721687293369897L ^ var9), true);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = ".4\r=Ú<Éi;\u0082QõµT\u0080õw¾\u00074br\r°ÑÍ¥\u0099{\u0088\u0088V\u0010\u0087ý©»ð²_\u0014Ì\u0089+\rÉ³læ";
                  var6 = ".4\r=Ú<Éi;\u0082QõµT\u0080õw¾\u00074br\r°ÑÍ¥\u0099{\u0088\u0088V\u0010\u0087ý©»ð²_\u0014Ì\u0089+\rÉ³læ".length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception b(Exception var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5646;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("j3h", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("j3h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
