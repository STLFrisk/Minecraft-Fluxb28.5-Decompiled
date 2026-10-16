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
import net.optifine.entity.model.IEntityRenderer;
import org.lwjgl.opengl.GL11;

public abstract class liu implements IEntityRenderer {
   public final hr_ l0g;
   public float o2u;
   public float xeb = 1.0F;
   private static final long b;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public liu(hr_ var1) {
      this.l0g = var1;
   }

   public boolean h12(EntityLivingBase param1, _aq param2, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 09: astore 10
      // 0b: aload 10
      // 0d: iload 9
      // 0f: ifne 7a
      // 12: invokevirtual nh4._03 ()Z
      // 15: ifne 3c
      // 18: goto 1f
      // 1b: invokestatic liu.b (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 10
      // 21: invokevirtual nh4.liq ()D
      // 24: dconst_0
      // 25: dcmpl
      // 26: iload 9
      // 28: ifne 85
      // 2b: goto 32
      // 2e: invokestatic liu.b (Loov;)Loov;
      // 31: athrow
      // 32: ifne 7c
      // 35: goto 3c
      // 38: invokestatic liu.b (Loov;)Loov;
      // 3b: athrow
      // 3c: new nh4
      // 3f: dup
      // 40: aload 1
      // 41: getfield EntityLivingBase.o2v D
      // 44: ldc2_w 2.0
      // 47: dsub
      // 48: aload 1
      // 49: getfield EntityLivingBase.kfp D
      // 4c: ldc2_w 2.0
      // 4f: dsub
      // 50: aload 1
      // 51: getfield EntityLivingBase.vbd D
      // 54: ldc2_w 2.0
      // 57: dsub
      // 58: aload 1
      // 59: getfield EntityLivingBase.o2v D
      // 5c: ldc2_w 2.0
      // 5f: dadd
      // 60: aload 1
      // 61: getfield EntityLivingBase.kfp D
      // 64: ldc2_w 2.0
      // 67: dadd
      // 68: aload 1
      // 69: getfield EntityLivingBase.vbd D
      // 6c: ldc2_w 2.0
      // 6f: dadd
      // 70: invokespecial nh4.<init> (DDDDDD)V
      // 73: goto 7a
      // 76: invokestatic liu.b (Loov;)Loov;
      // 79: athrow
      // 7a: astore 10
      // 7c: aload 1
      // 7d: dload 3
      // 7e: dload 5
      // 80: dload 7
      // 82: invokevirtual EntityLivingBase.e4f (DDD)Z
      // 85: iload 9
      // 87: ifne 9f
      // 8a: ifeq d0
      // 8d: goto 94
      // 90: invokestatic liu.b (Loov;)Loov;
      // 93: athrow
      // 94: aload 1
      // 95: getfield EntityLivingBase.k50 Z
      // 98: goto 9f
      // 9b: invokestatic liu.b (Loov;)Loov;
      // 9e: athrow
      // 9f: iload 9
      // a1: ifne cd
      // a4: ifne cc
      // a7: goto ae
      // aa: invokestatic liu.b (Loov;)Loov;
      // ad: athrow
      // ae: aload 2
      // af: aload 10
      // b1: invokeinterface _aq.n2v (Lnh4;)Z 2
      // b6: iload 9
      // b8: ifne cd
      // bb: goto c2
      // be: invokestatic liu.b (Loov;)Loov;
      // c1: athrow
      // c2: ifeq d0
      // c5: goto cc
      // c8: invokestatic liu.b (Loov;)Loov;
      // cb: athrow
      // cc: bipush 1
      // cd: goto d1
      // d0: bipush 0
      // d1: ireturn
   }

   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.ix5(var1, var2, var4, var6);
   }

   public void ix5(EntityLivingBase param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 8
      // 05: aload 0
      // 06: aload 1
      // 07: iload 8
      // 09: ifne 22
      // 0c: invokevirtual liu.daa (Li2h;)Z
      // 0f: ifeq 35
      // 12: goto 19
      // 15: invokestatic liu.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: goto 22
      // 1e: invokestatic liu.b (Loov;)Loov;
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual EntityLivingBase.xyw ()Lekw;
      // 26: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 2b: dload 2
      // 2c: dload 4
      // 2e: dload 6
      // 30: bipush 64
      // 32: invokevirtual liu.dlr (Li2h;Ljava/lang/String;DDDI)V
      // 35: return
   }

   public boolean daa(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual EntityLivingBase.x1t ()Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic liu.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual EntityLivingBase.qrh ()Z
      // 1a: goto 21
      // 1d: invokestatic liu.b (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic liu.b (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public void pdy(EntityLivingBase var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      this.dlr(var1, var8, var2, var4, var6, 64);
   }

   public abstract gdz dzd(EntityLivingBase var1);

   public boolean sat(EntityLivingBase var1) {
      int var2 = OpaquePredicate.b();
      gdz var3 = this.dzd(var1);

      gdz var10000;
      label31: {
         label30: {
            try {
               var10000 = this.uc8;
               if (var2 == 0) {
                  break label31;
               }

               if (this.uc8 == null) {
                  break label30;
               }
            } catch (oov var5) {
               throw b(var5);
            }

            var3 = this.uc8;
         }

         var10000 = var3;
      }

      try {
         if (var10000 == null) {
            return false;
         }
      } catch (oov var4) {
         throw b(var4);
      }

      this.gu4(var3);
      return true;
   }

   public void gu4(gdz var1) {
      this.l0g.ewh.anl(var1);
   }

   private void v1l(EntityLivingBase param1, double param2, double param4, double param6, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic liu.b J
      // 003: ldc2_w 58621374736654
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic hzu.fpt ()V
      // 00c: invokestatic Minecraft.vz1 ()Lc05;
      // 00f: invokevirtual Minecraft.dd_ ()Lyu2;
      // 012: astore 12
      // 014: aload 12
      // 016: sipush 25186
      // 019: ldc2_w 1924102113554541851
      // 01c: lload 9
      // 01e: lxor
      // 01f: invokedynamic i (IJ)Ljava/lang/String; bsm=liu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: invokevirtual yu2.brw (Ljava/lang/String;)Lsla;
      // 028: astore 13
      // 02a: aload 12
      // 02c: sipush 28318
      // 02f: ldc2_w 8788875298988597734
      // 032: lload 9
      // 034: lxor
      // 035: invokedynamic i (IJ)Ljava/lang/String; bsm=liu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: nop
      // 03b: invokevirtual yu2.brw (Ljava/lang/String;)Lsla;
      // 03e: astore 14
      // 040: invokestatic hzu.dp2 ()V
      // 043: dload 2
      // 044: d2f
      // 045: dload 4
      // 047: d2f
      // 048: dload 6
      // 04a: d2f
      // 04b: invokestatic hzu.a4k (FFF)V
      // 04e: aload 1
      // 04f: getfield EntityLivingBase.uo6 F
      // 052: ldc 1.4
      // 054: nop
      // 055: fmul
      // 056: fstore 15
      // 058: fload 15
      // 05a: fload 15
      // 05c: fload 15
      // 05e: invokestatic hzu.syc (FFF)V
      // 061: invokestatic jom.yut ()Ljom;
      // 064: astore 16
      // 066: aload 16
      // 068: invokevirtual jom.zuq ()Lq3g;
      // 06b: astore 17
      // 06d: ldc 0.5
      // 06f: nop
      // 070: fstore 18
      // 072: fconst_0
      // 073: fstore 19
      // 075: aload 1
      // 076: getfield EntityLivingBase.ikl F
      // 079: fload 15
      // 07b: fdiv
      // 07c: fstore 20
      // 07e: invokestatic OpaquePredicate.b ()I
      // 081: aload 1
      // 082: getfield EntityLivingBase.kfp D
      // 085: aload 1
      // 086: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 089: getfield nh4.bx_ D
      // 08c: dsub
      // 08d: d2f
      // 08e: fstore 21
      // 090: istore 11
      // 092: aload 0
      // 093: getfield liu.l0g Lhr_;
      // 096: getfield hr_.s7e F
      // 099: fneg
      // 09a: fconst_0
      // 09b: fconst_1
      // 09c: fconst_0
      // 09d: invokestatic hzu.a2h (FFFF)V
      // 0a0: fconst_0
      // 0a1: fconst_0
      // 0a2: ldc -0.3
      // 0a4: nop
      // 0a5: fload 20
      // 0a7: f2i
      // 0a8: i2f
      // 0a9: ldc 0.02
      // 0ab: nop
      // 0ac: fmul
      // 0ad: fadd
      // 0ae: invokestatic hzu.a4k (FFF)V
      // 0b1: fconst_1
      // 0b2: fconst_1
      // 0b3: fconst_1
      // 0b4: fconst_1
      // 0b5: invokestatic hzu.wn0 (FFFF)V
      // 0b8: fconst_0
      // 0b9: fstore 22
      // 0bb: bipush 0
      // 0bc: istore 23
      // 0be: invokestatic hxt.jty ()Z
      // 0c1: istore 24
      // 0c3: iload 24
      // 0c5: ifeq 0d7
      // 0c8: aload 17
      // 0ca: getstatic w51.exw Lw51;
      // 0cd: invokevirtual q3g._8s (Lw51;)V
      // 0d0: goto 0d7
      // 0d3: invokestatic liu.b (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 17
      // 0d9: bipush 7
      // 0db: getstatic gnl._r5 Lbe7;
      // 0de: invokevirtual q3g.ezr (ILbe7;)V
      // 0e1: fload 20
      // 0e3: fconst_0
      // 0e4: fcmpl
      // 0e5: ifle 1fd
      // 0e8: iload 23
      // 0ea: bipush 2
      // 0eb: irem
      // 0ec: iload 11
      // 0ee: ifeq 210
      // 0f1: ifne 104
      // 0f4: goto 0fb
      // 0f7: invokestatic liu.b (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 13
      // 0fd: goto 106
      // 100: invokestatic liu.b (Loov;)Loov;
      // 103: athrow
      // 104: aload 14
      // 106: astore 25
      // 108: aload 17
      // 10a: aload 25
      // 10c: invokevirtual q3g.z_s (Lsla;)V
      // 10f: aload 0
      // 110: getstatic yu2.nu_ Lgdz;
      // 113: invokevirtual liu.gu4 (Lgdz;)V
      // 116: aload 25
      // 118: invokevirtual sla.l3u ()F
      // 11b: fstore 26
      // 11d: aload 25
      // 11f: invokevirtual sla.bhi ()F
      // 122: fstore 27
      // 124: aload 25
      // 126: invokevirtual sla.w2b ()F
      // 129: fstore 28
      // 12b: aload 25
      // 12d: invokevirtual sla.e8_ ()F
      // 130: fstore 29
      // 132: iload 11
      // 134: ifeq 1f8
      // 137: iload 23
      // 139: bipush 2
      // 13a: idiv
      // 13b: bipush 2
      // 13c: irem
      // 13d: ifne 153
      // 140: goto 147
      // 143: invokestatic liu.b (Loov;)Loov;
      // 146: athrow
      // 147: fload 28
      // 149: fstore 30
      // 14b: fload 26
      // 14d: fstore 28
      // 14f: fload 30
      // 151: fstore 26
      // 153: aload 17
      // 155: fload 18
      // 157: fload 19
      // 159: fsub
      // 15a: f2d
      // 15b: fconst_0
      // 15c: fload 21
      // 15e: fsub
      // 15f: f2d
      // 160: fload 22
      // 162: f2d
      // 163: invokevirtual q3g.g5o (DDD)Lq3g;
      // 166: fload 28
      // 168: f2d
      // 169: fload 29
      // 16b: f2d
      // 16c: invokevirtual q3g.h0a (DD)Lq3g;
      // 16f: invokevirtual q3g.pzw ()V
      // 172: aload 17
      // 174: fload 18
      // 176: fneg
      // 177: fload 19
      // 179: fsub
      // 17a: f2d
      // 17b: fconst_0
      // 17c: fload 21
      // 17e: fsub
      // 17f: f2d
      // 180: fload 22
      // 182: f2d
      // 183: invokevirtual q3g.g5o (DDD)Lq3g;
      // 186: fload 26
      // 188: f2d
      // 189: fload 29
      // 18b: f2d
      // 18c: invokevirtual q3g.h0a (DD)Lq3g;
      // 18f: invokevirtual q3g.pzw ()V
      // 192: aload 17
      // 194: fload 18
      // 196: fneg
      // 197: fload 19
      // 199: fsub
      // 19a: f2d
      // 19b: ldc 1.4
      // 19d: nop
      // 19e: fload 21
      // 1a0: fsub
      // 1a1: f2d
      // 1a2: fload 22
      // 1a4: f2d
      // 1a5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1a8: fload 26
      // 1aa: f2d
      // 1ab: fload 27
      // 1ad: f2d
      // 1ae: invokevirtual q3g.h0a (DD)Lq3g;
      // 1b1: invokevirtual q3g.pzw ()V
      // 1b4: aload 17
      // 1b6: fload 18
      // 1b8: fload 19
      // 1ba: fsub
      // 1bb: f2d
      // 1bc: ldc 1.4
      // 1be: nop
      // 1bf: fload 21
      // 1c1: fsub
      // 1c2: f2d
      // 1c3: fload 22
      // 1c5: f2d
      // 1c6: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1c9: fload 28
      // 1cb: f2d
      // 1cc: fload 27
      // 1ce: f2d
      // 1cf: invokevirtual q3g.h0a (DD)Lq3g;
      // 1d2: invokevirtual q3g.pzw ()V
      // 1d5: fload 20
      // 1d7: ldc 0.45
      // 1d9: nop
      // 1da: fsub
      // 1db: fstore 20
      // 1dd: fload 21
      // 1df: ldc 0.45
      // 1e1: nop
      // 1e2: fsub
      // 1e3: fstore 21
      // 1e5: fload 18
      // 1e7: ldc 0.9
      // 1e9: nop
      // 1ea: fmul
      // 1eb: fstore 18
      // 1ed: fload 22
      // 1ef: ldc 0.03
      // 1f1: nop
      // 1f2: fadd
      // 1f3: fstore 22
      // 1f5: iinc 23 1
      // 1f8: iload 11
      // 1fa: ifne 0e1
      // 1fd: aload 16
      // 1ff: invokevirtual jom.q7g ()V
      // 202: iload 11
      // 204: ifeq 22c
      // 207: iload 24
      // 209: goto 210
      // 20c: invokestatic liu.b (Loov;)Loov;
      // 20f: athrow
      // 210: ifeq 226
      // 213: aload 17
      // 215: aconst_null
      // 216: checkcast w51
      // 219: invokevirtual q3g._8s (Lw51;)V
      // 21c: invokestatic hzu.s_l ()V
      // 21f: goto 226
      // 222: invokestatic liu.b (Loov;)Loov;
      // 225: athrow
      // 226: invokestatic hzu.x3w ()V
      // 229: invokestatic hzu.s7q ()V
      // 22c: return
   }

   private void ay_(EntityLivingBase param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 10
      // 005: invokestatic hxt.ly3 ()Z
      // 008: iload 10
      // 00a: ifne 03d
      // 00d: ifeq 030
      // 010: goto 017
      // 013: invokestatic liu.b (Loov;)Loov;
      // 016: athrow
      // 017: getstatic net/optifine/shaders/Shaders.shouldSkipDefaultShadow Z
      // 01a: iload 10
      // 01c: ifne 03d
      // 01f: goto 026
      // 022: invokestatic liu.b (Loov;)Loov;
      // 025: athrow
      // 026: ifne 1f7
      // 029: goto 030
      // 02c: invokestatic liu.b (Loov;)Loov;
      // 02f: athrow
      // 030: invokestatic hzu.spd ()V
      // 033: sipush 770
      // 036: goto 03d
      // 039: invokestatic liu.b (Loov;)Loov;
      // 03c: athrow
      // 03d: sipush 771
      // 040: invokestatic hzu.ru7 (II)V
      // 043: aload 0
      // 044: getfield liu.l0g Lhr_;
      // 047: getfield hr_.ewh Llc5;
      // 04a: getstatic liu.k18 Lgdz;
      // 04d: invokevirtual lc5.anl (Lgdz;)V
      // 050: aload 0
      // 051: invokespecial liu.k8n ()Lt9d;
      // 054: astore 11
      // 056: bipush 0
      // 057: invokestatic hzu.jun (Z)V
      // 05a: aload 0
      // 05b: getfield liu.o2u F
      // 05e: fstore 12
      // 060: aload 1
      // 061: iload 10
      // 063: ifne 0a0
      // 066: instanceof yqv
      // 069: ifeq 09f
      // 06c: goto 073
      // 06f: invokestatic liu.b (Loov;)Loov;
      // 072: athrow
      // 073: aload 1
      // 074: checkcast yqv
      // 077: astore 13
      // 079: fload 12
      // 07b: aload 13
      // 07d: invokevirtual yqv.ck4 ()F
      // 080: fmul
      // 081: fstore 12
      // 083: aload 13
      // 085: iload 10
      // 087: ifne 0a0
      // 08a: invokevirtual yqv.ejl ()Z
      // 08d: ifeq 09f
      // 090: goto 097
      // 093: invokestatic liu.b (Loov;)Loov;
      // 096: athrow
      // 097: fload 12
      // 099: ldc 0.5
      // 09b: nop
      // 09c: fmul
      // 09d: fstore 12
      // 09f: aload 1
      // 0a0: getfield EntityLivingBase.ivp D
      // 0a3: aload 1
      // 0a4: getfield EntityLivingBase.o2v D
      // 0a7: aload 1
      // 0a8: getfield EntityLivingBase.ivp D
      // 0ab: dsub
      // 0ac: fload 9
      // 0ae: f2d
      // 0af: dmul
      // 0b0: dadd
      // 0b1: dstore 13
      // 0b3: aload 1
      // 0b4: getfield EntityLivingBase.c54 D
      // 0b7: aload 1
      // 0b8: getfield EntityLivingBase.kfp D
      // 0bb: aload 1
      // 0bc: getfield EntityLivingBase.c54 D
      // 0bf: dsub
      // 0c0: fload 9
      // 0c2: f2d
      // 0c3: dmul
      // 0c4: dadd
      // 0c5: dstore 15
      // 0c7: aload 1
      // 0c8: getfield EntityLivingBase.e2b D
      // 0cb: aload 1
      // 0cc: getfield EntityLivingBase.vbd D
      // 0cf: aload 1
      // 0d0: getfield EntityLivingBase.e2b D
      // 0d3: dsub
      // 0d4: fload 9
      // 0d6: f2d
      // 0d7: dmul
      // 0d8: dadd
      // 0d9: dstore 17
      // 0db: dload 13
      // 0dd: fload 12
      // 0df: f2d
      // 0e0: dsub
      // 0e1: invokestatic fe6.jqf (D)I
      // 0e4: istore 19
      // 0e6: dload 13
      // 0e8: fload 12
      // 0ea: f2d
      // 0eb: dadd
      // 0ec: invokestatic fe6.jqf (D)I
      // 0ef: istore 20
      // 0f1: dload 15
      // 0f3: fload 12
      // 0f5: f2d
      // 0f6: dsub
      // 0f7: invokestatic fe6.jqf (D)I
      // 0fa: istore 21
      // 0fc: dload 15
      // 0fe: invokestatic fe6.jqf (D)I
      // 101: istore 22
      // 103: dload 17
      // 105: fload 12
      // 107: f2d
      // 108: dsub
      // 109: invokestatic fe6.jqf (D)I
      // 10c: istore 23
      // 10e: dload 17
      // 110: fload 12
      // 112: f2d
      // 113: dadd
      // 114: invokestatic fe6.jqf (D)I
      // 117: istore 24
      // 119: dload 2
      // 11a: dload 13
      // 11c: dsub
      // 11d: dstore 25
      // 11f: dload 4
      // 121: dload 15
      // 123: dsub
      // 124: dstore 27
      // 126: dload 6
      // 128: dload 17
      // 12a: dsub
      // 12b: dstore 29
      // 12d: invokestatic jom.yut ()Ljom;
      // 130: astore 31
      // 132: aload 31
      // 134: invokevirtual jom.zuq ()Lq3g;
      // 137: astore 32
      // 139: aload 32
      // 13b: bipush 7
      // 13d: getstatic gnl.rad Lbe7;
      // 140: invokevirtual q3g.ezr (ILbe7;)V
      // 143: new mew
      // 146: dup
      // 147: iload 19
      // 149: iload 21
      // 14b: iload 23
      // 14d: invokespecial mew.<init> (III)V
      // 150: new mew
      // 153: dup
      // 154: iload 20
      // 156: iload 22
      // 158: iload 24
      // 15a: invokespecial mew.<init> (III)V
      // 15d: invokestatic mew.getAllInBoxMutable (Lmew;Lmew;)Ljava/lang/Iterable;
      // 160: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 165: astore 33
      // 167: aload 33
      // 169: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16e: ifeq 1e4
      // 171: aload 33
      // 173: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 178: checkcast mew
      // 17b: astore 34
      // 17d: aload 11
      // 17f: aload 34
      // 181: invokevirtual mew.eve ()Lmew;
      // 184: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 187: invokeinterface zfz.r_y ()Le0x; 1
      // 18c: astore 35
      // 18e: aload 35
      // 190: invokevirtual e0x.kfj ()I
      // 193: iload 10
      // 195: ifne 1f4
      // 198: bipush -1
      // 199: iload 10
      // 19b: ifne 1be
      // 19e: goto 1a5
      // 1a1: invokestatic liu.b (Loov;)Loov;
      // 1a4: athrow
      // 1a5: if_icmpeq 1df
      // 1a8: goto 1af
      // 1ab: invokestatic liu.b (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 11
      // 1b1: aload 34
      // 1b3: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 1b6: bipush 3
      // 1b7: goto 1be
      // 1ba: invokestatic liu.b (Loov;)Loov;
      // 1bd: athrow
      // 1be: if_icmple 1df
      // 1c1: aload 0
      // 1c2: aload 35
      // 1c4: dload 2
      // 1c5: dload 4
      // 1c7: dload 6
      // 1c9: aload 34
      // 1cb: fload 8
      // 1cd: fload 12
      // 1cf: dload 25
      // 1d1: dload 27
      // 1d3: dload 29
      // 1d5: invokespecial liu.f_9 (Le0x;DDDLmew;FFDDD)V
      // 1d8: goto 1df
      // 1db: invokestatic liu.b (Loov;)Loov;
      // 1de: athrow
      // 1df: iload 10
      // 1e1: ifeq 167
      // 1e4: aload 31
      // 1e6: invokevirtual jom.q7g ()V
      // 1e9: fconst_1
      // 1ea: fconst_1
      // 1eb: fconst_1
      // 1ec: fconst_1
      // 1ed: invokestatic hzu.wn0 (FFFF)V
      // 1f0: invokestatic hzu.ux6 ()V
      // 1f3: bipush 1
      // 1f4: invokestatic hzu.jun (Z)V
      // 1f7: return
   }

   private OpaquePredicate k8n() {
      return this.l0g.kzr;
   }

   private void f_9(
      e0x param1, double param2, double param4, double param6, mew param8, float param9, float param10, double param11, double param13, double param15
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 17
      // 005: aload 1
      // 006: invokevirtual e0x.gck ()Z
      // 009: ifeq 18f
      // 00c: invokestatic jom.yut ()Ljom;
      // 00f: astore 18
      // 011: aload 18
      // 013: invokevirtual jom.zuq ()Lq3g;
      // 016: astore 19
      // 018: fload 9
      // 01a: f2d
      // 01b: dload 4
      // 01d: aload 8
      // 01f: invokevirtual mew.getY ()I
      // 022: i2d
      // 023: dload 13
      // 025: dadd
      // 026: dsub
      // 027: ldc2_w 2.0
      // 02a: ddiv
      // 02b: dsub
      // 02c: ldc2_w 0.5
      // 02f: dmul
      // 030: aload 0
      // 031: invokespecial liu.k8n ()Lt9d;
      // 034: aload 8
      // 036: invokevirtual OpaquePredicate.rgh (Lmew;)F
      // 039: f2d
      // 03a: dmul
      // 03b: dstore 20
      // 03d: dload 20
      // 03f: dconst_0
      // 040: dcmpl
      // 041: iload 17
      // 043: ifne 05b
      // 046: iflt 18f
      // 049: goto 050
      // 04c: invokestatic liu.b (Loov;)Loov;
      // 04f: athrow
      // 050: dload 20
      // 052: dconst_1
      // 053: dcmpl
      // 054: goto 05b
      // 057: invokestatic liu.b (Loov;)Loov;
      // 05a: athrow
      // 05b: iload 17
      // 05d: ifne 072
      // 060: ifle 06d
      // 063: goto 06a
      // 066: invokestatic liu.b (Loov;)Loov;
      // 069: athrow
      // 06a: dconst_1
      // 06b: dstore 20
      // 06d: aload 8
      // 06f: invokevirtual mew.getX ()I
      // 072: i2d
      // 073: aload 1
      // 074: invokevirtual e0x.v00 ()D
      // 077: dadd
      // 078: dload 11
      // 07a: dadd
      // 07b: dstore 22
      // 07d: aload 8
      // 07f: invokevirtual mew.getX ()I
      // 082: i2d
      // 083: aload 1
      // 084: invokevirtual e0x.ohw ()D
      // 087: dadd
      // 088: dload 11
      // 08a: dadd
      // 08b: dstore 24
      // 08d: aload 8
      // 08f: invokevirtual mew.getY ()I
      // 092: i2d
      // 093: aload 1
      // 094: invokevirtual e0x._y3 ()D
      // 097: dadd
      // 098: dload 13
      // 09a: dadd
      // 09b: ldc2_w 0.015625
      // 09e: dadd
      // 09f: dstore 26
      // 0a1: aload 8
      // 0a3: invokevirtual mew.getZ ()I
      // 0a6: i2d
      // 0a7: aload 1
      // 0a8: invokevirtual e0x.z69 ()D
      // 0ab: dadd
      // 0ac: dload 15
      // 0ae: dadd
      // 0af: dstore 28
      // 0b1: aload 8
      // 0b3: invokevirtual mew.getZ ()I
      // 0b6: i2d
      // 0b7: aload 1
      // 0b8: invokevirtual e0x.ttv ()D
      // 0bb: dadd
      // 0bc: dload 15
      // 0be: dadd
      // 0bf: dstore 30
      // 0c1: dload 2
      // 0c2: dload 22
      // 0c4: dsub
      // 0c5: ldc2_w 2.0
      // 0c8: ddiv
      // 0c9: fload 10
      // 0cb: f2d
      // 0cc: ddiv
      // 0cd: ldc2_w 0.5
      // 0d0: dadd
      // 0d1: d2f
      // 0d2: fstore 32
      // 0d4: dload 2
      // 0d5: dload 24
      // 0d7: dsub
      // 0d8: ldc2_w 2.0
      // 0db: ddiv
      // 0dc: fload 10
      // 0de: f2d
      // 0df: ddiv
      // 0e0: ldc2_w 0.5
      // 0e3: dadd
      // 0e4: d2f
      // 0e5: fstore 33
      // 0e7: dload 6
      // 0e9: dload 28
      // 0eb: dsub
      // 0ec: ldc2_w 2.0
      // 0ef: ddiv
      // 0f0: fload 10
      // 0f2: f2d
      // 0f3: ddiv
      // 0f4: ldc2_w 0.5
      // 0f7: dadd
      // 0f8: d2f
      // 0f9: fstore 34
      // 0fb: dload 6
      // 0fd: dload 30
      // 0ff: dsub
      // 100: ldc2_w 2.0
      // 103: ddiv
      // 104: fload 10
      // 106: f2d
      // 107: ddiv
      // 108: ldc2_w 0.5
      // 10b: dadd
      // 10c: d2f
      // 10d: fstore 35
      // 10f: aload 19
      // 111: dload 22
      // 113: dload 26
      // 115: dload 28
      // 117: invokevirtual q3g.g5o (DDD)Lq3g;
      // 11a: fload 32
      // 11c: f2d
      // 11d: fload 34
      // 11f: f2d
      // 120: invokevirtual q3g.h0a (DD)Lq3g;
      // 123: fconst_1
      // 124: fconst_1
      // 125: fconst_1
      // 126: dload 20
      // 128: d2f
      // 129: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 12c: invokevirtual q3g.pzw ()V
      // 12f: aload 19
      // 131: dload 22
      // 133: dload 26
      // 135: dload 30
      // 137: invokevirtual q3g.g5o (DDD)Lq3g;
      // 13a: fload 32
      // 13c: f2d
      // 13d: fload 35
      // 13f: f2d
      // 140: invokevirtual q3g.h0a (DD)Lq3g;
      // 143: fconst_1
      // 144: fconst_1
      // 145: fconst_1
      // 146: dload 20
      // 148: d2f
      // 149: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 14c: invokevirtual q3g.pzw ()V
      // 14f: aload 19
      // 151: dload 24
      // 153: dload 26
      // 155: dload 30
      // 157: invokevirtual q3g.g5o (DDD)Lq3g;
      // 15a: fload 33
      // 15c: f2d
      // 15d: fload 35
      // 15f: f2d
      // 160: invokevirtual q3g.h0a (DD)Lq3g;
      // 163: fconst_1
      // 164: fconst_1
      // 165: fconst_1
      // 166: dload 20
      // 168: d2f
      // 169: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 16c: invokevirtual q3g.pzw ()V
      // 16f: aload 19
      // 171: dload 24
      // 173: dload 26
      // 175: dload 28
      // 177: invokevirtual q3g.g5o (DDD)Lq3g;
      // 17a: fload 33
      // 17c: f2d
      // 17d: fload 34
      // 17f: f2d
      // 180: invokevirtual q3g.h0a (DD)Lq3g;
      // 183: fconst_1
      // 184: fconst_1
      // 185: fconst_1
      // 186: dload 20
      // 188: d2f
      // 189: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 18c: invokevirtual q3g.pzw ()V
      // 18f: return
   }

   public static void mg0(nh4 var0, double var1, double var3, double var5) {
      hzu.m_1();
      jom var7 = jom.yut();
      q3g var8 = var7.zuq();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      var8.nbz(var1, var3, var5);
      var8.ezr(7, gnl._zt);
      var8.g5o(var0.rlc, var0.i2c, var0.t8n).h3y(0.0F, 0.0F, -1.0F).pzw();
      var8.g5o(var0.t_2, var0.i2c, var0.t8n).h3y(0.0F, 0.0F, -1.0F).pzw();
      var8.g5o(var0.t_2, var0.bx_, var0.t8n).h3y(0.0F, 0.0F, -1.0F).pzw();
      var8.g5o(var0.rlc, var0.bx_, var0.t8n).h3y(0.0F, 0.0F, -1.0F).pzw();
      var8.g5o(var0.rlc, var0.bx_, var0.oqj).h3y(0.0F, 0.0F, 1.0F).pzw();
      var8.g5o(var0.t_2, var0.bx_, var0.oqj).h3y(0.0F, 0.0F, 1.0F).pzw();
      var8.g5o(var0.t_2, var0.i2c, var0.oqj).h3y(0.0F, 0.0F, 1.0F).pzw();
      var8.g5o(var0.rlc, var0.i2c, var0.oqj).h3y(0.0F, 0.0F, 1.0F).pzw();
      var8.g5o(var0.rlc, var0.bx_, var0.t8n).h3y(0.0F, -1.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.bx_, var0.t8n).h3y(0.0F, -1.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.bx_, var0.oqj).h3y(0.0F, -1.0F, 0.0F).pzw();
      var8.g5o(var0.rlc, var0.bx_, var0.oqj).h3y(0.0F, -1.0F, 0.0F).pzw();
      var8.g5o(var0.rlc, var0.i2c, var0.oqj).h3y(0.0F, 1.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.i2c, var0.oqj).h3y(0.0F, 1.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.i2c, var0.t8n).h3y(0.0F, 1.0F, 0.0F).pzw();
      var8.g5o(var0.rlc, var0.i2c, var0.t8n).h3y(0.0F, 1.0F, 0.0F).pzw();
      var8.g5o(var0.rlc, var0.bx_, var0.oqj).h3y(-1.0F, 0.0F, 0.0F).pzw();
      var8.g5o(var0.rlc, var0.i2c, var0.oqj).h3y(-1.0F, 0.0F, 0.0F).pzw();
      var8.g5o(var0.rlc, var0.i2c, var0.t8n).h3y(-1.0F, 0.0F, 0.0F).pzw();
      var8.g5o(var0.rlc, var0.bx_, var0.t8n).h3y(-1.0F, 0.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.bx_, var0.t8n).h3y(1.0F, 0.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.i2c, var0.t8n).h3y(1.0F, 0.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.i2c, var0.oqj).h3y(1.0F, 0.0F, 0.0F).pzw();
      var8.g5o(var0.t_2, var0.bx_, var0.oqj).h3y(1.0F, 0.0F, 0.0F).pzw();
      var7.q7g();
      var8.nbz(0.0, 0.0, 0.0);
      hzu.rqj();
   }

   public void tqt(EntityLivingBase param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 10
      // 005: aload 0
      // 006: getfield liu.l0g Lhr_;
      // 009: getfield hr_.p52 Lmoh;
      // 00c: iload 10
      // 00e: ifne 029
      // 011: ifnull 12d
      // 014: goto 01b
      // 017: invokestatic liu.b (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield liu.l0g Lhr_;
      // 01f: getfield hr_.p52 Lmoh;
      // 022: goto 029
      // 025: invokestatic liu.b (Loov;)Loov;
      // 028: athrow
      // 029: getfield moh.rxd Z
      // 02c: iload 10
      // 02e: ifne 0e0
      // 031: ifeq 0dc
      // 034: goto 03b
      // 037: invokestatic liu.b (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield liu.o2u F
      // 03f: fconst_0
      // 040: fcmpl
      // 041: iload 10
      // 043: ifne 0e0
      // 046: goto 04d
      // 049: invokestatic liu.b (Loov;)Loov;
      // 04c: athrow
      // 04d: ifle 0dc
      // 050: goto 057
      // 053: invokestatic liu.b (Loov;)Loov;
      // 056: athrow
      // 057: aload 1
      // 058: invokevirtual EntityLivingBase.h5u ()Z
      // 05b: iload 10
      // 05d: ifne 0e0
      // 060: goto 067
      // 063: invokestatic liu.b (Loov;)Loov;
      // 066: athrow
      // 067: ifne 0dc
      // 06a: goto 071
      // 06d: invokestatic liu.b (Loov;)Loov;
      // 070: athrow
      // 071: aload 0
      // 072: getfield liu.l0g Lhr_;
      // 075: invokevirtual hr_.ka6 ()Z
      // 078: iload 10
      // 07a: ifne 0e0
      // 07d: goto 084
      // 080: invokestatic liu.b (Loov;)Loov;
      // 083: athrow
      // 084: ifeq 0dc
      // 087: goto 08e
      // 08a: invokestatic liu.b (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield liu.l0g Lhr_;
      // 092: aload 1
      // 093: getfield EntityLivingBase.o2v D
      // 096: aload 1
      // 097: getfield EntityLivingBase.kfp D
      // 09a: aload 1
      // 09b: getfield EntityLivingBase.vbd D
      // 09e: invokevirtual hr_.m8_ (DDD)D
      // 0a1: dstore 11
      // 0a3: dconst_1
      // 0a4: dload 11
      // 0a6: ldc2_w 256.0
      // 0a9: ddiv
      // 0aa: dsub
      // 0ab: aload 0
      // 0ac: getfield liu.xeb F
      // 0af: f2d
      // 0b0: dmul
      // 0b1: d2f
      // 0b2: fstore 13
      // 0b4: fload 13
      // 0b6: fconst_0
      // 0b7: fcmpl
      // 0b8: iload 10
      // 0ba: ifne 0e0
      // 0bd: ifle 0dc
      // 0c0: goto 0c7
      // 0c3: invokestatic liu.b (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: aload 1
      // 0c9: dload 2
      // 0ca: dload 4
      // 0cc: dload 6
      // 0ce: fload 13
      // 0d0: fload 9
      // 0d2: invokespecial liu.ay_ (Li2h;DDDFF)V
      // 0d5: goto 0dc
      // 0d8: invokestatic liu.b (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: invokevirtual EntityLivingBase.zex ()Z
      // 0e0: iload 10
      // 0e2: ifne 0fa
      // 0e5: ifeq 12d
      // 0e8: goto 0ef
      // 0eb: invokestatic liu.b (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 1
      // 0f0: instanceof ha9
      // 0f3: goto 0fa
      // 0f6: invokestatic liu.b (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 10
      // 0fc: ifne 117
      // 0ff: ifeq 11a
      // 102: goto 109
      // 105: invokestatic liu.b (Loov;)Loov;
      // 108: athrow
      // 109: aload 1
      // 10a: checkcast ha9
      // 10d: invokevirtual ha9.myu ()Z
      // 110: goto 117
      // 113: invokestatic liu.b (Loov;)Loov;
      // 116: athrow
      // 117: ifne 12d
      // 11a: aload 0
      // 11b: aload 1
      // 11c: dload 2
      // 11d: dload 4
      // 11f: dload 6
      // 121: fload 9
      // 123: invokespecial liu.v1l (Li2h;DDDF)V
      // 126: goto 12d
      // 129: invokestatic liu.b (Loov;)Loov;
      // 12c: athrow
      // 12d: return
   }

   public owt r3f() {
      return this.l0g.mad();
   }

   public void dlr(EntityLivingBase var1, String var2, double var3, double var5, double var7, int var9) {
      long var10 = b ^ 80076605894963L;
      int var12 = OpaquePredicate.b();
      double var13 = var1.wxg(this.l0g.mok);
      if (var13 <= (double)(var9 * var9)) {
         owt var15 = this.r3f();
         float var16 = 1.6F;
         float var17 = 0.016666668F * var16;
         hzu.dp2();
         hzu.a4k((float)var3 + 0.0F, (float)var5 + var1.ikl + 0.5F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         hzu.a2h(-this.l0g.s7e, 0.0F, 1.0F, 0.0F);
         hzu.a2h(this.l0g.fw9, 1.0F, 0.0F, 0.0F);
         hzu.syc(-var17, -var17, var17);
         hzu.fpt();
         hzu.jun(false);
         hzu._o4();
         hzu.spd();
         hzu.u39(770, 771, 1, 0);
         jom var18 = jom.yut();
         q3g var19 = var18.zuq();
         byte var20 = 0;

         int var10000;
         label23: {
            label22: {
               try {
                  var10000 = var2.equals(a<"i">(4295, 5636885982450698112L ^ var10));
                  if (var12 == 0) {
                     break label23;
                  }

                  if (var10000 == 0) {
                     break label22;
                  }
               } catch (oov var22) {
                  throw b(var22);
               }

               var20 = -10;
            }

            var10000 = var15.ezt(var2) / 2;
         }

         int var21 = var10000;
         hzu.m_1();
         var19.ezr(7, gnl.gec);
         var19.g5o((double)(-var21 - 1), (double)(-1 + var20), 0.0).gs4(0.0F, 0.0F, 0.0F, 0.25F).pzw();
         var19.g5o((double)(-var21 - 1), (double)(8 + var20), 0.0).gs4(0.0F, 0.0F, 0.0F, 0.25F).pzw();
         var19.g5o((double)(var21 + 1), (double)(8 + var20), 0.0).gs4(0.0F, 0.0F, 0.0F, 0.25F).pzw();
         var19.g5o((double)(var21 + 1), (double)(-1 + var20), 0.0).gs4(0.0F, 0.0F, 0.0F, 0.25F).pzw();
         var18.q7g();
         hzu.rqj();
         var15.eh6(var2, (float)(-var15.ezt(var2) / 2), (float)var20, 553648127);
         hzu.m45();
         hzu.jun(true);
         var15.eh6(var2, (float)(-var15.ezt(var2) / 2), (float)var20, -1);
         hzu.s7q();
         hzu.ux6();
         hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
         hzu.x3w();
      }
   }

   public hr_ g5a() {
      return this.l0g;
   }

   public boolean v_5() {
      return false;
   }

   public void pr3(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
   }

   @Override
   public Class getEntityClass() {
      return this.n6_;
   }

   @Override
   public void setEntityClass(Class var1) {
      this.n6_ = var1;
   }

   @Override
   public gdz getLocationTextureCustom() {
      return this.uc8;
   }

   @Override
   public void setLocationTextureCustom(gdz var1) {
      this.uc8 = var1;
   }

   public static void p_1(w56 var0, z14 var1) {
      var0.alu = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7771440454841164050L, -1175000491654142545L, MethodHandles.lookup().lookupClass()).a(1333686028972L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 88482252248154L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "¦ÿ£\u008b\u0007éµ(Ç@\u008b\u0090\u0001Ö\u001b\u009e^\u0019ï¡4¯ùÃõ\u0092d>\u001cb\u0000`{Oã\u001e\u0001.\u0002@C+\u000eNÀÒ\u0092\u008eQ\u001a\u0094÷¯Í160\u000eç¹×T\u0090ù\u0011#ßÕ\u0002úÆrÆ@²èì\u009fwù^Ü]Í?G¦ß\u0096A1¶Ï?8Þ\u008aÃî£À\u0092\u0003ç\u009a";
      int var6 = "¦ÿ£\u008b\u0007éµ(Ç@\u008b\u0090\u0001Ö\u001b\u009e^\u0019ï¡4¯ùÃõ\u0092d>\u001cb\u0000`{Oã\u001e\u0001.\u0002@C+\u000eNÀÒ\u0092\u008eQ\u001a\u0094÷¯Í160\u000eç¹×T\u0090ù\u0011#ßÕ\u0002úÆrÆ@²èì\u009fwù^Ü]Í?G¦ß\u0096A1¶Ï?8Þ\u008aÃî£À\u0092\u0003ç\u009a"
         .length();
      char var3 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     e = new String[4];
                     k18 = new gdz(a<"i">(18454, 6491636375502617145L ^ var9));
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

                  var4 = "*7º¶7\fÂ7kú¨u}W\u001cvU+ÅÁ\u0083e.78\u0090<\u008b\u001dÌ\r&®\u001c\u0001jKxLò¢M»\u009aò½\u0000WæZ?ç\t>é\u0016ßÅdîÕ²´\u0012MtU\u009aÄ\u0094B:Ôaó\u009c\u0092Ü¼¨\u0010";
                  var6 = "*7º¶7\fÂ7kú¨u}W\u001cvU+ÅÁ\u0083e.78\u0090<\u008b\u001dÌ\r&®\u001c\u0001jKxLò¢M»\u009aò½\u0000WæZ?ç\t>é\u0016ßÅdîÕ²´\u0012MtU\u009aÄ\u0094B:Ôaó\u009c\u0092Ü¼¨\u0010"
                     .length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23475;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("liu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("liu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
