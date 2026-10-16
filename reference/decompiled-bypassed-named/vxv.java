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

public class vxv extends Module {
   public static NumberSetting khf;
   public static BooleanSetting uik;
   public static BooleanSetting b0n;
   public static BooleanSetting x78;
   public static BooleanSetting mt1;
   public static BooleanSetting zqa;
   public static BooleanSetting _4g;
   public static NumberSetting mmn;
   public static boolean o8s;
   public SettingCategory a6z;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public vxv() {
      long var1 = a ^ 77688599144077L;
      super(b<"h">(25689, 3261108154196897650L ^ var1), _aj.p3z, false, new SubEngine[0]);
      this.a6z = new SettingCategory(ek1.oxn.sy5, 0.4F);
   }

   @EventHandler
   private void nkv(b5k param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic vxv.ek1 Lc05;
      // 07: getfield Minecraft.tij Lkh3;
      // 0a: getfield WorldClient.rpk Ljava/util/List;
      // 0d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 12: astore 3
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 6a
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast ha9
      // 25: astore 4
      // 27: aload 0
      // 28: aload 4
      // 2a: aload 1
      // 2b: invokevirtual b5k._x5 ()F
      // 2e: aload 0
      // 2f: pop
      // 30: getstatic vxv.khf Lcrk;
      // 33: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 36: invokevirtual java/lang/Float.floatValue ()F
      // 39: getstatic ModuleRegistry.kd6 Lohv;
      // 3c: invokevirtual Speed.isEnabled ()Z
      // 3f: iload 2
      // 40: ifeq 5a
      // 43: ifeq 5d
      // 46: goto 4d
      // 49: invokestatic vxv.a (Loov;)Loov;
      // 4c: athrow
      // 4d: getstatic z7e.gwi Lz7e;
      // 50: getfield z7e.k0y I
      // 53: goto 5a
      // 56: invokestatic vxv.a (Loov;)Loov;
      // 59: athrow
      // 5a: goto 63
      // 5d: getstatic z7e.a2_ Lz7e;
      // 60: getfield z7e.k0y I
      // 63: invokevirtual vxv.hks (Lha9;FFI)V
      // 66: iload 2
      // 67: ifne 13
      // 6a: return
   }

   public void hks(ha9 param1, float param2, float param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 5
      // 005: getstatic vxv.zqa Lcn7;
      // 008: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 00b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00e: ifeq 1d8
      // 011: aload 1
      // 012: iload 5
      // 014: ifeq 036
      // 017: goto 01e
      // 01a: invokestatic vxv.a (Loov;)Loov;
      // 01d: athrow
      // 01e: getstatic vxv.ek1 Lc05;
      // 021: getfield Minecraft.vg8 Ll86;
      // 024: if_acmpeq 1d8
      // 027: goto 02e
      // 02a: invokestatic vxv.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 1
      // 02f: goto 036
      // 032: invokestatic vxv.a (Loov;)Loov;
      // 035: athrow
      // 036: invokevirtual ha9.h5u ()Z
      // 039: iload 5
      // 03b: ifeq 059
      // 03e: ifne 1d8
      // 041: goto 048
      // 044: invokestatic vxv.a (Loov;)Loov;
      // 047: athrow
      // 048: getstatic vxv.ek1 Lc05;
      // 04b: getfield Minecraft.vg8 Ll86;
      // 04e: aload 1
      // 04f: invokevirtual EntityPlayerSP.gq6 (Li2h;)Z
      // 052: goto 059
      // 055: invokestatic vxv.a (Loov;)Loov;
      // 058: athrow
      // 059: iload 5
      // 05b: ifeq 073
      // 05e: ifeq 1d8
      // 061: goto 068
      // 064: invokestatic vxv.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 1
      // 069: invokevirtual ha9.gzr ()Z
      // 06c: goto 073
      // 06f: invokestatic vxv.a (Loov;)Loov;
      // 072: athrow
      // 073: iload 5
      // 075: ifeq 08d
      // 078: ifeq 1d8
      // 07b: goto 082
      // 07e: invokestatic vxv.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 1
      // 083: invokestatic f62.a92 (Lha9;)Z
      // 086: goto 08d
      // 089: invokestatic vxv.a (Loov;)Loov;
      // 08c: athrow
      // 08d: iload 5
      // 08f: ifeq 0a7
      // 092: ifne 1d8
      // 095: goto 09c
      // 098: invokestatic vxv.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 1
      // 09d: invokestatic AntiBots.nqw (Li2h;)Z
      // 0a0: goto 0a7
      // 0a3: invokestatic vxv.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: iload 5
      // 0a9: ifeq 0eb
      // 0ac: ifne 1d8
      // 0af: goto 0b6
      // 0b2: invokestatic vxv.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 0b9: getstatic vxv.ek1 Lc05;
      // 0bc: getfield Minecraft.x0p Lv3i;
      // 0bf: invokevirtual v3i.yvz ()V
      // 0c2: sipush 3553
      // 0c5: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 0c8: sipush 3042
      // 0cb: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 0ce: sipush 770
      // 0d1: sipush 771
      // 0d4: invokestatic org/lwjgl/opengl/GL11.glBlendFunc (II)V
      // 0d7: sipush 2929
      // 0da: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 0dd: sipush 2848
      // 0e0: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 0e3: bipush 0
      // 0e4: goto 0eb
      // 0e7: invokestatic vxv.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 0ee: aload 1
      // 0ef: getfield ha9.ivp D
      // 0f2: aload 1
      // 0f3: getfield ha9.o2v D
      // 0f6: aload 1
      // 0f7: getfield ha9.ivp D
      // 0fa: dsub
      // 0fb: fload 2
      // 0fc: f2d
      // 0fd: dmul
      // 0fe: dadd
      // 0ff: getstatic vxv.ek1 Lc05;
      // 102: invokevirtual Minecraft.ibs ()Lhr_;
      // 105: getfield hr_._3y D
      // 108: dsub
      // 109: dstore 6
      // 10b: aload 1
      // 10c: getfield ha9.c54 D
      // 10f: aload 1
      // 110: getfield ha9.kfp D
      // 113: aload 1
      // 114: getfield ha9.c54 D
      // 117: dsub
      // 118: fload 2
      // 119: f2d
      // 11a: dmul
      // 11b: dadd
      // 11c: getstatic vxv.ek1 Lc05;
      // 11f: invokevirtual Minecraft.ibs ()Lhr_;
      // 122: getfield hr_.b7y D
      // 125: dsub
      // 126: dstore 8
      // 128: aload 1
      // 129: getfield ha9.e2b D
      // 12c: aload 1
      // 12d: getfield ha9.vbd D
      // 130: aload 1
      // 131: getfield ha9.e2b D
      // 134: dsub
      // 135: fload 2
      // 136: f2d
      // 137: dmul
      // 138: dadd
      // 139: getstatic vxv.ek1 Lc05;
      // 13c: invokevirtual Minecraft.ibs ()Lhr_;
      // 13f: getfield hr_.xdg D
      // 142: dsub
      // 143: dstore 10
      // 145: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 148: ldc2_w 6.283185307179586
      // 14b: dstore 12
      // 14d: ldc2_w 45.0
      // 150: dstore 14
      // 152: fconst_2
      // 153: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 156: bipush 1
      // 157: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 15a: bipush 0
      // 15b: istore 16
      // 15d: iload 16
      // 15f: bipush 90
      // 161: if_icmpgt 1aa
      // 164: iload 4
      // 166: invokestatic hhf.rs_ (I)V
      // 169: dload 6
      // 16b: fload 3
      // 16c: f2d
      // 16d: iload 16
      // 16f: i2d
      // 170: ldc2_w 6.283185307179586
      // 173: dmul
      // 174: ldc2_w 45.0
      // 177: ddiv
      // 178: invokestatic java/lang/Math.cos (D)D
      // 17b: dmul
      // 17c: dadd
      // 17d: dload 8
      // 17f: dload 10
      // 181: fload 3
      // 182: f2d
      // 183: iload 16
      // 185: i2d
      // 186: ldc2_w 6.283185307179586
      // 189: dmul
      // 18a: ldc2_w 45.0
      // 18d: ddiv
      // 18e: invokestatic java/lang/Math.sin (D)D
      // 191: dmul
      // 192: dadd
      // 193: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 196: iinc 16 1
      // 199: iload 5
      // 19b: ifeq 1d5
      // 19e: iload 5
      // 1a0: ifne 15d
      // 1a3: goto 1aa
      // 1a6: invokestatic vxv.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 1ad: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 1b0: bipush 1
      // 1b1: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 1b4: sipush 2848
      // 1b7: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 1ba: sipush 2929
      // 1bd: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 1c0: sipush 3042
      // 1c3: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 1c6: sipush 3553
      // 1c9: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 1cc: getstatic vxv.ek1 Lc05;
      // 1cf: getfield Minecraft.x0p Lv3i;
      // 1d2: invokevirtual v3i.u_c ()V
      // 1d5: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 1d8: return
   }

   @EventHandler
   public void m_l(RenderEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield vxv.a6z Llva;
      // 08: bipush 1
      // 09: invokevirtual SettingCategory.ry0 (Z)Z
      // 0c: pop
      // 0d: getstatic vxv.ek1 Lc05;
      // 10: iload 2
      // 11: ifeq 2b
      // 14: getfield Minecraft.u0y Lgbe;
      // 17: ifnonnull 38
      // 1a: goto 21
      // 1d: invokestatic vxv.a (Loov;)Loov;
      // 20: athrow
      // 21: getstatic vxv.ek1 Lc05;
      // 24: goto 2b
      // 27: invokestatic vxv.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield Minecraft.oxn Lmoh;
      // 2e: aload 0
      // 2f: getfield vxv.a6z Llva;
      // 32: invokevirtual SettingCategory.o7r ()F
      // 35: putfield moh.sy5 F
      // 38: return
   }

   @EventHandler
   public void bbz(b4u var1) {
      try {
         if (ek1.u0y != null) {
            this.a6z.vej(ek1.oxn.sy5);
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   @EventHandler
   public void smn(edg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: getstatic vxv._4g Lcn7;
      // 007: invokevirtual BooleanSetting.g7m ()Z
      // 00a: iload 2
      // 00b: ifne 025
      // 00e: ifeq 15c
      // 011: goto 018
      // 014: invokestatic vxv.a (Loov;)Loov;
      // 017: athrow
      // 018: getstatic ModuleRegistry.nd5 Lfyk;
      // 01b: invokevirtual KillAura.isEnabled ()Z
      // 01e: goto 025
      // 021: invokestatic vxv.a (Loov;)Loov;
      // 024: athrow
      // 025: ifeq 15c
      // 028: getstatic KillAura.kfa Lg_3;
      // 02b: ifnull 113
      // 02e: goto 035
      // 031: invokestatic vxv.a (Loov;)Loov;
      // 034: athrow
      // 035: getstatic vxv.mt1 Lcn7;
      // 038: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 03b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03e: iload 2
      // 03f: ifne 081
      // 042: goto 049
      // 045: invokestatic vxv.a (Loov;)Loov;
      // 048: athrow
      // 049: ifeq 074
      // 04c: goto 053
      // 04f: invokestatic vxv.a (Loov;)Loov;
      // 052: athrow
      // 053: getstatic vxv.ek1 Lc05;
      // 056: getfield Minecraft.oxn Lmoh;
      // 059: getfield moh.nfb Lm7l;
      // 05c: getfield m7l.m7n Z
      // 05f: iload 2
      // 060: ifne 12e
      // 063: goto 06a
      // 066: invokestatic vxv.a (Loov;)Loov;
      // 069: athrow
      // 06a: ifeq 113
      // 06d: goto 074
      // 070: invokestatic vxv.a (Loov;)Loov;
      // 073: athrow
      // 074: getstatic ModuleRegistry.kd6 Lohv;
      // 077: invokevirtual Speed.isEnabled ()Z
      // 07a: goto 081
      // 07d: invokestatic vxv.a (Loov;)Loov;
      // 080: athrow
      // 081: iload 2
      // 082: ifne 0e0
      // 085: ifne 0c5
      // 088: goto 08f
      // 08b: invokestatic vxv.a (Loov;)Loov;
      // 08e: athrow
      // 08f: getstatic ModuleRegistry.obu Li4o;
      // 092: invokevirtual Fly.isEnabled ()Z
      // 095: iload 2
      // 096: ifne 12e
      // 099: goto 0a0
      // 09c: invokestatic vxv.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: ifeq 113
      // 0a3: goto 0aa
      // 0a6: invokestatic vxv.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: getstatic RotationHelper.r02 Lcn7;
      // 0ad: invokevirtual BooleanSetting.g7m ()Z
      // 0b0: iload 2
      // 0b1: ifne 12e
      // 0b4: goto 0bb
      // 0b7: invokestatic vxv.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: ifeq 113
      // 0be: goto 0c5
      // 0c1: invokestatic vxv.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: getstatic vxv.ek1 Lc05;
      // 0c8: getfield Minecraft.oxn Lmoh;
      // 0cb: iload 2
      // 0cc: ifne 0f1
      // 0cf: goto 0d6
      // 0d2: invokestatic vxv.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: getfield moh.i_y I
      // 0d9: goto 0e0
      // 0dc: invokestatic vxv.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: bipush 1
      // 0e1: if_icmpeq 15c
      // 0e4: getstatic vxv.ek1 Lc05;
      // 0e7: getfield Minecraft.oxn Lmoh;
      // 0ea: goto 0f1
      // 0ed: invokestatic vxv.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: bipush 1
      // 0f2: putfield moh.i_y I
      // 0f5: aload 0
      // 0f6: getfield vxv.a6z Llva;
      // 0f9: aload 0
      // 0fa: getfield vxv.a6z Llva;
      // 0fd: invokevirtual SettingCategory.els ()F
      // 100: fconst_1
      // 101: getstatic vxv.mmn Lcrk;
      // 104: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 107: invokevirtual java/lang/Float.floatValue ()F
      // 10a: fsub
      // 10b: fmul
      // 10c: invokevirtual SettingCategory.lna (F)V
      // 10f: iload 2
      // 110: ifeq 15c
      // 113: getstatic vxv.ek1 Lc05;
      // 116: getfield Minecraft.oxn Lmoh;
      // 119: iload 2
      // 11a: ifne 13e
      // 11d: goto 124
      // 120: invokestatic vxv.a (Loov;)Loov;
      // 123: athrow
      // 124: getfield moh.i_y I
      // 127: goto 12e
      // 12a: invokestatic vxv.a (Loov;)Loov;
      // 12d: athrow
      // 12e: ifeq 15c
      // 131: getstatic vxv.ek1 Lc05;
      // 134: getfield Minecraft.oxn Lmoh;
      // 137: goto 13e
      // 13a: invokestatic vxv.a (Loov;)Loov;
      // 13d: athrow
      // 13e: bipush 0
      // 13f: putfield moh.i_y I
      // 142: aload 0
      // 143: getfield vxv.a6z Llva;
      // 146: aload 0
      // 147: getfield vxv.a6z Llva;
      // 14a: invokevirtual SettingCategory.els ()F
      // 14d: fconst_1
      // 14e: getstatic vxv.mmn Lcrk;
      // 151: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 154: invokevirtual java/lang/Float.floatValue ()F
      // 157: fadd
      // 158: fmul
      // 159: invokevirtual SettingCategory.lna (F)V
      // 15c: return
   }

   private static boolean n4_(EntityLivingBase param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield EntityLivingBase.kfp D
      // 08: dconst_1
      // 09: dsub
      // 0a: d2i
      // 0b: istore 2
      // 0c: iload 2
      // 0d: ifle 59
      // 10: new mew
      // 13: dup
      // 14: aload 0
      // 15: getfield EntityLivingBase.o2v D
      // 18: iload 2
      // 19: i2d
      // 1a: aload 0
      // 1b: getfield EntityLivingBase.vbd D
      // 1e: invokespecial mew.<init> (DDD)V
      // 21: astore 3
      // 22: invokestatic Minecraft.vz1 ()Lc05;
      // 25: getfield Minecraft.tij Lkh3;
      // 28: aload 3
      // 29: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 2c: invokeinterface zfz.r_y ()Le0x; 1
      // 31: instanceof n47
      // 34: iload 1
      // 35: ifeq 5a
      // 38: iload 1
      // 39: ifeq 51
      // 3c: goto 43
      // 3f: invokestatic vxv.a (Loov;)Loov;
      // 42: athrow
      // 43: ifeq 50
      // 46: goto 4d
      // 49: invokestatic vxv.a (Loov;)Loov;
      // 4c: athrow
      // 4d: goto 52
      // 50: bipush 1
      // 51: ireturn
      // 52: iinc 2 -1
      // 55: iload 1
      // 56: ifne 0c
      // 59: bipush 0
      // 5a: ireturn
   }

   public static void kax(_qa param0, double param1, EntityLivingBase param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: invokestatic Minecraft.vz1 ()Lc05;
      // 008: astore 5
      // 00a: aload 3
      // 00b: invokestatic vxv.n4_ (Li2h;)Z
      // 00e: iload 4
      // 010: ifne 07c
      // 013: ifne 074
      // 016: goto 01d
      // 019: invokestatic vxv.a (Loov;)Loov;
      // 01c: athrow
      // 01d: getstatic vxv.x78 Lcn7;
      // 020: invokevirtual BooleanSetting.g7m ()Z
      // 023: iload 4
      // 025: ifne 07c
      // 028: goto 02f
      // 02b: invokestatic vxv.a (Loov;)Loov;
      // 02e: athrow
      // 02f: ifeq 074
      // 032: goto 039
      // 035: invokestatic vxv.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: getfield Minecraft.vg8 Ll86;
      // 03e: aload 5
      // 040: getfield Minecraft.vg8 Ll86;
      // 043: dconst_0
      // 044: dup2_x1
      // 045: putfield EntityPlayerSP.bw4 D
      // 048: putfield EntityPlayerSP.icv D
      // 04b: aload 0
      // 04c: iload 4
      // 04e: ifne 06f
      // 051: goto 058
      // 054: invokestatic vxv.a (Loov;)Loov;
      // 057: athrow
      // 058: ifnull 073
      // 05b: goto 062
      // 05e: invokestatic vxv.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: dconst_0
      // 064: invokevirtual _qa.oz6 (D)V
      // 067: aload 0
      // 068: goto 06f
      // 06b: invokestatic vxv.a (Loov;)Loov;
      // 06e: athrow
      // 06f: dconst_0
      // 070: invokevirtual _qa.sqi (D)V
      // 073: return
      // 074: aload 5
      // 076: getfield Minecraft.vg8 Ll86;
      // 079: invokestatic vxv.n4_ (Li2h;)Z
      // 07c: iload 4
      // 07e: ifne 0ec
      // 081: ifne 0e4
      // 084: goto 08b
      // 087: invokestatic vxv.a (Loov;)Loov;
      // 08a: athrow
      // 08b: getstatic vxv.uik Lcn7;
      // 08e: invokevirtual BooleanSetting.g7m ()Z
      // 091: iload 4
      // 093: ifne 0ec
      // 096: goto 09d
      // 099: invokestatic vxv.a (Loov;)Loov;
      // 09c: athrow
      // 09d: ifeq 0e4
      // 0a0: goto 0a7
      // 0a3: invokestatic vxv.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: getstatic ModuleRegistry.obu Li4o;
      // 0aa: invokevirtual Fly.isEnabled ()Z
      // 0ad: iload 4
      // 0af: ifne 0ec
      // 0b2: goto 0b9
      // 0b5: invokestatic vxv.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: ifne 0e4
      // 0bc: goto 0c3
      // 0bf: invokestatic vxv.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: getstatic vxv.o8s Z
      // 0c6: iload 4
      // 0c8: ifne 0dd
      // 0cb: goto 0d2
      // 0ce: invokestatic vxv.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: ifne 0e0
      // 0d5: goto 0dc
      // 0d8: invokestatic vxv.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: bipush 1
      // 0dd: goto 0e1
      // 0e0: bipush 0
      // 0e1: putstatic vxv.o8s Z
      // 0e4: aload 5
      // 0e6: getfield Minecraft.vg8 Ll86;
      // 0e9: getfield EntityPlayerSP.cbi Z
      // 0ec: iload 4
      // 0ee: ifne 13b
      // 0f1: ifeq 138
      // 0f4: goto 0fb
      // 0f7: invokestatic vxv.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: getstatic vxv.b0n Lcn7;
      // 0fe: invokevirtual BooleanSetting.g7m ()Z
      // 101: iload 4
      // 103: ifne 13b
      // 106: goto 10d
      // 109: invokestatic vxv.a (Loov;)Loov;
      // 10c: athrow
      // 10d: ifeq 138
      // 110: goto 117
      // 113: invokestatic vxv.a (Loov;)Loov;
      // 116: athrow
      // 117: getstatic vxv.o8s Z
      // 11a: iload 4
      // 11c: ifne 131
      // 11f: goto 126
      // 122: invokestatic vxv.a (Loov;)Loov;
      // 125: athrow
      // 126: ifne 134
      // 129: goto 130
      // 12c: invokestatic vxv.a (Loov;)Loov;
      // 12f: athrow
      // 130: bipush 1
      // 131: goto 135
      // 134: bipush 0
      // 135: putstatic vxv.o8s Z
      // 138: getstatic vxv.o8s Z
      // 13b: ifeq 146
      // 13e: fconst_1
      // 13f: goto 149
      // 142: invokestatic vxv.a (Loov;)Loov;
      // 145: athrow
      // 146: ldc -1.0
      // 148: nop
      // 149: fstore 6
      // 14b: dload 1
      // 14c: getstatic vxv.khf Lcrk;
      // 14f: invokevirtual NumberSetting.u7t ()D
      // 152: ldc2_w 3.141592653589793
      // 155: dmul
      // 156: ldc2_w 2.0
      // 159: dmul
      // 15a: ddiv
      // 15b: d2f
      // 15c: ldc 360.0
      // 15e: nop
      // 15f: fmul
      // 160: fload 6
      // 162: fmul
      // 163: fstore 7
      // 165: new zxu
      // 168: dup
      // 169: aload 3
      // 16a: getfield EntityLivingBase.o2v D
      // 16d: aload 3
      // 16e: getfield EntityLivingBase.kfp D
      // 171: aload 3
      // 172: getfield EntityLivingBase.vbd D
      // 175: invokespecial zxu.<init> (DDD)V
      // 178: new zxu
      // 17b: dup
      // 17c: aload 5
      // 17e: getfield Minecraft.vg8 Ll86;
      // 181: getfield EntityPlayerSP.o2v D
      // 184: aload 5
      // 186: getfield Minecraft.vg8 Ll86;
      // 189: getfield EntityPlayerSP.kfp D
      // 18c: aload 5
      // 18e: getfield Minecraft.vg8 Ll86;
      // 191: getfield EntityPlayerSP.vbd D
      // 194: invokespecial zxu.<init> (DDD)V
      // 197: invokestatic omb.xx4 (Lzxu;Lzxu;)[F
      // 19a: astore 8
      // 19c: aload 8
      // 19e: bipush 0
      // 19f: dup2
      // 1a0: faload
      // 1a1: fload 7
      // 1a3: fadd
      // 1a4: fastore
      // 1a5: aload 8
      // 1a7: bipush 0
      // 1a8: faload
      // 1a9: ldc 0.017453292
      // 1ab: nop
      // 1ac: fmul
      // 1ad: fstore 9
      // 1af: aload 3
      // 1b0: getfield EntityLivingBase.o2v D
      // 1b3: fload 9
      // 1b5: f2d
      // 1b6: invokestatic java/lang/Math.sin (D)D
      // 1b9: getstatic vxv.khf Lcrk;
      // 1bc: invokevirtual NumberSetting.u7t ()D
      // 1bf: dmul
      // 1c0: dsub
      // 1c1: dstore 10
      // 1c3: aload 3
      // 1c4: getfield EntityLivingBase.vbd D
      // 1c7: fload 9
      // 1c9: f2d
      // 1ca: invokestatic java/lang/Math.cos (D)D
      // 1cd: getstatic vxv.khf Lcrk;
      // 1d0: invokevirtual NumberSetting.u7t ()D
      // 1d3: dmul
      // 1d4: dadd
      // 1d5: dstore 12
      // 1d7: new zxu
      // 1da: dup
      // 1db: aload 5
      // 1dd: getfield Minecraft.vg8 Ll86;
      // 1e0: getfield EntityPlayerSP.o2v D
      // 1e3: aload 5
      // 1e5: getfield Minecraft.vg8 Ll86;
      // 1e8: getfield EntityPlayerSP.kfp D
      // 1eb: aload 5
      // 1ed: getfield Minecraft.vg8 Ll86;
      // 1f0: getfield EntityPlayerSP.vbd D
      // 1f3: invokespecial zxu.<init> (DDD)V
      // 1f6: new zxu
      // 1f9: dup
      // 1fa: dload 10
      // 1fc: aload 3
      // 1fd: getfield EntityLivingBase.kfp D
      // 200: dload 12
      // 202: invokespecial zxu.<init> (DDD)V
      // 205: invokestatic omb.xx4 (Lzxu;Lzxu;)[F
      // 208: bipush 0
      // 209: faload
      // 20a: ldc 0.017453292
      // 20c: nop
      // 20d: fmul
      // 20e: fstore 14
      // 210: aload 5
      // 212: getfield Minecraft.vg8 Ll86;
      // 215: fload 14
      // 217: invokestatic fe6.rtn (F)F
      // 21a: fneg
      // 21b: f2d
      // 21c: dload 1
      // 21d: dmul
      // 21e: putfield EntityPlayerSP.icv D
      // 221: aload 5
      // 223: getfield Minecraft.vg8 Ll86;
      // 226: fload 14
      // 228: invokestatic fe6.ssk (F)F
      // 22b: f2d
      // 22c: dload 1
      // 22d: dmul
      // 22e: putfield EntityPlayerSP.bw4 D
      // 231: aload 0
      // 232: iload 4
      // 234: ifne 255
      // 237: ifnull 260
      // 23a: goto 241
      // 23d: invokestatic vxv.a (Loov;)Loov;
      // 240: athrow
      // 241: aload 0
      // 242: aload 5
      // 244: getfield Minecraft.vg8 Ll86;
      // 247: getfield EntityPlayerSP.icv D
      // 24a: invokevirtual _qa.oz6 (D)V
      // 24d: aload 0
      // 24e: goto 255
      // 251: invokestatic vxv.a (Loov;)Loov;
      // 254: athrow
      // 255: aload 5
      // 257: getfield Minecraft.vg8 Ll86;
      // 25a: getfield EntityPlayerSP.bw4 D
      // 25d: invokevirtual _qa.sqi (D)V
      // 260: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1319001484353158010L, 4929649899642357708L, MethodHandles.lookup().lookupClass()).a(48657059893203L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 16848507220958L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "â&q\u0086ªmRxöøè-iO\u0081FÎ¤\u000e>%ö\u0016äÔþôÎqI6ò[\u0090\u001d\u0013EêÓÇ\u0010Õ\u0092\u0007\u001bÌ\u000eÀ¥æUß!!\u0093²æ 9\u0096ÉÉù\u0004\"\u0010Z÷µÒ¤ô.\u0011\u008e\u0089_\u000en÷êç|®s@å¦Òo\u0018\u0016\u0003ú\u0003hã\u00114{ý]\u008a8\u009d\u007f\u008f[¤¨DÇ-¨\u008f \u0090\u0017\u0093|ýë Ú\u0013ò¬B\u001c!wi\u0018ï7s1N-Ýï»ie£Ç\u0098Z ÚV÷?\u009bLÝee\u001e\u0016\u0011o\u008a\u0016Éÿø;_\u0086È§\u0019VºJ\u001e1¤\u0092\u000e Rs\\¯ü\u0003\u00adâ\u00ad²$\u009aÛè\u0019~ÓÆ°<°íU¹¨Y]4ÓÏ\u0002o(æz\u009cä\u009a\u009cF\u001b\f=`\u0002\u0000?É\u009fv¸.\u0090<\u0006Cµ,½±C 6\tÿ3^6Ùà\u001fIß";
      int var6 = "â&q\u0086ªmRxöøè-iO\u0081FÎ¤\u000e>%ö\u0016äÔþôÎqI6ò[\u0090\u001d\u0013EêÓÇ\u0010Õ\u0092\u0007\u001bÌ\u000eÀ¥æUß!!\u0093²æ 9\u0096ÉÉù\u0004\"\u0010Z÷µÒ¤ô.\u0011\u008e\u0089_\u000en÷êç|®s@å¦Òo\u0018\u0016\u0003ú\u0003hã\u00114{ý]\u008a8\u009d\u007f\u008f[¤¨DÇ-¨\u008f \u0090\u0017\u0093|ýë Ú\u0013ò¬B\u001c!wi\u0018ï7s1N-Ýï»ie£Ç\u0098Z ÚV÷?\u009bLÝee\u001e\u0016\u0011o\u008a\u0016Éÿø;_\u0086È§\u0019VºJ\u001e1¤\u0092\u000e Rs\\¯ü\u0003\u00adâ\u00ad²$\u009aÛè\u0019~ÓÆ°<°íU¹¨Y]4ÓÏ\u0002o(æz\u009cä\u009a\u009cF\u001b\f=`\u0002\u0000?É\u009fv¸.\u0090<\u0006Cµ,½±C 6\tÿ3^6Ùà\u001fIß"
         .length();
      char var3 = '(';
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
                     g = new String[10];
                     khf = new NumberSetting(b<"h">(17084, 7870736819191078082L ^ var9), b<"h">(31682, 5937112120588297663L ^ var9), 2.0F, 0.5F, 4.5F, 0.1F);
                     uik = new BooleanSetting(b<"h">(25689, 3261029906067913249L ^ var9), b<"h">(11220, 4878061370909472161L ^ var9), true);
                     b0n = new BooleanSetting(b<"h">(25689, 3261029906067913249L ^ var9), b<"h">(26903, 4068334742195861357L ^ var9), true);
                     x78 = new BooleanSetting(b<"h">(25689, 3261029906067913249L ^ var9), b<"h">(8497, 241828365540671306L ^ var9), true);
                     mt1 = new BooleanSetting(b<"h">(25689, 3261029906067913249L ^ var9), b<"h">(2471, 4036888607724967902L ^ var9), true);
                     zqa = new BooleanSetting(b<"h">(25689, 3261029906067913249L ^ var9), b<"h">(22216, 3407555053431376055L ^ var9), true);
                     _4g = new BooleanSetting(b<"h">(25689, 3261029906067913249L ^ var9), b<"h">(26301, 3007171868712532161L ^ var9), false);
                     mmn = new NumberSetting(b<"h">(25689, 3261029906067913249L ^ var9), b<"h">(18882, 4423585469395687350L ^ var9), 0.3F, 0.0F, 1.0F, 0.01F);
                     o8s = true;
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

                  var4 = "\u009aá3T5\u001bÜ\u0097\u008e\u0095ØJÖIýQ×!lÊ\u0096:i\u0014)\u009ae¥<ÔÁî\u0018¡5'z\u009c\u000ev`\f\u0092©\u009cfw8m¡\u001bÀÕ\u0095)==";
                  var6 = "\u009aá3T5\u001bÜ\u0097\u008e\u0095ØJÖIýQ×!lÊ\u0096:i\u0014)\u009ae¥<ÔÁî\u0018¡5'z\u009c\u000ev`\f\u0092©\u009cfw8m¡\u001bÀÕ\u0095)=="
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17734;
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
            throw new RuntimeException("vxv", var10);
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
         throw new RuntimeException("vxv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
