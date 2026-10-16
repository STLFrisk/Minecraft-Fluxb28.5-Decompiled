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
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Cylinder;

public class iyr {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static int x9f() {
      eka var0 = new eka(c05.vz1());
      return var0.lrx();
   }

   public static int ajf() {
      eka var0 = new eka(c05.vz1());
      return var0.x05();
   }

   public static void itn() {
      qns();
      GL11.glPushAttrib(1048575);
      GL11.glDisable(3008);
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(3.0F);
      GL11.glEnable(2848);
      GL11.glEnable(2960);
      GL11.glClear(1024);
      GL11.glClearStencil(15);
      GL11.glStencilFunc(512, 1, 15);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glPolygonMode(1032, 6913);
   }

   public static void qns() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: invokestatic c05.vz1 ()Lc05;
      // 07: invokevirtual c05._d2 ()Loru;
      // 0a: astore 1
      // 0b: aload 1
      // 0c: iload 0
      // 0d: ifeq 1b
      // 10: ifnull 3d
      // 13: goto 1a
      // 16: invokestatic iyr.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 0
      // 1c: ifeq 39
      // 1f: getfield oru.vxw I
      // 22: bipush -1
      // 23: if_icmple 3d
      // 26: goto 2d
      // 29: invokestatic iyr.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokestatic iyr.vxi (Loru;)V
      // 31: aload 1
      // 32: goto 39
      // 35: invokestatic iyr.a (Loov;)Loov;
      // 38: athrow
      // 39: bipush -1
      // 3a: putfield oru.vxw I
      // 3d: return
   }

   public static void vxi(oru var0) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(var0.vxw);
      int var1 = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, var1);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, c05.vz1().pfr, c05.vz1().ry7);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, var1);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, var1);
   }

   public static void e3_() {
      GL11.glStencilFunc(512, 0, 15);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glPolygonMode(1032, 6914);
   }

   public static void xby() {
      GL11.glStencilFunc(514, 1, 15);
      GL11.glStencilOp(7680, 7680, 7680);
      GL11.glPolygonMode(1032, 6913);
   }

   public static void jyz(g_3 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: ifnull 0e9
      // 008: getstatic zwr.qkk Lzwr;
      // 00b: invokevirtual zwr.w34 ()Lf62;
      // 00e: aload 0
      // 00f: invokevirtual g_3.noc ()Ljava/lang/String;
      // 012: invokevirtual f62.jzk (Ljava/lang/String;)Z
      // 015: iload 1
      // 016: ifne 034
      // 019: goto 020
      // 01c: invokestatic iyr.a (Loov;)Loov;
      // 01f: athrow
      // 020: ifeq 037
      // 023: goto 02a
      // 026: invokestatic iyr.a (Loov;)Loov;
      // 029: athrow
      // 02a: ldc -11157267
      // 02c: nop
      // 02d: goto 034
      // 030: invokestatic iyr.a (Loov;)Loov;
      // 033: athrow
      // 034: goto 03b
      // 037: aload 0
      // 038: invokestatic iyr.b3b (Li2h;)I
      // 03b: istore 2
      // 03c: getstatic kgt.h1f Lte6;
      // 03f: invokevirtual te6.klu ()Z
      // 042: iload 1
      // 043: ifne 099
      // 046: ifeq 093
      // 049: goto 050
      // 04c: invokestatic iyr.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 0
      // 051: instanceof ha9
      // 054: iload 1
      // 055: ifne 099
      // 058: goto 05f
      // 05b: invokestatic iyr.a (Loov;)Loov;
      // 05e: athrow
      // 05f: ifeq 093
      // 062: goto 069
      // 065: invokestatic iyr.a (Loov;)Loov;
      // 068: athrow
      // 069: aload 0
      // 06a: checkcast ha9
      // 06d: invokestatic te6.fkb (Lha9;)Z
      // 070: iload 1
      // 071: ifne 099
      // 074: goto 07b
      // 077: invokestatic iyr.a (Loov;)Loov;
      // 07a: athrow
      // 07b: ifeq 093
      // 07e: goto 085
      // 081: invokestatic iyr.a (Loov;)Loov;
      // 084: athrow
      // 085: new java/awt/Color
      // 088: dup
      // 089: ldc 16711696
      // 08b: nop
      // 08c: invokespecial java/awt/Color.<init> (I)V
      // 08f: invokevirtual java/awt/Color.getRGB ()I
      // 092: istore 2
      // 093: getstatic kgt.nd5 Lfyk;
      // 096: invokevirtual fyk.klu ()Z
      // 099: iload 1
      // 09a: ifne 0e6
      // 09d: ifeq 0e5
      // 0a0: goto 0a7
      // 0a3: invokestatic iyr.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: getstatic fyk.kfa Lg_3;
      // 0aa: iload 1
      // 0ab: ifne 0c0
      // 0ae: goto 0b5
      // 0b1: invokestatic iyr.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: ifnull 0e5
      // 0b8: goto 0bf
      // 0bb: invokestatic iyr.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: invokevirtual g_3.jwu ()I
      // 0c3: iload 1
      // 0c4: ifne 0e6
      // 0c7: getstatic fyk.kfa Lg_3;
      // 0ca: invokevirtual g_3.jwu ()I
      // 0cd: if_icmpne 0e5
      // 0d0: goto 0d7
      // 0d3: invokestatic iyr.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: new java/awt/Color
      // 0da: dup
      // 0db: ldc 16711855
      // 0dd: nop
      // 0de: invokespecial java/awt/Color.<init> (I)V
      // 0e1: invokevirtual java/awt/Color.getRGB ()I
      // 0e4: istore 2
      // 0e5: iload 2
      // 0e6: invokestatic iyr.qe5 (I)V
      // 0e9: bipush 0
      // 0ea: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 0ed: sipush 2929
      // 0f0: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 0f3: sipush 10754
      // 0f6: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 0f9: fconst_1
      // 0fa: ldc -2000000.0
      // 0fc: nop
      // 0fd: invokestatic org/lwjgl/opengl/GL11.glPolygonOffset (FF)V
      // 100: getstatic gis.exn I
      // 103: ldc 240.0
      // 105: nop
      // 106: ldc 240.0
      // 108: nop
      // 109: invokestatic gis.w9e (IFF)V
      // 10c: return
   }

   public static eka u0n() {
      return new eka(c05.vz1());
   }

   public static void zt6(int var0) {
      qe5(var0);
      GL11.glDepthMask(false);
      GL11.glDisable(2929);
      GL11.glEnable(10754);
      GL11.glPolygonOffset(1.0F, -2000000.0F);
      gis.w9e(gis.exn, 240.0F, 240.0F);
   }

   public static int b3b(i2h param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iyr.a J
      // 03: ldc2_w 28420733068508
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: ldc 16777215
      // 0e: nop
      // 0f: istore 4
      // 11: aload 0
      // 12: instanceof ha9
      // 15: iload 3
      // 16: ifne a6
      // 19: ifeq a4
      // 1c: goto 23
      // 1f: invokestatic iyr.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: checkcast ha9
      // 27: invokevirtual ha9.ued ()Ln_0;
      // 2a: checkcast q2m
      // 2d: astore 5
      // 2f: aload 5
      // 31: iload 3
      // 32: ifne 41
      // 35: ifnull a4
      // 38: goto 3f
      // 3b: invokestatic iyr.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 5
      // 41: invokevirtual q2m.wyj ()Ljava/lang/String;
      // 44: invokestatic owt.pkg (Ljava/lang/String;)Ljava/lang/String;
      // 47: astore 6
      // 49: aload 6
      // 4b: invokevirtual java/lang/String.length ()I
      // 4e: iload 3
      // 4f: ifne a6
      // 52: bipush 2
      // 53: if_icmplt a4
      // 56: goto 5d
      // 59: invokestatic iyr.a (Loov;)Loov;
      // 5c: athrow
      // 5d: sipush 5353
      // 60: ldc2_w 1446745973328397947
      // 63: lload 1
      // 64: lxor
      // 65: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: nop
      // 6b: aload 6
      // 6d: bipush 1
      // 6e: invokevirtual java/lang/String.charAt (I)C
      // 71: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 74: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 77: iload 3
      // 78: ifne a2
      // 7b: goto 82
      // 7e: invokestatic iyr.a (Loov;)Loov;
      // 81: athrow
      // 82: ifne 93
      // 85: goto 8c
      // 88: invokestatic iyr.a (Loov;)Loov;
      // 8b: athrow
      // 8c: iload 4
      // 8e: ireturn
      // 8f: invokestatic iyr.a (Loov;)Loov;
      // 92: athrow
      // 93: invokestatic c05.vz1 ()Lc05;
      // 96: getfield c05.tx1 Lowt;
      // 99: aload 6
      // 9b: bipush 1
      // 9c: invokevirtual java/lang/String.charAt (I)C
      // 9f: invokevirtual owt.squ (C)I
      // a2: istore 4
      // a4: iload 4
      // a6: ireturn
   }

   public static void _nz() {
      GL11.glPolygonOffset(1.0F, 2000000.0F);
      GL11.glDisable(10754);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(2960);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glEnable(3042);
      GL11.glEnable(2896);
      GL11.glEnable(3553);
      GL11.glEnable(3008);
      GL11.glPopAttrib();
   }

   public static void kfe(float var0) {
      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glEnable(2884);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glHint(3155, 4354);
      GL11.glLineWidth(var0);
   }

   public static void x6v() {
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glDepthMask(true);
      GL11.glCullFace(1029);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glHint(3155, 4352);
   }

   @Deprecated
   public static void lm9(float var0, float var1, float var2, float var3, int var4) {
      uyb();
      yfp(var4);
      fd2(var0, var1, var2, var3);
      let();
   }

   @Deprecated
   public static void p69(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      uyb();
      GL11.glColor4f(var4, var5, var6, var7);
      fd2(var0, var1, var2, var3);
      let();
   }

   @Deprecated
   public static void fd2(float var0, float var1, float var2, float var3) {
      GL11.glBegin(7);
      GL11.glVertex2f(var0, var3);
      GL11.glVertex2f(var2, var3);
      GL11.glVertex2f(var2, var1);
      GL11.glVertex2f(var0, var1);
      GL11.glEnd();
   }

   public static void hsj(float var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      uyb();
      lm9(var0, var1, var2, var3, var5);
      yfp(var6);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(var4);
      GL11.glBegin(3);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(var0, var3);
      GL11.glVertex2f(var2, var3);
      GL11.glVertex2f(var2, var1);
      GL11.glVertex2f(var0, var1);
      GL11.glEnd();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      let();
   }

   @Deprecated
   public static int pbh() {
      eka var0 = new eka(c05.vz1());
      return var0._0s();
   }

   @Deprecated
   public static int uq2() {
      eka var0 = new eka(c05.vz1());
      return var0.x05();
   }

   @Deprecated
   public static int euk() {
      eka var0 = new eka(c05.vz1());
      return var0.lrx();
   }

   private static void o94(erg param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic iyr.a J
      // 003: ldc2_w 67354056559262
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: iload 2
      // 00e: bipush 24
      // 010: isub
      // 011: istore 6
      // 013: aload 0
      // 014: iload 5
      // 016: ifeq 06d
      // 019: invokevirtual erg.pqd ()Lqhg;
      // 01c: ifnull 06c
      // 01f: goto 026
      // 022: invokestatic iyr.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 0
      // 027: invokevirtual erg.pqd ()Lqhg;
      // 02a: invokevirtual qhg.vek ()I
      // 02d: iload 5
      // 02f: ifeq 073
      // 032: goto 039
      // 035: invokestatic iyr.a (Loov;)Loov;
      // 038: athrow
      // 039: bipush 6
      // 03b: if_icmplt 06c
      // 03e: goto 045
      // 041: invokestatic iyr.a (Loov;)Loov;
      // 044: athrow
      // 045: invokestatic c05.vz1 ()Lc05;
      // 048: getfield c05.tx1 Lowt;
      // 04b: sipush 23756
      // 04e: ldc2_w 7852129401628844059
      // 051: lload 3
      // 052: lxor
      // 053: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: nop
      // 059: iload 1
      // 05a: bipush 2
      // 05b: imul
      // 05c: i2f
      // 05d: iload 6
      // 05f: i2f
      // 060: ldc 16711680
      // 062: nop
      // 063: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 066: pop
      // 067: return
      // 068: invokestatic iyr.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: invokevirtual erg.gn1 ()Lu7m;
      // 070: instanceof jpt
      // 073: iload 5
      // 075: ifeq 295
      // 078: ifeq 28e
      // 07b: goto 082
      // 07e: invokestatic iyr.a (Loov;)Loov;
      // 081: athrow
      // 082: getstatic vef.o55 Lvef;
      // 085: getfield vef.bbf I
      // 088: aload 0
      // 089: invokestatic hc0.qa_ (ILerg;)I
      // 08c: istore 7
      // 08e: getstatic vef.brx Lvef;
      // 091: getfield vef.bbf I
      // 094: aload 0
      // 095: invokestatic hc0.qa_ (ILerg;)I
      // 098: istore 8
      // 09a: getstatic vef.dru Lvef;
      // 09d: getfield vef.bbf I
      // 0a0: aload 0
      // 0a1: invokestatic hc0.qa_ (ILerg;)I
      // 0a4: istore 9
      // 0a6: getstatic vef.qt1 Lvef;
      // 0a9: getfield vef.bbf I
      // 0ac: aload 0
      // 0ad: invokestatic hc0.qa_ (ILerg;)I
      // 0b0: istore 10
      // 0b2: getstatic vef.pm0 Lvef;
      // 0b5: getfield vef.bbf I
      // 0b8: aload 0
      // 0b9: invokestatic hc0.qa_ (ILerg;)I
      // 0bc: istore 11
      // 0be: getstatic vef._jm Lvef;
      // 0c1: getfield vef.bbf I
      // 0c4: aload 0
      // 0c5: invokestatic hc0.qa_ (ILerg;)I
      // 0c8: istore 12
      // 0ca: iload 7
      // 0cc: iload 5
      // 0ce: ifeq 11b
      // 0d1: ifle 119
      // 0d4: goto 0db
      // 0d7: invokestatic iyr.a (Loov;)Loov;
      // 0da: athrow
      // 0db: invokestatic c05.vz1 ()Lc05;
      // 0de: getfield c05.tx1 Lowt;
      // 0e1: new java/lang/StringBuilder
      // 0e4: dup
      // 0e5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e8: sipush 10655
      // 0eb: ldc2_w 522378555312084299
      // 0ee: lload 3
      // 0ef: lxor
      // 0f0: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: nop
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: iload 7
      // 0fb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0fe: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 101: iload 1
      // 102: bipush 2
      // 103: imul
      // 104: i2f
      // 105: iload 6
      // 107: i2f
      // 108: ldc -1052689
      // 10a: nop
      // 10b: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 10e: pop
      // 10f: iinc 6 8
      // 112: goto 119
      // 115: invokestatic iyr.a (Loov;)Loov;
      // 118: athrow
      // 119: iload 8
      // 11b: iload 5
      // 11d: ifeq 16a
      // 120: ifle 168
      // 123: goto 12a
      // 126: invokestatic iyr.a (Loov;)Loov;
      // 129: athrow
      // 12a: invokestatic c05.vz1 ()Lc05;
      // 12d: getfield c05.tx1 Lowt;
      // 130: new java/lang/StringBuilder
      // 133: dup
      // 134: invokespecial java/lang/StringBuilder.<init> ()V
      // 137: sipush 17393
      // 13a: ldc2_w 1970644108032999200
      // 13d: lload 3
      // 13e: lxor
      // 13f: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: nop
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: iload 8
      // 14a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 14d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 150: iload 1
      // 151: bipush 2
      // 152: imul
      // 153: i2f
      // 154: iload 6
      // 156: i2f
      // 157: ldc -1052689
      // 159: nop
      // 15a: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 15d: pop
      // 15e: iinc 6 8
      // 161: goto 168
      // 164: invokestatic iyr.a (Loov;)Loov;
      // 167: athrow
      // 168: iload 9
      // 16a: iload 5
      // 16c: ifeq 1b9
      // 16f: ifle 1b7
      // 172: goto 179
      // 175: invokestatic iyr.a (Loov;)Loov;
      // 178: athrow
      // 179: invokestatic c05.vz1 ()Lc05;
      // 17c: getfield c05.tx1 Lowt;
      // 17f: new java/lang/StringBuilder
      // 182: dup
      // 183: invokespecial java/lang/StringBuilder.<init> ()V
      // 186: sipush 3327
      // 189: ldc2_w 1381832086806474797
      // 18c: lload 3
      // 18d: lxor
      // 18e: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: nop
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 197: iload 9
      // 199: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 19c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19f: iload 1
      // 1a0: bipush 2
      // 1a1: imul
      // 1a2: i2f
      // 1a3: iload 6
      // 1a5: i2f
      // 1a6: ldc -1052689
      // 1a8: nop
      // 1a9: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 1ac: pop
      // 1ad: iinc 6 8
      // 1b0: goto 1b7
      // 1b3: invokestatic iyr.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: iload 10
      // 1b9: iload 5
      // 1bb: ifeq 208
      // 1be: ifle 206
      // 1c1: goto 1c8
      // 1c4: invokestatic iyr.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: invokestatic c05.vz1 ()Lc05;
      // 1cb: getfield c05.tx1 Lowt;
      // 1ce: new java/lang/StringBuilder
      // 1d1: dup
      // 1d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d5: sipush 5315
      // 1d8: ldc2_w 2202810180202211355
      // 1db: lload 3
      // 1dc: lxor
      // 1dd: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: nop
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e6: iload 10
      // 1e8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ee: iload 1
      // 1ef: bipush 2
      // 1f0: imul
      // 1f1: i2f
      // 1f2: iload 6
      // 1f4: i2f
      // 1f5: ldc -1052689
      // 1f7: nop
      // 1f8: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 1fb: pop
      // 1fc: iinc 6 8
      // 1ff: goto 206
      // 202: invokestatic iyr.a (Loov;)Loov;
      // 205: athrow
      // 206: iload 11
      // 208: iload 5
      // 20a: ifeq 24c
      // 20d: ifle 24a
      // 210: goto 217
      // 213: invokestatic iyr.a (Loov;)Loov;
      // 216: athrow
      // 217: invokestatic c05.vz1 ()Lc05;
      // 21a: getfield c05.tx1 Lowt;
      // 21d: new java/lang/StringBuilder
      // 220: dup
      // 221: invokespecial java/lang/StringBuilder.<init> ()V
      // 224: ldc "t"
      // 226: nop
      // 227: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22a: iload 11
      // 22c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 22f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 232: iload 1
      // 233: bipush 2
      // 234: imul
      // 235: i2f
      // 236: iload 6
      // 238: i2f
      // 239: ldc -1052689
      // 23b: nop
      // 23c: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 23f: pop
      // 240: iinc 6 8
      // 243: goto 24a
      // 246: invokestatic iyr.a (Loov;)Loov;
      // 249: athrow
      // 24a: iload 12
      // 24c: iload 5
      // 24e: ifeq 295
      // 251: ifle 28e
      // 254: goto 25b
      // 257: invokestatic iyr.a (Loov;)Loov;
      // 25a: athrow
      // 25b: invokestatic c05.vz1 ()Lc05;
      // 25e: getfield c05.tx1 Lowt;
      // 261: new java/lang/StringBuilder
      // 264: dup
      // 265: invokespecial java/lang/StringBuilder.<init> ()V
      // 268: ldc "u"
      // 26a: nop
      // 26b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26e: iload 12
      // 270: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 273: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 276: iload 1
      // 277: bipush 2
      // 278: imul
      // 279: i2f
      // 27a: iload 6
      // 27c: i2f
      // 27d: ldc -1052689
      // 27f: nop
      // 280: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 283: pop
      // 284: iinc 6 8
      // 287: goto 28e
      // 28a: invokestatic iyr.a (Loov;)Loov;
      // 28d: athrow
      // 28e: aload 0
      // 28f: invokevirtual erg.gn1 ()Lu7m;
      // 292: instanceof r5m
      // 295: iload 5
      // 297: ifeq 401
      // 29a: ifeq 3fa
      // 29d: goto 2a4
      // 2a0: invokestatic iyr.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: getstatic vef.s61 Lvef;
      // 2a7: getfield vef.bbf I
      // 2aa: aload 0
      // 2ab: invokestatic hc0.qa_ (ILerg;)I
      // 2ae: istore 7
      // 2b0: getstatic vef.t24 Lvef;
      // 2b3: getfield vef.bbf I
      // 2b6: aload 0
      // 2b7: invokestatic hc0.qa_ (ILerg;)I
      // 2ba: istore 8
      // 2bc: getstatic vef.pxu Lvef;
      // 2bf: getfield vef.bbf I
      // 2c2: aload 0
      // 2c3: invokestatic hc0.qa_ (ILerg;)I
      // 2c6: istore 9
      // 2c8: getstatic vef._jm Lvef;
      // 2cb: getfield vef.bbf I
      // 2ce: aload 0
      // 2cf: invokestatic hc0.qa_ (ILerg;)I
      // 2d2: istore 10
      // 2d4: iload 7
      // 2d6: iload 5
      // 2d8: ifeq 325
      // 2db: ifle 323
      // 2de: goto 2e5
      // 2e1: invokestatic iyr.a (Loov;)Loov;
      // 2e4: athrow
      // 2e5: invokestatic c05.vz1 ()Lc05;
      // 2e8: getfield c05.tx1 Lowt;
      // 2eb: new java/lang/StringBuilder
      // 2ee: dup
      // 2ef: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f2: sipush 25557
      // 2f5: ldc2_w 4763278749182189312
      // 2f8: lload 3
      // 2f9: lxor
      // 2fa: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: nop
      // 300: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 303: iload 7
      // 305: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 308: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30b: iload 1
      // 30c: bipush 2
      // 30d: imul
      // 30e: i2f
      // 30f: iload 6
      // 311: i2f
      // 312: ldc -1052689
      // 314: nop
      // 315: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 318: pop
      // 319: iinc 6 8
      // 31c: goto 323
      // 31f: invokestatic iyr.a (Loov;)Loov;
      // 322: athrow
      // 323: iload 8
      // 325: iload 5
      // 327: ifeq 374
      // 32a: ifle 372
      // 32d: goto 334
      // 330: invokestatic iyr.a (Loov;)Loov;
      // 333: athrow
      // 334: invokestatic c05.vz1 ()Lc05;
      // 337: getfield c05.tx1 Lowt;
      // 33a: new java/lang/StringBuilder
      // 33d: dup
      // 33e: invokespecial java/lang/StringBuilder.<init> ()V
      // 341: sipush 28904
      // 344: ldc2_w 7190805814827109431
      // 347: lload 3
      // 348: lxor
      // 349: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: nop
      // 34f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 352: iload 8
      // 354: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 357: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 35a: iload 1
      // 35b: bipush 2
      // 35c: imul
      // 35d: i2f
      // 35e: iload 6
      // 360: i2f
      // 361: ldc -1052689
      // 363: nop
      // 364: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 367: pop
      // 368: iinc 6 8
      // 36b: goto 372
      // 36e: invokestatic iyr.a (Loov;)Loov;
      // 371: athrow
      // 372: iload 9
      // 374: iload 5
      // 376: ifeq 3b8
      // 379: ifle 3b6
      // 37c: goto 383
      // 37f: invokestatic iyr.a (Loov;)Loov;
      // 382: athrow
      // 383: invokestatic c05.vz1 ()Lc05;
      // 386: getfield c05.tx1 Lowt;
      // 389: new java/lang/StringBuilder
      // 38c: dup
      // 38d: invokespecial java/lang/StringBuilder.<init> ()V
      // 390: ldc "f"
      // 392: nop
      // 393: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 396: iload 9
      // 398: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 39b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 39e: iload 1
      // 39f: bipush 2
      // 3a0: imul
      // 3a1: i2f
      // 3a2: iload 6
      // 3a4: i2f
      // 3a5: ldc -1052689
      // 3a7: nop
      // 3a8: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 3ab: pop
      // 3ac: iinc 6 8
      // 3af: goto 3b6
      // 3b2: invokestatic iyr.a (Loov;)Loov;
      // 3b5: athrow
      // 3b6: iload 10
      // 3b8: iload 5
      // 3ba: ifeq 401
      // 3bd: ifle 3fa
      // 3c0: goto 3c7
      // 3c3: invokestatic iyr.a (Loov;)Loov;
      // 3c6: athrow
      // 3c7: invokestatic c05.vz1 ()Lc05;
      // 3ca: getfield c05.tx1 Lowt;
      // 3cd: new java/lang/StringBuilder
      // 3d0: dup
      // 3d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d4: ldc "u"
      // 3d6: nop
      // 3d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3da: iload 10
      // 3dc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3df: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3e2: iload 1
      // 3e3: bipush 2
      // 3e4: imul
      // 3e5: i2f
      // 3e6: iload 6
      // 3e8: i2f
      // 3e9: ldc -1052689
      // 3eb: nop
      // 3ec: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 3ef: pop
      // 3f0: iinc 6 8
      // 3f3: goto 3fa
      // 3f6: invokestatic iyr.a (Loov;)Loov;
      // 3f9: athrow
      // 3fa: aload 0
      // 3fb: invokevirtual erg.gn1 ()Lu7m;
      // 3fe: instanceof za6
      // 401: iload 5
      // 403: ifeq 581
      // 406: ifeq 56e
      // 409: goto 410
      // 40c: invokestatic iyr.a (Loov;)Loov;
      // 40f: athrow
      // 410: getstatic vef.m3n Lvef;
      // 413: getfield vef.bbf I
      // 416: aload 0
      // 417: invokestatic hc0.qa_ (ILerg;)I
      // 41a: istore 7
      // 41c: getstatic vef.uqc Lvef;
      // 41f: getfield vef.bbf I
      // 422: aload 0
      // 423: invokestatic hc0.qa_ (ILerg;)I
      // 426: istore 8
      // 428: getstatic vef.zbl Lvef;
      // 42b: getfield vef.bbf I
      // 42e: aload 0
      // 42f: invokestatic hc0.qa_ (ILerg;)I
      // 432: istore 9
      // 434: getstatic vef._jm Lvef;
      // 437: getfield vef.bbf I
      // 43a: aload 0
      // 43b: invokestatic hc0.qa_ (ILerg;)I
      // 43e: istore 10
      // 440: iload 7
      // 442: iload 5
      // 444: ifeq 491
      // 447: ifle 48f
      // 44a: goto 451
      // 44d: invokestatic iyr.a (Loov;)Loov;
      // 450: athrow
      // 451: invokestatic c05.vz1 ()Lc05;
      // 454: getfield c05.tx1 Lowt;
      // 457: new java/lang/StringBuilder
      // 45a: dup
      // 45b: invokespecial java/lang/StringBuilder.<init> ()V
      // 45e: sipush 32181
      // 461: ldc2_w 6047481161113092462
      // 464: lload 3
      // 465: lxor
      // 466: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46b: nop
      // 46c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46f: iload 7
      // 471: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 474: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 477: iload 1
      // 478: bipush 2
      // 479: imul
      // 47a: i2f
      // 47b: iload 6
      // 47d: i2f
      // 47e: ldc -1052689
      // 480: nop
      // 481: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 484: pop
      // 485: iinc 6 8
      // 488: goto 48f
      // 48b: invokestatic iyr.a (Loov;)Loov;
      // 48e: athrow
      // 48f: iload 8
      // 491: iload 5
      // 493: ifeq 4e0
      // 496: ifle 4de
      // 499: goto 4a0
      // 49c: invokestatic iyr.a (Loov;)Loov;
      // 49f: athrow
      // 4a0: invokestatic c05.vz1 ()Lc05;
      // 4a3: getfield c05.tx1 Lowt;
      // 4a6: new java/lang/StringBuilder
      // 4a9: dup
      // 4aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 4ad: sipush 12353
      // 4b0: ldc2_w 6843530546874911903
      // 4b3: lload 3
      // 4b4: lxor
      // 4b5: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ba: nop
      // 4bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4be: iload 8
      // 4c0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c6: iload 1
      // 4c7: bipush 2
      // 4c8: imul
      // 4c9: i2f
      // 4ca: iload 6
      // 4cc: i2f
      // 4cd: ldc -1052689
      // 4cf: nop
      // 4d0: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 4d3: pop
      // 4d4: iinc 6 8
      // 4d7: goto 4de
      // 4da: invokestatic iyr.a (Loov;)Loov;
      // 4dd: athrow
      // 4de: iload 9
      // 4e0: iload 5
      // 4e2: ifeq 524
      // 4e5: ifle 522
      // 4e8: goto 4ef
      // 4eb: invokestatic iyr.a (Loov;)Loov;
      // 4ee: athrow
      // 4ef: invokestatic c05.vz1 ()Lc05;
      // 4f2: getfield c05.tx1 Lowt;
      // 4f5: new java/lang/StringBuilder
      // 4f8: dup
      // 4f9: invokespecial java/lang/StringBuilder.<init> ()V
      // 4fc: ldc "f"
      // 4fe: nop
      // 4ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 502: iload 9
      // 504: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 507: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 50a: iload 1
      // 50b: bipush 2
      // 50c: imul
      // 50d: i2f
      // 50e: iload 6
      // 510: i2f
      // 511: ldc -1052689
      // 513: nop
      // 514: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 517: pop
      // 518: iinc 6 8
      // 51b: goto 522
      // 51e: invokestatic iyr.a (Loov;)Loov;
      // 521: athrow
      // 522: iload 10
      // 524: iload 5
      // 526: ifeq 581
      // 529: ifle 56e
      // 52c: goto 533
      // 52f: invokestatic iyr.a (Loov;)Loov;
      // 532: athrow
      // 533: invokestatic c05.vz1 ()Lc05;
      // 536: getfield c05.tx1 Lowt;
      // 539: new java/lang/StringBuilder
      // 53c: dup
      // 53d: invokespecial java/lang/StringBuilder.<init> ()V
      // 540: sipush 31989
      // 543: ldc2_w 8430503293366583334
      // 546: lload 3
      // 547: lxor
      // 548: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54d: nop
      // 54e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 551: iload 10
      // 553: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 556: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 559: iload 1
      // 55a: bipush 2
      // 55b: imul
      // 55c: i2f
      // 55d: iload 6
      // 55f: i2f
      // 560: ldc -1052689
      // 562: nop
      // 563: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 566: pop
      // 567: goto 56e
      // 56a: invokestatic iyr.a (Loov;)Loov;
      // 56d: athrow
      // 56e: aload 0
      // 56f: invokevirtual erg.gn1 ()Lu7m;
      // 572: iload 5
      // 574: ifeq 6fd
      // 577: instanceof arf
      // 57a: goto 581
      // 57d: invokestatic iyr.a (Loov;)Loov;
      // 580: athrow
      // 581: ifeq 6ed
      // 584: getstatic vef._jm Lvef;
      // 587: getfield vef.bbf I
      // 58a: aload 0
      // 58b: invokestatic hc0.qa_ (ILerg;)I
      // 58e: istore 7
      // 590: getstatic vef.y_g Lvef;
      // 593: getfield vef.bbf I
      // 596: aload 0
      // 597: invokestatic hc0.qa_ (ILerg;)I
      // 59a: istore 8
      // 59c: getstatic vef.xl7 Lvef;
      // 59f: getfield vef.bbf I
      // 5a2: aload 0
      // 5a3: invokestatic hc0.qa_ (ILerg;)I
      // 5a6: istore 9
      // 5a8: getstatic vef.w9s Lvef;
      // 5ab: getfield vef.bbf I
      // 5ae: aload 0
      // 5af: invokestatic hc0.qa_ (ILerg;)I
      // 5b2: istore 10
      // 5b4: iload 8
      // 5b6: iload 5
      // 5b8: ifeq 605
      // 5bb: ifle 603
      // 5be: goto 5c5
      // 5c1: invokestatic iyr.a (Loov;)Loov;
      // 5c4: athrow
      // 5c5: invokestatic c05.vz1 ()Lc05;
      // 5c8: getfield c05.tx1 Lowt;
      // 5cb: new java/lang/StringBuilder
      // 5ce: dup
      // 5cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 5d2: sipush 9320
      // 5d5: ldc2_w 6339306100646123698
      // 5d8: lload 3
      // 5d9: lxor
      // 5da: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5df: nop
      // 5e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e3: iload 8
      // 5e5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5eb: iload 1
      // 5ec: bipush 2
      // 5ed: imul
      // 5ee: i2f
      // 5ef: iload 6
      // 5f1: i2f
      // 5f2: ldc -1052689
      // 5f4: nop
      // 5f5: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 5f8: pop
      // 5f9: iinc 6 8
      // 5fc: goto 603
      // 5ff: invokestatic iyr.a (Loov;)Loov;
      // 602: athrow
      // 603: iload 9
      // 605: iload 5
      // 607: ifeq 654
      // 60a: ifle 652
      // 60d: goto 614
      // 610: invokestatic iyr.a (Loov;)Loov;
      // 613: athrow
      // 614: invokestatic c05.vz1 ()Lc05;
      // 617: getfield c05.tx1 Lowt;
      // 61a: new java/lang/StringBuilder
      // 61d: dup
      // 61e: invokespecial java/lang/StringBuilder.<init> ()V
      // 621: sipush 6577
      // 624: ldc2_w 8717268259253233000
      // 627: lload 3
      // 628: lxor
      // 629: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62e: nop
      // 62f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 632: iload 9
      // 634: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 637: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 63a: iload 1
      // 63b: bipush 2
      // 63c: imul
      // 63d: i2f
      // 63e: iload 6
      // 640: i2f
      // 641: ldc -1052689
      // 643: nop
      // 644: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 647: pop
      // 648: iinc 6 8
      // 64b: goto 652
      // 64e: invokestatic iyr.a (Loov;)Loov;
      // 651: athrow
      // 652: iload 10
      // 654: iload 5
      // 656: ifeq 6a3
      // 659: ifle 6a1
      // 65c: goto 663
      // 65f: invokestatic iyr.a (Loov;)Loov;
      // 662: athrow
      // 663: invokestatic c05.vz1 ()Lc05;
      // 666: getfield c05.tx1 Lowt;
      // 669: new java/lang/StringBuilder
      // 66c: dup
      // 66d: invokespecial java/lang/StringBuilder.<init> ()V
      // 670: sipush 21687
      // 673: ldc2_w 7817213300438788193
      // 676: lload 3
      // 677: lxor
      // 678: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67d: nop
      // 67e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 681: iload 10
      // 683: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 686: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 689: iload 1
      // 68a: bipush 2
      // 68b: imul
      // 68c: i2f
      // 68d: iload 6
      // 68f: i2f
      // 690: ldc -1052689
      // 692: nop
      // 693: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 696: pop
      // 697: iinc 6 8
      // 69a: goto 6a1
      // 69d: invokestatic iyr.a (Loov;)Loov;
      // 6a0: athrow
      // 6a1: iload 7
      // 6a3: iload 5
      // 6a5: ifeq 6ec
      // 6a8: ifle 6ed
      // 6ab: goto 6b2
      // 6ae: invokestatic iyr.a (Loov;)Loov;
      // 6b1: athrow
      // 6b2: invokestatic c05.vz1 ()Lc05;
      // 6b5: getfield c05.tx1 Lowt;
      // 6b8: new java/lang/StringBuilder
      // 6bb: dup
      // 6bc: invokespecial java/lang/StringBuilder.<init> ()V
      // 6bf: sipush 31500
      // 6c2: ldc2_w 6754483953919838160
      // 6c5: lload 3
      // 6c6: lxor
      // 6c7: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cc: nop
      // 6cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6d0: iload 7
      // 6d2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d8: iload 1
      // 6d9: bipush 2
      // 6da: imul
      // 6db: i2f
      // 6dc: iload 6
      // 6de: i2f
      // 6df: ldc -1052689
      // 6e1: nop
      // 6e2: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 6e5: goto 6ec
      // 6e8: invokestatic iyr.a (Loov;)Loov;
      // 6eb: athrow
      // 6ec: pop
      // 6ed: aload 0
      // 6ee: iload 5
      // 6f0: ifeq 70b
      // 6f3: invokevirtual erg.gn1 ()Lu7m;
      // 6f6: goto 6fd
      // 6f9: invokestatic iyr.a (Loov;)Loov;
      // 6fc: athrow
      // 6fd: getstatic xbr.yyh Lu7m;
      // 700: if_acmpne 746
      // 703: aload 0
      // 704: goto 70b
      // 707: invokestatic iyr.a (Loov;)Loov;
      // 70a: athrow
      // 70b: invokevirtual erg._xr ()Z
      // 70e: iload 5
      // 710: ifeq 745
      // 713: ifeq 746
      // 716: goto 71d
      // 719: invokestatic iyr.a (Loov;)Loov;
      // 71c: athrow
      // 71d: invokestatic c05.vz1 ()Lc05;
      // 720: getfield c05.tx1 Lowt;
      // 723: sipush 1947
      // 726: ldc2_w 4072733886928206662
      // 729: lload 3
      // 72a: lxor
      // 72b: invokedynamic c (IJ)Ljava/lang/String; bsm=iyr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 730: nop
      // 731: iload 1
      // 732: bipush 2
      // 733: imul
      // 734: i2f
      // 735: iload 6
      // 737: i2f
      // 738: ldc -1052689
      // 73a: nop
      // 73b: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 73e: goto 745
      // 741: invokestatic iyr.a (Loov;)Loov;
      // 744: athrow
      // 745: pop
      // 746: return
   }

   public static void uyb() {
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glDepthMask(true);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glHint(3155, 4354);
   }

   public static void let() {
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glHint(3155, 4352);
   }

   public static void k0b(Color var0) {
      GL11.glColor4f((float)var0.getRed() / 255.0F, (float)var0.getGreen() / 255.0F, (float)var0.getBlue() / 255.0F, (float)var0.getAlpha() / 255.0F);
   }

   public static void yfp(int var0) {
      float var1 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      float var2 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var3 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var4 = (float)(var0 & 0xFF) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
   }

   public static void oci(float var0, int var1, int var2, int var3) {
      float var4 = 0.003921569F * (float)var1;
      float var5 = 0.003921569F * (float)var2;
      float var6 = 0.003921569F * (float)var3;
      GL11.glColor4f(var4, var5, var6, var0);
   }

   @Deprecated
   public static void xow(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      b0t.df9((float)(var0 + var6), (float)(var1 + var6), (float)(var2 - var6), (float)(var3 - var6), var5);
      b0t.df9((float)var0, (float)(var1 + 1), (float)(var0 + var6), (float)(var3 - 1), var4);
      b0t.df9((float)(var0 + var6), (float)var1, (float)var2, (float)(var1 + var6), var4);
      b0t.df9((float)(var0 + var6), (float)(var3 - var6), (float)var2, (float)var3, var4);
      b0t.df9((float)(var2 - var6), (float)(var1 + var6), (float)var2, (float)(var3 - var6), var4);
   }

   public static void a13(double var0, double var2, double var4, double var6) {
      GL11.glBegin(7);
      GL11.glVertex2f((float)var0, (float)var6);
      GL11.glVertex2f((float)var4, (float)var6);
      GL11.glVertex2f((float)var4, (float)var2);
      GL11.glVertex2f((float)var0, (float)var2);
      GL11.glEnd();
   }

   public static int o5c(int var0, float var1) {
      Color var2 = new Color(var0);
      float var3 = 0.003921569F * (float)var2.getRed();
      float var4 = 0.003921569F * (float)var2.getGreen();
      float var5 = 0.003921569F * (float)var2.getBlue();
      return new Color(var3, var4, var5, var1).getRGB();
   }

   public static void o_o(nh4 var0) {
      jom var1 = jom.yut();
      q3g var2 = var1.zuq();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(1, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var1.q7g();
   }

   public static void a1e(nh4 var0) {
      jom var1 = jom.yut();
      q3g var2 = var1.zuq();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var1.q7g();
   }

   public static void jil(double var0, double var2, double var4, int var6, int var7, float var8) {
      float var9 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var10 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var12 = (float)(var6 & 0xFF) / 255.0F;
      float var13 = (float)(var7 >> 24 & 0xFF) / 255.0F;
      float var14 = (float)(var7 >> 16 & 0xFF) / 255.0F;
      float var15 = (float)(var7 >> 8 & 0xFF) / 255.0F;
      float var16 = (float)(var7 & 0xFF) / 255.0F;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var10, var11, var12, var9);
      a1e(new nh4(var0, var2, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glLineWidth(var8);
      GL11.glColor4f(var14, var15, var16, var13);
      o_o(new nh4(var0, var2, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void o_r(double var0, double var2, double var4, int var6) {
      float var7 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var6 & 0xFF) / 255.0F;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var8, var9, var10, var7);
      a1e(new nh4(var0, var2, var4, var0 + 0.1, var2 + 0.1, var4 + 0.1));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void w85(nh4 var0, int var1) {
      GL11.glPushMatrix();
      float var2 = (float)(var1 >> 24 & 0xFF) / 255.0F;
      float var3 = (float)(var1 >> 16 & 0xFF) / 255.0F;
      float var4 = (float)(var1 >> 8 & 0xFF) / 255.0F;
      float var5 = (float)(var1 & 0xFF) / 255.0F;
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(2896);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var2, var3, var4, var5);
      ch_(var0);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void ch_(nh4 var0) {
      int var1 = t9d.c();

      nh4 var10000;
      label22: {
         try {
            var10000 = var0;
            if (var1 != 0) {
               break label22;
            }

            if (var0 == null) {
               return;
            }
         } catch (oov var2) {
            throw a(var2);
         }

         GL11.glBegin(7);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.oqj);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.oqj);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.t8n);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.t8n);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.t8n);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.t8n);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.oqj);
         GL11.glVertex3d(var0.rlc, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.rlc, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.bx_, var0.t8n);
         GL11.glVertex3d(var0.t_2, var0.i2c, var0.oqj);
         var10000 = var0;
      }

      GL11.glVertex3d(var10000.t_2, var0.bx_, var0.oqj);
      GL11.glEnd();
   }

   public static void _fu(nh4 var0, float var1, int var2) {
      GL11.glPushMatrix();
      float var3 = (float)(var2 >> 24 & 0xFF) / 255.0F;
      float var4 = (float)(var2 >> 16 & 0xFF) / 255.0F;
      float var5 = (float)(var2 >> 8 & 0xFF) / 255.0F;
      float var6 = (float)(var2 & 0xFF) / 255.0F;
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(2896);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(var1);
      GL11.glColor4f(var3, var4, var5, var6);
      vw6(var0);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void f9f(
      double var0, double var2, double var4, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14
   ) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var6, var7, var8, var9);
      a1e(new nh4(var0, var2, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glLineWidth(var14);
      GL11.glColor4f(var10, var11, var12, var13);
      o_o(new nh4(var0, var2, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void svw(
      double var0, double var2, double var4, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14
   ) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var6, var7, var8, var9);
      a1e(new nh4(var0, var2 + 1.1, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glLineWidth(var14);
      GL11.glColor4f(var10, var11, var12, var13);
      o_o(new nh4(var0, var2 + 1.1, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void fj_(double var0, double var2, double var4, float var6, float var7, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var6, var7, var8, var9);
      a1e(new nh4(var0, var2, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void h3x(double var0, double var2, double var4, Color var6, float var7) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f((float)var6.getRed() / 255.0F, (float)var6.getGreen() / 255.0F, (float)var6.getBlue() / 255.0F, (float)var6.getAlpha() / 255.0F);
      a1e(new nh4(var0, var2, var4, var0 + (double)var7, var2 + (double)var7, var4 + (double)var7));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void heb(double var0, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(3.0F);
      GL11.glColor4f(var10, var11, var12, var13);
      o_o(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void qe5(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 0
      // 01: bipush 24
      // 03: ishr
      // 04: sipush 255
      // 07: iand
      // 08: i2f
      // 09: ldc 255.0
      // 0b: nop
      // 0c: fdiv
      // 0d: fstore 2
      // 0e: iload 0
      // 0f: bipush 16
      // 11: ishr
      // 12: sipush 255
      // 15: iand
      // 16: i2f
      // 17: ldc 255.0
      // 19: nop
      // 1a: fdiv
      // 1b: fstore 3
      // 1c: invokestatic t9d.b ()I
      // 1f: iload 0
      // 20: bipush 8
      // 22: ishr
      // 23: sipush 255
      // 26: iand
      // 27: i2f
      // 28: ldc 255.0
      // 2a: nop
      // 2b: fdiv
      // 2c: fstore 4
      // 2e: istore 1
      // 2f: iload 0
      // 30: sipush 255
      // 33: iand
      // 34: i2f
      // 35: ldc 255.0
      // 37: nop
      // 38: fdiv
      // 39: fstore 5
      // 3b: fload 3
      // 3c: fload 4
      // 3e: fload 5
      // 40: fload 2
      // 41: iload 1
      // 42: ifeq 59
      // 45: fconst_0
      // 46: fcmpl
      // 47: ifne 5c
      // 4a: goto 51
      // 4d: invokestatic iyr.a (Loov;)Loov;
      // 50: athrow
      // 51: fconst_1
      // 52: goto 59
      // 55: invokestatic iyr.a (Loov;)Loov;
      // 58: athrow
      // 59: goto 5d
      // 5c: fload 2
      // 5d: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 60: return
   }

   public static void bgi(double var0, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var10, var11, var12, var13);
      a1e(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void eu5(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4f(var10, var11, var12, var13);
      a1e(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glLineWidth(var18);
      GL11.glColor4f(var14, var15, var16, var17);
      o_o(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void vaw(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDepthMask(false);
      GL11.glColor4f(var10, var11, var12, var13);
      a1e(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glLineWidth(var18);
      GL11.glColor4f(var14, var15, var16, var17);
      o_o(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void zgx(float var0, float var1, float var2, float var3, int var4) {
      uyb();
      int var10000 = t9d.b();
      qe5(var4);
      int var5 = var10000;
      GL11.glLineWidth(var3);
      int var6 = (int)Math.min(Math.max(var2, 45.0F), 360.0F);
      GL11.glBegin(2);
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            double var8 = (Math.PI * 2) * (double)var7 / (double)var6;

            try {
               GL11.glVertex2d((double)var0 + Math.sin(var8) * (double)var2, (double)var1 + Math.cos(var8) * (double)var2);
               var7++;
               if (var5 == 0) {
                  break;
               }

               if (var5 != 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         GL11.glEnd();
         let();
         break;
      }
   }

   public static void zsq(int var0, int var1, double var2, int var4) {
      float var6 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var7 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      int var10000 = t9d.c();
      float var9 = (float)(var4 & 0xFF) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var7, var8, var9, var6);
      GL11.glBegin(2);
      int var5 = var10000;
      int var10 = 0;

      while (true) {
         if (var10 <= 360) {
            double var11 = Math.sin((double)var10 * Math.PI / 180.0) * var2;
            double var13 = Math.cos((double)var10 * Math.PI / 180.0) * var2;

            try {
               GL11.glVertex2d((double)var0 + var11, (double)var1 + var13);
               var10++;
               if (var5 != 0) {
                  break;
               }

               if (var5 == 0) {
                  continue;
               }
            } catch (oov var15) {
               throw a(var15);
            }
         }

         GL11.glEnd();
         GL11.glDisable(2848);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         break;
      }
   }

   public static void sw6(float var0, float var1, float var2, int var3) {
      uyb();
      qe5(var3);
      int var10000 = t9d.b();
      int var5 = (int)Math.min(Math.max(var2, 45.0F), 360.0F);
      int var4 = var10000;
      GL11.glBegin(9);
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            double var7 = (Math.PI * 2) * (double)var6 / (double)var5;

            try {
               GL11.glVertex2d((double)var0 + Math.sin(var7) * (double)var2, (double)var1 + Math.cos(var7) * (double)var2);
               var6++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         GL11.glEnd();
         let();
         zgx(var0, var1, var2, 1.5F, 16777215);
         break;
      }
   }

   public static void gxf(int var0, int var1, double var2, int var4) {
      float var6 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var7 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(var4 & 0xFF) / 255.0F;
      GL11.glEnable(3042);
      int var10000 = t9d.b();
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glBlendFunc(770, 771);
      int var5 = var10000;
      GL11.glColor4f(var7, var8, var9, var6);
      GL11.glBegin(6);
      int var10 = 0;

      while (true) {
         if (var10 <= 360) {
            double var11 = Math.sin((double)var10 * Math.PI / 180.0) * var2;
            double var13 = Math.cos((double)var10 * Math.PI / 180.0) * var2;

            try {
               GL11.glVertex2d((double)var0 + var11, (double)var1 + var13);
               var10++;
               if (var5 == 0) {
                  break;
               }

               if (var5 != 0) {
                  continue;
               }
            } catch (oov var15) {
               throw a(var15);
            }
         }

         GL11.glEnd();
         GL11.glDisable(2848);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         break;
      }
   }

   public static void zgf(double var0, double var2, double var4, double var6, int var8) {
      int var9 = t9d.b();

      int var10000;
      label37: {
         label36: {
            try {
               double var20;
               var10000 = (var20 = var0 - var4) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
               if (var9 == 0) {
                  break label37;
               }

               if (var10000 >= 0) {
                  break label36;
               }
            } catch (oov var17) {
               throw a(var17);
            }

            double var10 = var0;
            var0 = var4;
            var4 = var10;
         }

         double var21;
         var10000 = (var21 = var2 - var6) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      }

      label28: {
         label27: {
            try {
               if (var9 == 0) {
                  break label28;
               }

               if (var10000 >= 0) {
                  break label27;
               }
            } catch (oov var16) {
               throw a(var16);
            }

            double var18 = var2;
            var2 = var6;
            var6 = var18;
         }

         var10000 = var8 >> 24 & 0xFF;
      }

      float var19 = (float)var10000 / 255.0F;
      float var11 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var12 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var13 = (float)(var8 & 0xFF) / 255.0F;
      jom var14 = jom.yut();
      q3g var15 = var14.zuq();
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var11, var12, var13, var19);
      var15.ezr(7, gnl.gx3);
      var15.g5o(var0, var6, 0.0);
      var15.g5o(var4, var6, 0.0);
      var15.g5o(var4, var2, 0.0);
      var15.g5o(var0, var2, 0.0);
      var14.q7g();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   public static void _6u(double var0, double var2, double var4, double var6, int var8, int var9) {
      float var10 = (float)(var8 >> 24 & 0xFF) / 255.0F;
      float var11 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var12 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var13 = (float)(var8 & 0xFF) / 255.0F;
      float var14 = (float)(var9 >> 24 & 0xFF) / 255.0F;
      float var15 = (float)(var9 >> 16 & 0xFF) / 255.0F;
      float var16 = (float)(var9 >> 8 & 0xFF) / 255.0F;
      float var17 = (float)(var9 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      jom var18 = jom.yut();
      q3g var19 = var18.zuq();
      var19.ezr(7, gnl.gec);
      var19.g5o(var4, var2, 0.0).gs4(var11, var12, var13, var10).pzw();
      var19.g5o(var0, var2, 0.0).gs4(var11, var12, var13, var10).pzw();
      var19.g5o(var0, var6, 0.0).gs4(var15, var16, var17, var14).pzw();
      var19.g5o(var4, var6, 0.0).gs4(var15, var16, var17, var14).pzw();
      var18.q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   public static void phr(float param0, float param1, float param2, float param3, float param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 5
      // 002: bipush 24
      // 004: ishr
      // 005: sipush 255
      // 008: iand
      // 009: i2f
      // 00a: ldc 255.0
      // 00c: nop
      // 00d: fdiv
      // 00e: fstore 8
      // 010: iload 5
      // 012: bipush 16
      // 014: ishr
      // 015: sipush 255
      // 018: iand
      // 019: i2f
      // 01a: ldc 255.0
      // 01c: nop
      // 01d: fdiv
      // 01e: fstore 9
      // 020: invokestatic t9d.b ()I
      // 023: iload 5
      // 025: bipush 8
      // 027: ishr
      // 028: sipush 255
      // 02b: iand
      // 02c: i2f
      // 02d: ldc 255.0
      // 02f: nop
      // 030: fdiv
      // 031: fstore 10
      // 033: istore 7
      // 035: iload 5
      // 037: sipush 255
      // 03a: iand
      // 03b: i2f
      // 03c: ldc 255.0
      // 03e: nop
      // 03f: fdiv
      // 040: fstore 11
      // 042: invokestatic hzu.dp2 ()V
      // 045: fload 0
      // 046: f2d
      // 047: fload 1
      // 048: f2d
      // 049: fload 2
      // 04a: f2d
      // 04b: fload 3
      // 04c: f2d
      // 04d: new java/awt/Color
      // 050: dup
      // 051: fload 9
      // 053: fload 10
      // 055: fload 11
      // 057: fload 8
      // 059: invokespecial java/awt/Color.<init> (FFFF)V
      // 05c: invokestatic iyr.rm2 (DDDDLjava/awt/Color;)V
      // 05f: invokestatic hzu.spd ()V
      // 062: invokestatic hzu.m_1 ()V
      // 065: sipush 770
      // 068: sipush 771
      // 06b: bipush 1
      // 06c: bipush 0
      // 06d: invokestatic hzu.u39 (IIII)V
      // 070: fload 9
      // 072: fload 10
      // 074: fload 11
      // 076: fload 8
      // 078: invokestatic hzu.wn0 (FFFF)V
      // 07b: fload 4
      // 07d: iload 7
      // 07f: ifeq 09d
      // 082: fconst_1
      // 083: fcmpl
      // 084: ifne 09b
      // 087: goto 08e
      // 08a: invokestatic iyr.a (Loov;)Loov;
      // 08d: athrow
      // 08e: sipush 2848
      // 091: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 094: goto 09b
      // 097: invokestatic iyr.a (Loov;)Loov;
      // 09a: athrow
      // 09b: fload 4
      // 09d: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 0a0: invokestatic jom.yut ()Ljom;
      // 0a3: astore 12
      // 0a5: aload 12
      // 0a7: invokevirtual jom.zuq ()Lq3g;
      // 0aa: astore 13
      // 0ac: aload 13
      // 0ae: bipush 1
      // 0af: getstatic gnl.gx3 Lbe7;
      // 0b2: invokevirtual q3g.ezr (ILbe7;)V
      // 0b5: aload 13
      // 0b7: fload 0
      // 0b8: f2d
      // 0b9: fload 1
      // 0ba: f2d
      // 0bb: dconst_0
      // 0bc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0bf: pop
      // 0c0: aload 13
      // 0c2: fload 0
      // 0c3: f2d
      // 0c4: fload 3
      // 0c5: f2d
      // 0c6: dconst_0
      // 0c7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0ca: pop
      // 0cb: aload 13
      // 0cd: fload 2
      // 0ce: f2d
      // 0cf: fload 3
      // 0d0: f2d
      // 0d1: dconst_0
      // 0d2: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0d5: pop
      // 0d6: aload 13
      // 0d8: fload 2
      // 0d9: f2d
      // 0da: fload 1
      // 0db: f2d
      // 0dc: dconst_0
      // 0dd: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0e0: pop
      // 0e1: aload 13
      // 0e3: fload 0
      // 0e4: f2d
      // 0e5: fload 1
      // 0e6: f2d
      // 0e7: dconst_0
      // 0e8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0eb: pop
      // 0ec: aload 13
      // 0ee: fload 2
      // 0ef: f2d
      // 0f0: fload 1
      // 0f1: f2d
      // 0f2: dconst_0
      // 0f3: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f6: pop
      // 0f7: aload 13
      // 0f9: fload 0
      // 0fa: f2d
      // 0fb: fload 3
      // 0fc: f2d
      // 0fd: dconst_0
      // 0fe: invokevirtual q3g.g5o (DDD)Lq3g;
      // 101: pop
      // 102: aload 13
      // 104: fload 2
      // 105: f2d
      // 106: fload 3
      // 107: f2d
      // 108: dconst_0
      // 109: invokevirtual q3g.g5o (DDD)Lq3g;
      // 10c: pop
      // 10d: aload 12
      // 10f: invokevirtual jom.q7g ()V
      // 112: fconst_2
      // 113: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 116: iload 7
      // 118: ifeq 13f
      // 11b: fload 4
      // 11d: fconst_1
      // 11e: fcmpl
      // 11f: ifne 136
      // 122: goto 129
      // 125: invokestatic iyr.a (Loov;)Loov;
      // 128: athrow
      // 129: sipush 2848
      // 12c: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 12f: goto 136
      // 132: invokestatic iyr.a (Loov;)Loov;
      // 135: athrow
      // 136: invokestatic hzu.rqj ()V
      // 139: invokestatic hzu.ux6 ()V
      // 13c: invokestatic hzu.x3w ()V
      // 13f: return
   }

   public static void rm2(double var0, double var2, double var4, double var6, Color var8) {
      uyb();
      k0b(var8);
      a13(var0, var2, var4, var6);
      let();
   }

   public static void ta3(double param0, double param2, double param4, double param6, float param8, int param9, int param10, int param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 9
      // 002: bipush 24
      // 004: ishr
      // 005: sipush 255
      // 008: iand
      // 009: i2f
      // 00a: ldc 255.0
      // 00c: nop
      // 00d: fdiv
      // 00e: fstore 13
      // 010: iload 9
      // 012: bipush 16
      // 014: ishr
      // 015: sipush 255
      // 018: iand
      // 019: i2f
      // 01a: ldc 255.0
      // 01c: nop
      // 01d: fdiv
      // 01e: fstore 14
      // 020: invokestatic t9d.b ()I
      // 023: iload 9
      // 025: bipush 8
      // 027: ishr
      // 028: sipush 255
      // 02b: iand
      // 02c: i2f
      // 02d: ldc 255.0
      // 02f: nop
      // 030: fdiv
      // 031: fstore 15
      // 033: iload 9
      // 035: sipush 255
      // 038: iand
      // 039: i2f
      // 03a: ldc 255.0
      // 03c: nop
      // 03d: fdiv
      // 03e: fstore 16
      // 040: istore 12
      // 042: invokestatic hzu.dp2 ()V
      // 045: dload 0
      // 046: dload 2
      // 047: dload 4
      // 049: dload 6
      // 04b: iload 10
      // 04d: iload 11
      // 04f: invokestatic iyr._6u (DDDDII)V
      // 052: invokestatic hzu.spd ()V
      // 055: invokestatic hzu.m_1 ()V
      // 058: sipush 770
      // 05b: sipush 771
      // 05e: bipush 1
      // 05f: bipush 0
      // 060: invokestatic hzu.u39 (IIII)V
      // 063: fload 14
      // 065: fload 15
      // 067: fload 16
      // 069: fload 13
      // 06b: invokestatic hzu.wn0 (FFFF)V
      // 06e: fload 8
      // 070: iload 12
      // 072: ifeq 090
      // 075: fconst_1
      // 076: fcmpl
      // 077: ifne 08e
      // 07a: goto 081
      // 07d: invokestatic iyr.a (Loov;)Loov;
      // 080: athrow
      // 081: sipush 2848
      // 084: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 087: goto 08e
      // 08a: invokestatic iyr.a (Loov;)Loov;
      // 08d: athrow
      // 08e: fload 8
      // 090: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 093: invokestatic jom.yut ()Ljom;
      // 096: astore 17
      // 098: aload 17
      // 09a: invokevirtual jom.zuq ()Lq3g;
      // 09d: astore 18
      // 09f: aload 18
      // 0a1: bipush 1
      // 0a2: getstatic gnl.gx3 Lbe7;
      // 0a5: invokevirtual q3g.ezr (ILbe7;)V
      // 0a8: aload 18
      // 0aa: dload 0
      // 0ab: dload 2
      // 0ac: dconst_0
      // 0ad: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0b0: pop
      // 0b1: aload 18
      // 0b3: dload 0
      // 0b4: dload 6
      // 0b6: dconst_0
      // 0b7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0ba: pop
      // 0bb: aload 18
      // 0bd: dload 4
      // 0bf: dload 6
      // 0c1: dconst_0
      // 0c2: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0c5: pop
      // 0c6: aload 18
      // 0c8: dload 4
      // 0ca: dload 2
      // 0cb: dconst_0
      // 0cc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0cf: pop
      // 0d0: aload 18
      // 0d2: dload 0
      // 0d3: dload 2
      // 0d4: dconst_0
      // 0d5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0d8: pop
      // 0d9: aload 18
      // 0db: dload 4
      // 0dd: dload 2
      // 0de: dconst_0
      // 0df: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0e2: pop
      // 0e3: aload 18
      // 0e5: dload 0
      // 0e6: dload 6
      // 0e8: dconst_0
      // 0e9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0ec: pop
      // 0ed: aload 18
      // 0ef: dload 4
      // 0f1: dload 6
      // 0f3: dconst_0
      // 0f4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f7: pop
      // 0f8: aload 17
      // 0fa: invokevirtual jom.q7g ()V
      // 0fd: fconst_2
      // 0fe: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 101: iload 12
      // 103: ifeq 12a
      // 106: fload 8
      // 108: fconst_1
      // 109: fcmpl
      // 10a: ifne 121
      // 10d: goto 114
      // 110: invokestatic iyr.a (Loov;)Loov;
      // 113: athrow
      // 114: sipush 2848
      // 117: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 11a: goto 121
      // 11d: invokestatic iyr.a (Loov;)Loov;
      // 120: athrow
      // 121: invokestatic hzu.rqj ()V
      // 124: invokestatic hzu.ux6 ()V
      // 127: invokestatic hzu.x3w ()V
      // 12a: return
   }

   public static double t4e(double var0, double var2, float var4, double var5) {
      return var0 + (var2 - var0) * (double)var4 - var5;
   }

   public static void us9(i2h var0, double var1, double var3, double var5, int var7, int var8) {
      hzu.dp2();
      int var10000 = t9d.c();
      GL11.glLineWidth(1.0F);
      nh4 var10 = var0.aaw();
      int var9 = var10000;
      nh4 var11 = new nh4(
         var10.rlc - var0.o2v + var1,
         var10.bx_ - var0.kfp + var3,
         var10.t8n - var0.vbd + var5,
         var10.t_2 - var0.o2v + var1,
         var10.i2c - var0.kfp + var3,
         var10.oqj - var0.vbd + var5
      );

      label20: {
         try {
            if (var9 != 0) {
               return;
            }

            if (var7 == 0) {
               break label20;
            }
         } catch (oov var13) {
            throw a(var13);
         }

         hzu._o4();
         fek(var11, var8, true);
         hzu.fpt();
         int[] var12 = iyr$rw6.plf(var7);
      }

      hzu.x3w();
   }

   public static void fek(nh4 param0, int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic hzu.dp2 ()V
      // 003: iload 1
      // 004: bipush 24
      // 006: ishr
      // 007: sipush 255
      // 00a: iand
      // 00b: i2f
      // 00c: ldc 255.0
      // 00e: nop
      // 00f: fdiv
      // 010: fstore 4
      // 012: invokestatic t9d.c ()I
      // 015: iload 1
      // 016: bipush 16
      // 018: ishr
      // 019: sipush 255
      // 01c: iand
      // 01d: i2f
      // 01e: ldc 255.0
      // 020: nop
      // 021: fdiv
      // 022: fstore 5
      // 024: istore 3
      // 025: iload 1
      // 026: bipush 8
      // 028: ishr
      // 029: sipush 255
      // 02c: iand
      // 02d: i2f
      // 02e: ldc 255.0
      // 030: nop
      // 031: fdiv
      // 032: fstore 6
      // 034: iload 1
      // 035: sipush 255
      // 038: iand
      // 039: i2f
      // 03a: ldc 255.0
      // 03c: nop
      // 03d: fdiv
      // 03e: fstore 7
      // 040: invokestatic jom.yut ()Ljom;
      // 043: invokevirtual jom.zuq ()Lq3g;
      // 046: astore 8
      // 048: iload 2
      // 049: iload 3
      // 04a: ifne 06b
      // 04d: ifeq 069
      // 050: goto 057
      // 053: invokestatic iyr.a (Loov;)Loov;
      // 056: athrow
      // 057: fload 5
      // 059: fload 6
      // 05b: fload 7
      // 05d: fload 4
      // 05f: invokestatic hzu.wn0 (FFFF)V
      // 062: goto 069
      // 065: invokestatic iyr.a (Loov;)Loov;
      // 068: athrow
      // 069: bipush 7
      // 06b: istore 9
      // 06d: aload 8
      // 06f: bipush 7
      // 071: getstatic gnl.gx3 Lbe7;
      // 074: invokevirtual q3g.ezr (ILbe7;)V
      // 077: aload 8
      // 079: aload 0
      // 07a: getfield nh4.rlc D
      // 07d: aload 0
      // 07e: getfield nh4.bx_ D
      // 081: aload 0
      // 082: getfield nh4.t8n D
      // 085: invokevirtual q3g.g5o (DDD)Lq3g;
      // 088: pop
      // 089: aload 8
      // 08b: aload 0
      // 08c: getfield nh4.rlc D
      // 08f: aload 0
      // 090: getfield nh4.i2c D
      // 093: aload 0
      // 094: getfield nh4.t8n D
      // 097: invokevirtual q3g.g5o (DDD)Lq3g;
      // 09a: pop
      // 09b: aload 8
      // 09d: aload 0
      // 09e: getfield nh4.t_2 D
      // 0a1: aload 0
      // 0a2: getfield nh4.bx_ D
      // 0a5: aload 0
      // 0a6: getfield nh4.t8n D
      // 0a9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0ac: pop
      // 0ad: aload 8
      // 0af: aload 0
      // 0b0: getfield nh4.t_2 D
      // 0b3: aload 0
      // 0b4: getfield nh4.i2c D
      // 0b7: aload 0
      // 0b8: getfield nh4.t8n D
      // 0bb: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0be: pop
      // 0bf: aload 8
      // 0c1: aload 0
      // 0c2: getfield nh4.t_2 D
      // 0c5: aload 0
      // 0c6: getfield nh4.bx_ D
      // 0c9: aload 0
      // 0ca: getfield nh4.oqj D
      // 0cd: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0d0: pop
      // 0d1: aload 8
      // 0d3: aload 0
      // 0d4: getfield nh4.t_2 D
      // 0d7: aload 0
      // 0d8: getfield nh4.i2c D
      // 0db: aload 0
      // 0dc: getfield nh4.oqj D
      // 0df: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0e2: pop
      // 0e3: aload 8
      // 0e5: aload 0
      // 0e6: getfield nh4.rlc D
      // 0e9: aload 0
      // 0ea: getfield nh4.bx_ D
      // 0ed: aload 0
      // 0ee: getfield nh4.oqj D
      // 0f1: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f4: pop
      // 0f5: aload 8
      // 0f7: aload 0
      // 0f8: getfield nh4.rlc D
      // 0fb: aload 0
      // 0fc: getfield nh4.i2c D
      // 0ff: aload 0
      // 100: getfield nh4.oqj D
      // 103: invokevirtual q3g.g5o (DDD)Lq3g;
      // 106: pop
      // 107: invokestatic jom.yut ()Ljom;
      // 10a: invokevirtual jom.q7g ()V
      // 10d: aload 8
      // 10f: bipush 7
      // 111: getstatic gnl.gx3 Lbe7;
      // 114: invokevirtual q3g.ezr (ILbe7;)V
      // 117: aload 8
      // 119: aload 0
      // 11a: getfield nh4.t_2 D
      // 11d: aload 0
      // 11e: getfield nh4.i2c D
      // 121: aload 0
      // 122: getfield nh4.t8n D
      // 125: invokevirtual q3g.g5o (DDD)Lq3g;
      // 128: pop
      // 129: aload 8
      // 12b: aload 0
      // 12c: getfield nh4.t_2 D
      // 12f: aload 0
      // 130: getfield nh4.bx_ D
      // 133: aload 0
      // 134: getfield nh4.t8n D
      // 137: invokevirtual q3g.g5o (DDD)Lq3g;
      // 13a: pop
      // 13b: aload 8
      // 13d: aload 0
      // 13e: getfield nh4.rlc D
      // 141: aload 0
      // 142: getfield nh4.i2c D
      // 145: aload 0
      // 146: getfield nh4.t8n D
      // 149: invokevirtual q3g.g5o (DDD)Lq3g;
      // 14c: pop
      // 14d: aload 8
      // 14f: aload 0
      // 150: getfield nh4.rlc D
      // 153: aload 0
      // 154: getfield nh4.bx_ D
      // 157: aload 0
      // 158: getfield nh4.t8n D
      // 15b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 15e: pop
      // 15f: aload 8
      // 161: aload 0
      // 162: getfield nh4.rlc D
      // 165: aload 0
      // 166: getfield nh4.i2c D
      // 169: aload 0
      // 16a: getfield nh4.oqj D
      // 16d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 170: pop
      // 171: aload 8
      // 173: aload 0
      // 174: getfield nh4.rlc D
      // 177: aload 0
      // 178: getfield nh4.bx_ D
      // 17b: aload 0
      // 17c: getfield nh4.oqj D
      // 17f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 182: pop
      // 183: aload 8
      // 185: aload 0
      // 186: getfield nh4.t_2 D
      // 189: aload 0
      // 18a: getfield nh4.i2c D
      // 18d: aload 0
      // 18e: getfield nh4.oqj D
      // 191: invokevirtual q3g.g5o (DDD)Lq3g;
      // 194: pop
      // 195: aload 8
      // 197: aload 0
      // 198: getfield nh4.t_2 D
      // 19b: aload 0
      // 19c: getfield nh4.bx_ D
      // 19f: aload 0
      // 1a0: getfield nh4.oqj D
      // 1a3: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1a6: pop
      // 1a7: invokestatic jom.yut ()Ljom;
      // 1aa: invokevirtual jom.q7g ()V
      // 1ad: aload 8
      // 1af: bipush 7
      // 1b1: getstatic gnl.gx3 Lbe7;
      // 1b4: invokevirtual q3g.ezr (ILbe7;)V
      // 1b7: aload 8
      // 1b9: aload 0
      // 1ba: getfield nh4.rlc D
      // 1bd: aload 0
      // 1be: getfield nh4.i2c D
      // 1c1: aload 0
      // 1c2: getfield nh4.t8n D
      // 1c5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1c8: pop
      // 1c9: aload 8
      // 1cb: aload 0
      // 1cc: getfield nh4.t_2 D
      // 1cf: aload 0
      // 1d0: getfield nh4.i2c D
      // 1d3: aload 0
      // 1d4: getfield nh4.t8n D
      // 1d7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1da: pop
      // 1db: aload 8
      // 1dd: aload 0
      // 1de: getfield nh4.t_2 D
      // 1e1: aload 0
      // 1e2: getfield nh4.i2c D
      // 1e5: aload 0
      // 1e6: getfield nh4.oqj D
      // 1e9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1ec: pop
      // 1ed: aload 8
      // 1ef: aload 0
      // 1f0: getfield nh4.rlc D
      // 1f3: aload 0
      // 1f4: getfield nh4.i2c D
      // 1f7: aload 0
      // 1f8: getfield nh4.oqj D
      // 1fb: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1fe: pop
      // 1ff: aload 8
      // 201: aload 0
      // 202: getfield nh4.rlc D
      // 205: aload 0
      // 206: getfield nh4.i2c D
      // 209: aload 0
      // 20a: getfield nh4.t8n D
      // 20d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 210: pop
      // 211: aload 8
      // 213: aload 0
      // 214: getfield nh4.rlc D
      // 217: aload 0
      // 218: getfield nh4.i2c D
      // 21b: aload 0
      // 21c: getfield nh4.oqj D
      // 21f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 222: pop
      // 223: aload 8
      // 225: aload 0
      // 226: getfield nh4.t_2 D
      // 229: aload 0
      // 22a: getfield nh4.i2c D
      // 22d: aload 0
      // 22e: getfield nh4.oqj D
      // 231: invokevirtual q3g.g5o (DDD)Lq3g;
      // 234: pop
      // 235: aload 8
      // 237: aload 0
      // 238: getfield nh4.t_2 D
      // 23b: aload 0
      // 23c: getfield nh4.i2c D
      // 23f: aload 0
      // 240: getfield nh4.t8n D
      // 243: invokevirtual q3g.g5o (DDD)Lq3g;
      // 246: pop
      // 247: invokestatic jom.yut ()Ljom;
      // 24a: invokevirtual jom.q7g ()V
      // 24d: aload 8
      // 24f: bipush 7
      // 251: getstatic gnl.gx3 Lbe7;
      // 254: invokevirtual q3g.ezr (ILbe7;)V
      // 257: aload 8
      // 259: aload 0
      // 25a: getfield nh4.rlc D
      // 25d: aload 0
      // 25e: getfield nh4.bx_ D
      // 261: aload 0
      // 262: getfield nh4.t8n D
      // 265: invokevirtual q3g.g5o (DDD)Lq3g;
      // 268: pop
      // 269: aload 8
      // 26b: aload 0
      // 26c: getfield nh4.t_2 D
      // 26f: aload 0
      // 270: getfield nh4.bx_ D
      // 273: aload 0
      // 274: getfield nh4.t8n D
      // 277: invokevirtual q3g.g5o (DDD)Lq3g;
      // 27a: pop
      // 27b: aload 8
      // 27d: aload 0
      // 27e: getfield nh4.t_2 D
      // 281: aload 0
      // 282: getfield nh4.bx_ D
      // 285: aload 0
      // 286: getfield nh4.oqj D
      // 289: invokevirtual q3g.g5o (DDD)Lq3g;
      // 28c: pop
      // 28d: aload 8
      // 28f: aload 0
      // 290: getfield nh4.rlc D
      // 293: aload 0
      // 294: getfield nh4.bx_ D
      // 297: aload 0
      // 298: getfield nh4.oqj D
      // 29b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 29e: pop
      // 29f: aload 8
      // 2a1: aload 0
      // 2a2: getfield nh4.rlc D
      // 2a5: aload 0
      // 2a6: getfield nh4.bx_ D
      // 2a9: aload 0
      // 2aa: getfield nh4.t8n D
      // 2ad: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2b0: pop
      // 2b1: aload 8
      // 2b3: aload 0
      // 2b4: getfield nh4.rlc D
      // 2b7: aload 0
      // 2b8: getfield nh4.bx_ D
      // 2bb: aload 0
      // 2bc: getfield nh4.oqj D
      // 2bf: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2c2: pop
      // 2c3: aload 8
      // 2c5: aload 0
      // 2c6: getfield nh4.t_2 D
      // 2c9: aload 0
      // 2ca: getfield nh4.bx_ D
      // 2cd: aload 0
      // 2ce: getfield nh4.oqj D
      // 2d1: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2d4: pop
      // 2d5: aload 8
      // 2d7: aload 0
      // 2d8: getfield nh4.t_2 D
      // 2db: aload 0
      // 2dc: getfield nh4.bx_ D
      // 2df: aload 0
      // 2e0: getfield nh4.t8n D
      // 2e3: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2e6: pop
      // 2e7: invokestatic jom.yut ()Ljom;
      // 2ea: invokevirtual jom.q7g ()V
      // 2ed: aload 8
      // 2ef: bipush 7
      // 2f1: getstatic gnl.gx3 Lbe7;
      // 2f4: invokevirtual q3g.ezr (ILbe7;)V
      // 2f7: aload 8
      // 2f9: aload 0
      // 2fa: getfield nh4.rlc D
      // 2fd: aload 0
      // 2fe: getfield nh4.bx_ D
      // 301: aload 0
      // 302: getfield nh4.t8n D
      // 305: invokevirtual q3g.g5o (DDD)Lq3g;
      // 308: pop
      // 309: aload 8
      // 30b: aload 0
      // 30c: getfield nh4.rlc D
      // 30f: aload 0
      // 310: getfield nh4.i2c D
      // 313: aload 0
      // 314: getfield nh4.t8n D
      // 317: invokevirtual q3g.g5o (DDD)Lq3g;
      // 31a: pop
      // 31b: aload 8
      // 31d: aload 0
      // 31e: getfield nh4.rlc D
      // 321: aload 0
      // 322: getfield nh4.bx_ D
      // 325: aload 0
      // 326: getfield nh4.oqj D
      // 329: invokevirtual q3g.g5o (DDD)Lq3g;
      // 32c: pop
      // 32d: aload 8
      // 32f: aload 0
      // 330: getfield nh4.rlc D
      // 333: aload 0
      // 334: getfield nh4.i2c D
      // 337: aload 0
      // 338: getfield nh4.oqj D
      // 33b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 33e: pop
      // 33f: aload 8
      // 341: aload 0
      // 342: getfield nh4.t_2 D
      // 345: aload 0
      // 346: getfield nh4.bx_ D
      // 349: aload 0
      // 34a: getfield nh4.oqj D
      // 34d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 350: pop
      // 351: aload 8
      // 353: aload 0
      // 354: getfield nh4.t_2 D
      // 357: aload 0
      // 358: getfield nh4.i2c D
      // 35b: aload 0
      // 35c: getfield nh4.oqj D
      // 35f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 362: pop
      // 363: aload 8
      // 365: aload 0
      // 366: getfield nh4.t_2 D
      // 369: aload 0
      // 36a: getfield nh4.bx_ D
      // 36d: aload 0
      // 36e: getfield nh4.t8n D
      // 371: invokevirtual q3g.g5o (DDD)Lq3g;
      // 374: pop
      // 375: aload 8
      // 377: aload 0
      // 378: getfield nh4.t_2 D
      // 37b: aload 0
      // 37c: getfield nh4.i2c D
      // 37f: aload 0
      // 380: getfield nh4.t8n D
      // 383: invokevirtual q3g.g5o (DDD)Lq3g;
      // 386: pop
      // 387: invokestatic jom.yut ()Ljom;
      // 38a: invokevirtual jom.q7g ()V
      // 38d: aload 8
      // 38f: bipush 7
      // 391: getstatic gnl.gx3 Lbe7;
      // 394: invokevirtual q3g.ezr (ILbe7;)V
      // 397: aload 8
      // 399: aload 0
      // 39a: getfield nh4.rlc D
      // 39d: aload 0
      // 39e: getfield nh4.i2c D
      // 3a1: aload 0
      // 3a2: getfield nh4.oqj D
      // 3a5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3a8: pop
      // 3a9: aload 8
      // 3ab: aload 0
      // 3ac: getfield nh4.rlc D
      // 3af: aload 0
      // 3b0: getfield nh4.bx_ D
      // 3b3: aload 0
      // 3b4: getfield nh4.oqj D
      // 3b7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3ba: pop
      // 3bb: aload 8
      // 3bd: aload 0
      // 3be: getfield nh4.rlc D
      // 3c1: aload 0
      // 3c2: getfield nh4.i2c D
      // 3c5: aload 0
      // 3c6: getfield nh4.t8n D
      // 3c9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3cc: pop
      // 3cd: aload 8
      // 3cf: aload 0
      // 3d0: getfield nh4.rlc D
      // 3d3: aload 0
      // 3d4: getfield nh4.bx_ D
      // 3d7: aload 0
      // 3d8: getfield nh4.t8n D
      // 3db: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3de: pop
      // 3df: aload 8
      // 3e1: aload 0
      // 3e2: getfield nh4.t_2 D
      // 3e5: aload 0
      // 3e6: getfield nh4.i2c D
      // 3e9: aload 0
      // 3ea: getfield nh4.t8n D
      // 3ed: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3f0: pop
      // 3f1: aload 8
      // 3f3: aload 0
      // 3f4: getfield nh4.t_2 D
      // 3f7: aload 0
      // 3f8: getfield nh4.bx_ D
      // 3fb: aload 0
      // 3fc: getfield nh4.t8n D
      // 3ff: invokevirtual q3g.g5o (DDD)Lq3g;
      // 402: pop
      // 403: aload 8
      // 405: aload 0
      // 406: getfield nh4.t_2 D
      // 409: aload 0
      // 40a: getfield nh4.i2c D
      // 40d: aload 0
      // 40e: getfield nh4.oqj D
      // 411: invokevirtual q3g.g5o (DDD)Lq3g;
      // 414: pop
      // 415: aload 8
      // 417: aload 0
      // 418: getfield nh4.t_2 D
      // 41b: aload 0
      // 41c: getfield nh4.bx_ D
      // 41f: aload 0
      // 420: getfield nh4.oqj D
      // 423: invokevirtual q3g.g5o (DDD)Lq3g;
      // 426: pop
      // 427: invokestatic jom.yut ()Ljom;
      // 42a: invokevirtual jom.q7g ()V
      // 42d: bipush 1
      // 42e: invokestatic hzu.jun (Z)V
      // 431: invokestatic hzu.x3w ()V
      // 434: return
   }

   public static void x_v(float var0, float var1, float var2, float var3, int var4, int var5) {
      phr(var0, var1, var2, var3, 1.0F, var4, var5);
   }

   public static void fsr(double var0, double var2, double var4, double var6, int var8, int var9, int var10) {
      ta3(var0, var2, var4, var6, 1.0F, var8, var9, var10);
   }

   public static void yq2(g_3 var0, int var1, double var2, double var4, double var6) {
      GL11.glPushMatrix();
      GL11.glTranslated(var2, var4, var6);
      GL11.glRotatef(-var0.x5k, 0.0F, 1.0F, 0.0F);
      qe5(var1);
      kfe(1.0F);
      Cylinder var8 = new Cylinder();
      GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
      var8.setDrawStyle(100011);
      var8.draw(0.5F, 0.5F, var0.ikl + 0.1F, 18, 1);
      x6v();
      GL11.glPopMatrix();
   }

   public static void huy(int var0, double var1, double var3, double var5) {
      nh4 var7 = new nh4(var1 - 0.4, var3, var5 - 0.4, var1 + 0.4, var3 + 2.0, var5 + 0.4);
      hzu.dp2();
      hzu.hsv(var1, var3, var5);
      hzu.hsv(-var1, -var3, -var5);
      kfe(1.0F);
      qe5(var0);
      o_o(var7);
      x6v();
      hzu.x3w();
   }

   public static void vw6(nh4 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 12c
      // 009: ifnull 13d
      // 00c: goto 013
      // 00f: invokestatic iyr.a (Loov;)Loov;
      // 012: athrow
      // 013: bipush 3
      // 014: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 017: aload 0
      // 018: getfield nh4.rlc D
      // 01b: aload 0
      // 01c: getfield nh4.bx_ D
      // 01f: aload 0
      // 020: getfield nh4.t8n D
      // 023: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 026: aload 0
      // 027: getfield nh4.t_2 D
      // 02a: aload 0
      // 02b: getfield nh4.bx_ D
      // 02e: aload 0
      // 02f: getfield nh4.t8n D
      // 032: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 035: aload 0
      // 036: getfield nh4.t_2 D
      // 039: aload 0
      // 03a: getfield nh4.bx_ D
      // 03d: aload 0
      // 03e: getfield nh4.oqj D
      // 041: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 044: aload 0
      // 045: getfield nh4.rlc D
      // 048: aload 0
      // 049: getfield nh4.bx_ D
      // 04c: aload 0
      // 04d: getfield nh4.oqj D
      // 050: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 053: aload 0
      // 054: getfield nh4.rlc D
      // 057: aload 0
      // 058: getfield nh4.bx_ D
      // 05b: aload 0
      // 05c: getfield nh4.t8n D
      // 05f: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 062: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 065: bipush 3
      // 066: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 069: aload 0
      // 06a: getfield nh4.rlc D
      // 06d: aload 0
      // 06e: getfield nh4.i2c D
      // 071: aload 0
      // 072: getfield nh4.t8n D
      // 075: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 078: aload 0
      // 079: getfield nh4.t_2 D
      // 07c: aload 0
      // 07d: getfield nh4.i2c D
      // 080: aload 0
      // 081: getfield nh4.t8n D
      // 084: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 087: aload 0
      // 088: getfield nh4.t_2 D
      // 08b: aload 0
      // 08c: getfield nh4.i2c D
      // 08f: aload 0
      // 090: getfield nh4.oqj D
      // 093: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 096: aload 0
      // 097: getfield nh4.rlc D
      // 09a: aload 0
      // 09b: getfield nh4.i2c D
      // 09e: aload 0
      // 09f: getfield nh4.oqj D
      // 0a2: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0a5: aload 0
      // 0a6: getfield nh4.rlc D
      // 0a9: aload 0
      // 0aa: getfield nh4.i2c D
      // 0ad: aload 0
      // 0ae: getfield nh4.t8n D
      // 0b1: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0b4: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 0b7: bipush 1
      // 0b8: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 0bb: aload 0
      // 0bc: getfield nh4.rlc D
      // 0bf: aload 0
      // 0c0: getfield nh4.bx_ D
      // 0c3: aload 0
      // 0c4: getfield nh4.t8n D
      // 0c7: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0ca: aload 0
      // 0cb: getfield nh4.rlc D
      // 0ce: aload 0
      // 0cf: getfield nh4.i2c D
      // 0d2: aload 0
      // 0d3: getfield nh4.t8n D
      // 0d6: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0d9: aload 0
      // 0da: getfield nh4.t_2 D
      // 0dd: aload 0
      // 0de: getfield nh4.bx_ D
      // 0e1: aload 0
      // 0e2: getfield nh4.t8n D
      // 0e5: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0e8: aload 0
      // 0e9: getfield nh4.t_2 D
      // 0ec: aload 0
      // 0ed: getfield nh4.i2c D
      // 0f0: aload 0
      // 0f1: getfield nh4.t8n D
      // 0f4: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0f7: aload 0
      // 0f8: getfield nh4.t_2 D
      // 0fb: aload 0
      // 0fc: getfield nh4.bx_ D
      // 0ff: aload 0
      // 100: getfield nh4.oqj D
      // 103: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 106: aload 0
      // 107: getfield nh4.t_2 D
      // 10a: aload 0
      // 10b: getfield nh4.i2c D
      // 10e: aload 0
      // 10f: getfield nh4.oqj D
      // 112: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 115: aload 0
      // 116: getfield nh4.rlc D
      // 119: aload 0
      // 11a: getfield nh4.bx_ D
      // 11d: aload 0
      // 11e: getfield nh4.oqj D
      // 121: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 124: aload 0
      // 125: goto 12c
      // 128: invokestatic iyr.a (Loov;)Loov;
      // 12b: athrow
      // 12c: getfield nh4.rlc D
      // 12f: aload 0
      // 130: getfield nh4.i2c D
      // 133: aload 0
      // 134: getfield nh4.oqj D
      // 137: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 13a: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 13d: return
   }

   public static void ewv(int var0, double var1, double var3, double var5) {
      GL11.glPushMatrix();
      kfe(2.0F);
      qe5(new Color(255, 0, 0).getRGB());
      GL11.glBegin(2);
      GL11.glVertex3d(0.0, (double)c05.vz1().vg8.c5y(), 0.0);
      GL11.glVertex3d(var1, var3, var5);
      GL11.glEnd();
      x6v();
      GL11.glPopMatrix();
   }

   public static void zdp(double var0, double var2, double var4, double var6, float var8, int var9) {
      GL11.glEnable(3042);
      GL11.glDisable(2884);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
      qe5(var9);
      GL11.glLineWidth(var8);
      GL11.glBegin(1);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var4, var6);
      GL11.glEnd();
      GL11.glDisable(3042);
      GL11.glEnable(2884);
      GL11.glEnable(3553);
      GL11.glDisable(2848);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      hzu.nn9(7424);
      hzu.ux6();
      hzu.rqj();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4893772796405020085L, -1876494611238404170L, MethodHandles.lookup().lookupClass()).a(171306904879783L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 87877156566563L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[16];
      int var7 = 0;
      String var6 = "KÉ\u0001¨\u009b\u009b-\u0014@\u007fÜúi*\u0087|\u0010p²YÀ\u0098wÞé·ìê*Y¿\u0089q\u0010g(¿åÆ3\u001fÙ\u0093®\u0091\u009aX`úù\u0010zÏ\u007fwµÒ£]¼q;2ª\u0005f2\u0010`\u008dÆZEx\u0001¯Å\u001b\u0005a\u00adhi'\u0010!d\u0091d\u0015-Ø\u0010Í\u008c'±Að\u0080§\u0010B´ÊÜ°'\u0013<\u008d\u0015=øý@\u009e{\u0010t¹¦W\\¥¬md66¯\u001a\u008e8Í\u0010ùÃ´Û\u0002D¢?\u0097ìÿ\u008esmÓ²\u0010\u001d\u00052NîÒãRñ\\é\u0004¹#\u008b\u0019\u0010ÌÇ\u0081~\u0098\u007fÝMtJ9¨¾\u008c]l(¡\u0011\u0011Ìãæâqv\u009beú\u0012>¹ðá#}\u0012d*Ë $\u0094Ü¥ûv\u008b\u0092©j,6ÐÇ;\u0090\u0010¸\u001e¶ZSã<¡¬O&Ü\u009fV,Ô\u0010ºè\u001aëz<MJU1ªQð\u0003 ¶";
      int var8 = "KÉ\u0001¨\u009b\u009b-\u0014@\u007fÜúi*\u0087|\u0010p²YÀ\u0098wÞé·ìê*Y¿\u0089q\u0010g(¿åÆ3\u001fÙ\u0093®\u0091\u009aX`úù\u0010zÏ\u007fwµÒ£]¼q;2ª\u0005f2\u0010`\u008dÆZEx\u0001¯Å\u001b\u0005a\u00adhi'\u0010!d\u0091d\u0015-Ø\u0010Í\u008c'±Að\u0080§\u0010B´ÊÜ°'\u0013<\u008d\u0015=øý@\u009e{\u0010t¹¦W\\¥¬md66¯\u001a\u008e8Í\u0010ùÃ´Û\u0002D¢?\u0097ìÿ\u008esmÓ²\u0010\u001d\u00052NîÒãRñ\\é\u0004¹#\u008b\u0019\u0010ÌÇ\u0081~\u0098\u007fÝMtJ9¨¾\u008c]l(¡\u0011\u0011Ìãæâqv\u009beú\u0012>¹ðá#}\u0012d*Ë $\u0094Ü¥ûv\u008b\u0092©j,6ÐÇ;\u0090\u0010¸\u001e¶ZSã<¡¬O&Ü\u009fV,Ô\u0010ºè\u001aëz<MJU1ªQð\u0003 ¶"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[16];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "gymHTÎy\u000f]y·\u0006´£)ú\u0010Rÿ\u001eÑ\u0011ä\u0085\u0086~\u001b5\u001d£\u0098\u0000_";
                  var8 = "gymHTÎy\u000f]y·\u0006´£)ú\u0010Rÿ\u001eÑ\u0011ä\u0085\u0086~\u001b5\u001d£\u0098\u0000_".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19118;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("iyr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("iyr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
