import net.optifine.shaders.Shaders;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class atg {
   private static final float t61 = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float itv = 1.0F / (float)Math.cos(Math.PI / 4) - 1.0F;

   public oa4 pvr(Vector3f param1, Vector3f param2, e97 param3, sla param4, vt2 param5, yct param6, qoi param7, boolean param8, boolean param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 3
      // 02: aload 4
      // 04: aload 5
      // 06: aload 0
      // 07: aload 1
      // 08: aload 2
      // 09: invokespecial atg.tg_ (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;)[F
      // 0c: aload 6
      // 0e: aload 7
      // 10: iload 8
      // 12: iload 9
      // 14: invokespecial atg.ujn (Le97;Lsla;Lvt2;[FLyct;Lqoi;ZZ)[I
      // 17: astore 11
      // 19: invokestatic OpaquePredicate.b ()I
      // 1c: aload 11
      // 1e: invokestatic atg.g9d ([I)Lvt2;
      // 21: astore 12
      // 23: istore 10
      // 25: iload 8
      // 27: ifeq 3f
      // 2a: aload 0
      // 2b: aload 11
      // 2d: aload 12
      // 2f: aload 3
      // 30: getfield e97.hi7 Ly3k;
      // 33: aload 4
      // 35: invokevirtual atg.oxk ([ILvt2;Ly3k;Lsla;)V
      // 38: goto 3f
      // 3b: invokestatic atg.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 7
      // 41: ifnonnull 53
      // 44: aload 0
      // 45: aload 11
      // 47: aload 12
      // 49: invokespecial atg.zrz ([ILvt2;)V
      // 4c: goto 53
      // 4f: invokestatic atg.a (Loov;)Loov;
      // 52: athrow
      // 53: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_fillNormal Lnet/optifine/reflect/ReflectorMethod;
      // 56: iload 10
      // 58: ifeq 83
      // 5b: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 5e: ifeq 84
      // 61: goto 68
      // 64: invokestatic atg.a (Loov;)Loov;
      // 67: athrow
      // 68: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_fillNormal Lnet/optifine/reflect/ReflectorMethod;
      // 6b: bipush 2
      // 6c: anewarray 16
      // 6f: dup
      // 70: bipush 0
      // 71: aload 11
      // 73: aastore
      // 74: dup
      // 75: bipush 1
      // 76: aload 12
      // 78: aastore
      // 79: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 7c: goto 83
      // 7f: invokestatic atg.a (Loov;)Loov;
      // 82: athrow
      // 83: pop
      // 84: new oa4
      // 87: dup
      // 88: aload 11
      // 8a: aload 3
      // 8b: getfield e97.tho I
      // 8e: aload 12
      // 90: invokespecial oa4.<init> ([IILvt2;)V
      // 93: areturn
   }

   private int[] ujn(e97 var1, sla var2, vt2 var3, float[] var4, yct var5, qoi var6, boolean var7, boolean var8) {
      int var9 = OpaquePredicate.c();
      byte var10 = 28;

      byte var10000;
      label31: {
         label30: {
            try {
               var10000 = hxt.ly3();
               if (var9 != 0) {
                  break label31;
               }

               if (var10000 == 0) {
                  break label30;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            var10 = 56;
         }

         var10000 = var10;
      }

      int[] var11 = new int[var10000];
      int var12 = 0;

      while (var12 < 4) {
         this.i6g(var11, var12, var3, var1, var4, var2, var5, var6, var7, var8);
         var12++;
         if (var9 != 0) {
            break;
         }
      }

      return var11;
   }

   private int iug(vt2 var1) {
      float var2 = o3p(var1);
      int var3 = fe6.faa((int)(var2 * 255.0F), 0, 255);
      return 0xFF000000 | var3 << 16 | var3 << 8 | var3;
   }

   public static float o3p(vt2 var0) {
      int var1 = OpaquePredicate.c();

      label64: {
         label65: {
            int var10000;
            label58: {
               try {
                  var10000 = atg$1.xvk[var0.ordinal()];
                  if (var1 != 0) {
                     break label58;
                  }

                  switch (var10000) {
                     case 1:
                        break;
                     case 2:
                        return 1.0F;
                     case 3:
                     case 4:
                        break label65;
                     case 5:
                     case 6:
                        break label64;
                     default:
                        return 1.0F;
                  }
               } catch (oov var5) {
                  throw a(var5);
               }

               var10000 = hxt.ly3();
            }

            try {
               if (var10000 != 0) {
                  return Shaders.blockLightLevel05;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            return 0.5F;
         }

         try {
            if (hxt.ly3()) {
               return Shaders.blockLightLevel08;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         return 0.8F;
      }

      try {
         if (hxt.ly3()) {
            return Shaders.blockLightLevel06;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return 0.6F;
   }

   private float[] tg_(Vector3f var1, Vector3f var2) {
      float[] var3 = new float[vt2.values().length];
      var3[jw8$bre.hw2] = var1.x / 16.0F;
      var3[jw8$bre.qnb] = var1.y / 16.0F;
      var3[jw8$bre.ul3] = var1.z / 16.0F;
      var3[jw8$bre.uky] = var2.x / 16.0F;
      var3[jw8$bre.ip2] = var2.y / 16.0F;
      var3[jw8$bre.mxd] = var2.z / 16.0F;
      return var3;
   }

   private void i6g(int[] param1, int param2, vt2 param3, e97 param4, float[] param5, sla param6, yct param7, qoi param8, boolean param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 11
      // 05: aload 7
      // 07: aload 3
      // 08: invokeinterface yct.g7r (Lvt2;)Lvt2; 2
      // 0d: astore 12
      // 0f: iload 10
      // 11: iload 11
      // 13: ifeq 2d
      // 16: ifeq 30
      // 19: goto 20
      // 1c: invokestatic atg.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 12
      // 23: invokespecial atg.iug (Lvt2;)I
      // 26: goto 2d
      // 29: invokestatic atg.a (Loov;)Loov;
      // 2c: athrow
      // 2d: goto 31
      // 30: bipush -1
      // 31: istore 13
      // 33: aload 3
      // 34: invokestatic jw8.hbs (Lvt2;)Ljw8;
      // 37: iload 2
      // 38: invokevirtual jw8.y3x (I)Ljw8$uh0;
      // 3b: astore 14
      // 3d: new org/lwjgl/util/vector/Vector3f
      // 40: dup
      // 41: aload 5
      // 43: aload 14
      // 45: getfield jw8$uh0.mr5 I
      // 48: faload
      // 49: aload 5
      // 4b: aload 14
      // 4d: getfield jw8$uh0.yht I
      // 50: faload
      // 51: aload 5
      // 53: aload 14
      // 55: getfield jw8$uh0.mbu I
      // 58: faload
      // 59: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 5c: astore 15
      // 5e: aload 0
      // 5f: aload 15
      // 61: aload 8
      // 63: invokespecial atg.rt0 (Lorg/lwjgl/util/vector/Vector3f;Lqoi;)V
      // 66: aload 0
      // 67: aload 15
      // 69: aload 3
      // 6a: iload 2
      // 6b: aload 7
      // 6d: iload 9
      // 6f: invokevirtual atg.jl1 (Lorg/lwjgl/util/vector/Vector3f;Lvt2;ILyct;Z)I
      // 72: istore 16
      // 74: aload 15
      // 76: invokestatic net/optifine/model/BlockModelUtils.snapVertexPosition (Lorg/lwjgl/util/vector/Vector3f;)V
      // 79: aload 0
      // 7a: aload 1
      // 7b: iload 16
      // 7d: iload 2
      // 7e: aload 15
      // 80: iload 13
      // 82: aload 6
      // 84: aload 4
      // 86: getfield e97.hi7 Ly3k;
      // 89: invokespecial atg._wg ([IIILorg/lwjgl/util/vector/Vector3f;ILsla;Ly3k;)V
      // 8c: return
   }

   private void _wg(int[] var1, int var2, int var3, Vector3f var4, int var5, sla var6, y3k var7) {
      int var8 = var1.length / 4;
      int var9 = var2 * var8;
      var1[var9] = Float.floatToRawIntBits(var4.x);
      var1[var9 + 1] = Float.floatToRawIntBits(var4.y);
      var1[var9 + 2] = Float.floatToRawIntBits(var4.z);
      var1[var9 + 3] = var5;
      var1[var9 + 4] = Float.floatToRawIntBits(var6.oon((double)var7.f81(var3) * 0.999 + (double)var7.f81((var3 + 2) % 4) * 0.001));
      var1[var9 + 4 + 1] = Float.floatToRawIntBits(var6.h0c((double)var7.tek(var3) * 0.999 + (double)var7.tek((var3 + 2) % 4) * 0.001));
   }

   private void rt0(Vector3f param1, qoi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 2
      // 005: ifnull 14f
      // 008: aload 0
      // 009: invokespecial atg.u0t ()Lorg/lwjgl/util/vector/Matrix4f;
      // 00c: astore 4
      // 00e: new org/lwjgl/util/vector/Vector3f
      // 011: dup
      // 012: fconst_0
      // 013: fconst_0
      // 014: fconst_0
      // 015: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 018: astore 5
      // 01a: getstatic atg$1.m0m [I
      // 01d: aload 2
      // 01e: getfield qoi.c94 Lvt2$y0s;
      // 021: invokevirtual vt2$y0s.ordinal ()I
      // 024: iaload
      // 025: iload 3
      // 026: ifeq 0cf
      // 029: tableswitch 162 1 3 31 76 121
      // 044: invokestatic atg.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 2
      // 049: getfield qoi.r3a F
      // 04c: ldc 0.017453292
      // 04e: nop
      // 04f: fmul
      // 050: new org/lwjgl/util/vector/Vector3f
      // 053: dup
      // 054: fconst_1
      // 055: fconst_0
      // 056: fconst_0
      // 057: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 05a: aload 4
      // 05c: aload 4
      // 05e: invokestatic org/lwjgl/util/vector/Matrix4f.rotate (FLorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Matrix4f;Lorg/lwjgl/util/vector/Matrix4f;)Lorg/lwjgl/util/vector/Matrix4f;
      // 061: pop
      // 062: aload 5
      // 064: fconst_0
      // 065: fconst_1
      // 066: fconst_1
      // 067: invokevirtual org/lwjgl/util/vector/Vector3f.set (FFF)V
      // 06a: iload 3
      // 06b: ifne 0cb
      // 06e: goto 075
      // 071: invokestatic atg.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 2
      // 076: getfield qoi.r3a F
      // 079: ldc 0.017453292
      // 07b: nop
      // 07c: fmul
      // 07d: new org/lwjgl/util/vector/Vector3f
      // 080: dup
      // 081: fconst_0
      // 082: fconst_1
      // 083: fconst_0
      // 084: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 087: aload 4
      // 089: aload 4
      // 08b: invokestatic org/lwjgl/util/vector/Matrix4f.rotate (FLorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Matrix4f;Lorg/lwjgl/util/vector/Matrix4f;)Lorg/lwjgl/util/vector/Matrix4f;
      // 08e: pop
      // 08f: aload 5
      // 091: fconst_1
      // 092: fconst_0
      // 093: fconst_1
      // 094: invokevirtual org/lwjgl/util/vector/Vector3f.set (FFF)V
      // 097: iload 3
      // 098: ifne 0cb
      // 09b: goto 0a2
      // 09e: invokestatic atg.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 2
      // 0a3: getfield qoi.r3a F
      // 0a6: ldc 0.017453292
      // 0a8: nop
      // 0a9: fmul
      // 0aa: new org/lwjgl/util/vector/Vector3f
      // 0ad: dup
      // 0ae: fconst_0
      // 0af: fconst_0
      // 0b0: fconst_1
      // 0b1: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 0b4: aload 4
      // 0b6: aload 4
      // 0b8: invokestatic org/lwjgl/util/vector/Matrix4f.rotate (FLorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Matrix4f;Lorg/lwjgl/util/vector/Matrix4f;)Lorg/lwjgl/util/vector/Matrix4f;
      // 0bb: pop
      // 0bc: aload 5
      // 0be: fconst_1
      // 0bf: fconst_1
      // 0c0: fconst_0
      // 0c1: invokevirtual org/lwjgl/util/vector/Vector3f.set (FFF)V
      // 0c4: goto 0cb
      // 0c7: invokestatic atg.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 2
      // 0cc: getfield qoi.b3y Z
      // 0cf: iload 3
      // 0d0: ifeq 0ef
      // 0d3: ifeq 12c
      // 0d6: goto 0dd
      // 0d9: invokestatic atg.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 2
      // 0de: getfield qoi.r3a F
      // 0e1: invokestatic java/lang/Math.abs (F)F
      // 0e4: ldc 22.5
      // 0e6: nop
      // 0e7: fcmpl
      // 0e8: goto 0ef
      // 0eb: invokestatic atg.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: ifne 106
      // 0f2: aload 5
      // 0f4: getstatic atg.t61 F
      // 0f7: invokevirtual org/lwjgl/util/vector/Vector3f.scale (F)Lorg/lwjgl/util/vector/Vector;
      // 0fa: pop
      // 0fb: iload 3
      // 0fc: ifne 116
      // 0ff: goto 106
      // 102: invokestatic atg.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 5
      // 108: getstatic atg.itv F
      // 10b: invokevirtual org/lwjgl/util/vector/Vector3f.scale (F)Lorg/lwjgl/util/vector/Vector;
      // 10e: pop
      // 10f: goto 116
      // 112: invokestatic atg.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 5
      // 118: new org/lwjgl/util/vector/Vector3f
      // 11b: dup
      // 11c: fconst_1
      // 11d: fconst_1
      // 11e: fconst_1
      // 11f: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 122: aload 5
      // 124: invokestatic org/lwjgl/util/vector/Vector3f.add (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;)Lorg/lwjgl/util/vector/Vector3f;
      // 127: pop
      // 128: iload 3
      // 129: ifne 13b
      // 12c: aload 5
      // 12e: fconst_1
      // 12f: fconst_1
      // 130: fconst_1
      // 131: invokevirtual org/lwjgl/util/vector/Vector3f.set (FFF)V
      // 134: goto 13b
      // 137: invokestatic atg.a (Loov;)Loov;
      // 13a: athrow
      // 13b: aload 0
      // 13c: aload 1
      // 13d: new org/lwjgl/util/vector/Vector3f
      // 140: dup
      // 141: aload 2
      // 142: getfield qoi.qnc Lorg/lwjgl/util/vector/Vector3f;
      // 145: invokespecial org/lwjgl/util/vector/Vector3f.<init> (Lorg/lwjgl/util/vector/ReadableVector3f;)V
      // 148: aload 4
      // 14a: aload 5
      // 14c: invokespecial atg.q2r (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Matrix4f;Lorg/lwjgl/util/vector/Vector3f;)V
      // 14f: return
   }

   public int wg6(Vector3f var1, vt2 var2, int var3, xup var4, boolean var5) {
      return this.wg6(var1, var2, var3, var4, var5);
   }

   public int jl1(Vector3f param1, vt2 param2, int param3, yct param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 4
      // 07: getstatic xup.qjk Lxup;
      // 0a: if_acmpne 13
      // 0d: iload 3
      // 0e: ireturn
      // 0f: invokestatic atg.a (Loov;)Loov;
      // 12: athrow
      // 13: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_transform Lnet/optifine/reflect/ReflectorMethod;
      // 16: iload 6
      // 18: ifne 47
      // 1b: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 1e: ifeq 4d
      // 21: goto 28
      // 24: invokestatic atg.a (Loov;)Loov;
      // 27: athrow
      // 28: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_transform Lnet/optifine/reflect/ReflectorMethod;
      // 2b: bipush 2
      // 2c: anewarray 16
      // 2f: dup
      // 30: bipush 0
      // 31: aload 1
      // 32: aastore
      // 33: dup
      // 34: bipush 1
      // 35: aload 4
      // 37: invokeinterface yct.e5c ()Lkrg; 1
      // 3c: aastore
      // 3d: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 40: goto 47
      // 43: invokestatic atg.a (Loov;)Loov;
      // 46: athrow
      // 47: pop
      // 48: iload 6
      // 4a: ifeq 7b
      // 4d: aload 0
      // 4e: aload 1
      // 4f: new org/lwjgl/util/vector/Vector3f
      // 52: dup
      // 53: ldc 0.5
      // 55: nop
      // 56: ldc 0.5
      // 58: nop
      // 59: ldc 0.5
      // 5b: nop
      // 5c: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 5f: aload 4
      // 61: checkcast xup
      // 64: invokevirtual xup.hz2 ()Lorg/lwjgl/util/vector/Matrix4f;
      // 67: new org/lwjgl/util/vector/Vector3f
      // 6a: dup
      // 6b: fconst_1
      // 6c: fconst_1
      // 6d: fconst_1
      // 6e: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 71: invokespecial atg.q2r (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Matrix4f;Lorg/lwjgl/util/vector/Vector3f;)V
      // 74: goto 7b
      // 77: invokestatic atg.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 4
      // 7d: aload 2
      // 7e: iload 3
      // 7f: invokeinterface yct.b8i (Lvt2;I)I 3
      // 84: ireturn
   }

   private void q2r(Vector3f var1, Vector3f var2, Matrix4f var3, Vector3f var4) {
      Vector4f var5 = new Vector4f(var1.x - var2.x, var1.y - var2.y, var1.z - var2.z, 1.0F);
      Matrix4f.transform(var3, var5, var5);
      var5.x = var5.x * var4.x;
      var5.y = var5.y * var4.y;
      var5.z = var5.z * var4.z;
      var1.set(var5.x + var2.x, var5.y + var2.y, var5.z + var2.z);
   }

   private Matrix4f u0t() {
      Matrix4f var1 = new Matrix4f();
      var1.setIdentity();
      return var1;
   }

   public static vt2 g9d(int[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: arraylength
      // 002: bipush 4
      // 003: idiv
      // 004: istore 2
      // 005: iload 2
      // 006: bipush 2
      // 007: imul
      // 008: istore 3
      // 009: iload 2
      // 00a: bipush 3
      // 00b: imul
      // 00c: istore 4
      // 00e: new org/lwjgl/util/vector/Vector3f
      // 011: dup
      // 012: aload 0
      // 013: bipush 0
      // 014: iaload
      // 015: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 018: aload 0
      // 019: bipush 1
      // 01a: iaload
      // 01b: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 01e: aload 0
      // 01f: bipush 2
      // 020: iaload
      // 021: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 024: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 027: astore 5
      // 029: new org/lwjgl/util/vector/Vector3f
      // 02c: dup
      // 02d: aload 0
      // 02e: iload 2
      // 02f: iaload
      // 030: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 033: aload 0
      // 034: iload 2
      // 035: bipush 1
      // 036: iadd
      // 037: iaload
      // 038: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 03b: aload 0
      // 03c: iload 2
      // 03d: bipush 2
      // 03e: iadd
      // 03f: iaload
      // 040: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 043: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 046: astore 6
      // 048: new org/lwjgl/util/vector/Vector3f
      // 04b: dup
      // 04c: aload 0
      // 04d: iload 3
      // 04e: iaload
      // 04f: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 052: aload 0
      // 053: iload 3
      // 054: bipush 1
      // 055: iadd
      // 056: iaload
      // 057: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 05a: aload 0
      // 05b: iload 3
      // 05c: bipush 2
      // 05d: iadd
      // 05e: iaload
      // 05f: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 062: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 065: astore 7
      // 067: new org/lwjgl/util/vector/Vector3f
      // 06a: dup
      // 06b: invokespecial org/lwjgl/util/vector/Vector3f.<init> ()V
      // 06e: astore 8
      // 070: new org/lwjgl/util/vector/Vector3f
      // 073: dup
      // 074: invokespecial org/lwjgl/util/vector/Vector3f.<init> ()V
      // 077: astore 9
      // 079: new org/lwjgl/util/vector/Vector3f
      // 07c: dup
      // 07d: invokespecial org/lwjgl/util/vector/Vector3f.<init> ()V
      // 080: astore 10
      // 082: aload 5
      // 084: aload 6
      // 086: aload 8
      // 088: invokestatic org/lwjgl/util/vector/Vector3f.sub (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;)Lorg/lwjgl/util/vector/Vector3f;
      // 08b: pop
      // 08c: aload 7
      // 08e: aload 6
      // 090: aload 9
      // 092: invokestatic org/lwjgl/util/vector/Vector3f.sub (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;)Lorg/lwjgl/util/vector/Vector3f;
      // 095: pop
      // 096: aload 9
      // 098: aload 8
      // 09a: aload 10
      // 09c: invokestatic org/lwjgl/util/vector/Vector3f.cross (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;)Lorg/lwjgl/util/vector/Vector3f;
      // 09f: pop
      // 0a0: aload 10
      // 0a2: getfield org/lwjgl/util/vector/Vector3f.x F
      // 0a5: aload 10
      // 0a7: getfield org/lwjgl/util/vector/Vector3f.x F
      // 0aa: fmul
      // 0ab: aload 10
      // 0ad: getfield org/lwjgl/util/vector/Vector3f.y F
      // 0b0: aload 10
      // 0b2: getfield org/lwjgl/util/vector/Vector3f.y F
      // 0b5: fmul
      // 0b6: fadd
      // 0b7: aload 10
      // 0b9: getfield org/lwjgl/util/vector/Vector3f.z F
      // 0bc: aload 10
      // 0be: getfield org/lwjgl/util/vector/Vector3f.z F
      // 0c1: fmul
      // 0c2: fadd
      // 0c3: f2d
      // 0c4: invokestatic java/lang/Math.sqrt (D)D
      // 0c7: d2f
      // 0c8: fstore 11
      // 0ca: invokestatic OpaquePredicate.c ()I
      // 0cd: aload 10
      // 0cf: dup
      // 0d0: getfield org/lwjgl/util/vector/Vector3f.x F
      // 0d3: fload 11
      // 0d5: fdiv
      // 0d6: putfield org/lwjgl/util/vector/Vector3f.x F
      // 0d9: aload 10
      // 0db: dup
      // 0dc: getfield org/lwjgl/util/vector/Vector3f.y F
      // 0df: fload 11
      // 0e1: fdiv
      // 0e2: putfield org/lwjgl/util/vector/Vector3f.y F
      // 0e5: aload 10
      // 0e7: dup
      // 0e8: getfield org/lwjgl/util/vector/Vector3f.z F
      // 0eb: fload 11
      // 0ed: fdiv
      // 0ee: putfield org/lwjgl/util/vector/Vector3f.z F
      // 0f1: aconst_null
      // 0f2: astore 12
      // 0f4: fconst_0
      // 0f5: fstore 13
      // 0f7: istore 1
      // 0f8: invokestatic vt2.values ()[Lvt2;
      // 0fb: astore 14
      // 0fd: aload 14
      // 0ff: arraylength
      // 100: istore 15
      // 102: bipush 0
      // 103: istore 16
      // 105: iload 16
      // 107: iload 15
      // 109: if_icmpge 18b
      // 10c: aload 14
      // 10e: iload 16
      // 110: aaload
      // 111: astore 17
      // 113: aload 17
      // 115: invokevirtual vt2.et1 ()Lwgo;
      // 118: astore 18
      // 11a: new org/lwjgl/util/vector/Vector3f
      // 11d: dup
      // 11e: aload 18
      // 120: invokevirtual wgo.getX ()I
      // 123: i2f
      // 124: aload 18
      // 126: invokevirtual wgo.getY ()I
      // 129: i2f
      // 12a: aload 18
      // 12c: invokevirtual wgo.getZ ()I
      // 12f: i2f
      // 130: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 133: astore 19
      // 135: aload 10
      // 137: aload 19
      // 139: invokestatic org/lwjgl/util/vector/Vector3f.dot (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;)F
      // 13c: fstore 20
      // 13e: iload 1
      // 13f: ifne 1a3
      // 142: iload 1
      // 143: ifne 187
      // 146: goto 14d
      // 149: invokestatic atg.a (Loov;)Loov;
      // 14c: athrow
      // 14d: fload 20
      // 14f: fconst_0
      // 150: fcmpl
      // 151: iflt 184
      // 154: goto 15b
      // 157: invokestatic atg.a (Loov;)Loov;
      // 15a: athrow
      // 15b: fload 20
      // 15d: iload 1
      // 15e: ifne 17e
      // 161: goto 168
      // 164: invokestatic atg.a (Loov;)Loov;
      // 167: athrow
      // 168: fload 13
      // 16a: fcmpl
      // 16b: ifle 184
      // 16e: goto 175
      // 171: invokestatic atg.a (Loov;)Loov;
      // 174: athrow
      // 175: fload 20
      // 177: goto 17e
      // 17a: invokestatic atg.a (Loov;)Loov;
      // 17d: athrow
      // 17e: fstore 13
      // 180: aload 17
      // 182: astore 12
      // 184: iinc 16 1
      // 187: iload 1
      // 188: ifeq 105
      // 18b: aload 12
      // 18d: iload 1
      // 18e: ifne 1a5
      // 191: ifnonnull 1a3
      // 194: goto 19b
      // 197: invokestatic atg.a (Loov;)Loov;
      // 19a: athrow
      // 19b: getstatic vt2.rf3 Lvt2;
      // 19e: areturn
      // 19f: invokestatic atg.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: aload 12
      // 1a5: areturn
   }

   public void oxk(int[] var1, vt2 var2, y3k var3, sla var4) {
      int var5 = OpaquePredicate.c();
      int var6 = 0;

      while (var6 < 4) {
         this.k_5(var6, var1, var2, var3, var4);
         var6++;
         if (var5 != 0) {
            break;
         }
      }
   }

   private void zrz(int[] param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: arraylength
      // 002: newarray 10
      // 004: astore 4
      // 006: aload 1
      // 007: bipush 0
      // 008: aload 4
      // 00a: bipush 0
      // 00b: aload 1
      // 00c: arraylength
      // 00d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: invokestatic vt2.values ()[Lvt2;
      // 016: arraylength
      // 017: newarray 6
      // 019: astore 5
      // 01b: aload 5
      // 01d: getstatic jw8$bre.hw2 I
      // 020: ldc 999.0
      // 022: nop
      // 023: fastore
      // 024: aload 5
      // 026: getstatic jw8$bre.qnb I
      // 029: ldc 999.0
      // 02b: nop
      // 02c: fastore
      // 02d: istore 3
      // 02e: aload 5
      // 030: getstatic jw8$bre.ul3 I
      // 033: ldc 999.0
      // 035: nop
      // 036: fastore
      // 037: aload 5
      // 039: getstatic jw8$bre.uky I
      // 03c: ldc -999.0
      // 03e: nop
      // 03f: fastore
      // 040: aload 5
      // 042: getstatic jw8$bre.ip2 I
      // 045: ldc -999.0
      // 047: nop
      // 048: fastore
      // 049: aload 5
      // 04b: getstatic jw8$bre.mxd I
      // 04e: ldc -999.0
      // 050: nop
      // 051: fastore
      // 052: aload 1
      // 053: arraylength
      // 054: bipush 4
      // 055: idiv
      // 056: istore 6
      // 058: bipush 0
      // 059: istore 7
      // 05b: iload 7
      // 05d: bipush 4
      // 05e: if_icmpge 16a
      // 061: iload 6
      // 063: iload 7
      // 065: imul
      // 066: istore 8
      // 068: aload 4
      // 06a: iload 8
      // 06c: iaload
      // 06d: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 070: fstore 9
      // 072: aload 4
      // 074: iload 8
      // 076: bipush 1
      // 077: iadd
      // 078: iaload
      // 079: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 07c: fstore 10
      // 07e: aload 4
      // 080: iload 8
      // 082: bipush 2
      // 083: iadd
      // 084: iaload
      // 085: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 088: fstore 11
      // 08a: fload 9
      // 08c: aload 5
      // 08e: getstatic jw8$bre.hw2 I
      // 091: faload
      // 092: fcmpg
      // 093: iload 3
      // 094: ifne 0b9
      // 097: ifge 0b0
      // 09a: goto 0a1
      // 09d: invokestatic atg.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 5
      // 0a3: getstatic jw8$bre.hw2 I
      // 0a6: fload 9
      // 0a8: fastore
      // 0a9: goto 0b0
      // 0ac: invokestatic atg.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: fload 10
      // 0b2: aload 5
      // 0b4: getstatic jw8$bre.qnb I
      // 0b7: faload
      // 0b8: fcmpg
      // 0b9: iload 3
      // 0ba: ifne 0df
      // 0bd: ifge 0d6
      // 0c0: goto 0c7
      // 0c3: invokestatic atg.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 5
      // 0c9: getstatic jw8$bre.qnb I
      // 0cc: fload 10
      // 0ce: fastore
      // 0cf: goto 0d6
      // 0d2: invokestatic atg.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: fload 11
      // 0d8: aload 5
      // 0da: getstatic jw8$bre.ul3 I
      // 0dd: faload
      // 0de: fcmpg
      // 0df: iload 3
      // 0e0: ifne 105
      // 0e3: ifge 0fc
      // 0e6: goto 0ed
      // 0e9: invokestatic atg.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 5
      // 0ef: getstatic jw8$bre.ul3 I
      // 0f2: fload 11
      // 0f4: fastore
      // 0f5: goto 0fc
      // 0f8: invokestatic atg.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: fload 9
      // 0fe: aload 5
      // 100: getstatic jw8$bre.uky I
      // 103: faload
      // 104: fcmpl
      // 105: iload 3
      // 106: ifne 12b
      // 109: ifle 122
      // 10c: goto 113
      // 10f: invokestatic atg.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 5
      // 115: getstatic jw8$bre.uky I
      // 118: fload 9
      // 11a: fastore
      // 11b: goto 122
      // 11e: invokestatic atg.a (Loov;)Loov;
      // 121: athrow
      // 122: fload 10
      // 124: aload 5
      // 126: getstatic jw8$bre.ip2 I
      // 129: faload
      // 12a: fcmpl
      // 12b: iload 3
      // 12c: ifne 151
      // 12f: ifle 148
      // 132: goto 139
      // 135: invokestatic atg.a (Loov;)Loov;
      // 138: athrow
      // 139: aload 5
      // 13b: getstatic jw8$bre.ip2 I
      // 13e: fload 10
      // 140: fastore
      // 141: goto 148
      // 144: invokestatic atg.a (Loov;)Loov;
      // 147: athrow
      // 148: fload 11
      // 14a: aload 5
      // 14c: getstatic jw8$bre.mxd I
      // 14f: faload
      // 150: fcmpl
      // 151: ifle 163
      // 154: aload 5
      // 156: getstatic jw8$bre.mxd I
      // 159: fload 11
      // 15b: fastore
      // 15c: goto 163
      // 15f: invokestatic atg.a (Loov;)Loov;
      // 162: athrow
      // 163: iinc 7 1
      // 166: iload 3
      // 167: ifeq 05b
      // 16a: aload 2
      // 16b: invokestatic jw8.hbs (Lvt2;)Ljw8;
      // 16e: astore 7
      // 170: bipush 0
      // 171: istore 8
      // 173: iload 8
      // 175: bipush 4
      // 176: if_icmpge 271
      // 179: iload 6
      // 17b: iload 8
      // 17d: imul
      // 17e: istore 9
      // 180: aload 7
      // 182: iload 8
      // 184: invokevirtual jw8.y3x (I)Ljw8$uh0;
      // 187: astore 10
      // 189: aload 5
      // 18b: aload 10
      // 18d: getfield jw8$uh0.mr5 I
      // 190: faload
      // 191: fstore 11
      // 193: aload 5
      // 195: aload 10
      // 197: getfield jw8$uh0.yht I
      // 19a: faload
      // 19b: fstore 12
      // 19d: aload 5
      // 19f: aload 10
      // 1a1: getfield jw8$uh0.mbu I
      // 1a4: faload
      // 1a5: fstore 13
      // 1a7: aload 1
      // 1a8: iload 9
      // 1aa: fload 11
      // 1ac: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 1af: iastore
      // 1b0: aload 1
      // 1b1: iload 9
      // 1b3: bipush 1
      // 1b4: iadd
      // 1b5: fload 12
      // 1b7: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 1ba: iastore
      // 1bb: aload 1
      // 1bc: iload 9
      // 1be: bipush 2
      // 1bf: iadd
      // 1c0: fload 13
      // 1c2: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 1c5: iastore
      // 1c6: bipush 0
      // 1c7: istore 14
      // 1c9: iload 14
      // 1cb: bipush 4
      // 1cc: if_icmpge 26a
      // 1cf: iload 6
      // 1d1: iload 14
      // 1d3: imul
      // 1d4: istore 15
      // 1d6: aload 4
      // 1d8: iload 15
      // 1da: iaload
      // 1db: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 1de: fstore 16
      // 1e0: aload 4
      // 1e2: iload 15
      // 1e4: bipush 1
      // 1e5: iadd
      // 1e6: iaload
      // 1e7: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 1ea: fstore 17
      // 1ec: aload 4
      // 1ee: iload 15
      // 1f0: bipush 2
      // 1f1: iadd
      // 1f2: iaload
      // 1f3: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 1f6: fstore 18
      // 1f8: iload 3
      // 1f9: ifne 266
      // 1fc: fload 11
      // 1fe: fload 16
      // 200: invokestatic fe6.fa2 (FF)Z
      // 203: iload 3
      // 204: ifne 175
      // 207: goto 20e
      // 20a: invokestatic atg.a (Loov;)Loov;
      // 20d: athrow
      // 20e: ifeq 263
      // 211: fload 12
      // 213: fload 17
      // 215: invokestatic fe6.fa2 (FF)Z
      // 218: iload 3
      // 219: ifne 23b
      // 21c: goto 223
      // 21f: invokestatic atg.a (Loov;)Loov;
      // 222: athrow
      // 223: ifeq 263
      // 226: goto 22d
      // 229: invokestatic atg.a (Loov;)Loov;
      // 22c: athrow
      // 22d: fload 13
      // 22f: fload 18
      // 231: invokestatic fe6.fa2 (FF)Z
      // 234: goto 23b
      // 237: invokestatic atg.a (Loov;)Loov;
      // 23a: athrow
      // 23b: ifeq 263
      // 23e: aload 1
      // 23f: iload 9
      // 241: bipush 4
      // 242: iadd
      // 243: aload 4
      // 245: iload 15
      // 247: bipush 4
      // 248: iadd
      // 249: iaload
      // 24a: iastore
      // 24b: aload 1
      // 24c: iload 9
      // 24e: bipush 4
      // 24f: iadd
      // 250: bipush 1
      // 251: iadd
      // 252: aload 4
      // 254: iload 15
      // 256: bipush 4
      // 257: iadd
      // 258: bipush 1
      // 259: iadd
      // 25a: iaload
      // 25b: iastore
      // 25c: goto 263
      // 25f: invokestatic atg.a (Loov;)Loov;
      // 262: athrow
      // 263: iinc 14 1
      // 266: iload 3
      // 267: ifeq 1c9
      // 26a: iinc 8 1
      // 26d: iload 3
      // 26e: ifeq 173
      // 271: return
   }

   private void k_5(int param1, int[] param2, vt2 param3, y3k param4, sla param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: arraylength
      // 002: bipush 4
      // 003: idiv
      // 004: istore 7
      // 006: iload 7
      // 008: iload 1
      // 009: imul
      // 00a: istore 8
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: aload 2
      // 010: iload 8
      // 012: iaload
      // 013: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 016: fstore 9
      // 018: aload 2
      // 019: iload 8
      // 01b: bipush 1
      // 01c: iadd
      // 01d: iaload
      // 01e: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 021: fstore 10
      // 023: aload 2
      // 024: iload 8
      // 026: bipush 2
      // 027: iadd
      // 028: iaload
      // 029: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 02c: fstore 11
      // 02e: istore 6
      // 030: fload 9
      // 032: ldc -0.1
      // 034: nop
      // 035: iload 6
      // 037: ifne 070
      // 03a: fcmpg
      // 03b: iflt 061
      // 03e: goto 045
      // 041: invokestatic atg.a (Loov;)Loov;
      // 044: athrow
      // 045: fload 9
      // 047: ldc 1.1
      // 049: nop
      // 04a: fcmpl
      // 04b: iload 6
      // 04d: ifne 085
      // 050: goto 057
      // 053: invokestatic atg.a (Loov;)Loov;
      // 056: athrow
      // 057: iflt 073
      // 05a: goto 061
      // 05d: invokestatic atg.a (Loov;)Loov;
      // 060: athrow
      // 061: fload 9
      // 063: fload 9
      // 065: invokestatic fe6.tpk (F)I
      // 068: i2f
      // 069: goto 070
      // 06c: invokestatic atg.a (Loov;)Loov;
      // 06f: athrow
      // 070: fsub
      // 071: fstore 9
      // 073: fload 10
      // 075: ldc -0.1
      // 077: nop
      // 078: iload 6
      // 07a: ifne 0b3
      // 07d: fcmpg
      // 07e: goto 085
      // 081: invokestatic atg.a (Loov;)Loov;
      // 084: athrow
      // 085: iflt 0a4
      // 088: fload 10
      // 08a: ldc 1.1
      // 08c: nop
      // 08d: fcmpl
      // 08e: iload 6
      // 090: ifne 0c8
      // 093: goto 09a
      // 096: invokestatic atg.a (Loov;)Loov;
      // 099: athrow
      // 09a: iflt 0b6
      // 09d: goto 0a4
      // 0a0: invokestatic atg.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: fload 10
      // 0a6: fload 10
      // 0a8: invokestatic fe6.tpk (F)I
      // 0ab: i2f
      // 0ac: goto 0b3
      // 0af: invokestatic atg.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: fsub
      // 0b4: fstore 10
      // 0b6: fload 11
      // 0b8: ldc -0.1
      // 0ba: nop
      // 0bb: iload 6
      // 0bd: ifne 0f6
      // 0c0: fcmpg
      // 0c1: goto 0c8
      // 0c4: invokestatic atg.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iflt 0e7
      // 0cb: fload 11
      // 0cd: iload 6
      // 0cf: ifne 0fa
      // 0d2: goto 0d9
      // 0d5: invokestatic atg.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: ldc 1.1
      // 0db: nop
      // 0dc: fcmpl
      // 0dd: iflt 0f9
      // 0e0: goto 0e7
      // 0e3: invokestatic atg.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: fload 11
      // 0e9: fload 11
      // 0eb: invokestatic fe6.tpk (F)I
      // 0ee: i2f
      // 0ef: goto 0f6
      // 0f2: invokestatic atg.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: fsub
      // 0f7: fstore 11
      // 0f9: fconst_0
      // 0fa: fstore 12
      // 0fc: fconst_0
      // 0fd: fstore 13
      // 0ff: getstatic atg$1.xvk [I
      // 102: aload 3
      // 103: invokevirtual vt2.ordinal ()I
      // 106: iaload
      // 107: iload 6
      // 109: ifne 1c8
      // 10c: tableswitch 179 1 6 44 67 88 113 136 159
      // 134: invokestatic atg.a (Loov;)Loov;
      // 137: athrow
      // 138: fload 9
      // 13a: ldc 16.0
      // 13c: nop
      // 13d: fmul
      // 13e: fstore 12
      // 140: fconst_1
      // 141: fload 11
      // 143: fsub
      // 144: ldc 16.0
      // 146: nop
      // 147: fmul
      // 148: fstore 13
      // 14a: iload 6
      // 14c: ifeq 1bf
      // 14f: fload 9
      // 151: ldc 16.0
      // 153: nop
      // 154: fmul
      // 155: fstore 12
      // 157: fload 11
      // 159: ldc 16.0
      // 15b: nop
      // 15c: fmul
      // 15d: fstore 13
      // 15f: iload 6
      // 161: ifeq 1bf
      // 164: fconst_1
      // 165: fload 9
      // 167: fsub
      // 168: ldc 16.0
      // 16a: nop
      // 16b: fmul
      // 16c: fstore 12
      // 16e: fconst_1
      // 16f: fload 10
      // 171: fsub
      // 172: ldc 16.0
      // 174: nop
      // 175: fmul
      // 176: fstore 13
      // 178: iload 6
      // 17a: ifeq 1bf
      // 17d: fload 9
      // 17f: ldc 16.0
      // 181: nop
      // 182: fmul
      // 183: fstore 12
      // 185: fconst_1
      // 186: fload 10
      // 188: fsub
      // 189: ldc 16.0
      // 18b: nop
      // 18c: fmul
      // 18d: fstore 13
      // 18f: iload 6
      // 191: ifeq 1bf
      // 194: fload 11
      // 196: ldc 16.0
      // 198: nop
      // 199: fmul
      // 19a: fstore 12
      // 19c: fconst_1
      // 19d: fload 10
      // 19f: fsub
      // 1a0: ldc 16.0
      // 1a2: nop
      // 1a3: fmul
      // 1a4: fstore 13
      // 1a6: iload 6
      // 1a8: ifeq 1bf
      // 1ab: fconst_1
      // 1ac: fload 11
      // 1ae: fsub
      // 1af: ldc 16.0
      // 1b1: nop
      // 1b2: fmul
      // 1b3: fstore 12
      // 1b5: fconst_1
      // 1b6: fload 10
      // 1b8: fsub
      // 1b9: ldc 16.0
      // 1bb: nop
      // 1bc: fmul
      // 1bd: fstore 13
      // 1bf: aload 4
      // 1c1: iload 1
      // 1c2: invokevirtual y3k.tg7 (I)I
      // 1c5: iload 7
      // 1c7: imul
      // 1c8: istore 14
      // 1ca: aload 2
      // 1cb: iload 14
      // 1cd: bipush 4
      // 1ce: iadd
      // 1cf: aload 5
      // 1d1: fload 12
      // 1d3: f2d
      // 1d4: invokevirtual sla.oon (D)F
      // 1d7: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 1da: iastore
      // 1db: aload 2
      // 1dc: iload 14
      // 1de: bipush 4
      // 1df: iadd
      // 1e0: bipush 1
      // 1e1: iadd
      // 1e2: aload 5
      // 1e4: fload 13
      // 1e6: f2d
      // 1e7: invokevirtual sla.h0c (D)F
      // 1ea: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 1ed: iastore
      // 1ee: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
